package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class reader_writer_locks extends SubLTranslatedFile {
    public static final SubLFile me = new reader_writer_locks();

    public static final String myName = "com.cyc.cycjava.cycl.reader_writer_locks";

    public static final String myFingerPrint = "3c9ce3f1a2f3bc74919bc944c8082486c343be6ac8fee73f20c1554df4b95f65";

    // Internal Constants
    public static final SubLList $list0 = list(list(makeSymbol("RW-LOCK")), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLSymbol WITH_JRTL_WRITER_LOCK = makeSymbol("WITH-JRTL-WRITER-LOCK");

    public static final SubLSymbol $sym3$RW_LOCK_VAR = makeUninternedSymbol("RW-LOCK-VAR");





    public static final SubLSymbol RW_LOCK_WRITER_VERIFY_NOT_HOLDING_READER = makeSymbol("RW-LOCK-WRITER-VERIFY-NOT-HOLDING-READER");



    public static final SubLSymbol READER_WRITER_LOCK_WRITER_LOCK = makeSymbol("READER-WRITER-LOCK-WRITER-LOCK");

    public static final SubLSymbol READER_WRITER_LOCK_READER_LOCK = makeSymbol("READER-WRITER-LOCK-READER-LOCK");

    public static final SubLSymbol RW_LOCK_WRITER_POSSIBLY_WAIT_FOR_READERS_TO_FINISH = makeSymbol("RW-LOCK-WRITER-POSSIBLY-WAIT-FOR-READERS-TO-FINISH");

    public static final SubLSymbol WITH_JRTL_READER_LOCK = makeSymbol("WITH-JRTL-READER-LOCK");

    public static final SubLSymbol $sym12$RW_LOCK_VAR = makeUninternedSymbol("RW-LOCK-VAR");





    public static final SubLSymbol RW_LOCK_POSSIBLY_REGISTER_READER = makeSymbol("RW-LOCK-POSSIBLY-REGISTER-READER");

    private static final SubLList $list16 = list(list(makeSymbol("*RW-LOCK-PROCESS-READER-RW-LOCK-LIST*"), makeSymbol("*RW-LOCK-PROCESS-READER-RW-LOCK-LIST*")));



    public static final SubLList $list18 = list(makeSymbol("*RW-LOCK-PROCESS-READER-RW-LOCK-LIST*"));

    public static final SubLSymbol RW_LOCK_READER_CLEANUP = makeSymbol("RW-LOCK-READER-CLEANUP");

    public static final SubLSymbol WITH_WRITER_LOCK = makeSymbol("WITH-WRITER-LOCK");

    public static final SubLList $list21 = list(makeSymbol("RW-LOCK"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym22$RW_LOCK_VAR = makeUninternedSymbol("RW-LOCK-VAR");

    public static final SubLSymbol $sym23$NEEDS_TO_RELEASE_ = makeUninternedSymbol("NEEDS-TO-RELEASE?");

    public static final SubLList $list24 = list(NIL);



    public static final SubLSymbol RW_LOCK_SEIZE_WRITE_LOCK = makeSymbol("RW-LOCK-SEIZE-WRITE-LOCK");



    public static final SubLSymbol RW_LOCK_RELEASE_WRITE_LOCK = makeSymbol("RW-LOCK-RELEASE-WRITE-LOCK");

    public static final SubLSymbol WITH_READER_LOCK = makeSymbol("WITH-READER-LOCK");

    public static final SubLSymbol $sym30$RW_LOCK_VAR = makeUninternedSymbol("RW-LOCK-VAR");

    public static final SubLSymbol $sym31$NEEDS_TO_RELEASE_ = makeUninternedSymbol("NEEDS-TO-RELEASE?");

    public static final SubLSymbol RW_LOCK_SEIZE_READ_LOCK = makeSymbol("RW-LOCK-SEIZE-READ-LOCK");

    public static final SubLSymbol RW_LOCK_RELEASE_READ_LOCK = makeSymbol("RW-LOCK-RELEASE-READ-LOCK");

    public static SubLObject with_writer_lock(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject rw_lock = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        rw_lock = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(datum, $list0);
            return NIL;
        }
        final SubLObject body;
        current = body = temp;
        if (NIL != find($SL2JAVA, $features$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return listS(WITH_JRTL_WRITER_LOCK, rw_lock, append(body, NIL));
        }
        final SubLObject rw_lock_var = $sym3$RW_LOCK_VAR;
        return list(PIF_FEATURE, $SL2JAVA, listS(WITH_JRTL_WRITER_LOCK, rw_lock, append(body, NIL)), list(CLET, list(list(rw_lock_var, rw_lock)), list(RW_LOCK_WRITER_VERIFY_NOT_HOLDING_READER, rw_lock_var), list(WITH_LOCK_HELD, list(list(READER_WRITER_LOCK_WRITER_LOCK, rw_lock_var)), listS(WITH_LOCK_HELD, list(list(READER_WRITER_LOCK_READER_LOCK, rw_lock_var)), list(RW_LOCK_WRITER_POSSIBLY_WAIT_FOR_READERS_TO_FINISH, rw_lock_var), append(body, NIL)))));
    }

    public static SubLObject with_reader_lock(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject rw_lock = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        rw_lock = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(datum, $list0);
            return NIL;
        }
        final SubLObject body;
        current = body = temp;
        if (NIL != find($SL2JAVA, $features$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return listS(WITH_JRTL_READER_LOCK, rw_lock, append(body, NIL));
        }
        final SubLObject rw_lock_var = $sym12$RW_LOCK_VAR;
        return list(PIF_FEATURE, $SL2JAVA, listS(WITH_JRTL_READER_LOCK, rw_lock, append(body, NIL)), list(CLET, list(list(rw_lock_var, rw_lock)), list(CUNWIND_PROTECT, list(PROGN, list(RW_LOCK_POSSIBLY_REGISTER_READER, rw_lock_var), listS(CLET, $list16, listS(CPUSHNEW, rw_lock_var, $list18), append(body, NIL))), list(RW_LOCK_READER_CLEANUP, rw_lock_var))));
    }

    public static SubLObject with_jrtl_writer_lock(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject rw_lock = NIL;
        destructuring_bind_must_consp(current, datum, $list21);
        rw_lock = current.first();
        final SubLObject body;
        current = body = current.rest();
        final SubLObject rw_lock_var = $sym22$RW_LOCK_VAR;
        final SubLObject needs_to_releaseP = $sym23$NEEDS_TO_RELEASE_;
        return list(CLET, list(list(rw_lock_var, rw_lock), bq_cons(needs_to_releaseP, $list24)), list(CUNWIND_PROTECT, listS(PROGN, list(CSETQ, needs_to_releaseP, list(RW_LOCK_SEIZE_WRITE_LOCK, rw_lock_var)), append(body, NIL)), list(PWHEN, needs_to_releaseP, list(RW_LOCK_RELEASE_WRITE_LOCK, rw_lock_var))));
    }

    public static SubLObject with_jrtl_reader_lock(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject rw_lock = NIL;
        destructuring_bind_must_consp(current, datum, $list21);
        rw_lock = current.first();
        final SubLObject body;
        current = body = current.rest();
        final SubLObject rw_lock_var = $sym30$RW_LOCK_VAR;
        final SubLObject needs_to_releaseP = $sym31$NEEDS_TO_RELEASE_;
        return list(CLET, list(list(rw_lock_var, rw_lock), bq_cons(needs_to_releaseP, $list24)), list(CUNWIND_PROTECT, listS(PROGN, list(CSETQ, needs_to_releaseP, list(RW_LOCK_SEIZE_READ_LOCK, rw_lock_var)), append(body, NIL)), list(PWHEN, needs_to_releaseP, list(RW_LOCK_RELEASE_READ_LOCK, rw_lock_var))));
    }

    public static SubLObject declare_reader_writer_locks_file() {
        declareMacro(me, "with_writer_lock", "WITH-WRITER-LOCK");
        declareMacro(me, "with_reader_lock", "WITH-READER-LOCK");
        declareMacro(me, "with_jrtl_writer_lock", "WITH-JRTL-WRITER-LOCK");
        declareMacro(me, "with_jrtl_reader_lock", "WITH-JRTL-READER-LOCK");
        return NIL;
    }

    public static SubLObject init_reader_writer_locks_file() {
        return NIL;
    }

    public static SubLObject setup_reader_writer_locks_file() {
        register_macro_helper(WITH_JRTL_WRITER_LOCK, WITH_WRITER_LOCK);
        register_macro_helper(WITH_JRTL_READER_LOCK, WITH_READER_LOCK);
        return NIL;
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

    
}

/**
 * Total time: 83 ms
 */
