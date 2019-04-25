package com.cyc.cycjava.cycl.sksi.sksi_testing;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.sunit_external;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sksi_testing_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sksi.sksi_testing.sksi_testing_utilities";
    public static final String myFingerPrint = "448d6baf1454d24808bb6cd8767e45b8d051c61335639c51f94482af46f824a4";
    private static final SubLString $str0$SKSI_Category;
    private static final SubLString $str1$SKSI;
    private static final SubLList $list2;
    
    public static SubLObject declare_sksi_testing_utilities_file() {
        return (SubLObject)sksi_testing_utilities.NIL;
    }
    
    public static SubLObject init_sksi_testing_utilities_file() {
        return (SubLObject)sksi_testing_utilities.NIL;
    }
    
    public static SubLObject setup_sksi_testing_utilities_file() {
        sunit_external.define_test_category((SubLObject)sksi_testing_utilities.$str0$SKSI_Category, (SubLObject)sksi_testing_utilities.UNPROVIDED);
        sunit_external.define_test_suite((SubLObject)sksi_testing_utilities.$str1$SKSI, (SubLObject)sksi_testing_utilities.$list2, (SubLObject)sksi_testing_utilities.UNPROVIDED, (SubLObject)sksi_testing_utilities.UNPROVIDED);
        return (SubLObject)sksi_testing_utilities.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_sksi_testing_utilities_file();
    }
    
    @Override
	public void initializeVariables() {
        init_sksi_testing_utilities_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_sksi_testing_utilities_file();
    }
    
    static {
        me = (SubLFile)new sksi_testing_utilities();
        $str0$SKSI_Category = SubLObjectFactory.makeString("SKSI Category");
        $str1$SKSI = SubLObjectFactory.makeString("SKSI");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("SKSI Category"));
    }
}

/*

	Total time: 95 ms
	
*/