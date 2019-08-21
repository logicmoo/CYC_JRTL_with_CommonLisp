package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class alexandria_allegro_macros
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.alexandria_allegro_macros";
  public static final String myFingerPrint = "e087c84b5a2aad91d4f0b9c8004bd74a8a1bdc96c8f942b750300bf6b22d81e3";
  @SubLTranslatedFile.SubL(source = "cycl/alexandria-allegro-macros.lisp", position = 842L)
  private static SubLSymbol $alexandria_allegro_mode_enabledP$;
  @SubLTranslatedFile.SubL(source = "cycl/alexandria-allegro-macros.lisp", position = 1127L)
  private static SubLSymbol $alexandria_allegro_cache_kb_store_contentP$;
  @SubLTranslatedFile.SubL(source = "cycl/alexandria-allegro-macros.lisp", position = 1486L)
  public static SubLSymbol $suspend_jrtl_object_cachingP$;
  private static final SubLSymbol $sym0$_ALEXANDRIA_ALLEGRO_CACHE_KB_STORE_CONTENT__;
  private static final SubLSymbol $sym1$CLET;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLSymbol $sym4$JRTL_BOX;
  private static final SubLSymbol $sym5$JRTL_UNBOX;
  private static final SubLSymbol $sym6$JAVA_NEW;
  private static final SubLList $list7;
  private static final SubLSymbol $sym8$JAVA_METHOD;
  private static final SubLList $list9;
  private static final SubLSymbol $sym10$JAVA_STATIC;
  private static final SubLList $list11;
  private static final SubLSymbol $sym12$JAVA_CALL;

  @SubLTranslatedFile.SubL(source = "cycl/alexandria-allegro-macros.lisp", position = 1031L)
  public static SubLObject alexandria_allegro_mode_enabledP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $alexandria_allegro_mode_enabledP$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/alexandria-allegro-macros.lisp", position = 1370L)
  public static SubLObject alexandria_allegro_cache_kb_store_contentP()
  {
    return $alexandria_allegro_cache_kb_store_contentP$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/alexandria-allegro-macros.lisp", position = 1653L)
  public static SubLObject suspend_jrtl_object_caching(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym1$CLET, $list2, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/alexandria-allegro-macros.lisp", position = 1769L)
  public static SubLObject jrtl_new(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject v_class = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list3 );
    v_class = current.first();
    final SubLObject args;
    current = ( args = current.rest() );
    SubLObject boxed_args = NIL;
    SubLObject cdolist_list_var = args;
    SubLObject arg = NIL;
    arg = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      boxed_args = ConsesLow.cons( ConsesLow.list( $sym4$JRTL_BOX, arg ), boxed_args );
      cdolist_list_var = cdolist_list_var.rest();
      arg = cdolist_list_var.first();
    }
    boxed_args = Sequences.nreverse( boxed_args );
    return ConsesLow.list( $sym5$JRTL_UNBOX, ConsesLow.listS( $sym6$JAVA_NEW, v_class, ConsesLow.append( boxed_args, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/alexandria-allegro-macros.lisp", position = 2198L)
  public static SubLObject jrtl_method(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject v_class = NIL;
    SubLObject name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    v_class = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    name = current.first();
    final SubLObject argsig;
    current = ( argsig = current.rest() );
    SubLObject boxed_argsig = NIL;
    SubLObject cdolist_list_var = argsig;
    SubLObject singlesig = NIL;
    singlesig = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      boxed_argsig = ConsesLow.cons( ConsesLow.list( $sym4$JRTL_BOX, singlesig ), boxed_argsig );
      cdolist_list_var = cdolist_list_var.rest();
      singlesig = cdolist_list_var.first();
    }
    boxed_argsig = Sequences.nreverse( boxed_argsig );
    return ConsesLow.list( $sym5$JRTL_UNBOX, ConsesLow.listS( $sym8$JAVA_METHOD, v_class, name, ConsesLow.append( boxed_argsig, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/alexandria-allegro-macros.lisp", position = 2472L)
  public static SubLObject jrtl_static(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject method = NIL;
    SubLObject v_class = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list9 );
    method = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list9 );
    v_class = current.first();
    final SubLObject args;
    current = ( args = current.rest() );
    SubLObject boxed_args = NIL;
    SubLObject cdolist_list_var = args;
    SubLObject arg = NIL;
    arg = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      boxed_args = ConsesLow.cons( ConsesLow.list( $sym4$JRTL_BOX, arg ), boxed_args );
      cdolist_list_var = cdolist_list_var.rest();
      arg = cdolist_list_var.first();
    }
    boxed_args = Sequences.nreverse( boxed_args );
    return ConsesLow.list( $sym5$JRTL_UNBOX, ConsesLow.listS( $sym10$JAVA_STATIC, method, v_class, ConsesLow.append( boxed_args, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/alexandria-allegro-macros.lisp", position = 2726L)
  public static SubLObject jrtl_call(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject method = NIL;
    SubLObject instance = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list11 );
    method = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list11 );
    instance = current.first();
    final SubLObject args;
    current = ( args = current.rest() );
    SubLObject boxed_args = NIL;
    SubLObject cdolist_list_var = args;
    SubLObject arg = NIL;
    arg = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      boxed_args = ConsesLow.cons( ConsesLow.list( $sym4$JRTL_BOX, arg ), boxed_args );
      cdolist_list_var = cdolist_list_var.rest();
      arg = cdolist_list_var.first();
    }
    boxed_args = Sequences.nreverse( boxed_args );
    return ConsesLow.list( $sym5$JRTL_UNBOX, ConsesLow.listS( $sym12$JAVA_CALL, method, instance, ConsesLow.append( boxed_args, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/alexandria-allegro-macros.lisp", position = 2980L)
  public static SubLObject symbol_value_to_el_string(final SubLObject symbol_string)
  {
    final SubLObject symbol = Packages.find_symbol( Strings.string_upcase( symbol_string, UNPROVIDED, UNPROVIDED ), UNPROVIDED );
    final SubLObject value = ( NIL != Symbols.boundp( symbol ) ) ? Symbols.symbol_value( symbol ) : NIL;
    final SubLObject el_value = ( NIL != value ) ? cycl_utilities.hl_to_el( value ) : NIL;
    final SubLObject el_value_string = print_high.princ_to_string( el_value );
    return el_value_string;
  }

  public static SubLObject declare_alexandria_allegro_macros_file()
  {
    SubLFiles.declareFunction( me, "alexandria_allegro_mode_enabledP", "ALEXANDRIA-ALLEGRO-MODE-ENABLED?", 0, 0, false );
    SubLFiles.declareFunction( me, "alexandria_allegro_cache_kb_store_contentP", "ALEXANDRIA-ALLEGRO-CACHE-KB-STORE-CONTENT?", 0, 0, false );
    SubLFiles.declareMacro( me, "suspend_jrtl_object_caching", "SUSPEND-JRTL-OBJECT-CACHING" );
    SubLFiles.declareMacro( me, "jrtl_new", "JRTL-NEW" );
    SubLFiles.declareMacro( me, "jrtl_method", "JRTL-METHOD" );
    SubLFiles.declareMacro( me, "jrtl_static", "JRTL-STATIC" );
    SubLFiles.declareMacro( me, "jrtl_call", "JRTL-CALL" );
    SubLFiles.declareFunction( me, "symbol_value_to_el_string", "SYMBOL-VALUE-TO-EL-STRING", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_alexandria_allegro_macros_file()
  {
    $alexandria_allegro_mode_enabledP$ = SubLFiles.defparameter( "*ALEXANDRIA-ALLEGRO-MODE-ENABLED?*", NIL );
    $alexandria_allegro_cache_kb_store_contentP$ = SubLFiles.deflexical( "*ALEXANDRIA-ALLEGRO-CACHE-KB-STORE-CONTENT?*", ( maybeDefault( $sym0$_ALEXANDRIA_ALLEGRO_CACHE_KB_STORE_CONTENT__,
        $alexandria_allegro_cache_kb_store_contentP$, NIL ) ) );
    $suspend_jrtl_object_cachingP$ = SubLFiles.defparameter( "*SUSPEND-JRTL-OBJECT-CACHING?*", NIL );
    return NIL;
  }

  public static SubLObject setup_alexandria_allegro_macros_file()
  {
    subl_macro_promotions.declare_defglobal( $sym0$_ALEXANDRIA_ALLEGRO_CACHE_KB_STORE_CONTENT__ );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_alexandria_allegro_macros_file();
  }

  @Override
  public void initializeVariables()
  {
    init_alexandria_allegro_macros_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_alexandria_allegro_macros_file();
  }
  static
  {
    me = new alexandria_allegro_macros();
    $alexandria_allegro_mode_enabledP$ = null;
    $alexandria_allegro_cache_kb_store_contentP$ = null;
    $suspend_jrtl_object_cachingP$ = null;
    $sym0$_ALEXANDRIA_ALLEGRO_CACHE_KB_STORE_CONTENT__ = makeSymbol( "*ALEXANDRIA-ALLEGRO-CACHE-KB-STORE-CONTENT?*" );
    $sym1$CLET = makeSymbol( "CLET" );
    $list2 = ConsesLow.list( ConsesLow.list( makeSymbol( "*SUSPEND-JRTL-OBJECT-CACHING?*" ), T ) );
    $list3 = ConsesLow.list( makeSymbol( "CLASS" ), makeSymbol( "&REST" ), makeSymbol( "ARGS" ) );
    $sym4$JRTL_BOX = makeSymbol( "JRTL-BOX" );
    $sym5$JRTL_UNBOX = makeSymbol( "JRTL-UNBOX" );
    $sym6$JAVA_NEW = makeSymbol( "JAVA-NEW" );
    $list7 = ConsesLow.list( makeSymbol( "CLASS" ), makeSymbol( "NAME" ), makeSymbol( "&REST" ), makeSymbol( "ARGSIG" ) );
    $sym8$JAVA_METHOD = makeSymbol( "JAVA-METHOD" );
    $list9 = ConsesLow.list( makeSymbol( "METHOD" ), makeSymbol( "CLASS" ), makeSymbol( "&REST" ), makeSymbol( "ARGS" ) );
    $sym10$JAVA_STATIC = makeSymbol( "JAVA-STATIC" );
    $list11 = ConsesLow.list( makeSymbol( "METHOD" ), makeSymbol( "INSTANCE" ), makeSymbol( "&REST" ), makeSymbol( "ARGS" ) );
    $sym12$JAVA_CALL = makeSymbol( "JAVA-CALL" );
  }
}
/*
 * 
 * Total time: 31 ms
 * 
 */