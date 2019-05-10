package com.cyc.cycjava.cycl.cyc_testing;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.access_macros;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.inference.harness.inference_strategist;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class transformation_module_tests
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.cyc_testing.transformation_module_tests";
  public static final String myFingerPrint = "3a2e03dc6955a4ee6bd0c62e9411f2f8c8db91d34fc40ca3d5b2575c132d4bc3";
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 1449L)
  public static SubLSymbol $dtp_transformation_module_test$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 1631L)
  private static SubLSymbol $transformation_module_tests$;
  private static final SubLSymbol $sym0$TRANSFORMATION_MODULE_TEST;
  private static final SubLSymbol $sym1$TRANSFORMATION_MODULE_TEST_P;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$DEFAULT_STRUCT_PRINT_FUNCTION;
  private static final SubLSymbol $sym7$TRANSFORMATION_MODULE_TEST_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$TMT_HL_MODULE;
  private static final SubLSymbol $sym10$_CSETF_TMT_HL_MODULE;
  private static final SubLSymbol $sym11$TMT_ID;
  private static final SubLSymbol $sym12$_CSETF_TMT_ID;
  private static final SubLSymbol $sym13$TMT_SENTENCE;
  private static final SubLSymbol $sym14$_CSETF_TMT_SENTENCE;
  private static final SubLSymbol $sym15$TMT_MT;
  private static final SubLSymbol $sym16$_CSETF_TMT_MT;
  private static final SubLSymbol $sym17$TMT_PROPERTIES;
  private static final SubLSymbol $sym18$_CSETF_TMT_PROPERTIES;
  private static final SubLSymbol $sym19$TMT_COMMENT;
  private static final SubLSymbol $sym20$_CSETF_TMT_COMMENT;
  private static final SubLSymbol $sym21$TMT_KB;
  private static final SubLSymbol $sym22$_CSETF_TMT_KB;
  private static final SubLSymbol $sym23$TMT_OWNER;
  private static final SubLSymbol $sym24$_CSETF_TMT_OWNER;
  private static final SubLSymbol $sym25$TMT_BUG_NUMBER;
  private static final SubLSymbol $sym26$_CSETF_TMT_BUG_NUMBER;
  private static final SubLSymbol $sym27$TMT_CREATION_DATE;
  private static final SubLSymbol $sym28$_CSETF_TMT_CREATION_DATE;
  private static final SubLSymbol $sym29$TMT_CREATOR;
  private static final SubLSymbol $sym30$_CSETF_TMT_CREATOR;
  private static final SubLSymbol $sym31$TMT_WORKING_;
  private static final SubLSymbol $sym32$_CSETF_TMT_WORKING_;
  private static final SubLSymbol $kw33$HL_MODULE;
  private static final SubLSymbol $kw34$ID;
  private static final SubLSymbol $kw35$SENTENCE;
  private static final SubLSymbol $kw36$MT;
  private static final SubLSymbol $kw37$PROPERTIES;
  private static final SubLSymbol $kw38$COMMENT;
  private static final SubLSymbol $kw39$KB;
  private static final SubLSymbol $kw40$OWNER;
  private static final SubLSymbol $kw41$BUG_NUMBER;
  private static final SubLSymbol $kw42$CREATION_DATE;
  private static final SubLSymbol $kw43$CREATOR;
  private static final SubLSymbol $kw44$WORKING_;
  private static final SubLString $str45$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw46$BEGIN;
  private static final SubLSymbol $sym47$MAKE_TRANSFORMATION_MODULE_TEST;
  private static final SubLSymbol $kw48$SLOT;
  private static final SubLSymbol $kw49$END;
  private static final SubLSymbol $sym50$VISIT_DEFSTRUCT_OBJECT_TRANSFORMATION_MODULE_TEST_METHOD;
  private static final SubLSymbol $sym51$_TRANSFORMATION_MODULE_TESTS_;
  private static final SubLInteger $int52$100;
  private static final SubLSymbol $sym53$TERM__;
  private static final SubLSymbol $sym54$HL_MODULE_NAME;
  private static final SubLSymbol $sym55$_;
  private static final SubLSymbol $sym56$INVALID_CONSTANT_;
  private static final SubLList $list57;
  private static final SubLList $list58;
  private static final SubLSymbol $kw59$ALLOW_OTHER_KEYS;
  private static final SubLObject $const60$EverythingPSC;
  private static final SubLSymbol $kw61$TINY;
  private static final SubLSymbol $kw62$BUG;
  private static final SubLSymbol $kw63$CREATED;
  private static final SubLSymbol $sym64$DEFINE_TRANSFORMATION_MODULE_TEST_INT;
  private static final SubLSymbol $sym65$DEFINE_TRANSFORMATION_MODULE_TEST;
  private static final SubLSymbol $sym66$STRINGP;
  private static final SubLSymbol $sym67$CYC_TEST_KB_P;
  private static final SubLSymbol $sym68$INFERENCE_TEST_OWNER_P;
  private static final SubLSymbol $sym69$POSITIVE_INTEGER_P;
  private static final SubLSymbol $sym70$UNIVERSAL_DATE_P;
  private static final SubLSymbol $sym71$BOOLEANP;
  private static final SubLSymbol $kw72$STANDARD;
  private static final SubLSymbol $sym73$CYC_TEST_OUTPUT_FORMAT_P;
  private static final SubLSymbol $kw74$TERSE;
  private static final SubLSymbol $kw75$TMT;
  private static final SubLSymbol $kw76$SUCCESS;
  private static final SubLSymbol $kw77$NOT_RUN;
  private static final SubLSymbol $kw78$INVALID;
  private static final SubLSymbol $kw79$ERROR;
  private static final SubLSymbol $kw80$IGNORE_ERRORS_TARGET;
  private static final SubLSymbol $sym81$IGNORE_ERRORS_HANDLER;
  private static final SubLSymbol $kw82$FAILURE;
  private static final SubLSymbol $kw83$CONDITIONAL_SENTENCE_;
  private static final SubLSymbol $kw84$BROWSABLE_;
  private static final SubLSymbol $kw85$MAX_TRANSFORMATION_DEPTH;
  private static final SubLSymbol $kw86$CACHE_INFERENCE_RESULTS_;
  private static final SubLSymbol $kw87$BLOCK_;
  private static final SubLList $list88;
  private static final SubLString $str89$___TMT__S__S____;
  private static final SubLSymbol $kw90$POST_BUILD;
  private static final SubLString $str91$Unknown_output_format__A;
  private static final SubLString $str92$_S____3f___;

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 1449L)
  public static SubLObject transformation_module_test_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 1449L)
  public static SubLObject transformation_module_test_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $transformation_module_test_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 1449L)
  public static SubLObject tmt_hl_module(final SubLObject v_object)
  {
    assert NIL != transformation_module_test_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 1449L)
  public static SubLObject tmt_id(final SubLObject v_object)
  {
    assert NIL != transformation_module_test_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 1449L)
  public static SubLObject tmt_sentence(final SubLObject v_object)
  {
    assert NIL != transformation_module_test_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 1449L)
  public static SubLObject tmt_mt(final SubLObject v_object)
  {
    assert NIL != transformation_module_test_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 1449L)
  public static SubLObject tmt_properties(final SubLObject v_object)
  {
    assert NIL != transformation_module_test_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 1449L)
  public static SubLObject tmt_comment(final SubLObject v_object)
  {
    assert NIL != transformation_module_test_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 1449L)
  public static SubLObject tmt_kb(final SubLObject v_object)
  {
    assert NIL != transformation_module_test_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 1449L)
  public static SubLObject tmt_owner(final SubLObject v_object)
  {
    assert NIL != transformation_module_test_p( v_object ) : v_object;
    return v_object.getField9();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 1449L)
  public static SubLObject tmt_bug_number(final SubLObject v_object)
  {
    assert NIL != transformation_module_test_p( v_object ) : v_object;
    return v_object.getField10();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 1449L)
  public static SubLObject tmt_creation_date(final SubLObject v_object)
  {
    assert NIL != transformation_module_test_p( v_object ) : v_object;
    return v_object.getField11();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 1449L)
  public static SubLObject tmt_creator(final SubLObject v_object)
  {
    assert NIL != transformation_module_test_p( v_object ) : v_object;
    return v_object.getField12();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 1449L)
  public static SubLObject tmt_workingP(final SubLObject v_object)
  {
    assert NIL != transformation_module_test_p( v_object ) : v_object;
    return v_object.getField13();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 1449L)
  public static SubLObject _csetf_tmt_hl_module(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != transformation_module_test_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 1449L)
  public static SubLObject _csetf_tmt_id(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != transformation_module_test_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 1449L)
  public static SubLObject _csetf_tmt_sentence(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != transformation_module_test_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 1449L)
  public static SubLObject _csetf_tmt_mt(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != transformation_module_test_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 1449L)
  public static SubLObject _csetf_tmt_properties(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != transformation_module_test_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 1449L)
  public static SubLObject _csetf_tmt_comment(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != transformation_module_test_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 1449L)
  public static SubLObject _csetf_tmt_kb(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != transformation_module_test_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 1449L)
  public static SubLObject _csetf_tmt_owner(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != transformation_module_test_p( v_object ) : v_object;
    return v_object.setField9( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 1449L)
  public static SubLObject _csetf_tmt_bug_number(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != transformation_module_test_p( v_object ) : v_object;
    return v_object.setField10( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 1449L)
  public static SubLObject _csetf_tmt_creation_date(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != transformation_module_test_p( v_object ) : v_object;
    return v_object.setField11( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 1449L)
  public static SubLObject _csetf_tmt_creator(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != transformation_module_test_p( v_object ) : v_object;
    return v_object.setField12( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 1449L)
  public static SubLObject _csetf_tmt_workingP(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != transformation_module_test_p( v_object ) : v_object;
    return v_object.setField13( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 1449L)
  public static SubLObject make_transformation_module_test(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $transformation_module_test_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw33$HL_MODULE ) )
      {
        _csetf_tmt_hl_module( v_new, current_value );
      }
      else if( pcase_var.eql( $kw34$ID ) )
      {
        _csetf_tmt_id( v_new, current_value );
      }
      else if( pcase_var.eql( $kw35$SENTENCE ) )
      {
        _csetf_tmt_sentence( v_new, current_value );
      }
      else if( pcase_var.eql( $kw36$MT ) )
      {
        _csetf_tmt_mt( v_new, current_value );
      }
      else if( pcase_var.eql( $kw37$PROPERTIES ) )
      {
        _csetf_tmt_properties( v_new, current_value );
      }
      else if( pcase_var.eql( $kw38$COMMENT ) )
      {
        _csetf_tmt_comment( v_new, current_value );
      }
      else if( pcase_var.eql( $kw39$KB ) )
      {
        _csetf_tmt_kb( v_new, current_value );
      }
      else if( pcase_var.eql( $kw40$OWNER ) )
      {
        _csetf_tmt_owner( v_new, current_value );
      }
      else if( pcase_var.eql( $kw41$BUG_NUMBER ) )
      {
        _csetf_tmt_bug_number( v_new, current_value );
      }
      else if( pcase_var.eql( $kw42$CREATION_DATE ) )
      {
        _csetf_tmt_creation_date( v_new, current_value );
      }
      else if( pcase_var.eql( $kw43$CREATOR ) )
      {
        _csetf_tmt_creator( v_new, current_value );
      }
      else if( pcase_var.eql( $kw44$WORKING_ ) )
      {
        _csetf_tmt_workingP( v_new, current_value );
      }
      else
      {
        Errors.error( $str45$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 1449L)
  public static SubLObject visit_defstruct_transformation_module_test(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw46$BEGIN, $sym47$MAKE_TRANSFORMATION_MODULE_TEST, TWELVE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw48$SLOT, $kw33$HL_MODULE, tmt_hl_module( obj ) );
    Functions.funcall( visitor_fn, obj, $kw48$SLOT, $kw34$ID, tmt_id( obj ) );
    Functions.funcall( visitor_fn, obj, $kw48$SLOT, $kw35$SENTENCE, tmt_sentence( obj ) );
    Functions.funcall( visitor_fn, obj, $kw48$SLOT, $kw36$MT, tmt_mt( obj ) );
    Functions.funcall( visitor_fn, obj, $kw48$SLOT, $kw37$PROPERTIES, tmt_properties( obj ) );
    Functions.funcall( visitor_fn, obj, $kw48$SLOT, $kw38$COMMENT, tmt_comment( obj ) );
    Functions.funcall( visitor_fn, obj, $kw48$SLOT, $kw39$KB, tmt_kb( obj ) );
    Functions.funcall( visitor_fn, obj, $kw48$SLOT, $kw40$OWNER, tmt_owner( obj ) );
    Functions.funcall( visitor_fn, obj, $kw48$SLOT, $kw41$BUG_NUMBER, tmt_bug_number( obj ) );
    Functions.funcall( visitor_fn, obj, $kw48$SLOT, $kw42$CREATION_DATE, tmt_creation_date( obj ) );
    Functions.funcall( visitor_fn, obj, $kw48$SLOT, $kw43$CREATOR, tmt_creator( obj ) );
    Functions.funcall( visitor_fn, obj, $kw48$SLOT, $kw44$WORKING_, tmt_workingP( obj ) );
    Functions.funcall( visitor_fn, obj, $kw49$END, $sym47$MAKE_TRANSFORMATION_MODULE_TEST, TWELVE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 1449L)
  public static SubLObject visit_defstruct_object_transformation_module_test_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_transformation_module_test( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 1712L)
  public static SubLObject transformation_modules_with_transformation_module_tests()
  {
    SubLObject hl_modules = hash_table_utilities.hash_table_keys( $transformation_module_tests$.getGlobalValue() );
    hl_modules = Sort.sort( hl_modules, Symbols.symbol_function( $sym53$TERM__ ), Symbols.symbol_function( $sym54$HL_MODULE_NAME ) );
    return hl_modules;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 2043L)
  public static SubLObject transformation_module_tests(final SubLObject hl_module)
  {
    SubLObject tests = conses_high.copy_list( Hashtables.gethash( hl_module, $transformation_module_tests$.getGlobalValue(), UNPROVIDED ) );
    tests = Sort.sort( tests, Symbols.symbol_function( $sym55$_ ), Symbols.symbol_function( $sym11$TMT_ID ) );
    return tests;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 2317L)
  public static SubLObject some_transformation_module_testsP(final SubLObject hl_module)
  {
    return list_utilities.sublisp_boolean( Hashtables.gethash( hl_module, $transformation_module_tests$.getGlobalValue(), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 2525L)
  public static SubLObject transformation_module_test_name(final SubLObject tmt)
  {
    return ConsesLow.list( inference_modules.hl_module_name( tmt_hl_module( tmt ) ), tmt_id( tmt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 2648L)
  public static SubLObject transformation_module_test_id(final SubLObject tmt)
  {
    return tmt_id( tmt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 2725L)
  public static SubLObject transformation_module_test_mt(final SubLObject tmt)
  {
    return tmt_mt( tmt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 2802L)
  public static SubLObject transformation_module_test_sentence(final SubLObject tmt)
  {
    return tmt_sentence( tmt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 2891L)
  public static SubLObject transformation_module_test_owner(final SubLObject tmt)
  {
    return tmt_owner( tmt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 2974L)
  public static SubLObject transformation_module_test_comment(final SubLObject tmt)
  {
    return tmt_comment( tmt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 3061L)
  public static SubLObject transformation_module_test_kb(final SubLObject tmt)
  {
    return tmt_kb( tmt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 3138L)
  public static SubLObject transformation_module_test_workingP(final SubLObject tmt)
  {
    return tmt_workingP( tmt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 3227L)
  public static SubLObject transformation_module_test_mentions_invalid_constantP(final SubLObject tmt)
  {
    return makeBoolean( NIL != list_utilities.tree_find_if( Symbols.symbol_function( $sym56$INVALID_CONSTANT_ ), transformation_module_test_mt( tmt ), UNPROVIDED ) || NIL != list_utilities.tree_find_if( Symbols
        .symbol_function( $sym56$INVALID_CONSTANT_ ), transformation_module_test_sentence( tmt ), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 3474L)
  public static SubLObject transformation_module_test_invalid_constants(final SubLObject tmt)
  {
    return Sequences.remove_duplicates( ConsesLow.append( cycl_utilities.expression_gather( transformation_module_test_mt( tmt ), $sym56$INVALID_CONSTANT_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), cycl_utilities
        .expression_gather( transformation_module_test_sentence( tmt ), $sym56$INVALID_CONSTANT_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 3744L)
  public static SubLObject define_transformation_module_test(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name = NIL;
    SubLObject id = NIL;
    SubLObject sentence = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list57 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list57 );
    id = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list57 );
    sentence = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list57 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list57 );
      if( NIL == conses_high.member( current_$1, $list58, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw59$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list57 );
    }
    final SubLObject mt_tail = cdestructuring_bind.property_list_member( $kw36$MT, current );
    final SubLObject mt = ( NIL != mt_tail ) ? conses_high.cadr( mt_tail ) : $const60$EverythingPSC;
    final SubLObject properties_tail = cdestructuring_bind.property_list_member( $kw37$PROPERTIES, current );
    final SubLObject v_properties = ( NIL != properties_tail ) ? conses_high.cadr( properties_tail ) : NIL;
    final SubLObject kb_tail = cdestructuring_bind.property_list_member( $kw39$KB, current );
    final SubLObject kb = ( NIL != kb_tail ) ? conses_high.cadr( kb_tail ) : $kw61$TINY;
    final SubLObject owner_tail = cdestructuring_bind.property_list_member( $kw40$OWNER, current );
    final SubLObject owner = ( NIL != owner_tail ) ? conses_high.cadr( owner_tail ) : NIL;
    final SubLObject comment_tail = cdestructuring_bind.property_list_member( $kw38$COMMENT, current );
    final SubLObject comment = ( NIL != comment_tail ) ? conses_high.cadr( comment_tail ) : NIL;
    final SubLObject bug_tail = cdestructuring_bind.property_list_member( $kw62$BUG, current );
    final SubLObject bug = ( NIL != bug_tail ) ? conses_high.cadr( bug_tail ) : NIL;
    final SubLObject created_tail = cdestructuring_bind.property_list_member( $kw63$CREATED, current );
    final SubLObject created = ( NIL != created_tail ) ? conses_high.cadr( created_tail ) : NIL;
    final SubLObject creator_tail = cdestructuring_bind.property_list_member( $kw43$CREATOR, current );
    final SubLObject creator = ( NIL != creator_tail ) ? conses_high.cadr( creator_tail ) : NIL;
    final SubLObject workingP_tail = cdestructuring_bind.property_list_member( $kw44$WORKING_, current );
    final SubLObject workingP = ( NIL != workingP_tail ) ? conses_high.cadr( workingP_tail ) : T;
    return ConsesLow.list( new SubLObject[] { $sym64$DEFINE_TRANSFORMATION_MODULE_TEST_INT, name, id, sentence, mt, v_properties, kb, owner, comment, bug, created, creator, workingP
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 4178L)
  public static SubLObject define_transformation_module_test_int(final SubLObject name, final SubLObject id, final SubLObject sentence, final SubLObject mt, final SubLObject v_properties, final SubLObject kb,
      final SubLObject owner, final SubLObject comment, final SubLObject bug_number, final SubLObject creation_date, final SubLObject creator, final SubLObject workingP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != comment && !assertionsDisabledInClass && NIL == Types.stringp( comment ) )
    {
      throw new AssertionError( comment );
    }
    assert NIL != cyc_testing.cyc_test_kb_p( kb ) : kb;
    assert NIL != inference_testing.inference_test_owner_p( owner ) : owner;
    if( NIL != bug_number && !assertionsDisabledInClass && NIL == subl_promotions.positive_integer_p( bug_number ) )
    {
      throw new AssertionError( bug_number );
    }
    if( NIL != creation_date && !assertionsDisabledInClass && NIL == numeric_date_utilities.universal_date_p( creation_date ) )
    {
      throw new AssertionError( creation_date );
    }
    if( NIL != creator && !assertionsDisabledInClass && NIL == Types.stringp( creator ) )
    {
      throw new AssertionError( creator );
    }
    assert NIL != Types.booleanp( workingP ) : workingP;
    final SubLObject hl_module = inference_modules.find_hl_module_by_name( name );
    if( NIL != inference_modules.transformation_module_p( hl_module ) )
    {
      final SubLObject test = make_transformation_module_test( ConsesLow.list( new SubLObject[] { $kw33$HL_MODULE, hl_module, $kw34$ID, id, $kw35$SENTENCE, sentence, $kw36$MT, mt, $kw37$PROPERTIES, v_properties,
        $kw39$KB, kb, $kw40$OWNER, owner, $kw38$COMMENT, comment, $kw41$BUG_NUMBER, bug_number, $kw42$CREATION_DATE, creation_date, $kw43$CREATOR, creator, $kw44$WORKING_, workingP
      } ) );
      SubLObject existing_tests = Hashtables.gethash( hl_module, $transformation_module_tests$.getGlobalValue(), UNPROVIDED );
      existing_tests = Sequences.delete( id, existing_tests, Symbols.symbol_function( EQL ), Symbols.symbol_function( $sym11$TMT_ID ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
      existing_tests = ConsesLow.cons( test, existing_tests );
      Hashtables.sethash( hl_module, $transformation_module_tests$.getGlobalValue(), existing_tests );
      cyc_testing.new_cyc_test( cyc_testing.$cyc_test_filename$.getDynamicValue( thread ), test );
      return test;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 5654L)
  public static SubLObject clear_transformation_module_tests()
  {
    Hashtables.clrhash( $transformation_module_tests$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 5762L)
  public static SubLObject run_all_transformation_module_tests(SubLObject output_format, SubLObject stream, SubLObject run_tiny_kb_tests_in_full_kbP, SubLObject return_test_runsP)
  {
    if( output_format == UNPROVIDED )
    {
      output_format = $kw72$STANDARD;
    }
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    if( run_tiny_kb_tests_in_full_kbP == UNPROVIDED )
    {
      run_tiny_kb_tests_in_full_kbP = cyc_testing.$run_tiny_kb_tests_in_full_kbP$.getDynamicValue();
    }
    if( return_test_runsP == UNPROVIDED )
    {
      return_test_runsP = NIL;
    }
    assert NIL != cyc_testing.cyc_test_output_format_p( output_format ) : output_format;
    return cyc_testing.run_all_loaded_cyc_tests( stream, $kw74$TERSE, NIL, output_format, run_tiny_kb_tests_in_full_kbP, NIL, return_test_runsP, $kw75$TMT, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
        UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 6763L)
  public static SubLObject run_transformation_module_tests_browsable(final SubLObject name, SubLObject output_format, SubLObject stream)
  {
    if( output_format == UNPROVIDED )
    {
      output_format = $kw72$STANDARD;
    }
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    return run_transformation_module_tests( name, output_format, stream, T, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 6978L)
  public static SubLObject run_transformation_module_tests_blockingP(final SubLObject name, SubLObject output_format, SubLObject stream)
  {
    if( output_format == UNPROVIDED )
    {
      output_format = $kw72$STANDARD;
    }
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    return run_transformation_module_tests( name, output_format, stream, T, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 7195L)
  public static SubLObject run_transformation_module_tests(final SubLObject name, SubLObject output_format, SubLObject stream, SubLObject browsableP, SubLObject blockP)
  {
    if( output_format == UNPROVIDED )
    {
      output_format = $kw72$STANDARD;
    }
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    if( browsableP == UNPROVIDED )
    {
      browsableP = NIL;
    }
    if( blockP == UNPROVIDED )
    {
      blockP = NIL;
    }
    assert NIL != cyc_testing.cyc_test_output_format_p( output_format ) : output_format;
    final SubLObject hl_module = inference_modules.find_hl_module_by_name( name );
    if( NIL != inference_modules.transformation_module_p( hl_module ) )
    {
      return run_transformation_module_tests_int( hl_module, output_format, stream, browsableP, blockP );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 8061L)
  public static SubLObject run_transformation_module_tests_int(final SubLObject hl_module, final SubLObject output_format, final SubLObject stream, final SubLObject browsableP, final SubLObject blockP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = $kw76$SUCCESS;
    SubLObject test_runs = NIL;
    SubLObject cdolist_list_var = transformation_module_tests( hl_module );
    SubLObject tmt = NIL;
    tmt = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      thread.resetMultipleValues();
      final SubLObject partial_result = run_transformation_module_test( tmt, output_format, stream, browsableP, blockP );
      final SubLObject test_run = thread.secondMultipleValue();
      thread.resetMultipleValues();
      test_runs = ConsesLow.cons( test_run, test_runs );
      if( partial_result != $kw76$SUCCESS )
      {
        result = partial_result;
      }
      cdolist_list_var = cdolist_list_var.rest();
      tmt = cdolist_list_var.first();
    }
    return Values.values( result, Sequences.nreverse( test_runs ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 8570L)
  public static SubLObject run_transformation_module_test_number_browsable(final SubLObject name, final SubLObject number, SubLObject output_format, SubLObject stream)
  {
    if( output_format == UNPROVIDED )
    {
      output_format = $kw72$STANDARD;
    }
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    return run_transformation_module_test_number( name, number, output_format, stream, T, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 8795L)
  public static SubLObject run_transformation_module_test_number_blocking(final SubLObject name, final SubLObject number, SubLObject output_format, SubLObject stream)
  {
    if( output_format == UNPROVIDED )
    {
      output_format = $kw72$STANDARD;
    }
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    return run_transformation_module_test_number( name, number, output_format, stream, T, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 9021L)
  public static SubLObject run_transformation_module_test_number(final SubLObject name, final SubLObject number, SubLObject output_format, SubLObject stream, SubLObject browsableP, SubLObject blockP)
  {
    if( output_format == UNPROVIDED )
    {
      output_format = $kw72$STANDARD;
    }
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    if( browsableP == UNPROVIDED )
    {
      browsableP = NIL;
    }
    if( blockP == UNPROVIDED )
    {
      blockP = NIL;
    }
    assert NIL != cyc_testing.cyc_test_output_format_p( output_format ) : output_format;
    final SubLObject hl_module = inference_modules.find_hl_module_by_name( name );
    SubLObject test = NIL;
    if( NIL != inference_modules.transformation_module_p( hl_module ) && NIL == test )
    {
      SubLObject csome_list_var = transformation_module_tests( hl_module );
      SubLObject tmt = NIL;
      tmt = csome_list_var.first();
      while ( NIL == test && NIL != csome_list_var)
      {
        if( number.numE( tmt_id( tmt ) ) )
        {
          test = tmt;
        }
        csome_list_var = csome_list_var.rest();
        tmt = csome_list_var.first();
      }
    }
    return run_transformation_module_test( test, output_format, stream, browsableP, blockP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 9602L)
  public static SubLObject run_transformation_module_test(final SubLObject tmt, SubLObject output_format, SubLObject stream, SubLObject browsableP, SubLObject blockP)
  {
    if( output_format == UNPROVIDED )
    {
      output_format = $kw72$STANDARD;
    }
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    if( browsableP == UNPROVIDED )
    {
      browsableP = NIL;
    }
    if( blockP == UNPROVIDED )
    {
      blockP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != transformation_module_test_p( tmt ) : tmt;
    assert NIL != cyc_testing.cyc_test_output_format_p( output_format ) : output_format;
    final SubLObject name = transformation_module_test_name( tmt );
    SubLObject time = NIL;
    SubLObject result = NIL;
    if( NIL == run_transformation_module_testP( tmt ) )
    {
      result = $kw77$NOT_RUN;
    }
    else if( NIL != transformation_module_test_mentions_invalid_constantP( tmt ) )
    {
      result = $kw78$INVALID;
    }
    else
    {
      final SubLObject hl_module = tmt_hl_module( tmt );
      final SubLObject sentence = tmt_sentence( tmt );
      final SubLObject mt = tmt_mt( tmt );
      final SubLObject v_properties = tmt_properties( tmt );
      final SubLObject _prev_bind_0 = print_high.$print_pretty$.currentBinding( thread );
      try
      {
        print_high.$print_pretty$.bind( NIL, thread );
        print_transformation_test_preamble( tmt, output_format, stream );
        thread.resetMultipleValues();
        final SubLObject result_$2 = run_transformation_module_test_query( hl_module, sentence, mt, v_properties, browsableP, blockP );
        final SubLObject time_$3 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        result = result_$2;
        time = time_$3;
        print_transformation_module_test_result( tmt, result, time, output_format, stream );
      }
      finally
      {
        print_high.$print_pretty$.rebind( _prev_bind_0, thread );
      }
    }
    final SubLObject test_run = cyc_testing.new_cyc_test_run( $kw75$TMT, name, result, time );
    return Values.values( result, test_run );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 11105L)
  public static SubLObject run_transformation_module_testP(final SubLObject tmt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject test_kb = tmt_kb( tmt );
    if( NIL == inference_testing.kb_matches_expectationsP( test_kb, cyc_testing.$run_tiny_kb_tests_in_full_kbP$.getDynamicValue( thread ) ) )
    {
      return NIL;
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 11505L)
  public static SubLObject run_transformation_module_test_query(final SubLObject hl_module, final SubLObject sentence, final SubLObject mt, final SubLObject v_properties, final SubLObject browsableP,
      final SubLObject blockP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_answer = $kw79$ERROR;
    SubLObject time = NIL;
    SubLObject ignore_errors_tag = NIL;
    try
    {
      thread.throwStack.push( $kw80$IGNORE_ERRORS_TARGET );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( Symbols.symbol_function( $sym81$IGNORE_ERRORS_HANDLER ), thread );
        try
        {
          thread.resetMultipleValues();
          final SubLObject inference = transformation_module_test_query_inference( sentence, mt, v_properties, blockP );
          final SubLObject inference_time = thread.secondMultipleValue();
          thread.resetMultipleValues();
          time = inference_time;
          if( NIL != inference_utilities.inference_some_proof_uses_transformation_moduleP( inference, hl_module ) )
          {
            v_answer = $kw76$SUCCESS;
          }
          else
          {
            v_answer = $kw82$FAILURE;
          }
          if( NIL == browsableP )
          {
            inference_datastructures_inference.destroy_inference_and_problem_store( inference );
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
      ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw80$IGNORE_ERRORS_TARGET );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return Values.values( v_answer, time );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 12106L)
  public static SubLObject transformation_module_test_query_inference(final SubLObject sentence, SubLObject mt, SubLObject v_properties, SubLObject blockP)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( v_properties == UNPROVIDED )
    {
      v_properties = NIL;
    }
    if( blockP == UNPROVIDED )
    {
      blockP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject conditionalP = inference_strategist.inference_conditional_sentence_p( sentence );
    v_properties = conses_high.copy_list( v_properties );
    v_properties = conses_high.putf( v_properties, $kw83$CONDITIONAL_SENTENCE_, conditionalP );
    v_properties = conses_high.putf( v_properties, $kw84$BROWSABLE_, T );
    v_properties = conses_high.putf( v_properties, $kw85$MAX_TRANSFORMATION_DEPTH, ONE_INTEGER );
    v_properties = conses_high.putf( v_properties, $kw86$CACHE_INFERENCE_RESULTS_, NIL );
    if( NIL != blockP )
    {
      v_properties = conses_high.putf( v_properties, $kw87$BLOCK_, T );
      v_properties = list_utilities.nmerge_plist( v_properties, $list88 );
    }
    SubLObject time = NIL;
    SubLObject result = NIL;
    SubLObject halt_reason = NIL;
    SubLObject inference = NIL;
    final SubLObject time_var = Time.get_internal_real_time();
    thread.resetMultipleValues();
    final SubLObject result_$4 = inference_kernel.new_cyc_query( sentence, mt, v_properties );
    final SubLObject halt_reason_$5 = thread.secondMultipleValue();
    final SubLObject inference_$6 = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    result = result_$4;
    halt_reason = halt_reason_$5;
    inference = inference_$6;
    time = Numbers.divide( Numbers.subtract( Time.get_internal_real_time(), time_var ), time_high.$internal_time_units_per_second$.getGlobalValue() );
    return Values.values( inference, time );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 13087L)
  public static SubLObject print_transformation_test_preamble(final SubLObject tmt, final SubLObject output_format, final SubLObject stream)
  {
    if( output_format.eql( $kw72$STANDARD ) )
    {
      final SubLObject hl_module = tmt_hl_module( tmt );
      final SubLObject name = inference_modules.hl_module_name( hl_module );
      final SubLObject id = tmt_id( tmt );
      PrintLow.format( stream, $str89$___TMT__S__S____, name, id );
      streams_high.force_output( stream );
    }
    else if( !output_format.eql( $kw90$POST_BUILD ) )
    {
      PrintLow.format( stream, $str91$Unknown_output_format__A, output_format );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 13512L)
  public static SubLObject print_transformation_module_test_result(final SubLObject tmt, final SubLObject result, final SubLObject time, final SubLObject output_format, final SubLObject stream)
  {
    if( output_format.eql( $kw72$STANDARD ) )
    {
      PrintLow.format( stream, $str92$_S____3f___, result, time );
      streams_high.force_output( stream );
    }
    else if( output_format.eql( $kw90$POST_BUILD ) )
    {
      final SubLObject hl_module = tmt_hl_module( tmt );
      final SubLObject name = inference_modules.hl_module_name( hl_module );
      final SubLObject id = tmt_id( tmt );
      final SubLObject owner = tmt_owner( tmt );
      cyc_testing.print_post_build_test_summary( stream, result, $kw75$TMT, ConsesLow.list( name, id ), time, owner );
    }
    else
    {
      PrintLow.format( stream, $str91$Unknown_output_format__A, output_format );
    }
    return NIL;
  }

  public static SubLObject declare_transformation_module_tests_file()
  {
    SubLFiles.declareFunction( me, "transformation_module_test_print_function_trampoline", "TRANSFORMATION-MODULE-TEST-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "transformation_module_test_p", "TRANSFORMATION-MODULE-TEST-P", 1, 0, false );
    new $transformation_module_test_p$UnaryFunction();
    SubLFiles.declareFunction( me, "tmt_hl_module", "TMT-HL-MODULE", 1, 0, false );
    SubLFiles.declareFunction( me, "tmt_id", "TMT-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "tmt_sentence", "TMT-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "tmt_mt", "TMT-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "tmt_properties", "TMT-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "tmt_comment", "TMT-COMMENT", 1, 0, false );
    SubLFiles.declareFunction( me, "tmt_kb", "TMT-KB", 1, 0, false );
    SubLFiles.declareFunction( me, "tmt_owner", "TMT-OWNER", 1, 0, false );
    SubLFiles.declareFunction( me, "tmt_bug_number", "TMT-BUG-NUMBER", 1, 0, false );
    SubLFiles.declareFunction( me, "tmt_creation_date", "TMT-CREATION-DATE", 1, 0, false );
    SubLFiles.declareFunction( me, "tmt_creator", "TMT-CREATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "tmt_workingP", "TMT-WORKING?", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tmt_hl_module", "_CSETF-TMT-HL-MODULE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tmt_id", "_CSETF-TMT-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tmt_sentence", "_CSETF-TMT-SENTENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tmt_mt", "_CSETF-TMT-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tmt_properties", "_CSETF-TMT-PROPERTIES", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tmt_comment", "_CSETF-TMT-COMMENT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tmt_kb", "_CSETF-TMT-KB", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tmt_owner", "_CSETF-TMT-OWNER", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tmt_bug_number", "_CSETF-TMT-BUG-NUMBER", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tmt_creation_date", "_CSETF-TMT-CREATION-DATE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tmt_creator", "_CSETF-TMT-CREATOR", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tmt_workingP", "_CSETF-TMT-WORKING?", 2, 0, false );
    SubLFiles.declareFunction( me, "make_transformation_module_test", "MAKE-TRANSFORMATION-MODULE-TEST", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_transformation_module_test", "VISIT-DEFSTRUCT-TRANSFORMATION-MODULE-TEST", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_transformation_module_test_method", "VISIT-DEFSTRUCT-OBJECT-TRANSFORMATION-MODULE-TEST-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "transformation_modules_with_transformation_module_tests", "TRANSFORMATION-MODULES-WITH-TRANSFORMATION-MODULE-TESTS", 0, 0, false );
    SubLFiles.declareFunction( me, "transformation_module_tests", "TRANSFORMATION-MODULE-TESTS", 1, 0, false );
    SubLFiles.declareFunction( me, "some_transformation_module_testsP", "SOME-TRANSFORMATION-MODULE-TESTS?", 1, 0, false );
    SubLFiles.declareFunction( me, "transformation_module_test_name", "TRANSFORMATION-MODULE-TEST-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "transformation_module_test_id", "TRANSFORMATION-MODULE-TEST-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "transformation_module_test_mt", "TRANSFORMATION-MODULE-TEST-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "transformation_module_test_sentence", "TRANSFORMATION-MODULE-TEST-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "transformation_module_test_owner", "TRANSFORMATION-MODULE-TEST-OWNER", 1, 0, false );
    SubLFiles.declareFunction( me, "transformation_module_test_comment", "TRANSFORMATION-MODULE-TEST-COMMENT", 1, 0, false );
    SubLFiles.declareFunction( me, "transformation_module_test_kb", "TRANSFORMATION-MODULE-TEST-KB", 1, 0, false );
    SubLFiles.declareFunction( me, "transformation_module_test_workingP", "TRANSFORMATION-MODULE-TEST-WORKING?", 1, 0, false );
    SubLFiles.declareFunction( me, "transformation_module_test_mentions_invalid_constantP", "TRANSFORMATION-MODULE-TEST-MENTIONS-INVALID-CONSTANT?", 1, 0, false );
    SubLFiles.declareFunction( me, "transformation_module_test_invalid_constants", "TRANSFORMATION-MODULE-TEST-INVALID-CONSTANTS", 1, 0, false );
    SubLFiles.declareMacro( me, "define_transformation_module_test", "DEFINE-TRANSFORMATION-MODULE-TEST" );
    SubLFiles.declareFunction( me, "define_transformation_module_test_int", "DEFINE-TRANSFORMATION-MODULE-TEST-INT", 12, 0, false );
    SubLFiles.declareFunction( me, "clear_transformation_module_tests", "CLEAR-TRANSFORMATION-MODULE-TESTS", 0, 0, false );
    SubLFiles.declareFunction( me, "run_all_transformation_module_tests", "RUN-ALL-TRANSFORMATION-MODULE-TESTS", 0, 4, false );
    SubLFiles.declareFunction( me, "run_transformation_module_tests_browsable", "RUN-TRANSFORMATION-MODULE-TESTS-BROWSABLE", 1, 2, false );
    SubLFiles.declareFunction( me, "run_transformation_module_tests_blockingP", "RUN-TRANSFORMATION-MODULE-TESTS-BLOCKING?", 1, 2, false );
    SubLFiles.declareFunction( me, "run_transformation_module_tests", "RUN-TRANSFORMATION-MODULE-TESTS", 1, 4, false );
    SubLFiles.declareFunction( me, "run_transformation_module_tests_int", "RUN-TRANSFORMATION-MODULE-TESTS-INT", 5, 0, false );
    SubLFiles.declareFunction( me, "run_transformation_module_test_number_browsable", "RUN-TRANSFORMATION-MODULE-TEST-NUMBER-BROWSABLE", 2, 2, false );
    SubLFiles.declareFunction( me, "run_transformation_module_test_number_blocking", "RUN-TRANSFORMATION-MODULE-TEST-NUMBER-BLOCKING", 2, 2, false );
    SubLFiles.declareFunction( me, "run_transformation_module_test_number", "RUN-TRANSFORMATION-MODULE-TEST-NUMBER", 2, 4, false );
    SubLFiles.declareFunction( me, "run_transformation_module_test", "RUN-TRANSFORMATION-MODULE-TEST", 1, 4, false );
    SubLFiles.declareFunction( me, "run_transformation_module_testP", "RUN-TRANSFORMATION-MODULE-TEST?", 1, 0, false );
    SubLFiles.declareFunction( me, "run_transformation_module_test_query", "RUN-TRANSFORMATION-MODULE-TEST-QUERY", 6, 0, false );
    SubLFiles.declareFunction( me, "transformation_module_test_query_inference", "TRANSFORMATION-MODULE-TEST-QUERY-INFERENCE", 1, 3, false );
    SubLFiles.declareFunction( me, "print_transformation_test_preamble", "PRINT-TRANSFORMATION-TEST-PREAMBLE", 3, 0, false );
    SubLFiles.declareFunction( me, "print_transformation_module_test_result", "PRINT-TRANSFORMATION-MODULE-TEST-RESULT", 5, 0, false );
    return NIL;
  }

  public static SubLObject init_transformation_module_tests_file()
  {
    $dtp_transformation_module_test$ = SubLFiles.defconstant( "*DTP-TRANSFORMATION-MODULE-TEST*", $sym0$TRANSFORMATION_MODULE_TEST );
    $transformation_module_tests$ = SubLFiles.deflexical( "*TRANSFORMATION-MODULE-TESTS*", maybeDefault( $sym51$_TRANSFORMATION_MODULE_TESTS_, $transformation_module_tests$, () -> ( Hashtables.make_hash_table(
        $int52$100, UNPROVIDED, UNPROVIDED ) ) ) );
    return NIL;
  }

  public static SubLObject setup_transformation_module_tests_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_transformation_module_test$.getGlobalValue(), Symbols.symbol_function(
        $sym7$TRANSFORMATION_MODULE_TEST_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list8 );
    Structures.def_csetf( $sym9$TMT_HL_MODULE, $sym10$_CSETF_TMT_HL_MODULE );
    Structures.def_csetf( $sym11$TMT_ID, $sym12$_CSETF_TMT_ID );
    Structures.def_csetf( $sym13$TMT_SENTENCE, $sym14$_CSETF_TMT_SENTENCE );
    Structures.def_csetf( $sym15$TMT_MT, $sym16$_CSETF_TMT_MT );
    Structures.def_csetf( $sym17$TMT_PROPERTIES, $sym18$_CSETF_TMT_PROPERTIES );
    Structures.def_csetf( $sym19$TMT_COMMENT, $sym20$_CSETF_TMT_COMMENT );
    Structures.def_csetf( $sym21$TMT_KB, $sym22$_CSETF_TMT_KB );
    Structures.def_csetf( $sym23$TMT_OWNER, $sym24$_CSETF_TMT_OWNER );
    Structures.def_csetf( $sym25$TMT_BUG_NUMBER, $sym26$_CSETF_TMT_BUG_NUMBER );
    Structures.def_csetf( $sym27$TMT_CREATION_DATE, $sym28$_CSETF_TMT_CREATION_DATE );
    Structures.def_csetf( $sym29$TMT_CREATOR, $sym30$_CSETF_TMT_CREATOR );
    Structures.def_csetf( $sym31$TMT_WORKING_, $sym32$_CSETF_TMT_WORKING_ );
    Equality.identity( $sym0$TRANSFORMATION_MODULE_TEST );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_transformation_module_test$.getGlobalValue(), Symbols.symbol_function(
        $sym50$VISIT_DEFSTRUCT_OBJECT_TRANSFORMATION_MODULE_TEST_METHOD ) );
    subl_macro_promotions.declare_defglobal( $sym51$_TRANSFORMATION_MODULE_TESTS_ );
    access_macros.register_macro_helper( $sym64$DEFINE_TRANSFORMATION_MODULE_TEST_INT, $sym65$DEFINE_TRANSFORMATION_MODULE_TEST );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_transformation_module_tests_file();
  }

  @Override
  public void initializeVariables()
  {
    init_transformation_module_tests_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_transformation_module_tests_file();
  }
  static
  {
    me = new transformation_module_tests();
    $dtp_transformation_module_test$ = null;
    $transformation_module_tests$ = null;
    $sym0$TRANSFORMATION_MODULE_TEST = makeSymbol( "TRANSFORMATION-MODULE-TEST" );
    $sym1$TRANSFORMATION_MODULE_TEST_P = makeSymbol( "TRANSFORMATION-MODULE-TEST-P" );
    $list2 = ConsesLow.list( new SubLObject[] { makeSymbol( "HL-MODULE" ), makeSymbol( "ID" ), makeSymbol( "SENTENCE" ), makeSymbol( "MT" ), makeSymbol( "PROPERTIES" ), makeSymbol( "COMMENT" ), makeSymbol( "KB" ),
      makeSymbol( "OWNER" ), makeSymbol( "BUG-NUMBER" ), makeSymbol( "CREATION-DATE" ), makeSymbol( "CREATOR" ), makeSymbol( "WORKING?" )
    } );
    $list3 = ConsesLow.list( new SubLObject[] { makeKeyword( "HL-MODULE" ), makeKeyword( "ID" ), makeKeyword( "SENTENCE" ), makeKeyword( "MT" ), makeKeyword( "PROPERTIES" ), makeKeyword( "COMMENT" ), makeKeyword( "KB" ),
      makeKeyword( "OWNER" ), makeKeyword( "BUG-NUMBER" ), makeKeyword( "CREATION-DATE" ), makeKeyword( "CREATOR" ), makeKeyword( "WORKING?" )
    } );
    $list4 = ConsesLow.list( new SubLObject[] { makeSymbol( "TMT-HL-MODULE" ), makeSymbol( "TMT-ID" ), makeSymbol( "TMT-SENTENCE" ), makeSymbol( "TMT-MT" ), makeSymbol( "TMT-PROPERTIES" ), makeSymbol( "TMT-COMMENT" ),
      makeSymbol( "TMT-KB" ), makeSymbol( "TMT-OWNER" ), makeSymbol( "TMT-BUG-NUMBER" ), makeSymbol( "TMT-CREATION-DATE" ), makeSymbol( "TMT-CREATOR" ), makeSymbol( "TMT-WORKING?" )
    } );
    $list5 = ConsesLow.list( new SubLObject[] { makeSymbol( "_CSETF-TMT-HL-MODULE" ), makeSymbol( "_CSETF-TMT-ID" ), makeSymbol( "_CSETF-TMT-SENTENCE" ), makeSymbol( "_CSETF-TMT-MT" ), makeSymbol(
        "_CSETF-TMT-PROPERTIES" ), makeSymbol( "_CSETF-TMT-COMMENT" ), makeSymbol( "_CSETF-TMT-KB" ), makeSymbol( "_CSETF-TMT-OWNER" ), makeSymbol( "_CSETF-TMT-BUG-NUMBER" ), makeSymbol( "_CSETF-TMT-CREATION-DATE" ),
      makeSymbol( "_CSETF-TMT-CREATOR" ), makeSymbol( "_CSETF-TMT-WORKING?" )
    } );
    $sym6$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol( "DEFAULT-STRUCT-PRINT-FUNCTION" );
    $sym7$TRANSFORMATION_MODULE_TEST_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "TRANSFORMATION-MODULE-TEST-PRINT-FUNCTION-TRAMPOLINE" );
    $list8 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "TRANSFORMATION-MODULE-TEST-P" ) );
    $sym9$TMT_HL_MODULE = makeSymbol( "TMT-HL-MODULE" );
    $sym10$_CSETF_TMT_HL_MODULE = makeSymbol( "_CSETF-TMT-HL-MODULE" );
    $sym11$TMT_ID = makeSymbol( "TMT-ID" );
    $sym12$_CSETF_TMT_ID = makeSymbol( "_CSETF-TMT-ID" );
    $sym13$TMT_SENTENCE = makeSymbol( "TMT-SENTENCE" );
    $sym14$_CSETF_TMT_SENTENCE = makeSymbol( "_CSETF-TMT-SENTENCE" );
    $sym15$TMT_MT = makeSymbol( "TMT-MT" );
    $sym16$_CSETF_TMT_MT = makeSymbol( "_CSETF-TMT-MT" );
    $sym17$TMT_PROPERTIES = makeSymbol( "TMT-PROPERTIES" );
    $sym18$_CSETF_TMT_PROPERTIES = makeSymbol( "_CSETF-TMT-PROPERTIES" );
    $sym19$TMT_COMMENT = makeSymbol( "TMT-COMMENT" );
    $sym20$_CSETF_TMT_COMMENT = makeSymbol( "_CSETF-TMT-COMMENT" );
    $sym21$TMT_KB = makeSymbol( "TMT-KB" );
    $sym22$_CSETF_TMT_KB = makeSymbol( "_CSETF-TMT-KB" );
    $sym23$TMT_OWNER = makeSymbol( "TMT-OWNER" );
    $sym24$_CSETF_TMT_OWNER = makeSymbol( "_CSETF-TMT-OWNER" );
    $sym25$TMT_BUG_NUMBER = makeSymbol( "TMT-BUG-NUMBER" );
    $sym26$_CSETF_TMT_BUG_NUMBER = makeSymbol( "_CSETF-TMT-BUG-NUMBER" );
    $sym27$TMT_CREATION_DATE = makeSymbol( "TMT-CREATION-DATE" );
    $sym28$_CSETF_TMT_CREATION_DATE = makeSymbol( "_CSETF-TMT-CREATION-DATE" );
    $sym29$TMT_CREATOR = makeSymbol( "TMT-CREATOR" );
    $sym30$_CSETF_TMT_CREATOR = makeSymbol( "_CSETF-TMT-CREATOR" );
    $sym31$TMT_WORKING_ = makeSymbol( "TMT-WORKING?" );
    $sym32$_CSETF_TMT_WORKING_ = makeSymbol( "_CSETF-TMT-WORKING?" );
    $kw33$HL_MODULE = makeKeyword( "HL-MODULE" );
    $kw34$ID = makeKeyword( "ID" );
    $kw35$SENTENCE = makeKeyword( "SENTENCE" );
    $kw36$MT = makeKeyword( "MT" );
    $kw37$PROPERTIES = makeKeyword( "PROPERTIES" );
    $kw38$COMMENT = makeKeyword( "COMMENT" );
    $kw39$KB = makeKeyword( "KB" );
    $kw40$OWNER = makeKeyword( "OWNER" );
    $kw41$BUG_NUMBER = makeKeyword( "BUG-NUMBER" );
    $kw42$CREATION_DATE = makeKeyword( "CREATION-DATE" );
    $kw43$CREATOR = makeKeyword( "CREATOR" );
    $kw44$WORKING_ = makeKeyword( "WORKING?" );
    $str45$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw46$BEGIN = makeKeyword( "BEGIN" );
    $sym47$MAKE_TRANSFORMATION_MODULE_TEST = makeSymbol( "MAKE-TRANSFORMATION-MODULE-TEST" );
    $kw48$SLOT = makeKeyword( "SLOT" );
    $kw49$END = makeKeyword( "END" );
    $sym50$VISIT_DEFSTRUCT_OBJECT_TRANSFORMATION_MODULE_TEST_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-TRANSFORMATION-MODULE-TEST-METHOD" );
    $sym51$_TRANSFORMATION_MODULE_TESTS_ = makeSymbol( "*TRANSFORMATION-MODULE-TESTS*" );
    $int52$100 = makeInteger( 100 );
    $sym53$TERM__ = makeSymbol( "TERM-<" );
    $sym54$HL_MODULE_NAME = makeSymbol( "HL-MODULE-NAME" );
    $sym55$_ = makeSymbol( "<" );
    $sym56$INVALID_CONSTANT_ = makeSymbol( "INVALID-CONSTANT?" );
    $list57 = ConsesLow.list( new SubLObject[] { makeSymbol( "NAME" ), makeSymbol( "ID" ), makeSymbol( "SENTENCE" ), makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "MT" ), constant_handles.reader_make_constant_shell(
        makeString( "EverythingPSC" ) ) ), makeSymbol( "PROPERTIES" ), ConsesLow.list( makeSymbol( "KB" ), makeKeyword( "TINY" ) ), makeSymbol( "OWNER" ), makeSymbol( "COMMENT" ), makeSymbol( "BUG" ), makeSymbol(
            "CREATED" ), makeSymbol( "CREATOR" ), ConsesLow.list( makeSymbol( "WORKING?" ), T )
    } );
    $list58 = ConsesLow.list( new SubLObject[] { makeKeyword( "MT" ), makeKeyword( "PROPERTIES" ), makeKeyword( "KB" ), makeKeyword( "OWNER" ), makeKeyword( "COMMENT" ), makeKeyword( "BUG" ), makeKeyword( "CREATED" ),
      makeKeyword( "CREATOR" ), makeKeyword( "WORKING?" )
    } );
    $kw59$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $const60$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $kw61$TINY = makeKeyword( "TINY" );
    $kw62$BUG = makeKeyword( "BUG" );
    $kw63$CREATED = makeKeyword( "CREATED" );
    $sym64$DEFINE_TRANSFORMATION_MODULE_TEST_INT = makeSymbol( "DEFINE-TRANSFORMATION-MODULE-TEST-INT" );
    $sym65$DEFINE_TRANSFORMATION_MODULE_TEST = makeSymbol( "DEFINE-TRANSFORMATION-MODULE-TEST" );
    $sym66$STRINGP = makeSymbol( "STRINGP" );
    $sym67$CYC_TEST_KB_P = makeSymbol( "CYC-TEST-KB-P" );
    $sym68$INFERENCE_TEST_OWNER_P = makeSymbol( "INFERENCE-TEST-OWNER-P" );
    $sym69$POSITIVE_INTEGER_P = makeSymbol( "POSITIVE-INTEGER-P" );
    $sym70$UNIVERSAL_DATE_P = makeSymbol( "UNIVERSAL-DATE-P" );
    $sym71$BOOLEANP = makeSymbol( "BOOLEANP" );
    $kw72$STANDARD = makeKeyword( "STANDARD" );
    $sym73$CYC_TEST_OUTPUT_FORMAT_P = makeSymbol( "CYC-TEST-OUTPUT-FORMAT-P" );
    $kw74$TERSE = makeKeyword( "TERSE" );
    $kw75$TMT = makeKeyword( "TMT" );
    $kw76$SUCCESS = makeKeyword( "SUCCESS" );
    $kw77$NOT_RUN = makeKeyword( "NOT-RUN" );
    $kw78$INVALID = makeKeyword( "INVALID" );
    $kw79$ERROR = makeKeyword( "ERROR" );
    $kw80$IGNORE_ERRORS_TARGET = makeKeyword( "IGNORE-ERRORS-TARGET" );
    $sym81$IGNORE_ERRORS_HANDLER = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $kw82$FAILURE = makeKeyword( "FAILURE" );
    $kw83$CONDITIONAL_SENTENCE_ = makeKeyword( "CONDITIONAL-SENTENCE?" );
    $kw84$BROWSABLE_ = makeKeyword( "BROWSABLE?" );
    $kw85$MAX_TRANSFORMATION_DEPTH = makeKeyword( "MAX-TRANSFORMATION-DEPTH" );
    $kw86$CACHE_INFERENCE_RESULTS_ = makeKeyword( "CACHE-INFERENCE-RESULTS?" );
    $kw87$BLOCK_ = makeKeyword( "BLOCK?" );
    $list88 = ConsesLow.list( makeKeyword( "PROBABLY-APPROXIMATELY-DONE" ), ONE_INTEGER, makeKeyword( "MAX-TIME" ), NIL );
    $str89$___TMT__S__S____ = makeString( "~&:TMT ~S ~S -> " );
    $kw90$POST_BUILD = makeKeyword( "POST-BUILD" );
    $str91$Unknown_output_format__A = makeString( "Unknown output format ~A" );
    $str92$_S____3f___ = makeString( "~S (~,3f)~%" );
  }

  public static final class $transformation_module_test_native
      extends
        SubLStructNative
  {
    public SubLObject $hl_module;
    public SubLObject $id;
    public SubLObject $sentence;
    public SubLObject $mt;
    public SubLObject $properties;
    public SubLObject $comment;
    public SubLObject $kb;
    public SubLObject $owner;
    public SubLObject $bug_number;
    public SubLObject $creation_date;
    public SubLObject $creator;
    public SubLObject $workingP;
    private static final SubLStructDeclNative structDecl;

    public $transformation_module_test_native()
    {
      this.$hl_module = CommonSymbols.NIL;
      this.$id = CommonSymbols.NIL;
      this.$sentence = CommonSymbols.NIL;
      this.$mt = CommonSymbols.NIL;
      this.$properties = CommonSymbols.NIL;
      this.$comment = CommonSymbols.NIL;
      this.$kb = CommonSymbols.NIL;
      this.$owner = CommonSymbols.NIL;
      this.$bug_number = CommonSymbols.NIL;
      this.$creation_date = CommonSymbols.NIL;
      this.$creator = CommonSymbols.NIL;
      this.$workingP = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $transformation_module_test_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$hl_module;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$id;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$sentence;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$mt;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$properties;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$comment;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$kb;
    }

    @Override
    public SubLObject getField9()
    {
      return this.$owner;
    }

    @Override
    public SubLObject getField10()
    {
      return this.$bug_number;
    }

    @Override
    public SubLObject getField11()
    {
      return this.$creation_date;
    }

    @Override
    public SubLObject getField12()
    {
      return this.$creator;
    }

    @Override
    public SubLObject getField13()
    {
      return this.$workingP;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$hl_module = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$id = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$sentence = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$mt = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$properties = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$comment = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$kb = value;
    }

    @Override
    public SubLObject setField9(final SubLObject value)
    {
      return this.$owner = value;
    }

    @Override
    public SubLObject setField10(final SubLObject value)
    {
      return this.$bug_number = value;
    }

    @Override
    public SubLObject setField11(final SubLObject value)
    {
      return this.$creation_date = value;
    }

    @Override
    public SubLObject setField12(final SubLObject value)
    {
      return this.$creator = value;
    }

    @Override
    public SubLObject setField13(final SubLObject value)
    {
      return this.$workingP = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $transformation_module_test_native.class, $sym0$TRANSFORMATION_MODULE_TEST, $sym1$TRANSFORMATION_MODULE_TEST_P, $list2, $list3, new String[] { "$hl_module", "$id",
        "$sentence", "$mt", "$properties", "$comment", "$kb", "$owner", "$bug_number", "$creation_date", "$creator", "$workingP"
      }, $list4, $list5, $sym6$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $transformation_module_test_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $transformation_module_test_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "TRANSFORMATION-MODULE-TEST-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return transformation_module_test_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 262 ms synthetic
 */