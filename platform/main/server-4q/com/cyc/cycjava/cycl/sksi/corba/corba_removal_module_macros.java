package com.cyc.cycjava.cycl.sksi.corba;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class corba_removal_module_macros
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.sksi.corba.corba_removal_module_macros";
  public static final String myFingerPrint = "4cedcda501d0026240f30af695f32e84af3caf0b577f4a551b4482d3aa8d354d";
  private static final SubLList $list0;
  private static final SubLSymbol $sym1$PRED;
  private static final SubLSymbol $sym2$CDOLIST;
  private static final SubLList $list3;
  private static final SubLSymbol $sym4$CORBA_SKS_DECLARE_REMOVAL_MODULE;
  private static final SubLSymbol $sym5$PRED;
  private static final SubLSymbol $sym6$CORBA_SKS_UNDECLARE_REMOVAL_MODULE;
  private static final SubLList $list7;
  private static final SubLSymbol $sym8$NAME;
  private static final SubLSymbol $sym9$EXPAND_FN;
  private static final SubLSymbol $sym10$REQ_PATTERN;
  private static final SubLSymbol $sym11$CONTENT_MT;
  private static final SubLSymbol $sym12$CLET;
  private static final SubLSymbol $sym13$MAKE_CORBA_MODULE_NAME_KEYWORD;
  private static final SubLSymbol $sym14$CORBA_PRED_GET_REMOVAL_MODULE_EXPAND_FN_SYMBOL;
  private static final SubLSymbol $sym15$DETERMINE_CORBA_REMOVAL_MODULE_REQUIRED_PATTERN;
  private static final SubLSymbol $sym16$SKS_GET_CONTENT_MT;
  private static final SubLSymbol $sym17$INFERENCE_REMOVAL_MODULE;
  private static final SubLSymbol $sym18$LIST;
  private static final SubLSymbol $kw19$SENSE;
  private static final SubLSymbol $kw20$POS;
  private static final SubLSymbol $kw21$PREDICATE;
  private static final SubLSymbol $kw22$REQUIRED_PATTERN;
  private static final SubLSymbol $kw23$COST_EXPRESSION;
  private static final SubLSymbol $kw24$EXPAND;
  private static final SubLSymbol $kw25$REQUIRED_MT;
  private static final SubLSymbol $sym26$NOTE_SKSI_CORBA_MODULE;
  private static final SubLSymbol $sym27$REGISTER_SOLELY_SPECIFIC_REMOVAL_MODULE_PREDICATE;
  private static final SubLSymbol $sym28$NAME;
  private static final SubLSymbol $sym29$UNDECLARE_INFERENCE_REMOVAL_MODULE;
  private static final SubLList $list30;
  private static final SubLSymbol $sym31$UN_NOTE_SKSI_CORBA_MODULE;

  @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-removal-module-macros.lisp", position = 855L)
  public static SubLObject corba_sks_declare_removal_module_suite(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject sks = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    sks = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject pred = $sym1$PRED;
      return ConsesLow.list( $sym2$CDOLIST, reader.bq_cons( pred, $list3 ), ConsesLow.list( $sym4$CORBA_SKS_DECLARE_REMOVAL_MODULE, sks, pred ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-removal-module-macros.lisp", position = 1187L)
  public static SubLObject corba_sks_undeclare_removal_module_suite(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject sks = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    sks = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject pred = $sym5$PRED;
      return ConsesLow.list( $sym2$CDOLIST, reader.bq_cons( pred, $list3 ), ConsesLow.list( $sym6$CORBA_SKS_UNDECLARE_REMOVAL_MODULE, sks, pred ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-removal-module-macros.lisp", position = 1395L)
  public static SubLObject corba_sks_declare_removal_module(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject sks = NIL;
    SubLObject pred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    sks = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    pred = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject name = $sym8$NAME;
      final SubLObject expand_fn = $sym9$EXPAND_FN;
      final SubLObject req_pattern = $sym10$REQ_PATTERN;
      final SubLObject content_mt = $sym11$CONTENT_MT;
      return ConsesLow.list( $sym12$CLET, ConsesLow.list( ConsesLow.list( name, ConsesLow.list( $sym13$MAKE_CORBA_MODULE_NAME_KEYWORD, sks, pred ) ), ConsesLow.list( expand_fn, ConsesLow.list(
          $sym14$CORBA_PRED_GET_REMOVAL_MODULE_EXPAND_FN_SYMBOL, pred ) ), ConsesLow.list( req_pattern, ConsesLow.list( $sym15$DETERMINE_CORBA_REMOVAL_MODULE_REQUIRED_PATTERN, pred ) ), ConsesLow.list( content_mt,
              ConsesLow.list( $sym16$SKS_GET_CONTENT_MT, sks ) ) ), ConsesLow.list( $sym17$INFERENCE_REMOVAL_MODULE, name, ConsesLow.list( new SubLObject[]
              { $sym18$LIST, $kw19$SENSE, $kw20$POS, $kw21$PREDICATE, pred, $kw22$REQUIRED_PATTERN, req_pattern, $kw23$COST_EXPRESSION, FIVE_INTEGER, $kw24$EXPAND, expand_fn, $kw25$REQUIRED_MT, content_mt
      } ) ), ConsesLow.list( $sym26$NOTE_SKSI_CORBA_MODULE, name, content_mt ), ConsesLow.list( $sym27$REGISTER_SOLELY_SPECIFIC_REMOVAL_MODULE_PREDICATE, pred ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list7 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-removal-module-macros.lisp", position = 2190L)
  public static SubLObject corba_sks_undeclare_removal_module(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject sks = NIL;
    SubLObject pred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    sks = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    pred = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject name = $sym28$NAME;
      return ConsesLow.list( $sym12$CLET, ConsesLow.list( ConsesLow.list( name, ConsesLow.list( $sym13$MAKE_CORBA_MODULE_NAME_KEYWORD, sks, pred ) ) ), ConsesLow.listS( $sym29$UNDECLARE_INFERENCE_REMOVAL_MODULE, name,
          $list30 ), ConsesLow.list( $sym31$UN_NOTE_SKSI_CORBA_MODULE, name ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list7 );
    return NIL;
  }

  public static SubLObject declare_corba_removal_module_macros_file()
  {
    SubLFiles.declareMacro( me, "corba_sks_declare_removal_module_suite", "CORBA-SKS-DECLARE-REMOVAL-MODULE-SUITE" );
    SubLFiles.declareMacro( me, "corba_sks_undeclare_removal_module_suite", "CORBA-SKS-UNDECLARE-REMOVAL-MODULE-SUITE" );
    SubLFiles.declareMacro( me, "corba_sks_declare_removal_module", "CORBA-SKS-DECLARE-REMOVAL-MODULE" );
    SubLFiles.declareMacro( me, "corba_sks_undeclare_removal_module", "CORBA-SKS-UNDECLARE-REMOVAL-MODULE" );
    return NIL;
  }

  public static SubLObject init_corba_removal_module_macros_file()
  {
    return NIL;
  }

  public static SubLObject setup_corba_removal_module_macros_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_corba_removal_module_macros_file();
  }

  @Override
  public void initializeVariables()
  {
    init_corba_removal_module_macros_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_corba_removal_module_macros_file();
  }
  static
  {
    me = new corba_removal_module_macros();
    $list0 = ConsesLow.list( makeSymbol( "SKS" ) );
    $sym1$PRED = makeUninternedSymbol( "PRED" );
    $sym2$CDOLIST = makeSymbol( "CDOLIST" );
    $list3 = ConsesLow.list( ConsesLow.list( makeSymbol( "GET-CORBA-REMOVAL-PREDICATES" ) ) );
    $sym4$CORBA_SKS_DECLARE_REMOVAL_MODULE = makeSymbol( "CORBA-SKS-DECLARE-REMOVAL-MODULE" );
    $sym5$PRED = makeUninternedSymbol( "PRED" );
    $sym6$CORBA_SKS_UNDECLARE_REMOVAL_MODULE = makeSymbol( "CORBA-SKS-UNDECLARE-REMOVAL-MODULE" );
    $list7 = ConsesLow.list( makeSymbol( "SKS" ), makeSymbol( "PRED" ) );
    $sym8$NAME = makeUninternedSymbol( "NAME" );
    $sym9$EXPAND_FN = makeUninternedSymbol( "EXPAND-FN" );
    $sym10$REQ_PATTERN = makeUninternedSymbol( "REQ-PATTERN" );
    $sym11$CONTENT_MT = makeUninternedSymbol( "CONTENT-MT" );
    $sym12$CLET = makeSymbol( "CLET" );
    $sym13$MAKE_CORBA_MODULE_NAME_KEYWORD = makeSymbol( "MAKE-CORBA-MODULE-NAME-KEYWORD" );
    $sym14$CORBA_PRED_GET_REMOVAL_MODULE_EXPAND_FN_SYMBOL = makeSymbol( "CORBA-PRED-GET-REMOVAL-MODULE-EXPAND-FN-SYMBOL" );
    $sym15$DETERMINE_CORBA_REMOVAL_MODULE_REQUIRED_PATTERN = makeSymbol( "DETERMINE-CORBA-REMOVAL-MODULE-REQUIRED-PATTERN" );
    $sym16$SKS_GET_CONTENT_MT = makeSymbol( "SKS-GET-CONTENT-MT" );
    $sym17$INFERENCE_REMOVAL_MODULE = makeSymbol( "INFERENCE-REMOVAL-MODULE" );
    $sym18$LIST = makeSymbol( "LIST" );
    $kw19$SENSE = makeKeyword( "SENSE" );
    $kw20$POS = makeKeyword( "POS" );
    $kw21$PREDICATE = makeKeyword( "PREDICATE" );
    $kw22$REQUIRED_PATTERN = makeKeyword( "REQUIRED-PATTERN" );
    $kw23$COST_EXPRESSION = makeKeyword( "COST-EXPRESSION" );
    $kw24$EXPAND = makeKeyword( "EXPAND" );
    $kw25$REQUIRED_MT = makeKeyword( "REQUIRED-MT" );
    $sym26$NOTE_SKSI_CORBA_MODULE = makeSymbol( "NOTE-SKSI-CORBA-MODULE" );
    $sym27$REGISTER_SOLELY_SPECIFIC_REMOVAL_MODULE_PREDICATE = makeSymbol( "REGISTER-SOLELY-SPECIFIC-REMOVAL-MODULE-PREDICATE" );
    $sym28$NAME = makeUninternedSymbol( "NAME" );
    $sym29$UNDECLARE_INFERENCE_REMOVAL_MODULE = makeSymbol( "UNDECLARE-INFERENCE-REMOVAL-MODULE" );
    $list30 = ConsesLow.list( NIL );
    $sym31$UN_NOTE_SKSI_CORBA_MODULE = makeSymbol( "UN-NOTE-SKSI-CORBA-MODULE" );
  }
}
/*
 * 
 * Total time: 25 ms
 * 
 */