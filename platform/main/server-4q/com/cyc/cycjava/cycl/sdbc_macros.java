package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sdbc_macros
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.sdbc_macros";
  public static final String myFingerPrint = "a799f1ffbae1489d24bcb65be8dfdf1a8866494d20364bfbfc7aa191a1c9f075";
  private static final SubLList $list0;
  private static final SubLSymbol $sym1$RESULT_SET;
  private static final SubLSymbol $sym2$COLUMN_COUNT;
  private static final SubLSymbol $sym3$I;
  private static final SubLSymbol $sym4$KEY;
  private static final SubLSymbol $sym5$RESULTS;
  private static final SubLSymbol $sym6$BINDINGS;
  private static final SubLSymbol $sym7$DEFINE_PROTECTED;
  private static final SubLSymbol $sym8$CLET;
  private static final SubLSymbol $sym9$APPLY;
  private static final SubLSymbol $sym10$QUOTE;
  private static final SubLSymbol $sym11$LIST;
  private static final SubLSymbol $sym12$PUNLESS;
  private static final SubLSymbol $sym13$SQL_RESULT_SET_P;
  private static final SubLSymbol $sym14$WARN;
  private static final SubLString $str15$SQLC_error___A;
  private static final SubLList $list16;
  private static final SubLSymbol $sym17$SQLRS_COLUMN_COUNT;
  private static final SubLSymbol $sym18$WHILE;
  private static final SubLSymbol $sym19$CNOT;
  private static final SubLSymbol $sym20$SQLRS_IS_LAST;
  private static final SubLSymbol $sym21$SQLRS_NEXT;
  private static final SubLList $list22;
  private static final SubLSymbol $sym23$CDOLIST;
  private static final SubLSymbol $sym24$CINC;
  private static final SubLSymbol $sym25$PWHEN;
  private static final SubLSymbol $sym26$__;
  private static final SubLSymbol $sym27$CPUSH;
  private static final SubLSymbol $sym28$SQLRS_GET_OBJECT;
  private static final SubLSymbol $sym29$NREVERSE;
  private static final SubLSymbol $sym30$RET;

  @SubLTranslatedFile.SubL(source = "cycl/sdbc-macros.lisp", position = 926L)
  public static SubLObject define_sqlc_wrapper(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject wrapper_fn = NIL;
    SubLObject wrapped_fn = NIL;
    SubLObject args = NIL;
    SubLObject keys = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    wrapper_fn = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    wrapped_fn = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    args = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    keys = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject result_set = $sym1$RESULT_SET;
      final SubLObject column_count = $sym2$COLUMN_COUNT;
      final SubLObject i = $sym3$I;
      final SubLObject key = $sym4$KEY;
      final SubLObject results = $sym5$RESULTS;
      final SubLObject v_bindings = $sym6$BINDINGS;
      return ConsesLow.list( $sym7$DEFINE_PROTECTED, wrapper_fn, args, ConsesLow.list( $sym8$CLET, ConsesLow.list( ConsesLow.list( result_set, ConsesLow.list( $sym9$APPLY, ConsesLow.list( $sym10$QUOTE, wrapped_fn ),
          reader.bq_cons( $sym11$LIST, ConsesLow.append( args, NIL ) ) ) ) ), ConsesLow.listS( $sym12$PUNLESS, ConsesLow.list( $sym13$SQL_RESULT_SET_P, result_set ), ConsesLow.list( $sym14$WARN, $str15$SQLC_error___A,
              result_set ), $list16 ), ConsesLow.list( $sym8$CLET, ConsesLow.list( ConsesLow.list( column_count, ConsesLow.list( $sym17$SQLRS_COLUMN_COUNT, result_set ) ), results ), ConsesLow.list( $sym18$WHILE,
                  ConsesLow.list( $sym19$CNOT, ConsesLow.list( $sym20$SQLRS_IS_LAST, result_set ) ), ConsesLow.list( $sym21$SQLRS_NEXT, result_set ), ConsesLow.list( $sym8$CLET, ConsesLow.list( reader.bq_cons( i,
                      $list22 ), v_bindings ), ConsesLow.list( $sym23$CDOLIST, ConsesLow.list( key, ConsesLow.list( $sym10$QUOTE, keys ) ), ConsesLow.list( $sym24$CINC, i ), ConsesLow.list( $sym25$PWHEN, ConsesLow.list(
                          $sym26$__, i, column_count ), ConsesLow.list( $sym27$CPUSH, key, v_bindings ), ConsesLow.list( $sym27$CPUSH, ConsesLow.list( $sym28$SQLRS_GET_OBJECT, result_set, i ), v_bindings ) ) ), ConsesLow
                              .list( $sym27$CPUSH, ConsesLow.list( $sym29$NREVERSE, v_bindings ), results ) ) ), ConsesLow.list( $sym30$RET, ConsesLow.list( $sym29$NREVERSE, results ) ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
    return NIL;
  }

  public static SubLObject declare_sdbc_macros_file()
  {
    SubLFiles.declareMacro( me, "define_sqlc_wrapper", "DEFINE-SQLC-WRAPPER" );
    return NIL;
  }

  public static SubLObject init_sdbc_macros_file()
  {
    return NIL;
  }

  public static SubLObject setup_sdbc_macros_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_sdbc_macros_file();
  }

  @Override
  public void initializeVariables()
  {
    init_sdbc_macros_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_sdbc_macros_file();
  }
  static
  {
    me = new sdbc_macros();
    $list0 = ConsesLow.list( makeSymbol( "WRAPPER-FN" ), makeSymbol( "WRAPPED-FN" ), makeSymbol( "ARGS" ), makeSymbol( "KEYS" ) );
    $sym1$RESULT_SET = makeUninternedSymbol( "RESULT-SET" );
    $sym2$COLUMN_COUNT = makeUninternedSymbol( "COLUMN-COUNT" );
    $sym3$I = makeUninternedSymbol( "I" );
    $sym4$KEY = makeUninternedSymbol( "KEY" );
    $sym5$RESULTS = makeUninternedSymbol( "RESULTS" );
    $sym6$BINDINGS = makeUninternedSymbol( "BINDINGS" );
    $sym7$DEFINE_PROTECTED = makeSymbol( "DEFINE-PROTECTED" );
    $sym8$CLET = makeSymbol( "CLET" );
    $sym9$APPLY = makeSymbol( "APPLY" );
    $sym10$QUOTE = makeSymbol( "QUOTE" );
    $sym11$LIST = makeSymbol( "LIST" );
    $sym12$PUNLESS = makeSymbol( "PUNLESS" );
    $sym13$SQL_RESULT_SET_P = makeSymbol( "SQL-RESULT-SET-P" );
    $sym14$WARN = makeSymbol( "WARN" );
    $str15$SQLC_error___A = makeString( "SQLC error: ~A" );
    $list16 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym17$SQLRS_COLUMN_COUNT = makeSymbol( "SQLRS-COLUMN-COUNT" );
    $sym18$WHILE = makeSymbol( "WHILE" );
    $sym19$CNOT = makeSymbol( "CNOT" );
    $sym20$SQLRS_IS_LAST = makeSymbol( "SQLRS-IS-LAST" );
    $sym21$SQLRS_NEXT = makeSymbol( "SQLRS-NEXT" );
    $list22 = ConsesLow.list( ZERO_INTEGER );
    $sym23$CDOLIST = makeSymbol( "CDOLIST" );
    $sym24$CINC = makeSymbol( "CINC" );
    $sym25$PWHEN = makeSymbol( "PWHEN" );
    $sym26$__ = makeSymbol( "<=" );
    $sym27$CPUSH = makeSymbol( "CPUSH" );
    $sym28$SQLRS_GET_OBJECT = makeSymbol( "SQLRS-GET-OBJECT" );
    $sym29$NREVERSE = makeSymbol( "NREVERSE" );
    $sym30$RET = makeSymbol( "RET" );
  }
}
/*
 * 
 * Total time: 80 ms
 * 
 */