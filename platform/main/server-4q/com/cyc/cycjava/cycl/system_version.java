package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class system_version
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.system_version";
  public static final String myFingerPrint = "0cbfc53831059a587a69ea41d7a606d86e012b6feaf7ad98b221bb809cbcc4f1";
  @SubLTranslatedFile.SubL(source = "cycl/system-version.lisp", position = 557L)
  public static SubLSymbol $cyc_raw_revision_string$;
  @SubLTranslatedFile.SubL(source = "cycl/system-version.lisp", position = 696L)
  public static SubLSymbol $cyc_major_version_number$;
  @SubLTranslatedFile.SubL(source = "cycl/system-version.lisp", position = 742L)
  public static SubLSymbol $cyc_revision_numbers$;
  @SubLTranslatedFile.SubL(source = "cycl/system-version.lisp", position = 912L)
  public static SubLSymbol $cyc_revision_string$;
  @SubLTranslatedFile.SubL(source = "cycl/system-version.lisp", position = 1024L)
  public static SubLSymbol $cycl_common_revision$;
  @SubLTranslatedFile.SubL(source = "cycl/system-version.lisp", position = 1345L)
  public static SubLSymbol $cycl_crtl_revision$;
  @SubLTranslatedFile.SubL(source = "cycl/system-version.lisp", position = 1389L)
  public static SubLSymbol $cycl_translator_revision$;
  @SubLTranslatedFile.SubL(source = "cycl/system-version.lisp", position = 1438L)
  public static SubLSymbol $cycl_opencyc_revision$;
  @SubLTranslatedFile.SubL(source = "cycl/system-version.lisp", position = 1485L)
  public static SubLSymbol $cycl_framework_revision$;
  @SubLTranslatedFile.SubL(source = "cycl/system-version.lisp", position = 1535L)
  public static SubLSymbol $cycl_sublisp_revision$;
  @SubLTranslatedFile.SubL(source = "cycl/system-version.lisp", position = 1582L)
  public static SubLSymbol $cycl_tests_revision$;
  @SubLTranslatedFile.SubL(source = "cycl/system-version.lisp", position = 1627L)
  public static SubLSymbol $cycl_mysentient_revision$;
  @SubLTranslatedFile.SubL(source = "cycl/system-version.lisp", position = 1677L)
  public static SubLSymbol $cycl_butler_revision$;
  @SubLTranslatedFile.SubL(source = "cycl/system-version.lisp", position = 1723L)
  public static SubLSymbol $cycl_tool_revision$;
  @SubLTranslatedFile.SubL(source = "cycl/system-version.lisp", position = 1767L)
  public static SubLSymbol $cycl_EEEEEEE_revision$;
  private static final SubLString $str0$_Revision__152303__;
  private static final SubLString $str1$1_269;
  private static final SubLString $str2$1_555;
  private static final SubLString $str3$1_69;
  private static final SubLString $str4$1_391;
  private static final SubLString $str5$1_1767;
  private static final SubLString $str6$1_319;
  private static final SubLString $str7$1_907;
  private static final SubLString $str8$1_437;
  private static final SubLString $str9$1_277;
  private static final SubLString $str10$1_652;
  private static final SubLString $str11$;

  public static SubLObject declare_system_version_file()
  {
    return NIL;
  }

  public static SubLObject init_system_version_file()
  {
    $cyc_raw_revision_string$ = SubLFiles.defparameter( "*CYC-RAW-REVISION-STRING*", $str0$_Revision__152303__ );
    $cyc_major_version_number$ = SubLFiles.defparameter( "*CYC-MAJOR-VERSION-NUMBER*", TEN_INTEGER );
    $cyc_revision_numbers$ = SubLFiles.defparameter( "*CYC-REVISION-NUMBERS*", cyc_revision_extraction.extract_cyc_revision_numbers( cyc_revision_extraction.extract_cyc_revision_string( $cyc_raw_revision_string$
        .getDynamicValue() ), $cyc_major_version_number$.getDynamicValue() ) );
    $cyc_revision_string$ = SubLFiles.defparameter( "*CYC-REVISION-STRING*", cyc_revision_extraction.construct_cyc_revision_string_from_numbers( $cyc_revision_numbers$.getDynamicValue() ) );
    $cycl_common_revision$ = SubLFiles.defparameter( "*CYCL-COMMON-REVISION*", $str1$1_269 );
    $cycl_crtl_revision$ = SubLFiles.defparameter( "*CYCL-CRTL-REVISION*", $str2$1_555 );
    $cycl_translator_revision$ = SubLFiles.defparameter( "*CYCL-TRANSLATOR-REVISION*", $str3$1_69 );
    $cycl_opencyc_revision$ = SubLFiles.defparameter( "*CYCL-OPENCYC-REVISION*", $str4$1_391 );
    $cycl_framework_revision$ = SubLFiles.defparameter( "*CYCL-FRAMEWORK-REVISION*", $str5$1_1767 );
    $cycl_sublisp_revision$ = SubLFiles.defparameter( "*CYCL-SUBLISP-REVISION*", $str6$1_319 );
    $cycl_tests_revision$ = SubLFiles.defparameter( "*CYCL-TESTS-REVISION*", $str7$1_907 );
    $cycl_mysentient_revision$ = SubLFiles.defparameter( "*CYCL-MYSENTIENT-REVISION*", $str8$1_437 );
    $cycl_butler_revision$ = SubLFiles.defparameter( "*CYCL-BUTLER-REVISION*", $str9$1_277 );
    $cycl_tool_revision$ = SubLFiles.defparameter( "*CYCL-TOOL-REVISION*", $str10$1_652 );
    $cycl_EEEEEEE_revision$ = SubLFiles.defparameter( "*CYCL-=======-REVISION*", $str11$ );
    return NIL;
  }

  public static SubLObject setup_system_version_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_system_version_file();
  }

  @Override
  public void initializeVariables()
  {
    init_system_version_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_system_version_file();
  }
  static
  {
    me = new system_version();
    $cyc_raw_revision_string$ = null;
    $cyc_major_version_number$ = null;
    $cyc_revision_numbers$ = null;
    $cyc_revision_string$ = null;
    $cycl_common_revision$ = null;
    $cycl_crtl_revision$ = null;
    $cycl_translator_revision$ = null;
    $cycl_opencyc_revision$ = null;
    $cycl_framework_revision$ = null;
    $cycl_sublisp_revision$ = null;
    $cycl_tests_revision$ = null;
    $cycl_mysentient_revision$ = null;
    $cycl_butler_revision$ = null;
    $cycl_tool_revision$ = null;
    $cycl_EEEEEEE_revision$ = null;
    $str0$_Revision__152303__ = makeString( "$Revision: 152303 $" );
    $str1$1_269 = makeString( "1.269" );
    $str2$1_555 = makeString( "1.555" );
    $str3$1_69 = makeString( "1.69" );
    $str4$1_391 = makeString( "1.391" );
    $str5$1_1767 = makeString( "1.1767" );
    $str6$1_319 = makeString( "1.319" );
    $str7$1_907 = makeString( "1.907" );
    $str8$1_437 = makeString( "1.437" );
    $str9$1_277 = makeString( "1.277" );
    $str10$1_652 = makeString( "1.652" );
    $str11$ = makeString( "" );
  }
}
/*
 * 
 * Total time: 103 ms
 * 
 */