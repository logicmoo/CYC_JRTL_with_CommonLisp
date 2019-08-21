package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.system_version;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.system_version.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class system_version extends SubLTranslatedFile {
    public static final SubLFile me = new system_version();

    public static final String myName = "com.cyc.cycjava.cycl.system_version";

    public static final String myFingerPrint = "0cbfc53831059a587a69ea41d7a606d86e012b6feaf7ad98b221bb809cbcc4f1";

    // defparameter
    // Definitions
    public static final SubLSymbol $cyc_raw_revision_string$ = makeSymbol("*CYC-RAW-REVISION-STRING*");

    // defparameter
    public static final SubLSymbol $cyc_major_version_number$ = makeSymbol("*CYC-MAJOR-VERSION-NUMBER*");

    // defparameter
    public static final SubLSymbol $cyc_revision_numbers$ = makeSymbol("*CYC-REVISION-NUMBERS*");

    // defparameter
    public static final SubLSymbol $cyc_revision_string$ = makeSymbol("*CYC-REVISION-STRING*");

    // defparameter
    public static final SubLSymbol $cycl_common_revision$ = makeSymbol("*CYCL-COMMON-REVISION*");

    // defparameter
    public static final SubLSymbol $cycl_crtl_revision$ = makeSymbol("*CYCL-CRTL-REVISION*");

    // defparameter
    public static final SubLSymbol $cycl_translator_revision$ = makeSymbol("*CYCL-TRANSLATOR-REVISION*");

    // defparameter
    public static final SubLSymbol $cycl_opencyc_revision$ = makeSymbol("*CYCL-OPENCYC-REVISION*");

    // defparameter
    public static final SubLSymbol $cycl_framework_revision$ = makeSymbol("*CYCL-FRAMEWORK-REVISION*");

    // defparameter
    public static final SubLSymbol $cycl_sublisp_revision$ = makeSymbol("*CYCL-SUBLISP-REVISION*");

    // defparameter
    public static final SubLSymbol $cycl_tests_revision$ = makeSymbol("*CYCL-TESTS-REVISION*");

    // defparameter
    public static final SubLSymbol $cycl_mysentient_revision$ = makeSymbol("*CYCL-MYSENTIENT-REVISION*");

    // defparameter
    public static final SubLSymbol $cycl_butler_revision$ = makeSymbol("*CYCL-BUTLER-REVISION*");

    // defparameter
    public static final SubLSymbol $cycl_tool_revision$ = makeSymbol("*CYCL-TOOL-REVISION*");

    // defparameter
    public static final SubLSymbol $cycl_EEEEEEE_revision$ = makeSymbol("*CYCL-=======-REVISION*");

    private static final SubLString $str0$_Revision__152303__ = makeString("$Revision: 152303 $");

    private static final SubLString $str1$1_269 = makeString("1.269");

    private static final SubLString $str2$1_555 = makeString("1.555");

    private static final SubLString $str3$1_69 = makeString("1.69");

    private static final SubLString $str4$1_391 = makeString("1.391");

    private static final SubLString $str5$1_1767 = makeString("1.1767");

    private static final SubLString $str6$1_319 = makeString("1.319");

    private static final SubLString $str7$1_907 = makeString("1.907");

    private static final SubLString $str8$1_437 = makeString("1.437");

    private static final SubLString $str9$1_277 = makeString("1.277");

    private static final SubLString $str10$1_652 = makeString("1.652");

    private static final SubLString $str11$ = makeString("");

    public static SubLObject declare_system_version_file() {
        return NIL;
    }

    public static SubLObject init_system_version_file() {
        defparameter("*CYC-RAW-REVISION-STRING*", $str0$_Revision__152303__);
        defparameter("*CYC-MAJOR-VERSION-NUMBER*", TEN_INTEGER);
        defparameter("*CYC-REVISION-NUMBERS*", cyc_revision_extraction.extract_cyc_revision_numbers(cyc_revision_extraction.extract_cyc_revision_string($cyc_raw_revision_string$.getDynamicValue()), $cyc_major_version_number$.getDynamicValue()));
        defparameter("*CYC-REVISION-STRING*", cyc_revision_extraction.construct_cyc_revision_string_from_numbers($cyc_revision_numbers$.getDynamicValue()));
        defparameter("*CYCL-COMMON-REVISION*", $str1$1_269);
        defparameter("*CYCL-CRTL-REVISION*", $str2$1_555);
        defparameter("*CYCL-TRANSLATOR-REVISION*", $str3$1_69);
        defparameter("*CYCL-OPENCYC-REVISION*", $str4$1_391);
        defparameter("*CYCL-FRAMEWORK-REVISION*", $str5$1_1767);
        defparameter("*CYCL-SUBLISP-REVISION*", $str6$1_319);
        defparameter("*CYCL-TESTS-REVISION*", $str7$1_907);
        defparameter("*CYCL-MYSENTIENT-REVISION*", $str8$1_437);
        defparameter("*CYCL-BUTLER-REVISION*", $str9$1_277);
        defparameter("*CYCL-TOOL-REVISION*", $str10$1_652);
        defparameter("*CYCL-=======-REVISION*", $str11$);
        return NIL;
    }

    public static SubLObject setup_system_version_file() {
        return NIL;
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




























    }
}

/**
 * Total time: 103 ms
 */
