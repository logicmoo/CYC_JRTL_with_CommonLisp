package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class meta_macros
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.meta_macros";
  public static final String myFingerPrint = "4c63ef0605b624d2dbe615fd1156f574a27662e427f97632c90dc17a0fcebae9";
  private static final SubLList $list0;
  private static final SubLSymbol $sym1$QUOTE;
  private static final SubLSymbol $sym2$CLET;
  private static final SubLString $str3$TEMP;
  private static final SubLSymbol $sym4$SYMBOLP;
  private static final SubLSymbol $sym5$LISTP;

  @SubLTranslatedFile.SubL(source = "cycl/meta-macros.lisp", position = 864L)
  public static SubLObject with_temp_vars(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject vars = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    vars = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    SubLObject v_bindings = NIL;
    SubLObject cdolist_list_var = vars;
    SubLObject var = NIL;
    var = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject temp_var = make_temp_var( var );
      v_bindings = ConsesLow.cons( ConsesLow.list( var, ConsesLow.list( $sym1$QUOTE, temp_var ) ), v_bindings );
      cdolist_list_var = cdolist_list_var.rest();
      var = cdolist_list_var.first();
    }
    v_bindings = Sequences.nreverse( v_bindings );
    return ConsesLow.listS( $sym2$CLET, v_bindings, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/meta-macros.lisp", position = 1189L)
  public static SubLObject make_temp_var(final SubLObject v_object)
  {
    if( v_object.isString() )
    {
      return Symbols.make_symbol( v_object );
    }
    if( v_object.isSymbol() )
    {
      return make_temp_var( Symbols.symbol_name( v_object ) );
    }
    return make_temp_var( $str3$TEMP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/meta-macros.lisp", position = 1459L)
  public static SubLObject declare_indention_pattern(final SubLObject operator, final SubLObject pattern)
  {
    assert NIL != Types.symbolp( operator ) : operator;
    assert NIL != Types.listp( pattern ) : pattern;
    return NIL;
  }

  public static SubLObject declare_meta_macros_file()
  {
    SubLFiles.declareMacro( me, "with_temp_vars", "WITH-TEMP-VARS" );
    SubLFiles.declareFunction( me, "make_temp_var", "MAKE-TEMP-VAR", 1, 0, false );
    SubLFiles.declareFunction( me, "declare_indention_pattern", "DECLARE-INDENTION-PATTERN", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_meta_macros_file()
  {
    return NIL;
  }

  public static SubLObject setup_meta_macros_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_meta_macros_file();
  }

  @Override
  public void initializeVariables()
  {
    init_meta_macros_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_meta_macros_file();
  }
  static
  {
    me = new meta_macros();
    $list0 = ConsesLow.list( makeSymbol( "VARS" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym1$QUOTE = makeSymbol( "QUOTE" );
    $sym2$CLET = makeSymbol( "CLET" );
    $str3$TEMP = makeString( "TEMP" );
    $sym4$SYMBOLP = makeSymbol( "SYMBOLP" );
    $sym5$LISTP = makeSymbol( "LISTP" );
  }
}
/*
 * 
 * Total time: 31 ms
 * 
 */