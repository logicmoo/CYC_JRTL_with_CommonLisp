/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.quirk;


import static com.cyc.cycjava.cycl.classes.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.cyc_kernel.*;
import static com.cyc.cycjava.cycl.cycl_utilities.*;
import static com.cyc.cycjava.cycl.disjoint_with.*;
import static com.cyc.cycjava.cycl.fort_types_interface.*;
import static com.cyc.cycjava.cycl.genls.*;
import static com.cyc.cycjava.cycl.instances.*;
import static com.cyc.cycjava.cycl.isa.*;
import static com.cyc.cycjava.cycl.list_utilities.*;
import static com.cyc.cycjava.cycl.methods.*;
import static com.cyc.cycjava.cycl.mt_relevance_macros.*;
import static com.cyc.cycjava.cycl.number_utilities.*;
import static com.cyc.cycjava.cycl.object.*;
import static com.cyc.cycjava.cycl.parsing_vars.*;
import static com.cyc.cycjava.cycl.psp_main.*;
import static com.cyc.cycjava.cycl.string_utilities.*;
import static com.cyc.cycjava.cycl.subl_promotions.*;
import static com.cyc.cycjava.cycl.subloop_structures.*;
import static com.cyc.cycjava.cycl.wff.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.*;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      FOCUS-ENTITY
 * source file: /cyc/top/cycl/quirk/focus-entity.lisp
 * created:     2019/07/03 17:39:01
 */
public final class focus_entity extends SubLTranslatedFile implements V12 {
    static private final SubLString $str_alt138$ = makeString("");

    public static final SubLFile me = new focus_entity();

 public static final String myName = "com.cyc.cycjava.cycl.quirk.focus_entity";


    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol FOCUS_ENTITY = makeSymbol("FOCUS-ENTITY");

