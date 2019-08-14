/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplacd;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.set_nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.max;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.min;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numLE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.make_vector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.set_aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.last;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nthcdr;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.bytes;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SUBLOOP-SEQUENCES
 * source file: /cyc/top/cycl/subloop-sequences.lisp
 * created:     2019/07/03 17:37:09
 */
public final class subloop_sequences extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new subloop_sequences();

 public static final String myName = "com.cyc.cycjava.cycl.subloop_sequences";


    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol SEQUENCE_ELEMENT_TEMPLATE = makeSymbol("SEQUENCE-ELEMENT-TEMPLATE");

    static private final SubLList $list1 = list(new SubLObject[]{ list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SELF-DELETION-MODE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SELF-DELETION-MODE"), list(makeSymbol("MODE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-INDEX"), list(makeSymbol("SEQUENCE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-INDEX"), list(makeSymbol("SEQUENCE"), makeSymbol("INDEX")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DELETE-SELF-FROM-SEQUENCE"), list(makeSymbol("SEQUENCE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TRANSFER-SELF"), list(makeSymbol("CURRENT-SEQUENCE"), makeSymbol("NEW-SEQUENCE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DELETE-SELF-FROM-ALL-SEQUENCES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("MEMBER-P"), list(makeSymbol("SEQUENCE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SEQUENCES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-ADD"), list(makeSymbol("PARENT-SEQUENCE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-DELETE"), list(makeSymbol("PARENT-SEQUENCE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PERFORM-ACTION"), list(makeSymbol("ACTION"), makeSymbol("PARAMETERS")), makeKeyword("PUBLIC")) });

    static private final SubLList $list3 = list(new SubLObject[]{ list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEAR"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-LENGTH"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-NTH"), list(makeSymbol("N"), makeSymbol("&OPTIONAL"), list(makeSymbol("OUT-OF-RANGE-VALUE"), NIL)), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-NTH"), list(makeSymbol("N"), makeSymbol("NEW-VALUE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SUBSEQUENCE"), list(makeSymbol("START-INDEX"), makeSymbol("&OPTIONAL"), list(makeSymbol("END-INDEX"), NIL)), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SEQUENCE-CLASS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SEQUENCE-CLASS"), list(makeSymbol("NEW-CLASS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONTENTS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ALLOCATE-ENUMERATOR"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEALLOCATE-ENUMERATOR"), list(makeSymbol("OLD-ENUMERATOR")), makeKeyword("PUBLIC")) });

    static private final SubLList $list5 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list6 = list(list(makeSymbol("CLET"), list(list(makeSymbol("LIST-OF-CONTENTS"), NIL)), list(makeSymbol("CDOTIMES"), list(makeSymbol("INDEX"), list(makeSymbol("GET-LENGTH"), makeSymbol("SELF"))), list(makeSymbol("CPUSH"), list(makeSymbol("GET-NTH"), makeSymbol("SELF"), makeSymbol("INDEX")), makeSymbol("LIST-OF-CONTENTS"))), list(RET, list(makeSymbol("NREVERSE"), makeSymbol("LIST-OF-CONTENTS")))));

    private static final SubLSymbol SEQUENCE_TEMPLATE = makeSymbol("SEQUENCE-TEMPLATE");

    static private final SubLList $list8 = list(makeSymbol("SEQUENCE"));

    static private final SubLList $list9 = list(makeKeyword("EXTENDS"), list(makeSymbol("SEQUENCE")));

    static private final SubLList $list10 = list(new SubLObject[]{ list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-INTERNAL-STORAGE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-INTERNAL-STORAGE"), list(makeSymbol("NEW-INTERNAL-STORAGE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEAR"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-LENGTH"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-NTH"), list(makeSymbol("N"), makeSymbol("&OPTIONAL"), list(makeSymbol("OUT-OF-RANGE-VALUE"))), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-NTH"), list(makeSymbol("N"), makeSymbol("NEW-VALUE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INSERT-AT"), list(makeSymbol("N"), makeSymbol("NEW-VALUE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SUBSEQUENCE"), list(makeSymbol("START-INDEX"), makeSymbol("&OPTIONAL"), list(makeSymbol("END-INDEX"), NIL)), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ALLOCATE-ENUMERATOR"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEALLOCATE-ENUMERATOR"), list(makeSymbol("OLD-ENUMERATOR")), makeKeyword("PUBLIC")) });

    static private final SubLList $list12 = list(list(makeSymbol("SET-INTERNAL-STORAGE"), makeSymbol("SELF"), NIL), list(RET, NIL));

    static private final SubLList $list14 = list(list(RET, list(makeSymbol("LENGTH"), list(makeSymbol("GET-INTERNAL-STORAGE"), makeSymbol("SELF")))));

    static private final SubLList $list16 = list(makeSymbol("N"), makeSymbol("&OPTIONAL"), list(makeSymbol("OUT-OF-RANGE-VALUE")));

    static private final SubLList $list17 = list(list(makeSymbol("PWHEN"), list(makeSymbol("<"), makeSymbol("N"), ZERO_INTEGER), list(RET, makeSymbol("OUT-OF-RANGE-VALUE"))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CURRENT-CONS"), list(makeSymbol("GET-INTERNAL-STORAGE"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-INDEX"), ZERO_INTEGER)), list(makeSymbol("WHILE"), makeSymbol("TEMPLATE-CURRENT-CONS"), list(makeSymbol("PWHEN"), list(makeSymbol("="), makeSymbol("N"), makeSymbol("TEMPLATE-INDEX")), list(RET, list(makeSymbol("CAR"), makeSymbol("TEMPLATE-CURRENT-CONS")))), list(makeSymbol("CINC"), makeSymbol("TEMPLATE-INDEX")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-CURRENT-CONS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-CURRENT-CONS")))), list(RET, makeSymbol("OUT-OF-RANGE-VALUE"))));

    static private final SubLList $list19 = list(makeSymbol("N"), makeSymbol("NEW-VALUE"));

    static private final SubLList $list20 = list(list(makeSymbol("SET-NTH"), makeSymbol("N"), list(makeSymbol("GET-INTERNAL-STORAGE"), makeSymbol("SELF")), makeSymbol("NEW-VALUE")), list(RET, makeSymbol("NEW-VALUE")));

    static private final SubLList $list22 = list(makeSymbol("START-INDEX"), makeSymbol("&OPTIONAL"), list(makeSymbol("END-INDEX"), NIL));

    static private final SubLList $list23 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CLASS"), list(makeSymbol("GET-SEQUENCE-CLASS"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-INSTANCE"), list(makeSymbol("NEW-OBJECT-INSTANCE"), makeSymbol("TEMPLATE-CLASS"))), list(makeSymbol("TEMPLATE-SUBLIST"), list(makeSymbol("NTHCDR"), makeSymbol("START-INDEX"), list(makeSymbol("GET-INTERNAL-STORAGE"), makeSymbol("SELF"))))), list(makeSymbol("PIF"), makeSymbol("END-INDEX"), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-NEW-STORAGE"), NIL), list(makeSymbol("TEMPLATE-POINTER"), makeSymbol("TEMPLATE-SUBLIST"))), list(makeSymbol("CDOTIMES"), list(makeSymbol("I"), list(makeSymbol("-"), makeSymbol("END-INDEX"), makeSymbol("START-INDEX"))), list(makeSymbol("CPUSH"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-POINTER")), makeSymbol("TEMPLATE-NEW-STORAGE")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-POINTER"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-POINTER")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-INSTANCE"), list(QUOTE, makeSymbol("SET-INTERNAL-STORAGE")), list(makeSymbol("NREVERSE"), makeSymbol("TEMPLATE-NEW-STORAGE")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-INSTANCE"), list(QUOTE, makeSymbol("SET-INTERNAL-STORAGE")), list(makeSymbol("COPY-LIST"), makeSymbol("TEMPLATE-SUBLIST")))), list(RET, makeSymbol("TEMPLATE-INSTANCE"))));

    static private final SubLList $list25 = list(makeSymbol("NEW-ELEMENT"));

    static private final SubLList $list26 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-INTERNAL-STORAGE"), list(makeSymbol("GET-INTERNAL-STORAGE"), makeSymbol("SELF")))), list(makeSymbol("PIF"), list(makeSymbol("NULL"), makeSymbol("TEMPLATE-INTERNAL-STORAGE")), list(makeSymbol("PROGN"), list(makeSymbol("SET-INTERNAL-STORAGE"), makeSymbol("SELF"), list(makeSymbol("LIST"), makeSymbol("NEW-ELEMENT"))), list(RET, makeSymbol("NEW-ELEMENT"))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LAST-CONS"), list(makeSymbol("LAST"), makeSymbol("TEMPLATE-INTERNAL-STORAGE")))), list(makeSymbol("RPLACD"), makeSymbol("TEMPLATE-LAST-CONS"), list(makeSymbol("LIST"), makeSymbol("NEW-ELEMENT"))), list(RET, makeSymbol("NEW-ELEMENT"))))));

    static private final SubLList $list28 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-INTERNAL-STORAGE"), list(makeSymbol("GET-INTERNAL-STORAGE"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-INTERNAL-STORAGE"), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-ENUMERATOR"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("BASIC-SEQUENCE-ENUMERATOR"))))), list(makeSymbol("BASIC-SEQUENCE-ENUMERATOR-SET-SHARED-STORAGE-METHOD"), makeSymbol("TEMPLATE-ENUMERATOR"), makeSymbol("TEMPLATE-INTERNAL-STORAGE")), list(RET, makeSymbol("TEMPLATE-ENUMERATOR"))))), list(RET, NIL));

    static private final SubLList $list30 = list(makeSymbol("OLD-ENUMERATOR"));

    static private final SubLList $list31 = list(list(makeSymbol("MUST"), list(makeSymbol("BASIC-SEQUENCE-ENUMERATOR-P"), makeSymbol("OLD-ENUMERATOR")), makeString("(DEALLOCATE-ENUMERATOR ~S): ~S is not an instance of BASIC-SEQUENCE-ENUMERATOR."), makeSymbol("SELF"), makeSymbol("OLD-ENUMERATOR")), list(makeSymbol("BASIC-SEQUENCE-ENUMERATOR-SET-SHARED-STORAGE-METHOD"), makeSymbol("OLD-ENUMERATOR"), NIL), list(RET, NIL));

    private static final SubLSymbol BASIC_SEQUENCE_ENUMERATOR = makeSymbol("BASIC-SEQUENCE-ENUMERATOR");

    static private final SubLList $list34 = list(makeSymbol("ENUMERATOR-TEMPLATE"));

    static private final SubLList $list35 = list(new SubLObject[]{ list(makeSymbol("SHARED-STORAGE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("LENGTH"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CURRENT-INDEX"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SHARED-STORAGE"), list(makeSymbol("NEW-SHARED-STORAGE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EMPTY-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FIRST-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LAST-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CURRENT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FIRST"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LAST"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NEXT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PREVIOUS"), NIL, makeKeyword("PUBLIC")) });

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_BASIC_SEQUENCE_ENUMERATOR_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-SEQUENCE-ENUMERATOR-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_BASIC_SEQUENCE_ENUMERATOR_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-SEQUENCE-ENUMERATOR-INSTANCE");

    static private final SubLList $list45 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list46 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("SHARED-STORAGE"), NIL), list(makeSymbol("CSETQ"), makeSymbol("LENGTH"), MINUS_ONE_INTEGER), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-INDEX"), ZERO_INTEGER), list(RET, NIL));

    static private final SubLSymbol $sym47$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-SEQUENCE-ENUMERATOR-METHOD");

    private static final SubLSymbol BASIC_SEQUENCE_ENUMERATOR_INITIALIZE_METHOD = makeSymbol("BASIC-SEQUENCE-ENUMERATOR-INITIALIZE-METHOD");

    private static final SubLSymbol SET_SHARED_STORAGE = makeSymbol("SET-SHARED-STORAGE");

    static private final SubLList $list50 = list(makeSymbol("NEW-SHARED-STORAGE"));

    static private final SubLList $list51 = list(list(makeSymbol("MUST"), list(makeSymbol("LISTP"), makeSymbol("NEW-SHARED-STORAGE")), makeString("(SET-SHARED-STORAGE ~S): ~S is not a list."), makeSymbol("SELF"), makeSymbol("NEW-SHARED-STORAGE")), list(makeSymbol("CSETQ"), makeSymbol("SHARED-STORAGE"), makeSymbol("NEW-SHARED-STORAGE")), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-INDEX"), ZERO_INTEGER), list(makeSymbol("CSETQ"), makeSymbol("LENGTH"), list(makeSymbol("LENGTH"), makeSymbol("SHARED-STORAGE"))), list(RET, makeSymbol("NEW-SHARED-STORAGE")));

    static private final SubLSymbol $sym52$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-SEQUENCE-ENUMERATOR-METHOD");

    static private final SubLString $str53$_SET_SHARED_STORAGE__S____S_is_no = makeString("(SET-SHARED-STORAGE ~S): ~S is not a list.");

    private static final SubLSymbol BASIC_SEQUENCE_ENUMERATOR_SET_SHARED_STORAGE_METHOD = makeSymbol("BASIC-SEQUENCE-ENUMERATOR-SET-SHARED-STORAGE-METHOD");

    static private final SubLList $list56 = list(list(RET, list(makeSymbol("<="), makeSymbol("LENGTH"), ZERO_INTEGER)));

    static private final SubLSymbol $sym57$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-SEQUENCE-ENUMERATOR-METHOD");

    private static final SubLSymbol BASIC_SEQUENCE_ENUMERATOR_EMPTY_P_METHOD = makeSymbol("BASIC-SEQUENCE-ENUMERATOR-EMPTY-P-METHOD");

    static private final SubLList $list60 = list(list(RET, list(makeSymbol("="), makeSymbol("CURRENT-INDEX"), ZERO_INTEGER)));

    static private final SubLSymbol $sym61$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-SEQUENCE-ENUMERATOR-METHOD");

    private static final SubLSymbol BASIC_SEQUENCE_ENUMERATOR_FIRST_P_METHOD = makeSymbol("BASIC-SEQUENCE-ENUMERATOR-FIRST-P-METHOD");

    static private final SubLList $list64 = list(list(RET, list(makeSymbol("="), makeSymbol("CURRENT-INDEX"), list(makeSymbol("-"), makeSymbol("LENGTH"), ONE_INTEGER))));

    static private final SubLSymbol $sym65$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-SEQUENCE-ENUMERATOR-METHOD");

    private static final SubLSymbol BASIC_SEQUENCE_ENUMERATOR_LAST_P_METHOD = makeSymbol("BASIC-SEQUENCE-ENUMERATOR-LAST-P-METHOD");

    static private final SubLList $list68 = list(list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol(">="), makeSymbol("CURRENT-INDEX"), ZERO_INTEGER), list(makeSymbol("<"), makeSymbol("CURRENT-INDEX"), makeSymbol("LENGTH"))), list(RET, list(makeSymbol("NTH"), makeSymbol("CURRENT-INDEX"), makeSymbol("SHARED-STORAGE")))), list(RET, NIL));

    static private final SubLSymbol $sym69$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-SEQUENCE-ENUMERATOR-METHOD");

    private static final SubLSymbol BASIC_SEQUENCE_ENUMERATOR_CURRENT_METHOD = makeSymbol("BASIC-SEQUENCE-ENUMERATOR-CURRENT-METHOD");

    static private final SubLList $list72 = list(list(makeSymbol("PWHEN"), list(makeSymbol(">="), makeSymbol("LENGTH"), ZERO_INTEGER), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-INDEX"), ZERO_INTEGER), list(RET, list(makeSymbol("NTH"), ZERO_INTEGER, makeSymbol("SHARED-STORAGE")))), list(RET, NIL));

    static private final SubLSymbol $sym73$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-SEQUENCE-ENUMERATOR-METHOD");

    private static final SubLSymbol BASIC_SEQUENCE_ENUMERATOR_FIRST_METHOD = makeSymbol("BASIC-SEQUENCE-ENUMERATOR-FIRST-METHOD");

    static private final SubLList $list76 = list(list(makeSymbol("PWHEN"), list(makeSymbol(">="), makeSymbol("LENGTH"), ZERO_INTEGER), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-INDEX"), list(makeSymbol("-"), makeSymbol("LENGTH"), ONE_INTEGER)), list(RET, list(makeSymbol("NTH"), makeSymbol("CURRENT-INDEX"), makeSymbol("SHARED-STORAGE")))), list(RET, NIL));

    static private final SubLSymbol $sym77$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-SEQUENCE-ENUMERATOR-METHOD");

    private static final SubLSymbol BASIC_SEQUENCE_ENUMERATOR_LAST_METHOD = makeSymbol("BASIC-SEQUENCE-ENUMERATOR-LAST-METHOD");

    static private final SubLList $list80 = list(makeKeyword("AUTO-UPDATE"), makeKeyword("PUBLIC"));

    static private final SubLList $list81 = list(list(makeSymbol("PWHEN"), list(makeSymbol(">="), makeSymbol("CURRENT-INDEX"), makeSymbol("LENGTH")), list(RET, NIL)), list(makeSymbol("CINC"), makeSymbol("CURRENT-INDEX")), list(RET, list(makeSymbol("CURRENT"), makeSymbol("SELF"))));

    private static final SubLSymbol BASIC_SEQUENCE_ENUMERATOR_NEXT_METHOD = makeSymbol("BASIC-SEQUENCE-ENUMERATOR-NEXT-METHOD");

    static private final SubLList $list84 = list(list(makeSymbol("PWHEN"), list(makeSymbol("<="), makeSymbol("CURRENT-INDEX"), ZERO_INTEGER), list(RET, NIL)), list(makeSymbol("CDEC"), makeSymbol("CURRENT-INDEX")), list(RET, list(makeSymbol("CURRENT"), makeSymbol("SELF"))));

    private static final SubLSymbol BASIC_SEQUENCE_ENUMERATOR_PREVIOUS_METHOD = makeSymbol("BASIC-SEQUENCE-ENUMERATOR-PREVIOUS-METHOD");

    private static final SubLSymbol BASIC_SEQUENCE = makeSymbol("BASIC-SEQUENCE");

    static private final SubLList $list87 = list(makeSymbol("SEQUENCE-TEMPLATE"));

    static private final SubLList $list88 = list(new SubLObject[]{ list(makeSymbol("INTERNAL-STORAGE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("SEQUENCE-CLASS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-INTERNAL-STORAGE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-INTERNAL-STORAGE"), list(makeSymbol("NEW-INTERNAL-STORAGE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEAR"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-LENGTH"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-NTH"), list(makeSymbol("N"), makeSymbol("&OPTIONAL"), list(makeSymbol("OUT-OF-RANGE-VALUE"))), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-NTH"), list(makeSymbol("N"), makeSymbol("NEW-VALUE")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SUBSEQUENCE"), list(makeSymbol("START-INDEX"), makeSymbol("&OPTIONAL"), list(makeSymbol("END-INDEX"), NIL)), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONTENTS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SEQUENCE-CLASS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SEQUENCE-CLASS"), list(makeSymbol("NEW-CLASS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ALLOCATE-ENUMERATOR"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEALLOCATE-ENUMERATOR"), list(makeSymbol("OLD-ENUMERATOR")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")) });

    static private final SubLString $str91$_DEALLOCATE_ENUMERATOR__S____S_is = makeString("(DEALLOCATE-ENUMERATOR ~S): ~S is not an instance of BASIC-SEQUENCE-ENUMERATOR.");

    private static final SubLSymbol BASIC_SEQUENCE_DEALLOCATE_ENUMERATOR_METHOD = makeSymbol("BASIC-SEQUENCE-DEALLOCATE-ENUMERATOR-METHOD");

    private static final SubLSymbol BASIC_SEQUENCE_ALLOCATE_ENUMERATOR_METHOD = makeSymbol("BASIC-SEQUENCE-ALLOCATE-ENUMERATOR-METHOD");

    private static final SubLSymbol BASIC_SEQUENCE_GET_CONTENTS_METHOD = makeSymbol("BASIC-SEQUENCE-GET-CONTENTS-METHOD");

    private static final SubLSymbol BASIC_SEQUENCE_ADD_METHOD = makeSymbol("BASIC-SEQUENCE-ADD-METHOD");

    private static final SubLSymbol BASIC_SEQUENCE_GET_SUBSEQUENCE_METHOD = makeSymbol("BASIC-SEQUENCE-GET-SUBSEQUENCE-METHOD");

    private static final SubLSymbol BASIC_SEQUENCE_SET_NTH_METHOD = makeSymbol("BASIC-SEQUENCE-SET-NTH-METHOD");

    private static final SubLSymbol BASIC_SEQUENCE_GET_NTH_METHOD = makeSymbol("BASIC-SEQUENCE-GET-NTH-METHOD");

    private static final SubLSymbol BASIC_SEQUENCE_GET_LENGTH_METHOD = makeSymbol("BASIC-SEQUENCE-GET-LENGTH-METHOD");

    private static final SubLSymbol BASIC_SEQUENCE_CLEAR_METHOD = makeSymbol("BASIC-SEQUENCE-CLEAR-METHOD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_BASIC_SEQUENCE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-SEQUENCE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_BASIC_SEQUENCE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-SEQUENCE-INSTANCE");

    static private final SubLList $list104 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("INTERNAL-STORAGE"), NIL), list(makeSymbol("CSETQ"), makeSymbol("SEQUENCE-CLASS"), list(QUOTE, makeSymbol("BASIC-SEQUENCE"))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym105$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-SEQUENCE-METHOD");

    private static final SubLSymbol BASIC_SEQUENCE_INITIALIZE_METHOD = makeSymbol("BASIC-SEQUENCE-INITIALIZE-METHOD");

    static private final SubLList $list108 = list(makeSymbol("STREAM"), makeSymbol("DEPTH"));

    static private final SubLList $list109 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("PWHEN"), list(makeSymbol("NULL"), makeSymbol("INTERNAL-STORAGE")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("[]")), list(RET, makeSymbol("SELF"))), list(makeSymbol("PWHEN"), list(makeSymbol("NULL"), list(makeSymbol("CDR"), makeSymbol("INTERNAL-STORAGE"))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("[~S]"), list(makeSymbol("CAR"), makeSymbol("INTERNAL-STORAGE"))), list(RET, makeSymbol("SELF"))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("[~S"), list(makeSymbol("CAR"), makeSymbol("INTERNAL-STORAGE"))), list(makeSymbol("CDOLIST"), list(makeSymbol("ELEMENT"), list(makeSymbol("CDR"), makeSymbol("INTERNAL-STORAGE"))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(", ~S"), makeSymbol("ELEMENT"))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("]")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym110$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-SEQUENCE-METHOD");

    static private final SubLString $str111$__ = makeString("[]");

    static private final SubLString $str112$__S_ = makeString("[~S]");

    static private final SubLString $str113$__S = makeString("[~S");

    static private final SubLString $str114$___S = makeString(", ~S");

    static private final SubLString $str115$_ = makeString("]");

    private static final SubLSymbol BASIC_SEQUENCE_PRINT_METHOD = makeSymbol("BASIC-SEQUENCE-PRINT-METHOD");

    static private final SubLList $list118 = list(list(RET, makeSymbol("INTERNAL-STORAGE")));

    static private final SubLSymbol $sym119$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-SEQUENCE-METHOD");

    private static final SubLSymbol BASIC_SEQUENCE_GET_INTERNAL_STORAGE_METHOD = makeSymbol("BASIC-SEQUENCE-GET-INTERNAL-STORAGE-METHOD");

    static private final SubLList $list121 = list(makeSymbol("NEW-INTERNAL-STORAGE"));

    static private final SubLList $list122 = list(list(makeSymbol("MUST"), list(makeSymbol("LISTP"), makeSymbol("NEW-INTERNAL-STORAGE")), makeString("(SET-INTERNAL-STORAGE ~S): ~S is not a LIST."), makeSymbol("SELF"), makeSymbol("NEW-INTERNAL-STORAGE")), list(makeSymbol("CSETQ"), makeSymbol("INTERNAL-STORAGE"), makeSymbol("NEW-INTERNAL-STORAGE")), list(RET, makeSymbol("NEW-INTERNAL-STORAGE")));

    static private final SubLSymbol $sym123$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-SEQUENCE-METHOD");

    static private final SubLString $str124$_SET_INTERNAL_STORAGE__S____S_is_ = makeString("(SET-INTERNAL-STORAGE ~S): ~S is not a LIST.");

    private static final SubLSymbol BASIC_SEQUENCE_SET_INTERNAL_STORAGE_METHOD = makeSymbol("BASIC-SEQUENCE-SET-INTERNAL-STORAGE-METHOD");

    static private final SubLList $list127 = list(list(RET, makeSymbol("SEQUENCE-CLASS")));

    static private final SubLSymbol $sym128$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-SEQUENCE-METHOD");

    private static final SubLSymbol BASIC_SEQUENCE_GET_SEQUENCE_CLASS_METHOD = makeSymbol("BASIC-SEQUENCE-GET-SEQUENCE-CLASS-METHOD");

    private static final SubLSymbol SET_SEQUENCE_CLASS = makeSymbol("SET-SEQUENCE-CLASS");

    static private final SubLList $list131 = list(makeSymbol("NEW-CLASS"));

    static private final SubLList $list132 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-CLASS")), list(makeSymbol("CAND"), list(makeSymbol("SYMBOLP"), makeSymbol("NEW-CLASS")), list(makeSymbol("SUBCLASSP"), makeSymbol("NEW-CLASS"), list(QUOTE, makeSymbol("BASIC-SEQUENCE"))))), makeString("(SET-SEQUENCE-CLASS ~S): ~S is not a subclass of BASIC-SEQUENCE."), makeSymbol("SELF"), makeSymbol("NEW-CLASS")), list(makeSymbol("CSETQ"), makeSymbol("SEQUENCE-CLASS"), makeSymbol("NEW-CLASS")), list(RET, makeSymbol("NEW-CLASS")));

    static private final SubLSymbol $sym133$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-SEQUENCE-METHOD");

    static private final SubLString $str134$_SET_SEQUENCE_CLASS__S____S_is_no = makeString("(SET-SEQUENCE-CLASS ~S): ~S is not a subclass of BASIC-SEQUENCE.");

    private static final SubLSymbol BASIC_SEQUENCE_SET_SEQUENCE_CLASS_METHOD = makeSymbol("BASIC-SEQUENCE-SET-SEQUENCE-CLASS-METHOD");

    private static final SubLSymbol VARIABLE_LENGTH_SEQUENCE = makeSymbol("VARIABLE-LENGTH-SEQUENCE");

    static private final SubLList $list137 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DEFAULT-VALUE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-DEFAULT-VALUE"), list(makeSymbol("NEW-DEFAULT-VALUE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-GROWTH-FACTOR"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-GROWTH-FACTOR"), list(makeSymbol("NEW-GROWTH-FACTOR")), makeKeyword("PUBLIC")));

    private static final SubLSymbol VARIABLE_LENGTH_SEQUENCE_TEMPLATE = makeSymbol("VARIABLE-LENGTH-SEQUENCE-TEMPLATE");

    static private final SubLList $list139 = list(makeSymbol("VARIABLE-LENGTH-SEQUENCE"));

    static private final SubLList $list140 = list(makeKeyword("EXTENDS"), list(makeSymbol("VARIABLE-LENGTH-SEQUENCE")));

    static private final SubLList $list141 = list(new SubLObject[]{ list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEAR"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-LENGTH"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-NTH"), list(makeSymbol("N"), makeSymbol("&OPTIONAL"), list(makeSymbol("OUT-OF-RANGE-VALUE"), NIL)), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-NTH"), list(makeSymbol("N"), makeSymbol("NEW-VALUE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SUBSEQUENCE"), list(makeSymbol("START-INDEX"), makeSymbol("&OPTIONAL"), list(makeSymbol("END-INDEX"), NIL)), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-INTERNAL-STORAGE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-INTERNAL-STORAGE"), list(makeSymbol("NEW-INTERNAL-STORAGE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-STORAGE-SIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-STORAGE-SIZE"), list(makeSymbol("NEW-STORAGE-SIZE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-LARGEST-INDEX"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-LARGEST-INDEX"), list(makeSymbol("NEW-LARGEST-INDEX")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RECORD-INDEX"), list(makeSymbol("CURRENT-INDEX")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DEFAULT-VALUE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-DEFAULT-VALUE"), list(makeSymbol("NEW-DEFAULT-VALUE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-GROWTH-FACTOR"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-GROWTH-FACTOR"), list(makeSymbol("NEW-GROWTH-FACTOR")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ALLOCATE-ENUMERATOR"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEALLOCATE-ENUMERATOR"), list(makeSymbol("OLD-ENUMERATOR")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ALL-NULL-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INDEX-OF-NEXT-NON-NIL-ELEMENT"), list(makeSymbol("START-INDEX")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INDEX-OF-PREVIOUS-NON-NIL-ELEMENT"), list(makeSymbol("START-INDEX")), makeKeyword("PUBLIC")) });

    static private final SubLList $list142 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-STORAGE"), list(makeSymbol("GET-INTERNAL-STORAGE"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-SIZE"), list(makeSymbol("GET-STORAGE-SIZE"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-DEFAULT-VALUE"), list(makeSymbol("GET-DEFAULT-VALUE"), makeSymbol("SELF")))), list(makeSymbol("CDOTIMES"), list(makeSymbol("TEMPLATE-INDEX"), makeSymbol("TEMPLATE-SIZE")), list(makeSymbol("SET-AREF"), makeSymbol("TEMPLATE-STORAGE"), makeSymbol("TEMPLATE-INDEX"), makeSymbol("TEMPLATE-DEFAULT-VALUE"))), list(makeSymbol("SET-LARGEST-INDEX"), makeSymbol("SELF"), MINUS_ONE_INTEGER), list(RET, makeSymbol("TEMPLATE-DEFAULT-VALUE"))));

    static private final SubLList $list143 = list(list(RET, list(makeSymbol("+"), list(makeSymbol("GET-LARGEST-INDEX"), makeSymbol("SELF")), ONE_INTEGER)));

    static private final SubLList $list144 = list(makeSymbol("N"), makeSymbol("&OPTIONAL"), list(makeSymbol("OUT-OF-RANGE-VALUE"), NIL));

    static private final SubLList $list145 = list(list(makeSymbol("PWHEN"), list(makeSymbol("COR"), list(makeSymbol("<"), makeSymbol("N"), ZERO_INTEGER), list(makeSymbol(">"), makeSymbol("N"), list(makeSymbol("GET-LARGEST-INDEX"), makeSymbol("SELF")))), list(RET, makeSymbol("OUT-OF-RANGE-VALUE"))), list(RET, list(makeSymbol("AREF"), list(makeSymbol("GET-INTERNAL-STORAGE"), makeSymbol("SELF")), makeSymbol("N"))));

    static private final SubLList $list146 = list(list(makeSymbol("MUST"), list(makeSymbol(">="), makeSymbol("N"), ZERO_INTEGER), makeString("(SET-NTH ~S): Index ~S is less than zero.  Only non-negative indices are accepted."), makeSymbol("SELF"), makeSymbol("N")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LARGEST-INDEX"), list(makeSymbol("GET-LARGEST-INDEX"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-STORAGE-SIZE"), list(makeSymbol("GET-STORAGE-SIZE"), makeSymbol("SELF")))), list(makeSymbol("PIF"), list(makeSymbol(">="), makeSymbol("N"), makeSymbol("TEMPLATE-STORAGE-SIZE")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-NEW-STORAGE-SIZE"), list(makeSymbol("*"), list(makeSymbol("GET-GROWTH-FACTOR"), makeSymbol("SELF")), makeSymbol("N"))), list(makeSymbol("TEMPLATE-OLD-STORAGE"), list(makeSymbol("GET-INTERNAL-STORAGE"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-DEFAULT-VALUE"), list(makeSymbol("GET-DEFAULT-VALUE"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-NEW-STORAGE"), list(makeSymbol("MAKE-VECTOR"), makeSymbol("TEMPLATE-NEW-STORAGE-SIZE"), makeSymbol("TEMPLATE-DEFAULT-VALUE")))), list(makeSymbol("CDOTIMES"), list(makeSymbol("TEMPLATE-INDEX"), list(makeSymbol("+"), makeSymbol("TEMPLATE-LARGEST-INDEX"), ONE_INTEGER)), list(makeSymbol("SET-AREF"), makeSymbol("TEMPLATE-NEW-STORAGE"), makeSymbol("TEMPLATE-INDEX"), list(makeSymbol("AREF"), makeSymbol("TEMPLATE-OLD-STORAGE"), makeSymbol("TEMPLATE-INDEX")))), list(makeSymbol("RECORD-INDEX"), makeSymbol("SELF"), makeSymbol("N")), list(makeSymbol("SET-INTERNAL-STORAGE"), makeSymbol("SELF"), makeSymbol("TEMPLATE-NEW-STORAGE")), list(makeSymbol("SET-STORAGE-SIZE"), makeSymbol("SELF"), makeSymbol("TEMPLATE-NEW-STORAGE-SIZE")), list(makeSymbol("SET-AREF"), makeSymbol("TEMPLATE-NEW-STORAGE"), makeSymbol("N"), makeSymbol("NEW-VALUE"))), list(makeSymbol("PROGN"), list(makeSymbol("RECORD-INDEX"), makeSymbol("SELF"), makeSymbol("N")), list(makeSymbol("SET-AREF"), list(makeSymbol("GET-INTERNAL-STORAGE"), makeSymbol("SELF")), makeSymbol("N"), makeSymbol("NEW-VALUE")))), list(RET, makeSymbol("NEW-VALUE"))));

    static private final SubLList $list147 = list(list(makeSymbol("MUST"), list(makeSymbol(">="), makeSymbol("START-INDEX"), ZERO_INTEGER), makeString("(GET-SUBSEQUENCE ~S): Index ~S is less than zero.  Only non-negative indices are accepted."), makeSymbol("SELF"), makeSymbol("START-INDEX")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LENGTH"), list(makeSymbol("GET-LENGTH"), makeSymbol("SELF")))), list(makeSymbol("PUNLESS"), makeSymbol("END-INDEX"), list(makeSymbol("CSETQ"), makeSymbol("END-INDEX"), makeSymbol("TEMPLATE-LENGTH"))), list(makeSymbol("MUST"), list(makeSymbol("<="), makeSymbol("END-INDEX"), makeSymbol("TEMPLATE-LENGTH")), makeString("(GET-SUBSEQUENCE ~S): End index ~S exceeds the length ~S of this sequence."), makeSymbol("END-INDEX"), makeSymbol("TEMPLATE-LENGTH")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CLASS"), list(makeSymbol("GET-SEQUENCE-CLASS"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-INSTANCE"), list(makeSymbol("NEW-OBJECT-INSTANCE"), makeSymbol("TEMPLATE-CLASS"))), list(makeSymbol("TEMPLATE-ORIGINAL-INDEX"), makeSymbol("START-INDEX")), list(makeSymbol("TEMPLATE-INDEX-COUNT"), list(makeSymbol("-"), makeSymbol("END-INDEX"), makeSymbol("START-INDEX")))), list(makeSymbol("CDOTIMES"), list(makeSymbol("TEMPLATE-INDEX"), makeSymbol("TEMPLATE-INDEX-COUNT")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-INSTANCE"), list(QUOTE, makeSymbol("SET-NTH")), makeSymbol("TEMPLATE-INDEX"), list(makeSymbol("GET-NTH"), makeSymbol("SELF"), makeSymbol("TEMPLATE-ORIGINAL-INDEX"))), list(makeSymbol("CINC"), makeSymbol("TEMPLATE-ORIGINAL-INDEX"))), list(RET, makeSymbol("TEMPLATE-INSTANCE")))));

    static private final SubLList $list148 = list(list(RET, list(makeSymbol("SET-NTH"), makeSymbol("SELF"), list(makeSymbol("+"), list(makeSymbol("GET-LARGEST-INDEX"), makeSymbol("SELF")), ONE_INTEGER), makeSymbol("NEW-ELEMENT"))));

    static private final SubLList $list149 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-ENUMERATOR"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR"))))), list(makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-SET-SEQUENCE-METHOD"), makeSymbol("TEMPLATE-ENUMERATOR"), makeSymbol("SELF")), list(RET, makeSymbol("TEMPLATE-ENUMERATOR"))));

    static private final SubLList $list150 = list(list(makeSymbol("MUST"), list(makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-P"), makeSymbol("OLD-ENUMERATOR")), makeString("(DEALLOCATE-ENUMERATOR ~S): ~S is not an instance BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR."), makeSymbol("SELF"), makeSymbol("OLD-ENUMERATOR")), list(makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-SET-SEQUENCE-METHOD"), makeSymbol("OLD-ENUMERATOR"), NIL), list(RET, NIL));

    private static final SubLSymbol ALL_NULL_P = makeSymbol("ALL-NULL-P");

    static private final SubLList $list152 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-STORAGE"), list(makeSymbol("GET-INTERNAL-STORAGE"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-LENGTH"), list(makeSymbol("GET-LENGTH"), makeSymbol("SELF")))), list(makeSymbol("CDOTIMES"), list(makeSymbol("TEMPLATE-INDEX"), makeSymbol("TEMPLATE-LENGTH")), list(makeSymbol("PWHEN"), list(makeSymbol("AREF"), makeSymbol("TEMPLATE-STORAGE"), makeSymbol("TEMPLATE-INDEX")), list(RET, NIL))), list(RET, T)));

    static private final SubLList $list154 = list(makeSymbol("START-INDEX"));

    static private final SubLList $list155 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-INTERNAL-STORAGE"), list(makeSymbol("GET-INTERNAL-STORAGE"), makeSymbol("SELF")))), list(makeSymbol("PUNLESS"), makeSymbol("TEMPLATE-INTERNAL-STORAGE"), list(RET, NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LENGTH"), list(makeSymbol("GET-LENGTH"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), list(makeSymbol("ZEROP"), makeSymbol("TEMPLATE-LENGTH")), list(RET, NIL)), list(makeSymbol("PWHEN"), list(makeSymbol(">="), makeSymbol("START-INDEX"), makeSymbol("TEMPLATE-LENGTH")), list(RET, NIL)), list(makeSymbol("CSETQ"), makeSymbol("START-INDEX"), list(makeSymbol("MIN"), list(makeSymbol("MAX"), makeSymbol("START-INDEX"), ZERO_INTEGER), list(makeSymbol("-"), makeSymbol("TEMPLATE-LENGTH"), ONE_INTEGER))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-INDEX"), makeSymbol("START-INDEX"))), list(makeSymbol("WHILE"), list(makeSymbol("<"), makeSymbol("TEMPLATE-INDEX"), makeSymbol("TEMPLATE-LENGTH")), list(makeSymbol("PWHEN"), list(makeSymbol("AREF"), makeSymbol("TEMPLATE-INTERNAL-STORAGE"), makeSymbol("TEMPLATE-INDEX")), list(RET, makeSymbol("TEMPLATE-INDEX"))), list(makeSymbol("CINC"), makeSymbol("TEMPLATE-INDEX"))), list(RET, NIL)))));

    private static final SubLSymbol INDEX_OF_PREVIOUS_NON_NIL_ELEMENT = makeSymbol("INDEX-OF-PREVIOUS-NON-NIL-ELEMENT");

    static private final SubLList $list157 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-INTERNAL-STORAGE"), list(makeSymbol("GET-INTERNAL-STORAGE"), makeSymbol("SELF")))), list(makeSymbol("PUNLESS"), makeSymbol("TEMPLATE-INTERNAL-STORAGE"), list(RET, NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LENGTH"), list(makeSymbol("GET-LENGTH"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), list(makeSymbol("ZEROP"), makeSymbol("TEMPLATE-LENGTH")), list(RET, NIL)), list(makeSymbol("CSETQ"), makeSymbol("START-INDEX"), list(makeSymbol("MIN"), list(makeSymbol("MAX"), makeSymbol("START-INDEX"), ZERO_INTEGER), list(makeSymbol("-"), makeSymbol("TEMPLATE-LENGTH"), ONE_INTEGER))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-INDEX"), makeSymbol("START-INDEX"))), list(makeSymbol("WHILE"), list(makeSymbol(">="), makeSymbol("TEMPLATE-INDEX"), ZERO_INTEGER), list(makeSymbol("PWHEN"), list(makeSymbol("AREF"), makeSymbol("TEMPLATE-INTERNAL-STORAGE"), makeSymbol("TEMPLATE-INDEX")), list(RET, makeSymbol("TEMPLATE-INDEX"))), list(makeSymbol("CDEC"), makeSymbol("TEMPLATE-INDEX"))), list(RET, NIL)))));

    private static final SubLSymbol BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR = makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR");

    static private final SubLList $list159 = list(new SubLObject[]{ list(makeSymbol("SEQUENCE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CURRENT-INDEX"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("IGNORE-NULL-VALUES"), makeKeyword("BOOLEAN"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SEEK-NON-NULL-FORWARD"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SEEK-NON-NULL-BACKWARD"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SEQUENCE"), list(makeSymbol("NEW-SEQUENCE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-IGNORE-NULL-VALUES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-IGNORE-NULL-VALUES"), list(makeSymbol("NEW-VALUE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EMPTY-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FIRST-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LAST-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CURRENT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FIRST"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LAST"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NEXT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PREVIOUS"), NIL, makeKeyword("PUBLIC")) });

    private static final SubLInteger $int$4097 = makeInteger(4097);

    static private final SubLSymbol $sym162$SUBLOOP_RESERVED_INITIALIZE_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMER = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-CLASS");

    static private final SubLSymbol $sym163$SUBLOOP_RESERVED_INITIALIZE_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMER = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-INSTANCE");

    static private final SubLList $list164 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("SEQUENCE"), NIL), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-INDEX"), ZERO_INTEGER), list(makeSymbol("CSETQ"), makeSymbol("IGNORE-NULL-VALUES"), T), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym165$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-METHOD");

    private static final SubLSymbol BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_INITIALIZE_METHOD = makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-INITIALIZE-METHOD");

    private static final SubLSymbol SEEK_NON_NULL_FORWARD = makeSymbol("SEEK-NON-NULL-FORWARD");

    static private final SubLList $list168 = list(list(makeSymbol("CLET"), list(list(makeSymbol("CURRENT-LENGTH"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SEQUENCE"), list(QUOTE, makeSymbol("LENGTH"))))), list(makeSymbol("PWHEN"), list(makeSymbol(">="), makeSymbol("CURRENT-INDEX"), makeSymbol("CURRENT-LENGTH")), list(RET, NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("INDEX"), makeSymbol("CURRENT-INDEX"))), list(makeSymbol("WHILE"), list(makeSymbol("<"), makeSymbol("INDEX"), makeSymbol("CURRENT-LENGTH")), list(makeSymbol("PWHEN"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SEQUENCE"), list(QUOTE, makeSymbol("GET-NTH")), makeSymbol("INDEX")), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-INDEX"), makeSymbol("INDEX")), list(RET, T)), list(makeSymbol("CINC"), makeSymbol("INDEX"))), list(RET, NIL))));

    static private final SubLSymbol $sym169$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-METHOD");

    static private final SubLSymbol $sym170$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_SEEK_NON_NULL_FORWARD_M = makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-SEEK-NON-NULL-FORWARD-METHOD");

    private static final SubLSymbol SEEK_NON_NULL_BACKWARD = makeSymbol("SEEK-NON-NULL-BACKWARD");

    static private final SubLList $list172 = list(list(makeSymbol("PWHEN"), list(makeSymbol("="), makeSymbol("CURRENT-INDEX"), ZERO_INTEGER), list(RET, NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("INDEX"), makeSymbol("CURRENT-INDEX"))), list(makeSymbol("WHILE"), list(makeSymbol(">="), makeSymbol("INDEX"), ZERO_INTEGER), list(makeSymbol("PWHEN"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SEQUENCE"), list(QUOTE, makeSymbol("GET-NTH")), makeSymbol("INDEX")), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-INDEX"), makeSymbol("INDEX")), list(RET, T)), list(makeSymbol("CDEC"), makeSymbol("INDEX"))), list(RET, NIL)));

    static private final SubLSymbol $sym173$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-METHOD");

    static private final SubLSymbol $sym174$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_SEEK_NON_NULL_BACKWARD_ = makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-SEEK-NON-NULL-BACKWARD-METHOD");

    private static final SubLSymbol SET_SEQUENCE = makeSymbol("SET-SEQUENCE");

    static private final SubLList $list176 = list(makeSymbol("NEW-SEQUENCE"));

    static private final SubLList $list177 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-SEQUENCE")), list(makeSymbol("VARIABLE-LENGTH-SEQUENCE-TEMPLATE-P"), makeSymbol("NEW-SEQUENCE"))), makeString("(SET-SEQUENCE ~S): ~S is not an instance of a class that implements VARIABLE-LENGTH-SEQUENCE-TEMPLATE."), makeSymbol("SELF"), makeSymbol("NEW-SEQUENCE")), list(makeSymbol("CSETQ"), makeSymbol("SEQUENCE"), makeSymbol("NEW-SEQUENCE")), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-INDEX"), ZERO_INTEGER), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym178$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-METHOD");

    static private final SubLString $str179$_SET_SEQUENCE__S____S_is_not_an_i = makeString("(SET-SEQUENCE ~S): ~S is not an instance of a class that implements VARIABLE-LENGTH-SEQUENCE-TEMPLATE.");

    private static final SubLSymbol BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_SET_SEQUENCE_METHOD = makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-SET-SEQUENCE-METHOD");

    private static final SubLSymbol GET_IGNORE_NULL_VALUES = makeSymbol("GET-IGNORE-NULL-VALUES");

    static private final SubLList $list182 = list(makeKeyword("READ-ONLY"), makeKeyword("PUBLIC"));

    static private final SubLList $list183 = list(list(RET, makeSymbol("IGNORE-NULL-VALUES")));

    static private final SubLSymbol $sym184$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_GET_IGNORE_NULL_VALUES_ = makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-GET-IGNORE-NULL-VALUES-METHOD");

    private static final SubLSymbol SET_IGNORE_NULL_VALUES = makeSymbol("SET-IGNORE-NULL-VALUES");

    static private final SubLList $list186 = list(makeSymbol("NEW-VALUE"));

    static private final SubLList $list187 = list(list(makeSymbol("CSETQ"), makeSymbol("IGNORE-NULL-VALUES"), list(makeSymbol("FIF"), makeSymbol("NEW-VALUE"), T, NIL)), list(RET, makeSymbol("IGNORE-NULL-VALUES")));

    static private final SubLSymbol $sym188$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-METHOD");

    static private final SubLSymbol $sym189$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_SET_IGNORE_NULL_VALUES_ = makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-SET-IGNORE-NULL-VALUES-METHOD");

    static private final SubLList $list190 = list(list(makeSymbol("PUNLESS"), makeSymbol("SEQUENCE"), list(RET, T)), list(makeSymbol("PIF"), makeSymbol("IGNORE-NULL-VALUES"), list(RET, list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SEQUENCE"), list(QUOTE, makeSymbol("ALL-NULL-P")))), list(RET, list(makeSymbol("="), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SEQUENCE"), list(QUOTE, makeSymbol("GET-LENGTH"))), ZERO_INTEGER))));

    static private final SubLSymbol $sym191$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-METHOD");

    private static final SubLSymbol BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_EMPTY_P_METHOD = makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-EMPTY-P-METHOD");

    static private final SubLList $list193 = list(list(makeSymbol("PUNLESS"), makeSymbol("SEQUENCE"), list(RET, NIL)), list(makeSymbol("PIF"), makeSymbol("IGNORE-NULL-VALUES"), list(RET, list(makeSymbol("="), makeSymbol("CURRENT-INDEX"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SEQUENCE"), list(QUOTE, makeSymbol("INDEX-OF-NEXT-NON-NIL-ELEMENT")), ZERO_INTEGER))), list(RET, list(makeSymbol("="), makeSymbol("CURRENT-INDEX"), ZERO_INTEGER))));

    static private final SubLSymbol $sym194$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-METHOD");

    private static final SubLSymbol BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_FIRST_P_METHOD = makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-FIRST-P-METHOD");

    static private final SubLList $list196 = list(list(makeSymbol("PUNLESS"), makeSymbol("SEQUENCE"), list(RET, NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("LENGTH"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SEQUENCE"), list(QUOTE, makeSymbol("GET-LENGTH"))))), list(makeSymbol("PIF"), makeSymbol("IGNORE-NULL-VALUES"), list(RET, list(makeSymbol("="), makeSymbol("CURRENT-INDEX"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SEQUENCE"), list(QUOTE, makeSymbol("INDEX-OF-PREVIOUS-NON-NIL-ELEMENT")), makeSymbol("LENGTH")))), list(RET, list(makeSymbol("="), makeSymbol("CURRENT-INDEX"), list(makeSymbol("-"), makeSymbol("LENGTH"), ONE_INTEGER))))));

    static private final SubLSymbol $sym197$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-METHOD");

    private static final SubLSymbol BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_LAST_P_METHOD = makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-LAST-P-METHOD");

    static private final SubLList $list199 = list(list(makeSymbol("PUNLESS"), makeSymbol("SEQUENCE"), list(RET, NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("LENGTH"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SEQUENCE"), list(QUOTE, makeSymbol("GET-LENGTH"))))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol(">="), makeSymbol("CURRENT-INDEX"), ZERO_INTEGER), list(makeSymbol("<"), makeSymbol("CURRENT-INDEX"), makeSymbol("LENGTH"))), list(RET, list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SEQUENCE"), list(QUOTE, makeSymbol("GET-NTH")), makeSymbol("CURRENT-INDEX"))))), list(RET, NIL));

    static private final SubLSymbol $sym200$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-METHOD");

    private static final SubLSymbol BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_CURRENT_METHOD = makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-CURRENT-METHOD");

    static private final SubLList $list202 = list(list(makeSymbol("PIF"), makeSymbol("IGNORE-NULL-VALUES"), list(makeSymbol("CLET"), list(list(makeSymbol("FIRST-INDEX"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SEQUENCE"), list(QUOTE, makeSymbol("INDEX-OF-NEXT-NON-NIL-ELEMENT")), ZERO_INTEGER))), list(makeSymbol("PIF"), makeSymbol("FIRST-INDEX"), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-INDEX"), makeSymbol("FIRST-INDEX")), list(RET, list(makeSymbol("CURRENT"), makeSymbol("SELF")))), list(RET, NIL))), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-INDEX"), ZERO_INTEGER), list(RET, list(makeSymbol("CURRENT"), makeSymbol("SELF"))))));

    private static final SubLSymbol BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_FIRST_METHOD = makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-FIRST-METHOD");

    static private final SubLList $list204 = list(list(makeSymbol("PUNLESS"), makeSymbol("SEQUENCE"), list(RET, NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("LENGTH"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SEQUENCE"), list(QUOTE, makeSymbol("GET-LENGTH"))))), list(makeSymbol("PIF"), makeSymbol("IGNORE-NULL-VALUES"), list(makeSymbol("CLET"), list(list(makeSymbol("LAST-INDEX"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SEQUENCE"), list(QUOTE, makeSymbol("INDEX-OF-PREVIOUS-NON-NIL-ELEMENT")), makeSymbol("LENGTH")))), list(makeSymbol("PIF"), makeSymbol("LAST-INDEX"), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-INDEX"), makeSymbol("LAST-INDEX")), list(RET, list(makeSymbol("CURRENT"), makeSymbol("SELF")))), list(RET, NIL))), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-INDEX"), list(makeSymbol("-"), makeSymbol("LENGTH"), ONE_INTEGER)), list(RET, list(makeSymbol("CURRENT"), makeSymbol("SELF")))))));

    private static final SubLSymbol BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_LAST_METHOD = makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-LAST-METHOD");

    static private final SubLList $list206 = list(list(makeSymbol("PUNLESS"), makeSymbol("SEQUENCE"), list(RET, NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("LENGTH"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SEQUENCE"), list(QUOTE, makeSymbol("GET-LENGTH"))))), list(makeSymbol("PWHEN"), list(makeSymbol(">="), makeSymbol("CURRENT-INDEX"), makeSymbol("LENGTH")), list(RET, NIL)), list(makeSymbol("PIF"), makeSymbol("IGNORE-NULL-VALUES"), list(makeSymbol("CLET"), list(list(makeSymbol("NEXT-INDEX"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SEQUENCE"), list(QUOTE, makeSymbol("INDEX-OF-NEXT-NON-NIL-ELEMENT")), list(makeSymbol("+"), makeSymbol("CURRENT-INDEX"), ONE_INTEGER)))), list(makeSymbol("PIF"), makeSymbol("NEXT-INDEX"), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-INDEX"), makeSymbol("NEXT-INDEX")), list(RET, list(makeSymbol("CURRENT"), makeSymbol("SELF")))), list(RET, NIL))), list(makeSymbol("PROGN"), list(makeSymbol("CINC"), makeSymbol("CURRENT-INDEX")), list(RET, list(makeSymbol("CURRENT"), makeSymbol("SELF")))))));

    private static final SubLSymbol BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_NEXT_METHOD = makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-NEXT-METHOD");

    static private final SubLList $list208 = list(list(makeSymbol("PUNLESS"), makeSymbol("SEQUENCE"), list(RET, NIL)), list(makeSymbol("PWHEN"), list(makeSymbol("<="), makeSymbol("CURRENT-INDEX"), ZERO_INTEGER), list(RET, NIL)), list(makeSymbol("PIF"), makeSymbol("IGNORE-NULL-VALUES"), list(makeSymbol("CLET"), list(list(makeSymbol("PREVIOUS-INDEX"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SEQUENCE"), list(QUOTE, makeSymbol("INDEX-OF-PREVIOUS-NON-NIL-ELEMENT")), list(makeSymbol("-"), makeSymbol("CURRENT-INDEX"), ONE_INTEGER)))), list(makeSymbol("PIF"), makeSymbol("PREVIOUS-INDEX"), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-INDEX"), makeSymbol("PREVIOUS-INDEX")), list(RET, list(makeSymbol("CURRENT"), makeSymbol("SELF")))), list(RET, NIL))), list(makeSymbol("PROGN"), list(makeSymbol("CDEC"), makeSymbol("CURRENT-INDEX")), list(RET, list(makeSymbol("CURRENT"), makeSymbol("SELF"))))));

    private static final SubLSymbol BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_PREVIOUS_METHOD = makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-PREVIOUS-METHOD");

    private static final SubLSymbol BASIC_VARIABLE_LENGTH_SEQUENCE = makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE");

    static private final SubLList $list211 = list(makeSymbol("VARIABLE-LENGTH-SEQUENCE-TEMPLATE"));

    static private final SubLList $list212 = list(new SubLObject[]{ list(makeSymbol("INTERNAL-STORAGE"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("STORAGE-SIZE"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("LARGEST-INDEX"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DEFAULT-VALUE"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("GROWTH-FACTOR"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("SEQUENCE-CLASS"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEAR"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-LENGTH"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-NTH"), list(makeSymbol("N"), makeSymbol("&OPTIONAL"), list(makeSymbol("OUT-OF-RANGE-VALUE"), NIL)), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-NTH"), list(makeSymbol("N"), makeSymbol("NEW-VALUE")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SUBSEQUENCE"), list(makeSymbol("START-INDEX"), makeSymbol("&OPTIONAL"), list(makeSymbol("END-INDEX"), NIL)), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONTENTS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-INTERNAL-STORAGE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-INTERNAL-STORAGE"), list(makeSymbol("NEW-INTERNAL-STORAGE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-STORAGE-SIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-STORAGE-SIZE"), list(makeSymbol("NEW-STORAGE-SIZE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-LARGEST-INDEX"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-LARGEST-INDEX"), list(makeSymbol("NEW-LARGEST-INDEX")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RECORD-INDEX"), list(makeSymbol("CURRENT-INDEX")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DEFAULT-VALUE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-DEFAULT-VALUE"), list(makeSymbol("NEW-DEFAULT-VALUE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-GROWTH-FACTOR"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-GROWTH-FACTOR"), list(makeSymbol("NEW-GROWTH-FACTOR")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SEQUENCE-CLASS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SEQUENCE-CLASS"), list(makeSymbol("NEW-CLASS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ALLOCATE-ENUMERATOR"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEALLOCATE-ENUMERATOR"), list(makeSymbol("OLD-ENUMERATOR")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ALL-NULL-P"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INDEX-OF-NEXT-NON-NIL-ELEMENT"), list(makeSymbol("START-INDEX")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INDEX-OF-PREVIOUS-NON-NIL-ELEMENT"), list(makeSymbol("START-INDEX")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")) });

    static private final SubLSymbol $sym217$BASIC_VARIABLE_LENGTH_SEQUENCE_INDEX_OF_PREVIOUS_NON_NIL_ELEMENT_ = makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-INDEX-OF-PREVIOUS-NON-NIL-ELEMENT-METHOD");

    static private final SubLSymbol $sym218$BASIC_VARIABLE_LENGTH_SEQUENCE_INDEX_OF_NEXT_NON_NIL_ELEMENT_METH = makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-INDEX-OF-NEXT-NON-NIL-ELEMENT-METHOD");

    private static final SubLSymbol BASIC_VARIABLE_LENGTH_SEQUENCE_ALL_NULL_P_METHOD = makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-ALL-NULL-P-METHOD");

    static private final SubLString $str220$_DEALLOCATE_ENUMERATOR__S____S_is = makeString("(DEALLOCATE-ENUMERATOR ~S): ~S is not an instance BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR.");

    private static final SubLSymbol BASIC_VARIABLE_LENGTH_SEQUENCE_DEALLOCATE_ENUMERATOR_METHOD = makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-DEALLOCATE-ENUMERATOR-METHOD");

    private static final SubLSymbol BASIC_VARIABLE_LENGTH_SEQUENCE_ALLOCATE_ENUMERATOR_METHOD = makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-ALLOCATE-ENUMERATOR-METHOD");

    private static final SubLSymbol BASIC_VARIABLE_LENGTH_SEQUENCE_ADD_METHOD = makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-ADD-METHOD");

    static private final SubLString $str224$_GET_SUBSEQUENCE__S___Index__S_is = makeString("(GET-SUBSEQUENCE ~S): Index ~S is less than zero.  Only non-negative indices are accepted.");

    static private final SubLString $str225$_GET_SUBSEQUENCE__S___End_index__ = makeString("(GET-SUBSEQUENCE ~S): End index ~S exceeds the length ~S of this sequence.");

    private static final SubLSymbol BASIC_VARIABLE_LENGTH_SEQUENCE_GET_SUBSEQUENCE_METHOD = makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-GET-SUBSEQUENCE-METHOD");

    static private final SubLString $str227$_SET_NTH__S___Index__S_is_less_th = makeString("(SET-NTH ~S): Index ~S is less than zero.  Only non-negative indices are accepted.");

    private static final SubLSymbol BASIC_VARIABLE_LENGTH_SEQUENCE_SET_NTH_METHOD = makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-SET-NTH-METHOD");

    private static final SubLSymbol BASIC_VARIABLE_LENGTH_SEQUENCE_GET_NTH_METHOD = makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-GET-NTH-METHOD");

    private static final SubLSymbol BASIC_VARIABLE_LENGTH_SEQUENCE_GET_LENGTH_METHOD = makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-GET-LENGTH-METHOD");

    private static final SubLSymbol BASIC_VARIABLE_LENGTH_SEQUENCE_CLEAR_METHOD = makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-CLEAR-METHOD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_BASIC_VARIABLE_LENGTH_SEQUENCE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-VARIABLE-LENGTH-SEQUENCE-CLASS");

    static private final SubLSymbol $sym233$SUBLOOP_RESERVED_INITIALIZE_BASIC_VARIABLE_LENGTH_SEQUENCE_INSTAN = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-VARIABLE-LENGTH-SEQUENCE-INSTANCE");

    static private final SubLList $list234 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("INTERNAL-STORAGE"), list(makeSymbol("MAKE-VECTOR"), TEN_INTEGER, NIL)), list(makeSymbol("CSETQ"), makeSymbol("STORAGE-SIZE"), TEN_INTEGER), list(makeSymbol("CSETQ"), makeSymbol("LARGEST-INDEX"), MINUS_ONE_INTEGER), list(makeSymbol("CSETQ"), makeSymbol("DEFAULT-VALUE"), NIL), list(makeSymbol("CSETQ"), makeSymbol("GROWTH-FACTOR"), TWO_INTEGER), list(makeSymbol("CSETQ"), makeSymbol("SEQUENCE-CLASS"), list(QUOTE, makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE"))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym235$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-METHOD");

    private static final SubLSymbol BASIC_VARIABLE_LENGTH_SEQUENCE_INITIALIZE_METHOD = makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-INITIALIZE-METHOD");

    static private final SubLList $list237 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("PUNLESS"), makeSymbol("LARGEST-INDEX"), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("#<BASIC-VARIABLE-LENGTH-SEQUENCE: UNINITIALIZED>")), list(RET, makeSymbol("SELF"))), list(makeSymbol("PWHEN"), list(makeSymbol("="), makeSymbol("LARGEST-INDEX"), MINUS_ONE_INTEGER), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("[]")), list(RET, makeSymbol("SELF"))), list(makeSymbol("CLET"), list(list(makeSymbol("LENGTH"), list(makeSymbol("+"), makeSymbol("LARGEST-INDEX"), ONE_INTEGER))), list(makeSymbol("PWHEN"), list(makeSymbol("="), makeSymbol("LENGTH"), ZERO_INTEGER), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("[]")), list(RET, makeSymbol("SELF"))), list(makeSymbol("PWHEN"), list(makeSymbol("="), makeSymbol("LENGTH"), ONE_INTEGER), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("[~S]"), list(makeSymbol("AREF"), makeSymbol("INTERNAL-STORAGE"), ZERO_INTEGER)), list(RET, makeSymbol("SELF"))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("[~S"), list(makeSymbol("AREF"), makeSymbol("INTERNAL-STORAGE"), ZERO_INTEGER)), list(makeSymbol("CDOTIMES"), list(makeSymbol("I"), makeSymbol("LARGEST-INDEX")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(", ~S"), list(makeSymbol("AREF"), makeSymbol("INTERNAL-STORAGE"), list(makeSymbol("+"), makeSymbol("I"), ONE_INTEGER)))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("]"))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym238$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-METHOD");

    static private final SubLString $str239$__BASIC_VARIABLE_LENGTH_SEQUENCE_ = makeString("#<BASIC-VARIABLE-LENGTH-SEQUENCE: UNINITIALIZED>");

    private static final SubLSymbol BASIC_VARIABLE_LENGTH_SEQUENCE_PRINT_METHOD = makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-PRINT-METHOD");

    static private final SubLSymbol $sym241$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-METHOD");

    private static final SubLSymbol BASIC_VARIABLE_LENGTH_SEQUENCE_GET_INTERNAL_STORAGE_METHOD = makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-GET-INTERNAL-STORAGE-METHOD");

    static private final SubLList $list243 = list(list(makeSymbol("PUNLESS"), makeSymbol("INTERNAL-STORAGE"), list(RET, NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("LENGTH"), list(makeSymbol("GET-LENGTH"), makeSymbol("SELF"))), list(makeSymbol("ELEMENT"), NIL), list(makeSymbol("CONTENTS"), NIL)), list(makeSymbol("CDOTIMES"), list(makeSymbol("I"), makeSymbol("LENGTH")), list(makeSymbol("CSETQ"), makeSymbol("ELEMENT"), list(makeSymbol("AREF"), makeSymbol("INTERNAL-STORAGE"), makeSymbol("I"))), list(makeSymbol("PWHEN"), makeSymbol("ELEMENT"), list(makeSymbol("CPUSH"), makeSymbol("ELEMENT"), makeSymbol("CONTENTS")))), list(RET, list(makeSymbol("NREVERSE"), makeSymbol("CONTENTS")))));

    static private final SubLSymbol $sym244$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-METHOD");

    private static final SubLSymbol BASIC_VARIABLE_LENGTH_SEQUENCE_GET_CONTENTS_METHOD = makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-GET-CONTENTS-METHOD");

    static private final SubLList $list246 = list(list(makeSymbol("MUST"), list(makeSymbol("VECTORP"), makeSymbol("NEW-INTERNAL-STORAGE")), makeString("(SET-INTERNAL-STORAGE ~S): ~S is not a vector."), makeSymbol("SELF"), makeSymbol("NEW-INTERNAL-STORAGE")), list(makeSymbol("CSETQ"), makeSymbol("INTERNAL-STORAGE"), makeSymbol("NEW-INTERNAL-STORAGE")), list(RET, makeSymbol("NEW-INTERNAL-STORAGE")));

    static private final SubLSymbol $sym247$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-METHOD");

    static private final SubLString $str248$_SET_INTERNAL_STORAGE__S____S_is_ = makeString("(SET-INTERNAL-STORAGE ~S): ~S is not a vector.");

    private static final SubLSymbol BASIC_VARIABLE_LENGTH_SEQUENCE_SET_INTERNAL_STORAGE_METHOD = makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-SET-INTERNAL-STORAGE-METHOD");

    static private final SubLList $list251 = list(list(RET, makeSymbol("STORAGE-SIZE")));

    static private final SubLSymbol $sym252$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-METHOD");

    private static final SubLSymbol BASIC_VARIABLE_LENGTH_SEQUENCE_GET_STORAGE_SIZE_METHOD = makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-GET-STORAGE-SIZE-METHOD");

    private static final SubLSymbol SET_STORAGE_SIZE = makeSymbol("SET-STORAGE-SIZE");

    static private final SubLList $list255 = list(makeSymbol("NEW-STORAGE-SIZE"));

    static private final SubLList $list256 = list(list(makeSymbol("MUST"), list(makeSymbol("CAND"), list(makeSymbol("INTEGERP"), makeSymbol("NEW-STORAGE-SIZE")), list(makeSymbol(">="), makeSymbol("NEW-STORAGE-SIZE"), ZERO_INTEGER)), makeString("(SET-STORAGE-SIZE ~S): ~S is not a valid storage size.  A non-negative integer was expected."), makeSymbol("SELF"), makeSymbol("NEW-STORAGE-SIZE")), list(makeSymbol("CSETQ"), makeSymbol("STORAGE-SIZE"), makeSymbol("NEW-STORAGE-SIZE")), list(RET, makeSymbol("NEW-STORAGE-SIZE")));

    static private final SubLSymbol $sym257$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-METHOD");

    static private final SubLString $str258$_SET_STORAGE_SIZE__S____S_is_not_ = makeString("(SET-STORAGE-SIZE ~S): ~S is not a valid storage size.  A non-negative integer was expected.");

    private static final SubLSymbol BASIC_VARIABLE_LENGTH_SEQUENCE_SET_STORAGE_SIZE_METHOD = makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-SET-STORAGE-SIZE-METHOD");

    static private final SubLList $list261 = list(list(RET, makeSymbol("LARGEST-INDEX")));

    static private final SubLSymbol $sym262$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-METHOD");

    private static final SubLSymbol BASIC_VARIABLE_LENGTH_SEQUENCE_GET_LARGEST_INDEX_METHOD = makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-GET-LARGEST-INDEX-METHOD");

    private static final SubLSymbol SET_LARGEST_INDEX = makeSymbol("SET-LARGEST-INDEX");

    static private final SubLList $list265 = list(makeSymbol("NEW-LARGEST-INDEX"));

    static private final SubLList $list266 = list(list(makeSymbol("CSETQ"), makeSymbol("LARGEST-INDEX"), makeSymbol("NEW-LARGEST-INDEX")), list(RET, makeSymbol("NEW-LARGEST-INDEX")));

    static private final SubLSymbol $sym267$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-METHOD");

    private static final SubLSymbol BASIC_VARIABLE_LENGTH_SEQUENCE_SET_LARGEST_INDEX_METHOD = makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-SET-LARGEST-INDEX-METHOD");

    static private final SubLList $list270 = list(makeSymbol("CURRENT-INDEX"));

    static private final SubLList $list271 = list(list(makeSymbol("MUST"), list(makeSymbol("CAND"), list(makeSymbol("INTEGERP"), makeSymbol("CURRENT-INDEX")), list(makeSymbol(">="), makeSymbol("CURRENT-INDEX"), ZERO_INTEGER)), makeString("(RECORD-INDEX ~S): ~S is not a valid index.  A non-negative integer was expected."), makeSymbol("SELF"), makeSymbol("CURRENT-INDEX")), list(makeSymbol("CSETQ"), makeSymbol("LARGEST-INDEX"), list(makeSymbol("MAX"), makeSymbol("LARGEST-INDEX"), makeSymbol("CURRENT-INDEX"))), list(RET, makeSymbol("LARGEST-INDEX")));

    static private final SubLSymbol $sym272$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-METHOD");

    static private final SubLString $str273$_RECORD_INDEX__S____S_is_not_a_va = makeString("(RECORD-INDEX ~S): ~S is not a valid index.  A non-negative integer was expected.");

    private static final SubLSymbol BASIC_VARIABLE_LENGTH_SEQUENCE_RECORD_INDEX_METHOD = makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-RECORD-INDEX-METHOD");

    static private final SubLList $list276 = list(list(RET, makeSymbol("DEFAULT-VALUE")));

    static private final SubLSymbol $sym277$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-METHOD");

    private static final SubLSymbol BASIC_VARIABLE_LENGTH_SEQUENCE_GET_DEFAULT_VALUE_METHOD = makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-GET-DEFAULT-VALUE-METHOD");

    private static final SubLSymbol SET_DEFAULT_VALUE = makeSymbol("SET-DEFAULT-VALUE");

    static private final SubLList $list280 = list(makeSymbol("NEW-DEFAULT-VALUE"));

    static private final SubLList $list281 = list(list(makeSymbol("CSETQ"), makeSymbol("DEFAULT-VALUE"), makeSymbol("NEW-DEFAULT-VALUE")), list(RET, makeSymbol("NEW-DEFAULT-VALUE")));

    static private final SubLSymbol $sym282$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-METHOD");

    private static final SubLSymbol BASIC_VARIABLE_LENGTH_SEQUENCE_SET_DEFAULT_VALUE_METHOD = makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-SET-DEFAULT-VALUE-METHOD");

    static private final SubLList $list285 = list(list(RET, makeSymbol("GROWTH-FACTOR")));

    static private final SubLSymbol $sym286$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-METHOD");

    private static final SubLSymbol BASIC_VARIABLE_LENGTH_SEQUENCE_GET_GROWTH_FACTOR_METHOD = makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-GET-GROWTH-FACTOR-METHOD");

    private static final SubLSymbol SET_GROWTH_FACTOR = makeSymbol("SET-GROWTH-FACTOR");

    static private final SubLList $list289 = list(makeSymbol("NEW-GROWTH-FACTOR"));

    static private final SubLList $list290 = list(list(makeSymbol("MUST"), list(makeSymbol("CAND"), list(makeSymbol("NUMBERP"), makeSymbol("NEW-GROWTH-FACTOR")), list(makeSymbol(">"), makeSymbol("NEW-GROWTH-FACTOR"), makeDouble(1.0))), makeString("(SET-GROWTH-FACTOR ~S): ~S is not a valid growth factor.  The growth factor must be a number > 1.0."), makeSymbol("SELF"), makeSymbol("NEW-GROWTH-FACTOR")), list(makeSymbol("CSETQ"), makeSymbol("GROWTH-FACTOR"), makeSymbol("NEW-GROWTH-FACTOR")), list(RET, makeSymbol("NEW-GROWTH-FACTOR")));

    static private final SubLSymbol $sym291$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-METHOD");

    private static final SubLFloat $float$1_0 = makeDouble(1.0);

    static private final SubLString $str293$_SET_GROWTH_FACTOR__S____S_is_not = makeString("(SET-GROWTH-FACTOR ~S): ~S is not a valid growth factor.  The growth factor must be a number > 1.0.");

    private static final SubLSymbol BASIC_VARIABLE_LENGTH_SEQUENCE_SET_GROWTH_FACTOR_METHOD = makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-SET-GROWTH-FACTOR-METHOD");

    static private final SubLSymbol $sym295$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-METHOD");

    private static final SubLSymbol BASIC_VARIABLE_LENGTH_SEQUENCE_GET_SEQUENCE_CLASS_METHOD = makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-GET-SEQUENCE-CLASS-METHOD");

    static private final SubLList $list297 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-CLASS")), list(makeSymbol("CAND"), list(makeSymbol("SYMBOLP"), makeSymbol("NEW-CLASS")), list(makeSymbol("SUBCLASSP"), makeSymbol("NEW-CLASS"), list(QUOTE, makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE"))))), makeString("(SET-SEQUENCE-CLASS ~S): ~S is not a subclass of BASIC-VARIABLE-LENGTH-SEQUENCE."), makeSymbol("SELF"), makeSymbol("NEW-CLASS")), list(makeSymbol("CSETQ"), makeSymbol("SEQUENCE-CLASS"), makeSymbol("NEW-CLASS")), list(RET, makeSymbol("NEW-CLASS")));

    static private final SubLSymbol $sym298$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-METHOD");

    static private final SubLString $str299$_SET_SEQUENCE_CLASS__S____S_is_no = makeString("(SET-SEQUENCE-CLASS ~S): ~S is not a subclass of BASIC-VARIABLE-LENGTH-SEQUENCE.");

    private static final SubLSymbol BASIC_VARIABLE_LENGTH_SEQUENCE_SET_SEQUENCE_CLASS_METHOD = makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-SET-SEQUENCE-CLASS-METHOD");

    private static final SubLSymbol FIXED_LENGTH_SEQUENCE = makeSymbol("FIXED-LENGTH-SEQUENCE");

    static private final SubLList $list302 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-LENGTH"), list(makeSymbol("NEW-LENGTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DEFAULT-VALUE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-DEFAULT-VALUE"), list(makeSymbol("NEW-DEFAULT-VALUE")), makeKeyword("PUBLIC")));

    // Definitions
    public static final SubLObject sequence_element_template_p_alt(SubLObject sequence_element_template) {
        return interfaces.subloop_instanceof_interface(sequence_element_template, SEQUENCE_ELEMENT_TEMPLATE);
    }

    // Definitions
    public static SubLObject sequence_element_template_p(final SubLObject sequence_element_template) {
        return interfaces.subloop_instanceof_interface(sequence_element_template, SEQUENCE_ELEMENT_TEMPLATE);
    }

    public static final SubLObject sequence_p_alt(SubLObject sequence) {
        return interfaces.subloop_instanceof_interface(sequence, SEQUENCE);
    }

    public static SubLObject sequence_p(final SubLObject sequence) {
        return interfaces.subloop_instanceof_interface(sequence, SEQUENCE);
    }

    public static final SubLObject sequence_template_p_alt(SubLObject sequence_template) {
        return interfaces.subloop_instanceof_interface(sequence_template, SEQUENCE_TEMPLATE);
    }

    public static SubLObject sequence_template_p(final SubLObject sequence_template) {
        return interfaces.subloop_instanceof_interface(sequence_template, SEQUENCE_TEMPLATE);
    }

    public static final SubLObject get_basic_sequence_enumerator_current_index_alt(SubLObject basic_sequence_enumerator) {
        return classes.subloop_get_access_protected_instance_slot(basic_sequence_enumerator, THREE_INTEGER, CURRENT_INDEX);
    }

    public static SubLObject get_basic_sequence_enumerator_current_index(final SubLObject basic_sequence_enumerator) {
        return classes.subloop_get_access_protected_instance_slot(basic_sequence_enumerator, THREE_INTEGER, CURRENT_INDEX);
    }

    public static final SubLObject set_basic_sequence_enumerator_current_index_alt(SubLObject basic_sequence_enumerator, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_sequence_enumerator, value, THREE_INTEGER, CURRENT_INDEX);
    }

    public static SubLObject set_basic_sequence_enumerator_current_index(final SubLObject basic_sequence_enumerator, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_sequence_enumerator, value, THREE_INTEGER, CURRENT_INDEX);
    }

    public static final SubLObject get_basic_sequence_enumerator_length_alt(SubLObject basic_sequence_enumerator) {
        return classes.subloop_get_access_protected_instance_slot(basic_sequence_enumerator, TWO_INTEGER, LENGTH);
    }

    public static SubLObject get_basic_sequence_enumerator_length(final SubLObject basic_sequence_enumerator) {
        return classes.subloop_get_access_protected_instance_slot(basic_sequence_enumerator, TWO_INTEGER, LENGTH);
    }

    public static final SubLObject set_basic_sequence_enumerator_length_alt(SubLObject basic_sequence_enumerator, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_sequence_enumerator, value, TWO_INTEGER, LENGTH);
    }

    public static SubLObject set_basic_sequence_enumerator_length(final SubLObject basic_sequence_enumerator, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_sequence_enumerator, value, TWO_INTEGER, LENGTH);
    }

    public static final SubLObject get_basic_sequence_enumerator_shared_storage_alt(SubLObject basic_sequence_enumerator) {
        return classes.subloop_get_access_protected_instance_slot(basic_sequence_enumerator, ONE_INTEGER, SHARED_STORAGE);
    }

    public static SubLObject get_basic_sequence_enumerator_shared_storage(final SubLObject basic_sequence_enumerator) {
        return classes.subloop_get_access_protected_instance_slot(basic_sequence_enumerator, ONE_INTEGER, SHARED_STORAGE);
    }

    public static final SubLObject set_basic_sequence_enumerator_shared_storage_alt(SubLObject basic_sequence_enumerator, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_sequence_enumerator, value, ONE_INTEGER, SHARED_STORAGE);
    }

    public static SubLObject set_basic_sequence_enumerator_shared_storage(final SubLObject basic_sequence_enumerator, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_sequence_enumerator, value, ONE_INTEGER, SHARED_STORAGE);
    }

    public static final SubLObject subloop_reserved_initialize_basic_sequence_enumerator_class_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_basic_sequence_enumerator_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_basic_sequence_enumerator_instance_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_SEQUENCE_ENUMERATOR, SHARED_STORAGE, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_SEQUENCE_ENUMERATOR, LENGTH, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_SEQUENCE_ENUMERATOR, CURRENT_INDEX, NIL);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_basic_sequence_enumerator_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_SEQUENCE_ENUMERATOR, SHARED_STORAGE, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_SEQUENCE_ENUMERATOR, LENGTH, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_SEQUENCE_ENUMERATOR, CURRENT_INDEX, NIL);
        return NIL;
    }

    public static final SubLObject basic_sequence_enumerator_p_alt(SubLObject basic_sequence_enumerator) {
        return classes.subloop_instanceof_class(basic_sequence_enumerator, BASIC_SEQUENCE_ENUMERATOR);
    }

    public static SubLObject basic_sequence_enumerator_p(final SubLObject basic_sequence_enumerator) {
        return classes.subloop_instanceof_class(basic_sequence_enumerator, BASIC_SEQUENCE_ENUMERATOR);
    }

    public static final SubLObject basic_sequence_enumerator_initialize_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_basic_sequence_enumerator_method = NIL;
            SubLObject current_index = com.cyc.cycjava.cycl.subloop_sequences.get_basic_sequence_enumerator_current_index(self);
            SubLObject length = com.cyc.cycjava.cycl.subloop_sequences.get_basic_sequence_enumerator_length(self);
            SubLObject shared_storage = com.cyc.cycjava.cycl.subloop_sequences.get_basic_sequence_enumerator_shared_storage(self);
            try {
                try {
                    object.object_initialize_method(self);
                    shared_storage = NIL;
                    length = MINUS_ONE_INTEGER;
                    current_index = ZERO_INTEGER;
                    sublisp_throw($sym47$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_sequences.set_basic_sequence_enumerator_current_index(self, current_index);
                            com.cyc.cycjava.cycl.subloop_sequences.set_basic_sequence_enumerator_length(self, length);
                            com.cyc.cycjava.cycl.subloop_sequences.set_basic_sequence_enumerator_shared_storage(self, shared_storage);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_basic_sequence_enumerator_method = Errors.handleThrowable(ccatch_env_var, $sym47$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD);
            }
            return catch_var_for_basic_sequence_enumerator_method;
        }
    }

    public static SubLObject basic_sequence_enumerator_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_sequence_enumerator_method = NIL;
        SubLObject current_index = get_basic_sequence_enumerator_current_index(self);
        SubLObject length = get_basic_sequence_enumerator_length(self);
        SubLObject shared_storage = get_basic_sequence_enumerator_shared_storage(self);
        try {
            thread.throwStack.push($sym47$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD);
            try {
                object.object_initialize_method(self);
                shared_storage = NIL;
                length = MINUS_ONE_INTEGER;
                current_index = ZERO_INTEGER;
                sublisp_throw($sym47$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_sequence_enumerator_current_index(self, current_index);
                    set_basic_sequence_enumerator_length(self, length);
                    set_basic_sequence_enumerator_shared_storage(self, shared_storage);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_sequence_enumerator_method = Errors.handleThrowable(ccatch_env_var, $sym47$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_sequence_enumerator_method;
    }

    public static final SubLObject basic_sequence_enumerator_set_shared_storage_method_alt(SubLObject self, SubLObject new_shared_storage) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_basic_sequence_enumerator_method = NIL;
                SubLObject current_index = com.cyc.cycjava.cycl.subloop_sequences.get_basic_sequence_enumerator_current_index(self);
                SubLObject length = com.cyc.cycjava.cycl.subloop_sequences.get_basic_sequence_enumerator_length(self);
                SubLObject shared_storage = com.cyc.cycjava.cycl.subloop_sequences.get_basic_sequence_enumerator_shared_storage(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!new_shared_storage.isList()) {
                                Errors.error($str_alt53$_SET_SHARED_STORAGE__S____S_is_no, self, new_shared_storage);
                            }
                        }
                        shared_storage = new_shared_storage;
                        current_index = ZERO_INTEGER;
                        length = length(shared_storage);
                        sublisp_throw($sym52$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD, new_shared_storage);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                com.cyc.cycjava.cycl.subloop_sequences.set_basic_sequence_enumerator_current_index(self, current_index);
                                com.cyc.cycjava.cycl.subloop_sequences.set_basic_sequence_enumerator_length(self, length);
                                com.cyc.cycjava.cycl.subloop_sequences.set_basic_sequence_enumerator_shared_storage(self, shared_storage);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_basic_sequence_enumerator_method = Errors.handleThrowable(ccatch_env_var, $sym52$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD);
                }
                return catch_var_for_basic_sequence_enumerator_method;
            }
        }
    }

    public static SubLObject basic_sequence_enumerator_set_shared_storage_method(final SubLObject self, final SubLObject new_shared_storage) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_sequence_enumerator_method = NIL;
        SubLObject current_index = get_basic_sequence_enumerator_current_index(self);
        SubLObject length = get_basic_sequence_enumerator_length(self);
        SubLObject shared_storage = get_basic_sequence_enumerator_shared_storage(self);
        try {
            thread.throwStack.push($sym52$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD);
            try {
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!new_shared_storage.isList())) {
                    Errors.error($str53$_SET_SHARED_STORAGE__S____S_is_no, self, new_shared_storage);
                }
                shared_storage = new_shared_storage;
                current_index = ZERO_INTEGER;
                length = length(shared_storage);
                sublisp_throw($sym52$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD, new_shared_storage);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_sequence_enumerator_current_index(self, current_index);
                    set_basic_sequence_enumerator_length(self, length);
                    set_basic_sequence_enumerator_shared_storage(self, shared_storage);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_sequence_enumerator_method = Errors.handleThrowable(ccatch_env_var, $sym52$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_sequence_enumerator_method;
    }

    public static final SubLObject basic_sequence_enumerator_empty_p_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_basic_sequence_enumerator_method = NIL;
            SubLObject length = com.cyc.cycjava.cycl.subloop_sequences.get_basic_sequence_enumerator_length(self);
            try {
                try {
                    sublisp_throw($sym57$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD, numLE(length, ZERO_INTEGER));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_sequences.set_basic_sequence_enumerator_length(self, length);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_basic_sequence_enumerator_method = Errors.handleThrowable(ccatch_env_var, $sym57$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD);
            }
            return catch_var_for_basic_sequence_enumerator_method;
        }
    }

    public static SubLObject basic_sequence_enumerator_empty_p_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_sequence_enumerator_method = NIL;
        final SubLObject length = get_basic_sequence_enumerator_length(self);
        try {
            thread.throwStack.push($sym57$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD);
            try {
                sublisp_throw($sym57$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD, numLE(length, ZERO_INTEGER));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_sequence_enumerator_length(self, length);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_sequence_enumerator_method = Errors.handleThrowable(ccatch_env_var, $sym57$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_sequence_enumerator_method;
    }

    public static final SubLObject basic_sequence_enumerator_first_p_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_basic_sequence_enumerator_method = NIL;
            SubLObject current_index = com.cyc.cycjava.cycl.subloop_sequences.get_basic_sequence_enumerator_current_index(self);
            try {
                try {
                    sublisp_throw($sym61$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD, numE(current_index, ZERO_INTEGER));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_sequences.set_basic_sequence_enumerator_current_index(self, current_index);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_basic_sequence_enumerator_method = Errors.handleThrowable(ccatch_env_var, $sym61$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD);
            }
            return catch_var_for_basic_sequence_enumerator_method;
        }
    }

    public static SubLObject basic_sequence_enumerator_first_p_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_sequence_enumerator_method = NIL;
        final SubLObject current_index = get_basic_sequence_enumerator_current_index(self);
        try {
            thread.throwStack.push($sym61$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD);
            try {
                sublisp_throw($sym61$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD, numE(current_index, ZERO_INTEGER));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_sequence_enumerator_current_index(self, current_index);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_sequence_enumerator_method = Errors.handleThrowable(ccatch_env_var, $sym61$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_sequence_enumerator_method;
    }

    public static final SubLObject basic_sequence_enumerator_last_p_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_basic_sequence_enumerator_method = NIL;
            SubLObject current_index = com.cyc.cycjava.cycl.subloop_sequences.get_basic_sequence_enumerator_current_index(self);
            SubLObject length = com.cyc.cycjava.cycl.subloop_sequences.get_basic_sequence_enumerator_length(self);
            try {
                try {
                    sublisp_throw($sym65$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD, numE(current_index, subtract(length, ONE_INTEGER)));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_sequences.set_basic_sequence_enumerator_current_index(self, current_index);
                            com.cyc.cycjava.cycl.subloop_sequences.set_basic_sequence_enumerator_length(self, length);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_basic_sequence_enumerator_method = Errors.handleThrowable(ccatch_env_var, $sym65$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD);
            }
            return catch_var_for_basic_sequence_enumerator_method;
        }
    }

    public static SubLObject basic_sequence_enumerator_last_p_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_sequence_enumerator_method = NIL;
        final SubLObject current_index = get_basic_sequence_enumerator_current_index(self);
        final SubLObject length = get_basic_sequence_enumerator_length(self);
        try {
            thread.throwStack.push($sym65$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD);
            try {
                sublisp_throw($sym65$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD, numE(current_index, subtract(length, ONE_INTEGER)));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_sequence_enumerator_current_index(self, current_index);
                    set_basic_sequence_enumerator_length(self, length);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_sequence_enumerator_method = Errors.handleThrowable(ccatch_env_var, $sym65$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_sequence_enumerator_method;
    }

    public static final SubLObject basic_sequence_enumerator_current_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_basic_sequence_enumerator_method = NIL;
            SubLObject current_index = com.cyc.cycjava.cycl.subloop_sequences.get_basic_sequence_enumerator_current_index(self);
            SubLObject length = com.cyc.cycjava.cycl.subloop_sequences.get_basic_sequence_enumerator_length(self);
            SubLObject shared_storage = com.cyc.cycjava.cycl.subloop_sequences.get_basic_sequence_enumerator_shared_storage(self);
            try {
                try {
                    if (current_index.numGE(ZERO_INTEGER) && current_index.numL(length)) {
                        sublisp_throw($sym69$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD, nth(current_index, shared_storage));
                    }
                    sublisp_throw($sym69$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_sequences.set_basic_sequence_enumerator_current_index(self, current_index);
                            com.cyc.cycjava.cycl.subloop_sequences.set_basic_sequence_enumerator_length(self, length);
                            com.cyc.cycjava.cycl.subloop_sequences.set_basic_sequence_enumerator_shared_storage(self, shared_storage);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_basic_sequence_enumerator_method = Errors.handleThrowable(ccatch_env_var, $sym69$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD);
            }
            return catch_var_for_basic_sequence_enumerator_method;
        }
    }

    public static SubLObject basic_sequence_enumerator_current_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_sequence_enumerator_method = NIL;
        final SubLObject current_index = get_basic_sequence_enumerator_current_index(self);
        final SubLObject length = get_basic_sequence_enumerator_length(self);
        final SubLObject shared_storage = get_basic_sequence_enumerator_shared_storage(self);
        try {
            thread.throwStack.push($sym69$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD);
            try {
                if (current_index.numGE(ZERO_INTEGER) && current_index.numL(length)) {
                    sublisp_throw($sym69$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD, nth(current_index, shared_storage));
                }
                sublisp_throw($sym69$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_sequence_enumerator_current_index(self, current_index);
                    set_basic_sequence_enumerator_length(self, length);
                    set_basic_sequence_enumerator_shared_storage(self, shared_storage);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_sequence_enumerator_method = Errors.handleThrowable(ccatch_env_var, $sym69$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_sequence_enumerator_method;
    }

    public static final SubLObject basic_sequence_enumerator_first_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_basic_sequence_enumerator_method = NIL;
            SubLObject current_index = com.cyc.cycjava.cycl.subloop_sequences.get_basic_sequence_enumerator_current_index(self);
            SubLObject length = com.cyc.cycjava.cycl.subloop_sequences.get_basic_sequence_enumerator_length(self);
            SubLObject shared_storage = com.cyc.cycjava.cycl.subloop_sequences.get_basic_sequence_enumerator_shared_storage(self);
            try {
                try {
                    if (length.numGE(ZERO_INTEGER)) {
                        current_index = ZERO_INTEGER;
                        sublisp_throw($sym73$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD, nth(ZERO_INTEGER, shared_storage));
                    }
                    sublisp_throw($sym73$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_sequences.set_basic_sequence_enumerator_current_index(self, current_index);
                            com.cyc.cycjava.cycl.subloop_sequences.set_basic_sequence_enumerator_length(self, length);
                            com.cyc.cycjava.cycl.subloop_sequences.set_basic_sequence_enumerator_shared_storage(self, shared_storage);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_basic_sequence_enumerator_method = Errors.handleThrowable(ccatch_env_var, $sym73$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD);
            }
            return catch_var_for_basic_sequence_enumerator_method;
        }
    }

    public static SubLObject basic_sequence_enumerator_first_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_sequence_enumerator_method = NIL;
        SubLObject current_index = get_basic_sequence_enumerator_current_index(self);
        final SubLObject length = get_basic_sequence_enumerator_length(self);
        final SubLObject shared_storage = get_basic_sequence_enumerator_shared_storage(self);
        try {
            thread.throwStack.push($sym73$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD);
            try {
                if (length.numGE(ZERO_INTEGER)) {
                    current_index = ZERO_INTEGER;
                    sublisp_throw($sym73$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD, nth(ZERO_INTEGER, shared_storage));
                }
                sublisp_throw($sym73$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_sequence_enumerator_current_index(self, current_index);
                    set_basic_sequence_enumerator_length(self, length);
                    set_basic_sequence_enumerator_shared_storage(self, shared_storage);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_sequence_enumerator_method = Errors.handleThrowable(ccatch_env_var, $sym73$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_sequence_enumerator_method;
    }

    public static final SubLObject basic_sequence_enumerator_last_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_basic_sequence_enumerator_method = NIL;
            SubLObject current_index = com.cyc.cycjava.cycl.subloop_sequences.get_basic_sequence_enumerator_current_index(self);
            SubLObject length = com.cyc.cycjava.cycl.subloop_sequences.get_basic_sequence_enumerator_length(self);
            SubLObject shared_storage = com.cyc.cycjava.cycl.subloop_sequences.get_basic_sequence_enumerator_shared_storage(self);
            try {
                try {
                    if (length.numGE(ZERO_INTEGER)) {
                        current_index = subtract(length, ONE_INTEGER);
                        sublisp_throw($sym77$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD, nth(current_index, shared_storage));
                    }
                    sublisp_throw($sym77$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_sequences.set_basic_sequence_enumerator_current_index(self, current_index);
                            com.cyc.cycjava.cycl.subloop_sequences.set_basic_sequence_enumerator_length(self, length);
                            com.cyc.cycjava.cycl.subloop_sequences.set_basic_sequence_enumerator_shared_storage(self, shared_storage);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_basic_sequence_enumerator_method = Errors.handleThrowable(ccatch_env_var, $sym77$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD);
            }
            return catch_var_for_basic_sequence_enumerator_method;
        }
    }

    public static SubLObject basic_sequence_enumerator_last_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_sequence_enumerator_method = NIL;
        SubLObject current_index = get_basic_sequence_enumerator_current_index(self);
        final SubLObject length = get_basic_sequence_enumerator_length(self);
        final SubLObject shared_storage = get_basic_sequence_enumerator_shared_storage(self);
        try {
            thread.throwStack.push($sym77$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD);
            try {
                if (length.numGE(ZERO_INTEGER)) {
                    current_index = subtract(length, ONE_INTEGER);
                    sublisp_throw($sym77$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD, nth(current_index, shared_storage));
                }
                sublisp_throw($sym77$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_sequence_enumerator_current_index(self, current_index);
                    set_basic_sequence_enumerator_length(self, length);
                    set_basic_sequence_enumerator_shared_storage(self, shared_storage);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_sequence_enumerator_method = Errors.handleThrowable(ccatch_env_var, $sym77$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_sequence_enumerator_method;
    }

    public static final SubLObject basic_sequence_enumerator_next_method_alt(SubLObject self) {
        {
            SubLObject current_index = com.cyc.cycjava.cycl.subloop_sequences.get_basic_sequence_enumerator_current_index(self);
            SubLObject length = com.cyc.cycjava.cycl.subloop_sequences.get_basic_sequence_enumerator_length(self);
            if (current_index.numGE(length)) {
                return NIL;
            }
            current_index = add(current_index, ONE_INTEGER);
            com.cyc.cycjava.cycl.subloop_sequences.set_basic_sequence_enumerator_current_index(self, current_index);
            return com.cyc.cycjava.cycl.subloop_sequences.basic_sequence_enumerator_current_method(self);
        }
    }

    public static SubLObject basic_sequence_enumerator_next_method(final SubLObject self) {
        SubLObject current_index = get_basic_sequence_enumerator_current_index(self);
        final SubLObject length = get_basic_sequence_enumerator_length(self);
        if (current_index.numGE(length)) {
            return NIL;
        }
        current_index = add(current_index, ONE_INTEGER);
        set_basic_sequence_enumerator_current_index(self, current_index);
        return basic_sequence_enumerator_current_method(self);
    }

    public static final SubLObject basic_sequence_enumerator_previous_method_alt(SubLObject self) {
        {
            SubLObject current_index = com.cyc.cycjava.cycl.subloop_sequences.get_basic_sequence_enumerator_current_index(self);
            if (current_index.numLE(ZERO_INTEGER)) {
                return NIL;
            }
            current_index = subtract(current_index, ONE_INTEGER);
            com.cyc.cycjava.cycl.subloop_sequences.set_basic_sequence_enumerator_current_index(self, current_index);
            return com.cyc.cycjava.cycl.subloop_sequences.basic_sequence_enumerator_current_method(self);
        }
    }

    public static SubLObject basic_sequence_enumerator_previous_method(final SubLObject self) {
        SubLObject current_index = get_basic_sequence_enumerator_current_index(self);
        if (current_index.numLE(ZERO_INTEGER)) {
            return NIL;
        }
        current_index = subtract(current_index, ONE_INTEGER);
        set_basic_sequence_enumerator_current_index(self, current_index);
        return basic_sequence_enumerator_current_method(self);
    }

    public static final SubLObject get_basic_sequence_sequence_class_alt(SubLObject basic_sequence) {
        return classes.subloop_get_access_protected_instance_slot(basic_sequence, TWO_INTEGER, SEQUENCE_CLASS);
    }

    public static SubLObject get_basic_sequence_sequence_class(final SubLObject basic_sequence) {
        return classes.subloop_get_access_protected_instance_slot(basic_sequence, TWO_INTEGER, SEQUENCE_CLASS);
    }

    public static final SubLObject set_basic_sequence_sequence_class_alt(SubLObject basic_sequence, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_sequence, value, TWO_INTEGER, SEQUENCE_CLASS);
    }

    public static SubLObject set_basic_sequence_sequence_class(final SubLObject basic_sequence, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_sequence, value, TWO_INTEGER, SEQUENCE_CLASS);
    }

    public static final SubLObject get_basic_sequence_internal_storage_alt(SubLObject basic_sequence) {
        return classes.subloop_get_access_protected_instance_slot(basic_sequence, ONE_INTEGER, INTERNAL_STORAGE);
    }

    public static SubLObject get_basic_sequence_internal_storage(final SubLObject basic_sequence) {
        return classes.subloop_get_access_protected_instance_slot(basic_sequence, ONE_INTEGER, INTERNAL_STORAGE);
    }

    public static final SubLObject set_basic_sequence_internal_storage_alt(SubLObject basic_sequence, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_sequence, value, ONE_INTEGER, INTERNAL_STORAGE);
    }

    public static SubLObject set_basic_sequence_internal_storage(final SubLObject basic_sequence, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_sequence, value, ONE_INTEGER, INTERNAL_STORAGE);
    }

    public static final SubLObject basic_sequence_deallocate_enumerator_method_alt(SubLObject self, SubLObject old_enumerator) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == com.cyc.cycjava.cycl.subloop_sequences.basic_sequence_enumerator_p(old_enumerator)) {
                    Errors.error($str_alt91$_DEALLOCATE_ENUMERATOR__S____S_is, self, old_enumerator);
                }
            }
            com.cyc.cycjava.cycl.subloop_sequences.basic_sequence_enumerator_set_shared_storage_method(old_enumerator, NIL);
            return NIL;
        }
    }

    public static SubLObject basic_sequence_deallocate_enumerator_method(final SubLObject self, final SubLObject old_enumerator) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == basic_sequence_enumerator_p(old_enumerator))) {
            Errors.error($str91$_DEALLOCATE_ENUMERATOR__S____S_is, self, old_enumerator);
        }
        basic_sequence_enumerator_set_shared_storage_method(old_enumerator, NIL);
        return NIL;
    }

    public static final SubLObject basic_sequence_allocate_enumerator_method_alt(SubLObject self) {
        {
            SubLObject template_internal_storage = com.cyc.cycjava.cycl.subloop_sequences.basic_sequence_get_internal_storage_method(self);
            if (NIL != template_internal_storage) {
                {
                    SubLObject template_enumerator = object.new_class_instance(BASIC_SEQUENCE_ENUMERATOR);
                    com.cyc.cycjava.cycl.subloop_sequences.basic_sequence_enumerator_set_shared_storage_method(template_enumerator, template_internal_storage);
                    return template_enumerator;
                }
            }
            return NIL;
        }
    }

    public static SubLObject basic_sequence_allocate_enumerator_method(final SubLObject self) {
        final SubLObject template_internal_storage = basic_sequence_get_internal_storage_method(self);
        if (NIL != template_internal_storage) {
            final SubLObject template_enumerator = object.new_class_instance(BASIC_SEQUENCE_ENUMERATOR);
            basic_sequence_enumerator_set_shared_storage_method(template_enumerator, template_internal_storage);
            return template_enumerator;
        }
        return NIL;
    }

    public static final SubLObject basic_sequence_get_contents_method_alt(SubLObject self) {
        {
            SubLObject list_of_contents = NIL;
            SubLObject cdotimes_end_var = com.cyc.cycjava.cycl.subloop_sequences.basic_sequence_get_length_method(self);
            SubLObject index = NIL;
            for (index = ZERO_INTEGER; index.numL(cdotimes_end_var); index = add(index, ONE_INTEGER)) {
                list_of_contents = cons(com.cyc.cycjava.cycl.subloop_sequences.basic_sequence_get_nth_method(self, index, UNPROVIDED), list_of_contents);
            }
            return nreverse(list_of_contents);
        }
    }

    public static SubLObject basic_sequence_get_contents_method(final SubLObject self) {
        SubLObject list_of_contents = NIL;
        SubLObject cdotimes_end_var;
        SubLObject index;
        for (cdotimes_end_var = basic_sequence_get_length_method(self), index = NIL, index = ZERO_INTEGER; index.numL(cdotimes_end_var); index = add(index, ONE_INTEGER)) {
            list_of_contents = cons(basic_sequence_get_nth_method(self, index, UNPROVIDED), list_of_contents);
        }
        return nreverse(list_of_contents);
    }

    public static final SubLObject basic_sequence_add_method_alt(SubLObject self, SubLObject new_element) {
        {
            SubLObject template_internal_storage = com.cyc.cycjava.cycl.subloop_sequences.basic_sequence_get_internal_storage_method(self);
            if (NIL == template_internal_storage) {
                com.cyc.cycjava.cycl.subloop_sequences.basic_sequence_set_internal_storage_method(self, list(new_element));
                return new_element;
            } else {
                {
                    SubLObject template_last_cons = last(template_internal_storage, UNPROVIDED);
                    rplacd(template_last_cons, list(new_element));
                    return new_element;
                }
            }
        }
    }

    public static SubLObject basic_sequence_add_method(final SubLObject self, final SubLObject new_element) {
        final SubLObject template_internal_storage = basic_sequence_get_internal_storage_method(self);
        if (NIL == template_internal_storage) {
            basic_sequence_set_internal_storage_method(self, list(new_element));
            return new_element;
        }
        final SubLObject template_last_cons = last(template_internal_storage, UNPROVIDED);
        rplacd(template_last_cons, list(new_element));
        return new_element;
    }

    public static final SubLObject basic_sequence_get_subsequence_method_alt(SubLObject self, SubLObject start_index, SubLObject end_index) {
        if (end_index == UNPROVIDED) {
            end_index = NIL;
        }
        {
            SubLObject template_class = com.cyc.cycjava.cycl.subloop_sequences.basic_sequence_get_sequence_class_method(self);
            SubLObject template_instance = object.new_object_instance(template_class);
            SubLObject template_sublist = nthcdr(start_index, com.cyc.cycjava.cycl.subloop_sequences.basic_sequence_get_internal_storage_method(self));
            if (NIL != end_index) {
                {
                    SubLObject template_new_storage = NIL;
                    SubLObject template_pointer = template_sublist;
                    SubLObject cdotimes_end_var = subtract(end_index, start_index);
                    SubLObject i = NIL;
                    for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                        template_new_storage = cons(template_pointer.first(), template_new_storage);
                        template_pointer = template_pointer.rest();
                    }
                    methods.funcall_instance_method_with_1_args(template_instance, SET_INTERNAL_STORAGE, nreverse(template_new_storage));
                }
            } else {
                methods.funcall_instance_method_with_1_args(template_instance, SET_INTERNAL_STORAGE, copy_list(template_sublist));
            }
            return template_instance;
        }
    }

    public static SubLObject basic_sequence_get_subsequence_method(final SubLObject self, final SubLObject start_index, SubLObject end_index) {
        if (end_index == UNPROVIDED) {
            end_index = NIL;
        }
        final SubLObject template_class = basic_sequence_get_sequence_class_method(self);
        final SubLObject template_instance = object.new_object_instance(template_class);
        final SubLObject template_sublist = nthcdr(start_index, basic_sequence_get_internal_storage_method(self));
        if (NIL != end_index) {
            SubLObject template_new_storage = NIL;
            SubLObject template_pointer = template_sublist;
            SubLObject cdotimes_end_var;
            SubLObject i;
            for (cdotimes_end_var = subtract(end_index, start_index), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                template_new_storage = cons(template_pointer.first(), template_new_storage);
                template_pointer = template_pointer.rest();
            }
            methods.funcall_instance_method_with_1_args(template_instance, SET_INTERNAL_STORAGE, nreverse(template_new_storage));
        } else {
            methods.funcall_instance_method_with_1_args(template_instance, SET_INTERNAL_STORAGE, copy_list(template_sublist));
        }
        return template_instance;
    }

    public static final SubLObject basic_sequence_set_nth_method_alt(SubLObject self, SubLObject n, SubLObject new_value) {
        set_nth(n, com.cyc.cycjava.cycl.subloop_sequences.basic_sequence_get_internal_storage_method(self), new_value);
        return new_value;
    }

    public static SubLObject basic_sequence_set_nth_method(final SubLObject self, final SubLObject n, final SubLObject new_value) {
        set_nth(n, basic_sequence_get_internal_storage_method(self), new_value);
        return new_value;
    }

    public static final SubLObject basic_sequence_get_nth_method_alt(SubLObject self, SubLObject n, SubLObject out_of_range_value) {
        if (out_of_range_value == UNPROVIDED) {
            out_of_range_value = NIL;
        }
        if (n.numL(ZERO_INTEGER)) {
            return out_of_range_value;
        }
        {
            SubLObject template_current_cons = com.cyc.cycjava.cycl.subloop_sequences.basic_sequence_get_internal_storage_method(self);
            SubLObject template_index = ZERO_INTEGER;
            while (NIL != template_current_cons) {
                if (n.numE(template_index)) {
                    return template_current_cons.first();
                }
                template_index = add(template_index, ONE_INTEGER);
                template_current_cons = template_current_cons.rest();
            } 
            return out_of_range_value;
        }
    }

    public static SubLObject basic_sequence_get_nth_method(final SubLObject self, final SubLObject n, SubLObject out_of_range_value) {
        if (out_of_range_value == UNPROVIDED) {
            out_of_range_value = NIL;
        }
        if (n.numL(ZERO_INTEGER)) {
            return out_of_range_value;
        }
        SubLObject template_current_cons = basic_sequence_get_internal_storage_method(self);
        SubLObject template_index = ZERO_INTEGER;
        while (NIL != template_current_cons) {
            if (n.numE(template_index)) {
                return template_current_cons.first();
            }
            template_index = add(template_index, ONE_INTEGER);
            template_current_cons = template_current_cons.rest();
        } 
        return out_of_range_value;
    }

    public static final SubLObject basic_sequence_get_length_method_alt(SubLObject self) {
        return length(com.cyc.cycjava.cycl.subloop_sequences.basic_sequence_get_internal_storage_method(self));
    }

    public static SubLObject basic_sequence_get_length_method(final SubLObject self) {
        return length(basic_sequence_get_internal_storage_method(self));
    }

    public static final SubLObject basic_sequence_clear_method_alt(SubLObject self) {
        com.cyc.cycjava.cycl.subloop_sequences.basic_sequence_set_internal_storage_method(self, NIL);
        return NIL;
    }

    public static SubLObject basic_sequence_clear_method(final SubLObject self) {
        basic_sequence_set_internal_storage_method(self, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_basic_sequence_class_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_basic_sequence_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_basic_sequence_instance_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_SEQUENCE, INTERNAL_STORAGE, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_SEQUENCE, SEQUENCE_CLASS, NIL);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_basic_sequence_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_SEQUENCE, INTERNAL_STORAGE, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_SEQUENCE, SEQUENCE_CLASS, NIL);
        return NIL;
    }

    public static final SubLObject basic_sequence_p_alt(SubLObject basic_sequence) {
        return classes.subloop_instanceof_class(basic_sequence, BASIC_SEQUENCE);
    }

    public static SubLObject basic_sequence_p(final SubLObject basic_sequence) {
        return classes.subloop_instanceof_class(basic_sequence, BASIC_SEQUENCE);
    }

    public static final SubLObject basic_sequence_initialize_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_basic_sequence_method = NIL;
            SubLObject sequence_class = com.cyc.cycjava.cycl.subloop_sequences.get_basic_sequence_sequence_class(self);
            SubLObject internal_storage = com.cyc.cycjava.cycl.subloop_sequences.get_basic_sequence_internal_storage(self);
            try {
                try {
                    object.object_initialize_method(self);
                    internal_storage = NIL;
                    sequence_class = BASIC_SEQUENCE;
                    sublisp_throw($sym105$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_sequences.set_basic_sequence_sequence_class(self, sequence_class);
                            com.cyc.cycjava.cycl.subloop_sequences.set_basic_sequence_internal_storage(self, internal_storage);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_basic_sequence_method = Errors.handleThrowable(ccatch_env_var, $sym105$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD);
            }
            return catch_var_for_basic_sequence_method;
        }
    }

    public static SubLObject basic_sequence_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_sequence_method = NIL;
        SubLObject sequence_class = get_basic_sequence_sequence_class(self);
        SubLObject internal_storage = get_basic_sequence_internal_storage(self);
        try {
            thread.throwStack.push($sym105$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD);
            try {
                object.object_initialize_method(self);
                internal_storage = NIL;
                sequence_class = BASIC_SEQUENCE;
                sublisp_throw($sym105$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_sequence_sequence_class(self, sequence_class);
                    set_basic_sequence_internal_storage(self, internal_storage);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_sequence_method = Errors.handleThrowable(ccatch_env_var, $sym105$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_sequence_method;
    }

    public static final SubLObject basic_sequence_print_method_alt(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject catch_var_for_basic_sequence_method = NIL;
            SubLObject internal_storage = com.cyc.cycjava.cycl.subloop_sequences.get_basic_sequence_internal_storage(self);
            try {
                try {
                    if (NIL == internal_storage) {
                        format(stream, $str_alt111$__);
                        sublisp_throw($sym110$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD, self);
                    }
                    if (NIL == internal_storage.rest()) {
                        format(stream, $str_alt112$__S_, internal_storage.first());
                        sublisp_throw($sym110$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD, self);
                    }
                    format(stream, $str_alt113$__S, internal_storage.first());
                    {
                        SubLObject cdolist_list_var = internal_storage.rest();
                        SubLObject element = NIL;
                        for (element = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , element = cdolist_list_var.first()) {
                            format(stream, $str_alt114$___S, element);
                        }
                    }
                    format(stream, $str_alt115$_);
                    sublisp_throw($sym110$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_sequences.set_basic_sequence_internal_storage(self, internal_storage);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_basic_sequence_method = Errors.handleThrowable(ccatch_env_var, $sym110$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD);
            }
            return catch_var_for_basic_sequence_method;
        }
    }

    public static SubLObject basic_sequence_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_sequence_method = NIL;
        final SubLObject internal_storage = get_basic_sequence_internal_storage(self);
        try {
            thread.throwStack.push($sym110$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD);
            try {
                if (NIL == internal_storage) {
                    format(stream, $str111$__);
                    sublisp_throw($sym110$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD, self);
                }
                if (NIL == internal_storage.rest()) {
                    format(stream, $str112$__S_, internal_storage.first());
                    sublisp_throw($sym110$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD, self);
                }
                format(stream, $str113$__S, internal_storage.first());
                SubLObject cdolist_list_var = internal_storage.rest();
                SubLObject element = NIL;
                element = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    format(stream, $str114$___S, element);
                    cdolist_list_var = cdolist_list_var.rest();
                    element = cdolist_list_var.first();
                } 
                format(stream, $str115$_);
                sublisp_throw($sym110$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_sequence_internal_storage(self, internal_storage);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_sequence_method = Errors.handleThrowable(ccatch_env_var, $sym110$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_sequence_method;
    }

    public static final SubLObject basic_sequence_get_internal_storage_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_basic_sequence_method = NIL;
            SubLObject internal_storage = com.cyc.cycjava.cycl.subloop_sequences.get_basic_sequence_internal_storage(self);
            try {
                try {
                    sublisp_throw($sym119$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD, internal_storage);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_sequences.set_basic_sequence_internal_storage(self, internal_storage);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_basic_sequence_method = Errors.handleThrowable(ccatch_env_var, $sym119$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD);
            }
            return catch_var_for_basic_sequence_method;
        }
    }

    public static SubLObject basic_sequence_get_internal_storage_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_sequence_method = NIL;
        final SubLObject internal_storage = get_basic_sequence_internal_storage(self);
        try {
            thread.throwStack.push($sym119$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD);
            try {
                sublisp_throw($sym119$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD, internal_storage);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_sequence_internal_storage(self, internal_storage);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_sequence_method = Errors.handleThrowable(ccatch_env_var, $sym119$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_sequence_method;
    }

    public static final SubLObject basic_sequence_set_internal_storage_method_alt(SubLObject self, SubLObject new_internal_storage) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_basic_sequence_method = NIL;
                SubLObject internal_storage = com.cyc.cycjava.cycl.subloop_sequences.get_basic_sequence_internal_storage(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!new_internal_storage.isList()) {
                                Errors.error($str_alt124$_SET_INTERNAL_STORAGE__S____S_is_, self, new_internal_storage);
                            }
                        }
                        internal_storage = new_internal_storage;
                        sublisp_throw($sym123$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD, new_internal_storage);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                com.cyc.cycjava.cycl.subloop_sequences.set_basic_sequence_internal_storage(self, internal_storage);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_basic_sequence_method = Errors.handleThrowable(ccatch_env_var, $sym123$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD);
                }
                return catch_var_for_basic_sequence_method;
            }
        }
    }

    public static SubLObject basic_sequence_set_internal_storage_method(final SubLObject self, final SubLObject new_internal_storage) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_sequence_method = NIL;
        SubLObject internal_storage = get_basic_sequence_internal_storage(self);
        try {
            thread.throwStack.push($sym123$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD);
            try {
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!new_internal_storage.isList())) {
                    Errors.error($str124$_SET_INTERNAL_STORAGE__S____S_is_, self, new_internal_storage);
                }
                internal_storage = new_internal_storage;
                sublisp_throw($sym123$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD, new_internal_storage);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_sequence_internal_storage(self, internal_storage);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_sequence_method = Errors.handleThrowable(ccatch_env_var, $sym123$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_sequence_method;
    }

    public static final SubLObject basic_sequence_get_sequence_class_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_basic_sequence_method = NIL;
            SubLObject sequence_class = com.cyc.cycjava.cycl.subloop_sequences.get_basic_sequence_sequence_class(self);
            try {
                try {
                    sublisp_throw($sym128$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD, sequence_class);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_sequences.set_basic_sequence_sequence_class(self, sequence_class);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_basic_sequence_method = Errors.handleThrowable(ccatch_env_var, $sym128$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD);
            }
            return catch_var_for_basic_sequence_method;
        }
    }

    public static SubLObject basic_sequence_get_sequence_class_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_sequence_method = NIL;
        final SubLObject sequence_class = get_basic_sequence_sequence_class(self);
        try {
            thread.throwStack.push($sym128$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD);
            try {
                sublisp_throw($sym128$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD, sequence_class);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_sequence_sequence_class(self, sequence_class);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_sequence_method = Errors.handleThrowable(ccatch_env_var, $sym128$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_sequence_method;
    }

    public static final SubLObject basic_sequence_set_sequence_class_method_alt(SubLObject self, SubLObject new_class) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_basic_sequence_method = NIL;
                SubLObject sequence_class = com.cyc.cycjava.cycl.subloop_sequences.get_basic_sequence_sequence_class(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_class) || (new_class.isSymbol() && (NIL != classes.subclassp(new_class, BASIC_SEQUENCE))))) {
                                Errors.error($str_alt134$_SET_SEQUENCE_CLASS__S____S_is_no, self, new_class);
                            }
                        }
                        sequence_class = new_class;
                        sublisp_throw($sym133$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD, new_class);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                com.cyc.cycjava.cycl.subloop_sequences.set_basic_sequence_sequence_class(self, sequence_class);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_basic_sequence_method = Errors.handleThrowable(ccatch_env_var, $sym133$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD);
                }
                return catch_var_for_basic_sequence_method;
            }
        }
    }

    public static SubLObject basic_sequence_set_sequence_class_method(final SubLObject self, final SubLObject new_class) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_sequence_method = NIL;
        SubLObject sequence_class = get_basic_sequence_sequence_class(self);
        try {
            thread.throwStack.push($sym133$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD);
            try {
                if (((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != new_class)) && ((!new_class.isSymbol()) || (NIL == classes.subclassp(new_class, BASIC_SEQUENCE)))) {
                    Errors.error($str134$_SET_SEQUENCE_CLASS__S____S_is_no, self, new_class);
                }
                sequence_class = new_class;
                sublisp_throw($sym133$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD, new_class);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_sequence_sequence_class(self, sequence_class);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_sequence_method = Errors.handleThrowable(ccatch_env_var, $sym133$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_sequence_method;
    }

    public static final SubLObject variable_length_sequence_p_alt(SubLObject variable_length_sequence) {
        return interfaces.subloop_instanceof_interface(variable_length_sequence, VARIABLE_LENGTH_SEQUENCE);
    }

    public static SubLObject variable_length_sequence_p(final SubLObject variable_length_sequence) {
        return interfaces.subloop_instanceof_interface(variable_length_sequence, VARIABLE_LENGTH_SEQUENCE);
    }

    public static final SubLObject variable_length_sequence_template_p_alt(SubLObject variable_length_sequence_template) {
        return interfaces.subloop_instanceof_interface(variable_length_sequence_template, VARIABLE_LENGTH_SEQUENCE_TEMPLATE);
    }

    public static SubLObject variable_length_sequence_template_p(final SubLObject variable_length_sequence_template) {
        return interfaces.subloop_instanceof_interface(variable_length_sequence_template, VARIABLE_LENGTH_SEQUENCE_TEMPLATE);
    }

    public static final SubLObject get_basic_variable_length_sequence_enumerator_current_index_alt(SubLObject basic_variable_length_sequence_enumerator) {
        return classes.subloop_get_access_protected_instance_slot(basic_variable_length_sequence_enumerator, TWO_INTEGER, CURRENT_INDEX);
    }

    public static SubLObject get_basic_variable_length_sequence_enumerator_current_index(final SubLObject basic_variable_length_sequence_enumerator) {
        return classes.subloop_get_access_protected_instance_slot(basic_variable_length_sequence_enumerator, TWO_INTEGER, CURRENT_INDEX);
    }

    public static final SubLObject set_basic_variable_length_sequence_enumerator_current_index_alt(SubLObject basic_variable_length_sequence_enumerator, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_variable_length_sequence_enumerator, value, TWO_INTEGER, CURRENT_INDEX);
    }

    public static SubLObject set_basic_variable_length_sequence_enumerator_current_index(final SubLObject basic_variable_length_sequence_enumerator, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_variable_length_sequence_enumerator, value, TWO_INTEGER, CURRENT_INDEX);
    }

    public static final SubLObject get_basic_variable_length_sequence_enumerator_sequence_alt(SubLObject basic_variable_length_sequence_enumerator) {
        return classes.subloop_get_access_protected_instance_slot(basic_variable_length_sequence_enumerator, ONE_INTEGER, SEQUENCE);
    }

    public static SubLObject get_basic_variable_length_sequence_enumerator_sequence(final SubLObject basic_variable_length_sequence_enumerator) {
        return classes.subloop_get_access_protected_instance_slot(basic_variable_length_sequence_enumerator, ONE_INTEGER, SEQUENCE);
    }

    public static final SubLObject set_basic_variable_length_sequence_enumerator_sequence_alt(SubLObject basic_variable_length_sequence_enumerator, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_variable_length_sequence_enumerator, value, ONE_INTEGER, SEQUENCE);
    }

    public static SubLObject set_basic_variable_length_sequence_enumerator_sequence(final SubLObject basic_variable_length_sequence_enumerator, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_variable_length_sequence_enumerator, value, ONE_INTEGER, SEQUENCE);
    }

    public static final SubLObject get_basic_variable_length_sequence_enumerator_ignore_null_values_alt(SubLObject basic_variable_length_sequence_enumerator) {
        {
            SubLObject v_class = subloop_structures.instance_class(basic_variable_length_sequence_enumerator);
            SubLObject slot = slots.slot_assoc(IGNORE_NULL_VALUES, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, basic_variable_length_sequence_enumerator, slot);
        }
        return classes.ldb_test($int$4097, subloop_structures.instance_boolean_slots(basic_variable_length_sequence_enumerator));
    }

    public static SubLObject get_basic_variable_length_sequence_enumerator_ignore_null_values(final SubLObject basic_variable_length_sequence_enumerator) {
        final SubLObject v_class = subloop_structures.instance_class(basic_variable_length_sequence_enumerator);
        final SubLObject slot = slots.slot_assoc(IGNORE_NULL_VALUES, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
        instances.instances_access_check_instance_slot(v_class, basic_variable_length_sequence_enumerator, slot);
        return classes.ldb_test($int$4097, subloop_structures.instance_boolean_slots(basic_variable_length_sequence_enumerator));
    }

    public static final SubLObject set_basic_variable_length_sequence_enumerator_ignore_null_values_alt(SubLObject basic_variable_length_sequence_enumerator, SubLObject value) {
        {
            SubLObject v_class = subloop_structures.instance_class(basic_variable_length_sequence_enumerator);
            SubLObject slot = slots.slot_assoc(IGNORE_NULL_VALUES, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, basic_variable_length_sequence_enumerator, slot);
        }
        subloop_structures._csetf_instance_boolean_slots(basic_variable_length_sequence_enumerator, bytes.dpb(NIL != value ? ((SubLObject) (ONE_INTEGER)) : ZERO_INTEGER, $int$4097, subloop_structures.instance_boolean_slots(basic_variable_length_sequence_enumerator)));
        return value;
    }

    public static SubLObject set_basic_variable_length_sequence_enumerator_ignore_null_values(final SubLObject basic_variable_length_sequence_enumerator, final SubLObject value) {
        final SubLObject v_class = subloop_structures.instance_class(basic_variable_length_sequence_enumerator);
        final SubLObject slot = slots.slot_assoc(IGNORE_NULL_VALUES, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
        instances.instances_access_check_instance_slot(v_class, basic_variable_length_sequence_enumerator, slot);
        subloop_structures._csetf_instance_boolean_slots(basic_variable_length_sequence_enumerator, bytes.dpb(NIL != value ? ONE_INTEGER : ZERO_INTEGER, $int$4097, subloop_structures.instance_boolean_slots(basic_variable_length_sequence_enumerator)));
        return value;
    }

    public static final SubLObject subloop_reserved_initialize_basic_variable_length_sequence_enumerator_class_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_basic_variable_length_sequence_enumerator_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_basic_variable_length_sequence_enumerator_instance_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, IGNORE_NULL_VALUES, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, SEQUENCE, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, CURRENT_INDEX, NIL);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_basic_variable_length_sequence_enumerator_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, IGNORE_NULL_VALUES, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, SEQUENCE, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, CURRENT_INDEX, NIL);
        return NIL;
    }

    public static final SubLObject basic_variable_length_sequence_enumerator_p_alt(SubLObject basic_variable_length_sequence_enumerator) {
        return classes.subloop_instanceof_class(basic_variable_length_sequence_enumerator, BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR);
    }

    public static SubLObject basic_variable_length_sequence_enumerator_p(final SubLObject basic_variable_length_sequence_enumerator) {
        return classes.subloop_instanceof_class(basic_variable_length_sequence_enumerator, BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR);
    }

    public static final SubLObject basic_variable_length_sequence_enumerator_initialize_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_basic_variable_length_sequence_enumerator_method = NIL;
            SubLObject current_index = com.cyc.cycjava.cycl.subloop_sequences.get_basic_variable_length_sequence_enumerator_current_index(self);
            SubLObject sequence = com.cyc.cycjava.cycl.subloop_sequences.get_basic_variable_length_sequence_enumerator_sequence(self);
            SubLObject ignore_null_values = com.cyc.cycjava.cycl.subloop_sequences.get_basic_variable_length_sequence_enumerator_ignore_null_values(self);
            try {
                try {
                    object.object_initialize_method(self);
                    sequence = NIL;
                    current_index = ZERO_INTEGER;
                    ignore_null_values = T;
                    sublisp_throw($sym165$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_sequences.set_basic_variable_length_sequence_enumerator_current_index(self, current_index);
                            com.cyc.cycjava.cycl.subloop_sequences.set_basic_variable_length_sequence_enumerator_sequence(self, sequence);
                            com.cyc.cycjava.cycl.subloop_sequences.set_basic_variable_length_sequence_enumerator_ignore_null_values(self, ignore_null_values);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_basic_variable_length_sequence_enumerator_method = Errors.handleThrowable(ccatch_env_var, $sym165$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD);
            }
            return catch_var_for_basic_variable_length_sequence_enumerator_method;
        }
    }

    public static SubLObject basic_variable_length_sequence_enumerator_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_variable_length_sequence_enumerator_method = NIL;
        SubLObject current_index = get_basic_variable_length_sequence_enumerator_current_index(self);
        SubLObject sequence = get_basic_variable_length_sequence_enumerator_sequence(self);
        SubLObject ignore_null_values = get_basic_variable_length_sequence_enumerator_ignore_null_values(self);
        try {
            thread.throwStack.push($sym165$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD);
            try {
                object.object_initialize_method(self);
                sequence = NIL;
                current_index = ZERO_INTEGER;
                ignore_null_values = T;
                sublisp_throw($sym165$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_variable_length_sequence_enumerator_current_index(self, current_index);
                    set_basic_variable_length_sequence_enumerator_sequence(self, sequence);
                    set_basic_variable_length_sequence_enumerator_ignore_null_values(self, ignore_null_values);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_variable_length_sequence_enumerator_method = Errors.handleThrowable(ccatch_env_var, $sym165$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_variable_length_sequence_enumerator_method;
    }

    public static final SubLObject basic_variable_length_sequence_enumerator_seek_non_null_forward_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_basic_variable_length_sequence_enumerator_method = NIL;
            SubLObject current_index = com.cyc.cycjava.cycl.subloop_sequences.get_basic_variable_length_sequence_enumerator_current_index(self);
            SubLObject sequence = com.cyc.cycjava.cycl.subloop_sequences.get_basic_variable_length_sequence_enumerator_sequence(self);
            try {
                try {
                    {
                        SubLObject current_length = methods.funcall_instance_method_with_0_args(sequence, LENGTH);
                        if (current_index.numGE(current_length)) {
                            sublisp_throw($sym169$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, NIL);
                        }
                        {
                            SubLObject index = current_index;
                            while (index.numL(current_length)) {
                                if (NIL != methods.funcall_instance_method_with_1_args(sequence, GET_NTH, index)) {
                                    current_index = index;
                                    sublisp_throw($sym169$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, T);
                                }
                                index = add(index, ONE_INTEGER);
                            } 
                            sublisp_throw($sym169$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, NIL);
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_sequences.set_basic_variable_length_sequence_enumerator_current_index(self, current_index);
                            com.cyc.cycjava.cycl.subloop_sequences.set_basic_variable_length_sequence_enumerator_sequence(self, sequence);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_basic_variable_length_sequence_enumerator_method = Errors.handleThrowable(ccatch_env_var, $sym169$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD);
            }
            return catch_var_for_basic_variable_length_sequence_enumerator_method;
        }
    }

    public static SubLObject basic_variable_length_sequence_enumerator_seek_non_null_forward_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_variable_length_sequence_enumerator_method = NIL;
        SubLObject current_index = get_basic_variable_length_sequence_enumerator_current_index(self);
        final SubLObject sequence = get_basic_variable_length_sequence_enumerator_sequence(self);
        try {
            thread.throwStack.push($sym169$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD);
            try {
                final SubLObject current_length = methods.funcall_instance_method_with_0_args(sequence, LENGTH);
                if (current_index.numGE(current_length)) {
                    sublisp_throw($sym169$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, NIL);
                }
                for (SubLObject index = current_index; index.numL(current_length); index = add(index, ONE_INTEGER)) {
                    if (NIL != methods.funcall_instance_method_with_1_args(sequence, GET_NTH, index)) {
                        current_index = index;
                        sublisp_throw($sym169$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, T);
                    }
                }
                sublisp_throw($sym169$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_variable_length_sequence_enumerator_current_index(self, current_index);
                    set_basic_variable_length_sequence_enumerator_sequence(self, sequence);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_variable_length_sequence_enumerator_method = Errors.handleThrowable(ccatch_env_var, $sym169$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_variable_length_sequence_enumerator_method;
    }

    public static final SubLObject basic_variable_length_sequence_enumerator_seek_non_null_backward_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_basic_variable_length_sequence_enumerator_method = NIL;
            SubLObject current_index = com.cyc.cycjava.cycl.subloop_sequences.get_basic_variable_length_sequence_enumerator_current_index(self);
            SubLObject sequence = com.cyc.cycjava.cycl.subloop_sequences.get_basic_variable_length_sequence_enumerator_sequence(self);
            try {
                try {
                    if (current_index.numE(ZERO_INTEGER)) {
                        sublisp_throw($sym173$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, NIL);
                    }
                    {
                        SubLObject index = current_index;
                        while (index.numGE(ZERO_INTEGER)) {
                            if (NIL != methods.funcall_instance_method_with_1_args(sequence, GET_NTH, index)) {
                                current_index = index;
                                sublisp_throw($sym173$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, T);
                            }
                            index = subtract(index, ONE_INTEGER);
                        } 
                        sublisp_throw($sym173$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, NIL);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_sequences.set_basic_variable_length_sequence_enumerator_current_index(self, current_index);
                            com.cyc.cycjava.cycl.subloop_sequences.set_basic_variable_length_sequence_enumerator_sequence(self, sequence);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_basic_variable_length_sequence_enumerator_method = Errors.handleThrowable(ccatch_env_var, $sym173$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD);
            }
            return catch_var_for_basic_variable_length_sequence_enumerator_method;
        }
    }

    public static SubLObject basic_variable_length_sequence_enumerator_seek_non_null_backward_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_variable_length_sequence_enumerator_method = NIL;
        SubLObject current_index = get_basic_variable_length_sequence_enumerator_current_index(self);
        final SubLObject sequence = get_basic_variable_length_sequence_enumerator_sequence(self);
        try {
            thread.throwStack.push($sym173$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD);
            try {
                if (current_index.numE(ZERO_INTEGER)) {
                    sublisp_throw($sym173$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, NIL);
                }
                for (SubLObject index = current_index; index.numGE(ZERO_INTEGER); index = subtract(index, ONE_INTEGER)) {
                    if (NIL != methods.funcall_instance_method_with_1_args(sequence, GET_NTH, index)) {
                        current_index = index;
                        sublisp_throw($sym173$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, T);
                    }
                }
                sublisp_throw($sym173$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_variable_length_sequence_enumerator_current_index(self, current_index);
                    set_basic_variable_length_sequence_enumerator_sequence(self, sequence);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_variable_length_sequence_enumerator_method = Errors.handleThrowable(ccatch_env_var, $sym173$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_variable_length_sequence_enumerator_method;
    }

    public static final SubLObject basic_variable_length_sequence_enumerator_set_sequence_method_alt(SubLObject self, SubLObject new_sequence) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_basic_variable_length_sequence_enumerator_method = NIL;
                SubLObject current_index = com.cyc.cycjava.cycl.subloop_sequences.get_basic_variable_length_sequence_enumerator_current_index(self);
                SubLObject sequence = com.cyc.cycjava.cycl.subloop_sequences.get_basic_variable_length_sequence_enumerator_sequence(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_sequence) || (NIL != com.cyc.cycjava.cycl.subloop_sequences.variable_length_sequence_template_p(new_sequence)))) {
                                Errors.error($str_alt179$_SET_SEQUENCE__S____S_is_not_an_i, self, new_sequence);
                            }
                        }
                        sequence = new_sequence;
                        current_index = ZERO_INTEGER;
                        sublisp_throw($sym178$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, self);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                com.cyc.cycjava.cycl.subloop_sequences.set_basic_variable_length_sequence_enumerator_current_index(self, current_index);
                                com.cyc.cycjava.cycl.subloop_sequences.set_basic_variable_length_sequence_enumerator_sequence(self, sequence);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_basic_variable_length_sequence_enumerator_method = Errors.handleThrowable(ccatch_env_var, $sym178$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD);
                }
                return catch_var_for_basic_variable_length_sequence_enumerator_method;
            }
        }
    }

    public static SubLObject basic_variable_length_sequence_enumerator_set_sequence_method(final SubLObject self, final SubLObject new_sequence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_variable_length_sequence_enumerator_method = NIL;
        SubLObject current_index = get_basic_variable_length_sequence_enumerator_current_index(self);
        SubLObject sequence = get_basic_variable_length_sequence_enumerator_sequence(self);
        try {
            thread.throwStack.push($sym178$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD);
            try {
                if (((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != new_sequence)) && (NIL == variable_length_sequence_template_p(new_sequence))) {
                    Errors.error($str179$_SET_SEQUENCE__S____S_is_not_an_i, self, new_sequence);
                }
                sequence = new_sequence;
                current_index = ZERO_INTEGER;
                sublisp_throw($sym178$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_variable_length_sequence_enumerator_current_index(self, current_index);
                    set_basic_variable_length_sequence_enumerator_sequence(self, sequence);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_variable_length_sequence_enumerator_method = Errors.handleThrowable(ccatch_env_var, $sym178$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_variable_length_sequence_enumerator_method;
    }

    public static final SubLObject basic_variable_length_sequence_enumerator_get_ignore_null_values_method_alt(SubLObject self) {
        {
            SubLObject ignore_null_values = com.cyc.cycjava.cycl.subloop_sequences.get_basic_variable_length_sequence_enumerator_ignore_null_values(self);
            return ignore_null_values;
        }
    }

    public static SubLObject basic_variable_length_sequence_enumerator_get_ignore_null_values_method(final SubLObject self) {
        final SubLObject ignore_null_values = get_basic_variable_length_sequence_enumerator_ignore_null_values(self);
        return ignore_null_values;
    }

    public static final SubLObject basic_variable_length_sequence_enumerator_set_ignore_null_values_method_alt(SubLObject self, SubLObject new_value) {
        {
            SubLObject catch_var_for_basic_variable_length_sequence_enumerator_method = NIL;
            SubLObject ignore_null_values = com.cyc.cycjava.cycl.subloop_sequences.get_basic_variable_length_sequence_enumerator_ignore_null_values(self);
            try {
                try {
                    ignore_null_values = (NIL != new_value) ? ((SubLObject) (T)) : NIL;
                    sublisp_throw($sym188$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, ignore_null_values);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_sequences.set_basic_variable_length_sequence_enumerator_ignore_null_values(self, ignore_null_values);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_basic_variable_length_sequence_enumerator_method = Errors.handleThrowable(ccatch_env_var, $sym188$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD);
            }
            return catch_var_for_basic_variable_length_sequence_enumerator_method;
        }
    }

    public static SubLObject basic_variable_length_sequence_enumerator_set_ignore_null_values_method(final SubLObject self, final SubLObject new_value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_variable_length_sequence_enumerator_method = NIL;
        SubLObject ignore_null_values = get_basic_variable_length_sequence_enumerator_ignore_null_values(self);
        try {
            thread.throwStack.push($sym188$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD);
            try {
                ignore_null_values = (NIL != new_value) ? T : NIL;
                sublisp_throw($sym188$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, ignore_null_values);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_variable_length_sequence_enumerator_ignore_null_values(self, ignore_null_values);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_variable_length_sequence_enumerator_method = Errors.handleThrowable(ccatch_env_var, $sym188$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_variable_length_sequence_enumerator_method;
    }

    public static final SubLObject basic_variable_length_sequence_enumerator_empty_p_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_basic_variable_length_sequence_enumerator_method = NIL;
            SubLObject sequence = com.cyc.cycjava.cycl.subloop_sequences.get_basic_variable_length_sequence_enumerator_sequence(self);
            SubLObject ignore_null_values = com.cyc.cycjava.cycl.subloop_sequences.get_basic_variable_length_sequence_enumerator_ignore_null_values(self);
            try {
                try {
                    if (NIL == sequence) {
                        sublisp_throw($sym191$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, T);
                    }
                    if (NIL != ignore_null_values) {
                        sublisp_throw($sym191$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, methods.funcall_instance_method_with_0_args(sequence, ALL_NULL_P));
                    } else {
                        sublisp_throw($sym191$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, numE(methods.funcall_instance_method_with_0_args(sequence, GET_LENGTH), ZERO_INTEGER));
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_sequences.set_basic_variable_length_sequence_enumerator_sequence(self, sequence);
                            com.cyc.cycjava.cycl.subloop_sequences.set_basic_variable_length_sequence_enumerator_ignore_null_values(self, ignore_null_values);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_basic_variable_length_sequence_enumerator_method = Errors.handleThrowable(ccatch_env_var, $sym191$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD);
            }
            return catch_var_for_basic_variable_length_sequence_enumerator_method;
        }
    }

    public static SubLObject basic_variable_length_sequence_enumerator_empty_p_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_variable_length_sequence_enumerator_method = NIL;
        final SubLObject sequence = get_basic_variable_length_sequence_enumerator_sequence(self);
        final SubLObject ignore_null_values = get_basic_variable_length_sequence_enumerator_ignore_null_values(self);
        try {
            thread.throwStack.push($sym191$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD);
            try {
                if (NIL == sequence) {
                    sublisp_throw($sym191$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, T);
                }
                if (NIL != ignore_null_values) {
                    sublisp_throw($sym191$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, methods.funcall_instance_method_with_0_args(sequence, ALL_NULL_P));
                } else {
                    sublisp_throw($sym191$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, numE(methods.funcall_instance_method_with_0_args(sequence, GET_LENGTH), ZERO_INTEGER));
                }
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_variable_length_sequence_enumerator_sequence(self, sequence);
                    set_basic_variable_length_sequence_enumerator_ignore_null_values(self, ignore_null_values);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_variable_length_sequence_enumerator_method = Errors.handleThrowable(ccatch_env_var, $sym191$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_variable_length_sequence_enumerator_method;
    }

    public static final SubLObject basic_variable_length_sequence_enumerator_first_p_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_basic_variable_length_sequence_enumerator_method = NIL;
            SubLObject current_index = com.cyc.cycjava.cycl.subloop_sequences.get_basic_variable_length_sequence_enumerator_current_index(self);
            SubLObject sequence = com.cyc.cycjava.cycl.subloop_sequences.get_basic_variable_length_sequence_enumerator_sequence(self);
            SubLObject ignore_null_values = com.cyc.cycjava.cycl.subloop_sequences.get_basic_variable_length_sequence_enumerator_ignore_null_values(self);
            try {
                try {
                    if (NIL == sequence) {
                        sublisp_throw($sym194$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, NIL);
                    }
                    if (NIL != ignore_null_values) {
                        sublisp_throw($sym194$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, numE(current_index, methods.funcall_instance_method_with_1_args(sequence, INDEX_OF_NEXT_NON_NIL_ELEMENT, ZERO_INTEGER)));
                    } else {
                        sublisp_throw($sym194$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, numE(current_index, ZERO_INTEGER));
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_sequences.set_basic_variable_length_sequence_enumerator_current_index(self, current_index);
                            com.cyc.cycjava.cycl.subloop_sequences.set_basic_variable_length_sequence_enumerator_sequence(self, sequence);
                            com.cyc.cycjava.cycl.subloop_sequences.set_basic_variable_length_sequence_enumerator_ignore_null_values(self, ignore_null_values);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_basic_variable_length_sequence_enumerator_method = Errors.handleThrowable(ccatch_env_var, $sym194$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD);
            }
            return catch_var_for_basic_variable_length_sequence_enumerator_method;
        }
    }

    public static SubLObject basic_variable_length_sequence_enumerator_first_p_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_variable_length_sequence_enumerator_method = NIL;
        final SubLObject current_index = get_basic_variable_length_sequence_enumerator_current_index(self);
        final SubLObject sequence = get_basic_variable_length_sequence_enumerator_sequence(self);
        final SubLObject ignore_null_values = get_basic_variable_length_sequence_enumerator_ignore_null_values(self);
        try {
            thread.throwStack.push($sym194$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD);
            try {
                if (NIL == sequence) {
                    sublisp_throw($sym194$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, NIL);
                }
                if (NIL != ignore_null_values) {
                    sublisp_throw($sym194$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, numE(current_index, methods.funcall_instance_method_with_1_args(sequence, INDEX_OF_NEXT_NON_NIL_ELEMENT, ZERO_INTEGER)));
                } else {
                    sublisp_throw($sym194$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, numE(current_index, ZERO_INTEGER));
                }
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_variable_length_sequence_enumerator_current_index(self, current_index);
                    set_basic_variable_length_sequence_enumerator_sequence(self, sequence);
                    set_basic_variable_length_sequence_enumerator_ignore_null_values(self, ignore_null_values);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_variable_length_sequence_enumerator_method = Errors.handleThrowable(ccatch_env_var, $sym194$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_variable_length_sequence_enumerator_method;
    }

    public static final SubLObject basic_variable_length_sequence_enumerator_last_p_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_basic_variable_length_sequence_enumerator_method = NIL;
            SubLObject current_index = com.cyc.cycjava.cycl.subloop_sequences.get_basic_variable_length_sequence_enumerator_current_index(self);
            SubLObject sequence = com.cyc.cycjava.cycl.subloop_sequences.get_basic_variable_length_sequence_enumerator_sequence(self);
            SubLObject ignore_null_values = com.cyc.cycjava.cycl.subloop_sequences.get_basic_variable_length_sequence_enumerator_ignore_null_values(self);
            try {
                try {
                    if (NIL == sequence) {
                        sublisp_throw($sym197$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, NIL);
                    }
                    {
                        SubLObject length = methods.funcall_instance_method_with_0_args(sequence, GET_LENGTH);
                        if (NIL != ignore_null_values) {
                            sublisp_throw($sym197$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, numE(current_index, methods.funcall_instance_method_with_1_args(sequence, INDEX_OF_PREVIOUS_NON_NIL_ELEMENT, length)));
                        } else {
                            sublisp_throw($sym197$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, numE(current_index, subtract(length, ONE_INTEGER)));
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_sequences.set_basic_variable_length_sequence_enumerator_current_index(self, current_index);
                            com.cyc.cycjava.cycl.subloop_sequences.set_basic_variable_length_sequence_enumerator_sequence(self, sequence);
                            com.cyc.cycjava.cycl.subloop_sequences.set_basic_variable_length_sequence_enumerator_ignore_null_values(self, ignore_null_values);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_basic_variable_length_sequence_enumerator_method = Errors.handleThrowable(ccatch_env_var, $sym197$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD);
            }
            return catch_var_for_basic_variable_length_sequence_enumerator_method;
        }
    }

    public static SubLObject basic_variable_length_sequence_enumerator_last_p_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_variable_length_sequence_enumerator_method = NIL;
        final SubLObject current_index = get_basic_variable_length_sequence_enumerator_current_index(self);
        final SubLObject sequence = get_basic_variable_length_sequence_enumerator_sequence(self);
        final SubLObject ignore_null_values = get_basic_variable_length_sequence_enumerator_ignore_null_values(self);
        try {
            thread.throwStack.push($sym197$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD);
            try {
                if (NIL == sequence) {
                    sublisp_throw($sym197$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, NIL);
                }
                final SubLObject length = methods.funcall_instance_method_with_0_args(sequence, GET_LENGTH);
                if (NIL != ignore_null_values) {
                    sublisp_throw($sym197$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, numE(current_index, methods.funcall_instance_method_with_1_args(sequence, INDEX_OF_PREVIOUS_NON_NIL_ELEMENT, length)));
                } else {
                    sublisp_throw($sym197$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, numE(current_index, subtract(length, ONE_INTEGER)));
                }
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_variable_length_sequence_enumerator_current_index(self, current_index);
                    set_basic_variable_length_sequence_enumerator_sequence(self, sequence);
                    set_basic_variable_length_sequence_enumerator_ignore_null_values(self, ignore_null_values);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_variable_length_sequence_enumerator_method = Errors.handleThrowable(ccatch_env_var, $sym197$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_variable_length_sequence_enumerator_method;
    }

    public static final SubLObject basic_variable_length_sequence_enumerator_current_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_basic_variable_length_sequence_enumerator_method = NIL;
            SubLObject current_index = com.cyc.cycjava.cycl.subloop_sequences.get_basic_variable_length_sequence_enumerator_current_index(self);
            SubLObject sequence = com.cyc.cycjava.cycl.subloop_sequences.get_basic_variable_length_sequence_enumerator_sequence(self);
            try {
                try {
                    if (NIL == sequence) {
                        sublisp_throw($sym200$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, NIL);
                    }
                    {
                        SubLObject length = methods.funcall_instance_method_with_0_args(sequence, GET_LENGTH);
                        if (current_index.numGE(ZERO_INTEGER) && current_index.numL(length)) {
                            sublisp_throw($sym200$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, methods.funcall_instance_method_with_1_args(sequence, GET_NTH, current_index));
                        }
                    }
                    sublisp_throw($sym200$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_sequences.set_basic_variable_length_sequence_enumerator_current_index(self, current_index);
                            com.cyc.cycjava.cycl.subloop_sequences.set_basic_variable_length_sequence_enumerator_sequence(self, sequence);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_basic_variable_length_sequence_enumerator_method = Errors.handleThrowable(ccatch_env_var, $sym200$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD);
            }
            return catch_var_for_basic_variable_length_sequence_enumerator_method;
        }
    }

    public static SubLObject basic_variable_length_sequence_enumerator_current_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_variable_length_sequence_enumerator_method = NIL;
        final SubLObject current_index = get_basic_variable_length_sequence_enumerator_current_index(self);
        final SubLObject sequence = get_basic_variable_length_sequence_enumerator_sequence(self);
        try {
            thread.throwStack.push($sym200$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD);
            try {
                if (NIL == sequence) {
                    sublisp_throw($sym200$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, NIL);
                }
                final SubLObject length = methods.funcall_instance_method_with_0_args(sequence, GET_LENGTH);
                if (current_index.numGE(ZERO_INTEGER) && current_index.numL(length)) {
                    sublisp_throw($sym200$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, methods.funcall_instance_method_with_1_args(sequence, GET_NTH, current_index));
                }
                sublisp_throw($sym200$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_variable_length_sequence_enumerator_current_index(self, current_index);
                    set_basic_variable_length_sequence_enumerator_sequence(self, sequence);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_variable_length_sequence_enumerator_method = Errors.handleThrowable(ccatch_env_var, $sym200$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_variable_length_sequence_enumerator_method;
    }

    public static final SubLObject basic_variable_length_sequence_enumerator_first_method_alt(SubLObject self) {
        {
            SubLObject current_index = com.cyc.cycjava.cycl.subloop_sequences.get_basic_variable_length_sequence_enumerator_current_index(self);
            SubLObject sequence = com.cyc.cycjava.cycl.subloop_sequences.get_basic_variable_length_sequence_enumerator_sequence(self);
            SubLObject ignore_null_values = com.cyc.cycjava.cycl.subloop_sequences.get_basic_variable_length_sequence_enumerator_ignore_null_values(self);
            if (NIL != ignore_null_values) {
                {
                    SubLObject first_index = methods.funcall_instance_method_with_1_args(sequence, INDEX_OF_NEXT_NON_NIL_ELEMENT, ZERO_INTEGER);
                    if (NIL != first_index) {
                        current_index = first_index;
                        com.cyc.cycjava.cycl.subloop_sequences.set_basic_variable_length_sequence_enumerator_current_index(self, current_index);
                        return com.cyc.cycjava.cycl.subloop_sequences.basic_variable_length_sequence_enumerator_current_method(self);
                    } else {
                        return NIL;
                    }
                }
            } else {
                current_index = ZERO_INTEGER;
                com.cyc.cycjava.cycl.subloop_sequences.set_basic_variable_length_sequence_enumerator_current_index(self, current_index);
                return com.cyc.cycjava.cycl.subloop_sequences.basic_variable_length_sequence_enumerator_current_method(self);
            }
        }
    }

    public static SubLObject basic_variable_length_sequence_enumerator_first_method(final SubLObject self) {
        SubLObject current_index = get_basic_variable_length_sequence_enumerator_current_index(self);
        final SubLObject sequence = get_basic_variable_length_sequence_enumerator_sequence(self);
        final SubLObject ignore_null_values = get_basic_variable_length_sequence_enumerator_ignore_null_values(self);
        if (NIL == ignore_null_values) {
            current_index = ZERO_INTEGER;
            set_basic_variable_length_sequence_enumerator_current_index(self, current_index);
            return basic_variable_length_sequence_enumerator_current_method(self);
        }
        final SubLObject first_index = methods.funcall_instance_method_with_1_args(sequence, INDEX_OF_NEXT_NON_NIL_ELEMENT, ZERO_INTEGER);
        if (NIL != first_index) {
            current_index = first_index;
            set_basic_variable_length_sequence_enumerator_current_index(self, current_index);
            return basic_variable_length_sequence_enumerator_current_method(self);
        }
        return NIL;
    }

    public static final SubLObject basic_variable_length_sequence_enumerator_last_method_alt(SubLObject self) {
        {
            SubLObject current_index = com.cyc.cycjava.cycl.subloop_sequences.get_basic_variable_length_sequence_enumerator_current_index(self);
            SubLObject sequence = com.cyc.cycjava.cycl.subloop_sequences.get_basic_variable_length_sequence_enumerator_sequence(self);
            SubLObject ignore_null_values = com.cyc.cycjava.cycl.subloop_sequences.get_basic_variable_length_sequence_enumerator_ignore_null_values(self);
            if (NIL == sequence) {
                return NIL;
            }
            {
                SubLObject length = methods.funcall_instance_method_with_0_args(sequence, GET_LENGTH);
                if (NIL != ignore_null_values) {
                    {
                        SubLObject last_index = methods.funcall_instance_method_with_1_args(sequence, INDEX_OF_PREVIOUS_NON_NIL_ELEMENT, length);
                        if (NIL != last_index) {
                            current_index = last_index;
                            com.cyc.cycjava.cycl.subloop_sequences.set_basic_variable_length_sequence_enumerator_current_index(self, current_index);
                            return com.cyc.cycjava.cycl.subloop_sequences.basic_variable_length_sequence_enumerator_current_method(self);
                        } else {
                            return NIL;
                        }
                    }
                } else {
                    current_index = subtract(length, ONE_INTEGER);
                    com.cyc.cycjava.cycl.subloop_sequences.set_basic_variable_length_sequence_enumerator_current_index(self, current_index);
                    return com.cyc.cycjava.cycl.subloop_sequences.basic_variable_length_sequence_enumerator_current_method(self);
                }
            }
        }
    }

    public static SubLObject basic_variable_length_sequence_enumerator_last_method(final SubLObject self) {
        SubLObject current_index = get_basic_variable_length_sequence_enumerator_current_index(self);
        final SubLObject sequence = get_basic_variable_length_sequence_enumerator_sequence(self);
        final SubLObject ignore_null_values = get_basic_variable_length_sequence_enumerator_ignore_null_values(self);
        if (NIL == sequence) {
            return NIL;
        }
        final SubLObject length = methods.funcall_instance_method_with_0_args(sequence, GET_LENGTH);
        if (NIL == ignore_null_values) {
            current_index = subtract(length, ONE_INTEGER);
            set_basic_variable_length_sequence_enumerator_current_index(self, current_index);
            return basic_variable_length_sequence_enumerator_current_method(self);
        }
        final SubLObject last_index = methods.funcall_instance_method_with_1_args(sequence, INDEX_OF_PREVIOUS_NON_NIL_ELEMENT, length);
        if (NIL != last_index) {
            current_index = last_index;
            set_basic_variable_length_sequence_enumerator_current_index(self, current_index);
            return basic_variable_length_sequence_enumerator_current_method(self);
        }
        return NIL;
    }

    public static final SubLObject basic_variable_length_sequence_enumerator_next_method_alt(SubLObject self) {
        {
            SubLObject current_index = com.cyc.cycjava.cycl.subloop_sequences.get_basic_variable_length_sequence_enumerator_current_index(self);
            SubLObject sequence = com.cyc.cycjava.cycl.subloop_sequences.get_basic_variable_length_sequence_enumerator_sequence(self);
            SubLObject ignore_null_values = com.cyc.cycjava.cycl.subloop_sequences.get_basic_variable_length_sequence_enumerator_ignore_null_values(self);
            if (NIL == sequence) {
                return NIL;
            }
            {
                SubLObject length = methods.funcall_instance_method_with_0_args(sequence, GET_LENGTH);
                if (current_index.numGE(length)) {
                    return NIL;
                }
                if (NIL != ignore_null_values) {
                    {
                        SubLObject next_index = methods.funcall_instance_method_with_1_args(sequence, INDEX_OF_NEXT_NON_NIL_ELEMENT, add(current_index, ONE_INTEGER));
                        if (NIL != next_index) {
                            current_index = next_index;
                            com.cyc.cycjava.cycl.subloop_sequences.set_basic_variable_length_sequence_enumerator_current_index(self, current_index);
                            return com.cyc.cycjava.cycl.subloop_sequences.basic_variable_length_sequence_enumerator_current_method(self);
                        } else {
                            return NIL;
                        }
                    }
                } else {
                    current_index = add(current_index, ONE_INTEGER);
                    com.cyc.cycjava.cycl.subloop_sequences.set_basic_variable_length_sequence_enumerator_current_index(self, current_index);
                    return com.cyc.cycjava.cycl.subloop_sequences.basic_variable_length_sequence_enumerator_current_method(self);
                }
            }
        }
    }

    public static SubLObject basic_variable_length_sequence_enumerator_next_method(final SubLObject self) {
        SubLObject current_index = get_basic_variable_length_sequence_enumerator_current_index(self);
        final SubLObject sequence = get_basic_variable_length_sequence_enumerator_sequence(self);
        final SubLObject ignore_null_values = get_basic_variable_length_sequence_enumerator_ignore_null_values(self);
        if (NIL == sequence) {
            return NIL;
        }
        final SubLObject length = methods.funcall_instance_method_with_0_args(sequence, GET_LENGTH);
        if (current_index.numGE(length)) {
            return NIL;
        }
        if (NIL == ignore_null_values) {
            current_index = add(current_index, ONE_INTEGER);
            set_basic_variable_length_sequence_enumerator_current_index(self, current_index);
            return basic_variable_length_sequence_enumerator_current_method(self);
        }
        final SubLObject next_index = methods.funcall_instance_method_with_1_args(sequence, INDEX_OF_NEXT_NON_NIL_ELEMENT, add(current_index, ONE_INTEGER));
        if (NIL != next_index) {
            current_index = next_index;
            set_basic_variable_length_sequence_enumerator_current_index(self, current_index);
            return basic_variable_length_sequence_enumerator_current_method(self);
        }
        return NIL;
    }

    public static final SubLObject basic_variable_length_sequence_enumerator_previous_method_alt(SubLObject self) {
        {
            SubLObject current_index = com.cyc.cycjava.cycl.subloop_sequences.get_basic_variable_length_sequence_enumerator_current_index(self);
            SubLObject sequence = com.cyc.cycjava.cycl.subloop_sequences.get_basic_variable_length_sequence_enumerator_sequence(self);
            SubLObject ignore_null_values = com.cyc.cycjava.cycl.subloop_sequences.get_basic_variable_length_sequence_enumerator_ignore_null_values(self);
            if (NIL == sequence) {
                return NIL;
            }
            if (current_index.numLE(ZERO_INTEGER)) {
                return NIL;
            }
            if (NIL != ignore_null_values) {
                {
                    SubLObject previous_index = methods.funcall_instance_method_with_1_args(sequence, INDEX_OF_PREVIOUS_NON_NIL_ELEMENT, subtract(current_index, ONE_INTEGER));
                    if (NIL != previous_index) {
                        current_index = previous_index;
                        com.cyc.cycjava.cycl.subloop_sequences.set_basic_variable_length_sequence_enumerator_current_index(self, current_index);
                        return com.cyc.cycjava.cycl.subloop_sequences.basic_variable_length_sequence_enumerator_current_method(self);
                    } else {
                        return NIL;
                    }
                }
            } else {
                current_index = subtract(current_index, ONE_INTEGER);
                com.cyc.cycjava.cycl.subloop_sequences.set_basic_variable_length_sequence_enumerator_current_index(self, current_index);
                return com.cyc.cycjava.cycl.subloop_sequences.basic_variable_length_sequence_enumerator_current_method(self);
            }
        }
    }

    public static SubLObject basic_variable_length_sequence_enumerator_previous_method(final SubLObject self) {
        SubLObject current_index = get_basic_variable_length_sequence_enumerator_current_index(self);
        final SubLObject sequence = get_basic_variable_length_sequence_enumerator_sequence(self);
        final SubLObject ignore_null_values = get_basic_variable_length_sequence_enumerator_ignore_null_values(self);
        if (NIL == sequence) {
            return NIL;
        }
        if (current_index.numLE(ZERO_INTEGER)) {
            return NIL;
        }
        if (NIL == ignore_null_values) {
            current_index = subtract(current_index, ONE_INTEGER);
            set_basic_variable_length_sequence_enumerator_current_index(self, current_index);
            return basic_variable_length_sequence_enumerator_current_method(self);
        }
        final SubLObject previous_index = methods.funcall_instance_method_with_1_args(sequence, INDEX_OF_PREVIOUS_NON_NIL_ELEMENT, subtract(current_index, ONE_INTEGER));
        if (NIL != previous_index) {
            current_index = previous_index;
            set_basic_variable_length_sequence_enumerator_current_index(self, current_index);
            return basic_variable_length_sequence_enumerator_current_method(self);
        }
        return NIL;
    }

    public static final SubLObject get_basic_variable_length_sequence_sequence_class_alt(SubLObject basic_variable_length_sequence) {
        return classes.subloop_get_access_protected_instance_slot(basic_variable_length_sequence, SIX_INTEGER, SEQUENCE_CLASS);
    }

    public static SubLObject get_basic_variable_length_sequence_sequence_class(final SubLObject basic_variable_length_sequence) {
        return classes.subloop_get_access_protected_instance_slot(basic_variable_length_sequence, SIX_INTEGER, SEQUENCE_CLASS);
    }

    public static final SubLObject set_basic_variable_length_sequence_sequence_class_alt(SubLObject basic_variable_length_sequence, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_variable_length_sequence, value, SIX_INTEGER, SEQUENCE_CLASS);
    }

    public static SubLObject set_basic_variable_length_sequence_sequence_class(final SubLObject basic_variable_length_sequence, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_variable_length_sequence, value, SIX_INTEGER, SEQUENCE_CLASS);
    }

    public static final SubLObject get_basic_variable_length_sequence_growth_factor_alt(SubLObject basic_variable_length_sequence) {
        return classes.subloop_get_access_protected_instance_slot(basic_variable_length_sequence, FIVE_INTEGER, GROWTH_FACTOR);
    }

    public static SubLObject get_basic_variable_length_sequence_growth_factor(final SubLObject basic_variable_length_sequence) {
        return classes.subloop_get_access_protected_instance_slot(basic_variable_length_sequence, FIVE_INTEGER, GROWTH_FACTOR);
    }

    public static final SubLObject set_basic_variable_length_sequence_growth_factor_alt(SubLObject basic_variable_length_sequence, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_variable_length_sequence, value, FIVE_INTEGER, GROWTH_FACTOR);
    }

    public static SubLObject set_basic_variable_length_sequence_growth_factor(final SubLObject basic_variable_length_sequence, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_variable_length_sequence, value, FIVE_INTEGER, GROWTH_FACTOR);
    }

    public static final SubLObject get_basic_variable_length_sequence_default_value_alt(SubLObject basic_variable_length_sequence) {
        return classes.subloop_get_access_protected_instance_slot(basic_variable_length_sequence, FOUR_INTEGER, DEFAULT_VALUE);
    }

    public static SubLObject get_basic_variable_length_sequence_default_value(final SubLObject basic_variable_length_sequence) {
        return classes.subloop_get_access_protected_instance_slot(basic_variable_length_sequence, FOUR_INTEGER, DEFAULT_VALUE);
    }

    public static final SubLObject set_basic_variable_length_sequence_default_value_alt(SubLObject basic_variable_length_sequence, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_variable_length_sequence, value, FOUR_INTEGER, DEFAULT_VALUE);
    }

    public static SubLObject set_basic_variable_length_sequence_default_value(final SubLObject basic_variable_length_sequence, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_variable_length_sequence, value, FOUR_INTEGER, DEFAULT_VALUE);
    }

    public static final SubLObject get_basic_variable_length_sequence_largest_index_alt(SubLObject basic_variable_length_sequence) {
        return classes.subloop_get_access_protected_instance_slot(basic_variable_length_sequence, THREE_INTEGER, LARGEST_INDEX);
    }

    public static SubLObject get_basic_variable_length_sequence_largest_index(final SubLObject basic_variable_length_sequence) {
        return classes.subloop_get_access_protected_instance_slot(basic_variable_length_sequence, THREE_INTEGER, LARGEST_INDEX);
    }

    public static final SubLObject set_basic_variable_length_sequence_largest_index_alt(SubLObject basic_variable_length_sequence, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_variable_length_sequence, value, THREE_INTEGER, LARGEST_INDEX);
    }

    public static SubLObject set_basic_variable_length_sequence_largest_index(final SubLObject basic_variable_length_sequence, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_variable_length_sequence, value, THREE_INTEGER, LARGEST_INDEX);
    }

    public static final SubLObject get_basic_variable_length_sequence_storage_size_alt(SubLObject basic_variable_length_sequence) {
        return classes.subloop_get_access_protected_instance_slot(basic_variable_length_sequence, TWO_INTEGER, STORAGE_SIZE);
    }

    public static SubLObject get_basic_variable_length_sequence_storage_size(final SubLObject basic_variable_length_sequence) {
        return classes.subloop_get_access_protected_instance_slot(basic_variable_length_sequence, TWO_INTEGER, STORAGE_SIZE);
    }

    public static final SubLObject set_basic_variable_length_sequence_storage_size_alt(SubLObject basic_variable_length_sequence, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_variable_length_sequence, value, TWO_INTEGER, STORAGE_SIZE);
    }

    public static SubLObject set_basic_variable_length_sequence_storage_size(final SubLObject basic_variable_length_sequence, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_variable_length_sequence, value, TWO_INTEGER, STORAGE_SIZE);
    }

    public static final SubLObject get_basic_variable_length_sequence_internal_storage_alt(SubLObject basic_variable_length_sequence) {
        return classes.subloop_get_access_protected_instance_slot(basic_variable_length_sequence, ONE_INTEGER, INTERNAL_STORAGE);
    }

    public static SubLObject get_basic_variable_length_sequence_internal_storage(final SubLObject basic_variable_length_sequence) {
        return classes.subloop_get_access_protected_instance_slot(basic_variable_length_sequence, ONE_INTEGER, INTERNAL_STORAGE);
    }

    static private final SubLList $list_alt1 = list(new SubLObject[]{ list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SELF-DELETION-MODE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SELF-DELETION-MODE"), list(makeSymbol("MODE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-INDEX"), list(makeSymbol("SEQUENCE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-INDEX"), list(makeSymbol("SEQUENCE"), makeSymbol("INDEX")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DELETE-SELF-FROM-SEQUENCE"), list(makeSymbol("SEQUENCE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TRANSFER-SELF"), list(makeSymbol("CURRENT-SEQUENCE"), makeSymbol("NEW-SEQUENCE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DELETE-SELF-FROM-ALL-SEQUENCES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("MEMBER-P"), list(makeSymbol("SEQUENCE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SEQUENCES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-ADD"), list(makeSymbol("PARENT-SEQUENCE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-DELETE"), list(makeSymbol("PARENT-SEQUENCE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PERFORM-ACTION"), list(makeSymbol("ACTION"), makeSymbol("PARAMETERS")), makeKeyword("PUBLIC")) });

    public static final SubLObject set_basic_variable_length_sequence_internal_storage_alt(SubLObject basic_variable_length_sequence, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_variable_length_sequence, value, ONE_INTEGER, INTERNAL_STORAGE);
    }

    public static SubLObject set_basic_variable_length_sequence_internal_storage(final SubLObject basic_variable_length_sequence, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_variable_length_sequence, value, ONE_INTEGER, INTERNAL_STORAGE);
    }

    public static final SubLObject basic_variable_length_sequence_index_of_previous_non_nil_element_method_alt(SubLObject self, SubLObject start_index) {
        {
            SubLObject template_internal_storage = com.cyc.cycjava.cycl.subloop_sequences.basic_variable_length_sequence_get_internal_storage_method(self);
            if (NIL == template_internal_storage) {
                return NIL;
            }
            {
                SubLObject template_length = com.cyc.cycjava.cycl.subloop_sequences.basic_variable_length_sequence_get_length_method(self);
                if (template_length.isZero()) {
                    return NIL;
                }
                start_index = min(max(start_index, ZERO_INTEGER), subtract(template_length, ONE_INTEGER));
                {
                    SubLObject template_index = start_index;
                    while (template_index.numGE(ZERO_INTEGER)) {
                        if (NIL != aref(template_internal_storage, template_index)) {
                            return template_index;
                        }
                        template_index = subtract(template_index, ONE_INTEGER);
                    } 
                    return NIL;
                }
            }
        }
    }

    public static SubLObject basic_variable_length_sequence_index_of_previous_non_nil_element_method(final SubLObject self, SubLObject start_index) {
        final SubLObject template_internal_storage = basic_variable_length_sequence_get_internal_storage_method(self);
        if (NIL == template_internal_storage) {
            return NIL;
        }
        final SubLObject template_length = basic_variable_length_sequence_get_length_method(self);
        if (template_length.isZero()) {
            return NIL;
        }
        SubLObject template_index;
        for (start_index = template_index = min(max(start_index, ZERO_INTEGER), subtract(template_length, ONE_INTEGER)); template_index.numGE(ZERO_INTEGER); template_index = subtract(template_index, ONE_INTEGER)) {
            if (NIL != aref(template_internal_storage, template_index)) {
                return template_index;
            }
        }
        return NIL;
    }

    public static final SubLObject basic_variable_length_sequence_index_of_next_non_nil_element_method_alt(SubLObject self, SubLObject start_index) {
        {
            SubLObject template_internal_storage = com.cyc.cycjava.cycl.subloop_sequences.basic_variable_length_sequence_get_internal_storage_method(self);
            if (NIL == template_internal_storage) {
                return NIL;
            }
            {
                SubLObject template_length = com.cyc.cycjava.cycl.subloop_sequences.basic_variable_length_sequence_get_length_method(self);
                if (template_length.isZero()) {
                    return NIL;
                }
                if (start_index.numGE(template_length)) {
                    return NIL;
                }
                start_index = min(max(start_index, ZERO_INTEGER), subtract(template_length, ONE_INTEGER));
                {
                    SubLObject template_index = start_index;
                    while (template_index.numL(template_length)) {
                        if (NIL != aref(template_internal_storage, template_index)) {
                            return template_index;
                        }
                        template_index = add(template_index, ONE_INTEGER);
                    } 
                    return NIL;
                }
            }
        }
    }

    public static SubLObject basic_variable_length_sequence_index_of_next_non_nil_element_method(final SubLObject self, SubLObject start_index) {
        final SubLObject template_internal_storage = basic_variable_length_sequence_get_internal_storage_method(self);
        if (NIL == template_internal_storage) {
            return NIL;
        }
        final SubLObject template_length = basic_variable_length_sequence_get_length_method(self);
        if (template_length.isZero()) {
            return NIL;
        }
        if (start_index.numGE(template_length)) {
            return NIL;
        }
        SubLObject template_index;
        for (start_index = template_index = min(max(start_index, ZERO_INTEGER), subtract(template_length, ONE_INTEGER)); template_index.numL(template_length); template_index = add(template_index, ONE_INTEGER)) {
            if (NIL != aref(template_internal_storage, template_index)) {
                return template_index;
            }
        }
        return NIL;
    }

    static private final SubLList $list_alt3 = list(new SubLObject[]{ list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEAR"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-LENGTH"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-NTH"), list(makeSymbol("N"), makeSymbol("&OPTIONAL"), list(makeSymbol("OUT-OF-RANGE-VALUE"), NIL)), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-NTH"), list(makeSymbol("N"), makeSymbol("NEW-VALUE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SUBSEQUENCE"), list(makeSymbol("START-INDEX"), makeSymbol("&OPTIONAL"), list(makeSymbol("END-INDEX"), NIL)), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SEQUENCE-CLASS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SEQUENCE-CLASS"), list(makeSymbol("NEW-CLASS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONTENTS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ALLOCATE-ENUMERATOR"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEALLOCATE-ENUMERATOR"), list(makeSymbol("OLD-ENUMERATOR")), makeKeyword("PUBLIC")) });

    public static final SubLObject basic_variable_length_sequence_all_null_p_method_alt(SubLObject self) {
        {
            SubLObject template_storage = com.cyc.cycjava.cycl.subloop_sequences.basic_variable_length_sequence_get_internal_storage_method(self);
            SubLObject template_length = com.cyc.cycjava.cycl.subloop_sequences.basic_variable_length_sequence_get_length_method(self);
            SubLObject template_index = NIL;
            for (template_index = ZERO_INTEGER; template_index.numL(template_length); template_index = add(template_index, ONE_INTEGER)) {
                if (NIL != aref(template_storage, template_index)) {
                    return NIL;
                }
            }
            return T;
        }
    }

    public static SubLObject basic_variable_length_sequence_all_null_p_method(final SubLObject self) {
        final SubLObject template_storage = basic_variable_length_sequence_get_internal_storage_method(self);
        SubLObject template_length;
        SubLObject template_index;
        for (template_length = basic_variable_length_sequence_get_length_method(self), template_index = NIL, template_index = ZERO_INTEGER; template_index.numL(template_length); template_index = add(template_index, ONE_INTEGER)) {
            if (NIL != aref(template_storage, template_index)) {
                return NIL;
            }
        }
        return T;
    }

    public static final SubLObject basic_variable_length_sequence_deallocate_enumerator_method_alt(SubLObject self, SubLObject old_enumerator) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == com.cyc.cycjava.cycl.subloop_sequences.basic_variable_length_sequence_enumerator_p(old_enumerator)) {
                    Errors.error($str_alt220$_DEALLOCATE_ENUMERATOR__S____S_is, self, old_enumerator);
                }
            }
            com.cyc.cycjava.cycl.subloop_sequences.basic_variable_length_sequence_enumerator_set_sequence_method(old_enumerator, NIL);
            return NIL;
        }
    }

    public static SubLObject basic_variable_length_sequence_deallocate_enumerator_method(final SubLObject self, final SubLObject old_enumerator) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == basic_variable_length_sequence_enumerator_p(old_enumerator))) {
            Errors.error($str220$_DEALLOCATE_ENUMERATOR__S____S_is, self, old_enumerator);
        }
        basic_variable_length_sequence_enumerator_set_sequence_method(old_enumerator, NIL);
        return NIL;
    }

    static private final SubLList $list_alt5 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt6 = list(list(makeSymbol("CLET"), list(list(makeSymbol("LIST-OF-CONTENTS"), NIL)), list(makeSymbol("CDOTIMES"), list(makeSymbol("INDEX"), list(makeSymbol("GET-LENGTH"), makeSymbol("SELF"))), list(makeSymbol("CPUSH"), list(makeSymbol("GET-NTH"), makeSymbol("SELF"), makeSymbol("INDEX")), makeSymbol("LIST-OF-CONTENTS"))), list(RET, list(makeSymbol("NREVERSE"), makeSymbol("LIST-OF-CONTENTS")))));

    public static final SubLObject basic_variable_length_sequence_allocate_enumerator_method_alt(SubLObject self) {
        {
            SubLObject template_enumerator = object.new_class_instance(BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR);
            com.cyc.cycjava.cycl.subloop_sequences.basic_variable_length_sequence_enumerator_set_sequence_method(template_enumerator, self);
            return template_enumerator;
        }
    }

    public static SubLObject basic_variable_length_sequence_allocate_enumerator_method(final SubLObject self) {
        final SubLObject template_enumerator = object.new_class_instance(BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR);
        basic_variable_length_sequence_enumerator_set_sequence_method(template_enumerator, self);
        return template_enumerator;
    }

    static private final SubLList $list_alt8 = list(makeSymbol("SEQUENCE"));

    static private final SubLList $list_alt9 = list(makeKeyword("EXTENDS"), list(makeSymbol("SEQUENCE")));

    static private final SubLList $list_alt10 = list(new SubLObject[]{ list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-INTERNAL-STORAGE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-INTERNAL-STORAGE"), list(makeSymbol("NEW-INTERNAL-STORAGE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEAR"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-LENGTH"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-NTH"), list(makeSymbol("N"), makeSymbol("&OPTIONAL"), list(makeSymbol("OUT-OF-RANGE-VALUE"))), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-NTH"), list(makeSymbol("N"), makeSymbol("NEW-VALUE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INSERT-AT"), list(makeSymbol("N"), makeSymbol("NEW-VALUE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SUBSEQUENCE"), list(makeSymbol("START-INDEX"), makeSymbol("&OPTIONAL"), list(makeSymbol("END-INDEX"), NIL)), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ALLOCATE-ENUMERATOR"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEALLOCATE-ENUMERATOR"), list(makeSymbol("OLD-ENUMERATOR")), makeKeyword("PUBLIC")) });

    public static final SubLObject basic_variable_length_sequence_add_method_alt(SubLObject self, SubLObject new_element) {
        return com.cyc.cycjava.cycl.subloop_sequences.basic_variable_length_sequence_set_nth_method(self, add(com.cyc.cycjava.cycl.subloop_sequences.basic_variable_length_sequence_get_largest_index_method(self), ONE_INTEGER), new_element);
    }

    public static SubLObject basic_variable_length_sequence_add_method(final SubLObject self, final SubLObject new_element) {
        return basic_variable_length_sequence_set_nth_method(self, add(basic_variable_length_sequence_get_largest_index_method(self), ONE_INTEGER), new_element);
    }

    public static final SubLObject basic_variable_length_sequence_get_subsequence_method_alt(SubLObject self, SubLObject start_index, SubLObject end_index) {
        if (end_index == UNPROVIDED) {
            end_index = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!start_index.numGE(ZERO_INTEGER)) {
                    Errors.error($str_alt224$_GET_SUBSEQUENCE__S___Index__S_is, self, start_index);
                }
            }
            {
                SubLObject template_length = com.cyc.cycjava.cycl.subloop_sequences.basic_variable_length_sequence_get_length_method(self);
                if (NIL == end_index) {
                    end_index = template_length;
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (!end_index.numLE(template_length)) {
                        Errors.error($str_alt225$_GET_SUBSEQUENCE__S___End_index__, end_index, template_length);
                    }
                }
                {
                    SubLObject template_class = com.cyc.cycjava.cycl.subloop_sequences.basic_variable_length_sequence_get_sequence_class_method(self);
                    SubLObject template_instance = object.new_object_instance(template_class);
                    SubLObject template_original_index = start_index;
                    SubLObject template_index_count = subtract(end_index, start_index);
                    SubLObject template_index = NIL;
                    for (template_index = ZERO_INTEGER; template_index.numL(template_index_count); template_index = add(template_index, ONE_INTEGER)) {
                        methods.funcall_instance_method_with_2_args(template_instance, SET_NTH, template_index, com.cyc.cycjava.cycl.subloop_sequences.basic_variable_length_sequence_get_nth_method(self, template_original_index, UNPROVIDED));
                        template_original_index = add(template_original_index, ONE_INTEGER);
                    }
                    return template_instance;
                }
            }
        }
    }

    public static SubLObject basic_variable_length_sequence_get_subsequence_method(final SubLObject self, final SubLObject start_index, SubLObject end_index) {
        if (end_index == UNPROVIDED) {
            end_index = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!start_index.numGE(ZERO_INTEGER))) {
            Errors.error($str224$_GET_SUBSEQUENCE__S___Index__S_is, self, start_index);
        }
        final SubLObject template_length = basic_variable_length_sequence_get_length_method(self);
        if (NIL == end_index) {
            end_index = template_length;
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!end_index.numLE(template_length))) {
            Errors.error($str225$_GET_SUBSEQUENCE__S___End_index__, end_index, template_length);
        }
        final SubLObject template_class = basic_variable_length_sequence_get_sequence_class_method(self);
        final SubLObject template_instance = object.new_object_instance(template_class);
        SubLObject template_original_index = start_index;
        SubLObject template_index_count;
        SubLObject template_index;
        for (template_index_count = subtract(end_index, start_index), template_index = NIL, template_index = ZERO_INTEGER; template_index.numL(template_index_count); template_index = add(template_index, ONE_INTEGER)) {
            methods.funcall_instance_method_with_2_args(template_instance, SET_NTH, template_index, basic_variable_length_sequence_get_nth_method(self, template_original_index, UNPROVIDED));
            template_original_index = add(template_original_index, ONE_INTEGER);
        }
        return template_instance;
    }

    static private final SubLList $list_alt12 = list(list(makeSymbol("SET-INTERNAL-STORAGE"), makeSymbol("SELF"), NIL), list(RET, NIL));

    static private final SubLList $list_alt14 = list(list(RET, list(makeSymbol("LENGTH"), list(makeSymbol("GET-INTERNAL-STORAGE"), makeSymbol("SELF")))));

    static private final SubLList $list_alt16 = list(makeSymbol("N"), makeSymbol("&OPTIONAL"), list(makeSymbol("OUT-OF-RANGE-VALUE")));

    static private final SubLList $list_alt17 = list(list(makeSymbol("PWHEN"), list(makeSymbol("<"), makeSymbol("N"), ZERO_INTEGER), list(RET, makeSymbol("OUT-OF-RANGE-VALUE"))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CURRENT-CONS"), list(makeSymbol("GET-INTERNAL-STORAGE"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-INDEX"), ZERO_INTEGER)), list(makeSymbol("WHILE"), makeSymbol("TEMPLATE-CURRENT-CONS"), list(makeSymbol("PWHEN"), list(makeSymbol("="), makeSymbol("N"), makeSymbol("TEMPLATE-INDEX")), list(RET, list(makeSymbol("CAR"), makeSymbol("TEMPLATE-CURRENT-CONS")))), list(makeSymbol("CINC"), makeSymbol("TEMPLATE-INDEX")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-CURRENT-CONS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-CURRENT-CONS")))), list(RET, makeSymbol("OUT-OF-RANGE-VALUE"))));

    public static final SubLObject basic_variable_length_sequence_set_nth_method_alt(SubLObject self, SubLObject n, SubLObject new_value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!n.numGE(ZERO_INTEGER)) {
                    Errors.error($str_alt227$_SET_NTH__S___Index__S_is_less_th, self, n);
                }
            }
            {
                SubLObject template_largest_index = com.cyc.cycjava.cycl.subloop_sequences.basic_variable_length_sequence_get_largest_index_method(self);
                SubLObject template_storage_size = com.cyc.cycjava.cycl.subloop_sequences.basic_variable_length_sequence_get_storage_size_method(self);
                if (n.numGE(template_storage_size)) {
                    {
                        SubLObject template_new_storage_size = multiply(com.cyc.cycjava.cycl.subloop_sequences.basic_variable_length_sequence_get_growth_factor_method(self), n);
                        SubLObject template_old_storage = com.cyc.cycjava.cycl.subloop_sequences.basic_variable_length_sequence_get_internal_storage_method(self);
                        SubLObject template_default_value = com.cyc.cycjava.cycl.subloop_sequences.basic_variable_length_sequence_get_default_value_method(self);
                        SubLObject template_new_storage = make_vector(template_new_storage_size, template_default_value);
                        SubLObject cdotimes_end_var = add(template_largest_index, ONE_INTEGER);
                        SubLObject template_index = NIL;
                        for (template_index = ZERO_INTEGER; template_index.numL(cdotimes_end_var); template_index = add(template_index, ONE_INTEGER)) {
                            set_aref(template_new_storage, template_index, aref(template_old_storage, template_index));
                        }
                        com.cyc.cycjava.cycl.subloop_sequences.basic_variable_length_sequence_record_index_method(self, n);
                        com.cyc.cycjava.cycl.subloop_sequences.basic_variable_length_sequence_set_internal_storage_method(self, template_new_storage);
                        com.cyc.cycjava.cycl.subloop_sequences.basic_variable_length_sequence_set_storage_size_method(self, template_new_storage_size);
                        set_aref(template_new_storage, n, new_value);
                    }
                } else {
                    com.cyc.cycjava.cycl.subloop_sequences.basic_variable_length_sequence_record_index_method(self, n);
                    set_aref(com.cyc.cycjava.cycl.subloop_sequences.basic_variable_length_sequence_get_internal_storage_method(self), n, new_value);
                }
                return new_value;
            }
        }
    }

    public static SubLObject basic_variable_length_sequence_set_nth_method(final SubLObject self, final SubLObject n, final SubLObject new_value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!n.numGE(ZERO_INTEGER))) {
            Errors.error($str227$_SET_NTH__S___Index__S_is_less_th, self, n);
        }
        final SubLObject template_largest_index = basic_variable_length_sequence_get_largest_index_method(self);
        final SubLObject template_storage_size = basic_variable_length_sequence_get_storage_size_method(self);
        if (n.numGE(template_storage_size)) {
            final SubLObject template_new_storage_size = multiply(basic_variable_length_sequence_get_growth_factor_method(self), n);
            final SubLObject template_old_storage = basic_variable_length_sequence_get_internal_storage_method(self);
            final SubLObject template_default_value = basic_variable_length_sequence_get_default_value_method(self);
            final SubLObject template_new_storage = make_vector(template_new_storage_size, template_default_value);
            SubLObject cdotimes_end_var;
            SubLObject template_index;
            for (cdotimes_end_var = add(template_largest_index, ONE_INTEGER), template_index = NIL, template_index = ZERO_INTEGER; template_index.numL(cdotimes_end_var); template_index = add(template_index, ONE_INTEGER)) {
                set_aref(template_new_storage, template_index, aref(template_old_storage, template_index));
            }
            basic_variable_length_sequence_record_index_method(self, n);
            basic_variable_length_sequence_set_internal_storage_method(self, template_new_storage);
            basic_variable_length_sequence_set_storage_size_method(self, template_new_storage_size);
            set_aref(template_new_storage, n, new_value);
        } else {
            basic_variable_length_sequence_record_index_method(self, n);
            set_aref(basic_variable_length_sequence_get_internal_storage_method(self), n, new_value);
        }
        return new_value;
    }

    static private final SubLList $list_alt19 = list(makeSymbol("N"), makeSymbol("NEW-VALUE"));

    static private final SubLList $list_alt20 = list(list(makeSymbol("SET-NTH"), makeSymbol("N"), list(makeSymbol("GET-INTERNAL-STORAGE"), makeSymbol("SELF")), makeSymbol("NEW-VALUE")), list(RET, makeSymbol("NEW-VALUE")));

    static private final SubLList $list_alt22 = list(makeSymbol("START-INDEX"), makeSymbol("&OPTIONAL"), list(makeSymbol("END-INDEX"), NIL));

    static private final SubLList $list_alt23 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CLASS"), list(makeSymbol("GET-SEQUENCE-CLASS"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-INSTANCE"), list(makeSymbol("NEW-OBJECT-INSTANCE"), makeSymbol("TEMPLATE-CLASS"))), list(makeSymbol("TEMPLATE-SUBLIST"), list(makeSymbol("NTHCDR"), makeSymbol("START-INDEX"), list(makeSymbol("GET-INTERNAL-STORAGE"), makeSymbol("SELF"))))), list(makeSymbol("PIF"), makeSymbol("END-INDEX"), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-NEW-STORAGE"), NIL), list(makeSymbol("TEMPLATE-POINTER"), makeSymbol("TEMPLATE-SUBLIST"))), list(makeSymbol("CDOTIMES"), list(makeSymbol("I"), list(makeSymbol("-"), makeSymbol("END-INDEX"), makeSymbol("START-INDEX"))), list(makeSymbol("CPUSH"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-POINTER")), makeSymbol("TEMPLATE-NEW-STORAGE")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-POINTER"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-POINTER")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-INSTANCE"), list(QUOTE, makeSymbol("SET-INTERNAL-STORAGE")), list(makeSymbol("NREVERSE"), makeSymbol("TEMPLATE-NEW-STORAGE")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-INSTANCE"), list(QUOTE, makeSymbol("SET-INTERNAL-STORAGE")), list(makeSymbol("COPY-LIST"), makeSymbol("TEMPLATE-SUBLIST")))), list(RET, makeSymbol("TEMPLATE-INSTANCE"))));

    public static final SubLObject basic_variable_length_sequence_get_nth_method_alt(SubLObject self, SubLObject n, SubLObject out_of_range_value) {
        if (out_of_range_value == UNPROVIDED) {
            out_of_range_value = NIL;
        }
        if (n.numL(ZERO_INTEGER) || n.numG(com.cyc.cycjava.cycl.subloop_sequences.basic_variable_length_sequence_get_largest_index_method(self))) {
            return out_of_range_value;
        }
        return aref(com.cyc.cycjava.cycl.subloop_sequences.basic_variable_length_sequence_get_internal_storage_method(self), n);
    }

    public static SubLObject basic_variable_length_sequence_get_nth_method(final SubLObject self, final SubLObject n, SubLObject out_of_range_value) {
        if (out_of_range_value == UNPROVIDED) {
            out_of_range_value = NIL;
        }
        if (n.numL(ZERO_INTEGER) || n.numG(basic_variable_length_sequence_get_largest_index_method(self))) {
            return out_of_range_value;
        }
        return aref(basic_variable_length_sequence_get_internal_storage_method(self), n);
    }

    static private final SubLList $list_alt25 = list(makeSymbol("NEW-ELEMENT"));

    static private final SubLList $list_alt26 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-INTERNAL-STORAGE"), list(makeSymbol("GET-INTERNAL-STORAGE"), makeSymbol("SELF")))), list(makeSymbol("PIF"), list(makeSymbol("NULL"), makeSymbol("TEMPLATE-INTERNAL-STORAGE")), list(makeSymbol("PROGN"), list(makeSymbol("SET-INTERNAL-STORAGE"), makeSymbol("SELF"), list(makeSymbol("LIST"), makeSymbol("NEW-ELEMENT"))), list(RET, makeSymbol("NEW-ELEMENT"))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LAST-CONS"), list(makeSymbol("LAST"), makeSymbol("TEMPLATE-INTERNAL-STORAGE")))), list(makeSymbol("RPLACD"), makeSymbol("TEMPLATE-LAST-CONS"), list(makeSymbol("LIST"), makeSymbol("NEW-ELEMENT"))), list(RET, makeSymbol("NEW-ELEMENT"))))));

    public static final SubLObject basic_variable_length_sequence_get_length_method_alt(SubLObject self) {
        return add(com.cyc.cycjava.cycl.subloop_sequences.basic_variable_length_sequence_get_largest_index_method(self), ONE_INTEGER);
    }

    public static SubLObject basic_variable_length_sequence_get_length_method(final SubLObject self) {
        return add(basic_variable_length_sequence_get_largest_index_method(self), ONE_INTEGER);
    }

    public static final SubLObject basic_variable_length_sequence_clear_method_alt(SubLObject self) {
        {
            SubLObject template_storage = com.cyc.cycjava.cycl.subloop_sequences.basic_variable_length_sequence_get_internal_storage_method(self);
            SubLObject template_size = com.cyc.cycjava.cycl.subloop_sequences.basic_variable_length_sequence_get_storage_size_method(self);
            SubLObject template_default_value = com.cyc.cycjava.cycl.subloop_sequences.basic_variable_length_sequence_get_default_value_method(self);
            SubLObject template_index = NIL;
            for (template_index = ZERO_INTEGER; template_index.numL(template_size); template_index = add(template_index, ONE_INTEGER)) {
                set_aref(template_storage, template_index, template_default_value);
            }
            com.cyc.cycjava.cycl.subloop_sequences.basic_variable_length_sequence_set_largest_index_method(self, MINUS_ONE_INTEGER);
            return template_default_value;
        }
    }

    public static SubLObject basic_variable_length_sequence_clear_method(final SubLObject self) {
        final SubLObject template_storage = basic_variable_length_sequence_get_internal_storage_method(self);
        final SubLObject template_size = basic_variable_length_sequence_get_storage_size_method(self);
        final SubLObject template_default_value = basic_variable_length_sequence_get_default_value_method(self);
        SubLObject template_index;
        for (template_index = NIL, template_index = ZERO_INTEGER; template_index.numL(template_size); template_index = add(template_index, ONE_INTEGER)) {
            set_aref(template_storage, template_index, template_default_value);
        }
        basic_variable_length_sequence_set_largest_index_method(self, MINUS_ONE_INTEGER);
        return template_default_value;
    }

    static private final SubLList $list_alt28 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-INTERNAL-STORAGE"), list(makeSymbol("GET-INTERNAL-STORAGE"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-INTERNAL-STORAGE"), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-ENUMERATOR"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("BASIC-SEQUENCE-ENUMERATOR"))))), list(makeSymbol("BASIC-SEQUENCE-ENUMERATOR-SET-SHARED-STORAGE-METHOD"), makeSymbol("TEMPLATE-ENUMERATOR"), makeSymbol("TEMPLATE-INTERNAL-STORAGE")), list(RET, makeSymbol("TEMPLATE-ENUMERATOR"))))), list(RET, NIL));

    public static final SubLObject subloop_reserved_initialize_basic_variable_length_sequence_class_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_basic_variable_length_sequence_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_basic_variable_length_sequence_instance_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_VARIABLE_LENGTH_SEQUENCE, INTERNAL_STORAGE, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_VARIABLE_LENGTH_SEQUENCE, STORAGE_SIZE, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_VARIABLE_LENGTH_SEQUENCE, LARGEST_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_VARIABLE_LENGTH_SEQUENCE, DEFAULT_VALUE, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_VARIABLE_LENGTH_SEQUENCE, GROWTH_FACTOR, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_VARIABLE_LENGTH_SEQUENCE, SEQUENCE_CLASS, NIL);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_basic_variable_length_sequence_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_VARIABLE_LENGTH_SEQUENCE, INTERNAL_STORAGE, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_VARIABLE_LENGTH_SEQUENCE, STORAGE_SIZE, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_VARIABLE_LENGTH_SEQUENCE, LARGEST_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_VARIABLE_LENGTH_SEQUENCE, DEFAULT_VALUE, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_VARIABLE_LENGTH_SEQUENCE, GROWTH_FACTOR, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_VARIABLE_LENGTH_SEQUENCE, SEQUENCE_CLASS, NIL);
        return NIL;
    }

    static private final SubLList $list_alt30 = list(makeSymbol("OLD-ENUMERATOR"));

    static private final SubLList $list_alt31 = list(list(makeSymbol("MUST"), list(makeSymbol("BASIC-SEQUENCE-ENUMERATOR-P"), makeSymbol("OLD-ENUMERATOR")), makeString("(DEALLOCATE-ENUMERATOR ~S): ~S is not an instance of BASIC-SEQUENCE-ENUMERATOR."), makeSymbol("SELF"), makeSymbol("OLD-ENUMERATOR")), list(makeSymbol("BASIC-SEQUENCE-ENUMERATOR-SET-SHARED-STORAGE-METHOD"), makeSymbol("OLD-ENUMERATOR"), NIL), list(RET, NIL));

    static private final SubLList $list_alt34 = list(makeSymbol("ENUMERATOR-TEMPLATE"));

    static private final SubLList $list_alt35 = list(new SubLObject[]{ list(makeSymbol("SHARED-STORAGE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("LENGTH"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CURRENT-INDEX"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SHARED-STORAGE"), list(makeSymbol("NEW-SHARED-STORAGE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EMPTY-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FIRST-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LAST-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CURRENT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FIRST"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LAST"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NEXT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PREVIOUS"), NIL, makeKeyword("PUBLIC")) });

    public static final SubLObject basic_variable_length_sequence_p_alt(SubLObject basic_variable_length_sequence) {
        return classes.subloop_instanceof_class(basic_variable_length_sequence, BASIC_VARIABLE_LENGTH_SEQUENCE);
    }

    public static SubLObject basic_variable_length_sequence_p(final SubLObject basic_variable_length_sequence) {
        return classes.subloop_instanceof_class(basic_variable_length_sequence, BASIC_VARIABLE_LENGTH_SEQUENCE);
    }

    public static final SubLObject basic_variable_length_sequence_initialize_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_basic_variable_length_sequence_method = NIL;
            SubLObject sequence_class = com.cyc.cycjava.cycl.subloop_sequences.get_basic_variable_length_sequence_sequence_class(self);
            SubLObject growth_factor = com.cyc.cycjava.cycl.subloop_sequences.get_basic_variable_length_sequence_growth_factor(self);
            SubLObject default_value = com.cyc.cycjava.cycl.subloop_sequences.get_basic_variable_length_sequence_default_value(self);
            SubLObject largest_index = com.cyc.cycjava.cycl.subloop_sequences.get_basic_variable_length_sequence_largest_index(self);
            SubLObject storage_size = com.cyc.cycjava.cycl.subloop_sequences.get_basic_variable_length_sequence_storage_size(self);
            SubLObject internal_storage = com.cyc.cycjava.cycl.subloop_sequences.get_basic_variable_length_sequence_internal_storage(self);
            try {
                try {
                    object.object_initialize_method(self);
                    internal_storage = make_vector(TEN_INTEGER, NIL);
                    storage_size = TEN_INTEGER;
                    largest_index = MINUS_ONE_INTEGER;
                    default_value = NIL;
                    growth_factor = TWO_INTEGER;
                    sequence_class = BASIC_VARIABLE_LENGTH_SEQUENCE;
                    sublisp_throw($sym235$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_sequences.set_basic_variable_length_sequence_sequence_class(self, sequence_class);
                            com.cyc.cycjava.cycl.subloop_sequences.set_basic_variable_length_sequence_growth_factor(self, growth_factor);
                            com.cyc.cycjava.cycl.subloop_sequences.set_basic_variable_length_sequence_default_value(self, default_value);
                            com.cyc.cycjava.cycl.subloop_sequences.set_basic_variable_length_sequence_largest_index(self, largest_index);
                            com.cyc.cycjava.cycl.subloop_sequences.set_basic_variable_length_sequence_storage_size(self, storage_size);
                            com.cyc.cycjava.cycl.subloop_sequences.set_basic_variable_length_sequence_internal_storage(self, internal_storage);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_basic_variable_length_sequence_method = Errors.handleThrowable(ccatch_env_var, $sym235$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
            }
            return catch_var_for_basic_variable_length_sequence_method;
        }
    }

    public static SubLObject basic_variable_length_sequence_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_variable_length_sequence_method = NIL;
        SubLObject sequence_class = get_basic_variable_length_sequence_sequence_class(self);
        SubLObject growth_factor = get_basic_variable_length_sequence_growth_factor(self);
        SubLObject default_value = get_basic_variable_length_sequence_default_value(self);
        SubLObject largest_index = get_basic_variable_length_sequence_largest_index(self);
        SubLObject storage_size = get_basic_variable_length_sequence_storage_size(self);
        SubLObject internal_storage = get_basic_variable_length_sequence_internal_storage(self);
        try {
            thread.throwStack.push($sym235$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
            try {
                object.object_initialize_method(self);
                internal_storage = make_vector(TEN_INTEGER, NIL);
                storage_size = TEN_INTEGER;
                largest_index = MINUS_ONE_INTEGER;
                default_value = NIL;
                growth_factor = TWO_INTEGER;
                sequence_class = BASIC_VARIABLE_LENGTH_SEQUENCE;
                sublisp_throw($sym235$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_variable_length_sequence_sequence_class(self, sequence_class);
                    set_basic_variable_length_sequence_growth_factor(self, growth_factor);
                    set_basic_variable_length_sequence_default_value(self, default_value);
                    set_basic_variable_length_sequence_largest_index(self, largest_index);
                    set_basic_variable_length_sequence_storage_size(self, storage_size);
                    set_basic_variable_length_sequence_internal_storage(self, internal_storage);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_variable_length_sequence_method = Errors.handleThrowable(ccatch_env_var, $sym235$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_variable_length_sequence_method;
    }

    static private final SubLList $list_alt45 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt46 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("SHARED-STORAGE"), NIL), list(makeSymbol("CSETQ"), makeSymbol("LENGTH"), MINUS_ONE_INTEGER), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-INDEX"), ZERO_INTEGER), list(RET, NIL));

    static private final SubLList $list_alt50 = list(makeSymbol("NEW-SHARED-STORAGE"));

    static private final SubLList $list_alt51 = list(list(makeSymbol("MUST"), list(makeSymbol("LISTP"), makeSymbol("NEW-SHARED-STORAGE")), makeString("(SET-SHARED-STORAGE ~S): ~S is not a list."), makeSymbol("SELF"), makeSymbol("NEW-SHARED-STORAGE")), list(makeSymbol("CSETQ"), makeSymbol("SHARED-STORAGE"), makeSymbol("NEW-SHARED-STORAGE")), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-INDEX"), ZERO_INTEGER), list(makeSymbol("CSETQ"), makeSymbol("LENGTH"), list(makeSymbol("LENGTH"), makeSymbol("SHARED-STORAGE"))), list(RET, makeSymbol("NEW-SHARED-STORAGE")));

    public static final SubLObject basic_variable_length_sequence_print_method_alt(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject catch_var_for_basic_variable_length_sequence_method = NIL;
            SubLObject largest_index = com.cyc.cycjava.cycl.subloop_sequences.get_basic_variable_length_sequence_largest_index(self);
            SubLObject internal_storage = com.cyc.cycjava.cycl.subloop_sequences.get_basic_variable_length_sequence_internal_storage(self);
            try {
                try {
                    if (NIL == largest_index) {
                        format(stream, $str_alt239$__BASIC_VARIABLE_LENGTH_SEQUENCE_);
                        sublisp_throw($sym238$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, self);
                    }
                    if (largest_index.numE(MINUS_ONE_INTEGER)) {
                        format(stream, $str_alt111$__);
                        sublisp_throw($sym238$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, self);
                    }
                    {
                        SubLObject length = add(largest_index, ONE_INTEGER);
                        if (length.numE(ZERO_INTEGER)) {
                            format(stream, $str_alt111$__);
                            sublisp_throw($sym238$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, self);
                        }
                        if (length.numE(ONE_INTEGER)) {
                            format(stream, $str_alt112$__S_, aref(internal_storage, ZERO_INTEGER));
                            sublisp_throw($sym238$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, self);
                        }
                        format(stream, $str_alt113$__S, aref(internal_storage, ZERO_INTEGER));
                        {
                            SubLObject i = NIL;
                            for (i = ZERO_INTEGER; i.numL(largest_index); i = add(i, ONE_INTEGER)) {
                                format(stream, $str_alt114$___S, aref(internal_storage, add(i, ONE_INTEGER)));
                            }
                        }
                        format(stream, $str_alt115$_);
                    }
                    sublisp_throw($sym238$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_sequences.set_basic_variable_length_sequence_largest_index(self, largest_index);
                            com.cyc.cycjava.cycl.subloop_sequences.set_basic_variable_length_sequence_internal_storage(self, internal_storage);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_basic_variable_length_sequence_method = Errors.handleThrowable(ccatch_env_var, $sym238$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
            }
            return catch_var_for_basic_variable_length_sequence_method;
        }
    }

    public static SubLObject basic_variable_length_sequence_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_variable_length_sequence_method = NIL;
        final SubLObject largest_index = get_basic_variable_length_sequence_largest_index(self);
        final SubLObject internal_storage = get_basic_variable_length_sequence_internal_storage(self);
        try {
            thread.throwStack.push($sym238$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
            try {
                if (NIL == largest_index) {
                    format(stream, $str239$__BASIC_VARIABLE_LENGTH_SEQUENCE_);
                    sublisp_throw($sym238$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, self);
                }
                if (largest_index.numE(MINUS_ONE_INTEGER)) {
                    format(stream, $str111$__);
                    sublisp_throw($sym238$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, self);
                }
                final SubLObject length = add(largest_index, ONE_INTEGER);
                if (length.numE(ZERO_INTEGER)) {
                    format(stream, $str111$__);
                    sublisp_throw($sym238$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, self);
                }
                if (length.numE(ONE_INTEGER)) {
                    format(stream, $str112$__S_, aref(internal_storage, ZERO_INTEGER));
                    sublisp_throw($sym238$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, self);
                }
                format(stream, $str113$__S, aref(internal_storage, ZERO_INTEGER));
                SubLObject i;
                for (i = NIL, i = ZERO_INTEGER; i.numL(largest_index); i = add(i, ONE_INTEGER)) {
                    format(stream, $str114$___S, aref(internal_storage, add(i, ONE_INTEGER)));
                }
                format(stream, $str115$_);
                sublisp_throw($sym238$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_variable_length_sequence_largest_index(self, largest_index);
                    set_basic_variable_length_sequence_internal_storage(self, internal_storage);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_variable_length_sequence_method = Errors.handleThrowable(ccatch_env_var, $sym238$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_variable_length_sequence_method;
    }

    static private final SubLString $str_alt53$_SET_SHARED_STORAGE__S____S_is_no = makeString("(SET-SHARED-STORAGE ~S): ~S is not a list.");

    static private final SubLList $list_alt56 = list(list(RET, list(makeSymbol("<="), makeSymbol("LENGTH"), ZERO_INTEGER)));

    static private final SubLList $list_alt60 = list(list(RET, list(makeSymbol("="), makeSymbol("CURRENT-INDEX"), ZERO_INTEGER)));

    static private final SubLList $list_alt64 = list(list(RET, list(makeSymbol("="), makeSymbol("CURRENT-INDEX"), list(makeSymbol("-"), makeSymbol("LENGTH"), ONE_INTEGER))));

    static private final SubLList $list_alt68 = list(list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol(">="), makeSymbol("CURRENT-INDEX"), ZERO_INTEGER), list(makeSymbol("<"), makeSymbol("CURRENT-INDEX"), makeSymbol("LENGTH"))), list(RET, list(makeSymbol("NTH"), makeSymbol("CURRENT-INDEX"), makeSymbol("SHARED-STORAGE")))), list(RET, NIL));

    static private final SubLList $list_alt72 = list(list(makeSymbol("PWHEN"), list(makeSymbol(">="), makeSymbol("LENGTH"), ZERO_INTEGER), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-INDEX"), ZERO_INTEGER), list(RET, list(makeSymbol("NTH"), ZERO_INTEGER, makeSymbol("SHARED-STORAGE")))), list(RET, NIL));

    public static final SubLObject basic_variable_length_sequence_get_internal_storage_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_basic_variable_length_sequence_method = NIL;
            SubLObject internal_storage = com.cyc.cycjava.cycl.subloop_sequences.get_basic_variable_length_sequence_internal_storage(self);
            try {
                try {
                    sublisp_throw($sym241$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, internal_storage);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_sequences.set_basic_variable_length_sequence_internal_storage(self, internal_storage);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_basic_variable_length_sequence_method = Errors.handleThrowable(ccatch_env_var, $sym241$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
            }
            return catch_var_for_basic_variable_length_sequence_method;
        }
    }

    public static SubLObject basic_variable_length_sequence_get_internal_storage_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_variable_length_sequence_method = NIL;
        final SubLObject internal_storage = get_basic_variable_length_sequence_internal_storage(self);
        try {
            thread.throwStack.push($sym241$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
            try {
                sublisp_throw($sym241$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, internal_storage);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_variable_length_sequence_internal_storage(self, internal_storage);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_variable_length_sequence_method = Errors.handleThrowable(ccatch_env_var, $sym241$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_variable_length_sequence_method;
    }

    static private final SubLList $list_alt76 = list(list(makeSymbol("PWHEN"), list(makeSymbol(">="), makeSymbol("LENGTH"), ZERO_INTEGER), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-INDEX"), list(makeSymbol("-"), makeSymbol("LENGTH"), ONE_INTEGER)), list(RET, list(makeSymbol("NTH"), makeSymbol("CURRENT-INDEX"), makeSymbol("SHARED-STORAGE")))), list(RET, NIL));

    static private final SubLList $list_alt80 = list(makeKeyword("AUTO-UPDATE"), makeKeyword("PUBLIC"));

    static private final SubLList $list_alt81 = list(list(makeSymbol("PWHEN"), list(makeSymbol(">="), makeSymbol("CURRENT-INDEX"), makeSymbol("LENGTH")), list(RET, NIL)), list(makeSymbol("CINC"), makeSymbol("CURRENT-INDEX")), list(RET, list(makeSymbol("CURRENT"), makeSymbol("SELF"))));

    static private final SubLList $list_alt84 = list(list(makeSymbol("PWHEN"), list(makeSymbol("<="), makeSymbol("CURRENT-INDEX"), ZERO_INTEGER), list(RET, NIL)), list(makeSymbol("CDEC"), makeSymbol("CURRENT-INDEX")), list(RET, list(makeSymbol("CURRENT"), makeSymbol("SELF"))));

    public static final SubLObject basic_variable_length_sequence_get_contents_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_basic_variable_length_sequence_method = NIL;
            SubLObject internal_storage = com.cyc.cycjava.cycl.subloop_sequences.get_basic_variable_length_sequence_internal_storage(self);
            try {
                try {
                    if (NIL == internal_storage) {
                        sublisp_throw($sym244$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, NIL);
                    }
                    {
                        SubLObject length = com.cyc.cycjava.cycl.subloop_sequences.basic_variable_length_sequence_get_length_method(self);
                        SubLObject element = NIL;
                        SubLObject contents = NIL;
                        SubLObject i = NIL;
                        for (i = ZERO_INTEGER; i.numL(length); i = add(i, ONE_INTEGER)) {
                            element = aref(internal_storage, i);
                            if (NIL != element) {
                                contents = cons(element, contents);
                            }
                        }
                        sublisp_throw($sym244$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, nreverse(contents));
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_sequences.set_basic_variable_length_sequence_internal_storage(self, internal_storage);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_basic_variable_length_sequence_method = Errors.handleThrowable(ccatch_env_var, $sym244$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
            }
            return catch_var_for_basic_variable_length_sequence_method;
        }
    }

    public static SubLObject basic_variable_length_sequence_get_contents_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_variable_length_sequence_method = NIL;
        final SubLObject internal_storage = get_basic_variable_length_sequence_internal_storage(self);
        try {
            thread.throwStack.push($sym244$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
            try {
                if (NIL == internal_storage) {
                    sublisp_throw($sym244$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, NIL);
                }
                final SubLObject length = basic_variable_length_sequence_get_length_method(self);
                SubLObject element = NIL;
                SubLObject contents = NIL;
                SubLObject i;
                for (i = NIL, i = ZERO_INTEGER; i.numL(length); i = add(i, ONE_INTEGER)) {
                    element = aref(internal_storage, i);
                    if (NIL != element) {
                        contents = cons(element, contents);
                    }
                }
                sublisp_throw($sym244$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, nreverse(contents));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_variable_length_sequence_internal_storage(self, internal_storage);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_variable_length_sequence_method = Errors.handleThrowable(ccatch_env_var, $sym244$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_variable_length_sequence_method;
    }

    static private final SubLList $list_alt87 = list(makeSymbol("SEQUENCE-TEMPLATE"));

    static private final SubLList $list_alt88 = list(new SubLObject[]{ list(makeSymbol("INTERNAL-STORAGE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("SEQUENCE-CLASS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-INTERNAL-STORAGE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-INTERNAL-STORAGE"), list(makeSymbol("NEW-INTERNAL-STORAGE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEAR"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-LENGTH"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-NTH"), list(makeSymbol("N"), makeSymbol("&OPTIONAL"), list(makeSymbol("OUT-OF-RANGE-VALUE"))), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-NTH"), list(makeSymbol("N"), makeSymbol("NEW-VALUE")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SUBSEQUENCE"), list(makeSymbol("START-INDEX"), makeSymbol("&OPTIONAL"), list(makeSymbol("END-INDEX"), NIL)), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONTENTS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SEQUENCE-CLASS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SEQUENCE-CLASS"), list(makeSymbol("NEW-CLASS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ALLOCATE-ENUMERATOR"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEALLOCATE-ENUMERATOR"), list(makeSymbol("OLD-ENUMERATOR")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")) });

    public static final SubLObject basic_variable_length_sequence_set_internal_storage_method_alt(SubLObject self, SubLObject new_internal_storage) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_basic_variable_length_sequence_method = NIL;
                SubLObject internal_storage = com.cyc.cycjava.cycl.subloop_sequences.get_basic_variable_length_sequence_internal_storage(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!new_internal_storage.isVector()) {
                                Errors.error($str_alt248$_SET_INTERNAL_STORAGE__S____S_is_, self, new_internal_storage);
                            }
                        }
                        internal_storage = new_internal_storage;
                        sublisp_throw($sym247$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, new_internal_storage);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                com.cyc.cycjava.cycl.subloop_sequences.set_basic_variable_length_sequence_internal_storage(self, internal_storage);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_basic_variable_length_sequence_method = Errors.handleThrowable(ccatch_env_var, $sym247$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
                }
                return catch_var_for_basic_variable_length_sequence_method;
            }
        }
    }

    public static SubLObject basic_variable_length_sequence_set_internal_storage_method(final SubLObject self, final SubLObject new_internal_storage) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_variable_length_sequence_method = NIL;
        SubLObject internal_storage = get_basic_variable_length_sequence_internal_storage(self);
        try {
            thread.throwStack.push($sym247$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
            try {
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!new_internal_storage.isVector())) {
                    Errors.error($str248$_SET_INTERNAL_STORAGE__S____S_is_, self, new_internal_storage);
                }
                internal_storage = new_internal_storage;
                sublisp_throw($sym247$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, new_internal_storage);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_variable_length_sequence_internal_storage(self, internal_storage);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_variable_length_sequence_method = Errors.handleThrowable(ccatch_env_var, $sym247$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_variable_length_sequence_method;
    }

    static private final SubLString $str_alt91$_DEALLOCATE_ENUMERATOR__S____S_is = makeString("(DEALLOCATE-ENUMERATOR ~S): ~S is not an instance of BASIC-SEQUENCE-ENUMERATOR.");

    public static final SubLObject basic_variable_length_sequence_get_storage_size_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_basic_variable_length_sequence_method = NIL;
            SubLObject storage_size = com.cyc.cycjava.cycl.subloop_sequences.get_basic_variable_length_sequence_storage_size(self);
            try {
                try {
                    sublisp_throw($sym252$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, storage_size);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_sequences.set_basic_variable_length_sequence_storage_size(self, storage_size);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_basic_variable_length_sequence_method = Errors.handleThrowable(ccatch_env_var, $sym252$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
            }
            return catch_var_for_basic_variable_length_sequence_method;
        }
    }

    public static SubLObject basic_variable_length_sequence_get_storage_size_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_variable_length_sequence_method = NIL;
        final SubLObject storage_size = get_basic_variable_length_sequence_storage_size(self);
        try {
            thread.throwStack.push($sym252$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
            try {
                sublisp_throw($sym252$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, storage_size);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_variable_length_sequence_storage_size(self, storage_size);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_variable_length_sequence_method = Errors.handleThrowable(ccatch_env_var, $sym252$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_variable_length_sequence_method;
    }

    static private final SubLList $list_alt104 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("INTERNAL-STORAGE"), NIL), list(makeSymbol("CSETQ"), makeSymbol("SEQUENCE-CLASS"), list(QUOTE, makeSymbol("BASIC-SEQUENCE"))), list(RET, makeSymbol("SELF")));

    static private final SubLList $list_alt108 = list(makeSymbol("STREAM"), makeSymbol("DEPTH"));

    static private final SubLList $list_alt109 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("PWHEN"), list(makeSymbol("NULL"), makeSymbol("INTERNAL-STORAGE")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("[]")), list(RET, makeSymbol("SELF"))), list(makeSymbol("PWHEN"), list(makeSymbol("NULL"), list(makeSymbol("CDR"), makeSymbol("INTERNAL-STORAGE"))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("[~S]"), list(makeSymbol("CAR"), makeSymbol("INTERNAL-STORAGE"))), list(RET, makeSymbol("SELF"))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("[~S"), list(makeSymbol("CAR"), makeSymbol("INTERNAL-STORAGE"))), list(makeSymbol("CDOLIST"), list(makeSymbol("ELEMENT"), list(makeSymbol("CDR"), makeSymbol("INTERNAL-STORAGE"))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(", ~S"), makeSymbol("ELEMENT"))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("]")), list(RET, makeSymbol("SELF")));

    public static final SubLObject basic_variable_length_sequence_set_storage_size_method_alt(SubLObject self, SubLObject new_storage_size) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_basic_variable_length_sequence_method = NIL;
                SubLObject storage_size = com.cyc.cycjava.cycl.subloop_sequences.get_basic_variable_length_sequence_storage_size(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!(new_storage_size.isInteger() && new_storage_size.numGE(ZERO_INTEGER))) {
                                Errors.error($str_alt258$_SET_STORAGE_SIZE__S____S_is_not_, self, new_storage_size);
                            }
                        }
                        storage_size = new_storage_size;
                        sublisp_throw($sym257$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, new_storage_size);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                com.cyc.cycjava.cycl.subloop_sequences.set_basic_variable_length_sequence_storage_size(self, storage_size);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_basic_variable_length_sequence_method = Errors.handleThrowable(ccatch_env_var, $sym257$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
                }
                return catch_var_for_basic_variable_length_sequence_method;
            }
        }
    }

    public static SubLObject basic_variable_length_sequence_set_storage_size_method(final SubLObject self, final SubLObject new_storage_size) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_variable_length_sequence_method = NIL;
        SubLObject storage_size = get_basic_variable_length_sequence_storage_size(self);
        try {
            thread.throwStack.push($sym257$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
            try {
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((!new_storage_size.isInteger()) || (!new_storage_size.numGE(ZERO_INTEGER)))) {
                    Errors.error($str258$_SET_STORAGE_SIZE__S____S_is_not_, self, new_storage_size);
                }
                storage_size = new_storage_size;
                sublisp_throw($sym257$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, new_storage_size);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_variable_length_sequence_storage_size(self, storage_size);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_variable_length_sequence_method = Errors.handleThrowable(ccatch_env_var, $sym257$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_variable_length_sequence_method;
    }

    static private final SubLString $str_alt111$__ = makeString("[]");

    static private final SubLString $str_alt112$__S_ = makeString("[~S]");

    static private final SubLString $str_alt113$__S = makeString("[~S");

    static private final SubLString $str_alt114$___S = makeString(", ~S");

    static private final SubLString $str_alt115$_ = makeString("]");

    static private final SubLList $list_alt118 = list(list(RET, makeSymbol("INTERNAL-STORAGE")));

    static private final SubLList $list_alt121 = list(makeSymbol("NEW-INTERNAL-STORAGE"));

    static private final SubLList $list_alt122 = list(list(makeSymbol("MUST"), list(makeSymbol("LISTP"), makeSymbol("NEW-INTERNAL-STORAGE")), makeString("(SET-INTERNAL-STORAGE ~S): ~S is not a LIST."), makeSymbol("SELF"), makeSymbol("NEW-INTERNAL-STORAGE")), list(makeSymbol("CSETQ"), makeSymbol("INTERNAL-STORAGE"), makeSymbol("NEW-INTERNAL-STORAGE")), list(RET, makeSymbol("NEW-INTERNAL-STORAGE")));

    public static final SubLObject basic_variable_length_sequence_get_largest_index_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_basic_variable_length_sequence_method = NIL;
            SubLObject largest_index = com.cyc.cycjava.cycl.subloop_sequences.get_basic_variable_length_sequence_largest_index(self);
            try {
                try {
                    sublisp_throw($sym262$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, largest_index);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_sequences.set_basic_variable_length_sequence_largest_index(self, largest_index);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_basic_variable_length_sequence_method = Errors.handleThrowable(ccatch_env_var, $sym262$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
            }
            return catch_var_for_basic_variable_length_sequence_method;
        }
    }

    public static SubLObject basic_variable_length_sequence_get_largest_index_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_variable_length_sequence_method = NIL;
        final SubLObject largest_index = get_basic_variable_length_sequence_largest_index(self);
        try {
            thread.throwStack.push($sym262$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
            try {
                sublisp_throw($sym262$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, largest_index);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_variable_length_sequence_largest_index(self, largest_index);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_variable_length_sequence_method = Errors.handleThrowable(ccatch_env_var, $sym262$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_variable_length_sequence_method;
    }

    static private final SubLString $str_alt124$_SET_INTERNAL_STORAGE__S____S_is_ = makeString("(SET-INTERNAL-STORAGE ~S): ~S is not a LIST.");

    static private final SubLList $list_alt127 = list(list(RET, makeSymbol("SEQUENCE-CLASS")));

    static private final SubLList $list_alt131 = list(makeSymbol("NEW-CLASS"));

    static private final SubLList $list_alt132 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-CLASS")), list(makeSymbol("CAND"), list(makeSymbol("SYMBOLP"), makeSymbol("NEW-CLASS")), list(makeSymbol("SUBCLASSP"), makeSymbol("NEW-CLASS"), list(QUOTE, makeSymbol("BASIC-SEQUENCE"))))), makeString("(SET-SEQUENCE-CLASS ~S): ~S is not a subclass of BASIC-SEQUENCE."), makeSymbol("SELF"), makeSymbol("NEW-CLASS")), list(makeSymbol("CSETQ"), makeSymbol("SEQUENCE-CLASS"), makeSymbol("NEW-CLASS")), list(RET, makeSymbol("NEW-CLASS")));

    public static final SubLObject basic_variable_length_sequence_set_largest_index_method_alt(SubLObject self, SubLObject new_largest_index) {
        {
            SubLObject catch_var_for_basic_variable_length_sequence_method = NIL;
            SubLObject largest_index = com.cyc.cycjava.cycl.subloop_sequences.get_basic_variable_length_sequence_largest_index(self);
            try {
                try {
                    largest_index = new_largest_index;
                    sublisp_throw($sym267$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, new_largest_index);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_sequences.set_basic_variable_length_sequence_largest_index(self, largest_index);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_basic_variable_length_sequence_method = Errors.handleThrowable(ccatch_env_var, $sym267$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
            }
            return catch_var_for_basic_variable_length_sequence_method;
        }
    }

    public static SubLObject basic_variable_length_sequence_set_largest_index_method(final SubLObject self, final SubLObject new_largest_index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_variable_length_sequence_method = NIL;
        SubLObject largest_index = get_basic_variable_length_sequence_largest_index(self);
        try {
            thread.throwStack.push($sym267$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
            try {
                largest_index = new_largest_index;
                sublisp_throw($sym267$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, new_largest_index);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_variable_length_sequence_largest_index(self, largest_index);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_variable_length_sequence_method = Errors.handleThrowable(ccatch_env_var, $sym267$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_variable_length_sequence_method;
    }

    static private final SubLString $str_alt134$_SET_SEQUENCE_CLASS__S____S_is_no = makeString("(SET-SEQUENCE-CLASS ~S): ~S is not a subclass of BASIC-SEQUENCE.");

    static private final SubLList $list_alt137 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DEFAULT-VALUE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-DEFAULT-VALUE"), list(makeSymbol("NEW-DEFAULT-VALUE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-GROWTH-FACTOR"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-GROWTH-FACTOR"), list(makeSymbol("NEW-GROWTH-FACTOR")), makeKeyword("PUBLIC")));

    static private final SubLList $list_alt139 = list(makeSymbol("VARIABLE-LENGTH-SEQUENCE"));

    static private final SubLList $list_alt140 = list(makeKeyword("EXTENDS"), list(makeSymbol("VARIABLE-LENGTH-SEQUENCE")));

    static private final SubLList $list_alt141 = list(new SubLObject[]{ list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEAR"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-LENGTH"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-NTH"), list(makeSymbol("N"), makeSymbol("&OPTIONAL"), list(makeSymbol("OUT-OF-RANGE-VALUE"), NIL)), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-NTH"), list(makeSymbol("N"), makeSymbol("NEW-VALUE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SUBSEQUENCE"), list(makeSymbol("START-INDEX"), makeSymbol("&OPTIONAL"), list(makeSymbol("END-INDEX"), NIL)), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-INTERNAL-STORAGE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-INTERNAL-STORAGE"), list(makeSymbol("NEW-INTERNAL-STORAGE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-STORAGE-SIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-STORAGE-SIZE"), list(makeSymbol("NEW-STORAGE-SIZE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-LARGEST-INDEX"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-LARGEST-INDEX"), list(makeSymbol("NEW-LARGEST-INDEX")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RECORD-INDEX"), list(makeSymbol("CURRENT-INDEX")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DEFAULT-VALUE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-DEFAULT-VALUE"), list(makeSymbol("NEW-DEFAULT-VALUE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-GROWTH-FACTOR"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-GROWTH-FACTOR"), list(makeSymbol("NEW-GROWTH-FACTOR")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ALLOCATE-ENUMERATOR"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEALLOCATE-ENUMERATOR"), list(makeSymbol("OLD-ENUMERATOR")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ALL-NULL-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INDEX-OF-NEXT-NON-NIL-ELEMENT"), list(makeSymbol("START-INDEX")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INDEX-OF-PREVIOUS-NON-NIL-ELEMENT"), list(makeSymbol("START-INDEX")), makeKeyword("PUBLIC")) });

    public static final SubLObject basic_variable_length_sequence_record_index_method_alt(SubLObject self, SubLObject current_index) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_basic_variable_length_sequence_method = NIL;
                SubLObject largest_index = com.cyc.cycjava.cycl.subloop_sequences.get_basic_variable_length_sequence_largest_index(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!(current_index.isInteger() && current_index.numGE(ZERO_INTEGER))) {
                                Errors.error($str_alt273$_RECORD_INDEX__S____S_is_not_a_va, self, current_index);
                            }
                        }
                        largest_index = max(largest_index, current_index);
                        sublisp_throw($sym272$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, largest_index);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                com.cyc.cycjava.cycl.subloop_sequences.set_basic_variable_length_sequence_largest_index(self, largest_index);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_basic_variable_length_sequence_method = Errors.handleThrowable(ccatch_env_var, $sym272$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
                }
                return catch_var_for_basic_variable_length_sequence_method;
            }
        }
    }

    public static SubLObject basic_variable_length_sequence_record_index_method(final SubLObject self, final SubLObject current_index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_variable_length_sequence_method = NIL;
        SubLObject largest_index = get_basic_variable_length_sequence_largest_index(self);
        try {
            thread.throwStack.push($sym272$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
            try {
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((!current_index.isInteger()) || (!current_index.numGE(ZERO_INTEGER)))) {
                    Errors.error($str273$_RECORD_INDEX__S____S_is_not_a_va, self, current_index);
                }
                largest_index = max(largest_index, current_index);
                sublisp_throw($sym272$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, largest_index);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_variable_length_sequence_largest_index(self, largest_index);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_variable_length_sequence_method = Errors.handleThrowable(ccatch_env_var, $sym272$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_variable_length_sequence_method;
    }

    public static final SubLObject basic_variable_length_sequence_get_default_value_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_basic_variable_length_sequence_method = NIL;
            SubLObject default_value = com.cyc.cycjava.cycl.subloop_sequences.get_basic_variable_length_sequence_default_value(self);
            try {
                try {
                    sublisp_throw($sym277$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, default_value);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_sequences.set_basic_variable_length_sequence_default_value(self, default_value);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_basic_variable_length_sequence_method = Errors.handleThrowable(ccatch_env_var, $sym277$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
            }
            return catch_var_for_basic_variable_length_sequence_method;
        }
    }

    public static SubLObject basic_variable_length_sequence_get_default_value_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_variable_length_sequence_method = NIL;
        final SubLObject default_value = get_basic_variable_length_sequence_default_value(self);
        try {
            thread.throwStack.push($sym277$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
            try {
                sublisp_throw($sym277$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, default_value);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_variable_length_sequence_default_value(self, default_value);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_variable_length_sequence_method = Errors.handleThrowable(ccatch_env_var, $sym277$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_variable_length_sequence_method;
    }

    static private final SubLList $list_alt142 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-STORAGE"), list(makeSymbol("GET-INTERNAL-STORAGE"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-SIZE"), list(makeSymbol("GET-STORAGE-SIZE"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-DEFAULT-VALUE"), list(makeSymbol("GET-DEFAULT-VALUE"), makeSymbol("SELF")))), list(makeSymbol("CDOTIMES"), list(makeSymbol("TEMPLATE-INDEX"), makeSymbol("TEMPLATE-SIZE")), list(makeSymbol("SET-AREF"), makeSymbol("TEMPLATE-STORAGE"), makeSymbol("TEMPLATE-INDEX"), makeSymbol("TEMPLATE-DEFAULT-VALUE"))), list(makeSymbol("SET-LARGEST-INDEX"), makeSymbol("SELF"), MINUS_ONE_INTEGER), list(RET, makeSymbol("TEMPLATE-DEFAULT-VALUE"))));

    public static final SubLObject basic_variable_length_sequence_set_default_value_method_alt(SubLObject self, SubLObject new_default_value) {
        {
            SubLObject catch_var_for_basic_variable_length_sequence_method = NIL;
            SubLObject default_value = com.cyc.cycjava.cycl.subloop_sequences.get_basic_variable_length_sequence_default_value(self);
            try {
                try {
                    default_value = new_default_value;
                    sublisp_throw($sym282$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, new_default_value);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_sequences.set_basic_variable_length_sequence_default_value(self, default_value);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_basic_variable_length_sequence_method = Errors.handleThrowable(ccatch_env_var, $sym282$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
            }
            return catch_var_for_basic_variable_length_sequence_method;
        }
    }

    public static SubLObject basic_variable_length_sequence_set_default_value_method(final SubLObject self, final SubLObject new_default_value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_variable_length_sequence_method = NIL;
        SubLObject default_value = get_basic_variable_length_sequence_default_value(self);
        try {
            thread.throwStack.push($sym282$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
            try {
                default_value = new_default_value;
                sublisp_throw($sym282$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, new_default_value);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_variable_length_sequence_default_value(self, default_value);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_variable_length_sequence_method = Errors.handleThrowable(ccatch_env_var, $sym282$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_variable_length_sequence_method;
    }

    static private final SubLList $list_alt143 = list(list(RET, list(makeSymbol("+"), list(makeSymbol("GET-LARGEST-INDEX"), makeSymbol("SELF")), ONE_INTEGER)));

    static private final SubLList $list_alt144 = list(makeSymbol("N"), makeSymbol("&OPTIONAL"), list(makeSymbol("OUT-OF-RANGE-VALUE"), NIL));

    static private final SubLList $list_alt145 = list(list(makeSymbol("PWHEN"), list(makeSymbol("COR"), list(makeSymbol("<"), makeSymbol("N"), ZERO_INTEGER), list(makeSymbol(">"), makeSymbol("N"), list(makeSymbol("GET-LARGEST-INDEX"), makeSymbol("SELF")))), list(RET, makeSymbol("OUT-OF-RANGE-VALUE"))), list(RET, list(makeSymbol("AREF"), list(makeSymbol("GET-INTERNAL-STORAGE"), makeSymbol("SELF")), makeSymbol("N"))));

    static private final SubLList $list_alt146 = list(list(makeSymbol("MUST"), list(makeSymbol(">="), makeSymbol("N"), ZERO_INTEGER), makeString("(SET-NTH ~S): Index ~S is less than zero.  Only non-negative indices are accepted."), makeSymbol("SELF"), makeSymbol("N")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LARGEST-INDEX"), list(makeSymbol("GET-LARGEST-INDEX"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-STORAGE-SIZE"), list(makeSymbol("GET-STORAGE-SIZE"), makeSymbol("SELF")))), list(makeSymbol("PIF"), list(makeSymbol(">="), makeSymbol("N"), makeSymbol("TEMPLATE-STORAGE-SIZE")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-NEW-STORAGE-SIZE"), list(makeSymbol("*"), list(makeSymbol("GET-GROWTH-FACTOR"), makeSymbol("SELF")), makeSymbol("N"))), list(makeSymbol("TEMPLATE-OLD-STORAGE"), list(makeSymbol("GET-INTERNAL-STORAGE"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-DEFAULT-VALUE"), list(makeSymbol("GET-DEFAULT-VALUE"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-NEW-STORAGE"), list(makeSymbol("MAKE-VECTOR"), makeSymbol("TEMPLATE-NEW-STORAGE-SIZE"), makeSymbol("TEMPLATE-DEFAULT-VALUE")))), list(makeSymbol("CDOTIMES"), list(makeSymbol("TEMPLATE-INDEX"), list(makeSymbol("+"), makeSymbol("TEMPLATE-LARGEST-INDEX"), ONE_INTEGER)), list(makeSymbol("SET-AREF"), makeSymbol("TEMPLATE-NEW-STORAGE"), makeSymbol("TEMPLATE-INDEX"), list(makeSymbol("AREF"), makeSymbol("TEMPLATE-OLD-STORAGE"), makeSymbol("TEMPLATE-INDEX")))), list(makeSymbol("RECORD-INDEX"), makeSymbol("SELF"), makeSymbol("N")), list(makeSymbol("SET-INTERNAL-STORAGE"), makeSymbol("SELF"), makeSymbol("TEMPLATE-NEW-STORAGE")), list(makeSymbol("SET-STORAGE-SIZE"), makeSymbol("SELF"), makeSymbol("TEMPLATE-NEW-STORAGE-SIZE")), list(makeSymbol("SET-AREF"), makeSymbol("TEMPLATE-NEW-STORAGE"), makeSymbol("N"), makeSymbol("NEW-VALUE"))), list(makeSymbol("PROGN"), list(makeSymbol("RECORD-INDEX"), makeSymbol("SELF"), makeSymbol("N")), list(makeSymbol("SET-AREF"), list(makeSymbol("GET-INTERNAL-STORAGE"), makeSymbol("SELF")), makeSymbol("N"), makeSymbol("NEW-VALUE")))), list(RET, makeSymbol("NEW-VALUE"))));

    public static final SubLObject basic_variable_length_sequence_get_growth_factor_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_basic_variable_length_sequence_method = NIL;
            SubLObject growth_factor = com.cyc.cycjava.cycl.subloop_sequences.get_basic_variable_length_sequence_growth_factor(self);
            try {
                try {
                    sublisp_throw($sym286$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, growth_factor);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_sequences.set_basic_variable_length_sequence_growth_factor(self, growth_factor);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_basic_variable_length_sequence_method = Errors.handleThrowable(ccatch_env_var, $sym286$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
            }
            return catch_var_for_basic_variable_length_sequence_method;
        }
    }

    public static SubLObject basic_variable_length_sequence_get_growth_factor_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_variable_length_sequence_method = NIL;
        final SubLObject growth_factor = get_basic_variable_length_sequence_growth_factor(self);
        try {
            thread.throwStack.push($sym286$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
            try {
                sublisp_throw($sym286$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, growth_factor);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_variable_length_sequence_growth_factor(self, growth_factor);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_variable_length_sequence_method = Errors.handleThrowable(ccatch_env_var, $sym286$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_variable_length_sequence_method;
    }

    static private final SubLList $list_alt147 = list(list(makeSymbol("MUST"), list(makeSymbol(">="), makeSymbol("START-INDEX"), ZERO_INTEGER), makeString("(GET-SUBSEQUENCE ~S): Index ~S is less than zero.  Only non-negative indices are accepted."), makeSymbol("SELF"), makeSymbol("START-INDEX")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LENGTH"), list(makeSymbol("GET-LENGTH"), makeSymbol("SELF")))), list(makeSymbol("PUNLESS"), makeSymbol("END-INDEX"), list(makeSymbol("CSETQ"), makeSymbol("END-INDEX"), makeSymbol("TEMPLATE-LENGTH"))), list(makeSymbol("MUST"), list(makeSymbol("<="), makeSymbol("END-INDEX"), makeSymbol("TEMPLATE-LENGTH")), makeString("(GET-SUBSEQUENCE ~S): End index ~S exceeds the length ~S of this sequence."), makeSymbol("END-INDEX"), makeSymbol("TEMPLATE-LENGTH")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CLASS"), list(makeSymbol("GET-SEQUENCE-CLASS"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-INSTANCE"), list(makeSymbol("NEW-OBJECT-INSTANCE"), makeSymbol("TEMPLATE-CLASS"))), list(makeSymbol("TEMPLATE-ORIGINAL-INDEX"), makeSymbol("START-INDEX")), list(makeSymbol("TEMPLATE-INDEX-COUNT"), list(makeSymbol("-"), makeSymbol("END-INDEX"), makeSymbol("START-INDEX")))), list(makeSymbol("CDOTIMES"), list(makeSymbol("TEMPLATE-INDEX"), makeSymbol("TEMPLATE-INDEX-COUNT")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-INSTANCE"), list(QUOTE, makeSymbol("SET-NTH")), makeSymbol("TEMPLATE-INDEX"), list(makeSymbol("GET-NTH"), makeSymbol("SELF"), makeSymbol("TEMPLATE-ORIGINAL-INDEX"))), list(makeSymbol("CINC"), makeSymbol("TEMPLATE-ORIGINAL-INDEX"))), list(RET, makeSymbol("TEMPLATE-INSTANCE")))));

    public static final SubLObject basic_variable_length_sequence_set_growth_factor_method_alt(SubLObject self, SubLObject new_growth_factor) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_basic_variable_length_sequence_method = NIL;
                SubLObject growth_factor = com.cyc.cycjava.cycl.subloop_sequences.get_basic_variable_length_sequence_growth_factor(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!(new_growth_factor.isNumber() && new_growth_factor.numG($float$1_0))) {
                                Errors.error($str_alt293$_SET_GROWTH_FACTOR__S____S_is_not, self, new_growth_factor);
                            }
                        }
                        growth_factor = new_growth_factor;
                        sublisp_throw($sym291$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, new_growth_factor);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                com.cyc.cycjava.cycl.subloop_sequences.set_basic_variable_length_sequence_growth_factor(self, growth_factor);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_basic_variable_length_sequence_method = Errors.handleThrowable(ccatch_env_var, $sym291$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
                }
                return catch_var_for_basic_variable_length_sequence_method;
            }
        }
    }

    public static SubLObject basic_variable_length_sequence_set_growth_factor_method(final SubLObject self, final SubLObject new_growth_factor) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_variable_length_sequence_method = NIL;
        SubLObject growth_factor = get_basic_variable_length_sequence_growth_factor(self);
        try {
            thread.throwStack.push($sym291$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
            try {
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((!new_growth_factor.isNumber()) || (!new_growth_factor.numG($float$1_0)))) {
                    Errors.error($str293$_SET_GROWTH_FACTOR__S____S_is_not, self, new_growth_factor);
                }
                growth_factor = new_growth_factor;
                sublisp_throw($sym291$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, new_growth_factor);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_variable_length_sequence_growth_factor(self, growth_factor);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_variable_length_sequence_method = Errors.handleThrowable(ccatch_env_var, $sym291$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_variable_length_sequence_method;
    }

    static private final SubLList $list_alt148 = list(list(RET, list(makeSymbol("SET-NTH"), makeSymbol("SELF"), list(makeSymbol("+"), list(makeSymbol("GET-LARGEST-INDEX"), makeSymbol("SELF")), ONE_INTEGER), makeSymbol("NEW-ELEMENT"))));

    static private final SubLList $list_alt149 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-ENUMERATOR"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR"))))), list(makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-SET-SEQUENCE-METHOD"), makeSymbol("TEMPLATE-ENUMERATOR"), makeSymbol("SELF")), list(RET, makeSymbol("TEMPLATE-ENUMERATOR"))));

    public static final SubLObject basic_variable_length_sequence_get_sequence_class_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_basic_variable_length_sequence_method = NIL;
            SubLObject sequence_class = com.cyc.cycjava.cycl.subloop_sequences.get_basic_variable_length_sequence_sequence_class(self);
            try {
                try {
                    sublisp_throw($sym295$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, sequence_class);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_sequences.set_basic_variable_length_sequence_sequence_class(self, sequence_class);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_basic_variable_length_sequence_method = Errors.handleThrowable(ccatch_env_var, $sym295$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
            }
            return catch_var_for_basic_variable_length_sequence_method;
        }
    }

    public static SubLObject basic_variable_length_sequence_get_sequence_class_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_variable_length_sequence_method = NIL;
        final SubLObject sequence_class = get_basic_variable_length_sequence_sequence_class(self);
        try {
            thread.throwStack.push($sym295$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
            try {
                sublisp_throw($sym295$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, sequence_class);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_variable_length_sequence_sequence_class(self, sequence_class);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_variable_length_sequence_method = Errors.handleThrowable(ccatch_env_var, $sym295$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_variable_length_sequence_method;
    }

    static private final SubLList $list_alt150 = list(list(makeSymbol("MUST"), list(makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-P"), makeSymbol("OLD-ENUMERATOR")), makeString("(DEALLOCATE-ENUMERATOR ~S): ~S is not an instance BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR."), makeSymbol("SELF"), makeSymbol("OLD-ENUMERATOR")), list(makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-SET-SEQUENCE-METHOD"), makeSymbol("OLD-ENUMERATOR"), NIL), list(RET, NIL));

    static private final SubLList $list_alt152 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-STORAGE"), list(makeSymbol("GET-INTERNAL-STORAGE"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-LENGTH"), list(makeSymbol("GET-LENGTH"), makeSymbol("SELF")))), list(makeSymbol("CDOTIMES"), list(makeSymbol("TEMPLATE-INDEX"), makeSymbol("TEMPLATE-LENGTH")), list(makeSymbol("PWHEN"), list(makeSymbol("AREF"), makeSymbol("TEMPLATE-STORAGE"), makeSymbol("TEMPLATE-INDEX")), list(RET, NIL))), list(RET, T)));

    static private final SubLList $list_alt154 = list(makeSymbol("START-INDEX"));

    static private final SubLList $list_alt155 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-INTERNAL-STORAGE"), list(makeSymbol("GET-INTERNAL-STORAGE"), makeSymbol("SELF")))), list(makeSymbol("PUNLESS"), makeSymbol("TEMPLATE-INTERNAL-STORAGE"), list(RET, NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LENGTH"), list(makeSymbol("GET-LENGTH"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), list(makeSymbol("ZEROP"), makeSymbol("TEMPLATE-LENGTH")), list(RET, NIL)), list(makeSymbol("PWHEN"), list(makeSymbol(">="), makeSymbol("START-INDEX"), makeSymbol("TEMPLATE-LENGTH")), list(RET, NIL)), list(makeSymbol("CSETQ"), makeSymbol("START-INDEX"), list(makeSymbol("MIN"), list(makeSymbol("MAX"), makeSymbol("START-INDEX"), ZERO_INTEGER), list(makeSymbol("-"), makeSymbol("TEMPLATE-LENGTH"), ONE_INTEGER))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-INDEX"), makeSymbol("START-INDEX"))), list(makeSymbol("WHILE"), list(makeSymbol("<"), makeSymbol("TEMPLATE-INDEX"), makeSymbol("TEMPLATE-LENGTH")), list(makeSymbol("PWHEN"), list(makeSymbol("AREF"), makeSymbol("TEMPLATE-INTERNAL-STORAGE"), makeSymbol("TEMPLATE-INDEX")), list(RET, makeSymbol("TEMPLATE-INDEX"))), list(makeSymbol("CINC"), makeSymbol("TEMPLATE-INDEX"))), list(RET, NIL)))));

    public static final SubLObject basic_variable_length_sequence_set_sequence_class_method_alt(SubLObject self, SubLObject new_class) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_basic_variable_length_sequence_method = NIL;
                SubLObject sequence_class = com.cyc.cycjava.cycl.subloop_sequences.get_basic_variable_length_sequence_sequence_class(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_class) || (new_class.isSymbol() && (NIL != classes.subclassp(new_class, BASIC_VARIABLE_LENGTH_SEQUENCE))))) {
                                Errors.error($str_alt299$_SET_SEQUENCE_CLASS__S____S_is_no, self, new_class);
                            }
                        }
                        sequence_class = new_class;
                        sublisp_throw($sym298$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, new_class);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                com.cyc.cycjava.cycl.subloop_sequences.set_basic_variable_length_sequence_sequence_class(self, sequence_class);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_basic_variable_length_sequence_method = Errors.handleThrowable(ccatch_env_var, $sym298$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
                }
                return catch_var_for_basic_variable_length_sequence_method;
            }
        }
    }

    public static SubLObject basic_variable_length_sequence_set_sequence_class_method(final SubLObject self, final SubLObject new_class) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_variable_length_sequence_method = NIL;
        SubLObject sequence_class = get_basic_variable_length_sequence_sequence_class(self);
        try {
            thread.throwStack.push($sym298$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
            try {
                if (((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != new_class)) && ((!new_class.isSymbol()) || (NIL == classes.subclassp(new_class, BASIC_VARIABLE_LENGTH_SEQUENCE)))) {
                    Errors.error($str299$_SET_SEQUENCE_CLASS__S____S_is_no, self, new_class);
                }
                sequence_class = new_class;
                sublisp_throw($sym298$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, new_class);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_variable_length_sequence_sequence_class(self, sequence_class);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_variable_length_sequence_method = Errors.handleThrowable(ccatch_env_var, $sym298$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_variable_length_sequence_method;
    }

    static private final SubLList $list_alt157 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-INTERNAL-STORAGE"), list(makeSymbol("GET-INTERNAL-STORAGE"), makeSymbol("SELF")))), list(makeSymbol("PUNLESS"), makeSymbol("TEMPLATE-INTERNAL-STORAGE"), list(RET, NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LENGTH"), list(makeSymbol("GET-LENGTH"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), list(makeSymbol("ZEROP"), makeSymbol("TEMPLATE-LENGTH")), list(RET, NIL)), list(makeSymbol("CSETQ"), makeSymbol("START-INDEX"), list(makeSymbol("MIN"), list(makeSymbol("MAX"), makeSymbol("START-INDEX"), ZERO_INTEGER), list(makeSymbol("-"), makeSymbol("TEMPLATE-LENGTH"), ONE_INTEGER))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-INDEX"), makeSymbol("START-INDEX"))), list(makeSymbol("WHILE"), list(makeSymbol(">="), makeSymbol("TEMPLATE-INDEX"), ZERO_INTEGER), list(makeSymbol("PWHEN"), list(makeSymbol("AREF"), makeSymbol("TEMPLATE-INTERNAL-STORAGE"), makeSymbol("TEMPLATE-INDEX")), list(RET, makeSymbol("TEMPLATE-INDEX"))), list(makeSymbol("CDEC"), makeSymbol("TEMPLATE-INDEX"))), list(RET, NIL)))));

    public static final SubLObject fixed_length_sequence_p_alt(SubLObject fixed_length_sequence) {
        return interfaces.subloop_instanceof_interface(fixed_length_sequence, FIXED_LENGTH_SEQUENCE);
    }

    public static SubLObject fixed_length_sequence_p(final SubLObject fixed_length_sequence) {
        return interfaces.subloop_instanceof_interface(fixed_length_sequence, FIXED_LENGTH_SEQUENCE);
    }

    public static SubLObject declare_subloop_sequences_file() {
        declareFunction("sequence_element_template_p", "SEQUENCE-ELEMENT-TEMPLATE-P", 1, 0, false);
        declareFunction("sequence_p", "SEQUENCE-P", 1, 0, false);
        declareFunction("sequence_template_p", "SEQUENCE-TEMPLATE-P", 1, 0, false);
        declareFunction("get_basic_sequence_enumerator_current_index", "GET-BASIC-SEQUENCE-ENUMERATOR-CURRENT-INDEX", 1, 0, false);
        declareFunction("set_basic_sequence_enumerator_current_index", "SET-BASIC-SEQUENCE-ENUMERATOR-CURRENT-INDEX", 2, 0, false);
        declareFunction("get_basic_sequence_enumerator_length", "GET-BASIC-SEQUENCE-ENUMERATOR-LENGTH", 1, 0, false);
        declareFunction("set_basic_sequence_enumerator_length", "SET-BASIC-SEQUENCE-ENUMERATOR-LENGTH", 2, 0, false);
        declareFunction("get_basic_sequence_enumerator_shared_storage", "GET-BASIC-SEQUENCE-ENUMERATOR-SHARED-STORAGE", 1, 0, false);
        declareFunction("set_basic_sequence_enumerator_shared_storage", "SET-BASIC-SEQUENCE-ENUMERATOR-SHARED-STORAGE", 2, 0, false);
        declareFunction("subloop_reserved_initialize_basic_sequence_enumerator_class", "SUBLOOP-RESERVED-INITIALIZE-BASIC-SEQUENCE-ENUMERATOR-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_basic_sequence_enumerator_instance", "SUBLOOP-RESERVED-INITIALIZE-BASIC-SEQUENCE-ENUMERATOR-INSTANCE", 1, 0, false);
        declareFunction("basic_sequence_enumerator_p", "BASIC-SEQUENCE-ENUMERATOR-P", 1, 0, false);
        declareFunction("basic_sequence_enumerator_initialize_method", "BASIC-SEQUENCE-ENUMERATOR-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("basic_sequence_enumerator_set_shared_storage_method", "BASIC-SEQUENCE-ENUMERATOR-SET-SHARED-STORAGE-METHOD", 2, 0, false);
        declareFunction("basic_sequence_enumerator_empty_p_method", "BASIC-SEQUENCE-ENUMERATOR-EMPTY-P-METHOD", 1, 0, false);
        declareFunction("basic_sequence_enumerator_first_p_method", "BASIC-SEQUENCE-ENUMERATOR-FIRST-P-METHOD", 1, 0, false);
        declareFunction("basic_sequence_enumerator_last_p_method", "BASIC-SEQUENCE-ENUMERATOR-LAST-P-METHOD", 1, 0, false);
        declareFunction("basic_sequence_enumerator_current_method", "BASIC-SEQUENCE-ENUMERATOR-CURRENT-METHOD", 1, 0, false);
        declareFunction("basic_sequence_enumerator_first_method", "BASIC-SEQUENCE-ENUMERATOR-FIRST-METHOD", 1, 0, false);
        declareFunction("basic_sequence_enumerator_last_method", "BASIC-SEQUENCE-ENUMERATOR-LAST-METHOD", 1, 0, false);
        declareFunction("basic_sequence_enumerator_next_method", "BASIC-SEQUENCE-ENUMERATOR-NEXT-METHOD", 1, 0, false);
        declareFunction("basic_sequence_enumerator_previous_method", "BASIC-SEQUENCE-ENUMERATOR-PREVIOUS-METHOD", 1, 0, false);
        declareFunction("get_basic_sequence_sequence_class", "GET-BASIC-SEQUENCE-SEQUENCE-CLASS", 1, 0, false);
        declareFunction("set_basic_sequence_sequence_class", "SET-BASIC-SEQUENCE-SEQUENCE-CLASS", 2, 0, false);
        declareFunction("get_basic_sequence_internal_storage", "GET-BASIC-SEQUENCE-INTERNAL-STORAGE", 1, 0, false);
        declareFunction("set_basic_sequence_internal_storage", "SET-BASIC-SEQUENCE-INTERNAL-STORAGE", 2, 0, false);
        declareFunction("basic_sequence_deallocate_enumerator_method", "BASIC-SEQUENCE-DEALLOCATE-ENUMERATOR-METHOD", 2, 0, false);
        declareFunction("basic_sequence_allocate_enumerator_method", "BASIC-SEQUENCE-ALLOCATE-ENUMERATOR-METHOD", 1, 0, false);
        declareFunction("basic_sequence_get_contents_method", "BASIC-SEQUENCE-GET-CONTENTS-METHOD", 1, 0, false);
        declareFunction("basic_sequence_add_method", "BASIC-SEQUENCE-ADD-METHOD", 2, 0, false);
        declareFunction("basic_sequence_get_subsequence_method", "BASIC-SEQUENCE-GET-SUBSEQUENCE-METHOD", 2, 1, false);
        declareFunction("basic_sequence_set_nth_method", "BASIC-SEQUENCE-SET-NTH-METHOD", 3, 0, false);
        declareFunction("basic_sequence_get_nth_method", "BASIC-SEQUENCE-GET-NTH-METHOD", 2, 1, false);
        declareFunction("basic_sequence_get_length_method", "BASIC-SEQUENCE-GET-LENGTH-METHOD", 1, 0, false);
        declareFunction("basic_sequence_clear_method", "BASIC-SEQUENCE-CLEAR-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_basic_sequence_class", "SUBLOOP-RESERVED-INITIALIZE-BASIC-SEQUENCE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_basic_sequence_instance", "SUBLOOP-RESERVED-INITIALIZE-BASIC-SEQUENCE-INSTANCE", 1, 0, false);
        declareFunction("basic_sequence_p", "BASIC-SEQUENCE-P", 1, 0, false);
        declareFunction("basic_sequence_initialize_method", "BASIC-SEQUENCE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("basic_sequence_print_method", "BASIC-SEQUENCE-PRINT-METHOD", 3, 0, false);
        declareFunction("basic_sequence_get_internal_storage_method", "BASIC-SEQUENCE-GET-INTERNAL-STORAGE-METHOD", 1, 0, false);
        declareFunction("basic_sequence_set_internal_storage_method", "BASIC-SEQUENCE-SET-INTERNAL-STORAGE-METHOD", 2, 0, false);
        declareFunction("basic_sequence_get_sequence_class_method", "BASIC-SEQUENCE-GET-SEQUENCE-CLASS-METHOD", 1, 0, false);
        declareFunction("basic_sequence_set_sequence_class_method", "BASIC-SEQUENCE-SET-SEQUENCE-CLASS-METHOD", 2, 0, false);
        declareFunction("variable_length_sequence_p", "VARIABLE-LENGTH-SEQUENCE-P", 1, 0, false);
        declareFunction("variable_length_sequence_template_p", "VARIABLE-LENGTH-SEQUENCE-TEMPLATE-P", 1, 0, false);
        declareFunction("get_basic_variable_length_sequence_enumerator_current_index", "GET-BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-CURRENT-INDEX", 1, 0, false);
        declareFunction("set_basic_variable_length_sequence_enumerator_current_index", "SET-BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-CURRENT-INDEX", 2, 0, false);
        declareFunction("get_basic_variable_length_sequence_enumerator_sequence", "GET-BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-SEQUENCE", 1, 0, false);
        declareFunction("set_basic_variable_length_sequence_enumerator_sequence", "SET-BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-SEQUENCE", 2, 0, false);
        declareFunction("get_basic_variable_length_sequence_enumerator_ignore_null_values", "GET-BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-IGNORE-NULL-VALUES", 1, 0, false);
        declareFunction("set_basic_variable_length_sequence_enumerator_ignore_null_values", "SET-BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-IGNORE-NULL-VALUES", 2, 0, false);
        declareFunction("subloop_reserved_initialize_basic_variable_length_sequence_enumerator_class", "SUBLOOP-RESERVED-INITIALIZE-BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_basic_variable_length_sequence_enumerator_instance", "SUBLOOP-RESERVED-INITIALIZE-BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-INSTANCE", 1, 0, false);
        declareFunction("basic_variable_length_sequence_enumerator_p", "BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-P", 1, 0, false);
        declareFunction("basic_variable_length_sequence_enumerator_initialize_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("basic_variable_length_sequence_enumerator_seek_non_null_forward_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-SEEK-NON-NULL-FORWARD-METHOD", 1, 0, false);
        declareFunction("basic_variable_length_sequence_enumerator_seek_non_null_backward_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-SEEK-NON-NULL-BACKWARD-METHOD", 1, 0, false);
        declareFunction("basic_variable_length_sequence_enumerator_set_sequence_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-SET-SEQUENCE-METHOD", 2, 0, false);
        declareFunction("basic_variable_length_sequence_enumerator_get_ignore_null_values_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-GET-IGNORE-NULL-VALUES-METHOD", 1, 0, false);
        declareFunction("basic_variable_length_sequence_enumerator_set_ignore_null_values_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-SET-IGNORE-NULL-VALUES-METHOD", 2, 0, false);
        declareFunction("basic_variable_length_sequence_enumerator_empty_p_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-EMPTY-P-METHOD", 1, 0, false);
        declareFunction("basic_variable_length_sequence_enumerator_first_p_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-FIRST-P-METHOD", 1, 0, false);
        declareFunction("basic_variable_length_sequence_enumerator_last_p_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-LAST-P-METHOD", 1, 0, false);
        declareFunction("basic_variable_length_sequence_enumerator_current_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-CURRENT-METHOD", 1, 0, false);
        declareFunction("basic_variable_length_sequence_enumerator_first_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-FIRST-METHOD", 1, 0, false);
        declareFunction("basic_variable_length_sequence_enumerator_last_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-LAST-METHOD", 1, 0, false);
        declareFunction("basic_variable_length_sequence_enumerator_next_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-NEXT-METHOD", 1, 0, false);
        declareFunction("basic_variable_length_sequence_enumerator_previous_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-PREVIOUS-METHOD", 1, 0, false);
        declareFunction("get_basic_variable_length_sequence_sequence_class", "GET-BASIC-VARIABLE-LENGTH-SEQUENCE-SEQUENCE-CLASS", 1, 0, false);
        declareFunction("set_basic_variable_length_sequence_sequence_class", "SET-BASIC-VARIABLE-LENGTH-SEQUENCE-SEQUENCE-CLASS", 2, 0, false);
        declareFunction("get_basic_variable_length_sequence_growth_factor", "GET-BASIC-VARIABLE-LENGTH-SEQUENCE-GROWTH-FACTOR", 1, 0, false);
        declareFunction("set_basic_variable_length_sequence_growth_factor", "SET-BASIC-VARIABLE-LENGTH-SEQUENCE-GROWTH-FACTOR", 2, 0, false);
        declareFunction("get_basic_variable_length_sequence_default_value", "GET-BASIC-VARIABLE-LENGTH-SEQUENCE-DEFAULT-VALUE", 1, 0, false);
        declareFunction("set_basic_variable_length_sequence_default_value", "SET-BASIC-VARIABLE-LENGTH-SEQUENCE-DEFAULT-VALUE", 2, 0, false);
        declareFunction("get_basic_variable_length_sequence_largest_index", "GET-BASIC-VARIABLE-LENGTH-SEQUENCE-LARGEST-INDEX", 1, 0, false);
        declareFunction("set_basic_variable_length_sequence_largest_index", "SET-BASIC-VARIABLE-LENGTH-SEQUENCE-LARGEST-INDEX", 2, 0, false);
        declareFunction("get_basic_variable_length_sequence_storage_size", "GET-BASIC-VARIABLE-LENGTH-SEQUENCE-STORAGE-SIZE", 1, 0, false);
        declareFunction("set_basic_variable_length_sequence_storage_size", "SET-BASIC-VARIABLE-LENGTH-SEQUENCE-STORAGE-SIZE", 2, 0, false);
        declareFunction("get_basic_variable_length_sequence_internal_storage", "GET-BASIC-VARIABLE-LENGTH-SEQUENCE-INTERNAL-STORAGE", 1, 0, false);
        declareFunction("set_basic_variable_length_sequence_internal_storage", "SET-BASIC-VARIABLE-LENGTH-SEQUENCE-INTERNAL-STORAGE", 2, 0, false);
        declareFunction("basic_variable_length_sequence_index_of_previous_non_nil_element_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-INDEX-OF-PREVIOUS-NON-NIL-ELEMENT-METHOD", 2, 0, false);
        declareFunction("basic_variable_length_sequence_index_of_next_non_nil_element_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-INDEX-OF-NEXT-NON-NIL-ELEMENT-METHOD", 2, 0, false);
        declareFunction("basic_variable_length_sequence_all_null_p_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-ALL-NULL-P-METHOD", 1, 0, false);
        declareFunction("basic_variable_length_sequence_deallocate_enumerator_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-DEALLOCATE-ENUMERATOR-METHOD", 2, 0, false);
        declareFunction("basic_variable_length_sequence_allocate_enumerator_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-ALLOCATE-ENUMERATOR-METHOD", 1, 0, false);
        declareFunction("basic_variable_length_sequence_add_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-ADD-METHOD", 2, 0, false);
        declareFunction("basic_variable_length_sequence_get_subsequence_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-GET-SUBSEQUENCE-METHOD", 2, 1, false);
        declareFunction("basic_variable_length_sequence_set_nth_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-SET-NTH-METHOD", 3, 0, false);
        declareFunction("basic_variable_length_sequence_get_nth_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-GET-NTH-METHOD", 2, 1, false);
        declareFunction("basic_variable_length_sequence_get_length_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-GET-LENGTH-METHOD", 1, 0, false);
        declareFunction("basic_variable_length_sequence_clear_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-CLEAR-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_basic_variable_length_sequence_class", "SUBLOOP-RESERVED-INITIALIZE-BASIC-VARIABLE-LENGTH-SEQUENCE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_basic_variable_length_sequence_instance", "SUBLOOP-RESERVED-INITIALIZE-BASIC-VARIABLE-LENGTH-SEQUENCE-INSTANCE", 1, 0, false);
        declareFunction("basic_variable_length_sequence_p", "BASIC-VARIABLE-LENGTH-SEQUENCE-P", 1, 0, false);
        declareFunction("basic_variable_length_sequence_initialize_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("basic_variable_length_sequence_print_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-PRINT-METHOD", 3, 0, false);
        declareFunction("basic_variable_length_sequence_get_internal_storage_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-GET-INTERNAL-STORAGE-METHOD", 1, 0, false);
        declareFunction("basic_variable_length_sequence_get_contents_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-GET-CONTENTS-METHOD", 1, 0, false);
        declareFunction("basic_variable_length_sequence_set_internal_storage_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-SET-INTERNAL-STORAGE-METHOD", 2, 0, false);
        declareFunction("basic_variable_length_sequence_get_storage_size_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-GET-STORAGE-SIZE-METHOD", 1, 0, false);
        declareFunction("basic_variable_length_sequence_set_storage_size_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-SET-STORAGE-SIZE-METHOD", 2, 0, false);
        declareFunction("basic_variable_length_sequence_get_largest_index_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-GET-LARGEST-INDEX-METHOD", 1, 0, false);
        declareFunction("basic_variable_length_sequence_set_largest_index_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-SET-LARGEST-INDEX-METHOD", 2, 0, false);
        declareFunction("basic_variable_length_sequence_record_index_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-RECORD-INDEX-METHOD", 2, 0, false);
        declareFunction("basic_variable_length_sequence_get_default_value_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-GET-DEFAULT-VALUE-METHOD", 1, 0, false);
        declareFunction("basic_variable_length_sequence_set_default_value_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-SET-DEFAULT-VALUE-METHOD", 2, 0, false);
        declareFunction("basic_variable_length_sequence_get_growth_factor_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-GET-GROWTH-FACTOR-METHOD", 1, 0, false);
        declareFunction("basic_variable_length_sequence_set_growth_factor_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-SET-GROWTH-FACTOR-METHOD", 2, 0, false);
        declareFunction("basic_variable_length_sequence_get_sequence_class_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-GET-SEQUENCE-CLASS-METHOD", 1, 0, false);
        declareFunction("basic_variable_length_sequence_set_sequence_class_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-SET-SEQUENCE-CLASS-METHOD", 2, 0, false);
        declareFunction("fixed_length_sequence_p", "FIXED-LENGTH-SEQUENCE-P", 1, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt159 = list(new SubLObject[]{ list(makeSymbol("SEQUENCE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CURRENT-INDEX"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("IGNORE-NULL-VALUES"), makeKeyword("BOOLEAN"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SEEK-NON-NULL-FORWARD"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SEEK-NON-NULL-BACKWARD"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SEQUENCE"), list(makeSymbol("NEW-SEQUENCE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-IGNORE-NULL-VALUES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-IGNORE-NULL-VALUES"), list(makeSymbol("NEW-VALUE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EMPTY-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FIRST-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LAST-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CURRENT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FIRST"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LAST"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NEXT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PREVIOUS"), NIL, makeKeyword("PUBLIC")) });

    static private final SubLList $list_alt164 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("SEQUENCE"), NIL), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-INDEX"), ZERO_INTEGER), list(makeSymbol("CSETQ"), makeSymbol("IGNORE-NULL-VALUES"), T), list(RET, makeSymbol("SELF")));

    static private final SubLList $list_alt168 = list(list(makeSymbol("CLET"), list(list(makeSymbol("CURRENT-LENGTH"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SEQUENCE"), list(QUOTE, makeSymbol("LENGTH"))))), list(makeSymbol("PWHEN"), list(makeSymbol(">="), makeSymbol("CURRENT-INDEX"), makeSymbol("CURRENT-LENGTH")), list(RET, NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("INDEX"), makeSymbol("CURRENT-INDEX"))), list(makeSymbol("WHILE"), list(makeSymbol("<"), makeSymbol("INDEX"), makeSymbol("CURRENT-LENGTH")), list(makeSymbol("PWHEN"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SEQUENCE"), list(QUOTE, makeSymbol("GET-NTH")), makeSymbol("INDEX")), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-INDEX"), makeSymbol("INDEX")), list(RET, T)), list(makeSymbol("CINC"), makeSymbol("INDEX"))), list(RET, NIL))));

    static private final SubLList $list_alt172 = list(list(makeSymbol("PWHEN"), list(makeSymbol("="), makeSymbol("CURRENT-INDEX"), ZERO_INTEGER), list(RET, NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("INDEX"), makeSymbol("CURRENT-INDEX"))), list(makeSymbol("WHILE"), list(makeSymbol(">="), makeSymbol("INDEX"), ZERO_INTEGER), list(makeSymbol("PWHEN"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SEQUENCE"), list(QUOTE, makeSymbol("GET-NTH")), makeSymbol("INDEX")), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-INDEX"), makeSymbol("INDEX")), list(RET, T)), list(makeSymbol("CDEC"), makeSymbol("INDEX"))), list(RET, NIL)));

    static private final SubLList $list_alt176 = list(makeSymbol("NEW-SEQUENCE"));

    static private final SubLList $list_alt177 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-SEQUENCE")), list(makeSymbol("VARIABLE-LENGTH-SEQUENCE-TEMPLATE-P"), makeSymbol("NEW-SEQUENCE"))), makeString("(SET-SEQUENCE ~S): ~S is not an instance of a class that implements VARIABLE-LENGTH-SEQUENCE-TEMPLATE."), makeSymbol("SELF"), makeSymbol("NEW-SEQUENCE")), list(makeSymbol("CSETQ"), makeSymbol("SEQUENCE"), makeSymbol("NEW-SEQUENCE")), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-INDEX"), ZERO_INTEGER), list(RET, makeSymbol("SELF")));

    static private final SubLString $str_alt179$_SET_SEQUENCE__S____S_is_not_an_i = makeString("(SET-SEQUENCE ~S): ~S is not an instance of a class that implements VARIABLE-LENGTH-SEQUENCE-TEMPLATE.");

    static private final SubLList $list_alt182 = list(makeKeyword("READ-ONLY"), makeKeyword("PUBLIC"));

    static private final SubLList $list_alt183 = list(list(RET, makeSymbol("IGNORE-NULL-VALUES")));

    static private final SubLList $list_alt186 = list(makeSymbol("NEW-VALUE"));

    static private final SubLList $list_alt187 = list(list(makeSymbol("CSETQ"), makeSymbol("IGNORE-NULL-VALUES"), list(makeSymbol("FIF"), makeSymbol("NEW-VALUE"), T, NIL)), list(RET, makeSymbol("IGNORE-NULL-VALUES")));

    static private final SubLList $list_alt190 = list(list(makeSymbol("PUNLESS"), makeSymbol("SEQUENCE"), list(RET, T)), list(makeSymbol("PIF"), makeSymbol("IGNORE-NULL-VALUES"), list(RET, list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SEQUENCE"), list(QUOTE, makeSymbol("ALL-NULL-P")))), list(RET, list(makeSymbol("="), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SEQUENCE"), list(QUOTE, makeSymbol("GET-LENGTH"))), ZERO_INTEGER))));

    static private final SubLList $list_alt193 = list(list(makeSymbol("PUNLESS"), makeSymbol("SEQUENCE"), list(RET, NIL)), list(makeSymbol("PIF"), makeSymbol("IGNORE-NULL-VALUES"), list(RET, list(makeSymbol("="), makeSymbol("CURRENT-INDEX"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SEQUENCE"), list(QUOTE, makeSymbol("INDEX-OF-NEXT-NON-NIL-ELEMENT")), ZERO_INTEGER))), list(RET, list(makeSymbol("="), makeSymbol("CURRENT-INDEX"), ZERO_INTEGER))));

    static private final SubLList $list_alt196 = list(list(makeSymbol("PUNLESS"), makeSymbol("SEQUENCE"), list(RET, NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("LENGTH"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SEQUENCE"), list(QUOTE, makeSymbol("GET-LENGTH"))))), list(makeSymbol("PIF"), makeSymbol("IGNORE-NULL-VALUES"), list(RET, list(makeSymbol("="), makeSymbol("CURRENT-INDEX"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SEQUENCE"), list(QUOTE, makeSymbol("INDEX-OF-PREVIOUS-NON-NIL-ELEMENT")), makeSymbol("LENGTH")))), list(RET, list(makeSymbol("="), makeSymbol("CURRENT-INDEX"), list(makeSymbol("-"), makeSymbol("LENGTH"), ONE_INTEGER))))));

    static private final SubLList $list_alt199 = list(list(makeSymbol("PUNLESS"), makeSymbol("SEQUENCE"), list(RET, NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("LENGTH"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SEQUENCE"), list(QUOTE, makeSymbol("GET-LENGTH"))))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol(">="), makeSymbol("CURRENT-INDEX"), ZERO_INTEGER), list(makeSymbol("<"), makeSymbol("CURRENT-INDEX"), makeSymbol("LENGTH"))), list(RET, list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SEQUENCE"), list(QUOTE, makeSymbol("GET-NTH")), makeSymbol("CURRENT-INDEX"))))), list(RET, NIL));

    static private final SubLList $list_alt202 = list(list(makeSymbol("PIF"), makeSymbol("IGNORE-NULL-VALUES"), list(makeSymbol("CLET"), list(list(makeSymbol("FIRST-INDEX"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SEQUENCE"), list(QUOTE, makeSymbol("INDEX-OF-NEXT-NON-NIL-ELEMENT")), ZERO_INTEGER))), list(makeSymbol("PIF"), makeSymbol("FIRST-INDEX"), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-INDEX"), makeSymbol("FIRST-INDEX")), list(RET, list(makeSymbol("CURRENT"), makeSymbol("SELF")))), list(RET, NIL))), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-INDEX"), ZERO_INTEGER), list(RET, list(makeSymbol("CURRENT"), makeSymbol("SELF"))))));

    static private final SubLList $list_alt204 = list(list(makeSymbol("PUNLESS"), makeSymbol("SEQUENCE"), list(RET, NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("LENGTH"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SEQUENCE"), list(QUOTE, makeSymbol("GET-LENGTH"))))), list(makeSymbol("PIF"), makeSymbol("IGNORE-NULL-VALUES"), list(makeSymbol("CLET"), list(list(makeSymbol("LAST-INDEX"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SEQUENCE"), list(QUOTE, makeSymbol("INDEX-OF-PREVIOUS-NON-NIL-ELEMENT")), makeSymbol("LENGTH")))), list(makeSymbol("PIF"), makeSymbol("LAST-INDEX"), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-INDEX"), makeSymbol("LAST-INDEX")), list(RET, list(makeSymbol("CURRENT"), makeSymbol("SELF")))), list(RET, NIL))), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-INDEX"), list(makeSymbol("-"), makeSymbol("LENGTH"), ONE_INTEGER)), list(RET, list(makeSymbol("CURRENT"), makeSymbol("SELF")))))));

    static private final SubLList $list_alt206 = list(list(makeSymbol("PUNLESS"), makeSymbol("SEQUENCE"), list(RET, NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("LENGTH"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SEQUENCE"), list(QUOTE, makeSymbol("GET-LENGTH"))))), list(makeSymbol("PWHEN"), list(makeSymbol(">="), makeSymbol("CURRENT-INDEX"), makeSymbol("LENGTH")), list(RET, NIL)), list(makeSymbol("PIF"), makeSymbol("IGNORE-NULL-VALUES"), list(makeSymbol("CLET"), list(list(makeSymbol("NEXT-INDEX"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SEQUENCE"), list(QUOTE, makeSymbol("INDEX-OF-NEXT-NON-NIL-ELEMENT")), list(makeSymbol("+"), makeSymbol("CURRENT-INDEX"), ONE_INTEGER)))), list(makeSymbol("PIF"), makeSymbol("NEXT-INDEX"), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-INDEX"), makeSymbol("NEXT-INDEX")), list(RET, list(makeSymbol("CURRENT"), makeSymbol("SELF")))), list(RET, NIL))), list(makeSymbol("PROGN"), list(makeSymbol("CINC"), makeSymbol("CURRENT-INDEX")), list(RET, list(makeSymbol("CURRENT"), makeSymbol("SELF")))))));

    public static SubLObject init_subloop_sequences_file() {
        return NIL;
    }

    public static SubLObject setup_subloop_sequences_file() {
        interfaces.new_interface(SEQUENCE_ELEMENT_TEMPLATE, NIL, NIL, $list1);
        interfaces.new_interface(SEQUENCE, NIL, NIL, $list3);
        interfaces.interfaces_add_interface_instance_method(GET_CONTENTS, SEQUENCE, $list5, NIL, $list6);
        interfaces.new_interface(SEQUENCE_TEMPLATE, $list8, $list9, $list10);
        interfaces.interfaces_add_interface_instance_method(CLEAR, SEQUENCE_TEMPLATE, $list5, NIL, $list12);
        interfaces.interfaces_add_interface_instance_method(GET_LENGTH, SEQUENCE_TEMPLATE, $list5, NIL, $list14);
        interfaces.interfaces_add_interface_instance_method(GET_NTH, SEQUENCE_TEMPLATE, $list5, $list16, $list17);
        interfaces.interfaces_add_interface_instance_method(SET_NTH, SEQUENCE_TEMPLATE, $list5, $list19, $list20);
        interfaces.interfaces_add_interface_instance_method(GET_SUBSEQUENCE, SEQUENCE_TEMPLATE, $list5, $list22, $list23);
        interfaces.interfaces_add_interface_instance_method(ADD, SEQUENCE_TEMPLATE, $list5, $list25, $list26);
        interfaces.interfaces_add_interface_instance_method(ALLOCATE_ENUMERATOR, SEQUENCE_TEMPLATE, $list5, NIL, $list28);
        interfaces.interfaces_add_interface_instance_method(DEALLOCATE_ENUMERATOR, SEQUENCE_TEMPLATE, $list5, $list30, $list31);
        classes.subloop_new_class(BASIC_SEQUENCE_ENUMERATOR, OBJECT, $list34, NIL, $list35);
        classes.class_set_implements_slot_listeners(BASIC_SEQUENCE_ENUMERATOR, NIL);
        classes.subloop_note_class_initialization_function(BASIC_SEQUENCE_ENUMERATOR, SUBLOOP_RESERVED_INITIALIZE_BASIC_SEQUENCE_ENUMERATOR_CLASS);
        classes.subloop_note_instance_initialization_function(BASIC_SEQUENCE_ENUMERATOR, SUBLOOP_RESERVED_INITIALIZE_BASIC_SEQUENCE_ENUMERATOR_INSTANCE);
        subloop_reserved_initialize_basic_sequence_enumerator_class(BASIC_SEQUENCE_ENUMERATOR);
        methods.methods_incorporate_instance_method(INITIALIZE, BASIC_SEQUENCE_ENUMERATOR, $list45, NIL, $list46);
        methods.subloop_register_instance_method(BASIC_SEQUENCE_ENUMERATOR, INITIALIZE, BASIC_SEQUENCE_ENUMERATOR_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(SET_SHARED_STORAGE, BASIC_SEQUENCE_ENUMERATOR, $list5, $list50, $list51);
        methods.subloop_register_instance_method(BASIC_SEQUENCE_ENUMERATOR, SET_SHARED_STORAGE, BASIC_SEQUENCE_ENUMERATOR_SET_SHARED_STORAGE_METHOD);
        methods.methods_incorporate_instance_method(EMPTY_P, BASIC_SEQUENCE_ENUMERATOR, $list5, NIL, $list56);
        methods.subloop_register_instance_method(BASIC_SEQUENCE_ENUMERATOR, EMPTY_P, BASIC_SEQUENCE_ENUMERATOR_EMPTY_P_METHOD);
        methods.methods_incorporate_instance_method(FIRST_P, BASIC_SEQUENCE_ENUMERATOR, $list5, NIL, $list60);
        methods.subloop_register_instance_method(BASIC_SEQUENCE_ENUMERATOR, FIRST_P, BASIC_SEQUENCE_ENUMERATOR_FIRST_P_METHOD);
        methods.methods_incorporate_instance_method(LAST_P, BASIC_SEQUENCE_ENUMERATOR, $list5, NIL, $list64);
        methods.subloop_register_instance_method(BASIC_SEQUENCE_ENUMERATOR, LAST_P, BASIC_SEQUENCE_ENUMERATOR_LAST_P_METHOD);
        methods.methods_incorporate_instance_method(CURRENT, BASIC_SEQUENCE_ENUMERATOR, $list5, NIL, $list68);
        methods.subloop_register_instance_method(BASIC_SEQUENCE_ENUMERATOR, CURRENT, BASIC_SEQUENCE_ENUMERATOR_CURRENT_METHOD);
        methods.methods_incorporate_instance_method(FIRST, BASIC_SEQUENCE_ENUMERATOR, $list5, NIL, $list72);
        methods.subloop_register_instance_method(BASIC_SEQUENCE_ENUMERATOR, FIRST, BASIC_SEQUENCE_ENUMERATOR_FIRST_METHOD);
        methods.methods_incorporate_instance_method(LAST, BASIC_SEQUENCE_ENUMERATOR, $list5, NIL, $list76);
        methods.subloop_register_instance_method(BASIC_SEQUENCE_ENUMERATOR, LAST, BASIC_SEQUENCE_ENUMERATOR_LAST_METHOD);
        methods.methods_incorporate_instance_method(NEXT, BASIC_SEQUENCE_ENUMERATOR, $list80, NIL, $list81);
        methods.subloop_register_instance_method(BASIC_SEQUENCE_ENUMERATOR, NEXT, BASIC_SEQUENCE_ENUMERATOR_NEXT_METHOD);
        methods.methods_incorporate_instance_method(PREVIOUS, BASIC_SEQUENCE_ENUMERATOR, $list80, NIL, $list84);
        methods.subloop_register_instance_method(BASIC_SEQUENCE_ENUMERATOR, PREVIOUS, BASIC_SEQUENCE_ENUMERATOR_PREVIOUS_METHOD);
        classes.subloop_new_class(BASIC_SEQUENCE, OBJECT, $list87, NIL, $list88);
        classes.class_set_implements_slot_listeners(BASIC_SEQUENCE, NIL);
        methods.methods_incorporate_instance_method(DEALLOCATE_ENUMERATOR, BASIC_SEQUENCE, $list5, $list30, $list31);
        methods.subloop_register_instance_method(BASIC_SEQUENCE, DEALLOCATE_ENUMERATOR, BASIC_SEQUENCE_DEALLOCATE_ENUMERATOR_METHOD);
        methods.methods_incorporate_instance_method(ALLOCATE_ENUMERATOR, BASIC_SEQUENCE, $list5, NIL, $list28);
        methods.subloop_register_instance_method(BASIC_SEQUENCE, ALLOCATE_ENUMERATOR, BASIC_SEQUENCE_ALLOCATE_ENUMERATOR_METHOD);
        methods.methods_incorporate_instance_method(GET_CONTENTS, BASIC_SEQUENCE, $list5, NIL, $list6);
        methods.subloop_register_instance_method(BASIC_SEQUENCE, GET_CONTENTS, BASIC_SEQUENCE_GET_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method(ADD, BASIC_SEQUENCE, $list5, $list25, $list26);
        methods.subloop_register_instance_method(BASIC_SEQUENCE, ADD, BASIC_SEQUENCE_ADD_METHOD);
        methods.methods_incorporate_instance_method(GET_SUBSEQUENCE, BASIC_SEQUENCE, $list5, $list22, $list23);
        methods.subloop_register_instance_method(BASIC_SEQUENCE, GET_SUBSEQUENCE, BASIC_SEQUENCE_GET_SUBSEQUENCE_METHOD);
        methods.methods_incorporate_instance_method(SET_NTH, BASIC_SEQUENCE, $list5, $list19, $list20);
        methods.subloop_register_instance_method(BASIC_SEQUENCE, SET_NTH, BASIC_SEQUENCE_SET_NTH_METHOD);
        methods.methods_incorporate_instance_method(GET_NTH, BASIC_SEQUENCE, $list5, $list16, $list17);
        methods.subloop_register_instance_method(BASIC_SEQUENCE, GET_NTH, BASIC_SEQUENCE_GET_NTH_METHOD);
        methods.methods_incorporate_instance_method(GET_LENGTH, BASIC_SEQUENCE, $list5, NIL, $list14);
        methods.subloop_register_instance_method(BASIC_SEQUENCE, GET_LENGTH, BASIC_SEQUENCE_GET_LENGTH_METHOD);
        methods.methods_incorporate_instance_method(CLEAR, BASIC_SEQUENCE, $list5, NIL, $list12);
        methods.subloop_register_instance_method(BASIC_SEQUENCE, CLEAR, BASIC_SEQUENCE_CLEAR_METHOD);
        classes.subloop_note_class_initialization_function(BASIC_SEQUENCE, SUBLOOP_RESERVED_INITIALIZE_BASIC_SEQUENCE_CLASS);
        classes.subloop_note_instance_initialization_function(BASIC_SEQUENCE, SUBLOOP_RESERVED_INITIALIZE_BASIC_SEQUENCE_INSTANCE);
        subloop_reserved_initialize_basic_sequence_class(BASIC_SEQUENCE);
        methods.methods_incorporate_instance_method(INITIALIZE, BASIC_SEQUENCE, $list45, NIL, $list104);
        methods.subloop_register_instance_method(BASIC_SEQUENCE, INITIALIZE, BASIC_SEQUENCE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PRINT, BASIC_SEQUENCE, $list5, $list108, $list109);
        methods.subloop_register_instance_method(BASIC_SEQUENCE, PRINT, BASIC_SEQUENCE_PRINT_METHOD);
        methods.methods_incorporate_instance_method(GET_INTERNAL_STORAGE, BASIC_SEQUENCE, $list45, NIL, $list118);
        methods.subloop_register_instance_method(BASIC_SEQUENCE, GET_INTERNAL_STORAGE, BASIC_SEQUENCE_GET_INTERNAL_STORAGE_METHOD);
        methods.methods_incorporate_instance_method(SET_INTERNAL_STORAGE, BASIC_SEQUENCE, $list45, $list121, $list122);
        methods.subloop_register_instance_method(BASIC_SEQUENCE, SET_INTERNAL_STORAGE, BASIC_SEQUENCE_SET_INTERNAL_STORAGE_METHOD);
        methods.methods_incorporate_instance_method(GET_SEQUENCE_CLASS, BASIC_SEQUENCE, $list5, NIL, $list127);
        methods.subloop_register_instance_method(BASIC_SEQUENCE, GET_SEQUENCE_CLASS, BASIC_SEQUENCE_GET_SEQUENCE_CLASS_METHOD);
        methods.methods_incorporate_instance_method(SET_SEQUENCE_CLASS, BASIC_SEQUENCE, $list5, $list131, $list132);
        methods.subloop_register_instance_method(BASIC_SEQUENCE, SET_SEQUENCE_CLASS, BASIC_SEQUENCE_SET_SEQUENCE_CLASS_METHOD);
        interfaces.new_interface(VARIABLE_LENGTH_SEQUENCE, $list8, $list9, $list137);
        interfaces.new_interface(VARIABLE_LENGTH_SEQUENCE_TEMPLATE, $list139, $list140, $list141);
        interfaces.interfaces_add_interface_instance_method(CLEAR, VARIABLE_LENGTH_SEQUENCE_TEMPLATE, $list5, NIL, $list142);
        interfaces.interfaces_add_interface_instance_method(GET_LENGTH, VARIABLE_LENGTH_SEQUENCE_TEMPLATE, $list5, NIL, $list143);
        interfaces.interfaces_add_interface_instance_method(GET_NTH, VARIABLE_LENGTH_SEQUENCE_TEMPLATE, $list5, $list144, $list145);
        interfaces.interfaces_add_interface_instance_method(SET_NTH, VARIABLE_LENGTH_SEQUENCE_TEMPLATE, $list5, $list19, $list146);
        interfaces.interfaces_add_interface_instance_method(GET_SUBSEQUENCE, VARIABLE_LENGTH_SEQUENCE_TEMPLATE, $list5, $list22, $list147);
        interfaces.interfaces_add_interface_instance_method(ADD, VARIABLE_LENGTH_SEQUENCE_TEMPLATE, $list5, $list25, $list148);
        interfaces.interfaces_add_interface_instance_method(ALLOCATE_ENUMERATOR, VARIABLE_LENGTH_SEQUENCE_TEMPLATE, $list5, NIL, $list149);
        interfaces.interfaces_add_interface_instance_method(DEALLOCATE_ENUMERATOR, VARIABLE_LENGTH_SEQUENCE_TEMPLATE, $list5, $list30, $list150);
        interfaces.interfaces_add_interface_instance_method(ALL_NULL_P, VARIABLE_LENGTH_SEQUENCE_TEMPLATE, $list5, NIL, $list152);
        interfaces.interfaces_add_interface_instance_method(INDEX_OF_NEXT_NON_NIL_ELEMENT, VARIABLE_LENGTH_SEQUENCE_TEMPLATE, $list5, $list154, $list155);
        interfaces.interfaces_add_interface_instance_method(INDEX_OF_PREVIOUS_NON_NIL_ELEMENT, VARIABLE_LENGTH_SEQUENCE_TEMPLATE, $list5, $list154, $list157);
        classes.subloop_new_class(BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, OBJECT, $list34, NIL, $list159);
        classes.class_set_implements_slot_listeners(BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, NIL);
        classes.subloop_note_class_initialization_function(BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, $sym162$SUBLOOP_RESERVED_INITIALIZE_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMER);
        classes.subloop_note_instance_initialization_function(BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, $sym163$SUBLOOP_RESERVED_INITIALIZE_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMER);
        subloop_reserved_initialize_basic_variable_length_sequence_enumerator_class(BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR);
        methods.methods_incorporate_instance_method(INITIALIZE, BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, $list45, NIL, $list164);
        methods.subloop_register_instance_method(BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, INITIALIZE, BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(SEEK_NON_NULL_FORWARD, BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, $list45, NIL, $list168);
        methods.subloop_register_instance_method(BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, SEEK_NON_NULL_FORWARD, $sym170$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_SEEK_NON_NULL_FORWARD_M);
        methods.methods_incorporate_instance_method(SEEK_NON_NULL_BACKWARD, BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, $list45, NIL, $list172);
        methods.subloop_register_instance_method(BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, SEEK_NON_NULL_BACKWARD, $sym174$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_SEEK_NON_NULL_BACKWARD_);
        methods.methods_incorporate_instance_method(SET_SEQUENCE, BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, $list5, $list176, $list177);
        methods.subloop_register_instance_method(BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, SET_SEQUENCE, BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_SET_SEQUENCE_METHOD);
        methods.methods_incorporate_instance_method(GET_IGNORE_NULL_VALUES, BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, $list182, NIL, $list183);
        methods.subloop_register_instance_method(BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, GET_IGNORE_NULL_VALUES, $sym184$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_GET_IGNORE_NULL_VALUES_);
        methods.methods_incorporate_instance_method(SET_IGNORE_NULL_VALUES, BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, $list5, $list186, $list187);
        methods.subloop_register_instance_method(BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, SET_IGNORE_NULL_VALUES, $sym189$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_SET_IGNORE_NULL_VALUES_);
        methods.methods_incorporate_instance_method(EMPTY_P, BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, $list5, NIL, $list190);
        methods.subloop_register_instance_method(BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, EMPTY_P, BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_EMPTY_P_METHOD);
        methods.methods_incorporate_instance_method(FIRST_P, BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, $list5, NIL, $list193);
        methods.subloop_register_instance_method(BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, FIRST_P, BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_FIRST_P_METHOD);
        methods.methods_incorporate_instance_method(LAST_P, BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, $list5, NIL, $list196);
        methods.subloop_register_instance_method(BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, LAST_P, BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_LAST_P_METHOD);
        methods.methods_incorporate_instance_method(CURRENT, BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, $list5, NIL, $list199);
        methods.subloop_register_instance_method(BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, CURRENT, BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_CURRENT_METHOD);
        methods.methods_incorporate_instance_method(FIRST, BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, $list80, NIL, $list202);
        methods.subloop_register_instance_method(BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, FIRST, BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_FIRST_METHOD);
        methods.methods_incorporate_instance_method(LAST, BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, $list80, NIL, $list204);
        methods.subloop_register_instance_method(BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, LAST, BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_LAST_METHOD);
        methods.methods_incorporate_instance_method(NEXT, BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, $list80, NIL, $list206);
        methods.subloop_register_instance_method(BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, NEXT, BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_NEXT_METHOD);
        methods.methods_incorporate_instance_method(PREVIOUS, BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, $list80, NIL, $list208);
        methods.subloop_register_instance_method(BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, PREVIOUS, BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_PREVIOUS_METHOD);
        classes.subloop_new_class(BASIC_VARIABLE_LENGTH_SEQUENCE, OBJECT, $list211, NIL, $list212);
        classes.class_set_implements_slot_listeners(BASIC_VARIABLE_LENGTH_SEQUENCE, NIL);
        methods.methods_incorporate_instance_method(INDEX_OF_PREVIOUS_NON_NIL_ELEMENT, BASIC_VARIABLE_LENGTH_SEQUENCE, $list5, $list154, $list157);
        methods.subloop_register_instance_method(BASIC_VARIABLE_LENGTH_SEQUENCE, INDEX_OF_PREVIOUS_NON_NIL_ELEMENT, $sym217$BASIC_VARIABLE_LENGTH_SEQUENCE_INDEX_OF_PREVIOUS_NON_NIL_ELEMENT_);
        methods.methods_incorporate_instance_method(INDEX_OF_NEXT_NON_NIL_ELEMENT, BASIC_VARIABLE_LENGTH_SEQUENCE, $list5, $list154, $list155);
        methods.subloop_register_instance_method(BASIC_VARIABLE_LENGTH_SEQUENCE, INDEX_OF_NEXT_NON_NIL_ELEMENT, $sym218$BASIC_VARIABLE_LENGTH_SEQUENCE_INDEX_OF_NEXT_NON_NIL_ELEMENT_METH);
        methods.methods_incorporate_instance_method(ALL_NULL_P, BASIC_VARIABLE_LENGTH_SEQUENCE, $list5, NIL, $list152);
        methods.subloop_register_instance_method(BASIC_VARIABLE_LENGTH_SEQUENCE, ALL_NULL_P, BASIC_VARIABLE_LENGTH_SEQUENCE_ALL_NULL_P_METHOD);
        methods.methods_incorporate_instance_method(DEALLOCATE_ENUMERATOR, BASIC_VARIABLE_LENGTH_SEQUENCE, $list5, $list30, $list150);
        methods.subloop_register_instance_method(BASIC_VARIABLE_LENGTH_SEQUENCE, DEALLOCATE_ENUMERATOR, BASIC_VARIABLE_LENGTH_SEQUENCE_DEALLOCATE_ENUMERATOR_METHOD);
        methods.methods_incorporate_instance_method(ALLOCATE_ENUMERATOR, BASIC_VARIABLE_LENGTH_SEQUENCE, $list5, NIL, $list149);
        methods.subloop_register_instance_method(BASIC_VARIABLE_LENGTH_SEQUENCE, ALLOCATE_ENUMERATOR, BASIC_VARIABLE_LENGTH_SEQUENCE_ALLOCATE_ENUMERATOR_METHOD);
        methods.methods_incorporate_instance_method(ADD, BASIC_VARIABLE_LENGTH_SEQUENCE, $list5, $list25, $list148);
        methods.subloop_register_instance_method(BASIC_VARIABLE_LENGTH_SEQUENCE, ADD, BASIC_VARIABLE_LENGTH_SEQUENCE_ADD_METHOD);
        methods.methods_incorporate_instance_method(GET_SUBSEQUENCE, BASIC_VARIABLE_LENGTH_SEQUENCE, $list5, $list22, $list147);
        methods.subloop_register_instance_method(BASIC_VARIABLE_LENGTH_SEQUENCE, GET_SUBSEQUENCE, BASIC_VARIABLE_LENGTH_SEQUENCE_GET_SUBSEQUENCE_METHOD);
        methods.methods_incorporate_instance_method(SET_NTH, BASIC_VARIABLE_LENGTH_SEQUENCE, $list5, $list19, $list146);
        methods.subloop_register_instance_method(BASIC_VARIABLE_LENGTH_SEQUENCE, SET_NTH, BASIC_VARIABLE_LENGTH_SEQUENCE_SET_NTH_METHOD);
        methods.methods_incorporate_instance_method(GET_NTH, BASIC_VARIABLE_LENGTH_SEQUENCE, $list5, $list144, $list145);
        methods.subloop_register_instance_method(BASIC_VARIABLE_LENGTH_SEQUENCE, GET_NTH, BASIC_VARIABLE_LENGTH_SEQUENCE_GET_NTH_METHOD);
        methods.methods_incorporate_instance_method(GET_LENGTH, BASIC_VARIABLE_LENGTH_SEQUENCE, $list5, NIL, $list143);
        methods.subloop_register_instance_method(BASIC_VARIABLE_LENGTH_SEQUENCE, GET_LENGTH, BASIC_VARIABLE_LENGTH_SEQUENCE_GET_LENGTH_METHOD);
        methods.methods_incorporate_instance_method(CLEAR, BASIC_VARIABLE_LENGTH_SEQUENCE, $list5, NIL, $list142);
        methods.subloop_register_instance_method(BASIC_VARIABLE_LENGTH_SEQUENCE, CLEAR, BASIC_VARIABLE_LENGTH_SEQUENCE_CLEAR_METHOD);
        classes.subloop_note_class_initialization_function(BASIC_VARIABLE_LENGTH_SEQUENCE, SUBLOOP_RESERVED_INITIALIZE_BASIC_VARIABLE_LENGTH_SEQUENCE_CLASS);
        classes.subloop_note_instance_initialization_function(BASIC_VARIABLE_LENGTH_SEQUENCE, $sym233$SUBLOOP_RESERVED_INITIALIZE_BASIC_VARIABLE_LENGTH_SEQUENCE_INSTAN);
        subloop_reserved_initialize_basic_variable_length_sequence_class(BASIC_VARIABLE_LENGTH_SEQUENCE);
        methods.methods_incorporate_instance_method(INITIALIZE, BASIC_VARIABLE_LENGTH_SEQUENCE, $list45, NIL, $list234);
        methods.subloop_register_instance_method(BASIC_VARIABLE_LENGTH_SEQUENCE, INITIALIZE, BASIC_VARIABLE_LENGTH_SEQUENCE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PRINT, BASIC_VARIABLE_LENGTH_SEQUENCE, $list5, $list108, $list237);
        methods.subloop_register_instance_method(BASIC_VARIABLE_LENGTH_SEQUENCE, PRINT, BASIC_VARIABLE_LENGTH_SEQUENCE_PRINT_METHOD);
        methods.methods_incorporate_instance_method(GET_INTERNAL_STORAGE, BASIC_VARIABLE_LENGTH_SEQUENCE, $list45, NIL, $list118);
        methods.subloop_register_instance_method(BASIC_VARIABLE_LENGTH_SEQUENCE, GET_INTERNAL_STORAGE, BASIC_VARIABLE_LENGTH_SEQUENCE_GET_INTERNAL_STORAGE_METHOD);
        methods.methods_incorporate_instance_method(GET_CONTENTS, BASIC_VARIABLE_LENGTH_SEQUENCE, $list5, NIL, $list243);
        methods.subloop_register_instance_method(BASIC_VARIABLE_LENGTH_SEQUENCE, GET_CONTENTS, BASIC_VARIABLE_LENGTH_SEQUENCE_GET_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method(SET_INTERNAL_STORAGE, BASIC_VARIABLE_LENGTH_SEQUENCE, $list45, $list121, $list246);
        methods.subloop_register_instance_method(BASIC_VARIABLE_LENGTH_SEQUENCE, SET_INTERNAL_STORAGE, BASIC_VARIABLE_LENGTH_SEQUENCE_SET_INTERNAL_STORAGE_METHOD);
        methods.methods_incorporate_instance_method(GET_STORAGE_SIZE, BASIC_VARIABLE_LENGTH_SEQUENCE, $list45, NIL, $list251);
        methods.subloop_register_instance_method(BASIC_VARIABLE_LENGTH_SEQUENCE, GET_STORAGE_SIZE, BASIC_VARIABLE_LENGTH_SEQUENCE_GET_STORAGE_SIZE_METHOD);
        methods.methods_incorporate_instance_method(SET_STORAGE_SIZE, BASIC_VARIABLE_LENGTH_SEQUENCE, $list45, $list255, $list256);
        methods.subloop_register_instance_method(BASIC_VARIABLE_LENGTH_SEQUENCE, SET_STORAGE_SIZE, BASIC_VARIABLE_LENGTH_SEQUENCE_SET_STORAGE_SIZE_METHOD);
        methods.methods_incorporate_instance_method(GET_LARGEST_INDEX, BASIC_VARIABLE_LENGTH_SEQUENCE, $list45, NIL, $list261);
        methods.subloop_register_instance_method(BASIC_VARIABLE_LENGTH_SEQUENCE, GET_LARGEST_INDEX, BASIC_VARIABLE_LENGTH_SEQUENCE_GET_LARGEST_INDEX_METHOD);
        methods.methods_incorporate_instance_method(SET_LARGEST_INDEX, BASIC_VARIABLE_LENGTH_SEQUENCE, $list45, $list265, $list266);
        methods.subloop_register_instance_method(BASIC_VARIABLE_LENGTH_SEQUENCE, SET_LARGEST_INDEX, BASIC_VARIABLE_LENGTH_SEQUENCE_SET_LARGEST_INDEX_METHOD);
        methods.methods_incorporate_instance_method(RECORD_INDEX, BASIC_VARIABLE_LENGTH_SEQUENCE, $list45, $list270, $list271);
        methods.subloop_register_instance_method(BASIC_VARIABLE_LENGTH_SEQUENCE, RECORD_INDEX, BASIC_VARIABLE_LENGTH_SEQUENCE_RECORD_INDEX_METHOD);
        methods.methods_incorporate_instance_method(GET_DEFAULT_VALUE, BASIC_VARIABLE_LENGTH_SEQUENCE, $list5, NIL, $list276);
        methods.subloop_register_instance_method(BASIC_VARIABLE_LENGTH_SEQUENCE, GET_DEFAULT_VALUE, BASIC_VARIABLE_LENGTH_SEQUENCE_GET_DEFAULT_VALUE_METHOD);
        methods.methods_incorporate_instance_method(SET_DEFAULT_VALUE, BASIC_VARIABLE_LENGTH_SEQUENCE, $list5, $list280, $list281);
        methods.subloop_register_instance_method(BASIC_VARIABLE_LENGTH_SEQUENCE, SET_DEFAULT_VALUE, BASIC_VARIABLE_LENGTH_SEQUENCE_SET_DEFAULT_VALUE_METHOD);
        methods.methods_incorporate_instance_method(GET_GROWTH_FACTOR, BASIC_VARIABLE_LENGTH_SEQUENCE, $list5, NIL, $list285);
        methods.subloop_register_instance_method(BASIC_VARIABLE_LENGTH_SEQUENCE, GET_GROWTH_FACTOR, BASIC_VARIABLE_LENGTH_SEQUENCE_GET_GROWTH_FACTOR_METHOD);
        methods.methods_incorporate_instance_method(SET_GROWTH_FACTOR, BASIC_VARIABLE_LENGTH_SEQUENCE, $list5, $list289, $list290);
        methods.subloop_register_instance_method(BASIC_VARIABLE_LENGTH_SEQUENCE, SET_GROWTH_FACTOR, BASIC_VARIABLE_LENGTH_SEQUENCE_SET_GROWTH_FACTOR_METHOD);
        methods.methods_incorporate_instance_method(GET_SEQUENCE_CLASS, BASIC_VARIABLE_LENGTH_SEQUENCE, $list5, NIL, $list127);
        methods.subloop_register_instance_method(BASIC_VARIABLE_LENGTH_SEQUENCE, GET_SEQUENCE_CLASS, BASIC_VARIABLE_LENGTH_SEQUENCE_GET_SEQUENCE_CLASS_METHOD);
        methods.methods_incorporate_instance_method(SET_SEQUENCE_CLASS, BASIC_VARIABLE_LENGTH_SEQUENCE, $list5, $list131, $list297);
        methods.subloop_register_instance_method(BASIC_VARIABLE_LENGTH_SEQUENCE, SET_SEQUENCE_CLASS, BASIC_VARIABLE_LENGTH_SEQUENCE_SET_SEQUENCE_CLASS_METHOD);
        interfaces.new_interface(FIXED_LENGTH_SEQUENCE, $list8, $list9, $list302);
        return NIL;
    }

    static private final SubLList $list_alt208 = list(list(makeSymbol("PUNLESS"), makeSymbol("SEQUENCE"), list(RET, NIL)), list(makeSymbol("PWHEN"), list(makeSymbol("<="), makeSymbol("CURRENT-INDEX"), ZERO_INTEGER), list(RET, NIL)), list(makeSymbol("PIF"), makeSymbol("IGNORE-NULL-VALUES"), list(makeSymbol("CLET"), list(list(makeSymbol("PREVIOUS-INDEX"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SEQUENCE"), list(QUOTE, makeSymbol("INDEX-OF-PREVIOUS-NON-NIL-ELEMENT")), list(makeSymbol("-"), makeSymbol("CURRENT-INDEX"), ONE_INTEGER)))), list(makeSymbol("PIF"), makeSymbol("PREVIOUS-INDEX"), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-INDEX"), makeSymbol("PREVIOUS-INDEX")), list(RET, list(makeSymbol("CURRENT"), makeSymbol("SELF")))), list(RET, NIL))), list(makeSymbol("PROGN"), list(makeSymbol("CDEC"), makeSymbol("CURRENT-INDEX")), list(RET, list(makeSymbol("CURRENT"), makeSymbol("SELF"))))));

    static private final SubLList $list_alt211 = list(makeSymbol("VARIABLE-LENGTH-SEQUENCE-TEMPLATE"));

    static private final SubLList $list_alt212 = list(new SubLObject[]{ list(makeSymbol("INTERNAL-STORAGE"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("STORAGE-SIZE"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("LARGEST-INDEX"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DEFAULT-VALUE"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("GROWTH-FACTOR"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("SEQUENCE-CLASS"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEAR"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-LENGTH"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-NTH"), list(makeSymbol("N"), makeSymbol("&OPTIONAL"), list(makeSymbol("OUT-OF-RANGE-VALUE"), NIL)), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-NTH"), list(makeSymbol("N"), makeSymbol("NEW-VALUE")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SUBSEQUENCE"), list(makeSymbol("START-INDEX"), makeSymbol("&OPTIONAL"), list(makeSymbol("END-INDEX"), NIL)), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONTENTS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-INTERNAL-STORAGE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-INTERNAL-STORAGE"), list(makeSymbol("NEW-INTERNAL-STORAGE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-STORAGE-SIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-STORAGE-SIZE"), list(makeSymbol("NEW-STORAGE-SIZE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-LARGEST-INDEX"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-LARGEST-INDEX"), list(makeSymbol("NEW-LARGEST-INDEX")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RECORD-INDEX"), list(makeSymbol("CURRENT-INDEX")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DEFAULT-VALUE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-DEFAULT-VALUE"), list(makeSymbol("NEW-DEFAULT-VALUE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-GROWTH-FACTOR"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-GROWTH-FACTOR"), list(makeSymbol("NEW-GROWTH-FACTOR")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SEQUENCE-CLASS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SEQUENCE-CLASS"), list(makeSymbol("NEW-CLASS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ALLOCATE-ENUMERATOR"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEALLOCATE-ENUMERATOR"), list(makeSymbol("OLD-ENUMERATOR")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ALL-NULL-P"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INDEX-OF-NEXT-NON-NIL-ELEMENT"), list(makeSymbol("START-INDEX")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INDEX-OF-PREVIOUS-NON-NIL-ELEMENT"), list(makeSymbol("START-INDEX")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")) });

    static private final SubLString $str_alt220$_DEALLOCATE_ENUMERATOR__S____S_is = makeString("(DEALLOCATE-ENUMERATOR ~S): ~S is not an instance BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR.");

    static private final SubLString $str_alt224$_GET_SUBSEQUENCE__S___Index__S_is = makeString("(GET-SUBSEQUENCE ~S): Index ~S is less than zero.  Only non-negative indices are accepted.");

    static private final SubLString $str_alt225$_GET_SUBSEQUENCE__S___End_index__ = makeString("(GET-SUBSEQUENCE ~S): End index ~S exceeds the length ~S of this sequence.");

    static private final SubLString $str_alt227$_SET_NTH__S___Index__S_is_less_th = makeString("(SET-NTH ~S): Index ~S is less than zero.  Only non-negative indices are accepted.");

    static private final SubLList $list_alt234 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("INTERNAL-STORAGE"), list(makeSymbol("MAKE-VECTOR"), TEN_INTEGER, NIL)), list(makeSymbol("CSETQ"), makeSymbol("STORAGE-SIZE"), TEN_INTEGER), list(makeSymbol("CSETQ"), makeSymbol("LARGEST-INDEX"), MINUS_ONE_INTEGER), list(makeSymbol("CSETQ"), makeSymbol("DEFAULT-VALUE"), NIL), list(makeSymbol("CSETQ"), makeSymbol("GROWTH-FACTOR"), TWO_INTEGER), list(makeSymbol("CSETQ"), makeSymbol("SEQUENCE-CLASS"), list(QUOTE, makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE"))), list(RET, makeSymbol("SELF")));

    static private final SubLList $list_alt237 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("PUNLESS"), makeSymbol("LARGEST-INDEX"), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("#<BASIC-VARIABLE-LENGTH-SEQUENCE: UNINITIALIZED>")), list(RET, makeSymbol("SELF"))), list(makeSymbol("PWHEN"), list(makeSymbol("="), makeSymbol("LARGEST-INDEX"), MINUS_ONE_INTEGER), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("[]")), list(RET, makeSymbol("SELF"))), list(makeSymbol("CLET"), list(list(makeSymbol("LENGTH"), list(makeSymbol("+"), makeSymbol("LARGEST-INDEX"), ONE_INTEGER))), list(makeSymbol("PWHEN"), list(makeSymbol("="), makeSymbol("LENGTH"), ZERO_INTEGER), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("[]")), list(RET, makeSymbol("SELF"))), list(makeSymbol("PWHEN"), list(makeSymbol("="), makeSymbol("LENGTH"), ONE_INTEGER), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("[~S]"), list(makeSymbol("AREF"), makeSymbol("INTERNAL-STORAGE"), ZERO_INTEGER)), list(RET, makeSymbol("SELF"))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("[~S"), list(makeSymbol("AREF"), makeSymbol("INTERNAL-STORAGE"), ZERO_INTEGER)), list(makeSymbol("CDOTIMES"), list(makeSymbol("I"), makeSymbol("LARGEST-INDEX")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(", ~S"), list(makeSymbol("AREF"), makeSymbol("INTERNAL-STORAGE"), list(makeSymbol("+"), makeSymbol("I"), ONE_INTEGER)))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("]"))), list(RET, makeSymbol("SELF")));

    static private final SubLString $str_alt239$__BASIC_VARIABLE_LENGTH_SEQUENCE_ = makeString("#<BASIC-VARIABLE-LENGTH-SEQUENCE: UNINITIALIZED>");

    static private final SubLList $list_alt243 = list(list(makeSymbol("PUNLESS"), makeSymbol("INTERNAL-STORAGE"), list(RET, NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("LENGTH"), list(makeSymbol("GET-LENGTH"), makeSymbol("SELF"))), list(makeSymbol("ELEMENT"), NIL), list(makeSymbol("CONTENTS"), NIL)), list(makeSymbol("CDOTIMES"), list(makeSymbol("I"), makeSymbol("LENGTH")), list(makeSymbol("CSETQ"), makeSymbol("ELEMENT"), list(makeSymbol("AREF"), makeSymbol("INTERNAL-STORAGE"), makeSymbol("I"))), list(makeSymbol("PWHEN"), makeSymbol("ELEMENT"), list(makeSymbol("CPUSH"), makeSymbol("ELEMENT"), makeSymbol("CONTENTS")))), list(RET, list(makeSymbol("NREVERSE"), makeSymbol("CONTENTS")))));

    static private final SubLList $list_alt246 = list(list(makeSymbol("MUST"), list(makeSymbol("VECTORP"), makeSymbol("NEW-INTERNAL-STORAGE")), makeString("(SET-INTERNAL-STORAGE ~S): ~S is not a vector."), makeSymbol("SELF"), makeSymbol("NEW-INTERNAL-STORAGE")), list(makeSymbol("CSETQ"), makeSymbol("INTERNAL-STORAGE"), makeSymbol("NEW-INTERNAL-STORAGE")), list(RET, makeSymbol("NEW-INTERNAL-STORAGE")));

    static private final SubLString $str_alt248$_SET_INTERNAL_STORAGE__S____S_is_ = makeString("(SET-INTERNAL-STORAGE ~S): ~S is not a vector.");

    static private final SubLList $list_alt251 = list(list(RET, makeSymbol("STORAGE-SIZE")));

    static private final SubLList $list_alt255 = list(makeSymbol("NEW-STORAGE-SIZE"));

    static private final SubLList $list_alt256 = list(list(makeSymbol("MUST"), list(makeSymbol("CAND"), list(makeSymbol("INTEGERP"), makeSymbol("NEW-STORAGE-SIZE")), list(makeSymbol(">="), makeSymbol("NEW-STORAGE-SIZE"), ZERO_INTEGER)), makeString("(SET-STORAGE-SIZE ~S): ~S is not a valid storage size.  A non-negative integer was expected."), makeSymbol("SELF"), makeSymbol("NEW-STORAGE-SIZE")), list(makeSymbol("CSETQ"), makeSymbol("STORAGE-SIZE"), makeSymbol("NEW-STORAGE-SIZE")), list(RET, makeSymbol("NEW-STORAGE-SIZE")));

    static private final SubLString $str_alt258$_SET_STORAGE_SIZE__S____S_is_not_ = makeString("(SET-STORAGE-SIZE ~S): ~S is not a valid storage size.  A non-negative integer was expected.");

    static private final SubLList $list_alt261 = list(list(RET, makeSymbol("LARGEST-INDEX")));

    static private final SubLList $list_alt265 = list(makeSymbol("NEW-LARGEST-INDEX"));

    static private final SubLList $list_alt266 = list(list(makeSymbol("CSETQ"), makeSymbol("LARGEST-INDEX"), makeSymbol("NEW-LARGEST-INDEX")), list(RET, makeSymbol("NEW-LARGEST-INDEX")));

    static private final SubLList $list_alt270 = list(makeSymbol("CURRENT-INDEX"));

    static private final SubLList $list_alt271 = list(list(makeSymbol("MUST"), list(makeSymbol("CAND"), list(makeSymbol("INTEGERP"), makeSymbol("CURRENT-INDEX")), list(makeSymbol(">="), makeSymbol("CURRENT-INDEX"), ZERO_INTEGER)), makeString("(RECORD-INDEX ~S): ~S is not a valid index.  A non-negative integer was expected."), makeSymbol("SELF"), makeSymbol("CURRENT-INDEX")), list(makeSymbol("CSETQ"), makeSymbol("LARGEST-INDEX"), list(makeSymbol("MAX"), makeSymbol("LARGEST-INDEX"), makeSymbol("CURRENT-INDEX"))), list(RET, makeSymbol("LARGEST-INDEX")));

    static private final SubLString $str_alt273$_RECORD_INDEX__S____S_is_not_a_va = makeString("(RECORD-INDEX ~S): ~S is not a valid index.  A non-negative integer was expected.");

    static private final SubLList $list_alt276 = list(list(RET, makeSymbol("DEFAULT-VALUE")));

    static private final SubLList $list_alt280 = list(makeSymbol("NEW-DEFAULT-VALUE"));

    static private final SubLList $list_alt281 = list(list(makeSymbol("CSETQ"), makeSymbol("DEFAULT-VALUE"), makeSymbol("NEW-DEFAULT-VALUE")), list(RET, makeSymbol("NEW-DEFAULT-VALUE")));

    static private final SubLList $list_alt285 = list(list(RET, makeSymbol("GROWTH-FACTOR")));

    static private final SubLList $list_alt289 = list(makeSymbol("NEW-GROWTH-FACTOR"));

    static private final SubLList $list_alt290 = list(list(makeSymbol("MUST"), list(makeSymbol("CAND"), list(makeSymbol("NUMBERP"), makeSymbol("NEW-GROWTH-FACTOR")), list(makeSymbol(">"), makeSymbol("NEW-GROWTH-FACTOR"), makeDouble(1.0))), makeString("(SET-GROWTH-FACTOR ~S): ~S is not a valid growth factor.  The growth factor must be a number > 1.0."), makeSymbol("SELF"), makeSymbol("NEW-GROWTH-FACTOR")), list(makeSymbol("CSETQ"), makeSymbol("GROWTH-FACTOR"), makeSymbol("NEW-GROWTH-FACTOR")), list(RET, makeSymbol("NEW-GROWTH-FACTOR")));

    static private final SubLString $str_alt293$_SET_GROWTH_FACTOR__S____S_is_not = makeString("(SET-GROWTH-FACTOR ~S): ~S is not a valid growth factor.  The growth factor must be a number > 1.0.");

    static private final SubLList $list_alt297 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-CLASS")), list(makeSymbol("CAND"), list(makeSymbol("SYMBOLP"), makeSymbol("NEW-CLASS")), list(makeSymbol("SUBCLASSP"), makeSymbol("NEW-CLASS"), list(QUOTE, makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE"))))), makeString("(SET-SEQUENCE-CLASS ~S): ~S is not a subclass of BASIC-VARIABLE-LENGTH-SEQUENCE."), makeSymbol("SELF"), makeSymbol("NEW-CLASS")), list(makeSymbol("CSETQ"), makeSymbol("SEQUENCE-CLASS"), makeSymbol("NEW-CLASS")), list(RET, makeSymbol("NEW-CLASS")));

    static private final SubLString $str_alt299$_SET_SEQUENCE_CLASS__S____S_is_no = makeString("(SET-SEQUENCE-CLASS ~S): ~S is not a subclass of BASIC-VARIABLE-LENGTH-SEQUENCE.");

    static private final SubLList $list_alt302 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-LENGTH"), list(makeSymbol("NEW-LENGTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DEFAULT-VALUE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-DEFAULT-VALUE"), list(makeSymbol("NEW-DEFAULT-VALUE")), makeKeyword("PUBLIC")));

    @Override
    public void declareFunctions() {
        declare_subloop_sequences_file();
    }

    @Override
    public void initializeVariables() {
        init_subloop_sequences_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_subloop_sequences_file();
    }

    static {
    }
}

/**
 * Total time: 1378 ms
 */
