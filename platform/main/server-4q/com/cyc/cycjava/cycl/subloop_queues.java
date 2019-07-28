package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.subloop_queues;
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
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.subloop_queues.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQ;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FIVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FOUR_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.IDENTITY;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class subloop_queues extends SubLTranslatedFile {
    public static final SubLFile me = new subloop_queues();

    public static final String myName = "com.cyc.cycjava.cycl.subloop_queues";

    public static final String myFingerPrint = "53696b3fae82c466acee4fa2035e7d93a2428d23af00978fb405fff71cb7e8c7";

    // Internal Constants
    public static final SubLSymbol QUEUE_ELEMENT_INTERFACE = makeSymbol("QUEUE-ELEMENT-INTERFACE");

    public static final SubLList $list1 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ENQUEUE-NOTIFY"), list(makeSymbol("QUEUE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEQUEUE-NOTIFY"), list(makeSymbol("QUEUE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-NOTIFY"), list(makeSymbol("QUEUE")), makeKeyword("PUBLIC")));

    public static final SubLSymbol QUEUE_PRIORITIZER_INTERFACE = makeSymbol("QUEUE-PRIORITIZER-INTERFACE");

    public static final SubLList $list3 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ORDER-QUEUE"), list(makeSymbol("QUEUE")), makeKeyword("PUBLIC")));

    public static final SubLSymbol QUEUE_PRIORITIZER_TEMPLATE = makeSymbol("QUEUE-PRIORITIZER-TEMPLATE");

    public static final SubLList $list5 = list(makeSymbol("QUEUE-PRIORITIZER-INTERFACE"));

    public static final SubLList $list6 = list(makeKeyword("EXTENDS"), list(makeSymbol("QUEUE-PRIORITIZER-INTERFACE")));

    public static final SubLList $list7 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ORDER-QUEUE-INTERNAL"), list(makeSymbol("CONTENTS")), makeKeyword("PROTECTED")));

    public static final SubLSymbol ORDER_QUEUE = makeSymbol("ORDER-QUEUE");

    public static final SubLList $list9 = list(makeKeyword("PUBLIC"));

    public static final SubLList $list10 = list(makeSymbol("QUEUE"));

    public static final SubLList $list11 = list(list(makeSymbol("MUST"), list(makeSymbol("QUEUE-INTERFACE-P"), makeSymbol("QUEUE")), makeString("(ORDER-QUEUE ~S): ~S is not an instance of QUEUE-INTERFACE."), makeSymbol("SELF"), makeSymbol("QUEUE")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("QUEUE-INTERFACE-GET-CONTENTS"), makeSymbol("QUEUE")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENTS-ORDERED"), list(makeSymbol("ORDER-QUEUE-INTERNAL"), makeSymbol("SELF"), makeSymbol("TEMPLATE-CONTENTS")))), list(makeSymbol("QUEUE-INTERFACE-REORDER-CONTENTS"), makeSymbol("QUEUE"), makeSymbol("TEMPLATE-CONTENTS-ORDERED"))))), list(makeSymbol("RET"), NIL));

    public static final SubLSymbol QUEUE_SIMPLE_SORTER_TEMPLATE = makeSymbol("QUEUE-SIMPLE-SORTER-TEMPLATE");

    public static final SubLList $list13 = list(makeSymbol("QUEUE-PRIORITIZER-TEMPLATE"));

    public static final SubLList $list14 = list(makeKeyword("EXTENDS"), list(makeSymbol("QUEUE-PRIORITIZER-TEMPLATE")));

    public static final SubLList $list15 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SORT-PREDICATE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SORT-PREDICATE"), list(makeSymbol("NEW-PREDICATE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ELEMENT-KEY"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ELEMENT-KEY"), list(makeSymbol("NEW-KEY-FUNCTION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ORDER-QUEUE-INTERNAL"), list(makeSymbol("CONTENTS")), makeKeyword("PROTECTED")));

    public static final SubLSymbol ORDER_QUEUE_INTERNAL = makeSymbol("ORDER-QUEUE-INTERNAL");

    public static final SubLList $list17 = list(makeKeyword("PROTECTED"));

    public static final SubLList $list18 = list(makeSymbol("CONTENTS"));

    public static final SubLList $list19 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PREDICATE"), list(makeSymbol("GET-SORT-PREDICATE"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-KEY-FUNCTION"), list(makeSymbol("GET-ELEMENT-KEY"), makeSymbol("SELF")))), list(makeSymbol("MUST"), makeSymbol("TEMPLATE-PREDICATE"), makeString("(ORDER-QUEUE-INTERNAL ~S): No ordering predicate has been associated with this prioritizer."), makeSymbol("SELF")), list(makeSymbol("PUNLESS"), makeSymbol("TEMPLATE-KEY-FUNCTION"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-KEY-FUNCTION"), list(makeSymbol("FUNCTION"), IDENTITY))), list(makeSymbol("RET"), list(makeSymbol("SORT"), makeSymbol("CONTENTS"), makeSymbol("TEMPLATE-PREDICATE"), makeSymbol("TEMPLATE-KEY-FUNCTION")))));

    public static final SubLSymbol BASIC_QUEUE_SIMPLE_SORTER = makeSymbol("BASIC-QUEUE-SIMPLE-SORTER");



    public static final SubLList $list22 = list(makeSymbol("QUEUE-SIMPLE-SORTER-TEMPLATE"));

    public static final SubLList $list23 = list(new SubLObject[]{ list(makeSymbol("SORT-PREDICATE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("ELEMENT-KEY-FUNCTION"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SORT-PREDICATE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SORT-PREDICATE"), list(makeSymbol("NEW-PREDICATE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ELEMENT-KEY"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ELEMENT-KEY"), list(makeSymbol("NEW-KEY-FUNCTION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ORDER-QUEUE"), list(makeSymbol("QUEUE")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ORDER-QUEUE-INTERNAL"), list(makeSymbol("CONTENTS")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")) });

    public static final SubLSymbol ELEMENT_KEY_FUNCTION = makeSymbol("ELEMENT-KEY-FUNCTION");



    public static final SubLString $str26$_ORDER_QUEUE_INTERNAL__S___No_ord = makeString("(ORDER-QUEUE-INTERNAL ~S): No ordering predicate has been associated with this prioritizer.");

    public static final SubLSymbol BASIC_QUEUE_SIMPLE_SORTER_ORDER_QUEUE_INTERNAL_METHOD = makeSymbol("BASIC-QUEUE-SIMPLE-SORTER-ORDER-QUEUE-INTERNAL-METHOD");

    public static final SubLString $str28$_ORDER_QUEUE__S____S_is_not_an_in = makeString("(ORDER-QUEUE ~S): ~S is not an instance of QUEUE-INTERFACE.");

    public static final SubLSymbol BASIC_QUEUE_SIMPLE_SORTER_ORDER_QUEUE_METHOD = makeSymbol("BASIC-QUEUE-SIMPLE-SORTER-ORDER-QUEUE-METHOD");



    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_BASIC_QUEUE_SIMPLE_SORTER_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-QUEUE-SIMPLE-SORTER-CLASS");





    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_BASIC_QUEUE_SIMPLE_SORTER_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-QUEUE-SIMPLE-SORTER-INSTANCE");



    public static final SubLList $list36 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("SORT-PREDICATE"), NIL), list(makeSymbol("CSETQ"), makeSymbol("ELEMENT-KEY-FUNCTION"), NIL), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym37$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-QUEUE-SIMPLE-SORTER-METHOD");

    public static final SubLSymbol BASIC_QUEUE_SIMPLE_SORTER_INITIALIZE_METHOD = makeSymbol("BASIC-QUEUE-SIMPLE-SORTER-INITIALIZE-METHOD");

    public static final SubLSymbol GET_SORT_PREDICATE = makeSymbol("GET-SORT-PREDICATE");

    public static final SubLList $list40 = list(list(makeSymbol("RET"), makeSymbol("SORT-PREDICATE")));

    public static final SubLSymbol $sym41$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-QUEUE-SIMPLE-SORTER-METHOD");

    public static final SubLSymbol BASIC_QUEUE_SIMPLE_SORTER_GET_SORT_PREDICATE_METHOD = makeSymbol("BASIC-QUEUE-SIMPLE-SORTER-GET-SORT-PREDICATE-METHOD");

    public static final SubLSymbol SET_SORT_PREDICATE = makeSymbol("SET-SORT-PREDICATE");

    public static final SubLList $list44 = list(makeSymbol("NEW-PREDICATE"));

    public static final SubLList $list45 = list(list(makeSymbol("CSETQ"), makeSymbol("SORT-PREDICATE"), makeSymbol("NEW-PREDICATE")), list(makeSymbol("RET"), makeSymbol("NEW-PREDICATE")));

    public static final SubLSymbol $sym46$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-QUEUE-SIMPLE-SORTER-METHOD");

    public static final SubLSymbol BASIC_QUEUE_SIMPLE_SORTER_SET_SORT_PREDICATE_METHOD = makeSymbol("BASIC-QUEUE-SIMPLE-SORTER-SET-SORT-PREDICATE-METHOD");

    public static final SubLSymbol GET_ELEMENT_KEY = makeSymbol("GET-ELEMENT-KEY");

    public static final SubLList $list49 = list(list(makeSymbol("RET"), makeSymbol("ELEMENT-KEY-FUNCTION")));

    public static final SubLSymbol $sym50$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-QUEUE-SIMPLE-SORTER-METHOD");

    public static final SubLSymbol BASIC_QUEUE_SIMPLE_SORTER_GET_ELEMENT_KEY_METHOD = makeSymbol("BASIC-QUEUE-SIMPLE-SORTER-GET-ELEMENT-KEY-METHOD");

    public static final SubLSymbol SET_ELEMENT_KEY = makeSymbol("SET-ELEMENT-KEY");

    public static final SubLList $list53 = list(makeSymbol("NEW-KEY-FUNCTION"));

    public static final SubLList $list54 = list(list(makeSymbol("CSETQ"), makeSymbol("ELEMENT-KEY-FUNCTION"), makeSymbol("NEW-KEY-FUNCTION")), list(makeSymbol("RET"), makeSymbol("NEW-KEY-FUNCTION")));

    public static final SubLSymbol $sym55$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-QUEUE-SIMPLE-SORTER-METHOD");

    public static final SubLSymbol BASIC_QUEUE_SIMPLE_SORTER_SET_ELEMENT_KEY_METHOD = makeSymbol("BASIC-QUEUE-SIMPLE-SORTER-SET-ELEMENT-KEY-METHOD");

    public static final SubLSymbol QUEUE_INTERFACE = makeSymbol("QUEUE-INTERFACE");

    public static final SubLList $list58 = list(new SubLObject[]{ list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PRIORITIZER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PRIORITIZER"), list(makeSymbol("NEW-PRIORITIZER")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EMPTY-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ENQUEUE"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE"), list(makeSymbol("OLD-ELEMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEQUEUE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FIND"), list(makeSymbol("KEY-VALUE"), makeSymbol("&OPTIONAL"), list(makeSymbol("EQUALITY-PRED"), list(makeSymbol("FUNCTION"), EQL)), list(makeSymbol("KEY-ACCESSOR-FUNCTION"), list(makeSymbol("FUNCTION"), IDENTITY))), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ELEMENT-COUNT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONTENTS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CONTENTS"), list(makeSymbol("NEW-CONTENTS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEAR"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REORDER-CONTENTS"), list(makeSymbol("ORDERED-CONTENTS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PEEK"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ENQUEUED-P"), list(makeSymbol("OBJECT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PASSIVE-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PASSIVE"), list(makeSymbol("FLAG")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-ENQUEUE"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("PUBLIC")) });



    public static final SubLList $list60 = list(makeSymbol("STREAM"), makeSymbol("DEPTH"));

    public static final SubLList $list61 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("GET-CONTENTS"), makeSymbol("SELF")))), list(makeSymbol("PCOND"), list(list(makeSymbol("NULL"), makeSymbol("TEMPLATE-CONTENTS")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("QUEUE:{}"))), list(list(makeSymbol("NULL"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-CONTENTS"))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("QUEUE:{~S}"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-CONTENTS")))), list(T, list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("QUEUE:{~S"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-CONTENTS"))), list(makeSymbol("CDOLIST"), list(makeSymbol("ELEMENT"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-CONTENTS"))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("<-~S"), makeSymbol("ELEMENT"))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("}")))), list(makeSymbol("RET"), makeSymbol("SELF"))));



    public static final SubLList $list63 = list(makeSymbol("NEW-ELEMENT"));

    public static final SubLList $list64 = list(list(makeSymbol("IGNORE"), makeSymbol("NEW-ELEMENT")), list(makeSymbol("RET"), NIL));

    public static final SubLSymbol END_POINTER_QUEUE_TEMPLATE = makeSymbol("END-POINTER-QUEUE-TEMPLATE");

    public static final SubLList $list66 = list(makeSymbol("QUEUE-INTERFACE"));

    public static final SubLList $list67 = list(makeKeyword("EXTENDS"), list(makeSymbol("QUEUE-INTERFACE")));

    public static final SubLList $list68 = list(new SubLObject[]{ list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-FIRST-CONS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-FIRST-CONS"), list(makeSymbol("NEW-CONS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-END-POINTER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-END-POINTER"), list(makeSymbol("NEW-END-POINTER")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EMPTY-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ENQUEUE"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE"), list(makeSymbol("OLD-ELEMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEQUEUE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FIND"), list(makeSymbol("KEY-VALUE"), makeSymbol("&OPTIONAL"), list(makeSymbol("EQUALITY-PRED"), list(makeSymbol("FUNCTION"), EQL)), list(makeSymbol("KEY-ACCESSOR-FUNCTION"), list(makeSymbol("FUNCTION"), IDENTITY))), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ELEMENT-COUNT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONTENTS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CONTENTS"), list(makeSymbol("NEW-CONTENTS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEAR"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REORDER-CONTENTS"), list(makeSymbol("ORDERED-CONTENTS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PEEK"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ENQUEUED-P"), list(makeSymbol("OBJECT")), makeKeyword("PUBLIC")) });



    public static final SubLList $list70 = list(list(makeSymbol("RET"), list(makeSymbol("NULL"), list(makeSymbol("GET-FIRST-CONS"), makeSymbol("SELF")))));



    public static final SubLList $list72 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("GET-FIRST-CONS"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-END-POINTER"), list(makeSymbol("GET-END-POINTER"), makeSymbol("SELF")))), list(makeSymbol("PIF"), list(makeSymbol("NULL"), makeSymbol("TEMPLATE-CONTENTS")), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("LIST"), makeSymbol("NEW-ELEMENT"))), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-END-POINTER"), makeSymbol("TEMPLATE-CONTENTS"))), list(makeSymbol("PROGN"), list(makeSymbol("RPLACD"), makeSymbol("TEMPLATE-END-POINTER"), list(makeSymbol("LIST"), makeSymbol("NEW-ELEMENT"))), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-END-POINTER"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-END-POINTER"))))), list(makeSymbol("SET-FIRST-CONS"), makeSymbol("SELF"), makeSymbol("TEMPLATE-CONTENTS")), list(makeSymbol("SET-END-POINTER"), makeSymbol("SELF"), makeSymbol("TEMPLATE-END-POINTER")), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("PASSIVE-P"), makeSymbol("SELF"))), list(makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), makeSymbol("NEW-ELEMENT"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("NEW-ELEMENT"), list(makeSymbol("QUOTE"), makeSymbol("ENQUEUE-NOTIFY")), makeSymbol("SELF"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("ON-ENQUEUE")), makeSymbol("NEW-ELEMENT")), list(makeSymbol("RET"), makeSymbol("NEW-ELEMENT"))));



    public static final SubLList $list74 = list(makeSymbol("OLD-ELEMENT"));

    public static final SubLList $list75 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("GET-FIRST-CONS"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-END-POINTER"), list(makeSymbol("GET-END-POINTER"), makeSymbol("SELF")))), list(makeSymbol("PIF"), list(makeSymbol("NULL"), makeSymbol("TEMPLATE-CONTENTS")), list(makeSymbol("RET"), NIL), list(makeSymbol("PIF"), list(EQ, makeSymbol("OLD-ELEMENT"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-CONTENTS"))), list(makeSymbol("PIF"), list(EQ, makeSymbol("TEMPLATE-CONTENTS"), makeSymbol("TEMPLATE-END-POINTER")), list(makeSymbol("PROGN"), list(makeSymbol("SET-FIRST-CONS"), makeSymbol("SELF"), NIL), list(makeSymbol("SET-END-POINTER"), makeSymbol("SELF"), NIL), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("PASSIVE-P"), makeSymbol("SELF"))), list(makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), makeSymbol("OLD-ELEMENT"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("OLD-ELEMENT"), list(makeSymbol("QUOTE"), makeSymbol("REMOVE-NOTIFY")), makeSymbol("SELF"))), list(makeSymbol("RET"), makeSymbol("OLD-ELEMENT"))), list(makeSymbol("PROGN"), list(makeSymbol("SET-FIRST-CONS"), makeSymbol("SELF"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-CONTENTS"))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("PASSIVE-P"), makeSymbol("SELF"))), list(makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), makeSymbol("OLD-ELEMENT"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("OLD-ELEMENT"), list(makeSymbol("QUOTE"), makeSymbol("REMOVE-NOTIFY")), makeSymbol("SELF"))), list(makeSymbol("RET"), makeSymbol("OLD-ELEMENT")))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CURRENT-CONS"), makeSymbol("TEMPLATE-CONTENTS"))), list(makeSymbol("WHILE"), list(makeSymbol("CNOT"), list(EQ, list(makeSymbol("CDR"), makeSymbol("TEMPLATE-CURRENT-CONS")), makeSymbol("TEMPLATE-END-POINTER"))), list(makeSymbol("PWHEN"), list(EQ, makeSymbol("OLD-ELEMENT"), list(makeSymbol("CADR"), makeSymbol("TEMPLATE-CURRENT-CONS"))), list(makeSymbol("RPLACD"), makeSymbol("TEMPLATE-CURRENT-CONS"), list(makeSymbol("CDDR"), makeSymbol("TEMPLATE-CURRENT-CONS"))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("PASSIVE-P"), makeSymbol("SELF"))), list(makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), makeSymbol("OLD-ELEMENT"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("OLD-ELEMENT"), list(makeSymbol("QUOTE"), makeSymbol("REMOVE-NOTIFY")), makeSymbol("SELF"))), list(makeSymbol("RET"), makeSymbol("OLD-ELEMENT"))), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-CURRENT-CONS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-CURRENT-CONS")))), list(makeSymbol("PIF"), list(EQ, makeSymbol("OLD-ELEMENT"), list(makeSymbol("CADR"), makeSymbol("TEMPLATE-CURRENT-CONS"))), list(makeSymbol("PROGN"), list(makeSymbol("RPLACD"), makeSymbol("TEMPLATE-CURRENT-CONS"), NIL), list(makeSymbol("SET-END-POINTER"), makeSymbol("SELF"), makeSymbol("TEMPLATE-CURRENT-CONS")), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("PASSIVE-P"), makeSymbol("SELF"))), list(makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), makeSymbol("OLD-ELEMENT"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("OLD-ELEMENT"), list(makeSymbol("QUOTE"), makeSymbol("REMOVE-NOTIFY")), makeSymbol("SELF"))), list(makeSymbol("RET"), makeSymbol("OLD-ELEMENT"))), list(makeSymbol("PROGN"), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("PASSIVE-P"), makeSymbol("SELF"))), list(makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), makeSymbol("OLD-ELEMENT"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("OLD-ELEMENT"), list(makeSymbol("QUOTE"), makeSymbol("REMOVE-NOTIFY")), makeSymbol("SELF"))), list(makeSymbol("RET"), makeSymbol("OLD-ELEMENT")))))))));



    public static final SubLList $list77 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PRIORITIZER"), list(makeSymbol("GET-PRIORITIZER"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-PRIORITIZER"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-PRIORITIZER"), list(makeSymbol("QUOTE"), makeSymbol("ORDER-QUEUE")), makeSymbol("SELF")))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("GET-FIRST-CONS"), makeSymbol("SELF")))), list(makeSymbol("PUNLESS"), makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("RET"), NIL)), list(makeSymbol("PUNLESS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-CONTENTS")), list(makeSymbol("SET-FIRST-CONS"), makeSymbol("SELF"), NIL), list(makeSymbol("SET-END-POINTER"), makeSymbol("SELF"), NIL), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-RESULT"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-CONTENTS")))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("PASSIVE-P"), makeSymbol("SELF"))), list(makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), makeSymbol("TEMPLATE-RESULT"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-RESULT"), list(makeSymbol("QUOTE"), makeSymbol("DEQUEUE-NOTIFY")), makeSymbol("SELF"))), list(makeSymbol("RET"), makeSymbol("TEMPLATE-RESULT")))), list(makeSymbol("SET-FIRST-CONS"), makeSymbol("SELF"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-CONTENTS"))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-RESULT"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-CONTENTS")))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("PASSIVE-P"), makeSymbol("SELF"))), list(makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), makeSymbol("TEMPLATE-RESULT"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-RESULT"), list(makeSymbol("QUOTE"), makeSymbol("DEQUEUE-NOTIFY")), makeSymbol("SELF"))), list(makeSymbol("RET"), makeSymbol("TEMPLATE-RESULT")))));



    public static final SubLList $list79 = list(makeSymbol("KEY-VALUE"), makeSymbol("&OPTIONAL"), list(makeSymbol("EQUALITY-PRED"), list(makeSymbol("FUNCTION"), EQL)), list(makeSymbol("KEY-ACCESSOR-FUNCTION"), list(makeSymbol("FUNCTION"), IDENTITY)));

    public static final SubLList $list80 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("GET-FIRST-CONS"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-ITEM"), list(makeSymbol("MEMBER"), makeSymbol("KEY-VALUE"), makeSymbol("TEMPLATE-CONTENTS"), makeSymbol("EQUALITY-PRED"), makeSymbol("KEY-ACCESSOR-FUNCTION")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-ITEM"), list(makeSymbol("RET"), makeSymbol("TEMPLATE-ITEM")))))), list(makeSymbol("RET"), NIL));



    public static final SubLList $list82 = list(list(makeSymbol("RET"), list(makeSymbol("LENGTH"), list(makeSymbol("GET-FIRST-CONS"), makeSymbol("SELF")))));



    public static final SubLList $list84 = list(list(makeSymbol("RET"), list(makeSymbol("GET-FIRST-CONS"), makeSymbol("SELF"))));



    public static final SubLList $list86 = list(makeSymbol("NEW-CONTENTS"));

    public static final SubLList $list87 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("COPY-LIST"), makeSymbol("NEW-CONTENTS")))), list(makeSymbol("PIF"), makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("PROGN"), list(makeSymbol("SET-FIRST-CONS"), makeSymbol("SELF"), makeSymbol("TEMPLATE-CONTENTS")), list(makeSymbol("SET-END-POINTER"), makeSymbol("SELF"), list(makeSymbol("LAST"), makeSymbol("TEMPLATE-CONTENTS")))), list(makeSymbol("PROGN"), list(makeSymbol("SET-FIRST-CONS"), makeSymbol("SELF"), NIL), list(makeSymbol("SET-END-POINTER"), makeSymbol("SELF"), NIL))), list(makeSymbol("RET"), makeSymbol("NEW-CONTENTS"))));



    public static final SubLList $list89 = list(list(makeSymbol("SET-FIRST-CONS"), makeSymbol("SELF"), NIL), list(makeSymbol("SET-END-POINTER"), makeSymbol("SELF"), NIL), list(makeSymbol("RET"), NIL));



    public static final SubLList $list91 = list(makeSymbol("ORDERED-CONTENTS"));

    public static final SubLList $list92 = list(list(makeSymbol("RET"), list(makeSymbol("SET-CONTENTS"), makeSymbol("SELF"), makeSymbol("ORDERED-CONTENTS"))));



    public static final SubLList $list94 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("GET-FIRST-CONS"), makeSymbol("SELF")))), list(makeSymbol("PUNLESS"), makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("RET"), NIL)), list(makeSymbol("RET"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-CONTENTS")))));



    public static final SubLList $list96 = list(makeSymbol("OBJECT"));

    public static final SubLList $list97 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("GET-FIRST-CONS"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), list(makeSymbol("MEMBER"), makeSymbol("OBJECT"), makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("FUNCTION"), EQUAL)), list(makeSymbol("RET"), T)), list(makeSymbol("RET"), NIL)));

    public static final SubLSymbol BASIC_QUEUE = makeSymbol("BASIC-QUEUE");

    public static final SubLList $list99 = list(makeSymbol("END-POINTER-QUEUE-TEMPLATE"));

    public static final SubLList $list100 = list(new SubLObject[]{ list(makeSymbol("FIRST-CONS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("LAST-CONS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("PRIORITIZER"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("IS-PASSIVE"), makeKeyword("BOOLEAN"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-FIRST-CONS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-FIRST-CONS"), list(makeSymbol("NEW-CONS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-END-POINTER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-END-POINTER"), list(makeSymbol("NEW-END-POINTER")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PRIORITIZER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PRIORITIZER"), list(makeSymbol("NEW-PRIORITIZER")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PASSIVE-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PASSIVE"), list(makeSymbol("FLAG")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EMPTY-P"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ENQUEUE"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-ENQUEUE"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE"), list(makeSymbol("OLD-ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEQUEUE"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FIND"), list(makeSymbol("KEY-VALUE"), makeSymbol("&OPTIONAL"), list(makeSymbol("EQUALITY-PRED"), list(makeSymbol("FUNCTION"), EQL)), list(makeSymbol("KEY-ACCESSOR-FUNCTION"), list(makeSymbol("FUNCTION"), IDENTITY))), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ELEMENT-COUNT"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONTENTS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CONTENTS"), list(makeSymbol("NEW-CONTENTS")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEAR"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REORDER-CONTENTS"), list(makeSymbol("ORDERED-CONTENTS")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PEEK"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ENQUEUED-P"), list(makeSymbol("OBJECT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")) });





    public static final SubLSymbol FIRST_CONS = makeSymbol("FIRST-CONS");



    private static final SubLInteger $int$4097 = makeInteger(4097);

    public static final SubLSymbol BASIC_QUEUE_ENQUEUED_P_METHOD = makeSymbol("BASIC-QUEUE-ENQUEUED-P-METHOD");

    public static final SubLSymbol BASIC_QUEUE_PEEK_METHOD = makeSymbol("BASIC-QUEUE-PEEK-METHOD");

    public static final SubLSymbol BASIC_QUEUE_REORDER_CONTENTS_METHOD = makeSymbol("BASIC-QUEUE-REORDER-CONTENTS-METHOD");

    public static final SubLSymbol BASIC_QUEUE_CLEAR_METHOD = makeSymbol("BASIC-QUEUE-CLEAR-METHOD");

    public static final SubLSymbol BASIC_QUEUE_SET_CONTENTS_METHOD = makeSymbol("BASIC-QUEUE-SET-CONTENTS-METHOD");

    public static final SubLSymbol BASIC_QUEUE_GET_CONTENTS_METHOD = makeSymbol("BASIC-QUEUE-GET-CONTENTS-METHOD");

    public static final SubLSymbol BASIC_QUEUE_GET_ELEMENT_COUNT_METHOD = makeSymbol("BASIC-QUEUE-GET-ELEMENT-COUNT-METHOD");

    public static final SubLSymbol BASIC_QUEUE_FIND_METHOD = makeSymbol("BASIC-QUEUE-FIND-METHOD");



    public static final SubLSymbol BASIC_QUEUE_DEQUEUE_METHOD = makeSymbol("BASIC-QUEUE-DEQUEUE-METHOD");



    public static final SubLSymbol BASIC_QUEUE_REMOVE_METHOD = makeSymbol("BASIC-QUEUE-REMOVE-METHOD");

    public static final SubLSymbol BASIC_QUEUE_ON_ENQUEUE_METHOD = makeSymbol("BASIC-QUEUE-ON-ENQUEUE-METHOD");



    public static final SubLSymbol BASIC_QUEUE_ENQUEUE_METHOD = makeSymbol("BASIC-QUEUE-ENQUEUE-METHOD");

    public static final SubLSymbol BASIC_QUEUE_EMPTY_P_METHOD = makeSymbol("BASIC-QUEUE-EMPTY-P-METHOD");

    public static final SubLString $str122$QUEUE___ = makeString("QUEUE:{}");

    public static final SubLString $str123$QUEUE___S_ = makeString("QUEUE:{~S}");

    public static final SubLString $str124$QUEUE___S = makeString("QUEUE:{~S");

    public static final SubLString $str125$___S = makeString("<-~S");

    public static final SubLString $str126$_ = makeString("}");

    public static final SubLSymbol BASIC_QUEUE_PRINT_METHOD = makeSymbol("BASIC-QUEUE-PRINT-METHOD");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_BASIC_QUEUE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-QUEUE-CLASS");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_BASIC_QUEUE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-QUEUE-INSTANCE");

    public static final SubLList $list130 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("FIRST-CONS"), NIL), list(makeSymbol("CSETQ"), makeSymbol("LAST-CONS"), NIL), list(makeSymbol("CSETQ"), makeSymbol("PRIORITIZER"), NIL), list(makeSymbol("CSETQ"), makeSymbol("IS-PASSIVE"), NIL), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym131$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-QUEUE-METHOD");

    public static final SubLSymbol BASIC_QUEUE_INITIALIZE_METHOD = makeSymbol("BASIC-QUEUE-INITIALIZE-METHOD");



    public static final SubLList $list134 = list(list(makeSymbol("RET"), makeSymbol("FIRST-CONS")));

    public static final SubLSymbol $sym135$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-QUEUE-METHOD");

    public static final SubLSymbol BASIC_QUEUE_GET_FIRST_CONS_METHOD = makeSymbol("BASIC-QUEUE-GET-FIRST-CONS-METHOD");



    public static final SubLList $list138 = list(makeSymbol("NEW-CONS"));

    public static final SubLList $list139 = list(list(makeSymbol("CSETQ"), makeSymbol("FIRST-CONS"), makeSymbol("NEW-CONS")), list(makeSymbol("RET"), makeSymbol("NEW-CONS")));

    public static final SubLSymbol $sym140$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-QUEUE-METHOD");

    public static final SubLSymbol BASIC_QUEUE_SET_FIRST_CONS_METHOD = makeSymbol("BASIC-QUEUE-SET-FIRST-CONS-METHOD");



    public static final SubLList $list143 = list(list(makeSymbol("RET"), makeSymbol("LAST-CONS")));

    public static final SubLSymbol $sym144$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-QUEUE-METHOD");

    public static final SubLSymbol BASIC_QUEUE_GET_END_POINTER_METHOD = makeSymbol("BASIC-QUEUE-GET-END-POINTER-METHOD");



    public static final SubLList $list147 = list(makeSymbol("NEW-END-POINTER"));

    public static final SubLList $list148 = list(list(makeSymbol("CSETQ"), makeSymbol("LAST-CONS"), makeSymbol("NEW-END-POINTER")), list(makeSymbol("RET"), makeSymbol("NEW-END-POINTER")));

    public static final SubLSymbol $sym149$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-QUEUE-METHOD");

    public static final SubLSymbol BASIC_QUEUE_SET_END_POINTER_METHOD = makeSymbol("BASIC-QUEUE-SET-END-POINTER-METHOD");



    public static final SubLList $list152 = list(list(makeSymbol("RET"), makeSymbol("PRIORITIZER")));

    public static final SubLSymbol $sym153$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-QUEUE-METHOD");

    public static final SubLSymbol BASIC_QUEUE_GET_PRIORITIZER_METHOD = makeSymbol("BASIC-QUEUE-GET-PRIORITIZER-METHOD");



    public static final SubLList $list156 = list(makeSymbol("NEW-PRIORITIZER"));

    public static final SubLList $list157 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-PRIORITIZER")), list(makeSymbol("QUEUE-PRIORITIZER-INTERFACE-P"), makeSymbol("NEW-PRIORITIZER"))), makeString("(SET-PRIORITIZER ~S): ~S is not an instance of QUEUE-PRIORITIZER-INTERFACE."), makeSymbol("SELF"), makeSymbol("NEW-PRIORITIZER")), list(makeSymbol("CSETQ"), makeSymbol("PRIORITIZER"), makeSymbol("NEW-PRIORITIZER")), list(makeSymbol("RET"), makeSymbol("NEW-PRIORITIZER")));

    public static final SubLSymbol $sym158$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-QUEUE-METHOD");

    public static final SubLString $str159$_SET_PRIORITIZER__S____S_is_not_a = makeString("(SET-PRIORITIZER ~S): ~S is not an instance of QUEUE-PRIORITIZER-INTERFACE.");

    public static final SubLSymbol BASIC_QUEUE_SET_PRIORITIZER_METHOD = makeSymbol("BASIC-QUEUE-SET-PRIORITIZER-METHOD");



    public static final SubLList $list162 = list(makeKeyword("READ-ONLY"), makeKeyword("PUBLIC"));

    public static final SubLList $list163 = list(list(makeSymbol("RET"), makeSymbol("IS-PASSIVE")));

    public static final SubLSymbol BASIC_QUEUE_PASSIVE_P_METHOD = makeSymbol("BASIC-QUEUE-PASSIVE-P-METHOD");



    public static final SubLList $list166 = list(makeSymbol("FLAG"));

    public static final SubLList $list167 = list(list(makeSymbol("CSETQ"), makeSymbol("IS-PASSIVE"), makeSymbol("FLAG")), list(makeSymbol("RET"), makeSymbol("FLAG")));

    public static final SubLSymbol $sym168$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-QUEUE-METHOD");

    public static final SubLSymbol BASIC_QUEUE_SET_PASSIVE_METHOD = makeSymbol("BASIC-QUEUE-SET-PASSIVE-METHOD");

    public static final SubLSymbol DOUBLY_LINKED_QUEUE_TEMPLATE = makeSymbol("DOUBLY-LINKED-QUEUE-TEMPLATE");

    public static final SubLList $list171 = list(new SubLObject[]{ list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-LIST-INTERNAL"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-LIST-INTERNAL"), list(makeSymbol("NEW-LIST")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PRIORITIZER-INTERNAL"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PRIORITIZER-INTERNAL"), list(makeSymbol("NEW-PRIORITIZER")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE-QUA-DOUBLY-LINKED-QUEUE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-LIST"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PRIORITIZER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PRIORITIZER"), list(makeSymbol("NEW-PRIORITIZER")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EMPTY-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ENQUEUE"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE"), list(makeSymbol("OLD-ELEMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEQUEUE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FIND"), list(makeSymbol("KEY-VALUE"), makeSymbol("&OPTIONAL"), list(makeSymbol("EQUALITY-PRED"), list(makeSymbol("FUNCTION"), EQL)), list(makeSymbol("KEY-ACCESSOR-FUNCTION"), list(makeSymbol("FUNCTION"), IDENTITY))), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ELEMENT-COUNT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONTENTS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CONTENTS"), list(makeSymbol("NEW-CONTENTS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEAR"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REORDER-CONTENTS"), list(makeSymbol("ORDERED-CONTENTS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PEEK"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ENQUEUED-P"), list(makeSymbol("OBJECT")), makeKeyword("PUBLIC")) });

    public static final SubLSymbol INITIALIZE_QUA_DOUBLY_LINKED_QUEUE = makeSymbol("INITIALIZE-QUA-DOUBLY-LINKED-QUEUE");

    public static final SubLList $list173 = list(list(makeSymbol("SET-LIST-INTERNAL"), makeSymbol("SELF"), NIL), list(makeSymbol("SET-PRIORITIZER-INTERNAL"), makeSymbol("SELF"), NIL), list(makeSymbol("RET"), makeSymbol("SELF")));



    public static final SubLList $list175 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LIST"), list(makeSymbol("GET-LIST-INTERNAL"), makeSymbol("SELF")))), list(makeSymbol("PUNLESS"), list(makeSymbol("GET-LIST-INTERNAL"), makeSymbol("SELF")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-LIST"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), list(makeSymbol("QUOTE"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")))), list(makeSymbol("SET-LIST-INTERNAL"), makeSymbol("SELF"), makeSymbol("TEMPLATE-LIST"))), list(makeSymbol("RET"), makeSymbol("TEMPLATE-LIST"))));

    public static final SubLList $list176 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LIST"), list(makeSymbol("GET-LIST-INTERNAL"), makeSymbol("SELF")))), list(makeSymbol("PUNLESS"), makeSymbol("TEMPLATE-LIST"), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("DL-QUEUE:{}")), list(makeSymbol("RET"), makeSymbol("SELF"))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-ENUMERATOR"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ALLOCATE-ENUMERATOR"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("TEMPLATE-LIST")))), list(makeSymbol("PCOND"), list(list(makeSymbol("NULL"), makeSymbol("TEMPLATE-ENUMERATOR")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("#<~S Class is not correctly implemented.  ALLOCATE-ENUMERATOR failed.>"), list(makeSymbol("CLASS-OF"), makeSymbol("SELF"))), list(makeSymbol("RET"), makeSymbol("SELF"))), list(list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-ENUMERATOR"), list(makeSymbol("QUOTE"), makeSymbol("EMPTY-P"))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("DL-QUEUE:{}"))), list(T, list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("DL-QUEUE:{~S"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-ENUMERATOR"), list(makeSymbol("QUOTE"), makeSymbol("FIRST")))), list(makeSymbol("WHILE"), list(makeSymbol("CNOT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-ENUMERATOR"), list(makeSymbol("QUOTE"), makeSymbol("LAST-P")))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("<-~S"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-ENUMERATOR"), list(makeSymbol("QUOTE"), makeSymbol("NEXT"))))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("}")))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("DEALLOCATE-ENUMERATOR"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("TEMPLATE-LIST"), makeSymbol("TEMPLATE-ENUMERATOR")))), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLList $list177 = list(list(makeSymbol("RET"), list(makeSymbol("GET-PRIORITIZER-INTERNAL"), makeSymbol("SELF"))));

    public static final SubLList $list178 = list(list(makeSymbol("PUNLESS"), makeSymbol("NEW-PRIORITIZER"), list(makeSymbol("SET-PRIORITIZER-INTERNAL"), makeSymbol("SELF"), NIL), list(makeSymbol("RET"), NIL)), list(makeSymbol("MUST"), list(makeSymbol("QUEUE-PRIORITIZER-INTERFACE-P"), makeSymbol("NEW-PRIORITIZER")), makeString("(SET-PRIORITIZER ~S): ~S is not an instance of QUEUE-PRIORITIZER-INTERFACE."), makeSymbol("SELF"), makeSymbol("NEW-PRIORITIZER")), list(makeSymbol("SET-PRIORITIZER-INTERNAL"), makeSymbol("SELF"), makeSymbol("NEW-PRIORITIZER")), list(makeSymbol("RET"), makeSymbol("NEW-PRIORITIZER")));

    public static final SubLList $list179 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LIST"), list(makeSymbol("GET-LIST-INTERNAL"), makeSymbol("SELF")))), list(makeSymbol("RET"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("TEMPLATE-LIST")), list(makeSymbol("COLLECTION-TEMPLATE-EMPTY-P"), makeSymbol("TEMPLATE-LIST"))))));

    public static final SubLList $list180 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-RESOLVED-LIST"), list(makeSymbol("GET-LIST"), makeSymbol("SELF")))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ADD"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("TEMPLATE-RESOLVED-LIST"), makeSymbol("NEW-ELEMENT")), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("PASSIVE-P"), makeSymbol("SELF"))), list(makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), makeSymbol("NEW-ELEMENT"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("NEW-ELEMENT"), list(makeSymbol("QUOTE"), makeSymbol("ENQUEUE-NOTIFY")), makeSymbol("SELF"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("ON-ENQUEUE")), makeSymbol("NEW-ELEMENT")), list(makeSymbol("RET"), makeSymbol("NEW-ELEMENT"))));

    public static final SubLList $list181 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-RESOLVED-LIST"), list(makeSymbol("GET-LIST"), makeSymbol("SELF")))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("REMOVE"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("TEMPLATE-RESOLVED-LIST"), makeSymbol("OLD-ELEMENT")), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("PASSIVE-P"), makeSymbol("SELF"))), list(makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), makeSymbol("OLD-ELEMENT"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("OLD-ELEMENT"), list(makeSymbol("QUOTE"), makeSymbol("REMOVE-NOTIFY")), makeSymbol("SELF"))), list(makeSymbol("RET"), makeSymbol("OLD-ELEMENT"))));

    public static final SubLList $list182 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LIST"), list(makeSymbol("GET-LIST-INTERNAL"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-LIST"), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PRIORITIZER"), list(makeSymbol("GET-PRIORITIZER"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-PRIORITIZER"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-PRIORITIZER"), list(makeSymbol("QUOTE"), makeSymbol("ORDER-QUEUE")), makeSymbol("SELF")))), list(makeSymbol("CLET"), list(list(makeSymbol("DEQUEUED-ITEM"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("POP"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("TEMPLATE-LIST")))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("PASSIVE-P"), makeSymbol("SELF"))), list(makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), makeSymbol("DEQUEUED-ITEM"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("DEQUEUED-ITEM"), list(makeSymbol("QUOTE"), makeSymbol("DEQUEUE-NOTIFY")), makeSymbol("SELF"))), list(makeSymbol("RET"), makeSymbol("DEQUEUED-ITEM"))))), list(makeSymbol("RET"), NIL));

    public static final SubLList $list183 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LIST"), list(makeSymbol("GET-LIST-INTERNAL"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-LIST"), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-ENUMERATOR"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-LIST"), list(makeSymbol("QUOTE"), makeSymbol("ALLOCATE-ENUMERATOR"))))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-ENUMERATOR"), list(makeSymbol("PUNLESS"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-ENUMERATOR"), list(makeSymbol("QUOTE"), makeSymbol("EMPTY-P"))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CURRENT-ELEMENT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-ENUMERATOR"), list(makeSymbol("QUOTE"), makeSymbol("FIRST"))))), list(makeSymbol("PWHEN"), list(makeSymbol("FUNCALL"), makeSymbol("EQUALITY-PRED"), makeSymbol("KEY-VALUE"), list(makeSymbol("FUNCALL"), makeSymbol("KEY-ACCESSOR-FUNCTION"), makeSymbol("TEMPLATE-CURRENT-ELEMENT"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-LIST"), list(makeSymbol("QUOTE"), makeSymbol("DEALLOCATE-ENUMERATOR")), makeSymbol("TEMPLATE-ENUMERATOR")), list(makeSymbol("RET"), makeSymbol("TEMPLATE-CURRENT-ELEMENT"))), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-CURRENT-ELEMENT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-ENUMERATOR"), list(makeSymbol("QUOTE"), makeSymbol("NEXT")))), list(makeSymbol("WHILE"), makeSymbol("TEMPLATE-CURRENT-ELEMENT"), list(makeSymbol("PWHEN"), list(makeSymbol("FUNCALL"), makeSymbol("EQUALITY-PRED"), makeSymbol("KEY-VALUE"), list(makeSymbol("FUNCALL"), makeSymbol("KEY-ACCESSOR-FUNCTION"), makeSymbol("TEMPLATE-CURRENT-ELEMENT"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-LIST"), list(makeSymbol("QUOTE"), makeSymbol("DEALLOCATE-ENUMERATOR")), makeSymbol("TEMPLATE-ENUMERATOR")), list(makeSymbol("RET"), makeSymbol("TEMPLATE-CURRENT-ELEMENT"))), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-CURRENT-ELEMENT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-ENUMERATOR"), list(makeSymbol("QUOTE"), makeSymbol("NEXT")))))))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-LIST"), list(makeSymbol("QUOTE"), makeSymbol("DEALLOCATE-ENUMERATOR")), makeSymbol("TEMPLATE-ENUMERATOR")), list(makeSymbol("RET"), NIL)))), list(makeSymbol("RET"), NIL));

    public static final SubLList $list184 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LIST"), list(makeSymbol("GET-LIST-INTERNAL"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-LIST"), list(makeSymbol("RET"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-ELEMENT-COUNT"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("TEMPLATE-LIST"))))), list(makeSymbol("RET"), ZERO_INTEGER));

    public static final SubLList $list185 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LIST"), list(makeSymbol("GET-LIST-INTERNAL"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-LIST"), list(makeSymbol("RET"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-CONTENTS"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("TEMPLATE-LIST"))))), list(makeSymbol("RET"), NIL));

    public static final SubLList $list186 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-RESOLVED-LIST"), list(makeSymbol("GET-LIST"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-ENUMERATOR"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ALLOCATE-ENUMERATOR"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("TEMPLATE-RESOLVED-LIST")))), list(makeSymbol("PUNLESS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("EMPTY-P"), makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR")), makeSymbol("TEMPLATE-ENUMERATOR")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CURRENT-ITEM"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("FIRST"), makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR")), makeSymbol("TEMPLATE-ENUMERATOR")))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("PASSIVE-P"), makeSymbol("SELF"))), list(makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), makeSymbol("TEMPLATE-CURRENT-ITEM"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-CURRENT-ITEM"), list(makeSymbol("QUOTE"), makeSymbol("DEQUEUE-NOTIFY")))), list(makeSymbol("WHILE"), list(makeSymbol("CNOT"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("LAST-P"), makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR")), makeSymbol("TEMPLATE-ENUMERATOR"))), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-CURRENT-ITEM"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEXT"), makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR")), makeSymbol("TEMPLATE-ENUMERATOR"))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("PASSIVE-P"), makeSymbol("SELF"))), list(makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), makeSymbol("TEMPLATE-CURRENT-ITEM"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-CURRENT-ITEM"), list(makeSymbol("QUOTE"), makeSymbol("DEQUEUE-NOTIFY")))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("DEALLOCATE-ENUMERATOR"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("TEMPLATE-RESOLVED-LIST"), makeSymbol("TEMPLATE-ENUMERATOR"))), list(makeSymbol("PWHEN"), makeSymbol("NEW-CONTENTS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-CONTENTS"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("TEMPLATE-RESOLVED-LIST"), makeSymbol("NEW-CONTENTS")), list(makeSymbol("CDOLIST"), list(makeSymbol("NEW-ITEM"), makeSymbol("NEW-CONTENTS")), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("PASSIVE-P"), makeSymbol("SELF"))), list(makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), makeSymbol("NEW-ITEM"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("NEW-ITEM"), list(makeSymbol("QUOTE"), makeSymbol("ENQUEUE-NOTIFY")), makeSymbol("SELF")))))), list(makeSymbol("RET"), makeSymbol("NEW-CONTENTS")));

    public static final SubLList $list187 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LIST"), list(makeSymbol("GET-LIST-INTERNAL"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-LIST"), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-ENUMERATOR"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ALLOCATE-ENUMERATOR"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("TEMPLATE-LIST")))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CURRENT-ITEM"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("FIRST"), makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR")), makeSymbol("TEMPLATE-ENUMERATOR")))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("PASSIVE-P"), makeSymbol("SELF"))), list(makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), makeSymbol("TEMPLATE-CURRENT-ITEM"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-CURRENT-ITEM"), list(makeSymbol("QUOTE"), makeSymbol("DEQUEUE-NOTIFY")))), list(makeSymbol("WHILE"), list(makeSymbol("CNOT"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("LAST-P"), makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR")), makeSymbol("TEMPLATE-ENUMERATOR"))), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-CURRENT-ITEM"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEXT"), makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR")), makeSymbol("TEMPLATE-ENUMERATOR"))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("PASSIVE-P"), makeSymbol("SELF"))), list(makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), makeSymbol("TEMPLATE-CURRENT-ITEM"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-CURRENT-ITEM"), list(makeSymbol("QUOTE"), makeSymbol("DEQUEUE-NOTIFY")))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("DEALLOCATE-ENUMERATOR"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("TEMPLATE-LIST"), makeSymbol("TEMPLATE-ENUMERATOR"))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("CLEAR"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("TEMPLATE-LIST")))), list(makeSymbol("RET"), NIL));

    public static final SubLList $list188 = list(list(makeSymbol("CLET"), list(list(makeSymbol("RESOLVED-LIST"), list(makeSymbol("GET-LIST"), makeSymbol("SELF")))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-CONTENTS"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("RESOLVED-LIST"), makeSymbol("ORDERED-CONTENTS")), list(makeSymbol("RET"), NIL)));

    public static final SubLList $list189 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LIST"), list(makeSymbol("GET-LIST-INTERNAL"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-LIST"), list(makeSymbol("PUNLESS"), list(makeSymbol("="), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-ELEMENT-COUNT"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("TEMPLATE-LIST")), ZERO_INTEGER), list(makeSymbol("RET"), NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("NEXT-ITEM"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NTH"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("TEMPLATE-LIST"), ZERO_INTEGER))), list(makeSymbol("RET"), makeSymbol("NEXT-ITEM"))))), list(makeSymbol("RET"), NIL));

    public static final SubLList $list190 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LIST"), list(makeSymbol("GET-LIST-INTERNAL"), makeSymbol("SELF")))), list(makeSymbol("PUNLESS"), makeSymbol("TEMPLATE-LIST"), list(makeSymbol("RET"), NIL)), list(makeSymbol("RET"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("MEMBER-P"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("TEMPLATE-LIST"), makeSymbol("OBJECT")))));



    public static final SubLList $list192 = list(makeSymbol("DOUBLY-LINKED-QUEUE-TEMPLATE"));

    public static final SubLList $list193 = list(new SubLObject[]{ list(makeSymbol("LIST"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("PRIORITIZER"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("IS-PASSIVE"), makeKeyword("BOOLEAN"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-LIST-INTERNAL"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-LIST-INTERNAL"), list(makeSymbol("NEW-LIST")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PRIORITIZER-INTERNAL"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PRIORITIZER-INTERNAL"), list(makeSymbol("NEW-PRIORITIZER")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PASSIVE-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PASSIVE"), list(makeSymbol("FLAG")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE-QUA-DOUBLY-LINKED-QUEUE"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-LIST"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PRIORITIZER"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PRIORITIZER"), list(makeSymbol("NEW-PRIORITIZER")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EMPTY-P"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ENQUEUE"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-ENQUEUE"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("PUBLIC"), makeKeyword("INSTANTIATE-TEMPLATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE"), list(makeSymbol("OLD-ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEQUEUE"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FIND"), list(makeSymbol("KEY-VALUE"), makeSymbol("&OPTIONAL"), list(makeSymbol("EQUALITY-PRED"), list(makeSymbol("FUNCTION"), EQL)), list(makeSymbol("KEY-ACCESSOR-FUNCTION"), list(makeSymbol("FUNCTION"), IDENTITY))), makeKeyword("PUBLIC"), makeKeyword("INSTANTIATE-TEMPLATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ELEMENT-COUNT"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONTENTS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CONTENTS"), list(makeSymbol("NEW-CONTENTS")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEAR"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REORDER-CONTENTS"), list(makeSymbol("ORDERED-CONTENTS")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PEEK"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ENQUEUED-P"), list(makeSymbol("OBJECT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")) });



    public static final SubLSymbol BASIC_DOUBLY_LINKED_QUEUE_ENQUEUED_P_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-ENQUEUED-P-METHOD");

    public static final SubLSymbol BASIC_DOUBLY_LINKED_QUEUE_PEEK_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-PEEK-METHOD");

    public static final SubLSymbol BASIC_DOUBLY_LINKED_QUEUE_REORDER_CONTENTS_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-REORDER-CONTENTS-METHOD");

    public static final SubLSymbol BASIC_DOUBLY_LINKED_QUEUE_CLEAR_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-CLEAR-METHOD");

    public static final SubLSymbol BASIC_DOUBLY_LINKED_QUEUE_SET_CONTENTS_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-SET-CONTENTS-METHOD");

    public static final SubLSymbol BASIC_DOUBLY_LINKED_QUEUE_GET_CONTENTS_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-GET-CONTENTS-METHOD");

    public static final SubLSymbol BASIC_DOUBLY_LINKED_QUEUE_GET_ELEMENT_COUNT_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-GET-ELEMENT-COUNT-METHOD");









    public static final SubLSymbol BASIC_DOUBLY_LINKED_QUEUE_FIND_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-FIND-METHOD");

    public static final SubLSymbol BASIC_DOUBLY_LINKED_QUEUE_DEQUEUE_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-DEQUEUE-METHOD");

    public static final SubLSymbol BASIC_DOUBLY_LINKED_QUEUE_REMOVE_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-REMOVE-METHOD");

    public static final SubLSymbol BASIC_DOUBLY_LINKED_QUEUE_ON_ENQUEUE_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-ON-ENQUEUE-METHOD");

    public static final SubLSymbol BASIC_DOUBLY_LINKED_QUEUE_ENQUEUE_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-ENQUEUE-METHOD");

    public static final SubLSymbol BASIC_DOUBLY_LINKED_QUEUE_EMPTY_P_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-EMPTY-P-METHOD");

    public static final SubLSymbol BASIC_DOUBLY_LINKED_QUEUE_SET_PRIORITIZER_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-SET-PRIORITIZER-METHOD");

    public static final SubLSymbol BASIC_DOUBLY_LINKED_QUEUE_GET_PRIORITIZER_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-GET-PRIORITIZER-METHOD");

    public static final SubLString $str214$DL_QUEUE___ = makeString("DL-QUEUE:{}");

    public static final SubLString $str215$___S_Class_is_not_correctly_imple = makeString("#<~S Class is not correctly implemented.  ALLOCATE-ENUMERATOR failed.>");

    public static final SubLString $str216$DL_QUEUE___S = makeString("DL-QUEUE:{~S");



    public static final SubLSymbol BASIC_DOUBLY_LINKED_QUEUE_PRINT_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-PRINT-METHOD");



    public static final SubLSymbol BASIC_DOUBLY_LINKED_QUEUE_GET_LIST_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-GET-LIST-METHOD");

    public static final SubLSymbol $sym221$BASIC_DOUBLY_LINKED_QUEUE_INITIALIZE_QUA_DOUBLY_LINKED_QUEUE_METH = makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-INITIALIZE-QUA-DOUBLY-LINKED-QUEUE-METHOD");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_BASIC_DOUBLY_LINKED_QUEUE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-DOUBLY-LINKED-QUEUE-CLASS");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_BASIC_DOUBLY_LINKED_QUEUE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-DOUBLY-LINKED-QUEUE-INSTANCE");



    public static final SubLList $list225 = list(list(makeSymbol("RET"), makeSymbol("LIST")));

    public static final SubLSymbol $sym226$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-QUEUE-METHOD");

    public static final SubLSymbol BASIC_DOUBLY_LINKED_QUEUE_GET_LIST_INTERNAL_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-GET-LIST-INTERNAL-METHOD");



    public static final SubLList $list229 = list(makeSymbol("NEW-LIST"));

    public static final SubLList $list230 = list(list(makeSymbol("CSETQ"), makeSymbol("LIST"), makeSymbol("NEW-LIST")), list(makeSymbol("RET"), makeSymbol("NEW-LIST")));

    public static final SubLSymbol $sym231$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-QUEUE-METHOD");

    public static final SubLSymbol BASIC_DOUBLY_LINKED_QUEUE_SET_LIST_INTERNAL_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-SET-LIST-INTERNAL-METHOD");



    public static final SubLSymbol $sym234$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-QUEUE-METHOD");

    public static final SubLSymbol BASIC_DOUBLY_LINKED_QUEUE_GET_PRIORITIZER_INTERNAL_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-GET-PRIORITIZER-INTERNAL-METHOD");



    public static final SubLList $list237 = list(list(makeSymbol("CSETQ"), makeSymbol("PRIORITIZER"), makeSymbol("NEW-PRIORITIZER")), list(makeSymbol("RET"), makeSymbol("NEW-PRIORITIZER")));

    public static final SubLSymbol $sym238$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-QUEUE-METHOD");

    public static final SubLSymbol BASIC_DOUBLY_LINKED_QUEUE_SET_PRIORITIZER_INTERNAL_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-SET-PRIORITIZER-INTERNAL-METHOD");

    public static final SubLList $list240 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("INITIALIZE-QUA-DOUBLY-LINKED-QUEUE"), makeSymbol("SELF")), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol BASIC_DOUBLY_LINKED_QUEUE_INITIALIZE_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-INITIALIZE-METHOD");

    public static final SubLSymbol BASIC_DOUBLY_LINKED_QUEUE_PASSIVE_P_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-PASSIVE-P-METHOD");

    public static final SubLSymbol $sym243$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-QUEUE-METHOD");

    public static final SubLSymbol BASIC_DOUBLY_LINKED_QUEUE_SET_PASSIVE_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-SET-PASSIVE-METHOD");



    public static final SubLList $list246 = list(new SubLObject[]{ list(makeSymbol("LOCK"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("LOCK-HISTORY"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PRIORITIZER"), list(makeSymbol("NEW-PRIORITIZER")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ENQUEUE"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-ENQUEUE"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE"), list(makeSymbol("OLD-ELEMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEQUEUE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CONTENTS"), list(makeSymbol("NEW-CONTENTS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEAR"), NIL, makeKeyword("PUBLIC")) });



    public static final SubLSymbol $sym248$SUBLOOP_RESERVED_INITIALIZE_ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_CLAS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-CLASS");



    public static final SubLSymbol $sym250$SUBLOOP_RESERVED_INITIALIZE_ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_INST = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-INSTANCE");

    public static final SubLList $list251 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("LOCK"), list(makeSymbol("MAKE-LOCK"), list(makeSymbol("FORMAT"), NIL, makeString("~S"), makeSymbol("SELF")))), list(makeSymbol("CSETQ"), makeSymbol("LOCK-HISTORY"), NIL), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym252$OUTER_CATCH_FOR_ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-METHOD");

    public static final SubLString $str253$_S = makeString("~S");

    public static final SubLSymbol ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_INITIALIZE_METHOD = makeSymbol("ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-INITIALIZE-METHOD");

    public static final SubLList $list255 = list(makeKeyword("NO-MEMBER-VARIABLES"), makeKeyword("PUBLIC"));

    public static final SubLList $list256 = list(list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"), NIL), list(makeSymbol("LOCK"), list(makeSymbol("GET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK"), makeSymbol("SELF")))), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("SET-PRIORITIZER"), makeSymbol("SUPER"), makeSymbol("NEW-PRIORITIZER")))), list(makeSymbol("RET"), makeSymbol("RESULT"))));

    public static final SubLSymbol ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_SET_PRIORITIZER_METHOD = makeSymbol("ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-SET-PRIORITIZER-METHOD");

    public static final SubLList $list258 = list(list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"), NIL), list(makeSymbol("LOCK"), list(makeSymbol("GET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK"), makeSymbol("SELF"))), list(makeSymbol("LOCK-HISTORY"), list(makeSymbol("GET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK-HISTORY"), makeSymbol("SELF")))), list(makeSymbol("CPUSH"), list(makeSymbol("LIST"), makeKeyword("WAITING"), makeKeyword("ENQUEUE"), makeSymbol("NEW-ELEMENT")), makeSymbol("LOCK-HISTORY")), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("CPUSH"), list(makeSymbol("LIST"), makeKeyword("LOCKED"), makeKeyword("ENQUEUE"), makeSymbol("NEW-ELEMENT")), makeSymbol("LOCK-HISTORY")), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("ENQUEUE"), makeSymbol("SUPER"), makeSymbol("NEW-ELEMENT"))), list(makeSymbol("CPUSH"), list(makeSymbol("LIST"), makeKeyword("UNLOCKED"), makeKeyword("ENQUEUE"), makeSymbol("NEW-ELEMENT")), makeSymbol("LOCK-HISTORY"))), list(makeSymbol("SET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK-HISTORY"), makeSymbol("SELF"), makeSymbol("LOCK-HISTORY")), list(makeSymbol("RET"), makeSymbol("RESULT"))));









    public static final SubLSymbol ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_ENQUEUE_METHOD = makeSymbol("ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-ENQUEUE-METHOD");

    public static final SubLSymbol ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_ON_ENQUEUE_METHOD = makeSymbol("ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-ON-ENQUEUE-METHOD");

    public static final SubLList $list265 = list(list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"), NIL), list(makeSymbol("LOCK"), list(makeSymbol("GET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK"), makeSymbol("SELF"))), list(makeSymbol("LOCK-HISTORY"), list(makeSymbol("GET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK-HISTORY"), makeSymbol("SELF")))), list(makeSymbol("CPUSH"), list(makeSymbol("LIST"), makeKeyword("WAITING"), makeKeyword("REMOVE"), makeSymbol("OLD-ELEMENT")), makeSymbol("LOCK-HISTORY")), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("CPUSH"), list(makeSymbol("LIST"), makeKeyword("LOCKED"), makeKeyword("REMOVE"), makeSymbol("OLD-ELEMENT")), makeSymbol("LOCK-HISTORY")), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("REMOVE"), makeSymbol("SUPER"), makeSymbol("OLD-ELEMENT"))), list(makeSymbol("CPUSH"), list(makeSymbol("LIST"), makeKeyword("UNLOCKED"), makeKeyword("REMOVE"), makeSymbol("OLD-ELEMENT")), makeSymbol("LOCK-HISTORY")), list(makeSymbol("SET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK-HISTORY"), makeSymbol("SELF"), makeSymbol("LOCK-HISTORY"))), list(makeSymbol("SET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK-HISTORY"), makeSymbol("SELF"), makeSymbol("LOCK-HISTORY")), list(makeSymbol("RET"), makeSymbol("RESULT"))));



    public static final SubLSymbol ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_REMOVE_METHOD = makeSymbol("ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-REMOVE-METHOD");

    public static final SubLList $list268 = list(list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"), NIL), list(makeSymbol("LOCK"), list(makeSymbol("GET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK"), makeSymbol("SELF"))), list(makeSymbol("LOCK-HISTORY"), list(makeSymbol("GET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK-HISTORY"), makeSymbol("SELF")))), list(makeSymbol("CPUSH"), list(makeSymbol("LIST"), makeKeyword("WAITING"), makeKeyword("DEQUEUE")), makeSymbol("LOCK-HISTORY")), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("CPUSH"), list(makeSymbol("LIST"), makeKeyword("LOCKED"), makeKeyword("DEQUEUE")), makeSymbol("LOCK-HISTORY")), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("DEQUEUE"), makeSymbol("SUPER"))), list(makeSymbol("CPUSH"), list(makeSymbol("LIST"), makeKeyword("UNLOCKED"), makeKeyword("DEQUEUE"), makeSymbol("RESULT")), makeSymbol("LOCK-HISTORY"))), list(makeSymbol("SET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK-HISTORY"), makeSymbol("SELF"), makeSymbol("LOCK-HISTORY")), list(makeSymbol("RET"), makeSymbol("RESULT"))));



    public static final SubLSymbol ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_DEQUEUE_METHOD = makeSymbol("ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-DEQUEUE-METHOD");

    public static final SubLList $list271 = list(list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"), NIL), list(makeSymbol("LOCK"), list(makeSymbol("GET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK"), makeSymbol("SELF"))), list(makeSymbol("LOCK-HISTORY"), list(makeSymbol("GET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK-HISTORY"), makeSymbol("SELF")))), list(makeSymbol("CPUSH"), list(makeSymbol("LIST"), makeKeyword("WAITING"), makeKeyword("SET-CONTENTS"), makeSymbol("NEW-CONTENTS")), makeSymbol("LOCK-HISTORY")), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("CPUSH"), list(makeSymbol("LIST"), makeKeyword("LOCKED"), makeKeyword("SET-CONTENTS"), makeSymbol("NEW-CONTENTS")), makeSymbol("LOCK-HISTORY")), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("SET-CONTENTS"), makeSymbol("SUPER"), makeSymbol("NEW-CONTENTS"))), list(makeSymbol("CPUSH"), list(makeSymbol("LIST"), makeKeyword("UNLOCKED"), makeKeyword("SET-CONTENTS"), makeSymbol("RESULT")), makeSymbol("LOCK-HISTORY"))), list(makeSymbol("SET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK-HISTORY"), makeSymbol("SELF"), makeSymbol("LOCK-HISTORY")), list(makeSymbol("RET"), makeSymbol("RESULT"))));



    public static final SubLSymbol ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_SET_CONTENTS_METHOD = makeSymbol("ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-SET-CONTENTS-METHOD");

    public static final SubLList $list274 = list(list(makeSymbol("CLET"), list(list(makeSymbol("LOCK"), list(makeSymbol("GET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK"), makeSymbol("SELF"))), list(makeSymbol("LOCK-HISTORY"), list(makeSymbol("GET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK-HISTORY"), makeSymbol("SELF")))), list(makeSymbol("CPUSH"), list(makeSymbol("LIST"), makeKeyword("WAITING"), makeKeyword("CLEAR")), makeSymbol("LOCK-HISTORY")), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("CPUSH"), list(makeSymbol("LIST"), makeKeyword("LOCKED"), makeKeyword("CLEAR")), makeSymbol("LOCK-HISTORY")), list(makeSymbol("CLEAR"), makeSymbol("SUPER")), list(makeSymbol("CPUSH"), list(makeSymbol("LIST"), makeKeyword("UNLOCKED"), makeKeyword("CLEAR")), makeSymbol("LOCK-HISTORY"))), list(makeSymbol("SET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK-HISTORY"), makeSymbol("SELF"), makeSymbol("LOCK-HISTORY")), list(makeSymbol("RET"), NIL)));



    public static final SubLSymbol ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_CLEAR_METHOD = makeSymbol("ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-CLEAR-METHOD");

    public static final SubLSymbol BASIC_DOUBLY_LINKED_IPC_QUEUE = makeSymbol("BASIC-DOUBLY-LINKED-IPC-QUEUE");

    public static final SubLList $list278 = list(new SubLObject[]{ list(makeSymbol("BASE-NAME"), makeKeyword("CLASS"), makeKeyword("PROTECTED"), makeKeyword("VALUE"), makeString("BASIC-DOUBLY-LINKED-IPC-QUEUE")), list(makeSymbol("BASE-SUFFIX-COUNTER"), makeKeyword("CLASS"), makeKeyword("PROTECTED"), makeKeyword("VALUE"), ZERO_INTEGER), list(makeSymbol("SEMAPHORE-NAME"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("LOCK"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("SEMAPHORE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PRIORITIZER"), list(makeSymbol("NEW-PRIORITIZER")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ENQUEUE"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE"), list(makeSymbol("OLD-ELEMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEQUEUE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CONTENTS"), list(makeSymbol("NEW-CONTENTS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEAR"), NIL, makeKeyword("PUBLIC")) });









    public static final SubLString $str283$BASIC_DOUBLY_LINKED_IPC_QUEUE = makeString("BASIC-DOUBLY-LINKED-IPC-QUEUE");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_BASIC_DOUBLY_LINKED_IPC_QUEUE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-DOUBLY-LINKED-IPC-QUEUE-CLASS");

    public static final SubLSymbol $sym285$SUBLOOP_RESERVED_INITIALIZE_BASIC_DOUBLY_LINKED_IPC_QUEUE_INSTANC = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-DOUBLY-LINKED-IPC-QUEUE-INSTANCE");

    public static final SubLList $list286 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("SEMAPHORE-NAME"), list(makeSymbol("FORMAT"), NIL, makeString("~A-~S"), makeSymbol("BASE-NAME"), makeSymbol("BASE-SUFFIX-COUNTER"))), list(makeSymbol("CINC"), makeSymbol("BASE-SUFFIX-COUNTER")), list(makeSymbol("CSETQ"), makeSymbol("LOCK"), list(makeSymbol("CCONCATENATE"), makeString("Lock for Queue "), makeSymbol("SEMAPHORE-NAME"))), list(makeSymbol("CSETQ"), makeSymbol("SEMAPHORE"), list(makeSymbol("NEW-SEMAPHORE"), makeSymbol("SEMAPHORE-NAME"), ZERO_INTEGER)), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym287$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-IPC-QUEUE-METHOD");

    public static final SubLString $str288$_A__S = makeString("~A-~S");

    public static final SubLString $$$Lock_for_Queue_ = makeString("Lock for Queue ");

    public static final SubLSymbol BASIC_DOUBLY_LINKED_IPC_QUEUE_INITIALIZE_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-IPC-QUEUE-INITIALIZE-METHOD");

    public static final SubLList $list291 = list(list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"), NIL)), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("SET-PRIORITIZER"), makeSymbol("SUPER"), makeSymbol("NEW-PRIORITIZER")))), list(makeSymbol("RET"), makeSymbol("RESULT"))));

    public static final SubLSymbol $sym292$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-IPC-QUEUE-METHOD");

    public static final SubLSymbol BASIC_DOUBLY_LINKED_IPC_QUEUE_SET_PRIORITIZER_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-IPC-QUEUE-SET-PRIORITIZER-METHOD");

    public static final SubLList $list294 = list(list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"), NIL)), list(makeSymbol("V-SEMAPHORE"), makeSymbol("SEMAPHORE")), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("ENQUEUE"), makeSymbol("SUPER"), makeSymbol("NEW-ELEMENT")))), list(makeSymbol("RET"), makeSymbol("RESULT"))));

    public static final SubLSymbol $sym295$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-IPC-QUEUE-METHOD");

    public static final SubLSymbol BASIC_DOUBLY_LINKED_IPC_QUEUE_ENQUEUE_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-IPC-QUEUE-ENQUEUE-METHOD");

    public static final SubLList $list297 = list(list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"), NIL)), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("REMOVE"), makeSymbol("SUPER"), makeSymbol("OLD-ELEMENT")))), list(makeSymbol("P-SEMAPHORE"), makeSymbol("SEMAPHORE")), list(makeSymbol("RET"), makeSymbol("RESULT"))));

    public static final SubLSymbol $sym298$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-IPC-QUEUE-METHOD");

    public static final SubLSymbol BASIC_DOUBLY_LINKED_IPC_QUEUE_REMOVE_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-IPC-QUEUE-REMOVE-METHOD");

    public static final SubLList $list300 = list(list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"), NIL)), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("DEQUEUE"), makeSymbol("SUPER")))), list(makeSymbol("P-SEMAPHORE"), makeSymbol("SEMAPHORE")), list(makeSymbol("RET"), makeSymbol("RESULT"))));

    public static final SubLSymbol $sym301$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-IPC-QUEUE-METHOD");

    public static final SubLSymbol BASIC_DOUBLY_LINKED_IPC_QUEUE_DEQUEUE_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-IPC-QUEUE-DEQUEUE-METHOD");

    public static final SubLList $list303 = list(list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"), NIL)), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("SET-CONTENTS"), makeSymbol("SUPER"), makeSymbol("NEW-CONTENTS")))), list(makeSymbol("RET"), makeSymbol("RESULT"))));

    public static final SubLSymbol $sym304$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-IPC-QUEUE-METHOD");

    public static final SubLSymbol BASIC_DOUBLY_LINKED_IPC_QUEUE_SET_CONTENTS_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-IPC-QUEUE-SET-CONTENTS-METHOD");

    public static final SubLList $list306 = list(list(makeSymbol("WHILE"), list(makeSymbol("CNOT"), list(makeSymbol("EMPTY-P"), makeSymbol("SELF"))), list(makeSymbol("P-SEMAPHORE"), makeSymbol("SEMAPHORE")), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("DEQUEUE"), makeSymbol("SELF")))), list(makeSymbol("RET"), NIL));

    public static final SubLSymbol $sym307$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-IPC-QUEUE-METHOD");

    public static final SubLSymbol BASIC_DOUBLY_LINKED_IPC_QUEUE_CLEAR_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-IPC-QUEUE-CLEAR-METHOD");

    public static final SubLSymbol BASIC_IPC_QUEUE = makeSymbol("BASIC-IPC-QUEUE");

    public static final SubLList $list310 = list(new SubLObject[]{ list(makeSymbol("ACTUAL-IPC-QUEUE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("PRIORITIZER"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("IS-PASSIVE"), makeKeyword("BOOLEAN"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ACTUAL-IPC-QUEUE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ACTUAL-IPC-QUEUE"), list(makeSymbol("NEW-QUEUE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PRIORITIZER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PRIORITIZER"), list(makeSymbol("NEW-PRIORITIZER")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EMPTY-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ENQUEUE"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE"), list(makeSymbol("OLD-ELEMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEQUEUE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ELEMENT-COUNT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONTENTS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CONTENTS"), list(makeSymbol("NEW-CONTENTS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEAR"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REORDER-CONTENTS"), list(makeSymbol("ORDERED-CONTENTS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PEEK"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ENQUEUED-P"), list(makeSymbol("OBJECT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FIND"), list(makeSymbol("KEY-VALUE"), makeSymbol("&OPTIONAL"), list(makeSymbol("EQUALITY-PRED"), list(makeSymbol("FUNCTION"), EQL)), list(makeSymbol("KEY-ACCESSOR-FUNCTION"), list(makeSymbol("FUNCTION"), IDENTITY))), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PASSIVE-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PASSIVE"), list(makeSymbol("FLAG")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-ENQUEUE"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")) });



    public static final SubLSymbol BASIC_IPC_QUEUE_ON_ENQUEUE_METHOD = makeSymbol("BASIC-IPC-QUEUE-ON-ENQUEUE-METHOD");

    public static final SubLSymbol BASIC_IPC_QUEUE_PRINT_METHOD = makeSymbol("BASIC-IPC-QUEUE-PRINT-METHOD");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_BASIC_IPC_QUEUE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-IPC-QUEUE-CLASS");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_BASIC_IPC_QUEUE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-IPC-QUEUE-INSTANCE");

    public static final SubLList $list316 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("ACTUAL-IPC-QUEUE"), list(makeSymbol("NEW-IPC-QUEUE"), list(makeSymbol("FORMAT-TO-STRING"), makeKeyword("A"), makeString("BASIC-IPC-QUEUE-"), makeKeyword("D"), makeSymbol("INSTANCE-NUMBER")))), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym317$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-IPC-QUEUE-METHOD");

    public static final SubLString $str318$BASIC_IPC_QUEUE_ = makeString("BASIC-IPC-QUEUE-");

    public static final SubLSymbol BASIC_IPC_QUEUE_INITIALIZE_METHOD = makeSymbol("BASIC-IPC-QUEUE-INITIALIZE-METHOD");

    public static final SubLSymbol GET_ACTUAL_IPC_QUEUE = makeSymbol("GET-ACTUAL-IPC-QUEUE");

    public static final SubLList $list321 = list(list(makeSymbol("RET"), makeSymbol("ACTUAL-IPC-QUEUE")));

    public static final SubLSymbol BASIC_IPC_QUEUE_GET_ACTUAL_IPC_QUEUE_METHOD = makeSymbol("BASIC-IPC-QUEUE-GET-ACTUAL-IPC-QUEUE-METHOD");

    public static final SubLSymbol SET_ACTUAL_IPC_QUEUE = makeSymbol("SET-ACTUAL-IPC-QUEUE");

    public static final SubLList $list324 = list(makeSymbol("NEW-QUEUE"));

    public static final SubLList $list325 = list(list(makeSymbol("MUST"), list(makeSymbol("IPC-QUEUE-P"), makeSymbol("NEW-QUEUE")), makeString("(SET-ACTUAL-IPC-QUEUE ~S): ~S is not an instance of the IPC-QUEUE struct."), makeSymbol("SELF"), makeSymbol("NEW-QUEUE")), list(makeSymbol("CSETQ"), makeSymbol("ACTUAL-IPC-QUEUE"), makeSymbol("NEW-QUEUE")), list(makeSymbol("RET"), makeSymbol("NEW-QUEUE")));

    public static final SubLSymbol $sym326$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-IPC-QUEUE-METHOD");

    public static final SubLString $str327$_SET_ACTUAL_IPC_QUEUE__S____S_is_ = makeString("(SET-ACTUAL-IPC-QUEUE ~S): ~S is not an instance of the IPC-QUEUE struct.");

    public static final SubLSymbol BASIC_IPC_QUEUE_SET_ACTUAL_IPC_QUEUE_METHOD = makeSymbol("BASIC-IPC-QUEUE-SET-ACTUAL-IPC-QUEUE-METHOD");

    public static final SubLSymbol $sym329$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-IPC-QUEUE-METHOD");

    public static final SubLSymbol BASIC_IPC_QUEUE_GET_PRIORITIZER_METHOD = makeSymbol("BASIC-IPC-QUEUE-GET-PRIORITIZER-METHOD");

    public static final SubLSymbol $sym331$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-IPC-QUEUE-METHOD");

    public static final SubLSymbol BASIC_IPC_QUEUE_SET_PRIORITIZER_METHOD = makeSymbol("BASIC-IPC-QUEUE-SET-PRIORITIZER-METHOD");

    public static final SubLList $list333 = list(list(makeSymbol("RET"), list(makeSymbol("ZEROP"), list(makeSymbol("IPC-CURRENT-QUEUE-SIZE"), makeSymbol("ACTUAL-IPC-QUEUE")))));

    public static final SubLSymbol BASIC_IPC_QUEUE_EMPTY_P_METHOD = makeSymbol("BASIC-IPC-QUEUE-EMPTY-P-METHOD");

    public static final SubLList $list335 = list(list(makeSymbol("IPC-ENQUEUE"), makeSymbol("NEW-ELEMENT"), makeSymbol("ACTUAL-IPC-QUEUE")), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), makeSymbol("IS-PASSIVE")), list(makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), makeSymbol("NEW-ELEMENT"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("NEW-ELEMENT"), list(makeSymbol("QUOTE"), makeSymbol("ENQUEUE-NOTIFY")), makeSymbol("SELF"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("ON-ENQUEUE")), makeSymbol("NEW-ELEMENT")), list(makeSymbol("RET"), makeSymbol("NEW-ELEMENT")));

    public static final SubLSymbol BASIC_IPC_QUEUE_ENQUEUE_METHOD = makeSymbol("BASIC-IPC-QUEUE-ENQUEUE-METHOD");

    public static final SubLList $list337 = list(list(makeSymbol("ERROR"), makeString("Invalid operation: Cannot remove arbitrary item from IPC queue.")), list(makeSymbol("RET"), makeSymbol("OLD-ELEMENT")));

    public static final SubLString $str338$Invalid_operation__Cannot_remove_ = makeString("Invalid operation: Cannot remove arbitrary item from IPC queue.");

    public static final SubLSymbol BASIC_IPC_QUEUE_REMOVE_METHOD = makeSymbol("BASIC-IPC-QUEUE-REMOVE-METHOD");

    public static final SubLList $list340 = list(list(makeSymbol("CLET"), list(list(makeSymbol("DEQUEUED-ITEM"), list(makeSymbol("IPC-DEQUEUE"), makeSymbol("ACTUAL-IPC-QUEUE")))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), makeSymbol("IS-PASSIVE")), list(makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), makeSymbol("DEQUEUED-ITEM"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("DEQUEUED-ITEM"), list(makeSymbol("QUOTE"), makeSymbol("DEQUEUE-NOTIFY")), makeSymbol("SELF"))), list(makeSymbol("RET"), makeSymbol("DEQUEUED-ITEM"))));

    public static final SubLSymbol $sym341$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-IPC-QUEUE-METHOD");

    public static final SubLSymbol BASIC_IPC_QUEUE_DEQUEUE_METHOD = makeSymbol("BASIC-IPC-QUEUE-DEQUEUE-METHOD");

    public static final SubLList $list343 = list(list(makeSymbol("RET"), list(makeSymbol("IPC-CURRENT-QUEUE-SIZE"), makeSymbol("ACTUAL-IPC-QUEUE"))));

    public static final SubLSymbol $sym344$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-IPC-QUEUE-METHOD");

    public static final SubLSymbol BASIC_IPC_QUEUE_GET_ELEMENT_COUNT_METHOD = makeSymbol("BASIC-IPC-QUEUE-GET-ELEMENT-COUNT-METHOD");

    public static final SubLList $list346 = list(list(makeSymbol("RET"), list(makeSymbol("IPC-CURRENT-QUEUE-CONTENT"), makeSymbol("ACTUAL-IPC-QUEUE"))));

    public static final SubLSymbol BASIC_IPC_QUEUE_GET_CONTENTS_METHOD = makeSymbol("BASIC-IPC-QUEUE-GET-CONTENTS-METHOD");

    public static final SubLList $list348 = list(list(makeSymbol("MUST"), list(makeSymbol("LISTP"), makeSymbol("NEW-CONTENTS")), makeString("(SET-CONTENTS ~S): ~S is not a valid list."), makeSymbol("SELF")), list(makeSymbol("CLEAR"), makeSymbol("SELF")), list(makeSymbol("CDOLIST"), list(makeSymbol("ELEMENT"), makeSymbol("NEW-CONTENTS")), list(makeSymbol("ENQUEUE"), makeSymbol("SELF"), makeSymbol("ELEMENT"))), list(makeSymbol("RET"), makeSymbol("NEW-CONTENTS")));

    public static final SubLString $str349$_SET_CONTENTS__S____S_is_not_a_va = makeString("(SET-CONTENTS ~S): ~S is not a valid list.");

    public static final SubLSymbol BASIC_IPC_QUEUE_SET_CONTENTS_METHOD = makeSymbol("BASIC-IPC-QUEUE-SET-CONTENTS-METHOD");

    public static final SubLList $list351 = list(list(makeSymbol("CLET"), list(list(makeSymbol("ELEMENT-COUNT"), list(makeSymbol("GET-ELEMENT-COUNT"), makeSymbol("SELF")))), list(makeSymbol("CDOTIMES"), list(makeSymbol("I"), makeSymbol("ELEMENT-COUNT")), list(makeSymbol("DEQUEUE"), makeSymbol("SELF")))), list(makeSymbol("RET"), NIL));

    public static final SubLSymbol BASIC_IPC_QUEUE_CLEAR_METHOD = makeSymbol("BASIC-IPC-QUEUE-CLEAR-METHOD");

    public static final SubLList $list353 = list(list(makeSymbol("RET"), makeSymbol("ORDERED-CONTENTS")));

    public static final SubLSymbol BASIC_IPC_QUEUE_REORDER_CONTENTS_METHOD = makeSymbol("BASIC-IPC-QUEUE-REORDER-CONTENTS-METHOD");

    public static final SubLList $list355 = list(list(makeSymbol("RET"), list(makeSymbol("FIRST"), list(makeSymbol("IPC-CURRENT-QUEUE-CONTENT"), makeSymbol("ACTUAL-IPC-QUEUE")))));

    public static final SubLSymbol $sym356$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-IPC-QUEUE-METHOD");

    public static final SubLSymbol BASIC_IPC_QUEUE_PEEK_METHOD = makeSymbol("BASIC-IPC-QUEUE-PEEK-METHOD");

    public static final SubLList $list358 = list(list(makeSymbol("RET"), list(makeSymbol("FIF"), list(makeSymbol("FIND"), makeSymbol("OBJECT"), list(makeSymbol("IPC-CURRENT-QUEUE-CONTENT"), makeSymbol("ACTUAL-IPC-QUEUE"))), T, NIL)));

    public static final SubLSymbol $sym359$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-IPC-QUEUE-METHOD");

    public static final SubLSymbol BASIC_IPC_QUEUE_ENQUEUED_P_METHOD = makeSymbol("BASIC-IPC-QUEUE-ENQUEUED-P-METHOD");

    public static final SubLList $list361 = list(list(makeSymbol("RET"), list(makeSymbol("FIND"), makeSymbol("KEY-VALUE"), list(makeSymbol("IPC-CURRENT-QUEUE-CONTENT"), makeSymbol("ACTUAL-IPC-QUEUE")), makeSymbol("EQUALITY-PRED"), makeSymbol("KEY-ACCESSOR-FUNCTION"))));

    public static final SubLSymbol $sym362$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-IPC-QUEUE-METHOD");

    public static final SubLSymbol BASIC_IPC_QUEUE_FIND_METHOD = makeSymbol("BASIC-IPC-QUEUE-FIND-METHOD");

    public static final SubLSymbol BASIC_IPC_QUEUE_PASSIVE_P_METHOD = makeSymbol("BASIC-IPC-QUEUE-PASSIVE-P-METHOD");

    public static final SubLSymbol $sym365$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-IPC-QUEUE-METHOD");

    public static final SubLSymbol BASIC_IPC_QUEUE_SET_PASSIVE_METHOD = makeSymbol("BASIC-IPC-QUEUE-SET-PASSIVE-METHOD");

    public static final SubLString $str367$QUEUE_INTERFACE_GET_PRIORITIZER__ = makeString("QUEUE-INTERFACE-GET-PRIORITIZER: ~S is not an instance of QUEUE-INTERFACE.");

    public static final SubLString $str368$QUEUE_INTERFACE_SET_PRIORITIZER__ = makeString("QUEUE-INTERFACE-SET-PRIORITIZER: ~S is not an instance of QUEUE-INTERFACE.");

    public static final SubLString $str369$QUEUE_INTERFACE_EMPTY_P___S_is_no = makeString("QUEUE-INTERFACE-EMPTY-P: ~S is not an instance of QUEUE-INTERFACE.");

    public static final SubLString $str370$QUEUE_INTERFACE_ENQUEUE___S_is_no = makeString("QUEUE-INTERFACE-ENQUEUE: ~S is not an instance of QUEUE-INTERFACE.");

    public static final SubLString $str371$QUEUE_INTERFACE_REMOVE___S_is_not = makeString("QUEUE-INTERFACE-REMOVE: ~S is not an instance of QUEUE-INTERFACE.");

    public static final SubLString $str372$QUEUE_INTERFACE_DEQUEUE___S_is_no = makeString("QUEUE-INTERFACE-DEQUEUE: ~S is not an instance of QUEUE-INTERFACE.");

    public static final SubLString $str373$QUEUE_INTERFACE_GET_ELEMENT_COUNT = makeString("QUEUE-INTERFACE-GET-ELEMENT-COUNT: ~S is not an instance of QUEUE-INTERFACE.");

    public static final SubLString $str374$QUEUE_INTERFACE_GET_CONTENTS___S_ = makeString("QUEUE-INTERFACE-GET-CONTENTS: ~S is not an instance of QUEUE-INTERFACE.");

    public static final SubLString $str375$QUEUE_INTERFACE_SET_CONTENTS___S_ = makeString("QUEUE-INTERFACE-SET-CONTENTS: ~S is not an instance of QUEUE-INTERFACE.");

    public static final SubLString $str376$QUEUE_INTERFACE_CLEAR___S_is_not_ = makeString("QUEUE-INTERFACE-CLEAR: ~S is not an instance of QUEUE-INTERFACE.");

    public static final SubLString $str377$QUEUE_INTERFACE_REORDER_CONTENTS_ = makeString("QUEUE-INTERFACE-REORDER-CONTENTS: ~S is not an instance of QUEUE-INTERFACE.");

    public static SubLObject queue_element_interface_p(final SubLObject queue_element_interface) {
        return interfaces.subloop_instanceof_interface(queue_element_interface, QUEUE_ELEMENT_INTERFACE);
    }

    public static SubLObject queue_prioritizer_interface_p(final SubLObject queue_prioritizer_interface) {
        return interfaces.subloop_instanceof_interface(queue_prioritizer_interface, QUEUE_PRIORITIZER_INTERFACE);
    }

    public static SubLObject queue_prioritizer_template_p(final SubLObject queue_prioritizer_template) {
        return interfaces.subloop_instanceof_interface(queue_prioritizer_template, QUEUE_PRIORITIZER_TEMPLATE);
    }

    public static SubLObject queue_simple_sorter_template_p(final SubLObject queue_simple_sorter_template) {
        return interfaces.subloop_instanceof_interface(queue_simple_sorter_template, QUEUE_SIMPLE_SORTER_TEMPLATE);
    }

    public static SubLObject get_basic_queue_simple_sorter_element_key_function(final SubLObject basic_queue_simple_sorter) {
        return classes.subloop_get_access_protected_instance_slot(basic_queue_simple_sorter, TWO_INTEGER, ELEMENT_KEY_FUNCTION);
    }

    public static SubLObject set_basic_queue_simple_sorter_element_key_function(final SubLObject basic_queue_simple_sorter, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_queue_simple_sorter, value, TWO_INTEGER, ELEMENT_KEY_FUNCTION);
    }

    public static SubLObject get_basic_queue_simple_sorter_sort_predicate(final SubLObject basic_queue_simple_sorter) {
        return classes.subloop_get_access_protected_instance_slot(basic_queue_simple_sorter, ONE_INTEGER, SORT_PREDICATE);
    }

    public static SubLObject set_basic_queue_simple_sorter_sort_predicate(final SubLObject basic_queue_simple_sorter, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_queue_simple_sorter, value, ONE_INTEGER, SORT_PREDICATE);
    }

    public static SubLObject basic_queue_simple_sorter_order_queue_internal_method(final SubLObject self, final SubLObject contents) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject template_predicate = basic_queue_simple_sorter_get_sort_predicate_method(self);
        SubLObject template_key_function = basic_queue_simple_sorter_get_element_key_method(self);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == template_predicate)) {
            Errors.error($str26$_ORDER_QUEUE_INTERNAL__S___No_ord, self);
        }
        if (NIL == template_key_function) {
            template_key_function = symbol_function(IDENTITY);
        }
        return Sort.sort(contents, template_predicate, template_key_function);
    }

    public static SubLObject basic_queue_simple_sorter_order_queue_method(final SubLObject self, final SubLObject queue) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == queue_interface_p(queue))) {
            Errors.error($str28$_ORDER_QUEUE__S____S_is_not_an_in, self, queue);
        }
        final SubLObject template_contents = queue_interface_get_contents(queue);
        if (NIL != template_contents) {
            final SubLObject template_contents_ordered = basic_queue_simple_sorter_order_queue_internal_method(self, template_contents);
            queue_interface_reorder_contents(queue, template_contents_ordered);
        }
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_basic_queue_simple_sorter_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_basic_queue_simple_sorter_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_QUEUE_SIMPLE_SORTER, SORT_PREDICATE, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_QUEUE_SIMPLE_SORTER, ELEMENT_KEY_FUNCTION, NIL);
        return NIL;
    }

    public static SubLObject basic_queue_simple_sorter_p(final SubLObject basic_queue_simple_sorter) {
        return classes.subloop_instanceof_class(basic_queue_simple_sorter, BASIC_QUEUE_SIMPLE_SORTER);
    }

    public static SubLObject basic_queue_simple_sorter_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_queue_simple_sorter_method = NIL;
        SubLObject element_key_function = get_basic_queue_simple_sorter_element_key_function(self);
        SubLObject sort_predicate = get_basic_queue_simple_sorter_sort_predicate(self);
        try {
            thread.throwStack.push($sym37$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD);
            try {
                object.object_initialize_method(self);
                sort_predicate = NIL;
                element_key_function = NIL;
                sublisp_throw($sym37$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_queue_simple_sorter_element_key_function(self, element_key_function);
                    set_basic_queue_simple_sorter_sort_predicate(self, sort_predicate);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_queue_simple_sorter_method = Errors.handleThrowable(ccatch_env_var, $sym37$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_queue_simple_sorter_method;
    }

    public static SubLObject basic_queue_simple_sorter_get_sort_predicate_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_queue_simple_sorter_method = NIL;
        final SubLObject sort_predicate = get_basic_queue_simple_sorter_sort_predicate(self);
        try {
            thread.throwStack.push($sym41$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD);
            try {
                sublisp_throw($sym41$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD, sort_predicate);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_queue_simple_sorter_sort_predicate(self, sort_predicate);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_queue_simple_sorter_method = Errors.handleThrowable(ccatch_env_var, $sym41$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_queue_simple_sorter_method;
    }

    public static SubLObject basic_queue_simple_sorter_set_sort_predicate_method(final SubLObject self, final SubLObject new_predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_queue_simple_sorter_method = NIL;
        SubLObject sort_predicate = get_basic_queue_simple_sorter_sort_predicate(self);
        try {
            thread.throwStack.push($sym46$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD);
            try {
                sort_predicate = new_predicate;
                sublisp_throw($sym46$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD, new_predicate);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_queue_simple_sorter_sort_predicate(self, sort_predicate);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_queue_simple_sorter_method = Errors.handleThrowable(ccatch_env_var, $sym46$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_queue_simple_sorter_method;
    }

    public static SubLObject basic_queue_simple_sorter_get_element_key_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_queue_simple_sorter_method = NIL;
        final SubLObject element_key_function = get_basic_queue_simple_sorter_element_key_function(self);
        try {
            thread.throwStack.push($sym50$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD);
            try {
                sublisp_throw($sym50$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD, element_key_function);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_queue_simple_sorter_element_key_function(self, element_key_function);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_queue_simple_sorter_method = Errors.handleThrowable(ccatch_env_var, $sym50$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_queue_simple_sorter_method;
    }

    public static SubLObject basic_queue_simple_sorter_set_element_key_method(final SubLObject self, final SubLObject new_key_function) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_queue_simple_sorter_method = NIL;
        SubLObject element_key_function = get_basic_queue_simple_sorter_element_key_function(self);
        try {
            thread.throwStack.push($sym55$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD);
            try {
                element_key_function = new_key_function;
                sublisp_throw($sym55$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD, new_key_function);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_queue_simple_sorter_element_key_function(self, element_key_function);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_queue_simple_sorter_method = Errors.handleThrowable(ccatch_env_var, $sym55$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_queue_simple_sorter_method;
    }

    public static SubLObject queue_interface_p(final SubLObject queue_interface) {
        return interfaces.subloop_instanceof_interface(queue_interface, QUEUE_INTERFACE);
    }

    public static SubLObject end_pointer_queue_template_p(final SubLObject end_pointer_queue_template) {
        return interfaces.subloop_instanceof_interface(end_pointer_queue_template, END_POINTER_QUEUE_TEMPLATE);
    }

    public static SubLObject get_basic_queue_prioritizer(final SubLObject basic_queue) {
        return classes.subloop_get_access_protected_instance_slot(basic_queue, THREE_INTEGER, PRIORITIZER);
    }

    public static SubLObject set_basic_queue_prioritizer(final SubLObject basic_queue, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_queue, value, THREE_INTEGER, PRIORITIZER);
    }

    public static SubLObject get_basic_queue_last_cons(final SubLObject basic_queue) {
        return classes.subloop_get_access_protected_instance_slot(basic_queue, TWO_INTEGER, LAST_CONS);
    }

    public static SubLObject set_basic_queue_last_cons(final SubLObject basic_queue, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_queue, value, TWO_INTEGER, LAST_CONS);
    }

    public static SubLObject get_basic_queue_first_cons(final SubLObject basic_queue) {
        return classes.subloop_get_access_protected_instance_slot(basic_queue, ONE_INTEGER, FIRST_CONS);
    }

    public static SubLObject set_basic_queue_first_cons(final SubLObject basic_queue, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_queue, value, ONE_INTEGER, FIRST_CONS);
    }

    public static SubLObject get_basic_queue_is_passive(final SubLObject basic_queue) {
        final SubLObject v_class = subloop_structures.instance_class(basic_queue);
        final SubLObject slot = slots.slot_assoc(IS_PASSIVE, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
        instances.instances_access_check_instance_slot(v_class, basic_queue, slot);
        return classes.ldb_test($int$4097, subloop_structures.instance_boolean_slots(basic_queue));
    }

    public static SubLObject set_basic_queue_is_passive(final SubLObject basic_queue, final SubLObject value) {
        final SubLObject v_class = subloop_structures.instance_class(basic_queue);
        final SubLObject slot = slots.slot_assoc(IS_PASSIVE, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
        instances.instances_access_check_instance_slot(v_class, basic_queue, slot);
        subloop_structures._csetf_instance_boolean_slots(basic_queue, bytes.dpb(NIL != value ? ONE_INTEGER : ZERO_INTEGER, $int$4097, subloop_structures.instance_boolean_slots(basic_queue)));
        return value;
    }

    public static SubLObject basic_queue_enqueued_p_method(final SubLObject self, final SubLObject v_object) {
        final SubLObject template_contents = basic_queue_get_first_cons_method(self);
        if (NIL != member(v_object, template_contents, symbol_function(EQUAL), UNPROVIDED)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject basic_queue_peek_method(final SubLObject self) {
        final SubLObject template_contents = basic_queue_get_first_cons_method(self);
        if (NIL == template_contents) {
            return NIL;
        }
        return template_contents.first();
    }

    public static SubLObject basic_queue_reorder_contents_method(final SubLObject self, final SubLObject ordered_contents) {
        return basic_queue_set_contents_method(self, ordered_contents);
    }

    public static SubLObject basic_queue_clear_method(final SubLObject self) {
        basic_queue_set_first_cons_method(self, NIL);
        basic_queue_set_end_pointer_method(self, NIL);
        return NIL;
    }

    public static SubLObject basic_queue_set_contents_method(final SubLObject self, final SubLObject new_contents) {
        final SubLObject template_contents = copy_list(new_contents);
        if (NIL != template_contents) {
            basic_queue_set_first_cons_method(self, template_contents);
            basic_queue_set_end_pointer_method(self, last(template_contents, UNPROVIDED));
        } else {
            basic_queue_set_first_cons_method(self, NIL);
            basic_queue_set_end_pointer_method(self, NIL);
        }
        return new_contents;
    }

    public static SubLObject basic_queue_get_contents_method(final SubLObject self) {
        return basic_queue_get_first_cons_method(self);
    }

    public static SubLObject basic_queue_get_element_count_method(final SubLObject self) {
        return length(basic_queue_get_first_cons_method(self));
    }

    public static SubLObject basic_queue_find_method(final SubLObject self, final SubLObject key_value, SubLObject equality_pred, SubLObject key_accessor_function) {
        if (equality_pred == UNPROVIDED) {
            equality_pred = symbol_function(EQL);
        }
        if (key_accessor_function == UNPROVIDED) {
            key_accessor_function = symbol_function(IDENTITY);
        }
        final SubLObject template_contents = basic_queue_get_first_cons_method(self);
        if (NIL != template_contents) {
            final SubLObject template_item = member(key_value, template_contents, equality_pred, key_accessor_function);
            if (NIL != template_item) {
                return template_item;
            }
        }
        return NIL;
    }

    public static SubLObject basic_queue_dequeue_method(final SubLObject self) {
        final SubLObject template_prioritizer = basic_queue_get_prioritizer_method(self);
        if (NIL != template_prioritizer) {
            methods.funcall_instance_method_with_1_args(template_prioritizer, ORDER_QUEUE, self);
        }
        final SubLObject template_contents = basic_queue_get_first_cons_method(self);
        if (NIL == template_contents) {
            return NIL;
        }
        if (NIL == template_contents.rest()) {
            basic_queue_set_first_cons_method(self, NIL);
            basic_queue_set_end_pointer_method(self, NIL);
            final SubLObject template_result = template_contents.first();
            if ((NIL == basic_queue_passive_p_method(self)) && (NIL != queue_element_interface_p(template_result))) {
                methods.funcall_instance_method_with_1_args(template_result, DEQUEUE_NOTIFY, self);
            }
            return template_result;
        }
        basic_queue_set_first_cons_method(self, template_contents.rest());
        final SubLObject template_result = template_contents.first();
        if ((NIL == basic_queue_passive_p_method(self)) && (NIL != queue_element_interface_p(template_result))) {
            methods.funcall_instance_method_with_1_args(template_result, DEQUEUE_NOTIFY, self);
        }
        return template_result;
    }

    public static SubLObject basic_queue_remove_method(final SubLObject self, final SubLObject old_element) {
        final SubLObject template_contents = basic_queue_get_first_cons_method(self);
        final SubLObject template_end_pointer = basic_queue_get_end_pointer_method(self);
        if (NIL == template_contents) {
            return NIL;
        }
        if (old_element.eql(template_contents.first())) {
            if (template_contents.eql(template_end_pointer)) {
                basic_queue_set_first_cons_method(self, NIL);
                basic_queue_set_end_pointer_method(self, NIL);
                if ((NIL == basic_queue_passive_p_method(self)) && (NIL != queue_element_interface_p(old_element))) {
                    methods.funcall_instance_method_with_1_args(old_element, REMOVE_NOTIFY, self);
                }
                return old_element;
            }
            basic_queue_set_first_cons_method(self, template_contents.rest());
            if ((NIL == basic_queue_passive_p_method(self)) && (NIL != queue_element_interface_p(old_element))) {
                methods.funcall_instance_method_with_1_args(old_element, REMOVE_NOTIFY, self);
            }
            return old_element;
        } else {
            SubLObject template_current_cons;
            for (template_current_cons = template_contents; !template_current_cons.rest().eql(template_end_pointer); template_current_cons = template_current_cons.rest()) {
                if (old_element.eql(cadr(template_current_cons))) {
                    rplacd(template_current_cons, cddr(template_current_cons));
                    if ((NIL == basic_queue_passive_p_method(self)) && (NIL != queue_element_interface_p(old_element))) {
                        methods.funcall_instance_method_with_1_args(old_element, REMOVE_NOTIFY, self);
                    }
                    return old_element;
                }
            }
            if (old_element.eql(cadr(template_current_cons))) {
                rplacd(template_current_cons, NIL);
                basic_queue_set_end_pointer_method(self, template_current_cons);
                if ((NIL == basic_queue_passive_p_method(self)) && (NIL != queue_element_interface_p(old_element))) {
                    methods.funcall_instance_method_with_1_args(old_element, REMOVE_NOTIFY, self);
                }
                return old_element;
            }
            if ((NIL == basic_queue_passive_p_method(self)) && (NIL != queue_element_interface_p(old_element))) {
                methods.funcall_instance_method_with_1_args(old_element, REMOVE_NOTIFY, self);
            }
            return old_element;
        }
    }

    public static SubLObject basic_queue_on_enqueue_method(final SubLObject self, final SubLObject new_element) {
        return NIL;
    }

    public static SubLObject basic_queue_enqueue_method(final SubLObject self, final SubLObject new_element) {
        SubLObject template_contents = basic_queue_get_first_cons_method(self);
        SubLObject template_end_pointer = basic_queue_get_end_pointer_method(self);
        if (NIL == template_contents) {
            template_contents = template_end_pointer = list(new_element);
        } else {
            rplacd(template_end_pointer, list(new_element));
            template_end_pointer = template_end_pointer.rest();
        }
        basic_queue_set_first_cons_method(self, template_contents);
        basic_queue_set_end_pointer_method(self, template_end_pointer);
        if ((NIL == basic_queue_passive_p_method(self)) && (NIL != queue_element_interface_p(new_element))) {
            methods.funcall_instance_method_with_1_args(new_element, ENQUEUE_NOTIFY, self);
        }
        methods.funcall_instance_method_with_1_args(self, ON_ENQUEUE, new_element);
        return new_element;
    }

    public static SubLObject basic_queue_empty_p_method(final SubLObject self) {
        return sublisp_null(basic_queue_get_first_cons_method(self));
    }

    public static SubLObject basic_queue_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLObject template_contents = basic_queue_get_contents_method(self);
        if (NIL == template_contents) {
            format(stream, $str122$QUEUE___);
        } else
            if (NIL == template_contents.rest()) {
                format(stream, $str123$QUEUE___S_, template_contents.first());
            } else {
                format(stream, $str124$QUEUE___S, template_contents.first());
                SubLObject cdolist_list_var = template_contents.rest();
                SubLObject element = NIL;
                element = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    format(stream, $str125$___S, element);
                    cdolist_list_var = cdolist_list_var.rest();
                    element = cdolist_list_var.first();
                } 
                format(stream, $str126$_);
            }

        return self;
    }

    public static SubLObject subloop_reserved_initialize_basic_queue_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_basic_queue_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_QUEUE, IS_PASSIVE, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_QUEUE, FIRST_CONS, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_QUEUE, LAST_CONS, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_QUEUE, PRIORITIZER, NIL);
        return NIL;
    }

    public static SubLObject basic_queue_p(final SubLObject basic_queue) {
        return classes.subloop_instanceof_class(basic_queue, BASIC_QUEUE);
    }

    public static SubLObject basic_queue_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_queue_method = NIL;
        SubLObject prioritizer = get_basic_queue_prioritizer(self);
        SubLObject last_cons = get_basic_queue_last_cons(self);
        SubLObject first_cons = get_basic_queue_first_cons(self);
        SubLObject is_passive = get_basic_queue_is_passive(self);
        try {
            thread.throwStack.push($sym131$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD);
            try {
                object.object_initialize_method(self);
                first_cons = NIL;
                last_cons = NIL;
                prioritizer = NIL;
                is_passive = NIL;
                sublisp_throw($sym131$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_queue_prioritizer(self, prioritizer);
                    set_basic_queue_last_cons(self, last_cons);
                    set_basic_queue_first_cons(self, first_cons);
                    set_basic_queue_is_passive(self, is_passive);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_queue_method = Errors.handleThrowable(ccatch_env_var, $sym131$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_queue_method;
    }

    public static SubLObject basic_queue_get_first_cons_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_queue_method = NIL;
        final SubLObject first_cons = get_basic_queue_first_cons(self);
        try {
            thread.throwStack.push($sym135$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD);
            try {
                sublisp_throw($sym135$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD, first_cons);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_queue_first_cons(self, first_cons);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_queue_method = Errors.handleThrowable(ccatch_env_var, $sym135$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_queue_method;
    }

    public static SubLObject basic_queue_set_first_cons_method(final SubLObject self, final SubLObject new_cons) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_queue_method = NIL;
        SubLObject first_cons = get_basic_queue_first_cons(self);
        try {
            thread.throwStack.push($sym140$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD);
            try {
                first_cons = new_cons;
                sublisp_throw($sym140$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD, new_cons);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_queue_first_cons(self, first_cons);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_queue_method = Errors.handleThrowable(ccatch_env_var, $sym140$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_queue_method;
    }

    public static SubLObject basic_queue_get_end_pointer_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_queue_method = NIL;
        final SubLObject last_cons = get_basic_queue_last_cons(self);
        try {
            thread.throwStack.push($sym144$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD);
            try {
                sublisp_throw($sym144$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD, last_cons);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_queue_last_cons(self, last_cons);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_queue_method = Errors.handleThrowable(ccatch_env_var, $sym144$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_queue_method;
    }

    public static SubLObject basic_queue_set_end_pointer_method(final SubLObject self, final SubLObject new_end_pointer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_queue_method = NIL;
        SubLObject last_cons = get_basic_queue_last_cons(self);
        try {
            thread.throwStack.push($sym149$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD);
            try {
                last_cons = new_end_pointer;
                sublisp_throw($sym149$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD, new_end_pointer);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_queue_last_cons(self, last_cons);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_queue_method = Errors.handleThrowable(ccatch_env_var, $sym149$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_queue_method;
    }

    public static SubLObject basic_queue_get_prioritizer_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_queue_method = NIL;
        final SubLObject prioritizer = get_basic_queue_prioritizer(self);
        try {
            thread.throwStack.push($sym153$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD);
            try {
                sublisp_throw($sym153$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD, prioritizer);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_queue_prioritizer(self, prioritizer);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_queue_method = Errors.handleThrowable(ccatch_env_var, $sym153$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_queue_method;
    }

    public static SubLObject basic_queue_set_prioritizer_method(final SubLObject self, final SubLObject new_prioritizer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_queue_method = NIL;
        SubLObject prioritizer = get_basic_queue_prioritizer(self);
        try {
            thread.throwStack.push($sym158$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD);
            try {
                if (((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != new_prioritizer)) && (NIL == queue_prioritizer_interface_p(new_prioritizer))) {
                    Errors.error($str159$_SET_PRIORITIZER__S____S_is_not_a, self, new_prioritizer);
                }
                prioritizer = new_prioritizer;
                sublisp_throw($sym158$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD, new_prioritizer);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_queue_prioritizer(self, prioritizer);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_queue_method = Errors.handleThrowable(ccatch_env_var, $sym158$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_queue_method;
    }

    public static SubLObject basic_queue_passive_p_method(final SubLObject self) {
        final SubLObject is_passive = get_basic_queue_is_passive(self);
        return is_passive;
    }

    public static SubLObject basic_queue_set_passive_method(final SubLObject self, final SubLObject flag) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_queue_method = NIL;
        SubLObject is_passive = get_basic_queue_is_passive(self);
        try {
            thread.throwStack.push($sym168$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD);
            try {
                is_passive = flag;
                sublisp_throw($sym168$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD, flag);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_queue_is_passive(self, is_passive);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_queue_method = Errors.handleThrowable(ccatch_env_var, $sym168$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_queue_method;
    }

    public static SubLObject doubly_linked_queue_template_p(final SubLObject doubly_linked_queue_template) {
        return interfaces.subloop_instanceof_interface(doubly_linked_queue_template, DOUBLY_LINKED_QUEUE_TEMPLATE);
    }

    public static SubLObject get_basic_doubly_linked_queue_prioritizer(final SubLObject basic_doubly_linked_queue) {
        return classes.subloop_get_access_protected_instance_slot(basic_doubly_linked_queue, TWO_INTEGER, PRIORITIZER);
    }

    public static SubLObject set_basic_doubly_linked_queue_prioritizer(final SubLObject basic_doubly_linked_queue, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_doubly_linked_queue, value, TWO_INTEGER, PRIORITIZER);
    }

    public static SubLObject get_basic_doubly_linked_queue_list(final SubLObject basic_doubly_linked_queue) {
        return classes.subloop_get_access_protected_instance_slot(basic_doubly_linked_queue, ONE_INTEGER, LIST);
    }

    public static SubLObject set_basic_doubly_linked_queue_list(final SubLObject basic_doubly_linked_queue, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_doubly_linked_queue, value, ONE_INTEGER, LIST);
    }

    public static SubLObject get_basic_doubly_linked_queue_is_passive(final SubLObject basic_doubly_linked_queue) {
        final SubLObject v_class = subloop_structures.instance_class(basic_doubly_linked_queue);
        final SubLObject slot = slots.slot_assoc(IS_PASSIVE, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
        instances.instances_access_check_instance_slot(v_class, basic_doubly_linked_queue, slot);
        return classes.ldb_test($int$4097, subloop_structures.instance_boolean_slots(basic_doubly_linked_queue));
    }

    public static SubLObject set_basic_doubly_linked_queue_is_passive(final SubLObject basic_doubly_linked_queue, final SubLObject value) {
        final SubLObject v_class = subloop_structures.instance_class(basic_doubly_linked_queue);
        final SubLObject slot = slots.slot_assoc(IS_PASSIVE, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
        instances.instances_access_check_instance_slot(v_class, basic_doubly_linked_queue, slot);
        subloop_structures._csetf_instance_boolean_slots(basic_doubly_linked_queue, bytes.dpb(NIL != value ? ONE_INTEGER : ZERO_INTEGER, $int$4097, subloop_structures.instance_boolean_slots(basic_doubly_linked_queue)));
        return value;
    }

    public static SubLObject basic_doubly_linked_queue_enqueued_p_method(final SubLObject self, final SubLObject v_object) {
        final SubLObject template_list = basic_doubly_linked_queue_get_list_internal_method(self);
        if (NIL == template_list) {
            return NIL;
        }
        return subloop_collections.basic_doubly_linked_list_member_p_method(template_list, v_object);
    }

    public static SubLObject basic_doubly_linked_queue_peek_method(final SubLObject self) {
        final SubLObject template_list = basic_doubly_linked_queue_get_list_internal_method(self);
        if (NIL == template_list) {
            return NIL;
        }
        if (!subloop_collections.basic_doubly_linked_list_get_element_count_method(template_list).numE(ZERO_INTEGER)) {
            return NIL;
        }
        final SubLObject next_item = subloop_collections.basic_doubly_linked_list_nth_method(template_list, ZERO_INTEGER);
        return next_item;
    }

    public static SubLObject basic_doubly_linked_queue_reorder_contents_method(final SubLObject self, final SubLObject ordered_contents) {
        final SubLObject resolved_list = basic_doubly_linked_queue_get_list_method(self);
        subloop_collections.basic_doubly_linked_list_set_contents_method(resolved_list, ordered_contents);
        return NIL;
    }

    public static SubLObject basic_doubly_linked_queue_clear_method(final SubLObject self) {
        final SubLObject template_list = basic_doubly_linked_queue_get_list_internal_method(self);
        if (NIL != template_list) {
            final SubLObject template_enumerator = subloop_collections.basic_doubly_linked_list_allocate_enumerator_method(template_list);
            SubLObject template_current_item = subloop_collections.basic_doubly_linked_list_enumerator_first_method(template_enumerator);
            if ((NIL == basic_doubly_linked_queue_passive_p_method(self)) && (NIL != queue_element_interface_p(template_current_item))) {
                methods.funcall_instance_method_with_0_args(template_current_item, DEQUEUE_NOTIFY);
            }
            while (NIL == subloop_collections.basic_doubly_linked_list_enumerator_last_p_method(template_enumerator)) {
                template_current_item = subloop_collections.basic_doubly_linked_list_enumerator_next_method(template_enumerator);
                if ((NIL == basic_doubly_linked_queue_passive_p_method(self)) && (NIL != queue_element_interface_p(template_current_item))) {
                    methods.funcall_instance_method_with_0_args(template_current_item, DEQUEUE_NOTIFY);
                }
            } 
            subloop_collections.basic_doubly_linked_list_deallocate_enumerator_method(template_list, template_enumerator);
            subloop_collections.basic_doubly_linked_list_clear_method(template_list);
        }
        return NIL;
    }

    public static SubLObject basic_doubly_linked_queue_set_contents_method(final SubLObject self, final SubLObject new_contents) {
        final SubLObject template_resolved_list = basic_doubly_linked_queue_get_list_method(self);
        final SubLObject template_enumerator = subloop_collections.basic_doubly_linked_list_allocate_enumerator_method(template_resolved_list);
        if (NIL == subloop_collections.basic_doubly_linked_list_enumerator_empty_p_method(template_enumerator)) {
            SubLObject template_current_item = subloop_collections.basic_doubly_linked_list_enumerator_first_method(template_enumerator);
            if ((NIL == basic_doubly_linked_queue_passive_p_method(self)) && (NIL != queue_element_interface_p(template_current_item))) {
                methods.funcall_instance_method_with_0_args(template_current_item, DEQUEUE_NOTIFY);
            }
            while (NIL == subloop_collections.basic_doubly_linked_list_enumerator_last_p_method(template_enumerator)) {
                template_current_item = subloop_collections.basic_doubly_linked_list_enumerator_next_method(template_enumerator);
                if ((NIL == basic_doubly_linked_queue_passive_p_method(self)) && (NIL != queue_element_interface_p(template_current_item))) {
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
                if ((NIL == basic_doubly_linked_queue_passive_p_method(self)) && (NIL != queue_element_interface_p(new_item))) {
                    methods.funcall_instance_method_with_1_args(new_item, ENQUEUE_NOTIFY, self);
                }
                cdolist_list_var = cdolist_list_var.rest();
                new_item = cdolist_list_var.first();
            } 
        }
        return new_contents;
    }

    public static SubLObject basic_doubly_linked_queue_get_contents_method(final SubLObject self) {
        final SubLObject template_list = basic_doubly_linked_queue_get_list_internal_method(self);
        if (NIL != template_list) {
            return subloop_collections.basic_doubly_linked_list_get_contents_method(template_list);
        }
        return NIL;
    }

    public static SubLObject basic_doubly_linked_queue_get_element_count_method(final SubLObject self) {
        final SubLObject template_list = basic_doubly_linked_queue_get_list_internal_method(self);
        if (NIL != template_list) {
            return subloop_collections.basic_doubly_linked_list_get_element_count_method(template_list);
        }
        return ZERO_INTEGER;
    }

    public static SubLObject basic_doubly_linked_queue_find_method(final SubLObject self, final SubLObject key_value, SubLObject equality_pred, SubLObject key_accessor_function) {
        if (equality_pred == UNPROVIDED) {
            equality_pred = symbol_function(EQL);
        }
        if (key_accessor_function == UNPROVIDED) {
            key_accessor_function = symbol_function(IDENTITY);
        }
        final SubLObject template_list = basic_doubly_linked_queue_get_list_internal_method(self);
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

    public static SubLObject basic_doubly_linked_queue_dequeue_method(final SubLObject self) {
        final SubLObject template_list = basic_doubly_linked_queue_get_list_internal_method(self);
        if (NIL != template_list) {
            final SubLObject template_prioritizer = basic_doubly_linked_queue_get_prioritizer_method(self);
            if (NIL != template_prioritizer) {
                methods.funcall_instance_method_with_1_args(template_prioritizer, ORDER_QUEUE, self);
            }
            final SubLObject dequeued_item = subloop_collections.basic_doubly_linked_list_pop_method(template_list);
            if ((NIL == basic_doubly_linked_queue_passive_p_method(self)) && (NIL != queue_element_interface_p(dequeued_item))) {
                methods.funcall_instance_method_with_1_args(dequeued_item, DEQUEUE_NOTIFY, self);
            }
            return dequeued_item;
        }
        return NIL;
    }

    public static SubLObject basic_doubly_linked_queue_remove_method(final SubLObject self, final SubLObject old_element) {
        final SubLObject template_resolved_list = basic_doubly_linked_queue_get_list_method(self);
        subloop_collections.basic_doubly_linked_list_remove_method(template_resolved_list, old_element);
        if ((NIL == basic_doubly_linked_queue_passive_p_method(self)) && (NIL != queue_element_interface_p(old_element))) {
            methods.funcall_instance_method_with_1_args(old_element, REMOVE_NOTIFY, self);
        }
        return old_element;
    }

    public static SubLObject basic_doubly_linked_queue_on_enqueue_method(final SubLObject self, final SubLObject new_element) {
        return NIL;
    }

    public static SubLObject basic_doubly_linked_queue_enqueue_method(final SubLObject self, final SubLObject new_element) {
        final SubLObject template_resolved_list = basic_doubly_linked_queue_get_list_method(self);
        subloop_collections.basic_doubly_linked_list_add_method(template_resolved_list, new_element);
        if ((NIL == basic_doubly_linked_queue_passive_p_method(self)) && (NIL != queue_element_interface_p(new_element))) {
            methods.funcall_instance_method_with_1_args(new_element, ENQUEUE_NOTIFY, self);
        }
        methods.funcall_instance_method_with_1_args(self, ON_ENQUEUE, new_element);
        return new_element;
    }

    public static SubLObject basic_doubly_linked_queue_empty_p_method(final SubLObject self) {
        final SubLObject template_list = basic_doubly_linked_queue_get_list_internal_method(self);
        return makeBoolean((NIL == template_list) || (NIL != subloop_collections.collection_template_empty_p(template_list)));
    }

    public static SubLObject basic_doubly_linked_queue_set_prioritizer_method(final SubLObject self, final SubLObject new_prioritizer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == new_prioritizer) {
            basic_doubly_linked_queue_set_prioritizer_internal_method(self, NIL);
            return NIL;
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == queue_prioritizer_interface_p(new_prioritizer))) {
            Errors.error($str159$_SET_PRIORITIZER__S____S_is_not_a, self, new_prioritizer);
        }
        basic_doubly_linked_queue_set_prioritizer_internal_method(self, new_prioritizer);
        return new_prioritizer;
    }

    public static SubLObject basic_doubly_linked_queue_get_prioritizer_method(final SubLObject self) {
        return basic_doubly_linked_queue_get_prioritizer_internal_method(self);
    }

    public static SubLObject basic_doubly_linked_queue_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLObject template_list = basic_doubly_linked_queue_get_list_internal_method(self);
        if (NIL == template_list) {
            format(stream, $str214$DL_QUEUE___);
            return self;
        }
        final SubLObject template_enumerator = subloop_collections.basic_doubly_linked_list_allocate_enumerator_method(template_list);
        if (NIL == template_enumerator) {
            format(stream, $str215$___S_Class_is_not_correctly_imple, object.object_class_of_method(self));
            return self;
        }
        if (NIL != methods.funcall_instance_method_with_0_args(template_enumerator, EMPTY_P)) {
            format(stream, $str214$DL_QUEUE___);
        } else {
            format(stream, $str216$DL_QUEUE___S, methods.funcall_instance_method_with_0_args(template_enumerator, FIRST));
            while (NIL == methods.funcall_instance_method_with_0_args(template_enumerator, LAST_P)) {
                format(stream, $str125$___S, methods.funcall_instance_method_with_0_args(template_enumerator, NEXT));
            } 
            format(stream, $str126$_);
        }
        subloop_collections.basic_doubly_linked_list_deallocate_enumerator_method(template_list, template_enumerator);
        return self;
    }

    public static SubLObject basic_doubly_linked_queue_get_list_method(final SubLObject self) {
        SubLObject template_list = basic_doubly_linked_queue_get_list_internal_method(self);
        if (NIL == basic_doubly_linked_queue_get_list_internal_method(self)) {
            template_list = object.object_new_method(BASIC_DOUBLY_LINKED_LIST);
            basic_doubly_linked_queue_set_list_internal_method(self, template_list);
        }
        return template_list;
    }

    public static SubLObject basic_doubly_linked_queue_initialize_qua_doubly_linked_queue_method(final SubLObject self) {
        basic_doubly_linked_queue_set_list_internal_method(self, NIL);
        basic_doubly_linked_queue_set_prioritizer_internal_method(self, NIL);
        return self;
    }

    public static SubLObject subloop_reserved_initialize_basic_doubly_linked_queue_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
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

    public static SubLObject basic_doubly_linked_queue_p(final SubLObject basic_doubly_linked_queue) {
        return classes.subloop_instanceof_class(basic_doubly_linked_queue, BASIC_DOUBLY_LINKED_QUEUE);
    }

    public static SubLObject basic_doubly_linked_queue_get_list_internal_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_doubly_linked_queue_method = NIL;
        final SubLObject list = get_basic_doubly_linked_queue_list(self);
        try {
            thread.throwStack.push($sym226$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD);
            try {
                sublisp_throw($sym226$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD, list);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_doubly_linked_queue_list(self, list);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_doubly_linked_queue_method = Errors.handleThrowable(ccatch_env_var, $sym226$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_doubly_linked_queue_method;
    }

    public static SubLObject basic_doubly_linked_queue_set_list_internal_method(final SubLObject self, final SubLObject new_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_doubly_linked_queue_method = NIL;
        SubLObject list = get_basic_doubly_linked_queue_list(self);
        try {
            thread.throwStack.push($sym231$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD);
            try {
                list = new_list;
                sublisp_throw($sym231$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD, new_list);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_doubly_linked_queue_list(self, list);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_doubly_linked_queue_method = Errors.handleThrowable(ccatch_env_var, $sym231$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_doubly_linked_queue_method;
    }

    public static SubLObject basic_doubly_linked_queue_get_prioritizer_internal_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_doubly_linked_queue_method = NIL;
        final SubLObject prioritizer = get_basic_doubly_linked_queue_prioritizer(self);
        try {
            thread.throwStack.push($sym234$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD);
            try {
                sublisp_throw($sym234$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD, prioritizer);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_doubly_linked_queue_prioritizer(self, prioritizer);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_doubly_linked_queue_method = Errors.handleThrowable(ccatch_env_var, $sym234$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_doubly_linked_queue_method;
    }

    public static SubLObject basic_doubly_linked_queue_set_prioritizer_internal_method(final SubLObject self, final SubLObject new_prioritizer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_doubly_linked_queue_method = NIL;
        SubLObject prioritizer = get_basic_doubly_linked_queue_prioritizer(self);
        try {
            thread.throwStack.push($sym238$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD);
            try {
                prioritizer = new_prioritizer;
                sublisp_throw($sym238$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD, new_prioritizer);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_doubly_linked_queue_prioritizer(self, prioritizer);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_doubly_linked_queue_method = Errors.handleThrowable(ccatch_env_var, $sym238$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_doubly_linked_queue_method;
    }

    public static SubLObject basic_doubly_linked_queue_initialize_method(final SubLObject self) {
        object.object_initialize_method(self);
        basic_doubly_linked_queue_initialize_qua_doubly_linked_queue_method(self);
        return self;
    }

    public static SubLObject basic_doubly_linked_queue_passive_p_method(final SubLObject self) {
        final SubLObject is_passive = get_basic_doubly_linked_queue_is_passive(self);
        return is_passive;
    }

    public static SubLObject basic_doubly_linked_queue_set_passive_method(final SubLObject self, final SubLObject flag) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_doubly_linked_queue_method = NIL;
        SubLObject is_passive = get_basic_doubly_linked_queue_is_passive(self);
        try {
            thread.throwStack.push($sym243$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD);
            try {
                is_passive = flag;
                sublisp_throw($sym243$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD, flag);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_doubly_linked_queue_is_passive(self, is_passive);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_doubly_linked_queue_method = Errors.handleThrowable(ccatch_env_var, $sym243$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_doubly_linked_queue_method;
    }

    public static SubLObject get_asynch_basic_doubly_linked_queue_lock_history(final SubLObject asynch_basic_doubly_linked_queue) {
        return classes.subloop_get_instance_slot(asynch_basic_doubly_linked_queue, FOUR_INTEGER);
    }

    public static SubLObject set_asynch_basic_doubly_linked_queue_lock_history(final SubLObject asynch_basic_doubly_linked_queue, final SubLObject value) {
        return classes.subloop_set_instance_slot(asynch_basic_doubly_linked_queue, value, FOUR_INTEGER);
    }

    public static SubLObject get_asynch_basic_doubly_linked_queue_lock(final SubLObject asynch_basic_doubly_linked_queue) {
        return classes.subloop_get_access_protected_instance_slot(asynch_basic_doubly_linked_queue, THREE_INTEGER, LOCK);
    }

    public static SubLObject set_asynch_basic_doubly_linked_queue_lock(final SubLObject asynch_basic_doubly_linked_queue, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(asynch_basic_doubly_linked_queue, value, THREE_INTEGER, LOCK);
    }

    public static SubLObject subloop_reserved_initialize_asynch_basic_doubly_linked_queue_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
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

    public static SubLObject asynch_basic_doubly_linked_queue_p(final SubLObject asynch_basic_doubly_linked_queue) {
        return classes.subloop_instanceof_class(asynch_basic_doubly_linked_queue, ASYNCH_BASIC_DOUBLY_LINKED_QUEUE);
    }

    public static SubLObject asynch_basic_doubly_linked_queue_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_asynch_basic_doubly_linked_queue_method = NIL;
        SubLObject lock_history = get_asynch_basic_doubly_linked_queue_lock_history(self);
        SubLObject lock = get_asynch_basic_doubly_linked_queue_lock(self);
        try {
            thread.throwStack.push($sym252$OUTER_CATCH_FOR_ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_METHOD);
            try {
                basic_doubly_linked_queue_initialize_method(self);
                lock = make_lock(format(NIL, $str253$_S, self));
                lock_history = NIL;
                sublisp_throw($sym252$OUTER_CATCH_FOR_ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_asynch_basic_doubly_linked_queue_lock_history(self, lock_history);
                    set_asynch_basic_doubly_linked_queue_lock(self, lock);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_asynch_basic_doubly_linked_queue_method = Errors.handleThrowable(ccatch_env_var, $sym252$OUTER_CATCH_FOR_ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_asynch_basic_doubly_linked_queue_method;
    }

    public static SubLObject asynch_basic_doubly_linked_queue_set_prioritizer_method(final SubLObject self, final SubLObject new_prioritizer) {
        SubLObject result = NIL;
        final SubLObject lock = get_asynch_basic_doubly_linked_queue_lock(self);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            result = basic_doubly_linked_queue_set_prioritizer_method(self, new_prioritizer);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return result;
    }

    public static SubLObject asynch_basic_doubly_linked_queue_enqueue_method(final SubLObject self, final SubLObject new_element) {
        SubLObject result = NIL;
        final SubLObject lock = get_asynch_basic_doubly_linked_queue_lock(self);
        SubLObject lock_history = get_asynch_basic_doubly_linked_queue_lock_history(self);
        lock_history = cons(list($WAITING, $ENQUEUE, new_element), lock_history);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            lock_history = cons(list($LOCKED, $ENQUEUE, new_element), lock_history);
            result = basic_doubly_linked_queue_enqueue_method(self, new_element);
            lock_history = cons(list($UNLOCKED, $ENQUEUE, new_element), lock_history);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        set_asynch_basic_doubly_linked_queue_lock_history(self, lock_history);
        return result;
    }

    public static SubLObject asynch_basic_doubly_linked_queue_on_enqueue_method(final SubLObject self, final SubLObject new_element) {
        return NIL;
    }

    public static SubLObject asynch_basic_doubly_linked_queue_remove_method(final SubLObject self, final SubLObject old_element) {
        SubLObject result = NIL;
        final SubLObject lock = get_asynch_basic_doubly_linked_queue_lock(self);
        SubLObject lock_history = get_asynch_basic_doubly_linked_queue_lock_history(self);
        lock_history = cons(list($WAITING, $REMOVE, old_element), lock_history);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            lock_history = cons(list($LOCKED, $REMOVE, old_element), lock_history);
            result = basic_doubly_linked_queue_remove_method(self, old_element);
            lock_history = cons(list($UNLOCKED, $REMOVE, old_element), lock_history);
            set_asynch_basic_doubly_linked_queue_lock_history(self, lock_history);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        set_asynch_basic_doubly_linked_queue_lock_history(self, lock_history);
        return result;
    }

    public static SubLObject asynch_basic_doubly_linked_queue_dequeue_method(final SubLObject self) {
        SubLObject result = NIL;
        final SubLObject lock = get_asynch_basic_doubly_linked_queue_lock(self);
        SubLObject lock_history = get_asynch_basic_doubly_linked_queue_lock_history(self);
        lock_history = cons(list($WAITING, $DEQUEUE), lock_history);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            lock_history = cons(list($LOCKED, $DEQUEUE), lock_history);
            result = basic_doubly_linked_queue_dequeue_method(self);
            lock_history = cons(list($UNLOCKED, $DEQUEUE, result), lock_history);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        set_asynch_basic_doubly_linked_queue_lock_history(self, lock_history);
        return result;
    }

    public static SubLObject asynch_basic_doubly_linked_queue_set_contents_method(final SubLObject self, final SubLObject new_contents) {
        SubLObject result = NIL;
        final SubLObject lock = get_asynch_basic_doubly_linked_queue_lock(self);
        SubLObject lock_history = get_asynch_basic_doubly_linked_queue_lock_history(self);
        lock_history = cons(list($WAITING, $SET_CONTENTS, new_contents), lock_history);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            lock_history = cons(list($LOCKED, $SET_CONTENTS, new_contents), lock_history);
            result = basic_doubly_linked_queue_set_contents_method(self, new_contents);
            lock_history = cons(list($UNLOCKED, $SET_CONTENTS, result), lock_history);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        set_asynch_basic_doubly_linked_queue_lock_history(self, lock_history);
        return result;
    }

    public static SubLObject asynch_basic_doubly_linked_queue_clear_method(final SubLObject self) {
        final SubLObject lock = get_asynch_basic_doubly_linked_queue_lock(self);
        SubLObject lock_history = get_asynch_basic_doubly_linked_queue_lock_history(self);
        lock_history = cons(list($WAITING, $CLEAR), lock_history);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            lock_history = cons(list($LOCKED, $CLEAR), lock_history);
            basic_doubly_linked_queue_clear_method(self);
            lock_history = cons(list($UNLOCKED, $CLEAR), lock_history);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        set_asynch_basic_doubly_linked_queue_lock_history(self, lock_history);
        return NIL;
    }

    public static SubLObject get_basic_doubly_linked_ipc_queue_semaphore(final SubLObject basic_doubly_linked_ipc_queue) {
        return classes.subloop_get_access_protected_instance_slot(basic_doubly_linked_ipc_queue, FIVE_INTEGER, SEMAPHORE);
    }

    public static SubLObject set_basic_doubly_linked_ipc_queue_semaphore(final SubLObject basic_doubly_linked_ipc_queue, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_doubly_linked_ipc_queue, value, FIVE_INTEGER, SEMAPHORE);
    }

    public static SubLObject get_basic_doubly_linked_ipc_queue_lock(final SubLObject basic_doubly_linked_ipc_queue) {
        return classes.subloop_get_access_protected_instance_slot(basic_doubly_linked_ipc_queue, FOUR_INTEGER, LOCK);
    }

    public static SubLObject set_basic_doubly_linked_ipc_queue_lock(final SubLObject basic_doubly_linked_ipc_queue, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_doubly_linked_ipc_queue, value, FOUR_INTEGER, LOCK);
    }

    public static SubLObject get_basic_doubly_linked_ipc_queue_semaphore_name(final SubLObject basic_doubly_linked_ipc_queue) {
        return classes.subloop_get_access_protected_instance_slot(basic_doubly_linked_ipc_queue, THREE_INTEGER, SEMAPHORE_NAME);
    }

    public static SubLObject set_basic_doubly_linked_ipc_queue_semaphore_name(final SubLObject basic_doubly_linked_ipc_queue, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_doubly_linked_ipc_queue, value, THREE_INTEGER, SEMAPHORE_NAME);
    }

    public static SubLObject get_basic_doubly_linked_ipc_queue_base_suffix_counter(final SubLObject basic_doubly_linked_ipc_queue) {
        final SubLObject v_class = (basic_doubly_linked_ipc_queue.isSymbol()) ? classes.classes_retrieve_class(basic_doubly_linked_ipc_queue) : NIL != subloop_structures.class_p(basic_doubly_linked_ipc_queue) ? basic_doubly_linked_ipc_queue : NIL != subloop_structures.instance_p(basic_doubly_linked_ipc_queue) ? subloop_structures.instance_class(basic_doubly_linked_ipc_queue) : NIL;
        if (NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc(BASE_SUFFIX_COUNTER, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return aref(subloop_structures.class_any_slots(v_class), TWO_INTEGER);
        }
        return NIL;
    }

    public static SubLObject set_basic_doubly_linked_ipc_queue_base_suffix_counter(final SubLObject basic_doubly_linked_ipc_queue, final SubLObject value) {
        final SubLObject v_class = (basic_doubly_linked_ipc_queue.isSymbol()) ? classes.classes_retrieve_class(basic_doubly_linked_ipc_queue) : NIL != subloop_structures.class_p(basic_doubly_linked_ipc_queue) ? basic_doubly_linked_ipc_queue : NIL != subloop_structures.instance_p(basic_doubly_linked_ipc_queue) ? subloop_structures.instance_class(basic_doubly_linked_ipc_queue) : NIL;
        if (NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc(BASE_SUFFIX_COUNTER, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return set_aref(subloop_structures.class_any_slots(v_class), TWO_INTEGER, value);
        }
        return NIL;
    }

    public static SubLObject get_basic_doubly_linked_ipc_queue_base_name(final SubLObject basic_doubly_linked_ipc_queue) {
        final SubLObject v_class = (basic_doubly_linked_ipc_queue.isSymbol()) ? classes.classes_retrieve_class(basic_doubly_linked_ipc_queue) : NIL != subloop_structures.class_p(basic_doubly_linked_ipc_queue) ? basic_doubly_linked_ipc_queue : NIL != subloop_structures.instance_p(basic_doubly_linked_ipc_queue) ? subloop_structures.instance_class(basic_doubly_linked_ipc_queue) : NIL;
        if (NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc(BASE_NAME, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return aref(subloop_structures.class_any_slots(v_class), ONE_INTEGER);
        }
        return NIL;
    }

    public static SubLObject set_basic_doubly_linked_ipc_queue_base_name(final SubLObject basic_doubly_linked_ipc_queue, final SubLObject value) {
        final SubLObject v_class = (basic_doubly_linked_ipc_queue.isSymbol()) ? classes.classes_retrieve_class(basic_doubly_linked_ipc_queue) : NIL != subloop_structures.class_p(basic_doubly_linked_ipc_queue) ? basic_doubly_linked_ipc_queue : NIL != subloop_structures.instance_p(basic_doubly_linked_ipc_queue) ? subloop_structures.instance_class(basic_doubly_linked_ipc_queue) : NIL;
        if (NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc(BASE_NAME, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return set_aref(subloop_structures.class_any_slots(v_class), ONE_INTEGER, value);
        }
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_basic_doubly_linked_ipc_queue_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, BASIC_DOUBLY_LINKED_IPC_QUEUE, BASE_NAME, $str283$BASIC_DOUBLY_LINKED_IPC_QUEUE);
        classes.subloop_initialize_slot(new_instance, BASIC_DOUBLY_LINKED_IPC_QUEUE, BASE_SUFFIX_COUNTER, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_basic_doubly_linked_ipc_queue_instance(final SubLObject new_instance) {
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

    public static SubLObject basic_doubly_linked_ipc_queue_p(final SubLObject basic_doubly_linked_ipc_queue) {
        return classes.subloop_instanceof_class(basic_doubly_linked_ipc_queue, BASIC_DOUBLY_LINKED_IPC_QUEUE);
    }

    public static SubLObject basic_doubly_linked_ipc_queue_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_doubly_linked_ipc_queue_method = NIL;
        SubLObject base_suffix_counter = get_basic_doubly_linked_ipc_queue_base_suffix_counter(self);
        final SubLObject base_name = get_basic_doubly_linked_ipc_queue_base_name(self);
        SubLObject semaphore = get_basic_doubly_linked_ipc_queue_semaphore(self);
        SubLObject lock = get_basic_doubly_linked_ipc_queue_lock(self);
        SubLObject semaphore_name = get_basic_doubly_linked_ipc_queue_semaphore_name(self);
        try {
            thread.throwStack.push($sym287$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD);
            try {
                basic_doubly_linked_queue_initialize_method(self);
                semaphore_name = format(NIL, $str288$_A__S, base_name, base_suffix_counter);
                base_suffix_counter = add(base_suffix_counter, ONE_INTEGER);
                lock = cconcatenate($$$Lock_for_Queue_, semaphore_name);
                semaphore = Semaphores.new_semaphore(semaphore_name, ZERO_INTEGER);
                sublisp_throw($sym287$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_doubly_linked_ipc_queue_base_suffix_counter(self, base_suffix_counter);
                    set_basic_doubly_linked_ipc_queue_base_name(self, base_name);
                    set_basic_doubly_linked_ipc_queue_semaphore(self, semaphore);
                    set_basic_doubly_linked_ipc_queue_lock(self, lock);
                    set_basic_doubly_linked_ipc_queue_semaphore_name(self, semaphore_name);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_doubly_linked_ipc_queue_method = Errors.handleThrowable(ccatch_env_var, $sym287$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_doubly_linked_ipc_queue_method;
    }

    public static SubLObject basic_doubly_linked_ipc_queue_set_prioritizer_method(final SubLObject self, final SubLObject new_prioritizer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_doubly_linked_ipc_queue_method = NIL;
        final SubLObject lock = get_basic_doubly_linked_ipc_queue_lock(self);
        try {
            thread.throwStack.push($sym292$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD);
            try {
                SubLObject result = NIL;
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    result = basic_doubly_linked_queue_set_prioritizer_method(self, new_prioritizer);
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
                sublisp_throw($sym292$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD, result);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_doubly_linked_ipc_queue_lock(self, lock);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_doubly_linked_ipc_queue_method = Errors.handleThrowable(ccatch_env_var, $sym292$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_doubly_linked_ipc_queue_method;
    }

    public static SubLObject basic_doubly_linked_ipc_queue_enqueue_method(final SubLObject self, final SubLObject new_element) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_doubly_linked_ipc_queue_method = NIL;
        final SubLObject semaphore = get_basic_doubly_linked_ipc_queue_semaphore(self);
        final SubLObject lock = get_basic_doubly_linked_ipc_queue_lock(self);
        try {
            thread.throwStack.push($sym295$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD);
            try {
                SubLObject result = NIL;
                semaphores.v_semaphore(semaphore);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    result = basic_doubly_linked_queue_enqueue_method(self, new_element);
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
                sublisp_throw($sym295$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD, result);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_doubly_linked_ipc_queue_semaphore(self, semaphore);
                    set_basic_doubly_linked_ipc_queue_lock(self, lock);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_doubly_linked_ipc_queue_method = Errors.handleThrowable(ccatch_env_var, $sym295$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_doubly_linked_ipc_queue_method;
    }

    public static SubLObject basic_doubly_linked_ipc_queue_remove_method(final SubLObject self, final SubLObject old_element) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_doubly_linked_ipc_queue_method = NIL;
        final SubLObject semaphore = get_basic_doubly_linked_ipc_queue_semaphore(self);
        final SubLObject lock = get_basic_doubly_linked_ipc_queue_lock(self);
        try {
            thread.throwStack.push($sym298$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD);
            try {
                SubLObject result = NIL;
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    result = basic_doubly_linked_queue_remove_method(self, old_element);
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
                semaphores.p_semaphore(semaphore);
                sublisp_throw($sym298$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD, result);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_doubly_linked_ipc_queue_semaphore(self, semaphore);
                    set_basic_doubly_linked_ipc_queue_lock(self, lock);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_doubly_linked_ipc_queue_method = Errors.handleThrowable(ccatch_env_var, $sym298$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_doubly_linked_ipc_queue_method;
    }

    public static SubLObject basic_doubly_linked_ipc_queue_dequeue_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_doubly_linked_ipc_queue_method = NIL;
        final SubLObject semaphore = get_basic_doubly_linked_ipc_queue_semaphore(self);
        final SubLObject lock = get_basic_doubly_linked_ipc_queue_lock(self);
        try {
            thread.throwStack.push($sym301$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD);
            try {
                SubLObject result = NIL;
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    result = basic_doubly_linked_queue_dequeue_method(self);
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
                semaphores.p_semaphore(semaphore);
                sublisp_throw($sym301$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD, result);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_doubly_linked_ipc_queue_semaphore(self, semaphore);
                    set_basic_doubly_linked_ipc_queue_lock(self, lock);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_doubly_linked_ipc_queue_method = Errors.handleThrowable(ccatch_env_var, $sym301$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_doubly_linked_ipc_queue_method;
    }

    public static SubLObject basic_doubly_linked_ipc_queue_set_contents_method(final SubLObject self, final SubLObject new_contents) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_doubly_linked_ipc_queue_method = NIL;
        final SubLObject lock = get_basic_doubly_linked_ipc_queue_lock(self);
        try {
            thread.throwStack.push($sym304$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD);
            try {
                SubLObject result = NIL;
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    result = basic_doubly_linked_queue_set_contents_method(self, new_contents);
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
                sublisp_throw($sym304$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD, result);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_doubly_linked_ipc_queue_lock(self, lock);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_doubly_linked_ipc_queue_method = Errors.handleThrowable(ccatch_env_var, $sym304$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_doubly_linked_ipc_queue_method;
    }

    public static SubLObject basic_doubly_linked_ipc_queue_clear_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_doubly_linked_ipc_queue_method = NIL;
        final SubLObject semaphore = get_basic_doubly_linked_ipc_queue_semaphore(self);
        final SubLObject lock = get_basic_doubly_linked_ipc_queue_lock(self);
        try {
            thread.throwStack.push($sym307$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD);
            try {
                while (NIL == basic_doubly_linked_queue_empty_p_method(self)) {
                    semaphores.p_semaphore(semaphore);
                    SubLObject release = NIL;
                    try {
                        release = seize_lock(lock);
                        basic_doubly_linked_ipc_queue_dequeue_method(self);
                    } finally {
                        if (NIL != release) {
                            release_lock(lock);
                        }
                    }
                } 
                sublisp_throw($sym307$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_doubly_linked_ipc_queue_semaphore(self, semaphore);
                    set_basic_doubly_linked_ipc_queue_lock(self, lock);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_doubly_linked_ipc_queue_method = Errors.handleThrowable(ccatch_env_var, $sym307$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_doubly_linked_ipc_queue_method;
    }

    public static SubLObject get_basic_ipc_queue_prioritizer(final SubLObject basic_ipc_queue) {
        return classes.subloop_get_access_protected_instance_slot(basic_ipc_queue, TWO_INTEGER, PRIORITIZER);
    }

    public static SubLObject set_basic_ipc_queue_prioritizer(final SubLObject basic_ipc_queue, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_ipc_queue, value, TWO_INTEGER, PRIORITIZER);
    }

    public static SubLObject get_basic_ipc_queue_actual_ipc_queue(final SubLObject basic_ipc_queue) {
        return classes.subloop_get_access_protected_instance_slot(basic_ipc_queue, ONE_INTEGER, ACTUAL_IPC_QUEUE);
    }

    public static SubLObject set_basic_ipc_queue_actual_ipc_queue(final SubLObject basic_ipc_queue, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_ipc_queue, value, ONE_INTEGER, ACTUAL_IPC_QUEUE);
    }

    public static SubLObject get_basic_ipc_queue_is_passive(final SubLObject basic_ipc_queue) {
        final SubLObject v_class = subloop_structures.instance_class(basic_ipc_queue);
        final SubLObject slot = slots.slot_assoc(IS_PASSIVE, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
        instances.instances_access_check_instance_slot(v_class, basic_ipc_queue, slot);
        return classes.ldb_test($int$4097, subloop_structures.instance_boolean_slots(basic_ipc_queue));
    }

    public static SubLObject set_basic_ipc_queue_is_passive(final SubLObject basic_ipc_queue, final SubLObject value) {
        final SubLObject v_class = subloop_structures.instance_class(basic_ipc_queue);
        final SubLObject slot = slots.slot_assoc(IS_PASSIVE, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
        instances.instances_access_check_instance_slot(v_class, basic_ipc_queue, slot);
        subloop_structures._csetf_instance_boolean_slots(basic_ipc_queue, bytes.dpb(NIL != value ? ONE_INTEGER : ZERO_INTEGER, $int$4097, subloop_structures.instance_boolean_slots(basic_ipc_queue)));
        return value;
    }

    public static SubLObject basic_ipc_queue_on_enqueue_method(final SubLObject self, final SubLObject new_element) {
        return NIL;
    }

    public static SubLObject basic_ipc_queue_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLObject template_contents = basic_ipc_queue_get_contents_method(self);
        if (NIL == template_contents) {
            format(stream, $str122$QUEUE___);
        } else
            if (NIL == template_contents.rest()) {
                format(stream, $str123$QUEUE___S_, template_contents.first());
            } else {
                format(stream, $str124$QUEUE___S, template_contents.first());
                SubLObject cdolist_list_var = template_contents.rest();
                SubLObject element = NIL;
                element = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    format(stream, $str125$___S, element);
                    cdolist_list_var = cdolist_list_var.rest();
                    element = cdolist_list_var.first();
                } 
                format(stream, $str126$_);
            }

        return self;
    }

    public static SubLObject subloop_reserved_initialize_basic_ipc_queue_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_basic_ipc_queue_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_IPC_QUEUE, IS_PASSIVE, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_IPC_QUEUE, ACTUAL_IPC_QUEUE, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_IPC_QUEUE, PRIORITIZER, NIL);
        return NIL;
    }

    public static SubLObject basic_ipc_queue_p(final SubLObject basic_ipc_queue) {
        return classes.subloop_instanceof_class(basic_ipc_queue, BASIC_IPC_QUEUE);
    }

    public static SubLObject basic_ipc_queue_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_ipc_queue_method = NIL;
        SubLObject actual_ipc_queue = get_basic_ipc_queue_actual_ipc_queue(self);
        final SubLObject instance_number = object.get_object_instance_number(self);
        try {
            thread.throwStack.push($sym317$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD);
            try {
                object.object_initialize_method(self);
                actual_ipc_queue = process_utilities.new_ipc_queue(cconcatenate($str318$BASIC_IPC_QUEUE_, string_utilities.to_string(instance_number)));
                sublisp_throw($sym317$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_ipc_queue_actual_ipc_queue(self, actual_ipc_queue);
                    object.set_object_instance_number(self, instance_number);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_ipc_queue_method = Errors.handleThrowable(ccatch_env_var, $sym317$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_ipc_queue_method;
    }

    public static SubLObject basic_ipc_queue_get_actual_ipc_queue_method(final SubLObject self) {
        final SubLObject actual_ipc_queue = get_basic_ipc_queue_actual_ipc_queue(self);
        return actual_ipc_queue;
    }

    public static SubLObject basic_ipc_queue_set_actual_ipc_queue_method(final SubLObject self, final SubLObject new_queue) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_ipc_queue_method = NIL;
        SubLObject actual_ipc_queue = get_basic_ipc_queue_actual_ipc_queue(self);
        try {
            thread.throwStack.push($sym326$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD);
            try {
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == process_utilities.ipc_queue_p(new_queue))) {
                    Errors.error($str327$_SET_ACTUAL_IPC_QUEUE__S____S_is_, self, new_queue);
                }
                actual_ipc_queue = new_queue;
                sublisp_throw($sym326$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD, new_queue);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_ipc_queue_actual_ipc_queue(self, actual_ipc_queue);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_ipc_queue_method = Errors.handleThrowable(ccatch_env_var, $sym326$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_ipc_queue_method;
    }

    public static SubLObject basic_ipc_queue_get_prioritizer_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_ipc_queue_method = NIL;
        final SubLObject prioritizer = get_basic_ipc_queue_prioritizer(self);
        try {
            thread.throwStack.push($sym329$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD);
            try {
                sublisp_throw($sym329$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD, prioritizer);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_ipc_queue_prioritizer(self, prioritizer);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_ipc_queue_method = Errors.handleThrowable(ccatch_env_var, $sym329$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_ipc_queue_method;
    }

    public static SubLObject basic_ipc_queue_set_prioritizer_method(final SubLObject self, final SubLObject new_prioritizer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_ipc_queue_method = NIL;
        SubLObject prioritizer = get_basic_ipc_queue_prioritizer(self);
        try {
            thread.throwStack.push($sym331$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD);
            try {
                if (((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != new_prioritizer)) && (NIL == queue_prioritizer_interface_p(new_prioritizer))) {
                    Errors.error($str159$_SET_PRIORITIZER__S____S_is_not_a, self, new_prioritizer);
                }
                prioritizer = new_prioritizer;
                sublisp_throw($sym331$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD, new_prioritizer);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_ipc_queue_prioritizer(self, prioritizer);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_ipc_queue_method = Errors.handleThrowable(ccatch_env_var, $sym331$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_ipc_queue_method;
    }

    public static SubLObject basic_ipc_queue_empty_p_method(final SubLObject self) {
        final SubLObject actual_ipc_queue = get_basic_ipc_queue_actual_ipc_queue(self);
        return zerop(process_utilities.ipc_current_queue_size(actual_ipc_queue));
    }

    public static SubLObject basic_ipc_queue_enqueue_method(final SubLObject self, final SubLObject new_element) {
        final SubLObject actual_ipc_queue = get_basic_ipc_queue_actual_ipc_queue(self);
        final SubLObject is_passive = get_basic_ipc_queue_is_passive(self);
        process_utilities.ipc_enqueue(new_element, actual_ipc_queue, UNPROVIDED);
        if ((NIL == is_passive) && (NIL != queue_element_interface_p(new_element))) {
            methods.funcall_instance_method_with_1_args(new_element, ENQUEUE_NOTIFY, self);
        }
        methods.funcall_instance_method_with_1_args(self, ON_ENQUEUE, new_element);
        return new_element;
    }

    public static SubLObject basic_ipc_queue_remove_method(final SubLObject self, final SubLObject old_element) {
        Errors.error($str338$Invalid_operation__Cannot_remove_);
        return old_element;
    }

    public static SubLObject basic_ipc_queue_dequeue_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_ipc_queue_method = NIL;
        final SubLObject actual_ipc_queue = get_basic_ipc_queue_actual_ipc_queue(self);
        final SubLObject is_passive = get_basic_ipc_queue_is_passive(self);
        try {
            thread.throwStack.push($sym341$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD);
            try {
                final SubLObject dequeued_item = process_utilities.ipc_dequeue(actual_ipc_queue, UNPROVIDED);
                if ((NIL == is_passive) && (NIL != queue_element_interface_p(dequeued_item))) {
                    methods.funcall_instance_method_with_1_args(dequeued_item, DEQUEUE_NOTIFY, self);
                }
                sublisp_throw($sym341$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD, dequeued_item);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_ipc_queue_actual_ipc_queue(self, actual_ipc_queue);
                    set_basic_ipc_queue_is_passive(self, is_passive);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_ipc_queue_method = Errors.handleThrowable(ccatch_env_var, $sym341$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_ipc_queue_method;
    }

    public static SubLObject basic_ipc_queue_get_element_count_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_ipc_queue_method = NIL;
        final SubLObject actual_ipc_queue = get_basic_ipc_queue_actual_ipc_queue(self);
        try {
            thread.throwStack.push($sym344$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD);
            try {
                sublisp_throw($sym344$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD, process_utilities.ipc_current_queue_size(actual_ipc_queue));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_ipc_queue_actual_ipc_queue(self, actual_ipc_queue);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_ipc_queue_method = Errors.handleThrowable(ccatch_env_var, $sym344$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_ipc_queue_method;
    }

    public static SubLObject basic_ipc_queue_get_contents_method(final SubLObject self) {
        final SubLObject actual_ipc_queue = get_basic_ipc_queue_actual_ipc_queue(self);
        return process_utilities.ipc_current_queue_content(actual_ipc_queue);
    }

    public static SubLObject basic_ipc_queue_set_contents_method(final SubLObject self, final SubLObject new_contents) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!new_contents.isList())) {
            Errors.error($str349$_SET_CONTENTS__S____S_is_not_a_va, self);
        }
        basic_ipc_queue_clear_method(self);
        SubLObject cdolist_list_var = new_contents;
        SubLObject element = NIL;
        element = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            basic_ipc_queue_enqueue_method(self, element);
            cdolist_list_var = cdolist_list_var.rest();
            element = cdolist_list_var.first();
        } 
        return new_contents;
    }

    public static SubLObject basic_ipc_queue_clear_method(final SubLObject self) {
        SubLObject element_count;
        SubLObject i;
        for (element_count = basic_ipc_queue_get_element_count_method(self), i = NIL, i = ZERO_INTEGER; i.numL(element_count); i = add(i, ONE_INTEGER)) {
            basic_ipc_queue_dequeue_method(self);
        }
        return NIL;
    }

    public static SubLObject basic_ipc_queue_reorder_contents_method(final SubLObject self, final SubLObject ordered_contents) {
        return ordered_contents;
    }

    public static SubLObject basic_ipc_queue_peek_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_ipc_queue_method = NIL;
        final SubLObject actual_ipc_queue = get_basic_ipc_queue_actual_ipc_queue(self);
        try {
            thread.throwStack.push($sym356$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD);
            try {
                sublisp_throw($sym356$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD, process_utilities.ipc_current_queue_content(actual_ipc_queue).first());
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_ipc_queue_actual_ipc_queue(self, actual_ipc_queue);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_ipc_queue_method = Errors.handleThrowable(ccatch_env_var, $sym356$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_ipc_queue_method;
    }

    public static SubLObject basic_ipc_queue_enqueued_p_method(final SubLObject self, final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_ipc_queue_method = NIL;
        final SubLObject actual_ipc_queue = get_basic_ipc_queue_actual_ipc_queue(self);
        try {
            thread.throwStack.push($sym359$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD);
            try {
                sublisp_throw($sym359$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD, NIL != find(v_object, process_utilities.ipc_current_queue_content(actual_ipc_queue), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) ? T : NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_ipc_queue_actual_ipc_queue(self, actual_ipc_queue);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_ipc_queue_method = Errors.handleThrowable(ccatch_env_var, $sym359$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_ipc_queue_method;
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
        final SubLObject actual_ipc_queue = get_basic_ipc_queue_actual_ipc_queue(self);
        try {
            thread.throwStack.push($sym362$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD);
            try {
                sublisp_throw($sym362$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD, find(key_value, process_utilities.ipc_current_queue_content(actual_ipc_queue), equality_pred, key_accessor_function, UNPROVIDED, UNPROVIDED));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_ipc_queue_actual_ipc_queue(self, actual_ipc_queue);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_ipc_queue_method = Errors.handleThrowable(ccatch_env_var, $sym362$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_ipc_queue_method;
    }

    public static SubLObject basic_ipc_queue_passive_p_method(final SubLObject self) {
        final SubLObject is_passive = get_basic_ipc_queue_is_passive(self);
        return is_passive;
    }

    public static SubLObject basic_ipc_queue_set_passive_method(final SubLObject self, final SubLObject flag) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_ipc_queue_method = NIL;
        SubLObject is_passive = get_basic_ipc_queue_is_passive(self);
        try {
            thread.throwStack.push($sym365$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD);
            try {
                is_passive = flag;
                sublisp_throw($sym365$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD, flag);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_ipc_queue_is_passive(self, is_passive);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_ipc_queue_method = Errors.handleThrowable(ccatch_env_var, $sym365$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_ipc_queue_method;
    }

    public static SubLObject queue_interface_get_prioritizer(final SubLObject queue_interface) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == queue_interface_p(queue_interface))) {
            Errors.error($str367$QUEUE_INTERFACE_GET_PRIORITIZER__, queue_interface);
        }
        if (NIL != basic_doubly_linked_ipc_queue_p(queue_interface)) {
            return basic_doubly_linked_queue_get_prioritizer_method(queue_interface);
        }
        if (NIL != basic_doubly_linked_queue_p(queue_interface)) {
            return basic_doubly_linked_queue_get_prioritizer_method(queue_interface);
        }
        if (NIL != basic_ipc_queue_p(queue_interface)) {
            return basic_ipc_queue_get_prioritizer_method(queue_interface);
        }
        if (NIL != basic_queue_p(queue_interface)) {
            return basic_queue_get_prioritizer_method(queue_interface);
        }
        return methods.funcall_instance_method_with_0_args(queue_interface, GET_PRIORITIZER);
    }

    public static SubLObject queue_interface_set_prioritizer(final SubLObject queue_interface, final SubLObject new_prioritizer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == queue_interface_p(queue_interface))) {
            Errors.error($str368$QUEUE_INTERFACE_SET_PRIORITIZER__, queue_interface);
        }
        if (NIL != basic_doubly_linked_ipc_queue_p(queue_interface)) {
            return basic_doubly_linked_ipc_queue_set_prioritizer_method(queue_interface, new_prioritizer);
        }
        if (NIL != asynch_basic_doubly_linked_queue_p(queue_interface)) {
            return asynch_basic_doubly_linked_queue_set_prioritizer_method(queue_interface, new_prioritizer);
        }
        if (NIL != basic_doubly_linked_queue_p(queue_interface)) {
            return basic_doubly_linked_queue_set_prioritizer_method(queue_interface, new_prioritizer);
        }
        if (NIL != basic_ipc_queue_p(queue_interface)) {
            return basic_ipc_queue_set_prioritizer_method(queue_interface, new_prioritizer);
        }
        if (NIL != basic_queue_p(queue_interface)) {
            return basic_queue_set_prioritizer_method(queue_interface, new_prioritizer);
        }
        return methods.funcall_instance_method_with_1_args(queue_interface, SET_PRIORITIZER, new_prioritizer);
    }

    public static SubLObject queue_interface_empty_p(final SubLObject queue_interface) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == queue_interface_p(queue_interface))) {
            Errors.error($str369$QUEUE_INTERFACE_EMPTY_P___S_is_no, queue_interface);
        }
        if (NIL != basic_doubly_linked_ipc_queue_p(queue_interface)) {
            return basic_doubly_linked_queue_empty_p_method(queue_interface);
        }
        if (NIL != asynch_basic_doubly_linked_queue_p(queue_interface)) {
            return basic_doubly_linked_queue_empty_p_method(queue_interface);
        }
        if (NIL != basic_doubly_linked_queue_p(queue_interface)) {
            return basic_doubly_linked_queue_empty_p_method(queue_interface);
        }
        if (NIL != basic_ipc_queue_p(queue_interface)) {
            return basic_ipc_queue_empty_p_method(queue_interface);
        }
        if (NIL != basic_queue_p(queue_interface)) {
            return basic_queue_empty_p_method(queue_interface);
        }
        return methods.funcall_instance_method_with_0_args(queue_interface, EMPTY_P);
    }

    public static SubLObject queue_interface_enqueue(final SubLObject queue_interface, final SubLObject new_element) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == queue_interface_p(queue_interface))) {
            Errors.error($str370$QUEUE_INTERFACE_ENQUEUE___S_is_no, queue_interface);
        }
        if (NIL != basic_doubly_linked_ipc_queue_p(queue_interface)) {
            return basic_doubly_linked_ipc_queue_enqueue_method(queue_interface, new_element);
        }
        if (NIL != asynch_basic_doubly_linked_queue_p(queue_interface)) {
            return asynch_basic_doubly_linked_queue_enqueue_method(queue_interface, new_element);
        }
        if (NIL != basic_doubly_linked_queue_p(queue_interface)) {
            return basic_doubly_linked_queue_enqueue_method(queue_interface, new_element);
        }
        if (NIL != basic_ipc_queue_p(queue_interface)) {
            return basic_ipc_queue_enqueue_method(queue_interface, new_element);
        }
        if (NIL != basic_queue_p(queue_interface)) {
            return basic_queue_enqueue_method(queue_interface, new_element);
        }
        return methods.funcall_instance_method_with_1_args(queue_interface, ENQUEUE, new_element);
    }

    public static SubLObject queue_interface_remove(final SubLObject queue_interface, final SubLObject old_element) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == queue_interface_p(queue_interface))) {
            Errors.error($str371$QUEUE_INTERFACE_REMOVE___S_is_not, queue_interface);
        }
        if (NIL != basic_doubly_linked_ipc_queue_p(queue_interface)) {
            return basic_doubly_linked_ipc_queue_remove_method(queue_interface, old_element);
        }
        if (NIL != asynch_basic_doubly_linked_queue_p(queue_interface)) {
            return asynch_basic_doubly_linked_queue_remove_method(queue_interface, old_element);
        }
        if (NIL != basic_doubly_linked_queue_p(queue_interface)) {
            return basic_doubly_linked_queue_remove_method(queue_interface, old_element);
        }
        if (NIL != basic_ipc_queue_p(queue_interface)) {
            return basic_ipc_queue_remove_method(queue_interface, old_element);
        }
        if (NIL != basic_queue_p(queue_interface)) {
            return basic_queue_remove_method(queue_interface, old_element);
        }
        return methods.funcall_instance_method_with_1_args(queue_interface, REMOVE, old_element);
    }

    public static SubLObject queue_interface_dequeue(final SubLObject queue_interface) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == queue_interface_p(queue_interface))) {
            Errors.error($str372$QUEUE_INTERFACE_DEQUEUE___S_is_no, queue_interface);
        }
        if (NIL != basic_doubly_linked_ipc_queue_p(queue_interface)) {
            return basic_doubly_linked_ipc_queue_dequeue_method(queue_interface);
        }
        if (NIL != asynch_basic_doubly_linked_queue_p(queue_interface)) {
            return asynch_basic_doubly_linked_queue_dequeue_method(queue_interface);
        }
        if (NIL != basic_doubly_linked_queue_p(queue_interface)) {
            return basic_doubly_linked_queue_dequeue_method(queue_interface);
        }
        if (NIL != basic_ipc_queue_p(queue_interface)) {
            return basic_ipc_queue_dequeue_method(queue_interface);
        }
        if (NIL != basic_queue_p(queue_interface)) {
            return basic_queue_dequeue_method(queue_interface);
        }
        return methods.funcall_instance_method_with_0_args(queue_interface, DEQUEUE);
    }

    public static SubLObject queue_interface_get_element_count(final SubLObject queue_interface) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == queue_interface_p(queue_interface))) {
            Errors.error($str373$QUEUE_INTERFACE_GET_ELEMENT_COUNT, queue_interface);
        }
        if (NIL != basic_doubly_linked_ipc_queue_p(queue_interface)) {
            return basic_doubly_linked_queue_get_element_count_method(queue_interface);
        }
        if (NIL != asynch_basic_doubly_linked_queue_p(queue_interface)) {
            return basic_doubly_linked_queue_get_element_count_method(queue_interface);
        }
        if (NIL != basic_doubly_linked_queue_p(queue_interface)) {
            return basic_doubly_linked_queue_get_element_count_method(queue_interface);
        }
        if (NIL != basic_ipc_queue_p(queue_interface)) {
            return basic_ipc_queue_get_element_count_method(queue_interface);
        }
        if (NIL != basic_queue_p(queue_interface)) {
            return basic_queue_get_element_count_method(queue_interface);
        }
        return methods.funcall_instance_method_with_0_args(queue_interface, GET_ELEMENT_COUNT);
    }

    public static SubLObject queue_interface_get_contents(final SubLObject queue_interface) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == queue_interface_p(queue_interface))) {
            Errors.error($str374$QUEUE_INTERFACE_GET_CONTENTS___S_, queue_interface);
        }
        if (NIL != basic_doubly_linked_ipc_queue_p(queue_interface)) {
            return basic_doubly_linked_queue_get_contents_method(queue_interface);
        }
        if (NIL != asynch_basic_doubly_linked_queue_p(queue_interface)) {
            return basic_doubly_linked_queue_get_contents_method(queue_interface);
        }
        if (NIL != basic_doubly_linked_queue_p(queue_interface)) {
            return basic_doubly_linked_queue_get_contents_method(queue_interface);
        }
        if (NIL != basic_ipc_queue_p(queue_interface)) {
            return basic_ipc_queue_get_contents_method(queue_interface);
        }
        if (NIL != basic_queue_p(queue_interface)) {
            return basic_queue_get_contents_method(queue_interface);
        }
        return methods.funcall_instance_method_with_0_args(queue_interface, GET_CONTENTS);
    }

    public static SubLObject queue_interface_set_contents(final SubLObject queue_interface, final SubLObject new_contents) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == queue_interface_p(queue_interface))) {
            Errors.error($str375$QUEUE_INTERFACE_SET_CONTENTS___S_, queue_interface);
        }
        if (NIL != basic_doubly_linked_ipc_queue_p(queue_interface)) {
            return basic_doubly_linked_ipc_queue_set_contents_method(queue_interface, new_contents);
        }
        if (NIL != asynch_basic_doubly_linked_queue_p(queue_interface)) {
            return asynch_basic_doubly_linked_queue_set_contents_method(queue_interface, new_contents);
        }
        if (NIL != basic_doubly_linked_queue_p(queue_interface)) {
            return basic_doubly_linked_queue_set_contents_method(queue_interface, new_contents);
        }
        if (NIL != basic_ipc_queue_p(queue_interface)) {
            return basic_ipc_queue_set_contents_method(queue_interface, new_contents);
        }
        if (NIL != basic_queue_p(queue_interface)) {
            return basic_queue_set_contents_method(queue_interface, new_contents);
        }
        return methods.funcall_instance_method_with_1_args(queue_interface, SET_CONTENTS, new_contents);
    }

    public static SubLObject queue_interface_clear(final SubLObject queue_interface) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == queue_interface_p(queue_interface))) {
            Errors.error($str376$QUEUE_INTERFACE_CLEAR___S_is_not_, queue_interface);
        }
        if (NIL != basic_doubly_linked_ipc_queue_p(queue_interface)) {
            return basic_doubly_linked_ipc_queue_clear_method(queue_interface);
        }
        if (NIL != asynch_basic_doubly_linked_queue_p(queue_interface)) {
            return asynch_basic_doubly_linked_queue_clear_method(queue_interface);
        }
        if (NIL != basic_doubly_linked_queue_p(queue_interface)) {
            return basic_doubly_linked_queue_clear_method(queue_interface);
        }
        if (NIL != basic_ipc_queue_p(queue_interface)) {
            return basic_ipc_queue_clear_method(queue_interface);
        }
        if (NIL != basic_queue_p(queue_interface)) {
            return basic_queue_clear_method(queue_interface);
        }
        return methods.funcall_instance_method_with_0_args(queue_interface, CLEAR);
    }

    public static SubLObject queue_interface_reorder_contents(final SubLObject queue_interface, final SubLObject ordered_contents) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == queue_interface_p(queue_interface))) {
            Errors.error($str377$QUEUE_INTERFACE_REORDER_CONTENTS_, queue_interface);
        }
        if (NIL != basic_doubly_linked_ipc_queue_p(queue_interface)) {
            return basic_doubly_linked_queue_reorder_contents_method(queue_interface, ordered_contents);
        }
        if (NIL != asynch_basic_doubly_linked_queue_p(queue_interface)) {
            return basic_doubly_linked_queue_reorder_contents_method(queue_interface, ordered_contents);
        }
        if (NIL != basic_doubly_linked_queue_p(queue_interface)) {
            return basic_doubly_linked_queue_reorder_contents_method(queue_interface, ordered_contents);
        }
        if (NIL != basic_ipc_queue_p(queue_interface)) {
            return basic_ipc_queue_reorder_contents_method(queue_interface, ordered_contents);
        }
        if (NIL != basic_queue_p(queue_interface)) {
            return basic_queue_reorder_contents_method(queue_interface, ordered_contents);
        }
        return methods.funcall_instance_method_with_1_args(queue_interface, REORDER_CONTENTS, ordered_contents);
    }

    public static SubLObject declare_subloop_queues_file() {
        declareFunction(me, "queue_element_interface_p", "QUEUE-ELEMENT-INTERFACE-P", 1, 0, false);
        declareFunction(me, "queue_prioritizer_interface_p", "QUEUE-PRIORITIZER-INTERFACE-P", 1, 0, false);
        declareFunction(me, "queue_prioritizer_template_p", "QUEUE-PRIORITIZER-TEMPLATE-P", 1, 0, false);
        declareFunction(me, "queue_simple_sorter_template_p", "QUEUE-SIMPLE-SORTER-TEMPLATE-P", 1, 0, false);
        declareFunction(me, "get_basic_queue_simple_sorter_element_key_function", "GET-BASIC-QUEUE-SIMPLE-SORTER-ELEMENT-KEY-FUNCTION", 1, 0, false);
        declareFunction(me, "set_basic_queue_simple_sorter_element_key_function", "SET-BASIC-QUEUE-SIMPLE-SORTER-ELEMENT-KEY-FUNCTION", 2, 0, false);
        declareFunction(me, "get_basic_queue_simple_sorter_sort_predicate", "GET-BASIC-QUEUE-SIMPLE-SORTER-SORT-PREDICATE", 1, 0, false);
        declareFunction(me, "set_basic_queue_simple_sorter_sort_predicate", "SET-BASIC-QUEUE-SIMPLE-SORTER-SORT-PREDICATE", 2, 0, false);
        declareFunction(me, "basic_queue_simple_sorter_order_queue_internal_method", "BASIC-QUEUE-SIMPLE-SORTER-ORDER-QUEUE-INTERNAL-METHOD", 2, 0, false);
        declareFunction(me, "basic_queue_simple_sorter_order_queue_method", "BASIC-QUEUE-SIMPLE-SORTER-ORDER-QUEUE-METHOD", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_basic_queue_simple_sorter_class", "SUBLOOP-RESERVED-INITIALIZE-BASIC-QUEUE-SIMPLE-SORTER-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_basic_queue_simple_sorter_instance", "SUBLOOP-RESERVED-INITIALIZE-BASIC-QUEUE-SIMPLE-SORTER-INSTANCE", 1, 0, false);
        declareFunction(me, "basic_queue_simple_sorter_p", "BASIC-QUEUE-SIMPLE-SORTER-P", 1, 0, false);
        declareFunction(me, "basic_queue_simple_sorter_initialize_method", "BASIC-QUEUE-SIMPLE-SORTER-INITIALIZE-METHOD", 1, 0, false);
        declareFunction(me, "basic_queue_simple_sorter_get_sort_predicate_method", "BASIC-QUEUE-SIMPLE-SORTER-GET-SORT-PREDICATE-METHOD", 1, 0, false);
        declareFunction(me, "basic_queue_simple_sorter_set_sort_predicate_method", "BASIC-QUEUE-SIMPLE-SORTER-SET-SORT-PREDICATE-METHOD", 2, 0, false);
        declareFunction(me, "basic_queue_simple_sorter_get_element_key_method", "BASIC-QUEUE-SIMPLE-SORTER-GET-ELEMENT-KEY-METHOD", 1, 0, false);
        declareFunction(me, "basic_queue_simple_sorter_set_element_key_method", "BASIC-QUEUE-SIMPLE-SORTER-SET-ELEMENT-KEY-METHOD", 2, 0, false);
        declareFunction(me, "queue_interface_p", "QUEUE-INTERFACE-P", 1, 0, false);
        declareFunction(me, "end_pointer_queue_template_p", "END-POINTER-QUEUE-TEMPLATE-P", 1, 0, false);
        declareFunction(me, "get_basic_queue_prioritizer", "GET-BASIC-QUEUE-PRIORITIZER", 1, 0, false);
        declareFunction(me, "set_basic_queue_prioritizer", "SET-BASIC-QUEUE-PRIORITIZER", 2, 0, false);
        declareFunction(me, "get_basic_queue_last_cons", "GET-BASIC-QUEUE-LAST-CONS", 1, 0, false);
        declareFunction(me, "set_basic_queue_last_cons", "SET-BASIC-QUEUE-LAST-CONS", 2, 0, false);
        declareFunction(me, "get_basic_queue_first_cons", "GET-BASIC-QUEUE-FIRST-CONS", 1, 0, false);
        declareFunction(me, "set_basic_queue_first_cons", "SET-BASIC-QUEUE-FIRST-CONS", 2, 0, false);
        declareFunction(me, "get_basic_queue_is_passive", "GET-BASIC-QUEUE-IS-PASSIVE", 1, 0, false);
        declareFunction(me, "set_basic_queue_is_passive", "SET-BASIC-QUEUE-IS-PASSIVE", 2, 0, false);
        declareFunction(me, "basic_queue_enqueued_p_method", "BASIC-QUEUE-ENQUEUED-P-METHOD", 2, 0, false);
        declareFunction(me, "basic_queue_peek_method", "BASIC-QUEUE-PEEK-METHOD", 1, 0, false);
        declareFunction(me, "basic_queue_reorder_contents_method", "BASIC-QUEUE-REORDER-CONTENTS-METHOD", 2, 0, false);
        declareFunction(me, "basic_queue_clear_method", "BASIC-QUEUE-CLEAR-METHOD", 1, 0, false);
        declareFunction(me, "basic_queue_set_contents_method", "BASIC-QUEUE-SET-CONTENTS-METHOD", 2, 0, false);
        declareFunction(me, "basic_queue_get_contents_method", "BASIC-QUEUE-GET-CONTENTS-METHOD", 1, 0, false);
        declareFunction(me, "basic_queue_get_element_count_method", "BASIC-QUEUE-GET-ELEMENT-COUNT-METHOD", 1, 0, false);
        declareFunction(me, "basic_queue_find_method", "BASIC-QUEUE-FIND-METHOD", 2, 2, false);
        declareFunction(me, "basic_queue_dequeue_method", "BASIC-QUEUE-DEQUEUE-METHOD", 1, 0, false);
        declareFunction(me, "basic_queue_remove_method", "BASIC-QUEUE-REMOVE-METHOD", 2, 0, false);
        declareFunction(me, "basic_queue_on_enqueue_method", "BASIC-QUEUE-ON-ENQUEUE-METHOD", 2, 0, false);
        declareFunction(me, "basic_queue_enqueue_method", "BASIC-QUEUE-ENQUEUE-METHOD", 2, 0, false);
        declareFunction(me, "basic_queue_empty_p_method", "BASIC-QUEUE-EMPTY-P-METHOD", 1, 0, false);
        declareFunction(me, "basic_queue_print_method", "BASIC-QUEUE-PRINT-METHOD", 3, 0, false);
        declareFunction(me, "subloop_reserved_initialize_basic_queue_class", "SUBLOOP-RESERVED-INITIALIZE-BASIC-QUEUE-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_basic_queue_instance", "SUBLOOP-RESERVED-INITIALIZE-BASIC-QUEUE-INSTANCE", 1, 0, false);
        declareFunction(me, "basic_queue_p", "BASIC-QUEUE-P", 1, 0, false);
        declareFunction(me, "basic_queue_initialize_method", "BASIC-QUEUE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction(me, "basic_queue_get_first_cons_method", "BASIC-QUEUE-GET-FIRST-CONS-METHOD", 1, 0, false);
        declareFunction(me, "basic_queue_set_first_cons_method", "BASIC-QUEUE-SET-FIRST-CONS-METHOD", 2, 0, false);
        declareFunction(me, "basic_queue_get_end_pointer_method", "BASIC-QUEUE-GET-END-POINTER-METHOD", 1, 0, false);
        declareFunction(me, "basic_queue_set_end_pointer_method", "BASIC-QUEUE-SET-END-POINTER-METHOD", 2, 0, false);
        declareFunction(me, "basic_queue_get_prioritizer_method", "BASIC-QUEUE-GET-PRIORITIZER-METHOD", 1, 0, false);
        declareFunction(me, "basic_queue_set_prioritizer_method", "BASIC-QUEUE-SET-PRIORITIZER-METHOD", 2, 0, false);
        declareFunction(me, "basic_queue_passive_p_method", "BASIC-QUEUE-PASSIVE-P-METHOD", 1, 0, false);
        declareFunction(me, "basic_queue_set_passive_method", "BASIC-QUEUE-SET-PASSIVE-METHOD", 2, 0, false);
        declareFunction(me, "doubly_linked_queue_template_p", "DOUBLY-LINKED-QUEUE-TEMPLATE-P", 1, 0, false);
        declareFunction(me, "get_basic_doubly_linked_queue_prioritizer", "GET-BASIC-DOUBLY-LINKED-QUEUE-PRIORITIZER", 1, 0, false);
        declareFunction(me, "set_basic_doubly_linked_queue_prioritizer", "SET-BASIC-DOUBLY-LINKED-QUEUE-PRIORITIZER", 2, 0, false);
        declareFunction(me, "get_basic_doubly_linked_queue_list", "GET-BASIC-DOUBLY-LINKED-QUEUE-LIST", 1, 0, false);
        declareFunction(me, "set_basic_doubly_linked_queue_list", "SET-BASIC-DOUBLY-LINKED-QUEUE-LIST", 2, 0, false);
        declareFunction(me, "get_basic_doubly_linked_queue_is_passive", "GET-BASIC-DOUBLY-LINKED-QUEUE-IS-PASSIVE", 1, 0, false);
        declareFunction(me, "set_basic_doubly_linked_queue_is_passive", "SET-BASIC-DOUBLY-LINKED-QUEUE-IS-PASSIVE", 2, 0, false);
        declareFunction(me, "basic_doubly_linked_queue_enqueued_p_method", "BASIC-DOUBLY-LINKED-QUEUE-ENQUEUED-P-METHOD", 2, 0, false);
        declareFunction(me, "basic_doubly_linked_queue_peek_method", "BASIC-DOUBLY-LINKED-QUEUE-PEEK-METHOD", 1, 0, false);
        declareFunction(me, "basic_doubly_linked_queue_reorder_contents_method", "BASIC-DOUBLY-LINKED-QUEUE-REORDER-CONTENTS-METHOD", 2, 0, false);
        declareFunction(me, "basic_doubly_linked_queue_clear_method", "BASIC-DOUBLY-LINKED-QUEUE-CLEAR-METHOD", 1, 0, false);
        declareFunction(me, "basic_doubly_linked_queue_set_contents_method", "BASIC-DOUBLY-LINKED-QUEUE-SET-CONTENTS-METHOD", 2, 0, false);
        declareFunction(me, "basic_doubly_linked_queue_get_contents_method", "BASIC-DOUBLY-LINKED-QUEUE-GET-CONTENTS-METHOD", 1, 0, false);
        declareFunction(me, "basic_doubly_linked_queue_get_element_count_method", "BASIC-DOUBLY-LINKED-QUEUE-GET-ELEMENT-COUNT-METHOD", 1, 0, false);
        declareFunction(me, "basic_doubly_linked_queue_find_method", "BASIC-DOUBLY-LINKED-QUEUE-FIND-METHOD", 2, 2, false);
        declareFunction(me, "basic_doubly_linked_queue_dequeue_method", "BASIC-DOUBLY-LINKED-QUEUE-DEQUEUE-METHOD", 1, 0, false);
        declareFunction(me, "basic_doubly_linked_queue_remove_method", "BASIC-DOUBLY-LINKED-QUEUE-REMOVE-METHOD", 2, 0, false);
        declareFunction(me, "basic_doubly_linked_queue_on_enqueue_method", "BASIC-DOUBLY-LINKED-QUEUE-ON-ENQUEUE-METHOD", 2, 0, false);
        declareFunction(me, "basic_doubly_linked_queue_enqueue_method", "BASIC-DOUBLY-LINKED-QUEUE-ENQUEUE-METHOD", 2, 0, false);
        declareFunction(me, "basic_doubly_linked_queue_empty_p_method", "BASIC-DOUBLY-LINKED-QUEUE-EMPTY-P-METHOD", 1, 0, false);
        declareFunction(me, "basic_doubly_linked_queue_set_prioritizer_method", "BASIC-DOUBLY-LINKED-QUEUE-SET-PRIORITIZER-METHOD", 2, 0, false);
        declareFunction(me, "basic_doubly_linked_queue_get_prioritizer_method", "BASIC-DOUBLY-LINKED-QUEUE-GET-PRIORITIZER-METHOD", 1, 0, false);
        declareFunction(me, "basic_doubly_linked_queue_print_method", "BASIC-DOUBLY-LINKED-QUEUE-PRINT-METHOD", 3, 0, false);
        declareFunction(me, "basic_doubly_linked_queue_get_list_method", "BASIC-DOUBLY-LINKED-QUEUE-GET-LIST-METHOD", 1, 0, false);
        declareFunction(me, "basic_doubly_linked_queue_initialize_qua_doubly_linked_queue_method", "BASIC-DOUBLY-LINKED-QUEUE-INITIALIZE-QUA-DOUBLY-LINKED-QUEUE-METHOD", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_basic_doubly_linked_queue_class", "SUBLOOP-RESERVED-INITIALIZE-BASIC-DOUBLY-LINKED-QUEUE-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_basic_doubly_linked_queue_instance", "SUBLOOP-RESERVED-INITIALIZE-BASIC-DOUBLY-LINKED-QUEUE-INSTANCE", 1, 0, false);
        declareFunction(me, "basic_doubly_linked_queue_p", "BASIC-DOUBLY-LINKED-QUEUE-P", 1, 0, false);
        declareFunction(me, "basic_doubly_linked_queue_get_list_internal_method", "BASIC-DOUBLY-LINKED-QUEUE-GET-LIST-INTERNAL-METHOD", 1, 0, false);
        declareFunction(me, "basic_doubly_linked_queue_set_list_internal_method", "BASIC-DOUBLY-LINKED-QUEUE-SET-LIST-INTERNAL-METHOD", 2, 0, false);
        declareFunction(me, "basic_doubly_linked_queue_get_prioritizer_internal_method", "BASIC-DOUBLY-LINKED-QUEUE-GET-PRIORITIZER-INTERNAL-METHOD", 1, 0, false);
        declareFunction(me, "basic_doubly_linked_queue_set_prioritizer_internal_method", "BASIC-DOUBLY-LINKED-QUEUE-SET-PRIORITIZER-INTERNAL-METHOD", 2, 0, false);
        declareFunction(me, "basic_doubly_linked_queue_initialize_method", "BASIC-DOUBLY-LINKED-QUEUE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction(me, "basic_doubly_linked_queue_passive_p_method", "BASIC-DOUBLY-LINKED-QUEUE-PASSIVE-P-METHOD", 1, 0, false);
        declareFunction(me, "basic_doubly_linked_queue_set_passive_method", "BASIC-DOUBLY-LINKED-QUEUE-SET-PASSIVE-METHOD", 2, 0, false);
        declareFunction(me, "get_asynch_basic_doubly_linked_queue_lock_history", "GET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK-HISTORY", 1, 0, false);
        declareFunction(me, "set_asynch_basic_doubly_linked_queue_lock_history", "SET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK-HISTORY", 2, 0, false);
        declareFunction(me, "get_asynch_basic_doubly_linked_queue_lock", "GET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK", 1, 0, false);
        declareFunction(me, "set_asynch_basic_doubly_linked_queue_lock", "SET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_asynch_basic_doubly_linked_queue_class", "SUBLOOP-RESERVED-INITIALIZE-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_asynch_basic_doubly_linked_queue_instance", "SUBLOOP-RESERVED-INITIALIZE-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-INSTANCE", 1, 0, false);
        declareFunction(me, "asynch_basic_doubly_linked_queue_p", "ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-P", 1, 0, false);
        declareFunction(me, "asynch_basic_doubly_linked_queue_initialize_method", "ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction(me, "asynch_basic_doubly_linked_queue_set_prioritizer_method", "ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-SET-PRIORITIZER-METHOD", 2, 0, false);
        declareFunction(me, "asynch_basic_doubly_linked_queue_enqueue_method", "ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-ENQUEUE-METHOD", 2, 0, false);
        declareFunction(me, "asynch_basic_doubly_linked_queue_on_enqueue_method", "ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-ON-ENQUEUE-METHOD", 2, 0, false);
        declareFunction(me, "asynch_basic_doubly_linked_queue_remove_method", "ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-REMOVE-METHOD", 2, 0, false);
        declareFunction(me, "asynch_basic_doubly_linked_queue_dequeue_method", "ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-DEQUEUE-METHOD", 1, 0, false);
        declareFunction(me, "asynch_basic_doubly_linked_queue_set_contents_method", "ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-SET-CONTENTS-METHOD", 2, 0, false);
        declareFunction(me, "asynch_basic_doubly_linked_queue_clear_method", "ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-CLEAR-METHOD", 1, 0, false);
        declareFunction(me, "get_basic_doubly_linked_ipc_queue_semaphore", "GET-BASIC-DOUBLY-LINKED-IPC-QUEUE-SEMAPHORE", 1, 0, false);
        declareFunction(me, "set_basic_doubly_linked_ipc_queue_semaphore", "SET-BASIC-DOUBLY-LINKED-IPC-QUEUE-SEMAPHORE", 2, 0, false);
        declareFunction(me, "get_basic_doubly_linked_ipc_queue_lock", "GET-BASIC-DOUBLY-LINKED-IPC-QUEUE-LOCK", 1, 0, false);
        declareFunction(me, "set_basic_doubly_linked_ipc_queue_lock", "SET-BASIC-DOUBLY-LINKED-IPC-QUEUE-LOCK", 2, 0, false);
        declareFunction(me, "get_basic_doubly_linked_ipc_queue_semaphore_name", "GET-BASIC-DOUBLY-LINKED-IPC-QUEUE-SEMAPHORE-NAME", 1, 0, false);
        declareFunction(me, "set_basic_doubly_linked_ipc_queue_semaphore_name", "SET-BASIC-DOUBLY-LINKED-IPC-QUEUE-SEMAPHORE-NAME", 2, 0, false);
        declareFunction(me, "get_basic_doubly_linked_ipc_queue_base_suffix_counter", "GET-BASIC-DOUBLY-LINKED-IPC-QUEUE-BASE-SUFFIX-COUNTER", 1, 0, false);
        declareFunction(me, "set_basic_doubly_linked_ipc_queue_base_suffix_counter", "SET-BASIC-DOUBLY-LINKED-IPC-QUEUE-BASE-SUFFIX-COUNTER", 2, 0, false);
        declareFunction(me, "get_basic_doubly_linked_ipc_queue_base_name", "GET-BASIC-DOUBLY-LINKED-IPC-QUEUE-BASE-NAME", 1, 0, false);
        declareFunction(me, "set_basic_doubly_linked_ipc_queue_base_name", "SET-BASIC-DOUBLY-LINKED-IPC-QUEUE-BASE-NAME", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_basic_doubly_linked_ipc_queue_class", "SUBLOOP-RESERVED-INITIALIZE-BASIC-DOUBLY-LINKED-IPC-QUEUE-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_basic_doubly_linked_ipc_queue_instance", "SUBLOOP-RESERVED-INITIALIZE-BASIC-DOUBLY-LINKED-IPC-QUEUE-INSTANCE", 1, 0, false);
        declareFunction(me, "basic_doubly_linked_ipc_queue_p", "BASIC-DOUBLY-LINKED-IPC-QUEUE-P", 1, 0, false);
        declareFunction(me, "basic_doubly_linked_ipc_queue_initialize_method", "BASIC-DOUBLY-LINKED-IPC-QUEUE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction(me, "basic_doubly_linked_ipc_queue_set_prioritizer_method", "BASIC-DOUBLY-LINKED-IPC-QUEUE-SET-PRIORITIZER-METHOD", 2, 0, false);
        declareFunction(me, "basic_doubly_linked_ipc_queue_enqueue_method", "BASIC-DOUBLY-LINKED-IPC-QUEUE-ENQUEUE-METHOD", 2, 0, false);
        declareFunction(me, "basic_doubly_linked_ipc_queue_remove_method", "BASIC-DOUBLY-LINKED-IPC-QUEUE-REMOVE-METHOD", 2, 0, false);
        declareFunction(me, "basic_doubly_linked_ipc_queue_dequeue_method", "BASIC-DOUBLY-LINKED-IPC-QUEUE-DEQUEUE-METHOD", 1, 0, false);
        declareFunction(me, "basic_doubly_linked_ipc_queue_set_contents_method", "BASIC-DOUBLY-LINKED-IPC-QUEUE-SET-CONTENTS-METHOD", 2, 0, false);
        declareFunction(me, "basic_doubly_linked_ipc_queue_clear_method", "BASIC-DOUBLY-LINKED-IPC-QUEUE-CLEAR-METHOD", 1, 0, false);
        declareFunction(me, "get_basic_ipc_queue_prioritizer", "GET-BASIC-IPC-QUEUE-PRIORITIZER", 1, 0, false);
        declareFunction(me, "set_basic_ipc_queue_prioritizer", "SET-BASIC-IPC-QUEUE-PRIORITIZER", 2, 0, false);
        declareFunction(me, "get_basic_ipc_queue_actual_ipc_queue", "GET-BASIC-IPC-QUEUE-ACTUAL-IPC-QUEUE", 1, 0, false);
        declareFunction(me, "set_basic_ipc_queue_actual_ipc_queue", "SET-BASIC-IPC-QUEUE-ACTUAL-IPC-QUEUE", 2, 0, false);
        declareFunction(me, "get_basic_ipc_queue_is_passive", "GET-BASIC-IPC-QUEUE-IS-PASSIVE", 1, 0, false);
        declareFunction(me, "set_basic_ipc_queue_is_passive", "SET-BASIC-IPC-QUEUE-IS-PASSIVE", 2, 0, false);
        declareFunction(me, "basic_ipc_queue_on_enqueue_method", "BASIC-IPC-QUEUE-ON-ENQUEUE-METHOD", 2, 0, false);
        declareFunction(me, "basic_ipc_queue_print_method", "BASIC-IPC-QUEUE-PRINT-METHOD", 3, 0, false);
        declareFunction(me, "subloop_reserved_initialize_basic_ipc_queue_class", "SUBLOOP-RESERVED-INITIALIZE-BASIC-IPC-QUEUE-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_basic_ipc_queue_instance", "SUBLOOP-RESERVED-INITIALIZE-BASIC-IPC-QUEUE-INSTANCE", 1, 0, false);
        declareFunction(me, "basic_ipc_queue_p", "BASIC-IPC-QUEUE-P", 1, 0, false);
        declareFunction(me, "basic_ipc_queue_initialize_method", "BASIC-IPC-QUEUE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction(me, "basic_ipc_queue_get_actual_ipc_queue_method", "BASIC-IPC-QUEUE-GET-ACTUAL-IPC-QUEUE-METHOD", 1, 0, false);
        declareFunction(me, "basic_ipc_queue_set_actual_ipc_queue_method", "BASIC-IPC-QUEUE-SET-ACTUAL-IPC-QUEUE-METHOD", 2, 0, false);
        declareFunction(me, "basic_ipc_queue_get_prioritizer_method", "BASIC-IPC-QUEUE-GET-PRIORITIZER-METHOD", 1, 0, false);
        declareFunction(me, "basic_ipc_queue_set_prioritizer_method", "BASIC-IPC-QUEUE-SET-PRIORITIZER-METHOD", 2, 0, false);
        declareFunction(me, "basic_ipc_queue_empty_p_method", "BASIC-IPC-QUEUE-EMPTY-P-METHOD", 1, 0, false);
        declareFunction(me, "basic_ipc_queue_enqueue_method", "BASIC-IPC-QUEUE-ENQUEUE-METHOD", 2, 0, false);
        declareFunction(me, "basic_ipc_queue_remove_method", "BASIC-IPC-QUEUE-REMOVE-METHOD", 2, 0, false);
        declareFunction(me, "basic_ipc_queue_dequeue_method", "BASIC-IPC-QUEUE-DEQUEUE-METHOD", 1, 0, false);
        declareFunction(me, "basic_ipc_queue_get_element_count_method", "BASIC-IPC-QUEUE-GET-ELEMENT-COUNT-METHOD", 1, 0, false);
        declareFunction(me, "basic_ipc_queue_get_contents_method", "BASIC-IPC-QUEUE-GET-CONTENTS-METHOD", 1, 0, false);
        declareFunction(me, "basic_ipc_queue_set_contents_method", "BASIC-IPC-QUEUE-SET-CONTENTS-METHOD", 2, 0, false);
        declareFunction(me, "basic_ipc_queue_clear_method", "BASIC-IPC-QUEUE-CLEAR-METHOD", 1, 0, false);
        declareFunction(me, "basic_ipc_queue_reorder_contents_method", "BASIC-IPC-QUEUE-REORDER-CONTENTS-METHOD", 2, 0, false);
        declareFunction(me, "basic_ipc_queue_peek_method", "BASIC-IPC-QUEUE-PEEK-METHOD", 1, 0, false);
        declareFunction(me, "basic_ipc_queue_enqueued_p_method", "BASIC-IPC-QUEUE-ENQUEUED-P-METHOD", 2, 0, false);
        declareFunction(me, "basic_ipc_queue_find_method", "BASIC-IPC-QUEUE-FIND-METHOD", 2, 2, false);
        declareFunction(me, "basic_ipc_queue_passive_p_method", "BASIC-IPC-QUEUE-PASSIVE-P-METHOD", 1, 0, false);
        declareFunction(me, "basic_ipc_queue_set_passive_method", "BASIC-IPC-QUEUE-SET-PASSIVE-METHOD", 2, 0, false);
        declareFunction(me, "queue_interface_get_prioritizer", "QUEUE-INTERFACE-GET-PRIORITIZER", 1, 0, false);
        declareFunction(me, "queue_interface_set_prioritizer", "QUEUE-INTERFACE-SET-PRIORITIZER", 2, 0, false);
        declareFunction(me, "queue_interface_empty_p", "QUEUE-INTERFACE-EMPTY-P", 1, 0, false);
        declareFunction(me, "queue_interface_enqueue", "QUEUE-INTERFACE-ENQUEUE", 2, 0, false);
        declareFunction(me, "queue_interface_remove", "QUEUE-INTERFACE-REMOVE", 2, 0, false);
        declareFunction(me, "queue_interface_dequeue", "QUEUE-INTERFACE-DEQUEUE", 1, 0, false);
        declareFunction(me, "queue_interface_get_element_count", "QUEUE-INTERFACE-GET-ELEMENT-COUNT", 1, 0, false);
        declareFunction(me, "queue_interface_get_contents", "QUEUE-INTERFACE-GET-CONTENTS", 1, 0, false);
        declareFunction(me, "queue_interface_set_contents", "QUEUE-INTERFACE-SET-CONTENTS", 2, 0, false);
        declareFunction(me, "queue_interface_clear", "QUEUE-INTERFACE-CLEAR", 1, 0, false);
        declareFunction(me, "queue_interface_reorder_contents", "QUEUE-INTERFACE-REORDER-CONTENTS", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_subloop_queues_file() {
        return NIL;
    }

    public static SubLObject setup_subloop_queues_file() {
        interfaces.new_interface(QUEUE_ELEMENT_INTERFACE, NIL, NIL, $list1);
        interfaces.new_interface(QUEUE_PRIORITIZER_INTERFACE, NIL, NIL, $list3);
        interfaces.new_interface(QUEUE_PRIORITIZER_TEMPLATE, $list5, $list6, $list7);
        interfaces.interfaces_add_interface_instance_method(ORDER_QUEUE, QUEUE_PRIORITIZER_TEMPLATE, $list9, $list10, $list11);
        interfaces.new_interface(QUEUE_SIMPLE_SORTER_TEMPLATE, $list13, $list14, $list15);
        interfaces.interfaces_add_interface_instance_method(ORDER_QUEUE_INTERNAL, QUEUE_SIMPLE_SORTER_TEMPLATE, $list17, $list18, $list19);
        classes.subloop_new_class(BASIC_QUEUE_SIMPLE_SORTER, OBJECT, $list22, NIL, $list23);
        classes.class_set_implements_slot_listeners(BASIC_QUEUE_SIMPLE_SORTER, NIL);
        methods.methods_incorporate_instance_method(ORDER_QUEUE_INTERNAL, BASIC_QUEUE_SIMPLE_SORTER, $list17, $list18, $list19);
        methods.subloop_register_instance_method(BASIC_QUEUE_SIMPLE_SORTER, ORDER_QUEUE_INTERNAL, BASIC_QUEUE_SIMPLE_SORTER_ORDER_QUEUE_INTERNAL_METHOD);
        methods.methods_incorporate_instance_method(ORDER_QUEUE, BASIC_QUEUE_SIMPLE_SORTER, $list9, $list10, $list11);
        methods.subloop_register_instance_method(BASIC_QUEUE_SIMPLE_SORTER, ORDER_QUEUE, BASIC_QUEUE_SIMPLE_SORTER_ORDER_QUEUE_METHOD);
        classes.subloop_note_class_initialization_function(BASIC_QUEUE_SIMPLE_SORTER, SUBLOOP_RESERVED_INITIALIZE_BASIC_QUEUE_SIMPLE_SORTER_CLASS);
        classes.subloop_note_instance_initialization_function(BASIC_QUEUE_SIMPLE_SORTER, SUBLOOP_RESERVED_INITIALIZE_BASIC_QUEUE_SIMPLE_SORTER_INSTANCE);
        subloop_reserved_initialize_basic_queue_simple_sorter_class(BASIC_QUEUE_SIMPLE_SORTER);
        methods.methods_incorporate_instance_method(INITIALIZE, BASIC_QUEUE_SIMPLE_SORTER, $list17, NIL, $list36);
        methods.subloop_register_instance_method(BASIC_QUEUE_SIMPLE_SORTER, INITIALIZE, BASIC_QUEUE_SIMPLE_SORTER_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(GET_SORT_PREDICATE, BASIC_QUEUE_SIMPLE_SORTER, $list9, NIL, $list40);
        methods.subloop_register_instance_method(BASIC_QUEUE_SIMPLE_SORTER, GET_SORT_PREDICATE, BASIC_QUEUE_SIMPLE_SORTER_GET_SORT_PREDICATE_METHOD);
        methods.methods_incorporate_instance_method(SET_SORT_PREDICATE, BASIC_QUEUE_SIMPLE_SORTER, $list9, $list44, $list45);
        methods.subloop_register_instance_method(BASIC_QUEUE_SIMPLE_SORTER, SET_SORT_PREDICATE, BASIC_QUEUE_SIMPLE_SORTER_SET_SORT_PREDICATE_METHOD);
        methods.methods_incorporate_instance_method(GET_ELEMENT_KEY, BASIC_QUEUE_SIMPLE_SORTER, $list9, NIL, $list49);
        methods.subloop_register_instance_method(BASIC_QUEUE_SIMPLE_SORTER, GET_ELEMENT_KEY, BASIC_QUEUE_SIMPLE_SORTER_GET_ELEMENT_KEY_METHOD);
        methods.methods_incorporate_instance_method(SET_ELEMENT_KEY, BASIC_QUEUE_SIMPLE_SORTER, $list9, $list53, $list54);
        methods.subloop_register_instance_method(BASIC_QUEUE_SIMPLE_SORTER, SET_ELEMENT_KEY, BASIC_QUEUE_SIMPLE_SORTER_SET_ELEMENT_KEY_METHOD);
        interfaces.new_interface(QUEUE_INTERFACE, NIL, NIL, $list58);
        interfaces.interfaces_add_interface_instance_method(PRINT, QUEUE_INTERFACE, $list9, $list60, $list61);
        interfaces.interfaces_add_interface_instance_method(ON_ENQUEUE, QUEUE_INTERFACE, $list9, $list63, $list64);
        interfaces.new_interface(END_POINTER_QUEUE_TEMPLATE, $list66, $list67, $list68);
        interfaces.interfaces_add_interface_instance_method(EMPTY_P, END_POINTER_QUEUE_TEMPLATE, $list9, NIL, $list70);
        interfaces.interfaces_add_interface_instance_method(ENQUEUE, END_POINTER_QUEUE_TEMPLATE, $list9, $list63, $list72);
        interfaces.interfaces_add_interface_instance_method(REMOVE, END_POINTER_QUEUE_TEMPLATE, $list9, $list74, $list75);
        interfaces.interfaces_add_interface_instance_method(DEQUEUE, END_POINTER_QUEUE_TEMPLATE, $list9, NIL, $list77);
        interfaces.interfaces_add_interface_instance_method(FIND, END_POINTER_QUEUE_TEMPLATE, NIL, $list79, $list80);
        interfaces.interfaces_add_interface_instance_method(GET_ELEMENT_COUNT, END_POINTER_QUEUE_TEMPLATE, $list9, NIL, $list82);
        interfaces.interfaces_add_interface_instance_method(GET_CONTENTS, END_POINTER_QUEUE_TEMPLATE, $list9, NIL, $list84);
        interfaces.interfaces_add_interface_instance_method(SET_CONTENTS, END_POINTER_QUEUE_TEMPLATE, $list9, $list86, $list87);
        interfaces.interfaces_add_interface_instance_method(CLEAR, END_POINTER_QUEUE_TEMPLATE, $list9, NIL, $list89);
        interfaces.interfaces_add_interface_instance_method(REORDER_CONTENTS, END_POINTER_QUEUE_TEMPLATE, $list9, $list91, $list92);
        interfaces.interfaces_add_interface_instance_method(PEEK, END_POINTER_QUEUE_TEMPLATE, $list9, NIL, $list94);
        interfaces.interfaces_add_interface_instance_method(ENQUEUED_P, END_POINTER_QUEUE_TEMPLATE, $list9, $list96, $list97);
        classes.subloop_new_class(BASIC_QUEUE, OBJECT, $list99, NIL, $list100);
        classes.class_set_implements_slot_listeners(BASIC_QUEUE, NIL);
        methods.methods_incorporate_instance_method(ENQUEUED_P, BASIC_QUEUE, $list9, $list96, $list97);
        methods.subloop_register_instance_method(BASIC_QUEUE, ENQUEUED_P, BASIC_QUEUE_ENQUEUED_P_METHOD);
        methods.methods_incorporate_instance_method(PEEK, BASIC_QUEUE, $list9, NIL, $list94);
        methods.subloop_register_instance_method(BASIC_QUEUE, PEEK, BASIC_QUEUE_PEEK_METHOD);
        methods.methods_incorporate_instance_method(REORDER_CONTENTS, BASIC_QUEUE, $list9, $list91, $list92);
        methods.subloop_register_instance_method(BASIC_QUEUE, REORDER_CONTENTS, BASIC_QUEUE_REORDER_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method(CLEAR, BASIC_QUEUE, $list9, NIL, $list89);
        methods.subloop_register_instance_method(BASIC_QUEUE, CLEAR, BASIC_QUEUE_CLEAR_METHOD);
        methods.methods_incorporate_instance_method(SET_CONTENTS, BASIC_QUEUE, $list9, $list86, $list87);
        methods.subloop_register_instance_method(BASIC_QUEUE, SET_CONTENTS, BASIC_QUEUE_SET_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method(GET_CONTENTS, BASIC_QUEUE, $list9, NIL, $list84);
        methods.subloop_register_instance_method(BASIC_QUEUE, GET_CONTENTS, BASIC_QUEUE_GET_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method(GET_ELEMENT_COUNT, BASIC_QUEUE, $list9, NIL, $list82);
        methods.subloop_register_instance_method(BASIC_QUEUE, GET_ELEMENT_COUNT, BASIC_QUEUE_GET_ELEMENT_COUNT_METHOD);
        methods.methods_incorporate_instance_method(FIND, BASIC_QUEUE, NIL, $list79, $list80);
        methods.subloop_register_instance_method(BASIC_QUEUE, FIND, BASIC_QUEUE_FIND_METHOD);
        methods.methods_incorporate_instance_method(DEQUEUE, BASIC_QUEUE, $list9, NIL, $list77);
        methods.subloop_register_instance_method(BASIC_QUEUE, DEQUEUE, BASIC_QUEUE_DEQUEUE_METHOD);
        methods.methods_incorporate_instance_method(REMOVE, BASIC_QUEUE, $list9, $list74, $list75);
        methods.subloop_register_instance_method(BASIC_QUEUE, REMOVE, BASIC_QUEUE_REMOVE_METHOD);
        methods.methods_incorporate_instance_method(ON_ENQUEUE, BASIC_QUEUE, $list9, $list63, $list64);
        methods.subloop_register_instance_method(BASIC_QUEUE, ON_ENQUEUE, BASIC_QUEUE_ON_ENQUEUE_METHOD);
        methods.methods_incorporate_instance_method(ENQUEUE, BASIC_QUEUE, $list9, $list63, $list72);
        methods.subloop_register_instance_method(BASIC_QUEUE, ENQUEUE, BASIC_QUEUE_ENQUEUE_METHOD);
        methods.methods_incorporate_instance_method(EMPTY_P, BASIC_QUEUE, $list9, NIL, $list70);
        methods.subloop_register_instance_method(BASIC_QUEUE, EMPTY_P, BASIC_QUEUE_EMPTY_P_METHOD);
        methods.methods_incorporate_instance_method(PRINT, BASIC_QUEUE, $list9, $list60, $list61);
        methods.subloop_register_instance_method(BASIC_QUEUE, PRINT, BASIC_QUEUE_PRINT_METHOD);
        classes.subloop_note_class_initialization_function(BASIC_QUEUE, SUBLOOP_RESERVED_INITIALIZE_BASIC_QUEUE_CLASS);
        classes.subloop_note_instance_initialization_function(BASIC_QUEUE, SUBLOOP_RESERVED_INITIALIZE_BASIC_QUEUE_INSTANCE);
        subloop_reserved_initialize_basic_queue_class(BASIC_QUEUE);
        methods.methods_incorporate_instance_method(INITIALIZE, BASIC_QUEUE, $list17, NIL, $list130);
        methods.subloop_register_instance_method(BASIC_QUEUE, INITIALIZE, BASIC_QUEUE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(GET_FIRST_CONS, BASIC_QUEUE, $list17, NIL, $list134);
        methods.subloop_register_instance_method(BASIC_QUEUE, GET_FIRST_CONS, BASIC_QUEUE_GET_FIRST_CONS_METHOD);
        methods.methods_incorporate_instance_method(SET_FIRST_CONS, BASIC_QUEUE, $list17, $list138, $list139);
        methods.subloop_register_instance_method(BASIC_QUEUE, SET_FIRST_CONS, BASIC_QUEUE_SET_FIRST_CONS_METHOD);
        methods.methods_incorporate_instance_method(GET_END_POINTER, BASIC_QUEUE, $list9, NIL, $list143);
        methods.subloop_register_instance_method(BASIC_QUEUE, GET_END_POINTER, BASIC_QUEUE_GET_END_POINTER_METHOD);
        methods.methods_incorporate_instance_method(SET_END_POINTER, BASIC_QUEUE, $list9, $list147, $list148);
        methods.subloop_register_instance_method(BASIC_QUEUE, SET_END_POINTER, BASIC_QUEUE_SET_END_POINTER_METHOD);
        methods.methods_incorporate_instance_method(GET_PRIORITIZER, BASIC_QUEUE, $list9, NIL, $list152);
        methods.subloop_register_instance_method(BASIC_QUEUE, GET_PRIORITIZER, BASIC_QUEUE_GET_PRIORITIZER_METHOD);
        methods.methods_incorporate_instance_method(SET_PRIORITIZER, BASIC_QUEUE, $list9, $list156, $list157);
        methods.subloop_register_instance_method(BASIC_QUEUE, SET_PRIORITIZER, BASIC_QUEUE_SET_PRIORITIZER_METHOD);
        methods.methods_incorporate_instance_method(PASSIVE_P, BASIC_QUEUE, $list162, NIL, $list163);
        methods.subloop_register_instance_method(BASIC_QUEUE, PASSIVE_P, BASIC_QUEUE_PASSIVE_P_METHOD);
        methods.methods_incorporate_instance_method(SET_PASSIVE, BASIC_QUEUE, $list9, $list166, $list167);
        methods.subloop_register_instance_method(BASIC_QUEUE, SET_PASSIVE, BASIC_QUEUE_SET_PASSIVE_METHOD);
        interfaces.new_interface(DOUBLY_LINKED_QUEUE_TEMPLATE, $list66, $list67, $list171);
        interfaces.interfaces_add_interface_instance_method(INITIALIZE_QUA_DOUBLY_LINKED_QUEUE, DOUBLY_LINKED_QUEUE_TEMPLATE, $list17, NIL, $list173);
        interfaces.interfaces_add_interface_instance_method(GET_LIST, DOUBLY_LINKED_QUEUE_TEMPLATE, $list17, NIL, $list175);
        interfaces.interfaces_add_interface_instance_method(PRINT, DOUBLY_LINKED_QUEUE_TEMPLATE, $list9, $list60, $list176);
        interfaces.interfaces_add_interface_instance_method(GET_PRIORITIZER, DOUBLY_LINKED_QUEUE_TEMPLATE, $list9, NIL, $list177);
        interfaces.interfaces_add_interface_instance_method(SET_PRIORITIZER, DOUBLY_LINKED_QUEUE_TEMPLATE, $list9, $list156, $list178);
        interfaces.interfaces_add_interface_instance_method(EMPTY_P, DOUBLY_LINKED_QUEUE_TEMPLATE, $list9, NIL, $list179);
        interfaces.interfaces_add_interface_instance_method(ENQUEUE, DOUBLY_LINKED_QUEUE_TEMPLATE, $list9, $list63, $list180);
        interfaces.interfaces_add_interface_instance_method(REMOVE, DOUBLY_LINKED_QUEUE_TEMPLATE, $list9, $list74, $list181);
        interfaces.interfaces_add_interface_instance_method(DEQUEUE, DOUBLY_LINKED_QUEUE_TEMPLATE, $list9, NIL, $list182);
        interfaces.interfaces_add_interface_instance_method(FIND, DOUBLY_LINKED_QUEUE_TEMPLATE, $list9, $list79, $list183);
        interfaces.interfaces_add_interface_instance_method(GET_ELEMENT_COUNT, DOUBLY_LINKED_QUEUE_TEMPLATE, $list9, NIL, $list184);
        interfaces.interfaces_add_interface_instance_method(GET_CONTENTS, DOUBLY_LINKED_QUEUE_TEMPLATE, $list9, NIL, $list185);
        interfaces.interfaces_add_interface_instance_method(SET_CONTENTS, DOUBLY_LINKED_QUEUE_TEMPLATE, $list9, $list86, $list186);
        interfaces.interfaces_add_interface_instance_method(CLEAR, DOUBLY_LINKED_QUEUE_TEMPLATE, $list9, NIL, $list187);
        interfaces.interfaces_add_interface_instance_method(REORDER_CONTENTS, DOUBLY_LINKED_QUEUE_TEMPLATE, $list9, $list91, $list188);
        interfaces.interfaces_add_interface_instance_method(PEEK, DOUBLY_LINKED_QUEUE_TEMPLATE, $list9, NIL, $list189);
        interfaces.interfaces_add_interface_instance_method(ENQUEUED_P, DOUBLY_LINKED_QUEUE_TEMPLATE, $list9, $list96, $list190);
        classes.subloop_new_class(BASIC_DOUBLY_LINKED_QUEUE, OBJECT, $list192, NIL, $list193);
        classes.class_set_implements_slot_listeners(BASIC_DOUBLY_LINKED_QUEUE, NIL);
        methods.methods_incorporate_instance_method(ENQUEUED_P, BASIC_DOUBLY_LINKED_QUEUE, $list9, $list96, $list190);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_QUEUE, ENQUEUED_P, BASIC_DOUBLY_LINKED_QUEUE_ENQUEUED_P_METHOD);
        methods.methods_incorporate_instance_method(PEEK, BASIC_DOUBLY_LINKED_QUEUE, $list9, NIL, $list189);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_QUEUE, PEEK, BASIC_DOUBLY_LINKED_QUEUE_PEEK_METHOD);
        methods.methods_incorporate_instance_method(REORDER_CONTENTS, BASIC_DOUBLY_LINKED_QUEUE, $list9, $list91, $list188);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_QUEUE, REORDER_CONTENTS, BASIC_DOUBLY_LINKED_QUEUE_REORDER_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method(CLEAR, BASIC_DOUBLY_LINKED_QUEUE, $list9, NIL, $list187);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_QUEUE, CLEAR, BASIC_DOUBLY_LINKED_QUEUE_CLEAR_METHOD);
        methods.methods_incorporate_instance_method(SET_CONTENTS, BASIC_DOUBLY_LINKED_QUEUE, $list9, $list86, $list186);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_QUEUE, SET_CONTENTS, BASIC_DOUBLY_LINKED_QUEUE_SET_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method(GET_CONTENTS, BASIC_DOUBLY_LINKED_QUEUE, $list9, NIL, $list185);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_QUEUE, GET_CONTENTS, BASIC_DOUBLY_LINKED_QUEUE_GET_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method(GET_ELEMENT_COUNT, BASIC_DOUBLY_LINKED_QUEUE, $list9, NIL, $list184);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_QUEUE, GET_ELEMENT_COUNT, BASIC_DOUBLY_LINKED_QUEUE_GET_ELEMENT_COUNT_METHOD);
        methods.methods_incorporate_instance_method(FIND, BASIC_DOUBLY_LINKED_QUEUE, $list9, $list79, $list183);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_QUEUE, FIND, BASIC_DOUBLY_LINKED_QUEUE_FIND_METHOD);
        methods.methods_incorporate_instance_method(DEQUEUE, BASIC_DOUBLY_LINKED_QUEUE, $list9, NIL, $list182);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_QUEUE, DEQUEUE, BASIC_DOUBLY_LINKED_QUEUE_DEQUEUE_METHOD);
        methods.methods_incorporate_instance_method(REMOVE, BASIC_DOUBLY_LINKED_QUEUE, $list9, $list74, $list181);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_QUEUE, REMOVE, BASIC_DOUBLY_LINKED_QUEUE_REMOVE_METHOD);
        methods.methods_incorporate_instance_method(ON_ENQUEUE, BASIC_DOUBLY_LINKED_QUEUE, $list9, $list63, $list64);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_QUEUE, ON_ENQUEUE, BASIC_DOUBLY_LINKED_QUEUE_ON_ENQUEUE_METHOD);
        methods.methods_incorporate_instance_method(ENQUEUE, BASIC_DOUBLY_LINKED_QUEUE, $list9, $list63, $list180);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_QUEUE, ENQUEUE, BASIC_DOUBLY_LINKED_QUEUE_ENQUEUE_METHOD);
        methods.methods_incorporate_instance_method(EMPTY_P, BASIC_DOUBLY_LINKED_QUEUE, $list9, NIL, $list179);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_QUEUE, EMPTY_P, BASIC_DOUBLY_LINKED_QUEUE_EMPTY_P_METHOD);
        methods.methods_incorporate_instance_method(SET_PRIORITIZER, BASIC_DOUBLY_LINKED_QUEUE, $list9, $list156, $list178);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_QUEUE, SET_PRIORITIZER, BASIC_DOUBLY_LINKED_QUEUE_SET_PRIORITIZER_METHOD);
        methods.methods_incorporate_instance_method(GET_PRIORITIZER, BASIC_DOUBLY_LINKED_QUEUE, $list9, NIL, $list177);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_QUEUE, GET_PRIORITIZER, BASIC_DOUBLY_LINKED_QUEUE_GET_PRIORITIZER_METHOD);
        methods.methods_incorporate_instance_method(PRINT, BASIC_DOUBLY_LINKED_QUEUE, $list9, $list60, $list176);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_QUEUE, PRINT, BASIC_DOUBLY_LINKED_QUEUE_PRINT_METHOD);
        methods.methods_incorporate_instance_method(GET_LIST, BASIC_DOUBLY_LINKED_QUEUE, $list17, NIL, $list175);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_QUEUE, GET_LIST, BASIC_DOUBLY_LINKED_QUEUE_GET_LIST_METHOD);
        methods.methods_incorporate_instance_method(INITIALIZE_QUA_DOUBLY_LINKED_QUEUE, BASIC_DOUBLY_LINKED_QUEUE, $list17, NIL, $list173);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_QUEUE, INITIALIZE_QUA_DOUBLY_LINKED_QUEUE, $sym221$BASIC_DOUBLY_LINKED_QUEUE_INITIALIZE_QUA_DOUBLY_LINKED_QUEUE_METH);
        classes.subloop_note_class_initialization_function(BASIC_DOUBLY_LINKED_QUEUE, SUBLOOP_RESERVED_INITIALIZE_BASIC_DOUBLY_LINKED_QUEUE_CLASS);
        classes.subloop_note_instance_initialization_function(BASIC_DOUBLY_LINKED_QUEUE, SUBLOOP_RESERVED_INITIALIZE_BASIC_DOUBLY_LINKED_QUEUE_INSTANCE);
        subloop_reserved_initialize_basic_doubly_linked_queue_class(BASIC_DOUBLY_LINKED_QUEUE);
        methods.methods_incorporate_instance_method(GET_LIST_INTERNAL, BASIC_DOUBLY_LINKED_QUEUE, $list17, NIL, $list225);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_QUEUE, GET_LIST_INTERNAL, BASIC_DOUBLY_LINKED_QUEUE_GET_LIST_INTERNAL_METHOD);
        methods.methods_incorporate_instance_method(SET_LIST_INTERNAL, BASIC_DOUBLY_LINKED_QUEUE, $list17, $list229, $list230);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_QUEUE, SET_LIST_INTERNAL, BASIC_DOUBLY_LINKED_QUEUE_SET_LIST_INTERNAL_METHOD);
        methods.methods_incorporate_instance_method(GET_PRIORITIZER_INTERNAL, BASIC_DOUBLY_LINKED_QUEUE, $list17, NIL, $list152);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_QUEUE, GET_PRIORITIZER_INTERNAL, BASIC_DOUBLY_LINKED_QUEUE_GET_PRIORITIZER_INTERNAL_METHOD);
        methods.methods_incorporate_instance_method(SET_PRIORITIZER_INTERNAL, BASIC_DOUBLY_LINKED_QUEUE, $list17, $list156, $list237);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_QUEUE, SET_PRIORITIZER_INTERNAL, BASIC_DOUBLY_LINKED_QUEUE_SET_PRIORITIZER_INTERNAL_METHOD);
        methods.methods_incorporate_instance_method(INITIALIZE, BASIC_DOUBLY_LINKED_QUEUE, $list17, NIL, $list240);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_QUEUE, INITIALIZE, BASIC_DOUBLY_LINKED_QUEUE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PASSIVE_P, BASIC_DOUBLY_LINKED_QUEUE, $list162, NIL, $list163);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_QUEUE, PASSIVE_P, BASIC_DOUBLY_LINKED_QUEUE_PASSIVE_P_METHOD);
        methods.methods_incorporate_instance_method(SET_PASSIVE, BASIC_DOUBLY_LINKED_QUEUE, $list9, $list166, $list167);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_QUEUE, SET_PASSIVE, BASIC_DOUBLY_LINKED_QUEUE_SET_PASSIVE_METHOD);
        classes.subloop_new_class(ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, BASIC_DOUBLY_LINKED_QUEUE, NIL, NIL, $list246);
        classes.class_set_implements_slot_listeners(ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, NIL);
        classes.subloop_note_class_initialization_function(ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, $sym248$SUBLOOP_RESERVED_INITIALIZE_ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_CLAS);
        classes.subloop_note_instance_initialization_function(ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, $sym250$SUBLOOP_RESERVED_INITIALIZE_ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_INST);
        subloop_reserved_initialize_asynch_basic_doubly_linked_queue_class(ASYNCH_BASIC_DOUBLY_LINKED_QUEUE);
        methods.methods_incorporate_instance_method(INITIALIZE, ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, $list17, NIL, $list251);
        methods.subloop_register_instance_method(ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, INITIALIZE, ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(SET_PRIORITIZER, ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, $list255, $list156, $list256);
        methods.subloop_register_instance_method(ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, SET_PRIORITIZER, ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_SET_PRIORITIZER_METHOD);
        methods.methods_incorporate_instance_method(ENQUEUE, ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, $list255, $list63, $list258);
        methods.subloop_register_instance_method(ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, ENQUEUE, ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_ENQUEUE_METHOD);
        methods.methods_incorporate_instance_method(ON_ENQUEUE, ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, $list9, $list63, $list64);
        methods.subloop_register_instance_method(ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, ON_ENQUEUE, ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_ON_ENQUEUE_METHOD);
        methods.methods_incorporate_instance_method(REMOVE, ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, $list255, $list74, $list265);
        methods.subloop_register_instance_method(ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, REMOVE, ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_REMOVE_METHOD);
        methods.methods_incorporate_instance_method(DEQUEUE, ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, $list255, NIL, $list268);
        methods.subloop_register_instance_method(ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, DEQUEUE, ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_DEQUEUE_METHOD);
        methods.methods_incorporate_instance_method(SET_CONTENTS, ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, $list255, $list86, $list271);
        methods.subloop_register_instance_method(ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, SET_CONTENTS, ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_SET_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method(CLEAR, ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, $list255, NIL, $list274);
        methods.subloop_register_instance_method(ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, CLEAR, ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_CLEAR_METHOD);
        classes.subloop_new_class(BASIC_DOUBLY_LINKED_IPC_QUEUE, BASIC_DOUBLY_LINKED_QUEUE, NIL, NIL, $list278);
        classes.class_set_implements_slot_listeners(BASIC_DOUBLY_LINKED_IPC_QUEUE, NIL);
        classes.subloop_note_class_initialization_function(BASIC_DOUBLY_LINKED_IPC_QUEUE, SUBLOOP_RESERVED_INITIALIZE_BASIC_DOUBLY_LINKED_IPC_QUEUE_CLASS);
        classes.subloop_note_instance_initialization_function(BASIC_DOUBLY_LINKED_IPC_QUEUE, $sym285$SUBLOOP_RESERVED_INITIALIZE_BASIC_DOUBLY_LINKED_IPC_QUEUE_INSTANC);
        subloop_reserved_initialize_basic_doubly_linked_ipc_queue_class(BASIC_DOUBLY_LINKED_IPC_QUEUE);
        methods.methods_incorporate_instance_method(INITIALIZE, BASIC_DOUBLY_LINKED_IPC_QUEUE, $list17, NIL, $list286);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_IPC_QUEUE, INITIALIZE, BASIC_DOUBLY_LINKED_IPC_QUEUE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(SET_PRIORITIZER, BASIC_DOUBLY_LINKED_IPC_QUEUE, $list9, $list156, $list291);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_IPC_QUEUE, SET_PRIORITIZER, BASIC_DOUBLY_LINKED_IPC_QUEUE_SET_PRIORITIZER_METHOD);
        methods.methods_incorporate_instance_method(ENQUEUE, BASIC_DOUBLY_LINKED_IPC_QUEUE, $list9, $list63, $list294);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_IPC_QUEUE, ENQUEUE, BASIC_DOUBLY_LINKED_IPC_QUEUE_ENQUEUE_METHOD);
        methods.methods_incorporate_instance_method(REMOVE, BASIC_DOUBLY_LINKED_IPC_QUEUE, $list9, $list74, $list297);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_IPC_QUEUE, REMOVE, BASIC_DOUBLY_LINKED_IPC_QUEUE_REMOVE_METHOD);
        methods.methods_incorporate_instance_method(DEQUEUE, BASIC_DOUBLY_LINKED_IPC_QUEUE, $list9, NIL, $list300);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_IPC_QUEUE, DEQUEUE, BASIC_DOUBLY_LINKED_IPC_QUEUE_DEQUEUE_METHOD);
        methods.methods_incorporate_instance_method(SET_CONTENTS, BASIC_DOUBLY_LINKED_IPC_QUEUE, $list9, $list86, $list303);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_IPC_QUEUE, SET_CONTENTS, BASIC_DOUBLY_LINKED_IPC_QUEUE_SET_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method(CLEAR, BASIC_DOUBLY_LINKED_IPC_QUEUE, $list9, NIL, $list306);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_IPC_QUEUE, CLEAR, BASIC_DOUBLY_LINKED_IPC_QUEUE_CLEAR_METHOD);
        classes.subloop_new_class(BASIC_IPC_QUEUE, OBJECT, $list66, NIL, $list310);
        classes.class_set_implements_slot_listeners(BASIC_IPC_QUEUE, NIL);
        methods.methods_incorporate_instance_method(ON_ENQUEUE, BASIC_IPC_QUEUE, $list9, $list63, $list64);
        methods.subloop_register_instance_method(BASIC_IPC_QUEUE, ON_ENQUEUE, BASIC_IPC_QUEUE_ON_ENQUEUE_METHOD);
        methods.methods_incorporate_instance_method(PRINT, BASIC_IPC_QUEUE, $list9, $list60, $list61);
        methods.subloop_register_instance_method(BASIC_IPC_QUEUE, PRINT, BASIC_IPC_QUEUE_PRINT_METHOD);
        classes.subloop_note_class_initialization_function(BASIC_IPC_QUEUE, SUBLOOP_RESERVED_INITIALIZE_BASIC_IPC_QUEUE_CLASS);
        classes.subloop_note_instance_initialization_function(BASIC_IPC_QUEUE, SUBLOOP_RESERVED_INITIALIZE_BASIC_IPC_QUEUE_INSTANCE);
        subloop_reserved_initialize_basic_ipc_queue_class(BASIC_IPC_QUEUE);
        methods.methods_incorporate_instance_method(INITIALIZE, BASIC_IPC_QUEUE, $list17, NIL, $list316);
        methods.subloop_register_instance_method(BASIC_IPC_QUEUE, INITIALIZE, BASIC_IPC_QUEUE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(GET_ACTUAL_IPC_QUEUE, BASIC_IPC_QUEUE, $list162, NIL, $list321);
        methods.subloop_register_instance_method(BASIC_IPC_QUEUE, GET_ACTUAL_IPC_QUEUE, BASIC_IPC_QUEUE_GET_ACTUAL_IPC_QUEUE_METHOD);
        methods.methods_incorporate_instance_method(SET_ACTUAL_IPC_QUEUE, BASIC_IPC_QUEUE, $list9, $list324, $list325);
        methods.subloop_register_instance_method(BASIC_IPC_QUEUE, SET_ACTUAL_IPC_QUEUE, BASIC_IPC_QUEUE_SET_ACTUAL_IPC_QUEUE_METHOD);
        methods.methods_incorporate_instance_method(GET_PRIORITIZER, BASIC_IPC_QUEUE, $list9, NIL, $list152);
        methods.subloop_register_instance_method(BASIC_IPC_QUEUE, GET_PRIORITIZER, BASIC_IPC_QUEUE_GET_PRIORITIZER_METHOD);
        methods.methods_incorporate_instance_method(SET_PRIORITIZER, BASIC_IPC_QUEUE, $list9, $list156, $list157);
        methods.subloop_register_instance_method(BASIC_IPC_QUEUE, SET_PRIORITIZER, BASIC_IPC_QUEUE_SET_PRIORITIZER_METHOD);
        methods.methods_incorporate_instance_method(EMPTY_P, BASIC_IPC_QUEUE, $list162, NIL, $list333);
        methods.subloop_register_instance_method(BASIC_IPC_QUEUE, EMPTY_P, BASIC_IPC_QUEUE_EMPTY_P_METHOD);
        methods.methods_incorporate_instance_method(ENQUEUE, BASIC_IPC_QUEUE, $list162, $list63, $list335);
        methods.subloop_register_instance_method(BASIC_IPC_QUEUE, ENQUEUE, BASIC_IPC_QUEUE_ENQUEUE_METHOD);
        methods.methods_incorporate_instance_method(REMOVE, BASIC_IPC_QUEUE, $list9, $list74, $list337);
        methods.subloop_register_instance_method(BASIC_IPC_QUEUE, REMOVE, BASIC_IPC_QUEUE_REMOVE_METHOD);
        methods.methods_incorporate_instance_method(DEQUEUE, BASIC_IPC_QUEUE, $list9, NIL, $list340);
        methods.subloop_register_instance_method(BASIC_IPC_QUEUE, DEQUEUE, BASIC_IPC_QUEUE_DEQUEUE_METHOD);
        methods.methods_incorporate_instance_method(GET_ELEMENT_COUNT, BASIC_IPC_QUEUE, $list9, NIL, $list343);
        methods.subloop_register_instance_method(BASIC_IPC_QUEUE, GET_ELEMENT_COUNT, BASIC_IPC_QUEUE_GET_ELEMENT_COUNT_METHOD);
        methods.methods_incorporate_instance_method(GET_CONTENTS, BASIC_IPC_QUEUE, $list162, NIL, $list346);
        methods.subloop_register_instance_method(BASIC_IPC_QUEUE, GET_CONTENTS, BASIC_IPC_QUEUE_GET_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method(SET_CONTENTS, BASIC_IPC_QUEUE, $list162, $list86, $list348);
        methods.subloop_register_instance_method(BASIC_IPC_QUEUE, SET_CONTENTS, BASIC_IPC_QUEUE_SET_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method(CLEAR, BASIC_IPC_QUEUE, $list162, NIL, $list351);
        methods.subloop_register_instance_method(BASIC_IPC_QUEUE, CLEAR, BASIC_IPC_QUEUE_CLEAR_METHOD);
        methods.methods_incorporate_instance_method(REORDER_CONTENTS, BASIC_IPC_QUEUE, $list9, $list91, $list353);
        methods.subloop_register_instance_method(BASIC_IPC_QUEUE, REORDER_CONTENTS, BASIC_IPC_QUEUE_REORDER_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method(PEEK, BASIC_IPC_QUEUE, $list9, NIL, $list355);
        methods.subloop_register_instance_method(BASIC_IPC_QUEUE, PEEK, BASIC_IPC_QUEUE_PEEK_METHOD);
        methods.methods_incorporate_instance_method(ENQUEUED_P, BASIC_IPC_QUEUE, $list9, $list96, $list358);
        methods.subloop_register_instance_method(BASIC_IPC_QUEUE, ENQUEUED_P, BASIC_IPC_QUEUE_ENQUEUED_P_METHOD);
        methods.methods_incorporate_instance_method(FIND, BASIC_IPC_QUEUE, $list9, $list79, $list361);
        methods.subloop_register_instance_method(BASIC_IPC_QUEUE, FIND, BASIC_IPC_QUEUE_FIND_METHOD);
        methods.methods_incorporate_instance_method(PASSIVE_P, BASIC_IPC_QUEUE, $list162, NIL, $list163);
        methods.subloop_register_instance_method(BASIC_IPC_QUEUE, PASSIVE_P, BASIC_IPC_QUEUE_PASSIVE_P_METHOD);
        methods.methods_incorporate_instance_method(SET_PASSIVE, BASIC_IPC_QUEUE, $list9, $list166, $list167);
        methods.subloop_register_instance_method(BASIC_IPC_QUEUE, SET_PASSIVE, BASIC_IPC_QUEUE_SET_PASSIVE_METHOD);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_subloop_queues_file();
    }

    @Override
    public void initializeVariables() {
        init_subloop_queues_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_subloop_queues_file();
    }

    static {



























































































































































































































































































































































































    }
}

/**
 * Total time: 1608 ms
 */
