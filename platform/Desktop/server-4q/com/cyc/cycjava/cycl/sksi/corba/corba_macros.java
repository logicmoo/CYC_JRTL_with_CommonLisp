package com.cyc.cycjava.cycl.sksi.corba;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class corba_macros extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sksi.corba.corba_macros";
    public static final String myFingerPrint = "4ec1400e1d3ba72ef4878621dbed9ef5558b9b2f9f942d17faa31d24f742a64c";
    private static final SubLList $list0;
    private static final SubLList $list1;
    private static final SubLSymbol $kw2$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw3$CONNECTION_TIMEOUT;
    private static final SubLSymbol $kw4$TRANSACTION_TIMEOUT;
    private static final SubLSymbol $kw5$ACCESS_MODE;
    private static final SubLSymbol $kw6$PUBLIC;
    private static final SubLSymbol $sym7$TRANSACTION_TIMED_OUT;
    private static final SubLSymbol $sym8$CLET;
    private static final SubLSymbol $sym9$IGNORE;
    private static final SubLSymbol $sym10$WITH_TIMEOUT;
    private static final SubLSymbol $sym11$CUNWIND_PROTECT;
    private static final SubLSymbol $sym12$PWHEN;
    private static final SubLSymbol $sym13$CORBA_CONNECTION_OPEN;
    private static final SubLSymbol $sym14$CORBA_CONNECTION_OPEN_P;
    private static final SubLSymbol $sym15$CORBA_CONNECTION_CLOSE;
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-macros.lisp", position = 954L)
    public static SubLObject with_open_corba_connection(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)corba_macros.$list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject corba_connection = (SubLObject)corba_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)corba_macros.$list0);
        corba_connection = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)corba_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)corba_macros.NIL;
        SubLObject current_$1 = (SubLObject)corba_macros.NIL;
        while (corba_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)corba_macros.$list0);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)corba_macros.$list0);
            if (corba_macros.NIL == conses_high.member(current_$1, (SubLObject)corba_macros.$list1, (SubLObject)corba_macros.UNPROVIDED, (SubLObject)corba_macros.UNPROVIDED)) {
                bad = (SubLObject)corba_macros.T;
            }
            if (current_$1 == corba_macros.$kw2$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (corba_macros.NIL != bad && corba_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)corba_macros.$list0);
        }
        final SubLObject connection_timeout_tail = cdestructuring_bind.property_list_member((SubLObject)corba_macros.$kw3$CONNECTION_TIMEOUT, current);
        final SubLObject connection_timeout = (SubLObject)((corba_macros.NIL != connection_timeout_tail) ? conses_high.cadr(connection_timeout_tail) : corba_macros.NIL);
        final SubLObject transaction_timeout_tail = cdestructuring_bind.property_list_member((SubLObject)corba_macros.$kw4$TRANSACTION_TIMEOUT, current);
        final SubLObject transaction_timeout = (SubLObject)((corba_macros.NIL != transaction_timeout_tail) ? conses_high.cadr(transaction_timeout_tail) : corba_macros.NIL);
        final SubLObject access_mode_tail = cdestructuring_bind.property_list_member((SubLObject)corba_macros.$kw5$ACCESS_MODE, current);
        final SubLObject access_mode = (SubLObject)((corba_macros.NIL != access_mode_tail) ? conses_high.cadr(access_mode_tail) : corba_macros.$kw6$PUBLIC);
        final SubLObject body;
        current = (body = temp);
        final SubLObject transaction_timed_out = (SubLObject)corba_macros.$sym7$TRANSACTION_TIMED_OUT;
        return (SubLObject)ConsesLow.list((SubLObject)corba_macros.$sym8$CLET, (SubLObject)ConsesLow.list(transaction_timed_out), (SubLObject)ConsesLow.list((SubLObject)corba_macros.$sym9$IGNORE, transaction_timed_out), (SubLObject)ConsesLow.list((SubLObject)corba_macros.$sym10$WITH_TIMEOUT, (SubLObject)ConsesLow.list(transaction_timeout, transaction_timed_out), (SubLObject)ConsesLow.list((SubLObject)corba_macros.$sym11$CUNWIND_PROTECT, (SubLObject)ConsesLow.listS((SubLObject)corba_macros.$sym12$PWHEN, (SubLObject)ConsesLow.list((SubLObject)corba_macros.$sym13$CORBA_CONNECTION_OPEN, corba_connection, connection_timeout, access_mode), ConsesLow.append(body, (SubLObject)corba_macros.NIL)), (SubLObject)ConsesLow.list((SubLObject)corba_macros.$sym12$PWHEN, (SubLObject)ConsesLow.list((SubLObject)corba_macros.$sym14$CORBA_CONNECTION_OPEN_P, corba_connection), (SubLObject)ConsesLow.list((SubLObject)corba_macros.$sym15$CORBA_CONNECTION_CLOSE, corba_connection)))));
    }
    
    public static SubLObject declare_corba_macros_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.corba.corba_macros", "with_open_corba_connection", "WITH-OPEN-CORBA-CONNECTION");
        return (SubLObject)corba_macros.NIL;
    }
    
    public static SubLObject init_corba_macros_file() {
        return (SubLObject)corba_macros.NIL;
    }
    
    public static SubLObject setup_corba_macros_file() {
        return (SubLObject)corba_macros.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_corba_macros_file();
    }
    
    @Override
	public void initializeVariables() {
        init_corba_macros_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_corba_macros_file();
    }
    
    static {
        me = (SubLFile)new corba_macros();
        $list0 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CORBA-CONNECTION"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("CONNECTION-TIMEOUT"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSACTION-TIMEOUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ACCESS-MODE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list1 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CONNECTION-TIMEOUT"), (SubLObject)SubLObjectFactory.makeKeyword("TRANSACTION-TIMEOUT"), (SubLObject)SubLObjectFactory.makeKeyword("ACCESS-MODE"));
        $kw2$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw3$CONNECTION_TIMEOUT = SubLObjectFactory.makeKeyword("CONNECTION-TIMEOUT");
        $kw4$TRANSACTION_TIMEOUT = SubLObjectFactory.makeKeyword("TRANSACTION-TIMEOUT");
        $kw5$ACCESS_MODE = SubLObjectFactory.makeKeyword("ACCESS-MODE");
        $kw6$PUBLIC = SubLObjectFactory.makeKeyword("PUBLIC");
        $sym7$TRANSACTION_TIMED_OUT = SubLObjectFactory.makeUninternedSymbol("TRANSACTION-TIMED-OUT");
        $sym8$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym9$IGNORE = SubLObjectFactory.makeSymbol("IGNORE");
        $sym10$WITH_TIMEOUT = SubLObjectFactory.makeSymbol("WITH-TIMEOUT");
        $sym11$CUNWIND_PROTECT = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
        $sym12$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym13$CORBA_CONNECTION_OPEN = SubLObjectFactory.makeSymbol("CORBA-CONNECTION-OPEN");
        $sym14$CORBA_CONNECTION_OPEN_P = SubLObjectFactory.makeSymbol("CORBA-CONNECTION-OPEN-P");
        $sym15$CORBA_CONNECTION_CLOSE = SubLObjectFactory.makeSymbol("CORBA-CONNECTION-CLOSE");
    }
}

/*

	Total time: 23 ms
	
*/