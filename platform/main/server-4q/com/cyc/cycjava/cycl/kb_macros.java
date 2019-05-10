package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class kb_macros
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.kb_macros";
  public static final String myFingerPrint = "55aece63e0105bd6f3e1aa4e4b8677e58df21100db93bdd27b005c9f8158ae47";
  private static final SubLList $list0;
  private static final SubLList $list1;
  private static final SubLSymbol $kw2$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw3$PROGRESS_MESSAGE;
  private static final SubLSymbol $kw4$DONE;
  private static final SubLSymbol $sym5$ID;
  private static final SubLSymbol $sym6$DO_ID_INDEX;
  private static final SubLSymbol $kw7$ORDERED;
  private static final SubLSymbol $sym8$IGNORE;
  private static final SubLSymbol $sym9$ID;
  private static final SubLSymbol $sym10$DO_ID_INDEX_DENSE_OBJECTS;
  private static final SubLList $list11;
  private static final SubLList $list12;
  private static final SubLSymbol $sym13$ID;
  private static final SubLSymbol $sym14$DO_ID_INDEX_SPARSE_OBJECTS;
  private static final SubLList $list15;
  private static final SubLSymbol $sym16$ID;
  private static final SubLSymbol $sym17$PAST_IDS;
  private static final SubLSymbol $sym18$MY_DONE;
  private static final SubLSymbol $sym19$CLET;
  private static final SubLSymbol $sym20$_;
  private static final SubLSymbol $sym21$PUNLESS;
  private static final SubLSymbol $sym22$CSETQ;
  private static final SubLSymbol $sym23$COR;
  private static final SubLList $list24;
  private static final SubLSymbol $sym25$TABLE_VAR;
  private static final SubLSymbol $sym26$DO_KB_SUID_TABLE_STARTING_AT_ID;
  private static final SubLSymbol $sym27$FIRST_ID_VAR;
  private static final SubLSymbol $sym28$PROGRESS_MESSAGE_VAR;
  private static final SubLSymbol $sym29$SOFAR;
  private static final SubLSymbol $sym30$TOTAL;
  private static final SubLSymbol $sym31$_;
  private static final SubLSymbol $sym32$ID_INDEX_NEXT_ID;
  private static final SubLList $list33;
  private static final SubLSymbol $sym34$NOTING_PERCENT_PROGRESS;
  private static final SubLSymbol $sym35$NOTE_PERCENT_PROGRESS;
  private static final SubLSymbol $sym36$CINC;
  private static final SubLSymbol $sym37$END;
  private static final SubLSymbol $sym38$ID;
  private static final SubLSymbol $sym39$DO_NUMBERS;
  private static final SubLSymbol $kw40$START;
  private static final SubLSymbol $kw41$END;
  private static final SubLSymbol $kw42$DELTA;
  private static final SubLSymbol $sym43$ID_INDEX_LOOKUP;
  private static final SubLSymbol $sym44$PWHEN;
  private static final SubLList $list45;

  @SubLTranslatedFile.SubL(source = "cycl/kb-macros.lisp", position = 745L)
  public static SubLObject do_kb_suid_table(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject table = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    table = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list0 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list0 );
      if( NIL == conses_high.member( current_$1, $list1, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw2$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
    }
    final SubLObject progress_message_tail = cdestructuring_bind.property_list_member( $kw3$PROGRESS_MESSAGE, current );
    final SubLObject progress_message = ( NIL != progress_message_tail ) ? conses_high.cadr( progress_message_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw4$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject id = $sym5$ID;
    return ConsesLow.listS( $sym6$DO_ID_INDEX, ConsesLow.list( new SubLObject[] { id, var, table, $kw7$ORDERED, T, $kw3$PROGRESS_MESSAGE, progress_message, $kw4$DONE, done
    } ), ConsesLow.list( $sym8$IGNORE, id ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-macros.lisp", position = 1081L)
  public static SubLObject do_kb_suid_table_dense_objects(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject table = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    table = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$2 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list0 );
      current_$2 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list0 );
      if( NIL == conses_high.member( current_$2, $list1, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$2 == $kw2$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
    }
    final SubLObject progress_message_tail = cdestructuring_bind.property_list_member( $kw3$PROGRESS_MESSAGE, current );
    final SubLObject progress_message = ( NIL != progress_message_tail ) ? conses_high.cadr( progress_message_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw4$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject id = $sym9$ID;
    return ConsesLow.listS( $sym10$DO_ID_INDEX_DENSE_OBJECTS, ConsesLow.list( id, var, table, $kw3$PROGRESS_MESSAGE, progress_message, $kw4$DONE, done ), ConsesLow.list( $sym8$IGNORE, id ), ConsesLow.append( body,
        NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-macros.lisp", position = 1345L)
  public static SubLObject do_kb_suid_table_sparse_objects(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list11 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject table = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list11 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list11 );
    table = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$3 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list11 );
      current_$3 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list11 );
      if( NIL == conses_high.member( current_$3, $list12, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$3 == $kw2$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list11 );
    }
    final SubLObject ordered_tail = cdestructuring_bind.property_list_member( $kw7$ORDERED, current );
    final SubLObject ordered = ( NIL != ordered_tail ) ? conses_high.cadr( ordered_tail ) : NIL;
    final SubLObject progress_message_tail = cdestructuring_bind.property_list_member( $kw3$PROGRESS_MESSAGE, current );
    final SubLObject progress_message = ( NIL != progress_message_tail ) ? conses_high.cadr( progress_message_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw4$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject id = $sym13$ID;
    return ConsesLow.listS( $sym14$DO_ID_INDEX_SPARSE_OBJECTS, ConsesLow.list( new SubLObject[] { id, var, table, $kw7$ORDERED, ordered, $kw3$PROGRESS_MESSAGE, progress_message, $kw4$DONE, done
    } ), ConsesLow.list( $sym8$IGNORE, id ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-macros.lisp", position = 1637L)
  public static SubLObject do_kb_suid_table_upto_excluding_id(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list15 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject table = NIL;
    SubLObject threshold_id = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list15 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list15 );
    table = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list15 );
    threshold_id = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$4 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list15 );
      current_$4 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list15 );
      if( NIL == conses_high.member( current_$4, $list1, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$4 == $kw2$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list15 );
    }
    final SubLObject progress_message_tail = cdestructuring_bind.property_list_member( $kw3$PROGRESS_MESSAGE, current );
    final SubLObject progress_message = ( NIL != progress_message_tail ) ? conses_high.cadr( progress_message_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw4$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject id = $sym16$ID;
    final SubLObject past_ids = $sym17$PAST_IDS;
    final SubLObject my_done = $sym18$MY_DONE;
    return ConsesLow.list( $sym19$CLET, ConsesLow.list( past_ids, my_done ), ConsesLow.list( $sym6$DO_ID_INDEX, ConsesLow.list( new SubLObject[] { id, var, table, $kw7$ORDERED, T, $kw3$PROGRESS_MESSAGE, progress_message,
      $kw4$DONE, my_done
    } ), ConsesLow.list( $sym19$CLET, ConsesLow.list( ConsesLow.list( past_ids, ConsesLow.list( $sym20$_, threshold_id, id ) ) ), ConsesLow.listS( $sym21$PUNLESS, past_ids, ConsesLow.append( body, NIL ) ), ConsesLow
        .list( $sym22$CSETQ, my_done, ConsesLow.list( $sym23$COR, done, past_ids ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-macros.lisp", position = 2153L)
  public static SubLObject do_kb_suid_table_starting_at_id(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list24 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject table = NIL;
    SubLObject first_id = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list24 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list24 );
    table = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list24 );
    first_id = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$5 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list24 );
      current_$5 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list24 );
      if( NIL == conses_high.member( current_$5, $list1, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$5 == $kw2$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list24 );
    }
    final SubLObject progress_message_tail = cdestructuring_bind.property_list_member( $kw3$PROGRESS_MESSAGE, current );
    final SubLObject progress_message = ( NIL != progress_message_tail ) ? conses_high.cadr( progress_message_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw4$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    if( !table.isAtom() )
    {
      final SubLObject table_var = $sym25$TABLE_VAR;
      return ConsesLow.list( $sym19$CLET, ConsesLow.list( ConsesLow.list( table_var, table ) ), ConsesLow.listS( $sym26$DO_KB_SUID_TABLE_STARTING_AT_ID, ConsesLow.list( var, table_var, first_id, $kw3$PROGRESS_MESSAGE,
          progress_message, $kw4$DONE, done ), ConsesLow.append( body, NIL ) ) );
    }
    if( !first_id.isAtom() )
    {
      final SubLObject first_id_var = $sym27$FIRST_ID_VAR;
      return ConsesLow.list( $sym19$CLET, ConsesLow.list( ConsesLow.list( first_id_var, first_id ) ), ConsesLow.listS( $sym26$DO_KB_SUID_TABLE_STARTING_AT_ID, ConsesLow.list( var, table, first_id_var,
          $kw3$PROGRESS_MESSAGE, progress_message, $kw4$DONE, done ), ConsesLow.append( body, NIL ) ) );
    }
    if( !progress_message.isAtom() )
    {
      final SubLObject progress_message_var = $sym28$PROGRESS_MESSAGE_VAR;
      return ConsesLow.list( $sym19$CLET, ConsesLow.list( ConsesLow.list( progress_message_var, progress_message ) ), ConsesLow.listS( $sym26$DO_KB_SUID_TABLE_STARTING_AT_ID, ConsesLow.list( var, table, first_id,
          $kw3$PROGRESS_MESSAGE, progress_message_var, $kw4$DONE, done ), ConsesLow.append( body, NIL ) ) );
    }
    if( NIL != progress_message )
    {
      final SubLObject sofar = $sym29$SOFAR;
      final SubLObject total = $sym30$TOTAL;
      return ConsesLow.list( $sym19$CLET, ConsesLow.list( ConsesLow.list( total, ConsesLow.list( $sym31$_, ConsesLow.list( $sym32$ID_INDEX_NEXT_ID, table ), first_id ) ), reader.bq_cons( sofar, $list33 ) ), ConsesLow
          .list( $sym34$NOTING_PERCENT_PROGRESS, progress_message, ConsesLow.listS( $sym26$DO_KB_SUID_TABLE_STARTING_AT_ID, ConsesLow.list( var, table, first_id, $kw4$DONE, done ), ConsesLow.list(
              $sym35$NOTE_PERCENT_PROGRESS, sofar, total ), ConsesLow.list( $sym36$CINC, sofar ), ConsesLow.append( body, NIL ) ) ) );
    }
    final SubLObject end = $sym37$END;
    final SubLObject id = $sym38$ID;
    return ConsesLow.list( $sym19$CLET, ConsesLow.list( ConsesLow.list( end, ConsesLow.list( $sym32$ID_INDEX_NEXT_ID, table ) ) ), ConsesLow.list( $sym39$DO_NUMBERS, ConsesLow.list( new SubLObject[] { id, $kw40$START,
      first_id, $kw41$END, end, $kw42$DELTA, ONE_INTEGER, $kw4$DONE, done
    } ), ConsesLow.list( $sym19$CLET, ConsesLow.list( ConsesLow.list( var, ConsesLow.list( $sym43$ID_INDEX_LOOKUP, table, id ) ) ), ConsesLow.listS( $sym44$PWHEN, var, ConsesLow.append( body, NIL ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-macros.lisp", position = 3988L)
  public static SubLObject with_normal_kb_object_lookup_assumptions(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym19$CLET, $list45, ConsesLow.append( body, NIL ) );
  }

  public static SubLObject declare_kb_macros_file()
  {
    SubLFiles.declareMacro( me, "do_kb_suid_table", "DO-KB-SUID-TABLE" );
    SubLFiles.declareMacro( me, "do_kb_suid_table_dense_objects", "DO-KB-SUID-TABLE-DENSE-OBJECTS" );
    SubLFiles.declareMacro( me, "do_kb_suid_table_sparse_objects", "DO-KB-SUID-TABLE-SPARSE-OBJECTS" );
    SubLFiles.declareMacro( me, "do_kb_suid_table_upto_excluding_id", "DO-KB-SUID-TABLE-UPTO-EXCLUDING-ID" );
    SubLFiles.declareMacro( me, "do_kb_suid_table_starting_at_id", "DO-KB-SUID-TABLE-STARTING-AT-ID" );
    SubLFiles.declareMacro( me, "with_normal_kb_object_lookup_assumptions", "WITH-NORMAL-KB-OBJECT-LOOKUP-ASSUMPTIONS" );
    return NIL;
  }

  public static SubLObject init_kb_macros_file()
  {
    return NIL;
  }

  public static SubLObject setup_kb_macros_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_kb_macros_file();
  }

  @Override
  public void initializeVariables()
  {
    init_kb_macros_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_kb_macros_file();
  }
  static
  {
    me = new kb_macros();
    $list0 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "TABLE" ), makeSymbol( "&KEY" ), makeSymbol( "PROGRESS-MESSAGE" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list1 = ConsesLow.list( makeKeyword( "PROGRESS-MESSAGE" ), makeKeyword( "DONE" ) );
    $kw2$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw3$PROGRESS_MESSAGE = makeKeyword( "PROGRESS-MESSAGE" );
    $kw4$DONE = makeKeyword( "DONE" );
    $sym5$ID = makeUninternedSymbol( "ID" );
    $sym6$DO_ID_INDEX = makeSymbol( "DO-ID-INDEX" );
    $kw7$ORDERED = makeKeyword( "ORDERED" );
    $sym8$IGNORE = makeSymbol( "IGNORE" );
    $sym9$ID = makeUninternedSymbol( "ID" );
    $sym10$DO_ID_INDEX_DENSE_OBJECTS = makeSymbol( "DO-ID-INDEX-DENSE-OBJECTS" );
    $list11 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "TABLE" ), makeSymbol( "&KEY" ), makeSymbol( "ORDERED" ), makeSymbol( "PROGRESS-MESSAGE" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ),
        makeSymbol( "BODY" ) );
    $list12 = ConsesLow.list( makeKeyword( "ORDERED" ), makeKeyword( "PROGRESS-MESSAGE" ), makeKeyword( "DONE" ) );
    $sym13$ID = makeUninternedSymbol( "ID" );
    $sym14$DO_ID_INDEX_SPARSE_OBJECTS = makeSymbol( "DO-ID-INDEX-SPARSE-OBJECTS" );
    $list15 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "TABLE" ), makeSymbol( "THRESHOLD-ID" ), makeSymbol( "&KEY" ), makeSymbol( "PROGRESS-MESSAGE" ), makeSymbol( "DONE" ) ), makeSymbol(
        "&BODY" ), makeSymbol( "BODY" ) );
    $sym16$ID = makeUninternedSymbol( "ID" );
    $sym17$PAST_IDS = makeUninternedSymbol( "PAST-IDS" );
    $sym18$MY_DONE = makeUninternedSymbol( "MY-DONE" );
    $sym19$CLET = makeSymbol( "CLET" );
    $sym20$_ = makeSymbol( "<" );
    $sym21$PUNLESS = makeSymbol( "PUNLESS" );
    $sym22$CSETQ = makeSymbol( "CSETQ" );
    $sym23$COR = makeSymbol( "COR" );
    $list24 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "TABLE" ), makeSymbol( "FIRST-ID" ), makeSymbol( "&KEY" ), makeSymbol( "PROGRESS-MESSAGE" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ),
        makeSymbol( "BODY" ) );
    $sym25$TABLE_VAR = makeUninternedSymbol( "TABLE-VAR" );
    $sym26$DO_KB_SUID_TABLE_STARTING_AT_ID = makeSymbol( "DO-KB-SUID-TABLE-STARTING-AT-ID" );
    $sym27$FIRST_ID_VAR = makeUninternedSymbol( "FIRST-ID-VAR" );
    $sym28$PROGRESS_MESSAGE_VAR = makeUninternedSymbol( "PROGRESS-MESSAGE-VAR" );
    $sym29$SOFAR = makeUninternedSymbol( "SOFAR" );
    $sym30$TOTAL = makeUninternedSymbol( "TOTAL" );
    $sym31$_ = makeSymbol( "-" );
    $sym32$ID_INDEX_NEXT_ID = makeSymbol( "ID-INDEX-NEXT-ID" );
    $list33 = ConsesLow.list( ZERO_INTEGER );
    $sym34$NOTING_PERCENT_PROGRESS = makeSymbol( "NOTING-PERCENT-PROGRESS" );
    $sym35$NOTE_PERCENT_PROGRESS = makeSymbol( "NOTE-PERCENT-PROGRESS" );
    $sym36$CINC = makeSymbol( "CINC" );
    $sym37$END = makeUninternedSymbol( "END" );
    $sym38$ID = makeUninternedSymbol( "ID" );
    $sym39$DO_NUMBERS = makeSymbol( "DO-NUMBERS" );
    $kw40$START = makeKeyword( "START" );
    $kw41$END = makeKeyword( "END" );
    $kw42$DELTA = makeKeyword( "DELTA" );
    $sym43$ID_INDEX_LOOKUP = makeSymbol( "ID-INDEX-LOOKUP" );
    $sym44$PWHEN = makeSymbol( "PWHEN" );
    $list45 = ConsesLow.list( ConsesLow.list( makeSymbol( "*CFASL-CONSTANT-HANDLE-LOOKUP-FUNC*" ) ), ConsesLow.list( makeSymbol( "*CFASL-NART-HANDLE-LOOKUP-FUNC*" ) ), ConsesLow.list( makeSymbol(
        "*CFASL-ASSERTION-HANDLE-LOOKUP-FUNC*" ) ), ConsesLow.list( makeSymbol( "*CFASL-DEDUCTION-HANDLE-LOOKUP-FUNC*" ) ), ConsesLow.list( makeSymbol( "*CFASL-KB-HL-SUPPORT-HANDLE-LOOKUP-FUNC*" ) ), ConsesLow.list(
            makeSymbol( "*CFASL-CLAUSE-STRUC-HANDLE-LOOKUP-FUNC*" ) ) );
  }
}
/*
 * 
 * Total time: 137 ms
 * 
 */