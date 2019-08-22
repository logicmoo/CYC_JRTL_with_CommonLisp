package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.control_vars.kb_loaded;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.eval;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.intern;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

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
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class test_case_generator extends SubLTranslatedFile {
    public static final SubLFile me = new test_case_generator();

    public static final String myName = "com.cyc.cycjava.cycl.test_case_generator";

    public static final String myFingerPrint = "f2b523af83910aacd935fe520254223fa8f68f4060f10c1d5e0b86fc9dc905e6";

    // defparameter
    private static final SubLSymbol $parse_tree_test_directory$ = makeSymbol("*PARSE-TREE-TEST-DIRECTORY*");

    // defparameter
    private static final SubLSymbol $parse_tree_syntax_test_file$ = makeSymbol("*PARSE-TREE-SYNTAX-TEST-FILE*");

    // defparameter
    private static final SubLSymbol $cyclifier_test_file$ = makeSymbol("*CYCLIFIER-TEST-FILE*");







    public static final SubLString $str3$No_such_file___a = makeString("No such file: ~a");



    public static final SubLString $str5$Unable_to_open__S = makeString("Unable to open ~S");

    public static final SubLString $$$Appending_test_cases_to_ = makeString("Appending test cases to ");

    public static final SubLString $str7$___ = makeString("...");



    public static final SubLString $str9$_ = makeString(";");



    public static final SubLSymbol GET_TEST_CASE_DEF = makeSymbol("GET-TEST-CASE-DEF");

    public static final SubLSymbol GET_TEST_CASE_COMMENT = makeSymbol("GET-TEST-CASE-COMMENT");

    public static final SubLString $$$Appending_test_case_to_ = makeString("Appending test case to ");

    public static final SubLSymbol TEST_CASE_GENERATOR = makeSymbol("TEST-CASE-GENERATOR");



    public static final SubLList $list16 = list(new SubLObject[]{ list(makeSymbol("MODULE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("SYSTEM"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CATEGORIES"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DATUM"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("NAME"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("NEW"), list(makeSymbol("MODULE"), makeSymbol("SYSTEM"), makeSymbol("DATUM"), makeSymbol("CATEGORIES")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TEST-CASE-DEF"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SETUP-DEF"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CLEANUP-DEF"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-METHOD-DEFS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-METHOD-DECLS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TEST-CASE-DECL"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TEST-CASE-COMMENT"), NIL, makeKeyword("PROTECTED")) });













    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_TEST_CASE_GENERATOR_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TEST-CASE-GENERATOR-CLASS");





    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_TEST_CASE_GENERATOR_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TEST-CASE-GENERATOR-INSTANCE");

    public static final SubLList $list27 = list(makeKeyword("PUBLIC"));

    public static final SubLList $list28 = list(makeSymbol("MODULE0"), makeSymbol("SYSTEM0"), makeSymbol("DATUM0"), makeSymbol("CATEGORIES0"));

    public static final SubLList $list29 = list(makeString("@param MODULE0 stringp; the module of the test case\n   @param SYSTEM0 stringp; the system of the test case\n   @param DATUM0 objectp; the datum for which to generate the test case\n   @param CATEGORIES listp; the categories the test case belongs to\n   @return test-case-generator; a new test case generator for MODULE0 in SYSTEM0 belonging\n   to CATEGORIES0 and generating tests operating on DATA0"), list(makeSymbol("CHECK-TYPE"), makeSymbol("CATEGORIES0"), makeSymbol("LISTP")), list(makeSymbol("CLET"), list(list(makeSymbol("GENERATOR"), list(makeSymbol("NEW-CLASS-INSTANCE"), makeSymbol("SELF")))), list(makeSymbol("SET-TEST-CASE-GENERATOR-MODULE"), makeSymbol("GENERATOR"), makeSymbol("MODULE0")), list(makeSymbol("SET-TEST-CASE-GENERATOR-SYSTEM"), makeSymbol("GENERATOR"), makeSymbol("SYSTEM0")), list(makeSymbol("SET-TEST-CASE-GENERATOR-DATUM"), makeSymbol("GENERATOR"), makeSymbol("DATUM0")), list(makeSymbol("SET-TEST-CASE-GENERATOR-CATEGORIES"), makeSymbol("GENERATOR"), makeSymbol("CATEGORIES0")), list(makeSymbol("SET-TEST-CASE-GENERATOR-NAME"), makeSymbol("GENERATOR"), list(makeSymbol("NEW-TEST-CASE-NAME"))), list(makeSymbol("RET"), makeSymbol("GENERATOR"))));

    public static final SubLSymbol TEST_CASE_GENERATOR_NEW_METHOD = makeSymbol("TEST-CASE-GENERATOR-NEW-METHOD");

    public static final SubLList $list31 = list(makeString("@return values; 1. a declaration of the test case and methods\n                   2. a definition of the test case and methods"), list(makeSymbol("CLET"), list(list(makeSymbol("METHOD-DEFINITIONS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-METHOD-DEFS")))), list(makeSymbol("METHOD-DECLARATIONS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-METHOD-DECLS")), makeSymbol("METHOD-DEFINITIONS"))), list(makeSymbol("TEST-CASE-DECLARATION"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-TEST-CASE-DECL")), makeSymbol("METHOD-DECLARATIONS")))), list(makeSymbol("RET"), list(makeSymbol("VALUES"), makeSymbol("TEST-CASE-DECLARATION"), list(makeSymbol("CONS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-SETUP-DEF"))), list(makeSymbol("CONS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-CLEANUP-DEF"))), makeSymbol("METHOD-DEFINITIONS")))))));

    public static final SubLSymbol GET_METHOD_DEFS = makeSymbol("GET-METHOD-DEFS");

    public static final SubLSymbol GET_METHOD_DECLS = makeSymbol("GET-METHOD-DECLS");

    public static final SubLSymbol GET_TEST_CASE_DECL = makeSymbol("GET-TEST-CASE-DECL");

    public static final SubLSymbol GET_SETUP_DEF = makeSymbol("GET-SETUP-DEF");

    public static final SubLSymbol GET_CLEANUP_DEF = makeSymbol("GET-CLEANUP-DEF");

    public static final SubLSymbol TEST_CASE_GENERATOR_GET_TEST_CASE_DEF_METHOD = makeSymbol("TEST-CASE-GENERATOR-GET-TEST-CASE-DEF-METHOD");

    public static final SubLList $list38 = list(makeKeyword("PROTECTED"));

    public static final SubLList $list39 = list(makeString("@return listp; a definition of a setup method"), list(makeSymbol("RET"), list(makeSymbol("BQ-LIST*"), list(makeSymbol("QUOTE"), makeSymbol("DEF-SETUP-METHOD")), list(makeSymbol("BQ-CONS"), makeSymbol("NAME"), list(makeSymbol("QUOTE"), list(makeKeyword("PROTECTED")))), list(makeSymbol("QUOTE"), list(NIL, list(makeSymbol("RET"), NIL))))));

    public static final SubLSymbol $sym40$OUTER_CATCH_FOR_TEST_CASE_GENERATOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-CASE-GENERATOR-METHOD");

    public static final SubLSymbol DEF_SETUP_METHOD = makeSymbol("DEF-SETUP-METHOD");

    public static final SubLList $list42 = list(NIL, list(makeSymbol("RET"), NIL));

    public static final SubLSymbol TEST_CASE_GENERATOR_GET_SETUP_DEF_METHOD = makeSymbol("TEST-CASE-GENERATOR-GET-SETUP-DEF-METHOD");

    public static final SubLList $list44 = list(makeString("@return listp; a definition of a cleanup method"), list(makeSymbol("RET"), list(makeSymbol("BQ-LIST*"), list(makeSymbol("QUOTE"), makeSymbol("DEF-CLEANUP-METHOD")), list(makeSymbol("BQ-CONS"), makeSymbol("NAME"), list(makeSymbol("QUOTE"), list(makeKeyword("PROTECTED")))), list(makeSymbol("QUOTE"), list(NIL, list(makeSymbol("RET"), NIL))))));

    public static final SubLSymbol $sym45$OUTER_CATCH_FOR_TEST_CASE_GENERATOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-CASE-GENERATOR-METHOD");

    public static final SubLSymbol DEF_CLEANUP_METHOD = makeSymbol("DEF-CLEANUP-METHOD");

    public static final SubLSymbol TEST_CASE_GENERATOR_GET_CLEANUP_DEF_METHOD = makeSymbol("TEST-CASE-GENERATOR-GET-CLEANUP-DEF-METHOD");

    public static final SubLList $list48 = list(makeSymbol("METHOD-DEFINITIONS"));

    public static final SubLList $list49 = list(makeString("@return listp; a list of method declarations for each method in METHOD-DEFINITIONS"), list(makeSymbol("CLET"), list(list(makeSymbol("DECLARATIONS"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("METHOD-DEF"), makeSymbol("METHOD-DEFINITIONS")), list(makeSymbol("CLET"), list(list(makeSymbol("METHOD-NAME"), list(makeSymbol("FIRST"), list(makeSymbol("SECOND"), makeSymbol("METHOD-DEF"))))), list(makeSymbol("CPUSH"), list(makeSymbol("BQ-LIST*"), list(makeSymbol("QUOTE"), makeSymbol("DEF-INSTANCE-METHOD")), makeSymbol("METHOD-NAME"), list(makeSymbol("QUOTE"), list(NIL, makeKeyword("PROTECTED")))), makeSymbol("DECLARATIONS")))), list(makeSymbol("RET"), list(makeSymbol("NREVERSE"), makeSymbol("DECLARATIONS")))));



    public static final SubLList $list51 = list(NIL, makeKeyword("PROTECTED"));

    public static final SubLSymbol TEST_CASE_GENERATOR_GET_METHOD_DECLS_METHOD = makeSymbol("TEST-CASE-GENERATOR-GET-METHOD-DECLS-METHOD");

    public static final SubLList $list53 = list(makeString("@return stringp; a comment string for the test case this generator generates"), list(makeSymbol("RET"), list(new SubLObject[]{ makeSymbol("FORMAT"), NIL, makeString(";;;;~%;; TEST: ~a~%;; CATEGORIES: ~a~%;;~%;; DATE: ~a~%;; REVISION: ~a~%;; KB: ~a.~a~%;; USER: ~a~%;;;;~%"), makeSymbol("DATUM"), makeSymbol("CATEGORIES"), list(makeSymbol("GET-UNIVERSAL-DATE")), list(makeSymbol("CYC-REVISION-STRING")), list(makeSymbol("KB-LOADED")), list(makeSymbol("REMOTE-OPS-PROCESSED")), list(makeSymbol("GET-USER-NAME")) })));

    public static final SubLSymbol $sym54$OUTER_CATCH_FOR_TEST_CASE_GENERATOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-CASE-GENERATOR-METHOD");

    public static final SubLString $str55$_________TEST___a_____CATEGORIES_ = makeString(";;;;~%;; TEST: ~a~%;; CATEGORIES: ~a~%;;~%;; DATE: ~a~%;; REVISION: ~a~%;; KB: ~a.~a~%;; USER: ~a~%;;;;~%");

    public static final SubLSymbol TEST_CASE_GENERATOR_GET_TEST_CASE_COMMENT_METHOD = makeSymbol("TEST-CASE-GENERATOR-GET-TEST-CASE-COMMENT-METHOD");

    public static final SubLSymbol CYCLIFIER_TEST_CASE_GENERATOR = makeSymbol("CYCLIFIER-TEST-CASE-GENERATOR");

    public static final SubLList $list58 = list(list(makeSymbol("PARSE-EXPRESSION"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("NEW"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TEST-CASE-DECL"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-METHOD-DEFS"), NIL, makeKeyword("PROTECTED")));



    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYCLIFIER_TEST_CASE_GENERATOR_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYCLIFIER-TEST-CASE-GENERATOR-CLASS");

    public static final SubLSymbol $sym61$SUBLOOP_RESERVED_INITIALIZE_CYCLIFIER_TEST_CASE_GENERATOR_INSTANC = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYCLIFIER-TEST-CASE-GENERATOR-INSTANCE");

    public static final SubLList $list62 = list(makeString("@param MODULE0 stringp; the module of the test case\n   @param SYSTEM0 stringp; the system of the test case\n   @param DATUM0 objectp; the datum for which to generate the test case\n   @param CATEGORIES listp; the categories the test case belongs to\n   @return test-case-generator; a new test case generator for MODULE0 in SYSTEM0 belonging\n   to CATEGORIES0 and generating tests operating on DATA0"), list(makeSymbol("CLET"), list(list(makeSymbol("GENERATOR"), list(makeSymbol("FUNCALL-CLASS-SUPER-METHOD"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("NEW")), makeSymbol("MODULE0"), makeSymbol("SYSTEM0"), makeSymbol("DATUM0"), makeSymbol("CATEGORIES0")))), list(makeSymbol("SET-CYCLIFIER-TEST-CASE-GENERATOR-PARSE-EXPRESSION"), makeSymbol("GENERATOR"), list(makeSymbol("SECOND"), list(makeSymbol("FIRST"), list(makeSymbol("CHARNIAK-PARSE"), makeSymbol("DATUM0"))))), list(makeSymbol("RET"), makeSymbol("GENERATOR"))));

    public static final SubLSymbol CYCLIFIER_TEST_CASE_GENERATOR_NEW_METHOD = makeSymbol("CYCLIFIER-TEST-CASE-GENERATOR-NEW-METHOD");

    public static final SubLList $list64 = list(makeSymbol("METHOD-DECLARATIONS"));

    public static final SubLList $list65 = list(makeString("@return values; 1. a declaration of the test case and methods\n                     2. a definition of the test case and methods"), list(makeSymbol("RET"), list(makeSymbol("BQ-LIST*"), list(makeSymbol("QUOTE"), makeSymbol("DEFINE-TEST-CASE")), list(makeSymbol("BQ-LIST"), makeSymbol("NAME"), makeSymbol("MODULE"), makeSymbol("SYSTEM"), makeKeyword("CATEGORIES"), list(makeSymbol("BQ-LIST"), list(makeSymbol("QUOTE"), makeSymbol("QUOTE")), makeSymbol("CATEGORIES"))), list(makeSymbol("BQ-LIST"), list(makeSymbol("QUOTE"), makeSymbol("PARSE-TREE")), makeKeyword("INSTANCE"), makeKeyword("PRIVATE"), makeKeyword("VALUE"), list(makeSymbol("BQ-LIST"), list(makeSymbol("QUOTE"), makeSymbol("NEW-PARSE-TREE")), list(makeSymbol("BQ-LIST"), list(makeSymbol("QUOTE"), makeSymbol("QUOTE")), makeSymbol("PARSE-EXPRESSION")))), list(makeSymbol("QUOTE"), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SETUP"), NIL, makeKeyword("PROTECTED"))), list(makeSymbol("QUOTE"), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEANUP"), NIL, makeKeyword("PROTECTED"))), list(makeSymbol("BQ-APPEND"), makeSymbol("METHOD-DECLARATIONS"), NIL))));

    public static final SubLSymbol $sym66$OUTER_CATCH_FOR_CYCLIFIER_TEST_CASE_GENERATOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYCLIFIER-TEST-CASE-GENERATOR-METHOD");

    public static final SubLSymbol DEFINE_TEST_CASE = makeSymbol("DEFINE-TEST-CASE");















    public static final SubLList $list75 = list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SETUP"), NIL, makeKeyword("PROTECTED"));

    public static final SubLList $list76 = list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEANUP"), NIL, makeKeyword("PROTECTED"));

    public static final SubLSymbol CYCLIFIER_TEST_CASE_GENERATOR_GET_TEST_CASE_DECL_METHOD = makeSymbol("CYCLIFIER-TEST-CASE-GENERATOR-GET-TEST-CASE-DECL-METHOD");

    public static final SubLList $list78 = list(makeString("@return listp; a list of definitions of all test methods"), list(makeSymbol("CLET"), list(list(makeSymbol("METHOD-NAME"), list(makeSymbol("INTERN"), makeString("TEST-1"))), list(makeSymbol("CYCLS"), list(makeSymbol("FIM"), list(makeSymbol("NEW-PARSE-TREE"), makeSymbol("PARSE-EXPRESSION")), list(makeSymbol("QUOTE"), makeSymbol("CYCLIFY")))), list(makeSymbol("METHOD-BODY"), list(makeSymbol("BQ-LIST*"), list(makeSymbol("QUOTE"), makeSymbol("FAIL-UNLESS-EQUAL")), list(makeSymbol("QUOTE"), makeSymbol("SELF")), list(makeSymbol("BQ-LIST"), list(makeSymbol("QUOTE"), makeSymbol("QUOTE")), makeSymbol("CYCLS")), list(makeSymbol("QUOTE"), list(makeSymbol("FIM"), makeSymbol("PARSE-TREE"), list(makeSymbol("QUOTE"), makeSymbol("CYCLIFY")))), list(makeSymbol("CCONCATENATE"), makeString("(cyclify \""), makeSymbol("DATUM"), makeString("\") =/= "), list(makeSymbol("PRINC-TO-STRING"), makeSymbol("CYCLS"))), list(makeSymbol("QUOTE"), list(list(makeSymbol("QUOTE"), makeSymbol("CYCLS-EQUAL-P"))))))), list(makeSymbol("RET"), list(makeSymbol("BQ-LIST"), list(makeSymbol("BQ-LIST"), list(makeSymbol("QUOTE"), makeSymbol("DEF-TEST-METHOD")), list(makeSymbol("BQ-LIST*"), makeSymbol("METHOD-NAME"), makeSymbol("NAME"), list(makeSymbol("QUOTE"), list(makeKeyword("PROTECTED")))), NIL, makeSymbol("METHOD-BODY"))))));

    public static final SubLSymbol $sym79$OUTER_CATCH_FOR_CYCLIFIER_TEST_CASE_GENERATOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYCLIFIER-TEST-CASE-GENERATOR-METHOD");

    public static final SubLString $str80$TEST_1 = makeString("TEST-1");



    public static final SubLSymbol FAIL_UNLESS_EQUAL = makeSymbol("FAIL-UNLESS-EQUAL");



    public static final SubLList $list84 = list(makeSymbol("FIM"), makeSymbol("PARSE-TREE"), list(makeSymbol("QUOTE"), makeSymbol("CYCLIFY")));

    public static final SubLString $str85$_cyclify__ = makeString("(cyclify \"");

    public static final SubLString $str86$_______ = makeString("\") =/= ");

    public static final SubLList $list87 = list(list(makeSymbol("QUOTE"), makeSymbol("CYCLS-EQUAL-P")));

    public static final SubLSymbol DEF_TEST_METHOD = makeSymbol("DEF-TEST-METHOD");

    public static final SubLSymbol CYCLIFIER_TEST_CASE_GENERATOR_GET_METHOD_DEFS_METHOD = makeSymbol("CYCLIFIER-TEST-CASE-GENERATOR-GET-METHOD-DEFS-METHOD");

    public static final SubLSymbol PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR = makeSymbol("PARSE-TREE-SYNTAX-TEST-CASE-GENERATOR");

    public static final SubLSymbol $sym91$SUBLOOP_RESERVED_INITIALIZE_PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PARSE-TREE-SYNTAX-TEST-CASE-GENERATOR-CLASS");

    public static final SubLSymbol $sym92$SUBLOOP_RESERVED_INITIALIZE_PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PARSE-TREE-SYNTAX-TEST-CASE-GENERATOR-INSTANCE");

    public static final SubLSymbol PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR_NEW_METHOD = makeSymbol("PARSE-TREE-SYNTAX-TEST-CASE-GENERATOR-NEW-METHOD");

    public static final SubLList $list94 = list(makeString("@return values; 1. a declaration of the test case and methods\n                     2. a definition of the test case and methods"), list(makeSymbol("RET"), list(makeSymbol("BQ-LIST*"), list(makeSymbol("QUOTE"), makeSymbol("DEFINE-TEST-CASE")), list(makeSymbol("BQ-LIST"), makeSymbol("NAME"), makeSymbol("MODULE"), makeSymbol("SYSTEM"), makeKeyword("CATEGORIES"), list(makeSymbol("BQ-LIST"), list(makeSymbol("QUOTE"), makeSymbol("QUOTE")), makeSymbol("CATEGORIES"))), list(makeSymbol("BQ-LIST"), list(makeSymbol("QUOTE"), makeSymbol("PARSE-TREE")), makeKeyword("CLASS"), makeKeyword("PRIVATE"), makeKeyword("VALUE"), list(makeSymbol("BQ-LIST"), list(makeSymbol("QUOTE"), makeSymbol("PROCESS-MODIFIERS")), list(makeSymbol("BQ-LIST"), list(makeSymbol("QUOTE"), makeSymbol("NEW-PARSE-TREE")), list(makeSymbol("BQ-LIST"), list(makeSymbol("QUOTE"), makeSymbol("QUOTE")), makeSymbol("PARSE-EXPRESSION"))))), list(makeSymbol("QUOTE"), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SETUP"), NIL, makeKeyword("PROTECTED"))), list(makeSymbol("QUOTE"), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEANUP"), NIL, makeKeyword("PROTECTED"))), list(makeSymbol("BQ-APPEND"), makeSymbol("METHOD-DECLARATIONS"), NIL))));

    public static final SubLSymbol $sym95$OUTER_CATCH_FOR_PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-PARSE-TREE-SYNTAX-TEST-CASE-GENERATOR-METHOD");



    public static final SubLSymbol PROCESS_MODIFIERS = makeSymbol("PROCESS-MODIFIERS");

    public static final SubLSymbol PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR_GET_TEST_CASE_DECL_METHOD = makeSymbol("PARSE-TREE-SYNTAX-TEST-CASE-GENERATOR-GET-TEST-CASE-DECL-METHOD");

    public static final SubLList $list99 = list(makeString("@return listp; a list of definitions of all test methods"), list(makeSymbol("CLET"), list(list(makeSymbol("PARSE-TREE"), list(makeSymbol("PROCESS-MODIFIERS"), list(makeSymbol("NEW-PARSE-TREE"), makeSymbol("PARSE-EXPRESSION")))), list(makeSymbol("TEST-DATA"), list(makeSymbol("GET-PARSE-TREE-TEST-DATA-RECURSIVELY"), makeSymbol("PARSE-TREE"), list(makeSymbol("QUOTE"), list(list(makeSymbol("GET-COMPLEMENTS")), list(makeSymbol("GET-MODIFIERS")))))), list(makeSymbol("I"), ZERO_INTEGER), list(makeSymbol("METHOD-DEFINITIONS"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("TEST-DATUM"), makeSymbol("TEST-DATA")), list(makeSymbol("CINC"), makeSymbol("I")), list(makeSymbol("CLET"), list(list(makeSymbol("METHOD-NAME"), list(makeSymbol("INTERN"), list(makeSymbol("CCONCATENATE"), makeString("TEST-"), list(makeSymbol("PRINC-TO-STRING"), makeSymbol("I"))))), list(makeSymbol("METHOD-BODY"), list(makeSymbol("NEW-FAIL-UNLESS-CALL"), makeSymbol("TEST-DATUM"), makeSymbol("PARSE-TREE")))), list(makeSymbol("CPUSH"), list(makeSymbol("BQ-LIST"), list(makeSymbol("QUOTE"), makeSymbol("DEF-TEST-METHOD")), list(makeSymbol("BQ-LIST*"), makeSymbol("METHOD-NAME"), makeSymbol("NAME"), list(makeSymbol("QUOTE"), list(makeKeyword("PROTECTED")))), NIL, makeSymbol("METHOD-BODY")), makeSymbol("METHOD-DEFINITIONS")))), list(makeSymbol("RET"), list(makeSymbol("NREVERSE"), makeSymbol("METHOD-DEFINITIONS")))));

    public static final SubLSymbol $sym100$OUTER_CATCH_FOR_PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-PARSE-TREE-SYNTAX-TEST-CASE-GENERATOR-METHOD");

    public static final SubLList $list101 = list(list(makeSymbol("GET-COMPLEMENTS")), list(makeSymbol("GET-MODIFIERS")));

    public static final SubLString $str102$TEST_ = makeString("TEST-");

    public static final SubLSymbol PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR_GET_METHOD_DEFS_METHOD = makeSymbol("PARSE-TREE-SYNTAX-TEST-CASE-GENERATOR-GET-METHOD-DEFS-METHOD");



    public static final SubLList $list105 = list(makeSymbol("QUOTE"), makeSymbol("GET-DESCENDANT"));



    public static final SubLList $list107 = list(list(makeSymbol("QUOTE"), EQUAL));



    public static final SubLString $str109$_ = makeString("(");

    public static final SubLString $$$_ = makeString(" ");

    public static final SubLString $str111$__ = makeString(" (");





    public static final SubLString $str114$_ = makeString(")");

    public static final SubLString $str115$______ = makeString(") =/= ");

    public static final SubLString $str116$_ = makeString(".");

    public static final SubLString $str117$TEST_CASE_ = makeString("TEST-CASE-");

    public static final SubLSymbol IMPLEMENTS_METHOD_P = makeSymbol("IMPLEMENTS-METHOD-P");

    public static final SubLSymbol GET_PATH = makeSymbol("GET-PATH");





    public static final SubLString $str122$_S_is_not_one_of__S = makeString("~S is not one of ~S");



    public static final SubLList $list124 = list(makeSymbol("IN-PACKAGE"), makeString("CYC"));

    public static final SubLSymbol $sym125$EQUALS_EL_ = makeSymbol("EQUALS-EL?");

    public static final SubLString $str126$__cvs_head_cycorp_cyc_top_tests_ = makeString("~/cvs/head/cycorp/cyc/top/tests/");

    public static final SubLString $str127$_parse_tree_syntax_tests_lisp = makeString("/parse-tree-syntax-tests.lisp");

    public static final SubLString $str128$cyclifier_tests_lisp = makeString("cyclifier-tests.lisp");

    public static final SubLList $list129 = list(makeString("Parse Tree Syntax Test"));

    public static final SubLString $str130$parse_tree = makeString("parse-tree");

    public static final SubLString $$$cycl = makeString("cycl");

    public static final SubLList $list132 = list(makeString("Cyclifier Test"));

    public static SubLObject add_test_cases(final SubLObject generator_class, final SubLObject module, final SubLObject system, final SubLObject categories, final SubLObject in_file, final SubLObject out_file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != symbolp(generator_class) : "Types.symbolp(generator_class) " + "CommonSymbols.NIL != Types.symbolp(generator_class) " + generator_class;
        assert NIL != stringp(module) : "Types.stringp(module) " + "CommonSymbols.NIL != Types.stringp(module) " + module;
        assert NIL != stringp(system) : "Types.stringp(system) " + "CommonSymbols.NIL != Types.stringp(system) " + system;
        assert NIL != listp(categories) : "Types.listp(categories) " + "CommonSymbols.NIL != Types.listp(categories) " + categories;
        assert NIL != stringp(in_file) : "Types.stringp(in_file) " + "CommonSymbols.NIL != Types.stringp(in_file) " + in_file;
        assert NIL != stringp(out_file) : "Types.stringp(out_file) " + "CommonSymbols.NIL != Types.stringp(out_file) " + out_file;
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

    public static SubLObject add_test_case(final SubLObject generator_class, final SubLObject module, final SubLObject system, final SubLObject categories, final SubLObject datum, final SubLObject out_file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != symbolp(generator_class) : "Types.symbolp(generator_class) " + "CommonSymbols.NIL != Types.symbolp(generator_class) " + generator_class;
        assert NIL != stringp(module) : "Types.stringp(module) " + "CommonSymbols.NIL != Types.stringp(module) " + module;
        assert NIL != stringp(system) : "Types.stringp(system) " + "CommonSymbols.NIL != Types.stringp(system) " + system;
        assert NIL != listp(categories) : "Types.listp(categories) " + "CommonSymbols.NIL != Types.listp(categories) " + categories;
        assert NIL != stringp(out_file) : "Types.stringp(out_file) " + "CommonSymbols.NIL != Types.stringp(out_file) " + out_file;
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

    public static SubLObject get_test_case_generator_name(final SubLObject v_test_case_generator) {
        return classes.subloop_get_access_protected_instance_slot(v_test_case_generator, FIVE_INTEGER, NAME);
    }

    public static SubLObject set_test_case_generator_name(final SubLObject v_test_case_generator, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_test_case_generator, value, FIVE_INTEGER, NAME);
    }

    public static SubLObject get_test_case_generator_datum(final SubLObject v_test_case_generator) {
        return classes.subloop_get_access_protected_instance_slot(v_test_case_generator, FOUR_INTEGER, DATUM);
    }

    public static SubLObject set_test_case_generator_datum(final SubLObject v_test_case_generator, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_test_case_generator, value, FOUR_INTEGER, DATUM);
    }

    public static SubLObject get_test_case_generator_categories(final SubLObject v_test_case_generator) {
        return classes.subloop_get_access_protected_instance_slot(v_test_case_generator, THREE_INTEGER, CATEGORIES);
    }

    public static SubLObject set_test_case_generator_categories(final SubLObject v_test_case_generator, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_test_case_generator, value, THREE_INTEGER, CATEGORIES);
    }

    public static SubLObject get_test_case_generator_system(final SubLObject v_test_case_generator) {
        return classes.subloop_get_access_protected_instance_slot(v_test_case_generator, TWO_INTEGER, SYSTEM);
    }

    public static SubLObject set_test_case_generator_system(final SubLObject v_test_case_generator, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_test_case_generator, value, TWO_INTEGER, SYSTEM);
    }

    public static SubLObject get_test_case_generator_module(final SubLObject v_test_case_generator) {
        return classes.subloop_get_access_protected_instance_slot(v_test_case_generator, ONE_INTEGER, MODULE);
    }

    public static SubLObject set_test_case_generator_module(final SubLObject v_test_case_generator, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_test_case_generator, value, ONE_INTEGER, MODULE);
    }

    public static SubLObject subloop_reserved_initialize_test_case_generator_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
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

    public static SubLObject test_case_generator_p(final SubLObject v_test_case_generator) {
        return classes.subloop_instanceof_class(v_test_case_generator, TEST_CASE_GENERATOR);
    }

    public static SubLObject test_case_generator_new_method(final SubLObject self, final SubLObject module0, final SubLObject system0, final SubLObject datum0, final SubLObject categories0) {
        assert NIL != listp(categories0) : "Types.listp(categories0) " + "CommonSymbols.NIL != Types.listp(categories0) " + categories0;
        final SubLObject generator = object.new_class_instance(self);
        set_test_case_generator_module(generator, module0);
        set_test_case_generator_system(generator, system0);
        set_test_case_generator_datum(generator, datum0);
        set_test_case_generator_categories(generator, categories0);
        set_test_case_generator_name(generator, new_test_case_name());
        return generator;
    }

    public static SubLObject test_case_generator_get_test_case_def_method(final SubLObject self) {
        final SubLObject method_definitions = methods.funcall_instance_method_with_0_args(self, GET_METHOD_DEFS);
        final SubLObject method_declarations = methods.funcall_instance_method_with_1_args(self, GET_METHOD_DECLS, method_definitions);
        final SubLObject test_case_declaration = methods.funcall_instance_method_with_1_args(self, GET_TEST_CASE_DECL, method_declarations);
        return values(test_case_declaration, cons(methods.funcall_instance_method_with_0_args(self, GET_SETUP_DEF), cons(methods.funcall_instance_method_with_0_args(self, GET_CLEANUP_DEF), method_definitions)));
    }

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

    public static SubLObject get_cyclifier_test_case_generator_parse_expression(final SubLObject cyclifier_test_case_generator) {
        return classes.subloop_get_access_protected_instance_slot(cyclifier_test_case_generator, SIX_INTEGER, PARSE_EXPRESSION);
    }

    public static SubLObject set_cyclifier_test_case_generator_parse_expression(final SubLObject cyclifier_test_case_generator, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyclifier_test_case_generator, value, SIX_INTEGER, PARSE_EXPRESSION);
    }

    public static SubLObject subloop_reserved_initialize_cyclifier_test_case_generator_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
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

    public static SubLObject cyclifier_test_case_generator_p(final SubLObject cyclifier_test_case_generator) {
        return classes.subloop_instanceof_class(cyclifier_test_case_generator, CYCLIFIER_TEST_CASE_GENERATOR);
    }

    public static SubLObject cyclifier_test_case_generator_new_method(final SubLObject self, final SubLObject module0, final SubLObject system0, final SubLObject datum0, final SubLObject categories0) {
        final SubLObject generator = methods.funcall_class_super_method_with_4_args(self, NEW, module0, system0, datum0, categories0);
        set_cyclifier_test_case_generator_parse_expression(generator, second(parser.charniak_parse(datum0, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED).first()));
        return generator;
    }

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

    public static SubLObject get_parse_tree_syntax_test_case_generator_parse_expression(final SubLObject parse_tree_syntax_test_case_generator) {
        return classes.subloop_get_access_protected_instance_slot(parse_tree_syntax_test_case_generator, SIX_INTEGER, PARSE_EXPRESSION);
    }

    public static SubLObject set_parse_tree_syntax_test_case_generator_parse_expression(final SubLObject parse_tree_syntax_test_case_generator, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(parse_tree_syntax_test_case_generator, value, SIX_INTEGER, PARSE_EXPRESSION);
    }

    public static SubLObject subloop_reserved_initialize_parse_tree_syntax_test_case_generator_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
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

    public static SubLObject parse_tree_syntax_test_case_generator_p(final SubLObject parse_tree_syntax_test_case_generator) {
        return classes.subloop_instanceof_class(parse_tree_syntax_test_case_generator, PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR);
    }

    public static SubLObject parse_tree_syntax_test_case_generator_new_method(final SubLObject self, final SubLObject module0, final SubLObject system0, final SubLObject datum0, final SubLObject categories0) {
        final SubLObject generator = methods.funcall_class_super_method_with_4_args(self, NEW, module0, system0, datum0, categories0);
        set_cyclifier_test_case_generator_parse_expression(generator, second(parser.charniak_parse(datum0, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED).first()));
        return generator;
    }

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

    public static SubLObject new_test_case_name() {
        return intern(cconcatenate($str117$TEST_CASE_, princ_to_string(get_internal_real_time())), UNPROVIDED);
    }

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

    public static SubLObject eval_test_case(final SubLObject declaration, final SubLObject definitions) {
        eval(declaration);
        Mapping.mapcar(EVAL, definitions);
        return NIL;
    }

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

    public static SubLObject cycls_equal_p(final SubLObject cycls1, final SubLObject cycls2) {
        return makeBoolean(length(cycls1).numE(length(cycls2)) && (NIL != subsetp(cycls1, cycls2, $sym125$EQUALS_EL_, UNPROVIDED)));
    }

    public static SubLObject add_syntax_test_cases(final SubLObject in_file, SubLObject out_file, SubLObject categories) {
        if (out_file == UNPROVIDED) {
            out_file = $parse_tree_syntax_test_file$.getDynamicValue();
        }
        if (categories == UNPROVIDED) {
            categories = $list129;
        }
        return add_test_cases(PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR, $str130$parse_tree, $$$cycl, categories, in_file, out_file);
    }

    public static SubLObject add_syntax_test_case(final SubLObject sentence, SubLObject out_file, SubLObject categories) {
        if (out_file == UNPROVIDED) {
            out_file = $parse_tree_syntax_test_file$.getDynamicValue();
        }
        if (categories == UNPROVIDED) {
            categories = $list129;
        }
        return add_test_case(PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR, $str130$parse_tree, $$$cycl, categories, sentence, out_file);
    }

    public static SubLObject add_cyclifier_test_cases(final SubLObject in_file, SubLObject out_file, SubLObject categories) {
        if (out_file == UNPROVIDED) {
            out_file = $cyclifier_test_file$.getDynamicValue();
        }
        if (categories == UNPROVIDED) {
            categories = $list132;
        }
        return add_test_cases(CYCLIFIER_TEST_CASE_GENERATOR, $str130$parse_tree, $$$cycl, categories, in_file, out_file);
    }

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
        declareFunction(me, "add_test_cases", "ADD-TEST-CASES", 6, 0, false);
        declareFunction(me, "add_test_case", "ADD-TEST-CASE", 6, 0, false);
        declareFunction(me, "get_test_case_generator_name", "GET-TEST-CASE-GENERATOR-NAME", 1, 0, false);
        declareFunction(me, "set_test_case_generator_name", "SET-TEST-CASE-GENERATOR-NAME", 2, 0, false);
        declareFunction(me, "get_test_case_generator_datum", "GET-TEST-CASE-GENERATOR-DATUM", 1, 0, false);
        declareFunction(me, "set_test_case_generator_datum", "SET-TEST-CASE-GENERATOR-DATUM", 2, 0, false);
        declareFunction(me, "get_test_case_generator_categories", "GET-TEST-CASE-GENERATOR-CATEGORIES", 1, 0, false);
        declareFunction(me, "set_test_case_generator_categories", "SET-TEST-CASE-GENERATOR-CATEGORIES", 2, 0, false);
        declareFunction(me, "get_test_case_generator_system", "GET-TEST-CASE-GENERATOR-SYSTEM", 1, 0, false);
        declareFunction(me, "set_test_case_generator_system", "SET-TEST-CASE-GENERATOR-SYSTEM", 2, 0, false);
        declareFunction(me, "get_test_case_generator_module", "GET-TEST-CASE-GENERATOR-MODULE", 1, 0, false);
        declareFunction(me, "set_test_case_generator_module", "SET-TEST-CASE-GENERATOR-MODULE", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_test_case_generator_class", "SUBLOOP-RESERVED-INITIALIZE-TEST-CASE-GENERATOR-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_test_case_generator_instance", "SUBLOOP-RESERVED-INITIALIZE-TEST-CASE-GENERATOR-INSTANCE", 1, 0, false);
        declareFunction(me, "test_case_generator_p", "TEST-CASE-GENERATOR-P", 1, 0, false);
        declareFunction(me, "test_case_generator_new_method", "TEST-CASE-GENERATOR-NEW-METHOD", 5, 0, false);
        declareFunction(me, "test_case_generator_get_test_case_def_method", "TEST-CASE-GENERATOR-GET-TEST-CASE-DEF-METHOD", 1, 0, false);
        declareFunction(me, "test_case_generator_get_setup_def_method", "TEST-CASE-GENERATOR-GET-SETUP-DEF-METHOD", 1, 0, false);
        declareFunction(me, "test_case_generator_get_cleanup_def_method", "TEST-CASE-GENERATOR-GET-CLEANUP-DEF-METHOD", 1, 0, false);
        declareFunction(me, "test_case_generator_get_method_decls_method", "TEST-CASE-GENERATOR-GET-METHOD-DECLS-METHOD", 2, 0, false);
        declareFunction(me, "test_case_generator_get_test_case_comment_method", "TEST-CASE-GENERATOR-GET-TEST-CASE-COMMENT-METHOD", 1, 0, false);
        declareFunction(me, "get_cyclifier_test_case_generator_parse_expression", "GET-CYCLIFIER-TEST-CASE-GENERATOR-PARSE-EXPRESSION", 1, 0, false);
        declareFunction(me, "set_cyclifier_test_case_generator_parse_expression", "SET-CYCLIFIER-TEST-CASE-GENERATOR-PARSE-EXPRESSION", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_cyclifier_test_case_generator_class", "SUBLOOP-RESERVED-INITIALIZE-CYCLIFIER-TEST-CASE-GENERATOR-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_cyclifier_test_case_generator_instance", "SUBLOOP-RESERVED-INITIALIZE-CYCLIFIER-TEST-CASE-GENERATOR-INSTANCE", 1, 0, false);
        declareFunction(me, "cyclifier_test_case_generator_p", "CYCLIFIER-TEST-CASE-GENERATOR-P", 1, 0, false);
        declareFunction(me, "cyclifier_test_case_generator_new_method", "CYCLIFIER-TEST-CASE-GENERATOR-NEW-METHOD", 5, 0, false);
        declareFunction(me, "cyclifier_test_case_generator_get_test_case_decl_method", "CYCLIFIER-TEST-CASE-GENERATOR-GET-TEST-CASE-DECL-METHOD", 2, 0, false);
        declareFunction(me, "cyclifier_test_case_generator_get_method_defs_method", "CYCLIFIER-TEST-CASE-GENERATOR-GET-METHOD-DEFS-METHOD", 1, 0, false);
        declareFunction(me, "get_parse_tree_syntax_test_case_generator_parse_expression", "GET-PARSE-TREE-SYNTAX-TEST-CASE-GENERATOR-PARSE-EXPRESSION", 1, 0, false);
        declareFunction(me, "set_parse_tree_syntax_test_case_generator_parse_expression", "SET-PARSE-TREE-SYNTAX-TEST-CASE-GENERATOR-PARSE-EXPRESSION", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_parse_tree_syntax_test_case_generator_class", "SUBLOOP-RESERVED-INITIALIZE-PARSE-TREE-SYNTAX-TEST-CASE-GENERATOR-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_parse_tree_syntax_test_case_generator_instance", "SUBLOOP-RESERVED-INITIALIZE-PARSE-TREE-SYNTAX-TEST-CASE-GENERATOR-INSTANCE", 1, 0, false);
        declareFunction(me, "parse_tree_syntax_test_case_generator_p", "PARSE-TREE-SYNTAX-TEST-CASE-GENERATOR-P", 1, 0, false);
        declareFunction(me, "parse_tree_syntax_test_case_generator_new_method", "PARSE-TREE-SYNTAX-TEST-CASE-GENERATOR-NEW-METHOD", 5, 0, false);
        declareFunction(me, "parse_tree_syntax_test_case_generator_get_test_case_decl_method", "PARSE-TREE-SYNTAX-TEST-CASE-GENERATOR-GET-TEST-CASE-DECL-METHOD", 2, 0, false);
        declareFunction(me, "parse_tree_syntax_test_case_generator_get_method_defs_method", "PARSE-TREE-SYNTAX-TEST-CASE-GENERATOR-GET-METHOD-DEFS-METHOD", 1, 0, false);
        declareFunction(me, "new_fail_unless_call", "NEW-FAIL-UNLESS-CALL", 2, 0, false);
        declareFunction(me, "new_syntax_test_failure_explanation", "NEW-SYNTAX-TEST-FAILURE-EXPLANATION", 4, 0, false);
        declareFunction(me, "new_test_case_name", "NEW-TEST-CASE-NAME", 0, 0, false);
        declareFunction(me, "get_parse_tree_test_data", "GET-PARSE-TREE-TEST-DATA", 2, 0, false);
        declareFunction(me, "get_parse_tree_test_data_recursively", "GET-PARSE-TREE-TEST-DATA-RECURSIVELY", 2, 0, false);
        declareFunction(me, "eval_test_case", "EVAL-TEST-CASE", 2, 0, false);
        declareFunction(me, "dump_test_case", "DUMP-TEST-CASE", 4, 0, false);
        declareFunction(me, "cycls_equal_p", "CYCLS-EQUAL-P", 2, 0, false);
        declareFunction(me, "add_syntax_test_cases", "ADD-SYNTAX-TEST-CASES", 1, 2, false);
        declareFunction(me, "add_syntax_test_case", "ADD-SYNTAX-TEST-CASE", 1, 2, false);
        declareFunction(me, "add_cyclifier_test_cases", "ADD-CYCLIFIER-TEST-CASES", 1, 2, false);
        declareFunction(me, "add_cyclifier_test_case", "ADD-CYCLIFIER-TEST-CASE", 1, 2, false);
        return NIL;
    }

    public static SubLObject init_test_case_generator_file() {
        defparameter("*PARSE-TREE-TEST-DIRECTORY*", $str126$__cvs_head_cycorp_cyc_top_tests_);
        defparameter("*PARSE-TREE-SYNTAX-TEST-FILE*", cconcatenate($parse_tree_test_directory$.getDynamicValue(), $str127$_parse_tree_syntax_tests_lisp));
        defparameter("*CYCLIFIER-TEST-FILE*", cconcatenate($parse_tree_test_directory$.getDynamicValue(), $str128$cyclifier_tests_lisp));
        return NIL;
    }

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

    
}

/**
 * Total time: 498 ms
 */
