/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.$features$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      READER-WRITER-LOCKS
 * source file: /cyc/top/cycl/reader-writer-locks.lisp
 * created:     2019/07/03 17:37:10
 */
public final class reader_writer_locks extends SubLTranslatedFile implements V12 {
    public static final SubLSymbol $rw_lock_process_reader_rw_lock_list$ = makeSymbol("*RW-LOCK-PROCESS-READER-RW-LOCK-LIST*");

    public static final SubLFile me = new reader_writer_locks();

 public static final String myName = "com.cyc.cycjava.cycl.reader_writer_locks";


    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(list(makeSymbol("RW-LOCK")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol WITH_JRTL_WRITER_LOCK = makeSymbol("WITH-JRTL-WRITER-LOCK");

    static private final SubLSymbol $sym3$RW_LOCK_VAR = makeUninternedSymbol("RW-LOCK-VAR");

    private static final SubLSymbol RW_LOCK_WRITER_VERIFY_NOT_HOLDING_READER = makeSymbol("RW-LOCK-WRITER-VERIFY-NOT-HOLDING-READER");

    private static final SubLSymbol READER_WRITER_LOCK_WRITER_LOCK = makeSymbol("READER-WRITER-LOCK-WRITER-LOCK");

    private static final SubLSymbol READER_WRITER_LOCK_READER_LOCK = makeSymbol("READER-WRITER-LOCK-READER-LOCK");

    private static final SubLSymbol RW_LOCK_WRITER_POSSIBLY_WAIT_FOR_READERS_TO_FINISH = makeSymbol("RW-LOCK-WRITER-POSSIBLY-WAIT-FOR-READERS-TO-FINISH");

    private static final SubLSymbol WITH_JRTL_READER_LOCK = makeSymbol("WITH-JRTL-READER-LOCK");

    static private final SubLSymbol $sym12$RW_LOCK_VAR = makeUninternedSymbol("RW-LOCK-VAR");

    private static final SubLSymbol RW_LOCK_POSSIBLY_REGISTER_READER = makeSymbol("RW-LOCK-POSSIBLY-REGISTER-READER");

    private static final SubLList $list16 = list(list(makeSymbol("*RW-LOCK-PROCESS-READER-RW-LOCK-LIST*"), makeSymbol("*RW-LOCK-PROCESS-READER-RW-LOCK-LIST*")));

    static private final SubLList $list18 = list(makeSymbol("*RW-LOCK-PROCESS-READER-RW-LOCK-LIST*"));

    private static final SubLSymbol RW_LOCK_READER_CLEANUP = makeSymbol("RW-LOCK-READER-CLEANUP");

    private static final SubLSymbol WITH_WRITER_LOCK = makeSymbol("WITH-WRITER-LOCK");

    static private final SubLList $list21 = list(makeSymbol("RW-LOCK"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym22$RW_LOCK_VAR = makeUninternedSymbol("RW-LOCK-VAR");

    static private final SubLSymbol $sym23$NEEDS_TO_RELEASE_ = makeUninternedSymbol("NEEDS-TO-RELEASE?");

    static private final SubLList $list24 = list(NIL);

    private static final SubLSymbol RW_LOCK_SEIZE_WRITE_LOCK = makeSymbol("RW-LOCK-SEIZE-WRITE-LOCK");

    private static final SubLSymbol RW_LOCK_RELEASE_WRITE_LOCK = makeSymbol("RW-LOCK-RELEASE-WRITE-LOCK");

    private static final SubLSymbol WITH_READER_LOCK = makeSymbol("WITH-READER-LOCK");

    static private final SubLSymbol $sym30$RW_LOCK_VAR = makeUninternedSymbol("RW-LOCK-VAR");

    static private final SubLSymbol $sym31$NEEDS_TO_RELEASE_ = makeUninternedSymbol("NEEDS-TO-RELEASE?");

    private static final SubLSymbol RW_LOCK_SEIZE_READ_LOCK = makeSymbol("RW-LOCK-SEIZE-READ-LOCK");

    private static final SubLSymbol RW_LOCK_RELEASE_READ_LOCK = makeSymbol("RW-LOCK-RELEASE-READ-LOCK");

    // Definitions
    public static final SubLObject with_writer_lock_alt(SubLObject macroform, SubLObject environment) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = macroform.rest();
                SubLObject current = datum;
                destructuring_bind_must_consp(current, datum, $list_alt0);
                {
                    SubLObject temp = current.rest();
                    current = current.first();
                    {
                        SubLObject rw_lock = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt0);
                        rw_lock = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            current = temp;
                            {
                                SubLObject body = current;
                                if (NIL != find($SL2JAVA, $features$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                    return listS(WITH_JRTL_WRITER_LOCK, rw_lock, append(body, NIL));
                                }
                                {
                                    SubLObject rw_lock_var = $sym3$RW_LOCK_VAR;
                                    return list(PIF_FEATURE, $SL2JAVA, listS(WITH_JRTL_WRITER_LOCK, rw_lock, append(body, NIL)), list(CLET, list(list(rw_lock_var, rw_lock)), list(RW_LOCK_WRITER_VERIFY_NOT_HOLDING_READER, rw_lock_var), list(WITH_LOCK_HELD, list(list(READER_WRITER_LOCK_WRITER_LOCK, rw_lock_var)), listS(WITH_LOCK_HELD, list(list(READER_WRITER_LOCK_READER_LOCK, rw_lock_var)), list(RW_LOCK_WRITER_POSSIBLY_WAIT_FOR_READERS_TO_FINISH, rw_lock_var), append(body, NIL)))));
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt0);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    // Definitions
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

    public static final SubLObject with_reader_lock_alt(SubLObject macroform, SubLObject environment) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = macroform.rest();
                SubLObject current = datum;
                destructuring_bind_must_consp(current, datum, $list_alt0);
                {
                    SubLObject temp = current.rest();
                    current = current.first();
                    {
                        SubLObject rw_lock = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt0);
                        rw_lock = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            current = temp;
                            {
                                SubLObject body = current;
                                if (NIL != find($SL2JAVA, $features$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                    return listS(WITH_JRTL_READER_LOCK, rw_lock, append(body, NIL));
                                }
                                {
                                    SubLObject rw_lock_var = $sym12$RW_LOCK_VAR;
                                    return list(PIF_FEATURE, $SL2JAVA, listS(WITH_JRTL_READER_LOCK, rw_lock, append(body, NIL)), list(CLET, list(list(rw_lock_var, rw_lock)), list(CUNWIND_PROTECT, list(PROGN, list(RW_LOCK_POSSIBLY_REGISTER_READER, rw_lock_var), listS(CLET, list(list($rw_lock_process_reader_rw_lock_list$, listS(CONS, rw_lock_var, $list_alt18))), append(body, NIL))), list(RW_LOCK_READER_CLEANUP, rw_lock_var))));
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt0);
                        }
                    }
                }
            }
            return NIL;
        }
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

    public static final SubLObject with_jrtl_writer_lock_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject rw_lock = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt21);
            rw_lock = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                SubLObject rw_lock_var = $sym22$RW_LOCK_VAR;
                SubLObject needs_to_releaseP = $sym23$NEEDS_TO_RELEASE_;
                return list(CLET, list(list(rw_lock_var, rw_lock), bq_cons(needs_to_releaseP, $list_alt24)), list(CUNWIND_PROTECT, listS(PROGN, list(CSETQ, needs_to_releaseP, list(RW_LOCK_SEIZE_WRITE_LOCK, rw_lock_var)), append(body, NIL)), list(PWHEN, needs_to_releaseP, list(RW_LOCK_RELEASE_WRITE_LOCK, rw_lock_var))));
            }
        }
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

    public static final SubLObject with_jrtl_reader_lock_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject rw_lock = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt21);
            rw_lock = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                SubLObject rw_lock_var = $sym30$RW_LOCK_VAR;
                SubLObject needs_to_releaseP = $sym31$NEEDS_TO_RELEASE_;
                return list(CLET, list(list(rw_lock_var, rw_lock), bq_cons(needs_to_releaseP, $list_alt24)), list(CUNWIND_PROTECT, listS(PROGN, list(CSETQ, needs_to_releaseP, list(RW_LOCK_SEIZE_READ_LOCK, rw_lock_var)), append(body, NIL)), list(PWHEN, needs_to_releaseP, list(RW_LOCK_RELEASE_READ_LOCK, rw_lock_var))));
            }
        }
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

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(list(makeSymbol("RW-LOCK")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static SubLObject declare_reader_writer_locks_file() {
        declareMacro("with_writer_lock", "WITH-WRITER-LOCK");
        declareMacro("with_reader_lock", "WITH-READER-LOCK");
        declareMacro("with_jrtl_writer_lock", "WITH-JRTL-WRITER-LOCK");
        declareMacro("with_jrtl_reader_lock", "WITH-JRTL-READER-LOCK");
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

    static private final SubLList $list_alt18 = list(makeSymbol("*RW-LOCK-PROCESS-READER-RW-LOCK-LIST*"));

    

    static private final SubLList $list_alt21 = list(makeSymbol("RW-LOCK"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt24 = list(NIL);
}

/**
 * Total time: 83 ms
 */
