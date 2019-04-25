package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class id_index
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.id_index";
  public static final String myFingerPrint = "2852b7796a403c18d7c80755e03d94b38080a4e917900ed85e350aa194835e0f";
  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 1888L)
  public static SubLSymbol $dtp_id_index$;
  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 5140L)
  private static SubLSymbol $id_index_default_scaling_factor$;
  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 5308L)
  private static SubLSymbol $id_index_equality_test$;
  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 7696L)
  private static SubLSymbol $id_index_empty_list$;
  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 32566L)
  private static SubLSymbol $cfasl_wide_opcode_id_index$;
  private static final SubLSymbol $sym0$ID_INDEX;
  private static final SubLSymbol $sym1$ID_INDEX_P;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$PRINT_ID_INDEX;
  private static final SubLSymbol $sym7$ID_INDEX_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$IDIX_LOCK;
  private static final SubLSymbol $sym10$_CSETF_IDIX_LOCK;
  private static final SubLSymbol $sym11$IDIX_COUNT;
  private static final SubLSymbol $sym12$_CSETF_IDIX_COUNT;
  private static final SubLSymbol $sym13$IDIX_NEXT_ID;
  private static final SubLSymbol $sym14$_CSETF_IDIX_NEXT_ID;
  private static final SubLSymbol $sym15$IDIX_DENSE_OBJECTS;
  private static final SubLSymbol $sym16$_CSETF_IDIX_DENSE_OBJECTS;
  private static final SubLSymbol $sym17$IDIX_SPARSE_OBJECTS;
  private static final SubLSymbol $sym18$_CSETF_IDIX_SPARSE_OBJECTS;
  private static final SubLSymbol $kw19$LOCK;
  private static final SubLSymbol $kw20$COUNT;
  private static final SubLSymbol $kw21$NEXT_ID;
  private static final SubLSymbol $kw22$DENSE_OBJECTS;
  private static final SubLSymbol $kw23$SPARSE_OBJECTS;
  private static final SubLString $str24$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw25$BEGIN;
  private static final SubLSymbol $sym26$MAKE_ID_INDEX;
  private static final SubLSymbol $kw27$SLOT;
  private static final SubLSymbol $kw28$END;
  private static final SubLSymbol $sym29$VISIT_DEFSTRUCT_OBJECT_ID_INDEX_METHOD;
  private static final SubLString $str30$COUNT_;
  private static final SubLString $str31$_NEXT_;
  private static final SubLSymbol $sym32$INTEGERP;
  private static final SubLString $str33$_A_has_had_next_id_reduced_from__;
  private static final SubLSymbol $sym34$ID_INDEX_DENSE_OBJECTS;
  private static final SubLSymbol $sym35$DO_ID_INDEX_DENSE_OBJECTS;
  private static final SubLSymbol $sym36$ID_INDEX_SPARSE_OBJECTS;
  private static final SubLSymbol $sym37$DO_ID_INDEX_SPARSE_OBJECTS;
  private static final SubLList $list38;
  private static final SubLSymbol $sym39$ID_INDEX_LOCK;
  private static final SubLSymbol $sym40$CLET;
  private static final SubLSymbol $sym41$ID_INDEX_LOCK;
  private static final SubLSymbol $sym42$WITH_LOCK_HELD;
  private static final SubLSymbol $sym43$WITH_ID_INDEX_LOCKED;
  private static final SubLInteger $int44$100;
  private static final SubLSymbol $sym45$NON_NEGATIVE_INTEGER_P;
  private static final SubLString $str46$ID_INDEX;
  private static final SubLString $str47$THE_EMPTY_LIST;
  private static final SubLSymbol $sym48$ID_INDEX_TOMBSTONE_P;
  private static final SubLSymbol $sym49$DO_ID_INDEX;
  private static final SubLSymbol $sym50$_EXIT;
  private static final SubLString $str51$Fill_cannot_extend_into_sparse_sp;
  private static final SubLList $list52;
  private static final SubLList $list53;
  private static final SubLList $list54;
  private static final SubLSymbol $sym55$ITERATE_ID_INDEX_DENSE_OBJECTS_NECESSARY;
  private static final SubLList $list56;
  private static final SubLSymbol $sym57$BOOLEAN;
  private static final SubLSymbol $sym58$ID_INDEX_SPARSE_OBJECTS_ORDERED_ITERATOR_DONE_;
  private static final SubLSymbol $sym59$ID_INDEX_SPARSE_OBJECTS_ORDERED_ITERATOR_NEXT;
  private static final SubLSymbol $kw60$KEY;
  private static final SubLSymbol $kw61$VALUE;
  private static final SubLList $list62;
  private static final SubLList $list63;
  private static final SubLList $list64;
  private static final SubLSymbol $kw65$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw66$TOMBSTONE;
  private static final SubLSymbol $kw67$SKIP;
  private static final SubLSymbol $kw68$ORDERED;
  private static final SubLSymbol $kw69$PROGRESS_MESSAGE;
  private static final SubLSymbol $kw70$DONE;
  private static final SubLSymbol $sym71$OLD_DO_ID_INDEX;
  private static final SubLSymbol $sym72$IDX;
  private static final SubLSymbol $sym73$PUNLESS;
  private static final SubLSymbol $sym74$ID_INDEX_OBJECTS_EMPTY_P;
  private static final SubLSymbol $sym75$IDX;
  private static final SubLSymbol $sym76$MESS;
  private static final SubLSymbol $sym77$TOTAL;
  private static final SubLSymbol $sym78$SOFAR;
  private static final SubLSymbol $sym79$ID_INDEX_COUNT;
  private static final SubLList $list80;
  private static final SubLSymbol $sym81$CHECK_TYPE;
  private static final SubLList $list82;
  private static final SubLSymbol $sym83$NOTING_PERCENT_PROGRESS;
  private static final SubLSymbol $sym84$CINC;
  private static final SubLSymbol $sym85$NOTE_PERCENT_PROGRESS;
  private static final SubLList $list86;
  private static final SubLList $list87;
  private static final SubLSymbol $sym88$IDX;
  private static final SubLSymbol $sym89$ID_INDEX_DENSE_OBJECTS_EMPTY_P;
  private static final SubLSymbol $sym90$DO_VECTOR_INDEX;
  private static final SubLSymbol $sym91$CAND;
  private static final SubLSymbol $sym92$ID_INDEX_SKIP_TOMBSTONES_P;
  private static final SubLSymbol $sym93$PWHEN;
  private static final SubLSymbol $sym94$CSETQ;
  private static final SubLSymbol $sym95$IDX;
  private static final SubLSymbol $sym96$MESS;
  private static final SubLSymbol $sym97$TOTAL;
  private static final SubLSymbol $sym98$SOFAR;
  private static final SubLSymbol $sym99$ID_INDEX_DENSE_OBJECT_COUNT;
  private static final SubLList $list100;
  private static final SubLSymbol $sym101$IDX;
  private static final SubLSymbol $sym102$MESS;
  private static final SubLSymbol $sym103$TOTAL;
  private static final SubLSymbol $sym104$SOFAR;
  private static final SubLSymbol $sym105$ID_INDEX_SPARSE_OBJECT_COUNT;
  private static final SubLSymbol $sym106$IDX;
  private static final SubLSymbol $sym107$PIF;
  private static final SubLSymbol $sym108$IDX;
  private static final SubLSymbol $sym109$SPARSE;
  private static final SubLSymbol $sym110$END_ID;
  private static final SubLSymbol $sym111$DEFAULT;
  private static final SubLSymbol $sym112$ID_INDEX_SPARSE_OBJECTS_EMPTY_P;
  private static final SubLSymbol $sym113$ID_INDEX_SPARSE_ID_THRESHOLD;
  private static final SubLSymbol $sym114$ID_INDEX_NEXT_ID;
  private static final SubLSymbol $sym115$FUNLESS;
  private static final SubLSymbol $sym116$WHILE;
  private static final SubLSymbol $sym117$_;
  private static final SubLSymbol $sym118$CNOT;
  private static final SubLSymbol $sym119$GETHASH_WITHOUT_VALUES;
  private static final SubLString $str120$Setting__TOMBSTONE_to__A_requires;
  private static final SubLSymbol $sym121$IDX;
  private static final SubLSymbol $sym122$DO_HASH_TABLE;
  private static final SubLSymbol $sym123$ID_INDEX_SPARSE_OBJECT_IDS;
  private static final SubLList $list124;
  private static final SubLList $list125;
  private static final SubLSymbol $kw126$START_ID;
  private static final SubLSymbol $kw127$END_ID;
  private static final SubLSymbol $sym128$IDX;
  private static final SubLSymbol $sym129$NEW_DO_ID_INDEX;
  private static final SubLSymbol $sym130$MESS;
  private static final SubLSymbol $sym131$TOTAL;
  private static final SubLSymbol $sym132$SOFAR;
  private static final SubLSymbol $sym133$TOMB;
  private static final SubLSymbol $sym134$ORD;
  private static final SubLSymbol $sym135$LAST_ID;
  private static final SubLSymbol $sym136$STATE_VAR;
  private static final SubLSymbol $sym137$__;
  private static final SubLSymbol $sym138$FIF;
  private static final SubLSymbol $sym139$_;
  private static final SubLList $list140;
  private static final SubLList $list141;
  private static final SubLSymbol $sym142$DO_ID_INDEX_NEXT_ID;
  private static final SubLSymbol $sym143$DO_ID_INDEX_NEXT_STATE;
  private static final SubLSymbol $sym144$DO_ID_INDEX_STATE_OBJECT;
  private static final SubLSymbol $sym145$DO_ID_INDEX_OBJECT_VALID_;
  private static final SubLString $str146$unexpected_new_do_id_index_iterat;
  private static final SubLInteger $int147$128;
  private static final SubLSymbol $sym148$CFASL_INPUT_ID_INDEX;
  private static final SubLSymbol $sym149$CFASL_OUTPUT_OBJECT_ID_INDEX_METHOD;
  private static final SubLString $str150$Expected__A_dense_elements__got__;
  private static final SubLString $str151$Expected__A_sparse_elements__got_;
  private static final SubLString $str152$The_sparse_ID_index_should_have__;
  private static final SubLString $str153$The_sparse_ID_index_should_have_a;
  private static final SubLSymbol $sym154$TEST_ID_INDEX_CFASL_SERIALIZATION;
  private static final SubLSymbol $kw155$TEST;
  private static final SubLSymbol $kw156$OWNER;
  private static final SubLSymbol $kw157$CLASSES;
  private static final SubLSymbol $kw158$KB;
  private static final SubLSymbol $kw159$TINY;
  private static final SubLSymbol $kw160$WORKING_;
  private static final SubLList $list161;
  private static final SubLSymbol $sym162$TO_STRING;
  private static final SubLString $str163$We_did_not_get_an_ID_index_back__;
  private static final SubLString $str164$The_dense_ID_index__A_does_not_ha;
  private static final SubLSymbol $kw165$SUCCESS;
  private static final SubLSymbol $sym166$ID_INDEX_PESSIMIZED_P;
  private static final SubLString $str167$Compacting_ID_index;
  private static final SubLSymbol $sym168$STRINGP;
  private static final SubLSymbol $sym169$FUNCTION_SPEC_P;
  private static final SubLString $str170$Updating_object_IDs;
  private static final SubLSymbol $kw171$ALL;
  private static final SubLList $list172;
  private static final SubLString $str173$Type_must_be_one_of_____ALL__DENS;
  private static final SubLSymbol $kw174$SPARSE;
  private static final SubLList $list175;
  private static final SubLSymbol $kw176$DENSE;
  private static final SubLSymbol $sym177$TEST_ID_INDEX_MISSING_IDS;
  private static final SubLList $list178;
  private static final SubLString $str179$ID__A_is_missing__it_is__A_;
  private static final SubLString $str180$expected_to_be_present;
  private static final SubLString $str181$expected_to_be_absent;
  private static final SubLList $list182;
  private static final SubLSymbol $sym183$TEST_NEW_INDEX_FROM_REVERSE_INDEX;
  private static final SubLString $str184$The_dense_ID_index__A_is_of_a_dif;
  private static final SubLSymbol $kw185$NOT_FOUND;
  private static final SubLString $str186$The_reverse_index_for__A_does_not;
  private static final SubLString $str187$The_new_ID_index_does_not_have__A;
  private static final SubLString $str188$There_is_a_mismatch_between_the__;
  private static final SubLSymbol $sym189$TEST_DO_ID_INDEX_WITH_TOMBSTONES;
  private static final SubLSymbol $kw190$RIP;
  private static final SubLString $str191$Error__the_ID_range_is_not_truely;
  private static final SubLString $str192$Error_at_index__A__expected_tombs;
  private static final SubLString $str193$Error_at_index__A__expected_objec;
  private static final SubLString $str194$There_are_holes_that_we_did_not_s;
  private static final SubLString $str195$Error__ID__A_is_not_in_line_with_;
  private static final SubLString $str196$_DONE_should_have_taken_us_to__A_;
  private static final SubLString $str197$Hey__we_deleted_everything_and_th;
  private static final SubLString $str198$Error__an_empty_ID_index_contains;
  private static final SubLString $str199$Hey___A______A__they_did_not_show;
  private static final SubLSymbol $sym200$TEST_ID_INDEX_WITH_SWIZZLING;
  private static final SubLList $list201;
  private static final SubLString $str202$The_test_is_badly_designed__no_bi;
  private static final SubLString $str203$;
  private static final SubLString $str204$We_could_not_retrieve__S_from_the;
  private static final SubLSymbol $sym205$TEST_ID_INDEX_ORDERED_ITERATION;
  private static final SubLList $list206;
  private static final SubLString $str207$We_expected_something_larger_than;
  private static final SubLString $str208$a;
  private static final SubLString $str209$b;
  private static final SubLString $str210$c;
  private static final SubLList $list211;
  private static final SubLString $str212$d;
  private static final SubLString $str213$e;
  private static final SubLSymbol $kw214$ID_INDEX_RELOOKUP_FAILURE;
  private static final SubLSymbol $kw215$ID_INDEX_RECOUNT_FAILURE;
  private static final SubLSymbol $kw216$DO_ID_INDEX_FAILURE;
  private static final SubLSymbol $kw217$ID_INDEX_LOOKUP_FAILURE;
  private static final SubLSymbol $kw218$ID_INDEX_COUNT_FAILURE;
  private static final SubLSymbol $kw219$INITIAL_ID_INDEX_COUNT_FAILURE;
  private static final SubLSymbol $kw220$UNEXPECTED_FAILURE;
  private static final SubLSymbol $sym221$TEST_PESSIMIZE_ID_INDEX;
  private static final SubLList $list222;
  private static final SubLList $list223;
  private static final SubLInteger $int224$212;
  static boolean assertionsDisabledSynth = true;

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 1888L)
  public static SubLObject id_index_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_id_index( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 1888L)
  public static SubLObject id_index_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $id_index_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 1888L)
  public static SubLObject idix_lock(final SubLObject v_object)
  {
    assert NIL != id_index_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 1888L)
  public static SubLObject idix_count(final SubLObject v_object)
  {
    assert NIL != id_index_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 1888L)
  public static SubLObject idix_next_id(final SubLObject v_object)
  {
    assert NIL != id_index_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 1888L)
  public static SubLObject idix_dense_objects(final SubLObject v_object)
  {
    assert NIL != id_index_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 1888L)
  public static SubLObject idix_sparse_objects(final SubLObject v_object)
  {
    assert NIL != id_index_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 1888L)
  public static SubLObject _csetf_idix_lock(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != id_index_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 1888L)
  public static SubLObject _csetf_idix_count(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != id_index_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 1888L)
  public static SubLObject _csetf_idix_next_id(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != id_index_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 1888L)
  public static SubLObject _csetf_idix_dense_objects(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != id_index_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 1888L)
  public static SubLObject _csetf_idix_sparse_objects(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != id_index_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 1888L)
  public static SubLObject make_id_index(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $id_index_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw19$LOCK ) )
      {
        _csetf_idix_lock( v_new, current_value );
      }
      else if( pcase_var.eql( $kw20$COUNT ) )
      {
        _csetf_idix_count( v_new, current_value );
      }
      else if( pcase_var.eql( $kw21$NEXT_ID ) )
      {
        _csetf_idix_next_id( v_new, current_value );
      }
      else if( pcase_var.eql( $kw22$DENSE_OBJECTS ) )
      {
        _csetf_idix_dense_objects( v_new, current_value );
      }
      else if( pcase_var.eql( $kw23$SPARSE_OBJECTS ) )
      {
        _csetf_idix_sparse_objects( v_new, current_value );
      }
      else
      {
        Errors.error( $str24$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 1888L)
  public static SubLObject visit_defstruct_id_index(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw25$BEGIN, $sym26$MAKE_ID_INDEX, FIVE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw27$SLOT, $kw19$LOCK, idix_lock( obj ) );
    Functions.funcall( visitor_fn, obj, $kw27$SLOT, $kw20$COUNT, idix_count( obj ) );
    Functions.funcall( visitor_fn, obj, $kw27$SLOT, $kw21$NEXT_ID, idix_next_id( obj ) );
    Functions.funcall( visitor_fn, obj, $kw27$SLOT, $kw22$DENSE_OBJECTS, idix_dense_objects( obj ) );
    Functions.funcall( visitor_fn, obj, $kw27$SLOT, $kw23$SPARSE_OBJECTS, idix_sparse_objects( obj ) );
    Functions.funcall( visitor_fn, obj, $kw28$END, $sym26$MAKE_ID_INDEX, FIVE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 1888L)
  public static SubLObject visit_defstruct_object_id_index_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_id_index( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 2220L)
  public static SubLObject print_id_index(final SubLObject v_id_index, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != print_high.$print_readably$.getDynamicValue( thread ) )
    {
      print_high.print_not_readable( v_id_index, stream );
    }
    else
    {
      print_macros.print_unreadable_object_preamble( stream, v_id_index, T, T );
      streams_high.write_string( $str30$COUNT_, stream, UNPROVIDED, UNPROVIDED );
      print_high.princ( id_index_count( v_id_index ), stream );
      print_high.princ( $str31$_NEXT_, stream );
      print_high.princ( id_index_next_id( v_id_index ), stream );
      print_macros.print_unreadable_object_postamble( stream, v_id_index, NIL, NIL );
    }
    return v_id_index;
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 2521L)
  public static SubLObject id_index_count(final SubLObject v_id_index)
  {
    assert NIL != id_index_p( v_id_index ) : v_id_index;
    return idix_count( v_id_index );
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 2740L)
  public static SubLObject id_index_empty_p(final SubLObject v_id_index)
  {
    return Numbers.numE( ZERO_INTEGER, id_index_count( v_id_index ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 2861L)
  public static SubLObject id_index_dense_object_count(final SubLObject v_id_index)
  {
    assert NIL != id_index_p( v_id_index ) : v_id_index;
    return Numbers.subtract( id_index_count( v_id_index ), id_index_sparse_object_count( v_id_index ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 3085L)
  public static SubLObject id_index_sparse_object_count(final SubLObject v_id_index)
  {
    assert NIL != id_index_p( v_id_index ) : v_id_index;
    return Hashtables.hash_table_count( id_index_sparse_objects( v_id_index ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 3292L)
  public static SubLObject id_index_sparse_id_threshold(final SubLObject v_id_index)
  {
    assert NIL != id_index_p( v_id_index ) : v_id_index;
    return Sequences.length( id_index_dense_objects( v_id_index ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 3497L)
  public static SubLObject id_index_next_id(final SubLObject v_id_index)
  {
    assert NIL != id_index_p( v_id_index ) : v_id_index;
    return idix_next_id( v_id_index );
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 3674L)
  public static SubLObject set_id_index_next_id(final SubLObject v_id_index, final SubLObject next_id)
  {
    assert NIL != id_index_p( v_id_index ) : v_id_index;
    assert NIL != Types.integerp( next_id ) : next_id;
    if( next_id.numL( idix_next_id( v_id_index ) ) && NIL != subl_promotions.positive_integer_p( idix_count( v_id_index ) ) )
    {
      Errors.warn( $str33$_A_has_had_next_id_reduced_from__, v_id_index, idix_next_id( v_id_index ), next_id );
    }
    _csetf_idix_next_id( v_id_index, next_id );
    return next_id;
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 4158L)
  public static SubLObject id_index_dense_objects(final SubLObject v_id_index)
  {
    assert NIL != id_index_p( v_id_index ) : v_id_index;
    return idix_dense_objects( v_id_index );
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 4404L)
  public static SubLObject id_index_sparse_objects(final SubLObject v_id_index)
  {
    assert NIL != id_index_p( v_id_index ) : v_id_index;
    return idix_sparse_objects( v_id_index );
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 4657L)
  public static SubLObject with_id_index_locked(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject v_id_index = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list38 );
    v_id_index = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    final SubLObject id_index_lock = $sym39$ID_INDEX_LOCK;
    return ConsesLow.list( $sym40$CLET, ConsesLow.list( ConsesLow.list( id_index_lock, ConsesLow.list( $sym41$ID_INDEX_LOCK, v_id_index ) ) ), ConsesLow.listS( $sym42$WITH_LOCK_HELD, ConsesLow.list( id_index_lock ),
        ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 4933L)
  public static SubLObject id_index_lock(final SubLObject v_id_index)
  {
    return idix_lock( v_id_index );
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 5628L)
  public static SubLObject convert_id_index_key_test(final SubLObject v_id_index, SubLObject from, SubLObject to)
  {
    if( from == UNPROVIDED )
    {
      from = EQL;
    }
    if( to == UNPROVIDED )
    {
      to = EQ;
    }
    assert NIL != id_index_p( v_id_index ) : v_id_index;
    final SubLObject sparse_objects_table = id_index_sparse_objects( v_id_index );
    if( sparse_objects_table.isHashtable() )
    {
      final SubLObject test = hash_table_utilities.hash_test_to_symbol( Hashtables.hash_table_test( sparse_objects_table ) );
      final SubLObject from_test = hash_table_utilities.hash_test_to_symbol( from );
      if( from_test.eql( test ) )
      {
        final SubLObject sparse_table = Hashtables.make_hash_table( Hashtables.hash_table_size( sparse_objects_table ), to, UNPROVIDED );
        SubLObject key = NIL;
        SubLObject value = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( sparse_objects_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            key = Hashtables.getEntryKey( cdohash_entry );
            value = Hashtables.getEntryValue( cdohash_entry );
            Hashtables.sethash( key, sparse_table, value );
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
        _csetf_idix_sparse_objects( v_id_index, sparse_table );
        return T;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 6334L)
  public static SubLObject new_id_index(SubLObject dense_objects_size, SubLObject initial_next_id)
  {
    if( dense_objects_size == UNPROVIDED )
    {
      dense_objects_size = ZERO_INTEGER;
    }
    if( initial_next_id == UNPROVIDED )
    {
      initial_next_id = ZERO_INTEGER;
    }
    assert NIL != subl_promotions.non_negative_integer_p( initial_next_id ) : initial_next_id;
    assert NIL != subl_promotions.non_negative_integer_p( dense_objects_size ) : dense_objects_size;
    final SubLObject sparse_objects_size = Numbers.max( TEN_INTEGER, Numbers.integerDivide( dense_objects_size, $id_index_default_scaling_factor$.getGlobalValue() ) );
    final SubLObject v_id_index = make_id_index( UNPROVIDED );
    final SubLObject lock = Locks.make_lock( $str46$ID_INDEX );
    final SubLObject dense_objects = Vectors.make_vector( dense_objects_size, NIL );
    final SubLObject sparse_objects = Hashtables.make_hash_table( sparse_objects_size, $id_index_equality_test$.getGlobalValue(), UNPROVIDED );
    _csetf_idix_lock( v_id_index, lock );
    _csetf_idix_count( v_id_index, ZERO_INTEGER );
    _csetf_idix_next_id( v_id_index, initial_next_id );
    _csetf_idix_dense_objects( v_id_index, dense_objects );
    _csetf_idix_sparse_objects( v_id_index, sparse_objects );
    return v_id_index;
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 7313L)
  public static SubLObject id_index_reserve(final SubLObject v_id_index)
  {
    assert NIL != id_index_p( v_id_index ) : v_id_index;
    SubLObject id = NIL;
    final SubLObject id_index_lock = id_index_lock( v_id_index );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( id_index_lock );
      final SubLObject next_id = id_index_next_id( v_id_index );
      _csetf_idix_next_id( v_id_index, Numbers.add( idix_next_id( v_id_index ), ONE_INTEGER ) );
      id = next_id;
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( id_index_lock );
      }
    }
    return id;
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 7821L)
  public static SubLObject id_index_empty_list()
  {
    return $id_index_empty_list$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 7891L)
  public static SubLObject id_index_empty_list_p(final SubLObject v_object)
  {
    return uninterned_symbols_with_same_name_p( v_object, id_index_empty_list() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 8014L)
  public static SubLObject uninterned_symbols_with_same_name_p(final SubLObject symbol1, final SubLObject symbol2)
  {
    return makeBoolean( symbol1.isSymbol() && NIL == Symbols.symbol_package( symbol1 ) && ( symbol1.eql( symbol2 ) || ( symbol2.isSymbol() && NIL == Symbols.symbol_package( symbol2 ) && Symbols.symbol_name( symbol1 )
        .equal( Symbols.symbol_name( symbol2 ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 8406L)
  public static SubLObject id_index_tombstone()
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 8492L)
  public static SubLObject id_index_tombstone_p(final SubLObject v_object)
  {
    return Equality.eq( v_object, id_index_tombstone() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 8608L)
  public static SubLObject id_index_lookup(final SubLObject v_id_index, final SubLObject id, SubLObject v_default)
  {
    if( v_default == UNPROVIDED )
    {
      v_default = NIL;
    }
    final SubLObject result = id_index_lookup_int( v_id_index, id );
    if( NIL != id_index_tombstone_p( result ) )
    {
      return v_default;
    }
    if( NIL != id_index_empty_list_p( result ) )
    {
      return NIL;
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 8869L)
  public static SubLObject id_index_lookup_int(final SubLObject v_id_index, final SubLObject id)
  {
    assert NIL != id_index_p( v_id_index ) : v_id_index;
    assert NIL != Types.integerp( id ) : id;
    if( NIL != id_index_dense_object_id_p( v_id_index, id ) )
    {
      final SubLObject dense_objects = id_index_dense_objects( v_id_index );
      return Vectors.aref( dense_objects, id );
    }
    final SubLObject sparse_objects = id_index_sparse_objects( v_id_index );
    return Hashtables.gethash_without_values( id, sparse_objects, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 9307L)
  public static SubLObject id_index_enter(final SubLObject v_id_index, final SubLObject id, final SubLObject v_object)
  {
    final SubLObject id_index_lock = id_index_lock( v_id_index );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( id_index_lock );
      id_index_enter_unlocked( v_id_index, id, v_object );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( id_index_lock );
      }
    }
    return v_id_index;
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 9578L)
  public static SubLObject id_index_enter_unlocked(final SubLObject v_id_index, final SubLObject id, final SubLObject v_object)
  {
    assert NIL != id_index_p( v_id_index ) : v_id_index;
    assert NIL != Types.integerp( id ) : id;
    final SubLObject existing = id_index_lookup_int( v_id_index, id );
    final SubLObject dwimmed_object = ( NIL != v_object ) ? v_object : id_index_empty_list();
    if( NIL != id_index_dense_object_id_p( v_id_index, id ) )
    {
      final SubLObject dense_objects = id_index_dense_objects( v_id_index );
      Vectors.set_aref( dense_objects, id, dwimmed_object );
    }
    else
    {
      final SubLObject sparse_objects = get_appropriate_id_index_sparse_objects( v_id_index, id );
      Hashtables.sethash( id, sparse_objects, dwimmed_object );
    }
    if( NIL != id_index_tombstone_p( existing ) )
    {
      _csetf_idix_count( v_id_index, Numbers.add( idix_count( v_id_index ), ONE_INTEGER ) );
    }
    if( id.numGE( idix_next_id( v_id_index ) ) )
    {
      _csetf_idix_next_id( v_id_index, Numbers.add( ONE_INTEGER, id ) );
    }
    return v_id_index;
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 10532L)
  public static SubLObject get_appropriate_id_index_sparse_objects(final SubLObject v_id_index, final SubLObject id)
  {
    SubLObject sparse_objects = id_index_sparse_objects( v_id_index );
    if( !id.isFixnum() )
    {
      convert_id_index_key_test( v_id_index, EQ, EQL );
      sparse_objects = id_index_sparse_objects( v_id_index );
    }
    return sparse_objects;
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 11056L)
  public static SubLObject id_index_enter_autoextend(final SubLObject v_id_index, final SubLObject id, final SubLObject v_object, SubLObject extend_if_pessimizedP)
  {
    if( extend_if_pessimizedP == UNPROVIDED )
    {
      extend_if_pessimizedP = T;
    }
    id_index_enter( v_id_index, id, v_object );
    return id_index_possibly_autoextend( v_id_index, id, extend_if_pessimizedP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 11532L)
  public static SubLObject id_index_enter_unlocked_autoextend(final SubLObject v_id_index, final SubLObject id, final SubLObject v_object, SubLObject extend_if_pessimizedP)
  {
    if( extend_if_pessimizedP == UNPROVIDED )
    {
      extend_if_pessimizedP = T;
    }
    id_index_enter_unlocked( v_id_index, id, v_object );
    return id_index_possibly_autoextend( v_id_index, id, extend_if_pessimizedP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 12041L)
  public static SubLObject id_index_possibly_autoextend(final SubLObject v_id_index, final SubLObject id, final SubLObject extend_if_pessimizedP)
  {
    if( NIL == extend_if_pessimizedP && NIL != id_index_pessimized_p( v_id_index ) )
    {
      return v_id_index;
    }
    final SubLObject threshold = id_index_sparse_id_threshold( v_id_index );
    if( number_utilities.f_1X( id ).numGE( threshold ) )
    {
      optimize_id_index( v_id_index, number_utilities.f_2X( Numbers.max( threshold, id ) ) );
    }
    return v_id_index;
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 12582L)
  public static SubLObject id_index_remove(final SubLObject v_id_index, final SubLObject id)
  {
    assert NIL != id_index_p( v_id_index ) : v_id_index;
    assert NIL != Types.integerp( id ) : id;
    final SubLObject id_index_lock = id_index_lock( v_id_index );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( id_index_lock );
      final SubLObject existing = id_index_lookup_int( v_id_index, id );
      if( NIL != id_index_dense_object_id_p( v_id_index, id ) )
      {
        final SubLObject dense_objects = id_index_dense_objects( v_id_index );
        Vectors.set_aref( dense_objects, id, id_index_tombstone() );
      }
      else
      {
        final SubLObject sparse_objects = id_index_sparse_objects( v_id_index );
        Hashtables.remhash( id, sparse_objects );
      }
      if( NIL == id_index_tombstone_p( existing ) )
      {
        _csetf_idix_count( v_id_index, Numbers.subtract( idix_count( v_id_index ), ONE_INTEGER ) );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( id_index_lock );
      }
    }
    return v_id_index;
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 13251L)
  public static SubLObject clear_id_index(final SubLObject v_id_index)
  {
    assert NIL != id_index_p( v_id_index ) : v_id_index;
    final SubLObject id_index_lock = id_index_lock( v_id_index );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( id_index_lock );
      _csetf_idix_count( v_id_index, ZERO_INTEGER );
      Sequences.fill( id_index_dense_objects( v_id_index ), NIL, UNPROVIDED, UNPROVIDED );
      Hashtables.clrhash( id_index_sparse_objects( v_id_index ) );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( id_index_lock );
      }
    }
    return v_id_index;
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 13558L)
  public static SubLObject fill_id_index_dense_space(final SubLObject v_id_index, final SubLObject value, SubLObject end)
  {
    if( end == UNPROVIDED )
    {
      end = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != id_index_p( v_id_index ) : v_id_index;
    final SubLObject id_index_lock = id_index_lock( v_id_index );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( id_index_lock );
      if( NIL == end )
      {
        end = Sequences.length( id_index_dense_objects( v_id_index ) );
      }
      if( end.isZero() )
      {
        return v_id_index;
      }
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == id_index_dense_object_id_p( v_id_index, Numbers.subtract( end, ONE_INTEGER ) ) )
      {
        Errors.error( $str51$Fill_cannot_extend_into_sparse_sp );
      }
      Sequences.fill( id_index_dense_objects( v_id_index ), value, ZERO_INTEGER, end );
      if( id_index_next_id( v_id_index ).numL( end ) )
      {
        set_id_index_next_id( v_id_index, end );
      }
      if( id_index_count( v_id_index ).numL( end ) )
      {
        _csetf_idix_count( v_id_index, end );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( id_index_lock );
      }
    }
    return v_id_index;
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 14313L)
  public static SubLObject id_index_dense_object_id_p(final SubLObject v_id_index, final SubLObject id)
  {
    return makeBoolean( !id.isNegative() && id.numL( id_index_sparse_id_threshold( v_id_index ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 14473L)
  public static SubLObject new_id_index_iterator(final SubLObject v_id_index)
  {
    assert NIL != id_index_p( v_id_index ) : v_id_index;
    return iteration.new_factory_iterator( $list52, ConsesLow.list( v_id_index ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 14820L)
  public static SubLObject new_id_index_values_iterator(final SubLObject v_id_index)
  {
    assert NIL != id_index_p( v_id_index ) : v_id_index;
    return iteration.new_factory_iterator( $list53, ConsesLow.list( v_id_index ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 15103L)
  public static SubLObject new_id_index_ordered_iterator(final SubLObject v_id_index)
  {
    assert NIL != id_index_p( v_id_index ) : v_id_index;
    return iteration.new_factory_iterator( $list54, ConsesLow.list( v_id_index ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 15464L)
  public static SubLObject new_id_index_dense_objects_iterator(final SubLObject v_id_index)
  {
    assert NIL != id_index_p( v_id_index ) : v_id_index;
    final SubLObject dense_objects = id_index_dense_objects( v_id_index );
    final SubLObject subiterator = iteration.new_vector_index_iterator( dense_objects );
    return iteration.new_filter_iterator( subiterator, $sym55$ITERATE_ID_INDEX_DENSE_OBJECTS_NECESSARY, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 16029L)
  public static SubLObject iterate_id_index_dense_objects_necessary(final SubLObject entry)
  {
    SubLObject id = NIL;
    SubLObject value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( entry, entry, $list56 );
    id = entry.first();
    SubLObject current = entry.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, entry, $list56 );
    value = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return makeBoolean( NIL == id_index_tombstone_p( value ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( entry, $list56 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 16199L)
  public static SubLObject new_id_index_dense_objects_values_iterator(final SubLObject v_id_index)
  {
    assert NIL != id_index_p( v_id_index ) : v_id_index;
    final SubLObject dense_objects = id_index_dense_objects( v_id_index );
    final SubLObject subiterator = iteration.new_vector_iterator( dense_objects );
    return iteration.new_filter_iterator( subiterator, $sym57$BOOLEAN, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 16548L)
  public static SubLObject new_id_index_sparse_objects_iterator(final SubLObject v_id_index)
  {
    assert NIL != id_index_p( v_id_index ) : v_id_index;
    final SubLObject sparse_objects = id_index_sparse_objects( v_id_index );
    return iteration.new_hash_table_iterator( sparse_objects );
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 16829L)
  public static SubLObject new_id_index_sparse_objects_values_iterator(final SubLObject v_id_index)
  {
    assert NIL != id_index_p( v_id_index ) : v_id_index;
    final SubLObject sparse_objects = id_index_sparse_objects( v_id_index );
    return iteration.new_hash_table_values_iterator( sparse_objects );
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 17121L)
  public static SubLObject new_id_index_sparse_objects_ordered_iterator(final SubLObject v_id_index)
  {
    assert NIL != id_index_p( v_id_index ) : v_id_index;
    if( NIL != id_index_sparse_objects_empty_p( v_id_index ) )
    {
      return iteration.new_null_iterator();
    }
    return iteration.new_iterator( make_id_index_sparse_objects_ordered_iterator_state( v_id_index ), $sym58$ID_INDEX_SPARSE_OBJECTS_ORDERED_ITERATOR_DONE_, $sym59$ID_INDEX_SPARSE_OBJECTS_ORDERED_ITERATOR_NEXT,
        UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 17751L)
  public static SubLObject make_id_index_sparse_objects_ordered_iterator_state(final SubLObject v_id_index)
  {
    final SubLObject id = id_index_sparse_id_threshold( v_id_index );
    final SubLObject sparse_objects = id_index_sparse_objects( v_id_index );
    final SubLObject end_id = id_index_next_id( v_id_index );
    final SubLObject key_value_tuple = ConsesLow.list( $kw60$KEY, $kw61$VALUE );
    return ConsesLow.list( id, sparse_objects, end_id, key_value_tuple );
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 18147L)
  public static SubLObject id_index_sparse_objects_ordered_iterator_doneP(final SubLObject state)
  {
    SubLObject id = NIL;
    SubLObject sparse_objects = NIL;
    SubLObject end_id = NIL;
    SubLObject key_value_tuple = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( state, state, $list62 );
    id = state.first();
    SubLObject current = state.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list62 );
    sparse_objects = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list62 );
    end_id = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list62 );
    key_value_tuple = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return makeBoolean( !id.numL( end_id ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( state, $list62 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 18383L)
  public static SubLObject id_index_sparse_objects_ordered_iterator_next(final SubLObject state)
  {
    SubLObject id = NIL;
    SubLObject sparse_objects = NIL;
    SubLObject end_id = NIL;
    SubLObject key_value_tuple = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( state, state, $list62 );
    id = state.first();
    SubLObject current = state.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list62 );
    sparse_objects = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list62 );
    end_id = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list62 );
    key_value_tuple = current.first();
    current = current.rest();
    if( NIL == current )
    {
      SubLObject v_object = id_index_tombstone();
      SubLObject spot = id;
      while ( id.numL( end_id ) && NIL != id_index_tombstone_p( v_object ))
      {
        v_object = Hashtables.gethash_without_values( id, sparse_objects, id_index_tombstone() );
        spot = id;
        id = Numbers.add( id, ONE_INTEGER );
      }
      ConsesLow.set_nth( ZERO_INTEGER, state, id );
      ConsesLow.set_nth( ZERO_INTEGER, key_value_tuple, spot );
      ConsesLow.set_nth( ONE_INTEGER, key_value_tuple, v_object );
      return Values.values( key_value_tuple, state, id_index_sparse_objects_ordered_iterator_doneP( state ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( state, $list62 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 19080L)
  public static SubLObject do_id_index(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list63 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject id = NIL;
    SubLObject v_object = NIL;
    SubLObject v_id_index = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list63 );
    id = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list63 );
    v_object = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list63 );
    v_id_index = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list63 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list63 );
      if( NIL == conses_high.member( current_$1, $list64, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw65$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list63 );
    }
    final SubLObject tombstone_tail = cdestructuring_bind.property_list_member( $kw66$TOMBSTONE, current );
    final SubLObject tombstone = ( NIL != tombstone_tail ) ? conses_high.cadr( tombstone_tail ) : $kw67$SKIP;
    final SubLObject ordered_tail = cdestructuring_bind.property_list_member( $kw68$ORDERED, current );
    final SubLObject ordered = ( NIL != ordered_tail ) ? conses_high.cadr( ordered_tail ) : NIL;
    final SubLObject progress_message_tail = cdestructuring_bind.property_list_member( $kw69$PROGRESS_MESSAGE, current );
    final SubLObject progress_message = ( NIL != progress_message_tail ) ? conses_high.cadr( progress_message_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw70$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym71$OLD_DO_ID_INDEX, ConsesLow.list( new SubLObject[] { id, v_object, v_id_index, $kw66$TOMBSTONE, tombstone, $kw68$ORDERED, ordered, $kw69$PROGRESS_MESSAGE, progress_message, $kw70$DONE,
      done
    } ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 19888L)
  public static SubLObject old_do_id_index(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list63 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject id = NIL;
    SubLObject v_object = NIL;
    SubLObject v_id_index = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list63 );
    id = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list63 );
    v_object = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list63 );
    v_id_index = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$2 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list63 );
      current_$2 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list63 );
      if( NIL == conses_high.member( current_$2, $list64, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$2 == $kw65$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list63 );
    }
    final SubLObject tombstone_tail = cdestructuring_bind.property_list_member( $kw66$TOMBSTONE, current );
    final SubLObject tombstone = ( NIL != tombstone_tail ) ? conses_high.cadr( tombstone_tail ) : $kw67$SKIP;
    final SubLObject ordered_tail = cdestructuring_bind.property_list_member( $kw68$ORDERED, current );
    final SubLObject ordered = ( NIL != ordered_tail ) ? conses_high.cadr( ordered_tail ) : NIL;
    final SubLObject progress_message_tail = cdestructuring_bind.property_list_member( $kw69$PROGRESS_MESSAGE, current );
    final SubLObject progress_message = ( NIL != progress_message_tail ) ? conses_high.cadr( progress_message_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw70$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    if( NIL == progress_message )
    {
      final SubLObject idx = $sym72$IDX;
      return ConsesLow.list( $sym40$CLET, ConsesLow.list( ConsesLow.list( idx, v_id_index ) ), ConsesLow.list( $sym73$PUNLESS, ConsesLow.list( $sym74$ID_INDEX_OBJECTS_EMPTY_P, idx, tombstone ), ConsesLow.listS(
          $sym35$DO_ID_INDEX_DENSE_OBJECTS, ConsesLow.list( id, v_object, idx, $kw70$DONE, done, $kw66$TOMBSTONE, tombstone ), ConsesLow.append( body, NIL ) ), ConsesLow.listS( $sym37$DO_ID_INDEX_SPARSE_OBJECTS,
              ConsesLow.list( new SubLObject[]
              { id, v_object, idx, $kw68$ORDERED, ordered, $kw66$TOMBSTONE, tombstone, $kw70$DONE, done
              } ), ConsesLow.append( body, NIL ) ) ) );
    }
    final SubLObject idx = $sym75$IDX;
    final SubLObject mess = $sym76$MESS;
    final SubLObject total = $sym77$TOTAL;
    final SubLObject sofar = $sym78$SOFAR;
    return ConsesLow.list( $sym40$CLET, ConsesLow.list( ConsesLow.list( idx, v_id_index ), ConsesLow.list( mess, progress_message ), ConsesLow.list( total, ConsesLow.list( $sym79$ID_INDEX_COUNT, idx ) ), reader.bq_cons(
        sofar, $list80 ) ), ConsesLow.listS( $sym81$CHECK_TYPE, mess, $list82 ), ConsesLow.list( $sym83$NOTING_PERCENT_PROGRESS, mess, ConsesLow.listS( $sym49$DO_ID_INDEX, ConsesLow.list( id, v_object, idx, $kw70$DONE,
            done, $kw68$ORDERED, ordered ), ConsesLow.append( body, ConsesLow.list( ConsesLow.list( $sym84$CINC, sofar ), ConsesLow.list( $sym85$NOTE_PERCENT_PROGRESS, sofar, total ) ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 21245L)
  public static SubLObject id_index_objects_empty_p(final SubLObject v_id_index, final SubLObject tombstone)
  {
    if( NIL != id_index_skip_tombstones_p( tombstone ) )
    {
      return id_index_empty_p( v_id_index );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 21437L)
  public static SubLObject do_id_index_dense_objects(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list86 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject id = NIL;
    SubLObject v_object = NIL;
    SubLObject v_id_index = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list86 );
    id = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list86 );
    v_object = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list86 );
    v_id_index = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$3 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list86 );
      current_$3 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list86 );
      if( NIL == conses_high.member( current_$3, $list87, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$3 == $kw65$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list86 );
    }
    final SubLObject tombstone_tail = cdestructuring_bind.property_list_member( $kw66$TOMBSTONE, current );
    final SubLObject tombstone = ( NIL != tombstone_tail ) ? conses_high.cadr( tombstone_tail ) : $kw67$SKIP;
    final SubLObject progress_message_tail = cdestructuring_bind.property_list_member( $kw69$PROGRESS_MESSAGE, current );
    final SubLObject progress_message = ( NIL != progress_message_tail ) ? conses_high.cadr( progress_message_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw70$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    if( NIL == progress_message )
    {
      final SubLObject idx = $sym88$IDX;
      return ConsesLow.list( $sym40$CLET, ConsesLow.list( ConsesLow.list( idx, v_id_index ) ), ConsesLow.list( $sym73$PUNLESS, ConsesLow.list( $sym89$ID_INDEX_DENSE_OBJECTS_EMPTY_P, idx, tombstone ), ConsesLow.list(
          $sym90$DO_VECTOR_INDEX, ConsesLow.list( id, v_object, ConsesLow.list( $sym34$ID_INDEX_DENSE_OBJECTS, idx ), $kw70$DONE, done ), ConsesLow.listS( $sym73$PUNLESS, ConsesLow.list( $sym91$CAND, ConsesLow.list(
              $sym48$ID_INDEX_TOMBSTONE_P, v_object ), ConsesLow.list( $sym92$ID_INDEX_SKIP_TOMBSTONES_P, tombstone ) ), ConsesLow.list( $sym93$PWHEN, ConsesLow.list( $sym48$ID_INDEX_TOMBSTONE_P, v_object ), ConsesLow
                  .list( $sym94$CSETQ, v_object, tombstone ) ), ConsesLow.append( body, NIL ) ) ) ) );
    }
    final SubLObject idx = $sym95$IDX;
    final SubLObject mess = $sym96$MESS;
    final SubLObject total = $sym97$TOTAL;
    final SubLObject sofar = $sym98$SOFAR;
    return ConsesLow.list( $sym40$CLET, ConsesLow.list( ConsesLow.list( idx, v_id_index ), ConsesLow.list( mess, progress_message ), ConsesLow.list( total, ConsesLow.list( $sym99$ID_INDEX_DENSE_OBJECT_COUNT, idx ) ),
        reader.bq_cons( sofar, $list80 ) ), ConsesLow.listS( $sym81$CHECK_TYPE, mess, $list82 ), ConsesLow.list( $sym83$NOTING_PERCENT_PROGRESS, mess, ConsesLow.listS( $sym35$DO_ID_INDEX_DENSE_OBJECTS, ConsesLow.list(
            id, v_object, idx, $kw70$DONE, done ), ConsesLow.append( body, ConsesLow.list( ConsesLow.list( $sym84$CINC, sofar ), ConsesLow.list( $sym85$NOTE_PERCENT_PROGRESS, sofar, total ) ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 22894L)
  public static SubLObject id_index_dense_objects_empty_p(final SubLObject v_id_index, final SubLObject tombstone)
  {
    if( NIL != id_index_skip_tombstones_p( tombstone ) )
    {
      return Numbers.numE( ZERO_INTEGER, id_index_dense_object_count( v_id_index ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 23122L)
  public static SubLObject id_index_skip_tombstones_p(final SubLObject tombstone)
  {
    return Equality.eq( $kw67$SKIP, tombstone );
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 23280L)
  public static SubLObject do_id_index_sparse_objects(final SubLObject macroform, final SubLObject environment)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list63 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject id = NIL;
    SubLObject v_object = NIL;
    SubLObject v_id_index = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list63 );
    id = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list63 );
    v_object = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list63 );
    v_id_index = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$4 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list63 );
      current_$4 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list63 );
      if( NIL == conses_high.member( current_$4, $list64, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$4 == $kw65$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list63 );
    }
    final SubLObject tombstone_tail = cdestructuring_bind.property_list_member( $kw66$TOMBSTONE, current );
    final SubLObject tombstone = ( NIL != tombstone_tail ) ? conses_high.cadr( tombstone_tail ) : $kw67$SKIP;
    final SubLObject ordered_tail = cdestructuring_bind.property_list_member( $kw68$ORDERED, current );
    final SubLObject ordered = ( NIL != ordered_tail ) ? conses_high.cadr( ordered_tail ) : NIL;
    final SubLObject progress_message_tail = cdestructuring_bind.property_list_member( $kw69$PROGRESS_MESSAGE, current );
    final SubLObject progress_message = ( NIL != progress_message_tail ) ? conses_high.cadr( progress_message_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw70$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    if( NIL != progress_message )
    {
      final SubLObject idx = $sym101$IDX;
      final SubLObject mess = $sym102$MESS;
      final SubLObject total = $sym103$TOTAL;
      final SubLObject sofar = $sym104$SOFAR;
      return ConsesLow.list( $sym40$CLET, ConsesLow.list( ConsesLow.list( idx, v_id_index ), ConsesLow.list( mess, progress_message ), ConsesLow.list( total, ConsesLow.list( $sym105$ID_INDEX_SPARSE_OBJECT_COUNT, idx ) ),
          reader.bq_cons( sofar, $list80 ) ), ConsesLow.listS( $sym81$CHECK_TYPE, mess, $list82 ), ConsesLow.list( $sym83$NOTING_PERCENT_PROGRESS, mess, ConsesLow.listS( $sym37$DO_ID_INDEX_SPARSE_OBJECTS, ConsesLow.list(
              id, v_object, idx, $kw68$ORDERED, ordered, $kw70$DONE, done ), ConsesLow.append( body, ConsesLow.list( ConsesLow.list( $sym84$CINC, sofar ), ConsesLow.list( $sym85$NOTE_PERCENT_PROGRESS, sofar,
                  total ) ) ) ) ) );
    }
    if( NIL != ordered && T != ordered && NIL != ordered )
    {
      final SubLObject idx = $sym106$IDX;
      return ConsesLow.list( $sym40$CLET, ConsesLow.list( ConsesLow.list( idx, v_id_index ) ), ConsesLow.list( $sym107$PIF, ordered, ConsesLow.listS( $sym37$DO_ID_INDEX_SPARSE_OBJECTS, ConsesLow.list( id, v_object, idx,
          $kw68$ORDERED, T, $kw70$DONE, done ), ConsesLow.append( body, NIL ) ), ConsesLow.listS( $sym37$DO_ID_INDEX_SPARSE_OBJECTS, ConsesLow.list( id, v_object, idx, $kw68$ORDERED, NIL, $kw70$DONE, done ), ConsesLow
              .append( body, NIL ) ) ) );
    }
    if( T == ordered )
    {
      final SubLObject idx = $sym108$IDX;
      final SubLObject sparse = $sym109$SPARSE;
      final SubLObject end_id = $sym110$END_ID;
      final SubLObject v_default = $sym111$DEFAULT;
      return ConsesLow.list( $sym40$CLET, ConsesLow.list( ConsesLow.list( idx, v_id_index ) ), ConsesLow.list( $sym73$PUNLESS, ConsesLow.list( $sym91$CAND, ConsesLow.list( $sym112$ID_INDEX_SPARSE_OBJECTS_EMPTY_P, idx ),
          ConsesLow.list( $sym92$ID_INDEX_SKIP_TOMBSTONES_P, tombstone ) ), ConsesLow.list( $sym40$CLET, ConsesLow.list( ConsesLow.list( sparse, ConsesLow.list( $sym36$ID_INDEX_SPARSE_OBJECTS, idx ) ), ConsesLow.list(
              id, ConsesLow.list( $sym113$ID_INDEX_SPARSE_ID_THRESHOLD, idx ) ), ConsesLow.list( end_id, ConsesLow.list( $sym114$ID_INDEX_NEXT_ID, idx ) ), ConsesLow.list( v_default, ConsesLow.list( $sym115$FUNLESS,
                  ConsesLow.list( $sym92$ID_INDEX_SKIP_TOMBSTONES_P, tombstone ), tombstone ) ) ), ConsesLow.list( $sym116$WHILE, ConsesLow.list( $sym91$CAND, ConsesLow.list( $sym117$_, id, end_id ), ConsesLow.list(
                      $sym118$CNOT, done ) ), ConsesLow.list( $sym40$CLET, ConsesLow.list( ConsesLow.list( v_object, ConsesLow.list( $sym119$GETHASH_WITHOUT_VALUES, id, sparse, v_default ) ) ), ConsesLow.listS(
                          $sym73$PUNLESS, ConsesLow.list( $sym91$CAND, ConsesLow.list( $sym92$ID_INDEX_SKIP_TOMBSTONES_P, tombstone ), ConsesLow.list( $sym48$ID_INDEX_TOMBSTONE_P, v_object ) ), ConsesLow.append( body,
                              NIL ) ) ), ConsesLow.list( $sym84$CINC, id ) ) ) ) );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && $kw67$SKIP != tombstone )
    {
      Errors.error( $str120$Setting__TOMBSTONE_to__A_requires, tombstone );
    }
    final SubLObject idx = $sym121$IDX;
    return ConsesLow.list( $sym40$CLET, ConsesLow.list( ConsesLow.list( idx, v_id_index ) ), ConsesLow.list( $sym73$PUNLESS, ConsesLow.list( $sym112$ID_INDEX_SPARSE_OBJECTS_EMPTY_P, idx ), ConsesLow.listS(
        $sym122$DO_HASH_TABLE, ConsesLow.list( id, v_object, ConsesLow.list( $sym36$ID_INDEX_SPARSE_OBJECTS, idx ), $kw70$DONE, done ), ConsesLow.append( body, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 26170L)
  public static SubLObject id_index_sparse_objects_empty_p(final SubLObject v_id_index)
  {
    return Numbers.numE( ZERO_INTEGER, id_index_sparse_object_count( v_id_index ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 26328L)
  public static SubLObject id_index_sparse_object_ids(final SubLObject v_id_index)
  {
    final SubLObject sparse_objects = id_index_sparse_objects( v_id_index );
    final SubLObject ids = hash_table_utilities.hash_table_keys( sparse_objects );
    return Sort.sort( ids, Symbols.symbol_function( $sym117$_ ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 26592L)
  public static SubLObject new_do_id_index(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list124 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject id = NIL;
    SubLObject v_object = NIL;
    SubLObject v_id_index = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list124 );
    id = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list124 );
    v_object = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list124 );
    v_id_index = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$5 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list124 );
      current_$5 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list124 );
      if( NIL == conses_high.member( current_$5, $list125, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$5 == $kw65$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list124 );
    }
    final SubLObject start_id_tail = cdestructuring_bind.property_list_member( $kw126$START_ID, current );
    final SubLObject start_id = ( NIL != start_id_tail ) ? conses_high.cadr( start_id_tail ) : NIL;
    final SubLObject end_id_tail = cdestructuring_bind.property_list_member( $kw127$END_ID, current );
    final SubLObject end_id = ( NIL != end_id_tail ) ? conses_high.cadr( end_id_tail ) : NIL;
    final SubLObject tombstone_tail = cdestructuring_bind.property_list_member( $kw66$TOMBSTONE, current );
    final SubLObject tombstone = ( NIL != tombstone_tail ) ? conses_high.cadr( tombstone_tail ) : $kw67$SKIP;
    final SubLObject ordered_tail = cdestructuring_bind.property_list_member( $kw68$ORDERED, current );
    final SubLObject ordered = ( NIL != ordered_tail ) ? conses_high.cadr( ordered_tail ) : NIL;
    final SubLObject progress_message_tail = cdestructuring_bind.property_list_member( $kw69$PROGRESS_MESSAGE, current );
    final SubLObject progress_message = ( NIL != progress_message_tail ) ? conses_high.cadr( progress_message_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw70$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    if( !v_id_index.isAtom() )
    {
      final SubLObject idx = $sym128$IDX;
      return ConsesLow.list( $sym40$CLET, ConsesLow.list( ConsesLow.list( idx, v_id_index ) ), ConsesLow.listS( $sym129$NEW_DO_ID_INDEX, ConsesLow.list( new SubLObject[] { id, v_object, idx, $kw126$START_ID, start_id,
        $kw127$END_ID, end_id, $kw66$TOMBSTONE, tombstone, $kw68$ORDERED, ordered, $kw69$PROGRESS_MESSAGE, progress_message, $kw70$DONE, done
      } ), ConsesLow.append( body, NIL ) ) );
    }
    if( !progress_message.isAtom() )
    {
      final SubLObject mess = $sym130$MESS;
      return ConsesLow.list( $sym40$CLET, ConsesLow.list( ConsesLow.list( mess, progress_message ) ), ConsesLow.listS( $sym129$NEW_DO_ID_INDEX, ConsesLow.list( new SubLObject[] { id, v_object, v_id_index,
        $kw126$START_ID, start_id, $kw127$END_ID, end_id, $kw66$TOMBSTONE, tombstone, $kw68$ORDERED, ordered, $kw69$PROGRESS_MESSAGE, mess, $kw70$DONE, done
      } ), ConsesLow.append( body, NIL ) ) );
    }
    if( NIL != progress_message )
    {
      final SubLObject total = $sym131$TOTAL;
      final SubLObject sofar = $sym132$SOFAR;
      return ConsesLow.list( $sym40$CLET, ConsesLow.list( ConsesLow.list( total, ConsesLow.list( $sym79$ID_INDEX_COUNT, v_id_index ) ), reader.bq_cons( sofar, $list80 ) ), ConsesLow.listS( $sym81$CHECK_TYPE,
          progress_message, $list82 ), ConsesLow.list( $sym83$NOTING_PERCENT_PROGRESS, progress_message, ConsesLow.listS( $sym129$NEW_DO_ID_INDEX, ConsesLow.list( new SubLObject[]
          { id, v_object, v_id_index, $kw126$START_ID, start_id, $kw127$END_ID, end_id, $kw66$TOMBSTONE, tombstone, $kw68$ORDERED, ordered, $kw70$DONE, done
      } ), ConsesLow.append( body, ConsesLow.list( ConsesLow.list( $sym84$CINC, sofar ), ConsesLow.list( $sym85$NOTE_PERCENT_PROGRESS, sofar, total ) ) ) ) ) );
    }
    if( !tombstone.isAtom() )
    {
      final SubLObject tomb = $sym133$TOMB;
      return ConsesLow.list( $sym40$CLET, ConsesLow.list( ConsesLow.list( tomb, tombstone ) ), ConsesLow.listS( $sym129$NEW_DO_ID_INDEX, ConsesLow.list( new SubLObject[] { id, v_object, v_id_index, $kw126$START_ID,
        start_id, $kw127$END_ID, end_id, $kw66$TOMBSTONE, tomb, $kw68$ORDERED, ordered, $kw70$DONE, done
      } ), ConsesLow.append( body, NIL ) ) );
    }
    if( !ordered.isAtom() )
    {
      final SubLObject ord = $sym134$ORD;
      return ConsesLow.list( $sym40$CLET, ConsesLow.list( ConsesLow.list( ord, ordered ) ), ConsesLow.listS( $sym129$NEW_DO_ID_INDEX, ConsesLow.list( new SubLObject[] { id, v_object, v_id_index, $kw126$START_ID,
        start_id, $kw127$END_ID, end_id, $kw66$TOMBSTONE, tombstone, $kw68$ORDERED, ord, $kw70$DONE, done
      } ), ConsesLow.append( body, NIL ) ) );
    }
    final SubLObject last_id = $sym135$LAST_ID;
    final SubLObject state_var = $sym136$STATE_VAR;
    SubLObject loop_form = id;
    if( NIL != done )
    {
      loop_form = ConsesLow.list( $sym91$CAND, loop_form, ConsesLow.list( $sym118$CNOT, done ) );
    }
    if( NIL != subl_promotions.non_negative_integer_p( end_id ) )
    {
      loop_form = ConsesLow.list( $sym91$CAND, loop_form, ConsesLow.list( $sym137$__, id, end_id ) );
    }
    return ConsesLow.list( $sym73$PUNLESS, ConsesLow.list( $sym74$ID_INDEX_OBJECTS_EMPTY_P, v_id_index, tombstone ), ConsesLow.list( $sym40$CLET, ConsesLow.list( ConsesLow.list( last_id, ConsesLow.listS( $sym138$FIF,
        ConsesLow.list( $sym45$NON_NEGATIVE_INTEGER_P, start_id ), ConsesLow.listS( $sym139$_, start_id, $list140 ), $list141 ) ), ConsesLow.list( id, ConsesLow.listS( $sym142$DO_ID_INDEX_NEXT_ID, v_id_index, ordered,
            last_id, $list141 ) ), ConsesLow.list( state_var, ConsesLow.listS( $sym143$DO_ID_INDEX_NEXT_STATE, v_id_index, ordered, id, $list141 ) ), v_object ), ConsesLow.list( $sym116$WHILE, loop_form, ConsesLow.list(
                $sym94$CSETQ, v_object, ConsesLow.list( $sym144$DO_ID_INDEX_STATE_OBJECT, v_id_index, tombstone, id, state_var ) ), ConsesLow.listS( $sym93$PWHEN, ConsesLow.list( $sym145$DO_ID_INDEX_OBJECT_VALID_,
                    v_object, tombstone ), ConsesLow.append( body, NIL ) ), ConsesLow.list( $sym94$CSETQ, id, ConsesLow.list( $sym142$DO_ID_INDEX_NEXT_ID, v_id_index, ordered, id, state_var ) ), ConsesLow.list(
                        $sym94$CSETQ, state_var, ConsesLow.list( $sym143$DO_ID_INDEX_NEXT_STATE, v_id_index, ordered, id, state_var ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 29605L)
  public static SubLObject do_id_index_next_id(final SubLObject v_id_index, final SubLObject orderedP, final SubLObject last_id, final SubLObject state)
  {
    if( NIL == state )
    {
      return ZERO_INTEGER;
    }
    if( NIL == last_id )
    {
      return NIL;
    }
    final SubLObject next_id = number_utilities.f_1X( last_id );
    if( next_id.numGE( id_index_next_id( v_id_index ) ) )
    {
      return NIL;
    }
    return next_id;
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 30094L)
  public static SubLObject do_id_index_next_state(final SubLObject v_id_index, final SubLObject orderedP, final SubLObject id, final SubLObject state)
  {
    if( NIL == id )
    {
      return NIL;
    }
    if( NIL == state )
    {
      return ( NIL != id_index_dense_object_id_p( v_id_index, id ) ) ? id_index_dense_objects( v_id_index ) : id_index_sparse_objects( v_id_index );
    }
    if( NIL != id_index_dense_object_id_p( v_id_index, id ) )
    {
      return state.isVector() ? state : id_index_dense_objects( v_id_index );
    }
    if( state.isVector() )
    {
      return id_index_sparse_objects( v_id_index );
    }
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 30781L)
  public static SubLObject do_id_index_state_object(final SubLObject v_id_index, final SubLObject tombstone, final SubLObject id, final SubLObject state)
  {
    SubLObject v_object = NIL;
    if( state.isVector() )
    {
      v_object = Vectors.aref( state, id );
    }
    else if( state.isHashtable() )
    {
      v_object = Hashtables.gethash_without_values( id, state, id_index_tombstone() );
    }
    else
    {
      Errors.error( $str146$unexpected_new_do_id_index_iterat, state );
    }
    if( NIL != id_index_tombstone_p( v_object ) )
    {
      v_object = tombstone;
    }
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 31270L)
  public static SubLObject do_id_index_object_validP(final SubLObject v_object, final SubLObject tombstone)
  {
    return makeBoolean( NIL == id_index_skip_tombstones_p( tombstone ) || !v_object.eql( tombstone ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 31459L)
  public static SubLObject id_index_old_and_new_object_counts(final SubLObject v_id_index, SubLObject new_id_threshhold)
  {
    if( new_id_threshhold == UNPROVIDED )
    {
      new_id_threshhold = NIL;
    }
    final SubLObject sparse_id_threshold = id_index_sparse_id_threshold( v_id_index );
    SubLObject new_count = ZERO_INTEGER;
    SubLObject old_count = NIL;
    if( NIL == new_id_threshhold )
    {
      new_id_threshhold = sparse_id_threshold;
    }
    if( new_id_threshhold.numL( sparse_id_threshold ) )
    {
      final SubLObject dense_objects = id_index_dense_objects( v_id_index );
      SubLObject end_var;
      SubLObject dense_id;
      SubLObject v_object;
      for( end_var = id_index_sparse_id_threshold( v_id_index ), dense_id = NIL, dense_id = new_id_threshhold; !dense_id.numGE( end_var ); dense_id = number_utilities.f_1X( dense_id ) )
      {
        v_object = Vectors.aref( dense_objects, dense_id );
        if( NIL != v_object )
        {
          new_count = Numbers.add( new_count, ONE_INTEGER );
        }
      }
    }
    new_count = Numbers.add( new_count, id_index_sparse_object_count( v_id_index ) );
    old_count = Numbers.subtract( id_index_count( v_id_index ), new_count );
    return Values.values( old_count, new_count );
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 32669L)
  public static SubLObject cfasl_output_object_id_index_method(final SubLObject v_object, final SubLObject stream)
  {
    return cfasl_wide_output_id_index( v_object, stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 32785L)
  public static SubLObject cfasl_wide_output_id_index(final SubLObject v_id_index, final SubLObject stream)
  {
    cfasl.cfasl_output_wide_opcode( $cfasl_wide_opcode_id_index$.getGlobalValue(), stream );
    cfasl_output_id_index_internal( v_id_index, stream );
    return v_id_index;
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 32982L)
  public static SubLObject cfasl_output_id_index_internal(final SubLObject v_id_index, final SubLObject stream)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject id_index_lock = id_index_lock( v_id_index );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( id_index_lock );
      final SubLObject dense_object_count = id_index_dense_object_count( v_id_index );
      final SubLObject sparse_object_count = id_index_sparse_object_count( v_id_index );
      SubLObject counter = NIL;
      cfasl.cfasl_output( id_index_count( v_id_index ), stream );
      cfasl.cfasl_output( id_index_sparse_id_threshold( v_id_index ), stream );
      cfasl.cfasl_output( dense_object_count, stream );
      cfasl.cfasl_output( sparse_object_count, stream );
      counter = ZERO_INTEGER;
      if( NIL == id_index_dense_objects_empty_p( v_id_index, $kw67$SKIP ) )
      {
        final SubLObject vector_var = id_index_dense_objects( v_id_index );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject v_object;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          v_object = Vectors.aref( vector_var, id );
          if( NIL == id_index_tombstone_p( v_object ) || NIL == id_index_skip_tombstones_p( $kw67$SKIP ) )
          {
            if( NIL != id_index_tombstone_p( v_object ) )
            {
              v_object = $kw67$SKIP;
            }
            cfasl.cfasl_output( id, stream );
            cfasl.cfasl_output( v_object, stream );
            counter = Numbers.add( counter, ONE_INTEGER );
          }
        }
      }
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !counter.numE( dense_object_count ) )
      {
        Errors.error( $str150$Expected__A_dense_elements__got__, dense_object_count, counter );
      }
      counter = ZERO_INTEGER;
      if( NIL == id_index_sparse_objects_empty_p( v_id_index ) )
      {
        final SubLObject cdohash_table = id_index_sparse_objects( v_id_index );
        SubLObject id2 = NIL;
        SubLObject v_object2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            v_object2 = Hashtables.getEntryValue( cdohash_entry );
            cfasl.cfasl_output( id2, stream );
            cfasl.cfasl_output( v_object2, stream );
            counter = Numbers.add( counter, ONE_INTEGER );
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !counter.numE( sparse_object_count ) )
      {
        Errors.error( $str151$Expected__A_sparse_elements__got_, sparse_object_count, counter );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( id_index_lock );
      }
    }
    return v_id_index;
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 34216L)
  public static SubLObject cfasl_input_id_index(final SubLObject stream)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject count = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    final SubLObject dense_objects_size = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    final SubLObject dense_count = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    final SubLObject sparse_count = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    final SubLObject v_id_index = new_id_index( dense_objects_size, UNPROVIDED );
    SubLObject i;
    SubLObject id;
    SubLObject v_object;
    for( i = NIL, i = ZERO_INTEGER; i.numL( dense_count ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      id = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
      v_object = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
      id_index_enter( v_id_index, id, v_object );
    }
    for( i = NIL, i = ZERO_INTEGER; i.numL( sparse_count ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      id = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
      v_object = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
      id_index_enter( v_id_index, id, v_object );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !count.numE( id_index_count( v_id_index ) ) )
    {
      Errors.error( $str152$The_sparse_ID_index_should_have__, count, id_index_count( v_id_index ) );
    }
    return v_id_index;
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 35565L)
  public static SubLObject test_id_index_cfasl_serialization(final SubLObject num_of_dense, final SubLObject num_of_sparse, SubLObject id_to_value_fn, SubLObject testfn)
  {
    if( id_to_value_fn == UNPROVIDED )
    {
      id_to_value_fn = $sym162$TO_STRING;
    }
    if( testfn == UNPROVIDED )
    {
      testfn = Symbols.symbol_function( EQUAL );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_id_index = new_id_index_for_testing_purposes( num_of_dense, num_of_sparse, id_to_value_fn );
    SubLObject new_id_index = NIL;
    SubLObject tombs;
    SubLObject i;
    for( tombs = Numbers.max( FIVE_INTEGER, Numbers.integerDivide( num_of_dense, TWENTY_INTEGER ) ), i = NIL, i = ZERO_INTEGER; i.numL( tombs ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      id_index_remove( v_id_index, random.random( num_of_dense ) );
    }
    new_id_index = cfasl_utilities.cfasl_copy_object( v_id_index );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == id_index_p( new_id_index ) )
    {
      Errors.error( $str163$We_did_not_get_an_ID_index_back__, new_id_index );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !id_index_count( v_id_index ).numE( id_index_count( new_id_index ) ) )
    {
      Errors.error( $str164$The_dense_ID_index__A_does_not_ha, v_id_index, new_id_index );
    }
    return $kw165$SUCCESS;
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 36718L)
  public static SubLObject id_index_optimized_p(final SubLObject v_id_index)
  {
    return Numbers.numLE( id_index_next_id( v_id_index ), id_index_sparse_id_threshold( v_id_index ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 37248L)
  public static SubLObject optimize_id_index(final SubLObject v_id_index, SubLObject size)
  {
    if( size == UNPROVIDED )
    {
      size = NIL;
    }
    assert NIL != id_index_p( v_id_index ) : v_id_index;
    if( NIL != size && !assertionsDisabledSynth && NIL == subl_promotions.non_negative_integer_p( size ) )
    {
      throw new AssertionError( size );
    }
    final SubLObject id_index_lock = id_index_lock( v_id_index );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( id_index_lock );
      final SubLObject next_id = id_index_next_id( v_id_index );
      final SubLObject sparse_size = ( NIL != size ) ? Numbers.max( size, next_id ) : next_id;
      final SubLObject sparse_objects = id_index_sparse_objects( v_id_index );
      final SubLObject dense_objects = id_index_dense_objects( v_id_index );
      final SubLObject dense_object_limit = Sequences.length( dense_objects );
      if( sparse_size.numG( dense_object_limit ) )
      {
        final SubLObject optimized_dense_objects = Vectors.make_vector( sparse_size, NIL );
        Sequences.replace( optimized_dense_objects, dense_objects, ZERO_INTEGER, Numbers.min( sparse_size, dense_object_limit ), ZERO_INTEGER, Numbers.min( sparse_size, dense_object_limit ) );
        SubLObject id = NIL;
        SubLObject v_object = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( sparse_objects );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id = Hashtables.getEntryKey( cdohash_entry );
            v_object = Hashtables.getEntryValue( cdohash_entry );
            Vectors.set_aref( optimized_dense_objects, id, v_object );
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
        _csetf_idix_dense_objects( v_id_index, optimized_dense_objects );
        Hashtables.clrhash( sparse_objects );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( id_index_lock );
      }
    }
    return v_id_index;
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 38425L)
  public static SubLObject id_index_pessimized_p(final SubLObject v_id_index)
  {
    return Numbers.zerop( Sequences.length( id_index_dense_objects( v_id_index ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 38779L)
  public static SubLObject pessimize_id_index(final SubLObject v_id_index)
  {
    assert NIL != id_index_p( v_id_index ) : v_id_index;
    final SubLObject id_index_lock = id_index_lock( v_id_index );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( id_index_lock );
      final SubLObject sparse_objects = id_index_sparse_objects( v_id_index );
      if( NIL == id_index_dense_objects_empty_p( v_id_index, $kw67$SKIP ) )
      {
        final SubLObject vector_var = id_index_dense_objects( v_id_index );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject v_object;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          v_object = Vectors.aref( vector_var, id );
          if( NIL == id_index_tombstone_p( v_object ) || NIL == id_index_skip_tombstones_p( $kw67$SKIP ) )
          {
            if( NIL != id_index_tombstone_p( v_object ) )
            {
              v_object = $kw67$SKIP;
            }
            Hashtables.sethash( id, sparse_objects, v_object );
          }
        }
      }
      _csetf_idix_dense_objects( v_id_index, Vectors.make_vector( ZERO_INTEGER, UNPROVIDED ) );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( id_index_lock );
      }
    }
    assert NIL != id_index_pessimized_p( v_id_index ) : v_id_index;
    return v_id_index;
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 39267L)
  public static SubLObject id_index_compact_p(final SubLObject v_id_index)
  {
    return Numbers.numE( id_index_next_id( v_id_index ), id_index_count( v_id_index ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 39679L)
  public static SubLObject compact_id_index(final SubLObject v_id_index, SubLObject new_id_notification_function)
  {
    if( new_id_notification_function == UNPROVIDED )
    {
      new_id_notification_function = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != id_index_p( v_id_index ) : v_id_index;
    if( NIL != id_index_compact_p( v_id_index ) )
    {
      return v_id_index;
    }
    final SubLObject id_index_lock = id_index_lock( v_id_index );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( id_index_lock );
      final SubLObject dense_total = id_index_count( v_id_index );
      final SubLObject compact_dense_objects = Vectors.make_vector( dense_total, NIL );
      SubLObject next_id = ZERO_INTEGER;
      final SubLObject mess = $str167$Compacting_ID_index;
      final SubLObject total = id_index_count( v_id_index );
      SubLObject sofar = ZERO_INTEGER;
      assert NIL != Types.stringp( mess ) : mess;
      final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( mess );
          if( NIL == id_index_objects_empty_p( v_id_index, $kw67$SKIP ) )
          {
            if( NIL == id_index_dense_objects_empty_p( v_id_index, $kw67$SKIP ) )
            {
              final SubLObject vector_var = id_index_dense_objects( v_id_index );
              final SubLObject backwardP_var = NIL;
              SubLObject length;
              SubLObject v_iteration;
              SubLObject dense_id;
              SubLObject v_object;
              for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
              {
                dense_id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                v_object = Vectors.aref( vector_var, dense_id );
                if( NIL == id_index_tombstone_p( v_object ) || NIL == id_index_skip_tombstones_p( $kw67$SKIP ) )
                {
                  if( NIL != id_index_tombstone_p( v_object ) )
                  {
                    v_object = $kw67$SKIP;
                  }
                  Vectors.set_aref( compact_dense_objects, next_id, v_object );
                  next_id = Numbers.add( next_id, ONE_INTEGER );
                  sofar = Numbers.add( sofar, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total );
                }
              }
            }
            if( NIL == id_index_sparse_objects_empty_p( v_id_index ) )
            {
              final SubLObject cdohash_table = id_index_sparse_objects( v_id_index );
              SubLObject dense_id2 = NIL;
              SubLObject v_object2 = NIL;
              final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
              try
              {
                while ( Hashtables.iteratorHasNext( cdohash_iterator ))
                {
                  final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
                  dense_id2 = Hashtables.getEntryKey( cdohash_entry );
                  v_object2 = Hashtables.getEntryValue( cdohash_entry );
                  Vectors.set_aref( compact_dense_objects, next_id, v_object2 );
                  next_id = Numbers.add( next_id, ONE_INTEGER );
                  sofar = Numbers.add( sofar, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total );
                }
              }
              finally
              {
                Hashtables.releaseEntrySetIterator( cdohash_iterator );
              }
            }
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$9 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$9, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
      }
      _csetf_idix_next_id( v_id_index, next_id );
      _csetf_idix_dense_objects( v_id_index, compact_dense_objects );
      Hashtables.clrhash( id_index_sparse_objects( v_id_index ) );
      if( NIL != new_id_notification_function )
      {
        assert NIL != Types.function_spec_p( new_id_notification_function ) : new_id_notification_function;
        final SubLObject mess2 = $str170$Updating_object_IDs;
        final SubLObject total2 = id_index_count( v_id_index );
        SubLObject sofar2 = ZERO_INTEGER;
        assert NIL != Types.stringp( mess2 ) : mess2;
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
        try
        {
          utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
          utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
          utilities_macros.$within_noting_percent_progress$.bind( T, thread );
          utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
          try
          {
            utilities_macros.noting_percent_progress_preamble( mess2 );
            if( NIL == id_index_objects_empty_p( v_id_index, $kw67$SKIP ) )
            {
              if( NIL == id_index_dense_objects_empty_p( v_id_index, $kw67$SKIP ) )
              {
                final SubLObject vector_var2 = id_index_dense_objects( v_id_index );
                final SubLObject backwardP_var2 = NIL;
                SubLObject v_object2;
                SubLObject length2;
                SubLObject v_iteration2;
                SubLObject sparse_id;
                for( length2 = Sequences.length( vector_var2 ), v_iteration2 = NIL, v_iteration2 = ZERO_INTEGER; v_iteration2.numL( length2 ); v_iteration2 = Numbers.add( v_iteration2, ONE_INTEGER ) )
                {
                  sparse_id = ( ( NIL != backwardP_var2 ) ? Numbers.subtract( length2, v_iteration2, ONE_INTEGER ) : v_iteration2 );
                  v_object2 = Vectors.aref( vector_var2, sparse_id );
                  if( NIL == id_index_tombstone_p( v_object2 ) || NIL == id_index_skip_tombstones_p( $kw67$SKIP ) )
                  {
                    if( NIL != id_index_tombstone_p( v_object2 ) )
                    {
                      v_object2 = $kw67$SKIP;
                    }
                    Functions.funcall( new_id_notification_function, v_object2, sparse_id );
                    sofar2 = Numbers.add( sofar2, ONE_INTEGER );
                    utilities_macros.note_percent_progress( sofar2, total2 );
                  }
                }
              }
              if( NIL == id_index_sparse_objects_empty_p( v_id_index ) )
              {
                final SubLObject cdohash_table2 = id_index_sparse_objects( v_id_index );
                SubLObject sparse_id2 = NIL;
                SubLObject v_object3 = NIL;
                final Iterator cdohash_iterator2 = Hashtables.getEntrySetIterator( cdohash_table2 );
                try
                {
                  while ( Hashtables.iteratorHasNext( cdohash_iterator2 ))
                  {
                    final Map.Entry cdohash_entry2 = Hashtables.iteratorNextEntry( cdohash_iterator2 );
                    sparse_id2 = Hashtables.getEntryKey( cdohash_entry2 );
                    v_object3 = Hashtables.getEntryValue( cdohash_entry2 );
                    Functions.funcall( new_id_notification_function, v_object3, sparse_id2 );
                    sofar2 = Numbers.add( sofar2, ONE_INTEGER );
                    utilities_macros.note_percent_progress( sofar2, total2 );
                  }
                }
                finally
                {
                  Hashtables.releaseEntrySetIterator( cdohash_iterator2 );
                }
              }
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values2 = Values.getValuesAsVector();
              utilities_macros.noting_percent_progress_postamble();
              Values.restoreValuesFromVector( _values2 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$10, thread );
            }
          }
        }
        finally
        {
          utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
          utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
          utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
          utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
        }
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( id_index_lock );
      }
    }
    return v_id_index;
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 41022L)
  public static SubLObject new_indirect_compact_id_index(final SubLObject v_id_index)
  {
    assert NIL != id_index_p( v_id_index ) : v_id_index;
    SubLObject compact_id = ZERO_INTEGER;
    SubLObject new_id_index = NIL;
    final SubLObject id_index_lock = id_index_lock( v_id_index );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( id_index_lock );
      final SubLObject dense_objects = id_index_dense_objects( v_id_index );
      final SubLObject dense_objects_size = Sequences.length( dense_objects );
      final SubLObject initial_next_id = id_index_next_id( v_id_index );
      new_id_index = new_id_index( dense_objects_size, initial_next_id );
      SubLObject dense_id;
      SubLObject v_object;
      for( dense_id = NIL, dense_id = ZERO_INTEGER; dense_id.numL( dense_objects_size ); dense_id = Numbers.add( dense_id, ONE_INTEGER ) )
      {
        v_object = Vectors.aref( dense_objects, dense_id );
        if( NIL != v_object )
        {
          id_index_enter( new_id_index, dense_id, compact_id );
          compact_id = Numbers.add( compact_id, ONE_INTEGER );
        }
      }
      final SubLObject sparse_objects = id_index_sparse_objects( v_id_index );
      final SubLObject sparse_objects_size = Hashtables.hash_table_count( sparse_objects );
      SubLObject sparse_object_id_store = Vectors.make_vector( sparse_objects_size, NIL );
      SubLObject sparse_object_id_position = ZERO_INTEGER;
      SubLObject dense_id2 = NIL;
      SubLObject v_object2 = NIL;
      final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( sparse_objects );
      try
      {
        while ( Hashtables.iteratorHasNext( cdohash_iterator ))
        {
          final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
          dense_id2 = Hashtables.getEntryKey( cdohash_entry );
          v_object2 = Hashtables.getEntryValue( cdohash_entry );
          if( NIL != v_object2 )
          {
            Vectors.set_aref( sparse_object_id_store, sparse_object_id_position, dense_id2 );
            sparse_object_id_position = Numbers.add( sparse_object_id_position, ONE_INTEGER );
          }
        }
      }
      finally
      {
        Hashtables.releaseEntrySetIterator( cdohash_iterator );
      }
      final SubLObject vector_var;
      sparse_object_id_store = ( vector_var = Sort.sort( sparse_object_id_store, Symbols.symbol_function( $sym117$_ ), UNPROVIDED ) );
      final SubLObject backwardP_var = NIL;
      SubLObject length;
      SubLObject v_iteration;
      SubLObject element_num;
      SubLObject dense_id3;
      for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
      {
        element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
        dense_id3 = Vectors.aref( vector_var, element_num );
        id_index_enter( new_id_index, dense_id3, compact_id );
        compact_id = Numbers.add( compact_id, ONE_INTEGER );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( id_index_lock );
      }
    }
    return new_id_index;
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 42875L)
  public static SubLObject id_index_ids(final SubLObject v_id_index)
  {
    assert NIL != id_index_p( v_id_index ) : v_id_index;
    SubLObject ids = NIL;
    if( NIL == id_index_objects_empty_p( v_id_index, $kw67$SKIP ) )
    {
      if( NIL == id_index_dense_objects_empty_p( v_id_index, $kw67$SKIP ) )
      {
        final SubLObject vector_var = id_index_dense_objects( v_id_index );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject v_object;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          v_object = Vectors.aref( vector_var, id );
          if( NIL == id_index_tombstone_p( v_object ) || NIL == id_index_skip_tombstones_p( $kw67$SKIP ) )
          {
            if( NIL != id_index_tombstone_p( v_object ) )
            {
              v_object = $kw67$SKIP;
            }
            ids = ConsesLow.cons( id, ids );
          }
        }
      }
      if( NIL == id_index_sparse_objects_empty_p( v_id_index ) )
      {
        final SubLObject cdohash_table = id_index_sparse_objects( v_id_index );
        SubLObject id2 = NIL;
        SubLObject v_object2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            v_object2 = Hashtables.getEntryValue( cdohash_entry );
            ids = ConsesLow.cons( id2, ids );
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return Sequences.nreverse( ids );
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 43142L)
  public static SubLObject id_index_values(final SubLObject v_id_index)
  {
    assert NIL != id_index_p( v_id_index ) : v_id_index;
    SubLObject values = NIL;
    if( NIL == id_index_objects_empty_p( v_id_index, $kw67$SKIP ) )
    {
      if( NIL == id_index_dense_objects_empty_p( v_id_index, $kw67$SKIP ) )
      {
        final SubLObject vector_var = id_index_dense_objects( v_id_index );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject v_object;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          v_object = Vectors.aref( vector_var, id );
          if( NIL == id_index_tombstone_p( v_object ) || NIL == id_index_skip_tombstones_p( $kw67$SKIP ) )
          {
            if( NIL != id_index_tombstone_p( v_object ) )
            {
              v_object = $kw67$SKIP;
            }
            values = ConsesLow.cons( v_object, values );
          }
        }
      }
      if( NIL == id_index_sparse_objects_empty_p( v_id_index ) )
      {
        final SubLObject cdohash_table = id_index_sparse_objects( v_id_index );
        SubLObject id2 = NIL;
        SubLObject v_object2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            v_object2 = Hashtables.getEntryValue( cdohash_entry );
            values = ConsesLow.cons( v_object2, values );
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return Sequences.nreverse( values );
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 43410L)
  public static SubLObject clone_id_index(final SubLObject v_id_index)
  {
    final SubLObject dense_objects_size = id_index_sparse_id_threshold( v_id_index );
    final SubLObject initial_next_id = id_index_next_id( v_id_index );
    return new_id_index( dense_objects_size, initial_next_id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 43707L)
  public static SubLObject copy_id_index(final SubLObject v_id_index, SubLObject optimizeP)
  {
    if( optimizeP == UNPROVIDED )
    {
      optimizeP = NIL;
    }
    final SubLObject next_id = id_index_next_id( v_id_index );
    final SubLObject new_id_index = ( NIL != optimizeP ) ? new_id_index( next_id, UNPROVIDED ) : clone_id_index( v_id_index );
    if( NIL == id_index_objects_empty_p( v_id_index, $kw67$SKIP ) )
    {
      if( NIL == id_index_dense_objects_empty_p( v_id_index, $kw67$SKIP ) )
      {
        final SubLObject vector_var = id_index_dense_objects( v_id_index );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject v_object;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          v_object = Vectors.aref( vector_var, id );
          if( NIL == id_index_tombstone_p( v_object ) || NIL == id_index_skip_tombstones_p( $kw67$SKIP ) )
          {
            if( NIL != id_index_tombstone_p( v_object ) )
            {
              v_object = $kw67$SKIP;
            }
            id_index_enter( new_id_index, id, v_object );
          }
        }
      }
      if( NIL == id_index_sparse_objects_empty_p( v_id_index ) )
      {
        final SubLObject cdohash_table = id_index_sparse_objects( v_id_index );
        SubLObject id2 = NIL;
        SubLObject v_object2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            v_object2 = Hashtables.getEntryValue( cdohash_entry );
            id_index_enter( new_id_index, id2, v_object2 );
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return new_id_index;
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 44095L)
  public static SubLObject id_index_missing_ids(final SubLObject v_id_index, SubLObject type, SubLObject before_id)
  {
    if( type == UNPROVIDED )
    {
      type = $kw171$ALL;
    }
    if( before_id == UNPROVIDED )
    {
      before_id = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != id_index_p( v_id_index ) : v_id_index;
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == conses_high.member( type, $list172, UNPROVIDED, UNPROVIDED ) )
    {
      Errors.error( $str173$Type_must_be_one_of_____ALL__DENS );
    }
    if( NIL == before_id )
    {
      before_id = id_index_next_id( v_id_index );
    }
    SubLObject missing_ids = NIL;
    if( $kw174$SPARSE != type )
    {
      final SubLObject dense_objects = id_index_dense_objects( v_id_index );
      SubLObject doneP = NIL;
      final SubLObject vector_var = dense_objects;
      final SubLObject backwardP_var = NIL;
      final SubLObject length = Sequences.length( vector_var );
      SubLObject current;
      final SubLObject datum = current = ( NIL != backwardP_var ) ? ConsesLow.list( Numbers.subtract( length, ONE_INTEGER ), MINUS_ONE_INTEGER, MINUS_ONE_INTEGER ) : ConsesLow.list( ZERO_INTEGER, length, ONE_INTEGER );
      SubLObject start = NIL;
      SubLObject end = NIL;
      SubLObject delta = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list175 );
      start = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list175 );
      end = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list175 );
      delta = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( NIL == doneP )
        {
          SubLObject end_var;
          SubLObject id;
          SubLObject v_object;
          for( end_var = end, id = NIL, id = start; NIL == doneP && NIL == subl_macros.do_numbers_endtest( id, delta, end_var ); id = Numbers.add( id, delta ) )
          {
            v_object = Vectors.aref( vector_var, id );
            if( NIL == v_object )
            {
              if( before_id.numLE( id ) )
              {
                doneP = T;
              }
              else
              {
                missing_ids = ConsesLow.cons( id, missing_ids );
              }
            }
          }
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list175 );
      }
    }
    if( $kw176$DENSE != type )
    {
      final SubLObject sparse_objects = id_index_sparse_objects( v_id_index );
      final SubLObject sparse_id_start = id_index_sparse_id_threshold( v_id_index );
      final SubLObject max_id_end = id_index_next_id( v_id_index );
      SubLObject end_var2;
      SubLObject sparse_id_end;
      SubLObject id2;
      SubLObject v_object2;
      for( sparse_id_end = ( end_var2 = Numbers.min( before_id, max_id_end ) ), id2 = NIL, id2 = sparse_id_start; !id2.numGE( end_var2 ); id2 = number_utilities.f_1X( id2 ) )
      {
        v_object2 = Hashtables.gethash_without_values( id2, sparse_objects, UNPROVIDED );
        if( NIL == v_object2 )
        {
          missing_ids = ConsesLow.cons( id2, missing_ids );
        }
      }
    }
    return Sequences.nreverse( missing_ids );
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 45969L)
  public static SubLObject test_id_index_missing_ids(final SubLObject dense, final SubLObject sparse, final SubLObject holes)
  {
    final SubLObject v_id_index = new_id_index_for_testing_purposes_with_random_holes( dense, sparse, holes, UNPROVIDED );
    final SubLObject max_id = id_index_next_id( v_id_index );
    final SubLObject present_ids = set_utilities.construct_set_from_list( id_index_ids( v_id_index ), UNPROVIDED, UNPROVIDED );
    final SubLObject absent_ids = set_utilities.construct_set_from_list( id_index_missing_ids( v_id_index, $kw171$ALL, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    SubLObject id;
    SubLObject expected;
    for( id = NIL, id = ZERO_INTEGER; id.numL( max_id ); id = Numbers.add( id, ONE_INTEGER ) )
    {
      if( NIL == set.set_memberP( id, present_ids ) && NIL == set.set_memberP( id, absent_ids ) )
      {
        expected = Types.stringp( id_index_lookup( v_id_index, id, UNPROVIDED ) );
        Errors.error( $str179$ID__A_is_missing__it_is__A_, ( NIL != expected ) ? $str180$expected_to_be_present : $str181$expected_to_be_absent );
      }
    }
    return $kw165$SUCCESS;
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 46740L)
  public static SubLObject build_reverse_index_for_id_index(final SubLObject v_id_index, final SubLObject map, SubLObject collate_duplicatesP)
  {
    if( collate_duplicatesP == UNPROVIDED )
    {
      collate_duplicatesP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == id_index_objects_empty_p( v_id_index, $kw67$SKIP ) )
    {
      if( NIL == id_index_dense_objects_empty_p( v_id_index, $kw67$SKIP ) )
      {
        final SubLObject vector_var = id_index_dense_objects( v_id_index );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject value;
        SubLObject ids;
        SubLObject foundp;
        SubLObject prev_id;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          value = Vectors.aref( vector_var, id );
          if( NIL == id_index_tombstone_p( value ) || NIL == id_index_skip_tombstones_p( $kw67$SKIP ) )
          {
            if( NIL != id_index_tombstone_p( value ) )
            {
              value = $kw67$SKIP;
            }
            if( NIL != collate_duplicatesP )
            {
              thread.resetMultipleValues();
              ids = map_utilities.map_get( map, value, UNPROVIDED );
              foundp = thread.secondMultipleValue();
              thread.resetMultipleValues();
              if( NIL != foundp )
              {
                if( ids.isList() )
                {
                  ids = ConsesLow.cons( id, ids );
                  map_utilities.map_put( map, value, ids );
                }
                else
                {
                  prev_id = ids;
                  map_utilities.map_put( map, value, ConsesLow.list( id, prev_id ) );
                }
              }
              else
              {
                map_utilities.map_put( map, value, id );
              }
            }
            else
            {
              map_utilities.map_put( map, value, id );
            }
          }
        }
      }
      if( NIL == id_index_sparse_objects_empty_p( v_id_index ) )
      {
        final SubLObject cdohash_table = id_index_sparse_objects( v_id_index );
        SubLObject id2 = NIL;
        SubLObject value2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            value2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != collate_duplicatesP )
            {
              thread.resetMultipleValues();
              SubLObject ids2 = map_utilities.map_get( map, value2, UNPROVIDED );
              final SubLObject foundp2 = thread.secondMultipleValue();
              thread.resetMultipleValues();
              if( NIL != foundp2 )
              {
                if( ids2.isList() )
                {
                  ids2 = ConsesLow.cons( id2, ids2 );
                  map_utilities.map_put( map, value2, ids2 );
                }
                else
                {
                  final SubLObject prev_id2 = ids2;
                  map_utilities.map_put( map, value2, ConsesLow.list( id2, prev_id2 ) );
                }
              }
              else
              {
                map_utilities.map_put( map, value2, id2 );
              }
            }
            else
            {
              map_utilities.map_put( map, value2, id2 );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return map;
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 47603L)
  public static SubLObject new_id_index_from_reverse_index(final SubLObject map)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject max_id = find_max_index_id_in_reverse_index( map );
    final SubLObject new_id_index = new_id_index( max_id, UNPROVIDED );
    final SubLObject iterator = map_utilities.new_map_iterator( map );
    SubLObject valid;
    for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
    {
      thread.resetMultipleValues();
      final SubLObject entry = iteration.iteration_next( iterator );
      valid = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != valid )
      {
        SubLObject current;
        final SubLObject datum = current = entry;
        SubLObject key = NIL;
        SubLObject id = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list182 );
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list182 );
        id = current.first();
        current = current.rest();
        if( NIL == current )
        {
          id_index_enter( new_id_index, id, key );
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list182 );
        }
      }
    }
    return new_id_index;
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 48337L)
  public static SubLObject find_max_index_id_in_reverse_index(final SubLObject map)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject max = MINUS_ONE_INTEGER;
    SubLObject max_key = NIL;
    final SubLObject iterator = map_utilities.new_map_iterator( map );
    SubLObject valid;
    for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
    {
      thread.resetMultipleValues();
      final SubLObject entry = iteration.iteration_next( iterator );
      valid = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != valid )
      {
        SubLObject current;
        final SubLObject datum = current = entry;
        SubLObject key = NIL;
        SubLObject id = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list182 );
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list182 );
        id = current.first();
        current = current.rest();
        if( NIL == current )
        {
          if( max.numL( id ) )
          {
            max = id;
            max_key = key;
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list182 );
        }
      }
    }
    return Values.values( max, max_key );
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 49058L)
  public static SubLObject test_new_index_from_reverse_index(final SubLObject num_of_dense, final SubLObject num_of_sparse, SubLObject id_to_value_fn, SubLObject testfn)
  {
    if( id_to_value_fn == UNPROVIDED )
    {
      id_to_value_fn = $sym162$TO_STRING;
    }
    if( testfn == UNPROVIDED )
    {
      testfn = Symbols.symbol_function( EQUAL );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_id_index = new_id_index_for_testing_purposes( num_of_dense, num_of_sparse, id_to_value_fn );
    final SubLObject reverse_index = populate_reverse_index_for_id_index( v_id_index, testfn );
    final SubLObject new_id_index = new_id_index_from_reverse_index( reverse_index );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !id_index_count( new_id_index ).numE( id_index_count( v_id_index ) ) )
    {
      Errors.error( $str184$The_dense_ID_index__A_is_of_a_dif, v_id_index, new_id_index );
    }
    final SubLObject idx = v_id_index;
    if( NIL == id_index_objects_empty_p( idx, $kw67$SKIP ) )
    {
      final SubLObject idx_$22 = idx;
      if( NIL == id_index_dense_objects_empty_p( idx_$22, $kw67$SKIP ) )
      {
        final SubLObject vector_var = id_index_dense_objects( idx_$22 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject value;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          value = Vectors.aref( vector_var, id );
          if( NIL == id_index_tombstone_p( value ) || NIL == id_index_skip_tombstones_p( $kw67$SKIP ) )
          {
            if( NIL != id_index_tombstone_p( value ) )
            {
              value = $kw67$SKIP;
            }
            if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !id.numE( map_utilities.map_get( reverse_index, value, $kw185$NOT_FOUND ) ) )
            {
              Errors.error( $str186$The_reverse_index_for__A_does_not, value, id );
            }
            if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == Functions.funcall( testfn, value, id_index_lookup( new_id_index, id, UNPROVIDED ) ) )
            {
              Errors.error( $str187$The_new_ID_index_does_not_have__A, value, id );
            }
          }
        }
      }
      final SubLObject idx_$23 = idx;
      if( NIL == id_index_sparse_objects_empty_p( idx_$23 ) )
      {
        final SubLObject cdohash_table = id_index_sparse_objects( idx_$23 );
        SubLObject id2 = NIL;
        SubLObject value2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            value2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !id2.numE( map_utilities.map_get( reverse_index, value2, $kw185$NOT_FOUND ) ) )
            {
              Errors.error( $str186$The_reverse_index_for__A_does_not, value2, id2 );
            }
            if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == Functions.funcall( testfn, value2, id_index_lookup( new_id_index, id2, UNPROVIDED ) ) )
            {
              Errors.error( $str187$The_new_ID_index_does_not_have__A, value2, id2 );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return $kw165$SUCCESS;
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 50354L)
  public static SubLObject new_id_index_for_testing_purposes(final SubLObject num_of_dense, final SubLObject num_of_sparse, SubLObject id_to_value_fn)
  {
    if( id_to_value_fn == UNPROVIDED )
    {
      id_to_value_fn = $sym162$TO_STRING;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_id_index = new_id_index( num_of_dense, UNPROVIDED );
    SubLObject i;
    for( i = NIL, i = ZERO_INTEGER; i.numL( num_of_dense ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      id_index_enter( v_id_index, i, Functions.funcall( id_to_value_fn, i ) );
    }
    SubLObject j;
    SubLObject expected;
    SubLObject suggested;
    SubLObject value;
    for( j = NIL, j = ZERO_INTEGER; j.numL( num_of_sparse ); j = Numbers.add( j, ONE_INTEGER ) )
    {
      expected = Numbers.add( j, num_of_dense );
      suggested = id_index_reserve( v_id_index );
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !expected.numE( suggested ) )
      {
        Errors.error( $str188$There_is_a_mismatch_between_the__, j, expected, suggested );
      }
      value = Functions.funcall( id_to_value_fn, suggested );
      id_index_enter( v_id_index, suggested, value );
    }
    return v_id_index;
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 51365L)
  public static SubLObject test_do_id_index_with_tombstones(final SubLObject num_of_dense, final SubLObject num_of_sparse, final SubLObject hole_count)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject v_id_index = new_id_index_for_testing_purposes_with_random_holes( num_of_dense, num_of_sparse, hole_count, UNPROVIDED );
    final SubLObject hole_list = thread.secondMultipleValue();
    thread.resetMultipleValues();
    final SubLObject holes = set_utilities.construct_set_from_list( hole_list, UNPROVIDED, UNPROVIDED );
    final SubLObject seen_holes = set.new_set( UNPROVIDED, UNPROVIDED );
    SubLObject last_id = MINUS_ONE_INTEGER;
    final SubLObject idx = v_id_index;
    if( NIL == id_index_objects_empty_p( idx, $kw190$RIP ) )
    {
      final SubLObject idx_$24 = idx;
      if( NIL == id_index_dense_objects_empty_p( idx_$24, $kw190$RIP ) )
      {
        final SubLObject vector_var = id_index_dense_objects( idx_$24 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject v_object;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          v_object = Vectors.aref( vector_var, id );
          if( NIL == id_index_tombstone_p( v_object ) || NIL == id_index_skip_tombstones_p( $kw190$RIP ) )
          {
            if( NIL != id_index_tombstone_p( v_object ) )
            {
              v_object = $kw190$RIP;
            }
            if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !ONE_INTEGER.numE( Numbers.subtract( id, last_id ) ) )
            {
              Errors.error( $str191$Error__the_ID_range_is_not_truely, Numbers.add( last_id, ONE_INTEGER ), id );
            }
            if( NIL != set.set_memberP( id, holes ) )
            {
              if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && $kw190$RIP != v_object )
              {
                Errors.error( $str192$Error_at_index__A__expected_tombs, id, v_object );
              }
              set.set_add( id, seen_holes );
            }
            else if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && $kw190$RIP == v_object )
            {
              Errors.error( $str193$Error_at_index__A__expected_objec, id );
            }
            last_id = id;
          }
        }
      }
      final SubLObject idx_$25 = idx;
      if( NIL == id_index_sparse_objects_empty_p( idx_$25 ) || NIL == id_index_skip_tombstones_p( $kw190$RIP ) )
      {
        final SubLObject sparse = id_index_sparse_objects( idx_$25 );
        SubLObject id2 = id_index_sparse_id_threshold( idx_$25 );
        final SubLObject end_id = id_index_next_id( idx_$25 );
        final SubLObject v_default = ( NIL != id_index_skip_tombstones_p( $kw190$RIP ) ) ? NIL : $kw190$RIP;
        while ( id2.numL( end_id ))
        {
          final SubLObject v_object2 = Hashtables.gethash_without_values( id2, sparse, v_default );
          if( NIL == id_index_skip_tombstones_p( $kw190$RIP ) || NIL == id_index_tombstone_p( v_object2 ) )
          {
            if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !ONE_INTEGER.numE( Numbers.subtract( id2, last_id ) ) )
            {
              Errors.error( $str191$Error__the_ID_range_is_not_truely, Numbers.add( last_id, ONE_INTEGER ), id2 );
            }
            if( NIL != set.set_memberP( id2, holes ) )
            {
              if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && $kw190$RIP != v_object2 )
              {
                Errors.error( $str192$Error_at_index__A__expected_tombs, id2, v_object2 );
              }
              set.set_add( id2, seen_holes );
            }
            else if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && $kw190$RIP == v_object2 )
            {
              Errors.error( $str193$Error_at_index__A__expected_objec, id2 );
            }
            last_id = id2;
          }
          id2 = Numbers.add( id2, ONE_INTEGER );
        }
      }
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == set_utilities.sets_coextensionalP( holes, seen_holes ) )
    {
      Errors.error( $str194$There_are_holes_that_we_did_not_s, set.set_element_list( set_utilities.set_prune( holes, seen_holes ) ) );
    }
    final SubLObject last_index;
    final SubLObject somewhere_in_sparsespace = last_index = Numbers.add( num_of_dense, Numbers.integerDivide( num_of_sparse, TWO_INTEGER ) );
    final SubLObject last_object = id_index_lookup( v_id_index, last_index, $kw190$RIP );
    SubLObject counter = ZERO_INTEGER;
    SubLObject curr_object = NIL;
    SubLObject finishedP = NIL;
    final SubLObject idx2 = v_id_index;
    if( NIL == id_index_objects_empty_p( idx2, $kw190$RIP ) )
    {
      final SubLObject idx_$26 = idx2;
      if( NIL == id_index_dense_objects_empty_p( idx_$26, $kw190$RIP ) )
      {
        final SubLObject vector_var2 = id_index_dense_objects( idx_$26 );
        final SubLObject backwardP_var2 = NIL;
        final SubLObject length2 = Sequences.length( vector_var2 );
        SubLObject current;
        final SubLObject datum = current = ( NIL != backwardP_var2 ) ? ConsesLow.list( Numbers.subtract( length2, ONE_INTEGER ), MINUS_ONE_INTEGER, MINUS_ONE_INTEGER )
            : ConsesLow.list( ZERO_INTEGER, length2, ONE_INTEGER );
        SubLObject start = NIL;
        SubLObject end = NIL;
        SubLObject delta = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list175 );
        start = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list175 );
        end = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list175 );
        delta = current.first();
        current = current.rest();
        if( NIL == current )
        {
          if( NIL == finishedP )
          {
            SubLObject end_var;
            SubLObject id3;
            SubLObject v_object3;
            for( end_var = end, id3 = NIL, id3 = start; NIL == finishedP && NIL == subl_macros.do_numbers_endtest( id3, delta, end_var ); id3 = Numbers.add( id3, delta ) )
            {
              v_object3 = Vectors.aref( vector_var2, id3 );
              if( NIL == id_index_tombstone_p( v_object3 ) || NIL == id_index_skip_tombstones_p( $kw190$RIP ) )
              {
                if( NIL != id_index_tombstone_p( v_object3 ) )
                {
                  v_object3 = $kw190$RIP;
                }
                if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !id3.numE( counter ) )
                {
                  Errors.error( $str195$Error__ID__A_is_not_in_line_with_, id3, counter );
                }
                counter = Numbers.add( counter, ONE_INTEGER );
                curr_object = v_object3;
                finishedP = Numbers.numL( last_index, counter );
              }
            }
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list175 );
        }
      }
      final SubLObject idx_$27 = idx2;
      if( NIL == id_index_sparse_objects_empty_p( idx_$27 ) || NIL == id_index_skip_tombstones_p( $kw190$RIP ) )
      {
        final SubLObject sparse2 = id_index_sparse_objects( idx_$27 );
        SubLObject id4 = id_index_sparse_id_threshold( idx_$27 );
        final SubLObject end_id2 = id_index_next_id( idx_$27 );
        final SubLObject v_default2 = ( NIL != id_index_skip_tombstones_p( $kw190$RIP ) ) ? NIL : $kw190$RIP;
        while ( id4.numL( end_id2 ) && NIL == finishedP)
        {
          final SubLObject v_object4 = Hashtables.gethash_without_values( id4, sparse2, v_default2 );
          if( NIL == id_index_skip_tombstones_p( $kw190$RIP ) || NIL == id_index_tombstone_p( v_object4 ) )
          {
            if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !id4.numE( counter ) )
            {
              Errors.error( $str195$Error__ID__A_is_not_in_line_with_, id4, counter );
            }
            counter = Numbers.add( counter, ONE_INTEGER );
            curr_object = v_object4;
            finishedP = Numbers.numL( last_index, counter );
          }
          id4 = Numbers.add( id4, ONE_INTEGER );
        }
      }
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !curr_object.eql( last_object ) )
    {
      Errors.error( $str196$_DONE_should_have_taken_us_to__A_, last_object, curr_object );
    }
    SubLObject limit;
    SubLObject i;
    for( limit = Numbers.add( num_of_dense, num_of_sparse ), i = NIL, i = ZERO_INTEGER; i.numL( limit ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      id_index_remove( v_id_index, i );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == id_index_empty_p( v_id_index ) )
    {
      Errors.error( $str197$Hey__we_deleted_everything_and_th );
    }
    SubLObject counter2 = ZERO_INTEGER;
    final SubLObject idx3 = v_id_index;
    if( NIL == id_index_objects_empty_p( idx3, $kw190$RIP ) )
    {
      final SubLObject idx_$28 = idx3;
      if( NIL == id_index_dense_objects_empty_p( idx_$28, $kw190$RIP ) )
      {
        final SubLObject vector_var3 = id_index_dense_objects( idx_$28 );
        final SubLObject backwardP_var3 = NIL;
        SubLObject id4;
        SubLObject length3;
        SubLObject v_iteration2;
        SubLObject v_object5;
        for( length3 = Sequences.length( vector_var3 ), v_iteration2 = NIL, v_iteration2 = ZERO_INTEGER; v_iteration2.numL( length3 ); v_iteration2 = Numbers.add( v_iteration2, ONE_INTEGER ) )
        {
          id4 = ( ( NIL != backwardP_var3 ) ? Numbers.subtract( length3, v_iteration2, ONE_INTEGER ) : v_iteration2 );
          v_object5 = Vectors.aref( vector_var3, id4 );
          if( NIL == id_index_tombstone_p( v_object5 ) || NIL == id_index_skip_tombstones_p( $kw190$RIP ) )
          {
            if( NIL != id_index_tombstone_p( v_object5 ) )
            {
              v_object5 = $kw190$RIP;
            }
            if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !counter2.numE( id4 ) )
            {
              Errors.error( $str195$Error__ID__A_is_not_in_line_with_, id4, counter2 );
            }
            if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && $kw190$RIP != v_object5 )
            {
              Errors.error( $str198$Error__an_empty_ID_index_contains, v_object5 );
            }
            counter2 = Numbers.add( counter2, ONE_INTEGER );
          }
        }
      }
      final SubLObject idx_$29 = idx3;
      if( NIL == id_index_sparse_objects_empty_p( idx_$29 ) || NIL == id_index_skip_tombstones_p( $kw190$RIP ) )
      {
        final SubLObject sparse3 = id_index_sparse_objects( idx_$29 );
        SubLObject id = id_index_sparse_id_threshold( idx_$29 );
        final SubLObject end_id3 = id_index_next_id( idx_$29 );
        final SubLObject v_default3 = ( NIL != id_index_skip_tombstones_p( $kw190$RIP ) ) ? NIL : $kw190$RIP;
        while ( id.numL( end_id3 ))
        {
          final SubLObject v_object6 = Hashtables.gethash_without_values( id, sparse3, v_default3 );
          if( NIL == id_index_skip_tombstones_p( $kw190$RIP ) || NIL == id_index_tombstone_p( v_object6 ) )
          {
            if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !counter2.numE( id ) )
            {
              Errors.error( $str195$Error__ID__A_is_not_in_line_with_, id, counter2 );
            }
            if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && $kw190$RIP != v_object6 )
            {
              Errors.error( $str198$Error__an_empty_ID_index_contains, v_object6 );
            }
            counter2 = Numbers.add( counter2, ONE_INTEGER );
          }
          id = Numbers.add( id, ONE_INTEGER );
        }
      }
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !counter2.numE( limit ) )
    {
      Errors.error( $str199$Hey___A______A__they_did_not_show, counter2, limit );
    }
    return $kw165$SUCCESS;
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 54353L)
  public static SubLObject new_id_index_for_testing_purposes_with_random_holes(final SubLObject num_of_dense, final SubLObject num_of_sparse, final SubLObject hole_count, SubLObject id_to_value_fn)
  {
    if( id_to_value_fn == UNPROVIDED )
    {
      id_to_value_fn = $sym162$TO_STRING;
    }
    final SubLObject v_id_index = new_id_index_for_testing_purposes( num_of_dense, num_of_sparse, id_to_value_fn );
    final SubLObject hole_range = Numbers.add( num_of_sparse, num_of_dense );
    final SubLObject holes = set.new_set( UNPROVIDED, UNPROVIDED );
    SubLObject cdolist_list_var = ConsesLow.list( ZERO_INTEGER, Numbers.subtract( num_of_dense, ONE_INTEGER ) );
    SubLObject id = NIL;
    id = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      id_index_remove( v_id_index, id );
      set.set_add( id, holes );
      cdolist_list_var = cdolist_list_var.rest();
      id = cdolist_list_var.first();
    }
    while ( set.set_size( holes ).numL( hole_count ))
    {
      final SubLObject index = random.random( hole_range );
      if( NIL == set.set_memberP( index, holes ) )
      {
        id_index_remove( v_id_index, index );
        set.set_add( index, holes );
      }
    }
    return Values.values( v_id_index, set.set_element_list( holes ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 55216L)
  public static SubLObject populate_reverse_index_for_id_index(final SubLObject v_id_index, final SubLObject testfn)
  {
    final SubLObject map = dictionary.new_dictionary( testfn, UNPROVIDED );
    return build_reverse_index_for_id_index( v_id_index, map, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 55614L)
  public static SubLObject test_id_index_with_swizzling(final SubLObject dense, final SubLObject sparse)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject idx = new_id_index( dense, Numbers.$most_positive_fixnum$.getGlobalValue() );
    final SubLObject side_cache = dictionary.new_dictionary( EQL, UNPROVIDED );
    final SubLObject bignums = set.new_set( EQL, UNPROVIDED );
    SubLObject i;
    SubLObject value;
    SubLObject id;
    for( i = NIL, i = ZERO_INTEGER; i.numL( sparse ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      value = string_utilities.to_string( i );
      id = id_index_reserve( idx );
      if( !id.isFixnum() )
      {
        set.set_add( id, bignums );
      }
      id_index_enter( idx, id, value );
      map_utilities.map_put( side_cache, id, value );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL != set.set_emptyP( bignums ) )
    {
      Errors.error( $str202$The_test_is_badly_designed__no_bi );
    }
    SubLObject id2;
    SubLObject value2;
    SubLObject id_value;
    for( i = NIL, i = ZERO_INTEGER; i.numL( sparse ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      id2 = Numbers.add( Numbers.$most_positive_fixnum$.getGlobalValue(), i );
      value2 = map_utilities.map_get( side_cache, id2, UNPROVIDED );
      id_value = id_index_lookup( idx, id2, $str203$ );
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == Strings.stringE( value2, id_value, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        Errors.error( $str204$We_could_not_retrieve__S_from_the, value2, id2 );
      }
    }
    return $kw165$SUCCESS;
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 56623L)
  public static SubLObject test_id_index_ordered_iteration(final SubLObject dense, final SubLObject sparse)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject idx = new_id_index( dense, UNPROVIDED );
    SubLObject cdotimes_end_var;
    SubLObject i;
    SubLObject value;
    SubLObject id;
    for( cdotimes_end_var = Numbers.add( dense, sparse ), i = NIL, i = ZERO_INTEGER; i.numL( cdotimes_end_var ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      value = string_utilities.to_string( i );
      id = id_index_reserve( idx );
      id_index_enter( idx, id, value );
    }
    SubLObject previous = MINUS_ONE_INTEGER;
    final SubLObject iterator_var = new_id_index_ordered_iterator( idx );
    SubLObject valid;
    for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
    {
      thread.resetMultipleValues();
      final SubLObject entry = iteration.iteration_next( iterator_var );
      valid = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != valid )
      {
        SubLObject current;
        final SubLObject datum = current = entry;
        SubLObject id2 = NIL;
        SubLObject value2 = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list56 );
        id2 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list56 );
        value2 = current.first();
        current = current.rest();
        if( NIL == current )
        {
          if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !previous.numL( id2 ) )
          {
            Errors.error( $str207$We_expected_something_larger_than, previous, id2 );
          }
          previous = id2;
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list56 );
        }
      }
    }
    return $kw165$SUCCESS;
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 57233L)
  public static SubLObject test_pessimize_id_index()
  {
    final SubLObject v_id_index = new_id_index( THREE_INTEGER, ZERO_INTEGER );
    final SubLObject id_a = id_index_reserve( v_id_index );
    final SubLObject id_b = id_index_reserve( v_id_index );
    final SubLObject id_c = id_index_reserve( v_id_index );
    final SubLObject id_d = id_index_reserve( v_id_index );
    id_index_enter( v_id_index, id_a, $str208$a );
    id_index_enter( v_id_index, id_b, $str209$b );
    id_index_enter( v_id_index, id_c, $str210$c );
    if( NIL != id_index_pessimized_p( v_id_index ) || !THREE_INTEGER.numE( id_index_count( v_id_index ) ) || !THREE_INTEGER.numE( id_index_dense_object_count( v_id_index ) ) || !ZERO_INTEGER.numE(
        id_index_sparse_object_count( v_id_index ) ) )
    {
      return $kw219$INITIAL_ID_INDEX_COUNT_FAILURE;
    }
    pessimize_id_index( v_id_index );
    if( NIL == id_index_pessimized_p( v_id_index ) || !THREE_INTEGER.numE( id_index_count( v_id_index ) ) || !ZERO_INTEGER.numE( id_index_dense_object_count( v_id_index ) ) || !THREE_INTEGER.numE(
        id_index_sparse_object_count( v_id_index ) ) )
    {
      return $kw218$ID_INDEX_COUNT_FAILURE;
    }
    if( !$str208$a.equal( id_index_lookup( v_id_index, id_a, UNPROVIDED ) ) || !$str209$b.equal( id_index_lookup( v_id_index, id_b, UNPROVIDED ) ) || !$str210$c.equal( id_index_lookup( v_id_index, id_c, UNPROVIDED ) ) )
    {
      return $kw217$ID_INDEX_LOOKUP_FAILURE;
    }
    SubLObject values = NIL;
    final SubLObject idx = v_id_index;
    if( NIL == id_index_objects_empty_p( idx, $kw67$SKIP ) )
    {
      final SubLObject idx_$30 = idx;
      if( NIL == id_index_dense_objects_empty_p( idx_$30, $kw67$SKIP ) )
      {
        final SubLObject vector_var = id_index_dense_objects( idx_$30 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject v_object;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          v_object = Vectors.aref( vector_var, id );
          if( NIL == id_index_tombstone_p( v_object ) || NIL == id_index_skip_tombstones_p( $kw67$SKIP ) )
          {
            if( NIL != id_index_tombstone_p( v_object ) )
            {
              v_object = $kw67$SKIP;
            }
            values = ConsesLow.cons( v_object, values );
          }
        }
      }
      final SubLObject idx_$31 = idx;
      if( NIL == id_index_sparse_objects_empty_p( idx_$31 ) )
      {
        final SubLObject cdohash_table = id_index_sparse_objects( idx_$31 );
        SubLObject id2 = NIL;
        SubLObject v_object2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            v_object2 = Hashtables.getEntryValue( cdohash_entry );
            values = ConsesLow.cons( v_object2, values );
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    if( NIL == list_utilities.sets_equal_equalP( values, $list211 ) )
    {
      return $kw216$DO_ID_INDEX_FAILURE;
    }
    final SubLObject id_e = id_index_reserve( v_id_index );
    id_index_enter( v_id_index, id_d, $str212$d );
    id_index_enter( v_id_index, id_e, $str213$e );
    if( NIL == id_index_pessimized_p( v_id_index ) || !FIVE_INTEGER.numE( id_index_count( v_id_index ) ) || !ZERO_INTEGER.numE( id_index_dense_object_count( v_id_index ) ) || !FIVE_INTEGER.numE(
        id_index_sparse_object_count( v_id_index ) ) )
    {
      return $kw215$ID_INDEX_RECOUNT_FAILURE;
    }
    if( $str208$a.equal( id_index_lookup( v_id_index, id_a, UNPROVIDED ) ) && $str209$b.equal( id_index_lookup( v_id_index, id_b, UNPROVIDED ) ) && $str210$c.equal( id_index_lookup( v_id_index, id_c, UNPROVIDED ) )
        && $str212$d.equal( id_index_lookup( v_id_index, id_d, UNPROVIDED ) ) && $str213$e.equal( id_index_lookup( v_id_index, id_e, UNPROVIDED ) ) )
    {
      return $kw165$SUCCESS;
    }
    return $kw214$ID_INDEX_RELOOKUP_FAILURE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 57233L)
  public static SubLObject benchmark_id_index_iteration()
  {
    return benchmark_id_index_iteration_int( $list223, $int224$212 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 57233L)
  public static SubLObject benchmark_id_index_iteration_int(final SubLObject size_list, final SubLObject multiplier)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = size_list;
    SubLObject size = NIL;
    size = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject id_index_time = NIL;
      SubLObject hash_time = NIL;
      final SubLObject v_id_index = new_id_index( size, ZERO_INTEGER );
      SubLObject time_var = Time.get_internal_real_time();
      SubLObject i;
      SubLObject idx;
      SubLObject idx_$32;
      SubLObject vector_var;
      SubLObject backwardP_var;
      SubLObject length;
      SubLObject v_iteration;
      SubLObject id;
      SubLObject v_object;
      SubLObject idx_$33;
      SubLObject cdohash_table;
      SubLObject id2;
      SubLObject v_object2;
      Iterator cdohash_iterator;
      Map.Entry cdohash_entry;
      for( i = NIL, i = ZERO_INTEGER; i.numL( multiplier ); i = Numbers.add( i, ONE_INTEGER ) )
      {
        idx = v_id_index;
        if( NIL == id_index_objects_empty_p( idx, $kw67$SKIP ) )
        {
          idx_$32 = idx;
          if( NIL == id_index_dense_objects_empty_p( idx_$32, $kw67$SKIP ) )
          {
            vector_var = id_index_dense_objects( idx_$32 );
            backwardP_var = NIL;
            for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
            {
              id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
              v_object = Vectors.aref( vector_var, id );
              if( NIL == id_index_tombstone_p( v_object ) || NIL == id_index_skip_tombstones_p( $kw67$SKIP ) )
              {
                if( NIL != id_index_tombstone_p( v_object ) )
                {
                  v_object = $kw67$SKIP;
                }
                Types.sublisp_false( id, v_object );
              }
            }
          }
          idx_$33 = idx;
          if( NIL == id_index_sparse_objects_empty_p( idx_$33 ) )
          {
            cdohash_table = id_index_sparse_objects( idx_$33 );
            id2 = NIL;
            v_object2 = NIL;
            cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
            try
            {
              while ( Hashtables.iteratorHasNext( cdohash_iterator ))
              {
                cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
                id2 = Hashtables.getEntryKey( cdohash_entry );
                v_object2 = Hashtables.getEntryValue( cdohash_entry );
                Types.sublisp_false( id2, v_object2 );
              }
            }
            finally
            {
              Hashtables.releaseEntrySetIterator( cdohash_iterator );
            }
          }
        }
      }
      id_index_time = Numbers.divide( Numbers.subtract( Time.get_internal_real_time(), time_var ), time_high.$internal_time_units_per_second$.getGlobalValue() );
      final SubLObject hash = Hashtables.make_hash_table( size, UNPROVIDED, UNPROVIDED );
      time_var = Time.get_internal_real_time();
      SubLObject key;
      SubLObject val;
      Iterator cdohash_iterator2;
      Map.Entry cdohash_entry2;
      for( i = NIL, i = ZERO_INTEGER; i.numL( multiplier ); i = Numbers.add( i, ONE_INTEGER ) )
      {
        key = NIL;
        val = NIL;
        cdohash_iterator2 = Hashtables.getEntrySetIterator( hash );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator2 ))
          {
            cdohash_entry2 = Hashtables.iteratorNextEntry( cdohash_iterator2 );
            key = Hashtables.getEntryKey( cdohash_entry2 );
            val = Hashtables.getEntryValue( cdohash_entry2 );
            Types.sublisp_false( key, val );
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator2 );
        }
      }
      hash_time = Numbers.divide( Numbers.subtract( Time.get_internal_real_time(), time_var ), time_high.$internal_time_units_per_second$.getGlobalValue() );
      result = ConsesLow.cons( ConsesLow.list( size, id_index_time, hash_time ), result );
      cdolist_list_var = cdolist_list_var.rest();
      size = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  public static SubLObject declare_id_index_file()
  {
    SubLFiles.declareFunction( me, "id_index_print_function_trampoline", "ID-INDEX-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "id_index_p", "ID-INDEX-P", 1, 0, false );
    new $id_index_p$UnaryFunction();
    SubLFiles.declareFunction( me, "idix_lock", "IDIX-LOCK", 1, 0, false );
    SubLFiles.declareFunction( me, "idix_count", "IDIX-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "idix_next_id", "IDIX-NEXT-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "idix_dense_objects", "IDIX-DENSE-OBJECTS", 1, 0, false );
    SubLFiles.declareFunction( me, "idix_sparse_objects", "IDIX-SPARSE-OBJECTS", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_idix_lock", "_CSETF-IDIX-LOCK", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_idix_count", "_CSETF-IDIX-COUNT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_idix_next_id", "_CSETF-IDIX-NEXT-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_idix_dense_objects", "_CSETF-IDIX-DENSE-OBJECTS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_idix_sparse_objects", "_CSETF-IDIX-SPARSE-OBJECTS", 2, 0, false );
    SubLFiles.declareFunction( me, "make_id_index", "MAKE-ID-INDEX", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_id_index", "VISIT-DEFSTRUCT-ID-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_id_index_method", "VISIT-DEFSTRUCT-OBJECT-ID-INDEX-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_id_index", "PRINT-ID-INDEX", 3, 0, false );
    SubLFiles.declareFunction( me, "id_index_count", "ID-INDEX-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "id_index_empty_p", "ID-INDEX-EMPTY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "id_index_dense_object_count", "ID-INDEX-DENSE-OBJECT-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "id_index_sparse_object_count", "ID-INDEX-SPARSE-OBJECT-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "id_index_sparse_id_threshold", "ID-INDEX-SPARSE-ID-THRESHOLD", 1, 0, false );
    SubLFiles.declareFunction( me, "id_index_next_id", "ID-INDEX-NEXT-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "set_id_index_next_id", "SET-ID-INDEX-NEXT-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "id_index_dense_objects", "ID-INDEX-DENSE-OBJECTS", 1, 0, false );
    SubLFiles.declareFunction( me, "id_index_sparse_objects", "ID-INDEX-SPARSE-OBJECTS", 1, 0, false );
    SubLFiles.declareMacro( me, "with_id_index_locked", "WITH-ID-INDEX-LOCKED" );
    SubLFiles.declareFunction( me, "id_index_lock", "ID-INDEX-LOCK", 1, 0, false );
    SubLFiles.declareFunction( me, "convert_id_index_key_test", "CONVERT-ID-INDEX-KEY-TEST", 1, 2, false );
    SubLFiles.declareFunction( me, "new_id_index", "NEW-ID-INDEX", 0, 2, false );
    SubLFiles.declareFunction( me, "id_index_reserve", "ID-INDEX-RESERVE", 1, 0, false );
    SubLFiles.declareFunction( me, "id_index_empty_list", "ID-INDEX-EMPTY-LIST", 0, 0, false );
    SubLFiles.declareFunction( me, "id_index_empty_list_p", "ID-INDEX-EMPTY-LIST-P", 1, 0, false );
    SubLFiles.declareFunction( me, "uninterned_symbols_with_same_name_p", "UNINTERNED-SYMBOLS-WITH-SAME-NAME-P", 2, 0, false );
    SubLFiles.declareFunction( me, "id_index_tombstone", "ID-INDEX-TOMBSTONE", 0, 0, false );
    SubLFiles.declareFunction( me, "id_index_tombstone_p", "ID-INDEX-TOMBSTONE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "id_index_lookup", "ID-INDEX-LOOKUP", 2, 1, false );
    SubLFiles.declareFunction( me, "id_index_lookup_int", "ID-INDEX-LOOKUP-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "id_index_enter", "ID-INDEX-ENTER", 3, 0, false );
    SubLFiles.declareFunction( me, "id_index_enter_unlocked", "ID-INDEX-ENTER-UNLOCKED", 3, 0, false );
    SubLFiles.declareFunction( me, "get_appropriate_id_index_sparse_objects", "GET-APPROPRIATE-ID-INDEX-SPARSE-OBJECTS", 2, 0, false );
    SubLFiles.declareFunction( me, "id_index_enter_autoextend", "ID-INDEX-ENTER-AUTOEXTEND", 3, 1, false );
    SubLFiles.declareFunction( me, "id_index_enter_unlocked_autoextend", "ID-INDEX-ENTER-UNLOCKED-AUTOEXTEND", 3, 1, false );
    SubLFiles.declareFunction( me, "id_index_possibly_autoextend", "ID-INDEX-POSSIBLY-AUTOEXTEND", 3, 0, false );
    SubLFiles.declareFunction( me, "id_index_remove", "ID-INDEX-REMOVE", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_id_index", "CLEAR-ID-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "fill_id_index_dense_space", "FILL-ID-INDEX-DENSE-SPACE", 2, 1, false );
    SubLFiles.declareFunction( me, "id_index_dense_object_id_p", "ID-INDEX-DENSE-OBJECT-ID-P", 2, 0, false );
    SubLFiles.declareFunction( me, "new_id_index_iterator", "NEW-ID-INDEX-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "new_id_index_values_iterator", "NEW-ID-INDEX-VALUES-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "new_id_index_ordered_iterator", "NEW-ID-INDEX-ORDERED-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "new_id_index_dense_objects_iterator", "NEW-ID-INDEX-DENSE-OBJECTS-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "iterate_id_index_dense_objects_necessary", "ITERATE-ID-INDEX-DENSE-OBJECTS-NECESSARY", 1, 0, false );
    SubLFiles.declareFunction( me, "new_id_index_dense_objects_values_iterator", "NEW-ID-INDEX-DENSE-OBJECTS-VALUES-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "new_id_index_sparse_objects_iterator", "NEW-ID-INDEX-SPARSE-OBJECTS-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "new_id_index_sparse_objects_values_iterator", "NEW-ID-INDEX-SPARSE-OBJECTS-VALUES-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "new_id_index_sparse_objects_ordered_iterator", "NEW-ID-INDEX-SPARSE-OBJECTS-ORDERED-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "make_id_index_sparse_objects_ordered_iterator_state", "MAKE-ID-INDEX-SPARSE-OBJECTS-ORDERED-ITERATOR-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "id_index_sparse_objects_ordered_iterator_doneP", "ID-INDEX-SPARSE-OBJECTS-ORDERED-ITERATOR-DONE?", 1, 0, false );
    SubLFiles.declareFunction( me, "id_index_sparse_objects_ordered_iterator_next", "ID-INDEX-SPARSE-OBJECTS-ORDERED-ITERATOR-NEXT", 1, 0, false );
    SubLFiles.declareMacro( me, "do_id_index", "DO-ID-INDEX" );
    SubLFiles.declareMacro( me, "old_do_id_index", "OLD-DO-ID-INDEX" );
    SubLFiles.declareFunction( me, "id_index_objects_empty_p", "ID-INDEX-OBJECTS-EMPTY-P", 2, 0, false );
    SubLFiles.declareMacro( me, "do_id_index_dense_objects", "DO-ID-INDEX-DENSE-OBJECTS" );
    SubLFiles.declareFunction( me, "id_index_dense_objects_empty_p", "ID-INDEX-DENSE-OBJECTS-EMPTY-P", 2, 0, false );
    SubLFiles.declareFunction( me, "id_index_skip_tombstones_p", "ID-INDEX-SKIP-TOMBSTONES-P", 1, 0, false );
    SubLFiles.declareMacro( me, "do_id_index_sparse_objects", "DO-ID-INDEX-SPARSE-OBJECTS" );
    SubLFiles.declareFunction( me, "id_index_sparse_objects_empty_p", "ID-INDEX-SPARSE-OBJECTS-EMPTY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "id_index_sparse_object_ids", "ID-INDEX-SPARSE-OBJECT-IDS", 1, 0, false );
    SubLFiles.declareMacro( me, "new_do_id_index", "NEW-DO-ID-INDEX" );
    SubLFiles.declareFunction( me, "do_id_index_next_id", "DO-ID-INDEX-NEXT-ID", 4, 0, false );
    SubLFiles.declareFunction( me, "do_id_index_next_state", "DO-ID-INDEX-NEXT-STATE", 4, 0, false );
    SubLFiles.declareFunction( me, "do_id_index_state_object", "DO-ID-INDEX-STATE-OBJECT", 4, 0, false );
    SubLFiles.declareFunction( me, "do_id_index_object_validP", "DO-ID-INDEX-OBJECT-VALID?", 2, 0, false );
    SubLFiles.declareFunction( me, "id_index_old_and_new_object_counts", "ID-INDEX-OLD-AND-NEW-OBJECT-COUNTS", 1, 1, false );
    SubLFiles.declareFunction( me, "cfasl_output_object_id_index_method", "CFASL-OUTPUT-OBJECT-ID-INDEX-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_wide_output_id_index", "CFASL-WIDE-OUTPUT-ID-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_id_index_internal", "CFASL-OUTPUT-ID-INDEX-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_id_index", "CFASL-INPUT-ID-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "test_id_index_cfasl_serialization", "TEST-ID-INDEX-CFASL-SERIALIZATION", 2, 2, false );
    SubLFiles.declareFunction( me, "id_index_optimized_p", "ID-INDEX-OPTIMIZED-P", 1, 0, false );
    SubLFiles.declareFunction( me, "optimize_id_index", "OPTIMIZE-ID-INDEX", 1, 1, false );
    SubLFiles.declareFunction( me, "id_index_pessimized_p", "ID-INDEX-PESSIMIZED-P", 1, 0, false );
    SubLFiles.declareFunction( me, "pessimize_id_index", "PESSIMIZE-ID-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "id_index_compact_p", "ID-INDEX-COMPACT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "compact_id_index", "COMPACT-ID-INDEX", 1, 1, false );
    SubLFiles.declareFunction( me, "new_indirect_compact_id_index", "NEW-INDIRECT-COMPACT-ID-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "id_index_ids", "ID-INDEX-IDS", 1, 0, false );
    SubLFiles.declareFunction( me, "id_index_values", "ID-INDEX-VALUES", 1, 0, false );
    SubLFiles.declareFunction( me, "clone_id_index", "CLONE-ID-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "copy_id_index", "COPY-ID-INDEX", 1, 1, false );
    SubLFiles.declareFunction( me, "id_index_missing_ids", "ID-INDEX-MISSING-IDS", 1, 2, false );
    SubLFiles.declareFunction( me, "test_id_index_missing_ids", "TEST-ID-INDEX-MISSING-IDS", 3, 0, false );
    SubLFiles.declareFunction( me, "build_reverse_index_for_id_index", "BUILD-REVERSE-INDEX-FOR-ID-INDEX", 2, 1, false );
    SubLFiles.declareFunction( me, "new_id_index_from_reverse_index", "NEW-ID-INDEX-FROM-REVERSE-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "find_max_index_id_in_reverse_index", "FIND-MAX-INDEX-ID-IN-REVERSE-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "test_new_index_from_reverse_index", "TEST-NEW-INDEX-FROM-REVERSE-INDEX", 2, 2, false );
    SubLFiles.declareFunction( me, "new_id_index_for_testing_purposes", "NEW-ID-INDEX-FOR-TESTING-PURPOSES", 2, 1, false );
    SubLFiles.declareFunction( me, "test_do_id_index_with_tombstones", "TEST-DO-ID-INDEX-WITH-TOMBSTONES", 3, 0, false );
    SubLFiles.declareFunction( me, "new_id_index_for_testing_purposes_with_random_holes", "NEW-ID-INDEX-FOR-TESTING-PURPOSES-WITH-RANDOM-HOLES", 3, 1, false );
    SubLFiles.declareFunction( me, "populate_reverse_index_for_id_index", "POPULATE-REVERSE-INDEX-FOR-ID-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "test_id_index_with_swizzling", "TEST-ID-INDEX-WITH-SWIZZLING", 2, 0, false );
    SubLFiles.declareFunction( me, "test_id_index_ordered_iteration", "TEST-ID-INDEX-ORDERED-ITERATION", 2, 0, false );
    SubLFiles.declareFunction( me, "test_pessimize_id_index", "TEST-PESSIMIZE-ID-INDEX", 0, 0, false );
    SubLFiles.declareFunction( me, "benchmark_id_index_iteration", "BENCHMARK-ID-INDEX-ITERATION", 0, 0, false );
    SubLFiles.declareFunction( me, "benchmark_id_index_iteration_int", "BENCHMARK-ID-INDEX-ITERATION-INT", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_id_index_file()
  {
    $dtp_id_index$ = SubLFiles.defconstant( "*DTP-ID-INDEX*", $sym0$ID_INDEX );
    $id_index_default_scaling_factor$ = SubLFiles.deflexical( "*ID-INDEX-DEFAULT-SCALING-FACTOR*", $int44$100 );
    $id_index_equality_test$ = SubLFiles.deflexical( "*ID-INDEX-EQUALITY-TEST*", EQL );
    $id_index_empty_list$ = SubLFiles.defconstant( "*ID-INDEX-EMPTY-LIST*", Symbols.make_symbol( $str47$THE_EMPTY_LIST ) );
    $cfasl_wide_opcode_id_index$ = SubLFiles.defconstant( "*CFASL-WIDE-OPCODE-ID-INDEX*", $int147$128 );
    return NIL;
  }

  public static SubLObject setup_id_index_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_id_index$.getGlobalValue(), Symbols.symbol_function( $sym7$ID_INDEX_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list8 );
    Structures.def_csetf( $sym9$IDIX_LOCK, $sym10$_CSETF_IDIX_LOCK );
    Structures.def_csetf( $sym11$IDIX_COUNT, $sym12$_CSETF_IDIX_COUNT );
    Structures.def_csetf( $sym13$IDIX_NEXT_ID, $sym14$_CSETF_IDIX_NEXT_ID );
    Structures.def_csetf( $sym15$IDIX_DENSE_OBJECTS, $sym16$_CSETF_IDIX_DENSE_OBJECTS );
    Structures.def_csetf( $sym17$IDIX_SPARSE_OBJECTS, $sym18$_CSETF_IDIX_SPARSE_OBJECTS );
    Equality.identity( $sym0$ID_INDEX );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_id_index$.getGlobalValue(), Symbols.symbol_function( $sym29$VISIT_DEFSTRUCT_OBJECT_ID_INDEX_METHOD ) );
    access_macros.register_macro_helper( $sym34$ID_INDEX_DENSE_OBJECTS, $sym35$DO_ID_INDEX_DENSE_OBJECTS );
    access_macros.register_macro_helper( $sym36$ID_INDEX_SPARSE_OBJECTS, $sym37$DO_ID_INDEX_SPARSE_OBJECTS );
    access_macros.register_macro_helper( $sym41$ID_INDEX_LOCK, $sym43$WITH_ID_INDEX_LOCKED );
    access_macros.register_macro_helper( $sym48$ID_INDEX_TOMBSTONE_P, $sym49$DO_ID_INDEX );
    utilities_macros.note_funcall_helper_function( $sym58$ID_INDEX_SPARSE_OBJECTS_ORDERED_ITERATOR_DONE_ );
    utilities_macros.note_funcall_helper_function( $sym59$ID_INDEX_SPARSE_OBJECTS_ORDERED_ITERATOR_NEXT );
    access_macros.register_macro_helper( $sym74$ID_INDEX_OBJECTS_EMPTY_P, $sym49$DO_ID_INDEX );
    access_macros.register_macro_helper( $sym35$DO_ID_INDEX_DENSE_OBJECTS, $sym49$DO_ID_INDEX );
    access_macros.register_macro_helper( $sym89$ID_INDEX_DENSE_OBJECTS_EMPTY_P, $sym35$DO_ID_INDEX_DENSE_OBJECTS );
    access_macros.register_macro_helper( $sym92$ID_INDEX_SKIP_TOMBSTONES_P, $list100 );
    access_macros.register_macro_helper( $sym37$DO_ID_INDEX_SPARSE_OBJECTS, $sym49$DO_ID_INDEX );
    access_macros.register_macro_helper( $sym112$ID_INDEX_SPARSE_OBJECTS_EMPTY_P, $sym37$DO_ID_INDEX_SPARSE_OBJECTS );
    access_macros.register_macro_helper( $sym123$ID_INDEX_SPARSE_OBJECT_IDS, $sym37$DO_ID_INDEX_SPARSE_OBJECTS );
    access_macros.register_macro_helper( $sym142$DO_ID_INDEX_NEXT_ID, $sym129$NEW_DO_ID_INDEX );
    access_macros.register_macro_helper( $sym143$DO_ID_INDEX_NEXT_STATE, $sym129$NEW_DO_ID_INDEX );
    access_macros.register_macro_helper( $sym144$DO_ID_INDEX_STATE_OBJECT, $sym129$NEW_DO_ID_INDEX );
    access_macros.register_macro_helper( $sym145$DO_ID_INDEX_OBJECT_VALID_, $sym129$NEW_DO_ID_INDEX );
    cfasl.register_wide_cfasl_opcode_input_function( $cfasl_wide_opcode_id_index$.getGlobalValue(), $sym148$CFASL_INPUT_ID_INDEX );
    Structures.register_method( cfasl.$cfasl_output_object_method_table$.getGlobalValue(), $dtp_id_index$.getGlobalValue(), Symbols.symbol_function( $sym149$CFASL_OUTPUT_OBJECT_ID_INDEX_METHOD ) );
    generic_testing.define_test_case_table_int( $sym154$TEST_ID_INDEX_CFASL_SERIALIZATION, ConsesLow.list( new SubLObject[] { $kw155$TEST, NIL, $kw156$OWNER, NIL, $kw157$CLASSES, NIL, $kw158$KB, $kw159$TINY,
      $kw160$WORKING_, T
    } ), $list161 );
    generic_testing.define_test_case_table_int( $sym177$TEST_ID_INDEX_MISSING_IDS, ConsesLow.list( new SubLObject[] { $kw155$TEST, NIL, $kw156$OWNER, NIL, $kw157$CLASSES, NIL, $kw158$KB, $kw159$TINY, $kw160$WORKING_, T
    } ), $list178 );
    generic_testing.define_test_case_table_int( $sym183$TEST_NEW_INDEX_FROM_REVERSE_INDEX, ConsesLow.list( new SubLObject[] { $kw155$TEST, NIL, $kw156$OWNER, NIL, $kw157$CLASSES, NIL, $kw158$KB, $kw159$TINY,
      $kw160$WORKING_, T
    } ), $list161 );
    generic_testing.define_test_case_table_int( $sym189$TEST_DO_ID_INDEX_WITH_TOMBSTONES, ConsesLow.list( new SubLObject[] { $kw155$TEST, NIL, $kw156$OWNER, NIL, $kw157$CLASSES, NIL, $kw158$KB, $kw159$TINY,
      $kw160$WORKING_, NIL
    } ), $list178 );
    generic_testing.define_test_case_table_int( $sym200$TEST_ID_INDEX_WITH_SWIZZLING, ConsesLow.list( new SubLObject[] { $kw155$TEST, NIL, $kw156$OWNER, NIL, $kw157$CLASSES, NIL, $kw158$KB, $kw159$TINY, $kw160$WORKING_,
      T
    } ), $list201 );
    generic_testing.define_test_case_table_int( $sym205$TEST_ID_INDEX_ORDERED_ITERATION, ConsesLow.list( new SubLObject[] { $kw155$TEST, NIL, $kw156$OWNER, NIL, $kw157$CLASSES, NIL, $kw158$KB, $kw159$TINY,
      $kw160$WORKING_, T
    } ), $list206 );
    generic_testing.define_test_case_table_int( $sym221$TEST_PESSIMIZE_ID_INDEX, ConsesLow.list( new SubLObject[] { $kw155$TEST, NIL, $kw156$OWNER, NIL, $kw157$CLASSES, NIL, $kw158$KB, $kw159$TINY, $kw160$WORKING_, T
    } ), $list222 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_id_index_file();
  }

  @Override
  public void initializeVariables()
  {
    init_id_index_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_id_index_file();
  }
  static
  {
    me = new id_index();
    $dtp_id_index$ = null;
    $id_index_default_scaling_factor$ = null;
    $id_index_equality_test$ = null;
    $id_index_empty_list$ = null;
    $cfasl_wide_opcode_id_index$ = null;
    $sym0$ID_INDEX = makeSymbol( "ID-INDEX" );
    $sym1$ID_INDEX_P = makeSymbol( "ID-INDEX-P" );
    $list2 = ConsesLow.list( makeSymbol( "LOCK" ), makeSymbol( "COUNT" ), makeSymbol( "NEXT-ID" ), makeSymbol( "DENSE-OBJECTS" ), makeSymbol( "SPARSE-OBJECTS" ) );
    $list3 = ConsesLow.list( makeKeyword( "LOCK" ), makeKeyword( "COUNT" ), makeKeyword( "NEXT-ID" ), makeKeyword( "DENSE-OBJECTS" ), makeKeyword( "SPARSE-OBJECTS" ) );
    $list4 = ConsesLow.list( makeSymbol( "IDIX-LOCK" ), makeSymbol( "IDIX-COUNT" ), makeSymbol( "IDIX-NEXT-ID" ), makeSymbol( "IDIX-DENSE-OBJECTS" ), makeSymbol( "IDIX-SPARSE-OBJECTS" ) );
    $list5 = ConsesLow.list( makeSymbol( "_CSETF-IDIX-LOCK" ), makeSymbol( "_CSETF-IDIX-COUNT" ), makeSymbol( "_CSETF-IDIX-NEXT-ID" ), makeSymbol( "_CSETF-IDIX-DENSE-OBJECTS" ), makeSymbol(
        "_CSETF-IDIX-SPARSE-OBJECTS" ) );
    $sym6$PRINT_ID_INDEX = makeSymbol( "PRINT-ID-INDEX" );
    $sym7$ID_INDEX_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "ID-INDEX-PRINT-FUNCTION-TRAMPOLINE" );
    $list8 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "ID-INDEX-P" ) );
    $sym9$IDIX_LOCK = makeSymbol( "IDIX-LOCK" );
    $sym10$_CSETF_IDIX_LOCK = makeSymbol( "_CSETF-IDIX-LOCK" );
    $sym11$IDIX_COUNT = makeSymbol( "IDIX-COUNT" );
    $sym12$_CSETF_IDIX_COUNT = makeSymbol( "_CSETF-IDIX-COUNT" );
    $sym13$IDIX_NEXT_ID = makeSymbol( "IDIX-NEXT-ID" );
    $sym14$_CSETF_IDIX_NEXT_ID = makeSymbol( "_CSETF-IDIX-NEXT-ID" );
    $sym15$IDIX_DENSE_OBJECTS = makeSymbol( "IDIX-DENSE-OBJECTS" );
    $sym16$_CSETF_IDIX_DENSE_OBJECTS = makeSymbol( "_CSETF-IDIX-DENSE-OBJECTS" );
    $sym17$IDIX_SPARSE_OBJECTS = makeSymbol( "IDIX-SPARSE-OBJECTS" );
    $sym18$_CSETF_IDIX_SPARSE_OBJECTS = makeSymbol( "_CSETF-IDIX-SPARSE-OBJECTS" );
    $kw19$LOCK = makeKeyword( "LOCK" );
    $kw20$COUNT = makeKeyword( "COUNT" );
    $kw21$NEXT_ID = makeKeyword( "NEXT-ID" );
    $kw22$DENSE_OBJECTS = makeKeyword( "DENSE-OBJECTS" );
    $kw23$SPARSE_OBJECTS = makeKeyword( "SPARSE-OBJECTS" );
    $str24$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw25$BEGIN = makeKeyword( "BEGIN" );
    $sym26$MAKE_ID_INDEX = makeSymbol( "MAKE-ID-INDEX" );
    $kw27$SLOT = makeKeyword( "SLOT" );
    $kw28$END = makeKeyword( "END" );
    $sym29$VISIT_DEFSTRUCT_OBJECT_ID_INDEX_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-ID-INDEX-METHOD" );
    $str30$COUNT_ = makeString( "COUNT=" );
    $str31$_NEXT_ = makeString( " NEXT=" );
    $sym32$INTEGERP = makeSymbol( "INTEGERP" );
    $str33$_A_has_had_next_id_reduced_from__ = makeString( "~A has had next-id reduced from ~A to ~A.  This may result in errors." );
    $sym34$ID_INDEX_DENSE_OBJECTS = makeSymbol( "ID-INDEX-DENSE-OBJECTS" );
    $sym35$DO_ID_INDEX_DENSE_OBJECTS = makeSymbol( "DO-ID-INDEX-DENSE-OBJECTS" );
    $sym36$ID_INDEX_SPARSE_OBJECTS = makeSymbol( "ID-INDEX-SPARSE-OBJECTS" );
    $sym37$DO_ID_INDEX_SPARSE_OBJECTS = makeSymbol( "DO-ID-INDEX-SPARSE-OBJECTS" );
    $list38 = ConsesLow.list( makeSymbol( "ID-INDEX" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym39$ID_INDEX_LOCK = makeUninternedSymbol( "ID-INDEX-LOCK" );
    $sym40$CLET = makeSymbol( "CLET" );
    $sym41$ID_INDEX_LOCK = makeSymbol( "ID-INDEX-LOCK" );
    $sym42$WITH_LOCK_HELD = makeSymbol( "WITH-LOCK-HELD" );
    $sym43$WITH_ID_INDEX_LOCKED = makeSymbol( "WITH-ID-INDEX-LOCKED" );
    $int44$100 = makeInteger( 100 );
    $sym45$NON_NEGATIVE_INTEGER_P = makeSymbol( "NON-NEGATIVE-INTEGER-P" );
    $str46$ID_INDEX = makeString( "ID-INDEX" );
    $str47$THE_EMPTY_LIST = makeString( "THE-EMPTY-LIST" );
    $sym48$ID_INDEX_TOMBSTONE_P = makeSymbol( "ID-INDEX-TOMBSTONE-P" );
    $sym49$DO_ID_INDEX = makeSymbol( "DO-ID-INDEX" );
    $sym50$_EXIT = makeSymbol( "%EXIT" );
    $str51$Fill_cannot_extend_into_sparse_sp = makeString( "Fill cannot extend into sparse space.~%" );
    $list52 = ConsesLow.list( makeSymbol( "NEW-ID-INDEX-DENSE-OBJECTS-ITERATOR" ), makeSymbol( "NEW-ID-INDEX-SPARSE-OBJECTS-ITERATOR" ) );
    $list53 = ConsesLow.list( makeSymbol( "NEW-ID-INDEX-DENSE-OBJECTS-VALUES-ITERATOR" ), makeSymbol( "NEW-ID-INDEX-SPARSE-OBJECTS-VALUES-ITERATOR" ) );
    $list54 = ConsesLow.list( makeSymbol( "NEW-ID-INDEX-DENSE-OBJECTS-ITERATOR" ), makeSymbol( "NEW-ID-INDEX-SPARSE-OBJECTS-ORDERED-ITERATOR" ) );
    $sym55$ITERATE_ID_INDEX_DENSE_OBJECTS_NECESSARY = makeSymbol( "ITERATE-ID-INDEX-DENSE-OBJECTS-NECESSARY" );
    $list56 = ConsesLow.list( makeSymbol( "ID" ), makeSymbol( "VALUE" ) );
    $sym57$BOOLEAN = makeSymbol( "BOOLEAN" );
    $sym58$ID_INDEX_SPARSE_OBJECTS_ORDERED_ITERATOR_DONE_ = makeSymbol( "ID-INDEX-SPARSE-OBJECTS-ORDERED-ITERATOR-DONE?" );
    $sym59$ID_INDEX_SPARSE_OBJECTS_ORDERED_ITERATOR_NEXT = makeSymbol( "ID-INDEX-SPARSE-OBJECTS-ORDERED-ITERATOR-NEXT" );
    $kw60$KEY = makeKeyword( "KEY" );
    $kw61$VALUE = makeKeyword( "VALUE" );
    $list62 = ConsesLow.list( makeSymbol( "ID" ), makeSymbol( "SPARSE-OBJECTS" ), makeSymbol( "END-ID" ), makeSymbol( "KEY-VALUE-TUPLE" ) );
    $list63 = ConsesLow.list( ConsesLow.list( makeSymbol( "ID" ), makeSymbol( "OBJECT" ), makeSymbol( "ID-INDEX" ), makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "TOMBSTONE" ), makeKeyword( "SKIP" ) ), makeSymbol(
        "ORDERED" ), makeSymbol( "PROGRESS-MESSAGE" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list64 = ConsesLow.list( makeKeyword( "TOMBSTONE" ), makeKeyword( "ORDERED" ), makeKeyword( "PROGRESS-MESSAGE" ), makeKeyword( "DONE" ) );
    $kw65$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw66$TOMBSTONE = makeKeyword( "TOMBSTONE" );
    $kw67$SKIP = makeKeyword( "SKIP" );
    $kw68$ORDERED = makeKeyword( "ORDERED" );
    $kw69$PROGRESS_MESSAGE = makeKeyword( "PROGRESS-MESSAGE" );
    $kw70$DONE = makeKeyword( "DONE" );
    $sym71$OLD_DO_ID_INDEX = makeSymbol( "OLD-DO-ID-INDEX" );
    $sym72$IDX = makeUninternedSymbol( "IDX" );
    $sym73$PUNLESS = makeSymbol( "PUNLESS" );
    $sym74$ID_INDEX_OBJECTS_EMPTY_P = makeSymbol( "ID-INDEX-OBJECTS-EMPTY-P" );
    $sym75$IDX = makeUninternedSymbol( "IDX" );
    $sym76$MESS = makeUninternedSymbol( "MESS" );
    $sym77$TOTAL = makeUninternedSymbol( "TOTAL" );
    $sym78$SOFAR = makeUninternedSymbol( "SOFAR" );
    $sym79$ID_INDEX_COUNT = makeSymbol( "ID-INDEX-COUNT" );
    $list80 = ConsesLow.list( ZERO_INTEGER );
    $sym81$CHECK_TYPE = makeSymbol( "CHECK-TYPE" );
    $list82 = ConsesLow.list( makeSymbol( "STRINGP" ) );
    $sym83$NOTING_PERCENT_PROGRESS = makeSymbol( "NOTING-PERCENT-PROGRESS" );
    $sym84$CINC = makeSymbol( "CINC" );
    $sym85$NOTE_PERCENT_PROGRESS = makeSymbol( "NOTE-PERCENT-PROGRESS" );
    $list86 = ConsesLow.list( ConsesLow.list( makeSymbol( "ID" ), makeSymbol( "OBJECT" ), makeSymbol( "ID-INDEX" ), makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "TOMBSTONE" ), makeKeyword( "SKIP" ) ), makeSymbol(
        "PROGRESS-MESSAGE" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list87 = ConsesLow.list( makeKeyword( "TOMBSTONE" ), makeKeyword( "PROGRESS-MESSAGE" ), makeKeyword( "DONE" ) );
    $sym88$IDX = makeUninternedSymbol( "IDX" );
    $sym89$ID_INDEX_DENSE_OBJECTS_EMPTY_P = makeSymbol( "ID-INDEX-DENSE-OBJECTS-EMPTY-P" );
    $sym90$DO_VECTOR_INDEX = makeSymbol( "DO-VECTOR-INDEX" );
    $sym91$CAND = makeSymbol( "CAND" );
    $sym92$ID_INDEX_SKIP_TOMBSTONES_P = makeSymbol( "ID-INDEX-SKIP-TOMBSTONES-P" );
    $sym93$PWHEN = makeSymbol( "PWHEN" );
    $sym94$CSETQ = makeSymbol( "CSETQ" );
    $sym95$IDX = makeUninternedSymbol( "IDX" );
    $sym96$MESS = makeUninternedSymbol( "MESS" );
    $sym97$TOTAL = makeUninternedSymbol( "TOTAL" );
    $sym98$SOFAR = makeUninternedSymbol( "SOFAR" );
    $sym99$ID_INDEX_DENSE_OBJECT_COUNT = makeSymbol( "ID-INDEX-DENSE-OBJECT-COUNT" );
    $list100 = ConsesLow.list( makeSymbol( "DO-ID-INDEX-DENSE-OBJECTS" ), makeSymbol( "DO-ID-INDEX-SPARSE-OBJECTS" ) );
    $sym101$IDX = makeUninternedSymbol( "IDX" );
    $sym102$MESS = makeUninternedSymbol( "MESS" );
    $sym103$TOTAL = makeUninternedSymbol( "TOTAL" );
    $sym104$SOFAR = makeUninternedSymbol( "SOFAR" );
    $sym105$ID_INDEX_SPARSE_OBJECT_COUNT = makeSymbol( "ID-INDEX-SPARSE-OBJECT-COUNT" );
    $sym106$IDX = makeUninternedSymbol( "IDX" );
    $sym107$PIF = makeSymbol( "PIF" );
    $sym108$IDX = makeUninternedSymbol( "IDX" );
    $sym109$SPARSE = makeUninternedSymbol( "SPARSE" );
    $sym110$END_ID = makeUninternedSymbol( "END-ID" );
    $sym111$DEFAULT = makeUninternedSymbol( "DEFAULT" );
    $sym112$ID_INDEX_SPARSE_OBJECTS_EMPTY_P = makeSymbol( "ID-INDEX-SPARSE-OBJECTS-EMPTY-P" );
    $sym113$ID_INDEX_SPARSE_ID_THRESHOLD = makeSymbol( "ID-INDEX-SPARSE-ID-THRESHOLD" );
    $sym114$ID_INDEX_NEXT_ID = makeSymbol( "ID-INDEX-NEXT-ID" );
    $sym115$FUNLESS = makeSymbol( "FUNLESS" );
    $sym116$WHILE = makeSymbol( "WHILE" );
    $sym117$_ = makeSymbol( "<" );
    $sym118$CNOT = makeSymbol( "CNOT" );
    $sym119$GETHASH_WITHOUT_VALUES = makeSymbol( "GETHASH-WITHOUT-VALUES" );
    $str120$Setting__TOMBSTONE_to__A_requires = makeString( "Setting :TOMBSTONE to ~A requires that :ORDERED be set to T" );
    $sym121$IDX = makeUninternedSymbol( "IDX" );
    $sym122$DO_HASH_TABLE = makeSymbol( "DO-HASH-TABLE" );
    $sym123$ID_INDEX_SPARSE_OBJECT_IDS = makeSymbol( "ID-INDEX-SPARSE-OBJECT-IDS" );
    $list124 = ConsesLow.list( ConsesLow.list( new SubLObject[] { makeSymbol( "ID" ), makeSymbol( "OBJECT" ), makeSymbol( "ID-INDEX" ), makeSymbol( "&KEY" ), makeSymbol( "START-ID" ), makeSymbol( "END-ID" ), ConsesLow
        .list( makeSymbol( "TOMBSTONE" ), makeKeyword( "SKIP" ) ), makeSymbol( "ORDERED" ), makeSymbol( "PROGRESS-MESSAGE" ), makeSymbol( "DONE" )
    } ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list125 = ConsesLow.list( makeKeyword( "START-ID" ), makeKeyword( "END-ID" ), makeKeyword( "TOMBSTONE" ), makeKeyword( "ORDERED" ), makeKeyword( "PROGRESS-MESSAGE" ), makeKeyword( "DONE" ) );
    $kw126$START_ID = makeKeyword( "START-ID" );
    $kw127$END_ID = makeKeyword( "END-ID" );
    $sym128$IDX = makeUninternedSymbol( "IDX" );
    $sym129$NEW_DO_ID_INDEX = makeSymbol( "NEW-DO-ID-INDEX" );
    $sym130$MESS = makeUninternedSymbol( "MESS" );
    $sym131$TOTAL = makeUninternedSymbol( "TOTAL" );
    $sym132$SOFAR = makeUninternedSymbol( "SOFAR" );
    $sym133$TOMB = makeUninternedSymbol( "TOMB" );
    $sym134$ORD = makeUninternedSymbol( "ORD" );
    $sym135$LAST_ID = makeUninternedSymbol( "LAST-ID" );
    $sym136$STATE_VAR = makeUninternedSymbol( "STATE-VAR" );
    $sym137$__ = makeSymbol( "<=" );
    $sym138$FIF = makeSymbol( "FIF" );
    $sym139$_ = makeSymbol( "-" );
    $list140 = ConsesLow.list( ONE_INTEGER );
    $list141 = ConsesLow.list( NIL );
    $sym142$DO_ID_INDEX_NEXT_ID = makeSymbol( "DO-ID-INDEX-NEXT-ID" );
    $sym143$DO_ID_INDEX_NEXT_STATE = makeSymbol( "DO-ID-INDEX-NEXT-STATE" );
    $sym144$DO_ID_INDEX_STATE_OBJECT = makeSymbol( "DO-ID-INDEX-STATE-OBJECT" );
    $sym145$DO_ID_INDEX_OBJECT_VALID_ = makeSymbol( "DO-ID-INDEX-OBJECT-VALID?" );
    $str146$unexpected_new_do_id_index_iterat = makeString( "unexpected new-do-id-index iteration state ~S" );
    $int147$128 = makeInteger( 128 );
    $sym148$CFASL_INPUT_ID_INDEX = makeSymbol( "CFASL-INPUT-ID-INDEX" );
    $sym149$CFASL_OUTPUT_OBJECT_ID_INDEX_METHOD = makeSymbol( "CFASL-OUTPUT-OBJECT-ID-INDEX-METHOD" );
    $str150$Expected__A_dense_elements__got__ = makeString( "Expected ~A dense elements, got ~A instead." );
    $str151$Expected__A_sparse_elements__got_ = makeString( "Expected ~A sparse elements, got ~A instead." );
    $str152$The_sparse_ID_index_should_have__ = makeString( "The sparse ID index should have ~A entries, but it has ~A." );
    $str153$The_sparse_ID_index_should_have_a = makeString( "The sparse ID index should have a dense space size of ~A, not ~A." );
    $sym154$TEST_ID_INDEX_CFASL_SERIALIZATION = makeSymbol( "TEST-ID-INDEX-CFASL-SERIALIZATION" );
    $kw155$TEST = makeKeyword( "TEST" );
    $kw156$OWNER = makeKeyword( "OWNER" );
    $kw157$CLASSES = makeKeyword( "CLASSES" );
    $kw158$KB = makeKeyword( "KB" );
    $kw159$TINY = makeKeyword( "TINY" );
    $kw160$WORKING_ = makeKeyword( "WORKING?" );
    $list161 = ConsesLow.list( ConsesLow.list( ConsesLow.list( makeInteger( 100 ), TWENTY_INTEGER ), makeKeyword( "SUCCESS" ) ), ConsesLow.list( ConsesLow.list( makeInteger( 100 ), TWENTY_INTEGER, makeSymbol(
        "TO-HEX-STRING" ), EQUAL ), makeKeyword( "SUCCESS" ) ) );
    $sym162$TO_STRING = makeSymbol( "TO-STRING" );
    $str163$We_did_not_get_an_ID_index_back__ = makeString( "We did not get an ID index back, but got ~A instead." );
    $str164$The_dense_ID_index__A_does_not_ha = makeString( "The dense ID index ~A does not have the same number of elements as the new ID index ~A." );
    $kw165$SUCCESS = makeKeyword( "SUCCESS" );
    $sym166$ID_INDEX_PESSIMIZED_P = makeSymbol( "ID-INDEX-PESSIMIZED-P" );
    $str167$Compacting_ID_index = makeString( "Compacting ID index" );
    $sym168$STRINGP = makeSymbol( "STRINGP" );
    $sym169$FUNCTION_SPEC_P = makeSymbol( "FUNCTION-SPEC-P" );
    $str170$Updating_object_IDs = makeString( "Updating object IDs" );
    $kw171$ALL = makeKeyword( "ALL" );
    $list172 = ConsesLow.list( makeKeyword( "ALL" ), makeKeyword( "DENSE" ), makeKeyword( "SPARSE" ) );
    $str173$Type_must_be_one_of_____ALL__DENS = makeString( "Type must be one of -- :ALL :DENSE :SPARSE" );
    $kw174$SPARSE = makeKeyword( "SPARSE" );
    $list175 = ConsesLow.list( makeUninternedSymbol( "START" ), makeUninternedSymbol( "END" ), makeUninternedSymbol( "DELTA" ) );
    $kw176$DENSE = makeKeyword( "DENSE" );
    $sym177$TEST_ID_INDEX_MISSING_IDS = makeSymbol( "TEST-ID-INDEX-MISSING-IDS" );
    $list178 = ConsesLow.list( ConsesLow.list( ConsesLow.list( makeInteger( 100 ), TWENTY_INTEGER, TWENTY_INTEGER ), makeKeyword( "SUCCESS" ) ), ConsesLow.list( ConsesLow.list( makeInteger( 1000 ), makeInteger( 200 ),
        makeInteger( 200 ) ), makeKeyword( "SUCCESS" ) ), ConsesLow.list( ConsesLow.list( makeInteger( 255 ), ZERO_INTEGER, makeInteger( 40 ) ), makeKeyword( "SUCCESS" ) ) );
    $str179$ID__A_is_missing__it_is__A_ = makeString( "ID ~A is missing; it is ~A." );
    $str180$expected_to_be_present = makeString( "expected to be present" );
    $str181$expected_to_be_absent = makeString( "expected to be absent" );
    $list182 = ConsesLow.list( makeSymbol( "KEY" ), makeSymbol( "ID" ) );
    $sym183$TEST_NEW_INDEX_FROM_REVERSE_INDEX = makeSymbol( "TEST-NEW-INDEX-FROM-REVERSE-INDEX" );
    $str184$The_dense_ID_index__A_is_of_a_dif = makeString( "The dense ID index ~A is of a different size than the new ID index ~A." );
    $kw185$NOT_FOUND = makeKeyword( "NOT-FOUND" );
    $str186$The_reverse_index_for__A_does_not = makeString( "The reverse index for ~A does not contain ~A." );
    $str187$The_new_ID_index_does_not_have__A = makeString( "The new ID index does not have ~A at location ~A." );
    $str188$There_is_a_mismatch_between_the__ = makeString( "There is a mismatch between the ~A-nth expected next ID, ~A and the actual ID suggested ~A." );
    $sym189$TEST_DO_ID_INDEX_WITH_TOMBSTONES = makeSymbol( "TEST-DO-ID-INDEX-WITH-TOMBSTONES" );
    $kw190$RIP = makeKeyword( "RIP" );
    $str191$Error__the_ID_range_is_not_truely = makeString( "Error, the ID range is not truely consecutive; expected ~A got ~A." );
    $str192$Error_at_index__A__expected_tombs = makeString( "Error at index ~A, expected tombstone, got ~A." );
    $str193$Error_at_index__A__expected_objec = makeString( "Error at index ~A, expected object, got tombstone." );
    $str194$There_are_holes_that_we_did_not_s = makeString( "There are holes that we did not see: ~A were missing." );
    $str195$Error__ID__A_is_not_in_line_with_ = makeString( "Error, ID ~A is not in line with counter ~A." );
    $str196$_DONE_should_have_taken_us_to__A_ = makeString( ":DONE should have taken us to ~A but it got us to ~A." );
    $str197$Hey__we_deleted_everything_and_th = makeString( "Hey, we deleted everything and the ID index is not empty?" );
    $str198$Error__an_empty_ID_index_contains = makeString( "Error, an empty ID index contains non-tombstone ~A???" );
    $str199$Hey___A______A__they_did_not_show = makeString( "Hey, ~A =/= ~A; they did not show us all the tombstones ...!" );
    $sym200$TEST_ID_INDEX_WITH_SWIZZLING = makeSymbol( "TEST-ID-INDEX-WITH-SWIZZLING" );
    $list201 = ConsesLow.list( ConsesLow.list( ConsesLow.list( makeInteger( 100 ), TWENTY_INTEGER ), makeKeyword( "SUCCESS" ) ), ConsesLow.list( ConsesLow.list( makeInteger( 100 ), makeInteger( 200 ) ), makeKeyword(
        "SUCCESS" ) ) );
    $str202$The_test_is_badly_designed__no_bi = makeString( "The test is badly designed, no bignum IDs were produced.~%" );
    $str203$ = makeString( "" );
    $str204$We_could_not_retrieve__S_from_the = makeString( "We could not retrieve ~S from the ID index using ~A." );
    $sym205$TEST_ID_INDEX_ORDERED_ITERATION = makeSymbol( "TEST-ID-INDEX-ORDERED-ITERATION" );
    $list206 = ConsesLow.list( ConsesLow.list( ConsesLow.list( TEN_INTEGER, TWENTY_INTEGER ), makeKeyword( "SUCCESS" ) ), ConsesLow.list( ConsesLow.list( makeInteger( 100 ), makeInteger( 200 ) ), makeKeyword(
        "SUCCESS" ) ) );
    $str207$We_expected_something_larger_than = makeString( "We expected something larger than ~A, but got ~A.~%" );
    $str208$a = makeString( "a" );
    $str209$b = makeString( "b" );
    $str210$c = makeString( "c" );
    $list211 = ConsesLow.list( makeString( "a" ), makeString( "b" ), makeString( "c" ) );
    $str212$d = makeString( "d" );
    $str213$e = makeString( "e" );
    $kw214$ID_INDEX_RELOOKUP_FAILURE = makeKeyword( "ID-INDEX-RELOOKUP-FAILURE" );
    $kw215$ID_INDEX_RECOUNT_FAILURE = makeKeyword( "ID-INDEX-RECOUNT-FAILURE" );
    $kw216$DO_ID_INDEX_FAILURE = makeKeyword( "DO-ID-INDEX-FAILURE" );
    $kw217$ID_INDEX_LOOKUP_FAILURE = makeKeyword( "ID-INDEX-LOOKUP-FAILURE" );
    $kw218$ID_INDEX_COUNT_FAILURE = makeKeyword( "ID-INDEX-COUNT-FAILURE" );
    $kw219$INITIAL_ID_INDEX_COUNT_FAILURE = makeKeyword( "INITIAL-ID-INDEX-COUNT-FAILURE" );
    $kw220$UNEXPECTED_FAILURE = makeKeyword( "UNEXPECTED-FAILURE" );
    $sym221$TEST_PESSIMIZE_ID_INDEX = makeSymbol( "TEST-PESSIMIZE-ID-INDEX" );
    $list222 = ConsesLow.list( ConsesLow.list( NIL, makeKeyword( "SUCCESS" ) ) );
    $list223 = ConsesLow.list( makeInteger( 100 ), makeInteger( 1000 ), makeInteger( 10000 ), makeInteger( 100000 ), makeInteger( 1000000 ) );
    $int224$212 = makeInteger( 212 );
  }

  public static final class $id_index_native
      extends
        SubLStructNative
  {
    public SubLObject $lock;
    public SubLObject $count;
    public SubLObject $next_id;
    public SubLObject $dense_objects;
    public SubLObject $sparse_objects;
    private static final SubLStructDeclNative structDecl;

    public $id_index_native()
    {
      this.$lock = CommonSymbols.NIL;
      this.$count = CommonSymbols.NIL;
      this.$next_id = CommonSymbols.NIL;
      this.$dense_objects = CommonSymbols.NIL;
      this.$sparse_objects = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $id_index_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$lock;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$count;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$next_id;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$dense_objects;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$sparse_objects;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$lock = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$count = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$next_id = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$dense_objects = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$sparse_objects = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $id_index_native.class, $sym0$ID_INDEX, $sym1$ID_INDEX_P, $list2, $list3, new String[] { "$lock", "$count", "$next_id", "$dense_objects", "$sparse_objects"
      }, $list4, $list5, $sym6$PRINT_ID_INDEX );
    }
  }

  public static final class $id_index_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $id_index_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "ID-INDEX-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return id_index_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 1086 ms synthetic
 */