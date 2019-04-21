package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cyc_bookkeeping extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.cyc_bookkeeping";
    public static final String myFingerPrint = "5e63efaf0c4abecba62228f463ba077a2e4985a20a041af661f568e9b8b4de47";
    @SubLTranslatedFile.SubL(source = "cycl/cyc-bookkeeping.lisp", position = 761L)
    public static SubLSymbol $bookkeeping_enabledP$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-bookkeeping.lisp", position = 993L)
    public static SubLSymbol $cyc_bookkeeping_info$;
    private static final SubLSymbol $sym0$_BOOKKEEPING_ENABLED__;
    private static final SubLSymbol $sym1$WITH_BOOKKEEPING_INFO;
    private static final SubLList $list2;
    private static final SubLSymbol $sym3$CLET;
    private static final SubLSymbol $sym4$_CYC_BOOKKEEPING_INFO_;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$ASSERTION_VAR;
    private static final SubLSymbol $sym7$_THE_CYCLIST_;
    private static final SubLSymbol $sym8$ASSERTED_BY;
    private static final SubLSymbol $sym9$_THE_DATE_;
    private static final SubLSymbol $sym10$ASSERTED_WHEN;
    private static final SubLSymbol $sym11$_KE_PURPOSE_;
    private static final SubLSymbol $sym12$ASSERTED_WHY;
    private static final SubLSymbol $sym13$_THE_SECOND_;
    private static final SubLSymbol $sym14$ASSERTED_SECOND;
    private static final SubLList $list15;
    private static final SubLSymbol $sym16$PROGN;
    private static final SubLList $list17;
    private static final SubLSymbol $sym18$NEW_BOOKKEEPING_INFO;
    private static final SubLSymbol $kw19$SECOND;
    private static final SubLSymbol $kw20$PURPOSE;
    private static final SubLSymbol $kw21$WHEN;
    private static final SubLSymbol $kw22$WHO;
    private static final SubLSymbol $sym23$ASSERTION_P;
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-bookkeeping.lisp", position = 1155L)
    public static SubLObject with_bookkeeping_info(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject bookkeeping_info = (SubLObject)cyc_bookkeeping.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cyc_bookkeeping.$list2);
        bookkeeping_info = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)cyc_bookkeeping.$sym3$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)cyc_bookkeeping.$sym4$_CYC_BOOKKEEPING_INFO_, bookkeeping_info)), ConsesLow.append(body, (SubLObject)cyc_bookkeeping.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-bookkeeping.lisp", position = 1774L)
    public static SubLObject with_assertion_bookkeeping_info(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject assertion = (SubLObject)cyc_bookkeeping.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cyc_bookkeeping.$list5);
        assertion = current.first();
        final SubLObject body;
        current = (body = current.rest());
        final SubLObject assertion_var = (SubLObject)cyc_bookkeeping.$sym6$ASSERTION_VAR;
        return (SubLObject)ConsesLow.list((SubLObject)cyc_bookkeeping.$sym3$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(assertion_var, assertion), (SubLObject)ConsesLow.list((SubLObject)cyc_bookkeeping.$sym7$_THE_CYCLIST_, (SubLObject)ConsesLow.list((SubLObject)cyc_bookkeeping.$sym8$ASSERTED_BY, assertion_var)), (SubLObject)ConsesLow.list((SubLObject)cyc_bookkeeping.$sym9$_THE_DATE_, (SubLObject)ConsesLow.list((SubLObject)cyc_bookkeeping.$sym10$ASSERTED_WHEN, assertion_var)), (SubLObject)ConsesLow.list((SubLObject)cyc_bookkeeping.$sym11$_KE_PURPOSE_, (SubLObject)ConsesLow.list((SubLObject)cyc_bookkeeping.$sym12$ASSERTED_WHY, assertion_var)), (SubLObject)ConsesLow.list((SubLObject)cyc_bookkeeping.$sym13$_THE_SECOND_, (SubLObject)ConsesLow.list((SubLObject)cyc_bookkeeping.$sym14$ASSERTED_SECOND, assertion_var))), (SubLObject)ConsesLow.listS((SubLObject)cyc_bookkeeping.$sym1$WITH_BOOKKEEPING_INFO, (SubLObject)cyc_bookkeeping.$list15, ConsesLow.append(body, (SubLObject)cyc_bookkeeping.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-bookkeeping.lisp", position = 2545L)
    public static SubLObject possibly_with_bookkeeping_info(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject bookkeeping_info = (SubLObject)cyc_bookkeeping.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cyc_bookkeeping.$list2);
        bookkeeping_info = current.first();
        final SubLObject body;
        current = (body = current.rest());
        if (cyc_bookkeeping.NIL != bookkeeping_info) {
            return (SubLObject)ConsesLow.listS((SubLObject)cyc_bookkeeping.$sym1$WITH_BOOKKEEPING_INFO, bookkeeping_info, ConsesLow.append(body, (SubLObject)cyc_bookkeeping.NIL));
        }
        return reader.bq_cons((SubLObject)cyc_bookkeeping.$sym16$PROGN, ConsesLow.append(body, (SubLObject)cyc_bookkeeping.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-bookkeeping.lisp", position = 2868L)
    public static SubLObject without_bookkeeping(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)cyc_bookkeeping.$sym3$CLET, (SubLObject)cyc_bookkeeping.$list17, ConsesLow.append(body, (SubLObject)cyc_bookkeeping.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-bookkeeping.lisp", position = 3092L)
    public static SubLObject cyc_bookkeeping_info() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return cyc_bookkeeping.$cyc_bookkeeping_info$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-bookkeeping.lisp", position = 3211L)
    public static SubLObject do_bookkeepingP() {
        return (SubLObject)SubLObjectFactory.makeBoolean(cyc_bookkeeping.NIL != cyc_bookkeeping.$bookkeeping_enabledP$.getGlobalValue() && cyc_bookkeeping.NIL != cyc_bookkeeping_info());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-bookkeeping.lisp", position = 3315L)
    public static SubLObject new_bookkeeping_info(SubLObject who, SubLObject when, SubLObject why, SubLObject when_sec) {
        if (who == cyc_bookkeeping.UNPROVIDED) {
            who = (SubLObject)cyc_bookkeeping.NIL;
        }
        if (when == cyc_bookkeeping.UNPROVIDED) {
            when = (SubLObject)cyc_bookkeeping.NIL;
        }
        if (why == cyc_bookkeeping.UNPROVIDED) {
            why = (SubLObject)cyc_bookkeeping.NIL;
        }
        if (when_sec == cyc_bookkeeping.UNPROVIDED) {
            when_sec = (SubLObject)cyc_bookkeeping.NIL;
        }
        SubLObject plist = (SubLObject)cyc_bookkeeping.NIL;
        if (cyc_bookkeeping.NIL != when_sec) {
            plist = ConsesLow.nconc((SubLObject)ConsesLow.list((SubLObject)cyc_bookkeeping.$kw19$SECOND, when_sec), plist);
        }
        if (cyc_bookkeeping.NIL != why) {
            plist = ConsesLow.nconc((SubLObject)ConsesLow.list((SubLObject)cyc_bookkeeping.$kw20$PURPOSE, why), plist);
        }
        if (cyc_bookkeeping.NIL != when) {
            plist = ConsesLow.nconc((SubLObject)ConsesLow.list((SubLObject)cyc_bookkeeping.$kw21$WHEN, when), plist);
        }
        if (cyc_bookkeeping.NIL != who) {
            plist = ConsesLow.nconc((SubLObject)ConsesLow.list((SubLObject)cyc_bookkeeping.$kw22$WHO, who), plist);
        }
        return plist;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-bookkeeping.lisp", position = 3824L)
    public static SubLObject assertion_bookkeeping_info(final SubLObject assertion) {
        assert cyc_bookkeeping.NIL != assertion_handles.assertion_p(assertion) : assertion;
        final SubLObject who = assertions_high.asserted_by(assertion);
        final SubLObject when = assertions_high.asserted_when(assertion);
        final SubLObject why = assertions_high.asserted_why(assertion);
        final SubLObject when_sec = assertions_high.asserted_second(assertion);
        return new_bookkeeping_info(who, when, why, when_sec);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-bookkeeping.lisp", position = 4262L)
    public static SubLObject cyc_bookkeeping_info_for(final SubLObject what) {
        return conses_high.getf(cyc_bookkeeping_info(), what, (SubLObject)cyc_bookkeeping.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-bookkeeping.lisp", position = 4415L)
    public static SubLObject perform_constant_bookkeeping(final SubLObject constant) {
        if (cyc_bookkeeping.NIL != do_bookkeepingP()) {
            final SubLObject who = cyc_bookkeeping_info_for((SubLObject)cyc_bookkeeping.$kw22$WHO);
            final SubLObject when = cyc_bookkeeping_info_for((SubLObject)cyc_bookkeeping.$kw21$WHEN);
            final SubLObject purpose = cyc_bookkeeping_info_for((SubLObject)cyc_bookkeeping.$kw20$PURPOSE);
            final SubLObject when_sec = cyc_bookkeeping_info_for((SubLObject)cyc_bookkeeping.$kw19$SECOND);
            return fi.fi_timestamp_constant_int(who, when, purpose, when_sec);
        }
        return (SubLObject)cyc_bookkeeping.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-bookkeeping.lisp", position = 4794L)
    public static SubLObject perform_assertion_bookkeeping(final SubLObject assertion) {
        if (cyc_bookkeeping.NIL != do_bookkeepingP()) {
            final SubLObject who = cyc_bookkeeping_info_for((SubLObject)cyc_bookkeeping.$kw22$WHO);
            final SubLObject when = cyc_bookkeeping_info_for((SubLObject)cyc_bookkeeping.$kw21$WHEN);
            final SubLObject purpose = cyc_bookkeeping_info_for((SubLObject)cyc_bookkeeping.$kw20$PURPOSE);
            final SubLObject when_sec = cyc_bookkeeping_info_for((SubLObject)cyc_bookkeeping.$kw19$SECOND);
            return fi.fi_timestamp_assertion_int(who, when, purpose, when_sec);
        }
        return (SubLObject)cyc_bookkeeping.NIL;
    }
    
    public static SubLObject declare_cyc_bookkeeping_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cyc_bookkeeping", "with_bookkeeping_info", "WITH-BOOKKEEPING-INFO");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cyc_bookkeeping", "with_assertion_bookkeeping_info", "WITH-ASSERTION-BOOKKEEPING-INFO");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cyc_bookkeeping", "possibly_with_bookkeeping_info", "POSSIBLY-WITH-BOOKKEEPING-INFO");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cyc_bookkeeping", "without_bookkeeping", "WITHOUT-BOOKKEEPING");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_bookkeeping", "cyc_bookkeeping_info", "CYC-BOOKKEEPING-INFO", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_bookkeeping", "do_bookkeepingP", "DO-BOOKKEEPING?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_bookkeeping", "new_bookkeeping_info", "NEW-BOOKKEEPING-INFO", 0, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_bookkeeping", "assertion_bookkeeping_info", "ASSERTION-BOOKKEEPING-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_bookkeeping", "cyc_bookkeeping_info_for", "CYC-BOOKKEEPING-INFO-FOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_bookkeeping", "perform_constant_bookkeeping", "PERFORM-CONSTANT-BOOKKEEPING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_bookkeeping", "perform_assertion_bookkeeping", "PERFORM-ASSERTION-BOOKKEEPING", 1, 0, false);
        return (SubLObject)cyc_bookkeeping.NIL;
    }
    
    public static SubLObject init_cyc_bookkeeping_file() {
        cyc_bookkeeping.$bookkeeping_enabledP$ = SubLFiles.deflexical("*BOOKKEEPING-ENABLED?*", (SubLObject)(maybeDefault((SubLObject)cyc_bookkeeping.$sym0$_BOOKKEEPING_ENABLED__, cyc_bookkeeping.$bookkeeping_enabledP$, cyc_bookkeeping.T)));
        cyc_bookkeeping.$cyc_bookkeeping_info$ = SubLFiles.defparameter("*CYC-BOOKKEEPING-INFO*", (SubLObject)cyc_bookkeeping.NIL);
        return (SubLObject)cyc_bookkeeping.NIL;
    }
    
    public static SubLObject setup_cyc_bookkeeping_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)cyc_bookkeeping.$sym0$_BOOKKEEPING_ENABLED__);
        access_macros.register_external_symbol((SubLObject)cyc_bookkeeping.$sym1$WITH_BOOKKEEPING_INFO);
        access_macros.register_external_symbol((SubLObject)cyc_bookkeeping.$sym18$NEW_BOOKKEEPING_INFO);
        return (SubLObject)cyc_bookkeeping.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_cyc_bookkeeping_file();
    }
    
    @Override
	public void initializeVariables() {
        init_cyc_bookkeeping_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_cyc_bookkeeping_file();
    }
    
    static {
        me = (SubLFile)new cyc_bookkeeping();
        cyc_bookkeeping.$bookkeeping_enabledP$ = null;
        cyc_bookkeeping.$cyc_bookkeeping_info$ = null;
        $sym0$_BOOKKEEPING_ENABLED__ = SubLObjectFactory.makeSymbol("*BOOKKEEPING-ENABLED?*");
        $sym1$WITH_BOOKKEEPING_INFO = SubLObjectFactory.makeSymbol("WITH-BOOKKEEPING-INFO");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BOOKKEEPING-INFO"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym3$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym4$_CYC_BOOKKEEPING_INFO_ = SubLObjectFactory.makeSymbol("*CYC-BOOKKEEPING-INFO*");
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym6$ASSERTION_VAR = SubLObjectFactory.makeUninternedSymbol("ASSERTION-VAR");
        $sym7$_THE_CYCLIST_ = SubLObjectFactory.makeSymbol("*THE-CYCLIST*");
        $sym8$ASSERTED_BY = SubLObjectFactory.makeSymbol("ASSERTED-BY");
        $sym9$_THE_DATE_ = SubLObjectFactory.makeSymbol("*THE-DATE*");
        $sym10$ASSERTED_WHEN = SubLObjectFactory.makeSymbol("ASSERTED-WHEN");
        $sym11$_KE_PURPOSE_ = SubLObjectFactory.makeSymbol("*KE-PURPOSE*");
        $sym12$ASSERTED_WHY = SubLObjectFactory.makeSymbol("ASSERTED-WHY");
        $sym13$_THE_SECOND_ = SubLObjectFactory.makeSymbol("*THE-SECOND*");
        $sym14$ASSERTED_SECOND = SubLObjectFactory.makeSymbol("ASSERTED-SECOND");
        $list15 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-BOOKKEEPING-INFO"), (SubLObject)SubLObjectFactory.makeSymbol("*THE-CYCLIST*"), (SubLObject)SubLObjectFactory.makeSymbol("*THE-DATE*"), (SubLObject)SubLObjectFactory.makeSymbol("*KE-PURPOSE*"), (SubLObject)SubLObjectFactory.makeSymbol("*THE-SECOND*"));
        $sym16$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $list17 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CYC-BOOKKEEPING-INFO*"), (SubLObject)cyc_bookkeeping.NIL));
        $sym18$NEW_BOOKKEEPING_INFO = SubLObjectFactory.makeSymbol("NEW-BOOKKEEPING-INFO");
        $kw19$SECOND = SubLObjectFactory.makeKeyword("SECOND");
        $kw20$PURPOSE = SubLObjectFactory.makeKeyword("PURPOSE");
        $kw21$WHEN = SubLObjectFactory.makeKeyword("WHEN");
        $kw22$WHO = SubLObjectFactory.makeKeyword("WHO");
        $sym23$ASSERTION_P = SubLObjectFactory.makeSymbol("ASSERTION-P");
    }
}

/*

	Total time: 100 ms
	
*/