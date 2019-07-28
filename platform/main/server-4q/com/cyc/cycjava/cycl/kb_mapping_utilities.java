package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.utilities_macros;
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

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.*;
import static com.cyc.cycjava.cycl.kb_mapping_utilities.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class kb_mapping_utilities extends SubLTranslatedFile {
    public static final SubLFile me = new kb_mapping_utilities();

    public static final String myName = "com.cyc.cycjava.cycl.kb_mapping_utilities";

    public static final String myFingerPrint = "a23968c0642ea6c612fd92deccc9090219a0e1b8d9d695003bcaf830fa877712";

    // defparameter
    private static final SubLSymbol $use_optimized_pred_arg_values_fixed_arityP$ = makeSymbol("*USE-OPTIMIZED-PRED-ARG-VALUES-FIXED-ARITY?*");













    public static final SubLSymbol SOME_PRED_VALUE = makeSymbol("SOME-PRED-VALUE");

    public static final SubLList $list7 = list(makeSymbol("TERM"), makeSymbol("PRED"), makeSymbol("&OPTIONAL"), list(makeSymbol("INDEX-ARG"), ONE_INTEGER), list(makeSymbol("TRUTH"), makeKeyword("TRUE")));

    public static final SubLString $str8$Find_the_first_gaf_assertion_such = makeString("Find the first gaf assertion such that:\n (a) the assertion is in a relevant microtheory (relevance is established outside)\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return T if such an assertion exists, otherwise return NIL.");

    public static final SubLList $list9 = list(list(makeSymbol("TERM"), makeSymbol("INDEXED-TERM-P")), list(makeSymbol("PRED"), makeSymbol("FORT-P")), list(makeSymbol("INDEX-ARG"), makeSymbol("INTEGERP")), list(makeSymbol("TRUTH"), makeSymbol("TRUTH-P")));

    public static final SubLList $list10 = list(makeSymbol("BOOLEANP"));





    public static final SubLSymbol SOME_PRED_VALUE_IN_MT = makeSymbol("SOME-PRED-VALUE-IN-MT");

    public static final SubLList $list14 = list(makeSymbol("TERM"), makeSymbol("PRED"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), list(makeSymbol("INDEX-ARG"), ONE_INTEGER), list(makeSymbol("TRUTH"), makeKeyword("TRUE")));

    public static final SubLString $str15$Find_the_first_gaf_assertion_such = makeString("Find the first gaf assertion such that:\n (a) the assertion is in microtheory MT\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return T if such an assertion exists, otherwise return NIL.");

    public static final SubLList $list16 = list(list(makeSymbol("TERM"), makeSymbol("INDEXED-TERM-P")), list(makeSymbol("PRED"), makeSymbol("FORT-P")), list(makeSymbol("MT"), makeSymbol("HLMT-P")), list(makeSymbol("INDEX-ARG"), makeSymbol("INTEGERP")), list(makeSymbol("TRUTH"), makeSymbol("TRUTH-P")));





    public static final SubLSymbol SOME_PRED_VALUE_IN_MTS = makeSymbol("SOME-PRED-VALUE-IN-MTS");

    public static final SubLList $list20 = list(makeSymbol("TERM"), makeSymbol("PRED"), makeSymbol("MTS"), makeSymbol("&OPTIONAL"), list(makeSymbol("INDEX-ARG"), ONE_INTEGER), list(makeSymbol("TRUTH"), makeKeyword("TRUE")));

    public static final SubLString $str21$Find_the_first_gaf_assertion_such = makeString("Find the first gaf assertion such that:\n (a) the assertion is in one of the microtheories in the list MTS\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return T if such an assertion exists, otherwise return NIL.");

    public static final SubLList $list22 = list(list(makeSymbol("TERM"), makeSymbol("INDEXED-TERM-P")), list(makeSymbol("PRED"), makeSymbol("FORT-P")), list(makeSymbol("MTS"), makeSymbol("LISTP")), list(makeSymbol("INDEX-ARG"), makeSymbol("INTEGERP")), list(makeSymbol("TRUTH"), makeSymbol("TRUTH-P")));



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    public static final SubLSymbol SOME_PRED_VALUE_IN_ANY_MT = makeSymbol("SOME-PRED-VALUE-IN-ANY-MT");

    public static final SubLString $str26$Find_the_first_gaf_assertion_such = makeString("Find the first gaf assertion such that:\n (a) the assertion is allowed to be in any microtheory\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return T if such an assertion exists, otherwise return NIL.");

    public static final SubLSymbol SOME_PRED_VALUE_IN_RELEVANT_MTS = makeSymbol("SOME-PRED-VALUE-IN-RELEVANT-MTS");

    public static final SubLList $list28 = list(makeSymbol("TERM"), makeSymbol("PRED"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), list(makeSymbol("INDEX-ARG"), ONE_INTEGER), list(makeSymbol("TRUTH"), makeKeyword("TRUE")));

    public static final SubLString $str29$If_MT_is_NIL__behaves_like_SOME_P = makeString("If MT is NIL, behaves like SOME-PRED-VALUE.  Otherwise, behaves like SOME-PRED-VALUE-IN-MT");



    public static final SubLSymbol FPRED_VALUE = makeSymbol("FPRED-VALUE");

    public static final SubLList $list32 = list(makeSymbol("TERM"), makeSymbol("PRED"), makeSymbol("&OPTIONAL"), list(makeSymbol("INDEX-ARG"), ONE_INTEGER), list(makeSymbol("GATHER-ARG"), TWO_INTEGER), list(makeSymbol("TRUTH"), makeKeyword("TRUE")));

    public static final SubLString $str33$Find_the_first_gaf_assertion_such = makeString("Find the first gaf assertion such that:\n (a) the assertion is in a relevant microtheory (relevance is established outside)\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return the term in the GATHER-ARG position if such an assertion exists.\n Otherwise, return NIL.");

    public static final SubLList $list34 = list(list(makeSymbol("TERM"), makeSymbol("INDEXED-TERM-P")), list(makeSymbol("PRED"), makeSymbol("FORT-P")), list(makeSymbol("INDEX-ARG"), makeSymbol("INTEGERP")), list(makeSymbol("GATHER-ARG"), makeSymbol("INTEGERP")), list(makeSymbol("TRUTH"), makeSymbol("TRUTH-P")));

    public static final SubLList $list35 = list(list(makeSymbol("NIL-OR"), makeSymbol("HL-TERM-P")));

    public static final SubLSymbol FPRED_VALUE_IN_MT = makeSymbol("FPRED-VALUE-IN-MT");

    public static final SubLList $list37 = list(makeSymbol("TERM"), makeSymbol("PRED"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), list(makeSymbol("INDEX-ARG"), ONE_INTEGER), list(makeSymbol("GATHER-ARG"), TWO_INTEGER), list(makeSymbol("TRUTH"), makeKeyword("TRUE")));

    public static final SubLString $str38$Find_the_first_gaf_assertion_such = makeString("Find the first gaf assertion such that:\n (a) the assertion is in microtheory MT\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return the term in the GATHER-ARG position if such an assertion exists.\n Otherwise, return NIL.");

    public static final SubLList $list39 = list(list(makeSymbol("TERM"), makeSymbol("INDEXED-TERM-P")), list(makeSymbol("PRED"), makeSymbol("FORT-P")), list(makeSymbol("MT"), makeSymbol("HLMT-P")), list(makeSymbol("INDEX-ARG"), makeSymbol("INTEGERP")), list(makeSymbol("GATHER-ARG"), makeSymbol("INTEGERP")), list(makeSymbol("TRUTH"), makeSymbol("TRUTH-P")));

    public static final SubLSymbol FPRED_VALUE_IN_MTS = makeSymbol("FPRED-VALUE-IN-MTS");

    public static final SubLList $list41 = list(makeSymbol("TERM"), makeSymbol("PRED"), makeSymbol("MTS"), makeSymbol("&OPTIONAL"), list(makeSymbol("INDEX-ARG"), ONE_INTEGER), list(makeSymbol("GATHER-ARG"), TWO_INTEGER), list(makeSymbol("TRUTH"), makeKeyword("TRUE")));

    public static final SubLString $str42$Find_the_first_gaf_assertion_such = makeString("Find the first gaf assertion such that:\n (a) the assertion is in one of the microtheories in the list MTS\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return the term in the GATHER-ARG position if such an assertion exists.\n Otherwise, return NIL.");

    public static final SubLList $list43 = list(list(makeSymbol("TERM"), makeSymbol("INDEXED-TERM-P")), list(makeSymbol("PRED"), makeSymbol("FORT-P")), list(makeSymbol("MTS"), makeSymbol("LISTP")), list(makeSymbol("INDEX-ARG"), makeSymbol("INTEGERP")), list(makeSymbol("GATHER-ARG"), makeSymbol("INTEGERP")), list(makeSymbol("TRUTH"), makeSymbol("TRUTH-P")));

    public static final SubLSymbol FPRED_VALUE_IN_ANY_MT = makeSymbol("FPRED-VALUE-IN-ANY-MT");

    public static final SubLString $str45$Find_the_first_gaf_assertion_such = makeString("Find the first gaf assertion such that:\n (a) the assertion is allowed to be in any microtheory\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return the term in the GATHER-ARG position if such an assertion exists.\n Otherwise, return NIL.");

    public static final SubLSymbol FPRED_VALUE_IN_RELEVANT_MTS = makeSymbol("FPRED-VALUE-IN-RELEVANT-MTS");

    public static final SubLList $list47 = list(makeSymbol("TERM"), makeSymbol("PRED"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), list(makeSymbol("INDEX-ARG"), ONE_INTEGER), list(makeSymbol("GATHER-ARG"), TWO_INTEGER), list(makeSymbol("TRUTH"), makeKeyword("TRUE")));

    public static final SubLString $str48$If_MT_is_NIL__behaves_like_FPRED_ = makeString("If MT is NIL, behaves like FPRED-VALUE.  Otherwise, looks in all genlMts of MT.");

    public static final SubLSymbol PRED_VALUES = makeSymbol("PRED-VALUES");

    public static final SubLString $str50$Find_all_gaf_assertions_such_that = makeString("Find all gaf assertions such that:\n (a) the assertion is in a relevant microtheory (relevance is established outside)\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return a list of the terms in the GATHER-ARG position of all such assertions.");

    public static final SubLList $list51 = list(list(makeSymbol("LIST"), makeSymbol("HL-TERM-P")));

    public static final SubLSymbol PRED_VALUES_IN_MT = makeSymbol("PRED-VALUES-IN-MT");

    public static final SubLString $str53$Find_all_gaf_assertions_such_that = makeString("Find all gaf assertions such that:\n (a) the assertion is in microtheory MT\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return a list of the terms in the GATHER-ARG position of all such assertions.");

    public static final SubLSymbol PRED_VALUES_IN_MTS = makeSymbol("PRED-VALUES-IN-MTS");

    public static final SubLString $str55$Find_all_gaf_assertions_such_that = makeString("Find all gaf assertions such that:\n (a) the assertion is in one of the microtheories in the list MTS\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return a list of the terms in the GATHER-ARG position of all such assertions.");

    public static final SubLSymbol PRED_VALUES_IN_ANY_MT = makeSymbol("PRED-VALUES-IN-ANY-MT");

    public static final SubLString $str57$Find_all_gaf_assertions_such_that = makeString("Find all gaf assertions such that:\n (a) the assertion is allowed to be in any microtheory\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return a list of the terms in the GATHER-ARG position of all such assertions.");

    public static final SubLSymbol PRED_VALUES_IN_RELEVANT_MTS = makeSymbol("PRED-VALUES-IN-RELEVANT-MTS");

    public static final SubLString $str59$If_MT_is_NIL__behaves_like_PRED_V = makeString("If MT is NIL, behaves like PRED-VALUES.  Otherwise, behaves like PRED-VALUES-IN-MT");

    public static final SubLSymbol PRED_REFS = makeSymbol("PRED-REFS");

    public static final SubLList $list61 = list(makeSymbol("PRED"), makeSymbol("&OPTIONAL"), list(makeSymbol("GATHER-ARG"), ONE_INTEGER), list(makeSymbol("TRUTH"), makeKeyword("TRUE")));

    public static final SubLString $str62$Find_all_gaf_assertions_such_that = makeString("Find all gaf assertions such that:\n (a) the assertion is in a relevant microtheory (relevance is established outside)\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n Return a list of the terms in the GATHER-ARG position of all such assertions.");

    public static final SubLList $list63 = list(list(makeSymbol("PRED"), makeSymbol("FORT-P")), list(makeSymbol("GATHER-ARG"), makeSymbol("INTEGERP")), list(makeSymbol("TRUTH"), makeSymbol("TRUTH-P")));

    public static final SubLSymbol PRED_REFS_IN_MT = makeSymbol("PRED-REFS-IN-MT");

    public static final SubLList $list65 = list(makeSymbol("PRED"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), list(makeSymbol("GATHER-ARG"), ONE_INTEGER), list(makeSymbol("TRUTH"), makeKeyword("TRUE")));

    public static final SubLString $str66$Find_all_gaf_assertions_such_that = makeString("Find all gaf assertions such that:\n (a) the assertion is in microtheory MT\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n Return a list of the terms in the GATHER-ARG position of all such assertions.");

    public static final SubLList $list67 = list(list(makeSymbol("PRED"), makeSymbol("FORT-P")), list(makeSymbol("MT"), makeSymbol("HLMT-P")), list(makeSymbol("GATHER-ARG"), makeSymbol("INTEGERP")), list(makeSymbol("TRUTH"), makeSymbol("TRUTH-P")));

    public static final SubLSymbol PRED_REFS_IN_MTS = makeSymbol("PRED-REFS-IN-MTS");

    public static final SubLList $list69 = list(makeSymbol("PRED"), makeSymbol("MTS"), makeSymbol("&OPTIONAL"), list(makeSymbol("GATHER-ARG"), ONE_INTEGER), list(makeSymbol("TRUTH"), makeKeyword("TRUE")));

    public static final SubLString $str70$Find_all_gaf_assertions_such_that = makeString("Find all gaf assertions such that:\n (a) the assertion is in one of the microtheories in the list MTS\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n Return a list of the terms in the GATHER-ARG position of all such assertions.");

    public static final SubLList $list71 = list(list(makeSymbol("PRED"), makeSymbol("FORT-P")), list(makeSymbol("MTS"), makeSymbol("LISTP")), list(makeSymbol("GATHER-ARG"), makeSymbol("INTEGERP")), list(makeSymbol("TRUTH"), makeSymbol("TRUTH-P")));

    public static final SubLSymbol PRED_REFS_IN_ANY_MT = makeSymbol("PRED-REFS-IN-ANY-MT");

    public static final SubLString $str73$Find_all_gaf_assertions_such_that = makeString("Find all gaf assertions such that:\n (a) the assertion is allowed to be in any microtheory\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n Return a list of the terms in the GATHER-ARG position of all such assertions.");

    public static final SubLSymbol PRED_REFS_IN_RELEVANT_MTS = makeSymbol("PRED-REFS-IN-RELEVANT-MTS");

    public static final SubLList $list75 = list(makeSymbol("PRED"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), list(makeSymbol("GATHER-ARG"), ONE_INTEGER), list(makeSymbol("TRUTH"), makeKeyword("TRUE")));

    public static final SubLString $str76$If_MT_is_NIL__behaves_like_PRED_R = makeString("If MT is NIL, behaves like PRED-REFS.  Otherwise, behaves like PRED-REFS-IN-MT");



    public static final SubLSymbol PRED_U_V_HOLDS = makeSymbol("PRED-U-V-HOLDS");

    public static final SubLList $list79 = list(makeSymbol("PRED"), makeSymbol("U"), makeSymbol("V"), makeSymbol("&OPTIONAL"), list(makeSymbol("U-ARG"), ONE_INTEGER), list(makeSymbol("V-ARG"), TWO_INTEGER), list(makeSymbol("TRUTH"), makeKeyword("TRUE")));

    public static final SubLString $str80$Find_the_first_gaf_assertion_such = makeString("Find the first gaf assertion such that:\n (a) the assertion is in a relevant microtheory (relevance is established outside)\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) U is the term in the U-ARG position.\n (e) V is the term in the V-ARG position.\n Return T if such an assertion exists, otherwise return NIL.");

    public static final SubLList $list81 = list(list(makeSymbol("PRED"), makeSymbol("FORT-P")), list(makeSymbol("U"), makeSymbol("INDEXED-TERM-P")), list(makeSymbol("V"), makeSymbol("HL-TERM-P")), list(makeSymbol("U-ARG"), makeSymbol("INTEGERP")), list(makeSymbol("V-ARG"), makeSymbol("INTEGERP")), list(makeSymbol("TRUTH"), makeSymbol("TRUTH-P")));

    public static final SubLSymbol PRED_U_V_HOLDS_IN_MT = makeSymbol("PRED-U-V-HOLDS-IN-MT");

    public static final SubLList $list83 = list(makeSymbol("PRED"), makeSymbol("U"), makeSymbol("V"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), list(makeSymbol("U-ARG"), ONE_INTEGER), list(makeSymbol("V-ARG"), TWO_INTEGER), list(makeSymbol("TRUTH"), makeKeyword("TRUE")));

    public static final SubLString $str84$Find_the_first_gaf_assertion_such = makeString("Find the first gaf assertion such that:\n (a) the assertion is in microtheory MT\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) U is the term in the U-ARG position.\n (e) V is the term in the V-ARG position.\n Return T if such an assertion exists, otherwise return NIL.");

    public static final SubLList $list85 = list(list(makeSymbol("PRED"), makeSymbol("FORT-P")), list(makeSymbol("U"), makeSymbol("INDEXED-TERM-P")), list(makeSymbol("V"), makeSymbol("HL-TERM-P")), list(makeSymbol("MT"), makeSymbol("HLMT-P")), list(makeSymbol("U-ARG"), makeSymbol("INTEGERP")), list(makeSymbol("V-ARG"), makeSymbol("INTEGERP")), list(makeSymbol("TRUTH"), makeSymbol("TRUTH-P")));

    public static final SubLSymbol PRED_U_V_HOLDS_IN_MTS = makeSymbol("PRED-U-V-HOLDS-IN-MTS");

    public static final SubLList $list87 = list(makeSymbol("PRED"), makeSymbol("U"), makeSymbol("V"), makeSymbol("MTS"), makeSymbol("&OPTIONAL"), list(makeSymbol("U-ARG"), ONE_INTEGER), list(makeSymbol("V-ARG"), TWO_INTEGER), list(makeSymbol("TRUTH"), makeKeyword("TRUE")));

    public static final SubLString $str88$Find_the_first_gaf_assertion_such = makeString("Find the first gaf assertion such that:\n (a) the assertion is in one of the microtheories in the list MTS\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) U is the term in the U-ARG position.\n (e) V is the term in the V-ARG position.\n Return T if such an assertion exists, otherwise return NIL.");

    public static final SubLList $list89 = list(list(makeSymbol("PRED"), makeSymbol("FORT-P")), list(makeSymbol("U"), makeSymbol("INDEXED-TERM-P")), list(makeSymbol("V"), makeSymbol("HL-TERM-P")), list(makeSymbol("MTS"), makeSymbol("LISTP")), list(makeSymbol("U-ARG"), makeSymbol("INTEGERP")), list(makeSymbol("V-ARG"), makeSymbol("INTEGERP")), list(makeSymbol("TRUTH"), makeSymbol("TRUTH-P")));

    public static final SubLSymbol PRED_U_V_HOLDS_IN_ANY_MT = makeSymbol("PRED-U-V-HOLDS-IN-ANY-MT");

    public static final SubLString $str91$Find_the_first_gaf_assertion_such = makeString("Find the first gaf assertion such that:\n (a) the assertion is allowed to be in any microtheory\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) U is the term in the U-ARG position.\n (e) V is the term in the V-ARG position.\n Return T if such an assertion exists, otherwise return NIL.");

    public static final SubLSymbol PRED_U_V_HOLDS_IN_RELEVANT_MTS = makeSymbol("PRED-U-V-HOLDS-IN-RELEVANT-MTS");

    public static final SubLList $list93 = list(makeSymbol("PRED"), makeSymbol("U"), makeSymbol("V"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), list(makeSymbol("U-ARG"), ONE_INTEGER), list(makeSymbol("V-ARG"), TWO_INTEGER), list(makeSymbol("TRUTH"), makeKeyword("TRUE")));

    public static final SubLString $str94$If_MT_is_NIL__behaves_like_PRED_U = makeString("If MT is NIL, behaves like PRED-U-V-HOLDS.  Otherwise, behaves like PRED-U-V-HOLDS-IN-MT");









    private static final SubLString $str99$_S_is_not_a_valid_arg_position_li = makeString("~S is not a valid arg-position list");

    private static final SubLSymbol PRED_VALUE_TUPLES = makeSymbol("PRED-VALUE-TUPLES");

    public static final SubLList $list101 = list(makeSymbol("TERM"), makeSymbol("PRED"), makeSymbol("INDEX-ARG"), makeSymbol("GATHER-ARGS"), makeSymbol("&OPTIONAL"), list(makeSymbol("TRUTH"), makeKeyword("TRUE")));

    private static final SubLString $str102$Find_all_gaf_assertions_such_that = makeString("Find all gaf assertions such that:\n (a) the assertion is in a relevant microtheory (relevance is established outside)\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return a list of tuples formed from the GATHER-ARGS positions of all such assertions.");

    public static final SubLList $list103 = list(list(makeSymbol("TERM"), makeSymbol("INDEXED-TERM-P")), list(makeSymbol("PRED"), makeSymbol("FORT-P")), list(makeSymbol("INDEX-ARG"), makeSymbol("INTEGERP")), list(makeSymbol("GATHER-ARGS"), makeSymbol("LISTP")), list(makeSymbol("TRUTH"), makeSymbol("TRUTH-P")));

    private static final SubLList $list104 = list(list(makeSymbol("LIST"), makeSymbol("LISTP")));

    private static final SubLSymbol PRED_VALUE_TUPLES_IN_MT = makeSymbol("PRED-VALUE-TUPLES-IN-MT");

    private static final SubLList $list106 = list(makeSymbol("TERM"), makeSymbol("PRED"), makeSymbol("INDEX-ARG"), makeSymbol("GATHER-ARGS"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), list(makeSymbol("TRUTH"), makeKeyword("TRUE")));

    private static final SubLString $str107$Find_all_gaf_assertions_such_that = makeString("Find all gaf assertions such that:\n (a) the assertion is microtheory MT\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return a list of tuples formed from the GATHER-ARGS positions of all such assertions.");

    private static final SubLList $list108 = list(list(makeSymbol("TERM"), makeSymbol("INDEXED-TERM-P")), list(makeSymbol("PRED"), makeSymbol("FORT-P")), list(makeSymbol("INDEX-ARG"), makeSymbol("INTEGERP")), list(makeSymbol("GATHER-ARGS"), makeSymbol("LISTP")), list(makeSymbol("MT"), makeSymbol("HLMT-P")), list(makeSymbol("TRUTH"), makeSymbol("TRUTH-P")));

    private static final SubLSymbol PRED_VALUE_TUPLES_IN_MTS = makeSymbol("PRED-VALUE-TUPLES-IN-MTS");

    private static final SubLList $list110 = list(makeSymbol("TERM"), makeSymbol("PRED"), makeSymbol("INDEX-ARG"), makeSymbol("GATHER-ARGS"), makeSymbol("MTS"), makeSymbol("&OPTIONAL"), list(makeSymbol("TRUTH"), makeKeyword("TRUE")));

    public static final SubLString $str111$Find_all_gaf_assertions_such_that = makeString("Find all gaf assertions such that:\n (a) the assertion is in one of the microtheories in the list MTS\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return a list of tuples formed from the GATHER-ARGS positions of all such assertions.");

    private static final SubLList $list112 = list(list(makeSymbol("TERM"), makeSymbol("INDEXED-TERM-P")), list(makeSymbol("PRED"), makeSymbol("FORT-P")), list(makeSymbol("INDEX-ARG"), makeSymbol("INTEGERP")), list(makeSymbol("GATHER-ARGS"), makeSymbol("LISTP")), list(makeSymbol("MTS"), makeSymbol("LISTP")), list(makeSymbol("TRUTH"), makeSymbol("TRUTH-P")));

    private static final SubLSymbol PRED_VALUE_TUPLES_IN_ANY_MT = makeSymbol("PRED-VALUE-TUPLES-IN-ANY-MT");

    private static final SubLString $str114$Find_all_gaf_assertions_such_that = makeString("Find all gaf assertions such that:\n (a) the assertion is allowed to be from any microtheory\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return a list of tuples formed from the GATHER-ARGS positions of all such assertions.");

    private static final SubLSymbol PRED_VALUE_TUPLES_IN_RELEVANT_MTS = makeSymbol("PRED-VALUE-TUPLES-IN-RELEVANT-MTS");

    private static final SubLList $list116 = list(makeSymbol("TERM"), makeSymbol("PRED"), makeSymbol("INDEX-ARG"), makeSymbol("GATHER-ARGS"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), list(makeSymbol("TRUTH"), makeKeyword("TRUE")));

    private static final SubLString $str117$If_MT_is_NIL__behaves_like_PRED_V = makeString("If MT is NIL, behaves like PRED-VALUE-TUPLES.  Otherwise, behaves like PRED-VALUE-TUPLES-IN-MT");

    private static final SubLSymbol $sym118$_EXIT = makeSymbol("%EXIT");

    public static SubLObject some_pred_value(final SubLObject v_term, final SubLObject pred, SubLObject index_arg, SubLObject truth) {
        if (index_arg == UNPROVIDED) {
            index_arg = ONE_INTEGER;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(v_term, INDEXED_TERM_P);
        SubLTrampolineFile.enforceType(pred, FORT_P);
        SubLTrampolineFile.enforceType(index_arg, INTEGERP);
        SubLTrampolineFile.enforceType(truth, TRUTH_P);
        SubLObject v_answer = NIL;
        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, index_arg, pred)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, index_arg, pred);
            SubLObject done_var = v_answer;
            final SubLObject token_var = NIL;
            while (NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, truth, NIL);
                        SubLObject done_var_$1 = v_answer;
                        final SubLObject token_var_$2 = NIL;
                        while (NIL == done_var_$1) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$2);
                            final SubLObject valid_$3 = makeBoolean(!token_var_$2.eql(assertion));
                            if (NIL != valid_$3) {
                                if (NIL != $mapping_assertion_bookkeeping_fn$.getDynamicValue(thread)) {
                                    funcall($mapping_assertion_bookkeeping_fn$.getDynamicValue(thread), assertion);
                                }
                                v_answer = T;
                            }
                            done_var_$1 = makeBoolean((NIL == valid_$3) || (NIL != v_answer));
                        } 
                    } finally {
                        final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                done_var = makeBoolean((NIL == valid) || (NIL != v_answer));
            } 
        }
        return v_answer;
    }

    public static SubLObject some_pred_value_in_mt(final SubLObject v_term, final SubLObject pred, final SubLObject mt, SubLObject index_arg, SubLObject truth) {
        if (index_arg == UNPROVIDED) {
            index_arg = ONE_INTEGER;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(v_term, INDEXED_TERM_P);
        SubLTrampolineFile.enforceType(pred, FORT_P);
        SubLTrampolineFile.enforceType(mt, HLMT_P);
        SubLTrampolineFile.enforceType(index_arg, INTEGERP);
        SubLTrampolineFile.enforceType(truth, TRUTH_P);
        SubLObject v_answer = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            v_answer = some_pred_value(v_term, pred, index_arg, truth);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    public static SubLObject some_pred_value_in_mts(final SubLObject v_term, final SubLObject pred, final SubLObject mts, SubLObject index_arg, SubLObject truth) {
        if (index_arg == UNPROVIDED) {
            index_arg = ONE_INTEGER;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(v_term, INDEXED_TERM_P);
        SubLTrampolineFile.enforceType(pred, FORT_P);
        SubLTrampolineFile.enforceType(mts, LISTP);
        SubLTrampolineFile.enforceType(index_arg, INTEGERP);
        SubLTrampolineFile.enforceType(truth, TRUTH_P);
        SubLObject v_answer = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_IN_LIST, thread);
            mt_relevance_macros.$relevant_mts$.bind(mts, thread);
            v_answer = some_pred_value(v_term, pred, index_arg, truth);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    public static SubLObject some_pred_value_in_any_mt(final SubLObject v_term, final SubLObject pred, SubLObject index_arg, SubLObject truth) {
        if (index_arg == UNPROVIDED) {
            index_arg = ONE_INTEGER;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(v_term, INDEXED_TERM_P);
        SubLTrampolineFile.enforceType(pred, FORT_P);
        SubLTrampolineFile.enforceType(index_arg, INTEGERP);
        SubLTrampolineFile.enforceType(truth, TRUTH_P);
        SubLObject v_answer = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            v_answer = some_pred_value(v_term, pred, index_arg, truth);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    public static SubLObject some_pred_value_in_relevant_mts(final SubLObject v_term, final SubLObject pred, SubLObject mt, SubLObject index_arg, SubLObject truth) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (index_arg == UNPROVIDED) {
            index_arg = ONE_INTEGER;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(v_term, INDEXED_TERM_P);
        SubLTrampolineFile.enforceType(pred, FORT_P);
        SubLTrampolineFile.enforceType(index_arg, INTEGERP);
        SubLTrampolineFile.enforceType(truth, TRUTH_P);
        SubLObject v_answer = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            v_answer = some_pred_value(v_term, pred, index_arg, truth);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    public static SubLObject some_pred_value_if(final SubLObject v_term, final SubLObject pred, final SubLObject test, SubLObject index_arg, SubLObject truth) {
        if (index_arg == UNPROVIDED) {
            index_arg = ONE_INTEGER;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != indexed_term_p(v_term) : "kb_indexing_datastructures.indexed_term_p(v_term) " + "CommonSymbols.NIL != kb_indexing_datastructures.indexed_term_p(v_term) " + v_term;
        assert NIL != forts.fort_p(pred) : "forts.fort_p(pred) " + "CommonSymbols.NIL != forts.fort_p(pred) " + pred;
        assert NIL != function_spec_p(test) : "Types.function_spec_p(test) " + "CommonSymbols.NIL != Types.function_spec_p(test) " + test;
        assert NIL != integerp(index_arg) : "Types.integerp(index_arg) " + "CommonSymbols.NIL != Types.integerp(index_arg) " + index_arg;
        assert NIL != enumeration_types.truth_p(truth) : "enumeration_types.truth_p(truth) " + "CommonSymbols.NIL != enumeration_types.truth_p(truth) " + truth;
        SubLObject v_answer = NIL;
        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, index_arg, pred)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, index_arg, pred);
            SubLObject done_var = v_answer;
            final SubLObject token_var = NIL;
            while (NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, truth, NIL);
                        SubLObject done_var_$4 = v_answer;
                        final SubLObject token_var_$5 = NIL;
                        while (NIL == done_var_$4) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
                            final SubLObject valid_$6 = makeBoolean(!token_var_$5.eql(assertion));
                            if ((NIL != valid_$6) && (NIL != funcall(test, assertion))) {
                                if (NIL != $mapping_assertion_bookkeeping_fn$.getDynamicValue(thread)) {
                                    funcall($mapping_assertion_bookkeeping_fn$.getDynamicValue(thread), assertion);
                                }
                                v_answer = T;
                            }
                            done_var_$4 = makeBoolean((NIL == valid_$6) || (NIL != v_answer));
                        } 
                    } finally {
                        final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                done_var = makeBoolean((NIL == valid) || (NIL != v_answer));
            } 
        }
        return v_answer;
    }

    public static SubLObject fpred_value_gaf(final SubLObject v_term, final SubLObject pred, SubLObject index_argnum, SubLObject truth) {
        if (index_argnum == UNPROVIDED) {
            index_argnum = ONE_INTEGER;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, index_argnum, pred)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, index_argnum, pred);
            SubLObject done_var = v_answer;
            final SubLObject token_var = NIL;
            while (NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, truth, NIL);
                        SubLObject done_var_$7 = v_answer;
                        final SubLObject token_var_$8 = NIL;
                        while (NIL == done_var_$7) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$8);
                            final SubLObject valid_$9 = makeBoolean(!token_var_$8.eql(assertion));
                            if (NIL != valid_$9) {
                                if (NIL != $mapping_assertion_bookkeeping_fn$.getDynamicValue(thread)) {
                                    funcall($mapping_assertion_bookkeeping_fn$.getDynamicValue(thread), assertion);
                                }
                                v_answer = assertion;
                            }
                            done_var_$7 = makeBoolean((NIL == valid_$9) || (NIL != v_answer));
                        } 
                    } finally {
                        final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                done_var = makeBoolean((NIL == valid) || (NIL != v_answer));
            } 
        }
        return v_answer;
    }

    public static SubLObject fpred_value_gaf_in_relevant_mts(final SubLObject v_term, final SubLObject pred, SubLObject mt, SubLObject index_argnum, SubLObject truth) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (index_argnum == UNPROVIDED) {
            index_argnum = ONE_INTEGER;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            v_answer = fpred_value_gaf(v_term, pred, index_argnum, truth);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    public static SubLObject fpred_value_gaf_in_any_mt(final SubLObject v_term, final SubLObject pred, SubLObject index_argnum, SubLObject truth) {
        if (index_argnum == UNPROVIDED) {
            index_argnum = ONE_INTEGER;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            v_answer = fpred_value_gaf(v_term, pred, index_argnum, truth);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    public static SubLObject fpred_value(final SubLObject v_term, final SubLObject pred, SubLObject index_arg, SubLObject gather_arg, SubLObject truth) {
        if (index_arg == UNPROVIDED) {
            index_arg = ONE_INTEGER;
        }
        if (gather_arg == UNPROVIDED) {
            gather_arg = TWO_INTEGER;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        SubLTrampolineFile.enforceType(v_term, INDEXED_TERM_P);
        SubLTrampolineFile.enforceType(pred, FORT_P);
        SubLTrampolineFile.enforceType(index_arg, INTEGERP);
        SubLTrampolineFile.enforceType(gather_arg, INTEGERP);
        SubLTrampolineFile.enforceType(truth, TRUTH_P);
        final SubLObject assertion = fpred_value_gaf(v_term, pred, index_arg, truth);
        if (NIL != assertion) {
            return assertions_high.gaf_arg(assertion, gather_arg);
        }
        return NIL;
    }

    public static SubLObject fpred_value_in_mt(final SubLObject v_term, final SubLObject pred, final SubLObject mt, SubLObject index_arg, SubLObject gather_arg, SubLObject truth) {
        if (index_arg == UNPROVIDED) {
            index_arg = ONE_INTEGER;
        }
        if (gather_arg == UNPROVIDED) {
            gather_arg = TWO_INTEGER;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(v_term, INDEXED_TERM_P);
        SubLTrampolineFile.enforceType(pred, FORT_P);
        SubLTrampolineFile.enforceType(mt, HLMT_P);
        SubLTrampolineFile.enforceType(index_arg, INTEGERP);
        SubLTrampolineFile.enforceType(gather_arg, INTEGERP);
        SubLTrampolineFile.enforceType(truth, TRUTH_P);
        SubLObject v_answer = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            v_answer = fpred_value(v_term, pred, index_arg, gather_arg, truth);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    public static SubLObject fpred_value_in_mts(final SubLObject v_term, final SubLObject pred, final SubLObject mts, SubLObject index_arg, SubLObject gather_arg, SubLObject truth) {
        if (index_arg == UNPROVIDED) {
            index_arg = ONE_INTEGER;
        }
        if (gather_arg == UNPROVIDED) {
            gather_arg = TWO_INTEGER;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(v_term, INDEXED_TERM_P);
        SubLTrampolineFile.enforceType(pred, FORT_P);
        SubLTrampolineFile.enforceType(mts, LISTP);
        SubLTrampolineFile.enforceType(index_arg, INTEGERP);
        SubLTrampolineFile.enforceType(gather_arg, INTEGERP);
        SubLTrampolineFile.enforceType(truth, TRUTH_P);
        SubLObject v_answer = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_IN_LIST, thread);
            mt_relevance_macros.$relevant_mts$.bind(mts, thread);
            v_answer = fpred_value(v_term, pred, index_arg, gather_arg, truth);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    public static SubLObject fpred_value_in_any_mt(final SubLObject v_term, final SubLObject pred, SubLObject index_arg, SubLObject gather_arg, SubLObject truth) {
        if (index_arg == UNPROVIDED) {
            index_arg = ONE_INTEGER;
        }
        if (gather_arg == UNPROVIDED) {
            gather_arg = TWO_INTEGER;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(v_term, INDEXED_TERM_P);
        SubLTrampolineFile.enforceType(pred, FORT_P);
        SubLTrampolineFile.enforceType(index_arg, INTEGERP);
        SubLTrampolineFile.enforceType(gather_arg, INTEGERP);
        SubLTrampolineFile.enforceType(truth, TRUTH_P);
        SubLObject v_answer = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            v_answer = fpred_value(v_term, pred, index_arg, gather_arg, truth);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    public static SubLObject fpred_value_in_relevant_mts(final SubLObject v_term, final SubLObject pred, SubLObject mt, SubLObject index_arg, SubLObject gather_arg, SubLObject truth) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (index_arg == UNPROVIDED) {
            index_arg = ONE_INTEGER;
        }
        if (gather_arg == UNPROVIDED) {
            gather_arg = TWO_INTEGER;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(v_term, INDEXED_TERM_P);
        SubLTrampolineFile.enforceType(pred, FORT_P);
        SubLTrampolineFile.enforceType(index_arg, INTEGERP);
        SubLTrampolineFile.enforceType(gather_arg, INTEGERP);
        SubLTrampolineFile.enforceType(truth, TRUTH_P);
        SubLObject v_answer = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            v_answer = fpred_value(v_term, pred, index_arg, gather_arg, truth);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    public static SubLObject pred_value_gafs(final SubLObject v_term, final SubLObject pred, SubLObject index_argnum, SubLObject truth) {
        if (index_argnum == UNPROVIDED) {
            index_argnum = ONE_INTEGER;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject assertions = NIL;
        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, index_argnum, pred)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, index_argnum, pred);
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while (NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, truth, NIL);
                        SubLObject done_var_$10 = NIL;
                        final SubLObject token_var_$11 = NIL;
                        while (NIL == done_var_$10) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$11);
                            final SubLObject valid_$12 = makeBoolean(!token_var_$11.eql(assertion));
                            if (NIL != valid_$12) {
                                if (NIL != $mapping_assertion_bookkeeping_fn$.getDynamicValue(thread)) {
                                    funcall($mapping_assertion_bookkeeping_fn$.getDynamicValue(thread), assertion);
                                }
                                assertions = cons(assertion, assertions);
                            }
                            done_var_$10 = makeBoolean(NIL == valid_$12);
                        } 
                    } finally {
                        final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                done_var = makeBoolean(NIL == valid);
            } 
        }
        return assertions;
    }

    public static SubLObject pred_value_gafs_in_mt(final SubLObject v_term, final SubLObject pred, final SubLObject mt, SubLObject index_argnum, SubLObject truth) {
        if (index_argnum == UNPROVIDED) {
            index_argnum = ONE_INTEGER;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            v_answer = pred_value_gafs(v_term, pred, index_argnum, truth);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    public static SubLObject pred_value_gafs_in_relevant_mts(final SubLObject v_term, final SubLObject pred, SubLObject mt, SubLObject index_argnum, SubLObject truth) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (index_argnum == UNPROVIDED) {
            index_argnum = ONE_INTEGER;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            v_answer = pred_value_gafs(v_term, pred, index_argnum, truth);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    public static SubLObject pred_value_gafs_in_any_mt(final SubLObject v_term, final SubLObject pred, SubLObject index_argnum, SubLObject truth) {
        if (index_argnum == UNPROVIDED) {
            index_argnum = ONE_INTEGER;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            v_answer = pred_value_gafs(v_term, pred, index_argnum, truth);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    public static SubLObject pred_values(final SubLObject v_term, final SubLObject pred, SubLObject index_arg, SubLObject gather_arg, SubLObject truth) {
        if (index_arg == UNPROVIDED) {
            index_arg = ONE_INTEGER;
        }
        if (gather_arg == UNPROVIDED) {
            gather_arg = TWO_INTEGER;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(v_term, INDEXED_TERM_P);
        SubLTrampolineFile.enforceType(pred, FORT_P);
        SubLTrampolineFile.enforceType(index_arg, INTEGERP);
        SubLTrampolineFile.enforceType(gather_arg, INTEGERP);
        SubLTrampolineFile.enforceType(truth, TRUTH_P);
        SubLObject values = NIL;
        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, index_arg, pred)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, index_arg, pred);
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while (NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, truth, NIL);
                        SubLObject done_var_$13 = NIL;
                        final SubLObject token_var_$14 = NIL;
                        while (NIL == done_var_$13) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$14);
                            final SubLObject valid_$15 = makeBoolean(!token_var_$14.eql(assertion));
                            if (NIL != valid_$15) {
                                if (NIL != $mapping_assertion_bookkeeping_fn$.getDynamicValue(thread)) {
                                    funcall($mapping_assertion_bookkeeping_fn$.getDynamicValue(thread), assertion);
                                }
                                final SubLObject value = assertions_high.gaf_arg(assertion, gather_arg);
                                values = cons(value, values);
                            }
                            done_var_$13 = makeBoolean(NIL == valid_$15);
                        } 
                    } finally {
                        final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                done_var = makeBoolean(NIL == valid);
            } 
        }
        if (NIL != $mapping_equality_test$.getDynamicValue(thread)) {
            values = list_utilities.fast_delete_duplicates(values, $mapping_equality_test$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return values;
    }

    public static SubLObject pred_values_in_mt(final SubLObject v_term, final SubLObject pred, final SubLObject mt, SubLObject index_arg, SubLObject gather_arg, SubLObject truth) {
        if (index_arg == UNPROVIDED) {
            index_arg = ONE_INTEGER;
        }
        if (gather_arg == UNPROVIDED) {
            gather_arg = TWO_INTEGER;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(v_term, INDEXED_TERM_P);
        SubLTrampolineFile.enforceType(pred, FORT_P);
        SubLTrampolineFile.enforceType(mt, HLMT_P);
        SubLTrampolineFile.enforceType(index_arg, INTEGERP);
        SubLTrampolineFile.enforceType(gather_arg, INTEGERP);
        SubLTrampolineFile.enforceType(truth, TRUTH_P);
        SubLObject v_answer = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            v_answer = pred_values(v_term, pred, index_arg, gather_arg, truth);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    public static SubLObject pred_values_in_mts(final SubLObject v_term, final SubLObject pred, final SubLObject mts, SubLObject index_arg, SubLObject gather_arg, SubLObject truth) {
        if (index_arg == UNPROVIDED) {
            index_arg = ONE_INTEGER;
        }
        if (gather_arg == UNPROVIDED) {
            gather_arg = TWO_INTEGER;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(v_term, INDEXED_TERM_P);
        SubLTrampolineFile.enforceType(pred, FORT_P);
        SubLTrampolineFile.enforceType(mts, LISTP);
        SubLTrampolineFile.enforceType(index_arg, INTEGERP);
        SubLTrampolineFile.enforceType(gather_arg, INTEGERP);
        SubLTrampolineFile.enforceType(truth, TRUTH_P);
        SubLObject v_answer = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_IN_LIST, thread);
            mt_relevance_macros.$relevant_mts$.bind(mts, thread);
            v_answer = pred_values(v_term, pred, index_arg, gather_arg, truth);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    public static SubLObject pred_values_in_any_mt(final SubLObject v_term, final SubLObject pred, SubLObject index_arg, SubLObject gather_arg, SubLObject truth) {
        if (index_arg == UNPROVIDED) {
            index_arg = ONE_INTEGER;
        }
        if (gather_arg == UNPROVIDED) {
            gather_arg = TWO_INTEGER;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(v_term, INDEXED_TERM_P);
        SubLTrampolineFile.enforceType(pred, FORT_P);
        SubLTrampolineFile.enforceType(index_arg, INTEGERP);
        SubLTrampolineFile.enforceType(gather_arg, INTEGERP);
        SubLTrampolineFile.enforceType(truth, TRUTH_P);
        SubLObject v_answer = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            v_answer = pred_values(v_term, pred, index_arg, gather_arg, truth);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    public static SubLObject pred_values_in_relevant_mts(final SubLObject v_term, final SubLObject pred, SubLObject mt, SubLObject index_arg, SubLObject gather_arg, SubLObject truth) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (index_arg == UNPROVIDED) {
            index_arg = ONE_INTEGER;
        }
        if (gather_arg == UNPROVIDED) {
            gather_arg = TWO_INTEGER;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(v_term, INDEXED_TERM_P);
        SubLTrampolineFile.enforceType(pred, FORT_P);
        SubLTrampolineFile.enforceType(index_arg, INTEGERP);
        SubLTrampolineFile.enforceType(gather_arg, INTEGERP);
        SubLTrampolineFile.enforceType(truth, TRUTH_P);
        SubLObject v_answer = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            v_answer = pred_values(v_term, pred, index_arg, gather_arg, truth);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    public static SubLObject pred_refs(final SubLObject pred, SubLObject gather_arg, SubLObject truth) {
        if (gather_arg == UNPROVIDED) {
            gather_arg = ONE_INTEGER;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(pred, FORT_P);
        SubLTrampolineFile.enforceType(gather_arg, INTEGERP);
        SubLTrampolineFile.enforceType(truth, TRUTH_P);
        SubLObject v_answer = NIL;
        SubLObject answer_already_calculated = NIL;
        if (NIL == $mapping_assertion_bookkeeping_fn$.getDynamicValue(thread)) {
            answer_already_calculated = T;
            if ((NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred)) && (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred))) {
                final SubLObject str = NIL;
                final SubLObject _prev_bind_0 = $progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_2 = $progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
                try {
                    $progress_start_time$.bind(get_universal_time(), thread);
                    $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                    $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    $progress_notification_count$.bind(ZERO_INTEGER, thread);
                    $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                    $progress_count$.bind(ZERO_INTEGER, thread);
                    $is_noting_progressP$.bind(T, thread);
                    $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                    noting_progress_preamble(str);
                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            note_progress();
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, truth, NIL);
                                SubLObject done_var_$17 = NIL;
                                final SubLObject token_var_$18 = NIL;
                                while (NIL == done_var_$17) {
                                    final SubLObject assertion_var = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$18);
                                    final SubLObject valid_$19 = makeBoolean(!token_var_$18.eql(assertion_var));
                                    if (NIL != valid_$19) {
                                        final SubLObject v_term = assertions_high.gaf_arg(assertion_var, gather_arg);
                                        v_answer = cons(v_term, v_answer);
                                    }
                                    done_var_$17 = makeBoolean(NIL == valid_$19);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$20 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                    noting_progress_postamble();
                } finally {
                    $silent_progressP$.rebind(_prev_bind_8, thread);
                    $is_noting_progressP$.rebind(_prev_bind_7, thread);
                    $progress_count$.rebind(_prev_bind_6, thread);
                    $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                    $progress_notification_count$.rebind(_prev_bind_4, thread);
                    $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                    $progress_last_pacification_time$.rebind(_prev_bind_2, thread);
                    $progress_start_time$.rebind(_prev_bind_0, thread);
                }
            }
        }
        if ((NIL == answer_already_calculated) && (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred))) {
            final SubLObject str2 = NIL;
            final SubLObject _prev_bind_9 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_10 = $progress_last_pacification_time$.currentBinding(thread);
            final SubLObject _prev_bind_11 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
            final SubLObject _prev_bind_12 = $progress_notification_count$.currentBinding(thread);
            final SubLObject _prev_bind_13 = $progress_pacifications_since_last_nl$.currentBinding(thread);
            final SubLObject _prev_bind_14 = $progress_count$.currentBinding(thread);
            final SubLObject _prev_bind_15 = $is_noting_progressP$.currentBinding(thread);
            final SubLObject _prev_bind_16 = $silent_progressP$.currentBinding(thread);
            try {
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                $progress_notification_count$.bind(ZERO_INTEGER, thread);
                $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                $progress_count$.bind(ZERO_INTEGER, thread);
                $is_noting_progressP$.bind(T, thread);
                $silent_progressP$.bind(NIL != str2 ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                noting_progress_preamble(str2);
                final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred);
                SubLObject done_var2 = NIL;
                final SubLObject token_var2 = NIL;
                while (NIL == done_var2) {
                    final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                    final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                    if (NIL != valid2) {
                        note_progress();
                        SubLObject final_index_iterator2 = NIL;
                        try {
                            final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, truth, NIL);
                            SubLObject done_var_$18 = NIL;
                            final SubLObject token_var_$19 = NIL;
                            while (NIL == done_var_$18) {
                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$19);
                                final SubLObject valid_$20 = makeBoolean(!token_var_$19.eql(assertion));
                                if (NIL != valid_$20) {
                                    if (NIL != $mapping_assertion_bookkeeping_fn$.getDynamicValue(thread)) {
                                        funcall($mapping_assertion_bookkeeping_fn$.getDynamicValue(thread), assertion);
                                    }
                                    v_answer = cons(assertions_high.gaf_arg(assertion, gather_arg), v_answer);
                                }
                                done_var_$18 = makeBoolean(NIL == valid_$20);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$21 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                if (NIL != final_index_iterator2) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                }
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$21, thread);
                            }
                        }
                    }
                    done_var2 = makeBoolean(NIL == valid2);
                } 
                noting_progress_postamble();
            } finally {
                $silent_progressP$.rebind(_prev_bind_16, thread);
                $is_noting_progressP$.rebind(_prev_bind_15, thread);
                $progress_count$.rebind(_prev_bind_14, thread);
                $progress_pacifications_since_last_nl$.rebind(_prev_bind_13, thread);
                $progress_notification_count$.rebind(_prev_bind_12, thread);
                $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_11, thread);
                $progress_last_pacification_time$.rebind(_prev_bind_10, thread);
                $progress_start_time$.rebind(_prev_bind_9, thread);
            }
        }
        if (NIL != $mapping_equality_test$.getDynamicValue(thread)) {
            v_answer = list_utilities.fast_delete_duplicates(v_answer, $mapping_equality_test$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return v_answer;
    }

    public static SubLObject pred_refs_in_mt(final SubLObject pred, final SubLObject mt, SubLObject gather_arg, SubLObject truth) {
        if (gather_arg == UNPROVIDED) {
            gather_arg = ONE_INTEGER;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(pred, FORT_P);
        SubLTrampolineFile.enforceType(mt, HLMT_P);
        SubLTrampolineFile.enforceType(gather_arg, INTEGERP);
        SubLTrampolineFile.enforceType(truth, TRUTH_P);
        SubLObject v_answer = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            v_answer = pred_refs(pred, gather_arg, truth);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    public static SubLObject pred_refs_in_mts(final SubLObject pred, final SubLObject mts, SubLObject gather_arg, SubLObject truth) {
        if (gather_arg == UNPROVIDED) {
            gather_arg = ONE_INTEGER;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(pred, FORT_P);
        SubLTrampolineFile.enforceType(mts, LISTP);
        SubLTrampolineFile.enforceType(gather_arg, INTEGERP);
        SubLTrampolineFile.enforceType(truth, TRUTH_P);
        SubLObject v_answer = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_IN_LIST, thread);
            mt_relevance_macros.$relevant_mts$.bind(mts, thread);
            v_answer = pred_refs(pred, gather_arg, truth);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    public static SubLObject pred_refs_in_any_mt(final SubLObject pred, SubLObject gather_arg, SubLObject truth) {
        if (gather_arg == UNPROVIDED) {
            gather_arg = ONE_INTEGER;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(pred, FORT_P);
        SubLTrampolineFile.enforceType(gather_arg, INTEGERP);
        SubLTrampolineFile.enforceType(truth, TRUTH_P);
        SubLObject v_answer = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            v_answer = pred_refs(pred, gather_arg, truth);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    public static SubLObject pred_refs_in_relevant_mts(final SubLObject pred, SubLObject mt, SubLObject gather_arg, SubLObject truth) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (gather_arg == UNPROVIDED) {
            gather_arg = ONE_INTEGER;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(pred, FORT_P);
        SubLTrampolineFile.enforceType(gather_arg, INTEGERP);
        SubLTrampolineFile.enforceType(truth, TRUTH_P);
        SubLObject v_answer = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            v_answer = pred_refs(pred, gather_arg, truth);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    public static SubLObject pred_u_v_holds_gafs(final SubLObject pred, final SubLObject u, final SubLObject v, SubLObject u_arg, SubLObject v_arg, SubLObject truth) {
        if (u_arg == UNPROVIDED) {
            u_arg = ONE_INTEGER;
        }
        if (v_arg == UNPROVIDED) {
            v_arg = TWO_INTEGER;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject assertions = NIL;
        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(u, u_arg, pred)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(u, u_arg, pred);
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while (NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, truth, NIL);
                        SubLObject done_var_$25 = NIL;
                        final SubLObject token_var_$26 = NIL;
                        while (NIL == done_var_$25) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$26);
                            final SubLObject valid_$27 = makeBoolean(!token_var_$26.eql(assertion));
                            if ((NIL != valid_$27) && (NIL != funcall($mapping_equality_test$.getDynamicValue(thread), assertions_high.gaf_arg(assertion, v_arg), v))) {
                                if (NIL != $mapping_assertion_bookkeeping_fn$.getDynamicValue(thread)) {
                                    funcall($mapping_assertion_bookkeeping_fn$.getDynamicValue(thread), assertion);
                                }
                                assertions = cons(assertion, assertions);
                            }
                            done_var_$25 = makeBoolean(NIL == valid_$27);
                        } 
                    } finally {
                        final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                done_var = makeBoolean(NIL == valid);
            } 
        }
        return assertions;
    }

    public static SubLObject pred_u_v_holds_tuples(final SubLObject pred, final SubLObject u, final SubLObject v, final SubLObject gather_args, SubLObject u_arg, SubLObject v_arg, SubLObject truth) {
        if (u_arg == UNPROVIDED) {
            u_arg = ONE_INTEGER;
        }
        if (v_arg == UNPROVIDED) {
            v_arg = TWO_INTEGER;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(u, u_arg, pred)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(u, u_arg, pred);
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while (NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, truth, NIL);
                        SubLObject done_var_$28 = NIL;
                        final SubLObject token_var_$29 = NIL;
                        while (NIL == done_var_$28) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$29);
                            final SubLObject valid_$30 = makeBoolean(!token_var_$29.eql(assertion));
                            if ((NIL != valid_$30) && (NIL != funcall($mapping_equality_test$.getDynamicValue(thread), assertions_high.gaf_arg(assertion, v_arg), v))) {
                                SubLObject tuple = NIL;
                                SubLObject cdolist_list_var = gather_args;
                                SubLObject arg = NIL;
                                arg = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    tuple = cons(assertions_high.gaf_arg(assertion, arg), tuple);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    arg = cdolist_list_var.first();
                                } 
                                tuple = nreverse(tuple);
                                if (NIL != $mapping_assertion_bookkeeping_fn$.getDynamicValue(thread)) {
                                    funcall($mapping_assertion_bookkeeping_fn$.getDynamicValue(thread), assertion);
                                }
                                v_answer = cons(tuple, v_answer);
                            }
                            done_var_$28 = makeBoolean(NIL == valid_$30);
                        } 
                    } finally {
                        final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                done_var = makeBoolean(NIL == valid);
            } 
        }
        if (NIL != $mapping_equality_test$.getDynamicValue(thread)) {
            v_answer = list_utilities.fast_delete_duplicates(v_answer, $mapping_equality_test$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return v_answer;
    }

    public static SubLObject pred_u_v_w_holds_tuples(final SubLObject pred, final SubLObject u, final SubLObject v, final SubLObject w, final SubLObject gather_args, SubLObject u_arg, SubLObject v_arg, SubLObject w_arg, SubLObject truth) {
        if (u_arg == UNPROVIDED) {
            u_arg = ONE_INTEGER;
        }
        if (v_arg == UNPROVIDED) {
            v_arg = TWO_INTEGER;
        }
        if (w_arg == UNPROVIDED) {
            w_arg = THREE_INTEGER;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(u, u_arg, pred)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(u, u_arg, pred);
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while (NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, truth, NIL);
                        SubLObject done_var_$31 = NIL;
                        final SubLObject token_var_$32 = NIL;
                        while (NIL == done_var_$31) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$32);
                            final SubLObject valid_$33 = makeBoolean(!token_var_$32.eql(assertion));
                            if (((NIL != valid_$33) && (NIL != funcall($mapping_equality_test$.getDynamicValue(thread), assertions_high.gaf_arg(assertion, v_arg), v))) && (NIL != funcall($mapping_equality_test$.getDynamicValue(thread), assertions_high.gaf_arg(assertion, w_arg), w))) {
                                SubLObject tuple = NIL;
                                SubLObject cdolist_list_var = gather_args;
                                SubLObject arg = NIL;
                                arg = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    tuple = cons(assertions_high.gaf_arg(assertion, arg), tuple);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    arg = cdolist_list_var.first();
                                } 
                                tuple = nreverse(tuple);
                                if (NIL != $mapping_assertion_bookkeeping_fn$.getDynamicValue(thread)) {
                                    funcall($mapping_assertion_bookkeeping_fn$.getDynamicValue(thread), assertion);
                                }
                                v_answer = cons(tuple, v_answer);
                            }
                            done_var_$31 = makeBoolean(NIL == valid_$33);
                        } 
                    } finally {
                        final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                done_var = makeBoolean(NIL == valid);
            } 
        }
        if (NIL != $mapping_equality_test$.getDynamicValue(thread)) {
            v_answer = list_utilities.fast_delete_duplicates(v_answer, $mapping_equality_test$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return v_answer;
    }

    public static SubLObject fpred_u_v_holds_gaf(final SubLObject pred, final SubLObject u, final SubLObject v, SubLObject u_arg, SubLObject v_arg, SubLObject truth) {
        if (u_arg == UNPROVIDED) {
            u_arg = ONE_INTEGER;
        }
        if (v_arg == UNPROVIDED) {
            v_arg = TWO_INTEGER;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(u, u_arg, pred)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(u, u_arg, pred);
            SubLObject done_var = v_answer;
            final SubLObject token_var = NIL;
            while (NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, truth, NIL);
                        SubLObject done_var_$34 = v_answer;
                        final SubLObject token_var_$35 = NIL;
                        while (NIL == done_var_$34) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$35);
                            final SubLObject valid_$36 = makeBoolean(!token_var_$35.eql(assertion));
                            if ((NIL != valid_$36) && (NIL != funcall($mapping_equality_test$.getDynamicValue(thread), assertions_high.gaf_arg(assertion, v_arg), v))) {
                                if (NIL != $mapping_assertion_bookkeeping_fn$.getDynamicValue(thread)) {
                                    funcall($mapping_assertion_bookkeeping_fn$.getDynamicValue(thread), assertion);
                                }
                                v_answer = assertion;
                            }
                            done_var_$34 = makeBoolean((NIL == valid_$36) || (NIL != v_answer));
                        } 
                    } finally {
                        final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                done_var = makeBoolean((NIL == valid) || (NIL != v_answer));
            } 
        }
        return v_answer;
    }

    public static SubLObject pred_u_v_holds_gafs_in_relevant_mts(final SubLObject pred, final SubLObject u, final SubLObject v, SubLObject mt, SubLObject u_arg, SubLObject v_arg, SubLObject truth) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (u_arg == UNPROVIDED) {
            u_arg = ONE_INTEGER;
        }
        if (v_arg == UNPROVIDED) {
            v_arg = TWO_INTEGER;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject assertions = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            assertions = pred_u_v_holds_gafs(pred, u, v, u_arg, v_arg, truth);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return assertions;
    }

    public static SubLObject fpred_u_v_holds_gaf_in_relevant_mts(final SubLObject pred, final SubLObject u, final SubLObject v, SubLObject mt, SubLObject u_arg, SubLObject v_arg, SubLObject truth) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (u_arg == UNPROVIDED) {
            u_arg = ONE_INTEGER;
        }
        if (v_arg == UNPROVIDED) {
            v_arg = TWO_INTEGER;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject assertion = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            assertion = fpred_u_v_holds_gaf(pred, u, v, u_arg, v_arg, truth);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return assertion;
    }

    public static SubLObject pred_u_v_holds_gafs_in_any_mt(final SubLObject pred, final SubLObject u, final SubLObject v, SubLObject u_arg, SubLObject v_arg, SubLObject truth) {
        if (u_arg == UNPROVIDED) {
            u_arg = ONE_INTEGER;
        }
        if (v_arg == UNPROVIDED) {
            v_arg = TWO_INTEGER;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            v_answer = pred_u_v_holds_gafs(pred, u, v, u_arg, v_arg, truth);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    public static SubLObject fpred_u_v_holds_gaf_in_any_mt(final SubLObject pred, final SubLObject u, final SubLObject v, SubLObject u_arg, SubLObject v_arg, SubLObject truth) {
        if (u_arg == UNPROVIDED) {
            u_arg = ONE_INTEGER;
        }
        if (v_arg == UNPROVIDED) {
            v_arg = TWO_INTEGER;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            v_answer = fpred_u_v_holds_gaf(pred, u, v, u_arg, v_arg, truth);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    public static SubLObject pred_u_v_holds(final SubLObject pred, final SubLObject u, final SubLObject v, SubLObject u_arg, SubLObject v_arg, SubLObject truth) {
        if (u_arg == UNPROVIDED) {
            u_arg = ONE_INTEGER;
        }
        if (v_arg == UNPROVIDED) {
            v_arg = TWO_INTEGER;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(pred, FORT_P);
        SubLTrampolineFile.enforceType(u, INDEXED_TERM_P);
        SubLTrampolineFile.enforceType(v, HL_TERM_P);
        SubLTrampolineFile.enforceType(u_arg, INTEGERP);
        SubLTrampolineFile.enforceType(v_arg, INTEGERP);
        SubLTrampolineFile.enforceType(truth, TRUTH_P);
        SubLObject v_answer = NIL;
        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(u, u_arg, pred)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(u, u_arg, pred);
            SubLObject done_var = v_answer;
            final SubLObject token_var = NIL;
            while (NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, truth, NIL);
                        SubLObject done_var_$37 = v_answer;
                        final SubLObject token_var_$38 = NIL;
                        while (NIL == done_var_$37) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$38);
                            final SubLObject valid_$39 = makeBoolean(!token_var_$38.eql(assertion));
                            if ((NIL != valid_$39) && (NIL != funcall($mapping_equality_test$.getDynamicValue(thread), assertions_high.gaf_arg(assertion, v_arg), v))) {
                                if (NIL != $mapping_assertion_bookkeeping_fn$.getDynamicValue(thread)) {
                                    funcall($mapping_assertion_bookkeeping_fn$.getDynamicValue(thread), assertion);
                                }
                                v_answer = T;
                            }
                            done_var_$37 = makeBoolean((NIL == valid_$39) || (NIL != v_answer));
                        } 
                    } finally {
                        final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                done_var = makeBoolean((NIL == valid) || (NIL != v_answer));
            } 
        }
        return v_answer;
    }

    public static SubLObject pred_u_v_holds_in_mt(final SubLObject pred, final SubLObject u, final SubLObject v, final SubLObject mt, SubLObject u_arg, SubLObject v_arg, SubLObject truth) {
        if (u_arg == UNPROVIDED) {
            u_arg = ONE_INTEGER;
        }
        if (v_arg == UNPROVIDED) {
            v_arg = TWO_INTEGER;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(pred, FORT_P);
        SubLTrampolineFile.enforceType(u, INDEXED_TERM_P);
        SubLTrampolineFile.enforceType(v, HL_TERM_P);
        SubLTrampolineFile.enforceType(mt, HLMT_P);
        SubLTrampolineFile.enforceType(u_arg, INTEGERP);
        SubLTrampolineFile.enforceType(v_arg, INTEGERP);
        SubLTrampolineFile.enforceType(truth, TRUTH_P);
        SubLObject v_answer = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            v_answer = pred_u_v_holds(pred, u, v, u_arg, v_arg, truth);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    public static SubLObject pred_u_v_holds_in_mts(final SubLObject pred, final SubLObject u, final SubLObject v, final SubLObject mts, SubLObject u_arg, SubLObject v_arg, SubLObject truth) {
        if (u_arg == UNPROVIDED) {
            u_arg = ONE_INTEGER;
        }
        if (v_arg == UNPROVIDED) {
            v_arg = TWO_INTEGER;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(pred, FORT_P);
        SubLTrampolineFile.enforceType(u, INDEXED_TERM_P);
        SubLTrampolineFile.enforceType(v, HL_TERM_P);
        SubLTrampolineFile.enforceType(mts, LISTP);
        SubLTrampolineFile.enforceType(u_arg, INTEGERP);
        SubLTrampolineFile.enforceType(v_arg, INTEGERP);
        SubLTrampolineFile.enforceType(truth, TRUTH_P);
        SubLObject v_answer = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_IN_LIST, thread);
            mt_relevance_macros.$relevant_mts$.bind(mts, thread);
            v_answer = pred_u_v_holds(pred, u, v, u_arg, v_arg, truth);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    public static SubLObject pred_u_v_holds_in_any_mt(final SubLObject pred, final SubLObject u, final SubLObject v, SubLObject u_arg, SubLObject v_arg, SubLObject truth) {
        if (u_arg == UNPROVIDED) {
            u_arg = ONE_INTEGER;
        }
        if (v_arg == UNPROVIDED) {
            v_arg = TWO_INTEGER;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(pred, FORT_P);
        SubLTrampolineFile.enforceType(u, INDEXED_TERM_P);
        SubLTrampolineFile.enforceType(v, HL_TERM_P);
        SubLTrampolineFile.enforceType(u_arg, INTEGERP);
        SubLTrampolineFile.enforceType(v_arg, INTEGERP);
        SubLTrampolineFile.enforceType(truth, TRUTH_P);
        SubLObject v_answer = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            v_answer = pred_u_v_holds(pred, u, v, u_arg, v_arg, truth);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    public static SubLObject pred_u_v_holds_in_relevant_mts(final SubLObject pred, final SubLObject u, final SubLObject v, SubLObject mt, SubLObject u_arg, SubLObject v_arg, SubLObject truth) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (u_arg == UNPROVIDED) {
            u_arg = ONE_INTEGER;
        }
        if (v_arg == UNPROVIDED) {
            v_arg = TWO_INTEGER;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(pred, FORT_P);
        SubLTrampolineFile.enforceType(u, INDEXED_TERM_P);
        SubLTrampolineFile.enforceType(v, HL_TERM_P);
        SubLTrampolineFile.enforceType(u_arg, INTEGERP);
        SubLTrampolineFile.enforceType(v_arg, INTEGERP);
        SubLTrampolineFile.enforceType(truth, TRUTH_P);
        SubLObject v_answer = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            v_answer = pred_u_v_holds(pred, u, v, u_arg, v_arg, truth);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    public static SubLObject tuple_holds(final SubLObject tuple, SubLObject index_arg, SubLObject truth) {
        if (index_arg == UNPROVIDED) {
            index_arg = ONE_INTEGER;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != consp(tuple) : "Types.consp(tuple) " + "CommonSymbols.NIL != Types.consp(tuple) " + tuple;
        assert NIL != integerp(index_arg) : "Types.integerp(index_arg) " + "CommonSymbols.NIL != Types.integerp(index_arg) " + index_arg;
        assert NIL != enumeration_types.truth_p(truth) : "enumeration_types.truth_p(truth) " + "CommonSymbols.NIL != enumeration_types.truth_p(truth) " + truth;
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(tuple);
        final SubLObject index_term = cycl_utilities.atomic_sentence_arg(tuple, index_arg, UNPROVIDED);
        assert NIL != forts.fort_p(pred) : "forts.fort_p(pred) " + "CommonSymbols.NIL != forts.fort_p(pred) " + pred;
        assert NIL != indexed_term_p(index_term) : "kb_indexing_datastructures.indexed_term_p(index_term) " + "CommonSymbols.NIL != kb_indexing_datastructures.indexed_term_p(index_term) " + index_term;
        SubLObject v_answer = NIL;
        final SubLObject pred_var = pred;
        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(index_term, index_arg, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(index_term, index_arg, pred_var);
            SubLObject done_var = v_answer;
            final SubLObject token_var = NIL;
            while (NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, truth, NIL);
                        SubLObject done_var_$40 = v_answer;
                        final SubLObject token_var_$41 = NIL;
                        while (NIL == done_var_$40) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$41);
                            final SubLObject valid_$42 = makeBoolean(!token_var_$41.eql(assertion));
                            if ((NIL != valid_$42) && assertions_high.gaf_formula(assertion).equal(tuple)) {
                                if (NIL != $mapping_assertion_bookkeeping_fn$.getDynamicValue(thread)) {
                                    funcall($mapping_assertion_bookkeeping_fn$.getDynamicValue(thread), assertion);
                                }
                                v_answer = T;
                            }
                            done_var_$40 = makeBoolean((NIL == valid_$42) || (NIL != v_answer));
                        } 
                    } finally {
                        final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                done_var = makeBoolean((NIL == valid) || (NIL != v_answer));
            } 
        }
        return v_answer;
    }

    public static SubLObject tuple_holds_in_mt(final SubLObject tuple, final SubLObject mt, SubLObject index_arg, SubLObject truth) {
        if (index_arg == UNPROVIDED) {
            index_arg = ONE_INTEGER;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != hlmt.hlmt_p(mt) : "hlmt.hlmt_p(mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(mt) " + mt;
        SubLObject v_answer = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            v_answer = tuple_holds(tuple, index_arg, truth);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    public static SubLObject tuple_holds_in_mts(final SubLObject tuple, final SubLObject mts, SubLObject index_arg, SubLObject truth) {
        if (index_arg == UNPROVIDED) {
            index_arg = ONE_INTEGER;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != listp(mts) : "Types.listp(mts) " + "CommonSymbols.NIL != Types.listp(mts) " + mts;
        SubLObject v_answer = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_IN_LIST, thread);
            mt_relevance_macros.$relevant_mts$.bind(mts, thread);
            v_answer = tuple_holds(tuple, index_arg, truth);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    public static SubLObject tuple_holds_in_any_mt(final SubLObject tuple, SubLObject index_arg, SubLObject truth) {
        if (index_arg == UNPROVIDED) {
            index_arg = ONE_INTEGER;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            v_answer = tuple_holds(tuple, index_arg, truth);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    public static SubLObject tuple_holds_in_relevant_mts(final SubLObject tuple, SubLObject mt, SubLObject index_arg, SubLObject truth) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (index_arg == UNPROVIDED) {
            index_arg = ONE_INTEGER;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            v_answer = tuple_holds(tuple, index_arg, truth);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    public static SubLObject pred_values_mentioning(final SubLObject v_term, final SubLObject pred, final SubLObject item, SubLObject index_arg, SubLObject gather_arg, SubLObject truth) {
        if (index_arg == UNPROVIDED) {
            index_arg = ONE_INTEGER;
        }
        if (gather_arg == UNPROVIDED) {
            gather_arg = TWO_INTEGER;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != indexed_term_p(v_term) : "kb_indexing_datastructures.indexed_term_p(v_term) " + "CommonSymbols.NIL != kb_indexing_datastructures.indexed_term_p(v_term) " + v_term;
        assert NIL != forts.fort_p(pred) : "forts.fort_p(pred) " + "CommonSymbols.NIL != forts.fort_p(pred) " + pred;
        assert NIL != term.hl_term_p(item) : "term.hl_term_p(item) " + "CommonSymbols.NIL != term.hl_term_p(item) " + item;
        assert NIL != integerp(index_arg) : "Types.integerp(index_arg) " + "CommonSymbols.NIL != Types.integerp(index_arg) " + index_arg;
        assert NIL != integerp(gather_arg) : "Types.integerp(gather_arg) " + "CommonSymbols.NIL != Types.integerp(gather_arg) " + gather_arg;
        assert NIL != enumeration_types.truth_p(truth) : "enumeration_types.truth_p(truth) " + "CommonSymbols.NIL != enumeration_types.truth_p(truth) " + truth;
        SubLObject v_answer = NIL;
        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, index_arg, pred)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, index_arg, pred);
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while (NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, truth, NIL);
                        SubLObject done_var_$43 = NIL;
                        final SubLObject token_var_$44 = NIL;
                        while (NIL == done_var_$43) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$44);
                            final SubLObject valid_$45 = makeBoolean(!token_var_$44.eql(assertion));
                            if (NIL != valid_$45) {
                                final SubLObject arg = assertions_high.gaf_arg(assertion, gather_arg);
                                if (NIL != list_utilities.tree_find(item, arg, UNPROVIDED, UNPROVIDED)) {
                                    if (NIL != $mapping_assertion_bookkeeping_fn$.getDynamicValue(thread)) {
                                        funcall($mapping_assertion_bookkeeping_fn$.getDynamicValue(thread), assertion);
                                    }
                                    v_answer = cons(arg, v_answer);
                                }
                            }
                            done_var_$43 = makeBoolean(NIL == valid_$45);
                        } 
                    } finally {
                        final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                done_var = makeBoolean(NIL == valid);
            } 
        }
        if (NIL != $mapping_equality_test$.getDynamicValue(thread)) {
            v_answer = list_utilities.fast_delete_duplicates(v_answer, $mapping_equality_test$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return v_answer;
    }

    public static SubLObject pred_values_mentioning_in_mt(final SubLObject v_term, final SubLObject pred, final SubLObject item, final SubLObject mt, SubLObject index_arg, SubLObject gather_arg, SubLObject truth) {
        if (index_arg == UNPROVIDED) {
            index_arg = ONE_INTEGER;
        }
        if (gather_arg == UNPROVIDED) {
            gather_arg = TWO_INTEGER;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != hlmt.hlmt_p(mt) : "hlmt.hlmt_p(mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(mt) " + mt;
        SubLObject v_answer = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            v_answer = pred_values_mentioning(v_term, pred, item, index_arg, gather_arg, truth);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    public static SubLObject pred_values_mentioning_in_mts(final SubLObject v_term, final SubLObject pred, final SubLObject item, final SubLObject mts, SubLObject index_arg, SubLObject gather_arg, SubLObject truth) {
        if (index_arg == UNPROVIDED) {
            index_arg = ONE_INTEGER;
        }
        if (gather_arg == UNPROVIDED) {
            gather_arg = TWO_INTEGER;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != listp(mts) : "Types.listp(mts) " + "CommonSymbols.NIL != Types.listp(mts) " + mts;
        SubLObject v_answer = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_IN_LIST, thread);
            mt_relevance_macros.$relevant_mts$.bind(mts, thread);
            v_answer = pred_values_mentioning(v_term, pred, item, index_arg, gather_arg, truth);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    public static SubLObject pred_values_mentioning_in_any_mt(final SubLObject v_term, final SubLObject pred, final SubLObject item, SubLObject index_arg, SubLObject gather_arg, SubLObject truth) {
        if (index_arg == UNPROVIDED) {
            index_arg = ONE_INTEGER;
        }
        if (gather_arg == UNPROVIDED) {
            gather_arg = TWO_INTEGER;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            v_answer = pred_values_mentioning(v_term, pred, item, index_arg, gather_arg, truth);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    public static SubLObject pred_values_mentioning_in_relevant_mts(final SubLObject v_term, final SubLObject pred, final SubLObject item, SubLObject mt, SubLObject index_arg, SubLObject gather_arg, SubLObject truth) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (index_arg == UNPROVIDED) {
            index_arg = ONE_INTEGER;
        }
        if (gather_arg == UNPROVIDED) {
            gather_arg = TWO_INTEGER;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            v_answer = pred_values_mentioning(v_term, pred, item, index_arg, gather_arg, truth);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    public static SubLObject fpred_arg_value(final SubLObject v_term, final SubLObject pred, final SubLObject arg, SubLObject term_psn, SubLObject arg_psn, SubLObject gather_psn, SubLObject truth) {
        if (term_psn == UNPROVIDED) {
            term_psn = ONE_INTEGER;
        }
        if (arg_psn == UNPROVIDED) {
            arg_psn = TWO_INTEGER;
        }
        if (gather_psn == UNPROVIDED) {
            gather_psn = THREE_INTEGER;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        return pred_arg_values(v_term, pred, arg, term_psn, arg_psn, gather_psn, truth, ONE_INTEGER).first();
    }

    public static SubLObject pred_arg_values(final SubLObject v_term, final SubLObject pred, final SubLObject arg, SubLObject term_psn, SubLObject arg_psn, SubLObject gather_psn, SubLObject truth, SubLObject number) {
        if (term_psn == UNPROVIDED) {
            term_psn = ONE_INTEGER;
        }
        if (arg_psn == UNPROVIDED) {
            arg_psn = TWO_INTEGER;
        }
        if (gather_psn == UNPROVIDED) {
            gather_psn = THREE_INTEGER;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        if (number == UNPROVIDED) {
            number = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != indexed_term_p(v_term) : "kb_indexing_datastructures.indexed_term_p(v_term) " + "CommonSymbols.NIL != kb_indexing_datastructures.indexed_term_p(v_term) " + v_term;
        assert NIL != forts.fort_p(pred) : "forts.fort_p(pred) " + "CommonSymbols.NIL != forts.fort_p(pred) " + pred;
        assert NIL != integerp(term_psn) : "Types.integerp(term_psn) " + "CommonSymbols.NIL != Types.integerp(term_psn) " + term_psn;
        assert NIL != integerp(arg_psn) : "Types.integerp(arg_psn) " + "CommonSymbols.NIL != Types.integerp(arg_psn) " + arg_psn;
        assert NIL != integerp(gather_psn) : "Types.integerp(gather_psn) " + "CommonSymbols.NIL != Types.integerp(gather_psn) " + gather_psn;
        assert NIL != enumeration_types.truth_p(truth) : "enumeration_types.truth_p(truth) " + "CommonSymbols.NIL != enumeration_types.truth_p(truth) " + truth;
        return (NIL != $use_optimized_pred_arg_values_fixed_arityP$.getDynamicValue(thread)) && (NIL != arity.arity(pred)) ? pred_arg_values_fixed_arity(v_term, pred, arg, term_psn, arg_psn, gather_psn, truth, number) : pred_arg_values_int(v_term, pred, arg, term_psn, arg_psn, gather_psn, truth, number);
    }

    public static SubLObject pred_arg_values_int(final SubLObject v_term, final SubLObject pred, final SubLObject arg, SubLObject term_psn, SubLObject arg_psn, SubLObject gather_psn, SubLObject truth, SubLObject number) {
        if (term_psn == UNPROVIDED) {
            term_psn = ONE_INTEGER;
        }
        if (arg_psn == UNPROVIDED) {
            arg_psn = TWO_INTEGER;
        }
        if (gather_psn == UNPROVIDED) {
            gather_psn = THREE_INTEGER;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        if (number == UNPROVIDED) {
            number = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result_count = ZERO_INTEGER;
        SubLObject result = NIL;
        SubLObject doneP = NIL;
        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, term_psn, pred)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, term_psn, pred);
            SubLObject done_var = doneP;
            final SubLObject token_var = NIL;
            while (NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, truth, NIL);
                        SubLObject done_var_$46 = doneP;
                        final SubLObject token_var_$47 = NIL;
                        while (NIL == done_var_$46) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$47);
                            final SubLObject valid_$48 = makeBoolean(!token_var_$47.eql(assertion));
                            if ((NIL != valid_$48) && arg.equalp(assertions_high.gaf_arg(assertion, arg_psn))) {
                                if (NIL != $mapping_assertion_bookkeeping_fn$.getDynamicValue(thread)) {
                                    funcall($mapping_assertion_bookkeeping_fn$.getDynamicValue(thread), assertion);
                                }
                                result = cons(assertions_high.gaf_arg(assertion, gather_psn), result);
                                result_count = add(result_count, ONE_INTEGER);
                                doneP = makeBoolean(number.isNumber() && result_count.numGE(number));
                            }
                            done_var_$46 = makeBoolean((NIL == valid_$48) || (NIL != doneP));
                        } 
                    } finally {
                        final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                done_var = makeBoolean((NIL == valid) || (NIL != doneP));
            } 
        }
        if (NIL != $mapping_equality_test$.getDynamicValue(thread)) {
            result = list_utilities.fast_delete_duplicates(result, $mapping_equality_test$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return result;
    }

    public static SubLObject pred_arg_values_fixed_arity(final SubLObject v_term, final SubLObject pred, final SubLObject arg, SubLObject term_psn, SubLObject arg_psn, SubLObject gather_psn, SubLObject truth, SubLObject number) {
        if (term_psn == UNPROVIDED) {
            term_psn = ONE_INTEGER;
        }
        if (arg_psn == UNPROVIDED) {
            arg_psn = TWO_INTEGER;
        }
        if (gather_psn == UNPROVIDED) {
            gather_psn = THREE_INTEGER;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        if (number == UNPROVIDED) {
            number = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_arity = arity.arity(pred);
        SubLObject result_count = ZERO_INTEGER;
        SubLObject result = NIL;
        SubLObject doneP = NIL;
        SubLObject asent = NIL;
        SubLObject variable_num = ZERO_INTEGER;
        asent = cons(pred, asent);
        SubLObject end_var;
        SubLObject n;
        for (end_var = add(v_arity, ONE_INTEGER), n = NIL, n = ONE_INTEGER; !n.numGE(end_var); n = number_utilities.f_1X(n)) {
            if (n.eql(term_psn)) {
                asent = cons(v_term, asent);
            } else
                if (n.eql(arg_psn)) {
                    asent = cons(arg, asent);
                } else {
                    asent = cons(variables.get_variable(variable_num), asent);
                    variable_num = add(variable_num, ONE_INTEGER);
                }

        }
        asent = nreverse(asent);
        final SubLObject l_index = kb_indexing.best_gaf_lookup_index(asent, truth, NIL);
        final SubLObject pcase_var;
        final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
        if (pcase_var.eql($GAF_ARG)) {
            thread.resetMultipleValues();
            final SubLObject v_term_$49 = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
            final SubLObject argnum = thread.secondMultipleValue();
            final SubLObject predicate = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (NIL != argnum) {
                if (NIL != predicate) {
                    final SubLObject pred_var = predicate;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_$49, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_$49, argnum, pred_var);
                        SubLObject done_var = doneP;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, truth, NIL);
                                    SubLObject done_var_$50 = doneP;
                                    final SubLObject token_var_$51 = NIL;
                                    while (NIL == done_var_$50) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$51);
                                        final SubLObject valid_$52 = makeBoolean(!token_var_$51.eql(assertion));
                                        if ((NIL != valid_$52) && (NIL != unification_utilities.gaf_asent_unify(asent, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED))) {
                                            if (NIL != $mapping_assertion_bookkeeping_fn$.getDynamicValue(thread)) {
                                                funcall($mapping_assertion_bookkeeping_fn$.getDynamicValue(thread), assertion);
                                            }
                                            result = cons(assertions_high.gaf_arg(assertion, gather_psn), result);
                                            result_count = add(result_count, ONE_INTEGER);
                                            doneP = makeBoolean(number.isNumber() && result_count.numGE(number));
                                        }
                                        done_var_$50 = makeBoolean((NIL == valid_$52) || (NIL != doneP));
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean((NIL == valid) || (NIL != doneP));
                        } 
                    }
                } else {
                    final SubLObject pred_var = NIL;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_$49, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_$49, argnum, pred_var);
                        SubLObject done_var = doneP;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, truth, NIL);
                                    SubLObject done_var_$51 = doneP;
                                    final SubLObject token_var_$52 = NIL;
                                    while (NIL == done_var_$51) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$52);
                                        final SubLObject valid_$53 = makeBoolean(!token_var_$52.eql(assertion));
                                        if ((NIL != valid_$53) && (NIL != unification_utilities.gaf_asent_unify(asent, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED))) {
                                            if (NIL != $mapping_assertion_bookkeeping_fn$.getDynamicValue(thread)) {
                                                funcall($mapping_assertion_bookkeeping_fn$.getDynamicValue(thread), assertion);
                                            }
                                            result = cons(assertions_high.gaf_arg(assertion, gather_psn), result);
                                            result_count = add(result_count, ONE_INTEGER);
                                            doneP = makeBoolean(number.isNumber() && result_count.numGE(number));
                                        }
                                        done_var_$51 = makeBoolean((NIL == valid_$53) || (NIL != doneP));
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values2 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values2);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean((NIL == valid) || (NIL != doneP));
                        } 
                    }
                }
            } else
                if (NIL != predicate) {
                    final SubLObject pred_var = predicate;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_$49, NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_$49, NIL, pred_var);
                        SubLObject done_var = doneP;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, truth, NIL);
                                    SubLObject done_var_$52 = doneP;
                                    final SubLObject token_var_$53 = NIL;
                                    while (NIL == done_var_$52) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$53);
                                        final SubLObject valid_$54 = makeBoolean(!token_var_$53.eql(assertion));
                                        if ((NIL != valid_$54) && (NIL != unification_utilities.gaf_asent_unify(asent, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED))) {
                                            if (NIL != $mapping_assertion_bookkeeping_fn$.getDynamicValue(thread)) {
                                                funcall($mapping_assertion_bookkeeping_fn$.getDynamicValue(thread), assertion);
                                            }
                                            result = cons(assertions_high.gaf_arg(assertion, gather_psn), result);
                                            result_count = add(result_count, ONE_INTEGER);
                                            doneP = makeBoolean(number.isNumber() && result_count.numGE(number));
                                        }
                                        done_var_$52 = makeBoolean((NIL == valid_$54) || (NIL != doneP));
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values3 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values3);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean((NIL == valid) || (NIL != doneP));
                        } 
                    }
                } else {
                    final SubLObject pred_var = NIL;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_$49, NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_$49, NIL, pred_var);
                        SubLObject done_var = doneP;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, truth, NIL);
                                    SubLObject done_var_$53 = doneP;
                                    final SubLObject token_var_$54 = NIL;
                                    while (NIL == done_var_$53) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$54);
                                        final SubLObject valid_$55 = makeBoolean(!token_var_$54.eql(assertion));
                                        if ((NIL != valid_$55) && (NIL != unification_utilities.gaf_asent_unify(asent, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED))) {
                                            if (NIL != $mapping_assertion_bookkeeping_fn$.getDynamicValue(thread)) {
                                                funcall($mapping_assertion_bookkeeping_fn$.getDynamicValue(thread), assertion);
                                            }
                                            result = cons(assertions_high.gaf_arg(assertion, gather_psn), result);
                                            result_count = add(result_count, ONE_INTEGER);
                                            doneP = makeBoolean(number.isNumber() && result_count.numGE(number));
                                        }
                                        done_var_$53 = makeBoolean((NIL == valid_$55) || (NIL != doneP));
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values4 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values4);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean((NIL == valid) || (NIL != doneP));
                        } 
                    }
                }

        } else
            if (pcase_var.eql($PREDICATE_EXTENT)) {
                final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                    final SubLObject str = NIL;
                    final SubLObject _prev_bind_5 = $progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = $progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = $progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_9 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_10 = $progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_11 = $is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_12 = $silent_progressP$.currentBinding(thread);
                    try {
                        $progress_start_time$.bind(get_universal_time(), thread);
                        $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                        $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        $progress_notification_count$.bind(ZERO_INTEGER, thread);
                        $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                        $progress_count$.bind(ZERO_INTEGER, thread);
                        $is_noting_progressP$.bind(T, thread);
                        $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                        noting_progress_preamble(str);
                        final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                        SubLObject done_var2 = doneP;
                        final SubLObject token_var2 = NIL;
                        while (NIL == done_var2) {
                            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                            final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                            if (NIL != valid2) {
                                note_progress();
                                SubLObject final_index_iterator2 = NIL;
                                try {
                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, truth, NIL);
                                    SubLObject done_var_$54 = doneP;
                                    final SubLObject token_var_$55 = NIL;
                                    while (NIL == done_var_$54) {
                                        final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$55);
                                        final SubLObject valid_$56 = makeBoolean(!token_var_$55.eql(assertion2));
                                        if ((NIL != valid_$56) && (NIL != unification_utilities.gaf_asent_unify(asent, assertions_high.gaf_formula(assertion2), UNPROVIDED, UNPROVIDED))) {
                                            if (NIL != $mapping_assertion_bookkeeping_fn$.getDynamicValue(thread)) {
                                                funcall($mapping_assertion_bookkeeping_fn$.getDynamicValue(thread), assertion2);
                                            }
                                            result = cons(assertions_high.gaf_arg(assertion2, gather_psn), result);
                                            result_count = add(result_count, ONE_INTEGER);
                                            doneP = makeBoolean(number.isNumber() && result_count.numGE(number));
                                        }
                                        done_var_$54 = makeBoolean((NIL == valid_$56) || (NIL != doneP));
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$65 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values5 = getValuesAsVector();
                                        if (NIL != final_index_iterator2) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                        }
                                        restoreValuesFromVector(_values5);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$65, thread);
                                    }
                                }
                            }
                            done_var2 = makeBoolean((NIL == valid2) || (NIL != doneP));
                        } 
                        noting_progress_postamble();
                    } finally {
                        $silent_progressP$.rebind(_prev_bind_12, thread);
                        $is_noting_progressP$.rebind(_prev_bind_11, thread);
                        $progress_count$.rebind(_prev_bind_10, thread);
                        $progress_pacifications_since_last_nl$.rebind(_prev_bind_9, thread);
                        $progress_notification_count$.rebind(_prev_bind_8, thread);
                        $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_7, thread);
                        $progress_last_pacification_time$.rebind(_prev_bind_6, thread);
                        $progress_start_time$.rebind(_prev_bind_5, thread);
                    }
                }
            } else
                if (pcase_var.eql($OVERLAP)) {
                    SubLObject rest;
                    SubLObject assertion3;
                    for (rest = NIL, rest = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED); (NIL == doneP) && (NIL != rest); rest = rest.rest()) {
                        assertion3 = rest.first();
                        if (((NIL == truth) || (NIL != assertions_high.assertion_has_truth(assertion3, truth))) && (NIL != unification_utilities.gaf_asent_unify(asent, assertions_high.gaf_formula(assertion3), UNPROVIDED, UNPROVIDED))) {
                            if (NIL != $mapping_assertion_bookkeeping_fn$.getDynamicValue(thread)) {
                                funcall($mapping_assertion_bookkeeping_fn$.getDynamicValue(thread), assertion3);
                            }
                            result = cons(assertions_high.gaf_arg(assertion3, gather_psn), result);
                            result_count = add(result_count, ONE_INTEGER);
                            doneP = makeBoolean(number.isNumber() && result_count.numGE(number));
                        }
                    }
                } else {
                    kb_mapping_macros.do_gli_method_error(l_index, method);
                }


        if (NIL != $mapping_equality_test$.getDynamicValue(thread)) {
            result = list_utilities.fast_delete_duplicates(result, $mapping_equality_test$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return result;
    }

    public static SubLObject pred_arg_values_in_mt(final SubLObject v_term, final SubLObject pred, final SubLObject arg, final SubLObject mt, SubLObject term_psn, SubLObject arg_psn, SubLObject gather_psn, SubLObject truth) {
        if (term_psn == UNPROVIDED) {
            term_psn = ONE_INTEGER;
        }
        if (arg_psn == UNPROVIDED) {
            arg_psn = TWO_INTEGER;
        }
        if (gather_psn == UNPROVIDED) {
            gather_psn = THREE_INTEGER;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != hlmt.hlmt_p(mt) : "hlmt.hlmt_p(mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(mt) " + mt;
        SubLObject v_answer = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            v_answer = pred_arg_values(v_term, pred, arg, term_psn, arg_psn, gather_psn, truth, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    public static SubLObject pred_arg_values_in_mts(final SubLObject v_term, final SubLObject pred, final SubLObject arg, final SubLObject mts, SubLObject term_psn, SubLObject arg_psn, SubLObject gather_psn, SubLObject truth) {
        if (term_psn == UNPROVIDED) {
            term_psn = ONE_INTEGER;
        }
        if (arg_psn == UNPROVIDED) {
            arg_psn = TWO_INTEGER;
        }
        if (gather_psn == UNPROVIDED) {
            gather_psn = THREE_INTEGER;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != listp(mts) : "Types.listp(mts) " + "CommonSymbols.NIL != Types.listp(mts) " + mts;
        SubLObject v_answer = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_IN_LIST, thread);
            mt_relevance_macros.$relevant_mts$.bind(mts, thread);
            v_answer = pred_arg_values(v_term, pred, arg, term_psn, arg_psn, gather_psn, truth, UNPROVIDED);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    public static SubLObject pred_arg_values_in_any_mt(final SubLObject v_term, final SubLObject pred, final SubLObject arg, SubLObject term_psn, SubLObject arg_psn, SubLObject gather_psn, SubLObject truth) {
        if (term_psn == UNPROVIDED) {
            term_psn = ONE_INTEGER;
        }
        if (arg_psn == UNPROVIDED) {
            arg_psn = TWO_INTEGER;
        }
        if (gather_psn == UNPROVIDED) {
            gather_psn = THREE_INTEGER;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            v_answer = pred_arg_values(v_term, pred, arg, term_psn, arg_psn, gather_psn, truth, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    public static SubLObject pred_arg_values_in_relevant_mts(final SubLObject v_term, final SubLObject pred, final SubLObject arg, SubLObject mt, SubLObject term_psn, SubLObject arg_psn, SubLObject gather_psn, SubLObject truth) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (term_psn == UNPROVIDED) {
            term_psn = ONE_INTEGER;
        }
        if (arg_psn == UNPROVIDED) {
            arg_psn = TWO_INTEGER;
        }
        if (gather_psn == UNPROVIDED) {
            gather_psn = THREE_INTEGER;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            v_answer = pred_arg_values(v_term, pred, arg, term_psn, arg_psn, gather_psn, truth, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    public static SubLObject pred_value_tuples(final SubLObject v_term, final SubLObject pred, final SubLObject index_arg, final SubLObject gather_args, SubLObject truth) {
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(v_term, INDEXED_TERM_P);
        SubLTrampolineFile.enforceType(pred, FORT_P);
        SubLTrampolineFile.enforceType(index_arg, INTEGERP);
        SubLTrampolineFile.enforceType(gather_args, LISTP);
        SubLTrampolineFile.enforceType(truth, TRUTH_P);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == list_utilities.every_in_list(symbol_function(INTEGERP), gather_args, UNPROVIDED))) {
            Errors.error($str99$_S_is_not_a_valid_arg_position_li);
        }
        SubLObject v_answer = NIL;
        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, index_arg, pred)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, index_arg, pred);
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while (NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, truth, NIL);
                        SubLObject done_var_$66 = NIL;
                        final SubLObject token_var_$67 = NIL;
                        while (NIL == done_var_$66) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$67);
                            final SubLObject valid_$68 = makeBoolean(!token_var_$67.eql(assertion));
                            if (NIL != valid_$68) {
                                SubLObject tuple = NIL;
                                SubLObject cdolist_list_var = gather_args;
                                SubLObject arg = NIL;
                                arg = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    tuple = cons(assertions_high.gaf_arg(assertion, arg), tuple);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    arg = cdolist_list_var.first();
                                } 
                                tuple = nreverse(tuple);
                                if (NIL != $mapping_assertion_bookkeeping_fn$.getDynamicValue(thread)) {
                                    funcall($mapping_assertion_bookkeeping_fn$.getDynamicValue(thread), assertion);
                                }
                                v_answer = cons(tuple, v_answer);
                            }
                            done_var_$66 = makeBoolean(NIL == valid_$68);
                        } 
                    } finally {
                        final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                done_var = makeBoolean(NIL == valid);
            } 
        }
        if (NIL != $mapping_equality_test$.getDynamicValue(thread)) {
            v_answer = list_utilities.fast_delete_duplicates(v_answer, $mapping_equality_test$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return v_answer;
    }

    public static SubLObject pred_value_tuples_in_mt(final SubLObject v_term, final SubLObject pred, final SubLObject index_arg, final SubLObject gather_args, final SubLObject mt, SubLObject truth) {
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(v_term, INDEXED_TERM_P);
        SubLTrampolineFile.enforceType(pred, FORT_P);
        SubLTrampolineFile.enforceType(index_arg, INTEGERP);
        SubLTrampolineFile.enforceType(gather_args, LISTP);
        SubLTrampolineFile.enforceType(mt, HLMT_P);
        SubLTrampolineFile.enforceType(truth, TRUTH_P);
        SubLObject v_answer = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            v_answer = pred_value_tuples(v_term, pred, index_arg, gather_args, truth);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    public static SubLObject pred_value_tuples_in_mts(final SubLObject v_term, final SubLObject pred, final SubLObject index_arg, final SubLObject gather_args, final SubLObject mts, SubLObject truth) {
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(v_term, INDEXED_TERM_P);
        SubLTrampolineFile.enforceType(pred, FORT_P);
        SubLTrampolineFile.enforceType(index_arg, INTEGERP);
        SubLTrampolineFile.enforceType(gather_args, LISTP);
        SubLTrampolineFile.enforceType(mts, LISTP);
        SubLTrampolineFile.enforceType(truth, TRUTH_P);
        SubLObject v_answer = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_IN_LIST, thread);
            mt_relevance_macros.$relevant_mts$.bind(mts, thread);
            v_answer = pred_value_tuples(v_term, pred, index_arg, gather_args, truth);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    public static SubLObject pred_value_tuples_in_any_mt(final SubLObject v_term, final SubLObject pred, final SubLObject index_arg, final SubLObject gather_args, SubLObject truth) {
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(v_term, INDEXED_TERM_P);
        SubLTrampolineFile.enforceType(pred, FORT_P);
        SubLTrampolineFile.enforceType(index_arg, INTEGERP);
        SubLTrampolineFile.enforceType(gather_args, LISTP);
        SubLTrampolineFile.enforceType(truth, TRUTH_P);
        SubLObject v_answer = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            v_answer = pred_value_tuples(v_term, pred, index_arg, gather_args, truth);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    public static SubLObject pred_value_tuples_in_relevant_mts(final SubLObject v_term, final SubLObject pred, final SubLObject index_arg, final SubLObject gather_args, SubLObject mt, SubLObject truth) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(v_term, INDEXED_TERM_P);
        SubLTrampolineFile.enforceType(pred, FORT_P);
        SubLTrampolineFile.enforceType(index_arg, INTEGERP);
        SubLTrampolineFile.enforceType(gather_args, LISTP);
        SubLTrampolineFile.enforceType(truth, TRUTH_P);
        SubLObject v_answer = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            v_answer = pred_value_tuples(v_term, pred, index_arg, gather_args, truth);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    public static SubLObject gaf_truth_known(final SubLObject gaf) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject truth = NIL;
        final SubLObject l_index = kb_indexing.best_gaf_lookup_index(gaf, NIL, NIL);
        final SubLObject pcase_var;
        final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
        if (pcase_var.eql($GAF_ARG)) {
            thread.resetMultipleValues();
            final SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
            final SubLObject argnum = thread.secondMultipleValue();
            final SubLObject predicate = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (NIL != argnum) {
                if (NIL != predicate) {
                    final SubLObject pred_var = predicate;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                        SubLObject done_var = truth;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                    SubLObject done_var_$69 = truth;
                                    final SubLObject token_var_$70 = NIL;
                                    while (NIL == done_var_$69) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$70);
                                        final SubLObject valid_$71 = makeBoolean(!token_var_$70.eql(assertion));
                                        if ((NIL != valid_$71) && (NIL != unification_utilities.asent_unify(gaf, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED))) {
                                            truth = assertions_high.assertion_truth(assertion);
                                        }
                                        done_var_$69 = makeBoolean((NIL == valid_$71) || (NIL != truth));
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean((NIL == valid) || (NIL != truth));
                        } 
                    }
                } else {
                    final SubLObject pred_var = NIL;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                        SubLObject done_var = truth;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                    SubLObject done_var_$70 = truth;
                                    final SubLObject token_var_$71 = NIL;
                                    while (NIL == done_var_$70) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$71);
                                        final SubLObject valid_$72 = makeBoolean(!token_var_$71.eql(assertion));
                                        if ((NIL != valid_$72) && (NIL != unification_utilities.asent_unify(gaf, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED))) {
                                            truth = assertions_high.assertion_truth(assertion);
                                        }
                                        done_var_$70 = makeBoolean((NIL == valid_$72) || (NIL != truth));
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values2 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values2);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean((NIL == valid) || (NIL != truth));
                        } 
                    }
                }
            } else
                if (NIL != predicate) {
                    final SubLObject pred_var = predicate;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                        SubLObject done_var = truth;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                    SubLObject done_var_$71 = truth;
                                    final SubLObject token_var_$72 = NIL;
                                    while (NIL == done_var_$71) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$72);
                                        final SubLObject valid_$73 = makeBoolean(!token_var_$72.eql(assertion));
                                        if ((NIL != valid_$73) && (NIL != unification_utilities.asent_unify(gaf, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED))) {
                                            truth = assertions_high.assertion_truth(assertion);
                                        }
                                        done_var_$71 = makeBoolean((NIL == valid_$73) || (NIL != truth));
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values3 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values3);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean((NIL == valid) || (NIL != truth));
                        } 
                    }
                } else {
                    final SubLObject pred_var = NIL;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                        SubLObject done_var = truth;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                    SubLObject done_var_$72 = truth;
                                    final SubLObject token_var_$73 = NIL;
                                    while (NIL == done_var_$72) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$73);
                                        final SubLObject valid_$74 = makeBoolean(!token_var_$73.eql(assertion));
                                        if ((NIL != valid_$74) && (NIL != unification_utilities.asent_unify(gaf, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED))) {
                                            truth = assertions_high.assertion_truth(assertion);
                                        }
                                        done_var_$72 = makeBoolean((NIL == valid_$74) || (NIL != truth));
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values4 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values4);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean((NIL == valid) || (NIL != truth));
                        } 
                    }
                }

        } else
            if (pcase_var.eql($PREDICATE_EXTENT)) {
                final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                    final SubLObject str = NIL;
                    final SubLObject _prev_bind_5 = $progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = $progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = $progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_9 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_10 = $progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_11 = $is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_12 = $silent_progressP$.currentBinding(thread);
                    try {
                        $progress_start_time$.bind(get_universal_time(), thread);
                        $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                        $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        $progress_notification_count$.bind(ZERO_INTEGER, thread);
                        $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                        $progress_count$.bind(ZERO_INTEGER, thread);
                        $is_noting_progressP$.bind(T, thread);
                        $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                        noting_progress_preamble(str);
                        final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                        SubLObject done_var2 = truth;
                        final SubLObject token_var2 = NIL;
                        while (NIL == done_var2) {
                            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                            final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                            if (NIL != valid2) {
                                note_progress();
                                SubLObject final_index_iterator2 = NIL;
                                try {
                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, NIL, NIL);
                                    SubLObject done_var_$73 = truth;
                                    final SubLObject token_var_$74 = NIL;
                                    while (NIL == done_var_$73) {
                                        final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$74);
                                        final SubLObject valid_$75 = makeBoolean(!token_var_$74.eql(assertion2));
                                        if ((NIL != valid_$75) && (NIL != unification_utilities.asent_unify(gaf, assertions_high.gaf_formula(assertion2), UNPROVIDED, UNPROVIDED))) {
                                            truth = assertions_high.assertion_truth(assertion2);
                                        }
                                        done_var_$73 = makeBoolean((NIL == valid_$75) || (NIL != truth));
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$84 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values5 = getValuesAsVector();
                                        if (NIL != final_index_iterator2) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                        }
                                        restoreValuesFromVector(_values5);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$84, thread);
                                    }
                                }
                            }
                            done_var2 = makeBoolean((NIL == valid2) || (NIL != truth));
                        } 
                        noting_progress_postamble();
                    } finally {
                        $silent_progressP$.rebind(_prev_bind_12, thread);
                        $is_noting_progressP$.rebind(_prev_bind_11, thread);
                        $progress_count$.rebind(_prev_bind_10, thread);
                        $progress_pacifications_since_last_nl$.rebind(_prev_bind_9, thread);
                        $progress_notification_count$.rebind(_prev_bind_8, thread);
                        $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_7, thread);
                        $progress_last_pacification_time$.rebind(_prev_bind_6, thread);
                        $progress_start_time$.rebind(_prev_bind_5, thread);
                    }
                }
            } else
                if (pcase_var.eql($OVERLAP)) {
                    SubLObject rest;
                    SubLObject assertion3;
                    for (rest = NIL, rest = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED); (NIL == truth) && (NIL != rest); rest = rest.rest()) {
                        assertion3 = rest.first();
                        if (NIL != unification_utilities.asent_unify(gaf, assertions_high.gaf_formula(assertion3), UNPROVIDED, UNPROVIDED)) {
                            truth = assertions_high.assertion_truth(assertion3);
                        }
                    }
                } else {
                    kb_mapping_macros.do_gli_method_error(l_index, method);
                }


        return truth;
    }

    public static SubLObject gaf_trueP(final SubLObject gaf_formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject l_index = kb_indexing.best_gaf_lookup_index(gaf_formula, NIL, NIL);
        final SubLObject pcase_var;
        final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
        if (pcase_var.eql($GAF_ARG)) {
            thread.resetMultipleValues();
            final SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
            final SubLObject argnum = thread.secondMultipleValue();
            final SubLObject predicate = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (NIL != argnum) {
                if (NIL != predicate) {
                    final SubLObject pred_var = predicate;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                    SubLObject done_var_$85 = NIL;
                                    final SubLObject token_var_$86 = NIL;
                                    while (NIL == done_var_$85) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$86);
                                        final SubLObject valid_$87 = makeBoolean(!token_var_$86.eql(assertion));
                                        if (((NIL != valid_$87) && (NIL != unification_utilities.asent_unify(gaf_formula, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED))) && ($TRUE == assertions_high.assertion_truth(assertion))) {
                                            return T;
                                        }
                                        done_var_$85 = makeBoolean(NIL == valid_$87);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                } else {
                    final SubLObject pred_var = NIL;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                    SubLObject done_var_$86 = NIL;
                                    final SubLObject token_var_$87 = NIL;
                                    while (NIL == done_var_$86) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$87);
                                        final SubLObject valid_$88 = makeBoolean(!token_var_$87.eql(assertion));
                                        if (((NIL != valid_$88) && (NIL != unification_utilities.asent_unify(gaf_formula, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED))) && ($TRUE == assertions_high.assertion_truth(assertion))) {
                                            return T;
                                        }
                                        done_var_$86 = makeBoolean(NIL == valid_$88);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values2 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values2);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                }
            } else
                if (NIL != predicate) {
                    final SubLObject pred_var = predicate;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                    SubLObject done_var_$87 = NIL;
                                    final SubLObject token_var_$88 = NIL;
                                    while (NIL == done_var_$87) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$88);
                                        final SubLObject valid_$89 = makeBoolean(!token_var_$88.eql(assertion));
                                        if (((NIL != valid_$89) && (NIL != unification_utilities.asent_unify(gaf_formula, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED))) && ($TRUE == assertions_high.assertion_truth(assertion))) {
                                            return T;
                                        }
                                        done_var_$87 = makeBoolean(NIL == valid_$89);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values3 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values3);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                } else {
                    final SubLObject pred_var = NIL;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                    SubLObject done_var_$88 = NIL;
                                    final SubLObject token_var_$89 = NIL;
                                    while (NIL == done_var_$88) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$89);
                                        final SubLObject valid_$90 = makeBoolean(!token_var_$89.eql(assertion));
                                        if (((NIL != valid_$90) && (NIL != unification_utilities.asent_unify(gaf_formula, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED))) && ($TRUE == assertions_high.assertion_truth(assertion))) {
                                            return T;
                                        }
                                        done_var_$88 = makeBoolean(NIL == valid_$90);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values4 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values4);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                }

        } else
            if (pcase_var.eql($PREDICATE_EXTENT)) {
                final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                    final SubLObject str = NIL;
                    final SubLObject _prev_bind_5 = $progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = $progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = $progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_9 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_10 = $progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_11 = $is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_12 = $silent_progressP$.currentBinding(thread);
                    try {
                        $progress_start_time$.bind(get_universal_time(), thread);
                        $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                        $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        $progress_notification_count$.bind(ZERO_INTEGER, thread);
                        $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                        $progress_count$.bind(ZERO_INTEGER, thread);
                        $is_noting_progressP$.bind(T, thread);
                        $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                        noting_progress_preamble(str);
                        final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                        SubLObject done_var2 = NIL;
                        final SubLObject token_var2 = NIL;
                        while (NIL == done_var2) {
                            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                            final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                            if (NIL != valid2) {
                                note_progress();
                                SubLObject final_index_iterator2 = NIL;
                                try {
                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, NIL, NIL);
                                    SubLObject done_var_$89 = NIL;
                                    final SubLObject token_var_$90 = NIL;
                                    while (NIL == done_var_$89) {
                                        final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$90);
                                        final SubLObject valid_$91 = makeBoolean(!token_var_$90.eql(assertion2));
                                        if (((NIL != valid_$91) && (NIL != unification_utilities.asent_unify(gaf_formula, assertions_high.gaf_formula(assertion2), UNPROVIDED, UNPROVIDED))) && ($TRUE == assertions_high.assertion_truth(assertion2))) {
                                            return T;
                                        }
                                        done_var_$89 = makeBoolean(NIL == valid_$91);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$100 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values5 = getValuesAsVector();
                                        if (NIL != final_index_iterator2) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                        }
                                        restoreValuesFromVector(_values5);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$100, thread);
                                    }
                                }
                            }
                            done_var2 = makeBoolean(NIL == valid2);
                        } 
                        noting_progress_postamble();
                    } finally {
                        $silent_progressP$.rebind(_prev_bind_12, thread);
                        $is_noting_progressP$.rebind(_prev_bind_11, thread);
                        $progress_count$.rebind(_prev_bind_10, thread);
                        $progress_pacifications_since_last_nl$.rebind(_prev_bind_9, thread);
                        $progress_notification_count$.rebind(_prev_bind_8, thread);
                        $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_7, thread);
                        $progress_last_pacification_time$.rebind(_prev_bind_6, thread);
                        $progress_start_time$.rebind(_prev_bind_5, thread);
                    }
                }
            } else
                if (pcase_var.eql($OVERLAP)) {
                    SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED);
                    SubLObject assertion3 = NIL;
                    assertion3 = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if ((NIL != unification_utilities.asent_unify(gaf_formula, assertions_high.gaf_formula(assertion3), UNPROVIDED, UNPROVIDED)) && ($TRUE == assertions_high.assertion_truth(assertion3))) {
                            return T;
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        assertion3 = cdolist_list_var.first();
                    } 
                } else {
                    kb_mapping_macros.do_gli_method_error(l_index, method);
                }


        return NIL;
    }

    public static SubLObject declare_kb_mapping_utilities_file() {
        declareFunction(me, "some_pred_value", "SOME-PRED-VALUE", 2, 2, false);
        declareFunction(me, "some_pred_value_in_mt", "SOME-PRED-VALUE-IN-MT", 3, 2, false);
        declareFunction(me, "some_pred_value_in_mts", "SOME-PRED-VALUE-IN-MTS", 3, 2, false);
        declareFunction(me, "some_pred_value_in_any_mt", "SOME-PRED-VALUE-IN-ANY-MT", 2, 2, false);
        declareFunction(me, "some_pred_value_in_relevant_mts", "SOME-PRED-VALUE-IN-RELEVANT-MTS", 2, 3, false);
        declareFunction(me, "some_pred_value_if", "SOME-PRED-VALUE-IF", 3, 2, false);
        declareFunction(me, "fpred_value_gaf", "FPRED-VALUE-GAF", 2, 2, false);
        declareFunction(me, "fpred_value_gaf_in_relevant_mts", "FPRED-VALUE-GAF-IN-RELEVANT-MTS", 2, 3, false);
        declareFunction(me, "fpred_value_gaf_in_any_mt", "FPRED-VALUE-GAF-IN-ANY-MT", 2, 2, false);
        declareFunction(me, "fpred_value", "FPRED-VALUE", 2, 3, false);
        declareFunction(me, "fpred_value_in_mt", "FPRED-VALUE-IN-MT", 3, 3, false);
        declareFunction(me, "fpred_value_in_mts", "FPRED-VALUE-IN-MTS", 3, 3, false);
        declareFunction(me, "fpred_value_in_any_mt", "FPRED-VALUE-IN-ANY-MT", 2, 3, false);
        declareFunction(me, "fpred_value_in_relevant_mts", "FPRED-VALUE-IN-RELEVANT-MTS", 2, 4, false);
        declareFunction(me, "pred_value_gafs", "PRED-VALUE-GAFS", 2, 2, false);
        declareFunction(me, "pred_value_gafs_in_mt", "PRED-VALUE-GAFS-IN-MT", 3, 2, false);
        declareFunction(me, "pred_value_gafs_in_relevant_mts", "PRED-VALUE-GAFS-IN-RELEVANT-MTS", 2, 3, false);
        declareFunction(me, "pred_value_gafs_in_any_mt", "PRED-VALUE-GAFS-IN-ANY-MT", 2, 2, false);
        declareFunction(me, "pred_values", "PRED-VALUES", 2, 3, false);
        declareFunction(me, "pred_values_in_mt", "PRED-VALUES-IN-MT", 3, 3, false);
        declareFunction(me, "pred_values_in_mts", "PRED-VALUES-IN-MTS", 3, 3, false);
        declareFunction(me, "pred_values_in_any_mt", "PRED-VALUES-IN-ANY-MT", 2, 3, false);
        declareFunction(me, "pred_values_in_relevant_mts", "PRED-VALUES-IN-RELEVANT-MTS", 2, 4, false);
        declareFunction(me, "pred_refs", "PRED-REFS", 1, 2, false);
        declareFunction(me, "pred_refs_in_mt", "PRED-REFS-IN-MT", 2, 2, false);
        declareFunction(me, "pred_refs_in_mts", "PRED-REFS-IN-MTS", 2, 2, false);
        declareFunction(me, "pred_refs_in_any_mt", "PRED-REFS-IN-ANY-MT", 1, 2, false);
        declareFunction(me, "pred_refs_in_relevant_mts", "PRED-REFS-IN-RELEVANT-MTS", 1, 3, false);
        declareFunction(me, "pred_u_v_holds_gafs", "PRED-U-V-HOLDS-GAFS", 3, 3, false);
        declareFunction(me, "pred_u_v_holds_tuples", "PRED-U-V-HOLDS-TUPLES", 4, 3, false);
        declareFunction(me, "pred_u_v_w_holds_tuples", "PRED-U-V-W-HOLDS-TUPLES", 5, 4, false);
        declareFunction(me, "fpred_u_v_holds_gaf", "FPRED-U-V-HOLDS-GAF", 3, 3, false);
        declareFunction(me, "pred_u_v_holds_gafs_in_relevant_mts", "PRED-U-V-HOLDS-GAFS-IN-RELEVANT-MTS", 3, 4, false);
        declareFunction(me, "fpred_u_v_holds_gaf_in_relevant_mts", "FPRED-U-V-HOLDS-GAF-IN-RELEVANT-MTS", 3, 4, false);
        declareFunction(me, "pred_u_v_holds_gafs_in_any_mt", "PRED-U-V-HOLDS-GAFS-IN-ANY-MT", 3, 3, false);
        declareFunction(me, "fpred_u_v_holds_gaf_in_any_mt", "FPRED-U-V-HOLDS-GAF-IN-ANY-MT", 3, 3, false);
        declareFunction(me, "pred_u_v_holds", "PRED-U-V-HOLDS", 3, 3, false);
        declareFunction(me, "pred_u_v_holds_in_mt", "PRED-U-V-HOLDS-IN-MT", 4, 3, false);
        declareFunction(me, "pred_u_v_holds_in_mts", "PRED-U-V-HOLDS-IN-MTS", 4, 3, false);
        declareFunction(me, "pred_u_v_holds_in_any_mt", "PRED-U-V-HOLDS-IN-ANY-MT", 3, 3, false);
        declareFunction(me, "pred_u_v_holds_in_relevant_mts", "PRED-U-V-HOLDS-IN-RELEVANT-MTS", 3, 4, false);
        declareFunction(me, "tuple_holds", "TUPLE-HOLDS", 1, 2, false);
        declareFunction(me, "tuple_holds_in_mt", "TUPLE-HOLDS-IN-MT", 2, 2, false);
        declareFunction(me, "tuple_holds_in_mts", "TUPLE-HOLDS-IN-MTS", 2, 2, false);
        declareFunction(me, "tuple_holds_in_any_mt", "TUPLE-HOLDS-IN-ANY-MT", 1, 2, false);
        declareFunction(me, "tuple_holds_in_relevant_mts", "TUPLE-HOLDS-IN-RELEVANT-MTS", 1, 3, false);
        declareFunction(me, "pred_values_mentioning", "PRED-VALUES-MENTIONING", 3, 3, false);
        declareFunction(me, "pred_values_mentioning_in_mt", "PRED-VALUES-MENTIONING-IN-MT", 4, 3, false);
        declareFunction(me, "pred_values_mentioning_in_mts", "PRED-VALUES-MENTIONING-IN-MTS", 4, 3, false);
        declareFunction(me, "pred_values_mentioning_in_any_mt", "PRED-VALUES-MENTIONING-IN-ANY-MT", 3, 3, false);
        declareFunction(me, "pred_values_mentioning_in_relevant_mts", "PRED-VALUES-MENTIONING-IN-RELEVANT-MTS", 3, 4, false);
        declareFunction(me, "fpred_arg_value", "FPRED-ARG-VALUE", 3, 4, false);
        declareFunction(me, "pred_arg_values", "PRED-ARG-VALUES", 3, 5, false);
        declareFunction(me, "pred_arg_values_int", "PRED-ARG-VALUES-INT", 3, 5, false);
        declareFunction(me, "pred_arg_values_fixed_arity", "PRED-ARG-VALUES-FIXED-ARITY", 3, 5, false);
        declareFunction(me, "pred_arg_values_in_mt", "PRED-ARG-VALUES-IN-MT", 4, 4, false);
        declareFunction(me, "pred_arg_values_in_mts", "PRED-ARG-VALUES-IN-MTS", 4, 4, false);
        declareFunction(me, "pred_arg_values_in_any_mt", "PRED-ARG-VALUES-IN-ANY-MT", 3, 4, false);
        declareFunction(me, "pred_arg_values_in_relevant_mts", "PRED-ARG-VALUES-IN-RELEVANT-MTS", 3, 5, false);
        declareFunction(me, "pred_value_tuples", "PRED-VALUE-TUPLES", 4, 1, false);
        declareFunction(me, "pred_value_tuples_in_mt", "PRED-VALUE-TUPLES-IN-MT", 5, 1, false);
        declareFunction(me, "pred_value_tuples_in_mts", "PRED-VALUE-TUPLES-IN-MTS", 5, 1, false);
        declareFunction(me, "pred_value_tuples_in_any_mt", "PRED-VALUE-TUPLES-IN-ANY-MT", 4, 1, false);
        declareFunction(me, "pred_value_tuples_in_relevant_mts", "PRED-VALUE-TUPLES-IN-RELEVANT-MTS", 4, 2, false);
        declareFunction(me, "gaf_truth_known", "GAF-TRUTH-KNOWN", 1, 0, false);
        declareFunction(me, "gaf_trueP", "GAF-TRUE?", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_kb_mapping_utilities_file() {
        defparameter("*USE-OPTIMIZED-PRED-ARG-VALUES-FIXED-ARITY?*", T);
        return NIL;
    }

    public static SubLObject setup_kb_mapping_utilities_file() {
        register_cyc_api_function(SOME_PRED_VALUE, $list7, $str8$Find_the_first_gaf_assertion_such, $list9, $list10);
        register_cyc_api_function(SOME_PRED_VALUE_IN_MT, $list14, $str15$Find_the_first_gaf_assertion_such, $list16, $list10);
        register_cyc_api_function(SOME_PRED_VALUE_IN_MTS, $list20, $str21$Find_the_first_gaf_assertion_such, $list22, $list10);
        register_cyc_api_function(SOME_PRED_VALUE_IN_ANY_MT, $list7, $str26$Find_the_first_gaf_assertion_such, $list9, $list10);
        register_cyc_api_function(SOME_PRED_VALUE_IN_RELEVANT_MTS, $list28, $str29$If_MT_is_NIL__behaves_like_SOME_P, $list9, $list10);
        register_cyc_api_function(FPRED_VALUE, $list32, $str33$Find_the_first_gaf_assertion_such, $list34, $list35);
        register_cyc_api_function(FPRED_VALUE_IN_MT, $list37, $str38$Find_the_first_gaf_assertion_such, $list39, $list35);
        register_cyc_api_function(FPRED_VALUE_IN_MTS, $list41, $str42$Find_the_first_gaf_assertion_such, $list43, $list35);
        register_cyc_api_function(FPRED_VALUE_IN_ANY_MT, $list32, $str45$Find_the_first_gaf_assertion_such, $list34, $list35);
        register_cyc_api_function(FPRED_VALUE_IN_RELEVANT_MTS, $list47, $str48$If_MT_is_NIL__behaves_like_FPRED_, $list34, $list35);
        register_cyc_api_function(PRED_VALUES, $list32, $str50$Find_all_gaf_assertions_such_that, $list34, $list51);
        register_cyc_api_function(PRED_VALUES_IN_MT, $list37, $str53$Find_all_gaf_assertions_such_that, $list39, $list51);
        register_cyc_api_function(PRED_VALUES_IN_MTS, $list41, $str55$Find_all_gaf_assertions_such_that, $list43, $list51);
        register_cyc_api_function(PRED_VALUES_IN_ANY_MT, $list32, $str57$Find_all_gaf_assertions_such_that, $list34, $list51);
        register_cyc_api_function(PRED_VALUES_IN_RELEVANT_MTS, $list47, $str59$If_MT_is_NIL__behaves_like_PRED_V, $list34, $list51);
        register_cyc_api_function(PRED_REFS, $list61, $str62$Find_all_gaf_assertions_such_that, $list63, $list51);
        register_cyc_api_function(PRED_REFS_IN_MT, $list65, $str66$Find_all_gaf_assertions_such_that, $list67, $list51);
        register_cyc_api_function(PRED_REFS_IN_MTS, $list69, $str70$Find_all_gaf_assertions_such_that, $list71, $list51);
        register_cyc_api_function(PRED_REFS_IN_ANY_MT, $list61, $str73$Find_all_gaf_assertions_such_that, $list63, $list51);
        register_cyc_api_function(PRED_REFS_IN_RELEVANT_MTS, $list75, $str76$If_MT_is_NIL__behaves_like_PRED_R, $list63, $list51);
        register_cyc_api_function(PRED_U_V_HOLDS, $list79, $str80$Find_the_first_gaf_assertion_such, $list81, $list10);
        register_cyc_api_function(PRED_U_V_HOLDS_IN_MT, $list83, $str84$Find_the_first_gaf_assertion_such, $list85, $list10);
        register_cyc_api_function(PRED_U_V_HOLDS_IN_MTS, $list87, $str88$Find_the_first_gaf_assertion_such, $list89, $list10);
        register_cyc_api_function(PRED_U_V_HOLDS_IN_ANY_MT, $list79, $str91$Find_the_first_gaf_assertion_such, $list81, $list10);
        register_cyc_api_function(PRED_U_V_HOLDS_IN_RELEVANT_MTS, $list93, $str94$If_MT_is_NIL__behaves_like_PRED_U, $list81, $list10);
        register_cyc_api_function(PRED_VALUE_TUPLES, $list101, $str102$Find_all_gaf_assertions_such_that, $list103, $list104);
        register_cyc_api_function(PRED_VALUE_TUPLES_IN_MT, $list106, $str107$Find_all_gaf_assertions_such_that, $list108, $list104);
        register_cyc_api_function(PRED_VALUE_TUPLES_IN_MTS, $list110, $str111$Find_all_gaf_assertions_such_that, $list112, $list104);
        register_cyc_api_function(PRED_VALUE_TUPLES_IN_ANY_MT, $list101, $str114$Find_all_gaf_assertions_such_that, $list103, $list104);
        register_cyc_api_function(PRED_VALUE_TUPLES_IN_RELEVANT_MTS, $list116, $str117$If_MT_is_NIL__behaves_like_PRED_V, $list103, $list104);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_kb_mapping_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_kb_mapping_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_kb_mapping_utilities_file();
    }

    static {

























































































































    }
}

/**
 * Total time: 2061 ms
 */
