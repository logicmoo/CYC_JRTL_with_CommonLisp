package com.cyc.cycjava.cycl.cyc_testing;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.access_macros;
import com.cyc.cycjava.cycl.meta_macros;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.inference.harness.inference_strategist;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
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

public final class evaluatable_relation_tests
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.cyc_testing.evaluatable_relation_tests";
  public static final String myFingerPrint = "24c6dcb3126cd8f1d8f2aa14b5332c829e5850b53b1f9b6ebfefd53442236cf0";
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 2410L)
  public static SubLSymbol $dtp_evaluatable_relation_test$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 2660L)
  private static SubLSymbol $evaluatable_relation_tests$;
  private static final SubLSymbol $sym0$EVALUATABLE_RELATION_TEST;
  private static final SubLSymbol $sym1$EVALUATABLE_RELATION_TEST_P;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$DEFAULT_STRUCT_PRINT_FUNCTION;
  private static final SubLSymbol $sym7$EVALUATABLE_RELATION_TEST_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$ERT_RELATION;
  private static final SubLSymbol $sym10$_CSETF_ERT_RELATION;
  private static final SubLSymbol $sym11$ERT_ID;
  private static final SubLSymbol $sym12$_CSETF_ERT_ID;
  private static final SubLSymbol $sym13$ERT_SENTENCE;
  private static final SubLSymbol $sym14$_CSETF_ERT_SENTENCE;
  private static final SubLSymbol $sym15$ERT_KB;
  private static final SubLSymbol $sym16$_CSETF_ERT_KB;
  private static final SubLSymbol $sym17$ERT_OWNER;
  private static final SubLSymbol $sym18$_CSETF_ERT_OWNER;
  private static final SubLSymbol $kw19$RELATION;
  private static final SubLSymbol $kw20$ID;
  private static final SubLSymbol $kw21$SENTENCE;
  private static final SubLSymbol $kw22$KB;
  private static final SubLSymbol $kw23$OWNER;
  private static final SubLString $str24$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw25$BEGIN;
  private static final SubLSymbol $sym26$MAKE_EVALUATABLE_RELATION_TEST;
  private static final SubLSymbol $kw27$SLOT;
  private static final SubLSymbol $kw28$END;
  private static final SubLSymbol $sym29$VISIT_DEFSTRUCT_OBJECT_EVALUATABLE_RELATION_TEST_METHOD;
  private static final SubLSymbol $sym30$_EVALUATABLE_RELATION_TESTS_;
  private static final SubLInteger $int31$100;
  private static final SubLSymbol $sym32$FORT_P;
  private static final SubLSymbol $sym33$_;
  private static final SubLString $str34$;
  private static final SubLSymbol $sym35$INVALID_CONSTANT_;
  private static final SubLList $list36;
  private static final SubLList $list37;
  private static final SubLSymbol $kw38$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw39$FULL;
  private static final SubLSymbol $sym40$DEFINE_EVALUATABLE_RELATION_TEST_INT;
  private static final SubLSymbol $sym41$DEFINE_EVALUATABLE_FUNCTION_TEST;
  private static final SubLList $list42;
  private static final SubLList $list43;
  private static final SubLSymbol $sym44$DEFINE_EVALUATABLE_PREDICATE_TEST;
  private static final SubLList $list45;
  private static final SubLSymbol $sym46$INTEGERP;
  private static final SubLSymbol $sym47$POSSIBLY_SENTENCE_P;
  private static final SubLSymbol $sym48$CYC_TEST_KB_P;
  private static final SubLSymbol $sym49$INFERENCE_TEST_OWNER_P;
  private static final SubLList $list50;
  private static final SubLList $list51;
  private static final SubLSymbol $kw52$RESULT;
  private static final SubLSymbol $kw53$DONT_CARE;
  private static final SubLSymbol $kw54$MT;
  private static final SubLSymbol $sym55$DEFINE_SIMPLE_EVALUATABLE_FUNCTION_TEST_INT;
  private static final SubLSymbol $sym56$DEFINE_SIMPLE_EVALUATABLE_FUNCTION_TEST;
  private static final SubLList $list57;
  private static final SubLList $list58;
  private static final SubLObject $const59$InferencePSC;
  private static final SubLSymbol $kw60$TESTS;
  private static final SubLSymbol $kw61$WORKING_;
  private static final SubLSymbol $sym62$DEFINE_SIMPLE_EVALUATABLE_FUNCTION_TEST_BLOCK_INT;
  private static final SubLSymbol $sym63$DEFINE_SIMPLE_EVALUATABLE_FUNCTION_TEST_BLOCK;
  private static final SubLList $list64;
  private static final SubLSymbol $kw65$ILL_FORMED;
  private static final SubLObject $const66$trueSubL;
  private static final SubLObject $const67$SubLQuoteFn;
  private static final SubLSymbol $sym68$CNOT;
  private static final SubLSymbol $sym69$EL_WFF_;
  private static final SubLSymbol $sym70$QUOTE;
  private static final SubLObject $const71$evaluate;
  private static final SubLSymbol $sym72$_RESULT;
  private static final SubLSymbol $kw73$UNEVALUATABLE;
  private static final SubLObject $const74$unknownSentence;
  private static final SubLObject $const75$thereExists;
  private static final SubLObject $const76$ist;
  private static final SubLList $list77;
  private static final SubLList $list78;
  private static final SubLList $list79;
  private static final SubLSymbol $sym80$DEFINE_SIMPLE_EVALUATABLE_PREDICATE_TEST_INT;
  private static final SubLSymbol $sym81$DEFINE_SIMPLE_EVALUATABLE_PREDICATE_TEST;
  private static final SubLList $list82;
  private static final SubLList $list83;
  private static final SubLSymbol $sym84$DEFINE_SIMPLE_EVALUATABLE_PREDICATE_TEST_BLOCK_INT;
  private static final SubLSymbol $sym85$DEFINE_SIMPLE_EVALUATABLE_PREDICATE_TEST_BLOCK;
  private static final SubLList $list86;
  private static final SubLObject $const87$and;
  private static final SubLSymbol $kw88$FALSE;
  private static final SubLList $list89;
  private static final SubLSymbol $kw90$TRUE;
  private static final SubLSymbol $kw91$STANDARD;
  private static final SubLSymbol $sym92$CYC_TEST_OUTPUT_FORMAT_P;
  private static final SubLSymbol $kw93$TERSE;
  private static final SubLSymbol $kw94$ERT;
  private static final SubLSymbol $kw95$NOT_RUN;
  private static final SubLSymbol $kw96$INVALID;
  private static final SubLSymbol $kw97$ERROR;
  private static final SubLSymbol $kw98$IGNORE_ERRORS_TARGET;
  private static final SubLSymbol $sym99$IGNORE_ERRORS_HANDLER;
  private static final SubLSymbol $kw100$FAILURE;
  private static final SubLSymbol $kw101$SUCCESS;
  private static final SubLSymbol $kw102$CACHE_INFERENCE_RESULTS_;
  private static final SubLSymbol $kw103$BROWSABLE_;
  private static final SubLSymbol $kw104$CONDITIONAL_SENTENCE_;
  private static final SubLSymbol $kw105$NEW_TERMS_ALLOWED_;
  private static final SubLString $str106$___ERT__S__S____;
  private static final SubLSymbol $kw107$POST_BUILD;
  private static final SubLString $str108$Unknown_output_format__A;
  private static final SubLString $str109$_ERT__S____3f___;

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 2410L)
  public static SubLObject evaluatable_relation_test_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 2410L)
  public static SubLObject evaluatable_relation_test_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $evaluatable_relation_test_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 2410L)
  public static SubLObject ert_relation(final SubLObject v_object)
  {
    assert NIL != evaluatable_relation_test_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 2410L)
  public static SubLObject ert_id(final SubLObject v_object)
  {
    assert NIL != evaluatable_relation_test_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 2410L)
  public static SubLObject ert_sentence(final SubLObject v_object)
  {
    assert NIL != evaluatable_relation_test_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 2410L)
  public static SubLObject ert_kb(final SubLObject v_object)
  {
    assert NIL != evaluatable_relation_test_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 2410L)
  public static SubLObject ert_owner(final SubLObject v_object)
  {
    assert NIL != evaluatable_relation_test_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 2410L)
  public static SubLObject _csetf_ert_relation(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != evaluatable_relation_test_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 2410L)
  public static SubLObject _csetf_ert_id(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != evaluatable_relation_test_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 2410L)
  public static SubLObject _csetf_ert_sentence(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != evaluatable_relation_test_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 2410L)
  public static SubLObject _csetf_ert_kb(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != evaluatable_relation_test_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 2410L)
  public static SubLObject _csetf_ert_owner(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != evaluatable_relation_test_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 2410L)
  public static SubLObject make_evaluatable_relation_test(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $evaluatable_relation_test_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw19$RELATION ) )
      {
        _csetf_ert_relation( v_new, current_value );
      }
      else if( pcase_var.eql( $kw20$ID ) )
      {
        _csetf_ert_id( v_new, current_value );
      }
      else if( pcase_var.eql( $kw21$SENTENCE ) )
      {
        _csetf_ert_sentence( v_new, current_value );
      }
      else if( pcase_var.eql( $kw22$KB ) )
      {
        _csetf_ert_kb( v_new, current_value );
      }
      else if( pcase_var.eql( $kw23$OWNER ) )
      {
        _csetf_ert_owner( v_new, current_value );
      }
      else
      {
        Errors.error( $str24$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 2410L)
  public static SubLObject visit_defstruct_evaluatable_relation_test(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw25$BEGIN, $sym26$MAKE_EVALUATABLE_RELATION_TEST, FIVE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw27$SLOT, $kw19$RELATION, ert_relation( obj ) );
    Functions.funcall( visitor_fn, obj, $kw27$SLOT, $kw20$ID, ert_id( obj ) );
    Functions.funcall( visitor_fn, obj, $kw27$SLOT, $kw21$SENTENCE, ert_sentence( obj ) );
    Functions.funcall( visitor_fn, obj, $kw27$SLOT, $kw22$KB, ert_kb( obj ) );
    Functions.funcall( visitor_fn, obj, $kw27$SLOT, $kw23$OWNER, ert_owner( obj ) );
    Functions.funcall( visitor_fn, obj, $kw28$END, $sym26$MAKE_EVALUATABLE_RELATION_TEST, FIVE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 2410L)
  public static SubLObject visit_defstruct_object_evaluatable_relation_test_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_evaluatable_relation_test( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 2740L)
  public static SubLObject clear_evaluatable_relation_tests()
  {
    Hashtables.clrhash( $evaluatable_relation_tests$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 2846L)
  public static SubLObject evaluatable_relations_with_evaluatable_relation_tests()
  {
    SubLObject relations = hash_table_utilities.hash_table_keys( $evaluatable_relation_tests$.getGlobalValue() );
    relations = kb_utilities.sort_terms( relations, NIL, NIL, T, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return relations;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 3159L)
  public static SubLObject evaluatable_relation_tests(final SubLObject relation)
  {
    assert NIL != forts.fort_p( relation ) : relation;
    SubLObject tests = conses_high.copy_list( Hashtables.gethash( relation, $evaluatable_relation_tests$.getGlobalValue(), UNPROVIDED ) );
    tests = Sort.sort( tests, Symbols.symbol_function( $sym33$_ ), Symbols.symbol_function( $sym11$ERT_ID ) );
    return tests;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 3462L)
  public static SubLObject some_evaluatable_relation_testsP(final SubLObject relation)
  {
    assert NIL != forts.fort_p( relation ) : relation;
    return list_utilities.sublisp_boolean( Hashtables.gethash( relation, $evaluatable_relation_tests$.getGlobalValue(), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 3695L)
  public static SubLObject evaluatable_relation_test_name(final SubLObject ert)
  {
    return ConsesLow.list( ert_relation( ert ), ert_id( ert ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 3799L)
  public static SubLObject evaluatable_relation_test_id(final SubLObject ert)
  {
    return ert_id( ert );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 3875L)
  public static SubLObject evaluatable_relation_test_owner(final SubLObject ert)
  {
    return ert_owner( ert );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 3957L)
  public static SubLObject evaluatable_relation_test_comment(final SubLObject ert)
  {
    return $str34$;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 4067L)
  public static SubLObject evaluatable_relation_test_relation(final SubLObject ert)
  {
    return ert_relation( ert );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 4155L)
  public static SubLObject evaluatable_relation_test_sentence(final SubLObject ert)
  {
    return ert_sentence( ert );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 4243L)
  public static SubLObject evaluatable_relation_test_kb(final SubLObject ert)
  {
    return ert_kb( ert );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 4319L)
  public static SubLObject evaluatable_relation_test_workingP(final SubLObject ert)
  {
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 4430L)
  public static SubLObject evaluatable_relation_test_mentions_invalid_constantP(final SubLObject ert)
  {
    return makeBoolean( NIL != list_utilities.tree_find_if( $sym35$INVALID_CONSTANT_, evaluatable_relation_test_relation( ert ), UNPROVIDED ) || NIL != list_utilities.tree_find_if( $sym35$INVALID_CONSTANT_,
        evaluatable_relation_test_sentence( ert ), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 4678L)
  public static SubLObject evaluatable_relation_test_invalid_constants(final SubLObject ert)
  {
    return Sequences.remove_duplicates( ConsesLow.append( cycl_utilities.expression_gather( evaluatable_relation_test_relation( ert ), $sym35$INVALID_CONSTANT_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ),
        cycl_utilities.expression_gather( evaluatable_relation_test_sentence( ert ), $sym35$INVALID_CONSTANT_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 4951L)
  public static SubLObject evaluatable_relation_test_count(final SubLObject relation)
  {
    return Sequences.length( Hashtables.gethash( relation, $evaluatable_relation_tests$.getGlobalValue(), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 5153L)
  public static SubLObject total_evaluatable_relation_test_count()
  {
    SubLObject total = ZERO_INTEGER;
    SubLObject relation = NIL;
    SubLObject tests = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( $evaluatable_relation_tests$.getGlobalValue() );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        relation = Hashtables.getEntryKey( cdohash_entry );
        tests = Hashtables.getEntryValue( cdohash_entry );
        total = Numbers.add( total, Sequences.length( tests ) );
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    return total;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 5425L)
  public static SubLObject define_evaluatable_function_test(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject function = NIL;
    SubLObject id = NIL;
    SubLObject sentence = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list36 );
    function = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list36 );
    id = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list36 );
    sentence = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list36 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list36 );
      if( NIL == conses_high.member( current_$1, $list37, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw38$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list36 );
    }
    final SubLObject kb_tail = cdestructuring_bind.property_list_member( $kw22$KB, current );
    final SubLObject kb = ( NIL != kb_tail ) ? conses_high.cadr( kb_tail ) : $kw39$FULL;
    final SubLObject owner_tail = cdestructuring_bind.property_list_member( $kw23$OWNER, current );
    final SubLObject owner = ( NIL != owner_tail ) ? conses_high.cadr( owner_tail ) : NIL;
    return ConsesLow.list( $sym40$DEFINE_EVALUATABLE_RELATION_TEST_INT, function, id, sentence, kb, owner );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 5960L)
  public static SubLObject define_evaluatable_predicate_test(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject predicate = NIL;
    SubLObject id = NIL;
    SubLObject sentence = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list43 );
    predicate = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list43 );
    id = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list43 );
    sentence = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$2 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list43 );
      current_$2 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list43 );
      if( NIL == conses_high.member( current_$2, $list37, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$2 == $kw38$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list43 );
    }
    final SubLObject kb_tail = cdestructuring_bind.property_list_member( $kw22$KB, current );
    final SubLObject kb = ( NIL != kb_tail ) ? conses_high.cadr( kb_tail ) : $kw39$FULL;
    final SubLObject owner_tail = cdestructuring_bind.property_list_member( $kw23$OWNER, current );
    final SubLObject owner = ( NIL != owner_tail ) ? conses_high.cadr( owner_tail ) : NIL;
    return ConsesLow.list( $sym40$DEFINE_EVALUATABLE_RELATION_TEST_INT, predicate, id, sentence, kb, owner );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 6411L)
  public static SubLObject define_evaluatable_relation_test_int(final SubLObject relation, final SubLObject id, final SubLObject sentence, final SubLObject kb, final SubLObject owner)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != forts.fort_p( relation ) : relation;
    assert NIL != Types.integerp( id ) : id;
    assert NIL != el_utilities.possibly_sentence_p( sentence ) : sentence;
    assert NIL != cyc_testing.cyc_test_kb_p( kb ) : kb;
    assert NIL != inference_testing.inference_test_owner_p( owner ) : owner;
    final SubLObject test = make_evaluatable_relation_test( ConsesLow.list( new SubLObject[] { $kw19$RELATION, relation, $kw20$ID, id, $kw21$SENTENCE, sentence, $kw22$KB, kb, $kw23$OWNER, owner
    } ) );
    SubLObject existing_tests = Hashtables.gethash( relation, $evaluatable_relation_tests$.getGlobalValue(), UNPROVIDED );
    existing_tests = Sequences.delete( id, existing_tests, Symbols.symbol_function( EQL ), Symbols.symbol_function( $sym11$ERT_ID ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    existing_tests = ConsesLow.cons( test, existing_tests );
    Hashtables.sethash( relation, $evaluatable_relation_tests$.getGlobalValue(), existing_tests );
    cyc_testing.new_cyc_test( cyc_testing.$cyc_test_filename$.getDynamicValue( thread ), test );
    return test;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 7307L)
  public static SubLObject define_simple_evaluatable_function_test(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject function = NIL;
    SubLObject id = NIL;
    SubLObject expression = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list50 );
    function = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list50 );
    id = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list50 );
    expression = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$3 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list50 );
      current_$3 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list50 );
      if( NIL == conses_high.member( current_$3, $list51, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$3 == $kw38$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list50 );
    }
    final SubLObject result_tail = cdestructuring_bind.property_list_member( $kw52$RESULT, current );
    final SubLObject result = ( NIL != result_tail ) ? conses_high.cadr( result_tail ) : $kw53$DONT_CARE;
    final SubLObject kb_tail = cdestructuring_bind.property_list_member( $kw22$KB, current );
    final SubLObject kb = ( NIL != kb_tail ) ? conses_high.cadr( kb_tail ) : $kw39$FULL;
    final SubLObject mt_tail = cdestructuring_bind.property_list_member( $kw54$MT, current );
    final SubLObject mt = ( NIL != mt_tail ) ? conses_high.cadr( mt_tail ) : NIL;
    final SubLObject owner_tail = cdestructuring_bind.property_list_member( $kw23$OWNER, current );
    final SubLObject owner = ( NIL != owner_tail ) ? conses_high.cadr( owner_tail ) : NIL;
    return ConsesLow.list( $sym55$DEFINE_SIMPLE_EVALUATABLE_FUNCTION_TEST_INT, function, id, mt, result, expression, kb, owner );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 8216L)
  public static SubLObject define_simple_evaluatable_function_test_block(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject function = NIL;
    SubLObject start_id = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list57 );
    function = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list57 );
    start_id = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$4 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list57 );
      current_$4 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list57 );
      if( NIL == conses_high.member( current_$4, $list58, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$4 == $kw38$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list57 );
    }
    final SubLObject mt_tail = cdestructuring_bind.property_list_member( $kw54$MT, current );
    final SubLObject mt = ( NIL != mt_tail ) ? conses_high.cadr( mt_tail ) : $const59$InferencePSC;
    final SubLObject kb_tail = cdestructuring_bind.property_list_member( $kw22$KB, current );
    final SubLObject kb = ( NIL != kb_tail ) ? conses_high.cadr( kb_tail ) : $kw39$FULL;
    final SubLObject tests_tail = cdestructuring_bind.property_list_member( $kw60$TESTS, current );
    final SubLObject tests = ( NIL != tests_tail ) ? conses_high.cadr( tests_tail ) : NIL;
    final SubLObject owner_tail = cdestructuring_bind.property_list_member( $kw23$OWNER, current );
    final SubLObject owner = ( NIL != owner_tail ) ? conses_high.cadr( owner_tail ) : NIL;
    final SubLObject workingP_tail = cdestructuring_bind.property_list_member( $kw61$WORKING_, current );
    final SubLObject workingP = ( NIL != workingP_tail ) ? conses_high.cadr( workingP_tail ) : T;
    return ConsesLow.list( $sym62$DEFINE_SIMPLE_EVALUATABLE_FUNCTION_TEST_BLOCK_INT, function, start_id, mt, tests, workingP, kb, owner );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 9120L)
  public static SubLObject define_simple_evaluatable_function_test_int(final SubLObject function, final SubLObject id, final SubLObject mt, final SubLObject result, final SubLObject expression, final SubLObject kb,
      final SubLObject owner)
  {
    SubLObject sentence = NIL;
    if( result.eql( $kw65$ILL_FORMED ) )
    {
      sentence = ConsesLow.list( $const66$trueSubL, ConsesLow.list( $const67$SubLQuoteFn, ConsesLow.list( $sym68$CNOT, ConsesLow.list( $sym69$EL_WFF_, ConsesLow.list( $sym70$QUOTE, ConsesLow.list( $const71$evaluate,
          $sym72$_RESULT, expression ) ), ConsesLow.list( $sym70$QUOTE, mt ) ) ) ) );
    }
    else if( result.eql( $kw73$UNEVALUATABLE ) )
    {
      sentence = ConsesLow.list( $const74$unknownSentence, ConsesLow.list( $const75$thereExists, $sym72$_RESULT, ConsesLow.list( $const71$evaluate, $sym72$_RESULT, expression ) ) );
    }
    else if( result.eql( $kw53$DONT_CARE ) )
    {
      sentence = ConsesLow.list( $const71$evaluate, $sym72$_RESULT, expression );
    }
    else
    {
      sentence = ConsesLow.list( $const71$evaluate, result, expression );
    }
    if( NIL != mt )
    {
      sentence = ConsesLow.list( $const76$ist, mt, sentence );
    }
    return define_evaluatable_relation_test_int( function, id, sentence, kb, owner );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 10016L)
  public static SubLObject define_simple_evaluatable_function_test_block_int(final SubLObject function, final SubLObject start_id, final SubLObject mt, final SubLObject test_specs, final SubLObject workingP,
      final SubLObject kb, final SubLObject owner)
  {
    assert NIL != forts.fort_p( function ) : function;
    assert NIL != Types.integerp( start_id ) : start_id;
    if( NIL != workingP )
    {
      SubLObject list_var = NIL;
      SubLObject test_spec = NIL;
      SubLObject id_offset = NIL;
      list_var = test_specs;
      test_spec = list_var.first();
      for( id_offset = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), test_spec = list_var.first(), id_offset = Numbers.add( ONE_INTEGER, id_offset ) )
      {
        final SubLObject id = Numbers.add( start_id, id_offset );
        SubLObject current;
        final SubLObject datum = current = test_spec;
        SubLObject expression = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list77 );
        expression = current.first();
        current = current.rest();
        final SubLObject result = current.isCons() ? current.first() : $kw53$DONT_CARE;
        cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list77 );
        current = current.rest();
        if( NIL == current )
        {
          define_simple_evaluatable_function_test_int( function, id, mt, result, expression, kb, owner );
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list77 );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 10585L)
  public static SubLObject define_simple_evaluatable_predicate_test(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject predicate = NIL;
    SubLObject id = NIL;
    SubLObject sentence = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list78 );
    predicate = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list78 );
    id = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list78 );
    sentence = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$5 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list78 );
      current_$5 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list78 );
      if( NIL == conses_high.member( current_$5, $list79, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$5 == $kw38$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list78 );
    }
    final SubLObject result_tail = cdestructuring_bind.property_list_member( $kw52$RESULT, current );
    final SubLObject result = ( NIL != result_tail ) ? conses_high.cadr( result_tail ) : $kw53$DONT_CARE;
    final SubLObject mt_tail = cdestructuring_bind.property_list_member( $kw54$MT, current );
    final SubLObject mt = ( NIL != mt_tail ) ? conses_high.cadr( mt_tail ) : NIL;
    final SubLObject kb_tail = cdestructuring_bind.property_list_member( $kw22$KB, current );
    final SubLObject kb = ( NIL != kb_tail ) ? conses_high.cadr( kb_tail ) : $kw39$FULL;
    final SubLObject owner_tail = cdestructuring_bind.property_list_member( $kw23$OWNER, current );
    final SubLObject owner = ( NIL != owner_tail ) ? conses_high.cadr( owner_tail ) : NIL;
    return ConsesLow.list( $sym80$DEFINE_SIMPLE_EVALUATABLE_PREDICATE_TEST_INT, predicate, id, mt, result, sentence, kb, owner );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 11430L)
  public static SubLObject define_simple_evaluatable_predicate_test_block(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject predicate = NIL;
    SubLObject start_id = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list82 );
    predicate = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list82 );
    start_id = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$6 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list82 );
      current_$6 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list82 );
      if( NIL == conses_high.member( current_$6, $list83, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$6 == $kw38$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list82 );
    }
    final SubLObject mt_tail = cdestructuring_bind.property_list_member( $kw54$MT, current );
    final SubLObject mt = ( NIL != mt_tail ) ? conses_high.cadr( mt_tail ) : $const59$InferencePSC;
    final SubLObject kb_tail = cdestructuring_bind.property_list_member( $kw22$KB, current );
    final SubLObject kb = ( NIL != kb_tail ) ? conses_high.cadr( kb_tail ) : $kw39$FULL;
    final SubLObject owner_tail = cdestructuring_bind.property_list_member( $kw23$OWNER, current );
    final SubLObject owner = ( NIL != owner_tail ) ? conses_high.cadr( owner_tail ) : NIL;
    final SubLObject tests_tail = cdestructuring_bind.property_list_member( $kw60$TESTS, current );
    final SubLObject tests = ( NIL != tests_tail ) ? conses_high.cadr( tests_tail ) : NIL;
    return ConsesLow.list( $sym84$DEFINE_SIMPLE_EVALUATABLE_PREDICATE_TEST_BLOCK_INT, predicate, start_id, mt, kb, owner, tests );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 12241L)
  public static SubLObject define_simple_evaluatable_predicate_test_int(final SubLObject predicate, final SubLObject id, final SubLObject mt, final SubLObject result, SubLObject sentence, final SubLObject kb,
      final SubLObject owner)
  {
    SubLObject query_sentence = NIL;
    if( result.eql( $kw65$ILL_FORMED ) )
    {
      sentence = ConsesLow.list( $const66$trueSubL, ConsesLow.list( $const67$SubLQuoteFn, ConsesLow.list( $sym68$CNOT, ConsesLow.list( $sym69$EL_WFF_, ConsesLow.list( $sym70$QUOTE, sentence ), ConsesLow.list(
          $sym70$QUOTE, mt ) ) ) ) );
    }
    else if( result.eql( $kw73$UNEVALUATABLE ) )
    {
      query_sentence = ConsesLow.list( $const87$and, ConsesLow.list( $const74$unknownSentence, sentence ), ConsesLow.list( $const74$unknownSentence, cycl_utilities.negate( sentence ) ) );
    }
    else if( result.eql( $kw88$FALSE ) )
    {
      query_sentence = cycl_utilities.negate( sentence );
    }
    else
    {
      query_sentence = sentence;
    }
    if( NIL != mt )
    {
      query_sentence = ConsesLow.list( $const76$ist, mt, query_sentence );
    }
    return define_evaluatable_relation_test_int( predicate, id, query_sentence, kb, owner );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 13016L)
  public static SubLObject define_simple_evaluatable_predicate_test_block_int(final SubLObject predicate, final SubLObject start_id, final SubLObject mt, final SubLObject kb, final SubLObject owner,
      final SubLObject test_specs)
  {
    assert NIL != forts.fort_p( predicate ) : predicate;
    assert NIL != Types.integerp( start_id ) : start_id;
    SubLObject list_var = NIL;
    SubLObject test_spec = NIL;
    SubLObject id_offset = NIL;
    list_var = test_specs;
    test_spec = list_var.first();
    for( id_offset = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), test_spec = list_var.first(), id_offset = Numbers.add( ONE_INTEGER, id_offset ) )
    {
      final SubLObject id = Numbers.add( start_id, id_offset );
      SubLObject current;
      final SubLObject datum = current = test_spec;
      SubLObject sentence = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list89 );
      sentence = current.first();
      current = current.rest();
      final SubLObject result = current.isCons() ? current.first() : $kw90$TRUE;
      cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list89 );
      current = current.rest();
      if( NIL == current )
      {
        define_simple_evaluatable_predicate_test_int( predicate, id, mt, result, sentence, kb, owner );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list89 );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 13551L)
  public static SubLObject run_all_evaluatable_relation_tests(SubLObject output_format, SubLObject stream, SubLObject run_tiny_kb_tests_in_full_kbP, SubLObject return_test_runsP)
  {
    if( output_format == UNPROVIDED )
    {
      output_format = $kw91$STANDARD;
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
    return cyc_testing.run_all_loaded_cyc_tests( stream, $kw93$TERSE, NIL, output_format, run_tiny_kb_tests_in_full_kbP, NIL, return_test_runsP, $kw94$ERT, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
        UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 14544L)
  public static SubLObject run_evaluatable_relation_tests(final SubLObject relation, SubLObject output_format, SubLObject stream, SubLObject browsableP)
  {
    if( output_format == UNPROVIDED )
    {
      output_format = $kw91$STANDARD;
    }
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    if( browsableP == UNPROVIDED )
    {
      browsableP = NIL;
    }
    assert NIL != forts.fort_p( relation ) : relation;
    assert NIL != cyc_testing.cyc_test_output_format_p( output_format ) : output_format;
    SubLObject test_runs = NIL;
    SubLObject cdolist_list_var = evaluatable_relation_tests( relation );
    SubLObject ert = NIL;
    ert = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject test_run = run_evaluatable_relation_test( ert, output_format, stream, browsableP );
      test_runs = ConsesLow.cons( test_run, test_runs );
      cdolist_list_var = cdolist_list_var.rest();
      ert = cdolist_list_var.first();
    }
    return test_runs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 15376L)
  public static SubLObject run_evaluatable_relation_test_number(final SubLObject relation, final SubLObject id, SubLObject output_format, SubLObject stream, SubLObject browsableP)
  {
    if( output_format == UNPROVIDED )
    {
      output_format = $kw91$STANDARD;
    }
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    if( browsableP == UNPROVIDED )
    {
      browsableP = NIL;
    }
    assert NIL != forts.fort_p( relation ) : relation;
    assert NIL != Types.integerp( id ) : id;
    SubLObject cdolist_list_var = evaluatable_relation_tests( relation );
    SubLObject ert = NIL;
    ert = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( id.numE( ert_id( ert ) ) )
      {
        return run_evaluatable_relation_test( ert, output_format, stream, browsableP );
      }
      cdolist_list_var = cdolist_list_var.rest();
      ert = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 16137L)
  public static SubLObject run_evaluatable_relation_test_number_browsable(final SubLObject relation, final SubLObject id, SubLObject output_format, SubLObject stream)
  {
    if( output_format == UNPROVIDED )
    {
      output_format = $kw91$STANDARD;
    }
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    return run_evaluatable_relation_test_number( relation, id, output_format, stream, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 16360L)
  public static SubLObject run_evaluatable_relation_test(final SubLObject ert, SubLObject output_format, SubLObject stream, SubLObject browsableP)
  {
    if( output_format == UNPROVIDED )
    {
      output_format = $kw91$STANDARD;
    }
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    if( browsableP == UNPROVIDED )
    {
      browsableP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != evaluatable_relation_test_p( ert ) : ert;
    assert NIL != cyc_testing.cyc_test_output_format_p( output_format ) : output_format;
    final SubLObject name = evaluatable_relation_test_name( ert );
    SubLObject time = NIL;
    SubLObject result = NIL;
    if( NIL == run_evaluatable_relation_testP( ert ) )
    {
      result = $kw95$NOT_RUN;
    }
    else if( NIL != evaluatable_relation_test_mentions_invalid_constantP( ert ) )
    {
      result = $kw96$INVALID;
    }
    else
    {
      final SubLObject sentence = ert_sentence( ert );
      final SubLObject _prev_bind_0 = print_high.$print_pretty$.currentBinding( thread );
      try
      {
        print_high.$print_pretty$.bind( NIL, thread );
        print_evaluatable_relation_test_preamble( ert, output_format, stream );
        thread.resetMultipleValues();
        final SubLObject result_$7 = run_evaluatable_relation_test_query( sentence, browsableP );
        final SubLObject time_$8 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        result = result_$7;
        time = time_$8;
        print_evaluatable_relation_test_result( ert, result, time, output_format, stream );
      }
      finally
      {
        print_high.$print_pretty$.rebind( _prev_bind_0, thread );
      }
    }
    final SubLObject test_run = cyc_testing.new_cyc_test_run( $kw94$ERT, name, result, time );
    return test_run;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 17671L)
  public static SubLObject run_evaluatable_relation_testP(final SubLObject ert)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject test_kb = ert_kb( ert );
    if( NIL == inference_testing.kb_matches_expectationsP( test_kb, cyc_testing.$run_tiny_kb_tests_in_full_kbP$.getDynamicValue( thread ) ) )
    {
      return NIL;
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 18070L)
  public static SubLObject run_evaluatable_relation_test_query(final SubLObject sentence, final SubLObject browsableP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_answer = $kw97$ERROR;
    SubLObject time = NIL;
    SubLObject ignore_errors_tag = NIL;
    try
    {
      thread.throwStack.push( $kw98$IGNORE_ERRORS_TARGET );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( Symbols.symbol_function( $sym99$IGNORE_ERRORS_HANDLER ), thread );
        try
        {
          thread.resetMultipleValues();
          final SubLObject result = evaluatable_relation_test_query_inference( sentence, $const59$InferencePSC );
          final SubLObject inference = thread.secondMultipleValue();
          final SubLObject inference_time = thread.thirdMultipleValue();
          thread.resetMultipleValues();
          time = inference_time;
          if( NIL == result )
          {
            v_answer = $kw100$FAILURE;
          }
          else
          {
            v_answer = $kw101$SUCCESS;
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
      ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw98$IGNORE_ERRORS_TARGET );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return Values.values( v_answer, time );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 18582L)
  public static SubLObject evaluatable_relation_test_query_inference(SubLObject sentence, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject sentence_$9 = czer_utilities.unwrap_if_ist( sentence, mt, UNPROVIDED );
    final SubLObject mt_$10 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    sentence = sentence_$9;
    mt = mt_$10;
    final SubLObject conditionalP = inference_strategist.inference_conditional_sentence_p( sentence );
    final SubLObject v_properties = ConsesLow.list( $kw102$CACHE_INFERENCE_RESULTS_, NIL, $kw103$BROWSABLE_, T, $kw104$CONDITIONAL_SENTENCE_, conditionalP, $kw105$NEW_TERMS_ALLOWED_, T );
    SubLObject time = NIL;
    SubLObject result = NIL;
    SubLObject halt_reason = NIL;
    SubLObject inference = NIL;
    final SubLObject time_var = Time.get_internal_real_time();
    thread.resetMultipleValues();
    final SubLObject result_$11 = inference_kernel.new_cyc_query( sentence, mt, v_properties );
    final SubLObject halt_reason_$12 = thread.secondMultipleValue();
    final SubLObject inference_$13 = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    result = result_$11;
    halt_reason = halt_reason_$12;
    inference = inference_$13;
    time = Numbers.divide( Numbers.subtract( Time.get_internal_real_time(), time_var ), time_high.$internal_time_units_per_second$.getGlobalValue() );
    return Values.values( result, inference, time );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 19180L)
  public static SubLObject print_evaluatable_relation_test_preamble(final SubLObject ert, final SubLObject output_format, final SubLObject stream)
  {
    if( output_format.eql( $kw91$STANDARD ) )
    {
      final SubLObject relation = ert_relation( ert );
      final SubLObject id = ert_id( ert );
      PrintLow.format( stream, $str106$___ERT__S__S____, relation, id );
      streams_high.force_output( stream );
    }
    else if( !output_format.eql( $kw107$POST_BUILD ) )
    {
      PrintLow.format( stream, $str108$Unknown_output_format__A, output_format );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 19575L)
  public static SubLObject print_evaluatable_relation_test_result(final SubLObject ert, final SubLObject result, final SubLObject time, final SubLObject output_format, final SubLObject stream)
  {
    if( output_format.eql( $kw91$STANDARD ) )
    {
      PrintLow.format( stream, $str109$_ERT__S____3f___, result, time );
      streams_high.force_output( stream );
    }
    else if( output_format.eql( $kw107$POST_BUILD ) )
    {
      final SubLObject relation = ert_relation( ert );
      final SubLObject id = ert_id( ert );
      final SubLObject owner = ert_owner( ert );
      cyc_testing.print_post_build_test_summary( stream, result, relation, id, time, owner );
    }
    else
    {
      PrintLow.format( stream, $str108$Unknown_output_format__A, output_format );
    }
    return NIL;
  }

  public static SubLObject declare_evaluatable_relation_tests_file()
  {
    SubLFiles.declareFunction( me, "evaluatable_relation_test_print_function_trampoline", "EVALUATABLE-RELATION-TEST-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "evaluatable_relation_test_p", "EVALUATABLE-RELATION-TEST-P", 1, 0, false );
    new $evaluatable_relation_test_p$UnaryFunction();
    SubLFiles.declareFunction( me, "ert_relation", "ERT-RELATION", 1, 0, false );
    SubLFiles.declareFunction( me, "ert_id", "ERT-ID", 1, 0, false );
    new $ert_id$UnaryFunction();
    SubLFiles.declareFunction( me, "ert_sentence", "ERT-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "ert_kb", "ERT-KB", 1, 0, false );
    SubLFiles.declareFunction( me, "ert_owner", "ERT-OWNER", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_ert_relation", "_CSETF-ERT-RELATION", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_ert_id", "_CSETF-ERT-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_ert_sentence", "_CSETF-ERT-SENTENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_ert_kb", "_CSETF-ERT-KB", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_ert_owner", "_CSETF-ERT-OWNER", 2, 0, false );
    SubLFiles.declareFunction( me, "make_evaluatable_relation_test", "MAKE-EVALUATABLE-RELATION-TEST", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_evaluatable_relation_test", "VISIT-DEFSTRUCT-EVALUATABLE-RELATION-TEST", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_evaluatable_relation_test_method", "VISIT-DEFSTRUCT-OBJECT-EVALUATABLE-RELATION-TEST-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_evaluatable_relation_tests", "CLEAR-EVALUATABLE-RELATION-TESTS", 0, 0, false );
    SubLFiles.declareFunction( me, "evaluatable_relations_with_evaluatable_relation_tests", "EVALUATABLE-RELATIONS-WITH-EVALUATABLE-RELATION-TESTS", 0, 0, false );
    SubLFiles.declareFunction( me, "evaluatable_relation_tests", "EVALUATABLE-RELATION-TESTS", 1, 0, false );
    SubLFiles.declareFunction( me, "some_evaluatable_relation_testsP", "SOME-EVALUATABLE-RELATION-TESTS?", 1, 0, false );
    SubLFiles.declareFunction( me, "evaluatable_relation_test_name", "EVALUATABLE-RELATION-TEST-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "evaluatable_relation_test_id", "EVALUATABLE-RELATION-TEST-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "evaluatable_relation_test_owner", "EVALUATABLE-RELATION-TEST-OWNER", 1, 0, false );
    SubLFiles.declareFunction( me, "evaluatable_relation_test_comment", "EVALUATABLE-RELATION-TEST-COMMENT", 1, 0, false );
    SubLFiles.declareFunction( me, "evaluatable_relation_test_relation", "EVALUATABLE-RELATION-TEST-RELATION", 1, 0, false );
    SubLFiles.declareFunction( me, "evaluatable_relation_test_sentence", "EVALUATABLE-RELATION-TEST-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "evaluatable_relation_test_kb", "EVALUATABLE-RELATION-TEST-KB", 1, 0, false );
    SubLFiles.declareFunction( me, "evaluatable_relation_test_workingP", "EVALUATABLE-RELATION-TEST-WORKING?", 1, 0, false );
    SubLFiles.declareFunction( me, "evaluatable_relation_test_mentions_invalid_constantP", "EVALUATABLE-RELATION-TEST-MENTIONS-INVALID-CONSTANT?", 1, 0, false );
    SubLFiles.declareFunction( me, "evaluatable_relation_test_invalid_constants", "EVALUATABLE-RELATION-TEST-INVALID-CONSTANTS", 1, 0, false );
    SubLFiles.declareFunction( me, "evaluatable_relation_test_count", "EVALUATABLE-RELATION-TEST-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "total_evaluatable_relation_test_count", "TOTAL-EVALUATABLE-RELATION-TEST-COUNT", 0, 0, false );
    SubLFiles.declareMacro( me, "define_evaluatable_function_test", "DEFINE-EVALUATABLE-FUNCTION-TEST" );
    SubLFiles.declareMacro( me, "define_evaluatable_predicate_test", "DEFINE-EVALUATABLE-PREDICATE-TEST" );
    SubLFiles.declareFunction( me, "define_evaluatable_relation_test_int", "DEFINE-EVALUATABLE-RELATION-TEST-INT", 5, 0, false );
    SubLFiles.declareMacro( me, "define_simple_evaluatable_function_test", "DEFINE-SIMPLE-EVALUATABLE-FUNCTION-TEST" );
    SubLFiles.declareMacro( me, "define_simple_evaluatable_function_test_block", "DEFINE-SIMPLE-EVALUATABLE-FUNCTION-TEST-BLOCK" );
    SubLFiles.declareFunction( me, "define_simple_evaluatable_function_test_int", "DEFINE-SIMPLE-EVALUATABLE-FUNCTION-TEST-INT", 7, 0, false );
    SubLFiles.declareFunction( me, "define_simple_evaluatable_function_test_block_int", "DEFINE-SIMPLE-EVALUATABLE-FUNCTION-TEST-BLOCK-INT", 7, 0, false );
    SubLFiles.declareMacro( me, "define_simple_evaluatable_predicate_test", "DEFINE-SIMPLE-EVALUATABLE-PREDICATE-TEST" );
    SubLFiles.declareMacro( me, "define_simple_evaluatable_predicate_test_block", "DEFINE-SIMPLE-EVALUATABLE-PREDICATE-TEST-BLOCK" );
    SubLFiles.declareFunction( me, "define_simple_evaluatable_predicate_test_int", "DEFINE-SIMPLE-EVALUATABLE-PREDICATE-TEST-INT", 7, 0, false );
    SubLFiles.declareFunction( me, "define_simple_evaluatable_predicate_test_block_int", "DEFINE-SIMPLE-EVALUATABLE-PREDICATE-TEST-BLOCK-INT", 6, 0, false );
    SubLFiles.declareFunction( me, "run_all_evaluatable_relation_tests", "RUN-ALL-EVALUATABLE-RELATION-TESTS", 0, 4, false );
    SubLFiles.declareFunction( me, "run_evaluatable_relation_tests", "RUN-EVALUATABLE-RELATION-TESTS", 1, 3, false );
    SubLFiles.declareFunction( me, "run_evaluatable_relation_test_number", "RUN-EVALUATABLE-RELATION-TEST-NUMBER", 2, 3, false );
    SubLFiles.declareFunction( me, "run_evaluatable_relation_test_number_browsable", "RUN-EVALUATABLE-RELATION-TEST-NUMBER-BROWSABLE", 2, 2, false );
    SubLFiles.declareFunction( me, "run_evaluatable_relation_test", "RUN-EVALUATABLE-RELATION-TEST", 1, 3, false );
    SubLFiles.declareFunction( me, "run_evaluatable_relation_testP", "RUN-EVALUATABLE-RELATION-TEST?", 1, 0, false );
    SubLFiles.declareFunction( me, "run_evaluatable_relation_test_query", "RUN-EVALUATABLE-RELATION-TEST-QUERY", 2, 0, false );
    SubLFiles.declareFunction( me, "evaluatable_relation_test_query_inference", "EVALUATABLE-RELATION-TEST-QUERY-INFERENCE", 1, 1, false );
    SubLFiles.declareFunction( me, "print_evaluatable_relation_test_preamble", "PRINT-EVALUATABLE-RELATION-TEST-PREAMBLE", 3, 0, false );
    SubLFiles.declareFunction( me, "print_evaluatable_relation_test_result", "PRINT-EVALUATABLE-RELATION-TEST-RESULT", 5, 0, false );
    return NIL;
  }

  public static SubLObject init_evaluatable_relation_tests_file()
  {
    $dtp_evaluatable_relation_test$ = SubLFiles.defconstant( "*DTP-EVALUATABLE-RELATION-TEST*", $sym0$EVALUATABLE_RELATION_TEST );
    $evaluatable_relation_tests$ = SubLFiles.deflexical( "*EVALUATABLE-RELATION-TESTS*", maybeDefault( $sym30$_EVALUATABLE_RELATION_TESTS_, $evaluatable_relation_tests$, () -> ( Hashtables.make_hash_table( $int31$100,
        UNPROVIDED, UNPROVIDED ) ) ) );
    return NIL;
  }

  public static SubLObject setup_evaluatable_relation_tests_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_evaluatable_relation_test$.getGlobalValue(), Symbols.symbol_function(
        $sym7$EVALUATABLE_RELATION_TEST_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list8 );
    Structures.def_csetf( $sym9$ERT_RELATION, $sym10$_CSETF_ERT_RELATION );
    Structures.def_csetf( $sym11$ERT_ID, $sym12$_CSETF_ERT_ID );
    Structures.def_csetf( $sym13$ERT_SENTENCE, $sym14$_CSETF_ERT_SENTENCE );
    Structures.def_csetf( $sym15$ERT_KB, $sym16$_CSETF_ERT_KB );
    Structures.def_csetf( $sym17$ERT_OWNER, $sym18$_CSETF_ERT_OWNER );
    Equality.identity( $sym0$EVALUATABLE_RELATION_TEST );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_evaluatable_relation_test$.getGlobalValue(), Symbols.symbol_function(
        $sym29$VISIT_DEFSTRUCT_OBJECT_EVALUATABLE_RELATION_TEST_METHOD ) );
    subl_macro_promotions.declare_defglobal( $sym30$_EVALUATABLE_RELATION_TESTS_ );
    meta_macros.declare_indention_pattern( $sym41$DEFINE_EVALUATABLE_FUNCTION_TEST, $list42 );
    meta_macros.declare_indention_pattern( $sym44$DEFINE_EVALUATABLE_PREDICATE_TEST, $list45 );
    meta_macros.declare_indention_pattern( $sym56$DEFINE_SIMPLE_EVALUATABLE_FUNCTION_TEST, $list42 );
    meta_macros.declare_indention_pattern( $sym63$DEFINE_SIMPLE_EVALUATABLE_FUNCTION_TEST_BLOCK, $list64 );
    access_macros.register_macro_helper( $sym55$DEFINE_SIMPLE_EVALUATABLE_FUNCTION_TEST_INT, $sym56$DEFINE_SIMPLE_EVALUATABLE_FUNCTION_TEST );
    access_macros.register_macro_helper( $sym62$DEFINE_SIMPLE_EVALUATABLE_FUNCTION_TEST_BLOCK_INT, $sym63$DEFINE_SIMPLE_EVALUATABLE_FUNCTION_TEST_BLOCK );
    meta_macros.declare_indention_pattern( $sym81$DEFINE_SIMPLE_EVALUATABLE_PREDICATE_TEST, $list45 );
    meta_macros.declare_indention_pattern( $sym85$DEFINE_SIMPLE_EVALUATABLE_PREDICATE_TEST_BLOCK, $list86 );
    access_macros.register_macro_helper( $sym80$DEFINE_SIMPLE_EVALUATABLE_PREDICATE_TEST_INT, $sym81$DEFINE_SIMPLE_EVALUATABLE_PREDICATE_TEST );
    access_macros.register_macro_helper( $sym84$DEFINE_SIMPLE_EVALUATABLE_PREDICATE_TEST_BLOCK_INT, $sym85$DEFINE_SIMPLE_EVALUATABLE_PREDICATE_TEST_BLOCK );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_evaluatable_relation_tests_file();
  }

  @Override
  public void initializeVariables()
  {
    init_evaluatable_relation_tests_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_evaluatable_relation_tests_file();
  }
  static
  {
    me = new evaluatable_relation_tests();
    $dtp_evaluatable_relation_test$ = null;
    $evaluatable_relation_tests$ = null;
    $sym0$EVALUATABLE_RELATION_TEST = makeSymbol( "EVALUATABLE-RELATION-TEST" );
    $sym1$EVALUATABLE_RELATION_TEST_P = makeSymbol( "EVALUATABLE-RELATION-TEST-P" );
    $list2 = ConsesLow.list( makeSymbol( "RELATION" ), makeSymbol( "ID" ), makeSymbol( "SENTENCE" ), makeSymbol( "KB" ), makeSymbol( "OWNER" ) );
    $list3 = ConsesLow.list( makeKeyword( "RELATION" ), makeKeyword( "ID" ), makeKeyword( "SENTENCE" ), makeKeyword( "KB" ), makeKeyword( "OWNER" ) );
    $list4 = ConsesLow.list( makeSymbol( "ERT-RELATION" ), makeSymbol( "ERT-ID" ), makeSymbol( "ERT-SENTENCE" ), makeSymbol( "ERT-KB" ), makeSymbol( "ERT-OWNER" ) );
    $list5 = ConsesLow.list( makeSymbol( "_CSETF-ERT-RELATION" ), makeSymbol( "_CSETF-ERT-ID" ), makeSymbol( "_CSETF-ERT-SENTENCE" ), makeSymbol( "_CSETF-ERT-KB" ), makeSymbol( "_CSETF-ERT-OWNER" ) );
    $sym6$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol( "DEFAULT-STRUCT-PRINT-FUNCTION" );
    $sym7$EVALUATABLE_RELATION_TEST_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "EVALUATABLE-RELATION-TEST-PRINT-FUNCTION-TRAMPOLINE" );
    $list8 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "EVALUATABLE-RELATION-TEST-P" ) );
    $sym9$ERT_RELATION = makeSymbol( "ERT-RELATION" );
    $sym10$_CSETF_ERT_RELATION = makeSymbol( "_CSETF-ERT-RELATION" );
    $sym11$ERT_ID = makeSymbol( "ERT-ID" );
    $sym12$_CSETF_ERT_ID = makeSymbol( "_CSETF-ERT-ID" );
    $sym13$ERT_SENTENCE = makeSymbol( "ERT-SENTENCE" );
    $sym14$_CSETF_ERT_SENTENCE = makeSymbol( "_CSETF-ERT-SENTENCE" );
    $sym15$ERT_KB = makeSymbol( "ERT-KB" );
    $sym16$_CSETF_ERT_KB = makeSymbol( "_CSETF-ERT-KB" );
    $sym17$ERT_OWNER = makeSymbol( "ERT-OWNER" );
    $sym18$_CSETF_ERT_OWNER = makeSymbol( "_CSETF-ERT-OWNER" );
    $kw19$RELATION = makeKeyword( "RELATION" );
    $kw20$ID = makeKeyword( "ID" );
    $kw21$SENTENCE = makeKeyword( "SENTENCE" );
    $kw22$KB = makeKeyword( "KB" );
    $kw23$OWNER = makeKeyword( "OWNER" );
    $str24$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw25$BEGIN = makeKeyword( "BEGIN" );
    $sym26$MAKE_EVALUATABLE_RELATION_TEST = makeSymbol( "MAKE-EVALUATABLE-RELATION-TEST" );
    $kw27$SLOT = makeKeyword( "SLOT" );
    $kw28$END = makeKeyword( "END" );
    $sym29$VISIT_DEFSTRUCT_OBJECT_EVALUATABLE_RELATION_TEST_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-EVALUATABLE-RELATION-TEST-METHOD" );
    $sym30$_EVALUATABLE_RELATION_TESTS_ = makeSymbol( "*EVALUATABLE-RELATION-TESTS*" );
    $int31$100 = makeInteger( 100 );
    $sym32$FORT_P = makeSymbol( "FORT-P" );
    $sym33$_ = makeSymbol( "<" );
    $str34$ = makeString( "" );
    $sym35$INVALID_CONSTANT_ = makeSymbol( "INVALID-CONSTANT?" );
    $list36 = ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "ID" ), makeSymbol( "SENTENCE" ), makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "KB" ), makeKeyword( "FULL" ) ), makeSymbol( "OWNER" ) );
    $list37 = ConsesLow.list( makeKeyword( "KB" ), makeKeyword( "OWNER" ) );
    $kw38$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw39$FULL = makeKeyword( "FULL" );
    $sym40$DEFINE_EVALUATABLE_RELATION_TEST_INT = makeSymbol( "DEFINE-EVALUATABLE-RELATION-TEST-INT" );
    $sym41$DEFINE_EVALUATABLE_FUNCTION_TEST = makeSymbol( "DEFINE-EVALUATABLE-FUNCTION-TEST" );
    $list42 = ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "ID" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list43 = ConsesLow.list( makeSymbol( "PREDICATE" ), makeSymbol( "ID" ), makeSymbol( "SENTENCE" ), makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "KB" ), makeKeyword( "FULL" ) ), makeSymbol( "OWNER" ) );
    $sym44$DEFINE_EVALUATABLE_PREDICATE_TEST = makeSymbol( "DEFINE-EVALUATABLE-PREDICATE-TEST" );
    $list45 = ConsesLow.list( makeSymbol( "PREDICATE" ), makeSymbol( "ID" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym46$INTEGERP = makeSymbol( "INTEGERP" );
    $sym47$POSSIBLY_SENTENCE_P = makeSymbol( "POSSIBLY-SENTENCE-P" );
    $sym48$CYC_TEST_KB_P = makeSymbol( "CYC-TEST-KB-P" );
    $sym49$INFERENCE_TEST_OWNER_P = makeSymbol( "INFERENCE-TEST-OWNER-P" );
    $list50 = ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "ID" ), makeSymbol( "EXPRESSION" ), makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "RESULT" ), makeKeyword( "DONT-CARE" ) ), ConsesLow.list(
        makeSymbol( "KB" ), makeKeyword( "FULL" ) ), makeSymbol( "MT" ), makeSymbol( "OWNER" ) );
    $list51 = ConsesLow.list( makeKeyword( "RESULT" ), makeKeyword( "KB" ), makeKeyword( "MT" ), makeKeyword( "OWNER" ) );
    $kw52$RESULT = makeKeyword( "RESULT" );
    $kw53$DONT_CARE = makeKeyword( "DONT-CARE" );
    $kw54$MT = makeKeyword( "MT" );
    $sym55$DEFINE_SIMPLE_EVALUATABLE_FUNCTION_TEST_INT = makeSymbol( "DEFINE-SIMPLE-EVALUATABLE-FUNCTION-TEST-INT" );
    $sym56$DEFINE_SIMPLE_EVALUATABLE_FUNCTION_TEST = makeSymbol( "DEFINE-SIMPLE-EVALUATABLE-FUNCTION-TEST" );
    $list57 = ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "START-ID" ), makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "MT" ), constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) ) ),
        ConsesLow.list( makeSymbol( "KB" ), makeKeyword( "FULL" ) ), makeSymbol( "TESTS" ), makeSymbol( "OWNER" ), ConsesLow.list( makeSymbol( "WORKING?" ), T ) );
    $list58 = ConsesLow.list( makeKeyword( "MT" ), makeKeyword( "KB" ), makeKeyword( "TESTS" ), makeKeyword( "OWNER" ), makeKeyword( "WORKING?" ) );
    $const59$InferencePSC = constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) );
    $kw60$TESTS = makeKeyword( "TESTS" );
    $kw61$WORKING_ = makeKeyword( "WORKING?" );
    $sym62$DEFINE_SIMPLE_EVALUATABLE_FUNCTION_TEST_BLOCK_INT = makeSymbol( "DEFINE-SIMPLE-EVALUATABLE-FUNCTION-TEST-BLOCK-INT" );
    $sym63$DEFINE_SIMPLE_EVALUATABLE_FUNCTION_TEST_BLOCK = makeSymbol( "DEFINE-SIMPLE-EVALUATABLE-FUNCTION-TEST-BLOCK" );
    $list64 = ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "START-ID" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $kw65$ILL_FORMED = makeKeyword( "ILL-FORMED" );
    $const66$trueSubL = constant_handles.reader_make_constant_shell( makeString( "trueSubL" ) );
    $const67$SubLQuoteFn = constant_handles.reader_make_constant_shell( makeString( "SubLQuoteFn" ) );
    $sym68$CNOT = makeSymbol( "CNOT" );
    $sym69$EL_WFF_ = makeSymbol( "EL-WFF?" );
    $sym70$QUOTE = makeSymbol( "QUOTE" );
    $const71$evaluate = constant_handles.reader_make_constant_shell( makeString( "evaluate" ) );
    $sym72$_RESULT = makeSymbol( "?RESULT" );
    $kw73$UNEVALUATABLE = makeKeyword( "UNEVALUATABLE" );
    $const74$unknownSentence = constant_handles.reader_make_constant_shell( makeString( "unknownSentence" ) );
    $const75$thereExists = constant_handles.reader_make_constant_shell( makeString( "thereExists" ) );
    $const76$ist = constant_handles.reader_make_constant_shell( makeString( "ist" ) );
    $list77 = ConsesLow.list( makeSymbol( "EXPRESSION" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "RESULT" ), makeKeyword( "DONT-CARE" ) ) );
    $list78 = ConsesLow.list( makeSymbol( "PREDICATE" ), makeSymbol( "ID" ), makeSymbol( "SENTENCE" ), makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "RESULT" ), makeKeyword( "DONT-CARE" ) ), makeSymbol( "MT" ),
        ConsesLow.list( makeSymbol( "KB" ), makeKeyword( "FULL" ) ), makeSymbol( "OWNER" ) );
    $list79 = ConsesLow.list( makeKeyword( "RESULT" ), makeKeyword( "MT" ), makeKeyword( "KB" ), makeKeyword( "OWNER" ) );
    $sym80$DEFINE_SIMPLE_EVALUATABLE_PREDICATE_TEST_INT = makeSymbol( "DEFINE-SIMPLE-EVALUATABLE-PREDICATE-TEST-INT" );
    $sym81$DEFINE_SIMPLE_EVALUATABLE_PREDICATE_TEST = makeSymbol( "DEFINE-SIMPLE-EVALUATABLE-PREDICATE-TEST" );
    $list82 = ConsesLow.list( makeSymbol( "PREDICATE" ), makeSymbol( "START-ID" ), makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "MT" ), constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) ) ),
        ConsesLow.list( makeSymbol( "KB" ), makeKeyword( "FULL" ) ), makeSymbol( "OWNER" ), makeSymbol( "TESTS" ) );
    $list83 = ConsesLow.list( makeKeyword( "MT" ), makeKeyword( "KB" ), makeKeyword( "OWNER" ), makeKeyword( "TESTS" ) );
    $sym84$DEFINE_SIMPLE_EVALUATABLE_PREDICATE_TEST_BLOCK_INT = makeSymbol( "DEFINE-SIMPLE-EVALUATABLE-PREDICATE-TEST-BLOCK-INT" );
    $sym85$DEFINE_SIMPLE_EVALUATABLE_PREDICATE_TEST_BLOCK = makeSymbol( "DEFINE-SIMPLE-EVALUATABLE-PREDICATE-TEST-BLOCK" );
    $list86 = ConsesLow.list( makeSymbol( "PREDICATE" ), makeSymbol( "START-ID" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $const87$and = constant_handles.reader_make_constant_shell( makeString( "and" ) );
    $kw88$FALSE = makeKeyword( "FALSE" );
    $list89 = ConsesLow.list( makeSymbol( "SENTENCE" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "RESULT" ), makeKeyword( "TRUE" ) ) );
    $kw90$TRUE = makeKeyword( "TRUE" );
    $kw91$STANDARD = makeKeyword( "STANDARD" );
    $sym92$CYC_TEST_OUTPUT_FORMAT_P = makeSymbol( "CYC-TEST-OUTPUT-FORMAT-P" );
    $kw93$TERSE = makeKeyword( "TERSE" );
    $kw94$ERT = makeKeyword( "ERT" );
    $kw95$NOT_RUN = makeKeyword( "NOT-RUN" );
    $kw96$INVALID = makeKeyword( "INVALID" );
    $kw97$ERROR = makeKeyword( "ERROR" );
    $kw98$IGNORE_ERRORS_TARGET = makeKeyword( "IGNORE-ERRORS-TARGET" );
    $sym99$IGNORE_ERRORS_HANDLER = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $kw100$FAILURE = makeKeyword( "FAILURE" );
    $kw101$SUCCESS = makeKeyword( "SUCCESS" );
    $kw102$CACHE_INFERENCE_RESULTS_ = makeKeyword( "CACHE-INFERENCE-RESULTS?" );
    $kw103$BROWSABLE_ = makeKeyword( "BROWSABLE?" );
    $kw104$CONDITIONAL_SENTENCE_ = makeKeyword( "CONDITIONAL-SENTENCE?" );
    $kw105$NEW_TERMS_ALLOWED_ = makeKeyword( "NEW-TERMS-ALLOWED?" );
    $str106$___ERT__S__S____ = makeString( "~&:ERT ~S ~S -> " );
    $kw107$POST_BUILD = makeKeyword( "POST-BUILD" );
    $str108$Unknown_output_format__A = makeString( "Unknown output format ~A" );
    $str109$_ERT__S____3f___ = makeString( ":ERT ~S (~,3f)~%" );
  }

  public static final class $evaluatable_relation_test_native
      extends
        SubLStructNative
  {
    public SubLObject $relation;
    public SubLObject $id;
    public SubLObject $sentence;
    public SubLObject $kb;
    public SubLObject $owner;
    private static final SubLStructDeclNative structDecl;

    public $evaluatable_relation_test_native()
    {
      this.$relation = CommonSymbols.NIL;
      this.$id = CommonSymbols.NIL;
      this.$sentence = CommonSymbols.NIL;
      this.$kb = CommonSymbols.NIL;
      this.$owner = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $evaluatable_relation_test_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$relation;
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
      return this.$kb;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$owner;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$relation = value;
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
      return this.$kb = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$owner = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $evaluatable_relation_test_native.class, $sym0$EVALUATABLE_RELATION_TEST, $sym1$EVALUATABLE_RELATION_TEST_P, $list2, $list3, new String[] { "$relation", "$id",
        "$sentence", "$kb", "$owner"
      }, $list4, $list5, $sym6$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $evaluatable_relation_test_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $evaluatable_relation_test_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "EVALUATABLE-RELATION-TEST-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return evaluatable_relation_test_p( arg1 );
    }
  }

  public static final class $ert_id$UnaryFunction
      extends
        UnaryFunction
  {
    public $ert_id$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "ERT-ID" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return ert_id( arg1 );
    }
  }
}
/*
 * 
 * Total time: 300 ms
 * 
 */