package com.cyc.cycjava.cycl.sksi.corba;

import com.cyc.cycjava.cycl.constant_handles;
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

public final class corba_storage_module_macros
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.sksi.corba.corba_storage_module_macros";
  public static final String myFingerPrint = "79f0e2409719c2396b4a6883ad6a91e643dfd95055d86b1048a5d12c612c43c4";
  private static final SubLList $list0;
  private static final SubLSymbol $sym1$CONTENT_MT;
  private static final SubLSymbol $sym2$CLET;
  private static final SubLSymbol $sym3$SKS_GET_CONTENT_MT;
  private static final SubLSymbol $sym4$HL_STORAGE_MODULE;
  private static final SubLSymbol $kw5$CORBA_H_P_A_C_K_S_CORBA_SET_OBJECT_METHOD_ARGS_STORAGE;
  private static final SubLSymbol $sym6$LIST;
  private static final SubLSymbol $kw7$PRETTY_NAME;
  private static final SubLString $str8$__corbaSetObjectMethodArgs;
  private static final SubLSymbol $kw9$ARGUMENT_TYPE;
  private static final SubLSymbol $kw10$ARGUMENT;
  private static final SubLSymbol $kw11$PREDICATE;
  private static final SubLObject $const12$corbaSetObjectMethodArgs;
  private static final SubLSymbol $kw13$APPLICABILITY;
  private static final SubLList $list14;
  private static final SubLSymbol $kw15$INCOMPLETENESS;
  private static final SubLList $list16;
  private static final SubLSymbol $kw17$ADD;
  private static final SubLList $list18;
  private static final SubLSymbol $kw19$REQUIRED_MT;
  private static final SubLList $list20;
  private static final SubLList $list21;
  private static final SubLSymbol $sym22$NOTE_SKSI_CORBA_MODULE;
  private static final SubLSymbol $kw23$CORBA_H_P_A_C_K_S_CORBA_SET_OBJECT_FIELD_ARG_STORAGE;
  private static final SubLString $str24$__corbaSetObjectFieldArg;
  private static final SubLObject $const25$corbaSetObjectFieldArg;
  private static final SubLList $list26;
  private static final SubLList $list27;
  private static final SubLSymbol $kw28$CORBA_H_P_A_C_K_S_CORBA_SET_CLASS_METHOD_ARGS_STORAGE;
  private static final SubLString $str29$__corbaSetClassMethodArgs;
  private static final SubLObject $const30$corbaSetClassMethodArgs;
  private static final SubLList $list31;
  private static final SubLList $list32;
  private static final SubLSymbol $kw33$CORBA_H_P_A_C_K_S_CORBA_SET_CLASS_FIELD_ARG_STORAGE;
  private static final SubLString $str34$__corbaSetClassFieldArg;
  private static final SubLObject $const35$corbaSetClassFieldArg;
  private static final SubLList $list36;
  private static final SubLList $list37;
  private static final SubLSymbol $sym38$PRED;
  private static final SubLSymbol $sym39$CDOLIST;
  private static final SubLList $list40;
  private static final SubLSymbol $sym41$CORBA_SKS_UNDECLARE_STORAGE_MODULE;
  private static final SubLList $list42;
  private static final SubLSymbol $sym43$NAME;
  private static final SubLSymbol $sym44$MAKE_CORBA_MODULE_NAME_KEYWORD;
  private static final SubLSymbol $sym45$UNDECLARE_HL_STORAGE_MODULE;
  private static final SubLSymbol $sym46$UN_NOTE_SKSI_CORBA_MODULE;

  @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-storage-module-macros.lisp", position = 855L)
  public static SubLObject corba_sks_declare_storage_module_suite(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject sks = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    sks = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject content_mt = $sym1$CONTENT_MT;
      return ConsesLow.list( new SubLObject[] { $sym2$CLET, ConsesLow.list( ConsesLow.list( content_mt, ConsesLow.list( $sym3$SKS_GET_CONTENT_MT, sks ) ) ), ConsesLow.list( $sym4$HL_STORAGE_MODULE,
          $kw5$CORBA_H_P_A_C_K_S_CORBA_SET_OBJECT_METHOD_ARGS_STORAGE, ConsesLow.list( new SubLObject[]
          { $sym6$LIST, $kw7$PRETTY_NAME, $str8$__corbaSetObjectMethodArgs, $kw9$ARGUMENT_TYPE, $kw10$ARGUMENT, $kw11$PREDICATE, $const12$corbaSetObjectMethodArgs, $kw13$APPLICABILITY, $list14, $kw15$INCOMPLETENESS,
            $list16, $kw17$ADD, $list18, $kw19$REQUIRED_MT, content_mt
          } ) ), $list20, $list21, ConsesLow.list( $sym22$NOTE_SKSI_CORBA_MODULE, $kw5$CORBA_H_P_A_C_K_S_CORBA_SET_OBJECT_METHOD_ARGS_STORAGE, content_mt ), ConsesLow.list( $sym4$HL_STORAGE_MODULE,
              $kw23$CORBA_H_P_A_C_K_S_CORBA_SET_OBJECT_FIELD_ARG_STORAGE, ConsesLow.list( new SubLObject[]
              { $sym6$LIST, $kw7$PRETTY_NAME, $str24$__corbaSetObjectFieldArg, $kw9$ARGUMENT_TYPE, $kw10$ARGUMENT, $kw11$PREDICATE, $const25$corbaSetObjectFieldArg, $kw13$APPLICABILITY, $list26, $kw15$INCOMPLETENESS,
                $list16, $kw17$ADD, $list18, $kw19$REQUIRED_MT, content_mt
              } ) ), $list27, $list21, ConsesLow.list( $sym22$NOTE_SKSI_CORBA_MODULE, $kw23$CORBA_H_P_A_C_K_S_CORBA_SET_OBJECT_FIELD_ARG_STORAGE, content_mt ), ConsesLow.list( $sym4$HL_STORAGE_MODULE,
                  $kw28$CORBA_H_P_A_C_K_S_CORBA_SET_CLASS_METHOD_ARGS_STORAGE, ConsesLow.list( new SubLObject[]
                  { $sym6$LIST, $kw7$PRETTY_NAME, $str29$__corbaSetClassMethodArgs, $kw9$ARGUMENT_TYPE, $kw10$ARGUMENT, $kw11$PREDICATE, $const30$corbaSetClassMethodArgs, $kw13$APPLICABILITY, $list31,
                    $kw15$INCOMPLETENESS, $list16, $kw17$ADD, $list18, $kw19$REQUIRED_MT, content_mt
                  } ) ), $list32, $list21, ConsesLow.list( $sym22$NOTE_SKSI_CORBA_MODULE, $kw28$CORBA_H_P_A_C_K_S_CORBA_SET_CLASS_METHOD_ARGS_STORAGE, content_mt ), ConsesLow.list( $sym4$HL_STORAGE_MODULE,
                      $kw33$CORBA_H_P_A_C_K_S_CORBA_SET_CLASS_FIELD_ARG_STORAGE, ConsesLow.list( new SubLObject[]
                      { $sym6$LIST, $kw7$PRETTY_NAME, $str34$__corbaSetClassFieldArg, $kw9$ARGUMENT_TYPE, $kw10$ARGUMENT, $kw11$PREDICATE, $const35$corbaSetClassFieldArg, $kw13$APPLICABILITY, $list36,
                        $kw15$INCOMPLETENESS, $list16, $kw17$ADD, $list18, $kw19$REQUIRED_MT, content_mt
                      } ) ), $list37, $list21, ConsesLow.list( $sym22$NOTE_SKSI_CORBA_MODULE, $kw33$CORBA_H_P_A_C_K_S_CORBA_SET_CLASS_FIELD_ARG_STORAGE, content_mt )
      } );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-storage-module-macros.lisp", position = 4555L)
  public static SubLObject corba_sks_undeclare_storage_module_suite(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject sks = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    sks = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject pred = $sym38$PRED;
      return ConsesLow.list( $sym39$CDOLIST, reader.bq_cons( pred, $list40 ), ConsesLow.list( $sym41$CORBA_SKS_UNDECLARE_STORAGE_MODULE, sks, pred ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-storage-module-macros.lisp", position = 4763L)
  public static SubLObject corba_sks_undeclare_storage_module(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject sks = NIL;
    SubLObject pred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list42 );
    sks = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list42 );
    pred = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject name = $sym43$NAME;
      return ConsesLow.list( $sym2$CLET, ConsesLow.list( ConsesLow.list( name, ConsesLow.list( $sym44$MAKE_CORBA_MODULE_NAME_KEYWORD, sks, pred ) ) ), ConsesLow.list( $sym45$UNDECLARE_HL_STORAGE_MODULE, name ), ConsesLow
          .list( $sym46$UN_NOTE_SKSI_CORBA_MODULE, name ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list42 );
    return NIL;
  }

  public static SubLObject declare_corba_storage_module_macros_file()
  {
    SubLFiles.declareMacro( me, "corba_sks_declare_storage_module_suite", "CORBA-SKS-DECLARE-STORAGE-MODULE-SUITE" );
    SubLFiles.declareMacro( me, "corba_sks_undeclare_storage_module_suite", "CORBA-SKS-UNDECLARE-STORAGE-MODULE-SUITE" );
    SubLFiles.declareMacro( me, "corba_sks_undeclare_storage_module", "CORBA-SKS-UNDECLARE-STORAGE-MODULE" );
    return NIL;
  }

  public static SubLObject init_corba_storage_module_macros_file()
  {
    return NIL;
  }

  public static SubLObject setup_corba_storage_module_macros_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_corba_storage_module_macros_file();
  }

  @Override
  public void initializeVariables()
  {
    init_corba_storage_module_macros_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_corba_storage_module_macros_file();
  }
  static
  {
    me = new corba_storage_module_macros();
    $list0 = ConsesLow.list( makeSymbol( "SKS" ) );
    $sym1$CONTENT_MT = makeUninternedSymbol( "CONTENT-MT" );
    $sym2$CLET = makeSymbol( "CLET" );
    $sym3$SKS_GET_CONTENT_MT = makeSymbol( "SKS-GET-CONTENT-MT" );
    $sym4$HL_STORAGE_MODULE = makeSymbol( "HL-STORAGE-MODULE" );
    $kw5$CORBA_H_P_A_C_K_S_CORBA_SET_OBJECT_METHOD_ARGS_STORAGE = makeKeyword( "CORBA-H-P-A-C-K-S-CORBA-SET-OBJECT-METHOD-ARGS-STORAGE" );
    $sym6$LIST = makeSymbol( "LIST" );
    $kw7$PRETTY_NAME = makeKeyword( "PRETTY-NAME" );
    $str8$__corbaSetObjectMethodArgs = makeString( "#$corbaSetObjectMethodArgs" );
    $kw9$ARGUMENT_TYPE = makeKeyword( "ARGUMENT-TYPE" );
    $kw10$ARGUMENT = makeKeyword( "ARGUMENT" );
    $kw11$PREDICATE = makeKeyword( "PREDICATE" );
    $const12$corbaSetObjectMethodArgs = constant_handles.reader_make_constant_shell( makeString( "corbaSetObjectMethodArgs" ) );
    $kw13$APPLICABILITY = makeKeyword( "APPLICABILITY" );
    $list14 = ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CORBA-SET-OBJECT-METHOD-ARGS-HL-STORAGE-MODULE-APPLICABLE?" ) );
    $kw15$INCOMPLETENESS = makeKeyword( "INCOMPLETENESS" );
    $list16 = ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CORBA-SET-HL-STORAGE-MODULE-INCOMPLETENESS" ) );
    $kw17$ADD = makeKeyword( "ADD" );
    $list18 = ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CORBA-SET-HL-STORAGE-MODULE-ASSERT" ) );
    $kw19$REQUIRED_MT = makeKeyword( "REQUIRED-MT" );
    $list20 = ConsesLow.list( makeSymbol( "REGISTER-SOLELY-SPECIFIC-HL-STORAGE-MODULE-PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "corbaSetObjectMethodArgs" ) ) );
    $list21 = ConsesLow.list( makeSymbol( "REGISTER-SOLELY-SPECIFIC-REMOVAL-MODULE-PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "corbaSetObjectMethodArgs" ) ) );
    $sym22$NOTE_SKSI_CORBA_MODULE = makeSymbol( "NOTE-SKSI-CORBA-MODULE" );
    $kw23$CORBA_H_P_A_C_K_S_CORBA_SET_OBJECT_FIELD_ARG_STORAGE = makeKeyword( "CORBA-H-P-A-C-K-S-CORBA-SET-OBJECT-FIELD-ARG-STORAGE" );
    $str24$__corbaSetObjectFieldArg = makeString( "#$corbaSetObjectFieldArg" );
    $const25$corbaSetObjectFieldArg = constant_handles.reader_make_constant_shell( makeString( "corbaSetObjectFieldArg" ) );
    $list26 = ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CORBA-SET-OBJECT-FIELD-ARG-HL-STORAGE-MODULE-APPLICABLE?" ) );
    $list27 = ConsesLow.list( makeSymbol( "REGISTER-SOLELY-SPECIFIC-HL-STORAGE-MODULE-PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "corbaSetObjectFieldArg" ) ) );
    $kw28$CORBA_H_P_A_C_K_S_CORBA_SET_CLASS_METHOD_ARGS_STORAGE = makeKeyword( "CORBA-H-P-A-C-K-S-CORBA-SET-CLASS-METHOD-ARGS-STORAGE" );
    $str29$__corbaSetClassMethodArgs = makeString( "#$corbaSetClassMethodArgs" );
    $const30$corbaSetClassMethodArgs = constant_handles.reader_make_constant_shell( makeString( "corbaSetClassMethodArgs" ) );
    $list31 = ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CORBA-SET-CLASS-METHOD-ARGS-HL-STORAGE-MODULE-APPLICABLE?" ) );
    $list32 = ConsesLow.list( makeSymbol( "REGISTER-SOLELY-SPECIFIC-HL-STORAGE-MODULE-PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "corbaSetClassMethodArgs" ) ) );
    $kw33$CORBA_H_P_A_C_K_S_CORBA_SET_CLASS_FIELD_ARG_STORAGE = makeKeyword( "CORBA-H-P-A-C-K-S-CORBA-SET-CLASS-FIELD-ARG-STORAGE" );
    $str34$__corbaSetClassFieldArg = makeString( "#$corbaSetClassFieldArg" );
    $const35$corbaSetClassFieldArg = constant_handles.reader_make_constant_shell( makeString( "corbaSetClassFieldArg" ) );
    $list36 = ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CORBA-SET-CLASS-FIELD-ARG-HL-STORAGE-MODULE-APPLICABLE?" ) );
    $list37 = ConsesLow.list( makeSymbol( "REGISTER-SOLELY-SPECIFIC-HL-STORAGE-MODULE-PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "corbaSetClassFieldArg" ) ) );
    $sym38$PRED = makeUninternedSymbol( "PRED" );
    $sym39$CDOLIST = makeSymbol( "CDOLIST" );
    $list40 = ConsesLow.list( ConsesLow.list( makeSymbol( "GET-CORBA-STORAGE-PREDICATES" ) ) );
    $sym41$CORBA_SKS_UNDECLARE_STORAGE_MODULE = makeSymbol( "CORBA-SKS-UNDECLARE-STORAGE-MODULE" );
    $list42 = ConsesLow.list( makeSymbol( "SKS" ), makeSymbol( "PRED" ) );
    $sym43$NAME = makeUninternedSymbol( "NAME" );
    $sym44$MAKE_CORBA_MODULE_NAME_KEYWORD = makeSymbol( "MAKE-CORBA-MODULE-NAME-KEYWORD" );
    $sym45$UNDECLARE_HL_STORAGE_MODULE = makeSymbol( "UNDECLARE-HL-STORAGE-MODULE" );
    $sym46$UN_NOTE_SKSI_CORBA_MODULE = makeSymbol( "UN-NOTE-SKSI-CORBA-MODULE" );
  }
}
/*
 * 
 * Total time: 31 ms
 * 
 */