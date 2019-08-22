package com.cyc.cycjava.cycl.inference.browser;

import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;

import com.cyc.cycjava.cycl.cb_utilities;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.cb_kct_test;
import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_kb_query_state
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.browser.cb_kb_query_state";
  public static final String myFingerPrint = "3d743076b42bb8861778f9675c3b125f11763ac0470db5d295a3ab140ef49a91";
  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 849L)
  public static SubLSymbol $dtp_kb_query_state$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 4949L)
  public static SubLSymbol $cb_kb_query_being_saved$;
  private static final SubLSymbol $sym0$KB_QUERY_STATE;
  private static final SubLSymbol $sym1$KB_QUERY_STATE_P;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$DEFAULT_STRUCT_PRINT_FUNCTION;
  private static final SubLSymbol $sym7$KB_QUERY_STATE_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$KB_QUERY_STATE_QUERY_SPEC;
  private static final SubLSymbol $sym10$_CSETF_KB_QUERY_STATE_QUERY_SPEC;
  private static final SubLSymbol $sym11$KB_QUERY_STATE_NAME;
  private static final SubLSymbol $sym12$_CSETF_KB_QUERY_STATE_NAME;
  private static final SubLSymbol $sym13$KB_QUERY_STATE_COMMENTS;
  private static final SubLSymbol $sym14$_CSETF_KB_QUERY_STATE_COMMENTS;
  private static final SubLSymbol $sym15$KB_QUERY_STATE_TEST_STATE;
  private static final SubLSymbol $sym16$_CSETF_KB_QUERY_STATE_TEST_STATE;
  private static final SubLSymbol $sym17$KB_QUERY_STATE_SAVE_MT;
  private static final SubLSymbol $sym18$_CSETF_KB_QUERY_STATE_SAVE_MT;
  private static final SubLSymbol $sym19$KB_QUERY_STATE_INFERENCE;
  private static final SubLSymbol $sym20$_CSETF_KB_QUERY_STATE_INFERENCE;
  private static final SubLSymbol $sym21$KB_QUERY_STATE_SENTENCES;
  private static final SubLSymbol $sym22$_CSETF_KB_QUERY_STATE_SENTENCES;
  private static final SubLSymbol $sym23$KB_QUERY_STATE_QUERY_MTS;
  private static final SubLSymbol $sym24$_CSETF_KB_QUERY_STATE_QUERY_MTS;
  private static final SubLSymbol $sym25$KB_QUERY_STATE_TEMPLATE;
  private static final SubLSymbol $sym26$_CSETF_KB_QUERY_STATE_TEMPLATE;
  private static final SubLSymbol $sym27$KB_QUERY_STATE_TEMPLATE_FOLDER_MT_PAIRS;
  private static final SubLSymbol $sym28$_CSETF_KB_QUERY_STATE_TEMPLATE_FOLDER_MT_PAIRS;
  private static final SubLSymbol $sym29$KB_QUERY_STATE_TEMPLATE_GLOSSES;
  private static final SubLSymbol $sym30$_CSETF_KB_QUERY_STATE_TEMPLATE_GLOSSES;
  private static final SubLSymbol $sym31$KB_QUERY_STATE_QUERY_PROPERTIES;
  private static final SubLSymbol $sym32$_CSETF_KB_QUERY_STATE_QUERY_PROPERTIES;
  private static final SubLSymbol $sym33$KB_QUERY_STATE_NON_EXPLANATORY_SENTENCE;
  private static final SubLSymbol $sym34$_CSETF_KB_QUERY_STATE_NON_EXPLANATORY_SENTENCE;
  private static final SubLSymbol $sym35$KB_QUERY_STATE_MULTIPLE_CHOICE_OPTION_SPECS;
  private static final SubLSymbol $sym36$_CSETF_KB_QUERY_STATE_MULTIPLE_CHOICE_OPTION_SPECS;
  private static final SubLSymbol $kw37$QUERY_SPEC;
  private static final SubLSymbol $kw38$NAME;
  private static final SubLSymbol $kw39$COMMENTS;
  private static final SubLSymbol $kw40$TEST_STATE;
  private static final SubLSymbol $kw41$SAVE_MT;
  private static final SubLSymbol $kw42$INFERENCE;
  private static final SubLSymbol $kw43$SENTENCES;
  private static final SubLSymbol $kw44$QUERY_MTS;
  private static final SubLSymbol $kw45$TEMPLATE;
  private static final SubLSymbol $kw46$TEMPLATE_FOLDER_MT_PAIRS;
  private static final SubLSymbol $kw47$TEMPLATE_GLOSSES;
  private static final SubLSymbol $kw48$QUERY_PROPERTIES;
  private static final SubLSymbol $kw49$NON_EXPLANATORY_SENTENCE;
  private static final SubLSymbol $kw50$MULTIPLE_CHOICE_OPTION_SPECS;
  private static final SubLString $str51$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw52$BEGIN;
  private static final SubLSymbol $sym53$MAKE_KB_QUERY_STATE;
  private static final SubLSymbol $kw54$SLOT;
  private static final SubLSymbol $kw55$END;
  private static final SubLSymbol $sym56$VISIT_DEFSTRUCT_OBJECT_KB_QUERY_STATE_METHOD;
  private static final SubLSymbol $sym57$KBQ_QUERY_SPEC_P;
  private static final SubLSymbol $sym58$KCT_TEST_STATE_P;
  private static final SubLSymbol $sym59$INFERENCE_P;
  private static final SubLSymbol $sym60$_CB_KB_QUERY_BEING_SAVED_;

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 849L)
  public static SubLObject kb_query_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 849L)
  public static SubLObject kb_query_state_p(final SubLObject v_object)
  {
    return ( v_object.getJavaClass() ==$kb_query_state_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 849L)
  public static SubLObject kb_query_state_query_spec(final SubLObject v_object)
  {
    assert NIL != kb_query_state_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 849L)
  public static SubLObject kb_query_state_name(final SubLObject v_object)
  {
    assert NIL != kb_query_state_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 849L)
  public static SubLObject kb_query_state_comments(final SubLObject v_object)
  {
    assert NIL != kb_query_state_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 849L)
  public static SubLObject kb_query_state_test_state(final SubLObject v_object)
  {
    assert NIL != kb_query_state_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 849L)
  public static SubLObject kb_query_state_save_mt(final SubLObject v_object)
  {
    assert NIL != kb_query_state_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 849L)
  public static SubLObject kb_query_state_inference(final SubLObject v_object)
  {
    assert NIL != kb_query_state_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 849L)
  public static SubLObject kb_query_state_sentences(final SubLObject v_object)
  {
    assert NIL != kb_query_state_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 849L)
  public static SubLObject kb_query_state_query_mts(final SubLObject v_object)
  {
    assert NIL != kb_query_state_p( v_object ) : v_object;
    return v_object.getField9();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 849L)
  public static SubLObject kb_query_state_template(final SubLObject v_object)
  {
    assert NIL != kb_query_state_p( v_object ) : v_object;
    return v_object.getField10();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 849L)
  public static SubLObject kb_query_state_template_folder_mt_pairs(final SubLObject v_object)
  {
    assert NIL != kb_query_state_p( v_object ) : v_object;
    return v_object.getField11();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 849L)
  public static SubLObject kb_query_state_template_glosses(final SubLObject v_object)
  {
    assert NIL != kb_query_state_p( v_object ) : v_object;
    return v_object.getField12();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 849L)
  public static SubLObject kb_query_state_query_properties(final SubLObject v_object)
  {
    assert NIL != kb_query_state_p( v_object ) : v_object;
    return v_object.getField13();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 849L)
  public static SubLObject kb_query_state_non_explanatory_sentence(final SubLObject v_object)
  {
    assert NIL != kb_query_state_p( v_object ) : v_object;
    return v_object.getField14();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 849L)
  public static SubLObject kb_query_state_multiple_choice_option_specs(final SubLObject v_object)
  {
    assert NIL != kb_query_state_p( v_object ) : v_object;
    return v_object.getField15();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 849L)
  public static SubLObject _csetf_kb_query_state_query_spec(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != kb_query_state_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 849L)
  public static SubLObject _csetf_kb_query_state_name(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != kb_query_state_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 849L)
  public static SubLObject _csetf_kb_query_state_comments(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != kb_query_state_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 849L)
  public static SubLObject _csetf_kb_query_state_test_state(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != kb_query_state_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 849L)
  public static SubLObject _csetf_kb_query_state_save_mt(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != kb_query_state_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 849L)
  public static SubLObject _csetf_kb_query_state_inference(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != kb_query_state_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 849L)
  public static SubLObject _csetf_kb_query_state_sentences(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != kb_query_state_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 849L)
  public static SubLObject _csetf_kb_query_state_query_mts(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != kb_query_state_p( v_object ) : v_object;
    return v_object.setField9( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 849L)
  public static SubLObject _csetf_kb_query_state_template(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != kb_query_state_p( v_object ) : v_object;
    return v_object.setField10( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 849L)
  public static SubLObject _csetf_kb_query_state_template_folder_mt_pairs(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != kb_query_state_p( v_object ) : v_object;
    return v_object.setField11( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 849L)
  public static SubLObject _csetf_kb_query_state_template_glosses(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != kb_query_state_p( v_object ) : v_object;
    return v_object.setField12( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 849L)
  public static SubLObject _csetf_kb_query_state_query_properties(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != kb_query_state_p( v_object ) : v_object;
    return v_object.setField13( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 849L)
  public static SubLObject _csetf_kb_query_state_non_explanatory_sentence(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != kb_query_state_p( v_object ) : v_object;
    return v_object.setField14( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 849L)
  public static SubLObject _csetf_kb_query_state_multiple_choice_option_specs(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != kb_query_state_p( v_object ) : v_object;
    return v_object.setField15( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 849L)
  public static SubLObject make_kb_query_state(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $kb_query_state_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw37$QUERY_SPEC ) )
      {
        _csetf_kb_query_state_query_spec( v_new, current_value );
      }
      else if( pcase_var.eql( $kw38$NAME ) )
      {
        _csetf_kb_query_state_name( v_new, current_value );
      }
      else if( pcase_var.eql( $kw39$COMMENTS ) )
      {
        _csetf_kb_query_state_comments( v_new, current_value );
      }
      else if( pcase_var.eql( $kw40$TEST_STATE ) )
      {
        _csetf_kb_query_state_test_state( v_new, current_value );
      }
      else if( pcase_var.eql( $kw41$SAVE_MT ) )
      {
        _csetf_kb_query_state_save_mt( v_new, current_value );
      }
      else if( pcase_var.eql( $kw42$INFERENCE ) )
      {
        _csetf_kb_query_state_inference( v_new, current_value );
      }
      else if( pcase_var.eql( $kw43$SENTENCES ) )
      {
        _csetf_kb_query_state_sentences( v_new, current_value );
      }
      else if( pcase_var.eql( $kw44$QUERY_MTS ) )
      {
        _csetf_kb_query_state_query_mts( v_new, current_value );
      }
      else if( pcase_var.eql( $kw45$TEMPLATE ) )
      {
        _csetf_kb_query_state_template( v_new, current_value );
      }
      else if( pcase_var.eql( $kw46$TEMPLATE_FOLDER_MT_PAIRS ) )
      {
        _csetf_kb_query_state_template_folder_mt_pairs( v_new, current_value );
      }
      else if( pcase_var.eql( $kw47$TEMPLATE_GLOSSES ) )
      {
        _csetf_kb_query_state_template_glosses( v_new, current_value );
      }
      else if( pcase_var.eql( $kw48$QUERY_PROPERTIES ) )
      {
        _csetf_kb_query_state_query_properties( v_new, current_value );
      }
      else if( pcase_var.eql( $kw49$NON_EXPLANATORY_SENTENCE ) )
      {
        _csetf_kb_query_state_non_explanatory_sentence( v_new, current_value );
      }
      else if( pcase_var.eql( $kw50$MULTIPLE_CHOICE_OPTION_SPECS ) )
      {
        _csetf_kb_query_state_multiple_choice_option_specs( v_new, current_value );
      }
      else
      {
        Errors.error( $str51$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 849L)
  public static SubLObject visit_defstruct_kb_query_state(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw52$BEGIN, $sym53$MAKE_KB_QUERY_STATE, FOURTEEN_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw54$SLOT, $kw37$QUERY_SPEC, kb_query_state_query_spec( obj ) );
    Functions.funcall( visitor_fn, obj, $kw54$SLOT, $kw38$NAME, kb_query_state_name( obj ) );
    Functions.funcall( visitor_fn, obj, $kw54$SLOT, $kw39$COMMENTS, kb_query_state_comments( obj ) );
    Functions.funcall( visitor_fn, obj, $kw54$SLOT, $kw40$TEST_STATE, kb_query_state_test_state( obj ) );
    Functions.funcall( visitor_fn, obj, $kw54$SLOT, $kw41$SAVE_MT, kb_query_state_save_mt( obj ) );
    Functions.funcall( visitor_fn, obj, $kw54$SLOT, $kw42$INFERENCE, kb_query_state_inference( obj ) );
    Functions.funcall( visitor_fn, obj, $kw54$SLOT, $kw43$SENTENCES, kb_query_state_sentences( obj ) );
    Functions.funcall( visitor_fn, obj, $kw54$SLOT, $kw44$QUERY_MTS, kb_query_state_query_mts( obj ) );
    Functions.funcall( visitor_fn, obj, $kw54$SLOT, $kw45$TEMPLATE, kb_query_state_template( obj ) );
    Functions.funcall( visitor_fn, obj, $kw54$SLOT, $kw46$TEMPLATE_FOLDER_MT_PAIRS, kb_query_state_template_folder_mt_pairs( obj ) );
    Functions.funcall( visitor_fn, obj, $kw54$SLOT, $kw47$TEMPLATE_GLOSSES, kb_query_state_template_glosses( obj ) );
    Functions.funcall( visitor_fn, obj, $kw54$SLOT, $kw48$QUERY_PROPERTIES, kb_query_state_query_properties( obj ) );
    Functions.funcall( visitor_fn, obj, $kw54$SLOT, $kw49$NON_EXPLANATORY_SENTENCE, kb_query_state_non_explanatory_sentence( obj ) );
    Functions.funcall( visitor_fn, obj, $kw54$SLOT, $kw50$MULTIPLE_CHOICE_OPTION_SPECS, kb_query_state_multiple_choice_option_specs( obj ) );
    Functions.funcall( visitor_fn, obj, $kw55$END, $sym53$MAKE_KB_QUERY_STATE, FOURTEEN_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 849L)
  public static SubLObject visit_defstruct_object_kb_query_state_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_kb_query_state( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 1781L)
  public static SubLObject cb_kbq_new_query_state_from_query_spec(final SubLObject query_spec, SubLObject test_state)
  {
    if( test_state == UNPROVIDED )
    {
      test_state = NIL;
    }
    assert NIL != kb_query.kbq_query_spec_p( query_spec ) : query_spec;
    if( NIL != test_state && !assertionsDisabledInClass && NIL == cb_kct_test.kct_test_state_p( test_state ) )
    {
      throw new AssertionError( test_state );
    }
    final SubLObject query_state = make_kb_query_state( UNPROVIDED );
    _csetf_kb_query_state_query_spec( query_state, query_spec );
    _csetf_kb_query_state_name( query_state, cb_utilities.cb_string_for_fort( query_spec ) );
    _csetf_kb_query_state_comments( query_state, kb_query.kbq_comments( query_spec ) );
    _csetf_kb_query_state_test_state( query_state, test_state );
    _csetf_kb_query_state_save_mt( query_state, kb_query.kbq_defining_mt( query_spec ) );
    _csetf_kb_query_state_sentences( query_state, kb_query.kbq_sentences( query_spec ) );
    _csetf_kb_query_state_non_explanatory_sentence( query_state, kb_query.kbq_pragmatics( query_spec ) );
    _csetf_kb_query_state_query_mts( query_state, kb_query.kbq_mts( query_spec ) );
    _csetf_kb_query_state_template( query_state, kb_query.kbq_template( query_spec ) );
    if( NIL != kb_query_state_template( query_state ) )
    {
      _csetf_kb_query_state_template_folder_mt_pairs( query_state, kb_query.template_folders( kb_query_state_template( query_state ) ) );
      _csetf_kb_query_state_template_glosses( query_state, kb_query.kbq_template_glosses( kb_query_state_template( query_state ) ) );
    }
    _csetf_kb_query_state_query_properties( query_state, conses_high.remf( kb_query.kbq_query_properties( query_spec ), $kw49$NON_EXPLANATORY_SENTENCE ) );
    _csetf_kb_query_state_multiple_choice_option_specs( query_state, kb_query.kbq_multiple_choice_option_specs( query_spec ) );
    return query_state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 3340L)
  public static SubLObject cb_kbq_new_query_state_from_inference(final SubLObject inference, SubLObject test_state)
  {
    if( test_state == UNPROVIDED )
    {
      test_state = NIL;
    }
    assert NIL != inference_datastructures_inference.inference_p( inference ) : inference;
    if( NIL != test_state && !assertionsDisabledInClass && NIL == cb_kct_test.kct_test_state_p( test_state ) )
    {
      throw new AssertionError( test_state );
    }
    final SubLObject query_state = make_kb_query_state( UNPROVIDED );
    _csetf_kb_query_state_query_spec( query_state, cb_kb_query.kbq_lookup_query_spec_by_inference( inference ) );
    _csetf_kb_query_state_save_mt( query_state, kb_query.kbq_default_defining_mt() );
    _csetf_kb_query_state_inference( query_state, inference );
    _csetf_kb_query_state_sentences( query_state, ConsesLow.list( inference_datastructures_inference.inference_input_el_query( inference ) ) );
    _csetf_kb_query_state_query_mts( query_state, ConsesLow.list( inference_datastructures_inference.inference_input_mt( inference ) ) );
    _csetf_kb_query_state_query_properties( query_state, inference_datastructures_inference.inference_input_query_properties( inference ) );
    _csetf_kb_query_state_non_explanatory_sentence( query_state, inference_datastructures_inference.inference_input_non_explanatory_el_query( inference ) );
    _csetf_kb_query_state_multiple_choice_option_specs( query_state, NIL );
    return query_state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 4317L)
  public static SubLObject kb_query_state_best_sentence(final SubLObject query_state)
  {
    assert NIL != kb_query_state_p( query_state ) : query_state;
    return kb_query_state_sentences( query_state ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 4477L)
  public static SubLObject kb_query_state_other_sentences(final SubLObject query_state)
  {
    assert NIL != kb_query_state_p( query_state ) : query_state;
    return kb_query_state_sentences( query_state ).rest();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 4639L)
  public static SubLObject kb_query_state_best_mt(final SubLObject query_state)
  {
    assert NIL != kb_query_state_p( query_state ) : query_state;
    return kb_query_state_query_mts( query_state ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 4793L)
  public static SubLObject kb_query_state_other_mts(final SubLObject query_state)
  {
    assert NIL != kb_query_state_p( query_state ) : query_state;
    return kb_query_state_query_mts( query_state ).rest();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 5116L)
  public static SubLObject cb_clear_kb_query_being_saved()
  {
    $cb_kb_query_being_saved$.setDynamicValue( NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 5221L)
  public static SubLObject cb_kb_query_being_saved()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $cb_kb_query_being_saved$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query-state.lisp", position = 5302L)
  public static SubLObject cb_set_kb_query_being_saved(final SubLObject kb_query_state)
  {
    $cb_kb_query_being_saved$.setDynamicValue( kb_query_state );
    return kb_query_state;
  }

  public static SubLObject declare_cb_kb_query_state_file()
  {
    SubLFiles.declareFunction( me, "kb_query_state_print_function_trampoline", "KB-QUERY-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "kb_query_state_p", "KB-QUERY-STATE-P", 1, 0, false );
    new $kb_query_state_p$UnaryFunction();
    SubLFiles.declareFunction( me, "kb_query_state_query_spec", "KB-QUERY-STATE-QUERY-SPEC", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_query_state_name", "KB-QUERY-STATE-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_query_state_comments", "KB-QUERY-STATE-COMMENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_query_state_test_state", "KB-QUERY-STATE-TEST-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_query_state_save_mt", "KB-QUERY-STATE-SAVE-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_query_state_inference", "KB-QUERY-STATE-INFERENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_query_state_sentences", "KB-QUERY-STATE-SENTENCES", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_query_state_query_mts", "KB-QUERY-STATE-QUERY-MTS", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_query_state_template", "KB-QUERY-STATE-TEMPLATE", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_query_state_template_folder_mt_pairs", "KB-QUERY-STATE-TEMPLATE-FOLDER-MT-PAIRS", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_query_state_template_glosses", "KB-QUERY-STATE-TEMPLATE-GLOSSES", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_query_state_query_properties", "KB-QUERY-STATE-QUERY-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_query_state_non_explanatory_sentence", "KB-QUERY-STATE-NON-EXPLANATORY-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_query_state_multiple_choice_option_specs", "KB-QUERY-STATE-MULTIPLE-CHOICE-OPTION-SPECS", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_kb_query_state_query_spec", "_CSETF-KB-QUERY-STATE-QUERY-SPEC", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_kb_query_state_name", "_CSETF-KB-QUERY-STATE-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_kb_query_state_comments", "_CSETF-KB-QUERY-STATE-COMMENTS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_kb_query_state_test_state", "_CSETF-KB-QUERY-STATE-TEST-STATE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_kb_query_state_save_mt", "_CSETF-KB-QUERY-STATE-SAVE-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_kb_query_state_inference", "_CSETF-KB-QUERY-STATE-INFERENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_kb_query_state_sentences", "_CSETF-KB-QUERY-STATE-SENTENCES", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_kb_query_state_query_mts", "_CSETF-KB-QUERY-STATE-QUERY-MTS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_kb_query_state_template", "_CSETF-KB-QUERY-STATE-TEMPLATE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_kb_query_state_template_folder_mt_pairs", "_CSETF-KB-QUERY-STATE-TEMPLATE-FOLDER-MT-PAIRS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_kb_query_state_template_glosses", "_CSETF-KB-QUERY-STATE-TEMPLATE-GLOSSES", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_kb_query_state_query_properties", "_CSETF-KB-QUERY-STATE-QUERY-PROPERTIES", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_kb_query_state_non_explanatory_sentence", "_CSETF-KB-QUERY-STATE-NON-EXPLANATORY-SENTENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_kb_query_state_multiple_choice_option_specs", "_CSETF-KB-QUERY-STATE-MULTIPLE-CHOICE-OPTION-SPECS", 2, 0, false );
    SubLFiles.declareFunction( me, "make_kb_query_state", "MAKE-KB-QUERY-STATE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_kb_query_state", "VISIT-DEFSTRUCT-KB-QUERY-STATE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_kb_query_state_method", "VISIT-DEFSTRUCT-OBJECT-KB-QUERY-STATE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_kbq_new_query_state_from_query_spec", "CB-KBQ-NEW-QUERY-STATE-FROM-QUERY-SPEC", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_kbq_new_query_state_from_inference", "CB-KBQ-NEW-QUERY-STATE-FROM-INFERENCE", 1, 1, false );
    SubLFiles.declareFunction( me, "kb_query_state_best_sentence", "KB-QUERY-STATE-BEST-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_query_state_other_sentences", "KB-QUERY-STATE-OTHER-SENTENCES", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_query_state_best_mt", "KB-QUERY-STATE-BEST-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_query_state_other_mts", "KB-QUERY-STATE-OTHER-MTS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_clear_kb_query_being_saved", "CB-CLEAR-KB-QUERY-BEING-SAVED", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_kb_query_being_saved", "CB-KB-QUERY-BEING-SAVED", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_set_kb_query_being_saved", "CB-SET-KB-QUERY-BEING-SAVED", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_cb_kb_query_state_file()
  {
    $dtp_kb_query_state$ = SubLFiles.defconstant( "*DTP-KB-QUERY-STATE*", $sym0$KB_QUERY_STATE );
    $cb_kb_query_being_saved$ = SubLFiles.defvar( "*CB-KB-QUERY-BEING-SAVED*", NIL );
    return NIL;
  }

  public static SubLObject setup_cb_kb_query_state_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_kb_query_state$.getGlobalValue(), Symbols.symbol_function( $sym7$KB_QUERY_STATE_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list8 );
    Structures.def_csetf( $sym9$KB_QUERY_STATE_QUERY_SPEC, $sym10$_CSETF_KB_QUERY_STATE_QUERY_SPEC );
    Structures.def_csetf( $sym11$KB_QUERY_STATE_NAME, $sym12$_CSETF_KB_QUERY_STATE_NAME );
    Structures.def_csetf( $sym13$KB_QUERY_STATE_COMMENTS, $sym14$_CSETF_KB_QUERY_STATE_COMMENTS );
    Structures.def_csetf( $sym15$KB_QUERY_STATE_TEST_STATE, $sym16$_CSETF_KB_QUERY_STATE_TEST_STATE );
    Structures.def_csetf( $sym17$KB_QUERY_STATE_SAVE_MT, $sym18$_CSETF_KB_QUERY_STATE_SAVE_MT );
    Structures.def_csetf( $sym19$KB_QUERY_STATE_INFERENCE, $sym20$_CSETF_KB_QUERY_STATE_INFERENCE );
    Structures.def_csetf( $sym21$KB_QUERY_STATE_SENTENCES, $sym22$_CSETF_KB_QUERY_STATE_SENTENCES );
    Structures.def_csetf( $sym23$KB_QUERY_STATE_QUERY_MTS, $sym24$_CSETF_KB_QUERY_STATE_QUERY_MTS );
    Structures.def_csetf( $sym25$KB_QUERY_STATE_TEMPLATE, $sym26$_CSETF_KB_QUERY_STATE_TEMPLATE );
    Structures.def_csetf( $sym27$KB_QUERY_STATE_TEMPLATE_FOLDER_MT_PAIRS, $sym28$_CSETF_KB_QUERY_STATE_TEMPLATE_FOLDER_MT_PAIRS );
    Structures.def_csetf( $sym29$KB_QUERY_STATE_TEMPLATE_GLOSSES, $sym30$_CSETF_KB_QUERY_STATE_TEMPLATE_GLOSSES );
    Structures.def_csetf( $sym31$KB_QUERY_STATE_QUERY_PROPERTIES, $sym32$_CSETF_KB_QUERY_STATE_QUERY_PROPERTIES );
    Structures.def_csetf( $sym33$KB_QUERY_STATE_NON_EXPLANATORY_SENTENCE, $sym34$_CSETF_KB_QUERY_STATE_NON_EXPLANATORY_SENTENCE );
    Structures.def_csetf( $sym35$KB_QUERY_STATE_MULTIPLE_CHOICE_OPTION_SPECS, $sym36$_CSETF_KB_QUERY_STATE_MULTIPLE_CHOICE_OPTION_SPECS );
    Equality.identity( $sym0$KB_QUERY_STATE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_kb_query_state$.getGlobalValue(), Symbols.symbol_function( $sym56$VISIT_DEFSTRUCT_OBJECT_KB_QUERY_STATE_METHOD ) );
    utilities_macros.register_html_state_variable( $sym60$_CB_KB_QUERY_BEING_SAVED_ );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_cb_kb_query_state_file();
  }

  @Override
  public void initializeVariables()
  {
    init_cb_kb_query_state_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_cb_kb_query_state_file();
  }
  static
  {
    me = new cb_kb_query_state();
    $dtp_kb_query_state$ = null;
    $cb_kb_query_being_saved$ = null;
    $sym0$KB_QUERY_STATE = makeSymbol( "KB-QUERY-STATE" );
    $sym1$KB_QUERY_STATE_P = makeSymbol( "KB-QUERY-STATE-P" );
    $list2 = ConsesLow.list( new SubLObject[] { makeSymbol( "QUERY-SPEC" ), makeSymbol( "NAME" ), makeSymbol( "COMMENTS" ), makeSymbol( "TEST-STATE" ), makeSymbol( "SAVE-MT" ), makeSymbol( "INFERENCE" ), makeSymbol(
        "SENTENCES" ), makeSymbol( "QUERY-MTS" ), makeSymbol( "TEMPLATE" ), makeSymbol( "TEMPLATE-FOLDER-MT-PAIRS" ), makeSymbol( "TEMPLATE-GLOSSES" ), makeSymbol( "QUERY-PROPERTIES" ), makeSymbol(
            "NON-EXPLANATORY-SENTENCE" ), makeSymbol( "MULTIPLE-CHOICE-OPTION-SPECS" )
    } );
    $list3 = ConsesLow.list( new SubLObject[] { makeKeyword( "QUERY-SPEC" ), makeKeyword( "NAME" ), makeKeyword( "COMMENTS" ), makeKeyword( "TEST-STATE" ), makeKeyword( "SAVE-MT" ), makeKeyword( "INFERENCE" ),
      makeKeyword( "SENTENCES" ), makeKeyword( "QUERY-MTS" ), makeKeyword( "TEMPLATE" ), makeKeyword( "TEMPLATE-FOLDER-MT-PAIRS" ), makeKeyword( "TEMPLATE-GLOSSES" ), makeKeyword( "QUERY-PROPERTIES" ), makeKeyword(
          "NON-EXPLANATORY-SENTENCE" ), makeKeyword( "MULTIPLE-CHOICE-OPTION-SPECS" )
    } );
    $list4 = ConsesLow.list( new SubLObject[] { makeSymbol( "KB-QUERY-STATE-QUERY-SPEC" ), makeSymbol( "KB-QUERY-STATE-NAME" ), makeSymbol( "KB-QUERY-STATE-COMMENTS" ), makeSymbol( "KB-QUERY-STATE-TEST-STATE" ),
      makeSymbol( "KB-QUERY-STATE-SAVE-MT" ), makeSymbol( "KB-QUERY-STATE-INFERENCE" ), makeSymbol( "KB-QUERY-STATE-SENTENCES" ), makeSymbol( "KB-QUERY-STATE-QUERY-MTS" ), makeSymbol( "KB-QUERY-STATE-TEMPLATE" ),
      makeSymbol( "KB-QUERY-STATE-TEMPLATE-FOLDER-MT-PAIRS" ), makeSymbol( "KB-QUERY-STATE-TEMPLATE-GLOSSES" ), makeSymbol( "KB-QUERY-STATE-QUERY-PROPERTIES" ), makeSymbol( "KB-QUERY-STATE-NON-EXPLANATORY-SENTENCE" ),
      makeSymbol( "KB-QUERY-STATE-MULTIPLE-CHOICE-OPTION-SPECS" )
    } );
    $list5 = ConsesLow.list( new SubLObject[] { makeSymbol( "_CSETF-KB-QUERY-STATE-QUERY-SPEC" ), makeSymbol( "_CSETF-KB-QUERY-STATE-NAME" ), makeSymbol( "_CSETF-KB-QUERY-STATE-COMMENTS" ), makeSymbol(
        "_CSETF-KB-QUERY-STATE-TEST-STATE" ), makeSymbol( "_CSETF-KB-QUERY-STATE-SAVE-MT" ), makeSymbol( "_CSETF-KB-QUERY-STATE-INFERENCE" ), makeSymbol( "_CSETF-KB-QUERY-STATE-SENTENCES" ), makeSymbol(
            "_CSETF-KB-QUERY-STATE-QUERY-MTS" ), makeSymbol( "_CSETF-KB-QUERY-STATE-TEMPLATE" ), makeSymbol( "_CSETF-KB-QUERY-STATE-TEMPLATE-FOLDER-MT-PAIRS" ), makeSymbol( "_CSETF-KB-QUERY-STATE-TEMPLATE-GLOSSES" ),
      makeSymbol( "_CSETF-KB-QUERY-STATE-QUERY-PROPERTIES" ), makeSymbol( "_CSETF-KB-QUERY-STATE-NON-EXPLANATORY-SENTENCE" ), makeSymbol( "_CSETF-KB-QUERY-STATE-MULTIPLE-CHOICE-OPTION-SPECS" )
    } );
    $sym6$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol( "DEFAULT-STRUCT-PRINT-FUNCTION" );
    $sym7$KB_QUERY_STATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "KB-QUERY-STATE-PRINT-FUNCTION-TRAMPOLINE" );
    $list8 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "KB-QUERY-STATE-P" ) );
    $sym9$KB_QUERY_STATE_QUERY_SPEC = makeSymbol( "KB-QUERY-STATE-QUERY-SPEC" );
    $sym10$_CSETF_KB_QUERY_STATE_QUERY_SPEC = makeSymbol( "_CSETF-KB-QUERY-STATE-QUERY-SPEC" );
    $sym11$KB_QUERY_STATE_NAME = makeSymbol( "KB-QUERY-STATE-NAME" );
    $sym12$_CSETF_KB_QUERY_STATE_NAME = makeSymbol( "_CSETF-KB-QUERY-STATE-NAME" );
    $sym13$KB_QUERY_STATE_COMMENTS = makeSymbol( "KB-QUERY-STATE-COMMENTS" );
    $sym14$_CSETF_KB_QUERY_STATE_COMMENTS = makeSymbol( "_CSETF-KB-QUERY-STATE-COMMENTS" );
    $sym15$KB_QUERY_STATE_TEST_STATE = makeSymbol( "KB-QUERY-STATE-TEST-STATE" );
    $sym16$_CSETF_KB_QUERY_STATE_TEST_STATE = makeSymbol( "_CSETF-KB-QUERY-STATE-TEST-STATE" );
    $sym17$KB_QUERY_STATE_SAVE_MT = makeSymbol( "KB-QUERY-STATE-SAVE-MT" );
    $sym18$_CSETF_KB_QUERY_STATE_SAVE_MT = makeSymbol( "_CSETF-KB-QUERY-STATE-SAVE-MT" );
    $sym19$KB_QUERY_STATE_INFERENCE = makeSymbol( "KB-QUERY-STATE-INFERENCE" );
    $sym20$_CSETF_KB_QUERY_STATE_INFERENCE = makeSymbol( "_CSETF-KB-QUERY-STATE-INFERENCE" );
    $sym21$KB_QUERY_STATE_SENTENCES = makeSymbol( "KB-QUERY-STATE-SENTENCES" );
    $sym22$_CSETF_KB_QUERY_STATE_SENTENCES = makeSymbol( "_CSETF-KB-QUERY-STATE-SENTENCES" );
    $sym23$KB_QUERY_STATE_QUERY_MTS = makeSymbol( "KB-QUERY-STATE-QUERY-MTS" );
    $sym24$_CSETF_KB_QUERY_STATE_QUERY_MTS = makeSymbol( "_CSETF-KB-QUERY-STATE-QUERY-MTS" );
    $sym25$KB_QUERY_STATE_TEMPLATE = makeSymbol( "KB-QUERY-STATE-TEMPLATE" );
    $sym26$_CSETF_KB_QUERY_STATE_TEMPLATE = makeSymbol( "_CSETF-KB-QUERY-STATE-TEMPLATE" );
    $sym27$KB_QUERY_STATE_TEMPLATE_FOLDER_MT_PAIRS = makeSymbol( "KB-QUERY-STATE-TEMPLATE-FOLDER-MT-PAIRS" );
    $sym28$_CSETF_KB_QUERY_STATE_TEMPLATE_FOLDER_MT_PAIRS = makeSymbol( "_CSETF-KB-QUERY-STATE-TEMPLATE-FOLDER-MT-PAIRS" );
    $sym29$KB_QUERY_STATE_TEMPLATE_GLOSSES = makeSymbol( "KB-QUERY-STATE-TEMPLATE-GLOSSES" );
    $sym30$_CSETF_KB_QUERY_STATE_TEMPLATE_GLOSSES = makeSymbol( "_CSETF-KB-QUERY-STATE-TEMPLATE-GLOSSES" );
    $sym31$KB_QUERY_STATE_QUERY_PROPERTIES = makeSymbol( "KB-QUERY-STATE-QUERY-PROPERTIES" );
    $sym32$_CSETF_KB_QUERY_STATE_QUERY_PROPERTIES = makeSymbol( "_CSETF-KB-QUERY-STATE-QUERY-PROPERTIES" );
    $sym33$KB_QUERY_STATE_NON_EXPLANATORY_SENTENCE = makeSymbol( "KB-QUERY-STATE-NON-EXPLANATORY-SENTENCE" );
    $sym34$_CSETF_KB_QUERY_STATE_NON_EXPLANATORY_SENTENCE = makeSymbol( "_CSETF-KB-QUERY-STATE-NON-EXPLANATORY-SENTENCE" );
    $sym35$KB_QUERY_STATE_MULTIPLE_CHOICE_OPTION_SPECS = makeSymbol( "KB-QUERY-STATE-MULTIPLE-CHOICE-OPTION-SPECS" );
    $sym36$_CSETF_KB_QUERY_STATE_MULTIPLE_CHOICE_OPTION_SPECS = makeSymbol( "_CSETF-KB-QUERY-STATE-MULTIPLE-CHOICE-OPTION-SPECS" );
    $kw37$QUERY_SPEC = makeKeyword( "QUERY-SPEC" );
    $kw38$NAME = makeKeyword( "NAME" );
    $kw39$COMMENTS = makeKeyword( "COMMENTS" );
    $kw40$TEST_STATE = makeKeyword( "TEST-STATE" );
    $kw41$SAVE_MT = makeKeyword( "SAVE-MT" );
    $kw42$INFERENCE = makeKeyword( "INFERENCE" );
    $kw43$SENTENCES = makeKeyword( "SENTENCES" );
    $kw44$QUERY_MTS = makeKeyword( "QUERY-MTS" );
    $kw45$TEMPLATE = makeKeyword( "TEMPLATE" );
    $kw46$TEMPLATE_FOLDER_MT_PAIRS = makeKeyword( "TEMPLATE-FOLDER-MT-PAIRS" );
    $kw47$TEMPLATE_GLOSSES = makeKeyword( "TEMPLATE-GLOSSES" );
    $kw48$QUERY_PROPERTIES = makeKeyword( "QUERY-PROPERTIES" );
    $kw49$NON_EXPLANATORY_SENTENCE = makeKeyword( "NON-EXPLANATORY-SENTENCE" );
    $kw50$MULTIPLE_CHOICE_OPTION_SPECS = makeKeyword( "MULTIPLE-CHOICE-OPTION-SPECS" );
    $str51$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw52$BEGIN = makeKeyword( "BEGIN" );
    $sym53$MAKE_KB_QUERY_STATE = makeSymbol( "MAKE-KB-QUERY-STATE" );
    $kw54$SLOT = makeKeyword( "SLOT" );
    $kw55$END = makeKeyword( "END" );
    $sym56$VISIT_DEFSTRUCT_OBJECT_KB_QUERY_STATE_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-KB-QUERY-STATE-METHOD" );
    $sym57$KBQ_QUERY_SPEC_P = makeSymbol( "KBQ-QUERY-SPEC-P" );
    $sym58$KCT_TEST_STATE_P = makeSymbol( "KCT-TEST-STATE-P" );
    $sym59$INFERENCE_P = makeSymbol( "INFERENCE-P" );
    $sym60$_CB_KB_QUERY_BEING_SAVED_ = makeSymbol( "*CB-KB-QUERY-BEING-SAVED*" );
  }

  public static final class $kb_query_state_native
      extends
        SubLStructNative
  {
    public SubLObject $query_spec;
    public SubLObject $name;
    public SubLObject $comments;
    public SubLObject $test_state;
    public SubLObject $save_mt;
    public SubLObject $inference;
    public SubLObject $sentences;
    public SubLObject $query_mts;
    public SubLObject $template;
    public SubLObject $template_folder_mt_pairs;
    public SubLObject $template_glosses;
    public SubLObject $query_properties;
    public SubLObject $non_explanatory_sentence;
    public SubLObject $multiple_choice_option_specs;
    private static final SubLStructDeclNative structDecl;

    public $kb_query_state_native()
    {
      this.$query_spec = CommonSymbols.NIL;
      this.$name = CommonSymbols.NIL;
      this.$comments = CommonSymbols.NIL;
      this.$test_state = CommonSymbols.NIL;
      this.$save_mt = CommonSymbols.NIL;
      this.$inference = CommonSymbols.NIL;
      this.$sentences = CommonSymbols.NIL;
      this.$query_mts = CommonSymbols.NIL;
      this.$template = CommonSymbols.NIL;
      this.$template_folder_mt_pairs = CommonSymbols.NIL;
      this.$template_glosses = CommonSymbols.NIL;
      this.$query_properties = CommonSymbols.NIL;
      this.$non_explanatory_sentence = CommonSymbols.NIL;
      this.$multiple_choice_option_specs = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $kb_query_state_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$query_spec;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$name;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$comments;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$test_state;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$save_mt;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$inference;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$sentences;
    }

    @Override
    public SubLObject getField9()
    {
      return this.$query_mts;
    }

    @Override
    public SubLObject getField10()
    {
      return this.$template;
    }

    @Override
    public SubLObject getField11()
    {
      return this.$template_folder_mt_pairs;
    }

    @Override
    public SubLObject getField12()
    {
      return this.$template_glosses;
    }

    @Override
    public SubLObject getField13()
    {
      return this.$query_properties;
    }

    @Override
    public SubLObject getField14()
    {
      return this.$non_explanatory_sentence;
    }

    @Override
    public SubLObject getField15()
    {
      return this.$multiple_choice_option_specs;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$query_spec = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$name = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$comments = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$test_state = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$save_mt = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$inference = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$sentences = value;
    }

    @Override
    public SubLObject setField9(final SubLObject value)
    {
      return this.$query_mts = value;
    }

    @Override
    public SubLObject setField10(final SubLObject value)
    {
      return this.$template = value;
    }

    @Override
    public SubLObject setField11(final SubLObject value)
    {
      return this.$template_folder_mt_pairs = value;
    }

    @Override
    public SubLObject setField12(final SubLObject value)
    {
      return this.$template_glosses = value;
    }

    @Override
    public SubLObject setField13(final SubLObject value)
    {
      return this.$query_properties = value;
    }

    @Override
    public SubLObject setField14(final SubLObject value)
    {
      return this.$non_explanatory_sentence = value;
    }

    @Override
    public SubLObject setField15(final SubLObject value)
    {
      return this.$multiple_choice_option_specs = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $kb_query_state_native.class, $sym0$KB_QUERY_STATE, $sym1$KB_QUERY_STATE_P, $list2, $list3, new String[] { "$query_spec", "$name", "$comments", "$test_state",
        "$save_mt", "$inference", "$sentences", "$query_mts", "$template", "$template_folder_mt_pairs", "$template_glosses", "$query_properties", "$non_explanatory_sentence", "$multiple_choice_option_specs"
      }, $list4, $list5, $sym6$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $kb_query_state_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $kb_query_state_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "KB-QUERY-STATE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return kb_query_state_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 123 ms synthetic
 */