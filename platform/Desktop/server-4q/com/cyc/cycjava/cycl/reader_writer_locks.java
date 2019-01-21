package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class reader_writer_locks extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.reader_writer_locks";
    public static final String myFingerPrint = "3c9ce3f1a2f3bc74919bc944c8082486c343be6ac8fee73f20c1554df4b95f65";
    private static final SubLList $list0;
    private static final SubLSymbol $kw1$SL2JAVA;
    private static final SubLSymbol $sym2$WITH_JRTL_WRITER_LOCK;
    private static final SubLSymbol $sym3$RW_LOCK_VAR;
    private static final SubLSymbol $sym4$PIF_FEATURE;
    private static final SubLSymbol $sym5$CLET;
    private static final SubLSymbol $sym6$RW_LOCK_WRITER_VERIFY_NOT_HOLDING_READER;
    private static final SubLSymbol $sym7$WITH_LOCK_HELD;
    private static final SubLSymbol $sym8$READER_WRITER_LOCK_WRITER_LOCK;
    private static final SubLSymbol $sym9$READER_WRITER_LOCK_READER_LOCK;
    private static final SubLSymbol $sym10$RW_LOCK_WRITER_POSSIBLY_WAIT_FOR_READERS_TO_FINISH;
    private static final SubLSymbol $sym11$WITH_JRTL_READER_LOCK;
    private static final SubLSymbol $sym12$RW_LOCK_VAR;
    private static final SubLSymbol $sym13$CUNWIND_PROTECT;
    private static final SubLSymbol $sym14$PROGN;
    private static final SubLSymbol $sym15$RW_LOCK_POSSIBLY_REGISTER_READER;
    private static final SubLList $list16;
    private static final SubLSymbol $sym17$CPUSHNEW;
    private static final SubLList $list18;
    private static final SubLSymbol $sym19$RW_LOCK_READER_CLEANUP;
    private static final SubLSymbol $sym20$WITH_WRITER_LOCK;
    private static final SubLList $list21;
    private static final SubLSymbol $sym22$RW_LOCK_VAR;
    private static final SubLSymbol $sym23$NEEDS_TO_RELEASE_;
    private static final SubLList $list24;
    private static final SubLSymbol $sym25$CSETQ;
    private static final SubLSymbol $sym26$RW_LOCK_SEIZE_WRITE_LOCK;
    private static final SubLSymbol $sym27$PWHEN;
    private static final SubLSymbol $sym28$RW_LOCK_RELEASE_WRITE_LOCK;
    private static final SubLSymbol $sym29$WITH_READER_LOCK;
    private static final SubLSymbol $sym30$RW_LOCK_VAR;
    private static final SubLSymbol $sym31$NEEDS_TO_RELEASE_;
    private static final SubLSymbol $sym32$RW_LOCK_SEIZE_READ_LOCK;
    private static final SubLSymbol $sym33$RW_LOCK_RELEASE_READ_LOCK;
    
    @SubLTranslatedFile.SubL(source = "cycl/reader-writer-locks.lisp", position = 835L)
    public static SubLObject with_writer_lock(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)reader_writer_locks.$list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject rw_lock = (SubLObject)reader_writer_locks.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)reader_writer_locks.$list0);
        rw_lock = current.first();
        current = current.rest();
        if (reader_writer_locks.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)reader_writer_locks.$list0);
            return (SubLObject)reader_writer_locks.NIL;
        }
        final SubLObject body;
        current = (body = temp);
        if (reader_writer_locks.NIL != Sequences.find((SubLObject)reader_writer_locks.$kw1$SL2JAVA, reader.$features$.getDynamicValue(thread), (SubLObject)reader_writer_locks.UNPROVIDED, (SubLObject)reader_writer_locks.UNPROVIDED, (SubLObject)reader_writer_locks.UNPROVIDED, (SubLObject)reader_writer_locks.UNPROVIDED)) {
            return (SubLObject)ConsesLow.listS((SubLObject)reader_writer_locks.$sym2$WITH_JRTL_WRITER_LOCK, rw_lock, ConsesLow.append(body, (SubLObject)reader_writer_locks.NIL));
        }
        final SubLObject rw_lock_var = (SubLObject)reader_writer_locks.$sym3$RW_LOCK_VAR;
        return (SubLObject)ConsesLow.list((SubLObject)reader_writer_locks.$sym4$PIF_FEATURE, (SubLObject)reader_writer_locks.$kw1$SL2JAVA, (SubLObject)ConsesLow.listS((SubLObject)reader_writer_locks.$sym2$WITH_JRTL_WRITER_LOCK, rw_lock, ConsesLow.append(body, (SubLObject)reader_writer_locks.NIL)), (SubLObject)ConsesLow.list((SubLObject)reader_writer_locks.$sym5$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(rw_lock_var, rw_lock)), (SubLObject)ConsesLow.list((SubLObject)reader_writer_locks.$sym6$RW_LOCK_WRITER_VERIFY_NOT_HOLDING_READER, rw_lock_var), (SubLObject)ConsesLow.list((SubLObject)reader_writer_locks.$sym7$WITH_LOCK_HELD, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)reader_writer_locks.$sym8$READER_WRITER_LOCK_WRITER_LOCK, rw_lock_var)), (SubLObject)ConsesLow.listS((SubLObject)reader_writer_locks.$sym7$WITH_LOCK_HELD, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)reader_writer_locks.$sym9$READER_WRITER_LOCK_READER_LOCK, rw_lock_var)), (SubLObject)ConsesLow.list((SubLObject)reader_writer_locks.$sym10$RW_LOCK_WRITER_POSSIBLY_WAIT_FOR_READERS_TO_FINISH, rw_lock_var), ConsesLow.append(body, (SubLObject)reader_writer_locks.NIL)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reader-writer-locks.lisp", position = 1785L)
    public static SubLObject with_reader_lock(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)reader_writer_locks.$list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject rw_lock = (SubLObject)reader_writer_locks.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)reader_writer_locks.$list0);
        rw_lock = current.first();
        current = current.rest();
        if (reader_writer_locks.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)reader_writer_locks.$list0);
            return (SubLObject)reader_writer_locks.NIL;
        }
        final SubLObject body;
        current = (body = temp);
        if (reader_writer_locks.NIL != Sequences.find((SubLObject)reader_writer_locks.$kw1$SL2JAVA, reader.$features$.getDynamicValue(thread), (SubLObject)reader_writer_locks.UNPROVIDED, (SubLObject)reader_writer_locks.UNPROVIDED, (SubLObject)reader_writer_locks.UNPROVIDED, (SubLObject)reader_writer_locks.UNPROVIDED)) {
            return (SubLObject)ConsesLow.listS((SubLObject)reader_writer_locks.$sym11$WITH_JRTL_READER_LOCK, rw_lock, ConsesLow.append(body, (SubLObject)reader_writer_locks.NIL));
        }
        final SubLObject rw_lock_var = (SubLObject)reader_writer_locks.$sym12$RW_LOCK_VAR;
        return (SubLObject)ConsesLow.list((SubLObject)reader_writer_locks.$sym4$PIF_FEATURE, (SubLObject)reader_writer_locks.$kw1$SL2JAVA, (SubLObject)ConsesLow.listS((SubLObject)reader_writer_locks.$sym11$WITH_JRTL_READER_LOCK, rw_lock, ConsesLow.append(body, (SubLObject)reader_writer_locks.NIL)), (SubLObject)ConsesLow.list((SubLObject)reader_writer_locks.$sym5$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(rw_lock_var, rw_lock)), (SubLObject)ConsesLow.list((SubLObject)reader_writer_locks.$sym13$CUNWIND_PROTECT, (SubLObject)ConsesLow.list((SubLObject)reader_writer_locks.$sym14$PROGN, (SubLObject)ConsesLow.list((SubLObject)reader_writer_locks.$sym15$RW_LOCK_POSSIBLY_REGISTER_READER, rw_lock_var), (SubLObject)ConsesLow.listS((SubLObject)reader_writer_locks.$sym5$CLET, (SubLObject)reader_writer_locks.$list16, (SubLObject)ConsesLow.listS((SubLObject)reader_writer_locks.$sym17$CPUSHNEW, rw_lock_var, (SubLObject)reader_writer_locks.$list18), ConsesLow.append(body, (SubLObject)reader_writer_locks.NIL))), (SubLObject)ConsesLow.list((SubLObject)reader_writer_locks.$sym19$RW_LOCK_READER_CLEANUP, rw_lock_var))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reader-writer-locks.lisp", position = 2463L)
    public static SubLObject with_jrtl_writer_lock(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject rw_lock = (SubLObject)reader_writer_locks.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)reader_writer_locks.$list21);
        rw_lock = current.first();
        final SubLObject body;
        current = (body = current.rest());
        final SubLObject rw_lock_var = (SubLObject)reader_writer_locks.$sym22$RW_LOCK_VAR;
        final SubLObject needs_to_releaseP = (SubLObject)reader_writer_locks.$sym23$NEEDS_TO_RELEASE_;
        return (SubLObject)ConsesLow.list((SubLObject)reader_writer_locks.$sym5$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(rw_lock_var, rw_lock), reader.bq_cons(needs_to_releaseP, (SubLObject)reader_writer_locks.$list24)), (SubLObject)ConsesLow.list((SubLObject)reader_writer_locks.$sym13$CUNWIND_PROTECT, (SubLObject)ConsesLow.listS((SubLObject)reader_writer_locks.$sym14$PROGN, (SubLObject)ConsesLow.list((SubLObject)reader_writer_locks.$sym25$CSETQ, needs_to_releaseP, (SubLObject)ConsesLow.list((SubLObject)reader_writer_locks.$sym26$RW_LOCK_SEIZE_WRITE_LOCK, rw_lock_var)), ConsesLow.append(body, (SubLObject)reader_writer_locks.NIL)), (SubLObject)ConsesLow.list((SubLObject)reader_writer_locks.$sym27$PWHEN, needs_to_releaseP, (SubLObject)ConsesLow.list((SubLObject)reader_writer_locks.$sym28$RW_LOCK_RELEASE_WRITE_LOCK, rw_lock_var))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reader-writer-locks.lisp", position = 2970L)
    public static SubLObject with_jrtl_reader_lock(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject rw_lock = (SubLObject)reader_writer_locks.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)reader_writer_locks.$list21);
        rw_lock = current.first();
        final SubLObject body;
        current = (body = current.rest());
        final SubLObject rw_lock_var = (SubLObject)reader_writer_locks.$sym30$RW_LOCK_VAR;
        final SubLObject needs_to_releaseP = (SubLObject)reader_writer_locks.$sym31$NEEDS_TO_RELEASE_;
        return (SubLObject)ConsesLow.list((SubLObject)reader_writer_locks.$sym5$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(rw_lock_var, rw_lock), reader.bq_cons(needs_to_releaseP, (SubLObject)reader_writer_locks.$list24)), (SubLObject)ConsesLow.list((SubLObject)reader_writer_locks.$sym13$CUNWIND_PROTECT, (SubLObject)ConsesLow.listS((SubLObject)reader_writer_locks.$sym14$PROGN, (SubLObject)ConsesLow.list((SubLObject)reader_writer_locks.$sym25$CSETQ, needs_to_releaseP, (SubLObject)ConsesLow.list((SubLObject)reader_writer_locks.$sym32$RW_LOCK_SEIZE_READ_LOCK, rw_lock_var)), ConsesLow.append(body, (SubLObject)reader_writer_locks.NIL)), (SubLObject)ConsesLow.list((SubLObject)reader_writer_locks.$sym27$PWHEN, needs_to_releaseP, (SubLObject)ConsesLow.list((SubLObject)reader_writer_locks.$sym33$RW_LOCK_RELEASE_READ_LOCK, rw_lock_var))));
    }
    
    public static SubLObject declare_reader_writer_locks_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.reader_writer_locks", "with_writer_lock", "WITH-WRITER-LOCK");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.reader_writer_locks", "with_reader_lock", "WITH-READER-LOCK");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.reader_writer_locks", "with_jrtl_writer_lock", "WITH-JRTL-WRITER-LOCK");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.reader_writer_locks", "with_jrtl_reader_lock", "WITH-JRTL-READER-LOCK");
        return (SubLObject)reader_writer_locks.NIL;
    }
    
    public static SubLObject init_reader_writer_locks_file() {
        return (SubLObject)reader_writer_locks.NIL;
    }
    
    public static SubLObject setup_reader_writer_locks_file() {
        access_macros.register_macro_helper((SubLObject)reader_writer_locks.$sym2$WITH_JRTL_WRITER_LOCK, (SubLObject)reader_writer_locks.$sym20$WITH_WRITER_LOCK);
        access_macros.register_macro_helper((SubLObject)reader_writer_locks.$sym11$WITH_JRTL_READER_LOCK, (SubLObject)reader_writer_locks.$sym29$WITH_READER_LOCK);
        return (SubLObject)reader_writer_locks.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_reader_writer_locks_file();
    }
    
    @Override
	public void initializeVariables() {
        init_reader_writer_locks_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_reader_writer_locks_file();
    }
    
    static {
        me = (SubLFile)new reader_writer_locks();
        $list0 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RW-LOCK")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $kw1$SL2JAVA = SubLObjectFactory.makeKeyword("SL2JAVA");
        $sym2$WITH_JRTL_WRITER_LOCK = SubLObjectFactory.makeSymbol("WITH-JRTL-WRITER-LOCK");
        $sym3$RW_LOCK_VAR = SubLObjectFactory.makeUninternedSymbol("RW-LOCK-VAR");
        $sym4$PIF_FEATURE = SubLObjectFactory.makeSymbol("PIF-FEATURE");
        $sym5$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym6$RW_LOCK_WRITER_VERIFY_NOT_HOLDING_READER = SubLObjectFactory.makeSymbol("RW-LOCK-WRITER-VERIFY-NOT-HOLDING-READER");
        $sym7$WITH_LOCK_HELD = SubLObjectFactory.makeSymbol("WITH-LOCK-HELD");
        $sym8$READER_WRITER_LOCK_WRITER_LOCK = SubLObjectFactory.makeSymbol("READER-WRITER-LOCK-WRITER-LOCK");
        $sym9$READER_WRITER_LOCK_READER_LOCK = SubLObjectFactory.makeSymbol("READER-WRITER-LOCK-READER-LOCK");
        $sym10$RW_LOCK_WRITER_POSSIBLY_WAIT_FOR_READERS_TO_FINISH = SubLObjectFactory.makeSymbol("RW-LOCK-WRITER-POSSIBLY-WAIT-FOR-READERS-TO-FINISH");
        $sym11$WITH_JRTL_READER_LOCK = SubLObjectFactory.makeSymbol("WITH-JRTL-READER-LOCK");
        $sym12$RW_LOCK_VAR = SubLObjectFactory.makeUninternedSymbol("RW-LOCK-VAR");
        $sym13$CUNWIND_PROTECT = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
        $sym14$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym15$RW_LOCK_POSSIBLY_REGISTER_READER = SubLObjectFactory.makeSymbol("RW-LOCK-POSSIBLY-REGISTER-READER");
        $list16 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*RW-LOCK-PROCESS-READER-RW-LOCK-LIST*"), (SubLObject)SubLObjectFactory.makeSymbol("*RW-LOCK-PROCESS-READER-RW-LOCK-LIST*")));
        $sym17$CPUSHNEW = SubLObjectFactory.makeSymbol("CPUSHNEW");
        $list18 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*RW-LOCK-PROCESS-READER-RW-LOCK-LIST*"));
        $sym19$RW_LOCK_READER_CLEANUP = SubLObjectFactory.makeSymbol("RW-LOCK-READER-CLEANUP");
        $sym20$WITH_WRITER_LOCK = SubLObjectFactory.makeSymbol("WITH-WRITER-LOCK");
        $list21 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RW-LOCK"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym22$RW_LOCK_VAR = SubLObjectFactory.makeUninternedSymbol("RW-LOCK-VAR");
        $sym23$NEEDS_TO_RELEASE_ = SubLObjectFactory.makeUninternedSymbol("NEEDS-TO-RELEASE?");
        $list24 = ConsesLow.list((SubLObject)reader_writer_locks.NIL);
        $sym25$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $sym26$RW_LOCK_SEIZE_WRITE_LOCK = SubLObjectFactory.makeSymbol("RW-LOCK-SEIZE-WRITE-LOCK");
        $sym27$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym28$RW_LOCK_RELEASE_WRITE_LOCK = SubLObjectFactory.makeSymbol("RW-LOCK-RELEASE-WRITE-LOCK");
        $sym29$WITH_READER_LOCK = SubLObjectFactory.makeSymbol("WITH-READER-LOCK");
        $sym30$RW_LOCK_VAR = SubLObjectFactory.makeUninternedSymbol("RW-LOCK-VAR");
        $sym31$NEEDS_TO_RELEASE_ = SubLObjectFactory.makeUninternedSymbol("NEEDS-TO-RELEASE?");
        $sym32$RW_LOCK_SEIZE_READ_LOCK = SubLObjectFactory.makeSymbol("RW-LOCK-SEIZE-READ-LOCK");
        $sym33$RW_LOCK_RELEASE_READ_LOCK = SubLObjectFactory.makeSymbol("RW-LOCK-RELEASE-READ-LOCK");
    }
}

/*

	Total time: 83 ms
	
*/