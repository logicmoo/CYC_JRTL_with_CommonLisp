package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class reader_writer_locks
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.reader_writer_locks";
  public static final String myFingerPrint = "3c9ce3f1a2f3bc74919bc944c8082486c343be6ac8fee73f20c1554df4b95f65";
  private static final SubLList $list0;
  private static final SubLSymbol $kw1$SL2JAVA;
  private static final SubLSymbol $sym2$WITH_JRTL_WRITER_LOCK;
  private static final SubLSymbol $sym3$RW_LOCK_VAR;
  private static final SubLSymbol $sym4$PIF_FEATURE;
  private static final SubLSymbol $sym5$CLET;
  private static final SubLSymbol $sym6$RW_LOCK_WRITER_VERIFY_NOT_HOLDING_READER;
  private static final SubLSymbol $sym7$WITH_LOCK_HELD;
  private static final SubLSymbol $sym8$READER_WRITER_LOCK_WRITER_LOCK;
  private static final SubLSymbol $sym9$READER_WRITER_LOCK_READER_LOCK;
  private static final SubLSymbol $sym10$RW_LOCK_WRITER_POSSIBLY_WAIT_FOR_READERS_TO_FINISH;
  private static final SubLSymbol $sym11$WITH_JRTL_READER_LOCK;
  private static final SubLSymbol $sym12$RW_LOCK_VAR;
  private static final SubLSymbol $sym13$CUNWIND_PROTECT;
  private static final SubLSymbol $sym14$PROGN;
  private static final SubLSymbol $sym15$RW_LOCK_POSSIBLY_REGISTER_READER;
  private static final SubLList $list16;
  private static final SubLSymbol $sym17$CPUSHNEW;
  private static final SubLList $list18;
  private static final SubLSymbol $sym19$RW_LOCK_READER_CLEANUP;
  private static final SubLSymbol $sym20$WITH_WRITER_LOCK;
  private static final SubLList $list21;
  private static final SubLSymbol $sym22$RW_LOCK_VAR;
  private static final SubLSymbol $sym23$NEEDS_TO_RELEASE_;
  private static final SubLList $list24;
  private static final SubLSymbol $sym25$CSETQ;
  private static final SubLSymbol $sym26$RW_LOCK_SEIZE_WRITE_LOCK;
  private static final SubLSymbol $sym27$PWHEN;
  private static final SubLSymbol $sym28$RW_LOCK_RELEASE_WRITE_LOCK;
  private static final SubLSymbol $sym29$WITH_READER_LOCK;
  private static final SubLSymbol $sym30$RW_LOCK_VAR;
  private static final SubLSymbol $sym31$NEEDS_TO_RELEASE_;
  private static final SubLSymbol $sym32$RW_LOCK_SEIZE_READ_LOCK;
  private static final SubLSymbol $sym33$RW_LOCK_RELEASE_READ_LOCK;

  @SubLTranslatedFile.SubL(source = "cycl/reader-writer-locks.lisp", position = 835L)
  public static SubLObject with_writer_lock(final SubLObject macroform, final SubLObject environment)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject rw_lock = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    rw_lock = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
      return NIL;
    }
    final SubLObject body;
    current = ( body = temp );
    if( NIL != Sequences.find( $kw1$SL2JAVA, reader.$features$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return ConsesLow.listS( $sym2$WITH_JRTL_WRITER_LOCK, rw_lock, ConsesLow.append( body, NIL ) );
    }
    final SubLObject rw_lock_var = $sym3$RW_LOCK_VAR;
    return ConsesLow.list( $sym4$PIF_FEATURE, $kw1$SL2JAVA, ConsesLow.listS( $sym2$WITH_JRTL_WRITER_LOCK, rw_lock, ConsesLow.append( body, NIL ) ), ConsesLow.list( $sym5$CLET, ConsesLow.list( ConsesLow.list( rw_lock_var,
        rw_lock ) ), ConsesLow.list( $sym6$RW_LOCK_WRITER_VERIFY_NOT_HOLDING_READER, rw_lock_var ), ConsesLow.list( $sym7$WITH_LOCK_HELD, ConsesLow.list( ConsesLow.list( $sym8$READER_WRITER_LOCK_WRITER_LOCK,
            rw_lock_var ) ), ConsesLow.listS( $sym7$WITH_LOCK_HELD, ConsesLow.list( ConsesLow.list( $sym9$READER_WRITER_LOCK_READER_LOCK, rw_lock_var ) ), ConsesLow.list(
                $sym10$RW_LOCK_WRITER_POSSIBLY_WAIT_FOR_READERS_TO_FINISH, rw_lock_var ), ConsesLow.append( body, NIL ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reader-writer-locks.lisp", position = 1785L)
  public static SubLObject with_reader_lock(final SubLObject macroform, final SubLObject environment)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject rw_lock = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    rw_lock = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
      return NIL;
    }
    final SubLObject body;
    current = ( body = temp );
    if( NIL != Sequences.find( $kw1$SL2JAVA, reader.$features$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return ConsesLow.listS( $sym11$WITH_JRTL_READER_LOCK, rw_lock, ConsesLow.append( body, NIL ) );
    }
    final SubLObject rw_lock_var = $sym12$RW_LOCK_VAR;
    return ConsesLow.list( $sym4$PIF_FEATURE, $kw1$SL2JAVA, ConsesLow.listS( $sym11$WITH_JRTL_READER_LOCK, rw_lock, ConsesLow.append( body, NIL ) ), ConsesLow.list( $sym5$CLET, ConsesLow.list( ConsesLow.list(
        rw_lock_var, rw_lock ) ), ConsesLow.list( $sym13$CUNWIND_PROTECT, ConsesLow.list( $sym14$PROGN, ConsesLow.list( $sym15$RW_LOCK_POSSIBLY_REGISTER_READER, rw_lock_var ), ConsesLow.listS( $sym5$CLET, $list16,
            ConsesLow.listS( $sym17$CPUSHNEW, rw_lock_var, $list18 ), ConsesLow.append( body, NIL ) ) ), ConsesLow.list( $sym19$RW_LOCK_READER_CLEANUP, rw_lock_var ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reader-writer-locks.lisp", position = 2463L)
  public static SubLObject with_jrtl_writer_lock(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject rw_lock = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list21 );
    rw_lock = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    final SubLObject rw_lock_var = $sym22$RW_LOCK_VAR;
    final SubLObject needs_to_releaseP = $sym23$NEEDS_TO_RELEASE_;
    return ConsesLow.list( $sym5$CLET, ConsesLow.list( ConsesLow.list( rw_lock_var, rw_lock ), reader.bq_cons( needs_to_releaseP, $list24 ) ), ConsesLow.list( $sym13$CUNWIND_PROTECT, ConsesLow.listS( $sym14$PROGN,
        ConsesLow.list( $sym25$CSETQ, needs_to_releaseP, ConsesLow.list( $sym26$RW_LOCK_SEIZE_WRITE_LOCK, rw_lock_var ) ), ConsesLow.append( body, NIL ) ), ConsesLow.list( $sym27$PWHEN, needs_to_releaseP, ConsesLow.list(
            $sym28$RW_LOCK_RELEASE_WRITE_LOCK, rw_lock_var ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reader-writer-locks.lisp", position = 2970L)
  public static SubLObject with_jrtl_reader_lock(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject rw_lock = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list21 );
    rw_lock = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    final SubLObject rw_lock_var = $sym30$RW_LOCK_VAR;
    final SubLObject needs_to_releaseP = $sym31$NEEDS_TO_RELEASE_;
    return ConsesLow.list( $sym5$CLET, ConsesLow.list( ConsesLow.list( rw_lock_var, rw_lock ), reader.bq_cons( needs_to_releaseP, $list24 ) ), ConsesLow.list( $sym13$CUNWIND_PROTECT, ConsesLow.listS( $sym14$PROGN,
        ConsesLow.list( $sym25$CSETQ, needs_to_releaseP, ConsesLow.list( $sym32$RW_LOCK_SEIZE_READ_LOCK, rw_lock_var ) ), ConsesLow.append( body, NIL ) ), ConsesLow.list( $sym27$PWHEN, needs_to_releaseP, ConsesLow.list(
            $sym33$RW_LOCK_RELEASE_READ_LOCK, rw_lock_var ) ) ) );
  }

  public static SubLObject declare_reader_writer_locks_file()
  {
    SubLFiles.declareMacro( me, "with_writer_lock", "WITH-WRITER-LOCK" );
    SubLFiles.declareMacro( me, "with_reader_lock", "WITH-READER-LOCK" );
    SubLFiles.declareMacro( me, "with_jrtl_writer_lock", "WITH-JRTL-WRITER-LOCK" );
    SubLFiles.declareMacro( me, "with_jrtl_reader_lock", "WITH-JRTL-READER-LOCK" );
    return NIL;
  }

  public static SubLObject init_reader_writer_locks_file()
  {
    return NIL;
  }

  public static SubLObject setup_reader_writer_locks_file()
  {
    access_macros.register_macro_helper( $sym2$WITH_JRTL_WRITER_LOCK, $sym20$WITH_WRITER_LOCK );
    access_macros.register_macro_helper( $sym11$WITH_JRTL_READER_LOCK, $sym29$WITH_READER_LOCK );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_reader_writer_locks_file();
  }

  @Override
  public void initializeVariables()
  {
    init_reader_writer_locks_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_reader_writer_locks_file();
  }
  static
  {
    me = new reader_writer_locks();
    $list0 = ConsesLow.list( ConsesLow.list( makeSymbol( "RW-LOCK" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $kw1$SL2JAVA = makeKeyword( "SL2JAVA" );
    $sym2$WITH_JRTL_WRITER_LOCK = makeSymbol( "WITH-JRTL-WRITER-LOCK" );
    $sym3$RW_LOCK_VAR = makeUninternedSymbol( "RW-LOCK-VAR" );
    $sym4$PIF_FEATURE = makeSymbol( "PIF-FEATURE" );
    $sym5$CLET = makeSymbol( "CLET" );
    $sym6$RW_LOCK_WRITER_VERIFY_NOT_HOLDING_READER = makeSymbol( "RW-LOCK-WRITER-VERIFY-NOT-HOLDING-READER" );
    $sym7$WITH_LOCK_HELD = makeSymbol( "WITH-LOCK-HELD" );
    $sym8$READER_WRITER_LOCK_WRITER_LOCK = makeSymbol( "READER-WRITER-LOCK-WRITER-LOCK" );
    $sym9$READER_WRITER_LOCK_READER_LOCK = makeSymbol( "READER-WRITER-LOCK-READER-LOCK" );
    $sym10$RW_LOCK_WRITER_POSSIBLY_WAIT_FOR_READERS_TO_FINISH = makeSymbol( "RW-LOCK-WRITER-POSSIBLY-WAIT-FOR-READERS-TO-FINISH" );
    $sym11$WITH_JRTL_READER_LOCK = makeSymbol( "WITH-JRTL-READER-LOCK" );
    $sym12$RW_LOCK_VAR = makeUninternedSymbol( "RW-LOCK-VAR" );
    $sym13$CUNWIND_PROTECT = makeSymbol( "CUNWIND-PROTECT" );
    $sym14$PROGN = makeSymbol( "PROGN" );
    $sym15$RW_LOCK_POSSIBLY_REGISTER_READER = makeSymbol( "RW-LOCK-POSSIBLY-REGISTER-READER" );
    $list16 = ConsesLow.list( ConsesLow.list( makeSymbol( "*RW-LOCK-PROCESS-READER-RW-LOCK-LIST*" ), makeSymbol( "*RW-LOCK-PROCESS-READER-RW-LOCK-LIST*" ) ) );
    $sym17$CPUSHNEW = makeSymbol( "CPUSHNEW" );
    $list18 = ConsesLow.list( makeSymbol( "*RW-LOCK-PROCESS-READER-RW-LOCK-LIST*" ) );
    $sym19$RW_LOCK_READER_CLEANUP = makeSymbol( "RW-LOCK-READER-CLEANUP" );
    $sym20$WITH_WRITER_LOCK = makeSymbol( "WITH-WRITER-LOCK" );
    $list21 = ConsesLow.list( makeSymbol( "RW-LOCK" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym22$RW_LOCK_VAR = makeUninternedSymbol( "RW-LOCK-VAR" );
    $sym23$NEEDS_TO_RELEASE_ = makeUninternedSymbol( "NEEDS-TO-RELEASE?" );
    $list24 = ConsesLow.list( NIL );
    $sym25$CSETQ = makeSymbol( "CSETQ" );
    $sym26$RW_LOCK_SEIZE_WRITE_LOCK = makeSymbol( "RW-LOCK-SEIZE-WRITE-LOCK" );
    $sym27$PWHEN = makeSymbol( "PWHEN" );
    $sym28$RW_LOCK_RELEASE_WRITE_LOCK = makeSymbol( "RW-LOCK-RELEASE-WRITE-LOCK" );
    $sym29$WITH_READER_LOCK = makeSymbol( "WITH-READER-LOCK" );
    $sym30$RW_LOCK_VAR = makeUninternedSymbol( "RW-LOCK-VAR" );
    $sym31$NEEDS_TO_RELEASE_ = makeUninternedSymbol( "NEEDS-TO-RELEASE?" );
    $sym32$RW_LOCK_SEIZE_READ_LOCK = makeSymbol( "RW-LOCK-SEIZE-READ-LOCK" );
    $sym33$RW_LOCK_RELEASE_READ_LOCK = makeSymbol( "RW-LOCK-RELEASE-READ-LOCK" );
  }
}
/*
 * 
 * Total time: 83 ms
 * 
 */