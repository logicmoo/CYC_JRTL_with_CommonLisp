package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class red_infrastructure
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.red_infrastructure";
  public static final String myFingerPrint = "dcbdb9a9a80363e5f370c548f4058a526217fd403c6dce85d9899192c59b9bfb";
  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure.lisp", position = 915L)
  public static SubLSymbol $red_variables_dictionary$;
  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure.lisp", position = 1196L)
  public static SubLSymbol $red_symbols_list$;
  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure.lisp", position = 1286L)
  public static SubLSymbol $red_keys_dictionary$;
  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure.lisp", position = 1445L)
  public static SubLSymbol $red_reload_callback_moniker_dictionary$;
  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure.lisp", position = 1629L)
  public static SubLSymbol $repositories_loaded$;
  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure.lisp", position = 1715L)
  public static SubLSymbol $dtp_red_symbol$;
  private static final SubLSymbol $sym0$_RED_VARIABLES_DICTIONARY_;
  private static final SubLSymbol $sym1$_RED_SYMBOLS_LIST_;
  private static final SubLSymbol $sym2$_RED_KEYS_DICTIONARY_;
  private static final SubLSymbol $sym3$_RED_RELOAD_CALLBACK_MONIKER_DICTIONARY_;
  private static final SubLSymbol $sym4$_REPOSITORIES_LOADED_;
  private static final SubLSymbol $sym5$RED_SYMBOL;
  private static final SubLSymbol $sym6$RED_SYMBOL_P;
  private static final SubLList $list7;
  private static final SubLList $list8;
  private static final SubLList $list9;
  private static final SubLList $list10;
  private static final SubLSymbol $sym11$PRINT_RED_SYMBOL;
  private static final SubLSymbol $sym12$RED_SYMBOL_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list13;
  private static final SubLSymbol $sym14$RED_SYMBOL_NAME;
  private static final SubLSymbol $sym15$_CSETF_RED_SYMBOL_NAME;
  private static final SubLSymbol $sym16$RED_SYMBOL_RED_KEY;
  private static final SubLSymbol $sym17$_CSETF_RED_SYMBOL_RED_KEY;
  private static final SubLSymbol $sym18$RED_SYMBOL_DEFAULT_VALUE;
  private static final SubLSymbol $sym19$_CSETF_RED_SYMBOL_DEFAULT_VALUE;
  private static final SubLSymbol $sym20$RED_SYMBOL_LTYPE;
  private static final SubLSymbol $sym21$_CSETF_RED_SYMBOL_LTYPE;
  private static final SubLSymbol $sym22$RED_SYMBOL_SET_FROM_RED;
  private static final SubLSymbol $sym23$_CSETF_RED_SYMBOL_SET_FROM_RED;
  private static final SubLSymbol $sym24$RED_SYMBOL_VALUETYPE;
  private static final SubLSymbol $sym25$_CSETF_RED_SYMBOL_VALUETYPE;
  private static final SubLSymbol $kw26$NAME;
  private static final SubLSymbol $kw27$RED_KEY;
  private static final SubLSymbol $kw28$DEFAULT_VALUE;
  private static final SubLSymbol $kw29$LTYPE;
  private static final SubLSymbol $kw30$SET_FROM_RED;
  private static final SubLSymbol $kw31$VALUETYPE;
  private static final SubLString $str32$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw33$BEGIN;
  private static final SubLSymbol $sym34$MAKE_RED_SYMBOL;
  private static final SubLSymbol $kw35$SLOT;
  private static final SubLSymbol $kw36$END;
  private static final SubLSymbol $sym37$VISIT_DEFSTRUCT_OBJECT_RED_SYMBOL_METHOD;
  private static final SubLSymbol $kw38$SIMPLE;
  private static final SubLString $str39$__red_symbol_name___s__red_key___;
  private static final SubLString $str40$_s____s__;
  private static final SubLSymbol $kw41$PARAMETER;
  private static final SubLSymbol $kw42$LEXICAL;
  private static final SubLSymbol $kw43$GLOBAL;
  private static final SubLSymbol $kw44$VAR;
  private static final SubLSymbol $kw45$LEAST_PRIVILEGED;
  private static final SubLSymbol $kw46$LIST;
  private static final SubLString $str47$_;
  private static final SubLSymbol $sym48$CCONCATENATE;
  private static final SubLString $str49$;
  private static final SubLSymbol $sym50$KEYWORDP;
  private static final SubLSymbol $sym51$STRINGP;
  private static final SubLList $list52;
  private static final SubLSymbol $sym53$PROGN;
  private static final SubLSymbol $sym54$CHECK_TYPE;
  private static final SubLList $list55;
  private static final SubLList $list56;
  private static final SubLSymbol $sym57$CLET;
  private static final SubLSymbol $sym58$MONIKER_FUN_LIST;
  private static final SubLSymbol $sym59$DICTIONARY_LOOKUP;
  private static final SubLSymbol $sym60$PIF;
  private static final SubLSymbol $sym61$CPUSH;
  private static final SubLList $list62;
  private static final SubLSymbol $sym63$CSETQ;
  private static final SubLSymbol $sym64$LIST;
  private static final SubLList $list65;
  private static final SubLSymbol $sym66$FUNCTION_SPEC_P;
  private static final SubLList $list67;
  private static final SubLList $list68;
  private static final SubLString $str69$RED_reload_callback__A_has_an_inv;
  private static final SubLSymbol $sym70$DEFINE;
  private static final SubLSymbol $sym71$CDOLIST;
  private static final SubLSymbol $sym72$MONIKER;
  private static final SubLSymbol $sym73$RED_REPOSITORY_REGISTER_RELOAD_CALLBACK;
  private static final SubLSymbol $sym74$QUOTE;

  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure.lisp", position = 1715L)
  public static SubLObject red_symbol_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_red_symbol( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure.lisp", position = 1715L)
  public static SubLObject red_symbol_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $red_symbol_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure.lisp", position = 1715L)
  public static SubLObject red_symbol_name(final SubLObject v_object)
  {
    assert NIL != red_symbol_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure.lisp", position = 1715L)
  public static SubLObject red_symbol_red_key(final SubLObject v_object)
  {
    assert NIL != red_symbol_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure.lisp", position = 1715L)
  public static SubLObject red_symbol_default_value(final SubLObject v_object)
  {
    assert NIL != red_symbol_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure.lisp", position = 1715L)
  public static SubLObject red_symbol_ltype(final SubLObject v_object)
  {
    assert NIL != red_symbol_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure.lisp", position = 1715L)
  public static SubLObject red_symbol_set_from_red(final SubLObject v_object)
  {
    assert NIL != red_symbol_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure.lisp", position = 1715L)
  public static SubLObject red_symbol_valuetype(final SubLObject v_object)
  {
    assert NIL != red_symbol_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure.lisp", position = 1715L)
  public static SubLObject _csetf_red_symbol_name(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != red_symbol_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure.lisp", position = 1715L)
  public static SubLObject _csetf_red_symbol_red_key(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != red_symbol_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure.lisp", position = 1715L)
  public static SubLObject _csetf_red_symbol_default_value(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != red_symbol_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure.lisp", position = 1715L)
  public static SubLObject _csetf_red_symbol_ltype(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != red_symbol_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure.lisp", position = 1715L)
  public static SubLObject _csetf_red_symbol_set_from_red(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != red_symbol_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure.lisp", position = 1715L)
  public static SubLObject _csetf_red_symbol_valuetype(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != red_symbol_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure.lisp", position = 1715L)
  public static SubLObject make_red_symbol(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $red_symbol_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw26$NAME ) )
      {
        _csetf_red_symbol_name( v_new, current_value );
      }
      else if( pcase_var.eql( $kw27$RED_KEY ) )
      {
        _csetf_red_symbol_red_key( v_new, current_value );
      }
      else if( pcase_var.eql( $kw28$DEFAULT_VALUE ) )
      {
        _csetf_red_symbol_default_value( v_new, current_value );
      }
      else if( pcase_var.eql( $kw29$LTYPE ) )
      {
        _csetf_red_symbol_ltype( v_new, current_value );
      }
      else if( pcase_var.eql( $kw30$SET_FROM_RED ) )
      {
        _csetf_red_symbol_set_from_red( v_new, current_value );
      }
      else if( pcase_var.eql( $kw31$VALUETYPE ) )
      {
        _csetf_red_symbol_valuetype( v_new, current_value );
      }
      else
      {
        Errors.error( $str32$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure.lisp", position = 1715L)
  public static SubLObject visit_defstruct_red_symbol(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw33$BEGIN, $sym34$MAKE_RED_SYMBOL, SIX_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw35$SLOT, $kw26$NAME, red_symbol_name( obj ) );
    Functions.funcall( visitor_fn, obj, $kw35$SLOT, $kw27$RED_KEY, red_symbol_red_key( obj ) );
    Functions.funcall( visitor_fn, obj, $kw35$SLOT, $kw28$DEFAULT_VALUE, red_symbol_default_value( obj ) );
    Functions.funcall( visitor_fn, obj, $kw35$SLOT, $kw29$LTYPE, red_symbol_ltype( obj ) );
    Functions.funcall( visitor_fn, obj, $kw35$SLOT, $kw30$SET_FROM_RED, red_symbol_set_from_red( obj ) );
    Functions.funcall( visitor_fn, obj, $kw35$SLOT, $kw31$VALUETYPE, red_symbol_valuetype( obj ) );
    Functions.funcall( visitor_fn, obj, $kw36$END, $sym34$MAKE_RED_SYMBOL, SIX_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure.lisp", position = 1715L)
  public static SubLObject visit_defstruct_object_red_symbol_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_red_symbol( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure.lisp", position = 2003L)
  public static SubLObject new_red_symbol(final SubLObject red_key, final SubLObject name, final SubLObject defaultval, final SubLObject ltype, SubLObject valuetype)
  {
    if( valuetype == UNPROVIDED )
    {
      valuetype = $kw38$SIMPLE;
    }
    final SubLObject red_sym_obj = make_red_symbol( UNPROVIDED );
    _csetf_red_symbol_name( red_sym_obj, name );
    _csetf_red_symbol_red_key( red_sym_obj, red_key );
    _csetf_red_symbol_default_value( red_sym_obj, defaultval );
    _csetf_red_symbol_ltype( red_sym_obj, ltype );
    _csetf_red_symbol_set_from_red( red_sym_obj, NIL );
    _csetf_red_symbol_valuetype( red_sym_obj, valuetype );
    return red_sym_obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure.lisp", position = 2541L)
  public static SubLObject print_red_symbol(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    PrintLow.format( stream, $str39$__red_symbol_name___s__red_key___, new SubLObject[] { red_symbol_name( v_object ), red_symbol_red_key( v_object ), red_symbol_default_value( v_object ), red_symbol_ltype( v_object ),
      red_symbol_set_from_red( v_object ), red_symbol_valuetype( v_object )
    } );
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure.lisp", position = 2968L)
  public static SubLObject set_red_symbols()
  {
    if( NIL != $repositories_loaded$.getGlobalValue() )
    {
      return NIL;
    }
    $repositories_loaded$.setGlobalValue( T );
    SubLObject cdolist_list_var = red_ordered_var_list();
    SubLObject red_sym = NIL;
    red_sym = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      red_conditional_set( red_sym );
      cdolist_list_var = cdolist_list_var.rest();
      red_sym = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure.lisp", position = 3344L)
  public static SubLObject list_def_red_non_repository_initialized_variables()
  {
    SubLObject unset_ones = NIL;
    SubLObject cdolist_list_var = red_ordered_var_list();
    SubLObject red_sym = NIL;
    red_sym = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == red_symbol_set_from_red( red_sym ) )
      {
        PrintLow.format( T, $str40$_s____s__, red_sym, Symbols.symbol_value( red_symbol_name( red_sym ) ) );
        unset_ones = T;
      }
      cdolist_list_var = cdolist_list_var.rest();
      red_sym = cdolist_list_var.first();
    }
    return unset_ones;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure.lisp", position = 3672L)
  public static SubLObject list_def_red_variables()
  {
    SubLObject count = ZERO_INTEGER;
    SubLObject cdolist_list_var = red_ordered_var_list();
    SubLObject red_sym = NIL;
    red_sym = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      PrintLow.format( T, $str40$_s____s__, red_sym, Symbols.symbol_value( red_symbol_name( red_sym ) ) );
      count = Numbers.add( count, ONE_INTEGER );
      cdolist_list_var = cdolist_list_var.rest();
      red_sym = cdolist_list_var.first();
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure.lisp", position = 3910L)
  public static SubLObject red_utilities_initialization()
  {
    SubLObject cdolist_list_var = $red_symbols_list$.getGlobalValue();
    SubLObject red_sym = NIL;
    red_sym = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject pcase_var = red_symbol_ltype( red_sym );
      if( pcase_var.eql( $kw41$PARAMETER ) || pcase_var.eql( $kw42$LEXICAL ) )
      {
        _csetf_red_symbol_set_from_red( red_sym, NIL );
      }
      cdolist_list_var = cdolist_list_var.rest();
      red_sym = cdolist_list_var.first();
    }
    $repositories_loaded$.setGlobalValue( NIL );
    set_red_symbols();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure.lisp", position = 4243L)
  public static SubLObject register_red(final SubLObject red_sym)
  {
    final SubLObject red_sym_q = dictionary.dictionary_lookup( $red_variables_dictionary$.getGlobalValue(), red_symbol_name( red_sym ), UNPROVIDED );
    if( NIL != red_sym_q )
    {
      _csetf_red_symbol_default_value( red_sym_q, red_symbol_default_value( red_sym ) );
      if( !red_symbol_red_key( red_sym_q ).equal( red_symbol_red_key( red_sym ) ) )
      {
        final SubLObject oldkey = red_symbol_red_key( red_sym_q );
        final SubLObject newkey = red_symbol_red_key( red_sym );
        final SubLObject oldkeydictentry = dictionary.dictionary_lookup( $red_keys_dictionary$.getGlobalValue(), oldkey, UNPROVIDED );
        SubLObject newkeydictentry = dictionary.dictionary_lookup( $red_keys_dictionary$.getGlobalValue(), newkey, UNPROVIDED );
        SubLObject newlist = NIL;
        SubLObject cdolist_list_var = oldkeydictentry;
        SubLObject elt = NIL;
        elt = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( !elt.eql( red_sym_q ) )
          {
            newlist = ConsesLow.cons( elt, newlist );
          }
          cdolist_list_var = cdolist_list_var.rest();
          elt = cdolist_list_var.first();
        }
        if( NIL != newlist )
        {
          dictionary.dictionary_enter( $red_keys_dictionary$.getGlobalValue(), oldkey, newlist );
        }
        else
        {
          dictionary.dictionary_remove( $red_keys_dictionary$.getGlobalValue(), oldkey );
        }
        _csetf_red_symbol_red_key( red_sym_q, newkey );
        if( NIL != newkeydictentry )
        {
          newkeydictentry = ConsesLow.cons( red_sym_q, newkeydictentry );
        }
        else
        {
          newkeydictentry = ConsesLow.list( red_sym_q );
        }
        dictionary.dictionary_enter( $red_keys_dictionary$.getGlobalValue(), newkey, newkeydictentry );
      }
      return NIL;
    }
    $red_symbols_list$.setGlobalValue( ConsesLow.cons( red_sym, $red_symbols_list$.getGlobalValue() ) );
    dictionary.dictionary_enter( $red_variables_dictionary$.getGlobalValue(), red_symbol_name( red_sym ), red_sym );
    final SubLObject newkey2 = red_symbol_red_key( red_sym );
    SubLObject newkeydictentry2 = dictionary.dictionary_lookup( $red_keys_dictionary$.getGlobalValue(), newkey2, UNPROVIDED );
    if( NIL != newkeydictentry2 )
    {
      newkeydictentry2 = ConsesLow.cons( red_sym, newkeydictentry2 );
    }
    else
    {
      newkeydictentry2 = ConsesLow.list( red_sym );
    }
    dictionary.dictionary_enter( $red_keys_dictionary$.getGlobalValue(), newkey2, newkeydictentry2 );
    return red_sym;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure.lisp", position = 6253L)
  public static SubLObject red_conditional_set(final SubLObject red_sym)
  {
    if( NIL != def_red_should_be_set( red_sym ) )
    {
      Symbols.set( red_symbol_name( red_sym ), red_value( red_sym ) );
      return red_symbol_name( red_sym );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure.lisp", position = 6626L)
  public static SubLObject red_ordered_var_list()
  {
    return Sequences.reverse( $red_symbols_list$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure.lisp", position = 6709L)
  public static SubLObject def_red_should_be_set(final SubLObject red_sym)
  {
    final SubLObject pcase_var = red_symbol_ltype( red_sym );
    if( pcase_var.eql( $kw43$GLOBAL ) || pcase_var.eql( $kw44$VAR ) )
    {
      if( NIL != red_symbol_set_from_red( red_sym ) )
      {
        return NIL;
      }
      return T;
    }
    else
    {
      if( pcase_var.eql( $kw41$PARAMETER ) || pcase_var.eql( $kw42$LEXICAL ) )
      {
        return T;
      }
      return NIL;
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure.lisp", position = 6965L)
  public static SubLObject red_value(final SubLObject red_sym)
  {
    return red_symbol_default_value( red_sym );
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure.lisp", position = 7859L)
  public static SubLObject red_make_list(final SubLObject red_elt)
  {
    SubLObject retlist = NIL;
    retlist = ConsesLow.cons( red_get_relative_key( red_api.red_element_get_key( red_elt ) ), retlist );
    retlist = ConsesLow.cons( red_api.red_element_get_value( red_elt ), retlist );
    SubLObject cdolist_list_var;
    final SubLObject subeltlist = cdolist_list_var = red_api.red_element_get_sub_elements( red_elt );
    SubLObject elt = NIL;
    elt = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      retlist = ConsesLow.cons( red_make_list( elt ), retlist );
      cdolist_list_var = cdolist_list_var.rest();
      elt = cdolist_list_var.first();
    }
    return Sequences.nreverse( retlist );
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure.lisp", position = 8218L)
  public static SubLObject red_get_relative_key(final SubLObject key)
  {
    SubLObject index;
    for( index = Sequences.length( key ); index.numGE( ZERO_INTEGER ) && !string_utilities.char_at( key, index ).eql( Characters.CHAR_period ); index = Numbers.subtract( index, ONE_INTEGER ) )
    {
    }
    if( index.isNegative() )
    {
      return key;
    }
    return string_utilities.substring( key, Numbers.add( index, ONE_INTEGER ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure.lisp", position = 8457L)
  public static SubLObject redu_translate_to_key(final SubLObject key_list)
  {
    SubLObject key_parts = NIL;
    SubLObject notfirst = NIL;
    SubLObject cdolist_list_var = key_list;
    SubLObject v_ke = NIL;
    v_ke = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != notfirst )
      {
        key_parts = ConsesLow.cons( $str47$_, key_parts );
      }
      else
      {
        notfirst = T;
      }
      key_parts = ConsesLow.cons( string_utilities.to_string( v_ke ), key_parts );
      cdolist_list_var = cdolist_list_var.rest();
      v_ke = cdolist_list_var.first();
    }
    if( NIL != key_parts )
    {
      return Functions.apply( Symbols.symbol_function( $sym48$CCONCATENATE ), Sequences.nreverse( key_parts ) );
    }
    return $str49$;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure.lisp", position = 8781L)
  public static SubLObject red_reload_repository(final SubLObject moniker, final SubLObject filename)
  {
    assert NIL != Types.keywordp( moniker ) : moniker;
    assert NIL != Types.stringp( filename ) : filename;
    red_api.red_reload_repository_simple( filename );
    final SubLObject rr = red_api.red_lookup_repository_struct_by_filename( filename );
    if( NIL == rr )
    {
      return NIL;
    }
    final SubLObject updated_symbol_triples = red_api.red_get_all_elements_of_repository( rr );
    red_update_def_red_from_repository( updated_symbol_triples );
    red_execute_callbacks( moniker, updated_symbol_triples );
    return rr;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure.lisp", position = 9565L)
  public static SubLObject red_update_def_red_from_repository(final SubLObject updated_symbol_triples)
  {
    SubLObject cdolist_list_var = updated_symbol_triples;
    SubLObject elt = NIL;
    elt = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject key = elt.first();
      final SubLObject value = conses_high.second( elt );
      final SubLObject type = conses_high.third( elt );
      final SubLObject reddictelt = dictionary.dictionary_lookup( $red_keys_dictionary$.getGlobalValue(), key, UNPROVIDED );
      if( NIL != reddictelt )
      {
        SubLObject cdolist_list_var_$1 = reddictelt;
        SubLObject redelt = NIL;
        redelt = cdolist_list_var_$1.first();
        while ( NIL != cdolist_list_var_$1)
        {
          _csetf_red_symbol_default_value( redelt, value );
          _csetf_red_symbol_ltype( redelt, type );
          _csetf_red_symbol_set_from_red( redelt, T );
          Symbols.set( red_symbol_name( redelt ), value );
          cdolist_list_var_$1 = cdolist_list_var_$1.rest();
          redelt = cdolist_list_var_$1.first();
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      elt = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure.lisp", position = 10356L)
  public static SubLObject red_execute_callbacks(final SubLObject moniker, final SubLObject updated_symbol_triples)
  {
    final SubLObject moniker_fun_list = dictionary.dictionary_lookup( $red_reload_callback_moniker_dictionary$.getGlobalValue(), moniker, UNPROVIDED );
    if( NIL == moniker_fun_list )
    {
      return NIL;
    }
    SubLObject cdolist_list_var = moniker_fun_list;
    SubLObject funcspec = NIL;
    funcspec = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      Functions.funcall( funcspec, moniker, updated_symbol_triples );
      cdolist_list_var = cdolist_list_var.rest();
      funcspec = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure.lisp", position = 10816L)
  public static SubLObject red_repository_register_reload_callback(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject moniker = NIL;
    SubLObject funcspec = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list52 );
    moniker = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list52 );
    funcspec = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym53$PROGN, ConsesLow.listS( $sym54$CHECK_TYPE, moniker, $list55 ), ConsesLow.listS( $sym54$CHECK_TYPE, funcspec, $list56 ), ConsesLow.listS( $sym57$CLET, ConsesLow.list( ConsesLow.list(
          $sym58$MONIKER_FUN_LIST, ConsesLow.list( $sym59$DICTIONARY_LOOKUP, $sym3$_RED_RELOAD_CALLBACK_MONIKER_DICTIONARY_, moniker ) ) ), ConsesLow.list( $sym60$PIF, $sym58$MONIKER_FUN_LIST, ConsesLow.listS(
              $sym61$CPUSH, funcspec, $list62 ), ConsesLow.list( $sym63$CSETQ, $sym58$MONIKER_FUN_LIST, ConsesLow.list( $sym64$LIST, funcspec ) ) ), $list65 ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list52 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure.lisp", position = 11443L)
  public static SubLObject red_repository_unregister_reload_callback(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject moniker = NIL;
    SubLObject funcspec = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list52 );
    moniker = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list52 );
    funcspec = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list52 );
      return NIL;
    }
    assert NIL != Types.keywordp( moniker ) : moniker;
    assert NIL != Types.function_spec_p( funcspec ) : funcspec;
    final SubLObject moniker_fun_list = dictionary.dictionary_lookup( $red_reload_callback_moniker_dictionary$.getGlobalValue(), moniker, UNPROVIDED );
    SubLObject newlist = NIL;
    if( NIL == moniker_fun_list )
    {
      return $list67;
    }
    SubLObject cdolist_list_var = moniker_fun_list;
    SubLObject spec = NIL;
    spec = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( !spec.equal( funcspec ) )
      {
        newlist = ConsesLow.cons( spec, newlist );
      }
      cdolist_list_var = cdolist_list_var.rest();
      spec = cdolist_list_var.first();
    }
    if( NIL == newlist )
    {
      dictionary.dictionary_remove( $red_reload_callback_moniker_dictionary$.getGlobalValue(), moniker );
      return $list67;
    }
    dictionary.dictionary_enter( $red_reload_callback_moniker_dictionary$.getGlobalValue(), moniker, Sequences.nreverse( newlist ) );
    return $list67;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure.lisp", position = 12190L)
  public static SubLObject red_reload_callback_define(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name = NIL;
    SubLObject arglist = NIL;
    SubLObject monikers = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list68 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list68 );
    arglist = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list68 );
    monikers = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    final SubLObject max_args = list_utilities.function_arglist_max_args( arglist );
    if( !max_args.numE( TWO_INTEGER ) )
    {
      Errors.warn( $str69$RED_reload_callback__A_has_an_inv, name, arglist );
    }
    return ConsesLow.list( $sym53$PROGN, ConsesLow.listS( $sym70$DEFINE, name, arglist, ConsesLow.append( body, NIL ) ), ConsesLow.list( $sym71$CDOLIST, ConsesLow.list( $sym72$MONIKER, monikers ), ConsesLow.list(
        $sym73$RED_REPOSITORY_REGISTER_RELOAD_CALLBACK, $sym72$MONIKER, ConsesLow.list( $sym74$QUOTE, name ) ) ) );
  }

  public static SubLObject declare_red_infrastructure_file()
  {
    SubLFiles.declareFunction( me, "red_symbol_print_function_trampoline", "RED-SYMBOL-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "red_symbol_p", "RED-SYMBOL-P", 1, 0, false );
    new $red_symbol_p$UnaryFunction();
    SubLFiles.declareFunction( me, "red_symbol_name", "RED-SYMBOL-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "red_symbol_red_key", "RED-SYMBOL-RED-KEY", 1, 0, false );
    SubLFiles.declareFunction( me, "red_symbol_default_value", "RED-SYMBOL-DEFAULT-VALUE", 1, 0, false );
    SubLFiles.declareFunction( me, "red_symbol_ltype", "RED-SYMBOL-LTYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "red_symbol_set_from_red", "RED-SYMBOL-SET-FROM-RED", 1, 0, false );
    SubLFiles.declareFunction( me, "red_symbol_valuetype", "RED-SYMBOL-VALUETYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_red_symbol_name", "_CSETF-RED-SYMBOL-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_red_symbol_red_key", "_CSETF-RED-SYMBOL-RED-KEY", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_red_symbol_default_value", "_CSETF-RED-SYMBOL-DEFAULT-VALUE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_red_symbol_ltype", "_CSETF-RED-SYMBOL-LTYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_red_symbol_set_from_red", "_CSETF-RED-SYMBOL-SET-FROM-RED", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_red_symbol_valuetype", "_CSETF-RED-SYMBOL-VALUETYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "make_red_symbol", "MAKE-RED-SYMBOL", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_red_symbol", "VISIT-DEFSTRUCT-RED-SYMBOL", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_red_symbol_method", "VISIT-DEFSTRUCT-OBJECT-RED-SYMBOL-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "new_red_symbol", "NEW-RED-SYMBOL", 4, 1, false );
    SubLFiles.declareFunction( me, "print_red_symbol", "PRINT-RED-SYMBOL", 3, 0, false );
    SubLFiles.declareFunction( me, "set_red_symbols", "SET-RED-SYMBOLS", 0, 0, false );
    SubLFiles.declareFunction( me, "list_def_red_non_repository_initialized_variables", "LIST-DEF-RED-NON-REPOSITORY-INITIALIZED-VARIABLES", 0, 0, false );
    SubLFiles.declareFunction( me, "list_def_red_variables", "LIST-DEF-RED-VARIABLES", 0, 0, false );
    SubLFiles.declareFunction( me, "red_utilities_initialization", "RED-UTILITIES-INITIALIZATION", 0, 0, false );
    SubLFiles.declareFunction( me, "register_red", "REGISTER-RED", 1, 0, false );
    SubLFiles.declareFunction( me, "red_conditional_set", "RED-CONDITIONAL-SET", 1, 0, false );
    SubLFiles.declareFunction( me, "red_ordered_var_list", "RED-ORDERED-VAR-LIST", 0, 0, false );
    SubLFiles.declareFunction( me, "def_red_should_be_set", "DEF-RED-SHOULD-BE-SET", 1, 0, false );
    SubLFiles.declareFunction( me, "red_value", "RED-VALUE", 1, 0, false );
    SubLFiles.declareFunction( me, "red_make_list", "RED-MAKE-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "red_get_relative_key", "RED-GET-RELATIVE-KEY", 1, 0, false );
    SubLFiles.declareFunction( me, "redu_translate_to_key", "REDU-TRANSLATE-TO-KEY", 1, 0, false );
    SubLFiles.declareFunction( me, "red_reload_repository", "RED-RELOAD-REPOSITORY", 2, 0, false );
    SubLFiles.declareFunction( me, "red_update_def_red_from_repository", "RED-UPDATE-DEF-RED-FROM-REPOSITORY", 1, 0, false );
    SubLFiles.declareFunction( me, "red_execute_callbacks", "RED-EXECUTE-CALLBACKS", 2, 0, false );
    SubLFiles.declareMacro( me, "red_repository_register_reload_callback", "RED-REPOSITORY-REGISTER-RELOAD-CALLBACK" );
    SubLFiles.declareMacro( me, "red_repository_unregister_reload_callback", "RED-REPOSITORY-UNREGISTER-RELOAD-CALLBACK" );
    SubLFiles.declareMacro( me, "red_reload_callback_define", "RED-RELOAD-CALLBACK-DEFINE" );
    return NIL;
  }

  public static SubLObject init_red_infrastructure_file()
  {
    $red_variables_dictionary$ = SubLFiles.deflexical( "*RED-VARIABLES-DICTIONARY*", maybeDefault( $sym0$_RED_VARIABLES_DICTIONARY_, $red_variables_dictionary$, () -> ( dictionary.new_dictionary( UNPROVIDED,
        UNPROVIDED ) ) ) );
    $red_symbols_list$ = SubLFiles.deflexical( "*RED-SYMBOLS-LIST*", ( maybeDefault( $sym1$_RED_SYMBOLS_LIST_, $red_symbols_list$, NIL ) ) );
    $red_keys_dictionary$ = SubLFiles.deflexical( "*RED-KEYS-DICTIONARY*", maybeDefault( $sym2$_RED_KEYS_DICTIONARY_, $red_keys_dictionary$, () -> ( dictionary.new_dictionary( UNPROVIDED, UNPROVIDED ) ) ) );
    $red_reload_callback_moniker_dictionary$ = SubLFiles.deflexical( "*RED-RELOAD-CALLBACK-MONIKER-DICTIONARY*", maybeDefault( $sym3$_RED_RELOAD_CALLBACK_MONIKER_DICTIONARY_, $red_reload_callback_moniker_dictionary$,
        () -> ( dictionary.new_dictionary( UNPROVIDED, UNPROVIDED ) ) ) );
    $repositories_loaded$ = SubLFiles.deflexical( "*REPOSITORIES-LOADED*", ( maybeDefault( $sym4$_REPOSITORIES_LOADED_, $repositories_loaded$, NIL ) ) );
    $dtp_red_symbol$ = SubLFiles.defconstant( "*DTP-RED-SYMBOL*", $sym5$RED_SYMBOL );
    return NIL;
  }

  public static SubLObject setup_red_infrastructure_file()
  {
    subl_macro_promotions.declare_defglobal( $sym0$_RED_VARIABLES_DICTIONARY_ );
    subl_macro_promotions.declare_defglobal( $sym1$_RED_SYMBOLS_LIST_ );
    subl_macro_promotions.declare_defglobal( $sym2$_RED_KEYS_DICTIONARY_ );
    subl_macro_promotions.declare_defglobal( $sym3$_RED_RELOAD_CALLBACK_MONIKER_DICTIONARY_ );
    subl_macro_promotions.declare_defglobal( $sym4$_REPOSITORIES_LOADED_ );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_red_symbol$.getGlobalValue(), Symbols.symbol_function( $sym12$RED_SYMBOL_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list13 );
    Structures.def_csetf( $sym14$RED_SYMBOL_NAME, $sym15$_CSETF_RED_SYMBOL_NAME );
    Structures.def_csetf( $sym16$RED_SYMBOL_RED_KEY, $sym17$_CSETF_RED_SYMBOL_RED_KEY );
    Structures.def_csetf( $sym18$RED_SYMBOL_DEFAULT_VALUE, $sym19$_CSETF_RED_SYMBOL_DEFAULT_VALUE );
    Structures.def_csetf( $sym20$RED_SYMBOL_LTYPE, $sym21$_CSETF_RED_SYMBOL_LTYPE );
    Structures.def_csetf( $sym22$RED_SYMBOL_SET_FROM_RED, $sym23$_CSETF_RED_SYMBOL_SET_FROM_RED );
    Structures.def_csetf( $sym24$RED_SYMBOL_VALUETYPE, $sym25$_CSETF_RED_SYMBOL_VALUETYPE );
    Equality.identity( $sym5$RED_SYMBOL );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_red_symbol$.getGlobalValue(), Symbols.symbol_function( $sym37$VISIT_DEFSTRUCT_OBJECT_RED_SYMBOL_METHOD ) );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_red_infrastructure_file();
  }

  @Override
  public void initializeVariables()
  {
    init_red_infrastructure_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_red_infrastructure_file();
  }
  static
  {
    me = new red_infrastructure();
    $red_variables_dictionary$ = null;
    $red_symbols_list$ = null;
    $red_keys_dictionary$ = null;
    $red_reload_callback_moniker_dictionary$ = null;
    $repositories_loaded$ = null;
    $dtp_red_symbol$ = null;
    $sym0$_RED_VARIABLES_DICTIONARY_ = makeSymbol( "*RED-VARIABLES-DICTIONARY*" );
    $sym1$_RED_SYMBOLS_LIST_ = makeSymbol( "*RED-SYMBOLS-LIST*" );
    $sym2$_RED_KEYS_DICTIONARY_ = makeSymbol( "*RED-KEYS-DICTIONARY*" );
    $sym3$_RED_RELOAD_CALLBACK_MONIKER_DICTIONARY_ = makeSymbol( "*RED-RELOAD-CALLBACK-MONIKER-DICTIONARY*" );
    $sym4$_REPOSITORIES_LOADED_ = makeSymbol( "*REPOSITORIES-LOADED*" );
    $sym5$RED_SYMBOL = makeSymbol( "RED-SYMBOL" );
    $sym6$RED_SYMBOL_P = makeSymbol( "RED-SYMBOL-P" );
    $list7 = ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "RED-KEY" ), makeSymbol( "DEFAULT-VALUE" ), makeSymbol( "LTYPE" ), makeSymbol( "SET-FROM-RED" ), makeSymbol( "VALUETYPE" ) );
    $list8 = ConsesLow.list( makeKeyword( "NAME" ), makeKeyword( "RED-KEY" ), makeKeyword( "DEFAULT-VALUE" ), makeKeyword( "LTYPE" ), makeKeyword( "SET-FROM-RED" ), makeKeyword( "VALUETYPE" ) );
    $list9 = ConsesLow.list( makeSymbol( "RED-SYMBOL-NAME" ), makeSymbol( "RED-SYMBOL-RED-KEY" ), makeSymbol( "RED-SYMBOL-DEFAULT-VALUE" ), makeSymbol( "RED-SYMBOL-LTYPE" ), makeSymbol( "RED-SYMBOL-SET-FROM-RED" ),
        makeSymbol( "RED-SYMBOL-VALUETYPE" ) );
    $list10 = ConsesLow.list( makeSymbol( "_CSETF-RED-SYMBOL-NAME" ), makeSymbol( "_CSETF-RED-SYMBOL-RED-KEY" ), makeSymbol( "_CSETF-RED-SYMBOL-DEFAULT-VALUE" ), makeSymbol( "_CSETF-RED-SYMBOL-LTYPE" ), makeSymbol(
        "_CSETF-RED-SYMBOL-SET-FROM-RED" ), makeSymbol( "_CSETF-RED-SYMBOL-VALUETYPE" ) );
    $sym11$PRINT_RED_SYMBOL = makeSymbol( "PRINT-RED-SYMBOL" );
    $sym12$RED_SYMBOL_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "RED-SYMBOL-PRINT-FUNCTION-TRAMPOLINE" );
    $list13 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "RED-SYMBOL-P" ) );
    $sym14$RED_SYMBOL_NAME = makeSymbol( "RED-SYMBOL-NAME" );
    $sym15$_CSETF_RED_SYMBOL_NAME = makeSymbol( "_CSETF-RED-SYMBOL-NAME" );
    $sym16$RED_SYMBOL_RED_KEY = makeSymbol( "RED-SYMBOL-RED-KEY" );
    $sym17$_CSETF_RED_SYMBOL_RED_KEY = makeSymbol( "_CSETF-RED-SYMBOL-RED-KEY" );
    $sym18$RED_SYMBOL_DEFAULT_VALUE = makeSymbol( "RED-SYMBOL-DEFAULT-VALUE" );
    $sym19$_CSETF_RED_SYMBOL_DEFAULT_VALUE = makeSymbol( "_CSETF-RED-SYMBOL-DEFAULT-VALUE" );
    $sym20$RED_SYMBOL_LTYPE = makeSymbol( "RED-SYMBOL-LTYPE" );
    $sym21$_CSETF_RED_SYMBOL_LTYPE = makeSymbol( "_CSETF-RED-SYMBOL-LTYPE" );
    $sym22$RED_SYMBOL_SET_FROM_RED = makeSymbol( "RED-SYMBOL-SET-FROM-RED" );
    $sym23$_CSETF_RED_SYMBOL_SET_FROM_RED = makeSymbol( "_CSETF-RED-SYMBOL-SET-FROM-RED" );
    $sym24$RED_SYMBOL_VALUETYPE = makeSymbol( "RED-SYMBOL-VALUETYPE" );
    $sym25$_CSETF_RED_SYMBOL_VALUETYPE = makeSymbol( "_CSETF-RED-SYMBOL-VALUETYPE" );
    $kw26$NAME = makeKeyword( "NAME" );
    $kw27$RED_KEY = makeKeyword( "RED-KEY" );
    $kw28$DEFAULT_VALUE = makeKeyword( "DEFAULT-VALUE" );
    $kw29$LTYPE = makeKeyword( "LTYPE" );
    $kw30$SET_FROM_RED = makeKeyword( "SET-FROM-RED" );
    $kw31$VALUETYPE = makeKeyword( "VALUETYPE" );
    $str32$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw33$BEGIN = makeKeyword( "BEGIN" );
    $sym34$MAKE_RED_SYMBOL = makeSymbol( "MAKE-RED-SYMBOL" );
    $kw35$SLOT = makeKeyword( "SLOT" );
    $kw36$END = makeKeyword( "END" );
    $sym37$VISIT_DEFSTRUCT_OBJECT_RED_SYMBOL_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-RED-SYMBOL-METHOD" );
    $kw38$SIMPLE = makeKeyword( "SIMPLE" );
    $str39$__red_symbol_name___s__red_key___ = makeString( "#<red-symbol name: ~s  red-key = ~s  default value = ~s ltype = ~s set-from-red = ~s value-type = ~s>" );
    $str40$_s____s__ = makeString( "~s = ~s~%" );
    $kw41$PARAMETER = makeKeyword( "PARAMETER" );
    $kw42$LEXICAL = makeKeyword( "LEXICAL" );
    $kw43$GLOBAL = makeKeyword( "GLOBAL" );
    $kw44$VAR = makeKeyword( "VAR" );
    $kw45$LEAST_PRIVILEGED = makeKeyword( "LEAST-PRIVILEGED" );
    $kw46$LIST = makeKeyword( "LIST" );
    $str47$_ = makeString( "." );
    $sym48$CCONCATENATE = makeSymbol( "CCONCATENATE" );
    $str49$ = makeString( "" );
    $sym50$KEYWORDP = makeSymbol( "KEYWORDP" );
    $sym51$STRINGP = makeSymbol( "STRINGP" );
    $list52 = ConsesLow.list( makeSymbol( "MONIKER" ), makeSymbol( "FUNCSPEC" ) );
    $sym53$PROGN = makeSymbol( "PROGN" );
    $sym54$CHECK_TYPE = makeSymbol( "CHECK-TYPE" );
    $list55 = ConsesLow.list( makeSymbol( "KEYWORDP" ) );
    $list56 = ConsesLow.list( makeSymbol( "FUNCTION-SPEC-P" ) );
    $sym57$CLET = makeSymbol( "CLET" );
    $sym58$MONIKER_FUN_LIST = makeSymbol( "MONIKER-FUN-LIST" );
    $sym59$DICTIONARY_LOOKUP = makeSymbol( "DICTIONARY-LOOKUP" );
    $sym60$PIF = makeSymbol( "PIF" );
    $sym61$CPUSH = makeSymbol( "CPUSH" );
    $list62 = ConsesLow.list( makeSymbol( "MONIKER-FUN-LIST" ) );
    $sym63$CSETQ = makeSymbol( "CSETQ" );
    $sym64$LIST = makeSymbol( "LIST" );
    $list65 = ConsesLow.list( ConsesLow.list( makeSymbol( "DICTIONARY-ENTER" ), makeSymbol( "*RED-RELOAD-CALLBACK-MONIKER-DICTIONARY*" ), makeSymbol( "MONIKER" ), makeSymbol( "MONIKER-FUN-LIST" ) ) );
    $sym66$FUNCTION_SPEC_P = makeSymbol( "FUNCTION-SPEC-P" );
    $list67 = ConsesLow.list( makeSymbol( "PROGN" ) );
    $list68 = ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "ARGLIST" ), makeSymbol( "MONIKERS" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $str69$RED_reload_callback__A_has_an_inv = makeString( "RED reload callback ~A has an invalid arglist of:~%  ~S~%Use DEFINE instead." );
    $sym70$DEFINE = makeSymbol( "DEFINE" );
    $sym71$CDOLIST = makeSymbol( "CDOLIST" );
    $sym72$MONIKER = makeSymbol( "MONIKER" );
    $sym73$RED_REPOSITORY_REGISTER_RELOAD_CALLBACK = makeSymbol( "RED-REPOSITORY-REGISTER-RELOAD-CALLBACK" );
    $sym74$QUOTE = makeSymbol( "QUOTE" );
  }

  public static final class $red_symbol_native
      extends
        SubLStructNative
  {
    public SubLObject $name;
    public SubLObject $red_key;
    public SubLObject $default_value;
    public SubLObject $ltype;
    public SubLObject $set_from_red;
    public SubLObject $valuetype;
    private static final SubLStructDeclNative structDecl;

    public $red_symbol_native()
    {
      this.$name = CommonSymbols.NIL;
      this.$red_key = CommonSymbols.NIL;
      this.$default_value = CommonSymbols.NIL;
      this.$ltype = CommonSymbols.NIL;
      this.$set_from_red = CommonSymbols.NIL;
      this.$valuetype = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $red_symbol_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$name;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$red_key;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$default_value;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$ltype;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$set_from_red;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$valuetype;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$name = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$red_key = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$default_value = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$ltype = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$set_from_red = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$valuetype = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $red_symbol_native.class, $sym5$RED_SYMBOL, $sym6$RED_SYMBOL_P, $list7, $list8, new String[] { "$name", "$red_key", "$default_value", "$ltype", "$set_from_red",
        "$valuetype"
      }, $list9, $list10, $sym11$PRINT_RED_SYMBOL );
    }
  }

  public static final class $red_symbol_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $red_symbol_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "RED-SYMBOL-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return red_symbol_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 211 ms
 * 
 */