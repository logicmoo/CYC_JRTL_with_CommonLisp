package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class subloop_macros
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.subloop_macros";
  public static final String myFingerPrint = "0ca14b96adbf3f29fab01b45910510e260057ef370606debe82ec541bf69f0bf";
  private static final SubLList $list0;
  private static final SubLString $str1$_S_P;
  private static final SubLSymbol $sym2$RET;
  private static final SubLSymbol $sym3$INLINE_METHOD;
  private static final SubLSymbol $sym4$MUST;
  private static final SubLString $str5$_S____S_is_not_an_instance_of__S_;
  private static final SubLSymbol $sym6$PCOND;
  private static final SubLSymbol $sym7$FUNCALL_INSTANCE_METHOD;
  private static final SubLSymbol $sym8$QUOTE;
  private static final SubLList $list9;
  private static final SubLSymbol $sym10$DEF_OPTIMIZED_INSTANCE_METHOD_FUNCTION;
  private static final SubLSymbol $sym11$DEFINE_PUBLIC;
  private static final SubLSymbol $sym12$DEFINE_PROTECTED;
  private static final SubLSymbol $sym13$DEFINE_PRIVATE;

  @SubLTranslatedFile.SubL(source = "cycl/subloop-macros.lisp", position = 592L)
  public static SubLObject def_optimized_instance_method_function(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject def_form = NIL;
    SubLObject function_name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    def_form = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    function_name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject method_name = NIL;
    SubLObject class_name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    method_name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    class_name = current.first();
    current = current.rest();
    if( NIL == current )
    {
      current = temp;
      SubLObject lambda_list = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
      lambda_list = current.first();
      final SubLObject v_classes;
      current = ( v_classes = current.rest() );
      final SubLObject arg_list = methods.methods_filter_option_words_from_lambda_list( lambda_list );
      SubLObject class_conds = NIL;
      final SubLObject list_expression = v_classes;
      if( NIL == list_expression )
      {
        class_conds = NIL;
      }
      else if( list_expression.isAtom() )
      {
        class_conds = ConsesLow.list( list_expression );
      }
      else if( NIL == list_expression.rest() )
      {
        final SubLObject v_class = list_expression.first();
        class_conds = ConsesLow.list( conses_high.copy_tree( ConsesLow.list( ConsesLow.list( Packages.intern( PrintLow.format( NIL, $str1$_S_P, v_class ), UNPROVIDED ), class_name ), ConsesLow.list( $sym2$RET, ConsesLow
            .listS( $sym3$INLINE_METHOD, ConsesLow.list( method_name, v_class ), class_name, ConsesLow.append( conses_high.copy_list( arg_list ), NIL ) ) ) ) ) );
      }
      else
      {
        SubLObject tail_cons = NIL;
        SubLObject result = NIL;
        final SubLObject v_class2 = list_expression.first();
        class_conds = ( tail_cons = ConsesLow.list( conses_high.copy_tree( ConsesLow.list( ConsesLow.list( Packages.intern( PrintLow.format( NIL, $str1$_S_P, v_class2 ), UNPROVIDED ), class_name ), ConsesLow.list(
            $sym2$RET, ConsesLow.listS( $sym3$INLINE_METHOD, ConsesLow.list( method_name, v_class2 ), class_name, ConsesLow.append( conses_high.copy_list( arg_list ), NIL ) ) ) ) ) ) );
        SubLObject cdolist_list_var = list_expression.rest();
        SubLObject v_class3 = NIL;
        v_class3 = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          result = ConsesLow.list( conses_high.copy_tree( ConsesLow.list( ConsesLow.list( Packages.intern( PrintLow.format( NIL, $str1$_S_P, v_class3 ), UNPROVIDED ), class_name ), ConsesLow.list( $sym2$RET, ConsesLow
              .listS( $sym3$INLINE_METHOD, ConsesLow.list( method_name, v_class3 ), class_name, ConsesLow.append( conses_high.copy_list( arg_list ), NIL ) ) ) ) ) );
          ConsesLow.rplacd( tail_cons, result );
          tail_cons = result;
          cdolist_list_var = cdolist_list_var.rest();
          v_class3 = cdolist_list_var.first();
        }
      }
      return ConsesLow.list( def_form, function_name, reader.bq_cons( class_name, conses_high.copy_tree( lambda_list ) ), ConsesLow.list( $sym4$MUST, ConsesLow.list( Packages.intern( PrintLow.format( NIL, $str1$_S_P,
          class_name ), UNPROVIDED ), class_name ), PrintLow.format( NIL, $str5$_S____S_is_not_an_instance_of__S_, function_name, class_name ), class_name ), reader.bq_cons( $sym6$PCOND, ConsesLow.append( class_conds,
              ConsesLow.list( ConsesLow.list( T, ConsesLow.list( $sym2$RET, ConsesLow.listS( $sym7$FUNCALL_INSTANCE_METHOD, class_name, ConsesLow.list( $sym8$QUOTE, method_name ), ConsesLow.append( conses_high.copy_list(
                  arg_list ), NIL ) ) ) ) ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-macros.lisp", position = 1407L)
  public static SubLObject def_optimized_instance_method_function_public(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject function_name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list9 );
    function_name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list9 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject method_name = NIL;
    SubLObject class_name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list9 );
    method_name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list9 );
    class_name = current.first();
    current = current.rest();
    if( NIL == current )
    {
      current = temp;
      SubLObject lambda_list = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list9 );
      lambda_list = current.first();
      final SubLObject v_classes;
      current = ( v_classes = current.rest() );
      return ConsesLow.listS( $sym10$DEF_OPTIMIZED_INSTANCE_METHOD_FUNCTION, $sym11$DEFINE_PUBLIC, function_name, ConsesLow.list( method_name, class_name ), lambda_list, v_classes );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list9 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-macros.lisp", position = 1671L)
  public static SubLObject def_optimized_instance_method_function_protected(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject function_name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list9 );
    function_name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list9 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject method_name = NIL;
    SubLObject class_name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list9 );
    method_name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list9 );
    class_name = current.first();
    current = current.rest();
    if( NIL == current )
    {
      current = temp;
      SubLObject lambda_list = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list9 );
      lambda_list = current.first();
      final SubLObject v_classes;
      current = ( v_classes = current.rest() );
      return ConsesLow.listS( $sym10$DEF_OPTIMIZED_INSTANCE_METHOD_FUNCTION, $sym12$DEFINE_PROTECTED, function_name, ConsesLow.list( method_name, class_name ), lambda_list, v_classes );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list9 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-macros.lisp", position = 1941L)
  public static SubLObject def_optimized_instance_method_function_private(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject function_name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list9 );
    function_name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list9 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject method_name = NIL;
    SubLObject class_name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list9 );
    method_name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list9 );
    class_name = current.first();
    current = current.rest();
    if( NIL == current )
    {
      current = temp;
      SubLObject lambda_list = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list9 );
      lambda_list = current.first();
      final SubLObject v_classes;
      current = ( v_classes = current.rest() );
      return ConsesLow.listS( $sym10$DEF_OPTIMIZED_INSTANCE_METHOD_FUNCTION, $sym13$DEFINE_PRIVATE, function_name, ConsesLow.list( method_name, class_name ), lambda_list, v_classes );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list9 );
    return NIL;
  }

  public static SubLObject declare_subloop_macros_file()
  {
    SubLFiles.declareMacro( me, "def_optimized_instance_method_function", "DEF-OPTIMIZED-INSTANCE-METHOD-FUNCTION" );
    SubLFiles.declareMacro( me, "def_optimized_instance_method_function_public", "DEF-OPTIMIZED-INSTANCE-METHOD-FUNCTION-PUBLIC" );
    SubLFiles.declareMacro( me, "def_optimized_instance_method_function_protected", "DEF-OPTIMIZED-INSTANCE-METHOD-FUNCTION-PROTECTED" );
    SubLFiles.declareMacro( me, "def_optimized_instance_method_function_private", "DEF-OPTIMIZED-INSTANCE-METHOD-FUNCTION-PRIVATE" );
    return NIL;
  }

  public static SubLObject init_subloop_macros_file()
  {
    return NIL;
  }

  public static SubLObject setup_subloop_macros_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_subloop_macros_file();
  }

  @Override
  public void initializeVariables()
  {
    init_subloop_macros_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_subloop_macros_file();
  }
  static
  {
    me = new subloop_macros();
    $list0 = ConsesLow.list( makeSymbol( "DEF-FORM" ), makeSymbol( "FUNCTION-NAME" ), ConsesLow.list( makeSymbol( "METHOD-NAME" ), makeSymbol( "CLASS-NAME" ) ), makeSymbol( "LAMBDA-LIST" ), makeSymbol( "&REST" ),
        makeSymbol( "CLASSES" ) );
    $str1$_S_P = makeString( "~S-P" );
    $sym2$RET = makeSymbol( "RET" );
    $sym3$INLINE_METHOD = makeSymbol( "INLINE-METHOD" );
    $sym4$MUST = makeSymbol( "MUST" );
    $str5$_S____S_is_not_an_instance_of__S_ = makeString( "~S: ~~S is not an instance of ~S." );
    $sym6$PCOND = makeSymbol( "PCOND" );
    $sym7$FUNCALL_INSTANCE_METHOD = makeSymbol( "FUNCALL-INSTANCE-METHOD" );
    $sym8$QUOTE = makeSymbol( "QUOTE" );
    $list9 = ConsesLow.list( makeSymbol( "FUNCTION-NAME" ), ConsesLow.list( makeSymbol( "METHOD-NAME" ), makeSymbol( "CLASS-NAME" ) ), makeSymbol( "LAMBDA-LIST" ), makeSymbol( "&REST" ), makeSymbol( "CLASSES" ) );
    $sym10$DEF_OPTIMIZED_INSTANCE_METHOD_FUNCTION = makeSymbol( "DEF-OPTIMIZED-INSTANCE-METHOD-FUNCTION" );
    $sym11$DEFINE_PUBLIC = makeSymbol( "DEFINE-PUBLIC" );
    $sym12$DEFINE_PROTECTED = makeSymbol( "DEFINE-PROTECTED" );
    $sym13$DEFINE_PRIVATE = makeSymbol( "DEFINE-PRIVATE" );
  }
}
/*
 * 
 * Total time: 103 ms
 * 
 */