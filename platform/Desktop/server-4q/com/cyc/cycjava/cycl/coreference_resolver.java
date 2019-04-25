package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class coreference_resolver extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.coreference_resolver";
    public static final String myFingerPrint = "b2c20504bf9ce1e77c6ebcf25058faa554baf58154cfe4e8caa2d2d925847eea";
    private static final SubLSymbol $sym0$COREFERENCE_RESOLVER;
    private static final SubLList $list1;
    
    @SubLTranslatedFile.SubL(source = "cycl/coreference-resolver.lisp", position = 969L)
    public static SubLObject coreference_resolver_p(final SubLObject v_coreference_resolver) {
        return interfaces.subloop_instanceof_interface(v_coreference_resolver, (SubLObject)coreference_resolver.$sym0$COREFERENCE_RESOLVER);
    }
    
    public static SubLObject declare_coreference_resolver_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.coreference_resolver", "coreference_resolver_p", "COREFERENCE-RESOLVER-P", 1, 0, false);
        return (SubLObject)coreference_resolver.NIL;
    }
    
    public static SubLObject init_coreference_resolver_file() {
        return (SubLObject)coreference_resolver.NIL;
    }
    
    public static SubLObject setup_coreference_resolver_file() {
        interfaces.new_interface((SubLObject)coreference_resolver.$sym0$COREFERENCE_RESOLVER, (SubLObject)coreference_resolver.NIL, (SubLObject)coreference_resolver.NIL, (SubLObject)coreference_resolver.$list1);
        return (SubLObject)coreference_resolver.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_coreference_resolver_file();
    }
    
    @Override
	public void initializeVariables() {
        init_coreference_resolver_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_coreference_resolver_file();
    }
    
    static {
        me = (SubLFile)new coreference_resolver();
        $sym0$COREFERENCE_RESOLVER = SubLObjectFactory.makeSymbol("COREFERENCE-RESOLVER");
        $list1 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("RUN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARSE-TREES")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
    }
}

/*

	Total time: 65 ms
	
*/