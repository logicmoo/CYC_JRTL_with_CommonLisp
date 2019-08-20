/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplacd;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.zerop;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.set_aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.last;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Semaphores;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
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
 * module:      SUBLOOP-QUEUES
 * source file: /cyc/top/cycl/subloop-queues.lisp
 * created:     2019/07/03 17:37:09
 */
public final class subloop_queues extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new subloop_queues();



    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol QUEUE_ELEMENT_INTERFACE = makeSymbol("QUEUE-ELEMENT-INTERFACE");

    static private final SubLList $list1 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ENQUEUE-NOTIFY"), list(makeSymbol("QUEUE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEQUEUE-NOTIFY"), list(makeSymbol("QUEUE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-NOTIFY"), list(makeSymbol("QUEUE")), makeKeyword("PUBLIC")));

    private static final SubLSymbol QUEUE_PRIORITIZER_INTERFACE = makeSymbol("QUEUE-PRIORITIZER-INTERFACE");

    static private final SubLList $list3 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ORDER-QUEUE"), list(makeSymbol("QUEUE")), makeKeyword("PUBLIC")));

    private static final SubLSymbol QUEUE_PRIORITIZER_TEMPLATE = makeSymbol("QUEUE-PRIORITIZER-TEMPLATE");

    static private final SubLList $list5 = list(makeSymbol("QUEUE-PRIORITIZER-INTERFACE"));

    static private final SubLList $list6 = list(makeKeyword("EXTENDS"), list(makeSymbol("QUEUE-PRIORITIZER-INTERFACE")));

    static private final SubLList $list7 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ORDER-QUEUE-INTERNAL"), list(makeSymbol("CONTENTS")), makeKeyword("PROTECTED")));

    private static final SubLSymbol ORDER_QUEUE = makeSymbol("ORDER-QUEUE");

    static private final SubLList $list9 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list10 = list(makeSymbol("QUEUE"));

    static private final SubLList $list11 = list(list(makeSymbol("MUST"), list(makeSymbol("QUEUE-INTERFACE-P"), makeSymbol("QUEUE")), makeString("(ORDER-QUEUE ~S): ~S is not an instance of QUEUE-INTERFACE."), makeSymbol("SELF"), makeSymbol("QUEUE")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("QUEUE-INTERFACE-GET-CONTENTS"), makeSymbol("QUEUE")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENTS-ORDERED"), list(makeSymbol("ORDER-QUEUE-INTERNAL"), makeSymbol("SELF"), makeSymbol("TEMPLATE-CONTENTS")))), list(makeSymbol("QUEUE-INTERFACE-REORDER-CONTENTS"), makeSymbol("QUEUE"), makeSymbol("TEMPLATE-CONTENTS-ORDERED"))))), list(RET, NIL));

    private static final SubLSymbol QUEUE_SIMPLE_SORTER_TEMPLATE = makeSymbol("QUEUE-SIMPLE-SORTER-TEMPLATE");

    static private final SubLList $list13 = list(makeSymbol("QUEUE-PRIORITIZER-TEMPLATE"));

    static private final SubLList $list14 = list(makeKeyword("EXTENDS"), list(makeSymbol("QUEUE-PRIORITIZER-TEMPLATE")));

    static private final SubLList $list15 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SORT-PREDICATE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SORT-PREDICATE"), list(makeSymbol("NEW-PREDICATE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ELEMENT-KEY"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ELEMENT-KEY"), list(makeSymbol("NEW-KEY-FUNCTION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ORDER-QUEUE-INTERNAL"), list(makeSymbol("CONTENTS")), makeKeyword("PROTECTED")));

    private static final SubLSymbol ORDER_QUEUE_INTERNAL = makeSymbol("ORDER-QUEUE-INTERNAL");

    static private final SubLList $list17 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list18 = list(makeSymbol("CONTENTS"));

    static private final SubLList $list19 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PREDICATE"), list(makeSymbol("GET-SORT-PREDICATE"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-KEY-FUNCTION"), list(makeSymbol("GET-ELEMENT-KEY"), makeSymbol("SELF")))), list(makeSymbol("MUST"), makeSymbol("TEMPLATE-PREDICATE"), makeString("(ORDER-QUEUE-INTERNAL ~S): No ordering predicate has been associated with this prioritizer."), makeSymbol("SELF")), list(makeSymbol("PUNLESS"), makeSymbol("TEMPLATE-KEY-FUNCTION"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-KEY-FUNCTION"), list(makeSymbol("FUNCTION"), IDENTITY))), list(RET, list(makeSymbol("SORT"), makeSymbol("CONTENTS"), makeSymbol("TEMPLATE-PREDICATE"), makeSymbol("TEMPLATE-KEY-FUNCTION")))));

    private static final SubLSymbol BASIC_QUEUE_SIMPLE_SORTER = makeSymbol("BASIC-QUEUE-SIMPLE-SORTER");

    static private final SubLList $list22 = list(makeSymbol("QUEUE-SIMPLE-SORTER-TEMPLATE"));

    static private final SubLList $list23 = list(new SubLObject[]{ list(makeSymbol("SORT-PREDICATE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("ELEMENT-KEY-FUNCTION"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SORT-PREDICATE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SORT-PREDICATE"), list(makeSymbol("NEW-PREDICATE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ELEMENT-KEY"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ELEMENT-KEY"), list(makeSymbol("NEW-KEY-FUNCTION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ORDER-QUEUE"), list(makeSymbol("QUEUE")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ORDER-QUEUE-INTERNAL"), list(makeSymbol("CONTENTS")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")) });

    private static final SubLSymbol ELEMENT_KEY_FUNCTION = makeSymbol("ELEMENT-KEY-FUNCTION");

    static private final SubLString $str26$_ORDER_QUEUE_INTERNAL__S___No_ord = makeString("(ORDER-QUEUE-INTERNAL ~S): No ordering predicate has been associated with this prioritizer.");

    private static final SubLSymbol BASIC_QUEUE_SIMPLE_SORTER_ORDER_QUEUE_INTERNAL_METHOD = makeSymbol("BASIC-QUEUE-SIMPLE-SORTER-ORDER-QUEUE-INTERNAL-METHOD");

    static private final SubLString $str28$_ORDER_QUEUE__S____S_is_not_an_in = makeString("(ORDER-QUEUE ~S): ~S is not an instance of QUEUE-INTERFACE.");

    private static final SubLSymbol BASIC_QUEUE_SIMPLE_SORTER_ORDER_QUEUE_METHOD = makeSymbol("BASIC-QUEUE-SIMPLE-SORTER-ORDER-QUEUE-METHOD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_BASIC_QUEUE_SIMPLE_SORTER_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-QUEUE-SIMPLE-SORTER-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_BASIC_QUEUE_SIMPLE_SORTER_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-QUEUE-SIMPLE-SORTER-INSTANCE");

    static private final SubLList $list36 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("SORT-PREDICATE"), NIL), list(makeSymbol("CSETQ"), makeSymbol("ELEMENT-KEY-FUNCTION"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym37$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-QUEUE-SIMPLE-SORTER-METHOD");

    private static final SubLSymbol BASIC_QUEUE_SIMPLE_SORTER_INITIALIZE_METHOD = makeSymbol("BASIC-QUEUE-SIMPLE-SORTER-INITIALIZE-METHOD");

    private static final SubLSymbol GET_SORT_PREDICATE = makeSymbol("GET-SORT-PREDICATE");

    static private final SubLList $list40 = list(list(RET, makeSymbol("SORT-PREDICATE")));

    static private final SubLSymbol $sym41$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-QUEUE-SIMPLE-SORTER-METHOD");

    private static final SubLSymbol BASIC_QUEUE_SIMPLE_SORTER_GET_SORT_PREDICATE_METHOD = makeSymbol("BASIC-QUEUE-SIMPLE-SORTER-GET-SORT-PREDICATE-METHOD");

    private static final SubLSymbol SET_SORT_PREDICATE = makeSymbol("SET-SORT-PREDICATE");

    static private final SubLList $list44 = list(makeSymbol("NEW-PREDICATE"));

    static private final SubLList $list45 = list(list(makeSymbol("CSETQ"), makeSymbol("SORT-PREDICATE"), makeSymbol("NEW-PREDICATE")), list(RET, makeSymbol("NEW-PREDICATE")));

    static private final SubLSymbol $sym46$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-QUEUE-SIMPLE-SORTER-METHOD");

    private static final SubLSymbol BASIC_QUEUE_SIMPLE_SORTER_SET_SORT_PREDICATE_METHOD = makeSymbol("BASIC-QUEUE-SIMPLE-SORTER-SET-SORT-PREDICATE-METHOD");

    private static final SubLSymbol GET_ELEMENT_KEY = makeSymbol("GET-ELEMENT-KEY");

    static private final SubLList $list49 = list(list(RET, makeSymbol("ELEMENT-KEY-FUNCTION")));

    static private final SubLSymbol $sym50$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-QUEUE-SIMPLE-SORTER-METHOD");

    private static final SubLSymbol BASIC_QUEUE_SIMPLE_SORTER_GET_ELEMENT_KEY_METHOD = makeSymbol("BASIC-QUEUE-SIMPLE-SORTER-GET-ELEMENT-KEY-METHOD");

    private static final SubLSymbol SET_ELEMENT_KEY = makeSymbol("SET-ELEMENT-KEY");

    static private final SubLList $list53 = list(makeSymbol("NEW-KEY-FUNCTION"));

    static private final SubLList $list54 = list(list(makeSymbol("CSETQ"), makeSymbol("ELEMENT-KEY-FUNCTION"), makeSymbol("NEW-KEY-FUNCTION")), list(RET, makeSymbol("NEW-KEY-FUNCTION")));

    static private final SubLSymbol $sym55$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-QUEUE-SIMPLE-SORTER-METHOD");

    private static final SubLSymbol BASIC_QUEUE_SIMPLE_SORTER_SET_ELEMENT_KEY_METHOD = makeSymbol("BASIC-QUEUE-SIMPLE-SORTER-SET-ELEMENT-KEY-METHOD");

    private static final SubLSymbol QUEUE_INTERFACE = makeSymbol("QUEUE-INTERFACE");

    static private final SubLList $list58 = list(new SubLObject[]{ list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PRIORITIZER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PRIORITIZER"), list(makeSymbol("NEW-PRIORITIZER")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EMPTY-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ENQUEUE"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE"), list(makeSymbol("OLD-ELEMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEQUEUE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FIND"), list(makeSymbol("KEY-VALUE"), makeSymbol("&OPTIONAL"), list(makeSymbol("EQUALITY-PRED"), list(makeSymbol("FUNCTION"), EQL)), list(makeSymbol("KEY-ACCESSOR-FUNCTION"), list(makeSymbol("FUNCTION"), IDENTITY))), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ELEMENT-COUNT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONTENTS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CONTENTS"), list(makeSymbol("NEW-CONTENTS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEAR"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REORDER-CONTENTS"), list(makeSymbol("ORDERED-CONTENTS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PEEK"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ENQUEUED-P"), list(makeSymbol("OBJECT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PASSIVE-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PASSIVE"), list(makeSymbol("FLAG")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-ENQUEUE"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("PUBLIC")) });

    static private final SubLList $list60 = list(makeSymbol("STREAM"), makeSymbol("DEPTH"));

    static private final SubLList $list61 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("GET-CONTENTS"), makeSymbol("SELF")))), list(makeSymbol("PCOND"), list(list(makeSymbol("NULL"), makeSymbol("TEMPLATE-CONTENTS")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("QUEUE:{}"))), list(list(makeSymbol("NULL"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-CONTENTS"))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("QUEUE:{~S}"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-CONTENTS")))), list(T, list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("QUEUE:{~S"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-CONTENTS"))), list(makeSymbol("CDOLIST"), list(makeSymbol("ELEMENT"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-CONTENTS"))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("<-~S"), makeSymbol("ELEMENT"))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("}")))), list(RET, makeSymbol("SELF"))));

    static private final SubLList $list63 = list(makeSymbol("NEW-ELEMENT"));

    static private final SubLList $list64 = list(list(makeSymbol("IGNORE"), makeSymbol("NEW-ELEMENT")), list(RET, NIL));

    private static final SubLSymbol END_POINTER_QUEUE_TEMPLATE = makeSymbol("END-POINTER-QUEUE-TEMPLATE");

    static private final SubLList $list66 = list(makeSymbol("QUEUE-INTERFACE"));

    static private final SubLList $list67 = list(makeKeyword("EXTENDS"), list(makeSymbol("QUEUE-INTERFACE")));

    static private final SubLList $list68 = list(new SubLObject[]{ list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-FIRST-CONS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-FIRST-CONS"), list(makeSymbol("NEW-CONS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-END-POINTER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-END-POINTER"), list(makeSymbol("NEW-END-POINTER")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EMPTY-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ENQUEUE"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE"), list(makeSymbol("OLD-ELEMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEQUEUE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FIND"), list(makeSymbol("KEY-VALUE"), makeSymbol("&OPTIONAL"), list(makeSymbol("EQUALITY-PRED"), list(makeSymbol("FUNCTION"), EQL)), list(makeSymbol("KEY-ACCESSOR-FUNCTION"), list(makeSymbol("FUNCTION"), IDENTITY))), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ELEMENT-COUNT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONTENTS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CONTENTS"), list(makeSymbol("NEW-CONTENTS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEAR"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REORDER-CONTENTS"), list(makeSymbol("ORDERED-CONTENTS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PEEK"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ENQUEUED-P"), list(makeSymbol("OBJECT")), makeKeyword("PUBLIC")) });

    static private final SubLList $list70 = list(list(RET, list(makeSymbol("NULL"), list(makeSymbol("GET-FIRST-CONS"), makeSymbol("SELF")))));

    static private final SubLList $list72 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("GET-FIRST-CONS"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-END-POINTER"), list(makeSymbol("GET-END-POINTER"), makeSymbol("SELF")))), list(makeSymbol("PIF"), list(makeSymbol("NULL"), makeSymbol("TEMPLATE-CONTENTS")), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("LIST"), makeSymbol("NEW-ELEMENT"))), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-END-POINTER"), makeSymbol("TEMPLATE-CONTENTS"))), list(makeSymbol("PROGN"), list(makeSymbol("RPLACD"), makeSymbol("TEMPLATE-END-POINTER"), list(makeSymbol("LIST"), makeSymbol("NEW-ELEMENT"))), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-END-POINTER"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-END-POINTER"))))), list(makeSymbol("SET-FIRST-CONS"), makeSymbol("SELF"), makeSymbol("TEMPLATE-CONTENTS")), list(makeSymbol("SET-END-POINTER"), makeSymbol("SELF"), makeSymbol("TEMPLATE-END-POINTER")), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("PASSIVE-P"), makeSymbol("SELF"))), list(makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), makeSymbol("NEW-ELEMENT"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("NEW-ELEMENT"), list(QUOTE, makeSymbol("ENQUEUE-NOTIFY")), makeSymbol("SELF"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ON-ENQUEUE")), makeSymbol("NEW-ELEMENT")), list(RET, makeSymbol("NEW-ELEMENT"))));

    static private final SubLList $list74 = list(makeSymbol("OLD-ELEMENT"));

    static private final SubLList $list75 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("GET-FIRST-CONS"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-END-POINTER"), list(makeSymbol("GET-END-POINTER"), makeSymbol("SELF")))), list(makeSymbol("PIF"), list(makeSymbol("NULL"), makeSymbol("TEMPLATE-CONTENTS")), list(RET, NIL), list(makeSymbol("PIF"), list(EQ, makeSymbol("OLD-ELEMENT"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-CONTENTS"))), list(makeSymbol("PIF"), list(EQ, makeSymbol("TEMPLATE-CONTENTS"), makeSymbol("TEMPLATE-END-POINTER")), list(makeSymbol("PROGN"), list(makeSymbol("SET-FIRST-CONS"), makeSymbol("SELF"), NIL), list(makeSymbol("SET-END-POINTER"), makeSymbol("SELF"), NIL), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("PASSIVE-P"), makeSymbol("SELF"))), list(makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), makeSymbol("OLD-ELEMENT"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("OLD-ELEMENT"), list(QUOTE, makeSymbol("REMOVE-NOTIFY")), makeSymbol("SELF"))), list(RET, makeSymbol("OLD-ELEMENT"))), list(makeSymbol("PROGN"), list(makeSymbol("SET-FIRST-CONS"), makeSymbol("SELF"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-CONTENTS"))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("PASSIVE-P"), makeSymbol("SELF"))), list(makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), makeSymbol("OLD-ELEMENT"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("OLD-ELEMENT"), list(QUOTE, makeSymbol("REMOVE-NOTIFY")), makeSymbol("SELF"))), list(RET, makeSymbol("OLD-ELEMENT")))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CURRENT-CONS"), makeSymbol("TEMPLATE-CONTENTS"))), list(makeSymbol("WHILE"), list(makeSymbol("CNOT"), list(EQ, list(makeSymbol("CDR"), makeSymbol("TEMPLATE-CURRENT-CONS")), makeSymbol("TEMPLATE-END-POINTER"))), list(makeSymbol("PWHEN"), list(EQ, makeSymbol("OLD-ELEMENT"), list(makeSymbol("CADR"), makeSymbol("TEMPLATE-CURRENT-CONS"))), list(makeSymbol("RPLACD"), makeSymbol("TEMPLATE-CURRENT-CONS"), list(makeSymbol("CDDR"), makeSymbol("TEMPLATE-CURRENT-CONS"))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("PASSIVE-P"), makeSymbol("SELF"))), list(makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), makeSymbol("OLD-ELEMENT"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("OLD-ELEMENT"), list(QUOTE, makeSymbol("REMOVE-NOTIFY")), makeSymbol("SELF"))), list(RET, makeSymbol("OLD-ELEMENT"))), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-CURRENT-CONS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-CURRENT-CONS")))), list(makeSymbol("PIF"), list(EQ, makeSymbol("OLD-ELEMENT"), list(makeSymbol("CADR"), makeSymbol("TEMPLATE-CURRENT-CONS"))), list(makeSymbol("PROGN"), list(makeSymbol("RPLACD"), makeSymbol("TEMPLATE-CURRENT-CONS"), NIL), list(makeSymbol("SET-END-POINTER"), makeSymbol("SELF"), makeSymbol("TEMPLATE-CURRENT-CONS")), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("PASSIVE-P"), makeSymbol("SELF"))), list(makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), makeSymbol("OLD-ELEMENT"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("OLD-ELEMENT"), list(QUOTE, makeSymbol("REMOVE-NOTIFY")), makeSymbol("SELF"))), list(RET, makeSymbol("OLD-ELEMENT"))), list(makeSymbol("PROGN"), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("PASSIVE-P"), makeSymbol("SELF"))), list(makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), makeSymbol("OLD-ELEMENT"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("OLD-ELEMENT"), list(QUOTE, makeSymbol("REMOVE-NOTIFY")), makeSymbol("SELF"))), list(RET, makeSymbol("OLD-ELEMENT")))))))));

    static private final SubLList $list77 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PRIORITIZER"), list(makeSymbol("GET-PRIORITIZER"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-PRIORITIZER"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-PRIORITIZER"), list(QUOTE, makeSymbol("ORDER-QUEUE")), makeSymbol("SELF")))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("GET-FIRST-CONS"), makeSymbol("SELF")))), list(makeSymbol("PUNLESS"), makeSymbol("TEMPLATE-CONTENTS"), list(RET, NIL)), list(makeSymbol("PUNLESS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-CONTENTS")), list(makeSymbol("SET-FIRST-CONS"), makeSymbol("SELF"), NIL), list(makeSymbol("SET-END-POINTER"), makeSymbol("SELF"), NIL), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-RESULT"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-CONTENTS")))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("PASSIVE-P"), makeSymbol("SELF"))), list(makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), makeSymbol("TEMPLATE-RESULT"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-RESULT"), list(QUOTE, makeSymbol("DEQUEUE-NOTIFY")), makeSymbol("SELF"))), list(RET, makeSymbol("TEMPLATE-RESULT")))), list(makeSymbol("SET-FIRST-CONS"), makeSymbol("SELF"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-CONTENTS"))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-RESULT"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-CONTENTS")))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("PASSIVE-P"), makeSymbol("SELF"))), list(makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), makeSymbol("TEMPLATE-RESULT"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-RESULT"), list(QUOTE, makeSymbol("DEQUEUE-NOTIFY")), makeSymbol("SELF"))), list(RET, makeSymbol("TEMPLATE-RESULT")))));

    static private final SubLList $list79 = list(makeSymbol("KEY-VALUE"), makeSymbol("&OPTIONAL"), list(makeSymbol("EQUALITY-PRED"), list(makeSymbol("FUNCTION"), EQL)), list(makeSymbol("KEY-ACCESSOR-FUNCTION"), list(makeSymbol("FUNCTION"), IDENTITY)));

    static private final SubLList $list80 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("GET-FIRST-CONS"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-ITEM"), list(makeSymbol("MEMBER"), makeSymbol("KEY-VALUE"), makeSymbol("TEMPLATE-CONTENTS"), makeSymbol("EQUALITY-PRED"), makeSymbol("KEY-ACCESSOR-FUNCTION")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-ITEM"), list(RET, makeSymbol("TEMPLATE-ITEM")))))), list(RET, NIL));

    static private final SubLList $list82 = list(list(RET, list(makeSymbol("LENGTH"), list(makeSymbol("GET-FIRST-CONS"), makeSymbol("SELF")))));

    static private final SubLList $list84 = list(list(RET, list(makeSymbol("GET-FIRST-CONS"), makeSymbol("SELF"))));

    static private final SubLList $list86 = list(makeSymbol("NEW-CONTENTS"));

    static private final SubLList $list87 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("COPY-LIST"), makeSymbol("NEW-CONTENTS")))), list(makeSymbol("PIF"), makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("PROGN"), list(makeSymbol("SET-FIRST-CONS"), makeSymbol("SELF"), makeSymbol("TEMPLATE-CONTENTS")), list(makeSymbol("SET-END-POINTER"), makeSymbol("SELF"), list(makeSymbol("LAST"), makeSymbol("TEMPLATE-CONTENTS")))), list(makeSymbol("PROGN"), list(makeSymbol("SET-FIRST-CONS"), makeSymbol("SELF"), NIL), list(makeSymbol("SET-END-POINTER"), makeSymbol("SELF"), NIL))), list(RET, makeSymbol("NEW-CONTENTS"))));

    static private final SubLList $list89 = list(list(makeSymbol("SET-FIRST-CONS"), makeSymbol("SELF"), NIL), list(makeSymbol("SET-END-POINTER"), makeSymbol("SELF"), NIL), list(RET, NIL));

    static private final SubLList $list91 = list(makeSymbol("ORDERED-CONTENTS"));

    static private final SubLList $list92 = list(list(RET, list(makeSymbol("SET-CONTENTS"), makeSymbol("SELF"), makeSymbol("ORDERED-CONTENTS"))));

    static private final SubLList $list94 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("GET-FIRST-CONS"), makeSymbol("SELF")))), list(makeSymbol("PUNLESS"), makeSymbol("TEMPLATE-CONTENTS"), list(RET, NIL)), list(RET, list(makeSymbol("CAR"), makeSymbol("TEMPLATE-CONTENTS")))));

    static private final SubLList $list96 = list(makeSymbol("OBJECT"));

    static private final SubLList $list97 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("GET-FIRST-CONS"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), list(makeSymbol("MEMBER"), makeSymbol("OBJECT"), makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("FUNCTION"), EQUAL)), list(RET, T)), list(RET, NIL)));

    private static final SubLSymbol BASIC_QUEUE = makeSymbol("BASIC-QUEUE");

    static private final SubLList $list99 = list(makeSymbol("END-POINTER-QUEUE-TEMPLATE"));

    static private final SubLList $list100 = list(new SubLObject[]{ list(makeSymbol("FIRST-CONS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("LAST-CONS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("PRIORITIZER"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("IS-PASSIVE"), makeKeyword("BOOLEAN"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-FIRST-CONS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-FIRST-CONS"), list(makeSymbol("NEW-CONS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-END-POINTER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-END-POINTER"), list(makeSymbol("NEW-END-POINTER")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PRIORITIZER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PRIORITIZER"), list(makeSymbol("NEW-PRIORITIZER")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PASSIVE-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PASSIVE"), list(makeSymbol("FLAG")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EMPTY-P"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ENQUEUE"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-ENQUEUE"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE"), list(makeSymbol("OLD-ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEQUEUE"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FIND"), list(makeSymbol("KEY-VALUE"), makeSymbol("&OPTIONAL"), list(makeSymbol("EQUALITY-PRED"), list(makeSymbol("FUNCTION"), EQL)), list(makeSymbol("KEY-ACCESSOR-FUNCTION"), list(makeSymbol("FUNCTION"), IDENTITY))), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ELEMENT-COUNT"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONTENTS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CONTENTS"), list(makeSymbol("NEW-CONTENTS")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEAR"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REORDER-CONTENTS"), list(makeSymbol("ORDERED-CONTENTS")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PEEK"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ENQUEUED-P"), list(makeSymbol("OBJECT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")) });

    private static final SubLSymbol FIRST_CONS = makeSymbol("FIRST-CONS");

    private static final SubLInteger $int$4097 = makeInteger(4097);

    private static final SubLSymbol BASIC_QUEUE_ENQUEUED_P_METHOD = makeSymbol("BASIC-QUEUE-ENQUEUED-P-METHOD");

    private static final SubLSymbol BASIC_QUEUE_PEEK_METHOD = makeSymbol("BASIC-QUEUE-PEEK-METHOD");

    private static final SubLSymbol BASIC_QUEUE_REORDER_CONTENTS_METHOD = makeSymbol("BASIC-QUEUE-REORDER-CONTENTS-METHOD");

    private static final SubLSymbol BASIC_QUEUE_CLEAR_METHOD = makeSymbol("BASIC-QUEUE-CLEAR-METHOD");

    private static final SubLSymbol BASIC_QUEUE_SET_CONTENTS_METHOD = makeSymbol("BASIC-QUEUE-SET-CONTENTS-METHOD");

    private static final SubLSymbol BASIC_QUEUE_GET_CONTENTS_METHOD = makeSymbol("BASIC-QUEUE-GET-CONTENTS-METHOD");

    private static final SubLSymbol BASIC_QUEUE_GET_ELEMENT_COUNT_METHOD = makeSymbol("BASIC-QUEUE-GET-ELEMENT-COUNT-METHOD");

    private static final SubLSymbol BASIC_QUEUE_FIND_METHOD = makeSymbol("BASIC-QUEUE-FIND-METHOD");

    private static final SubLSymbol BASIC_QUEUE_DEQUEUE_METHOD = makeSymbol("BASIC-QUEUE-DEQUEUE-METHOD");

    private static final SubLSymbol BASIC_QUEUE_REMOVE_METHOD = makeSymbol("BASIC-QUEUE-REMOVE-METHOD");

    private static final SubLSymbol BASIC_QUEUE_ON_ENQUEUE_METHOD = makeSymbol("BASIC-QUEUE-ON-ENQUEUE-METHOD");

    private static final SubLSymbol BASIC_QUEUE_ENQUEUE_METHOD = makeSymbol("BASIC-QUEUE-ENQUEUE-METHOD");

    private static final SubLSymbol BASIC_QUEUE_EMPTY_P_METHOD = makeSymbol("BASIC-QUEUE-EMPTY-P-METHOD");

    static private final SubLString $str122$QUEUE___ = makeString("QUEUE:{}");

    static private final SubLString $str123$QUEUE___S_ = makeString("QUEUE:{~S}");

    static private final SubLString $str124$QUEUE___S = makeString("QUEUE:{~S");

    static private final SubLString $str125$___S = makeString("<-~S");

    static private final SubLString $str126$_ = makeString("}");

    private static final SubLSymbol BASIC_QUEUE_PRINT_METHOD = makeSymbol("BASIC-QUEUE-PRINT-METHOD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_BASIC_QUEUE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-QUEUE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_BASIC_QUEUE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-QUEUE-INSTANCE");

    static private final SubLList $list130 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("FIRST-CONS"), NIL), list(makeSymbol("CSETQ"), makeSymbol("LAST-CONS"), NIL), list(makeSymbol("CSETQ"), makeSymbol("PRIORITIZER"), NIL), list(makeSymbol("CSETQ"), makeSymbol("IS-PASSIVE"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym131$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-QUEUE-METHOD");

    private static final SubLSymbol BASIC_QUEUE_INITIALIZE_METHOD = makeSymbol("BASIC-QUEUE-INITIALIZE-METHOD");

    static private final SubLList $list134 = list(list(RET, makeSymbol("FIRST-CONS")));

    static private final SubLSymbol $sym135$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-QUEUE-METHOD");

    private static final SubLSymbol BASIC_QUEUE_GET_FIRST_CONS_METHOD = makeSymbol("BASIC-QUEUE-GET-FIRST-CONS-METHOD");

    static private final SubLList $list138 = list(makeSymbol("NEW-CONS"));

    static private final SubLList $list139 = list(list(makeSymbol("CSETQ"), makeSymbol("FIRST-CONS"), makeSymbol("NEW-CONS")), list(RET, makeSymbol("NEW-CONS")));

    static private final SubLSymbol $sym140$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-QUEUE-METHOD");

    private static final SubLSymbol BASIC_QUEUE_SET_FIRST_CONS_METHOD = makeSymbol("BASIC-QUEUE-SET-FIRST-CONS-METHOD");

    static private final SubLList $list143 = list(list(RET, makeSymbol("LAST-CONS")));

    static private final SubLSymbol $sym144$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-QUEUE-METHOD");

    private static final SubLSymbol BASIC_QUEUE_GET_END_POINTER_METHOD = makeSymbol("BASIC-QUEUE-GET-END-POINTER-METHOD");

    static private final SubLList $list147 = list(makeSymbol("NEW-END-POINTER"));

    static private final SubLList $list148 = list(list(makeSymbol("CSETQ"), makeSymbol("LAST-CONS"), makeSymbol("NEW-END-POINTER")), list(RET, makeSymbol("NEW-END-POINTER")));

    static private final SubLSymbol $sym149$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-QUEUE-METHOD");

    private static final SubLSymbol BASIC_QUEUE_SET_END_POINTER_METHOD = makeSymbol("BASIC-QUEUE-SET-END-POINTER-METHOD");

    static private final SubLList $list152 = list(list(RET, makeSymbol("PRIORITIZER")));

    static private final SubLSymbol $sym153$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-QUEUE-METHOD");

    private static final SubLSymbol BASIC_QUEUE_GET_PRIORITIZER_METHOD = makeSymbol("BASIC-QUEUE-GET-PRIORITIZER-METHOD");

    static private final SubLList $list156 = list(makeSymbol("NEW-PRIORITIZER"));

    static private final SubLList $list157 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-PRIORITIZER")), list(makeSymbol("QUEUE-PRIORITIZER-INTERFACE-P"), makeSymbol("NEW-PRIORITIZER"))), makeString("(SET-PRIORITIZER ~S): ~S is not an instance of QUEUE-PRIORITIZER-INTERFACE."), makeSymbol("SELF"), makeSymbol("NEW-PRIORITIZER")), list(makeSymbol("CSETQ"), makeSymbol("PRIORITIZER"), makeSymbol("NEW-PRIORITIZER")), list(RET, makeSymbol("NEW-PRIORITIZER")));

    static private final SubLSymbol $sym158$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-QUEUE-METHOD");

    static private final SubLString $str159$_SET_PRIORITIZER__S____S_is_not_a = makeString("(SET-PRIORITIZER ~S): ~S is not an instance of QUEUE-PRIORITIZER-INTERFACE.");

    private static final SubLSymbol BASIC_QUEUE_SET_PRIORITIZER_METHOD = makeSymbol("BASIC-QUEUE-SET-PRIORITIZER-METHOD");

    static private final SubLList $list162 = list(makeKeyword("READ-ONLY"), makeKeyword("PUBLIC"));

    static private final SubLList $list163 = list(list(RET, makeSymbol("IS-PASSIVE")));

    private static final SubLSymbol BASIC_QUEUE_PASSIVE_P_METHOD = makeSymbol("BASIC-QUEUE-PASSIVE-P-METHOD");

    static private final SubLList $list166 = list(makeSymbol("FLAG"));

    static private final SubLList $list167 = list(list(makeSymbol("CSETQ"), makeSymbol("IS-PASSIVE"), makeSymbol("FLAG")), list(RET, makeSymbol("FLAG")));

    static private final SubLSymbol $sym168$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-QUEUE-METHOD");

    private static final SubLSymbol BASIC_QUEUE_SET_PASSIVE_METHOD = makeSymbol("BASIC-QUEUE-SET-PASSIVE-METHOD");

    private static final SubLSymbol DOUBLY_LINKED_QUEUE_TEMPLATE = makeSymbol("DOUBLY-LINKED-QUEUE-TEMPLATE");

    static private final SubLList $list171 = list(new SubLObject[]{ list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-LIST-INTERNAL"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-LIST-INTERNAL"), list(makeSymbol("NEW-LIST")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PRIORITIZER-INTERNAL"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PRIORITIZER-INTERNAL"), list(makeSymbol("NEW-PRIORITIZER")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE-QUA-DOUBLY-LINKED-QUEUE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-LIST"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PRIORITIZER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PRIORITIZER"), list(makeSymbol("NEW-PRIORITIZER")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EMPTY-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ENQUEUE"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE"), list(makeSymbol("OLD-ELEMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEQUEUE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FIND"), list(makeSymbol("KEY-VALUE"), makeSymbol("&OPTIONAL"), list(makeSymbol("EQUALITY-PRED"), list(makeSymbol("FUNCTION"), EQL)), list(makeSymbol("KEY-ACCESSOR-FUNCTION"), list(makeSymbol("FUNCTION"), IDENTITY))), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ELEMENT-COUNT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONTENTS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CONTENTS"), list(makeSymbol("NEW-CONTENTS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEAR"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REORDER-CONTENTS"), list(makeSymbol("ORDERED-CONTENTS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PEEK"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ENQUEUED-P"), list(makeSymbol("OBJECT")), makeKeyword("PUBLIC")) });

    private static final SubLSymbol INITIALIZE_QUA_DOUBLY_LINKED_QUEUE = makeSymbol("INITIALIZE-QUA-DOUBLY-LINKED-QUEUE");

    static private final SubLList $list173 = list(list(makeSymbol("SET-LIST-INTERNAL"), makeSymbol("SELF"), NIL), list(makeSymbol("SET-PRIORITIZER-INTERNAL"), makeSymbol("SELF"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLList $list175 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LIST"), list(makeSymbol("GET-LIST-INTERNAL"), makeSymbol("SELF")))), list(makeSymbol("PUNLESS"), list(makeSymbol("GET-LIST-INTERNAL"), makeSymbol("SELF")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-LIST"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), list(QUOTE, makeSymbol("BASIC-DOUBLY-LINKED-LIST")))), list(makeSymbol("SET-LIST-INTERNAL"), makeSymbol("SELF"), makeSymbol("TEMPLATE-LIST"))), list(RET, makeSymbol("TEMPLATE-LIST"))));

    static private final SubLList $list176 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LIST"), list(makeSymbol("GET-LIST-INTERNAL"), makeSymbol("SELF")))), list(makeSymbol("PUNLESS"), makeSymbol("TEMPLATE-LIST"), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("DL-QUEUE:{}")), list(RET, makeSymbol("SELF"))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-ENUMERATOR"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ALLOCATE-ENUMERATOR"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("TEMPLATE-LIST")))), list(makeSymbol("PCOND"), list(list(makeSymbol("NULL"), makeSymbol("TEMPLATE-ENUMERATOR")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("#<~S Class is not correctly implemented.  ALLOCATE-ENUMERATOR failed.>"), list(makeSymbol("CLASS-OF"), makeSymbol("SELF"))), list(RET, makeSymbol("SELF"))), list(list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-ENUMERATOR"), list(QUOTE, makeSymbol("EMPTY-P"))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("DL-QUEUE:{}"))), list(T, list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("DL-QUEUE:{~S"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-ENUMERATOR"), list(QUOTE, makeSymbol("FIRST")))), list(makeSymbol("WHILE"), list(makeSymbol("CNOT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-ENUMERATOR"), list(QUOTE, makeSymbol("LAST-P")))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("<-~S"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-ENUMERATOR"), list(QUOTE, makeSymbol("NEXT"))))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("}")))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("DEALLOCATE-ENUMERATOR"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("TEMPLATE-LIST"), makeSymbol("TEMPLATE-ENUMERATOR")))), list(RET, makeSymbol("SELF")));

    static private final SubLList $list177 = list(list(RET, list(makeSymbol("GET-PRIORITIZER-INTERNAL"), makeSymbol("SELF"))));

    static private final SubLList $list178 = list(list(makeSymbol("PUNLESS"), makeSymbol("NEW-PRIORITIZER"), list(makeSymbol("SET-PRIORITIZER-INTERNAL"), makeSymbol("SELF"), NIL), list(RET, NIL)), list(makeSymbol("MUST"), list(makeSymbol("QUEUE-PRIORITIZER-INTERFACE-P"), makeSymbol("NEW-PRIORITIZER")), makeString("(SET-PRIORITIZER ~S): ~S is not an instance of QUEUE-PRIORITIZER-INTERFACE."), makeSymbol("SELF"), makeSymbol("NEW-PRIORITIZER")), list(makeSymbol("SET-PRIORITIZER-INTERNAL"), makeSymbol("SELF"), makeSymbol("NEW-PRIORITIZER")), list(RET, makeSymbol("NEW-PRIORITIZER")));

    static private final SubLList $list179 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LIST"), list(makeSymbol("GET-LIST-INTERNAL"), makeSymbol("SELF")))), list(RET, list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("TEMPLATE-LIST")), list(makeSymbol("COLLECTION-TEMPLATE-EMPTY-P"), makeSymbol("TEMPLATE-LIST"))))));

    static private final SubLList $list180 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-RESOLVED-LIST"), list(makeSymbol("GET-LIST"), makeSymbol("SELF")))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ADD"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("TEMPLATE-RESOLVED-LIST"), makeSymbol("NEW-ELEMENT")), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("PASSIVE-P"), makeSymbol("SELF"))), list(makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), makeSymbol("NEW-ELEMENT"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("NEW-ELEMENT"), list(QUOTE, makeSymbol("ENQUEUE-NOTIFY")), makeSymbol("SELF"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ON-ENQUEUE")), makeSymbol("NEW-ELEMENT")), list(RET, makeSymbol("NEW-ELEMENT"))));

    static private final SubLList $list181 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-RESOLVED-LIST"), list(makeSymbol("GET-LIST"), makeSymbol("SELF")))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("REMOVE"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("TEMPLATE-RESOLVED-LIST"), makeSymbol("OLD-ELEMENT")), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("PASSIVE-P"), makeSymbol("SELF"))), list(makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), makeSymbol("OLD-ELEMENT"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("OLD-ELEMENT"), list(QUOTE, makeSymbol("REMOVE-NOTIFY")), makeSymbol("SELF"))), list(RET, makeSymbol("OLD-ELEMENT"))));

    static private final SubLList $list182 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LIST"), list(makeSymbol("GET-LIST-INTERNAL"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-LIST"), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PRIORITIZER"), list(makeSymbol("GET-PRIORITIZER"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-PRIORITIZER"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-PRIORITIZER"), list(QUOTE, makeSymbol("ORDER-QUEUE")), makeSymbol("SELF")))), list(makeSymbol("CLET"), list(list(makeSymbol("DEQUEUED-ITEM"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("POP"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("TEMPLATE-LIST")))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("PASSIVE-P"), makeSymbol("SELF"))), list(makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), makeSymbol("DEQUEUED-ITEM"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("DEQUEUED-ITEM"), list(QUOTE, makeSymbol("DEQUEUE-NOTIFY")), makeSymbol("SELF"))), list(RET, makeSymbol("DEQUEUED-ITEM"))))), list(RET, NIL));

    static private final SubLList $list183 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LIST"), list(makeSymbol("GET-LIST-INTERNAL"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-LIST"), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-ENUMERATOR"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-LIST"), list(QUOTE, makeSymbol("ALLOCATE-ENUMERATOR"))))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-ENUMERATOR"), list(makeSymbol("PUNLESS"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-ENUMERATOR"), list(QUOTE, makeSymbol("EMPTY-P"))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CURRENT-ELEMENT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-ENUMERATOR"), list(QUOTE, makeSymbol("FIRST"))))), list(makeSymbol("PWHEN"), list(makeSymbol("FUNCALL"), makeSymbol("EQUALITY-PRED"), makeSymbol("KEY-VALUE"), list(makeSymbol("FUNCALL"), makeSymbol("KEY-ACCESSOR-FUNCTION"), makeSymbol("TEMPLATE-CURRENT-ELEMENT"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-LIST"), list(QUOTE, makeSymbol("DEALLOCATE-ENUMERATOR")), makeSymbol("TEMPLATE-ENUMERATOR")), list(RET, makeSymbol("TEMPLATE-CURRENT-ELEMENT"))), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-CURRENT-ELEMENT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-ENUMERATOR"), list(QUOTE, makeSymbol("NEXT")))), list(makeSymbol("WHILE"), makeSymbol("TEMPLATE-CURRENT-ELEMENT"), list(makeSymbol("PWHEN"), list(makeSymbol("FUNCALL"), makeSymbol("EQUALITY-PRED"), makeSymbol("KEY-VALUE"), list(makeSymbol("FUNCALL"), makeSymbol("KEY-ACCESSOR-FUNCTION"), makeSymbol("TEMPLATE-CURRENT-ELEMENT"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-LIST"), list(QUOTE, makeSymbol("DEALLOCATE-ENUMERATOR")), makeSymbol("TEMPLATE-ENUMERATOR")), list(RET, makeSymbol("TEMPLATE-CURRENT-ELEMENT"))), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-CURRENT-ELEMENT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-ENUMERATOR"), list(QUOTE, makeSymbol("NEXT")))))))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-LIST"), list(QUOTE, makeSymbol("DEALLOCATE-ENUMERATOR")), makeSymbol("TEMPLATE-ENUMERATOR")), list(RET, NIL)))), list(RET, NIL));

    static private final SubLList $list184 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LIST"), list(makeSymbol("GET-LIST-INTERNAL"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-LIST"), list(RET, list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-ELEMENT-COUNT"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("TEMPLATE-LIST"))))), list(RET, ZERO_INTEGER));

    static private final SubLList $list185 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LIST"), list(makeSymbol("GET-LIST-INTERNAL"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-LIST"), list(RET, list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-CONTENTS"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("TEMPLATE-LIST"))))), list(RET, NIL));

    static private final SubLList $list186 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-RESOLVED-LIST"), list(makeSymbol("GET-LIST"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-ENUMERATOR"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ALLOCATE-ENUMERATOR"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("TEMPLATE-RESOLVED-LIST")))), list(makeSymbol("PUNLESS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("EMPTY-P"), makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR")), makeSymbol("TEMPLATE-ENUMERATOR")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CURRENT-ITEM"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("FIRST"), makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR")), makeSymbol("TEMPLATE-ENUMERATOR")))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("PASSIVE-P"), makeSymbol("SELF"))), list(makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), makeSymbol("TEMPLATE-CURRENT-ITEM"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-CURRENT-ITEM"), list(QUOTE, makeSymbol("DEQUEUE-NOTIFY")))), list(makeSymbol("WHILE"), list(makeSymbol("CNOT"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("LAST-P"), makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR")), makeSymbol("TEMPLATE-ENUMERATOR"))), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-CURRENT-ITEM"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEXT"), makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR")), makeSymbol("TEMPLATE-ENUMERATOR"))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("PASSIVE-P"), makeSymbol("SELF"))), list(makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), makeSymbol("TEMPLATE-CURRENT-ITEM"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-CURRENT-ITEM"), list(QUOTE, makeSymbol("DEQUEUE-NOTIFY")))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("DEALLOCATE-ENUMERATOR"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("TEMPLATE-RESOLVED-LIST"), makeSymbol("TEMPLATE-ENUMERATOR"))), list(makeSymbol("PWHEN"), makeSymbol("NEW-CONTENTS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-CONTENTS"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("TEMPLATE-RESOLVED-LIST"), makeSymbol("NEW-CONTENTS")), list(makeSymbol("CDOLIST"), list(makeSymbol("NEW-ITEM"), makeSymbol("NEW-CONTENTS")), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("PASSIVE-P"), makeSymbol("SELF"))), list(makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), makeSymbol("NEW-ITEM"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("NEW-ITEM"), list(QUOTE, makeSymbol("ENQUEUE-NOTIFY")), makeSymbol("SELF")))))), list(RET, makeSymbol("NEW-CONTENTS")));

    static private final SubLList $list187 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LIST"), list(makeSymbol("GET-LIST-INTERNAL"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-LIST"), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-ENUMERATOR"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ALLOCATE-ENUMERATOR"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("TEMPLATE-LIST")))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CURRENT-ITEM"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("FIRST"), makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR")), makeSymbol("TEMPLATE-ENUMERATOR")))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("PASSIVE-P"), makeSymbol("SELF"))), list(makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), makeSymbol("TEMPLATE-CURRENT-ITEM"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-CURRENT-ITEM"), list(QUOTE, makeSymbol("DEQUEUE-NOTIFY")))), list(makeSymbol("WHILE"), list(makeSymbol("CNOT"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("LAST-P"), makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR")), makeSymbol("TEMPLATE-ENUMERATOR"))), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-CURRENT-ITEM"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEXT"), makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR")), makeSymbol("TEMPLATE-ENUMERATOR"))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("PASSIVE-P"), makeSymbol("SELF"))), list(makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), makeSymbol("TEMPLATE-CURRENT-ITEM"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-CURRENT-ITEM"), list(QUOTE, makeSymbol("DEQUEUE-NOTIFY")))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("DEALLOCATE-ENUMERATOR"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("TEMPLATE-LIST"), makeSymbol("TEMPLATE-ENUMERATOR"))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("CLEAR"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("TEMPLATE-LIST")))), list(RET, NIL));

    static private final SubLList $list188 = list(list(makeSymbol("CLET"), list(list(makeSymbol("RESOLVED-LIST"), list(makeSymbol("GET-LIST"), makeSymbol("SELF")))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-CONTENTS"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("RESOLVED-LIST"), makeSymbol("ORDERED-CONTENTS")), list(RET, NIL)));

    static private final SubLList $list189 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LIST"), list(makeSymbol("GET-LIST-INTERNAL"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-LIST"), list(makeSymbol("PUNLESS"), list(makeSymbol("="), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-ELEMENT-COUNT"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("TEMPLATE-LIST")), ZERO_INTEGER), list(RET, NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("NEXT-ITEM"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NTH"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("TEMPLATE-LIST"), ZERO_INTEGER))), list(RET, makeSymbol("NEXT-ITEM"))))), list(RET, NIL));

    static private final SubLList $list190 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LIST"), list(makeSymbol("GET-LIST-INTERNAL"), makeSymbol("SELF")))), list(makeSymbol("PUNLESS"), makeSymbol("TEMPLATE-LIST"), list(RET, NIL)), list(RET, list(makeSymbol("INLINE-METHOD"), list(makeSymbol("MEMBER-P"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("TEMPLATE-LIST"), makeSymbol("OBJECT")))));

    static private final SubLList $list192 = list(makeSymbol("DOUBLY-LINKED-QUEUE-TEMPLATE"));

    static private final SubLList $list193 = list(new SubLObject[]{ list(makeSymbol("LIST"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("PRIORITIZER"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("IS-PASSIVE"), makeKeyword("BOOLEAN"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-LIST-INTERNAL"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-LIST-INTERNAL"), list(makeSymbol("NEW-LIST")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PRIORITIZER-INTERNAL"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PRIORITIZER-INTERNAL"), list(makeSymbol("NEW-PRIORITIZER")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PASSIVE-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PASSIVE"), list(makeSymbol("FLAG")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE-QUA-DOUBLY-LINKED-QUEUE"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-LIST"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PRIORITIZER"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PRIORITIZER"), list(makeSymbol("NEW-PRIORITIZER")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EMPTY-P"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ENQUEUE"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-ENQUEUE"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("PUBLIC"), makeKeyword("INSTANTIATE-TEMPLATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE"), list(makeSymbol("OLD-ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEQUEUE"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FIND"), list(makeSymbol("KEY-VALUE"), makeSymbol("&OPTIONAL"), list(makeSymbol("EQUALITY-PRED"), list(makeSymbol("FUNCTION"), EQL)), list(makeSymbol("KEY-ACCESSOR-FUNCTION"), list(makeSymbol("FUNCTION"), IDENTITY))), makeKeyword("PUBLIC"), makeKeyword("INSTANTIATE-TEMPLATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ELEMENT-COUNT"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONTENTS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CONTENTS"), list(makeSymbol("NEW-CONTENTS")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEAR"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REORDER-CONTENTS"), list(makeSymbol("ORDERED-CONTENTS")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PEEK"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ENQUEUED-P"), list(makeSymbol("OBJECT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")) });

    private static final SubLSymbol BASIC_DOUBLY_LINKED_QUEUE_ENQUEUED_P_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-ENQUEUED-P-METHOD");

    private static final SubLSymbol BASIC_DOUBLY_LINKED_QUEUE_PEEK_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-PEEK-METHOD");

    private static final SubLSymbol BASIC_DOUBLY_LINKED_QUEUE_REORDER_CONTENTS_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-REORDER-CONTENTS-METHOD");

    private static final SubLSymbol BASIC_DOUBLY_LINKED_QUEUE_CLEAR_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-CLEAR-METHOD");

    private static final SubLSymbol BASIC_DOUBLY_LINKED_QUEUE_SET_CONTENTS_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-SET-CONTENTS-METHOD");

    private static final SubLSymbol BASIC_DOUBLY_LINKED_QUEUE_GET_CONTENTS_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-GET-CONTENTS-METHOD");

    private static final SubLSymbol BASIC_DOUBLY_LINKED_QUEUE_GET_ELEMENT_COUNT_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-GET-ELEMENT-COUNT-METHOD");

    private static final SubLSymbol BASIC_DOUBLY_LINKED_QUEUE_FIND_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-FIND-METHOD");

    private static final SubLSymbol BASIC_DOUBLY_LINKED_QUEUE_DEQUEUE_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-DEQUEUE-METHOD");

    private static final SubLSymbol BASIC_DOUBLY_LINKED_QUEUE_REMOVE_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-REMOVE-METHOD");

    private static final SubLSymbol BASIC_DOUBLY_LINKED_QUEUE_ON_ENQUEUE_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-ON-ENQUEUE-METHOD");

    private static final SubLSymbol BASIC_DOUBLY_LINKED_QUEUE_ENQUEUE_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-ENQUEUE-METHOD");

    private static final SubLSymbol BASIC_DOUBLY_LINKED_QUEUE_EMPTY_P_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-EMPTY-P-METHOD");

    private static final SubLSymbol BASIC_DOUBLY_LINKED_QUEUE_SET_PRIORITIZER_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-SET-PRIORITIZER-METHOD");

    private static final SubLSymbol BASIC_DOUBLY_LINKED_QUEUE_GET_PRIORITIZER_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-GET-PRIORITIZER-METHOD");

    static private final SubLString $str214$DL_QUEUE___ = makeString("DL-QUEUE:{}");

    static private final SubLString $str215$___S_Class_is_not_correctly_imple = makeString("#<~S Class is not correctly implemented.  ALLOCATE-ENUMERATOR failed.>");

    static private final SubLString $str216$DL_QUEUE___S = makeString("DL-QUEUE:{~S");

    private static final SubLSymbol BASIC_DOUBLY_LINKED_QUEUE_PRINT_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-PRINT-METHOD");

    private static final SubLSymbol BASIC_DOUBLY_LINKED_QUEUE_GET_LIST_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-GET-LIST-METHOD");

    static private final SubLSymbol $sym221$BASIC_DOUBLY_LINKED_QUEUE_INITIALIZE_QUA_DOUBLY_LINKED_QUEUE_METH = makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-INITIALIZE-QUA-DOUBLY-LINKED-QUEUE-METHOD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_BASIC_DOUBLY_LINKED_QUEUE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-DOUBLY-LINKED-QUEUE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_BASIC_DOUBLY_LINKED_QUEUE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-DOUBLY-LINKED-QUEUE-INSTANCE");

    static private final SubLList $list225 = list(list(RET, makeSymbol("LIST")));

    static private final SubLSymbol $sym226$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-QUEUE-METHOD");

    private static final SubLSymbol BASIC_DOUBLY_LINKED_QUEUE_GET_LIST_INTERNAL_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-GET-LIST-INTERNAL-METHOD");

    static private final SubLList $list229 = list(makeSymbol("NEW-LIST"));

    static private final SubLList $list230 = list(list(makeSymbol("CSETQ"), makeSymbol("LIST"), makeSymbol("NEW-LIST")), list(RET, makeSymbol("NEW-LIST")));

    static private final SubLSymbol $sym231$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-QUEUE-METHOD");

    private static final SubLSymbol BASIC_DOUBLY_LINKED_QUEUE_SET_LIST_INTERNAL_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-SET-LIST-INTERNAL-METHOD");

    static private final SubLSymbol $sym234$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-QUEUE-METHOD");

    private static final SubLSymbol BASIC_DOUBLY_LINKED_QUEUE_GET_PRIORITIZER_INTERNAL_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-GET-PRIORITIZER-INTERNAL-METHOD");

    static private final SubLList $list237 = list(list(makeSymbol("CSETQ"), makeSymbol("PRIORITIZER"), makeSymbol("NEW-PRIORITIZER")), list(RET, makeSymbol("NEW-PRIORITIZER")));

    static private final SubLSymbol $sym238$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-QUEUE-METHOD");

    private static final SubLSymbol BASIC_DOUBLY_LINKED_QUEUE_SET_PRIORITIZER_INTERNAL_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-SET-PRIORITIZER-INTERNAL-METHOD");

    static private final SubLList $list240 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("INITIALIZE-QUA-DOUBLY-LINKED-QUEUE"), makeSymbol("SELF")), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol BASIC_DOUBLY_LINKED_QUEUE_INITIALIZE_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-INITIALIZE-METHOD");

    private static final SubLSymbol BASIC_DOUBLY_LINKED_QUEUE_PASSIVE_P_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-PASSIVE-P-METHOD");

    static private final SubLSymbol $sym243$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-QUEUE-METHOD");

    private static final SubLSymbol BASIC_DOUBLY_LINKED_QUEUE_SET_PASSIVE_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-SET-PASSIVE-METHOD");

    static private final SubLList $list246 = list(new SubLObject[]{ list(makeSymbol("LOCK"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("LOCK-HISTORY"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PRIORITIZER"), list(makeSymbol("NEW-PRIORITIZER")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ENQUEUE"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-ENQUEUE"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE"), list(makeSymbol("OLD-ELEMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEQUEUE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CONTENTS"), list(makeSymbol("NEW-CONTENTS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEAR"), NIL, makeKeyword("PUBLIC")) });

    static private final SubLSymbol $sym248$SUBLOOP_RESERVED_INITIALIZE_ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_CLAS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-CLASS");

    static private final SubLSymbol $sym250$SUBLOOP_RESERVED_INITIALIZE_ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_INST = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-INSTANCE");

    static private final SubLList $list251 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("LOCK"), list(makeSymbol("MAKE-LOCK"), list(makeSymbol("FORMAT"), NIL, makeString("~S"), makeSymbol("SELF")))), list(makeSymbol("CSETQ"), makeSymbol("LOCK-HISTORY"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym252$OUTER_CATCH_FOR_ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-METHOD");

    static private final SubLString $str253$_S = makeString("~S");

    private static final SubLSymbol ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_INITIALIZE_METHOD = makeSymbol("ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-INITIALIZE-METHOD");

    static private final SubLList $list255 = list(makeKeyword("NO-MEMBER-VARIABLES"), makeKeyword("PUBLIC"));

    static private final SubLList $list256 = list(list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"), NIL), list(makeSymbol("LOCK"), list(makeSymbol("GET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK"), makeSymbol("SELF")))), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("SET-PRIORITIZER"), makeSymbol("SUPER"), makeSymbol("NEW-PRIORITIZER")))), list(RET, makeSymbol("RESULT"))));

    private static final SubLSymbol ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_SET_PRIORITIZER_METHOD = makeSymbol("ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-SET-PRIORITIZER-METHOD");

    static private final SubLList $list258 = list(list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"), NIL), list(makeSymbol("LOCK"), list(makeSymbol("GET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK"), makeSymbol("SELF"))), list(makeSymbol("LOCK-HISTORY"), list(makeSymbol("GET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK-HISTORY"), makeSymbol("SELF")))), list(makeSymbol("CPUSH"), list(makeSymbol("LIST"), makeKeyword("WAITING"), makeKeyword("ENQUEUE"), makeSymbol("NEW-ELEMENT")), makeSymbol("LOCK-HISTORY")), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("CPUSH"), list(makeSymbol("LIST"), makeKeyword("LOCKED"), makeKeyword("ENQUEUE"), makeSymbol("NEW-ELEMENT")), makeSymbol("LOCK-HISTORY")), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("ENQUEUE"), makeSymbol("SUPER"), makeSymbol("NEW-ELEMENT"))), list(makeSymbol("CPUSH"), list(makeSymbol("LIST"), makeKeyword("UNLOCKED"), makeKeyword("ENQUEUE"), makeSymbol("NEW-ELEMENT")), makeSymbol("LOCK-HISTORY"))), list(makeSymbol("SET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK-HISTORY"), makeSymbol("SELF"), makeSymbol("LOCK-HISTORY")), list(RET, makeSymbol("RESULT"))));

    private static final SubLSymbol ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_ENQUEUE_METHOD = makeSymbol("ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-ENQUEUE-METHOD");

    private static final SubLSymbol ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_ON_ENQUEUE_METHOD = makeSymbol("ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-ON-ENQUEUE-METHOD");

    static private final SubLList $list265 = list(list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"), NIL), list(makeSymbol("LOCK"), list(makeSymbol("GET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK"), makeSymbol("SELF"))), list(makeSymbol("LOCK-HISTORY"), list(makeSymbol("GET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK-HISTORY"), makeSymbol("SELF")))), list(makeSymbol("CPUSH"), list(makeSymbol("LIST"), makeKeyword("WAITING"), makeKeyword("REMOVE"), makeSymbol("OLD-ELEMENT")), makeSymbol("LOCK-HISTORY")), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("CPUSH"), list(makeSymbol("LIST"), makeKeyword("LOCKED"), makeKeyword("REMOVE"), makeSymbol("OLD-ELEMENT")), makeSymbol("LOCK-HISTORY")), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("REMOVE"), makeSymbol("SUPER"), makeSymbol("OLD-ELEMENT"))), list(makeSymbol("CPUSH"), list(makeSymbol("LIST"), makeKeyword("UNLOCKED"), makeKeyword("REMOVE"), makeSymbol("OLD-ELEMENT")), makeSymbol("LOCK-HISTORY")), list(makeSymbol("SET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK-HISTORY"), makeSymbol("SELF"), makeSymbol("LOCK-HISTORY"))), list(makeSymbol("SET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK-HISTORY"), makeSymbol("SELF"), makeSymbol("LOCK-HISTORY")), list(RET, makeSymbol("RESULT"))));

    private static final SubLSymbol ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_REMOVE_METHOD = makeSymbol("ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-REMOVE-METHOD");

    static private final SubLList $list268 = list(list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"), NIL), list(makeSymbol("LOCK"), list(makeSymbol("GET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK"), makeSymbol("SELF"))), list(makeSymbol("LOCK-HISTORY"), list(makeSymbol("GET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK-HISTORY"), makeSymbol("SELF")))), list(makeSymbol("CPUSH"), list(makeSymbol("LIST"), makeKeyword("WAITING"), makeKeyword("DEQUEUE")), makeSymbol("LOCK-HISTORY")), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("CPUSH"), list(makeSymbol("LIST"), makeKeyword("LOCKED"), makeKeyword("DEQUEUE")), makeSymbol("LOCK-HISTORY")), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("DEQUEUE"), makeSymbol("SUPER"))), list(makeSymbol("CPUSH"), list(makeSymbol("LIST"), makeKeyword("UNLOCKED"), makeKeyword("DEQUEUE"), makeSymbol("RESULT")), makeSymbol("LOCK-HISTORY"))), list(makeSymbol("SET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK-HISTORY"), makeSymbol("SELF"), makeSymbol("LOCK-HISTORY")), list(RET, makeSymbol("RESULT"))));

    private static final SubLSymbol ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_DEQUEUE_METHOD = makeSymbol("ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-DEQUEUE-METHOD");

    static private final SubLList $list271 = list(list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"), NIL), list(makeSymbol("LOCK"), list(makeSymbol("GET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK"), makeSymbol("SELF"))), list(makeSymbol("LOCK-HISTORY"), list(makeSymbol("GET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK-HISTORY"), makeSymbol("SELF")))), list(makeSymbol("CPUSH"), list(makeSymbol("LIST"), makeKeyword("WAITING"), makeKeyword("SET-CONTENTS"), makeSymbol("NEW-CONTENTS")), makeSymbol("LOCK-HISTORY")), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("CPUSH"), list(makeSymbol("LIST"), makeKeyword("LOCKED"), makeKeyword("SET-CONTENTS"), makeSymbol("NEW-CONTENTS")), makeSymbol("LOCK-HISTORY")), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("SET-CONTENTS"), makeSymbol("SUPER"), makeSymbol("NEW-CONTENTS"))), list(makeSymbol("CPUSH"), list(makeSymbol("LIST"), makeKeyword("UNLOCKED"), makeKeyword("SET-CONTENTS"), makeSymbol("RESULT")), makeSymbol("LOCK-HISTORY"))), list(makeSymbol("SET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK-HISTORY"), makeSymbol("SELF"), makeSymbol("LOCK-HISTORY")), list(RET, makeSymbol("RESULT"))));

    private static final SubLSymbol ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_SET_CONTENTS_METHOD = makeSymbol("ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-SET-CONTENTS-METHOD");

    static private final SubLList $list274 = list(list(makeSymbol("CLET"), list(list(makeSymbol("LOCK"), list(makeSymbol("GET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK"), makeSymbol("SELF"))), list(makeSymbol("LOCK-HISTORY"), list(makeSymbol("GET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK-HISTORY"), makeSymbol("SELF")))), list(makeSymbol("CPUSH"), list(makeSymbol("LIST"), makeKeyword("WAITING"), makeKeyword("CLEAR")), makeSymbol("LOCK-HISTORY")), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("CPUSH"), list(makeSymbol("LIST"), makeKeyword("LOCKED"), makeKeyword("CLEAR")), makeSymbol("LOCK-HISTORY")), list(makeSymbol("CLEAR"), makeSymbol("SUPER")), list(makeSymbol("CPUSH"), list(makeSymbol("LIST"), makeKeyword("UNLOCKED"), makeKeyword("CLEAR")), makeSymbol("LOCK-HISTORY"))), list(makeSymbol("SET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK-HISTORY"), makeSymbol("SELF"), makeSymbol("LOCK-HISTORY")), list(RET, NIL)));

    private static final SubLSymbol ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_CLEAR_METHOD = makeSymbol("ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-CLEAR-METHOD");

    private static final SubLSymbol BASIC_DOUBLY_LINKED_IPC_QUEUE = makeSymbol("BASIC-DOUBLY-LINKED-IPC-QUEUE");

    static private final SubLList $list278 = list(new SubLObject[]{ list(makeSymbol("BASE-NAME"), makeKeyword("CLASS"), makeKeyword("PROTECTED"), makeKeyword("VALUE"), makeString("BASIC-DOUBLY-LINKED-IPC-QUEUE")), list(makeSymbol("BASE-SUFFIX-COUNTER"), makeKeyword("CLASS"), makeKeyword("PROTECTED"), makeKeyword("VALUE"), ZERO_INTEGER), list(makeSymbol("SEMAPHORE-NAME"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("LOCK"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("SEMAPHORE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PRIORITIZER"), list(makeSymbol("NEW-PRIORITIZER")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ENQUEUE"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE"), list(makeSymbol("OLD-ELEMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEQUEUE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CONTENTS"), list(makeSymbol("NEW-CONTENTS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEAR"), NIL, makeKeyword("PUBLIC")) });

    static private final SubLString $str283$BASIC_DOUBLY_LINKED_IPC_QUEUE = makeString("BASIC-DOUBLY-LINKED-IPC-QUEUE");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_BASIC_DOUBLY_LINKED_IPC_QUEUE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-DOUBLY-LINKED-IPC-QUEUE-CLASS");

    static private final SubLSymbol $sym285$SUBLOOP_RESERVED_INITIALIZE_BASIC_DOUBLY_LINKED_IPC_QUEUE_INSTANC = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-DOUBLY-LINKED-IPC-QUEUE-INSTANCE");

    static private final SubLList $list286 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("SEMAPHORE-NAME"), list(makeSymbol("FORMAT"), NIL, makeString("~A-~S"), makeSymbol("BASE-NAME"), makeSymbol("BASE-SUFFIX-COUNTER"))), list(makeSymbol("CINC"), makeSymbol("BASE-SUFFIX-COUNTER")), list(makeSymbol("CSETQ"), makeSymbol("LOCK"), list(makeSymbol("CCONCATENATE"), makeString("Lock for Queue "), makeSymbol("SEMAPHORE-NAME"))), list(makeSymbol("CSETQ"), makeSymbol("SEMAPHORE"), list(makeSymbol("NEW-SEMAPHORE"), makeSymbol("SEMAPHORE-NAME"), ZERO_INTEGER)), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym287$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-IPC-QUEUE-METHOD");

    static private final SubLString $str288$_A__S = makeString("~A-~S");

    static private final SubLString $$$Lock_for_Queue_ = makeString("Lock for Queue ");

    private static final SubLSymbol BASIC_DOUBLY_LINKED_IPC_QUEUE_INITIALIZE_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-IPC-QUEUE-INITIALIZE-METHOD");

    static private final SubLList $list291 = list(list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"), NIL)), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("SET-PRIORITIZER"), makeSymbol("SUPER"), makeSymbol("NEW-PRIORITIZER")))), list(RET, makeSymbol("RESULT"))));

    static private final SubLSymbol $sym292$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-IPC-QUEUE-METHOD");

    private static final SubLSymbol BASIC_DOUBLY_LINKED_IPC_QUEUE_SET_PRIORITIZER_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-IPC-QUEUE-SET-PRIORITIZER-METHOD");

    static private final SubLList $list294 = list(list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"), NIL)), list(makeSymbol("V-SEMAPHORE"), makeSymbol("SEMAPHORE")), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("ENQUEUE"), makeSymbol("SUPER"), makeSymbol("NEW-ELEMENT")))), list(RET, makeSymbol("RESULT"))));

    static private final SubLSymbol $sym295$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-IPC-QUEUE-METHOD");

    private static final SubLSymbol BASIC_DOUBLY_LINKED_IPC_QUEUE_ENQUEUE_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-IPC-QUEUE-ENQUEUE-METHOD");

    static private final SubLList $list297 = list(list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"), NIL)), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("REMOVE"), makeSymbol("SUPER"), makeSymbol("OLD-ELEMENT")))), list(makeSymbol("P-SEMAPHORE"), makeSymbol("SEMAPHORE")), list(RET, makeSymbol("RESULT"))));

    static private final SubLSymbol $sym298$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-IPC-QUEUE-METHOD");

    private static final SubLSymbol BASIC_DOUBLY_LINKED_IPC_QUEUE_REMOVE_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-IPC-QUEUE-REMOVE-METHOD");

    static private final SubLList $list300 = list(list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"), NIL)), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("DEQUEUE"), makeSymbol("SUPER")))), list(makeSymbol("P-SEMAPHORE"), makeSymbol("SEMAPHORE")), list(RET, makeSymbol("RESULT"))));

    static private final SubLSymbol $sym301$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-IPC-QUEUE-METHOD");

    private static final SubLSymbol BASIC_DOUBLY_LINKED_IPC_QUEUE_DEQUEUE_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-IPC-QUEUE-DEQUEUE-METHOD");

    static private final SubLList $list303 = list(list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"), NIL)), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("SET-CONTENTS"), makeSymbol("SUPER"), makeSymbol("NEW-CONTENTS")))), list(RET, makeSymbol("RESULT"))));

    static private final SubLSymbol $sym304$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-IPC-QUEUE-METHOD");

    private static final SubLSymbol BASIC_DOUBLY_LINKED_IPC_QUEUE_SET_CONTENTS_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-IPC-QUEUE-SET-CONTENTS-METHOD");

    static private final SubLList $list306 = list(list(makeSymbol("WHILE"), list(makeSymbol("CNOT"), list(makeSymbol("EMPTY-P"), makeSymbol("SELF"))), list(makeSymbol("P-SEMAPHORE"), makeSymbol("SEMAPHORE")), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("DEQUEUE"), makeSymbol("SELF")))), list(RET, NIL));

    static private final SubLSymbol $sym307$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-IPC-QUEUE-METHOD");

    private static final SubLSymbol BASIC_DOUBLY_LINKED_IPC_QUEUE_CLEAR_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-IPC-QUEUE-CLEAR-METHOD");

    private static final SubLSymbol BASIC_IPC_QUEUE = makeSymbol("BASIC-IPC-QUEUE");

    static private final SubLList $list310 = list(new SubLObject[]{ list(makeSymbol("ACTUAL-IPC-QUEUE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("PRIORITIZER"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("IS-PASSIVE"), makeKeyword("BOOLEAN"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ACTUAL-IPC-QUEUE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ACTUAL-IPC-QUEUE"), list(makeSymbol("NEW-QUEUE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PRIORITIZER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PRIORITIZER"), list(makeSymbol("NEW-PRIORITIZER")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EMPTY-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ENQUEUE"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE"), list(makeSymbol("OLD-ELEMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEQUEUE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ELEMENT-COUNT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONTENTS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CONTENTS"), list(makeSymbol("NEW-CONTENTS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEAR"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REORDER-CONTENTS"), list(makeSymbol("ORDERED-CONTENTS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PEEK"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ENQUEUED-P"), list(makeSymbol("OBJECT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FIND"), list(makeSymbol("KEY-VALUE"), makeSymbol("&OPTIONAL"), list(makeSymbol("EQUALITY-PRED"), list(makeSymbol("FUNCTION"), EQL)), list(makeSymbol("KEY-ACCESSOR-FUNCTION"), list(makeSymbol("FUNCTION"), IDENTITY))), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PASSIVE-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PASSIVE"), list(makeSymbol("FLAG")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-ENQUEUE"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")) });

    private static final SubLSymbol BASIC_IPC_QUEUE_ON_ENQUEUE_METHOD = makeSymbol("BASIC-IPC-QUEUE-ON-ENQUEUE-METHOD");

    private static final SubLSymbol BASIC_IPC_QUEUE_PRINT_METHOD = makeSymbol("BASIC-IPC-QUEUE-PRINT-METHOD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_BASIC_IPC_QUEUE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-IPC-QUEUE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_BASIC_IPC_QUEUE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-IPC-QUEUE-INSTANCE");

    static private final SubLList $list316 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("ACTUAL-IPC-QUEUE"), list(makeSymbol("NEW-IPC-QUEUE"), list(makeSymbol("FORMAT-TO-STRING"), makeKeyword("A"), makeString("BASIC-IPC-QUEUE-"), makeKeyword("D"), makeSymbol("INSTANCE-NUMBER")))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym317$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-IPC-QUEUE-METHOD");

    static private final SubLString $str318$BASIC_IPC_QUEUE_ = makeString("BASIC-IPC-QUEUE-");

    private static final SubLSymbol BASIC_IPC_QUEUE_INITIALIZE_METHOD = makeSymbol("BASIC-IPC-QUEUE-INITIALIZE-METHOD");

    private static final SubLSymbol GET_ACTUAL_IPC_QUEUE = makeSymbol("GET-ACTUAL-IPC-QUEUE");

    static private final SubLList $list321 = list(list(RET, makeSymbol("ACTUAL-IPC-QUEUE")));

    private static final SubLSymbol BASIC_IPC_QUEUE_GET_ACTUAL_IPC_QUEUE_METHOD = makeSymbol("BASIC-IPC-QUEUE-GET-ACTUAL-IPC-QUEUE-METHOD");

    private static final SubLSymbol SET_ACTUAL_IPC_QUEUE = makeSymbol("SET-ACTUAL-IPC-QUEUE");

    static private final SubLList $list324 = list(makeSymbol("NEW-QUEUE"));

    static private final SubLList $list325 = list(list(makeSymbol("MUST"), list(makeSymbol("IPC-QUEUE-P"), makeSymbol("NEW-QUEUE")), makeString("(SET-ACTUAL-IPC-QUEUE ~S): ~S is not an instance of the IPC-QUEUE struct."), makeSymbol("SELF"), makeSymbol("NEW-QUEUE")), list(makeSymbol("CSETQ"), makeSymbol("ACTUAL-IPC-QUEUE"), makeSymbol("NEW-QUEUE")), list(RET, makeSymbol("NEW-QUEUE")));

    static private final SubLSymbol $sym326$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-IPC-QUEUE-METHOD");

    static private final SubLString $str327$_SET_ACTUAL_IPC_QUEUE__S____S_is_ = makeString("(SET-ACTUAL-IPC-QUEUE ~S): ~S is not an instance of the IPC-QUEUE struct.");

    private static final SubLSymbol BASIC_IPC_QUEUE_SET_ACTUAL_IPC_QUEUE_METHOD = makeSymbol("BASIC-IPC-QUEUE-SET-ACTUAL-IPC-QUEUE-METHOD");

    static private final SubLSymbol $sym329$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-IPC-QUEUE-METHOD");

    private static final SubLSymbol BASIC_IPC_QUEUE_GET_PRIORITIZER_METHOD = makeSymbol("BASIC-IPC-QUEUE-GET-PRIORITIZER-METHOD");

    static private final SubLSymbol $sym331$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-IPC-QUEUE-METHOD");

    private static final SubLSymbol BASIC_IPC_QUEUE_SET_PRIORITIZER_METHOD = makeSymbol("BASIC-IPC-QUEUE-SET-PRIORITIZER-METHOD");

    static private final SubLList $list333 = list(list(RET, list(makeSymbol("ZEROP"), list(makeSymbol("IPC-CURRENT-QUEUE-SIZE"), makeSymbol("ACTUAL-IPC-QUEUE")))));

    private static final SubLSymbol BASIC_IPC_QUEUE_EMPTY_P_METHOD = makeSymbol("BASIC-IPC-QUEUE-EMPTY-P-METHOD");

    static private final SubLList $list335 = list(list(makeSymbol("IPC-ENQUEUE"), makeSymbol("NEW-ELEMENT"), makeSymbol("ACTUAL-IPC-QUEUE")), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), makeSymbol("IS-PASSIVE")), list(makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), makeSymbol("NEW-ELEMENT"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("NEW-ELEMENT"), list(QUOTE, makeSymbol("ENQUEUE-NOTIFY")), makeSymbol("SELF"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ON-ENQUEUE")), makeSymbol("NEW-ELEMENT")), list(RET, makeSymbol("NEW-ELEMENT")));

    private static final SubLSymbol BASIC_IPC_QUEUE_ENQUEUE_METHOD = makeSymbol("BASIC-IPC-QUEUE-ENQUEUE-METHOD");

    static private final SubLList $list337 = list(list(makeSymbol("ERROR"), makeString("Invalid operation: Cannot remove arbitrary item from IPC queue.")), list(RET, makeSymbol("OLD-ELEMENT")));

    static private final SubLString $str338$Invalid_operation__Cannot_remove_ = makeString("Invalid operation: Cannot remove arbitrary item from IPC queue.");

    private static final SubLSymbol BASIC_IPC_QUEUE_REMOVE_METHOD = makeSymbol("BASIC-IPC-QUEUE-REMOVE-METHOD");

    static private final SubLList $list340 = list(list(makeSymbol("CLET"), list(list(makeSymbol("DEQUEUED-ITEM"), list(makeSymbol("IPC-DEQUEUE"), makeSymbol("ACTUAL-IPC-QUEUE")))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), makeSymbol("IS-PASSIVE")), list(makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), makeSymbol("DEQUEUED-ITEM"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("DEQUEUED-ITEM"), list(QUOTE, makeSymbol("DEQUEUE-NOTIFY")), makeSymbol("SELF"))), list(RET, makeSymbol("DEQUEUED-ITEM"))));

    static private final SubLSymbol $sym341$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-IPC-QUEUE-METHOD");

    private static final SubLSymbol BASIC_IPC_QUEUE_DEQUEUE_METHOD = makeSymbol("BASIC-IPC-QUEUE-DEQUEUE-METHOD");

    static private final SubLList $list343 = list(list(RET, list(makeSymbol("IPC-CURRENT-QUEUE-SIZE"), makeSymbol("ACTUAL-IPC-QUEUE"))));

    static private final SubLSymbol $sym344$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-IPC-QUEUE-METHOD");

    private static final SubLSymbol BASIC_IPC_QUEUE_GET_ELEMENT_COUNT_METHOD = makeSymbol("BASIC-IPC-QUEUE-GET-ELEMENT-COUNT-METHOD");

    static private final SubLList $list346 = list(list(RET, list(makeSymbol("IPC-CURRENT-QUEUE-CONTENT"), makeSymbol("ACTUAL-IPC-QUEUE"))));

    private static final SubLSymbol BASIC_IPC_QUEUE_GET_CONTENTS_METHOD = makeSymbol("BASIC-IPC-QUEUE-GET-CONTENTS-METHOD");

    static private final SubLList $list348 = list(list(makeSymbol("MUST"), list(makeSymbol("LISTP"), makeSymbol("NEW-CONTENTS")), makeString("(SET-CONTENTS ~S): ~S is not a valid list."), makeSymbol("SELF")), list(makeSymbol("CLEAR"), makeSymbol("SELF")), list(makeSymbol("CDOLIST"), list(makeSymbol("ELEMENT"), makeSymbol("NEW-CONTENTS")), list(makeSymbol("ENQUEUE"), makeSymbol("SELF"), makeSymbol("ELEMENT"))), list(RET, makeSymbol("NEW-CONTENTS")));

    static private final SubLString $str349$_SET_CONTENTS__S____S_is_not_a_va = makeString("(SET-CONTENTS ~S): ~S is not a valid list.");

    private static final SubLSymbol BASIC_IPC_QUEUE_SET_CONTENTS_METHOD = makeSymbol("BASIC-IPC-QUEUE-SET-CONTENTS-METHOD");

    static private final SubLList $list351 = list(list(makeSymbol("CLET"), list(list(makeSymbol("ELEMENT-COUNT"), list(makeSymbol("GET-ELEMENT-COUNT"), makeSymbol("SELF")))), list(makeSymbol("CDOTIMES"), list(makeSymbol("I"), makeSymbol("ELEMENT-COUNT")), list(makeSymbol("DEQUEUE"), makeSymbol("SELF")))), list(RET, NIL));

    private static final SubLSymbol BASIC_IPC_QUEUE_CLEAR_METHOD = makeSymbol("BASIC-IPC-QUEUE-CLEAR-METHOD");

    static private final SubLList $list353 = list(list(RET, makeSymbol("ORDERED-CONTENTS")));

    private static final SubLSymbol BASIC_IPC_QUEUE_REORDER_CONTENTS_METHOD = makeSymbol("BASIC-IPC-QUEUE-REORDER-CONTENTS-METHOD");

    static private final SubLList $list355 = list(list(RET, list(makeSymbol("FIRST"), list(makeSymbol("IPC-CURRENT-QUEUE-CONTENT"), makeSymbol("ACTUAL-IPC-QUEUE")))));

    static private final SubLSymbol $sym356$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-IPC-QUEUE-METHOD");

    private static final SubLSymbol BASIC_IPC_QUEUE_PEEK_METHOD = makeSymbol("BASIC-IPC-QUEUE-PEEK-METHOD");

    static private final SubLList $list358 = list(list(RET, list(makeSymbol("FIF"), list(makeSymbol("FIND"), makeSymbol("OBJECT"), list(makeSymbol("IPC-CURRENT-QUEUE-CONTENT"), makeSymbol("ACTUAL-IPC-QUEUE"))), T, NIL)));

    static private final SubLSymbol $sym359$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-IPC-QUEUE-METHOD");

    private static final SubLSymbol BASIC_IPC_QUEUE_ENQUEUED_P_METHOD = makeSymbol("BASIC-IPC-QUEUE-ENQUEUED-P-METHOD");

    static private final SubLList $list361 = list(list(RET, list(makeSymbol("FIND"), makeSymbol("KEY-VALUE"), list(makeSymbol("IPC-CURRENT-QUEUE-CONTENT"), makeSymbol("ACTUAL-IPC-QUEUE")), makeSymbol("EQUALITY-PRED"), makeSymbol("KEY-ACCESSOR-FUNCTION"))));

    static private final SubLSymbol $sym362$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-IPC-QUEUE-METHOD");

    private static final SubLSymbol BASIC_IPC_QUEUE_FIND_METHOD = makeSymbol("BASIC-IPC-QUEUE-FIND-METHOD");

    private static final SubLSymbol BASIC_IPC_QUEUE_PASSIVE_P_METHOD = makeSymbol("BASIC-IPC-QUEUE-PASSIVE-P-METHOD");

    static private final SubLSymbol $sym365$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-IPC-QUEUE-METHOD");

    private static final SubLSymbol BASIC_IPC_QUEUE_SET_PASSIVE_METHOD = makeSymbol("BASIC-IPC-QUEUE-SET-PASSIVE-METHOD");

    static private final SubLString $str367$QUEUE_INTERFACE_GET_PRIORITIZER__ = makeString("QUEUE-INTERFACE-GET-PRIORITIZER: ~S is not an instance of QUEUE-INTERFACE.");

    static private final SubLString $str368$QUEUE_INTERFACE_SET_PRIORITIZER__ = makeString("QUEUE-INTERFACE-SET-PRIORITIZER: ~S is not an instance of QUEUE-INTERFACE.");

    static private final SubLString $str369$QUEUE_INTERFACE_EMPTY_P___S_is_no = makeString("QUEUE-INTERFACE-EMPTY-P: ~S is not an instance of QUEUE-INTERFACE.");

    static private final SubLString $str370$QUEUE_INTERFACE_ENQUEUE___S_is_no = makeString("QUEUE-INTERFACE-ENQUEUE: ~S is not an instance of QUEUE-INTERFACE.");

    static private final SubLString $str371$QUEUE_INTERFACE_REMOVE___S_is_not = makeString("QUEUE-INTERFACE-REMOVE: ~S is not an instance of QUEUE-INTERFACE.");

    static private final SubLString $str372$QUEUE_INTERFACE_DEQUEUE___S_is_no = makeString("QUEUE-INTERFACE-DEQUEUE: ~S is not an instance of QUEUE-INTERFACE.");

    static private final SubLString $str373$QUEUE_INTERFACE_GET_ELEMENT_COUNT = makeString("QUEUE-INTERFACE-GET-ELEMENT-COUNT: ~S is not an instance of QUEUE-INTERFACE.");

    static private final SubLString $str374$QUEUE_INTERFACE_GET_CONTENTS___S_ = makeString("QUEUE-INTERFACE-GET-CONTENTS: ~S is not an instance of QUEUE-INTERFACE.");

    static private final SubLString $str375$QUEUE_INTERFACE_SET_CONTENTS___S_ = makeString("QUEUE-INTERFACE-SET-CONTENTS: ~S is not an instance of QUEUE-INTERFACE.");

    static private final SubLString $str376$QUEUE_INTERFACE_CLEAR___S_is_not_ = makeString("QUEUE-INTERFACE-CLEAR: ~S is not an instance of QUEUE-INTERFACE.");

    static private final SubLString $str377$QUEUE_INTERFACE_REORDER_CONTENTS_ = makeString("QUEUE-INTERFACE-REORDER-CONTENTS: ~S is not an instance of QUEUE-INTERFACE.");

    // Definitions
    public static final SubLObject queue_element_interface_p_alt(SubLObject queue_element_interface) {
        return interfaces.subloop_instanceof_interface(queue_element_interface, QUEUE_ELEMENT_INTERFACE);
    }

    // Definitions
    public static SubLObject queue_element_interface_p(final SubLObject queue_element_interface) {
        return interfaces.subloop_instanceof_interface(queue_element_interface, subloop_queues.QUEUE_ELEMENT_INTERFACE);
    }

    public static final SubLObject queue_prioritizer_interface_p_alt(SubLObject queue_prioritizer_interface) {
        return interfaces.subloop_instanceof_interface(queue_prioritizer_interface, QUEUE_PRIORITIZER_INTERFACE);
    }

    public static SubLObject queue_prioritizer_interface_p(final SubLObject queue_prioritizer_interface) {
        return interfaces.subloop_instanceof_interface(queue_prioritizer_interface, subloop_queues.QUEUE_PRIORITIZER_INTERFACE);
    }

    public static final SubLObject queue_prioritizer_template_p_alt(SubLObject queue_prioritizer_template) {
        return interfaces.subloop_instanceof_interface(queue_prioritizer_template, QUEUE_PRIORITIZER_TEMPLATE);
    }

    public static SubLObject queue_prioritizer_template_p(final SubLObject queue_prioritizer_template) {
        return interfaces.subloop_instanceof_interface(queue_prioritizer_template, subloop_queues.QUEUE_PRIORITIZER_TEMPLATE);
    }

    public static final SubLObject queue_simple_sorter_template_p_alt(SubLObject queue_simple_sorter_template) {
        return interfaces.subloop_instanceof_interface(queue_simple_sorter_template, QUEUE_SIMPLE_SORTER_TEMPLATE);
    }

    public static SubLObject queue_simple_sorter_template_p(final SubLObject queue_simple_sorter_template) {
        return interfaces.subloop_instanceof_interface(queue_simple_sorter_template, subloop_queues.QUEUE_SIMPLE_SORTER_TEMPLATE);
    }

    public static final SubLObject get_basic_queue_simple_sorter_element_key_function_alt(SubLObject basic_queue_simple_sorter) {
        return classes.subloop_get_access_protected_instance_slot(basic_queue_simple_sorter, TWO_INTEGER, ELEMENT_KEY_FUNCTION);
    }

    public static SubLObject get_basic_queue_simple_sorter_element_key_function(final SubLObject basic_queue_simple_sorter) {
        return classes.subloop_get_access_protected_instance_slot(basic_queue_simple_sorter, TWO_INTEGER, subloop_queues.ELEMENT_KEY_FUNCTION);
    }

    public static final SubLObject set_basic_queue_simple_sorter_element_key_function_alt(SubLObject basic_queue_simple_sorter, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_queue_simple_sorter, value, TWO_INTEGER, ELEMENT_KEY_FUNCTION);
    }

    public static SubLObject set_basic_queue_simple_sorter_element_key_function(final SubLObject basic_queue_simple_sorter, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_queue_simple_sorter, value, TWO_INTEGER, subloop_queues.ELEMENT_KEY_FUNCTION);
    }

    public static final SubLObject get_basic_queue_simple_sorter_sort_predicate_alt(SubLObject basic_queue_simple_sorter) {
        return classes.subloop_get_access_protected_instance_slot(basic_queue_simple_sorter, ONE_INTEGER, SORT_PREDICATE);
    }

    public static SubLObject get_basic_queue_simple_sorter_sort_predicate(final SubLObject basic_queue_simple_sorter) {
        return classes.subloop_get_access_protected_instance_slot(basic_queue_simple_sorter, ONE_INTEGER, SORT_PREDICATE);
    }

    public static final SubLObject set_basic_queue_simple_sorter_sort_predicate_alt(SubLObject basic_queue_simple_sorter, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_queue_simple_sorter, value, ONE_INTEGER, SORT_PREDICATE);
    }

    public static SubLObject set_basic_queue_simple_sorter_sort_predicate(final SubLObject basic_queue_simple_sorter, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_queue_simple_sorter, value, ONE_INTEGER, SORT_PREDICATE);
    }

    public static final SubLObject basic_queue_simple_sorter_order_queue_internal_method_alt(SubLObject self, SubLObject contents) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject template_predicate = com.cyc.cycjava.cycl.subloop_queues.basic_queue_simple_sorter_get_sort_predicate_method(self);
                SubLObject template_key_function = com.cyc.cycjava.cycl.subloop_queues.basic_queue_simple_sorter_get_element_key_method(self);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == template_predicate) {
                        Errors.error($str_alt26$_ORDER_QUEUE_INTERNAL__S___No_ord, self);
                    }
                }
                if (NIL == template_key_function) {
                    template_key_function = symbol_function(IDENTITY);
                }
                return Sort.sort(contents, template_predicate, template_key_function);
            }
        }
    }

    public static SubLObject basic_queue_simple_sorter_order_queue_internal_method(final SubLObject self, final SubLObject contents) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject template_predicate = subloop_queues.basic_queue_simple_sorter_get_sort_predicate_method(self);
        SubLObject template_key_function = subloop_queues.basic_queue_simple_sorter_get_element_key_method(self);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == template_predicate)) {
            Errors.error(subloop_queues.$str26$_ORDER_QUEUE_INTERNAL__S___No_ord, self);
        }
        if (NIL == template_key_function) {
            template_key_function = symbol_function(IDENTITY);
        }
        return Sort.sort(contents, template_predicate, template_key_function);
    }

    public static final SubLObject basic_queue_simple_sorter_order_queue_method_alt(SubLObject self, SubLObject queue) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == com.cyc.cycjava.cycl.subloop_queues.queue_interface_p(queue)) {
                    Errors.error($str_alt28$_ORDER_QUEUE__S____S_is_not_an_in, self, queue);
                }
            }
            {
                SubLObject template_contents = com.cyc.cycjava.cycl.subloop_queues.queue_interface_get_contents(queue);
                if (NIL != template_contents) {
                    {
                        SubLObject template_contents_ordered = com.cyc.cycjava.cycl.subloop_queues.basic_queue_simple_sorter_order_queue_internal_method(self, template_contents);
                        com.cyc.cycjava.cycl.subloop_queues.queue_interface_reorder_contents(queue, template_contents_ordered);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject basic_queue_simple_sorter_order_queue_method(final SubLObject self, final SubLObject queue) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subloop_queues.queue_interface_p(queue))) {
            Errors.error(subloop_queues.$str28$_ORDER_QUEUE__S____S_is_not_an_in, self, queue);
        }
        final SubLObject template_contents = subloop_queues.queue_interface_get_contents(queue);
        if (NIL != template_contents) {
            final SubLObject template_contents_ordered = subloop_queues.basic_queue_simple_sorter_order_queue_internal_method(self, template_contents);
            subloop_queues.queue_interface_reorder_contents(queue, template_contents_ordered);
        }
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_basic_queue_simple_sorter_class_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_basic_queue_simple_sorter_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_basic_queue_simple_sorter_instance_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_QUEUE_SIMPLE_SORTER, SORT_PREDICATE, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_QUEUE_SIMPLE_SORTER, ELEMENT_KEY_FUNCTION, NIL);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_basic_queue_simple_sorter_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, subloop_queues.BASIC_QUEUE_SIMPLE_SORTER, SORT_PREDICATE, NIL);
        classes.subloop_initialize_slot(new_instance, subloop_queues.BASIC_QUEUE_SIMPLE_SORTER, subloop_queues.ELEMENT_KEY_FUNCTION, NIL);
        return NIL;
    }

    public static final SubLObject basic_queue_simple_sorter_p_alt(SubLObject basic_queue_simple_sorter) {
        return classes.subloop_instanceof_class(basic_queue_simple_sorter, BASIC_QUEUE_SIMPLE_SORTER);
    }

    public static SubLObject basic_queue_simple_sorter_p(final SubLObject basic_queue_simple_sorter) {
        return classes.subloop_instanceof_class(basic_queue_simple_sorter, subloop_queues.BASIC_QUEUE_SIMPLE_SORTER);
    }

    public static final SubLObject basic_queue_simple_sorter_initialize_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_basic_queue_simple_sorter_method = NIL;
            SubLObject element_key_function = com.cyc.cycjava.cycl.subloop_queues.get_basic_queue_simple_sorter_element_key_function(self);
            SubLObject sort_predicate = com.cyc.cycjava.cycl.subloop_queues.get_basic_queue_simple_sorter_sort_predicate(self);
            try {
                try {
                    object.object_initialize_method(self);
                    sort_predicate = NIL;
                    element_key_function = NIL;
                    sublisp_throw($sym37$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_queues.set_basic_queue_simple_sorter_element_key_function(self, element_key_function);
                            com.cyc.cycjava.cycl.subloop_queues.set_basic_queue_simple_sorter_sort_predicate(self, sort_predicate);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_basic_queue_simple_sorter_method = Errors.handleThrowable(ccatch_env_var, $sym37$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD);
            }
            return catch_var_for_basic_queue_simple_sorter_method;
        }
    }

    public static SubLObject basic_queue_simple_sorter_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_queue_simple_sorter_method = NIL;
        SubLObject element_key_function = subloop_queues.get_basic_queue_simple_sorter_element_key_function(self);
        SubLObject sort_predicate = subloop_queues.get_basic_queue_simple_sorter_sort_predicate(self);
        try {
            thread.throwStack.push(subloop_queues.$sym37$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD);
            try {
                object.object_initialize_method(self);
                sort_predicate = NIL;
                element_key_function = NIL;
                sublisp_throw(subloop_queues.$sym37$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    subloop_queues.set_basic_queue_simple_sorter_element_key_function(self, element_key_function);
                    subloop_queues.set_basic_queue_simple_sorter_sort_predicate(self, sort_predicate);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_queue_simple_sorter_method = Errors.handleThrowable(ccatch_env_var, subloop_queues.$sym37$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_queue_simple_sorter_method;
    }

    public static final SubLObject basic_queue_simple_sorter_get_sort_predicate_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_basic_queue_simple_sorter_method = NIL;
            SubLObject sort_predicate = com.cyc.cycjava.cycl.subloop_queues.get_basic_queue_simple_sorter_sort_predicate(self);
            try {
                try {
                    sublisp_throw($sym41$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD, sort_predicate);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_queues.set_basic_queue_simple_sorter_sort_predicate(self, sort_predicate);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_basic_queue_simple_sorter_method = Errors.handleThrowable(ccatch_env_var, $sym41$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD);
            }
            return catch_var_for_basic_queue_simple_sorter_method;
        }
    }

    public static SubLObject basic_queue_simple_sorter_get_sort_predicate_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_queue_simple_sorter_method = NIL;
        final SubLObject sort_predicate = subloop_queues.get_basic_queue_simple_sorter_sort_predicate(self);
        try {
            thread.throwStack.push(subloop_queues.$sym41$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD);
            try {
                sublisp_throw(subloop_queues.$sym41$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD, sort_predicate);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    subloop_queues.set_basic_queue_simple_sorter_sort_predicate(self, sort_predicate);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_queue_simple_sorter_method = Errors.handleThrowable(ccatch_env_var, subloop_queues.$sym41$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_queue_simple_sorter_method;
    }

    public static final SubLObject basic_queue_simple_sorter_set_sort_predicate_method_alt(SubLObject self, SubLObject new_predicate) {
        {
            SubLObject catch_var_for_basic_queue_simple_sorter_method = NIL;
            SubLObject sort_predicate = com.cyc.cycjava.cycl.subloop_queues.get_basic_queue_simple_sorter_sort_predicate(self);
            try {
                try {
                    sort_predicate = new_predicate;
                    sublisp_throw($sym46$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD, new_predicate);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_queues.set_basic_queue_simple_sorter_sort_predicate(self, sort_predicate);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_basic_queue_simple_sorter_method = Errors.handleThrowable(ccatch_env_var, $sym46$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD);
            }
            return catch_var_for_basic_queue_simple_sorter_method;
        }
    }

    public static SubLObject basic_queue_simple_sorter_set_sort_predicate_method(final SubLObject self, final SubLObject new_predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_queue_simple_sorter_method = NIL;
        SubLObject sort_predicate = subloop_queues.get_basic_queue_simple_sorter_sort_predicate(self);
        try {
            thread.throwStack.push(subloop_queues.$sym46$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD);
            try {
                sort_predicate = new_predicate;
                sublisp_throw(subloop_queues.$sym46$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD, new_predicate);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    subloop_queues.set_basic_queue_simple_sorter_sort_predicate(self, sort_predicate);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_queue_simple_sorter_method = Errors.handleThrowable(ccatch_env_var, subloop_queues.$sym46$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_queue_simple_sorter_method;
    }

    public static final SubLObject basic_queue_simple_sorter_get_element_key_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_basic_queue_simple_sorter_method = NIL;
            SubLObject element_key_function = com.cyc.cycjava.cycl.subloop_queues.get_basic_queue_simple_sorter_element_key_function(self);
            try {
                try {
                    sublisp_throw($sym50$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD, element_key_function);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_queues.set_basic_queue_simple_sorter_element_key_function(self, element_key_function);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_basic_queue_simple_sorter_method = Errors.handleThrowable(ccatch_env_var, $sym50$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD);
            }
            return catch_var_for_basic_queue_simple_sorter_method;
        }
    }

    public static SubLObject basic_queue_simple_sorter_get_element_key_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_queue_simple_sorter_method = NIL;
        final SubLObject element_key_function = subloop_queues.get_basic_queue_simple_sorter_element_key_function(self);
        try {
            thread.throwStack.push(subloop_queues.$sym50$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD);
            try {
                sublisp_throw(subloop_queues.$sym50$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD, element_key_function);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    subloop_queues.set_basic_queue_simple_sorter_element_key_function(self, element_key_function);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_queue_simple_sorter_method = Errors.handleThrowable(ccatch_env_var, subloop_queues.$sym50$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_queue_simple_sorter_method;
    }

    public static final SubLObject basic_queue_simple_sorter_set_element_key_method_alt(SubLObject self, SubLObject new_key_function) {
        {
            SubLObject catch_var_for_basic_queue_simple_sorter_method = NIL;
            SubLObject element_key_function = com.cyc.cycjava.cycl.subloop_queues.get_basic_queue_simple_sorter_element_key_function(self);
            try {
                try {
                    element_key_function = new_key_function;
                    sublisp_throw($sym55$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD, new_key_function);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_queues.set_basic_queue_simple_sorter_element_key_function(self, element_key_function);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_basic_queue_simple_sorter_method = Errors.handleThrowable(ccatch_env_var, $sym55$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD);
            }
            return catch_var_for_basic_queue_simple_sorter_method;
        }
    }

    public static SubLObject basic_queue_simple_sorter_set_element_key_method(final SubLObject self, final SubLObject new_key_function) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_queue_simple_sorter_method = NIL;
        SubLObject element_key_function = subloop_queues.get_basic_queue_simple_sorter_element_key_function(self);
        try {
            thread.throwStack.push(subloop_queues.$sym55$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD);
            try {
                element_key_function = new_key_function;
                sublisp_throw(subloop_queues.$sym55$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD, new_key_function);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    subloop_queues.set_basic_queue_simple_sorter_element_key_function(self, element_key_function);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_queue_simple_sorter_method = Errors.handleThrowable(ccatch_env_var, subloop_queues.$sym55$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_queue_simple_sorter_method;
    }

    public static final SubLObject queue_interface_p_alt(SubLObject queue_interface) {
        return interfaces.subloop_instanceof_interface(queue_interface, QUEUE_INTERFACE);
    }

    public static SubLObject queue_interface_p(final SubLObject queue_interface) {
        return interfaces.subloop_instanceof_interface(queue_interface, subloop_queues.QUEUE_INTERFACE);
    }

    public static final SubLObject end_pointer_queue_template_p_alt(SubLObject end_pointer_queue_template) {
        return interfaces.subloop_instanceof_interface(end_pointer_queue_template, END_POINTER_QUEUE_TEMPLATE);
    }

    public static SubLObject end_pointer_queue_template_p(final SubLObject end_pointer_queue_template) {
        return interfaces.subloop_instanceof_interface(end_pointer_queue_template, subloop_queues.END_POINTER_QUEUE_TEMPLATE);
    }

    public static final SubLObject get_basic_queue_prioritizer_alt(SubLObject basic_queue) {
        return classes.subloop_get_access_protected_instance_slot(basic_queue, THREE_INTEGER, PRIORITIZER);
    }

    public static SubLObject get_basic_queue_prioritizer(final SubLObject basic_queue) {
        return classes.subloop_get_access_protected_instance_slot(basic_queue, THREE_INTEGER, PRIORITIZER);
    }

    public static final SubLObject set_basic_queue_prioritizer_alt(SubLObject basic_queue, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_queue, value, THREE_INTEGER, PRIORITIZER);
    }

    public static SubLObject set_basic_queue_prioritizer(final SubLObject basic_queue, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_queue, value, THREE_INTEGER, PRIORITIZER);
    }

    public static final SubLObject get_basic_queue_last_cons_alt(SubLObject basic_queue) {
        return classes.subloop_get_access_protected_instance_slot(basic_queue, TWO_INTEGER, LAST_CONS);
    }

    public static SubLObject get_basic_queue_last_cons(final SubLObject basic_queue) {
        return classes.subloop_get_access_protected_instance_slot(basic_queue, TWO_INTEGER, LAST_CONS);
    }

    public static final SubLObject set_basic_queue_last_cons_alt(SubLObject basic_queue, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_queue, value, TWO_INTEGER, LAST_CONS);
    }

    public static SubLObject set_basic_queue_last_cons(final SubLObject basic_queue, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_queue, value, TWO_INTEGER, LAST_CONS);
    }

    public static final SubLObject get_basic_queue_first_cons_alt(SubLObject basic_queue) {
        return classes.subloop_get_access_protected_instance_slot(basic_queue, ONE_INTEGER, FIRST_CONS);
    }

    public static SubLObject get_basic_queue_first_cons(final SubLObject basic_queue) {
        return classes.subloop_get_access_protected_instance_slot(basic_queue, ONE_INTEGER, subloop_queues.FIRST_CONS);
    }

    public static final SubLObject set_basic_queue_first_cons_alt(SubLObject basic_queue, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_queue, value, ONE_INTEGER, FIRST_CONS);
    }

    public static SubLObject set_basic_queue_first_cons(final SubLObject basic_queue, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_queue, value, ONE_INTEGER, subloop_queues.FIRST_CONS);
    }

    public static final SubLObject get_basic_queue_is_passive_alt(SubLObject basic_queue) {
        {
            SubLObject v_class = subloop_structures.instance_class(basic_queue);
            SubLObject slot = slots.slot_assoc(IS_PASSIVE, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, basic_queue, slot);
        }
        return classes.ldb_test($int$4097, subloop_structures.instance_boolean_slots(basic_queue));
    }

    public static SubLObject get_basic_queue_is_passive(final SubLObject basic_queue) {
        final SubLObject v_class = subloop_structures.instance_class(basic_queue);
        final SubLObject slot = slots.slot_assoc(IS_PASSIVE, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
        instances.instances_access_check_instance_slot(v_class, basic_queue, slot);
        return classes.ldb_test(subloop_queues.$int$4097, subloop_structures.instance_boolean_slots(basic_queue));
    }

    public static final SubLObject set_basic_queue_is_passive_alt(SubLObject basic_queue, SubLObject value) {
        {
            SubLObject v_class = subloop_structures.instance_class(basic_queue);
            SubLObject slot = slots.slot_assoc(IS_PASSIVE, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, basic_queue, slot);
        }
        subloop_structures._csetf_instance_boolean_slots(basic_queue, bytes.dpb(NIL != value ? ((SubLObject) (ONE_INTEGER)) : ZERO_INTEGER, $int$4097, subloop_structures.instance_boolean_slots(basic_queue)));
        return value;
    }

    public static SubLObject set_basic_queue_is_passive(final SubLObject basic_queue, final SubLObject value) {
        final SubLObject v_class = subloop_structures.instance_class(basic_queue);
        final SubLObject slot = slots.slot_assoc(IS_PASSIVE, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
        instances.instances_access_check_instance_slot(v_class, basic_queue, slot);
        subloop_structures._csetf_instance_boolean_slots(basic_queue, bytes.dpb(NIL != value ? ONE_INTEGER : ZERO_INTEGER, subloop_queues.$int$4097, subloop_structures.instance_boolean_slots(basic_queue)));
        return value;
    }

    public static final SubLObject basic_queue_enqueued_p_method_alt(SubLObject self, SubLObject v_object) {
        {
            SubLObject template_contents = com.cyc.cycjava.cycl.subloop_queues.basic_queue_get_first_cons_method(self);
            if (NIL != member(v_object, template_contents, symbol_function(EQUAL), UNPROVIDED)) {
                return T;
            }
            return NIL;
        }
    }

    public static SubLObject basic_queue_enqueued_p_method(final SubLObject self, final SubLObject v_object) {
        final SubLObject template_contents = subloop_queues.basic_queue_get_first_cons_method(self);
        if (NIL != member(v_object, template_contents, symbol_function(EQUAL), UNPROVIDED)) {
            return T;
        }
        return NIL;
    }

    public static final SubLObject basic_queue_peek_method_alt(SubLObject self) {
        {
            SubLObject template_contents = com.cyc.cycjava.cycl.subloop_queues.basic_queue_get_first_cons_method(self);
            if (NIL == template_contents) {
                return NIL;
            }
            return template_contents.first();
        }
    }

    public static SubLObject basic_queue_peek_method(final SubLObject self) {
        final SubLObject template_contents = subloop_queues.basic_queue_get_first_cons_method(self);
        if (NIL == template_contents) {
            return NIL;
        }
        return template_contents.first();
    }

    public static final SubLObject basic_queue_reorder_contents_method_alt(SubLObject self, SubLObject ordered_contents) {
        return com.cyc.cycjava.cycl.subloop_queues.basic_queue_set_contents_method(self, ordered_contents);
    }

    public static SubLObject basic_queue_reorder_contents_method(final SubLObject self, final SubLObject ordered_contents) {
        return subloop_queues.basic_queue_set_contents_method(self, ordered_contents);
    }

    public static final SubLObject basic_queue_clear_method_alt(SubLObject self) {
        com.cyc.cycjava.cycl.subloop_queues.basic_queue_set_first_cons_method(self, NIL);
        com.cyc.cycjava.cycl.subloop_queues.basic_queue_set_end_pointer_method(self, NIL);
        return NIL;
    }

    public static SubLObject basic_queue_clear_method(final SubLObject self) {
        subloop_queues.basic_queue_set_first_cons_method(self, NIL);
        subloop_queues.basic_queue_set_end_pointer_method(self, NIL);
        return NIL;
    }

    public static final SubLObject basic_queue_set_contents_method_alt(SubLObject self, SubLObject new_contents) {
        {
            SubLObject template_contents = copy_list(new_contents);
            if (NIL != template_contents) {
                com.cyc.cycjava.cycl.subloop_queues.basic_queue_set_first_cons_method(self, template_contents);
                com.cyc.cycjava.cycl.subloop_queues.basic_queue_set_end_pointer_method(self, last(template_contents, UNPROVIDED));
            } else {
                com.cyc.cycjava.cycl.subloop_queues.basic_queue_set_first_cons_method(self, NIL);
                com.cyc.cycjava.cycl.subloop_queues.basic_queue_set_end_pointer_method(self, NIL);
            }
            return new_contents;
        }
    }

    public static SubLObject basic_queue_set_contents_method(final SubLObject self, final SubLObject new_contents) {
        final SubLObject template_contents = copy_list(new_contents);
        if (NIL != template_contents) {
            subloop_queues.basic_queue_set_first_cons_method(self, template_contents);
            subloop_queues.basic_queue_set_end_pointer_method(self, last(template_contents, UNPROVIDED));
        } else {
            subloop_queues.basic_queue_set_first_cons_method(self, NIL);
            subloop_queues.basic_queue_set_end_pointer_method(self, NIL);
        }
        return new_contents;
    }

    public static final SubLObject basic_queue_get_contents_method_alt(SubLObject self) {
        return com.cyc.cycjava.cycl.subloop_queues.basic_queue_get_first_cons_method(self);
    }

    public static SubLObject basic_queue_get_contents_method(final SubLObject self) {
        return subloop_queues.basic_queue_get_first_cons_method(self);
    }

    public static final SubLObject basic_queue_get_element_count_method_alt(SubLObject self) {
        return length(com.cyc.cycjava.cycl.subloop_queues.basic_queue_get_first_cons_method(self));
    }

    public static SubLObject basic_queue_get_element_count_method(final SubLObject self) {
        return length(subloop_queues.basic_queue_get_first_cons_method(self));
    }

    public static final SubLObject basic_queue_find_method_alt(SubLObject self, SubLObject key_value, SubLObject equality_pred, SubLObject key_accessor_function) {
        if (equality_pred == UNPROVIDED) {
            equality_pred = symbol_function(EQL);
        }
        if (key_accessor_function == UNPROVIDED) {
            key_accessor_function = symbol_function(IDENTITY);
        }
        {
            SubLObject template_contents = com.cyc.cycjava.cycl.subloop_queues.basic_queue_get_first_cons_method(self);
            if (NIL != template_contents) {
                {
                    SubLObject template_item = member(key_value, template_contents, equality_pred, key_accessor_function);
                    if (NIL != template_item) {
                        return template_item;
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject basic_queue_find_method(final SubLObject self, final SubLObject key_value, SubLObject equality_pred, SubLObject key_accessor_function) {
        if (equality_pred == UNPROVIDED) {
            equality_pred = symbol_function(EQL);
        }
        if (key_accessor_function == UNPROVIDED) {
            key_accessor_function = symbol_function(IDENTITY);
        }
        final SubLObject template_contents = subloop_queues.basic_queue_get_first_cons_method(self);
        if (NIL != template_contents) {
            final SubLObject template_item = member(key_value, template_contents, equality_pred, key_accessor_function);
            if (NIL != template_item) {
                return template_item;
            }
        }
        return NIL;
    }

    public static final SubLObject basic_queue_dequeue_method_alt(SubLObject self) {
        {
            SubLObject template_prioritizer = com.cyc.cycjava.cycl.subloop_queues.basic_queue_get_prioritizer_method(self);
            if (NIL != template_prioritizer) {
                methods.funcall_instance_method_with_1_args(template_prioritizer, ORDER_QUEUE, self);
            }
            {
                SubLObject template_contents = com.cyc.cycjava.cycl.subloop_queues.basic_queue_get_first_cons_method(self);
                if (NIL == template_contents) {
                    return NIL;
                }
                if (NIL == template_contents.rest()) {
                    com.cyc.cycjava.cycl.subloop_queues.basic_queue_set_first_cons_method(self, NIL);
                    com.cyc.cycjava.cycl.subloop_queues.basic_queue_set_end_pointer_method(self, NIL);
                    {
                        SubLObject template_result = template_contents.first();
                        if ((NIL == com.cyc.cycjava.cycl.subloop_queues.basic_queue_passive_p_method(self)) && (NIL != com.cyc.cycjava.cycl.subloop_queues.queue_element_interface_p(template_result))) {
                            methods.funcall_instance_method_with_1_args(template_result, DEQUEUE_NOTIFY, self);
                        }
                        return template_result;
                    }
                }
                com.cyc.cycjava.cycl.subloop_queues.basic_queue_set_first_cons_method(self, template_contents.rest());
                {
                    SubLObject template_result = template_contents.first();
                    if ((NIL == com.cyc.cycjava.cycl.subloop_queues.basic_queue_passive_p_method(self)) && (NIL != com.cyc.cycjava.cycl.subloop_queues.queue_element_interface_p(template_result))) {
                        methods.funcall_instance_method_with_1_args(template_result, DEQUEUE_NOTIFY, self);
                    }
                    return template_result;
                }
            }
        }
    }

    public static SubLObject basic_queue_dequeue_method(final SubLObject self) {
        final SubLObject template_prioritizer = subloop_queues.basic_queue_get_prioritizer_method(self);
        if (NIL != template_prioritizer) {
            methods.funcall_instance_method_with_1_args(template_prioritizer, subloop_queues.ORDER_QUEUE, self);
        }
        final SubLObject template_contents = subloop_queues.basic_queue_get_first_cons_method(self);
        if (NIL == template_contents) {
            return NIL;
        }
        if (NIL == template_contents.rest()) {
            subloop_queues.basic_queue_set_first_cons_method(self, NIL);
            subloop_queues.basic_queue_set_end_pointer_method(self, NIL);
            final SubLObject template_result = template_contents.first();
            if ((NIL == subloop_queues.basic_queue_passive_p_method(self)) && (NIL != subloop_queues.queue_element_interface_p(template_result))) {
                methods.funcall_instance_method_with_1_args(template_result, DEQUEUE_NOTIFY, self);
            }
            return template_result;
        }
        subloop_queues.basic_queue_set_first_cons_method(self, template_contents.rest());
        final SubLObject template_result = template_contents.first();
        if ((NIL == subloop_queues.basic_queue_passive_p_method(self)) && (NIL != subloop_queues.queue_element_interface_p(template_result))) {
            methods.funcall_instance_method_with_1_args(template_result, DEQUEUE_NOTIFY, self);
        }
        return template_result;
    }

    public static final SubLObject basic_queue_remove_method_alt(SubLObject self, SubLObject old_element) {
        {
            SubLObject template_contents = com.cyc.cycjava.cycl.subloop_queues.basic_queue_get_first_cons_method(self);
            SubLObject template_end_pointer = com.cyc.cycjava.cycl.subloop_queues.basic_queue_get_end_pointer_method(self);
            if (NIL == template_contents) {
                return NIL;
            } else {
                if (old_element == template_contents.first()) {
                    if (template_contents == template_end_pointer) {
                        com.cyc.cycjava.cycl.subloop_queues.basic_queue_set_first_cons_method(self, NIL);
                        com.cyc.cycjava.cycl.subloop_queues.basic_queue_set_end_pointer_method(self, NIL);
                        if ((NIL == com.cyc.cycjava.cycl.subloop_queues.basic_queue_passive_p_method(self)) && (NIL != com.cyc.cycjava.cycl.subloop_queues.queue_element_interface_p(old_element))) {
                            methods.funcall_instance_method_with_1_args(old_element, REMOVE_NOTIFY, self);
                        }
                        return old_element;
                    } else {
                        com.cyc.cycjava.cycl.subloop_queues.basic_queue_set_first_cons_method(self, template_contents.rest());
                        if ((NIL == com.cyc.cycjava.cycl.subloop_queues.basic_queue_passive_p_method(self)) && (NIL != com.cyc.cycjava.cycl.subloop_queues.queue_element_interface_p(old_element))) {
                            methods.funcall_instance_method_with_1_args(old_element, REMOVE_NOTIFY, self);
                        }
                        return old_element;
                    }
                } else {
                    {
                        SubLObject template_current_cons = template_contents;
                        while (template_current_cons.rest() != template_end_pointer) {
                            if (old_element == cadr(template_current_cons)) {
                                rplacd(template_current_cons, cddr(template_current_cons));
                                if ((NIL == com.cyc.cycjava.cycl.subloop_queues.basic_queue_passive_p_method(self)) && (NIL != com.cyc.cycjava.cycl.subloop_queues.queue_element_interface_p(old_element))) {
                                    methods.funcall_instance_method_with_1_args(old_element, REMOVE_NOTIFY, self);
                                }
                                return old_element;
                            }
                            template_current_cons = template_current_cons.rest();
                        } 
                        if (old_element == cadr(template_current_cons)) {
                            rplacd(template_current_cons, NIL);
                            com.cyc.cycjava.cycl.subloop_queues.basic_queue_set_end_pointer_method(self, template_current_cons);
                            if ((NIL == com.cyc.cycjava.cycl.subloop_queues.basic_queue_passive_p_method(self)) && (NIL != com.cyc.cycjava.cycl.subloop_queues.queue_element_interface_p(old_element))) {
                                methods.funcall_instance_method_with_1_args(old_element, REMOVE_NOTIFY, self);
                            }
                            return old_element;
                        } else {
                            if ((NIL == com.cyc.cycjava.cycl.subloop_queues.basic_queue_passive_p_method(self)) && (NIL != com.cyc.cycjava.cycl.subloop_queues.queue_element_interface_p(old_element))) {
                                methods.funcall_instance_method_with_1_args(old_element, REMOVE_NOTIFY, self);
                            }
                            return old_element;
                        }
                    }
                }
            }
        }
    }

    public static SubLObject basic_queue_remove_method(final SubLObject self, final SubLObject old_element) {
        final SubLObject template_contents = subloop_queues.basic_queue_get_first_cons_method(self);
        final SubLObject template_end_pointer = subloop_queues.basic_queue_get_end_pointer_method(self);
        if (NIL == template_contents) {
            return NIL;
        }
        if (old_element.eql(template_contents.first())) {
            if (template_contents.eql(template_end_pointer)) {
                subloop_queues.basic_queue_set_first_cons_method(self, NIL);
                subloop_queues.basic_queue_set_end_pointer_method(self, NIL);
                if ((NIL == subloop_queues.basic_queue_passive_p_method(self)) && (NIL != subloop_queues.queue_element_interface_p(old_element))) {
                    methods.funcall_instance_method_with_1_args(old_element, REMOVE_NOTIFY, self);
                }
                return old_element;
            }
            subloop_queues.basic_queue_set_first_cons_method(self, template_contents.rest());
            if ((NIL == subloop_queues.basic_queue_passive_p_method(self)) && (NIL != subloop_queues.queue_element_interface_p(old_element))) {
                methods.funcall_instance_method_with_1_args(old_element, REMOVE_NOTIFY, self);
            }
            return old_element;
        } else {
            SubLObject template_current_cons;
            for (template_current_cons = template_contents; !template_current_cons.rest().eql(template_end_pointer); template_current_cons = template_current_cons.rest()) {
                if (old_element.eql(cadr(template_current_cons))) {
                    rplacd(template_current_cons, cddr(template_current_cons));
                    if ((NIL == subloop_queues.basic_queue_passive_p_method(self)) && (NIL != subloop_queues.queue_element_interface_p(old_element))) {
                        methods.funcall_instance_method_with_1_args(old_element, REMOVE_NOTIFY, self);
                    }
                    return old_element;
                }
            }
            if (old_element.eql(cadr(template_current_cons))) {
                rplacd(template_current_cons, NIL);
                subloop_queues.basic_queue_set_end_pointer_method(self, template_current_cons);
                if ((NIL == subloop_queues.basic_queue_passive_p_method(self)) && (NIL != subloop_queues.queue_element_interface_p(old_element))) {
                    methods.funcall_instance_method_with_1_args(old_element, REMOVE_NOTIFY, self);
                }
                return old_element;
            }
            if ((NIL == subloop_queues.basic_queue_passive_p_method(self)) && (NIL != subloop_queues.queue_element_interface_p(old_element))) {
                methods.funcall_instance_method_with_1_args(old_element, REMOVE_NOTIFY, self);
            }
            return old_element;
        }
    }

    public static final SubLObject basic_queue_on_enqueue_method_alt(SubLObject self, SubLObject new_element) {
        return NIL;
    }

    public static SubLObject basic_queue_on_enqueue_method(final SubLObject self, final SubLObject new_element) {
        return NIL;
    }

    public static final SubLObject basic_queue_enqueue_method_alt(SubLObject self, SubLObject new_element) {
        {
            SubLObject template_contents = com.cyc.cycjava.cycl.subloop_queues.basic_queue_get_first_cons_method(self);
            SubLObject template_end_pointer = com.cyc.cycjava.cycl.subloop_queues.basic_queue_get_end_pointer_method(self);
            if (NIL == template_contents) {
                template_contents = list(new_element);
                template_end_pointer = template_contents;
            } else {
                rplacd(template_end_pointer, list(new_element));
                template_end_pointer = template_end_pointer.rest();
            }
            com.cyc.cycjava.cycl.subloop_queues.basic_queue_set_first_cons_method(self, template_contents);
            com.cyc.cycjava.cycl.subloop_queues.basic_queue_set_end_pointer_method(self, template_end_pointer);
            if ((NIL == com.cyc.cycjava.cycl.subloop_queues.basic_queue_passive_p_method(self)) && (NIL != com.cyc.cycjava.cycl.subloop_queues.queue_element_interface_p(new_element))) {
                methods.funcall_instance_method_with_1_args(new_element, ENQUEUE_NOTIFY, self);
            }
            methods.funcall_instance_method_with_1_args(self, ON_ENQUEUE, new_element);
            return new_element;
        }
    }

    public static SubLObject basic_queue_enqueue_method(final SubLObject self, final SubLObject new_element) {
        SubLObject template_contents = subloop_queues.basic_queue_get_first_cons_method(self);
        SubLObject template_end_pointer = subloop_queues.basic_queue_get_end_pointer_method(self);
        if (NIL == template_contents) {
            template_contents = template_end_pointer = list(new_element);
        } else {
            rplacd(template_end_pointer, list(new_element));
            template_end_pointer = template_end_pointer.rest();
        }
        subloop_queues.basic_queue_set_first_cons_method(self, template_contents);
        subloop_queues.basic_queue_set_end_pointer_method(self, template_end_pointer);
        if ((NIL == subloop_queues.basic_queue_passive_p_method(self)) && (NIL != subloop_queues.queue_element_interface_p(new_element))) {
            methods.funcall_instance_method_with_1_args(new_element, ENQUEUE_NOTIFY, self);
        }
        methods.funcall_instance_method_with_1_args(self, ON_ENQUEUE, new_element);
        return new_element;
    }

    public static final SubLObject basic_queue_empty_p_method_alt(SubLObject self) {
        return sublisp_null(com.cyc.cycjava.cycl.subloop_queues.basic_queue_get_first_cons_method(self));
    }

    public static SubLObject basic_queue_empty_p_method(final SubLObject self) {
        return sublisp_null(subloop_queues.basic_queue_get_first_cons_method(self));
    }

    public static final SubLObject basic_queue_print_method_alt(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject template_contents = com.cyc.cycjava.cycl.subloop_queues.basic_queue_get_contents_method(self);
            if (NIL == template_contents) {
                format(stream, $str_alt122$QUEUE___);
            } else {
                if (NIL == template_contents.rest()) {
                    format(stream, $str_alt123$QUEUE___S_, template_contents.first());
                } else {
                    format(stream, $str_alt124$QUEUE___S, template_contents.first());
                    {
                        SubLObject cdolist_list_var = template_contents.rest();
                        SubLObject element = NIL;
                        for (element = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , element = cdolist_list_var.first()) {
                            format(stream, $str_alt125$___S, element);
                        }
                    }
                    format(stream, $str_alt126$_);
                }
            }
            return self;
        }
    }

    public static SubLObject basic_queue_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLObject template_contents = subloop_queues.basic_queue_get_contents_method(self);
        if (NIL == template_contents) {
            format(stream, subloop_queues.$str122$QUEUE___);
        } else
            if (NIL == template_contents.rest()) {
                format(stream, subloop_queues.$str123$QUEUE___S_, template_contents.first());
            } else {
                format(stream, subloop_queues.$str124$QUEUE___S, template_contents.first());
                SubLObject cdolist_list_var = template_contents.rest();
                SubLObject element = NIL;
                element = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    format(stream, subloop_queues.$str125$___S, element);
                    cdolist_list_var = cdolist_list_var.rest();
                    element = cdolist_list_var.first();
                } 
                format(stream, subloop_queues.$str126$_);
            }

        return self;
    }

    public static final SubLObject subloop_reserved_initialize_basic_queue_class_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_basic_queue_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_basic_queue_instance_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_QUEUE, IS_PASSIVE, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_QUEUE, FIRST_CONS, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_QUEUE, LAST_CONS, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_QUEUE, PRIORITIZER, NIL);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_basic_queue_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, subloop_queues.BASIC_QUEUE, IS_PASSIVE, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, subloop_queues.BASIC_QUEUE, subloop_queues.FIRST_CONS, NIL);
        classes.subloop_initialize_slot(new_instance, subloop_queues.BASIC_QUEUE, LAST_CONS, NIL);
        classes.subloop_initialize_slot(new_instance, subloop_queues.BASIC_QUEUE, PRIORITIZER, NIL);
        return NIL;
    }

    public static final SubLObject basic_queue_p_alt(SubLObject basic_queue) {
        return classes.subloop_instanceof_class(basic_queue, BASIC_QUEUE);
    }

    public static SubLObject basic_queue_p(final SubLObject basic_queue) {
        return classes.subloop_instanceof_class(basic_queue, subloop_queues.BASIC_QUEUE);
    }

    public static final SubLObject basic_queue_initialize_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_basic_queue_method = NIL;
            SubLObject prioritizer = com.cyc.cycjava.cycl.subloop_queues.get_basic_queue_prioritizer(self);
            SubLObject last_cons = com.cyc.cycjava.cycl.subloop_queues.get_basic_queue_last_cons(self);
            SubLObject first_cons = com.cyc.cycjava.cycl.subloop_queues.get_basic_queue_first_cons(self);
            SubLObject is_passive = com.cyc.cycjava.cycl.subloop_queues.get_basic_queue_is_passive(self);
            try {
                try {
                    object.object_initialize_method(self);
                    first_cons = NIL;
                    last_cons = NIL;
                    prioritizer = NIL;
                    is_passive = NIL;
                    sublisp_throw($sym131$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_queues.set_basic_queue_prioritizer(self, prioritizer);
                            com.cyc.cycjava.cycl.subloop_queues.set_basic_queue_last_cons(self, last_cons);
                            com.cyc.cycjava.cycl.subloop_queues.set_basic_queue_first_cons(self, first_cons);
                            com.cyc.cycjava.cycl.subloop_queues.set_basic_queue_is_passive(self, is_passive);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_basic_queue_method = Errors.handleThrowable(ccatch_env_var, $sym131$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD);
            }
            return catch_var_for_basic_queue_method;
        }
    }

    public static SubLObject basic_queue_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_queue_method = NIL;
        SubLObject prioritizer = subloop_queues.get_basic_queue_prioritizer(self);
        SubLObject last_cons = subloop_queues.get_basic_queue_last_cons(self);
        SubLObject first_cons = subloop_queues.get_basic_queue_first_cons(self);
        SubLObject is_passive = subloop_queues.get_basic_queue_is_passive(self);
        try {
            thread.throwStack.push(subloop_queues.$sym131$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD);
            try {
                object.object_initialize_method(self);
                first_cons = NIL;
                last_cons = NIL;
                prioritizer = NIL;
                is_passive = NIL;
                sublisp_throw(subloop_queues.$sym131$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    subloop_queues.set_basic_queue_prioritizer(self, prioritizer);
                    subloop_queues.set_basic_queue_last_cons(self, last_cons);
                    subloop_queues.set_basic_queue_first_cons(self, first_cons);
                    subloop_queues.set_basic_queue_is_passive(self, is_passive);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_queue_method = Errors.handleThrowable(ccatch_env_var, subloop_queues.$sym131$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_queue_method;
    }

    public static final SubLObject basic_queue_get_first_cons_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_basic_queue_method = NIL;
            SubLObject first_cons = com.cyc.cycjava.cycl.subloop_queues.get_basic_queue_first_cons(self);
            try {
                try {
                    sublisp_throw($sym135$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD, first_cons);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_queues.set_basic_queue_first_cons(self, first_cons);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_basic_queue_method = Errors.handleThrowable(ccatch_env_var, $sym135$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD);
            }
            return catch_var_for_basic_queue_method;
        }
    }

    public static SubLObject basic_queue_get_first_cons_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_queue_method = NIL;
        final SubLObject first_cons = subloop_queues.get_basic_queue_first_cons(self);
        try {
            thread.throwStack.push(subloop_queues.$sym135$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD);
            try {
                sublisp_throw(subloop_queues.$sym135$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD, first_cons);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    subloop_queues.set_basic_queue_first_cons(self, first_cons);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_queue_method = Errors.handleThrowable(ccatch_env_var, subloop_queues.$sym135$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_queue_method;
    }

    public static final SubLObject basic_queue_set_first_cons_method_alt(SubLObject self, SubLObject new_cons) {
        {
            SubLObject catch_var_for_basic_queue_method = NIL;
            SubLObject first_cons = com.cyc.cycjava.cycl.subloop_queues.get_basic_queue_first_cons(self);
            try {
                try {
                    first_cons = new_cons;
                    sublisp_throw($sym140$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD, new_cons);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_queues.set_basic_queue_first_cons(self, first_cons);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_basic_queue_method = Errors.handleThrowable(ccatch_env_var, $sym140$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD);
            }
            return catch_var_for_basic_queue_method;
        }
    }

    public static SubLObject basic_queue_set_first_cons_method(final SubLObject self, final SubLObject new_cons) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_queue_method = NIL;
        SubLObject first_cons = subloop_queues.get_basic_queue_first_cons(self);
        try {
            thread.throwStack.push(subloop_queues.$sym140$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD);
            try {
                first_cons = new_cons;
                sublisp_throw(subloop_queues.$sym140$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD, new_cons);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    subloop_queues.set_basic_queue_first_cons(self, first_cons);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_queue_method = Errors.handleThrowable(ccatch_env_var, subloop_queues.$sym140$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_queue_method;
    }

    public static final SubLObject basic_queue_get_end_pointer_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_basic_queue_method = NIL;
            SubLObject last_cons = com.cyc.cycjava.cycl.subloop_queues.get_basic_queue_last_cons(self);
            try {
                try {
                    sublisp_throw($sym144$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD, last_cons);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_queues.set_basic_queue_last_cons(self, last_cons);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_basic_queue_method = Errors.handleThrowable(ccatch_env_var, $sym144$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD);
            }
            return catch_var_for_basic_queue_method;
        }
    }

    public static SubLObject basic_queue_get_end_pointer_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_queue_method = NIL;
        final SubLObject last_cons = subloop_queues.get_basic_queue_last_cons(self);
        try {
            thread.throwStack.push(subloop_queues.$sym144$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD);
            try {
                sublisp_throw(subloop_queues.$sym144$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD, last_cons);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    subloop_queues.set_basic_queue_last_cons(self, last_cons);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_queue_method = Errors.handleThrowable(ccatch_env_var, subloop_queues.$sym144$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_queue_method;
    }

    public static final SubLObject basic_queue_set_end_pointer_method_alt(SubLObject self, SubLObject new_end_pointer) {
        {
            SubLObject catch_var_for_basic_queue_method = NIL;
            SubLObject last_cons = com.cyc.cycjava.cycl.subloop_queues.get_basic_queue_last_cons(self);
            try {
                try {
                    last_cons = new_end_pointer;
                    sublisp_throw($sym149$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD, new_end_pointer);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_queues.set_basic_queue_last_cons(self, last_cons);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_basic_queue_method = Errors.handleThrowable(ccatch_env_var, $sym149$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD);
            }
            return catch_var_for_basic_queue_method;
        }
    }

    public static SubLObject basic_queue_set_end_pointer_method(final SubLObject self, final SubLObject new_end_pointer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_queue_method = NIL;
        SubLObject last_cons = subloop_queues.get_basic_queue_last_cons(self);
        try {
            thread.throwStack.push(subloop_queues.$sym149$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD);
            try {
                last_cons = new_end_pointer;
                sublisp_throw(subloop_queues.$sym149$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD, new_end_pointer);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    subloop_queues.set_basic_queue_last_cons(self, last_cons);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_queue_method = Errors.handleThrowable(ccatch_env_var, subloop_queues.$sym149$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_queue_method;
    }

    public static final SubLObject basic_queue_get_prioritizer_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_basic_queue_method = NIL;
            SubLObject prioritizer = com.cyc.cycjava.cycl.subloop_queues.get_basic_queue_prioritizer(self);
            try {
                try {
                    sublisp_throw($sym153$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD, prioritizer);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_queues.set_basic_queue_prioritizer(self, prioritizer);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_basic_queue_method = Errors.handleThrowable(ccatch_env_var, $sym153$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD);
            }
            return catch_var_for_basic_queue_method;
        }
    }

    public static SubLObject basic_queue_get_prioritizer_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_queue_method = NIL;
        final SubLObject prioritizer = subloop_queues.get_basic_queue_prioritizer(self);
        try {
            thread.throwStack.push(subloop_queues.$sym153$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD);
            try {
                sublisp_throw(subloop_queues.$sym153$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD, prioritizer);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    subloop_queues.set_basic_queue_prioritizer(self, prioritizer);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_queue_method = Errors.handleThrowable(ccatch_env_var, subloop_queues.$sym153$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_queue_method;
    }

    public static final SubLObject basic_queue_set_prioritizer_method_alt(SubLObject self, SubLObject new_prioritizer) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_basic_queue_method = NIL;
                SubLObject prioritizer = com.cyc.cycjava.cycl.subloop_queues.get_basic_queue_prioritizer(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_prioritizer) || (NIL != com.cyc.cycjava.cycl.subloop_queues.queue_prioritizer_interface_p(new_prioritizer)))) {
                                Errors.error($str_alt159$_SET_PRIORITIZER__S____S_is_not_a, self, new_prioritizer);
                            }
                        }
                        prioritizer = new_prioritizer;
                        sublisp_throw($sym158$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD, new_prioritizer);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                com.cyc.cycjava.cycl.subloop_queues.set_basic_queue_prioritizer(self, prioritizer);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_basic_queue_method = Errors.handleThrowable(ccatch_env_var, $sym158$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD);
                }
                return catch_var_for_basic_queue_method;
            }
        }
    }

    public static SubLObject basic_queue_set_prioritizer_method(final SubLObject self, final SubLObject new_prioritizer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_queue_method = NIL;
        SubLObject prioritizer = subloop_queues.get_basic_queue_prioritizer(self);
        try {
            thread.throwStack.push(subloop_queues.$sym158$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD);
            try {
                if (((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != new_prioritizer)) && (NIL == subloop_queues.queue_prioritizer_interface_p(new_prioritizer))) {
                    Errors.error(subloop_queues.$str159$_SET_PRIORITIZER__S____S_is_not_a, self, new_prioritizer);
                }
                prioritizer = new_prioritizer;
                sublisp_throw(subloop_queues.$sym158$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD, new_prioritizer);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    subloop_queues.set_basic_queue_prioritizer(self, prioritizer);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_queue_method = Errors.handleThrowable(ccatch_env_var, subloop_queues.$sym158$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_queue_method;
    }

    public static final SubLObject basic_queue_passive_p_method_alt(SubLObject self) {
        {
            SubLObject is_passive = com.cyc.cycjava.cycl.subloop_queues.get_basic_queue_is_passive(self);
            return is_passive;
        }
    }

    public static SubLObject basic_queue_passive_p_method(final SubLObject self) {
        final SubLObject is_passive = subloop_queues.get_basic_queue_is_passive(self);
        return is_passive;
    }

    public static final SubLObject basic_queue_set_passive_method_alt(SubLObject self, SubLObject flag) {
        {
            SubLObject catch_var_for_basic_queue_method = NIL;
            SubLObject is_passive = com.cyc.cycjava.cycl.subloop_queues.get_basic_queue_is_passive(self);
            try {
                try {
                    is_passive = flag;
                    sublisp_throw($sym168$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD, flag);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_queues.set_basic_queue_is_passive(self, is_passive);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_basic_queue_method = Errors.handleThrowable(ccatch_env_var, $sym168$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD);
            }
            return catch_var_for_basic_queue_method;
        }
    }

    public static SubLObject basic_queue_set_passive_method(final SubLObject self, final SubLObject flag) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_queue_method = NIL;
        SubLObject is_passive = subloop_queues.get_basic_queue_is_passive(self);
        try {
            thread.throwStack.push(subloop_queues.$sym168$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD);
            try {
                is_passive = flag;
                sublisp_throw(subloop_queues.$sym168$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD, flag);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    subloop_queues.set_basic_queue_is_passive(self, is_passive);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_queue_method = Errors.handleThrowable(ccatch_env_var, subloop_queues.$sym168$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_queue_method;
    }

    public static final SubLObject doubly_linked_queue_template_p_alt(SubLObject doubly_linked_queue_template) {
        return interfaces.subloop_instanceof_interface(doubly_linked_queue_template, DOUBLY_LINKED_QUEUE_TEMPLATE);
    }

    public static SubLObject doubly_linked_queue_template_p(final SubLObject doubly_linked_queue_template) {
        return interfaces.subloop_instanceof_interface(doubly_linked_queue_template, subloop_queues.DOUBLY_LINKED_QUEUE_TEMPLATE);
    }

    public static final SubLObject get_basic_doubly_linked_queue_prioritizer_alt(SubLObject basic_doubly_linked_queue) {
        return classes.subloop_get_access_protected_instance_slot(basic_doubly_linked_queue, TWO_INTEGER, PRIORITIZER);
    }

    public static SubLObject get_basic_doubly_linked_queue_prioritizer(final SubLObject basic_doubly_linked_queue) {
        return classes.subloop_get_access_protected_instance_slot(basic_doubly_linked_queue, TWO_INTEGER, PRIORITIZER);
    }

    public static final SubLObject set_basic_doubly_linked_queue_prioritizer_alt(SubLObject basic_doubly_linked_queue, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_doubly_linked_queue, value, TWO_INTEGER, PRIORITIZER);
    }

    public static SubLObject set_basic_doubly_linked_queue_prioritizer(final SubLObject basic_doubly_linked_queue, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_doubly_linked_queue, value, TWO_INTEGER, PRIORITIZER);
    }

    public static final SubLObject get_basic_doubly_linked_queue_list_alt(SubLObject basic_doubly_linked_queue) {
        return classes.subloop_get_access_protected_instance_slot(basic_doubly_linked_queue, ONE_INTEGER, LIST);
    }

    public static SubLObject get_basic_doubly_linked_queue_list(final SubLObject basic_doubly_linked_queue) {
        return classes.subloop_get_access_protected_instance_slot(basic_doubly_linked_queue, ONE_INTEGER, LIST);
    }

    public static final SubLObject set_basic_doubly_linked_queue_list_alt(SubLObject basic_doubly_linked_queue, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_doubly_linked_queue, value, ONE_INTEGER, LIST);
    }

    public static SubLObject set_basic_doubly_linked_queue_list(final SubLObject basic_doubly_linked_queue, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_doubly_linked_queue, value, ONE_INTEGER, LIST);
    }

    public static final SubLObject get_basic_doubly_linked_queue_is_passive_alt(SubLObject basic_doubly_linked_queue) {
        {
            SubLObject v_class = subloop_structures.instance_class(basic_doubly_linked_queue);
            SubLObject slot = slots.slot_assoc(IS_PASSIVE, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, basic_doubly_linked_queue, slot);
        }
        return classes.ldb_test($int$4097, subloop_structures.instance_boolean_slots(basic_doubly_linked_queue));
    }

    public static SubLObject get_basic_doubly_linked_queue_is_passive(final SubLObject basic_doubly_linked_queue) {
        final SubLObject v_class = subloop_structures.instance_class(basic_doubly_linked_queue);
        final SubLObject slot = slots.slot_assoc(IS_PASSIVE, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
        instances.instances_access_check_instance_slot(v_class, basic_doubly_linked_queue, slot);
        return classes.ldb_test(subloop_queues.$int$4097, subloop_structures.instance_boolean_slots(basic_doubly_linked_queue));
    }

    public static final SubLObject set_basic_doubly_linked_queue_is_passive_alt(SubLObject basic_doubly_linked_queue, SubLObject value) {
        {
            SubLObject v_class = subloop_structures.instance_class(basic_doubly_linked_queue);
            SubLObject slot = slots.slot_assoc(IS_PASSIVE, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, basic_doubly_linked_queue, slot);
        }
        subloop_structures._csetf_instance_boolean_slots(basic_doubly_linked_queue, bytes.dpb(NIL != value ? ((SubLObject) (ONE_INTEGER)) : ZERO_INTEGER, $int$4097, subloop_structures.instance_boolean_slots(basic_doubly_linked_queue)));
        return value;
    }

    public static SubLObject set_basic_doubly_linked_queue_is_passive(final SubLObject basic_doubly_linked_queue, final SubLObject value) {
        final SubLObject v_class = subloop_structures.instance_class(basic_doubly_linked_queue);
        final SubLObject slot = slots.slot_assoc(IS_PASSIVE, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
        instances.instances_access_check_instance_slot(v_class, basic_doubly_linked_queue, slot);
        subloop_structures._csetf_instance_boolean_slots(basic_doubly_linked_queue, bytes.dpb(NIL != value ? ONE_INTEGER : ZERO_INTEGER, subloop_queues.$int$4097, subloop_structures.instance_boolean_slots(basic_doubly_linked_queue)));
        return value;
    }

    public static final SubLObject basic_doubly_linked_queue_enqueued_p_method_alt(SubLObject self, SubLObject v_object) {
        {
            SubLObject template_list = com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_get_list_internal_method(self);
            if (NIL == template_list) {
                return NIL;
            }
            return subloop_collections.basic_doubly_linked_list_member_p_method(template_list, v_object);
        }
    }

    public static SubLObject basic_doubly_linked_queue_enqueued_p_method(final SubLObject self, final SubLObject v_object) {
        final SubLObject template_list = subloop_queues.basic_doubly_linked_queue_get_list_internal_method(self);
        if (NIL == template_list) {
            return NIL;
        }
        return subloop_collections.basic_doubly_linked_list_member_p_method(template_list, v_object);
    }

    public static final SubLObject basic_doubly_linked_queue_peek_method_alt(SubLObject self) {
        {
            SubLObject template_list = com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_get_list_internal_method(self);
            if (NIL != template_list) {
                if (!subloop_collections.basic_doubly_linked_list_get_element_count_method(template_list).numE(ZERO_INTEGER)) {
                    return NIL;
                }
                {
                    SubLObject next_item = subloop_collections.basic_doubly_linked_list_nth_method(template_list, ZERO_INTEGER);
                    return next_item;
                }
            }
            return NIL;
        }
    }

    public static SubLObject basic_doubly_linked_queue_peek_method(final SubLObject self) {
        final SubLObject template_list = subloop_queues.basic_doubly_linked_queue_get_list_internal_method(self);
        if (NIL == template_list) {
            return NIL;
        }
        if (!subloop_collections.basic_doubly_linked_list_get_element_count_method(template_list).numE(ZERO_INTEGER)) {
            return NIL;
        }
        final SubLObject next_item = subloop_collections.basic_doubly_linked_list_nth_method(template_list, ZERO_INTEGER);
        return next_item;
    }

    public static final SubLObject basic_doubly_linked_queue_reorder_contents_method_alt(SubLObject self, SubLObject ordered_contents) {
        {
            SubLObject resolved_list = com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_get_list_method(self);
            subloop_collections.basic_doubly_linked_list_set_contents_method(resolved_list, ordered_contents);
            return NIL;
        }
    }

    public static SubLObject basic_doubly_linked_queue_reorder_contents_method(final SubLObject self, final SubLObject ordered_contents) {
        final SubLObject resolved_list = subloop_queues.basic_doubly_linked_queue_get_list_method(self);
        subloop_collections.basic_doubly_linked_list_set_contents_method(resolved_list, ordered_contents);
        return NIL;
    }

    public static final SubLObject basic_doubly_linked_queue_clear_method_alt(SubLObject self) {
        {
            SubLObject template_list = com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_get_list_internal_method(self);
            if (NIL != template_list) {
                {
                    SubLObject template_enumerator = subloop_collections.basic_doubly_linked_list_allocate_enumerator_method(template_list);
                    SubLObject template_current_item = subloop_collections.basic_doubly_linked_list_enumerator_first_method(template_enumerator);
                    if ((NIL == com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_passive_p_method(self)) && (NIL != com.cyc.cycjava.cycl.subloop_queues.queue_element_interface_p(template_current_item))) {
                        methods.funcall_instance_method_with_0_args(template_current_item, DEQUEUE_NOTIFY);
                    }
                    while (NIL == subloop_collections.basic_doubly_linked_list_enumerator_last_p_method(template_enumerator)) {
                        template_current_item = subloop_collections.basic_doubly_linked_list_enumerator_next_method(template_enumerator);
                        if ((NIL == com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_passive_p_method(self)) && (NIL != com.cyc.cycjava.cycl.subloop_queues.queue_element_interface_p(template_current_item))) {
                            methods.funcall_instance_method_with_0_args(template_current_item, DEQUEUE_NOTIFY);
                        }
                    } 
                    subloop_collections.basic_doubly_linked_list_deallocate_enumerator_method(template_list, template_enumerator);
                }
                subloop_collections.basic_doubly_linked_list_clear_method(template_list);
            }
            return NIL;
        }
    }

    public static SubLObject basic_doubly_linked_queue_clear_method(final SubLObject self) {
        final SubLObject template_list = subloop_queues.basic_doubly_linked_queue_get_list_internal_method(self);
        if (NIL != template_list) {
            final SubLObject template_enumerator = subloop_collections.basic_doubly_linked_list_allocate_enumerator_method(template_list);
            SubLObject template_current_item = subloop_collections.basic_doubly_linked_list_enumerator_first_method(template_enumerator);
            if ((NIL == subloop_queues.basic_doubly_linked_queue_passive_p_method(self)) && (NIL != subloop_queues.queue_element_interface_p(template_current_item))) {
                methods.funcall_instance_method_with_0_args(template_current_item, DEQUEUE_NOTIFY);
            }
            while (NIL == subloop_collections.basic_doubly_linked_list_enumerator_last_p_method(template_enumerator)) {
                template_current_item = subloop_collections.basic_doubly_linked_list_enumerator_next_method(template_enumerator);
                if ((NIL == subloop_queues.basic_doubly_linked_queue_passive_p_method(self)) && (NIL != subloop_queues.queue_element_interface_p(template_current_item))) {
                    methods.funcall_instance_method_with_0_args(template_current_item, DEQUEUE_NOTIFY);
                }
            } 
            subloop_collections.basic_doubly_linked_list_deallocate_enumerator_method(template_list, template_enumerator);
            subloop_collections.basic_doubly_linked_list_clear_method(template_list);
        }
        return NIL;
    }

    public static final SubLObject basic_doubly_linked_queue_set_contents_method_alt(SubLObject self, SubLObject new_contents) {
        {
            SubLObject template_resolved_list = com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_get_list_method(self);
            SubLObject template_enumerator = subloop_collections.basic_doubly_linked_list_allocate_enumerator_method(template_resolved_list);
            if (NIL == subloop_collections.basic_doubly_linked_list_enumerator_empty_p_method(template_enumerator)) {
                {
                    SubLObject template_current_item = subloop_collections.basic_doubly_linked_list_enumerator_first_method(template_enumerator);
                    if ((NIL == com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_passive_p_method(self)) && (NIL != com.cyc.cycjava.cycl.subloop_queues.queue_element_interface_p(template_current_item))) {
                        methods.funcall_instance_method_with_0_args(template_current_item, DEQUEUE_NOTIFY);
                    }
                    while (NIL == subloop_collections.basic_doubly_linked_list_enumerator_last_p_method(template_enumerator)) {
                        template_current_item = subloop_collections.basic_doubly_linked_list_enumerator_next_method(template_enumerator);
                        if ((NIL == com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_passive_p_method(self)) && (NIL != com.cyc.cycjava.cycl.subloop_queues.queue_element_interface_p(template_current_item))) {
                            methods.funcall_instance_method_with_0_args(template_current_item, DEQUEUE_NOTIFY);
                        }
                    } 
                }
                subloop_collections.basic_doubly_linked_list_deallocate_enumerator_method(template_resolved_list, template_enumerator);
            }
            if (NIL != new_contents) {
                subloop_collections.basic_doubly_linked_list_set_contents_method(template_resolved_list, new_contents);
                {
                    SubLObject cdolist_list_var = new_contents;
                    SubLObject new_item = NIL;
                    for (new_item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , new_item = cdolist_list_var.first()) {
                        if ((NIL == com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_passive_p_method(self)) && (NIL != com.cyc.cycjava.cycl.subloop_queues.queue_element_interface_p(new_item))) {
                            methods.funcall_instance_method_with_1_args(new_item, ENQUEUE_NOTIFY, self);
                        }
                    }
                }
            }
            return new_contents;
        }
    }

    public static SubLObject basic_doubly_linked_queue_set_contents_method(final SubLObject self, final SubLObject new_contents) {
        final SubLObject template_resolved_list = subloop_queues.basic_doubly_linked_queue_get_list_method(self);
        final SubLObject template_enumerator = subloop_collections.basic_doubly_linked_list_allocate_enumerator_method(template_resolved_list);
        if (NIL == subloop_collections.basic_doubly_linked_list_enumerator_empty_p_method(template_enumerator)) {
            SubLObject template_current_item = subloop_collections.basic_doubly_linked_list_enumerator_first_method(template_enumerator);
            if ((NIL == subloop_queues.basic_doubly_linked_queue_passive_p_method(self)) && (NIL != subloop_queues.queue_element_interface_p(template_current_item))) {
                methods.funcall_instance_method_with_0_args(template_current_item, DEQUEUE_NOTIFY);
            }
            while (NIL == subloop_collections.basic_doubly_linked_list_enumerator_last_p_method(template_enumerator)) {
                template_current_item = subloop_collections.basic_doubly_linked_list_enumerator_next_method(template_enumerator);
                if ((NIL == subloop_queues.basic_doubly_linked_queue_passive_p_method(self)) && (NIL != subloop_queues.queue_element_interface_p(template_current_item))) {
                    methods.funcall_instance_method_with_0_args(template_current_item, DEQUEUE_NOTIFY);
                }
            } 
            subloop_collections.basic_doubly_linked_list_deallocate_enumerator_method(template_resolved_list, template_enumerator);
        }
        if (NIL != new_contents) {
            subloop_collections.basic_doubly_linked_list_set_contents_method(template_resolved_list, new_contents);
            SubLObject cdolist_list_var = new_contents;
            SubLObject new_item = NIL;
            new_item = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ((NIL == subloop_queues.basic_doubly_linked_queue_passive_p_method(self)) && (NIL != subloop_queues.queue_element_interface_p(new_item))) {
                    methods.funcall_instance_method_with_1_args(new_item, ENQUEUE_NOTIFY, self);
                }
                cdolist_list_var = cdolist_list_var.rest();
                new_item = cdolist_list_var.first();
            } 
        }
        return new_contents;
    }

    public static final SubLObject basic_doubly_linked_queue_get_contents_method_alt(SubLObject self) {
        {
            SubLObject template_list = com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_get_list_internal_method(self);
            if (NIL != template_list) {
                return subloop_collections.basic_doubly_linked_list_get_contents_method(template_list);
            }
            return NIL;
        }
    }

    public static SubLObject basic_doubly_linked_queue_get_contents_method(final SubLObject self) {
        final SubLObject template_list = subloop_queues.basic_doubly_linked_queue_get_list_internal_method(self);
        if (NIL != template_list) {
            return subloop_collections.basic_doubly_linked_list_get_contents_method(template_list);
        }
        return NIL;
    }

    public static final SubLObject basic_doubly_linked_queue_get_element_count_method_alt(SubLObject self) {
        {
            SubLObject template_list = com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_get_list_internal_method(self);
            if (NIL != template_list) {
                return subloop_collections.basic_doubly_linked_list_get_element_count_method(template_list);
            }
            return ZERO_INTEGER;
        }
    }

    public static SubLObject basic_doubly_linked_queue_get_element_count_method(final SubLObject self) {
        final SubLObject template_list = subloop_queues.basic_doubly_linked_queue_get_list_internal_method(self);
        if (NIL != template_list) {
            return subloop_collections.basic_doubly_linked_list_get_element_count_method(template_list);
        }
        return ZERO_INTEGER;
    }

    public static final SubLObject basic_doubly_linked_queue_find_method_alt(SubLObject self, SubLObject key_value, SubLObject equality_pred, SubLObject key_accessor_function) {
        if (equality_pred == UNPROVIDED) {
            equality_pred = symbol_function(EQL);
        }
        if (key_accessor_function == UNPROVIDED) {
            key_accessor_function = symbol_function(IDENTITY);
        }
        {
            SubLObject template_list = com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_get_list_internal_method(self);
            if (NIL != template_list) {
                {
                    SubLObject template_enumerator = methods.funcall_instance_method_with_0_args(template_list, ALLOCATE_ENUMERATOR);
                    if (NIL != template_enumerator) {
                        if (NIL == methods.funcall_instance_method_with_0_args(template_enumerator, EMPTY_P)) {
                            {
                                SubLObject template_current_element = methods.funcall_instance_method_with_0_args(template_enumerator, FIRST);
                                if (NIL != funcall(equality_pred, key_value, funcall(key_accessor_function, template_current_element))) {
                                    methods.funcall_instance_method_with_1_args(template_list, DEALLOCATE_ENUMERATOR, template_enumerator);
                                    return template_current_element;
                                }
                                template_current_element = methods.funcall_instance_method_with_0_args(template_enumerator, NEXT);
                                while (NIL != template_current_element) {
                                    if (NIL != funcall(equality_pred, key_value, funcall(key_accessor_function, template_current_element))) {
                                        methods.funcall_instance_method_with_1_args(template_list, DEALLOCATE_ENUMERATOR, template_enumerator);
                                        return template_current_element;
                                    }
                                    template_current_element = methods.funcall_instance_method_with_0_args(template_enumerator, NEXT);
                                } 
                            }
                        }
                    }
                    methods.funcall_instance_method_with_1_args(template_list, DEALLOCATE_ENUMERATOR, template_enumerator);
                    return NIL;
                }
            }
            return NIL;
        }
    }

    public static SubLObject basic_doubly_linked_queue_find_method(final SubLObject self, final SubLObject key_value, SubLObject equality_pred, SubLObject key_accessor_function) {
        if (equality_pred == UNPROVIDED) {
            equality_pred = symbol_function(EQL);
        }
        if (key_accessor_function == UNPROVIDED) {
            key_accessor_function = symbol_function(IDENTITY);
        }
        final SubLObject template_list = subloop_queues.basic_doubly_linked_queue_get_list_internal_method(self);
        if (NIL != template_list) {
            final SubLObject template_enumerator = methods.funcall_instance_method_with_0_args(template_list, ALLOCATE_ENUMERATOR);
            if ((NIL != template_enumerator) && (NIL == methods.funcall_instance_method_with_0_args(template_enumerator, EMPTY_P))) {
                SubLObject template_current_element = methods.funcall_instance_method_with_0_args(template_enumerator, FIRST);
                if (NIL != funcall(equality_pred, key_value, funcall(key_accessor_function, template_current_element))) {
                    methods.funcall_instance_method_with_1_args(template_list, DEALLOCATE_ENUMERATOR, template_enumerator);
                    return template_current_element;
                }
                for (template_current_element = methods.funcall_instance_method_with_0_args(template_enumerator, NEXT); NIL != template_current_element; template_current_element = methods.funcall_instance_method_with_0_args(template_enumerator, NEXT)) {
                    if (NIL != funcall(equality_pred, key_value, funcall(key_accessor_function, template_current_element))) {
                        methods.funcall_instance_method_with_1_args(template_list, DEALLOCATE_ENUMERATOR, template_enumerator);
                        return template_current_element;
                    }
                }
            }
            methods.funcall_instance_method_with_1_args(template_list, DEALLOCATE_ENUMERATOR, template_enumerator);
            return NIL;
        }
        return NIL;
    }

    public static final SubLObject basic_doubly_linked_queue_dequeue_method_alt(SubLObject self) {
        {
            SubLObject template_list = com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_get_list_internal_method(self);
            if (NIL != template_list) {
                {
                    SubLObject template_prioritizer = com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_get_prioritizer_method(self);
                    if (NIL != template_prioritizer) {
                        methods.funcall_instance_method_with_1_args(template_prioritizer, ORDER_QUEUE, self);
                    }
                }
                {
                    SubLObject dequeued_item = subloop_collections.basic_doubly_linked_list_pop_method(template_list);
                    if ((NIL == com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_passive_p_method(self)) && (NIL != com.cyc.cycjava.cycl.subloop_queues.queue_element_interface_p(dequeued_item))) {
                        methods.funcall_instance_method_with_1_args(dequeued_item, DEQUEUE_NOTIFY, self);
                    }
                    return dequeued_item;
                }
            }
            return NIL;
        }
    }

    public static SubLObject basic_doubly_linked_queue_dequeue_method(final SubLObject self) {
        final SubLObject template_list = subloop_queues.basic_doubly_linked_queue_get_list_internal_method(self);
        if (NIL != template_list) {
            final SubLObject template_prioritizer = subloop_queues.basic_doubly_linked_queue_get_prioritizer_method(self);
            if (NIL != template_prioritizer) {
                methods.funcall_instance_method_with_1_args(template_prioritizer, subloop_queues.ORDER_QUEUE, self);
            }
            final SubLObject dequeued_item = subloop_collections.basic_doubly_linked_list_pop_method(template_list);
            if ((NIL == subloop_queues.basic_doubly_linked_queue_passive_p_method(self)) && (NIL != subloop_queues.queue_element_interface_p(dequeued_item))) {
                methods.funcall_instance_method_with_1_args(dequeued_item, DEQUEUE_NOTIFY, self);
            }
            return dequeued_item;
        }
        return NIL;
    }

    public static final SubLObject basic_doubly_linked_queue_remove_method_alt(SubLObject self, SubLObject old_element) {
        {
            SubLObject template_resolved_list = com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_get_list_method(self);
            subloop_collections.basic_doubly_linked_list_remove_method(template_resolved_list, old_element);
            if ((NIL == com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_passive_p_method(self)) && (NIL != com.cyc.cycjava.cycl.subloop_queues.queue_element_interface_p(old_element))) {
                methods.funcall_instance_method_with_1_args(old_element, REMOVE_NOTIFY, self);
            }
            return old_element;
        }
    }

    public static SubLObject basic_doubly_linked_queue_remove_method(final SubLObject self, final SubLObject old_element) {
        final SubLObject template_resolved_list = subloop_queues.basic_doubly_linked_queue_get_list_method(self);
        subloop_collections.basic_doubly_linked_list_remove_method(template_resolved_list, old_element);
        if ((NIL == subloop_queues.basic_doubly_linked_queue_passive_p_method(self)) && (NIL != subloop_queues.queue_element_interface_p(old_element))) {
            methods.funcall_instance_method_with_1_args(old_element, REMOVE_NOTIFY, self);
        }
        return old_element;
    }

    public static final SubLObject basic_doubly_linked_queue_on_enqueue_method_alt(SubLObject self, SubLObject new_element) {
        return NIL;
    }

    public static SubLObject basic_doubly_linked_queue_on_enqueue_method(final SubLObject self, final SubLObject new_element) {
        return NIL;
    }

    public static final SubLObject basic_doubly_linked_queue_enqueue_method_alt(SubLObject self, SubLObject new_element) {
        {
            SubLObject template_resolved_list = com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_get_list_method(self);
            subloop_collections.basic_doubly_linked_list_add_method(template_resolved_list, new_element);
            if ((NIL == com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_passive_p_method(self)) && (NIL != com.cyc.cycjava.cycl.subloop_queues.queue_element_interface_p(new_element))) {
                methods.funcall_instance_method_with_1_args(new_element, ENQUEUE_NOTIFY, self);
            }
            methods.funcall_instance_method_with_1_args(self, ON_ENQUEUE, new_element);
            return new_element;
        }
    }

    public static SubLObject basic_doubly_linked_queue_enqueue_method(final SubLObject self, final SubLObject new_element) {
        final SubLObject template_resolved_list = subloop_queues.basic_doubly_linked_queue_get_list_method(self);
        subloop_collections.basic_doubly_linked_list_add_method(template_resolved_list, new_element);
        if ((NIL == subloop_queues.basic_doubly_linked_queue_passive_p_method(self)) && (NIL != subloop_queues.queue_element_interface_p(new_element))) {
            methods.funcall_instance_method_with_1_args(new_element, ENQUEUE_NOTIFY, self);
        }
        methods.funcall_instance_method_with_1_args(self, ON_ENQUEUE, new_element);
        return new_element;
    }

    public static final SubLObject basic_doubly_linked_queue_empty_p_method_alt(SubLObject self) {
        {
            SubLObject template_list = com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_get_list_internal_method(self);
            return makeBoolean((NIL == template_list) || (NIL != subloop_collections.collection_template_empty_p(template_list)));
        }
    }

    public static SubLObject basic_doubly_linked_queue_empty_p_method(final SubLObject self) {
        final SubLObject template_list = subloop_queues.basic_doubly_linked_queue_get_list_internal_method(self);
        return makeBoolean((NIL == template_list) || (NIL != subloop_collections.collection_template_empty_p(template_list)));
    }

    public static final SubLObject basic_doubly_linked_queue_set_prioritizer_method_alt(SubLObject self, SubLObject new_prioritizer) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == new_prioritizer) {
                com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_set_prioritizer_internal_method(self, NIL);
                return NIL;
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == com.cyc.cycjava.cycl.subloop_queues.queue_prioritizer_interface_p(new_prioritizer)) {
                    Errors.error($str_alt159$_SET_PRIORITIZER__S____S_is_not_a, self, new_prioritizer);
                }
            }
            com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_set_prioritizer_internal_method(self, new_prioritizer);
            return new_prioritizer;
        }
    }

    public static SubLObject basic_doubly_linked_queue_set_prioritizer_method(final SubLObject self, final SubLObject new_prioritizer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == new_prioritizer) {
            subloop_queues.basic_doubly_linked_queue_set_prioritizer_internal_method(self, NIL);
            return NIL;
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subloop_queues.queue_prioritizer_interface_p(new_prioritizer))) {
            Errors.error(subloop_queues.$str159$_SET_PRIORITIZER__S____S_is_not_a, self, new_prioritizer);
        }
        subloop_queues.basic_doubly_linked_queue_set_prioritizer_internal_method(self, new_prioritizer);
        return new_prioritizer;
    }

    public static final SubLObject basic_doubly_linked_queue_get_prioritizer_method_alt(SubLObject self) {
        return com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_get_prioritizer_internal_method(self);
    }

    public static SubLObject basic_doubly_linked_queue_get_prioritizer_method(final SubLObject self) {
        return subloop_queues.basic_doubly_linked_queue_get_prioritizer_internal_method(self);
    }

    public static final SubLObject basic_doubly_linked_queue_print_method_alt(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject template_list = com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_get_list_internal_method(self);
            if (NIL == template_list) {
                format(stream, $str_alt214$DL_QUEUE___);
                return self;
            }
            {
                SubLObject template_enumerator = subloop_collections.basic_doubly_linked_list_allocate_enumerator_method(template_list);
                if (NIL == template_enumerator) {
                    format(stream, $str_alt215$___S_Class_is_not_correctly_imple, object.object_class_of_method(self));
                    return self;
                } else {
                    if (NIL != methods.funcall_instance_method_with_0_args(template_enumerator, EMPTY_P)) {
                        format(stream, $str_alt214$DL_QUEUE___);
                    } else {
                        format(stream, $str_alt216$DL_QUEUE___S, methods.funcall_instance_method_with_0_args(template_enumerator, FIRST));
                        while (NIL == methods.funcall_instance_method_with_0_args(template_enumerator, LAST_P)) {
                            format(stream, $str_alt125$___S, methods.funcall_instance_method_with_0_args(template_enumerator, NEXT));
                        } 
                        format(stream, $str_alt126$_);
                    }
                }
                subloop_collections.basic_doubly_linked_list_deallocate_enumerator_method(template_list, template_enumerator);
            }
            return self;
        }
    }

    public static SubLObject basic_doubly_linked_queue_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLObject template_list = subloop_queues.basic_doubly_linked_queue_get_list_internal_method(self);
        if (NIL == template_list) {
            format(stream, subloop_queues.$str214$DL_QUEUE___);
            return self;
        }
        final SubLObject template_enumerator = subloop_collections.basic_doubly_linked_list_allocate_enumerator_method(template_list);
        if (NIL == template_enumerator) {
            format(stream, subloop_queues.$str215$___S_Class_is_not_correctly_imple, object.object_class_of_method(self));
            return self;
        }
        if (NIL != methods.funcall_instance_method_with_0_args(template_enumerator, EMPTY_P)) {
            format(stream, subloop_queues.$str214$DL_QUEUE___);
        } else {
            format(stream, subloop_queues.$str216$DL_QUEUE___S, methods.funcall_instance_method_with_0_args(template_enumerator, FIRST));
            while (NIL == methods.funcall_instance_method_with_0_args(template_enumerator, LAST_P)) {
                format(stream, subloop_queues.$str125$___S, methods.funcall_instance_method_with_0_args(template_enumerator, NEXT));
            } 
            format(stream, subloop_queues.$str126$_);
        }
        subloop_collections.basic_doubly_linked_list_deallocate_enumerator_method(template_list, template_enumerator);
        return self;
    }

    public static final SubLObject basic_doubly_linked_queue_get_list_method_alt(SubLObject self) {
        {
            SubLObject template_list = com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_get_list_internal_method(self);
            if (NIL == com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_get_list_internal_method(self)) {
                template_list = object.object_new_method(BASIC_DOUBLY_LINKED_LIST);
                com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_set_list_internal_method(self, template_list);
            }
            return template_list;
        }
    }

    public static SubLObject basic_doubly_linked_queue_get_list_method(final SubLObject self) {
        SubLObject template_list = subloop_queues.basic_doubly_linked_queue_get_list_internal_method(self);
        if (NIL == subloop_queues.basic_doubly_linked_queue_get_list_internal_method(self)) {
            template_list = object.object_new_method(BASIC_DOUBLY_LINKED_LIST);
            subloop_queues.basic_doubly_linked_queue_set_list_internal_method(self, template_list);
        }
        return template_list;
    }

    public static final SubLObject basic_doubly_linked_queue_initialize_qua_doubly_linked_queue_method_alt(SubLObject self) {
        com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_set_list_internal_method(self, NIL);
        com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_set_prioritizer_internal_method(self, NIL);
        return self;
    }

    public static SubLObject basic_doubly_linked_queue_initialize_qua_doubly_linked_queue_method(final SubLObject self) {
        subloop_queues.basic_doubly_linked_queue_set_list_internal_method(self, NIL);
        subloop_queues.basic_doubly_linked_queue_set_prioritizer_internal_method(self, NIL);
        return self;
    }

    public static final SubLObject subloop_reserved_initialize_basic_doubly_linked_queue_class_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_basic_doubly_linked_queue_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_basic_doubly_linked_queue_instance_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_DOUBLY_LINKED_QUEUE, IS_PASSIVE, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_DOUBLY_LINKED_QUEUE, LIST, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_DOUBLY_LINKED_QUEUE, PRIORITIZER, NIL);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_basic_doubly_linked_queue_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_DOUBLY_LINKED_QUEUE, IS_PASSIVE, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_DOUBLY_LINKED_QUEUE, LIST, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_DOUBLY_LINKED_QUEUE, PRIORITIZER, NIL);
        return NIL;
    }

    public static final SubLObject basic_doubly_linked_queue_p_alt(SubLObject basic_doubly_linked_queue) {
        return classes.subloop_instanceof_class(basic_doubly_linked_queue, BASIC_DOUBLY_LINKED_QUEUE);
    }

    public static SubLObject basic_doubly_linked_queue_p(final SubLObject basic_doubly_linked_queue) {
        return classes.subloop_instanceof_class(basic_doubly_linked_queue, BASIC_DOUBLY_LINKED_QUEUE);
    }

    public static final SubLObject basic_doubly_linked_queue_get_list_internal_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_basic_doubly_linked_queue_method = NIL;
            SubLObject list = com.cyc.cycjava.cycl.subloop_queues.get_basic_doubly_linked_queue_list(self);
            try {
                try {
                    sublisp_throw($sym226$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD, list);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_queues.set_basic_doubly_linked_queue_list(self, list);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_basic_doubly_linked_queue_method = Errors.handleThrowable(ccatch_env_var, $sym226$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD);
            }
            return catch_var_for_basic_doubly_linked_queue_method;
        }
    }

    public static SubLObject basic_doubly_linked_queue_get_list_internal_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_doubly_linked_queue_method = NIL;
        final SubLObject list = subloop_queues.get_basic_doubly_linked_queue_list(self);
        try {
            thread.throwStack.push(subloop_queues.$sym226$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD);
            try {
                sublisp_throw(subloop_queues.$sym226$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD, list);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    subloop_queues.set_basic_doubly_linked_queue_list(self, list);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_doubly_linked_queue_method = Errors.handleThrowable(ccatch_env_var, subloop_queues.$sym226$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_doubly_linked_queue_method;
    }

    public static final SubLObject basic_doubly_linked_queue_set_list_internal_method_alt(SubLObject self, SubLObject new_list) {
        {
            SubLObject catch_var_for_basic_doubly_linked_queue_method = NIL;
            SubLObject list = com.cyc.cycjava.cycl.subloop_queues.get_basic_doubly_linked_queue_list(self);
            try {
                try {
                    list = new_list;
                    sublisp_throw($sym231$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD, new_list);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_queues.set_basic_doubly_linked_queue_list(self, list);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_basic_doubly_linked_queue_method = Errors.handleThrowable(ccatch_env_var, $sym231$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD);
            }
            return catch_var_for_basic_doubly_linked_queue_method;
        }
    }

    public static SubLObject basic_doubly_linked_queue_set_list_internal_method(final SubLObject self, final SubLObject new_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_doubly_linked_queue_method = NIL;
        SubLObject list = subloop_queues.get_basic_doubly_linked_queue_list(self);
        try {
            thread.throwStack.push(subloop_queues.$sym231$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD);
            try {
                list = new_list;
                sublisp_throw(subloop_queues.$sym231$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD, new_list);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    subloop_queues.set_basic_doubly_linked_queue_list(self, list);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_doubly_linked_queue_method = Errors.handleThrowable(ccatch_env_var, subloop_queues.$sym231$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_doubly_linked_queue_method;
    }

    public static final SubLObject basic_doubly_linked_queue_get_prioritizer_internal_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_basic_doubly_linked_queue_method = NIL;
            SubLObject prioritizer = com.cyc.cycjava.cycl.subloop_queues.get_basic_doubly_linked_queue_prioritizer(self);
            try {
                try {
                    sublisp_throw($sym234$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD, prioritizer);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_queues.set_basic_doubly_linked_queue_prioritizer(self, prioritizer);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_basic_doubly_linked_queue_method = Errors.handleThrowable(ccatch_env_var, $sym234$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD);
            }
            return catch_var_for_basic_doubly_linked_queue_method;
        }
    }

    public static SubLObject basic_doubly_linked_queue_get_prioritizer_internal_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_doubly_linked_queue_method = NIL;
        final SubLObject prioritizer = subloop_queues.get_basic_doubly_linked_queue_prioritizer(self);
        try {
            thread.throwStack.push(subloop_queues.$sym234$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD);
            try {
                sublisp_throw(subloop_queues.$sym234$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD, prioritizer);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    subloop_queues.set_basic_doubly_linked_queue_prioritizer(self, prioritizer);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_doubly_linked_queue_method = Errors.handleThrowable(ccatch_env_var, subloop_queues.$sym234$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_doubly_linked_queue_method;
    }

    public static final SubLObject basic_doubly_linked_queue_set_prioritizer_internal_method_alt(SubLObject self, SubLObject new_prioritizer) {
        {
            SubLObject catch_var_for_basic_doubly_linked_queue_method = NIL;
            SubLObject prioritizer = com.cyc.cycjava.cycl.subloop_queues.get_basic_doubly_linked_queue_prioritizer(self);
            try {
                try {
                    prioritizer = new_prioritizer;
                    sublisp_throw($sym238$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD, new_prioritizer);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_queues.set_basic_doubly_linked_queue_prioritizer(self, prioritizer);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_basic_doubly_linked_queue_method = Errors.handleThrowable(ccatch_env_var, $sym238$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD);
            }
            return catch_var_for_basic_doubly_linked_queue_method;
        }
    }

    public static SubLObject basic_doubly_linked_queue_set_prioritizer_internal_method(final SubLObject self, final SubLObject new_prioritizer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_doubly_linked_queue_method = NIL;
        SubLObject prioritizer = subloop_queues.get_basic_doubly_linked_queue_prioritizer(self);
        try {
            thread.throwStack.push(subloop_queues.$sym238$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD);
            try {
                prioritizer = new_prioritizer;
                sublisp_throw(subloop_queues.$sym238$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD, new_prioritizer);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    subloop_queues.set_basic_doubly_linked_queue_prioritizer(self, prioritizer);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_doubly_linked_queue_method = Errors.handleThrowable(ccatch_env_var, subloop_queues.$sym238$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_doubly_linked_queue_method;
    }

    public static final SubLObject basic_doubly_linked_queue_initialize_method_alt(SubLObject self) {
        object.object_initialize_method(self);
        com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_initialize_qua_doubly_linked_queue_method(self);
        return self;
    }

    public static SubLObject basic_doubly_linked_queue_initialize_method(final SubLObject self) {
        object.object_initialize_method(self);
        subloop_queues.basic_doubly_linked_queue_initialize_qua_doubly_linked_queue_method(self);
        return self;
    }

    public static final SubLObject basic_doubly_linked_queue_passive_p_method_alt(SubLObject self) {
        {
            SubLObject is_passive = com.cyc.cycjava.cycl.subloop_queues.get_basic_doubly_linked_queue_is_passive(self);
            return is_passive;
        }
    }

    public static SubLObject basic_doubly_linked_queue_passive_p_method(final SubLObject self) {
        final SubLObject is_passive = subloop_queues.get_basic_doubly_linked_queue_is_passive(self);
        return is_passive;
    }

    public static final SubLObject basic_doubly_linked_queue_set_passive_method_alt(SubLObject self, SubLObject flag) {
        {
            SubLObject catch_var_for_basic_doubly_linked_queue_method = NIL;
            SubLObject is_passive = com.cyc.cycjava.cycl.subloop_queues.get_basic_doubly_linked_queue_is_passive(self);
            try {
                try {
                    is_passive = flag;
                    sublisp_throw($sym243$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD, flag);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_queues.set_basic_doubly_linked_queue_is_passive(self, is_passive);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_basic_doubly_linked_queue_method = Errors.handleThrowable(ccatch_env_var, $sym243$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD);
            }
            return catch_var_for_basic_doubly_linked_queue_method;
        }
    }

    public static SubLObject basic_doubly_linked_queue_set_passive_method(final SubLObject self, final SubLObject flag) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_doubly_linked_queue_method = NIL;
        SubLObject is_passive = subloop_queues.get_basic_doubly_linked_queue_is_passive(self);
        try {
            thread.throwStack.push(subloop_queues.$sym243$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD);
            try {
                is_passive = flag;
                sublisp_throw(subloop_queues.$sym243$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD, flag);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    subloop_queues.set_basic_doubly_linked_queue_is_passive(self, is_passive);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_doubly_linked_queue_method = Errors.handleThrowable(ccatch_env_var, subloop_queues.$sym243$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_doubly_linked_queue_method;
    }

    public static final SubLObject get_asynch_basic_doubly_linked_queue_lock_history_alt(SubLObject asynch_basic_doubly_linked_queue) {
        return classes.subloop_get_instance_slot(asynch_basic_doubly_linked_queue, FOUR_INTEGER);
    }

    public static SubLObject get_asynch_basic_doubly_linked_queue_lock_history(final SubLObject asynch_basic_doubly_linked_queue) {
        return classes.subloop_get_instance_slot(asynch_basic_doubly_linked_queue, FOUR_INTEGER);
    }

    public static final SubLObject set_asynch_basic_doubly_linked_queue_lock_history_alt(SubLObject asynch_basic_doubly_linked_queue, SubLObject value) {
        return classes.subloop_set_instance_slot(asynch_basic_doubly_linked_queue, value, FOUR_INTEGER);
    }

    public static SubLObject set_asynch_basic_doubly_linked_queue_lock_history(final SubLObject asynch_basic_doubly_linked_queue, final SubLObject value) {
        return classes.subloop_set_instance_slot(asynch_basic_doubly_linked_queue, value, FOUR_INTEGER);
    }

    public static final SubLObject get_asynch_basic_doubly_linked_queue_lock_alt(SubLObject asynch_basic_doubly_linked_queue) {
        return classes.subloop_get_access_protected_instance_slot(asynch_basic_doubly_linked_queue, THREE_INTEGER, LOCK);
    }

    public static SubLObject get_asynch_basic_doubly_linked_queue_lock(final SubLObject asynch_basic_doubly_linked_queue) {
        return classes.subloop_get_access_protected_instance_slot(asynch_basic_doubly_linked_queue, THREE_INTEGER, LOCK);
    }

    public static final SubLObject set_asynch_basic_doubly_linked_queue_lock_alt(SubLObject asynch_basic_doubly_linked_queue, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(asynch_basic_doubly_linked_queue, value, THREE_INTEGER, LOCK);
    }

    public static SubLObject set_asynch_basic_doubly_linked_queue_lock(final SubLObject asynch_basic_doubly_linked_queue, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(asynch_basic_doubly_linked_queue, value, THREE_INTEGER, LOCK);
    }

    public static final SubLObject subloop_reserved_initialize_asynch_basic_doubly_linked_queue_class_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_asynch_basic_doubly_linked_queue_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_asynch_basic_doubly_linked_queue_instance_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_DOUBLY_LINKED_QUEUE, IS_PASSIVE, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_DOUBLY_LINKED_QUEUE, LIST, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_DOUBLY_LINKED_QUEUE, PRIORITIZER, NIL);
        classes.subloop_initialize_slot(new_instance, ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, LOCK_HISTORY, NIL);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_asynch_basic_doubly_linked_queue_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_DOUBLY_LINKED_QUEUE, IS_PASSIVE, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_DOUBLY_LINKED_QUEUE, LIST, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_DOUBLY_LINKED_QUEUE, PRIORITIZER, NIL);
        classes.subloop_initialize_slot(new_instance, ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, LOCK_HISTORY, NIL);
        return NIL;
    }

    public static final SubLObject asynch_basic_doubly_linked_queue_p_alt(SubLObject asynch_basic_doubly_linked_queue) {
        return classes.subloop_instanceof_class(asynch_basic_doubly_linked_queue, ASYNCH_BASIC_DOUBLY_LINKED_QUEUE);
    }

    public static SubLObject asynch_basic_doubly_linked_queue_p(final SubLObject asynch_basic_doubly_linked_queue) {
        return classes.subloop_instanceof_class(asynch_basic_doubly_linked_queue, ASYNCH_BASIC_DOUBLY_LINKED_QUEUE);
    }

    public static final SubLObject asynch_basic_doubly_linked_queue_initialize_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_asynch_basic_doubly_linked_queue_method = NIL;
            SubLObject lock_history = com.cyc.cycjava.cycl.subloop_queues.get_asynch_basic_doubly_linked_queue_lock_history(self);
            SubLObject lock = com.cyc.cycjava.cycl.subloop_queues.get_asynch_basic_doubly_linked_queue_lock(self);
            try {
                try {
                    com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_initialize_method(self);
                    lock = make_lock(format(NIL, $str_alt253$_S, self));
                    lock_history = NIL;
                    sublisp_throw($sym252$OUTER_CATCH_FOR_ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_queues.set_asynch_basic_doubly_linked_queue_lock_history(self, lock_history);
                            com.cyc.cycjava.cycl.subloop_queues.set_asynch_basic_doubly_linked_queue_lock(self, lock);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_asynch_basic_doubly_linked_queue_method = Errors.handleThrowable(ccatch_env_var, $sym252$OUTER_CATCH_FOR_ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_METHOD);
            }
            return catch_var_for_asynch_basic_doubly_linked_queue_method;
        }
    }

    public static SubLObject asynch_basic_doubly_linked_queue_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_asynch_basic_doubly_linked_queue_method = NIL;
        SubLObject lock_history = subloop_queues.get_asynch_basic_doubly_linked_queue_lock_history(self);
        SubLObject lock = subloop_queues.get_asynch_basic_doubly_linked_queue_lock(self);
        try {
            thread.throwStack.push(subloop_queues.$sym252$OUTER_CATCH_FOR_ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_METHOD);
            try {
                subloop_queues.basic_doubly_linked_queue_initialize_method(self);
                lock = make_lock(format(NIL, subloop_queues.$str253$_S, self));
                lock_history = NIL;
                sublisp_throw(subloop_queues.$sym252$OUTER_CATCH_FOR_ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    subloop_queues.set_asynch_basic_doubly_linked_queue_lock_history(self, lock_history);
                    subloop_queues.set_asynch_basic_doubly_linked_queue_lock(self, lock);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_asynch_basic_doubly_linked_queue_method = Errors.handleThrowable(ccatch_env_var, subloop_queues.$sym252$OUTER_CATCH_FOR_ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_asynch_basic_doubly_linked_queue_method;
    }

    public static final SubLObject asynch_basic_doubly_linked_queue_set_prioritizer_method_alt(SubLObject self, SubLObject new_prioritizer) {
        {
            SubLObject result = NIL;
            SubLObject lock = com.cyc.cycjava.cycl.subloop_queues.get_asynch_basic_doubly_linked_queue_lock(self);
            SubLObject lock_1 = lock;
            SubLObject release = NIL;
            try {
                release = seize_lock(lock_1);
                result = com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_set_prioritizer_method(self, new_prioritizer);
            } finally {
                if (NIL != release) {
                    release_lock(lock_1);
                }
            }
            return result;
        }
    }

    public static SubLObject asynch_basic_doubly_linked_queue_set_prioritizer_method(final SubLObject self, final SubLObject new_prioritizer) {
        SubLObject result = NIL;
        final SubLObject lock = subloop_queues.get_asynch_basic_doubly_linked_queue_lock(self);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            result = subloop_queues.basic_doubly_linked_queue_set_prioritizer_method(self, new_prioritizer);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return result;
    }

    public static final SubLObject asynch_basic_doubly_linked_queue_enqueue_method_alt(SubLObject self, SubLObject new_element) {
        {
            SubLObject result = NIL;
            SubLObject lock = com.cyc.cycjava.cycl.subloop_queues.get_asynch_basic_doubly_linked_queue_lock(self);
            SubLObject lock_history = com.cyc.cycjava.cycl.subloop_queues.get_asynch_basic_doubly_linked_queue_lock_history(self);
            lock_history = cons(list($WAITING, $ENQUEUE, new_element), lock_history);
            {
                SubLObject lock_2 = lock;
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock_2);
                    lock_history = cons(list($LOCKED, $ENQUEUE, new_element), lock_history);
                    result = com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_enqueue_method(self, new_element);
                    lock_history = cons(list($UNLOCKED, $ENQUEUE, new_element), lock_history);
                } finally {
                    if (NIL != release) {
                        release_lock(lock_2);
                    }
                }
            }
            com.cyc.cycjava.cycl.subloop_queues.set_asynch_basic_doubly_linked_queue_lock_history(self, lock_history);
            return result;
        }
    }

    public static SubLObject asynch_basic_doubly_linked_queue_enqueue_method(final SubLObject self, final SubLObject new_element) {
        SubLObject result = NIL;
        final SubLObject lock = subloop_queues.get_asynch_basic_doubly_linked_queue_lock(self);
        SubLObject lock_history = subloop_queues.get_asynch_basic_doubly_linked_queue_lock_history(self);
        lock_history = cons(list($WAITING, $ENQUEUE, new_element), lock_history);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            lock_history = cons(list($LOCKED, $ENQUEUE, new_element), lock_history);
            result = subloop_queues.basic_doubly_linked_queue_enqueue_method(self, new_element);
            lock_history = cons(list($UNLOCKED, $ENQUEUE, new_element), lock_history);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        subloop_queues.set_asynch_basic_doubly_linked_queue_lock_history(self, lock_history);
        return result;
    }

    public static final SubLObject asynch_basic_doubly_linked_queue_on_enqueue_method_alt(SubLObject self, SubLObject new_element) {
        return NIL;
    }

    public static SubLObject asynch_basic_doubly_linked_queue_on_enqueue_method(final SubLObject self, final SubLObject new_element) {
        return NIL;
    }

    public static final SubLObject asynch_basic_doubly_linked_queue_remove_method_alt(SubLObject self, SubLObject old_element) {
        {
            SubLObject result = NIL;
            SubLObject lock = com.cyc.cycjava.cycl.subloop_queues.get_asynch_basic_doubly_linked_queue_lock(self);
            SubLObject lock_history = com.cyc.cycjava.cycl.subloop_queues.get_asynch_basic_doubly_linked_queue_lock_history(self);
            lock_history = cons(list($WAITING, $REMOVE, old_element), lock_history);
            {
                SubLObject lock_3 = lock;
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock_3);
                    lock_history = cons(list($LOCKED, $REMOVE, old_element), lock_history);
                    result = com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_remove_method(self, old_element);
                    lock_history = cons(list($UNLOCKED, $REMOVE, old_element), lock_history);
                    com.cyc.cycjava.cycl.subloop_queues.set_asynch_basic_doubly_linked_queue_lock_history(self, lock_history);
                } finally {
                    if (NIL != release) {
                        release_lock(lock_3);
                    }
                }
            }
            com.cyc.cycjava.cycl.subloop_queues.set_asynch_basic_doubly_linked_queue_lock_history(self, lock_history);
            return result;
        }
    }

    public static SubLObject asynch_basic_doubly_linked_queue_remove_method(final SubLObject self, final SubLObject old_element) {
        SubLObject result = NIL;
        final SubLObject lock = subloop_queues.get_asynch_basic_doubly_linked_queue_lock(self);
        SubLObject lock_history = subloop_queues.get_asynch_basic_doubly_linked_queue_lock_history(self);
        lock_history = cons(list($WAITING, $REMOVE, old_element), lock_history);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            lock_history = cons(list($LOCKED, $REMOVE, old_element), lock_history);
            result = subloop_queues.basic_doubly_linked_queue_remove_method(self, old_element);
            lock_history = cons(list($UNLOCKED, $REMOVE, old_element), lock_history);
            subloop_queues.set_asynch_basic_doubly_linked_queue_lock_history(self, lock_history);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        subloop_queues.set_asynch_basic_doubly_linked_queue_lock_history(self, lock_history);
        return result;
    }

    public static final SubLObject asynch_basic_doubly_linked_queue_dequeue_method_alt(SubLObject self) {
        {
            SubLObject result = NIL;
            SubLObject lock = com.cyc.cycjava.cycl.subloop_queues.get_asynch_basic_doubly_linked_queue_lock(self);
            SubLObject lock_history = com.cyc.cycjava.cycl.subloop_queues.get_asynch_basic_doubly_linked_queue_lock_history(self);
            lock_history = cons(list($WAITING, $DEQUEUE), lock_history);
            {
                SubLObject lock_4 = lock;
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock_4);
                    lock_history = cons(list($LOCKED, $DEQUEUE), lock_history);
                    result = com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_dequeue_method(self);
                    lock_history = cons(list($UNLOCKED, $DEQUEUE, result), lock_history);
                } finally {
                    if (NIL != release) {
                        release_lock(lock_4);
                    }
                }
            }
            com.cyc.cycjava.cycl.subloop_queues.set_asynch_basic_doubly_linked_queue_lock_history(self, lock_history);
            return result;
        }
    }

    public static SubLObject asynch_basic_doubly_linked_queue_dequeue_method(final SubLObject self) {
        SubLObject result = NIL;
        final SubLObject lock = subloop_queues.get_asynch_basic_doubly_linked_queue_lock(self);
        SubLObject lock_history = subloop_queues.get_asynch_basic_doubly_linked_queue_lock_history(self);
        lock_history = cons(list($WAITING, $DEQUEUE), lock_history);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            lock_history = cons(list($LOCKED, $DEQUEUE), lock_history);
            result = subloop_queues.basic_doubly_linked_queue_dequeue_method(self);
            lock_history = cons(list($UNLOCKED, $DEQUEUE, result), lock_history);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        subloop_queues.set_asynch_basic_doubly_linked_queue_lock_history(self, lock_history);
        return result;
    }

    public static final SubLObject asynch_basic_doubly_linked_queue_set_contents_method_alt(SubLObject self, SubLObject new_contents) {
        {
            SubLObject result = NIL;
            SubLObject lock = com.cyc.cycjava.cycl.subloop_queues.get_asynch_basic_doubly_linked_queue_lock(self);
            SubLObject lock_history = com.cyc.cycjava.cycl.subloop_queues.get_asynch_basic_doubly_linked_queue_lock_history(self);
            lock_history = cons(list($WAITING, $SET_CONTENTS, new_contents), lock_history);
            {
                SubLObject lock_5 = lock;
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock_5);
                    lock_history = cons(list($LOCKED, $SET_CONTENTS, new_contents), lock_history);
                    result = com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_set_contents_method(self, new_contents);
                    lock_history = cons(list($UNLOCKED, $SET_CONTENTS, result), lock_history);
                } finally {
                    if (NIL != release) {
                        release_lock(lock_5);
                    }
                }
            }
            com.cyc.cycjava.cycl.subloop_queues.set_asynch_basic_doubly_linked_queue_lock_history(self, lock_history);
            return result;
        }
    }

    public static SubLObject asynch_basic_doubly_linked_queue_set_contents_method(final SubLObject self, final SubLObject new_contents) {
        SubLObject result = NIL;
        final SubLObject lock = subloop_queues.get_asynch_basic_doubly_linked_queue_lock(self);
        SubLObject lock_history = subloop_queues.get_asynch_basic_doubly_linked_queue_lock_history(self);
        lock_history = cons(list($WAITING, $SET_CONTENTS, new_contents), lock_history);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            lock_history = cons(list($LOCKED, $SET_CONTENTS, new_contents), lock_history);
            result = subloop_queues.basic_doubly_linked_queue_set_contents_method(self, new_contents);
            lock_history = cons(list($UNLOCKED, $SET_CONTENTS, result), lock_history);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        subloop_queues.set_asynch_basic_doubly_linked_queue_lock_history(self, lock_history);
        return result;
    }

    public static final SubLObject asynch_basic_doubly_linked_queue_clear_method_alt(SubLObject self) {
        {
            SubLObject lock = com.cyc.cycjava.cycl.subloop_queues.get_asynch_basic_doubly_linked_queue_lock(self);
            SubLObject lock_history = com.cyc.cycjava.cycl.subloop_queues.get_asynch_basic_doubly_linked_queue_lock_history(self);
            lock_history = cons(list($WAITING, $CLEAR), lock_history);
            {
                SubLObject lock_6 = lock;
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock_6);
                    lock_history = cons(list($LOCKED, $CLEAR), lock_history);
                    com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_clear_method(self);
                    lock_history = cons(list($UNLOCKED, $CLEAR), lock_history);
                } finally {
                    if (NIL != release) {
                        release_lock(lock_6);
                    }
                }
            }
            com.cyc.cycjava.cycl.subloop_queues.set_asynch_basic_doubly_linked_queue_lock_history(self, lock_history);
            return NIL;
        }
    }

    public static SubLObject asynch_basic_doubly_linked_queue_clear_method(final SubLObject self) {
        final SubLObject lock = subloop_queues.get_asynch_basic_doubly_linked_queue_lock(self);
        SubLObject lock_history = subloop_queues.get_asynch_basic_doubly_linked_queue_lock_history(self);
        lock_history = cons(list($WAITING, $CLEAR), lock_history);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            lock_history = cons(list($LOCKED, $CLEAR), lock_history);
            subloop_queues.basic_doubly_linked_queue_clear_method(self);
            lock_history = cons(list($UNLOCKED, $CLEAR), lock_history);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        subloop_queues.set_asynch_basic_doubly_linked_queue_lock_history(self, lock_history);
        return NIL;
    }

    public static final SubLObject get_basic_doubly_linked_ipc_queue_semaphore_alt(SubLObject basic_doubly_linked_ipc_queue) {
        return classes.subloop_get_access_protected_instance_slot(basic_doubly_linked_ipc_queue, FIVE_INTEGER, SEMAPHORE);
    }

    public static SubLObject get_basic_doubly_linked_ipc_queue_semaphore(final SubLObject basic_doubly_linked_ipc_queue) {
        return classes.subloop_get_access_protected_instance_slot(basic_doubly_linked_ipc_queue, FIVE_INTEGER, SEMAPHORE);
    }

    public static final SubLObject set_basic_doubly_linked_ipc_queue_semaphore_alt(SubLObject basic_doubly_linked_ipc_queue, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_doubly_linked_ipc_queue, value, FIVE_INTEGER, SEMAPHORE);
    }

    public static SubLObject set_basic_doubly_linked_ipc_queue_semaphore(final SubLObject basic_doubly_linked_ipc_queue, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_doubly_linked_ipc_queue, value, FIVE_INTEGER, SEMAPHORE);
    }

    public static final SubLObject get_basic_doubly_linked_ipc_queue_lock_alt(SubLObject basic_doubly_linked_ipc_queue) {
        return classes.subloop_get_access_protected_instance_slot(basic_doubly_linked_ipc_queue, FOUR_INTEGER, LOCK);
    }

    public static SubLObject get_basic_doubly_linked_ipc_queue_lock(final SubLObject basic_doubly_linked_ipc_queue) {
        return classes.subloop_get_access_protected_instance_slot(basic_doubly_linked_ipc_queue, FOUR_INTEGER, LOCK);
    }

    public static final SubLObject set_basic_doubly_linked_ipc_queue_lock_alt(SubLObject basic_doubly_linked_ipc_queue, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_doubly_linked_ipc_queue, value, FOUR_INTEGER, LOCK);
    }

    public static SubLObject set_basic_doubly_linked_ipc_queue_lock(final SubLObject basic_doubly_linked_ipc_queue, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_doubly_linked_ipc_queue, value, FOUR_INTEGER, LOCK);
    }

    public static final SubLObject get_basic_doubly_linked_ipc_queue_semaphore_name_alt(SubLObject basic_doubly_linked_ipc_queue) {
        return classes.subloop_get_access_protected_instance_slot(basic_doubly_linked_ipc_queue, THREE_INTEGER, SEMAPHORE_NAME);
    }

    public static SubLObject get_basic_doubly_linked_ipc_queue_semaphore_name(final SubLObject basic_doubly_linked_ipc_queue) {
        return classes.subloop_get_access_protected_instance_slot(basic_doubly_linked_ipc_queue, THREE_INTEGER, SEMAPHORE_NAME);
    }

    public static final SubLObject set_basic_doubly_linked_ipc_queue_semaphore_name_alt(SubLObject basic_doubly_linked_ipc_queue, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_doubly_linked_ipc_queue, value, THREE_INTEGER, SEMAPHORE_NAME);
    }

    public static SubLObject set_basic_doubly_linked_ipc_queue_semaphore_name(final SubLObject basic_doubly_linked_ipc_queue, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_doubly_linked_ipc_queue, value, THREE_INTEGER, SEMAPHORE_NAME);
    }

    public static final SubLObject get_basic_doubly_linked_ipc_queue_base_suffix_counter_alt(SubLObject basic_doubly_linked_ipc_queue) {
        {
            SubLObject v_class = (basic_doubly_linked_ipc_queue.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(basic_doubly_linked_ipc_queue))) : NIL != subloop_structures.class_p(basic_doubly_linked_ipc_queue) ? ((SubLObject) (basic_doubly_linked_ipc_queue)) : NIL != subloop_structures.instance_p(basic_doubly_linked_ipc_queue) ? ((SubLObject) (subloop_structures.instance_class(basic_doubly_linked_ipc_queue))) : NIL;
            if (NIL != v_class) {
                classes.classes_access_check_class_slot(v_class, slots.slot_assoc(BASE_SUFFIX_COUNTER, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
                return aref(subloop_structures.class_any_slots(v_class), TWO_INTEGER);
            }
            return NIL;
        }
    }

    public static SubLObject get_basic_doubly_linked_ipc_queue_base_suffix_counter(final SubLObject basic_doubly_linked_ipc_queue) {
        final SubLObject v_class = (basic_doubly_linked_ipc_queue.isSymbol()) ? classes.classes_retrieve_class(basic_doubly_linked_ipc_queue) : NIL != subloop_structures.class_p(basic_doubly_linked_ipc_queue) ? basic_doubly_linked_ipc_queue : NIL != subloop_structures.instance_p(basic_doubly_linked_ipc_queue) ? subloop_structures.instance_class(basic_doubly_linked_ipc_queue) : NIL;
        if (NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc(BASE_SUFFIX_COUNTER, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return aref(subloop_structures.class_any_slots(v_class), TWO_INTEGER);
        }
        return NIL;
    }

    public static final SubLObject set_basic_doubly_linked_ipc_queue_base_suffix_counter_alt(SubLObject basic_doubly_linked_ipc_queue, SubLObject value) {
        {
            SubLObject v_class = (basic_doubly_linked_ipc_queue.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(basic_doubly_linked_ipc_queue))) : NIL != subloop_structures.class_p(basic_doubly_linked_ipc_queue) ? ((SubLObject) (basic_doubly_linked_ipc_queue)) : NIL != subloop_structures.instance_p(basic_doubly_linked_ipc_queue) ? ((SubLObject) (subloop_structures.instance_class(basic_doubly_linked_ipc_queue))) : NIL;
            if (NIL != v_class) {
                classes.classes_access_check_class_slot(v_class, slots.slot_assoc(BASE_SUFFIX_COUNTER, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
                return set_aref(subloop_structures.class_any_slots(v_class), TWO_INTEGER, value);
            }
            return NIL;
        }
    }

    public static SubLObject set_basic_doubly_linked_ipc_queue_base_suffix_counter(final SubLObject basic_doubly_linked_ipc_queue, final SubLObject value) {
        final SubLObject v_class = (basic_doubly_linked_ipc_queue.isSymbol()) ? classes.classes_retrieve_class(basic_doubly_linked_ipc_queue) : NIL != subloop_structures.class_p(basic_doubly_linked_ipc_queue) ? basic_doubly_linked_ipc_queue : NIL != subloop_structures.instance_p(basic_doubly_linked_ipc_queue) ? subloop_structures.instance_class(basic_doubly_linked_ipc_queue) : NIL;
        if (NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc(BASE_SUFFIX_COUNTER, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return set_aref(subloop_structures.class_any_slots(v_class), TWO_INTEGER, value);
        }
        return NIL;
    }

    public static final SubLObject get_basic_doubly_linked_ipc_queue_base_name_alt(SubLObject basic_doubly_linked_ipc_queue) {
        {
            SubLObject v_class = (basic_doubly_linked_ipc_queue.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(basic_doubly_linked_ipc_queue))) : NIL != subloop_structures.class_p(basic_doubly_linked_ipc_queue) ? ((SubLObject) (basic_doubly_linked_ipc_queue)) : NIL != subloop_structures.instance_p(basic_doubly_linked_ipc_queue) ? ((SubLObject) (subloop_structures.instance_class(basic_doubly_linked_ipc_queue))) : NIL;
            if (NIL != v_class) {
                classes.classes_access_check_class_slot(v_class, slots.slot_assoc(BASE_NAME, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
                return aref(subloop_structures.class_any_slots(v_class), ONE_INTEGER);
            }
            return NIL;
        }
    }

    public static SubLObject get_basic_doubly_linked_ipc_queue_base_name(final SubLObject basic_doubly_linked_ipc_queue) {
        final SubLObject v_class = (basic_doubly_linked_ipc_queue.isSymbol()) ? classes.classes_retrieve_class(basic_doubly_linked_ipc_queue) : NIL != subloop_structures.class_p(basic_doubly_linked_ipc_queue) ? basic_doubly_linked_ipc_queue : NIL != subloop_structures.instance_p(basic_doubly_linked_ipc_queue) ? subloop_structures.instance_class(basic_doubly_linked_ipc_queue) : NIL;
        if (NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc(BASE_NAME, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return aref(subloop_structures.class_any_slots(v_class), ONE_INTEGER);
        }
        return NIL;
    }

    public static final SubLObject set_basic_doubly_linked_ipc_queue_base_name_alt(SubLObject basic_doubly_linked_ipc_queue, SubLObject value) {
        {
            SubLObject v_class = (basic_doubly_linked_ipc_queue.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(basic_doubly_linked_ipc_queue))) : NIL != subloop_structures.class_p(basic_doubly_linked_ipc_queue) ? ((SubLObject) (basic_doubly_linked_ipc_queue)) : NIL != subloop_structures.instance_p(basic_doubly_linked_ipc_queue) ? ((SubLObject) (subloop_structures.instance_class(basic_doubly_linked_ipc_queue))) : NIL;
            if (NIL != v_class) {
                classes.classes_access_check_class_slot(v_class, slots.slot_assoc(BASE_NAME, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
                return set_aref(subloop_structures.class_any_slots(v_class), ONE_INTEGER, value);
            }
            return NIL;
        }
    }

    public static SubLObject set_basic_doubly_linked_ipc_queue_base_name(final SubLObject basic_doubly_linked_ipc_queue, final SubLObject value) {
        final SubLObject v_class = (basic_doubly_linked_ipc_queue.isSymbol()) ? classes.classes_retrieve_class(basic_doubly_linked_ipc_queue) : NIL != subloop_structures.class_p(basic_doubly_linked_ipc_queue) ? basic_doubly_linked_ipc_queue : NIL != subloop_structures.instance_p(basic_doubly_linked_ipc_queue) ? subloop_structures.instance_class(basic_doubly_linked_ipc_queue) : NIL;
        if (NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc(BASE_NAME, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return set_aref(subloop_structures.class_any_slots(v_class), ONE_INTEGER, value);
        }
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_basic_doubly_linked_ipc_queue_class_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, BASIC_DOUBLY_LINKED_IPC_QUEUE, BASE_NAME, $str_alt283$BASIC_DOUBLY_LINKED_IPC_QUEUE);
        classes.subloop_initialize_slot(new_instance, BASIC_DOUBLY_LINKED_IPC_QUEUE, BASE_SUFFIX_COUNTER, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_basic_doubly_linked_ipc_queue_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, subloop_queues.BASIC_DOUBLY_LINKED_IPC_QUEUE, BASE_NAME, subloop_queues.$str283$BASIC_DOUBLY_LINKED_IPC_QUEUE);
        classes.subloop_initialize_slot(new_instance, subloop_queues.BASIC_DOUBLY_LINKED_IPC_QUEUE, BASE_SUFFIX_COUNTER, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_basic_doubly_linked_ipc_queue_instance_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_DOUBLY_LINKED_QUEUE, IS_PASSIVE, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_DOUBLY_LINKED_QUEUE, LIST, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_DOUBLY_LINKED_QUEUE, PRIORITIZER, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_DOUBLY_LINKED_IPC_QUEUE, SEMAPHORE_NAME, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_DOUBLY_LINKED_IPC_QUEUE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_DOUBLY_LINKED_IPC_QUEUE, SEMAPHORE, NIL);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_basic_doubly_linked_ipc_queue_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_DOUBLY_LINKED_QUEUE, IS_PASSIVE, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_DOUBLY_LINKED_QUEUE, LIST, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_DOUBLY_LINKED_QUEUE, PRIORITIZER, NIL);
        classes.subloop_initialize_slot(new_instance, subloop_queues.BASIC_DOUBLY_LINKED_IPC_QUEUE, SEMAPHORE_NAME, NIL);
        classes.subloop_initialize_slot(new_instance, subloop_queues.BASIC_DOUBLY_LINKED_IPC_QUEUE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, subloop_queues.BASIC_DOUBLY_LINKED_IPC_QUEUE, SEMAPHORE, NIL);
        return NIL;
    }

    public static final SubLObject basic_doubly_linked_ipc_queue_p_alt(SubLObject basic_doubly_linked_ipc_queue) {
        return classes.subloop_instanceof_class(basic_doubly_linked_ipc_queue, BASIC_DOUBLY_LINKED_IPC_QUEUE);
    }

    public static SubLObject basic_doubly_linked_ipc_queue_p(final SubLObject basic_doubly_linked_ipc_queue) {
        return classes.subloop_instanceof_class(basic_doubly_linked_ipc_queue, subloop_queues.BASIC_DOUBLY_LINKED_IPC_QUEUE);
    }

    public static final SubLObject basic_doubly_linked_ipc_queue_initialize_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_basic_doubly_linked_ipc_queue_method = NIL;
            SubLObject base_suffix_counter = com.cyc.cycjava.cycl.subloop_queues.get_basic_doubly_linked_ipc_queue_base_suffix_counter(self);
            SubLObject base_name = com.cyc.cycjava.cycl.subloop_queues.get_basic_doubly_linked_ipc_queue_base_name(self);
            SubLObject semaphore = com.cyc.cycjava.cycl.subloop_queues.get_basic_doubly_linked_ipc_queue_semaphore(self);
            SubLObject lock = com.cyc.cycjava.cycl.subloop_queues.get_basic_doubly_linked_ipc_queue_lock(self);
            SubLObject semaphore_name = com.cyc.cycjava.cycl.subloop_queues.get_basic_doubly_linked_ipc_queue_semaphore_name(self);
            try {
                try {
                    com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_initialize_method(self);
                    semaphore_name = format(NIL, $str_alt288$_A__S, base_name, base_suffix_counter);
                    base_suffix_counter = add(base_suffix_counter, ONE_INTEGER);
                    lock = cconcatenate($str_alt289$Lock_for_Queue_, semaphore_name);
                    semaphore = Semaphores.new_semaphore(semaphore_name, ZERO_INTEGER);
                    sublisp_throw($sym287$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_queues.set_basic_doubly_linked_ipc_queue_base_suffix_counter(self, base_suffix_counter);
                            com.cyc.cycjava.cycl.subloop_queues.set_basic_doubly_linked_ipc_queue_base_name(self, base_name);
                            com.cyc.cycjava.cycl.subloop_queues.set_basic_doubly_linked_ipc_queue_semaphore(self, semaphore);
                            com.cyc.cycjava.cycl.subloop_queues.set_basic_doubly_linked_ipc_queue_lock(self, lock);
                            com.cyc.cycjava.cycl.subloop_queues.set_basic_doubly_linked_ipc_queue_semaphore_name(self, semaphore_name);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_basic_doubly_linked_ipc_queue_method = Errors.handleThrowable(ccatch_env_var, $sym287$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD);
            }
            return catch_var_for_basic_doubly_linked_ipc_queue_method;
        }
    }

    public static SubLObject basic_doubly_linked_ipc_queue_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_doubly_linked_ipc_queue_method = NIL;
        SubLObject base_suffix_counter = subloop_queues.get_basic_doubly_linked_ipc_queue_base_suffix_counter(self);
        final SubLObject base_name = subloop_queues.get_basic_doubly_linked_ipc_queue_base_name(self);
        SubLObject semaphore = subloop_queues.get_basic_doubly_linked_ipc_queue_semaphore(self);
        SubLObject lock = subloop_queues.get_basic_doubly_linked_ipc_queue_lock(self);
        SubLObject semaphore_name = subloop_queues.get_basic_doubly_linked_ipc_queue_semaphore_name(self);
        try {
            thread.throwStack.push(subloop_queues.$sym287$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD);
            try {
                subloop_queues.basic_doubly_linked_queue_initialize_method(self);
                semaphore_name = format(NIL, subloop_queues.$str288$_A__S, base_name, base_suffix_counter);
                base_suffix_counter = add(base_suffix_counter, ONE_INTEGER);
                lock = cconcatenate(subloop_queues.$$$Lock_for_Queue_, semaphore_name);
                semaphore = Semaphores.new_semaphore(semaphore_name, ZERO_INTEGER);
                sublisp_throw(subloop_queues.$sym287$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    subloop_queues.set_basic_doubly_linked_ipc_queue_base_suffix_counter(self, base_suffix_counter);
                    subloop_queues.set_basic_doubly_linked_ipc_queue_base_name(self, base_name);
                    subloop_queues.set_basic_doubly_linked_ipc_queue_semaphore(self, semaphore);
                    subloop_queues.set_basic_doubly_linked_ipc_queue_lock(self, lock);
                    subloop_queues.set_basic_doubly_linked_ipc_queue_semaphore_name(self, semaphore_name);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_doubly_linked_ipc_queue_method = Errors.handleThrowable(ccatch_env_var, subloop_queues.$sym287$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_doubly_linked_ipc_queue_method;
    }

    public static final SubLObject basic_doubly_linked_ipc_queue_set_prioritizer_method_alt(SubLObject self, SubLObject new_prioritizer) {
        {
            SubLObject catch_var_for_basic_doubly_linked_ipc_queue_method = NIL;
            SubLObject lock = com.cyc.cycjava.cycl.subloop_queues.get_basic_doubly_linked_ipc_queue_lock(self);
            try {
                try {
                    {
                        SubLObject result = NIL;
                        SubLObject lock_7 = lock;
                        SubLObject release = NIL;
                        try {
                            release = seize_lock(lock_7);
                            result = com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_set_prioritizer_method(self, new_prioritizer);
                        } finally {
                            if (NIL != release) {
                                release_lock(lock_7);
                            }
                        }
                        sublisp_throw($sym292$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD, result);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_queues.set_basic_doubly_linked_ipc_queue_lock(self, lock);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_basic_doubly_linked_ipc_queue_method = Errors.handleThrowable(ccatch_env_var, $sym292$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD);
            }
            return catch_var_for_basic_doubly_linked_ipc_queue_method;
        }
    }

    public static SubLObject basic_doubly_linked_ipc_queue_set_prioritizer_method(final SubLObject self, final SubLObject new_prioritizer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_doubly_linked_ipc_queue_method = NIL;
        final SubLObject lock = subloop_queues.get_basic_doubly_linked_ipc_queue_lock(self);
        try {
            thread.throwStack.push(subloop_queues.$sym292$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD);
            try {
                SubLObject result = NIL;
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    result = subloop_queues.basic_doubly_linked_queue_set_prioritizer_method(self, new_prioritizer);
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
                sublisp_throw(subloop_queues.$sym292$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD, result);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    subloop_queues.set_basic_doubly_linked_ipc_queue_lock(self, lock);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_doubly_linked_ipc_queue_method = Errors.handleThrowable(ccatch_env_var, subloop_queues.$sym292$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_doubly_linked_ipc_queue_method;
    }

    public static final SubLObject basic_doubly_linked_ipc_queue_enqueue_method_alt(SubLObject self, SubLObject new_element) {
        {
            SubLObject catch_var_for_basic_doubly_linked_ipc_queue_method = NIL;
            SubLObject semaphore = com.cyc.cycjava.cycl.subloop_queues.get_basic_doubly_linked_ipc_queue_semaphore(self);
            SubLObject lock = com.cyc.cycjava.cycl.subloop_queues.get_basic_doubly_linked_ipc_queue_lock(self);
            try {
                try {
                    {
                        SubLObject result = NIL;
                        semaphores.v_semaphore(semaphore);
                        {
                            SubLObject lock_8 = lock;
                            SubLObject release = NIL;
                            try {
                                release = seize_lock(lock_8);
                                result = com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_enqueue_method(self, new_element);
                            } finally {
                                if (NIL != release) {
                                    release_lock(lock_8);
                                }
                            }
                        }
                        sublisp_throw($sym295$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD, result);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_queues.set_basic_doubly_linked_ipc_queue_semaphore(self, semaphore);
                            com.cyc.cycjava.cycl.subloop_queues.set_basic_doubly_linked_ipc_queue_lock(self, lock);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_basic_doubly_linked_ipc_queue_method = Errors.handleThrowable(ccatch_env_var, $sym295$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD);
            }
            return catch_var_for_basic_doubly_linked_ipc_queue_method;
        }
    }

    public static SubLObject basic_doubly_linked_ipc_queue_enqueue_method(final SubLObject self, final SubLObject new_element) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_doubly_linked_ipc_queue_method = NIL;
        final SubLObject semaphore = subloop_queues.get_basic_doubly_linked_ipc_queue_semaphore(self);
        final SubLObject lock = subloop_queues.get_basic_doubly_linked_ipc_queue_lock(self);
        try {
            thread.throwStack.push(subloop_queues.$sym295$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD);
            try {
                SubLObject result = NIL;
                semaphores.v_semaphore(semaphore);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    result = subloop_queues.basic_doubly_linked_queue_enqueue_method(self, new_element);
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
                sublisp_throw(subloop_queues.$sym295$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD, result);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    subloop_queues.set_basic_doubly_linked_ipc_queue_semaphore(self, semaphore);
                    subloop_queues.set_basic_doubly_linked_ipc_queue_lock(self, lock);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_doubly_linked_ipc_queue_method = Errors.handleThrowable(ccatch_env_var, subloop_queues.$sym295$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_doubly_linked_ipc_queue_method;
    }

    public static final SubLObject basic_doubly_linked_ipc_queue_remove_method_alt(SubLObject self, SubLObject old_element) {
        {
            SubLObject catch_var_for_basic_doubly_linked_ipc_queue_method = NIL;
            SubLObject semaphore = com.cyc.cycjava.cycl.subloop_queues.get_basic_doubly_linked_ipc_queue_semaphore(self);
            SubLObject lock = com.cyc.cycjava.cycl.subloop_queues.get_basic_doubly_linked_ipc_queue_lock(self);
            try {
                try {
                    {
                        SubLObject result = NIL;
                        SubLObject lock_9 = lock;
                        SubLObject release = NIL;
                        try {
                            release = seize_lock(lock_9);
                            result = com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_remove_method(self, old_element);
                        } finally {
                            if (NIL != release) {
                                release_lock(lock_9);
                            }
                        }
                        semaphores.p_semaphore(semaphore);
                        sublisp_throw($sym298$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD, result);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_queues.set_basic_doubly_linked_ipc_queue_semaphore(self, semaphore);
                            com.cyc.cycjava.cycl.subloop_queues.set_basic_doubly_linked_ipc_queue_lock(self, lock);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_basic_doubly_linked_ipc_queue_method = Errors.handleThrowable(ccatch_env_var, $sym298$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD);
            }
            return catch_var_for_basic_doubly_linked_ipc_queue_method;
        }
    }

    public static SubLObject basic_doubly_linked_ipc_queue_remove_method(final SubLObject self, final SubLObject old_element) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_doubly_linked_ipc_queue_method = NIL;
        final SubLObject semaphore = subloop_queues.get_basic_doubly_linked_ipc_queue_semaphore(self);
        final SubLObject lock = subloop_queues.get_basic_doubly_linked_ipc_queue_lock(self);
        try {
            thread.throwStack.push(subloop_queues.$sym298$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD);
            try {
                SubLObject result = NIL;
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    result = subloop_queues.basic_doubly_linked_queue_remove_method(self, old_element);
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
                semaphores.p_semaphore(semaphore);
                sublisp_throw(subloop_queues.$sym298$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD, result);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    subloop_queues.set_basic_doubly_linked_ipc_queue_semaphore(self, semaphore);
                    subloop_queues.set_basic_doubly_linked_ipc_queue_lock(self, lock);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_doubly_linked_ipc_queue_method = Errors.handleThrowable(ccatch_env_var, subloop_queues.$sym298$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_doubly_linked_ipc_queue_method;
    }

    public static final SubLObject basic_doubly_linked_ipc_queue_dequeue_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_basic_doubly_linked_ipc_queue_method = NIL;
            SubLObject semaphore = com.cyc.cycjava.cycl.subloop_queues.get_basic_doubly_linked_ipc_queue_semaphore(self);
            SubLObject lock = com.cyc.cycjava.cycl.subloop_queues.get_basic_doubly_linked_ipc_queue_lock(self);
            try {
                try {
                    {
                        SubLObject result = NIL;
                        SubLObject lock_10 = lock;
                        SubLObject release = NIL;
                        try {
                            release = seize_lock(lock_10);
                            result = com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_dequeue_method(self);
                        } finally {
                            if (NIL != release) {
                                release_lock(lock_10);
                            }
                        }
                        semaphores.p_semaphore(semaphore);
                        sublisp_throw($sym301$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD, result);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_queues.set_basic_doubly_linked_ipc_queue_semaphore(self, semaphore);
                            com.cyc.cycjava.cycl.subloop_queues.set_basic_doubly_linked_ipc_queue_lock(self, lock);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_basic_doubly_linked_ipc_queue_method = Errors.handleThrowable(ccatch_env_var, $sym301$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD);
            }
            return catch_var_for_basic_doubly_linked_ipc_queue_method;
        }
    }

    public static SubLObject basic_doubly_linked_ipc_queue_dequeue_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_doubly_linked_ipc_queue_method = NIL;
        final SubLObject semaphore = subloop_queues.get_basic_doubly_linked_ipc_queue_semaphore(self);
        final SubLObject lock = subloop_queues.get_basic_doubly_linked_ipc_queue_lock(self);
        try {
            thread.throwStack.push(subloop_queues.$sym301$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD);
            try {
                SubLObject result = NIL;
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    result = subloop_queues.basic_doubly_linked_queue_dequeue_method(self);
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
                semaphores.p_semaphore(semaphore);
                sublisp_throw(subloop_queues.$sym301$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD, result);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    subloop_queues.set_basic_doubly_linked_ipc_queue_semaphore(self, semaphore);
                    subloop_queues.set_basic_doubly_linked_ipc_queue_lock(self, lock);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_doubly_linked_ipc_queue_method = Errors.handleThrowable(ccatch_env_var, subloop_queues.$sym301$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_doubly_linked_ipc_queue_method;
    }

    public static final SubLObject basic_doubly_linked_ipc_queue_set_contents_method_alt(SubLObject self, SubLObject new_contents) {
        {
            SubLObject catch_var_for_basic_doubly_linked_ipc_queue_method = NIL;
            SubLObject lock = com.cyc.cycjava.cycl.subloop_queues.get_basic_doubly_linked_ipc_queue_lock(self);
            try {
                try {
                    {
                        SubLObject result = NIL;
                        SubLObject lock_11 = lock;
                        SubLObject release = NIL;
                        try {
                            release = seize_lock(lock_11);
                            result = com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_set_contents_method(self, new_contents);
                        } finally {
                            if (NIL != release) {
                                release_lock(lock_11);
                            }
                        }
                        sublisp_throw($sym304$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD, result);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_queues.set_basic_doubly_linked_ipc_queue_lock(self, lock);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_basic_doubly_linked_ipc_queue_method = Errors.handleThrowable(ccatch_env_var, $sym304$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD);
            }
            return catch_var_for_basic_doubly_linked_ipc_queue_method;
        }
    }

    public static SubLObject basic_doubly_linked_ipc_queue_set_contents_method(final SubLObject self, final SubLObject new_contents) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_doubly_linked_ipc_queue_method = NIL;
        final SubLObject lock = subloop_queues.get_basic_doubly_linked_ipc_queue_lock(self);
        try {
            thread.throwStack.push(subloop_queues.$sym304$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD);
            try {
                SubLObject result = NIL;
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    result = subloop_queues.basic_doubly_linked_queue_set_contents_method(self, new_contents);
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
                sublisp_throw(subloop_queues.$sym304$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD, result);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    subloop_queues.set_basic_doubly_linked_ipc_queue_lock(self, lock);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_doubly_linked_ipc_queue_method = Errors.handleThrowable(ccatch_env_var, subloop_queues.$sym304$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_doubly_linked_ipc_queue_method;
    }

    static private final SubLList $list_alt1 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ENQUEUE-NOTIFY"), list(makeSymbol("QUEUE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEQUEUE-NOTIFY"), list(makeSymbol("QUEUE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-NOTIFY"), list(makeSymbol("QUEUE")), makeKeyword("PUBLIC")));

    static private final SubLList $list_alt3 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ORDER-QUEUE"), list(makeSymbol("QUEUE")), makeKeyword("PUBLIC")));

    static private final SubLList $list_alt5 = list(makeSymbol("QUEUE-PRIORITIZER-INTERFACE"));

    static private final SubLList $list_alt6 = list(makeKeyword("EXTENDS"), list(makeSymbol("QUEUE-PRIORITIZER-INTERFACE")));

    public static final SubLObject basic_doubly_linked_ipc_queue_clear_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_basic_doubly_linked_ipc_queue_method = NIL;
            SubLObject semaphore = com.cyc.cycjava.cycl.subloop_queues.get_basic_doubly_linked_ipc_queue_semaphore(self);
            SubLObject lock = com.cyc.cycjava.cycl.subloop_queues.get_basic_doubly_linked_ipc_queue_lock(self);
            try {
                try {
                    while (NIL == com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_empty_p_method(self)) {
                        semaphores.p_semaphore(semaphore);
                        {
                            SubLObject lock_12 = lock;
                            SubLObject release = NIL;
                            try {
                                release = seize_lock(lock_12);
                                com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_ipc_queue_dequeue_method(self);
                            } finally {
                                if (NIL != release) {
                                    release_lock(lock_12);
                                }
                            }
                        }
                    } 
                    sublisp_throw($sym307$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_queues.set_basic_doubly_linked_ipc_queue_semaphore(self, semaphore);
                            com.cyc.cycjava.cycl.subloop_queues.set_basic_doubly_linked_ipc_queue_lock(self, lock);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_basic_doubly_linked_ipc_queue_method = Errors.handleThrowable(ccatch_env_var, $sym307$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD);
            }
            return catch_var_for_basic_doubly_linked_ipc_queue_method;
        }
    }

    public static SubLObject basic_doubly_linked_ipc_queue_clear_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_doubly_linked_ipc_queue_method = NIL;
        final SubLObject semaphore = subloop_queues.get_basic_doubly_linked_ipc_queue_semaphore(self);
        final SubLObject lock = subloop_queues.get_basic_doubly_linked_ipc_queue_lock(self);
        try {
            thread.throwStack.push(subloop_queues.$sym307$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD);
            try {
                while (NIL == subloop_queues.basic_doubly_linked_queue_empty_p_method(self)) {
                    semaphores.p_semaphore(semaphore);
                    SubLObject release = NIL;
                    try {
                        release = seize_lock(lock);
                        subloop_queues.basic_doubly_linked_ipc_queue_dequeue_method(self);
                    } finally {
                        if (NIL != release) {
                            release_lock(lock);
                        }
                    }
                } 
                sublisp_throw(subloop_queues.$sym307$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    subloop_queues.set_basic_doubly_linked_ipc_queue_semaphore(self, semaphore);
                    subloop_queues.set_basic_doubly_linked_ipc_queue_lock(self, lock);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_doubly_linked_ipc_queue_method = Errors.handleThrowable(ccatch_env_var, subloop_queues.$sym307$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_doubly_linked_ipc_queue_method;
    }

    static private final SubLList $list_alt7 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ORDER-QUEUE-INTERNAL"), list(makeSymbol("CONTENTS")), makeKeyword("PROTECTED")));

    static private final SubLList $list_alt9 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt10 = list(makeSymbol("QUEUE"));

    static private final SubLList $list_alt11 = list(list(makeSymbol("MUST"), list(makeSymbol("QUEUE-INTERFACE-P"), makeSymbol("QUEUE")), makeString("(ORDER-QUEUE ~S): ~S is not an instance of QUEUE-INTERFACE."), makeSymbol("SELF"), makeSymbol("QUEUE")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("QUEUE-INTERFACE-GET-CONTENTS"), makeSymbol("QUEUE")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENTS-ORDERED"), list(makeSymbol("ORDER-QUEUE-INTERNAL"), makeSymbol("SELF"), makeSymbol("TEMPLATE-CONTENTS")))), list(makeSymbol("QUEUE-INTERFACE-REORDER-CONTENTS"), makeSymbol("QUEUE"), makeSymbol("TEMPLATE-CONTENTS-ORDERED"))))), list(RET, NIL));

    static private final SubLList $list_alt13 = list(makeSymbol("QUEUE-PRIORITIZER-TEMPLATE"));

    static private final SubLList $list_alt14 = list(makeKeyword("EXTENDS"), list(makeSymbol("QUEUE-PRIORITIZER-TEMPLATE")));

    static private final SubLList $list_alt15 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SORT-PREDICATE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SORT-PREDICATE"), list(makeSymbol("NEW-PREDICATE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ELEMENT-KEY"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ELEMENT-KEY"), list(makeSymbol("NEW-KEY-FUNCTION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ORDER-QUEUE-INTERNAL"), list(makeSymbol("CONTENTS")), makeKeyword("PROTECTED")));

    public static final SubLObject get_basic_ipc_queue_prioritizer_alt(SubLObject basic_ipc_queue) {
        return classes.subloop_get_access_protected_instance_slot(basic_ipc_queue, TWO_INTEGER, PRIORITIZER);
    }

    public static SubLObject get_basic_ipc_queue_prioritizer(final SubLObject basic_ipc_queue) {
        return classes.subloop_get_access_protected_instance_slot(basic_ipc_queue, TWO_INTEGER, PRIORITIZER);
    }

    static private final SubLList $list_alt17 = list(makeKeyword("PROTECTED"));

    public static final SubLObject set_basic_ipc_queue_prioritizer_alt(SubLObject basic_ipc_queue, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_ipc_queue, value, TWO_INTEGER, PRIORITIZER);
    }

    public static SubLObject set_basic_ipc_queue_prioritizer(final SubLObject basic_ipc_queue, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_ipc_queue, value, TWO_INTEGER, PRIORITIZER);
    }

    static private final SubLList $list_alt18 = list(makeSymbol("CONTENTS"));

    static private final SubLList $list_alt19 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PREDICATE"), list(makeSymbol("GET-SORT-PREDICATE"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-KEY-FUNCTION"), list(makeSymbol("GET-ELEMENT-KEY"), makeSymbol("SELF")))), list(makeSymbol("MUST"), makeSymbol("TEMPLATE-PREDICATE"), makeString("(ORDER-QUEUE-INTERNAL ~S): No ordering predicate has been associated with this prioritizer."), makeSymbol("SELF")), list(makeSymbol("PUNLESS"), makeSymbol("TEMPLATE-KEY-FUNCTION"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-KEY-FUNCTION"), list(makeSymbol("FUNCTION"), IDENTITY))), list(RET, list(makeSymbol("SORT"), makeSymbol("CONTENTS"), makeSymbol("TEMPLATE-PREDICATE"), makeSymbol("TEMPLATE-KEY-FUNCTION")))));

    public static final SubLObject get_basic_ipc_queue_actual_ipc_queue_alt(SubLObject basic_ipc_queue) {
        return classes.subloop_get_access_protected_instance_slot(basic_ipc_queue, ONE_INTEGER, ACTUAL_IPC_QUEUE);
    }

    public static SubLObject get_basic_ipc_queue_actual_ipc_queue(final SubLObject basic_ipc_queue) {
        return classes.subloop_get_access_protected_instance_slot(basic_ipc_queue, ONE_INTEGER, ACTUAL_IPC_QUEUE);
    }

    public static final SubLObject set_basic_ipc_queue_actual_ipc_queue_alt(SubLObject basic_ipc_queue, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_ipc_queue, value, ONE_INTEGER, ACTUAL_IPC_QUEUE);
    }

    public static SubLObject set_basic_ipc_queue_actual_ipc_queue(final SubLObject basic_ipc_queue, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_ipc_queue, value, ONE_INTEGER, ACTUAL_IPC_QUEUE);
    }

    public static final SubLObject get_basic_ipc_queue_is_passive_alt(SubLObject basic_ipc_queue) {
        {
            SubLObject v_class = subloop_structures.instance_class(basic_ipc_queue);
            SubLObject slot = slots.slot_assoc(IS_PASSIVE, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, basic_ipc_queue, slot);
        }
        return classes.ldb_test($int$4097, subloop_structures.instance_boolean_slots(basic_ipc_queue));
    }

    public static SubLObject get_basic_ipc_queue_is_passive(final SubLObject basic_ipc_queue) {
        final SubLObject v_class = subloop_structures.instance_class(basic_ipc_queue);
        final SubLObject slot = slots.slot_assoc(IS_PASSIVE, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
        instances.instances_access_check_instance_slot(v_class, basic_ipc_queue, slot);
        return classes.ldb_test(subloop_queues.$int$4097, subloop_structures.instance_boolean_slots(basic_ipc_queue));
    }

    static private final SubLList $list_alt22 = list(makeSymbol("QUEUE-SIMPLE-SORTER-TEMPLATE"));

    static private final SubLList $list_alt23 = list(new SubLObject[]{ list(makeSymbol("SORT-PREDICATE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("ELEMENT-KEY-FUNCTION"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SORT-PREDICATE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SORT-PREDICATE"), list(makeSymbol("NEW-PREDICATE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ELEMENT-KEY"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ELEMENT-KEY"), list(makeSymbol("NEW-KEY-FUNCTION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ORDER-QUEUE"), list(makeSymbol("QUEUE")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ORDER-QUEUE-INTERNAL"), list(makeSymbol("CONTENTS")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")) });

    public static final SubLObject set_basic_ipc_queue_is_passive_alt(SubLObject basic_ipc_queue, SubLObject value) {
        {
            SubLObject v_class = subloop_structures.instance_class(basic_ipc_queue);
            SubLObject slot = slots.slot_assoc(IS_PASSIVE, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, basic_ipc_queue, slot);
        }
        subloop_structures._csetf_instance_boolean_slots(basic_ipc_queue, bytes.dpb(NIL != value ? ((SubLObject) (ONE_INTEGER)) : ZERO_INTEGER, $int$4097, subloop_structures.instance_boolean_slots(basic_ipc_queue)));
        return value;
    }

    public static SubLObject set_basic_ipc_queue_is_passive(final SubLObject basic_ipc_queue, final SubLObject value) {
        final SubLObject v_class = subloop_structures.instance_class(basic_ipc_queue);
        final SubLObject slot = slots.slot_assoc(IS_PASSIVE, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
        instances.instances_access_check_instance_slot(v_class, basic_ipc_queue, slot);
        subloop_structures._csetf_instance_boolean_slots(basic_ipc_queue, bytes.dpb(NIL != value ? ONE_INTEGER : ZERO_INTEGER, subloop_queues.$int$4097, subloop_structures.instance_boolean_slots(basic_ipc_queue)));
        return value;
    }

    public static final SubLObject basic_ipc_queue_on_enqueue_method_alt(SubLObject self, SubLObject new_element) {
        return NIL;
    }

    public static SubLObject basic_ipc_queue_on_enqueue_method(final SubLObject self, final SubLObject new_element) {
        return NIL;
    }

    public static final SubLObject basic_ipc_queue_print_method_alt(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject template_contents = com.cyc.cycjava.cycl.subloop_queues.basic_ipc_queue_get_contents_method(self);
            if (NIL == template_contents) {
                format(stream, $str_alt122$QUEUE___);
            } else {
                if (NIL == template_contents.rest()) {
                    format(stream, $str_alt123$QUEUE___S_, template_contents.first());
                } else {
                    format(stream, $str_alt124$QUEUE___S, template_contents.first());
                    {
                        SubLObject cdolist_list_var = template_contents.rest();
                        SubLObject element = NIL;
                        for (element = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , element = cdolist_list_var.first()) {
                            format(stream, $str_alt125$___S, element);
                        }
                    }
                    format(stream, $str_alt126$_);
                }
            }
            return self;
        }
    }

    public static SubLObject basic_ipc_queue_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLObject template_contents = subloop_queues.basic_ipc_queue_get_contents_method(self);
        if (NIL == template_contents) {
            format(stream, subloop_queues.$str122$QUEUE___);
        } else
            if (NIL == template_contents.rest()) {
                format(stream, subloop_queues.$str123$QUEUE___S_, template_contents.first());
            } else {
                format(stream, subloop_queues.$str124$QUEUE___S, template_contents.first());
                SubLObject cdolist_list_var = template_contents.rest();
                SubLObject element = NIL;
                element = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    format(stream, subloop_queues.$str125$___S, element);
                    cdolist_list_var = cdolist_list_var.rest();
                    element = cdolist_list_var.first();
                } 
                format(stream, subloop_queues.$str126$_);
            }

        return self;
    }

    static private final SubLString $str_alt26$_ORDER_QUEUE_INTERNAL__S___No_ord = makeString("(ORDER-QUEUE-INTERNAL ~S): No ordering predicate has been associated with this prioritizer.");

    static private final SubLString $str_alt28$_ORDER_QUEUE__S____S_is_not_an_in = makeString("(ORDER-QUEUE ~S): ~S is not an instance of QUEUE-INTERFACE.");

    public static final SubLObject subloop_reserved_initialize_basic_ipc_queue_class_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_basic_ipc_queue_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_basic_ipc_queue_instance_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_IPC_QUEUE, IS_PASSIVE, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_IPC_QUEUE, ACTUAL_IPC_QUEUE, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_IPC_QUEUE, PRIORITIZER, NIL);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_basic_ipc_queue_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, subloop_queues.BASIC_IPC_QUEUE, IS_PASSIVE, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, subloop_queues.BASIC_IPC_QUEUE, ACTUAL_IPC_QUEUE, NIL);
        classes.subloop_initialize_slot(new_instance, subloop_queues.BASIC_IPC_QUEUE, PRIORITIZER, NIL);
        return NIL;
    }

    static private final SubLList $list_alt36 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("SORT-PREDICATE"), NIL), list(makeSymbol("CSETQ"), makeSymbol("ELEMENT-KEY-FUNCTION"), NIL), list(RET, makeSymbol("SELF")));

    public static final SubLObject basic_ipc_queue_p_alt(SubLObject basic_ipc_queue) {
        return classes.subloop_instanceof_class(basic_ipc_queue, BASIC_IPC_QUEUE);
    }

    public static SubLObject basic_ipc_queue_p(final SubLObject basic_ipc_queue) {
        return classes.subloop_instanceof_class(basic_ipc_queue, subloop_queues.BASIC_IPC_QUEUE);
    }

    static private final SubLList $list_alt40 = list(list(RET, makeSymbol("SORT-PREDICATE")));

    public static final SubLObject basic_ipc_queue_initialize_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_basic_ipc_queue_method = NIL;
            SubLObject actual_ipc_queue = com.cyc.cycjava.cycl.subloop_queues.get_basic_ipc_queue_actual_ipc_queue(self);
            SubLObject instance_number = object.get_object_instance_number(self);
            try {
                try {
                    object.object_initialize_method(self);
                    actual_ipc_queue = process_utilities.new_ipc_queue(cconcatenate($str_alt318$BASIC_IPC_QUEUE_, string_utilities.to_string(instance_number)));
                    sublisp_throw($sym317$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_queues.set_basic_ipc_queue_actual_ipc_queue(self, actual_ipc_queue);
                            object.set_object_instance_number(self, instance_number);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_basic_ipc_queue_method = Errors.handleThrowable(ccatch_env_var, $sym317$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD);
            }
            return catch_var_for_basic_ipc_queue_method;
        }
    }

    public static SubLObject basic_ipc_queue_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_ipc_queue_method = NIL;
        SubLObject actual_ipc_queue = subloop_queues.get_basic_ipc_queue_actual_ipc_queue(self);
        final SubLObject instance_number = object.get_object_instance_number(self);
        try {
            thread.throwStack.push(subloop_queues.$sym317$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD);
            try {
                object.object_initialize_method(self);
                actual_ipc_queue = process_utilities.new_ipc_queue(cconcatenate(subloop_queues.$str318$BASIC_IPC_QUEUE_, string_utilities.to_string(instance_number)));
                sublisp_throw(subloop_queues.$sym317$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    subloop_queues.set_basic_ipc_queue_actual_ipc_queue(self, actual_ipc_queue);
                    object.set_object_instance_number(self, instance_number);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_ipc_queue_method = Errors.handleThrowable(ccatch_env_var, subloop_queues.$sym317$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_ipc_queue_method;
    }

    static private final SubLList $list_alt44 = list(makeSymbol("NEW-PREDICATE"));

    static private final SubLList $list_alt45 = list(list(makeSymbol("CSETQ"), makeSymbol("SORT-PREDICATE"), makeSymbol("NEW-PREDICATE")), list(RET, makeSymbol("NEW-PREDICATE")));

    static private final SubLList $list_alt49 = list(list(RET, makeSymbol("ELEMENT-KEY-FUNCTION")));

    static private final SubLList $list_alt53 = list(makeSymbol("NEW-KEY-FUNCTION"));

    public static final SubLObject basic_ipc_queue_get_actual_ipc_queue_method_alt(SubLObject self) {
        {
            SubLObject actual_ipc_queue = com.cyc.cycjava.cycl.subloop_queues.get_basic_ipc_queue_actual_ipc_queue(self);
            return actual_ipc_queue;
        }
    }

    public static SubLObject basic_ipc_queue_get_actual_ipc_queue_method(final SubLObject self) {
        final SubLObject actual_ipc_queue = subloop_queues.get_basic_ipc_queue_actual_ipc_queue(self);
        return actual_ipc_queue;
    }

    static private final SubLList $list_alt54 = list(list(makeSymbol("CSETQ"), makeSymbol("ELEMENT-KEY-FUNCTION"), makeSymbol("NEW-KEY-FUNCTION")), list(RET, makeSymbol("NEW-KEY-FUNCTION")));

    public static final SubLObject basic_ipc_queue_set_actual_ipc_queue_method_alt(SubLObject self, SubLObject new_queue) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_basic_ipc_queue_method = NIL;
                SubLObject actual_ipc_queue = com.cyc.cycjava.cycl.subloop_queues.get_basic_ipc_queue_actual_ipc_queue(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == process_utilities.ipc_queue_p(new_queue)) {
                                Errors.error($str_alt327$_SET_ACTUAL_IPC_QUEUE__S____S_is_, self, new_queue);
                            }
                        }
                        actual_ipc_queue = new_queue;
                        sublisp_throw($sym326$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD, new_queue);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                com.cyc.cycjava.cycl.subloop_queues.set_basic_ipc_queue_actual_ipc_queue(self, actual_ipc_queue);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_basic_ipc_queue_method = Errors.handleThrowable(ccatch_env_var, $sym326$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD);
                }
                return catch_var_for_basic_ipc_queue_method;
            }
        }
    }

    public static SubLObject basic_ipc_queue_set_actual_ipc_queue_method(final SubLObject self, final SubLObject new_queue) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_ipc_queue_method = NIL;
        SubLObject actual_ipc_queue = subloop_queues.get_basic_ipc_queue_actual_ipc_queue(self);
        try {
            thread.throwStack.push(subloop_queues.$sym326$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD);
            try {
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == process_utilities.ipc_queue_p(new_queue))) {
                    Errors.error(subloop_queues.$str327$_SET_ACTUAL_IPC_QUEUE__S____S_is_, self, new_queue);
                }
                actual_ipc_queue = new_queue;
                sublisp_throw(subloop_queues.$sym326$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD, new_queue);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    subloop_queues.set_basic_ipc_queue_actual_ipc_queue(self, actual_ipc_queue);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_ipc_queue_method = Errors.handleThrowable(ccatch_env_var, subloop_queues.$sym326$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_ipc_queue_method;
    }

    static private final SubLList $list_alt58 = list(new SubLObject[]{ list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PRIORITIZER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PRIORITIZER"), list(makeSymbol("NEW-PRIORITIZER")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EMPTY-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ENQUEUE"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE"), list(makeSymbol("OLD-ELEMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEQUEUE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FIND"), list(makeSymbol("KEY-VALUE"), makeSymbol("&OPTIONAL"), list(makeSymbol("EQUALITY-PRED"), list(makeSymbol("FUNCTION"), EQL)), list(makeSymbol("KEY-ACCESSOR-FUNCTION"), list(makeSymbol("FUNCTION"), IDENTITY))), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ELEMENT-COUNT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONTENTS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CONTENTS"), list(makeSymbol("NEW-CONTENTS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEAR"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REORDER-CONTENTS"), list(makeSymbol("ORDERED-CONTENTS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PEEK"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ENQUEUED-P"), list(makeSymbol("OBJECT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PASSIVE-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PASSIVE"), list(makeSymbol("FLAG")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-ENQUEUE"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("PUBLIC")) });

    public static final SubLObject basic_ipc_queue_get_prioritizer_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_basic_ipc_queue_method = NIL;
            SubLObject prioritizer = com.cyc.cycjava.cycl.subloop_queues.get_basic_ipc_queue_prioritizer(self);
            try {
                try {
                    sublisp_throw($sym329$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD, prioritizer);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_queues.set_basic_ipc_queue_prioritizer(self, prioritizer);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_basic_ipc_queue_method = Errors.handleThrowable(ccatch_env_var, $sym329$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD);
            }
            return catch_var_for_basic_ipc_queue_method;
        }
    }

    public static SubLObject basic_ipc_queue_get_prioritizer_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_ipc_queue_method = NIL;
        final SubLObject prioritizer = subloop_queues.get_basic_ipc_queue_prioritizer(self);
        try {
            thread.throwStack.push(subloop_queues.$sym329$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD);
            try {
                sublisp_throw(subloop_queues.$sym329$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD, prioritizer);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    subloop_queues.set_basic_ipc_queue_prioritizer(self, prioritizer);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_ipc_queue_method = Errors.handleThrowable(ccatch_env_var, subloop_queues.$sym329$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_ipc_queue_method;
    }

    static private final SubLList $list_alt60 = list(makeSymbol("STREAM"), makeSymbol("DEPTH"));

    static private final SubLList $list_alt61 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("GET-CONTENTS"), makeSymbol("SELF")))), list(makeSymbol("PCOND"), list(list(makeSymbol("NULL"), makeSymbol("TEMPLATE-CONTENTS")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("QUEUE:{}"))), list(list(makeSymbol("NULL"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-CONTENTS"))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("QUEUE:{~S}"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-CONTENTS")))), list(T, list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("QUEUE:{~S"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-CONTENTS"))), list(makeSymbol("CDOLIST"), list(makeSymbol("ELEMENT"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-CONTENTS"))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("<-~S"), makeSymbol("ELEMENT"))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("}")))), list(RET, makeSymbol("SELF"))));

    public static final SubLObject basic_ipc_queue_set_prioritizer_method_alt(SubLObject self, SubLObject new_prioritizer) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_basic_ipc_queue_method = NIL;
                SubLObject prioritizer = com.cyc.cycjava.cycl.subloop_queues.get_basic_ipc_queue_prioritizer(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_prioritizer) || (NIL != com.cyc.cycjava.cycl.subloop_queues.queue_prioritizer_interface_p(new_prioritizer)))) {
                                Errors.error($str_alt159$_SET_PRIORITIZER__S____S_is_not_a, self, new_prioritizer);
                            }
                        }
                        prioritizer = new_prioritizer;
                        sublisp_throw($sym331$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD, new_prioritizer);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                com.cyc.cycjava.cycl.subloop_queues.set_basic_ipc_queue_prioritizer(self, prioritizer);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_basic_ipc_queue_method = Errors.handleThrowable(ccatch_env_var, $sym331$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD);
                }
                return catch_var_for_basic_ipc_queue_method;
            }
        }
    }

    public static SubLObject basic_ipc_queue_set_prioritizer_method(final SubLObject self, final SubLObject new_prioritizer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_ipc_queue_method = NIL;
        SubLObject prioritizer = subloop_queues.get_basic_ipc_queue_prioritizer(self);
        try {
            thread.throwStack.push(subloop_queues.$sym331$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD);
            try {
                if (((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != new_prioritizer)) && (NIL == subloop_queues.queue_prioritizer_interface_p(new_prioritizer))) {
                    Errors.error(subloop_queues.$str159$_SET_PRIORITIZER__S____S_is_not_a, self, new_prioritizer);
                }
                prioritizer = new_prioritizer;
                sublisp_throw(subloop_queues.$sym331$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD, new_prioritizer);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    subloop_queues.set_basic_ipc_queue_prioritizer(self, prioritizer);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_ipc_queue_method = Errors.handleThrowable(ccatch_env_var, subloop_queues.$sym331$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_ipc_queue_method;
    }

    static private final SubLList $list_alt63 = list(makeSymbol("NEW-ELEMENT"));

    static private final SubLList $list_alt64 = list(list(makeSymbol("IGNORE"), makeSymbol("NEW-ELEMENT")), list(RET, NIL));

    static private final SubLList $list_alt66 = list(makeSymbol("QUEUE-INTERFACE"));

    static private final SubLList $list_alt67 = list(makeKeyword("EXTENDS"), list(makeSymbol("QUEUE-INTERFACE")));

    static private final SubLList $list_alt68 = list(new SubLObject[]{ list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-FIRST-CONS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-FIRST-CONS"), list(makeSymbol("NEW-CONS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-END-POINTER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-END-POINTER"), list(makeSymbol("NEW-END-POINTER")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EMPTY-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ENQUEUE"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE"), list(makeSymbol("OLD-ELEMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEQUEUE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FIND"), list(makeSymbol("KEY-VALUE"), makeSymbol("&OPTIONAL"), list(makeSymbol("EQUALITY-PRED"), list(makeSymbol("FUNCTION"), EQL)), list(makeSymbol("KEY-ACCESSOR-FUNCTION"), list(makeSymbol("FUNCTION"), IDENTITY))), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ELEMENT-COUNT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONTENTS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CONTENTS"), list(makeSymbol("NEW-CONTENTS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEAR"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REORDER-CONTENTS"), list(makeSymbol("ORDERED-CONTENTS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PEEK"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ENQUEUED-P"), list(makeSymbol("OBJECT")), makeKeyword("PUBLIC")) });

    public static final SubLObject basic_ipc_queue_empty_p_method_alt(SubLObject self) {
        {
            SubLObject actual_ipc_queue = com.cyc.cycjava.cycl.subloop_queues.get_basic_ipc_queue_actual_ipc_queue(self);
            return zerop(process_utilities.ipc_current_queue_size(actual_ipc_queue));
        }
    }

    public static SubLObject basic_ipc_queue_empty_p_method(final SubLObject self) {
        final SubLObject actual_ipc_queue = subloop_queues.get_basic_ipc_queue_actual_ipc_queue(self);
        return zerop(process_utilities.ipc_current_queue_size(actual_ipc_queue));
    }

    public static final SubLObject basic_ipc_queue_enqueue_method_alt(SubLObject self, SubLObject new_element) {
        {
            SubLObject actual_ipc_queue = com.cyc.cycjava.cycl.subloop_queues.get_basic_ipc_queue_actual_ipc_queue(self);
            SubLObject is_passive = com.cyc.cycjava.cycl.subloop_queues.get_basic_ipc_queue_is_passive(self);
            process_utilities.ipc_enqueue(new_element, actual_ipc_queue);
            if ((NIL == is_passive) && (NIL != com.cyc.cycjava.cycl.subloop_queues.queue_element_interface_p(new_element))) {
                methods.funcall_instance_method_with_1_args(new_element, ENQUEUE_NOTIFY, self);
            }
            methods.funcall_instance_method_with_1_args(self, ON_ENQUEUE, new_element);
            return new_element;
        }
    }

    public static SubLObject basic_ipc_queue_enqueue_method(final SubLObject self, final SubLObject new_element) {
        final SubLObject actual_ipc_queue = subloop_queues.get_basic_ipc_queue_actual_ipc_queue(self);
        final SubLObject is_passive = subloop_queues.get_basic_ipc_queue_is_passive(self);
        process_utilities.ipc_enqueue(new_element, actual_ipc_queue, UNPROVIDED);
        if ((NIL == is_passive) && (NIL != subloop_queues.queue_element_interface_p(new_element))) {
            methods.funcall_instance_method_with_1_args(new_element, ENQUEUE_NOTIFY, self);
        }
        methods.funcall_instance_method_with_1_args(self, ON_ENQUEUE, new_element);
        return new_element;
    }

    public static final SubLObject basic_ipc_queue_remove_method_alt(SubLObject self, SubLObject old_element) {
        Errors.error($str_alt338$Invalid_operation__Cannot_remove_);
        return old_element;
    }

    public static SubLObject basic_ipc_queue_remove_method(final SubLObject self, final SubLObject old_element) {
        Errors.error(subloop_queues.$str338$Invalid_operation__Cannot_remove_);
        return old_element;
    }

    public static final SubLObject basic_ipc_queue_dequeue_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_basic_ipc_queue_method = NIL;
            SubLObject actual_ipc_queue = com.cyc.cycjava.cycl.subloop_queues.get_basic_ipc_queue_actual_ipc_queue(self);
            SubLObject is_passive = com.cyc.cycjava.cycl.subloop_queues.get_basic_ipc_queue_is_passive(self);
            try {
                try {
                    {
                        SubLObject dequeued_item = process_utilities.ipc_dequeue(actual_ipc_queue);
                        if ((NIL == is_passive) && (NIL != com.cyc.cycjava.cycl.subloop_queues.queue_element_interface_p(dequeued_item))) {
                            methods.funcall_instance_method_with_1_args(dequeued_item, DEQUEUE_NOTIFY, self);
                        }
                        sublisp_throw($sym341$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD, dequeued_item);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_queues.set_basic_ipc_queue_actual_ipc_queue(self, actual_ipc_queue);
                            com.cyc.cycjava.cycl.subloop_queues.set_basic_ipc_queue_is_passive(self, is_passive);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_basic_ipc_queue_method = Errors.handleThrowable(ccatch_env_var, $sym341$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD);
            }
            return catch_var_for_basic_ipc_queue_method;
        }
    }

    public static SubLObject basic_ipc_queue_dequeue_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_ipc_queue_method = NIL;
        final SubLObject actual_ipc_queue = subloop_queues.get_basic_ipc_queue_actual_ipc_queue(self);
        final SubLObject is_passive = subloop_queues.get_basic_ipc_queue_is_passive(self);
        try {
            thread.throwStack.push(subloop_queues.$sym341$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD);
            try {
                final SubLObject dequeued_item = process_utilities.ipc_dequeue(actual_ipc_queue, UNPROVIDED);
                if ((NIL == is_passive) && (NIL != subloop_queues.queue_element_interface_p(dequeued_item))) {
                    methods.funcall_instance_method_with_1_args(dequeued_item, DEQUEUE_NOTIFY, self);
                }
                sublisp_throw(subloop_queues.$sym341$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD, dequeued_item);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    subloop_queues.set_basic_ipc_queue_actual_ipc_queue(self, actual_ipc_queue);
                    subloop_queues.set_basic_ipc_queue_is_passive(self, is_passive);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_ipc_queue_method = Errors.handleThrowable(ccatch_env_var, subloop_queues.$sym341$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_ipc_queue_method;
    }

    static private final SubLList $list_alt70 = list(list(RET, list(makeSymbol("NULL"), list(makeSymbol("GET-FIRST-CONS"), makeSymbol("SELF")))));

    static private final SubLList $list_alt72 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("GET-FIRST-CONS"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-END-POINTER"), list(makeSymbol("GET-END-POINTER"), makeSymbol("SELF")))), list(makeSymbol("PIF"), list(makeSymbol("NULL"), makeSymbol("TEMPLATE-CONTENTS")), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("LIST"), makeSymbol("NEW-ELEMENT"))), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-END-POINTER"), makeSymbol("TEMPLATE-CONTENTS"))), list(makeSymbol("PROGN"), list(makeSymbol("RPLACD"), makeSymbol("TEMPLATE-END-POINTER"), list(makeSymbol("LIST"), makeSymbol("NEW-ELEMENT"))), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-END-POINTER"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-END-POINTER"))))), list(makeSymbol("SET-FIRST-CONS"), makeSymbol("SELF"), makeSymbol("TEMPLATE-CONTENTS")), list(makeSymbol("SET-END-POINTER"), makeSymbol("SELF"), makeSymbol("TEMPLATE-END-POINTER")), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("PASSIVE-P"), makeSymbol("SELF"))), list(makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), makeSymbol("NEW-ELEMENT"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("NEW-ELEMENT"), list(QUOTE, makeSymbol("ENQUEUE-NOTIFY")), makeSymbol("SELF"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ON-ENQUEUE")), makeSymbol("NEW-ELEMENT")), list(RET, makeSymbol("NEW-ELEMENT"))));

    public static final SubLObject basic_ipc_queue_get_element_count_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_basic_ipc_queue_method = NIL;
            SubLObject actual_ipc_queue = com.cyc.cycjava.cycl.subloop_queues.get_basic_ipc_queue_actual_ipc_queue(self);
            try {
                try {
                    sublisp_throw($sym344$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD, process_utilities.ipc_current_queue_size(actual_ipc_queue));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_queues.set_basic_ipc_queue_actual_ipc_queue(self, actual_ipc_queue);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_basic_ipc_queue_method = Errors.handleThrowable(ccatch_env_var, $sym344$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD);
            }
            return catch_var_for_basic_ipc_queue_method;
        }
    }

    public static SubLObject basic_ipc_queue_get_element_count_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_ipc_queue_method = NIL;
        final SubLObject actual_ipc_queue = subloop_queues.get_basic_ipc_queue_actual_ipc_queue(self);
        try {
            thread.throwStack.push(subloop_queues.$sym344$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD);
            try {
                sublisp_throw(subloop_queues.$sym344$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD, process_utilities.ipc_current_queue_size(actual_ipc_queue));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    subloop_queues.set_basic_ipc_queue_actual_ipc_queue(self, actual_ipc_queue);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_ipc_queue_method = Errors.handleThrowable(ccatch_env_var, subloop_queues.$sym344$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_ipc_queue_method;
    }

    static private final SubLList $list_alt74 = list(makeSymbol("OLD-ELEMENT"));

    static private final SubLList $list_alt75 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("GET-FIRST-CONS"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-END-POINTER"), list(makeSymbol("GET-END-POINTER"), makeSymbol("SELF")))), list(makeSymbol("PIF"), list(makeSymbol("NULL"), makeSymbol("TEMPLATE-CONTENTS")), list(RET, NIL), list(makeSymbol("PIF"), list(EQ, makeSymbol("OLD-ELEMENT"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-CONTENTS"))), list(makeSymbol("PIF"), list(EQ, makeSymbol("TEMPLATE-CONTENTS"), makeSymbol("TEMPLATE-END-POINTER")), list(makeSymbol("PROGN"), list(makeSymbol("SET-FIRST-CONS"), makeSymbol("SELF"), NIL), list(makeSymbol("SET-END-POINTER"), makeSymbol("SELF"), NIL), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("PASSIVE-P"), makeSymbol("SELF"))), list(makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), makeSymbol("OLD-ELEMENT"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("OLD-ELEMENT"), list(QUOTE, makeSymbol("REMOVE-NOTIFY")), makeSymbol("SELF"))), list(RET, makeSymbol("OLD-ELEMENT"))), list(makeSymbol("PROGN"), list(makeSymbol("SET-FIRST-CONS"), makeSymbol("SELF"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-CONTENTS"))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("PASSIVE-P"), makeSymbol("SELF"))), list(makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), makeSymbol("OLD-ELEMENT"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("OLD-ELEMENT"), list(QUOTE, makeSymbol("REMOVE-NOTIFY")), makeSymbol("SELF"))), list(RET, makeSymbol("OLD-ELEMENT")))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CURRENT-CONS"), makeSymbol("TEMPLATE-CONTENTS"))), list(makeSymbol("WHILE"), list(makeSymbol("CNOT"), list(EQ, list(makeSymbol("CDR"), makeSymbol("TEMPLATE-CURRENT-CONS")), makeSymbol("TEMPLATE-END-POINTER"))), list(makeSymbol("PWHEN"), list(EQ, makeSymbol("OLD-ELEMENT"), list(makeSymbol("CADR"), makeSymbol("TEMPLATE-CURRENT-CONS"))), list(makeSymbol("RPLACD"), makeSymbol("TEMPLATE-CURRENT-CONS"), list(makeSymbol("CDDR"), makeSymbol("TEMPLATE-CURRENT-CONS"))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("PASSIVE-P"), makeSymbol("SELF"))), list(makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), makeSymbol("OLD-ELEMENT"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("OLD-ELEMENT"), list(QUOTE, makeSymbol("REMOVE-NOTIFY")), makeSymbol("SELF"))), list(RET, makeSymbol("OLD-ELEMENT"))), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-CURRENT-CONS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-CURRENT-CONS")))), list(makeSymbol("PIF"), list(EQ, makeSymbol("OLD-ELEMENT"), list(makeSymbol("CADR"), makeSymbol("TEMPLATE-CURRENT-CONS"))), list(makeSymbol("PROGN"), list(makeSymbol("RPLACD"), makeSymbol("TEMPLATE-CURRENT-CONS"), NIL), list(makeSymbol("SET-END-POINTER"), makeSymbol("SELF"), makeSymbol("TEMPLATE-CURRENT-CONS")), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("PASSIVE-P"), makeSymbol("SELF"))), list(makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), makeSymbol("OLD-ELEMENT"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("OLD-ELEMENT"), list(QUOTE, makeSymbol("REMOVE-NOTIFY")), makeSymbol("SELF"))), list(RET, makeSymbol("OLD-ELEMENT"))), list(makeSymbol("PROGN"), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("PASSIVE-P"), makeSymbol("SELF"))), list(makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), makeSymbol("OLD-ELEMENT"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("OLD-ELEMENT"), list(QUOTE, makeSymbol("REMOVE-NOTIFY")), makeSymbol("SELF"))), list(RET, makeSymbol("OLD-ELEMENT")))))))));

    public static final SubLObject basic_ipc_queue_get_contents_method_alt(SubLObject self) {
        {
            SubLObject actual_ipc_queue = com.cyc.cycjava.cycl.subloop_queues.get_basic_ipc_queue_actual_ipc_queue(self);
            return process_utilities.ipc_current_queue_content(actual_ipc_queue);
        }
    }

    public static SubLObject basic_ipc_queue_get_contents_method(final SubLObject self) {
        final SubLObject actual_ipc_queue = subloop_queues.get_basic_ipc_queue_actual_ipc_queue(self);
        return process_utilities.ipc_current_queue_content(actual_ipc_queue);
    }

    public static final SubLObject basic_ipc_queue_set_contents_method_alt(SubLObject self, SubLObject new_contents) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!new_contents.isList()) {
                    Errors.error($str_alt349$_SET_CONTENTS__S____S_is_not_a_va, self);
                }
            }
            com.cyc.cycjava.cycl.subloop_queues.basic_ipc_queue_clear_method(self);
            {
                SubLObject cdolist_list_var = new_contents;
                SubLObject element = NIL;
                for (element = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , element = cdolist_list_var.first()) {
                    com.cyc.cycjava.cycl.subloop_queues.basic_ipc_queue_enqueue_method(self, element);
                }
            }
            return new_contents;
        }
    }

    public static SubLObject basic_ipc_queue_set_contents_method(final SubLObject self, final SubLObject new_contents) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!new_contents.isList())) {
            Errors.error(subloop_queues.$str349$_SET_CONTENTS__S____S_is_not_a_va, self);
        }
        subloop_queues.basic_ipc_queue_clear_method(self);
        SubLObject cdolist_list_var = new_contents;
        SubLObject element = NIL;
        element = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            subloop_queues.basic_ipc_queue_enqueue_method(self, element);
            cdolist_list_var = cdolist_list_var.rest();
            element = cdolist_list_var.first();
        } 
        return new_contents;
    }

    public static final SubLObject basic_ipc_queue_clear_method_alt(SubLObject self) {
        {
            SubLObject element_count = com.cyc.cycjava.cycl.subloop_queues.basic_ipc_queue_get_element_count_method(self);
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(element_count); i = add(i, ONE_INTEGER)) {
                com.cyc.cycjava.cycl.subloop_queues.basic_ipc_queue_dequeue_method(self);
            }
            return NIL;
        }
    }

    public static SubLObject basic_ipc_queue_clear_method(final SubLObject self) {
        SubLObject element_count;
        SubLObject i;
        for (element_count = subloop_queues.basic_ipc_queue_get_element_count_method(self), i = NIL, i = ZERO_INTEGER; i.numL(element_count); i = add(i, ONE_INTEGER)) {
            subloop_queues.basic_ipc_queue_dequeue_method(self);
        }
        return NIL;
    }

    public static final SubLObject basic_ipc_queue_reorder_contents_method_alt(SubLObject self, SubLObject ordered_contents) {
        return ordered_contents;
    }

    public static SubLObject basic_ipc_queue_reorder_contents_method(final SubLObject self, final SubLObject ordered_contents) {
        return ordered_contents;
    }

    public static final SubLObject basic_ipc_queue_peek_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_basic_ipc_queue_method = NIL;
            SubLObject actual_ipc_queue = com.cyc.cycjava.cycl.subloop_queues.get_basic_ipc_queue_actual_ipc_queue(self);
            try {
                try {
                    sublisp_throw($sym356$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD, process_utilities.ipc_current_queue_content(actual_ipc_queue).first());
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_queues.set_basic_ipc_queue_actual_ipc_queue(self, actual_ipc_queue);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_basic_ipc_queue_method = Errors.handleThrowable(ccatch_env_var, $sym356$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD);
            }
            return catch_var_for_basic_ipc_queue_method;
        }
    }

    public static SubLObject basic_ipc_queue_peek_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_ipc_queue_method = NIL;
        final SubLObject actual_ipc_queue = subloop_queues.get_basic_ipc_queue_actual_ipc_queue(self);
        try {
            thread.throwStack.push(subloop_queues.$sym356$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD);
            try {
                sublisp_throw(subloop_queues.$sym356$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD, process_utilities.ipc_current_queue_content(actual_ipc_queue).first());
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    subloop_queues.set_basic_ipc_queue_actual_ipc_queue(self, actual_ipc_queue);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_ipc_queue_method = Errors.handleThrowable(ccatch_env_var, subloop_queues.$sym356$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_ipc_queue_method;
    }

    static private final SubLList $list_alt77 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PRIORITIZER"), list(makeSymbol("GET-PRIORITIZER"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-PRIORITIZER"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-PRIORITIZER"), list(QUOTE, makeSymbol("ORDER-QUEUE")), makeSymbol("SELF")))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("GET-FIRST-CONS"), makeSymbol("SELF")))), list(makeSymbol("PUNLESS"), makeSymbol("TEMPLATE-CONTENTS"), list(RET, NIL)), list(makeSymbol("PUNLESS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-CONTENTS")), list(makeSymbol("SET-FIRST-CONS"), makeSymbol("SELF"), NIL), list(makeSymbol("SET-END-POINTER"), makeSymbol("SELF"), NIL), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-RESULT"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-CONTENTS")))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("PASSIVE-P"), makeSymbol("SELF"))), list(makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), makeSymbol("TEMPLATE-RESULT"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-RESULT"), list(QUOTE, makeSymbol("DEQUEUE-NOTIFY")), makeSymbol("SELF"))), list(RET, makeSymbol("TEMPLATE-RESULT")))), list(makeSymbol("SET-FIRST-CONS"), makeSymbol("SELF"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-CONTENTS"))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-RESULT"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-CONTENTS")))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("PASSIVE-P"), makeSymbol("SELF"))), list(makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), makeSymbol("TEMPLATE-RESULT"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-RESULT"), list(QUOTE, makeSymbol("DEQUEUE-NOTIFY")), makeSymbol("SELF"))), list(RET, makeSymbol("TEMPLATE-RESULT")))));

    public static final SubLObject basic_ipc_queue_enqueued_p_method_alt(SubLObject self, SubLObject v_object) {
        {
            SubLObject catch_var_for_basic_ipc_queue_method = NIL;
            SubLObject actual_ipc_queue = com.cyc.cycjava.cycl.subloop_queues.get_basic_ipc_queue_actual_ipc_queue(self);
            try {
                try {
                    sublisp_throw($sym359$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD, NIL != find(v_object, process_utilities.ipc_current_queue_content(actual_ipc_queue), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_queues.set_basic_ipc_queue_actual_ipc_queue(self, actual_ipc_queue);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_basic_ipc_queue_method = Errors.handleThrowable(ccatch_env_var, $sym359$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD);
            }
            return catch_var_for_basic_ipc_queue_method;
        }
    }

    public static SubLObject basic_ipc_queue_enqueued_p_method(final SubLObject self, final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_ipc_queue_method = NIL;
        final SubLObject actual_ipc_queue = subloop_queues.get_basic_ipc_queue_actual_ipc_queue(self);
        try {
            thread.throwStack.push(subloop_queues.$sym359$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD);
            try {
                sublisp_throw(subloop_queues.$sym359$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD, NIL != find(v_object, process_utilities.ipc_current_queue_content(actual_ipc_queue), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) ? T : NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    subloop_queues.set_basic_ipc_queue_actual_ipc_queue(self, actual_ipc_queue);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_ipc_queue_method = Errors.handleThrowable(ccatch_env_var, subloop_queues.$sym359$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_ipc_queue_method;
    }

    public static final SubLObject basic_ipc_queue_find_method_alt(SubLObject self, SubLObject key_value, SubLObject equality_pred, SubLObject key_accessor_function) {
        if (equality_pred == UNPROVIDED) {
            equality_pred = symbol_function(EQL);
        }
        if (key_accessor_function == UNPROVIDED) {
            key_accessor_function = symbol_function(IDENTITY);
        }
        {
            SubLObject catch_var_for_basic_ipc_queue_method = NIL;
            SubLObject actual_ipc_queue = com.cyc.cycjava.cycl.subloop_queues.get_basic_ipc_queue_actual_ipc_queue(self);
            try {
                try {
                    sublisp_throw($sym362$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD, find(key_value, process_utilities.ipc_current_queue_content(actual_ipc_queue), equality_pred, key_accessor_function, UNPROVIDED, UNPROVIDED));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_queues.set_basic_ipc_queue_actual_ipc_queue(self, actual_ipc_queue);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_basic_ipc_queue_method = Errors.handleThrowable(ccatch_env_var, $sym362$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD);
            }
            return catch_var_for_basic_ipc_queue_method;
        }
    }

    public static SubLObject basic_ipc_queue_find_method(final SubLObject self, final SubLObject key_value, SubLObject equality_pred, SubLObject key_accessor_function) {
        if (equality_pred == UNPROVIDED) {
            equality_pred = symbol_function(EQL);
        }
        if (key_accessor_function == UNPROVIDED) {
            key_accessor_function = symbol_function(IDENTITY);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_ipc_queue_method = NIL;
        final SubLObject actual_ipc_queue = subloop_queues.get_basic_ipc_queue_actual_ipc_queue(self);
        try {
            thread.throwStack.push(subloop_queues.$sym362$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD);
            try {
                sublisp_throw(subloop_queues.$sym362$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD, find(key_value, process_utilities.ipc_current_queue_content(actual_ipc_queue), equality_pred, key_accessor_function, UNPROVIDED, UNPROVIDED));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    subloop_queues.set_basic_ipc_queue_actual_ipc_queue(self, actual_ipc_queue);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_ipc_queue_method = Errors.handleThrowable(ccatch_env_var, subloop_queues.$sym362$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_ipc_queue_method;
    }

    static private final SubLList $list_alt79 = list(makeSymbol("KEY-VALUE"), makeSymbol("&OPTIONAL"), list(makeSymbol("EQUALITY-PRED"), list(makeSymbol("FUNCTION"), EQL)), list(makeSymbol("KEY-ACCESSOR-FUNCTION"), list(makeSymbol("FUNCTION"), IDENTITY)));

    static private final SubLList $list_alt80 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("GET-FIRST-CONS"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-ITEM"), list(makeSymbol("MEMBER"), makeSymbol("KEY-VALUE"), makeSymbol("TEMPLATE-CONTENTS"), makeSymbol("EQUALITY-PRED"), makeSymbol("KEY-ACCESSOR-FUNCTION")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-ITEM"), list(RET, makeSymbol("TEMPLATE-ITEM")))))), list(RET, NIL));

    static private final SubLList $list_alt82 = list(list(RET, list(makeSymbol("LENGTH"), list(makeSymbol("GET-FIRST-CONS"), makeSymbol("SELF")))));

    static private final SubLList $list_alt84 = list(list(RET, list(makeSymbol("GET-FIRST-CONS"), makeSymbol("SELF"))));

    static private final SubLList $list_alt86 = list(makeSymbol("NEW-CONTENTS"));

    static private final SubLList $list_alt87 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("COPY-LIST"), makeSymbol("NEW-CONTENTS")))), list(makeSymbol("PIF"), makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("PROGN"), list(makeSymbol("SET-FIRST-CONS"), makeSymbol("SELF"), makeSymbol("TEMPLATE-CONTENTS")), list(makeSymbol("SET-END-POINTER"), makeSymbol("SELF"), list(makeSymbol("LAST"), makeSymbol("TEMPLATE-CONTENTS")))), list(makeSymbol("PROGN"), list(makeSymbol("SET-FIRST-CONS"), makeSymbol("SELF"), NIL), list(makeSymbol("SET-END-POINTER"), makeSymbol("SELF"), NIL))), list(RET, makeSymbol("NEW-CONTENTS"))));

    public static final SubLObject basic_ipc_queue_passive_p_method_alt(SubLObject self) {
        {
            SubLObject is_passive = com.cyc.cycjava.cycl.subloop_queues.get_basic_ipc_queue_is_passive(self);
            return is_passive;
        }
    }

    public static SubLObject basic_ipc_queue_passive_p_method(final SubLObject self) {
        final SubLObject is_passive = subloop_queues.get_basic_ipc_queue_is_passive(self);
        return is_passive;
    }

    static private final SubLList $list_alt89 = list(list(makeSymbol("SET-FIRST-CONS"), makeSymbol("SELF"), NIL), list(makeSymbol("SET-END-POINTER"), makeSymbol("SELF"), NIL), list(RET, NIL));

    public static final SubLObject basic_ipc_queue_set_passive_method_alt(SubLObject self, SubLObject flag) {
        {
            SubLObject catch_var_for_basic_ipc_queue_method = NIL;
            SubLObject is_passive = com.cyc.cycjava.cycl.subloop_queues.get_basic_ipc_queue_is_passive(self);
            try {
                try {
                    is_passive = flag;
                    sublisp_throw($sym365$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD, flag);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_queues.set_basic_ipc_queue_is_passive(self, is_passive);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_basic_ipc_queue_method = Errors.handleThrowable(ccatch_env_var, $sym365$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD);
            }
            return catch_var_for_basic_ipc_queue_method;
        }
    }

    public static SubLObject basic_ipc_queue_set_passive_method(final SubLObject self, final SubLObject flag) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_ipc_queue_method = NIL;
        SubLObject is_passive = subloop_queues.get_basic_ipc_queue_is_passive(self);
        try {
            thread.throwStack.push(subloop_queues.$sym365$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD);
            try {
                is_passive = flag;
                sublisp_throw(subloop_queues.$sym365$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD, flag);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    subloop_queues.set_basic_ipc_queue_is_passive(self, is_passive);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_ipc_queue_method = Errors.handleThrowable(ccatch_env_var, subloop_queues.$sym365$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_ipc_queue_method;
    }

    static private final SubLList $list_alt91 = list(makeSymbol("ORDERED-CONTENTS"));

    static private final SubLList $list_alt92 = list(list(RET, list(makeSymbol("SET-CONTENTS"), makeSymbol("SELF"), makeSymbol("ORDERED-CONTENTS"))));

    static private final SubLList $list_alt94 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("GET-FIRST-CONS"), makeSymbol("SELF")))), list(makeSymbol("PUNLESS"), makeSymbol("TEMPLATE-CONTENTS"), list(RET, NIL)), list(RET, list(makeSymbol("CAR"), makeSymbol("TEMPLATE-CONTENTS")))));

    static private final SubLList $list_alt96 = list(makeSymbol("OBJECT"));

    static private final SubLList $list_alt97 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("GET-FIRST-CONS"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), list(makeSymbol("MEMBER"), makeSymbol("OBJECT"), makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("FUNCTION"), EQUAL)), list(RET, T)), list(RET, NIL)));

    static private final SubLList $list_alt99 = list(makeSymbol("END-POINTER-QUEUE-TEMPLATE"));

    static private final SubLList $list_alt100 = list(new SubLObject[]{ list(makeSymbol("FIRST-CONS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("LAST-CONS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("PRIORITIZER"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("IS-PASSIVE"), makeKeyword("BOOLEAN"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-FIRST-CONS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-FIRST-CONS"), list(makeSymbol("NEW-CONS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-END-POINTER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-END-POINTER"), list(makeSymbol("NEW-END-POINTER")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PRIORITIZER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PRIORITIZER"), list(makeSymbol("NEW-PRIORITIZER")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PASSIVE-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PASSIVE"), list(makeSymbol("FLAG")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EMPTY-P"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ENQUEUE"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-ENQUEUE"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE"), list(makeSymbol("OLD-ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEQUEUE"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FIND"), list(makeSymbol("KEY-VALUE"), makeSymbol("&OPTIONAL"), list(makeSymbol("EQUALITY-PRED"), list(makeSymbol("FUNCTION"), EQL)), list(makeSymbol("KEY-ACCESSOR-FUNCTION"), list(makeSymbol("FUNCTION"), IDENTITY))), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ELEMENT-COUNT"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONTENTS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CONTENTS"), list(makeSymbol("NEW-CONTENTS")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEAR"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REORDER-CONTENTS"), list(makeSymbol("ORDERED-CONTENTS")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PEEK"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ENQUEUED-P"), list(makeSymbol("OBJECT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")) });

    public static final SubLObject queue_interface_get_prioritizer_alt(SubLObject queue_interface) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == com.cyc.cycjava.cycl.subloop_queues.queue_interface_p(queue_interface)) {
                    Errors.error($str_alt367$QUEUE_INTERFACE_GET_PRIORITIZER__, queue_interface);
                }
            }
            if (NIL != com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_ipc_queue_p(queue_interface)) {
                return com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_get_prioritizer_method(queue_interface);
            } else {
                if (NIL != com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_p(queue_interface)) {
                    return com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_get_prioritizer_method(queue_interface);
                } else {
                    if (NIL != com.cyc.cycjava.cycl.subloop_queues.basic_ipc_queue_p(queue_interface)) {
                        return com.cyc.cycjava.cycl.subloop_queues.basic_ipc_queue_get_prioritizer_method(queue_interface);
                    } else {
                        if (NIL != com.cyc.cycjava.cycl.subloop_queues.basic_queue_p(queue_interface)) {
                            return com.cyc.cycjava.cycl.subloop_queues.basic_queue_get_prioritizer_method(queue_interface);
                        } else {
                            return methods.funcall_instance_method_with_0_args(queue_interface, GET_PRIORITIZER);
                        }
                    }
                }
            }
        }
    }

    public static SubLObject queue_interface_get_prioritizer(final SubLObject queue_interface) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subloop_queues.queue_interface_p(queue_interface))) {
            Errors.error(subloop_queues.$str367$QUEUE_INTERFACE_GET_PRIORITIZER__, queue_interface);
        }
        if (NIL != subloop_queues.basic_doubly_linked_ipc_queue_p(queue_interface)) {
            return subloop_queues.basic_doubly_linked_queue_get_prioritizer_method(queue_interface);
        }
        if (NIL != subloop_queues.basic_doubly_linked_queue_p(queue_interface)) {
            return subloop_queues.basic_doubly_linked_queue_get_prioritizer_method(queue_interface);
        }
        if (NIL != subloop_queues.basic_ipc_queue_p(queue_interface)) {
            return subloop_queues.basic_ipc_queue_get_prioritizer_method(queue_interface);
        }
        if (NIL != subloop_queues.basic_queue_p(queue_interface)) {
            return subloop_queues.basic_queue_get_prioritizer_method(queue_interface);
        }
        return methods.funcall_instance_method_with_0_args(queue_interface, GET_PRIORITIZER);
    }

    public static final SubLObject queue_interface_set_prioritizer_alt(SubLObject queue_interface, SubLObject new_prioritizer) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == com.cyc.cycjava.cycl.subloop_queues.queue_interface_p(queue_interface)) {
                    Errors.error($str_alt368$QUEUE_INTERFACE_SET_PRIORITIZER__, queue_interface);
                }
            }
            if (NIL != com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_ipc_queue_p(queue_interface)) {
                return com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_ipc_queue_set_prioritizer_method(queue_interface, new_prioritizer);
            } else {
                if (NIL != com.cyc.cycjava.cycl.subloop_queues.asynch_basic_doubly_linked_queue_p(queue_interface)) {
                    return com.cyc.cycjava.cycl.subloop_queues.asynch_basic_doubly_linked_queue_set_prioritizer_method(queue_interface, new_prioritizer);
                } else {
                    if (NIL != com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_p(queue_interface)) {
                        return com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_set_prioritizer_method(queue_interface, new_prioritizer);
                    } else {
                        if (NIL != com.cyc.cycjava.cycl.subloop_queues.basic_ipc_queue_p(queue_interface)) {
                            return com.cyc.cycjava.cycl.subloop_queues.basic_ipc_queue_set_prioritizer_method(queue_interface, new_prioritizer);
                        } else {
                            if (NIL != com.cyc.cycjava.cycl.subloop_queues.basic_queue_p(queue_interface)) {
                                return com.cyc.cycjava.cycl.subloop_queues.basic_queue_set_prioritizer_method(queue_interface, new_prioritizer);
                            } else {
                                return methods.funcall_instance_method_with_1_args(queue_interface, SET_PRIORITIZER, new_prioritizer);
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject queue_interface_set_prioritizer(final SubLObject queue_interface, final SubLObject new_prioritizer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subloop_queues.queue_interface_p(queue_interface))) {
            Errors.error(subloop_queues.$str368$QUEUE_INTERFACE_SET_PRIORITIZER__, queue_interface);
        }
        if (NIL != subloop_queues.basic_doubly_linked_ipc_queue_p(queue_interface)) {
            return subloop_queues.basic_doubly_linked_ipc_queue_set_prioritizer_method(queue_interface, new_prioritizer);
        }
        if (NIL != subloop_queues.asynch_basic_doubly_linked_queue_p(queue_interface)) {
            return subloop_queues.asynch_basic_doubly_linked_queue_set_prioritizer_method(queue_interface, new_prioritizer);
        }
        if (NIL != subloop_queues.basic_doubly_linked_queue_p(queue_interface)) {
            return subloop_queues.basic_doubly_linked_queue_set_prioritizer_method(queue_interface, new_prioritizer);
        }
        if (NIL != subloop_queues.basic_ipc_queue_p(queue_interface)) {
            return subloop_queues.basic_ipc_queue_set_prioritizer_method(queue_interface, new_prioritizer);
        }
        if (NIL != subloop_queues.basic_queue_p(queue_interface)) {
            return subloop_queues.basic_queue_set_prioritizer_method(queue_interface, new_prioritizer);
        }
        return methods.funcall_instance_method_with_1_args(queue_interface, SET_PRIORITIZER, new_prioritizer);
    }

    public static final SubLObject queue_interface_empty_p_alt(SubLObject queue_interface) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == com.cyc.cycjava.cycl.subloop_queues.queue_interface_p(queue_interface)) {
                    Errors.error($str_alt369$QUEUE_INTERFACE_EMPTY_P___S_is_no, queue_interface);
                }
            }
            if (NIL != com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_ipc_queue_p(queue_interface)) {
                return com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_empty_p_method(queue_interface);
            } else {
                if (NIL != com.cyc.cycjava.cycl.subloop_queues.asynch_basic_doubly_linked_queue_p(queue_interface)) {
                    return com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_empty_p_method(queue_interface);
                } else {
                    if (NIL != com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_p(queue_interface)) {
                        return com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_empty_p_method(queue_interface);
                    } else {
                        if (NIL != com.cyc.cycjava.cycl.subloop_queues.basic_ipc_queue_p(queue_interface)) {
                            return com.cyc.cycjava.cycl.subloop_queues.basic_ipc_queue_empty_p_method(queue_interface);
                        } else {
                            if (NIL != com.cyc.cycjava.cycl.subloop_queues.basic_queue_p(queue_interface)) {
                                return com.cyc.cycjava.cycl.subloop_queues.basic_queue_empty_p_method(queue_interface);
                            } else {
                                return methods.funcall_instance_method_with_0_args(queue_interface, EMPTY_P);
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject queue_interface_empty_p(final SubLObject queue_interface) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subloop_queues.queue_interface_p(queue_interface))) {
            Errors.error(subloop_queues.$str369$QUEUE_INTERFACE_EMPTY_P___S_is_no, queue_interface);
        }
        if (NIL != subloop_queues.basic_doubly_linked_ipc_queue_p(queue_interface)) {
            return subloop_queues.basic_doubly_linked_queue_empty_p_method(queue_interface);
        }
        if (NIL != subloop_queues.asynch_basic_doubly_linked_queue_p(queue_interface)) {
            return subloop_queues.basic_doubly_linked_queue_empty_p_method(queue_interface);
        }
        if (NIL != subloop_queues.basic_doubly_linked_queue_p(queue_interface)) {
            return subloop_queues.basic_doubly_linked_queue_empty_p_method(queue_interface);
        }
        if (NIL != subloop_queues.basic_ipc_queue_p(queue_interface)) {
            return subloop_queues.basic_ipc_queue_empty_p_method(queue_interface);
        }
        if (NIL != subloop_queues.basic_queue_p(queue_interface)) {
            return subloop_queues.basic_queue_empty_p_method(queue_interface);
        }
        return methods.funcall_instance_method_with_0_args(queue_interface, EMPTY_P);
    }

    public static final SubLObject queue_interface_enqueue_alt(SubLObject queue_interface, SubLObject new_element) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == com.cyc.cycjava.cycl.subloop_queues.queue_interface_p(queue_interface)) {
                    Errors.error($str_alt370$QUEUE_INTERFACE_ENQUEUE___S_is_no, queue_interface);
                }
            }
            if (NIL != com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_ipc_queue_p(queue_interface)) {
                return com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_ipc_queue_enqueue_method(queue_interface, new_element);
            } else {
                if (NIL != com.cyc.cycjava.cycl.subloop_queues.asynch_basic_doubly_linked_queue_p(queue_interface)) {
                    return com.cyc.cycjava.cycl.subloop_queues.asynch_basic_doubly_linked_queue_enqueue_method(queue_interface, new_element);
                } else {
                    if (NIL != com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_p(queue_interface)) {
                        return com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_enqueue_method(queue_interface, new_element);
                    } else {
                        if (NIL != com.cyc.cycjava.cycl.subloop_queues.basic_ipc_queue_p(queue_interface)) {
                            return com.cyc.cycjava.cycl.subloop_queues.basic_ipc_queue_enqueue_method(queue_interface, new_element);
                        } else {
                            if (NIL != com.cyc.cycjava.cycl.subloop_queues.basic_queue_p(queue_interface)) {
                                return com.cyc.cycjava.cycl.subloop_queues.basic_queue_enqueue_method(queue_interface, new_element);
                            } else {
                                return methods.funcall_instance_method_with_1_args(queue_interface, ENQUEUE, new_element);
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject queue_interface_enqueue(final SubLObject queue_interface, final SubLObject new_element) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subloop_queues.queue_interface_p(queue_interface))) {
            Errors.error(subloop_queues.$str370$QUEUE_INTERFACE_ENQUEUE___S_is_no, queue_interface);
        }
        if (NIL != subloop_queues.basic_doubly_linked_ipc_queue_p(queue_interface)) {
            return subloop_queues.basic_doubly_linked_ipc_queue_enqueue_method(queue_interface, new_element);
        }
        if (NIL != subloop_queues.asynch_basic_doubly_linked_queue_p(queue_interface)) {
            return subloop_queues.asynch_basic_doubly_linked_queue_enqueue_method(queue_interface, new_element);
        }
        if (NIL != subloop_queues.basic_doubly_linked_queue_p(queue_interface)) {
            return subloop_queues.basic_doubly_linked_queue_enqueue_method(queue_interface, new_element);
        }
        if (NIL != subloop_queues.basic_ipc_queue_p(queue_interface)) {
            return subloop_queues.basic_ipc_queue_enqueue_method(queue_interface, new_element);
        }
        if (NIL != subloop_queues.basic_queue_p(queue_interface)) {
            return subloop_queues.basic_queue_enqueue_method(queue_interface, new_element);
        }
        return methods.funcall_instance_method_with_1_args(queue_interface, ENQUEUE, new_element);
    }

    public static final SubLObject queue_interface_remove_alt(SubLObject queue_interface, SubLObject old_element) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == com.cyc.cycjava.cycl.subloop_queues.queue_interface_p(queue_interface)) {
                    Errors.error($str_alt371$QUEUE_INTERFACE_REMOVE___S_is_not, queue_interface);
                }
            }
            if (NIL != com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_ipc_queue_p(queue_interface)) {
                return com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_ipc_queue_remove_method(queue_interface, old_element);
            } else {
                if (NIL != com.cyc.cycjava.cycl.subloop_queues.asynch_basic_doubly_linked_queue_p(queue_interface)) {
                    return com.cyc.cycjava.cycl.subloop_queues.asynch_basic_doubly_linked_queue_remove_method(queue_interface, old_element);
                } else {
                    if (NIL != com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_p(queue_interface)) {
                        return com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_remove_method(queue_interface, old_element);
                    } else {
                        if (NIL != com.cyc.cycjava.cycl.subloop_queues.basic_ipc_queue_p(queue_interface)) {
                            return com.cyc.cycjava.cycl.subloop_queues.basic_ipc_queue_remove_method(queue_interface, old_element);
                        } else {
                            if (NIL != com.cyc.cycjava.cycl.subloop_queues.basic_queue_p(queue_interface)) {
                                return com.cyc.cycjava.cycl.subloop_queues.basic_queue_remove_method(queue_interface, old_element);
                            } else {
                                return methods.funcall_instance_method_with_1_args(queue_interface, REMOVE, old_element);
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject queue_interface_remove(final SubLObject queue_interface, final SubLObject old_element) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subloop_queues.queue_interface_p(queue_interface))) {
            Errors.error(subloop_queues.$str371$QUEUE_INTERFACE_REMOVE___S_is_not, queue_interface);
        }
        if (NIL != subloop_queues.basic_doubly_linked_ipc_queue_p(queue_interface)) {
            return subloop_queues.basic_doubly_linked_ipc_queue_remove_method(queue_interface, old_element);
        }
        if (NIL != subloop_queues.asynch_basic_doubly_linked_queue_p(queue_interface)) {
            return subloop_queues.asynch_basic_doubly_linked_queue_remove_method(queue_interface, old_element);
        }
        if (NIL != subloop_queues.basic_doubly_linked_queue_p(queue_interface)) {
            return subloop_queues.basic_doubly_linked_queue_remove_method(queue_interface, old_element);
        }
        if (NIL != subloop_queues.basic_ipc_queue_p(queue_interface)) {
            return subloop_queues.basic_ipc_queue_remove_method(queue_interface, old_element);
        }
        if (NIL != subloop_queues.basic_queue_p(queue_interface)) {
            return subloop_queues.basic_queue_remove_method(queue_interface, old_element);
        }
        return methods.funcall_instance_method_with_1_args(queue_interface, REMOVE, old_element);
    }

    static private final SubLString $str_alt122$QUEUE___ = makeString("QUEUE:{}");

    static private final SubLString $str_alt123$QUEUE___S_ = makeString("QUEUE:{~S}");

    static private final SubLString $str_alt124$QUEUE___S = makeString("QUEUE:{~S");

    static private final SubLString $str_alt125$___S = makeString("<-~S");

    static private final SubLString $str_alt126$_ = makeString("}");

    static private final SubLList $list_alt130 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("FIRST-CONS"), NIL), list(makeSymbol("CSETQ"), makeSymbol("LAST-CONS"), NIL), list(makeSymbol("CSETQ"), makeSymbol("PRIORITIZER"), NIL), list(makeSymbol("CSETQ"), makeSymbol("IS-PASSIVE"), NIL), list(RET, makeSymbol("SELF")));

    public static final SubLObject queue_interface_dequeue_alt(SubLObject queue_interface) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == com.cyc.cycjava.cycl.subloop_queues.queue_interface_p(queue_interface)) {
                    Errors.error($str_alt372$QUEUE_INTERFACE_DEQUEUE___S_is_no, queue_interface);
                }
            }
            if (NIL != com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_ipc_queue_p(queue_interface)) {
                return com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_ipc_queue_dequeue_method(queue_interface);
            } else {
                if (NIL != com.cyc.cycjava.cycl.subloop_queues.asynch_basic_doubly_linked_queue_p(queue_interface)) {
                    return com.cyc.cycjava.cycl.subloop_queues.asynch_basic_doubly_linked_queue_dequeue_method(queue_interface);
                } else {
                    if (NIL != com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_p(queue_interface)) {
                        return com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_dequeue_method(queue_interface);
                    } else {
                        if (NIL != com.cyc.cycjava.cycl.subloop_queues.basic_ipc_queue_p(queue_interface)) {
                            return com.cyc.cycjava.cycl.subloop_queues.basic_ipc_queue_dequeue_method(queue_interface);
                        } else {
                            if (NIL != com.cyc.cycjava.cycl.subloop_queues.basic_queue_p(queue_interface)) {
                                return com.cyc.cycjava.cycl.subloop_queues.basic_queue_dequeue_method(queue_interface);
                            } else {
                                return methods.funcall_instance_method_with_0_args(queue_interface, DEQUEUE);
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject queue_interface_dequeue(final SubLObject queue_interface) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subloop_queues.queue_interface_p(queue_interface))) {
            Errors.error(subloop_queues.$str372$QUEUE_INTERFACE_DEQUEUE___S_is_no, queue_interface);
        }
        if (NIL != subloop_queues.basic_doubly_linked_ipc_queue_p(queue_interface)) {
            return subloop_queues.basic_doubly_linked_ipc_queue_dequeue_method(queue_interface);
        }
        if (NIL != subloop_queues.asynch_basic_doubly_linked_queue_p(queue_interface)) {
            return subloop_queues.asynch_basic_doubly_linked_queue_dequeue_method(queue_interface);
        }
        if (NIL != subloop_queues.basic_doubly_linked_queue_p(queue_interface)) {
            return subloop_queues.basic_doubly_linked_queue_dequeue_method(queue_interface);
        }
        if (NIL != subloop_queues.basic_ipc_queue_p(queue_interface)) {
            return subloop_queues.basic_ipc_queue_dequeue_method(queue_interface);
        }
        if (NIL != subloop_queues.basic_queue_p(queue_interface)) {
            return subloop_queues.basic_queue_dequeue_method(queue_interface);
        }
        return methods.funcall_instance_method_with_0_args(queue_interface, DEQUEUE);
    }

    static private final SubLList $list_alt134 = list(list(RET, makeSymbol("FIRST-CONS")));

    static private final SubLList $list_alt138 = list(makeSymbol("NEW-CONS"));

    static private final SubLList $list_alt139 = list(list(makeSymbol("CSETQ"), makeSymbol("FIRST-CONS"), makeSymbol("NEW-CONS")), list(RET, makeSymbol("NEW-CONS")));

    static private final SubLList $list_alt143 = list(list(RET, makeSymbol("LAST-CONS")));

    public static final SubLObject queue_interface_get_element_count_alt(SubLObject queue_interface) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == com.cyc.cycjava.cycl.subloop_queues.queue_interface_p(queue_interface)) {
                    Errors.error($str_alt373$QUEUE_INTERFACE_GET_ELEMENT_COUNT, queue_interface);
                }
            }
            if (NIL != com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_ipc_queue_p(queue_interface)) {
                return com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_get_element_count_method(queue_interface);
            } else {
                if (NIL != com.cyc.cycjava.cycl.subloop_queues.asynch_basic_doubly_linked_queue_p(queue_interface)) {
                    return com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_get_element_count_method(queue_interface);
                } else {
                    if (NIL != com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_p(queue_interface)) {
                        return com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_get_element_count_method(queue_interface);
                    } else {
                        if (NIL != com.cyc.cycjava.cycl.subloop_queues.basic_ipc_queue_p(queue_interface)) {
                            return com.cyc.cycjava.cycl.subloop_queues.basic_ipc_queue_get_element_count_method(queue_interface);
                        } else {
                            if (NIL != com.cyc.cycjava.cycl.subloop_queues.basic_queue_p(queue_interface)) {
                                return com.cyc.cycjava.cycl.subloop_queues.basic_queue_get_element_count_method(queue_interface);
                            } else {
                                return methods.funcall_instance_method_with_0_args(queue_interface, GET_ELEMENT_COUNT);
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject queue_interface_get_element_count(final SubLObject queue_interface) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subloop_queues.queue_interface_p(queue_interface))) {
            Errors.error(subloop_queues.$str373$QUEUE_INTERFACE_GET_ELEMENT_COUNT, queue_interface);
        }
        if (NIL != subloop_queues.basic_doubly_linked_ipc_queue_p(queue_interface)) {
            return subloop_queues.basic_doubly_linked_queue_get_element_count_method(queue_interface);
        }
        if (NIL != subloop_queues.asynch_basic_doubly_linked_queue_p(queue_interface)) {
            return subloop_queues.basic_doubly_linked_queue_get_element_count_method(queue_interface);
        }
        if (NIL != subloop_queues.basic_doubly_linked_queue_p(queue_interface)) {
            return subloop_queues.basic_doubly_linked_queue_get_element_count_method(queue_interface);
        }
        if (NIL != subloop_queues.basic_ipc_queue_p(queue_interface)) {
            return subloop_queues.basic_ipc_queue_get_element_count_method(queue_interface);
        }
        if (NIL != subloop_queues.basic_queue_p(queue_interface)) {
            return subloop_queues.basic_queue_get_element_count_method(queue_interface);
        }
        return methods.funcall_instance_method_with_0_args(queue_interface, GET_ELEMENT_COUNT);
    }

    static private final SubLList $list_alt147 = list(makeSymbol("NEW-END-POINTER"));

    static private final SubLList $list_alt148 = list(list(makeSymbol("CSETQ"), makeSymbol("LAST-CONS"), makeSymbol("NEW-END-POINTER")), list(RET, makeSymbol("NEW-END-POINTER")));

    static private final SubLList $list_alt152 = list(list(RET, makeSymbol("PRIORITIZER")));

    static private final SubLList $list_alt156 = list(makeSymbol("NEW-PRIORITIZER"));

    public static final SubLObject queue_interface_get_contents_alt(SubLObject queue_interface) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == com.cyc.cycjava.cycl.subloop_queues.queue_interface_p(queue_interface)) {
                    Errors.error($str_alt374$QUEUE_INTERFACE_GET_CONTENTS___S_, queue_interface);
                }
            }
            if (NIL != com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_ipc_queue_p(queue_interface)) {
                return com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_get_contents_method(queue_interface);
            } else {
                if (NIL != com.cyc.cycjava.cycl.subloop_queues.asynch_basic_doubly_linked_queue_p(queue_interface)) {
                    return com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_get_contents_method(queue_interface);
                } else {
                    if (NIL != com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_p(queue_interface)) {
                        return com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_get_contents_method(queue_interface);
                    } else {
                        if (NIL != com.cyc.cycjava.cycl.subloop_queues.basic_ipc_queue_p(queue_interface)) {
                            return com.cyc.cycjava.cycl.subloop_queues.basic_ipc_queue_get_contents_method(queue_interface);
                        } else {
                            if (NIL != com.cyc.cycjava.cycl.subloop_queues.basic_queue_p(queue_interface)) {
                                return com.cyc.cycjava.cycl.subloop_queues.basic_queue_get_contents_method(queue_interface);
                            } else {
                                return methods.funcall_instance_method_with_0_args(queue_interface, GET_CONTENTS);
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject queue_interface_get_contents(final SubLObject queue_interface) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subloop_queues.queue_interface_p(queue_interface))) {
            Errors.error(subloop_queues.$str374$QUEUE_INTERFACE_GET_CONTENTS___S_, queue_interface);
        }
        if (NIL != subloop_queues.basic_doubly_linked_ipc_queue_p(queue_interface)) {
            return subloop_queues.basic_doubly_linked_queue_get_contents_method(queue_interface);
        }
        if (NIL != subloop_queues.asynch_basic_doubly_linked_queue_p(queue_interface)) {
            return subloop_queues.basic_doubly_linked_queue_get_contents_method(queue_interface);
        }
        if (NIL != subloop_queues.basic_doubly_linked_queue_p(queue_interface)) {
            return subloop_queues.basic_doubly_linked_queue_get_contents_method(queue_interface);
        }
        if (NIL != subloop_queues.basic_ipc_queue_p(queue_interface)) {
            return subloop_queues.basic_ipc_queue_get_contents_method(queue_interface);
        }
        if (NIL != subloop_queues.basic_queue_p(queue_interface)) {
            return subloop_queues.basic_queue_get_contents_method(queue_interface);
        }
        return methods.funcall_instance_method_with_0_args(queue_interface, GET_CONTENTS);
    }

    static private final SubLList $list_alt157 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-PRIORITIZER")), list(makeSymbol("QUEUE-PRIORITIZER-INTERFACE-P"), makeSymbol("NEW-PRIORITIZER"))), makeString("(SET-PRIORITIZER ~S): ~S is not an instance of QUEUE-PRIORITIZER-INTERFACE."), makeSymbol("SELF"), makeSymbol("NEW-PRIORITIZER")), list(makeSymbol("CSETQ"), makeSymbol("PRIORITIZER"), makeSymbol("NEW-PRIORITIZER")), list(RET, makeSymbol("NEW-PRIORITIZER")));

    static private final SubLString $str_alt159$_SET_PRIORITIZER__S____S_is_not_a = makeString("(SET-PRIORITIZER ~S): ~S is not an instance of QUEUE-PRIORITIZER-INTERFACE.");

    static private final SubLList $list_alt162 = list(makeKeyword("READ-ONLY"), makeKeyword("PUBLIC"));

    static private final SubLList $list_alt163 = list(list(RET, makeSymbol("IS-PASSIVE")));

    public static final SubLObject queue_interface_set_contents_alt(SubLObject queue_interface, SubLObject new_contents) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == com.cyc.cycjava.cycl.subloop_queues.queue_interface_p(queue_interface)) {
                    Errors.error($str_alt375$QUEUE_INTERFACE_SET_CONTENTS___S_, queue_interface);
                }
            }
            if (NIL != com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_ipc_queue_p(queue_interface)) {
                return com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_ipc_queue_set_contents_method(queue_interface, new_contents);
            } else {
                if (NIL != com.cyc.cycjava.cycl.subloop_queues.asynch_basic_doubly_linked_queue_p(queue_interface)) {
                    return com.cyc.cycjava.cycl.subloop_queues.asynch_basic_doubly_linked_queue_set_contents_method(queue_interface, new_contents);
                } else {
                    if (NIL != com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_p(queue_interface)) {
                        return com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_set_contents_method(queue_interface, new_contents);
                    } else {
                        if (NIL != com.cyc.cycjava.cycl.subloop_queues.basic_ipc_queue_p(queue_interface)) {
                            return com.cyc.cycjava.cycl.subloop_queues.basic_ipc_queue_set_contents_method(queue_interface, new_contents);
                        } else {
                            if (NIL != com.cyc.cycjava.cycl.subloop_queues.basic_queue_p(queue_interface)) {
                                return com.cyc.cycjava.cycl.subloop_queues.basic_queue_set_contents_method(queue_interface, new_contents);
                            } else {
                                return methods.funcall_instance_method_with_1_args(queue_interface, SET_CONTENTS, new_contents);
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject queue_interface_set_contents(final SubLObject queue_interface, final SubLObject new_contents) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subloop_queues.queue_interface_p(queue_interface))) {
            Errors.error(subloop_queues.$str375$QUEUE_INTERFACE_SET_CONTENTS___S_, queue_interface);
        }
        if (NIL != subloop_queues.basic_doubly_linked_ipc_queue_p(queue_interface)) {
            return subloop_queues.basic_doubly_linked_ipc_queue_set_contents_method(queue_interface, new_contents);
        }
        if (NIL != subloop_queues.asynch_basic_doubly_linked_queue_p(queue_interface)) {
            return subloop_queues.asynch_basic_doubly_linked_queue_set_contents_method(queue_interface, new_contents);
        }
        if (NIL != subloop_queues.basic_doubly_linked_queue_p(queue_interface)) {
            return subloop_queues.basic_doubly_linked_queue_set_contents_method(queue_interface, new_contents);
        }
        if (NIL != subloop_queues.basic_ipc_queue_p(queue_interface)) {
            return subloop_queues.basic_ipc_queue_set_contents_method(queue_interface, new_contents);
        }
        if (NIL != subloop_queues.basic_queue_p(queue_interface)) {
            return subloop_queues.basic_queue_set_contents_method(queue_interface, new_contents);
        }
        return methods.funcall_instance_method_with_1_args(queue_interface, SET_CONTENTS, new_contents);
    }

    static private final SubLList $list_alt166 = list(makeSymbol("FLAG"));

    static private final SubLList $list_alt167 = list(list(makeSymbol("CSETQ"), makeSymbol("IS-PASSIVE"), makeSymbol("FLAG")), list(RET, makeSymbol("FLAG")));

    static private final SubLList $list_alt171 = list(new SubLObject[]{ list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-LIST-INTERNAL"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-LIST-INTERNAL"), list(makeSymbol("NEW-LIST")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PRIORITIZER-INTERNAL"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PRIORITIZER-INTERNAL"), list(makeSymbol("NEW-PRIORITIZER")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE-QUA-DOUBLY-LINKED-QUEUE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-LIST"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PRIORITIZER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PRIORITIZER"), list(makeSymbol("NEW-PRIORITIZER")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EMPTY-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ENQUEUE"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE"), list(makeSymbol("OLD-ELEMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEQUEUE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FIND"), list(makeSymbol("KEY-VALUE"), makeSymbol("&OPTIONAL"), list(makeSymbol("EQUALITY-PRED"), list(makeSymbol("FUNCTION"), EQL)), list(makeSymbol("KEY-ACCESSOR-FUNCTION"), list(makeSymbol("FUNCTION"), IDENTITY))), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ELEMENT-COUNT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONTENTS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CONTENTS"), list(makeSymbol("NEW-CONTENTS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEAR"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REORDER-CONTENTS"), list(makeSymbol("ORDERED-CONTENTS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PEEK"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ENQUEUED-P"), list(makeSymbol("OBJECT")), makeKeyword("PUBLIC")) });

    public static final SubLObject queue_interface_clear_alt(SubLObject queue_interface) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == com.cyc.cycjava.cycl.subloop_queues.queue_interface_p(queue_interface)) {
                    Errors.error($str_alt376$QUEUE_INTERFACE_CLEAR___S_is_not_, queue_interface);
                }
            }
            if (NIL != com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_ipc_queue_p(queue_interface)) {
                return com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_ipc_queue_clear_method(queue_interface);
            } else {
                if (NIL != com.cyc.cycjava.cycl.subloop_queues.asynch_basic_doubly_linked_queue_p(queue_interface)) {
                    return com.cyc.cycjava.cycl.subloop_queues.asynch_basic_doubly_linked_queue_clear_method(queue_interface);
                } else {
                    if (NIL != com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_p(queue_interface)) {
                        return com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_clear_method(queue_interface);
                    } else {
                        if (NIL != com.cyc.cycjava.cycl.subloop_queues.basic_ipc_queue_p(queue_interface)) {
                            return com.cyc.cycjava.cycl.subloop_queues.basic_ipc_queue_clear_method(queue_interface);
                        } else {
                            if (NIL != com.cyc.cycjava.cycl.subloop_queues.basic_queue_p(queue_interface)) {
                                return com.cyc.cycjava.cycl.subloop_queues.basic_queue_clear_method(queue_interface);
                            } else {
                                return methods.funcall_instance_method_with_0_args(queue_interface, CLEAR);
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject queue_interface_clear(final SubLObject queue_interface) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subloop_queues.queue_interface_p(queue_interface))) {
            Errors.error(subloop_queues.$str376$QUEUE_INTERFACE_CLEAR___S_is_not_, queue_interface);
        }
        if (NIL != subloop_queues.basic_doubly_linked_ipc_queue_p(queue_interface)) {
            return subloop_queues.basic_doubly_linked_ipc_queue_clear_method(queue_interface);
        }
        if (NIL != subloop_queues.asynch_basic_doubly_linked_queue_p(queue_interface)) {
            return subloop_queues.asynch_basic_doubly_linked_queue_clear_method(queue_interface);
        }
        if (NIL != subloop_queues.basic_doubly_linked_queue_p(queue_interface)) {
            return subloop_queues.basic_doubly_linked_queue_clear_method(queue_interface);
        }
        if (NIL != subloop_queues.basic_ipc_queue_p(queue_interface)) {
            return subloop_queues.basic_ipc_queue_clear_method(queue_interface);
        }
        if (NIL != subloop_queues.basic_queue_p(queue_interface)) {
            return subloop_queues.basic_queue_clear_method(queue_interface);
        }
        return methods.funcall_instance_method_with_0_args(queue_interface, CLEAR);
    }

    public static final SubLObject queue_interface_reorder_contents_alt(SubLObject queue_interface, SubLObject ordered_contents) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == com.cyc.cycjava.cycl.subloop_queues.queue_interface_p(queue_interface)) {
                    Errors.error($str_alt377$QUEUE_INTERFACE_REORDER_CONTENTS_, queue_interface);
                }
            }
            if (NIL != com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_ipc_queue_p(queue_interface)) {
                return com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_reorder_contents_method(queue_interface, ordered_contents);
            } else {
                if (NIL != com.cyc.cycjava.cycl.subloop_queues.asynch_basic_doubly_linked_queue_p(queue_interface)) {
                    return com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_reorder_contents_method(queue_interface, ordered_contents);
                } else {
                    if (NIL != com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_p(queue_interface)) {
                        return com.cyc.cycjava.cycl.subloop_queues.basic_doubly_linked_queue_reorder_contents_method(queue_interface, ordered_contents);
                    } else {
                        if (NIL != com.cyc.cycjava.cycl.subloop_queues.basic_ipc_queue_p(queue_interface)) {
                            return com.cyc.cycjava.cycl.subloop_queues.basic_ipc_queue_reorder_contents_method(queue_interface, ordered_contents);
                        } else {
                            if (NIL != com.cyc.cycjava.cycl.subloop_queues.basic_queue_p(queue_interface)) {
                                return com.cyc.cycjava.cycl.subloop_queues.basic_queue_reorder_contents_method(queue_interface, ordered_contents);
                            } else {
                                return methods.funcall_instance_method_with_1_args(queue_interface, REORDER_CONTENTS, ordered_contents);
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject queue_interface_reorder_contents(final SubLObject queue_interface, final SubLObject ordered_contents) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subloop_queues.queue_interface_p(queue_interface))) {
            Errors.error(subloop_queues.$str377$QUEUE_INTERFACE_REORDER_CONTENTS_, queue_interface);
        }
        if (NIL != subloop_queues.basic_doubly_linked_ipc_queue_p(queue_interface)) {
            return subloop_queues.basic_doubly_linked_queue_reorder_contents_method(queue_interface, ordered_contents);
        }
        if (NIL != subloop_queues.asynch_basic_doubly_linked_queue_p(queue_interface)) {
            return subloop_queues.basic_doubly_linked_queue_reorder_contents_method(queue_interface, ordered_contents);
        }
        if (NIL != subloop_queues.basic_doubly_linked_queue_p(queue_interface)) {
            return subloop_queues.basic_doubly_linked_queue_reorder_contents_method(queue_interface, ordered_contents);
        }
        if (NIL != subloop_queues.basic_ipc_queue_p(queue_interface)) {
            return subloop_queues.basic_ipc_queue_reorder_contents_method(queue_interface, ordered_contents);
        }
        if (NIL != subloop_queues.basic_queue_p(queue_interface)) {
            return subloop_queues.basic_queue_reorder_contents_method(queue_interface, ordered_contents);
        }
        return methods.funcall_instance_method_with_1_args(queue_interface, REORDER_CONTENTS, ordered_contents);
    }

    static private final SubLList $list_alt173 = list(list(makeSymbol("SET-LIST-INTERNAL"), makeSymbol("SELF"), NIL), list(makeSymbol("SET-PRIORITIZER-INTERNAL"), makeSymbol("SELF"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLList $list_alt175 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LIST"), list(makeSymbol("GET-LIST-INTERNAL"), makeSymbol("SELF")))), list(makeSymbol("PUNLESS"), list(makeSymbol("GET-LIST-INTERNAL"), makeSymbol("SELF")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-LIST"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), list(QUOTE, makeSymbol("BASIC-DOUBLY-LINKED-LIST")))), list(makeSymbol("SET-LIST-INTERNAL"), makeSymbol("SELF"), makeSymbol("TEMPLATE-LIST"))), list(RET, makeSymbol("TEMPLATE-LIST"))));

    public static SubLObject declare_subloop_queues_file() {
        declareFunction("queue_element_interface_p", "QUEUE-ELEMENT-INTERFACE-P", 1, 0, false);
        declareFunction("queue_prioritizer_interface_p", "QUEUE-PRIORITIZER-INTERFACE-P", 1, 0, false);
        declareFunction("queue_prioritizer_template_p", "QUEUE-PRIORITIZER-TEMPLATE-P", 1, 0, false);
        declareFunction("queue_simple_sorter_template_p", "QUEUE-SIMPLE-SORTER-TEMPLATE-P", 1, 0, false);
        declareFunction("get_basic_queue_simple_sorter_element_key_function", "GET-BASIC-QUEUE-SIMPLE-SORTER-ELEMENT-KEY-FUNCTION", 1, 0, false);
        declareFunction("set_basic_queue_simple_sorter_element_key_function", "SET-BASIC-QUEUE-SIMPLE-SORTER-ELEMENT-KEY-FUNCTION", 2, 0, false);
        declareFunction("get_basic_queue_simple_sorter_sort_predicate", "GET-BASIC-QUEUE-SIMPLE-SORTER-SORT-PREDICATE", 1, 0, false);
        declareFunction("set_basic_queue_simple_sorter_sort_predicate", "SET-BASIC-QUEUE-SIMPLE-SORTER-SORT-PREDICATE", 2, 0, false);
        declareFunction("basic_queue_simple_sorter_order_queue_internal_method", "BASIC-QUEUE-SIMPLE-SORTER-ORDER-QUEUE-INTERNAL-METHOD", 2, 0, false);
        declareFunction("basic_queue_simple_sorter_order_queue_method", "BASIC-QUEUE-SIMPLE-SORTER-ORDER-QUEUE-METHOD", 2, 0, false);
        declareFunction("subloop_reserved_initialize_basic_queue_simple_sorter_class", "SUBLOOP-RESERVED-INITIALIZE-BASIC-QUEUE-SIMPLE-SORTER-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_basic_queue_simple_sorter_instance", "SUBLOOP-RESERVED-INITIALIZE-BASIC-QUEUE-SIMPLE-SORTER-INSTANCE", 1, 0, false);
        declareFunction("basic_queue_simple_sorter_p", "BASIC-QUEUE-SIMPLE-SORTER-P", 1, 0, false);
        declareFunction("basic_queue_simple_sorter_initialize_method", "BASIC-QUEUE-SIMPLE-SORTER-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("basic_queue_simple_sorter_get_sort_predicate_method", "BASIC-QUEUE-SIMPLE-SORTER-GET-SORT-PREDICATE-METHOD", 1, 0, false);
        declareFunction("basic_queue_simple_sorter_set_sort_predicate_method", "BASIC-QUEUE-SIMPLE-SORTER-SET-SORT-PREDICATE-METHOD", 2, 0, false);
        declareFunction("basic_queue_simple_sorter_get_element_key_method", "BASIC-QUEUE-SIMPLE-SORTER-GET-ELEMENT-KEY-METHOD", 1, 0, false);
        declareFunction("basic_queue_simple_sorter_set_element_key_method", "BASIC-QUEUE-SIMPLE-SORTER-SET-ELEMENT-KEY-METHOD", 2, 0, false);
        declareFunction("queue_interface_p", "QUEUE-INTERFACE-P", 1, 0, false);
        declareFunction("end_pointer_queue_template_p", "END-POINTER-QUEUE-TEMPLATE-P", 1, 0, false);
        declareFunction("get_basic_queue_prioritizer", "GET-BASIC-QUEUE-PRIORITIZER", 1, 0, false);
        declareFunction("set_basic_queue_prioritizer", "SET-BASIC-QUEUE-PRIORITIZER", 2, 0, false);
        declareFunction("get_basic_queue_last_cons", "GET-BASIC-QUEUE-LAST-CONS", 1, 0, false);
        declareFunction("set_basic_queue_last_cons", "SET-BASIC-QUEUE-LAST-CONS", 2, 0, false);
        declareFunction("get_basic_queue_first_cons", "GET-BASIC-QUEUE-FIRST-CONS", 1, 0, false);
        declareFunction("set_basic_queue_first_cons", "SET-BASIC-QUEUE-FIRST-CONS", 2, 0, false);
        declareFunction("get_basic_queue_is_passive", "GET-BASIC-QUEUE-IS-PASSIVE", 1, 0, false);
        declareFunction("set_basic_queue_is_passive", "SET-BASIC-QUEUE-IS-PASSIVE", 2, 0, false);
        declareFunction("basic_queue_enqueued_p_method", "BASIC-QUEUE-ENQUEUED-P-METHOD", 2, 0, false);
        declareFunction("basic_queue_peek_method", "BASIC-QUEUE-PEEK-METHOD", 1, 0, false);
        declareFunction("basic_queue_reorder_contents_method", "BASIC-QUEUE-REORDER-CONTENTS-METHOD", 2, 0, false);
        declareFunction("basic_queue_clear_method", "BASIC-QUEUE-CLEAR-METHOD", 1, 0, false);
        declareFunction("basic_queue_set_contents_method", "BASIC-QUEUE-SET-CONTENTS-METHOD", 2, 0, false);
        declareFunction("basic_queue_get_contents_method", "BASIC-QUEUE-GET-CONTENTS-METHOD", 1, 0, false);
        declareFunction("basic_queue_get_element_count_method", "BASIC-QUEUE-GET-ELEMENT-COUNT-METHOD", 1, 0, false);
        declareFunction("basic_queue_find_method", "BASIC-QUEUE-FIND-METHOD", 2, 2, false);
        declareFunction("basic_queue_dequeue_method", "BASIC-QUEUE-DEQUEUE-METHOD", 1, 0, false);
        declareFunction("basic_queue_remove_method", "BASIC-QUEUE-REMOVE-METHOD", 2, 0, false);
        declareFunction("basic_queue_on_enqueue_method", "BASIC-QUEUE-ON-ENQUEUE-METHOD", 2, 0, false);
        declareFunction("basic_queue_enqueue_method", "BASIC-QUEUE-ENQUEUE-METHOD", 2, 0, false);
        declareFunction("basic_queue_empty_p_method", "BASIC-QUEUE-EMPTY-P-METHOD", 1, 0, false);
        declareFunction("basic_queue_print_method", "BASIC-QUEUE-PRINT-METHOD", 3, 0, false);
        declareFunction("subloop_reserved_initialize_basic_queue_class", "SUBLOOP-RESERVED-INITIALIZE-BASIC-QUEUE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_basic_queue_instance", "SUBLOOP-RESERVED-INITIALIZE-BASIC-QUEUE-INSTANCE", 1, 0, false);
        declareFunction("basic_queue_p", "BASIC-QUEUE-P", 1, 0, false);
        declareFunction("basic_queue_initialize_method", "BASIC-QUEUE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("basic_queue_get_first_cons_method", "BASIC-QUEUE-GET-FIRST-CONS-METHOD", 1, 0, false);
        declareFunction("basic_queue_set_first_cons_method", "BASIC-QUEUE-SET-FIRST-CONS-METHOD", 2, 0, false);
        declareFunction("basic_queue_get_end_pointer_method", "BASIC-QUEUE-GET-END-POINTER-METHOD", 1, 0, false);
        declareFunction("basic_queue_set_end_pointer_method", "BASIC-QUEUE-SET-END-POINTER-METHOD", 2, 0, false);
        declareFunction("basic_queue_get_prioritizer_method", "BASIC-QUEUE-GET-PRIORITIZER-METHOD", 1, 0, false);
        declareFunction("basic_queue_set_prioritizer_method", "BASIC-QUEUE-SET-PRIORITIZER-METHOD", 2, 0, false);
        declareFunction("basic_queue_passive_p_method", "BASIC-QUEUE-PASSIVE-P-METHOD", 1, 0, false);
        declareFunction("basic_queue_set_passive_method", "BASIC-QUEUE-SET-PASSIVE-METHOD", 2, 0, false);
        declareFunction("doubly_linked_queue_template_p", "DOUBLY-LINKED-QUEUE-TEMPLATE-P", 1, 0, false);
        declareFunction("get_basic_doubly_linked_queue_prioritizer", "GET-BASIC-DOUBLY-LINKED-QUEUE-PRIORITIZER", 1, 0, false);
        declareFunction("set_basic_doubly_linked_queue_prioritizer", "SET-BASIC-DOUBLY-LINKED-QUEUE-PRIORITIZER", 2, 0, false);
        declareFunction("get_basic_doubly_linked_queue_list", "GET-BASIC-DOUBLY-LINKED-QUEUE-LIST", 1, 0, false);
        declareFunction("set_basic_doubly_linked_queue_list", "SET-BASIC-DOUBLY-LINKED-QUEUE-LIST", 2, 0, false);
        declareFunction("get_basic_doubly_linked_queue_is_passive", "GET-BASIC-DOUBLY-LINKED-QUEUE-IS-PASSIVE", 1, 0, false);
        declareFunction("set_basic_doubly_linked_queue_is_passive", "SET-BASIC-DOUBLY-LINKED-QUEUE-IS-PASSIVE", 2, 0, false);
        declareFunction("basic_doubly_linked_queue_enqueued_p_method", "BASIC-DOUBLY-LINKED-QUEUE-ENQUEUED-P-METHOD", 2, 0, false);
        declareFunction("basic_doubly_linked_queue_peek_method", "BASIC-DOUBLY-LINKED-QUEUE-PEEK-METHOD", 1, 0, false);
        declareFunction("basic_doubly_linked_queue_reorder_contents_method", "BASIC-DOUBLY-LINKED-QUEUE-REORDER-CONTENTS-METHOD", 2, 0, false);
        declareFunction("basic_doubly_linked_queue_clear_method", "BASIC-DOUBLY-LINKED-QUEUE-CLEAR-METHOD", 1, 0, false);
        declareFunction("basic_doubly_linked_queue_set_contents_method", "BASIC-DOUBLY-LINKED-QUEUE-SET-CONTENTS-METHOD", 2, 0, false);
        declareFunction("basic_doubly_linked_queue_get_contents_method", "BASIC-DOUBLY-LINKED-QUEUE-GET-CONTENTS-METHOD", 1, 0, false);
        declareFunction("basic_doubly_linked_queue_get_element_count_method", "BASIC-DOUBLY-LINKED-QUEUE-GET-ELEMENT-COUNT-METHOD", 1, 0, false);
        declareFunction("basic_doubly_linked_queue_find_method", "BASIC-DOUBLY-LINKED-QUEUE-FIND-METHOD", 2, 2, false);
        declareFunction("basic_doubly_linked_queue_dequeue_method", "BASIC-DOUBLY-LINKED-QUEUE-DEQUEUE-METHOD", 1, 0, false);
        declareFunction("basic_doubly_linked_queue_remove_method", "BASIC-DOUBLY-LINKED-QUEUE-REMOVE-METHOD", 2, 0, false);
        declareFunction("basic_doubly_linked_queue_on_enqueue_method", "BASIC-DOUBLY-LINKED-QUEUE-ON-ENQUEUE-METHOD", 2, 0, false);
        declareFunction("basic_doubly_linked_queue_enqueue_method", "BASIC-DOUBLY-LINKED-QUEUE-ENQUEUE-METHOD", 2, 0, false);
        declareFunction("basic_doubly_linked_queue_empty_p_method", "BASIC-DOUBLY-LINKED-QUEUE-EMPTY-P-METHOD", 1, 0, false);
        declareFunction("basic_doubly_linked_queue_set_prioritizer_method", "BASIC-DOUBLY-LINKED-QUEUE-SET-PRIORITIZER-METHOD", 2, 0, false);
        declareFunction("basic_doubly_linked_queue_get_prioritizer_method", "BASIC-DOUBLY-LINKED-QUEUE-GET-PRIORITIZER-METHOD", 1, 0, false);
        declareFunction("basic_doubly_linked_queue_print_method", "BASIC-DOUBLY-LINKED-QUEUE-PRINT-METHOD", 3, 0, false);
        declareFunction("basic_doubly_linked_queue_get_list_method", "BASIC-DOUBLY-LINKED-QUEUE-GET-LIST-METHOD", 1, 0, false);
        declareFunction("basic_doubly_linked_queue_initialize_qua_doubly_linked_queue_method", "BASIC-DOUBLY-LINKED-QUEUE-INITIALIZE-QUA-DOUBLY-LINKED-QUEUE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_basic_doubly_linked_queue_class", "SUBLOOP-RESERVED-INITIALIZE-BASIC-DOUBLY-LINKED-QUEUE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_basic_doubly_linked_queue_instance", "SUBLOOP-RESERVED-INITIALIZE-BASIC-DOUBLY-LINKED-QUEUE-INSTANCE", 1, 0, false);
        declareFunction("basic_doubly_linked_queue_p", "BASIC-DOUBLY-LINKED-QUEUE-P", 1, 0, false);
        declareFunction("basic_doubly_linked_queue_get_list_internal_method", "BASIC-DOUBLY-LINKED-QUEUE-GET-LIST-INTERNAL-METHOD", 1, 0, false);
        declareFunction("basic_doubly_linked_queue_set_list_internal_method", "BASIC-DOUBLY-LINKED-QUEUE-SET-LIST-INTERNAL-METHOD", 2, 0, false);
        declareFunction("basic_doubly_linked_queue_get_prioritizer_internal_method", "BASIC-DOUBLY-LINKED-QUEUE-GET-PRIORITIZER-INTERNAL-METHOD", 1, 0, false);
        declareFunction("basic_doubly_linked_queue_set_prioritizer_internal_method", "BASIC-DOUBLY-LINKED-QUEUE-SET-PRIORITIZER-INTERNAL-METHOD", 2, 0, false);
        declareFunction("basic_doubly_linked_queue_initialize_method", "BASIC-DOUBLY-LINKED-QUEUE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("basic_doubly_linked_queue_passive_p_method", "BASIC-DOUBLY-LINKED-QUEUE-PASSIVE-P-METHOD", 1, 0, false);
        declareFunction("basic_doubly_linked_queue_set_passive_method", "BASIC-DOUBLY-LINKED-QUEUE-SET-PASSIVE-METHOD", 2, 0, false);
        declareFunction("get_asynch_basic_doubly_linked_queue_lock_history", "GET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK-HISTORY", 1, 0, false);
        declareFunction("set_asynch_basic_doubly_linked_queue_lock_history", "SET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK-HISTORY", 2, 0, false);
        declareFunction("get_asynch_basic_doubly_linked_queue_lock", "GET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK", 1, 0, false);
        declareFunction("set_asynch_basic_doubly_linked_queue_lock", "SET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK", 2, 0, false);
        declareFunction("subloop_reserved_initialize_asynch_basic_doubly_linked_queue_class", "SUBLOOP-RESERVED-INITIALIZE-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_asynch_basic_doubly_linked_queue_instance", "SUBLOOP-RESERVED-INITIALIZE-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-INSTANCE", 1, 0, false);
        declareFunction("asynch_basic_doubly_linked_queue_p", "ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-P", 1, 0, false);
        declareFunction("asynch_basic_doubly_linked_queue_initialize_method", "ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("asynch_basic_doubly_linked_queue_set_prioritizer_method", "ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-SET-PRIORITIZER-METHOD", 2, 0, false);
        declareFunction("asynch_basic_doubly_linked_queue_enqueue_method", "ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-ENQUEUE-METHOD", 2, 0, false);
        declareFunction("asynch_basic_doubly_linked_queue_on_enqueue_method", "ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-ON-ENQUEUE-METHOD", 2, 0, false);
        declareFunction("asynch_basic_doubly_linked_queue_remove_method", "ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-REMOVE-METHOD", 2, 0, false);
        declareFunction("asynch_basic_doubly_linked_queue_dequeue_method", "ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-DEQUEUE-METHOD", 1, 0, false);
        declareFunction("asynch_basic_doubly_linked_queue_set_contents_method", "ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-SET-CONTENTS-METHOD", 2, 0, false);
        declareFunction("asynch_basic_doubly_linked_queue_clear_method", "ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-CLEAR-METHOD", 1, 0, false);
        declareFunction("get_basic_doubly_linked_ipc_queue_semaphore", "GET-BASIC-DOUBLY-LINKED-IPC-QUEUE-SEMAPHORE", 1, 0, false);
        declareFunction("set_basic_doubly_linked_ipc_queue_semaphore", "SET-BASIC-DOUBLY-LINKED-IPC-QUEUE-SEMAPHORE", 2, 0, false);
        declareFunction("get_basic_doubly_linked_ipc_queue_lock", "GET-BASIC-DOUBLY-LINKED-IPC-QUEUE-LOCK", 1, 0, false);
        declareFunction("set_basic_doubly_linked_ipc_queue_lock", "SET-BASIC-DOUBLY-LINKED-IPC-QUEUE-LOCK", 2, 0, false);
        declareFunction("get_basic_doubly_linked_ipc_queue_semaphore_name", "GET-BASIC-DOUBLY-LINKED-IPC-QUEUE-SEMAPHORE-NAME", 1, 0, false);
        declareFunction("set_basic_doubly_linked_ipc_queue_semaphore_name", "SET-BASIC-DOUBLY-LINKED-IPC-QUEUE-SEMAPHORE-NAME", 2, 0, false);
        declareFunction("get_basic_doubly_linked_ipc_queue_base_suffix_counter", "GET-BASIC-DOUBLY-LINKED-IPC-QUEUE-BASE-SUFFIX-COUNTER", 1, 0, false);
        declareFunction("set_basic_doubly_linked_ipc_queue_base_suffix_counter", "SET-BASIC-DOUBLY-LINKED-IPC-QUEUE-BASE-SUFFIX-COUNTER", 2, 0, false);
        declareFunction("get_basic_doubly_linked_ipc_queue_base_name", "GET-BASIC-DOUBLY-LINKED-IPC-QUEUE-BASE-NAME", 1, 0, false);
        declareFunction("set_basic_doubly_linked_ipc_queue_base_name", "SET-BASIC-DOUBLY-LINKED-IPC-QUEUE-BASE-NAME", 2, 0, false);
        declareFunction("subloop_reserved_initialize_basic_doubly_linked_ipc_queue_class", "SUBLOOP-RESERVED-INITIALIZE-BASIC-DOUBLY-LINKED-IPC-QUEUE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_basic_doubly_linked_ipc_queue_instance", "SUBLOOP-RESERVED-INITIALIZE-BASIC-DOUBLY-LINKED-IPC-QUEUE-INSTANCE", 1, 0, false);
        declareFunction("basic_doubly_linked_ipc_queue_p", "BASIC-DOUBLY-LINKED-IPC-QUEUE-P", 1, 0, false);
        declareFunction("basic_doubly_linked_ipc_queue_initialize_method", "BASIC-DOUBLY-LINKED-IPC-QUEUE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("basic_doubly_linked_ipc_queue_set_prioritizer_method", "BASIC-DOUBLY-LINKED-IPC-QUEUE-SET-PRIORITIZER-METHOD", 2, 0, false);
        declareFunction("basic_doubly_linked_ipc_queue_enqueue_method", "BASIC-DOUBLY-LINKED-IPC-QUEUE-ENQUEUE-METHOD", 2, 0, false);
        declareFunction("basic_doubly_linked_ipc_queue_remove_method", "BASIC-DOUBLY-LINKED-IPC-QUEUE-REMOVE-METHOD", 2, 0, false);
        declareFunction("basic_doubly_linked_ipc_queue_dequeue_method", "BASIC-DOUBLY-LINKED-IPC-QUEUE-DEQUEUE-METHOD", 1, 0, false);
        declareFunction("basic_doubly_linked_ipc_queue_set_contents_method", "BASIC-DOUBLY-LINKED-IPC-QUEUE-SET-CONTENTS-METHOD", 2, 0, false);
        declareFunction("basic_doubly_linked_ipc_queue_clear_method", "BASIC-DOUBLY-LINKED-IPC-QUEUE-CLEAR-METHOD", 1, 0, false);
        declareFunction("get_basic_ipc_queue_prioritizer", "GET-BASIC-IPC-QUEUE-PRIORITIZER", 1, 0, false);
        declareFunction("set_basic_ipc_queue_prioritizer", "SET-BASIC-IPC-QUEUE-PRIORITIZER", 2, 0, false);
        declareFunction("get_basic_ipc_queue_actual_ipc_queue", "GET-BASIC-IPC-QUEUE-ACTUAL-IPC-QUEUE", 1, 0, false);
        declareFunction("set_basic_ipc_queue_actual_ipc_queue", "SET-BASIC-IPC-QUEUE-ACTUAL-IPC-QUEUE", 2, 0, false);
        declareFunction("get_basic_ipc_queue_is_passive", "GET-BASIC-IPC-QUEUE-IS-PASSIVE", 1, 0, false);
        declareFunction("set_basic_ipc_queue_is_passive", "SET-BASIC-IPC-QUEUE-IS-PASSIVE", 2, 0, false);
        declareFunction("basic_ipc_queue_on_enqueue_method", "BASIC-IPC-QUEUE-ON-ENQUEUE-METHOD", 2, 0, false);
        declareFunction("basic_ipc_queue_print_method", "BASIC-IPC-QUEUE-PRINT-METHOD", 3, 0, false);
        declareFunction("subloop_reserved_initialize_basic_ipc_queue_class", "SUBLOOP-RESERVED-INITIALIZE-BASIC-IPC-QUEUE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_basic_ipc_queue_instance", "SUBLOOP-RESERVED-INITIALIZE-BASIC-IPC-QUEUE-INSTANCE", 1, 0, false);
        declareFunction("basic_ipc_queue_p", "BASIC-IPC-QUEUE-P", 1, 0, false);
        declareFunction("basic_ipc_queue_initialize_method", "BASIC-IPC-QUEUE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("basic_ipc_queue_get_actual_ipc_queue_method", "BASIC-IPC-QUEUE-GET-ACTUAL-IPC-QUEUE-METHOD", 1, 0, false);
        declareFunction("basic_ipc_queue_set_actual_ipc_queue_method", "BASIC-IPC-QUEUE-SET-ACTUAL-IPC-QUEUE-METHOD", 2, 0, false);
        declareFunction("basic_ipc_queue_get_prioritizer_method", "BASIC-IPC-QUEUE-GET-PRIORITIZER-METHOD", 1, 0, false);
        declareFunction("basic_ipc_queue_set_prioritizer_method", "BASIC-IPC-QUEUE-SET-PRIORITIZER-METHOD", 2, 0, false);
        declareFunction("basic_ipc_queue_empty_p_method", "BASIC-IPC-QUEUE-EMPTY-P-METHOD", 1, 0, false);
        declareFunction("basic_ipc_queue_enqueue_method", "BASIC-IPC-QUEUE-ENQUEUE-METHOD", 2, 0, false);
        declareFunction("basic_ipc_queue_remove_method", "BASIC-IPC-QUEUE-REMOVE-METHOD", 2, 0, false);
        declareFunction("basic_ipc_queue_dequeue_method", "BASIC-IPC-QUEUE-DEQUEUE-METHOD", 1, 0, false);
        declareFunction("basic_ipc_queue_get_element_count_method", "BASIC-IPC-QUEUE-GET-ELEMENT-COUNT-METHOD", 1, 0, false);
        declareFunction("basic_ipc_queue_get_contents_method", "BASIC-IPC-QUEUE-GET-CONTENTS-METHOD", 1, 0, false);
        declareFunction("basic_ipc_queue_set_contents_method", "BASIC-IPC-QUEUE-SET-CONTENTS-METHOD", 2, 0, false);
        declareFunction("basic_ipc_queue_clear_method", "BASIC-IPC-QUEUE-CLEAR-METHOD", 1, 0, false);
        declareFunction("basic_ipc_queue_reorder_contents_method", "BASIC-IPC-QUEUE-REORDER-CONTENTS-METHOD", 2, 0, false);
        declareFunction("basic_ipc_queue_peek_method", "BASIC-IPC-QUEUE-PEEK-METHOD", 1, 0, false);
        declareFunction("basic_ipc_queue_enqueued_p_method", "BASIC-IPC-QUEUE-ENQUEUED-P-METHOD", 2, 0, false);
        declareFunction("basic_ipc_queue_find_method", "BASIC-IPC-QUEUE-FIND-METHOD", 2, 2, false);
        declareFunction("basic_ipc_queue_passive_p_method", "BASIC-IPC-QUEUE-PASSIVE-P-METHOD", 1, 0, false);
        declareFunction("basic_ipc_queue_set_passive_method", "BASIC-IPC-QUEUE-SET-PASSIVE-METHOD", 2, 0, false);
        declareFunction("queue_interface_get_prioritizer", "QUEUE-INTERFACE-GET-PRIORITIZER", 1, 0, false);
        declareFunction("queue_interface_set_prioritizer", "QUEUE-INTERFACE-SET-PRIORITIZER", 2, 0, false);
        declareFunction("queue_interface_empty_p", "QUEUE-INTERFACE-EMPTY-P", 1, 0, false);
        declareFunction("queue_interface_enqueue", "QUEUE-INTERFACE-ENQUEUE", 2, 0, false);
        declareFunction("queue_interface_remove", "QUEUE-INTERFACE-REMOVE", 2, 0, false);
        declareFunction("queue_interface_dequeue", "QUEUE-INTERFACE-DEQUEUE", 1, 0, false);
        declareFunction("queue_interface_get_element_count", "QUEUE-INTERFACE-GET-ELEMENT-COUNT", 1, 0, false);
        declareFunction("queue_interface_get_contents", "QUEUE-INTERFACE-GET-CONTENTS", 1, 0, false);
        declareFunction("queue_interface_set_contents", "QUEUE-INTERFACE-SET-CONTENTS", 2, 0, false);
        declareFunction("queue_interface_clear", "QUEUE-INTERFACE-CLEAR", 1, 0, false);
        declareFunction("queue_interface_reorder_contents", "QUEUE-INTERFACE-REORDER-CONTENTS", 2, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt176 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LIST"), list(makeSymbol("GET-LIST-INTERNAL"), makeSymbol("SELF")))), list(makeSymbol("PUNLESS"), makeSymbol("TEMPLATE-LIST"), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("DL-QUEUE:{}")), list(RET, makeSymbol("SELF"))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-ENUMERATOR"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ALLOCATE-ENUMERATOR"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("TEMPLATE-LIST")))), list(makeSymbol("PCOND"), list(list(makeSymbol("NULL"), makeSymbol("TEMPLATE-ENUMERATOR")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("#<~S Class is not correctly implemented.  ALLOCATE-ENUMERATOR failed.>"), list(makeSymbol("CLASS-OF"), makeSymbol("SELF"))), list(RET, makeSymbol("SELF"))), list(list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-ENUMERATOR"), list(QUOTE, makeSymbol("EMPTY-P"))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("DL-QUEUE:{}"))), list(T, list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("DL-QUEUE:{~S"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-ENUMERATOR"), list(QUOTE, makeSymbol("FIRST")))), list(makeSymbol("WHILE"), list(makeSymbol("CNOT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-ENUMERATOR"), list(QUOTE, makeSymbol("LAST-P")))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("<-~S"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-ENUMERATOR"), list(QUOTE, makeSymbol("NEXT"))))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("}")))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("DEALLOCATE-ENUMERATOR"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("TEMPLATE-LIST"), makeSymbol("TEMPLATE-ENUMERATOR")))), list(RET, makeSymbol("SELF")));

    static private final SubLList $list_alt177 = list(list(RET, list(makeSymbol("GET-PRIORITIZER-INTERNAL"), makeSymbol("SELF"))));

    static private final SubLList $list_alt178 = list(list(makeSymbol("PUNLESS"), makeSymbol("NEW-PRIORITIZER"), list(makeSymbol("SET-PRIORITIZER-INTERNAL"), makeSymbol("SELF"), NIL), list(RET, NIL)), list(makeSymbol("MUST"), list(makeSymbol("QUEUE-PRIORITIZER-INTERFACE-P"), makeSymbol("NEW-PRIORITIZER")), makeString("(SET-PRIORITIZER ~S): ~S is not an instance of QUEUE-PRIORITIZER-INTERFACE."), makeSymbol("SELF"), makeSymbol("NEW-PRIORITIZER")), list(makeSymbol("SET-PRIORITIZER-INTERNAL"), makeSymbol("SELF"), makeSymbol("NEW-PRIORITIZER")), list(RET, makeSymbol("NEW-PRIORITIZER")));

    static private final SubLList $list_alt179 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LIST"), list(makeSymbol("GET-LIST-INTERNAL"), makeSymbol("SELF")))), list(RET, list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("TEMPLATE-LIST")), list(makeSymbol("COLLECTION-TEMPLATE-EMPTY-P"), makeSymbol("TEMPLATE-LIST"))))));

    static private final SubLList $list_alt180 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-RESOLVED-LIST"), list(makeSymbol("GET-LIST"), makeSymbol("SELF")))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ADD"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("TEMPLATE-RESOLVED-LIST"), makeSymbol("NEW-ELEMENT")), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("PASSIVE-P"), makeSymbol("SELF"))), list(makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), makeSymbol("NEW-ELEMENT"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("NEW-ELEMENT"), list(QUOTE, makeSymbol("ENQUEUE-NOTIFY")), makeSymbol("SELF"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ON-ENQUEUE")), makeSymbol("NEW-ELEMENT")), list(RET, makeSymbol("NEW-ELEMENT"))));

    static private final SubLList $list_alt181 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-RESOLVED-LIST"), list(makeSymbol("GET-LIST"), makeSymbol("SELF")))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("REMOVE"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("TEMPLATE-RESOLVED-LIST"), makeSymbol("OLD-ELEMENT")), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("PASSIVE-P"), makeSymbol("SELF"))), list(makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), makeSymbol("OLD-ELEMENT"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("OLD-ELEMENT"), list(QUOTE, makeSymbol("REMOVE-NOTIFY")), makeSymbol("SELF"))), list(RET, makeSymbol("OLD-ELEMENT"))));

    static private final SubLList $list_alt182 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LIST"), list(makeSymbol("GET-LIST-INTERNAL"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-LIST"), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PRIORITIZER"), list(makeSymbol("GET-PRIORITIZER"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-PRIORITIZER"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-PRIORITIZER"), list(QUOTE, makeSymbol("ORDER-QUEUE")), makeSymbol("SELF")))), list(makeSymbol("CLET"), list(list(makeSymbol("DEQUEUED-ITEM"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("POP"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("TEMPLATE-LIST")))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("PASSIVE-P"), makeSymbol("SELF"))), list(makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), makeSymbol("DEQUEUED-ITEM"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("DEQUEUED-ITEM"), list(QUOTE, makeSymbol("DEQUEUE-NOTIFY")), makeSymbol("SELF"))), list(RET, makeSymbol("DEQUEUED-ITEM"))))), list(RET, NIL));

    static private final SubLList $list_alt183 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LIST"), list(makeSymbol("GET-LIST-INTERNAL"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-LIST"), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-ENUMERATOR"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-LIST"), list(QUOTE, makeSymbol("ALLOCATE-ENUMERATOR"))))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-ENUMERATOR"), list(makeSymbol("PUNLESS"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-ENUMERATOR"), list(QUOTE, makeSymbol("EMPTY-P"))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CURRENT-ELEMENT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-ENUMERATOR"), list(QUOTE, makeSymbol("FIRST"))))), list(makeSymbol("PWHEN"), list(makeSymbol("FUNCALL"), makeSymbol("EQUALITY-PRED"), makeSymbol("KEY-VALUE"), list(makeSymbol("FUNCALL"), makeSymbol("KEY-ACCESSOR-FUNCTION"), makeSymbol("TEMPLATE-CURRENT-ELEMENT"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-LIST"), list(QUOTE, makeSymbol("DEALLOCATE-ENUMERATOR")), makeSymbol("TEMPLATE-ENUMERATOR")), list(RET, makeSymbol("TEMPLATE-CURRENT-ELEMENT"))), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-CURRENT-ELEMENT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-ENUMERATOR"), list(QUOTE, makeSymbol("NEXT")))), list(makeSymbol("WHILE"), makeSymbol("TEMPLATE-CURRENT-ELEMENT"), list(makeSymbol("PWHEN"), list(makeSymbol("FUNCALL"), makeSymbol("EQUALITY-PRED"), makeSymbol("KEY-VALUE"), list(makeSymbol("FUNCALL"), makeSymbol("KEY-ACCESSOR-FUNCTION"), makeSymbol("TEMPLATE-CURRENT-ELEMENT"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-LIST"), list(QUOTE, makeSymbol("DEALLOCATE-ENUMERATOR")), makeSymbol("TEMPLATE-ENUMERATOR")), list(RET, makeSymbol("TEMPLATE-CURRENT-ELEMENT"))), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-CURRENT-ELEMENT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-ENUMERATOR"), list(QUOTE, makeSymbol("NEXT")))))))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-LIST"), list(QUOTE, makeSymbol("DEALLOCATE-ENUMERATOR")), makeSymbol("TEMPLATE-ENUMERATOR")), list(RET, NIL)))), list(RET, NIL));

    static private final SubLList $list_alt184 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LIST"), list(makeSymbol("GET-LIST-INTERNAL"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-LIST"), list(RET, list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-ELEMENT-COUNT"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("TEMPLATE-LIST"))))), list(RET, ZERO_INTEGER));

    static private final SubLList $list_alt185 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LIST"), list(makeSymbol("GET-LIST-INTERNAL"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-LIST"), list(RET, list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-CONTENTS"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("TEMPLATE-LIST"))))), list(RET, NIL));

    static private final SubLList $list_alt186 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-RESOLVED-LIST"), list(makeSymbol("GET-LIST"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-ENUMERATOR"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ALLOCATE-ENUMERATOR"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("TEMPLATE-RESOLVED-LIST")))), list(makeSymbol("PUNLESS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("EMPTY-P"), makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR")), makeSymbol("TEMPLATE-ENUMERATOR")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CURRENT-ITEM"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("FIRST"), makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR")), makeSymbol("TEMPLATE-ENUMERATOR")))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("PASSIVE-P"), makeSymbol("SELF"))), list(makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), makeSymbol("TEMPLATE-CURRENT-ITEM"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-CURRENT-ITEM"), list(QUOTE, makeSymbol("DEQUEUE-NOTIFY")))), list(makeSymbol("WHILE"), list(makeSymbol("CNOT"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("LAST-P"), makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR")), makeSymbol("TEMPLATE-ENUMERATOR"))), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-CURRENT-ITEM"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEXT"), makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR")), makeSymbol("TEMPLATE-ENUMERATOR"))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("PASSIVE-P"), makeSymbol("SELF"))), list(makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), makeSymbol("TEMPLATE-CURRENT-ITEM"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-CURRENT-ITEM"), list(QUOTE, makeSymbol("DEQUEUE-NOTIFY")))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("DEALLOCATE-ENUMERATOR"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("TEMPLATE-RESOLVED-LIST"), makeSymbol("TEMPLATE-ENUMERATOR"))), list(makeSymbol("PWHEN"), makeSymbol("NEW-CONTENTS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-CONTENTS"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("TEMPLATE-RESOLVED-LIST"), makeSymbol("NEW-CONTENTS")), list(makeSymbol("CDOLIST"), list(makeSymbol("NEW-ITEM"), makeSymbol("NEW-CONTENTS")), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("PASSIVE-P"), makeSymbol("SELF"))), list(makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), makeSymbol("NEW-ITEM"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("NEW-ITEM"), list(QUOTE, makeSymbol("ENQUEUE-NOTIFY")), makeSymbol("SELF")))))), list(RET, makeSymbol("NEW-CONTENTS")));

    static private final SubLList $list_alt187 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LIST"), list(makeSymbol("GET-LIST-INTERNAL"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-LIST"), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-ENUMERATOR"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ALLOCATE-ENUMERATOR"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("TEMPLATE-LIST")))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CURRENT-ITEM"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("FIRST"), makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR")), makeSymbol("TEMPLATE-ENUMERATOR")))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("PASSIVE-P"), makeSymbol("SELF"))), list(makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), makeSymbol("TEMPLATE-CURRENT-ITEM"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-CURRENT-ITEM"), list(QUOTE, makeSymbol("DEQUEUE-NOTIFY")))), list(makeSymbol("WHILE"), list(makeSymbol("CNOT"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("LAST-P"), makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR")), makeSymbol("TEMPLATE-ENUMERATOR"))), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-CURRENT-ITEM"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEXT"), makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR")), makeSymbol("TEMPLATE-ENUMERATOR"))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("PASSIVE-P"), makeSymbol("SELF"))), list(makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), makeSymbol("TEMPLATE-CURRENT-ITEM"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-CURRENT-ITEM"), list(QUOTE, makeSymbol("DEQUEUE-NOTIFY")))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("DEALLOCATE-ENUMERATOR"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("TEMPLATE-LIST"), makeSymbol("TEMPLATE-ENUMERATOR"))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("CLEAR"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("TEMPLATE-LIST")))), list(RET, NIL));

    static private final SubLList $list_alt188 = list(list(makeSymbol("CLET"), list(list(makeSymbol("RESOLVED-LIST"), list(makeSymbol("GET-LIST"), makeSymbol("SELF")))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-CONTENTS"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("RESOLVED-LIST"), makeSymbol("ORDERED-CONTENTS")), list(RET, NIL)));

    static private final SubLList $list_alt189 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LIST"), list(makeSymbol("GET-LIST-INTERNAL"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-LIST"), list(makeSymbol("PUNLESS"), list(makeSymbol("="), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-ELEMENT-COUNT"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("TEMPLATE-LIST")), ZERO_INTEGER), list(RET, NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("NEXT-ITEM"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NTH"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("TEMPLATE-LIST"), ZERO_INTEGER))), list(RET, makeSymbol("NEXT-ITEM"))))), list(RET, NIL));

    static private final SubLList $list_alt190 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LIST"), list(makeSymbol("GET-LIST-INTERNAL"), makeSymbol("SELF")))), list(makeSymbol("PUNLESS"), makeSymbol("TEMPLATE-LIST"), list(RET, NIL)), list(RET, list(makeSymbol("INLINE-METHOD"), list(makeSymbol("MEMBER-P"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("TEMPLATE-LIST"), makeSymbol("OBJECT")))));

    static private final SubLList $list_alt192 = list(makeSymbol("DOUBLY-LINKED-QUEUE-TEMPLATE"));

    static private final SubLList $list_alt193 = list(new SubLObject[]{ list(makeSymbol("LIST"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("PRIORITIZER"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("IS-PASSIVE"), makeKeyword("BOOLEAN"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-LIST-INTERNAL"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-LIST-INTERNAL"), list(makeSymbol("NEW-LIST")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PRIORITIZER-INTERNAL"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PRIORITIZER-INTERNAL"), list(makeSymbol("NEW-PRIORITIZER")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PASSIVE-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PASSIVE"), list(makeSymbol("FLAG")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE-QUA-DOUBLY-LINKED-QUEUE"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-LIST"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PRIORITIZER"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PRIORITIZER"), list(makeSymbol("NEW-PRIORITIZER")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EMPTY-P"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ENQUEUE"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-ENQUEUE"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("PUBLIC"), makeKeyword("INSTANTIATE-TEMPLATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE"), list(makeSymbol("OLD-ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEQUEUE"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FIND"), list(makeSymbol("KEY-VALUE"), makeSymbol("&OPTIONAL"), list(makeSymbol("EQUALITY-PRED"), list(makeSymbol("FUNCTION"), EQL)), list(makeSymbol("KEY-ACCESSOR-FUNCTION"), list(makeSymbol("FUNCTION"), IDENTITY))), makeKeyword("PUBLIC"), makeKeyword("INSTANTIATE-TEMPLATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ELEMENT-COUNT"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONTENTS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CONTENTS"), list(makeSymbol("NEW-CONTENTS")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEAR"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REORDER-CONTENTS"), list(makeSymbol("ORDERED-CONTENTS")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PEEK"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ENQUEUED-P"), list(makeSymbol("OBJECT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")) });

    public static SubLObject init_subloop_queues_file() {
        return NIL;
    }

    public static SubLObject setup_subloop_queues_file() {
        interfaces.new_interface(subloop_queues.QUEUE_ELEMENT_INTERFACE, NIL, NIL, subloop_queues.$list1);
        interfaces.new_interface(subloop_queues.QUEUE_PRIORITIZER_INTERFACE, NIL, NIL, subloop_queues.$list3);
        interfaces.new_interface(subloop_queues.QUEUE_PRIORITIZER_TEMPLATE, subloop_queues.$list5, subloop_queues.$list6, subloop_queues.$list7);
        interfaces.interfaces_add_interface_instance_method(subloop_queues.ORDER_QUEUE, subloop_queues.QUEUE_PRIORITIZER_TEMPLATE, subloop_queues.$list9, subloop_queues.$list10, subloop_queues.$list11);
        interfaces.new_interface(subloop_queues.QUEUE_SIMPLE_SORTER_TEMPLATE, subloop_queues.$list13, subloop_queues.$list14, subloop_queues.$list15);
        interfaces.interfaces_add_interface_instance_method(subloop_queues.ORDER_QUEUE_INTERNAL, subloop_queues.QUEUE_SIMPLE_SORTER_TEMPLATE, subloop_queues.$list17, subloop_queues.$list18, subloop_queues.$list19);
        classes.subloop_new_class(subloop_queues.BASIC_QUEUE_SIMPLE_SORTER, OBJECT, subloop_queues.$list22, NIL, subloop_queues.$list23);
        classes.class_set_implements_slot_listeners(subloop_queues.BASIC_QUEUE_SIMPLE_SORTER, NIL);
        methods.methods_incorporate_instance_method(subloop_queues.ORDER_QUEUE_INTERNAL, subloop_queues.BASIC_QUEUE_SIMPLE_SORTER, subloop_queues.$list17, subloop_queues.$list18, subloop_queues.$list19);
        methods.subloop_register_instance_method(subloop_queues.BASIC_QUEUE_SIMPLE_SORTER, subloop_queues.ORDER_QUEUE_INTERNAL, subloop_queues.BASIC_QUEUE_SIMPLE_SORTER_ORDER_QUEUE_INTERNAL_METHOD);
        methods.methods_incorporate_instance_method(subloop_queues.ORDER_QUEUE, subloop_queues.BASIC_QUEUE_SIMPLE_SORTER, subloop_queues.$list9, subloop_queues.$list10, subloop_queues.$list11);
        methods.subloop_register_instance_method(subloop_queues.BASIC_QUEUE_SIMPLE_SORTER, subloop_queues.ORDER_QUEUE, subloop_queues.BASIC_QUEUE_SIMPLE_SORTER_ORDER_QUEUE_METHOD);
        classes.subloop_note_class_initialization_function(subloop_queues.BASIC_QUEUE_SIMPLE_SORTER, subloop_queues.SUBLOOP_RESERVED_INITIALIZE_BASIC_QUEUE_SIMPLE_SORTER_CLASS);
        classes.subloop_note_instance_initialization_function(subloop_queues.BASIC_QUEUE_SIMPLE_SORTER, subloop_queues.SUBLOOP_RESERVED_INITIALIZE_BASIC_QUEUE_SIMPLE_SORTER_INSTANCE);
        subloop_queues.subloop_reserved_initialize_basic_queue_simple_sorter_class(subloop_queues.BASIC_QUEUE_SIMPLE_SORTER);
        methods.methods_incorporate_instance_method(INITIALIZE, subloop_queues.BASIC_QUEUE_SIMPLE_SORTER, subloop_queues.$list17, NIL, subloop_queues.$list36);
        methods.subloop_register_instance_method(subloop_queues.BASIC_QUEUE_SIMPLE_SORTER, INITIALIZE, subloop_queues.BASIC_QUEUE_SIMPLE_SORTER_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(subloop_queues.GET_SORT_PREDICATE, subloop_queues.BASIC_QUEUE_SIMPLE_SORTER, subloop_queues.$list9, NIL, subloop_queues.$list40);
        methods.subloop_register_instance_method(subloop_queues.BASIC_QUEUE_SIMPLE_SORTER, subloop_queues.GET_SORT_PREDICATE, subloop_queues.BASIC_QUEUE_SIMPLE_SORTER_GET_SORT_PREDICATE_METHOD);
        methods.methods_incorporate_instance_method(subloop_queues.SET_SORT_PREDICATE, subloop_queues.BASIC_QUEUE_SIMPLE_SORTER, subloop_queues.$list9, subloop_queues.$list44, subloop_queues.$list45);
        methods.subloop_register_instance_method(subloop_queues.BASIC_QUEUE_SIMPLE_SORTER, subloop_queues.SET_SORT_PREDICATE, subloop_queues.BASIC_QUEUE_SIMPLE_SORTER_SET_SORT_PREDICATE_METHOD);
        methods.methods_incorporate_instance_method(subloop_queues.GET_ELEMENT_KEY, subloop_queues.BASIC_QUEUE_SIMPLE_SORTER, subloop_queues.$list9, NIL, subloop_queues.$list49);
        methods.subloop_register_instance_method(subloop_queues.BASIC_QUEUE_SIMPLE_SORTER, subloop_queues.GET_ELEMENT_KEY, subloop_queues.BASIC_QUEUE_SIMPLE_SORTER_GET_ELEMENT_KEY_METHOD);
        methods.methods_incorporate_instance_method(subloop_queues.SET_ELEMENT_KEY, subloop_queues.BASIC_QUEUE_SIMPLE_SORTER, subloop_queues.$list9, subloop_queues.$list53, subloop_queues.$list54);
        methods.subloop_register_instance_method(subloop_queues.BASIC_QUEUE_SIMPLE_SORTER, subloop_queues.SET_ELEMENT_KEY, subloop_queues.BASIC_QUEUE_SIMPLE_SORTER_SET_ELEMENT_KEY_METHOD);
        interfaces.new_interface(subloop_queues.QUEUE_INTERFACE, NIL, NIL, subloop_queues.$list58);
        interfaces.interfaces_add_interface_instance_method(PRINT, subloop_queues.QUEUE_INTERFACE, subloop_queues.$list9, subloop_queues.$list60, subloop_queues.$list61);
        interfaces.interfaces_add_interface_instance_method(ON_ENQUEUE, subloop_queues.QUEUE_INTERFACE, subloop_queues.$list9, subloop_queues.$list63, subloop_queues.$list64);
        interfaces.new_interface(subloop_queues.END_POINTER_QUEUE_TEMPLATE, subloop_queues.$list66, subloop_queues.$list67, subloop_queues.$list68);
        interfaces.interfaces_add_interface_instance_method(EMPTY_P, subloop_queues.END_POINTER_QUEUE_TEMPLATE, subloop_queues.$list9, NIL, subloop_queues.$list70);
        interfaces.interfaces_add_interface_instance_method(ENQUEUE, subloop_queues.END_POINTER_QUEUE_TEMPLATE, subloop_queues.$list9, subloop_queues.$list63, subloop_queues.$list72);
        interfaces.interfaces_add_interface_instance_method(REMOVE, subloop_queues.END_POINTER_QUEUE_TEMPLATE, subloop_queues.$list9, subloop_queues.$list74, subloop_queues.$list75);
        interfaces.interfaces_add_interface_instance_method(DEQUEUE, subloop_queues.END_POINTER_QUEUE_TEMPLATE, subloop_queues.$list9, NIL, subloop_queues.$list77);
        interfaces.interfaces_add_interface_instance_method(FIND, subloop_queues.END_POINTER_QUEUE_TEMPLATE, NIL, subloop_queues.$list79, subloop_queues.$list80);
        interfaces.interfaces_add_interface_instance_method(GET_ELEMENT_COUNT, subloop_queues.END_POINTER_QUEUE_TEMPLATE, subloop_queues.$list9, NIL, subloop_queues.$list82);
        interfaces.interfaces_add_interface_instance_method(GET_CONTENTS, subloop_queues.END_POINTER_QUEUE_TEMPLATE, subloop_queues.$list9, NIL, subloop_queues.$list84);
        interfaces.interfaces_add_interface_instance_method(SET_CONTENTS, subloop_queues.END_POINTER_QUEUE_TEMPLATE, subloop_queues.$list9, subloop_queues.$list86, subloop_queues.$list87);
        interfaces.interfaces_add_interface_instance_method(CLEAR, subloop_queues.END_POINTER_QUEUE_TEMPLATE, subloop_queues.$list9, NIL, subloop_queues.$list89);
        interfaces.interfaces_add_interface_instance_method(REORDER_CONTENTS, subloop_queues.END_POINTER_QUEUE_TEMPLATE, subloop_queues.$list9, subloop_queues.$list91, subloop_queues.$list92);
        interfaces.interfaces_add_interface_instance_method(PEEK, subloop_queues.END_POINTER_QUEUE_TEMPLATE, subloop_queues.$list9, NIL, subloop_queues.$list94);
        interfaces.interfaces_add_interface_instance_method(ENQUEUED_P, subloop_queues.END_POINTER_QUEUE_TEMPLATE, subloop_queues.$list9, subloop_queues.$list96, subloop_queues.$list97);
        classes.subloop_new_class(subloop_queues.BASIC_QUEUE, OBJECT, subloop_queues.$list99, NIL, subloop_queues.$list100);
        classes.class_set_implements_slot_listeners(subloop_queues.BASIC_QUEUE, NIL);
        methods.methods_incorporate_instance_method(ENQUEUED_P, subloop_queues.BASIC_QUEUE, subloop_queues.$list9, subloop_queues.$list96, subloop_queues.$list97);
        methods.subloop_register_instance_method(subloop_queues.BASIC_QUEUE, ENQUEUED_P, subloop_queues.BASIC_QUEUE_ENQUEUED_P_METHOD);
        methods.methods_incorporate_instance_method(PEEK, subloop_queues.BASIC_QUEUE, subloop_queues.$list9, NIL, subloop_queues.$list94);
        methods.subloop_register_instance_method(subloop_queues.BASIC_QUEUE, PEEK, subloop_queues.BASIC_QUEUE_PEEK_METHOD);
        methods.methods_incorporate_instance_method(REORDER_CONTENTS, subloop_queues.BASIC_QUEUE, subloop_queues.$list9, subloop_queues.$list91, subloop_queues.$list92);
        methods.subloop_register_instance_method(subloop_queues.BASIC_QUEUE, REORDER_CONTENTS, subloop_queues.BASIC_QUEUE_REORDER_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method(CLEAR, subloop_queues.BASIC_QUEUE, subloop_queues.$list9, NIL, subloop_queues.$list89);
        methods.subloop_register_instance_method(subloop_queues.BASIC_QUEUE, CLEAR, subloop_queues.BASIC_QUEUE_CLEAR_METHOD);
        methods.methods_incorporate_instance_method(SET_CONTENTS, subloop_queues.BASIC_QUEUE, subloop_queues.$list9, subloop_queues.$list86, subloop_queues.$list87);
        methods.subloop_register_instance_method(subloop_queues.BASIC_QUEUE, SET_CONTENTS, subloop_queues.BASIC_QUEUE_SET_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method(GET_CONTENTS, subloop_queues.BASIC_QUEUE, subloop_queues.$list9, NIL, subloop_queues.$list84);
        methods.subloop_register_instance_method(subloop_queues.BASIC_QUEUE, GET_CONTENTS, subloop_queues.BASIC_QUEUE_GET_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method(GET_ELEMENT_COUNT, subloop_queues.BASIC_QUEUE, subloop_queues.$list9, NIL, subloop_queues.$list82);
        methods.subloop_register_instance_method(subloop_queues.BASIC_QUEUE, GET_ELEMENT_COUNT, subloop_queues.BASIC_QUEUE_GET_ELEMENT_COUNT_METHOD);
        methods.methods_incorporate_instance_method(FIND, subloop_queues.BASIC_QUEUE, NIL, subloop_queues.$list79, subloop_queues.$list80);
        methods.subloop_register_instance_method(subloop_queues.BASIC_QUEUE, FIND, subloop_queues.BASIC_QUEUE_FIND_METHOD);
        methods.methods_incorporate_instance_method(DEQUEUE, subloop_queues.BASIC_QUEUE, subloop_queues.$list9, NIL, subloop_queues.$list77);
        methods.subloop_register_instance_method(subloop_queues.BASIC_QUEUE, DEQUEUE, subloop_queues.BASIC_QUEUE_DEQUEUE_METHOD);
        methods.methods_incorporate_instance_method(REMOVE, subloop_queues.BASIC_QUEUE, subloop_queues.$list9, subloop_queues.$list74, subloop_queues.$list75);
        methods.subloop_register_instance_method(subloop_queues.BASIC_QUEUE, REMOVE, subloop_queues.BASIC_QUEUE_REMOVE_METHOD);
        methods.methods_incorporate_instance_method(ON_ENQUEUE, subloop_queues.BASIC_QUEUE, subloop_queues.$list9, subloop_queues.$list63, subloop_queues.$list64);
        methods.subloop_register_instance_method(subloop_queues.BASIC_QUEUE, ON_ENQUEUE, subloop_queues.BASIC_QUEUE_ON_ENQUEUE_METHOD);
        methods.methods_incorporate_instance_method(ENQUEUE, subloop_queues.BASIC_QUEUE, subloop_queues.$list9, subloop_queues.$list63, subloop_queues.$list72);
        methods.subloop_register_instance_method(subloop_queues.BASIC_QUEUE, ENQUEUE, subloop_queues.BASIC_QUEUE_ENQUEUE_METHOD);
        methods.methods_incorporate_instance_method(EMPTY_P, subloop_queues.BASIC_QUEUE, subloop_queues.$list9, NIL, subloop_queues.$list70);
        methods.subloop_register_instance_method(subloop_queues.BASIC_QUEUE, EMPTY_P, subloop_queues.BASIC_QUEUE_EMPTY_P_METHOD);
        methods.methods_incorporate_instance_method(PRINT, subloop_queues.BASIC_QUEUE, subloop_queues.$list9, subloop_queues.$list60, subloop_queues.$list61);
        methods.subloop_register_instance_method(subloop_queues.BASIC_QUEUE, PRINT, subloop_queues.BASIC_QUEUE_PRINT_METHOD);
        classes.subloop_note_class_initialization_function(subloop_queues.BASIC_QUEUE, subloop_queues.SUBLOOP_RESERVED_INITIALIZE_BASIC_QUEUE_CLASS);
        classes.subloop_note_instance_initialization_function(subloop_queues.BASIC_QUEUE, subloop_queues.SUBLOOP_RESERVED_INITIALIZE_BASIC_QUEUE_INSTANCE);
        subloop_queues.subloop_reserved_initialize_basic_queue_class(subloop_queues.BASIC_QUEUE);
        methods.methods_incorporate_instance_method(INITIALIZE, subloop_queues.BASIC_QUEUE, subloop_queues.$list17, NIL, subloop_queues.$list130);
        methods.subloop_register_instance_method(subloop_queues.BASIC_QUEUE, INITIALIZE, subloop_queues.BASIC_QUEUE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(GET_FIRST_CONS, subloop_queues.BASIC_QUEUE, subloop_queues.$list17, NIL, subloop_queues.$list134);
        methods.subloop_register_instance_method(subloop_queues.BASIC_QUEUE, GET_FIRST_CONS, subloop_queues.BASIC_QUEUE_GET_FIRST_CONS_METHOD);
        methods.methods_incorporate_instance_method(SET_FIRST_CONS, subloop_queues.BASIC_QUEUE, subloop_queues.$list17, subloop_queues.$list138, subloop_queues.$list139);
        methods.subloop_register_instance_method(subloop_queues.BASIC_QUEUE, SET_FIRST_CONS, subloop_queues.BASIC_QUEUE_SET_FIRST_CONS_METHOD);
        methods.methods_incorporate_instance_method(GET_END_POINTER, subloop_queues.BASIC_QUEUE, subloop_queues.$list9, NIL, subloop_queues.$list143);
        methods.subloop_register_instance_method(subloop_queues.BASIC_QUEUE, GET_END_POINTER, subloop_queues.BASIC_QUEUE_GET_END_POINTER_METHOD);
        methods.methods_incorporate_instance_method(SET_END_POINTER, subloop_queues.BASIC_QUEUE, subloop_queues.$list9, subloop_queues.$list147, subloop_queues.$list148);
        methods.subloop_register_instance_method(subloop_queues.BASIC_QUEUE, SET_END_POINTER, subloop_queues.BASIC_QUEUE_SET_END_POINTER_METHOD);
        methods.methods_incorporate_instance_method(GET_PRIORITIZER, subloop_queues.BASIC_QUEUE, subloop_queues.$list9, NIL, subloop_queues.$list152);
        methods.subloop_register_instance_method(subloop_queues.BASIC_QUEUE, GET_PRIORITIZER, subloop_queues.BASIC_QUEUE_GET_PRIORITIZER_METHOD);
        methods.methods_incorporate_instance_method(SET_PRIORITIZER, subloop_queues.BASIC_QUEUE, subloop_queues.$list9, subloop_queues.$list156, subloop_queues.$list157);
        methods.subloop_register_instance_method(subloop_queues.BASIC_QUEUE, SET_PRIORITIZER, subloop_queues.BASIC_QUEUE_SET_PRIORITIZER_METHOD);
        methods.methods_incorporate_instance_method(PASSIVE_P, subloop_queues.BASIC_QUEUE, subloop_queues.$list162, NIL, subloop_queues.$list163);
        methods.subloop_register_instance_method(subloop_queues.BASIC_QUEUE, PASSIVE_P, subloop_queues.BASIC_QUEUE_PASSIVE_P_METHOD);
        methods.methods_incorporate_instance_method(SET_PASSIVE, subloop_queues.BASIC_QUEUE, subloop_queues.$list9, subloop_queues.$list166, subloop_queues.$list167);
        methods.subloop_register_instance_method(subloop_queues.BASIC_QUEUE, SET_PASSIVE, subloop_queues.BASIC_QUEUE_SET_PASSIVE_METHOD);
        interfaces.new_interface(subloop_queues.DOUBLY_LINKED_QUEUE_TEMPLATE, subloop_queues.$list66, subloop_queues.$list67, subloop_queues.$list171);
        interfaces.interfaces_add_interface_instance_method(subloop_queues.INITIALIZE_QUA_DOUBLY_LINKED_QUEUE, subloop_queues.DOUBLY_LINKED_QUEUE_TEMPLATE, subloop_queues.$list17, NIL, subloop_queues.$list173);
        interfaces.interfaces_add_interface_instance_method(GET_LIST, subloop_queues.DOUBLY_LINKED_QUEUE_TEMPLATE, subloop_queues.$list17, NIL, subloop_queues.$list175);
        interfaces.interfaces_add_interface_instance_method(PRINT, subloop_queues.DOUBLY_LINKED_QUEUE_TEMPLATE, subloop_queues.$list9, subloop_queues.$list60, subloop_queues.$list176);
        interfaces.interfaces_add_interface_instance_method(GET_PRIORITIZER, subloop_queues.DOUBLY_LINKED_QUEUE_TEMPLATE, subloop_queues.$list9, NIL, subloop_queues.$list177);
        interfaces.interfaces_add_interface_instance_method(SET_PRIORITIZER, subloop_queues.DOUBLY_LINKED_QUEUE_TEMPLATE, subloop_queues.$list9, subloop_queues.$list156, subloop_queues.$list178);
        interfaces.interfaces_add_interface_instance_method(EMPTY_P, subloop_queues.DOUBLY_LINKED_QUEUE_TEMPLATE, subloop_queues.$list9, NIL, subloop_queues.$list179);
        interfaces.interfaces_add_interface_instance_method(ENQUEUE, subloop_queues.DOUBLY_LINKED_QUEUE_TEMPLATE, subloop_queues.$list9, subloop_queues.$list63, subloop_queues.$list180);
        interfaces.interfaces_add_interface_instance_method(REMOVE, subloop_queues.DOUBLY_LINKED_QUEUE_TEMPLATE, subloop_queues.$list9, subloop_queues.$list74, subloop_queues.$list181);
        interfaces.interfaces_add_interface_instance_method(DEQUEUE, subloop_queues.DOUBLY_LINKED_QUEUE_TEMPLATE, subloop_queues.$list9, NIL, subloop_queues.$list182);
        interfaces.interfaces_add_interface_instance_method(FIND, subloop_queues.DOUBLY_LINKED_QUEUE_TEMPLATE, subloop_queues.$list9, subloop_queues.$list79, subloop_queues.$list183);
        interfaces.interfaces_add_interface_instance_method(GET_ELEMENT_COUNT, subloop_queues.DOUBLY_LINKED_QUEUE_TEMPLATE, subloop_queues.$list9, NIL, subloop_queues.$list184);
        interfaces.interfaces_add_interface_instance_method(GET_CONTENTS, subloop_queues.DOUBLY_LINKED_QUEUE_TEMPLATE, subloop_queues.$list9, NIL, subloop_queues.$list185);
        interfaces.interfaces_add_interface_instance_method(SET_CONTENTS, subloop_queues.DOUBLY_LINKED_QUEUE_TEMPLATE, subloop_queues.$list9, subloop_queues.$list86, subloop_queues.$list186);
        interfaces.interfaces_add_interface_instance_method(CLEAR, subloop_queues.DOUBLY_LINKED_QUEUE_TEMPLATE, subloop_queues.$list9, NIL, subloop_queues.$list187);
        interfaces.interfaces_add_interface_instance_method(REORDER_CONTENTS, subloop_queues.DOUBLY_LINKED_QUEUE_TEMPLATE, subloop_queues.$list9, subloop_queues.$list91, subloop_queues.$list188);
        interfaces.interfaces_add_interface_instance_method(PEEK, subloop_queues.DOUBLY_LINKED_QUEUE_TEMPLATE, subloop_queues.$list9, NIL, subloop_queues.$list189);
        interfaces.interfaces_add_interface_instance_method(ENQUEUED_P, subloop_queues.DOUBLY_LINKED_QUEUE_TEMPLATE, subloop_queues.$list9, subloop_queues.$list96, subloop_queues.$list190);
        classes.subloop_new_class(BASIC_DOUBLY_LINKED_QUEUE, OBJECT, subloop_queues.$list192, NIL, subloop_queues.$list193);
        classes.class_set_implements_slot_listeners(BASIC_DOUBLY_LINKED_QUEUE, NIL);
        methods.methods_incorporate_instance_method(ENQUEUED_P, BASIC_DOUBLY_LINKED_QUEUE, subloop_queues.$list9, subloop_queues.$list96, subloop_queues.$list190);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_QUEUE, ENQUEUED_P, subloop_queues.BASIC_DOUBLY_LINKED_QUEUE_ENQUEUED_P_METHOD);
        methods.methods_incorporate_instance_method(PEEK, BASIC_DOUBLY_LINKED_QUEUE, subloop_queues.$list9, NIL, subloop_queues.$list189);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_QUEUE, PEEK, subloop_queues.BASIC_DOUBLY_LINKED_QUEUE_PEEK_METHOD);
        methods.methods_incorporate_instance_method(REORDER_CONTENTS, BASIC_DOUBLY_LINKED_QUEUE, subloop_queues.$list9, subloop_queues.$list91, subloop_queues.$list188);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_QUEUE, REORDER_CONTENTS, subloop_queues.BASIC_DOUBLY_LINKED_QUEUE_REORDER_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method(CLEAR, BASIC_DOUBLY_LINKED_QUEUE, subloop_queues.$list9, NIL, subloop_queues.$list187);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_QUEUE, CLEAR, subloop_queues.BASIC_DOUBLY_LINKED_QUEUE_CLEAR_METHOD);
        methods.methods_incorporate_instance_method(SET_CONTENTS, BASIC_DOUBLY_LINKED_QUEUE, subloop_queues.$list9, subloop_queues.$list86, subloop_queues.$list186);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_QUEUE, SET_CONTENTS, subloop_queues.BASIC_DOUBLY_LINKED_QUEUE_SET_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method(GET_CONTENTS, BASIC_DOUBLY_LINKED_QUEUE, subloop_queues.$list9, NIL, subloop_queues.$list185);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_QUEUE, GET_CONTENTS, subloop_queues.BASIC_DOUBLY_LINKED_QUEUE_GET_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method(GET_ELEMENT_COUNT, BASIC_DOUBLY_LINKED_QUEUE, subloop_queues.$list9, NIL, subloop_queues.$list184);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_QUEUE, GET_ELEMENT_COUNT, subloop_queues.BASIC_DOUBLY_LINKED_QUEUE_GET_ELEMENT_COUNT_METHOD);
        methods.methods_incorporate_instance_method(FIND, BASIC_DOUBLY_LINKED_QUEUE, subloop_queues.$list9, subloop_queues.$list79, subloop_queues.$list183);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_QUEUE, FIND, subloop_queues.BASIC_DOUBLY_LINKED_QUEUE_FIND_METHOD);
        methods.methods_incorporate_instance_method(DEQUEUE, BASIC_DOUBLY_LINKED_QUEUE, subloop_queues.$list9, NIL, subloop_queues.$list182);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_QUEUE, DEQUEUE, subloop_queues.BASIC_DOUBLY_LINKED_QUEUE_DEQUEUE_METHOD);
        methods.methods_incorporate_instance_method(REMOVE, BASIC_DOUBLY_LINKED_QUEUE, subloop_queues.$list9, subloop_queues.$list74, subloop_queues.$list181);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_QUEUE, REMOVE, subloop_queues.BASIC_DOUBLY_LINKED_QUEUE_REMOVE_METHOD);
        methods.methods_incorporate_instance_method(ON_ENQUEUE, BASIC_DOUBLY_LINKED_QUEUE, subloop_queues.$list9, subloop_queues.$list63, subloop_queues.$list64);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_QUEUE, ON_ENQUEUE, subloop_queues.BASIC_DOUBLY_LINKED_QUEUE_ON_ENQUEUE_METHOD);
        methods.methods_incorporate_instance_method(ENQUEUE, BASIC_DOUBLY_LINKED_QUEUE, subloop_queues.$list9, subloop_queues.$list63, subloop_queues.$list180);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_QUEUE, ENQUEUE, subloop_queues.BASIC_DOUBLY_LINKED_QUEUE_ENQUEUE_METHOD);
        methods.methods_incorporate_instance_method(EMPTY_P, BASIC_DOUBLY_LINKED_QUEUE, subloop_queues.$list9, NIL, subloop_queues.$list179);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_QUEUE, EMPTY_P, subloop_queues.BASIC_DOUBLY_LINKED_QUEUE_EMPTY_P_METHOD);
        methods.methods_incorporate_instance_method(SET_PRIORITIZER, BASIC_DOUBLY_LINKED_QUEUE, subloop_queues.$list9, subloop_queues.$list156, subloop_queues.$list178);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_QUEUE, SET_PRIORITIZER, subloop_queues.BASIC_DOUBLY_LINKED_QUEUE_SET_PRIORITIZER_METHOD);
        methods.methods_incorporate_instance_method(GET_PRIORITIZER, BASIC_DOUBLY_LINKED_QUEUE, subloop_queues.$list9, NIL, subloop_queues.$list177);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_QUEUE, GET_PRIORITIZER, subloop_queues.BASIC_DOUBLY_LINKED_QUEUE_GET_PRIORITIZER_METHOD);
        methods.methods_incorporate_instance_method(PRINT, BASIC_DOUBLY_LINKED_QUEUE, subloop_queues.$list9, subloop_queues.$list60, subloop_queues.$list176);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_QUEUE, PRINT, subloop_queues.BASIC_DOUBLY_LINKED_QUEUE_PRINT_METHOD);
        methods.methods_incorporate_instance_method(GET_LIST, BASIC_DOUBLY_LINKED_QUEUE, subloop_queues.$list17, NIL, subloop_queues.$list175);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_QUEUE, GET_LIST, subloop_queues.BASIC_DOUBLY_LINKED_QUEUE_GET_LIST_METHOD);
        methods.methods_incorporate_instance_method(subloop_queues.INITIALIZE_QUA_DOUBLY_LINKED_QUEUE, BASIC_DOUBLY_LINKED_QUEUE, subloop_queues.$list17, NIL, subloop_queues.$list173);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_QUEUE, subloop_queues.INITIALIZE_QUA_DOUBLY_LINKED_QUEUE, subloop_queues.$sym221$BASIC_DOUBLY_LINKED_QUEUE_INITIALIZE_QUA_DOUBLY_LINKED_QUEUE_METH);
        classes.subloop_note_class_initialization_function(BASIC_DOUBLY_LINKED_QUEUE, subloop_queues.SUBLOOP_RESERVED_INITIALIZE_BASIC_DOUBLY_LINKED_QUEUE_CLASS);
        classes.subloop_note_instance_initialization_function(BASIC_DOUBLY_LINKED_QUEUE, subloop_queues.SUBLOOP_RESERVED_INITIALIZE_BASIC_DOUBLY_LINKED_QUEUE_INSTANCE);
        subloop_queues.subloop_reserved_initialize_basic_doubly_linked_queue_class(BASIC_DOUBLY_LINKED_QUEUE);
        methods.methods_incorporate_instance_method(GET_LIST_INTERNAL, BASIC_DOUBLY_LINKED_QUEUE, subloop_queues.$list17, NIL, subloop_queues.$list225);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_QUEUE, GET_LIST_INTERNAL, subloop_queues.BASIC_DOUBLY_LINKED_QUEUE_GET_LIST_INTERNAL_METHOD);
        methods.methods_incorporate_instance_method(SET_LIST_INTERNAL, BASIC_DOUBLY_LINKED_QUEUE, subloop_queues.$list17, subloop_queues.$list229, subloop_queues.$list230);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_QUEUE, SET_LIST_INTERNAL, subloop_queues.BASIC_DOUBLY_LINKED_QUEUE_SET_LIST_INTERNAL_METHOD);
        methods.methods_incorporate_instance_method(GET_PRIORITIZER_INTERNAL, BASIC_DOUBLY_LINKED_QUEUE, subloop_queues.$list17, NIL, subloop_queues.$list152);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_QUEUE, GET_PRIORITIZER_INTERNAL, subloop_queues.BASIC_DOUBLY_LINKED_QUEUE_GET_PRIORITIZER_INTERNAL_METHOD);
        methods.methods_incorporate_instance_method(SET_PRIORITIZER_INTERNAL, BASIC_DOUBLY_LINKED_QUEUE, subloop_queues.$list17, subloop_queues.$list156, subloop_queues.$list237);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_QUEUE, SET_PRIORITIZER_INTERNAL, subloop_queues.BASIC_DOUBLY_LINKED_QUEUE_SET_PRIORITIZER_INTERNAL_METHOD);
        methods.methods_incorporate_instance_method(INITIALIZE, BASIC_DOUBLY_LINKED_QUEUE, subloop_queues.$list17, NIL, subloop_queues.$list240);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_QUEUE, INITIALIZE, subloop_queues.BASIC_DOUBLY_LINKED_QUEUE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PASSIVE_P, BASIC_DOUBLY_LINKED_QUEUE, subloop_queues.$list162, NIL, subloop_queues.$list163);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_QUEUE, PASSIVE_P, subloop_queues.BASIC_DOUBLY_LINKED_QUEUE_PASSIVE_P_METHOD);
        methods.methods_incorporate_instance_method(SET_PASSIVE, BASIC_DOUBLY_LINKED_QUEUE, subloop_queues.$list9, subloop_queues.$list166, subloop_queues.$list167);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_QUEUE, SET_PASSIVE, subloop_queues.BASIC_DOUBLY_LINKED_QUEUE_SET_PASSIVE_METHOD);
        classes.subloop_new_class(ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, BASIC_DOUBLY_LINKED_QUEUE, NIL, NIL, subloop_queues.$list246);
        classes.class_set_implements_slot_listeners(ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, NIL);
        classes.subloop_note_class_initialization_function(ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, subloop_queues.$sym248$SUBLOOP_RESERVED_INITIALIZE_ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_CLAS);
        classes.subloop_note_instance_initialization_function(ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, subloop_queues.$sym250$SUBLOOP_RESERVED_INITIALIZE_ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_INST);
        subloop_queues.subloop_reserved_initialize_asynch_basic_doubly_linked_queue_class(ASYNCH_BASIC_DOUBLY_LINKED_QUEUE);
        methods.methods_incorporate_instance_method(INITIALIZE, ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, subloop_queues.$list17, NIL, subloop_queues.$list251);
        methods.subloop_register_instance_method(ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, INITIALIZE, subloop_queues.ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(SET_PRIORITIZER, ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, subloop_queues.$list255, subloop_queues.$list156, subloop_queues.$list256);
        methods.subloop_register_instance_method(ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, SET_PRIORITIZER, subloop_queues.ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_SET_PRIORITIZER_METHOD);
        methods.methods_incorporate_instance_method(ENQUEUE, ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, subloop_queues.$list255, subloop_queues.$list63, subloop_queues.$list258);
        methods.subloop_register_instance_method(ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, ENQUEUE, subloop_queues.ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_ENQUEUE_METHOD);
        methods.methods_incorporate_instance_method(ON_ENQUEUE, ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, subloop_queues.$list9, subloop_queues.$list63, subloop_queues.$list64);
        methods.subloop_register_instance_method(ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, ON_ENQUEUE, subloop_queues.ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_ON_ENQUEUE_METHOD);
        methods.methods_incorporate_instance_method(REMOVE, ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, subloop_queues.$list255, subloop_queues.$list74, subloop_queues.$list265);
        methods.subloop_register_instance_method(ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, REMOVE, subloop_queues.ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_REMOVE_METHOD);
        methods.methods_incorporate_instance_method(DEQUEUE, ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, subloop_queues.$list255, NIL, subloop_queues.$list268);
        methods.subloop_register_instance_method(ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, DEQUEUE, subloop_queues.ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_DEQUEUE_METHOD);
        methods.methods_incorporate_instance_method(SET_CONTENTS, ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, subloop_queues.$list255, subloop_queues.$list86, subloop_queues.$list271);
        methods.subloop_register_instance_method(ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, SET_CONTENTS, subloop_queues.ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_SET_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method(CLEAR, ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, subloop_queues.$list255, NIL, subloop_queues.$list274);
        methods.subloop_register_instance_method(ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, CLEAR, subloop_queues.ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_CLEAR_METHOD);
        classes.subloop_new_class(subloop_queues.BASIC_DOUBLY_LINKED_IPC_QUEUE, BASIC_DOUBLY_LINKED_QUEUE, NIL, NIL, subloop_queues.$list278);
        classes.class_set_implements_slot_listeners(subloop_queues.BASIC_DOUBLY_LINKED_IPC_QUEUE, NIL);
        classes.subloop_note_class_initialization_function(subloop_queues.BASIC_DOUBLY_LINKED_IPC_QUEUE, subloop_queues.SUBLOOP_RESERVED_INITIALIZE_BASIC_DOUBLY_LINKED_IPC_QUEUE_CLASS);
        classes.subloop_note_instance_initialization_function(subloop_queues.BASIC_DOUBLY_LINKED_IPC_QUEUE, subloop_queues.$sym285$SUBLOOP_RESERVED_INITIALIZE_BASIC_DOUBLY_LINKED_IPC_QUEUE_INSTANC);
        subloop_queues.subloop_reserved_initialize_basic_doubly_linked_ipc_queue_class(subloop_queues.BASIC_DOUBLY_LINKED_IPC_QUEUE);
        methods.methods_incorporate_instance_method(INITIALIZE, subloop_queues.BASIC_DOUBLY_LINKED_IPC_QUEUE, subloop_queues.$list17, NIL, subloop_queues.$list286);
        methods.subloop_register_instance_method(subloop_queues.BASIC_DOUBLY_LINKED_IPC_QUEUE, INITIALIZE, subloop_queues.BASIC_DOUBLY_LINKED_IPC_QUEUE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(SET_PRIORITIZER, subloop_queues.BASIC_DOUBLY_LINKED_IPC_QUEUE, subloop_queues.$list9, subloop_queues.$list156, subloop_queues.$list291);
        methods.subloop_register_instance_method(subloop_queues.BASIC_DOUBLY_LINKED_IPC_QUEUE, SET_PRIORITIZER, subloop_queues.BASIC_DOUBLY_LINKED_IPC_QUEUE_SET_PRIORITIZER_METHOD);
        methods.methods_incorporate_instance_method(ENQUEUE, subloop_queues.BASIC_DOUBLY_LINKED_IPC_QUEUE, subloop_queues.$list9, subloop_queues.$list63, subloop_queues.$list294);
        methods.subloop_register_instance_method(subloop_queues.BASIC_DOUBLY_LINKED_IPC_QUEUE, ENQUEUE, subloop_queues.BASIC_DOUBLY_LINKED_IPC_QUEUE_ENQUEUE_METHOD);
        methods.methods_incorporate_instance_method(REMOVE, subloop_queues.BASIC_DOUBLY_LINKED_IPC_QUEUE, subloop_queues.$list9, subloop_queues.$list74, subloop_queues.$list297);
        methods.subloop_register_instance_method(subloop_queues.BASIC_DOUBLY_LINKED_IPC_QUEUE, REMOVE, subloop_queues.BASIC_DOUBLY_LINKED_IPC_QUEUE_REMOVE_METHOD);
        methods.methods_incorporate_instance_method(DEQUEUE, subloop_queues.BASIC_DOUBLY_LINKED_IPC_QUEUE, subloop_queues.$list9, NIL, subloop_queues.$list300);
        methods.subloop_register_instance_method(subloop_queues.BASIC_DOUBLY_LINKED_IPC_QUEUE, DEQUEUE, subloop_queues.BASIC_DOUBLY_LINKED_IPC_QUEUE_DEQUEUE_METHOD);
        methods.methods_incorporate_instance_method(SET_CONTENTS, subloop_queues.BASIC_DOUBLY_LINKED_IPC_QUEUE, subloop_queues.$list9, subloop_queues.$list86, subloop_queues.$list303);
        methods.subloop_register_instance_method(subloop_queues.BASIC_DOUBLY_LINKED_IPC_QUEUE, SET_CONTENTS, subloop_queues.BASIC_DOUBLY_LINKED_IPC_QUEUE_SET_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method(CLEAR, subloop_queues.BASIC_DOUBLY_LINKED_IPC_QUEUE, subloop_queues.$list9, NIL, subloop_queues.$list306);
        methods.subloop_register_instance_method(subloop_queues.BASIC_DOUBLY_LINKED_IPC_QUEUE, CLEAR, subloop_queues.BASIC_DOUBLY_LINKED_IPC_QUEUE_CLEAR_METHOD);
        classes.subloop_new_class(subloop_queues.BASIC_IPC_QUEUE, OBJECT, subloop_queues.$list66, NIL, subloop_queues.$list310);
        classes.class_set_implements_slot_listeners(subloop_queues.BASIC_IPC_QUEUE, NIL);
        methods.methods_incorporate_instance_method(ON_ENQUEUE, subloop_queues.BASIC_IPC_QUEUE, subloop_queues.$list9, subloop_queues.$list63, subloop_queues.$list64);
        methods.subloop_register_instance_method(subloop_queues.BASIC_IPC_QUEUE, ON_ENQUEUE, subloop_queues.BASIC_IPC_QUEUE_ON_ENQUEUE_METHOD);
        methods.methods_incorporate_instance_method(PRINT, subloop_queues.BASIC_IPC_QUEUE, subloop_queues.$list9, subloop_queues.$list60, subloop_queues.$list61);
        methods.subloop_register_instance_method(subloop_queues.BASIC_IPC_QUEUE, PRINT, subloop_queues.BASIC_IPC_QUEUE_PRINT_METHOD);
        classes.subloop_note_class_initialization_function(subloop_queues.BASIC_IPC_QUEUE, subloop_queues.SUBLOOP_RESERVED_INITIALIZE_BASIC_IPC_QUEUE_CLASS);
        classes.subloop_note_instance_initialization_function(subloop_queues.BASIC_IPC_QUEUE, subloop_queues.SUBLOOP_RESERVED_INITIALIZE_BASIC_IPC_QUEUE_INSTANCE);
        subloop_queues.subloop_reserved_initialize_basic_ipc_queue_class(subloop_queues.BASIC_IPC_QUEUE);
        methods.methods_incorporate_instance_method(INITIALIZE, subloop_queues.BASIC_IPC_QUEUE, subloop_queues.$list17, NIL, subloop_queues.$list316);
        methods.subloop_register_instance_method(subloop_queues.BASIC_IPC_QUEUE, INITIALIZE, subloop_queues.BASIC_IPC_QUEUE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(subloop_queues.GET_ACTUAL_IPC_QUEUE, subloop_queues.BASIC_IPC_QUEUE, subloop_queues.$list162, NIL, subloop_queues.$list321);
        methods.subloop_register_instance_method(subloop_queues.BASIC_IPC_QUEUE, subloop_queues.GET_ACTUAL_IPC_QUEUE, subloop_queues.BASIC_IPC_QUEUE_GET_ACTUAL_IPC_QUEUE_METHOD);
        methods.methods_incorporate_instance_method(subloop_queues.SET_ACTUAL_IPC_QUEUE, subloop_queues.BASIC_IPC_QUEUE, subloop_queues.$list9, subloop_queues.$list324, subloop_queues.$list325);
        methods.subloop_register_instance_method(subloop_queues.BASIC_IPC_QUEUE, subloop_queues.SET_ACTUAL_IPC_QUEUE, subloop_queues.BASIC_IPC_QUEUE_SET_ACTUAL_IPC_QUEUE_METHOD);
        methods.methods_incorporate_instance_method(GET_PRIORITIZER, subloop_queues.BASIC_IPC_QUEUE, subloop_queues.$list9, NIL, subloop_queues.$list152);
        methods.subloop_register_instance_method(subloop_queues.BASIC_IPC_QUEUE, GET_PRIORITIZER, subloop_queues.BASIC_IPC_QUEUE_GET_PRIORITIZER_METHOD);
        methods.methods_incorporate_instance_method(SET_PRIORITIZER, subloop_queues.BASIC_IPC_QUEUE, subloop_queues.$list9, subloop_queues.$list156, subloop_queues.$list157);
        methods.subloop_register_instance_method(subloop_queues.BASIC_IPC_QUEUE, SET_PRIORITIZER, subloop_queues.BASIC_IPC_QUEUE_SET_PRIORITIZER_METHOD);
        methods.methods_incorporate_instance_method(EMPTY_P, subloop_queues.BASIC_IPC_QUEUE, subloop_queues.$list162, NIL, subloop_queues.$list333);
        methods.subloop_register_instance_method(subloop_queues.BASIC_IPC_QUEUE, EMPTY_P, subloop_queues.BASIC_IPC_QUEUE_EMPTY_P_METHOD);
        methods.methods_incorporate_instance_method(ENQUEUE, subloop_queues.BASIC_IPC_QUEUE, subloop_queues.$list162, subloop_queues.$list63, subloop_queues.$list335);
        methods.subloop_register_instance_method(subloop_queues.BASIC_IPC_QUEUE, ENQUEUE, subloop_queues.BASIC_IPC_QUEUE_ENQUEUE_METHOD);
        methods.methods_incorporate_instance_method(REMOVE, subloop_queues.BASIC_IPC_QUEUE, subloop_queues.$list9, subloop_queues.$list74, subloop_queues.$list337);
        methods.subloop_register_instance_method(subloop_queues.BASIC_IPC_QUEUE, REMOVE, subloop_queues.BASIC_IPC_QUEUE_REMOVE_METHOD);
        methods.methods_incorporate_instance_method(DEQUEUE, subloop_queues.BASIC_IPC_QUEUE, subloop_queues.$list9, NIL, subloop_queues.$list340);
        methods.subloop_register_instance_method(subloop_queues.BASIC_IPC_QUEUE, DEQUEUE, subloop_queues.BASIC_IPC_QUEUE_DEQUEUE_METHOD);
        methods.methods_incorporate_instance_method(GET_ELEMENT_COUNT, subloop_queues.BASIC_IPC_QUEUE, subloop_queues.$list9, NIL, subloop_queues.$list343);
        methods.subloop_register_instance_method(subloop_queues.BASIC_IPC_QUEUE, GET_ELEMENT_COUNT, subloop_queues.BASIC_IPC_QUEUE_GET_ELEMENT_COUNT_METHOD);
        methods.methods_incorporate_instance_method(GET_CONTENTS, subloop_queues.BASIC_IPC_QUEUE, subloop_queues.$list162, NIL, subloop_queues.$list346);
        methods.subloop_register_instance_method(subloop_queues.BASIC_IPC_QUEUE, GET_CONTENTS, subloop_queues.BASIC_IPC_QUEUE_GET_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method(SET_CONTENTS, subloop_queues.BASIC_IPC_QUEUE, subloop_queues.$list162, subloop_queues.$list86, subloop_queues.$list348);
        methods.subloop_register_instance_method(subloop_queues.BASIC_IPC_QUEUE, SET_CONTENTS, subloop_queues.BASIC_IPC_QUEUE_SET_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method(CLEAR, subloop_queues.BASIC_IPC_QUEUE, subloop_queues.$list162, NIL, subloop_queues.$list351);
        methods.subloop_register_instance_method(subloop_queues.BASIC_IPC_QUEUE, CLEAR, subloop_queues.BASIC_IPC_QUEUE_CLEAR_METHOD);
        methods.methods_incorporate_instance_method(REORDER_CONTENTS, subloop_queues.BASIC_IPC_QUEUE, subloop_queues.$list9, subloop_queues.$list91, subloop_queues.$list353);
        methods.subloop_register_instance_method(subloop_queues.BASIC_IPC_QUEUE, REORDER_CONTENTS, subloop_queues.BASIC_IPC_QUEUE_REORDER_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method(PEEK, subloop_queues.BASIC_IPC_QUEUE, subloop_queues.$list9, NIL, subloop_queues.$list355);
        methods.subloop_register_instance_method(subloop_queues.BASIC_IPC_QUEUE, PEEK, subloop_queues.BASIC_IPC_QUEUE_PEEK_METHOD);
        methods.methods_incorporate_instance_method(ENQUEUED_P, subloop_queues.BASIC_IPC_QUEUE, subloop_queues.$list9, subloop_queues.$list96, subloop_queues.$list358);
        methods.subloop_register_instance_method(subloop_queues.BASIC_IPC_QUEUE, ENQUEUED_P, subloop_queues.BASIC_IPC_QUEUE_ENQUEUED_P_METHOD);
        methods.methods_incorporate_instance_method(FIND, subloop_queues.BASIC_IPC_QUEUE, subloop_queues.$list9, subloop_queues.$list79, subloop_queues.$list361);
        methods.subloop_register_instance_method(subloop_queues.BASIC_IPC_QUEUE, FIND, subloop_queues.BASIC_IPC_QUEUE_FIND_METHOD);
        methods.methods_incorporate_instance_method(PASSIVE_P, subloop_queues.BASIC_IPC_QUEUE, subloop_queues.$list162, NIL, subloop_queues.$list163);
        methods.subloop_register_instance_method(subloop_queues.BASIC_IPC_QUEUE, PASSIVE_P, subloop_queues.BASIC_IPC_QUEUE_PASSIVE_P_METHOD);
        methods.methods_incorporate_instance_method(SET_PASSIVE, subloop_queues.BASIC_IPC_QUEUE, subloop_queues.$list9, subloop_queues.$list166, subloop_queues.$list167);
        methods.subloop_register_instance_method(subloop_queues.BASIC_IPC_QUEUE, SET_PASSIVE, subloop_queues.BASIC_IPC_QUEUE_SET_PASSIVE_METHOD);
        return NIL;
    }

    static private final SubLString $str_alt214$DL_QUEUE___ = makeString("DL-QUEUE:{}");

    static private final SubLString $str_alt215$___S_Class_is_not_correctly_imple = makeString("#<~S Class is not correctly implemented.  ALLOCATE-ENUMERATOR failed.>");

    static private final SubLString $str_alt216$DL_QUEUE___S = makeString("DL-QUEUE:{~S");

    static private final SubLList $list_alt225 = list(list(RET, makeSymbol("LIST")));

    static private final SubLList $list_alt229 = list(makeSymbol("NEW-LIST"));

    static private final SubLList $list_alt230 = list(list(makeSymbol("CSETQ"), makeSymbol("LIST"), makeSymbol("NEW-LIST")), list(RET, makeSymbol("NEW-LIST")));

    static private final SubLList $list_alt237 = list(list(makeSymbol("CSETQ"), makeSymbol("PRIORITIZER"), makeSymbol("NEW-PRIORITIZER")), list(RET, makeSymbol("NEW-PRIORITIZER")));

    static private final SubLList $list_alt240 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("INITIALIZE-QUA-DOUBLY-LINKED-QUEUE"), makeSymbol("SELF")), list(RET, makeSymbol("SELF")));

    static private final SubLList $list_alt246 = list(new SubLObject[]{ list(makeSymbol("LOCK"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("LOCK-HISTORY"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PRIORITIZER"), list(makeSymbol("NEW-PRIORITIZER")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ENQUEUE"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-ENQUEUE"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE"), list(makeSymbol("OLD-ELEMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEQUEUE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CONTENTS"), list(makeSymbol("NEW-CONTENTS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEAR"), NIL, makeKeyword("PUBLIC")) });

    static private final SubLList $list_alt251 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("LOCK"), list(makeSymbol("MAKE-LOCK"), list(makeSymbol("FORMAT"), NIL, makeString("~S"), makeSymbol("SELF")))), list(makeSymbol("CSETQ"), makeSymbol("LOCK-HISTORY"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLString $str_alt253$_S = makeString("~S");

    static private final SubLList $list_alt255 = list(makeKeyword("NO-MEMBER-VARIABLES"), makeKeyword("PUBLIC"));

    static private final SubLList $list_alt256 = list(list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"), NIL), list(makeSymbol("LOCK"), list(makeSymbol("GET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK"), makeSymbol("SELF")))), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("SET-PRIORITIZER"), makeSymbol("SUPER"), makeSymbol("NEW-PRIORITIZER")))), list(RET, makeSymbol("RESULT"))));

    static private final SubLList $list_alt258 = list(list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"), NIL), list(makeSymbol("LOCK"), list(makeSymbol("GET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK"), makeSymbol("SELF"))), list(makeSymbol("LOCK-HISTORY"), list(makeSymbol("GET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK-HISTORY"), makeSymbol("SELF")))), list(makeSymbol("CPUSH"), list(makeSymbol("LIST"), makeKeyword("WAITING"), makeKeyword("ENQUEUE"), makeSymbol("NEW-ELEMENT")), makeSymbol("LOCK-HISTORY")), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("CPUSH"), list(makeSymbol("LIST"), makeKeyword("LOCKED"), makeKeyword("ENQUEUE"), makeSymbol("NEW-ELEMENT")), makeSymbol("LOCK-HISTORY")), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("ENQUEUE"), makeSymbol("SUPER"), makeSymbol("NEW-ELEMENT"))), list(makeSymbol("CPUSH"), list(makeSymbol("LIST"), makeKeyword("UNLOCKED"), makeKeyword("ENQUEUE"), makeSymbol("NEW-ELEMENT")), makeSymbol("LOCK-HISTORY"))), list(makeSymbol("SET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK-HISTORY"), makeSymbol("SELF"), makeSymbol("LOCK-HISTORY")), list(RET, makeSymbol("RESULT"))));

    static private final SubLList $list_alt265 = list(list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"), NIL), list(makeSymbol("LOCK"), list(makeSymbol("GET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK"), makeSymbol("SELF"))), list(makeSymbol("LOCK-HISTORY"), list(makeSymbol("GET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK-HISTORY"), makeSymbol("SELF")))), list(makeSymbol("CPUSH"), list(makeSymbol("LIST"), makeKeyword("WAITING"), makeKeyword("REMOVE"), makeSymbol("OLD-ELEMENT")), makeSymbol("LOCK-HISTORY")), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("CPUSH"), list(makeSymbol("LIST"), makeKeyword("LOCKED"), makeKeyword("REMOVE"), makeSymbol("OLD-ELEMENT")), makeSymbol("LOCK-HISTORY")), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("REMOVE"), makeSymbol("SUPER"), makeSymbol("OLD-ELEMENT"))), list(makeSymbol("CPUSH"), list(makeSymbol("LIST"), makeKeyword("UNLOCKED"), makeKeyword("REMOVE"), makeSymbol("OLD-ELEMENT")), makeSymbol("LOCK-HISTORY")), list(makeSymbol("SET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK-HISTORY"), makeSymbol("SELF"), makeSymbol("LOCK-HISTORY"))), list(makeSymbol("SET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK-HISTORY"), makeSymbol("SELF"), makeSymbol("LOCK-HISTORY")), list(RET, makeSymbol("RESULT"))));

    static private final SubLList $list_alt268 = list(list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"), NIL), list(makeSymbol("LOCK"), list(makeSymbol("GET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK"), makeSymbol("SELF"))), list(makeSymbol("LOCK-HISTORY"), list(makeSymbol("GET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK-HISTORY"), makeSymbol("SELF")))), list(makeSymbol("CPUSH"), list(makeSymbol("LIST"), makeKeyword("WAITING"), makeKeyword("DEQUEUE")), makeSymbol("LOCK-HISTORY")), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("CPUSH"), list(makeSymbol("LIST"), makeKeyword("LOCKED"), makeKeyword("DEQUEUE")), makeSymbol("LOCK-HISTORY")), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("DEQUEUE"), makeSymbol("SUPER"))), list(makeSymbol("CPUSH"), list(makeSymbol("LIST"), makeKeyword("UNLOCKED"), makeKeyword("DEQUEUE"), makeSymbol("RESULT")), makeSymbol("LOCK-HISTORY"))), list(makeSymbol("SET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK-HISTORY"), makeSymbol("SELF"), makeSymbol("LOCK-HISTORY")), list(RET, makeSymbol("RESULT"))));

    static private final SubLList $list_alt271 = list(list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"), NIL), list(makeSymbol("LOCK"), list(makeSymbol("GET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK"), makeSymbol("SELF"))), list(makeSymbol("LOCK-HISTORY"), list(makeSymbol("GET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK-HISTORY"), makeSymbol("SELF")))), list(makeSymbol("CPUSH"), list(makeSymbol("LIST"), makeKeyword("WAITING"), makeKeyword("SET-CONTENTS"), makeSymbol("NEW-CONTENTS")), makeSymbol("LOCK-HISTORY")), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("CPUSH"), list(makeSymbol("LIST"), makeKeyword("LOCKED"), makeKeyword("SET-CONTENTS"), makeSymbol("NEW-CONTENTS")), makeSymbol("LOCK-HISTORY")), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("SET-CONTENTS"), makeSymbol("SUPER"), makeSymbol("NEW-CONTENTS"))), list(makeSymbol("CPUSH"), list(makeSymbol("LIST"), makeKeyword("UNLOCKED"), makeKeyword("SET-CONTENTS"), makeSymbol("RESULT")), makeSymbol("LOCK-HISTORY"))), list(makeSymbol("SET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK-HISTORY"), makeSymbol("SELF"), makeSymbol("LOCK-HISTORY")), list(RET, makeSymbol("RESULT"))));

    static private final SubLList $list_alt274 = list(list(makeSymbol("CLET"), list(list(makeSymbol("LOCK"), list(makeSymbol("GET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK"), makeSymbol("SELF"))), list(makeSymbol("LOCK-HISTORY"), list(makeSymbol("GET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK-HISTORY"), makeSymbol("SELF")))), list(makeSymbol("CPUSH"), list(makeSymbol("LIST"), makeKeyword("WAITING"), makeKeyword("CLEAR")), makeSymbol("LOCK-HISTORY")), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("CPUSH"), list(makeSymbol("LIST"), makeKeyword("LOCKED"), makeKeyword("CLEAR")), makeSymbol("LOCK-HISTORY")), list(makeSymbol("CLEAR"), makeSymbol("SUPER")), list(makeSymbol("CPUSH"), list(makeSymbol("LIST"), makeKeyword("UNLOCKED"), makeKeyword("CLEAR")), makeSymbol("LOCK-HISTORY"))), list(makeSymbol("SET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK-HISTORY"), makeSymbol("SELF"), makeSymbol("LOCK-HISTORY")), list(RET, NIL)));

    static private final SubLList $list_alt278 = list(new SubLObject[]{ list(makeSymbol("BASE-NAME"), makeKeyword("CLASS"), makeKeyword("PROTECTED"), makeKeyword("VALUE"), makeString("BASIC-DOUBLY-LINKED-IPC-QUEUE")), list(makeSymbol("BASE-SUFFIX-COUNTER"), makeKeyword("CLASS"), makeKeyword("PROTECTED"), makeKeyword("VALUE"), ZERO_INTEGER), list(makeSymbol("SEMAPHORE-NAME"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("LOCK"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("SEMAPHORE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PRIORITIZER"), list(makeSymbol("NEW-PRIORITIZER")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ENQUEUE"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE"), list(makeSymbol("OLD-ELEMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEQUEUE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CONTENTS"), list(makeSymbol("NEW-CONTENTS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEAR"), NIL, makeKeyword("PUBLIC")) });

    static private final SubLString $str_alt283$BASIC_DOUBLY_LINKED_IPC_QUEUE = makeString("BASIC-DOUBLY-LINKED-IPC-QUEUE");

    static private final SubLList $list_alt286 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("SEMAPHORE-NAME"), list(makeSymbol("FORMAT"), NIL, makeString("~A-~S"), makeSymbol("BASE-NAME"), makeSymbol("BASE-SUFFIX-COUNTER"))), list(makeSymbol("CINC"), makeSymbol("BASE-SUFFIX-COUNTER")), list(makeSymbol("CSETQ"), makeSymbol("LOCK"), list(makeSymbol("CCONCATENATE"), makeString("Lock for Queue "), makeSymbol("SEMAPHORE-NAME"))), list(makeSymbol("CSETQ"), makeSymbol("SEMAPHORE"), list(makeSymbol("NEW-SEMAPHORE"), makeSymbol("SEMAPHORE-NAME"), ZERO_INTEGER)), list(RET, makeSymbol("SELF")));

    static private final SubLString $str_alt288$_A__S = makeString("~A-~S");

    static private final SubLString $str_alt289$Lock_for_Queue_ = makeString("Lock for Queue ");

    static private final SubLList $list_alt291 = list(list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"), NIL)), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("SET-PRIORITIZER"), makeSymbol("SUPER"), makeSymbol("NEW-PRIORITIZER")))), list(RET, makeSymbol("RESULT"))));

    static private final SubLList $list_alt294 = list(list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"), NIL)), list(makeSymbol("V-SEMAPHORE"), makeSymbol("SEMAPHORE")), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("ENQUEUE"), makeSymbol("SUPER"), makeSymbol("NEW-ELEMENT")))), list(RET, makeSymbol("RESULT"))));

    static private final SubLList $list_alt297 = list(list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"), NIL)), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("REMOVE"), makeSymbol("SUPER"), makeSymbol("OLD-ELEMENT")))), list(makeSymbol("P-SEMAPHORE"), makeSymbol("SEMAPHORE")), list(RET, makeSymbol("RESULT"))));

    static private final SubLList $list_alt300 = list(list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"), NIL)), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("DEQUEUE"), makeSymbol("SUPER")))), list(makeSymbol("P-SEMAPHORE"), makeSymbol("SEMAPHORE")), list(RET, makeSymbol("RESULT"))));

    static private final SubLList $list_alt303 = list(list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"), NIL)), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("SET-CONTENTS"), makeSymbol("SUPER"), makeSymbol("NEW-CONTENTS")))), list(RET, makeSymbol("RESULT"))));

    static private final SubLList $list_alt306 = list(list(makeSymbol("WHILE"), list(makeSymbol("CNOT"), list(makeSymbol("EMPTY-P"), makeSymbol("SELF"))), list(makeSymbol("P-SEMAPHORE"), makeSymbol("SEMAPHORE")), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("DEQUEUE"), makeSymbol("SELF")))), list(RET, NIL));

    static private final SubLList $list_alt310 = list(new SubLObject[]{ list(makeSymbol("ACTUAL-IPC-QUEUE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("PRIORITIZER"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("IS-PASSIVE"), makeKeyword("BOOLEAN"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ACTUAL-IPC-QUEUE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ACTUAL-IPC-QUEUE"), list(makeSymbol("NEW-QUEUE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PRIORITIZER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PRIORITIZER"), list(makeSymbol("NEW-PRIORITIZER")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EMPTY-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ENQUEUE"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE"), list(makeSymbol("OLD-ELEMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEQUEUE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ELEMENT-COUNT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONTENTS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CONTENTS"), list(makeSymbol("NEW-CONTENTS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEAR"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REORDER-CONTENTS"), list(makeSymbol("ORDERED-CONTENTS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PEEK"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ENQUEUED-P"), list(makeSymbol("OBJECT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FIND"), list(makeSymbol("KEY-VALUE"), makeSymbol("&OPTIONAL"), list(makeSymbol("EQUALITY-PRED"), list(makeSymbol("FUNCTION"), EQL)), list(makeSymbol("KEY-ACCESSOR-FUNCTION"), list(makeSymbol("FUNCTION"), IDENTITY))), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PASSIVE-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PASSIVE"), list(makeSymbol("FLAG")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-ENQUEUE"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")) });

    static private final SubLList $list_alt316 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("ACTUAL-IPC-QUEUE"), list(makeSymbol("NEW-IPC-QUEUE"), list(makeSymbol("FORMAT-TO-STRING"), makeKeyword("A"), makeString("BASIC-IPC-QUEUE-"), makeKeyword("D"), makeSymbol("INSTANCE-NUMBER")))), list(RET, makeSymbol("SELF")));

    static private final SubLString $str_alt318$BASIC_IPC_QUEUE_ = makeString("BASIC-IPC-QUEUE-");

    static private final SubLList $list_alt321 = list(list(RET, makeSymbol("ACTUAL-IPC-QUEUE")));

    static private final SubLList $list_alt324 = list(makeSymbol("NEW-QUEUE"));

    static private final SubLList $list_alt325 = list(list(makeSymbol("MUST"), list(makeSymbol("IPC-QUEUE-P"), makeSymbol("NEW-QUEUE")), makeString("(SET-ACTUAL-IPC-QUEUE ~S): ~S is not an instance of the IPC-QUEUE struct."), makeSymbol("SELF"), makeSymbol("NEW-QUEUE")), list(makeSymbol("CSETQ"), makeSymbol("ACTUAL-IPC-QUEUE"), makeSymbol("NEW-QUEUE")), list(RET, makeSymbol("NEW-QUEUE")));

    static private final SubLString $str_alt327$_SET_ACTUAL_IPC_QUEUE__S____S_is_ = makeString("(SET-ACTUAL-IPC-QUEUE ~S): ~S is not an instance of the IPC-QUEUE struct.");

    static private final SubLList $list_alt333 = list(list(RET, list(makeSymbol("ZEROP"), list(makeSymbol("IPC-CURRENT-QUEUE-SIZE"), makeSymbol("ACTUAL-IPC-QUEUE")))));

    static private final SubLList $list_alt335 = list(list(makeSymbol("IPC-ENQUEUE"), makeSymbol("NEW-ELEMENT"), makeSymbol("ACTUAL-IPC-QUEUE")), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), makeSymbol("IS-PASSIVE")), list(makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), makeSymbol("NEW-ELEMENT"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("NEW-ELEMENT"), list(QUOTE, makeSymbol("ENQUEUE-NOTIFY")), makeSymbol("SELF"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ON-ENQUEUE")), makeSymbol("NEW-ELEMENT")), list(RET, makeSymbol("NEW-ELEMENT")));

    @Override
    public void declareFunctions() {
        subloop_queues.declare_subloop_queues_file();
    }

    @Override
    public void initializeVariables() {
        subloop_queues.init_subloop_queues_file();
    }

    static private final SubLList $list_alt337 = list(list(makeSymbol("ERROR"), makeString("Invalid operation: Cannot remove arbitrary item from IPC queue.")), list(RET, makeSymbol("OLD-ELEMENT")));

    @Override
    public void runTopLevelForms() {
        subloop_queues.setup_subloop_queues_file();
    }

    static {
    }

    static private final SubLString $str_alt338$Invalid_operation__Cannot_remove_ = makeString("Invalid operation: Cannot remove arbitrary item from IPC queue.");

    static private final SubLList $list_alt340 = list(list(makeSymbol("CLET"), list(list(makeSymbol("DEQUEUED-ITEM"), list(makeSymbol("IPC-DEQUEUE"), makeSymbol("ACTUAL-IPC-QUEUE")))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), makeSymbol("IS-PASSIVE")), list(makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), makeSymbol("DEQUEUED-ITEM"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("DEQUEUED-ITEM"), list(QUOTE, makeSymbol("DEQUEUE-NOTIFY")), makeSymbol("SELF"))), list(RET, makeSymbol("DEQUEUED-ITEM"))));

    static private final SubLList $list_alt343 = list(list(RET, list(makeSymbol("IPC-CURRENT-QUEUE-SIZE"), makeSymbol("ACTUAL-IPC-QUEUE"))));

    static private final SubLList $list_alt346 = list(list(RET, list(makeSymbol("IPC-CURRENT-QUEUE-CONTENT"), makeSymbol("ACTUAL-IPC-QUEUE"))));

    static private final SubLList $list_alt348 = list(list(makeSymbol("MUST"), list(makeSymbol("LISTP"), makeSymbol("NEW-CONTENTS")), makeString("(SET-CONTENTS ~S): ~S is not a valid list."), makeSymbol("SELF")), list(makeSymbol("CLEAR"), makeSymbol("SELF")), list(makeSymbol("CDOLIST"), list(makeSymbol("ELEMENT"), makeSymbol("NEW-CONTENTS")), list(makeSymbol("ENQUEUE"), makeSymbol("SELF"), makeSymbol("ELEMENT"))), list(RET, makeSymbol("NEW-CONTENTS")));

    static private final SubLString $str_alt349$_SET_CONTENTS__S____S_is_not_a_va = makeString("(SET-CONTENTS ~S): ~S is not a valid list.");

    static private final SubLList $list_alt351 = list(list(makeSymbol("CLET"), list(list(makeSymbol("ELEMENT-COUNT"), list(makeSymbol("GET-ELEMENT-COUNT"), makeSymbol("SELF")))), list(makeSymbol("CDOTIMES"), list(makeSymbol("I"), makeSymbol("ELEMENT-COUNT")), list(makeSymbol("DEQUEUE"), makeSymbol("SELF")))), list(RET, NIL));

    static private final SubLList $list_alt353 = list(list(RET, makeSymbol("ORDERED-CONTENTS")));

    static private final SubLList $list_alt355 = list(list(RET, list(makeSymbol("FIRST"), list(makeSymbol("IPC-CURRENT-QUEUE-CONTENT"), makeSymbol("ACTUAL-IPC-QUEUE")))));

    static private final SubLList $list_alt358 = list(list(RET, list(makeSymbol("FIF"), list(makeSymbol("FIND"), makeSymbol("OBJECT"), list(makeSymbol("IPC-CURRENT-QUEUE-CONTENT"), makeSymbol("ACTUAL-IPC-QUEUE"))), T, NIL)));

    static private final SubLList $list_alt361 = list(list(RET, list(makeSymbol("FIND"), makeSymbol("KEY-VALUE"), list(makeSymbol("IPC-CURRENT-QUEUE-CONTENT"), makeSymbol("ACTUAL-IPC-QUEUE")), makeSymbol("EQUALITY-PRED"), makeSymbol("KEY-ACCESSOR-FUNCTION"))));

    static private final SubLString $str_alt367$QUEUE_INTERFACE_GET_PRIORITIZER__ = makeString("QUEUE-INTERFACE-GET-PRIORITIZER: ~S is not an instance of QUEUE-INTERFACE.");

    static private final SubLString $str_alt368$QUEUE_INTERFACE_SET_PRIORITIZER__ = makeString("QUEUE-INTERFACE-SET-PRIORITIZER: ~S is not an instance of QUEUE-INTERFACE.");

    static private final SubLString $str_alt369$QUEUE_INTERFACE_EMPTY_P___S_is_no = makeString("QUEUE-INTERFACE-EMPTY-P: ~S is not an instance of QUEUE-INTERFACE.");

    static private final SubLString $str_alt370$QUEUE_INTERFACE_ENQUEUE___S_is_no = makeString("QUEUE-INTERFACE-ENQUEUE: ~S is not an instance of QUEUE-INTERFACE.");

    static private final SubLString $str_alt371$QUEUE_INTERFACE_REMOVE___S_is_not = makeString("QUEUE-INTERFACE-REMOVE: ~S is not an instance of QUEUE-INTERFACE.");

    static private final SubLString $str_alt372$QUEUE_INTERFACE_DEQUEUE___S_is_no = makeString("QUEUE-INTERFACE-DEQUEUE: ~S is not an instance of QUEUE-INTERFACE.");

    static private final SubLString $str_alt373$QUEUE_INTERFACE_GET_ELEMENT_COUNT = makeString("QUEUE-INTERFACE-GET-ELEMENT-COUNT: ~S is not an instance of QUEUE-INTERFACE.");

    static private final SubLString $str_alt374$QUEUE_INTERFACE_GET_CONTENTS___S_ = makeString("QUEUE-INTERFACE-GET-CONTENTS: ~S is not an instance of QUEUE-INTERFACE.");

    static private final SubLString $str_alt375$QUEUE_INTERFACE_SET_CONTENTS___S_ = makeString("QUEUE-INTERFACE-SET-CONTENTS: ~S is not an instance of QUEUE-INTERFACE.");

    static private final SubLString $str_alt376$QUEUE_INTERFACE_CLEAR___S_is_not_ = makeString("QUEUE-INTERFACE-CLEAR: ~S is not an instance of QUEUE-INTERFACE.");

    static private final SubLString $str_alt377$QUEUE_INTERFACE_REORDER_CONTENTS_ = makeString("QUEUE-INTERFACE-REORDER-CONTENTS: ~S is not an instance of QUEUE-INTERFACE.");
}

/**
 * Total time: 1608 ms
 */