    static private final SubLList $list2 = list(new SubLObject[]{ list(makeSymbol("SALIENCE-PREDICATES"), makeKeyword("CLASS"), makeKeyword("PUBLIC"), makeKeyword("VALUE"), list(QUOTE, list(reader_make_constant_shell("keStrongSuggestion")))), list(makeSymbol("QUERY-PARAMETERS"), makeKeyword("CLASS"), makeKeyword("PUBLIC"), makeKeyword("VALUE"), list(new SubLObject[]{ makeSymbol("LIST"), makeKeyword("MAX-NUMBER"), FIVE_INTEGER, makeKeyword("MAX-TIME"), makeInteger(200), makeKeyword("MAX-TRANSFORMATION-DEPTH"), ONE_INTEGER, makeKeyword("BLOCK?"), NIL, makeKeyword("MAX-PROOF-DEPTH"), NIL, makeKeyword("CACHE-INFERENCE-RESULTS?"), NIL, makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("CONTINUABLE?"), T, makeKeyword("PRODUCTIVITY-LIMIT"), makeInteger(2000000) })), list(makeSymbol("CYC-ENTITY"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("RELEVANT-MT"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("TYPES"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("LEARNED-TYPES"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("ASSERTED-TYPES"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CONTINUABLE-INFERENCE-POOL"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("INFERENCE-POOL-CREATED"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("SALIENT-QUERY-JUSTIFICATIONS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("SALIENT-QUERIES"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("UNANSWERED-QUESTIONS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("ANSWERS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ALL-TYPES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GENERATE-SALIENT-QUERIES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("KB-INTEGRATE"), NIL, makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COMPUTE-SALIENT-QUERIES"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DONE-COMPUTING-SALIENT-QUERIES"), NIL, makeKeyword("PUBLIC")) });

    private static final SubLSymbol UNANSWERED_QUESTIONS = makeSymbol("UNANSWERED-QUESTIONS");

    private static final SubLSymbol SALIENT_QUERY_JUSTIFICATIONS = makeSymbol("SALIENT-QUERY-JUSTIFICATIONS");

    private static final SubLSymbol INFERENCE_POOL_CREATED = makeSymbol("INFERENCE-POOL-CREATED");

    private static final SubLSymbol CONTINUABLE_INFERENCE_POOL = makeSymbol("CONTINUABLE-INFERENCE-POOL");

    private static final SubLSymbol ASSERTED_TYPES = makeSymbol("ASSERTED-TYPES");

    private static final SubLSymbol LEARNED_TYPES = makeSymbol("LEARNED-TYPES");

    private static final SubLSymbol RELEVANT_MT = makeSymbol("RELEVANT-MT");

    private static final SubLSymbol SALIENCE_PREDICATES = makeSymbol("SALIENCE-PREDICATES");

    static private final SubLList $list16 = list(reader_make_constant_shell("keStrongSuggestion"));

    private static final SubLSymbol QUERY_PARAMETERS = makeSymbol("QUERY-PARAMETERS");

    private static final SubLInteger $int$200 = makeInteger(200);

    private static final SubLSymbol $MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");

    private static final SubLSymbol $MAX_PROOF_DEPTH = makeKeyword("MAX-PROOF-DEPTH");

    private static final SubLSymbol $kw24$CACHE_INFERENCE_RESULTS_ = makeKeyword("CACHE-INFERENCE-RESULTS?");

    private static final SubLInteger $int$2000000 = makeInteger(2000000);

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_FOCUS_ENTITY_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-FOCUS-ENTITY-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_FOCUS_ENTITY_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-FOCUS-ENTITY-INSTANCE");

    static private final SubLList $list35 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list36 = list(makeString("@return listp, the list of all Cyc types this entity is know to be an instance of.\n   @owner bertolo"), list(makeSymbol("CLET"), list(list(makeSymbol("RAW"), list(makeSymbol("UNION"), makeSymbol("TYPES"), makeSymbol("LEARNED-TYPES"))), list(makeSymbol("ORGANIZED"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("CANDIDATE-TYPE"), makeSymbol("RAW")), list(makeSymbol("CLET"), list(makeSymbol("FAIL")), list(makeSymbol("CSOME"), list(makeSymbol("EXISTING-TYPE"), makeSymbol("ORGANIZED"), makeSymbol("FAIL")), list(makeSymbol("CSETQ"), makeSymbol("FAIL"), list(makeSymbol("GENL-IN-ANY-MT?"), makeSymbol("EXISTING-TYPE"), makeSymbol("CANDIDATE-TYPE")))), list(makeSymbol("PUNLESS"), makeSymbol("FAIL"), list(makeSymbol("CPUSH"), makeSymbol("CANDIDATE-TYPE"), makeSymbol("ORGANIZED"))))), list(RET, makeSymbol("ORGANIZED"))));

    static private final SubLSymbol $sym37$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-FOCUS-ENTITY-METHOD");

    private static final SubLSymbol FOCUS_ENTITY_ALL_TYPES_METHOD = makeSymbol("FOCUS-ENTITY-ALL-TYPES-METHOD");

    private static final SubLSymbol GENERATE_SALIENT_QUERIES = makeSymbol("GENERATE-SALIENT-QUERIES");

    static private final SubLList $list40 = list(makeString("@return focus-entity-p\n   As a side effect it computes all salient queries for this entity, based on what its type(s) \n   is/are known to be.\n   @owner bertolo"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("KB-INTEGRATE"))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("COMPUTE-SALIENT-JUSTIFICATIONS"))), list(makeSymbol("CSETQ"), makeSymbol("INFERENCE-POOL-CREATED"), T), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym41$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-FOCUS-ENTITY-METHOD");

    private static final SubLSymbol KB_INTEGRATE = makeSymbol("KB-INTEGRATE");

    private static final SubLSymbol COMPUTE_SALIENT_JUSTIFICATIONS = makeSymbol("COMPUTE-SALIENT-JUSTIFICATIONS");

    private static final SubLSymbol FOCUS_ENTITY_GENERATE_SALIENT_QUERIES_METHOD = makeSymbol("FOCUS-ENTITY-GENERATE-SALIENT-QUERIES-METHOD");

    static private final SubLList $list45 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list46 = list(makeString("@return focus-entity-p\n   As a side effect it introduces this entity into the KB, based on what its type(s) \n   is/are known to be.\n   @owner bertolo"), list(makeSymbol("CLET"), list(list(makeSymbol("ALL-TYPES"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ALL-TYPES")))), makeSymbol("MIN-TYPES"), makeSymbol("PRED"), makeSymbol("MT")), list(makeSymbol("WITH-ALL-MTS"), list(makeSymbol("CSETQ"), makeSymbol("MIN-TYPES"), list(makeSymbol("MIN-COLS"), makeSymbol("ALL-TYPES")))), list(makeSymbol("PCOND"), list(list(makeSymbol("MEMBER"), reader_make_constant_shell("Person"), makeSymbol("TYPES")), list(makeSymbol("CSETQ"), makeSymbol("PRED"), reader_make_constant_shell("isa")), list(makeSymbol("CSETQ"), makeSymbol("MT"), reader_make_constant_shell("PeopleDataMt"))), list(list(makeSymbol("MEMBER"), reader_make_constant_shell("Organization"), makeSymbol("TYPES")), list(makeSymbol("CSETQ"), makeSymbol("PRED"), reader_make_constant_shell("isa")), list(makeSymbol("CSETQ"), makeSymbol("MT"), reader_make_constant_shell("OrganizationDataMt"))), list(list(makeSymbol("COLLECTION?"), makeSymbol("CYC-ENTITY")), list(makeSymbol("CSETQ"), makeSymbol("PRED"), reader_make_constant_shell("genls")), list(makeSymbol("CSETQ"), makeSymbol("MT"), reader_make_constant_shell("TREC-Mt")))), list(makeSymbol("CDOLIST"), list(makeSymbol("M-TYPE"), makeSymbol("MIN-TYPES")), list(makeSymbol("CLET"), list(list(makeSymbol("ASSERTION"), list(makeSymbol("BQ-LIST"), makeSymbol("PRED"), makeSymbol("CYC-ENTITY"), makeSymbol("M-TYPE"))), list(makeSymbol("WFF-TEST"), list(makeSymbol("EL-WFF?"), makeSymbol("ASSERTION"), makeSymbol("MT"))), list(makeSymbol("SUCCESS"), list(makeSymbol("FWHEN"), makeSymbol("WFF-TEST"), list(makeSymbol("CYC-ASSERT"), makeSymbol("ASSERTION"), makeSymbol("MT"))))), list(makeSymbol("PWHEN"), makeSymbol("SUCCESS"), list(makeSymbol("CPUSH"), makeSymbol("M-TYPE"), makeSymbol("ASSERTED-TYPES")))))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym47$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-FOCUS-ENTITY-METHOD");















    private static final SubLObject $$TREC_Mt = reader_make_constant_shell("TREC-Mt");

    private static final SubLSymbol FOCUS_ENTITY_KB_INTEGRATE_METHOD = makeSymbol("FOCUS-ENTITY-KB-INTEGRATE-METHOD");

    static private final SubLList $list58 = list(makeString("@return focus-entity-p\n   As a side effect it computes all salient queries for this entity, based on what its type(s) \n   is/are known to be.\n   @owner bertolo"), list(makeSymbol("PUNLESS"), makeSymbol("CYC-ENTITY"), list(RET, makeSymbol("SELF"))), list(makeSymbol("CDOLIST"), list(makeSymbol("PRED"), makeSymbol("SALIENCE-PREDICATES")), list(makeSymbol("CLET"), list(list(makeSymbol("CONT-INF"), list(makeSymbol("NEW-CONTINUABLE-INFERENCE"), list(makeSymbol("BQ-LIST*"), makeSymbol("PRED"), makeSymbol("CYC-ENTITY"), list(QUOTE, list(makeSymbol("?WHAT")))), reader_make_constant_shell("EverythingPSC"))), list(makeSymbol("CONT-INF-STRING"), list(makeSymbol("CCONCATENATE"), makeString("ci-"), list(makeSymbol("FORMAT"), NIL, makeString("~S"), list(makeSymbol("GENSYM"))))), list(makeSymbol("TASK"), list(makeSymbol("NEW-TASK"), makeSymbol("CONT-INF-STRING"), list(QUOTE, makeSymbol("CONTINUE-INFERENCE")), list(makeSymbol("BQ-LIST"), makeSymbol("CONT-INF"), makeSymbol("QUERY-PARAMETERS"))))), list(makeSymbol("CPUSH"), list(makeSymbol("LIST"), makeSymbol("TASK"), makeSymbol("CONT-INF")), makeSymbol("CONTINUABLE-INFERENCE-POOL")))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym59$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-FOCUS-ENTITY-METHOD");

    static private final SubLList $list60 = list(makeSymbol("?WHAT"));

    static private final SubLString $str61$ci_ = makeString("ci-");

    static private final SubLString $str62$_S = makeString("~S");

    private static final SubLSymbol CONTINUE_INFERENCE = makeSymbol("CONTINUE-INFERENCE");

    private static final SubLSymbol FOCUS_ENTITY_COMPUTE_SALIENT_JUSTIFICATIONS_METHOD = makeSymbol("FOCUS-ENTITY-COMPUTE-SALIENT-JUSTIFICATIONS-METHOD");

    private static final SubLSymbol HARVEST_QUERIES_FROM_INFERENCE_POOL = makeSymbol("HARVEST-QUERIES-FROM-INFERENCE-POOL");

    static private final SubLList $list66 = list(makeSymbol("SPECIFICITY"));

    static private final SubLList $list67 = list(list(makeSymbol("CLET"), list(list(makeSymbol("CYCL-QUERIES"), NIL), list(makeSymbol("NEW-INFERENCE-POOL"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("INFERENCE-TASK"), makeSymbol("CONTINUABLE-INFERENCE-POOL")), list(makeSymbol("CDESTRUCTURING-BIND"), list(makeSymbol("TASK"), makeSymbol("INFERENCE")), makeSymbol("INFERENCE-TASK"), list(makeSymbol("PCOND"), list(list(makeSymbol("CAND"), list(makeSymbol("INFERENCE-P"), makeSymbol("INFERENCE")), list(EQ, list(makeSymbol("INFERENCE-STATUS"), makeSymbol("INFERENCE")), makeKeyword("SUSPENDED"))), list(makeSymbol("DO-INFERENCE-NEW-ANSWERS"), list(makeSymbol("ANSWER"), makeSymbol("INFERENCE")), list(makeSymbol("CLET"), list(list(makeSymbol("SALIENT-ANSWER"), list(makeSymbol("ZEROP"), makeSymbol("SPECIFICITY")))), list(makeSymbol("DO-INFERENCE-ANSWER-JUSTIFICATIONS"), list(makeSymbol("JUSTIFICATION"), makeSymbol("ANSWER")), list(makeSymbol("PUNLESS"), makeSymbol("SALIENT-ANSWER"), list(makeSymbol("CSETQ"), makeSymbol("SALIENT-ANSWER"), list(makeSymbol("ENTITY-SPECIFIC-JUSTIFICATION-P"), makeSymbol("CYC-ENTITY"), makeSymbol("TYPES"), makeSymbol("JUSTIFICATION"), makeSymbol("SPECIFICITY"))))), list(makeSymbol("PWHEN"), makeSymbol("SALIENT-ANSWER"), list(makeSymbol("CLET"), list(list(makeSymbol("BINDINGS"), list(makeSymbol("INFERENCE-ANSWER-BINDINGS"), makeSymbol("ANSWER")))), list(makeSymbol("CDOLIST"), list(makeSymbol("BINDING"), makeSymbol("BINDINGS")), list(makeSymbol("CLET"), list(list(makeSymbol("VAR"), list(makeSymbol("CAR"), makeSymbol("BINDING"))), list(makeSymbol("BIND"), list(makeSymbol("CDR"), makeSymbol("BINDING"))), makeSymbol("QUERY")), list(makeSymbol("IGNORE"), makeSymbol("VAR")), list(makeSymbol("PWHEN"), list(makeSymbol("CONSP"), makeSymbol("BIND")), list(makeSymbol("CSETQ"), makeSymbol("QUERY"), list(makeSymbol("UNPACK-EXISTENTIAL-QUERY"), makeSymbol("BIND"), makeSymbol("CYC-ENTITY")))), list(makeSymbol("PWHEN"), makeSymbol("QUERY"), list(makeSymbol("CLET"), list(list(makeSymbol("QUERY-PRED"), list(makeSymbol("FORMULA-ARG0"), makeSymbol("QUERY")))), list(makeSymbol("PUNLESS"), list(makeSymbol("MEMBER?"), makeSymbol("QUERY-PRED"), list(QUOTE, list(reader_make_constant_shell("isa"), reader_make_constant_shell("genls")))), list(makeSymbol("CPUSH"), list(makeSymbol("NEW-CYCL-QUERY"), makeSymbol("QUERY")), makeSymbol("CYCL-QUERIES"))))))))))), list(makeSymbol("PWHEN"), list(makeSymbol("TASK-PROCESS"), makeSymbol("TASK")), list(makeSymbol("KILL-PROCESS"), list(makeSymbol("TASK-PROCESS"), makeSymbol("TASK")))), list(makeSymbol("DESTROY-INFERENCE"), makeSymbol("INFERENCE"))), list(list(makeSymbol("INFERENCE-P"), makeSymbol("INFERENCE")), list(makeSymbol("CPUSH"), makeSymbol("INFERENCE-TASK"), makeSymbol("NEW-INFERENCE-POOL")))))), list(makeSymbol("CSETQ"), makeSymbol("CONTINUABLE-INFERENCE-POOL"), makeSymbol("NEW-INFERENCE-POOL")), list(RET, makeSymbol("CYCL-QUERIES"))));

    static private final SubLSymbol $sym68$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-FOCUS-ENTITY-METHOD");

    static private final SubLList $list69 = list(makeSymbol("TASK"), makeSymbol("INFERENCE"));

    static private final SubLList $list71 = list(reader_make_constant_shell("isa"), reader_make_constant_shell("genls"));

    private static final SubLSymbol FOCUS_ENTITY_HARVEST_QUERIES_FROM_INFERENCE_POOL_METHOD = makeSymbol("FOCUS-ENTITY-HARVEST-QUERIES-FROM-INFERENCE-POOL-METHOD");

    private static final SubLSymbol GET_SALIENT_QUERIES = makeSymbol("GET-SALIENT-QUERIES");

    static private final SubLList $list74 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("COMPLETENESS"), makeKeyword("CURRENT")), list(makeSymbol("SPECIFICITY"), ZERO_INTEGER));

    static private final SubLList $list75 = list(makeString("@param SPECIFICITY, integerp meant to denote how many levels of inheritance are acceptable\n   for a salient query. The lower the number, the tighter the restriction. The default, 0, causes \n   salient queries to be inherited without restriction from all supertypes of this entity.\n   @param COMPLETE, booleanp. If T, then the method will return only after all the inferences \n   that were started to compute salient queries are complete. If NIL the method will return\n   immediately with all the salient queries discovered so far.\n   @return listp, a list of salient cycl-query-p.\n   @owner bertolo"), list(makeSymbol("CHECK-TYPE"), makeSymbol("SPECIFICITY"), makeSymbol("INTEGERP")), list(makeSymbol("PCASE"), makeSymbol("COMPLETENESS"), list(makeKeyword("CURRENT"), list(RET, makeSymbol("SALIENT-QUERIES"))), list(makeKeyword("UPDATE"), list(makeSymbol("CLET"), list(list(makeSymbol("LATEST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("HARVEST-QUERIES-FROM-INFERENCE-POOL")), makeSymbol("SPECIFICITY"))), list(makeSymbol("UPDATE"), makeSymbol("SALIENT-QUERIES"))), list(makeSymbol("CDOLIST"), list(makeSymbol("L"), makeSymbol("LATEST")), list(makeSymbol("CPUSHNEW"), makeSymbol("L"), makeSymbol("UPDATE"), list(QUOTE, makeSymbol("CYCL-QUERY-EQUAL-P")))), list(makeSymbol("CSETQ"), makeSymbol("SALIENT-QUERIES"), makeSymbol("UPDATE")), list(RET, makeSymbol("UPDATE")))), list(makeKeyword("ALL"), list(makeSymbol("CLET"), list(list(makeSymbol("UPDATE"), makeSymbol("SALIENT-QUERIES")), makeSymbol("LATEST")), list(makeSymbol("UNTIL"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("DONE-COMPUTING-SALIENT-QUERIES"))), list(makeSymbol("SLEEP"), ONE_INTEGER)), list(makeSymbol("CSETQ"), makeSymbol("LATEST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("HARVEST-QUERIES-FROM-INFERENCE-POOL")), makeSymbol("SPECIFICITY"))), list(makeSymbol("CDOLIST"), list(makeSymbol("L"), makeSymbol("LATEST")), list(makeSymbol("CPUSHNEW"), makeSymbol("L"), makeSymbol("UPDATE"), list(QUOTE, makeSymbol("CYCL-QUERY-EQUAL-P")))), list(makeSymbol("CSETQ"), makeSymbol("SALIENT-QUERIES"), makeSymbol("UPDATE")), list(RET, makeSymbol("UPDATE"))))));

    static private final SubLSymbol $sym77$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-FOCUS-ENTITY-METHOD");

    private static final SubLSymbol CYCL_QUERY_EQUAL_P = makeSymbol("CYCL-QUERY-EQUAL-P");

    private static final SubLSymbol DONE_COMPUTING_SALIENT_QUERIES = makeSymbol("DONE-COMPUTING-SALIENT-QUERIES");

    private static final SubLSymbol FOCUS_ENTITY_GET_SALIENT_QUERIES_METHOD = makeSymbol("FOCUS-ENTITY-GET-SALIENT-QUERIES-METHOD");

    static private final SubLList $list84 = list(makeString("@return BOOLEAN; T iff no inference that has been started to compute\n   salient queries is still running.\n   @bertolo"), list(makeSymbol("CLET"), list(makeSymbol("STILL-WORKING")), list(makeSymbol("CSOME"), list(makeSymbol("INFERENCE-TASK"), makeSymbol("CONTINUABLE-INFERENCE-POOL"), makeSymbol("STILL-WORKING")), list(makeSymbol("CDESTRUCTURING-BIND"), list(makeSymbol("TASK"), makeSymbol("INFERENCE")), makeSymbol("INFERENCE-TASK"), list(makeSymbol("IGNORE"), makeSymbol("TASK")), list(makeSymbol("PWHEN"), list(makeSymbol("INFERENCE-P"), makeSymbol("INFERENCE")), list(makeSymbol("CLET"), list(list(makeSymbol("STATUS"), list(makeSymbol("INFERENCE-STATUS"), makeSymbol("INFERENCE")))), list(makeSymbol("CSETQ"), makeSymbol("STILL-WORKING"), list(makeSymbol("MEMBER"), makeSymbol("STATUS"), list(QUOTE, list(makeKeyword("NEW"), makeKeyword("PREPARED"), makeKeyword("READY"), makeKeyword("RUNNING"))))))))), list(RET, list(makeSymbol("CNOT"), makeSymbol("STILL-WORKING")))));

    static private final SubLSymbol $sym85$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-FOCUS-ENTITY-METHOD");

    static private final SubLList $list86 = list(makeKeyword("NEW"), makeKeyword("PREPARED"), makeKeyword("READY"), makeKeyword("RUNNING"));

    private static final SubLSymbol FOCUS_ENTITY_DONE_COMPUTING_SALIENT_QUERIES_METHOD = makeSymbol("FOCUS-ENTITY-DONE-COMPUTING-SALIENT-QUERIES-METHOD");

    private static final SubLSymbol ANSWER_SALIENT_QUERIES = makeSymbol("ANSWER-SALIENT-QUERIES");

    static private final SubLList $list89 = list(makeString("@return focus-entity-p, this focus entity\n   As a side effect it computes the answers to all the salient queries for this entity.\n   @owner bertolo"), list(makeSymbol("CLET"), list(list(makeSymbol("*ASK-QUIRK?*"), T)), list(makeSymbol("CDOLIST"), list(makeSymbol("QUERY"), makeSymbol("SALIENT-QUERIES")), list(makeSymbol("CLET"), list(list(makeSymbol("LOCAL-ANSWERS"), list(makeSymbol("FIM"), makeSymbol("QUERY"), list(QUOTE, makeSymbol("ANSWER"))))), list(makeSymbol("PUNLESS"), makeSymbol("LOCAL-ANSWERS"), list(makeSymbol("CPUSH"), makeSymbol("QUERY"), makeSymbol("UNANSWERED-QUESTIONS"))), list(makeSymbol("CDOLIST"), list(makeSymbol("ANSWER"), makeSymbol("LOCAL-ANSWERS")), list(makeSymbol("CPUSH"), makeSymbol("ANSWER"), makeSymbol("ANSWERS")))))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym90$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-FOCUS-ENTITY-METHOD");

    private static final SubLSymbol FOCUS_ENTITY_ANSWER_SALIENT_QUERIES_METHOD = makeSymbol("FOCUS-ENTITY-ANSWER-SALIENT-QUERIES-METHOD");

    private static final SubLSymbol TEXTUAL_FOCUS_ENTITY = makeSymbol("TEXTUAL-FOCUS-ENTITY");

    static private final SubLList $list94 = list(list(makeSymbol("NAME"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("PASSAGES"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("LEARNED-TYPES"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("LEARNED-TEXTUAL-TYPES"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NAME"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LEARN-TYPES-FROM-CORPORA"), list(makeSymbol("CORPORA")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-PASSAGE"), list(makeSymbol("PASSAGE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), EQUAL, list(makeSymbol("OBJECT")), makeKeyword("PUBLIC")));

    private static final SubLSymbol LEARNED_TEXTUAL_TYPES = makeSymbol("LEARNED-TEXTUAL-TYPES");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_TEXTUAL_FOCUS_ENTITY_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TEXTUAL-FOCUS-ENTITY-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_TEXTUAL_FOCUS_ENTITY_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TEXTUAL-FOCUS-ENTITY-INSTANCE");

    static private final SubLSymbol $sym101$CYCL_EXPRESSION_ = makeSymbol("CYCL-EXPRESSION?");

    private static final SubLSymbol ADMISSIBLE_FOCUS_ENTITY_TYPE = makeSymbol("ADMISSIBLE-FOCUS-ENTITY-TYPE");

    static private final SubLList $list104 = list(list(RET, makeSymbol("NAME")));

    static private final SubLSymbol $sym105$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEXTUAL-FOCUS-ENTITY-METHOD");

    private static final SubLSymbol TEXTUAL_FOCUS_ENTITY_NAME_METHOD = makeSymbol("TEXTUAL-FOCUS-ENTITY-NAME-METHOD");

    static private final SubLList $list108 = list(makeSymbol("STREAM"), makeSymbol("DEPTH"));

    static private final SubLList $list109 = list(new SubLObject[]{ list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("WRITE-STRING"), makeString("#<ESS-ENT-"), makeSymbol("STREAM")), list(makeSymbol("PRIN1"), makeSymbol("INSTANCE-NUMBER"), makeSymbol("STREAM")), list(makeSymbol("WRITE-STRING"), makeString(": "), makeSymbol("STREAM")), list(makeSymbol("PRIN1"), makeSymbol("NAME"), makeSymbol("STREAM")), list(makeSymbol("WRITE-STRING"), makeString(" types: "), makeSymbol("STREAM")), list(makeSymbol("PRIN1"), list(makeSymbol("LENGTH"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ALL-TYPES")))), makeSymbol("STREAM")), list(makeSymbol("WRITE-STRING"), makeString(" facts: "), makeSymbol("STREAM")), list(makeSymbol("PRIN1"), list(makeSymbol("LENGTH"), makeSymbol("ANSWERS")), makeSymbol("STREAM")), list(makeSymbol("WRITE-STRING"), makeString(">"), makeSymbol("STREAM")), list(makeSymbol("TERPRI"), makeSymbol("STREAM")), list(RET, makeSymbol("SELF")) });

    static private final SubLSymbol $sym110$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEXTUAL-FOCUS-ENTITY-METHOD");

    static private final SubLString $str111$__ESS_ENT_ = makeString("#<ESS-ENT-");

    static private final SubLString $str112$__ = makeString(": ");

    static private final SubLString $str113$_types__ = makeString(" types: ");

    static private final SubLString $str114$_facts__ = makeString(" facts: ");

    static private final SubLString $str115$_ = makeString(">");

    private static final SubLSymbol TEXTUAL_FOCUS_ENTITY_PRINT_METHOD = makeSymbol("TEXTUAL-FOCUS-ENTITY-PRINT-METHOD");

    static private final SubLList $list117 = list(makeSymbol("OBJECT"));

    static private final SubLList $list118 = list(makeString("@return booleanp; non-nil if OBJECT is equal to this entity, nil otherwise"), list(RET, list(makeSymbol("CAND"), list(makeSymbol("TEXTUAL-FOCUS-ENTITY-P"), makeSymbol("OBJECT")), list(EQUAL, makeSymbol("NAME"), list(makeSymbol("FIM"), makeSymbol("OBJECT"), list(QUOTE, makeSymbol("NAME")))))));

    static private final SubLSymbol $sym119$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEXTUAL-FOCUS-ENTITY-METHOD");

    private static final SubLSymbol TEXTUAL_FOCUS_ENTITY_EQUAL_METHOD = makeSymbol("TEXTUAL-FOCUS-ENTITY-EQUAL-METHOD");

    private static final SubLSymbol TEXTUAL_FOCUS_ENTITY_P = makeSymbol("TEXTUAL-FOCUS-ENTITY-P");

    private static final SubLSymbol CHRONOLOGY = makeSymbol("CHRONOLOGY");

    static private final SubLList $list123 = list(makeString("@return a chronological summary of all information known about this entity.\n   @owner bertolo"), list(RET, list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("RENDER")), list(QUOTE, list(makeKeyword("FORMAT"), $TEXT, makeKeyword("ORDER"), makeKeyword("CHRONOLOGICAL"))))));

    private static final SubLSymbol RENDER = makeSymbol("RENDER");

    static private final SubLList $list125 = list(makeKeyword("FORMAT"), $TEXT, makeKeyword("ORDER"), makeKeyword("CHRONOLOGICAL"));

    private static final SubLSymbol TEXTUAL_FOCUS_ENTITY_CHRONOLOGY_METHOD = makeSymbol("TEXTUAL-FOCUS-ENTITY-CHRONOLOGY-METHOD");

    static private final SubLList $list127 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("STRATEGY"), list(QUOTE, list(makeKeyword("FORMAT"), $TEXT, makeKeyword("ORDER"), makeKeyword("SEQUENTIAL")))));

    static private final SubLList $list128 = list(makeString("@return a summary of all information known about this entity.\n   @owner bertolo"), list(makeSymbol("CLET"), list(list(makeSymbol("FORMAT"), list(makeSymbol("GETF"), makeSymbol("STRATEGY"), makeKeyword("FORMAT"))), list(makeSymbol("ORDER"), list(makeSymbol("GETF"), makeSymbol("STRATEGY"), makeKeyword("ORDER"))), makeSymbol("ACCUMULATOR")), list(makeSymbol("PCASE"), makeSymbol("FORMAT"), list($TEXT, list(makeSymbol("CSETQ"), makeSymbol("ACCUMULATOR"), list(makeSymbol("CCONCATENATE"), makeSymbol("NAME"), makeString(":"), makeSymbol("*NEW-LINE-STRING*"), makeSymbol("*NEW-LINE-STRING*"))))), list(makeSymbol("PCASE"), makeSymbol("ORDER"), list(makeKeyword("SEQUENTIAL"), list(makeSymbol("CDOLIST"), list(makeSymbol("ANSWER"), makeSymbol("ANSWERS")), list(makeSymbol("CLET"), list(list(makeSymbol("JUSTIFICATION"), list(makeSymbol("FIM"), makeSymbol("ANSWER"), list(QUOTE, makeSymbol("JUSTIFY")))), list(makeSymbol("SOURCE"), list(makeSymbol("FIF"), list(makeSymbol("CORPUS-PASSAGE-P"), makeSymbol("JUSTIFICATION")), list(makeSymbol("FIM"), makeSymbol("JUSTIFICATION"), list(QUOTE, makeSymbol("GET-SOURCE"))), makeString("")))), list(makeSymbol("CSETQ"), makeSymbol("ACCUMULATOR"), list(new SubLObject[]{ makeSymbol("CCONCATENATE"), makeSymbol("ACCUMULATOR"), list(makeSymbol("FIM"), makeSymbol("ANSWER"), list(QUOTE, makeSymbol("GET-CONTENT"))), makeSymbol("*NEW-LINE-STRING*"), makeString("("), makeSymbol("SOURCE"), makeString(")"), makeSymbol("*NEW-LINE-STRING*"), makeSymbol("*NEW-LINE-STRING*") }))))), list(makeKeyword("CHRONOLOGICAL"), list(makeSymbol("CLET"), list(list(makeSymbol("SORTED"), list(makeSymbol("SORT"), list(makeSymbol("COPY-LIST"), makeSymbol("ANSWERS")), list(QUOTE, makeSymbol("ANSWER-OLDER-METHOD"))))), list(makeSymbol("CDOLIST"), list(makeSymbol("ANSWER"), makeSymbol("SORTED")), list(makeSymbol("CLET"), list(list(makeSymbol("JUSTIFICATION"), list(makeSymbol("FIM"), makeSymbol("ANSWER"), list(QUOTE, makeSymbol("JUSTIFY")))), list(makeSymbol("SOURCE"), list(makeSymbol("FIF"), list(makeSymbol("CORPUS-PASSAGE-P"), makeSymbol("JUSTIFICATION")), list(makeSymbol("FIM"), makeSymbol("JUSTIFICATION"), list(QUOTE, makeSymbol("GET-SOURCE"))), makeString("")))), list(makeSymbol("CSETQ"), makeSymbol("ACCUMULATOR"), list(new SubLObject[]{ makeSymbol("CCONCATENATE"), makeSymbol("ACCUMULATOR"), list(makeSymbol("FIM"), makeSymbol("ANSWER"), list(QUOTE, makeSymbol("GET-CONTENT"))), makeSymbol("*NEW-LINE-STRING*"), makeString("("), makeSymbol("SOURCE"), makeString(")"), makeSymbol("*NEW-LINE-STRING*"), makeSymbol("*NEW-LINE-STRING*") }))))))), list(RET, makeSymbol("ACCUMULATOR"))));

    static private final SubLList $list129 = list(makeKeyword("FORMAT"), $TEXT, makeKeyword("ORDER"), makeKeyword("SEQUENTIAL"));

    static private final SubLSymbol $sym130$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEXTUAL-FOCUS-ENTITY-METHOD");

    static private final SubLString $str134$_ = makeString(":");

    private static final SubLSymbol JUSTIFY = makeSymbol("JUSTIFY");

    static private final SubLString $str138$ = makeString("");

    static private final SubLString $str140$_ = makeString("(");

    static private final SubLString $str141$_ = makeString(")");

    private static final SubLSymbol ANSWER_OLDER_METHOD = makeSymbol("ANSWER-OLDER-METHOD");

    private static final SubLSymbol TEXTUAL_FOCUS_ENTITY_RENDER_METHOD = makeSymbol("TEXTUAL-FOCUS-ENTITY-RENDER-METHOD");

    private static final SubLSymbol LEARN_TYPES_FROM_CORPORA = makeSymbol("LEARN-TYPES-FROM-CORPORA");

    static private final SubLList $list146 = list(makeSymbol("CORPORA"));

    static private final SubLList $list147 = list(makeString("@param CORPORA, listp a list of strings denoting available corpora\n   @return textual-focus-entity-p, this entity.\n   As a side effect it consults documents in CORPORA to try to learn its own type.\n   @owner bertolo"), list(makeSymbol("CHECK-TYPE"), makeSymbol("CORPORA"), makeSymbol("LISTP")), list(makeSymbol("CLET"), list(list(makeSymbol("CURRENT-TYPES"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ALL-TYPES")))), list(makeSymbol("LOCAL-ANSWERS"), NIL), makeSymbol("WHO-TYPE"), makeSymbol("QUESTION")), list(makeSymbol("WITH-ALL-MTS"), list(makeSymbol("CSETQ"), makeSymbol("WHO-TYPE"), list(makeSymbol("ANY-GENL-ANY?"), makeSymbol("CURRENT-TYPES"), list(QUOTE, list(reader_make_constant_shell("Person"), reader_make_constant_shell("Organization")))))), list(makeSymbol("PIF"), makeSymbol("WHO-TYPE"), list(makeSymbol("CSETQ"), makeSymbol("QUESTION"), list(makeSymbol("NEW-QUESTION"), list(makeSymbol("CCONCATENATE"), makeString("Who is "), makeSymbol("NAME"), makeString("?")))), list(makeSymbol("CSETQ"), makeSymbol("QUESTION"), list(makeSymbol("NEW-QUESTION"), list(makeSymbol("CCONCATENATE"), makeString("What is "), makeSymbol("NAME"), makeString("?"))))), list(makeSymbol("PWHEN"), makeSymbol("QUESTION"), list(makeSymbol("CSETQ"), makeSymbol("LOCAL-ANSWERS"), list(makeSymbol("FIM"), makeSymbol("QUESTION"), list(QUOTE, makeSymbol("ANSWER"))))), list(makeSymbol("PUNLESS"), makeSymbol("LOCAL-ANSWERS"), list(makeSymbol("CPUSH"), makeSymbol("QUESTION"), makeSymbol("UNANSWERED-QUESTIONS"))), list(makeSymbol("CDOLIST"), list(makeSymbol("ANSWER"), makeSymbol("LOCAL-ANSWERS")), list(makeSymbol("CPUSH"), makeSymbol("ANSWER"), makeSymbol("ANSWERS")), list(makeSymbol("CLET"), list(list(makeSymbol("*NPP-USE-NL-TAGS?*"), NIL), list(makeSymbol("DENOTS"), list(makeSymbol("PS-GET-CYCLS-FOR-NP"), list(makeSymbol("FIM"), makeSymbol("ANSWER"), list(QUOTE, makeSymbol("GET-CONTENT")))))), list(makeSymbol("CDOLIST"), list(makeSymbol("DENOT"), makeSymbol("DENOTS")), list(makeSymbol("CLET"), list(makeSymbol("FAIL")), list(makeSymbol("CSOME"), list(makeSymbol("TYPE"), makeSymbol("CURRENT-TYPES"), makeSymbol("FAIL")), list(makeSymbol("WITH-ALL-MTS"), list(makeSymbol("CSETQ"), makeSymbol("FAIL"), list(makeSymbol("COLLECTIONS-DISJOINT?"), makeSymbol("DENOT"), makeSymbol("TYPE"))))), list(makeSymbol("PUNLESS"), makeSymbol("FAIL"), list(makeSymbol("CPUSH"), makeSymbol("DENOT"), makeSymbol("CURRENT-TYPES")), list(makeSymbol("CPUSH"), makeSymbol("DENOT"), makeSymbol("LEARNED-TYPES"))))))), list(RET, makeSymbol("SELF"))));

    static private final SubLSymbol $sym148$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEXTUAL-FOCUS-ENTITY-METHOD");

    static private final SubLList $list149 = list(reader_make_constant_shell("Person"), reader_make_constant_shell("Organization"));

    static private final SubLString $$$Who_is_ = makeString("Who is ");

    static private final SubLString $str151$_ = makeString("?");

    static private final SubLString $$$What_is_ = makeString("What is ");

    private static final SubLSymbol TEXTUAL_FOCUS_ENTITY_LEARN_TYPES_FROM_CORPORA_METHOD = makeSymbol("TEXTUAL-FOCUS-ENTITY-LEARN-TYPES-FROM-CORPORA-METHOD");

    private static final SubLSymbol ADD_PASSAGE = makeSymbol("ADD-PASSAGE");

    static private final SubLList $list155 = list(makeSymbol("PASSAGE"));

    static private final SubLList $list156 = list(makeString("@param PASSAGE passage-p\n   @return textual-focus-entity; this entity with PASSAGE added to the list\n   of passages where the entity occurs"), list(makeSymbol("CHECK-TYPE"), makeSymbol("PASSAGE"), makeSymbol("CORPUS-PASSAGE-P")), list(makeSymbol("CPUSHNEW"), makeSymbol("PASSAGE"), makeSymbol("PASSAGES"), list(QUOTE, makeSymbol("PASSAGE-EQUAL"))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym157$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEXTUAL-FOCUS-ENTITY-METHOD");

    private static final SubLSymbol CORPUS_PASSAGE_P = makeSymbol("CORPUS-PASSAGE-P");

    private static final SubLSymbol PASSAGE_EQUAL = makeSymbol("PASSAGE-EQUAL");

    private static final SubLSymbol TEXTUAL_FOCUS_ENTITY_ADD_PASSAGE_METHOD = makeSymbol("TEXTUAL-FOCUS-ENTITY-ADD-PASSAGE-METHOD");

    private static final SubLSymbol INFERENCE_ANSWER_JUSTIFICATION_P = makeSymbol("INFERENCE-ANSWER-JUSTIFICATION-P");







    static private final SubLSymbol $sym166$_WHAT = makeSymbol("?WHAT");















    private static final SubLObject $const174$DealingWithAStringInNounLearnerTo = reader_make_constant_shell("DealingWithAStringInNounLearnerTool");













    // Definitions
    public static final SubLObject get_focus_entity_answers_alt(SubLObject v_focus_entity) {
        return classes.subloop_get_access_protected_instance_slot(v_focus_entity, ELEVEN_INTEGER, ANSWERS);
    }

    // Definitions
    public static SubLObject get_focus_entity_answers(final SubLObject v_focus_entity) {
        return subloop_get_access_protected_instance_slot(v_focus_entity, ELEVEN_INTEGER, ANSWERS);
    }

    public static final SubLObject set_focus_entity_answers_alt(SubLObject v_focus_entity, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_focus_entity, value, ELEVEN_INTEGER, ANSWERS);
    }

    public static SubLObject set_focus_entity_answers(final SubLObject v_focus_entity, final SubLObject value) {
        return subloop_set_access_protected_instance_slot(v_focus_entity, value, ELEVEN_INTEGER, ANSWERS);
    }

    public static final SubLObject get_focus_entity_unanswered_questions_alt(SubLObject v_focus_entity) {
        return classes.subloop_get_access_protected_instance_slot(v_focus_entity, TEN_INTEGER, UNANSWERED_QUESTIONS);
    }

    public static SubLObject get_focus_entity_unanswered_questions(final SubLObject v_focus_entity) {
        return subloop_get_access_protected_instance_slot(v_focus_entity, TEN_INTEGER, focus_entity.UNANSWERED_QUESTIONS);
    }

    public static final SubLObject set_focus_entity_unanswered_questions_alt(SubLObject v_focus_entity, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_focus_entity, value, TEN_INTEGER, UNANSWERED_QUESTIONS);
    }

    public static SubLObject set_focus_entity_unanswered_questions(final SubLObject v_focus_entity, final SubLObject value) {
        return subloop_set_access_protected_instance_slot(v_focus_entity, value, TEN_INTEGER, focus_entity.UNANSWERED_QUESTIONS);
    }

    public static final SubLObject get_focus_entity_salient_queries_alt(SubLObject v_focus_entity) {
        return classes.subloop_get_access_protected_instance_slot(v_focus_entity, NINE_INTEGER, SALIENT_QUERIES);
    }

    public static SubLObject get_focus_entity_salient_queries(final SubLObject v_focus_entity) {
        return subloop_get_access_protected_instance_slot(v_focus_entity, NINE_INTEGER, SALIENT_QUERIES);
    }

    public static final SubLObject set_focus_entity_salient_queries_alt(SubLObject v_focus_entity, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_focus_entity, value, NINE_INTEGER, SALIENT_QUERIES);
    }

    public static SubLObject set_focus_entity_salient_queries(final SubLObject v_focus_entity, final SubLObject value) {
        return subloop_set_access_protected_instance_slot(v_focus_entity, value, NINE_INTEGER, SALIENT_QUERIES);
    }

    public static final SubLObject get_focus_entity_salient_query_justifications_alt(SubLObject v_focus_entity) {
        return classes.subloop_get_access_protected_instance_slot(v_focus_entity, EIGHT_INTEGER, SALIENT_QUERY_JUSTIFICATIONS);
    }

    public static SubLObject get_focus_entity_salient_query_justifications(final SubLObject v_focus_entity) {
        return subloop_get_access_protected_instance_slot(v_focus_entity, EIGHT_INTEGER, focus_entity.SALIENT_QUERY_JUSTIFICATIONS);
    }

    public static final SubLObject set_focus_entity_salient_query_justifications_alt(SubLObject v_focus_entity, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_focus_entity, value, EIGHT_INTEGER, SALIENT_QUERY_JUSTIFICATIONS);
    }

    public static SubLObject set_focus_entity_salient_query_justifications(final SubLObject v_focus_entity, final SubLObject value) {
        return subloop_set_access_protected_instance_slot(v_focus_entity, value, EIGHT_INTEGER, focus_entity.SALIENT_QUERY_JUSTIFICATIONS);
    }

    public static final SubLObject get_focus_entity_inference_pool_created_alt(SubLObject v_focus_entity) {
        return classes.subloop_get_access_protected_instance_slot(v_focus_entity, SEVEN_INTEGER, INFERENCE_POOL_CREATED);
    }

    public static SubLObject get_focus_entity_inference_pool_created(final SubLObject v_focus_entity) {
        return subloop_get_access_protected_instance_slot(v_focus_entity, SEVEN_INTEGER, focus_entity.INFERENCE_POOL_CREATED);
    }

    public static final SubLObject set_focus_entity_inference_pool_created_alt(SubLObject v_focus_entity, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_focus_entity, value, SEVEN_INTEGER, INFERENCE_POOL_CREATED);
    }

    public static SubLObject set_focus_entity_inference_pool_created(final SubLObject v_focus_entity, final SubLObject value) {
        return subloop_set_access_protected_instance_slot(v_focus_entity, value, SEVEN_INTEGER, focus_entity.INFERENCE_POOL_CREATED);
    }

    public static final SubLObject get_focus_entity_continuable_inference_pool_alt(SubLObject v_focus_entity) {
        return classes.subloop_get_access_protected_instance_slot(v_focus_entity, SIX_INTEGER, CONTINUABLE_INFERENCE_POOL);
    }

    public static SubLObject get_focus_entity_continuable_inference_pool(final SubLObject v_focus_entity) {
        return subloop_get_access_protected_instance_slot(v_focus_entity, SIX_INTEGER, focus_entity.CONTINUABLE_INFERENCE_POOL);
    }

    public static final SubLObject set_focus_entity_continuable_inference_pool_alt(SubLObject v_focus_entity, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_focus_entity, value, SIX_INTEGER, CONTINUABLE_INFERENCE_POOL);
    }

    public static SubLObject set_focus_entity_continuable_inference_pool(final SubLObject v_focus_entity, final SubLObject value) {
        return subloop_set_access_protected_instance_slot(v_focus_entity, value, SIX_INTEGER, focus_entity.CONTINUABLE_INFERENCE_POOL);
    }

    public static final SubLObject get_focus_entity_asserted_types_alt(SubLObject v_focus_entity) {
        return classes.subloop_get_access_protected_instance_slot(v_focus_entity, FIVE_INTEGER, ASSERTED_TYPES);
    }

    public static SubLObject get_focus_entity_asserted_types(final SubLObject v_focus_entity) {
        return subloop_get_access_protected_instance_slot(v_focus_entity, FIVE_INTEGER, focus_entity.ASSERTED_TYPES);
    }

    public static final SubLObject set_focus_entity_asserted_types_alt(SubLObject v_focus_entity, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_focus_entity, value, FIVE_INTEGER, ASSERTED_TYPES);
    }

    public static SubLObject set_focus_entity_asserted_types(final SubLObject v_focus_entity, final SubLObject value) {
        return subloop_set_access_protected_instance_slot(v_focus_entity, value, FIVE_INTEGER, focus_entity.ASSERTED_TYPES);
    }

    public static final SubLObject get_focus_entity_learned_types_alt(SubLObject v_focus_entity) {
        return classes.subloop_get_access_protected_instance_slot(v_focus_entity, FOUR_INTEGER, LEARNED_TYPES);
    }

    public static SubLObject get_focus_entity_learned_types(final SubLObject v_focus_entity) {
        return subloop_get_access_protected_instance_slot(v_focus_entity, FOUR_INTEGER, focus_entity.LEARNED_TYPES);
    }

    public static final SubLObject set_focus_entity_learned_types_alt(SubLObject v_focus_entity, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_focus_entity, value, FOUR_INTEGER, LEARNED_TYPES);
    }

    public static SubLObject set_focus_entity_learned_types(final SubLObject v_focus_entity, final SubLObject value) {
        return subloop_set_access_protected_instance_slot(v_focus_entity, value, FOUR_INTEGER, focus_entity.LEARNED_TYPES);
    }

    public static final SubLObject get_focus_entity_types_alt(SubLObject v_focus_entity) {
        return classes.subloop_get_access_protected_instance_slot(v_focus_entity, THREE_INTEGER, TYPES);
    }

    public static SubLObject get_focus_entity_types(final SubLObject v_focus_entity) {
        return subloop_get_access_protected_instance_slot(v_focus_entity, THREE_INTEGER, TYPES);
    }

    public static final SubLObject set_focus_entity_types_alt(SubLObject v_focus_entity, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_focus_entity, value, THREE_INTEGER, TYPES);
    }

    public static SubLObject set_focus_entity_types(final SubLObject v_focus_entity, final SubLObject value) {
        return subloop_set_access_protected_instance_slot(v_focus_entity, value, THREE_INTEGER, TYPES);
    }

    public static final SubLObject get_focus_entity_relevant_mt_alt(SubLObject v_focus_entity) {
        return classes.subloop_get_access_protected_instance_slot(v_focus_entity, TWO_INTEGER, RELEVANT_MT);
    }

    public static SubLObject get_focus_entity_relevant_mt(final SubLObject v_focus_entity) {
        return subloop_get_access_protected_instance_slot(v_focus_entity, TWO_INTEGER, focus_entity.RELEVANT_MT);
    }

    public static final SubLObject set_focus_entity_relevant_mt_alt(SubLObject v_focus_entity, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_focus_entity, value, TWO_INTEGER, RELEVANT_MT);
    }

    public static SubLObject set_focus_entity_relevant_mt(final SubLObject v_focus_entity, final SubLObject value) {
        return subloop_set_access_protected_instance_slot(v_focus_entity, value, TWO_INTEGER, focus_entity.RELEVANT_MT);
    }

    public static final SubLObject get_focus_entity_cyc_entity_alt(SubLObject v_focus_entity) {
        return classes.subloop_get_access_protected_instance_slot(v_focus_entity, ONE_INTEGER, CYC_ENTITY);
    }

    public static SubLObject get_focus_entity_cyc_entity(final SubLObject v_focus_entity) {
        return subloop_get_access_protected_instance_slot(v_focus_entity, ONE_INTEGER, CYC_ENTITY);
    }

    public static final SubLObject set_focus_entity_cyc_entity_alt(SubLObject v_focus_entity, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_focus_entity, value, ONE_INTEGER, CYC_ENTITY);
    }

    public static SubLObject set_focus_entity_cyc_entity(final SubLObject v_focus_entity, final SubLObject value) {
        return subloop_set_access_protected_instance_slot(v_focus_entity, value, ONE_INTEGER, CYC_ENTITY);
    }

    public static final SubLObject get_focus_entity_query_parameters_alt(SubLObject v_focus_entity) {
        {
            SubLObject v_class = (v_focus_entity.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(v_focus_entity))) : NIL != subloop_structures.class_p(v_focus_entity) ? ((SubLObject) (v_focus_entity)) : NIL != subloop_structures.instance_p(v_focus_entity) ? ((SubLObject) (subloop_structures.instance_class(v_focus_entity))) : NIL;
            if (NIL != v_class) {
                return aref(subloop_structures.class_any_slots(v_class), TWO_INTEGER);
            }
            return NIL;
        }
    }

    public static SubLObject get_focus_entity_query_parameters(final SubLObject v_focus_entity) {
        final SubLObject v_class = (v_focus_entity.isSymbol()) ? classes_retrieve_class(v_focus_entity) : NIL != class_p(v_focus_entity) ? v_focus_entity : NIL != instance_p(v_focus_entity) ? instance_class(v_focus_entity) : NIL;
        if (NIL != v_class) {
            return aref(class_any_slots(v_class), TWO_INTEGER);
        }
        return NIL;
    }

    public static final SubLObject set_focus_entity_query_parameters_alt(SubLObject v_focus_entity, SubLObject value) {
        {
            SubLObject v_class = (v_focus_entity.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(v_focus_entity))) : NIL != subloop_structures.class_p(v_focus_entity) ? ((SubLObject) (v_focus_entity)) : NIL != subloop_structures.instance_p(v_focus_entity) ? ((SubLObject) (subloop_structures.instance_class(v_focus_entity))) : NIL;
            if (NIL != v_class) {
                return set_aref(subloop_structures.class_any_slots(v_class), TWO_INTEGER, value);
            }
            return NIL;
        }
    }

    public static SubLObject set_focus_entity_query_parameters(final SubLObject v_focus_entity, final SubLObject value) {
        final SubLObject v_class = (v_focus_entity.isSymbol()) ? classes_retrieve_class(v_focus_entity) : NIL != class_p(v_focus_entity) ? v_focus_entity : NIL != instance_p(v_focus_entity) ? instance_class(v_focus_entity) : NIL;
        if (NIL != v_class) {
            return set_aref(class_any_slots(v_class), TWO_INTEGER, value);
        }
        return NIL;
    }

    public static final SubLObject get_focus_entity_salience_predicates_alt(SubLObject v_focus_entity) {
        {
            SubLObject v_class = (v_focus_entity.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(v_focus_entity))) : NIL != subloop_structures.class_p(v_focus_entity) ? ((SubLObject) (v_focus_entity)) : NIL != subloop_structures.instance_p(v_focus_entity) ? ((SubLObject) (subloop_structures.instance_class(v_focus_entity))) : NIL;
            if (NIL != v_class) {
                return aref(subloop_structures.class_any_slots(v_class), ONE_INTEGER);
            }
            return NIL;
        }
    }

    public static SubLObject get_focus_entity_salience_predicates(final SubLObject v_focus_entity) {
        final SubLObject v_class = (v_focus_entity.isSymbol()) ? classes_retrieve_class(v_focus_entity) : NIL != class_p(v_focus_entity) ? v_focus_entity : NIL != instance_p(v_focus_entity) ? instance_class(v_focus_entity) : NIL;
        if (NIL != v_class) {
            return aref(class_any_slots(v_class), ONE_INTEGER);
        }
        return NIL;
    }

    public static final SubLObject set_focus_entity_salience_predicates_alt(SubLObject v_focus_entity, SubLObject value) {
        {
            SubLObject v_class = (v_focus_entity.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(v_focus_entity))) : NIL != subloop_structures.class_p(v_focus_entity) ? ((SubLObject) (v_focus_entity)) : NIL != subloop_structures.instance_p(v_focus_entity) ? ((SubLObject) (subloop_structures.instance_class(v_focus_entity))) : NIL;
            if (NIL != v_class) {
                return set_aref(subloop_structures.class_any_slots(v_class), ONE_INTEGER, value);
            }
            return NIL;
        }
    }

    public static SubLObject set_focus_entity_salience_predicates(final SubLObject v_focus_entity, final SubLObject value) {
        final SubLObject v_class = (v_focus_entity.isSymbol()) ? classes_retrieve_class(v_focus_entity) : NIL != class_p(v_focus_entity) ? v_focus_entity : NIL != instance_p(v_focus_entity) ? instance_class(v_focus_entity) : NIL;
        if (NIL != v_class) {
            return set_aref(class_any_slots(v_class), ONE_INTEGER, value);
        }
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_focus_entity_class_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, FOCUS_ENTITY, SALIENCE_PREDICATES, $list_alt16);
        classes.subloop_initialize_slot(new_instance, FOCUS_ENTITY, QUERY_PARAMETERS, list(new SubLObject[]{ $MAX_NUMBER, FIVE_INTEGER, $MAX_TIME, $int$200, $MAX_TRANSFORMATION_DEPTH, ONE_INTEGER, $BLOCK_, NIL, $MAX_PROOF_DEPTH, NIL, $kw24$CACHE_INFERENCE_RESULTS_, NIL, $ANSWER_LANGUAGE, $HL, $CONTINUABLE_, T, $PRODUCTIVITY_LIMIT, $int$2000000 }));
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_focus_entity_class(final SubLObject new_instance) {
        subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        subloop_initialize_slot(new_instance, focus_entity.FOCUS_ENTITY, focus_entity.SALIENCE_PREDICATES, focus_entity.$list16);
        subloop_initialize_slot(new_instance, focus_entity.FOCUS_ENTITY, focus_entity.QUERY_PARAMETERS, list(new SubLObject[]{ $MAX_NUMBER, FIVE_INTEGER, $MAX_TIME, focus_entity.$int$200, focus_entity.$MAX_TRANSFORMATION_DEPTH, ONE_INTEGER, $BLOCK_, NIL, focus_entity.$MAX_PROOF_DEPTH, NIL, focus_entity.$kw24$CACHE_INFERENCE_RESULTS_, NIL, $ANSWER_LANGUAGE, $HL, $CONTINUABLE_, T, $PRODUCTIVITY_LIMIT, focus_entity.$int$2000000 }));
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_focus_entity_instance_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, FOCUS_ENTITY, CYC_ENTITY, NIL);
        classes.subloop_initialize_slot(new_instance, FOCUS_ENTITY, RELEVANT_MT, NIL);
        classes.subloop_initialize_slot(new_instance, FOCUS_ENTITY, TYPES, NIL);
        classes.subloop_initialize_slot(new_instance, FOCUS_ENTITY, LEARNED_TYPES, NIL);
        classes.subloop_initialize_slot(new_instance, FOCUS_ENTITY, ASSERTED_TYPES, NIL);
        classes.subloop_initialize_slot(new_instance, FOCUS_ENTITY, CONTINUABLE_INFERENCE_POOL, NIL);
        classes.subloop_initialize_slot(new_instance, FOCUS_ENTITY, INFERENCE_POOL_CREATED, NIL);
        classes.subloop_initialize_slot(new_instance, FOCUS_ENTITY, SALIENT_QUERY_JUSTIFICATIONS, NIL);
        classes.subloop_initialize_slot(new_instance, FOCUS_ENTITY, SALIENT_QUERIES, NIL);
        classes.subloop_initialize_slot(new_instance, FOCUS_ENTITY, UNANSWERED_QUESTIONS, NIL);
        classes.subloop_initialize_slot(new_instance, FOCUS_ENTITY, ANSWERS, NIL);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_focus_entity_instance(final SubLObject new_instance) {
        subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        subloop_initialize_slot(new_instance, focus_entity.FOCUS_ENTITY, CYC_ENTITY, NIL);
        subloop_initialize_slot(new_instance, focus_entity.FOCUS_ENTITY, focus_entity.RELEVANT_MT, NIL);
        subloop_initialize_slot(new_instance, focus_entity.FOCUS_ENTITY, TYPES, NIL);
        subloop_initialize_slot(new_instance, focus_entity.FOCUS_ENTITY, focus_entity.LEARNED_TYPES, NIL);
        subloop_initialize_slot(new_instance, focus_entity.FOCUS_ENTITY, focus_entity.ASSERTED_TYPES, NIL);
        subloop_initialize_slot(new_instance, focus_entity.FOCUS_ENTITY, focus_entity.CONTINUABLE_INFERENCE_POOL, NIL);
        subloop_initialize_slot(new_instance, focus_entity.FOCUS_ENTITY, focus_entity.INFERENCE_POOL_CREATED, NIL);
        subloop_initialize_slot(new_instance, focus_entity.FOCUS_ENTITY, focus_entity.SALIENT_QUERY_JUSTIFICATIONS, NIL);
        subloop_initialize_slot(new_instance, focus_entity.FOCUS_ENTITY, SALIENT_QUERIES, NIL);
        subloop_initialize_slot(new_instance, focus_entity.FOCUS_ENTITY, focus_entity.UNANSWERED_QUESTIONS, NIL);
        subloop_initialize_slot(new_instance, focus_entity.FOCUS_ENTITY, ANSWERS, NIL);
        return NIL;
    }

    public static final SubLObject focus_entity_p_alt(SubLObject v_focus_entity) {
        return classes.subloop_instanceof_class(v_focus_entity, FOCUS_ENTITY);
    }

    public static SubLObject focus_entity_p(final SubLObject v_focus_entity) {
        return subloop_instanceof_class(v_focus_entity, focus_entity.FOCUS_ENTITY);
    }

    /**
     *
     *
     * @return listp, the list of all Cyc types this entity is know to be an instance of.
     * @unknown bertolo
     */
    @LispMethod(comment = "@return listp, the list of all Cyc types this entity is know to be an instance of.\r\n@unknown bertolo")
    public static final SubLObject focus_entity_all_types_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_focus_entity_method = NIL;
            SubLObject learned_types = com.cyc.cycjava.cycl.quirk.focus_entity.get_focus_entity_learned_types(self);
            SubLObject types = com.cyc.cycjava.cycl.quirk.focus_entity.get_focus_entity_types(self);
            try {
                try {
                    {
                        SubLObject raw = union(types, learned_types, UNPROVIDED, UNPROVIDED);
                        SubLObject organized = NIL;
                        SubLObject cdolist_list_var = raw;
                        SubLObject candidate_type = NIL;
                        for (candidate_type = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , candidate_type = cdolist_list_var.first()) {
                            {
                                SubLObject fail = NIL;
                                if (NIL == fail) {
                                    {
                                        SubLObject csome_list_var = organized;
                                        SubLObject existing_type = NIL;
                                        for (existing_type = csome_list_var.first(); !((NIL != fail) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , existing_type = csome_list_var.first()) {
                                            fail = genls.genl_in_any_mtP(existing_type, candidate_type);
                                        }
                                    }
                                }
                                if (NIL == fail) {
                                    organized = cons(candidate_type, organized);
                                }
                            }
                        }
                        sublisp_throw($sym37$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD, organized);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.quirk.focus_entity.set_focus_entity_learned_types(self, learned_types);
                            com.cyc.cycjava.cycl.quirk.focus_entity.set_focus_entity_types(self, types);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_focus_entity_method = Errors.handleThrowable(ccatch_env_var, $sym37$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD);
            }
            return catch_var_for_focus_entity_method;
        }
    }

    /**
     *
     *
     * @return listp, the list of all Cyc types this entity is know to be an instance of.
     * @unknown bertolo
     */
    @LispMethod(comment = "@return listp, the list of all Cyc types this entity is know to be an instance of.\r\n@unknown bertolo")
    public static SubLObject focus_entity_all_types_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_focus_entity_method = NIL;
        final SubLObject learned_types = focus_entity.get_focus_entity_learned_types(self);
        final SubLObject types = focus_entity.get_focus_entity_types(self);
        try {
            thread.throwStack.push(focus_entity.$sym37$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD);
            try {
                final SubLObject raw = union(types, learned_types, UNPROVIDED, UNPROVIDED);
                SubLObject organized = NIL;
                SubLObject cdolist_list_var = raw;
                SubLObject candidate_type = NIL;
                candidate_type = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject fail = NIL;
                    if (NIL == fail) {
                        SubLObject csome_list_var;
                        SubLObject existing_type;
                        for (csome_list_var = organized, existing_type = NIL, existing_type = csome_list_var.first(); (NIL == fail) && (NIL != csome_list_var); fail = genl_in_any_mtP(existing_type, candidate_type) , csome_list_var = csome_list_var.rest() , existing_type = csome_list_var.first()) {
                        }
                    }
                    if (NIL == fail) {
                        organized = cons(candidate_type, organized);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    candidate_type = cdolist_list_var.first();
                } 
                sublisp_throw(focus_entity.$sym37$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD, organized);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    focus_entity.set_focus_entity_learned_types(self, learned_types);
                    focus_entity.set_focus_entity_types(self, types);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_focus_entity_method = Errors.handleThrowable(ccatch_env_var, focus_entity.$sym37$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_focus_entity_method;
    }

    /**
     *
     *
     * @return focus-entity-p
    As a side effect it computes all salient queries for this entity, based on what its type(s)
    is/are known to be.
     * @unknown bertolo
     */
    @LispMethod(comment = "@return focus-entity-p\r\nAs a side effect it computes all salient queries for this entity, based on what its type(s)\r\nis/are known to be.\r\n@unknown bertolo")
    public static final SubLObject focus_entity_generate_salient_queries_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_focus_entity_method = NIL;
            SubLObject inference_pool_created = com.cyc.cycjava.cycl.quirk.focus_entity.get_focus_entity_inference_pool_created(self);
            try {
                try {
                    methods.funcall_instance_method_with_0_args(self, KB_INTEGRATE);
                    methods.funcall_instance_method_with_0_args(self, COMPUTE_SALIENT_JUSTIFICATIONS);
                    inference_pool_created = T;
                    sublisp_throw($sym41$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.quirk.focus_entity.set_focus_entity_inference_pool_created(self, inference_pool_created);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_focus_entity_method = Errors.handleThrowable(ccatch_env_var, $sym41$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD);
            }
            return catch_var_for_focus_entity_method;
        }
    }

    /**
     *
     *
     * @return focus-entity-p
    As a side effect it computes all salient queries for this entity, based on what its type(s)
    is/are known to be.
     * @unknown bertolo
     */
    @LispMethod(comment = "@return focus-entity-p\r\nAs a side effect it computes all salient queries for this entity, based on what its type(s)\r\nis/are known to be.\r\n@unknown bertolo")
    public static SubLObject focus_entity_generate_salient_queries_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_focus_entity_method = NIL;
        SubLObject inference_pool_created = focus_entity.get_focus_entity_inference_pool_created(self);
        try {
            thread.throwStack.push(focus_entity.$sym41$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD);
            try {
                funcall_instance_method_with_0_args(self, focus_entity.KB_INTEGRATE);
                funcall_instance_method_with_0_args(self, focus_entity.COMPUTE_SALIENT_JUSTIFICATIONS);
                inference_pool_created = T;
                sublisp_throw(focus_entity.$sym41$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    focus_entity.set_focus_entity_inference_pool_created(self, inference_pool_created);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_focus_entity_method = Errors.handleThrowable(ccatch_env_var, focus_entity.$sym41$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_focus_entity_method;
    }

    /**
     *
     *
     * @return focus-entity-p
    As a side effect it introduces this entity into the KB, based on what its type(s)
    is/are known to be.
     * @unknown bertolo
     */
    @LispMethod(comment = "@return focus-entity-p\r\nAs a side effect it introduces this entity into the KB, based on what its type(s)\r\nis/are known to be.\r\n@unknown bertolo")
    public static final SubLObject focus_entity_kb_integrate_method_alt(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_focus_entity_method = NIL;
                SubLObject asserted_types = com.cyc.cycjava.cycl.quirk.focus_entity.get_focus_entity_asserted_types(self);
                SubLObject types = com.cyc.cycjava.cycl.quirk.focus_entity.get_focus_entity_types(self);
                SubLObject cyc_entity = com.cyc.cycjava.cycl.quirk.focus_entity.get_focus_entity_cyc_entity(self);
                try {
                    try {
                        {
                            SubLObject all_types = methods.funcall_instance_method_with_0_args(self, ALL_TYPES);
                            SubLObject min_types = NIL;
                            SubLObject pred = NIL;
                            SubLObject mt = NIL;
                            {
                                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                    min_types = genls.min_cols(all_types, UNPROVIDED, UNPROVIDED);
                                } finally {
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                                }
                            }
                            if (NIL != member($$Person, types, UNPROVIDED, UNPROVIDED)) {
                                pred = $$isa;
                                mt = $$PeopleDataMt;
                            } else {
                                if (NIL != member($$Organization, types, UNPROVIDED, UNPROVIDED)) {
                                    pred = $$isa;
                                    mt = $$OrganizationDataMt;
                                } else {
                                    if (NIL != fort_types_interface.collectionP(cyc_entity)) {
                                        pred = $$genls;
                                        mt = $$TREC_Mt;
                                    }
                                }
                            }
                            {
                                SubLObject cdolist_list_var = min_types;
                                SubLObject m_type = NIL;
                                for (m_type = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , m_type = cdolist_list_var.first()) {
                                    {
                                        SubLObject assertion = list(pred, cyc_entity, m_type);
                                        SubLObject wff_test = wff.el_wffP(assertion, mt, UNPROVIDED);
                                        SubLObject success = (NIL != wff_test) ? ((SubLObject) (cyc_kernel.cyc_assert(assertion, mt, UNPROVIDED))) : NIL;
                                        if (NIL != success) {
                                            asserted_types = cons(m_type, asserted_types);
                                        }
                                    }
                                }
                            }
                            sublisp_throw($sym47$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD, self);
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                com.cyc.cycjava.cycl.quirk.focus_entity.set_focus_entity_asserted_types(self, asserted_types);
                                com.cyc.cycjava.cycl.quirk.focus_entity.set_focus_entity_types(self, types);
                                com.cyc.cycjava.cycl.quirk.focus_entity.set_focus_entity_cyc_entity(self, cyc_entity);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_focus_entity_method = Errors.handleThrowable(ccatch_env_var, $sym47$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD);
                }
                return catch_var_for_focus_entity_method;
            }
        }
    }

    /**
     *
     *
     * @return focus-entity-p
    As a side effect it introduces this entity into the KB, based on what its type(s)
    is/are known to be.
     * @unknown bertolo
     */
    @LispMethod(comment = "@return focus-entity-p\r\nAs a side effect it introduces this entity into the KB, based on what its type(s)\r\nis/are known to be.\r\n@unknown bertolo")
    public static SubLObject focus_entity_kb_integrate_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_focus_entity_method = NIL;
        SubLObject asserted_types = focus_entity.get_focus_entity_asserted_types(self);
        final SubLObject types = focus_entity.get_focus_entity_types(self);
        final SubLObject cyc_entity = focus_entity.get_focus_entity_cyc_entity(self);
        try {
            thread.throwStack.push(focus_entity.$sym47$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD);
            try {
                final SubLObject all_types = funcall_instance_method_with_0_args(self, ALL_TYPES);
                SubLObject min_types = NIL;
                SubLObject pred = NIL;
                SubLObject mt = NIL;
                final SubLObject _prev_bind_0 = $relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = $mt$.currentBinding(thread);
                try {
                    $relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    $mt$.bind(focus_entity.$$EverythingPSC, thread);
                    min_types = min_cols(all_types, UNPROVIDED, UNPROVIDED);
                } finally {
                    $mt$.rebind(_prev_bind_2, thread);
                    $relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
                if (NIL != member(focus_entity.$$Person, types, UNPROVIDED, UNPROVIDED)) {
                    pred = focus_entity.$$isa;
                    mt = focus_entity.$$PeopleDataMt;
                } else
                    if (NIL != member(focus_entity.$$Organization, types, UNPROVIDED, UNPROVIDED)) {
                        pred = focus_entity.$$isa;
                        mt = focus_entity.$$OrganizationDataMt;
                    } else
                        if (NIL != collectionP(cyc_entity)) {
                            pred = focus_entity.$$genls;
                            mt = focus_entity.$$TREC_Mt;
                        }


                SubLObject cdolist_list_var = min_types;
                SubLObject m_type = NIL;
                m_type = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject assertion = list(pred, cyc_entity, m_type);
                    final SubLObject wff_test = el_wffP(assertion, mt, UNPROVIDED);
                    final SubLObject success = (NIL != wff_test) ? cyc_assert(assertion, mt, UNPROVIDED) : NIL;
                    if (NIL != success) {
                        asserted_types = cons(m_type, asserted_types);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    m_type = cdolist_list_var.first();
                } 
                sublisp_throw(focus_entity.$sym47$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD, self);
            } finally {
                final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    focus_entity.set_focus_entity_asserted_types(self, asserted_types);
                    focus_entity.set_focus_entity_types(self, types);
                    focus_entity.set_focus_entity_cyc_entity(self, cyc_entity);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_focus_entity_method = Errors.handleThrowable(ccatch_env_var, focus_entity.$sym47$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_focus_entity_method;
    }

    /**
     *
     *
     * @return focus-entity-p
    As a side effect it computes all salient queries for this entity, based on what its type(s)
    is/are known to be.
     * @unknown bertolo
     */
    @LispMethod(comment = "@return focus-entity-p\r\nAs a side effect it computes all salient queries for this entity, based on what its type(s)\r\nis/are known to be.\r\n@unknown bertolo")
    public static final SubLObject focus_entity_compute_salient_justifications_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_focus_entity_method = NIL;
            SubLObject query_parameters = com.cyc.cycjava.cycl.quirk.focus_entity.get_focus_entity_query_parameters(self);
            SubLObject salience_predicates = com.cyc.cycjava.cycl.quirk.focus_entity.get_focus_entity_salience_predicates(self);
            SubLObject continuable_inference_pool = com.cyc.cycjava.cycl.quirk.focus_entity.get_focus_entity_continuable_inference_pool(self);
            SubLObject cyc_entity = com.cyc.cycjava.cycl.quirk.focus_entity.get_focus_entity_cyc_entity(self);
            try {
                try {
                    if (NIL == cyc_entity) {
                        sublisp_throw($sym59$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD, self);
                    }
                    {
                        SubLObject cdolist_list_var = salience_predicates;
                        SubLObject pred = NIL;
                        for (pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pred = cdolist_list_var.first()) {
                            {
                                SubLObject cont_inf = inference_kernel.new_continuable_inference(listS(pred, cyc_entity, $list_alt60), $$EverythingPSC, UNPROVIDED);
                                SubLObject cont_inf_string = cconcatenate($str_alt61$ci_, format(NIL, $str_alt62$_S, gensym(UNPROVIDED)));
                                SubLObject task = process_utilities.new_task(cont_inf_string, CONTINUE_INFERENCE, list(cont_inf, query_parameters), UNPROVIDED);
                                continuable_inference_pool = cons(list(task, cont_inf), continuable_inference_pool);
                            }
                        }
                    }
                    sublisp_throw($sym59$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.quirk.focus_entity.set_focus_entity_query_parameters(self, query_parameters);
                            com.cyc.cycjava.cycl.quirk.focus_entity.set_focus_entity_salience_predicates(self, salience_predicates);
                            com.cyc.cycjava.cycl.quirk.focus_entity.set_focus_entity_continuable_inference_pool(self, continuable_inference_pool);
                            com.cyc.cycjava.cycl.quirk.focus_entity.set_focus_entity_cyc_entity(self, cyc_entity);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_focus_entity_method = Errors.handleThrowable(ccatch_env_var, $sym59$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD);
            }
            return catch_var_for_focus_entity_method;
        }
    }

    /**
     *
     *
     * @return focus-entity-p
    As a side effect it computes all salient queries for this entity, based on what its type(s)
    is/are known to be.
     * @unknown bertolo
     */
    @LispMethod(comment = "@return focus-entity-p\r\nAs a side effect it computes all salient queries for this entity, based on what its type(s)\r\nis/are known to be.\r\n@unknown bertolo")
    public static SubLObject focus_entity_compute_salient_justifications_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_focus_entity_method = NIL;
        final SubLObject query_parameters = focus_entity.get_focus_entity_query_parameters(self);
        final SubLObject salience_predicates = focus_entity.get_focus_entity_salience_predicates(self);
        SubLObject continuable_inference_pool = focus_entity.get_focus_entity_continuable_inference_pool(self);
        final SubLObject cyc_entity = focus_entity.get_focus_entity_cyc_entity(self);
        try {
            thread.throwStack.push(focus_entity.$sym59$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD);
            try {
                if (NIL == cyc_entity) {
                    sublisp_throw(focus_entity.$sym59$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD, self);
                }
                SubLObject cdolist_list_var = salience_predicates;
                SubLObject pred = NIL;
                pred = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject cont_inf = inference_kernel.new_continuable_inference(listS(pred, cyc_entity, focus_entity.$list60), focus_entity.$$EverythingPSC, UNPROVIDED);
                    final SubLObject cont_inf_string = cconcatenate(focus_entity.$str61$ci_, format(NIL, focus_entity.$str62$_S, gensym(UNPROVIDED)));
                    final SubLObject task = process_utilities.new_task(cont_inf_string, focus_entity.CONTINUE_INFERENCE, list(cont_inf, query_parameters), UNPROVIDED);
                    continuable_inference_pool = cons(list(task, cont_inf), continuable_inference_pool);
                    cdolist_list_var = cdolist_list_var.rest();
                    pred = cdolist_list_var.first();
                } 
                sublisp_throw(focus_entity.$sym59$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    focus_entity.set_focus_entity_query_parameters(self, query_parameters);
                    focus_entity.set_focus_entity_salience_predicates(self, salience_predicates);
                    focus_entity.set_focus_entity_continuable_inference_pool(self, continuable_inference_pool);
                    focus_entity.set_focus_entity_cyc_entity(self, cyc_entity);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_focus_entity_method = Errors.handleThrowable(ccatch_env_var, focus_entity.$sym59$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_focus_entity_method;
    }

    public static final SubLObject focus_entity_harvest_queries_from_inference_pool_method_alt(SubLObject self, SubLObject specificity) {
        {
            SubLObject catch_var_for_focus_entity_method = NIL;
            SubLObject continuable_inference_pool = com.cyc.cycjava.cycl.quirk.focus_entity.get_focus_entity_continuable_inference_pool(self);
            SubLObject types = com.cyc.cycjava.cycl.quirk.focus_entity.get_focus_entity_types(self);
            SubLObject cyc_entity = com.cyc.cycjava.cycl.quirk.focus_entity.get_focus_entity_cyc_entity(self);
            try {
                try {
                    {
                        SubLObject cycl_queries = NIL;
                        SubLObject new_inference_pool = NIL;
                        SubLObject cdolist_list_var = continuable_inference_pool;
                        SubLObject inference_task = NIL;
                        for (inference_task = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , inference_task = cdolist_list_var.first()) {
                            {
                                SubLObject datum = inference_task;
                                SubLObject current = datum;
                                SubLObject task = NIL;
                                SubLObject inference = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt69);
                                task = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt69);
                                inference = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    if ((NIL != inference_datastructures_inference.inference_p(inference)) && (inference_datastructures_inference.inference_status(inference) == $SUSPENDED)) {
                                        {
                                            SubLObject inf = inference;
                                            SubLObject start_id = inference_datastructures_inference.inference_new_answer_id_start(inference);
                                            SubLObject end_id = inference_datastructures_inference.inference_next_new_answer_id(inference);
                                            SubLObject id = NIL;
                                            for (id = start_id; !id.numGE(end_id); id = number_utilities.f_1X(id)) {
                                                {
                                                    SubLObject v_answer = inference_datastructures_inference.find_inference_answer_by_id(inf, id);
                                                    SubLObject salient_answer = zerop(specificity);
                                                    {
                                                        SubLObject cdolist_list_var_1 = inference_datastructures_inference.inference_answer_justifications(v_answer);
                                                        SubLObject justification = NIL;
                                                        for (justification = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , justification = cdolist_list_var_1.first()) {
                                                            if (NIL == salient_answer) {
                                                                salient_answer = com.cyc.cycjava.cycl.quirk.focus_entity.entity_specific_justification_p(cyc_entity, types, justification, specificity);
                                                            }
                                                        }
                                                    }
                                                    if (NIL != salient_answer) {
                                                        {
                                                            SubLObject v_bindings = inference_datastructures_inference.inference_answer_bindings(v_answer);
                                                            SubLObject cdolist_list_var_2 = v_bindings;
                                                            SubLObject binding = NIL;
                                                            for (binding = cdolist_list_var_2.first(); NIL != cdolist_list_var_2; cdolist_list_var_2 = cdolist_list_var_2.rest() , binding = cdolist_list_var_2.first()) {
                                                                {
                                                                    SubLObject var = binding.first();
                                                                    SubLObject bind = binding.rest();
                                                                    SubLObject query = NIL;
                                                                    if (bind.isCons()) {
                                                                        query = com.cyc.cycjava.cycl.quirk.focus_entity.unpack_existential_query(bind, cyc_entity);
                                                                    }
                                                                    if (NIL != query) {
                                                                        {
                                                                            SubLObject query_pred = cycl_utilities.formula_arg0(query);
                                                                            if (NIL == subl_promotions.memberP(query_pred, $list_alt71, UNPROVIDED, UNPROVIDED)) {
                                                                                cycl_queries = cons(search_engine.new_cycl_query(query, UNPROVIDED, UNPROVIDED), cycl_queries);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        if (NIL != process_utilities.task_process(task)) {
                                            kill_process(process_utilities.task_process(task));
                                        }
                                        inference_datastructures_inference.destroy_inference(inference);
                                    } else {
                                        if (NIL != inference_datastructures_inference.inference_p(inference)) {
                                            new_inference_pool = cons(inference_task, new_inference_pool);
                                        }
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt69);
                                }
                            }
                        }
                        continuable_inference_pool = new_inference_pool;
                        sublisp_throw($sym68$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD, cycl_queries);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.quirk.focus_entity.set_focus_entity_continuable_inference_pool(self, continuable_inference_pool);
                            com.cyc.cycjava.cycl.quirk.focus_entity.set_focus_entity_types(self, types);
                            com.cyc.cycjava.cycl.quirk.focus_entity.set_focus_entity_cyc_entity(self, cyc_entity);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_focus_entity_method = Errors.handleThrowable(ccatch_env_var, $sym68$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD);
            }
            return catch_var_for_focus_entity_method;
        }
    }

    public static SubLObject focus_entity_harvest_queries_from_inference_pool_method(final SubLObject self, final SubLObject specificity) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_focus_entity_method = NIL;
        SubLObject continuable_inference_pool = focus_entity.get_focus_entity_continuable_inference_pool(self);
        final SubLObject types = focus_entity.get_focus_entity_types(self);
        final SubLObject cyc_entity = focus_entity.get_focus_entity_cyc_entity(self);
        try {
            thread.throwStack.push(focus_entity.$sym68$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD);
            try {
                SubLObject cycl_queries = NIL;
                SubLObject new_inference_pool = NIL;
                SubLObject cdolist_list_var = continuable_inference_pool;
                SubLObject inference_task = NIL;
                inference_task = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = inference_task;
                    SubLObject task = NIL;
                    SubLObject inference = NIL;
                    destructuring_bind_must_consp(current, datum, focus_entity.$list69);
                    task = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, focus_entity.$list69);
                    inference = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if ((NIL != inference_datastructures_inference.inference_p(inference)) && (inference_datastructures_inference.inference_status(inference) == $SUSPENDED)) {
                            final SubLObject inf = inference;
                            final SubLObject start_id = inference_datastructures_inference.inference_new_answer_id_start(inference);
                            SubLObject end_id;
                            SubLObject id;
                            SubLObject v_answer;
                            SubLObject salient_answer;
                            SubLObject cdolist_list_var_$1;
                            SubLObject justification;
                            SubLObject cdolist_list_var_$2;
                            SubLObject v_bindings;
                            SubLObject binding;
                            SubLObject var;
                            SubLObject bind;
                            SubLObject query;
                            SubLObject query_pred;
                            for (end_id = inference_datastructures_inference.inference_next_new_answer_id(inference), id = NIL, id = start_id; !id.numGE(end_id); id = f_1X(id)) {
                                v_answer = inference_datastructures_inference.find_inference_answer_by_id(inf, id);
                                salient_answer = zerop(specificity);
                                cdolist_list_var_$1 = inference_datastructures_inference.inference_answer_justifications(v_answer);
                                justification = NIL;
                                justification = cdolist_list_var_$1.first();
                                while (NIL != cdolist_list_var_$1) {
                                    if (NIL == salient_answer) {
                                        salient_answer = focus_entity.entity_specific_justification_p(cyc_entity, types, justification, specificity);
                                    }
                                    cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                                    justification = cdolist_list_var_$1.first();
                                } 
                                if (NIL != salient_answer) {
                                    v_bindings = cdolist_list_var_$2 = inference_datastructures_inference.inference_answer_bindings(v_answer);
                                    binding = NIL;
                                    binding = cdolist_list_var_$2.first();
                                    while (NIL != cdolist_list_var_$2) {
                                        var = binding.first();
                                        bind = binding.rest();
                                        query = NIL;
                                        if (bind.isCons()) {
                                            query = focus_entity.unpack_existential_query(bind, cyc_entity);
                                        }
                                        if (NIL != query) {
                                            query_pred = formula_arg0(query);
                                            if (NIL == memberP(query_pred, focus_entity.$list71, UNPROVIDED, UNPROVIDED)) {
                                                cycl_queries = cons(search_engine.new_cycl_query(query, UNPROVIDED, UNPROVIDED), cycl_queries);
                                            }
                                        }
                                        cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                                        binding = cdolist_list_var_$2.first();
                                    } 
                                }
                            }
                            if (NIL != process_utilities.task_process(task)) {
                                kill_process(process_utilities.task_process(task));
                            }
                            inference_datastructures_inference.destroy_inference(inference);
                        } else
                            if (NIL != inference_datastructures_inference.inference_p(inference)) {
                                new_inference_pool = cons(inference_task, new_inference_pool);
                            }

                    } else {
                        cdestructuring_bind_error(datum, focus_entity.$list69);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    inference_task = cdolist_list_var.first();
                } 
                continuable_inference_pool = new_inference_pool;
                sublisp_throw(focus_entity.$sym68$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD, cycl_queries);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    focus_entity.set_focus_entity_continuable_inference_pool(self, continuable_inference_pool);
                    focus_entity.set_focus_entity_types(self, types);
                    focus_entity.set_focus_entity_cyc_entity(self, cyc_entity);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_focus_entity_method = Errors.handleThrowable(ccatch_env_var, focus_entity.$sym68$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_focus_entity_method;
    }

    /**
     *
     *
     * @param SPECIFICITY,
     * 		integerp meant to denote how many levels of inheritance are acceptable
     * 		for a salient query. The lower the number, the tighter the restriction. The default, 0, causes
     * 		salient queries to be inherited without restriction from all supertypes of this entity.
     * @param COMPLETE,
     * 		booleanp. If T, then the method will return only after all the inferences
     * 		that were started to compute salient queries are complete. If NIL the method will return
     * 		immediately with all the salient queries discovered so far.
     * @return listp, a list of salient cycl-query-p.
     * @unknown bertolo
     */
    @LispMethod(comment = "@param SPECIFICITY,\r\n\t\tintegerp meant to denote how many levels of inheritance are acceptable\r\n\t\tfor a salient query. The lower the number, the tighter the restriction. The default, 0, causes\r\n\t\tsalient queries to be inherited without restriction from all supertypes of this entity.\r\n@param COMPLETE,\r\n\t\tbooleanp. If T, then the method will return only after all the inferences\r\n\t\tthat were started to compute salient queries are complete. If NIL the method will return\r\n\t\timmediately with all the salient queries discovered so far.\r\n@return listp, a list of salient cycl-query-p.\r\n@unknown bertolo")
    public static final SubLObject focus_entity_get_salient_queries_method_alt(SubLObject self, SubLObject completeness, SubLObject specificity) {
        if (completeness == UNPROVIDED) {
            completeness = $CURRENT;
        }
        if (specificity == UNPROVIDED) {
            specificity = ZERO_INTEGER;
        }
        {
            SubLObject catch_var_for_focus_entity_method = NIL;
            SubLObject salient_queries = com.cyc.cycjava.cycl.quirk.focus_entity.get_focus_entity_salient_queries(self);
            try {
                try {
                    SubLTrampolineFile.checkType(specificity, INTEGERP);
                    {
                        SubLObject pcase_var = completeness;
                        if (pcase_var.eql($CURRENT)) {
                            sublisp_throw($sym77$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD, salient_queries);
                        } else {
                            if (pcase_var.eql($UPDATE)) {
                                {
                                    SubLObject latest = methods.funcall_instance_method_with_1_args(self, HARVEST_QUERIES_FROM_INFERENCE_POOL, specificity);
                                    SubLObject update = salient_queries;
                                    SubLObject cdolist_list_var = latest;
                                    SubLObject l = NIL;
                                    for (l = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , l = cdolist_list_var.first()) {
                                        {
                                            SubLObject item_var = l;
                                            if (NIL == member(item_var, update, CYCL_QUERY_EQUAL_P, symbol_function(IDENTITY))) {
                                                update = cons(item_var, update);
                                            }
                                        }
                                    }
                                    salient_queries = update;
                                    sublisp_throw($sym77$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD, update);
                                }
                            } else {
                                if (pcase_var.eql($ALL)) {
                                    {
                                        SubLObject update = salient_queries;
                                        SubLObject latest = NIL;
                                        while (NIL == methods.funcall_instance_method_with_0_args(self, DONE_COMPUTING_SALIENT_QUERIES)) {
                                            sleep(ONE_INTEGER);
                                        } 
                                        latest = methods.funcall_instance_method_with_1_args(self, HARVEST_QUERIES_FROM_INFERENCE_POOL, specificity);
                                        {
                                            SubLObject cdolist_list_var = latest;
                                            SubLObject l = NIL;
                                            for (l = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , l = cdolist_list_var.first()) {
                                                {
                                                    SubLObject item_var = l;
                                                    if (NIL == member(item_var, update, CYCL_QUERY_EQUAL_P, symbol_function(IDENTITY))) {
                                                        update = cons(item_var, update);
                                                    }
                                                }
                                            }
                                        }
                                        salient_queries = update;
                                        sublisp_throw($sym77$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD, update);
                                    }
                                }
                            }
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.quirk.focus_entity.set_focus_entity_salient_queries(self, salient_queries);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_focus_entity_method = Errors.handleThrowable(ccatch_env_var, $sym77$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD);
            }
            return catch_var_for_focus_entity_method;
        }
    }

    /**
     *
     *
     * @param SPECIFICITY,
     * 		integerp meant to denote how many levels of inheritance are acceptable
     * 		for a salient query. The lower the number, the tighter the restriction. The default, 0, causes
     * 		salient queries to be inherited without restriction from all supertypes of this entity.
     * @param COMPLETE,
     * 		booleanp. If T, then the method will return only after all the inferences
     * 		that were started to compute salient queries are complete. If NIL the method will return
     * 		immediately with all the salient queries discovered so far.
     * @return listp, a list of salient cycl-query-p.
     * @unknown bertolo
     */
    @LispMethod(comment = "@param SPECIFICITY,\r\n\t\tintegerp meant to denote how many levels of inheritance are acceptable\r\n\t\tfor a salient query. The lower the number, the tighter the restriction. The default, 0, causes\r\n\t\tsalient queries to be inherited without restriction from all supertypes of this entity.\r\n@param COMPLETE,\r\n\t\tbooleanp. If T, then the method will return only after all the inferences\r\n\t\tthat were started to compute salient queries are complete. If NIL the method will return\r\n\t\timmediately with all the salient queries discovered so far.\r\n@return listp, a list of salient cycl-query-p.\r\n@unknown bertolo")
    public static SubLObject focus_entity_get_salient_queries_method(final SubLObject self, SubLObject completeness, SubLObject specificity) {
        if (completeness == UNPROVIDED) {
            completeness = $CURRENT;
        }
        if (specificity == UNPROVIDED) {
            specificity = ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_focus_entity_method = NIL;
        SubLObject salient_queries = focus_entity.get_focus_entity_salient_queries(self);
        try {
            thread.throwStack.push(focus_entity.$sym77$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD);
            try {
                assert NIL != integerp(specificity) : "! integerp(specificity) " + ("Types.integerp(specificity) " + "CommonSymbols.NIL != Types.integerp(specificity) ") + specificity;
                final SubLObject pcase_var = completeness;
                if (pcase_var.eql($CURRENT)) {
                    sublisp_throw(focus_entity.$sym77$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD, salient_queries);
                } else
                    if (pcase_var.eql($UPDATE)) {
                        final SubLObject latest = funcall_instance_method_with_1_args(self, focus_entity.HARVEST_QUERIES_FROM_INFERENCE_POOL, specificity);
                        SubLObject update = salient_queries;
                        SubLObject cdolist_list_var = latest;
                        SubLObject l = NIL;
                        l = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            final SubLObject item_var = l;
                            if (NIL == member(item_var, update, focus_entity.CYCL_QUERY_EQUAL_P, symbol_function(IDENTITY))) {
                                update = cons(item_var, update);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            l = cdolist_list_var.first();
                        } 
                        salient_queries = update;
                        sublisp_throw(focus_entity.$sym77$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD, update);
                    } else
                        if (pcase_var.eql($ALL)) {
                            SubLObject update2 = salient_queries;
                            SubLObject latest2 = NIL;
                            while (NIL == funcall_instance_method_with_0_args(self, focus_entity.DONE_COMPUTING_SALIENT_QUERIES)) {
                                sleep(ONE_INTEGER);
                            } 
                            SubLObject cdolist_list_var;
                            latest2 = cdolist_list_var = funcall_instance_method_with_1_args(self, focus_entity.HARVEST_QUERIES_FROM_INFERENCE_POOL, specificity);
                            SubLObject l = NIL;
                            l = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                final SubLObject item_var = l;
                                if (NIL == member(item_var, update2, focus_entity.CYCL_QUERY_EQUAL_P, symbol_function(IDENTITY))) {
                                    update2 = cons(item_var, update2);
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                l = cdolist_list_var.first();
                            } 
                            salient_queries = update2;
                            sublisp_throw(focus_entity.$sym77$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD, update2);
                        }


            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    focus_entity.set_focus_entity_salient_queries(self, salient_queries);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_focus_entity_method = Errors.handleThrowable(ccatch_env_var, focus_entity.$sym77$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_focus_entity_method;
    }

    /**
     *
     *
     * @return BOOLEAN; T iff no inference that has been started to compute
    salient queries is still running.
     * @unknown 
     */
    @LispMethod(comment = "@return BOOLEAN; T iff no inference that has been started to compute\r\nsalient queries is still running.\r\n@unknown")
    public static final SubLObject focus_entity_done_computing_salient_queries_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_focus_entity_method = NIL;
            SubLObject continuable_inference_pool = com.cyc.cycjava.cycl.quirk.focus_entity.get_focus_entity_continuable_inference_pool(self);
            try {
                try {
                    {
                        SubLObject still_working = NIL;
                        if (NIL == still_working) {
                            {
                                SubLObject csome_list_var = continuable_inference_pool;
                                SubLObject inference_task = NIL;
                                for (inference_task = csome_list_var.first(); !((NIL != still_working) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , inference_task = csome_list_var.first()) {
                                    {
                                        SubLObject datum = inference_task;
                                        SubLObject current = datum;
                                        SubLObject task = NIL;
                                        SubLObject inference = NIL;
                                        destructuring_bind_must_consp(current, datum, $list_alt69);
                                        task = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list_alt69);
                                        inference = current.first();
                                        current = current.rest();
                                        if (NIL == current) {
                                            if (NIL != inference_datastructures_inference.inference_p(inference)) {
                                                {
                                                    SubLObject status = inference_datastructures_inference.inference_status(inference);
                                                    still_working = member(status, $list_alt86, UNPROVIDED, UNPROVIDED);
                                                }
                                            }
                                        } else {
                                            cdestructuring_bind_error(datum, $list_alt69);
                                        }
                                    }
                                }
                            }
                        }
                        sublisp_throw($sym85$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD, makeBoolean(NIL == still_working));
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.quirk.focus_entity.set_focus_entity_continuable_inference_pool(self, continuable_inference_pool);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_focus_entity_method = Errors.handleThrowable(ccatch_env_var, $sym85$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD);
            }
            return catch_var_for_focus_entity_method;
        }
    }

    /**
     *
     *
     * @return BOOLEAN; T iff no inference that has been started to compute
    salient queries is still running.
     * @unknown 
     */
    @LispMethod(comment = "@return BOOLEAN; T iff no inference that has been started to compute\r\nsalient queries is still running.\r\n@unknown")
    public static SubLObject focus_entity_done_computing_salient_queries_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_focus_entity_method = NIL;
        final SubLObject continuable_inference_pool = focus_entity.get_focus_entity_continuable_inference_pool(self);
        try {
            thread.throwStack.push(focus_entity.$sym85$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD);
            try {
                SubLObject still_working = NIL;
                if (NIL == still_working) {
                    SubLObject csome_list_var = continuable_inference_pool;
                    SubLObject inference_task = NIL;
                    inference_task = csome_list_var.first();
                    while ((NIL == still_working) && (NIL != csome_list_var)) {
                        SubLObject current;
                        final SubLObject datum = current = inference_task;
                        SubLObject task = NIL;
                        SubLObject inference = NIL;
                        destructuring_bind_must_consp(current, datum, focus_entity.$list69);
                        task = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, focus_entity.$list69);
                        inference = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            if (NIL != inference_datastructures_inference.inference_p(inference)) {
                                final SubLObject status = inference_datastructures_inference.inference_status(inference);
                                still_working = member(status, focus_entity.$list86, UNPROVIDED, UNPROVIDED);
                            }
                        } else {
                            cdestructuring_bind_error(datum, focus_entity.$list69);
                        }
                        csome_list_var = csome_list_var.rest();
                        inference_task = csome_list_var.first();
                    } 
                }
                sublisp_throw(focus_entity.$sym85$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD, makeBoolean(NIL == still_working));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    focus_entity.set_focus_entity_continuable_inference_pool(self, continuable_inference_pool);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_focus_entity_method = Errors.handleThrowable(ccatch_env_var, focus_entity.$sym85$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_focus_entity_method;
    }

    /**
     *
     *
     * @return focus-entity-p, this focus entity
    As a side effect it computes the answers to all the salient queries for this entity.
     * @unknown bertolo
     */
    @LispMethod(comment = "@return focus-entity-p, this focus entity\r\nAs a side effect it computes the answers to all the salient queries for this entity.\r\n@unknown bertolo")
    public static final SubLObject focus_entity_answer_salient_queries_method_alt(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_focus_entity_method = NIL;
                SubLObject answers = com.cyc.cycjava.cycl.quirk.focus_entity.get_focus_entity_answers(self);
                SubLObject unanswered_questions = com.cyc.cycjava.cycl.quirk.focus_entity.get_focus_entity_unanswered_questions(self);
                SubLObject salient_queries = com.cyc.cycjava.cycl.quirk.focus_entity.get_focus_entity_salient_queries(self);
                try {
                    try {
                        {
                            SubLObject _prev_bind_0 = $ask_quirkP$.currentBinding(thread);
                            try {
                                $ask_quirkP$.bind(T, thread);
                                {
                                    SubLObject cdolist_list_var = salient_queries;
                                    SubLObject query = NIL;
                                    for (query = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , query = cdolist_list_var.first()) {
                                        {
                                            SubLObject local_answers = methods.funcall_instance_method_with_0_args(query, ANSWER);
                                            if (NIL == local_answers) {
                                                unanswered_questions = cons(query, unanswered_questions);
                                            }
                                            {
                                                SubLObject cdolist_list_var_3 = local_answers;
                                                SubLObject v_answer = NIL;
                                                for (v_answer = cdolist_list_var_3.first(); NIL != cdolist_list_var_3; cdolist_list_var_3 = cdolist_list_var_3.rest() , v_answer = cdolist_list_var_3.first()) {
                                                    answers = cons(v_answer, answers);
                                                }
                                            }
                                        }
                                    }
                                }
                            } finally {
                                $ask_quirkP$.rebind(_prev_bind_0, thread);
                            }
                        }
                        sublisp_throw($sym90$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD, self);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                com.cyc.cycjava.cycl.quirk.focus_entity.set_focus_entity_answers(self, answers);
                                com.cyc.cycjava.cycl.quirk.focus_entity.set_focus_entity_unanswered_questions(self, unanswered_questions);
                                com.cyc.cycjava.cycl.quirk.focus_entity.set_focus_entity_salient_queries(self, salient_queries);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_focus_entity_method = Errors.handleThrowable(ccatch_env_var, $sym90$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD);
                }
                return catch_var_for_focus_entity_method;
            }
        }
    }

    /**
     *
     *
     * @return focus-entity-p, this focus entity
    As a side effect it computes the answers to all the salient queries for this entity.
     * @unknown bertolo
     */
    @LispMethod(comment = "@return focus-entity-p, this focus entity\r\nAs a side effect it computes the answers to all the salient queries for this entity.\r\n@unknown bertolo")
    public static SubLObject focus_entity_answer_salient_queries_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_focus_entity_method = NIL;
        SubLObject answers = focus_entity.get_focus_entity_answers(self);
        SubLObject unanswered_questions = focus_entity.get_focus_entity_unanswered_questions(self);
        final SubLObject salient_queries = focus_entity.get_focus_entity_salient_queries(self);
        try {
            thread.throwStack.push(focus_entity.$sym90$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD);
            try {
                final SubLObject _prev_bind_0 = $ask_quirkP$.currentBinding(thread);
                try {
                    $ask_quirkP$.bind(T, thread);
                    SubLObject cdolist_list_var = salient_queries;
                    SubLObject query = NIL;
                    query = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject local_answers = funcall_instance_method_with_0_args(query, ANSWER);
                        if (NIL == local_answers) {
                            unanswered_questions = cons(query, unanswered_questions);
                        }
                        SubLObject cdolist_list_var_$3 = local_answers;
                        SubLObject v_answer = NIL;
                        v_answer = cdolist_list_var_$3.first();
                        while (NIL != cdolist_list_var_$3) {
                            answers = cons(v_answer, answers);
                            cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                            v_answer = cdolist_list_var_$3.first();
                        } 
                        cdolist_list_var = cdolist_list_var.rest();
                        query = cdolist_list_var.first();
                    } 
                } finally {
                    $ask_quirkP$.rebind(_prev_bind_0, thread);
                }
                sublisp_throw(focus_entity.$sym90$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD, self);
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    focus_entity.set_focus_entity_answers(self, answers);
                    focus_entity.set_focus_entity_unanswered_questions(self, unanswered_questions);
                    focus_entity.set_focus_entity_salient_queries(self, salient_queries);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_focus_entity_method = Errors.handleThrowable(ccatch_env_var, focus_entity.$sym90$OUTER_CATCH_FOR_FOCUS_ENTITY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_focus_entity_method;
    }

    public static final SubLObject get_textual_focus_entity_learned_textual_types_alt(SubLObject textual_focus_entity) {
        return classes.subloop_get_access_protected_instance_slot(textual_focus_entity, FOURTEEN_INTEGER, LEARNED_TEXTUAL_TYPES);
    }

    public static SubLObject get_textual_focus_entity_learned_textual_types(final SubLObject textual_focus_entity) {
        return subloop_get_access_protected_instance_slot(textual_focus_entity, FOURTEEN_INTEGER, focus_entity.LEARNED_TEXTUAL_TYPES);
    }

    public static final SubLObject set_textual_focus_entity_learned_textual_types_alt(SubLObject textual_focus_entity, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(textual_focus_entity, value, FOURTEEN_INTEGER, LEARNED_TEXTUAL_TYPES);
    }

    public static SubLObject set_textual_focus_entity_learned_textual_types(final SubLObject textual_focus_entity, final SubLObject value) {
        return subloop_set_access_protected_instance_slot(textual_focus_entity, value, FOURTEEN_INTEGER, focus_entity.LEARNED_TEXTUAL_TYPES);
    }

    public static final SubLObject get_textual_focus_entity_passages_alt(SubLObject textual_focus_entity) {
        return classes.subloop_get_access_protected_instance_slot(textual_focus_entity, THIRTEEN_INTEGER, PASSAGES);
    }

    public static SubLObject get_textual_focus_entity_passages(final SubLObject textual_focus_entity) {
        return subloop_get_access_protected_instance_slot(textual_focus_entity, THIRTEEN_INTEGER, PASSAGES);
    }

    public static final SubLObject set_textual_focus_entity_passages_alt(SubLObject textual_focus_entity, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(textual_focus_entity, value, THIRTEEN_INTEGER, PASSAGES);
    }

    public static SubLObject set_textual_focus_entity_passages(final SubLObject textual_focus_entity, final SubLObject value) {
        return subloop_set_access_protected_instance_slot(textual_focus_entity, value, THIRTEEN_INTEGER, PASSAGES);
    }

    public static final SubLObject get_textual_focus_entity_name_alt(SubLObject textual_focus_entity) {
        return classes.subloop_get_access_protected_instance_slot(textual_focus_entity, TWELVE_INTEGER, NAME);
    }

    public static SubLObject get_textual_focus_entity_name(final SubLObject textual_focus_entity) {
        return subloop_get_access_protected_instance_slot(textual_focus_entity, TWELVE_INTEGER, NAME);
    }

    public static final SubLObject set_textual_focus_entity_name_alt(SubLObject textual_focus_entity, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(textual_focus_entity, value, TWELVE_INTEGER, NAME);
    }

    public static SubLObject set_textual_focus_entity_name(final SubLObject textual_focus_entity, final SubLObject value) {
        return subloop_set_access_protected_instance_slot(textual_focus_entity, value, TWELVE_INTEGER, NAME);
    }

    public static final SubLObject subloop_reserved_initialize_textual_focus_entity_class_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, FOCUS_ENTITY, SALIENCE_PREDICATES, $list_alt16);
        classes.subloop_initialize_slot(new_instance, FOCUS_ENTITY, QUERY_PARAMETERS, list(new SubLObject[]{ $MAX_NUMBER, FIVE_INTEGER, $MAX_TIME, $int$200, $MAX_TRANSFORMATION_DEPTH, ONE_INTEGER, $BLOCK_, NIL, $MAX_PROOF_DEPTH, NIL, $kw24$CACHE_INFERENCE_RESULTS_, NIL, $ANSWER_LANGUAGE, $HL, $CONTINUABLE_, T, $PRODUCTIVITY_LIMIT, $int$2000000 }));
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_textual_focus_entity_class(final SubLObject new_instance) {
        subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        subloop_initialize_slot(new_instance, focus_entity.FOCUS_ENTITY, focus_entity.SALIENCE_PREDICATES, focus_entity.$list16);
        subloop_initialize_slot(new_instance, focus_entity.FOCUS_ENTITY, focus_entity.QUERY_PARAMETERS, list(new SubLObject[]{ $MAX_NUMBER, FIVE_INTEGER, $MAX_TIME, focus_entity.$int$200, focus_entity.$MAX_TRANSFORMATION_DEPTH, ONE_INTEGER, $BLOCK_, NIL, focus_entity.$MAX_PROOF_DEPTH, NIL, focus_entity.$kw24$CACHE_INFERENCE_RESULTS_, NIL, $ANSWER_LANGUAGE, $HL, $CONTINUABLE_, T, $PRODUCTIVITY_LIMIT, focus_entity.$int$2000000 }));
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_textual_focus_entity_instance_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, FOCUS_ENTITY, CYC_ENTITY, NIL);
        classes.subloop_initialize_slot(new_instance, FOCUS_ENTITY, RELEVANT_MT, NIL);
        classes.subloop_initialize_slot(new_instance, FOCUS_ENTITY, TYPES, NIL);
        classes.subloop_initialize_slot(new_instance, FOCUS_ENTITY, LEARNED_TYPES, NIL);
        classes.subloop_initialize_slot(new_instance, FOCUS_ENTITY, ASSERTED_TYPES, NIL);
        classes.subloop_initialize_slot(new_instance, FOCUS_ENTITY, CONTINUABLE_INFERENCE_POOL, NIL);
        classes.subloop_initialize_slot(new_instance, FOCUS_ENTITY, INFERENCE_POOL_CREATED, NIL);
        classes.subloop_initialize_slot(new_instance, FOCUS_ENTITY, SALIENT_QUERY_JUSTIFICATIONS, NIL);
        classes.subloop_initialize_slot(new_instance, FOCUS_ENTITY, SALIENT_QUERIES, NIL);
        classes.subloop_initialize_slot(new_instance, FOCUS_ENTITY, UNANSWERED_QUESTIONS, NIL);
        classes.subloop_initialize_slot(new_instance, FOCUS_ENTITY, ANSWERS, NIL);
        classes.subloop_initialize_slot(new_instance, TEXTUAL_FOCUS_ENTITY, NAME, NIL);
        classes.subloop_initialize_slot(new_instance, TEXTUAL_FOCUS_ENTITY, PASSAGES, NIL);
        classes.subloop_initialize_slot(new_instance, TEXTUAL_FOCUS_ENTITY, LEARNED_TEXTUAL_TYPES, NIL);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_textual_focus_entity_instance(final SubLObject new_instance) {
        subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        subloop_initialize_slot(new_instance, focus_entity.FOCUS_ENTITY, CYC_ENTITY, NIL);
        subloop_initialize_slot(new_instance, focus_entity.FOCUS_ENTITY, focus_entity.RELEVANT_MT, NIL);
        subloop_initialize_slot(new_instance, focus_entity.FOCUS_ENTITY, TYPES, NIL);
        subloop_initialize_slot(new_instance, focus_entity.FOCUS_ENTITY, focus_entity.LEARNED_TYPES, NIL);
        subloop_initialize_slot(new_instance, focus_entity.FOCUS_ENTITY, focus_entity.ASSERTED_TYPES, NIL);
        subloop_initialize_slot(new_instance, focus_entity.FOCUS_ENTITY, focus_entity.CONTINUABLE_INFERENCE_POOL, NIL);
        subloop_initialize_slot(new_instance, focus_entity.FOCUS_ENTITY, focus_entity.INFERENCE_POOL_CREATED, NIL);
        subloop_initialize_slot(new_instance, focus_entity.FOCUS_ENTITY, focus_entity.SALIENT_QUERY_JUSTIFICATIONS, NIL);
        subloop_initialize_slot(new_instance, focus_entity.FOCUS_ENTITY, SALIENT_QUERIES, NIL);
        subloop_initialize_slot(new_instance, focus_entity.FOCUS_ENTITY, focus_entity.UNANSWERED_QUESTIONS, NIL);
        subloop_initialize_slot(new_instance, focus_entity.FOCUS_ENTITY, ANSWERS, NIL);
        subloop_initialize_slot(new_instance, focus_entity.TEXTUAL_FOCUS_ENTITY, NAME, NIL);
        subloop_initialize_slot(new_instance, focus_entity.TEXTUAL_FOCUS_ENTITY, PASSAGES, NIL);
        subloop_initialize_slot(new_instance, focus_entity.TEXTUAL_FOCUS_ENTITY, focus_entity.LEARNED_TEXTUAL_TYPES, NIL);
        return NIL;
    }

    public static final SubLObject textual_focus_entity_p_alt(SubLObject textual_focus_entity) {
        return classes.subloop_instanceof_class(textual_focus_entity, TEXTUAL_FOCUS_ENTITY);
    }

    public static SubLObject textual_focus_entity_p(final SubLObject textual_focus_entity) {
        return subloop_instanceof_class(textual_focus_entity, focus_entity.TEXTUAL_FOCUS_ENTITY);
    }

    /**
     *
     *
     * @param NAME,
     * 		stringp, the name of this entity
     * @param CYC-ENTITY,
     * 		cycl-expression, its CycL interpretation
     * @param TYPES,
     * 		a listp of CycL collections
     * @return textual-focus-entity-p, a new textual-focus-entity
     */
    @LispMethod(comment = "@param NAME,\r\n\t\tstringp, the name of this entity\r\n@param CYC-ENTITY,\r\n\t\tcycl-expression, its CycL interpretation\r\n@param TYPES,\r\n\t\ta listp of CycL collections\r\n@return textual-focus-entity-p, a new textual-focus-entity")
    public static final SubLObject new_textual_focus_entity_alt(SubLObject name, SubLObject cyc_entity, SubLObject types) {
        if (types == UNPROVIDED) {
            types = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(name, STRINGP);
            SubLTrampolineFile.checkType(cyc_entity, $sym101$CYCL_EXPRESSION_);
            SubLTrampolineFile.checkType(types, LISTP);
            {
                SubLObject v_new = object.new_class_instance(TEXTUAL_FOCUS_ENTITY);
                SubLObject minimal_types = types;
                SubLObject recoverable_types = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        recoverable_types = isa.min_isa(cyc_entity, UNPROVIDED, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        minimal_types = genls.min_cols(union(recoverable_types, types, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                instances.set_slot(v_new, NAME, name);
                instances.set_slot(v_new, CYC_ENTITY, cyc_entity);
                instances.set_slot(v_new, TYPES, list_utilities.remove_if_not(ADMISSIBLE_FOCUS_ENTITY_TYPE, minimal_types, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                return v_new;
            }
        }
    }

    /**
     *
     *
     * @param NAME,
     * 		stringp, the name of this entity
     * @param CYC-ENTITY,
     * 		cycl-expression, its CycL interpretation
     * @param TYPES,
     * 		a listp of CycL collections
     * @return textual-focus-entity-p, a new textual-focus-entity
     */
    @LispMethod(comment = "@param NAME,\r\n\t\tstringp, the name of this entity\r\n@param CYC-ENTITY,\r\n\t\tcycl-expression, its CycL interpretation\r\n@param TYPES,\r\n\t\ta listp of CycL collections\r\n@return textual-focus-entity-p, a new textual-focus-entity")
    public static SubLObject new_textual_focus_entity(final SubLObject name, final SubLObject cyc_entity, SubLObject types) {
        if (types == UNPROVIDED) {
            types = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(name) : "! stringp(name) " + ("Types.stringp(name) " + "CommonSymbols.NIL != Types.stringp(name) ") + name;
        assert NIL != collection_defns.cycl_expressionP(cyc_entity) : "! collection_defns.cycl_expressionP(cyc_entity) " + ("collection_defns.cycl_expressionP(cyc_entity) " + "CommonSymbols.NIL != collection_defns.cycl_expressionP(cyc_entity) ") + cyc_entity;
        assert NIL != listp(types) : "! listp(types) " + ("Types.listp(types) " + "CommonSymbols.NIL != Types.listp(types) ") + types;
        final SubLObject v_new = new_class_instance(focus_entity.TEXTUAL_FOCUS_ENTITY);
        SubLObject minimal_types = types;
        SubLObject recoverable_types = NIL;
        SubLObject _prev_bind_0 = $relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_2 = $mt$.currentBinding(thread);
        try {
            $relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            $mt$.bind(focus_entity.$$EverythingPSC, thread);
            recoverable_types = min_isa(cyc_entity, UNPROVIDED, UNPROVIDED);
        } finally {
            $mt$.rebind(_prev_bind_2, thread);
            $relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        _prev_bind_0 = $relevant_mt_function$.currentBinding(thread);
        _prev_bind_2 = $mt$.currentBinding(thread);
        try {
            $relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            $mt$.bind(focus_entity.$$EverythingPSC, thread);
            minimal_types = min_cols(union(recoverable_types, types, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        } finally {
            $mt$.rebind(_prev_bind_2, thread);
            $relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        set_slot(v_new, NAME, name);
        set_slot(v_new, CYC_ENTITY, cyc_entity);
        set_slot(v_new, TYPES, remove_if_not(focus_entity.ADMISSIBLE_FOCUS_ENTITY_TYPE, minimal_types, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return v_new;
    }

    public static final SubLObject textual_focus_entity_name_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_textual_focus_entity_method = NIL;
            SubLObject name = com.cyc.cycjava.cycl.quirk.focus_entity.get_textual_focus_entity_name(self);
            try {
                try {
                    sublisp_throw($sym105$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD, name);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.quirk.focus_entity.set_textual_focus_entity_name(self, name);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_textual_focus_entity_method = Errors.handleThrowable(ccatch_env_var, $sym105$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD);
            }
            return catch_var_for_textual_focus_entity_method;
        }
    }

    public static SubLObject textual_focus_entity_name_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_textual_focus_entity_method = NIL;
        final SubLObject name = focus_entity.get_textual_focus_entity_name(self);
        try {
            thread.throwStack.push(focus_entity.$sym105$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD);
            try {
                sublisp_throw(focus_entity.$sym105$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD, name);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    focus_entity.set_textual_focus_entity_name(self, name);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_textual_focus_entity_method = Errors.handleThrowable(ccatch_env_var, focus_entity.$sym105$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_textual_focus_entity_method;
    }

    public static final SubLObject textual_focus_entity_print_method_alt(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject catch_var_for_textual_focus_entity_method = NIL;
            SubLObject name = com.cyc.cycjava.cycl.quirk.focus_entity.get_textual_focus_entity_name(self);
            SubLObject answers = com.cyc.cycjava.cycl.quirk.focus_entity.get_focus_entity_answers(self);
            SubLObject instance_number = object.get_object_instance_number(self);
            try {
                try {
                    write_string($str_alt111$__ESS_ENT_, stream, UNPROVIDED, UNPROVIDED);
                    prin1(instance_number, stream);
                    write_string($str_alt112$__, stream, UNPROVIDED, UNPROVIDED);
                    prin1(name, stream);
                    write_string($str_alt113$_types__, stream, UNPROVIDED, UNPROVIDED);
                    prin1(length(methods.funcall_instance_method_with_0_args(self, ALL_TYPES)), stream);
                    write_string($str_alt114$_facts__, stream, UNPROVIDED, UNPROVIDED);
                    prin1(length(answers), stream);
                    write_string($str_alt115$_, stream, UNPROVIDED, UNPROVIDED);
                    terpri(stream);
                    sublisp_throw($sym110$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.quirk.focus_entity.set_textual_focus_entity_name(self, name);
                            com.cyc.cycjava.cycl.quirk.focus_entity.set_focus_entity_answers(self, answers);
                            object.set_object_instance_number(self, instance_number);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_textual_focus_entity_method = Errors.handleThrowable(ccatch_env_var, $sym110$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD);
            }
            return catch_var_for_textual_focus_entity_method;
        }
    }

    public static SubLObject textual_focus_entity_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_textual_focus_entity_method = NIL;
        final SubLObject name = focus_entity.get_textual_focus_entity_name(self);
        final SubLObject answers = focus_entity.get_focus_entity_answers(self);
        final SubLObject instance_number = get_object_instance_number(self);
        try {
            thread.throwStack.push(focus_entity.$sym110$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD);
            try {
                write_string(focus_entity.$str111$__ESS_ENT_, stream, UNPROVIDED, UNPROVIDED);
                prin1(instance_number, stream);
                write_string(focus_entity.$str112$__, stream, UNPROVIDED, UNPROVIDED);
                prin1(name, stream);
                write_string(focus_entity.$str113$_types__, stream, UNPROVIDED, UNPROVIDED);
                prin1(length(funcall_instance_method_with_0_args(self, ALL_TYPES)), stream);
                write_string(focus_entity.$str114$_facts__, stream, UNPROVIDED, UNPROVIDED);
                prin1(length(answers), stream);
                write_string(focus_entity.$str115$_, stream, UNPROVIDED, UNPROVIDED);
                terpri(stream);
                sublisp_throw(focus_entity.$sym110$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    focus_entity.set_textual_focus_entity_name(self, name);
                    focus_entity.set_focus_entity_answers(self, answers);
                    set_object_instance_number(self, instance_number);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_textual_focus_entity_method = Errors.handleThrowable(ccatch_env_var, focus_entity.$sym110$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_textual_focus_entity_method;
    }

    /**
     *
     *
     * @return booleanp; non-nil if OBJECT is equal to this entity, nil otherwise
     */
    @LispMethod(comment = "@return booleanp; non-nil if OBJECT is equal to this entity, nil otherwise")
    public static final SubLObject textual_focus_entity_equal_method_alt(SubLObject self, SubLObject v_object) {
        {
            SubLObject catch_var_for_textual_focus_entity_method = NIL;
            SubLObject name = com.cyc.cycjava.cycl.quirk.focus_entity.get_textual_focus_entity_name(self);
            try {
                try {
                    sublisp_throw($sym119$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD, makeBoolean((NIL != com.cyc.cycjava.cycl.quirk.focus_entity.textual_focus_entity_p(v_object)) && name.equal(methods.funcall_instance_method_with_0_args(v_object, NAME))));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.quirk.focus_entity.set_textual_focus_entity_name(self, name);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_textual_focus_entity_method = Errors.handleThrowable(ccatch_env_var, $sym119$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD);
            }
            return catch_var_for_textual_focus_entity_method;
        }
    }

    /**
     *
     *
     * @return booleanp; non-nil if OBJECT is equal to this entity, nil otherwise
     */
    @LispMethod(comment = "@return booleanp; non-nil if OBJECT is equal to this entity, nil otherwise")
    public static SubLObject textual_focus_entity_equal_method(final SubLObject self, final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_textual_focus_entity_method = NIL;
        final SubLObject name = focus_entity.get_textual_focus_entity_name(self);
        try {
            thread.throwStack.push(focus_entity.$sym119$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD);
            try {
                sublisp_throw(focus_entity.$sym119$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD, makeBoolean((NIL != focus_entity.textual_focus_entity_p(v_object)) && name.equal(funcall_instance_method_with_0_args(v_object, NAME))));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    focus_entity.set_textual_focus_entity_name(self, name);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_textual_focus_entity_method = Errors.handleThrowable(ccatch_env_var, focus_entity.$sym119$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_textual_focus_entity_method;
    }

    public static final SubLObject textual_focus_entity_equal_alt(SubLObject e1, SubLObject e2) {
        SubLTrampolineFile.checkType(e1, TEXTUAL_FOCUS_ENTITY_P);
        SubLTrampolineFile.checkType(e2, TEXTUAL_FOCUS_ENTITY_P);
        return methods.funcall_instance_method_with_1_args(e1, EQUAL, e2);
    }

    public static SubLObject textual_focus_entity_equal(final SubLObject e1, final SubLObject e2) {
        assert NIL != focus_entity.textual_focus_entity_p(e1) : "! focus_entity.textual_focus_entity_p(e1) " + ("focus_entity.textual_focus_entity_p(e1) " + "CommonSymbols.NIL != focus_entity.textual_focus_entity_p(e1) ") + e1;
        assert NIL != focus_entity.textual_focus_entity_p(e2) : "! focus_entity.textual_focus_entity_p(e2) " + ("focus_entity.textual_focus_entity_p(e2) " + "CommonSymbols.NIL != focus_entity.textual_focus_entity_p(e2) ") + e2;
        return funcall_instance_method_with_1_args(e1, EQUAL, e2);
    }

    /**
     *
     *
     * @return a chronological summary of all information known about this entity.
     * @unknown bertolo
     */
    @LispMethod(comment = "@return a chronological summary of all information known about this entity.\r\n@unknown bertolo")
    public static final SubLObject textual_focus_entity_chronology_method_alt(SubLObject self) {
        return methods.funcall_instance_method_with_1_args(self, RENDER, $list_alt125);
    }

    /**
     *
     *
     * @return a chronological summary of all information known about this entity.
     * @unknown bertolo
     */
    @LispMethod(comment = "@return a chronological summary of all information known about this entity.\r\n@unknown bertolo")
    public static SubLObject textual_focus_entity_chronology_method(final SubLObject self) {
        return funcall_instance_method_with_1_args(self, focus_entity.RENDER, focus_entity.$list125);
    }

    /**
     *
     *
     * @return a summary of all information known about this entity.
     * @unknown bertolo
     */
    @LispMethod(comment = "@return a summary of all information known about this entity.\r\n@unknown bertolo")
    public static final SubLObject textual_focus_entity_render_method_alt(SubLObject self, SubLObject strategy) {
        if (strategy == UNPROVIDED) {
            strategy = $list_alt129;
        }
        {
            SubLObject catch_var_for_textual_focus_entity_method = NIL;
            SubLObject name = com.cyc.cycjava.cycl.quirk.focus_entity.get_textual_focus_entity_name(self);
            SubLObject answers = com.cyc.cycjava.cycl.quirk.focus_entity.get_focus_entity_answers(self);
            try {
                try {
                    {
                        SubLObject format = getf(strategy, $FORMAT, UNPROVIDED);
                        SubLObject order = getf(strategy, $ORDER, UNPROVIDED);
                        SubLObject accumulator = NIL;
                        {
                            SubLObject pcase_var = format;
                            if (pcase_var.eql($TEXT)) {
                                accumulator = cconcatenate(name, new SubLObject[]{ $str_alt134$_, string_utilities.$new_line_string$.getGlobalValue(), string_utilities.$new_line_string$.getGlobalValue() });
                            }
                        }
                        {
                            SubLObject pcase_var = order;
                            if (pcase_var.eql($SEQUENTIAL)) {
                                {
                                    SubLObject cdolist_list_var = answers;
                                    SubLObject v_answer = NIL;
                                    for (v_answer = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_answer = cdolist_list_var.first()) {
                                        {
                                            SubLObject justification = methods.funcall_instance_method_with_0_args(v_answer, JUSTIFY);
                                            SubLObject source = (NIL != search_engine.corpus_passage_p(justification)) ? ((SubLObject) (methods.funcall_instance_method_with_0_args(justification, GET_SOURCE))) : $str_alt138$;
                                            accumulator = cconcatenate(accumulator, new SubLObject[]{ methods.funcall_instance_method_with_0_args(v_answer, GET_CONTENT), string_utilities.$new_line_string$.getGlobalValue(), $str_alt140$_, source, $str_alt141$_, string_utilities.$new_line_string$.getGlobalValue(), string_utilities.$new_line_string$.getGlobalValue() });
                                        }
                                    }
                                }
                            } else {
                                if (pcase_var.eql($CHRONOLOGICAL)) {
                                    {
                                        SubLObject sorted = Sort.sort(copy_list(answers), ANSWER_OLDER_METHOD, UNPROVIDED);
                                        SubLObject cdolist_list_var = sorted;
                                        SubLObject v_answer = NIL;
                                        for (v_answer = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_answer = cdolist_list_var.first()) {
                                            {
                                                SubLObject justification = methods.funcall_instance_method_with_0_args(v_answer, JUSTIFY);
                                                SubLObject source = (NIL != search_engine.corpus_passage_p(justification)) ? ((SubLObject) (methods.funcall_instance_method_with_0_args(justification, GET_SOURCE))) : $str_alt138$;
                                                accumulator = cconcatenate(accumulator, new SubLObject[]{ methods.funcall_instance_method_with_0_args(v_answer, GET_CONTENT), string_utilities.$new_line_string$.getGlobalValue(), $str_alt140$_, source, $str_alt141$_, string_utilities.$new_line_string$.getGlobalValue(), string_utilities.$new_line_string$.getGlobalValue() });
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        sublisp_throw($sym130$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD, accumulator);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.quirk.focus_entity.set_textual_focus_entity_name(self, name);
                            com.cyc.cycjava.cycl.quirk.focus_entity.set_focus_entity_answers(self, answers);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_textual_focus_entity_method = Errors.handleThrowable(ccatch_env_var, $sym130$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD);
            }
            return catch_var_for_textual_focus_entity_method;
        }
    }

    /**
     *
     *
     * @return a summary of all information known about this entity.
     * @unknown bertolo
     */
    @LispMethod(comment = "@return a summary of all information known about this entity.\r\n@unknown bertolo")
    public static SubLObject textual_focus_entity_render_method(final SubLObject self, SubLObject strategy) {
        if (strategy == UNPROVIDED) {
            strategy = focus_entity.$list129;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_textual_focus_entity_method = NIL;
        final SubLObject name = focus_entity.get_textual_focus_entity_name(self);
        final SubLObject answers = focus_entity.get_focus_entity_answers(self);
        try {
            thread.throwStack.push(focus_entity.$sym130$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD);
            try {
                final SubLObject format = getf(strategy, $FORMAT, UNPROVIDED);
                final SubLObject order = getf(strategy, $ORDER, UNPROVIDED);
                SubLObject accumulator = NIL;
                SubLObject pcase_var = format;
                if (pcase_var.eql($TEXT)) {
                    accumulator = cconcatenate(name, new SubLObject[]{ focus_entity.$str134$_, $new_line_string$.getGlobalValue(), $new_line_string$.getGlobalValue() });
                }
                pcase_var = order;
                if (pcase_var.eql($SEQUENTIAL)) {
                    SubLObject cdolist_list_var = answers;
                    SubLObject v_answer = NIL;
                    v_answer = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject justification = funcall_instance_method_with_0_args(v_answer, focus_entity.JUSTIFY);
                        final SubLObject source = (NIL != search_engine.corpus_passage_p(justification)) ? funcall_instance_method_with_0_args(justification, GET_SOURCE) : focus_entity.$str138$;
                        accumulator = cconcatenate(accumulator, new SubLObject[]{ funcall_instance_method_with_0_args(v_answer, GET_CONTENT), $new_line_string$.getGlobalValue(), focus_entity.$str140$_, source, focus_entity.$str141$_, $new_line_string$.getGlobalValue(), $new_line_string$.getGlobalValue() });
                        cdolist_list_var = cdolist_list_var.rest();
                        v_answer = cdolist_list_var.first();
                    } 
                } else
                    if (pcase_var.eql($CHRONOLOGICAL)) {
                        SubLObject cdolist_list_var2;
                        final SubLObject sorted = cdolist_list_var2 = Sort.sort(copy_list(answers), focus_entity.ANSWER_OLDER_METHOD, UNPROVIDED);
                        SubLObject v_answer2 = NIL;
                        v_answer2 = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            final SubLObject justification2 = funcall_instance_method_with_0_args(v_answer2, focus_entity.JUSTIFY);
                            final SubLObject source2 = (NIL != search_engine.corpus_passage_p(justification2)) ? funcall_instance_method_with_0_args(justification2, GET_SOURCE) : focus_entity.$str138$;
                            accumulator = cconcatenate(accumulator, new SubLObject[]{ funcall_instance_method_with_0_args(v_answer2, GET_CONTENT), $new_line_string$.getGlobalValue(), focus_entity.$str140$_, source2, focus_entity.$str141$_, $new_line_string$.getGlobalValue(), $new_line_string$.getGlobalValue() });
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            v_answer2 = cdolist_list_var2.first();
                        } 
                    }

                sublisp_throw(focus_entity.$sym130$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD, accumulator);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    focus_entity.set_textual_focus_entity_name(self, name);
                    focus_entity.set_focus_entity_answers(self, answers);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_textual_focus_entity_method = Errors.handleThrowable(ccatch_env_var, focus_entity.$sym130$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_textual_focus_entity_method;
    }

    /**
     *
     *
     * @param CORPORA,
     * 		listp a list of strings denoting available corpora
     * @return textual-focus-entity-p, this entity.
    As a side effect it consults documents in CORPORA to try to learn its own type.
     * @unknown bertolo
     */
    @LispMethod(comment = "@param CORPORA,\r\n\t\tlistp a list of strings denoting available corpora\r\n@return textual-focus-entity-p, this entity.\r\nAs a side effect it consults documents in CORPORA to try to learn its own type.\r\n@unknown bertolo")
    public static final SubLObject textual_focus_entity_learn_types_from_corpora_method_alt(SubLObject self, SubLObject corpora) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_textual_focus_entity_method = NIL;
                SubLObject name = com.cyc.cycjava.cycl.quirk.focus_entity.get_textual_focus_entity_name(self);
                SubLObject answers = com.cyc.cycjava.cycl.quirk.focus_entity.get_focus_entity_answers(self);
                SubLObject unanswered_questions = com.cyc.cycjava.cycl.quirk.focus_entity.get_focus_entity_unanswered_questions(self);
                SubLObject learned_types = com.cyc.cycjava.cycl.quirk.focus_entity.get_focus_entity_learned_types(self);
                try {
                    try {
                        SubLTrampolineFile.checkType(corpora, LISTP);
                        {
                            SubLObject current_types = methods.funcall_instance_method_with_0_args(self, ALL_TYPES);
                            SubLObject local_answers = NIL;
                            SubLObject who_type = NIL;
                            SubLObject v_question = NIL;
                            {
                                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                    who_type = genls.any_genl_anyP(current_types, $list_alt149, UNPROVIDED, UNPROVIDED);
                                } finally {
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                                }
                            }
                            if (NIL != who_type) {
                                v_question = question.new_question(cconcatenate($str_alt150$Who_is_, new SubLObject[]{ name, $str_alt151$_ }), UNPROVIDED, UNPROVIDED);
                            } else {
                                v_question = question.new_question(cconcatenate($str_alt152$What_is_, new SubLObject[]{ name, $str_alt151$_ }), UNPROVIDED, UNPROVIDED);
                            }
                            if (NIL != v_question) {
                                local_answers = methods.funcall_instance_method_with_0_args(v_question, ANSWER);
                            }
                            if (NIL == local_answers) {
                                unanswered_questions = cons(v_question, unanswered_questions);
                            }
                            {
                                SubLObject cdolist_list_var = local_answers;
                                SubLObject v_answer = NIL;
                                for (v_answer = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_answer = cdolist_list_var.first()) {
                                    answers = cons(v_answer, answers);
                                    {
                                        SubLObject _prev_bind_0 = parsing_vars.$npp_use_nl_tagsP$.currentBinding(thread);
                                        try {
                                            parsing_vars.$npp_use_nl_tagsP$.bind(NIL, thread);
                                            {
                                                SubLObject denots = psp_main.ps_get_cycls_for_np(methods.funcall_instance_method_with_0_args(v_answer, GET_CONTENT), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                SubLObject cdolist_list_var_4 = denots;
                                                SubLObject denot = NIL;
                                                for (denot = cdolist_list_var_4.first(); NIL != cdolist_list_var_4; cdolist_list_var_4 = cdolist_list_var_4.rest() , denot = cdolist_list_var_4.first()) {
                                                    {
                                                        SubLObject fail = NIL;
                                                        if (NIL == fail) {
                                                            {
                                                                SubLObject csome_list_var = current_types;
                                                                SubLObject type = NIL;
                                                                for (type = csome_list_var.first(); !((NIL != fail) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , type = csome_list_var.first()) {
                                                                    {
                                                                        SubLObject _prev_bind_0_5 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                                                        try {
                                                                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                                                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                                                            fail = disjoint_with.collections_disjointP(denot, type, UNPROVIDED);
                                                                        } finally {
                                                                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                                                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_5, thread);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        if (NIL == fail) {
                                                            current_types = cons(denot, current_types);
                                                            learned_types = cons(denot, learned_types);
                                                        }
                                                    }
                                                }
                                            }
                                        } finally {
                                            parsing_vars.$npp_use_nl_tagsP$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                }
                            }
                            sublisp_throw($sym148$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD, self);
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                com.cyc.cycjava.cycl.quirk.focus_entity.set_textual_focus_entity_name(self, name);
                                com.cyc.cycjava.cycl.quirk.focus_entity.set_focus_entity_answers(self, answers);
                                com.cyc.cycjava.cycl.quirk.focus_entity.set_focus_entity_unanswered_questions(self, unanswered_questions);
                                com.cyc.cycjava.cycl.quirk.focus_entity.set_focus_entity_learned_types(self, learned_types);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_textual_focus_entity_method = Errors.handleThrowable(ccatch_env_var, $sym148$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD);
                }
                return catch_var_for_textual_focus_entity_method;
            }
        }
    }

    /**
     *
     *
     * @param CORPORA,
     * 		listp a list of strings denoting available corpora
     * @return textual-focus-entity-p, this entity.
    As a side effect it consults documents in CORPORA to try to learn its own type.
     * @unknown bertolo
     */
    @LispMethod(comment = "@param CORPORA,\r\n\t\tlistp a list of strings denoting available corpora\r\n@return textual-focus-entity-p, this entity.\r\nAs a side effect it consults documents in CORPORA to try to learn its own type.\r\n@unknown bertolo")
    public static SubLObject textual_focus_entity_learn_types_from_corpora_method(final SubLObject self, final SubLObject corpora) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_textual_focus_entity_method = NIL;
        final SubLObject name = focus_entity.get_textual_focus_entity_name(self);
        SubLObject answers = focus_entity.get_focus_entity_answers(self);
        SubLObject unanswered_questions = focus_entity.get_focus_entity_unanswered_questions(self);
        SubLObject learned_types = focus_entity.get_focus_entity_learned_types(self);
        try {
            thread.throwStack.push(focus_entity.$sym148$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD);
            try {
                assert NIL != listp(corpora) : "! listp(corpora) " + ("Types.listp(corpora) " + "CommonSymbols.NIL != Types.listp(corpora) ") + corpora;
                SubLObject current_types = funcall_instance_method_with_0_args(self, ALL_TYPES);
                SubLObject local_answers = NIL;
                SubLObject who_type = NIL;
                SubLObject v_question = NIL;
                final SubLObject _prev_bind_0 = $relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = $mt$.currentBinding(thread);
                try {
                    $relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    $mt$.bind(focus_entity.$$EverythingPSC, thread);
                    who_type = any_genl_anyP(current_types, focus_entity.$list149, UNPROVIDED, UNPROVIDED);
                } finally {
                    $mt$.rebind(_prev_bind_2, thread);
                    $relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
                if (NIL != who_type) {
                    v_question = question.new_question(cconcatenate(focus_entity.$$$Who_is_, new SubLObject[]{ name, focus_entity.$str151$_ }), UNPROVIDED, UNPROVIDED);
                } else {
                    v_question = question.new_question(cconcatenate(focus_entity.$$$What_is_, new SubLObject[]{ name, focus_entity.$str151$_ }), UNPROVIDED, UNPROVIDED);
                }
                if (NIL != v_question) {
                    local_answers = funcall_instance_method_with_0_args(v_question, ANSWER);
                }
                if (NIL == local_answers) {
                    unanswered_questions = cons(v_question, unanswered_questions);
                }
                SubLObject cdolist_list_var = local_answers;
                SubLObject v_answer = NIL;
                v_answer = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    answers = cons(v_answer, answers);
                    final SubLObject _prev_bind_3 = $npp_use_nl_tagsP$.currentBinding(thread);
                    try {
                        $npp_use_nl_tagsP$.bind(NIL, thread);
                        SubLObject cdolist_list_var_$4;
                        final SubLObject denots = cdolist_list_var_$4 = ps_get_cycls_for_np(funcall_instance_method_with_0_args(v_answer, GET_CONTENT), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        SubLObject denot = NIL;
                        denot = cdolist_list_var_$4.first();
                        while (NIL != cdolist_list_var_$4) {
                            SubLObject fail = NIL;
                            if (NIL == fail) {
                                SubLObject csome_list_var = current_types;
                                SubLObject type = NIL;
                                type = csome_list_var.first();
                                while ((NIL == fail) && (NIL != csome_list_var)) {
                                    final SubLObject _prev_bind_0_$5 = $relevant_mt_function$.currentBinding(thread);
                                    final SubLObject _prev_bind_4 = $mt$.currentBinding(thread);
                                    try {
                                        $relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                        $mt$.bind(focus_entity.$$EverythingPSC, thread);
                                        fail = collections_disjointP(denot, type, UNPROVIDED);
                                    } finally {
                                        $mt$.rebind(_prev_bind_4, thread);
                                        $relevant_mt_function$.rebind(_prev_bind_0_$5, thread);
                                    }
                                    csome_list_var = csome_list_var.rest();
                                    type = csome_list_var.first();
                                } 
                            }
                            if (NIL == fail) {
                                current_types = cons(denot, current_types);
                                learned_types = cons(denot, learned_types);
                            }
                            cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                            denot = cdolist_list_var_$4.first();
                        } 
                    } finally {
                        $npp_use_nl_tagsP$.rebind(_prev_bind_3, thread);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    v_answer = cdolist_list_var.first();
                } 
                sublisp_throw(focus_entity.$sym148$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD, self);
            } finally {
                final SubLObject _prev_bind_5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    focus_entity.set_textual_focus_entity_name(self, name);
                    focus_entity.set_focus_entity_answers(self, answers);
                    focus_entity.set_focus_entity_unanswered_questions(self, unanswered_questions);
                    focus_entity.set_focus_entity_learned_types(self, learned_types);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_textual_focus_entity_method = Errors.handleThrowable(ccatch_env_var, focus_entity.$sym148$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_textual_focus_entity_method;
    }

    static private final SubLList $list_alt2 = list(new SubLObject[]{ list(makeSymbol("SALIENCE-PREDICATES"), makeKeyword("CLASS"), makeKeyword("PUBLIC"), makeKeyword("VALUE"), list(QUOTE, list(reader_make_constant_shell("keStrongSuggestion")))), list(makeSymbol("QUERY-PARAMETERS"), makeKeyword("CLASS"), makeKeyword("PUBLIC"), makeKeyword("VALUE"), list(new SubLObject[]{ makeSymbol("LIST"), makeKeyword("MAX-NUMBER"), FIVE_INTEGER, makeKeyword("MAX-TIME"), makeInteger(200), makeKeyword("MAX-TRANSFORMATION-DEPTH"), ONE_INTEGER, makeKeyword("BLOCK?"), NIL, makeKeyword("MAX-PROOF-DEPTH"), NIL, makeKeyword("CACHE-INFERENCE-RESULTS?"), NIL, makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("CONTINUABLE?"), T, makeKeyword("PRODUCTIVITY-LIMIT"), makeInteger(2000000) })), list(makeSymbol("CYC-ENTITY"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("RELEVANT-MT"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("TYPES"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("LEARNED-TYPES"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("ASSERTED-TYPES"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CONTINUABLE-INFERENCE-POOL"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("INFERENCE-POOL-CREATED"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("SALIENT-QUERY-JUSTIFICATIONS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("SALIENT-QUERIES"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("UNANSWERED-QUESTIONS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("ANSWERS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ALL-TYPES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GENERATE-SALIENT-QUERIES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("KB-INTEGRATE"), NIL, makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COMPUTE-SALIENT-QUERIES"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DONE-COMPUTING-SALIENT-QUERIES"), NIL, makeKeyword("PUBLIC")) });

    static private final SubLList $list_alt16 = list(reader_make_constant_shell("keStrongSuggestion"));

    static private final SubLList $list_alt35 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt36 = list(makeString("@return listp, the list of all Cyc types this entity is know to be an instance of.\n   @owner bertolo"), list(makeSymbol("CLET"), list(list(makeSymbol("RAW"), list(makeSymbol("UNION"), makeSymbol("TYPES"), makeSymbol("LEARNED-TYPES"))), list(makeSymbol("ORGANIZED"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("CANDIDATE-TYPE"), makeSymbol("RAW")), list(makeSymbol("CLET"), list(makeSymbol("FAIL")), list(makeSymbol("CSOME"), list(makeSymbol("EXISTING-TYPE"), makeSymbol("ORGANIZED"), makeSymbol("FAIL")), list(makeSymbol("CSETQ"), makeSymbol("FAIL"), list(makeSymbol("GENL-IN-ANY-MT?"), makeSymbol("EXISTING-TYPE"), makeSymbol("CANDIDATE-TYPE")))), list(makeSymbol("PUNLESS"), makeSymbol("FAIL"), list(makeSymbol("CPUSH"), makeSymbol("CANDIDATE-TYPE"), makeSymbol("ORGANIZED"))))), list(RET, makeSymbol("ORGANIZED"))));

    /**
     *
     *
     * @param PASSAGE
    passage-p
     * 		
     * @return textual-focus-entity; this entity with PASSAGE added to the list
    of passages where the entity occurs
     */
    @LispMethod(comment = "@param PASSAGE\npassage-p\r\n\t\t\r\n@return textual-focus-entity; this entity with PASSAGE added to the list\r\nof passages where the entity occurs")
    public static final SubLObject textual_focus_entity_add_passage_method_alt(SubLObject self, SubLObject passage) {
        {
            SubLObject catch_var_for_textual_focus_entity_method = NIL;
            SubLObject passages = com.cyc.cycjava.cycl.quirk.focus_entity.get_textual_focus_entity_passages(self);
            try {
                try {
                    SubLTrampolineFile.checkType(passage, CORPUS_PASSAGE_P);
                    {
                        SubLObject item_var = passage;
                        if (NIL == member(item_var, passages, PASSAGE_EQUAL, symbol_function(IDENTITY))) {
                            passages = cons(item_var, passages);
                        }
                    }
                    sublisp_throw($sym157$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.quirk.focus_entity.set_textual_focus_entity_passages(self, passages);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_textual_focus_entity_method = Errors.handleThrowable(ccatch_env_var, $sym157$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD);
            }
            return catch_var_for_textual_focus_entity_method;
        }
    }

    /**
     *
     *
     * @param PASSAGE
    passage-p
     * 		
     * @return textual-focus-entity; this entity with PASSAGE added to the list
    of passages where the entity occurs
     */
    @LispMethod(comment = "@param PASSAGE\npassage-p\r\n\t\t\r\n@return textual-focus-entity; this entity with PASSAGE added to the list\r\nof passages where the entity occurs")
    public static SubLObject textual_focus_entity_add_passage_method(final SubLObject self, final SubLObject passage) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_textual_focus_entity_method = NIL;
        SubLObject passages = focus_entity.get_textual_focus_entity_passages(self);
        try {
            thread.throwStack.push(focus_entity.$sym157$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD);
            try {
                assert NIL != search_engine.corpus_passage_p(passage) : "! search_engine.corpus_passage_p(passage) " + ("search_engine.corpus_passage_p(passage) " + "CommonSymbols.NIL != search_engine.corpus_passage_p(passage) ") + passage;
                if (NIL == member(passage, passages, focus_entity.PASSAGE_EQUAL, symbol_function(IDENTITY))) {
                    passages = cons(passage, passages);
                }
                sublisp_throw(focus_entity.$sym157$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    focus_entity.set_textual_focus_entity_passages(self, passages);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_textual_focus_entity_method = Errors.handleThrowable(ccatch_env_var, focus_entity.$sym157$OUTER_CATCH_FOR_TEXTUAL_FOCUS_ENTITY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_textual_focus_entity_method;
    }

    static private final SubLList $list_alt40 = list(makeString("@return focus-entity-p\n   As a side effect it computes all salient queries for this entity, based on what its type(s) \n   is/are known to be.\n   @owner bertolo"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("KB-INTEGRATE"))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("COMPUTE-SALIENT-JUSTIFICATIONS"))), list(makeSymbol("CSETQ"), makeSymbol("INFERENCE-POOL-CREATED"), T), list(RET, makeSymbol("SELF")));

    public static final SubLObject entity_specific_justification_p_alt(SubLObject entity, SubLObject types, SubLObject justification, SubLObject threshold) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(justification, INFERENCE_ANSWER_JUSTIFICATION_P);
            {
                SubLObject degrees_of_separation = ZERO_INTEGER;
                SubLObject justification_steps = inference_datastructures_inference.inference_answer_justification_supports(justification);
                SubLObject broader_than_type = NIL;
                if (NIL == broader_than_type) {
                    {
                        SubLObject csome_list_var = types;
                        SubLObject type = NIL;
                        for (type = csome_list_var.first(); !((NIL != broader_than_type) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , type = csome_list_var.first()) {
                            if (NIL == broader_than_type) {
                                {
                                    SubLObject csome_list_var_6 = justification_steps;
                                    SubLObject step = NIL;
                                    for (step = csome_list_var_6.first(); !((NIL != broader_than_type) || (NIL == csome_list_var_6)); csome_list_var_6 = csome_list_var_6.rest() , step = csome_list_var_6.first()) {
                                        if (step.isCons()) {
                                            if ($ISA == step.first()) {
                                                {
                                                    SubLObject gaf = second(step);
                                                    SubLObject arg1 = cycl_utilities.formula_arg1(gaf, UNPROVIDED);
                                                    SubLObject arg2 = cycl_utilities.formula_arg2(gaf, UNPROVIDED);
                                                    if (entity.equal(arg1)) {
                                                        {
                                                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                                            try {
                                                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                                                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                                                broader_than_type = makeBoolean((!type.eql(arg2)) && (NIL != genls.genlP(type, arg2, UNPROVIDED, UNPROVIDED)));
                                                                degrees_of_separation = length(isa.why_isaP(entity, arg2, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                                            } finally {
                                                                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (NIL != broader_than_type) {
                    return NIL;
                } else {
                    if (degrees_of_separation.numG(threshold)) {
                        return NIL;
                    } else {
                        return T;
                    }
                }
            }
        }
    }

    public static SubLObject entity_specific_justification_p(final SubLObject entity, final SubLObject types, final SubLObject justification, final SubLObject threshold) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != inference_datastructures_inference.inference_answer_justification_p(justification) : "! inference_datastructures_inference.inference_answer_justification_p(justification) " + ("inference_datastructures_inference.inference_answer_justification_p(justification) " + "CommonSymbols.NIL != inference_datastructures_inference.inference_answer_justification_p(justification) ") + justification;
        SubLObject degrees_of_separation = ZERO_INTEGER;
        final SubLObject justification_steps = inference_datastructures_inference.inference_answer_justification_supports(justification);
        SubLObject broader_than_type = NIL;
        if (NIL == broader_than_type) {
            SubLObject csome_list_var = types;
            SubLObject type = NIL;
            type = csome_list_var.first();
            while ((NIL == broader_than_type) && (NIL != csome_list_var)) {
                if (NIL == broader_than_type) {
                    SubLObject csome_list_var_$6 = justification_steps;
                    SubLObject step = NIL;
                    step = csome_list_var_$6.first();
                    while ((NIL == broader_than_type) && (NIL != csome_list_var_$6)) {
                        if (step.isCons() && ($ISA == step.first())) {
                            final SubLObject gaf = second(step);
                            final SubLObject arg1 = formula_arg1(gaf, UNPROVIDED);
                            final SubLObject arg2 = formula_arg2(gaf, UNPROVIDED);
                            if (entity.equal(arg1)) {
                                final SubLObject _prev_bind_0 = $relevant_mt_function$.currentBinding(thread);
                                final SubLObject _prev_bind_2 = $mt$.currentBinding(thread);
                                try {
                                    $relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                    $mt$.bind(focus_entity.$$EverythingPSC, thread);
                                    broader_than_type = makeBoolean((!type.eql(arg2)) && (NIL != genlP(type, arg2, UNPROVIDED, UNPROVIDED)));
                                    degrees_of_separation = length(why_isaP(entity, arg2, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                } finally {
                                    $mt$.rebind(_prev_bind_2, thread);
                                    $relevant_mt_function$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                        csome_list_var_$6 = csome_list_var_$6.rest();
                        step = csome_list_var_$6.first();
                    } 
                }
                csome_list_var = csome_list_var.rest();
                type = csome_list_var.first();
            } 
        }
        if (NIL != broader_than_type) {
            return NIL;
        }
        if (degrees_of_separation.numG(threshold)) {
            return NIL;
        }
        return T;
    }

    static private final SubLList $list_alt45 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt46 = list(makeString("@return focus-entity-p\n   As a side effect it introduces this entity into the KB, based on what its type(s) \n   is/are known to be.\n   @owner bertolo"), list(makeSymbol("CLET"), list(list(makeSymbol("ALL-TYPES"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ALL-TYPES")))), makeSymbol("MIN-TYPES"), makeSymbol("PRED"), makeSymbol("MT")), list(makeSymbol("WITH-ALL-MTS"), list(makeSymbol("CSETQ"), makeSymbol("MIN-TYPES"), list(makeSymbol("MIN-COLS"), makeSymbol("ALL-TYPES")))), list(makeSymbol("PCOND"), list(list(makeSymbol("MEMBER"), reader_make_constant_shell("Person"), makeSymbol("TYPES")), list(makeSymbol("CSETQ"), makeSymbol("PRED"), reader_make_constant_shell("isa")), list(makeSymbol("CSETQ"), makeSymbol("MT"), reader_make_constant_shell("PeopleDataMt"))), list(list(makeSymbol("MEMBER"), reader_make_constant_shell("Organization"), makeSymbol("TYPES")), list(makeSymbol("CSETQ"), makeSymbol("PRED"), reader_make_constant_shell("isa")), list(makeSymbol("CSETQ"), makeSymbol("MT"), reader_make_constant_shell("OrganizationDataMt"))), list(list(makeSymbol("COLLECTION?"), makeSymbol("CYC-ENTITY")), list(makeSymbol("CSETQ"), makeSymbol("PRED"), reader_make_constant_shell("genls")), list(makeSymbol("CSETQ"), makeSymbol("MT"), reader_make_constant_shell("TREC-Mt")))), list(makeSymbol("CDOLIST"), list(makeSymbol("M-TYPE"), makeSymbol("MIN-TYPES")), list(makeSymbol("CLET"), list(list(makeSymbol("ASSERTION"), list(makeSymbol("BQ-LIST"), makeSymbol("PRED"), makeSymbol("CYC-ENTITY"), makeSymbol("M-TYPE"))), list(makeSymbol("WFF-TEST"), list(makeSymbol("EL-WFF?"), makeSymbol("ASSERTION"), makeSymbol("MT"))), list(makeSymbol("SUCCESS"), list(makeSymbol("FWHEN"), makeSymbol("WFF-TEST"), list(makeSymbol("CYC-ASSERT"), makeSymbol("ASSERTION"), makeSymbol("MT"))))), list(makeSymbol("PWHEN"), makeSymbol("SUCCESS"), list(makeSymbol("CPUSH"), makeSymbol("M-TYPE"), makeSymbol("ASSERTED-TYPES")))))), list(RET, makeSymbol("SELF")));

    public static final SubLObject unpack_existential_query_alt(SubLObject formula, SubLObject entity) {
        {
            SubLObject operator = cycl_utilities.formula_operator(formula);
            if ($$thereExists.eql(operator)) {
                return cycl_utilities.formula_arg2(formula, UNPROVIDED);
            } else {
                if ($$relationExistsInstance.eql(operator) || $$relationInstanceExists.eql(operator)) {
                    {
                        SubLObject pred = cycl_utilities.formula_arg1(formula, UNPROVIDED);
                        SubLObject arg1 = (cycl_utilities.formula_arg2(formula, UNPROVIDED).equal(entity)) ? ((SubLObject) (entity)) : $sym166$_WHAT;
                        SubLObject arg2 = (cycl_utilities.formula_arg3(formula, UNPROVIDED).equal(entity)) ? ((SubLObject) (entity)) : $sym166$_WHAT;
                        return list(pred, arg1, arg2);
                    }
                } else {
                    return formula;
                }
            }
        }
    }

    public static SubLObject unpack_existential_query(final SubLObject formula, final SubLObject entity) {
        final SubLObject operator = formula_operator(formula);
        if (focus_entity.$$thereExists.eql(operator)) {
            return formula_arg2(formula, UNPROVIDED);
        }
        if (focus_entity.$$relationExistsInstance.eql(operator) || focus_entity.$$relationInstanceExists.eql(operator)) {
            final SubLObject pred = formula_arg1(formula, UNPROVIDED);
            final SubLObject arg1 = (formula_arg2(formula, UNPROVIDED).equal(entity)) ? entity : focus_entity.$sym166$_WHAT;
            final SubLObject arg2 = (formula_arg3(formula, UNPROVIDED).equal(entity)) ? entity : focus_entity.$sym166$_WHAT;
            return list(pred, arg1, arg2);
        }
        return formula;
    }

    static private final SubLList $list_alt58 = list(makeString("@return focus-entity-p\n   As a side effect it computes all salient queries for this entity, based on what its type(s) \n   is/are known to be.\n   @owner bertolo"), list(makeSymbol("PUNLESS"), makeSymbol("CYC-ENTITY"), list(RET, makeSymbol("SELF"))), list(makeSymbol("CDOLIST"), list(makeSymbol("PRED"), makeSymbol("SALIENCE-PREDICATES")), list(makeSymbol("CLET"), list(list(makeSymbol("CONT-INF"), list(makeSymbol("NEW-CONTINUABLE-INFERENCE"), list(makeSymbol("BQ-LIST*"), makeSymbol("PRED"), makeSymbol("CYC-ENTITY"), list(QUOTE, list(makeSymbol("?WHAT")))), reader_make_constant_shell("EverythingPSC"))), list(makeSymbol("CONT-INF-STRING"), list(makeSymbol("CCONCATENATE"), makeString("ci-"), list(makeSymbol("FORMAT"), NIL, makeString("~S"), list(makeSymbol("GENSYM"))))), list(makeSymbol("TASK"), list(makeSymbol("NEW-TASK"), makeSymbol("CONT-INF-STRING"), list(QUOTE, makeSymbol("CONTINUE-INFERENCE")), list(makeSymbol("BQ-LIST"), makeSymbol("CONT-INF"), makeSymbol("QUERY-PARAMETERS"))))), list(makeSymbol("CPUSH"), list(makeSymbol("LIST"), makeSymbol("TASK"), makeSymbol("CONT-INF")), makeSymbol("CONTINUABLE-INFERENCE-POOL")))), list(RET, makeSymbol("SELF")));

    public static final SubLObject admissible_focus_entity_type_alt(SubLObject cyc_expression) {
        if (NIL != isa.isa_in_any_mtP(cyc_expression, $$CycKBSubsetCollection)) {
            return NIL;
        } else {
            if (NIL != isa.isa_in_any_mtP(cyc_expression, $$CycVocabularyTopic)) {
                return NIL;
            } else {
                if (NIL != isa.isa_in_any_mtP(cyc_expression, $$KFDInternalKRTerm)) {
                    return NIL;
                } else {
                    if (NIL != isa.isa_in_any_mtP(cyc_expression, $$MicrotheoryType)) {
                        return NIL;
                    } else {
                        if (NIL != isa.isa_in_any_mtP(cyc_expression, $$VocabularyConstrainingAbstraction)) {
                            return NIL;
                        } else {
                            if (NIL != isa.isa_in_any_mtP(cyc_expression, $$RelationshipType)) {
                                return NIL;
                            } else {
                                if (NIL != isa.quoted_isa_in_any_mtP(cyc_expression, $$MIPTMappingConstant)) {
                                    return NIL;
                                } else {
                                    if (NIL != genls.genl_in_any_mtP(cyc_expression, $const174$DealingWithAStringInNounLearnerTo)) {
                                        return NIL;
                                    } else {
                                        if (NIL != genls.genl_in_any_mtP(cyc_expression, $$LexicalItem)) {
                                            return NIL;
                                        } else {
                                            if (cyc_expression.eql($$QAClarifyingCollectionType)) {
                                                return NIL;
                                            } else {
                                                if (cyc_expression.eql($$BBNEntityType)) {
                                                    return NIL;
                                                } else {
                                                    if (cyc_expression.eql($$Individual)) {
                                                        return NIL;
                                                    } else {
                                                        if (cyc_expression.eql($$PotentiallyPornRelated)) {
                                                            return NIL;
                                                        } else {
                                                            if (cyc_expression.eql($$PersonTypeByGender)) {
                                                                return NIL;
                                                            } else {
                                                                return T;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject admissible_focus_entity_type(final SubLObject cyc_expression) {
        if (NIL != isa_in_any_mtP(cyc_expression, focus_entity.$$CycKBSubsetCollection)) {
            return NIL;
        }
        if (NIL != isa_in_any_mtP(cyc_expression, focus_entity.$$CycVocabularyTopic)) {
            return NIL;
        }
        if (NIL != isa_in_any_mtP(cyc_expression, focus_entity.$$KFDInternalKRTerm)) {
            return NIL;
        }
        if (NIL != isa_in_any_mtP(cyc_expression, focus_entity.$$MicrotheoryType)) {
            return NIL;
        }
        if (NIL != isa_in_any_mtP(cyc_expression, focus_entity.$$VocabularyConstrainingAbstraction)) {
            return NIL;
        }
        if (NIL != isa_in_any_mtP(cyc_expression, focus_entity.$$RelationshipType)) {
            return NIL;
        }
        if (NIL != quoted_isa_in_any_mtP(cyc_expression, focus_entity.$$MIPTMappingConstant)) {
            return NIL;
        }
        if (NIL != genl_in_any_mtP(cyc_expression, focus_entity.$const174$DealingWithAStringInNounLearnerTo)) {
            return NIL;
        }
        if (NIL != genl_in_any_mtP(cyc_expression, focus_entity.$$LexicalItem)) {
            return NIL;
        }
        if (cyc_expression.eql(focus_entity.$$QAClarifyingCollectionType)) {
            return NIL;
        }
        if (cyc_expression.eql(focus_entity.$$BBNEntityType)) {
            return NIL;
        }
        if (cyc_expression.eql(focus_entity.$$Individual)) {
            return NIL;
        }
        if (cyc_expression.eql(focus_entity.$$PotentiallyPornRelated)) {
            return NIL;
        }
        if (cyc_expression.eql(focus_entity.$$PersonTypeByGender)) {
            return NIL;
        }
        return T;
    }

    static private final SubLList $list_alt60 = list(makeSymbol("?WHAT"));

    static private final SubLString $str_alt61$ci_ = makeString("ci-");

    static private final SubLString $str_alt62$_S = makeString("~S");

    static private final SubLList $list_alt66 = list(makeSymbol("SPECIFICITY"));

    static private final SubLList $list_alt67 = list(list(makeSymbol("CLET"), list(list(makeSymbol("CYCL-QUERIES"), NIL), list(makeSymbol("NEW-INFERENCE-POOL"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("INFERENCE-TASK"), makeSymbol("CONTINUABLE-INFERENCE-POOL")), list(makeSymbol("CDESTRUCTURING-BIND"), list(makeSymbol("TASK"), makeSymbol("INFERENCE")), makeSymbol("INFERENCE-TASK"), list(makeSymbol("PCOND"), list(list(makeSymbol("CAND"), list(makeSymbol("INFERENCE-P"), makeSymbol("INFERENCE")), list(EQ, list(makeSymbol("INFERENCE-STATUS"), makeSymbol("INFERENCE")), makeKeyword("SUSPENDED"))), list(makeSymbol("DO-INFERENCE-NEW-ANSWERS"), list(makeSymbol("ANSWER"), makeSymbol("INFERENCE")), list(makeSymbol("CLET"), list(list(makeSymbol("SALIENT-ANSWER"), list(makeSymbol("ZEROP"), makeSymbol("SPECIFICITY")))), list(makeSymbol("DO-INFERENCE-ANSWER-JUSTIFICATIONS"), list(makeSymbol("JUSTIFICATION"), makeSymbol("ANSWER")), list(makeSymbol("PUNLESS"), makeSymbol("SALIENT-ANSWER"), list(makeSymbol("CSETQ"), makeSymbol("SALIENT-ANSWER"), list(makeSymbol("ENTITY-SPECIFIC-JUSTIFICATION-P"), makeSymbol("CYC-ENTITY"), makeSymbol("TYPES"), makeSymbol("JUSTIFICATION"), makeSymbol("SPECIFICITY"))))), list(makeSymbol("PWHEN"), makeSymbol("SALIENT-ANSWER"), list(makeSymbol("CLET"), list(list(makeSymbol("BINDINGS"), list(makeSymbol("INFERENCE-ANSWER-BINDINGS"), makeSymbol("ANSWER")))), list(makeSymbol("CDOLIST"), list(makeSymbol("BINDING"), makeSymbol("BINDINGS")), list(makeSymbol("CLET"), list(list(makeSymbol("VAR"), list(makeSymbol("CAR"), makeSymbol("BINDING"))), list(makeSymbol("BIND"), list(makeSymbol("CDR"), makeSymbol("BINDING"))), makeSymbol("QUERY")), list(makeSymbol("IGNORE"), makeSymbol("VAR")), list(makeSymbol("PWHEN"), list(makeSymbol("CONSP"), makeSymbol("BIND")), list(makeSymbol("CSETQ"), makeSymbol("QUERY"), list(makeSymbol("UNPACK-EXISTENTIAL-QUERY"), makeSymbol("BIND"), makeSymbol("CYC-ENTITY")))), list(makeSymbol("PWHEN"), makeSymbol("QUERY"), list(makeSymbol("CLET"), list(list(makeSymbol("QUERY-PRED"), list(makeSymbol("FORMULA-ARG0"), makeSymbol("QUERY")))), list(makeSymbol("PUNLESS"), list(makeSymbol("MEMBER?"), makeSymbol("QUERY-PRED"), list(QUOTE, list(reader_make_constant_shell("isa"), reader_make_constant_shell("genls")))), list(makeSymbol("CPUSH"), list(makeSymbol("NEW-CYCL-QUERY"), makeSymbol("QUERY")), makeSymbol("CYCL-QUERIES"))))))))))), list(makeSymbol("PWHEN"), list(makeSymbol("TASK-PROCESS"), makeSymbol("TASK")), list(makeSymbol("KILL-PROCESS"), list(makeSymbol("TASK-PROCESS"), makeSymbol("TASK")))), list(makeSymbol("DESTROY-INFERENCE"), makeSymbol("INFERENCE"))), list(list(makeSymbol("INFERENCE-P"), makeSymbol("INFERENCE")), list(makeSymbol("CPUSH"), makeSymbol("INFERENCE-TASK"), makeSymbol("NEW-INFERENCE-POOL")))))), list(makeSymbol("CSETQ"), makeSymbol("CONTINUABLE-INFERENCE-POOL"), makeSymbol("NEW-INFERENCE-POOL")), list(RET, makeSymbol("CYCL-QUERIES"))));

    public static SubLObject declare_focus_entity_file() {
        declareFunction("get_focus_entity_answers", "GET-FOCUS-ENTITY-ANSWERS", 1, 0, false);
        declareFunction("set_focus_entity_answers", "SET-FOCUS-ENTITY-ANSWERS", 2, 0, false);
        declareFunction("get_focus_entity_unanswered_questions", "GET-FOCUS-ENTITY-UNANSWERED-QUESTIONS", 1, 0, false);
        declareFunction("set_focus_entity_unanswered_questions", "SET-FOCUS-ENTITY-UNANSWERED-QUESTIONS", 2, 0, false);
        declareFunction("get_focus_entity_salient_queries", "GET-FOCUS-ENTITY-SALIENT-QUERIES", 1, 0, false);
        declareFunction("set_focus_entity_salient_queries", "SET-FOCUS-ENTITY-SALIENT-QUERIES", 2, 0, false);
        declareFunction("get_focus_entity_salient_query_justifications", "GET-FOCUS-ENTITY-SALIENT-QUERY-JUSTIFICATIONS", 1, 0, false);
        declareFunction("set_focus_entity_salient_query_justifications", "SET-FOCUS-ENTITY-SALIENT-QUERY-JUSTIFICATIONS", 2, 0, false);
        declareFunction("get_focus_entity_inference_pool_created", "GET-FOCUS-ENTITY-INFERENCE-POOL-CREATED", 1, 0, false);
        declareFunction("set_focus_entity_inference_pool_created", "SET-FOCUS-ENTITY-INFERENCE-POOL-CREATED", 2, 0, false);
        declareFunction("get_focus_entity_continuable_inference_pool", "GET-FOCUS-ENTITY-CONTINUABLE-INFERENCE-POOL", 1, 0, false);
        declareFunction("set_focus_entity_continuable_inference_pool", "SET-FOCUS-ENTITY-CONTINUABLE-INFERENCE-POOL", 2, 0, false);
        declareFunction("get_focus_entity_asserted_types", "GET-FOCUS-ENTITY-ASSERTED-TYPES", 1, 0, false);
        declareFunction("set_focus_entity_asserted_types", "SET-FOCUS-ENTITY-ASSERTED-TYPES", 2, 0, false);
        declareFunction("get_focus_entity_learned_types", "GET-FOCUS-ENTITY-LEARNED-TYPES", 1, 0, false);
        declareFunction("set_focus_entity_learned_types", "SET-FOCUS-ENTITY-LEARNED-TYPES", 2, 0, false);
        declareFunction("get_focus_entity_types", "GET-FOCUS-ENTITY-TYPES", 1, 0, false);
        declareFunction("set_focus_entity_types", "SET-FOCUS-ENTITY-TYPES", 2, 0, false);
        declareFunction("get_focus_entity_relevant_mt", "GET-FOCUS-ENTITY-RELEVANT-MT", 1, 0, false);
        declareFunction("set_focus_entity_relevant_mt", "SET-FOCUS-ENTITY-RELEVANT-MT", 2, 0, false);
        declareFunction("get_focus_entity_cyc_entity", "GET-FOCUS-ENTITY-CYC-ENTITY", 1, 0, false);
        declareFunction("set_focus_entity_cyc_entity", "SET-FOCUS-ENTITY-CYC-ENTITY", 2, 0, false);
        declareFunction("get_focus_entity_query_parameters", "GET-FOCUS-ENTITY-QUERY-PARAMETERS", 1, 0, false);
        declareFunction("set_focus_entity_query_parameters", "SET-FOCUS-ENTITY-QUERY-PARAMETERS", 2, 0, false);
        declareFunction("get_focus_entity_salience_predicates", "GET-FOCUS-ENTITY-SALIENCE-PREDICATES", 1, 0, false);
        declareFunction("set_focus_entity_salience_predicates", "SET-FOCUS-ENTITY-SALIENCE-PREDICATES", 2, 0, false);
        declareFunction("subloop_reserved_initialize_focus_entity_class", "SUBLOOP-RESERVED-INITIALIZE-FOCUS-ENTITY-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_focus_entity_instance", "SUBLOOP-RESERVED-INITIALIZE-FOCUS-ENTITY-INSTANCE", 1, 0, false);
        declareFunction("focus_entity_p", "FOCUS-ENTITY-P", 1, 0, false);
        declareFunction("focus_entity_all_types_method", "FOCUS-ENTITY-ALL-TYPES-METHOD", 1, 0, false);
        declareFunction("focus_entity_generate_salient_queries_method", "FOCUS-ENTITY-GENERATE-SALIENT-QUERIES-METHOD", 1, 0, false);
        declareFunction("focus_entity_kb_integrate_method", "FOCUS-ENTITY-KB-INTEGRATE-METHOD", 1, 0, false);
        declareFunction("focus_entity_compute_salient_justifications_method", "FOCUS-ENTITY-COMPUTE-SALIENT-JUSTIFICATIONS-METHOD", 1, 0, false);
        declareFunction("focus_entity_harvest_queries_from_inference_pool_method", "FOCUS-ENTITY-HARVEST-QUERIES-FROM-INFERENCE-POOL-METHOD", 2, 0, false);
        declareFunction("focus_entity_get_salient_queries_method", "FOCUS-ENTITY-GET-SALIENT-QUERIES-METHOD", 1, 2, false);
        declareFunction("focus_entity_done_computing_salient_queries_method", "FOCUS-ENTITY-DONE-COMPUTING-SALIENT-QUERIES-METHOD", 1, 0, false);
        declareFunction("focus_entity_answer_salient_queries_method", "FOCUS-ENTITY-ANSWER-SALIENT-QUERIES-METHOD", 1, 0, false);
        declareFunction("get_textual_focus_entity_learned_textual_types", "GET-TEXTUAL-FOCUS-ENTITY-LEARNED-TEXTUAL-TYPES", 1, 0, false);
        declareFunction("set_textual_focus_entity_learned_textual_types", "SET-TEXTUAL-FOCUS-ENTITY-LEARNED-TEXTUAL-TYPES", 2, 0, false);
        declareFunction("get_textual_focus_entity_passages", "GET-TEXTUAL-FOCUS-ENTITY-PASSAGES", 1, 0, false);
        declareFunction("set_textual_focus_entity_passages", "SET-TEXTUAL-FOCUS-ENTITY-PASSAGES", 2, 0, false);
        declareFunction("get_textual_focus_entity_name", "GET-TEXTUAL-FOCUS-ENTITY-NAME", 1, 0, false);
        declareFunction("set_textual_focus_entity_name", "SET-TEXTUAL-FOCUS-ENTITY-NAME", 2, 0, false);
        declareFunction("subloop_reserved_initialize_textual_focus_entity_class", "SUBLOOP-RESERVED-INITIALIZE-TEXTUAL-FOCUS-ENTITY-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_textual_focus_entity_instance", "SUBLOOP-RESERVED-INITIALIZE-TEXTUAL-FOCUS-ENTITY-INSTANCE", 1, 0, false);
        declareFunction("textual_focus_entity_p", "TEXTUAL-FOCUS-ENTITY-P", 1, 0, false);
        declareFunction("new_textual_focus_entity", "NEW-TEXTUAL-FOCUS-ENTITY", 2, 1, false);
        declareFunction("textual_focus_entity_name_method", "TEXTUAL-FOCUS-ENTITY-NAME-METHOD", 1, 0, false);
        declareFunction("textual_focus_entity_print_method", "TEXTUAL-FOCUS-ENTITY-PRINT-METHOD", 3, 0, false);
        declareFunction("textual_focus_entity_equal_method", "TEXTUAL-FOCUS-ENTITY-EQUAL-METHOD", 2, 0, false);
        declareFunction("textual_focus_entity_equal", "TEXTUAL-FOCUS-ENTITY-EQUAL", 2, 0, false);
        declareFunction("textual_focus_entity_chronology_method", "TEXTUAL-FOCUS-ENTITY-CHRONOLOGY-METHOD", 1, 0, false);
        declareFunction("textual_focus_entity_render_method", "TEXTUAL-FOCUS-ENTITY-RENDER-METHOD", 1, 1, false);
        declareFunction("textual_focus_entity_learn_types_from_corpora_method", "TEXTUAL-FOCUS-ENTITY-LEARN-TYPES-FROM-CORPORA-METHOD", 2, 0, false);
        declareFunction("textual_focus_entity_add_passage_method", "TEXTUAL-FOCUS-ENTITY-ADD-PASSAGE-METHOD", 2, 0, false);
        declareFunction("entity_specific_justification_p", "ENTITY-SPECIFIC-JUSTIFICATION-P", 4, 0, false);
        declareFunction("unpack_existential_query", "UNPACK-EXISTENTIAL-QUERY", 2, 0, false);
        declareFunction("admissible_focus_entity_type", "ADMISSIBLE-FOCUS-ENTITY-TYPE", 1, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt69 = list(makeSymbol("TASK"), makeSymbol("INFERENCE"));

    static private final SubLList $list_alt71 = list(reader_make_constant_shell("isa"), reader_make_constant_shell("genls"));

    static private final SubLList $list_alt74 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("COMPLETENESS"), makeKeyword("CURRENT")), list(makeSymbol("SPECIFICITY"), ZERO_INTEGER));

    static private final SubLList $list_alt75 = list(makeString("@param SPECIFICITY, integerp meant to denote how many levels of inheritance are acceptable\n   for a salient query. The lower the number, the tighter the restriction. The default, 0, causes \n   salient queries to be inherited without restriction from all supertypes of this entity.\n   @param COMPLETE, booleanp. If T, then the method will return only after all the inferences \n   that were started to compute salient queries are complete. If NIL the method will return\n   immediately with all the salient queries discovered so far.\n   @return listp, a list of salient cycl-query-p.\n   @owner bertolo"), list(makeSymbol("CHECK-TYPE"), makeSymbol("SPECIFICITY"), makeSymbol("INTEGERP")), list(makeSymbol("PCASE"), makeSymbol("COMPLETENESS"), list(makeKeyword("CURRENT"), list(RET, makeSymbol("SALIENT-QUERIES"))), list(makeKeyword("UPDATE"), list(makeSymbol("CLET"), list(list(makeSymbol("LATEST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("HARVEST-QUERIES-FROM-INFERENCE-POOL")), makeSymbol("SPECIFICITY"))), list(makeSymbol("UPDATE"), makeSymbol("SALIENT-QUERIES"))), list(makeSymbol("CDOLIST"), list(makeSymbol("L"), makeSymbol("LATEST")), list(makeSymbol("CPUSHNEW"), makeSymbol("L"), makeSymbol("UPDATE"), list(QUOTE, makeSymbol("CYCL-QUERY-EQUAL-P")))), list(makeSymbol("CSETQ"), makeSymbol("SALIENT-QUERIES"), makeSymbol("UPDATE")), list(RET, makeSymbol("UPDATE")))), list(makeKeyword("ALL"), list(makeSymbol("CLET"), list(list(makeSymbol("UPDATE"), makeSymbol("SALIENT-QUERIES")), makeSymbol("LATEST")), list(makeSymbol("UNTIL"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("DONE-COMPUTING-SALIENT-QUERIES"))), list(makeSymbol("SLEEP"), ONE_INTEGER)), list(makeSymbol("CSETQ"), makeSymbol("LATEST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("HARVEST-QUERIES-FROM-INFERENCE-POOL")), makeSymbol("SPECIFICITY"))), list(makeSymbol("CDOLIST"), list(makeSymbol("L"), makeSymbol("LATEST")), list(makeSymbol("CPUSHNEW"), makeSymbol("L"), makeSymbol("UPDATE"), list(QUOTE, makeSymbol("CYCL-QUERY-EQUAL-P")))), list(makeSymbol("CSETQ"), makeSymbol("SALIENT-QUERIES"), makeSymbol("UPDATE")), list(RET, makeSymbol("UPDATE"))))));

    static private final SubLList $list_alt84 = list(makeString("@return BOOLEAN; T iff no inference that has been started to compute\n   salient queries is still running.\n   @bertolo"), list(makeSymbol("CLET"), list(makeSymbol("STILL-WORKING")), list(makeSymbol("CSOME"), list(makeSymbol("INFERENCE-TASK"), makeSymbol("CONTINUABLE-INFERENCE-POOL"), makeSymbol("STILL-WORKING")), list(makeSymbol("CDESTRUCTURING-BIND"), list(makeSymbol("TASK"), makeSymbol("INFERENCE")), makeSymbol("INFERENCE-TASK"), list(makeSymbol("IGNORE"), makeSymbol("TASK")), list(makeSymbol("PWHEN"), list(makeSymbol("INFERENCE-P"), makeSymbol("INFERENCE")), list(makeSymbol("CLET"), list(list(makeSymbol("STATUS"), list(makeSymbol("INFERENCE-STATUS"), makeSymbol("INFERENCE")))), list(makeSymbol("CSETQ"), makeSymbol("STILL-WORKING"), list(makeSymbol("MEMBER"), makeSymbol("STATUS"), list(QUOTE, list(makeKeyword("NEW"), makeKeyword("PREPARED"), makeKeyword("READY"), makeKeyword("RUNNING"))))))))), list(RET, list(makeSymbol("CNOT"), makeSymbol("STILL-WORKING")))));

    public static SubLObject init_focus_entity_file() {
        return NIL;
    }

    public static SubLObject setup_focus_entity_file() {
        subloop_new_class(focus_entity.FOCUS_ENTITY, OBJECT, NIL, NIL, focus_entity.$list2);
        class_set_implements_slot_listeners(focus_entity.FOCUS_ENTITY, NIL);
        subloop_note_class_initialization_function(focus_entity.FOCUS_ENTITY, focus_entity.SUBLOOP_RESERVED_INITIALIZE_FOCUS_ENTITY_CLASS);
        subloop_note_instance_initialization_function(focus_entity.FOCUS_ENTITY, focus_entity.SUBLOOP_RESERVED_INITIALIZE_FOCUS_ENTITY_INSTANCE);
        focus_entity.subloop_reserved_initialize_focus_entity_class(focus_entity.FOCUS_ENTITY);
        methods_incorporate_instance_method(ALL_TYPES, focus_entity.FOCUS_ENTITY, focus_entity.$list35, NIL, focus_entity.$list36);
        subloop_register_instance_method(focus_entity.FOCUS_ENTITY, ALL_TYPES, focus_entity.FOCUS_ENTITY_ALL_TYPES_METHOD);
        methods_incorporate_instance_method(focus_entity.GENERATE_SALIENT_QUERIES, focus_entity.FOCUS_ENTITY, focus_entity.$list35, NIL, focus_entity.$list40);
        subloop_register_instance_method(focus_entity.FOCUS_ENTITY, focus_entity.GENERATE_SALIENT_QUERIES, focus_entity.FOCUS_ENTITY_GENERATE_SALIENT_QUERIES_METHOD);
        methods_incorporate_instance_method(focus_entity.KB_INTEGRATE, focus_entity.FOCUS_ENTITY, focus_entity.$list45, NIL, focus_entity.$list46);
        subloop_register_instance_method(focus_entity.FOCUS_ENTITY, focus_entity.KB_INTEGRATE, focus_entity.FOCUS_ENTITY_KB_INTEGRATE_METHOD);
        methods_incorporate_instance_method(focus_entity.COMPUTE_SALIENT_JUSTIFICATIONS, focus_entity.FOCUS_ENTITY, focus_entity.$list45, NIL, focus_entity.$list58);
        subloop_register_instance_method(focus_entity.FOCUS_ENTITY, focus_entity.COMPUTE_SALIENT_JUSTIFICATIONS, focus_entity.FOCUS_ENTITY_COMPUTE_SALIENT_JUSTIFICATIONS_METHOD);
        methods_incorporate_instance_method(focus_entity.HARVEST_QUERIES_FROM_INFERENCE_POOL, focus_entity.FOCUS_ENTITY, focus_entity.$list45, focus_entity.$list66, focus_entity.$list67);
        subloop_register_instance_method(focus_entity.FOCUS_ENTITY, focus_entity.HARVEST_QUERIES_FROM_INFERENCE_POOL, focus_entity.FOCUS_ENTITY_HARVEST_QUERIES_FROM_INFERENCE_POOL_METHOD);
        methods_incorporate_instance_method(focus_entity.GET_SALIENT_QUERIES, focus_entity.FOCUS_ENTITY, focus_entity.$list35, focus_entity.$list74, focus_entity.$list75);
        subloop_register_instance_method(focus_entity.FOCUS_ENTITY, focus_entity.GET_SALIENT_QUERIES, focus_entity.FOCUS_ENTITY_GET_SALIENT_QUERIES_METHOD);
        methods_incorporate_instance_method(focus_entity.DONE_COMPUTING_SALIENT_QUERIES, focus_entity.FOCUS_ENTITY, focus_entity.$list35, NIL, focus_entity.$list84);
        subloop_register_instance_method(focus_entity.FOCUS_ENTITY, focus_entity.DONE_COMPUTING_SALIENT_QUERIES, focus_entity.FOCUS_ENTITY_DONE_COMPUTING_SALIENT_QUERIES_METHOD);
        methods_incorporate_instance_method(focus_entity.ANSWER_SALIENT_QUERIES, focus_entity.FOCUS_ENTITY, focus_entity.$list35, NIL, focus_entity.$list89);
        subloop_register_instance_method(focus_entity.FOCUS_ENTITY, focus_entity.ANSWER_SALIENT_QUERIES, focus_entity.FOCUS_ENTITY_ANSWER_SALIENT_QUERIES_METHOD);
        subloop_new_class(focus_entity.TEXTUAL_FOCUS_ENTITY, focus_entity.FOCUS_ENTITY, NIL, NIL, focus_entity.$list94);
        class_set_implements_slot_listeners(focus_entity.TEXTUAL_FOCUS_ENTITY, NIL);
        subloop_note_class_initialization_function(focus_entity.TEXTUAL_FOCUS_ENTITY, focus_entity.SUBLOOP_RESERVED_INITIALIZE_TEXTUAL_FOCUS_ENTITY_CLASS);
        subloop_note_instance_initialization_function(focus_entity.TEXTUAL_FOCUS_ENTITY, focus_entity.SUBLOOP_RESERVED_INITIALIZE_TEXTUAL_FOCUS_ENTITY_INSTANCE);
        focus_entity.subloop_reserved_initialize_textual_focus_entity_class(focus_entity.TEXTUAL_FOCUS_ENTITY);
        methods_incorporate_instance_method(NAME, focus_entity.TEXTUAL_FOCUS_ENTITY, focus_entity.$list35, NIL, focus_entity.$list104);
        subloop_register_instance_method(focus_entity.TEXTUAL_FOCUS_ENTITY, NAME, focus_entity.TEXTUAL_FOCUS_ENTITY_NAME_METHOD);
        methods_incorporate_instance_method(PRINT, focus_entity.TEXTUAL_FOCUS_ENTITY, focus_entity.$list45, focus_entity.$list108, focus_entity.$list109);
        subloop_register_instance_method(focus_entity.TEXTUAL_FOCUS_ENTITY, PRINT, focus_entity.TEXTUAL_FOCUS_ENTITY_PRINT_METHOD);
        methods_incorporate_instance_method(EQUAL, focus_entity.TEXTUAL_FOCUS_ENTITY, focus_entity.$list35, focus_entity.$list117, focus_entity.$list118);
        subloop_register_instance_method(focus_entity.TEXTUAL_FOCUS_ENTITY, EQUAL, focus_entity.TEXTUAL_FOCUS_ENTITY_EQUAL_METHOD);
        methods_incorporate_instance_method(focus_entity.CHRONOLOGY, focus_entity.TEXTUAL_FOCUS_ENTITY, focus_entity.$list35, NIL, focus_entity.$list123);
        subloop_register_instance_method(focus_entity.TEXTUAL_FOCUS_ENTITY, focus_entity.CHRONOLOGY, focus_entity.TEXTUAL_FOCUS_ENTITY_CHRONOLOGY_METHOD);
        methods_incorporate_instance_method(focus_entity.RENDER, focus_entity.TEXTUAL_FOCUS_ENTITY, focus_entity.$list35, focus_entity.$list127, focus_entity.$list128);
        subloop_register_instance_method(focus_entity.TEXTUAL_FOCUS_ENTITY, focus_entity.RENDER, focus_entity.TEXTUAL_FOCUS_ENTITY_RENDER_METHOD);
        methods_incorporate_instance_method(focus_entity.LEARN_TYPES_FROM_CORPORA, focus_entity.TEXTUAL_FOCUS_ENTITY, focus_entity.$list35, focus_entity.$list146, focus_entity.$list147);
        subloop_register_instance_method(focus_entity.TEXTUAL_FOCUS_ENTITY, focus_entity.LEARN_TYPES_FROM_CORPORA, focus_entity.TEXTUAL_FOCUS_ENTITY_LEARN_TYPES_FROM_CORPORA_METHOD);
        methods_incorporate_instance_method(focus_entity.ADD_PASSAGE, focus_entity.TEXTUAL_FOCUS_ENTITY, focus_entity.$list35, focus_entity.$list155, focus_entity.$list156);
        subloop_register_instance_method(focus_entity.TEXTUAL_FOCUS_ENTITY, focus_entity.ADD_PASSAGE, focus_entity.TEXTUAL_FOCUS_ENTITY_ADD_PASSAGE_METHOD);
        return NIL;
    }

    static private final SubLList $list_alt86 = list(makeKeyword("NEW"), makeKeyword("PREPARED"), makeKeyword("READY"), makeKeyword("RUNNING"));

    static private final SubLList $list_alt89 = list(makeString("@return focus-entity-p, this focus entity\n   As a side effect it computes the answers to all the salient queries for this entity.\n   @owner bertolo"), list(makeSymbol("CLET"), list(list(makeSymbol("*ASK-QUIRK?*"), T)), list(makeSymbol("CDOLIST"), list(makeSymbol("QUERY"), makeSymbol("SALIENT-QUERIES")), list(makeSymbol("CLET"), list(list(makeSymbol("LOCAL-ANSWERS"), list(makeSymbol("FIM"), makeSymbol("QUERY"), list(QUOTE, makeSymbol("ANSWER"))))), list(makeSymbol("PUNLESS"), makeSymbol("LOCAL-ANSWERS"), list(makeSymbol("CPUSH"), makeSymbol("QUERY"), makeSymbol("UNANSWERED-QUESTIONS"))), list(makeSymbol("CDOLIST"), list(makeSymbol("ANSWER"), makeSymbol("LOCAL-ANSWERS")), list(makeSymbol("CPUSH"), makeSymbol("ANSWER"), makeSymbol("ANSWERS")))))), list(RET, makeSymbol("SELF")));

    static private final SubLList $list_alt94 = list(list(makeSymbol("NAME"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("PASSAGES"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("LEARNED-TYPES"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("LEARNED-TEXTUAL-TYPES"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NAME"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LEARN-TYPES-FROM-CORPORA"), list(makeSymbol("CORPORA")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-PASSAGE"), list(makeSymbol("PASSAGE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), EQUAL, list(makeSymbol("OBJECT")), makeKeyword("PUBLIC")));

    static private final SubLList $list_alt104 = list(list(RET, makeSymbol("NAME")));

    static private final SubLList $list_alt108 = list(makeSymbol("STREAM"), makeSymbol("DEPTH"));

    static private final SubLList $list_alt109 = list(new SubLObject[]{ list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("WRITE-STRING"), makeString("#<ESS-ENT-"), makeSymbol("STREAM")), list(makeSymbol("PRIN1"), makeSymbol("INSTANCE-NUMBER"), makeSymbol("STREAM")), list(makeSymbol("WRITE-STRING"), makeString(": "), makeSymbol("STREAM")), list(makeSymbol("PRIN1"), makeSymbol("NAME"), makeSymbol("STREAM")), list(makeSymbol("WRITE-STRING"), makeString(" types: "), makeSymbol("STREAM")), list(makeSymbol("PRIN1"), list(makeSymbol("LENGTH"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ALL-TYPES")))), makeSymbol("STREAM")), list(makeSymbol("WRITE-STRING"), makeString(" facts: "), makeSymbol("STREAM")), list(makeSymbol("PRIN1"), list(makeSymbol("LENGTH"), makeSymbol("ANSWERS")), makeSymbol("STREAM")), list(makeSymbol("WRITE-STRING"), makeString(">"), makeSymbol("STREAM")), list(makeSymbol("TERPRI"), makeSymbol("STREAM")), list(RET, makeSymbol("SELF")) });

    @Override
    public void declareFunctions() {
        focus_entity.declare_focus_entity_file();
    }

    @Override
    public void initializeVariables() {
        focus_entity.init_focus_entity_file();
    }

    @Override
    public void runTopLevelForms() {
        focus_entity.setup_focus_entity_file();
    }

    static {
    }

    static private final SubLString $str_alt111$__ESS_ENT_ = makeString("#<ESS-ENT-");

    static private final SubLString $str_alt112$__ = makeString(": ");

    static private final SubLString $str_alt113$_types__ = makeString(" types: ");

    static private final SubLString $str_alt114$_facts__ = makeString(" facts: ");

    static private final SubLString $str_alt115$_ = makeString(">");

    static private final SubLList $list_alt117 = list(makeSymbol("OBJECT"));

    static private final SubLList $list_alt118 = list(makeString("@return booleanp; non-nil if OBJECT is equal to this entity, nil otherwise"), list(RET, list(makeSymbol("CAND"), list(makeSymbol("TEXTUAL-FOCUS-ENTITY-P"), makeSymbol("OBJECT")), list(EQUAL, makeSymbol("NAME"), list(makeSymbol("FIM"), makeSymbol("OBJECT"), list(QUOTE, makeSymbol("NAME")))))));

    static private final SubLList $list_alt123 = list(makeString("@return a chronological summary of all information known about this entity.\n   @owner bertolo"), list(RET, list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("RENDER")), list(QUOTE, list(makeKeyword("FORMAT"), $TEXT, makeKeyword("ORDER"), makeKeyword("CHRONOLOGICAL"))))));

    static private final SubLList $list_alt125 = list(makeKeyword("FORMAT"), $TEXT, makeKeyword("ORDER"), makeKeyword("CHRONOLOGICAL"));

    static private final SubLList $list_alt127 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("STRATEGY"), list(QUOTE, list(makeKeyword("FORMAT"), $TEXT, makeKeyword("ORDER"), makeKeyword("SEQUENTIAL")))));

    static private final SubLList $list_alt128 = list(makeString("@return a summary of all information known about this entity.\n   @owner bertolo"), list(makeSymbol("CLET"), list(list(makeSymbol("FORMAT"), list(makeSymbol("GETF"), makeSymbol("STRATEGY"), makeKeyword("FORMAT"))), list(makeSymbol("ORDER"), list(makeSymbol("GETF"), makeSymbol("STRATEGY"), makeKeyword("ORDER"))), makeSymbol("ACCUMULATOR")), list(makeSymbol("PCASE"), makeSymbol("FORMAT"), list($TEXT, list(makeSymbol("CSETQ"), makeSymbol("ACCUMULATOR"), list(makeSymbol("CCONCATENATE"), makeSymbol("NAME"), makeString(":"), makeSymbol("*NEW-LINE-STRING*"), makeSymbol("*NEW-LINE-STRING*"))))), list(makeSymbol("PCASE"), makeSymbol("ORDER"), list(makeKeyword("SEQUENTIAL"), list(makeSymbol("CDOLIST"), list(makeSymbol("ANSWER"), makeSymbol("ANSWERS")), list(makeSymbol("CLET"), list(list(makeSymbol("JUSTIFICATION"), list(makeSymbol("FIM"), makeSymbol("ANSWER"), list(QUOTE, makeSymbol("JUSTIFY")))), list(makeSymbol("SOURCE"), list(makeSymbol("FIF"), list(makeSymbol("CORPUS-PASSAGE-P"), makeSymbol("JUSTIFICATION")), list(makeSymbol("FIM"), makeSymbol("JUSTIFICATION"), list(QUOTE, makeSymbol("GET-SOURCE"))), makeString("")))), list(makeSymbol("CSETQ"), makeSymbol("ACCUMULATOR"), list(new SubLObject[]{ makeSymbol("CCONCATENATE"), makeSymbol("ACCUMULATOR"), list(makeSymbol("FIM"), makeSymbol("ANSWER"), list(QUOTE, makeSymbol("GET-CONTENT"))), makeSymbol("*NEW-LINE-STRING*"), makeString("("), makeSymbol("SOURCE"), makeString(")"), makeSymbol("*NEW-LINE-STRING*"), makeSymbol("*NEW-LINE-STRING*") }))))), list(makeKeyword("CHRONOLOGICAL"), list(makeSymbol("CLET"), list(list(makeSymbol("SORTED"), list(makeSymbol("SORT"), list(makeSymbol("COPY-LIST"), makeSymbol("ANSWERS")), list(QUOTE, makeSymbol("ANSWER-OLDER-METHOD"))))), list(makeSymbol("CDOLIST"), list(makeSymbol("ANSWER"), makeSymbol("SORTED")), list(makeSymbol("CLET"), list(list(makeSymbol("JUSTIFICATION"), list(makeSymbol("FIM"), makeSymbol("ANSWER"), list(QUOTE, makeSymbol("JUSTIFY")))), list(makeSymbol("SOURCE"), list(makeSymbol("FIF"), list(makeSymbol("CORPUS-PASSAGE-P"), makeSymbol("JUSTIFICATION")), list(makeSymbol("FIM"), makeSymbol("JUSTIFICATION"), list(QUOTE, makeSymbol("GET-SOURCE"))), makeString("")))), list(makeSymbol("CSETQ"), makeSymbol("ACCUMULATOR"), list(new SubLObject[]{ makeSymbol("CCONCATENATE"), makeSymbol("ACCUMULATOR"), list(makeSymbol("FIM"), makeSymbol("ANSWER"), list(QUOTE, makeSymbol("GET-CONTENT"))), makeSymbol("*NEW-LINE-STRING*"), makeString("("), makeSymbol("SOURCE"), makeString(")"), makeSymbol("*NEW-LINE-STRING*"), makeSymbol("*NEW-LINE-STRING*") }))))))), list(RET, makeSymbol("ACCUMULATOR"))));

    static private final SubLList $list_alt129 = list(makeKeyword("FORMAT"), $TEXT, makeKeyword("ORDER"), makeKeyword("SEQUENTIAL"));

    static private final SubLString $str_alt134$_ = makeString(":");

    static private final SubLString $str_alt140$_ = makeString("(");

    static private final SubLString $str_alt141$_ = makeString(")");

    static private final SubLList $list_alt146 = list(makeSymbol("CORPORA"));

    static private final SubLList $list_alt147 = list(makeString("@param CORPORA, listp a list of strings denoting available corpora\n   @return textual-focus-entity-p, this entity.\n   As a side effect it consults documents in CORPORA to try to learn its own type.\n   @owner bertolo"), list(makeSymbol("CHECK-TYPE"), makeSymbol("CORPORA"), makeSymbol("LISTP")), list(makeSymbol("CLET"), list(list(makeSymbol("CURRENT-TYPES"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ALL-TYPES")))), list(makeSymbol("LOCAL-ANSWERS"), NIL), makeSymbol("WHO-TYPE"), makeSymbol("QUESTION")), list(makeSymbol("WITH-ALL-MTS"), list(makeSymbol("CSETQ"), makeSymbol("WHO-TYPE"), list(makeSymbol("ANY-GENL-ANY?"), makeSymbol("CURRENT-TYPES"), list(QUOTE, list(reader_make_constant_shell("Person"), reader_make_constant_shell("Organization")))))), list(makeSymbol("PIF"), makeSymbol("WHO-TYPE"), list(makeSymbol("CSETQ"), makeSymbol("QUESTION"), list(makeSymbol("NEW-QUESTION"), list(makeSymbol("CCONCATENATE"), makeString("Who is "), makeSymbol("NAME"), makeString("?")))), list(makeSymbol("CSETQ"), makeSymbol("QUESTION"), list(makeSymbol("NEW-QUESTION"), list(makeSymbol("CCONCATENATE"), makeString("What is "), makeSymbol("NAME"), makeString("?"))))), list(makeSymbol("PWHEN"), makeSymbol("QUESTION"), list(makeSymbol("CSETQ"), makeSymbol("LOCAL-ANSWERS"), list(makeSymbol("FIM"), makeSymbol("QUESTION"), list(QUOTE, makeSymbol("ANSWER"))))), list(makeSymbol("PUNLESS"), makeSymbol("LOCAL-ANSWERS"), list(makeSymbol("CPUSH"), makeSymbol("QUESTION"), makeSymbol("UNANSWERED-QUESTIONS"))), list(makeSymbol("CDOLIST"), list(makeSymbol("ANSWER"), makeSymbol("LOCAL-ANSWERS")), list(makeSymbol("CPUSH"), makeSymbol("ANSWER"), makeSymbol("ANSWERS")), list(makeSymbol("CLET"), list(list(makeSymbol("*NPP-USE-NL-TAGS?*"), NIL), list(makeSymbol("DENOTS"), list(makeSymbol("PS-GET-CYCLS-FOR-NP"), list(makeSymbol("FIM"), makeSymbol("ANSWER"), list(QUOTE, makeSymbol("GET-CONTENT")))))), list(makeSymbol("CDOLIST"), list(makeSymbol("DENOT"), makeSymbol("DENOTS")), list(makeSymbol("CLET"), list(makeSymbol("FAIL")), list(makeSymbol("CSOME"), list(makeSymbol("TYPE"), makeSymbol("CURRENT-TYPES"), makeSymbol("FAIL")), list(makeSymbol("WITH-ALL-MTS"), list(makeSymbol("CSETQ"), makeSymbol("FAIL"), list(makeSymbol("COLLECTIONS-DISJOINT?"), makeSymbol("DENOT"), makeSymbol("TYPE"))))), list(makeSymbol("PUNLESS"), makeSymbol("FAIL"), list(makeSymbol("CPUSH"), makeSymbol("DENOT"), makeSymbol("CURRENT-TYPES")), list(makeSymbol("CPUSH"), makeSymbol("DENOT"), makeSymbol("LEARNED-TYPES"))))))), list(RET, makeSymbol("SELF"))));

    static private final SubLList $list_alt149 = list(reader_make_constant_shell("Person"), reader_make_constant_shell("Organization"));

    static private final SubLString $str_alt150$Who_is_ = makeString("Who is ");

    static private final SubLString $str_alt151$_ = makeString("?");

    static private final SubLString $str_alt152$What_is_ = makeString("What is ");

    static private final SubLList $list_alt155 = list(makeSymbol("PASSAGE"));

    static private final SubLList $list_alt156 = list(makeString("@param PASSAGE passage-p\n   @return textual-focus-entity; this entity with PASSAGE added to the list\n   of passages where the entity occurs"), list(makeSymbol("CHECK-TYPE"), makeSymbol("PASSAGE"), makeSymbol("CORPUS-PASSAGE-P")), list(makeSymbol("CPUSHNEW"), makeSymbol("PASSAGE"), makeSymbol("PASSAGES"), list(QUOTE, makeSymbol("PASSAGE-EQUAL"))), list(RET, makeSymbol("SELF")));
}

/**
 * Total time: 740 ms
 */
