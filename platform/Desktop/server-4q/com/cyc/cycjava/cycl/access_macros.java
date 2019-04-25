package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class access_macros
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.access_macros";
  public static final String myFingerPrint = "a98d211a863b331c3aec51778ccd65ce209743b0928b0082a20f04d05815608d";
  @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 13572L)
  private static SubLSymbol $external_symbols$;
  @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 17409L)
  private static SubLSymbol $external_access_methods$;
  private static final SubLList $list0;
  private static final SubLSymbol $sym1$PROGN;
  private static final SubLSymbol $sym2$PROCLAIM;
  private static final SubLSymbol $sym3$QUOTE;
  private static final SubLSymbol $sym4$FACCESS;
  private static final SubLSymbol $sym5$PUBLIC;
  private static final SubLSymbol $sym6$DEFINE;
  private static final SubLSymbol $sym7$PROTECTED;
  private static final SubLSymbol $sym8$PRIVATE;
  private static final SubLList $list9;
  private static final SubLList $list10;
  private static final SubLSymbol $kw11$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw12$MACRO;
  private static final SubLString $str13$Macro_or_list_of_macros_must_be_s;
  private static final SubLSymbol $sym14$REGISTER_MACRO_HELPER;
  private static final SubLSymbol $sym15$DEFINE_PROTECTED;
  private static final SubLList $list16;
  private static final SubLSymbol $sym17$DEFMACRO;
  private static final SubLList $list18;
  private static final SubLSymbol $sym19$DEFMACRO_PROTECTED;
  private static final SubLList $list20;
  private static final SubLSymbol $sym21$VACCESS;
  private static final SubLSymbol $sym22$DEFCONSTANT;
  private static final SubLList $list23;
  private static final SubLSymbol $sym24$DEFLEXICAL;
  private static final SubLSymbol $sym25$DEFPARAMETER;
  private static final SubLList $list26;
  private static final SubLSymbol $sym27$DEFPARAMETER_PROTECTED;
  private static final SubLSymbol $sym28$DEFPARAMETER_MACRO_HELPER;
  private static final SubLList $list29;
  private static final SubLSymbol $sym30$DEFGLOBAL;
  private static final SubLSymbol $sym31$DEFVAR;
  private static final SubLSymbol $sym32$DEFVAR_PROTECTED;
  private static final SubLList $list33;
  private static final SubLList $list34;
  private static final SubLSymbol $kw35$REPLACEMENTS;
  private static final SubLString $str36$Method_or_list_of_methods_must_be;
  private static final SubLSymbol $sym37$DEFINE_OBSOLETE_REGISTER;
  private static final SubLList $list38;
  private static final SubLSymbol $sym39$DEFMACRO_OBSOLETE_WARNING;
  private static final SubLString $str40$Macro__S_is_obsolete;
  private static final SubLString $str41$____use_;
  private static final SubLString $str42$_S_;
  private static final SubLString $str43$instead_;
  private static final SubLString $str44$_A;
  private static final SubLSymbol $sym45$_EXTERNAL_SYMBOLS_;
  private static final SubLInteger $int46$400;
  private static final SubLSymbol $sym47$STRING_LESSP;
  private static final SubLSymbol $sym48$SYMBOL_NAME;
  private static final SubLSymbol $sym49$REGISTER_EXTERNAL_SYMBOL;
  private static final SubLSymbol $sym50$DEFINE_PUBLIC;
  private static final SubLSymbol $sym51$DEFMACRO_PUBLIC;
  private static final SubLSymbol $sym52$DEFCONSTANT_PUBLIC;
  private static final SubLSymbol $sym53$DEFLEXICAL_PUBLIC;
  private static final SubLSymbol $sym54$DEFPARAMETER_PUBLIC;
  private static final SubLSymbol $sym55$DEFGLOBAL_PUBLIC;
  private static final SubLSymbol $sym56$DEFVAR_PUBLIC;
  private static final SubLList $list57;
  private static final SubLSymbol $kw58$MACRO_HELPER_FOR;

  @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 851L)
  public static SubLObject define_public(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name = NIL;
    SubLObject arglist = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    arglist = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym1$PROGN, ConsesLow.list( $sym2$PROCLAIM, ConsesLow.list( $sym3$QUOTE, ConsesLow.list( $sym4$FACCESS, $sym5$PUBLIC, name ) ) ), ConsesLow.listS( $sym6$DEFINE, name, arglist, ConsesLow
        .append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 1210L)
  public static SubLObject define_protected(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name = NIL;
    SubLObject arglist = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    arglist = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym1$PROGN, ConsesLow.list( $sym2$PROCLAIM, ConsesLow.list( $sym3$QUOTE, ConsesLow.list( $sym4$FACCESS, $sym7$PROTECTED, name ) ) ), ConsesLow.listS( $sym6$DEFINE, name, arglist, ConsesLow
        .append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 1533L)
  public static SubLObject define_private(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name = NIL;
    SubLObject arglist = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    arglist = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym1$PROGN, ConsesLow.list( $sym2$PROCLAIM, ConsesLow.list( $sym3$QUOTE, ConsesLow.list( $sym4$FACCESS, $sym8$PRIVATE, name ) ) ), ConsesLow.listS( $sym6$DEFINE, name, arglist, ConsesLow
        .append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 1796L)
  public static SubLObject define_macro_helper(final SubLObject macroform, final SubLObject environment)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name = NIL;
    SubLObject arglist = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list9 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list9 );
    arglist = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list9 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list9 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list9 );
      if( NIL == conses_high.member( current_$1, $list10, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw11$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list9 );
    }
    final SubLObject macro_tail = cdestructuring_bind.property_list_member( $kw12$MACRO, current );
    final SubLObject macro = ( NIL != macro_tail ) ? conses_high.cadr( macro_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == symbol_or_symbol_list_p( macro ) )
    {
      Errors.error( $str13$Macro_or_list_of_macros_must_be_s, macro );
    }
    return ConsesLow.list( $sym1$PROGN, ConsesLow.list( $sym14$REGISTER_MACRO_HELPER, ConsesLow.list( $sym3$QUOTE, name ), ConsesLow.list( $sym3$QUOTE, macro ) ), ConsesLow.listS( $sym15$DEFINE_PROTECTED, name, arglist,
        ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 2376L)
  public static SubLObject symbol_or_symbol_list_p(final SubLObject v_object)
  {
    if( v_object.isSymbol() )
    {
      return T;
    }
    if( v_object.isAtom() )
    {
      return NIL;
    }
    SubLObject cdolist_list_var = v_object;
    SubLObject item = NIL;
    item = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( !item.isSymbol() )
      {
        return NIL;
      }
      cdolist_list_var = cdolist_list_var.rest();
      item = cdolist_list_var.first();
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 2588L)
  public static SubLObject defmacro_public(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name = NIL;
    SubLObject pattern = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list16 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list16 );
    pattern = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym1$PROGN, ConsesLow.list( $sym2$PROCLAIM, ConsesLow.list( $sym3$QUOTE, ConsesLow.list( $sym4$FACCESS, $sym5$PUBLIC, name ) ) ), ConsesLow.listS( $sym17$DEFMACRO, name, pattern, ConsesLow
        .append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 2949L)
  public static SubLObject defmacro_protected(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name = NIL;
    SubLObject pattern = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list16 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list16 );
    pattern = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym1$PROGN, ConsesLow.list( $sym2$PROCLAIM, ConsesLow.list( $sym3$QUOTE, ConsesLow.list( $sym4$FACCESS, $sym7$PROTECTED, name ) ) ), ConsesLow.listS( $sym17$DEFMACRO, name, pattern, ConsesLow
        .append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 3268L)
  public static SubLObject defmacro_private(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name = NIL;
    SubLObject pattern = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list16 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list16 );
    pattern = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym1$PROGN, ConsesLow.list( $sym2$PROCLAIM, ConsesLow.list( $sym3$QUOTE, ConsesLow.list( $sym4$FACCESS, $sym8$PRIVATE, name ) ) ), ConsesLow.listS( $sym17$DEFMACRO, name, pattern, ConsesLow
        .append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 3525L)
  public static SubLObject defmacro_macro_helper(final SubLObject macroform, final SubLObject environment)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name = NIL;
    SubLObject pattern = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list18 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list18 );
    pattern = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list18 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$2 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list18 );
      current_$2 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list18 );
      if( NIL == conses_high.member( current_$2, $list10, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$2 == $kw11$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list18 );
    }
    final SubLObject macro_tail = cdestructuring_bind.property_list_member( $kw12$MACRO, current );
    final SubLObject macro = ( NIL != macro_tail ) ? conses_high.cadr( macro_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == symbol_or_symbol_list_p( macro ) )
    {
      Errors.error( $str13$Macro_or_list_of_macros_must_be_s, macro );
    }
    return ConsesLow.list( $sym1$PROGN, ConsesLow.list( $sym14$REGISTER_MACRO_HELPER, ConsesLow.list( $sym3$QUOTE, name ), ConsesLow.list( $sym3$QUOTE, macro ) ), ConsesLow.listS( $sym19$DEFMACRO_PROTECTED, name,
        pattern, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 4046L)
  public static SubLObject defconstant_public(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject variable = NIL;
    SubLObject initialization = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list20 );
    variable = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list20 );
    initialization = current.first();
    current = current.rest();
    final SubLObject documentation = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list20 );
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym1$PROGN, ConsesLow.list( $sym2$PROCLAIM, ConsesLow.list( $sym3$QUOTE, ConsesLow.list( $sym21$VACCESS, $sym5$PUBLIC, variable ) ) ), ConsesLow.list( $sym22$DEFCONSTANT, variable,
          initialization, documentation ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list20 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 4499L)
  public static SubLObject defconstant_protected(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject variable = NIL;
    SubLObject initialization = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list20 );
    variable = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list20 );
    initialization = current.first();
    current = current.rest();
    final SubLObject documentation = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list20 );
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym1$PROGN, ConsesLow.list( $sym2$PROCLAIM, ConsesLow.list( $sym3$QUOTE, ConsesLow.list( $sym21$VACCESS, $sym7$PROTECTED, variable ) ) ), ConsesLow.list( $sym22$DEFCONSTANT, variable,
          initialization, documentation ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list20 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 4905L)
  public static SubLObject defconstant_private(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject variable = NIL;
    SubLObject initialization = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list20 );
    variable = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list20 );
    initialization = current.first();
    current = current.rest();
    final SubLObject documentation = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list20 );
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym1$PROGN, ConsesLow.list( $sym2$PROCLAIM, ConsesLow.list( $sym3$QUOTE, ConsesLow.list( $sym21$VACCESS, $sym8$PRIVATE, variable ) ) ), ConsesLow.list( $sym22$DEFCONSTANT, variable,
          initialization, documentation ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list20 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 5229L)
  public static SubLObject deflexical_public(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject variable = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list23 );
    variable = current.first();
    current = current.rest();
    final SubLObject initialization = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list23 );
    current = current.rest();
    final SubLObject documentation = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list23 );
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym1$PROGN, ConsesLow.list( $sym2$PROCLAIM, ConsesLow.list( $sym3$QUOTE, ConsesLow.list( $sym21$VACCESS, $sym5$PUBLIC, variable ) ) ), ConsesLow.list( $sym24$DEFLEXICAL, variable,
          initialization, documentation ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list23 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 5676L)
  public static SubLObject deflexical_protected(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject variable = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list23 );
    variable = current.first();
    current = current.rest();
    final SubLObject initialization = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list23 );
    current = current.rest();
    final SubLObject documentation = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list23 );
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym1$PROGN, ConsesLow.list( $sym2$PROCLAIM, ConsesLow.list( $sym3$QUOTE, ConsesLow.list( $sym21$VACCESS, $sym7$PROTECTED, variable ) ) ), ConsesLow.list( $sym24$DEFLEXICAL, variable,
          initialization, documentation ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list23 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 6079L)
  public static SubLObject deflexical_private(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject variable = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list23 );
    variable = current.first();
    current = current.rest();
    final SubLObject initialization = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list23 );
    current = current.rest();
    final SubLObject documentation = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list23 );
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym1$PROGN, ConsesLow.list( $sym2$PROCLAIM, ConsesLow.list( $sym3$QUOTE, ConsesLow.list( $sym21$VACCESS, $sym8$PRIVATE, variable ) ) ), ConsesLow.list( $sym24$DEFLEXICAL, variable,
          initialization, documentation ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list23 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 6400L)
  public static SubLObject defparameter_public(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject variable = NIL;
    SubLObject initialization = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list20 );
    variable = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list20 );
    initialization = current.first();
    current = current.rest();
    final SubLObject documentation = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list20 );
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym1$PROGN, ConsesLow.list( $sym2$PROCLAIM, ConsesLow.list( $sym3$QUOTE, ConsesLow.list( $sym21$VACCESS, $sym5$PUBLIC, variable ) ) ), ConsesLow.list( $sym25$DEFPARAMETER, variable,
          initialization, documentation ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list20 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 6859L)
  public static SubLObject defparameter_protected(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject variable = NIL;
    SubLObject initialization = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list20 );
    variable = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list20 );
    initialization = current.first();
    current = current.rest();
    final SubLObject documentation = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list20 );
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym1$PROGN, ConsesLow.list( $sym2$PROCLAIM, ConsesLow.list( $sym3$QUOTE, ConsesLow.list( $sym21$VACCESS, $sym7$PROTECTED, variable ) ) ), ConsesLow.list( $sym25$DEFPARAMETER, variable,
          initialization, documentation ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list20 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 7268L)
  public static SubLObject defparameter_private(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject variable = NIL;
    SubLObject initialization = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list20 );
    variable = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list20 );
    initialization = current.first();
    current = current.rest();
    final SubLObject documentation = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list20 );
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym1$PROGN, ConsesLow.list( $sym2$PROCLAIM, ConsesLow.list( $sym3$QUOTE, ConsesLow.list( $sym21$VACCESS, $sym8$PRIVATE, variable ) ) ), ConsesLow.list( $sym25$DEFPARAMETER, variable,
          initialization, documentation ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list20 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 7595L)
  public static SubLObject defparameter_macro_helper(final SubLObject macroform, final SubLObject environment)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject variable = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list26 );
    variable = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list26 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$3 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list26 );
      current_$3 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list26 );
      if( NIL == conses_high.member( current_$3, $list10, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$3 == $kw11$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list26 );
    }
    final SubLObject macro_tail = cdestructuring_bind.property_list_member( $kw12$MACRO, current );
    final SubLObject macro = ( NIL != macro_tail ) ? conses_high.cadr( macro_tail ) : NIL;
    current = temp;
    final SubLObject initialization = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list26 );
    current = current.rest();
    final SubLObject documentation = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list26 );
    current = current.rest();
    if( NIL == current )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == symbol_or_symbol_list_p( macro ) )
      {
        Errors.error( $str13$Macro_or_list_of_macros_must_be_s, macro );
      }
      return ConsesLow.list( $sym27$DEFPARAMETER_PROTECTED, variable, initialization, documentation );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list26 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 8256L)
  public static SubLObject defglobal_public(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject variable = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list23 );
    variable = current.first();
    current = current.rest();
    final SubLObject initialization = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list23 );
    current = current.rest();
    final SubLObject documentation = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list23 );
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym1$PROGN, ConsesLow.list( $sym2$PROCLAIM, ConsesLow.list( $sym3$QUOTE, ConsesLow.list( $sym21$VACCESS, $sym5$PUBLIC, variable ) ) ), ConsesLow.list( $sym30$DEFGLOBAL, variable,
          initialization, documentation ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list23 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 8697L)
  public static SubLObject defglobal_protected(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject variable = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list23 );
    variable = current.first();
    current = current.rest();
    final SubLObject initialization = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list23 );
    current = current.rest();
    final SubLObject documentation = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list23 );
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym1$PROGN, ConsesLow.list( $sym2$PROCLAIM, ConsesLow.list( $sym3$QUOTE, ConsesLow.list( $sym21$VACCESS, $sym7$PROTECTED, variable ) ) ), ConsesLow.list( $sym30$DEFGLOBAL, variable,
          initialization, documentation ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list23 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 9097L)
  public static SubLObject defglobal_private(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject variable = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list23 );
    variable = current.first();
    current = current.rest();
    final SubLObject initialization = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list23 );
    current = current.rest();
    final SubLObject documentation = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list23 );
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym1$PROGN, ConsesLow.list( $sym2$PROCLAIM, ConsesLow.list( $sym3$QUOTE, ConsesLow.list( $sym21$VACCESS, $sym8$PRIVATE, variable ) ) ), ConsesLow.list( $sym30$DEFGLOBAL, variable,
          initialization, documentation ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list23 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 9415L)
  public static SubLObject defvar_public(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject variable = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list23 );
    variable = current.first();
    current = current.rest();
    final SubLObject initialization = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list23 );
    current = current.rest();
    final SubLObject documentation = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list23 );
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym1$PROGN, ConsesLow.list( $sym2$PROCLAIM, ConsesLow.list( $sym3$QUOTE, ConsesLow.list( $sym21$VACCESS, $sym5$PUBLIC, variable ) ) ), ConsesLow.list( $sym31$DEFVAR, variable,
          initialization, documentation ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list23 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 9838L)
  public static SubLObject defvar_protected(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject variable = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list23 );
    variable = current.first();
    current = current.rest();
    final SubLObject initialization = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list23 );
    current = current.rest();
    final SubLObject documentation = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list23 );
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym1$PROGN, ConsesLow.list( $sym2$PROCLAIM, ConsesLow.list( $sym3$QUOTE, ConsesLow.list( $sym21$VACCESS, $sym7$PROTECTED, variable ) ) ), ConsesLow.list( $sym31$DEFVAR, variable,
          initialization, documentation ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list23 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 10229L)
  public static SubLObject defvar_private(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject variable = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list23 );
    variable = current.first();
    current = current.rest();
    final SubLObject initialization = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list23 );
    current = current.rest();
    final SubLObject documentation = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list23 );
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym1$PROGN, ConsesLow.list( $sym2$PROCLAIM, ConsesLow.list( $sym3$QUOTE, ConsesLow.list( $sym21$VACCESS, $sym8$PRIVATE, variable ) ) ), ConsesLow.list( $sym31$DEFVAR, variable,
          initialization, documentation ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list23 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 10538L)
  public static SubLObject defvar_macro_helper(final SubLObject macroform, final SubLObject environment)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject variable = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list26 );
    variable = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list26 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$4 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list26 );
      current_$4 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list26 );
      if( NIL == conses_high.member( current_$4, $list10, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$4 == $kw11$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list26 );
    }
    final SubLObject macro_tail = cdestructuring_bind.property_list_member( $kw12$MACRO, current );
    final SubLObject macro = ( NIL != macro_tail ) ? conses_high.cadr( macro_tail ) : NIL;
    current = temp;
    final SubLObject initialization = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list26 );
    current = current.rest();
    final SubLObject documentation = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list26 );
    current = current.rest();
    if( NIL == current )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == symbol_or_symbol_list_p( macro ) )
      {
        Errors.error( $str13$Macro_or_list_of_macros_must_be_s, macro );
      }
      return ConsesLow.list( $sym32$DEFVAR_PROTECTED, variable, initialization, documentation );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list26 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 11100L)
  public static SubLObject define_obsolete(final SubLObject macroform, final SubLObject environment)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name = NIL;
    SubLObject arglist = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list33 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list33 );
    arglist = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list33 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$5 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list33 );
      current_$5 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list33 );
      if( NIL == conses_high.member( current_$5, $list34, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$5 == $kw11$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list33 );
    }
    final SubLObject replacements_tail = cdestructuring_bind.property_list_member( $kw35$REPLACEMENTS, current );
    SubLObject replacements = ( NIL != replacements_tail ) ? conses_high.cadr( replacements_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == symbol_or_symbol_list_p( replacements ) )
    {
      Errors.error( $str36$Method_or_list_of_methods_must_be, replacements );
    }
    if( !replacements.isList() )
    {
      replacements = ConsesLow.list( replacements );
    }
    return ConsesLow.list( $sym1$PROGN, ConsesLow.list( $sym37$DEFINE_OBSOLETE_REGISTER, ConsesLow.list( $sym3$QUOTE, name ), ConsesLow.list( $sym3$QUOTE, ConsesLow.append( replacements, NIL ) ) ), ConsesLow.listS(
        $sym15$DEFINE_PROTECTED, name, arglist, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 11830L)
  public static SubLObject define_obsolete_register(final SubLObject v_obsolete, final SubLObject replacements)
  {
    return v_obsolete;
  }

  @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 12192L)
  public static SubLObject defmacro_obsolete(final SubLObject macroform, final SubLObject environment)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name = NIL;
    SubLObject pattern = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list38 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list38 );
    pattern = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list38 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$6 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list38 );
      current_$6 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list38 );
      if( NIL == conses_high.member( current_$6, $list34, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$6 == $kw11$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list38 );
    }
    final SubLObject replacements_tail = cdestructuring_bind.property_list_member( $kw35$REPLACEMENTS, current );
    SubLObject replacements = ( NIL != replacements_tail ) ? conses_high.cadr( replacements_tail ) : NIL;
    SubLObject body;
    current = ( body = temp );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == symbol_or_symbol_list_p( replacements ) )
    {
      Errors.error( $str36$Method_or_list_of_methods_must_be, replacements );
    }
    if( !replacements.isList() )
    {
      replacements = ConsesLow.list( replacements );
    }
    SubLObject documentation = NIL;
    if( body.first().isString() )
    {
      documentation = body.first();
      body = body.rest();
    }
    return ConsesLow.listS( $sym19$DEFMACRO_PROTECTED, name, pattern, ConsesLow.append( ( NIL != documentation ) ? ConsesLow.list( documentation ) : NIL, ( NIL != replacements ) ? ConsesLow.list( ConsesLow.list(
        $sym39$DEFMACRO_OBSOLETE_WARNING, ConsesLow.list( $sym3$QUOTE, name ), ConsesLow.list( $sym3$QUOTE, ConsesLow.append( replacements, NIL ) ) ) ) : NIL, body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 13089L)
  public static SubLObject defmacro_obsolete_warning(final SubLObject v_obsolete, final SubLObject replacements)
  {
    SubLObject string = NIL;
    SubLObject stream = NIL;
    try
    {
      stream = streams_high.make_private_string_output_stream();
      PrintLow.format( stream, $str40$Macro__S_is_obsolete, v_obsolete );
      if( NIL != replacements )
      {
        print_high.princ( $str41$____use_, stream );
        SubLObject cdolist_list_var = replacements;
        SubLObject replacement = NIL;
        replacement = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          PrintLow.format( stream, $str42$_S_, replacement );
          cdolist_list_var = cdolist_list_var.rest();
          replacement = cdolist_list_var.first();
        }
        print_high.princ( $str43$instead_, stream );
      }
      string = streams_high.get_output_stream_string( stream );
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
    return Errors.warn( $str44$_A, string );
  }

  @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 13838L)
  public static SubLObject register_external_symbol(final SubLObject symbol)
  {
    Hashtables.sethash( symbol, $external_symbols$.getGlobalValue(), T );
    return symbol;
  }

  @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 13955L)
  public static SubLObject external_symbol_p(final SubLObject v_object)
  {
    return Hashtables.gethash_without_values( v_object, $external_symbols$.getGlobalValue(), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 14061L)
  public static SubLObject external_function_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isFunctionSpec() && !v_object.isMacroOperator() && NIL != external_symbol_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 14222L)
  public static SubLObject external_macro_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isMacroOperator() && NIL != external_symbol_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 14348L)
  public static SubLObject all_external_symbols()
  {
    SubLObject external_symbols = NIL;
    SubLObject symbol = NIL;
    SubLObject value = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( $external_symbols$.getGlobalValue() );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        symbol = Hashtables.getEntryKey( cdohash_entry );
        value = Hashtables.getEntryValue( cdohash_entry );
        external_symbols = ConsesLow.cons( symbol, external_symbols );
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    external_symbols = Sort.sort( external_symbols, Symbols.symbol_function( $sym47$STRING_LESSP ), Symbols.symbol_function( $sym48$SYMBOL_NAME ) );
    return external_symbols;
  }

  @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 14641L)
  public static SubLObject define_external(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name = NIL;
    SubLObject arglist = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    arglist = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym1$PROGN, ConsesLow.list( $sym49$REGISTER_EXTERNAL_SYMBOL, ConsesLow.list( $sym3$QUOTE, name ) ), ConsesLow.listS( $sym50$DEFINE_PUBLIC, name, arglist, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 14995L)
  public static SubLObject defmacro_external(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name = NIL;
    SubLObject arglist = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    arglist = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym1$PROGN, ConsesLow.list( $sym49$REGISTER_EXTERNAL_SYMBOL, ConsesLow.list( $sym3$QUOTE, name ) ), ConsesLow.listS( $sym51$DEFMACRO_PUBLIC, name, arglist, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 15350L)
  public static SubLObject defconstant_external(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject variable = NIL;
    SubLObject initialization = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list20 );
    variable = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list20 );
    initialization = current.first();
    current = current.rest();
    final SubLObject documentation = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list20 );
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym1$PROGN, ConsesLow.list( $sym49$REGISTER_EXTERNAL_SYMBOL, ConsesLow.list( $sym3$QUOTE, variable ) ), ConsesLow.list( $sym52$DEFCONSTANT_PUBLIC, variable, initialization,
          documentation ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list20 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 15766L)
  public static SubLObject deflexical_external(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject variable = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list23 );
    variable = current.first();
    current = current.rest();
    final SubLObject initialization = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list23 );
    current = current.rest();
    final SubLObject documentation = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list23 );
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym1$PROGN, ConsesLow.list( $sym49$REGISTER_EXTERNAL_SYMBOL, ConsesLow.list( $sym3$QUOTE, variable ) ), ConsesLow.list( $sym53$DEFLEXICAL_PUBLIC, variable, initialization, documentation ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list23 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 16179L)
  public static SubLObject defparameter_external(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject variable = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list23 );
    variable = current.first();
    current = current.rest();
    final SubLObject initialization = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list23 );
    current = current.rest();
    final SubLObject documentation = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list23 );
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym1$PROGN, ConsesLow.list( $sym49$REGISTER_EXTERNAL_SYMBOL, ConsesLow.list( $sym3$QUOTE, variable ) ), ConsesLow.list( $sym54$DEFPARAMETER_PUBLIC, variable, initialization,
          documentation ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list23 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 16598L)
  public static SubLObject defglobal_external(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject variable = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list23 );
    variable = current.first();
    current = current.rest();
    final SubLObject initialization = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list23 );
    current = current.rest();
    final SubLObject documentation = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list23 );
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym1$PROGN, ConsesLow.list( $sym49$REGISTER_EXTERNAL_SYMBOL, ConsesLow.list( $sym3$QUOTE, variable ) ), ConsesLow.list( $sym55$DEFGLOBAL_PUBLIC, variable, initialization, documentation ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list23 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 17008L)
  public static SubLObject defvar_external(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject variable = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list23 );
    variable = current.first();
    current = current.rest();
    final SubLObject initialization = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list23 );
    current = current.rest();
    final SubLObject documentation = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list23 );
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym1$PROGN, ConsesLow.list( $sym49$REGISTER_EXTERNAL_SYMBOL, ConsesLow.list( $sym3$QUOTE, variable ) ), ConsesLow.list( $sym56$DEFVAR_PUBLIC, variable, initialization, documentation ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list23 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 18069L)
  public static SubLObject register_macro_helper(final SubLObject helper, final SubLObject macro)
  {
    SubLObject macros = Symbols.get( helper, $kw58$MACRO_HELPER_FOR, UNPROVIDED );
    if( macro.isCons() )
    {
      SubLObject cdolist_list_var = macro;
      SubLObject one_macro = NIL;
      one_macro = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject item_var = one_macro;
        if( NIL == conses_high.member( item_var, macros, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          macros = ConsesLow.cons( item_var, macros );
        }
        cdolist_list_var = cdolist_list_var.rest();
        one_macro = cdolist_list_var.first();
      }
    }
    else if( NIL == conses_high.member( macro, macros, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      macros = ConsesLow.cons( macro, macros );
    }
    Symbols.put( helper, $kw58$MACRO_HELPER_FOR, macros );
    return helper;
  }

  @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 18437L)
  public static SubLObject macro_helper_for_macroP(final SubLObject helper, final SubLObject macro)
  {
    return conses_high.member( macro, Symbols.get( helper, $kw58$MACRO_HELPER_FOR, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 18550L)
  public static SubLObject macro_helper_for_any_of_macrosP(final SubLObject helper, final SubLObject macros)
  {
    SubLObject helperP = NIL;
    if( NIL == helperP )
    {
      SubLObject csome_list_var = macros;
      SubLObject macro = NIL;
      macro = csome_list_var.first();
      while ( NIL == helperP && NIL != csome_list_var)
      {
        if( NIL != macro_helper_for_macroP( helper, macro ) )
        {
          helperP = macro;
        }
        csome_list_var = csome_list_var.rest();
        macro = csome_list_var.first();
      }
    }
    return helperP;
  }

  public static SubLObject declare_access_macros_file()
  {
    SubLFiles.declareMacro( me, "define_public", "DEFINE-PUBLIC" );
    SubLFiles.declareMacro( me, "define_protected", "DEFINE-PROTECTED" );
    SubLFiles.declareMacro( me, "define_private", "DEFINE-PRIVATE" );
    SubLFiles.declareMacro( me, "define_macro_helper", "DEFINE-MACRO-HELPER" );
    SubLFiles.declareFunction( me, "symbol_or_symbol_list_p", "SYMBOL-OR-SYMBOL-LIST-P", 1, 0, false );
    SubLFiles.declareMacro( me, "defmacro_public", "DEFMACRO-PUBLIC" );
    SubLFiles.declareMacro( me, "defmacro_protected", "DEFMACRO-PROTECTED" );
    SubLFiles.declareMacro( me, "defmacro_private", "DEFMACRO-PRIVATE" );
    SubLFiles.declareMacro( me, "defmacro_macro_helper", "DEFMACRO-MACRO-HELPER" );
    SubLFiles.declareMacro( me, "defconstant_public", "DEFCONSTANT-PUBLIC" );
    SubLFiles.declareMacro( me, "defconstant_protected", "DEFCONSTANT-PROTECTED" );
    SubLFiles.declareMacro( me, "defconstant_private", "DEFCONSTANT-PRIVATE" );
    SubLFiles.declareMacro( me, "deflexical_public", "DEFLEXICAL-PUBLIC" );
    SubLFiles.declareMacro( me, "deflexical_protected", "DEFLEXICAL-PROTECTED" );
    SubLFiles.declareMacro( me, "deflexical_private", "DEFLEXICAL-PRIVATE" );
    SubLFiles.declareMacro( me, "defparameter_public", "DEFPARAMETER-PUBLIC" );
    SubLFiles.declareMacro( me, "defparameter_protected", "DEFPARAMETER-PROTECTED" );
    SubLFiles.declareMacro( me, "defparameter_private", "DEFPARAMETER-PRIVATE" );
    SubLFiles.declareMacro( me, "defparameter_macro_helper", "DEFPARAMETER-MACRO-HELPER" );
    SubLFiles.declareMacro( me, "defglobal_public", "DEFGLOBAL-PUBLIC" );
    SubLFiles.declareMacro( me, "defglobal_protected", "DEFGLOBAL-PROTECTED" );
    SubLFiles.declareMacro( me, "defglobal_private", "DEFGLOBAL-PRIVATE" );
    SubLFiles.declareMacro( me, "defvar_public", "DEFVAR-PUBLIC" );
    SubLFiles.declareMacro( me, "defvar_protected", "DEFVAR-PROTECTED" );
    SubLFiles.declareMacro( me, "defvar_private", "DEFVAR-PRIVATE" );
    SubLFiles.declareMacro( me, "defvar_macro_helper", "DEFVAR-MACRO-HELPER" );
    SubLFiles.declareMacro( me, "define_obsolete", "DEFINE-OBSOLETE" );
    SubLFiles.declareFunction( me, "define_obsolete_register", "DEFINE-OBSOLETE-REGISTER", 2, 0, false );
    SubLFiles.declareMacro( me, "defmacro_obsolete", "DEFMACRO-OBSOLETE" );
    SubLFiles.declareFunction( me, "defmacro_obsolete_warning", "DEFMACRO-OBSOLETE-WARNING", 2, 0, false );
    SubLFiles.declareFunction( me, "register_external_symbol", "REGISTER-EXTERNAL-SYMBOL", 1, 0, false );
    SubLFiles.declareFunction( me, "external_symbol_p", "EXTERNAL-SYMBOL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "external_function_p", "EXTERNAL-FUNCTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "external_macro_p", "EXTERNAL-MACRO-P", 1, 0, false );
    SubLFiles.declareFunction( me, "all_external_symbols", "ALL-EXTERNAL-SYMBOLS", 0, 0, false );
    SubLFiles.declareMacro( me, "define_external", "DEFINE-EXTERNAL" );
    SubLFiles.declareMacro( me, "defmacro_external", "DEFMACRO-EXTERNAL" );
    SubLFiles.declareMacro( me, "defconstant_external", "DEFCONSTANT-EXTERNAL" );
    SubLFiles.declareMacro( me, "deflexical_external", "DEFLEXICAL-EXTERNAL" );
    SubLFiles.declareMacro( me, "defparameter_external", "DEFPARAMETER-EXTERNAL" );
    SubLFiles.declareMacro( me, "defglobal_external", "DEFGLOBAL-EXTERNAL" );
    SubLFiles.declareMacro( me, "defvar_external", "DEFVAR-EXTERNAL" );
    SubLFiles.declareFunction( me, "register_macro_helper", "REGISTER-MACRO-HELPER", 2, 0, false );
    SubLFiles.declareFunction( me, "macro_helper_for_macroP", "MACRO-HELPER-FOR-MACRO?", 2, 0, false );
    SubLFiles.declareFunction( me, "macro_helper_for_any_of_macrosP", "MACRO-HELPER-FOR-ANY-OF-MACROS?", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_access_macros_file()
  {
    $external_symbols$ = SubLFiles.deflexical( "*EXTERNAL-SYMBOLS*", maybeDefault( $sym45$_EXTERNAL_SYMBOLS_, $external_symbols$, () -> ( Hashtables.make_hash_table( $int46$400, Symbols.symbol_function( EQ ),
        UNPROVIDED ) ) ) );
    $external_access_methods$ = SubLFiles.deflexical( "*EXTERNAL-ACCESS-METHODS*", $list57 );
    return NIL;
  }

  public static SubLObject setup_access_macros_file()
  {
    meta_macros.declare_indention_pattern( $sym28$DEFPARAMETER_MACRO_HELPER, $list29 );
    SubLObject cdolist_list_var = $external_access_methods$.getGlobalValue();
    SubLObject symbol = NIL;
    symbol = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      register_external_symbol( symbol );
      cdolist_list_var = cdolist_list_var.rest();
      symbol = cdolist_list_var.first();
    }
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_access_macros_file();
  }

  @Override
  public void initializeVariables()
  {
    init_access_macros_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_access_macros_file();
  }
  static
  {
    me = new access_macros();
    $external_symbols$ = null;
    $external_access_methods$ = null;
    $list0 = ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "ARGLIST" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym1$PROGN = makeSymbol( "PROGN" );
    $sym2$PROCLAIM = makeSymbol( "PROCLAIM" );
    $sym3$QUOTE = makeSymbol( "QUOTE" );
    $sym4$FACCESS = makeSymbol( "FACCESS" );
    $sym5$PUBLIC = makeSymbol( "PUBLIC" );
    $sym6$DEFINE = makeSymbol( "DEFINE" );
    $sym7$PROTECTED = makeSymbol( "PROTECTED" );
    $sym8$PRIVATE = makeSymbol( "PRIVATE" );
    $list9 = ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "ARGLIST" ), ConsesLow.list( makeSymbol( "&KEY" ), makeSymbol( "MACRO" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list10 = ConsesLow.list( makeKeyword( "MACRO" ) );
    $kw11$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw12$MACRO = makeKeyword( "MACRO" );
    $str13$Macro_or_list_of_macros_must_be_s = makeString( "Macro or list of macros must be specified, not ~a" );
    $sym14$REGISTER_MACRO_HELPER = makeSymbol( "REGISTER-MACRO-HELPER" );
    $sym15$DEFINE_PROTECTED = makeSymbol( "DEFINE-PROTECTED" );
    $list16 = ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "PATTERN" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym17$DEFMACRO = makeSymbol( "DEFMACRO" );
    $list18 = ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "PATTERN" ), ConsesLow.list( makeSymbol( "&KEY" ), makeSymbol( "MACRO" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym19$DEFMACRO_PROTECTED = makeSymbol( "DEFMACRO-PROTECTED" );
    $list20 = ConsesLow.list( makeSymbol( "VARIABLE" ), makeSymbol( "INITIALIZATION" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "DOCUMENTATION" ) );
    $sym21$VACCESS = makeSymbol( "VACCESS" );
    $sym22$DEFCONSTANT = makeSymbol( "DEFCONSTANT" );
    $list23 = ConsesLow.list( makeSymbol( "VARIABLE" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "INITIALIZATION" ), makeSymbol( "DOCUMENTATION" ) );
    $sym24$DEFLEXICAL = makeSymbol( "DEFLEXICAL" );
    $sym25$DEFPARAMETER = makeSymbol( "DEFPARAMETER" );
    $list26 = ConsesLow.list( makeSymbol( "VARIABLE" ), ConsesLow.list( makeSymbol( "&KEY" ), makeSymbol( "MACRO" ) ), makeSymbol( "&OPTIONAL" ), makeSymbol( "INITIALIZATION" ), makeSymbol( "DOCUMENTATION" ) );
    $sym27$DEFPARAMETER_PROTECTED = makeSymbol( "DEFPARAMETER-PROTECTED" );
    $sym28$DEFPARAMETER_MACRO_HELPER = makeSymbol( "DEFPARAMETER-MACRO-HELPER" );
    $list29 = ConsesLow.list( makeSymbol( "VARIABLE" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym30$DEFGLOBAL = makeSymbol( "DEFGLOBAL" );
    $sym31$DEFVAR = makeSymbol( "DEFVAR" );
    $sym32$DEFVAR_PROTECTED = makeSymbol( "DEFVAR-PROTECTED" );
    $list33 = ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "ARGLIST" ), ConsesLow.list( makeSymbol( "&KEY" ), makeSymbol( "REPLACEMENTS" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list34 = ConsesLow.list( makeKeyword( "REPLACEMENTS" ) );
    $kw35$REPLACEMENTS = makeKeyword( "REPLACEMENTS" );
    $str36$Method_or_list_of_methods_must_be = makeString( "Method or list of methods must be specified, not ~a" );
    $sym37$DEFINE_OBSOLETE_REGISTER = makeSymbol( "DEFINE-OBSOLETE-REGISTER" );
    $list38 = ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "PATTERN" ), ConsesLow.list( makeSymbol( "&KEY" ), makeSymbol( "REPLACEMENTS" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym39$DEFMACRO_OBSOLETE_WARNING = makeSymbol( "DEFMACRO-OBSOLETE-WARNING" );
    $str40$Macro__S_is_obsolete = makeString( "Macro ~S is obsolete" );
    $str41$____use_ = makeString( " -- use " );
    $str42$_S_ = makeString( "~S " );
    $str43$instead_ = makeString( "instead." );
    $str44$_A = makeString( "~A" );
    $sym45$_EXTERNAL_SYMBOLS_ = makeSymbol( "*EXTERNAL-SYMBOLS*" );
    $int46$400 = makeInteger( 400 );
    $sym47$STRING_LESSP = makeSymbol( "STRING-LESSP" );
    $sym48$SYMBOL_NAME = makeSymbol( "SYMBOL-NAME" );
    $sym49$REGISTER_EXTERNAL_SYMBOL = makeSymbol( "REGISTER-EXTERNAL-SYMBOL" );
    $sym50$DEFINE_PUBLIC = makeSymbol( "DEFINE-PUBLIC" );
    $sym51$DEFMACRO_PUBLIC = makeSymbol( "DEFMACRO-PUBLIC" );
    $sym52$DEFCONSTANT_PUBLIC = makeSymbol( "DEFCONSTANT-PUBLIC" );
    $sym53$DEFLEXICAL_PUBLIC = makeSymbol( "DEFLEXICAL-PUBLIC" );
    $sym54$DEFPARAMETER_PUBLIC = makeSymbol( "DEFPARAMETER-PUBLIC" );
    $sym55$DEFGLOBAL_PUBLIC = makeSymbol( "DEFGLOBAL-PUBLIC" );
    $sym56$DEFVAR_PUBLIC = makeSymbol( "DEFVAR-PUBLIC" );
    $list57 = ConsesLow.list( new SubLObject[] { makeSymbol( "DEFINE-PRIVATE" ), makeSymbol( "DEFINE-PROTECTED" ), makeSymbol( "DEFINE-PUBLIC" ), makeSymbol( "DEFINE-MACRO-HELPER" ), makeSymbol( "DEFMACRO-PRIVATE" ),
      makeSymbol( "DEFMACRO-PROTECTED" ), makeSymbol( "DEFMACRO-PUBLIC" ), makeSymbol( "DEFMACRO-MACRO-HELPER" ), makeSymbol( "DEFCONSTANT-PRIVATE" ), makeSymbol( "DEFCONSTANT-PROTECTED" ), makeSymbol(
          "DEFCONSTANT-PUBLIC" ), makeSymbol( "DEFLEXICAL-PRIVATE" ), makeSymbol( "DEFLEXICAL-PROTECTED" ), makeSymbol( "DEFLEXICAL-PUBLIC" ), makeSymbol( "DEFGLOBAL-PRIVATE" ), makeSymbol( "DEFGLOBAL-PROTECTED" ),
      makeSymbol( "DEFGLOBAL-PUBLIC" ), makeSymbol( "DEFPARAMETER-PRIVATE" ), makeSymbol( "DEFPARAMETER-PROTECTED" ), makeSymbol( "DEFPARAMETER-PUBLIC" ), makeSymbol( "DEFVAR-PRIVATE" ), makeSymbol( "DEFVAR-PROTECTED" ),
      makeSymbol( "DEFVAR-PUBLIC" )
    } );
    $kw58$MACRO_HELPER_FOR = makeKeyword( "MACRO-HELPER-FOR" );
  }
}
/*
 * 
 * Total time: 221 ms
 * 
 */