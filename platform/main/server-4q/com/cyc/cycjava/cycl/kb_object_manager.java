package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrologSync;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class kb_object_manager
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.kb_object_manager";
  public static final String myFingerPrint = "db8fd13f1e1dbb9c1fad723d80cf25bc6e83a1625c2b2b823a7fca4c1a2660de";
  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 2333L)
  public static SubLSymbol $dtp_kb_object_manager$;
  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 5759L)
  private static SubLSymbol $min_kb_object_lru_size$;
  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 5886L)
  private static SubLSymbol $kbom_id_equality_test$;
  private static final SubLList $list0;
  private static final SubLSymbol $sym1$WITH_LOCK_HELD;
  private static final SubLSymbol $sym2$KB_OBJECT_MANAGER_CONTENT_LOCK;
  private static final SubLSymbol $sym3$KB_OBJECT_MANAGER;
  private static final SubLSymbol $sym4$KB_OBJECT_MANAGER_P;
  private static final SubLList $list5;
  private static final SubLList $list6;
  private static final SubLList $list7;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$DEFAULT_STRUCT_PRINT_FUNCTION;
  private static final SubLSymbol $sym10$KB_OBJECT_MANAGER_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list11;
  private static final SubLSymbol $sym12$KBOM_NAME;
  private static final SubLSymbol $sym13$_CSETF_KBOM_NAME;
  private static final SubLSymbol $sym14$KBOM_CONTENT_LOCK;
  private static final SubLSymbol $sym15$_CSETF_KBOM_CONTENT_LOCK;
  private static final SubLSymbol $sym16$KBOM_LRU_SIZE_PERCENTAGE;
  private static final SubLSymbol $sym17$_CSETF_KBOM_LRU_SIZE_PERCENTAGE;
  private static final SubLSymbol $sym18$KBOM_CONTENT_TABLE;
  private static final SubLSymbol $sym19$_CSETF_KBOM_CONTENT_TABLE;
  private static final SubLSymbol $sym20$KBOM_USAGE_TABLE;
  private static final SubLSymbol $sym21$_CSETF_KBOM_USAGE_TABLE;
  private static final SubLSymbol $sym22$KBOM_LRU_INFORMATION;
  private static final SubLSymbol $sym23$_CSETF_KBOM_LRU_INFORMATION;
  private static final SubLSymbol $sym24$KBOM_FILE_VECTOR;
  private static final SubLSymbol $sym25$_CSETF_KBOM_FILE_VECTOR;
  private static final SubLSymbol $sym26$KBOM_ID_THRESHOLD;
  private static final SubLSymbol $sym27$_CSETF_KBOM_ID_THRESHOLD;
  private static final SubLSymbol $sym28$KBOM_LOAD_FUNC;
  private static final SubLSymbol $sym29$_CSETF_KBOM_LOAD_FUNC;
  private static final SubLSymbol $sym30$KBOM_METER_SWAP_TIME_;
  private static final SubLSymbol $sym31$_CSETF_KBOM_METER_SWAP_TIME_;
  private static final SubLSymbol $sym32$KBOM_SWAP_TIME;
  private static final SubLSymbol $sym33$_CSETF_KBOM_SWAP_TIME;
  private static final SubLSymbol $sym34$KBOM_LRU_SIZE_MAX;
  private static final SubLSymbol $sym35$_CSETF_KBOM_LRU_SIZE_MAX;
  private static final SubLSymbol $sym36$KBOM_SUB_FILE_VECTOR;
  private static final SubLSymbol $sym37$_CSETF_KBOM_SUB_FILE_VECTOR;
  private static final SubLSymbol $sym38$KBOM_DUMMY3;
  private static final SubLSymbol $sym39$_CSETF_KBOM_DUMMY3;
  private static final SubLSymbol $kw40$NAME;
  private static final SubLSymbol $kw41$CONTENT_LOCK;
  private static final SubLSymbol $kw42$LRU_SIZE_PERCENTAGE;
  private static final SubLSymbol $kw43$CONTENT_TABLE;
  private static final SubLSymbol $kw44$USAGE_TABLE;
  private static final SubLSymbol $kw45$LRU_INFORMATION;
  private static final SubLSymbol $kw46$FILE_VECTOR;
  private static final SubLSymbol $kw47$ID_THRESHOLD;
  private static final SubLSymbol $kw48$LOAD_FUNC;
  private static final SubLSymbol $kw49$METER_SWAP_TIME_;
  private static final SubLSymbol $kw50$SWAP_TIME;
  private static final SubLSymbol $kw51$LRU_SIZE_MAX;
  private static final SubLSymbol $kw52$SUB_FILE_VECTOR;
  private static final SubLSymbol $kw53$DUMMY3;
  private static final SubLString $str54$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw55$BEGIN;
  private static final SubLSymbol $sym56$MAKE_KB_OBJECT_MANAGER;
  private static final SubLSymbol $kw57$SLOT;
  private static final SubLSymbol $kw58$END;
  private static final SubLSymbol $sym59$VISIT_DEFSTRUCT_OBJECT_KB_OBJECT_MANAGER_METHOD;
  private static final SubLSymbol $sym60$STRINGP;
  private static final SubLSymbol $sym61$NON_NEGATIVE_INTEGER_P;
  private static final SubLSymbol $sym62$POSITIVE_INTEGER_P;
  private static final SubLSymbol $sym63$FBOUNDP;
  private static final SubLString $str64$_content_manager_lock;
  private static final SubLSymbol $kw65$UNINITIALIZED;
  private static final SubLInteger $int66$212;
  private static final SubLInteger $int67$100;
  private static final SubLString $str68$Got__s__expected_an_extensionless;
  private static final SubLSymbol $kw69$OLDEST;
  private static final SubLSymbol $sym70$NEW_LEGACY_KB_OBJECT_MANAGER;
  private static final SubLFloat $float71$0_05;
  private static final SubLString $str72$Failed_to_swap_in_KB_object__A_ba;
  private static final SubLString $str73$We_expected_KB_object_ID__A_from_;
  private static final SubLSymbol $sym74$SERIALIZE_KBOM_LRU_INFORMATION;
  private static final SubLSymbol $kw75$OUTPUT;
  private static final SubLString $str76$Unable_to_open__S;
  private static final SubLSymbol $sym77$PRECACHE_KBOM_BY_LRU_INFORMATION;
  private static final SubLSymbol $kw78$INPUT;
  private static final SubLSymbol $sym79$_;
  private static final SubLString $str80$_lru_info_for_;
  private static final SubLString $str81$_cfasl;
  private static final SubLSymbol $kw82$NEWEST;
  private static final SubLString $str83$Swapping_out_;
  private static final SubLString $str84$_objects;
  private static final SubLString $str85$cdolist;
  private static final SubLSymbol $sym86$IS_MUTED_KB_OBJECT_;
  private static final SubLList $list87;
  private static final SubLString $str88$Verifying_integrity_of_;
  private static final SubLString $str89$_content_table;
  private static final SubLSymbol $kw90$SKIP;
  private static final SubLString $str91$Entry__a_is_invalid___a__repairin;
  private static final SubLString $str92$Entry__a_is_invalid___a;
  private static final SubLSymbol $sym93$MANAGER;
  private static final SubLSymbol $sym94$MAINTAINING_COUNTS_;
  private static final SubLSymbol $sym95$MEMORY_MAPPED_;
  private static final SubLSymbol $sym96$CLET;
  private static final SubLSymbol $sym97$KB_OBJECT_USAGE_COUNTS_ENABLED_;
  private static final SubLSymbol $sym98$KB_OBJECT_MANAGER_MEMORY_MAPPED_;
  private static final SubLSymbol $sym99$CUNWIND_PROTECT;
  private static final SubLSymbol $sym100$PROGN;
  private static final SubLSymbol $sym101$DONT_MAINTAIN_KB_OBJECT_USAGE_COUNTS;
  private static final SubLSymbol $sym102$KB_OBJECT_MANAGER_ENABLE_MEMORY_MAPPING;
  private static final SubLSymbol $sym103$PWHEN;
  private static final SubLSymbol $sym104$MAINTAIN_KB_OBJECT_USAGE_COUNTS;
  private static final SubLSymbol $sym105$CNOT;
  private static final SubLSymbol $sym106$KB_OBJECT_MANAGER_CHANGE_STREAM_BUFFER_SIZES;
  private static final SubLList $list107;

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 1696L)
  public static SubLObject with_kb_object_manager_lock_held(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject kbom = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    kbom = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym1$WITH_LOCK_HELD, ConsesLow.list( ConsesLow.list( $sym2$KB_OBJECT_MANAGER_CONTENT_LOCK, kbom ) ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 2333L)
  public static SubLObject kb_object_manager_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 2333L)
  public static SubLObject kb_object_manager_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $kb_object_manager_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 2333L)
  public static SubLObject kbom_name(final SubLObject v_object)
  {
    assert NIL != kb_object_manager_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 2333L)
  public static SubLObject kbom_content_lock(final SubLObject v_object)
  {
    assert NIL != kb_object_manager_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 2333L)
  public static SubLObject kbom_lru_size_percentage(final SubLObject v_object)
  {
    assert NIL != kb_object_manager_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 2333L)
  public static SubLObject kbom_content_table(final SubLObject v_object)
  {
    assert NIL != kb_object_manager_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 2333L)
  public static SubLObject kbom_usage_table(final SubLObject v_object)
  {
    assert NIL != kb_object_manager_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 2333L)
  public static SubLObject kbom_lru_information(final SubLObject v_object)
  {
    assert NIL != kb_object_manager_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 2333L)
  public static SubLObject kbom_file_vector(final SubLObject v_object)
  {
    assert NIL != kb_object_manager_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 2333L)
  public static SubLObject kbom_id_threshold(final SubLObject v_object)
  {
    assert NIL != kb_object_manager_p( v_object ) : v_object;
    return v_object.getField9();
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 2333L)
  public static SubLObject kbom_load_func(final SubLObject v_object)
  {
    assert NIL != kb_object_manager_p( v_object ) : v_object;
    return v_object.getField10();
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 2333L)
  public static SubLObject kbom_meter_swap_timeP(final SubLObject v_object)
  {
    assert NIL != kb_object_manager_p( v_object ) : v_object;
    return v_object.getField11();
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 2333L)
  public static SubLObject kbom_swap_time(final SubLObject v_object)
  {
    assert NIL != kb_object_manager_p( v_object ) : v_object;
    return v_object.getField12();
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 2333L)
  public static SubLObject kbom_lru_size_max(final SubLObject v_object)
  {
    assert NIL != kb_object_manager_p( v_object ) : v_object;
    return v_object.getField13();
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 2333L)
  public static SubLObject kbom_sub_file_vector(final SubLObject v_object)
  {
    assert NIL != kb_object_manager_p( v_object ) : v_object;
    return v_object.getField14();
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 2333L)
  public static SubLObject kbom_dummy3(final SubLObject v_object)
  {
    assert NIL != kb_object_manager_p( v_object ) : v_object;
    return v_object.getField15();
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 2333L)
  public static SubLObject _csetf_kbom_name(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != kb_object_manager_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 2333L)
  public static SubLObject _csetf_kbom_content_lock(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != kb_object_manager_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 2333L)
  public static SubLObject _csetf_kbom_lru_size_percentage(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != kb_object_manager_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 2333L)
  public static SubLObject _csetf_kbom_content_table(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != kb_object_manager_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 2333L)
  public static SubLObject _csetf_kbom_usage_table(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != kb_object_manager_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 2333L)
  public static SubLObject _csetf_kbom_lru_information(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != kb_object_manager_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 2333L)
  public static SubLObject _csetf_kbom_file_vector(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != kb_object_manager_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 2333L)
  public static SubLObject _csetf_kbom_id_threshold(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != kb_object_manager_p( v_object ) : v_object;
    return v_object.setField9( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 2333L)
  public static SubLObject _csetf_kbom_load_func(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != kb_object_manager_p( v_object ) : v_object;
    return v_object.setField10( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 2333L)
  public static SubLObject _csetf_kbom_meter_swap_timeP(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != kb_object_manager_p( v_object ) : v_object;
    return v_object.setField11( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 2333L)
  public static SubLObject _csetf_kbom_swap_time(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != kb_object_manager_p( v_object ) : v_object;
    return v_object.setField12( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 2333L)
  public static SubLObject _csetf_kbom_lru_size_max(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != kb_object_manager_p( v_object ) : v_object;
    return v_object.setField13( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 2333L)
  public static SubLObject _csetf_kbom_sub_file_vector(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != kb_object_manager_p( v_object ) : v_object;
    return v_object.setField14( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 2333L)
  public static SubLObject _csetf_kbom_dummy3(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != kb_object_manager_p( v_object ) : v_object;
    return v_object.setField15( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 2333L)
  public static SubLObject make_kb_object_manager(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $kb_object_manager_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw40$NAME ) )
      {
        _csetf_kbom_name( v_new, current_value );
      }
      else if( pcase_var.eql( $kw41$CONTENT_LOCK ) )
      {
        _csetf_kbom_content_lock( v_new, current_value );
      }
      else if( pcase_var.eql( $kw42$LRU_SIZE_PERCENTAGE ) )
      {
        _csetf_kbom_lru_size_percentage( v_new, current_value );
      }
      else if( pcase_var.eql( $kw43$CONTENT_TABLE ) )
      {
        _csetf_kbom_content_table( v_new, current_value );
      }
      else if( pcase_var.eql( $kw44$USAGE_TABLE ) )
      {
        _csetf_kbom_usage_table( v_new, current_value );
      }
      else if( pcase_var.eql( $kw45$LRU_INFORMATION ) )
      {
        _csetf_kbom_lru_information( v_new, current_value );
      }
      else if( pcase_var.eql( $kw46$FILE_VECTOR ) )
      {
        _csetf_kbom_file_vector( v_new, current_value );
      }
      else if( pcase_var.eql( $kw47$ID_THRESHOLD ) )
      {
        _csetf_kbom_id_threshold( v_new, current_value );
      }
      else if( pcase_var.eql( $kw48$LOAD_FUNC ) )
      {
        _csetf_kbom_load_func( v_new, current_value );
      }
      else if( pcase_var.eql( $kw49$METER_SWAP_TIME_ ) )
      {
        _csetf_kbom_meter_swap_timeP( v_new, current_value );
      }
      else if( pcase_var.eql( $kw50$SWAP_TIME ) )
      {
        _csetf_kbom_swap_time( v_new, current_value );
      }
      else if( pcase_var.eql( $kw51$LRU_SIZE_MAX ) )
      {
        _csetf_kbom_lru_size_max( v_new, current_value );
      }
      else if( pcase_var.eql( $kw52$SUB_FILE_VECTOR ) )
      {
        _csetf_kbom_sub_file_vector( v_new, current_value );
      }
      else if( pcase_var.eql( $kw53$DUMMY3 ) )
      {
        _csetf_kbom_dummy3( v_new, current_value );
      }
      else
      {
        Errors.error( $str54$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 2333L)
  public static SubLObject visit_defstruct_kb_object_manager(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw55$BEGIN, $sym56$MAKE_KB_OBJECT_MANAGER, FOURTEEN_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw57$SLOT, $kw40$NAME, kbom_name( obj ) );
    Functions.funcall( visitor_fn, obj, $kw57$SLOT, $kw41$CONTENT_LOCK, kbom_content_lock( obj ) );
    Functions.funcall( visitor_fn, obj, $kw57$SLOT, $kw42$LRU_SIZE_PERCENTAGE, kbom_lru_size_percentage( obj ) );
    Functions.funcall( visitor_fn, obj, $kw57$SLOT, $kw43$CONTENT_TABLE, kbom_content_table( obj ) );
    Functions.funcall( visitor_fn, obj, $kw57$SLOT, $kw44$USAGE_TABLE, kbom_usage_table( obj ) );
    Functions.funcall( visitor_fn, obj, $kw57$SLOT, $kw45$LRU_INFORMATION, kbom_lru_information( obj ) );
    Functions.funcall( visitor_fn, obj, $kw57$SLOT, $kw46$FILE_VECTOR, kbom_file_vector( obj ) );
    Functions.funcall( visitor_fn, obj, $kw57$SLOT, $kw47$ID_THRESHOLD, kbom_id_threshold( obj ) );
    Functions.funcall( visitor_fn, obj, $kw57$SLOT, $kw48$LOAD_FUNC, kbom_load_func( obj ) );
    Functions.funcall( visitor_fn, obj, $kw57$SLOT, $kw49$METER_SWAP_TIME_, kbom_meter_swap_timeP( obj ) );
    Functions.funcall( visitor_fn, obj, $kw57$SLOT, $kw50$SWAP_TIME, kbom_swap_time( obj ) );
    Functions.funcall( visitor_fn, obj, $kw57$SLOT, $kw51$LRU_SIZE_MAX, kbom_lru_size_max( obj ) );
    Functions.funcall( visitor_fn, obj, $kw57$SLOT, $kw52$SUB_FILE_VECTOR, kbom_sub_file_vector( obj ) );
    Functions.funcall( visitor_fn, obj, $kw57$SLOT, $kw53$DUMMY3, kbom_dummy3( obj ) );
    Functions.funcall( visitor_fn, obj, $kw58$END, $sym56$MAKE_KB_OBJECT_MANAGER, FOURTEEN_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 2333L)
  public static SubLObject visit_defstruct_object_kb_object_manager_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_kb_object_manager( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 2776L)
  public static SubLObject new_kb_object_manager(final SubLObject name, final SubLObject size, final SubLObject lru_size_percentage, final SubLObject lru_size_max, final SubLObject load_func,
      final SubLObject exact_sizeP)
  {
    assert NIL != Types.stringp( name ) : name;
    assert NIL != subl_promotions.non_negative_integer_p( size ) : size;
    assert NIL != subl_promotions.positive_integer_p( lru_size_percentage ) : lru_size_percentage;
    assert NIL != subl_promotions.positive_integer_p( lru_size_max ) : lru_size_max;
    assert NIL != Symbols.fboundp( load_func ) : load_func;
    final SubLObject kbom = make_kb_object_manager( UNPROVIDED );
    _csetf_kbom_name( kbom, name );
    _csetf_kbom_content_lock( kbom, Locks.make_lock( Sequences.cconcatenate( name, $str64$_content_manager_lock ) ) );
    _csetf_kbom_lru_size_percentage( kbom, lru_size_percentage );
    _csetf_kbom_lru_size_max( kbom, lru_size_max );
    setup_kb_object_content_table( kbom, size, exact_sizeP );
    _csetf_kbom_usage_table( kbom, $kw65$UNINITIALIZED );
    _csetf_kbom_file_vector( kbom, NIL );
    _csetf_kbom_id_threshold( kbom, ZERO_INTEGER );
    _csetf_kbom_load_func( kbom, load_func );
    _csetf_kbom_meter_swap_timeP( kbom, NIL );
    _csetf_kbom_swap_time( kbom, NIL );
    _csetf_kbom_sub_file_vector( kbom, NIL );
    return kbom;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 4003L)
  public static SubLObject kb_object_manager_change_stream_buffer_sizes(final SubLObject kbom, final SubLObject data_stream_buffer_size, final SubLObject index_stream_buffer_size)
  {
    assert NIL != subl_promotions.positive_integer_p( data_stream_buffer_size ) : data_stream_buffer_size;
    assert NIL != subl_promotions.positive_integer_p( index_stream_buffer_size ) : index_stream_buffer_size;
    assert NIL != kb_object_manager_p( kbom ) : kbom;
    final SubLObject lock = kb_object_manager_content_lock( kbom );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      final SubLObject fvector = kb_object_manager_file_vector( kbom );
      if( NIL != fvector )
      {
        file_vector.file_vector_change_stream_buffer_sizes( fvector, data_stream_buffer_size, index_stream_buffer_size );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 4515L)
  public static SubLObject kb_object_manager_enable_memory_mapping(final SubLObject kbom)
  {
    assert NIL != kb_object_manager_p( kbom ) : kbom;
    final SubLObject lock = kb_object_manager_content_lock( kbom );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      final SubLObject fvector = kb_object_manager_file_vector( kbom );
      if( NIL != fvector )
      {
        file_vector.file_vector_enable_memory_mapping( fvector );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 4802L)
  public static SubLObject kb_object_manager_memory_mappedP(final SubLObject kbom)
  {
    assert NIL != kb_object_manager_p( kbom ) : kbom;
    SubLObject result = NIL;
    final SubLObject lock = kb_object_manager_content_lock( kbom );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      final SubLObject fvector = kb_object_manager_file_vector( kbom );
      result = makeBoolean( NIL != fvector && NIL != file_vector.file_vector_memory_mappedP( fvector ) );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 5116L)
  public static SubLObject setup_kb_object_content_table(final SubLObject kbom, final SubLObject size, final SubLObject exactP)
  {
    SubLObject did_setupP = NIL;
    final SubLObject lock = kb_object_manager_content_lock( kbom );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      final SubLObject content_table = kb_object_manager_content_table( kbom );
      if( NIL == id_index.id_index_p( content_table ) )
      {
        _csetf_kbom_content_table( kbom, id_index.new_id_index( size, ZERO_INTEGER ) );
        did_setupP = T;
      }
      did_setupP = setup_kb_object_content_support( kbom, NIL, size );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    return did_setupP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 5937L)
  public static SubLObject setup_kb_object_content_support(final SubLObject kbom, SubLObject initialize_usage_countsP, SubLObject size)
  {
    if( initialize_usage_countsP == UNPROVIDED )
    {
      initialize_usage_countsP = NIL;
    }
    if( size == UNPROVIDED )
    {
      size = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( !size.isFixnum() )
    {
      size = id_index.id_index_sparse_id_threshold( kb_object_manager_content_table( kbom ) );
    }
    SubLObject did_setupP = NIL;
    if( NIL != initialize_usage_countsP && NIL == id_index.id_index_p( kb_object_manager_usage_table( kbom ) ) )
    {
      _csetf_kbom_usage_table( kbom, id_index.new_id_index( size, ZERO_INTEGER ) );
      did_setupP = T;
    }
    if( NIL == cache.cache_p( kb_object_manager_lru_information( kbom ) ) )
    {
      final SubLObject lru_size = compute_kbom_lru_size( kbom, size );
      final SubLObject _prev_bind_0 = Storage.$current_area$.currentBinding( thread );
      try
      {
        Storage.$current_area$.bind( Storage.get_static_area(), thread );
        _csetf_kbom_lru_information( kbom, cache.new_preallocated_cache( lru_size, $kbom_id_equality_test$.getGlobalValue() ) );
      }
      finally
      {
        Storage.$current_area$.rebind( _prev_bind_0, thread );
      }
    }
    return did_setupP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 6770L)
  public static SubLObject compute_kbom_lru_size(final SubLObject kbom, final SubLObject given_size)
  {
    SubLObject size = Numbers.multiply( Numbers.integerDivide( given_size, $int67$100 ), kb_object_manager_lru_size_percentage( kbom ) );
    final SubLObject max_size = kb_object_manager_lru_size_max( kbom );
    if( NIL != max_size && size.numG( max_size ) )
    {
      size = max_size;
    }
    if( size.numL( $min_kb_object_lru_size$.getGlobalValue() ) )
    {
      size = $min_kb_object_lru_size$.getGlobalValue();
    }
    return size;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 7150L)
  public static SubLObject initialize_kb_object_hl_store_cache(final SubLObject kbom, final SubLObject content_filename, final SubLObject index_filename, SubLObject sub_content_filename, SubLObject sub_index_filename)
  {
    if( sub_content_filename == UNPROVIDED )
    {
      sub_content_filename = NIL;
    }
    if( sub_index_filename == UNPROVIDED )
    {
      sub_index_filename = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cdolist_list_var = ConsesLow.list( content_filename, index_filename, sub_content_filename, sub_index_filename );
    SubLObject filename = NIL;
    filename = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( filename.isString() && NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL != string_utilities.ends_with( content_filename, misc_utilities.$standard_hl_store_cache_file_extension$.getGlobalValue(),
          UNPROVIDED ) )
      {
        Errors.error( $str68$Got__s__expected_an_extensionless, filename );
      }
      cdolist_list_var = cdolist_list_var.rest();
      filename = cdolist_list_var.first();
    }
    final SubLObject mark_filename = dumper.get_wide_mark_basename_from_index_basename( index_filename );
    final SubLObject kb_object_cfasl_file = misc_utilities.get_hl_store_cache_filename( content_filename, UNPROVIDED );
    final SubLObject kb_object_index_file = misc_utilities.get_hl_store_cache_filename( index_filename, UNPROVIDED );
    final SubLObject kb_object_mark_file = misc_utilities.get_hl_store_cache_filename( mark_filename, UNPROVIDED );
    SubLObject result = NIL;
    final SubLObject lock = kb_object_manager_content_lock( kbom );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      if( NIL != Filesys.probe_file( kb_object_cfasl_file ) && NIL != Filesys.probe_file( kb_object_index_file ) )
      {
        final SubLObject old_file_vector = kbom_file_vector( kbom );
        if( NIL != file_vector.file_vector_p( old_file_vector ) )
        {
          file_vector.close_file_vector( old_file_vector );
        }
        final SubLObject v_file_vector = new_kb_object_content_file_vector( kb_object_cfasl_file, kb_object_index_file, kb_object_mark_file );
        _csetf_kbom_file_vector( kbom, v_file_vector );
        _csetf_kbom_id_threshold( kbom, file_vector.file_vector_length( v_file_vector ) );
        if( sub_index_filename.isString() )
        {
          final SubLObject sub_mark_filename = dumper.get_wide_mark_basename_from_index_basename( sub_index_filename );
          final SubLObject sub_kb_object_cfasl_file = misc_utilities.get_hl_store_cache_filename( sub_content_filename, UNPROVIDED );
          final SubLObject sub_kb_object_index_file = misc_utilities.get_hl_store_cache_filename( sub_index_filename, UNPROVIDED );
          final SubLObject sub_kb_object_mark_file = misc_utilities.get_hl_store_cache_filename( sub_mark_filename, UNPROVIDED );
          if( NIL != Filesys.probe_file( sub_kb_object_cfasl_file ) && NIL != Filesys.probe_file( sub_kb_object_index_file ) )
          {
            final SubLObject old_sub_fvector = kbom_sub_file_vector( kbom );
            if( NIL != file_vector.file_vector_p( old_sub_fvector ) )
            {
              file_vector.close_file_vector( old_sub_fvector );
            }
            final SubLObject sub_file_vector = new_kb_object_content_file_vector( sub_kb_object_cfasl_file, sub_kb_object_index_file, sub_kb_object_mark_file );
            set_kb_object_manager_sub_file_vector( kbom, sub_file_vector );
          }
        }
        result = kb_object_content_file_vector_p( v_file_vector );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 9781L)
  public static SubLObject resize_kbom_lru_cache_from_percentage_and_max(final SubLObject kbom, final SubLObject percentage, final SubLObject max)
  {
    _csetf_kbom_lru_size_percentage( kbom, percentage );
    _csetf_kbom_lru_size_max( kbom, max );
    final SubLObject old_size = id_index.id_index_sparse_id_threshold( kb_object_manager_content_table( kbom ) );
    final SubLObject new_size = compute_kbom_lru_size( kbom, old_size );
    return resize_kbom_lru_cache( kbom, new_size );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 10237L)
  public static SubLObject resize_kbom_lru_cache(final SubLObject kbom, final SubLObject new_size)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    safely_swap_out_all_pristine_kb_objects( kbom );
    final SubLObject old_cache = kbom_lru_information( kbom );
    SubLObject new_cache = NIL;
    final SubLObject _prev_bind_0 = Storage.$current_area$.currentBinding( thread );
    try
    {
      Storage.$current_area$.bind( Storage.get_static_area(), thread );
      new_cache = cache.new_preallocated_cache( new_size, $kbom_id_equality_test$.getGlobalValue() );
    }
    finally
    {
      Storage.$current_area$.rebind( _prev_bind_0, thread );
    }
    if( NIL == cache.cache_empty_p( old_cache ) )
    {
      final SubLObject cache_var = old_cache;
      final SubLObject order_var = $kw69$OLDEST;
      SubLObject entry = cache.do_cache_first( cache_var, order_var );
      SubLObject id = NIL;
      SubLObject value = NIL;
      while ( NIL == cache.do_cache_doneP( cache_var, entry ))
      {
        id = cache.do_cache_key( entry );
        value = cache.do_cache_value( entry );
        entry = cache.do_cache_next( entry, order_var );
        cache.cache_set( new_cache, id, id );
      }
    }
    _csetf_kbom_lru_information( kbom, new_cache );
    _csetf_kbom_lru_size_max( kbom, new_size );
    final SubLObject percentage = Numbers.divide( new_size, id_index.id_index_sparse_id_threshold( kb_object_manager_content_table( kbom ) ) );
    _csetf_kbom_lru_size_percentage( kbom, Numbers.round( Numbers.multiply( $int67$100, percentage ), UNPROVIDED ) );
    return kbom;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 11108L)
  public static SubLObject new_legacy_kb_object_manager(final SubLObject name, final SubLObject lru_size_percentage, final SubLObject lru_size_max, final SubLObject content_table, final SubLObject lru_information,
      final SubLObject usage_table, final SubLObject load_func)
  {
    final SubLObject kbom = make_kb_object_manager( UNPROVIDED );
    _csetf_kbom_name( kbom, name );
    _csetf_kbom_content_lock( kbom, Locks.make_lock( Sequences.cconcatenate( name, $str64$_content_manager_lock ) ) );
    _csetf_kbom_lru_size_percentage( kbom, lru_size_percentage );
    _csetf_kbom_lru_size_max( kbom, lru_size_max );
    _csetf_kbom_content_table( kbom, content_table );
    _csetf_kbom_lru_information( kbom, lru_information );
    _csetf_kbom_usage_table( kbom, usage_table );
    _csetf_kbom_file_vector( kbom, $kw65$UNINITIALIZED );
    _csetf_kbom_id_threshold( kbom, ZERO_INTEGER );
    _csetf_kbom_load_func( kbom, load_func );
    _csetf_kbom_meter_swap_timeP( kbom, NIL );
    _csetf_kbom_swap_time( kbom, NIL );
    return kbom;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 12035L)
  public static SubLObject optimize_kb_object_content_table(final SubLObject kbom, final SubLObject sparse_id_threshold)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != subl_promotions.non_negative_integer_p( sparse_id_threshold ) : sparse_id_threshold;
    final SubLObject new_size = Numbers.ceiling( Numbers.add( sparse_id_threshold, Numbers.multiply( sparse_id_threshold, $float71$0_05 ) ), UNPROVIDED );
    final SubLObject lock = kb_object_manager_content_lock( kbom );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      final SubLObject content_table = kb_object_manager_content_table( kbom );
      id_index.set_id_index_next_id( content_table, sparse_id_threshold );
      final SubLObject _prev_bind_0 = Storage.$current_area$.currentBinding( thread );
      try
      {
        Storage.$current_area$.bind( Storage.get_static_area(), thread );
        id_index.optimize_id_index( content_table, new_size );
      }
      finally
      {
        Storage.$current_area$.rebind( _prev_bind_0, thread );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    return new_size;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 12532L)
  public static SubLObject clear_kb_object_content_table(final SubLObject kbom)
  {
    SubLObject result = NIL;
    final SubLObject lock = kb_object_manager_content_lock( kbom );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      final SubLObject usage_table = kb_object_manager_usage_table( kbom );
      if( NIL != id_index.id_index_p( usage_table ) )
      {
        id_index.clear_id_index( usage_table );
      }
      final SubLObject lru_information = kb_object_manager_lru_information( kbom );
      if( NIL != cache.cache_p( lru_information ) )
      {
        cache.cache_clear( lru_information );
      }
      final SubLObject content_table = kb_object_manager_content_table( kbom );
      result = id_index.clear_id_index( content_table );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 13077L)
  public static SubLObject kb_object_manager_name(final SubLObject kbom)
  {
    assert NIL != kb_object_manager_p( kbom ) : kbom;
    return kbom_name( kbom );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 13202L)
  public static SubLObject kb_object_manager_content_lock(final SubLObject kbom)
  {
    assert NIL != kb_object_manager_p( kbom ) : kbom;
    return kbom_content_lock( kbom );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 13333L)
  public static SubLObject kb_object_manager_lru_size_percentage(final SubLObject kbom)
  {
    assert NIL != kb_object_manager_p( kbom ) : kbom;
    return kbom_lru_size_percentage( kbom );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 13476L)
  public static SubLObject kb_object_manager_lru_size_max(final SubLObject kbom)
  {
    assert NIL != kb_object_manager_p( kbom ) : kbom;
    return kbom_lru_size_max( kbom );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 13605L)
  public static SubLObject kb_object_manager_content_table(final SubLObject kbom)
  {
    assert NIL != kb_object_manager_p( kbom ) : kbom;
    return kbom_content_table( kbom );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 13736L)
  public static SubLObject kb_object_manager_usage_table(final SubLObject kbom)
  {
    assert NIL != kb_object_manager_p( kbom ) : kbom;
    return kbom_usage_table( kbom );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 13863L)
  public static SubLObject kb_object_manager_lru_information(final SubLObject kbom)
  {
    assert NIL != kb_object_manager_p( kbom ) : kbom;
    return kbom_lru_information( kbom );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 13998L)
  public static SubLObject kb_object_manager_file_vector(final SubLObject kbom)
  {
    assert NIL != kb_object_manager_p( kbom ) : kbom;
    return kbom_file_vector( kbom );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 14127L)
  public static SubLObject kb_object_manager_id_threshold(final SubLObject kbom)
  {
    assert NIL != kb_object_manager_p( kbom ) : kbom;
    return kbom_id_threshold( kbom );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 14256L)
  public static SubLObject kb_object_manager_load_func(final SubLObject kbom)
  {
    assert NIL != kb_object_manager_p( kbom ) : kbom;
    return kbom_load_func( kbom );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 14379L)
  public static SubLObject kb_object_manager_meter_swap_timeP(final SubLObject kbom)
  {
    assert NIL != kb_object_manager_p( kbom ) : kbom;
    return kbom_meter_swap_timeP( kbom );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 14516L)
  public static SubLObject kb_object_manager_swap_time(final SubLObject kbom)
  {
    assert NIL != kb_object_manager_p( kbom ) : kbom;
    return kbom_swap_time( kbom );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 14641L)
  public static SubLObject kb_object_manager_sub_file_vector(final SubLObject kbom)
  {
    assert NIL != kb_object_manager_p( kbom ) : kbom;
    return kbom_sub_file_vector( kbom );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 14778L)
  public static SubLObject set_kb_object_manager_sub_file_vector(final SubLObject kbom, final SubLObject fvector)
  {
    assert NIL != kb_object_manager_p( kbom ) : kbom;
    _csetf_kbom_sub_file_vector( kbom, fvector );
    return kbom;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 14962L)
  public static SubLObject kb_object_usage_counts_enabledP(final SubLObject kbom)
  {
    return id_index.id_index_p( kb_object_manager_usage_table( kbom ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 15093L)
  public static SubLObject cached_kb_object_count(final SubLObject kbom)
  {
    final SubLObject content_table = kb_object_manager_content_table( kbom );
    if( NIL == id_index.id_index_p( content_table ) )
    {
      return ZERO_INTEGER;
    }
    return id_index.id_index_count( content_table );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 15305L)
  public static SubLObject swappable_kb_object_count(final SubLObject kbom)
  {
    return cache.cache_size( kbom_lru_information( kbom ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 15494L)
  public static SubLObject kb_object_id_cachedP(final SubLObject kbom, final SubLObject id)
  {
    return misc_utilities.initialized_p( id_index.id_index_lookup( kb_object_manager_content_table( kbom ), id, misc_utilities.uninitialized() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 15645L)
  public static SubLObject kb_object_id_cachableP(final SubLObject kbom, final SubLObject id)
  {
    return makeBoolean( NIL != misc_utilities.initialized_p( id_index.id_index_lookup( kb_object_manager_content_table( kbom ), id, misc_utilities.uninitialized() ) ) || NIL != is_lru_cachable_kb_object_content_idP(
        kbom, id ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 15857L)
  public static SubLObject lookup_kb_object_content(final SubLObject kbom, final SubLObject id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject content = NIL;
    final SubLObject lock = kb_object_manager_content_lock( kbom );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      final SubLObject content_table = kb_object_manager_content_table( kbom );
      content = id_index.id_index_lookup( content_table, id, misc_utilities.uninitialized() );
      if( NIL != misc_utilities.uninitialized_p( content ) )
      {
        if( NIL != is_lru_cachable_kb_object_content_idP( kbom, id ) )
        {
          final SubLObject _prev_bind_0 = file_vector_utilities.$cfasl_outer_fvector_for_backed_maps$.currentBinding( thread );
          try
          {
            file_vector_utilities.$cfasl_outer_fvector_for_backed_maps$.bind( kb_object_manager_sub_file_vector( kbom ), thread );
            swap_in_kb_object_content( kbom, id );
            kb_storage_logging.maybe_kb_storage_log_load( id );
            content = id_index.id_index_lookup( content_table, id, UNPROVIDED );
          }
          finally
          {
            file_vector_utilities.$cfasl_outer_fvector_for_backed_maps$.rebind( _prev_bind_0, thread );
          }
        }
        else
        {
          content = NIL;
        }
      }
      else
      {
        update_kb_object_usage( kbom, id );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    return content;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 16619L)
  public static SubLObject kb_object_manager_unbuiltP(final SubLObject kbom)
  {
    assert NIL != kb_object_manager_p( kbom ) : kbom;
    SubLObject is_file_vectorP = NIL;
    final SubLObject lock = kb_object_manager_content_lock( kbom );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      is_file_vectorP = file_vector.file_vector_p( kb_object_manager_file_vector( kbom ) );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    if( NIL != is_file_vectorP )
    {
      return NIL;
    }
    final SubLObject v_id_index = kb_object_manager_content_table( kbom );
    if( NIL != id_index.id_index_p( v_id_index ) && id_index.id_index_count( v_id_index ).isPositive() )
    {
      return NIL;
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 17139L)
  public static SubLObject maintain_kb_object_usage_counts(final SubLObject kbom)
  {
    if( NIL == kb_object_usage_counts_enabledP( kbom ) )
    {
      final SubLObject lock = kb_object_manager_content_lock( kbom );
      SubLObject release = NIL;
      try
      {
        release = Locks.seize_lock( lock );
        setup_kb_object_content_support( kbom, T, UNPROVIDED );
      }
      finally
      {
        if( NIL != release )
        {
          Locks.release_lock( lock );
        }
      }
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 17417L)
  public static SubLObject dont_maintain_kb_object_usage_counts(final SubLObject kbom)
  {
    if( NIL != kb_object_usage_counts_enabledP( kbom ) )
    {
      final SubLObject lock = kb_object_manager_content_lock( kbom );
      SubLObject release = NIL;
      try
      {
        release = Locks.seize_lock( lock );
        _csetf_kbom_usage_table( kbom, NIL );
      }
      finally
      {
        if( NIL != release )
        {
          Locks.release_lock( lock );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 17682L)
  public static SubLObject register_kb_object_content(final SubLObject kbom, final SubLObject id, final SubLObject kb_object_content)
  {
    final SubLObject lock = kb_object_manager_content_lock( kbom );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      id_index.id_index_enter( kb_object_manager_content_table( kbom ), id, kb_object_content );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    return kb_object_content;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 17971L)
  public static SubLObject deregister_kb_object_content(final SubLObject kbom, final SubLObject id)
  {
    SubLObject deregistration = NIL;
    final SubLObject lock = kb_object_manager_content_lock( kbom );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      deregistration = id_index.id_index_remove( kb_object_manager_content_table( kbom ), id );
      drop_kb_object_usage( kbom, id );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    return deregistration;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 18311L)
  public static SubLObject new_kb_object_content_file_vector(final SubLObject cfasl_file, final SubLObject index_file, SubLObject mark_file)
  {
    if( mark_file == UNPROVIDED )
    {
      mark_file = NIL;
    }
    if( NIL == list_utilities.sublisp_boolean( mark_file ) )
    {
      return file_vector.new_file_vector( cfasl_file, index_file, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return file_vector.new_wide_input_file_vector( cfasl_file, index_file, mark_file, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 18689L)
  public static SubLObject kb_object_content_file_vector_cfasl_stream(final SubLObject v_file_vector)
  {
    return file_vector.get_file_vector_data_stream( v_file_vector );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 18814L)
  public static SubLObject kb_object_content_file_vector_p(final SubLObject v_object)
  {
    return file_vector.file_vector_p( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 18904L)
  public static SubLObject kb_object_content_file_vector_lookup(final SubLObject kbom, final SubLObject id)
  {
    final SubLObject cfasl_stream = file_vector.position_file_vector( kb_object_manager_file_vector( kbom ), id );
    final SubLObject kb_object_id = cfasl.cfasl_input( cfasl_stream, UNPROVIDED, UNPROVIDED );
    if( !kb_object_id.eql( id ) )
    {
      final SubLObject index_spot = streams_high.file_position( file_vector.get_file_vector_index_stream( kb_object_manager_file_vector( kbom ) ), UNPROVIDED );
      if( NIL != subl_promotions.non_negative_integer_p( kb_object_id ) )
      {
        Errors.error( $str72$Failed_to_swap_in_KB_object__A_ba, new SubLObject[] { id, cfasl_stream, kb_object_id, index_spot
        } );
      }
      else
      {
        Errors.error( $str73$We_expected_KB_object_ID__A_from_, new SubLObject[] { id, cfasl_stream, kb_object_id, Types.type_of( kb_object_id ), index_spot
        } );
      }
    }
    final SubLObject load_func = kb_object_manager_load_func( kbom );
    Functions.funcall( load_func, id, cfasl_stream );
    return id;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 20016L)
  public static SubLObject wide_kb_object_managerP(final SubLObject kbom)
  {
    return file_vector.wide_file_vectorP( kb_object_manager_file_vector( kbom ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 20132L)
  public static SubLObject wide_kb_object_sub_managerP(final SubLObject kbom)
  {
    final SubLObject sub_fvector = kb_object_manager_sub_file_vector( kbom );
    return makeBoolean( NIL != file_vector.file_vector_p( sub_fvector ) && NIL != file_vector.wide_file_vectorP( sub_fvector ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 20345L)
  public static SubLObject serialize_kbom_lru_information(final SubLObject kbom, final SubLObject directory)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject filename = kbom_lru_info_filename( kbom, directory );
    final SubLObject lru_information = kb_object_manager_lru_information( kbom );
    SubLObject stream = NIL;
    try
    {
      final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
      try
      {
        stream_macros.$stream_requires_locking$.bind( NIL, thread );
        stream = compatibility.open_binary( filename, $kw75$OUTPUT );
      }
      finally
      {
        stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
      }
      if( !stream.isStream() )
      {
        Errors.error( $str76$Unable_to_open__S, filename );
      }
      final SubLObject s = stream;
      if( NIL != cache.cache_p( lru_information ) )
      {
        cfasl.cfasl_output( cache.cache_keys( lru_information ), s );
      }
    }
    finally
    {
      final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        if( stream.isStream() )
        {
          streams_high.close( stream, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
      }
    }
    return filename;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 20940L)
  public static SubLObject precache_kbom_by_lru_information(final SubLObject kbom, final SubLObject directory)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject filename = kbom_lru_info_filename( kbom, directory );
    final SubLObject lru_information = kb_object_manager_lru_information( kbom );
    if( NIL != cache.cache_p( lru_information ) )
    {
      SubLObject stream = NIL;
      try
      {
        final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream = compatibility.open_binary( filename, $kw78$INPUT );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
        }
        if( !stream.isStream() )
        {
          Errors.error( $str76$Unable_to_open__S, filename );
        }
        final SubLObject s = stream;
        final SubLObject lru_ordered_ids = cfasl.cfasl_input( s, UNPROVIDED, UNPROVIDED );
        SubLObject cdolist_list_var;
        final SubLObject page_ordered_ids = cdolist_list_var = Sort.sort( conses_high.copy_list( lru_ordered_ids ), Symbols.symbol_function( $sym79$_ ), UNPROVIDED );
        SubLObject id = NIL;
        id = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          lookup_kb_object_content( kbom, id );
          cdolist_list_var = cdolist_list_var.rest();
          id = cdolist_list_var.first();
        }
        cdolist_list_var = Sequences.nreverse( lru_ordered_ids );
        id = NIL;
        id = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          update_kb_object_usage( kbom, id );
          cdolist_list_var = cdolist_list_var.rest();
          id = cdolist_list_var.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    return filename;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 21855L)
  public static SubLObject kbom_lru_info_filename(final SubLObject kbom, final SubLObject directory)
  {
    return Sequences.cconcatenate( directory, new SubLObject[] { kbom_name( kbom ), $str80$_lru_info_for_, operation_communication.kb_loaded_string(), $str81$_cfasl
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 22009L)
  public static SubLObject is_lru_cachable_kb_object_content_idP(final SubLObject kbom, final SubLObject id)
  {
    return Numbers.numL( id, kb_object_manager_id_threshold( kbom ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 22129L)
  public static SubLObject update_kb_object_usage(final SubLObject kbom, final SubLObject id)
  {
    if( NIL != kb_object_usage_counts_enabledP( kbom ) )
    {
      increment_kb_object_usage_count( kbom, id );
    }
    final SubLObject lru_information = kb_object_manager_lru_information( kbom );
    if( NIL != cache.cache_p( lru_information ) && NIL != is_lru_cachable_kb_object_content_idP( kbom, id ) )
    {
      cache.cache_get_without_values( lru_information, id, UNPROVIDED );
    }
    return id;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 22532L)
  public static SubLObject drop_kb_object_usage(final SubLObject kbom, final SubLObject id)
  {
    final SubLObject lru_information = kb_object_manager_lru_information( kbom );
    if( NIL != cache.cache_p( lru_information ) && NIL != is_lru_cachable_kb_object_content_idP( kbom, id ) )
    {
      cache.cache_remove( lru_information, id );
    }
    return id;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 22968L)
  public static SubLObject mark_kb_object_content_as_muted(final SubLObject kbom, final SubLObject id)
  {
    final SubLObject lock = kb_object_manager_content_lock( kbom );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      final SubLObject lru_information = kb_object_manager_lru_information( kbom );
      if( NIL != cache.cache_p( lru_information ) && NIL != is_lru_cachable_kb_object_content_idP( kbom, id ) )
      {
        kb_storage_logging.maybe_kb_storage_log_mutate( id );
        cache.cache_remove( lru_information, id );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    return id;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 23413L)
  public static SubLObject meter_kb_object_content_swap_time(final SubLObject kbom)
  {
    _csetf_kbom_meter_swap_timeP( kbom, T );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 23578L)
  public static SubLObject dont_meter_kb_object_content_swap_time(final SubLObject kbom)
  {
    _csetf_kbom_meter_swap_timeP( kbom, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 23753L)
  public static SubLObject clear_kb_object_content_swap_time(final SubLObject kbom)
  {
    _csetf_kbom_swap_time( kbom, ZERO_INTEGER );
    return ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 23858L)
  public static SubLObject get_file_backed_kb_object_id_threshold(final SubLObject kbom)
  {
    return kb_object_manager_id_threshold( kbom );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 24075L)
  public static SubLObject swap_in_kb_object_content(final SubLObject kbom, final SubLObject id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = api_control_vars.$cfasl_constant_handle_lookup_func$.currentBinding( thread );
    final SubLObject _prev_bind_2 = api_control_vars.$cfasl_nart_handle_lookup_func$.currentBinding( thread );
    final SubLObject _prev_bind_3 = api_control_vars.$cfasl_assertion_handle_lookup_func$.currentBinding( thread );
    final SubLObject _prev_bind_4 = api_control_vars.$cfasl_deduction_handle_lookup_func$.currentBinding( thread );
    final SubLObject _prev_bind_5 = api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.currentBinding( thread );
    final SubLObject _prev_bind_6 = api_control_vars.$cfasl_clause_struc_handle_lookup_func$.currentBinding( thread );
    try
    {
      api_control_vars.$cfasl_constant_handle_lookup_func$.bind( NIL, thread );
      api_control_vars.$cfasl_nart_handle_lookup_func$.bind( NIL, thread );
      api_control_vars.$cfasl_assertion_handle_lookup_func$.bind( NIL, thread );
      api_control_vars.$cfasl_deduction_handle_lookup_func$.bind( NIL, thread );
      api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.bind( NIL, thread );
      api_control_vars.$cfasl_clause_struc_handle_lookup_func$.bind( NIL, thread );
      if( NIL != kb_object_manager_meter_swap_timeP( kbom ) )
      {
        swap_in_kb_object_content_metered( kbom, id );
      }
      else
      {
        swap_in_kb_object_content_internal( kbom, id );
      }
    }
    finally
    {
      api_control_vars.$cfasl_clause_struc_handle_lookup_func$.rebind( _prev_bind_6, thread );
      api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.rebind( _prev_bind_5, thread );
      api_control_vars.$cfasl_deduction_handle_lookup_func$.rebind( _prev_bind_4, thread );
      api_control_vars.$cfasl_assertion_handle_lookup_func$.rebind( _prev_bind_3, thread );
      api_control_vars.$cfasl_nart_handle_lookup_func$.rebind( _prev_bind_2, thread );
      api_control_vars.$cfasl_constant_handle_lookup_func$.rebind( _prev_bind_0, thread );
    }
    return id;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 24759L)
  public static SubLObject swap_in_kb_object_content_metered(final SubLObject kbom, final SubLObject id)
  {
    SubLObject time = NIL;
    final SubLObject time_var = Time.get_internal_real_time();
    swap_in_kb_object_content_internal( kbom, id );
    time = Numbers.divide( Numbers.subtract( Time.get_internal_real_time(), time_var ), time_high.$internal_time_units_per_second$.getGlobalValue() );
    _csetf_kbom_swap_time( kbom, Numbers.add( kbom_swap_time( kbom ), time ) );
    return id;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 24954L)
  public static SubLObject swap_in_kb_object_content_internal(final SubLObject kbom, final SubLObject id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = cfasl.$cfasl_common_symbols$.currentBinding( thread );
    try
    {
      cfasl.$cfasl_common_symbols$.bind( NIL, thread );
      cfasl.cfasl_set_common_symbols_simple( misc_utilities.get_hl_store_caches_shared_symbols_simple() );
      kb_object_content_file_vector_lookup( kbom, id );
    }
    finally
    {
      cfasl.$cfasl_common_symbols$.rebind( _prev_bind_0, thread );
    }
    increment_kb_object_usage_count( kbom, id );
    thread.resetMultipleValues();
    final SubLObject loser = cache.cache_set_return_dropped( kb_object_manager_lru_information( kbom ), id, id );
    final SubLObject oldest_value = thread.secondMultipleValue();
    final SubLObject pairP = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( loser.isFixnum() )
    {
      swap_out_pristine_kb_object_content( kbom, loser );
    }
    return id;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 25551L)
  public static SubLObject swap_out_pristine_kb_object_content(final SubLObject kbom, final SubLObject loser)
  {
    id_index.id_index_remove( kb_object_manager_content_table( kbom ), loser );
    kb_storage_logging.maybe_kb_storage_log_page_out( loser );
    return loser;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 25771L)
  public static SubLObject safely_swap_out_all_pristine_kb_objects(final SubLObject kbom)
  {
    SubLObject paged_out = NIL;
    final SubLObject lock = kb_object_manager_content_lock( kbom );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      paged_out = swap_out_all_pristine_kb_objects_int( kbom );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    return paged_out;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 25994L)
  public static SubLObject swap_out_all_pristine_kb_objects_int(final SubLObject kbom)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject pristine_ids = NIL;
    final SubLObject cache_var;
    final SubLObject lru_information = cache_var = kb_object_manager_lru_information( kbom );
    final SubLObject order_var = $kw82$NEWEST;
    SubLObject entry = cache.do_cache_first( cache_var, order_var );
    SubLObject id = NIL;
    SubLObject value = NIL;
    while ( NIL == cache.do_cache_doneP( cache_var, entry ))
    {
      id = cache.do_cache_key( entry );
      value = cache.do_cache_value( entry );
      entry = cache.do_cache_next( entry, order_var );
      pristine_ids = ConsesLow.cons( id, pristine_ids );
    }
    final SubLObject list_var;
    pristine_ids = ( list_var = Sort.sort( pristine_ids, Symbols.symbol_function( $sym79$_ ), UNPROVIDED ) );
    final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
    final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$progress_note$.bind( ( NIL != Sequences.cconcatenate( $str83$Swapping_out_, new SubLObject[] { kb_object_manager_name( kbom ), $str84$_objects
      } ) ) ? Sequences.cconcatenate( $str83$Swapping_out_, new SubLObject[] { kb_object_manager_name( kbom ), $str84$_objects
      } ) : $str85$cdolist, thread );
      utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
      utilities_macros.$progress_total$.bind( Sequences.length( list_var ), thread );
      utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
        SubLObject csome_list_var = list_var;
        SubLObject id2 = NIL;
        id2 = csome_list_var.first();
        while ( NIL != csome_list_var)
        {
          cache.cache_remove( lru_information, id2 );
          swap_out_pristine_kb_object_content( kbom, id2 );
          final SubLObject valueSF = Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER );
          utilities_macros.$progress_sofar$.setDynamicValue( valueSF, thread );
          utilities_macros.note_percent_progress( valueSF, utilities_macros.$progress_total$.getDynamicValue( thread ) );
          csome_list_var = csome_list_var.rest();
          id2 = csome_list_var.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$1 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$1, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
      utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
      utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
      utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
      utilities_macros.$progress_note$.rebind( _prev_bind_0, thread );
    }
    return Sequences.length( pristine_ids );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 26522L)
  public static SubLObject increment_kb_object_usage_count(final SubLObject kbom, final SubLObject id)
  {
    if( NIL != kb_object_usage_counts_enabledP( kbom ) )
    {
      final SubLObject usage_table = kb_object_manager_usage_table( kbom );
      final SubLObject old_counter = id_index.id_index_lookup( usage_table, id, UNPROVIDED );
      final SubLObject new_counter = ( NIL != old_counter ) ? number_utilities.f_1X( old_counter ) : ONE_INTEGER;
      id_index.id_index_enter( usage_table, id, new_counter );
      return id;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 26935L)
  public static SubLObject new_muted_kb_object_iterator(final SubLObject kbom)
  {
    return iteration.new_filter_iterator( id_index.new_id_index_dense_objects_iterator( kb_object_manager_content_table( kbom ) ), $sym86$IS_MUTED_KB_OBJECT_, ConsesLow.list( kbom ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 27296L)
  public static SubLObject is_muted_kb_objectP(final SubLObject tuple, final SubLObject kbom)
  {
    SubLObject id = NIL;
    SubLObject payload = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( tuple, tuple, $list87 );
    id = tuple.first();
    SubLObject current = tuple.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, tuple, $list87 );
    payload = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return makeBoolean( NIL != is_lru_cachable_kb_object_content_idP( kbom, id ) && NIL == cache.cache_contains_key_p( kb_object_manager_lru_information( kbom ), id ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( tuple, $list87 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 27684L)
  public static SubLObject verify_kb_object_content_table_int(final SubLObject kbom, final SubLObject type_pred, SubLObject repairP)
  {
    if( repairP == UNPROVIDED )
    {
      repairP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject invalid_count = ZERO_INTEGER;
    final SubLObject progress_message = Sequences.cconcatenate( $str88$Verifying_integrity_of_, new SubLObject[] { kb_object_manager_name( kbom ), $str89$_content_table
    } );
    final SubLObject idx = kb_object_manager_content_table( kbom );
    final SubLObject mess = progress_message;
    final SubLObject total = id_index.id_index_count( idx );
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
        final SubLObject idx_$2 = idx;
        if( NIL == id_index.id_index_objects_empty_p( idx_$2, $kw90$SKIP ) )
        {
          final SubLObject idx_$3 = idx_$2;
          if( NIL == id_index.id_index_dense_objects_empty_p( idx_$3, $kw90$SKIP ) )
          {
            final SubLObject vector_var = id_index.id_index_dense_objects( idx_$3 );
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject id;
            SubLObject content;
            for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
            {
              id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
              content = Vectors.aref( vector_var, id );
              if( NIL == id_index.id_index_tombstone_p( content ) || NIL == id_index.id_index_skip_tombstones_p( $kw90$SKIP ) )
              {
                if( NIL != id_index.id_index_tombstone_p( content ) )
                {
                  content = $kw90$SKIP;
                }
                if( NIL != content && NIL == Functions.funcall( type_pred, content ) )
                {
                  invalid_count = Numbers.add( invalid_count, ONE_INTEGER );
                  if( NIL != repairP )
                  {
                    Errors.warn( $str91$Entry__a_is_invalid___a__repairin, id, content );
                    swap_out_pristine_kb_object_content( kbom, id );
                  }
                  else
                  {
                    Errors.warn( $str92$Entry__a_is_invalid___a, id, content );
                  }
                }
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
            }
          }
          final SubLObject idx_$4 = idx_$2;
          if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$4 ) )
          {
            final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$4 );
            SubLObject id2 = NIL;
            SubLObject content2 = NIL;
            final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
            try
            {
              while ( Hashtables.iteratorHasNext( cdohash_iterator ))
              {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
                id2 = Hashtables.getEntryKey( cdohash_entry );
                content2 = Hashtables.getEntryValue( cdohash_entry );
                if( NIL != content2 && NIL == Functions.funcall( type_pred, content2 ) )
                {
                  invalid_count = Numbers.add( invalid_count, ONE_INTEGER );
                  if( NIL != repairP )
                  {
                    Errors.warn( $str91$Entry__a_is_invalid___a__repairin, id2, content2 );
                    swap_out_pristine_kb_object_content( kbom, id2 );
                  }
                  else
                  {
                    Errors.warn( $str92$Entry__a_is_invalid___a, id2, content2 );
                  }
                }
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
        final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$5, thread );
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
    return Values.values( Numbers.numE( invalid_count, ZERO_INTEGER ), invalid_count );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 28736L)
  public static SubLObject with_kbom_fully_loaded(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject kbom = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    kbom = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject manager = $sym93$MANAGER;
      final SubLObject maintaining_countsP = $sym94$MAINTAINING_COUNTS_;
      final SubLObject memory_mappedP = $sym95$MEMORY_MAPPED_;
      return ConsesLow.list( $sym96$CLET, ConsesLow.list( ConsesLow.list( manager, kbom ), ConsesLow.list( maintaining_countsP, ConsesLow.list( $sym97$KB_OBJECT_USAGE_COUNTS_ENABLED_, manager ) ), ConsesLow.list(
          memory_mappedP, ConsesLow.list( $sym98$KB_OBJECT_MANAGER_MEMORY_MAPPED_, manager ) ) ), ConsesLow.list( $sym99$CUNWIND_PROTECT, ConsesLow.listS( $sym100$PROGN, ConsesLow.list(
              $sym101$DONT_MAINTAIN_KB_OBJECT_USAGE_COUNTS, manager ), ConsesLow.list( $sym102$KB_OBJECT_MANAGER_ENABLE_MEMORY_MAPPING, manager ), ConsesLow.append( body, NIL ) ), ConsesLow.list( $sym100$PROGN, ConsesLow
                  .list( $sym103$PWHEN, maintaining_countsP, ConsesLow.list( $sym104$MAINTAIN_KB_OBJECT_USAGE_COUNTS, manager ) ), ConsesLow.list( $sym103$PWHEN, ConsesLow.list( $sym105$CNOT, memory_mappedP ), ConsesLow
                      .listS( $sym106$KB_OBJECT_MANAGER_CHANGE_STREAM_BUFFER_SIZES, manager, $list107 ) ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 29601L)
  public static SubLObject segment_kb_object_manager_data(final SubLObject kbom, SubLObject stream, SubLObject include_idP)
  {
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    if( include_idP == UNPROVIDED )
    {
      include_idP = NIL;
    }
    final SubLObject fvector = kbom_file_vector( kbom );
    file_vector_utilities.segment_file_vector_data_stream( fvector, stream, include_idP );
    return kbom;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 30143L)
  public static SubLObject inspect_kb_object_manager_data(final SubLObject kbom, final SubLObject id)
  {
    final SubLObject fvector = kbom_file_vector( kbom );
    return file_vector_utilities.inspect_file_vector_data_record( fvector, id );
  }

  public static SubLObject declare_kb_object_manager_file()
  {
    SubLFiles.declareMacro(me, "with_kb_object_manager_lock_held", "WITH-KB-OBJECT-MANAGER-LOCK-HELD" );
    SubLFiles.declareFunction(me, "kb_object_manager_print_function_trampoline", "KB-OBJECT-MANAGER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction(me, "kb_object_manager_p", "KB-OBJECT-MANAGER-P", 1, 0, false );
    new $kb_object_manager_p$UnaryFunction();
    SubLFiles.declareFunction(me, "kbom_name", "KBOM-NAME", 1, 0, false );
    SubLFiles.declareFunction(me, "kbom_content_lock", "KBOM-CONTENT-LOCK", 1, 0, false );
    SubLFiles.declareFunction(me, "kbom_lru_size_percentage", "KBOM-LRU-SIZE-PERCENTAGE", 1, 0, false );
    SubLFiles.declareFunction(me, "kbom_content_table", "KBOM-CONTENT-TABLE", 1, 0, false );
    SubLFiles.declareFunction(me, "kbom_usage_table", "KBOM-USAGE-TABLE", 1, 0, false );
    SubLFiles.declareFunction(me, "kbom_lru_information", "KBOM-LRU-INFORMATION", 1, 0, false );
    SubLFiles.declareFunction(me, "kbom_file_vector", "KBOM-FILE-VECTOR", 1, 0, false );
    SubLFiles.declareFunction(me, "kbom_id_threshold", "KBOM-ID-THRESHOLD", 1, 0, false );
    SubLFiles.declareFunction(me, "kbom_load_func", "KBOM-LOAD-FUNC", 1, 0, false );
    SubLFiles.declareFunction(me, "kbom_meter_swap_timeP", "KBOM-METER-SWAP-TIME?", 1, 0, false );
    SubLFiles.declareFunction(me, "kbom_swap_time", "KBOM-SWAP-TIME", 1, 0, false );
    SubLFiles.declareFunction(me, "kbom_lru_size_max", "KBOM-LRU-SIZE-MAX", 1, 0, false );
    SubLFiles.declareFunction(me, "kbom_sub_file_vector", "KBOM-SUB-FILE-VECTOR", 1, 0, false );
    SubLFiles.declareFunction(me, "kbom_dummy3", "KBOM-DUMMY3", 1, 0, false );
    SubLFiles.declareFunction(me, "_csetf_kbom_name", "_CSETF-KBOM-NAME", 2, 0, false );
    SubLFiles.declareFunction(me, "_csetf_kbom_content_lock", "_CSETF-KBOM-CONTENT-LOCK", 2, 0, false );
    SubLFiles.declareFunction(me, "_csetf_kbom_lru_size_percentage", "_CSETF-KBOM-LRU-SIZE-PERCENTAGE", 2, 0, false );
    SubLFiles.declareFunction(me, "_csetf_kbom_content_table", "_CSETF-KBOM-CONTENT-TABLE", 2, 0, false );
    SubLFiles.declareFunction(me, "_csetf_kbom_usage_table", "_CSETF-KBOM-USAGE-TABLE", 2, 0, false );
    SubLFiles.declareFunction(me, "_csetf_kbom_lru_information", "_CSETF-KBOM-LRU-INFORMATION", 2, 0, false );
    SubLFiles.declareFunction(me, "_csetf_kbom_file_vector", "_CSETF-KBOM-FILE-VECTOR", 2, 0, false );
    SubLFiles.declareFunction(me, "_csetf_kbom_id_threshold", "_CSETF-KBOM-ID-THRESHOLD", 2, 0, false );
    SubLFiles.declareFunction(me, "_csetf_kbom_load_func", "_CSETF-KBOM-LOAD-FUNC", 2, 0, false );
    SubLFiles.declareFunction(me, "_csetf_kbom_meter_swap_timeP", "_CSETF-KBOM-METER-SWAP-TIME?", 2, 0, false );
    SubLFiles.declareFunction(me, "_csetf_kbom_swap_time", "_CSETF-KBOM-SWAP-TIME", 2, 0, false );
    SubLFiles.declareFunction(me, "_csetf_kbom_lru_size_max", "_CSETF-KBOM-LRU-SIZE-MAX", 2, 0, false );
    SubLFiles.declareFunction(me, "_csetf_kbom_sub_file_vector", "_CSETF-KBOM-SUB-FILE-VECTOR", 2, 0, false );
    SubLFiles.declareFunction(me, "_csetf_kbom_dummy3", "_CSETF-KBOM-DUMMY3", 2, 0, false );
    SubLFiles.declareFunction(me, "make_kb_object_manager", "MAKE-KB-OBJECT-MANAGER", 0, 1, false );
    SubLFiles.declareFunction(me, "visit_defstruct_kb_object_manager", "VISIT-DEFSTRUCT-KB-OBJECT-MANAGER", 2, 0, false );
    SubLFiles.declareFunction(me, "visit_defstruct_object_kb_object_manager_method", "VISIT-DEFSTRUCT-OBJECT-KB-OBJECT-MANAGER-METHOD", 2, 0, false );
    SubLFiles.declareFunction(me, "new_kb_object_manager", "NEW-KB-OBJECT-MANAGER", 6, 0, false );
    SubLFiles.declareFunction(me, "kb_object_manager_change_stream_buffer_sizes", "KB-OBJECT-MANAGER-CHANGE-STREAM-BUFFER-SIZES", 3, 0, false );
    SubLFiles.declareFunction(me, "kb_object_manager_enable_memory_mapping", "KB-OBJECT-MANAGER-ENABLE-MEMORY-MAPPING", 1, 0, false );
    SubLFiles.declareFunction(me, "kb_object_manager_memory_mappedP", "KB-OBJECT-MANAGER-MEMORY-MAPPED?", 1, 0, false );
    SubLFiles.declareFunction(me, "setup_kb_object_content_table", "SETUP-KB-OBJECT-CONTENT-TABLE", 3, 0, false );
    SubLFiles.declareFunction(me, "setup_kb_object_content_support", "SETUP-KB-OBJECT-CONTENT-SUPPORT", 1, 2, false );
    SubLFiles.declareFunction(me, "compute_kbom_lru_size", "COMPUTE-KBOM-LRU-SIZE", 2, 0, false );
    SubLFiles.declareFunction(me, "initialize_kb_object_hl_store_cache", "INITIALIZE-KB-OBJECT-HL-STORE-CACHE", 3, 2, false );
    SubLFiles.declareFunction(me, "resize_kbom_lru_cache_from_percentage_and_max", "RESIZE-KBOM-LRU-CACHE-FROM-PERCENTAGE-AND-MAX", 3, 0, false );
    SubLFiles.declareFunction(me, "resize_kbom_lru_cache", "RESIZE-KBOM-LRU-CACHE", 2, 0, false );
    SubLFiles.declareFunction(me, "new_legacy_kb_object_manager", "NEW-LEGACY-KB-OBJECT-MANAGER", 7, 0, false );
    SubLFiles.declareFunction(me, "optimize_kb_object_content_table", "OPTIMIZE-KB-OBJECT-CONTENT-TABLE", 2, 0, false );
    SubLFiles.declareFunction(me, "clear_kb_object_content_table", "CLEAR-KB-OBJECT-CONTENT-TABLE", 1, 0, false );
    SubLFiles.declareFunction(me, "kb_object_manager_name", "KB-OBJECT-MANAGER-NAME", 1, 0, false );
    SubLFiles.declareFunction(me, "kb_object_manager_content_lock", "KB-OBJECT-MANAGER-CONTENT-LOCK", 1, 0, false );
    SubLFiles.declareFunction(me, "kb_object_manager_lru_size_percentage", "KB-OBJECT-MANAGER-LRU-SIZE-PERCENTAGE", 1, 0, false );
    SubLFiles.declareFunction(me, "kb_object_manager_lru_size_max", "KB-OBJECT-MANAGER-LRU-SIZE-MAX", 1, 0, false );
    SubLFiles.declareFunction(me, "kb_object_manager_content_table", "KB-OBJECT-MANAGER-CONTENT-TABLE", 1, 0, false );
    SubLFiles.declareFunction(me, "kb_object_manager_usage_table", "KB-OBJECT-MANAGER-USAGE-TABLE", 1, 0, false );
    SubLFiles.declareFunction(me, "kb_object_manager_lru_information", "KB-OBJECT-MANAGER-LRU-INFORMATION", 1, 0, false );
    SubLFiles.declareFunction(me, "kb_object_manager_file_vector", "KB-OBJECT-MANAGER-FILE-VECTOR", 1, 0, false );
    SubLFiles.declareFunction(me, "kb_object_manager_id_threshold", "KB-OBJECT-MANAGER-ID-THRESHOLD", 1, 0, false );
    SubLFiles.declareFunction(me, "kb_object_manager_load_func", "KB-OBJECT-MANAGER-LOAD-FUNC", 1, 0, false );
    SubLFiles.declareFunction(me, "kb_object_manager_meter_swap_timeP", "KB-OBJECT-MANAGER-METER-SWAP-TIME?", 1, 0, false );
    SubLFiles.declareFunction(me, "kb_object_manager_swap_time", "KB-OBJECT-MANAGER-SWAP-TIME", 1, 0, false );
    SubLFiles.declareFunction(me, "kb_object_manager_sub_file_vector", "KB-OBJECT-MANAGER-SUB-FILE-VECTOR", 1, 0, false );
    SubLFiles.declareFunction(me, "set_kb_object_manager_sub_file_vector", "SET-KB-OBJECT-MANAGER-SUB-FILE-VECTOR", 2, 0, false );
    SubLFiles.declareFunction(me, "kb_object_usage_counts_enabledP", "KB-OBJECT-USAGE-COUNTS-ENABLED?", 1, 0, false );
    SubLFiles.declareFunction(me, "cached_kb_object_count", "CACHED-KB-OBJECT-COUNT", 1, 0, false );
    SubLFiles.declareFunction(me, "swappable_kb_object_count", "SWAPPABLE-KB-OBJECT-COUNT", 1, 0, false );
    SubLFiles.declareFunction(me, "kb_object_id_cachedP", "KB-OBJECT-ID-CACHED?", 2, 0, false );
    SubLFiles.declareFunction(me, "kb_object_id_cachableP", "KB-OBJECT-ID-CACHABLE?", 2, 0, false );
    SubLFiles.declareFunction(me, "lookup_kb_object_content", "LOOKUP-KB-OBJECT-CONTENT", 2, 0, false );
    SubLFiles.declareFunction(me, "kb_object_manager_unbuiltP", "KB-OBJECT-MANAGER-UNBUILT?", 1, 0, false );
    SubLFiles.declareFunction(me, "maintain_kb_object_usage_counts", "MAINTAIN-KB-OBJECT-USAGE-COUNTS", 1, 0, false );
    SubLFiles.declareFunction(me, "dont_maintain_kb_object_usage_counts", "DONT-MAINTAIN-KB-OBJECT-USAGE-COUNTS", 1, 0, false );
    SubLFiles.declareFunction(me, "register_kb_object_content", "REGISTER-KB-OBJECT-CONTENT", 3, 0, false );
    SubLFiles.declareFunction(me, "deregister_kb_object_content", "DEREGISTER-KB-OBJECT-CONTENT", 2, 0, false );
    SubLFiles.declareFunction(me, "new_kb_object_content_file_vector", "NEW-KB-OBJECT-CONTENT-FILE-VECTOR", 2, 1, false );
    SubLFiles.declareFunction(me, "kb_object_content_file_vector_cfasl_stream", "KB-OBJECT-CONTENT-FILE-VECTOR-CFASL-STREAM", 1, 0, false );
    SubLFiles.declareFunction(me, "kb_object_content_file_vector_p", "KB-OBJECT-CONTENT-FILE-VECTOR-P", 1, 0, false );
    SubLFiles.declareFunction(me, "kb_object_content_file_vector_lookup", "KB-OBJECT-CONTENT-FILE-VECTOR-LOOKUP", 2, 0, false );
    SubLFiles.declareFunction(me, "wide_kb_object_managerP", "WIDE-KB-OBJECT-MANAGER?", 1, 0, false );
    SubLFiles.declareFunction(me, "wide_kb_object_sub_managerP", "WIDE-KB-OBJECT-SUB-MANAGER?", 1, 0, false );
    SubLFiles.declareFunction(me, "serialize_kbom_lru_information", "SERIALIZE-KBOM-LRU-INFORMATION", 2, 0, false );
    SubLFiles.declareFunction(me, "precache_kbom_by_lru_information", "PRECACHE-KBOM-BY-LRU-INFORMATION", 2, 0, false );
    SubLFiles.declareFunction(me, "kbom_lru_info_filename", "KBOM-LRU-INFO-FILENAME", 2, 0, false );
    SubLFiles.declareFunction(me, "is_lru_cachable_kb_object_content_idP", "IS-LRU-CACHABLE-KB-OBJECT-CONTENT-ID?", 2, 0, false );
    SubLFiles.declareFunction(me, "update_kb_object_usage", "UPDATE-KB-OBJECT-USAGE", 2, 0, false );
    SubLFiles.declareFunction(me, "drop_kb_object_usage", "DROP-KB-OBJECT-USAGE", 2, 0, false );
    SubLFiles.declareFunction(me, "mark_kb_object_content_as_muted", "MARK-KB-OBJECT-CONTENT-AS-MUTED", 2, 0, false );
    SubLFiles.declareFunction(me, "meter_kb_object_content_swap_time", "METER-KB-OBJECT-CONTENT-SWAP-TIME", 1, 0, false );
    SubLFiles.declareFunction(me, "dont_meter_kb_object_content_swap_time", "DONT-METER-KB-OBJECT-CONTENT-SWAP-TIME", 1, 0, false );
    SubLFiles.declareFunction(me, "clear_kb_object_content_swap_time", "CLEAR-KB-OBJECT-CONTENT-SWAP-TIME", 1, 0, false );
    SubLFiles.declareFunction(me, "get_file_backed_kb_object_id_threshold", "GET-FILE-BACKED-KB-OBJECT-ID-THRESHOLD", 1, 0, false );
    SubLFiles.declareFunction(me, "swap_in_kb_object_content", "SWAP-IN-KB-OBJECT-CONTENT", 2, 0, false );
    SubLFiles.declareFunction(me, "swap_in_kb_object_content_metered", "SWAP-IN-KB-OBJECT-CONTENT-METERED", 2, 0, false );
    SubLFiles.declareFunction(me, "swap_in_kb_object_content_internal", "SWAP-IN-KB-OBJECT-CONTENT-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction(me, "swap_out_pristine_kb_object_content", "SWAP-OUT-PRISTINE-KB-OBJECT-CONTENT", 2, 0, false );
    SubLFiles.declareFunction(me, "safely_swap_out_all_pristine_kb_objects", "SAFELY-SWAP-OUT-ALL-PRISTINE-KB-OBJECTS", 1, 0, false );
    SubLFiles.declareFunction(me, "swap_out_all_pristine_kb_objects_int", "SWAP-OUT-ALL-PRISTINE-KB-OBJECTS-INT", 1, 0, false );
    SubLFiles.declareFunction(me, "increment_kb_object_usage_count", "INCREMENT-KB-OBJECT-USAGE-COUNT", 2, 0, false );
    SubLFiles.declareFunction(me, "new_muted_kb_object_iterator", "NEW-MUTED-KB-OBJECT-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction(me, "is_muted_kb_objectP", "IS-MUTED-KB-OBJECT?", 2, 0, false );
    SubLFiles.declareFunction(me, "verify_kb_object_content_table_int", "VERIFY-KB-OBJECT-CONTENT-TABLE-INT", 2, 1, false );
    SubLFiles.declareMacro(me, "with_kbom_fully_loaded", "WITH-KBOM-FULLY-LOADED" );
    SubLFiles.declareFunction(me, "segment_kb_object_manager_data", "SEGMENT-KB-OBJECT-MANAGER-DATA", 1, 2, false );
    SubLFiles.declareFunction(me, "inspect_kb_object_manager_data", "INSPECT-KB-OBJECT-MANAGER-DATA", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_kb_object_manager_file()
  {
    $dtp_kb_object_manager$ = SubLFiles.defconstant( "*DTP-KB-OBJECT-MANAGER*", $sym3$KB_OBJECT_MANAGER );
    $min_kb_object_lru_size$ = SubLFiles.deflexical( "*MIN-KB-OBJECT-LRU-SIZE*", $int66$212 );
    $kbom_id_equality_test$ = SubLFiles.deflexical( "*KBOM-ID-EQUALITY-TEST*", Symbols.symbol_function( EQ ) );
    return NIL;
  }

  public static SubLObject setup_kb_object_manager_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_kb_object_manager$.getGlobalValue(), Symbols.symbol_function( $sym10$KB_OBJECT_MANAGER_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list11 );
    Structures.def_csetf( $sym12$KBOM_NAME, $sym13$_CSETF_KBOM_NAME );
    Structures.def_csetf( $sym14$KBOM_CONTENT_LOCK, $sym15$_CSETF_KBOM_CONTENT_LOCK );
    Structures.def_csetf( $sym16$KBOM_LRU_SIZE_PERCENTAGE, $sym17$_CSETF_KBOM_LRU_SIZE_PERCENTAGE );
    Structures.def_csetf( $sym18$KBOM_CONTENT_TABLE, $sym19$_CSETF_KBOM_CONTENT_TABLE );
    Structures.def_csetf( $sym20$KBOM_USAGE_TABLE, $sym21$_CSETF_KBOM_USAGE_TABLE );
    Structures.def_csetf( $sym22$KBOM_LRU_INFORMATION, $sym23$_CSETF_KBOM_LRU_INFORMATION );
    Structures.def_csetf( $sym24$KBOM_FILE_VECTOR, $sym25$_CSETF_KBOM_FILE_VECTOR );
    Structures.def_csetf( $sym26$KBOM_ID_THRESHOLD, $sym27$_CSETF_KBOM_ID_THRESHOLD );
    Structures.def_csetf( $sym28$KBOM_LOAD_FUNC, $sym29$_CSETF_KBOM_LOAD_FUNC );
    Structures.def_csetf( $sym30$KBOM_METER_SWAP_TIME_, $sym31$_CSETF_KBOM_METER_SWAP_TIME_ );
    Structures.def_csetf( $sym32$KBOM_SWAP_TIME, $sym33$_CSETF_KBOM_SWAP_TIME );
    Structures.def_csetf( $sym34$KBOM_LRU_SIZE_MAX, $sym35$_CSETF_KBOM_LRU_SIZE_MAX );
    Structures.def_csetf( $sym36$KBOM_SUB_FILE_VECTOR, $sym37$_CSETF_KBOM_SUB_FILE_VECTOR );
    Structures.def_csetf( $sym38$KBOM_DUMMY3, $sym39$_CSETF_KBOM_DUMMY3 );
    Equality.identity( $sym3$KB_OBJECT_MANAGER );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_kb_object_manager$.getGlobalValue(), Symbols.symbol_function(
        $sym59$VISIT_DEFSTRUCT_OBJECT_KB_OBJECT_MANAGER_METHOD ) );
    access_macros.define_obsolete_register( $sym70$NEW_LEGACY_KB_OBJECT_MANAGER, NIL );
    access_macros.register_external_symbol( $sym74$SERIALIZE_KBOM_LRU_INFORMATION );
    access_macros.register_external_symbol( $sym77$PRECACHE_KBOM_BY_LRU_INFORMATION );
    utilities_macros.note_funcall_helper_function( $sym86$IS_MUTED_KB_OBJECT_ );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_kb_object_manager_file();
  }

  @Override
  public void initializeVariables()
  {
    init_kb_object_manager_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_kb_object_manager_file();
  }
  static
  {
    me = new kb_object_manager();
    $dtp_kb_object_manager$ = null;
    $min_kb_object_lru_size$ = null;
    $kbom_id_equality_test$ = null;
    $list0 = ConsesLow.list( ConsesLow.list( makeSymbol( "KBOM" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym1$WITH_LOCK_HELD = makeSymbol( "WITH-LOCK-HELD" );
    $sym2$KB_OBJECT_MANAGER_CONTENT_LOCK = makeSymbol( "KB-OBJECT-MANAGER-CONTENT-LOCK" );
    $sym3$KB_OBJECT_MANAGER = makeSymbol( "KB-OBJECT-MANAGER" );
    $sym4$KB_OBJECT_MANAGER_P = makeSymbol( "KB-OBJECT-MANAGER-P" );
    $list5 = ConsesLow.list( new SubLObject[] { makeSymbol( "NAME" ), makeSymbol( "CONTENT-LOCK" ), makeSymbol( "LRU-SIZE-PERCENTAGE" ), makeSymbol( "CONTENT-TABLE" ), makeSymbol( "USAGE-TABLE" ), makeSymbol(
        "LRU-INFORMATION" ), makeSymbol( "FILE-VECTOR" ), makeSymbol( "ID-THRESHOLD" ), makeSymbol( "LOAD-FUNC" ), makeSymbol( "METER-SWAP-TIME?" ), makeSymbol( "SWAP-TIME" ), makeSymbol( "LRU-SIZE-MAX" ),
      SubLObjectFactory.makeSymbol( "SUB-FILE-VECTOR" ), makeSymbol( "DUMMY3" )
    } );
    $list6 = ConsesLow.list( new SubLObject[] { makeKeyword( "NAME" ), makeKeyword( "CONTENT-LOCK" ), makeKeyword( "LRU-SIZE-PERCENTAGE" ), SubLObjectFactory.makeKeyword( "CONTENT-TABLE" ), makeKeyword( "USAGE-TABLE" ),
      makeKeyword( "LRU-INFORMATION" ), makeKeyword( "FILE-VECTOR" ), makeKeyword( "ID-THRESHOLD" ), makeKeyword( "LOAD-FUNC" ), makeKeyword( "METER-SWAP-TIME?" ), makeKeyword( "SWAP-TIME" ), makeKeyword(
          "LRU-SIZE-MAX" ), makeKeyword( "SUB-FILE-VECTOR" ), makeKeyword( "DUMMY3" )
    } );
    $list7 = ConsesLow.list( new SubLObject[] { makeSymbol( "KBOM-NAME" ), makeSymbol( "KBOM-CONTENT-LOCK" ), makeSymbol( "KBOM-LRU-SIZE-PERCENTAGE" ), makeSymbol( "KBOM-CONTENT-TABLE" ), makeSymbol(
        "KBOM-USAGE-TABLE" ), makeSymbol( "KBOM-LRU-INFORMATION" ), makeSymbol( "KBOM-FILE-VECTOR" ), makeSymbol( "KBOM-ID-THRESHOLD" ), makeSymbol( "KBOM-LOAD-FUNC" ), makeSymbol( "KBOM-METER-SWAP-TIME?" ), makeSymbol(
            "KBOM-SWAP-TIME" ), makeSymbol( "KBOM-LRU-SIZE-MAX" ), makeSymbol( "KBOM-SUB-FILE-VECTOR" ), makeSymbol( "KBOM-DUMMY3" )
    } );
    $list8 = ConsesLow.list( new SubLObject[] { makeSymbol( "_CSETF-KBOM-NAME" ), makeSymbol( "_CSETF-KBOM-CONTENT-LOCK" ), makeSymbol( "_CSETF-KBOM-LRU-SIZE-PERCENTAGE" ), makeSymbol( "_CSETF-KBOM-CONTENT-TABLE" ),
      makeSymbol( "_CSETF-KBOM-USAGE-TABLE" ), makeSymbol( "_CSETF-KBOM-LRU-INFORMATION" ), makeSymbol( "_CSETF-KBOM-FILE-VECTOR" ), makeSymbol( "_CSETF-KBOM-ID-THRESHOLD" ), makeSymbol( "_CSETF-KBOM-LOAD-FUNC" ),
      makeSymbol( "_CSETF-KBOM-METER-SWAP-TIME?" ), makeSymbol( "_CSETF-KBOM-SWAP-TIME" ), makeSymbol( "_CSETF-KBOM-LRU-SIZE-MAX" ), makeSymbol( "_CSETF-KBOM-SUB-FILE-VECTOR" ), makeSymbol( "_CSETF-KBOM-DUMMY3" )
    } );
    $sym9$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol( "DEFAULT-STRUCT-PRINT-FUNCTION" );
    $sym10$KB_OBJECT_MANAGER_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "KB-OBJECT-MANAGER-PRINT-FUNCTION-TRAMPOLINE" );
    $list11 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "KB-OBJECT-MANAGER-P" ) );
    $sym12$KBOM_NAME = makeSymbol( "KBOM-NAME" );
    $sym13$_CSETF_KBOM_NAME = makeSymbol( "_CSETF-KBOM-NAME" );
    $sym14$KBOM_CONTENT_LOCK = makeSymbol( "KBOM-CONTENT-LOCK" );
    $sym15$_CSETF_KBOM_CONTENT_LOCK = makeSymbol( "_CSETF-KBOM-CONTENT-LOCK" );
    $sym16$KBOM_LRU_SIZE_PERCENTAGE = makeSymbol( "KBOM-LRU-SIZE-PERCENTAGE" );
    $sym17$_CSETF_KBOM_LRU_SIZE_PERCENTAGE = makeSymbol( "_CSETF-KBOM-LRU-SIZE-PERCENTAGE" );
    $sym18$KBOM_CONTENT_TABLE = makeSymbol( "KBOM-CONTENT-TABLE" );
    $sym19$_CSETF_KBOM_CONTENT_TABLE = makeSymbol( "_CSETF-KBOM-CONTENT-TABLE" );
    $sym20$KBOM_USAGE_TABLE = makeSymbol( "KBOM-USAGE-TABLE" );
    $sym21$_CSETF_KBOM_USAGE_TABLE = makeSymbol( "_CSETF-KBOM-USAGE-TABLE" );
    $sym22$KBOM_LRU_INFORMATION = makeSymbol( "KBOM-LRU-INFORMATION" );
    $sym23$_CSETF_KBOM_LRU_INFORMATION = makeSymbol( "_CSETF-KBOM-LRU-INFORMATION" );
    $sym24$KBOM_FILE_VECTOR = makeSymbol( "KBOM-FILE-VECTOR" );
    $sym25$_CSETF_KBOM_FILE_VECTOR = makeSymbol( "_CSETF-KBOM-FILE-VECTOR" );
    $sym26$KBOM_ID_THRESHOLD = makeSymbol( "KBOM-ID-THRESHOLD" );
    $sym27$_CSETF_KBOM_ID_THRESHOLD = makeSymbol( "_CSETF-KBOM-ID-THRESHOLD" );
    $sym28$KBOM_LOAD_FUNC = makeSymbol( "KBOM-LOAD-FUNC" );
    $sym29$_CSETF_KBOM_LOAD_FUNC = makeSymbol( "_CSETF-KBOM-LOAD-FUNC" );
    $sym30$KBOM_METER_SWAP_TIME_ = makeSymbol( "KBOM-METER-SWAP-TIME?" );
    $sym31$_CSETF_KBOM_METER_SWAP_TIME_ = makeSymbol( "_CSETF-KBOM-METER-SWAP-TIME?" );
    $sym32$KBOM_SWAP_TIME = makeSymbol( "KBOM-SWAP-TIME" );
    $sym33$_CSETF_KBOM_SWAP_TIME = makeSymbol( "_CSETF-KBOM-SWAP-TIME" );
    $sym34$KBOM_LRU_SIZE_MAX = makeSymbol( "KBOM-LRU-SIZE-MAX" );
    $sym35$_CSETF_KBOM_LRU_SIZE_MAX = makeSymbol( "_CSETF-KBOM-LRU-SIZE-MAX" );
    $sym36$KBOM_SUB_FILE_VECTOR = makeSymbol( "KBOM-SUB-FILE-VECTOR" );
    $sym37$_CSETF_KBOM_SUB_FILE_VECTOR = makeSymbol( "_CSETF-KBOM-SUB-FILE-VECTOR" );
    $sym38$KBOM_DUMMY3 = makeSymbol( "KBOM-DUMMY3" );
    $sym39$_CSETF_KBOM_DUMMY3 = makeSymbol( "_CSETF-KBOM-DUMMY3" );
    $kw40$NAME = makeKeyword( "NAME" );
    $kw41$CONTENT_LOCK = makeKeyword( "CONTENT-LOCK" );
    $kw42$LRU_SIZE_PERCENTAGE = makeKeyword( "LRU-SIZE-PERCENTAGE" );
    $kw43$CONTENT_TABLE = makeKeyword( "CONTENT-TABLE" );
    $kw44$USAGE_TABLE = makeKeyword( "USAGE-TABLE" );
    $kw45$LRU_INFORMATION = makeKeyword( "LRU-INFORMATION" );
    $kw46$FILE_VECTOR = makeKeyword( "FILE-VECTOR" );
    $kw47$ID_THRESHOLD = makeKeyword( "ID-THRESHOLD" );
    $kw48$LOAD_FUNC = makeKeyword( "LOAD-FUNC" );
    $kw49$METER_SWAP_TIME_ = makeKeyword( "METER-SWAP-TIME?" );
    $kw50$SWAP_TIME = makeKeyword( "SWAP-TIME" );
    $kw51$LRU_SIZE_MAX = makeKeyword( "LRU-SIZE-MAX" );
    $kw52$SUB_FILE_VECTOR = makeKeyword( "SUB-FILE-VECTOR" );
    $kw53$DUMMY3 = makeKeyword( "DUMMY3" );
    $str54$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw55$BEGIN = makeKeyword( "BEGIN" );
    $sym56$MAKE_KB_OBJECT_MANAGER = makeSymbol( "MAKE-KB-OBJECT-MANAGER" );
    $kw57$SLOT = makeKeyword( "SLOT" );
    $kw58$END = makeKeyword( "END" );
    $sym59$VISIT_DEFSTRUCT_OBJECT_KB_OBJECT_MANAGER_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-KB-OBJECT-MANAGER-METHOD" );
    $sym60$STRINGP = makeSymbol( "STRINGP" );
    $sym61$NON_NEGATIVE_INTEGER_P = makeSymbol( "NON-NEGATIVE-INTEGER-P" );
    $sym62$POSITIVE_INTEGER_P = makeSymbol( "POSITIVE-INTEGER-P" );
    $sym63$FBOUNDP = makeSymbol( "FBOUNDP" );
    $str64$_content_manager_lock = makeString( " content manager lock" );
    $kw65$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $int66$212 = makeInteger( 212 );
    $int67$100 = makeInteger( 100 );
    $str68$Got__s__expected_an_extensionless = makeString( "Got ~s, expected an extensionless file basename" );
    $kw69$OLDEST = makeKeyword( "OLDEST" );
    $sym70$NEW_LEGACY_KB_OBJECT_MANAGER = makeSymbol( "NEW-LEGACY-KB-OBJECT-MANAGER" );
    $float71$0_05 = makeDouble( 0.05 );
    $str72$Failed_to_swap_in_KB_object__A_ba = makeString( "Failed to swap in KB object ~A back from the CFASL stream ~A; got ~A instead.~%After index lookup, index was at filepos ~A.~%Corrupted KB units?" );
    $str73$We_expected_KB_object_ID__A_from_ = makeString(
        "We expected KB object ID ~A from CFASL stream ~A but got object ~A of type ~A instead.~%Thus, the index and the data files for the file vector are misaligned.~%After index lookup, index was at filepos ~A.~%Corrupted KB units?" );
    $sym74$SERIALIZE_KBOM_LRU_INFORMATION = makeSymbol( "SERIALIZE-KBOM-LRU-INFORMATION" );
    $kw75$OUTPUT = makeKeyword( "OUTPUT" );
    $str76$Unable_to_open__S = makeString( "Unable to open ~S" );
    $sym77$PRECACHE_KBOM_BY_LRU_INFORMATION = makeSymbol( "PRECACHE-KBOM-BY-LRU-INFORMATION" );
    $kw78$INPUT = makeKeyword( "INPUT" );
    $sym79$_ = makeSymbol( "<" );
    $str80$_lru_info_for_ = makeString( "-lru-info-for-" );
    $str81$_cfasl = makeString( ".cfasl" );
    $kw82$NEWEST = makeKeyword( "NEWEST" );
    $str83$Swapping_out_ = makeString( "Swapping out " );
    $str84$_objects = makeString( " objects" );
    $str85$cdolist = makeString( "cdolist" );
    $sym86$IS_MUTED_KB_OBJECT_ = makeSymbol( "IS-MUTED-KB-OBJECT?" );
    $list87 = ConsesLow.list( makeSymbol( "ID" ), makeSymbol( "PAYLOAD" ) );
    $str88$Verifying_integrity_of_ = makeString( "Verifying integrity of " );
    $str89$_content_table = makeString( " content table" );
    $kw90$SKIP = makeKeyword( "SKIP" );
    $str91$Entry__a_is_invalid___a__repairin = makeString( "Entry ~a is invalid: ~a, repairing" );
    $str92$Entry__a_is_invalid___a = makeString( "Entry ~a is invalid: ~a" );
    $sym93$MANAGER = makeUninternedSymbol( "MANAGER" );
    $sym94$MAINTAINING_COUNTS_ = makeUninternedSymbol( "MAINTAINING-COUNTS?" );
    $sym95$MEMORY_MAPPED_ = makeUninternedSymbol( "MEMORY-MAPPED?" );
    $sym96$CLET = makeSymbol( "CLET" );
    $sym97$KB_OBJECT_USAGE_COUNTS_ENABLED_ = makeSymbol( "KB-OBJECT-USAGE-COUNTS-ENABLED?" );
    $sym98$KB_OBJECT_MANAGER_MEMORY_MAPPED_ = makeSymbol( "KB-OBJECT-MANAGER-MEMORY-MAPPED?" );
    $sym99$CUNWIND_PROTECT = makeSymbol( "CUNWIND-PROTECT" );
    $sym100$PROGN = makeSymbol( "PROGN" );
    $sym101$DONT_MAINTAIN_KB_OBJECT_USAGE_COUNTS = makeSymbol( "DONT-MAINTAIN-KB-OBJECT-USAGE-COUNTS" );
    $sym102$KB_OBJECT_MANAGER_ENABLE_MEMORY_MAPPING = makeSymbol( "KB-OBJECT-MANAGER-ENABLE-MEMORY-MAPPING" );
    $sym103$PWHEN = makeSymbol( "PWHEN" );
    $sym104$MAINTAIN_KB_OBJECT_USAGE_COUNTS = makeSymbol( "MAINTAIN-KB-OBJECT-USAGE-COUNTS" );
    $sym105$CNOT = makeSymbol( "CNOT" );
    $sym106$KB_OBJECT_MANAGER_CHANGE_STREAM_BUFFER_SIZES = makeSymbol( "KB-OBJECT-MANAGER-CHANGE-STREAM-BUFFER-SIZES" );
    $list107 = ConsesLow.list( makeInteger( 2048 ), makeInteger( 256 ) );
  }

  public static final class $kb_object_manager_native
      extends
        SubLStructNative
  {
    public SubLObject $name;
    public SubLObject $content_lock;
    public SubLObject $lru_size_percentage;
    public SubLObject $content_table;
    public SubLObject $usage_table;
    public SubLObject $lru_information;
    public SubLObject $file_vector;
    public SubLObject $id_threshold;
    public SubLObject $load_func;
    public SubLObject $meter_swap_timeP;
    public SubLObject $swap_time;
    public SubLObject $lru_size_max;
    public SubLObject $sub_file_vector;
    public SubLObject $dummy3;
    private static final SubLStructDeclNative structDecl;

    public $kb_object_manager_native()
    {
      this.$name = CommonSymbols.NIL;
      this.$content_lock = CommonSymbols.NIL;
      this.$lru_size_percentage = CommonSymbols.NIL;
      this.$content_table = CommonSymbols.NIL;
      this.$usage_table = CommonSymbols.NIL;
      this.$lru_information = CommonSymbols.NIL;
      this.$file_vector = CommonSymbols.NIL;
      this.$id_threshold = CommonSymbols.NIL;
      this.$load_func = CommonSymbols.NIL;
      this.$meter_swap_timeP = CommonSymbols.NIL;
      this.$swap_time = CommonSymbols.NIL;
      this.$lru_size_max = CommonSymbols.NIL;
      this.$sub_file_vector = CommonSymbols.NIL;
      this.$dummy3 = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $kb_object_manager_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$name;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$content_lock;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$lru_size_percentage;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$content_table;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$usage_table;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$lru_information;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$file_vector;
    }

    @Override
    public SubLObject getField9()
    {
      return this.$id_threshold;
    }

    @Override
    public SubLObject getField10()
    {
      return this.$load_func;
    }

    @Override
    public SubLObject getField11()
    {
      return this.$meter_swap_timeP;
    }

    @Override
    public SubLObject getField12()
    {
      return this.$swap_time;
    }

    @Override
    public SubLObject getField13()
    {
      return this.$lru_size_max;
    }

    @Override
    public SubLObject getField14()
    {
      return this.$sub_file_vector;
    }

    @Override
    public SubLObject getField15()
    {
      return this.$dummy3;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$name = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$content_lock = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$lru_size_percentage = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$content_table = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$usage_table = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$lru_information = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$file_vector = value;
    }

    @Override
    public SubLObject setField9(final SubLObject value)
    {
      return this.$id_threshold = value;
    }

    @Override
    public SubLObject setField10(final SubLObject value)
    {
      return this.$load_func = value;
    }

    @Override
    public SubLObject setField11(final SubLObject value)
    {
      return this.$meter_swap_timeP = value;
    }

    @Override
    public SubLObject setField12(final SubLObject value)
    {
      return this.$swap_time = value;
    }

    @Override
    public SubLObject setField13(final SubLObject value)
    {
      return this.$lru_size_max = value;
    }

    @Override
    public SubLObject setField14(final SubLObject value)
    {
      return this.$sub_file_vector = value;
    }

    @Override
    public SubLObject setField15(final SubLObject value)
    {
      return this.$dummy3 = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $kb_object_manager_native.class, $sym3$KB_OBJECT_MANAGER, $sym4$KB_OBJECT_MANAGER_P, $list5, $list6, new String[] { "$name", "$content_lock", "$lru_size_percentage",
        "$content_table", "$usage_table", "$lru_information", "$file_vector", "$id_threshold", "$load_func", "$meter_swap_timeP", "$swap_time", "$lru_size_max", "$sub_file_vector", "$dummy3"
      }, $list7, $list8, $sym9$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $kb_object_manager_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $kb_object_manager_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "KB-OBJECT-MANAGER-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return kb_object_manager_p( arg1 );
    }
  }
}
