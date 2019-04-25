package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sdbc_macros extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sdbc_macros";
    public static final String myFingerPrint = "a799f1ffbae1489d24bcb65be8dfdf1a8866494d20364bfbfc7aa191a1c9f075";
    private static final SubLList $list0;
    private static final SubLSymbol $sym1$RESULT_SET;
    private static final SubLSymbol $sym2$COLUMN_COUNT;
    private static final SubLSymbol $sym3$I;
    private static final SubLSymbol $sym4$KEY;
    private static final SubLSymbol $sym5$RESULTS;
    private static final SubLSymbol $sym6$BINDINGS;
    private static final SubLSymbol $sym7$DEFINE_PROTECTED;
    private static final SubLSymbol $sym8$CLET;
    private static final SubLSymbol $sym9$APPLY;
    private static final SubLSymbol $sym10$QUOTE;
    private static final SubLSymbol $sym11$LIST;
    private static final SubLSymbol $sym12$PUNLESS;
    private static final SubLSymbol $sym13$SQL_RESULT_SET_P;
    private static final SubLSymbol $sym14$WARN;
    private static final SubLString $str15$SQLC_error___A;
    private static final SubLList $list16;
    private static final SubLSymbol $sym17$SQLRS_COLUMN_COUNT;
    private static final SubLSymbol $sym18$WHILE;
    private static final SubLSymbol $sym19$CNOT;
    private static final SubLSymbol $sym20$SQLRS_IS_LAST;
    private static final SubLSymbol $sym21$SQLRS_NEXT;
    private static final SubLList $list22;
    private static final SubLSymbol $sym23$CDOLIST;
    private static final SubLSymbol $sym24$CINC;
    private static final SubLSymbol $sym25$PWHEN;
    private static final SubLSymbol $sym26$__;
    private static final SubLSymbol $sym27$CPUSH;
    private static final SubLSymbol $sym28$SQLRS_GET_OBJECT;
    private static final SubLSymbol $sym29$NREVERSE;
    private static final SubLSymbol $sym30$RET;
    
    @SubLTranslatedFile.SubL(source = "cycl/sdbc-macros.lisp", position = 926L)
    public static SubLObject define_sqlc_wrapper(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject wrapper_fn = (SubLObject)sdbc_macros.NIL;
        SubLObject wrapped_fn = (SubLObject)sdbc_macros.NIL;
        SubLObject args = (SubLObject)sdbc_macros.NIL;
        SubLObject keys = (SubLObject)sdbc_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sdbc_macros.$list0);
        wrapper_fn = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sdbc_macros.$list0);
        wrapped_fn = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sdbc_macros.$list0);
        args = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sdbc_macros.$list0);
        keys = current.first();
        current = current.rest();
        if (sdbc_macros.NIL == current) {
            final SubLObject result_set = (SubLObject)sdbc_macros.$sym1$RESULT_SET;
            final SubLObject column_count = (SubLObject)sdbc_macros.$sym2$COLUMN_COUNT;
            final SubLObject i = (SubLObject)sdbc_macros.$sym3$I;
            final SubLObject key = (SubLObject)sdbc_macros.$sym4$KEY;
            final SubLObject results = (SubLObject)sdbc_macros.$sym5$RESULTS;
            final SubLObject v_bindings = (SubLObject)sdbc_macros.$sym6$BINDINGS;
            return (SubLObject)ConsesLow.list((SubLObject)sdbc_macros.$sym7$DEFINE_PROTECTED, wrapper_fn, args, (SubLObject)ConsesLow.list((SubLObject)sdbc_macros.$sym8$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(result_set, (SubLObject)ConsesLow.list((SubLObject)sdbc_macros.$sym9$APPLY, (SubLObject)ConsesLow.list((SubLObject)sdbc_macros.$sym10$QUOTE, wrapped_fn), reader.bq_cons((SubLObject)sdbc_macros.$sym11$LIST, ConsesLow.append(args, (SubLObject)sdbc_macros.NIL))))), (SubLObject)ConsesLow.listS((SubLObject)sdbc_macros.$sym12$PUNLESS, (SubLObject)ConsesLow.list((SubLObject)sdbc_macros.$sym13$SQL_RESULT_SET_P, result_set), (SubLObject)ConsesLow.list((SubLObject)sdbc_macros.$sym14$WARN, (SubLObject)sdbc_macros.$str15$SQLC_error___A, result_set), (SubLObject)sdbc_macros.$list16), (SubLObject)ConsesLow.list((SubLObject)sdbc_macros.$sym8$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(column_count, (SubLObject)ConsesLow.list((SubLObject)sdbc_macros.$sym17$SQLRS_COLUMN_COUNT, result_set)), results), (SubLObject)ConsesLow.list((SubLObject)sdbc_macros.$sym18$WHILE, (SubLObject)ConsesLow.list((SubLObject)sdbc_macros.$sym19$CNOT, (SubLObject)ConsesLow.list((SubLObject)sdbc_macros.$sym20$SQLRS_IS_LAST, result_set)), (SubLObject)ConsesLow.list((SubLObject)sdbc_macros.$sym21$SQLRS_NEXT, result_set), (SubLObject)ConsesLow.list((SubLObject)sdbc_macros.$sym8$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(i, (SubLObject)sdbc_macros.$list22), v_bindings), (SubLObject)ConsesLow.list((SubLObject)sdbc_macros.$sym23$CDOLIST, (SubLObject)ConsesLow.list(key, (SubLObject)ConsesLow.list((SubLObject)sdbc_macros.$sym10$QUOTE, keys)), (SubLObject)ConsesLow.list((SubLObject)sdbc_macros.$sym24$CINC, i), (SubLObject)ConsesLow.list((SubLObject)sdbc_macros.$sym25$PWHEN, (SubLObject)ConsesLow.list((SubLObject)sdbc_macros.$sym26$__, i, column_count), (SubLObject)ConsesLow.list((SubLObject)sdbc_macros.$sym27$CPUSH, key, v_bindings), (SubLObject)ConsesLow.list((SubLObject)sdbc_macros.$sym27$CPUSH, (SubLObject)ConsesLow.list((SubLObject)sdbc_macros.$sym28$SQLRS_GET_OBJECT, result_set, i), v_bindings))), (SubLObject)ConsesLow.list((SubLObject)sdbc_macros.$sym27$CPUSH, (SubLObject)ConsesLow.list((SubLObject)sdbc_macros.$sym29$NREVERSE, v_bindings), results))), (SubLObject)ConsesLow.list((SubLObject)sdbc_macros.$sym30$RET, (SubLObject)ConsesLow.list((SubLObject)sdbc_macros.$sym29$NREVERSE, results)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sdbc_macros.$list0);
        return (SubLObject)sdbc_macros.NIL;
    }
    
    public static SubLObject declare_sdbc_macros_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sdbc_macros", "define_sqlc_wrapper", "DEFINE-SQLC-WRAPPER");
        return (SubLObject)sdbc_macros.NIL;
    }
    
    public static SubLObject init_sdbc_macros_file() {
        return (SubLObject)sdbc_macros.NIL;
    }
    
    public static SubLObject setup_sdbc_macros_file() {
        return (SubLObject)sdbc_macros.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_sdbc_macros_file();
    }
    
    @Override
	public void initializeVariables() {
        init_sdbc_macros_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_sdbc_macros_file();
    }
    
    static {
        me = (SubLFile)new sdbc_macros();
        $list0 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRAPPER-FN"), (SubLObject)SubLObjectFactory.makeSymbol("WRAPPED-FN"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS"), (SubLObject)SubLObjectFactory.makeSymbol("KEYS"));
        $sym1$RESULT_SET = SubLObjectFactory.makeUninternedSymbol("RESULT-SET");
        $sym2$COLUMN_COUNT = SubLObjectFactory.makeUninternedSymbol("COLUMN-COUNT");
        $sym3$I = SubLObjectFactory.makeUninternedSymbol("I");
        $sym4$KEY = SubLObjectFactory.makeUninternedSymbol("KEY");
        $sym5$RESULTS = SubLObjectFactory.makeUninternedSymbol("RESULTS");
        $sym6$BINDINGS = SubLObjectFactory.makeUninternedSymbol("BINDINGS");
        $sym7$DEFINE_PROTECTED = SubLObjectFactory.makeSymbol("DEFINE-PROTECTED");
        $sym8$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym9$APPLY = SubLObjectFactory.makeSymbol("APPLY");
        $sym10$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $sym11$LIST = SubLObjectFactory.makeSymbol("LIST");
        $sym12$PUNLESS = SubLObjectFactory.makeSymbol("PUNLESS");
        $sym13$SQL_RESULT_SET_P = SubLObjectFactory.makeSymbol("SQL-RESULT-SET-P");
        $sym14$WARN = SubLObjectFactory.makeSymbol("WARN");
        $str15$SQLC_error___A = SubLObjectFactory.makeString("SQLC error: ~A");
        $list16 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)sdbc_macros.NIL));
        $sym17$SQLRS_COLUMN_COUNT = SubLObjectFactory.makeSymbol("SQLRS-COLUMN-COUNT");
        $sym18$WHILE = SubLObjectFactory.makeSymbol("WHILE");
        $sym19$CNOT = SubLObjectFactory.makeSymbol("CNOT");
        $sym20$SQLRS_IS_LAST = SubLObjectFactory.makeSymbol("SQLRS-IS-LAST");
        $sym21$SQLRS_NEXT = SubLObjectFactory.makeSymbol("SQLRS-NEXT");
        $list22 = ConsesLow.list((SubLObject)sdbc_macros.ZERO_INTEGER);
        $sym23$CDOLIST = SubLObjectFactory.makeSymbol("CDOLIST");
        $sym24$CINC = SubLObjectFactory.makeSymbol("CINC");
        $sym25$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym26$__ = SubLObjectFactory.makeSymbol("<=");
        $sym27$CPUSH = SubLObjectFactory.makeSymbol("CPUSH");
        $sym28$SQLRS_GET_OBJECT = SubLObjectFactory.makeSymbol("SQLRS-GET-OBJECT");
        $sym29$NREVERSE = SubLObjectFactory.makeSymbol("NREVERSE");
        $sym30$RET = SubLObjectFactory.makeSymbol("RET");
    }
}

/*

	Total time: 80 ms
	
*/