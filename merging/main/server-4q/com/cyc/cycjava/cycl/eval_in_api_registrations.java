/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.utilities_macros.register_api_predefined_function;
import static com.cyc.cycjava.cycl.utilities_macros.register_api_predefined_host_function;
import static com.cyc.cycjava.cycl.utilities_macros.register_api_predefined_host_macro;
import static com.cyc.cycjava.cycl.utilities_macros.register_api_predefined_macro;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.maybeMake;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class eval_in_api_registrations extends SubLTranslatedFile implements V12 {
    // Internal Constant Initializer Methods
    @LispMethod(comment = "Internal Constant Initializer Methods")
    private static final SubLObject _constant_62_initializer() {
        return list(new SubLObject[]{ makeSymbol("*"), makeSymbol("+"), makeSymbol("-"), makeSymbol("/"), makeSymbol("/="), makeSymbol("<"), makeSymbol("<="), makeSymbol("="), makeSymbol(">"), makeSymbol(">"), makeSymbol(">="), makeSymbol("ABS"), makeSymbol("ACONS"), makeSymbol("ACOS"), makeSymbol("ADJOIN"), makeSymbol("ALPHA-CHAR-P"), makeSymbol("ALPHANUMERICP"), makeSymbol("APPEND"), makeSymbol("AREF"), makeSymbol("ASH"), makeSymbol("ASIN"), makeSymbol("ASSOC"), makeSymbol("ASSOC-IF"), makeSymbol("ATAN"), makeSymbol("ATOM"), makeSymbol("BOOLE"), makeSymbol("BOOLEAN"), makeSymbol("BOTH-CASE-P"), makeSymbol("BQ-CONS"), makeSymbol("BQ-VECTOR"), makeSymbol("BUTLAST"), makeSymbol("BYTE"), makeSymbol("CAAR"), makeSymbol("CADR"), makeSymbol("CAR"), makeSymbol("CCONCATENATE"), makeSymbol("CDAR"), makeSymbol("CDDR"), makeSymbol("CDR"), makeSymbol("CEILING"), makeSymbol("CERROR"), makeSymbol("CHAR"), makeSymbol("CHAR-CODE"), makeSymbol("CHAR-DOWNCASE"), makeSymbol("CHAR-EQUAL"), makeSymbol("CHAR-GREATERP"), makeSymbol("CHAR-LESSP"), makeSymbol("CHAR-NOT-EQUAL"), makeSymbol("CHAR-NOT-GREATERP"), makeSymbol("CHAR-NOT-LESSP"), makeSymbol("CHAR-UPCASE"), makeSymbol("CHAR/="), makeSymbol("CHAR<"), makeSymbol("CHAR<="), makeSymbol("CHAR="), makeSymbol("CHAR>"), makeSymbol("CHAR>="), makeSymbol("CHARACTERP"), makeSymbol("CLRHASH"), makeSymbol("CMERGE"), makeSymbol("CODE-CHAR"), makeSymbol("CONS"), makeSymbol("CONSP"), makeSymbol("CONSTANTP"), makeSymbol("CONSTRUCT-FILENAME"), makeSymbol("COPY-ALIST"), makeSymbol("COPY-LIST"), makeSymbol("COPY-SEQ"), makeSymbol("COPY-TREE"), makeSymbol("COS"), makeSymbol("COUNT"), makeSymbol("COUNT-IF"), makeSymbol("CREDUCE"), makeSymbol("CURRENT-PROCESS"), makeSymbol("DATE-RELATIVE-GUID-P"), makeSymbol("DECODE-FLOAT"), makeSymbol("DECODE-UNIVERSAL-TIME"), makeSymbol("DELETE"), makeSymbol("DELETE-DUPLICATES"), makeSymbol("DELETE-IF"), makeSymbol("DIGIT-CHAR"), makeSymbol("DIGIT-CHAR-P"), makeSymbol("DISASSEMBLE-INTEGER-TO-FIXNUMS"), makeSymbol("DPB"), makeSymbol("EIGHTH"), makeSymbol("ELT"), makeSymbol("ENCODE-UNIVERSAL-TIME"), makeSymbol("ENDP"), EQ, EQL, EQUAL, EQUALP, makeSymbol("EVENP"), makeSymbol("EXIT"), makeSymbol("EXP"), makeSymbol("EXPT"), makeSymbol("FALSE"), makeSymbol("FIFTH"), makeSymbol("FILL"), makeSymbol("FIND"), makeSymbol("FIND-IF"), makeSymbol("FIND-PACKAGE"), makeSymbol("FIND-SYMBOL"), makeSymbol("FIRST"), makeSymbol("FIXNUMP"), makeSymbol("FLOAT"), makeSymbol("FLOAT-DIGITS"), makeSymbol("FLOAT-RADIX"), makeSymbol("FLOAT-SIGN"), makeSymbol("FLOATP"), makeSymbol("FLOOR"), makeSymbol("FORCE-OUTPUT"), makeSymbol("FORMAT"), makeSymbol("FOURTH"), makeSymbol("FRESH-LINE"), makeSymbol("FUNCTION-SPEC-P"), makeSymbol("FUNCTIONP"), makeSymbol("GC"), makeSymbol("GC-DYNAMIC"), makeSymbol("GC-EPHEMERAL"), makeSymbol("GC-FULL"), makeSymbol("GENSYM"), makeSymbol("GENTEMP"), makeSymbol("GET"), makeSymbol("GET-DECODED-TIME"), makeSymbol("GET-INTERNAL-REAL-TIME"), makeSymbol("GET-INTERNAL-REAL-TIME"), makeSymbol("GET-INTERNAL-RUN-TIME"), makeSymbol("GET-UNIVERSAL-TIME"), makeSymbol("GET-UNIVERSAL-TIME"), makeSymbol("GETF"), makeSymbol("GETHASH"), makeSymbol("GETHASH-WITHOUT-VALUES"), makeSymbol("GUID-P"), makeSymbol("GUID-STRING-P"), makeSymbol("GUID-TO-STRING"), makeSymbol("GUID/="), makeSymbol("GUID<"), makeSymbol("GUID<="), makeSymbol("GUID="), makeSymbol("GUID>"), makeSymbol("GUID>="), makeSymbol("HASH-TABLE-COUNT"), makeSymbol("HASH-TABLE-P"), makeSymbol("HASH-TABLE-SIZE"), makeSymbol("HASH-TABLE-TEST"), IDENTITY, makeSymbol("IGNORE"), makeSymbol("INFINITY-P"), makeSymbol("INT/"), makeSymbol("INTEGER-DECODE-FLOAT"), makeSymbol("INTEGER-LENGTH"), makeSymbol("INTEGERP"), makeSymbol("INTERN"), makeSymbol("INTERRUPT-PROCESS"), makeSymbol("INTERSECTION"), makeSymbol("ISQRT"), makeSymbol("KEYWORDP"), makeSymbol("KILL-PROCESS"), makeSymbol("LAST"), makeSymbol("LDB"), makeSymbol("LDIFF"), makeSymbol("LENGTH"), makeSymbol("LISP-IMPLEMENTATION-TYPE"), makeSymbol("LISP-IMPLEMENTATION-VERSION"), makeSymbol("LIST"), makeSymbol("LIST*"), makeSymbol("LIST-ALL-PACKAGES"), makeSymbol("LIST-LENGTH"), makeSymbol("LISTP"), makeSymbol("LISTP"), makeSymbol("LOCK-IDLE-P"), makeSymbol("LOCK-P"), makeSymbol("LOG"), makeSymbol("LOGAND"), makeSymbol("LOGANDC1"), makeSymbol("LOGANDC2"), makeSymbol("LOGBITP"), makeSymbol("LOGCOUNT"), makeSymbol("LOGEQV"), makeSymbol("LOGIOR"), makeSymbol("LOGNAND"), makeSymbol("LOGNOR"), makeSymbol("LOGNOT"), makeSymbol("LOGORC1"), makeSymbol("LOGORC2"), makeSymbol("LOGTEST"), makeSymbol("LOGXOR"), makeSymbol("LOWER-CASE-P"), makeSymbol("MAKE-HASH-TABLE"), makeSymbol("MAKE-LOCK"), makeSymbol("MAKE-LOCK"), makeSymbol("MAKE-STRING"), makeSymbol("MAKUNBOUND"), makeSymbol("MAX"), makeSymbol("MEMBER"), makeSymbol("MEMBER-IF"), makeSymbol("MIN"), makeSymbol("MINUSP"), makeSymbol("MISMATCH"), makeSymbol("MOD"), makeSymbol("NBUTLAST"), makeSymbol("NCONC"), makeSymbol("NEW-GUID"), makeSymbol("NINTERSECTION"), makeSymbol("NINTH"), makeSymbol("NOT-A-NUMBER-P"), makeSymbol("NOTE-PERCENT-PROGRESS"), makeSymbol("NOTIFY"), makeSymbol("NRECONC"), makeSymbol("NREVERSE"), makeSymbol("NSET-DIFFERENCE"), makeSymbol("NSET-EXCLUSIVE-OR"), makeSymbol("NSTRING-CAPITALIZE"), makeSymbol("NSTRING-DOWNCASE"), makeSymbol("NSTRING-UPCASE"), makeSymbol("NSUBLIS"), makeSymbol("NSUBST"), makeSymbol("NSUBST-IF"), makeSymbol("NSUBSTITUTE"), makeSymbol("NSUBSTITUTE-IF"), makeSymbol("NTH"), makeSymbol("NTHCDR"), makeSymbol("NULL"), makeSymbol("NUMBERP"), makeSymbol("NUMBERP"), makeSymbol("NUNION"), makeSymbol("ODDP"), makeSymbol("PAIRLIS"), makeSymbol("PEEK-CHAR"), makeSymbol("PLUSP"), makeSymbol("POSITION"), makeSymbol("POSITION-IF"), makeSymbol("PRIN1"), makeSymbol("PRIN1-TO-STRING"), makeSymbol("PRINC"), makeSymbol("PRINC-TO-STRING"), makeSymbol("PRINT"), makeSymbol("PROCESS-ACTIVE-P"), makeSymbol("PROCESS-BLOCK"), makeSymbol("PROCESS-NAME"), makeSymbol("PROCESS-STATE"), makeSymbol("PROCESS-UNBLOCK"), makeSymbol("PROCESS-WAIT"), makeSymbol("PROCESS-WAIT-WITH-TIMEOUT"), makeSymbol("PROCESS-WHOSTATE"), makeSymbol("PROCESSP"), makeSymbol("RANDOM"), makeSymbol("RASSOC"), makeSymbol("RASSOC-IF"), makeSymbol("READ-FROM-STRING"), makeSymbol("READ-FROM-STRING-IGNORING-ERRORS"), makeSymbol("REM"), makeSymbol("REMF"), makeSymbol("REMHASH"), makeSymbol("REMOVE"), makeSymbol("REMOVE-DUPLICATES"), makeSymbol("REMOVE-IF"), makeSymbol("REPLACE"), makeSymbol("REST"), makeSymbol("REVAPPEND"), makeSymbol("REVERSE"), makeSymbol("REVERSE"), makeSymbol("ROOM"), makeSymbol("ROUND"), makeSymbol("RPLACA"), makeSymbol("RPLACD"), makeSymbol("SCALE-FLOAT"), makeSymbol("SEARCH"), makeSymbol("SECOND"), makeSymbol("SEED-RANDOM"), makeSymbol("SEQUENCEP"), makeSymbol("SET-AREF"), makeSymbol("SET-CONSING-STATE"), makeSymbol("SET-DIFFERENCE"), makeSymbol("SET-NTH"), makeSymbol("SEVENTH"), makeSymbol("SHOW-PROCESSES"), makeSymbol("SIN"), makeSymbol("SIXTH"), makeSymbol("QUIT", "SUBLISP"), makeSymbol("SLEEP"), makeSymbol("SORT"), makeSymbol("SQRT"), makeSymbol("STABLE-SORT"), makeSymbol("STRING"), makeSymbol("STRING-CAPITALIZE"), makeSymbol("STRING-DOWNCASE"), makeSymbol("STRING-EQUAL"), makeSymbol("STRING-GREATERP"), makeSymbol("STRING-LEFT-TRIM"), makeSymbol("STRING-LESSP"), makeSymbol("STRING-NOT-EQUAL"), makeSymbol("STRING-NOT-GREATERP"), makeSymbol("STRING-NOT-LESSP"), makeSymbol("STRING-RIGHT-TRIM"), makeSymbol("STRING-TO-GUID"), makeSymbol("STRING-TRIM"), makeSymbol("STRING-UPCASE"), makeSymbol("STRING/="), makeSymbol("STRING<"), makeSymbol("STRING<="), makeSymbol("STRING="), makeSymbol("STRING>"), makeSymbol("STRING>="), makeSymbol("STRINGP"), makeSymbol("SUBLIS"), makeSymbol("SUBSEQ"), makeSymbol("SUBSETP"), makeSymbol("SUBST"), makeSymbol("SUBST-IF"), makeSymbol("SUBSTITUTE"), makeSymbol("SUBSTITUTE-IF"), makeSymbol("SXHASH"), makeSymbol("SYMBOL-FUNCTION"), makeSymbol("SYMBOL-NAME"), makeSymbol("SYMBOLP"), makeSymbol("SYMBOLP"), makeSymbol("TAILP"), makeSymbol("TAN"), makeSymbol("TENTH"), makeSymbol("TERPRI"), makeSymbol("THIRD"), makeSymbol("TREE-EQUAL"), makeSymbol("TRUE"), makeSymbol("TRUNCATE"), makeSymbol("TYPE-OF"), makeSymbol("UNINTERN"), makeSymbol("UNION"), makeSymbol("UPPER-CASE-P"), makeSymbol("VALID-PROCESS-P"), makeSymbol("VALUES"), makeSymbol("VECTOR"), makeSymbol("VECTORP"), makeSymbol("WARN"), makeSymbol("WRITE-IMAGE"), makeSymbol("Y-OR-N-P"), makeSymbol("YES-OR-NO-P"), makeSymbol("ZEROP"), makeSymbol("PROPERTY-LIST-MEMBER", "SUBLISP"), makeSymbol("CDESTRUCTURING-BIND-ERROR", "SUBLISP"), makeSymbol("DESTRUCTURING-BIND-MUST-CONSP", "SUBLISP"), makeSymbol("DESTRUCTURING-BIND-MUST-LISTP", "SUBLISP") });
    }

    public static final SubLFile me = new eval_in_api_registrations();

 public static final String myName = "com.cyc.cycjava.cycl.eval_in_api_registrations";


    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $sublisp_api_predefined_functions$ = makeSymbol("*SUBLISP-API-PREDEFINED-FUNCTIONS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $api_host_access_functions$ = makeSymbol("*API-HOST-ACCESS-FUNCTIONS*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    public static final SubLSymbol $null_output$ = makeSymbol("*NULL-OUTPUT*");

    public static final SubLSymbol $it_verbose$ = makeSymbol("*IT-VERBOSE*");

    public static final SubLSymbol $progress_note$ = makeSymbol("*PROGRESS-NOTE*");

    public static final SubLSymbol $progress_sofar$ = makeSymbol("*PROGRESS-SOFAR*");

    public static final SubLSymbol $progress_start_time$ = makeSymbol("*PROGRESS-START-TIME*");

    public static final SubLSymbol $progress_total$ = makeSymbol("*PROGRESS-TOTAL*");

    public static final SubLSymbol $eval_with_bindings$ = makeSymbol("*EVAL-WITH-BINDINGS*");

    public static final SubLSymbol $error_output$ = makeSymbol("*ERROR-OUTPUT*");

    public static final SubLSymbol $standard_output$ = makeSymbol("*STANDARD-OUTPUT*");

    public static final SubLSymbol $continue_cerrorP$ = makeSymbol("*CONTINUE-CERROR?*");

    public static final SubLSymbol $silent_progressP$ = makeSymbol("*SILENT-PROGRESS?*");

    public static final SubLSymbol $ignore_breaksP$ = makeSymbol("*IGNORE-BREAKS?*");

    public static final SubLSymbol $ignore_warnsP$ = makeSymbol("*IGNORE-WARNS?*");

    public static final SubLSymbol $eval_in_api_trace_log$ = makeSymbol("*EVAL-IN-API-TRACE-LOG*");

    public static final SubLSymbol $eval_in_api_traced_fns$ = makeSymbol("*EVAL-IN-API-TRACED-FNS*");

    public static final SubLSymbol $eval_in_api_env$ = makeSymbol("*EVAL-IN-API-ENV*");

    public static final SubLSymbol $api_output_protocol$ = makeSymbol("*API-OUTPUT-PROTOCOL*");

    public static final SubLSymbol $api_result_method$ = makeSymbol("*API-RESULT-METHOD*");

    public static final SubLSymbol $api_input_protocol$ = makeSymbol("*API-INPUT-PROTOCOL*");

    public static final SubLSymbol $ke_purpose$ = makeSymbol("*KE-PURPOSE*");

    public static final SubLSymbol $the_cyclist$ = makeSymbol("*THE-CYCLIST*");

    public static final SubLSymbol $use_local_queueP$ = makeSymbol("*USE-LOCAL-QUEUE?*");

    public static final SubLSymbol $relevant_mt_function$ = makeSymbol("*RELEVANT-MT-FUNCTION*");

    public static final SubLSymbol $cyc_bookkeeping_info$ = makeSymbol("*CYC-BOOKKEEPING-INFO*");

    public static final SubLSymbol $suppress_sbhl_recachingP$ = makeSymbol("*SUPPRESS-SBHL-RECACHING?*");

    public static final SubLSymbol $paraphrase_precision$ = makeSymbol("*PARAPHRASE-PRECISION*");

    public static final SubLSymbol $eval_in_api_level$ = makeSymbol("*EVAL-IN-API-LEVEL*");

    public static final SubLSymbol $suspend_sbhl_type_checkingP$ = makeSymbol("*SUSPEND-SBHL-TYPE-CHECKING?*");

    public static final SubLSymbol $require_case_insensitive_name_uniqueness$ = makeSymbol("*REQUIRE-CASE-INSENSITIVE-NAME-UNIQUENESS*");

    public static final SubLSymbol $task_processor_verbosity$ = makeSymbol("*TASK-PROCESSOR-VERBOSITY*");

    static private final SubLSymbol $sym32$BQ_LIST_ = makeSymbol("BQ-LIST*");

    private static final SubLSymbol BQ_NCONC = makeSymbol("BQ-NCONC");

    private static final SubLSymbol BQ_VECTOR_APPEND = makeSymbol("BQ-VECTOR-APPEND");

    private static final SubLSymbol API_BQ_LIST = makeSymbol("API-BQ-LIST");

    private static final SubLSymbol WITH_PRECISE_PARAPHRASE_ON = makeSymbol("WITH-PRECISE-PARAPHRASE-ON");

    private static final SubLSymbol WITH_PARAPHRASE_PRECISION = makeSymbol("WITH-PARAPHRASE-PRECISION");

    private static final SubLSymbol WITH_BOOKKEEPING_INFO = makeSymbol("WITH-BOOKKEEPING-INFO");

    private static final SubLSymbol WITH_MT_FUNCTION = makeSymbol("WITH-MT-FUNCTION");

    private static final SubLSymbol WITH_GENL_MTS = makeSymbol("WITH-GENL-MTS");

    private static final SubLSymbol DO_PREDICATE_RULE_INDEX = makeSymbol("DO-PREDICATE-RULE-INDEX");

    private static final SubLSymbol DO_RULE_INDEX = makeSymbol("DO-RULE-INDEX");

    private static final SubLSymbol WITHOUT_WFF_SEMANTICS = makeSymbol("WITHOUT-WFF-SEMANTICS");

    private static final SubLSymbol CDOLIST_DONE = makeSymbol("CDOLIST-DONE");

    private static final SubLSymbol PROGRESS_CDOTIMES = makeSymbol("PROGRESS-CDOTIMES");

    private static final SubLSymbol OLD_DO_ID_INDEX = makeSymbol("OLD-DO-ID-INDEX");

    private static final SubLSymbol NEW_DO_ID_INDEX = makeSymbol("NEW-DO-ID-INDEX");

    private static final SubLSymbol DO_CONSTANTS = makeSymbol("DO-CONSTANTS");

    private static final SubLSymbol WITH_INPUT_FROM_STRING = makeSymbol("WITH-INPUT-FROM-STRING");

    private static final SubLSymbol DO_VECTOR_INDEX = makeSymbol("DO-VECTOR-INDEX");

    private static final SubLSymbol IN_MT = makeSymbol("IN-MT");

    private static final SubLSymbol DO_ITERATOR_WITHOUT_VALUES_PROGRESS = makeSymbol("DO-ITERATOR-WITHOUT-VALUES-PROGRESS");

    private static final SubLSymbol WITH_OPEN_STREAM = makeSymbol("WITH-OPEN-STREAM");

    private static final SubLSymbol WITH_OPEN_FILE = makeSymbol("WITH-OPEN-FILE");

    public static final SubLObject $list64 = _constant_64_initializer();

    private static final SubLList $list65 = list(new SubLObject[]{ makeSymbol("ADD1"), makeSymbol("ADD2"), makeSymbol("API-DYNAMIC-VARIABLE-P"), makeSymbol("API-LEXICAL-VARIABLE-P"), makeSymbol("API-TEST-FN"), makeSymbol("B-VERIFY"), makeSymbol("BOOLEANP"), makeSymbol("CFASL-LOAD"), makeSymbol("COPY-HASH-TABLE"), makeSymbol("CYC-IMAGE-ID"), makeSymbol("CYCL-PATCH-NUMBER"), makeSymbol("CYCL-SYSTEM-NUMBER"), makeSymbol("DEF-INFERENCE-TEST"), makeSymbol("DEFINE-INFERENCE-TEST"), makeSymbol("DIV2"), makeSymbol("EVAL-IN-API-PREDEFINED-FN?"), makeSymbol("EVAL-IN-API-USER-FN?"), makeSymbol("FLOAT-PARSE-INTEGER"), makeSymbol("FLONUM-DIGIT-LIST"), makeSymbol("FROB-CASE"), makeSymbol("GENERATE-STALE-DOCUMENTATION-REPORT"), makeSymbol("GET-TIME"), makeSymbol("GET-TIMEZONE"), makeSymbol("HALT-CYC-IMAGE"), makeSymbol("HERALD-START"), makeSymbol("KB-LOADED"), makeSymbol("LOAD-WORLD"), makeSymbol("LOCK-LOCKER"), makeSymbol("LOCK-NAME"), makeSymbol("MACROP"), makeSymbol("MAX2"), makeSymbol("MEMBER?"), makeSymbol("MIN2"), makeSymbol("MINUS"), makeSymbol("MULT2"), makeSymbol("NAME-CHARACTER"), makeSymbol("NCONC2"), makeSymbol("NON-NEGATIVE-INTEGER-P"), makeSymbol("NON-TERMINATING-MACRO-SYNTAXP"), makeSymbol("NOT-A-LIST-ARGUMENT"), makeSymbol("POSSIBLY-GC"), makeSymbol("POTENTIAL-NUMBER-P"), makeSymbol("PRINT-ASSERT"), makeSymbol("PRINT-CREATE"), makeSymbol("PRINT-KILL"), makeSymbol("PROCESS-VALID-P"), makeSymbol("PROCESS-YIELD"), makeSymbol("RANDOM-ASSERTION"), makeSymbol("RANDOM-CONSTANT"), makeSymbol("RANDOM-NART"), makeSymbol("RELEASE-LOCK"), makeSymbol("ROUND-DIGITS"), makeSymbol("RUN-TEST"), makeSymbol("SEIZE-LOCK"), makeSymbol("SFORMP"), makeSymbol("SINGLE-BYTE-P"), makeSymbol("STRING-DESIGNATORP"), makeSymbol("SUB1"), makeSymbol("SUB2"), makeSymbol("UPDATE-TEST-RESULTS"), makeSymbol("WHITESPACE-1-CHAR-P"), makeSymbol("WHITESPACE-2-CHAR-P") });

    private static final SubLList $list66 = list(new SubLObject[]{ makeSymbol("NEW-DICTIONARY"), makeSymbol("DICTIONARY-LENGTH"), makeSymbol("CLEAR-DICTIONARY"), makeSymbol("DICTIONARY-ENTER"), makeSymbol("DICTIONARY-PUSH"), makeSymbol("DICTIONARY-PUSHNEW"), makeSymbol("DICTIONARY-REMOVE-FROM-VALUE"), makeSymbol("DICTIONARY-REMOVE"), makeSymbol("DICTIONARY-LOOKUP"), makeSymbol("DICTIONARY-KEYS"), makeSymbol("DICTIONARY-VALUES") });

    private static final SubLSymbol STRING_TO_GUID = makeSymbol("STRING-TO-GUID");

    private static final SubLSymbol NEW_BOOKKEEPING_INFO = makeSymbol("NEW-BOOKKEEPING-INFO");

    private static final SubLSymbol STRING_SUBSTITUTE = makeSymbol("STRING-SUBSTITUTE");

    private static final SubLSymbol THE_DATE = makeSymbol("THE-DATE");

    private static final SubLSymbol THE_SECOND = makeSymbol("THE-SECOND");

    private static final SubLSymbol $sym77$WHY_COLLECTIONS_INTERSECT_ = makeSymbol("WHY-COLLECTIONS-INTERSECT?");

    private static final SubLSymbol ARG1_FORMAT = makeSymbol("ARG1-FORMAT");

    private static final SubLSymbol ARG2_FORMAT = makeSymbol("ARG2-FORMAT");

    private static final SubLSymbol COLLECTION_LEAVES = makeSymbol("COLLECTION-LEAVES");

    private static final SubLSymbol SIMPLE_INDEXED_TERM_P = makeSymbol("SIMPLE-INDEXED-TERM-P");

    private static final SubLSymbol MAX_SPECS = makeSymbol("MAX-SPECS");

    private static final SubLSymbol MIN_ISA = makeSymbol("MIN-ISA");

    private static final SubLSymbol LOCAL_DISJOINT_WITH = makeSymbol("LOCAL-DISJOINT-WITH");

    private static final SubLSymbol $sym86$DISJOINT_WITH_ = makeSymbol("DISJOINT-WITH?");

    private static final SubLSymbol GENL_SIBLINGS = makeSymbol("GENL-SIBLINGS");

    private static final SubLSymbol SPEC_SIBLINGS = makeSymbol("SPEC-SIBLINGS");

    private static final SubLSymbol ARG1_ISA = makeSymbol("ARG1-ISA");

    private static final SubLSymbol ARG2_ISA = makeSymbol("ARG2-ISA");

    private static final SubLSymbol ARGN_ISA = makeSymbol("ARGN-ISA");

    private static final SubLSymbol ARGN_GENL = makeSymbol("ARGN-GENL");

    private static final SubLSymbol ALL_GENLS_IN_ANY_MT = makeSymbol("ALL-GENLS-IN-ANY-MT");

    private static final SubLSymbol ALL_ISA_IN_ANY_MT = makeSymbol("ALL-ISA-IN-ANY-MT");

    private static final SubLSymbol ALL_FORT_INSTANCES_IN_ALL_MTS = makeSymbol("ALL-FORT-INSTANCES-IN-ALL-MTS");

    private static final SubLSymbol $sym96$ISA_IN_ANY_MT_ = makeSymbol("ISA-IN-ANY-MT?");

    private static final SubLSymbol $sym97$GENL_IN_ANY_MT_ = makeSymbol("GENL-IN-ANY-MT?");

    private static final SubLSymbol NEW_CONSTANT_NAME_SPEC_P = makeSymbol("NEW-CONSTANT-NAME-SPEC-P");

    private static final SubLSymbol DO_RULE_INDEX_RULES = makeSymbol("DO-RULE-INDEX-RULES");

    private static final SubLSymbol BT_LOWER = makeSymbol("BT-LOWER");

    private static final SubLSymbol BT_HIGHER = makeSymbol("BT-HIGHER");

    private static final SubLSymbol SAMPLE_LEAF_SPECS = makeSymbol("SAMPLE-LEAF-SPECS");

    private static final SubLSymbol $sym103$TACIT_COEXTENSIONAL_ = makeSymbol("TACIT-COEXTENSIONAL?");

    private static final SubLSymbol $sym104$EL_WFF_ = makeSymbol("EL-WFF?");

    private static final SubLSymbol $sym105$EVALUATABLE_PREDICATE_ = makeSymbol("EVALUATABLE-PREDICATE?");

    private static final SubLSymbol $sym106$HIERARCHICAL_COLLECTIONS_ = makeSymbol("HIERARCHICAL-COLLECTIONS?");

    private static final SubLSymbol NUM_BEST_GAF_LOOKUP_INDEX = makeSymbol("NUM-BEST-GAF-LOOKUP-INDEX");

    private static final SubLSymbol API_QUIT = makeSymbol("API-QUIT");

    private static final SubLSymbol FORT_FOR_STRING = makeSymbol("FORT-FOR-STRING");

    private static final SubLSymbol $sym113$RTP_PARSE_EXP_W_VPP = makeSymbol("RTP-PARSE-EXP-W/VPP");

    private static final SubLSymbol DECODE_UNIVERSAL_TIME = makeSymbol("DECODE-UNIVERSAL-TIME");

    private static final SubLSymbol CONSTANT_GUID = makeSymbol("CONSTANT-GUID");

    private static final SubLSymbol RKF_PHRASE_READER = makeSymbol("RKF-PHRASE-READER");

    private static final SubLSymbol GENERATE_DISAMBIGUATION_PHRASES_AND_TYPES = makeSymbol("GENERATE-DISAMBIGUATION-PHRASES-AND-TYPES");

    private static final SubLSymbol LOAD_TRANSCRIPT_FILE = makeSymbol("LOAD-TRANSCRIPT-FILE");

    private static final SubLSymbol KB_STATISTICS = makeSymbol("KB-STATISTICS");

    private static final SubLSymbol $sym122$GENL_MT_ = makeSymbol("GENL-MT?");

    private static final SubLSymbol ALL_SPEC_MTS = makeSymbol("ALL-SPEC-MTS");

    private static final SubLSymbol REMOVAL_ASK = makeSymbol("REMOVAL-ASK");

    private static final SubLSymbol DO_NARTS_TABLE = makeSymbol("DO-NARTS-TABLE");

    private static final SubLSymbol ID_INDEX_COUNT = makeSymbol("ID-INDEX-COUNT");

    private static final SubLSymbol ID_INDEX_DENSE_OBJECTS = makeSymbol("ID-INDEX-DENSE-OBJECTS");

    private static final SubLSymbol ID_INDEX_EMPTY_P = makeSymbol("ID-INDEX-EMPTY-P");

    private static final SubLSymbol ID_INDEX_SPARSE_ID_THRESHOLD = makeSymbol("ID-INDEX-SPARSE-ID-THRESHOLD");

    private static final SubLSymbol ID_INDEX_NEXT_ID = makeSymbol("ID-INDEX-NEXT-ID");

    private static final SubLSymbol CYCL_NART_P = makeSymbol("CYCL-NART-P");

    private static final SubLSymbol CYCL_NAUT_P = makeSymbol("CYCL-NAUT-P");

    private static final SubLSymbol RESOLVE_NEW_CONSTANTS = makeSymbol("RESOLVE-NEW-CONSTANTS");

    private static final SubLSymbol CYC_OPENCYC_FEATURE = makeSymbol("CYC-OPENCYC-FEATURE");

    private static final SubLSymbol CYC_RESEARCHCYC_FEATURE = makeSymbol("CYC-RESEARCHCYC-FEATURE");

    private static final SubLSymbol CANONICALIZE_HLMT = makeSymbol("CANONICALIZE-HLMT");

    private static final SubLSymbol REGISTER_SOLELY_SPECIFIC_REMOVAL_MODULE_PREDICATE = makeSymbol("REGISTER-SOLELY-SPECIFIC-REMOVAL-MODULE-PREDICATE");

    private static final SubLSymbol INFERENCE_REMOVAL_MODULE = makeSymbol("INFERENCE-REMOVAL-MODULE");

    private static final SubLSymbol UNDECLARE_INFERENCE_REMOVAL_MODULE = makeSymbol("UNDECLARE-INFERENCE-REMOVAL-MODULE");

    static private final SubLList $list141 = list(new SubLObject[]{ makeSymbol("UIA-TERM-PHRASE-MEMOIZED"), makeSymbol("BLUE-FETCH-UIA-BLUE-EVENT"), makeSymbol("BBF-RTV-ALL-EDGES-FROM-NODE"), makeSymbol("BBF-MIN-FORWARD-AND-BACKWARD-TRUE"), makeSymbol("BBF-RTV-ALL-EDGES-BETWEEN"), makeSymbol("BBF-ALL-EDGES-SUBSUMED-BY-PREDS"), makeSymbol("BBF-FORWARD-TRUE"), makeSymbol("BBF-BACKWARD-TRUE"), makeSymbol("BBF-MIN-FORWARD-TRUE"), makeSymbol("BBF-MIN-BACKWARD-TRUE"), makeSymbol("BBF-MIN-CEILINGS-FORWARD-TRUE"), makeSymbol("BBF-SCRIPT"), makeSymbol("BFF-EELD-IRRELEVANT-TERMS"), makeSymbol("BFF-CYC-KB-SUBSET-COLLECTIONS"), makeSymbol("BFF-ARBITRARY-UNIONS"), makeSymbol("BFF-MOST-GENERAL-5"), makeSymbol("BFF-MOST-GENERAL-10"), makeSymbol("BFF-MOST-GENERAL-20") });

    static private final SubLList $list142 = list(new SubLObject[]{ makeSymbol("GET-QUERY-LIBRARY-IN-XML-FROM-DEFAULT-MT"), makeSymbol("GET-ONE-LEVEL-QUERY-LIBRARY-IN-XML-FROM-DEFAULT-MT"), makeSymbol("GET-ORIGINAL-STRING-FOR-QUERY"), makeSymbol("PARSED-QUERY-TEMPLATE-P"), makeSymbol("CLEAR-INVERTED-INDEX"), makeSymbol("INDEX-QUERIES-FROM-NODE"), makeSymbol("ADD-TEMPLATE-WITH-FORMULA-AND-GLOSS"), makeSymbol("SUGGEST-LOADING-MT-FOR-CYCL-QUERY"), makeSymbol("CREATE-MINIMAL-FORMULA-TEMPLATE-WITH-QUERY"), makeSymbol("CREATE-NEW-FORMULA-TEMPLATE-WITH-QUERY"), makeSymbol("GET-VARIABLE-MAPPINGS-FOR-QUERIES-IN-XML"), makeSymbol("GET-VARIABLE-MAPPINGS-FOR-FORMULAS-IN-XML"), makeSymbol("JOIN-FORMULAS-ALONG-VARIABLE-MAPPINGS"), makeSymbol("JOIN-QUERIES-ALONG-VARIABLE-MAPPINGS"), makeSymbol("MAIL-TO-USER"), makeSymbol("MAIL-TO-USER-WITH-CONTENT-TYPE"), makeSymbol("APPLICABLE-TEMPLATE-TOPICS-FOR-TERM"), makeSymbol("FOCAL-TERM-TYPE-FOR-TOPIC-TYPE"), makeSymbol("WFF?") });

    static private final SubLList $list143 = list(new SubLObject[]{ makeSymbol("PPH-INFERENCE-ANSWER-PROOFS"), makeSymbol("GKE-START-CONTINUABLE-QUERY"), makeSymbol("GKE-CONTINUE-QUERY"), makeSymbol("GKE-STOP-CONTINUABLE-QUERY"), makeSymbol("GKE-GET-INFERENCE-RESULTS"), makeSymbol("GKE-GET-ONE-INFERENCE-RESULT"), makeSymbol("GKE-GET-INFERENCE-STATUS"), makeSymbol("GKE-GET-INFERENCE-SUSPEND-STATUS"), makeSymbol("GKE-INFERENCE-COMPLETE?"), makeSymbol("GKE-RELEASE-INFERENCE-RESOURCES"), makeSymbol("INFERENCE-ANSWER-MINIMAL-ABDUCTION-COUNT") });

    static private final SubLList $list144 = list(makeSymbol("GENERATE-PHRASE-FOR-JAVA"), makeSymbol("GET-TERM-LIST-AS-RENDERINGS"), makeSymbol("GET-EXAMPLE-INSTANCES-AS-RENDERINGS"), makeSymbol("GET-EXAMPLE-INSTANCES-AS-RENDERINGS-NEW"), makeSymbol("GET-INSTANCES-AS-RENDERINGS"), makeSymbol("DENOTS-OF-STRING"));

    static private final SubLList $list145 = list(makeSymbol("REFORMULATE-UNKNOWN-FET-TERM"), makeSymbol("CLEAR-GET-SOURCE-CONCEPTUAL-WORKS-FOR-PROJECT"), makeSymbol("GET-SOURCE-CONCEPTUAL-WORKS-FOR-PROJECT"), makeSymbol("GET-TEMPLATE-TOPIC-IN-XML"), makeSymbol("FIND-TEMPLATE-TOPIC-MATCHES-FOR-CONSTRAINT"), makeSymbol("GET-TEMPLATE-TOPIC-ASSERTIONS-FOR-MATCH-IN-XML"));

    static private final SubLList $list146 = list(makeSymbol("CONSTANT-VIA-STAR-COMPLETION"), makeSymbol("DELETE-IF"), makeSymbol("EL-NEGATE"), makeSymbol("RELATION-P"), makeSymbol("ALL-RELATION-CONSTRAINT-SENTENCES"));

    static private final SubLList $list147 = list(new SubLObject[]{ makeSymbol("ADD-TEMPLATE-WITH-FORMULA-AND-GLOSS"), makeSymbol("ANSWER-GUI-QUESTION"), makeSymbol("CLEAR-INVERTED-INDEX"), makeSymbol("FIND-INFERENCE-BY-ID"), makeSymbol("FIND-PROBLEM-STORE-BY-ID"), makeSymbol("FLATTEN"), makeSymbol("GET-ORIGINAL-STRING-FOR-QUERY"), makeSymbol("INDEX-QUERIES-FROM-NODE"), makeSymbol("INDEXED-QUERIES-FROM-STRING"), makeSymbol("INFERENCE-INPUT-EL-QUERY"), makeSymbol("NART-SUBSTITUTE"), makeSymbol("PARSED-QUERY-TEMPLATE-P"), makeSymbol("POSITIVE-INFINITY"), makeSymbol("PREDICATE-P"), makeSymbol("REMOVE-IF-NOT"), makeSymbol("SKSI-SUPPORTED-EXTERNAL-TERM?") });

    static private final SubLList $list148 = list(new SubLObject[]{ makeSymbol("ADD-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER"), makeSymbol("ALIST-ENTER"), makeSymbol("ANSWER-GUI-QUESTION"), makeSymbol("AUGMENTED-QUERY-STRING-FOR-CYCL-TERMS"), makeSymbol("CREATE-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER"), makeSymbol("CREATE-KB-MODIFICATION-EVENT-FILTER"), makeSymbol("CYCLIST-NOTES"), makeSymbol("DELETE-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER"), makeSymbol("DELETE-KB-MODIFICATION-EVENT-FILTER"), makeSymbol("EXPLANATION-OF-WHY-NOT-WFF"), makeSymbol("EXPLANATION-OF-WHY-NOT-WFF-ASK"), makeSymbol("FIND-ASSERTION-CYCL"), makeSymbol("FIND-CONSTANT-BY-GUID"), makeSymbol("FIND-INFERENCE-ANSWER-BY-IDS"), makeSymbol("FIND-VALID-FET-TOPIC"), makeSymbol("GED-TO-XML-STRING"), makeSymbol("GET-FOLLOWUPS-FOR-ENTITY"), makeSymbol("GET-PASSAGES-FOR-ENTITY"), makeSymbol("HLMT-MONAD-MT"), makeSymbol("HLMT-TEMPORAL-MT"), makeSymbol("HTML-VAR-VALUE"), makeSymbol("IDENTIFY-ALL-GEQ-ENTITIES"), makeSymbol("MAKE-INDUCED-TOPIC-TYPE-FOR-TERM"), makeSymbol("MYSENTIENT-ARE-VERSIONS-SUPPORTED?"), makeSymbol("PPH-INFERENCE-ANSWER-JUSTIFICATION-FOR-JAVA"), makeSymbol("PPH-PROOF-DEPTH"), makeSymbol("PPH-SUMMARIZE-TERM"), makeSymbol("PROOF-SUID"), makeSymbol("REGISTER-CYCLIFY-PARSER"), makeSymbol("REMOVE-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER"), makeSymbol("RETURN-DOCUMENT-AS-STRING"), makeSymbol("SENTENCIFY-REMOTELY"), makeSymbol("TEMPLATE-TYPE-FOR-FOCAL-TERM-TYPE"), makeSymbol("TOPICS-RELATED-TO-ENTITY"), makeSymbol("WFF-QUERY?") });

    private static final SubLList $list149 = list(makeSymbol("WITH-PARAPHRASE-MAPPINGS"), makeSymbol("WITHIN-ASSERT"));

    static private final SubLList $list150 = list(new SubLObject[]{ makeSymbol("*CB-ASSERTION-HISTORY*"), makeSymbol("*CB-CONSTANT-HISTORY*"), makeSymbol("*CB-NAT-HISTORY*"), makeSymbol("*CB-SENTENCE-HISTORY*"), makeSymbol("*PARAPHRASE-PRECISION*"), makeSymbol("*PPH-ADDRESSEE*"), makeSymbol("*PPH-DEMERIT-CUTOFF*"), makeSymbol("*PPH-DOMAIN-MT*"), makeSymbol("*PPH-LANGUAGE-MT*"), makeSymbol("*PPH-LINK-ARG0?*"), makeSymbol("*PPH-MAXIMIZE-LINKS?*"), makeSymbol("*PPH-REPLACE-BULLETED-LIST-TAGS?*"), makeSymbol("*PPH-SPEAKER*"), makeSymbol("*PPH-SUGGESTED-DEMERIT-CUTOFF*"), makeSymbol("*PPH-TERSE-MT-SCOPE?*"), makeSymbol("*PPH-USE-BULLETED-LISTS?*"), makeSymbol("*PPH-USE-INDEXICAL-DATES?*"), makeSymbol("*PPH-USE-SMART-VARIABLE-REPLACEMENT?*"), makeSymbol("*PPH-USE-TITLE-CAPITALIZATION?*") });

    private static final SubLSymbol $sym151$__ = makeSymbol("<>");

    private static final SubLList $list152 = list(makeSymbol("FI-CREATE-SKOLEM"), makeSymbol("FI-MERGE"), makeSymbol("FI-REASSERT"), makeSymbol("FI-JUSTIFY"), makeSymbol("FI-DENOTATION"), makeSymbol("FI-TIMESTAMP-CONSTANT"), makeSymbol("FI-TIMESTAMP-ASSERTION"));

    private static final SubLList $list153 = list(new SubLObject[]{ makeSymbol("BROADCAST-STREAM-STREAMS"), makeSymbol("CLEAR-INPUT"), makeSymbol("CLEAR-OUTPUT"), makeSymbol("CLOSE"), makeSymbol("CONCATENATED-STREAM-STREAMS"), makeSymbol("CONSTRUCT-FILENAME"), makeSymbol("CURRENT-PROCESS"), makeSymbol("CYC-IMAGE-ID"), makeSymbol("DIRECTORY"), makeSymbol("DIRECTORY-P"), makeSymbol("ECHO-STREAM-INPUT-STREAM"), makeSymbol("ECHO-STREAM-OUTPUT-STREAM"), makeSymbol("ENDP"), makeSymbol("FILE-AUTHOR"), makeSymbol("FILE-LENGTH"), makeSymbol("FILE-POSITION"), makeSymbol("FILE-STRING-LENGTH"), makeSymbol("FILE-WRITE-DATE"), makeSymbol("FINISH-OUTPUT"), makeSymbol("GETF"), makeSymbol("GET-FILE-POSITION"), makeSymbol("GET-MACHINE-NAME"), makeSymbol("GET-NETWORK-NAME"), makeSymbol("GET-OUTPUT-STREAM-STRING"), makeSymbol("GET-PROCESS-ID"), makeSymbol("GET-STRING-FROM-USER"), makeSymbol("GET-USER-NAME"), makeSymbol("INPUT-STREAM-P"), makeSymbol("INTERACTIVE-STREAM-P"), makeSymbol("INTERN"), makeSymbol("INTERRUPT-PROCESS"), makeSymbol("KEYWORDP"), makeSymbol("KILL-PROCESS"), makeSymbol("LISP-IMPLEMENTATION-TYPE"), makeSymbol("LISP-IMPLEMENTATION-VERSION"), makeSymbol("LISTEN"), makeSymbol("LONG-SITE-NAME"), makeSymbol("MACHINE-INSTANCE"), makeSymbol("MACHINE-TYPE"), makeSymbol("MACHINE-VERSION"), makeSymbol("MAKE-BROADCAST-STREAM"), makeSymbol("MAKE-CONCATENATED-STREAM"), makeSymbol("MAKE-DIRECTORY"), makeSymbol("MAKE-ECHO-STREAM"), makeSymbol("MAKE-KEYWORD"), makeSymbol("MAKE-LIST"), makeSymbol("MAKE-LOCK"), makeSymbol("MAKE-PACKAGE"), makeSymbol("MAKE-PROCESS"), makeSymbol("MAKE-STRING-INPUT-STREAM"), makeSymbol("MAKE-STRING-OUTPUT-STREAM"), makeSymbol("MAKE-SYNONYM-STREAM"), makeSymbol("MAKE-TWO-WAY-STREAM"), makeSymbol("OPEN"), makeSymbol("OPEN-BINARY"), makeSymbol("OPEN-STREAM-P"), makeSymbol("OPEN-TCP-STREAM"), makeSymbol("OPEN-TCP-STREAM-WITH-TIMEOUT"), makeSymbol("OPEN-TEXT"), makeSymbol("OUTPUT-STREAM-P"), makeSymbol("PACKAGE-LOCKED-P"), makeSymbol("PACKAGE-NAME"), makeSymbol("PACKAGE-NICKNAMES"), makeSymbol("PACKAGEP"), makeSymbol("PACKAGE-USED-BY-LIST"), makeSymbol("PACKAGE-USE-LIST"), makeSymbol("PEEK-CHAR"), makeSymbol("PROBE-FILE"), makeSymbol("PROCESS-ACTIVE-P"), makeSymbol("PROCESS-BLOCK"), makeSymbol("PROCESS-NAME"), makeSymbol("PROCESSP"), makeSymbol("PROCESS-STATE"), makeSymbol("PROCESS-UNBLOCK"), makeSymbol("PROCESS-WAIT"), makeSymbol("PROCESS-WAIT-WITH-TIMEOUT"), makeSymbol("PROCESS-WHOSTATE"), makeSymbol("PUT"), makeSymbol("PUTF"), makeSymbol("READ"), makeSymbol("READ-BYTE"), makeSymbol("READ-CHAR"), makeSymbol("READ-CHAR-NO-HANG"), makeSymbol("READ-DELIMITED-LIST"), makeSymbol("READ-IGNORING-ERRORS"), makeSymbol("READ-LINE"), makeSymbol("READ-PRESERVING-WHITESPACE"), makeSymbol("READ-SEQUENCE"), makeSymbol("REMPROP"), makeSymbol("RENAME-FILE"), makeSymbol("SHORT-SITE-NAME"), makeSymbol("SERVER-SUMMARY"), makeSymbol("SHOW-PROCESSES"), makeSymbol("SIMPLE-READER-ERROR"), makeSymbol("SOFTWARE-TYPE"), makeSymbol("SOFTWARE-VERSION"), makeSymbol("STREAMP"), makeSymbol("SYNONYM-STREAM-SYMBOL"), makeSymbol("TWO-WAY-STREAM-INPUT-STREAM"), makeSymbol("TWO-WAY-STREAM-OUTPUT-STREAM"), makeSymbol("UNREAD-CHAR"), makeSymbol("USER-CONFIRM"), makeSymbol("VALID-PROCESS-P"), makeSymbol("WRITE"), makeSymbol("WRITE-BYTE"), makeSymbol("WRITE-CHAR"), makeSymbol("WRITE-LINE"), makeSymbol("WRITE-SEQUENCE"), makeSymbol("WRITE-STRING"), makeSymbol("WRITE-TO-STRING") });

    private static final SubLSymbol PHRASE_FOR_MT = makeSymbol("PHRASE-FOR-MT");

    private static final SubLSymbol NOTING_PROGRESS = makeSymbol("NOTING-PROGRESS");

    private static final SubLSymbol NOTE_PROGRESS = makeSymbol("NOTE-PROGRESS");

    private static final SubLSymbol NEW_ALEXANDRIA_ITERATOR = makeSymbol("NEW-ALEXANDRIA-ITERATOR");

    private static final SubLSymbol ALEXANDRIA_KB_STORE_ITERATOR_DONE = makeSymbol("ALEXANDRIA-KB-STORE-ITERATOR-DONE");

    private static final SubLSymbol ALEXANDRIA_KB_STORE_ITERATOR_FINALIZE = makeSymbol("ALEXANDRIA-KB-STORE-ITERATOR-FINALIZE");

    private static final SubLSymbol COUNT_ALEXANDRIA_GAFS_MATCHING_FORMULA = makeSymbol("COUNT-ALEXANDRIA-GAFS-MATCHING-FORMULA");

    private static final SubLSymbol COUNT_ALEXANDRIA_GAFS_MATCHING_FORMULA_RELEVANT_MT_AND_PRED = makeSymbol("COUNT-ALEXANDRIA-GAFS-MATCHING-FORMULA-RELEVANT-MT-AND-PRED");

    private static final SubLSymbol CREATE_ALEXANDRIA_GAFS_MATCHING_FORMULA_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-GAFS-MATCHING-FORMULA-ITERATOR-STATE");

    private static final SubLSymbol NEW_ALEXANDRIA_GAFS_MATCHING_FORMULA_ITERATOR = makeSymbol("NEW-ALEXANDRIA-GAFS-MATCHING-FORMULA-ITERATOR");

    private static final SubLSymbol $sym164$CREATE_ALEXANDRIA_GAFS_MATCHING_FORMULA_RELEVANT_MT_AND_PRED_ITER = makeSymbol("CREATE-ALEXANDRIA-GAFS-MATCHING-FORMULA-RELEVANT-MT-AND-PRED-ITERATOR-STATE");

    private static final SubLSymbol $sym165$NEW_ALEXANDRIA_GAFS_MATCHING_FORMULA_RELEVANT_MT_AND_PRED_ITERATO = makeSymbol("NEW-ALEXANDRIA-GAFS-MATCHING-FORMULA-RELEVANT-MT-AND-PRED-ITERATOR");

    private static final SubLSymbol CREATE_ALEXANDRIA_NATS_MATCHING_FORMULA_ITERATOR = makeSymbol("CREATE-ALEXANDRIA-NATS-MATCHING-FORMULA-ITERATOR");

    private static final SubLSymbol NEW_ALEXANDRIA_NATS_MATCHING_FORMULA_ITERATOR = makeSymbol("NEW-ALEXANDRIA-NATS-MATCHING-FORMULA-ITERATOR");

    private static final SubLSymbol COUNT_ALEXANDRIA_NATS_MATCHING_FORMULA = makeSymbol("COUNT-ALEXANDRIA-NATS-MATCHING-FORMULA");

    private static final SubLSymbol COUNT_ALEXANDRIA_REIFIABLE_FUNCTION_EXTENT = makeSymbol("COUNT-ALEXANDRIA-REIFIABLE-FUNCTION-EXTENT");

    private static final SubLSymbol CREATE_ALEXANDRIA_REIFIABLE_FUNCTION_EXTENT_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-REIFIABLE-FUNCTION-EXTENT-ITERATOR-STATE");

    private static final SubLSymbol NEW_ALEXANDRIA_REIFIABLE_FUNCTION_EXTENT_ITERATOR = makeSymbol("NEW-ALEXANDRIA-REIFIABLE-FUNCTION-EXTENT-ITERATOR");

    private static final SubLSymbol CREATE_ALEXANDRIA_ALL_FORTS_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-ALL-FORTS-ITERATOR-STATE");

    private static final SubLSymbol NEW_ALEXANDRIA_ALL_FORTS_ITERATOR = makeSymbol("NEW-ALEXANDRIA-ALL-FORTS-ITERATOR");

    private static final SubLSymbol CREATE_ALEXANDRIA_ALL_GAFS_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-ALL-GAFS-ITERATOR-STATE");

    private static final SubLSymbol NEW_ALEXANDRIA_ALL_GAFS_ITERATOR = makeSymbol("NEW-ALEXANDRIA-ALL-GAFS-ITERATOR");

    private static final SubLSymbol CREATE_ALEXANDRIA_ALL_RULES_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-ALL-RULES-ITERATOR-STATE");

    private static final SubLSymbol NEW_ALEXANDRIA_ALL_RULES_ITERATOR = makeSymbol("NEW-ALEXANDRIA-ALL-RULES-ITERATOR");

    private static final SubLSymbol CREATE_ALEXANDRIA_ALL_UNBOUND_RULES_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-ALL-UNBOUND-RULES-ITERATOR-STATE");

    private static final SubLSymbol NEW_ALEXANDRIA_ALL_UNBOUND_RULES_ITERATOR = makeSymbol("NEW-ALEXANDRIA-ALL-UNBOUND-RULES-ITERATOR");

    private static final SubLSymbol CREATE_ALEXANDRIA_ALL_UNBOUND_RULES_RELEVANT_MT_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-ALL-UNBOUND-RULES-RELEVANT-MT-ITERATOR-STATE");

    private static final SubLSymbol NEW_ALEXANDRIA_ALL_UNBOUND_RULES_RELEVANT_MT_ITERATOR = makeSymbol("NEW-ALEXANDRIA-ALL-UNBOUND-RULES-RELEVANT-MT-ITERATOR");

    private static final SubLSymbol CREATE_ALEXANDRIA_ALL_ASSERTIONS_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-ALL-ASSERTIONS-ITERATOR-STATE");

    private static final SubLSymbol NEW_ALEXANDRIA_ALL_ASSERTIONS_ITERATOR = makeSymbol("NEW-ALEXANDRIA-ALL-ASSERTIONS-ITERATOR");

    private static final SubLSymbol CREATE_ALEXANDRIA_ALL_BIG_INTEGERS_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-ALL-BIG-INTEGERS-ITERATOR-STATE");

    private static final SubLSymbol NEW_ALEXANDRIA_ALL_BIG_INTEGERS_ITERATOR = makeSymbol("NEW-ALEXANDRIA-ALL-BIG-INTEGERS-ITERATOR");

    private static final SubLSymbol CREATE_ALEXANDRIA_ALL_INTEGERS_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-ALL-INTEGERS-ITERATOR-STATE");

    private static final SubLSymbol NEW_ALEXANDRIA_ALL_INTEGERS_ITERATOR = makeSymbol("NEW-ALEXANDRIA-ALL-INTEGERS-ITERATOR");

    private static final SubLSymbol CREATE_ALEXANDRIA_ALL_BOOKKEEPING_GAFS_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-ALL-BOOKKEEPING-GAFS-ITERATOR-STATE");

    private static final SubLSymbol NEW_ALEXANDRIA_ALL_BOOKKEEPING_GAFS_ITERATOR = makeSymbol("NEW-ALEXANDRIA-ALL-BOOKKEEPING-GAFS-ITERATOR");

    private static final SubLSymbol CREATE_ALEXANDRIA_ALL_CONSTANTS_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-ALL-CONSTANTS-ITERATOR-STATE");

    private static final SubLSymbol NEW_ALEXANDRIA_ALL_CONSTANTS_ITERATOR = makeSymbol("NEW-ALEXANDRIA-ALL-CONSTANTS-ITERATOR");

    private static final SubLSymbol CREATE_ALEXANDRIA_ALL_NARTS_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-ALL-NARTS-ITERATOR-STATE");

    private static final SubLSymbol NEW_ALEXANDRIA_ALL_NARTS_ITERATOR = makeSymbol("NEW-ALEXANDRIA-ALL-NARTS-ITERATOR");

    private static final SubLSymbol CREATE_ALEXANDRIA_ALL_DEDUCTIONS_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-ALL-DEDUCTIONS-ITERATOR-STATE");

    private static final SubLSymbol NEW_ALEXANDRIA_ALL_DEDUCTIONS_ITERATOR = makeSymbol("NEW-ALEXANDRIA-ALL-DEDUCTIONS-ITERATOR");

    private static final SubLSymbol CREATE_ALEXANDRIA_ALL_FLOATS_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-ALL-FLOATS-ITERATOR-STATE");

    private static final SubLSymbol NEW_ALEXANDRIA_ALL_FLOATS_ITERATOR = makeSymbol("NEW-ALEXANDRIA-ALL-FLOATS-ITERATOR");

    private static final SubLSymbol CREATE_ALEXANDRIA_ALL_FORMULAS_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-ALL-FORMULAS-ITERATOR-STATE");

    private static final SubLSymbol NEW_ALEXANDRIA_ALL_FORMULAS_ITERATOR = makeSymbol("NEW-ALEXANDRIA-ALL-FORMULAS-ITERATOR");

    private static final SubLSymbol CREATE_ALEXANDRIA_ALL_HL_SUPPORTS_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-ALL-HL-SUPPORTS-ITERATOR-STATE");

    private static final SubLSymbol NEW_ALEXANDRIA_ALL_HL_SUPPORTS_ITERATOR = makeSymbol("NEW-ALEXANDRIA-ALL-HL-SUPPORTS-ITERATOR");

    private static final SubLSymbol CREATE_ALEXANDRIA_ALL_KB_HL_SUPPORTS_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-ALL-KB-HL-SUPPORTS-ITERATOR-STATE");

    private static final SubLSymbol NEW_ALEXANDRIA_ALL_KB_HL_SUPPORTS_ITERATOR = makeSymbol("NEW-ALEXANDRIA-ALL-KB-HL-SUPPORTS-ITERATOR");

    private static final SubLSymbol CREATE_ALEXANDRIA_ALL_ITEMS_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-ALL-ITEMS-ITERATOR-STATE");

    private static final SubLSymbol NEW_ALEXANDRIA_ALL_ITEMS_ITERATOR = makeSymbol("NEW-ALEXANDRIA-ALL-ITEMS-ITERATOR");

    private static final SubLSymbol CREATE_ALEXANDRIA_ALL_STRINGS_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-ALL-STRINGS-ITERATOR-STATE");

    private static final SubLSymbol NEW_ALEXANDRIA_ALL_STRINGS_ITERATOR = makeSymbol("NEW-ALEXANDRIA-ALL-STRINGS-ITERATOR");

    private static final SubLSymbol CREATE_ALEXANDRIA_ALL_NUMBERS_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-ALL-NUMBERS-ITERATOR-STATE");

    private static final SubLSymbol NEW_ALEXANDRIA_ALL_NUMBERS_ITERATOR = makeSymbol("NEW-ALEXANDRIA-ALL-NUMBERS-ITERATOR");

    private static final SubLSymbol CREATE_ALEXANDRIA_ALL_SUBL_EXPRESSIONS_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-ALL-SUBL-EXPRESSIONS-ITERATOR-STATE");

    private static final SubLSymbol NEW_ALEXANDRIA_ALL_SUBL_EXPRESSIONS_ITERATOR = makeSymbol("NEW-ALEXANDRIA-ALL-SUBL-EXPRESSIONS-ITERATOR");

    private static final SubLSymbol CREATE_ALEXANDRIA_ALL_VARIABLES_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-ALL-VARIABLES-ITERATOR-STATE");

    private static final SubLSymbol NEW_ALEXANDRIA_ALL_VARIABLES_ITERATOR = makeSymbol("NEW-ALEXANDRIA-ALL-VARIABLES-ITERATOR");

    private static final SubLSymbol CREATE_ALEXANDRIA_ALL_UNREPRESENTED_TERMS_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-ALL-UNREPRESENTED-TERMS-ITERATOR-STATE");

    private static final SubLSymbol NEW_ALEXANDRIA_ALL_UNREPRESENTED_TERMS_ITERATOR = makeSymbol("NEW-ALEXANDRIA-ALL-UNREPRESENTED-TERMS-ITERATOR");

    private static final SubLSymbol CREATE_ALEXANDRIA_TERM_ASSERTIONS_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-TERM-ASSERTIONS-ITERATOR-STATE");

    private static final SubLSymbol NEW_ALEXANDRIA_TERM_ASSERTIONS_ITERATOR = makeSymbol("NEW-ALEXANDRIA-TERM-ASSERTIONS-ITERATOR");

    private static final SubLSymbol COUNT_ALEXANDRIA_TERM_ASSERTIONS = makeSymbol("COUNT-ALEXANDRIA-TERM-ASSERTIONS");

    private static final SubLSymbol CREATE_ALEXANDRIA_TERM_ASSERTIONS_RELEVANT_MT_PRED_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-TERM-ASSERTIONS-RELEVANT-MT-PRED-ITERATOR-STATE");

    private static final SubLSymbol NEW_ALEXANDRIA_TERM_ASSERTIONS_RELEVANT_MT_PRED_ITERATOR = makeSymbol("NEW-ALEXANDRIA-TERM-ASSERTIONS-RELEVANT-MT-PRED-ITERATOR");

    private static final SubLSymbol COUNT_ALEXANDRIA_TERM_ASSERTIONS_RELEVANT_MT_PRED = makeSymbol("COUNT-ALEXANDRIA-TERM-ASSERTIONS-RELEVANT-MT-PRED");

    private static final SubLSymbol CREATE_ALEXANDRIA_GAF_ARG0_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-GAF-ARG0-ITERATOR-STATE");

    private static final SubLSymbol NEW_ALEXANDRIA_GAF_ARG0_ITERATOR = makeSymbol("NEW-ALEXANDRIA-GAF-ARG0-ITERATOR");

    private static final SubLSymbol COUNT_ALEXANDRIA_GAF_ARG0 = makeSymbol("COUNT-ALEXANDRIA-GAF-ARG0");

    private static final SubLSymbol CREATE_ALEXANDRIA_GAF_ARG0_RELEVANT_MT_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-GAF-ARG0-RELEVANT-MT-ITERATOR-STATE");

    private static final SubLSymbol NEW_ALEXANDRIA_GAF_ARG0_ITERATOR_RELEVANT_MT = makeSymbol("NEW-ALEXANDRIA-GAF-ARG0-ITERATOR-RELEVANT-MT");

    private static final SubLSymbol COUNT_ALEXANDRIA_GAF_ARG0_RELEVANT_MT = makeSymbol("COUNT-ALEXANDRIA-GAF-ARG0-RELEVANT-MT");

    private static final SubLSymbol CREATE_ALEXANDRIA_GAF_ARGITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-GAF-ARGITERATOR-STATE");

    private static final SubLSymbol NEW_ALEXANDRIA_GAF_ARG_ITERATOR = makeSymbol("NEW-ALEXANDRIA-GAF-ARG-ITERATOR");

    private static final SubLSymbol CREATE_ALEXANDRIA_GAF_ARG_RELEVANT_MT_AND_PRED_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-GAF-ARG-RELEVANT-MT-AND-PRED-ITERATOR-STATE");

    private static final SubLSymbol NEW_ALEXANDRIA_GAF_ARG_RELEVANT_MT_AND_PRED_ITERATOR = makeSymbol("NEW-ALEXANDRIA-GAF-ARG-RELEVANT-MT-AND-PRED-ITERATOR");

    private static final SubLSymbol COUNT_ALEXANDRIA_GAF_ARG_RELEVANT_MT_AND_PRED = makeSymbol("COUNT-ALEXANDRIA-GAF-ARG-RELEVANT-MT-AND-PRED");

    private static final SubLSymbol COUNT_ALEXANDRIA_GAF_ARG = makeSymbol("COUNT-ALEXANDRIA-GAF-ARG");

    private static final SubLSymbol NEW_ALEXANDRIA_GAF_ARG_ARG_RELEVANT_MT_AND_PRED_ITERATOR = makeSymbol("NEW-ALEXANDRIA-GAF-ARG-ARG-RELEVANT-MT-AND-PRED-ITERATOR");

    private static final SubLSymbol CREATE_ALEXANDRIA_GAF_ARG_ARG_RELEVANT_MT_AND_PRED_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-GAF-ARG-ARG-RELEVANT-MT-AND-PRED-ITERATOR-STATE");

    private static final SubLSymbol COUNT_ALEXANDRIA_GAF_ARG_ARG_RELEVANT_MT_AND_PRED = makeSymbol("COUNT-ALEXANDRIA-GAF-ARG-ARG-RELEVANT-MT-AND-PRED");

    private static final SubLSymbol CREATE_ALEXANDRIA_MT_CONTENTS_ITERATOR_STATE_RELEVANT_PRED = makeSymbol("CREATE-ALEXANDRIA-MT-CONTENTS-ITERATOR-STATE-RELEVANT-PRED");

    private static final SubLSymbol NEW_ALEXANDRIA_MT_CONTENTS_ITERATOR_RELEVANT_PRED = makeSymbol("NEW-ALEXANDRIA-MT-CONTENTS-ITERATOR-RELEVANT-PRED");

    private static final SubLSymbol COUNT_ALEXANDRIA_MT_CONTENTS_RELEVANT_PRED = makeSymbol("COUNT-ALEXANDRIA-MT-CONTENTS-RELEVANT-PRED");

    private static final SubLSymbol CREATE_ALEXANDRIA_MT_CONTENTS_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-MT-CONTENTS-ITERATOR-STATE");

    private static final SubLSymbol NEW_ALEXANDRIA_MT_CONTENTS_ITERATOR = makeSymbol("NEW-ALEXANDRIA-MT-CONTENTS-ITERATOR");

    private static final SubLSymbol COUNT_ALEXANDRIA_MT_CONTENTS = makeSymbol("COUNT-ALEXANDRIA-MT-CONTENTS");

    private static final SubLSymbol CREATE_ALEXANDRIA_RULES_WITH_PRED_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-RULES-WITH-PRED-ITERATOR-STATE");

    private static final SubLSymbol NEW_ALEXANDRIA_RULES_WITH_PRED_ITERATOR = makeSymbol("NEW-ALEXANDRIA-RULES-WITH-PRED-ITERATOR");

    private static final SubLSymbol COUNT_ALEXANDRIA_RULES_WITH_PRED = makeSymbol("COUNT-ALEXANDRIA-RULES-WITH-PRED");

    private static final SubLSymbol CREATE_ALEXANDRIA_RULES_WITH_PRED_RELEVANT_MT_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-RULES-WITH-PRED-RELEVANT-MT-ITERATOR-STATE");

    private static final SubLSymbol NEW_ALEXANDRIA_RULES_WITH_PRED_RELEVANT_MT_ITERATOR = makeSymbol("NEW-ALEXANDRIA-RULES-WITH-PRED-RELEVANT-MT-ITERATOR");

    private static final SubLSymbol COUNT_ALEXANDRIA_RULES_WITH_PRED_RELEVANT_MT = makeSymbol("COUNT-ALEXANDRIA-RULES-WITH-PRED-RELEVANT-MT");

    private static final SubLSymbol CREATE_ALEXANDRIA_RULES_WITH_PRED_AND_ARG2_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-RULES-WITH-PRED-AND-ARG2-ITERATOR-STATE");

    private static final SubLSymbol NEW_ALEXANDRIA_RULES_WITH_PRED_AND_ARG2_ITERATOR = makeSymbol("NEW-ALEXANDRIA-RULES-WITH-PRED-AND-ARG2-ITERATOR");

    private static final SubLSymbol COUNT_ALEXANDRIA_RULES_WITH_PRED_AND_ARG2 = makeSymbol("COUNT-ALEXANDRIA-RULES-WITH-PRED-AND-ARG2");

    private static final SubLSymbol $sym252$CREATE_ALEXANDRIA_RULES_WITH_PRED_AND_ARG2_RELEVANT_MT_ITERATOR_S = makeSymbol("CREATE-ALEXANDRIA-RULES-WITH-PRED-AND-ARG2-RELEVANT-MT-ITERATOR-STATE");

    private static final SubLSymbol NEW_ALEXANDRIA_RULES_WITH_PRED_AND_ARG2_RELEVANT_MT_ITERATOR = makeSymbol("NEW-ALEXANDRIA-RULES-WITH-PRED-AND-ARG2-RELEVANT-MT-ITERATOR");

    private static final SubLSymbol COUNT_ALEXANDRIA_RULES_WITH_PRED_AND_ARG2_RELEVANT_MT = makeSymbol("COUNT-ALEXANDRIA-RULES-WITH-PRED-AND-ARG2-RELEVANT-MT");

    private static final SubLSymbol CREATE_ALEXANDRIA_NESTED_FORMULA_RULES_RELEVANT_MT_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-NESTED-FORMULA-RULES-RELEVANT-MT-ITERATOR-STATE");

    private static final SubLSymbol NEW_ALEXANDRIA_NESTED_FORMULA_RULES_RELEVANT_MT_ITERATOR = makeSymbol("NEW-ALEXANDRIA-NESTED-FORMULA-RULES-RELEVANT-MT-ITERATOR");

    private static final SubLSymbol COUNT_ALEXANDRIA_NESTED_FORMULA_RULES_RELEVANT_MT = makeSymbol("COUNT-ALEXANDRIA-NESTED-FORMULA-RULES-RELEVANT-MT");

    private static final SubLSymbol CREATE_ALEXANDRIA_FUNCTION_EXTENT_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-FUNCTION-EXTENT-ITERATOR-STATE");

    private static final SubLSymbol NEW_ALEXANDRIA_FUNCTION_EXTENT_ITERATOR = makeSymbol("NEW-ALEXANDRIA-FUNCTION-EXTENT-ITERATOR");

    private static final SubLSymbol COUNT_ALEXANDRIA_NART_ARG_INDEX = makeSymbol("COUNT-ALEXANDRIA-NART-ARG-INDEX");

    private static final SubLSymbol CREATE_ALEXANDRIA_NART_ARG_INDEX_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-NART-ARG-INDEX-ITERATOR-STATE");

    private static final SubLSymbol NEW_ALEXANDRIA_NART_ARG_INDEX_ITERATOR = makeSymbol("NEW-ALEXANDRIA-NART-ARG-INDEX-ITERATOR");

    private static final SubLSymbol BEST_STRING_OF_NL_PHRASE_DEFN = makeSymbol("BEST-STRING-OF-NL-PHRASE-DEFN");

    private static final SubLSymbol CYC_1_BYTE_INTEGER = makeSymbol("CYC-1-BYTE-INTEGER");

    private static final SubLSymbol CYC_2_BYTE_INTEGER = makeSymbol("CYC-2-BYTE-INTEGER");

    private static final SubLSymbol CYC_4_BYTE_INTEGER = makeSymbol("CYC-4-BYTE-INTEGER");

    private static final SubLSymbol CYC_8_BYTE_INTEGER = makeSymbol("CYC-8-BYTE-INTEGER");

    private static final SubLSymbol CYC_ABSOLUTE_VALUE = makeSymbol("CYC-ABSOLUTE-VALUE");

    private static final SubLSymbol CYC_ADD_ENGLISH_SUFFIX = makeSymbol("CYC-ADD-ENGLISH-SUFFIX");

    private static final SubLSymbol CYC_ARC_COSECANT = makeSymbol("CYC-ARC-COSECANT");

    private static final SubLSymbol CYC_ARC_COSINE = makeSymbol("CYC-ARC-COSINE");

    private static final SubLSymbol CYC_ARC_COTANGENT = makeSymbol("CYC-ARC-COTANGENT");

    private static final SubLSymbol CYC_ARC_SECANT = makeSymbol("CYC-ARC-SECANT");

    private static final SubLSymbol CYC_ARC_SINE = makeSymbol("CYC-ARC-SINE");

    private static final SubLSymbol CYC_ARC_TANGENT = makeSymbol("CYC-ARC-TANGENT");

    private static final SubLSymbol CYC_ASCII_STRING_P = makeSymbol("CYC-ASCII-STRING-P");

    private static final SubLSymbol CYC_AVERAGE = makeSymbol("CYC-AVERAGE");

    private static final SubLSymbol CYC_BIT_DATATYPE = makeSymbol("CYC-BIT-DATATYPE");

    private static final SubLSymbol CYC_COLLECTION_DENOTING_UNARY_FUNCTION_FOR = makeSymbol("CYC-COLLECTION-DENOTING-UNARY-FUNCTION-FOR");

    private static final SubLSymbol CYC_COSECANT = makeSymbol("CYC-COSECANT");

    private static final SubLSymbol CYC_COSINE = makeSymbol("CYC-COSINE");

    private static final SubLSymbol CYC_COTANGENT = makeSymbol("CYC-COTANGENT");

    private static final SubLSymbol CYC_DATE_AFTER = makeSymbol("CYC-DATE-AFTER");

    private static final SubLSymbol CYC_DATE_BEFORE = makeSymbol("CYC-DATE-BEFORE");

    private static final SubLSymbol CYC_DATE_DECODE_STRING = makeSymbol("CYC-DATE-DECODE-STRING");

    private static final SubLSymbol CYC_DATE_ENCODE_STRING = makeSymbol("CYC-DATE-ENCODE-STRING");

    private static final SubLSymbol CYC_DATE_FROM_INTEGER = makeSymbol("CYC-DATE-FROM-INTEGER");

    private static final SubLSymbol CYC_DATE_FROM_STRING = makeSymbol("CYC-DATE-FROM-STRING");

    private static final SubLSymbol CYC_DATE_SUBSUMES = makeSymbol("CYC-DATE-SUBSUMES");

    private static final SubLSymbol CYC_DAY_OF_DATE = makeSymbol("CYC-DAY-OF-DATE");

    private static final SubLSymbol CYC_DAY_OF_WEEK_AFTER_DATE = makeSymbol("CYC-DAY-OF-WEEK-AFTER-DATE");

    private static final SubLSymbol CYC_DAY_OF_WEEK_AFTER_DATE_INCLUSIVE = makeSymbol("CYC-DAY-OF-WEEK-AFTER-DATE-INCLUSIVE");

    private static final SubLSymbol CYC_DAY_OF_WEEK_DEFN = makeSymbol("CYC-DAY-OF-WEEK-DEFN");

    private static final SubLSymbol CYC_DAY_OF_WEEK_OF_DATE = makeSymbol("CYC-DAY-OF-WEEK-OF-DATE");

    private static final SubLSymbol CYC_DAY_OF_WEEK_PRIOR_TO_DATE = makeSymbol("CYC-DAY-OF-WEEK-PRIOR-TO-DATE");

    private static final SubLSymbol CYC_DAY_OF_WEEK_PRIOR_TO_DATE_INCLUSIVE = makeSymbol("CYC-DAY-OF-WEEK-PRIOR-TO-DATE-INCLUSIVE");

    private static final SubLSymbol CYC_DIFFERENCE = makeSymbol("CYC-DIFFERENCE");

    private static final SubLSymbol CYC_DIFFERENT = makeSymbol("CYC-DIFFERENT");

    private static final SubLSymbol CYC_DIFFERENT_SYMBOLS = makeSymbol("CYC-DIFFERENT-SYMBOLS");

    private static final SubLSymbol CYC_EVALUATE_SUBL = makeSymbol("CYC-EVALUATE-SUBL");

    private static final SubLSymbol CYC_EVEN_NUMBER = makeSymbol("CYC-EVEN-NUMBER");

    private static final SubLSymbol CYC_EXP = makeSymbol("CYC-EXP");

    private static final SubLSymbol CYC_EXPONENT = makeSymbol("CYC-EXPONENT");

    private static final SubLSymbol CYC_EXTENDED_NUMBER_P = makeSymbol("CYC-EXTENDED-NUMBER-P");

    private static final SubLSymbol CYC_GREATER_THAN = makeSymbol("CYC-GREATER-THAN");

    private static final SubLSymbol CYC_GREATER_THAN_OR_EQUAL_TO = makeSymbol("CYC-GREATER-THAN-OR-EQUAL-TO");

    public static final SubLObject $list_alt62 = com.cyc.cycjava.cycl.eval_in_api_registrations._constant_62_initializer();

    private static final SubLSymbol CYC_GROUND_TERM = makeSymbol("CYC-GROUND-TERM");

    static private final SubLList $list_alt63 = list(new SubLObject[]{ makeSymbol("ADD1"), makeSymbol("ADD2"), makeSymbol("API-DYNAMIC-VARIABLE-P"), makeSymbol("API-LEXICAL-VARIABLE-P"), makeSymbol("API-TEST-FN"), makeSymbol("B-VERIFY"), makeSymbol("BOOLEANP"), makeSymbol("CFASL-LOAD"), makeSymbol("COPY-HASH-TABLE"), makeSymbol("CYC-IMAGE-ID"), makeSymbol("CYCL-PATCH-NUMBER"), makeSymbol("CYCL-SYSTEM-NUMBER"), makeSymbol("DEF-INFERENCE-TEST"), makeSymbol("DEFINE-INFERENCE-TEST"), makeSymbol("DIV2"), makeSymbol("EVAL-IN-API-PREDEFINED-FN?"), makeSymbol("EVAL-IN-API-USER-FN?"), makeSymbol("FLOAT-PARSE-INTEGER"), makeSymbol("FLONUM-DIGIT-LIST"), makeSymbol("FROB-CASE"), makeSymbol("GENERATE-STALE-DOCUMENTATION-REPORT"), makeSymbol("GET-TIME"), makeSymbol("GET-TIMEZONE"), makeSymbol("HALT-CYC-IMAGE"), makeSymbol("HERALD-START"), makeSymbol("KB-LOADED"), makeSymbol("LOAD-WORLD"), makeSymbol("LOCK-LOCKER"), makeSymbol("LOCK-NAME"), makeSymbol("MACROP"), makeSymbol("MAX2"), makeSymbol("MEMBER?"), makeSymbol("MIN2"), makeSymbol("MINUS"), makeSymbol("MULT2"), makeSymbol("NAME-CHARACTER"), makeSymbol("NCONC2"), makeSymbol("NON-NEGATIVE-INTEGER-P"), makeSymbol("NON-TERMINATING-MACRO-SYNTAXP"), makeSymbol("NOT-A-LIST-ARGUMENT"), makeSymbol("POSSIBLY-GC"), makeSymbol("POTENTIAL-NUMBER-P"), makeSymbol("PRINT-ASSERT"), makeSymbol("PRINT-CREATE"), makeSymbol("PRINT-KILL"), makeSymbol("PROCESS-VALID-P"), makeSymbol("PROCESS-YIELD"), makeSymbol("QUIT"), makeSymbol("RANDOM-ASSERTION"), makeSymbol("RANDOM-CONSTANT"), makeSymbol("RANDOM-NART"), makeSymbol("RELEASE-LOCK"), makeSymbol("ROUND-DIGITS"), makeSymbol("RUN-TEST"), makeSymbol("SEIZE-LOCK"), makeSymbol("SFORMP"), makeSymbol("SINGLE-BYTE-P"), makeSymbol("STRING-DESIGNATORP"), makeSymbol("SUB1"), makeSymbol("SUB2"), makeSymbol("UPDATE-TEST-RESULTS"), makeSymbol("WHITESPACE-1-CHAR-P"), makeSymbol("WHITESPACE-2-CHAR-P") });

    private static final SubLSymbol CYC_GUID_STRING_P = makeSymbol("CYC-GUID-STRING-P");

    private static final SubLSymbol CYC_HTTP_URL_ENCODE = makeSymbol("CYC-HTTP-URL-ENCODE");

    private static final SubLSymbol CYC_IDENTITY = makeSymbol("CYC-IDENTITY");

    private static final SubLSymbol CYC_INDEXICAL_REFERENT = makeSymbol("CYC-INDEXICAL-REFERENT");

    private static final SubLSymbol CYC_INDIVIDUAL_DENOTING_UNARY_FUNCTION_FOR = makeSymbol("CYC-INDIVIDUAL-DENOTING-UNARY-FUNCTION-FOR");

    private static final SubLSymbol CYC_INDIVIDUAL_NECESSARY = makeSymbol("CYC-INDIVIDUAL-NECESSARY");

    private static final SubLSymbol CYC_INTEGER = makeSymbol("CYC-INTEGER");

    private static final SubLSymbol CYC_INTEGER_RANGE = makeSymbol("CYC-INTEGER-RANGE");

    private static final SubLSymbol CYC_INTEGER_TO_STRING = makeSymbol("CYC-INTEGER-TO-STRING");

    private static final SubLSymbol CYC_INTERVAL_ENDED_BY_LAST_SUBINTERVAL_OF_TYPE = makeSymbol("CYC-INTERVAL-ENDED-BY-LAST-SUBINTERVAL-OF-TYPE");

    private static final SubLSymbol CYC_INTERVAL_STARTED_BY_FIRST_SUBINTERVAL_OF_TYPE = makeSymbol("CYC-INTERVAL-STARTED-BY-FIRST-SUBINTERVAL-OF-TYPE");

    private static final SubLSymbol CYC_INVERSE = makeSymbol("CYC-INVERSE");

    private static final SubLSymbol CYC_IP4_ADDRESS = makeSymbol("CYC-IP4-ADDRESS");

    private static final SubLSymbol CYC_IP4_NETWORK_ADDRESS = makeSymbol("CYC-IP4-NETWORK-ADDRESS");

    private static final SubLSymbol CYC_LATER_THAN = makeSymbol("CYC-LATER-THAN");

    private static final SubLSymbol CYC_LESS_THAN = makeSymbol("CYC-LESS-THAN");

    private static final SubLSymbol CYC_LESS_THAN_OR_EQUAL_TO = makeSymbol("CYC-LESS-THAN-OR-EQUAL-TO");

    private static final SubLSymbol CYC_LIST_CONCATENATE = makeSymbol("CYC-LIST-CONCATENATE");

    private static final SubLSymbol CYC_LIST_FIRST = makeSymbol("CYC-LIST-FIRST");

    static private final SubLList $list_alt64 = list(new SubLObject[]{ makeSymbol("NEW-DICTIONARY"), makeSymbol("DICTIONARY-LENGTH"), makeSymbol("CLEAR-DICTIONARY"), makeSymbol("DICTIONARY-ENTER"), makeSymbol("DICTIONARY-PUSH"), makeSymbol("DICTIONARY-PUSHNEW"), makeSymbol("DICTIONARY-REMOVE-FROM-VALUE"), makeSymbol("DICTIONARY-REMOVE"), makeSymbol("DICTIONARY-LOOKUP"), makeSymbol("DICTIONARY-KEYS"), makeSymbol("DICTIONARY-VALUES") });

    private static final SubLSymbol CYC_LIST_LAST = makeSymbol("CYC-LIST-LAST");

    private static final SubLSymbol CYC_LIST_LENGTH = makeSymbol("CYC-LIST-LENGTH");

    private static final SubLSymbol CYC_LIST_MEMBER_SET = makeSymbol("CYC-LIST-MEMBER-SET");

    private static final SubLSymbol CYC_LIST_NTH = makeSymbol("CYC-LIST-NTH");

    private static final SubLSymbol CYC_LIST_OF_TYPE_NECESSARY = makeSymbol("CYC-LIST-OF-TYPE-NECESSARY");

    private static final SubLSymbol CYC_LIST_OF_TYPE_SUFFICIENT = makeSymbol("CYC-LIST-OF-TYPE-SUFFICIENT");

    private static final SubLSymbol CYC_LIST_REST = makeSymbol("CYC-LIST-REST");

    private static final SubLSymbol CYC_LIST_REVERSE = makeSymbol("CYC-LIST-REVERSE");

    private static final SubLSymbol CYC_LIST_SEARCH = makeSymbol("CYC-LIST-SEARCH");

    static private final SubLSymbol $sym75$WHY_COLLECTIONS_INTERSECT_ = makeSymbol("WHY-COLLECTIONS-INTERSECT?");

    private static final SubLSymbol CYC_LIST_SUBSEQ = makeSymbol("CYC-LIST-SUBSEQ");

    private static final SubLSymbol CYC_LIST_WITHOUT_REPETITION = makeSymbol("CYC-LIST-WITHOUT-REPETITION");

    private static final SubLSymbol CYC_LOG = makeSymbol("CYC-LOG");

    private static final SubLSymbol CYC_LOGARITHM = makeSymbol("CYC-LOGARITHM");

    private static final SubLSymbol CYC_MAKE_FORMULA = makeSymbol("CYC-MAKE-FORMULA");

    private static final SubLSymbol CYC_MAP_FUNCTION_OVER_LIST = makeSymbol("CYC-MAP-FUNCTION-OVER-LIST");

    private static final SubLSymbol CYC_MAX_RANGE = makeSymbol("CYC-MAX-RANGE");

    private static final SubLSymbol CYC_MAXIMUM = makeSymbol("CYC-MAXIMUM");

    static private final SubLSymbol $sym84$DISJOINT_WITH_ = makeSymbol("DISJOINT-WITH?");

    private static final SubLSymbol CYC_MIN_RANGE = makeSymbol("CYC-MIN-RANGE");

    private static final SubLSymbol CYC_MINIMUM = makeSymbol("CYC-MINIMUM");

    private static final SubLSymbol CYC_MINUS = makeSymbol("CYC-MINUS");

    private static final SubLSymbol CYC_NEGATIVE_INTEGER = makeSymbol("CYC-NEGATIVE-INTEGER");

    private static final SubLSymbol CYC_NEGATIVE_NUMBER = makeSymbol("CYC-NEGATIVE-NUMBER");

    private static final SubLSymbol CYC_NEXT_ITERATED_CYCLIC_INTERVAL = makeSymbol("CYC-NEXT-ITERATED-CYCLIC-INTERVAL");

    private static final SubLSymbol CYC_NON_NEGATIVE_INTEGER = makeSymbol("CYC-NON-NEGATIVE-INTEGER");

    private static final SubLSymbol CYC_NON_NEGATIVE_NUMBER = makeSymbol("CYC-NON-NEGATIVE-NUMBER");

    private static final SubLSymbol CYC_NON_POSITIVE_INTEGER = makeSymbol("CYC-NON-POSITIVE-INTEGER");

    static private final SubLSymbol $sym94$ISA_IN_ANY_MT_ = makeSymbol("ISA-IN-ANY-MT?");

    private static final SubLSymbol CYC_NON_POSITIVE_NUMBER = makeSymbol("CYC-NON-POSITIVE-NUMBER");

    static private final SubLSymbol $sym95$GENL_IN_ANY_MT_ = makeSymbol("GENL-IN-ANY-MT?");

    private static final SubLSymbol CYC_NTH_METRICALLY_PRECEDING_TIME_INTERVAL_OF_TYPE = makeSymbol("CYC-NTH-METRICALLY-PRECEDING-TIME-INTERVAL-OF-TYPE");

    private static final SubLSymbol CYC_NTH_METRICALLY_SUCCEEDING_TIME_INTERVAL_OF_TYPE = makeSymbol("CYC-NTH-METRICALLY-SUCCEEDING-TIME-INTERVAL-OF-TYPE");

    private static final SubLSymbol CYC_NUMBER_STRING = makeSymbol("CYC-NUMBER-STRING");

    private static final SubLSymbol CYC_NUMERAL_STRING = makeSymbol("CYC-NUMERAL-STRING");

    static private final SubLSymbol $sym101$TACIT_COEXTENSIONAL_ = makeSymbol("TACIT-COEXTENSIONAL?");

    private static final SubLSymbol CYC_NUMERIC_STRING_NECESSARY = makeSymbol("CYC-NUMERIC-STRING-NECESSARY");

    static private final SubLSymbol $sym102$EL_WFF_ = makeSymbol("EL-WFF?");

    private static final SubLSymbol CYC_NUMERICALLY_EQUAL = makeSymbol("CYC-NUMERICALLY-EQUAL");

    static private final SubLSymbol $sym103$EVALUATABLE_PREDICATE_ = makeSymbol("EVALUATABLE-PREDICATE?");

    private static final SubLSymbol CYC_ODD_NUMBER = makeSymbol("CYC-ODD-NUMBER");

    static private final SubLSymbol $sym104$HIERARCHICAL_COLLECTIONS_ = makeSymbol("HIERARCHICAL-COLLECTIONS?");

    private static final SubLSymbol CYC_PERCENT = makeSymbol("CYC-PERCENT");

    private static final SubLSymbol CYC_PLUS = makeSymbol("CYC-PLUS");

    private static final SubLSymbol CYC_PLUS_ALL = makeSymbol("CYC-PLUS-ALL");

    private static final SubLSymbol CYC_POSITION = makeSymbol("CYC-POSITION");

    private static final SubLSymbol CYC_POSITIVE_INTEGER = makeSymbol("CYC-POSITIVE-INTEGER");

    static private final SubLSymbol $sym111$RTP_PARSE_EXP_W_VPP = makeSymbol("RTP-PARSE-EXP-W/VPP");

    private static final SubLSymbol CYC_POSITIVE_NUMBER = makeSymbol("CYC-POSITIVE-NUMBER");

    private static final SubLSymbol CYC_POST_REMOVE = makeSymbol("CYC-POST-REMOVE");

    private static final SubLSymbol CYC_PRE_REMOVE = makeSymbol("CYC-PRE-REMOVE");

    private static final SubLSymbol CYC_PREFIX_SUBSTRING = makeSymbol("CYC-PREFIX-SUBSTRING");

    private static final SubLSymbol $sym370$CYC_PRIME_NUMBER_ = makeSymbol("CYC-PRIME-NUMBER?");

    private static final SubLSymbol CYC_QUANTITY_CONVERSION = makeSymbol("CYC-QUANTITY-CONVERSION");

    private static final SubLSymbol CYC_QUANTITY_INTERSECTS = makeSymbol("CYC-QUANTITY-INTERSECTS");

    static private final SubLSymbol $sym120$GENL_MT_ = makeSymbol("GENL-MT?");

    private static final SubLSymbol CYC_QUANTITY_SUBSUMES = makeSymbol("CYC-QUANTITY-SUBSUMES");

    private static final SubLSymbol CYC_QUOTIENT = makeSymbol("CYC-QUOTIENT");

    private static final SubLSymbol CYC_RATIONAL_NUMBER = makeSymbol("CYC-RATIONAL-NUMBER");

    private static final SubLSymbol CYC_REAL_0_1 = makeSymbol("CYC-REAL-0-1");

    private static final SubLSymbol CYC_REAL_1_INFINITY = makeSymbol("CYC-REAL-1-INFINITY");

    private static final SubLSymbol ID_INDEX_OLD_OBJECTS = makeSymbol("ID-INDEX-OLD-OBJECTS");

    private static final SubLSymbol CYC_REAL_NUMBER = makeSymbol("CYC-REAL-NUMBER");

    private static final SubLSymbol CYC_RECAPITALIZE_SMART = makeSymbol("CYC-RECAPITALIZE-SMART");

    private static final SubLSymbol ID_INDEX_NEW_ID_THRESHOLD = makeSymbol("ID-INDEX-NEW-ID-THRESHOLD");

    private static final SubLSymbol CYC_RELATION_ARG = makeSymbol("CYC-RELATION-ARG");

    private static final SubLSymbol CYC_RELATION_ARG_SET = makeSymbol("CYC-RELATION-ARG-SET");

    private static final SubLSymbol CYC_RELATION_ARGS_LIST = makeSymbol("CYC-RELATION-ARGS-LIST");

    private static final SubLSymbol CYC_RELATION_EXPRESSION_ARITY = makeSymbol("CYC-RELATION-EXPRESSION-ARITY");

    private static final SubLSymbol CYC_REPLACE_SUBSTRING = makeSymbol("CYC-REPLACE-SUBSTRING");

    private static final SubLSymbol CYC_ROUND_CLOSEST = makeSymbol("CYC-ROUND-CLOSEST");

    private static final SubLSymbol CYC_ROUND_DOWN = makeSymbol("CYC-ROUND-DOWN");

    private static final SubLSymbol CYC_ROUND_UP = makeSymbol("CYC-ROUND-UP");

    private static final SubLSymbol CYC_SCIENTIFIC_NUMBER_FROM_STRING = makeSymbol("CYC-SCIENTIFIC-NUMBER-FROM-STRING");

    private static final SubLSymbol CYC_SCIENTIFIC_NUMBER_FROM_SUBL_REAL = makeSymbol("CYC-SCIENTIFIC-NUMBER-FROM-SUBL-REAL");

    private static final SubLSymbol CYC_SCIENTIFIC_NUMBER_P = makeSymbol("CYC-SCIENTIFIC-NUMBER-P");

    static private final SubLList $list_alt139 = list(new SubLObject[]{ makeSymbol("UIA-TERM-PHRASE-MEMOIZED"), makeSymbol("BLUE-FETCH-UIA-BLUE-EVENT"), makeSymbol("BBF-RTV-ALL-EDGES-FROM-NODE"), makeSymbol("BBF-MIN-FORWARD-AND-BACKWARD-TRUE"), makeSymbol("BBF-RTV-ALL-EDGES-BETWEEN"), makeSymbol("BBF-ALL-EDGES-SUBSUMED-BY-PREDS"), makeSymbol("BBF-FORWARD-TRUE"), makeSymbol("BBF-BACKWARD-TRUE"), makeSymbol("BBF-MIN-FORWARD-TRUE"), makeSymbol("BBF-MIN-BACKWARD-TRUE"), makeSymbol("BBF-MIN-CEILINGS-FORWARD-TRUE"), makeSymbol("BBF-SCRIPT"), makeSymbol("BFF-EELD-IRRELEVANT-TERMS"), makeSymbol("BFF-CYC-KB-SUBSET-COLLECTIONS"), makeSymbol("BFF-ARBITRARY-UNIONS"), makeSymbol("BFF-MOST-GENERAL-5"), makeSymbol("BFF-MOST-GENERAL-10"), makeSymbol("BFF-MOST-GENERAL-20") });

    private static final SubLSymbol CYC_SCIENTIFIC_NUMBER_SIGNIFICANT_DIGIT_COUNT = makeSymbol("CYC-SCIENTIFIC-NUMBER-SIGNIFICANT-DIGIT-COUNT");

    private static final SubLSymbol CYC_SCIENTIFIC_NUMBER_TO_STRING = makeSymbol("CYC-SCIENTIFIC-NUMBER-TO-STRING");

    private static final SubLSymbol CYC_SCIENTIFIC_NUMBER_TO_SUBL_REAL = makeSymbol("CYC-SCIENTIFIC-NUMBER-TO-SUBL-REAL");

    private static final SubLSymbol CYC_SECANT = makeSymbol("CYC-SECANT");

    private static final SubLSymbol CYC_SET_DIFFERENCE = makeSymbol("CYC-SET-DIFFERENCE");

    private static final SubLSymbol CYC_SET_EXTENT = makeSymbol("CYC-SET-EXTENT");

    private static final SubLSymbol CYC_SET_OF_TYPE_NECESSARY = makeSymbol("CYC-SET-OF-TYPE-NECESSARY");

    static private final SubLList $list_alt140 = list(new SubLObject[]{ makeSymbol("GET-QUERY-LIBRARY-IN-XML-FROM-DEFAULT-MT"), makeSymbol("GET-ONE-LEVEL-QUERY-LIBRARY-IN-XML-FROM-DEFAULT-MT"), makeSymbol("GET-ORIGINAL-STRING-FOR-QUERY"), makeSymbol("PARSED-QUERY-TEMPLATE-P"), makeSymbol("CLEAR-INVERTED-INDEX"), makeSymbol("INDEX-QUERIES-FROM-NODE"), makeSymbol("ADD-TEMPLATE-WITH-FORMULA-AND-GLOSS"), makeSymbol("SUGGEST-LOADING-MT-FOR-CYCL-QUERY"), makeSymbol("CREATE-MINIMAL-FORMULA-TEMPLATE-WITH-QUERY"), makeSymbol("CREATE-NEW-FORMULA-TEMPLATE-WITH-QUERY"), makeSymbol("GET-VARIABLE-MAPPINGS-FOR-QUERIES-IN-XML"), makeSymbol("GET-VARIABLE-MAPPINGS-FOR-FORMULAS-IN-XML"), makeSymbol("JOIN-FORMULAS-ALONG-VARIABLE-MAPPINGS"), makeSymbol("JOIN-QUERIES-ALONG-VARIABLE-MAPPINGS"), makeSymbol("MAIL-TO-USER"), makeSymbol("MAIL-TO-USER-WITH-CONTENT-TYPE"), makeSymbol("APPLICABLE-TEMPLATE-TOPICS-FOR-TERM"), makeSymbol("FOCAL-TERM-TYPE-FOR-TOPIC-TYPE"), makeSymbol("WFF?") });

    private static final SubLSymbol CYC_SET_OF_TYPE_SUFFICIENT = makeSymbol("CYC-SET-OF-TYPE-SUFFICIENT");

    private static final SubLSymbol CYC_SIGNIFICANT_DIGITS = makeSymbol("CYC-SIGNIFICANT-DIGITS");

    private static final SubLSymbol CYC_SINE = makeSymbol("CYC-SINE");

    private static final SubLSymbol CYC_SKSI_SOURCE_ACCESSIBLE = makeSymbol("CYC-SKSI-SOURCE-ACCESSIBLE");

    private static final SubLSymbol CYC_SKSI_SOURCE_ACTIVATED = makeSymbol("CYC-SKSI-SOURCE-ACTIVATED");

    private static final SubLSymbol CYC_SKSI_SOURCE_QUERYABLE = makeSymbol("CYC-SKSI-SOURCE-QUERYABLE");

    private static final SubLSymbol CYC_SKSI_SOURCE_REGISTERED = makeSymbol("CYC-SKSI-SOURCE-REGISTERED");

    private static final SubLSymbol CYC_SQRT = makeSymbol("CYC-SQRT");

    private static final SubLSymbol CYC_STRING_CONCAT = makeSymbol("CYC-STRING-CONCAT");

    private static final SubLSymbol CYC_STRING_TO_INTEGER = makeSymbol("CYC-STRING-TO-INTEGER");

    static private final SubLList $list_alt141 = list(new SubLObject[]{ makeSymbol("PPH-INFERENCE-ANSWER-PROOFS"), makeSymbol("GKE-START-CONTINUABLE-QUERY"), makeSymbol("GKE-CONTINUE-QUERY"), makeSymbol("GKE-STOP-CONTINUABLE-QUERY"), makeSymbol("GKE-GET-INFERENCE-RESULTS"), makeSymbol("GKE-GET-ONE-INFERENCE-RESULT"), makeSymbol("GKE-GET-INFERENCE-STATUS"), makeSymbol("GKE-GET-INFERENCE-SUSPEND-STATUS"), makeSymbol("GKE-INFERENCE-COMPLETE?"), makeSymbol("GKE-RELEASE-INFERENCE-RESOURCES"), makeSymbol("INFERENCE-ANSWER-MINIMAL-ABDUCTION-COUNT") });

    private static final SubLSymbol CYC_STRING_TO_REAL_NUMBER = makeSymbol("CYC-STRING-TO-REAL-NUMBER");

    private static final SubLSymbol CYC_STRING_TOKENIZE_NEW = makeSymbol("CYC-STRING-TOKENIZE-NEW");

    private static final SubLSymbol CYC_STRING_UPCASE = makeSymbol("CYC-STRING-UPCASE");

    private static final SubLSymbol CYC_STRINGS_TO_PHRASE = makeSymbol("CYC-STRINGS-TO-PHRASE");

    private static final SubLSymbol CYC_SUBL_ESCAPE = makeSymbol("CYC-SUBL-ESCAPE");

    static private final SubLList $list_alt142 = list(makeSymbol("GENERATE-PHRASE-FOR-JAVA"), makeSymbol("GET-TERM-LIST-AS-RENDERINGS"), makeSymbol("GET-EXAMPLE-INSTANCES-AS-RENDERINGS"), makeSymbol("GET-EXAMPLE-INSTANCES-AS-RENDERINGS-NEW"), makeSymbol("GET-INSTANCES-AS-RENDERINGS"), makeSymbol("DENOTS-OF-STRING"));

    private static final SubLSymbol CYC_SUBL_EXPRESSION = makeSymbol("CYC-SUBL-EXPRESSION");

    private static final SubLSymbol CYC_SUBL_TEMPLATE = makeSymbol("CYC-SUBL-TEMPLATE");

    private static final SubLSymbol $sym415$CYC_SUBLIST_ = makeSymbol("CYC-SUBLIST?");

    private static final SubLSymbol CYC_SUBSTITUTE_FORMULA = makeSymbol("CYC-SUBSTITUTE-FORMULA");

    static private final SubLList $list_alt143 = list(makeSymbol("REFORMULATE-UNKNOWN-FET-TERM"), makeSymbol("CLEAR-GET-SOURCE-CONCEPTUAL-WORKS-FOR-PROJECT"), makeSymbol("GET-SOURCE-CONCEPTUAL-WORKS-FOR-PROJECT"), makeSymbol("GET-TEMPLATE-TOPIC-IN-XML"), makeSymbol("FIND-TEMPLATE-TOPIC-MATCHES-FOR-CONSTRAINT"), makeSymbol("GET-TEMPLATE-TOPIC-ASSERTIONS-FOR-MATCH-IN-XML"));

    private static final SubLSymbol CYC_SUBSTITUTE_FORMULA_ARG = makeSymbol("CYC-SUBSTITUTE-FORMULA-ARG");

    private static final SubLSymbol CYC_SUBSTITUTE_FORMULA_ARG_POSITION = makeSymbol("CYC-SUBSTITUTE-FORMULA-ARG-POSITION");

    private static final SubLSymbol CYC_SUBSTRING = makeSymbol("CYC-SUBSTRING");

    static private final SubLList $list_alt144 = list(makeSymbol("CONSTANT-VIA-STAR-COMPLETION"), makeSymbol("DELETE-IF"), makeSymbol("EL-NEGATE"), makeSymbol("RELATION-P"), makeSymbol("ALL-RELATION-CONSTRAINT-SENTENCES"));

    private static final SubLSymbol CYC_SUBSTRING_CASE_INSENSITIVE_PREDICATE = makeSymbol("CYC-SUBSTRING-CASE-INSENSITIVE-PREDICATE");

    private static final SubLSymbol CYC_SUBSTRING_PREDICATE = makeSymbol("CYC-SUBSTRING-PREDICATE");

    static private final SubLList $list_alt145 = list(new SubLObject[]{ makeSymbol("ADD-TEMPLATE-WITH-FORMULA-AND-GLOSS"), makeSymbol("ANSWER-GUI-QUESTION"), makeSymbol("CLEAR-INVERTED-INDEX"), makeSymbol("FIND-INFERENCE-BY-ID"), makeSymbol("FIND-PROBLEM-STORE-BY-ID"), makeSymbol("FLATTEN"), makeSymbol("GET-ORIGINAL-STRING-FOR-QUERY"), makeSymbol("INDEX-QUERIES-FROM-NODE"), makeSymbol("INDEXED-QUERIES-FROM-STRING"), makeSymbol("INFERENCE-INPUT-EL-QUERY"), makeSymbol("NART-SUBSTITUTE"), makeSymbol("PARSED-QUERY-TEMPLATE-P"), makeSymbol("POSITIVE-INFINITY"), makeSymbol("PREDICATE-P"), makeSymbol("REMOVE-IF-NOT"), makeSymbol("SKSI-SUPPORTED-EXTERNAL-TERM?") });

    private static final SubLSymbol CYC_SUBWORD_PREDICATE = makeSymbol("CYC-SUBWORD-PREDICATE");

    private static final SubLSymbol CYC_SUFFIX_SUBSTRING = makeSymbol("CYC-SUFFIX-SUBSTRING");

    private static final SubLSymbol CYC_SYSTEM_ATOM = makeSymbol("CYC-SYSTEM-ATOM");

    private static final SubLSymbol CYC_SYSTEM_CHARACTER_P = makeSymbol("CYC-SYSTEM-CHARACTER-P");

    private static final SubLSymbol CYC_SYSTEM_INTEGER = makeSymbol("CYC-SYSTEM-INTEGER");

    private static final SubLSymbol CYC_SYSTEM_NON_VARIABLE_SYMBOL_P = makeSymbol("CYC-SYSTEM-NON-VARIABLE-SYMBOL-P");

    private static final SubLSymbol CYC_SYSTEM_REAL_NUMBER_P = makeSymbol("CYC-SYSTEM-REAL-NUMBER-P");

    static private final SubLList $list_alt146 = list(new SubLObject[]{ makeSymbol("ADD-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER"), makeSymbol("ALIST-ENTER"), makeSymbol("ANSWER-GUI-QUESTION"), makeSymbol("AUGMENTED-QUERY-STRING-FOR-CYCL-TERMS"), makeSymbol("CREATE-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER"), makeSymbol("CREATE-KB-MODIFICATION-EVENT-FILTER"), makeSymbol("CYCLIST-NOTES"), makeSymbol("DELETE-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER"), makeSymbol("DELETE-KB-MODIFICATION-EVENT-FILTER"), makeSymbol("EXPLANATION-OF-WHY-NOT-WFF"), makeSymbol("EXPLANATION-OF-WHY-NOT-WFF-ASK"), makeSymbol("FIND-ASSERTION-CYCL"), makeSymbol("FIND-CONSTANT-BY-GUID"), makeSymbol("FIND-INFERENCE-ANSWER-BY-IDS"), makeSymbol("FIND-VALID-FET-TOPIC"), makeSymbol("GED-TO-XML-STRING"), makeSymbol("GET-FOLLOWUPS-FOR-ENTITY"), makeSymbol("GET-PASSAGES-FOR-ENTITY"), makeSymbol("HLMT-MONAD-MT"), makeSymbol("HLMT-TEMPORAL-MT"), makeSymbol("HTML-VAR-VALUE"), makeSymbol("IDENTIFY-ALL-GEQ-ENTITIES"), makeSymbol("MAKE-INDUCED-TOPIC-TYPE-FOR-TERM"), makeSymbol("MYSENTIENT-ARE-VERSIONS-SUPPORTED?"), makeSymbol("PPH-INFERENCE-ANSWER-JUSTIFICATION-FOR-JAVA"), makeSymbol("PPH-PROOF-DEPTH"), makeSymbol("PPH-SUMMARIZE-TERM"), makeSymbol("PROOF-SUID"), makeSymbol("REGISTER-CYCLIFY-PARSER"), makeSymbol("REMOVE-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER"), makeSymbol("RETURN-DOCUMENT-AS-STRING"), makeSymbol("SENTENCIFY-REMOTELY"), makeSymbol("TEMPLATE-TYPE-FOR-FOCAL-TERM-TYPE"), makeSymbol("TOPICS-RELATED-TO-ENTITY"), makeSymbol("WFF-QUERY?") });

    private static final SubLSymbol CYC_SYSTEM_STRING_P = makeSymbol("CYC-SYSTEM-STRING-P");

    private static final SubLSymbol CYC_SYSTEM_TERM_P = makeSymbol("CYC-SYSTEM-TERM-P");

    private static final SubLSymbol CYC_TANGENT = makeSymbol("CYC-TANGENT");

    private static final SubLSymbol CYC_TIME_ELAPSED = makeSymbol("CYC-TIME-ELAPSED");

    private static final SubLSymbol CYC_TIME_ELAPSED_DECODE_STRING = makeSymbol("CYC-TIME-ELAPSED-DECODE-STRING");

    private static final SubLSymbol CYC_TIME_ELAPSED_ENCODE_STRING = makeSymbol("CYC-TIME-ELAPSED-ENCODE-STRING");

    private static final SubLSymbol CYC_TIMES = makeSymbol("CYC-TIMES");

    private static final SubLSymbol CYC_TRIM_WHITESPACE = makeSymbol("CYC-TRIM-WHITESPACE");

    private static final SubLSymbol CYC_TRUE_SUBL = makeSymbol("CYC-TRUE-SUBL");

    private static final SubLSymbol CYC_TYPES_MOST_OFTEN_ASSERTED_USING_TOOL = makeSymbol("CYC-TYPES-MOST-OFTEN-ASSERTED-USING-TOOL");

    private static final SubLSymbol CYC_UNICODE_DENOTING_ASCII_STRING_P = makeSymbol("CYC-UNICODE-DENOTING-ASCII-STRING-P");

    private static final SubLSymbol CYC_ZIP_CODE_FIVE_DIGIT = makeSymbol("CYC-ZIP-CODE-FIVE-DIGIT");

    private static final SubLSymbol CYC_ZIP_CODE_NINE_DIGIT = makeSymbol("CYC-ZIP-CODE-NINE-DIGIT");

    private static final SubLSymbol $sym442$CYCL_ASSERTED_ASSERTION_ = makeSymbol("CYCL-ASSERTED-ASSERTION?");

    private static final SubLSymbol $sym443$CYCL_ASSERTION_ = makeSymbol("CYCL-ASSERTION?");

    static private final SubLList $list_alt147 = list(makeSymbol("WITH-PARAPHRASE-MAPPINGS"), makeSymbol("WITHIN-ASSERT"));

    private static final SubLSymbol $sym444$CYCL_ATOMIC_ASSERTION_ = makeSymbol("CYCL-ATOMIC-ASSERTION?");

    static private final SubLList $list_alt148 = list(new SubLObject[]{ makeSymbol("*CB-ASSERTION-HISTORY*"), makeSymbol("*CB-CONSTANT-HISTORY*"), makeSymbol("*CB-NAT-HISTORY*"), makeSymbol("*CB-SENTENCE-HISTORY*"), makeSymbol("*PARAPHRASE-PRECISION*"), makeSymbol("*PPH-ADDRESSEE*"), makeSymbol("*PPH-DEMERIT-CUTOFF*"), makeSymbol("*PPH-DOMAIN-MT*"), makeSymbol("*PPH-LANGUAGE-MT*"), makeSymbol("*PPH-LINK-ARG0?*"), makeSymbol("*PPH-MAXIMIZE-LINKS?*"), makeSymbol("*PPH-REPLACE-BULLETED-LIST-TAGS?*"), makeSymbol("*PPH-SPEAKER*"), makeSymbol("*PPH-SUGGESTED-DEMERIT-CUTOFF*"), makeSymbol("*PPH-TERSE-MT-SCOPE?*"), makeSymbol("*PPH-USE-BULLETED-LISTS?*"), makeSymbol("*PPH-USE-INDEXICAL-DATES?*"), makeSymbol("*PPH-USE-SMART-VARIABLE-REPLACEMENT?*"), makeSymbol("*PPH-USE-TITLE-CAPITALIZATION?*") });

    private static final SubLSymbol $sym445$CYCL_ATOMIC_SENTENCE_ = makeSymbol("CYCL-ATOMIC-SENTENCE?");

    private static final SubLSymbol CYCL_ATOMIC_TERM_P = makeSymbol("CYCL-ATOMIC-TERM-P");

    private static final SubLSymbol $sym447$CYCL_CLOSED_ATOMIC_SENTENCE_ = makeSymbol("CYCL-CLOSED-ATOMIC-SENTENCE?");

    private static final SubLSymbol CYCL_CLOSED_ATOMIC_TERM_P = makeSymbol("CYCL-CLOSED-ATOMIC-TERM-P");

    private static final SubLSymbol $sym449$CYCL_CLOSED_DENOTATIONAL_TERM_ = makeSymbol("CYCL-CLOSED-DENOTATIONAL-TERM?");

    private static final SubLSymbol $sym450$CYCL_CLOSED_EXPRESSION_ = makeSymbol("CYCL-CLOSED-EXPRESSION?");

    private static final SubLSymbol $sym451$CYCL_CLOSED_FORMULA_ = makeSymbol("CYCL-CLOSED-FORMULA?");

    static private final SubLSymbol $sym149$__ = makeSymbol("<>");

    private static final SubLSymbol $sym452$CYCL_CLOSED_NON_ATOMIC_TERM_ = makeSymbol("CYCL-CLOSED-NON-ATOMIC-TERM?");

    static private final SubLList $list_alt150 = list(makeSymbol("FI-CREATE-SKOLEM"), makeSymbol("FI-MERGE"), makeSymbol("FI-REASSERT"), makeSymbol("FI-JUSTIFY"), makeSymbol("FI-DENOTATION"), makeSymbol("FI-TIMESTAMP-CONSTANT"), makeSymbol("FI-TIMESTAMP-ASSERTION"));

    private static final SubLSymbol $sym453$CYCL_CLOSED_SENTENCE_ = makeSymbol("CYCL-CLOSED-SENTENCE?");

    private static final SubLSymbol CYCL_CONSTANT_P = makeSymbol("CYCL-CONSTANT-P");

    private static final SubLSymbol $sym455$CYCL_DEDUCED_ASSERTION_ = makeSymbol("CYCL-DEDUCED-ASSERTION?");

    static private final SubLList $list_alt151 = list(new SubLObject[]{ makeSymbol("BROADCAST-STREAM-STREAMS"), makeSymbol("CLEAR-INPUT"), makeSymbol("CLEAR-OUTPUT"), makeSymbol("CLOSE"), makeSymbol("CONCATENATED-STREAM-STREAMS"), makeSymbol("CONSTRUCT-FILENAME"), makeSymbol("CURRENT-PROCESS"), makeSymbol("CYC-IMAGE-ID"), makeSymbol("DIRECTORY"), makeSymbol("DIRECTORY-P"), makeSymbol("ECHO-STREAM-INPUT-STREAM"), makeSymbol("ECHO-STREAM-OUTPUT-STREAM"), makeSymbol("ENDP"), makeSymbol("FILE-AUTHOR"), makeSymbol("FILE-LENGTH"), makeSymbol("FILE-POSITION"), makeSymbol("FILE-STRING-LENGTH"), makeSymbol("FILE-WRITE-DATE"), makeSymbol("FINISH-OUTPUT"), makeSymbol("GETF"), makeSymbol("GET-FILE-POSITION"), makeSymbol("GET-MACHINE-NAME"), makeSymbol("GET-NETWORK-NAME"), makeSymbol("GET-OUTPUT-STREAM-STRING"), makeSymbol("GET-PROCESS-ID"), makeSymbol("GET-STRING-FROM-USER"), makeSymbol("GET-USER-NAME"), makeSymbol("INPUT-STREAM-P"), makeSymbol("INTERACTIVE-STREAM-P"), makeSymbol("INTERN"), makeSymbol("INTERRUPT-PROCESS"), makeSymbol("KEYWORDP"), makeSymbol("KILL-PROCESS"), makeSymbol("LISP-IMPLEMENTATION-TYPE"), makeSymbol("LISP-IMPLEMENTATION-VERSION"), makeSymbol("LISTEN"), makeSymbol("LONG-SITE-NAME"), makeSymbol("MACHINE-INSTANCE"), makeSymbol("MACHINE-TYPE"), makeSymbol("MACHINE-VERSION"), makeSymbol("MAKE-BROADCAST-STREAM"), makeSymbol("MAKE-CONCATENATED-STREAM"), makeSymbol("MAKE-DIRECTORY"), makeSymbol("MAKE-ECHO-STREAM"), makeSymbol("MAKE-KEYWORD"), makeSymbol("MAKE-LIST"), makeSymbol("MAKE-LOCK"), makeSymbol("MAKE-PACKAGE"), makeSymbol("MAKE-PROCESS"), makeSymbol("MAKE-STRING-INPUT-STREAM"), makeSymbol("MAKE-STRING-OUTPUT-STREAM"), makeSymbol("MAKE-SYNONYM-STREAM"), makeSymbol("MAKE-TWO-WAY-STREAM"), makeSymbol("OPEN"), makeSymbol("OPEN-BINARY"), makeSymbol("OPEN-STREAM-P"), makeSymbol("OPEN-TCP-STREAM"), makeSymbol("OPEN-TCP-STREAM-WITH-TIMEOUT"), makeSymbol("OPEN-TEXT"), makeSymbol("OUTPUT-STREAM-P"), makeSymbol("PACKAGE-LOCKED-P"), makeSymbol("PACKAGE-NAME"), makeSymbol("PACKAGE-NICKNAMES"), makeSymbol("PACKAGEP"), makeSymbol("PACKAGE-USED-BY-LIST"), makeSymbol("PACKAGE-USE-LIST"), makeSymbol("PEEK-CHAR"), makeSymbol("PROBE-FILE"), makeSymbol("PROCESS-ACTIVE-P"), makeSymbol("PROCESS-BLOCK"), makeSymbol("PROCESS-NAME"), makeSymbol("PROCESSP"), makeSymbol("PROCESS-STATE"), makeSymbol("PROCESS-UNBLOCK"), makeSymbol("PROCESS-WAIT"), makeSymbol("PROCESS-WAIT-WITH-TIMEOUT"), makeSymbol("PROCESS-WHOSTATE"), makeSymbol("PUT"), makeSymbol("PUTF"), makeSymbol("READ"), makeSymbol("READ-BYTE"), makeSymbol("READ-CHAR"), makeSymbol("READ-CHAR-NO-HANG"), makeSymbol("READ-DELIMITED-LIST"), makeSymbol("READ-IGNORING-ERRORS"), makeSymbol("READ-LINE"), makeSymbol("READ-PRESERVING-WHITESPACE"), makeSymbol("READ-SEQUENCE"), makeSymbol("REMPROP"), makeSymbol("RENAME-FILE"), makeSymbol("SHORT-SITE-NAME"), makeSymbol("SERVER-SUMMARY"), makeSymbol("SHOW-PROCESSES"), makeSymbol("SIMPLE-READER-ERROR"), makeSymbol("SOFTWARE-TYPE"), makeSymbol("SOFTWARE-VERSION"), makeSymbol("STREAMP"), makeSymbol("SYNONYM-STREAM-SYMBOL"), makeSymbol("TWO-WAY-STREAM-INPUT-STREAM"), makeSymbol("TWO-WAY-STREAM-OUTPUT-STREAM"), makeSymbol("UNREAD-CHAR"), makeSymbol("USER-CONFIRM"), makeSymbol("VALID-PROCESS-P"), makeSymbol("WRITE"), makeSymbol("WRITE-BYTE"), makeSymbol("WRITE-CHAR"), makeSymbol("WRITE-LINE"), makeSymbol("WRITE-SEQUENCE"), makeSymbol("WRITE-STRING"), makeSymbol("WRITE-TO-STRING") });

    private static final SubLSymbol $sym457$CYCL_EXPRESSION_ASKABLE_ = makeSymbol("CYCL-EXPRESSION-ASKABLE?");

    private static final SubLSymbol $sym458$CYCL_EXPRESSION_ASSERTIBLE_ = makeSymbol("CYCL-EXPRESSION-ASSERTIBLE?");

    private static final SubLSymbol $sym459$CYCL_EXPRESSION_ = makeSymbol("CYCL-EXPRESSION?");

    private static final SubLSymbol $sym460$CYCL_FORMULA_ = makeSymbol("CYCL-FORMULA?");

    private static final SubLSymbol $sym461$CYCL_GAF_ASSERTION_ = makeSymbol("CYCL-GAF-ASSERTION?");

    private static final SubLSymbol $sym462$CYCL_INDEXED_TERM_ = makeSymbol("CYCL-INDEXED-TERM?");

    private static final SubLSymbol $sym463$CYCL_NL_SEMANTIC_ASSERTION_ = makeSymbol("CYCL-NL-SEMANTIC-ASSERTION?");

    private static final SubLSymbol $sym464$CYCL_NON_ATOMIC_REIFIED_TERM_ = makeSymbol("CYCL-NON-ATOMIC-REIFIED-TERM?");

    private static final SubLSymbol $sym465$CYCL_NON_ATOMIC_TERM_ASKABLE_ = makeSymbol("CYCL-NON-ATOMIC-TERM-ASKABLE?");

    private static final SubLSymbol $sym466$CYCL_NON_ATOMIC_TERM_ASSERTIBLE_ = makeSymbol("CYCL-NON-ATOMIC-TERM-ASSERTIBLE?");

    private static final SubLSymbol $sym467$CYCL_NON_ATOMIC_TERM_ = makeSymbol("CYCL-NON-ATOMIC-TERM?");

    private static final SubLSymbol $sym468$CYCL_OPEN_DENOTATIONAL_TERM_ = makeSymbol("CYCL-OPEN-DENOTATIONAL-TERM?");

    private static final SubLSymbol $sym469$CYCL_OPEN_EXPRESSION_ = makeSymbol("CYCL-OPEN-EXPRESSION?");

    private static final SubLSymbol $sym470$CYCL_OPEN_FORMULA_ = makeSymbol("CYCL-OPEN-FORMULA?");

    private static final SubLSymbol $sym471$CYCL_OPEN_NON_ATOMIC_TERM_ = makeSymbol("CYCL-OPEN-NON-ATOMIC-TERM?");

    private static final SubLSymbol $sym472$CYCL_OPEN_SENTENCE_ = makeSymbol("CYCL-OPEN-SENTENCE?");

    private static final SubLSymbol $sym473$CYCL_PROPOSITIONAL_SENTENCE_ = makeSymbol("CYCL-PROPOSITIONAL-SENTENCE?");

    private static final SubLSymbol $sym474$CYCL_REFORMULATOR_RULE_ = makeSymbol("CYCL-REFORMULATOR-RULE?");

    private static final SubLSymbol $sym475$CYCL_REIFIABLE_DENOTATIONAL_TERM_ = makeSymbol("CYCL-REIFIABLE-DENOTATIONAL-TERM?");

    private static final SubLSymbol $sym476$CYCL_REIFIABLE_NON_ATOMIC_TERM_ = makeSymbol("CYCL-REIFIABLE-NON-ATOMIC-TERM?");

    private static final SubLSymbol $sym477$CYCL_REIFIED_DENOTATIONAL_TERM_ = makeSymbol("CYCL-REIFIED-DENOTATIONAL-TERM?");

    private static final SubLSymbol CYCL_REPRESENTED_ATOMIC_TERM_P = makeSymbol("CYCL-REPRESENTED-ATOMIC-TERM-P");

    private static final SubLSymbol $sym479$CYCL_REPRESENTED_TERM_ = makeSymbol("CYCL-REPRESENTED-TERM?");

    private static final SubLSymbol $sym480$CYCL_RULE_ASSERTION_ = makeSymbol("CYCL-RULE-ASSERTION?");

    private static final SubLSymbol $sym481$CYCL_SENTENCE_ASKABLE_ = makeSymbol("CYCL-SENTENCE-ASKABLE?");

    private static final SubLSymbol $sym482$CYCL_SENTENCE_ASSERTIBLE_ = makeSymbol("CYCL-SENTENCE-ASSERTIBLE?");

    private static final SubLSymbol $sym483$CYCL_SENTENCE_ = makeSymbol("CYCL-SENTENCE?");

    private static final SubLSymbol CYCL_SUBL_SYMBOL_P = makeSymbol("CYCL-SUBL-SYMBOL-P");

    private static final SubLSymbol CYCL_UNBOUND_RELATION_FORMULA_P = makeSymbol("CYCL-UNBOUND-RELATION-FORMULA-P");

    private static final SubLSymbol $sym486$CYCL_VAR_LIST_ = makeSymbol("CYCL-VAR-LIST?");

    private static final SubLSymbol CYCL_VARIABLE_P = makeSymbol("CYCL-VARIABLE-P");

    private static final SubLSymbol $sym488$CYCSECURE_SUB_SOFTWARE_OBJECTS_ = makeSymbol("CYCSECURE-SUB-SOFTWARE-OBJECTS?");

    private static final SubLSymbol $sym489$CYCSECURE_VERSION_OF_SOFTWARE_ = makeSymbol("CYCSECURE-VERSION-OF-SOFTWARE?");

    private static final SubLSymbol $sym490$GAF_ = makeSymbol("GAF?");

    private static final SubLSymbol GEN_TEMPLATE_RECIPE_P = makeSymbol("GEN-TEMPLATE-RECIPE-P");

    private static final SubLSymbol GENERATE_NAMES_FOR_TERM = makeSymbol("GENERATE-NAMES-FOR-TERM");

    private static final SubLSymbol GENERATE_PHRASE_DEFN = makeSymbol("GENERATE-PHRASE-DEFN");

    private static final SubLSymbol HL_EXTERNAL_ID_STRING_P = makeSymbol("HL-EXTERNAL-ID-STRING-P");

    private static final SubLSymbol $sym495$IBQE_ = makeSymbol("IBQE?");

    private static final SubLSymbol $sym498$KWTE_ = makeSymbol("KWTE?");

    private static final SubLSymbol $sym500$MONAD_CYCL_MT_ = makeSymbol("MONAD-CYCL-MT?");

    private static final SubLSymbol $sym501$NON_NEGATIVE_SCALAR_INTERVAL_ = makeSymbol("NON-NEGATIVE-SCALAR-INTERVAL?");

    private static final SubLSymbol $sym502$POSITIVE_SCALAR_INTERVAL_ = makeSymbol("POSITIVE-SCALAR-INTERVAL?");

    private static final SubLSymbol PRE_REMOVE_DEFINITE_ARTICLE_FROM_STRING = makeSymbol("PRE-REMOVE-DEFINITE-ARTICLE-FROM-STRING");

    private static final SubLSymbol RTP_SYNTACTIC_CONSTRAINT = makeSymbol("RTP-SYNTACTIC-CONSTRAINT");

    private static final SubLSymbol $sym505$SCALAR_POINT_VALUE_ = makeSymbol("SCALAR-POINT-VALUE?");

    private static final SubLSymbol $sym506$STRING_W_O_CONTROL_CHARS_ = makeSymbol("STRING-W/O-CONTROL-CHARS?");

    private static final SubLSymbol SUBL_NON_VARIABLE_NON_KEYWORD_SYMBOL_P = makeSymbol("SUBL-NON-VARIABLE-NON-KEYWORD-SYMBOL-P");

    private static final SubLSymbol TEMPORAL_DIMENSION_MT_P = makeSymbol("TEMPORAL-DIMENSION-MT-P");

    private static final SubLSymbol URL_P = makeSymbol("URL-P");

    private static final SubLList $list513 = list(makeSymbol("NEW-CYC-QUERY"), makeSymbol("NTH-VALUE"), makeSymbol("INFERENCE-ALL-ANSWERS"), makeSymbol("INFERENCE-ANSWER-JUSTIFICATIONS"), makeSymbol("INFERENCE-ANSWER-JUSTIFICATION-SUPPORTS"), makeSymbol("HL-JUSTIFY"), makeSymbol("HL-JUSTIFY-EXPANDED"));

    // Definitions
    public static final SubLObject api_bq_list_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject objects = current;
            return bq_cons(LIST, append(objects, NIL));
        }
    }

    // Definitions
    public static SubLObject api_bq_list(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject objects;
        final SubLObject current = objects = datum;
        return bq_cons(LIST, append(objects, NIL));
    }

    public static SubLObject declare_eval_in_api_registrations_file() {
        declareMacro("api_bq_list", "API-BQ-LIST");
        return NIL;
    }

    public static final SubLObject init_eval_in_api_registrations_file_alt() {
        deflexical("*SUBLISP-API-PREDEFINED-FUNCTIONS*", $list_alt62);
        deflexical("*API-HOST-ACCESS-FUNCTIONS*", $list_alt151);
        return NIL;
    }

    public static SubLObject init_eval_in_api_registrations_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*SUBLISP-API-PREDEFINED-FUNCTIONS*", $list64);
            deflexical("*API-HOST-ACCESS-FUNCTIONS*", $list153);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*SUBLISP-API-PREDEFINED-FUNCTIONS*", $list_alt62);
            deflexical("*API-HOST-ACCESS-FUNCTIONS*", $list_alt151);
        }
        return NIL;
    }

    public static SubLObject init_eval_in_api_registrations_file_Previous() {
        deflexical("*SUBLISP-API-PREDEFINED-FUNCTIONS*", $list64);
        deflexical("*API-HOST-ACCESS-FUNCTIONS*", $list153);
        return NIL;
    }

    public static final SubLObject setup_eval_in_api_registrations_file_alt() {
        eval_in_api.register_api_immutable_global($null_output$);
        eval_in_api.register_api_mutable_global($it_verbose$);
        eval_in_api.register_api_mutable_global($progress_note$);
        eval_in_api.register_api_mutable_global($progress_sofar$);
        eval_in_api.register_api_mutable_global($progress_start_time$);
        eval_in_api.register_api_mutable_global($progress_total$);
        eval_in_api.register_api_mutable_global($eval_with_bindings$);
        eval_in_api.register_api_mutable_global($error_output$);
        eval_in_api.register_api_mutable_global($standard_output$);
        eval_in_api.register_api_mutable_global($continue_cerrorP$);
        eval_in_api.register_api_mutable_global($silent_progressP$);
        eval_in_api.register_api_mutable_global($ignore_breaksP$);
        eval_in_api.register_api_mutable_global($ignore_warnsP$);
        eval_in_api.register_api_mutable_global($eval_in_api_trace_log$);
        eval_in_api.register_api_mutable_global($eval_in_api_traced_fns$);
        eval_in_api.register_api_mutable_global($eval_in_api_env$);
        eval_in_api.register_api_mutable_global($api_output_protocol$);
        eval_in_api.register_api_mutable_global($api_result_method$);
        eval_in_api.register_api_mutable_global($api_input_protocol$);
        eval_in_api.register_api_mutable_global($ke_purpose$);
        eval_in_api.register_api_mutable_global($the_cyclist$);
        eval_in_api.register_api_mutable_global($use_local_queueP$);
        eval_in_api.register_api_mutable_global($relevant_mt_function$);
        eval_in_api.register_api_mutable_global($cyc_bookkeeping_info$);
        eval_in_api.register_api_mutable_global($suppress_sbhl_recachingP$);
        eval_in_api.register_api_mutable_global($paraphrase_precision$);
        eval_in_api.register_api_mutable_global($eval_in_api_level$);
        eval_in_api.register_api_mutable_global($suspend_sbhl_type_checkingP$);
        eval_in_api.register_api_mutable_global($require_case_insensitive_name_uniqueness$);
        eval_in_api.register_api_mutable_global($task_processor_verbosity$);
        register_api_predefined_macro(BQ_APPEND);
        register_api_predefined_macro(BQ_LIST);
        register_api_predefined_macro($sym32$BQ_LIST_);
        register_api_predefined_macro(BQ_NCONC);
        register_api_predefined_macro(BQ_VECTOR_APPEND);
        register_api_predefined_macro(API_BQ_LIST);
        register_api_predefined_macro(CDESTRUCTURING_BIND);
        register_api_predefined_macro(WITH_PRECISE_PARAPHRASE_ON);
        register_api_predefined_macro(WITH_PARAPHRASE_PRECISION);
        register_api_predefined_macro(WITH_BOOKKEEPING_INFO);
        register_api_predefined_macro(WITH_MT_FUNCTION);
        register_api_predefined_macro(WITH_GENL_MTS);
        register_api_predefined_macro(WITH_INFERENCE_MT_RELEVANCE);
        register_api_predefined_macro(WITH_ALL_MTS);
        register_api_predefined_macro(DO_PREDICATE_RULE_INDEX);
        register_api_predefined_macro(DO_RULE_INDEX);
        register_api_predefined_macro(WITHOUT_WFF_SEMANTICS);
        register_api_predefined_macro(CDOLIST_DONE);
        register_api_predefined_macro(DO_DICTIONARY);
        register_api_predefined_macro(PROGRESS_CDOTIMES);
        register_api_predefined_macro(DO_KB_SUID_TABLE);
        register_api_predefined_macro(DO_ID_INDEX);
        register_api_predefined_macro(OLD_DO_ID_INDEX);
        register_api_predefined_macro(DO_CONSTANTS);
        register_api_predefined_macro(CWITH_OUTPUT_TO_STRING);
        register_api_predefined_macro(WITH_INPUT_FROM_STRING);
        register_api_predefined_macro(DO_VECTOR_INDEX);
        register_api_predefined_macro(IN_MT);
        register_api_predefined_host_macro(WITH_OPEN_STREAM);
        register_api_predefined_host_macro(WITH_OPEN_FILE);
        register_api_predefined_host_macro(WITH_TCP_CONNECTION);
        {
            SubLObject cdolist_list_var = $sublisp_api_predefined_functions$.getGlobalValue();
            SubLObject symbol = NIL;
            for (symbol = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , symbol = cdolist_list_var.first()) {
                register_api_predefined_function(symbol);
            }
        }
        {
            SubLObject cdolist_list_var = $list_alt63;
            SubLObject symbol = NIL;
            for (symbol = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , symbol = cdolist_list_var.first()) {
                register_api_predefined_function(symbol);
            }
        }
        {
            SubLObject cdolist_list_var = $list_alt64;
            SubLObject symbol = NIL;
            for (symbol = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , symbol = cdolist_list_var.first()) {
                register_api_predefined_function(symbol);
            }
        }
        register_api_predefined_function(STRING_TO_GUID);
        register_api_predefined_function(GUID_TO_STRING);
        register_api_predefined_function(REMOVE_DUPLICATES);
        register_api_predefined_function(NEW_BOOKKEEPING_INFO);
        register_api_predefined_function(STRING_SUBSTITUTE);
        register_api_predefined_function(GENERATE_PHRASE);
        register_api_predefined_function(THE_DATE);
        register_api_predefined_function(THE_SECOND);
        register_api_predefined_function(ISA);
        register_api_predefined_function(GENLS);
        register_api_predefined_function($sym75$WHY_COLLECTIONS_INTERSECT_);
        register_api_predefined_function(ARG1_FORMAT);
        register_api_predefined_function(ARG2_FORMAT);
        register_api_predefined_function(SPECS);
        register_api_predefined_function(COLLECTION_LEAVES);
        register_api_predefined_function(SIMPLE_INDEXED_TERM_P);
        register_api_predefined_function(MAX_SPECS);
        register_api_predefined_function(MIN_ISA);
        register_api_predefined_function(LOCAL_DISJOINT_WITH);
        register_api_predefined_function($sym84$DISJOINT_WITH_);
        register_api_predefined_function(GENL_SIBLINGS);
        register_api_predefined_function(SPEC_SIBLINGS);
        register_api_predefined_function(ARG1_ISA);
        register_api_predefined_function(ARG2_ISA);
        register_api_predefined_function(ARGN_ISA);
        register_api_predefined_function(ARGN_ISA);
        register_api_predefined_function(ARGN_GENL);
        register_api_predefined_function(ALL_GENLS_IN_ANY_MT);
        register_api_predefined_function(ALL_ISA_IN_ANY_MT);
        register_api_predefined_function(ALL_FORT_INSTANCES_IN_ALL_MTS);
        register_api_predefined_function($sym94$ISA_IN_ANY_MT_);
        register_api_predefined_function($sym95$GENL_IN_ANY_MT_);
        register_api_predefined_function(NEW_CONSTANT_NAME_SPEC_P);
        register_api_predefined_function(DO_RULE_INDEX_RULES);
        register_api_predefined_function(BT_LOWER);
        register_api_predefined_function(BT_HIGHER);
        register_api_predefined_function(SAMPLE_LEAF_SPECS);
        register_api_predefined_function($sym101$TACIT_COEXTENSIONAL_);
        register_api_predefined_function($sym102$EL_WFF_);
        register_api_predefined_function($sym103$EVALUATABLE_PREDICATE_);
        register_api_predefined_function($sym104$HIERARCHICAL_COLLECTIONS_);
        register_api_predefined_function(NUM_BEST_GAF_LOOKUP_INDEX);
        register_api_predefined_function(API_QUIT);
        register_api_predefined_function(NART_P);
        register_api_predefined_function(EL_VARIABLE_P);
        register_api_predefined_function(PPH_PRECISION_P);
        register_api_predefined_function(FORT_FOR_STRING);
        register_api_predefined_function($sym111$RTP_PARSE_EXP_W_VPP);
        register_api_predefined_function(GET_UNIVERSAL_TIME);
        register_api_predefined_function(DECODE_UNIVERSAL_TIME);
        register_api_predefined_function(FIND_NART);
        register_api_predefined_function(CONSTANT_GUID);
        register_api_predefined_function(RKF_PHRASE_READER);
        register_api_predefined_function(GENERATE_DISAMBIGUATION_PHRASES_AND_TYPES);
        register_api_predefined_function(LOAD_TRANSCRIPT_FILE);
        register_api_predefined_function(KB_STATISTICS);
        register_api_predefined_function($sym120$GENL_MT_);
        register_api_predefined_function(ALL_SPEC_MTS);
        register_api_predefined_function(REMOVAL_ASK);
        register_api_predefined_function(DO_NARTS_TABLE);
        register_api_predefined_function(ID_INDEX_COUNT);
        register_api_predefined_function(ID_INDEX_OLD_OBJECTS);
        register_api_predefined_function(ID_INDEX_EMPTY_P);
        register_api_predefined_function(ID_INDEX_NEW_ID_THRESHOLD);
        register_api_predefined_function(ID_INDEX_NEXT_ID);
        register_api_predefined_function(CYCL_NART_P);
        register_api_predefined_function(CYCL_NAUT_P);
        register_api_predefined_function(RESOLVE_NEW_CONSTANTS);
        register_api_predefined_function(CYC_OPENCYC_FEATURE);
        register_api_predefined_function(CYC_RESEARCHCYC_FEATURE);
        register_api_predefined_function(CANONICALIZE_HLMT);
        register_api_predefined_function(NEW_CYC_QUERY);
        register_api_predefined_function(REGISTER_SOLELY_SPECIFIC_REMOVAL_MODULE_PREDICATE);
        register_api_predefined_function(INFERENCE_REMOVAL_MODULE);
        register_api_predefined_function(UNDECLARE_INFERENCE_REMOVAL_MODULE);
        {
            SubLObject cdolist_list_var = $list_alt139;
            SubLObject symbol = NIL;
            for (symbol = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , symbol = cdolist_list_var.first()) {
                register_api_predefined_function(symbol);
            }
        }
        {
            SubLObject cdolist_list_var = $list_alt140;
            SubLObject symbol = NIL;
            for (symbol = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , symbol = cdolist_list_var.first()) {
                register_api_predefined_function(symbol);
            }
        }
        {
            SubLObject cdolist_list_var = $list_alt141;
            SubLObject symbol = NIL;
            for (symbol = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , symbol = cdolist_list_var.first()) {
                register_api_predefined_function(symbol);
            }
        }
        {
            SubLObject cdolist_list_var = $list_alt142;
            SubLObject symbol = NIL;
            for (symbol = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , symbol = cdolist_list_var.first()) {
                register_api_predefined_function(symbol);
            }
        }
        {
            SubLObject cdolist_list_var = $list_alt143;
            SubLObject symbol = NIL;
            for (symbol = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , symbol = cdolist_list_var.first()) {
                register_api_predefined_function(symbol);
            }
        }
        {
            SubLObject cdolist_list_var = $list_alt144;
            SubLObject symbol = NIL;
            for (symbol = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , symbol = cdolist_list_var.first()) {
                register_api_predefined_function(symbol);
            }
        }
        {
            SubLObject cdolist_list_var = $list_alt145;
            SubLObject symbol = NIL;
            for (symbol = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , symbol = cdolist_list_var.first()) {
                register_api_predefined_function(symbol);
            }
        }
        {
            SubLObject cdolist_list_var = $list_alt146;
            SubLObject symbol = NIL;
            for (symbol = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , symbol = cdolist_list_var.first()) {
                register_api_predefined_function(symbol);
            }
        }
        {
            SubLObject cdolist_list_var = $list_alt147;
            SubLObject symbol = NIL;
            for (symbol = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , symbol = cdolist_list_var.first()) {
                register_api_predefined_macro(symbol);
            }
        }
        {
            SubLObject cdolist_list_var = $list_alt148;
            SubLObject symbol = NIL;
            for (symbol = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , symbol = cdolist_list_var.first()) {
                eval_in_api.register_api_mutable_global(symbol);
            }
        }
        register_external_symbol($sym149$__);
        {
            SubLObject cdolist_list_var = $list_alt150;
            SubLObject symbol = NIL;
            for (symbol = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , symbol = cdolist_list_var.first()) {
                register_api_predefined_function(symbol);
            }
        }
        {
            SubLObject cdolist_list_var = $api_host_access_functions$.getGlobalValue();
            SubLObject symbol = NIL;
            for (symbol = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , symbol = cdolist_list_var.first()) {
                register_api_predefined_host_function(symbol);
            }
        }
        register_api_predefined_function(PHRASE_FOR_MT);
        register_api_predefined_function(BEST_STRING_OF_NL_PHRASE_DEFN);
        register_api_predefined_function(CYC_1_BYTE_INTEGER);
        register_api_predefined_function(CYC_2_BYTE_INTEGER);
        register_api_predefined_function(CYC_4_BYTE_INTEGER);
        register_api_predefined_function(CYC_8_BYTE_INTEGER);
        register_api_predefined_function(CYC_ABSOLUTE_VALUE);
        register_api_predefined_function(CYC_ADD_ENGLISH_SUFFIX);
        register_api_predefined_function(CYC_ARC_COSECANT);
        register_api_predefined_function(CYC_ARC_COSINE);
        register_api_predefined_function(CYC_ARC_COTANGENT);
        register_api_predefined_function(CYC_ARC_SECANT);
        register_api_predefined_function(CYC_ARC_SINE);
        register_api_predefined_function(CYC_ARC_TANGENT);
        register_api_predefined_function(CYC_ASCII_STRING_P);
        register_api_predefined_function(CYC_AVERAGE);
        register_api_predefined_function(CYC_BIT_DATATYPE);
        register_api_predefined_function(CYC_COLLECTION_DENOTING_UNARY_FUNCTION_FOR);
        register_api_predefined_function(CYC_COSECANT);
        register_api_predefined_function(CYC_COSINE);
        register_api_predefined_function(CYC_COTANGENT);
        register_api_predefined_function(CYC_DATE_AFTER);
        register_api_predefined_function(CYC_DATE_BEFORE);
        register_api_predefined_function(CYC_DATE_DECODE_STRING);
        register_api_predefined_function(CYC_DATE_ENCODE_STRING);
        register_api_predefined_function(CYC_DATE_FROM_INTEGER);
        register_api_predefined_function(CYC_DATE_FROM_STRING);
        register_api_predefined_function(CYC_DATE_SUBSUMES);
        register_api_predefined_function(CYC_DAY_OF_DATE);
        register_api_predefined_function(CYC_DAY_OF_WEEK_AFTER_DATE);
        register_api_predefined_function(CYC_DAY_OF_WEEK_AFTER_DATE_INCLUSIVE);
        register_api_predefined_function(CYC_DAY_OF_WEEK_DEFN);
        register_api_predefined_function(CYC_DAY_OF_WEEK_OF_DATE);
        register_api_predefined_function(CYC_DAY_OF_WEEK_PRIOR_TO_DATE);
        register_api_predefined_function(CYC_DAY_OF_WEEK_PRIOR_TO_DATE_INCLUSIVE);
        register_api_predefined_function(CYC_DIFFERENCE);
        register_api_predefined_function(CYC_DIFFERENT);
        register_api_predefined_function(CYC_DIFFERENT_SYMBOLS);
        register_api_predefined_function(CYC_EVALUATE_SUBL);
        register_api_predefined_function(CYC_EVEN_NUMBER);
        register_api_predefined_function(CYC_EXP);
        register_api_predefined_function(CYC_EXPONENT);
        register_api_predefined_function(CYC_EXTENDED_NUMBER_P);
        register_api_predefined_function(CYC_GREATER_THAN);
        register_api_predefined_function(CYC_GREATER_THAN_OR_EQUAL_TO);
        register_api_predefined_function(CYC_GROUND_TERM);
        register_api_predefined_function(CYC_GUID_STRING_P);
        register_api_predefined_function(CYC_HTTP_URL_ENCODE);
        register_api_predefined_function(CYC_IDENTITY);
        register_api_predefined_function(CYC_INDEXICAL_REFERENT);
        register_api_predefined_function(CYC_INDIVIDUAL_DENOTING_UNARY_FUNCTION_FOR);
        register_api_predefined_function(CYC_INDIVIDUAL_NECESSARY);
        register_api_predefined_function(CYC_INTEGER);
        register_api_predefined_function(CYC_INTEGER_RANGE);
        register_api_predefined_function(CYC_INTEGER_RANGE);
        register_api_predefined_function(CYC_INTEGER_TO_STRING);
        register_api_predefined_function(CYC_INTERVAL_ENDED_BY_LAST_SUBINTERVAL_OF_TYPE);
        register_api_predefined_function(CYC_INTERVAL_STARTED_BY_FIRST_SUBINTERVAL_OF_TYPE);
        register_api_predefined_function(CYC_INVERSE);
        register_api_predefined_function(CYC_IP4_ADDRESS);
        register_api_predefined_function(CYC_IP4_NETWORK_ADDRESS);
        register_api_predefined_function(CYC_LATER_THAN);
        register_api_predefined_function(CYC_LESS_THAN);
        register_api_predefined_function(CYC_LESS_THAN_OR_EQUAL_TO);
        register_api_predefined_function(CYC_LIST_CONCATENATE);
        register_api_predefined_function(CYC_LIST_FIRST);
        register_api_predefined_function(CYC_LIST_LAST);
        register_api_predefined_function(CYC_LIST_LENGTH);
        register_api_predefined_function(CYC_LIST_MEMBER_SET);
        register_api_predefined_function(CYC_LIST_NTH);
        register_api_predefined_function(CYC_LIST_OF_TYPE_NECESSARY);
        register_api_predefined_function(CYC_LIST_OF_TYPE_SUFFICIENT);
        register_api_predefined_function(CYC_LIST_REST);
        register_api_predefined_function(CYC_LIST_REVERSE);
        register_api_predefined_function(CYC_LIST_SEARCH);
        register_api_predefined_function(CYC_LIST_SUBSEQ);
        register_api_predefined_function(CYC_LIST_WITHOUT_REPETITION);
        register_api_predefined_function(CYC_LOG);
        register_api_predefined_function(CYC_LOGARITHM);
        register_api_predefined_function(CYC_MAKE_FORMULA);
        register_api_predefined_function(CYC_MAP_FUNCTION_OVER_LIST);
        register_api_predefined_function(CYC_MAX_RANGE);
        register_api_predefined_function(CYC_MAXIMUM);
        register_api_predefined_function(CYC_MIN_RANGE);
        register_api_predefined_function(CYC_MINIMUM);
        register_api_predefined_function(CYC_MINUS);
        register_api_predefined_function(CYC_NEGATIVE_INTEGER);
        register_api_predefined_function(CYC_NEGATIVE_NUMBER);
        register_api_predefined_function(CYC_NEXT_ITERATED_CYCLIC_INTERVAL);
        register_api_predefined_function(CYC_NON_NEGATIVE_INTEGER);
        register_api_predefined_function(CYC_NON_NEGATIVE_NUMBER);
        register_api_predefined_function(CYC_NON_POSITIVE_INTEGER);
        register_api_predefined_function(CYC_NON_POSITIVE_NUMBER);
        register_api_predefined_function(CYC_NTH_METRICALLY_PRECEDING_TIME_INTERVAL_OF_TYPE);
        register_api_predefined_function(CYC_NTH_METRICALLY_SUCCEEDING_TIME_INTERVAL_OF_TYPE);
        register_api_predefined_function(CYC_NUMBER_STRING);
        register_api_predefined_function(CYC_NUMERAL_STRING);
        register_api_predefined_function(CYC_NUMERIC_STRING_NECESSARY);
        register_api_predefined_function(CYC_NUMERICALLY_EQUAL);
        register_api_predefined_function(CYC_ODD_NUMBER);
        register_api_predefined_function(CYC_PERCENT);
        register_api_predefined_function(CYC_PLUS);
        register_api_predefined_function(CYC_PLUS_ALL);
        register_api_predefined_function(CYC_POSITION);
        register_api_predefined_function(CYC_POSITIVE_INTEGER);
        register_api_predefined_function(CYC_POSITIVE_NUMBER);
        register_api_predefined_function(CYC_POST_REMOVE);
        register_api_predefined_function(CYC_PRE_REMOVE);
        register_api_predefined_function(CYC_PREFIX_SUBSTRING);
        register_api_predefined_function($sym260$CYC_PRIME_NUMBER_);
        register_api_predefined_function(CYC_QUANTITY_CONVERSION);
        register_api_predefined_function(CYC_QUANTITY_INTERSECTS);
        register_api_predefined_function(CYC_QUANTITY_SUBSUMES);
        register_api_predefined_function(CYC_QUOTIENT);
        register_api_predefined_function(CYC_RATIONAL_NUMBER);
        register_api_predefined_function(CYC_REAL_0_1);
        register_api_predefined_function(CYC_REAL_1_INFINITY);
        register_api_predefined_function(CYC_REAL_NUMBER);
        register_api_predefined_function(CYC_RECAPITALIZE_SMART);
        register_api_predefined_function(CYC_RELATION_ARG);
        register_api_predefined_function(CYC_RELATION_ARG_SET);
        register_api_predefined_function(CYC_RELATION_ARGS_LIST);
        register_api_predefined_function(CYC_RELATION_EXPRESSION_ARITY);
        register_api_predefined_function(CYC_REPLACE_SUBSTRING);
        register_api_predefined_function(CYC_ROUND_CLOSEST);
        register_api_predefined_function(CYC_ROUND_DOWN);
        register_api_predefined_function(CYC_ROUND_UP);
        register_api_predefined_function(CYC_SCIENTIFIC_NUMBER_FROM_STRING);
        register_api_predefined_function(CYC_SCIENTIFIC_NUMBER_FROM_SUBL_REAL);
        register_api_predefined_function(CYC_SCIENTIFIC_NUMBER_P);
        register_api_predefined_function(CYC_SCIENTIFIC_NUMBER_SIGNIFICANT_DIGIT_COUNT);
        register_api_predefined_function(CYC_SCIENTIFIC_NUMBER_TO_STRING);
        register_api_predefined_function(CYC_SCIENTIFIC_NUMBER_TO_SUBL_REAL);
        register_api_predefined_function(CYC_SECANT);
        register_api_predefined_function(CYC_SET_DIFFERENCE);
        register_api_predefined_function(CYC_SET_EXTENT);
        register_api_predefined_function(CYC_SET_OF_TYPE_NECESSARY);
        register_api_predefined_function(CYC_SET_OF_TYPE_SUFFICIENT);
        register_api_predefined_function(CYC_SIGNIFICANT_DIGITS);
        register_api_predefined_function(CYC_SINE);
        register_api_predefined_function(CYC_SKSI_SOURCE_ACCESSIBLE);
        register_api_predefined_function(CYC_SKSI_SOURCE_ACTIVATED);
        register_api_predefined_function(CYC_SKSI_SOURCE_QUERYABLE);
        register_api_predefined_function(CYC_SKSI_SOURCE_REGISTERED);
        register_api_predefined_function(CYC_SQRT);
        register_api_predefined_function(CYC_STRING_CONCAT);
        register_api_predefined_function(CYC_STRING_TO_INTEGER);
        register_api_predefined_function(CYC_STRING_TO_REAL_NUMBER);
        register_api_predefined_function(CYC_STRING_TOKENIZE_NEW);
        register_api_predefined_function(CYC_STRING_UPCASE);
        register_api_predefined_function(CYC_STRINGS_TO_PHRASE);
        register_api_predefined_function(CYC_SUBL_ESCAPE);
        register_api_predefined_function(CYC_SUBL_EXPRESSION);
        register_api_predefined_function(CYC_SUBL_TEMPLATE);
        register_api_predefined_function($sym305$CYC_SUBLIST_);
        register_api_predefined_function(CYC_SUBSTITUTE_FORMULA);
        register_api_predefined_function(CYC_SUBSTITUTE_FORMULA_ARG);
        register_api_predefined_function(CYC_SUBSTITUTE_FORMULA_ARG_POSITION);
        register_api_predefined_function(CYC_SUBSTRING);
        register_api_predefined_function(CYC_SUBSTRING_CASE_INSENSITIVE_PREDICATE);
        register_api_predefined_function(CYC_SUBSTRING_PREDICATE);
        register_api_predefined_function(CYC_SUBWORD_PREDICATE);
        register_api_predefined_function(CYC_SUFFIX_SUBSTRING);
        register_api_predefined_function(CYC_SYSTEM_ATOM);
        register_api_predefined_function(CYC_SYSTEM_CHARACTER_P);
        register_api_predefined_function(CYC_SYSTEM_INTEGER);
        register_api_predefined_function(CYC_SYSTEM_NON_VARIABLE_SYMBOL_P);
        register_api_predefined_function(CYC_SYSTEM_REAL_NUMBER_P);
        register_api_predefined_function(CYC_SYSTEM_STRING_P);
        register_api_predefined_function(CYC_SYSTEM_TERM_P);
        register_api_predefined_function(CYC_TANGENT);
        register_api_predefined_function(CYC_TIME_ELAPSED);
        register_api_predefined_function(CYC_TIME_ELAPSED_DECODE_STRING);
        register_api_predefined_function(CYC_TIME_ELAPSED_ENCODE_STRING);
        register_api_predefined_function(CYC_TIMES);
        register_api_predefined_function(CYC_TRIM_WHITESPACE);
        register_api_predefined_function(CYC_TRUE_SUBL);
        register_api_predefined_function(CYC_TYPES_MOST_OFTEN_ASSERTED_USING_TOOL);
        register_api_predefined_function(CYC_UNICODE_DENOTING_ASCII_STRING_P);
        register_api_predefined_function(CYC_ZIP_CODE_FIVE_DIGIT);
        register_api_predefined_function(CYC_ZIP_CODE_NINE_DIGIT);
        register_api_predefined_function($sym332$CYCL_ASSERTED_ASSERTION_);
        register_api_predefined_function($sym333$CYCL_ASSERTION_);
        register_api_predefined_function($sym334$CYCL_ATOMIC_ASSERTION_);
        register_api_predefined_function($sym335$CYCL_ATOMIC_SENTENCE_);
        register_api_predefined_function(CYCL_ATOMIC_TERM_P);
        register_api_predefined_function($sym337$CYCL_CLOSED_ATOMIC_SENTENCE_);
        register_api_predefined_function(CYCL_CLOSED_ATOMIC_TERM_P);
        register_api_predefined_function($sym339$CYCL_CLOSED_DENOTATIONAL_TERM_);
        register_api_predefined_function($sym340$CYCL_CLOSED_EXPRESSION_);
        register_api_predefined_function($sym341$CYCL_CLOSED_FORMULA_);
        register_api_predefined_function($sym342$CYCL_CLOSED_NON_ATOMIC_TERM_);
        register_api_predefined_function($sym343$CYCL_CLOSED_SENTENCE_);
        register_api_predefined_function(CYCL_CONSTANT_P);
        register_api_predefined_function($sym345$CYCL_DEDUCED_ASSERTION_);
        register_api_predefined_function(CYCL_DENOTATIONAL_TERM_P);
        register_api_predefined_function($sym347$CYCL_EXPRESSION_ASKABLE_);
        register_api_predefined_function($sym348$CYCL_EXPRESSION_ASSERTIBLE_);
        register_api_predefined_function($sym349$CYCL_EXPRESSION_);
        register_api_predefined_function($sym350$CYCL_FORMULA_);
        register_api_predefined_function($sym351$CYCL_GAF_ASSERTION_);
        register_api_predefined_function($sym352$CYCL_INDEXED_TERM_);
        register_api_predefined_function($sym353$CYCL_NL_SEMANTIC_ASSERTION_);
        register_api_predefined_function($sym354$CYCL_NON_ATOMIC_REIFIED_TERM_);
        register_api_predefined_function($sym355$CYCL_NON_ATOMIC_TERM_ASKABLE_);
        register_api_predefined_function($sym356$CYCL_NON_ATOMIC_TERM_ASSERTIBLE_);
        register_api_predefined_function($sym357$CYCL_NON_ATOMIC_TERM_);
        register_api_predefined_function($sym358$CYCL_OPEN_DENOTATIONAL_TERM_);
        register_api_predefined_function($sym359$CYCL_OPEN_EXPRESSION_);
        register_api_predefined_function($sym360$CYCL_OPEN_FORMULA_);
        register_api_predefined_function($sym361$CYCL_OPEN_NON_ATOMIC_TERM_);
        register_api_predefined_function($sym362$CYCL_OPEN_SENTENCE_);
        register_api_predefined_function($sym363$CYCL_PROPOSITIONAL_SENTENCE_);
        register_api_predefined_function($sym364$CYCL_REFORMULATOR_RULE_);
        register_api_predefined_function($sym365$CYCL_REIFIABLE_DENOTATIONAL_TERM_);
        register_api_predefined_function($sym366$CYCL_REIFIABLE_NON_ATOMIC_TERM_);
        register_api_predefined_function($sym367$CYCL_REIFIED_DENOTATIONAL_TERM_);
        register_api_predefined_function(CYCL_REPRESENTED_ATOMIC_TERM_P);
        register_api_predefined_function($sym369$CYCL_REPRESENTED_TERM_);
        register_api_predefined_function($sym370$CYCL_RULE_ASSERTION_);
        register_api_predefined_function($sym371$CYCL_SENTENCE_ASKABLE_);
        register_api_predefined_function($sym372$CYCL_SENTENCE_ASSERTIBLE_);
        register_api_predefined_function($sym373$CYCL_SENTENCE_);
        register_api_predefined_function(CYCL_SUBL_SYMBOL_P);
        register_api_predefined_function(CYCL_UNBOUND_RELATION_FORMULA_P);
        register_api_predefined_function($sym376$CYCL_VAR_LIST_);
        register_api_predefined_function(CYCL_VARIABLE_P);
        register_api_predefined_function($sym378$CYCSECURE_SUB_SOFTWARE_OBJECTS_);
        register_api_predefined_function($sym379$CYCSECURE_VERSION_OF_SOFTWARE_);
        register_api_predefined_function($sym380$GAF_);
        register_api_predefined_function(GEN_TEMPLATE_RECIPE_P);
        register_api_predefined_function(GENERATE_NAMES_FOR_TERM);
        register_api_predefined_function(GENERATE_PHRASE_DEFN);
        register_api_predefined_function(HL_EXTERNAL_ID_STRING_P);
        register_api_predefined_function($sym385$IBQE_);
        register_api_predefined_function(INTEGERP);
        register_api_predefined_function(KEYWORDP);
        register_api_predefined_function($sym388$KWTE_);
        register_api_predefined_function(LISTP);
        register_api_predefined_function($sym390$MONAD_CYCL_MT_);
        register_api_predefined_function($sym391$NON_NEGATIVE_SCALAR_INTERVAL_);
        register_api_predefined_function($sym392$POSITIVE_SCALAR_INTERVAL_);
        register_api_predefined_function(PRE_REMOVE_DEFINITE_ARTICLE_FROM_STRING);
        register_api_predefined_function(RTP_SYNTACTIC_CONSTRAINT);
        register_api_predefined_function($sym395$SCALAR_POINT_VALUE_);
        register_api_predefined_function($sym396$STRING_W_O_CONTROL_CHARS_);
        register_api_predefined_function(STRINGP);
        register_api_predefined_function(SUBL_NON_VARIABLE_NON_KEYWORD_SYMBOL_P);
        register_api_predefined_function(SYMBOLP);
        register_api_predefined_function(TEMPORAL_DIMENSION_MT_P);
        register_api_predefined_function(TRUE);
        register_api_predefined_function(URL_P);
        {
            SubLObject cdolist_list_var = $list_alt403;
            SubLObject symbol = NIL;
            for (symbol = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , symbol = cdolist_list_var.first()) {
                register_api_predefined_function(symbol);
            }
        }
        return NIL;
    }

    public static SubLObject setup_eval_in_api_registrations_file() {
        if (SubLFiles.USE_V1) {
            eval_in_api.register_api_immutable_global($null_output$);
            eval_in_api.register_api_mutable_global($it_verbose$);
            eval_in_api.register_api_mutable_global($progress_note$);
            eval_in_api.register_api_mutable_global($progress_sofar$);
            eval_in_api.register_api_mutable_global($progress_start_time$);
            eval_in_api.register_api_mutable_global($progress_total$);
            eval_in_api.register_api_mutable_global($eval_with_bindings$);
            eval_in_api.register_api_mutable_global($error_output$);
            eval_in_api.register_api_mutable_global($standard_output$);
            eval_in_api.register_api_mutable_global($continue_cerrorP$);
            eval_in_api.register_api_mutable_global($silent_progressP$);
            eval_in_api.register_api_mutable_global($ignore_breaksP$);
            eval_in_api.register_api_mutable_global($ignore_warnsP$);
            eval_in_api.register_api_mutable_global($eval_in_api_trace_log$);
            eval_in_api.register_api_mutable_global($eval_in_api_traced_fns$);
            eval_in_api.register_api_mutable_global($eval_in_api_env$);
            eval_in_api.register_api_mutable_global($api_output_protocol$);
            eval_in_api.register_api_mutable_global($api_result_method$);
            eval_in_api.register_api_mutable_global($api_input_protocol$);
            eval_in_api.register_api_mutable_global($ke_purpose$);
            eval_in_api.register_api_mutable_global($the_cyclist$);
            eval_in_api.register_api_mutable_global($use_local_queueP$);
            eval_in_api.register_api_mutable_global($relevant_mt_function$);
            eval_in_api.register_api_mutable_global($cyc_bookkeeping_info$);
            eval_in_api.register_api_mutable_global($suppress_sbhl_recachingP$);
            eval_in_api.register_api_mutable_global($paraphrase_precision$);
            eval_in_api.register_api_mutable_global($eval_in_api_level$);
            eval_in_api.register_api_mutable_global($suspend_sbhl_type_checkingP$);
            eval_in_api.register_api_mutable_global($require_case_insensitive_name_uniqueness$);
            eval_in_api.register_api_mutable_global($task_processor_verbosity$);
            register_api_predefined_macro(BQ_APPEND);
            register_api_predefined_macro(BQ_LIST);
            register_api_predefined_macro($sym32$BQ_LIST_);
            register_api_predefined_macro(BQ_NCONC);
            register_api_predefined_macro(BQ_VECTOR_APPEND);
            register_api_predefined_macro(API_BQ_LIST);
            register_api_predefined_macro(CDESTRUCTURING_BIND);
            register_api_predefined_macro(WITH_PRECISE_PARAPHRASE_ON);
            register_api_predefined_macro(WITH_PARAPHRASE_PRECISION);
            register_api_predefined_macro(WITH_BOOKKEEPING_INFO);
            register_api_predefined_macro(WITH_MT_FUNCTION);
            register_api_predefined_macro(WITH_GENL_MTS);
            register_api_predefined_macro(WITH_INFERENCE_MT_RELEVANCE);
            register_api_predefined_macro(WITH_ALL_MTS);
            register_api_predefined_macro(DO_PREDICATE_RULE_INDEX);
            register_api_predefined_macro(DO_RULE_INDEX);
            register_api_predefined_macro(WITHOUT_WFF_SEMANTICS);
            register_api_predefined_macro(CDOLIST_DONE);
            register_api_predefined_macro(DO_DICTIONARY);
            register_api_predefined_macro(PROGRESS_CDOTIMES);
            register_api_predefined_macro(DO_KB_SUID_TABLE);
            register_api_predefined_macro(DO_ID_INDEX);
            register_api_predefined_macro(OLD_DO_ID_INDEX);
            register_api_predefined_macro(NEW_DO_ID_INDEX);
            register_api_predefined_macro(DO_CONSTANTS);
            register_api_predefined_macro(CWITH_OUTPUT_TO_STRING);
            register_api_predefined_macro(WITH_INPUT_FROM_STRING);
            register_api_predefined_macro(DO_VECTOR_INDEX);
            register_api_predefined_macro(IN_MT);
            register_api_predefined_macro(DO_ITERATOR_WITHOUT_VALUES_PROGRESS);
            register_api_predefined_host_macro(WITH_OPEN_STREAM);
            register_api_predefined_host_macro(WITH_OPEN_FILE);
            register_api_predefined_host_macro(WITH_TCP_CONNECTION);
            SubLObject cdolist_list_var = $sublisp_api_predefined_functions$.getGlobalValue();
            SubLObject symbol = NIL;
            symbol = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                register_api_predefined_function(symbol);
                cdolist_list_var = cdolist_list_var.rest();
                symbol = cdolist_list_var.first();
            } 
            cdolist_list_var = $list65;
            symbol = NIL;
            symbol = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                register_api_predefined_function(symbol);
                cdolist_list_var = cdolist_list_var.rest();
                symbol = cdolist_list_var.first();
            } 
            cdolist_list_var = $list66;
            symbol = NIL;
            symbol = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                register_api_predefined_function(symbol);
                cdolist_list_var = cdolist_list_var.rest();
                symbol = cdolist_list_var.first();
            } 
            register_api_predefined_function(STRING_TO_GUID);
            register_api_predefined_function(GUID_TO_STRING);
            register_api_predefined_function(REMOVE_DUPLICATES);
            register_api_predefined_function(NEW_BOOKKEEPING_INFO);
            register_api_predefined_function(STRING_SUBSTITUTE);
            register_api_predefined_function(GENERATE_PHRASE);
            register_api_predefined_function(THE_DATE);
            register_api_predefined_function(THE_SECOND);
            register_api_predefined_function(ISA);
            register_api_predefined_function(GENLS);
            register_api_predefined_function($sym77$WHY_COLLECTIONS_INTERSECT_);
            register_api_predefined_function(ARG1_FORMAT);
            register_api_predefined_function(ARG2_FORMAT);
            register_api_predefined_function(SPECS);
            register_api_predefined_function(COLLECTION_LEAVES);
            register_api_predefined_function(SIMPLE_INDEXED_TERM_P);
            register_api_predefined_function(MAX_SPECS);
            register_api_predefined_function(MIN_ISA);
            register_api_predefined_function(LOCAL_DISJOINT_WITH);
            register_api_predefined_function($sym86$DISJOINT_WITH_);
            register_api_predefined_function(GENL_SIBLINGS);
            register_api_predefined_function(SPEC_SIBLINGS);
            register_api_predefined_function(ARG1_ISA);
            register_api_predefined_function(ARG2_ISA);
            register_api_predefined_function(ARGN_ISA);
            register_api_predefined_function(ARGN_ISA);
            register_api_predefined_function(ARGN_GENL);
            register_api_predefined_function(ALL_GENLS_IN_ANY_MT);
            register_api_predefined_function(ALL_ISA_IN_ANY_MT);
            register_api_predefined_function(ALL_FORT_INSTANCES_IN_ALL_MTS);
            register_api_predefined_function($sym96$ISA_IN_ANY_MT_);
            register_api_predefined_function($sym97$GENL_IN_ANY_MT_);
            register_api_predefined_function(NEW_CONSTANT_NAME_SPEC_P);
            register_api_predefined_function(DO_RULE_INDEX_RULES);
            register_api_predefined_function(BT_LOWER);
            register_api_predefined_function(BT_HIGHER);
            register_api_predefined_function(SAMPLE_LEAF_SPECS);
            register_api_predefined_function($sym103$TACIT_COEXTENSIONAL_);
            register_api_predefined_function($sym104$EL_WFF_);
            register_api_predefined_function($sym105$EVALUATABLE_PREDICATE_);
            register_api_predefined_function($sym106$HIERARCHICAL_COLLECTIONS_);
            register_api_predefined_function(NUM_BEST_GAF_LOOKUP_INDEX);
            register_api_predefined_function(API_QUIT);
            register_api_predefined_function(NART_P);
            register_api_predefined_function(EL_VARIABLE_P);
            register_api_predefined_function(PPH_PRECISION_P);
            register_api_predefined_function(FORT_FOR_STRING);
            register_api_predefined_function($sym113$RTP_PARSE_EXP_W_VPP);
            register_api_predefined_function(GET_UNIVERSAL_TIME);
            register_api_predefined_function(DECODE_UNIVERSAL_TIME);
            register_api_predefined_function(FIND_NART);
            register_api_predefined_function(CONSTANT_GUID);
            register_api_predefined_function(RKF_PHRASE_READER);
            register_api_predefined_function(GENERATE_DISAMBIGUATION_PHRASES_AND_TYPES);
            register_api_predefined_function(LOAD_TRANSCRIPT_FILE);
            register_api_predefined_function(KB_STATISTICS);
            register_api_predefined_function($sym122$GENL_MT_);
            register_api_predefined_function(ALL_SPEC_MTS);
            register_api_predefined_function(REMOVAL_ASK);
            register_api_predefined_function(DO_NARTS_TABLE);
            register_api_predefined_function(ID_INDEX_COUNT);
            register_api_predefined_function(ID_INDEX_DENSE_OBJECTS);
            register_api_predefined_function(ID_INDEX_EMPTY_P);
            register_api_predefined_function(ID_INDEX_SPARSE_ID_THRESHOLD);
            register_api_predefined_function(ID_INDEX_NEXT_ID);
            register_api_predefined_function(CYCL_NART_P);
            register_api_predefined_function(CYCL_NAUT_P);
            register_api_predefined_function(RESOLVE_NEW_CONSTANTS);
            register_api_predefined_function(CYC_OPENCYC_FEATURE);
            register_api_predefined_function(CYC_RESEARCHCYC_FEATURE);
            register_api_predefined_function(CANONICALIZE_HLMT);
            register_api_predefined_function(NEW_CYC_QUERY);
            register_api_predefined_function(REGISTER_SOLELY_SPECIFIC_REMOVAL_MODULE_PREDICATE);
            register_api_predefined_function(INFERENCE_REMOVAL_MODULE);
            register_api_predefined_function(UNDECLARE_INFERENCE_REMOVAL_MODULE);
            cdolist_list_var = $list141;
            symbol = NIL;
            symbol = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                register_api_predefined_function(symbol);
                cdolist_list_var = cdolist_list_var.rest();
                symbol = cdolist_list_var.first();
            } 
            cdolist_list_var = $list142;
            symbol = NIL;
            symbol = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                register_api_predefined_function(symbol);
                cdolist_list_var = cdolist_list_var.rest();
                symbol = cdolist_list_var.first();
            } 
            cdolist_list_var = $list143;
            symbol = NIL;
            symbol = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                register_api_predefined_function(symbol);
                cdolist_list_var = cdolist_list_var.rest();
                symbol = cdolist_list_var.first();
            } 
            cdolist_list_var = $list144;
            symbol = NIL;
            symbol = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                register_api_predefined_function(symbol);
                cdolist_list_var = cdolist_list_var.rest();
                symbol = cdolist_list_var.first();
            } 
            cdolist_list_var = $list145;
            symbol = NIL;
            symbol = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                register_api_predefined_function(symbol);
                cdolist_list_var = cdolist_list_var.rest();
                symbol = cdolist_list_var.first();
            } 
            cdolist_list_var = $list146;
            symbol = NIL;
            symbol = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                register_api_predefined_function(symbol);
                cdolist_list_var = cdolist_list_var.rest();
                symbol = cdolist_list_var.first();
            } 
            cdolist_list_var = $list147;
            symbol = NIL;
            symbol = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                register_api_predefined_function(symbol);
                cdolist_list_var = cdolist_list_var.rest();
                symbol = cdolist_list_var.first();
            } 
            cdolist_list_var = $list148;
            symbol = NIL;
            symbol = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                register_api_predefined_function(symbol);
                cdolist_list_var = cdolist_list_var.rest();
                symbol = cdolist_list_var.first();
            } 
            cdolist_list_var = $list149;
            symbol = NIL;
            symbol = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                register_api_predefined_macro(symbol);
                cdolist_list_var = cdolist_list_var.rest();
                symbol = cdolist_list_var.first();
            } 
            cdolist_list_var = $list150;
            symbol = NIL;
            symbol = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                eval_in_api.register_api_mutable_global(symbol);
                cdolist_list_var = cdolist_list_var.rest();
                symbol = cdolist_list_var.first();
            } 
            register_external_symbol($sym151$__);
            cdolist_list_var = $list152;
            symbol = NIL;
            symbol = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                register_api_predefined_function(symbol);
                cdolist_list_var = cdolist_list_var.rest();
                symbol = cdolist_list_var.first();
            } 
            cdolist_list_var = $api_host_access_functions$.getGlobalValue();
            symbol = NIL;
            symbol = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                register_api_predefined_host_function(symbol);
                cdolist_list_var = cdolist_list_var.rest();
                symbol = cdolist_list_var.first();
            } 
            register_api_predefined_function(PHRASE_FOR_MT);
            register_api_predefined_function(NOTING_PROGRESS);
            register_api_predefined_function(NOTE_PROGRESS);
            register_api_predefined_function(NEW_ALEXANDRIA_ITERATOR);
            register_api_predefined_function(ALEXANDRIA_KB_STORE_ITERATOR_DONE);
            register_api_predefined_function(ALEXANDRIA_KB_STORE_ITERATOR_FINALIZE);
            register_api_predefined_function(COUNT_ALEXANDRIA_GAFS_MATCHING_FORMULA);
            register_api_predefined_function(COUNT_ALEXANDRIA_GAFS_MATCHING_FORMULA_RELEVANT_MT_AND_PRED);
            register_api_predefined_function(CREATE_ALEXANDRIA_GAFS_MATCHING_FORMULA_ITERATOR_STATE);
            register_api_predefined_function(NEW_ALEXANDRIA_GAFS_MATCHING_FORMULA_ITERATOR);
            register_api_predefined_function($sym164$CREATE_ALEXANDRIA_GAFS_MATCHING_FORMULA_RELEVANT_MT_AND_PRED_ITER);
            register_api_predefined_function($sym165$NEW_ALEXANDRIA_GAFS_MATCHING_FORMULA_RELEVANT_MT_AND_PRED_ITERATO);
            register_api_predefined_function(CREATE_ALEXANDRIA_NATS_MATCHING_FORMULA_ITERATOR);
            register_api_predefined_function(NEW_ALEXANDRIA_NATS_MATCHING_FORMULA_ITERATOR);
            register_api_predefined_function(COUNT_ALEXANDRIA_NATS_MATCHING_FORMULA);
            register_api_predefined_function(COUNT_ALEXANDRIA_REIFIABLE_FUNCTION_EXTENT);
            register_api_predefined_function(CREATE_ALEXANDRIA_REIFIABLE_FUNCTION_EXTENT_ITERATOR_STATE);
            register_api_predefined_function(NEW_ALEXANDRIA_REIFIABLE_FUNCTION_EXTENT_ITERATOR);
            register_api_predefined_function(CREATE_ALEXANDRIA_ALL_FORTS_ITERATOR_STATE);
            register_api_predefined_function(NEW_ALEXANDRIA_ALL_FORTS_ITERATOR);
            register_api_predefined_function(CREATE_ALEXANDRIA_ALL_GAFS_ITERATOR_STATE);
            register_api_predefined_function(NEW_ALEXANDRIA_ALL_GAFS_ITERATOR);
            register_api_predefined_function(CREATE_ALEXANDRIA_ALL_RULES_ITERATOR_STATE);
            register_api_predefined_function(NEW_ALEXANDRIA_ALL_RULES_ITERATOR);
            register_api_predefined_function(CREATE_ALEXANDRIA_ALL_UNBOUND_RULES_ITERATOR_STATE);
            register_api_predefined_function(NEW_ALEXANDRIA_ALL_UNBOUND_RULES_ITERATOR);
            register_api_predefined_function(CREATE_ALEXANDRIA_ALL_UNBOUND_RULES_RELEVANT_MT_ITERATOR_STATE);
            register_api_predefined_function(NEW_ALEXANDRIA_ALL_UNBOUND_RULES_RELEVANT_MT_ITERATOR);
            register_api_predefined_function(CREATE_ALEXANDRIA_ALL_ASSERTIONS_ITERATOR_STATE);
            register_api_predefined_function(NEW_ALEXANDRIA_ALL_ASSERTIONS_ITERATOR);
            register_api_predefined_function(CREATE_ALEXANDRIA_ALL_BIG_INTEGERS_ITERATOR_STATE);
            register_api_predefined_function(NEW_ALEXANDRIA_ALL_BIG_INTEGERS_ITERATOR);
            register_api_predefined_function(CREATE_ALEXANDRIA_ALL_INTEGERS_ITERATOR_STATE);
            register_api_predefined_function(NEW_ALEXANDRIA_ALL_INTEGERS_ITERATOR);
            register_api_predefined_function(CREATE_ALEXANDRIA_ALL_BOOKKEEPING_GAFS_ITERATOR_STATE);
            register_api_predefined_function(NEW_ALEXANDRIA_ALL_BOOKKEEPING_GAFS_ITERATOR);
            register_api_predefined_function(CREATE_ALEXANDRIA_ALL_CONSTANTS_ITERATOR_STATE);
            register_api_predefined_function(NEW_ALEXANDRIA_ALL_CONSTANTS_ITERATOR);
            register_api_predefined_function(CREATE_ALEXANDRIA_ALL_NARTS_ITERATOR_STATE);
            register_api_predefined_function(NEW_ALEXANDRIA_ALL_NARTS_ITERATOR);
            register_api_predefined_function(CREATE_ALEXANDRIA_ALL_DEDUCTIONS_ITERATOR_STATE);
            register_api_predefined_function(NEW_ALEXANDRIA_ALL_DEDUCTIONS_ITERATOR);
            register_api_predefined_function(CREATE_ALEXANDRIA_ALL_FLOATS_ITERATOR_STATE);
            register_api_predefined_function(NEW_ALEXANDRIA_ALL_FLOATS_ITERATOR);
            register_api_predefined_function(CREATE_ALEXANDRIA_ALL_FORMULAS_ITERATOR_STATE);
            register_api_predefined_function(NEW_ALEXANDRIA_ALL_FORMULAS_ITERATOR);
            register_api_predefined_function(CREATE_ALEXANDRIA_ALL_HL_SUPPORTS_ITERATOR_STATE);
            register_api_predefined_function(NEW_ALEXANDRIA_ALL_HL_SUPPORTS_ITERATOR);
            register_api_predefined_function(CREATE_ALEXANDRIA_ALL_KB_HL_SUPPORTS_ITERATOR_STATE);
            register_api_predefined_function(NEW_ALEXANDRIA_ALL_KB_HL_SUPPORTS_ITERATOR);
            register_api_predefined_function(CREATE_ALEXANDRIA_ALL_ITEMS_ITERATOR_STATE);
            register_api_predefined_function(NEW_ALEXANDRIA_ALL_ITEMS_ITERATOR);
            register_api_predefined_function(CREATE_ALEXANDRIA_ALL_STRINGS_ITERATOR_STATE);
            register_api_predefined_function(NEW_ALEXANDRIA_ALL_STRINGS_ITERATOR);
            register_api_predefined_function(CREATE_ALEXANDRIA_ALL_NUMBERS_ITERATOR_STATE);
            register_api_predefined_function(NEW_ALEXANDRIA_ALL_NUMBERS_ITERATOR);
            register_api_predefined_function(CREATE_ALEXANDRIA_ALL_SUBL_EXPRESSIONS_ITERATOR_STATE);
            register_api_predefined_function(NEW_ALEXANDRIA_ALL_SUBL_EXPRESSIONS_ITERATOR);
            register_api_predefined_function(CREATE_ALEXANDRIA_ALL_VARIABLES_ITERATOR_STATE);
            register_api_predefined_function(NEW_ALEXANDRIA_ALL_VARIABLES_ITERATOR);
            register_api_predefined_function(CREATE_ALEXANDRIA_ALL_UNREPRESENTED_TERMS_ITERATOR_STATE);
            register_api_predefined_function(NEW_ALEXANDRIA_ALL_UNREPRESENTED_TERMS_ITERATOR);
            register_api_predefined_function(CREATE_ALEXANDRIA_TERM_ASSERTIONS_ITERATOR_STATE);
            register_api_predefined_function(NEW_ALEXANDRIA_TERM_ASSERTIONS_ITERATOR);
            register_api_predefined_function(COUNT_ALEXANDRIA_TERM_ASSERTIONS);
            register_api_predefined_function(CREATE_ALEXANDRIA_TERM_ASSERTIONS_RELEVANT_MT_PRED_ITERATOR_STATE);
            register_api_predefined_function(NEW_ALEXANDRIA_TERM_ASSERTIONS_RELEVANT_MT_PRED_ITERATOR);
            register_api_predefined_function(COUNT_ALEXANDRIA_TERM_ASSERTIONS_RELEVANT_MT_PRED);
            register_api_predefined_function(CREATE_ALEXANDRIA_GAF_ARG0_ITERATOR_STATE);
            register_api_predefined_function(NEW_ALEXANDRIA_GAF_ARG0_ITERATOR);
            register_api_predefined_function(COUNT_ALEXANDRIA_GAF_ARG0);
            register_api_predefined_function(CREATE_ALEXANDRIA_GAF_ARG0_RELEVANT_MT_ITERATOR_STATE);
            register_api_predefined_function(NEW_ALEXANDRIA_GAF_ARG0_ITERATOR_RELEVANT_MT);
            register_api_predefined_function(COUNT_ALEXANDRIA_GAF_ARG0_RELEVANT_MT);
            register_api_predefined_function(CREATE_ALEXANDRIA_GAF_ARGITERATOR_STATE);
            register_api_predefined_function(NEW_ALEXANDRIA_GAF_ARG_ITERATOR);
            register_api_predefined_function(CREATE_ALEXANDRIA_GAF_ARG_RELEVANT_MT_AND_PRED_ITERATOR_STATE);
            register_api_predefined_function(NEW_ALEXANDRIA_GAF_ARG_RELEVANT_MT_AND_PRED_ITERATOR);
            register_api_predefined_function(COUNT_ALEXANDRIA_GAF_ARG_RELEVANT_MT_AND_PRED);
            register_api_predefined_function(COUNT_ALEXANDRIA_GAF_ARG);
            register_api_predefined_function(NEW_ALEXANDRIA_GAF_ARG_ARG_RELEVANT_MT_AND_PRED_ITERATOR);
            register_api_predefined_function(CREATE_ALEXANDRIA_GAF_ARG_ARG_RELEVANT_MT_AND_PRED_ITERATOR_STATE);
            register_api_predefined_function(COUNT_ALEXANDRIA_GAF_ARG_ARG_RELEVANT_MT_AND_PRED);
            register_api_predefined_function(CREATE_ALEXANDRIA_MT_CONTENTS_ITERATOR_STATE_RELEVANT_PRED);
            register_api_predefined_function(NEW_ALEXANDRIA_MT_CONTENTS_ITERATOR_RELEVANT_PRED);
            register_api_predefined_function(COUNT_ALEXANDRIA_MT_CONTENTS_RELEVANT_PRED);
            register_api_predefined_function(CREATE_ALEXANDRIA_MT_CONTENTS_ITERATOR_STATE_RELEVANT_PRED);
            register_api_predefined_function(NEW_ALEXANDRIA_MT_CONTENTS_ITERATOR_RELEVANT_PRED);
            register_api_predefined_function(COUNT_ALEXANDRIA_MT_CONTENTS_RELEVANT_PRED);
            register_api_predefined_function(CREATE_ALEXANDRIA_MT_CONTENTS_ITERATOR_STATE);
            register_api_predefined_function(NEW_ALEXANDRIA_MT_CONTENTS_ITERATOR);
            register_api_predefined_function(COUNT_ALEXANDRIA_MT_CONTENTS);
            register_api_predefined_function(CREATE_ALEXANDRIA_RULES_WITH_PRED_ITERATOR_STATE);
            register_api_predefined_function(NEW_ALEXANDRIA_RULES_WITH_PRED_ITERATOR);
            register_api_predefined_function(COUNT_ALEXANDRIA_RULES_WITH_PRED);
            register_api_predefined_function(CREATE_ALEXANDRIA_RULES_WITH_PRED_RELEVANT_MT_ITERATOR_STATE);
            register_api_predefined_function(NEW_ALEXANDRIA_RULES_WITH_PRED_RELEVANT_MT_ITERATOR);
            register_api_predefined_function(COUNT_ALEXANDRIA_RULES_WITH_PRED_RELEVANT_MT);
            register_api_predefined_function(CREATE_ALEXANDRIA_RULES_WITH_PRED_AND_ARG2_ITERATOR_STATE);
            register_api_predefined_function(NEW_ALEXANDRIA_RULES_WITH_PRED_AND_ARG2_ITERATOR);
            register_api_predefined_function(COUNT_ALEXANDRIA_RULES_WITH_PRED_AND_ARG2);
            register_api_predefined_function($sym252$CREATE_ALEXANDRIA_RULES_WITH_PRED_AND_ARG2_RELEVANT_MT_ITERATOR_S);
            register_api_predefined_function(NEW_ALEXANDRIA_RULES_WITH_PRED_AND_ARG2_RELEVANT_MT_ITERATOR);
            register_api_predefined_function(COUNT_ALEXANDRIA_RULES_WITH_PRED_AND_ARG2_RELEVANT_MT);
            register_api_predefined_function(CREATE_ALEXANDRIA_NESTED_FORMULA_RULES_RELEVANT_MT_ITERATOR_STATE);
            register_api_predefined_function(NEW_ALEXANDRIA_NESTED_FORMULA_RULES_RELEVANT_MT_ITERATOR);
            register_api_predefined_function(COUNT_ALEXANDRIA_NESTED_FORMULA_RULES_RELEVANT_MT);
            register_api_predefined_function(CREATE_ALEXANDRIA_FUNCTION_EXTENT_ITERATOR_STATE);
            register_api_predefined_function(NEW_ALEXANDRIA_FUNCTION_EXTENT_ITERATOR);
            register_api_predefined_function(COUNT_ALEXANDRIA_NART_ARG_INDEX);
            register_api_predefined_function(CREATE_ALEXANDRIA_NART_ARG_INDEX_ITERATOR_STATE);
            register_api_predefined_function(NEW_ALEXANDRIA_NART_ARG_INDEX_ITERATOR);
            register_api_predefined_function(BEST_STRING_OF_NL_PHRASE_DEFN);
            register_api_predefined_function(CYC_1_BYTE_INTEGER);
            register_api_predefined_function(CYC_2_BYTE_INTEGER);
            register_api_predefined_function(CYC_4_BYTE_INTEGER);
            register_api_predefined_function(CYC_8_BYTE_INTEGER);
            register_api_predefined_function(CYC_ABSOLUTE_VALUE);
            register_api_predefined_function(CYC_ADD_ENGLISH_SUFFIX);
            register_api_predefined_function(CYC_ARC_COSECANT);
            register_api_predefined_function(CYC_ARC_COSINE);
            register_api_predefined_function(CYC_ARC_COTANGENT);
            register_api_predefined_function(CYC_ARC_SECANT);
            register_api_predefined_function(CYC_ARC_SINE);
            register_api_predefined_function(CYC_ARC_TANGENT);
            register_api_predefined_function(CYC_ASCII_STRING_P);
            register_api_predefined_function(CYC_AVERAGE);
            register_api_predefined_function(CYC_BIT_DATATYPE);
            register_api_predefined_function(CYC_COLLECTION_DENOTING_UNARY_FUNCTION_FOR);
            register_api_predefined_function(CYC_COSECANT);
            register_api_predefined_function(CYC_COSINE);
            register_api_predefined_function(CYC_COTANGENT);
            register_api_predefined_function(CYC_DATE_AFTER);
            register_api_predefined_function(CYC_DATE_BEFORE);
            register_api_predefined_function(CYC_DATE_DECODE_STRING);
            register_api_predefined_function(CYC_DATE_ENCODE_STRING);
            register_api_predefined_function(CYC_DATE_FROM_INTEGER);
            register_api_predefined_function(CYC_DATE_FROM_STRING);
            register_api_predefined_function(CYC_DATE_SUBSUMES);
            register_api_predefined_function(CYC_DAY_OF_DATE);
            register_api_predefined_function(CYC_DAY_OF_WEEK_AFTER_DATE);
            register_api_predefined_function(CYC_DAY_OF_WEEK_AFTER_DATE_INCLUSIVE);
            register_api_predefined_function(CYC_DAY_OF_WEEK_DEFN);
            register_api_predefined_function(CYC_DAY_OF_WEEK_OF_DATE);
            register_api_predefined_function(CYC_DAY_OF_WEEK_PRIOR_TO_DATE);
            register_api_predefined_function(CYC_DAY_OF_WEEK_PRIOR_TO_DATE_INCLUSIVE);
            register_api_predefined_function(CYC_DIFFERENCE);
            register_api_predefined_function(CYC_DIFFERENT);
            register_api_predefined_function(CYC_DIFFERENT_SYMBOLS);
            register_api_predefined_function(CYC_EVALUATE_SUBL);
            register_api_predefined_function(CYC_EVEN_NUMBER);
            register_api_predefined_function(CYC_EXP);
            register_api_predefined_function(CYC_EXPONENT);
            register_api_predefined_function(CYC_EXTENDED_NUMBER_P);
            register_api_predefined_function(CYC_GREATER_THAN);
            register_api_predefined_function(CYC_GREATER_THAN_OR_EQUAL_TO);
            register_api_predefined_function(CYC_GROUND_TERM);
            register_api_predefined_function(CYC_GUID_STRING_P);
            register_api_predefined_function(CYC_HTTP_URL_ENCODE);
            register_api_predefined_function(CYC_IDENTITY);
            register_api_predefined_function(CYC_INDEXICAL_REFERENT);
            register_api_predefined_function(CYC_INDIVIDUAL_DENOTING_UNARY_FUNCTION_FOR);
            register_api_predefined_function(CYC_INDIVIDUAL_NECESSARY);
            register_api_predefined_function(CYC_INTEGER);
            register_api_predefined_function(CYC_INTEGER_RANGE);
            register_api_predefined_function(CYC_INTEGER_RANGE);
            register_api_predefined_function(CYC_INTEGER_TO_STRING);
            register_api_predefined_function(CYC_INTERVAL_ENDED_BY_LAST_SUBINTERVAL_OF_TYPE);
            register_api_predefined_function(CYC_INTERVAL_STARTED_BY_FIRST_SUBINTERVAL_OF_TYPE);
            register_api_predefined_function(CYC_INVERSE);
            register_api_predefined_function(CYC_IP4_ADDRESS);
            register_api_predefined_function(CYC_IP4_NETWORK_ADDRESS);
            register_api_predefined_function(CYC_LATER_THAN);
            register_api_predefined_function(CYC_LESS_THAN);
            register_api_predefined_function(CYC_LESS_THAN_OR_EQUAL_TO);
            register_api_predefined_function(CYC_LIST_CONCATENATE);
            register_api_predefined_function(CYC_LIST_FIRST);
            register_api_predefined_function(CYC_LIST_LAST);
            register_api_predefined_function(CYC_LIST_LENGTH);
            register_api_predefined_function(CYC_LIST_MEMBER_SET);
            register_api_predefined_function(CYC_LIST_NTH);
            register_api_predefined_function(CYC_LIST_OF_TYPE_NECESSARY);
            register_api_predefined_function(CYC_LIST_OF_TYPE_SUFFICIENT);
            register_api_predefined_function(CYC_LIST_REST);
            register_api_predefined_function(CYC_LIST_REVERSE);
            register_api_predefined_function(CYC_LIST_SEARCH);
            register_api_predefined_function(CYC_LIST_SUBSEQ);
            register_api_predefined_function(CYC_LIST_WITHOUT_REPETITION);
            register_api_predefined_function(CYC_LOG);
            register_api_predefined_function(CYC_LOGARITHM);
            register_api_predefined_function(CYC_MAKE_FORMULA);
            register_api_predefined_function(CYC_MAP_FUNCTION_OVER_LIST);
            register_api_predefined_function(CYC_MAX_RANGE);
            register_api_predefined_function(CYC_MAXIMUM);
            register_api_predefined_function(CYC_MIN_RANGE);
            register_api_predefined_function(CYC_MINIMUM);
            register_api_predefined_function(CYC_MINUS);
            register_api_predefined_function(CYC_NEGATIVE_INTEGER);
            register_api_predefined_function(CYC_NEGATIVE_NUMBER);
            register_api_predefined_function(CYC_NEXT_ITERATED_CYCLIC_INTERVAL);
            register_api_predefined_function(CYC_NON_NEGATIVE_INTEGER);
            register_api_predefined_function(CYC_NON_NEGATIVE_NUMBER);
            register_api_predefined_function(CYC_NON_POSITIVE_INTEGER);
            register_api_predefined_function(CYC_NON_POSITIVE_NUMBER);
            register_api_predefined_function(CYC_NTH_METRICALLY_PRECEDING_TIME_INTERVAL_OF_TYPE);
            register_api_predefined_function(CYC_NTH_METRICALLY_SUCCEEDING_TIME_INTERVAL_OF_TYPE);
            register_api_predefined_function(CYC_NUMBER_STRING);
            register_api_predefined_function(CYC_NUMERAL_STRING);
            register_api_predefined_function(CYC_NUMERIC_STRING_NECESSARY);
            register_api_predefined_function(CYC_NUMERICALLY_EQUAL);
            register_api_predefined_function(CYC_ODD_NUMBER);
            register_api_predefined_function(CYC_PERCENT);
            register_api_predefined_function(CYC_PLUS);
            register_api_predefined_function(CYC_PLUS_ALL);
            register_api_predefined_function(CYC_POSITION);
            register_api_predefined_function(CYC_POSITIVE_INTEGER);
            register_api_predefined_function(CYC_POSITIVE_NUMBER);
            register_api_predefined_function(CYC_POST_REMOVE);
            register_api_predefined_function(CYC_PRE_REMOVE);
            register_api_predefined_function(CYC_PREFIX_SUBSTRING);
            register_api_predefined_function($sym370$CYC_PRIME_NUMBER_);
            register_api_predefined_function(CYC_QUANTITY_CONVERSION);
            register_api_predefined_function(CYC_QUANTITY_INTERSECTS);
            register_api_predefined_function(CYC_QUANTITY_SUBSUMES);
            register_api_predefined_function(CYC_QUOTIENT);
            register_api_predefined_function(CYC_RATIONAL_NUMBER);
            register_api_predefined_function(CYC_REAL_0_1);
            register_api_predefined_function(CYC_REAL_1_INFINITY);
            register_api_predefined_function(CYC_REAL_NUMBER);
            register_api_predefined_function(CYC_RECAPITALIZE_SMART);
            register_api_predefined_function(CYC_RELATION_ARG);
            register_api_predefined_function(CYC_RELATION_ARG_SET);
            register_api_predefined_function(CYC_RELATION_ARGS_LIST);
            register_api_predefined_function(CYC_RELATION_EXPRESSION_ARITY);
            register_api_predefined_function(CYC_REPLACE_SUBSTRING);
            register_api_predefined_function(CYC_ROUND_CLOSEST);
            register_api_predefined_function(CYC_ROUND_DOWN);
            register_api_predefined_function(CYC_ROUND_UP);
            register_api_predefined_function(CYC_SCIENTIFIC_NUMBER_FROM_STRING);
            register_api_predefined_function(CYC_SCIENTIFIC_NUMBER_FROM_SUBL_REAL);
            register_api_predefined_function(CYC_SCIENTIFIC_NUMBER_P);
            register_api_predefined_function(CYC_SCIENTIFIC_NUMBER_SIGNIFICANT_DIGIT_COUNT);
            register_api_predefined_function(CYC_SCIENTIFIC_NUMBER_TO_STRING);
            register_api_predefined_function(CYC_SCIENTIFIC_NUMBER_TO_SUBL_REAL);
            register_api_predefined_function(CYC_SECANT);
            register_api_predefined_function(CYC_SET_DIFFERENCE);
            register_api_predefined_function(CYC_SET_EXTENT);
            register_api_predefined_function(CYC_SET_OF_TYPE_NECESSARY);
            register_api_predefined_function(CYC_SET_OF_TYPE_SUFFICIENT);
            register_api_predefined_function(CYC_SIGNIFICANT_DIGITS);
            register_api_predefined_function(CYC_SINE);
            register_api_predefined_function(CYC_SKSI_SOURCE_ACCESSIBLE);
            register_api_predefined_function(CYC_SKSI_SOURCE_ACTIVATED);
            register_api_predefined_function(CYC_SKSI_SOURCE_QUERYABLE);
            register_api_predefined_function(CYC_SKSI_SOURCE_REGISTERED);
            register_api_predefined_function(CYC_SQRT);
            register_api_predefined_function(CYC_STRING_CONCAT);
            register_api_predefined_function(CYC_STRING_TO_INTEGER);
            register_api_predefined_function(CYC_STRING_TO_REAL_NUMBER);
            register_api_predefined_function(CYC_STRING_TOKENIZE_NEW);
            register_api_predefined_function(CYC_STRING_UPCASE);
            register_api_predefined_function(CYC_STRINGS_TO_PHRASE);
            register_api_predefined_function(CYC_SUBL_ESCAPE);
            register_api_predefined_function(CYC_SUBL_EXPRESSION);
            register_api_predefined_function(CYC_SUBL_TEMPLATE);
            register_api_predefined_function($sym415$CYC_SUBLIST_);
            register_api_predefined_function(CYC_SUBSTITUTE_FORMULA);
            register_api_predefined_function(CYC_SUBSTITUTE_FORMULA_ARG);
            register_api_predefined_function(CYC_SUBSTITUTE_FORMULA_ARG_POSITION);
            register_api_predefined_function(CYC_SUBSTRING);
            register_api_predefined_function(CYC_SUBSTRING_CASE_INSENSITIVE_PREDICATE);
            register_api_predefined_function(CYC_SUBSTRING_PREDICATE);
            register_api_predefined_function(CYC_SUBWORD_PREDICATE);
            register_api_predefined_function(CYC_SUFFIX_SUBSTRING);
            register_api_predefined_function(CYC_SYSTEM_ATOM);
            register_api_predefined_function(CYC_SYSTEM_CHARACTER_P);
            register_api_predefined_function(CYC_SYSTEM_INTEGER);
            register_api_predefined_function(CYC_SYSTEM_NON_VARIABLE_SYMBOL_P);
            register_api_predefined_function(CYC_SYSTEM_REAL_NUMBER_P);
            register_api_predefined_function(CYC_SYSTEM_STRING_P);
            register_api_predefined_function(CYC_SYSTEM_TERM_P);
            register_api_predefined_function(CYC_TANGENT);
            register_api_predefined_function(CYC_TIME_ELAPSED);
            register_api_predefined_function(CYC_TIME_ELAPSED_DECODE_STRING);
            register_api_predefined_function(CYC_TIME_ELAPSED_ENCODE_STRING);
            register_api_predefined_function(CYC_TIMES);
            register_api_predefined_function(CYC_TRIM_WHITESPACE);
            register_api_predefined_function(CYC_TRUE_SUBL);
            register_api_predefined_function(CYC_TYPES_MOST_OFTEN_ASSERTED_USING_TOOL);
            register_api_predefined_function(CYC_UNICODE_DENOTING_ASCII_STRING_P);
            register_api_predefined_function(CYC_ZIP_CODE_FIVE_DIGIT);
            register_api_predefined_function(CYC_ZIP_CODE_NINE_DIGIT);
            register_api_predefined_function($sym442$CYCL_ASSERTED_ASSERTION_);
            register_api_predefined_function($sym443$CYCL_ASSERTION_);
            register_api_predefined_function($sym444$CYCL_ATOMIC_ASSERTION_);
            register_api_predefined_function($sym445$CYCL_ATOMIC_SENTENCE_);
            register_api_predefined_function(CYCL_ATOMIC_TERM_P);
            register_api_predefined_function($sym447$CYCL_CLOSED_ATOMIC_SENTENCE_);
            register_api_predefined_function(CYCL_CLOSED_ATOMIC_TERM_P);
            register_api_predefined_function($sym449$CYCL_CLOSED_DENOTATIONAL_TERM_);
            register_api_predefined_function($sym450$CYCL_CLOSED_EXPRESSION_);
            register_api_predefined_function($sym451$CYCL_CLOSED_FORMULA_);
            register_api_predefined_function($sym452$CYCL_CLOSED_NON_ATOMIC_TERM_);
            register_api_predefined_function($sym453$CYCL_CLOSED_SENTENCE_);
            register_api_predefined_function(CYCL_CONSTANT_P);
            register_api_predefined_function($sym455$CYCL_DEDUCED_ASSERTION_);
            register_api_predefined_function(CYCL_DENOTATIONAL_TERM_P);
            register_api_predefined_function($sym457$CYCL_EXPRESSION_ASKABLE_);
            register_api_predefined_function($sym458$CYCL_EXPRESSION_ASSERTIBLE_);
            register_api_predefined_function($sym459$CYCL_EXPRESSION_);
            register_api_predefined_function($sym460$CYCL_FORMULA_);
            register_api_predefined_function($sym461$CYCL_GAF_ASSERTION_);
            register_api_predefined_function($sym462$CYCL_INDEXED_TERM_);
            register_api_predefined_function($sym463$CYCL_NL_SEMANTIC_ASSERTION_);
            register_api_predefined_function($sym464$CYCL_NON_ATOMIC_REIFIED_TERM_);
            register_api_predefined_function($sym465$CYCL_NON_ATOMIC_TERM_ASKABLE_);
            register_api_predefined_function($sym466$CYCL_NON_ATOMIC_TERM_ASSERTIBLE_);
            register_api_predefined_function($sym467$CYCL_NON_ATOMIC_TERM_);
            register_api_predefined_function($sym468$CYCL_OPEN_DENOTATIONAL_TERM_);
            register_api_predefined_function($sym469$CYCL_OPEN_EXPRESSION_);
            register_api_predefined_function($sym470$CYCL_OPEN_FORMULA_);
            register_api_predefined_function($sym471$CYCL_OPEN_NON_ATOMIC_TERM_);
            register_api_predefined_function($sym472$CYCL_OPEN_SENTENCE_);
            register_api_predefined_function($sym473$CYCL_PROPOSITIONAL_SENTENCE_);
            register_api_predefined_function($sym474$CYCL_REFORMULATOR_RULE_);
            register_api_predefined_function($sym475$CYCL_REIFIABLE_DENOTATIONAL_TERM_);
            register_api_predefined_function($sym476$CYCL_REIFIABLE_NON_ATOMIC_TERM_);
            register_api_predefined_function($sym477$CYCL_REIFIED_DENOTATIONAL_TERM_);
            register_api_predefined_function(CYCL_REPRESENTED_ATOMIC_TERM_P);
            register_api_predefined_function($sym479$CYCL_REPRESENTED_TERM_);
            register_api_predefined_function($sym480$CYCL_RULE_ASSERTION_);
            register_api_predefined_function($sym481$CYCL_SENTENCE_ASKABLE_);
            register_api_predefined_function($sym482$CYCL_SENTENCE_ASSERTIBLE_);
            register_api_predefined_function($sym483$CYCL_SENTENCE_);
            register_api_predefined_function(CYCL_SUBL_SYMBOL_P);
            register_api_predefined_function(CYCL_UNBOUND_RELATION_FORMULA_P);
            register_api_predefined_function($sym486$CYCL_VAR_LIST_);
            register_api_predefined_function(CYCL_VARIABLE_P);
            register_api_predefined_function($sym488$CYCSECURE_SUB_SOFTWARE_OBJECTS_);
            register_api_predefined_function($sym489$CYCSECURE_VERSION_OF_SOFTWARE_);
            register_api_predefined_function($sym490$GAF_);
            register_api_predefined_function(GEN_TEMPLATE_RECIPE_P);
            register_api_predefined_function(GENERATE_NAMES_FOR_TERM);
            register_api_predefined_function(GENERATE_PHRASE_DEFN);
            register_api_predefined_function(HL_EXTERNAL_ID_STRING_P);
            register_api_predefined_function($sym495$IBQE_);
            register_api_predefined_function(INTEGERP);
            register_api_predefined_function(KEYWORDP);
            register_api_predefined_function($sym498$KWTE_);
            register_api_predefined_function(LISTP);
            register_api_predefined_function($sym500$MONAD_CYCL_MT_);
            register_api_predefined_function($sym501$NON_NEGATIVE_SCALAR_INTERVAL_);
            register_api_predefined_function($sym502$POSITIVE_SCALAR_INTERVAL_);
            register_api_predefined_function(PRE_REMOVE_DEFINITE_ARTICLE_FROM_STRING);
            register_api_predefined_function(RTP_SYNTACTIC_CONSTRAINT);
            register_api_predefined_function($sym505$SCALAR_POINT_VALUE_);
            register_api_predefined_function($sym506$STRING_W_O_CONTROL_CHARS_);
            register_api_predefined_function(STRINGP);
            register_api_predefined_function(SUBL_NON_VARIABLE_NON_KEYWORD_SYMBOL_P);
            register_api_predefined_function(SYMBOLP);
            register_api_predefined_function(TEMPORAL_DIMENSION_MT_P);
            register_api_predefined_function(TRUE);
            register_api_predefined_function(URL_P);
            cdolist_list_var = $list513;
            symbol = NIL;
            symbol = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                register_api_predefined_function(symbol);
                cdolist_list_var = cdolist_list_var.rest();
                symbol = cdolist_list_var.first();
            } 
        }
        if (SubLFiles.USE_V2) {
            {
                SubLObject cdolist_list_var = $sublisp_api_predefined_functions$.getGlobalValue();
                SubLObject symbol = NIL;
                for (symbol = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , symbol = cdolist_list_var.first()) {
                    register_api_predefined_function(symbol);
                }
            }
            {
                SubLObject cdolist_list_var = $list_alt63;
                SubLObject symbol = NIL;
                for (symbol = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , symbol = cdolist_list_var.first()) {
                    register_api_predefined_function(symbol);
                }
            }
            {
                SubLObject cdolist_list_var = $list_alt64;
                SubLObject symbol = NIL;
                for (symbol = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , symbol = cdolist_list_var.first()) {
                    register_api_predefined_function(symbol);
                }
            }
            register_api_predefined_function($sym75$WHY_COLLECTIONS_INTERSECT_);
            register_api_predefined_function($sym84$DISJOINT_WITH_);
            register_api_predefined_function($sym94$ISA_IN_ANY_MT_);
            register_api_predefined_function($sym95$GENL_IN_ANY_MT_);
            register_api_predefined_function($sym101$TACIT_COEXTENSIONAL_);
            register_api_predefined_function($sym102$EL_WFF_);
            register_api_predefined_function($sym103$EVALUATABLE_PREDICATE_);
            register_api_predefined_function($sym104$HIERARCHICAL_COLLECTIONS_);
            register_api_predefined_function($sym111$RTP_PARSE_EXP_W_VPP);
            register_api_predefined_function($sym120$GENL_MT_);
            register_api_predefined_function(ID_INDEX_OLD_OBJECTS);
            register_api_predefined_function(ID_INDEX_NEW_ID_THRESHOLD);
            {
                SubLObject cdolist_list_var = $list_alt139;
                SubLObject symbol = NIL;
                for (symbol = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , symbol = cdolist_list_var.first()) {
                    register_api_predefined_function(symbol);
                }
            }
            {
                SubLObject cdolist_list_var = $list_alt140;
                SubLObject symbol = NIL;
                for (symbol = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , symbol = cdolist_list_var.first()) {
                    register_api_predefined_function(symbol);
                }
            }
            {
                SubLObject cdolist_list_var = $list_alt141;
                SubLObject symbol = NIL;
                for (symbol = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , symbol = cdolist_list_var.first()) {
                    register_api_predefined_function(symbol);
                }
            }
            {
                SubLObject cdolist_list_var = $list_alt142;
                SubLObject symbol = NIL;
                for (symbol = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , symbol = cdolist_list_var.first()) {
                    register_api_predefined_function(symbol);
                }
            }
            {
                SubLObject cdolist_list_var = $list_alt143;
                SubLObject symbol = NIL;
                for (symbol = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , symbol = cdolist_list_var.first()) {
                    register_api_predefined_function(symbol);
                }
            }
            {
                SubLObject cdolist_list_var = $list_alt144;
                SubLObject symbol = NIL;
                for (symbol = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , symbol = cdolist_list_var.first()) {
                    register_api_predefined_function(symbol);
                }
            }
            {
                SubLObject cdolist_list_var = $list_alt145;
                SubLObject symbol = NIL;
                for (symbol = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , symbol = cdolist_list_var.first()) {
                    register_api_predefined_function(symbol);
                }
            }
            {
                SubLObject cdolist_list_var = $list_alt146;
                SubLObject symbol = NIL;
                for (symbol = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , symbol = cdolist_list_var.first()) {
                    register_api_predefined_function(symbol);
                }
            }
            {
                SubLObject cdolist_list_var = $list_alt147;
                SubLObject symbol = NIL;
                for (symbol = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , symbol = cdolist_list_var.first()) {
                    register_api_predefined_macro(symbol);
                }
            }
            {
                SubLObject cdolist_list_var = $list_alt148;
                SubLObject symbol = NIL;
                for (symbol = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , symbol = cdolist_list_var.first()) {
                    eval_in_api.register_api_mutable_global(symbol);
                }
            }
            register_external_symbol($sym149$__);
            {
                SubLObject cdolist_list_var = $list_alt150;
                SubLObject symbol = NIL;
                for (symbol = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , symbol = cdolist_list_var.first()) {
                    register_api_predefined_function(symbol);
                }
            }
            {
                SubLObject cdolist_list_var = $api_host_access_functions$.getGlobalValue();
                SubLObject symbol = NIL;
                for (symbol = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , symbol = cdolist_list_var.first()) {
                    register_api_predefined_host_function(symbol);
                }
            }
            register_api_predefined_function($sym260$CYC_PRIME_NUMBER_);
            register_api_predefined_function($sym305$CYC_SUBLIST_);
            register_api_predefined_function($sym332$CYCL_ASSERTED_ASSERTION_);
            register_api_predefined_function($sym333$CYCL_ASSERTION_);
            register_api_predefined_function($sym334$CYCL_ATOMIC_ASSERTION_);
            register_api_predefined_function($sym335$CYCL_ATOMIC_SENTENCE_);
            register_api_predefined_function($sym337$CYCL_CLOSED_ATOMIC_SENTENCE_);
            register_api_predefined_function($sym339$CYCL_CLOSED_DENOTATIONAL_TERM_);
            register_api_predefined_function($sym340$CYCL_CLOSED_EXPRESSION_);
            register_api_predefined_function($sym341$CYCL_CLOSED_FORMULA_);
            register_api_predefined_function($sym342$CYCL_CLOSED_NON_ATOMIC_TERM_);
            register_api_predefined_function($sym343$CYCL_CLOSED_SENTENCE_);
            register_api_predefined_function($sym345$CYCL_DEDUCED_ASSERTION_);
            register_api_predefined_function($sym347$CYCL_EXPRESSION_ASKABLE_);
            register_api_predefined_function($sym348$CYCL_EXPRESSION_ASSERTIBLE_);
            register_api_predefined_function($sym349$CYCL_EXPRESSION_);
            register_api_predefined_function($sym350$CYCL_FORMULA_);
            register_api_predefined_function($sym351$CYCL_GAF_ASSERTION_);
            register_api_predefined_function($sym352$CYCL_INDEXED_TERM_);
            register_api_predefined_function($sym353$CYCL_NL_SEMANTIC_ASSERTION_);
            register_api_predefined_function($sym354$CYCL_NON_ATOMIC_REIFIED_TERM_);
            register_api_predefined_function($sym355$CYCL_NON_ATOMIC_TERM_ASKABLE_);
            register_api_predefined_function($sym356$CYCL_NON_ATOMIC_TERM_ASSERTIBLE_);
            register_api_predefined_function($sym357$CYCL_NON_ATOMIC_TERM_);
            register_api_predefined_function($sym358$CYCL_OPEN_DENOTATIONAL_TERM_);
            register_api_predefined_function($sym359$CYCL_OPEN_EXPRESSION_);
            register_api_predefined_function($sym360$CYCL_OPEN_FORMULA_);
            register_api_predefined_function($sym361$CYCL_OPEN_NON_ATOMIC_TERM_);
            register_api_predefined_function($sym362$CYCL_OPEN_SENTENCE_);
            register_api_predefined_function($sym363$CYCL_PROPOSITIONAL_SENTENCE_);
            register_api_predefined_function($sym364$CYCL_REFORMULATOR_RULE_);
            register_api_predefined_function($sym365$CYCL_REIFIABLE_DENOTATIONAL_TERM_);
            register_api_predefined_function($sym366$CYCL_REIFIABLE_NON_ATOMIC_TERM_);
            register_api_predefined_function($sym367$CYCL_REIFIED_DENOTATIONAL_TERM_);
            register_api_predefined_function($sym369$CYCL_REPRESENTED_TERM_);
            register_api_predefined_function($sym370$CYCL_RULE_ASSERTION_);
            register_api_predefined_function($sym371$CYCL_SENTENCE_ASKABLE_);
            register_api_predefined_function($sym372$CYCL_SENTENCE_ASSERTIBLE_);
            register_api_predefined_function($sym373$CYCL_SENTENCE_);
            register_api_predefined_function($sym376$CYCL_VAR_LIST_);
            register_api_predefined_function($sym378$CYCSECURE_SUB_SOFTWARE_OBJECTS_);
            register_api_predefined_function($sym379$CYCSECURE_VERSION_OF_SOFTWARE_);
            register_api_predefined_function($sym380$GAF_);
            register_api_predefined_function($sym385$IBQE_);
            register_api_predefined_function($sym388$KWTE_);
            register_api_predefined_function($sym390$MONAD_CYCL_MT_);
            register_api_predefined_function($sym391$NON_NEGATIVE_SCALAR_INTERVAL_);
            register_api_predefined_function($sym392$POSITIVE_SCALAR_INTERVAL_);
            register_api_predefined_function($sym395$SCALAR_POINT_VALUE_);
            register_api_predefined_function($sym396$STRING_W_O_CONTROL_CHARS_);
            {
                SubLObject cdolist_list_var = $list_alt403;
                SubLObject symbol = NIL;
                for (symbol = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , symbol = cdolist_list_var.first()) {
                    register_api_predefined_function(symbol);
                }
            }
        }
        return NIL;
    }

    public static SubLObject setup_eval_in_api_registrations_file_Previous() {
        eval_in_api.register_api_immutable_global($null_output$);
        eval_in_api.register_api_mutable_global($it_verbose$);
        eval_in_api.register_api_mutable_global($progress_note$);
        eval_in_api.register_api_mutable_global($progress_sofar$);
        eval_in_api.register_api_mutable_global($progress_start_time$);
        eval_in_api.register_api_mutable_global($progress_total$);
        eval_in_api.register_api_mutable_global($eval_with_bindings$);
        eval_in_api.register_api_mutable_global($error_output$);
        eval_in_api.register_api_mutable_global($standard_output$);
        eval_in_api.register_api_mutable_global($continue_cerrorP$);
        eval_in_api.register_api_mutable_global($silent_progressP$);
        eval_in_api.register_api_mutable_global($ignore_breaksP$);
        eval_in_api.register_api_mutable_global($ignore_warnsP$);
        eval_in_api.register_api_mutable_global($eval_in_api_trace_log$);
        eval_in_api.register_api_mutable_global($eval_in_api_traced_fns$);
        eval_in_api.register_api_mutable_global($eval_in_api_env$);
        eval_in_api.register_api_mutable_global($api_output_protocol$);
        eval_in_api.register_api_mutable_global($api_result_method$);
        eval_in_api.register_api_mutable_global($api_input_protocol$);
        eval_in_api.register_api_mutable_global($ke_purpose$);
        eval_in_api.register_api_mutable_global($the_cyclist$);
        eval_in_api.register_api_mutable_global($use_local_queueP$);
        eval_in_api.register_api_mutable_global($relevant_mt_function$);
        eval_in_api.register_api_mutable_global($cyc_bookkeeping_info$);
        eval_in_api.register_api_mutable_global($suppress_sbhl_recachingP$);
        eval_in_api.register_api_mutable_global($paraphrase_precision$);
        eval_in_api.register_api_mutable_global($eval_in_api_level$);
        eval_in_api.register_api_mutable_global($suspend_sbhl_type_checkingP$);
        eval_in_api.register_api_mutable_global($require_case_insensitive_name_uniqueness$);
        eval_in_api.register_api_mutable_global($task_processor_verbosity$);
        register_api_predefined_macro(BQ_APPEND);
        register_api_predefined_macro(BQ_LIST);
        register_api_predefined_macro($sym32$BQ_LIST_);
        register_api_predefined_macro(BQ_NCONC);
        register_api_predefined_macro(BQ_VECTOR_APPEND);
        register_api_predefined_macro(API_BQ_LIST);
        register_api_predefined_macro(CDESTRUCTURING_BIND);
        register_api_predefined_macro(WITH_PRECISE_PARAPHRASE_ON);
        register_api_predefined_macro(WITH_PARAPHRASE_PRECISION);
        register_api_predefined_macro(WITH_BOOKKEEPING_INFO);
        register_api_predefined_macro(WITH_MT_FUNCTION);
        register_api_predefined_macro(WITH_GENL_MTS);
        register_api_predefined_macro(WITH_INFERENCE_MT_RELEVANCE);
        register_api_predefined_macro(WITH_ALL_MTS);
        register_api_predefined_macro(DO_PREDICATE_RULE_INDEX);
        register_api_predefined_macro(DO_RULE_INDEX);
        register_api_predefined_macro(WITHOUT_WFF_SEMANTICS);
        register_api_predefined_macro(CDOLIST_DONE);
        register_api_predefined_macro(DO_DICTIONARY);
        register_api_predefined_macro(PROGRESS_CDOTIMES);
        register_api_predefined_macro(DO_KB_SUID_TABLE);
        register_api_predefined_macro(DO_ID_INDEX);
        register_api_predefined_macro(OLD_DO_ID_INDEX);
        register_api_predefined_macro(NEW_DO_ID_INDEX);
        register_api_predefined_macro(DO_CONSTANTS);
        register_api_predefined_macro(CWITH_OUTPUT_TO_STRING);
        register_api_predefined_macro(WITH_INPUT_FROM_STRING);
        register_api_predefined_macro(DO_VECTOR_INDEX);
        register_api_predefined_macro(IN_MT);
        register_api_predefined_macro(DO_ITERATOR_WITHOUT_VALUES_PROGRESS);
        register_api_predefined_host_macro(WITH_OPEN_STREAM);
        register_api_predefined_host_macro(WITH_OPEN_FILE);
        register_api_predefined_host_macro(WITH_TCP_CONNECTION);
        SubLObject cdolist_list_var = $sublisp_api_predefined_functions$.getGlobalValue();
        SubLObject symbol = NIL;
        symbol = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            register_api_predefined_function(symbol);
            cdolist_list_var = cdolist_list_var.rest();
            symbol = cdolist_list_var.first();
        } 
        cdolist_list_var = $list65;
        symbol = NIL;
        symbol = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            register_api_predefined_function(symbol);
            cdolist_list_var = cdolist_list_var.rest();
            symbol = cdolist_list_var.first();
        } 
        cdolist_list_var = $list66;
        symbol = NIL;
        symbol = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            register_api_predefined_function(symbol);
            cdolist_list_var = cdolist_list_var.rest();
            symbol = cdolist_list_var.first();
        } 
        register_api_predefined_function(STRING_TO_GUID);
        register_api_predefined_function(GUID_TO_STRING);
        register_api_predefined_function(REMOVE_DUPLICATES);
        register_api_predefined_function(NEW_BOOKKEEPING_INFO);
        register_api_predefined_function(STRING_SUBSTITUTE);
        register_api_predefined_function(GENERATE_PHRASE);
        register_api_predefined_function(THE_DATE);
        register_api_predefined_function(THE_SECOND);
        register_api_predefined_function(ISA);
        register_api_predefined_function(GENLS);
        register_api_predefined_function($sym77$WHY_COLLECTIONS_INTERSECT_);
        register_api_predefined_function(ARG1_FORMAT);
        register_api_predefined_function(ARG2_FORMAT);
        register_api_predefined_function(SPECS);
        register_api_predefined_function(COLLECTION_LEAVES);
        register_api_predefined_function(SIMPLE_INDEXED_TERM_P);
        register_api_predefined_function(MAX_SPECS);
        register_api_predefined_function(MIN_ISA);
        register_api_predefined_function(LOCAL_DISJOINT_WITH);
        register_api_predefined_function($sym86$DISJOINT_WITH_);
        register_api_predefined_function(GENL_SIBLINGS);
        register_api_predefined_function(SPEC_SIBLINGS);
        register_api_predefined_function(ARG1_ISA);
        register_api_predefined_function(ARG2_ISA);
        register_api_predefined_function(ARGN_ISA);
        register_api_predefined_function(ARGN_ISA);
        register_api_predefined_function(ARGN_GENL);
        register_api_predefined_function(ALL_GENLS_IN_ANY_MT);
        register_api_predefined_function(ALL_ISA_IN_ANY_MT);
        register_api_predefined_function(ALL_FORT_INSTANCES_IN_ALL_MTS);
        register_api_predefined_function($sym96$ISA_IN_ANY_MT_);
        register_api_predefined_function($sym97$GENL_IN_ANY_MT_);
        register_api_predefined_function(NEW_CONSTANT_NAME_SPEC_P);
        register_api_predefined_function(DO_RULE_INDEX_RULES);
        register_api_predefined_function(BT_LOWER);
        register_api_predefined_function(BT_HIGHER);
        register_api_predefined_function(SAMPLE_LEAF_SPECS);
        register_api_predefined_function($sym103$TACIT_COEXTENSIONAL_);
        register_api_predefined_function($sym104$EL_WFF_);
        register_api_predefined_function($sym105$EVALUATABLE_PREDICATE_);
        register_api_predefined_function($sym106$HIERARCHICAL_COLLECTIONS_);
        register_api_predefined_function(NUM_BEST_GAF_LOOKUP_INDEX);
        register_api_predefined_function(API_QUIT);
        register_api_predefined_function(NART_P);
        register_api_predefined_function(EL_VARIABLE_P);
        register_api_predefined_function(PPH_PRECISION_P);
        register_api_predefined_function(FORT_FOR_STRING);
        register_api_predefined_function($sym113$RTP_PARSE_EXP_W_VPP);
        register_api_predefined_function(GET_UNIVERSAL_TIME);
        register_api_predefined_function(DECODE_UNIVERSAL_TIME);
        register_api_predefined_function(FIND_NART);
        register_api_predefined_function(CONSTANT_GUID);
        register_api_predefined_function(RKF_PHRASE_READER);
        register_api_predefined_function(GENERATE_DISAMBIGUATION_PHRASES_AND_TYPES);
        register_api_predefined_function(LOAD_TRANSCRIPT_FILE);
        register_api_predefined_function(KB_STATISTICS);
        register_api_predefined_function($sym122$GENL_MT_);
        register_api_predefined_function(ALL_SPEC_MTS);
        register_api_predefined_function(REMOVAL_ASK);
        register_api_predefined_function(DO_NARTS_TABLE);
        register_api_predefined_function(ID_INDEX_COUNT);
        register_api_predefined_function(ID_INDEX_DENSE_OBJECTS);
        register_api_predefined_function(ID_INDEX_EMPTY_P);
        register_api_predefined_function(ID_INDEX_SPARSE_ID_THRESHOLD);
        register_api_predefined_function(ID_INDEX_NEXT_ID);
        register_api_predefined_function(CYCL_NART_P);
        register_api_predefined_function(CYCL_NAUT_P);
        register_api_predefined_function(RESOLVE_NEW_CONSTANTS);
        register_api_predefined_function(CYC_OPENCYC_FEATURE);
        register_api_predefined_function(CYC_RESEARCHCYC_FEATURE);
        register_api_predefined_function(CANONICALIZE_HLMT);
        register_api_predefined_function(NEW_CYC_QUERY);
        register_api_predefined_function(REGISTER_SOLELY_SPECIFIC_REMOVAL_MODULE_PREDICATE);
        register_api_predefined_function(INFERENCE_REMOVAL_MODULE);
        register_api_predefined_function(UNDECLARE_INFERENCE_REMOVAL_MODULE);
        cdolist_list_var = $list141;
        symbol = NIL;
        symbol = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            register_api_predefined_function(symbol);
            cdolist_list_var = cdolist_list_var.rest();
            symbol = cdolist_list_var.first();
        } 
        cdolist_list_var = $list142;
        symbol = NIL;
        symbol = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            register_api_predefined_function(symbol);
            cdolist_list_var = cdolist_list_var.rest();
            symbol = cdolist_list_var.first();
        } 
        cdolist_list_var = $list143;
        symbol = NIL;
        symbol = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            register_api_predefined_function(symbol);
            cdolist_list_var = cdolist_list_var.rest();
            symbol = cdolist_list_var.first();
        } 
        cdolist_list_var = $list144;
        symbol = NIL;
        symbol = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            register_api_predefined_function(symbol);
            cdolist_list_var = cdolist_list_var.rest();
            symbol = cdolist_list_var.first();
        } 
        cdolist_list_var = $list145;
        symbol = NIL;
        symbol = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            register_api_predefined_function(symbol);
            cdolist_list_var = cdolist_list_var.rest();
            symbol = cdolist_list_var.first();
        } 
        cdolist_list_var = $list146;
        symbol = NIL;
        symbol = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            register_api_predefined_function(symbol);
            cdolist_list_var = cdolist_list_var.rest();
            symbol = cdolist_list_var.first();
        } 
        cdolist_list_var = $list147;
        symbol = NIL;
        symbol = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            register_api_predefined_function(symbol);
            cdolist_list_var = cdolist_list_var.rest();
            symbol = cdolist_list_var.first();
        } 
        cdolist_list_var = $list148;
        symbol = NIL;
        symbol = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            register_api_predefined_function(symbol);
            cdolist_list_var = cdolist_list_var.rest();
            symbol = cdolist_list_var.first();
        } 
        cdolist_list_var = $list149;
        symbol = NIL;
        symbol = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            register_api_predefined_macro(symbol);
            cdolist_list_var = cdolist_list_var.rest();
            symbol = cdolist_list_var.first();
        } 
        cdolist_list_var = $list150;
        symbol = NIL;
        symbol = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            eval_in_api.register_api_mutable_global(symbol);
            cdolist_list_var = cdolist_list_var.rest();
            symbol = cdolist_list_var.first();
        } 
        register_external_symbol($sym151$__);
        cdolist_list_var = $list152;
        symbol = NIL;
        symbol = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            register_api_predefined_function(symbol);
            cdolist_list_var = cdolist_list_var.rest();
            symbol = cdolist_list_var.first();
        } 
        cdolist_list_var = $api_host_access_functions$.getGlobalValue();
        symbol = NIL;
        symbol = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            register_api_predefined_host_function(symbol);
            cdolist_list_var = cdolist_list_var.rest();
            symbol = cdolist_list_var.first();
        } 
        register_api_predefined_function(PHRASE_FOR_MT);
        register_api_predefined_function(NOTING_PROGRESS);
        register_api_predefined_function(NOTE_PROGRESS);
        register_api_predefined_function(NEW_ALEXANDRIA_ITERATOR);
        register_api_predefined_function(ALEXANDRIA_KB_STORE_ITERATOR_DONE);
        register_api_predefined_function(ALEXANDRIA_KB_STORE_ITERATOR_FINALIZE);
        register_api_predefined_function(COUNT_ALEXANDRIA_GAFS_MATCHING_FORMULA);
        register_api_predefined_function(COUNT_ALEXANDRIA_GAFS_MATCHING_FORMULA_RELEVANT_MT_AND_PRED);
        register_api_predefined_function(CREATE_ALEXANDRIA_GAFS_MATCHING_FORMULA_ITERATOR_STATE);
        register_api_predefined_function(NEW_ALEXANDRIA_GAFS_MATCHING_FORMULA_ITERATOR);
        register_api_predefined_function($sym164$CREATE_ALEXANDRIA_GAFS_MATCHING_FORMULA_RELEVANT_MT_AND_PRED_ITER);
        register_api_predefined_function($sym165$NEW_ALEXANDRIA_GAFS_MATCHING_FORMULA_RELEVANT_MT_AND_PRED_ITERATO);
        register_api_predefined_function(CREATE_ALEXANDRIA_NATS_MATCHING_FORMULA_ITERATOR);
        register_api_predefined_function(NEW_ALEXANDRIA_NATS_MATCHING_FORMULA_ITERATOR);
        register_api_predefined_function(COUNT_ALEXANDRIA_NATS_MATCHING_FORMULA);
        register_api_predefined_function(COUNT_ALEXANDRIA_REIFIABLE_FUNCTION_EXTENT);
        register_api_predefined_function(CREATE_ALEXANDRIA_REIFIABLE_FUNCTION_EXTENT_ITERATOR_STATE);
        register_api_predefined_function(NEW_ALEXANDRIA_REIFIABLE_FUNCTION_EXTENT_ITERATOR);
        register_api_predefined_function(CREATE_ALEXANDRIA_ALL_FORTS_ITERATOR_STATE);
        register_api_predefined_function(NEW_ALEXANDRIA_ALL_FORTS_ITERATOR);
        register_api_predefined_function(CREATE_ALEXANDRIA_ALL_GAFS_ITERATOR_STATE);
        register_api_predefined_function(NEW_ALEXANDRIA_ALL_GAFS_ITERATOR);
        register_api_predefined_function(CREATE_ALEXANDRIA_ALL_RULES_ITERATOR_STATE);
        register_api_predefined_function(NEW_ALEXANDRIA_ALL_RULES_ITERATOR);
        register_api_predefined_function(CREATE_ALEXANDRIA_ALL_UNBOUND_RULES_ITERATOR_STATE);
        register_api_predefined_function(NEW_ALEXANDRIA_ALL_UNBOUND_RULES_ITERATOR);
        register_api_predefined_function(CREATE_ALEXANDRIA_ALL_UNBOUND_RULES_RELEVANT_MT_ITERATOR_STATE);
        register_api_predefined_function(NEW_ALEXANDRIA_ALL_UNBOUND_RULES_RELEVANT_MT_ITERATOR);
        register_api_predefined_function(CREATE_ALEXANDRIA_ALL_ASSERTIONS_ITERATOR_STATE);
        register_api_predefined_function(NEW_ALEXANDRIA_ALL_ASSERTIONS_ITERATOR);
        register_api_predefined_function(CREATE_ALEXANDRIA_ALL_BIG_INTEGERS_ITERATOR_STATE);
        register_api_predefined_function(NEW_ALEXANDRIA_ALL_BIG_INTEGERS_ITERATOR);
        register_api_predefined_function(CREATE_ALEXANDRIA_ALL_INTEGERS_ITERATOR_STATE);
        register_api_predefined_function(NEW_ALEXANDRIA_ALL_INTEGERS_ITERATOR);
        register_api_predefined_function(CREATE_ALEXANDRIA_ALL_BOOKKEEPING_GAFS_ITERATOR_STATE);
        register_api_predefined_function(NEW_ALEXANDRIA_ALL_BOOKKEEPING_GAFS_ITERATOR);
        register_api_predefined_function(CREATE_ALEXANDRIA_ALL_CONSTANTS_ITERATOR_STATE);
        register_api_predefined_function(NEW_ALEXANDRIA_ALL_CONSTANTS_ITERATOR);
        register_api_predefined_function(CREATE_ALEXANDRIA_ALL_NARTS_ITERATOR_STATE);
        register_api_predefined_function(NEW_ALEXANDRIA_ALL_NARTS_ITERATOR);
        register_api_predefined_function(CREATE_ALEXANDRIA_ALL_DEDUCTIONS_ITERATOR_STATE);
        register_api_predefined_function(NEW_ALEXANDRIA_ALL_DEDUCTIONS_ITERATOR);
        register_api_predefined_function(CREATE_ALEXANDRIA_ALL_FLOATS_ITERATOR_STATE);
        register_api_predefined_function(NEW_ALEXANDRIA_ALL_FLOATS_ITERATOR);
        register_api_predefined_function(CREATE_ALEXANDRIA_ALL_FORMULAS_ITERATOR_STATE);
        register_api_predefined_function(NEW_ALEXANDRIA_ALL_FORMULAS_ITERATOR);
        register_api_predefined_function(CREATE_ALEXANDRIA_ALL_HL_SUPPORTS_ITERATOR_STATE);
        register_api_predefined_function(NEW_ALEXANDRIA_ALL_HL_SUPPORTS_ITERATOR);
        register_api_predefined_function(CREATE_ALEXANDRIA_ALL_KB_HL_SUPPORTS_ITERATOR_STATE);
        register_api_predefined_function(NEW_ALEXANDRIA_ALL_KB_HL_SUPPORTS_ITERATOR);
        register_api_predefined_function(CREATE_ALEXANDRIA_ALL_ITEMS_ITERATOR_STATE);
        register_api_predefined_function(NEW_ALEXANDRIA_ALL_ITEMS_ITERATOR);
        register_api_predefined_function(CREATE_ALEXANDRIA_ALL_STRINGS_ITERATOR_STATE);
        register_api_predefined_function(NEW_ALEXANDRIA_ALL_STRINGS_ITERATOR);
        register_api_predefined_function(CREATE_ALEXANDRIA_ALL_NUMBERS_ITERATOR_STATE);
        register_api_predefined_function(NEW_ALEXANDRIA_ALL_NUMBERS_ITERATOR);
        register_api_predefined_function(CREATE_ALEXANDRIA_ALL_SUBL_EXPRESSIONS_ITERATOR_STATE);
        register_api_predefined_function(NEW_ALEXANDRIA_ALL_SUBL_EXPRESSIONS_ITERATOR);
        register_api_predefined_function(CREATE_ALEXANDRIA_ALL_VARIABLES_ITERATOR_STATE);
        register_api_predefined_function(NEW_ALEXANDRIA_ALL_VARIABLES_ITERATOR);
        register_api_predefined_function(CREATE_ALEXANDRIA_ALL_UNREPRESENTED_TERMS_ITERATOR_STATE);
        register_api_predefined_function(NEW_ALEXANDRIA_ALL_UNREPRESENTED_TERMS_ITERATOR);
        register_api_predefined_function(CREATE_ALEXANDRIA_TERM_ASSERTIONS_ITERATOR_STATE);
        register_api_predefined_function(NEW_ALEXANDRIA_TERM_ASSERTIONS_ITERATOR);
        register_api_predefined_function(COUNT_ALEXANDRIA_TERM_ASSERTIONS);
        register_api_predefined_function(CREATE_ALEXANDRIA_TERM_ASSERTIONS_RELEVANT_MT_PRED_ITERATOR_STATE);
        register_api_predefined_function(NEW_ALEXANDRIA_TERM_ASSERTIONS_RELEVANT_MT_PRED_ITERATOR);
        register_api_predefined_function(COUNT_ALEXANDRIA_TERM_ASSERTIONS_RELEVANT_MT_PRED);
        register_api_predefined_function(CREATE_ALEXANDRIA_GAF_ARG0_ITERATOR_STATE);
        register_api_predefined_function(NEW_ALEXANDRIA_GAF_ARG0_ITERATOR);
        register_api_predefined_function(COUNT_ALEXANDRIA_GAF_ARG0);
        register_api_predefined_function(CREATE_ALEXANDRIA_GAF_ARG0_RELEVANT_MT_ITERATOR_STATE);
        register_api_predefined_function(NEW_ALEXANDRIA_GAF_ARG0_ITERATOR_RELEVANT_MT);
        register_api_predefined_function(COUNT_ALEXANDRIA_GAF_ARG0_RELEVANT_MT);
        register_api_predefined_function(CREATE_ALEXANDRIA_GAF_ARGITERATOR_STATE);
        register_api_predefined_function(NEW_ALEXANDRIA_GAF_ARG_ITERATOR);
        register_api_predefined_function(CREATE_ALEXANDRIA_GAF_ARG_RELEVANT_MT_AND_PRED_ITERATOR_STATE);
        register_api_predefined_function(NEW_ALEXANDRIA_GAF_ARG_RELEVANT_MT_AND_PRED_ITERATOR);
        register_api_predefined_function(COUNT_ALEXANDRIA_GAF_ARG_RELEVANT_MT_AND_PRED);
        register_api_predefined_function(COUNT_ALEXANDRIA_GAF_ARG);
        register_api_predefined_function(NEW_ALEXANDRIA_GAF_ARG_ARG_RELEVANT_MT_AND_PRED_ITERATOR);
        register_api_predefined_function(CREATE_ALEXANDRIA_GAF_ARG_ARG_RELEVANT_MT_AND_PRED_ITERATOR_STATE);
        register_api_predefined_function(COUNT_ALEXANDRIA_GAF_ARG_ARG_RELEVANT_MT_AND_PRED);
        register_api_predefined_function(CREATE_ALEXANDRIA_MT_CONTENTS_ITERATOR_STATE_RELEVANT_PRED);
        register_api_predefined_function(NEW_ALEXANDRIA_MT_CONTENTS_ITERATOR_RELEVANT_PRED);
        register_api_predefined_function(COUNT_ALEXANDRIA_MT_CONTENTS_RELEVANT_PRED);
        register_api_predefined_function(CREATE_ALEXANDRIA_MT_CONTENTS_ITERATOR_STATE_RELEVANT_PRED);
        register_api_predefined_function(NEW_ALEXANDRIA_MT_CONTENTS_ITERATOR_RELEVANT_PRED);
        register_api_predefined_function(COUNT_ALEXANDRIA_MT_CONTENTS_RELEVANT_PRED);
        register_api_predefined_function(CREATE_ALEXANDRIA_MT_CONTENTS_ITERATOR_STATE);
        register_api_predefined_function(NEW_ALEXANDRIA_MT_CONTENTS_ITERATOR);
        register_api_predefined_function(COUNT_ALEXANDRIA_MT_CONTENTS);
        register_api_predefined_function(CREATE_ALEXANDRIA_RULES_WITH_PRED_ITERATOR_STATE);
        register_api_predefined_function(NEW_ALEXANDRIA_RULES_WITH_PRED_ITERATOR);
        register_api_predefined_function(COUNT_ALEXANDRIA_RULES_WITH_PRED);
        register_api_predefined_function(CREATE_ALEXANDRIA_RULES_WITH_PRED_RELEVANT_MT_ITERATOR_STATE);
        register_api_predefined_function(NEW_ALEXANDRIA_RULES_WITH_PRED_RELEVANT_MT_ITERATOR);
        register_api_predefined_function(COUNT_ALEXANDRIA_RULES_WITH_PRED_RELEVANT_MT);
        register_api_predefined_function(CREATE_ALEXANDRIA_RULES_WITH_PRED_AND_ARG2_ITERATOR_STATE);
        register_api_predefined_function(NEW_ALEXANDRIA_RULES_WITH_PRED_AND_ARG2_ITERATOR);
        register_api_predefined_function(COUNT_ALEXANDRIA_RULES_WITH_PRED_AND_ARG2);
        register_api_predefined_function($sym252$CREATE_ALEXANDRIA_RULES_WITH_PRED_AND_ARG2_RELEVANT_MT_ITERATOR_S);
        register_api_predefined_function(NEW_ALEXANDRIA_RULES_WITH_PRED_AND_ARG2_RELEVANT_MT_ITERATOR);
        register_api_predefined_function(COUNT_ALEXANDRIA_RULES_WITH_PRED_AND_ARG2_RELEVANT_MT);
        register_api_predefined_function(CREATE_ALEXANDRIA_NESTED_FORMULA_RULES_RELEVANT_MT_ITERATOR_STATE);
        register_api_predefined_function(NEW_ALEXANDRIA_NESTED_FORMULA_RULES_RELEVANT_MT_ITERATOR);
        register_api_predefined_function(COUNT_ALEXANDRIA_NESTED_FORMULA_RULES_RELEVANT_MT);
        register_api_predefined_function(CREATE_ALEXANDRIA_FUNCTION_EXTENT_ITERATOR_STATE);
        register_api_predefined_function(NEW_ALEXANDRIA_FUNCTION_EXTENT_ITERATOR);
        register_api_predefined_function(COUNT_ALEXANDRIA_NART_ARG_INDEX);
        register_api_predefined_function(CREATE_ALEXANDRIA_NART_ARG_INDEX_ITERATOR_STATE);
        register_api_predefined_function(NEW_ALEXANDRIA_NART_ARG_INDEX_ITERATOR);
        register_api_predefined_function(BEST_STRING_OF_NL_PHRASE_DEFN);
        register_api_predefined_function(CYC_1_BYTE_INTEGER);
        register_api_predefined_function(CYC_2_BYTE_INTEGER);
        register_api_predefined_function(CYC_4_BYTE_INTEGER);
        register_api_predefined_function(CYC_8_BYTE_INTEGER);
        register_api_predefined_function(CYC_ABSOLUTE_VALUE);
        register_api_predefined_function(CYC_ADD_ENGLISH_SUFFIX);
        register_api_predefined_function(CYC_ARC_COSECANT);
        register_api_predefined_function(CYC_ARC_COSINE);
        register_api_predefined_function(CYC_ARC_COTANGENT);
        register_api_predefined_function(CYC_ARC_SECANT);
        register_api_predefined_function(CYC_ARC_SINE);
        register_api_predefined_function(CYC_ARC_TANGENT);
        register_api_predefined_function(CYC_ASCII_STRING_P);
        register_api_predefined_function(CYC_AVERAGE);
        register_api_predefined_function(CYC_BIT_DATATYPE);
        register_api_predefined_function(CYC_COLLECTION_DENOTING_UNARY_FUNCTION_FOR);
        register_api_predefined_function(CYC_COSECANT);
        register_api_predefined_function(CYC_COSINE);
        register_api_predefined_function(CYC_COTANGENT);
        register_api_predefined_function(CYC_DATE_AFTER);
        register_api_predefined_function(CYC_DATE_BEFORE);
        register_api_predefined_function(CYC_DATE_DECODE_STRING);
        register_api_predefined_function(CYC_DATE_ENCODE_STRING);
        register_api_predefined_function(CYC_DATE_FROM_INTEGER);
        register_api_predefined_function(CYC_DATE_FROM_STRING);
        register_api_predefined_function(CYC_DATE_SUBSUMES);
        register_api_predefined_function(CYC_DAY_OF_DATE);
        register_api_predefined_function(CYC_DAY_OF_WEEK_AFTER_DATE);
        register_api_predefined_function(CYC_DAY_OF_WEEK_AFTER_DATE_INCLUSIVE);
        register_api_predefined_function(CYC_DAY_OF_WEEK_DEFN);
        register_api_predefined_function(CYC_DAY_OF_WEEK_OF_DATE);
        register_api_predefined_function(CYC_DAY_OF_WEEK_PRIOR_TO_DATE);
        register_api_predefined_function(CYC_DAY_OF_WEEK_PRIOR_TO_DATE_INCLUSIVE);
        register_api_predefined_function(CYC_DIFFERENCE);
        register_api_predefined_function(CYC_DIFFERENT);
        register_api_predefined_function(CYC_DIFFERENT_SYMBOLS);
        register_api_predefined_function(CYC_EVALUATE_SUBL);
        register_api_predefined_function(CYC_EVEN_NUMBER);
        register_api_predefined_function(CYC_EXP);
        register_api_predefined_function(CYC_EXPONENT);
        register_api_predefined_function(CYC_EXTENDED_NUMBER_P);
        register_api_predefined_function(CYC_GREATER_THAN);
        register_api_predefined_function(CYC_GREATER_THAN_OR_EQUAL_TO);
        register_api_predefined_function(CYC_GROUND_TERM);
        register_api_predefined_function(CYC_GUID_STRING_P);
        register_api_predefined_function(CYC_HTTP_URL_ENCODE);
        register_api_predefined_function(CYC_IDENTITY);
        register_api_predefined_function(CYC_INDEXICAL_REFERENT);
        register_api_predefined_function(CYC_INDIVIDUAL_DENOTING_UNARY_FUNCTION_FOR);
        register_api_predefined_function(CYC_INDIVIDUAL_NECESSARY);
        register_api_predefined_function(CYC_INTEGER);
        register_api_predefined_function(CYC_INTEGER_RANGE);
        register_api_predefined_function(CYC_INTEGER_RANGE);
        register_api_predefined_function(CYC_INTEGER_TO_STRING);
        register_api_predefined_function(CYC_INTERVAL_ENDED_BY_LAST_SUBINTERVAL_OF_TYPE);
        register_api_predefined_function(CYC_INTERVAL_STARTED_BY_FIRST_SUBINTERVAL_OF_TYPE);
        register_api_predefined_function(CYC_INVERSE);
        register_api_predefined_function(CYC_IP4_ADDRESS);
        register_api_predefined_function(CYC_IP4_NETWORK_ADDRESS);
        register_api_predefined_function(CYC_LATER_THAN);
        register_api_predefined_function(CYC_LESS_THAN);
        register_api_predefined_function(CYC_LESS_THAN_OR_EQUAL_TO);
        register_api_predefined_function(CYC_LIST_CONCATENATE);
        register_api_predefined_function(CYC_LIST_FIRST);
        register_api_predefined_function(CYC_LIST_LAST);
        register_api_predefined_function(CYC_LIST_LENGTH);
        register_api_predefined_function(CYC_LIST_MEMBER_SET);
        register_api_predefined_function(CYC_LIST_NTH);
        register_api_predefined_function(CYC_LIST_OF_TYPE_NECESSARY);
        register_api_predefined_function(CYC_LIST_OF_TYPE_SUFFICIENT);
        register_api_predefined_function(CYC_LIST_REST);
        register_api_predefined_function(CYC_LIST_REVERSE);
        register_api_predefined_function(CYC_LIST_SEARCH);
        register_api_predefined_function(CYC_LIST_SUBSEQ);
        register_api_predefined_function(CYC_LIST_WITHOUT_REPETITION);
        register_api_predefined_function(CYC_LOG);
        register_api_predefined_function(CYC_LOGARITHM);
        register_api_predefined_function(CYC_MAKE_FORMULA);
        register_api_predefined_function(CYC_MAP_FUNCTION_OVER_LIST);
        register_api_predefined_function(CYC_MAX_RANGE);
        register_api_predefined_function(CYC_MAXIMUM);
        register_api_predefined_function(CYC_MIN_RANGE);
        register_api_predefined_function(CYC_MINIMUM);
        register_api_predefined_function(CYC_MINUS);
        register_api_predefined_function(CYC_NEGATIVE_INTEGER);
        register_api_predefined_function(CYC_NEGATIVE_NUMBER);
        register_api_predefined_function(CYC_NEXT_ITERATED_CYCLIC_INTERVAL);
        register_api_predefined_function(CYC_NON_NEGATIVE_INTEGER);
        register_api_predefined_function(CYC_NON_NEGATIVE_NUMBER);
        register_api_predefined_function(CYC_NON_POSITIVE_INTEGER);
        register_api_predefined_function(CYC_NON_POSITIVE_NUMBER);
        register_api_predefined_function(CYC_NTH_METRICALLY_PRECEDING_TIME_INTERVAL_OF_TYPE);
        register_api_predefined_function(CYC_NTH_METRICALLY_SUCCEEDING_TIME_INTERVAL_OF_TYPE);
        register_api_predefined_function(CYC_NUMBER_STRING);
        register_api_predefined_function(CYC_NUMERAL_STRING);
        register_api_predefined_function(CYC_NUMERIC_STRING_NECESSARY);
        register_api_predefined_function(CYC_NUMERICALLY_EQUAL);
        register_api_predefined_function(CYC_ODD_NUMBER);
        register_api_predefined_function(CYC_PERCENT);
        register_api_predefined_function(CYC_PLUS);
        register_api_predefined_function(CYC_PLUS_ALL);
        register_api_predefined_function(CYC_POSITION);
        register_api_predefined_function(CYC_POSITIVE_INTEGER);
        register_api_predefined_function(CYC_POSITIVE_NUMBER);
        register_api_predefined_function(CYC_POST_REMOVE);
        register_api_predefined_function(CYC_PRE_REMOVE);
        register_api_predefined_function(CYC_PREFIX_SUBSTRING);
        register_api_predefined_function($sym370$CYC_PRIME_NUMBER_);
        register_api_predefined_function(CYC_QUANTITY_CONVERSION);
        register_api_predefined_function(CYC_QUANTITY_INTERSECTS);
        register_api_predefined_function(CYC_QUANTITY_SUBSUMES);
        register_api_predefined_function(CYC_QUOTIENT);
        register_api_predefined_function(CYC_RATIONAL_NUMBER);
        register_api_predefined_function(CYC_REAL_0_1);
        register_api_predefined_function(CYC_REAL_1_INFINITY);
        register_api_predefined_function(CYC_REAL_NUMBER);
        register_api_predefined_function(CYC_RECAPITALIZE_SMART);
        register_api_predefined_function(CYC_RELATION_ARG);
        register_api_predefined_function(CYC_RELATION_ARG_SET);
        register_api_predefined_function(CYC_RELATION_ARGS_LIST);
        register_api_predefined_function(CYC_RELATION_EXPRESSION_ARITY);
        register_api_predefined_function(CYC_REPLACE_SUBSTRING);
        register_api_predefined_function(CYC_ROUND_CLOSEST);
        register_api_predefined_function(CYC_ROUND_DOWN);
        register_api_predefined_function(CYC_ROUND_UP);
        register_api_predefined_function(CYC_SCIENTIFIC_NUMBER_FROM_STRING);
        register_api_predefined_function(CYC_SCIENTIFIC_NUMBER_FROM_SUBL_REAL);
        register_api_predefined_function(CYC_SCIENTIFIC_NUMBER_P);
        register_api_predefined_function(CYC_SCIENTIFIC_NUMBER_SIGNIFICANT_DIGIT_COUNT);
        register_api_predefined_function(CYC_SCIENTIFIC_NUMBER_TO_STRING);
        register_api_predefined_function(CYC_SCIENTIFIC_NUMBER_TO_SUBL_REAL);
        register_api_predefined_function(CYC_SECANT);
        register_api_predefined_function(CYC_SET_DIFFERENCE);
        register_api_predefined_function(CYC_SET_EXTENT);
        register_api_predefined_function(CYC_SET_OF_TYPE_NECESSARY);
        register_api_predefined_function(CYC_SET_OF_TYPE_SUFFICIENT);
        register_api_predefined_function(CYC_SIGNIFICANT_DIGITS);
        register_api_predefined_function(CYC_SINE);
        register_api_predefined_function(CYC_SKSI_SOURCE_ACCESSIBLE);
        register_api_predefined_function(CYC_SKSI_SOURCE_ACTIVATED);
        register_api_predefined_function(CYC_SKSI_SOURCE_QUERYABLE);
        register_api_predefined_function(CYC_SKSI_SOURCE_REGISTERED);
        register_api_predefined_function(CYC_SQRT);
        register_api_predefined_function(CYC_STRING_CONCAT);
        register_api_predefined_function(CYC_STRING_TO_INTEGER);
        register_api_predefined_function(CYC_STRING_TO_REAL_NUMBER);
        register_api_predefined_function(CYC_STRING_TOKENIZE_NEW);
        register_api_predefined_function(CYC_STRING_UPCASE);
        register_api_predefined_function(CYC_STRINGS_TO_PHRASE);
        register_api_predefined_function(CYC_SUBL_ESCAPE);
        register_api_predefined_function(CYC_SUBL_EXPRESSION);
        register_api_predefined_function(CYC_SUBL_TEMPLATE);
        register_api_predefined_function($sym415$CYC_SUBLIST_);
        register_api_predefined_function(CYC_SUBSTITUTE_FORMULA);
        register_api_predefined_function(CYC_SUBSTITUTE_FORMULA_ARG);
        register_api_predefined_function(CYC_SUBSTITUTE_FORMULA_ARG_POSITION);
        register_api_predefined_function(CYC_SUBSTRING);
        register_api_predefined_function(CYC_SUBSTRING_CASE_INSENSITIVE_PREDICATE);
        register_api_predefined_function(CYC_SUBSTRING_PREDICATE);
        register_api_predefined_function(CYC_SUBWORD_PREDICATE);
        register_api_predefined_function(CYC_SUFFIX_SUBSTRING);
        register_api_predefined_function(CYC_SYSTEM_ATOM);
        register_api_predefined_function(CYC_SYSTEM_CHARACTER_P);
        register_api_predefined_function(CYC_SYSTEM_INTEGER);
        register_api_predefined_function(CYC_SYSTEM_NON_VARIABLE_SYMBOL_P);
        register_api_predefined_function(CYC_SYSTEM_REAL_NUMBER_P);
        register_api_predefined_function(CYC_SYSTEM_STRING_P);
        register_api_predefined_function(CYC_SYSTEM_TERM_P);
        register_api_predefined_function(CYC_TANGENT);
        register_api_predefined_function(CYC_TIME_ELAPSED);
        register_api_predefined_function(CYC_TIME_ELAPSED_DECODE_STRING);
        register_api_predefined_function(CYC_TIME_ELAPSED_ENCODE_STRING);
        register_api_predefined_function(CYC_TIMES);
        register_api_predefined_function(CYC_TRIM_WHITESPACE);
        register_api_predefined_function(CYC_TRUE_SUBL);
        register_api_predefined_function(CYC_TYPES_MOST_OFTEN_ASSERTED_USING_TOOL);
        register_api_predefined_function(CYC_UNICODE_DENOTING_ASCII_STRING_P);
        register_api_predefined_function(CYC_ZIP_CODE_FIVE_DIGIT);
        register_api_predefined_function(CYC_ZIP_CODE_NINE_DIGIT);
        register_api_predefined_function($sym442$CYCL_ASSERTED_ASSERTION_);
        register_api_predefined_function($sym443$CYCL_ASSERTION_);
        register_api_predefined_function($sym444$CYCL_ATOMIC_ASSERTION_);
        register_api_predefined_function($sym445$CYCL_ATOMIC_SENTENCE_);
        register_api_predefined_function(CYCL_ATOMIC_TERM_P);
        register_api_predefined_function($sym447$CYCL_CLOSED_ATOMIC_SENTENCE_);
        register_api_predefined_function(CYCL_CLOSED_ATOMIC_TERM_P);
        register_api_predefined_function($sym449$CYCL_CLOSED_DENOTATIONAL_TERM_);
        register_api_predefined_function($sym450$CYCL_CLOSED_EXPRESSION_);
        register_api_predefined_function($sym451$CYCL_CLOSED_FORMULA_);
        register_api_predefined_function($sym452$CYCL_CLOSED_NON_ATOMIC_TERM_);
        register_api_predefined_function($sym453$CYCL_CLOSED_SENTENCE_);
        register_api_predefined_function(CYCL_CONSTANT_P);
        register_api_predefined_function($sym455$CYCL_DEDUCED_ASSERTION_);
        register_api_predefined_function(CYCL_DENOTATIONAL_TERM_P);
        register_api_predefined_function($sym457$CYCL_EXPRESSION_ASKABLE_);
        register_api_predefined_function($sym458$CYCL_EXPRESSION_ASSERTIBLE_);
        register_api_predefined_function($sym459$CYCL_EXPRESSION_);
        register_api_predefined_function($sym460$CYCL_FORMULA_);
        register_api_predefined_function($sym461$CYCL_GAF_ASSERTION_);
        register_api_predefined_function($sym462$CYCL_INDEXED_TERM_);
        register_api_predefined_function($sym463$CYCL_NL_SEMANTIC_ASSERTION_);
        register_api_predefined_function($sym464$CYCL_NON_ATOMIC_REIFIED_TERM_);
        register_api_predefined_function($sym465$CYCL_NON_ATOMIC_TERM_ASKABLE_);
        register_api_predefined_function($sym466$CYCL_NON_ATOMIC_TERM_ASSERTIBLE_);
        register_api_predefined_function($sym467$CYCL_NON_ATOMIC_TERM_);
        register_api_predefined_function($sym468$CYCL_OPEN_DENOTATIONAL_TERM_);
        register_api_predefined_function($sym469$CYCL_OPEN_EXPRESSION_);
        register_api_predefined_function($sym470$CYCL_OPEN_FORMULA_);
        register_api_predefined_function($sym471$CYCL_OPEN_NON_ATOMIC_TERM_);
        register_api_predefined_function($sym472$CYCL_OPEN_SENTENCE_);
        register_api_predefined_function($sym473$CYCL_PROPOSITIONAL_SENTENCE_);
        register_api_predefined_function($sym474$CYCL_REFORMULATOR_RULE_);
        register_api_predefined_function($sym475$CYCL_REIFIABLE_DENOTATIONAL_TERM_);
        register_api_predefined_function($sym476$CYCL_REIFIABLE_NON_ATOMIC_TERM_);
        register_api_predefined_function($sym477$CYCL_REIFIED_DENOTATIONAL_TERM_);
        register_api_predefined_function(CYCL_REPRESENTED_ATOMIC_TERM_P);
        register_api_predefined_function($sym479$CYCL_REPRESENTED_TERM_);
        register_api_predefined_function($sym480$CYCL_RULE_ASSERTION_);
        register_api_predefined_function($sym481$CYCL_SENTENCE_ASKABLE_);
        register_api_predefined_function($sym482$CYCL_SENTENCE_ASSERTIBLE_);
        register_api_predefined_function($sym483$CYCL_SENTENCE_);
        register_api_predefined_function(CYCL_SUBL_SYMBOL_P);
        register_api_predefined_function(CYCL_UNBOUND_RELATION_FORMULA_P);
        register_api_predefined_function($sym486$CYCL_VAR_LIST_);
        register_api_predefined_function(CYCL_VARIABLE_P);
        register_api_predefined_function($sym488$CYCSECURE_SUB_SOFTWARE_OBJECTS_);
        register_api_predefined_function($sym489$CYCSECURE_VERSION_OF_SOFTWARE_);
        register_api_predefined_function($sym490$GAF_);
        register_api_predefined_function(GEN_TEMPLATE_RECIPE_P);
        register_api_predefined_function(GENERATE_NAMES_FOR_TERM);
        register_api_predefined_function(GENERATE_PHRASE_DEFN);
        register_api_predefined_function(HL_EXTERNAL_ID_STRING_P);
        register_api_predefined_function($sym495$IBQE_);
        register_api_predefined_function(INTEGERP);
        register_api_predefined_function(KEYWORDP);
        register_api_predefined_function($sym498$KWTE_);
        register_api_predefined_function(LISTP);
        register_api_predefined_function($sym500$MONAD_CYCL_MT_);
        register_api_predefined_function($sym501$NON_NEGATIVE_SCALAR_INTERVAL_);
        register_api_predefined_function($sym502$POSITIVE_SCALAR_INTERVAL_);
        register_api_predefined_function(PRE_REMOVE_DEFINITE_ARTICLE_FROM_STRING);
        register_api_predefined_function(RTP_SYNTACTIC_CONSTRAINT);
        register_api_predefined_function($sym505$SCALAR_POINT_VALUE_);
        register_api_predefined_function($sym506$STRING_W_O_CONTROL_CHARS_);
        register_api_predefined_function(STRINGP);
        register_api_predefined_function(SUBL_NON_VARIABLE_NON_KEYWORD_SYMBOL_P);
        register_api_predefined_function(SYMBOLP);
        register_api_predefined_function(TEMPORAL_DIMENSION_MT_P);
        register_api_predefined_function(TRUE);
        register_api_predefined_function(URL_P);
        cdolist_list_var = $list513;
        symbol = NIL;
        symbol = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            register_api_predefined_function(symbol);
            cdolist_list_var = cdolist_list_var.rest();
            symbol = cdolist_list_var.first();
        } 
        return NIL;
    }

    static private final SubLSymbol $sym260$CYC_PRIME_NUMBER_ = makeSymbol("CYC-PRIME-NUMBER?");

    static private final SubLSymbol $sym305$CYC_SUBLIST_ = makeSymbol("CYC-SUBLIST?");

    static private final SubLSymbol $sym332$CYCL_ASSERTED_ASSERTION_ = makeSymbol("CYCL-ASSERTED-ASSERTION?");

    static private final SubLSymbol $sym333$CYCL_ASSERTION_ = makeSymbol("CYCL-ASSERTION?");

    static private final SubLSymbol $sym334$CYCL_ATOMIC_ASSERTION_ = makeSymbol("CYCL-ATOMIC-ASSERTION?");

    static private final SubLSymbol $sym335$CYCL_ATOMIC_SENTENCE_ = makeSymbol("CYCL-ATOMIC-SENTENCE?");

    static private final SubLSymbol $sym337$CYCL_CLOSED_ATOMIC_SENTENCE_ = makeSymbol("CYCL-CLOSED-ATOMIC-SENTENCE?");

    static private final SubLSymbol $sym339$CYCL_CLOSED_DENOTATIONAL_TERM_ = makeSymbol("CYCL-CLOSED-DENOTATIONAL-TERM?");

    static private final SubLSymbol $sym340$CYCL_CLOSED_EXPRESSION_ = makeSymbol("CYCL-CLOSED-EXPRESSION?");

    static private final SubLSymbol $sym341$CYCL_CLOSED_FORMULA_ = makeSymbol("CYCL-CLOSED-FORMULA?");

    static private final SubLSymbol $sym342$CYCL_CLOSED_NON_ATOMIC_TERM_ = makeSymbol("CYCL-CLOSED-NON-ATOMIC-TERM?");

    static private final SubLSymbol $sym343$CYCL_CLOSED_SENTENCE_ = makeSymbol("CYCL-CLOSED-SENTENCE?");

    static private final SubLSymbol $sym345$CYCL_DEDUCED_ASSERTION_ = makeSymbol("CYCL-DEDUCED-ASSERTION?");

    static private final SubLSymbol $sym347$CYCL_EXPRESSION_ASKABLE_ = makeSymbol("CYCL-EXPRESSION-ASKABLE?");

    static private final SubLSymbol $sym348$CYCL_EXPRESSION_ASSERTIBLE_ = makeSymbol("CYCL-EXPRESSION-ASSERTIBLE?");

    static private final SubLSymbol $sym349$CYCL_EXPRESSION_ = makeSymbol("CYCL-EXPRESSION?");

    static private final SubLSymbol $sym350$CYCL_FORMULA_ = makeSymbol("CYCL-FORMULA?");

    static private final SubLSymbol $sym351$CYCL_GAF_ASSERTION_ = makeSymbol("CYCL-GAF-ASSERTION?");

    static private final SubLSymbol $sym352$CYCL_INDEXED_TERM_ = makeSymbol("CYCL-INDEXED-TERM?");

    static private final SubLSymbol $sym353$CYCL_NL_SEMANTIC_ASSERTION_ = makeSymbol("CYCL-NL-SEMANTIC-ASSERTION?");

    static private final SubLSymbol $sym354$CYCL_NON_ATOMIC_REIFIED_TERM_ = makeSymbol("CYCL-NON-ATOMIC-REIFIED-TERM?");

    static private final SubLSymbol $sym355$CYCL_NON_ATOMIC_TERM_ASKABLE_ = makeSymbol("CYCL-NON-ATOMIC-TERM-ASKABLE?");

    static private final SubLSymbol $sym356$CYCL_NON_ATOMIC_TERM_ASSERTIBLE_ = makeSymbol("CYCL-NON-ATOMIC-TERM-ASSERTIBLE?");

    static private final SubLSymbol $sym357$CYCL_NON_ATOMIC_TERM_ = makeSymbol("CYCL-NON-ATOMIC-TERM?");

    static private final SubLSymbol $sym358$CYCL_OPEN_DENOTATIONAL_TERM_ = makeSymbol("CYCL-OPEN-DENOTATIONAL-TERM?");

    static private final SubLSymbol $sym359$CYCL_OPEN_EXPRESSION_ = makeSymbol("CYCL-OPEN-EXPRESSION?");

    static private final SubLSymbol $sym360$CYCL_OPEN_FORMULA_ = makeSymbol("CYCL-OPEN-FORMULA?");

    static private final SubLSymbol $sym361$CYCL_OPEN_NON_ATOMIC_TERM_ = makeSymbol("CYCL-OPEN-NON-ATOMIC-TERM?");

    static private final SubLSymbol $sym362$CYCL_OPEN_SENTENCE_ = makeSymbol("CYCL-OPEN-SENTENCE?");

    static private final SubLSymbol $sym363$CYCL_PROPOSITIONAL_SENTENCE_ = makeSymbol("CYCL-PROPOSITIONAL-SENTENCE?");

    static private final SubLSymbol $sym364$CYCL_REFORMULATOR_RULE_ = makeSymbol("CYCL-REFORMULATOR-RULE?");

    static private final SubLSymbol $sym365$CYCL_REIFIABLE_DENOTATIONAL_TERM_ = makeSymbol("CYCL-REIFIABLE-DENOTATIONAL-TERM?");

    static private final SubLSymbol $sym366$CYCL_REIFIABLE_NON_ATOMIC_TERM_ = makeSymbol("CYCL-REIFIABLE-NON-ATOMIC-TERM?");

    static private final SubLSymbol $sym367$CYCL_REIFIED_DENOTATIONAL_TERM_ = makeSymbol("CYCL-REIFIED-DENOTATIONAL-TERM?");

    static private final SubLSymbol $sym369$CYCL_REPRESENTED_TERM_ = makeSymbol("CYCL-REPRESENTED-TERM?");

    static private final SubLSymbol $sym370$CYCL_RULE_ASSERTION_ = makeSymbol("CYCL-RULE-ASSERTION?");

    static private final SubLSymbol $sym371$CYCL_SENTENCE_ASKABLE_ = makeSymbol("CYCL-SENTENCE-ASKABLE?");

    static private final SubLSymbol $sym372$CYCL_SENTENCE_ASSERTIBLE_ = makeSymbol("CYCL-SENTENCE-ASSERTIBLE?");

    static private final SubLSymbol $sym373$CYCL_SENTENCE_ = makeSymbol("CYCL-SENTENCE?");

    static private final SubLSymbol $sym376$CYCL_VAR_LIST_ = makeSymbol("CYCL-VAR-LIST?");

    static private final SubLSymbol $sym378$CYCSECURE_SUB_SOFTWARE_OBJECTS_ = makeSymbol("CYCSECURE-SUB-SOFTWARE-OBJECTS?");

    static private final SubLSymbol $sym379$CYCSECURE_VERSION_OF_SOFTWARE_ = makeSymbol("CYCSECURE-VERSION-OF-SOFTWARE?");

    static private final SubLSymbol $sym380$GAF_ = makeSymbol("GAF?");

    static private final SubLSymbol $sym385$IBQE_ = makeSymbol("IBQE?");

    static private final SubLSymbol $sym388$KWTE_ = makeSymbol("KWTE?");

    static private final SubLSymbol $sym390$MONAD_CYCL_MT_ = makeSymbol("MONAD-CYCL-MT?");

    static private final SubLSymbol $sym391$NON_NEGATIVE_SCALAR_INTERVAL_ = makeSymbol("NON-NEGATIVE-SCALAR-INTERVAL?");

    static private final SubLSymbol $sym392$POSITIVE_SCALAR_INTERVAL_ = makeSymbol("POSITIVE-SCALAR-INTERVAL?");

    static private final SubLSymbol $sym395$SCALAR_POINT_VALUE_ = makeSymbol("SCALAR-POINT-VALUE?");

    static private final SubLSymbol $sym396$STRING_W_O_CONTROL_CHARS_ = makeSymbol("STRING-W/O-CONTROL-CHARS?");

    static private final SubLList $list_alt403 = list(makeSymbol("NEW-CYC-QUERY"), makeSymbol("NTH-VALUE"), makeSymbol("INFERENCE-ALL-ANSWERS"), makeSymbol("INFERENCE-ANSWER-JUSTIFICATIONS"), makeSymbol("INFERENCE-ANSWER-JUSTIFICATION-SUPPORTS"), makeSymbol("HL-JUSTIFY"), makeSymbol("HL-JUSTIFY-EXPANDED"));

    private static SubLObject _constant_64_initializer() {
        return list(new SubLObject[]{ maybeMake("*"), maybeMake("+"), maybeMake("-"), maybeMake("/"), maybeMake("/="), maybeMake("<"), maybeMake("<="), maybeMake("="), maybeMake(">"), maybeMake(">"), maybeMake(">="), maybeMake("ABS"), maybeMake("ACONS"), maybeMake("ACOS"), maybeMake("ADJOIN"), maybeMake("ALPHA-CHAR-P"), maybeMake("ALPHANUMERICP"), maybeMake("APPEND"), maybeMake("AREF"), maybeMake("ASH"), maybeMake("ASIN"), maybeMake("ASSOC"), maybeMake("ASSOC-IF"), maybeMake("ATAN"), maybeMake("ATOM"), maybeMake("BOOLE"), maybeMake("BOOLEAN"), maybeMake("BOTH-CASE-P"), maybeMake("BQ-CONS"), maybeMake("BQ-VECTOR"), maybeMake("BUTLAST"), maybeMake("BYTE"), maybeMake("CAAR"), maybeMake("CADR"), maybeMake("CAR"), maybeMake("CCONCATENATE"), maybeMake("CDAR"), maybeMake("CDDR"), maybeMake("CDR"), maybeMake("CEILING"), maybeMake("CERROR"), maybeMake("CHAR"), maybeMake("CHAR-CODE"), maybeMake("CHAR-DOWNCASE"), maybeMake("CHAR-EQUAL"), maybeMake("CHAR-GREATERP"), maybeMake("CHAR-LESSP"), maybeMake("CHAR-NOT-EQUAL"), maybeMake("CHAR-NOT-GREATERP"), maybeMake("CHAR-NOT-LESSP"), maybeMake("CHAR-UPCASE"), maybeMake("CHAR/="), maybeMake("CHAR<"), maybeMake("CHAR<="), maybeMake("CHAR="), maybeMake("CHAR>"), maybeMake("CHAR>="), maybeMake("CHARACTERP"), maybeMake("CLRHASH"), maybeMake("CMERGE"), maybeMake("CODE-CHAR"), maybeMake("CONS"), maybeMake("CONSP"), maybeMake("CONSTANTP"), maybeMake("CONSTRUCT-FILENAME"), maybeMake("COPY-ALIST"), maybeMake("COPY-LIST"), maybeMake("COPY-SEQ"), maybeMake("COPY-TREE"), maybeMake("COS"), maybeMake("COUNT"), maybeMake("COUNT-IF"), maybeMake("CREDUCE"), maybeMake("CURRENT-PROCESS"), maybeMake("DATE-RELATIVE-GUID-P"), maybeMake("DECODE-FLOAT"), maybeMake("DECODE-UNIVERSAL-TIME"), maybeMake("DELETE"), maybeMake("DELETE-DUPLICATES"), maybeMake("DELETE-IF"), maybeMake("DIGIT-CHAR"), maybeMake("DIGIT-CHAR-P"), maybeMake("DISASSEMBLE-INTEGER-TO-FIXNUMS"), maybeMake("DPB"), maybeMake("EIGHTH"), maybeMake("ELT"), maybeMake("ENCODE-UNIVERSAL-TIME"), maybeMake("ENDP"), EQ, EQL, EQUAL, EQUALP, maybeMake("EVENP"), maybeMake("EXIT"), maybeMake("EXP"), maybeMake("EXPT"), maybeMake("FALSE"), maybeMake("FIFTH"), maybeMake("FILL"), maybeMake("FIND"), maybeMake("FIND-IF"), maybeMake("FIND-PACKAGE"), maybeMake("FIND-SYMBOL"), maybeMake("FIRST"), maybeMake("FIXNUMP"), maybeMake("FLOAT"), maybeMake("FLOAT-DIGITS"), maybeMake("FLOAT-RADIX"), maybeMake("FLOAT-SIGN"), maybeMake("FLOATP"), maybeMake("FLOOR"), maybeMake("FORCE-OUTPUT"), maybeMake("FORMAT"), maybeMake("FOURTH"), maybeMake("FRESH-LINE"), maybeMake("FUNCTION-SPEC-P"), maybeMake("FUNCTIONP"), maybeMake("GC"), maybeMake("GC-DYNAMIC"), maybeMake("GC-EPHEMERAL"), maybeMake("GC-FULL"), maybeMake("GENSYM"), maybeMake("GENTEMP"), maybeMake("GET"), maybeMake("GET-DECODED-TIME"), maybeMake("GET-INTERNAL-REAL-TIME"), maybeMake("GET-INTERNAL-REAL-TIME"), maybeMake("GET-INTERNAL-RUN-TIME"), maybeMake("GET-UNIVERSAL-TIME"), maybeMake("GET-UNIVERSAL-TIME"), maybeMake("GETF"), maybeMake("GETHASH"), maybeMake("GETHASH-WITHOUT-VALUES"), maybeMake("GUID-P"), maybeMake("GUID-STRING-P"), maybeMake("GUID-TO-STRING"), maybeMake("GUID/="), maybeMake("GUID<"), maybeMake("GUID<="), maybeMake("GUID="), maybeMake("GUID>"), maybeMake("GUID>="), maybeMake("HASH-TABLE-COUNT"), maybeMake("HASH-TABLE-P"), maybeMake("HASH-TABLE-SIZE"), maybeMake("HASH-TABLE-TEST"), IDENTITY, maybeMake("IGNORE"), maybeMake("INFINITY-P"), maybeMake("INT/"), maybeMake("INTEGER-DECODE-FLOAT"), maybeMake("INTEGER-LENGTH"), maybeMake("INTEGERP"), maybeMake("INTERN"), maybeMake("INTERRUPT-PROCESS"), maybeMake("INTERSECTION"), maybeMake("ISQRT"), maybeMake("KEYWORDP"), maybeMake("KILL-PROCESS"), maybeMake("LAST"), maybeMake("LDB"), maybeMake("LDIFF"), maybeMake("LENGTH"), maybeMake("LISP-IMPLEMENTATION-TYPE"), maybeMake("LISP-IMPLEMENTATION-VERSION"), maybeMake("LIST"), maybeMake("LIST*"), maybeMake("LIST-ALL-PACKAGES"), maybeMake("LIST-LENGTH"), maybeMake("LISTP"), maybeMake("LISTP"), maybeMake("LOCK-IDLE-P"), maybeMake("LOCK-P"), maybeMake("LOG"), maybeMake("LOGAND"), maybeMake("LOGANDC1"), maybeMake("LOGANDC2"), maybeMake("LOGBITP"), maybeMake("LOGCOUNT"), maybeMake("LOGEQV"), maybeMake("LOGIOR"), maybeMake("LOGNAND"), maybeMake("LOGNOR"), maybeMake("LOGNOT"), maybeMake("LOGORC1"), maybeMake("LOGORC2"), maybeMake("LOGTEST"), maybeMake("LOGXOR"), maybeMake("LOWER-CASE-P"), maybeMake("MAKE-HASH-TABLE"), maybeMake("MAKE-LOCK"), maybeMake("MAKE-LOCK"), maybeMake("MAKE-STRING"), maybeMake("MAKUNBOUND"), maybeMake("MAX"), maybeMake("MEMBER"), maybeMake("MEMBER-IF"), maybeMake("MIN"), maybeMake("MINUSP"), maybeMake("MISMATCH"), maybeMake("MOD"), maybeMake("NBUTLAST"), maybeMake("NCONC"), maybeMake("NEW-GUID"), maybeMake("NINTERSECTION"), maybeMake("NINTH"), maybeMake("NOT-A-NUMBER-P"), maybeMake("NOTE-PERCENT-PROGRESS"), maybeMake("NOTIFY"), maybeMake("NRECONC"), maybeMake("NREVERSE"), maybeMake("NSET-DIFFERENCE"), maybeMake("NSET-EXCLUSIVE-OR"), maybeMake("NSTRING-CAPITALIZE"), maybeMake("NSTRING-DOWNCASE"), maybeMake("NSTRING-UPCASE"), maybeMake("NSUBLIS"), maybeMake("NSUBST"), maybeMake("NSUBST-IF"), maybeMake("NSUBSTITUTE"), maybeMake("NSUBSTITUTE-IF"), maybeMake("NTH"), maybeMake("NTHCDR"), maybeMake("NULL"), maybeMake("NUMBERP"), maybeMake("NUMBERP"), maybeMake("NUNION"), maybeMake("ODDP"), maybeMake("PAIRLIS"), maybeMake("PEEK-CHAR"), maybeMake("PLUSP"), maybeMake("POSITION"), maybeMake("POSITION-IF"), maybeMake("PRIN1"), maybeMake("PRIN1-TO-STRING"), maybeMake("PRINC"), maybeMake("PRINC-TO-STRING"), maybeMake("PRINT"), maybeMake("PROCESS-ACTIVE-P"), maybeMake("PROCESS-BLOCK"), maybeMake("PROCESS-NAME"), maybeMake("PROCESS-STATE"), maybeMake("PROCESS-UNBLOCK"), maybeMake("PROCESS-WAIT"), maybeMake("PROCESS-WAIT-WITH-TIMEOUT"), maybeMake("PROCESS-WHOSTATE"), maybeMake("PROCESSP"), maybeMake("RANDOM"), maybeMake("RASSOC"), maybeMake("RASSOC-IF"), maybeMake("READ-FROM-STRING"), maybeMake("READ-FROM-STRING-IGNORING-ERRORS"), maybeMake("REM"), maybeMake("REMF"), maybeMake("REMHASH"), maybeMake("REMOVE"), maybeMake("REMOVE-DUPLICATES"), maybeMake("REMOVE-IF"), maybeMake("REPLACE"), maybeMake("REST"), maybeMake("REVAPPEND"), maybeMake("REVERSE"), maybeMake("REVERSE"), maybeMake("ROOM"), maybeMake("ROUND"), maybeMake("RPLACA"), maybeMake("RPLACD"), maybeMake("SCALE-FLOAT"), maybeMake("SEARCH"), maybeMake("SECOND"), maybeMake("SEED-RANDOM"), maybeMake("SEQUENCEP"), maybeMake("SET-AREF"), maybeMake("SET-CONSING-STATE"), maybeMake("SET-DIFFERENCE"), maybeMake("SET-NTH"), maybeMake("SEVENTH"), maybeMake("SHOW-PROCESSES"), maybeMake("SIN"), maybeMake("SIXTH"), maybeMake("SLEEP"), maybeMake("SORT"), maybeMake("SQRT"), maybeMake("STABLE-SORT"), maybeMake("STRING"), maybeMake("STRING-CAPITALIZE"), maybeMake("STRING-DOWNCASE"), maybeMake("STRING-EQUAL"), maybeMake("STRING-GREATERP"), maybeMake("STRING-LEFT-TRIM"), maybeMake("STRING-LESSP"), maybeMake("STRING-NOT-EQUAL"), maybeMake("STRING-NOT-GREATERP"), maybeMake("STRING-NOT-LESSP"), maybeMake("STRING-RIGHT-TRIM"), maybeMake("STRING-TO-GUID"), maybeMake("STRING-TRIM"), maybeMake("STRING-UPCASE"), maybeMake("STRING/="), maybeMake("STRING<"), maybeMake("STRING<="), maybeMake("STRING="), maybeMake("STRING>"), maybeMake("STRING>="), maybeMake("STRINGP"), maybeMake("SUBLIS"), maybeMake("SUBSEQ"), maybeMake("SUBSETP"), maybeMake("SUBST"), maybeMake("SUBST-IF"), maybeMake("SUBSTITUTE"), maybeMake("SUBSTITUTE-IF"), maybeMake("SXHASH"), maybeMake("SYMBOL-FUNCTION"), maybeMake("SYMBOL-NAME"), maybeMake("SYMBOLP"), maybeMake("SYMBOLP"), maybeMake("TAILP"), maybeMake("TAN"), maybeMake("TENTH"), maybeMake("TERPRI"), maybeMake("THIRD"), maybeMake("TREE-EQUAL"), maybeMake("TRUE"), maybeMake("TRUNCATE"), maybeMake("TYPE-OF"), maybeMake("UNINTERN"), maybeMake("UNION"), maybeMake("UPPER-CASE-P"), maybeMake("VALID-PROCESS-P"), maybeMake("VALUES"), maybeMake("VECTOR"), maybeMake("VECTORP"), maybeMake("WARN"), maybeMake("WRITE-IMAGE"), maybeMake("Y-OR-N-P"), maybeMake("YES-OR-NO-P"), maybeMake("ZEROP"), maybeMake("PROPERTY-LIST-MEMBER", "SUBLISP"), maybeMake("CDESTRUCTURING-BIND-ERROR", "SUBLISP"), maybeMake("DESTRUCTURING-BIND-MUST-CONSP", "SUBLISP"), maybeMake("DESTRUCTURING-BIND-MUST-LISTP", "SUBLISP") });
    }

    @Override
    public void declareFunctions() {
        declare_eval_in_api_registrations_file();
    }

    @Override
    public void initializeVariables() {
        init_eval_in_api_registrations_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_eval_in_api_registrations_file();
    }

    
}

/**
 * Total time: 445 ms
 */
