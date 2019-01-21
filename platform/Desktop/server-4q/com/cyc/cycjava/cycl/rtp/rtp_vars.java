package com.cyc.cycjava.cycl.rtp;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rtp_vars extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.rtp.rtp_vars";
    public static final String myFingerPrint = "3d1aa3c22f147246fc25af0b87d2516fd93576868ede49c71746e3d6eab21fbc";
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-vars.lisp", position = 742L)
    public static SubLSymbol $tp_equal$;
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-vars.lisp", position = 776L)
    public static SubLSymbol $rtp_semantic_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-vars.lisp", position = 873L)
    public static SubLSymbol $rtp_syntactic_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-vars.lisp", position = 1004L)
    public static SubLSymbol $rtp_trace_level$;
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-vars.lisp", position = 1137L)
    public static SubLSymbol $rtp_return_style$;
    private static final SubLObject $const0$AllEnglishTemplateMt;
    private static final SubLSymbol $kw1$SIMPLE;
    
    public static SubLObject declare_rtp_vars_file() {
        return (SubLObject)rtp_vars.NIL;
    }
    
    public static SubLObject init_rtp_vars_file() {
        rtp_vars.$tp_equal$ = SubLFiles.deflexical("*TP-EQUAL*", Symbols.symbol_function((SubLObject)rtp_vars.EQUALP));
        rtp_vars.$rtp_semantic_mt$ = SubLFiles.defparameter("*RTP-SEMANTIC-MT*", (SubLObject)rtp_vars.NIL);
        rtp_vars.$rtp_syntactic_mt$ = SubLFiles.defparameter("*RTP-SYNTACTIC-MT*", rtp_vars.$const0$AllEnglishTemplateMt);
        rtp_vars.$rtp_trace_level$ = SubLFiles.defparameter("*RTP-TRACE-LEVEL*", (SubLObject)rtp_vars.ZERO_INTEGER);
        rtp_vars.$rtp_return_style$ = SubLFiles.defparameter("*RTP-RETURN-STYLE*", (SubLObject)rtp_vars.$kw1$SIMPLE);
        return (SubLObject)rtp_vars.NIL;
    }
    
    public static SubLObject setup_rtp_vars_file() {
        return (SubLObject)rtp_vars.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_rtp_vars_file();
    }
    
    @Override
	public void initializeVariables() {
        init_rtp_vars_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_rtp_vars_file();
    }
    
    static {
        me = (SubLFile)new rtp_vars();
        rtp_vars.$tp_equal$ = null;
        rtp_vars.$rtp_semantic_mt$ = null;
        rtp_vars.$rtp_syntactic_mt$ = null;
        rtp_vars.$rtp_trace_level$ = null;
        rtp_vars.$rtp_return_style$ = null;
        $const0$AllEnglishTemplateMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AllEnglishTemplateMt"));
        $kw1$SIMPLE = SubLObjectFactory.makeKeyword("SIMPLE");
    }
}

/*

	Total time: 10 ms
	
*/