/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numGE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.bytes;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SUBLOOP-PROCESSES
 * source file: /cyc/top/cycl/subloop-processes.lisp
 * created:     2019/07/03 17:37:09
 */
public final class subloop_processes extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new subloop_processes();



    // defconstant
    @LispMethod(comment = "Enumerated values of type SUBLOOP-PROCESS-STATUS-TYPE.\ndefconstant")
    // Definitions
    /**
     * Enumerated values of type SUBLOOP-PROCESS-STATUS-TYPE.
     */
    private static final SubLSymbol $valid_subloop_process_status_types$ = makeSymbol("*VALID-SUBLOOP-PROCESS-STATUS-TYPES*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(makeKeyword("UNKNOWN"), makeKeyword("ACTIVE"), makeKeyword("SUSPENDED"), $DEAD);

    private static final SubLSymbol SUBLOOP_PROCESS_STATUS_TYPE = makeSymbol("SUBLOOP-PROCESS-STATUS-TYPE");

    static private final SubLString $str2$_S___S_is_not_a_member_of_the__S_ = makeString("~S: ~S is not a member of the ~S enumeration.");

    private static final SubLSymbol ENCODE_SUBLOOP_PROCESS_STATUS_TYPE = makeSymbol("ENCODE-SUBLOOP-PROCESS-STATUS-TYPE");

    static private final SubLString $str4$_S___S_is_not_a_valid_encoding_of = makeString("~S: ~S is not a valid encoding of the ~S enumeration.");

    private static final SubLSymbol DECODE_SUBLOOP_PROCESS_STATUS_TYPE = makeSymbol("DECODE-SUBLOOP-PROCESS-STATUS-TYPE");

    static private final SubLString $str6$_S___S_was_expected_to_be_a_membe = makeString("~S: ~S was expected to be a member of the enumeration ~S.");

    private static final SubLSymbol SUBLOOP_PROCESS_STATUS_TYPE_P = makeSymbol("SUBLOOP-PROCESS-STATUS-TYPE-P");

    static private final SubLList $list9 = list(new SubLObject[]{ list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-NAME"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-NAME"), list(makeSymbol("NEW-NAME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PRIORITY"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PRIORITY"), list(makeSymbol("NEW-PRIORITY")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-STATUS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RUN"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RUN-INTERNAL"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SUSPEND"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("KILL"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-OWNER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-OWNER"), list(makeSymbol("NEW-SCHEDULER")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NOTHING-TO-DO?"), NIL, makeKeyword("PUBLIC")) });

    static private final SubLList $list12 = list(makeSymbol("SUBLOOP-PROCESS"), makeSymbol("QUEUE-ELEMENT-INTERFACE"));

    static private final SubLList $list13 = list(new SubLObject[]{ list(makeSymbol("NAME"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("PRIORITY"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("STATUS"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("OWNER"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-NAME"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-NAME"), list(makeSymbol("NEW-NAME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PRIORITY"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PRIORITY"), list(makeSymbol("NEW-PRIORITY")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-STATUS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RUN"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RUN-INTERNAL"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SUSPEND"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("KILL"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-OWNER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-OWNER"), list(makeSymbol("NEW-SCHEDULER")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NOTHING-TO-DO?"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ENQUEUE-NOTIFY"), list(makeSymbol("QUEUE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEQUEUE-NOTIFY"), list(makeSymbol("QUEUE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-NOTIFY"), list(makeSymbol("QUEUE")), makeKeyword("PUBLIC")) });

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_BASIC_SUBLOOP_PROCESS_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-SUBLOOP-PROCESS-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_BASIC_SUBLOOP_PROCESS_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-SUBLOOP-PROCESS-INSTANCE");

    static private final SubLList $list24 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list25 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("NAME"), NIL), list(makeSymbol("CSETQ"), makeSymbol("PRIORITY"), ZERO_INTEGER), list(makeSymbol("CSETQ"), makeSymbol("STATUS"), makeKeyword("UNKNOWN")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym26$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-SUBLOOP-PROCESS-METHOD");

    private static final SubLSymbol BASIC_SUBLOOP_PROCESS_INITIALIZE_METHOD = makeSymbol("BASIC-SUBLOOP-PROCESS-INITIALIZE-METHOD");

    static private final SubLList $list30 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list31 = list(makeSymbol("STREAM"), makeSymbol("DEPTH"));

    static private final SubLList $list32 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("#<BASIC-SUBLOOP-PROCESS: ~S, ~S>"), makeSymbol("NAME"), makeSymbol("STATUS")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym33$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-SUBLOOP-PROCESS-METHOD");

    static private final SubLString $str34$__BASIC_SUBLOOP_PROCESS___S___S_ = makeString("#<BASIC-SUBLOOP-PROCESS: ~S, ~S>");

    private static final SubLSymbol BASIC_SUBLOOP_PROCESS_PRINT_METHOD = makeSymbol("BASIC-SUBLOOP-PROCESS-PRINT-METHOD");

    static private final SubLList $list37 = list(makeKeyword("READ-ONLY"), makeKeyword("PUBLIC"));

    static private final SubLList $list38 = list(list(RET, makeSymbol("NAME")));

    private static final SubLSymbol BASIC_SUBLOOP_PROCESS_GET_NAME_METHOD = makeSymbol("BASIC-SUBLOOP-PROCESS-GET-NAME-METHOD");

    static private final SubLList $list41 = list(makeSymbol("NEW-NAME"));

    static private final SubLList $list42 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-NAME")), list(makeSymbol("STRINGP"), makeSymbol("NEW-NAME"))), makeString("(SET-NAME ~S): ~S is not a valid name.  A string or NIL was expected."), makeSymbol("SELF"), makeSymbol("NEW-NAME")), list(makeSymbol("CSETQ"), makeSymbol("NAME"), makeSymbol("NEW-NAME")), list(RET, makeSymbol("NEW-NAME")));

    static private final SubLSymbol $sym43$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-SUBLOOP-PROCESS-METHOD");

    static private final SubLString $str44$_SET_NAME__S____S_is_not_a_valid_ = makeString("(SET-NAME ~S): ~S is not a valid name.  A string or NIL was expected.");

    private static final SubLSymbol BASIC_SUBLOOP_PROCESS_SET_NAME_METHOD = makeSymbol("BASIC-SUBLOOP-PROCESS-SET-NAME-METHOD");

    private static final SubLSymbol GET_PRIORITY = makeSymbol("GET-PRIORITY");

    static private final SubLList $list47 = list(list(RET, makeSymbol("PRIORITY")));

    private static final SubLSymbol BASIC_SUBLOOP_PROCESS_GET_PRIORITY_METHOD = makeSymbol("BASIC-SUBLOOP-PROCESS-GET-PRIORITY-METHOD");

    private static final SubLSymbol SET_PRIORITY = makeSymbol("SET-PRIORITY");

    static private final SubLList $list50 = list(makeSymbol("NEW-PRIORITY"));

    static private final SubLList $list51 = list(list(makeSymbol("MUST"), list(makeSymbol("CAND"), list(makeSymbol("INTEGERP"), makeSymbol("NEW-PRIORITY")), list(makeSymbol(">="), makeSymbol("NEW-PRIORITY"), ZERO_INTEGER)), makeString("(SET-PRIORITY ~S): ~S is not a valid priority.  A non negative integer was expected."), makeSymbol("SELF"), makeSymbol("NEW-PRIORITY")), list(makeSymbol("CSETQ"), makeSymbol("PRIORITY"), makeSymbol("NEW-PRIORITY")), list(RET, makeSymbol("NEW-PRIORITY")));

    static private final SubLSymbol $sym52$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-SUBLOOP-PROCESS-METHOD");

    static private final SubLString $str53$_SET_PRIORITY__S____S_is_not_a_va = makeString("(SET-PRIORITY ~S): ~S is not a valid priority.  A non negative integer was expected.");

    private static final SubLSymbol BASIC_SUBLOOP_PROCESS_SET_PRIORITY_METHOD = makeSymbol("BASIC-SUBLOOP-PROCESS-SET-PRIORITY-METHOD");

    private static final SubLSymbol GET_STATUS = makeSymbol("GET-STATUS");

    static private final SubLList $list56 = list(list(RET, makeSymbol("STATUS")));

    private static final SubLSymbol BASIC_SUBLOOP_PROCESS_GET_STATUS_METHOD = makeSymbol("BASIC-SUBLOOP-PROCESS-GET-STATUS-METHOD");

    static private final SubLList $list59 = list(makeKeyword("NO-MEMBER-VARIABLES"), makeKeyword("PUBLIC"));

    static private final SubLList $list60 = list(list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"), makeKeyword("ERROR"))), list(makeSymbol("CUNWIND-PROTECT"), list(makeSymbol("PROGN"), list(makeSymbol("INLINE-SET-SLOT"), list(makeSymbol("STATUS"), makeSymbol("BASIC-SUBLOOP-PROCESS")), makeSymbol("SELF"), makeKeyword("ACTIVE")), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("RUN-INTERNAL")))), list(makeSymbol("PIF"), list(makeSymbol("COR"), list(EQ, makeSymbol("RESULT"), makeKeyword("TERMINATED")), list(EQ, makeSymbol("RESULT"), makeKeyword("KILLED")), list(EQ, makeSymbol("RESULT"), makeKeyword("ERROR"))), list(makeSymbol("INLINE-SET-SLOT"), list(makeSymbol("STATUS"), makeSymbol("BASIC-SUBLOOP-PROCESS")), makeSymbol("SELF"), $DEAD), list(makeSymbol("INLINE-SET-SLOT"), list(makeSymbol("STATUS"), makeSymbol("BASIC-SUBLOOP-PROCESS")), makeSymbol("SELF"), makeKeyword("SUSPENDED")))), list(makeSymbol("INLINE-SET-SLOT"), list(makeSymbol("STATUS"), makeSymbol("BASIC-SUBLOOP-PROCESS")), makeSymbol("SELF"), makeKeyword("ERROR"))), list(RET, makeSymbol("RESULT"))));

    private static final SubLSymbol RUN_INTERNAL = makeSymbol("RUN-INTERNAL");

    private static final SubLSymbol BASIC_SUBLOOP_PROCESS_RUN_METHOD = makeSymbol("BASIC-SUBLOOP-PROCESS-RUN-METHOD");

    static private final SubLList $list69 = list(makeKeyword("NO-MEMBER-VARIABLES"), makeKeyword("PROTECTED"));

    static private final SubLList $list70 = list(list(RET, NIL));

    private static final SubLSymbol BASIC_SUBLOOP_PROCESS_RUN_INTERNAL_METHOD = makeSymbol("BASIC-SUBLOOP-PROCESS-RUN-INTERNAL-METHOD");

    private static final SubLSymbol SUSPEND = makeSymbol("SUSPEND");

    static private final SubLList $list73 = list(list(makeSymbol("CLET"), list(list(makeSymbol("STATUS"), list(makeSymbol("INLINE-GET-SLOT"), list(makeSymbol("STATUS"), makeSymbol("BASIC-SUBLOOP-PROCESS")), makeSymbol("SELF")))), list(makeSymbol("PCASE"), makeSymbol("STATUS"), list($DEAD, list(RET, makeSymbol("STATUS"))))), list(makeSymbol("INLINE-SET-SLOT"), list(makeSymbol("STATUS"), makeSymbol("BASIC-SUBLOOP-PROCESS")), makeSymbol("SELF"), makeKeyword("SUSPENDED")), list(makeSymbol("CLET"), list(list(makeSymbol("OWNER"), list(makeSymbol("INLINE-GET-SLOT"), list(makeSymbol("OWNER"), makeSymbol("BASIC-SUBLOOP-PROCESS")), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("OWNER"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("REMOVE"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("OWNER"), makeSymbol("SELF")))), list(RET, NIL));

    private static final SubLSymbol BASIC_SUBLOOP_PROCESS_SUSPEND_METHOD = makeSymbol("BASIC-SUBLOOP-PROCESS-SUSPEND-METHOD");

    private static final SubLSymbol KILL = makeSymbol("KILL");

    static private final SubLList $list76 = list(list(makeSymbol("INLINE-SET-SLOT"), list(makeSymbol("STATUS"), makeSymbol("BASIC-SUBLOOP-PROCESS")), makeSymbol("SELF"), makeKeyword("KILLED")), list(RET, NIL));

    private static final SubLSymbol BASIC_SUBLOOP_PROCESS_KILL_METHOD = makeSymbol("BASIC-SUBLOOP-PROCESS-KILL-METHOD");

    private static final SubLSymbol GET_OWNER = makeSymbol("GET-OWNER");

    static private final SubLList $list79 = list(list(RET, makeSymbol("OWNER")));

    private static final SubLSymbol BASIC_SUBLOOP_PROCESS_GET_OWNER_METHOD = makeSymbol("BASIC-SUBLOOP-PROCESS-GET-OWNER-METHOD");

    private static final SubLSymbol SET_OWNER = makeSymbol("SET-OWNER");

    static private final SubLList $list82 = list(makeSymbol("NEW-SCHEDULER"));

    static private final SubLList $list83 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-SCHEDULER")), list(makeSymbol("MULTI-TASK-SCHEDULER-P"), makeSymbol("NEW-SCHEDULER"))), makeString("(SET-OWNER ~S): ~S is not an instance of MULTI-TASK-SCHEDULER."), makeSymbol("SELF"), makeSymbol("NEW-SCHEDULER")), list(makeSymbol("CSETQ"), makeSymbol("OWNER"), makeSymbol("NEW-SCHEDULER")), list(RET, makeSymbol("NEW-SCHEDULER")));

    static private final SubLSymbol $sym84$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-SUBLOOP-PROCESS-METHOD");

    static private final SubLString $str85$_SET_OWNER__S____S_is_not_an_inst = makeString("(SET-OWNER ~S): ~S is not an instance of MULTI-TASK-SCHEDULER.");

    private static final SubLSymbol BASIC_SUBLOOP_PROCESS_SET_OWNER_METHOD = makeSymbol("BASIC-SUBLOOP-PROCESS-SET-OWNER-METHOD");

    static private final SubLSymbol $sym87$NOTHING_TO_DO_ = makeSymbol("NOTHING-TO-DO?");

    static private final SubLSymbol $sym88$BASIC_SUBLOOP_PROCESS_NOTHING_TO_DO__METHOD = makeSymbol("BASIC-SUBLOOP-PROCESS-NOTHING-TO-DO?-METHOD");

    static private final SubLList $list90 = list(makeSymbol("QUEUE"));

    static private final SubLList $list91 = list(list(makeSymbol("IGNORE"), makeSymbol("QUEUE")), list(RET, NIL));

    private static final SubLSymbol BASIC_SUBLOOP_PROCESS_ENQUEUE_NOTIFY_METHOD = makeSymbol("BASIC-SUBLOOP-PROCESS-ENQUEUE-NOTIFY-METHOD");

    static private final SubLList $list94 = list(list(makeSymbol("IGNORE"), makeSymbol("QUEUE")), list(makeSymbol("CLET"), list(list(makeSymbol("STATUS"), list(makeSymbol("INLINE-GET-SLOT"), list(makeSymbol("STATUS"), makeSymbol("BASIC-SUBLOOP-PROCESS")), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), list(EQ, makeSymbol("STATUS"), $DEAD), list(RET, NIL))), list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"), list(makeSymbol("RUN"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), list(makeSymbol("COR"), list(EQ, makeSymbol("RESULT"), makeKeyword("TERMINATED")), list(EQ, makeSymbol("RESULT"), makeKeyword("KILLED")), list(EQ, makeSymbol("RESULT"), makeKeyword("ERROR"))), list(makeSymbol("KILL"), makeSymbol("SELF")))), list(RET, NIL));

    private static final SubLSymbol BASIC_SUBLOOP_PROCESS_DEQUEUE_NOTIFY_METHOD = makeSymbol("BASIC-SUBLOOP-PROCESS-DEQUEUE-NOTIFY-METHOD");

    static private final SubLList $list97 = list(list(makeSymbol("IGNORE"), makeSymbol("QUEUE")), list(makeSymbol("KILL"), makeSymbol("SELF")), list(RET, NIL));

    private static final SubLSymbol BASIC_SUBLOOP_PROCESS_REMOVE_NOTIFY_METHOD = makeSymbol("BASIC-SUBLOOP-PROCESS-REMOVE-NOTIFY-METHOD");

    private static final SubLSymbol MULTI_TASK_SCHEDULER = makeSymbol("MULTI-TASK-SCHEDULER");

    static private final SubLList $list100 = list(new SubLObject[]{ list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-TASK"), list(makeSymbol("SUBLOOP-PROCESS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("KILL-TASK"), list(makeSymbol("SUBLOOP-PROCESS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("KILL-TASK-BY-NAME"), list(makeSymbol("SUBLOOP-PROCESS-NAME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INTERRUPT-TASK"), list(makeSymbol("SUBLOOP-PROCESS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INTERRUPT-TASK-BY-NAME"), list(makeSymbol("SUBLOOP-PROCESS-NAME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ALL-TASKS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("KILL-ALL-TASKS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RUN"), list(makeSymbol("&OPTIONAL"), list(makeSymbol("EXPIRATION-DELTA"), NIL)), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TRACE-MODE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-TRACE-MODE"), list(makeSymbol("NEW-TRACE-MODE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PERFORM-TRACE"), list(makeSymbol("PROCESS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NOTHING-TO-DO?"), NIL, makeKeyword("PUBLIC")) });

    static private final SubLList $list102 = list(makeSymbol("MULTI-TASK-SCHEDULER"));

    static private final SubLList $list103 = list(new SubLObject[]{ list(makeSymbol("TRANSFER-QUEUE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("PROCESS-QUEUE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("HALTED-P"), makeKeyword("BOOLEAN"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("TRACE-P"), makeKeyword("BOOLEAN"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("HALT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("START"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-TASK"), list(makeSymbol("SUBLOOP-PROCESS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("KILL-TASK"), list(makeSymbol("SUBLOOP-PROCESS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("KILL-TASK-BY-NAME"), list(makeSymbol("SUBLOOP-PROCESS-NAME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INTERRUPT-TASK"), list(makeSymbol("SUBLOOP-PROCESS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INTERRUPT-TASK-BY-NAME"), list(makeSymbol("SUBLOOP-PROCESS-NAME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ALL-TASKS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("KILL-ALL-TASKS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RUN"), list(makeSymbol("&OPTIONAL"), list(makeSymbol("EXPIRATION-DELTA"), NIL)), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TRACE-MODE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-TRACE-MODE"), list(makeSymbol("NEW-TRACE-MODE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PERFORM-TRACE"), list(makeSymbol("PROCESS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NOTHING-TO-DO?"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-NOTHING-TO-DO"), NIL, makeKeyword("PUBLIC")) });

    private static final SubLInteger $int$4098 = makeInteger(4098);

    private static final SubLInteger $int$4097 = makeInteger(4097);

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_BASIC_MULTI_TASK_SCHEDULER_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-MULTI-TASK-SCHEDULER-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_BASIC_MULTI_TASK_SCHEDULER_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-MULTI-TASK-SCHEDULER-INSTANCE");

    static private final SubLList $list112 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("TRANSFER-QUEUE"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PASSIVE"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("TRANSFER-QUEUE"), T), list(makeSymbol("CSETQ"), makeSymbol("PROCESS-QUEUE"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")))), list(makeSymbol("CSETQ"), makeSymbol("HALTED-P"), T), list(makeSymbol("CSETQ"), makeSymbol("TRACE-P"), NIL), list(RET, NIL));

    static private final SubLSymbol $sym113$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-MULTI-TASK-SCHEDULER-METHOD");

    private static final SubLSymbol BASIC_MULTI_TASK_SCHEDULER_INITIALIZE_METHOD = makeSymbol("BASIC-MULTI-TASK-SCHEDULER-INITIALIZE-METHOD");

    static private final SubLList $list117 = list(list(makeSymbol("CSETQ"), makeSymbol("HALTED-P"), T), list(RET, T));

    static private final SubLSymbol $sym118$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-MULTI-TASK-SCHEDULER-METHOD");

    private static final SubLSymbol BASIC_MULTI_TASK_SCHEDULER_HALT_METHOD = makeSymbol("BASIC-MULTI-TASK-SCHEDULER-HALT-METHOD");

    static private final SubLList $list121 = list(list(makeSymbol("CSETQ"), makeSymbol("HALTED-P"), NIL), list(makeSymbol("RUN"), makeSymbol("SELF")), list(RET, T));

    static private final SubLSymbol $sym122$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-MULTI-TASK-SCHEDULER-METHOD");

    private static final SubLSymbol BASIC_MULTI_TASK_SCHEDULER_START_METHOD = makeSymbol("BASIC-MULTI-TASK-SCHEDULER-START-METHOD");

    static private final SubLList $list125 = list(makeSymbol("SUBLOOP-PROCESS"));

    static private final SubLList $list126 = list(list(makeSymbol("MUST"), list(makeSymbol("SUBLOOP-PROCESS-P"), makeSymbol("SUBLOOP-PROCESS")), makeString("(ADD-TASK ~S): ~S is not a SubLOOP process."), makeSymbol("SELF"), makeSymbol("SUBLOOP-PROCESS")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ENQUEUE"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("PROCESS-QUEUE"), makeSymbol("SUBLOOP-PROCESS")), list(RET, makeSymbol("SUBLOOP-PROCESS")));

    static private final SubLSymbol $sym127$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-MULTI-TASK-SCHEDULER-METHOD");

    static private final SubLString $str128$_ADD_TASK__S____S_is_not_a_SubLOO = makeString("(ADD-TASK ~S): ~S is not a SubLOOP process.");

    private static final SubLSymbol BASIC_MULTI_TASK_SCHEDULER_ADD_TASK_METHOD = makeSymbol("BASIC-MULTI-TASK-SCHEDULER-ADD-TASK-METHOD");

    private static final SubLSymbol KILL_TASK = makeSymbol("KILL-TASK");

    static private final SubLList $list131 = list(list(makeSymbol("MUST"), list(makeSymbol("SUBLOOP-PROCESS-P"), makeSymbol("SUBLOOP-PROCESS")), makeString("(KILL-TASK ~S): ~S is not a SubLOOP process."), makeSymbol("SELF"), makeSymbol("SUBLOOP-PROCESS")), list(makeSymbol("PWHEN"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ENQUEUED-P"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("PROCESS-QUEUE"), makeSymbol("SUBLOOP-PROCESS")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("REMOVE"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("PROCESS-QUEUE"), makeSymbol("SUBLOOP-PROCESS")), list(RET, makeSymbol("SUBLOOP-PROCESS"))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("REMOVE"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("TRANSFER-QUEUE"), makeSymbol("SUBLOOP-PROCESS")), list(RET, NIL));

    static private final SubLString $str132$_KILL_TASK__S____S_is_not_a_SubLO = makeString("(KILL-TASK ~S): ~S is not a SubLOOP process.");

    private static final SubLSymbol BASIC_MULTI_TASK_SCHEDULER_KILL_TASK_METHOD = makeSymbol("BASIC-MULTI-TASK-SCHEDULER-KILL-TASK-METHOD");

    private static final SubLSymbol KILL_TASK_BY_NAME = makeSymbol("KILL-TASK-BY-NAME");

    static private final SubLList $list135 = list(makeSymbol("SUBLOOP-PROCESS-NAME"));

    static private final SubLList $list136 = list(list(makeSymbol("CLET"), list(list(makeSymbol("KEY"), list(makeSymbol("RESOLVE-METHOD"), list(QUOTE, makeSymbol("GET-NAME")), list(QUOTE, makeSymbol("BASIC-SUBLOOP-PROCESS")))), list(makeSymbol("TASK"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("FIND"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("PROCESS-QUEUE"), makeSymbol("SUBLOOP-PROCESS-NAME"), list(makeSymbol("FUNCTION"), EQUAL), makeSymbol("KEY")))), list(makeSymbol("PWHEN"), makeSymbol("TASK"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("REMOVE"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("PROCESS-QUEUE"), makeSymbol("SUBLOOP-PROCESS-NAME")), list(RET, makeSymbol("TASK"))), list(makeSymbol("CSETQ"), makeSymbol("TASK"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("FIND"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("TRANSFER-QUEUE"), makeSymbol("SUBLOOP-PROCESS-NAME"), list(makeSymbol("FUNCTION"), EQUAL), makeSymbol("KEY"))), list(makeSymbol("PWHEN"), makeSymbol("TASK"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("REMOVE"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("TRANSFER-QUEUE"), makeSymbol("TASK")), list(RET, makeSymbol("TASK"))), list(RET, NIL)));

    private static final SubLSymbol BASIC_MULTI_TASK_SCHEDULER_KILL_TASK_BY_NAME_METHOD = makeSymbol("BASIC-MULTI-TASK-SCHEDULER-KILL-TASK-BY-NAME-METHOD");

    private static final SubLSymbol INTERRUPT_TASK = makeSymbol("INTERRUPT-TASK");

    static private final SubLList $list139 = list(list(makeSymbol("MUST"), list(makeSymbol("SUBLOOP-PROCESS-P"), makeSymbol("SUBLOOP-PROCESS")), makeString("(INTERRUPT-TASK ~S): ~S is not a SubLOOP process."), makeSymbol("SELF"), makeSymbol("SUBLOOP-PROCESS")), list(makeSymbol("PWHEN"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ENQUEUED-P"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("PROCESS-QUEUE"), makeSymbol("SUBLOOP-PROCESS")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("REMOVE"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("PROCESS-QUEUE"), makeSymbol("SUBLOOP-PROCESS")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ENQUEUE"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("TRANSFER-QUEUE"), makeSymbol("SUBLOOP-PROCESS")), list(RET, makeSymbol("SUBLOOP-PROCESS"))), list(RET, NIL));

    static private final SubLString $str140$_INTERRUPT_TASK__S____S_is_not_a_ = makeString("(INTERRUPT-TASK ~S): ~S is not a SubLOOP process.");

    private static final SubLSymbol BASIC_MULTI_TASK_SCHEDULER_INTERRUPT_TASK_METHOD = makeSymbol("BASIC-MULTI-TASK-SCHEDULER-INTERRUPT-TASK-METHOD");

    private static final SubLSymbol INTERRUPT_TASK_BY_NAME = makeSymbol("INTERRUPT-TASK-BY-NAME");

    static private final SubLList $list143 = list(list(makeSymbol("CLET"), list(list(makeSymbol("KEY"), list(makeSymbol("RESOLVE-METHOD"), list(QUOTE, makeSymbol("GET-NAME")), list(QUOTE, makeSymbol("BASIC-SUBLOOP-PROCESS")))), list(makeSymbol("TASK"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("FIND"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("PROCESS-QUEUE"), makeSymbol("SUBLOOP-PROCESS-NAME"), list(makeSymbol("FUNCTION"), EQUAL), makeSymbol("KEY")))), list(makeSymbol("PWHEN"), makeSymbol("TASK"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("REMOVE"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("PROCESS-QUEUE"), makeSymbol("TASK")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ENQUEUE"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("TRANSFER-QUEUE"), makeSymbol("TASK")), list(RET, makeSymbol("TASK"))), list(RET, NIL)));

    private static final SubLSymbol BASIC_MULTI_TASK_SCHEDULER_INTERRUPT_TASK_BY_NAME_METHOD = makeSymbol("BASIC-MULTI-TASK-SCHEDULER-INTERRUPT-TASK-BY-NAME-METHOD");

    private static final SubLSymbol GET_ALL_TASKS = makeSymbol("GET-ALL-TASKS");

    static private final SubLList $list146 = list(list(RET, list(makeSymbol("NCONC"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-CONTENTS"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("PROCESS-QUEUE")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-CONTENTS"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("TRANSFER-QUEUE")))));

    private static final SubLSymbol BASIC_MULTI_TASK_SCHEDULER_GET_ALL_TASKS_METHOD = makeSymbol("BASIC-MULTI-TASK-SCHEDULER-GET-ALL-TASKS-METHOD");

    private static final SubLSymbol KILL_ALL_TASKS = makeSymbol("KILL-ALL-TASKS");

    static private final SubLList $list149 = list(list(makeSymbol("CLET"), list(list(makeSymbol("ALL-TASKS"), list(makeSymbol("GET-ALL-TASKS"), makeSymbol("SELF")))), list(makeSymbol("CDOLIST"), list(makeSymbol("TASK"), makeSymbol("ALL-TASKS")), list(makeSymbol("KILL-TASK"), makeSymbol("SELF"), makeSymbol("TASK")))), list(RET, NIL));

    private static final SubLSymbol BASIC_MULTI_TASK_SCHEDULER_KILL_ALL_TASKS_METHOD = makeSymbol("BASIC-MULTI-TASK-SCHEDULER-KILL-ALL-TASKS-METHOD");

    static private final SubLList $list151 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("EXPIRATION-DELTA"), NIL));

    static private final SubLList $list152 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("EXPIRATION-DELTA")), list(makeSymbol("CAND"), list(makeSymbol("INTEGERP"), makeSymbol("EXPIRATION-DELTA"))), list(makeSymbol(">="), makeSymbol("EXPIRATION-DELTA"), ZERO_INTEGER)), makeString("(RUN ~S): ~S is not a valid expiration-delta.  NIL or a non negative integer was expected."), makeSymbol("SELF"), makeSymbol("EXPIRATION-DELTA")), list(makeSymbol("INLINE-SET-SLOT"), list(makeSymbol("HALTED-P"), makeSymbol("BASIC-MULTI-TASK-SCHEDULER")), makeSymbol("SELF"), NIL), list(makeSymbol("CLET"), list(list(makeSymbol("TRANSFER-QUEUE"), list(makeSymbol("INLINE-GET-SLOT"), list(makeSymbol("TRANSFER-QUEUE"), makeSymbol("BASIC-MULTI-TASK-SCHEDULER")), makeSymbol("SELF"))), list(makeSymbol("PROCESS-QUEUE"), list(makeSymbol("INLINE-GET-SLOT"), list(makeSymbol("PROCESS-QUEUE"), makeSymbol("BASIC-MULTI-TASK-SCHEDULER")), makeSymbol("SELF"))), makeSymbol("CURRENT-PROCESS")), list(makeSymbol("IGNORE"), makeSymbol("TRANSFER-QUEUE")), list(makeSymbol("PIF"), makeSymbol("EXPIRATION-DELTA"), list(makeSymbol("CLET"), list(list(makeSymbol("START-TIME"), list(makeSymbol("GET-UNIVERSAL-TIME"))), list(makeSymbol("STOP-TIME"), list(makeSymbol("+"), makeSymbol("START-TIME"), makeSymbol("EXPIRATION-DELTA")))), list(makeSymbol("INLINE-SET-SLOT"), list(makeSymbol("HALTED-P"), makeSymbol("BASIC-MULTI-TASK-SCHEDULER")), makeSymbol("SELF"), list(makeSymbol(">="), makeSymbol("STOP-TIME"), list(makeSymbol("GET-UNIVERSAL-TIME")))), list(makeSymbol("WHILE"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("INLINE-GET-SLOT"), list(makeSymbol("HALTED-P"), makeSymbol("BASIC-MULTI-TASK-SCHEDULER")), makeSymbol("SELF"))), list(makeSymbol("CNOT"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("EMPTY-P"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("PROCESS-QUEUE")))), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-PROCESS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("DEQUEUE"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("PROCESS-QUEUE"))), list(makeSymbol("PWHEN"), list(makeSymbol("INLINE-GET-SLOT"), list(makeSymbol("TRACE-P"), makeSymbol("BASIC-MULTI-TASK-SCHEDULER")), makeSymbol("SELF")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PERFORM-TRACE")), makeSymbol("CURRENT-PROCESS"))), list(makeSymbol("PUNLESS"), list(makeSymbol("MEMBER"), list(makeSymbol("INLINE-GET-SLOT"), list(makeSymbol("STATUS"), makeSymbol("BASIC-SUBLOOP-PROCESS")), makeSymbol("CURRENT-PROCESS")), list(QUOTE, list($DEAD, makeKeyword("KILLED"), makeKeyword("TERMINATED")))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ENQUEUE"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("PROCESS-QUEUE"), makeSymbol("CURRENT-PROCESS"))), list(makeSymbol("INLINE-SET-SLOT"), list(makeSymbol("HALTED-P"), makeSymbol("BASIC-MULTI-TASK-SCHEDULER")), makeSymbol("SELF"), list(makeSymbol(">="), makeSymbol("STOP-TIME"), list(makeSymbol("GET-UNIVERSAL-TIME")))), list(makeSymbol("PWHEN"), list(makeSymbol("NOTHING-TO-DO?"), makeSymbol("SELF")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ON-NOTHING-TO-DO")))))), list(makeSymbol("WHILE"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("INLINE-GET-SLOT"), list(makeSymbol("HALTED-P"), makeSymbol("BASIC-MULTI-TASK-SCHEDULER")), makeSymbol("SELF"))), list(makeSymbol("CNOT"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("EMPTY-P"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("PROCESS-QUEUE")))), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-PROCESS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("DEQUEUE"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("PROCESS-QUEUE"))), list(makeSymbol("PWHEN"), list(makeSymbol("INLINE-GET-SLOT"), list(makeSymbol("TRACE-P"), makeSymbol("BASIC-MULTI-TASK-SCHEDULER")), makeSymbol("SELF")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PERFORM-TRACE")), makeSymbol("CURRENT-PROCESS"))), list(makeSymbol("PUNLESS"), list(makeSymbol("MEMBER"), list(makeSymbol("INLINE-GET-SLOT"), list(makeSymbol("STATUS"), makeSymbol("BASIC-SUBLOOP-PROCESS")), makeSymbol("CURRENT-PROCESS")), list(QUOTE, list($DEAD, makeKeyword("KILLED"), makeKeyword("TERMINATED")))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ENQUEUE"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("PROCESS-QUEUE"), makeSymbol("CURRENT-PROCESS"))), list(makeSymbol("PWHEN"), list(makeSymbol("NOTHING-TO-DO?"), makeSymbol("SELF")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ON-NOTHING-TO-DO"))))))), list(RET, NIL));

    static private final SubLString $str153$_RUN__S____S_is_not_a_valid_expir = makeString("(RUN ~S): ~S is not a valid expiration-delta.  NIL or a non negative integer was expected.");

    private static final SubLSymbol PERFORM_TRACE = makeSymbol("PERFORM-TRACE");

    static private final SubLList $list155 = list($DEAD, makeKeyword("KILLED"), makeKeyword("TERMINATED"));

    private static final SubLSymbol ON_NOTHING_TO_DO = makeSymbol("ON-NOTHING-TO-DO");

    private static final SubLSymbol BASIC_MULTI_TASK_SCHEDULER_RUN_METHOD = makeSymbol("BASIC-MULTI-TASK-SCHEDULER-RUN-METHOD");

    private static final SubLSymbol GET_TRACE_MODE = makeSymbol("GET-TRACE-MODE");

    static private final SubLList $list159 = list(list(RET, makeSymbol("TRACE-P")));

    private static final SubLSymbol BASIC_MULTI_TASK_SCHEDULER_GET_TRACE_MODE_METHOD = makeSymbol("BASIC-MULTI-TASK-SCHEDULER-GET-TRACE-MODE-METHOD");

    private static final SubLSymbol SET_TRACE_MODE = makeSymbol("SET-TRACE-MODE");

    static private final SubLList $list162 = list(makeSymbol("NEW-TRACE-MODE"));

    static private final SubLList $list163 = list(list(makeSymbol("CSETQ"), makeSymbol("TRACE-P"), makeSymbol("NEW-TRACE-MODE")), list(RET, makeSymbol("NEW-TRACE-MODE")));

    static private final SubLSymbol $sym164$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-MULTI-TASK-SCHEDULER-METHOD");

    private static final SubLSymbol BASIC_MULTI_TASK_SCHEDULER_SET_TRACE_MODE_METHOD = makeSymbol("BASIC-MULTI-TASK-SCHEDULER-SET-TRACE-MODE-METHOD");

    static private final SubLList $list166 = list(makeSymbol("PROCESS"));

    static private final SubLList $list167 = list(list(makeSymbol("IGNORE"), makeSymbol("PROCESS")), list(RET, NIL));

    private static final SubLSymbol BASIC_MULTI_TASK_SCHEDULER_PERFORM_TRACE_METHOD = makeSymbol("BASIC-MULTI-TASK-SCHEDULER-PERFORM-TRACE-METHOD");

    static private final SubLList $list169 = list(list(makeSymbol("CLET"), list(list(makeSymbol("QUEUE-CONTENTS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-CONTENTS"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("PROCESS-QUEUE")))), list(makeSymbol("CDOLIST"), list(makeSymbol("PROCESS"), makeSymbol("QUEUE-CONTENTS")), list(makeSymbol("PUNLESS"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PROCESS"), list(QUOTE, makeSymbol("NOTHING-TO-DO?"))), list(RET, NIL))), list(RET, T)));

    static private final SubLSymbol $sym170$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-MULTI-TASK-SCHEDULER-METHOD");

    static private final SubLSymbol $sym171$BASIC_MULTI_TASK_SCHEDULER_NOTHING_TO_DO__METHOD = makeSymbol("BASIC-MULTI-TASK-SCHEDULER-NOTHING-TO-DO?-METHOD");

    private static final SubLSymbol BASIC_MULTI_TASK_SCHEDULER_ON_NOTHING_TO_DO_METHOD = makeSymbol("BASIC-MULTI-TASK-SCHEDULER-ON-NOTHING-TO-DO-METHOD");

    /**
     * Returns a list of all valid members of the SUBLOOP-PROCESS-STATUS-TYPE enumeration.
     */
    @LispMethod(comment = "Returns a list of all valid members of the SUBLOOP-PROCESS-STATUS-TYPE enumeration.")
    public static final SubLObject valid_subloop_process_status_types_alt() {
        return $valid_subloop_process_status_types$.getGlobalValue();
    }

    /**
     * Returns a list of all valid members of the SUBLOOP-PROCESS-STATUS-TYPE enumeration.
     */
    @LispMethod(comment = "Returns a list of all valid members of the SUBLOOP-PROCESS-STATUS-TYPE enumeration.")
    public static SubLObject valid_subloop_process_status_types() {
        return $valid_subloop_process_status_types$.getGlobalValue();
    }

    /**
     * Return T iff OBJECT is a member of the SUBLOOP-PROCESS-STATUS-TYPE enumeration.
     */
    @LispMethod(comment = "Return T iff OBJECT is a member of the SUBLOOP-PROCESS-STATUS-TYPE enumeration.")
    public static final SubLObject subloop_process_status_type_p_alt(SubLObject v_object) {
        return NIL != member(v_object, $valid_subloop_process_status_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    /**
     * Return T iff OBJECT is a member of the SUBLOOP-PROCESS-STATUS-TYPE enumeration.
     */
    @LispMethod(comment = "Return T iff OBJECT is a member of the SUBLOOP-PROCESS-STATUS-TYPE enumeration.")
    public static SubLObject subloop_process_status_type_p(final SubLObject v_object) {
        return NIL != member(v_object, $valid_subloop_process_status_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED) ? T : NIL;
    }

    /**
     * Maps a member of the SUBLOOP-PROCESS-STATUS-TYPE enumeration to an integer encoding.
     */
    @LispMethod(comment = "Maps a member of the SUBLOOP-PROCESS-STATUS-TYPE enumeration to an integer encoding.")
    public static final SubLObject encode_subloop_process_status_type_alt(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos = position(value, $valid_subloop_process_status_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == pos) {
                        Errors.error($str_alt2$_S___S_is_not_a_member_of_the__S_, ENCODE_SUBLOOP_PROCESS_STATUS_TYPE, value, SUBLOOP_PROCESS_STATUS_TYPE);
                    }
                }
                return pos;
            }
        }
    }

    /**
     * Maps a member of the SUBLOOP-PROCESS-STATUS-TYPE enumeration to an integer encoding.
     */
    @LispMethod(comment = "Maps a member of the SUBLOOP-PROCESS-STATUS-TYPE enumeration to an integer encoding.")
    public static SubLObject encode_subloop_process_status_type(final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pos = position(value, $valid_subloop_process_status_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == pos)) {
            Errors.error($str2$_S___S_is_not_a_member_of_the__S_, ENCODE_SUBLOOP_PROCESS_STATUS_TYPE, value, SUBLOOP_PROCESS_STATUS_TYPE);
        }
        return pos;
    }

    /**
     * Maps an encoded value to a member of the SUBLOOP-PROCESS-STATUS-TYPE enumeration.
     */
    @LispMethod(comment = "Maps an encoded value to a member of the SUBLOOP-PROCESS-STATUS-TYPE enumeration.")
    public static final SubLObject decode_subloop_process_status_type_alt(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject element = nth(value, $valid_subloop_process_status_types$.getGlobalValue());
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == element) {
                        Errors.error($str_alt4$_S___S_is_not_a_valid_encoding_of, DECODE_SUBLOOP_PROCESS_STATUS_TYPE, value, SUBLOOP_PROCESS_STATUS_TYPE);
                    }
                }
                return element;
            }
        }
    }

    /**
     * Maps an encoded value to a member of the SUBLOOP-PROCESS-STATUS-TYPE enumeration.
     */
    @LispMethod(comment = "Maps an encoded value to a member of the SUBLOOP-PROCESS-STATUS-TYPE enumeration.")
    public static SubLObject decode_subloop_process_status_type(final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject element = nth(value, $valid_subloop_process_status_types$.getGlobalValue());
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == element)) {
            Errors.error($str4$_S___S_is_not_a_valid_encoding_of, DECODE_SUBLOOP_PROCESS_STATUS_TYPE, value, SUBLOOP_PROCESS_STATUS_TYPE);
        }
        return element;
    }

    /**
     * Provides a LESSP predicate for members of the SUBLOOP-PROCESS-STATUS-TYPE enumeration.
     */
    @LispMethod(comment = "Provides a LESSP predicate for members of the SUBLOOP-PROCESS-STATUS-TYPE enumeration.")
    public static final SubLObject subloop_process_status_type_less_p_alt(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == com.cyc.cycjava.cycl.subloop_processes.subloop_process_status_type_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, SUBLOOP_PROCESS_STATUS_TYPE_P, value1, SUBLOOP_PROCESS_STATUS_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == com.cyc.cycjava.cycl.subloop_processes.subloop_process_status_type_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, SUBLOOP_PROCESS_STATUS_TYPE_P, value2, SUBLOOP_PROCESS_STATUS_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_subloop_process_status_types$.getGlobalValue();
                SubLObject value = NIL;
                for (value = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , value = cdolist_list_var.first()) {
                    if (value == value1) {
                        return makeBoolean(value != value2);
                    } else {
                        if (value == value2) {
                            return NIL;
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Provides a LESSP predicate for members of the SUBLOOP-PROCESS-STATUS-TYPE enumeration.
     */
    @LispMethod(comment = "Provides a LESSP predicate for members of the SUBLOOP-PROCESS-STATUS-TYPE enumeration.")
    public static SubLObject subloop_process_status_type_less_p(final SubLObject value1, final SubLObject value2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subloop_process_status_type_p(value1))) {
            Errors.error($str6$_S___S_was_expected_to_be_a_membe, SUBLOOP_PROCESS_STATUS_TYPE_P, value1, SUBLOOP_PROCESS_STATUS_TYPE);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subloop_process_status_type_p(value2))) {
            Errors.error($str6$_S___S_was_expected_to_be_a_membe, SUBLOOP_PROCESS_STATUS_TYPE_P, value2, SUBLOOP_PROCESS_STATUS_TYPE);
        }
        SubLObject cdolist_list_var = $valid_subloop_process_status_types$.getGlobalValue();
        SubLObject value3 = NIL;
        value3 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (value3.eql(value1)) {
                return makeBoolean(!value3.eql(value2));
            }
            if (value3.eql(value2)) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            value3 = cdolist_list_var.first();
        } 
        return NIL;
    }

    /**
     * Provides a GREATERP predicate for members of the SUBLOOP-PROCESS-STATUS-TYPE enumeration.
     */
    @LispMethod(comment = "Provides a GREATERP predicate for members of the SUBLOOP-PROCESS-STATUS-TYPE enumeration.")
    public static final SubLObject subloop_process_status_type_greater_p_alt(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == com.cyc.cycjava.cycl.subloop_processes.subloop_process_status_type_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, SUBLOOP_PROCESS_STATUS_TYPE_P, value1, SUBLOOP_PROCESS_STATUS_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == com.cyc.cycjava.cycl.subloop_processes.subloop_process_status_type_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, SUBLOOP_PROCESS_STATUS_TYPE_P, value2, SUBLOOP_PROCESS_STATUS_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_subloop_process_status_types$.getGlobalValue();
                SubLObject value = NIL;
                for (value = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , value = cdolist_list_var.first()) {
                    if (value == value2) {
                        return makeBoolean(value != value1);
                    } else {
                        if (value == value1) {
                            return NIL;
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Provides a GREATERP predicate for members of the SUBLOOP-PROCESS-STATUS-TYPE enumeration.
     */
    @LispMethod(comment = "Provides a GREATERP predicate for members of the SUBLOOP-PROCESS-STATUS-TYPE enumeration.")
    public static SubLObject subloop_process_status_type_greater_p(final SubLObject value1, final SubLObject value2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subloop_process_status_type_p(value1))) {
            Errors.error($str6$_S___S_was_expected_to_be_a_membe, SUBLOOP_PROCESS_STATUS_TYPE_P, value1, SUBLOOP_PROCESS_STATUS_TYPE);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subloop_process_status_type_p(value2))) {
            Errors.error($str6$_S___S_was_expected_to_be_a_membe, SUBLOOP_PROCESS_STATUS_TYPE_P, value2, SUBLOOP_PROCESS_STATUS_TYPE);
        }
        SubLObject cdolist_list_var = $valid_subloop_process_status_types$.getGlobalValue();
        SubLObject value3 = NIL;
        value3 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (value3.eql(value2)) {
                return makeBoolean(!value3.eql(value1));
            }
            if (value3.eql(value1)) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            value3 = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject subloop_process_p_alt(SubLObject subloop_process) {
        return interfaces.subloop_instanceof_interface(subloop_process, SUBLOOP_PROCESS);
    }

    public static SubLObject subloop_process_p(final SubLObject subloop_process) {
        return interfaces.subloop_instanceof_interface(subloop_process, SUBLOOP_PROCESS);
    }

    public static final SubLObject get_basic_subloop_process_owner_alt(SubLObject basic_subloop_process) {
        return classes.subloop_get_access_protected_instance_slot(basic_subloop_process, FOUR_INTEGER, OWNER);
    }

    public static SubLObject get_basic_subloop_process_owner(final SubLObject basic_subloop_process) {
        return classes.subloop_get_access_protected_instance_slot(basic_subloop_process, FOUR_INTEGER, OWNER);
    }

    public static final SubLObject set_basic_subloop_process_owner_alt(SubLObject basic_subloop_process, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_subloop_process, value, FOUR_INTEGER, OWNER);
    }

    public static SubLObject set_basic_subloop_process_owner(final SubLObject basic_subloop_process, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_subloop_process, value, FOUR_INTEGER, OWNER);
    }

    public static final SubLObject get_basic_subloop_process_status_alt(SubLObject basic_subloop_process) {
        return classes.subloop_get_instance_slot(basic_subloop_process, THREE_INTEGER);
    }

    public static SubLObject get_basic_subloop_process_status(final SubLObject basic_subloop_process) {
        return classes.subloop_get_instance_slot(basic_subloop_process, THREE_INTEGER);
    }

    public static final SubLObject set_basic_subloop_process_status_alt(SubLObject basic_subloop_process, SubLObject value) {
        return classes.subloop_set_instance_slot(basic_subloop_process, value, THREE_INTEGER);
    }

    public static SubLObject set_basic_subloop_process_status(final SubLObject basic_subloop_process, final SubLObject value) {
        return classes.subloop_set_instance_slot(basic_subloop_process, value, THREE_INTEGER);
    }

    public static final SubLObject get_basic_subloop_process_priority_alt(SubLObject basic_subloop_process) {
        return classes.subloop_get_instance_slot(basic_subloop_process, TWO_INTEGER);
    }

    public static SubLObject get_basic_subloop_process_priority(final SubLObject basic_subloop_process) {
        return classes.subloop_get_instance_slot(basic_subloop_process, TWO_INTEGER);
    }

    public static final SubLObject set_basic_subloop_process_priority_alt(SubLObject basic_subloop_process, SubLObject value) {
        return classes.subloop_set_instance_slot(basic_subloop_process, value, TWO_INTEGER);
    }

    public static SubLObject set_basic_subloop_process_priority(final SubLObject basic_subloop_process, final SubLObject value) {
        return classes.subloop_set_instance_slot(basic_subloop_process, value, TWO_INTEGER);
    }

    public static final SubLObject get_basic_subloop_process_name_alt(SubLObject basic_subloop_process) {
        return classes.subloop_get_instance_slot(basic_subloop_process, ONE_INTEGER);
    }

    public static SubLObject get_basic_subloop_process_name(final SubLObject basic_subloop_process) {
        return classes.subloop_get_instance_slot(basic_subloop_process, ONE_INTEGER);
    }

    public static final SubLObject set_basic_subloop_process_name_alt(SubLObject basic_subloop_process, SubLObject value) {
        return classes.subloop_set_instance_slot(basic_subloop_process, value, ONE_INTEGER);
    }

    public static SubLObject set_basic_subloop_process_name(final SubLObject basic_subloop_process, final SubLObject value) {
        return classes.subloop_set_instance_slot(basic_subloop_process, value, ONE_INTEGER);
    }

    public static final SubLObject subloop_reserved_initialize_basic_subloop_process_class_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_basic_subloop_process_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_basic_subloop_process_instance_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_SUBLOOP_PROCESS, NAME, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_SUBLOOP_PROCESS, PRIORITY, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_SUBLOOP_PROCESS, STATUS, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_SUBLOOP_PROCESS, OWNER, NIL);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_basic_subloop_process_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_SUBLOOP_PROCESS, NAME, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_SUBLOOP_PROCESS, PRIORITY, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_SUBLOOP_PROCESS, STATUS, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_SUBLOOP_PROCESS, OWNER, NIL);
        return NIL;
    }

    public static final SubLObject basic_subloop_process_p_alt(SubLObject basic_subloop_process) {
        return classes.subloop_instanceof_class(basic_subloop_process, BASIC_SUBLOOP_PROCESS);
    }

    public static SubLObject basic_subloop_process_p(final SubLObject basic_subloop_process) {
        return classes.subloop_instanceof_class(basic_subloop_process, BASIC_SUBLOOP_PROCESS);
    }

    public static final SubLObject basic_subloop_process_initialize_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_basic_subloop_process_method = NIL;
            SubLObject status = com.cyc.cycjava.cycl.subloop_processes.get_basic_subloop_process_status(self);
            SubLObject priority = com.cyc.cycjava.cycl.subloop_processes.get_basic_subloop_process_priority(self);
            SubLObject name = com.cyc.cycjava.cycl.subloop_processes.get_basic_subloop_process_name(self);
            try {
                try {
                    object.object_initialize_method(self);
                    name = NIL;
                    priority = ZERO_INTEGER;
                    status = $UNKNOWN;
                    sublisp_throw($sym26$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_processes.set_basic_subloop_process_status(self, status);
                            com.cyc.cycjava.cycl.subloop_processes.set_basic_subloop_process_priority(self, priority);
                            com.cyc.cycjava.cycl.subloop_processes.set_basic_subloop_process_name(self, name);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_basic_subloop_process_method = Errors.handleThrowable(ccatch_env_var, $sym26$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD);
            }
            return catch_var_for_basic_subloop_process_method;
        }
    }

    public static SubLObject basic_subloop_process_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_subloop_process_method = NIL;
        SubLObject status = get_basic_subloop_process_status(self);
        SubLObject priority = get_basic_subloop_process_priority(self);
        SubLObject name = get_basic_subloop_process_name(self);
        try {
            thread.throwStack.push($sym26$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD);
            try {
                object.object_initialize_method(self);
                name = NIL;
                priority = ZERO_INTEGER;
                status = $UNKNOWN;
                sublisp_throw($sym26$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_subloop_process_status(self, status);
                    set_basic_subloop_process_priority(self, priority);
                    set_basic_subloop_process_name(self, name);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_subloop_process_method = Errors.handleThrowable(ccatch_env_var, $sym26$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_subloop_process_method;
    }

    public static final SubLObject basic_subloop_process_print_method_alt(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject catch_var_for_basic_subloop_process_method = NIL;
            SubLObject status = com.cyc.cycjava.cycl.subloop_processes.get_basic_subloop_process_status(self);
            SubLObject name = com.cyc.cycjava.cycl.subloop_processes.get_basic_subloop_process_name(self);
            try {
                try {
                    format(stream, $str_alt34$__BASIC_SUBLOOP_PROCESS___S___S_, name, status);
                    sublisp_throw($sym33$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_processes.set_basic_subloop_process_status(self, status);
                            com.cyc.cycjava.cycl.subloop_processes.set_basic_subloop_process_name(self, name);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_basic_subloop_process_method = Errors.handleThrowable(ccatch_env_var, $sym33$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD);
            }
            return catch_var_for_basic_subloop_process_method;
        }
    }

    public static SubLObject basic_subloop_process_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_subloop_process_method = NIL;
        final SubLObject status = get_basic_subloop_process_status(self);
        final SubLObject name = get_basic_subloop_process_name(self);
        try {
            thread.throwStack.push($sym33$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD);
            try {
                format(stream, $str34$__BASIC_SUBLOOP_PROCESS___S___S_, name, status);
                sublisp_throw($sym33$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_subloop_process_status(self, status);
                    set_basic_subloop_process_name(self, name);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_subloop_process_method = Errors.handleThrowable(ccatch_env_var, $sym33$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_subloop_process_method;
    }

    public static final SubLObject basic_subloop_process_get_name_method_alt(SubLObject self) {
        {
            SubLObject name = com.cyc.cycjava.cycl.subloop_processes.get_basic_subloop_process_name(self);
            return name;
        }
    }

    public static SubLObject basic_subloop_process_get_name_method(final SubLObject self) {
        final SubLObject name = get_basic_subloop_process_name(self);
        return name;
    }

    public static final SubLObject basic_subloop_process_set_name_method_alt(SubLObject self, SubLObject new_name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_basic_subloop_process_method = NIL;
                SubLObject name = com.cyc.cycjava.cycl.subloop_processes.get_basic_subloop_process_name(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_name) || new_name.isString())) {
                                Errors.error($str_alt44$_SET_NAME__S____S_is_not_a_valid_, self, new_name);
                            }
                        }
                        name = new_name;
                        sublisp_throw($sym43$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD, new_name);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                com.cyc.cycjava.cycl.subloop_processes.set_basic_subloop_process_name(self, name);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_basic_subloop_process_method = Errors.handleThrowable(ccatch_env_var, $sym43$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD);
                }
                return catch_var_for_basic_subloop_process_method;
            }
        }
    }

    public static SubLObject basic_subloop_process_set_name_method(final SubLObject self, final SubLObject new_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_subloop_process_method = NIL;
        SubLObject name = get_basic_subloop_process_name(self);
        try {
            thread.throwStack.push($sym43$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD);
            try {
                if (((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != new_name)) && (!new_name.isString())) {
                    Errors.error($str44$_SET_NAME__S____S_is_not_a_valid_, self, new_name);
                }
                name = new_name;
                sublisp_throw($sym43$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD, new_name);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_subloop_process_name(self, name);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_subloop_process_method = Errors.handleThrowable(ccatch_env_var, $sym43$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_subloop_process_method;
    }

    public static final SubLObject basic_subloop_process_get_priority_method_alt(SubLObject self) {
        {
            SubLObject priority = com.cyc.cycjava.cycl.subloop_processes.get_basic_subloop_process_priority(self);
            return priority;
        }
    }

    public static SubLObject basic_subloop_process_get_priority_method(final SubLObject self) {
        final SubLObject priority = get_basic_subloop_process_priority(self);
        return priority;
    }

    public static final SubLObject basic_subloop_process_set_priority_method_alt(SubLObject self, SubLObject new_priority) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_basic_subloop_process_method = NIL;
                SubLObject priority = com.cyc.cycjava.cycl.subloop_processes.get_basic_subloop_process_priority(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!(new_priority.isInteger() && new_priority.numGE(ZERO_INTEGER))) {
                                Errors.error($str_alt53$_SET_PRIORITY__S____S_is_not_a_va, self, new_priority);
                            }
                        }
                        priority = new_priority;
                        sublisp_throw($sym52$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD, new_priority);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                com.cyc.cycjava.cycl.subloop_processes.set_basic_subloop_process_priority(self, priority);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_basic_subloop_process_method = Errors.handleThrowable(ccatch_env_var, $sym52$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD);
                }
                return catch_var_for_basic_subloop_process_method;
            }
        }
    }

    public static SubLObject basic_subloop_process_set_priority_method(final SubLObject self, final SubLObject new_priority) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_subloop_process_method = NIL;
        SubLObject priority = get_basic_subloop_process_priority(self);
        try {
            thread.throwStack.push($sym52$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD);
            try {
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((!new_priority.isInteger()) || (!new_priority.numGE(ZERO_INTEGER)))) {
                    Errors.error($str53$_SET_PRIORITY__S____S_is_not_a_va, self, new_priority);
                }
                priority = new_priority;
                sublisp_throw($sym52$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD, new_priority);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_subloop_process_priority(self, priority);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_subloop_process_method = Errors.handleThrowable(ccatch_env_var, $sym52$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_subloop_process_method;
    }

    public static final SubLObject basic_subloop_process_get_status_method_alt(SubLObject self) {
        {
            SubLObject status = com.cyc.cycjava.cycl.subloop_processes.get_basic_subloop_process_status(self);
            return status;
        }
    }

    public static SubLObject basic_subloop_process_get_status_method(final SubLObject self) {
        final SubLObject status = get_basic_subloop_process_status(self);
        return status;
    }

    public static final SubLObject basic_subloop_process_run_method_alt(SubLObject self) {
        {
            SubLObject result = $ERROR;
            try {
                com.cyc.cycjava.cycl.subloop_processes.set_basic_subloop_process_status(self, $ACTIVE);
                result = methods.funcall_instance_method_with_0_args(self, RUN_INTERNAL);
                if (((result == $TERMINATED) || (result == $KILLED)) || (result == $ERROR)) {
                    com.cyc.cycjava.cycl.subloop_processes.set_basic_subloop_process_status(self, $DEAD);
                } else {
                    com.cyc.cycjava.cycl.subloop_processes.set_basic_subloop_process_status(self, $SUSPENDED);
                }
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        com.cyc.cycjava.cycl.subloop_processes.set_basic_subloop_process_status(self, $ERROR);
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            return result;
        }
    }

    public static SubLObject basic_subloop_process_run_method(final SubLObject self) {
        SubLObject result = $ERROR;
        try {
            set_basic_subloop_process_status(self, $ACTIVE);
            result = methods.funcall_instance_method_with_0_args(self, RUN_INTERNAL);
            if (((result == $TERMINATED) || (result == $KILLED)) || (result == $ERROR)) {
                set_basic_subloop_process_status(self, $DEAD);
            } else {
                set_basic_subloop_process_status(self, $SUSPENDED);
            }
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                set_basic_subloop_process_status(self, $ERROR);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return result;
    }

    public static final SubLObject basic_subloop_process_run_internal_method_alt(SubLObject self) {
        return NIL;
    }

    public static SubLObject basic_subloop_process_run_internal_method(final SubLObject self) {
        return NIL;
    }

    public static final SubLObject basic_subloop_process_suspend_method_alt(SubLObject self) {
        {
            SubLObject status = com.cyc.cycjava.cycl.subloop_processes.get_basic_subloop_process_status(self);
            SubLObject pcase_var = status;
            if (pcase_var.eql($DEAD)) {
                return status;
            }
            com.cyc.cycjava.cycl.subloop_processes.set_basic_subloop_process_status(self, $SUSPENDED);
            {
                SubLObject owner = com.cyc.cycjava.cycl.subloop_processes.get_basic_subloop_process_owner(self);
                if (NIL != owner) {
                    subloop_queues.basic_doubly_linked_queue_remove_method(owner, self);
                }
            }
            return NIL;
        }
    }

    public static SubLObject basic_subloop_process_suspend_method(final SubLObject self) {
        final SubLObject pcase_var;
        final SubLObject status = pcase_var = get_basic_subloop_process_status(self);
        if (pcase_var.eql($DEAD)) {
            return status;
        }
        set_basic_subloop_process_status(self, $SUSPENDED);
        final SubLObject owner = get_basic_subloop_process_owner(self);
        if (NIL != owner) {
            subloop_queues.basic_doubly_linked_queue_remove_method(owner, self);
        }
        return NIL;
    }

    public static final SubLObject basic_subloop_process_kill_method_alt(SubLObject self) {
        com.cyc.cycjava.cycl.subloop_processes.set_basic_subloop_process_status(self, $KILLED);
        return NIL;
    }

    public static SubLObject basic_subloop_process_kill_method(final SubLObject self) {
        set_basic_subloop_process_status(self, $KILLED);
        return NIL;
    }

    public static final SubLObject basic_subloop_process_get_owner_method_alt(SubLObject self) {
        {
            SubLObject owner = com.cyc.cycjava.cycl.subloop_processes.get_basic_subloop_process_owner(self);
            return owner;
        }
    }

    public static SubLObject basic_subloop_process_get_owner_method(final SubLObject self) {
        final SubLObject owner = get_basic_subloop_process_owner(self);
        return owner;
    }

    public static final SubLObject basic_subloop_process_set_owner_method_alt(SubLObject self, SubLObject new_scheduler) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_basic_subloop_process_method = NIL;
                SubLObject owner = com.cyc.cycjava.cycl.subloop_processes.get_basic_subloop_process_owner(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_scheduler) || (NIL != com.cyc.cycjava.cycl.subloop_processes.multi_task_scheduler_p(new_scheduler)))) {
                                Errors.error($str_alt85$_SET_OWNER__S____S_is_not_an_inst, self, new_scheduler);
                            }
                        }
                        owner = new_scheduler;
                        sublisp_throw($sym84$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD, new_scheduler);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                com.cyc.cycjava.cycl.subloop_processes.set_basic_subloop_process_owner(self, owner);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_basic_subloop_process_method = Errors.handleThrowable(ccatch_env_var, $sym84$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD);
                }
                return catch_var_for_basic_subloop_process_method;
            }
        }
    }

    public static SubLObject basic_subloop_process_set_owner_method(final SubLObject self, final SubLObject new_scheduler) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_subloop_process_method = NIL;
        SubLObject owner = get_basic_subloop_process_owner(self);
        try {
            thread.throwStack.push($sym84$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD);
            try {
                if (((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != new_scheduler)) && (NIL == multi_task_scheduler_p(new_scheduler))) {
                    Errors.error($str85$_SET_OWNER__S____S_is_not_an_inst, self, new_scheduler);
                }
                owner = new_scheduler;
                sublisp_throw($sym84$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD, new_scheduler);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_subloop_process_owner(self, owner);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_subloop_process_method = Errors.handleThrowable(ccatch_env_var, $sym84$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_subloop_process_method;
    }

    public static final SubLObject basic_subloop_process_nothing_to_doP_method_alt(SubLObject self) {
        return NIL;
    }

    public static SubLObject basic_subloop_process_nothing_to_doP_method(final SubLObject self) {
        return NIL;
    }

    public static final SubLObject basic_subloop_process_enqueue_notify_method_alt(SubLObject self, SubLObject queue) {
        return NIL;
    }

    public static SubLObject basic_subloop_process_enqueue_notify_method(final SubLObject self, final SubLObject queue) {
        return NIL;
    }

    public static final SubLObject basic_subloop_process_dequeue_notify_method_alt(SubLObject self, SubLObject queue) {
        {
            SubLObject status = com.cyc.cycjava.cycl.subloop_processes.get_basic_subloop_process_status(self);
            if (status == $DEAD) {
                return NIL;
            }
            {
                SubLObject result = com.cyc.cycjava.cycl.subloop_processes.basic_subloop_process_run_method(self);
                if (((result == $TERMINATED) || (result == $KILLED)) || (result == $ERROR)) {
                    com.cyc.cycjava.cycl.subloop_processes.basic_subloop_process_kill_method(self);
                }
            }
            return NIL;
        }
    }

    public static SubLObject basic_subloop_process_dequeue_notify_method(final SubLObject self, final SubLObject queue) {
        final SubLObject status = get_basic_subloop_process_status(self);
        if (status == $DEAD) {
            return NIL;
        }
        final SubLObject result = basic_subloop_process_run_method(self);
        if (((result == $TERMINATED) || (result == $KILLED)) || (result == $ERROR)) {
            basic_subloop_process_kill_method(self);
        }
        return NIL;
    }

    public static final SubLObject basic_subloop_process_remove_notify_method_alt(SubLObject self, SubLObject queue) {
        com.cyc.cycjava.cycl.subloop_processes.basic_subloop_process_kill_method(self);
        return NIL;
    }

    public static SubLObject basic_subloop_process_remove_notify_method(final SubLObject self, final SubLObject queue) {
        basic_subloop_process_kill_method(self);
        return NIL;
    }

    public static final SubLObject multi_task_scheduler_p_alt(SubLObject multi_task_scheduler) {
        return interfaces.subloop_instanceof_interface(multi_task_scheduler, MULTI_TASK_SCHEDULER);
    }

    public static SubLObject multi_task_scheduler_p(final SubLObject multi_task_scheduler) {
        return interfaces.subloop_instanceof_interface(multi_task_scheduler, MULTI_TASK_SCHEDULER);
    }

    public static final SubLObject get_basic_multi_task_scheduler_process_queue_alt(SubLObject basic_multi_task_scheduler) {
        return classes.subloop_get_access_protected_instance_slot(basic_multi_task_scheduler, TWO_INTEGER, PROCESS_QUEUE);
    }

    public static SubLObject get_basic_multi_task_scheduler_process_queue(final SubLObject basic_multi_task_scheduler) {
        return classes.subloop_get_access_protected_instance_slot(basic_multi_task_scheduler, TWO_INTEGER, PROCESS_QUEUE);
    }

    public static final SubLObject set_basic_multi_task_scheduler_process_queue_alt(SubLObject basic_multi_task_scheduler, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_multi_task_scheduler, value, TWO_INTEGER, PROCESS_QUEUE);
    }

    public static SubLObject set_basic_multi_task_scheduler_process_queue(final SubLObject basic_multi_task_scheduler, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_multi_task_scheduler, value, TWO_INTEGER, PROCESS_QUEUE);
    }

    public static final SubLObject get_basic_multi_task_scheduler_transfer_queue_alt(SubLObject basic_multi_task_scheduler) {
        return classes.subloop_get_access_protected_instance_slot(basic_multi_task_scheduler, ONE_INTEGER, TRANSFER_QUEUE);
    }

    public static SubLObject get_basic_multi_task_scheduler_transfer_queue(final SubLObject basic_multi_task_scheduler) {
        return classes.subloop_get_access_protected_instance_slot(basic_multi_task_scheduler, ONE_INTEGER, TRANSFER_QUEUE);
    }

    public static final SubLObject set_basic_multi_task_scheduler_transfer_queue_alt(SubLObject basic_multi_task_scheduler, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_multi_task_scheduler, value, ONE_INTEGER, TRANSFER_QUEUE);
    }

    public static SubLObject set_basic_multi_task_scheduler_transfer_queue(final SubLObject basic_multi_task_scheduler, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_multi_task_scheduler, value, ONE_INTEGER, TRANSFER_QUEUE);
    }

    public static final SubLObject get_basic_multi_task_scheduler_trace_p_alt(SubLObject basic_multi_task_scheduler) {
        {
            SubLObject v_class = subloop_structures.instance_class(basic_multi_task_scheduler);
            SubLObject slot = slots.slot_assoc(TRACE_P, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, basic_multi_task_scheduler, slot);
        }
        return classes.ldb_test($int$4098, subloop_structures.instance_boolean_slots(basic_multi_task_scheduler));
    }

    public static SubLObject get_basic_multi_task_scheduler_trace_p(final SubLObject basic_multi_task_scheduler) {
        final SubLObject v_class = subloop_structures.instance_class(basic_multi_task_scheduler);
        final SubLObject slot = slots.slot_assoc(TRACE_P, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
        instances.instances_access_check_instance_slot(v_class, basic_multi_task_scheduler, slot);
        return classes.ldb_test($int$4098, subloop_structures.instance_boolean_slots(basic_multi_task_scheduler));
    }

    public static final SubLObject set_basic_multi_task_scheduler_trace_p_alt(SubLObject basic_multi_task_scheduler, SubLObject value) {
        {
            SubLObject v_class = subloop_structures.instance_class(basic_multi_task_scheduler);
            SubLObject slot = slots.slot_assoc(TRACE_P, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, basic_multi_task_scheduler, slot);
        }
        subloop_structures._csetf_instance_boolean_slots(basic_multi_task_scheduler, bytes.dpb(NIL != value ? ((SubLObject) (ONE_INTEGER)) : ZERO_INTEGER, $int$4098, subloop_structures.instance_boolean_slots(basic_multi_task_scheduler)));
        return value;
    }

    public static SubLObject set_basic_multi_task_scheduler_trace_p(final SubLObject basic_multi_task_scheduler, final SubLObject value) {
        final SubLObject v_class = subloop_structures.instance_class(basic_multi_task_scheduler);
        final SubLObject slot = slots.slot_assoc(TRACE_P, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
        instances.instances_access_check_instance_slot(v_class, basic_multi_task_scheduler, slot);
        subloop_structures._csetf_instance_boolean_slots(basic_multi_task_scheduler, bytes.dpb(NIL != value ? ONE_INTEGER : ZERO_INTEGER, $int$4098, subloop_structures.instance_boolean_slots(basic_multi_task_scheduler)));
        return value;
    }

    public static final SubLObject get_basic_multi_task_scheduler_halted_p_alt(SubLObject basic_multi_task_scheduler) {
        {
            SubLObject v_class = subloop_structures.instance_class(basic_multi_task_scheduler);
            SubLObject slot = slots.slot_assoc(HALTED_P, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, basic_multi_task_scheduler, slot);
        }
        return classes.ldb_test($int$4097, subloop_structures.instance_boolean_slots(basic_multi_task_scheduler));
    }

    public static SubLObject get_basic_multi_task_scheduler_halted_p(final SubLObject basic_multi_task_scheduler) {
        final SubLObject v_class = subloop_structures.instance_class(basic_multi_task_scheduler);
        final SubLObject slot = slots.slot_assoc(HALTED_P, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
        instances.instances_access_check_instance_slot(v_class, basic_multi_task_scheduler, slot);
        return classes.ldb_test($int$4097, subloop_structures.instance_boolean_slots(basic_multi_task_scheduler));
    }

    public static final SubLObject set_basic_multi_task_scheduler_halted_p_alt(SubLObject basic_multi_task_scheduler, SubLObject value) {
        {
            SubLObject v_class = subloop_structures.instance_class(basic_multi_task_scheduler);
            SubLObject slot = slots.slot_assoc(HALTED_P, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, basic_multi_task_scheduler, slot);
        }
        subloop_structures._csetf_instance_boolean_slots(basic_multi_task_scheduler, bytes.dpb(NIL != value ? ((SubLObject) (ONE_INTEGER)) : ZERO_INTEGER, $int$4097, subloop_structures.instance_boolean_slots(basic_multi_task_scheduler)));
        return value;
    }

    public static SubLObject set_basic_multi_task_scheduler_halted_p(final SubLObject basic_multi_task_scheduler, final SubLObject value) {
        final SubLObject v_class = subloop_structures.instance_class(basic_multi_task_scheduler);
        final SubLObject slot = slots.slot_assoc(HALTED_P, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
        instances.instances_access_check_instance_slot(v_class, basic_multi_task_scheduler, slot);
        subloop_structures._csetf_instance_boolean_slots(basic_multi_task_scheduler, bytes.dpb(NIL != value ? ONE_INTEGER : ZERO_INTEGER, $int$4097, subloop_structures.instance_boolean_slots(basic_multi_task_scheduler)));
        return value;
    }

    public static final SubLObject subloop_reserved_initialize_basic_multi_task_scheduler_class_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_basic_multi_task_scheduler_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_basic_multi_task_scheduler_instance_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_MULTI_TASK_SCHEDULER, HALTED_P, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_MULTI_TASK_SCHEDULER, TRACE_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_MULTI_TASK_SCHEDULER, TRANSFER_QUEUE, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_MULTI_TASK_SCHEDULER, PROCESS_QUEUE, NIL);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_basic_multi_task_scheduler_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_MULTI_TASK_SCHEDULER, HALTED_P, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_MULTI_TASK_SCHEDULER, TRACE_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_MULTI_TASK_SCHEDULER, TRANSFER_QUEUE, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_MULTI_TASK_SCHEDULER, PROCESS_QUEUE, NIL);
        return NIL;
    }

    public static final SubLObject basic_multi_task_scheduler_p_alt(SubLObject basic_multi_task_scheduler) {
        return classes.subloop_instanceof_class(basic_multi_task_scheduler, BASIC_MULTI_TASK_SCHEDULER);
    }

    public static SubLObject basic_multi_task_scheduler_p(final SubLObject basic_multi_task_scheduler) {
        return classes.subloop_instanceof_class(basic_multi_task_scheduler, BASIC_MULTI_TASK_SCHEDULER);
    }

    public static final SubLObject basic_multi_task_scheduler_initialize_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_basic_multi_task_scheduler_method = NIL;
            SubLObject process_queue = com.cyc.cycjava.cycl.subloop_processes.get_basic_multi_task_scheduler_process_queue(self);
            SubLObject transfer_queue = com.cyc.cycjava.cycl.subloop_processes.get_basic_multi_task_scheduler_transfer_queue(self);
            SubLObject trace_p = com.cyc.cycjava.cycl.subloop_processes.get_basic_multi_task_scheduler_trace_p(self);
            SubLObject halted_p = com.cyc.cycjava.cycl.subloop_processes.get_basic_multi_task_scheduler_halted_p(self);
            try {
                try {
                    object.object_initialize_method(self);
                    transfer_queue = object.new_class_instance(BASIC_DOUBLY_LINKED_QUEUE);
                    subloop_queues.basic_doubly_linked_queue_set_passive_method(transfer_queue, T);
                    process_queue = object.new_class_instance(BASIC_DOUBLY_LINKED_QUEUE);
                    halted_p = T;
                    trace_p = NIL;
                    sublisp_throw($sym113$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_processes.set_basic_multi_task_scheduler_process_queue(self, process_queue);
                            com.cyc.cycjava.cycl.subloop_processes.set_basic_multi_task_scheduler_transfer_queue(self, transfer_queue);
                            com.cyc.cycjava.cycl.subloop_processes.set_basic_multi_task_scheduler_trace_p(self, trace_p);
                            com.cyc.cycjava.cycl.subloop_processes.set_basic_multi_task_scheduler_halted_p(self, halted_p);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_basic_multi_task_scheduler_method = Errors.handleThrowable(ccatch_env_var, $sym113$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD);
            }
            return catch_var_for_basic_multi_task_scheduler_method;
        }
    }

    public static SubLObject basic_multi_task_scheduler_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_multi_task_scheduler_method = NIL;
        SubLObject process_queue = get_basic_multi_task_scheduler_process_queue(self);
        SubLObject transfer_queue = get_basic_multi_task_scheduler_transfer_queue(self);
        SubLObject trace_p = get_basic_multi_task_scheduler_trace_p(self);
        SubLObject halted_p = get_basic_multi_task_scheduler_halted_p(self);
        try {
            thread.throwStack.push($sym113$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD);
            try {
                object.object_initialize_method(self);
                transfer_queue = object.new_class_instance(BASIC_DOUBLY_LINKED_QUEUE);
                subloop_queues.basic_doubly_linked_queue_set_passive_method(transfer_queue, T);
                process_queue = object.new_class_instance(BASIC_DOUBLY_LINKED_QUEUE);
                halted_p = T;
                trace_p = NIL;
                sublisp_throw($sym113$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_multi_task_scheduler_process_queue(self, process_queue);
                    set_basic_multi_task_scheduler_transfer_queue(self, transfer_queue);
                    set_basic_multi_task_scheduler_trace_p(self, trace_p);
                    set_basic_multi_task_scheduler_halted_p(self, halted_p);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_multi_task_scheduler_method = Errors.handleThrowable(ccatch_env_var, $sym113$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_multi_task_scheduler_method;
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(makeKeyword("UNKNOWN"), makeKeyword("ACTIVE"), makeKeyword("SUSPENDED"), $DEAD);

    static private final SubLString $str_alt2$_S___S_is_not_a_member_of_the__S_ = makeString("~S: ~S is not a member of the ~S enumeration.");

    static private final SubLString $str_alt4$_S___S_is_not_a_valid_encoding_of = makeString("~S: ~S is not a valid encoding of the ~S enumeration.");

    public static final SubLObject basic_multi_task_scheduler_halt_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_basic_multi_task_scheduler_method = NIL;
            SubLObject halted_p = com.cyc.cycjava.cycl.subloop_processes.get_basic_multi_task_scheduler_halted_p(self);
            try {
                try {
                    halted_p = T;
                    sublisp_throw($sym118$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD, T);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_processes.set_basic_multi_task_scheduler_halted_p(self, halted_p);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_basic_multi_task_scheduler_method = Errors.handleThrowable(ccatch_env_var, $sym118$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD);
            }
            return catch_var_for_basic_multi_task_scheduler_method;
        }
    }

    public static SubLObject basic_multi_task_scheduler_halt_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_multi_task_scheduler_method = NIL;
        SubLObject halted_p = get_basic_multi_task_scheduler_halted_p(self);
        try {
            thread.throwStack.push($sym118$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD);
            try {
                halted_p = T;
                sublisp_throw($sym118$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD, T);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_multi_task_scheduler_halted_p(self, halted_p);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_multi_task_scheduler_method = Errors.handleThrowable(ccatch_env_var, $sym118$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_multi_task_scheduler_method;
    }

    static private final SubLString $str_alt6$_S___S_was_expected_to_be_a_membe = makeString("~S: ~S was expected to be a member of the enumeration ~S.");

    static private final SubLList $list_alt9 = list(new SubLObject[]{ list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-NAME"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-NAME"), list(makeSymbol("NEW-NAME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PRIORITY"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PRIORITY"), list(makeSymbol("NEW-PRIORITY")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-STATUS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RUN"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RUN-INTERNAL"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SUSPEND"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("KILL"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-OWNER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-OWNER"), list(makeSymbol("NEW-SCHEDULER")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NOTHING-TO-DO?"), NIL, makeKeyword("PUBLIC")) });

    public static final SubLObject basic_multi_task_scheduler_start_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_basic_multi_task_scheduler_method = NIL;
            SubLObject halted_p = com.cyc.cycjava.cycl.subloop_processes.get_basic_multi_task_scheduler_halted_p(self);
            try {
                try {
                    halted_p = NIL;
                    com.cyc.cycjava.cycl.subloop_processes.basic_multi_task_scheduler_run_method(self, UNPROVIDED);
                    sublisp_throw($sym122$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD, T);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_processes.set_basic_multi_task_scheduler_halted_p(self, halted_p);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_basic_multi_task_scheduler_method = Errors.handleThrowable(ccatch_env_var, $sym122$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD);
            }
            return catch_var_for_basic_multi_task_scheduler_method;
        }
    }

    public static SubLObject basic_multi_task_scheduler_start_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_multi_task_scheduler_method = NIL;
        SubLObject halted_p = get_basic_multi_task_scheduler_halted_p(self);
        try {
            thread.throwStack.push($sym122$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD);
            try {
                halted_p = NIL;
                basic_multi_task_scheduler_run_method(self, UNPROVIDED);
                sublisp_throw($sym122$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD, T);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_multi_task_scheduler_halted_p(self, halted_p);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_multi_task_scheduler_method = Errors.handleThrowable(ccatch_env_var, $sym122$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_multi_task_scheduler_method;
    }

    static private final SubLList $list_alt12 = list(makeSymbol("SUBLOOP-PROCESS"), makeSymbol("QUEUE-ELEMENT-INTERFACE"));

    static private final SubLList $list_alt13 = list(new SubLObject[]{ list(makeSymbol("NAME"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("PRIORITY"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("STATUS"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("OWNER"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-NAME"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-NAME"), list(makeSymbol("NEW-NAME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PRIORITY"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PRIORITY"), list(makeSymbol("NEW-PRIORITY")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-STATUS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RUN"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RUN-INTERNAL"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SUSPEND"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("KILL"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-OWNER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-OWNER"), list(makeSymbol("NEW-SCHEDULER")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NOTHING-TO-DO?"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ENQUEUE-NOTIFY"), list(makeSymbol("QUEUE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEQUEUE-NOTIFY"), list(makeSymbol("QUEUE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-NOTIFY"), list(makeSymbol("QUEUE")), makeKeyword("PUBLIC")) });

    public static final SubLObject basic_multi_task_scheduler_add_task_method_alt(SubLObject self, SubLObject subloop_process) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_basic_multi_task_scheduler_method = NIL;
                SubLObject process_queue = com.cyc.cycjava.cycl.subloop_processes.get_basic_multi_task_scheduler_process_queue(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == com.cyc.cycjava.cycl.subloop_processes.subloop_process_p(subloop_process)) {
                                Errors.error($str_alt128$_ADD_TASK__S____S_is_not_a_SubLOO, self, subloop_process);
                            }
                        }
                        subloop_queues.basic_doubly_linked_queue_enqueue_method(process_queue, subloop_process);
                        sublisp_throw($sym127$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD, subloop_process);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                com.cyc.cycjava.cycl.subloop_processes.set_basic_multi_task_scheduler_process_queue(self, process_queue);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_basic_multi_task_scheduler_method = Errors.handleThrowable(ccatch_env_var, $sym127$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD);
                }
                return catch_var_for_basic_multi_task_scheduler_method;
            }
        }
    }

    public static SubLObject basic_multi_task_scheduler_add_task_method(final SubLObject self, final SubLObject subloop_process) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_multi_task_scheduler_method = NIL;
        final SubLObject process_queue = get_basic_multi_task_scheduler_process_queue(self);
        try {
            thread.throwStack.push($sym127$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD);
            try {
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subloop_process_p(subloop_process))) {
                    Errors.error($str128$_ADD_TASK__S____S_is_not_a_SubLOO, self, subloop_process);
                }
                subloop_queues.basic_doubly_linked_queue_enqueue_method(process_queue, subloop_process);
                sublisp_throw($sym127$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD, subloop_process);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_multi_task_scheduler_process_queue(self, process_queue);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_multi_task_scheduler_method = Errors.handleThrowable(ccatch_env_var, $sym127$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_multi_task_scheduler_method;
    }

    static private final SubLList $list_alt24 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt25 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("NAME"), NIL), list(makeSymbol("CSETQ"), makeSymbol("PRIORITY"), ZERO_INTEGER), list(makeSymbol("CSETQ"), makeSymbol("STATUS"), makeKeyword("UNKNOWN")), list(RET, makeSymbol("SELF")));

    public static final SubLObject basic_multi_task_scheduler_kill_task_method_alt(SubLObject self, SubLObject subloop_process) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject process_queue = com.cyc.cycjava.cycl.subloop_processes.get_basic_multi_task_scheduler_process_queue(self);
                SubLObject transfer_queue = com.cyc.cycjava.cycl.subloop_processes.get_basic_multi_task_scheduler_transfer_queue(self);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == com.cyc.cycjava.cycl.subloop_processes.subloop_process_p(subloop_process)) {
                        Errors.error($str_alt132$_KILL_TASK__S____S_is_not_a_SubLO, self, subloop_process);
                    }
                }
                if (NIL != subloop_queues.basic_doubly_linked_queue_enqueued_p_method(process_queue, subloop_process)) {
                    subloop_queues.basic_doubly_linked_queue_remove_method(process_queue, subloop_process);
                    return subloop_process;
                }
                subloop_queues.basic_doubly_linked_queue_remove_method(transfer_queue, subloop_process);
                return NIL;
            }
        }
    }

    public static SubLObject basic_multi_task_scheduler_kill_task_method(final SubLObject self, final SubLObject subloop_process) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject process_queue = get_basic_multi_task_scheduler_process_queue(self);
        final SubLObject transfer_queue = get_basic_multi_task_scheduler_transfer_queue(self);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subloop_process_p(subloop_process))) {
            Errors.error($str132$_KILL_TASK__S____S_is_not_a_SubLO, self, subloop_process);
        }
        if (NIL != subloop_queues.basic_doubly_linked_queue_enqueued_p_method(process_queue, subloop_process)) {
            subloop_queues.basic_doubly_linked_queue_remove_method(process_queue, subloop_process);
            return subloop_process;
        }
        subloop_queues.basic_doubly_linked_queue_remove_method(transfer_queue, subloop_process);
        return NIL;
    }

    static private final SubLList $list_alt30 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt31 = list(makeSymbol("STREAM"), makeSymbol("DEPTH"));

    static private final SubLList $list_alt32 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("#<BASIC-SUBLOOP-PROCESS: ~S, ~S>"), makeSymbol("NAME"), makeSymbol("STATUS")), list(RET, makeSymbol("SELF")));

    static private final SubLString $str_alt34$__BASIC_SUBLOOP_PROCESS___S___S_ = makeString("#<BASIC-SUBLOOP-PROCESS: ~S, ~S>");

    public static final SubLObject basic_multi_task_scheduler_kill_task_by_name_method_alt(SubLObject self, SubLObject subloop_process_name) {
        {
            SubLObject process_queue = com.cyc.cycjava.cycl.subloop_processes.get_basic_multi_task_scheduler_process_queue(self);
            SubLObject transfer_queue = com.cyc.cycjava.cycl.subloop_processes.get_basic_multi_task_scheduler_transfer_queue(self);
            SubLObject key = methods.resolve_method(GET_NAME, BASIC_SUBLOOP_PROCESS);
            SubLObject task = subloop_queues.basic_doubly_linked_queue_find_method(process_queue, subloop_process_name, symbol_function(EQUAL), key);
            if (NIL != task) {
                subloop_queues.basic_doubly_linked_queue_remove_method(process_queue, subloop_process_name);
                return task;
            }
            task = subloop_queues.basic_doubly_linked_queue_find_method(transfer_queue, subloop_process_name, symbol_function(EQUAL), key);
            if (NIL != task) {
                subloop_queues.basic_doubly_linked_queue_remove_method(transfer_queue, task);
                return task;
            }
            return NIL;
        }
    }

    public static SubLObject basic_multi_task_scheduler_kill_task_by_name_method(final SubLObject self, final SubLObject subloop_process_name) {
        final SubLObject process_queue = get_basic_multi_task_scheduler_process_queue(self);
        final SubLObject transfer_queue = get_basic_multi_task_scheduler_transfer_queue(self);
        final SubLObject key = methods.resolve_method(GET_NAME, BASIC_SUBLOOP_PROCESS);
        SubLObject task = subloop_queues.basic_doubly_linked_queue_find_method(process_queue, subloop_process_name, symbol_function(EQUAL), key);
        if (NIL != task) {
            subloop_queues.basic_doubly_linked_queue_remove_method(process_queue, subloop_process_name);
            return task;
        }
        task = subloop_queues.basic_doubly_linked_queue_find_method(transfer_queue, subloop_process_name, symbol_function(EQUAL), key);
        if (NIL != task) {
            subloop_queues.basic_doubly_linked_queue_remove_method(transfer_queue, task);
            return task;
        }
        return NIL;
    }

    static private final SubLList $list_alt37 = list(makeKeyword("READ-ONLY"), makeKeyword("PUBLIC"));

    static private final SubLList $list_alt38 = list(list(RET, makeSymbol("NAME")));

    static private final SubLList $list_alt41 = list(makeSymbol("NEW-NAME"));

    static private final SubLList $list_alt42 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-NAME")), list(makeSymbol("STRINGP"), makeSymbol("NEW-NAME"))), makeString("(SET-NAME ~S): ~S is not a valid name.  A string or NIL was expected."), makeSymbol("SELF"), makeSymbol("NEW-NAME")), list(makeSymbol("CSETQ"), makeSymbol("NAME"), makeSymbol("NEW-NAME")), list(RET, makeSymbol("NEW-NAME")));

    public static final SubLObject basic_multi_task_scheduler_interrupt_task_method_alt(SubLObject self, SubLObject subloop_process) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject process_queue = com.cyc.cycjava.cycl.subloop_processes.get_basic_multi_task_scheduler_process_queue(self);
                SubLObject transfer_queue = com.cyc.cycjava.cycl.subloop_processes.get_basic_multi_task_scheduler_transfer_queue(self);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == com.cyc.cycjava.cycl.subloop_processes.subloop_process_p(subloop_process)) {
                        Errors.error($str_alt140$_INTERRUPT_TASK__S____S_is_not_a_, self, subloop_process);
                    }
                }
                if (NIL != subloop_queues.basic_doubly_linked_queue_enqueued_p_method(process_queue, subloop_process)) {
                    subloop_queues.basic_doubly_linked_queue_remove_method(process_queue, subloop_process);
                    subloop_queues.basic_doubly_linked_queue_enqueue_method(transfer_queue, subloop_process);
                    return subloop_process;
                }
                return NIL;
            }
        }
    }

    public static SubLObject basic_multi_task_scheduler_interrupt_task_method(final SubLObject self, final SubLObject subloop_process) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject process_queue = get_basic_multi_task_scheduler_process_queue(self);
        final SubLObject transfer_queue = get_basic_multi_task_scheduler_transfer_queue(self);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subloop_process_p(subloop_process))) {
            Errors.error($str140$_INTERRUPT_TASK__S____S_is_not_a_, self, subloop_process);
        }
        if (NIL != subloop_queues.basic_doubly_linked_queue_enqueued_p_method(process_queue, subloop_process)) {
            subloop_queues.basic_doubly_linked_queue_remove_method(process_queue, subloop_process);
            subloop_queues.basic_doubly_linked_queue_enqueue_method(transfer_queue, subloop_process);
            return subloop_process;
        }
        return NIL;
    }

    static private final SubLString $str_alt44$_SET_NAME__S____S_is_not_a_valid_ = makeString("(SET-NAME ~S): ~S is not a valid name.  A string or NIL was expected.");

    static private final SubLList $list_alt47 = list(list(RET, makeSymbol("PRIORITY")));

    static private final SubLList $list_alt50 = list(makeSymbol("NEW-PRIORITY"));

    static private final SubLList $list_alt51 = list(list(makeSymbol("MUST"), list(makeSymbol("CAND"), list(makeSymbol("INTEGERP"), makeSymbol("NEW-PRIORITY")), list(makeSymbol(">="), makeSymbol("NEW-PRIORITY"), ZERO_INTEGER)), makeString("(SET-PRIORITY ~S): ~S is not a valid priority.  A non negative integer was expected."), makeSymbol("SELF"), makeSymbol("NEW-PRIORITY")), list(makeSymbol("CSETQ"), makeSymbol("PRIORITY"), makeSymbol("NEW-PRIORITY")), list(RET, makeSymbol("NEW-PRIORITY")));

    public static final SubLObject basic_multi_task_scheduler_interrupt_task_by_name_method_alt(SubLObject self, SubLObject subloop_process_name) {
        {
            SubLObject process_queue = com.cyc.cycjava.cycl.subloop_processes.get_basic_multi_task_scheduler_process_queue(self);
            SubLObject transfer_queue = com.cyc.cycjava.cycl.subloop_processes.get_basic_multi_task_scheduler_transfer_queue(self);
            SubLObject key = methods.resolve_method(GET_NAME, BASIC_SUBLOOP_PROCESS);
            SubLObject task = subloop_queues.basic_doubly_linked_queue_find_method(process_queue, subloop_process_name, symbol_function(EQUAL), key);
            if (NIL != task) {
                subloop_queues.basic_doubly_linked_queue_remove_method(process_queue, task);
                subloop_queues.basic_doubly_linked_queue_enqueue_method(transfer_queue, task);
                return task;
            }
            return NIL;
        }
    }

    public static SubLObject basic_multi_task_scheduler_interrupt_task_by_name_method(final SubLObject self, final SubLObject subloop_process_name) {
        final SubLObject process_queue = get_basic_multi_task_scheduler_process_queue(self);
        final SubLObject transfer_queue = get_basic_multi_task_scheduler_transfer_queue(self);
        final SubLObject key = methods.resolve_method(GET_NAME, BASIC_SUBLOOP_PROCESS);
        final SubLObject task = subloop_queues.basic_doubly_linked_queue_find_method(process_queue, subloop_process_name, symbol_function(EQUAL), key);
        if (NIL != task) {
            subloop_queues.basic_doubly_linked_queue_remove_method(process_queue, task);
            subloop_queues.basic_doubly_linked_queue_enqueue_method(transfer_queue, task);
            return task;
        }
        return NIL;
    }

    static private final SubLString $str_alt53$_SET_PRIORITY__S____S_is_not_a_va = makeString("(SET-PRIORITY ~S): ~S is not a valid priority.  A non negative integer was expected.");

    public static final SubLObject basic_multi_task_scheduler_get_all_tasks_method_alt(SubLObject self) {
        {
            SubLObject process_queue = com.cyc.cycjava.cycl.subloop_processes.get_basic_multi_task_scheduler_process_queue(self);
            SubLObject transfer_queue = com.cyc.cycjava.cycl.subloop_processes.get_basic_multi_task_scheduler_transfer_queue(self);
            return nconc(subloop_queues.basic_doubly_linked_queue_get_contents_method(process_queue), subloop_queues.basic_doubly_linked_queue_get_contents_method(transfer_queue));
        }
    }

    public static SubLObject basic_multi_task_scheduler_get_all_tasks_method(final SubLObject self) {
        final SubLObject process_queue = get_basic_multi_task_scheduler_process_queue(self);
        final SubLObject transfer_queue = get_basic_multi_task_scheduler_transfer_queue(self);
        return nconc(subloop_queues.basic_doubly_linked_queue_get_contents_method(process_queue), subloop_queues.basic_doubly_linked_queue_get_contents_method(transfer_queue));
    }

    static private final SubLList $list_alt56 = list(list(RET, makeSymbol("STATUS")));

    static private final SubLList $list_alt59 = list(makeKeyword("NO-MEMBER-VARIABLES"), makeKeyword("PUBLIC"));

    static private final SubLList $list_alt60 = list(list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"), makeKeyword("ERROR"))), list(makeSymbol("CUNWIND-PROTECT"), list(makeSymbol("PROGN"), list(makeSymbol("INLINE-SET-SLOT"), list(makeSymbol("STATUS"), makeSymbol("BASIC-SUBLOOP-PROCESS")), makeSymbol("SELF"), makeKeyword("ACTIVE")), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("RUN-INTERNAL")))), list(makeSymbol("PIF"), list(makeSymbol("COR"), list(EQ, makeSymbol("RESULT"), makeKeyword("TERMINATED")), list(EQ, makeSymbol("RESULT"), makeKeyword("KILLED")), list(EQ, makeSymbol("RESULT"), makeKeyword("ERROR"))), list(makeSymbol("INLINE-SET-SLOT"), list(makeSymbol("STATUS"), makeSymbol("BASIC-SUBLOOP-PROCESS")), makeSymbol("SELF"), $DEAD), list(makeSymbol("INLINE-SET-SLOT"), list(makeSymbol("STATUS"), makeSymbol("BASIC-SUBLOOP-PROCESS")), makeSymbol("SELF"), makeKeyword("SUSPENDED")))), list(makeSymbol("INLINE-SET-SLOT"), list(makeSymbol("STATUS"), makeSymbol("BASIC-SUBLOOP-PROCESS")), makeSymbol("SELF"), makeKeyword("ERROR"))), list(RET, makeSymbol("RESULT"))));

    public static final SubLObject basic_multi_task_scheduler_kill_all_tasks_method_alt(SubLObject self) {
        {
            SubLObject all_tasks = com.cyc.cycjava.cycl.subloop_processes.basic_multi_task_scheduler_get_all_tasks_method(self);
            SubLObject cdolist_list_var = all_tasks;
            SubLObject task = NIL;
            for (task = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , task = cdolist_list_var.first()) {
                com.cyc.cycjava.cycl.subloop_processes.basic_multi_task_scheduler_kill_task_method(self, task);
            }
            return NIL;
        }
    }

    public static SubLObject basic_multi_task_scheduler_kill_all_tasks_method(final SubLObject self) {
        SubLObject cdolist_list_var;
        final SubLObject all_tasks = cdolist_list_var = basic_multi_task_scheduler_get_all_tasks_method(self);
        SubLObject task = NIL;
        task = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            basic_multi_task_scheduler_kill_task_method(self, task);
            cdolist_list_var = cdolist_list_var.rest();
            task = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject basic_multi_task_scheduler_run_method_alt(SubLObject self, SubLObject expiration_delta) {
        if (expiration_delta == UNPROVIDED) {
            expiration_delta = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!(((NIL == expiration_delta) || expiration_delta.isInteger()) || expiration_delta.numGE(ZERO_INTEGER))) {
                    Errors.error($str_alt153$_RUN__S____S_is_not_a_valid_expir, self, expiration_delta);
                }
            }
            com.cyc.cycjava.cycl.subloop_processes.set_basic_multi_task_scheduler_halted_p(self, NIL);
            {
                SubLObject transfer_queue = com.cyc.cycjava.cycl.subloop_processes.get_basic_multi_task_scheduler_transfer_queue(self);
                SubLObject process_queue = com.cyc.cycjava.cycl.subloop_processes.get_basic_multi_task_scheduler_process_queue(self);
                SubLObject current_process = NIL;
                if (NIL != expiration_delta) {
                    {
                        SubLObject start_time = get_universal_time();
                        SubLObject stop_time = add(start_time, expiration_delta);
                        com.cyc.cycjava.cycl.subloop_processes.set_basic_multi_task_scheduler_halted_p(self, numGE(stop_time, get_universal_time()));
                        while ((NIL == com.cyc.cycjava.cycl.subloop_processes.get_basic_multi_task_scheduler_halted_p(self)) && (NIL == subloop_queues.basic_doubly_linked_queue_empty_p_method(process_queue))) {
                            current_process = subloop_queues.basic_doubly_linked_queue_dequeue_method(process_queue);
                            if (NIL != com.cyc.cycjava.cycl.subloop_processes.get_basic_multi_task_scheduler_trace_p(self)) {
                                methods.funcall_instance_method_with_1_args(self, PERFORM_TRACE, current_process);
                            }
                            if (NIL == member(com.cyc.cycjava.cycl.subloop_processes.get_basic_subloop_process_status(current_process), $list_alt155, UNPROVIDED, UNPROVIDED)) {
                                subloop_queues.basic_doubly_linked_queue_enqueue_method(process_queue, current_process);
                            }
                            com.cyc.cycjava.cycl.subloop_processes.set_basic_multi_task_scheduler_halted_p(self, numGE(stop_time, get_universal_time()));
                            if (NIL != com.cyc.cycjava.cycl.subloop_processes.basic_multi_task_scheduler_nothing_to_doP_method(self)) {
                                methods.funcall_instance_method_with_0_args(self, ON_NOTHING_TO_DO);
                            }
                        } 
                    }
                } else {
                    while ((NIL == com.cyc.cycjava.cycl.subloop_processes.get_basic_multi_task_scheduler_halted_p(self)) && (NIL == subloop_queues.basic_doubly_linked_queue_empty_p_method(process_queue))) {
                        current_process = subloop_queues.basic_doubly_linked_queue_dequeue_method(process_queue);
                        if (NIL != com.cyc.cycjava.cycl.subloop_processes.get_basic_multi_task_scheduler_trace_p(self)) {
                            methods.funcall_instance_method_with_1_args(self, PERFORM_TRACE, current_process);
                        }
                        if (NIL == member(com.cyc.cycjava.cycl.subloop_processes.get_basic_subloop_process_status(current_process), $list_alt155, UNPROVIDED, UNPROVIDED)) {
                            subloop_queues.basic_doubly_linked_queue_enqueue_method(process_queue, current_process);
                        }
                        if (NIL != com.cyc.cycjava.cycl.subloop_processes.basic_multi_task_scheduler_nothing_to_doP_method(self)) {
                            methods.funcall_instance_method_with_0_args(self, ON_NOTHING_TO_DO);
                        }
                    } 
                }
            }
            return NIL;
        }
    }

    public static SubLObject basic_multi_task_scheduler_run_method(final SubLObject self, SubLObject expiration_delta) {
        if (expiration_delta == UNPROVIDED) {
            expiration_delta = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != expiration_delta)) && (!expiration_delta.isInteger())) && (!expiration_delta.numGE(ZERO_INTEGER))) {
            Errors.error($str153$_RUN__S____S_is_not_a_valid_expir, self, expiration_delta);
        }
        set_basic_multi_task_scheduler_halted_p(self, NIL);
        final SubLObject transfer_queue = get_basic_multi_task_scheduler_transfer_queue(self);
        final SubLObject process_queue = get_basic_multi_task_scheduler_process_queue(self);
        SubLObject current_process = NIL;
        if (NIL != expiration_delta) {
            final SubLObject start_time = get_universal_time();
            final SubLObject stop_time = add(start_time, expiration_delta);
            set_basic_multi_task_scheduler_halted_p(self, numGE(stop_time, get_universal_time()));
            while ((NIL == get_basic_multi_task_scheduler_halted_p(self)) && (NIL == subloop_queues.basic_doubly_linked_queue_empty_p_method(process_queue))) {
                current_process = subloop_queues.basic_doubly_linked_queue_dequeue_method(process_queue);
                if (NIL != get_basic_multi_task_scheduler_trace_p(self)) {
                    methods.funcall_instance_method_with_1_args(self, PERFORM_TRACE, current_process);
                }
                if (NIL == member(get_basic_subloop_process_status(current_process), $list155, UNPROVIDED, UNPROVIDED)) {
                    subloop_queues.basic_doubly_linked_queue_enqueue_method(process_queue, current_process);
                }
                set_basic_multi_task_scheduler_halted_p(self, numGE(stop_time, get_universal_time()));
                if (NIL != basic_multi_task_scheduler_nothing_to_doP_method(self)) {
                    methods.funcall_instance_method_with_0_args(self, ON_NOTHING_TO_DO);
                }
            } 
        } else {
            while ((NIL == get_basic_multi_task_scheduler_halted_p(self)) && (NIL == subloop_queues.basic_doubly_linked_queue_empty_p_method(process_queue))) {
                current_process = subloop_queues.basic_doubly_linked_queue_dequeue_method(process_queue);
                if (NIL != get_basic_multi_task_scheduler_trace_p(self)) {
                    methods.funcall_instance_method_with_1_args(self, PERFORM_TRACE, current_process);
                }
                if (NIL == member(get_basic_subloop_process_status(current_process), $list155, UNPROVIDED, UNPROVIDED)) {
                    subloop_queues.basic_doubly_linked_queue_enqueue_method(process_queue, current_process);
                }
                if (NIL != basic_multi_task_scheduler_nothing_to_doP_method(self)) {
                    methods.funcall_instance_method_with_0_args(self, ON_NOTHING_TO_DO);
                }
            } 
        }
        return NIL;
    }

    static private final SubLList $list_alt69 = list(makeKeyword("NO-MEMBER-VARIABLES"), makeKeyword("PROTECTED"));

    static private final SubLList $list_alt70 = list(list(RET, NIL));

    static private final SubLList $list_alt73 = list(list(makeSymbol("CLET"), list(list(makeSymbol("STATUS"), list(makeSymbol("INLINE-GET-SLOT"), list(makeSymbol("STATUS"), makeSymbol("BASIC-SUBLOOP-PROCESS")), makeSymbol("SELF")))), list(makeSymbol("PCASE"), makeSymbol("STATUS"), list($DEAD, list(RET, makeSymbol("STATUS"))))), list(makeSymbol("INLINE-SET-SLOT"), list(makeSymbol("STATUS"), makeSymbol("BASIC-SUBLOOP-PROCESS")), makeSymbol("SELF"), makeKeyword("SUSPENDED")), list(makeSymbol("CLET"), list(list(makeSymbol("OWNER"), list(makeSymbol("INLINE-GET-SLOT"), list(makeSymbol("OWNER"), makeSymbol("BASIC-SUBLOOP-PROCESS")), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("OWNER"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("REMOVE"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("OWNER"), makeSymbol("SELF")))), list(RET, NIL));

    static private final SubLList $list_alt76 = list(list(makeSymbol("INLINE-SET-SLOT"), list(makeSymbol("STATUS"), makeSymbol("BASIC-SUBLOOP-PROCESS")), makeSymbol("SELF"), makeKeyword("KILLED")), list(RET, NIL));

    static private final SubLList $list_alt79 = list(list(RET, makeSymbol("OWNER")));

    static private final SubLList $list_alt82 = list(makeSymbol("NEW-SCHEDULER"));

    static private final SubLList $list_alt83 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-SCHEDULER")), list(makeSymbol("MULTI-TASK-SCHEDULER-P"), makeSymbol("NEW-SCHEDULER"))), makeString("(SET-OWNER ~S): ~S is not an instance of MULTI-TASK-SCHEDULER."), makeSymbol("SELF"), makeSymbol("NEW-SCHEDULER")), list(makeSymbol("CSETQ"), makeSymbol("OWNER"), makeSymbol("NEW-SCHEDULER")), list(RET, makeSymbol("NEW-SCHEDULER")));

    public static final SubLObject basic_multi_task_scheduler_get_trace_mode_method_alt(SubLObject self) {
        {
            SubLObject trace_p = com.cyc.cycjava.cycl.subloop_processes.get_basic_multi_task_scheduler_trace_p(self);
            return trace_p;
        }
    }

    public static SubLObject basic_multi_task_scheduler_get_trace_mode_method(final SubLObject self) {
        final SubLObject trace_p = get_basic_multi_task_scheduler_trace_p(self);
        return trace_p;
    }

    public static final SubLObject basic_multi_task_scheduler_set_trace_mode_method_alt(SubLObject self, SubLObject new_trace_mode) {
        {
            SubLObject catch_var_for_basic_multi_task_scheduler_method = NIL;
            SubLObject trace_p = com.cyc.cycjava.cycl.subloop_processes.get_basic_multi_task_scheduler_trace_p(self);
            try {
                try {
                    trace_p = new_trace_mode;
                    sublisp_throw($sym164$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD, new_trace_mode);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_processes.set_basic_multi_task_scheduler_trace_p(self, trace_p);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_basic_multi_task_scheduler_method = Errors.handleThrowable(ccatch_env_var, $sym164$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD);
            }
            return catch_var_for_basic_multi_task_scheduler_method;
        }
    }

    public static SubLObject basic_multi_task_scheduler_set_trace_mode_method(final SubLObject self, final SubLObject new_trace_mode) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_multi_task_scheduler_method = NIL;
        SubLObject trace_p = get_basic_multi_task_scheduler_trace_p(self);
        try {
            thread.throwStack.push($sym164$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD);
            try {
                trace_p = new_trace_mode;
                sublisp_throw($sym164$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD, new_trace_mode);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_multi_task_scheduler_trace_p(self, trace_p);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_multi_task_scheduler_method = Errors.handleThrowable(ccatch_env_var, $sym164$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_multi_task_scheduler_method;
    }

    static private final SubLString $str_alt85$_SET_OWNER__S____S_is_not_an_inst = makeString("(SET-OWNER ~S): ~S is not an instance of MULTI-TASK-SCHEDULER.");

    static private final SubLList $list_alt90 = list(makeSymbol("QUEUE"));

    static private final SubLList $list_alt91 = list(list(makeSymbol("IGNORE"), makeSymbol("QUEUE")), list(RET, NIL));

    static private final SubLList $list_alt94 = list(list(makeSymbol("IGNORE"), makeSymbol("QUEUE")), list(makeSymbol("CLET"), list(list(makeSymbol("STATUS"), list(makeSymbol("INLINE-GET-SLOT"), list(makeSymbol("STATUS"), makeSymbol("BASIC-SUBLOOP-PROCESS")), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), list(EQ, makeSymbol("STATUS"), $DEAD), list(RET, NIL))), list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"), list(makeSymbol("RUN"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), list(makeSymbol("COR"), list(EQ, makeSymbol("RESULT"), makeKeyword("TERMINATED")), list(EQ, makeSymbol("RESULT"), makeKeyword("KILLED")), list(EQ, makeSymbol("RESULT"), makeKeyword("ERROR"))), list(makeSymbol("KILL"), makeSymbol("SELF")))), list(RET, NIL));

    public static final SubLObject basic_multi_task_scheduler_perform_trace_method_alt(SubLObject self, SubLObject process) {
        return NIL;
    }

    public static SubLObject basic_multi_task_scheduler_perform_trace_method(final SubLObject self, final SubLObject process) {
        return NIL;
    }

    public static final SubLObject basic_multi_task_scheduler_nothing_to_doP_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_basic_multi_task_scheduler_method = NIL;
            SubLObject process_queue = com.cyc.cycjava.cycl.subloop_processes.get_basic_multi_task_scheduler_process_queue(self);
            try {
                try {
                    {
                        SubLObject queue_contents = subloop_queues.basic_doubly_linked_queue_get_contents_method(process_queue);
                        SubLObject cdolist_list_var = queue_contents;
                        SubLObject process = NIL;
                        for (process = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , process = cdolist_list_var.first()) {
                            if (NIL == methods.funcall_instance_method_with_0_args(process, $sym87$NOTHING_TO_DO_)) {
                                sublisp_throw($sym170$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD, NIL);
                            }
                        }
                        sublisp_throw($sym170$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD, T);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_processes.set_basic_multi_task_scheduler_process_queue(self, process_queue);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_basic_multi_task_scheduler_method = Errors.handleThrowable(ccatch_env_var, $sym170$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD);
            }
            return catch_var_for_basic_multi_task_scheduler_method;
        }
    }

    public static SubLObject basic_multi_task_scheduler_nothing_to_doP_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_multi_task_scheduler_method = NIL;
        final SubLObject process_queue = get_basic_multi_task_scheduler_process_queue(self);
        try {
            thread.throwStack.push($sym170$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD);
            try {
                SubLObject cdolist_list_var;
                final SubLObject queue_contents = cdolist_list_var = subloop_queues.basic_doubly_linked_queue_get_contents_method(process_queue);
                SubLObject process = NIL;
                process = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL == methods.funcall_instance_method_with_0_args(process, $sym87$NOTHING_TO_DO_)) {
                        sublisp_throw($sym170$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD, NIL);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    process = cdolist_list_var.first();
                } 
                sublisp_throw($sym170$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD, T);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_multi_task_scheduler_process_queue(self, process_queue);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_multi_task_scheduler_method = Errors.handleThrowable(ccatch_env_var, $sym170$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_multi_task_scheduler_method;
    }

    static private final SubLList $list_alt97 = list(list(makeSymbol("IGNORE"), makeSymbol("QUEUE")), list(makeSymbol("KILL"), makeSymbol("SELF")), list(RET, NIL));

    static private final SubLList $list_alt100 = list(new SubLObject[]{ list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-TASK"), list(makeSymbol("SUBLOOP-PROCESS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("KILL-TASK"), list(makeSymbol("SUBLOOP-PROCESS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("KILL-TASK-BY-NAME"), list(makeSymbol("SUBLOOP-PROCESS-NAME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INTERRUPT-TASK"), list(makeSymbol("SUBLOOP-PROCESS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INTERRUPT-TASK-BY-NAME"), list(makeSymbol("SUBLOOP-PROCESS-NAME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ALL-TASKS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("KILL-ALL-TASKS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RUN"), list(makeSymbol("&OPTIONAL"), list(makeSymbol("EXPIRATION-DELTA"), NIL)), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TRACE-MODE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-TRACE-MODE"), list(makeSymbol("NEW-TRACE-MODE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PERFORM-TRACE"), list(makeSymbol("PROCESS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NOTHING-TO-DO?"), NIL, makeKeyword("PUBLIC")) });

    public static final SubLObject basic_multi_task_scheduler_on_nothing_to_do_method_alt(SubLObject self) {
        return NIL;
    }

    public static SubLObject basic_multi_task_scheduler_on_nothing_to_do_method(final SubLObject self) {
        return NIL;
    }

    public static SubLObject declare_subloop_processes_file() {
        declareFunction("valid_subloop_process_status_types", "VALID-SUBLOOP-PROCESS-STATUS-TYPES", 0, 0, false);
        declareFunction("subloop_process_status_type_p", "SUBLOOP-PROCESS-STATUS-TYPE-P", 1, 0, false);
        declareFunction("encode_subloop_process_status_type", "ENCODE-SUBLOOP-PROCESS-STATUS-TYPE", 1, 0, false);
        declareFunction("decode_subloop_process_status_type", "DECODE-SUBLOOP-PROCESS-STATUS-TYPE", 1, 0, false);
        declareFunction("subloop_process_status_type_less_p", "SUBLOOP-PROCESS-STATUS-TYPE-LESS-P", 2, 0, false);
        declareFunction("subloop_process_status_type_greater_p", "SUBLOOP-PROCESS-STATUS-TYPE-GREATER-P", 2, 0, false);
        declareFunction("subloop_process_p", "SUBLOOP-PROCESS-P", 1, 0, false);
        declareFunction("get_basic_subloop_process_owner", "GET-BASIC-SUBLOOP-PROCESS-OWNER", 1, 0, false);
        declareFunction("set_basic_subloop_process_owner", "SET-BASIC-SUBLOOP-PROCESS-OWNER", 2, 0, false);
        declareFunction("get_basic_subloop_process_status", "GET-BASIC-SUBLOOP-PROCESS-STATUS", 1, 0, false);
        declareFunction("set_basic_subloop_process_status", "SET-BASIC-SUBLOOP-PROCESS-STATUS", 2, 0, false);
        declareFunction("get_basic_subloop_process_priority", "GET-BASIC-SUBLOOP-PROCESS-PRIORITY", 1, 0, false);
        declareFunction("set_basic_subloop_process_priority", "SET-BASIC-SUBLOOP-PROCESS-PRIORITY", 2, 0, false);
        declareFunction("get_basic_subloop_process_name", "GET-BASIC-SUBLOOP-PROCESS-NAME", 1, 0, false);
        declareFunction("set_basic_subloop_process_name", "SET-BASIC-SUBLOOP-PROCESS-NAME", 2, 0, false);
        declareFunction("subloop_reserved_initialize_basic_subloop_process_class", "SUBLOOP-RESERVED-INITIALIZE-BASIC-SUBLOOP-PROCESS-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_basic_subloop_process_instance", "SUBLOOP-RESERVED-INITIALIZE-BASIC-SUBLOOP-PROCESS-INSTANCE", 1, 0, false);
        declareFunction("basic_subloop_process_p", "BASIC-SUBLOOP-PROCESS-P", 1, 0, false);
        declareFunction("basic_subloop_process_initialize_method", "BASIC-SUBLOOP-PROCESS-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("basic_subloop_process_print_method", "BASIC-SUBLOOP-PROCESS-PRINT-METHOD", 3, 0, false);
        declareFunction("basic_subloop_process_get_name_method", "BASIC-SUBLOOP-PROCESS-GET-NAME-METHOD", 1, 0, false);
        declareFunction("basic_subloop_process_set_name_method", "BASIC-SUBLOOP-PROCESS-SET-NAME-METHOD", 2, 0, false);
        declareFunction("basic_subloop_process_get_priority_method", "BASIC-SUBLOOP-PROCESS-GET-PRIORITY-METHOD", 1, 0, false);
        declareFunction("basic_subloop_process_set_priority_method", "BASIC-SUBLOOP-PROCESS-SET-PRIORITY-METHOD", 2, 0, false);
        declareFunction("basic_subloop_process_get_status_method", "BASIC-SUBLOOP-PROCESS-GET-STATUS-METHOD", 1, 0, false);
        declareFunction("basic_subloop_process_run_method", "BASIC-SUBLOOP-PROCESS-RUN-METHOD", 1, 0, false);
        declareFunction("basic_subloop_process_run_internal_method", "BASIC-SUBLOOP-PROCESS-RUN-INTERNAL-METHOD", 1, 0, false);
        declareFunction("basic_subloop_process_suspend_method", "BASIC-SUBLOOP-PROCESS-SUSPEND-METHOD", 1, 0, false);
        declareFunction("basic_subloop_process_kill_method", "BASIC-SUBLOOP-PROCESS-KILL-METHOD", 1, 0, false);
        declareFunction("basic_subloop_process_get_owner_method", "BASIC-SUBLOOP-PROCESS-GET-OWNER-METHOD", 1, 0, false);
        declareFunction("basic_subloop_process_set_owner_method", "BASIC-SUBLOOP-PROCESS-SET-OWNER-METHOD", 2, 0, false);
        declareFunction("basic_subloop_process_nothing_to_doP_method", "BASIC-SUBLOOP-PROCESS-NOTHING-TO-DO?-METHOD", 1, 0, false);
        declareFunction("basic_subloop_process_enqueue_notify_method", "BASIC-SUBLOOP-PROCESS-ENQUEUE-NOTIFY-METHOD", 2, 0, false);
        declareFunction("basic_subloop_process_dequeue_notify_method", "BASIC-SUBLOOP-PROCESS-DEQUEUE-NOTIFY-METHOD", 2, 0, false);
        declareFunction("basic_subloop_process_remove_notify_method", "BASIC-SUBLOOP-PROCESS-REMOVE-NOTIFY-METHOD", 2, 0, false);
        declareFunction("multi_task_scheduler_p", "MULTI-TASK-SCHEDULER-P", 1, 0, false);
        declareFunction("get_basic_multi_task_scheduler_process_queue", "GET-BASIC-MULTI-TASK-SCHEDULER-PROCESS-QUEUE", 1, 0, false);
        declareFunction("set_basic_multi_task_scheduler_process_queue", "SET-BASIC-MULTI-TASK-SCHEDULER-PROCESS-QUEUE", 2, 0, false);
        declareFunction("get_basic_multi_task_scheduler_transfer_queue", "GET-BASIC-MULTI-TASK-SCHEDULER-TRANSFER-QUEUE", 1, 0, false);
        declareFunction("set_basic_multi_task_scheduler_transfer_queue", "SET-BASIC-MULTI-TASK-SCHEDULER-TRANSFER-QUEUE", 2, 0, false);
        declareFunction("get_basic_multi_task_scheduler_trace_p", "GET-BASIC-MULTI-TASK-SCHEDULER-TRACE-P", 1, 0, false);
        declareFunction("set_basic_multi_task_scheduler_trace_p", "SET-BASIC-MULTI-TASK-SCHEDULER-TRACE-P", 2, 0, false);
        declareFunction("get_basic_multi_task_scheduler_halted_p", "GET-BASIC-MULTI-TASK-SCHEDULER-HALTED-P", 1, 0, false);
        declareFunction("set_basic_multi_task_scheduler_halted_p", "SET-BASIC-MULTI-TASK-SCHEDULER-HALTED-P", 2, 0, false);
        declareFunction("subloop_reserved_initialize_basic_multi_task_scheduler_class", "SUBLOOP-RESERVED-INITIALIZE-BASIC-MULTI-TASK-SCHEDULER-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_basic_multi_task_scheduler_instance", "SUBLOOP-RESERVED-INITIALIZE-BASIC-MULTI-TASK-SCHEDULER-INSTANCE", 1, 0, false);
        declareFunction("basic_multi_task_scheduler_p", "BASIC-MULTI-TASK-SCHEDULER-P", 1, 0, false);
        declareFunction("basic_multi_task_scheduler_initialize_method", "BASIC-MULTI-TASK-SCHEDULER-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("basic_multi_task_scheduler_halt_method", "BASIC-MULTI-TASK-SCHEDULER-HALT-METHOD", 1, 0, false);
        declareFunction("basic_multi_task_scheduler_start_method", "BASIC-MULTI-TASK-SCHEDULER-START-METHOD", 1, 0, false);
        declareFunction("basic_multi_task_scheduler_add_task_method", "BASIC-MULTI-TASK-SCHEDULER-ADD-TASK-METHOD", 2, 0, false);
        declareFunction("basic_multi_task_scheduler_kill_task_method", "BASIC-MULTI-TASK-SCHEDULER-KILL-TASK-METHOD", 2, 0, false);
        declareFunction("basic_multi_task_scheduler_kill_task_by_name_method", "BASIC-MULTI-TASK-SCHEDULER-KILL-TASK-BY-NAME-METHOD", 2, 0, false);
        declareFunction("basic_multi_task_scheduler_interrupt_task_method", "BASIC-MULTI-TASK-SCHEDULER-INTERRUPT-TASK-METHOD", 2, 0, false);
        declareFunction("basic_multi_task_scheduler_interrupt_task_by_name_method", "BASIC-MULTI-TASK-SCHEDULER-INTERRUPT-TASK-BY-NAME-METHOD", 2, 0, false);
        declareFunction("basic_multi_task_scheduler_get_all_tasks_method", "BASIC-MULTI-TASK-SCHEDULER-GET-ALL-TASKS-METHOD", 1, 0, false);
        declareFunction("basic_multi_task_scheduler_kill_all_tasks_method", "BASIC-MULTI-TASK-SCHEDULER-KILL-ALL-TASKS-METHOD", 1, 0, false);
        declareFunction("basic_multi_task_scheduler_run_method", "BASIC-MULTI-TASK-SCHEDULER-RUN-METHOD", 1, 1, false);
        declareFunction("basic_multi_task_scheduler_get_trace_mode_method", "BASIC-MULTI-TASK-SCHEDULER-GET-TRACE-MODE-METHOD", 1, 0, false);
        declareFunction("basic_multi_task_scheduler_set_trace_mode_method", "BASIC-MULTI-TASK-SCHEDULER-SET-TRACE-MODE-METHOD", 2, 0, false);
        declareFunction("basic_multi_task_scheduler_perform_trace_method", "BASIC-MULTI-TASK-SCHEDULER-PERFORM-TRACE-METHOD", 2, 0, false);
        declareFunction("basic_multi_task_scheduler_nothing_to_doP_method", "BASIC-MULTI-TASK-SCHEDULER-NOTHING-TO-DO?-METHOD", 1, 0, false);
        declareFunction("basic_multi_task_scheduler_on_nothing_to_do_method", "BASIC-MULTI-TASK-SCHEDULER-ON-NOTHING-TO-DO-METHOD", 1, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt102 = list(makeSymbol("MULTI-TASK-SCHEDULER"));

    static private final SubLList $list_alt103 = list(new SubLObject[]{ list(makeSymbol("TRANSFER-QUEUE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("PROCESS-QUEUE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("HALTED-P"), makeKeyword("BOOLEAN"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("TRACE-P"), makeKeyword("BOOLEAN"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("HALT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("START"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-TASK"), list(makeSymbol("SUBLOOP-PROCESS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("KILL-TASK"), list(makeSymbol("SUBLOOP-PROCESS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("KILL-TASK-BY-NAME"), list(makeSymbol("SUBLOOP-PROCESS-NAME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INTERRUPT-TASK"), list(makeSymbol("SUBLOOP-PROCESS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INTERRUPT-TASK-BY-NAME"), list(makeSymbol("SUBLOOP-PROCESS-NAME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ALL-TASKS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("KILL-ALL-TASKS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RUN"), list(makeSymbol("&OPTIONAL"), list(makeSymbol("EXPIRATION-DELTA"), NIL)), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TRACE-MODE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-TRACE-MODE"), list(makeSymbol("NEW-TRACE-MODE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PERFORM-TRACE"), list(makeSymbol("PROCESS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NOTHING-TO-DO?"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-NOTHING-TO-DO"), NIL, makeKeyword("PUBLIC")) });

    static private final SubLList $list_alt112 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("TRANSFER-QUEUE"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PASSIVE"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("TRANSFER-QUEUE"), T), list(makeSymbol("CSETQ"), makeSymbol("PROCESS-QUEUE"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")))), list(makeSymbol("CSETQ"), makeSymbol("HALTED-P"), T), list(makeSymbol("CSETQ"), makeSymbol("TRACE-P"), NIL), list(RET, NIL));

    static private final SubLList $list_alt117 = list(list(makeSymbol("CSETQ"), makeSymbol("HALTED-P"), T), list(RET, T));

    static private final SubLList $list_alt121 = list(list(makeSymbol("CSETQ"), makeSymbol("HALTED-P"), NIL), list(makeSymbol("RUN"), makeSymbol("SELF")), list(RET, T));

    static private final SubLList $list_alt125 = list(makeSymbol("SUBLOOP-PROCESS"));

    static private final SubLList $list_alt126 = list(list(makeSymbol("MUST"), list(makeSymbol("SUBLOOP-PROCESS-P"), makeSymbol("SUBLOOP-PROCESS")), makeString("(ADD-TASK ~S): ~S is not a SubLOOP process."), makeSymbol("SELF"), makeSymbol("SUBLOOP-PROCESS")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ENQUEUE"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("PROCESS-QUEUE"), makeSymbol("SUBLOOP-PROCESS")), list(RET, makeSymbol("SUBLOOP-PROCESS")));

    static private final SubLString $str_alt128$_ADD_TASK__S____S_is_not_a_SubLOO = makeString("(ADD-TASK ~S): ~S is not a SubLOOP process.");

    static private final SubLList $list_alt131 = list(list(makeSymbol("MUST"), list(makeSymbol("SUBLOOP-PROCESS-P"), makeSymbol("SUBLOOP-PROCESS")), makeString("(KILL-TASK ~S): ~S is not a SubLOOP process."), makeSymbol("SELF"), makeSymbol("SUBLOOP-PROCESS")), list(makeSymbol("PWHEN"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ENQUEUED-P"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("PROCESS-QUEUE"), makeSymbol("SUBLOOP-PROCESS")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("REMOVE"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("PROCESS-QUEUE"), makeSymbol("SUBLOOP-PROCESS")), list(RET, makeSymbol("SUBLOOP-PROCESS"))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("REMOVE"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("TRANSFER-QUEUE"), makeSymbol("SUBLOOP-PROCESS")), list(RET, NIL));

    static private final SubLString $str_alt132$_KILL_TASK__S____S_is_not_a_SubLO = makeString("(KILL-TASK ~S): ~S is not a SubLOOP process.");

    static private final SubLList $list_alt135 = list(makeSymbol("SUBLOOP-PROCESS-NAME"));

    static private final SubLList $list_alt136 = list(list(makeSymbol("CLET"), list(list(makeSymbol("KEY"), list(makeSymbol("RESOLVE-METHOD"), list(QUOTE, makeSymbol("GET-NAME")), list(QUOTE, makeSymbol("BASIC-SUBLOOP-PROCESS")))), list(makeSymbol("TASK"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("FIND"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("PROCESS-QUEUE"), makeSymbol("SUBLOOP-PROCESS-NAME"), list(makeSymbol("FUNCTION"), EQUAL), makeSymbol("KEY")))), list(makeSymbol("PWHEN"), makeSymbol("TASK"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("REMOVE"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("PROCESS-QUEUE"), makeSymbol("SUBLOOP-PROCESS-NAME")), list(RET, makeSymbol("TASK"))), list(makeSymbol("CSETQ"), makeSymbol("TASK"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("FIND"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("TRANSFER-QUEUE"), makeSymbol("SUBLOOP-PROCESS-NAME"), list(makeSymbol("FUNCTION"), EQUAL), makeSymbol("KEY"))), list(makeSymbol("PWHEN"), makeSymbol("TASK"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("REMOVE"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("TRANSFER-QUEUE"), makeSymbol("TASK")), list(RET, makeSymbol("TASK"))), list(RET, NIL)));

    public static SubLObject init_subloop_processes_file() {
        defconstant("*VALID-SUBLOOP-PROCESS-STATUS-TYPES*", $list0);
        return NIL;
    }

    public static SubLObject setup_subloop_processes_file() {
        enumerations.enumerations_incorporate_definition(SUBLOOP_PROCESS_STATUS_TYPE, $list0);
        interfaces.new_interface(SUBLOOP_PROCESS, NIL, NIL, $list9);
        classes.subloop_new_class(BASIC_SUBLOOP_PROCESS, OBJECT, $list12, NIL, $list13);
        classes.class_set_implements_slot_listeners(BASIC_SUBLOOP_PROCESS, NIL);
        classes.subloop_note_class_initialization_function(BASIC_SUBLOOP_PROCESS, SUBLOOP_RESERVED_INITIALIZE_BASIC_SUBLOOP_PROCESS_CLASS);
        classes.subloop_note_instance_initialization_function(BASIC_SUBLOOP_PROCESS, SUBLOOP_RESERVED_INITIALIZE_BASIC_SUBLOOP_PROCESS_INSTANCE);
        subloop_reserved_initialize_basic_subloop_process_class(BASIC_SUBLOOP_PROCESS);
        methods.methods_incorporate_instance_method(INITIALIZE, BASIC_SUBLOOP_PROCESS, $list24, NIL, $list25);
        methods.subloop_register_instance_method(BASIC_SUBLOOP_PROCESS, INITIALIZE, BASIC_SUBLOOP_PROCESS_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PRINT, BASIC_SUBLOOP_PROCESS, $list30, $list31, $list32);
        methods.subloop_register_instance_method(BASIC_SUBLOOP_PROCESS, PRINT, BASIC_SUBLOOP_PROCESS_PRINT_METHOD);
        methods.methods_incorporate_instance_method(GET_NAME, BASIC_SUBLOOP_PROCESS, $list37, NIL, $list38);
        methods.subloop_register_instance_method(BASIC_SUBLOOP_PROCESS, GET_NAME, BASIC_SUBLOOP_PROCESS_GET_NAME_METHOD);
        methods.methods_incorporate_instance_method(SET_NAME, BASIC_SUBLOOP_PROCESS, $list30, $list41, $list42);
        methods.subloop_register_instance_method(BASIC_SUBLOOP_PROCESS, SET_NAME, BASIC_SUBLOOP_PROCESS_SET_NAME_METHOD);
        methods.methods_incorporate_instance_method(GET_PRIORITY, BASIC_SUBLOOP_PROCESS, $list37, NIL, $list47);
        methods.subloop_register_instance_method(BASIC_SUBLOOP_PROCESS, GET_PRIORITY, BASIC_SUBLOOP_PROCESS_GET_PRIORITY_METHOD);
        methods.methods_incorporate_instance_method(SET_PRIORITY, BASIC_SUBLOOP_PROCESS, $list30, $list50, $list51);
        methods.subloop_register_instance_method(BASIC_SUBLOOP_PROCESS, SET_PRIORITY, BASIC_SUBLOOP_PROCESS_SET_PRIORITY_METHOD);
        methods.methods_incorporate_instance_method(GET_STATUS, BASIC_SUBLOOP_PROCESS, $list37, NIL, $list56);
        methods.subloop_register_instance_method(BASIC_SUBLOOP_PROCESS, GET_STATUS, BASIC_SUBLOOP_PROCESS_GET_STATUS_METHOD);
        methods.methods_incorporate_instance_method(RUN, BASIC_SUBLOOP_PROCESS, $list59, NIL, $list60);
        methods.subloop_register_instance_method(BASIC_SUBLOOP_PROCESS, RUN, BASIC_SUBLOOP_PROCESS_RUN_METHOD);
        methods.methods_incorporate_instance_method(RUN_INTERNAL, BASIC_SUBLOOP_PROCESS, $list69, NIL, $list70);
        methods.subloop_register_instance_method(BASIC_SUBLOOP_PROCESS, RUN_INTERNAL, BASIC_SUBLOOP_PROCESS_RUN_INTERNAL_METHOD);
        methods.methods_incorporate_instance_method(SUSPEND, BASIC_SUBLOOP_PROCESS, $list59, NIL, $list73);
        methods.subloop_register_instance_method(BASIC_SUBLOOP_PROCESS, SUSPEND, BASIC_SUBLOOP_PROCESS_SUSPEND_METHOD);
        methods.methods_incorporate_instance_method(KILL, BASIC_SUBLOOP_PROCESS, $list59, NIL, $list76);
        methods.subloop_register_instance_method(BASIC_SUBLOOP_PROCESS, KILL, BASIC_SUBLOOP_PROCESS_KILL_METHOD);
        methods.methods_incorporate_instance_method(GET_OWNER, BASIC_SUBLOOP_PROCESS, $list37, NIL, $list79);
        methods.subloop_register_instance_method(BASIC_SUBLOOP_PROCESS, GET_OWNER, BASIC_SUBLOOP_PROCESS_GET_OWNER_METHOD);
        methods.methods_incorporate_instance_method(SET_OWNER, BASIC_SUBLOOP_PROCESS, $list30, $list82, $list83);
        methods.subloop_register_instance_method(BASIC_SUBLOOP_PROCESS, SET_OWNER, BASIC_SUBLOOP_PROCESS_SET_OWNER_METHOD);
        methods.methods_incorporate_instance_method($sym87$NOTHING_TO_DO_, BASIC_SUBLOOP_PROCESS, $list30, NIL, $list70);
        methods.subloop_register_instance_method(BASIC_SUBLOOP_PROCESS, $sym87$NOTHING_TO_DO_, $sym88$BASIC_SUBLOOP_PROCESS_NOTHING_TO_DO__METHOD);
        methods.methods_incorporate_instance_method(ENQUEUE_NOTIFY, BASIC_SUBLOOP_PROCESS, $list59, $list90, $list91);
        methods.subloop_register_instance_method(BASIC_SUBLOOP_PROCESS, ENQUEUE_NOTIFY, BASIC_SUBLOOP_PROCESS_ENQUEUE_NOTIFY_METHOD);
        methods.methods_incorporate_instance_method(DEQUEUE_NOTIFY, BASIC_SUBLOOP_PROCESS, $list59, $list90, $list94);
        methods.subloop_register_instance_method(BASIC_SUBLOOP_PROCESS, DEQUEUE_NOTIFY, BASIC_SUBLOOP_PROCESS_DEQUEUE_NOTIFY_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_NOTIFY, BASIC_SUBLOOP_PROCESS, $list30, $list90, $list97);
        methods.subloop_register_instance_method(BASIC_SUBLOOP_PROCESS, REMOVE_NOTIFY, BASIC_SUBLOOP_PROCESS_REMOVE_NOTIFY_METHOD);
        interfaces.new_interface(MULTI_TASK_SCHEDULER, NIL, NIL, $list100);
        classes.subloop_new_class(BASIC_MULTI_TASK_SCHEDULER, OBJECT, $list102, NIL, $list103);
        classes.class_set_implements_slot_listeners(BASIC_MULTI_TASK_SCHEDULER, NIL);
        classes.subloop_note_class_initialization_function(BASIC_MULTI_TASK_SCHEDULER, SUBLOOP_RESERVED_INITIALIZE_BASIC_MULTI_TASK_SCHEDULER_CLASS);
        classes.subloop_note_instance_initialization_function(BASIC_MULTI_TASK_SCHEDULER, SUBLOOP_RESERVED_INITIALIZE_BASIC_MULTI_TASK_SCHEDULER_INSTANCE);
        subloop_reserved_initialize_basic_multi_task_scheduler_class(BASIC_MULTI_TASK_SCHEDULER);
        methods.methods_incorporate_instance_method(INITIALIZE, BASIC_MULTI_TASK_SCHEDULER, $list24, NIL, $list112);
        methods.subloop_register_instance_method(BASIC_MULTI_TASK_SCHEDULER, INITIALIZE, BASIC_MULTI_TASK_SCHEDULER_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(HALT, BASIC_MULTI_TASK_SCHEDULER, $list30, NIL, $list117);
        methods.subloop_register_instance_method(BASIC_MULTI_TASK_SCHEDULER, HALT, BASIC_MULTI_TASK_SCHEDULER_HALT_METHOD);
        methods.methods_incorporate_instance_method(START, BASIC_MULTI_TASK_SCHEDULER, $list30, NIL, $list121);
        methods.subloop_register_instance_method(BASIC_MULTI_TASK_SCHEDULER, START, BASIC_MULTI_TASK_SCHEDULER_START_METHOD);
        methods.methods_incorporate_instance_method(ADD_TASK, BASIC_MULTI_TASK_SCHEDULER, $list30, $list125, $list126);
        methods.subloop_register_instance_method(BASIC_MULTI_TASK_SCHEDULER, ADD_TASK, BASIC_MULTI_TASK_SCHEDULER_ADD_TASK_METHOD);
        methods.methods_incorporate_instance_method(KILL_TASK, BASIC_MULTI_TASK_SCHEDULER, $list37, $list125, $list131);
        methods.subloop_register_instance_method(BASIC_MULTI_TASK_SCHEDULER, KILL_TASK, BASIC_MULTI_TASK_SCHEDULER_KILL_TASK_METHOD);
        methods.methods_incorporate_instance_method(KILL_TASK_BY_NAME, BASIC_MULTI_TASK_SCHEDULER, $list37, $list135, $list136);
        methods.subloop_register_instance_method(BASIC_MULTI_TASK_SCHEDULER, KILL_TASK_BY_NAME, BASIC_MULTI_TASK_SCHEDULER_KILL_TASK_BY_NAME_METHOD);
        methods.methods_incorporate_instance_method(INTERRUPT_TASK, BASIC_MULTI_TASK_SCHEDULER, $list37, $list125, $list139);
        methods.subloop_register_instance_method(BASIC_MULTI_TASK_SCHEDULER, INTERRUPT_TASK, BASIC_MULTI_TASK_SCHEDULER_INTERRUPT_TASK_METHOD);
        methods.methods_incorporate_instance_method(INTERRUPT_TASK_BY_NAME, BASIC_MULTI_TASK_SCHEDULER, $list37, $list135, $list143);
        methods.subloop_register_instance_method(BASIC_MULTI_TASK_SCHEDULER, INTERRUPT_TASK_BY_NAME, BASIC_MULTI_TASK_SCHEDULER_INTERRUPT_TASK_BY_NAME_METHOD);
        methods.methods_incorporate_instance_method(GET_ALL_TASKS, BASIC_MULTI_TASK_SCHEDULER, $list37, NIL, $list146);
        methods.subloop_register_instance_method(BASIC_MULTI_TASK_SCHEDULER, GET_ALL_TASKS, BASIC_MULTI_TASK_SCHEDULER_GET_ALL_TASKS_METHOD);
        methods.methods_incorporate_instance_method(KILL_ALL_TASKS, BASIC_MULTI_TASK_SCHEDULER, $list37, NIL, $list149);
        methods.subloop_register_instance_method(BASIC_MULTI_TASK_SCHEDULER, KILL_ALL_TASKS, BASIC_MULTI_TASK_SCHEDULER_KILL_ALL_TASKS_METHOD);
        methods.methods_incorporate_instance_method(RUN, BASIC_MULTI_TASK_SCHEDULER, $list59, $list151, $list152);
        methods.subloop_register_instance_method(BASIC_MULTI_TASK_SCHEDULER, RUN, BASIC_MULTI_TASK_SCHEDULER_RUN_METHOD);
        methods.methods_incorporate_instance_method(GET_TRACE_MODE, BASIC_MULTI_TASK_SCHEDULER, $list37, NIL, $list159);
        methods.subloop_register_instance_method(BASIC_MULTI_TASK_SCHEDULER, GET_TRACE_MODE, BASIC_MULTI_TASK_SCHEDULER_GET_TRACE_MODE_METHOD);
        methods.methods_incorporate_instance_method(SET_TRACE_MODE, BASIC_MULTI_TASK_SCHEDULER, $list30, $list162, $list163);
        methods.subloop_register_instance_method(BASIC_MULTI_TASK_SCHEDULER, SET_TRACE_MODE, BASIC_MULTI_TASK_SCHEDULER_SET_TRACE_MODE_METHOD);
        methods.methods_incorporate_instance_method(PERFORM_TRACE, BASIC_MULTI_TASK_SCHEDULER, $list30, $list166, $list167);
        methods.subloop_register_instance_method(BASIC_MULTI_TASK_SCHEDULER, PERFORM_TRACE, BASIC_MULTI_TASK_SCHEDULER_PERFORM_TRACE_METHOD);
        methods.methods_incorporate_instance_method($sym87$NOTHING_TO_DO_, BASIC_MULTI_TASK_SCHEDULER, $list30, NIL, $list169);
        methods.subloop_register_instance_method(BASIC_MULTI_TASK_SCHEDULER, $sym87$NOTHING_TO_DO_, $sym171$BASIC_MULTI_TASK_SCHEDULER_NOTHING_TO_DO__METHOD);
        methods.methods_incorporate_instance_method(ON_NOTHING_TO_DO, BASIC_MULTI_TASK_SCHEDULER, $list30, NIL, $list70);
        methods.subloop_register_instance_method(BASIC_MULTI_TASK_SCHEDULER, ON_NOTHING_TO_DO, BASIC_MULTI_TASK_SCHEDULER_ON_NOTHING_TO_DO_METHOD);
        return NIL;
    }

    static private final SubLList $list_alt139 = list(list(makeSymbol("MUST"), list(makeSymbol("SUBLOOP-PROCESS-P"), makeSymbol("SUBLOOP-PROCESS")), makeString("(INTERRUPT-TASK ~S): ~S is not a SubLOOP process."), makeSymbol("SELF"), makeSymbol("SUBLOOP-PROCESS")), list(makeSymbol("PWHEN"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ENQUEUED-P"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("PROCESS-QUEUE"), makeSymbol("SUBLOOP-PROCESS")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("REMOVE"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("PROCESS-QUEUE"), makeSymbol("SUBLOOP-PROCESS")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ENQUEUE"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("TRANSFER-QUEUE"), makeSymbol("SUBLOOP-PROCESS")), list(RET, makeSymbol("SUBLOOP-PROCESS"))), list(RET, NIL));

    static private final SubLString $str_alt140$_INTERRUPT_TASK__S____S_is_not_a_ = makeString("(INTERRUPT-TASK ~S): ~S is not a SubLOOP process.");

    static private final SubLList $list_alt143 = list(list(makeSymbol("CLET"), list(list(makeSymbol("KEY"), list(makeSymbol("RESOLVE-METHOD"), list(QUOTE, makeSymbol("GET-NAME")), list(QUOTE, makeSymbol("BASIC-SUBLOOP-PROCESS")))), list(makeSymbol("TASK"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("FIND"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("PROCESS-QUEUE"), makeSymbol("SUBLOOP-PROCESS-NAME"), list(makeSymbol("FUNCTION"), EQUAL), makeSymbol("KEY")))), list(makeSymbol("PWHEN"), makeSymbol("TASK"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("REMOVE"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("PROCESS-QUEUE"), makeSymbol("TASK")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ENQUEUE"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("TRANSFER-QUEUE"), makeSymbol("TASK")), list(RET, makeSymbol("TASK"))), list(RET, NIL)));

    static private final SubLList $list_alt146 = list(list(RET, list(makeSymbol("NCONC"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-CONTENTS"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("PROCESS-QUEUE")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-CONTENTS"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("TRANSFER-QUEUE")))));

    static private final SubLList $list_alt149 = list(list(makeSymbol("CLET"), list(list(makeSymbol("ALL-TASKS"), list(makeSymbol("GET-ALL-TASKS"), makeSymbol("SELF")))), list(makeSymbol("CDOLIST"), list(makeSymbol("TASK"), makeSymbol("ALL-TASKS")), list(makeSymbol("KILL-TASK"), makeSymbol("SELF"), makeSymbol("TASK")))), list(RET, NIL));

    static private final SubLList $list_alt151 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("EXPIRATION-DELTA"), NIL));

    static private final SubLList $list_alt152 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("EXPIRATION-DELTA")), list(makeSymbol("CAND"), list(makeSymbol("INTEGERP"), makeSymbol("EXPIRATION-DELTA"))), list(makeSymbol(">="), makeSymbol("EXPIRATION-DELTA"), ZERO_INTEGER)), makeString("(RUN ~S): ~S is not a valid expiration-delta.  NIL or a non negative integer was expected."), makeSymbol("SELF"), makeSymbol("EXPIRATION-DELTA")), list(makeSymbol("INLINE-SET-SLOT"), list(makeSymbol("HALTED-P"), makeSymbol("BASIC-MULTI-TASK-SCHEDULER")), makeSymbol("SELF"), NIL), list(makeSymbol("CLET"), list(list(makeSymbol("TRANSFER-QUEUE"), list(makeSymbol("INLINE-GET-SLOT"), list(makeSymbol("TRANSFER-QUEUE"), makeSymbol("BASIC-MULTI-TASK-SCHEDULER")), makeSymbol("SELF"))), list(makeSymbol("PROCESS-QUEUE"), list(makeSymbol("INLINE-GET-SLOT"), list(makeSymbol("PROCESS-QUEUE"), makeSymbol("BASIC-MULTI-TASK-SCHEDULER")), makeSymbol("SELF"))), makeSymbol("CURRENT-PROCESS")), list(makeSymbol("IGNORE"), makeSymbol("TRANSFER-QUEUE")), list(makeSymbol("PIF"), makeSymbol("EXPIRATION-DELTA"), list(makeSymbol("CLET"), list(list(makeSymbol("START-TIME"), list(makeSymbol("GET-UNIVERSAL-TIME"))), list(makeSymbol("STOP-TIME"), list(makeSymbol("+"), makeSymbol("START-TIME"), makeSymbol("EXPIRATION-DELTA")))), list(makeSymbol("INLINE-SET-SLOT"), list(makeSymbol("HALTED-P"), makeSymbol("BASIC-MULTI-TASK-SCHEDULER")), makeSymbol("SELF"), list(makeSymbol(">="), makeSymbol("STOP-TIME"), list(makeSymbol("GET-UNIVERSAL-TIME")))), list(makeSymbol("WHILE"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("INLINE-GET-SLOT"), list(makeSymbol("HALTED-P"), makeSymbol("BASIC-MULTI-TASK-SCHEDULER")), makeSymbol("SELF"))), list(makeSymbol("CNOT"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("EMPTY-P"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("PROCESS-QUEUE")))), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-PROCESS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("DEQUEUE"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("PROCESS-QUEUE"))), list(makeSymbol("PWHEN"), list(makeSymbol("INLINE-GET-SLOT"), list(makeSymbol("TRACE-P"), makeSymbol("BASIC-MULTI-TASK-SCHEDULER")), makeSymbol("SELF")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PERFORM-TRACE")), makeSymbol("CURRENT-PROCESS"))), list(makeSymbol("PUNLESS"), list(makeSymbol("MEMBER"), list(makeSymbol("INLINE-GET-SLOT"), list(makeSymbol("STATUS"), makeSymbol("BASIC-SUBLOOP-PROCESS")), makeSymbol("CURRENT-PROCESS")), list(QUOTE, list($DEAD, makeKeyword("KILLED"), makeKeyword("TERMINATED")))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ENQUEUE"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("PROCESS-QUEUE"), makeSymbol("CURRENT-PROCESS"))), list(makeSymbol("INLINE-SET-SLOT"), list(makeSymbol("HALTED-P"), makeSymbol("BASIC-MULTI-TASK-SCHEDULER")), makeSymbol("SELF"), list(makeSymbol(">="), makeSymbol("STOP-TIME"), list(makeSymbol("GET-UNIVERSAL-TIME")))), list(makeSymbol("PWHEN"), list(makeSymbol("NOTHING-TO-DO?"), makeSymbol("SELF")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ON-NOTHING-TO-DO")))))), list(makeSymbol("WHILE"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("INLINE-GET-SLOT"), list(makeSymbol("HALTED-P"), makeSymbol("BASIC-MULTI-TASK-SCHEDULER")), makeSymbol("SELF"))), list(makeSymbol("CNOT"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("EMPTY-P"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("PROCESS-QUEUE")))), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-PROCESS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("DEQUEUE"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("PROCESS-QUEUE"))), list(makeSymbol("PWHEN"), list(makeSymbol("INLINE-GET-SLOT"), list(makeSymbol("TRACE-P"), makeSymbol("BASIC-MULTI-TASK-SCHEDULER")), makeSymbol("SELF")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PERFORM-TRACE")), makeSymbol("CURRENT-PROCESS"))), list(makeSymbol("PUNLESS"), list(makeSymbol("MEMBER"), list(makeSymbol("INLINE-GET-SLOT"), list(makeSymbol("STATUS"), makeSymbol("BASIC-SUBLOOP-PROCESS")), makeSymbol("CURRENT-PROCESS")), list(QUOTE, list($DEAD, makeKeyword("KILLED"), makeKeyword("TERMINATED")))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ENQUEUE"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("PROCESS-QUEUE"), makeSymbol("CURRENT-PROCESS"))), list(makeSymbol("PWHEN"), list(makeSymbol("NOTHING-TO-DO?"), makeSymbol("SELF")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ON-NOTHING-TO-DO"))))))), list(RET, NIL));

    static private final SubLString $str_alt153$_RUN__S____S_is_not_a_valid_expir = makeString("(RUN ~S): ~S is not a valid expiration-delta.  NIL or a non negative integer was expected.");

    static private final SubLList $list_alt155 = list($DEAD, makeKeyword("KILLED"), makeKeyword("TERMINATED"));

    @Override
    public void declareFunctions() {
        declare_subloop_processes_file();
    }

    @Override
    public void initializeVariables() {
        init_subloop_processes_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_subloop_processes_file();
    }

    static private final SubLList $list_alt159 = list(list(RET, makeSymbol("TRACE-P")));

    static {
    }

    static private final SubLList $list_alt162 = list(makeSymbol("NEW-TRACE-MODE"));

    static private final SubLList $list_alt163 = list(list(makeSymbol("CSETQ"), makeSymbol("TRACE-P"), makeSymbol("NEW-TRACE-MODE")), list(RET, makeSymbol("NEW-TRACE-MODE")));

    static private final SubLList $list_alt166 = list(makeSymbol("PROCESS"));

    static private final SubLList $list_alt167 = list(list(makeSymbol("IGNORE"), makeSymbol("PROCESS")), list(RET, NIL));

    static private final SubLList $list_alt169 = list(list(makeSymbol("CLET"), list(list(makeSymbol("QUEUE-CONTENTS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-CONTENTS"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("PROCESS-QUEUE")))), list(makeSymbol("CDOLIST"), list(makeSymbol("PROCESS"), makeSymbol("QUEUE-CONTENTS")), list(makeSymbol("PUNLESS"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PROCESS"), list(QUOTE, makeSymbol("NOTHING-TO-DO?"))), list(RET, NIL))), list(RET, T)));
}

/**
 * Total time: 566 ms
 */
