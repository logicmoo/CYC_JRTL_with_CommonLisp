/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cfasl.cfasl_input;
import static com.cyc.cycjava.cycl.cfasl.cfasl_output;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.eval;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.intern;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.make_symbol;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_package;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.symbolp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.set_aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.bytes;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class object extends SubLTranslatedFile implements V12 {
    static private final SubLString $str_alt19$ = makeString("");

    public static final SubLFile me = new object();

 public static final String myName = "com.cyc.cycjava.cycl.object";


    static private final SubLList $list1 = list(new SubLObject[]{ list(makeSymbol("INSTANCE-COUNT"), makeKeyword("CLASS"), makeKeyword("VALUE"), ZERO_INTEGER, makeKeyword("PROTECTED")), list(makeSymbol("ISOLATED-P"), makeKeyword("BOOLEAN"), makeKeyword("PUBLIC")), list(makeSymbol("INSTANCE-NUMBER"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("NEW"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("CLASS-OF"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("DESCRIBE-CLASS"), list(makeSymbol("&OPTIONAL"), list(makeSymbol("STREAM"), T), list(makeSymbol("DEPTH"), ZERO_INTEGER)), makeKeyword("PUBLIC")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("PARENT-CLASS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("CHILD-CLASSES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("IMPLEMENTS-METHOD-P"), list(makeSymbol("METHOD-NAME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("METHOD-LAMBDA-LIST"), list(makeSymbol("METHOD-NAME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("HAS-SLOT-P"), list(makeSymbol("SLOT-NAME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("ON-DESTROY-CLASS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("CFASL-INPUT"), list(makeSymbol("STREAM")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), EQUAL, list(makeSymbol("OBJECT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ESSENTIALLY-EQUAL"), list(makeSymbol("OBJECT"), makeSymbol("&OPTIONAL"), list(makeSymbol("IGNORE-SLOTS"), NIL)), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLONE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DESCRIBE-INSTANCE"), list(makeSymbol("&OPTIONAL"), list(makeSymbol("STREAM"), T), list(makeSymbol("DEPTH"), ZERO_INTEGER)), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CFASL-OUTPUT"), list(makeSymbol("STREAM")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-GET-SLOT-LISTENER"), list(makeSymbol("TARGET-INSTANCE"), makeSymbol("TARGET-SLOT"), makeSymbol("MY-METHOD")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-GET-SLOT-LISTENER-STIMULATED-BY-VALUE"), list(makeSymbol("TARGET-INSTANCE"), makeSymbol("TARGET-SLOT"), makeSymbol("MY-METHOD"), makeSymbol("TRIGGER-VALUE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-GET-SLOT-LISTENER-STIMULATED-BY-RANGE"), list(makeSymbol("TARGET-INSTANCE"), makeSymbol("TARGET-SLOT"), makeSymbol("MY-METHOD"), makeSymbol("TRIGGER-VALUE-LOWER-BOUND"), makeSymbol("TRIGGER-VALUE-UPPER-BOUND")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-GET-SLOT-LISTENER-STIMULATED-BY-ENUM"), list(makeSymbol("TARGET-INSTANCE"), makeSymbol("TARGET-SLOT"), makeSymbol("MY-METHOD"), makeSymbol("TRIGGER-ENUMERATION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-SET-SLOT-LISTENER"), list(makeSymbol("TARGET-INSTANCE"), makeSymbol("TARGET-SLOT"), makeSymbol("MY-METHOD")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-SET-SLOT-LISTENER-STIMULATED-BY-VALUE"), list(makeSymbol("TARGET-INSTANCE"), makeSymbol("TARGET-SLOT"), makeSymbol("MY-METHOD"), makeSymbol("TRIGGER-VALUE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-SET-SLOT-LISTENER-STIMULATED-BY-RANGE"), list(makeSymbol("TARGET-INSTANCE"), makeSymbol("TARGET-SLOT"), makeSymbol("MY-METHOD"), makeSymbol("TRIGGER-VALUE-LOWER-BOUND"), makeSymbol("TRIGGER-VALUE-UPPER-BOUND")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-SET-SLOT-LISTENER-STIMULATED-BY-ENUM"), list(makeSymbol("TARGET-INSTANCE"), makeSymbol("TARGET-SLOT"), makeSymbol("MY-METHOD"), makeSymbol("TRIGGER-ENUMERATION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-ALL-GET-SLOT-LISTENERS"), list(makeSymbol("TARGET-INSTANCE"), makeSymbol("&OPTIONAL"), list(makeSymbol("TARGET-SLOT"), NIL)), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-ALL-SET-SLOT-LISTENERS"), list(makeSymbol("TARGET-INSTANCE"), makeSymbol("&OPTIONAL"), list(makeSymbol("TARGET-SLOT"), NIL)), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-ALL-SLOT-LISTENERS"), list(makeSymbol("TARGET-INSTANCE"), makeSymbol("&OPTIONAL"), list(makeSymbol("TARGET-SLOT"), NIL)), makeKeyword("PUBLIC")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("ADD-CLASS-WIDE-BEFORE-METHOD-LISTENER"), list(makeSymbol("CLASS"), makeSymbol("TARGET-METHOD"), makeSymbol("MY-METHOD")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("ADD-CLASS-WIDE-AFTER-METHOD-LISTENER"), list(makeSymbol("CLASS"), makeSymbol("TARGET-METHOD"), makeSymbol("MY-METHOD")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("REMOVE-ALL-CLASS-WIDE-METHOD-LISTENERS"), list(makeSymbol("MONITORED-INSTANCE"), makeSymbol("&OPTIONAL"), list(makeSymbol("TARGET-METHOD"), NIL)), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ISOLATE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PLISTIFY"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LISTIFY"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ASSIMILATE"), list(makeSymbol("PLISTIFIED-CONTENT")), makeKeyword("PUBLIC")) });

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_OBJECT_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-OBJECT-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_OBJECT_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-OBJECT-INSTANCE");

    static private final SubLList $list9 = list(makeKeyword("AUTO-UPDATE"));

    static private final SubLList $list10 = list(list(makeSymbol("PIF"), makeSymbol("INSTANCE-COUNT"), list(makeSymbol("CINC"), makeSymbol("INSTANCE-COUNT")), list(makeSymbol("CSETQ"), makeSymbol("INSTANCE-COUNT"), ZERO_INTEGER)), list(makeSymbol("CLET"), list(list(makeSymbol("INSTANCE"), list(makeSymbol("NEW-INSTANCE"), makeSymbol("SELF")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("INSTANCE"), list(QUOTE, makeSymbol("INITIALIZE"))), list(RET, makeSymbol("INSTANCE"))));

    private static final SubLSymbol OBJECT_NEW_METHOD = makeSymbol("OBJECT-NEW-METHOD");

    static private final SubLList $list14 = list(list(RET, makeSymbol("SELF")));

    private static final SubLSymbol OBJECT_CLASS_OF_METHOD = makeSymbol("OBJECT-CLASS-OF-METHOD");

    private static final SubLSymbol DESCRIBE_CLASS = makeSymbol("DESCRIBE-CLASS");

    static private final SubLList $list17 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("STREAM"), T), list(makeSymbol("DEPTH"), ZERO_INTEGER));

    static private final SubLList $list18 = list(list(makeSymbol("CLET"), list(list(makeSymbol("ALL-CLASS-SLOTS"), list(makeSymbol("CLASSES-ALL-CLASS-SLOTS"), makeSymbol("SELF"))), list(makeSymbol("TAB"), list(makeSymbol("FIF"), list(makeSymbol("ZEROP"), makeSymbol("DEPTH")), makeString(""), list(makeSymbol("MAKE-STRING"), list(makeSymbol("*"), makeSymbol("DEPTH"), TWO_INTEGER)))), list(makeSymbol("SLOT-TAB"), list(makeSymbol("FIF"), list(makeSymbol("ZEROP"), makeSymbol("DEPTH")), makeString("  "), list(makeSymbol("MAKE-STRING"), list(makeSymbol("+"), list(makeSymbol("*"), makeSymbol("DEPTH"), TWO_INTEGER), TWO_INTEGER))))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("~%~ADescription of class ~S:"), makeSymbol("TAB"), list(makeSymbol("CLASS-NAME"), makeSymbol("SELF"))), list(makeSymbol("CDOLIST"), list(makeSymbol("CLASS-SLOT"), makeSymbol("ALL-CLASS-SLOTS")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("~%~A~S -> ~S"), makeSymbol("SLOT-TAB"), makeSymbol("CLASS-SLOT"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), makeSymbol("CLASS-SLOT")))), list(RET, makeSymbol("SELF"))));

    static private final SubLString $str19$ = makeString("");

    static private final SubLString $$$__ = makeString("  ");

    static private final SubLString $str21$___ADescription_of_class__S_ = makeString("~%~ADescription of class ~S:");

    static private final SubLString $str22$___A_S_____S = makeString("~%~A~S -> ~S");

    private static final SubLSymbol OBJECT_DESCRIBE_CLASS_METHOD = makeSymbol("OBJECT-DESCRIBE-CLASS-METHOD");

    private static final SubLSymbol PARENT_CLASS = makeSymbol("PARENT-CLASS");

    static private final SubLList $list25 = list(list(makeSymbol("CLET"), list(list(makeSymbol("COMPILED-INHERITANCE-PATH"), list(makeSymbol("CLASS-COMPILED-INHERITANCE-PATH"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("COMPILED-INHERITANCE-PATH"), list(makeSymbol("CDR"), makeSymbol("COMPILED-INHERITANCE-PATH"))), list(RET, list(makeSymbol("CADR"), makeSymbol("COMPILED-INHERITANCE-PATH")))), list(RET, NIL)));

    private static final SubLSymbol OBJECT_PARENT_CLASS_METHOD = makeSymbol("OBJECT-PARENT-CLASS-METHOD");

    private static final SubLSymbol CHILD_CLASSES = makeSymbol("CHILD-CLASSES");

    static private final SubLList $list28 = list(list(makeSymbol("CLET"), list(list(makeSymbol("SUBCLASS-NAMES"), list(makeSymbol("CLASS-SUBCLASSES"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("SUBCLASS-NAMES"), list(makeSymbol("CLET"), list(list(makeSymbol("SUBCLASSES"), NIL), list(makeSymbol("SUBCLASS"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("SUBCLASS-NAME"), makeSymbol("SUBCLASS-NAMES")), list(makeSymbol("CSETQ"), makeSymbol("SUBCLASS"), list(makeSymbol("CLASSES-RETRIEVE-CLASS"), makeSymbol("SUBCLASS-NAME"))), list(makeSymbol("PWHEN"), makeSymbol("SUBCLASS"), list(makeSymbol("CPUSH"), makeSymbol("SUBCLASS"), makeSymbol("SUBCLASSES")))), list(RET, list(makeSymbol("NREVERSE"), makeSymbol("SUBCLASSES"))))), list(RET, NIL)));

    private static final SubLSymbol OBJECT_CHILD_CLASSES_METHOD = makeSymbol("OBJECT-CHILD-CLASSES-METHOD");

    private static final SubLSymbol IMPLEMENTS_METHOD_P = makeSymbol("IMPLEMENTS-METHOD-P");

    static private final SubLList $list31 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list32 = list(makeSymbol("METHOD-NAME"));

    static private final SubLList $list33 = list(list(makeSymbol("CLET"), list(list(makeSymbol("MY-CLASS"), list(makeSymbol("FIF"), list(makeSymbol("CLASS-P"), makeSymbol("SELF")), makeSymbol("SELF"), list(makeSymbol("INSTANCE-CLASS"), makeSymbol("SELF")))), list(makeSymbol("INSTANCE-METHOD-ACCESS-LIST"), list(makeSymbol("CLASS-COMPILED-INSTANCE-METHOD-ACCESS-ALIST"), makeSymbol("MY-CLASS"))), list(makeSymbol("CLASS-METHOD-ACCESS-LIST"), list(makeSymbol("CLASS-COMPILED-CLASS-METHOD-ACCESS-ALIST"), makeSymbol("MY-CLASS")))), list(RET, list(makeSymbol("FIF"), list(makeSymbol("METHOD-ASSOC"), makeSymbol("METHOD-NAME"), makeSymbol("INSTANCE-METHOD-ACCESS-LIST")), T, list(makeSymbol("FIF"), list(makeSymbol("METHOD-ASSOC"), makeSymbol("METHOD-NAME"), makeSymbol("CLASS-METHOD-ACCESS-LIST")), T, NIL)))));

    private static final SubLSymbol OBJECT_IMPLEMENTS_METHOD_P_METHOD = makeSymbol("OBJECT-IMPLEMENTS-METHOD-P-METHOD");

    private static final SubLSymbol METHOD_LAMBDA_LIST = makeSymbol("METHOD-LAMBDA-LIST");

    static private final SubLList $list36 = list(list(makeSymbol("CLET"), list(list(makeSymbol("METHOD"), list(makeSymbol("METHOD-ASSOC"), makeSymbol("METHOD-NAME"), list(makeSymbol("CLASS-COMPILED-INSTANCE-METHOD-ACCESS-ALIST"), makeSymbol("SELF"))))), list(makeSymbol("PUNLESS"), makeSymbol("METHOD"), list(makeSymbol("CSETQ"), makeSymbol("METHOD"), list(makeSymbol("METHOD-ASSOC"), makeSymbol("METHOD-NAME"), list(makeSymbol("CLASS-COMPILED-CLASS-METHOD-ACCESS-ALIST"), makeSymbol("SELF"))))), list(RET, list(makeSymbol("METHOD-LAMBDA-LIST"), makeSymbol("METHOD")))));

    private static final SubLSymbol OBJECT_METHOD_LAMBDA_LIST_METHOD = makeSymbol("OBJECT-METHOD-LAMBDA-LIST-METHOD");

    private static final SubLSymbol HAS_SLOT_P = makeSymbol("HAS-SLOT-P");

    static private final SubLList $list39 = list(makeSymbol("SLOT-NAME"));

    static private final SubLList $list40 = list(list(makeSymbol("CLET"), list(list(makeSymbol("SLOT"), list(makeSymbol("SLOT-ASSOC"), makeSymbol("SLOT-NAME"), list(makeSymbol("CLASS-COMPILED-INSTANCE-SLOT-ACCESS-ALIST"), makeSymbol("SELF"))))), list(makeSymbol("PUNLESS"), makeSymbol("SLOT"), list(makeSymbol("CSETQ"), makeSymbol("SLOT"), list(makeSymbol("SLOT-ASSOC"), makeSymbol("SLOT-NAME"), list(makeSymbol("CLASS-COMPILED-CLASS-SLOT-ACCESS-ALIST"), makeSymbol("SELF")))), list(makeSymbol("PUNLESS"), makeSymbol("SLOT"), list(makeSymbol("CSETQ"), makeSymbol("SLOT"), list(makeSymbol("SLOT-ASSOC"), makeSymbol("SLOT-NAME"), list(makeSymbol("CLASS-COMPILED-INSTANCE-BOOLEAN-SLOT-ACCESS-ALIST"), makeSymbol("SELF")))), list(makeSymbol("PUNLESS"), makeSymbol("SLOT"), list(makeSymbol("CSETQ"), makeSymbol("SLOT"), list(makeSymbol("SLOT-ASSOC"), makeSymbol("SLOT-NAME"), list(makeSymbol("CLASS-COMPILED-CLASS-BOOLEAN-SLOT-ACCESS-ALIST"), makeSymbol("SELF"))))))), list(RET, list(makeSymbol("FIF"), makeSymbol("SLOT"), T, NIL))));

    private static final SubLSymbol OBJECT_HAS_SLOT_P_METHOD = makeSymbol("OBJECT-HAS-SLOT-P-METHOD");

    private static final SubLSymbol ON_DESTROY_CLASS = makeSymbol("ON-DESTROY-CLASS");

    private static final SubLSymbol OBJECT_ON_DESTROY_CLASS_METHOD = makeSymbol("OBJECT-ON-DESTROY-CLASS-METHOD");

    static private final SubLList $list45 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list46 = list(makeSymbol("STREAM"));

    static private final SubLList $list47 = list(makeString("This is called by @xref CFASL-INPUT-INSTANCE.  Not meant to be called directly.\n   Use the public function @xref CFASL-INPUT or the like.\n   @owner bgottesm"), list(makeSymbol("CLET"), list(list(makeSymbol("CLASS-NAME"), list(makeSymbol("CLASS-NAME"), makeSymbol("SELF"))), list(makeSymbol("INSTANCE"), list(makeSymbol("NEW-CLASS-INSTANCE"), makeSymbol("SELF"))), list(makeSymbol("NUMBER-OF-SLOTS"), list(makeSymbol("CFASL-INPUT"), makeSymbol("STREAM"))), makeSymbol("SLOT-NAME"), makeSymbol("SLOT-VALUE")), list(makeSymbol("CHECK-TYPE"), makeSymbol("NUMBER-OF-SLOTS"), makeSymbol("INTEGERP")), list(makeSymbol("CDOTIMES"), list(makeSymbol("I"), makeSymbol("NUMBER-OF-SLOTS")), list(makeSymbol("CSETQ"), makeSymbol("SLOT-NAME"), list(makeSymbol("CFASL-INPUT"), makeSymbol("STREAM")), makeSymbol("SLOT-VALUE"), list(makeSymbol("CFASL-INPUT"), makeSymbol("STREAM"))), list(makeSymbol("CHECK-TYPE"), makeSymbol("SLOT-NAME"), makeSymbol("SYMBOLP")), list(makeSymbol("EVAL"), list(makeSymbol("BQ-LIST"), list(QUOTE, makeSymbol("INLINE-SET-SLOT")), list(makeSymbol("BQ-LIST"), makeSymbol("SLOT-NAME"), makeSymbol("CLASS-NAME")), makeSymbol("INSTANCE"), list(makeSymbol("BQ-LIST"), list(QUOTE, QUOTE), makeSymbol("SLOT-VALUE"))))), list(RET, makeSymbol("INSTANCE"))));

    private static final SubLSymbol OBJECT_CFASL_INPUT_METHOD = makeSymbol("OBJECT-CFASL-INPUT-METHOD");

    static private final SubLList $list53 = list(list(makeSymbol("CSETQ"), makeSymbol("ISOLATED-P"), NIL), list(makeSymbol("CSETQ"), makeSymbol("INSTANCE-NUMBER"), makeSymbol("INSTANCE-COUNT")), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol OBJECT_INITIALIZE_METHOD = makeSymbol("OBJECT-INITIALIZE-METHOD");

    static private final SubLList $list56 = list(makeSymbol("STREAM"), makeSymbol("DEPTH"));

    static private final SubLList $list57 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("PIF"), list(makeSymbol("INSTANCE-P"), makeSymbol("SELF")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("#<~S-~S>"), list(makeSymbol("CLASS-NAME"), list(makeSymbol("INSTANCE-CLASS"), makeSymbol("SELF"))), makeSymbol("INSTANCE-NUMBER")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("#<Malformed Instance>"))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym58$OUTER_CATCH_FOR_OBJECT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-OBJECT-METHOD");

    static private final SubLString $str59$___S__S_ = makeString("#<~S-~S>");

    static private final SubLString $str60$__Malformed_Instance_ = makeString("#<Malformed Instance>");

    private static final SubLSymbol OBJECT_PRINT_METHOD = makeSymbol("OBJECT-PRINT-METHOD");

    static private final SubLList $list62 = list(makeSymbol("OBJECT"));

    static private final SubLList $list63 = list(list(RET, list(EQ, makeSymbol("SELF"), makeSymbol("OBJECT"))));

    private static final SubLSymbol OBJECT_EQUAL_METHOD = makeSymbol("OBJECT-EQUAL-METHOD");

    private static final SubLSymbol ESSENTIALLY_EQUAL = makeSymbol("ESSENTIALLY-EQUAL");

    static private final SubLList $list66 = list(makeSymbol("OBJECT"), makeSymbol("&OPTIONAL"), list(makeSymbol("IGNORE-SLOTS"), NIL));

    static private final SubLList $list67 = list(list(makeSymbol("CLET"), list(list(makeSymbol("CLASS"), list(makeSymbol("INSTANCE-CLASS"), makeSymbol("SELF")))), list(makeSymbol("WITH-CLASS"), makeSymbol("CLASS"), list(makeSymbol("CDO-ESSENTIAL-SLOTS"), list(makeSymbol("SLOT-NAME"), NIL, NIL, NIL, NIL, makeSymbol("COMPILED-CLASS-SLOT-ACCESS-ALIST")), list(makeSymbol("PUNLESS"), list(makeSymbol("MEMBER"), makeSymbol("SLOT-NAME"), makeSymbol("IGNORE-SLOTS")), list(makeSymbol("PUNLESS"), list(EQUAL, list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), makeSymbol("SLOT-NAME")), list(makeSymbol("GET-SLOT"), makeSymbol("OBJECT"), makeSymbol("SLOT-NAME"))), list(RET, NIL)))), list(makeSymbol("CDO-ESSENTIAL-SLOTS"), list(makeSymbol("SLOT-NAME"), NIL, NIL, NIL, NIL, makeSymbol("COMPILED-CLASS-BOOLEAN-SLOT-ACCESS-ALIST")), list(makeSymbol("PUNLESS"), list(makeSymbol("MEMBER"), makeSymbol("SLOT-NAME"), makeSymbol("IGNORE-SLOTS")), list(makeSymbol("PUNLESS"), list(EQUAL, list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), makeSymbol("SLOT-NAME")), list(makeSymbol("GET-SLOT"), makeSymbol("OBJECT"), makeSymbol("SLOT-NAME"))), list(RET, NIL)))), list(makeSymbol("CDO-ESSENTIAL-SLOTS"), list(makeSymbol("SLOT-NAME"), NIL, NIL, NIL, NIL, makeSymbol("COMPILED-INSTANCE-SLOT-ACCESS-ALIST")), list(makeSymbol("PUNLESS"), list(makeSymbol("MEMBER"), makeSymbol("SLOT-NAME"), makeSymbol("IGNORE-SLOTS")), list(makeSymbol("PUNLESS"), list(EQUAL, list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), makeSymbol("SLOT-NAME")), list(makeSymbol("GET-SLOT"), makeSymbol("OBJECT"), makeSymbol("SLOT-NAME"))), list(RET, NIL)))), list(makeSymbol("CDO-ESSENTIAL-SLOTS"), list(makeSymbol("SLOT-NAME"), NIL, NIL, NIL, NIL, makeSymbol("COMPILED-INSTANCE-BOOLEAN-SLOT-ACCESS-ALIST")), list(makeSymbol("PUNLESS"), list(makeSymbol("MEMBER"), makeSymbol("SLOT-NAME"), makeSymbol("IGNORE-SLOTS")), list(makeSymbol("PUNLESS"), list(EQUAL, list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), makeSymbol("SLOT-NAME")), list(makeSymbol("GET-SLOT"), makeSymbol("OBJECT"), makeSymbol("SLOT-NAME"))), list(RET, NIL))))), list(RET, T)));

    private static final SubLSymbol OBJECT_ESSENTIALLY_EQUAL_METHOD = makeSymbol("OBJECT-ESSENTIALLY-EQUAL-METHOD");

    static private final SubLList $list70 = list(list(makeSymbol("CLET"), list(list(makeSymbol("CLASS-OF-SELF"), list(makeSymbol("INSTANCE-CLASS"), makeSymbol("SELF")))), list(RET, list(makeSymbol("FUNCALL-CLASS-METHOD"), makeSymbol("CLASS-OF-SELF"), list(QUOTE, makeSymbol("NEW"))))));

    private static final SubLSymbol OBJECT_CLONE_METHOD = makeSymbol("OBJECT-CLONE-METHOD");

    static private final SubLList $list73 = list(list(makeSymbol("CLET"), list(list(makeSymbol("ALL-INSTANCE-SLOTS"), list(makeSymbol("INSTANCES-ALL-INSTANCE-SLOTS"), makeSymbol("SELF"))), list(makeSymbol("TAB"), list(makeSymbol("FIF"), list(makeSymbol("ZEROP"), makeSymbol("DEPTH")), makeString(""), list(makeSymbol("MAKE-STRING"), list(makeSymbol("*"), makeSymbol("DEPTH"), TWO_INTEGER)))), list(makeSymbol("SLOT-TAB"), list(makeSymbol("FIF"), list(makeSymbol("ZEROP"), makeSymbol("DEPTH")), makeString("  "), list(makeSymbol("MAKE-STRING"), list(makeSymbol("+"), list(makeSymbol("*"), makeSymbol("DEPTH"), TWO_INTEGER), TWO_INTEGER))))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("~%~ADescription of instance ~S:"), makeSymbol("TAB"), makeSymbol("SELF")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("DESCRIBE-CLASS")), makeSymbol("STREAM"), list(makeSymbol("1+"), makeSymbol("DEPTH"))), list(makeSymbol("CDOLIST"), list(makeSymbol("INSTANCE-SLOT"), makeSymbol("ALL-INSTANCE-SLOTS")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("~%~A~S -> ~S"), makeSymbol("SLOT-TAB"), makeSymbol("INSTANCE-SLOT"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), makeSymbol("INSTANCE-SLOT")))), list(RET, makeSymbol("SELF"))));

    static private final SubLString $str74$___ADescription_of_instance__S_ = makeString("~%~ADescription of instance ~S:");

    private static final SubLSymbol OBJECT_DESCRIBE_INSTANCE_METHOD = makeSymbol("OBJECT-DESCRIBE-INSTANCE-METHOD");

    static private final SubLList $list77 = list(makeKeyword("NO-MEMBER-VARIABLES"), makeKeyword("PROTECTED"));

    static private final SubLList $list78 = list(makeString("This is called by @xref CFASL-OUTPUT-OBJECT.  It is not meant to be called directly.\n   Use the public function @xref CFASL-OUTPUT or the like.\n   @owner bgottesm"), list(makeSymbol("CLET"), list(list(makeSymbol("CLASS"), list(makeSymbol("INSTANCE-CLASS"), makeSymbol("SELF"))), list(makeSymbol("CLASS-NAME"), list(makeSymbol("CLASS-NAME"), makeSymbol("CLASS")))), list(makeSymbol("CFASL-OUTPUT"), makeSymbol("CLASS-NAME"), makeSymbol("STREAM")), list(makeSymbol("WITH-CLASS"), makeSymbol("CLASS"), list(makeSymbol("CLET"), list(list(makeSymbol("INSTANCE-SLOTS"), list(makeSymbol("APPEND"), makeSymbol("COMPILED-INSTANCE-SLOT-ACCESS-ALIST"), makeSymbol("COMPILED-INSTANCE-BOOLEAN-SLOT-ACCESS-ALIST")))), list(makeSymbol("CSETQ"), makeSymbol("INSTANCE-SLOTS"), list(makeSymbol("DELETE"), list(QUOTE, makeSymbol("INSTANCE-NUMBER")), makeSymbol("INSTANCE-SLOTS"), list(makeSymbol("FUNCTION"), EQ), list(QUOTE, makeSymbol("SLOT-NAME")))), list(makeSymbol("CLET"), list(list(makeSymbol("NUMBER-OF-SLOTS"), list(makeSymbol("LENGTH"), makeSymbol("INSTANCE-SLOTS")))), list(makeSymbol("CFASL-OUTPUT"), makeSymbol("NUMBER-OF-SLOTS"), makeSymbol("STREAM")), list(makeSymbol("CDOSLOTS"), list(makeSymbol("SLOT-NAME"), NIL, NIL, NIL, NIL, makeSymbol("INSTANCE-SLOTS")), list(makeSymbol("CFASL-OUTPUT"), makeSymbol("SLOT-NAME"), makeSymbol("STREAM")), list(makeSymbol("CFASL-OUTPUT"), list(makeSymbol("EVAL"), list(makeSymbol("BQ-LIST"), list(QUOTE, makeSymbol("INLINE-GET-SLOT")), list(makeSymbol("BQ-LIST"), makeSymbol("SLOT-NAME"), makeSymbol("CLASS-NAME")), makeSymbol("SELF"))), makeSymbol("STREAM"))))))), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol OBJECT_CFASL_OUTPUT_METHOD = makeSymbol("OBJECT-CFASL-OUTPUT-METHOD");

    private static final SubLSymbol ADD_GET_SLOT_LISTENER = makeSymbol("ADD-GET-SLOT-LISTENER");

    static private final SubLList $list83 = list(makeSymbol("TARGET-INSTANCE"), makeSymbol("TARGET-SLOT"), makeSymbol("MY-METHOD"));

    static private final SubLList $list84 = list(list(makeSymbol("MUST"), list(makeSymbol("INSTANCE-P"), makeSymbol("TARGET-INSTANCE")), makeString("(ADD-GET-SLOT-LISTENER OBJECT): target instance ~S is not an instance."), makeSymbol("TARGET-INSTANCE")), list(makeSymbol("MUST"), list(makeSymbol("SYMBOLP"), makeSymbol("TARGET-SLOT")), makeString("(ADD-GET-SLOT-LISTENER OBJECT): target slot ~S is not a slot."), makeSymbol("TARGET-SLOT")), list(makeSymbol("MUST"), list(makeSymbol("SYMBOLP"), makeSymbol("MY-METHOD")), makeString("(ADD-GET-SLOT-LISTENER OBJECT): method ~S is not a method."), makeSymbol("MY-METHOD")), list(makeSymbol("ADD-GENERIC-SLOT-LISTENER"), makeSymbol("TARGET-INSTANCE"), makeSymbol("TARGET-SLOT"), makeKeyword("GET"), makeSymbol("MY-METHOD"), makeSymbol("SELF")), list(RET, makeSymbol("MY-METHOD")));

    static private final SubLString $str85$_ADD_GET_SLOT_LISTENER_OBJECT___t = makeString("(ADD-GET-SLOT-LISTENER OBJECT): target instance ~S is not an instance.");

    static private final SubLString $str86$_ADD_GET_SLOT_LISTENER_OBJECT___t = makeString("(ADD-GET-SLOT-LISTENER OBJECT): target slot ~S is not a slot.");

    static private final SubLString $str87$_ADD_GET_SLOT_LISTENER_OBJECT___m = makeString("(ADD-GET-SLOT-LISTENER OBJECT): method ~S is not a method.");

    private static final SubLSymbol OBJECT_ADD_GET_SLOT_LISTENER_METHOD = makeSymbol("OBJECT-ADD-GET-SLOT-LISTENER-METHOD");

    private static final SubLSymbol ADD_GET_SLOT_LISTENER_STIMULATED_BY_VALUE = makeSymbol("ADD-GET-SLOT-LISTENER-STIMULATED-BY-VALUE");

    static private final SubLList $list91 = list(makeSymbol("TARGET-INSTANCE"), makeSymbol("TARGET-SLOT"), makeSymbol("MY-METHOD"), makeSymbol("TRIGGER-VALUE"));

    static private final SubLList $list92 = list(list(makeSymbol("MUST"), list(makeSymbol("INSTANCE-P"), makeSymbol("TARGET-INSTANCE")), makeString("(ADD-GET-SLOT-LISTENER-STIMULATED-BY-VALUE OBJECT): target instance ~S is not an instance."), makeSymbol("TARGET-INSTANCE")), list(makeSymbol("MUST"), list(makeSymbol("SYMBOLP"), makeSymbol("TARGET-SLOT")), makeString("(ADD-GET-SLOT-LISTENER-STIMULATED-BY-VALUE OBJECT): target slot ~S is not a slot."), makeSymbol("TARGET-SLOT")), list(makeSymbol("MUST"), list(makeSymbol("SYMBOLP"), makeSymbol("MY-METHOD")), makeString("(ADD-GET-SLOT-LISTENER-STIMULATED-BY-VALUE OBJECT): method ~S is not a method."), makeSymbol("MY-METHOD")), list(makeSymbol("ADD-GENERIC-SLOT-LISTENER-STIMULATED-BY-VALUE"), makeSymbol("TARGET-INSTANCE"), makeSymbol("TARGET-SLOT"), makeKeyword("GET"), makeSymbol("MY-METHOD"), makeSymbol("SELF"), makeSymbol("TRIGGER-VALUE")), list(RET, makeSymbol("MY-METHOD")));

    static private final SubLString $str93$_ADD_GET_SLOT_LISTENER_STIMULATED = makeString("(ADD-GET-SLOT-LISTENER-STIMULATED-BY-VALUE OBJECT): target instance ~S is not an instance.");

    static private final SubLString $str94$_ADD_GET_SLOT_LISTENER_STIMULATED = makeString("(ADD-GET-SLOT-LISTENER-STIMULATED-BY-VALUE OBJECT): target slot ~S is not a slot.");

    static private final SubLString $str95$_ADD_GET_SLOT_LISTENER_STIMULATED = makeString("(ADD-GET-SLOT-LISTENER-STIMULATED-BY-VALUE OBJECT): method ~S is not a method.");

    private static final SubLSymbol OBJECT_ADD_GET_SLOT_LISTENER_STIMULATED_BY_VALUE_METHOD = makeSymbol("OBJECT-ADD-GET-SLOT-LISTENER-STIMULATED-BY-VALUE-METHOD");

    private static final SubLSymbol ADD_GET_SLOT_LISTENER_STIMULATED_BY_RANGE = makeSymbol("ADD-GET-SLOT-LISTENER-STIMULATED-BY-RANGE");

    static private final SubLList $list98 = list(makeSymbol("TARGET-INSTANCE"), makeSymbol("TARGET-SLOT"), makeSymbol("MY-METHOD"), makeSymbol("TRIGGER-VALUE-LOWER-BOUND"), makeSymbol("TRIGGER-VALUE-UPPER-BOUND"));

    static private final SubLList $list99 = list(list(makeSymbol("MUST"), list(makeSymbol("INSTANCE-P"), makeSymbol("TARGET-INSTANCE")), makeString("(ADD-GET-SLOT-LISTENER-STIMULATED-BY-RANGE OBJECT): target instance ~S is not an instance."), makeSymbol("TARGET-INSTANCE")), list(makeSymbol("MUST"), list(makeSymbol("SYMBOLP"), makeSymbol("TARGET-SLOT")), makeString("(ADD-GET-SLOT-LISTENER-STIMULATED-BY-RANGE OBJECT): target slot ~S is not a slot."), makeSymbol("TARGET-SLOT")), list(makeSymbol("MUST"), list(makeSymbol("SYMBOLP"), makeSymbol("MY-METHOD")), makeString("(ADD-GET-SLOT-LISTENER-STIMULATED-BY-RANGE OBJECT): method ~S is not a method."), makeSymbol("MY-METHOD")), list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("CAND"), list(makeSymbol("NUMBERP"), makeSymbol("TRIGGER-VALUE-LOWER-BOUND")), list(makeSymbol("NUMBERP"), makeSymbol("TRIGGER-VALUE-UPPER-BOUND"))), list(makeSymbol("CAND"), list(makeSymbol("STRINGP"), makeSymbol("TRIGGER-VALUE-LOWER-BOUND")), list(makeSymbol("STRINGP"), makeSymbol("TRIGGER-VALUE-UPPER-BOUND"))), list(makeSymbol("CAND"), list(makeSymbol("CHARACTERP"), makeSymbol("TRIGGER-VALUE-LOWER-BOUND")), list(makeSymbol("CHARACTERP"), makeSymbol("TRIGGER-VALUE-UPPER-BOUND")))), makeString("(ADD-GET-SLOT-LISTENER-STIMULATED-BY-RANGE OBJECT): lower ~S and upper ~S bound must be either a string,~\n     ~%a number, or a character and both must be of the same type."), makeSymbol("TRIGGER-VALUE-LOWER-BOUND"), makeSymbol("TRIGGER-VALUE-UPPER-BOUND")), list(makeSymbol("ADD-GENERIC-SLOT-LISTENER-STIMULATED-BY-RANGE"), makeSymbol("TARGET-INSTANCE"), makeSymbol("TARGET-SLOT"), makeKeyword("GET"), makeSymbol("MY-METHOD"), makeSymbol("SELF"), makeSymbol("TRIGGER-VALUE-LOWER-BOUND"), makeSymbol("TRIGGER-VALUE-UPPER-BOUND")), list(RET, makeSymbol("MY-METHOD")));

    static private final SubLString $str100$_ADD_GET_SLOT_LISTENER_STIMULATED = makeString("(ADD-GET-SLOT-LISTENER-STIMULATED-BY-RANGE OBJECT): target instance ~S is not an instance.");

    static private final SubLString $str101$_ADD_GET_SLOT_LISTENER_STIMULATED = makeString("(ADD-GET-SLOT-LISTENER-STIMULATED-BY-RANGE OBJECT): target slot ~S is not a slot.");

    static private final SubLString $str102$_ADD_GET_SLOT_LISTENER_STIMULATED = makeString("(ADD-GET-SLOT-LISTENER-STIMULATED-BY-RANGE OBJECT): method ~S is not a method.");

    static private final SubLString $str103$_ADD_GET_SLOT_LISTENER_STIMULATED = makeString("(ADD-GET-SLOT-LISTENER-STIMULATED-BY-RANGE OBJECT): lower ~S and upper ~S bound must be either a string,~\n     ~%a number, or a character and both must be of the same type.");

    private static final SubLSymbol OBJECT_ADD_GET_SLOT_LISTENER_STIMULATED_BY_RANGE_METHOD = makeSymbol("OBJECT-ADD-GET-SLOT-LISTENER-STIMULATED-BY-RANGE-METHOD");

    private static final SubLSymbol ADD_GET_SLOT_LISTENER_STIMULATED_BY_ENUM = makeSymbol("ADD-GET-SLOT-LISTENER-STIMULATED-BY-ENUM");

    static private final SubLList $list106 = list(makeSymbol("TARGET-INSTANCE"), makeSymbol("TARGET-SLOT"), makeSymbol("MY-METHOD"), makeSymbol("TRIGGER-ENUMERATION"));

    static private final SubLList $list107 = list(list(makeSymbol("MUST"), list(makeSymbol("INSTANCE-P"), makeSymbol("TARGET-INSTANCE")), makeString("(ADD-GET-SLOT-LISTENER-STIMULATED-BY-ENUM OBJECT): target instance ~S is not an instance."), makeSymbol("TARGET-INSTANCE")), list(makeSymbol("MUST"), list(makeSymbol("SYMBOLP"), makeSymbol("TARGET-SLOT")), makeString("(ADD-GET-SLOT-LISTENER-STIMULATED-BY-ENUM OBJECT): target slot ~S is not a slot."), makeSymbol("TARGET-SLOT")), list(makeSymbol("MUST"), list(makeSymbol("SYMBOLP"), makeSymbol("MY-METHOD")), makeString("(ADD-GET-SLOT-LISTENER-STIMULATED-BY-ENUM OBJECT): method ~S is not a method."), makeSymbol("MY-METHOD")), list(makeSymbol("ADD-GENERIC-SLOT-LISTENER-STIMULATED-BY-ENUM"), makeSymbol("TARGET-INSTANCE"), makeSymbol("TARGET-SLOT"), makeKeyword("GET"), makeSymbol("MY-METHOD"), makeSymbol("SELF"), makeSymbol("TRIGGER-ENUMERATION")), list(RET, makeSymbol("MY-METHOD")));

    static private final SubLString $str108$_ADD_GET_SLOT_LISTENER_STIMULATED = makeString("(ADD-GET-SLOT-LISTENER-STIMULATED-BY-ENUM OBJECT): target instance ~S is not an instance.");

    static private final SubLString $str109$_ADD_GET_SLOT_LISTENER_STIMULATED = makeString("(ADD-GET-SLOT-LISTENER-STIMULATED-BY-ENUM OBJECT): target slot ~S is not a slot.");

    static private final SubLString $str110$_ADD_GET_SLOT_LISTENER_STIMULATED = makeString("(ADD-GET-SLOT-LISTENER-STIMULATED-BY-ENUM OBJECT): method ~S is not a method.");

    private static final SubLSymbol OBJECT_ADD_GET_SLOT_LISTENER_STIMULATED_BY_ENUM_METHOD = makeSymbol("OBJECT-ADD-GET-SLOT-LISTENER-STIMULATED-BY-ENUM-METHOD");

    private static final SubLSymbol ADD_SET_SLOT_LISTENER = makeSymbol("ADD-SET-SLOT-LISTENER");

    static private final SubLList $list113 = list(list(makeSymbol("MUST"), list(makeSymbol("INSTANCE-P"), makeSymbol("TARGET-INSTANCE")), makeString("(ADD-SET-SLOT-LISTENER OBJECT): target instance ~S is not an instance."), makeSymbol("TARGET-INSTANCE")), list(makeSymbol("MUST"), list(makeSymbol("SYMBOLP"), makeSymbol("TARGET-SLOT")), makeString("(ADD-SET-SLOT-LISTENER OBJECT): target slot ~S is not a slot."), makeSymbol("TARGET-SLOT")), list(makeSymbol("MUST"), list(makeSymbol("SYMBOLP"), makeSymbol("MY-METHOD")), makeString("(ADD-SET-SLOT-LISTENER OBJECT): method ~S is not a method."), makeSymbol("MY-METHOD")), list(makeSymbol("ADD-GENERIC-SLOT-LISTENER"), makeSymbol("TARGET-INSTANCE"), makeSymbol("TARGET-SLOT"), makeKeyword("SET"), makeSymbol("MY-METHOD"), makeSymbol("SELF")), list(RET, makeSymbol("MY-METHOD")));

    static private final SubLString $str114$_ADD_SET_SLOT_LISTENER_OBJECT___t = makeString("(ADD-SET-SLOT-LISTENER OBJECT): target instance ~S is not an instance.");

    static private final SubLString $str115$_ADD_SET_SLOT_LISTENER_OBJECT___t = makeString("(ADD-SET-SLOT-LISTENER OBJECT): target slot ~S is not a slot.");

    static private final SubLString $str116$_ADD_SET_SLOT_LISTENER_OBJECT___m = makeString("(ADD-SET-SLOT-LISTENER OBJECT): method ~S is not a method.");

    private static final SubLSymbol OBJECT_ADD_SET_SLOT_LISTENER_METHOD = makeSymbol("OBJECT-ADD-SET-SLOT-LISTENER-METHOD");

    private static final SubLSymbol ADD_SET_SLOT_LISTENER_STIMULATED_BY_VALUE = makeSymbol("ADD-SET-SLOT-LISTENER-STIMULATED-BY-VALUE");

    static private final SubLList $list120 = list(list(makeSymbol("MUST"), list(makeSymbol("INSTANCE-P"), makeSymbol("TARGET-INSTANCE")), makeString("(ADD-SET-SLOT-LISTENER-STIMULATED-BY-VALUE OBJECT): target instance ~S is not an instance."), makeSymbol("TARGET-INSTANCE")), list(makeSymbol("MUST"), list(makeSymbol("SYMBOLP"), makeSymbol("TARGET-SLOT")), makeString("(ADD-SET-SLOT-LISTENER-STIMULATED-BY-VALUE OBJECT): target slot ~S is not a slot."), makeSymbol("TARGET-SLOT")), list(makeSymbol("MUST"), list(makeSymbol("SYMBOLP"), makeSymbol("MY-METHOD")), makeString("(ADD-SET-SLOT-LISTENER-STIMULATED-BY-VALUE OBJECT): method ~S is not a method."), makeSymbol("MY-METHOD")), list(makeSymbol("ADD-GENERIC-SLOT-LISTENER-STIMULATED-BY-VALUE"), makeSymbol("TARGET-INSTANCE"), makeSymbol("TARGET-SLOT"), makeKeyword("SET"), makeSymbol("MY-METHOD"), makeSymbol("SELF"), makeSymbol("TRIGGER-VALUE")), list(RET, makeSymbol("MY-METHOD")));

    static private final SubLString $str121$_ADD_SET_SLOT_LISTENER_STIMULATED = makeString("(ADD-SET-SLOT-LISTENER-STIMULATED-BY-VALUE OBJECT): target instance ~S is not an instance.");

    static private final SubLString $str122$_ADD_SET_SLOT_LISTENER_STIMULATED = makeString("(ADD-SET-SLOT-LISTENER-STIMULATED-BY-VALUE OBJECT): target slot ~S is not a slot.");

    static private final SubLString $str123$_ADD_SET_SLOT_LISTENER_STIMULATED = makeString("(ADD-SET-SLOT-LISTENER-STIMULATED-BY-VALUE OBJECT): method ~S is not a method.");

    private static final SubLSymbol OBJECT_ADD_SET_SLOT_LISTENER_STIMULATED_BY_VALUE_METHOD = makeSymbol("OBJECT-ADD-SET-SLOT-LISTENER-STIMULATED-BY-VALUE-METHOD");

    private static final SubLSymbol ADD_SET_SLOT_LISTENER_STIMULATED_BY_RANGE = makeSymbol("ADD-SET-SLOT-LISTENER-STIMULATED-BY-RANGE");

    static private final SubLList $list126 = list(list(makeSymbol("MUST"), list(makeSymbol("INSTANCE-P"), makeSymbol("TARGET-INSTANCE")), makeString("(ADD-SET-SLOT-LISTENER-STIMULATED-BY-RANGE OBJECT): target instance ~S is not an instance."), makeSymbol("TARGET-INSTANCE")), list(makeSymbol("MUST"), list(makeSymbol("SYMBOLP"), makeSymbol("TARGET-SLOT")), makeString("(ADD-SET-SLOT-LISTENER-STIMULATED-BY-RANGE OBJECT): target slot ~S is not a slot."), makeSymbol("TARGET-SLOT")), list(makeSymbol("MUST"), list(makeSymbol("SYMBOLP"), makeSymbol("MY-METHOD")), makeString("(ADD-SET-SLOT-LISTENER-STIMULATED-BY-RANGE OBJECT): method ~S is not a method."), makeSymbol("MY-METHOD")), list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("CAND"), list(makeSymbol("NUMBERP"), makeSymbol("TRIGGER-VALUE-LOWER-BOUND")), list(makeSymbol("NUMBERP"), makeSymbol("TRIGGER-VALUE-UPPER-BOUND"))), list(makeSymbol("CAND"), list(makeSymbol("STRINGP"), makeSymbol("TRIGGER-VALUE-LOWER-BOUND")), list(makeSymbol("STRINGP"), makeSymbol("TRIGGER-VALUE-UPPER-BOUND"))), list(makeSymbol("CAND"), list(makeSymbol("CHARACTERP"), makeSymbol("TRIGGER-VALUE-LOWER-BOUND")), list(makeSymbol("CHARACTERP"), makeSymbol("TRIGGER-VALUE-UPPER-BOUND")))), makeString("(ADD-SET-SLOT-LISTENER-STIMULATED-BY-RANGE OBJECT): lower ~S and upper ~S bound must be either a string,~\n     ~%a number, or a character and both must be of the same type."), makeSymbol("TRIGGER-VALUE-LOWER-BOUND"), makeSymbol("TRIGGER-VALUE-UPPER-BOUND")), list(makeSymbol("ADD-GENERIC-SLOT-LISTENER-STIMULATED-BY-RANGE"), makeSymbol("TARGET-INSTANCE"), makeSymbol("TARGET-SLOT"), makeKeyword("SET"), makeSymbol("MY-METHOD"), makeSymbol("SELF"), makeSymbol("TRIGGER-VALUE-LOWER-BOUND"), makeSymbol("TRIGGER-VALUE-UPPER-BOUND")), list(RET, makeSymbol("MY-METHOD")));

    static private final SubLString $str127$_ADD_SET_SLOT_LISTENER_STIMULATED = makeString("(ADD-SET-SLOT-LISTENER-STIMULATED-BY-RANGE OBJECT): target instance ~S is not an instance.");

    static private final SubLString $str128$_ADD_SET_SLOT_LISTENER_STIMULATED = makeString("(ADD-SET-SLOT-LISTENER-STIMULATED-BY-RANGE OBJECT): target slot ~S is not a slot.");

    static private final SubLString $str129$_ADD_SET_SLOT_LISTENER_STIMULATED = makeString("(ADD-SET-SLOT-LISTENER-STIMULATED-BY-RANGE OBJECT): method ~S is not a method.");

    static private final SubLString $str130$_ADD_SET_SLOT_LISTENER_STIMULATED = makeString("(ADD-SET-SLOT-LISTENER-STIMULATED-BY-RANGE OBJECT): lower ~S and upper ~S bound must be either a string,~\n     ~%a number, or a character and both must be of the same type.");

    private static final SubLSymbol OBJECT_ADD_SET_SLOT_LISTENER_STIMULATED_BY_RANGE_METHOD = makeSymbol("OBJECT-ADD-SET-SLOT-LISTENER-STIMULATED-BY-RANGE-METHOD");

    private static final SubLSymbol ADD_SET_SLOT_LISTENER_STIMULATED_BY_ENUM = makeSymbol("ADD-SET-SLOT-LISTENER-STIMULATED-BY-ENUM");

    static private final SubLList $list133 = list(list(makeSymbol("MUST"), list(makeSymbol("INSTANCE-P"), makeSymbol("TARGET-INSTANCE")), makeString("(ADD-SET-SLOT-LISTENER-STIMULATED-BY-ENUM OBJECT): target instance ~S is not an instance."), makeSymbol("TARGET-INSTANCE")), list(makeSymbol("MUST"), list(makeSymbol("SYMBOLP"), makeSymbol("TARGET-SLOT")), makeString("(ADD-SET-SLOT-LISTENER-STIMULATED-BY-ENUM OBJECT): target slot ~S is not a slot."), makeSymbol("TARGET-SLOT")), list(makeSymbol("MUST"), list(makeSymbol("SYMBOLP"), makeSymbol("MY-METHOD")), makeString("(ADD-SET-SLOT-LISTENER-STIMULATED-BY-ENUM OBJECT): method ~S is not a method."), makeSymbol("MY-METHOD")), list(makeSymbol("ADD-GENERIC-SLOT-LISTENER-STIMULATED-BY-ENUM"), makeSymbol("TARGET-INSTANCE"), makeSymbol("TARGET-SLOT"), makeKeyword("SET"), makeSymbol("MY-METHOD"), makeSymbol("SELF"), makeSymbol("TRIGGER-ENUMERATION")), list(RET, makeSymbol("MY-METHOD")));

    static private final SubLString $str134$_ADD_SET_SLOT_LISTENER_STIMULATED = makeString("(ADD-SET-SLOT-LISTENER-STIMULATED-BY-ENUM OBJECT): target instance ~S is not an instance.");

    static private final SubLString $str135$_ADD_SET_SLOT_LISTENER_STIMULATED = makeString("(ADD-SET-SLOT-LISTENER-STIMULATED-BY-ENUM OBJECT): target slot ~S is not a slot.");

    static private final SubLString $str136$_ADD_SET_SLOT_LISTENER_STIMULATED = makeString("(ADD-SET-SLOT-LISTENER-STIMULATED-BY-ENUM OBJECT): method ~S is not a method.");

    private static final SubLSymbol OBJECT_ADD_SET_SLOT_LISTENER_STIMULATED_BY_ENUM_METHOD = makeSymbol("OBJECT-ADD-SET-SLOT-LISTENER-STIMULATED-BY-ENUM-METHOD");

    private static final SubLSymbol REMOVE_ALL_GET_SLOT_LISTENERS = makeSymbol("REMOVE-ALL-GET-SLOT-LISTENERS");

    static private final SubLList $list139 = list(makeSymbol("TARGET-INSTANCE"), makeSymbol("&OPTIONAL"), list(makeSymbol("TARGET-SLOT"), NIL));

    static private final SubLList $list140 = list(list(makeSymbol("MUST"), list(makeSymbol("INSTANCE-P"), makeSymbol("TARGET-INSTANCE")), makeString("(REMOVE-ALL-GET-SLOT-LISTENERS OBJECT): target instance ~S is not an instance."), makeSymbol("TARGET-INSTANCE")), list(makeSymbol("MUST"), list(makeSymbol("SYMBOLP"), makeSymbol("TARGET-SLOT")), makeString("(REMOVE-ALL-GET-SLOT-LISTENERS OBJECT): target slot ~S is not a slot."), makeSymbol("TARGET-SLOT")), list(RET, list(makeSymbol("SLOT-LISTENERS-REMOVE-ALL-GET-SLOT-LISTENERS"), makeSymbol("TARGET-INSTANCE"), makeSymbol("SELF"), makeSymbol("TARGET-SLOT"))));

    static private final SubLString $str141$_REMOVE_ALL_GET_SLOT_LISTENERS_OB = makeString("(REMOVE-ALL-GET-SLOT-LISTENERS OBJECT): target instance ~S is not an instance.");

    static private final SubLString $str142$_REMOVE_ALL_GET_SLOT_LISTENERS_OB = makeString("(REMOVE-ALL-GET-SLOT-LISTENERS OBJECT): target slot ~S is not a slot.");

    private static final SubLSymbol OBJECT_REMOVE_ALL_GET_SLOT_LISTENERS_METHOD = makeSymbol("OBJECT-REMOVE-ALL-GET-SLOT-LISTENERS-METHOD");

    private static final SubLSymbol REMOVE_ALL_SET_SLOT_LISTENERS = makeSymbol("REMOVE-ALL-SET-SLOT-LISTENERS");

    static private final SubLList $list145 = list(list(makeSymbol("MUST"), list(makeSymbol("INSTANCE-P"), makeSymbol("TARGET-INSTANCE")), makeString("(REMOVE-ALL-SET-SLOT-LISTENERS OBJECT): target instance ~S is not an instance."), makeSymbol("TARGET-INSTANCE")), list(makeSymbol("MUST"), list(makeSymbol("SYMBOLP"), makeSymbol("TARGET-SLOT")), makeString("(REMOVE-ALL-SET-SLOT-LISTENERS OBJECT): target slot ~S is not a slot."), makeSymbol("TARGET-SLOT")), list(RET, list(makeSymbol("SLOT-LISTENERS-REMOVE-ALL-SET-SLOT-LISTENERS"), makeSymbol("TARGET-INSTANCE"), makeSymbol("SELF"), makeSymbol("TARGET-SLOT"))));

    static private final SubLString $str146$_REMOVE_ALL_SET_SLOT_LISTENERS_OB = makeString("(REMOVE-ALL-SET-SLOT-LISTENERS OBJECT): target instance ~S is not an instance.");

    static private final SubLString $str147$_REMOVE_ALL_SET_SLOT_LISTENERS_OB = makeString("(REMOVE-ALL-SET-SLOT-LISTENERS OBJECT): target slot ~S is not a slot.");

    private static final SubLSymbol OBJECT_REMOVE_ALL_SET_SLOT_LISTENERS_METHOD = makeSymbol("OBJECT-REMOVE-ALL-SET-SLOT-LISTENERS-METHOD");

    private static final SubLSymbol REMOVE_ALL_SLOT_LISTENERS = makeSymbol("REMOVE-ALL-SLOT-LISTENERS");

    static private final SubLList $list150 = list(list(makeSymbol("MUST"), list(makeSymbol("INSTANCE-P"), makeSymbol("TARGET-INSTANCE")), makeString("(REMOVE-ALL-SLOT-LISTENERS OBJECT): target instance ~S is not an instance."), makeSymbol("TARGET-INSTANCE")), list(makeSymbol("MUST"), list(makeSymbol("SYMBOLP"), makeSymbol("TARGET-SLOT")), makeString("(REMOVE-ALL-SLOT-LISTENERS OBJECT): target slot ~S is not a slot."), makeSymbol("TARGET-SLOT")), list(RET, list(makeSymbol("SLOT-LISTENERS-REMOVE-ALL-SLOT-LISTENERS"), makeSymbol("TARGET-INSTANCE"), makeSymbol("SELF"), makeSymbol("TARGET-SLOT"))));

    static private final SubLString $str151$_REMOVE_ALL_SLOT_LISTENERS_OBJECT = makeString("(REMOVE-ALL-SLOT-LISTENERS OBJECT): target instance ~S is not an instance.");

    static private final SubLString $str152$_REMOVE_ALL_SLOT_LISTENERS_OBJECT = makeString("(REMOVE-ALL-SLOT-LISTENERS OBJECT): target slot ~S is not a slot.");

    private static final SubLSymbol OBJECT_REMOVE_ALL_SLOT_LISTENERS_METHOD = makeSymbol("OBJECT-REMOVE-ALL-SLOT-LISTENERS-METHOD");

    private static final SubLSymbol ADD_CLASS_WIDE_BEFORE_METHOD_LISTENER = makeSymbol("ADD-CLASS-WIDE-BEFORE-METHOD-LISTENER");

    static private final SubLList $list155 = list(makeSymbol("CLASS"), makeSymbol("TARGET-METHOD"), makeSymbol("MY-METHOD"));

    static private final SubLList $list156 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("CLASS-P"), makeSymbol("CLASS")), list(makeSymbol("INSTANCE-P"), makeSymbol("CLASS"))), makeString("(ADD-CLASS-WIDE-BEFORE-METHOD-LISTENER OBJECT): target class  ~S is neither a class nor an instance."), makeSymbol("CLASS")), list(makeSymbol("MUST"), list(makeSymbol("CAND"), makeSymbol("TARGET-METHOD"), list(makeSymbol("SYMBOLP"), makeSymbol("TARGET-METHOD"))), makeString("(ADD-CLASS-WIDE-BEFORE-METHOD-LISTENER OBJECT): target method ~S is not a legal method name."), makeSymbol("TARGET-METHOD")), list(makeSymbol("MUST"), list(makeSymbol("CAND"), makeSymbol("MY-METHOD"), list(makeSymbol("SYMBOLP"), makeSymbol("MY-METHOD"))), makeString("(ADD-CLASS-WIDE-BEFORE-METHOD-LISTENER OBJECT): method ~S is not a legal method name."), makeSymbol("MY-METHOD")), list(makeSymbol("PCOND"), list(list(makeSymbol("CLASS-P"), makeSymbol("CLASS")), list(makeSymbol("METHOD-LISTENERS-ADD-BEFORE-LISTENER"), list(makeSymbol("CLASS-NAME"), makeSymbol("CLASS")), makeSymbol("TARGET-METHOD"), makeSymbol("MY-METHOD"), makeSymbol("SELF"))), list(list(makeSymbol("INSTANCE-P"), makeSymbol("CLASS")), list(makeSymbol("METHOD-LISTENERS-ADD-BEFORE-LISTENER"), list(makeSymbol("CLASS-NAME"), list(makeSymbol("INSTANCE-CLASS"), makeSymbol("CLASS"))), makeSymbol("TARGET-METHOD"), makeSymbol("MY-METHOD"), makeSymbol("SELF")))), list(RET, makeSymbol("MY-METHOD")));

    static private final SubLString $str157$_ADD_CLASS_WIDE_BEFORE_METHOD_LIS = makeString("(ADD-CLASS-WIDE-BEFORE-METHOD-LISTENER OBJECT): target class  ~S is neither a class nor an instance.");

    static private final SubLString $str158$_ADD_CLASS_WIDE_BEFORE_METHOD_LIS = makeString("(ADD-CLASS-WIDE-BEFORE-METHOD-LISTENER OBJECT): target method ~S is not a legal method name.");

    static private final SubLString $str159$_ADD_CLASS_WIDE_BEFORE_METHOD_LIS = makeString("(ADD-CLASS-WIDE-BEFORE-METHOD-LISTENER OBJECT): method ~S is not a legal method name.");

    private static final SubLSymbol OBJECT_ADD_CLASS_WIDE_BEFORE_METHOD_LISTENER_METHOD = makeSymbol("OBJECT-ADD-CLASS-WIDE-BEFORE-METHOD-LISTENER-METHOD");

    private static final SubLSymbol ADD_CLASS_WIDE_AFTER_METHOD_LISTENER = makeSymbol("ADD-CLASS-WIDE-AFTER-METHOD-LISTENER");

    static private final SubLList $list162 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("CLASS-P"), makeSymbol("CLASS")), list(makeSymbol("INSTANCE-P"), makeSymbol("CLASS"))), makeString("(ADD-CLASS-WIDE-AFTER-METHOD-LISTENER OBJECT): target class  ~S is neither a class nor an instance."), makeSymbol("CLASS")), list(makeSymbol("MUST"), list(makeSymbol("CAND"), makeSymbol("TARGET-METHOD"), list(makeSymbol("SYMBOLP"), makeSymbol("TARGET-METHOD"))), makeString("(ADD-CLASS-WIDE-AFTER-METHOD-LISTENER OBJECT): target method ~S is not a legal method name."), makeSymbol("TARGET-METHOD")), list(makeSymbol("MUST"), list(makeSymbol("CAND"), makeSymbol("MY-METHOD"), list(makeSymbol("SYMBOLP"), makeSymbol("MY-METHOD"))), makeString("(ADD-CLASS-WIDE-AFTER-METHOD-LISTENER OBJECT): method ~S is not a legal method name."), makeSymbol("MY-METHOD")), list(makeSymbol("PCOND"), list(list(makeSymbol("CLASS-P"), makeSymbol("CLASS")), list(makeSymbol("METHOD-LISTENERS-ADD-AFTER-LISTENER"), list(makeSymbol("CLASS-NAME"), makeSymbol("CLASS")), makeSymbol("TARGET-METHOD"), makeSymbol("MY-METHOD"), makeSymbol("SELF"))), list(list(makeSymbol("INSTANCE-P"), makeSymbol("CLASS")), list(makeSymbol("METHOD-LISTENERS-ADD-AFTER-LISTENER"), list(makeSymbol("CLASS-NAME"), list(makeSymbol("INSTANCE-CLASS"), makeSymbol("CLASS"))), makeSymbol("TARGET-METHOD"), makeSymbol("MY-METHOD"), makeSymbol("SELF")))), list(RET, makeSymbol("MY-METHOD")));

    static private final SubLString $str163$_ADD_CLASS_WIDE_AFTER_METHOD_LIST = makeString("(ADD-CLASS-WIDE-AFTER-METHOD-LISTENER OBJECT): target class  ~S is neither a class nor an instance.");

    static private final SubLString $str164$_ADD_CLASS_WIDE_AFTER_METHOD_LIST = makeString("(ADD-CLASS-WIDE-AFTER-METHOD-LISTENER OBJECT): target method ~S is not a legal method name.");

    static private final SubLString $str165$_ADD_CLASS_WIDE_AFTER_METHOD_LIST = makeString("(ADD-CLASS-WIDE-AFTER-METHOD-LISTENER OBJECT): method ~S is not a legal method name.");

    private static final SubLSymbol OBJECT_ADD_CLASS_WIDE_AFTER_METHOD_LISTENER_METHOD = makeSymbol("OBJECT-ADD-CLASS-WIDE-AFTER-METHOD-LISTENER-METHOD");

    private static final SubLSymbol REMOVE_ALL_CLASS_WIDE_METHOD_LISTENERS = makeSymbol("REMOVE-ALL-CLASS-WIDE-METHOD-LISTENERS");

    static private final SubLList $list168 = list(makeSymbol("MONITORED-INSTANCE"), makeSymbol("&OPTIONAL"), list(makeSymbol("TARGET-METHOD"), NIL));

    static private final SubLList $list169 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("INSTANCE-P"), makeSymbol("MONITORED-INSTANCE")), list(makeSymbol("CLASS-P"), makeSymbol("MONITORED-INSTANCE"))), makeString("(REMOVE-CLASS-WIDE-METHOD-LISTENER OBJECT): monitored instance ~S is not an instance."), makeSymbol("MONITORED-INSTANCE")), list(makeSymbol("MUST"), list(makeSymbol("SYMBOLP"), makeSymbol("TARGET-METHOD")), makeString("(REMOVE-CLASS-WIDE-METHOD-LISTENER OBJECT): target method ~S is not a legal method name."), makeSymbol("TARGET-METHOD")), list(RET, list(makeSymbol("METHOD-LISTENERS-REMOVE-ALL-METHOD-LISTENERS"), makeSymbol("MONITORED-INSTANCE"), makeSymbol("SELF"), makeSymbol("TARGET-METHOD"))));

    static private final SubLString $str170$_REMOVE_CLASS_WIDE_METHOD_LISTENE = makeString("(REMOVE-CLASS-WIDE-METHOD-LISTENER OBJECT): monitored instance ~S is not an instance.");

    static private final SubLString $str171$_REMOVE_CLASS_WIDE_METHOD_LISTENE = makeString("(REMOVE-CLASS-WIDE-METHOD-LISTENER OBJECT): target method ~S is not a legal method name.");

    private static final SubLSymbol OBJECT_REMOVE_ALL_CLASS_WIDE_METHOD_LISTENERS_METHOD = makeSymbol("OBJECT-REMOVE-ALL-CLASS-WIDE-METHOD-LISTENERS-METHOD");

    static private final SubLList $list174 = list(list(makeSymbol("CSETQ"), makeSymbol("ISOLATED-P"), T), list(makeSymbol("SLOT-LISTENERS-REMOVE-ALL-SLOT-LISTENERS"), makeSymbol("SELF")), list(makeSymbol("METHOD-LISTENERS-REMOVE-ALL-METHOD-LISTENERS"), makeSymbol("SELF")), list(RET, NIL));

    static private final SubLSymbol $sym175$OUTER_CATCH_FOR_OBJECT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-OBJECT-METHOD");

    private static final SubLSymbol OBJECT_ISOLATE_METHOD = makeSymbol("OBJECT-ISOLATE-METHOD");

    static private final SubLList $list178 = list(list(makeSymbol("CLET"), list(list(makeSymbol("LISTED-SLOTS"), NIL), list(makeSymbol("KEYWORD-PACKAGE"), list(makeSymbol("SYMBOL-PACKAGE"), $TEST)), list(makeSymbol("CLASS"), list(makeSymbol("INSTANCE-CLASS"), makeSymbol("SELF")))), list(makeSymbol("WITH-CLASS"), makeSymbol("CLASS"), list(makeSymbol("CDO-ESSENTIAL-SLOTS"), list(makeSymbol("SLOT-NAME"), NIL, NIL, NIL, NIL, makeSymbol("COMPILED-CLASS-SLOT-ACCESS-ALIST")), list(makeSymbol("CPUSH"), list(makeSymbol("INTERN"), list(makeSymbol("SYMBOL-NAME"), makeSymbol("SLOT-NAME")), makeSymbol("KEYWORD-PACKAGE")), makeSymbol("LISTED-SLOTS")), list(makeSymbol("CPUSH"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), makeSymbol("SLOT-NAME")), makeSymbol("LISTED-SLOTS"))), list(makeSymbol("CDO-ESSENTIAL-SLOTS"), list(makeSymbol("SLOT-NAME"), NIL, NIL, NIL, NIL, makeSymbol("COMPILED-CLASS-BOOLEAN-SLOT-ACCESS-ALIST")), list(makeSymbol("CPUSH"), list(makeSymbol("INTERN"), list(makeSymbol("SYMBOL-NAME"), makeSymbol("SLOT-NAME")), makeSymbol("KEYWORD-PACKAGE")), makeSymbol("LISTED-SLOTS")), list(makeSymbol("CPUSH"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), makeSymbol("SLOT-NAME")), makeSymbol("LISTED-SLOTS"))), list(makeSymbol("CDO-ESSENTIAL-SLOTS"), list(makeSymbol("SLOT-NAME"), NIL, NIL, NIL, NIL, makeSymbol("COMPILED-INSTANCE-SLOT-ACCESS-ALIST")), list(makeSymbol("CPUSH"), list(makeSymbol("INTERN"), list(makeSymbol("SYMBOL-NAME"), makeSymbol("SLOT-NAME")), makeSymbol("KEYWORD-PACKAGE")), makeSymbol("LISTED-SLOTS")), list(makeSymbol("CPUSH"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), makeSymbol("SLOT-NAME")), makeSymbol("LISTED-SLOTS"))), list(makeSymbol("CDO-ESSENTIAL-SLOTS"), list(makeSymbol("SLOT-NAME"), NIL, NIL, NIL, NIL, makeSymbol("COMPILED-INSTANCE-BOOLEAN-SLOT-ACCESS-ALIST")), list(makeSymbol("CPUSH"), list(makeSymbol("INTERN"), list(makeSymbol("SYMBOL-NAME"), makeSymbol("SLOT-NAME")), makeSymbol("KEYWORD-PACKAGE")), makeSymbol("LISTED-SLOTS")), list(makeSymbol("CPUSH"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), makeSymbol("SLOT-NAME")), makeSymbol("LISTED-SLOTS")))), list(RET, list(makeSymbol("NREVERSE"), makeSymbol("LISTED-SLOTS")))));

    private static final SubLSymbol OBJECT_PLISTIFY_METHOD = makeSymbol("OBJECT-PLISTIFY-METHOD");

    static private final SubLList $list182 = list(list(RET, list(makeSymbol("LIST*"), list(makeSymbol("CLASS-NAME"), list(makeSymbol("INSTANCE-CLASS"), makeSymbol("SELF"))), makeSymbol("INSTANCE-NUMBER"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PLISTIFY"))))));

    static private final SubLSymbol $sym183$OUTER_CATCH_FOR_OBJECT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-OBJECT-METHOD");

    private static final SubLSymbol OBJECT_LISTIFY_METHOD = makeSymbol("OBJECT-LISTIFY-METHOD");

    static private final SubLList $list186 = list(makeKeyword("NO-INSTANCE-VARIABLES"), makeKeyword("PUBLIC"));

    static private final SubLList $list187 = list(makeSymbol("PLISTIFIED-CONTENT"));

    static private final SubLList $list188 = list(list(makeSymbol("MUST"), list(makeSymbol("LISTP"), makeSymbol("PLISTIFIED-CONTENT")), makeString("(ASSIMILATE ~S): ~S is not a valid plist."), makeSymbol("SELF")), list(makeSymbol("CLET"), list(makeSymbol("SLOT"), makeSymbol("SLOT-NAME")), list(makeSymbol("WITH-CLASS"), list(makeSymbol("INSTANCE-CLASS"), makeSymbol("SELF")), list(makeSymbol("CDOPLIST"), list(makeSymbol("KEY"), makeSymbol("VALUE"), makeSymbol("PLISTIFIED-CONTENT")), list(makeSymbol("CSETQ"), makeSymbol("SLOT"), list(makeSymbol("SLOT-ASSOC-BY-NAME"), list(makeSymbol("SYMBOL-NAME"), makeSymbol("KEY")), makeSymbol("COMPILED-CLASS-SLOT-ACCESS-ALIST"))), list(makeSymbol("PWHEN"), makeSymbol("SLOT"), list(makeSymbol("CSETQ"), makeSymbol("SLOT-NAME"), list(makeSymbol("SLOT-NAME"), makeSymbol("SLOT"))), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), makeSymbol("SLOT-NAME"), makeSymbol("VALUE")))), list(makeSymbol("CDOPLIST"), list(makeSymbol("KEY"), makeSymbol("VALUE"), makeSymbol("PLISTIFIED-CONTENT")), list(makeSymbol("CSETQ"), makeSymbol("SLOT"), list(makeSymbol("SLOT-ASSOC-BY-NAME"), list(makeSymbol("SYMBOL-NAME"), makeSymbol("KEY")), makeSymbol("COMPILED-INSTANCE-SLOT-ACCESS-ALIST"))), list(makeSymbol("PWHEN"), makeSymbol("SLOT"), list(makeSymbol("CSETQ"), makeSymbol("SLOT-NAME"), list(makeSymbol("SLOT-NAME"), makeSymbol("SLOT"))), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), makeSymbol("SLOT-NAME"), makeSymbol("VALUE"))))), list(RET, makeSymbol("SELF"))));

    static private final SubLString $str189$_ASSIMILATE__S____S_is_not_a_vali = makeString("(ASSIMILATE ~S): ~S is not a valid plist.");

    private static final SubLSymbol OBJECT_ASSIMILATE_METHOD = makeSymbol("OBJECT-ASSIMILATE-METHOD");

    static private final SubLString $str191$NEW_SUBLOOPS_INSTANCE___S_is_neit = makeString("NEW-SUBLOOPS-INSTANCE: ~S is neither a class name nor a class.");

    static private final SubLString $str192$CREATE_OBJECT_FROM_LIST___S_is_no = makeString("CREATE-OBJECT-FROM-LIST: ~S is not a well formed listified ");

    static private final SubLList $list193 = listS(makeSymbol("CLASS-NAME"), makeSymbol("INSTANCE-NUMBER"), makeSymbol("SLOT-PLIST"));

    static private final SubLString $str194$CREATE_OBJECT_FROM_LIST___S_does_ = makeString("CREATE-OBJECT-FROM-LIST: ~S does not name a known class.");

    static private final SubLList $list195 = list(list(makeSymbol("INSTANCE"), makeSymbol("STREAM"), makeSymbol("&KEY"), makeSymbol("NUMBER"), IDENTITY), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list196 = list(makeKeyword("NUMBER"), makeKeyword("IDENTITY"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    static private final SubLString $$$INSTANCE = makeString("INSTANCE");

    static private final SubLString $$$STREAM = makeString("STREAM");

    static private final SubLList $list204 = list(makeSymbol("INSTANCE-P"));

    private static final SubLSymbol PRINT_UNREADABLE_OBJECT = makeSymbol("PRINT-UNREADABLE-OBJECT");

    static private final SubLString $str212$__A = makeString("-~A");

    private static final SubLSymbol GET_OBJECT_INSTANCE_NUMBER = makeSymbol("GET-OBJECT-INSTANCE-NUMBER");

    // Definitions
    public static final SubLObject get_object_instance_number_alt(SubLObject v_object) {
        return classes.subloop_get_access_protected_instance_slot(v_object, ZERO_INTEGER, INSTANCE_NUMBER);
    }

    // Definitions
    public static SubLObject get_object_instance_number(final SubLObject v_object) {
        return classes.subloop_get_access_protected_instance_slot(v_object, ZERO_INTEGER, INSTANCE_NUMBER);
    }

    public static final SubLObject set_object_instance_number_alt(SubLObject v_object, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_object, value, ZERO_INTEGER, INSTANCE_NUMBER);
    }

    public static SubLObject set_object_instance_number(final SubLObject v_object, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_object, value, ZERO_INTEGER, INSTANCE_NUMBER);
    }

    public static final SubLObject get_object_isolated_p_alt(SubLObject v_object) {
        return classes.ldb_test($int$4096, subloop_structures.instance_boolean_slots(v_object));
    }

    public static SubLObject get_object_isolated_p(final SubLObject v_object) {
        return classes.ldb_test($int$4096, subloop_structures.instance_boolean_slots(v_object));
    }

    public static final SubLObject set_object_isolated_p_alt(SubLObject v_object, SubLObject value) {
        subloop_structures._csetf_instance_boolean_slots(v_object, bytes.dpb(NIL != value ? ((SubLObject) (ONE_INTEGER)) : ZERO_INTEGER, $int$4096, subloop_structures.instance_boolean_slots(v_object)));
        return value;
    }

    public static SubLObject set_object_isolated_p(final SubLObject v_object, final SubLObject value) {
        subloop_structures._csetf_instance_boolean_slots(v_object, bytes.dpb(NIL != value ? ONE_INTEGER : ZERO_INTEGER, $int$4096, subloop_structures.instance_boolean_slots(v_object)));
        return value;
    }

    public static final SubLObject get_object_instance_count_alt(SubLObject v_object) {
        {
            SubLObject v_class = (v_object.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(v_object))) : NIL != subloop_structures.class_p(v_object) ? ((SubLObject) (v_object)) : NIL != subloop_structures.instance_p(v_object) ? ((SubLObject) (subloop_structures.instance_class(v_object))) : NIL;
            if (NIL != v_class) {
                classes.classes_access_check_class_slot(v_class, slots.slot_assoc(INSTANCE_COUNT, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
                return aref(subloop_structures.class_any_slots(v_class), ZERO_INTEGER);
            }
            return NIL;
        }
    }

    public static SubLObject get_object_instance_count(final SubLObject v_object) {
        final SubLObject v_class = (v_object.isSymbol()) ? classes.classes_retrieve_class(v_object) : NIL != subloop_structures.class_p(v_object) ? v_object : NIL != subloop_structures.instance_p(v_object) ? subloop_structures.instance_class(v_object) : NIL;
        if (NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc(INSTANCE_COUNT, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return aref(subloop_structures.class_any_slots(v_class), ZERO_INTEGER);
        }
        return NIL;
    }

    public static final SubLObject set_object_instance_count_alt(SubLObject v_object, SubLObject value) {
        {
            SubLObject v_class = (v_object.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(v_object))) : NIL != subloop_structures.class_p(v_object) ? ((SubLObject) (v_object)) : NIL != subloop_structures.instance_p(v_object) ? ((SubLObject) (subloop_structures.instance_class(v_object))) : NIL;
            if (NIL != v_class) {
                classes.classes_access_check_class_slot(v_class, slots.slot_assoc(INSTANCE_COUNT, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
                return set_aref(subloop_structures.class_any_slots(v_class), ZERO_INTEGER, value);
            }
            return NIL;
        }
    }

    public static SubLObject set_object_instance_count(final SubLObject v_object, final SubLObject value) {
        final SubLObject v_class = (v_object.isSymbol()) ? classes.classes_retrieve_class(v_object) : NIL != subloop_structures.class_p(v_object) ? v_object : NIL != subloop_structures.instance_p(v_object) ? subloop_structures.instance_class(v_object) : NIL;
        if (NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc(INSTANCE_COUNT, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return set_aref(subloop_structures.class_any_slots(v_class), ZERO_INTEGER, value);
        }
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_object_class_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_object_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_object_instance_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_object_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        return NIL;
    }

    public static final SubLObject object_p_alt(SubLObject v_object) {
        return classes.subloop_instanceof_class(v_object, OBJECT);
    }

    public static SubLObject object_p(final SubLObject v_object) {
        return classes.subloop_instanceof_class(v_object, OBJECT);
    }

    public static final SubLObject object_new_method_alt(SubLObject self) {
        {
            SubLObject instance_count = com.cyc.cycjava.cycl.object.get_object_instance_count(self);
            if (NIL != instance_count) {
                instance_count = add(instance_count, ONE_INTEGER);
                com.cyc.cycjava.cycl.object.set_object_instance_count(self, instance_count);
            } else {
                instance_count = ZERO_INTEGER;
                com.cyc.cycjava.cycl.object.set_object_instance_count(self, instance_count);
            }
            {
                SubLObject instance = instances.new_instance(self);
                methods.funcall_instance_method_with_0_args(instance, INITIALIZE);
                return instance;
            }
        }
    }

    public static SubLObject object_new_method(final SubLObject self) {
        SubLObject instance_count = get_object_instance_count(self);
        if (NIL != instance_count) {
            instance_count = add(instance_count, ONE_INTEGER);
            set_object_instance_count(self, instance_count);
        } else {
            instance_count = ZERO_INTEGER;
            set_object_instance_count(self, instance_count);
        }
        final SubLObject instance = instances.new_instance(self);
        methods.funcall_instance_method_with_0_args(instance, INITIALIZE);
        return instance;
    }

    public static final SubLObject object_class_of_method_alt(SubLObject self) {
        return self;
    }

    public static SubLObject object_class_of_method(final SubLObject self) {
        return self;
    }

    public static final SubLObject object_describe_class_method_alt(SubLObject self, SubLObject stream, SubLObject depth) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        if (depth == UNPROVIDED) {
            depth = ZERO_INTEGER;
        }
        {
            SubLObject all_class_slots = classes.classes_all_class_slots(self, UNPROVIDED);
            SubLObject tab = (depth.isZero()) ? ((SubLObject) ($str_alt19$)) : Strings.make_string(multiply(depth, TWO_INTEGER), UNPROVIDED);
            SubLObject slot_tab = (depth.isZero()) ? ((SubLObject) ($str_alt20$__)) : Strings.make_string(add(multiply(depth, TWO_INTEGER), TWO_INTEGER), UNPROVIDED);
            format(stream, $str_alt21$___ADescription_of_class__S_, tab, subloop_structures.class_name(self));
            {
                SubLObject cdolist_list_var = all_class_slots;
                SubLObject class_slot = NIL;
                for (class_slot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , class_slot = cdolist_list_var.first()) {
                    format(stream, $str_alt22$___A_S_____S, new SubLObject[]{ slot_tab, class_slot, instances.get_slot(self, class_slot) });
                }
            }
            return self;
        }
    }

    public static SubLObject object_describe_class_method(final SubLObject self, SubLObject stream, SubLObject depth) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        if (depth == UNPROVIDED) {
            depth = ZERO_INTEGER;
        }
        final SubLObject all_class_slots = classes.classes_all_class_slots(self, UNPROVIDED);
        final SubLObject tab = (depth.isZero()) ? $str19$ : Strings.make_string(multiply(depth, TWO_INTEGER), UNPROVIDED);
        final SubLObject slot_tab = (depth.isZero()) ? $$$__ : Strings.make_string(add(multiply(depth, TWO_INTEGER), TWO_INTEGER), UNPROVIDED);
        format(stream, $str21$___ADescription_of_class__S_, tab, subloop_structures.class_name(self));
        SubLObject cdolist_list_var = all_class_slots;
        SubLObject class_slot = NIL;
        class_slot = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            format(stream, $str22$___A_S_____S, new SubLObject[]{ slot_tab, class_slot, instances.get_slot(self, class_slot) });
            cdolist_list_var = cdolist_list_var.rest();
            class_slot = cdolist_list_var.first();
        } 
        return self;
    }

    public static final SubLObject object_parent_class_method_alt(SubLObject self) {
        {
            SubLObject compiled_inheritance_path = subloop_structures.class_compiled_inheritance_path(self);
            if ((NIL != compiled_inheritance_path) && (NIL != compiled_inheritance_path.rest())) {
                return cadr(compiled_inheritance_path);
            }
            return NIL;
        }
    }

    public static SubLObject object_parent_class_method(final SubLObject self) {
        final SubLObject compiled_inheritance_path = subloop_structures.class_compiled_inheritance_path(self);
        if ((NIL != compiled_inheritance_path) && (NIL != compiled_inheritance_path.rest())) {
            return cadr(compiled_inheritance_path);
        }
        return NIL;
    }

    public static final SubLObject object_child_classes_method_alt(SubLObject self) {
        {
            SubLObject subclass_names = subloop_structures.class_subclasses(self);
            if (NIL != subclass_names) {
                {
                    SubLObject subclasses = NIL;
                    SubLObject subclass = NIL;
                    SubLObject cdolist_list_var = subclass_names;
                    SubLObject subclass_name = NIL;
                    for (subclass_name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subclass_name = cdolist_list_var.first()) {
                        subclass = classes.classes_retrieve_class(subclass_name);
                        if (NIL != subclass) {
                            subclasses = cons(subclass, subclasses);
                        }
                    }
                    return nreverse(subclasses);
                }
            }
            return NIL;
        }
    }

    public static SubLObject object_child_classes_method(final SubLObject self) {
        final SubLObject subclass_names = subloop_structures.class_subclasses(self);
        if (NIL != subclass_names) {
            SubLObject subclasses = NIL;
            SubLObject subclass = NIL;
            SubLObject cdolist_list_var = subclass_names;
            SubLObject subclass_name = NIL;
            subclass_name = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                subclass = classes.classes_retrieve_class(subclass_name);
                if (NIL != subclass) {
                    subclasses = cons(subclass, subclasses);
                }
                cdolist_list_var = cdolist_list_var.rest();
                subclass_name = cdolist_list_var.first();
            } 
            return nreverse(subclasses);
        }
        return NIL;
    }

    public static final SubLObject object_implements_method_p_method_alt(SubLObject self, SubLObject method_name) {
        {
            SubLObject my_class = (NIL != subloop_structures.class_p(self)) ? ((SubLObject) (self)) : subloop_structures.instance_class(self);
            SubLObject instance_method_access_list = subloop_structures.class_compiled_instance_method_access_alist(my_class);
            SubLObject class_method_access_list = subloop_structures.class_compiled_class_method_access_alist(my_class);
            return NIL != methods.method_assoc(method_name, instance_method_access_list) ? ((SubLObject) (T)) : NIL != methods.method_assoc(method_name, class_method_access_list) ? ((SubLObject) (T)) : NIL;
        }
    }

    public static SubLObject object_implements_method_p_method(final SubLObject self, final SubLObject method_name) {
        final SubLObject my_class = (NIL != subloop_structures.class_p(self)) ? self : subloop_structures.instance_class(self);
        final SubLObject instance_method_access_list = subloop_structures.class_compiled_instance_method_access_alist(my_class);
        final SubLObject class_method_access_list = subloop_structures.class_compiled_class_method_access_alist(my_class);
        return NIL != methods.method_assoc(method_name, instance_method_access_list) ? T : NIL != methods.method_assoc(method_name, class_method_access_list) ? T : NIL;
    }

    public static final SubLObject object_method_lambda_list_method_alt(SubLObject self, SubLObject method_name) {
        {
            SubLObject method = methods.method_assoc(method_name, subloop_structures.class_compiled_instance_method_access_alist(self));
            if (NIL == method) {
                method = methods.method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(self));
            }
            return subloop_structures.method_lambda_list(method);
        }
    }

    public static SubLObject object_method_lambda_list_method(final SubLObject self, final SubLObject method_name) {
        SubLObject method = methods.method_assoc(method_name, subloop_structures.class_compiled_instance_method_access_alist(self));
        if (NIL == method) {
            method = methods.method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(self));
        }
        return subloop_structures.method_lambda_list(method);
    }

    public static final SubLObject object_has_slot_p_method_alt(SubLObject self, SubLObject slot_name) {
        {
            SubLObject slot = slots.slot_assoc(slot_name, subloop_structures.class_compiled_instance_slot_access_alist(self));
            if (NIL == slot) {
                slot = slots.slot_assoc(slot_name, subloop_structures.class_compiled_class_slot_access_alist(self));
                if (NIL == slot) {
                    slot = slots.slot_assoc(slot_name, subloop_structures.class_compiled_instance_boolean_slot_access_alist(self));
                    if (NIL == slot) {
                        slot = slots.slot_assoc(slot_name, subloop_structures.class_compiled_class_boolean_slot_access_alist(self));
                    }
                }
            }
            return NIL != slot ? ((SubLObject) (T)) : NIL;
        }
    }

    public static SubLObject object_has_slot_p_method(final SubLObject self, final SubLObject slot_name) {
        SubLObject slot = slots.slot_assoc(slot_name, subloop_structures.class_compiled_instance_slot_access_alist(self));
        if (NIL == slot) {
            slot = slots.slot_assoc(slot_name, subloop_structures.class_compiled_class_slot_access_alist(self));
            if (NIL == slot) {
                slot = slots.slot_assoc(slot_name, subloop_structures.class_compiled_instance_boolean_slot_access_alist(self));
                if (NIL == slot) {
                    slot = slots.slot_assoc(slot_name, subloop_structures.class_compiled_class_boolean_slot_access_alist(self));
                }
            }
        }
        return NIL != slot ? T : NIL;
    }

    public static final SubLObject object_on_destroy_class_method_alt(SubLObject self) {
        return self;
    }

    public static SubLObject object_on_destroy_class_method(final SubLObject self) {
        return self;
    }

    /**
     * This is called by @xref CFASL-INPUT-INSTANCE.  Not meant to be called directly.
     * Use the public function @xref CFASL-INPUT or the like.
     *
     * @unknown bgottesm
     */
    @LispMethod(comment = "This is called by @xref CFASL-INPUT-INSTANCE.  Not meant to be called directly.\r\nUse the public function @xref CFASL-INPUT or the like.\r\n\r\n@unknown bgottesm\nThis is called by @xref CFASL-INPUT-INSTANCE.  Not meant to be called directly.\nUse the public function @xref CFASL-INPUT or the like.")
    public static final SubLObject object_cfasl_input_method_alt(SubLObject self, SubLObject stream) {
        {
            SubLObject class_name = subloop_structures.class_name(self);
            SubLObject instance = com.cyc.cycjava.cycl.object.new_class_instance(self);
            SubLObject number_of_slots = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject slot_name = NIL;
            SubLObject slot_value = NIL;
            SubLTrampolineFile.checkType(number_of_slots, INTEGERP);
            {
                SubLObject i = NIL;
                for (i = ZERO_INTEGER; i.numL(number_of_slots); i = add(i, ONE_INTEGER)) {
                    slot_name = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                    slot_value = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                    SubLTrampolineFile.checkType(slot_name, SYMBOLP);
                    eval(list(INLINE_SET_SLOT, list(slot_name, class_name), instance, list(QUOTE, slot_value)));
                }
            }
            return instance;
        }
    }

    /**
     * This is called by @xref CFASL-INPUT-INSTANCE.  Not meant to be called directly.
     * Use the public function @xref CFASL-INPUT or the like.
     *
     * @unknown bgottesm
     */
    @LispMethod(comment = "This is called by @xref CFASL-INPUT-INSTANCE.  Not meant to be called directly.\r\nUse the public function @xref CFASL-INPUT or the like.\r\n\r\n@unknown bgottesm\nThis is called by @xref CFASL-INPUT-INSTANCE.  Not meant to be called directly.\nUse the public function @xref CFASL-INPUT or the like.")
    public static SubLObject object_cfasl_input_method(final SubLObject self, final SubLObject stream) {
        final SubLObject class_name = subloop_structures.class_name(self);
        final SubLObject instance = new_class_instance(self);
        final SubLObject number_of_slots = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        SubLObject slot_name = NIL;
        SubLObject slot_value = NIL;
        assert NIL != integerp(number_of_slots) : "! integerp(number_of_slots) " + ("Types.integerp(number_of_slots) " + "CommonSymbols.NIL != Types.integerp(number_of_slots) ") + number_of_slots;
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(number_of_slots); i = add(i, ONE_INTEGER)) {
            slot_name = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            slot_value = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            assert NIL != symbolp(slot_name) : "! symbolp(slot_name) " + ("Types.symbolp(slot_name) " + "CommonSymbols.NIL != Types.symbolp(slot_name) ") + slot_name;
            eval(list(INLINE_SET_SLOT, list(slot_name, class_name), instance, list(QUOTE, slot_value)));
        }
        return instance;
    }

    public static final SubLObject object_initialize_method_alt(SubLObject self) {
        {
            SubLObject instance_count = com.cyc.cycjava.cycl.object.get_object_instance_count(self);
            SubLObject instance_number = com.cyc.cycjava.cycl.object.get_object_instance_number(self);
            SubLObject isolated_p = com.cyc.cycjava.cycl.object.get_object_isolated_p(self);
            isolated_p = NIL;
            com.cyc.cycjava.cycl.object.set_object_isolated_p(self, isolated_p);
            instance_number = instance_count;
            com.cyc.cycjava.cycl.object.set_object_instance_number(self, instance_number);
            return self;
        }
    }

    public static SubLObject object_initialize_method(final SubLObject self) {
        final SubLObject instance_count = get_object_instance_count(self);
        SubLObject instance_number = get_object_instance_number(self);
        SubLObject isolated_p = get_object_isolated_p(self);
        isolated_p = NIL;
        set_object_isolated_p(self, isolated_p);
        instance_number = instance_count;
        set_object_instance_number(self, instance_number);
        return self;
    }

    public static final SubLObject object_print_method_alt(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject catch_var_for_object_method = NIL;
            SubLObject instance_number = com.cyc.cycjava.cycl.object.get_object_instance_number(self);
            try {
                try {
                    if (NIL != subloop_structures.instance_p(self)) {
                        format(stream, $str_alt59$___S__S_, subloop_structures.class_name(subloop_structures.instance_class(self)), instance_number);
                    } else {
                        format(stream, $str_alt60$__Malformed_Instance_);
                    }
                    sublisp_throw($sym58$OUTER_CATCH_FOR_OBJECT_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.object.set_object_instance_number(self, instance_number);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_object_method = Errors.handleThrowable(ccatch_env_var, $sym58$OUTER_CATCH_FOR_OBJECT_METHOD);
            }
            return catch_var_for_object_method;
        }
    }

    public static SubLObject object_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_object_method = NIL;
        final SubLObject instance_number = get_object_instance_number(self);
        try {
            thread.throwStack.push($sym58$OUTER_CATCH_FOR_OBJECT_METHOD);
            try {
                if (NIL != subloop_structures.instance_p(self)) {
                    format(stream, $str59$___S__S_, subloop_structures.class_name(subloop_structures.instance_class(self)), instance_number);
                } else {
                    format(stream, $str60$__Malformed_Instance_);
                }
                sublisp_throw($sym58$OUTER_CATCH_FOR_OBJECT_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_object_instance_number(self, instance_number);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_object_method = Errors.handleThrowable(ccatch_env_var, $sym58$OUTER_CATCH_FOR_OBJECT_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_object_method;
    }

    public static final SubLObject object_equal_method_alt(SubLObject self, SubLObject v_object) {
        return eq(self, v_object);
    }

    public static SubLObject object_equal_method(final SubLObject self, final SubLObject v_object) {
        return eq(self, v_object);
    }

    public static final SubLObject object_essentially_equal_method_alt(SubLObject self, SubLObject v_object, SubLObject ignore_slots) {
        if (ignore_slots == UNPROVIDED) {
            ignore_slots = NIL;
        }
        {
            SubLObject v_class = subloop_structures.instance_class(self);
            SubLObject v_class_1 = v_class;
            SubLObject compiled_instance_slot_access_alist = subloop_structures.class_compiled_instance_slot_access_alist(v_class_1);
            SubLObject compiled_instance_boolean_slot_access_alist = subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class_1);
            SubLObject compiled_class_slot_access_alist = subloop_structures.class_compiled_class_slot_access_alist(v_class_1);
            SubLObject compiled_class_boolean_slot_access_alist = subloop_structures.class_compiled_class_boolean_slot_access_alist(v_class_1);
            {
                SubLObject slot_name = NIL;
                SubLObject cdolist_list_var = compiled_class_slot_access_alist;
                SubLObject slot = NIL;
                for (slot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , slot = cdolist_list_var.first()) {
                    if (NIL != slots.slot_essential(slot)) {
                        slot_name = slots.slot_name(slot);
                        if (NIL == member(slot_name, ignore_slots, UNPROVIDED, UNPROVIDED)) {
                            if (!instances.get_slot(self, slot_name).equal(instances.get_slot(v_object, slot_name))) {
                                return NIL;
                            }
                        }
                    }
                }
            }
            {
                SubLObject slot_name = NIL;
                SubLObject cdolist_list_var = compiled_class_boolean_slot_access_alist;
                SubLObject slot = NIL;
                for (slot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , slot = cdolist_list_var.first()) {
                    if (NIL != slots.slot_essential(slot)) {
                        slot_name = slots.slot_name(slot);
                        if (NIL == member(slot_name, ignore_slots, UNPROVIDED, UNPROVIDED)) {
                            if (!instances.get_slot(self, slot_name).equal(instances.get_slot(v_object, slot_name))) {
                                return NIL;
                            }
                        }
                    }
                }
            }
            {
                SubLObject slot_name = NIL;
                SubLObject cdolist_list_var = compiled_instance_slot_access_alist;
                SubLObject slot = NIL;
                for (slot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , slot = cdolist_list_var.first()) {
                    if (NIL != slots.slot_essential(slot)) {
                        slot_name = slots.slot_name(slot);
                        if (NIL == member(slot_name, ignore_slots, UNPROVIDED, UNPROVIDED)) {
                            if (!instances.get_slot(self, slot_name).equal(instances.get_slot(v_object, slot_name))) {
                                return NIL;
                            }
                        }
                    }
                }
            }
            {
                SubLObject slot_name = NIL;
                SubLObject cdolist_list_var = compiled_instance_boolean_slot_access_alist;
                SubLObject slot = NIL;
                for (slot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , slot = cdolist_list_var.first()) {
                    if (NIL != slots.slot_essential(slot)) {
                        slot_name = slots.slot_name(slot);
                        if (NIL == member(slot_name, ignore_slots, UNPROVIDED, UNPROVIDED)) {
                            if (!instances.get_slot(self, slot_name).equal(instances.get_slot(v_object, slot_name))) {
                                return NIL;
                            }
                        }
                    }
                }
            }
            return T;
        }
    }

    public static SubLObject object_essentially_equal_method(final SubLObject self, final SubLObject v_object, SubLObject ignore_slots) {
        if (ignore_slots == UNPROVIDED) {
            ignore_slots = NIL;
        }
        final SubLObject v_class_$1;
        final SubLObject v_class = v_class_$1 = subloop_structures.instance_class(self);
        final SubLObject compiled_instance_slot_access_alist = subloop_structures.class_compiled_instance_slot_access_alist(v_class_$1);
        final SubLObject compiled_instance_boolean_slot_access_alist = subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class_$1);
        final SubLObject compiled_class_slot_access_alist = subloop_structures.class_compiled_class_slot_access_alist(v_class_$1);
        final SubLObject compiled_class_boolean_slot_access_alist = subloop_structures.class_compiled_class_boolean_slot_access_alist(v_class_$1);
        SubLObject slot_name = NIL;
        SubLObject cdolist_list_var = compiled_class_slot_access_alist;
        SubLObject slot = NIL;
        slot = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != slots.slot_essential(slot)) {
                slot_name = slots.slot_name(slot);
                if ((NIL == member(slot_name, ignore_slots, UNPROVIDED, UNPROVIDED)) && (!instances.get_slot(self, slot_name).equal(instances.get_slot(v_object, slot_name)))) {
                    return NIL;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            slot = cdolist_list_var.first();
        } 
        slot_name = NIL;
        cdolist_list_var = compiled_class_boolean_slot_access_alist;
        slot = NIL;
        slot = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != slots.slot_essential(slot)) {
                slot_name = slots.slot_name(slot);
                if ((NIL == member(slot_name, ignore_slots, UNPROVIDED, UNPROVIDED)) && (!instances.get_slot(self, slot_name).equal(instances.get_slot(v_object, slot_name)))) {
                    return NIL;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            slot = cdolist_list_var.first();
        } 
        slot_name = NIL;
        cdolist_list_var = compiled_instance_slot_access_alist;
        slot = NIL;
        slot = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != slots.slot_essential(slot)) {
                slot_name = slots.slot_name(slot);
                if ((NIL == member(slot_name, ignore_slots, UNPROVIDED, UNPROVIDED)) && (!instances.get_slot(self, slot_name).equal(instances.get_slot(v_object, slot_name)))) {
                    return NIL;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            slot = cdolist_list_var.first();
        } 
        slot_name = NIL;
        cdolist_list_var = compiled_instance_boolean_slot_access_alist;
        slot = NIL;
        slot = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != slots.slot_essential(slot)) {
                slot_name = slots.slot_name(slot);
                if ((NIL == member(slot_name, ignore_slots, UNPROVIDED, UNPROVIDED)) && (!instances.get_slot(self, slot_name).equal(instances.get_slot(v_object, slot_name)))) {
                    return NIL;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            slot = cdolist_list_var.first();
        } 
        return T;
    }

    static private final SubLList $list_alt1 = list(new SubLObject[]{ list(makeSymbol("INSTANCE-COUNT"), makeKeyword("CLASS"), makeKeyword("VALUE"), ZERO_INTEGER, makeKeyword("PROTECTED")), list(makeSymbol("ISOLATED-P"), makeKeyword("BOOLEAN"), makeKeyword("PUBLIC")), list(makeSymbol("INSTANCE-NUMBER"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("NEW"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("CLASS-OF"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("DESCRIBE-CLASS"), list(makeSymbol("&OPTIONAL"), list(makeSymbol("STREAM"), T), list(makeSymbol("DEPTH"), ZERO_INTEGER)), makeKeyword("PUBLIC")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("PARENT-CLASS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("CHILD-CLASSES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("IMPLEMENTS-METHOD-P"), list(makeSymbol("METHOD-NAME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("METHOD-LAMBDA-LIST"), list(makeSymbol("METHOD-NAME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("HAS-SLOT-P"), list(makeSymbol("SLOT-NAME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("ON-DESTROY-CLASS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("CFASL-INPUT"), list(makeSymbol("STREAM")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), EQUAL, list(makeSymbol("OBJECT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ESSENTIALLY-EQUAL"), list(makeSymbol("OBJECT"), makeSymbol("&OPTIONAL"), list(makeSymbol("IGNORE-SLOTS"), NIL)), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLONE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DESCRIBE-INSTANCE"), list(makeSymbol("&OPTIONAL"), list(makeSymbol("STREAM"), T), list(makeSymbol("DEPTH"), ZERO_INTEGER)), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CFASL-OUTPUT"), list(makeSymbol("STREAM")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-GET-SLOT-LISTENER"), list(makeSymbol("TARGET-INSTANCE"), makeSymbol("TARGET-SLOT"), makeSymbol("MY-METHOD")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-GET-SLOT-LISTENER-STIMULATED-BY-VALUE"), list(makeSymbol("TARGET-INSTANCE"), makeSymbol("TARGET-SLOT"), makeSymbol("MY-METHOD"), makeSymbol("TRIGGER-VALUE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-GET-SLOT-LISTENER-STIMULATED-BY-RANGE"), list(makeSymbol("TARGET-INSTANCE"), makeSymbol("TARGET-SLOT"), makeSymbol("MY-METHOD"), makeSymbol("TRIGGER-VALUE-LOWER-BOUND"), makeSymbol("TRIGGER-VALUE-UPPER-BOUND")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-GET-SLOT-LISTENER-STIMULATED-BY-ENUM"), list(makeSymbol("TARGET-INSTANCE"), makeSymbol("TARGET-SLOT"), makeSymbol("MY-METHOD"), makeSymbol("TRIGGER-ENUMERATION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-SET-SLOT-LISTENER"), list(makeSymbol("TARGET-INSTANCE"), makeSymbol("TARGET-SLOT"), makeSymbol("MY-METHOD")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-SET-SLOT-LISTENER-STIMULATED-BY-VALUE"), list(makeSymbol("TARGET-INSTANCE"), makeSymbol("TARGET-SLOT"), makeSymbol("MY-METHOD"), makeSymbol("TRIGGER-VALUE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-SET-SLOT-LISTENER-STIMULATED-BY-RANGE"), list(makeSymbol("TARGET-INSTANCE"), makeSymbol("TARGET-SLOT"), makeSymbol("MY-METHOD"), makeSymbol("TRIGGER-VALUE-LOWER-BOUND"), makeSymbol("TRIGGER-VALUE-UPPER-BOUND")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-SET-SLOT-LISTENER-STIMULATED-BY-ENUM"), list(makeSymbol("TARGET-INSTANCE"), makeSymbol("TARGET-SLOT"), makeSymbol("MY-METHOD"), makeSymbol("TRIGGER-ENUMERATION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-ALL-GET-SLOT-LISTENERS"), list(makeSymbol("TARGET-INSTANCE"), makeSymbol("&OPTIONAL"), list(makeSymbol("TARGET-SLOT"), NIL)), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-ALL-SET-SLOT-LISTENERS"), list(makeSymbol("TARGET-INSTANCE"), makeSymbol("&OPTIONAL"), list(makeSymbol("TARGET-SLOT"), NIL)), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-ALL-SLOT-LISTENERS"), list(makeSymbol("TARGET-INSTANCE"), makeSymbol("&OPTIONAL"), list(makeSymbol("TARGET-SLOT"), NIL)), makeKeyword("PUBLIC")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("ADD-CLASS-WIDE-BEFORE-METHOD-LISTENER"), list(makeSymbol("CLASS"), makeSymbol("TARGET-METHOD"), makeSymbol("MY-METHOD")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("ADD-CLASS-WIDE-AFTER-METHOD-LISTENER"), list(makeSymbol("CLASS"), makeSymbol("TARGET-METHOD"), makeSymbol("MY-METHOD")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("REMOVE-ALL-CLASS-WIDE-METHOD-LISTENERS"), list(makeSymbol("MONITORED-INSTANCE"), makeSymbol("&OPTIONAL"), list(makeSymbol("TARGET-METHOD"), NIL)), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ISOLATE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PLISTIFY"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LISTIFY"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ASSIMILATE"), list(makeSymbol("PLISTIFIED-CONTENT")), makeKeyword("PUBLIC")) });

    public static final SubLObject object_clone_method_alt(SubLObject self) {
        {
            SubLObject class_of_self = subloop_structures.instance_class(self);
            return methods.funcall_class_method_with_0_args(class_of_self, NEW);
        }
    }

    public static SubLObject object_clone_method(final SubLObject self) {
        final SubLObject class_of_self = subloop_structures.instance_class(self);
        return methods.funcall_class_method_with_0_args(class_of_self, NEW);
    }

    public static final SubLObject object_describe_instance_method_alt(SubLObject self, SubLObject stream, SubLObject depth) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        if (depth == UNPROVIDED) {
            depth = ZERO_INTEGER;
        }
        {
            SubLObject all_instance_slots = instances.instances_all_instance_slots(self);
            SubLObject tab = (depth.isZero()) ? ((SubLObject) ($str_alt19$)) : Strings.make_string(multiply(depth, TWO_INTEGER), UNPROVIDED);
            SubLObject slot_tab = (depth.isZero()) ? ((SubLObject) ($str_alt20$__)) : Strings.make_string(add(multiply(depth, TWO_INTEGER), TWO_INTEGER), UNPROVIDED);
            format(stream, $str_alt74$___ADescription_of_instance__S_, tab, self);
            methods.funcall_instance_method_with_2_args(self, DESCRIBE_CLASS, stream, number_utilities.f_1X(depth));
            {
                SubLObject cdolist_list_var = all_instance_slots;
                SubLObject instance_slot = NIL;
                for (instance_slot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , instance_slot = cdolist_list_var.first()) {
                    format(stream, $str_alt22$___A_S_____S, new SubLObject[]{ slot_tab, instance_slot, instances.get_slot(self, instance_slot) });
                }
            }
            return self;
        }
    }

    public static SubLObject object_describe_instance_method(final SubLObject self, SubLObject stream, SubLObject depth) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        if (depth == UNPROVIDED) {
            depth = ZERO_INTEGER;
        }
        final SubLObject all_instance_slots = instances.instances_all_instance_slots(self);
        final SubLObject tab = (depth.isZero()) ? $str19$ : Strings.make_string(multiply(depth, TWO_INTEGER), UNPROVIDED);
        final SubLObject slot_tab = (depth.isZero()) ? $$$__ : Strings.make_string(add(multiply(depth, TWO_INTEGER), TWO_INTEGER), UNPROVIDED);
        format(stream, $str74$___ADescription_of_instance__S_, tab, self);
        methods.funcall_instance_method_with_2_args(self, DESCRIBE_CLASS, stream, number_utilities.f_1X(depth));
        SubLObject cdolist_list_var = all_instance_slots;
        SubLObject instance_slot = NIL;
        instance_slot = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            format(stream, $str22$___A_S_____S, new SubLObject[]{ slot_tab, instance_slot, instances.get_slot(self, instance_slot) });
            cdolist_list_var = cdolist_list_var.rest();
            instance_slot = cdolist_list_var.first();
        } 
        return self;
    }

    /**
     * This is called by @xref CFASL-OUTPUT-OBJECT.  It is not meant to be called directly.
     * Use the public function @xref CFASL-OUTPUT or the like.
     *
     * @unknown bgottesm
     */
    @LispMethod(comment = "This is called by @xref CFASL-OUTPUT-OBJECT.  It is not meant to be called directly.\r\nUse the public function @xref CFASL-OUTPUT or the like.\r\n\r\n@unknown bgottesm\nThis is called by @xref CFASL-OUTPUT-OBJECT.  It is not meant to be called directly.\nUse the public function @xref CFASL-OUTPUT or the like.")
    public static final SubLObject object_cfasl_output_method_alt(SubLObject self, SubLObject stream) {
        {
            SubLObject v_class = subloop_structures.instance_class(self);
            SubLObject class_name = subloop_structures.class_name(v_class);
            cfasl_output(class_name, stream);
            {
                SubLObject v_class_2 = v_class;
                SubLObject compiled_instance_slot_access_alist = subloop_structures.class_compiled_instance_slot_access_alist(v_class_2);
                SubLObject compiled_instance_boolean_slot_access_alist = subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class_2);
                SubLObject instance_slots = append(compiled_instance_slot_access_alist, compiled_instance_boolean_slot_access_alist);
                instance_slots = delete(INSTANCE_NUMBER, instance_slots, symbol_function(EQ), SLOT_NAME, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                {
                    SubLObject number_of_slots = length(instance_slots);
                    cfasl_output(number_of_slots, stream);
                    {
                        SubLObject slot_name = NIL;
                        SubLObject cdolist_list_var = instance_slots;
                        SubLObject slot = NIL;
                        for (slot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , slot = cdolist_list_var.first()) {
                            slot_name = slots.slot_name(slot);
                            cfasl_output(slot_name, stream);
                            cfasl_output(eval(list(INLINE_GET_SLOT, list(slot_name, class_name), self)), stream);
                        }
                    }
                }
            }
            return self;
        }
    }

    /**
     * This is called by @xref CFASL-OUTPUT-OBJECT.  It is not meant to be called directly.
     * Use the public function @xref CFASL-OUTPUT or the like.
     *
     * @unknown bgottesm
     */
    @LispMethod(comment = "This is called by @xref CFASL-OUTPUT-OBJECT.  It is not meant to be called directly.\r\nUse the public function @xref CFASL-OUTPUT or the like.\r\n\r\n@unknown bgottesm\nThis is called by @xref CFASL-OUTPUT-OBJECT.  It is not meant to be called directly.\nUse the public function @xref CFASL-OUTPUT or the like.")
    public static SubLObject object_cfasl_output_method(final SubLObject self, final SubLObject stream) {
        final SubLObject v_class = subloop_structures.instance_class(self);
        final SubLObject class_name = subloop_structures.class_name(v_class);
        cfasl_output(class_name, stream);
        final SubLObject v_class_$2 = v_class;
        final SubLObject compiled_instance_slot_access_alist = subloop_structures.class_compiled_instance_slot_access_alist(v_class_$2);
        final SubLObject compiled_instance_boolean_slot_access_alist = subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class_$2);
        SubLObject instance_slots = append(compiled_instance_slot_access_alist, compiled_instance_boolean_slot_access_alist);
        instance_slots = delete(INSTANCE_NUMBER, instance_slots, symbol_function(EQ), SLOT_NAME, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject number_of_slots = length(instance_slots);
        cfasl_output(number_of_slots, stream);
        SubLObject slot_name = NIL;
        SubLObject cdolist_list_var = instance_slots;
        SubLObject slot = NIL;
        slot = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            slot_name = slots.slot_name(slot);
            cfasl_output(slot_name, stream);
            cfasl_output(eval(list(INLINE_GET_SLOT, list(slot_name, class_name), self)), stream);
            cdolist_list_var = cdolist_list_var.rest();
            slot = cdolist_list_var.first();
        } 
        return self;
    }

    public static final SubLObject object_add_get_slot_listener_method_alt(SubLObject self, SubLObject target_instance, SubLObject target_slot, SubLObject my_method) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == subloop_structures.instance_p(target_instance)) {
                    Errors.error($str_alt85$_ADD_GET_SLOT_LISTENER_OBJECT___t, target_instance);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!target_slot.isSymbol()) {
                    Errors.error($str_alt86$_ADD_GET_SLOT_LISTENER_OBJECT___t, target_slot);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!my_method.isSymbol()) {
                    Errors.error($str_alt87$_ADD_GET_SLOT_LISTENER_OBJECT___m, my_method);
                }
            }
            slot_listeners.add_generic_slot_listener(target_instance, target_slot, $GET, my_method, self);
            return my_method;
        }
    }

    public static SubLObject object_add_get_slot_listener_method(final SubLObject self, final SubLObject target_instance, final SubLObject target_slot, final SubLObject my_method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subloop_structures.instance_p(target_instance))) {
            Errors.error($str85$_ADD_GET_SLOT_LISTENER_OBJECT___t, target_instance);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!target_slot.isSymbol())) {
            Errors.error($str86$_ADD_GET_SLOT_LISTENER_OBJECT___t, target_slot);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!my_method.isSymbol())) {
            Errors.error($str87$_ADD_GET_SLOT_LISTENER_OBJECT___m, my_method);
        }
        slot_listeners.add_generic_slot_listener(target_instance, target_slot, $GET, my_method, self);
        return my_method;
    }

    public static final SubLObject object_add_get_slot_listener_stimulated_by_value_method_alt(SubLObject self, SubLObject target_instance, SubLObject target_slot, SubLObject my_method, SubLObject trigger_value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == subloop_structures.instance_p(target_instance)) {
                    Errors.error($str_alt93$_ADD_GET_SLOT_LISTENER_STIMULATED, target_instance);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!target_slot.isSymbol()) {
                    Errors.error($str_alt94$_ADD_GET_SLOT_LISTENER_STIMULATED, target_slot);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!my_method.isSymbol()) {
                    Errors.error($str_alt95$_ADD_GET_SLOT_LISTENER_STIMULATED, my_method);
                }
            }
            slot_listeners.add_generic_slot_listener_stimulated_by_value(target_instance, target_slot, $GET, my_method, self, trigger_value);
            return my_method;
        }
    }

    public static SubLObject object_add_get_slot_listener_stimulated_by_value_method(final SubLObject self, final SubLObject target_instance, final SubLObject target_slot, final SubLObject my_method, final SubLObject trigger_value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subloop_structures.instance_p(target_instance))) {
            Errors.error($str93$_ADD_GET_SLOT_LISTENER_STIMULATED, target_instance);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!target_slot.isSymbol())) {
            Errors.error($str94$_ADD_GET_SLOT_LISTENER_STIMULATED, target_slot);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!my_method.isSymbol())) {
            Errors.error($str95$_ADD_GET_SLOT_LISTENER_STIMULATED, my_method);
        }
        slot_listeners.add_generic_slot_listener_stimulated_by_value(target_instance, target_slot, $GET, my_method, self, trigger_value);
        return my_method;
    }

    public static final SubLObject object_add_get_slot_listener_stimulated_by_range_method_alt(SubLObject self, SubLObject target_instance, SubLObject target_slot, SubLObject my_method, SubLObject trigger_value_lower_bound, SubLObject trigger_value_upper_bound) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == subloop_structures.instance_p(target_instance)) {
                    Errors.error($str_alt100$_ADD_GET_SLOT_LISTENER_STIMULATED, target_instance);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!target_slot.isSymbol()) {
                    Errors.error($str_alt101$_ADD_GET_SLOT_LISTENER_STIMULATED, target_slot);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!my_method.isSymbol()) {
                    Errors.error($str_alt102$_ADD_GET_SLOT_LISTENER_STIMULATED, my_method);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!(((trigger_value_lower_bound.isNumber() && trigger_value_upper_bound.isNumber()) || (trigger_value_lower_bound.isString() && trigger_value_upper_bound.isString())) || (trigger_value_lower_bound.isChar() && trigger_value_upper_bound.isChar()))) {
                    Errors.error($str_alt103$_ADD_GET_SLOT_LISTENER_STIMULATED, trigger_value_lower_bound, trigger_value_upper_bound);
                }
            }
            slot_listeners.add_generic_slot_listener_stimulated_by_range(target_instance, target_slot, $GET, my_method, self, trigger_value_lower_bound, trigger_value_upper_bound);
            return my_method;
        }
    }

    public static SubLObject object_add_get_slot_listener_stimulated_by_range_method(final SubLObject self, final SubLObject target_instance, final SubLObject target_slot, final SubLObject my_method, final SubLObject trigger_value_lower_bound, final SubLObject trigger_value_upper_bound) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subloop_structures.instance_p(target_instance))) {
            Errors.error($str100$_ADD_GET_SLOT_LISTENER_STIMULATED, target_instance);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!target_slot.isSymbol())) {
            Errors.error($str101$_ADD_GET_SLOT_LISTENER_STIMULATED, target_slot);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!my_method.isSymbol())) {
            Errors.error($str102$_ADD_GET_SLOT_LISTENER_STIMULATED, my_method);
        }
        if ((((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((!trigger_value_lower_bound.isNumber()) || (!trigger_value_upper_bound.isNumber()))) && ((!trigger_value_lower_bound.isString()) || (!trigger_value_upper_bound.isString()))) && ((!trigger_value_lower_bound.isChar()) || (!trigger_value_upper_bound.isChar()))) {
            Errors.error($str103$_ADD_GET_SLOT_LISTENER_STIMULATED, trigger_value_lower_bound, trigger_value_upper_bound);
        }
        slot_listeners.add_generic_slot_listener_stimulated_by_range(target_instance, target_slot, $GET, my_method, self, trigger_value_lower_bound, trigger_value_upper_bound);
        return my_method;
    }

    static private final SubLList $list_alt9 = list(makeKeyword("AUTO-UPDATE"));

    static private final SubLList $list_alt10 = list(list(makeSymbol("PIF"), makeSymbol("INSTANCE-COUNT"), list(makeSymbol("CINC"), makeSymbol("INSTANCE-COUNT")), list(makeSymbol("CSETQ"), makeSymbol("INSTANCE-COUNT"), ZERO_INTEGER)), list(makeSymbol("CLET"), list(list(makeSymbol("INSTANCE"), list(makeSymbol("NEW-INSTANCE"), makeSymbol("SELF")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("INSTANCE"), list(QUOTE, makeSymbol("INITIALIZE"))), list(RET, makeSymbol("INSTANCE"))));

    static private final SubLList $list_alt14 = list(list(RET, makeSymbol("SELF")));

    public static final SubLObject object_add_get_slot_listener_stimulated_by_enum_method_alt(SubLObject self, SubLObject target_instance, SubLObject target_slot, SubLObject my_method, SubLObject trigger_enumeration) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == subloop_structures.instance_p(target_instance)) {
                    Errors.error($str_alt108$_ADD_GET_SLOT_LISTENER_STIMULATED, target_instance);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!target_slot.isSymbol()) {
                    Errors.error($str_alt109$_ADD_GET_SLOT_LISTENER_STIMULATED, target_slot);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!my_method.isSymbol()) {
                    Errors.error($str_alt110$_ADD_GET_SLOT_LISTENER_STIMULATED, my_method);
                }
            }
            slot_listeners.add_generic_slot_listener_stimulated_by_enum(target_instance, target_slot, $GET, my_method, self, trigger_enumeration);
            return my_method;
        }
    }

    public static SubLObject object_add_get_slot_listener_stimulated_by_enum_method(final SubLObject self, final SubLObject target_instance, final SubLObject target_slot, final SubLObject my_method, final SubLObject trigger_enumeration) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subloop_structures.instance_p(target_instance))) {
            Errors.error($str108$_ADD_GET_SLOT_LISTENER_STIMULATED, target_instance);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!target_slot.isSymbol())) {
            Errors.error($str109$_ADD_GET_SLOT_LISTENER_STIMULATED, target_slot);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!my_method.isSymbol())) {
            Errors.error($str110$_ADD_GET_SLOT_LISTENER_STIMULATED, my_method);
        }
        slot_listeners.add_generic_slot_listener_stimulated_by_enum(target_instance, target_slot, $GET, my_method, self, trigger_enumeration);
        return my_method;
    }

    static private final SubLList $list_alt17 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("STREAM"), T), list(makeSymbol("DEPTH"), ZERO_INTEGER));

    static private final SubLList $list_alt18 = list(list(makeSymbol("CLET"), list(list(makeSymbol("ALL-CLASS-SLOTS"), list(makeSymbol("CLASSES-ALL-CLASS-SLOTS"), makeSymbol("SELF"))), list(makeSymbol("TAB"), list(makeSymbol("FIF"), list(makeSymbol("ZEROP"), makeSymbol("DEPTH")), makeString(""), list(makeSymbol("MAKE-STRING"), list(makeSymbol("*"), makeSymbol("DEPTH"), TWO_INTEGER)))), list(makeSymbol("SLOT-TAB"), list(makeSymbol("FIF"), list(makeSymbol("ZEROP"), makeSymbol("DEPTH")), makeString("  "), list(makeSymbol("MAKE-STRING"), list(makeSymbol("+"), list(makeSymbol("*"), makeSymbol("DEPTH"), TWO_INTEGER), TWO_INTEGER))))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("~%~ADescription of class ~S:"), makeSymbol("TAB"), list(makeSymbol("CLASS-NAME"), makeSymbol("SELF"))), list(makeSymbol("CDOLIST"), list(makeSymbol("CLASS-SLOT"), makeSymbol("ALL-CLASS-SLOTS")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("~%~A~S -> ~S"), makeSymbol("SLOT-TAB"), makeSymbol("CLASS-SLOT"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), makeSymbol("CLASS-SLOT")))), list(RET, makeSymbol("SELF"))));

    public static final SubLObject object_add_set_slot_listener_method_alt(SubLObject self, SubLObject target_instance, SubLObject target_slot, SubLObject my_method) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == subloop_structures.instance_p(target_instance)) {
                    Errors.error($str_alt114$_ADD_SET_SLOT_LISTENER_OBJECT___t, target_instance);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!target_slot.isSymbol()) {
                    Errors.error($str_alt115$_ADD_SET_SLOT_LISTENER_OBJECT___t, target_slot);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!my_method.isSymbol()) {
                    Errors.error($str_alt116$_ADD_SET_SLOT_LISTENER_OBJECT___m, my_method);
                }
            }
            slot_listeners.add_generic_slot_listener(target_instance, target_slot, $SET, my_method, self);
            return my_method;
        }
    }

    public static SubLObject object_add_set_slot_listener_method(final SubLObject self, final SubLObject target_instance, final SubLObject target_slot, final SubLObject my_method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subloop_structures.instance_p(target_instance))) {
            Errors.error($str114$_ADD_SET_SLOT_LISTENER_OBJECT___t, target_instance);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!target_slot.isSymbol())) {
            Errors.error($str115$_ADD_SET_SLOT_LISTENER_OBJECT___t, target_slot);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!my_method.isSymbol())) {
            Errors.error($str116$_ADD_SET_SLOT_LISTENER_OBJECT___m, my_method);
        }
        slot_listeners.add_generic_slot_listener(target_instance, target_slot, $SET, my_method, self);
        return my_method;
    }

    static private final SubLString $str_alt20$__ = makeString("  ");

    static private final SubLString $str_alt21$___ADescription_of_class__S_ = makeString("~%~ADescription of class ~S:");

    static private final SubLString $str_alt22$___A_S_____S = makeString("~%~A~S -> ~S");

    static private final SubLList $list_alt25 = list(list(makeSymbol("CLET"), list(list(makeSymbol("COMPILED-INHERITANCE-PATH"), list(makeSymbol("CLASS-COMPILED-INHERITANCE-PATH"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("COMPILED-INHERITANCE-PATH"), list(makeSymbol("CDR"), makeSymbol("COMPILED-INHERITANCE-PATH"))), list(RET, list(makeSymbol("CADR"), makeSymbol("COMPILED-INHERITANCE-PATH")))), list(RET, NIL)));

    public static final SubLObject object_add_set_slot_listener_stimulated_by_value_method_alt(SubLObject self, SubLObject target_instance, SubLObject target_slot, SubLObject my_method, SubLObject trigger_value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == subloop_structures.instance_p(target_instance)) {
                    Errors.error($str_alt121$_ADD_SET_SLOT_LISTENER_STIMULATED, target_instance);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!target_slot.isSymbol()) {
                    Errors.error($str_alt122$_ADD_SET_SLOT_LISTENER_STIMULATED, target_slot);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!my_method.isSymbol()) {
                    Errors.error($str_alt123$_ADD_SET_SLOT_LISTENER_STIMULATED, my_method);
                }
            }
            slot_listeners.add_generic_slot_listener_stimulated_by_value(target_instance, target_slot, $SET, my_method, self, trigger_value);
            return my_method;
        }
    }

    public static SubLObject object_add_set_slot_listener_stimulated_by_value_method(final SubLObject self, final SubLObject target_instance, final SubLObject target_slot, final SubLObject my_method, final SubLObject trigger_value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subloop_structures.instance_p(target_instance))) {
            Errors.error($str121$_ADD_SET_SLOT_LISTENER_STIMULATED, target_instance);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!target_slot.isSymbol())) {
            Errors.error($str122$_ADD_SET_SLOT_LISTENER_STIMULATED, target_slot);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!my_method.isSymbol())) {
            Errors.error($str123$_ADD_SET_SLOT_LISTENER_STIMULATED, my_method);
        }
        slot_listeners.add_generic_slot_listener_stimulated_by_value(target_instance, target_slot, $SET, my_method, self, trigger_value);
        return my_method;
    }

    static private final SubLList $list_alt28 = list(list(makeSymbol("CLET"), list(list(makeSymbol("SUBCLASS-NAMES"), list(makeSymbol("CLASS-SUBCLASSES"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("SUBCLASS-NAMES"), list(makeSymbol("CLET"), list(list(makeSymbol("SUBCLASSES"), NIL), list(makeSymbol("SUBCLASS"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("SUBCLASS-NAME"), makeSymbol("SUBCLASS-NAMES")), list(makeSymbol("CSETQ"), makeSymbol("SUBCLASS"), list(makeSymbol("CLASSES-RETRIEVE-CLASS"), makeSymbol("SUBCLASS-NAME"))), list(makeSymbol("PWHEN"), makeSymbol("SUBCLASS"), list(makeSymbol("CPUSH"), makeSymbol("SUBCLASS"), makeSymbol("SUBCLASSES")))), list(RET, list(makeSymbol("NREVERSE"), makeSymbol("SUBCLASSES"))))), list(RET, NIL)));

    public static final SubLObject object_add_set_slot_listener_stimulated_by_range_method_alt(SubLObject self, SubLObject target_instance, SubLObject target_slot, SubLObject my_method, SubLObject trigger_value_lower_bound, SubLObject trigger_value_upper_bound) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == subloop_structures.instance_p(target_instance)) {
                    Errors.error($str_alt127$_ADD_SET_SLOT_LISTENER_STIMULATED, target_instance);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!target_slot.isSymbol()) {
                    Errors.error($str_alt128$_ADD_SET_SLOT_LISTENER_STIMULATED, target_slot);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!my_method.isSymbol()) {
                    Errors.error($str_alt129$_ADD_SET_SLOT_LISTENER_STIMULATED, my_method);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!(((trigger_value_lower_bound.isNumber() && trigger_value_upper_bound.isNumber()) || (trigger_value_lower_bound.isString() && trigger_value_upper_bound.isString())) || (trigger_value_lower_bound.isChar() && trigger_value_upper_bound.isChar()))) {
                    Errors.error($str_alt130$_ADD_SET_SLOT_LISTENER_STIMULATED, trigger_value_lower_bound, trigger_value_upper_bound);
                }
            }
            slot_listeners.add_generic_slot_listener_stimulated_by_range(target_instance, target_slot, $SET, my_method, self, trigger_value_lower_bound, trigger_value_upper_bound);
            return my_method;
        }
    }

    public static SubLObject object_add_set_slot_listener_stimulated_by_range_method(final SubLObject self, final SubLObject target_instance, final SubLObject target_slot, final SubLObject my_method, final SubLObject trigger_value_lower_bound, final SubLObject trigger_value_upper_bound) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subloop_structures.instance_p(target_instance))) {
            Errors.error($str127$_ADD_SET_SLOT_LISTENER_STIMULATED, target_instance);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!target_slot.isSymbol())) {
            Errors.error($str128$_ADD_SET_SLOT_LISTENER_STIMULATED, target_slot);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!my_method.isSymbol())) {
            Errors.error($str129$_ADD_SET_SLOT_LISTENER_STIMULATED, my_method);
        }
        if ((((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((!trigger_value_lower_bound.isNumber()) || (!trigger_value_upper_bound.isNumber()))) && ((!trigger_value_lower_bound.isString()) || (!trigger_value_upper_bound.isString()))) && ((!trigger_value_lower_bound.isChar()) || (!trigger_value_upper_bound.isChar()))) {
            Errors.error($str130$_ADD_SET_SLOT_LISTENER_STIMULATED, trigger_value_lower_bound, trigger_value_upper_bound);
        }
        slot_listeners.add_generic_slot_listener_stimulated_by_range(target_instance, target_slot, $SET, my_method, self, trigger_value_lower_bound, trigger_value_upper_bound);
        return my_method;
    }

    static private final SubLList $list_alt31 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt32 = list(makeSymbol("METHOD-NAME"));

    static private final SubLList $list_alt33 = list(list(makeSymbol("CLET"), list(list(makeSymbol("MY-CLASS"), list(makeSymbol("FIF"), list(makeSymbol("CLASS-P"), makeSymbol("SELF")), makeSymbol("SELF"), list(makeSymbol("INSTANCE-CLASS"), makeSymbol("SELF")))), list(makeSymbol("INSTANCE-METHOD-ACCESS-LIST"), list(makeSymbol("CLASS-COMPILED-INSTANCE-METHOD-ACCESS-ALIST"), makeSymbol("MY-CLASS"))), list(makeSymbol("CLASS-METHOD-ACCESS-LIST"), list(makeSymbol("CLASS-COMPILED-CLASS-METHOD-ACCESS-ALIST"), makeSymbol("MY-CLASS")))), list(RET, list(makeSymbol("FIF"), list(makeSymbol("METHOD-ASSOC"), makeSymbol("METHOD-NAME"), makeSymbol("INSTANCE-METHOD-ACCESS-LIST")), T, list(makeSymbol("FIF"), list(makeSymbol("METHOD-ASSOC"), makeSymbol("METHOD-NAME"), makeSymbol("CLASS-METHOD-ACCESS-LIST")), T, NIL)))));

    public static final SubLObject object_add_set_slot_listener_stimulated_by_enum_method_alt(SubLObject self, SubLObject target_instance, SubLObject target_slot, SubLObject my_method, SubLObject trigger_enumeration) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == subloop_structures.instance_p(target_instance)) {
                    Errors.error($str_alt134$_ADD_SET_SLOT_LISTENER_STIMULATED, target_instance);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!target_slot.isSymbol()) {
                    Errors.error($str_alt135$_ADD_SET_SLOT_LISTENER_STIMULATED, target_slot);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!my_method.isSymbol()) {
                    Errors.error($str_alt136$_ADD_SET_SLOT_LISTENER_STIMULATED, my_method);
                }
            }
            slot_listeners.add_generic_slot_listener_stimulated_by_enum(target_instance, target_slot, $SET, my_method, self, trigger_enumeration);
            return my_method;
        }
    }

    public static SubLObject object_add_set_slot_listener_stimulated_by_enum_method(final SubLObject self, final SubLObject target_instance, final SubLObject target_slot, final SubLObject my_method, final SubLObject trigger_enumeration) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subloop_structures.instance_p(target_instance))) {
            Errors.error($str134$_ADD_SET_SLOT_LISTENER_STIMULATED, target_instance);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!target_slot.isSymbol())) {
            Errors.error($str135$_ADD_SET_SLOT_LISTENER_STIMULATED, target_slot);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!my_method.isSymbol())) {
            Errors.error($str136$_ADD_SET_SLOT_LISTENER_STIMULATED, my_method);
        }
        slot_listeners.add_generic_slot_listener_stimulated_by_enum(target_instance, target_slot, $SET, my_method, self, trigger_enumeration);
        return my_method;
    }

    static private final SubLList $list_alt36 = list(list(makeSymbol("CLET"), list(list(makeSymbol("METHOD"), list(makeSymbol("METHOD-ASSOC"), makeSymbol("METHOD-NAME"), list(makeSymbol("CLASS-COMPILED-INSTANCE-METHOD-ACCESS-ALIST"), makeSymbol("SELF"))))), list(makeSymbol("PUNLESS"), makeSymbol("METHOD"), list(makeSymbol("CSETQ"), makeSymbol("METHOD"), list(makeSymbol("METHOD-ASSOC"), makeSymbol("METHOD-NAME"), list(makeSymbol("CLASS-COMPILED-CLASS-METHOD-ACCESS-ALIST"), makeSymbol("SELF"))))), list(RET, list(makeSymbol("METHOD-LAMBDA-LIST"), makeSymbol("METHOD")))));

    static private final SubLList $list_alt39 = list(makeSymbol("SLOT-NAME"));

    static private final SubLList $list_alt40 = list(list(makeSymbol("CLET"), list(list(makeSymbol("SLOT"), list(makeSymbol("SLOT-ASSOC"), makeSymbol("SLOT-NAME"), list(makeSymbol("CLASS-COMPILED-INSTANCE-SLOT-ACCESS-ALIST"), makeSymbol("SELF"))))), list(makeSymbol("PUNLESS"), makeSymbol("SLOT"), list(makeSymbol("CSETQ"), makeSymbol("SLOT"), list(makeSymbol("SLOT-ASSOC"), makeSymbol("SLOT-NAME"), list(makeSymbol("CLASS-COMPILED-CLASS-SLOT-ACCESS-ALIST"), makeSymbol("SELF")))), list(makeSymbol("PUNLESS"), makeSymbol("SLOT"), list(makeSymbol("CSETQ"), makeSymbol("SLOT"), list(makeSymbol("SLOT-ASSOC"), makeSymbol("SLOT-NAME"), list(makeSymbol("CLASS-COMPILED-INSTANCE-BOOLEAN-SLOT-ACCESS-ALIST"), makeSymbol("SELF")))), list(makeSymbol("PUNLESS"), makeSymbol("SLOT"), list(makeSymbol("CSETQ"), makeSymbol("SLOT"), list(makeSymbol("SLOT-ASSOC"), makeSymbol("SLOT-NAME"), list(makeSymbol("CLASS-COMPILED-CLASS-BOOLEAN-SLOT-ACCESS-ALIST"), makeSymbol("SELF"))))))), list(RET, list(makeSymbol("FIF"), makeSymbol("SLOT"), T, NIL))));

    public static final SubLObject object_remove_all_get_slot_listeners_method_alt(SubLObject self, SubLObject target_instance, SubLObject target_slot) {
        if (target_slot == UNPROVIDED) {
            target_slot = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == subloop_structures.instance_p(target_instance)) {
                    Errors.error($str_alt141$_REMOVE_ALL_GET_SLOT_LISTENERS_OB, target_instance);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!target_slot.isSymbol()) {
                    Errors.error($str_alt142$_REMOVE_ALL_GET_SLOT_LISTENERS_OB, target_slot);
                }
            }
            return slot_listeners.slot_listeners_remove_all_get_slot_listeners(target_instance, self, target_slot);
        }
    }

    public static SubLObject object_remove_all_get_slot_listeners_method(final SubLObject self, final SubLObject target_instance, SubLObject target_slot) {
        if (target_slot == UNPROVIDED) {
            target_slot = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subloop_structures.instance_p(target_instance))) {
            Errors.error($str141$_REMOVE_ALL_GET_SLOT_LISTENERS_OB, target_instance);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!target_slot.isSymbol())) {
            Errors.error($str142$_REMOVE_ALL_GET_SLOT_LISTENERS_OB, target_slot);
        }
        return slot_listeners.slot_listeners_remove_all_get_slot_listeners(target_instance, self, target_slot);
    }

    public static final SubLObject object_remove_all_set_slot_listeners_method_alt(SubLObject self, SubLObject target_instance, SubLObject target_slot) {
        if (target_slot == UNPROVIDED) {
            target_slot = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == subloop_structures.instance_p(target_instance)) {
                    Errors.error($str_alt146$_REMOVE_ALL_SET_SLOT_LISTENERS_OB, target_instance);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!target_slot.isSymbol()) {
                    Errors.error($str_alt147$_REMOVE_ALL_SET_SLOT_LISTENERS_OB, target_slot);
                }
            }
            return slot_listeners.slot_listeners_remove_all_set_slot_listeners(target_instance, self, target_slot);
        }
    }

    public static SubLObject object_remove_all_set_slot_listeners_method(final SubLObject self, final SubLObject target_instance, SubLObject target_slot) {
        if (target_slot == UNPROVIDED) {
            target_slot = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subloop_structures.instance_p(target_instance))) {
            Errors.error($str146$_REMOVE_ALL_SET_SLOT_LISTENERS_OB, target_instance);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!target_slot.isSymbol())) {
            Errors.error($str147$_REMOVE_ALL_SET_SLOT_LISTENERS_OB, target_slot);
        }
        return slot_listeners.slot_listeners_remove_all_set_slot_listeners(target_instance, self, target_slot);
    }

    static private final SubLList $list_alt45 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt46 = list(makeSymbol("STREAM"));

    static private final SubLList $list_alt47 = list(makeString("This is called by @xref CFASL-INPUT-INSTANCE.  Not meant to be called directly.\n   Use the public function @xref CFASL-INPUT or the like.\n   @owner bgottesm"), list(makeSymbol("CLET"), list(list(makeSymbol("CLASS-NAME"), list(makeSymbol("CLASS-NAME"), makeSymbol("SELF"))), list(makeSymbol("INSTANCE"), list(makeSymbol("NEW-CLASS-INSTANCE"), makeSymbol("SELF"))), list(makeSymbol("NUMBER-OF-SLOTS"), list(makeSymbol("CFASL-INPUT"), makeSymbol("STREAM"))), makeSymbol("SLOT-NAME"), makeSymbol("SLOT-VALUE")), list(makeSymbol("CHECK-TYPE"), makeSymbol("NUMBER-OF-SLOTS"), makeSymbol("INTEGERP")), list(makeSymbol("CDOTIMES"), list(makeSymbol("I"), makeSymbol("NUMBER-OF-SLOTS")), list(makeSymbol("CSETQ"), makeSymbol("SLOT-NAME"), list(makeSymbol("CFASL-INPUT"), makeSymbol("STREAM")), makeSymbol("SLOT-VALUE"), list(makeSymbol("CFASL-INPUT"), makeSymbol("STREAM"))), list(makeSymbol("CHECK-TYPE"), makeSymbol("SLOT-NAME"), makeSymbol("SYMBOLP")), list(makeSymbol("EVAL"), list(makeSymbol("BQ-LIST"), list(QUOTE, makeSymbol("INLINE-SET-SLOT")), list(makeSymbol("BQ-LIST"), makeSymbol("SLOT-NAME"), makeSymbol("CLASS-NAME")), makeSymbol("INSTANCE"), list(makeSymbol("BQ-LIST"), list(QUOTE, QUOTE), makeSymbol("SLOT-VALUE"))))), list(RET, makeSymbol("INSTANCE"))));

    public static final SubLObject object_remove_all_slot_listeners_method_alt(SubLObject self, SubLObject target_instance, SubLObject target_slot) {
        if (target_slot == UNPROVIDED) {
            target_slot = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == subloop_structures.instance_p(target_instance)) {
                    Errors.error($str_alt151$_REMOVE_ALL_SLOT_LISTENERS_OBJECT, target_instance);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!target_slot.isSymbol()) {
                    Errors.error($str_alt152$_REMOVE_ALL_SLOT_LISTENERS_OBJECT, target_slot);
                }
            }
            return slot_listeners.slot_listeners_remove_all_slot_listeners(target_instance, self, target_slot);
        }
    }

    public static SubLObject object_remove_all_slot_listeners_method(final SubLObject self, final SubLObject target_instance, SubLObject target_slot) {
        if (target_slot == UNPROVIDED) {
            target_slot = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subloop_structures.instance_p(target_instance))) {
            Errors.error($str151$_REMOVE_ALL_SLOT_LISTENERS_OBJECT, target_instance);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!target_slot.isSymbol())) {
            Errors.error($str152$_REMOVE_ALL_SLOT_LISTENERS_OBJECT, target_slot);
        }
        return slot_listeners.slot_listeners_remove_all_slot_listeners(target_instance, self, target_slot);
    }

    public static final SubLObject object_add_class_wide_before_method_listener_method_alt(SubLObject self, SubLObject v_class, SubLObject target_method, SubLObject my_method) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((NIL != subloop_structures.class_p(v_class)) || (NIL != subloop_structures.instance_p(v_class)))) {
                    Errors.error($str_alt157$_ADD_CLASS_WIDE_BEFORE_METHOD_LIS, v_class);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((NIL != target_method) && target_method.isSymbol())) {
                    Errors.error($str_alt158$_ADD_CLASS_WIDE_BEFORE_METHOD_LIS, target_method);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((NIL != my_method) && my_method.isSymbol())) {
                    Errors.error($str_alt159$_ADD_CLASS_WIDE_BEFORE_METHOD_LIS, my_method);
                }
            }
            if (NIL != subloop_structures.class_p(v_class)) {
                method_listeners.method_listeners_add_before_listener(subloop_structures.class_name(v_class), target_method, my_method, self);
            } else {
                if (NIL != subloop_structures.instance_p(v_class)) {
                    method_listeners.method_listeners_add_before_listener(subloop_structures.class_name(subloop_structures.instance_class(v_class)), target_method, my_method, self);
                }
            }
            return my_method;
        }
    }

    public static SubLObject object_add_class_wide_before_method_listener_method(final SubLObject self, final SubLObject v_class, final SubLObject target_method, final SubLObject my_method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subloop_structures.class_p(v_class))) && (NIL == subloop_structures.instance_p(v_class))) {
            Errors.error($str157$_ADD_CLASS_WIDE_BEFORE_METHOD_LIS, v_class);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((NIL == target_method) || (!target_method.isSymbol()))) {
            Errors.error($str158$_ADD_CLASS_WIDE_BEFORE_METHOD_LIS, target_method);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((NIL == my_method) || (!my_method.isSymbol()))) {
            Errors.error($str159$_ADD_CLASS_WIDE_BEFORE_METHOD_LIS, my_method);
        }
        if (NIL != subloop_structures.class_p(v_class)) {
            method_listeners.method_listeners_add_before_listener(subloop_structures.class_name(v_class), target_method, my_method, self);
        } else
            if (NIL != subloop_structures.instance_p(v_class)) {
                method_listeners.method_listeners_add_before_listener(subloop_structures.class_name(subloop_structures.instance_class(v_class)), target_method, my_method, self);
            }

        return my_method;
    }

    static private final SubLList $list_alt53 = list(list(makeSymbol("CSETQ"), makeSymbol("ISOLATED-P"), NIL), list(makeSymbol("CSETQ"), makeSymbol("INSTANCE-NUMBER"), makeSymbol("INSTANCE-COUNT")), list(RET, makeSymbol("SELF")));

    static private final SubLList $list_alt56 = list(makeSymbol("STREAM"), makeSymbol("DEPTH"));

    static private final SubLList $list_alt57 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("PIF"), list(makeSymbol("INSTANCE-P"), makeSymbol("SELF")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("#<~S-~S>"), list(makeSymbol("CLASS-NAME"), list(makeSymbol("INSTANCE-CLASS"), makeSymbol("SELF"))), makeSymbol("INSTANCE-NUMBER")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("#<Malformed Instance>"))), list(RET, makeSymbol("SELF")));

    static private final SubLString $str_alt59$___S__S_ = makeString("#<~S-~S>");

    static private final SubLString $str_alt60$__Malformed_Instance_ = makeString("#<Malformed Instance>");

    public static final SubLObject object_add_class_wide_after_method_listener_method_alt(SubLObject self, SubLObject v_class, SubLObject target_method, SubLObject my_method) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((NIL != subloop_structures.class_p(v_class)) || (NIL != subloop_structures.instance_p(v_class)))) {
                    Errors.error($str_alt163$_ADD_CLASS_WIDE_AFTER_METHOD_LIST, v_class);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((NIL != target_method) && target_method.isSymbol())) {
                    Errors.error($str_alt164$_ADD_CLASS_WIDE_AFTER_METHOD_LIST, target_method);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((NIL != my_method) && my_method.isSymbol())) {
                    Errors.error($str_alt165$_ADD_CLASS_WIDE_AFTER_METHOD_LIST, my_method);
                }
            }
            if (NIL != subloop_structures.class_p(v_class)) {
                method_listeners.method_listeners_add_after_listener(subloop_structures.class_name(v_class), target_method, my_method, self);
            } else {
                if (NIL != subloop_structures.instance_p(v_class)) {
                    method_listeners.method_listeners_add_after_listener(subloop_structures.class_name(subloop_structures.instance_class(v_class)), target_method, my_method, self);
                }
            }
            return my_method;
        }
    }

    public static SubLObject object_add_class_wide_after_method_listener_method(final SubLObject self, final SubLObject v_class, final SubLObject target_method, final SubLObject my_method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subloop_structures.class_p(v_class))) && (NIL == subloop_structures.instance_p(v_class))) {
            Errors.error($str163$_ADD_CLASS_WIDE_AFTER_METHOD_LIST, v_class);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((NIL == target_method) || (!target_method.isSymbol()))) {
            Errors.error($str164$_ADD_CLASS_WIDE_AFTER_METHOD_LIST, target_method);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((NIL == my_method) || (!my_method.isSymbol()))) {
            Errors.error($str165$_ADD_CLASS_WIDE_AFTER_METHOD_LIST, my_method);
        }
        if (NIL != subloop_structures.class_p(v_class)) {
            method_listeners.method_listeners_add_after_listener(subloop_structures.class_name(v_class), target_method, my_method, self);
        } else
            if (NIL != subloop_structures.instance_p(v_class)) {
                method_listeners.method_listeners_add_after_listener(subloop_structures.class_name(subloop_structures.instance_class(v_class)), target_method, my_method, self);
            }

        return my_method;
    }

    static private final SubLList $list_alt62 = list(makeSymbol("OBJECT"));

    static private final SubLList $list_alt63 = list(list(RET, list(EQ, makeSymbol("SELF"), makeSymbol("OBJECT"))));

    static private final SubLList $list_alt66 = list(makeSymbol("OBJECT"), makeSymbol("&OPTIONAL"), list(makeSymbol("IGNORE-SLOTS"), NIL));

    static private final SubLList $list_alt67 = list(list(makeSymbol("CLET"), list(list(makeSymbol("CLASS"), list(makeSymbol("INSTANCE-CLASS"), makeSymbol("SELF")))), list(makeSymbol("WITH-CLASS"), makeSymbol("CLASS"), list(makeSymbol("CDO-ESSENTIAL-SLOTS"), list(makeSymbol("SLOT-NAME"), NIL, NIL, NIL, NIL, makeSymbol("COMPILED-CLASS-SLOT-ACCESS-ALIST")), list(makeSymbol("PUNLESS"), list(makeSymbol("MEMBER"), makeSymbol("SLOT-NAME"), makeSymbol("IGNORE-SLOTS")), list(makeSymbol("PUNLESS"), list(EQUAL, list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), makeSymbol("SLOT-NAME")), list(makeSymbol("GET-SLOT"), makeSymbol("OBJECT"), makeSymbol("SLOT-NAME"))), list(RET, NIL)))), list(makeSymbol("CDO-ESSENTIAL-SLOTS"), list(makeSymbol("SLOT-NAME"), NIL, NIL, NIL, NIL, makeSymbol("COMPILED-CLASS-BOOLEAN-SLOT-ACCESS-ALIST")), list(makeSymbol("PUNLESS"), list(makeSymbol("MEMBER"), makeSymbol("SLOT-NAME"), makeSymbol("IGNORE-SLOTS")), list(makeSymbol("PUNLESS"), list(EQUAL, list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), makeSymbol("SLOT-NAME")), list(makeSymbol("GET-SLOT"), makeSymbol("OBJECT"), makeSymbol("SLOT-NAME"))), list(RET, NIL)))), list(makeSymbol("CDO-ESSENTIAL-SLOTS"), list(makeSymbol("SLOT-NAME"), NIL, NIL, NIL, NIL, makeSymbol("COMPILED-INSTANCE-SLOT-ACCESS-ALIST")), list(makeSymbol("PUNLESS"), list(makeSymbol("MEMBER"), makeSymbol("SLOT-NAME"), makeSymbol("IGNORE-SLOTS")), list(makeSymbol("PUNLESS"), list(EQUAL, list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), makeSymbol("SLOT-NAME")), list(makeSymbol("GET-SLOT"), makeSymbol("OBJECT"), makeSymbol("SLOT-NAME"))), list(RET, NIL)))), list(makeSymbol("CDO-ESSENTIAL-SLOTS"), list(makeSymbol("SLOT-NAME"), NIL, NIL, NIL, NIL, makeSymbol("COMPILED-INSTANCE-BOOLEAN-SLOT-ACCESS-ALIST")), list(makeSymbol("PUNLESS"), list(makeSymbol("MEMBER"), makeSymbol("SLOT-NAME"), makeSymbol("IGNORE-SLOTS")), list(makeSymbol("PUNLESS"), list(EQUAL, list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), makeSymbol("SLOT-NAME")), list(makeSymbol("GET-SLOT"), makeSymbol("OBJECT"), makeSymbol("SLOT-NAME"))), list(RET, NIL))))), list(RET, T)));

    public static final SubLObject object_remove_all_class_wide_method_listeners_method_alt(SubLObject self, SubLObject monitored_instance, SubLObject target_method) {
        if (target_method == UNPROVIDED) {
            target_method = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((NIL != subloop_structures.instance_p(monitored_instance)) || (NIL != subloop_structures.class_p(monitored_instance)))) {
                    Errors.error($str_alt170$_REMOVE_CLASS_WIDE_METHOD_LISTENE, monitored_instance);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!target_method.isSymbol()) {
                    Errors.error($str_alt171$_REMOVE_CLASS_WIDE_METHOD_LISTENE, target_method);
                }
            }
            return method_listeners.method_listeners_remove_all_method_listeners(monitored_instance, self, target_method);
        }
    }

    public static SubLObject object_remove_all_class_wide_method_listeners_method(final SubLObject self, final SubLObject monitored_instance, SubLObject target_method) {
        if (target_method == UNPROVIDED) {
            target_method = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subloop_structures.instance_p(monitored_instance))) && (NIL == subloop_structures.class_p(monitored_instance))) {
            Errors.error($str170$_REMOVE_CLASS_WIDE_METHOD_LISTENE, monitored_instance);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!target_method.isSymbol())) {
            Errors.error($str171$_REMOVE_CLASS_WIDE_METHOD_LISTENE, target_method);
        }
        return method_listeners.method_listeners_remove_all_method_listeners(monitored_instance, self, target_method);
    }

    public static final SubLObject object_isolate_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_object_method = NIL;
            SubLObject isolated_p = com.cyc.cycjava.cycl.object.get_object_isolated_p(self);
            try {
                try {
                    isolated_p = T;
                    slot_listeners.slot_listeners_remove_all_slot_listeners(self, UNPROVIDED, UNPROVIDED);
                    method_listeners.method_listeners_remove_all_method_listeners(self, UNPROVIDED, UNPROVIDED);
                    sublisp_throw($sym175$OUTER_CATCH_FOR_OBJECT_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.object.set_object_isolated_p(self, isolated_p);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_object_method = Errors.handleThrowable(ccatch_env_var, $sym175$OUTER_CATCH_FOR_OBJECT_METHOD);
            }
            return catch_var_for_object_method;
        }
    }

    public static SubLObject object_isolate_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_object_method = NIL;
        SubLObject isolated_p = get_object_isolated_p(self);
        try {
            thread.throwStack.push($sym175$OUTER_CATCH_FOR_OBJECT_METHOD);
            try {
                isolated_p = T;
                slot_listeners.slot_listeners_remove_all_slot_listeners(self, UNPROVIDED, UNPROVIDED);
                method_listeners.method_listeners_remove_all_method_listeners(self, UNPROVIDED, UNPROVIDED);
                sublisp_throw($sym175$OUTER_CATCH_FOR_OBJECT_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_object_isolated_p(self, isolated_p);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_object_method = Errors.handleThrowable(ccatch_env_var, $sym175$OUTER_CATCH_FOR_OBJECT_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_object_method;
    }

    static private final SubLList $list_alt70 = list(list(makeSymbol("CLET"), list(list(makeSymbol("CLASS-OF-SELF"), list(makeSymbol("INSTANCE-CLASS"), makeSymbol("SELF")))), list(RET, list(makeSymbol("FUNCALL-CLASS-METHOD"), makeSymbol("CLASS-OF-SELF"), list(QUOTE, makeSymbol("NEW"))))));

    static private final SubLList $list_alt73 = list(list(makeSymbol("CLET"), list(list(makeSymbol("ALL-INSTANCE-SLOTS"), list(makeSymbol("INSTANCES-ALL-INSTANCE-SLOTS"), makeSymbol("SELF"))), list(makeSymbol("TAB"), list(makeSymbol("FIF"), list(makeSymbol("ZEROP"), makeSymbol("DEPTH")), makeString(""), list(makeSymbol("MAKE-STRING"), list(makeSymbol("*"), makeSymbol("DEPTH"), TWO_INTEGER)))), list(makeSymbol("SLOT-TAB"), list(makeSymbol("FIF"), list(makeSymbol("ZEROP"), makeSymbol("DEPTH")), makeString("  "), list(makeSymbol("MAKE-STRING"), list(makeSymbol("+"), list(makeSymbol("*"), makeSymbol("DEPTH"), TWO_INTEGER), TWO_INTEGER))))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("~%~ADescription of instance ~S:"), makeSymbol("TAB"), makeSymbol("SELF")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("DESCRIBE-CLASS")), makeSymbol("STREAM"), list(makeSymbol("1+"), makeSymbol("DEPTH"))), list(makeSymbol("CDOLIST"), list(makeSymbol("INSTANCE-SLOT"), makeSymbol("ALL-INSTANCE-SLOTS")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("~%~A~S -> ~S"), makeSymbol("SLOT-TAB"), makeSymbol("INSTANCE-SLOT"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), makeSymbol("INSTANCE-SLOT")))), list(RET, makeSymbol("SELF"))));

    public static final SubLObject object_plistify_method_alt(SubLObject self) {
        {
            SubLObject listed_slots = NIL;
            SubLObject keyword_package = symbol_package($TEST);
            SubLObject v_class = subloop_structures.instance_class(self);
            SubLObject v_class_3 = v_class;
            SubLObject compiled_instance_slot_access_alist = subloop_structures.class_compiled_instance_slot_access_alist(v_class_3);
            SubLObject compiled_instance_boolean_slot_access_alist = subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class_3);
            SubLObject compiled_class_slot_access_alist = subloop_structures.class_compiled_class_slot_access_alist(v_class_3);
            SubLObject compiled_class_boolean_slot_access_alist = subloop_structures.class_compiled_class_boolean_slot_access_alist(v_class_3);
            {
                SubLObject slot_name = NIL;
                SubLObject cdolist_list_var = compiled_class_slot_access_alist;
                SubLObject slot = NIL;
                for (slot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , slot = cdolist_list_var.first()) {
                    if (NIL != slots.slot_essential(slot)) {
                        slot_name = slots.slot_name(slot);
                        listed_slots = cons(intern(symbol_name(slot_name), keyword_package), listed_slots);
                        listed_slots = cons(instances.get_slot(self, slot_name), listed_slots);
                    }
                }
            }
            {
                SubLObject slot_name = NIL;
                SubLObject cdolist_list_var = compiled_class_boolean_slot_access_alist;
                SubLObject slot = NIL;
                for (slot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , slot = cdolist_list_var.first()) {
                    if (NIL != slots.slot_essential(slot)) {
                        slot_name = slots.slot_name(slot);
                        listed_slots = cons(intern(symbol_name(slot_name), keyword_package), listed_slots);
                        listed_slots = cons(instances.get_slot(self, slot_name), listed_slots);
                    }
                }
            }
            {
                SubLObject slot_name = NIL;
                SubLObject cdolist_list_var = compiled_instance_slot_access_alist;
                SubLObject slot = NIL;
                for (slot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , slot = cdolist_list_var.first()) {
                    if (NIL != slots.slot_essential(slot)) {
                        slot_name = slots.slot_name(slot);
                        listed_slots = cons(intern(symbol_name(slot_name), keyword_package), listed_slots);
                        listed_slots = cons(instances.get_slot(self, slot_name), listed_slots);
                    }
                }
            }
            {
                SubLObject slot_name = NIL;
                SubLObject cdolist_list_var = compiled_instance_boolean_slot_access_alist;
                SubLObject slot = NIL;
                for (slot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , slot = cdolist_list_var.first()) {
                    if (NIL != slots.slot_essential(slot)) {
                        slot_name = slots.slot_name(slot);
                        listed_slots = cons(intern(symbol_name(slot_name), keyword_package), listed_slots);
                        listed_slots = cons(instances.get_slot(self, slot_name), listed_slots);
                    }
                }
            }
            return nreverse(listed_slots);
        }
    }

    public static SubLObject object_plistify_method(final SubLObject self) {
        SubLObject listed_slots = NIL;
        final SubLObject keyword_package = symbol_package($TEST);
        final SubLObject v_class_$3;
        final SubLObject v_class = v_class_$3 = subloop_structures.instance_class(self);
        final SubLObject compiled_instance_slot_access_alist = subloop_structures.class_compiled_instance_slot_access_alist(v_class_$3);
        final SubLObject compiled_instance_boolean_slot_access_alist = subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class_$3);
        final SubLObject compiled_class_slot_access_alist = subloop_structures.class_compiled_class_slot_access_alist(v_class_$3);
        final SubLObject compiled_class_boolean_slot_access_alist = subloop_structures.class_compiled_class_boolean_slot_access_alist(v_class_$3);
        SubLObject slot_name = NIL;
        SubLObject cdolist_list_var = compiled_class_slot_access_alist;
        SubLObject slot = NIL;
        slot = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != slots.slot_essential(slot)) {
                slot_name = slots.slot_name(slot);
                listed_slots = cons(intern(symbol_name(slot_name), keyword_package), listed_slots);
                listed_slots = cons(instances.get_slot(self, slot_name), listed_slots);
            }
            cdolist_list_var = cdolist_list_var.rest();
            slot = cdolist_list_var.first();
        } 
        slot_name = NIL;
        cdolist_list_var = compiled_class_boolean_slot_access_alist;
        slot = NIL;
        slot = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != slots.slot_essential(slot)) {
                slot_name = slots.slot_name(slot);
                listed_slots = cons(intern(symbol_name(slot_name), keyword_package), listed_slots);
                listed_slots = cons(instances.get_slot(self, slot_name), listed_slots);
            }
            cdolist_list_var = cdolist_list_var.rest();
            slot = cdolist_list_var.first();
        } 
        slot_name = NIL;
        cdolist_list_var = compiled_instance_slot_access_alist;
        slot = NIL;
        slot = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != slots.slot_essential(slot)) {
                slot_name = slots.slot_name(slot);
                listed_slots = cons(intern(symbol_name(slot_name), keyword_package), listed_slots);
                listed_slots = cons(instances.get_slot(self, slot_name), listed_slots);
            }
            cdolist_list_var = cdolist_list_var.rest();
            slot = cdolist_list_var.first();
        } 
        slot_name = NIL;
        cdolist_list_var = compiled_instance_boolean_slot_access_alist;
        slot = NIL;
        slot = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != slots.slot_essential(slot)) {
                slot_name = slots.slot_name(slot);
                listed_slots = cons(intern(symbol_name(slot_name), keyword_package), listed_slots);
                listed_slots = cons(instances.get_slot(self, slot_name), listed_slots);
            }
            cdolist_list_var = cdolist_list_var.rest();
            slot = cdolist_list_var.first();
        } 
        return nreverse(listed_slots);
    }

    static private final SubLString $str_alt74$___ADescription_of_instance__S_ = makeString("~%~ADescription of instance ~S:");

    static private final SubLList $list_alt77 = list(makeKeyword("NO-MEMBER-VARIABLES"), makeKeyword("PROTECTED"));

    static private final SubLList $list_alt78 = list(makeString("This is called by @xref CFASL-OUTPUT-OBJECT.  It is not meant to be called directly.\n   Use the public function @xref CFASL-OUTPUT or the like.\n   @owner bgottesm"), list(makeSymbol("CLET"), list(list(makeSymbol("CLASS"), list(makeSymbol("INSTANCE-CLASS"), makeSymbol("SELF"))), list(makeSymbol("CLASS-NAME"), list(makeSymbol("CLASS-NAME"), makeSymbol("CLASS")))), list(makeSymbol("CFASL-OUTPUT"), makeSymbol("CLASS-NAME"), makeSymbol("STREAM")), list(makeSymbol("WITH-CLASS"), makeSymbol("CLASS"), list(makeSymbol("CLET"), list(list(makeSymbol("INSTANCE-SLOTS"), list(makeSymbol("APPEND"), makeSymbol("COMPILED-INSTANCE-SLOT-ACCESS-ALIST"), makeSymbol("COMPILED-INSTANCE-BOOLEAN-SLOT-ACCESS-ALIST")))), list(makeSymbol("CSETQ"), makeSymbol("INSTANCE-SLOTS"), list(makeSymbol("DELETE"), list(QUOTE, makeSymbol("INSTANCE-NUMBER")), makeSymbol("INSTANCE-SLOTS"), list(makeSymbol("FUNCTION"), EQ), list(QUOTE, makeSymbol("SLOT-NAME")))), list(makeSymbol("CLET"), list(list(makeSymbol("NUMBER-OF-SLOTS"), list(makeSymbol("LENGTH"), makeSymbol("INSTANCE-SLOTS")))), list(makeSymbol("CFASL-OUTPUT"), makeSymbol("NUMBER-OF-SLOTS"), makeSymbol("STREAM")), list(makeSymbol("CDOSLOTS"), list(makeSymbol("SLOT-NAME"), NIL, NIL, NIL, NIL, makeSymbol("INSTANCE-SLOTS")), list(makeSymbol("CFASL-OUTPUT"), makeSymbol("SLOT-NAME"), makeSymbol("STREAM")), list(makeSymbol("CFASL-OUTPUT"), list(makeSymbol("EVAL"), list(makeSymbol("BQ-LIST"), list(QUOTE, makeSymbol("INLINE-GET-SLOT")), list(makeSymbol("BQ-LIST"), makeSymbol("SLOT-NAME"), makeSymbol("CLASS-NAME")), makeSymbol("SELF"))), makeSymbol("STREAM"))))))), list(RET, makeSymbol("SELF")));

    static private final SubLList $list_alt83 = list(makeSymbol("TARGET-INSTANCE"), makeSymbol("TARGET-SLOT"), makeSymbol("MY-METHOD"));

    static private final SubLList $list_alt84 = list(list(makeSymbol("MUST"), list(makeSymbol("INSTANCE-P"), makeSymbol("TARGET-INSTANCE")), makeString("(ADD-GET-SLOT-LISTENER OBJECT): target instance ~S is not an instance."), makeSymbol("TARGET-INSTANCE")), list(makeSymbol("MUST"), list(makeSymbol("SYMBOLP"), makeSymbol("TARGET-SLOT")), makeString("(ADD-GET-SLOT-LISTENER OBJECT): target slot ~S is not a slot."), makeSymbol("TARGET-SLOT")), list(makeSymbol("MUST"), list(makeSymbol("SYMBOLP"), makeSymbol("MY-METHOD")), makeString("(ADD-GET-SLOT-LISTENER OBJECT): method ~S is not a method."), makeSymbol("MY-METHOD")), list(makeSymbol("ADD-GENERIC-SLOT-LISTENER"), makeSymbol("TARGET-INSTANCE"), makeSymbol("TARGET-SLOT"), makeKeyword("GET"), makeSymbol("MY-METHOD"), makeSymbol("SELF")), list(RET, makeSymbol("MY-METHOD")));

    public static final SubLObject object_listify_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_object_method = NIL;
            SubLObject instance_number = com.cyc.cycjava.cycl.object.get_object_instance_number(self);
            try {
                try {
                    sublisp_throw($sym183$OUTER_CATCH_FOR_OBJECT_METHOD, listS(subloop_structures.class_name(subloop_structures.instance_class(self)), instance_number, methods.funcall_instance_method_with_0_args(self, PLISTIFY)));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.object.set_object_instance_number(self, instance_number);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_object_method = Errors.handleThrowable(ccatch_env_var, $sym183$OUTER_CATCH_FOR_OBJECT_METHOD);
            }
            return catch_var_for_object_method;
        }
    }

    public static SubLObject object_listify_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_object_method = NIL;
        final SubLObject instance_number = get_object_instance_number(self);
        try {
            thread.throwStack.push($sym183$OUTER_CATCH_FOR_OBJECT_METHOD);
            try {
                sublisp_throw($sym183$OUTER_CATCH_FOR_OBJECT_METHOD, listS(subloop_structures.class_name(subloop_structures.instance_class(self)), instance_number, methods.funcall_instance_method_with_0_args(self, PLISTIFY)));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_object_instance_number(self, instance_number);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_object_method = Errors.handleThrowable(ccatch_env_var, $sym183$OUTER_CATCH_FOR_OBJECT_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_object_method;
    }

    static private final SubLString $str_alt85$_ADD_GET_SLOT_LISTENER_OBJECT___t = makeString("(ADD-GET-SLOT-LISTENER OBJECT): target instance ~S is not an instance.");

    static private final SubLString $str_alt86$_ADD_GET_SLOT_LISTENER_OBJECT___t = makeString("(ADD-GET-SLOT-LISTENER OBJECT): target slot ~S is not a slot.");

    static private final SubLString $str_alt87$_ADD_GET_SLOT_LISTENER_OBJECT___m = makeString("(ADD-GET-SLOT-LISTENER OBJECT): method ~S is not a method.");

    static private final SubLList $list_alt91 = list(makeSymbol("TARGET-INSTANCE"), makeSymbol("TARGET-SLOT"), makeSymbol("MY-METHOD"), makeSymbol("TRIGGER-VALUE"));

    public static final SubLObject object_assimilate_method_alt(SubLObject self, SubLObject plistified_content) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!plistified_content.isList()) {
                    Errors.error($str_alt189$_ASSIMILATE__S____S_is_not_a_vali, self);
                }
            }
            {
                SubLObject slot = NIL;
                SubLObject slot_name = NIL;
                SubLObject v_class = subloop_structures.instance_class(self);
                SubLObject compiled_instance_slot_access_alist = subloop_structures.class_compiled_instance_slot_access_alist(v_class);
                SubLObject compiled_class_slot_access_alist = subloop_structures.class_compiled_class_slot_access_alist(v_class);
                {
                    SubLObject remainder = NIL;
                    for (remainder = plistified_content; NIL != remainder; remainder = cddr(remainder)) {
                        {
                            SubLObject key = remainder.first();
                            SubLObject value = cadr(remainder);
                            slot = slots.slot_assoc_by_name(symbol_name(key), compiled_class_slot_access_alist);
                            if (NIL != slot) {
                                slot_name = slots.slot_name(slot);
                                instances.set_slot(self, slot_name, value);
                            }
                        }
                    }
                }
                {
                    SubLObject remainder = NIL;
                    for (remainder = plistified_content; NIL != remainder; remainder = cddr(remainder)) {
                        {
                            SubLObject key = remainder.first();
                            SubLObject value = cadr(remainder);
                            slot = slots.slot_assoc_by_name(symbol_name(key), compiled_instance_slot_access_alist);
                            if (NIL != slot) {
                                slot_name = slots.slot_name(slot);
                                instances.set_slot(self, slot_name, value);
                            }
                        }
                    }
                }
                return self;
            }
        }
    }

    public static SubLObject object_assimilate_method(final SubLObject self, final SubLObject plistified_content) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!plistified_content.isList())) {
            Errors.error($str189$_ASSIMILATE__S____S_is_not_a_vali, self);
        }
        SubLObject slot = NIL;
        SubLObject slot_name = NIL;
        final SubLObject v_class = subloop_structures.instance_class(self);
        final SubLObject compiled_instance_slot_access_alist = subloop_structures.class_compiled_instance_slot_access_alist(v_class);
        final SubLObject compiled_class_slot_access_alist = subloop_structures.class_compiled_class_slot_access_alist(v_class);
        SubLObject remainder;
        SubLObject key;
        SubLObject value;
        for (remainder = NIL, remainder = plistified_content; NIL != remainder; remainder = cddr(remainder)) {
            key = remainder.first();
            value = cadr(remainder);
            slot = slots.slot_assoc_by_name(symbol_name(key), compiled_class_slot_access_alist);
            if (NIL != slot) {
                slot_name = slots.slot_name(slot);
                instances.set_slot(self, slot_name, value);
            }
        }
        for (remainder = NIL, remainder = plistified_content; NIL != remainder; remainder = cddr(remainder)) {
            key = remainder.first();
            value = cadr(remainder);
            slot = slots.slot_assoc_by_name(symbol_name(key), compiled_instance_slot_access_alist);
            if (NIL != slot) {
                slot_name = slots.slot_name(slot);
                instances.set_slot(self, slot_name, value);
            }
        }
        return self;
    }

    static private final SubLList $list_alt92 = list(list(makeSymbol("MUST"), list(makeSymbol("INSTANCE-P"), makeSymbol("TARGET-INSTANCE")), makeString("(ADD-GET-SLOT-LISTENER-STIMULATED-BY-VALUE OBJECT): target instance ~S is not an instance."), makeSymbol("TARGET-INSTANCE")), list(makeSymbol("MUST"), list(makeSymbol("SYMBOLP"), makeSymbol("TARGET-SLOT")), makeString("(ADD-GET-SLOT-LISTENER-STIMULATED-BY-VALUE OBJECT): target slot ~S is not a slot."), makeSymbol("TARGET-SLOT")), list(makeSymbol("MUST"), list(makeSymbol("SYMBOLP"), makeSymbol("MY-METHOD")), makeString("(ADD-GET-SLOT-LISTENER-STIMULATED-BY-VALUE OBJECT): method ~S is not a method."), makeSymbol("MY-METHOD")), list(makeSymbol("ADD-GENERIC-SLOT-LISTENER-STIMULATED-BY-VALUE"), makeSymbol("TARGET-INSTANCE"), makeSymbol("TARGET-SLOT"), makeKeyword("GET"), makeSymbol("MY-METHOD"), makeSymbol("SELF"), makeSymbol("TRIGGER-VALUE")), list(RET, makeSymbol("MY-METHOD")));

    static private final SubLString $str_alt93$_ADD_GET_SLOT_LISTENER_STIMULATED = makeString("(ADD-GET-SLOT-LISTENER-STIMULATED-BY-VALUE OBJECT): target instance ~S is not an instance.");

    static private final SubLString $str_alt94$_ADD_GET_SLOT_LISTENER_STIMULATED = makeString("(ADD-GET-SLOT-LISTENER-STIMULATED-BY-VALUE OBJECT): target slot ~S is not a slot.");

    static private final SubLString $str_alt95$_ADD_GET_SLOT_LISTENER_STIMULATED = makeString("(ADD-GET-SLOT-LISTENER-STIMULATED-BY-VALUE OBJECT): method ~S is not a method.");

    public static final SubLObject describe_instance_alt(SubLObject instance) {
        if (NIL != subloop_structures.instance_p(instance)) {
            methods.funcall_instance_method_with_0_args(instance, DESCRIBE_INSTANCE);
        }
        return instance;
    }

    public static SubLObject describe_instance(final SubLObject instance) {
        if (NIL != subloop_structures.instance_p(instance)) {
            methods.funcall_instance_method_with_0_args(instance, DESCRIBE_INSTANCE);
        }
        return instance;
    }

    static private final SubLList $list_alt98 = list(makeSymbol("TARGET-INSTANCE"), makeSymbol("TARGET-SLOT"), makeSymbol("MY-METHOD"), makeSymbol("TRIGGER-VALUE-LOWER-BOUND"), makeSymbol("TRIGGER-VALUE-UPPER-BOUND"));

    public static final SubLObject new_object_instance_alt(SubLObject class_or_class_name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_class = (class_or_class_name.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(class_or_class_name))) : class_or_class_name;
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == subloop_structures.class_p(v_class)) {
                        Errors.error($str_alt191$NEW_SUBLOOPS_INSTANCE___S_is_neit, class_or_class_name);
                    }
                }
                {
                    SubLObject new_instance = com.cyc.cycjava.cycl.object.object_new_method(class_or_class_name);
                    return new_instance;
                }
            }
        }
    }

    public static SubLObject new_object_instance(final SubLObject class_or_class_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_class = (class_or_class_name.isSymbol()) ? classes.classes_retrieve_class(class_or_class_name) : class_or_class_name;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subloop_structures.class_p(v_class))) {
            Errors.error($str191$NEW_SUBLOOPS_INSTANCE___S_is_neit, class_or_class_name);
        }
        final SubLObject new_instance = object_new_method(class_or_class_name);
        return new_instance;
    }

    static private final SubLList $list_alt99 = list(list(makeSymbol("MUST"), list(makeSymbol("INSTANCE-P"), makeSymbol("TARGET-INSTANCE")), makeString("(ADD-GET-SLOT-LISTENER-STIMULATED-BY-RANGE OBJECT): target instance ~S is not an instance."), makeSymbol("TARGET-INSTANCE")), list(makeSymbol("MUST"), list(makeSymbol("SYMBOLP"), makeSymbol("TARGET-SLOT")), makeString("(ADD-GET-SLOT-LISTENER-STIMULATED-BY-RANGE OBJECT): target slot ~S is not a slot."), makeSymbol("TARGET-SLOT")), list(makeSymbol("MUST"), list(makeSymbol("SYMBOLP"), makeSymbol("MY-METHOD")), makeString("(ADD-GET-SLOT-LISTENER-STIMULATED-BY-RANGE OBJECT): method ~S is not a method."), makeSymbol("MY-METHOD")), list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("CAND"), list(makeSymbol("NUMBERP"), makeSymbol("TRIGGER-VALUE-LOWER-BOUND")), list(makeSymbol("NUMBERP"), makeSymbol("TRIGGER-VALUE-UPPER-BOUND"))), list(makeSymbol("CAND"), list(makeSymbol("STRINGP"), makeSymbol("TRIGGER-VALUE-LOWER-BOUND")), list(makeSymbol("STRINGP"), makeSymbol("TRIGGER-VALUE-UPPER-BOUND"))), list(makeSymbol("CAND"), list(makeSymbol("CHARACTERP"), makeSymbol("TRIGGER-VALUE-LOWER-BOUND")), list(makeSymbol("CHARACTERP"), makeSymbol("TRIGGER-VALUE-UPPER-BOUND")))), makeString("(ADD-GET-SLOT-LISTENER-STIMULATED-BY-RANGE OBJECT): lower ~S and upper ~S bound must be either a string,~\n     ~%a number, or a character and both must be of the same type."), makeSymbol("TRIGGER-VALUE-LOWER-BOUND"), makeSymbol("TRIGGER-VALUE-UPPER-BOUND")), list(makeSymbol("ADD-GENERIC-SLOT-LISTENER-STIMULATED-BY-RANGE"), makeSymbol("TARGET-INSTANCE"), makeSymbol("TARGET-SLOT"), makeKeyword("GET"), makeSymbol("MY-METHOD"), makeSymbol("SELF"), makeSymbol("TRIGGER-VALUE-LOWER-BOUND"), makeSymbol("TRIGGER-VALUE-UPPER-BOUND")), list(RET, makeSymbol("MY-METHOD")));

    public static final SubLObject new_class_instance_alt(SubLObject class_or_class_name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_class = (class_or_class_name.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(class_or_class_name))) : class_or_class_name;
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == subloop_structures.class_p(v_class)) {
                        Errors.error($str_alt191$NEW_SUBLOOPS_INSTANCE___S_is_neit, class_or_class_name);
                    }
                }
                {
                    SubLObject new_instance = com.cyc.cycjava.cycl.object.object_new_method(class_or_class_name);
                    return new_instance;
                }
            }
        }
    }

    public static SubLObject new_class_instance(final SubLObject class_or_class_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_class = (class_or_class_name.isSymbol()) ? classes.classes_retrieve_class(class_or_class_name) : class_or_class_name;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subloop_structures.class_p(v_class))) {
            Errors.error($str191$NEW_SUBLOOPS_INSTANCE___S_is_neit, class_or_class_name);
        }
        final SubLObject new_instance = object_new_method(class_or_class_name);
        return new_instance;
    }

    public static final SubLObject create_object_from_list_alt(SubLObject listified_instance, SubLObject allocate_new_instance_number) {
        if (allocate_new_instance_number == UNPROVIDED) {
            allocate_new_instance_number = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((((listified_instance.isCons() && listified_instance.first().isSymbol()) && listified_instance.rest().isCons()) && cadr(listified_instance).isInteger()) && cddr(listified_instance).isList())) {
                    Errors.error($str_alt192$CREATE_OBJECT_FROM_LIST___S_is_no, listified_instance);
                }
            }
            {
                SubLObject datum = listified_instance;
                SubLObject current = datum;
                SubLObject class_name = NIL;
                SubLObject instance_number = NIL;
                SubLObject slot_plist = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt193);
                class_name = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt193);
                instance_number = current.first();
                current = current.rest();
                slot_plist = current;
                {
                    SubLObject v_object = instances.new_instance(class_name);
                    SubLObject slot = NIL;
                    SubLObject slot_name = NIL;
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (NIL == v_object) {
                            Errors.error($str_alt194$CREATE_OBJECT_FROM_LIST___S_does_, class_name);
                        }
                    }
                    if (NIL != allocate_new_instance_number) {
                        {
                            SubLObject current_instance_count = com.cyc.cycjava.cycl.object.get_object_instance_count(v_object);
                            if (NIL == current_instance_count) {
                                current_instance_count = ZERO_INTEGER;
                            } else {
                                current_instance_count = add(current_instance_count, ONE_INTEGER);
                            }
                            com.cyc.cycjava.cycl.object.set_object_instance_count(v_object, current_instance_count);
                            methods.funcall_instance_method_with_0_args(v_object, INITIALIZE);
                        }
                    } else {
                        methods.funcall_instance_method_with_0_args(v_object, INITIALIZE);
                        com.cyc.cycjava.cycl.object.set_object_instance_number(v_object, instance_number);
                    }
                    {
                        SubLObject v_class = subloop_structures.instance_class(v_object);
                        SubLObject compiled_instance_slot_access_alist = subloop_structures.class_compiled_instance_slot_access_alist(v_class);
                        SubLObject compiled_class_slot_access_alist = subloop_structures.class_compiled_class_slot_access_alist(v_class);
                        {
                            SubLObject remainder = NIL;
                            for (remainder = slot_plist; NIL != remainder; remainder = cddr(remainder)) {
                                {
                                    SubLObject key = remainder.first();
                                    SubLObject value = cadr(remainder);
                                    slot = slots.slot_assoc_by_name(symbol_name(key), compiled_class_slot_access_alist);
                                    if (NIL != slot) {
                                        slot_name = slots.slot_name(slot);
                                        instances.set_slot(v_object, slot_name, value);
                                    }
                                }
                            }
                        }
                        {
                            SubLObject remainder = NIL;
                            for (remainder = slot_plist; NIL != remainder; remainder = cddr(remainder)) {
                                {
                                    SubLObject key = remainder.first();
                                    SubLObject value = cadr(remainder);
                                    slot = slots.slot_assoc_by_name(symbol_name(key), compiled_instance_slot_access_alist);
                                    if (NIL != slot) {
                                        slot_name = slots.slot_name(slot);
                                        instances.set_slot(v_object, slot_name, value);
                                    }
                                }
                            }
                        }
                    }
                    return v_object;
                }
            }
        }
    }

    public static SubLObject create_object_from_list(final SubLObject listified_instance, SubLObject allocate_new_instance_number) {
        if (allocate_new_instance_number == UNPROVIDED) {
            allocate_new_instance_number = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (((((!listified_instance.isCons()) || (!listified_instance.first().isSymbol())) || (!listified_instance.rest().isCons())) || (!cadr(listified_instance).isInteger())) || (!cddr(listified_instance).isList()))) {
            Errors.error($str192$CREATE_OBJECT_FROM_LIST___S_is_no, listified_instance);
        }
        SubLObject class_name = NIL;
        SubLObject instance_number = NIL;
        SubLObject slot_plist = NIL;
        destructuring_bind_must_consp(listified_instance, listified_instance, $list193);
        class_name = listified_instance.first();
        SubLObject current = listified_instance.rest();
        destructuring_bind_must_consp(current, listified_instance, $list193);
        instance_number = current.first();
        current = slot_plist = current.rest();
        final SubLObject v_object = instances.new_instance(class_name);
        SubLObject slot = NIL;
        SubLObject slot_name = NIL;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == v_object)) {
            Errors.error($str194$CREATE_OBJECT_FROM_LIST___S_does_, class_name);
        }
        if (NIL != allocate_new_instance_number) {
            SubLObject current_instance_count = get_object_instance_count(v_object);
            if (NIL == current_instance_count) {
                current_instance_count = ZERO_INTEGER;
            } else {
                current_instance_count = add(current_instance_count, ONE_INTEGER);
            }
            set_object_instance_count(v_object, current_instance_count);
            methods.funcall_instance_method_with_0_args(v_object, INITIALIZE);
        } else {
            methods.funcall_instance_method_with_0_args(v_object, INITIALIZE);
            set_object_instance_number(v_object, instance_number);
        }
        final SubLObject v_class = subloop_structures.instance_class(v_object);
        final SubLObject compiled_instance_slot_access_alist = subloop_structures.class_compiled_instance_slot_access_alist(v_class);
        final SubLObject compiled_class_slot_access_alist = subloop_structures.class_compiled_class_slot_access_alist(v_class);
        SubLObject remainder;
        SubLObject key;
        SubLObject value;
        for (remainder = NIL, remainder = slot_plist; NIL != remainder; remainder = cddr(remainder)) {
            key = remainder.first();
            value = cadr(remainder);
            slot = slots.slot_assoc_by_name(symbol_name(key), compiled_class_slot_access_alist);
            if (NIL != slot) {
                slot_name = slots.slot_name(slot);
                instances.set_slot(v_object, slot_name, value);
            }
        }
        for (remainder = NIL, remainder = slot_plist; NIL != remainder; remainder = cddr(remainder)) {
            key = remainder.first();
            value = cadr(remainder);
            slot = slots.slot_assoc_by_name(symbol_name(key), compiled_instance_slot_access_alist);
            if (NIL != slot) {
                slot_name = slots.slot_name(slot);
                instances.set_slot(v_object, slot_name, value);
            }
        }
        return v_object;
    }

    static private final SubLString $str_alt100$_ADD_GET_SLOT_LISTENER_STIMULATED = makeString("(ADD-GET-SLOT-LISTENER-STIMULATED-BY-RANGE OBJECT): target instance ~S is not an instance.");

    static private final SubLString $str_alt101$_ADD_GET_SLOT_LISTENER_STIMULATED = makeString("(ADD-GET-SLOT-LISTENER-STIMULATED-BY-RANGE OBJECT): target slot ~S is not a slot.");

    static private final SubLString $str_alt102$_ADD_GET_SLOT_LISTENER_STIMULATED = makeString("(ADD-GET-SLOT-LISTENER-STIMULATED-BY-RANGE OBJECT): method ~S is not a method.");

    static private final SubLString $str_alt103$_ADD_GET_SLOT_LISTENER_STIMULATED = makeString("(ADD-GET-SLOT-LISTENER-STIMULATED-BY-RANGE OBJECT): lower ~S and upper ~S bound must be either a string,~\n     ~%a number, or a character and both must be of the same type.");

    static private final SubLList $list_alt106 = list(makeSymbol("TARGET-INSTANCE"), makeSymbol("TARGET-SLOT"), makeSymbol("MY-METHOD"), makeSymbol("TRIGGER-ENUMERATION"));

    static private final SubLList $list_alt107 = list(list(makeSymbol("MUST"), list(makeSymbol("INSTANCE-P"), makeSymbol("TARGET-INSTANCE")), makeString("(ADD-GET-SLOT-LISTENER-STIMULATED-BY-ENUM OBJECT): target instance ~S is not an instance."), makeSymbol("TARGET-INSTANCE")), list(makeSymbol("MUST"), list(makeSymbol("SYMBOLP"), makeSymbol("TARGET-SLOT")), makeString("(ADD-GET-SLOT-LISTENER-STIMULATED-BY-ENUM OBJECT): target slot ~S is not a slot."), makeSymbol("TARGET-SLOT")), list(makeSymbol("MUST"), list(makeSymbol("SYMBOLP"), makeSymbol("MY-METHOD")), makeString("(ADD-GET-SLOT-LISTENER-STIMULATED-BY-ENUM OBJECT): method ~S is not a method."), makeSymbol("MY-METHOD")), list(makeSymbol("ADD-GENERIC-SLOT-LISTENER-STIMULATED-BY-ENUM"), makeSymbol("TARGET-INSTANCE"), makeSymbol("TARGET-SLOT"), makeKeyword("GET"), makeSymbol("MY-METHOD"), makeSymbol("SELF"), makeSymbol("TRIGGER-ENUMERATION")), list(RET, makeSymbol("MY-METHOD")));

    static private final SubLString $str_alt108$_ADD_GET_SLOT_LISTENER_STIMULATED = makeString("(ADD-GET-SLOT-LISTENER-STIMULATED-BY-ENUM OBJECT): target instance ~S is not an instance.");

    static private final SubLString $str_alt109$_ADD_GET_SLOT_LISTENER_STIMULATED = makeString("(ADD-GET-SLOT-LISTENER-STIMULATED-BY-ENUM OBJECT): target slot ~S is not a slot.");

    static private final SubLString $str_alt110$_ADD_GET_SLOT_LISTENER_STIMULATED = makeString("(ADD-GET-SLOT-LISTENER-STIMULATED-BY-ENUM OBJECT): method ~S is not a method.");

    /**
     * This is analogous to @xref PRINT-UNREADABLE-OBJECT, but specialized for class instances.
     * Intended to aid in the writing of PRINT methods for classes, by factoring out the essentials.
     * See the print methods of @xref CHARNIAK-PARSER and @xref VERB-ARGUMENT-STATS for sample uses.
     */
    @LispMethod(comment = "This is analogous to @xref PRINT-UNREADABLE-OBJECT, but specialized for class instances.\r\nIntended to aid in the writing of PRINT methods for classes, by factoring out the essentials.\r\nSee the print methods of @xref CHARNIAK-PARSER and @xref VERB-ARGUMENT-STATS for sample uses.\nThis is analogous to @xref PRINT-UNREADABLE-OBJECT, but specialized for class instances.\nIntended to aid in the writing of PRINT methods for classes, by factoring out the essentials.\nSee the print methods of @xref CHARNIAK-PARSER and @xref VERB-ARGUMENT-STATS for sample uses.")
    public static final SubLObject print_class_instance_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt195);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject instance = NIL;
                    SubLObject stream = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt195);
                    instance = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt195);
                    stream = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_4 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt195);
                            current_4 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt195);
                            if (NIL == member(current_4, $list_alt196, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_4 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt195);
                        }
                        {
                            SubLObject number_tail = property_list_member($NUMBER, current);
                            SubLObject number = (NIL != number_tail) ? ((SubLObject) (cadr(number_tail))) : NIL;
                            SubLObject identity_tail = property_list_member($IDENTITY, current);
                            SubLObject identity = (NIL != identity_tail) ? ((SubLObject) (cadr(identity_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject instance_var = make_symbol($$$INSTANCE);
                                SubLObject stream_var = make_symbol($$$STREAM);
                                return list(PROGN, listS(CHECK_TYPE, instance, $list_alt204), list(CLET, list(list(instance_var, instance), list(stream_var, stream)), listS(PRINT_UNREADABLE_OBJECT, list(instance_var, stream_var, $IDENTITY, identity), list(PRINC, list(CLASS_NAME, list(INSTANCE_CLASS, instance_var)), stream_var), list(PWHEN, number, list(FORMAT, stream_var, $str_alt212$__A, list(GET_OBJECT_INSTANCE_NUMBER, instance_var))), NIL != body ? ((SubLObject) (list(WRITE_CHAR, CHAR_space, stream_var))) : NIL, append(body, NIL))));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * This is analogous to @xref PRINT-UNREADABLE-OBJECT, but specialized for class instances.
     * Intended to aid in the writing of PRINT methods for classes, by factoring out the essentials.
     * See the print methods of @xref CHARNIAK-PARSER and @xref VERB-ARGUMENT-STATS for sample uses.
     */
    @LispMethod(comment = "This is analogous to @xref PRINT-UNREADABLE-OBJECT, but specialized for class instances.\r\nIntended to aid in the writing of PRINT methods for classes, by factoring out the essentials.\r\nSee the print methods of @xref CHARNIAK-PARSER and @xref VERB-ARGUMENT-STATS for sample uses.\nThis is analogous to @xref PRINT-UNREADABLE-OBJECT, but specialized for class instances.\nIntended to aid in the writing of PRINT methods for classes, by factoring out the essentials.\nSee the print methods of @xref CHARNIAK-PARSER and @xref VERB-ARGUMENT-STATS for sample uses.")
    public static SubLObject print_class_instance(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list195);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject instance = NIL;
        SubLObject stream = NIL;
        destructuring_bind_must_consp(current, datum, $list195);
        instance = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list195);
        stream = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$4 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list195);
            current_$4 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list195);
            if (NIL == member(current_$4, $list196, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$4 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list195);
        }
        final SubLObject number_tail = property_list_member($NUMBER, current);
        final SubLObject number = (NIL != number_tail) ? cadr(number_tail) : NIL;
        final SubLObject identity_tail = property_list_member($IDENTITY, current);
        final SubLObject identity = (NIL != identity_tail) ? cadr(identity_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject instance_var = make_symbol($$$INSTANCE);
        final SubLObject stream_var = make_symbol($$$STREAM);
        return list(PROGN, listS(CHECK_TYPE, instance, $list204), list(CLET, list(list(instance_var, instance), list(stream_var, stream)), listS(PRINT_UNREADABLE_OBJECT, list(instance_var, stream_var, $IDENTITY, identity), list(PRINC, list(CLASS_NAME, list(INSTANCE_CLASS, instance_var)), stream_var), list(PWHEN, number, list(FORMAT, stream_var, $str212$__A, list(GET_OBJECT_INSTANCE_NUMBER, instance_var))), NIL != body ? list(WRITE_CHAR, CHAR_space, stream_var) : NIL, append(body, NIL))));
    }

    static private final SubLList $list_alt113 = list(list(makeSymbol("MUST"), list(makeSymbol("INSTANCE-P"), makeSymbol("TARGET-INSTANCE")), makeString("(ADD-SET-SLOT-LISTENER OBJECT): target instance ~S is not an instance."), makeSymbol("TARGET-INSTANCE")), list(makeSymbol("MUST"), list(makeSymbol("SYMBOLP"), makeSymbol("TARGET-SLOT")), makeString("(ADD-SET-SLOT-LISTENER OBJECT): target slot ~S is not a slot."), makeSymbol("TARGET-SLOT")), list(makeSymbol("MUST"), list(makeSymbol("SYMBOLP"), makeSymbol("MY-METHOD")), makeString("(ADD-SET-SLOT-LISTENER OBJECT): method ~S is not a method."), makeSymbol("MY-METHOD")), list(makeSymbol("ADD-GENERIC-SLOT-LISTENER"), makeSymbol("TARGET-INSTANCE"), makeSymbol("TARGET-SLOT"), makeKeyword("SET"), makeSymbol("MY-METHOD"), makeSymbol("SELF")), list(RET, makeSymbol("MY-METHOD")));

    static private final SubLString $str_alt114$_ADD_SET_SLOT_LISTENER_OBJECT___t = makeString("(ADD-SET-SLOT-LISTENER OBJECT): target instance ~S is not an instance.");

    static private final SubLString $str_alt115$_ADD_SET_SLOT_LISTENER_OBJECT___t = makeString("(ADD-SET-SLOT-LISTENER OBJECT): target slot ~S is not a slot.");

    static private final SubLString $str_alt116$_ADD_SET_SLOT_LISTENER_OBJECT___m = makeString("(ADD-SET-SLOT-LISTENER OBJECT): method ~S is not a method.");

    static private final SubLList $list_alt120 = list(list(makeSymbol("MUST"), list(makeSymbol("INSTANCE-P"), makeSymbol("TARGET-INSTANCE")), makeString("(ADD-SET-SLOT-LISTENER-STIMULATED-BY-VALUE OBJECT): target instance ~S is not an instance."), makeSymbol("TARGET-INSTANCE")), list(makeSymbol("MUST"), list(makeSymbol("SYMBOLP"), makeSymbol("TARGET-SLOT")), makeString("(ADD-SET-SLOT-LISTENER-STIMULATED-BY-VALUE OBJECT): target slot ~S is not a slot."), makeSymbol("TARGET-SLOT")), list(makeSymbol("MUST"), list(makeSymbol("SYMBOLP"), makeSymbol("MY-METHOD")), makeString("(ADD-SET-SLOT-LISTENER-STIMULATED-BY-VALUE OBJECT): method ~S is not a method."), makeSymbol("MY-METHOD")), list(makeSymbol("ADD-GENERIC-SLOT-LISTENER-STIMULATED-BY-VALUE"), makeSymbol("TARGET-INSTANCE"), makeSymbol("TARGET-SLOT"), makeKeyword("SET"), makeSymbol("MY-METHOD"), makeSymbol("SELF"), makeSymbol("TRIGGER-VALUE")), list(RET, makeSymbol("MY-METHOD")));

    public static SubLObject declare_object_file() {
        declareFunction("get_object_instance_number", "GET-OBJECT-INSTANCE-NUMBER", 1, 0, false);
        declareFunction("set_object_instance_number", "SET-OBJECT-INSTANCE-NUMBER", 2, 0, false);
        declareFunction("get_object_isolated_p", "GET-OBJECT-ISOLATED-P", 1, 0, false);
        declareFunction("set_object_isolated_p", "SET-OBJECT-ISOLATED-P", 2, 0, false);
        declareFunction("get_object_instance_count", "GET-OBJECT-INSTANCE-COUNT", 1, 0, false);
        declareFunction("set_object_instance_count", "SET-OBJECT-INSTANCE-COUNT", 2, 0, false);
        declareFunction("subloop_reserved_initialize_object_class", "SUBLOOP-RESERVED-INITIALIZE-OBJECT-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_object_instance", "SUBLOOP-RESERVED-INITIALIZE-OBJECT-INSTANCE", 1, 0, false);
        declareFunction("object_p", "OBJECT-P", 1, 0, false);
        declareFunction("object_new_method", "OBJECT-NEW-METHOD", 1, 0, false);
        declareFunction("object_class_of_method", "OBJECT-CLASS-OF-METHOD", 1, 0, false);
        declareFunction("object_describe_class_method", "OBJECT-DESCRIBE-CLASS-METHOD", 1, 2, false);
        declareFunction("object_parent_class_method", "OBJECT-PARENT-CLASS-METHOD", 1, 0, false);
        declareFunction("object_child_classes_method", "OBJECT-CHILD-CLASSES-METHOD", 1, 0, false);
        declareFunction("object_implements_method_p_method", "OBJECT-IMPLEMENTS-METHOD-P-METHOD", 2, 0, false);
        declareFunction("object_method_lambda_list_method", "OBJECT-METHOD-LAMBDA-LIST-METHOD", 2, 0, false);
        declareFunction("object_has_slot_p_method", "OBJECT-HAS-SLOT-P-METHOD", 2, 0, false);
        declareFunction("object_on_destroy_class_method", "OBJECT-ON-DESTROY-CLASS-METHOD", 1, 0, false);
        declareFunction("object_cfasl_input_method", "OBJECT-CFASL-INPUT-METHOD", 2, 0, false);
        declareFunction("object_initialize_method", "OBJECT-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("object_print_method", "OBJECT-PRINT-METHOD", 3, 0, false);
        declareFunction("object_equal_method", "OBJECT-EQUAL-METHOD", 2, 0, false);
        declareFunction("object_essentially_equal_method", "OBJECT-ESSENTIALLY-EQUAL-METHOD", 2, 1, false);
        declareFunction("object_clone_method", "OBJECT-CLONE-METHOD", 1, 0, false);
        declareFunction("object_describe_instance_method", "OBJECT-DESCRIBE-INSTANCE-METHOD", 1, 2, false);
        declareFunction("object_cfasl_output_method", "OBJECT-CFASL-OUTPUT-METHOD", 2, 0, false);
        declareFunction("object_add_get_slot_listener_method", "OBJECT-ADD-GET-SLOT-LISTENER-METHOD", 4, 0, false);
        declareFunction("object_add_get_slot_listener_stimulated_by_value_method", "OBJECT-ADD-GET-SLOT-LISTENER-STIMULATED-BY-VALUE-METHOD", 5, 0, false);
        declareFunction("object_add_get_slot_listener_stimulated_by_range_method", "OBJECT-ADD-GET-SLOT-LISTENER-STIMULATED-BY-RANGE-METHOD", 6, 0, false);
        declareFunction("object_add_get_slot_listener_stimulated_by_enum_method", "OBJECT-ADD-GET-SLOT-LISTENER-STIMULATED-BY-ENUM-METHOD", 5, 0, false);
        declareFunction("object_add_set_slot_listener_method", "OBJECT-ADD-SET-SLOT-LISTENER-METHOD", 4, 0, false);
        declareFunction("object_add_set_slot_listener_stimulated_by_value_method", "OBJECT-ADD-SET-SLOT-LISTENER-STIMULATED-BY-VALUE-METHOD", 5, 0, false);
        declareFunction("object_add_set_slot_listener_stimulated_by_range_method", "OBJECT-ADD-SET-SLOT-LISTENER-STIMULATED-BY-RANGE-METHOD", 6, 0, false);
        declareFunction("object_add_set_slot_listener_stimulated_by_enum_method", "OBJECT-ADD-SET-SLOT-LISTENER-STIMULATED-BY-ENUM-METHOD", 5, 0, false);
        declareFunction("object_remove_all_get_slot_listeners_method", "OBJECT-REMOVE-ALL-GET-SLOT-LISTENERS-METHOD", 2, 1, false);
        declareFunction("object_remove_all_set_slot_listeners_method", "OBJECT-REMOVE-ALL-SET-SLOT-LISTENERS-METHOD", 2, 1, false);
        declareFunction("object_remove_all_slot_listeners_method", "OBJECT-REMOVE-ALL-SLOT-LISTENERS-METHOD", 2, 1, false);
        declareFunction("object_add_class_wide_before_method_listener_method", "OBJECT-ADD-CLASS-WIDE-BEFORE-METHOD-LISTENER-METHOD", 4, 0, false);
        declareFunction("object_add_class_wide_after_method_listener_method", "OBJECT-ADD-CLASS-WIDE-AFTER-METHOD-LISTENER-METHOD", 4, 0, false);
        declareFunction("object_remove_all_class_wide_method_listeners_method", "OBJECT-REMOVE-ALL-CLASS-WIDE-METHOD-LISTENERS-METHOD", 2, 1, false);
        declareFunction("object_isolate_method", "OBJECT-ISOLATE-METHOD", 1, 0, false);
        declareFunction("object_plistify_method", "OBJECT-PLISTIFY-METHOD", 1, 0, false);
        declareFunction("object_listify_method", "OBJECT-LISTIFY-METHOD", 1, 0, false);
        declareFunction("object_assimilate_method", "OBJECT-ASSIMILATE-METHOD", 2, 0, false);
        declareFunction("describe_instance", "DESCRIBE-INSTANCE", 1, 0, false);
        declareFunction("new_object_instance", "NEW-OBJECT-INSTANCE", 1, 0, false);
        declareFunction("new_class_instance", "NEW-CLASS-INSTANCE", 1, 0, false);
        declareFunction("create_object_from_list", "CREATE-OBJECT-FROM-LIST", 1, 1, false);
        declareMacro("print_class_instance", "PRINT-CLASS-INSTANCE");
        return NIL;
    }

    static private final SubLString $str_alt121$_ADD_SET_SLOT_LISTENER_STIMULATED = makeString("(ADD-SET-SLOT-LISTENER-STIMULATED-BY-VALUE OBJECT): target instance ~S is not an instance.");

    static private final SubLString $str_alt122$_ADD_SET_SLOT_LISTENER_STIMULATED = makeString("(ADD-SET-SLOT-LISTENER-STIMULATED-BY-VALUE OBJECT): target slot ~S is not a slot.");

    static private final SubLString $str_alt123$_ADD_SET_SLOT_LISTENER_STIMULATED = makeString("(ADD-SET-SLOT-LISTENER-STIMULATED-BY-VALUE OBJECT): method ~S is not a method.");

    static private final SubLList $list_alt126 = list(list(makeSymbol("MUST"), list(makeSymbol("INSTANCE-P"), makeSymbol("TARGET-INSTANCE")), makeString("(ADD-SET-SLOT-LISTENER-STIMULATED-BY-RANGE OBJECT): target instance ~S is not an instance."), makeSymbol("TARGET-INSTANCE")), list(makeSymbol("MUST"), list(makeSymbol("SYMBOLP"), makeSymbol("TARGET-SLOT")), makeString("(ADD-SET-SLOT-LISTENER-STIMULATED-BY-RANGE OBJECT): target slot ~S is not a slot."), makeSymbol("TARGET-SLOT")), list(makeSymbol("MUST"), list(makeSymbol("SYMBOLP"), makeSymbol("MY-METHOD")), makeString("(ADD-SET-SLOT-LISTENER-STIMULATED-BY-RANGE OBJECT): method ~S is not a method."), makeSymbol("MY-METHOD")), list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("CAND"), list(makeSymbol("NUMBERP"), makeSymbol("TRIGGER-VALUE-LOWER-BOUND")), list(makeSymbol("NUMBERP"), makeSymbol("TRIGGER-VALUE-UPPER-BOUND"))), list(makeSymbol("CAND"), list(makeSymbol("STRINGP"), makeSymbol("TRIGGER-VALUE-LOWER-BOUND")), list(makeSymbol("STRINGP"), makeSymbol("TRIGGER-VALUE-UPPER-BOUND"))), list(makeSymbol("CAND"), list(makeSymbol("CHARACTERP"), makeSymbol("TRIGGER-VALUE-LOWER-BOUND")), list(makeSymbol("CHARACTERP"), makeSymbol("TRIGGER-VALUE-UPPER-BOUND")))), makeString("(ADD-SET-SLOT-LISTENER-STIMULATED-BY-RANGE OBJECT): lower ~S and upper ~S bound must be either a string,~\n     ~%a number, or a character and both must be of the same type."), makeSymbol("TRIGGER-VALUE-LOWER-BOUND"), makeSymbol("TRIGGER-VALUE-UPPER-BOUND")), list(makeSymbol("ADD-GENERIC-SLOT-LISTENER-STIMULATED-BY-RANGE"), makeSymbol("TARGET-INSTANCE"), makeSymbol("TARGET-SLOT"), makeKeyword("SET"), makeSymbol("MY-METHOD"), makeSymbol("SELF"), makeSymbol("TRIGGER-VALUE-LOWER-BOUND"), makeSymbol("TRIGGER-VALUE-UPPER-BOUND")), list(RET, makeSymbol("MY-METHOD")));

    static private final SubLString $str_alt127$_ADD_SET_SLOT_LISTENER_STIMULATED = makeString("(ADD-SET-SLOT-LISTENER-STIMULATED-BY-RANGE OBJECT): target instance ~S is not an instance.");

    static private final SubLString $str_alt128$_ADD_SET_SLOT_LISTENER_STIMULATED = makeString("(ADD-SET-SLOT-LISTENER-STIMULATED-BY-RANGE OBJECT): target slot ~S is not a slot.");

    static private final SubLString $str_alt129$_ADD_SET_SLOT_LISTENER_STIMULATED = makeString("(ADD-SET-SLOT-LISTENER-STIMULATED-BY-RANGE OBJECT): method ~S is not a method.");

    static private final SubLString $str_alt130$_ADD_SET_SLOT_LISTENER_STIMULATED = makeString("(ADD-SET-SLOT-LISTENER-STIMULATED-BY-RANGE OBJECT): lower ~S and upper ~S bound must be either a string,~\n     ~%a number, or a character and both must be of the same type.");

    static private final SubLList $list_alt133 = list(list(makeSymbol("MUST"), list(makeSymbol("INSTANCE-P"), makeSymbol("TARGET-INSTANCE")), makeString("(ADD-SET-SLOT-LISTENER-STIMULATED-BY-ENUM OBJECT): target instance ~S is not an instance."), makeSymbol("TARGET-INSTANCE")), list(makeSymbol("MUST"), list(makeSymbol("SYMBOLP"), makeSymbol("TARGET-SLOT")), makeString("(ADD-SET-SLOT-LISTENER-STIMULATED-BY-ENUM OBJECT): target slot ~S is not a slot."), makeSymbol("TARGET-SLOT")), list(makeSymbol("MUST"), list(makeSymbol("SYMBOLP"), makeSymbol("MY-METHOD")), makeString("(ADD-SET-SLOT-LISTENER-STIMULATED-BY-ENUM OBJECT): method ~S is not a method."), makeSymbol("MY-METHOD")), list(makeSymbol("ADD-GENERIC-SLOT-LISTENER-STIMULATED-BY-ENUM"), makeSymbol("TARGET-INSTANCE"), makeSymbol("TARGET-SLOT"), makeKeyword("SET"), makeSymbol("MY-METHOD"), makeSymbol("SELF"), makeSymbol("TRIGGER-ENUMERATION")), list(RET, makeSymbol("MY-METHOD")));

    static private final SubLString $str_alt134$_ADD_SET_SLOT_LISTENER_STIMULATED = makeString("(ADD-SET-SLOT-LISTENER-STIMULATED-BY-ENUM OBJECT): target instance ~S is not an instance.");

    static private final SubLString $str_alt135$_ADD_SET_SLOT_LISTENER_STIMULATED = makeString("(ADD-SET-SLOT-LISTENER-STIMULATED-BY-ENUM OBJECT): target slot ~S is not a slot.");

    static private final SubLString $str_alt136$_ADD_SET_SLOT_LISTENER_STIMULATED = makeString("(ADD-SET-SLOT-LISTENER-STIMULATED-BY-ENUM OBJECT): method ~S is not a method.");

    public static SubLObject init_object_file() {
        return NIL;
    }

    public static SubLObject setup_object_file() {
        classes.subloop_new_class(OBJECT, NIL, NIL, NIL, $list1);
        classes.class_set_implements_slot_listeners(OBJECT, NIL);
        classes.subloop_note_class_initialization_function(OBJECT, SUBLOOP_RESERVED_INITIALIZE_OBJECT_CLASS);
        classes.subloop_note_instance_initialization_function(OBJECT, SUBLOOP_RESERVED_INITIALIZE_OBJECT_INSTANCE);
        subloop_reserved_initialize_object_class(OBJECT);
        methods.methods_incorporate_class_method(NEW, OBJECT, $list9, NIL, $list10);
        methods.subloop_register_class_method(OBJECT, NEW, OBJECT_NEW_METHOD);
        methods.methods_incorporate_class_method(CLASS_OF, OBJECT, NIL, NIL, $list14);
        methods.subloop_register_class_method(OBJECT, CLASS_OF, OBJECT_CLASS_OF_METHOD);
        methods.methods_incorporate_class_method(DESCRIBE_CLASS, OBJECT, NIL, $list17, $list18);
        methods.subloop_register_class_method(OBJECT, DESCRIBE_CLASS, OBJECT_DESCRIBE_CLASS_METHOD);
        methods.methods_incorporate_class_method(PARENT_CLASS, OBJECT, NIL, NIL, $list25);
        methods.subloop_register_class_method(OBJECT, PARENT_CLASS, OBJECT_PARENT_CLASS_METHOD);
        methods.methods_incorporate_class_method(CHILD_CLASSES, OBJECT, NIL, NIL, $list28);
        methods.subloop_register_class_method(OBJECT, CHILD_CLASSES, OBJECT_CHILD_CLASSES_METHOD);
        methods.methods_incorporate_class_method(IMPLEMENTS_METHOD_P, OBJECT, $list31, $list32, $list33);
        methods.subloop_register_class_method(OBJECT, IMPLEMENTS_METHOD_P, OBJECT_IMPLEMENTS_METHOD_P_METHOD);
        methods.methods_incorporate_class_method(METHOD_LAMBDA_LIST, OBJECT, $list31, $list32, $list36);
        methods.subloop_register_class_method(OBJECT, METHOD_LAMBDA_LIST, OBJECT_METHOD_LAMBDA_LIST_METHOD);
        methods.methods_incorporate_class_method(HAS_SLOT_P, OBJECT, $list31, $list39, $list40);
        methods.subloop_register_class_method(OBJECT, HAS_SLOT_P, OBJECT_HAS_SLOT_P_METHOD);
        methods.methods_incorporate_class_method(ON_DESTROY_CLASS, OBJECT, $list31, NIL, $list14);
        methods.subloop_register_class_method(OBJECT, ON_DESTROY_CLASS, OBJECT_ON_DESTROY_CLASS_METHOD);
        methods.methods_incorporate_class_method(CFASL_INPUT, OBJECT, $list45, $list46, $list47);
        methods.subloop_register_class_method(OBJECT, CFASL_INPUT, OBJECT_CFASL_INPUT_METHOD);
        methods.methods_incorporate_instance_method(INITIALIZE, OBJECT, $list9, NIL, $list53);
        methods.subloop_register_instance_method(OBJECT, INITIALIZE, OBJECT_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PRINT, OBJECT, NIL, $list56, $list57);
        methods.subloop_register_instance_method(OBJECT, PRINT, OBJECT_PRINT_METHOD);
        methods.methods_incorporate_instance_method(EQUAL, OBJECT, NIL, $list62, $list63);
        methods.subloop_register_instance_method(OBJECT, EQUAL, OBJECT_EQUAL_METHOD);
        methods.methods_incorporate_instance_method(ESSENTIALLY_EQUAL, OBJECT, $list31, $list66, $list67);
        methods.subloop_register_instance_method(OBJECT, ESSENTIALLY_EQUAL, OBJECT_ESSENTIALLY_EQUAL_METHOD);
        methods.methods_incorporate_instance_method(CLONE, OBJECT, NIL, NIL, $list70);
        methods.subloop_register_instance_method(OBJECT, CLONE, OBJECT_CLONE_METHOD);
        methods.methods_incorporate_instance_method(DESCRIBE_INSTANCE, OBJECT, NIL, $list17, $list73);
        methods.subloop_register_instance_method(OBJECT, DESCRIBE_INSTANCE, OBJECT_DESCRIBE_INSTANCE_METHOD);
        methods.methods_incorporate_instance_method(CFASL_OUTPUT, OBJECT, $list77, $list46, $list78);
        methods.subloop_register_instance_method(OBJECT, CFASL_OUTPUT, OBJECT_CFASL_OUTPUT_METHOD);
        methods.methods_incorporate_instance_method(ADD_GET_SLOT_LISTENER, OBJECT, NIL, $list83, $list84);
        methods.subloop_register_instance_method(OBJECT, ADD_GET_SLOT_LISTENER, OBJECT_ADD_GET_SLOT_LISTENER_METHOD);
        methods.methods_incorporate_instance_method(ADD_GET_SLOT_LISTENER_STIMULATED_BY_VALUE, OBJECT, NIL, $list91, $list92);
        methods.subloop_register_instance_method(OBJECT, ADD_GET_SLOT_LISTENER_STIMULATED_BY_VALUE, OBJECT_ADD_GET_SLOT_LISTENER_STIMULATED_BY_VALUE_METHOD);
        methods.methods_incorporate_instance_method(ADD_GET_SLOT_LISTENER_STIMULATED_BY_RANGE, OBJECT, NIL, $list98, $list99);
        methods.subloop_register_instance_method(OBJECT, ADD_GET_SLOT_LISTENER_STIMULATED_BY_RANGE, OBJECT_ADD_GET_SLOT_LISTENER_STIMULATED_BY_RANGE_METHOD);
        methods.methods_incorporate_instance_method(ADD_GET_SLOT_LISTENER_STIMULATED_BY_ENUM, OBJECT, NIL, $list106, $list107);
        methods.subloop_register_instance_method(OBJECT, ADD_GET_SLOT_LISTENER_STIMULATED_BY_ENUM, OBJECT_ADD_GET_SLOT_LISTENER_STIMULATED_BY_ENUM_METHOD);
        methods.methods_incorporate_instance_method(ADD_SET_SLOT_LISTENER, OBJECT, NIL, $list83, $list113);
        methods.subloop_register_instance_method(OBJECT, ADD_SET_SLOT_LISTENER, OBJECT_ADD_SET_SLOT_LISTENER_METHOD);
        methods.methods_incorporate_instance_method(ADD_SET_SLOT_LISTENER_STIMULATED_BY_VALUE, OBJECT, NIL, $list91, $list120);
        methods.subloop_register_instance_method(OBJECT, ADD_SET_SLOT_LISTENER_STIMULATED_BY_VALUE, OBJECT_ADD_SET_SLOT_LISTENER_STIMULATED_BY_VALUE_METHOD);
        methods.methods_incorporate_instance_method(ADD_SET_SLOT_LISTENER_STIMULATED_BY_RANGE, OBJECT, NIL, $list98, $list126);
        methods.subloop_register_instance_method(OBJECT, ADD_SET_SLOT_LISTENER_STIMULATED_BY_RANGE, OBJECT_ADD_SET_SLOT_LISTENER_STIMULATED_BY_RANGE_METHOD);
        methods.methods_incorporate_instance_method(ADD_SET_SLOT_LISTENER_STIMULATED_BY_ENUM, OBJECT, NIL, $list106, $list133);
        methods.subloop_register_instance_method(OBJECT, ADD_SET_SLOT_LISTENER_STIMULATED_BY_ENUM, OBJECT_ADD_SET_SLOT_LISTENER_STIMULATED_BY_ENUM_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_ALL_GET_SLOT_LISTENERS, OBJECT, NIL, $list139, $list140);
        methods.subloop_register_instance_method(OBJECT, REMOVE_ALL_GET_SLOT_LISTENERS, OBJECT_REMOVE_ALL_GET_SLOT_LISTENERS_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_ALL_SET_SLOT_LISTENERS, OBJECT, NIL, $list139, $list145);
        methods.subloop_register_instance_method(OBJECT, REMOVE_ALL_SET_SLOT_LISTENERS, OBJECT_REMOVE_ALL_SET_SLOT_LISTENERS_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_ALL_SLOT_LISTENERS, OBJECT, NIL, $list139, $list150);
        methods.subloop_register_instance_method(OBJECT, REMOVE_ALL_SLOT_LISTENERS, OBJECT_REMOVE_ALL_SLOT_LISTENERS_METHOD);
        methods.methods_incorporate_class_method(ADD_CLASS_WIDE_BEFORE_METHOD_LISTENER, OBJECT, NIL, $list155, $list156);
        methods.subloop_register_class_method(OBJECT, ADD_CLASS_WIDE_BEFORE_METHOD_LISTENER, OBJECT_ADD_CLASS_WIDE_BEFORE_METHOD_LISTENER_METHOD);
        methods.methods_incorporate_class_method(ADD_CLASS_WIDE_AFTER_METHOD_LISTENER, OBJECT, NIL, $list155, $list162);
        methods.subloop_register_class_method(OBJECT, ADD_CLASS_WIDE_AFTER_METHOD_LISTENER, OBJECT_ADD_CLASS_WIDE_AFTER_METHOD_LISTENER_METHOD);
        methods.methods_incorporate_class_method(REMOVE_ALL_CLASS_WIDE_METHOD_LISTENERS, OBJECT, NIL, $list168, $list169);
        methods.subloop_register_class_method(OBJECT, REMOVE_ALL_CLASS_WIDE_METHOD_LISTENERS, OBJECT_REMOVE_ALL_CLASS_WIDE_METHOD_LISTENERS_METHOD);
        methods.methods_incorporate_instance_method(ISOLATE, OBJECT, NIL, NIL, $list174);
        methods.subloop_register_instance_method(OBJECT, ISOLATE, OBJECT_ISOLATE_METHOD);
        methods.methods_incorporate_instance_method(PLISTIFY, OBJECT, $list31, NIL, $list178);
        methods.subloop_register_instance_method(OBJECT, PLISTIFY, OBJECT_PLISTIFY_METHOD);
        methods.methods_incorporate_instance_method(LISTIFY, OBJECT, $list31, NIL, $list182);
        methods.subloop_register_instance_method(OBJECT, LISTIFY, OBJECT_LISTIFY_METHOD);
        methods.methods_incorporate_instance_method(ASSIMILATE, OBJECT, $list186, $list187, $list188);
        methods.subloop_register_instance_method(OBJECT, ASSIMILATE, OBJECT_ASSIMILATE_METHOD);
        return NIL;
    }

    static private final SubLList $list_alt139 = list(makeSymbol("TARGET-INSTANCE"), makeSymbol("&OPTIONAL"), list(makeSymbol("TARGET-SLOT"), NIL));

    static private final SubLList $list_alt140 = list(list(makeSymbol("MUST"), list(makeSymbol("INSTANCE-P"), makeSymbol("TARGET-INSTANCE")), makeString("(REMOVE-ALL-GET-SLOT-LISTENERS OBJECT): target instance ~S is not an instance."), makeSymbol("TARGET-INSTANCE")), list(makeSymbol("MUST"), list(makeSymbol("SYMBOLP"), makeSymbol("TARGET-SLOT")), makeString("(REMOVE-ALL-GET-SLOT-LISTENERS OBJECT): target slot ~S is not a slot."), makeSymbol("TARGET-SLOT")), list(RET, list(makeSymbol("SLOT-LISTENERS-REMOVE-ALL-GET-SLOT-LISTENERS"), makeSymbol("TARGET-INSTANCE"), makeSymbol("SELF"), makeSymbol("TARGET-SLOT"))));

    static private final SubLString $str_alt141$_REMOVE_ALL_GET_SLOT_LISTENERS_OB = makeString("(REMOVE-ALL-GET-SLOT-LISTENERS OBJECT): target instance ~S is not an instance.");

    static private final SubLString $str_alt142$_REMOVE_ALL_GET_SLOT_LISTENERS_OB = makeString("(REMOVE-ALL-GET-SLOT-LISTENERS OBJECT): target slot ~S is not a slot.");

    static private final SubLList $list_alt145 = list(list(makeSymbol("MUST"), list(makeSymbol("INSTANCE-P"), makeSymbol("TARGET-INSTANCE")), makeString("(REMOVE-ALL-SET-SLOT-LISTENERS OBJECT): target instance ~S is not an instance."), makeSymbol("TARGET-INSTANCE")), list(makeSymbol("MUST"), list(makeSymbol("SYMBOLP"), makeSymbol("TARGET-SLOT")), makeString("(REMOVE-ALL-SET-SLOT-LISTENERS OBJECT): target slot ~S is not a slot."), makeSymbol("TARGET-SLOT")), list(RET, list(makeSymbol("SLOT-LISTENERS-REMOVE-ALL-SET-SLOT-LISTENERS"), makeSymbol("TARGET-INSTANCE"), makeSymbol("SELF"), makeSymbol("TARGET-SLOT"))));

    static private final SubLString $str_alt146$_REMOVE_ALL_SET_SLOT_LISTENERS_OB = makeString("(REMOVE-ALL-SET-SLOT-LISTENERS OBJECT): target instance ~S is not an instance.");

    static private final SubLString $str_alt147$_REMOVE_ALL_SET_SLOT_LISTENERS_OB = makeString("(REMOVE-ALL-SET-SLOT-LISTENERS OBJECT): target slot ~S is not a slot.");

    static private final SubLList $list_alt150 = list(list(makeSymbol("MUST"), list(makeSymbol("INSTANCE-P"), makeSymbol("TARGET-INSTANCE")), makeString("(REMOVE-ALL-SLOT-LISTENERS OBJECT): target instance ~S is not an instance."), makeSymbol("TARGET-INSTANCE")), list(makeSymbol("MUST"), list(makeSymbol("SYMBOLP"), makeSymbol("TARGET-SLOT")), makeString("(REMOVE-ALL-SLOT-LISTENERS OBJECT): target slot ~S is not a slot."), makeSymbol("TARGET-SLOT")), list(RET, list(makeSymbol("SLOT-LISTENERS-REMOVE-ALL-SLOT-LISTENERS"), makeSymbol("TARGET-INSTANCE"), makeSymbol("SELF"), makeSymbol("TARGET-SLOT"))));

    static private final SubLString $str_alt151$_REMOVE_ALL_SLOT_LISTENERS_OBJECT = makeString("(REMOVE-ALL-SLOT-LISTENERS OBJECT): target instance ~S is not an instance.");

    static private final SubLString $str_alt152$_REMOVE_ALL_SLOT_LISTENERS_OBJECT = makeString("(REMOVE-ALL-SLOT-LISTENERS OBJECT): target slot ~S is not a slot.");

    static private final SubLList $list_alt155 = list(makeSymbol("CLASS"), makeSymbol("TARGET-METHOD"), makeSymbol("MY-METHOD"));

    static private final SubLList $list_alt156 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("CLASS-P"), makeSymbol("CLASS")), list(makeSymbol("INSTANCE-P"), makeSymbol("CLASS"))), makeString("(ADD-CLASS-WIDE-BEFORE-METHOD-LISTENER OBJECT): target class  ~S is neither a class nor an instance."), makeSymbol("CLASS")), list(makeSymbol("MUST"), list(makeSymbol("CAND"), makeSymbol("TARGET-METHOD"), list(makeSymbol("SYMBOLP"), makeSymbol("TARGET-METHOD"))), makeString("(ADD-CLASS-WIDE-BEFORE-METHOD-LISTENER OBJECT): target method ~S is not a legal method name."), makeSymbol("TARGET-METHOD")), list(makeSymbol("MUST"), list(makeSymbol("CAND"), makeSymbol("MY-METHOD"), list(makeSymbol("SYMBOLP"), makeSymbol("MY-METHOD"))), makeString("(ADD-CLASS-WIDE-BEFORE-METHOD-LISTENER OBJECT): method ~S is not a legal method name."), makeSymbol("MY-METHOD")), list(makeSymbol("PCOND"), list(list(makeSymbol("CLASS-P"), makeSymbol("CLASS")), list(makeSymbol("METHOD-LISTENERS-ADD-BEFORE-LISTENER"), list(makeSymbol("CLASS-NAME"), makeSymbol("CLASS")), makeSymbol("TARGET-METHOD"), makeSymbol("MY-METHOD"), makeSymbol("SELF"))), list(list(makeSymbol("INSTANCE-P"), makeSymbol("CLASS")), list(makeSymbol("METHOD-LISTENERS-ADD-BEFORE-LISTENER"), list(makeSymbol("CLASS-NAME"), list(makeSymbol("INSTANCE-CLASS"), makeSymbol("CLASS"))), makeSymbol("TARGET-METHOD"), makeSymbol("MY-METHOD"), makeSymbol("SELF")))), list(RET, makeSymbol("MY-METHOD")));

    static private final SubLString $str_alt157$_ADD_CLASS_WIDE_BEFORE_METHOD_LIS = makeString("(ADD-CLASS-WIDE-BEFORE-METHOD-LISTENER OBJECT): target class  ~S is neither a class nor an instance.");

    static private final SubLString $str_alt158$_ADD_CLASS_WIDE_BEFORE_METHOD_LIS = makeString("(ADD-CLASS-WIDE-BEFORE-METHOD-LISTENER OBJECT): target method ~S is not a legal method name.");

    static private final SubLString $str_alt159$_ADD_CLASS_WIDE_BEFORE_METHOD_LIS = makeString("(ADD-CLASS-WIDE-BEFORE-METHOD-LISTENER OBJECT): method ~S is not a legal method name.");

    static private final SubLList $list_alt162 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("CLASS-P"), makeSymbol("CLASS")), list(makeSymbol("INSTANCE-P"), makeSymbol("CLASS"))), makeString("(ADD-CLASS-WIDE-AFTER-METHOD-LISTENER OBJECT): target class  ~S is neither a class nor an instance."), makeSymbol("CLASS")), list(makeSymbol("MUST"), list(makeSymbol("CAND"), makeSymbol("TARGET-METHOD"), list(makeSymbol("SYMBOLP"), makeSymbol("TARGET-METHOD"))), makeString("(ADD-CLASS-WIDE-AFTER-METHOD-LISTENER OBJECT): target method ~S is not a legal method name."), makeSymbol("TARGET-METHOD")), list(makeSymbol("MUST"), list(makeSymbol("CAND"), makeSymbol("MY-METHOD"), list(makeSymbol("SYMBOLP"), makeSymbol("MY-METHOD"))), makeString("(ADD-CLASS-WIDE-AFTER-METHOD-LISTENER OBJECT): method ~S is not a legal method name."), makeSymbol("MY-METHOD")), list(makeSymbol("PCOND"), list(list(makeSymbol("CLASS-P"), makeSymbol("CLASS")), list(makeSymbol("METHOD-LISTENERS-ADD-AFTER-LISTENER"), list(makeSymbol("CLASS-NAME"), makeSymbol("CLASS")), makeSymbol("TARGET-METHOD"), makeSymbol("MY-METHOD"), makeSymbol("SELF"))), list(list(makeSymbol("INSTANCE-P"), makeSymbol("CLASS")), list(makeSymbol("METHOD-LISTENERS-ADD-AFTER-LISTENER"), list(makeSymbol("CLASS-NAME"), list(makeSymbol("INSTANCE-CLASS"), makeSymbol("CLASS"))), makeSymbol("TARGET-METHOD"), makeSymbol("MY-METHOD"), makeSymbol("SELF")))), list(RET, makeSymbol("MY-METHOD")));

    static private final SubLString $str_alt163$_ADD_CLASS_WIDE_AFTER_METHOD_LIST = makeString("(ADD-CLASS-WIDE-AFTER-METHOD-LISTENER OBJECT): target class  ~S is neither a class nor an instance.");

    static private final SubLString $str_alt164$_ADD_CLASS_WIDE_AFTER_METHOD_LIST = makeString("(ADD-CLASS-WIDE-AFTER-METHOD-LISTENER OBJECT): target method ~S is not a legal method name.");

    @Override
    public void declareFunctions() {
        declare_object_file();
    }

    @Override
    public void initializeVariables() {
        init_object_file();
    }

    static private final SubLString $str_alt165$_ADD_CLASS_WIDE_AFTER_METHOD_LIST = makeString("(ADD-CLASS-WIDE-AFTER-METHOD-LISTENER OBJECT): method ~S is not a legal method name.");

    @Override
    public void runTopLevelForms() {
        setup_object_file();
    }

    static {
    }

    static private final SubLList $list_alt168 = list(makeSymbol("MONITORED-INSTANCE"), makeSymbol("&OPTIONAL"), list(makeSymbol("TARGET-METHOD"), NIL));

    static private final SubLList $list_alt169 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("INSTANCE-P"), makeSymbol("MONITORED-INSTANCE")), list(makeSymbol("CLASS-P"), makeSymbol("MONITORED-INSTANCE"))), makeString("(REMOVE-CLASS-WIDE-METHOD-LISTENER OBJECT): monitored instance ~S is not an instance."), makeSymbol("MONITORED-INSTANCE")), list(makeSymbol("MUST"), list(makeSymbol("SYMBOLP"), makeSymbol("TARGET-METHOD")), makeString("(REMOVE-CLASS-WIDE-METHOD-LISTENER OBJECT): target method ~S is not a legal method name."), makeSymbol("TARGET-METHOD")), list(RET, list(makeSymbol("METHOD-LISTENERS-REMOVE-ALL-METHOD-LISTENERS"), makeSymbol("MONITORED-INSTANCE"), makeSymbol("SELF"), makeSymbol("TARGET-METHOD"))));

    static private final SubLString $str_alt170$_REMOVE_CLASS_WIDE_METHOD_LISTENE = makeString("(REMOVE-CLASS-WIDE-METHOD-LISTENER OBJECT): monitored instance ~S is not an instance.");

    static private final SubLString $str_alt171$_REMOVE_CLASS_WIDE_METHOD_LISTENE = makeString("(REMOVE-CLASS-WIDE-METHOD-LISTENER OBJECT): target method ~S is not a legal method name.");

    static private final SubLList $list_alt174 = list(list(makeSymbol("CSETQ"), makeSymbol("ISOLATED-P"), T), list(makeSymbol("SLOT-LISTENERS-REMOVE-ALL-SLOT-LISTENERS"), makeSymbol("SELF")), list(makeSymbol("METHOD-LISTENERS-REMOVE-ALL-METHOD-LISTENERS"), makeSymbol("SELF")), list(RET, NIL));

    static private final SubLList $list_alt178 = list(list(makeSymbol("CLET"), list(list(makeSymbol("LISTED-SLOTS"), NIL), list(makeSymbol("KEYWORD-PACKAGE"), list(makeSymbol("SYMBOL-PACKAGE"), $TEST)), list(makeSymbol("CLASS"), list(makeSymbol("INSTANCE-CLASS"), makeSymbol("SELF")))), list(makeSymbol("WITH-CLASS"), makeSymbol("CLASS"), list(makeSymbol("CDO-ESSENTIAL-SLOTS"), list(makeSymbol("SLOT-NAME"), NIL, NIL, NIL, NIL, makeSymbol("COMPILED-CLASS-SLOT-ACCESS-ALIST")), list(makeSymbol("CPUSH"), list(makeSymbol("INTERN"), list(makeSymbol("SYMBOL-NAME"), makeSymbol("SLOT-NAME")), makeSymbol("KEYWORD-PACKAGE")), makeSymbol("LISTED-SLOTS")), list(makeSymbol("CPUSH"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), makeSymbol("SLOT-NAME")), makeSymbol("LISTED-SLOTS"))), list(makeSymbol("CDO-ESSENTIAL-SLOTS"), list(makeSymbol("SLOT-NAME"), NIL, NIL, NIL, NIL, makeSymbol("COMPILED-CLASS-BOOLEAN-SLOT-ACCESS-ALIST")), list(makeSymbol("CPUSH"), list(makeSymbol("INTERN"), list(makeSymbol("SYMBOL-NAME"), makeSymbol("SLOT-NAME")), makeSymbol("KEYWORD-PACKAGE")), makeSymbol("LISTED-SLOTS")), list(makeSymbol("CPUSH"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), makeSymbol("SLOT-NAME")), makeSymbol("LISTED-SLOTS"))), list(makeSymbol("CDO-ESSENTIAL-SLOTS"), list(makeSymbol("SLOT-NAME"), NIL, NIL, NIL, NIL, makeSymbol("COMPILED-INSTANCE-SLOT-ACCESS-ALIST")), list(makeSymbol("CPUSH"), list(makeSymbol("INTERN"), list(makeSymbol("SYMBOL-NAME"), makeSymbol("SLOT-NAME")), makeSymbol("KEYWORD-PACKAGE")), makeSymbol("LISTED-SLOTS")), list(makeSymbol("CPUSH"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), makeSymbol("SLOT-NAME")), makeSymbol("LISTED-SLOTS"))), list(makeSymbol("CDO-ESSENTIAL-SLOTS"), list(makeSymbol("SLOT-NAME"), NIL, NIL, NIL, NIL, makeSymbol("COMPILED-INSTANCE-BOOLEAN-SLOT-ACCESS-ALIST")), list(makeSymbol("CPUSH"), list(makeSymbol("INTERN"), list(makeSymbol("SYMBOL-NAME"), makeSymbol("SLOT-NAME")), makeSymbol("KEYWORD-PACKAGE")), makeSymbol("LISTED-SLOTS")), list(makeSymbol("CPUSH"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), makeSymbol("SLOT-NAME")), makeSymbol("LISTED-SLOTS")))), list(RET, list(makeSymbol("NREVERSE"), makeSymbol("LISTED-SLOTS")))));

    static private final SubLList $list_alt182 = list(list(RET, list(makeSymbol("LIST*"), list(makeSymbol("CLASS-NAME"), list(makeSymbol("INSTANCE-CLASS"), makeSymbol("SELF"))), makeSymbol("INSTANCE-NUMBER"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PLISTIFY"))))));

    static private final SubLList $list_alt186 = list(makeKeyword("NO-INSTANCE-VARIABLES"), makeKeyword("PUBLIC"));

    static private final SubLList $list_alt187 = list(makeSymbol("PLISTIFIED-CONTENT"));

    static private final SubLList $list_alt188 = list(list(makeSymbol("MUST"), list(makeSymbol("LISTP"), makeSymbol("PLISTIFIED-CONTENT")), makeString("(ASSIMILATE ~S): ~S is not a valid plist."), makeSymbol("SELF")), list(makeSymbol("CLET"), list(makeSymbol("SLOT"), makeSymbol("SLOT-NAME")), list(makeSymbol("WITH-CLASS"), list(makeSymbol("INSTANCE-CLASS"), makeSymbol("SELF")), list(makeSymbol("CDOPLIST"), list(makeSymbol("KEY"), makeSymbol("VALUE"), makeSymbol("PLISTIFIED-CONTENT")), list(makeSymbol("CSETQ"), makeSymbol("SLOT"), list(makeSymbol("SLOT-ASSOC-BY-NAME"), list(makeSymbol("SYMBOL-NAME"), makeSymbol("KEY")), makeSymbol("COMPILED-CLASS-SLOT-ACCESS-ALIST"))), list(makeSymbol("PWHEN"), makeSymbol("SLOT"), list(makeSymbol("CSETQ"), makeSymbol("SLOT-NAME"), list(makeSymbol("SLOT-NAME"), makeSymbol("SLOT"))), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), makeSymbol("SLOT-NAME"), makeSymbol("VALUE")))), list(makeSymbol("CDOPLIST"), list(makeSymbol("KEY"), makeSymbol("VALUE"), makeSymbol("PLISTIFIED-CONTENT")), list(makeSymbol("CSETQ"), makeSymbol("SLOT"), list(makeSymbol("SLOT-ASSOC-BY-NAME"), list(makeSymbol("SYMBOL-NAME"), makeSymbol("KEY")), makeSymbol("COMPILED-INSTANCE-SLOT-ACCESS-ALIST"))), list(makeSymbol("PWHEN"), makeSymbol("SLOT"), list(makeSymbol("CSETQ"), makeSymbol("SLOT-NAME"), list(makeSymbol("SLOT-NAME"), makeSymbol("SLOT"))), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), makeSymbol("SLOT-NAME"), makeSymbol("VALUE"))))), list(RET, makeSymbol("SELF"))));

    static private final SubLString $str_alt189$_ASSIMILATE__S____S_is_not_a_vali = makeString("(ASSIMILATE ~S): ~S is not a valid plist.");

    static private final SubLString $str_alt191$NEW_SUBLOOPS_INSTANCE___S_is_neit = makeString("NEW-SUBLOOPS-INSTANCE: ~S is neither a class name nor a class.");

    static private final SubLString $str_alt192$CREATE_OBJECT_FROM_LIST___S_is_no = makeString("CREATE-OBJECT-FROM-LIST: ~S is not a well formed listified object.");

    static private final SubLList $list_alt193 = listS(makeSymbol("CLASS-NAME"), makeSymbol("INSTANCE-NUMBER"), makeSymbol("SLOT-PLIST"));

    static private final SubLString $str_alt194$CREATE_OBJECT_FROM_LIST___S_does_ = makeString("CREATE-OBJECT-FROM-LIST: ~S does not name a known class.");

    static private final SubLList $list_alt195 = list(list(makeSymbol("INSTANCE"), makeSymbol("STREAM"), makeSymbol("&KEY"), makeSymbol("NUMBER"), IDENTITY), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt196 = list(makeKeyword("NUMBER"), makeKeyword("IDENTITY"));

    static private final SubLList $list_alt204 = list(makeSymbol("INSTANCE-P"));

    static private final SubLString $str_alt212$__A = makeString("-~A");
}

/**
 * Total time: 659 ms
 */
