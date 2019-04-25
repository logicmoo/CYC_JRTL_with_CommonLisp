package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class system_version extends SubLTranslatedFile
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
    
    public static SubLObject declare_system_version_file() {
        return (SubLObject)system_version.NIL;
    }
    
    public static SubLObject init_system_version_file() {
        system_version.$cyc_raw_revision_string$ = SubLFiles.defparameter("*CYC-RAW-REVISION-STRING*", (SubLObject)system_version.$str0$_Revision__152303__);
        system_version.$cyc_major_version_number$ = SubLFiles.defparameter("*CYC-MAJOR-VERSION-NUMBER*", (SubLObject)system_version.TEN_INTEGER);
        system_version.$cyc_revision_numbers$ = SubLFiles.defparameter("*CYC-REVISION-NUMBERS*", cyc_revision_extraction.extract_cyc_revision_numbers(cyc_revision_extraction.extract_cyc_revision_string(system_version.$cyc_raw_revision_string$.getDynamicValue()), system_version.$cyc_major_version_number$.getDynamicValue()));
        system_version.$cyc_revision_string$ = SubLFiles.defparameter("*CYC-REVISION-STRING*", cyc_revision_extraction.construct_cyc_revision_string_from_numbers(system_version.$cyc_revision_numbers$.getDynamicValue()));
        system_version.$cycl_common_revision$ = SubLFiles.defparameter("*CYCL-COMMON-REVISION*", (SubLObject)system_version.$str1$1_269);
        system_version.$cycl_crtl_revision$ = SubLFiles.defparameter("*CYCL-CRTL-REVISION*", (SubLObject)system_version.$str2$1_555);
        system_version.$cycl_translator_revision$ = SubLFiles.defparameter("*CYCL-TRANSLATOR-REVISION*", (SubLObject)system_version.$str3$1_69);
        system_version.$cycl_opencyc_revision$ = SubLFiles.defparameter("*CYCL-OPENCYC-REVISION*", (SubLObject)system_version.$str4$1_391);
        system_version.$cycl_framework_revision$ = SubLFiles.defparameter("*CYCL-FRAMEWORK-REVISION*", (SubLObject)system_version.$str5$1_1767);
        system_version.$cycl_sublisp_revision$ = SubLFiles.defparameter("*CYCL-SUBLISP-REVISION*", (SubLObject)system_version.$str6$1_319);
        system_version.$cycl_tests_revision$ = SubLFiles.defparameter("*CYCL-TESTS-REVISION*", (SubLObject)system_version.$str7$1_907);
        system_version.$cycl_mysentient_revision$ = SubLFiles.defparameter("*CYCL-MYSENTIENT-REVISION*", (SubLObject)system_version.$str8$1_437);
        system_version.$cycl_butler_revision$ = SubLFiles.defparameter("*CYCL-BUTLER-REVISION*", (SubLObject)system_version.$str9$1_277);
        system_version.$cycl_tool_revision$ = SubLFiles.defparameter("*CYCL-TOOL-REVISION*", (SubLObject)system_version.$str10$1_652);
        system_version.$cycl_EEEEEEE_revision$ = SubLFiles.defparameter("*CYCL-=======-REVISION*", (SubLObject)system_version.$str11$);
        return (SubLObject)system_version.NIL;
    }
    
    public static SubLObject setup_system_version_file() {
        return (SubLObject)system_version.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_system_version_file();
    }
    
    @Override
	public void initializeVariables() {
        init_system_version_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_system_version_file();
    }
    
    static {
        me = (SubLFile)new system_version();
        system_version.$cyc_raw_revision_string$ = null;
        system_version.$cyc_major_version_number$ = null;
        system_version.$cyc_revision_numbers$ = null;
        system_version.$cyc_revision_string$ = null;
        system_version.$cycl_common_revision$ = null;
        system_version.$cycl_crtl_revision$ = null;
        system_version.$cycl_translator_revision$ = null;
        system_version.$cycl_opencyc_revision$ = null;
        system_version.$cycl_framework_revision$ = null;
        system_version.$cycl_sublisp_revision$ = null;
        system_version.$cycl_tests_revision$ = null;
        system_version.$cycl_mysentient_revision$ = null;
        system_version.$cycl_butler_revision$ = null;
        system_version.$cycl_tool_revision$ = null;
        system_version.$cycl_EEEEEEE_revision$ = null;
        $str0$_Revision__152303__ = SubLObjectFactory.makeString("$Revision: 152303 $");
        $str1$1_269 = SubLObjectFactory.makeString("1.269");
        $str2$1_555 = SubLObjectFactory.makeString("1.555");
        $str3$1_69 = SubLObjectFactory.makeString("1.69");
        $str4$1_391 = SubLObjectFactory.makeString("1.391");
        $str5$1_1767 = SubLObjectFactory.makeString("1.1767");
        $str6$1_319 = SubLObjectFactory.makeString("1.319");
        $str7$1_907 = SubLObjectFactory.makeString("1.907");
        $str8$1_437 = SubLObjectFactory.makeString("1.437");
        $str9$1_277 = SubLObjectFactory.makeString("1.277");
        $str10$1_652 = SubLObjectFactory.makeString("1.652");
        $str11$ = SubLObjectFactory.makeString("");
    }
}

/*

	Total time: 103 ms
	
*/