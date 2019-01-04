package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class gt_modules extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.gt_modules";
    public static final String myFingerPrint = "bab57206a76c8829dcc761c51b295a5124f0095b7d7efecbced866c7284231f9";
    
    public static SubLObject declare_gt_modules_file() {
        return (SubLObject)gt_modules.NIL;
    }
    
    public static SubLObject init_gt_modules_file() {
        return (SubLObject)gt_modules.NIL;
    }
    
    public static SubLObject setup_gt_modules_file() {
        return (SubLObject)gt_modules.NIL;
    }
    
    public void declareFunctions() {
        declare_gt_modules_file();
    }
    
    public void initializeVariables() {
        init_gt_modules_file();
    }
    
    public void runTopLevelForms() {
        setup_gt_modules_file();
    }
    
    static {
        me = (SubLFile)new gt_modules();
    }
}

/*

	Total time: 63 ms
	
*/