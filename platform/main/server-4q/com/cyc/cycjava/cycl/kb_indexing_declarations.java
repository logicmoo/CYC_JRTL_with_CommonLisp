package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class kb_indexing_declarations extends SubLTranslatedFile {
    public static final SubLFile me = new kb_indexing_declarations();

    public static final String myName = "com.cyc.cycjava.cycl.kb_indexing_declarations";

    public static final String myFingerPrint = "825e227b3c5d2ea7e5b5df9f69ec04bb7445acb925803a30ad2aae92693b51d6";

    // deflexical
    // Definitions
    private static final SubLSymbol $default_intermediate_index_equal_test$ = makeSymbol("*DEFAULT-INTERMEDIATE-INDEX-EQUAL-TEST*");



    // Internal Constants
    public static final SubLSymbol $kb_indexing_declaration_store$ = makeSymbol("*KB-INDEXING-DECLARATION-STORE*");

    public static final SubLList $list1 = list(list(makeSymbol("INDEX"), makeSymbol("PLIST"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list2 = list(makeKeyword("DONE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");





    public static final SubLList $list6 = list(makeSymbol("KB-INDEXING-DECLARATION-STORE"));

    public static final SubLSymbol KB_INDEXING_DECLARATION_STORE = makeSymbol("KB-INDEXING-DECLARATION-STORE");

    public static final SubLSymbol DO_KB_INDICES = makeSymbol("DO-KB-INDICES");

    private static final SubLSymbol $TOP_LEVEL_KEY = makeKeyword("TOP-LEVEL-KEY");

    public static final SubLList $list10 = cons(makeSymbol("TOP-LEVEL-KEY"), makeSymbol("REST-KEYS"));

    public static final SubLString $str11$Could_not_find_an_index_with_top_ = makeString("Could not find an index with top-level key ~S");







    public static final SubLList $list15 = list(new SubLObject[]{ makeKeyword("NAME"), makeString("GAF Arg"), makeKeyword("DOMAIN"), list(makeKeyword("NAME"), makeString("term"), makeKeyword("VALIDITY-TEST"), makeSymbol("INDEXED-TERM-P")), makeKeyword("TOP-LEVEL-KEY"), makeKeyword("GAF-ARG"), makeKeyword("KEYS"), list(list(makeKeyword("NAME"), makeString("argnum"), makeKeyword("VALIDITY-TEST"), makeSymbol("POSITIVE-INTEGER-P"), makeKeyword("EQUAL-TEST"), EQL), list(makeKeyword("NAME"), makeString("pred"), makeKeyword("VALIDITY-TEST"), makeSymbol("FORT-P"), makeKeyword("RELEVANCE-TEST"), makeSymbol("RELEVANT-PRED?"), makeKeyword("EQUAL-TEST"), EQL), list(new SubLObject[]{ makeKeyword("NAME"), makeString("mt"), makeKeyword("MT?"), T, makeKeyword("VALIDITY-TEST"), makeSymbol("HLMT-P"), makeKeyword("RELEVANCE-TEST"), makeSymbol("RELEVANT-MT?"), makeKeyword("EQUAL-TEST"), EQUAL })), makeKeyword("RANGE"), list(makeKeyword("NAME"), makeString("gaf"), makeKeyword("VALIDITY-TEST"), makeSymbol("GAF-ASSERTION?"), makeKeyword("DOCUMENTATION"), makeString("A gaf assertion in mt MT with predicate PRED which mentions TERM\nin position ARGNUM")), makeKeyword("DUPLICATE-VALUES?"), T, makeKeyword("NUM-FUNCTION"), makeSymbol("NUM-GAF-ARG-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION"), makeSymbol("RELEVANT-NUM-GAF-ARG-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), makeSymbol("RELEVANT-NUM-GAF-ARG-INDEX-WITH-CUTOFF"), makeKeyword("KEY-FUNCTION"), makeSymbol("KEY-GAF-ARG-INDEX"), makeKeyword("RELEVANT-KEY-FUNCTION"), makeSymbol("RELEVANT-KEY-GAF-ARG-INDEX"), makeKeyword("SIMPLE-MATCH-FUNCTION"), makeSymbol("MATCHES-GAF-ARG-INDEX"), makeKeyword("SIMPLE-KEY-FUNCTION"), makeSymbol("SIMPLE-KEY-GAF-ARG-INDEX"), makeKeyword("GET-SUBINDEX-FUNCTION"), makeSymbol("GET-GAF-ARG-SUBINDEX") });



    public static final SubLList $list17 = list(new SubLObject[]{ makeKeyword("NAME"), makeString("NART Arg"), makeKeyword("DOMAIN"), list(makeKeyword("NAME"), makeString("term"), makeKeyword("VALIDITY-TEST"), makeSymbol("INDEXED-TERM-P")), makeKeyword("TOP-LEVEL-KEY"), makeKeyword("NART-ARG"), makeKeyword("KEYS"), list(list(makeKeyword("NAME"), makeString("argnum"), makeKeyword("VALIDITY-TEST"), makeSymbol("POSITIVE-INTEGER-P"), makeKeyword("EQUAL-TEST"), EQL), list(makeKeyword("NAME"), makeString("func"), makeKeyword("VALIDITY-TEST"), makeSymbol("FORT-P"), makeKeyword("EQUAL-TEST"), EQL)), makeKeyword("RANGE"), list(makeKeyword("NAME"), makeString("tou-ass"), makeKeyword("VALIDITY-TEST"), makeSymbol("TERM-OF-UNIT-ASSERTION-P"), makeKeyword("DOCUMENTATION"), makeString("A #$termOfUnit assertion whose arg2 is a naut with functor FUNC\nwhich mentions TERM in position ARGNUM")), makeKeyword("DUPLICATE-VALUES?"), T, makeKeyword("NUM-FUNCTION"), makeSymbol("NUM-NART-ARG-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION"), makeSymbol("RELEVANT-NUM-NART-ARG-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), makeSymbol("RELEVANT-NUM-NART-ARG-INDEX-WITH-CUTOFF"), makeKeyword("KEY-FUNCTION"), makeSymbol("KEY-NART-ARG-INDEX"), makeKeyword("RELEVANT-KEY-FUNCTION"), makeSymbol("RELEVANT-KEY-NART-ARG-INDEX"), makeKeyword("SIMPLE-MATCH-FUNCTION"), makeSymbol("MATCHES-NART-ARG-INDEX"), makeKeyword("SIMPLE-KEY-FUNCTION"), makeSymbol("SIMPLE-KEY-NART-ARG-INDEX"), makeKeyword("GET-SUBINDEX-FUNCTION"), makeSymbol("GET-NART-ARG-SUBINDEX") });



    public static final SubLList $list19 = list(new SubLObject[]{ makeKeyword("NAME"), makeString("Predicate Extent"), makeKeyword("DOMAIN"), list(makeKeyword("NAME"), makeString("pred"), makeKeyword("VALIDITY-TEST"), makeSymbol("FORT-P")), makeKeyword("TOP-LEVEL-KEY"), makeKeyword("PREDICATE-EXTENT"), makeKeyword("KEYS"), list(list(new SubLObject[]{ makeKeyword("NAME"), makeString("mt"), makeKeyword("MT?"), T, makeKeyword("VALIDITY-TEST"), makeSymbol("HLMT-P"), makeKeyword("RELEVANCE-TEST"), makeSymbol("RELEVANT-MT?"), makeKeyword("EQUAL-TEST"), EQUAL })), makeKeyword("RANGE"), list(makeKeyword("NAME"), makeString("gaf"), makeKeyword("VALIDITY-TEST"), makeSymbol("GAF-ASSERTION?"), makeKeyword("DOCUMENTATION"), makeString("A gaf assertion in mt MT with predicate PRED.")), makeKeyword("DUPLICATE-VALUES?"), NIL, makeKeyword("NUM-FUNCTION"), makeSymbol("NUM-PREDICATE-EXTENT-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION"), makeSymbol("RELEVANT-NUM-PREDICATE-EXTENT-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), makeSymbol("RELEVANT-NUM-PREDICATE-EXTENT-INDEX-WITH-CUTOFF"), makeKeyword("KEY-FUNCTION"), makeSymbol("KEY-PREDICATE-EXTENT-INDEX"), makeKeyword("RELEVANT-KEY-FUNCTION"), makeSymbol("RELEVANT-KEY-PREDICATE-EXTENT-INDEX"), makeKeyword("SIMPLE-MATCH-FUNCTION"), makeSymbol("MATCHES-PREDICATE-EXTENT-INDEX"), makeKeyword("SIMPLE-KEY-FUNCTION"), makeSymbol("SIMPLE-KEY-PREDICATE-EXTENT-INDEX"), makeKeyword("GET-SUBINDEX-FUNCTION"), makeSymbol("GET-PREDICATE-EXTENT-SUBINDEX") });



    public static final SubLList $list21 = list(new SubLObject[]{ makeKeyword("NAME"), makeString("Function Extent"), makeKeyword("TOP-LEVEL-KEY"), makeKeyword("FUNCTION-EXTENT"), makeKeyword("DOMAIN"), list(makeKeyword("NAME"), makeString("func"), makeKeyword("VALIDITY-TEST"), makeSymbol("FORT-P")), makeKeyword("RANGE"), list(makeKeyword("NAME"), makeString("tou-ass"), makeKeyword("VALIDITY-TEST"), makeSymbol("TERM-OF-UNIT-ASSERTION-P"), makeKeyword("DOCUMENTATION"), makeString("A #$termOfUnit assertion whose arg2 is a naut with functor FUNC")), makeKeyword("DUPLICATE-VALUES?"), NIL, makeKeyword("NUM-FUNCTION"), makeSymbol("NUM-FUNCTION-EXTENT-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION"), makeSymbol("RELEVANT-NUM-FUNCTION-EXTENT-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), makeSymbol("RELEVANT-NUM-FUNCTION-EXTENT-INDEX-WITH-CUTOFF"), makeKeyword("SIMPLE-MATCH-FUNCTION"), makeSymbol("MATCHES-FUNCTION-EXTENT-INDEX"), makeKeyword("GET-SUBINDEX-FUNCTION"), makeSymbol("GET-FUNCTION-EXTENT-SUBINDEX") });



    public static final SubLList $list23 = list(new SubLObject[]{ makeKeyword("NAME"), makeString("Predicate Rules"), makeKeyword("DOMAIN"), list(makeKeyword("NAME"), makeString("pred"), makeKeyword("VALIDITY-TEST"), makeSymbol("FORT-P")), makeKeyword("TOP-LEVEL-KEY"), makeKeyword("PREDICATE-RULE"), makeKeyword("KEYS"), list(list(makeKeyword("NAME"), makeString("sense"), makeKeyword("VALIDITY-TEST"), makeSymbol("SENSE-P"), makeKeyword("EQUAL-TEST"), EQ), list(new SubLObject[]{ makeKeyword("NAME"), makeString("mt"), makeKeyword("MT?"), T, makeKeyword("VALIDITY-TEST"), makeSymbol("HLMT-P"), makeKeyword("RELEVANCE-TEST"), makeSymbol("RELEVANT-MT?"), makeKeyword("EQUAL-TEST"), EQUAL }), list(makeKeyword("NAME"), makeString("direction"), makeKeyword("VALIDITY-TEST"), makeSymbol("DIRECTION-P"), makeKeyword("EQUAL-TEST"), EQ)), makeKeyword("RANGE"), list(makeKeyword("NAME"), makeString("rule"), makeKeyword("VALIDITY-TEST"), makeSymbol("RULE-ASSERTION?"), makeKeyword("DOCUMENTATION"), makeString("A rule assertion in mt MT with direction DIRECTION, which contains\na SENSE-lit with predicate PRED")), makeKeyword("DUPLICATE-VALUES?"), T, makeKeyword("NUM-FUNCTION"), makeSymbol("NUM-PREDICATE-RULE-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION"), makeSymbol("RELEVANT-NUM-PREDICATE-RULE-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), makeSymbol("RELEVANT-NUM-PREDICATE-RULE-INDEX-WITH-CUTOFF"), makeKeyword("KEY-FUNCTION"), makeSymbol("KEY-PREDICATE-RULE-INDEX"), makeKeyword("RELEVANT-KEY-FUNCTION"), makeSymbol("RELEVANT-KEY-PREDICATE-RULE-INDEX"), makeKeyword("SIMPLE-MATCH-FUNCTION"), makeSymbol("MATCHES-PREDICATE-RULE-INDEX"), makeKeyword("SIMPLE-KEY-FUNCTION"), makeSymbol("SIMPLE-KEY-PREDICATE-RULE-INDEX"), makeKeyword("GET-SUBINDEX-FUNCTION"), makeSymbol("GET-PREDICATE-RULE-SUBINDEX") });

    private static final SubLSymbol $DECONTEXTUALIZED_IST_PREDICATE_RULE = makeKeyword("DECONTEXTUALIZED-IST-PREDICATE-RULE");

    public static final SubLList $list25 = list(new SubLObject[]{ makeKeyword("NAME"), makeString("Decontextualized #$ist Predicate Rules"), makeKeyword("DOMAIN"), list(makeKeyword("NAME"), makeString("pred"), makeKeyword("VALIDITY-TEST"), makeSymbol("FORT-P")), makeKeyword("TOP-LEVEL-KEY"), makeKeyword("DECONTEXTUALIZED-IST-PREDICATE-RULE"), makeKeyword("KEYS"), list(list(makeKeyword("NAME"), makeString("sense"), makeKeyword("VALIDITY-TEST"), makeSymbol("SENSE-P"), makeKeyword("EQUAL-TEST"), EQ), list(makeKeyword("NAME"), makeString("direction"), makeKeyword("VALIDITY-TEST"), makeSymbol("DIRECTION-P"), makeKeyword("EQUAL-TEST"), EQ)), makeKeyword("RANGE"), list(makeKeyword("NAME"), makeString("rule"), makeKeyword("VALIDITY-TEST"), makeSymbol("RULE-ASSERTION?"), makeKeyword("DOCUMENTATION"), makeString("A rule assertion with direction DIRECTION, which contains\na SENSE-lit wrapped in an #$ist with predicate PRED.  The mt of the rule is ignored.")), makeKeyword("DUPLICATE-VALUES?"), T, makeKeyword("NUM-FUNCTION"), makeSymbol("NUM-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION"), makeSymbol("RELEVANT-NUM-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), makeSymbol("RELEVANT-NUM-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX-WITH-CUTOFF"), makeKeyword("KEY-FUNCTION"), makeSymbol("KEY-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX"), makeKeyword("RELEVANT-KEY-FUNCTION"), makeSymbol("RELEVANT-KEY-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX"), makeKeyword("SIMPLE-MATCH-FUNCTION"), makeSymbol("MATCHES-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX"), makeKeyword("SIMPLE-KEY-FUNCTION"), makeSymbol("SIMPLE-KEY-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX"), makeKeyword("GET-SUBINDEX-FUNCTION"), makeSymbol("GET-DECONTEXTUALIZED-IST-PREDICATE-RULE-SUBINDEX") });



    public static final SubLList $list27 = list(new SubLObject[]{ makeKeyword("NAME"), makeString("#$isa Rules"), makeKeyword("DOMAIN"), list(makeKeyword("NAME"), makeString("col"), makeKeyword("VALIDITY-TEST"), makeSymbol("FORT-P")), makeKeyword("TOP-LEVEL-KEY"), makeKeyword("ISA-RULE"), makeKeyword("KEYS"), list(list(makeKeyword("NAME"), makeString("sense"), makeKeyword("VALIDITY-TEST"), makeSymbol("SENSE-P"), makeKeyword("EQUAL-TEST"), EQ), list(new SubLObject[]{ makeKeyword("NAME"), makeString("mt"), makeKeyword("MT?"), T, makeKeyword("VALIDITY-TEST"), makeSymbol("HLMT-P"), makeKeyword("RELEVANCE-TEST"), makeSymbol("RELEVANT-MT?"), makeKeyword("EQUAL-TEST"), EQUAL }), list(makeKeyword("NAME"), makeString("direction"), makeKeyword("VALIDITY-TEST"), makeSymbol("DIRECTION-P"), makeKeyword("EQUAL-TEST"), EQ)), makeKeyword("RANGE"), list(makeKeyword("NAME"), makeString("rule"), makeKeyword("VALIDITY-TEST"), makeSymbol("RULE-ASSERTION?"), makeKeyword("DOCUMENTATION"), makeString("A rule assertion in mt MT with direction DIRECTION, which contains\na SENSE-lit with predicate #$isa and arg2 COL")), makeKeyword("DUPLICATE-VALUES?"), T, makeKeyword("NUM-FUNCTION"), makeSymbol("NUM-ISA-RULE-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION"), makeSymbol("RELEVANT-NUM-ISA-RULE-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), makeSymbol("RELEVANT-NUM-ISA-RULE-INDEX-WITH-CUTOFF"), makeKeyword("KEY-FUNCTION"), makeSymbol("KEY-ISA-RULE-INDEX"), makeKeyword("RELEVANT-KEY-FUNCTION"), makeSymbol("RELEVANT-KEY-ISA-RULE-INDEX"), makeKeyword("SIMPLE-MATCH-FUNCTION"), makeSymbol("MATCHES-ISA-RULE-INDEX"), makeKeyword("SIMPLE-KEY-FUNCTION"), makeSymbol("SIMPLE-KEY-ISA-RULE-INDEX"), makeKeyword("GET-SUBINDEX-FUNCTION"), makeSymbol("GET-ISA-RULE-SUBINDEX") });

    private static final SubLSymbol $QUOTED_ISA_RULE = makeKeyword("QUOTED-ISA-RULE");

    public static final SubLList $list29 = list(new SubLObject[]{ makeKeyword("NAME"), makeString("#$quotedIsa Rules"), makeKeyword("DOMAIN"), list(makeKeyword("NAME"), makeString("col"), makeKeyword("VALIDITY-TEST"), makeSymbol("FORT-P")), makeKeyword("TOP-LEVEL-KEY"), makeKeyword("QUOTED-ISA-RULE"), makeKeyword("KEYS"), list(list(makeKeyword("NAME"), makeString("sense"), makeKeyword("VALIDITY-TEST"), makeSymbol("SENSE-P"), makeKeyword("EQUAL-TEST"), EQ), list(new SubLObject[]{ makeKeyword("NAME"), makeString("mt"), makeKeyword("MT?"), T, makeKeyword("VALIDITY-TEST"), makeSymbol("HLMT-P"), makeKeyword("RELEVANCE-TEST"), makeSymbol("RELEVANT-MT?"), makeKeyword("EQUAL-TEST"), EQUAL }), list(makeKeyword("NAME"), makeString("direction"), makeKeyword("VALIDITY-TEST"), makeSymbol("DIRECTION-P"), makeKeyword("EQUAL-TEST"), EQ)), makeKeyword("RANGE"), list(makeKeyword("NAME"), makeString("rule"), makeKeyword("VALIDITY-TEST"), makeSymbol("RULE-ASSERTION?"), makeKeyword("DOCUMENTATION"), makeString("A rule assertion in mt MT with direction DIRECTION, which contains\na SENSE-lit with predicate #$quotedIsa and arg2 COL")), makeKeyword("DUPLICATE-VALUES?"), T, makeKeyword("NUM-FUNCTION"), makeSymbol("NUM-QUOTED-ISA-RULE-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION"), makeSymbol("RELEVANT-NUM-QUOTED-ISA-RULE-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), makeSymbol("RELEVANT-NUM-QUOTED-ISA-RULE-INDEX-WITH-CUTOFF"), makeKeyword("KEY-FUNCTION"), makeSymbol("KEY-QUOTED-ISA-RULE-INDEX"), makeKeyword("RELEVANT-KEY-FUNCTION"), makeSymbol("RELEVANT-KEY-QUOTED-ISA-RULE-INDEX"), makeKeyword("SIMPLE-MATCH-FUNCTION"), makeSymbol("MATCHES-QUOTED-ISA-RULE-INDEX"), makeKeyword("SIMPLE-KEY-FUNCTION"), makeSymbol("SIMPLE-KEY-QUOTED-ISA-RULE-INDEX"), makeKeyword("GET-SUBINDEX-FUNCTION"), makeSymbol("GET-QUOTED-ISA-RULE-SUBINDEX") });



    public static final SubLList $list31 = list(new SubLObject[]{ makeKeyword("NAME"), makeString("#$genls Rules"), makeKeyword("DOMAIN"), list(makeKeyword("NAME"), makeString("col"), makeKeyword("VALIDITY-TEST"), makeSymbol("FORT-P")), makeKeyword("TOP-LEVEL-KEY"), makeKeyword("GENLS-RULE"), makeKeyword("KEYS"), list(list(makeKeyword("NAME"), makeString("sense"), makeKeyword("VALIDITY-TEST"), makeSymbol("SENSE-P"), makeKeyword("EQUAL-TEST"), EQ), list(new SubLObject[]{ makeKeyword("NAME"), makeString("mt"), makeKeyword("MT?"), T, makeKeyword("VALIDITY-TEST"), makeSymbol("HLMT-P"), makeKeyword("RELEVANCE-TEST"), makeSymbol("RELEVANT-MT?"), makeKeyword("EQUAL-TEST"), EQUAL }), list(makeKeyword("NAME"), makeString("direction"), makeKeyword("VALIDITY-TEST"), makeSymbol("DIRECTION-P"), makeKeyword("EQUAL-TEST"), EQ)), makeKeyword("RANGE"), list(makeKeyword("NAME"), makeString("rule"), makeKeyword("VALIDITY-TEST"), makeSymbol("RULE-ASSERTION?"), makeKeyword("DOCUMENTATION"), makeString("A rule assertion in mt MT with direction DIRECTION, which contains\na SENSE-lit with predicate #$genls and arg2 COL")), makeKeyword("DUPLICATE-VALUES?"), T, makeKeyword("NUM-FUNCTION"), makeSymbol("NUM-GENLS-RULE-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION"), makeSymbol("RELEVANT-NUM-GENLS-RULE-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), makeSymbol("RELEVANT-NUM-GENLS-RULE-INDEX-WITH-CUTOFF"), makeKeyword("KEY-FUNCTION"), makeSymbol("KEY-GENLS-RULE-INDEX"), makeKeyword("RELEVANT-KEY-FUNCTION"), makeSymbol("RELEVANT-KEY-GENLS-RULE-INDEX"), makeKeyword("SIMPLE-MATCH-FUNCTION"), makeSymbol("MATCHES-GENLS-RULE-INDEX"), makeKeyword("SIMPLE-KEY-FUNCTION"), makeSymbol("SIMPLE-KEY-GENLS-RULE-INDEX"), makeKeyword("GET-SUBINDEX-FUNCTION"), makeSymbol("GET-GENLS-RULE-SUBINDEX") });

    private static final SubLSymbol $GENL_MT_RULE = makeKeyword("GENL-MT-RULE");

    public static final SubLList $list33 = list(new SubLObject[]{ makeKeyword("NAME"), makeString("#$genlMt Rules"), makeKeyword("DOMAIN"), list(makeKeyword("NAME"), makeString("genl-mt"), makeKeyword("VALIDITY-TEST"), makeSymbol("HLMT-P")), makeKeyword("TOP-LEVEL-KEY"), makeKeyword("GENL-MT-RULE"), makeKeyword("KEYS"), list(list(makeKeyword("NAME"), makeString("sense"), makeKeyword("VALIDITY-TEST"), makeSymbol("SENSE-P"), makeKeyword("EQUAL-TEST"), EQ), list(new SubLObject[]{ makeKeyword("NAME"), makeString("rule-mt"), makeKeyword("MT?"), T, makeKeyword("VALIDITY-TEST"), makeSymbol("HLMT-P"), makeKeyword("RELEVANCE-TEST"), makeSymbol("RELEVANT-MT?"), makeKeyword("EQUAL-TEST"), EQUAL }), list(makeKeyword("NAME"), makeString("direction"), makeKeyword("VALIDITY-TEST"), makeSymbol("DIRECTION-P"), makeKeyword("EQUAL-TEST"), EQ)), makeKeyword("RANGE"), list(makeKeyword("NAME"), makeString("rule"), makeKeyword("VALIDITY-TEST"), makeSymbol("RULE-ASSERTION?"), makeKeyword("DOCUMENTATION"), makeString("A rule assertion in mt RULE-MT with direction DIRECTION, which contains\na SENSE-lit with predicate #$genlMt and arg2 GENL-MT")), makeKeyword("DUPLICATE-VALUES?"), T, makeKeyword("NUM-FUNCTION"), makeSymbol("NUM-GENL-MT-RULE-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION"), makeSymbol("RELEVANT-NUM-GENL-MT-RULE-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), makeSymbol("RELEVANT-NUM-GENL-MT-RULE-INDEX-WITH-CUTOFF"), makeKeyword("KEY-FUNCTION"), makeSymbol("KEY-GENL-MT-RULE-INDEX"), makeKeyword("RELEVANT-KEY-FUNCTION"), makeSymbol("RELEVANT-KEY-GENL-MT-RULE-INDEX"), makeKeyword("SIMPLE-MATCH-FUNCTION"), makeSymbol("MATCHES-GENL-MT-RULE-INDEX"), makeKeyword("SIMPLE-KEY-FUNCTION"), makeSymbol("SIMPLE-KEY-GENL-MT-RULE-INDEX"), makeKeyword("GET-SUBINDEX-FUNCTION"), makeSymbol("GET-GENL-MT-RULE-SUBINDEX") });



    public static final SubLList $list35 = list(new SubLObject[]{ makeKeyword("NAME"), makeString("Function Rules"), makeKeyword("DOMAIN"), list(makeKeyword("NAME"), makeString("func"), makeKeyword("VALIDITY-TEST"), makeSymbol("FORT-P")), makeKeyword("TOP-LEVEL-KEY"), makeKeyword("FUNCTION-RULE"), makeKeyword("KEYS"), list(list(new SubLObject[]{ makeKeyword("NAME"), makeString("mt"), makeKeyword("MT?"), T, makeKeyword("VALIDITY-TEST"), makeSymbol("HLMT-P"), makeKeyword("RELEVANCE-TEST"), makeSymbol("RELEVANT-MT?"), makeKeyword("EQUAL-TEST"), EQUAL }), list(makeKeyword("NAME"), makeString("direction"), makeKeyword("VALIDITY-TEST"), makeSymbol("DIRECTION-P"), makeKeyword("EQUAL-TEST"), EQ)), makeKeyword("RANGE"), list(makeKeyword("NAME"), makeString("rule"), makeKeyword("VALIDITY-TEST"), makeSymbol("RULE-ASSERTION?"), makeKeyword("DOCUMENTATION"), makeString("A rule assertion in mt MT with direction DIRECTION, which contains\na neg-lit whose predicate is #$termOfUnit and whose arg2 is a naut with functor FUNC")), makeKeyword("DUPLICATE-VALUES?"), NIL, makeKeyword("NUM-FUNCTION"), makeSymbol("NUM-FUNCTION-RULE-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION"), makeSymbol("RELEVANT-NUM-FUNCTION-RULE-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), makeSymbol("RELEVANT-NUM-FUNCTION-RULE-INDEX-WITH-CUTOFF"), makeKeyword("KEY-FUNCTION"), makeSymbol("KEY-FUNCTION-RULE-INDEX"), makeKeyword("RELEVANT-KEY-FUNCTION"), makeSymbol("RELEVANT-KEY-FUNCTION-RULE-INDEX"), makeKeyword("SIMPLE-MATCH-FUNCTION"), makeSymbol("MATCHES-FUNCTION-RULE-INDEX"), makeKeyword("SIMPLE-KEY-FUNCTION"), makeSymbol("SIMPLE-KEY-FUNCTION-RULE-INDEX"), makeKeyword("GET-SUBINDEX-FUNCTION"), makeSymbol("GET-FUNCTION-RULE-SUBINDEX") });



    public static final SubLList $list37 = list(new SubLObject[]{ makeKeyword("NAME"), makeString("Exception Rules"), makeKeyword("DOMAIN"), list(makeKeyword("NAME"), makeString("rule"), makeKeyword("VALIDITY-TEST"), makeSymbol("RULE-ASSERTION?")), makeKeyword("TOP-LEVEL-KEY"), makeKeyword("EXCEPTION-RULE"), makeKeyword("KEYS"), list(list(new SubLObject[]{ makeKeyword("NAME"), makeString("mt"), makeKeyword("MT?"), T, makeKeyword("VALIDITY-TEST"), makeSymbol("HLMT-P"), makeKeyword("RELEVANCE-TEST"), makeSymbol("RELEVANT-MT?"), makeKeyword("EQUAL-TEST"), EQUAL }), list(makeKeyword("NAME"), makeString("direction"), makeKeyword("VALIDITY-TEST"), makeSymbol("DIRECTION-P"), makeKeyword("EQUAL-TEST"), EQ)), makeKeyword("RANGE"), list(makeKeyword("NAME"), makeString("exception-rule"), makeKeyword("VALIDITY-TEST"), makeSymbol("RULE-ASSERTION?"), makeKeyword("DOCUMENTATION"), makeString("A rule assertion in mt MT with direction DIRECTION, which contains\na pos-lit whose predicate is #$abnormal and whose arg2 is RULE")), makeKeyword("DUPLICATE-VALUES?"), NIL, makeKeyword("NUM-FUNCTION"), makeSymbol("NUM-EXCEPTION-RULE-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION"), makeSymbol("RELEVANT-NUM-EXCEPTION-RULE-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), makeSymbol("RELEVANT-NUM-EXCEPTION-RULE-INDEX-WITH-CUTOFF"), makeKeyword("KEY-FUNCTION"), makeSymbol("KEY-EXCEPTION-RULE-INDEX"), makeKeyword("RELEVANT-KEY-FUNCTION"), makeSymbol("RELEVANT-KEY-EXCEPTION-RULE-INDEX"), makeKeyword("SIMPLE-MATCH-FUNCTION"), makeSymbol("MATCHES-EXCEPTION-RULE-INDEX"), makeKeyword("SIMPLE-KEY-FUNCTION"), makeSymbol("SIMPLE-KEY-EXCEPTION-RULE-INDEX"), makeKeyword("GET-SUBINDEX-FUNCTION"), makeSymbol("GET-EXCEPTION-RULE-SUBINDEX") });



    public static final SubLList $list39 = list(new SubLObject[]{ makeKeyword("NAME"), makeString("Pragmatic Requirement Rules"), makeKeyword("DOMAIN"), list(makeKeyword("NAME"), makeString("rule"), makeKeyword("VALIDITY-TEST"), makeSymbol("RULE-ASSERTION?")), makeKeyword("TOP-LEVEL-KEY"), makeKeyword("PRAGMA-RULE"), makeKeyword("KEYS"), list(list(new SubLObject[]{ makeKeyword("NAME"), makeString("mt"), makeKeyword("MT?"), T, makeKeyword("VALIDITY-TEST"), makeSymbol("HLMT-P"), makeKeyword("RELEVANCE-TEST"), makeSymbol("RELEVANT-MT?"), makeKeyword("EQUAL-TEST"), EQUAL }), list(makeKeyword("NAME"), makeString("direction"), makeKeyword("VALIDITY-TEST"), makeSymbol("DIRECTION-P"), makeKeyword("EQUAL-TEST"), EQ)), makeKeyword("RANGE"), list(makeKeyword("NAME"), makeString("pragma-rule"), makeKeyword("VALIDITY-TEST"), makeSymbol("RULE-ASSERTION?"), makeKeyword("DOCUMENTATION"), makeString("A rule assertion in mt MT with direction DIRECTION, which contains\na pos-lit whose predicate is #$meetsPragmaticRequirement and whose arg2 is RULE")), makeKeyword("DUPLICATE-VALUES?"), NIL, makeKeyword("NUM-FUNCTION"), makeSymbol("NUM-PRAGMA-RULE-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION"), makeSymbol("RELEVANT-NUM-PRAGMA-RULE-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), makeSymbol("RELEVANT-NUM-PRAGMA-RULE-INDEX-WITH-CUTOFF"), makeKeyword("KEY-FUNCTION"), makeSymbol("KEY-PRAGMA-RULE-INDEX"), makeKeyword("RELEVANT-KEY-FUNCTION"), makeSymbol("RELEVANT-KEY-PRAGMA-RULE-INDEX"), makeKeyword("SIMPLE-MATCH-FUNCTION"), makeSymbol("MATCHES-PRAGMA-RULE-INDEX"), makeKeyword("SIMPLE-KEY-FUNCTION"), makeSymbol("SIMPLE-KEY-PRAGMA-RULE-INDEX"), makeKeyword("GET-SUBINDEX-FUNCTION"), makeSymbol("GET-PRAGMA-RULE-SUBINDEX") });



    public static final SubLList $list41 = list(new SubLObject[]{ makeKeyword("NAME"), makeString("Microtheory Contents"), makeKeyword("DOMAIN"), list(makeKeyword("NAME"), makeString("mt"), makeKeyword("VALIDITY-TEST"), makeSymbol("HLMT-P")), makeKeyword("TOP-LEVEL-KEY"), makeKeyword("IST"), makeKeyword("RANGE"), list(makeKeyword("NAME"), makeString("ass"), makeKeyword("VALIDITY-TEST"), makeSymbol("ASSERTION-P"), makeKeyword("DOCUMENTATION"), makeString("An assertion in mt MT")), makeKeyword("DUPLICATE-VALUES?"), NIL, makeKeyword("NUM-FUNCTION"), makeSymbol("NUM-MT-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION"), makeSymbol("RELEVANT-NUM-MT-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), makeSymbol("RELEVANT-NUM-MT-INDEX-WITH-CUTOFF"), makeKeyword("SIMPLE-MATCH-FUNCTION"), makeSymbol("MATCHES-MT-INDEX"), makeKeyword("GET-SUBINDEX-FUNCTION"), makeSymbol("GET-MT-SUBINDEX") });



    public static final SubLList $list43 = list(new SubLObject[]{ makeKeyword("NAME"), makeString("Miscellaneous"), makeKeyword("DOMAIN"), list(makeKeyword("NAME"), makeString("term"), makeKeyword("VALIDITY-TEST"), makeSymbol("INDEXED-TERM-P")), makeKeyword("TOP-LEVEL-KEY"), makeKeyword("OTHER"), makeKeyword("RANGE"), list(makeKeyword("NAME"), makeString("ass"), makeKeyword("VALIDITY-TEST"), makeSymbol("ASSERTION-P"), makeKeyword("DOCUMENTATION"), makeString("An assertion mentioning TERM but not indexed by any other means")), makeKeyword("DUPLICATE-VALUES?"), NIL, makeKeyword("NUM-FUNCTION"), makeSymbol("NUM-OTHER-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION"), makeSymbol("RELEVANT-NUM-OTHER-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), makeSymbol("RELEVANT-NUM-OTHER-INDEX-WITH-CUTOFF"), makeKeyword("SIMPLE-MATCH-FUNCTION"), makeSymbol("MATCHES-OTHER-INDEX"), makeKeyword("GET-SUBINDEX-FUNCTION"), makeSymbol("GET-OTHER-SUBINDEX") });

    public static SubLObject do_kb_indices(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list1);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject index = NIL;
        SubLObject plist = NIL;
        destructuring_bind_must_consp(current, datum, $list1);
        index = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list1);
        plist = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list1);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list1);
            if (NIL == member(current_$1, $list2, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list1);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_DICTIONARY, list(index, plist, $list6, done), append(body, NIL));
    }

    public static SubLObject kb_indexing_declaration_store() {
        return $kb_indexing_declaration_store$.getGlobalValue();
    }

    public static SubLObject clear_kb_indexing_declaration_store() {
        $kb_indexing_declaration_store$.setGlobalValue(dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED));
        return $kb_indexing_declaration_store$.getGlobalValue();
    }

    public static SubLObject add_index_to_kb_indexing_declaration_store(final SubLObject index, final SubLObject plist) {
        return dictionary.dictionary_enter($kb_indexing_declaration_store$.getGlobalValue(), index, plist);
    }

    public static SubLObject remove_index_from_kb_indexing_declaration_store(final SubLObject index) {
        return dictionary.dictionary_remove($kb_indexing_declaration_store$.getGlobalValue(), index);
    }

    public static SubLObject get_index_from_kb_indexing_declaration_store(final SubLObject index) {
        return dictionary.dictionary_lookup($kb_indexing_declaration_store$.getGlobalValue(), index, UNPROVIDED);
    }

    public static SubLObject find_index_by_top_level_key(final SubLObject top_level_key) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject index = get_index_from_kb_indexing_declaration_store(top_level_key);
        if ((NIL != index) && top_level_key.eql(get_index_prop(index, $TOP_LEVEL_KEY))) {
            return index;
        }
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(kb_indexing_declaration_store())); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject index2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject plist = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (top_level_key.eql(get_index_prop(index2, $TOP_LEVEL_KEY))) {
                return index2;
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return NIL;
    }

    public static SubLObject get_index_key_prop(final SubLObject key_info, final SubLObject indicator, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        return getf(key_info, indicator, v_default);
    }

    public static SubLObject get_index_prop(final SubLObject index, final SubLObject indicator) {
        return getf(get_index_from_kb_indexing_declaration_store(index), indicator, UNPROVIDED);
    }

    public static SubLObject declare_index(final SubLObject index, final SubLObject plist) {
        add_index_to_kb_indexing_declaration_store(index, plist);
        return index;
    }

    public static SubLObject index_equality_test_for_keys(final SubLObject keys) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject top_level_key = NIL;
        SubLObject rest_keys = NIL;
        destructuring_bind_must_consp(keys, keys, $list10);
        top_level_key = keys.first();
        final SubLObject current = rest_keys = keys.rest();
        final SubLObject index = find_index_by_top_level_key(top_level_key);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == index)) {
            Errors.error($str11$Could_not_find_an_index_with_top_, top_level_key);
        }
        final SubLObject key_info_list = get_index_prop(index, $KEYS);
        final SubLObject levels_deep = length(rest_keys);
        final SubLObject key_info_for_this_level = nth(levels_deep, key_info_list);
        final SubLObject equal_test = get_index_key_prop(key_info_for_this_level, $EQUAL_TEST, $default_intermediate_index_equal_test$.getGlobalValue());
        return equal_test;
    }

    public static SubLObject declare_kb_indexing_declarations_file() {
        declareMacro(me, "do_kb_indices", "DO-KB-INDICES");
        declareFunction(me, "kb_indexing_declaration_store", "KB-INDEXING-DECLARATION-STORE", 0, 0, false);
        declareFunction(me, "clear_kb_indexing_declaration_store", "CLEAR-KB-INDEXING-DECLARATION-STORE", 0, 0, false);
        declareFunction(me, "add_index_to_kb_indexing_declaration_store", "ADD-INDEX-TO-KB-INDEXING-DECLARATION-STORE", 2, 0, false);
        declareFunction(me, "remove_index_from_kb_indexing_declaration_store", "REMOVE-INDEX-FROM-KB-INDEXING-DECLARATION-STORE", 1, 0, false);
        declareFunction(me, "get_index_from_kb_indexing_declaration_store", "GET-INDEX-FROM-KB-INDEXING-DECLARATION-STORE", 1, 0, false);
        declareFunction(me, "find_index_by_top_level_key", "FIND-INDEX-BY-TOP-LEVEL-KEY", 1, 0, false);
        declareFunction(me, "get_index_key_prop", "GET-INDEX-KEY-PROP", 2, 1, false);
        declareFunction(me, "get_index_prop", "GET-INDEX-PROP", 2, 0, false);
        declareFunction(me, "declare_index", "DECLARE-INDEX", 2, 0, false);
        declareFunction(me, "index_equality_test_for_keys", "INDEX-EQUALITY-TEST-FOR-KEYS", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_kb_indexing_declarations_file() {
        deflexical("*DEFAULT-INTERMEDIATE-INDEX-EQUAL-TEST*", symbol_function(EQL));
        deflexical("*KB-INDEXING-DECLARATION-STORE*", SubLTrampolineFile.maybeDefault($kb_indexing_declaration_store$, $kb_indexing_declaration_store$, () -> dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED)));
        return NIL;
    }

    public static SubLObject setup_kb_indexing_declarations_file() {
        declare_defglobal($kb_indexing_declaration_store$);
        register_macro_helper(KB_INDEXING_DECLARATION_STORE, DO_KB_INDICES);
        declare_index($GAF_ARG, $list15);
        declare_index($NART_ARG, $list17);
        declare_index($PREDICATE_EXTENT, $list19);
        declare_index($FUNCTION_EXTENT, $list21);
        declare_index($PREDICATE_RULE, $list23);
        declare_index($DECONTEXTUALIZED_IST_PREDICATE_RULE, $list25);
        declare_index($ISA_RULE, $list27);
        declare_index($QUOTED_ISA_RULE, $list29);
        declare_index($GENLS_RULE, $list31);
        declare_index($GENL_MT_RULE, $list33);
        declare_index($FUNCTION_RULE, $list35);
        declare_index($EXCEPTION_RULE, $list37);
        declare_index($PRAGMA_RULE, $list39);
        declare_index($MICROTHEORY_CONTENTS, $list41);
        declare_index($MISCELLANEOUS, $list43);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_kb_indexing_declarations_file();
    }

    @Override
    public void initializeVariables() {
        init_kb_indexing_declarations_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_kb_indexing_declarations_file();
    }

    
}

/**
 * Total time: 249 ms
 */
