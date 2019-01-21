package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cyc_cvs_id extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.cyc_cvs_id";
    public static final String myFingerPrint = "2eb21c5cafffa30579c15615587b57bb09a1d77d70971956497b4820a75bed61";
    @SubLTranslatedFile.SubL(source = "cycl/cyc-cvs-id.lisp", position = 182L)
    public static SubLSymbol $cvs_id$;
    
    public static SubLObject declare_cyc_cvs_id_file() {
        return (SubLObject)cyc_cvs_id.NIL;
    }
    
    public static SubLObject init_cyc_cvs_id_file() {
        cyc_cvs_id.$cvs_id$ = SubLFiles.defvar("*CVS-ID*", (SubLObject)cyc_cvs_id.NIL);
        return (SubLObject)cyc_cvs_id.NIL;
    }
    
    public static SubLObject setup_cyc_cvs_id_file() {
        return (SubLObject)cyc_cvs_id.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_cyc_cvs_id_file();
    }
    
    @Override
	public void initializeVariables() {
        init_cyc_cvs_id_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_cyc_cvs_id_file();
    }
    
    static {
        me = (SubLFile)new cyc_cvs_id();
        cyc_cvs_id.$cvs_id$ = null;
    }
}

/*

	Total time: 61 ms
	
*/