package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sunit_macros
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.sunit_macros";
  public static final String myFingerPrint = "ec1afa469742b60f6a36fd6f5f7192bf84478683e6000be96c5a3d2e84c8f6c8";
  @SubLTranslatedFile.SubL(source = "cycl/sunit-macros.lisp", position = 1148L)
  public static SubLSymbol $current_module_sunit_tests$;
  private static final SubLList $list0;
  private static final SubLSymbol $kw1$CYC_SUBLOOP;
  private static final SubLSymbol $kw2$CYC_SUNIT_FULL;
  private static final SubLString $str3$_A_is_not_the_name_of_a_known_cla;
  private static final SubLSymbol $sym4$PROGN;
  private static final SubLSymbol $sym5$DEF_TEST_METHOD_REGISTER;
  private static final SubLSymbol $sym6$QUOTE;
  private static final SubLSymbol $kw7$CYC_SUNIT;
  private static final SubLSymbol $sym8$DEF_INSTANCE_METHOD;
  private static final SubLSymbol $sym9$DEF_TEST_METHOD;
  private static final SubLList $list10;
  private static final SubLSymbol $sym11$DEF_TC_CONDITIONAL_METHOD;
  private static final SubLSymbol $sym12$SETUP;
  private static final SubLSymbol $sym13$CLEANUP;
  private static final SubLList $list14;
  private static final SubLList $list15;
  private static final SubLList $list16;
  private static final SubLSymbol $kw17$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw18$CATEGORIES;
  private static final SubLSymbol $sym19$DEFINE_TEST_CASE_INT;
  private static final SubLSymbol $sym20$TEST_CASE;
  private static final SubLSymbol $sym21$CYCL_TEST_CASE;
  private static final SubLList $list22;
  private static final SubLSymbol $kw23$EXTENDS;
  private static final SubLSymbol $sym24$CPUSH;
  private static final SubLList $list25;
  private static final SubLSymbol $sym26$DEFINE_TEST_CASE_PREAMBLE;
  private static final SubLSymbol $sym27$DEFINE_CLASS;
  private static final SubLSymbol $sym28$DEFINE_TEST_CASE_POSTAMBLE;
  private static final SubLList $list29;
  private static final SubLSymbol $sym30$CCATCH;
  private static final SubLSymbol $sym31$_CATCH_ERROR_MESSAGE_TARGET_;
  private static final SubLSymbol $sym32$WITH_ERROR_HANDLER;
  private static final SubLList $list33;
  private static final SubLList $list34;
  private static final SubLSymbol $sym35$HL_VARS;
  private static final SubLSymbol $sym36$CLET;
  private static final SubLSymbol $sym37$GENERATE_HL_VARIABLE_LIST;
  private static final SubLSymbol $sym38$TEST_WITH_HL_VARS_VAR_DECLARATIONS;
  private static final SubLSymbol $sym39$TEST_WITH_HL_VARS;
  private static final SubLString $str40$VAR;
  private static final SubLSymbol $sym41$NTH;

  @SubLTranslatedFile.SubL(source = "cycl/sunit-macros.lisp", position = 1620L)
  public static SubLObject def_test_method(final SubLObject macroform, final SubLObject environment)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject method_name = NIL;
    SubLObject class_name = NIL;
    SubLObject method_properties = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    method_name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    class_name = current.first();
    current = ( method_properties = current.rest() );
    current = temp;
    SubLObject lambda_list = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    lambda_list = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    final SubLObject method_spec = ConsesLow.cons( method_name, ConsesLow.cons( class_name, method_properties ) );
    if( NIL != Sequences.find( $kw1$CYC_SUBLOOP, reader.$features$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) && NIL != Sequences.find( $kw2$CYC_SUNIT_FULL, reader.$features$
        .getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) && NIL == subloop_structures.class_p( classes.classes_retrieve_class( class_name ) ) )
    {
      Errors.error( $str3$_A_is_not_the_name_of_a_known_cla, class_name );
    }
    return reader.bq_cons( $sym4$PROGN, ConsesLow.append( ( NIL != Sequences.find( $kw1$CYC_SUBLOOP, reader.$features$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) && NIL != Sequences.find(
        $kw2$CYC_SUNIT_FULL, reader.$features$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) ? ConsesLow.list( ConsesLow.listS( $sym4$PROGN, ConsesLow.list( $sym5$DEF_TEST_METHOD_REGISTER,
            ConsesLow.list( $sym6$QUOTE, class_name ), ConsesLow.list( $sym6$QUOTE, method_name ) ), ConsesLow.append( ( NIL != Sequences.find( $kw7$CYC_SUNIT, reader.$features$.getDynamicValue( thread ), UNPROVIDED,
                UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) ? ConsesLow.list( ConsesLow.listS( $sym8$DEF_INSTANCE_METHOD, method_spec, lambda_list, ConsesLow.append( body, NIL ) ) ) : NIL, NIL ) ) ) : NIL, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sunit-macros.lisp", position = 2686L)
  public static SubLObject def_test_method_register(final SubLObject class_name, final SubLObject method_name)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sunit-macros.lisp", position = 3023L)
  public static SubLObject def_setup_method(final SubLObject macroform, final SubLObject environment)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list10 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject class_name = NIL;
    SubLObject method_properties = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list10 );
    class_name = current.first();
    current = ( method_properties = current.rest() );
    current = temp;
    SubLObject lambda_list = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list10 );
    lambda_list = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    if( NIL != Sequences.find( $kw1$CYC_SUBLOOP, reader.$features$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) && NIL != Sequences.find( $kw2$CYC_SUNIT_FULL, reader.$features$
        .getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) && NIL == subloop_structures.class_p( classes.classes_retrieve_class( class_name ) ) )
    {
      Errors.error( $str3$_A_is_not_the_name_of_a_known_cla, class_name );
    }
    return ConsesLow.list( $sym4$PROGN, ConsesLow.listS( $sym11$DEF_TC_CONDITIONAL_METHOD, $sym12$SETUP, reader.bq_cons( class_name, method_properties ), lambda_list, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sunit-macros.lisp", position = 3686L)
  public static SubLObject def_cleanup_method(final SubLObject macroform, final SubLObject environment)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list10 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject class_name = NIL;
    SubLObject method_properties = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list10 );
    class_name = current.first();
    current = ( method_properties = current.rest() );
    current = temp;
    SubLObject lambda_list = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list10 );
    lambda_list = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    if( NIL != Sequences.find( $kw1$CYC_SUBLOOP, reader.$features$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) && NIL != Sequences.find( $kw2$CYC_SUNIT_FULL, reader.$features$
        .getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) && NIL == subloop_structures.class_p( classes.classes_retrieve_class( class_name ) ) )
    {
      Errors.error( $str3$_A_is_not_the_name_of_a_known_cla, class_name );
    }
    return ConsesLow.list( $sym4$PROGN, ConsesLow.listS( $sym11$DEF_TC_CONDITIONAL_METHOD, $sym13$CLEANUP, reader.bq_cons( class_name, method_properties ), lambda_list, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sunit-macros.lisp", position = 4356L)
  public static SubLObject def_tc_conditional_method(final SubLObject macroform, final SubLObject environment)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject type = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list14 );
    type = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list14 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject class_name = NIL;
    SubLObject method_properties = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list14 );
    class_name = current.first();
    current = ( method_properties = current.rest() );
    current = temp;
    SubLObject lambda_list = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list14 );
    lambda_list = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    final SubLObject method_spec = ConsesLow.cons( type, ConsesLow.cons( class_name, method_properties ) );
    return reader.bq_cons( $sym4$PROGN, ConsesLow.append( ( NIL != Sequences.find( $kw1$CYC_SUBLOOP, reader.$features$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) && NIL != Sequences.find(
        $kw2$CYC_SUNIT_FULL, reader.$features$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) && NIL != Sequences.find( $kw7$CYC_SUNIT, reader.$features$.getDynamicValue( thread ),
            UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) ? ConsesLow.list( ConsesLow.listS( $sym8$DEF_INSTANCE_METHOD, method_spec, lambda_list, ConsesLow.append( body, NIL ) ) ) : NIL, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sunit-macros.lisp", position = 4758L)
  public static SubLObject define_test_case(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list15 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject tc_symbol = NIL;
    SubLObject module_name = NIL;
    SubLObject system_name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list15 );
    tc_symbol = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list15 );
    module_name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list15 );
    system_name = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list15 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list15 );
      if( NIL == conses_high.member( current_$1, $list16, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw17$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list15 );
    }
    final SubLObject categories_tail = cdestructuring_bind.property_list_member( $kw18$CATEGORIES, current );
    final SubLObject categories = ( NIL != categories_tail ) ? conses_high.cadr( categories_tail ) : NIL;
    final SubLObject slot_decls;
    current = ( slot_decls = temp );
    final SubLObject arglist = ( NIL != categories ) ? ConsesLow.list( tc_symbol, module_name, system_name, $kw18$CATEGORIES, categories ) : ConsesLow.list( tc_symbol, module_name, system_name );
    return ConsesLow.list( $sym4$PROGN, ConsesLow.listS( $sym19$DEFINE_TEST_CASE_INT, $sym20$TEST_CASE, arglist, ConsesLow.append( slot_decls, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sunit-macros.lisp", position = 5384L)
  public static SubLObject define_cycl_test_case(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list15 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject tc_symbol = NIL;
    SubLObject module_name = NIL;
    SubLObject system_name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list15 );
    tc_symbol = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list15 );
    module_name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list15 );
    system_name = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$2 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list15 );
      current_$2 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list15 );
      if( NIL == conses_high.member( current_$2, $list16, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$2 == $kw17$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list15 );
    }
    final SubLObject categories_tail = cdestructuring_bind.property_list_member( $kw18$CATEGORIES, current );
    final SubLObject categories = ( NIL != categories_tail ) ? conses_high.cadr( categories_tail ) : NIL;
    final SubLObject slot_decls;
    current = ( slot_decls = temp );
    final SubLObject arglist = ( NIL != categories ) ? ConsesLow.list( tc_symbol, module_name, system_name, $kw18$CATEGORIES, categories ) : ConsesLow.list( tc_symbol, module_name, system_name );
    return ConsesLow.list( $sym4$PROGN, ConsesLow.listS( $sym19$DEFINE_TEST_CASE_INT, $sym21$CYCL_TEST_CASE, arglist, ConsesLow.append( slot_decls, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sunit-macros.lisp", position = 5949L)
  public static SubLObject define_test_case_int(final SubLObject macroform, final SubLObject environment)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject type = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list22 );
    type = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list22 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject tc_symbol = NIL;
    SubLObject module_name = NIL;
    SubLObject system_name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list22 );
    tc_symbol = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list22 );
    module_name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list22 );
    system_name = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$3 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list22 );
      current_$3 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list22 );
      if( NIL == conses_high.member( current_$3, $list16, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$3 == $kw17$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list22 );
    }
    final SubLObject categories_tail = cdestructuring_bind.property_list_member( $kw18$CATEGORIES, current );
    final SubLObject categories = ( NIL != categories_tail ) ? conses_high.cadr( categories_tail ) : NIL;
    final SubLObject slot_decls;
    current = ( slot_decls = temp );
    final SubLObject class_properties = ConsesLow.list( $kw23$EXTENDS, type );
    return reader.bq_cons( $sym4$PROGN, ConsesLow.append( ( NIL != Sequences.find( $kw1$CYC_SUBLOOP, reader.$features$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) && NIL != Sequences.find(
        $kw2$CYC_SUNIT_FULL, reader.$features$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) ? ConsesLow.list( ConsesLow.list( $sym4$PROGN, ConsesLow.listS( $sym24$CPUSH, ConsesLow.list(
            $sym6$QUOTE, tc_symbol ), $list25 ), ConsesLow.list( $sym26$DEFINE_TEST_CASE_PREAMBLE, ConsesLow.list( $sym6$QUOTE, tc_symbol ) ), ConsesLow.listS( $sym27$DEFINE_CLASS, reader.bq_cons( tc_symbol,
                class_properties ), ConsesLow.append( slot_decls, NIL ) ), ConsesLow.list( $sym28$DEFINE_TEST_CASE_POSTAMBLE, ConsesLow.list( $sym6$QUOTE, tc_symbol ), module_name, system_name, categories ) ) ) : NIL,
        NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sunit-macros.lisp", position = 6565L)
  public static SubLObject define_test_case_preamble(final SubLObject tc_symbol)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sunit-macros.lisp", position = 6938L)
  public static SubLObject define_test_case_postamble(final SubLObject tc_symbol, final SubLObject module_name, final SubLObject system_name, final SubLObject categories)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sunit-macros.lisp", position = 7591L)
  public static SubLObject catch_sunit_error_message(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
    var = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym30$CCATCH, $sym31$_CATCH_ERROR_MESSAGE_TARGET_, var, ConsesLow.listS( $sym32$WITH_ERROR_HANDLER, $list33, ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list29 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sunit-macros.lisp", position = 8038L)
  public static SubLObject catch_sunit_error_message_handler()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Dynamic.sublisp_throw( subl_macro_promotions.$catch_error_message_target$.getGlobalValue(), Errors.$error_message$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sunit-macros.lisp", position = 8416L)
  public static SubLObject test_with_hl_vars(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject num = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list34 );
    num = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    final SubLObject hl_vars = $sym35$HL_VARS;
    return ConsesLow.listS( $sym36$CLET, reader.bq_cons( ConsesLow.list( hl_vars, ConsesLow.list( $sym37$GENERATE_HL_VARIABLE_LIST, num ) ), ConsesLow.append( test_with_hl_vars_var_declarations( num, hl_vars ), NIL ) ),
        ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sunit-macros.lisp", position = 8939L)
  public static SubLObject test_with_hl_vars_var_declarations(final SubLObject highest_num, final SubLObject hl_vars)
  {
    SubLObject results = NIL;
    SubLObject x;
    for( x = NIL, x = ZERO_INTEGER; x.numL( highest_num ); x = Numbers.add( x, ONE_INTEGER ) )
    {
      results = ConsesLow.cons( ConsesLow.list( Packages.intern( Symbols.make_symbol( Sequences.cconcatenate( $str40$VAR, PrintLow.write_to_string( x, EMPTY_SUBL_OBJECT_ARRAY ) ) ), UNPROVIDED ), ConsesLow.list(
          $sym41$NTH, x, hl_vars ) ), results );
    }
    return Sequences.nreverse( results );
  }

  public static SubLObject declare_sunit_macros_file()
  {
    SubLFiles.declareMacro( me, "def_test_method", "DEF-TEST-METHOD" );
    SubLFiles.declareFunction( me, "def_test_method_register", "DEF-TEST-METHOD-REGISTER", 2, 0, false );
    SubLFiles.declareMacro( me, "def_setup_method", "DEF-SETUP-METHOD" );
    SubLFiles.declareMacro( me, "def_cleanup_method", "DEF-CLEANUP-METHOD" );
    SubLFiles.declareMacro( me, "def_tc_conditional_method", "DEF-TC-CONDITIONAL-METHOD" );
    SubLFiles.declareMacro( me, "define_test_case", "DEFINE-TEST-CASE" );
    SubLFiles.declareMacro( me, "define_cycl_test_case", "DEFINE-CYCL-TEST-CASE" );
    SubLFiles.declareMacro( me, "define_test_case_int", "DEFINE-TEST-CASE-INT" );
    SubLFiles.declareFunction( me, "define_test_case_preamble", "DEFINE-TEST-CASE-PREAMBLE", 1, 0, false );
    SubLFiles.declareFunction( me, "define_test_case_postamble", "DEFINE-TEST-CASE-POSTAMBLE", 4, 0, false );
    SubLFiles.declareMacro( me, "catch_sunit_error_message", "CATCH-SUNIT-ERROR-MESSAGE" );
    SubLFiles.declareFunction( me, "catch_sunit_error_message_handler", "CATCH-SUNIT-ERROR-MESSAGE-HANDLER", 0, 0, false );
    SubLFiles.declareMacro( me, "test_with_hl_vars", "TEST-WITH-HL-VARS" );
    SubLFiles.declareFunction( me, "test_with_hl_vars_var_declarations", "TEST-WITH-HL-VARS-VAR-DECLARATIONS", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_sunit_macros_file()
  {
    $current_module_sunit_tests$ = SubLFiles.defparameter( "*CURRENT-MODULE-SUNIT-TESTS*", NIL );
    return NIL;
  }

  public static SubLObject setup_sunit_macros_file()
  {
    access_macros.register_macro_helper( $sym5$DEF_TEST_METHOD_REGISTER, $sym9$DEF_TEST_METHOD );
    access_macros.register_macro_helper( $sym26$DEFINE_TEST_CASE_PREAMBLE, $sym19$DEFINE_TEST_CASE_INT );
    access_macros.register_macro_helper( $sym28$DEFINE_TEST_CASE_POSTAMBLE, $sym19$DEFINE_TEST_CASE_INT );
    access_macros.register_macro_helper( $sym38$TEST_WITH_HL_VARS_VAR_DECLARATIONS, $sym39$TEST_WITH_HL_VARS );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_sunit_macros_file();
  }

  @Override
  public void initializeVariables()
  {
    init_sunit_macros_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_sunit_macros_file();
  }
  static
  {
    me = new sunit_macros();
    $current_module_sunit_tests$ = null;
    $list0 = ConsesLow.list( ConsesLow.listS( makeSymbol( "METHOD-NAME" ), makeSymbol( "CLASS-NAME" ), makeSymbol( "METHOD-PROPERTIES" ) ), makeSymbol( "LAMBDA-LIST" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $kw1$CYC_SUBLOOP = makeKeyword( "CYC-SUBLOOP" );
    $kw2$CYC_SUNIT_FULL = makeKeyword( "CYC-SUNIT-FULL" );
    $str3$_A_is_not_the_name_of_a_known_cla = makeString( "~A is not the name of a known class." );
    $sym4$PROGN = makeSymbol( "PROGN" );
    $sym5$DEF_TEST_METHOD_REGISTER = makeSymbol( "DEF-TEST-METHOD-REGISTER" );
    $sym6$QUOTE = makeSymbol( "QUOTE" );
    $kw7$CYC_SUNIT = makeKeyword( "CYC-SUNIT" );
    $sym8$DEF_INSTANCE_METHOD = makeSymbol( "DEF-INSTANCE-METHOD" );
    $sym9$DEF_TEST_METHOD = makeSymbol( "DEF-TEST-METHOD" );
    $list10 = ConsesLow.list( ConsesLow.cons( makeSymbol( "CLASS-NAME" ), makeSymbol( "METHOD-PROPERTIES" ) ), makeSymbol( "LAMBDA-LIST" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym11$DEF_TC_CONDITIONAL_METHOD = makeSymbol( "DEF-TC-CONDITIONAL-METHOD" );
    $sym12$SETUP = makeSymbol( "SETUP" );
    $sym13$CLEANUP = makeSymbol( "CLEANUP" );
    $list14 = ConsesLow.list( makeSymbol( "TYPE" ), ConsesLow.cons( makeSymbol( "CLASS-NAME" ), makeSymbol( "METHOD-PROPERTIES" ) ), makeSymbol( "LAMBDA-LIST" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list15 = ConsesLow.list( ConsesLow.list( makeSymbol( "TC-SYMBOL" ), makeSymbol( "MODULE-NAME" ), makeSymbol( "SYSTEM-NAME" ), makeSymbol( "&KEY" ), makeSymbol( "CATEGORIES" ) ), makeSymbol( "&BODY" ), makeSymbol(
        "SLOT-DECLS" ) );
    $list16 = ConsesLow.list( makeKeyword( "CATEGORIES" ) );
    $kw17$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw18$CATEGORIES = makeKeyword( "CATEGORIES" );
    $sym19$DEFINE_TEST_CASE_INT = makeSymbol( "DEFINE-TEST-CASE-INT" );
    $sym20$TEST_CASE = makeSymbol( "TEST-CASE" );
    $sym21$CYCL_TEST_CASE = makeSymbol( "CYCL-TEST-CASE" );
    $list22 = ConsesLow.list( makeSymbol( "TYPE" ), ConsesLow.list( makeSymbol( "TC-SYMBOL" ), makeSymbol( "MODULE-NAME" ), makeSymbol( "SYSTEM-NAME" ), makeSymbol( "&KEY" ), makeSymbol( "CATEGORIES" ) ), makeSymbol(
        "&BODY" ), makeSymbol( "SLOT-DECLS" ) );
    $kw23$EXTENDS = makeKeyword( "EXTENDS" );
    $sym24$CPUSH = makeSymbol( "CPUSH" );
    $list25 = ConsesLow.list( makeSymbol( "*CURRENT-MODULE-SUNIT-TESTS*" ) );
    $sym26$DEFINE_TEST_CASE_PREAMBLE = makeSymbol( "DEFINE-TEST-CASE-PREAMBLE" );
    $sym27$DEFINE_CLASS = makeSymbol( "DEFINE-CLASS" );
    $sym28$DEFINE_TEST_CASE_POSTAMBLE = makeSymbol( "DEFINE-TEST-CASE-POSTAMBLE" );
    $list29 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym30$CCATCH = makeSymbol( "CCATCH" );
    $sym31$_CATCH_ERROR_MESSAGE_TARGET_ = makeSymbol( "*CATCH-ERROR-MESSAGE-TARGET*" );
    $sym32$WITH_ERROR_HANDLER = makeSymbol( "WITH-ERROR-HANDLER" );
    $list33 = ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CATCH-SUNIT-ERROR-MESSAGE-HANDLER" ) );
    $list34 = ConsesLow.list( makeSymbol( "NUM" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym35$HL_VARS = makeUninternedSymbol( "HL-VARS" );
    $sym36$CLET = makeSymbol( "CLET" );
    $sym37$GENERATE_HL_VARIABLE_LIST = makeSymbol( "GENERATE-HL-VARIABLE-LIST" );
    $sym38$TEST_WITH_HL_VARS_VAR_DECLARATIONS = makeSymbol( "TEST-WITH-HL-VARS-VAR-DECLARATIONS" );
    $sym39$TEST_WITH_HL_VARS = makeSymbol( "TEST-WITH-HL-VARS" );
    $str40$VAR = makeString( "VAR" );
    $sym41$NTH = makeSymbol( "NTH" );
  }
}
/*
 * 
 * Total time: 91 ms
 * 
 */