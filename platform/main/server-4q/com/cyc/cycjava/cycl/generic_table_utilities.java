package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class generic_table_utilities
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.generic_table_utilities";
  public static final String myFingerPrint = "713cc819dd36c6408bfa80ca38e71142d8e3b0cf0f60d1d73f63ecc4a03254bf";
  private static final SubLString $str0$_S_is_not_a_GENERIC_TABLE_P_;
  private static final SubLList $list1;
  private static final SubLList $list2;
  private static final SubLSymbol $kw3$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw4$PROGRESS_MESSAGE;
  private static final SubLSymbol $sym5$MESSAGE_VAR;
  private static final SubLSymbol $sym6$SILENT_;
  private static final SubLSymbol $sym7$TABLE_VAR;
  private static final SubLSymbol $sym8$INDEX_VAR;
  private static final SubLSymbol $sym9$COUNT_VAR;
  private static final SubLSymbol $sym10$CLET;
  private static final SubLList $list11;
  private static final SubLSymbol $sym12$_SILENT_PROGRESS__;
  private static final SubLSymbol $sym13$COR;
  private static final SubLSymbol $sym14$NULL;
  private static final SubLSymbol $sym15$NOTING_PERCENT_PROGRESS;
  private static final SubLSymbol $sym16$FIRST_OF;
  private static final SubLList $list17;
  private static final SubLList $list18;
  private static final SubLSymbol $sym19$GENERIC_TABLE_COUNT;
  private static final SubLSymbol $sym20$DO_GENERIC_TABLE;
  private static final SubLSymbol $sym21$CSETQ;
  private static final SubLSymbol $sym22$1_;
  private static final SubLSymbol $sym23$NOTE_PERCENT_PROGRESS;
  private static final SubLSymbol $sym24$PCOND;
  private static final SubLSymbol $sym25$HASH_TABLE_P;
  private static final SubLSymbol $sym26$DO_HASH_TABLE;
  private static final SubLSymbol $sym27$FILE_HASH_TABLE_P;
  private static final SubLSymbol $sym28$DO_FILE_HASH_TABLE;
  private static final SubLSymbol $sym29$ERROR;

  @SubLTranslatedFile.SubL(source = "cycl/generic-table-utilities.lisp", position = 1013L)
  public static SubLObject generic_table_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isHashtable() || NIL != file_hash_table.file_hash_table_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/generic-table-utilities.lisp", position = 1123L)
  public static SubLObject put_generic_table(final SubLObject key, final SubLObject table, final SubLObject value)
  {
    if( table.isHashtable() )
    {
      return Hashtables.sethash( key, table, value );
    }
    if( NIL != file_hash_table.file_hash_table_p( table ) )
    {
      return file_hash_table.put_file_hash_table( key, table, value );
    }
    Errors.error( $str0$_S_is_not_a_GENERIC_TABLE_P_, table );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/generic-table-utilities.lisp", position = 1383L)
  public static SubLObject get_generic_table(final SubLObject key, final SubLObject table, SubLObject default_value)
  {
    if( default_value == UNPROVIDED )
    {
      default_value = NIL;
    }
    if( table.isHashtable() )
    {
      return Hashtables.gethash( key, table, default_value );
    }
    if( NIL != file_hash_table.file_hash_table_p( table ) )
    {
      return file_hash_table.get_file_hash_table( key, table, default_value );
    }
    Errors.error( $str0$_S_is_not_a_GENERIC_TABLE_P_, table );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/generic-table-utilities.lisp", position = 1677L)
  public static SubLObject remove_generic_table(final SubLObject key, final SubLObject table)
  {
    if( table.isHashtable() )
    {
      return Hashtables.remhash( key, table );
    }
    if( NIL != file_hash_table.file_hash_table_p( table ) )
    {
      return file_hash_table.remove_file_hash_table( key, table );
    }
    Errors.error( $str0$_S_is_not_a_GENERIC_TABLE_P_, table );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/generic-table-utilities.lisp", position = 1925L)
  public static SubLObject generic_table_keys(final SubLObject table)
  {
    if( table.isHashtable() )
    {
      return hash_table_utilities.hash_table_keys( table );
    }
    if( NIL != file_hash_table.file_hash_table_p( table ) )
    {
      return file_hash_table.file_hash_table_keys( table );
    }
    Errors.error( $str0$_S_is_not_a_GENERIC_TABLE_P_, table );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/generic-table-utilities.lisp", position = 2165L)
  public static SubLObject generic_table_size(final SubLObject table)
  {
    if( table.isHashtable() )
    {
      return Hashtables.hash_table_size( table );
    }
    if( NIL != file_hash_table.file_hash_table_p( table ) )
    {
      return file_hash_table.file_hash_table_capacity( table );
    }
    Errors.error( $str0$_S_is_not_a_GENERIC_TABLE_P_, table );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/generic-table-utilities.lisp", position = 2409L)
  public static SubLObject generic_table_count(final SubLObject table)
  {
    if( table.isHashtable() )
    {
      return Hashtables.hash_table_count( table );
    }
    if( NIL != file_hash_table.file_hash_table_p( table ) )
    {
      return file_hash_table.file_hash_table_count( table );
    }
    Errors.error( $str0$_S_is_not_a_GENERIC_TABLE_P_, table );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/generic-table-utilities.lisp", position = 2652L)
  public static SubLObject do_generic_table(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject key = NIL;
    SubLObject value = NIL;
    SubLObject table = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1 );
    key = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1 );
    value = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1 );
    table = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list1 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list1 );
      if( NIL == conses_high.member( current_$1, $list2, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw3$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list1 );
    }
    final SubLObject progress_message_tail = cdestructuring_bind.property_list_member( $kw4$PROGRESS_MESSAGE, current );
    final SubLObject progress_message = ( NIL != progress_message_tail ) ? conses_high.cadr( progress_message_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    if( NIL != progress_message )
    {
      final SubLObject message_var = $sym5$MESSAGE_VAR;
      final SubLObject silentP = $sym6$SILENT_;
      final SubLObject table_var = $sym7$TABLE_VAR;
      final SubLObject index_var = $sym8$INDEX_VAR;
      final SubLObject count_var = $sym9$COUNT_VAR;
      return ConsesLow.list( $sym10$CLET, ConsesLow.list( ConsesLow.list( message_var, progress_message ), reader.bq_cons( silentP, $list11 ), ConsesLow.list( $sym12$_SILENT_PROGRESS__, ConsesLow.list( $sym13$COR,
          silentP, ConsesLow.list( $sym14$NULL, message_var ) ) ) ), ConsesLow.list( $sym15$NOTING_PERCENT_PROGRESS, ConsesLow.listS( $sym16$FIRST_OF, message_var, $list17 ), ConsesLow.list( $sym10$CLET, ConsesLow.list(
              ConsesLow.list( table_var, table ), reader.bq_cons( index_var, $list18 ), ConsesLow.list( count_var, ConsesLow.list( $sym19$GENERIC_TABLE_COUNT, table_var ) ) ), ConsesLow.list( $sym20$DO_GENERIC_TABLE,
                  ConsesLow.list( key, value, table_var ), ConsesLow.listS( $sym10$CLET, ConsesLow.list( ConsesLow.list( $sym12$_SILENT_PROGRESS__, silentP ) ), ConsesLow.append( body, NIL ) ), ConsesLow.list(
                      $sym21$CSETQ, index_var, ConsesLow.list( $sym22$1_, index_var ) ), ConsesLow.list( $sym23$NOTE_PERCENT_PROGRESS, index_var, count_var ) ) ) ) );
    }
    return ConsesLow.list( $sym24$PCOND, ConsesLow.list( ConsesLow.list( $sym25$HASH_TABLE_P, table ), ConsesLow.listS( $sym26$DO_HASH_TABLE, ConsesLow.list( key, value, table ), ConsesLow.append( body, NIL ) ) ),
        ConsesLow.list( ConsesLow.list( $sym27$FILE_HASH_TABLE_P, table ), ConsesLow.listS( $sym28$DO_FILE_HASH_TABLE, ConsesLow.list( key, value, table ), ConsesLow.append( body, NIL ) ) ), ConsesLow.list( T, ConsesLow
            .list( $sym29$ERROR, $str0$_S_is_not_a_GENERIC_TABLE_P_, table ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/generic-table-utilities.lisp", position = 3808L)
  public static SubLObject cinc_generic_table(final SubLObject key, final SubLObject table, SubLObject increment, SubLObject initial_val)
  {
    if( increment == UNPROVIDED )
    {
      increment = ONE_INTEGER;
    }
    if( initial_val == UNPROVIDED )
    {
      initial_val = increment;
    }
    if( table.isHashtable() )
    {
      return hash_table_utilities.cinc_hash( key, table, increment, initial_val );
    }
    if( NIL != file_hash_table.file_hash_table_p( table ) )
    {
      return file_hash_table.cinc_file_hash_table( key, table, increment, initial_val );
    }
    Errors.error( $str0$_S_is_not_a_GENERIC_TABLE_P_, table );
    return NIL;
  }

  public static SubLObject declare_generic_table_utilities_file()
  {
    SubLFiles.declareFunction( me, "generic_table_p", "GENERIC-TABLE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "put_generic_table", "PUT-GENERIC-TABLE", 3, 0, false );
    SubLFiles.declareFunction( me, "get_generic_table", "GET-GENERIC-TABLE", 2, 1, false );
    SubLFiles.declareFunction( me, "remove_generic_table", "REMOVE-GENERIC-TABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "generic_table_keys", "GENERIC-TABLE-KEYS", 1, 0, false );
    SubLFiles.declareFunction( me, "generic_table_size", "GENERIC-TABLE-SIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "generic_table_count", "GENERIC-TABLE-COUNT", 1, 0, false );
    SubLFiles.declareMacro( me, "do_generic_table", "DO-GENERIC-TABLE" );
    SubLFiles.declareFunction( me, "cinc_generic_table", "CINC-GENERIC-TABLE", 2, 2, false );
    return NIL;
  }

  public static SubLObject init_generic_table_utilities_file()
  {
    return NIL;
  }

  public static SubLObject setup_generic_table_utilities_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_generic_table_utilities_file();
  }

  @Override
  public void initializeVariables()
  {
    init_generic_table_utilities_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_generic_table_utilities_file();
  }
  static
  {
    me = new generic_table_utilities();
    $str0$_S_is_not_a_GENERIC_TABLE_P_ = makeString( "~S is not a GENERIC-TABLE-P." );
    $list1 = ConsesLow.list( ConsesLow.list( makeSymbol( "KEY" ), makeSymbol( "VALUE" ), makeSymbol( "TABLE" ), makeSymbol( "&KEY" ), makeSymbol( "PROGRESS-MESSAGE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list2 = ConsesLow.list( makeKeyword( "PROGRESS-MESSAGE" ) );
    $kw3$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw4$PROGRESS_MESSAGE = makeKeyword( "PROGRESS-MESSAGE" );
    $sym5$MESSAGE_VAR = makeUninternedSymbol( "MESSAGE-VAR" );
    $sym6$SILENT_ = makeUninternedSymbol( "SILENT?" );
    $sym7$TABLE_VAR = makeUninternedSymbol( "TABLE-VAR" );
    $sym8$INDEX_VAR = makeUninternedSymbol( "INDEX-VAR" );
    $sym9$COUNT_VAR = makeUninternedSymbol( "COUNT-VAR" );
    $sym10$CLET = makeSymbol( "CLET" );
    $list11 = ConsesLow.list( makeSymbol( "*SILENT-PROGRESS?*" ) );
    $sym12$_SILENT_PROGRESS__ = makeSymbol( "*SILENT-PROGRESS?*" );
    $sym13$COR = makeSymbol( "COR" );
    $sym14$NULL = makeSymbol( "NULL" );
    $sym15$NOTING_PERCENT_PROGRESS = makeSymbol( "NOTING-PERCENT-PROGRESS" );
    $sym16$FIRST_OF = makeSymbol( "FIRST-OF" );
    $list17 = ConsesLow.list( makeString( "" ) );
    $list18 = ConsesLow.list( ZERO_INTEGER );
    $sym19$GENERIC_TABLE_COUNT = makeSymbol( "GENERIC-TABLE-COUNT" );
    $sym20$DO_GENERIC_TABLE = makeSymbol( "DO-GENERIC-TABLE" );
    $sym21$CSETQ = makeSymbol( "CSETQ" );
    $sym22$1_ = makeSymbol( "1+" );
    $sym23$NOTE_PERCENT_PROGRESS = makeSymbol( "NOTE-PERCENT-PROGRESS" );
    $sym24$PCOND = makeSymbol( "PCOND" );
    $sym25$HASH_TABLE_P = makeSymbol( "HASH-TABLE-P" );
    $sym26$DO_HASH_TABLE = makeSymbol( "DO-HASH-TABLE" );
    $sym27$FILE_HASH_TABLE_P = makeSymbol( "FILE-HASH-TABLE-P" );
    $sym28$DO_FILE_HASH_TABLE = makeSymbol( "DO-FILE-HASH-TABLE" );
    $sym29$ERROR = makeSymbol( "ERROR" );
  }
}
/*
 * 
 * Total time: 169 ms
 * 
 */