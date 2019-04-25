//
//
package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class assertion_handles extends SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.assertion_handles";
  public static final String myFingerPrint = "f80c889b3eac69ffe44762c0e23b7d885990a37c86ba630de9407b9fed1a92f3";
  @SubLTranslatedFile.SubL(
    source = "cycl/assertion-handles.lisp",
    position = 1234L)
  private static SubLSymbol $assertion_from_id$;
  @SubLTranslatedFile.SubL(
    source = "cycl/assertion-handles.lisp",
    position = 6027L)
  private static SubLSymbol $new_assertion_id_threshold$;
  @SubLTranslatedFile.SubL(
    source = "cycl/assertion-handles.lisp",
    position = 11034L)
  public static SubLSymbol $dtp_assertion$;
  @SubLTranslatedFile.SubL(
    source = "cycl/assertion-handles.lisp",
    position = 11203L)
  public static SubLSymbol $print_assertions_in_cnf$;
  private static final SubLSymbol $sym0$_ASSERTION_FROM_ID_;
  private static final SubLSymbol $sym1$ASSERTIONS_TABLE_TUPLE_TO_ASSERTION;
  private static final SubLList $list2;
  private static final SubLString $str3$mapping_Cyc_assertions;
  private static final SubLList $list4;
  private static final SubLSymbol $kw5$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw6$DONE;
  private static final SubLSymbol $sym7$A_ID;
  private static final SubLSymbol $sym8$A_HANDLE;
  private static final SubLSymbol $sym9$DO_ID_INDEX;
  private static final SubLList $list10;
  private static final SubLSymbol $kw11$PROGRESS_MESSAGE;
  private static final SubLSymbol $kw12$ORDERED;
  private static final SubLSymbol $sym13$CLET;
  private static final SubLSymbol $sym14$RESOLVE_ASSERTION_ID_VALUE_PAIR;
  private static final SubLSymbol $sym15$DO_ASSERTIONS;
  private static final SubLString $str16$Iterate_over_all_HL_assertion_dat;
  private static final SubLSymbol $kw17$PAGED_OUT;
  private static final SubLSymbol $sym18$DO_ASSERTIONS_TABLE;
  private static final SubLSymbol $sym19$NEW_ASSERTIONS_TABLE_ENTRY_;
  private static final SubLList $list20;
  private static final SubLSymbol $sym21$CREATE_ASSERTION_DUMP_ID_TABLE;
  private static final SubLSymbol $sym22$WITH_ASSERTION_DUMP_ID_TABLE;
  private static final SubLSymbol $sym23$ASSERTION_COUNT;
  private static final SubLString $str24$Return_the_total_number_of_assert;
  private static final SubLList $list25;
  private static final SubLSymbol $sym26$_NEW_ASSERTION_ID_THRESHOLD_;
  private static final SubLSymbol $kw27$DENSE;
  private static final SubLSymbol $kw28$ALL;
  private static final SubLList $list29;
  private static final SubLSymbol $sym30$ITERATOR;
  private static final SubLList $list31;
  private static final SubLSymbol $sym32$DO_ITERATOR;
  private static final SubLString $str33$Determining_maximum_assertion_ID;
  private static final SubLSymbol $sym34$STRINGP;
  private static final SubLSymbol $kw35$SKIP;
  private static final SubLList $list36;
  private static final SubLList $list37;
  private static final SubLSymbol $sym38$THRESHOLD;
  private static final SubLList $list39;
  private static final SubLSymbol $sym40$DO_KB_SUID_TABLE_UPTO_EXCLUDING_ID;
  private static final SubLSymbol $sym41$START;
  private static final SubLSymbol $sym42$DO_KB_SUID_TABLE_STARTING_AT_ID;
  static final SubLSymbol $sym43$ASSERTION;
  static final SubLSymbol $sym44$ASSERTION_P;
  private static final SubLInteger $int45$141;
  static final SubLList $list46;
  static final SubLList $list47;
  static final SubLList $list48;
  static final SubLList $list49;
  static final SubLSymbol $sym50$PRINT_ASSERTION;
  private static final SubLSymbol $sym51$ASSERTION_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list52;
  private static final SubLSymbol $sym53$AS_ID;
  private static final SubLSymbol $sym54$_CSETF_AS_ID;
  private static final SubLSymbol $kw55$ID;
  private static final SubLString $str56$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw57$BEGIN;
  private static final SubLSymbol $sym58$MAKE_ASSERTION;
  private static final SubLSymbol $kw59$SLOT;
  private static final SubLSymbol $kw60$END;
  private static final SubLSymbol $sym61$VISIT_DEFSTRUCT_OBJECT_ASSERTION_METHOD;
  private static final SubLString $str62$__AS__S__S_;
  private static final SubLString $str63$__AS__S_;
  private static final SubLString $str64$_The_CFASL_invalid_assertion_;
  private static final SubLInteger $int65$23;
  private static final SubLSymbol $sym66$SXHASH_ASSERTION_METHOD;
  private static final SubLList $list67;
  private static final SubLString $str68$Return_T_iff_OBJECT_is_an_HL_asse;
  private static final SubLList $list69;
  private static final SubLSymbol $sym70$FIXNUMP;
  private static final SubLString $str71$Freeing_assertions;
  private static final SubLSymbol $sym72$ASSERTION_ID;
  private static final SubLList $list73;
  private static final SubLString $str74$Return_the_id_of_this_ASSERTION_;
  private static final SubLList $list75;
  private static final SubLSymbol $sym76$INTEGERP;
  private static final SubLSymbol $sym77$FIND_ASSERTION_BY_ID;
  private static final SubLString $str78$Return_the_assertion_with_ID__or_;
  private static final SubLList $list79;
  private static final SubLList $list80;

  @SubLTranslatedFile.SubL(
    source = "cycl/assertion-handles.lisp",
    position = 1555L)
  public static SubLObject new_assertions_iterator()
  {
    return iteration.new_indirect_iterator( id_index.new_id_index_iterator( assertion_handles.$assertion_from_id$.getGlobalValue() ), assertion_handles.$sym1$ASSERTIONS_TABLE_TUPLE_TO_ASSERTION,
        assertion_handles.UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertion-handles.lisp",
    position = 1893L)
  public static SubLObject do_assertions(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, assertion_handles.$list2 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = assertion_handles.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, assertion_handles.$list2 );
    var = current.first();
    current = current.rest();
    final SubLObject progress_message = current.isCons() ? current.first() : assertion_handles.$str3$mapping_Cyc_assertions;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, assertion_handles.$list2 );
    current = current.rest();
    SubLObject allow_other_keys_p = assertion_handles.NIL;
    SubLObject rest = current;
    SubLObject bad = assertion_handles.NIL;
    SubLObject current_$1 = assertion_handles.NIL;
    while ( assertion_handles.NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, assertion_handles.$list2 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, assertion_handles.$list2 );
      if( assertion_handles.NIL == conses_high.member( current_$1, assertion_handles.$list4, assertion_handles.UNPROVIDED, assertion_handles.UNPROVIDED ) )
      {
        bad = assertion_handles.T;
      }
      if( current_$1 == assertion_handles.$kw5$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( assertion_handles.NIL != bad && assertion_handles.NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, assertion_handles.$list2 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( assertion_handles.$kw6$DONE, current );
    final SubLObject done = ( assertion_handles.NIL != done_tail ) ? conses_high.cadr( done_tail ) : assertion_handles.NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject a_id = assertion_handles.$sym7$A_ID;
    final SubLObject a_handle = assertion_handles.$sym8$A_HANDLE;
    return ConsesLow.list( assertion_handles.$sym9$DO_ID_INDEX, ConsesLow.list( new SubLObject[] { a_id, a_handle, assertion_handles.$list10,
      assertion_handles.$kw11$PROGRESS_MESSAGE, progress_message, assertion_handles.$kw12$ORDERED, assertion_handles.T, assertion_handles.$kw6$DONE, done
    } ), ConsesLow.listS( assertion_handles.$sym13$CLET, ConsesLow.list( ConsesLow.list( var, ConsesLow.list(
        assertion_handles.$sym14$RESOLVE_ASSERTION_ID_VALUE_PAIR, a_id, a_handle ) ) ), ConsesLow.append( body, assertion_handles.NIL ) ) );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertion-handles.lisp",
    position = 2979L)
  public static SubLObject resolve_assertion_id_value_pair(final SubLObject id, SubLObject assertion)
  {
    if( assertion_handles.$kw17$PAGED_OUT == assertion )
    {
      assertion = find_assertion_by_id( id );
    }
    return assertion;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertion-handles.lisp",
    position = 3176L)
  public static SubLObject do_assertions_table()
  {
    return assertion_handles.$assertion_from_id$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertion-handles.lisp",
    position = 3277L)
  public static SubLObject new_new_assertions_iterator()
  {
    return iteration.new_indirect_iterator( iteration.new_filter_iterator( id_index.new_id_index_ordered_iterator( do_assertions_table() ), assertion_handles.$sym19$NEW_ASSERTIONS_TABLE_ENTRY_,
        ConsesLow.list( new_assertion_id_threshold() ) ), assertion_handles.$sym1$ASSERTIONS_TABLE_TUPLE_TO_ASSERTION, assertion_handles.UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertion-handles.lisp",
    position = 3581L)
  public static SubLObject new_assertions_table_entryP(final SubLObject tuple, final SubLObject id_threshold)
  {
    SubLObject id = assertion_handles.NIL;
    SubLObject payload = assertion_handles.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( tuple, tuple, assertion_handles.$list20 );
    id = tuple.first();
    SubLObject current = tuple.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, tuple, assertion_handles.$list20 );
    payload = current.first();
    current = current.rest();
    if( assertion_handles.NIL == current )
    {
      return Numbers.numGE( id, id_threshold );
    }
    cdestructuring_bind.cdestructuring_bind_error( tuple, assertion_handles.$list20 );
    return assertion_handles.NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertion-handles.lisp",
    position = 3751L)
  public static SubLObject assertions_table_tuple_to_assertion(final SubLObject tuple)
  {
    SubLObject id = assertion_handles.NIL;
    SubLObject payload = assertion_handles.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( tuple, tuple, assertion_handles.$list20 );
    id = tuple.first();
    SubLObject current = tuple.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, tuple, assertion_handles.$list20 );
    payload = current.first();
    current = current.rest();
    if( assertion_handles.NIL == current )
    {
      return find_assertion_by_id( id );
    }
    cdestructuring_bind.cdestructuring_bind_error( tuple, assertion_handles.$list20 );
    return assertion_handles.NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertion-handles.lisp",
    position = 3921L)
  public static SubLObject setup_assertion_table(final SubLObject size, final SubLObject exactP)
  {
    if( assertion_handles.NIL != assertion_handles.$assertion_from_id$.getGlobalValue() )
    {
      return assertion_handles.NIL;
    }
    assertion_handles.$assertion_from_id$.setGlobalValue( id_index.new_id_index( size, assertion_handles.ZERO_INTEGER ) );
    return assertion_handles.T;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertion-handles.lisp",
    position = 4139L)
  public static SubLObject finalize_assertions(SubLObject max_assertion_id)
  {
    if( max_assertion_id == assertion_handles.UNPROVIDED )
    {
      max_assertion_id = assertion_handles.NIL;
    }
    set_next_assertion_id( max_assertion_id );
    set_new_assertion_id_threshold( next_assertion_id() );
    if( assertion_handles.NIL == max_assertion_id )
    {
      optimize_assertion_table();
      assertion_manager.optimize_assertion_content_table( new_assertion_id_threshold() );
    }
    return assertion_handles.NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertion-handles.lisp",
    position = 4557L)
  public static SubLObject optimize_assertion_table()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = Storage.$current_area$.currentBinding( thread );
    try
    {
      Storage.$current_area$.bind( Storage.get_static_area(), thread );
      id_index.optimize_id_index( assertion_handles.$assertion_from_id$.getGlobalValue(), assertion_handles.UNPROVIDED );
    }
    finally
    {
      Storage.$current_area$.rebind( _prev_bind_0, thread );
    }
    return assertion_handles.NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertion-handles.lisp",
    position = 4680L)
  public static SubLObject clear_assertion_table()
  {
    return id_index.clear_id_index( assertion_handles.$assertion_from_id$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertion-handles.lisp",
    position = 4768L)
  public static SubLObject create_assertion_dump_id_table()
  {
    return id_index.new_indirect_compact_id_index( assertion_handles.$assertion_from_id$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertion-handles.lisp",
    position = 4925L)
  public static SubLObject new_dense_assertion_id_index()
  {
    return id_index.clone_id_index( do_assertions_table() );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertion-handles.lisp",
    position = 5024L)
  public static SubLObject assertion_count()
  {
    if( assertion_handles.NIL == assertion_handles.$assertion_from_id$.getGlobalValue() )
    {
      return assertion_handles.ZERO_INTEGER;
    }
    return id_index.id_index_count( assertion_handles.$assertion_from_id$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertion-handles.lisp",
    position = 5394L)
  public static SubLObject lookup_assertion(final SubLObject id)
  {
    final SubLObject assertion = id_index.id_index_lookup( assertion_handles.$assertion_from_id$.getGlobalValue(), id, assertion_handles.UNPROVIDED );
    if( assertion_handles.NIL == assertion )
    {
      return assertion_handles.NIL;
    }
    if( assertion_handles.$kw17$PAGED_OUT == assertion )
    {
      return make_assertion_shell( id );
    }
    return assertion;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertion-handles.lisp",
    position = 5906L)
  public static SubLObject next_assertion_id()
  {
    return id_index.id_index_next_id( assertion_handles.$assertion_from_id$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertion-handles.lisp",
    position = 6165L)
  public static SubLObject set_new_assertion_id_threshold(final SubLObject id)
  {
    assertion_handles.$new_assertion_id_threshold$.setGlobalValue( id );
    return id;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertion-handles.lisp",
    position = 6272L)
  public static SubLObject new_assertion_id_threshold()
  {
    return ( assertion_handles.NIL != assertion_handles.$new_assertion_id_threshold$.getGlobalValue() ) ? assertion_handles.$new_assertion_id_threshold$.getGlobalValue()
        : assertion_manager.get_file_backed_assertion_id_threshold();
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertion-handles.lisp",
    position = 6466L)
  public static SubLObject old_assertion_count()
  {
    return Values.nth_value_step_2( Values.nth_value_step_1( assertion_handles.ZERO_INTEGER ), id_index.id_index_old_and_new_object_counts( do_assertions_table(), new_assertion_id_threshold() ) );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertion-handles.lisp",
    position = 6616L)
  public static SubLObject new_assertion_count()
  {
    return Values.nth_value_step_2( Values.nth_value_step_1( assertion_handles.ONE_INTEGER ), id_index.id_index_old_and_new_object_counts( do_assertions_table(), new_assertion_id_threshold() ) );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertion-handles.lisp",
    position = 6766L)
  public static SubLObject missing_old_assertion_ids()
  {
    final SubLObject id_limit = new_assertion_id_threshold();
    return id_index.id_index_missing_ids( do_assertions_table(), assertion_handles.$kw27$DENSE, id_limit );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertion-handles.lisp",
    position = 7019L)
  public static SubLObject missing_assertion_id_set()
  {
    return set_utilities.construct_set_from_list( id_index.id_index_missing_ids( do_assertions_table(), assertion_handles.$kw28$ALL, assertion_handles.UNPROVIDED ),
        assertion_handles.EQL, assertion_handles.UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertion-handles.lisp",
    position = 7215L)
  public static SubLObject deleted_assertion_id_iterator()
  {
    return iteration.new_list_iterator( id_index.id_index_missing_ids( do_assertions_table(), assertion_handles.$kw28$ALL, assertion_handles.UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertion-handles.lisp",
    position = 7394L)
  public static SubLObject do_deleted_assertion_ids(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, assertion_handles.$list29 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject id = assertion_handles.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, assertion_handles.$list29 );
    id = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = assertion_handles.NIL;
    SubLObject rest = current;
    SubLObject bad = assertion_handles.NIL;
    SubLObject current_$2 = assertion_handles.NIL;
    while ( assertion_handles.NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, assertion_handles.$list29 );
      current_$2 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, assertion_handles.$list29 );
      if( assertion_handles.NIL == conses_high.member( current_$2, assertion_handles.$list4, assertion_handles.UNPROVIDED, assertion_handles.UNPROVIDED ) )
      {
        bad = assertion_handles.T;
      }
      if( current_$2 == assertion_handles.$kw5$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( assertion_handles.NIL != bad && assertion_handles.NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, assertion_handles.$list29 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( assertion_handles.$kw6$DONE, current );
    final SubLObject done = ( assertion_handles.NIL != done_tail ) ? conses_high.cadr( done_tail ) : assertion_handles.NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject iterator = assertion_handles.$sym30$ITERATOR;
    return ConsesLow.list( assertion_handles.$sym13$CLET, ConsesLow.list( reader.bq_cons( iterator, assertion_handles.$list31 ) ), ConsesLow.listS(
        assertion_handles.$sym32$DO_ITERATOR, ConsesLow.list( id, iterator, assertion_handles.$kw6$DONE, done ), ConsesLow.append( body, assertion_handles.NIL ) ) );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertion-handles.lisp",
    position = 7635L)
  public static SubLObject has_new_assertionsP()
  {
    return Numbers.numG( next_assertion_id(), new_assertion_id_threshold() );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertion-handles.lisp",
    position = 7736L)
  public static SubLObject set_next_assertion_id(SubLObject max_assertion_id)
  {
    if( max_assertion_id == assertion_handles.UNPROVIDED )
    {
      max_assertion_id = assertion_handles.NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject max = assertion_handles.MINUS_ONE_INTEGER;
    if( assertion_handles.NIL != max_assertion_id )
    {
      max = max_assertion_id;
    }
    else
    {
      final SubLObject idx = do_assertions_table();
      final SubLObject mess = assertion_handles.$str33$Determining_maximum_assertion_ID;
      final SubLObject total = id_index.id_index_count( idx );
      SubLObject sofar = assertion_handles.ZERO_INTEGER;
      assert assertion_handles.NIL != Types.stringp( mess ) : mess;
      final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$last_percent_progress_index$.bind( assertion_handles.ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( assertion_handles.NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( assertion_handles.T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( mess );
          final SubLObject idx_$3 = idx;
          if( assertion_handles.NIL == id_index.id_index_objects_empty_p( idx_$3, assertion_handles.$kw35$SKIP ) )
          {
            final SubLObject idx_$4 = idx_$3;
            if( assertion_handles.NIL == id_index.id_index_dense_objects_empty_p( idx_$4, assertion_handles.$kw35$SKIP ) )
            {
              final SubLObject vector_var = id_index.id_index_dense_objects( idx_$4 );
              final SubLObject backwardP_var = assertion_handles.NIL;
              SubLObject length;
              SubLObject v_iteration;
              SubLObject a_id;
              SubLObject a_handle;
              SubLObject assertion;
              for( length = Sequences.length( vector_var ), v_iteration = assertion_handles.NIL, v_iteration = assertion_handles.ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers
                  .add( v_iteration, assertion_handles.ONE_INTEGER ) )
              {
                a_id = ( ( assertion_handles.NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, assertion_handles.ONE_INTEGER ) : v_iteration );
                a_handle = Vectors.aref( vector_var, a_id );
                if( assertion_handles.NIL == id_index.id_index_tombstone_p( a_handle ) || assertion_handles.NIL == id_index.id_index_skip_tombstones_p( assertion_handles.$kw35$SKIP ) )
                {
                  if( assertion_handles.NIL != id_index.id_index_tombstone_p( a_handle ) )
                  {
                    a_handle = assertion_handles.$kw35$SKIP;
                  }
                  assertion = resolve_assertion_id_value_pair( a_id, a_handle );
                  max = Numbers.max( max, assertion_id( assertion ) );
                  sofar = Numbers.add( sofar, assertion_handles.ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total );
                }
              }
            }
            final SubLObject idx_$5 = idx_$3;
            if( assertion_handles.NIL == id_index.id_index_sparse_objects_empty_p( idx_$5 ) || assertion_handles.NIL == id_index.id_index_skip_tombstones_p( assertion_handles.$kw35$SKIP ) )
            {
              final SubLObject sparse = id_index.id_index_sparse_objects( idx_$5 );
              SubLObject a_id2 = id_index.id_index_sparse_id_threshold( idx_$5 );
              final SubLObject end_id = id_index.id_index_next_id( idx_$5 );
              final SubLObject v_default = ( assertion_handles.NIL != id_index.id_index_skip_tombstones_p( assertion_handles.$kw35$SKIP ) ) ? assertion_handles.NIL
                  : assertion_handles.$kw35$SKIP;
              while ( a_id2.numL( end_id ))
              {
                final SubLObject a_handle2 = Hashtables.gethash_without_values( a_id2, sparse, v_default );
                if( assertion_handles.NIL == id_index.id_index_skip_tombstones_p( assertion_handles.$kw35$SKIP ) || assertion_handles.NIL == id_index.id_index_tombstone_p( a_handle2 ) )
                {
                  final SubLObject assertion2 = resolve_assertion_id_value_pair( a_id2, a_handle2 );
                  max = Numbers.max( max, assertion_id( assertion2 ) );
                  sofar = Numbers.add( sofar, assertion_handles.ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total );
                }
                a_id2 = Numbers.add( a_id2, assertion_handles.ONE_INTEGER );
              }
            }
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( assertion_handles.T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$6, thread );
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
    }
    final SubLObject next_id = Numbers.add( max, assertion_handles.ONE_INTEGER );
    id_index.set_id_index_next_id( assertion_handles.$assertion_from_id$.getGlobalValue(), next_id );
    return next_id;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertion-handles.lisp",
    position = 8123L)
  public static SubLObject register_assertion_id(final SubLObject assertion, final SubLObject id)
  {
    reset_assertion_id( assertion, id );
    id_index.id_index_enter( assertion_handles.$assertion_from_id$.getGlobalValue(), id, assertion );
    return assertion;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertion-handles.lisp",
    position = 8366L)
  public static SubLObject deregister_assertion_id(final SubLObject id)
  {
    return id_index.id_index_remove( assertion_handles.$assertion_from_id$.getGlobalValue(), id );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertion-handles.lisp",
    position = 8515L)
  public static SubLObject make_assertion_id()
  {
    return id_index.id_index_reserve( assertion_handles.$assertion_from_id$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertion-handles.lisp",
    position = 8649L)
  public static SubLObject do_old_assertions(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, assertion_handles.$list36 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject assertion = assertion_handles.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, assertion_handles.$list36 );
    assertion = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = assertion_handles.NIL;
    SubLObject rest = current;
    SubLObject bad = assertion_handles.NIL;
    SubLObject current_$7 = assertion_handles.NIL;
    while ( assertion_handles.NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, assertion_handles.$list36 );
      current_$7 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, assertion_handles.$list36 );
      if( assertion_handles.NIL == conses_high.member( current_$7, assertion_handles.$list37, assertion_handles.UNPROVIDED, assertion_handles.UNPROVIDED ) )
      {
        bad = assertion_handles.T;
      }
      if( current_$7 == assertion_handles.$kw5$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( assertion_handles.NIL != bad && assertion_handles.NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, assertion_handles.$list36 );
    }
    final SubLObject progress_message_tail = cdestructuring_bind.property_list_member( assertion_handles.$kw11$PROGRESS_MESSAGE, current );
    final SubLObject progress_message = ( assertion_handles.NIL != progress_message_tail ) ? conses_high.cadr( progress_message_tail ) : assertion_handles.NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( assertion_handles.$kw6$DONE, current );
    final SubLObject done = ( assertion_handles.NIL != done_tail ) ? conses_high.cadr( done_tail ) : assertion_handles.NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject threshold = assertion_handles.$sym38$THRESHOLD;
    return ConsesLow.list( assertion_handles.$sym13$CLET, ConsesLow.list( reader.bq_cons( threshold, assertion_handles.$list39 ) ), ConsesLow.listS(
        assertion_handles.$sym40$DO_KB_SUID_TABLE_UPTO_EXCLUDING_ID, ConsesLow.list( assertion, assertion_handles.$list10, threshold,
            assertion_handles.$kw11$PROGRESS_MESSAGE, progress_message, assertion_handles.$kw6$DONE, done ), ConsesLow.append( body, assertion_handles.NIL ) ) );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertion-handles.lisp",
    position = 9542L)
  public static SubLObject do_new_assertions(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, assertion_handles.$list36 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject assertion = assertion_handles.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, assertion_handles.$list36 );
    assertion = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = assertion_handles.NIL;
    SubLObject rest = current;
    SubLObject bad = assertion_handles.NIL;
    SubLObject current_$8 = assertion_handles.NIL;
    while ( assertion_handles.NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, assertion_handles.$list36 );
      current_$8 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, assertion_handles.$list36 );
      if( assertion_handles.NIL == conses_high.member( current_$8, assertion_handles.$list37, assertion_handles.UNPROVIDED, assertion_handles.UNPROVIDED ) )
      {
        bad = assertion_handles.T;
      }
      if( current_$8 == assertion_handles.$kw5$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( assertion_handles.NIL != bad && assertion_handles.NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, assertion_handles.$list36 );
    }
    final SubLObject progress_message_tail = cdestructuring_bind.property_list_member( assertion_handles.$kw11$PROGRESS_MESSAGE, current );
    final SubLObject progress_message = ( assertion_handles.NIL != progress_message_tail ) ? conses_high.cadr( progress_message_tail ) : assertion_handles.NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( assertion_handles.$kw6$DONE, current );
    final SubLObject done = ( assertion_handles.NIL != done_tail ) ? conses_high.cadr( done_tail ) : assertion_handles.NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject start = assertion_handles.$sym41$START;
    return ConsesLow.list( assertion_handles.$sym13$CLET, ConsesLow.list( reader.bq_cons( start, assertion_handles.$list39 ) ), ConsesLow.listS(
        assertion_handles.$sym42$DO_KB_SUID_TABLE_STARTING_AT_ID, ConsesLow.list( assertion, assertion_handles.$list10, start, assertion_handles.$kw11$PROGRESS_MESSAGE,
            progress_message, assertion_handles.$kw6$DONE, done ), ConsesLow.append( body, assertion_handles.NIL ) ) );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertion-handles.lisp",
    position = 10330L)
  public static SubLObject get_file_backed_assertion_internal_id_threshold()
  {
    if( assertion_handles.NIL != Filesys.directory_p( misc_utilities.generic_caches_directory() ) )
    {
      return dumper.get_exclusive_assertion_internal_id_limit_for_kb( misc_utilities.generic_caches_directory() );
    }
    return assertion_handles.ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertion-handles.lisp",
    position = 11034L)
  public static SubLObject assertion_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_assertion( v_object, stream, assertion_handles.ZERO_INTEGER );
    return assertion_handles.NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertion-handles.lisp",
    position = 11034L)
  public static SubLObject assertion_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $assertion_native.class ) ? assertion_handles.T : assertion_handles.NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertion-handles.lisp",
    position = 11034L)
  public static SubLObject as_id(final SubLObject v_object)
  {
    assert assertion_handles.NIL != assertion_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertion-handles.lisp",
    position = 11034L)
  public static SubLObject _csetf_as_id(final SubLObject v_object, final SubLObject value)
  {
    assert assertion_handles.NIL != assertion_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertion-handles.lisp",
    position = 11034L)
  public static SubLObject make_assertion(SubLObject arglist)
  {
    if( arglist == assertion_handles.UNPROVIDED )
    {
      arglist = assertion_handles.NIL;
    }
    final SubLObject v_new = new $assertion_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = assertion_handles.NIL, next = arglist; assertion_handles.NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( assertion_handles.$kw55$ID ) )
      {
        _csetf_as_id( v_new, current_value );
      }
      else
      {
        Errors.error( assertion_handles.$str56$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertion-handles.lisp",
    position = 11034L)
  public static SubLObject visit_defstruct_assertion(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, assertion_handles.$kw57$BEGIN, assertion_handles.$sym58$MAKE_ASSERTION, assertion_handles.ONE_INTEGER );
    Functions.funcall( visitor_fn, obj, assertion_handles.$kw59$SLOT, assertion_handles.$kw55$ID, as_id( obj ) );
    Functions.funcall( visitor_fn, obj, assertion_handles.$kw60$END, assertion_handles.$sym58$MAKE_ASSERTION, assertion_handles.ONE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertion-handles.lisp",
    position = 11034L)
  public static SubLObject visit_defstruct_object_assertion_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_assertion( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertion-handles.lisp",
    position = 11249L)
  public static SubLObject print_assertion(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( assertion_handles.NIL != valid_assertionP( v_object, assertion_handles.UNPROVIDED ) )
    {
      final SubLObject cnf = assertions_high.possibly_assertion_cnf( v_object );
      if( assertion_handles.NIL != cnf )
      {
        final SubLObject _prev_bind_0 = control_vars.$variable_names$.currentBinding( thread );
        final SubLObject _prev_bind_2 = control_vars.$assertion_truth$.currentBinding( thread );
        try
        {
          control_vars.$variable_names$.bind( assertions_high.assertion_variable_names( v_object ), thread );
          control_vars.$assertion_truth$.bind( assertions_high.assertion_truth( v_object ), thread );
          final SubLObject formula_data = ( assertion_handles.NIL != assertion_handles.$print_assertions_in_cnf$.getDynamicValue( thread ) ) ? czer_utilities.possibly_escape_quote_hl_vars( cnf,
              assertion_handles.UNPROVIDED ) : clauses.cnf_formula( cnf, control_vars.$assertion_truth$.getDynamicValue( thread ) );
          final SubLObject formula_mt = assertions_high.assertion_mt( v_object );
          PrintLow.format( stream, assertion_handles.$str62$__AS__S__S_, formula_data, formula_mt );
        }
        finally
        {
          control_vars.$assertion_truth$.rebind( _prev_bind_2, thread );
          control_vars.$variable_names$.rebind( _prev_bind_0, thread );
        }
      }
      else
      {
        final SubLObject assertion_id = assertion_id( v_object );
        PrintLow.format( stream, assertion_handles.$str63$__AS__S_, assertion_id );
      }
    }
    else if( v_object.eql( cfasl_kb_methods.cfasl_invalid_assertion() ) )
    {
      PrintLow.format( stream, assertion_handles.$str64$_The_CFASL_invalid_assertion_ );
    }
    else
    {
      compatibility.default_struct_print_function( v_object, stream, depth );
    }
    return v_object;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertion-handles.lisp",
    position = 12074L)
  public static SubLObject sxhash_assertion_method(final SubLObject v_object)
  {
    final SubLObject id = as_id( v_object );
    if( id.isInteger() )
    {
      return id;
    }
    return assertion_handles.$int65$23;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertion-handles.lisp",
    position = 12202L)
  public static SubLObject get_assertion()
  {
    SubLObject assertion = assertion_handles.NIL;
    assertion = make_assertion( assertion_handles.UNPROVIDED );
    return assertion;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertion-handles.lisp",
    position = 12430L)
  public static SubLObject free_assertion(final SubLObject assertion)
  {
    _csetf_as_id( assertion, assertion_handles.NIL );
    return assertion;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertion-handles.lisp",
    position = 12722L)
  public static SubLObject valid_assertion_handleP(final SubLObject v_object)
  {
    return SubLObjectFactory.makeBoolean( assertion_handles.NIL != assertion_p( v_object ) && assertion_handles.NIL != assertion_handle_validP( v_object ) );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertion-handles.lisp",
    position = 12900L)
  public static SubLObject valid_assertionP(final SubLObject assertion, SubLObject robustP)
  {
    if( robustP == assertion_handles.UNPROVIDED )
    {
      robustP = assertion_handles.NIL;
    }
    return valid_assertion_handleP( assertion );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertion-handles.lisp",
    position = 13094L)
  public static SubLObject assertion_has_contentP(final SubLObject assertion)
  {
    return SubLObjectFactory.makeBoolean( assertion_handles.NIL != valid_assertion_handleP( assertion ) && assertion_handles.NIL != list_utilities.sublisp_boolean( assertion_manager.lookup_assertion_content(
        assertion_id( assertion ) ) ) );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertion-handles.lisp",
    position = 13265L)
  public static SubLObject assertion_id_p(final SubLObject v_object)
  {
    return Types.integerp( v_object );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertion-handles.lisp",
    position = 13332L)
  public static SubLObject mark_available_assertions(final SubLObject max_id, SubLObject deleted_set)
  {
    if( deleted_set == assertion_handles.UNPROVIDED )
    {
      deleted_set = assertion_handles.NIL;
    }
    id_index.fill_id_index_dense_space( assertion_handles.$assertion_from_id$.getGlobalValue(), assertion_handles.$kw17$PAGED_OUT, max_id );
    if( assertion_handles.NIL != set.set_p( deleted_set ) )
    {
      final SubLObject set_contents_var = set.do_set_internal( deleted_set );
      SubLObject basis_object;
      SubLObject state;
      SubLObject deleted_id;
      for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = assertion_handles.NIL, state = set_contents.do_set_contents_initial_state( basis_object,
          set_contents_var ); assertion_handles.NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
      {
        deleted_id = set_contents.do_set_contents_next( basis_object, state );
        if( assertion_handles.NIL != set_contents.do_set_contents_element_validP( state, deleted_id ) )
        {
          id_index.id_index_remove( assertion_handles.$assertion_from_id$.getGlobalValue(), deleted_id );
        }
      }
    }
    return max_id;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertion-handles.lisp",
    position = 13634L)
  public static SubLObject make_assertion_shell(SubLObject id)
  {
    if( id == assertion_handles.UNPROVIDED )
    {
      id = assertion_handles.NIL;
    }
    if( assertion_handles.NIL == id )
    {
      id = make_assertion_id();
    }
    assert assertion_handles.NIL != Types.fixnump( id ) : id;
    final SubLObject assertion = get_assertion();
    register_assertion_id( assertion, id );
    return assertion;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertion-handles.lisp",
    position = 13947L)
  public static SubLObject create_sample_invalid_assertion()
  {
    return get_assertion();
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertion-handles.lisp",
    position = 14084L)
  public static SubLObject partition_create_invalid_assertion()
  {
    return make_assertion_shell( assertion_handles.UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertion-handles.lisp",
    position = 14312L)
  public static SubLObject free_all_assertions()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject idx = do_assertions_table();
    final SubLObject mess = assertion_handles.$str71$Freeing_assertions;
    final SubLObject total = id_index.id_index_count( idx );
    SubLObject sofar = assertion_handles.ZERO_INTEGER;
    assert assertion_handles.NIL != Types.stringp( mess ) : mess;
    final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$last_percent_progress_index$.bind( assertion_handles.ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( assertion_handles.NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( assertion_handles.T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( mess );
        final SubLObject idx_$9 = idx;
        if( assertion_handles.NIL == id_index.id_index_objects_empty_p( idx_$9, assertion_handles.$kw35$SKIP ) )
        {
          final SubLObject idx_$10 = idx_$9;
          if( assertion_handles.NIL == id_index.id_index_dense_objects_empty_p( idx_$10, assertion_handles.$kw35$SKIP ) )
          {
            final SubLObject vector_var = id_index.id_index_dense_objects( idx_$10 );
            final SubLObject backwardP_var = assertion_handles.NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject a_id;
            SubLObject a_handle;
            SubLObject assertion;
            for( length = Sequences.length( vector_var ), v_iteration = assertion_handles.NIL, v_iteration = assertion_handles.ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers
                .add( v_iteration, assertion_handles.ONE_INTEGER ) )
            {
              a_id = ( ( assertion_handles.NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, assertion_handles.ONE_INTEGER ) : v_iteration );
              a_handle = Vectors.aref( vector_var, a_id );
              if( assertion_handles.NIL == id_index.id_index_tombstone_p( a_handle ) || assertion_handles.NIL == id_index.id_index_skip_tombstones_p( assertion_handles.$kw35$SKIP ) )
              {
                if( assertion_handles.NIL != id_index.id_index_tombstone_p( a_handle ) )
                {
                  a_handle = assertion_handles.$kw35$SKIP;
                }
                assertion = resolve_assertion_id_value_pair( a_id, a_handle );
                free_assertion( assertion );
                sofar = Numbers.add( sofar, assertion_handles.ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
            }
          }
          final SubLObject idx_$11 = idx_$9;
          if( assertion_handles.NIL == id_index.id_index_sparse_objects_empty_p( idx_$11 ) || assertion_handles.NIL == id_index.id_index_skip_tombstones_p( assertion_handles.$kw35$SKIP ) )
          {
            final SubLObject sparse = id_index.id_index_sparse_objects( idx_$11 );
            SubLObject a_id2 = id_index.id_index_sparse_id_threshold( idx_$11 );
            final SubLObject end_id = id_index.id_index_next_id( idx_$11 );
            final SubLObject v_default = ( assertion_handles.NIL != id_index.id_index_skip_tombstones_p( assertion_handles.$kw35$SKIP ) ) ? assertion_handles.NIL
                : assertion_handles.$kw35$SKIP;
            while ( a_id2.numL( end_id ))
            {
              final SubLObject a_handle2 = Hashtables.gethash_without_values( a_id2, sparse, v_default );
              if( assertion_handles.NIL == id_index.id_index_skip_tombstones_p( assertion_handles.$kw35$SKIP ) || assertion_handles.NIL == id_index.id_index_tombstone_p( a_handle2 ) )
              {
                final SubLObject assertion2 = resolve_assertion_id_value_pair( a_id2, a_handle2 );
                free_assertion( assertion2 );
                sofar = Numbers.add( sofar, assertion_handles.ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
              a_id2 = Numbers.add( a_id2, assertion_handles.ONE_INTEGER );
            }
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( assertion_handles.T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$12, thread );
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
    clear_assertion_table();
    assertion_manager.clear_assertion_content_table();
    return assertion_handles.NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertion-handles.lisp",
    position = 14525L)
  public static SubLObject assertion_id(final SubLObject assertion)
  {
    enforceType( assertion, assertion_handles.$sym44$ASSERTION_P );
    return as_id( assertion );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertion-handles.lisp",
    position = 14769L)
  public static SubLObject reset_assertion_id(final SubLObject assertion, final SubLObject new_id)
  {
    _csetf_as_id( assertion, new_id );
    return assertion;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertion-handles.lisp",
    position = 15106L)
  public static SubLObject assertion_handle_validP(final SubLObject assertion)
  {
    return Types.integerp( as_id( assertion ) );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertion-handles.lisp",
    position = 15450L)
  public static SubLObject find_assertion_by_id(final SubLObject id)
  {
    enforceType( id, assertion_handles.$sym76$INTEGERP );
    return lookup_assertion( id );
  }

  public static SubLObject declare_assertion_handles_file()
  {
    SubLFiles.declareFunction( myName, "new_assertions_iterator", "NEW-ASSERTIONS-ITERATOR", 0, 0, false );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.assertion_handles", "do_assertions", "DO-ASSERTIONS" );
    SubLFiles.declareFunction( myName, "resolve_assertion_id_value_pair", "RESOLVE-ASSERTION-ID-VALUE-PAIR", 2, 0, false );
    SubLFiles.declareFunction( myName, "do_assertions_table", "DO-ASSERTIONS-TABLE", 0, 0, false );
    SubLFiles.declareFunction( myName, "new_new_assertions_iterator", "NEW-NEW-ASSERTIONS-ITERATOR", 0, 0, false );
    SubLFiles.declareFunction( myName, "new_assertions_table_entryP", "NEW-ASSERTIONS-TABLE-ENTRY?", 2, 0, false );
    SubLFiles.declareFunction( myName, "assertions_table_tuple_to_assertion", "ASSERTIONS-TABLE-TUPLE-TO-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( myName, "setup_assertion_table", "SETUP-ASSERTION-TABLE", 2, 0, false );
    SubLFiles.declareFunction( myName, "finalize_assertions", "FINALIZE-ASSERTIONS", 0, 1, false );
    SubLFiles.declareFunction( myName, "optimize_assertion_table", "OPTIMIZE-ASSERTION-TABLE", 0, 0, false );
    SubLFiles.declareFunction( myName, "clear_assertion_table", "CLEAR-ASSERTION-TABLE", 0, 0, false );
    SubLFiles.declareFunction( myName, "create_assertion_dump_id_table", "CREATE-ASSERTION-DUMP-ID-TABLE", 0, 0, false );
    SubLFiles.declareFunction( myName, "new_dense_assertion_id_index", "NEW-DENSE-ASSERTION-ID-INDEX", 0, 0, false );
    SubLFiles.declareFunction( myName, "assertion_count", "ASSERTION-COUNT", 0, 0, false );
    SubLFiles.declareFunction( myName, "lookup_assertion", "LOOKUP-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( myName, "next_assertion_id", "NEXT-ASSERTION-ID", 0, 0, false );
    SubLFiles.declareFunction( myName, "set_new_assertion_id_threshold", "SET-NEW-ASSERTION-ID-THRESHOLD", 1, 0, false );
    SubLFiles.declareFunction( myName, "new_assertion_id_threshold", "NEW-ASSERTION-ID-THRESHOLD", 0, 0, false );
    SubLFiles.declareFunction( myName, "old_assertion_count", "OLD-ASSERTION-COUNT", 0, 0, false );
    SubLFiles.declareFunction( myName, "new_assertion_count", "NEW-ASSERTION-COUNT", 0, 0, false );
    SubLFiles.declareFunction( myName, "missing_old_assertion_ids", "MISSING-OLD-ASSERTION-IDS", 0, 0, false );
    SubLFiles.declareFunction( myName, "missing_assertion_id_set", "MISSING-ASSERTION-ID-SET", 0, 0, false );
    SubLFiles.declareFunction( myName, "deleted_assertion_id_iterator", "DELETED-ASSERTION-ID-ITERATOR", 0, 0, false );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.assertion_handles", "do_deleted_assertion_ids", "DO-DELETED-ASSERTION-IDS" );
    SubLFiles.declareFunction( myName, "has_new_assertionsP", "HAS-NEW-ASSERTIONS?", 0, 0, false );
    SubLFiles.declareFunction( myName, "set_next_assertion_id", "SET-NEXT-ASSERTION-ID", 0, 1, false );
    SubLFiles.declareFunction( myName, "register_assertion_id", "REGISTER-ASSERTION-ID", 2, 0, false );
    SubLFiles.declareFunction( myName, "deregister_assertion_id", "DEREGISTER-ASSERTION-ID", 1, 0, false );
    SubLFiles.declareFunction( myName, "make_assertion_id", "MAKE-ASSERTION-ID", 0, 0, false );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.assertion_handles", "do_old_assertions", "DO-OLD-ASSERTIONS" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.assertion_handles", "do_new_assertions", "DO-NEW-ASSERTIONS" );
    SubLFiles.declareFunction( myName, "get_file_backed_assertion_internal_id_threshold", "GET-FILE-BACKED-ASSERTION-INTERNAL-ID-THRESHOLD", 0, 0, false );
    SubLFiles.declareFunction( myName, "assertion_print_function_trampoline", "ASSERTION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( myName, "assertion_p", "ASSERTION-P", 1, 0, false );
    new $assertion_p$UnaryFunction();
    SubLFiles.declareFunction( myName, "as_id", "AS-ID", 1, 0, false );
    SubLFiles.declareFunction( myName, "_csetf_as_id", "_CSETF-AS-ID", 2, 0, false );
    SubLFiles.declareFunction( myName, "make_assertion", "MAKE-ASSERTION", 0, 1, false );
    SubLFiles.declareFunction( myName, "visit_defstruct_assertion", "VISIT-DEFSTRUCT-ASSERTION", 2, 0, false );
    SubLFiles.declareFunction( myName, "visit_defstruct_object_assertion_method", "VISIT-DEFSTRUCT-OBJECT-ASSERTION-METHOD", 2, 0, false );
    SubLFiles.declareFunction( myName, "print_assertion", "PRINT-ASSERTION", 3, 0, false );
    SubLFiles.declareFunction( myName, "sxhash_assertion_method", "SXHASH-ASSERTION-METHOD", 1, 0, false );
    new $sxhash_assertion_method$UnaryFunction();
    SubLFiles.declareFunction( myName, "get_assertion", "GET-ASSERTION", 0, 0, false );
    SubLFiles.declareFunction( myName, "free_assertion", "FREE-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( myName, "valid_assertion_handleP", "VALID-ASSERTION-HANDLE?", 1, 0, false );
    SubLFiles.declareFunction( myName, "valid_assertionP", "VALID-ASSERTION?", 1, 1, false );
    SubLFiles.declareFunction( myName, "assertion_has_contentP", "ASSERTION-HAS-CONTENT?", 1, 0, false );
    SubLFiles.declareFunction( myName, "assertion_id_p", "ASSERTION-ID-P", 1, 0, false );
    SubLFiles.declareFunction( myName, "mark_available_assertions", "MARK-AVAILABLE-ASSERTIONS", 1, 1, false );
    SubLFiles.declareFunction( myName, "make_assertion_shell", "MAKE-ASSERTION-SHELL", 0, 1, false );
    SubLFiles.declareFunction( myName, "create_sample_invalid_assertion", "CREATE-SAMPLE-INVALID-ASSERTION", 0, 0, false );
    SubLFiles.declareFunction( myName, "partition_create_invalid_assertion", "PARTITION-CREATE-INVALID-ASSERTION", 0, 0, false );
    SubLFiles.declareFunction( myName, "free_all_assertions", "FREE-ALL-ASSERTIONS", 0, 0, false );
    SubLFiles.declareFunction( myName, "assertion_id", "ASSERTION-ID", 1, 0, false );
    SubLFiles.declareFunction( myName, "reset_assertion_id", "RESET-ASSERTION-ID", 2, 0, false );
    SubLFiles.declareFunction( myName, "assertion_handle_validP", "ASSERTION-HANDLE-VALID?", 1, 0, false );
    SubLFiles.declareFunction( myName, "find_assertion_by_id", "FIND-ASSERTION-BY-ID", 1, 0, false );
    new $find_assertion_by_id$UnaryFunction();
    return assertion_handles.NIL;
  }

  public static SubLObject init_assertion_handles_file()
  {
    assertion_handles.$assertion_from_id$ = SubLFiles.deflexical( "*ASSERTION-FROM-ID*", ( maybeDefault( assertion_handles.$sym0$_ASSERTION_FROM_ID_, assertion_handles.$assertion_from_id$,
        assertion_handles.NIL ) ) );
    assertion_handles.$new_assertion_id_threshold$ = SubLFiles.deflexical( "*NEW-ASSERTION-ID-THRESHOLD*", ( maybeDefault( assertion_handles.$sym26$_NEW_ASSERTION_ID_THRESHOLD_,
        assertion_handles.$new_assertion_id_threshold$, assertion_handles.NIL ) ) );
    assertion_handles.$dtp_assertion$ = SubLFiles.defconstant( "*DTP-ASSERTION*", assertion_handles.$sym43$ASSERTION );
    assertion_handles.$print_assertions_in_cnf$ = SubLFiles.defparameter( "*PRINT-ASSERTIONS-IN-CNF*", assertion_handles.NIL );
    return assertion_handles.NIL;
  }

  public static SubLObject setup_assertion_handles_file()
  {
    subl_macro_promotions.declare_defglobal( assertion_handles.$sym0$_ASSERTION_FROM_ID_ );
    utilities_macros.register_cyc_api_macro( assertion_handles.$sym15$DO_ASSERTIONS, assertion_handles.$list2, assertion_handles.$str16$Iterate_over_all_HL_assertion_dat );
    access_macros.register_macro_helper( assertion_handles.$sym14$RESOLVE_ASSERTION_ID_VALUE_PAIR, assertion_handles.$sym15$DO_ASSERTIONS );
    access_macros.register_macro_helper( assertion_handles.$sym18$DO_ASSERTIONS_TABLE, assertion_handles.$sym15$DO_ASSERTIONS );
    utilities_macros.note_funcall_helper_function( assertion_handles.$sym19$NEW_ASSERTIONS_TABLE_ENTRY_ );
    utilities_macros.note_funcall_helper_function( assertion_handles.$sym1$ASSERTIONS_TABLE_TUPLE_TO_ASSERTION );
    access_macros.register_macro_helper( assertion_handles.$sym21$CREATE_ASSERTION_DUMP_ID_TABLE, assertion_handles.$sym22$WITH_ASSERTION_DUMP_ID_TABLE );
    utilities_macros.register_cyc_api_function( assertion_handles.$sym23$ASSERTION_COUNT, assertion_handles.NIL, assertion_handles.$str24$Return_the_total_number_of_assert,
        assertion_handles.NIL, assertion_handles.$list25 );
    subl_macro_promotions.declare_defglobal( assertion_handles.$sym26$_NEW_ASSERTION_ID_THRESHOLD_ );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), assertion_handles.$dtp_assertion$.getGlobalValue(), Symbols.symbol_function(
        assertion_handles.$sym51$ASSERTION_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( assertion_handles.$list52 );
    Structures.def_csetf( assertion_handles.$sym53$AS_ID, assertion_handles.$sym54$_CSETF_AS_ID );
    Equality.identity( assertion_handles.$sym43$ASSERTION );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), assertion_handles.$dtp_assertion$.getGlobalValue(), Symbols.symbol_function(
        assertion_handles.$sym61$VISIT_DEFSTRUCT_OBJECT_ASSERTION_METHOD ) );
    Structures.register_method( Sxhash.$sxhash_method_table$.getGlobalValue(), assertion_handles.$dtp_assertion$.getGlobalValue(), Symbols.symbol_function(
        assertion_handles.$sym66$SXHASH_ASSERTION_METHOD ) );
    utilities_macros.register_cyc_api_function( assertion_handles.$sym44$ASSERTION_P, assertion_handles.$list67, assertion_handles.$str68$Return_T_iff_OBJECT_is_an_HL_asse,
        assertion_handles.NIL, assertion_handles.$list69 );
    utilities_macros.register_cyc_api_function( assertion_handles.$sym72$ASSERTION_ID, assertion_handles.$list73, assertion_handles.$str74$Return_the_id_of_this_ASSERTION_,
        assertion_handles.$list75, assertion_handles.$list25 );
    utilities_macros.register_cyc_api_function( assertion_handles.$sym77$FIND_ASSERTION_BY_ID, assertion_handles.$list46, assertion_handles.$str78$Return_the_assertion_with_ID__or_,
        assertion_handles.$list79, assertion_handles.$list80 );
    return assertion_handles.NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_assertion_handles_file();
  }

  @Override
  public void initializeVariables()
  {
    init_assertion_handles_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_assertion_handles_file();
  }
  static
  {
    me = new assertion_handles();
    assertion_handles.$assertion_from_id$ = null;
    assertion_handles.$new_assertion_id_threshold$ = null;
    assertion_handles.$dtp_assertion$ = null;
    assertion_handles.$print_assertions_in_cnf$ = null;
    $sym0$_ASSERTION_FROM_ID_ = SubLObjectFactory.makeSymbol( "*ASSERTION-FROM-ID*" );
    $sym1$ASSERTIONS_TABLE_TUPLE_TO_ASSERTION = SubLObjectFactory.makeSymbol( "ASSERTIONS-TABLE-TUPLE-TO-ASSERTION" );
    $list2 = ConsesLow.list( ConsesLow.list( SubLObjectFactory.makeSymbol( "VAR" ), SubLObjectFactory.makeSymbol( "&OPTIONAL" ), ConsesLow.list(
        SubLObjectFactory.makeSymbol( "PROGRESS-MESSAGE" ), SubLObjectFactory.makeString( "mapping Cyc assertions" ) ), SubLObjectFactory.makeSymbol( "&KEY" ),
        SubLObjectFactory.makeSymbol( "DONE" ) ), SubLObjectFactory.makeSymbol( "&BODY" ), SubLObjectFactory.makeSymbol( "BODY" ) );
    $str3$mapping_Cyc_assertions = SubLObjectFactory.makeString( "mapping Cyc assertions" );
    $list4 = ConsesLow.list( SubLObjectFactory.makeKeyword( "DONE" ) );
    $kw5$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw6$DONE = SubLObjectFactory.makeKeyword( "DONE" );
    $sym7$A_ID = SubLObjectFactory.makeUninternedSymbol( "A-ID" );
    $sym8$A_HANDLE = SubLObjectFactory.makeUninternedSymbol( "A-HANDLE" );
    $sym9$DO_ID_INDEX = SubLObjectFactory.makeSymbol( "DO-ID-INDEX" );
    $list10 = ConsesLow.list( SubLObjectFactory.makeSymbol( "DO-ASSERTIONS-TABLE" ) );
    $kw11$PROGRESS_MESSAGE = SubLObjectFactory.makeKeyword( "PROGRESS-MESSAGE" );
    $kw12$ORDERED = SubLObjectFactory.makeKeyword( "ORDERED" );
    $sym13$CLET = SubLObjectFactory.makeSymbol( "CLET" );
    $sym14$RESOLVE_ASSERTION_ID_VALUE_PAIR = SubLObjectFactory.makeSymbol( "RESOLVE-ASSERTION-ID-VALUE-PAIR" );
    $sym15$DO_ASSERTIONS = SubLObjectFactory.makeSymbol( "DO-ASSERTIONS" );
    $str16$Iterate_over_all_HL_assertion_dat = SubLObjectFactory.makeString(
        "Iterate over all HL assertion datastructures, executing BODY within the scope of VAR.\n   VAR is bound to the assertion.\n   PROGRESS-MESSAGE is a progress message string.\n   Iteration halts early as soon as DONE becomes non-nil." );
    $kw17$PAGED_OUT = SubLObjectFactory.makeKeyword( "PAGED-OUT" );
    $sym18$DO_ASSERTIONS_TABLE = SubLObjectFactory.makeSymbol( "DO-ASSERTIONS-TABLE" );
    $sym19$NEW_ASSERTIONS_TABLE_ENTRY_ = SubLObjectFactory.makeSymbol( "NEW-ASSERTIONS-TABLE-ENTRY?" );
    $list20 = ConsesLow.list( SubLObjectFactory.makeSymbol( "ID" ), SubLObjectFactory.makeSymbol( "PAYLOAD" ) );
    $sym21$CREATE_ASSERTION_DUMP_ID_TABLE = SubLObjectFactory.makeSymbol( "CREATE-ASSERTION-DUMP-ID-TABLE" );
    $sym22$WITH_ASSERTION_DUMP_ID_TABLE = SubLObjectFactory.makeSymbol( "WITH-ASSERTION-DUMP-ID-TABLE" );
    $sym23$ASSERTION_COUNT = SubLObjectFactory.makeSymbol( "ASSERTION-COUNT" );
    $str24$Return_the_total_number_of_assert = SubLObjectFactory.makeString( "Return the total number of assertions." );
    $list25 = ConsesLow.list( SubLObjectFactory.makeSymbol( "INTEGERP" ) );
    $sym26$_NEW_ASSERTION_ID_THRESHOLD_ = SubLObjectFactory.makeSymbol( "*NEW-ASSERTION-ID-THRESHOLD*" );
    $kw27$DENSE = SubLObjectFactory.makeKeyword( "DENSE" );
    $kw28$ALL = SubLObjectFactory.makeKeyword( "ALL" );
    $list29 = ConsesLow.list( ConsesLow.list( SubLObjectFactory.makeSymbol( "ID" ), SubLObjectFactory.makeSymbol( "&KEY" ), SubLObjectFactory.makeSymbol( "DONE" ) ),
        SubLObjectFactory.makeSymbol( "&BODY" ), SubLObjectFactory.makeSymbol( "BODY" ) );
    $sym30$ITERATOR = SubLObjectFactory.makeUninternedSymbol( "ITERATOR" );
    $list31 = ConsesLow.list( ConsesLow.list( SubLObjectFactory.makeSymbol( "DELETED-ASSERTION-ID-ITERATOR" ) ) );
    $sym32$DO_ITERATOR = SubLObjectFactory.makeSymbol( "DO-ITERATOR" );
    $str33$Determining_maximum_assertion_ID = SubLObjectFactory.makeString( "Determining maximum assertion ID" );
    $sym34$STRINGP = SubLObjectFactory.makeSymbol( "STRINGP" );
    $kw35$SKIP = SubLObjectFactory.makeKeyword( "SKIP" );
    $list36 = ConsesLow.list( ConsesLow.list( SubLObjectFactory.makeSymbol( "ASSERTION" ), SubLObjectFactory.makeSymbol( "&KEY" ), SubLObjectFactory.makeSymbol(
        "PROGRESS-MESSAGE" ), SubLObjectFactory.makeSymbol( "DONE" ) ), SubLObjectFactory.makeSymbol( "&BODY" ), SubLObjectFactory.makeSymbol( "BODY" ) );
    $list37 = ConsesLow.list( SubLObjectFactory.makeKeyword( "PROGRESS-MESSAGE" ), SubLObjectFactory.makeKeyword( "DONE" ) );
    $sym38$THRESHOLD = SubLObjectFactory.makeUninternedSymbol( "THRESHOLD" );
    $list39 = ConsesLow.list( ConsesLow.list( SubLObjectFactory.makeSymbol( "GET-FILE-BACKED-ASSERTION-INTERNAL-ID-THRESHOLD" ) ) );
    $sym40$DO_KB_SUID_TABLE_UPTO_EXCLUDING_ID = SubLObjectFactory.makeSymbol( "DO-KB-SUID-TABLE-UPTO-EXCLUDING-ID" );
    $sym41$START = SubLObjectFactory.makeUninternedSymbol( "START" );
    $sym42$DO_KB_SUID_TABLE_STARTING_AT_ID = SubLObjectFactory.makeSymbol( "DO-KB-SUID-TABLE-STARTING-AT-ID" );
    $sym43$ASSERTION = SubLObjectFactory.makeSymbol( "ASSERTION" );
    $sym44$ASSERTION_P = SubLObjectFactory.makeSymbol( "ASSERTION-P" );
    $int45$141 = SubLObjectFactory.makeInteger( 141 );
    $list46 = ConsesLow.list( SubLObjectFactory.makeSymbol( "ID" ) );
    $list47 = ConsesLow.list( SubLObjectFactory.makeKeyword( "ID" ) );
    $list48 = ConsesLow.list( SubLObjectFactory.makeSymbol( "AS-ID" ) );
    $list49 = ConsesLow.list( SubLObjectFactory.makeSymbol( "_CSETF-AS-ID" ) );
    $sym50$PRINT_ASSERTION = SubLObjectFactory.makeSymbol( "PRINT-ASSERTION" );
    $sym51$ASSERTION_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol( "ASSERTION-PRINT-FUNCTION-TRAMPOLINE" );
    $list52 = ConsesLow.list( SubLObjectFactory.makeSymbol( "OPTIMIZE-FUNCALL" ), SubLObjectFactory.makeSymbol( "ASSERTION-P" ) );
    $sym53$AS_ID = SubLObjectFactory.makeSymbol( "AS-ID" );
    $sym54$_CSETF_AS_ID = SubLObjectFactory.makeSymbol( "_CSETF-AS-ID" );
    $kw55$ID = SubLObjectFactory.makeKeyword( "ID" );
    $str56$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString( "Invalid slot ~S for construction function" );
    $kw57$BEGIN = SubLObjectFactory.makeKeyword( "BEGIN" );
    $sym58$MAKE_ASSERTION = SubLObjectFactory.makeSymbol( "MAKE-ASSERTION" );
    $kw59$SLOT = SubLObjectFactory.makeKeyword( "SLOT" );
    $kw60$END = SubLObjectFactory.makeKeyword( "END" );
    $sym61$VISIT_DEFSTRUCT_OBJECT_ASSERTION_METHOD = SubLObjectFactory.makeSymbol( "VISIT-DEFSTRUCT-OBJECT-ASSERTION-METHOD" );
    $str62$__AS__S__S_ = SubLObjectFactory.makeString( "#<AS:~S:~S>" );
    $str63$__AS__S_ = SubLObjectFactory.makeString( "#<AS:~S>" );
    $str64$_The_CFASL_invalid_assertion_ = SubLObjectFactory.makeString( "<The CFASL invalid assertion>" );
    $int65$23 = SubLObjectFactory.makeInteger( 23 );
    $sym66$SXHASH_ASSERTION_METHOD = SubLObjectFactory.makeSymbol( "SXHASH-ASSERTION-METHOD" );
    $list67 = ConsesLow.list( SubLObjectFactory.makeSymbol( "OBJECT" ) );
    $str68$Return_T_iff_OBJECT_is_an_HL_asse = SubLObjectFactory.makeString( "Return T iff OBJECT is an HL assertion" );
    $list69 = ConsesLow.list( SubLObjectFactory.makeSymbol( "BOOLEANP" ) );
    $sym70$FIXNUMP = SubLObjectFactory.makeSymbol( "FIXNUMP" );
    $str71$Freeing_assertions = SubLObjectFactory.makeString( "Freeing assertions" );
    $sym72$ASSERTION_ID = SubLObjectFactory.makeSymbol( "ASSERTION-ID" );
    $list73 = ConsesLow.list( SubLObjectFactory.makeSymbol( "ASSERTION" ) );
    $str74$Return_the_id_of_this_ASSERTION_ = SubLObjectFactory.makeString( "Return the id of this ASSERTION." );
    $list75 = ConsesLow.list( ConsesLow.list( SubLObjectFactory.makeSymbol( "ASSERTION" ), SubLObjectFactory.makeSymbol( "ASSERTION-P" ) ) );
    $sym76$INTEGERP = SubLObjectFactory.makeSymbol( "INTEGERP" );
    $sym77$FIND_ASSERTION_BY_ID = SubLObjectFactory.makeSymbol( "FIND-ASSERTION-BY-ID" );
    $str78$Return_the_assertion_with_ID__or_ = SubLObjectFactory.makeString( "Return the assertion with ID, or NIL if not present." );
    $list79 = ConsesLow.list( ConsesLow.list( SubLObjectFactory.makeSymbol( "ID" ), SubLObjectFactory.makeSymbol( "INTEGERP" ) ) );
    $list80 = ConsesLow.list( ConsesLow.list( SubLObjectFactory.makeSymbol( "NIL-OR" ), SubLObjectFactory.makeSymbol( "ASSERTION-P" ) ) );
  }

  static public final class $assertion_native extends SubLStructNative
  {
    public SubLObject $id;
    private static final SubLStructDeclNative structDecl;

    public $assertion_native()
    {
      this.$id = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $assertion_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$id;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$id = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $assertion_native.class, assertion_handles.$sym43$ASSERTION, assertion_handles.$sym44$ASSERTION_P, assertion_handles.$list46, assertion_handles.$list47,
          new String[]
          { "$id"
          }, assertion_handles.$list48, assertion_handles.$list49, assertion_handles.$sym50$PRINT_ASSERTION );
    }
  }

  public static final class $assertion_p$UnaryFunction extends UnaryFunction
  {
    public $assertion_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "ASSERTION-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return assertion_handles.assertion_p( arg1 );
    }
  }

  public static final class $sxhash_assertion_method$UnaryFunction extends UnaryFunction
  {
    public $sxhash_assertion_method$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "SXHASH-ASSERTION-METHOD" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return assertion_handles.sxhash_assertion_method( arg1 );
    }
  }

  public static final class $find_assertion_by_id$UnaryFunction extends UnaryFunction
  {
    public $find_assertion_by_id$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "FIND-ASSERTION-BY-ID" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return assertion_handles.find_assertion_by_id( arg1 );
    }
  }
}
