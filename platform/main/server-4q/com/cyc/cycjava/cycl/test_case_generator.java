/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.control_vars.kb_loaded;
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
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.intern;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.symbolp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subsetp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.prin1;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.read_line;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class test_case_generator extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new test_case_generator();



    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $parse_tree_test_directory$ = makeSymbol("*PARSE-TREE-TEST-DIRECTORY*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $parse_tree_syntax_test_file$ = makeSymbol("*PARSE-TREE-SYNTAX-TEST-FILE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $cyclifier_test_file$ = makeSymbol("*CYCLIFIER-TEST-FILE*");

    static private final SubLString $str3$No_such_file___a = makeString("No such file: ~a");

    static private final SubLString $str5$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $$$Appending_test_cases_to_ = makeString("Appending test cases to ");

    static private final SubLString $str7$___ = makeString("...");

    static private final SubLString $str9$_ = makeString(";");

    private static final SubLSymbol GET_TEST_CASE_DEF = makeSymbol("GET-TEST-CASE-DEF");

    private static final SubLSymbol GET_TEST_CASE_COMMENT = makeSymbol("GET-TEST-CASE-COMMENT");

    static private final SubLString $$$Appending_test_case_to_ = makeString("Appending test case to ");

    private static final SubLSymbol TEST_CASE_GENERATOR = makeSymbol("TEST-CASE-GENERATOR");

    static private final SubLList $list16 = list(new SubLObject[]{ list(makeSymbol("MODULE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("SYSTEM"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CATEGORIES"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DATUM"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("NAME"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("NEW"), list(makeSymbol("MODULE"), makeSymbol("SYSTEM"), makeSymbol("DATUM"), makeSymbol("CATEGORIES")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TEST-CASE-DEF"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SETUP-DEF"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CLEANUP-DEF"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-METHOD-DEFS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-METHOD-DECLS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TEST-CASE-DECL"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TEST-CASE-COMMENT"), NIL, makeKeyword("PROTECTED")) });

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_TEST_CASE_GENERATOR_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TEST-CASE-GENERATOR-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_TEST_CASE_GENERATOR_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TEST-CASE-GENERATOR-INSTANCE");

    static private final SubLList $list27 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list28 = list(makeSymbol("MODULE0"), makeSymbol("SYSTEM0"), makeSymbol("DATUM0"), makeSymbol("CATEGORIES0"));

    static private final SubLList $list29 = list(makeString("@param MODULE0 stringp; the module of the test case\n   @param SYSTEM0 stringp; the system of the test case\n   @param DATUM0 objectp; the datum for which to generate the test case\n   @param CATEGORIES listp; the categories the test case belongs to\n   @return test-case-generator; a new test case generator for MODULE0 in SYSTEM0 belonging\n   to CATEGORIES0 and generating tests operating on DATA0"), list(makeSymbol("CHECK-TYPE"), makeSymbol("CATEGORIES0"), makeSymbol("LISTP")), list(makeSymbol("CLET"), list(list(makeSymbol("GENERATOR"), list(makeSymbol("NEW-CLASS-INSTANCE"), makeSymbol("SELF")))), list(makeSymbol("SET-TEST-CASE-GENERATOR-MODULE"), makeSymbol("GENERATOR"), makeSymbol("MODULE0")), list(makeSymbol("SET-TEST-CASE-GENERATOR-SYSTEM"), makeSymbol("GENERATOR"), makeSymbol("SYSTEM0")), list(makeSymbol("SET-TEST-CASE-GENERATOR-DATUM"), makeSymbol("GENERATOR"), makeSymbol("DATUM0")), list(makeSymbol("SET-TEST-CASE-GENERATOR-CATEGORIES"), makeSymbol("GENERATOR"), makeSymbol("CATEGORIES0")), list(makeSymbol("SET-TEST-CASE-GENERATOR-NAME"), makeSymbol("GENERATOR"), list(makeSymbol("NEW-TEST-CASE-NAME"))), list(RET, makeSymbol("GENERATOR"))));

    private static final SubLSymbol TEST_CASE_GENERATOR_NEW_METHOD = makeSymbol("TEST-CASE-GENERATOR-NEW-METHOD");

    static private final SubLList $list31 = list(makeString("@return values; 1. a declaration of the test case and methods\n                   2. a definition of the test case and methods"), list(makeSymbol("CLET"), list(list(makeSymbol("METHOD-DEFINITIONS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-METHOD-DEFS")))), list(makeSymbol("METHOD-DECLARATIONS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-METHOD-DECLS")), makeSymbol("METHOD-DEFINITIONS"))), list(makeSymbol("TEST-CASE-DECLARATION"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-TEST-CASE-DECL")), makeSymbol("METHOD-DECLARATIONS")))), list(RET, list(makeSymbol("VALUES"), makeSymbol("TEST-CASE-DECLARATION"), list(makeSymbol("CONS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SETUP-DEF"))), list(makeSymbol("CONS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-CLEANUP-DEF"))), makeSymbol("METHOD-DEFINITIONS")))))));

    private static final SubLSymbol GET_METHOD_DEFS = makeSymbol("GET-METHOD-DEFS");

    private static final SubLSymbol GET_METHOD_DECLS = makeSymbol("GET-METHOD-DECLS");

    private static final SubLSymbol GET_TEST_CASE_DECL = makeSymbol("GET-TEST-CASE-DECL");

    private static final SubLSymbol GET_SETUP_DEF = makeSymbol("GET-SETUP-DEF");

    private static final SubLSymbol GET_CLEANUP_DEF = makeSymbol("GET-CLEANUP-DEF");

    private static final SubLSymbol TEST_CASE_GENERATOR_GET_TEST_CASE_DEF_METHOD = makeSymbol("TEST-CASE-GENERATOR-GET-TEST-CASE-DEF-METHOD");

    static private final SubLList $list38 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list39 = list(makeString("@return listp; a definition of a setup method"), list(RET, list(makeSymbol("BQ-LIST*"), list(QUOTE, makeSymbol("DEF-SETUP-METHOD")), list(makeSymbol("BQ-CONS"), makeSymbol("NAME"), list(QUOTE, list(makeKeyword("PROTECTED")))), list(QUOTE, list(NIL, list(RET, NIL))))));

    static private final SubLSymbol $sym40$OUTER_CATCH_FOR_TEST_CASE_GENERATOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-CASE-GENERATOR-METHOD");

    private static final SubLSymbol DEF_SETUP_METHOD = makeSymbol("DEF-SETUP-METHOD");

    static private final SubLList $list42 = list(NIL, list(RET, NIL));

    private static final SubLSymbol TEST_CASE_GENERATOR_GET_SETUP_DEF_METHOD = makeSymbol("TEST-CASE-GENERATOR-GET-SETUP-DEF-METHOD");

    static private final SubLList $list44 = list(makeString("@return listp; a definition of a cleanup method"), list(RET, list(makeSymbol("BQ-LIST*"), list(QUOTE, makeSymbol("DEF-CLEANUP-METHOD")), list(makeSymbol("BQ-CONS"), makeSymbol("NAME"), list(QUOTE, list(makeKeyword("PROTECTED")))), list(QUOTE, list(NIL, list(RET, NIL))))));

    static private final SubLSymbol $sym45$OUTER_CATCH_FOR_TEST_CASE_GENERATOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-CASE-GENERATOR-METHOD");

    private static final SubLSymbol DEF_CLEANUP_METHOD = makeSymbol("DEF-CLEANUP-METHOD");

    private static final SubLSymbol TEST_CASE_GENERATOR_GET_CLEANUP_DEF_METHOD = makeSymbol("TEST-CASE-GENERATOR-GET-CLEANUP-DEF-METHOD");

    static private final SubLList $list48 = list(makeSymbol("METHOD-DEFINITIONS"));

    static private final SubLList $list49 = list(makeString("@return listp; a list of method declarations for each method in METHOD-DEFINITIONS"), list(makeSymbol("CLET"), list(list(makeSymbol("DECLARATIONS"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("METHOD-DEF"), makeSymbol("METHOD-DEFINITIONS")), list(makeSymbol("CLET"), list(list(makeSymbol("METHOD-NAME"), list(makeSymbol("FIRST"), list(makeSymbol("SECOND"), makeSymbol("METHOD-DEF"))))), list(makeSymbol("CPUSH"), list(makeSymbol("BQ-LIST*"), list(QUOTE, makeSymbol("DEF-INSTANCE-METHOD")), makeSymbol("METHOD-NAME"), list(QUOTE, list(NIL, makeKeyword("PROTECTED")))), makeSymbol("DECLARATIONS")))), list(RET, list(makeSymbol("NREVERSE"), makeSymbol("DECLARATIONS")))));

    static private final SubLList $list51 = list(NIL, makeKeyword("PROTECTED"));

    private static final SubLSymbol TEST_CASE_GENERATOR_GET_METHOD_DECLS_METHOD = makeSymbol("TEST-CASE-GENERATOR-GET-METHOD-DECLS-METHOD");

    static private final SubLList $list53 = list(makeString("@return stringp; a comment string for the test case this generator generates"), list(RET, list(new SubLObject[]{ makeSymbol("FORMAT"), NIL, makeString(";;;;~%;; TEST: ~a~%;; CATEGORIES: ~a~%;;~%;; DATE: ~a~%;; REVISION: ~a~%;; KB: ~a.~a~%;; USER: ~a~%;;;;~%"), makeSymbol("DATUM"), makeSymbol("CATEGORIES"), list(makeSymbol("GET-UNIVERSAL-DATE")), list(makeSymbol("CYC-REVISION-STRING")), list(makeSymbol("KB-LOADED")), list(makeSymbol("REMOTE-OPS-PROCESSED")), list(makeSymbol("GET-USER-NAME")) })));

    static private final SubLSymbol $sym54$OUTER_CATCH_FOR_TEST_CASE_GENERATOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-CASE-GENERATOR-METHOD");

    static private final SubLString $str55$_________TEST___a_____CATEGORIES_ = makeString(";;;;~%;; TEST: ~a~%;; CATEGORIES: ~a~%;;~%;; DATE: ~a~%;; REVISION: ~a~%;; KB: ~a.~a~%;; USER: ~a~%;;;;~%");

    private static final SubLSymbol TEST_CASE_GENERATOR_GET_TEST_CASE_COMMENT_METHOD = makeSymbol("TEST-CASE-GENERATOR-GET-TEST-CASE-COMMENT-METHOD");

    private static final SubLSymbol CYCLIFIER_TEST_CASE_GENERATOR = makeSymbol("CYCLIFIER-TEST-CASE-GENERATOR");

    static private final SubLList $list58 = list(list(makeSymbol("PARSE-EXPRESSION"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("NEW"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TEST-CASE-DECL"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-METHOD-DEFS"), NIL, makeKeyword("PROTECTED")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYCLIFIER_TEST_CASE_GENERATOR_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYCLIFIER-TEST-CASE-GENERATOR-CLASS");

    static private final SubLSymbol $sym61$SUBLOOP_RESERVED_INITIALIZE_CYCLIFIER_TEST_CASE_GENERATOR_INSTANC = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYCLIFIER-TEST-CASE-GENERATOR-INSTANCE");

    static private final SubLList $list62 = list(makeString("@param MODULE0 stringp; the module of the test case\n   @param SYSTEM0 stringp; the system of the test case\n   @param DATUM0 objectp; the datum for which to generate the test case\n   @param CATEGORIES listp; the categories the test case belongs to\n   @return test-case-generator; a new test case generator for MODULE0 in SYSTEM0 belonging\n   to CATEGORIES0 and generating tests operating on DATA0"), list(makeSymbol("CLET"), list(list(makeSymbol("GENERATOR"), list(makeSymbol("FUNCALL-CLASS-SUPER-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("NEW")), makeSymbol("MODULE0"), makeSymbol("SYSTEM0"), makeSymbol("DATUM0"), makeSymbol("CATEGORIES0")))), list(makeSymbol("SET-CYCLIFIER-TEST-CASE-GENERATOR-PARSE-EXPRESSION"), makeSymbol("GENERATOR"), list(makeSymbol("SECOND"), list(makeSymbol("FIRST"), list(makeSymbol("CHARNIAK-PARSE"), makeSymbol("DATUM0"))))), list(RET, makeSymbol("GENERATOR"))));

    private static final SubLSymbol CYCLIFIER_TEST_CASE_GENERATOR_NEW_METHOD = makeSymbol("CYCLIFIER-TEST-CASE-GENERATOR-NEW-METHOD");

    static private final SubLList $list64 = list(makeSymbol("METHOD-DECLARATIONS"));

    static private final SubLList $list65 = list(makeString("@return values; 1. a declaration of the test case and methods\n                     2. a definition of the test case and methods"), list(RET, list(makeSymbol("BQ-LIST*"), list(QUOTE, makeSymbol("DEFINE-TEST-CASE")), list(makeSymbol("BQ-LIST"), makeSymbol("NAME"), makeSymbol("MODULE"), makeSymbol("SYSTEM"), makeKeyword("CATEGORIES"), list(makeSymbol("BQ-LIST"), list(QUOTE, QUOTE), makeSymbol("CATEGORIES"))), list(makeSymbol("BQ-LIST"), list(QUOTE, makeSymbol("PARSE-TREE")), makeKeyword("INSTANCE"), makeKeyword("PRIVATE"), makeKeyword("VALUE"), list(makeSymbol("BQ-LIST"), list(QUOTE, makeSymbol("NEW-PARSE-TREE")), list(makeSymbol("BQ-LIST"), list(QUOTE, QUOTE), makeSymbol("PARSE-EXPRESSION")))), list(QUOTE, list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SETUP"), NIL, makeKeyword("PROTECTED"))), list(QUOTE, list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEANUP"), NIL, makeKeyword("PROTECTED"))), list(makeSymbol("BQ-APPEND"), makeSymbol("METHOD-DECLARATIONS"), NIL))));

    static private final SubLSymbol $sym66$OUTER_CATCH_FOR_CYCLIFIER_TEST_CASE_GENERATOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYCLIFIER-TEST-CASE-GENERATOR-METHOD");

    private static final SubLSymbol DEFINE_TEST_CASE = makeSymbol("DEFINE-TEST-CASE");

    static private final SubLList $list75 = list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SETUP"), NIL, makeKeyword("PROTECTED"));

    static private final SubLList $list76 = list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEANUP"), NIL, makeKeyword("PROTECTED"));

    private static final SubLSymbol CYCLIFIER_TEST_CASE_GENERATOR_GET_TEST_CASE_DECL_METHOD = makeSymbol("CYCLIFIER-TEST-CASE-GENERATOR-GET-TEST-CASE-DECL-METHOD");

    static private final SubLList $list78 = list(makeString("@return listp; a list of definitions of all test methods"), list(makeSymbol("CLET"), list(list(makeSymbol("METHOD-NAME"), list(makeSymbol("INTERN"), makeString("TEST-1"))), list(makeSymbol("CYCLS"), list(makeSymbol("FIM"), list(makeSymbol("NEW-PARSE-TREE"), makeSymbol("PARSE-EXPRESSION")), list(QUOTE, makeSymbol("CYCLIFY")))), list(makeSymbol("METHOD-BODY"), list(makeSymbol("BQ-LIST*"), list(QUOTE, makeSymbol("FAIL-UNLESS-EQUAL")), list(QUOTE, makeSymbol("SELF")), list(makeSymbol("BQ-LIST"), list(QUOTE, QUOTE), makeSymbol("CYCLS")), list(QUOTE, list(makeSymbol("FIM"), makeSymbol("PARSE-TREE"), list(QUOTE, makeSymbol("CYCLIFY")))), list(makeSymbol("CCONCATENATE"), makeString("(cyclify \""), makeSymbol("DATUM"), makeString("\") =/= "), list(makeSymbol("PRINC-TO-STRING"), makeSymbol("CYCLS"))), list(QUOTE, list(list(QUOTE, makeSymbol("CYCLS-EQUAL-P"))))))), list(RET, list(makeSymbol("BQ-LIST"), list(makeSymbol("BQ-LIST"), list(QUOTE, makeSymbol("DEF-TEST-METHOD")), list(makeSymbol("BQ-LIST*"), makeSymbol("METHOD-NAME"), makeSymbol("NAME"), list(QUOTE, list(makeKeyword("PROTECTED")))), NIL, makeSymbol("METHOD-BODY"))))));

    static private final SubLSymbol $sym79$OUTER_CATCH_FOR_CYCLIFIER_TEST_CASE_GENERATOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYCLIFIER-TEST-CASE-GENERATOR-METHOD");

    static private final SubLString $str80$TEST_1 = makeString("TEST-1");

    private static final SubLSymbol FAIL_UNLESS_EQUAL = makeSymbol("FAIL-UNLESS-EQUAL");

    static private final SubLList $list84 = list(makeSymbol("FIM"), makeSymbol("PARSE-TREE"), list(QUOTE, makeSymbol("CYCLIFY")));

    static private final SubLString $str85$_cyclify__ = makeString("(cyclify \"");

    static private final SubLString $str86$_______ = makeString("\") =/= ");

    static private final SubLList $list87 = list(list(QUOTE, makeSymbol("CYCLS-EQUAL-P")));

    private static final SubLSymbol DEF_TEST_METHOD = makeSymbol("DEF-TEST-METHOD");

    private static final SubLSymbol CYCLIFIER_TEST_CASE_GENERATOR_GET_METHOD_DEFS_METHOD = makeSymbol("CYCLIFIER-TEST-CASE-GENERATOR-GET-METHOD-DEFS-METHOD");

    private static final SubLSymbol PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR = makeSymbol("PARSE-TREE-SYNTAX-TEST-CASE-GENERATOR");

    static private final SubLSymbol $sym91$SUBLOOP_RESERVED_INITIALIZE_PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PARSE-TREE-SYNTAX-TEST-CASE-GENERATOR-CLASS");

    static private final SubLSymbol $sym92$SUBLOOP_RESERVED_INITIALIZE_PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PARSE-TREE-SYNTAX-TEST-CASE-GENERATOR-INSTANCE");

    private static final SubLSymbol PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR_NEW_METHOD = makeSymbol("PARSE-TREE-SYNTAX-TEST-CASE-GENERATOR-NEW-METHOD");

    static private final SubLList $list94 = list(makeString("@return values; 1. a declaration of the test case and methods\n                     2. a definition of the test case and methods"), list(RET, list(makeSymbol("BQ-LIST*"), list(QUOTE, makeSymbol("DEFINE-TEST-CASE")), list(makeSymbol("BQ-LIST"), makeSymbol("NAME"), makeSymbol("MODULE"), makeSymbol("SYSTEM"), makeKeyword("CATEGORIES"), list(makeSymbol("BQ-LIST"), list(QUOTE, QUOTE), makeSymbol("CATEGORIES"))), list(makeSymbol("BQ-LIST"), list(QUOTE, makeSymbol("PARSE-TREE")), makeKeyword("CLASS"), makeKeyword("PRIVATE"), makeKeyword("VALUE"), list(makeSymbol("BQ-LIST"), list(QUOTE, makeSymbol("PROCESS-MODIFIERS")), list(makeSymbol("BQ-LIST"), list(QUOTE, makeSymbol("NEW-PARSE-TREE")), list(makeSymbol("BQ-LIST"), list(QUOTE, QUOTE), makeSymbol("PARSE-EXPRESSION"))))), list(QUOTE, list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SETUP"), NIL, makeKeyword("PROTECTED"))), list(QUOTE, list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEANUP"), NIL, makeKeyword("PROTECTED"))), list(makeSymbol("BQ-APPEND"), makeSymbol("METHOD-DECLARATIONS"), NIL))));

    static private final SubLSymbol $sym95$OUTER_CATCH_FOR_PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-PARSE-TREE-SYNTAX-TEST-CASE-GENERATOR-METHOD");

    private static final SubLSymbol PROCESS_MODIFIERS = makeSymbol("PROCESS-MODIFIERS");

    private static final SubLSymbol PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR_GET_TEST_CASE_DECL_METHOD = makeSymbol("PARSE-TREE-SYNTAX-TEST-CASE-GENERATOR-GET-TEST-CASE-DECL-METHOD");

    static private final SubLList $list99 = list(makeString("@return listp; a list of definitions of all test methods"), list(makeSymbol("CLET"), list(list(makeSymbol("PARSE-TREE"), list(makeSymbol("PROCESS-MODIFIERS"), list(makeSymbol("NEW-PARSE-TREE"), makeSymbol("PARSE-EXPRESSION")))), list(makeSymbol("TEST-DATA"), list(makeSymbol("GET-PARSE-TREE-TEST-DATA-RECURSIVELY"), makeSymbol("PARSE-TREE"), list(QUOTE, list(list(makeSymbol("GET-COMPLEMENTS")), list(makeSymbol("GET-MODIFIERS")))))), list(makeSymbol("I"), ZERO_INTEGER), list(makeSymbol("METHOD-DEFINITIONS"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("TEST-DATUM"), makeSymbol("TEST-DATA")), list(makeSymbol("CINC"), makeSymbol("I")), list(makeSymbol("CLET"), list(list(makeSymbol("METHOD-NAME"), list(makeSymbol("INTERN"), list(makeSymbol("CCONCATENATE"), makeString("TEST-"), list(makeSymbol("PRINC-TO-STRING"), makeSymbol("I"))))), list(makeSymbol("METHOD-BODY"), list(makeSymbol("NEW-FAIL-UNLESS-CALL"), makeSymbol("TEST-DATUM"), makeSymbol("PARSE-TREE")))), list(makeSymbol("CPUSH"), list(makeSymbol("BQ-LIST"), list(QUOTE, makeSymbol("DEF-TEST-METHOD")), list(makeSymbol("BQ-LIST*"), makeSymbol("METHOD-NAME"), makeSymbol("NAME"), list(QUOTE, list(makeKeyword("PROTECTED")))), NIL, makeSymbol("METHOD-BODY")), makeSymbol("METHOD-DEFINITIONS")))), list(RET, list(makeSymbol("NREVERSE"), makeSymbol("METHOD-DEFINITIONS")))));

    static private final SubLSymbol $sym100$OUTER_CATCH_FOR_PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-PARSE-TREE-SYNTAX-TEST-CASE-GENERATOR-METHOD");

    static private final SubLList $list101 = list(list(makeSymbol("GET-COMPLEMENTS")), list(makeSymbol("GET-MODIFIERS")));

    static private final SubLString $str102$TEST_ = makeString("TEST-");

    private static final SubLSymbol PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR_GET_METHOD_DEFS_METHOD = makeSymbol("PARSE-TREE-SYNTAX-TEST-CASE-GENERATOR-GET-METHOD-DEFS-METHOD");

    static private final SubLList $list105 = list(QUOTE, makeSymbol("GET-DESCENDANT"));

    static private final SubLList $list107 = list(list(QUOTE, EQUAL));

    static private final SubLString $str109$_ = makeString("(");

    static private final SubLString $$$_ = makeString(" ");

    static private final SubLString $str111$__ = makeString(" (");

    static private final SubLString $str114$_ = makeString(")");

    static private final SubLString $str115$______ = makeString(") =/= ");

    static private final SubLString $str116$_ = makeString(".");

    static private final SubLString $str117$TEST_CASE_ = makeString("TEST-CASE-");

    private static final SubLSymbol IMPLEMENTS_METHOD_P = makeSymbol("IMPLEMENTS-METHOD-P");

    private static final SubLSymbol GET_PATH = makeSymbol("GET-PATH");

    static private final SubLString $str122$_S_is_not_one_of__S = makeString("~S is not one of ~S");

    static private final SubLList $list124 = list(makeSymbol("IN-PACKAGE"), makeString("CYC"));

    static private final SubLSymbol $sym125$EQUALS_EL_ = makeSymbol("EQUALS-EL?");

    static private final SubLString $str126$__cvs_head_cycorp_cyc_top_tests_ = makeString("~/cvs/head/cycorp/cyc/top/tests/");

    static private final SubLString $str127$_parse_tree_syntax_tests_lisp = makeString("/parse-tree-syntax-tests.lisp");

    static private final SubLString $str128$cyclifier_tests_lisp = makeString("cyclifier-tests.lisp");

    static private final SubLList $list129 = list(makeString("Parse Tree Syntax Test"));

    static private final SubLString $str130$parse_tree = makeString("parse-tree");

    static private final SubLString $$$cycl = makeString("cycl");

    static private final SubLList $list132 = list(makeString("Cyclifier Test"));

    // Definitions
    /**
     * Generates SUnit test cases in each of CATEGORIES for each datum in
     * IN-FILE using test case generator GENERATOR-CLASS, and appends them to
     * OUT-FILE.
     *
     * @param GENERATOR-CLASS
     * 		symbolp; the test generator class
     * @param MODULE
     * 		stringp; the module of the tests
     * @param SYSTEM
     * 		stringp; the system of the tests
     * @param CATEGORIES
     * 		listp; a list of categories the test belongs to
     * @param IN-FILE
     * 		stringp; a filename of data to generate tests from, one
     * 		datum per line. Empty lines and Lisp comments are allowed and will become
     * 		part of the output file of tests.
     * @param OUT-FILE
     * 		stringp; the filename the SUnit tests should be written to
     * @return non-negative-integer-p; the number of test methods generated
     */
    @LispMethod(comment = "Generates SUnit test cases in each of CATEGORIES for each datum in\r\nIN-FILE using test case generator GENERATOR-CLASS, and appends them to\r\nOUT-FILE.\r\n\r\n@param GENERATOR-CLASS\r\n\t\tsymbolp; the test generator class\r\n@param MODULE\r\n\t\tstringp; the module of the tests\r\n@param SYSTEM\r\n\t\tstringp; the system of the tests\r\n@param CATEGORIES\r\n\t\tlistp; a list of categories the test belongs to\r\n@param IN-FILE\r\n\t\tstringp; a filename of data to generate tests from, one\r\n\t\tdatum per line. Empty lines and Lisp comments are allowed and will become\r\n\t\tpart of the output file of tests.\r\n@param OUT-FILE\r\n\t\tstringp; the filename the SUnit tests should be written to\r\n@return non-negative-integer-p; the number of test methods generated\nGenerates SUnit test cases in each of CATEGORIES for each datum in\nIN-FILE using test case generator GENERATOR-CLASS, and appends them to\nOUT-FILE.")
    public static final SubLObject add_test_cases_alt(SubLObject generator_class, SubLObject module, SubLObject system, SubLObject categories, SubLObject in_file, SubLObject out_file) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(generator_class, SYMBOLP);
            SubLTrampolineFile.checkType(module, STRINGP);
            SubLTrampolineFile.checkType(system, STRINGP);
            SubLTrampolineFile.checkType(categories, LISTP);
            SubLTrampolineFile.checkType(in_file, STRINGP);
            SubLTrampolineFile.checkType(out_file, STRINGP);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == Filesys.probe_file(in_file)) {
                    Errors.error($str_alt3$No_such_file___a, in_file);
                }
            }
            {
                SubLObject i = ZERO_INTEGER;
                SubLObject stream = NIL;
                try {
                    stream = compatibility.open_text(out_file, $APPEND, NIL);
                    if (!stream.isStream()) {
                        Errors.error($str_alt5$Unable_to_open__S, out_file);
                    }
                    {
                        SubLObject out = stream;
                        princ($str_alt6$Appending_test_cases_to_, UNPROVIDED);
                        princ(out_file, UNPROVIDED);
                        princ($str_alt7$___, UNPROVIDED);
                        terpri(UNPROVIDED);
                        {
                            SubLObject stream_1 = NIL;
                            try {
                                stream_1 = compatibility.open_text(in_file, $INPUT, NIL);
                                if (!stream_1.isStream()) {
                                    Errors.error($str_alt5$Unable_to_open__S, in_file);
                                }
                                {
                                    SubLObject infile = stream_1;
                                    if (infile.isStream()) {
                                        {
                                            SubLObject datum = NIL;
                                            for (datum = read_line(infile, NIL, NIL, UNPROVIDED); NIL != datum; datum = read_line(infile, NIL, NIL, UNPROVIDED)) {
                                                if ((NIL != string_utilities.whitespace_stringP(datum)) || (NIL != string_utilities.starts_with(datum, $str_alt9$_))) {
                                                    prin1(datum, out);
                                                    terpri(out);
                                                } else {
                                                    {
                                                        SubLObject generator = methods.funcall_class_method_with_4_args(generator_class, NEW, module, system, datum, categories);
                                                        thread.resetMultipleValues();
                                                        {
                                                            SubLObject declaration = methods.funcall_instance_method_with_0_args(generator, GET_TEST_CASE_DEF);
                                                            SubLObject definitions = thread.secondMultipleValue();
                                                            thread.resetMultipleValues();
                                                            princ(datum, UNPROVIDED);
                                                            terpri(UNPROVIDED);
                                                            com.cyc.cycjava.cycl.test_case_generator.dump_test_case(methods.funcall_instance_method_with_0_args(generator, GET_TEST_CASE_COMMENT), declaration, definitions, out);
                                                            i = add(i, subtract(length(definitions), TWO_INTEGER));
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if (stream_1.isStream()) {
                                            close(stream_1, UNPROVIDED);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return i;
            }
        }
    }

    // Definitions
    /**
     * Generates SUnit test cases in each of CATEGORIES for each datum in
     * IN-FILE using test case generator GENERATOR-CLASS, and appends them to
     * OUT-FILE.
     *
     * @param GENERATOR-CLASS
     * 		symbolp; the test generator class
     * @param MODULE
     * 		stringp; the module of the tests
     * @param SYSTEM
     * 		stringp; the system of the tests
     * @param CATEGORIES
     * 		listp; a list of categories the test belongs to
     * @param IN-FILE
     * 		stringp; a filename of data to generate tests from, one
     * 		datum per line. Empty lines and Lisp comments are allowed and will become
     * 		part of the output file of tests.
     * @param OUT-FILE
     * 		stringp; the filename the SUnit tests should be written to
     * @return non-negative-integer-p; the number of test methods generated
     */
    @LispMethod(comment = "Generates SUnit test cases in each of CATEGORIES for each datum in\r\nIN-FILE using test case generator GENERATOR-CLASS, and appends them to\r\nOUT-FILE.\r\n\r\n@param GENERATOR-CLASS\r\n\t\tsymbolp; the test generator class\r\n@param MODULE\r\n\t\tstringp; the module of the tests\r\n@param SYSTEM\r\n\t\tstringp; the system of the tests\r\n@param CATEGORIES\r\n\t\tlistp; a list of categories the test belongs to\r\n@param IN-FILE\r\n\t\tstringp; a filename of data to generate tests from, one\r\n\t\tdatum per line. Empty lines and Lisp comments are allowed and will become\r\n\t\tpart of the output file of tests.\r\n@param OUT-FILE\r\n\t\tstringp; the filename the SUnit tests should be written to\r\n@return non-negative-integer-p; the number of test methods generated\nGenerates SUnit test cases in each of CATEGORIES for each datum in\nIN-FILE using test case generator GENERATOR-CLASS, and appends them to\nOUT-FILE.")
    public static SubLObject add_test_cases(final SubLObject generator_class, final SubLObject module, final SubLObject system, final SubLObject categories, final SubLObject in_file, final SubLObject out_file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != symbolp(generator_class) : "! symbolp(generator_class) " + ("Types.symbolp(generator_class) " + "CommonSymbols.NIL != Types.symbolp(generator_class) ") + generator_class;
        assert NIL != stringp(module) : "! stringp(module) " + ("Types.stringp(module) " + "CommonSymbols.NIL != Types.stringp(module) ") + module;
        assert NIL != stringp(system) : "! stringp(system) " + ("Types.stringp(system) " + "CommonSymbols.NIL != Types.stringp(system) ") + system;
        assert NIL != listp(categories) : "! listp(categories) " + ("Types.listp(categories) " + "CommonSymbols.NIL != Types.listp(categories) ") + categories;
        assert NIL != stringp(in_file) : "! stringp(in_file) " + ("Types.stringp(in_file) " + "CommonSymbols.NIL != Types.stringp(in_file) ") + in_file;
        assert NIL != stringp(out_file) : "! stringp(out_file) " + ("Types.stringp(out_file) " + "CommonSymbols.NIL != Types.stringp(out_file) ") + out_file;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == Filesys.probe_file(in_file))) {
            Errors.error($str3$No_such_file___a, in_file);
        }
        SubLObject i = ZERO_INTEGER;
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(out_file, $APPEND);
            if (!stream.isStream()) {
                Errors.error($str5$Unable_to_open__S, out_file);
            }
            final SubLObject out = stream;
            princ($$$Appending_test_cases_to_, UNPROVIDED);
            princ(out_file, UNPROVIDED);
            princ($str7$___, UNPROVIDED);
            terpri(UNPROVIDED);
            SubLObject stream_$1 = NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream_$1 = compatibility.open_text(in_file, $INPUT);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream_$1.isStream()) {
                    Errors.error($str5$Unable_to_open__S, in_file);
                }
                final SubLObject infile = stream_$1;
                if (infile.isStream()) {
                    SubLObject datum;
                    SubLObject generator;
                    SubLObject declaration;
                    SubLObject definitions;
                    for (datum = NIL, datum = file_utilities.cdolines_get_next_line(infile); NIL != datum; datum = file_utilities.cdolines_get_next_line(infile)) {
                        if ((NIL != string_utilities.whitespace_stringP(datum)) || (NIL != string_utilities.starts_with(datum, $str9$_))) {
                            prin1(datum, out);
                            terpri(out);
                        } else {
                            generator = methods.funcall_class_method_with_4_args(generator_class, NEW, module, system, datum, categories);
                            thread.resetMultipleValues();
                            declaration = methods.funcall_instance_method_with_0_args(generator, GET_TEST_CASE_DEF);
                            definitions = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            princ(datum, UNPROVIDED);
                            terpri(UNPROVIDED);
                            dump_test_case(methods.funcall_instance_method_with_0_args(generator, GET_TEST_CASE_COMMENT), declaration, definitions, out);
                            i = add(i, subtract(length(definitions), TWO_INTEGER));
                        }
                    }
                }
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (stream_$1.isStream()) {
                        close(stream_$1, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return i;
    }

    /**
     * Generates SUnit test cases in each of CATEGORIES for DATUM using test
     * case generator GENERATOR-CLASS, and appends them to OUT-FILE.
     *
     * @param GENERATOR-CLASS
     * 		symbolp; the test generator class
     * @param MODULE
     * 		stringp; the module of the tests
     * @param SYSTEM
     * 		stringp; the system of the tests
     * @param CATEGORIES
     * 		listp; a list of categories the test belongs to
     * @param DATUM
     * 		objectp; a datum on for which to generate the tests
     * @param OUT-FILE
     * 		stringp; the filename the SUnit tests should be written to
     * @return non-negative-integer-p; the number of test methods generated
     */
    @LispMethod(comment = "Generates SUnit test cases in each of CATEGORIES for DATUM using test\r\ncase generator GENERATOR-CLASS, and appends them to OUT-FILE.\r\n\r\n@param GENERATOR-CLASS\r\n\t\tsymbolp; the test generator class\r\n@param MODULE\r\n\t\tstringp; the module of the tests\r\n@param SYSTEM\r\n\t\tstringp; the system of the tests\r\n@param CATEGORIES\r\n\t\tlistp; a list of categories the test belongs to\r\n@param DATUM\r\n\t\tobjectp; a datum on for which to generate the tests\r\n@param OUT-FILE\r\n\t\tstringp; the filename the SUnit tests should be written to\r\n@return non-negative-integer-p; the number of test methods generated\nGenerates SUnit test cases in each of CATEGORIES for DATUM using test\ncase generator GENERATOR-CLASS, and appends them to OUT-FILE.")
    public static final SubLObject add_test_case_alt(SubLObject generator_class, SubLObject module, SubLObject system, SubLObject categories, SubLObject datum, SubLObject out_file) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(generator_class, SYMBOLP);
            SubLTrampolineFile.checkType(module, STRINGP);
            SubLTrampolineFile.checkType(system, STRINGP);
            SubLTrampolineFile.checkType(categories, LISTP);
            SubLTrampolineFile.checkType(out_file, STRINGP);
            {
                SubLObject i = NIL;
                SubLObject stream = NIL;
                try {
                    stream = compatibility.open_text(out_file, $APPEND, NIL);
                    if (!stream.isStream()) {
                        Errors.error($str_alt5$Unable_to_open__S, out_file);
                    }
                    {
                        SubLObject out = stream;
                        princ($str_alt13$Appending_test_case_to_, UNPROVIDED);
                        princ(out_file, UNPROVIDED);
                        princ($str_alt7$___, UNPROVIDED);
                        terpri(UNPROVIDED);
                        {
                            SubLObject generator = methods.funcall_class_method_with_4_args(generator_class, NEW, module, system, datum, categories);
                            thread.resetMultipleValues();
                            {
                                SubLObject declaration = methods.funcall_instance_method_with_0_args(generator, GET_TEST_CASE_DEF);
                                SubLObject definitions = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                princ(datum, UNPROVIDED);
                                terpri(UNPROVIDED);
                                com.cyc.cycjava.cycl.test_case_generator.dump_test_case(methods.funcall_instance_method_with_0_args(generator, GET_TEST_CASE_COMMENT), declaration, definitions, out);
                                i = subtract(length(definitions), TWO_INTEGER);
                            }
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return i;
            }
        }
    }

    /**
     * Generates SUnit test cases in each of CATEGORIES for DATUM using test
     * case generator GENERATOR-CLASS, and appends them to OUT-FILE.
     *
     * @param GENERATOR-CLASS
     * 		symbolp; the test generator class
     * @param MODULE
     * 		stringp; the module of the tests
     * @param SYSTEM
     * 		stringp; the system of the tests
     * @param CATEGORIES
     * 		listp; a list of categories the test belongs to
     * @param DATUM
     * 		objectp; a datum on for which to generate the tests
     * @param OUT-FILE
     * 		stringp; the filename the SUnit tests should be written to
     * @return non-negative-integer-p; the number of test methods generated
     */
    @LispMethod(comment = "Generates SUnit test cases in each of CATEGORIES for DATUM using test\r\ncase generator GENERATOR-CLASS, and appends them to OUT-FILE.\r\n\r\n@param GENERATOR-CLASS\r\n\t\tsymbolp; the test generator class\r\n@param MODULE\r\n\t\tstringp; the module of the tests\r\n@param SYSTEM\r\n\t\tstringp; the system of the tests\r\n@param CATEGORIES\r\n\t\tlistp; a list of categories the test belongs to\r\n@param DATUM\r\n\t\tobjectp; a datum on for which to generate the tests\r\n@param OUT-FILE\r\n\t\tstringp; the filename the SUnit tests should be written to\r\n@return non-negative-integer-p; the number of test methods generated\nGenerates SUnit test cases in each of CATEGORIES for DATUM using test\ncase generator GENERATOR-CLASS, and appends them to OUT-FILE.")
    public static SubLObject add_test_case(final SubLObject generator_class, final SubLObject module, final SubLObject system, final SubLObject categories, final SubLObject datum, final SubLObject out_file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != symbolp(generator_class) : "! symbolp(generator_class) " + ("Types.symbolp(generator_class) " + "CommonSymbols.NIL != Types.symbolp(generator_class) ") + generator_class;
        assert NIL != stringp(module) : "! stringp(module) " + ("Types.stringp(module) " + "CommonSymbols.NIL != Types.stringp(module) ") + module;
        assert NIL != stringp(system) : "! stringp(system) " + ("Types.stringp(system) " + "CommonSymbols.NIL != Types.stringp(system) ") + system;
        assert NIL != listp(categories) : "! listp(categories) " + ("Types.listp(categories) " + "CommonSymbols.NIL != Types.listp(categories) ") + categories;
        assert NIL != stringp(out_file) : "! stringp(out_file) " + ("Types.stringp(out_file) " + "CommonSymbols.NIL != Types.stringp(out_file) ") + out_file;
        SubLObject i = NIL;
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(out_file, $APPEND);
            if (!stream.isStream()) {
                Errors.error($str5$Unable_to_open__S, out_file);
            }
            final SubLObject out = stream;
            princ($$$Appending_test_case_to_, UNPROVIDED);
            princ(out_file, UNPROVIDED);
            princ($str7$___, UNPROVIDED);
            terpri(UNPROVIDED);
            final SubLObject generator = methods.funcall_class_method_with_4_args(generator_class, NEW, module, system, datum, categories);
            thread.resetMultipleValues();
            final SubLObject declaration = methods.funcall_instance_method_with_0_args(generator, GET_TEST_CASE_DEF);
            final SubLObject definitions = thread.secondMultipleValue();
            thread.resetMultipleValues();
            princ(datum, UNPROVIDED);
            terpri(UNPROVIDED);
            dump_test_case(methods.funcall_instance_method_with_0_args(generator, GET_TEST_CASE_COMMENT), declaration, definitions, out);
            i = subtract(length(definitions), TWO_INTEGER);
        } finally {
            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return i;
    }

    public static final SubLObject get_test_case_generator_name_alt(SubLObject v_test_case_generator) {
        return classes.subloop_get_access_protected_instance_slot(v_test_case_generator, FIVE_INTEGER, NAME);
    }

    public static SubLObject get_test_case_generator_name(final SubLObject v_test_case_generator) {
        return classes.subloop_get_access_protected_instance_slot(v_test_case_generator, FIVE_INTEGER, NAME);
    }

    public static final SubLObject set_test_case_generator_name_alt(SubLObject v_test_case_generator, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_test_case_generator, value, FIVE_INTEGER, NAME);
    }

    public static SubLObject set_test_case_generator_name(final SubLObject v_test_case_generator, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_test_case_generator, value, FIVE_INTEGER, NAME);
    }

    public static final SubLObject get_test_case_generator_datum_alt(SubLObject v_test_case_generator) {
        return classes.subloop_get_access_protected_instance_slot(v_test_case_generator, FOUR_INTEGER, DATUM);
    }

    public static SubLObject get_test_case_generator_datum(final SubLObject v_test_case_generator) {
        return classes.subloop_get_access_protected_instance_slot(v_test_case_generator, FOUR_INTEGER, DATUM);
    }

    public static final SubLObject set_test_case_generator_datum_alt(SubLObject v_test_case_generator, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_test_case_generator, value, FOUR_INTEGER, DATUM);
    }

    public static SubLObject set_test_case_generator_datum(final SubLObject v_test_case_generator, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_test_case_generator, value, FOUR_INTEGER, DATUM);
    }

    public static final SubLObject get_test_case_generator_categories_alt(SubLObject v_test_case_generator) {
        return classes.subloop_get_access_protected_instance_slot(v_test_case_generator, THREE_INTEGER, CATEGORIES);
    }

    public static SubLObject get_test_case_generator_categories(final SubLObject v_test_case_generator) {
        return classes.subloop_get_access_protected_instance_slot(v_test_case_generator, THREE_INTEGER, CATEGORIES);
    }

    public static final SubLObject set_test_case_generator_categories_alt(SubLObject v_test_case_generator, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_test_case_generator, value, THREE_INTEGER, CATEGORIES);
    }

    public static SubLObject set_test_case_generator_categories(final SubLObject v_test_case_generator, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_test_case_generator, value, THREE_INTEGER, CATEGORIES);
    }

    public static final SubLObject get_test_case_generator_system_alt(SubLObject v_test_case_generator) {
        return classes.subloop_get_access_protected_instance_slot(v_test_case_generator, TWO_INTEGER, SYSTEM);
    }

    public static SubLObject get_test_case_generator_system(final SubLObject v_test_case_generator) {
        return classes.subloop_get_access_protected_instance_slot(v_test_case_generator, TWO_INTEGER, SYSTEM);
    }

    public static final SubLObject set_test_case_generator_system_alt(SubLObject v_test_case_generator, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_test_case_generator, value, TWO_INTEGER, SYSTEM);
    }

    public static SubLObject set_test_case_generator_system(final SubLObject v_test_case_generator, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_test_case_generator, value, TWO_INTEGER, SYSTEM);
    }

    public static final SubLObject get_test_case_generator_module_alt(SubLObject v_test_case_generator) {
        return classes.subloop_get_access_protected_instance_slot(v_test_case_generator, ONE_INTEGER, MODULE);
    }

    public static SubLObject get_test_case_generator_module(final SubLObject v_test_case_generator) {
        return classes.subloop_get_access_protected_instance_slot(v_test_case_generator, ONE_INTEGER, MODULE);
    }

    public static final SubLObject set_test_case_generator_module_alt(SubLObject v_test_case_generator, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_test_case_generator, value, ONE_INTEGER, MODULE);
    }

    public static SubLObject set_test_case_generator_module(final SubLObject v_test_case_generator, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_test_case_generator, value, ONE_INTEGER, MODULE);
    }

    public static final SubLObject subloop_reserved_initialize_test_case_generator_class_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_test_case_generator_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_test_case_generator_instance_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE_GENERATOR, MODULE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE_GENERATOR, SYSTEM, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE_GENERATOR, CATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE_GENERATOR, DATUM, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE_GENERATOR, NAME, NIL);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_test_case_generator_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE_GENERATOR, MODULE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE_GENERATOR, SYSTEM, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE_GENERATOR, CATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE_GENERATOR, DATUM, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE_GENERATOR, NAME, NIL);
        return NIL;
    }

    public static final SubLObject test_case_generator_p_alt(SubLObject v_test_case_generator) {
        return classes.subloop_instanceof_class(v_test_case_generator, TEST_CASE_GENERATOR);
    }

    public static SubLObject test_case_generator_p(final SubLObject v_test_case_generator) {
        return classes.subloop_instanceof_class(v_test_case_generator, TEST_CASE_GENERATOR);
    }

    /**
     *
     *
     * @param MODULE0
     * 		stringp; the module of the test case
     * @param SYSTEM0
     * 		stringp; the system of the test case
     * @param DATUM0
     * 		objectp; the datum for which to generate the test case
     * @param CATEGORIES
     * 		listp; the categories the test case belongs to
     * @return test-case-generator; a new test case generator for MODULE0 in SYSTEM0 belonging
    to CATEGORIES0 and generating tests operating on DATA0
     */
    @LispMethod(comment = "@param MODULE0\r\n\t\tstringp; the module of the test case\r\n@param SYSTEM0\r\n\t\tstringp; the system of the test case\r\n@param DATUM0\r\n\t\tobjectp; the datum for which to generate the test case\r\n@param CATEGORIES\r\n\t\tlistp; the categories the test case belongs to\r\n@return test-case-generator; a new test case generator for MODULE0 in SYSTEM0 belonging\r\nto CATEGORIES0 and generating tests operating on DATA0")
    public static final SubLObject test_case_generator_new_method_alt(SubLObject self, SubLObject module0, SubLObject system0, SubLObject datum0, SubLObject categories0) {
        SubLTrampolineFile.checkType(categories0, LISTP);
        {
            SubLObject generator = object.new_class_instance(self);
            com.cyc.cycjava.cycl.test_case_generator.set_test_case_generator_module(generator, module0);
            com.cyc.cycjava.cycl.test_case_generator.set_test_case_generator_system(generator, system0);
            com.cyc.cycjava.cycl.test_case_generator.set_test_case_generator_datum(generator, datum0);
            com.cyc.cycjava.cycl.test_case_generator.set_test_case_generator_categories(generator, categories0);
            com.cyc.cycjava.cycl.test_case_generator.set_test_case_generator_name(generator, com.cyc.cycjava.cycl.test_case_generator.new_test_case_name());
            return generator;
        }
    }

    /**
     *
     *
     * @param MODULE0
     * 		stringp; the module of the test case
     * @param SYSTEM0
     * 		stringp; the system of the test case
     * @param DATUM0
     * 		objectp; the datum for which to generate the test case
     * @param CATEGORIES
     * 		listp; the categories the test case belongs to
     * @return test-case-generator; a new test case generator for MODULE0 in SYSTEM0 belonging
    to CATEGORIES0 and generating tests operating on DATA0
     */
    @LispMethod(comment = "@param MODULE0\r\n\t\tstringp; the module of the test case\r\n@param SYSTEM0\r\n\t\tstringp; the system of the test case\r\n@param DATUM0\r\n\t\tobjectp; the datum for which to generate the test case\r\n@param CATEGORIES\r\n\t\tlistp; the categories the test case belongs to\r\n@return test-case-generator; a new test case generator for MODULE0 in SYSTEM0 belonging\r\nto CATEGORIES0 and generating tests operating on DATA0")
    public static SubLObject test_case_generator_new_method(final SubLObject self, final SubLObject module0, final SubLObject system0, final SubLObject datum0, final SubLObject categories0) {
        assert NIL != listp(categories0) : "! listp(categories0) " + ("Types.listp(categories0) " + "CommonSymbols.NIL != Types.listp(categories0) ") + categories0;
        final SubLObject generator = object.new_class_instance(self);
        set_test_case_generator_module(generator, module0);
        set_test_case_generator_system(generator, system0);
        set_test_case_generator_datum(generator, datum0);
        set_test_case_generator_categories(generator, categories0);
        set_test_case_generator_name(generator, new_test_case_name());
        return generator;
    }

    /**
     *
     *
     * @return values; 1. a declaration of the test case and methods
    2. a definition of the test case and methods
     */
    @LispMethod(comment = "@return values; 1. a declaration of the test case and methods\r\n2. a definition of the test case and methods")
    public static final SubLObject test_case_generator_get_test_case_def_method_alt(SubLObject self) {
        {
            SubLObject method_definitions = methods.funcall_instance_method_with_0_args(self, GET_METHOD_DEFS);
            SubLObject method_declarations = methods.funcall_instance_method_with_1_args(self, GET_METHOD_DECLS, method_definitions);
            SubLObject test_case_declaration = methods.funcall_instance_method_with_1_args(self, GET_TEST_CASE_DECL, method_declarations);
            return values(test_case_declaration, cons(methods.funcall_instance_method_with_0_args(self, GET_SETUP_DEF), cons(methods.funcall_instance_method_with_0_args(self, GET_CLEANUP_DEF), method_definitions)));
        }
    }

    /**
     *
     *
     * @return values; 1. a declaration of the test case and methods
    2. a definition of the test case and methods
     */
    @LispMethod(comment = "@return values; 1. a declaration of the test case and methods\r\n2. a definition of the test case and methods")
    public static SubLObject test_case_generator_get_test_case_def_method(final SubLObject self) {
        final SubLObject method_definitions = methods.funcall_instance_method_with_0_args(self, GET_METHOD_DEFS);
        final SubLObject method_declarations = methods.funcall_instance_method_with_1_args(self, GET_METHOD_DECLS, method_definitions);
        final SubLObject test_case_declaration = methods.funcall_instance_method_with_1_args(self, GET_TEST_CASE_DECL, method_declarations);
        return values(test_case_declaration, cons(methods.funcall_instance_method_with_0_args(self, GET_SETUP_DEF), cons(methods.funcall_instance_method_with_0_args(self, GET_CLEANUP_DEF), method_definitions)));
    }

    /**
     *
     *
     * @return listp; a definition of a setup method
     */
    @LispMethod(comment = "@return listp; a definition of a setup method")
    public static final SubLObject test_case_generator_get_setup_def_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_test_case_generator_method = NIL;
            SubLObject name = com.cyc.cycjava.cycl.test_case_generator.get_test_case_generator_name(self);
            try {
                try {
                    sublisp_throw($sym40$OUTER_CATCH_FOR_TEST_CASE_GENERATOR_METHOD, listS(DEF_SETUP_METHOD, bq_cons(name, $list_alt38), $list_alt42));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.test_case_generator.set_test_case_generator_name(self, name);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_test_case_generator_method = Errors.handleThrowable(ccatch_env_var, $sym40$OUTER_CATCH_FOR_TEST_CASE_GENERATOR_METHOD);
            }
            return catch_var_for_test_case_generator_method;
        }
    }

    /**
     *
     *
     * @return listp; a definition of a setup method
     */
    @LispMethod(comment = "@return listp; a definition of a setup method")
    public static SubLObject test_case_generator_get_setup_def_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_test_case_generator_method = NIL;
        final SubLObject name = get_test_case_generator_name(self);
        try {
            thread.throwStack.push($sym40$OUTER_CATCH_FOR_TEST_CASE_GENERATOR_METHOD);
            try {
                sublisp_throw($sym40$OUTER_CATCH_FOR_TEST_CASE_GENERATOR_METHOD, listS(DEF_SETUP_METHOD, bq_cons(name, $list38), $list42));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_test_case_generator_name(self, name);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_test_case_generator_method = Errors.handleThrowable(ccatch_env_var, $sym40$OUTER_CATCH_FOR_TEST_CASE_GENERATOR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_test_case_generator_method;
    }

    /**
     *
     *
     * @return listp; a definition of a cleanup method
     */
    @LispMethod(comment = "@return listp; a definition of a cleanup method")
    public static final SubLObject test_case_generator_get_cleanup_def_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_test_case_generator_method = NIL;
            SubLObject name = com.cyc.cycjava.cycl.test_case_generator.get_test_case_generator_name(self);
            try {
                try {
                    sublisp_throw($sym45$OUTER_CATCH_FOR_TEST_CASE_GENERATOR_METHOD, listS(DEF_CLEANUP_METHOD, bq_cons(name, $list_alt38), $list_alt42));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.test_case_generator.set_test_case_generator_name(self, name);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_test_case_generator_method = Errors.handleThrowable(ccatch_env_var, $sym45$OUTER_CATCH_FOR_TEST_CASE_GENERATOR_METHOD);
            }
            return catch_var_for_test_case_generator_method;
        }
    }

    /**
     *
     *
     * @return listp; a definition of a cleanup method
     */
    @LispMethod(comment = "@return listp; a definition of a cleanup method")
    public static SubLObject test_case_generator_get_cleanup_def_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_test_case_generator_method = NIL;
        final SubLObject name = get_test_case_generator_name(self);
        try {
            thread.throwStack.push($sym45$OUTER_CATCH_FOR_TEST_CASE_GENERATOR_METHOD);
            try {
                sublisp_throw($sym45$OUTER_CATCH_FOR_TEST_CASE_GENERATOR_METHOD, listS(DEF_CLEANUP_METHOD, bq_cons(name, $list38), $list42));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_test_case_generator_name(self, name);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_test_case_generator_method = Errors.handleThrowable(ccatch_env_var, $sym45$OUTER_CATCH_FOR_TEST_CASE_GENERATOR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_test_case_generator_method;
    }

    /**
     *
     *
     * @return listp; a list of method declarations for each method in METHOD-DEFINITIONS
     */
    @LispMethod(comment = "@return listp; a list of method declarations for each method in METHOD-DEFINITIONS")
    public static final SubLObject test_case_generator_get_method_decls_method_alt(SubLObject self, SubLObject method_definitions) {
        {
            SubLObject declarations = NIL;
            SubLObject cdolist_list_var = method_definitions;
            SubLObject method_def = NIL;
            for (method_def = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , method_def = cdolist_list_var.first()) {
                {
                    SubLObject method_name = second(method_def).first();
                    declarations = cons(listS(DEF_INSTANCE_METHOD, method_name, $list_alt51), declarations);
                }
            }
            return nreverse(declarations);
        }
    }

    /**
     *
     *
     * @return listp; a list of method declarations for each method in METHOD-DEFINITIONS
     */
    @LispMethod(comment = "@return listp; a list of method declarations for each method in METHOD-DEFINITIONS")
    public static SubLObject test_case_generator_get_method_decls_method(final SubLObject self, final SubLObject method_definitions) {
        SubLObject declarations = NIL;
        SubLObject cdolist_list_var = method_definitions;
        SubLObject method_def = NIL;
        method_def = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject method_name = second(method_def).first();
            declarations = cons(listS(DEF_INSTANCE_METHOD, method_name, $list51), declarations);
            cdolist_list_var = cdolist_list_var.rest();
            method_def = cdolist_list_var.first();
        } 
        return nreverse(declarations);
    }

    /**
     *
     *
     * @return stringp; a comment string for the test case this generator generates
     */
    @LispMethod(comment = "@return stringp; a comment string for the test case this generator generates")
    public static final SubLObject test_case_generator_get_test_case_comment_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_test_case_generator_method = NIL;
            SubLObject datum = com.cyc.cycjava.cycl.test_case_generator.get_test_case_generator_datum(self);
            SubLObject categories = com.cyc.cycjava.cycl.test_case_generator.get_test_case_generator_categories(self);
            try {
                try {
                    sublisp_throw($sym54$OUTER_CATCH_FOR_TEST_CASE_GENERATOR_METHOD, format(NIL, $str_alt55$_________TEST___a_____CATEGORIES_, new SubLObject[]{ datum, categories, numeric_date_utilities.get_universal_date(UNPROVIDED, UNPROVIDED), system_info.cyc_revision_string(), kb_loaded(), operation_communication.remote_ops_processed(), Environment.get_user_name(UNPROVIDED) }));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.test_case_generator.set_test_case_generator_datum(self, datum);
                            com.cyc.cycjava.cycl.test_case_generator.set_test_case_generator_categories(self, categories);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_test_case_generator_method = Errors.handleThrowable(ccatch_env_var, $sym54$OUTER_CATCH_FOR_TEST_CASE_GENERATOR_METHOD);
            }
            return catch_var_for_test_case_generator_method;
        }
    }

    /**
     *
     *
     * @return stringp; a comment string for the test case this generator generates
     */
    @LispMethod(comment = "@return stringp; a comment string for the test case this generator generates")
    public static SubLObject test_case_generator_get_test_case_comment_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_test_case_generator_method = NIL;
        final SubLObject datum = get_test_case_generator_datum(self);
        final SubLObject categories = get_test_case_generator_categories(self);
        try {
            thread.throwStack.push($sym54$OUTER_CATCH_FOR_TEST_CASE_GENERATOR_METHOD);
            try {
                sublisp_throw($sym54$OUTER_CATCH_FOR_TEST_CASE_GENERATOR_METHOD, format(NIL, $str55$_________TEST___a_____CATEGORIES_, new SubLObject[]{ datum, categories, numeric_date_utilities.get_universal_date(UNPROVIDED, UNPROVIDED), system_info.cyc_revision_string(), kb_loaded(), operation_communication.remote_ops_processed(), Environment.get_user_name(UNPROVIDED) }));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_test_case_generator_datum(self, datum);
                    set_test_case_generator_categories(self, categories);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_test_case_generator_method = Errors.handleThrowable(ccatch_env_var, $sym54$OUTER_CATCH_FOR_TEST_CASE_GENERATOR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_test_case_generator_method;
    }

    public static final SubLObject get_cyclifier_test_case_generator_parse_expression_alt(SubLObject cyclifier_test_case_generator) {
        return classes.subloop_get_access_protected_instance_slot(cyclifier_test_case_generator, SIX_INTEGER, PARSE_EXPRESSION);
    }

    public static SubLObject get_cyclifier_test_case_generator_parse_expression(final SubLObject cyclifier_test_case_generator) {
        return classes.subloop_get_access_protected_instance_slot(cyclifier_test_case_generator, SIX_INTEGER, PARSE_EXPRESSION);
    }

    public static final SubLObject set_cyclifier_test_case_generator_parse_expression_alt(SubLObject cyclifier_test_case_generator, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyclifier_test_case_generator, value, SIX_INTEGER, PARSE_EXPRESSION);
    }

    public static SubLObject set_cyclifier_test_case_generator_parse_expression(final SubLObject cyclifier_test_case_generator, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyclifier_test_case_generator, value, SIX_INTEGER, PARSE_EXPRESSION);
    }

    public static final SubLObject subloop_reserved_initialize_cyclifier_test_case_generator_class_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_cyclifier_test_case_generator_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyclifier_test_case_generator_instance_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE_GENERATOR, MODULE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE_GENERATOR, SYSTEM, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE_GENERATOR, CATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE_GENERATOR, DATUM, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE_GENERATOR, NAME, NIL);
        classes.subloop_initialize_slot(new_instance, CYCLIFIER_TEST_CASE_GENERATOR, PARSE_EXPRESSION, NIL);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_cyclifier_test_case_generator_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE_GENERATOR, MODULE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE_GENERATOR, SYSTEM, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE_GENERATOR, CATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE_GENERATOR, DATUM, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE_GENERATOR, NAME, NIL);
        classes.subloop_initialize_slot(new_instance, CYCLIFIER_TEST_CASE_GENERATOR, PARSE_EXPRESSION, NIL);
        return NIL;
    }

    public static final SubLObject cyclifier_test_case_generator_p_alt(SubLObject cyclifier_test_case_generator) {
        return classes.subloop_instanceof_class(cyclifier_test_case_generator, CYCLIFIER_TEST_CASE_GENERATOR);
    }

    public static SubLObject cyclifier_test_case_generator_p(final SubLObject cyclifier_test_case_generator) {
        return classes.subloop_instanceof_class(cyclifier_test_case_generator, CYCLIFIER_TEST_CASE_GENERATOR);
    }

    /**
     *
     *
     * @param MODULE0
     * 		stringp; the module of the test case
     * @param SYSTEM0
     * 		stringp; the system of the test case
     * @param DATUM0
     * 		objectp; the datum for which to generate the test case
     * @param CATEGORIES
     * 		listp; the categories the test case belongs to
     * @return test-case-generator; a new test case generator for MODULE0 in SYSTEM0 belonging
    to CATEGORIES0 and generating tests operating on DATA0
     */
    @LispMethod(comment = "@param MODULE0\r\n\t\tstringp; the module of the test case\r\n@param SYSTEM0\r\n\t\tstringp; the system of the test case\r\n@param DATUM0\r\n\t\tobjectp; the datum for which to generate the test case\r\n@param CATEGORIES\r\n\t\tlistp; the categories the test case belongs to\r\n@return test-case-generator; a new test case generator for MODULE0 in SYSTEM0 belonging\r\nto CATEGORIES0 and generating tests operating on DATA0")
    public static final SubLObject cyclifier_test_case_generator_new_method_alt(SubLObject self, SubLObject module0, SubLObject system0, SubLObject datum0, SubLObject categories0) {
        {
            SubLObject generator = methods.funcall_class_super_method_with_4_args(self, NEW, module0, system0, datum0, categories0);
            com.cyc.cycjava.cycl.test_case_generator.set_cyclifier_test_case_generator_parse_expression(generator, second(parser.charniak_parse(datum0, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED).first()));
            return generator;
        }
    }

    /**
     *
     *
     * @param MODULE0
     * 		stringp; the module of the test case
     * @param SYSTEM0
     * 		stringp; the system of the test case
     * @param DATUM0
     * 		objectp; the datum for which to generate the test case
     * @param CATEGORIES
     * 		listp; the categories the test case belongs to
     * @return test-case-generator; a new test case generator for MODULE0 in SYSTEM0 belonging
    to CATEGORIES0 and generating tests operating on DATA0
     */
    @LispMethod(comment = "@param MODULE0\r\n\t\tstringp; the module of the test case\r\n@param SYSTEM0\r\n\t\tstringp; the system of the test case\r\n@param DATUM0\r\n\t\tobjectp; the datum for which to generate the test case\r\n@param CATEGORIES\r\n\t\tlistp; the categories the test case belongs to\r\n@return test-case-generator; a new test case generator for MODULE0 in SYSTEM0 belonging\r\nto CATEGORIES0 and generating tests operating on DATA0")
    public static SubLObject cyclifier_test_case_generator_new_method(final SubLObject self, final SubLObject module0, final SubLObject system0, final SubLObject datum0, final SubLObject categories0) {
        final SubLObject generator = methods.funcall_class_super_method_with_4_args(self, NEW, module0, system0, datum0, categories0);
        set_cyclifier_test_case_generator_parse_expression(generator, second(parser.charniak_parse(datum0, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED).first()));
        return generator;
    }

    /**
     *
     *
     * @return values; 1. a declaration of the test case and methods
    2. a definition of the test case and methods
     */
    @LispMethod(comment = "@return values; 1. a declaration of the test case and methods\r\n2. a definition of the test case and methods")
    public static final SubLObject cyclifier_test_case_generator_get_test_case_decl_method_alt(SubLObject self, SubLObject method_declarations) {
        {
            SubLObject catch_var_for_cyclifier_test_case_generator_method = NIL;
            SubLObject parse_expression = com.cyc.cycjava.cycl.test_case_generator.get_cyclifier_test_case_generator_parse_expression(self);
            SubLObject name = com.cyc.cycjava.cycl.test_case_generator.get_test_case_generator_name(self);
            SubLObject categories = com.cyc.cycjava.cycl.test_case_generator.get_test_case_generator_categories(self);
            SubLObject system = com.cyc.cycjava.cycl.test_case_generator.get_test_case_generator_system(self);
            SubLObject module = com.cyc.cycjava.cycl.test_case_generator.get_test_case_generator_module(self);
            try {
                try {
                    sublisp_throw($sym66$OUTER_CATCH_FOR_CYCLIFIER_TEST_CASE_GENERATOR_METHOD, listS(DEFINE_TEST_CASE, list(name, module, system, $CATEGORIES, list(QUOTE, categories)), list(PARSE_TREE, $INSTANCE, $PRIVATE, $VALUE, list(NEW_PARSE_TREE, list(QUOTE, parse_expression))), $list_alt75, $list_alt76, append(method_declarations, NIL)));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.test_case_generator.set_cyclifier_test_case_generator_parse_expression(self, parse_expression);
                            com.cyc.cycjava.cycl.test_case_generator.set_test_case_generator_name(self, name);
                            com.cyc.cycjava.cycl.test_case_generator.set_test_case_generator_categories(self, categories);
                            com.cyc.cycjava.cycl.test_case_generator.set_test_case_generator_system(self, system);
                            com.cyc.cycjava.cycl.test_case_generator.set_test_case_generator_module(self, module);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyclifier_test_case_generator_method = Errors.handleThrowable(ccatch_env_var, $sym66$OUTER_CATCH_FOR_CYCLIFIER_TEST_CASE_GENERATOR_METHOD);
            }
            return catch_var_for_cyclifier_test_case_generator_method;
        }
    }

    /**
     *
     *
     * @return values; 1. a declaration of the test case and methods
    2. a definition of the test case and methods
     */
    @LispMethod(comment = "@return values; 1. a declaration of the test case and methods\r\n2. a definition of the test case and methods")
    public static SubLObject cyclifier_test_case_generator_get_test_case_decl_method(final SubLObject self, final SubLObject method_declarations) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cyclifier_test_case_generator_method = NIL;
        final SubLObject parse_expression = get_cyclifier_test_case_generator_parse_expression(self);
        final SubLObject name = get_test_case_generator_name(self);
        final SubLObject categories = get_test_case_generator_categories(self);
        final SubLObject system = get_test_case_generator_system(self);
        final SubLObject module = get_test_case_generator_module(self);
        try {
            thread.throwStack.push($sym66$OUTER_CATCH_FOR_CYCLIFIER_TEST_CASE_GENERATOR_METHOD);
            try {
                sublisp_throw($sym66$OUTER_CATCH_FOR_CYCLIFIER_TEST_CASE_GENERATOR_METHOD, listS(DEFINE_TEST_CASE, list(name, module, system, $CATEGORIES, list(QUOTE, categories)), list(PARSE_TREE, $INSTANCE, $PRIVATE, $VALUE, list(NEW_PARSE_TREE, list(QUOTE, parse_expression))), $list75, $list76, append(method_declarations, NIL)));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_cyclifier_test_case_generator_parse_expression(self, parse_expression);
                    set_test_case_generator_name(self, name);
                    set_test_case_generator_categories(self, categories);
                    set_test_case_generator_system(self, system);
                    set_test_case_generator_module(self, module);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_cyclifier_test_case_generator_method = Errors.handleThrowable(ccatch_env_var, $sym66$OUTER_CATCH_FOR_CYCLIFIER_TEST_CASE_GENERATOR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_cyclifier_test_case_generator_method;
    }

    /**
     *
     *
     * @return listp; a list of definitions of all test methods
     */
    @LispMethod(comment = "@return listp; a list of definitions of all test methods")
    public static final SubLObject cyclifier_test_case_generator_get_method_defs_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_cyclifier_test_case_generator_method = NIL;
            SubLObject parse_expression = com.cyc.cycjava.cycl.test_case_generator.get_cyclifier_test_case_generator_parse_expression(self);
            SubLObject name = com.cyc.cycjava.cycl.test_case_generator.get_test_case_generator_name(self);
            SubLObject datum = com.cyc.cycjava.cycl.test_case_generator.get_test_case_generator_datum(self);
            try {
                try {
                    {
                        SubLObject method_name = intern($str_alt80$TEST_1, UNPROVIDED);
                        SubLObject cycls = methods.funcall_instance_method_with_0_args(parse_tree.new_parse_tree(parse_expression, UNPROVIDED, UNPROVIDED), CYCLIFY);
                        SubLObject method_body = listS(FAIL_UNLESS_EQUAL, SELF, list(QUOTE, cycls), $list_alt84, cconcatenate($str_alt85$_cyclify__, new SubLObject[]{ datum, $str_alt86$_______, princ_to_string(cycls) }), $list_alt87);
                        sublisp_throw($sym79$OUTER_CATCH_FOR_CYCLIFIER_TEST_CASE_GENERATOR_METHOD, list(list(DEF_TEST_METHOD, listS(method_name, name, $list_alt38), NIL, method_body)));
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.test_case_generator.set_cyclifier_test_case_generator_parse_expression(self, parse_expression);
                            com.cyc.cycjava.cycl.test_case_generator.set_test_case_generator_name(self, name);
                            com.cyc.cycjava.cycl.test_case_generator.set_test_case_generator_datum(self, datum);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyclifier_test_case_generator_method = Errors.handleThrowable(ccatch_env_var, $sym79$OUTER_CATCH_FOR_CYCLIFIER_TEST_CASE_GENERATOR_METHOD);
            }
            return catch_var_for_cyclifier_test_case_generator_method;
        }
    }

    /**
     *
     *
     * @return listp; a list of definitions of all test methods
     */
    @LispMethod(comment = "@return listp; a list of definitions of all test methods")
    public static SubLObject cyclifier_test_case_generator_get_method_defs_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cyclifier_test_case_generator_method = NIL;
        final SubLObject parse_expression = get_cyclifier_test_case_generator_parse_expression(self);
        final SubLObject name = get_test_case_generator_name(self);
        final SubLObject datum = get_test_case_generator_datum(self);
        try {
            thread.throwStack.push($sym79$OUTER_CATCH_FOR_CYCLIFIER_TEST_CASE_GENERATOR_METHOD);
            try {
                final SubLObject method_name = intern($str80$TEST_1, UNPROVIDED);
                final SubLObject cycls = methods.funcall_instance_method_with_0_args(parse_tree.new_parse_tree(parse_expression, UNPROVIDED, UNPROVIDED), CYCLIFY);
                final SubLObject method_body = listS(FAIL_UNLESS_EQUAL, SELF, list(QUOTE, cycls), $list84, cconcatenate($str85$_cyclify__, new SubLObject[]{ datum, $str86$_______, princ_to_string(cycls) }), $list87);
                sublisp_throw($sym79$OUTER_CATCH_FOR_CYCLIFIER_TEST_CASE_GENERATOR_METHOD, list(list(DEF_TEST_METHOD, listS(method_name, name, $list38), NIL, method_body)));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_cyclifier_test_case_generator_parse_expression(self, parse_expression);
                    set_test_case_generator_name(self, name);
                    set_test_case_generator_datum(self, datum);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_cyclifier_test_case_generator_method = Errors.handleThrowable(ccatch_env_var, $sym79$OUTER_CATCH_FOR_CYCLIFIER_TEST_CASE_GENERATOR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_cyclifier_test_case_generator_method;
    }

    public static final SubLObject get_parse_tree_syntax_test_case_generator_parse_expression_alt(SubLObject parse_tree_syntax_test_case_generator) {
        return classes.subloop_get_access_protected_instance_slot(parse_tree_syntax_test_case_generator, SIX_INTEGER, PARSE_EXPRESSION);
    }

    public static SubLObject get_parse_tree_syntax_test_case_generator_parse_expression(final SubLObject parse_tree_syntax_test_case_generator) {
        return classes.subloop_get_access_protected_instance_slot(parse_tree_syntax_test_case_generator, SIX_INTEGER, PARSE_EXPRESSION);
    }

    public static final SubLObject set_parse_tree_syntax_test_case_generator_parse_expression_alt(SubLObject parse_tree_syntax_test_case_generator, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(parse_tree_syntax_test_case_generator, value, SIX_INTEGER, PARSE_EXPRESSION);
    }

    public static SubLObject set_parse_tree_syntax_test_case_generator_parse_expression(final SubLObject parse_tree_syntax_test_case_generator, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(parse_tree_syntax_test_case_generator, value, SIX_INTEGER, PARSE_EXPRESSION);
    }

    public static final SubLObject subloop_reserved_initialize_parse_tree_syntax_test_case_generator_class_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_parse_tree_syntax_test_case_generator_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_parse_tree_syntax_test_case_generator_instance_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE_GENERATOR, MODULE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE_GENERATOR, SYSTEM, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE_GENERATOR, CATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE_GENERATOR, DATUM, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE_GENERATOR, NAME, NIL);
        classes.subloop_initialize_slot(new_instance, PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR, PARSE_EXPRESSION, NIL);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_parse_tree_syntax_test_case_generator_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE_GENERATOR, MODULE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE_GENERATOR, SYSTEM, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE_GENERATOR, CATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE_GENERATOR, DATUM, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE_GENERATOR, NAME, NIL);
        classes.subloop_initialize_slot(new_instance, PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR, PARSE_EXPRESSION, NIL);
        return NIL;
    }

    public static final SubLObject parse_tree_syntax_test_case_generator_p_alt(SubLObject parse_tree_syntax_test_case_generator) {
        return classes.subloop_instanceof_class(parse_tree_syntax_test_case_generator, PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR);
    }

    public static SubLObject parse_tree_syntax_test_case_generator_p(final SubLObject parse_tree_syntax_test_case_generator) {
        return classes.subloop_instanceof_class(parse_tree_syntax_test_case_generator, PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR);
    }

    /**
     *
     *
     * @param MODULE0
     * 		stringp; the module of the test case
     * @param SYSTEM0
     * 		stringp; the system of the test case
     * @param DATUM0
     * 		objectp; the datum for which to generate the test case
     * @param CATEGORIES
     * 		listp; the categories the test case belongs to
     * @return test-case-generator; a new test case generator for MODULE0 in SYSTEM0 belonging
    to CATEGORIES0 and generating tests operating on DATA0
     */
    @LispMethod(comment = "@param MODULE0\r\n\t\tstringp; the module of the test case\r\n@param SYSTEM0\r\n\t\tstringp; the system of the test case\r\n@param DATUM0\r\n\t\tobjectp; the datum for which to generate the test case\r\n@param CATEGORIES\r\n\t\tlistp; the categories the test case belongs to\r\n@return test-case-generator; a new test case generator for MODULE0 in SYSTEM0 belonging\r\nto CATEGORIES0 and generating tests operating on DATA0")
    public static final SubLObject parse_tree_syntax_test_case_generator_new_method_alt(SubLObject self, SubLObject module0, SubLObject system0, SubLObject datum0, SubLObject categories0) {
        {
            SubLObject generator = methods.funcall_class_super_method_with_4_args(self, NEW, module0, system0, datum0, categories0);
            com.cyc.cycjava.cycl.test_case_generator.set_cyclifier_test_case_generator_parse_expression(generator, second(parser.charniak_parse(datum0, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED).first()));
            return generator;
        }
    }

    /**
     *
     *
     * @param MODULE0
     * 		stringp; the module of the test case
     * @param SYSTEM0
     * 		stringp; the system of the test case
     * @param DATUM0
     * 		objectp; the datum for which to generate the test case
     * @param CATEGORIES
     * 		listp; the categories the test case belongs to
     * @return test-case-generator; a new test case generator for MODULE0 in SYSTEM0 belonging
    to CATEGORIES0 and generating tests operating on DATA0
     */
    @LispMethod(comment = "@param MODULE0\r\n\t\tstringp; the module of the test case\r\n@param SYSTEM0\r\n\t\tstringp; the system of the test case\r\n@param DATUM0\r\n\t\tobjectp; the datum for which to generate the test case\r\n@param CATEGORIES\r\n\t\tlistp; the categories the test case belongs to\r\n@return test-case-generator; a new test case generator for MODULE0 in SYSTEM0 belonging\r\nto CATEGORIES0 and generating tests operating on DATA0")
    public static SubLObject parse_tree_syntax_test_case_generator_new_method(final SubLObject self, final SubLObject module0, final SubLObject system0, final SubLObject datum0, final SubLObject categories0) {
        final SubLObject generator = methods.funcall_class_super_method_with_4_args(self, NEW, module0, system0, datum0, categories0);
        set_cyclifier_test_case_generator_parse_expression(generator, second(parser.charniak_parse(datum0, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED).first()));
        return generator;
    }

    /**
     *
     *
     * @return values; 1. a declaration of the test case and methods
    2. a definition of the test case and methods
     */
    @LispMethod(comment = "@return values; 1. a declaration of the test case and methods\r\n2. a definition of the test case and methods")
    public static final SubLObject parse_tree_syntax_test_case_generator_get_test_case_decl_method_alt(SubLObject self, SubLObject method_declarations) {
        {
            SubLObject catch_var_for_parse_tree_syntax_test_case_generator_method = NIL;
            SubLObject parse_expression = com.cyc.cycjava.cycl.test_case_generator.get_parse_tree_syntax_test_case_generator_parse_expression(self);
            SubLObject name = com.cyc.cycjava.cycl.test_case_generator.get_test_case_generator_name(self);
            SubLObject categories = com.cyc.cycjava.cycl.test_case_generator.get_test_case_generator_categories(self);
            SubLObject system = com.cyc.cycjava.cycl.test_case_generator.get_test_case_generator_system(self);
            SubLObject module = com.cyc.cycjava.cycl.test_case_generator.get_test_case_generator_module(self);
            try {
                try {
                    sublisp_throw($sym95$OUTER_CATCH_FOR_PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR_METHOD, listS(DEFINE_TEST_CASE, list(name, module, system, $CATEGORIES, list(QUOTE, categories)), list(PARSE_TREE, $CLASS, $PRIVATE, $VALUE, list(PROCESS_MODIFIERS, list(NEW_PARSE_TREE, list(QUOTE, parse_expression)))), $list_alt75, $list_alt76, append(method_declarations, NIL)));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.test_case_generator.set_parse_tree_syntax_test_case_generator_parse_expression(self, parse_expression);
                            com.cyc.cycjava.cycl.test_case_generator.set_test_case_generator_name(self, name);
                            com.cyc.cycjava.cycl.test_case_generator.set_test_case_generator_categories(self, categories);
                            com.cyc.cycjava.cycl.test_case_generator.set_test_case_generator_system(self, system);
                            com.cyc.cycjava.cycl.test_case_generator.set_test_case_generator_module(self, module);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_parse_tree_syntax_test_case_generator_method = Errors.handleThrowable(ccatch_env_var, $sym95$OUTER_CATCH_FOR_PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR_METHOD);
            }
            return catch_var_for_parse_tree_syntax_test_case_generator_method;
        }
    }

    /**
     *
     *
     * @return values; 1. a declaration of the test case and methods
    2. a definition of the test case and methods
     */
    @LispMethod(comment = "@return values; 1. a declaration of the test case and methods\r\n2. a definition of the test case and methods")
    public static SubLObject parse_tree_syntax_test_case_generator_get_test_case_decl_method(final SubLObject self, final SubLObject method_declarations) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_parse_tree_syntax_test_case_generator_method = NIL;
        final SubLObject parse_expression = get_parse_tree_syntax_test_case_generator_parse_expression(self);
        final SubLObject name = get_test_case_generator_name(self);
        final SubLObject categories = get_test_case_generator_categories(self);
        final SubLObject system = get_test_case_generator_system(self);
        final SubLObject module = get_test_case_generator_module(self);
        try {
            thread.throwStack.push($sym95$OUTER_CATCH_FOR_PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR_METHOD);
            try {
                sublisp_throw($sym95$OUTER_CATCH_FOR_PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR_METHOD, listS(DEFINE_TEST_CASE, list(name, module, system, $CATEGORIES, list(QUOTE, categories)), list(PARSE_TREE, $CLASS, $PRIVATE, $VALUE, list(PROCESS_MODIFIERS, list(NEW_PARSE_TREE, list(QUOTE, parse_expression)))), $list75, $list76, append(method_declarations, NIL)));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_parse_tree_syntax_test_case_generator_parse_expression(self, parse_expression);
                    set_test_case_generator_name(self, name);
                    set_test_case_generator_categories(self, categories);
                    set_test_case_generator_system(self, system);
                    set_test_case_generator_module(self, module);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_parse_tree_syntax_test_case_generator_method = Errors.handleThrowable(ccatch_env_var, $sym95$OUTER_CATCH_FOR_PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_parse_tree_syntax_test_case_generator_method;
    }

    /**
     *
     *
     * @return listp; a list of definitions of all test methods
     */
    @LispMethod(comment = "@return listp; a list of definitions of all test methods")
    public static final SubLObject parse_tree_syntax_test_case_generator_get_method_defs_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_parse_tree_syntax_test_case_generator_method = NIL;
            SubLObject parse_expression = com.cyc.cycjava.cycl.test_case_generator.get_parse_tree_syntax_test_case_generator_parse_expression(self);
            SubLObject name = com.cyc.cycjava.cycl.test_case_generator.get_test_case_generator_name(self);
            try {
                try {
                    {
                        SubLObject v_parse_tree = parse_tree.process_modifiers(parse_tree.new_parse_tree(parse_expression, UNPROVIDED, UNPROVIDED));
                        SubLObject test_data = com.cyc.cycjava.cycl.test_case_generator.get_parse_tree_test_data_recursively(v_parse_tree, $list_alt101);
                        SubLObject i = ZERO_INTEGER;
                        SubLObject method_definitions = NIL;
                        SubLObject cdolist_list_var = test_data;
                        SubLObject test_datum = NIL;
                        for (test_datum = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , test_datum = cdolist_list_var.first()) {
                            i = add(i, ONE_INTEGER);
                            {
                                SubLObject method_name = intern(cconcatenate($str_alt102$TEST_, princ_to_string(i)), UNPROVIDED);
                                SubLObject method_body = com.cyc.cycjava.cycl.test_case_generator.new_fail_unless_call(test_datum, v_parse_tree);
                                method_definitions = cons(list(DEF_TEST_METHOD, listS(method_name, name, $list_alt38), NIL, method_body), method_definitions);
                            }
                        }
                        sublisp_throw($sym100$OUTER_CATCH_FOR_PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR_METHOD, nreverse(method_definitions));
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.test_case_generator.set_parse_tree_syntax_test_case_generator_parse_expression(self, parse_expression);
                            com.cyc.cycjava.cycl.test_case_generator.set_test_case_generator_name(self, name);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_parse_tree_syntax_test_case_generator_method = Errors.handleThrowable(ccatch_env_var, $sym100$OUTER_CATCH_FOR_PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR_METHOD);
            }
            return catch_var_for_parse_tree_syntax_test_case_generator_method;
        }
    }

    /**
     *
     *
     * @return listp; a list of definitions of all test methods
     */
    @LispMethod(comment = "@return listp; a list of definitions of all test methods")
    public static SubLObject parse_tree_syntax_test_case_generator_get_method_defs_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_parse_tree_syntax_test_case_generator_method = NIL;
        final SubLObject parse_expression = get_parse_tree_syntax_test_case_generator_parse_expression(self);
        final SubLObject name = get_test_case_generator_name(self);
        try {
            thread.throwStack.push($sym100$OUTER_CATCH_FOR_PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR_METHOD);
            try {
                final SubLObject v_parse_tree = parse_tree.process_modifiers(parse_tree.new_parse_tree(parse_expression, UNPROVIDED, UNPROVIDED));
                final SubLObject test_data = get_parse_tree_test_data_recursively(v_parse_tree, $list101);
                SubLObject i = ZERO_INTEGER;
                SubLObject method_definitions = NIL;
                SubLObject cdolist_list_var = test_data;
                SubLObject test_datum = NIL;
                test_datum = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    i = add(i, ONE_INTEGER);
                    final SubLObject method_name = intern(cconcatenate($str102$TEST_, princ_to_string(i)), UNPROVIDED);
                    final SubLObject method_body = new_fail_unless_call(test_datum, v_parse_tree);
                    method_definitions = cons(list(DEF_TEST_METHOD, listS(method_name, name, $list38), NIL, method_body), method_definitions);
                    cdolist_list_var = cdolist_list_var.rest();
                    test_datum = cdolist_list_var.first();
                } 
                sublisp_throw($sym100$OUTER_CATCH_FOR_PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR_METHOD, nreverse(method_definitions));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_parse_tree_syntax_test_case_generator_parse_expression(self, parse_expression);
                    set_test_case_generator_name(self, name);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_parse_tree_syntax_test_case_generator_method = Errors.handleThrowable(ccatch_env_var, $sym100$OUTER_CATCH_FOR_PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_parse_tree_syntax_test_case_generator_method;
    }

    /**
     *
     *
     * @return listp; a (fail-unless ...) call for TEST-DATUM and PARSE-TREE
     */
    @LispMethod(comment = "@return listp; a (fail-unless ...) call for TEST-DATUM and PARSE-TREE")
    public static final SubLObject new_fail_unless_call_alt(SubLObject test_datum, SubLObject v_parse_tree) {
        {
            SubLObject tree_path = test_datum.first();
            SubLObject method_call = second(test_datum);
            SubLObject method_name = method_call.first();
            SubLObject method_args = method_call.rest();
            SubLObject result_paths = third(test_datum);
            SubLObject result_calls = NIL;
            SubLObject result = NIL;
            if (NIL == result_paths) {
                result = NIL;
            } else {
                if (NIL != find_if(LISTP, result_paths, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    {
                        SubLObject cdolist_list_var = result_paths;
                        SubLObject result_path = NIL;
                        for (result_path = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , result_path = cdolist_list_var.first()) {
                            result_calls = cons(list(FIM, PARSE_TREE, $list_alt105, list(QUOTE, result_path)), result_calls);
                        }
                        result = nreverse(result_calls);
                        result = cons(LIST, result);
                    }
                } else {
                    result = list(FIM, PARSE_TREE, $list_alt105, list(QUOTE, result_paths));
                }
            }
            return listS(FAIL_UNLESS_EQUAL, SELF, listS(FIM, list(FIM, PARSE_TREE, $list_alt105, list(QUOTE, tree_path)), list(QUOTE, method_name), append(method_args, NIL)), result, com.cyc.cycjava.cycl.test_case_generator.new_syntax_test_failure_explanation(tree_path, method_call, result_paths, v_parse_tree), $list_alt107);
        }
    }

    /**
     *
     *
     * @return listp; a (fail-unless ...) call for TEST-DATUM and PARSE-TREE
     */
    @LispMethod(comment = "@return listp; a (fail-unless ...) call for TEST-DATUM and PARSE-TREE")
    public static SubLObject new_fail_unless_call(final SubLObject test_datum, final SubLObject v_parse_tree) {
        final SubLObject tree_path = test_datum.first();
        final SubLObject method_call = second(test_datum);
        final SubLObject method_name = method_call.first();
        final SubLObject method_args = method_call.rest();
        final SubLObject result_paths = third(test_datum);
        SubLObject result_calls = NIL;
        SubLObject result = NIL;
        if (NIL == result_paths) {
            result = NIL;
        } else
            if (NIL != find_if(LISTP, result_paths, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                SubLObject cdolist_list_var = result_paths;
                SubLObject result_path = NIL;
                result_path = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    result_calls = cons(list(FIM, PARSE_TREE, $list105, list(QUOTE, result_path)), result_calls);
                    cdolist_list_var = cdolist_list_var.rest();
                    result_path = cdolist_list_var.first();
                } 
                result = nreverse(result_calls);
                result = cons(LIST, result);
            } else {
                result = list(FIM, PARSE_TREE, $list105, list(QUOTE, result_paths));
            }

        return listS(FAIL_UNLESS_EQUAL, SELF, listS(FIM, list(FIM, PARSE_TREE, $list105, list(QUOTE, tree_path)), list(QUOTE, method_name), append(method_args, NIL)), result, new_syntax_test_failure_explanation(tree_path, method_call, result_paths, v_parse_tree), $list107);
    }

    /**
     *
     *
     * @return stringp; an explanation that the test of calling METHOD-CALL on PARSE-TREE's
    path TREE-PATH did not return RESULT-PATHS
     */
    @LispMethod(comment = "@return stringp; an explanation that the test of calling METHOD-CALL on PARSE-TREE\'s\r\npath TREE-PATH did not return RESULT-PATHS")
    public static final SubLObject new_syntax_test_failure_explanation_alt(SubLObject tree_path, SubLObject method_call, SubLObject result_paths, SubLObject v_parse_tree) {
        {
            SubLObject tree = methods.funcall_instance_method_with_1_args(v_parse_tree, GET_DESCENDANT, tree_path);
            SubLObject method_name = method_call.first();
            SubLObject args = method_call.rest();
            SubLObject results = classes_utilities.apply_instance_method(tree, method_call.first(), method_call.rest());
            SubLObject result_strings = NIL;
            SubLObject result_string = NIL;
            SubLObject explanation = cconcatenate($str_alt109$_, princ_to_string(method_name));
            {
                SubLObject cdolist_list_var = args;
                SubLObject arg = NIL;
                for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                    explanation = cconcatenate(explanation, new SubLObject[]{ $str_alt110$_, princ_to_string(arg) });
                }
            }
            explanation = cconcatenate(explanation, new SubLObject[]{ $str_alt111$__, princ_to_string(methods.funcall_instance_method_with_0_args(tree, GET_CATEGORY)), $str_alt110$_, methods.funcall_instance_method_with_0_args(tree, GET_STRING), $str_alt114$_ });
            if (NIL != list_utilities.non_empty_list_p(results)) {
                {
                    SubLObject cdolist_list_var = results;
                    SubLObject result = NIL;
                    for (result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , result = cdolist_list_var.first()) {
                        result_strings = cons(cconcatenate($str_alt109$_, new SubLObject[]{ princ_to_string(methods.funcall_instance_method_with_0_args(result, GET_CATEGORY)), $str_alt110$_, methods.funcall_instance_method_with_0_args(result, GET_STRING), $str_alt114$_ }), result_strings);
                    }
                    result_string = string_utilities.bunge(nreverse(result_strings), UNPROVIDED);
                }
            } else {
                if (NIL != parse_tree.parse_tree_p(results)) {
                    result_string = cconcatenate($str_alt109$_, new SubLObject[]{ princ_to_string(methods.funcall_instance_method_with_0_args(results, GET_CATEGORY)), $str_alt110$_, methods.funcall_instance_method_with_0_args(results, GET_STRING), $str_alt114$_ });
                } else {
                    result_string = princ_to_string(results);
                }
            }
            explanation = cconcatenate(explanation, new SubLObject[]{ $str_alt115$______, result_string, $str_alt116$_ });
            return explanation;
        }
    }

    /**
     *
     *
     * @return stringp; an explanation that the test of calling METHOD-CALL on PARSE-TREE's
    path TREE-PATH did not return RESULT-PATHS
     */
    @LispMethod(comment = "@return stringp; an explanation that the test of calling METHOD-CALL on PARSE-TREE\'s\r\npath TREE-PATH did not return RESULT-PATHS")
    public static SubLObject new_syntax_test_failure_explanation(final SubLObject tree_path, final SubLObject method_call, final SubLObject result_paths, final SubLObject v_parse_tree) {
        final SubLObject tree = methods.funcall_instance_method_with_1_args(v_parse_tree, GET_DESCENDANT, tree_path);
        final SubLObject method_name = method_call.first();
        final SubLObject args = method_call.rest();
        final SubLObject results = classes_utilities.apply_instance_method(tree, method_call.first(), method_call.rest());
        SubLObject result_strings = NIL;
        SubLObject result_string = NIL;
        SubLObject explanation = cconcatenate($str109$_, princ_to_string(method_name));
        SubLObject cdolist_list_var = args;
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            explanation = cconcatenate(explanation, new SubLObject[]{ $$$_, princ_to_string(arg) });
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        explanation = cconcatenate(explanation, new SubLObject[]{ $str111$__, princ_to_string(methods.funcall_instance_method_with_0_args(tree, GET_CATEGORY)), $$$_, methods.funcall_instance_method_with_0_args(tree, GET_STRING), $str114$_ });
        if (NIL != list_utilities.non_empty_list_p(results)) {
            cdolist_list_var = results;
            SubLObject result = NIL;
            result = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                result_strings = cons(cconcatenate($str109$_, new SubLObject[]{ princ_to_string(methods.funcall_instance_method_with_0_args(result, GET_CATEGORY)), $$$_, methods.funcall_instance_method_with_0_args(result, GET_STRING), $str114$_ }), result_strings);
                cdolist_list_var = cdolist_list_var.rest();
                result = cdolist_list_var.first();
            } 
            result_string = string_utilities.bunge(nreverse(result_strings), UNPROVIDED);
        } else
            if (NIL != parse_tree.parse_tree_p(results)) {
                result_string = cconcatenate($str109$_, new SubLObject[]{ princ_to_string(methods.funcall_instance_method_with_0_args(results, GET_CATEGORY)), $$$_, methods.funcall_instance_method_with_0_args(results, GET_STRING), $str114$_ });
            } else {
                result_string = princ_to_string(results);
            }

        explanation = cconcatenate(explanation, new SubLObject[]{ $str115$______, result_string, $str116$_ });
        return explanation;
    }

    /**
     *
     *
     * @return symbolp; a newly generated test case name
     */
    @LispMethod(comment = "@return symbolp; a newly generated test case name")
    public static final SubLObject new_test_case_name_alt() {
        return intern(cconcatenate($str_alt117$TEST_CASE_, princ_to_string(get_internal_real_time())), UNPROVIDED);
    }

    /**
     *
     *
     * @return symbolp; a newly generated test case name
     */
    @LispMethod(comment = "@return symbolp; a newly generated test case name")
    public static SubLObject new_test_case_name() {
        return intern(cconcatenate($str117$TEST_CASE_, princ_to_string(get_internal_real_time())), UNPROVIDED);
    }

    /**
     *
     *
     * @param PARSE-TREE
     * 		parse-tree-p; a parse tree for which to generate test data
     * @param METHODO-CALLS
     * 		listp; a list of methods that make up the tests
     * @return listp; a list of test data; each element of that list is a list
    with three elements: (i) the path of PARSE-TREE, (ii) a method-argument call,
    and (iii) the result of the method call, as either a single path or a list of
    paths.
     */
    @LispMethod(comment = "@param PARSE-TREE\r\n\t\tparse-tree-p; a parse tree for which to generate test data\r\n@param METHODO-CALLS\r\n\t\tlistp; a list of methods that make up the tests\r\n@return listp; a list of test data; each element of that list is a list\r\nwith three elements: (i) the path of PARSE-TREE, (ii) a method-argument call,\r\nand (iii) the result of the method call, as either a single path or a list of\r\npaths.")
    public static final SubLObject get_parse_tree_test_data_alt(SubLObject v_parse_tree, SubLObject method_calls) {
        {
            SubLObject test_data = NIL;
            SubLObject cdolist_list_var = method_calls;
            SubLObject method_call = NIL;
            for (method_call = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , method_call = cdolist_list_var.first()) {
                {
                    SubLObject method = method_call.first();
                    SubLObject args = method_call.rest();
                    SubLObject results = NIL;
                    SubLObject returned = NIL;
                    if (NIL != methods.funcall_instance_method_with_1_args(v_parse_tree, IMPLEMENTS_METHOD_P, method)) {
                        returned = classes_utilities.apply_instance_method(v_parse_tree, method, args);
                        if (returned.isList()) {
                            {
                                SubLObject cdolist_list_var_2 = returned;
                                SubLObject result = NIL;
                                for (result = cdolist_list_var_2.first(); NIL != cdolist_list_var_2; cdolist_list_var_2 = cdolist_list_var_2.rest() , result = cdolist_list_var_2.first()) {
                                    results = cons(methods.funcall_instance_method_with_0_args(result, GET_PATH), results);
                                }
                                results = nreverse(results);
                            }
                        } else {
                            results = methods.funcall_instance_method_with_0_args(returned, GET_PATH);
                        }
                        test_data = cons(list(methods.funcall_instance_method_with_0_args(v_parse_tree, GET_PATH), method_call, results), test_data);
                    }
                }
            }
            return test_data;
        }
    }

    /**
     *
     *
     * @param PARSE-TREE
     * 		parse-tree-p; a parse tree for which to generate test data
     * @param METHODO-CALLS
     * 		listp; a list of methods that make up the tests
     * @return listp; a list of test data; each element of that list is a list
    with three elements: (i) the path of PARSE-TREE, (ii) a method-argument call,
    and (iii) the result of the method call, as either a single path or a list of
    paths.
     */
    @LispMethod(comment = "@param PARSE-TREE\r\n\t\tparse-tree-p; a parse tree for which to generate test data\r\n@param METHODO-CALLS\r\n\t\tlistp; a list of methods that make up the tests\r\n@return listp; a list of test data; each element of that list is a list\r\nwith three elements: (i) the path of PARSE-TREE, (ii) a method-argument call,\r\nand (iii) the result of the method call, as either a single path or a list of\r\npaths.")
    public static SubLObject get_parse_tree_test_data(final SubLObject v_parse_tree, final SubLObject method_calls) {
        SubLObject test_data = NIL;
        SubLObject cdolist_list_var = method_calls;
        SubLObject method_call = NIL;
        method_call = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject method = method_call.first();
            final SubLObject args = method_call.rest();
            SubLObject results = NIL;
            SubLObject returned = NIL;
            if (NIL != methods.funcall_instance_method_with_1_args(v_parse_tree, IMPLEMENTS_METHOD_P, method)) {
                returned = classes_utilities.apply_instance_method(v_parse_tree, method, args);
                if (returned.isList()) {
                    SubLObject cdolist_list_var_$2 = returned;
                    SubLObject result = NIL;
                    result = cdolist_list_var_$2.first();
                    while (NIL != cdolist_list_var_$2) {
                        results = cons(methods.funcall_instance_method_with_0_args(result, GET_PATH), results);
                        cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                        result = cdolist_list_var_$2.first();
                    } 
                    results = nreverse(results);
                } else {
                    results = methods.funcall_instance_method_with_0_args(returned, GET_PATH);
                }
                test_data = cons(list(methods.funcall_instance_method_with_0_args(v_parse_tree, GET_PATH), method_call, results), test_data);
            }
            cdolist_list_var = cdolist_list_var.rest();
            method_call = cdolist_list_var.first();
        } 
        return test_data;
    }

    /**
     *
     *
     * @param PARSE-TREE
     * 		parse-tree-p; a parse tree for all of whose subtrees to
     * 		generate test data
     * @param METHODO-CALLS
     * 		listp; a list of methods that make up the tests
     * @return listp; a list of test data; each element of that list is a list
    with three elements: (i) the path to the subtree of PARSE-TREE,
    (ii) a method-argument call, and (iii) the result of the method call, as
    either a single path in PARSE-TREE, or a list of paths.
     */
    @LispMethod(comment = "@param PARSE-TREE\r\n\t\tparse-tree-p; a parse tree for all of whose subtrees to\r\n\t\tgenerate test data\r\n@param METHODO-CALLS\r\n\t\tlistp; a list of methods that make up the tests\r\n@return listp; a list of test data; each element of that list is a list\r\nwith three elements: (i) the path to the subtree of PARSE-TREE,\r\n(ii) a method-argument call, and (iii) the result of the method call, as\r\neither a single path in PARSE-TREE, or a list of paths.")
    public static final SubLObject get_parse_tree_test_data_recursively_alt(SubLObject v_parse_tree, SubLObject method_calls) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject test_data = NIL;
                SubLObject stack = stacks.create_stack();
                SubLObject order_var = $DFR2L;
                SubLObject possible_orders = list($DFL2R, $DFR2L);
                SubLObject sub = NIL;
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == subl_promotions.memberP(order_var, possible_orders, symbol_function(EQ), UNPROVIDED)) {
                        Errors.error($str_alt122$_S_is_not_one_of__S, order_var, possible_orders);
                    }
                }
                stacks.stack_push(v_parse_tree, stack);
                while (NIL == stacks.stack_empty_p(stack)) {
                    sub = stacks.stack_pop(stack);
                    test_data = append(com.cyc.cycjava.cycl.test_case_generator.get_parse_tree_test_data(sub, method_calls), test_data);
                    if (NIL != parse_tree.phrase_tree_p(sub)) {
                        {
                            SubLObject vector_var = parse_tree.get_phrase_tree_daughters(sub);
                            SubLObject backwardP_var = eq(order_var, $DFL2R);
                            SubLObject length = length(vector_var);
                            SubLObject v_iteration = NIL;
                            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                {
                                    SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                                    SubLObject daughter = aref(vector_var, element_num);
                                    stacks.stack_push(daughter, stack);
                                }
                            }
                        }
                    }
                } 
                return test_data;
            }
        }
    }

    /**
     *
     *
     * @param PARSE-TREE
     * 		parse-tree-p; a parse tree for all of whose subtrees to
     * 		generate test data
     * @param METHODO-CALLS
     * 		listp; a list of methods that make up the tests
     * @return listp; a list of test data; each element of that list is a list
    with three elements: (i) the path to the subtree of PARSE-TREE,
    (ii) a method-argument call, and (iii) the result of the method call, as
    either a single path in PARSE-TREE, or a list of paths.
     */
    @LispMethod(comment = "@param PARSE-TREE\r\n\t\tparse-tree-p; a parse tree for all of whose subtrees to\r\n\t\tgenerate test data\r\n@param METHODO-CALLS\r\n\t\tlistp; a list of methods that make up the tests\r\n@return listp; a list of test data; each element of that list is a list\r\nwith three elements: (i) the path to the subtree of PARSE-TREE,\r\n(ii) a method-argument call, and (iii) the result of the method call, as\r\neither a single path in PARSE-TREE, or a list of paths.")
    public static SubLObject get_parse_tree_test_data_recursively(final SubLObject v_parse_tree, final SubLObject method_calls) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject test_data = NIL;
        final SubLObject stack = stacks.create_stack();
        final SubLObject order_var = $DFR2L;
        final SubLObject possible_orders = list($DFL2R, $DFR2L);
        SubLObject sub = NIL;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subl_promotions.memberP(order_var, possible_orders, symbol_function(EQ), UNPROVIDED))) {
            Errors.error($str122$_S_is_not_one_of__S, order_var, possible_orders);
        }
        stacks.stack_push(v_parse_tree, stack);
        while (NIL == stacks.stack_empty_p(stack)) {
            sub = stacks.stack_pop(stack);
            test_data = append(get_parse_tree_test_data(sub, method_calls), test_data);
            if (NIL != parse_tree.phrase_tree_p(sub)) {
                final SubLObject vector_var = parse_tree.get_phrase_tree_daughters(sub);
                final SubLObject backwardP_var = eq(order_var, $DFL2R);
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject daughter;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    daughter = aref(vector_var, element_num);
                    stacks.stack_push(daughter, stack);
                }
            }
        } 
        return test_data;
    }

    static private final SubLString $str_alt3$No_such_file___a = makeString("No such file: ~a");

    static private final SubLString $str_alt5$Unable_to_open__S = makeString("Unable to open ~S");

    /**
     * Evals test case DECLARATION and DEFINITIONS
     *
     * @param DECLARATION
    listp;
     * 		
     * @param DEFINITIONS
    listp;
     * 		
     */
    @LispMethod(comment = "Evals test case DECLARATION and DEFINITIONS\r\n\r\n@param DECLARATION\nlistp;\r\n\t\t\r\n@param DEFINITIONS\nlistp;")
    public static final SubLObject eval_test_case_alt(SubLObject declaration, SubLObject definitions) {
        eval(declaration);
        Mapping.mapcar(EVAL, definitions);
        return NIL;
    }

    /**
     * Evals test case DECLARATION and DEFINITIONS
     *
     * @param DECLARATION
    		listp;
     * 		
     * @param DEFINITIONS
    		listp;
     * 		
     */
    @LispMethod(comment = "Evals test case DECLARATION and DEFINITIONS\r\n\r\n@param DECLARATION\n\t\tlistp;\r\n\t\t\r\n@param DEFINITIONS\n\t\tlistp;")
    public static SubLObject eval_test_case(final SubLObject declaration, final SubLObject definitions) {
        eval(declaration);
        Mapping.mapcar(EVAL, definitions);
        return NIL;
    }

    static private final SubLString $str_alt6$Appending_test_cases_to_ = makeString("Appending test cases to ");

    static private final SubLString $str_alt7$___ = makeString("...");

    /**
     * Writes a single test case consisting of DECLARATION and DEFINITION to stream OUT
     */
    @LispMethod(comment = "Writes a single test case consisting of DECLARATION and DEFINITION to stream OUT")
    public static final SubLObject dump_test_case_alt(SubLObject comment, SubLObject declaration, SubLObject definitions, SubLObject out) {
        princ(comment, out);
        terpri(out);
        princ($list_alt124, out);
        terpri(out);
        terpri(out);
        prin1(declaration, out);
        terpri(out);
        terpri(out);
        {
            SubLObject cdolist_list_var = definitions;
            SubLObject definition = NIL;
            for (definition = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , definition = cdolist_list_var.first()) {
                prin1(definition, out);
                terpri(out);
                terpri(out);
            }
        }
        terpri(out);
        return length(definitions);
    }

    /**
     * Writes a single test case consisting of DECLARATION and DEFINITION to stream OUT
     */
    @LispMethod(comment = "Writes a single test case consisting of DECLARATION and DEFINITION to stream OUT")
    public static SubLObject dump_test_case(final SubLObject comment, final SubLObject declaration, final SubLObject definitions, final SubLObject out) {
        princ(comment, out);
        terpri(out);
        princ($list124, out);
        terpri(out);
        terpri(out);
        prin1(declaration, out);
        terpri(out);
        terpri(out);
        SubLObject cdolist_list_var = definitions;
        SubLObject definition = NIL;
        definition = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            prin1(definition, out);
            terpri(out);
            terpri(out);
            cdolist_list_var = cdolist_list_var.rest();
            definition = cdolist_list_var.first();
        } 
        terpri(out);
        return length(definitions);
    }

    static private final SubLString $str_alt9$_ = makeString(";");

    static private final SubLString $str_alt13$Appending_test_case_to_ = makeString("Appending test case to ");

    static private final SubLList $list_alt16 = list(new SubLObject[]{ list(makeSymbol("MODULE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("SYSTEM"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CATEGORIES"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DATUM"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("NAME"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("NEW"), list(makeSymbol("MODULE"), makeSymbol("SYSTEM"), makeSymbol("DATUM"), makeSymbol("CATEGORIES")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TEST-CASE-DEF"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SETUP-DEF"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CLEANUP-DEF"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-METHOD-DEFS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-METHOD-DECLS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TEST-CASE-DECL"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TEST-CASE-COMMENT"), NIL, makeKeyword("PROTECTED")) });

    /**
     *
     *
     * @param CYCLS1
     * 		listp; a list of el formulas
     * @param CYCLS2
     * 		listp; a list of el formuas
     * @return boolean; t if  CYCLS1 and CYCLS2 are subsets of each other
     */
    @LispMethod(comment = "@param CYCLS1\r\n\t\tlistp; a list of el formulas\r\n@param CYCLS2\r\n\t\tlistp; a list of el formuas\r\n@return boolean; t if  CYCLS1 and CYCLS2 are subsets of each other")
    public static final SubLObject cycls_equal_p_alt(SubLObject cycls1, SubLObject cycls2) {
        return makeBoolean(length(cycls1).numE(length(cycls2)) && (NIL != subsetp(cycls1, cycls2, $sym125$EQUALS_EL_, UNPROVIDED)));
    }

    /**
     *
     *
     * @param CYCLS1
     * 		listp; a list of el formulas
     * @param CYCLS2
     * 		listp; a list of el formuas
     * @return boolean; t if  CYCLS1 and CYCLS2 are subsets of each other
     */
    @LispMethod(comment = "@param CYCLS1\r\n\t\tlistp; a list of el formulas\r\n@param CYCLS2\r\n\t\tlistp; a list of el formuas\r\n@return boolean; t if  CYCLS1 and CYCLS2 are subsets of each other")
    public static SubLObject cycls_equal_p(final SubLObject cycls1, final SubLObject cycls2) {
        return makeBoolean(length(cycls1).numE(length(cycls2)) && (NIL != subsetp(cycls1, cycls2, $sym125$EQUALS_EL_, UNPROVIDED)));
    }

    /**
     * generates parse tree syntax SUnit test cases in each of CATEGORIES for each sentence in
     * IN-FILE appends them to OUT-FILE. Returns the number of test methods generated.
     */
    @LispMethod(comment = "generates parse tree syntax SUnit test cases in each of CATEGORIES for each sentence in\r\nIN-FILE appends them to OUT-FILE. Returns the number of test methods generated.\ngenerates parse tree syntax SUnit test cases in each of CATEGORIES for each sentence in\nIN-FILE appends them to OUT-FILE. Returns the number of test methods generated.")
    public static final SubLObject add_syntax_test_cases_alt(SubLObject in_file, SubLObject out_file, SubLObject categories) {
        if (out_file == UNPROVIDED) {
            out_file = $parse_tree_syntax_test_file$.getDynamicValue();
        }
        if (categories == UNPROVIDED) {
            categories = $list_alt129;
        }
        return com.cyc.cycjava.cycl.test_case_generator.add_test_cases(PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR, $str_alt130$parse_tree, $$$cycl, categories, in_file, out_file);
    }

    /**
     * generates parse tree syntax SUnit test cases in each of CATEGORIES for each sentence in
     * IN-FILE appends them to OUT-FILE. Returns the number of test methods generated.
     */
    @LispMethod(comment = "generates parse tree syntax SUnit test cases in each of CATEGORIES for each sentence in\r\nIN-FILE appends them to OUT-FILE. Returns the number of test methods generated.\ngenerates parse tree syntax SUnit test cases in each of CATEGORIES for each sentence in\nIN-FILE appends them to OUT-FILE. Returns the number of test methods generated.")
    public static SubLObject add_syntax_test_cases(final SubLObject in_file, SubLObject out_file, SubLObject categories) {
        if (out_file == UNPROVIDED) {
            out_file = $parse_tree_syntax_test_file$.getDynamicValue();
        }
        if (categories == UNPROVIDED) {
            categories = $list129;
        }
        return add_test_cases(PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR, $str130$parse_tree, $$$cycl, categories, in_file, out_file);
    }

    /**
     * generates parse tree syntax SUnit test cases in each of CATEGORIES for SENTENCE
     * and appends them to OUT-FILE. Returns the number of test methods generated.
     */
    @LispMethod(comment = "generates parse tree syntax SUnit test cases in each of CATEGORIES for SENTENCE\r\nand appends them to OUT-FILE. Returns the number of test methods generated.\ngenerates parse tree syntax SUnit test cases in each of CATEGORIES for SENTENCE\nand appends them to OUT-FILE. Returns the number of test methods generated.")
    public static final SubLObject add_syntax_test_case_alt(SubLObject sentence, SubLObject out_file, SubLObject categories) {
        if (out_file == UNPROVIDED) {
            out_file = $parse_tree_syntax_test_file$.getDynamicValue();
        }
        if (categories == UNPROVIDED) {
            categories = $list_alt129;
        }
        return com.cyc.cycjava.cycl.test_case_generator.add_test_case(PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR, $str_alt130$parse_tree, $$$cycl, categories, sentence, out_file);
    }

    /**
     * generates parse tree syntax SUnit test cases in each of CATEGORIES for SENTENCE
     * and appends them to OUT-FILE. Returns the number of test methods generated.
     */
    @LispMethod(comment = "generates parse tree syntax SUnit test cases in each of CATEGORIES for SENTENCE\r\nand appends them to OUT-FILE. Returns the number of test methods generated.\ngenerates parse tree syntax SUnit test cases in each of CATEGORIES for SENTENCE\nand appends them to OUT-FILE. Returns the number of test methods generated.")
    public static SubLObject add_syntax_test_case(final SubLObject sentence, SubLObject out_file, SubLObject categories) {
        if (out_file == UNPROVIDED) {
            out_file = $parse_tree_syntax_test_file$.getDynamicValue();
        }
        if (categories == UNPROVIDED) {
            categories = $list129;
        }
        return add_test_case(PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR, $str130$parse_tree, $$$cycl, categories, sentence, out_file);
    }

    /**
     * generates cyclifier SUnit test cases in each of CATEGORIES for each sentence in
     * IN-FILE appends them to OUT-FILE. Returns the number of test methods generated.
     */
    @LispMethod(comment = "generates cyclifier SUnit test cases in each of CATEGORIES for each sentence in\r\nIN-FILE appends them to OUT-FILE. Returns the number of test methods generated.\ngenerates cyclifier SUnit test cases in each of CATEGORIES for each sentence in\nIN-FILE appends them to OUT-FILE. Returns the number of test methods generated.")
    public static final SubLObject add_cyclifier_test_cases_alt(SubLObject in_file, SubLObject out_file, SubLObject categories) {
        if (out_file == UNPROVIDED) {
            out_file = $cyclifier_test_file$.getDynamicValue();
        }
        if (categories == UNPROVIDED) {
            categories = $list_alt132;
        }
        return com.cyc.cycjava.cycl.test_case_generator.add_test_cases(CYCLIFIER_TEST_CASE_GENERATOR, $str_alt130$parse_tree, $$$cycl, categories, in_file, out_file);
    }

    /**
     * generates cyclifier SUnit test cases in each of CATEGORIES for each sentence in
     * IN-FILE appends them to OUT-FILE. Returns the number of test methods generated.
     */
    @LispMethod(comment = "generates cyclifier SUnit test cases in each of CATEGORIES for each sentence in\r\nIN-FILE appends them to OUT-FILE. Returns the number of test methods generated.\ngenerates cyclifier SUnit test cases in each of CATEGORIES for each sentence in\nIN-FILE appends them to OUT-FILE. Returns the number of test methods generated.")
    public static SubLObject add_cyclifier_test_cases(final SubLObject in_file, SubLObject out_file, SubLObject categories) {
        if (out_file == UNPROVIDED) {
            out_file = $cyclifier_test_file$.getDynamicValue();
        }
        if (categories == UNPROVIDED) {
            categories = $list132;
        }
        return add_test_cases(CYCLIFIER_TEST_CASE_GENERATOR, $str130$parse_tree, $$$cycl, categories, in_file, out_file);
    }

    static private final SubLList $list_alt27 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt28 = list(makeSymbol("MODULE0"), makeSymbol("SYSTEM0"), makeSymbol("DATUM0"), makeSymbol("CATEGORIES0"));

    static private final SubLList $list_alt29 = list(makeString("@param MODULE0 stringp; the module of the test case\n   @param SYSTEM0 stringp; the system of the test case\n   @param DATUM0 objectp; the datum for which to generate the test case\n   @param CATEGORIES listp; the categories the test case belongs to\n   @return test-case-generator; a new test case generator for MODULE0 in SYSTEM0 belonging\n   to CATEGORIES0 and generating tests operating on DATA0"), list(makeSymbol("CHECK-TYPE"), makeSymbol("CATEGORIES0"), makeSymbol("LISTP")), list(makeSymbol("CLET"), list(list(makeSymbol("GENERATOR"), list(makeSymbol("NEW-CLASS-INSTANCE"), makeSymbol("SELF")))), list(makeSymbol("SET-TEST-CASE-GENERATOR-MODULE"), makeSymbol("GENERATOR"), makeSymbol("MODULE0")), list(makeSymbol("SET-TEST-CASE-GENERATOR-SYSTEM"), makeSymbol("GENERATOR"), makeSymbol("SYSTEM0")), list(makeSymbol("SET-TEST-CASE-GENERATOR-DATUM"), makeSymbol("GENERATOR"), makeSymbol("DATUM0")), list(makeSymbol("SET-TEST-CASE-GENERATOR-CATEGORIES"), makeSymbol("GENERATOR"), makeSymbol("CATEGORIES0")), list(makeSymbol("SET-TEST-CASE-GENERATOR-NAME"), makeSymbol("GENERATOR"), list(makeSymbol("NEW-TEST-CASE-NAME"))), list(RET, makeSymbol("GENERATOR"))));

    /**
     * generates cyclifier SUnit test cases in each of CATEGORIES for SENTENCE
     * and appends them to OUT-FILE. Returns the number of test methods generated.
     */
    @LispMethod(comment = "generates cyclifier SUnit test cases in each of CATEGORIES for SENTENCE\r\nand appends them to OUT-FILE. Returns the number of test methods generated.\ngenerates cyclifier SUnit test cases in each of CATEGORIES for SENTENCE\nand appends them to OUT-FILE. Returns the number of test methods generated.")
    public static final SubLObject add_cyclifier_test_case_alt(SubLObject sentence, SubLObject out_file, SubLObject categories) {
        if (out_file == UNPROVIDED) {
            out_file = $cyclifier_test_file$.getDynamicValue();
        }
        if (categories == UNPROVIDED) {
            categories = $list_alt132;
        }
        return com.cyc.cycjava.cycl.test_case_generator.add_test_case(CYCLIFIER_TEST_CASE_GENERATOR, $str_alt130$parse_tree, $$$cycl, categories, sentence, out_file);
    }

    /**
     * generates cyclifier SUnit test cases in each of CATEGORIES for SENTENCE
     * and appends them to OUT-FILE. Returns the number of test methods generated.
     */
    @LispMethod(comment = "generates cyclifier SUnit test cases in each of CATEGORIES for SENTENCE\r\nand appends them to OUT-FILE. Returns the number of test methods generated.\ngenerates cyclifier SUnit test cases in each of CATEGORIES for SENTENCE\nand appends them to OUT-FILE. Returns the number of test methods generated.")
    public static SubLObject add_cyclifier_test_case(final SubLObject sentence, SubLObject out_file, SubLObject categories) {
        if (out_file == UNPROVIDED) {
            out_file = $cyclifier_test_file$.getDynamicValue();
        }
        if (categories == UNPROVIDED) {
            categories = $list132;
        }
        return add_test_case(CYCLIFIER_TEST_CASE_GENERATOR, $str130$parse_tree, $$$cycl, categories, sentence, out_file);
    }

    public static SubLObject declare_test_case_generator_file() {
        declareFunction("add_test_cases", "ADD-TEST-CASES", 6, 0, false);
        declareFunction("add_test_case", "ADD-TEST-CASE", 6, 0, false);
        declareFunction("get_test_case_generator_name", "GET-TEST-CASE-GENERATOR-NAME", 1, 0, false);
        declareFunction("set_test_case_generator_name", "SET-TEST-CASE-GENERATOR-NAME", 2, 0, false);
        declareFunction("get_test_case_generator_datum", "GET-TEST-CASE-GENERATOR-DATUM", 1, 0, false);
        declareFunction("set_test_case_generator_datum", "SET-TEST-CASE-GENERATOR-DATUM", 2, 0, false);
        declareFunction("get_test_case_generator_categories", "GET-TEST-CASE-GENERATOR-CATEGORIES", 1, 0, false);
        declareFunction("set_test_case_generator_categories", "SET-TEST-CASE-GENERATOR-CATEGORIES", 2, 0, false);
        declareFunction("get_test_case_generator_system", "GET-TEST-CASE-GENERATOR-SYSTEM", 1, 0, false);
        declareFunction("set_test_case_generator_system", "SET-TEST-CASE-GENERATOR-SYSTEM", 2, 0, false);
        declareFunction("get_test_case_generator_module", "GET-TEST-CASE-GENERATOR-MODULE", 1, 0, false);
        declareFunction("set_test_case_generator_module", "SET-TEST-CASE-GENERATOR-MODULE", 2, 0, false);
        declareFunction("subloop_reserved_initialize_test_case_generator_class", "SUBLOOP-RESERVED-INITIALIZE-TEST-CASE-GENERATOR-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_test_case_generator_instance", "SUBLOOP-RESERVED-INITIALIZE-TEST-CASE-GENERATOR-INSTANCE", 1, 0, false);
        declareFunction("test_case_generator_p", "TEST-CASE-GENERATOR-P", 1, 0, false);
        declareFunction("test_case_generator_new_method", "TEST-CASE-GENERATOR-NEW-METHOD", 5, 0, false);
        declareFunction("test_case_generator_get_test_case_def_method", "TEST-CASE-GENERATOR-GET-TEST-CASE-DEF-METHOD", 1, 0, false);
        declareFunction("test_case_generator_get_setup_def_method", "TEST-CASE-GENERATOR-GET-SETUP-DEF-METHOD", 1, 0, false);
        declareFunction("test_case_generator_get_cleanup_def_method", "TEST-CASE-GENERATOR-GET-CLEANUP-DEF-METHOD", 1, 0, false);
        declareFunction("test_case_generator_get_method_decls_method", "TEST-CASE-GENERATOR-GET-METHOD-DECLS-METHOD", 2, 0, false);
        declareFunction("test_case_generator_get_test_case_comment_method", "TEST-CASE-GENERATOR-GET-TEST-CASE-COMMENT-METHOD", 1, 0, false);
        declareFunction("get_cyclifier_test_case_generator_parse_expression", "GET-CYCLIFIER-TEST-CASE-GENERATOR-PARSE-EXPRESSION", 1, 0, false);
        declareFunction("set_cyclifier_test_case_generator_parse_expression", "SET-CYCLIFIER-TEST-CASE-GENERATOR-PARSE-EXPRESSION", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyclifier_test_case_generator_class", "SUBLOOP-RESERVED-INITIALIZE-CYCLIFIER-TEST-CASE-GENERATOR-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyclifier_test_case_generator_instance", "SUBLOOP-RESERVED-INITIALIZE-CYCLIFIER-TEST-CASE-GENERATOR-INSTANCE", 1, 0, false);
        declareFunction("cyclifier_test_case_generator_p", "CYCLIFIER-TEST-CASE-GENERATOR-P", 1, 0, false);
        declareFunction("cyclifier_test_case_generator_new_method", "CYCLIFIER-TEST-CASE-GENERATOR-NEW-METHOD", 5, 0, false);
        declareFunction("cyclifier_test_case_generator_get_test_case_decl_method", "CYCLIFIER-TEST-CASE-GENERATOR-GET-TEST-CASE-DECL-METHOD", 2, 0, false);
        declareFunction("cyclifier_test_case_generator_get_method_defs_method", "CYCLIFIER-TEST-CASE-GENERATOR-GET-METHOD-DEFS-METHOD", 1, 0, false);
        declareFunction("get_parse_tree_syntax_test_case_generator_parse_expression", "GET-PARSE-TREE-SYNTAX-TEST-CASE-GENERATOR-PARSE-EXPRESSION", 1, 0, false);
        declareFunction("set_parse_tree_syntax_test_case_generator_parse_expression", "SET-PARSE-TREE-SYNTAX-TEST-CASE-GENERATOR-PARSE-EXPRESSION", 2, 0, false);
        declareFunction("subloop_reserved_initialize_parse_tree_syntax_test_case_generator_class", "SUBLOOP-RESERVED-INITIALIZE-PARSE-TREE-SYNTAX-TEST-CASE-GENERATOR-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_parse_tree_syntax_test_case_generator_instance", "SUBLOOP-RESERVED-INITIALIZE-PARSE-TREE-SYNTAX-TEST-CASE-GENERATOR-INSTANCE", 1, 0, false);
        declareFunction("parse_tree_syntax_test_case_generator_p", "PARSE-TREE-SYNTAX-TEST-CASE-GENERATOR-P", 1, 0, false);
        declareFunction("parse_tree_syntax_test_case_generator_new_method", "PARSE-TREE-SYNTAX-TEST-CASE-GENERATOR-NEW-METHOD", 5, 0, false);
        declareFunction("parse_tree_syntax_test_case_generator_get_test_case_decl_method", "PARSE-TREE-SYNTAX-TEST-CASE-GENERATOR-GET-TEST-CASE-DECL-METHOD", 2, 0, false);
        declareFunction("parse_tree_syntax_test_case_generator_get_method_defs_method", "PARSE-TREE-SYNTAX-TEST-CASE-GENERATOR-GET-METHOD-DEFS-METHOD", 1, 0, false);
        declareFunction("new_fail_unless_call", "NEW-FAIL-UNLESS-CALL", 2, 0, false);
        declareFunction("new_syntax_test_failure_explanation", "NEW-SYNTAX-TEST-FAILURE-EXPLANATION", 4, 0, false);
        declareFunction("new_test_case_name", "NEW-TEST-CASE-NAME", 0, 0, false);
        declareFunction("get_parse_tree_test_data", "GET-PARSE-TREE-TEST-DATA", 2, 0, false);
        declareFunction("get_parse_tree_test_data_recursively", "GET-PARSE-TREE-TEST-DATA-RECURSIVELY", 2, 0, false);
        declareFunction("eval_test_case", "EVAL-TEST-CASE", 2, 0, false);
        declareFunction("dump_test_case", "DUMP-TEST-CASE", 4, 0, false);
        declareFunction("cycls_equal_p", "CYCLS-EQUAL-P", 2, 0, false);
        declareFunction("add_syntax_test_cases", "ADD-SYNTAX-TEST-CASES", 1, 2, false);
        declareFunction("add_syntax_test_case", "ADD-SYNTAX-TEST-CASE", 1, 2, false);
        declareFunction("add_cyclifier_test_cases", "ADD-CYCLIFIER-TEST-CASES", 1, 2, false);
        declareFunction("add_cyclifier_test_case", "ADD-CYCLIFIER-TEST-CASE", 1, 2, false);
        return NIL;
    }

    static private final SubLList $list_alt31 = list(makeString("@return values; 1. a declaration of the test case and methods\n                   2. a definition of the test case and methods"), list(makeSymbol("CLET"), list(list(makeSymbol("METHOD-DEFINITIONS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-METHOD-DEFS")))), list(makeSymbol("METHOD-DECLARATIONS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-METHOD-DECLS")), makeSymbol("METHOD-DEFINITIONS"))), list(makeSymbol("TEST-CASE-DECLARATION"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-TEST-CASE-DECL")), makeSymbol("METHOD-DECLARATIONS")))), list(RET, list(makeSymbol("VALUES"), makeSymbol("TEST-CASE-DECLARATION"), list(makeSymbol("CONS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SETUP-DEF"))), list(makeSymbol("CONS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-CLEANUP-DEF"))), makeSymbol("METHOD-DEFINITIONS")))))));

    static private final SubLList $list_alt38 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt39 = list(makeString("@return listp; a definition of a setup method"), list(RET, list(makeSymbol("BQ-LIST*"), list(QUOTE, makeSymbol("DEF-SETUP-METHOD")), list(makeSymbol("BQ-CONS"), makeSymbol("NAME"), list(QUOTE, list(makeKeyword("PROTECTED")))), list(QUOTE, list(NIL, list(RET, NIL))))));

    static private final SubLList $list_alt42 = list(NIL, list(RET, NIL));

    static private final SubLList $list_alt44 = list(makeString("@return listp; a definition of a cleanup method"), list(RET, list(makeSymbol("BQ-LIST*"), list(QUOTE, makeSymbol("DEF-CLEANUP-METHOD")), list(makeSymbol("BQ-CONS"), makeSymbol("NAME"), list(QUOTE, list(makeKeyword("PROTECTED")))), list(QUOTE, list(NIL, list(RET, NIL))))));

    static private final SubLList $list_alt48 = list(makeSymbol("METHOD-DEFINITIONS"));

    static private final SubLList $list_alt49 = list(makeString("@return listp; a list of method declarations for each method in METHOD-DEFINITIONS"), list(makeSymbol("CLET"), list(list(makeSymbol("DECLARATIONS"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("METHOD-DEF"), makeSymbol("METHOD-DEFINITIONS")), list(makeSymbol("CLET"), list(list(makeSymbol("METHOD-NAME"), list(makeSymbol("FIRST"), list(makeSymbol("SECOND"), makeSymbol("METHOD-DEF"))))), list(makeSymbol("CPUSH"), list(makeSymbol("BQ-LIST*"), list(QUOTE, makeSymbol("DEF-INSTANCE-METHOD")), makeSymbol("METHOD-NAME"), list(QUOTE, list(NIL, makeKeyword("PROTECTED")))), makeSymbol("DECLARATIONS")))), list(RET, list(makeSymbol("NREVERSE"), makeSymbol("DECLARATIONS")))));

    static private final SubLList $list_alt51 = list(NIL, makeKeyword("PROTECTED"));

    static private final SubLList $list_alt53 = list(makeString("@return stringp; a comment string for the test case this generator generates"), list(RET, list(new SubLObject[]{ makeSymbol("FORMAT"), NIL, makeString(";;;;~%;; TEST: ~a~%;; CATEGORIES: ~a~%;;~%;; DATE: ~a~%;; REVISION: ~a~%;; KB: ~a.~a~%;; USER: ~a~%;;;;~%"), makeSymbol("DATUM"), makeSymbol("CATEGORIES"), list(makeSymbol("GET-UNIVERSAL-DATE")), list(makeSymbol("CYC-REVISION-STRING")), list(makeSymbol("KB-LOADED")), list(makeSymbol("REMOTE-OPS-PROCESSED")), list(makeSymbol("GET-USER-NAME")) })));

    public static SubLObject init_test_case_generator_file() {
        defparameter("*PARSE-TREE-TEST-DIRECTORY*", $str126$__cvs_head_cycorp_cyc_top_tests_);
        defparameter("*PARSE-TREE-SYNTAX-TEST-FILE*", cconcatenate($parse_tree_test_directory$.getDynamicValue(), $str127$_parse_tree_syntax_tests_lisp));
        defparameter("*CYCLIFIER-TEST-FILE*", cconcatenate($parse_tree_test_directory$.getDynamicValue(), $str128$cyclifier_tests_lisp));
        return NIL;
    }

    static private final SubLString $str_alt55$_________TEST___a_____CATEGORIES_ = makeString(";;;;~%;; TEST: ~a~%;; CATEGORIES: ~a~%;;~%;; DATE: ~a~%;; REVISION: ~a~%;; KB: ~a.~a~%;; USER: ~a~%;;;;~%");

    public static SubLObject setup_test_case_generator_file() {
        classes.subloop_new_class(TEST_CASE_GENERATOR, OBJECT, NIL, T, $list16);
        classes.class_set_implements_slot_listeners(TEST_CASE_GENERATOR, NIL);
        classes.subloop_note_class_initialization_function(TEST_CASE_GENERATOR, SUBLOOP_RESERVED_INITIALIZE_TEST_CASE_GENERATOR_CLASS);
        classes.subloop_note_instance_initialization_function(TEST_CASE_GENERATOR, SUBLOOP_RESERVED_INITIALIZE_TEST_CASE_GENERATOR_INSTANCE);
        subloop_reserved_initialize_test_case_generator_class(TEST_CASE_GENERATOR);
        methods.methods_incorporate_class_method(NEW, TEST_CASE_GENERATOR, $list27, $list28, $list29);
        methods.subloop_register_class_method(TEST_CASE_GENERATOR, NEW, TEST_CASE_GENERATOR_NEW_METHOD);
        methods.methods_incorporate_instance_method(GET_TEST_CASE_DEF, TEST_CASE_GENERATOR, $list27, NIL, $list31);
        methods.subloop_register_instance_method(TEST_CASE_GENERATOR, GET_TEST_CASE_DEF, TEST_CASE_GENERATOR_GET_TEST_CASE_DEF_METHOD);
        methods.methods_incorporate_instance_method(GET_SETUP_DEF, TEST_CASE_GENERATOR, $list38, NIL, $list39);
        methods.subloop_register_instance_method(TEST_CASE_GENERATOR, GET_SETUP_DEF, TEST_CASE_GENERATOR_GET_SETUP_DEF_METHOD);
        methods.methods_incorporate_instance_method(GET_CLEANUP_DEF, TEST_CASE_GENERATOR, $list38, NIL, $list44);
        methods.subloop_register_instance_method(TEST_CASE_GENERATOR, GET_CLEANUP_DEF, TEST_CASE_GENERATOR_GET_CLEANUP_DEF_METHOD);
        methods.methods_incorporate_instance_method(GET_METHOD_DECLS, TEST_CASE_GENERATOR, $list38, $list48, $list49);
        methods.subloop_register_instance_method(TEST_CASE_GENERATOR, GET_METHOD_DECLS, TEST_CASE_GENERATOR_GET_METHOD_DECLS_METHOD);
        methods.methods_incorporate_instance_method(GET_TEST_CASE_COMMENT, TEST_CASE_GENERATOR, $list38, NIL, $list53);
        methods.subloop_register_instance_method(TEST_CASE_GENERATOR, GET_TEST_CASE_COMMENT, TEST_CASE_GENERATOR_GET_TEST_CASE_COMMENT_METHOD);
        classes.subloop_new_class(CYCLIFIER_TEST_CASE_GENERATOR, TEST_CASE_GENERATOR, NIL, NIL, $list58);
        classes.class_set_implements_slot_listeners(CYCLIFIER_TEST_CASE_GENERATOR, NIL);
        classes.subloop_note_class_initialization_function(CYCLIFIER_TEST_CASE_GENERATOR, SUBLOOP_RESERVED_INITIALIZE_CYCLIFIER_TEST_CASE_GENERATOR_CLASS);
        classes.subloop_note_instance_initialization_function(CYCLIFIER_TEST_CASE_GENERATOR, $sym61$SUBLOOP_RESERVED_INITIALIZE_CYCLIFIER_TEST_CASE_GENERATOR_INSTANC);
        subloop_reserved_initialize_cyclifier_test_case_generator_class(CYCLIFIER_TEST_CASE_GENERATOR);
        methods.methods_incorporate_class_method(NEW, CYCLIFIER_TEST_CASE_GENERATOR, $list38, $list28, $list62);
        methods.subloop_register_class_method(CYCLIFIER_TEST_CASE_GENERATOR, NEW, CYCLIFIER_TEST_CASE_GENERATOR_NEW_METHOD);
        methods.methods_incorporate_instance_method(GET_TEST_CASE_DECL, CYCLIFIER_TEST_CASE_GENERATOR, $list38, $list64, $list65);
        methods.subloop_register_instance_method(CYCLIFIER_TEST_CASE_GENERATOR, GET_TEST_CASE_DECL, CYCLIFIER_TEST_CASE_GENERATOR_GET_TEST_CASE_DECL_METHOD);
        methods.methods_incorporate_instance_method(GET_METHOD_DEFS, CYCLIFIER_TEST_CASE_GENERATOR, $list38, NIL, $list78);
        methods.subloop_register_instance_method(CYCLIFIER_TEST_CASE_GENERATOR, GET_METHOD_DEFS, CYCLIFIER_TEST_CASE_GENERATOR_GET_METHOD_DEFS_METHOD);
        classes.subloop_new_class(PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR, TEST_CASE_GENERATOR, NIL, NIL, $list58);
        classes.class_set_implements_slot_listeners(PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR, NIL);
        classes.subloop_note_class_initialization_function(PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR, $sym91$SUBLOOP_RESERVED_INITIALIZE_PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR);
        classes.subloop_note_instance_initialization_function(PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR, $sym92$SUBLOOP_RESERVED_INITIALIZE_PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR);
        subloop_reserved_initialize_parse_tree_syntax_test_case_generator_class(PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR);
        methods.methods_incorporate_class_method(NEW, PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR, $list38, $list28, $list62);
        methods.subloop_register_class_method(PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR, NEW, PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR_NEW_METHOD);
        methods.methods_incorporate_instance_method(GET_TEST_CASE_DECL, PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR, $list38, $list64, $list94);
        methods.subloop_register_instance_method(PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR, GET_TEST_CASE_DECL, PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR_GET_TEST_CASE_DECL_METHOD);
        methods.methods_incorporate_instance_method(GET_METHOD_DEFS, PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR, $list38, NIL, $list99);
        methods.subloop_register_instance_method(PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR, GET_METHOD_DEFS, PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR_GET_METHOD_DEFS_METHOD);
        return NIL;
    }

    static private final SubLList $list_alt58 = list(list(makeSymbol("PARSE-EXPRESSION"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("NEW"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TEST-CASE-DECL"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-METHOD-DEFS"), NIL, makeKeyword("PROTECTED")));

    static private final SubLList $list_alt62 = list(makeString("@param MODULE0 stringp; the module of the test case\n   @param SYSTEM0 stringp; the system of the test case\n   @param DATUM0 objectp; the datum for which to generate the test case\n   @param CATEGORIES listp; the categories the test case belongs to\n   @return test-case-generator; a new test case generator for MODULE0 in SYSTEM0 belonging\n   to CATEGORIES0 and generating tests operating on DATA0"), list(makeSymbol("CLET"), list(list(makeSymbol("GENERATOR"), list(makeSymbol("FUNCALL-CLASS-SUPER-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("NEW")), makeSymbol("MODULE0"), makeSymbol("SYSTEM0"), makeSymbol("DATUM0"), makeSymbol("CATEGORIES0")))), list(makeSymbol("SET-CYCLIFIER-TEST-CASE-GENERATOR-PARSE-EXPRESSION"), makeSymbol("GENERATOR"), list(makeSymbol("SECOND"), list(makeSymbol("FIRST"), list(makeSymbol("CHARNIAK-PARSE"), makeSymbol("DATUM0"))))), list(RET, makeSymbol("GENERATOR"))));

    static private final SubLList $list_alt64 = list(makeSymbol("METHOD-DECLARATIONS"));

    static private final SubLList $list_alt65 = list(makeString("@return values; 1. a declaration of the test case and methods\n                     2. a definition of the test case and methods"), list(RET, list(makeSymbol("BQ-LIST*"), list(QUOTE, makeSymbol("DEFINE-TEST-CASE")), list(makeSymbol("BQ-LIST"), makeSymbol("NAME"), makeSymbol("MODULE"), makeSymbol("SYSTEM"), makeKeyword("CATEGORIES"), list(makeSymbol("BQ-LIST"), list(QUOTE, QUOTE), makeSymbol("CATEGORIES"))), list(makeSymbol("BQ-LIST"), list(QUOTE, makeSymbol("PARSE-TREE")), makeKeyword("INSTANCE"), makeKeyword("PRIVATE"), makeKeyword("VALUE"), list(makeSymbol("BQ-LIST"), list(QUOTE, makeSymbol("NEW-PARSE-TREE")), list(makeSymbol("BQ-LIST"), list(QUOTE, QUOTE), makeSymbol("PARSE-EXPRESSION")))), list(QUOTE, list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SETUP"), NIL, makeKeyword("PROTECTED"))), list(QUOTE, list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEANUP"), NIL, makeKeyword("PROTECTED"))), list(makeSymbol("BQ-APPEND"), makeSymbol("METHOD-DECLARATIONS"), NIL))));

    static private final SubLList $list_alt75 = list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SETUP"), NIL, makeKeyword("PROTECTED"));

    static private final SubLList $list_alt76 = list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEANUP"), NIL, makeKeyword("PROTECTED"));

    static private final SubLList $list_alt78 = list(makeString("@return listp; a list of definitions of all test methods"), list(makeSymbol("CLET"), list(list(makeSymbol("METHOD-NAME"), list(makeSymbol("INTERN"), makeString("TEST-1"))), list(makeSymbol("CYCLS"), list(makeSymbol("FIM"), list(makeSymbol("NEW-PARSE-TREE"), makeSymbol("PARSE-EXPRESSION")), list(QUOTE, makeSymbol("CYCLIFY")))), list(makeSymbol("METHOD-BODY"), list(makeSymbol("BQ-LIST*"), list(QUOTE, makeSymbol("FAIL-UNLESS-EQUAL")), list(QUOTE, makeSymbol("SELF")), list(makeSymbol("BQ-LIST"), list(QUOTE, QUOTE), makeSymbol("CYCLS")), list(QUOTE, list(makeSymbol("FIM"), makeSymbol("PARSE-TREE"), list(QUOTE, makeSymbol("CYCLIFY")))), list(makeSymbol("CCONCATENATE"), makeString("(cyclify \""), makeSymbol("DATUM"), makeString("\") =/= "), list(makeSymbol("PRINC-TO-STRING"), makeSymbol("CYCLS"))), list(QUOTE, list(list(QUOTE, makeSymbol("CYCLS-EQUAL-P"))))))), list(RET, list(makeSymbol("BQ-LIST"), list(makeSymbol("BQ-LIST"), list(QUOTE, makeSymbol("DEF-TEST-METHOD")), list(makeSymbol("BQ-LIST*"), makeSymbol("METHOD-NAME"), makeSymbol("NAME"), list(QUOTE, list(makeKeyword("PROTECTED")))), NIL, makeSymbol("METHOD-BODY"))))));

    @Override
    public void declareFunctions() {
        declare_test_case_generator_file();
    }

    @Override
    public void initializeVariables() {
        init_test_case_generator_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_test_case_generator_file();
    }

    static {
    }

    static private final SubLString $str_alt80$TEST_1 = makeString("TEST-1");

    static private final SubLList $list_alt84 = list(makeSymbol("FIM"), makeSymbol("PARSE-TREE"), list(QUOTE, makeSymbol("CYCLIFY")));

    static private final SubLString $str_alt85$_cyclify__ = makeString("(cyclify \"");

    static private final SubLString $str_alt86$_______ = makeString("\") =/= ");

    static private final SubLList $list_alt87 = list(list(QUOTE, makeSymbol("CYCLS-EQUAL-P")));

    static private final SubLList $list_alt94 = list(makeString("@return values; 1. a declaration of the test case and methods\n                     2. a definition of the test case and methods"), list(RET, list(makeSymbol("BQ-LIST*"), list(QUOTE, makeSymbol("DEFINE-TEST-CASE")), list(makeSymbol("BQ-LIST"), makeSymbol("NAME"), makeSymbol("MODULE"), makeSymbol("SYSTEM"), makeKeyword("CATEGORIES"), list(makeSymbol("BQ-LIST"), list(QUOTE, QUOTE), makeSymbol("CATEGORIES"))), list(makeSymbol("BQ-LIST"), list(QUOTE, makeSymbol("PARSE-TREE")), makeKeyword("CLASS"), makeKeyword("PRIVATE"), makeKeyword("VALUE"), list(makeSymbol("BQ-LIST"), list(QUOTE, makeSymbol("PROCESS-MODIFIERS")), list(makeSymbol("BQ-LIST"), list(QUOTE, makeSymbol("NEW-PARSE-TREE")), list(makeSymbol("BQ-LIST"), list(QUOTE, QUOTE), makeSymbol("PARSE-EXPRESSION"))))), list(QUOTE, list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SETUP"), NIL, makeKeyword("PROTECTED"))), list(QUOTE, list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEANUP"), NIL, makeKeyword("PROTECTED"))), list(makeSymbol("BQ-APPEND"), makeSymbol("METHOD-DECLARATIONS"), NIL))));

    static private final SubLList $list_alt99 = list(makeString("@return listp; a list of definitions of all test methods"), list(makeSymbol("CLET"), list(list(makeSymbol("PARSE-TREE"), list(makeSymbol("PROCESS-MODIFIERS"), list(makeSymbol("NEW-PARSE-TREE"), makeSymbol("PARSE-EXPRESSION")))), list(makeSymbol("TEST-DATA"), list(makeSymbol("GET-PARSE-TREE-TEST-DATA-RECURSIVELY"), makeSymbol("PARSE-TREE"), list(QUOTE, list(list(makeSymbol("GET-COMPLEMENTS")), list(makeSymbol("GET-MODIFIERS")))))), list(makeSymbol("I"), ZERO_INTEGER), list(makeSymbol("METHOD-DEFINITIONS"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("TEST-DATUM"), makeSymbol("TEST-DATA")), list(makeSymbol("CINC"), makeSymbol("I")), list(makeSymbol("CLET"), list(list(makeSymbol("METHOD-NAME"), list(makeSymbol("INTERN"), list(makeSymbol("CCONCATENATE"), makeString("TEST-"), list(makeSymbol("PRINC-TO-STRING"), makeSymbol("I"))))), list(makeSymbol("METHOD-BODY"), list(makeSymbol("NEW-FAIL-UNLESS-CALL"), makeSymbol("TEST-DATUM"), makeSymbol("PARSE-TREE")))), list(makeSymbol("CPUSH"), list(makeSymbol("BQ-LIST"), list(QUOTE, makeSymbol("DEF-TEST-METHOD")), list(makeSymbol("BQ-LIST*"), makeSymbol("METHOD-NAME"), makeSymbol("NAME"), list(QUOTE, list(makeKeyword("PROTECTED")))), NIL, makeSymbol("METHOD-BODY")), makeSymbol("METHOD-DEFINITIONS")))), list(RET, list(makeSymbol("NREVERSE"), makeSymbol("METHOD-DEFINITIONS")))));

    static private final SubLList $list_alt101 = list(list(makeSymbol("GET-COMPLEMENTS")), list(makeSymbol("GET-MODIFIERS")));

    static private final SubLString $str_alt102$TEST_ = makeString("TEST-");

    static private final SubLList $list_alt105 = list(QUOTE, makeSymbol("GET-DESCENDANT"));

    static private final SubLList $list_alt107 = list(list(QUOTE, EQUAL));

    static private final SubLString $str_alt109$_ = makeString("(");

    static private final SubLString $str_alt110$_ = makeString(" ");

    static private final SubLString $str_alt111$__ = makeString(" (");

    static private final SubLString $str_alt114$_ = makeString(")");

    static private final SubLString $str_alt115$______ = makeString(") =/= ");

    static private final SubLString $str_alt116$_ = makeString(".");

    static private final SubLString $str_alt117$TEST_CASE_ = makeString("TEST-CASE-");

    static private final SubLString $str_alt122$_S_is_not_one_of__S = makeString("~S is not one of ~S");

    static private final SubLList $list_alt124 = list(makeSymbol("IN-PACKAGE"), makeString("CYC"));

    static private final SubLString $str_alt126$__cvs_head_cycorp_cyc_top_tests_ = makeString("~/cvs/head/cycorp/cyc/top/tests/");

    static private final SubLString $str_alt127$_parse_tree_syntax_tests_lisp = makeString("/parse-tree-syntax-tests.lisp");

    static private final SubLString $str_alt128$cyclifier_tests_lisp = makeString("cyclifier-tests.lisp");

    static private final SubLList $list_alt129 = list(makeString("Parse Tree Syntax Test"));

    static private final SubLString $str_alt130$parse_tree = makeString("parse-tree");

    static private final SubLList $list_alt132 = list(makeString("Cyclifier Test"));
}

/**
 * Total time: 498 ms
 */
