package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sunit_external
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.sunit_external";
  public static final String myFingerPrint = "910360736e8d29307f473f21e268f571275ab4c865706cbf559e517b34db9f6e";
  private static final SubLSymbol $sym0$STRINGP;

  @SubLTranslatedFile.SubL(source = "cycl/sunit-external.lisp", position = 1208L)
  public static SubLObject define_test_category(final SubLObject name, SubLObject supercategories)
  {
    if( supercategories == UNPROVIDED )
    {
      supercategories = NIL;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sunit-external.lisp", position = 2922L)
  public static SubLObject rename_test_category(final SubLObject old_name, final SubLObject new_name)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sunit-external.lisp", position = 6578L)
  public static SubLObject undefine_test_category(final SubLObject test_category_name)
  {
    assert NIL != Types.stringp( test_category_name ) : test_category_name;
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sunit-external.lisp", position = 7157L)
  public static SubLObject define_test_suite(final SubLObject name, SubLObject categories, SubLObject v_modules, SubLObject test_cases)
  {
    if( categories == UNPROVIDED )
    {
      categories = NIL;
    }
    if( v_modules == UNPROVIDED )
    {
      v_modules = NIL;
    }
    if( test_cases == UNPROVIDED )
    {
      test_cases = NIL;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sunit-external.lisp", position = 9459L)
  public static SubLObject rename_test_suite(final SubLObject old_name, final SubLObject new_name)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sunit-external.lisp", position = 11942L)
  public static SubLObject undefine_test_suite(final SubLObject test_suite_name)
  {
    assert NIL != Types.stringp( test_suite_name ) : test_suite_name;
    return NIL;
  }

  public static SubLObject declare_sunit_external_file()
  {
    SubLFiles.declareFunction( me, "define_test_category", "DEFINE-TEST-CATEGORY", 1, 1, false );
    SubLFiles.declareFunction( me, "rename_test_category", "RENAME-TEST-CATEGORY", 2, 0, false );
    SubLFiles.declareFunction( me, "undefine_test_category", "UNDEFINE-TEST-CATEGORY", 1, 0, false );
    SubLFiles.declareFunction( me, "define_test_suite", "DEFINE-TEST-SUITE", 1, 3, false );
    SubLFiles.declareFunction( me, "rename_test_suite", "RENAME-TEST-SUITE", 2, 0, false );
    SubLFiles.declareFunction( me, "undefine_test_suite", "UNDEFINE-TEST-SUITE", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_sunit_external_file()
  {
    return NIL;
  }

  public static SubLObject setup_sunit_external_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_sunit_external_file();
  }

  @Override
  public void initializeVariables()
  {
    init_sunit_external_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_sunit_external_file();
  }
  static
  {
    me = new sunit_external();
    $sym0$STRINGP = makeSymbol( "STRINGP" );
  }
}
/*
 * 
 * Total time: 24 ms
 * 
 */