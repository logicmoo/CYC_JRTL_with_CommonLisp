package com.cyc.cycjava.cycl;

import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cyc_cvs_id extends SubLTranslatedFile {
    public static final SubLFile me = new cyc_cvs_id();

    public static final String myName = "com.cyc.cycjava.cycl.cyc_cvs_id";

    public static final String myFingerPrint = "2eb21c5cafffa30579c15615587b57bb09a1d77d70971956497b4820a75bed61";

    // defvar
    // Definitions
    public static final SubLSymbol $cvs_id$ = makeSymbol("*CVS-ID*");

    public static SubLObject declare_cyc_cvs_id_file() {
	return NIL;
    }

    public static SubLObject init_cyc_cvs_id_file() {
	defvar("*CVS-ID*", NIL);
	return NIL;
    }

    public static SubLObject setup_cyc_cvs_id_file() {
	return NIL;
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

    
}

/**
 * Total time: 61 ms
 */
