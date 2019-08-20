/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.sksi.sks_indexing;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;

import com.cyc.cycjava.cycl.V12;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SKSI-SKS-MAPPING-MACROS
 * source file: /cyc/top/cycl/sksi/sks-indexing/sksi-sks-mapping-macros.lisp
 * created:     2019/07/03 17:37:24
 */
public final class sksi_sks_mapping_macros extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new sksi_sks_mapping_macros();



    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(list(makeSymbol("SUPPORT-VAR"), makeSymbol("ASENT"), makeSymbol("SENSE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list1 = list($DONE);

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    static private final SubLSymbol $sym4$SUPPORT = makeUninternedSymbol("SUPPORT");

    private static final SubLSymbol GATHER_SKSI_GAF_LOOKUP_INDEX = makeSymbol("GATHER-SKSI-GAF-LOOKUP-INDEX");

    static private final SubLList $list8 = list(list(makeSymbol("GATHER-SENTENCE"), makeSymbol("GATHER-MT"), makeSymbol("PREDICATE"), makeSymbol("&KEY"), list(makeSymbol("TRUTH"), $TRUE), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list9 = list(makeKeyword("TRUTH"), $DONE);

    static private final SubLSymbol $sym12$GATHER_SENTENCE_MT_PAIR = makeUninternedSymbol("GATHER-SENTENCE-MT-PAIR");

    private static final SubLSymbol GATHER_SKSI_PREDICATE_EXTENT_INDEX = makeSymbol("GATHER-SKSI-PREDICATE-EXTENT-INDEX");

    static private final SubLList $list15 = list(list(new SubLObject[]{ makeSymbol("GATHER-ARG"), makeSymbol("GATHER-MT"), makeSymbol("INDEX-ARG"), makeSymbol("PREDICATE"), makeSymbol("&KEY"), list(makeSymbol("GATHER-ARGNUM"), TWO_INTEGER), list(makeSymbol("INDEX-ARGNUM"), ONE_INTEGER), list(makeSymbol("TRUTH"), $TRUE), makeSymbol("DONE") }), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list16 = list(makeKeyword("GATHER-ARGNUM"), makeKeyword("INDEX-ARGNUM"), makeKeyword("TRUTH"), $DONE);

    static private final SubLSymbol $sym19$GATHER_ARG_MT_PAIR = makeUninternedSymbol("GATHER-ARG-MT-PAIR");

    private static final SubLSymbol GATHER_SKSI_GAF_ARG_INDEX_VALUES = makeSymbol("GATHER-SKSI-GAF-ARG-INDEX-VALUES");

    static private final SubLList $list21 = list(list(makeSymbol("GATHER-SENTENCE"), makeSymbol("GATHER-MT"), makeSymbol("INDEX-ARG"), makeSymbol("PREDICATE"), makeSymbol("&KEY"), list(makeSymbol("INDEX-ARGNUM"), ONE_INTEGER), list(makeSymbol("TRUTH"), $TRUE), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list22 = list(makeKeyword("INDEX-ARGNUM"), makeKeyword("TRUTH"), $DONE);

    static private final SubLSymbol $sym23$GATHER_SENTENCE_MT_PAIR = makeUninternedSymbol("GATHER-SENTENCE-MT-PAIR");

    private static final SubLSymbol GATHER_SKSI_GAF_ARG_INDEX = makeSymbol("GATHER-SKSI-GAF-ARG-INDEX");

    static private final SubLSymbol $sym25$GATHER_SENTENCE_MT_PAIR = makeUninternedSymbol("GATHER-SENTENCE-MT-PAIR");

    private static final SubLSymbol WITH_ALL_SPEC_PREDICATES_AND_INVERSES = makeSymbol("WITH-ALL-SPEC-PREDICATES-AND-INVERSES");

    static private final SubLSymbol $sym27$SPEC_PRED = makeUninternedSymbol("SPEC-PRED");

    static private final SubLSymbol $sym28$INVERSE_MODE_ = makeUninternedSymbol("INVERSE-MODE?");

    static private final SubLSymbol $sym29$NEW_GATHER_ARGNUM = makeUninternedSymbol("NEW-GATHER-ARGNUM");

    static private final SubLSymbol $sym30$NEW_INDEX_ARGNUM = makeUninternedSymbol("NEW-INDEX-ARGNUM");

    private static final SubLSymbol DO_ALL_SPEC_PREDICATES_AND_INVERSES = makeSymbol("DO-ALL-SPEC-PREDICATES-AND-INVERSES");

    private static final SubLSymbol DO_SKSI_GAF_ARG_INDEX_VALUES = makeSymbol("DO-SKSI-GAF-ARG-INDEX-VALUES");

    static private final SubLList $list35 = list(list(new SubLObject[]{ makeSymbol("GATHER-ARG"), makeSymbol("GATHER-MT"), makeSymbol("GATHER-PRED"), makeSymbol("INDEX-ARG"), makeSymbol("&KEY"), list(makeSymbol("GATHER-ARGNUM"), TWO_INTEGER), list(makeSymbol("INDEX-ARGNUM"), ONE_INTEGER), list(makeSymbol("TRUTH"), $TRUE), makeSymbol("DONE") }), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym36$GATHER_ARG_MT_PRED_TUPLE = makeUninternedSymbol("GATHER-ARG-MT-PRED-TUPLE");

    private static final SubLSymbol GATHER_SKSI_GAF_ARG_INDEX_VALUES_RELEVANT_PRED = makeSymbol("GATHER-SKSI-GAF-ARG-INDEX-VALUES-RELEVANT-PRED");

    static private final SubLList $list38 = list(list(makeSymbol("GATHER-SENTENCE"), makeSymbol("GATHER-MT"), makeSymbol("INDEX-ARG"), makeSymbol("&KEY"), list(makeSymbol("INDEX-ARGNUM"), ONE_INTEGER), list(makeSymbol("TRUTH"), $TRUE), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym39$GATHER_SENTENCE_MT_PAIR = makeUninternedSymbol("GATHER-SENTENCE-MT-PAIR");

    private static final SubLSymbol GATHER_SKSI_GAF_ARG_INDEX_RELEVANT_PRED = makeSymbol("GATHER-SKSI-GAF-ARG-INDEX-RELEVANT-PRED");

    // Definitions
    public static final SubLObject do_sksi_gaf_lookup_index_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject support_var = NIL;
                    SubLObject asent = NIL;
                    SubLObject sense = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt0);
                    support_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt0);
                    asent = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt0);
                    sense = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_1 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt0);
                            current_1 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt0);
                            if (NIL == member(current_1, $list_alt1, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_1 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt0);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject support = $sym4$SUPPORT;
                                return list(DO_LIST, list(support, list(GATHER_SKSI_GAF_LOOKUP_INDEX, asent, sense), $DONE, done), listS(CLET, list(list(support_var, support)), append(body, NIL)));
                            }
                        }
                    }
                }
            }
        }
    }

    // Definitions
    public static SubLObject do_sksi_gaf_lookup_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject support_var = NIL;
        SubLObject asent = NIL;
        SubLObject sense = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        support_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        asent = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        sense = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list0);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list0);
            if (NIL == member(current_$1, $list1, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list0);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject support = $sym4$SUPPORT;
        return list(DO_LIST, list(support, list(GATHER_SKSI_GAF_LOOKUP_INDEX, asent, sense), $DONE, done), listS(CLET, list(list(support_var, support)), append(body, NIL)));
    }

    /**
     * Iterate over an index of gaf sentences and their mts executing BODY within the scope of GATHER-SENTENCE and GATHER-MT.
     * GATHER-SENTENCE and GATHER-MT are bound to each sentence-mt pair in the iteration such that:
     * The sentence is (virtually) in a relevant microtheory (relevance is established outside).
     * PREDICATE is the predicate.
     * If TRUTH is non-nil, the sentence has TRUTH as its truth value.
     * Iteration is halted as soon as DONE becomes non-nil.
     */
    @LispMethod(comment = "Iterate over an index of gaf sentences and their mts executing BODY within the scope of GATHER-SENTENCE and GATHER-MT.\r\nGATHER-SENTENCE and GATHER-MT are bound to each sentence-mt pair in the iteration such that:\r\nThe sentence is (virtually) in a relevant microtheory (relevance is established outside).\r\nPREDICATE is the predicate.\r\nIf TRUTH is non-nil, the sentence has TRUTH as its truth value.\r\nIteration is halted as soon as DONE becomes non-nil.\nIterate over an index of gaf sentences and their mts executing BODY within the scope of GATHER-SENTENCE and GATHER-MT.\nGATHER-SENTENCE and GATHER-MT are bound to each sentence-mt pair in the iteration such that:\nThe sentence is (virtually) in a relevant microtheory (relevance is established outside).\nPREDICATE is the predicate.\nIf TRUTH is non-nil, the sentence has TRUTH as its truth value.\nIteration is halted as soon as DONE becomes non-nil.")
    public static final SubLObject do_sksi_predicate_extent_index_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt8);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject gather_sentence = NIL;
                    SubLObject gather_mt = NIL;
                    SubLObject predicate = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt8);
                    gather_sentence = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt8);
                    gather_mt = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt8);
                    predicate = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_2 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt8);
                            current_2 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt8);
                            if (NIL == member(current_2, $list_alt9, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_2 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt8);
                        }
                        {
                            SubLObject truth_tail = property_list_member($TRUTH, current);
                            SubLObject truth = (NIL != truth_tail) ? ((SubLObject) (cadr(truth_tail))) : $TRUE;
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject gather_sentence_mt_pair = $sym12$GATHER_SENTENCE_MT_PAIR;
                                return list(DO_LIST, list(gather_sentence_mt_pair, list(GATHER_SKSI_PREDICATE_EXTENT_INDEX, predicate, truth), $DONE, done), listS(CDESTRUCTURING_BIND, list(gather_sentence, gather_mt), gather_sentence_mt_pair, append(body, NIL)));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Iterate over an index of gaf sentences and their mts executing BODY within the scope of GATHER-SENTENCE and GATHER-MT.
     * GATHER-SENTENCE and GATHER-MT are bound to each sentence-mt pair in the iteration such that:
     * The sentence is (virtually) in a relevant microtheory (relevance is established outside).
     * PREDICATE is the predicate.
     * If TRUTH is non-nil, the sentence has TRUTH as its truth value.
     * Iteration is halted as soon as DONE becomes non-nil.
     */
    @LispMethod(comment = "Iterate over an index of gaf sentences and their mts executing BODY within the scope of GATHER-SENTENCE and GATHER-MT.\r\nGATHER-SENTENCE and GATHER-MT are bound to each sentence-mt pair in the iteration such that:\r\nThe sentence is (virtually) in a relevant microtheory (relevance is established outside).\r\nPREDICATE is the predicate.\r\nIf TRUTH is non-nil, the sentence has TRUTH as its truth value.\r\nIteration is halted as soon as DONE becomes non-nil.\nIterate over an index of gaf sentences and their mts executing BODY within the scope of GATHER-SENTENCE and GATHER-MT.\nGATHER-SENTENCE and GATHER-MT are bound to each sentence-mt pair in the iteration such that:\nThe sentence is (virtually) in a relevant microtheory (relevance is established outside).\nPREDICATE is the predicate.\nIf TRUTH is non-nil, the sentence has TRUTH as its truth value.\nIteration is halted as soon as DONE becomes non-nil.")
    public static SubLObject do_sksi_predicate_extent_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list8);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject gather_sentence = NIL;
        SubLObject gather_mt = NIL;
        SubLObject predicate = NIL;
        destructuring_bind_must_consp(current, datum, $list8);
        gather_sentence = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list8);
        gather_mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list8);
        predicate = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list8);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list8);
            if (NIL == member(current_$2, $list9, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list8);
        }
        final SubLObject truth_tail = property_list_member($TRUTH, current);
        final SubLObject truth = (NIL != truth_tail) ? cadr(truth_tail) : $TRUE;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject gather_sentence_mt_pair = $sym12$GATHER_SENTENCE_MT_PAIR;
        return list(DO_LIST, list(gather_sentence_mt_pair, list(GATHER_SKSI_PREDICATE_EXTENT_INDEX, predicate, truth), $DONE, done), listS(CDESTRUCTURING_BIND, list(gather_sentence, gather_mt), gather_sentence_mt_pair, append(body, NIL)));
    }

    /**
     * Iterate over a list of values executing BODY within the scope of GATHER-ARG and GATHER-MT.
     * GATHER-ARG is bound to each value in the iteration such that:
     * The value appears in an SKSI sentence in the GATHER-ARGNUM position where
     * the predicate is PREDICATE and INDEX-ARG appears in the INDEX-ARGNUM position
     * and the sentence is (virtually) in a relevant microtheory (in GATHER-MT)
     * (relevance is established outside) and if TRUTH is non-nil, the SKSI sentence
     * has TRUTH as its truth value. Iteration is halted as soon as DONE becomes non-nil.
     */
    @LispMethod(comment = "Iterate over a list of values executing BODY within the scope of GATHER-ARG and GATHER-MT.\r\nGATHER-ARG is bound to each value in the iteration such that:\r\nThe value appears in an SKSI sentence in the GATHER-ARGNUM position where\r\nthe predicate is PREDICATE and INDEX-ARG appears in the INDEX-ARGNUM position\r\nand the sentence is (virtually) in a relevant microtheory (in GATHER-MT)\r\n(relevance is established outside) and if TRUTH is non-nil, the SKSI sentence\r\nhas TRUTH as its truth value. Iteration is halted as soon as DONE becomes non-nil.\nIterate over a list of values executing BODY within the scope of GATHER-ARG and GATHER-MT.\nGATHER-ARG is bound to each value in the iteration such that:\nThe value appears in an SKSI sentence in the GATHER-ARGNUM position where\nthe predicate is PREDICATE and INDEX-ARG appears in the INDEX-ARGNUM position\nand the sentence is (virtually) in a relevant microtheory (in GATHER-MT)\n(relevance is established outside) and if TRUTH is non-nil, the SKSI sentence\nhas TRUTH as its truth value. Iteration is halted as soon as DONE becomes non-nil.")
    public static final SubLObject do_sksi_gaf_arg_index_values_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt15);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject gather_arg = NIL;
                    SubLObject gather_mt = NIL;
                    SubLObject index_arg = NIL;
                    SubLObject predicate = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt15);
                    gather_arg = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt15);
                    gather_mt = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt15);
                    index_arg = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt15);
                    predicate = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_3 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt15);
                            current_3 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt15);
                            if (NIL == member(current_3, $list_alt16, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_3 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt15);
                        }
                        {
                            SubLObject gather_argnum_tail = property_list_member($GATHER_ARGNUM, current);
                            SubLObject gather_argnum = (NIL != gather_argnum_tail) ? ((SubLObject) (cadr(gather_argnum_tail))) : TWO_INTEGER;
                            SubLObject index_argnum_tail = property_list_member($INDEX_ARGNUM, current);
                            SubLObject index_argnum = (NIL != index_argnum_tail) ? ((SubLObject) (cadr(index_argnum_tail))) : ONE_INTEGER;
                            SubLObject truth_tail = property_list_member($TRUTH, current);
                            SubLObject truth = (NIL != truth_tail) ? ((SubLObject) (cadr(truth_tail))) : $TRUE;
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject gather_arg_mt_pair = $sym19$GATHER_ARG_MT_PAIR;
                                return list(DO_LIST, list(gather_arg_mt_pair, list(GATHER_SKSI_GAF_ARG_INDEX_VALUES, index_arg, index_argnum, gather_argnum, predicate, truth), $DONE, done), listS(CDESTRUCTURING_BIND, list(gather_arg, gather_mt), gather_arg_mt_pair, append(body, NIL)));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Iterate over a list of values executing BODY within the scope of GATHER-ARG and GATHER-MT.
     * GATHER-ARG is bound to each value in the iteration such that:
     * The value appears in an SKSI sentence in the GATHER-ARGNUM position where
     * the predicate is PREDICATE and INDEX-ARG appears in the INDEX-ARGNUM position
     * and the sentence is (virtually) in a relevant microtheory (in GATHER-MT)
     * (relevance is established outside) and if TRUTH is non-nil, the SKSI sentence
     * has TRUTH as its truth value. Iteration is halted as soon as DONE becomes non-nil.
     */
    @LispMethod(comment = "Iterate over a list of values executing BODY within the scope of GATHER-ARG and GATHER-MT.\r\nGATHER-ARG is bound to each value in the iteration such that:\r\nThe value appears in an SKSI sentence in the GATHER-ARGNUM position where\r\nthe predicate is PREDICATE and INDEX-ARG appears in the INDEX-ARGNUM position\r\nand the sentence is (virtually) in a relevant microtheory (in GATHER-MT)\r\n(relevance is established outside) and if TRUTH is non-nil, the SKSI sentence\r\nhas TRUTH as its truth value. Iteration is halted as soon as DONE becomes non-nil.\nIterate over a list of values executing BODY within the scope of GATHER-ARG and GATHER-MT.\nGATHER-ARG is bound to each value in the iteration such that:\nThe value appears in an SKSI sentence in the GATHER-ARGNUM position where\nthe predicate is PREDICATE and INDEX-ARG appears in the INDEX-ARGNUM position\nand the sentence is (virtually) in a relevant microtheory (in GATHER-MT)\n(relevance is established outside) and if TRUTH is non-nil, the SKSI sentence\nhas TRUTH as its truth value. Iteration is halted as soon as DONE becomes non-nil.")
    public static SubLObject do_sksi_gaf_arg_index_values(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list15);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject gather_arg = NIL;
        SubLObject gather_mt = NIL;
        SubLObject index_arg = NIL;
        SubLObject predicate = NIL;
        destructuring_bind_must_consp(current, datum, $list15);
        gather_arg = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list15);
        gather_mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list15);
        index_arg = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list15);
        predicate = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$3 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list15);
            current_$3 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list15);
            if (NIL == member(current_$3, $list16, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$3 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list15);
        }
        final SubLObject gather_argnum_tail = property_list_member($GATHER_ARGNUM, current);
        final SubLObject gather_argnum = (NIL != gather_argnum_tail) ? cadr(gather_argnum_tail) : TWO_INTEGER;
        final SubLObject index_argnum_tail = property_list_member($INDEX_ARGNUM, current);
        final SubLObject index_argnum = (NIL != index_argnum_tail) ? cadr(index_argnum_tail) : ONE_INTEGER;
        final SubLObject truth_tail = property_list_member($TRUTH, current);
        final SubLObject truth = (NIL != truth_tail) ? cadr(truth_tail) : $TRUE;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject gather_arg_mt_pair = $sym19$GATHER_ARG_MT_PAIR;
        return list(DO_LIST, list(gather_arg_mt_pair, list(GATHER_SKSI_GAF_ARG_INDEX_VALUES, index_arg, index_argnum, gather_argnum, predicate, truth), $DONE, done), listS(CDESTRUCTURING_BIND, list(gather_arg, gather_mt), gather_arg_mt_pair, append(body, NIL)));
    }

    /**
     * Like @xref do-sksi-gaf-arg-index-values except that iteration is over GAF formulas.
     */
    @LispMethod(comment = "Like @xref do-sksi-gaf-arg-index-values except that iteration is over GAF formulas.")
    public static final SubLObject do_sksi_gaf_arg_index_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt21);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject gather_sentence = NIL;
                    SubLObject gather_mt = NIL;
                    SubLObject index_arg = NIL;
                    SubLObject predicate = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt21);
                    gather_sentence = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt21);
                    gather_mt = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt21);
                    index_arg = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt21);
                    predicate = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_4 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt21);
                            current_4 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt21);
                            if (NIL == member(current_4, $list_alt22, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_4 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt21);
                        }
                        {
                            SubLObject index_argnum_tail = property_list_member($INDEX_ARGNUM, current);
                            SubLObject index_argnum = (NIL != index_argnum_tail) ? ((SubLObject) (cadr(index_argnum_tail))) : ONE_INTEGER;
                            SubLObject truth_tail = property_list_member($TRUTH, current);
                            SubLObject truth = (NIL != truth_tail) ? ((SubLObject) (cadr(truth_tail))) : $TRUE;
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject gather_sentence_mt_pair = $sym23$GATHER_SENTENCE_MT_PAIR;
                                return list(DO_LIST, list(gather_sentence_mt_pair, list(GATHER_SKSI_GAF_ARG_INDEX, index_arg, index_argnum, predicate, truth), $DONE, done), listS(CDESTRUCTURING_BIND, list(gather_sentence, gather_mt), gather_sentence_mt_pair, append(body, NIL)));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Like @xref do-sksi-gaf-arg-index-values except that iteration is over GAF formulas.
     */
    @LispMethod(comment = "Like @xref do-sksi-gaf-arg-index-values except that iteration is over GAF formulas.")
    public static SubLObject do_sksi_gaf_arg_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list21);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject gather_sentence = NIL;
        SubLObject gather_mt = NIL;
        SubLObject index_arg = NIL;
        SubLObject predicate = NIL;
        destructuring_bind_must_consp(current, datum, $list21);
        gather_sentence = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list21);
        gather_mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list21);
        index_arg = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list21);
        predicate = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$4 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list21);
            current_$4 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list21);
            if (NIL == member(current_$4, $list22, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$4 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list21);
        }
        final SubLObject index_argnum_tail = property_list_member($INDEX_ARGNUM, current);
        final SubLObject index_argnum = (NIL != index_argnum_tail) ? cadr(index_argnum_tail) : ONE_INTEGER;
        final SubLObject truth_tail = property_list_member($TRUTH, current);
        final SubLObject truth = (NIL != truth_tail) ? cadr(truth_tail) : $TRUE;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject gather_sentence_mt_pair = $sym23$GATHER_SENTENCE_MT_PAIR;
        return list(DO_LIST, list(gather_sentence_mt_pair, list(GATHER_SKSI_GAF_ARG_INDEX, index_arg, index_argnum, predicate, truth), $DONE, done), listS(CDESTRUCTURING_BIND, list(gather_sentence, gather_mt), gather_sentence_mt_pair, append(body, NIL)));
    }

    /**
     * Like @xref do-sksi-gaf-arg-index, only also considers spec preds and inverses of PREDICATE.
     */
    @LispMethod(comment = "Like @xref do-sksi-gaf-arg-index, only also considers spec preds and inverses of PREDICATE.")
    public static final SubLObject do_sksi_gaf_arg_index_gp_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt21);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject gather_sentence = NIL;
                    SubLObject gather_mt = NIL;
                    SubLObject index_arg = NIL;
                    SubLObject predicate = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt21);
                    gather_sentence = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt21);
                    gather_mt = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt21);
                    index_arg = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt21);
                    predicate = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_5 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt21);
                            current_5 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt21);
                            if (NIL == member(current_5, $list_alt22, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_5 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt21);
                        }
                        {
                            SubLObject index_argnum_tail = property_list_member($INDEX_ARGNUM, current);
                            SubLObject index_argnum = (NIL != index_argnum_tail) ? ((SubLObject) (cadr(index_argnum_tail))) : ONE_INTEGER;
                            SubLObject truth_tail = property_list_member($TRUTH, current);
                            SubLObject truth = (NIL != truth_tail) ? ((SubLObject) (cadr(truth_tail))) : $TRUE;
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject gather_sentence_mt_pair = $sym25$GATHER_SENTENCE_MT_PAIR;
                                return list(WITH_ALL_SPEC_PREDICATES_AND_INVERSES, predicate, list(DO_LIST, list(gather_sentence_mt_pair, list(GATHER_SKSI_GAF_ARG_INDEX, index_arg, index_argnum, predicate, truth), $DONE, done), listS(CDESTRUCTURING_BIND, list(gather_sentence, gather_mt), gather_sentence_mt_pair, append(body, NIL))));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Like @xref do-sksi-gaf-arg-index, only also considers spec preds and inverses of PREDICATE.
     */
    @LispMethod(comment = "Like @xref do-sksi-gaf-arg-index, only also considers spec preds and inverses of PREDICATE.")
    public static SubLObject do_sksi_gaf_arg_index_gp(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list21);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject gather_sentence = NIL;
        SubLObject gather_mt = NIL;
        SubLObject index_arg = NIL;
        SubLObject predicate = NIL;
        destructuring_bind_must_consp(current, datum, $list21);
        gather_sentence = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list21);
        gather_mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list21);
        index_arg = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list21);
        predicate = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$5 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list21);
            current_$5 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list21);
            if (NIL == member(current_$5, $list22, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$5 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list21);
        }
        final SubLObject index_argnum_tail = property_list_member($INDEX_ARGNUM, current);
        final SubLObject index_argnum = (NIL != index_argnum_tail) ? cadr(index_argnum_tail) : ONE_INTEGER;
        final SubLObject truth_tail = property_list_member($TRUTH, current);
        final SubLObject truth = (NIL != truth_tail) ? cadr(truth_tail) : $TRUE;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject gather_sentence_mt_pair = $sym25$GATHER_SENTENCE_MT_PAIR;
        return list(WITH_ALL_SPEC_PREDICATES_AND_INVERSES, predicate, list(DO_LIST, list(gather_sentence_mt_pair, list(GATHER_SKSI_GAF_ARG_INDEX, index_arg, index_argnum, predicate, truth), $DONE, done), listS(CDESTRUCTURING_BIND, list(gather_sentence, gather_mt), gather_sentence_mt_pair, append(body, NIL))));
    }

    /**
     * Like @xref do-sksi-gaf-arg-index-values except that all spec-predicates
     * and spec-inverses of PREDICATE are relevant.
     */
    @LispMethod(comment = "Like @xref do-sksi-gaf-arg-index-values except that all spec-predicates\r\nand spec-inverses of PREDICATE are relevant.\nLike @xref do-sksi-gaf-arg-index-values except that all spec-predicates\nand spec-inverses of PREDICATE are relevant.")
    public static final SubLObject do_sksi_gaf_arg_index_values_gp_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt15);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject gather_arg = NIL;
                    SubLObject gather_mt = NIL;
                    SubLObject index_arg = NIL;
                    SubLObject predicate = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt15);
                    gather_arg = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt15);
                    gather_mt = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt15);
                    index_arg = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt15);
                    predicate = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_6 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt15);
                            current_6 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt15);
                            if (NIL == member(current_6, $list_alt16, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_6 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt15);
                        }
                        {
                            SubLObject gather_argnum_tail = property_list_member($GATHER_ARGNUM, current);
                            SubLObject gather_argnum = (NIL != gather_argnum_tail) ? ((SubLObject) (cadr(gather_argnum_tail))) : TWO_INTEGER;
                            SubLObject index_argnum_tail = property_list_member($INDEX_ARGNUM, current);
                            SubLObject index_argnum = (NIL != index_argnum_tail) ? ((SubLObject) (cadr(index_argnum_tail))) : ONE_INTEGER;
                            SubLObject truth_tail = property_list_member($TRUTH, current);
                            SubLObject truth = (NIL != truth_tail) ? ((SubLObject) (cadr(truth_tail))) : $TRUE;
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject spec_pred = $sym27$SPEC_PRED;
                                SubLObject inverse_modeP = $sym28$INVERSE_MODE_;
                                SubLObject new_gather_argnum = $sym29$NEW_GATHER_ARGNUM;
                                SubLObject new_index_argnum = $sym30$NEW_INDEX_ARGNUM;
                                return list(PROGN, list(DO_ALL_SPEC_PREDICATES_AND_INVERSES, list(spec_pred, inverse_modeP, predicate), list(CLET, list(list(new_gather_argnum, list(FIF, inverse_modeP, index_argnum, gather_argnum)), list(new_index_argnum, list(FIF, inverse_modeP, gather_argnum, index_argnum))), listS(DO_SKSI_GAF_ARG_INDEX_VALUES, list(new SubLObject[]{ gather_arg, gather_mt, index_arg, spec_pred, $GATHER_ARGNUM, new_gather_argnum, $INDEX_ARGNUM, new_index_argnum, $TRUTH, truth, $DONE, done }), append(body, NIL)))));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Like @xref do-sksi-gaf-arg-index-values except that all spec-predicates
     * and spec-inverses of PREDICATE are relevant.
     */
    @LispMethod(comment = "Like @xref do-sksi-gaf-arg-index-values except that all spec-predicates\r\nand spec-inverses of PREDICATE are relevant.\nLike @xref do-sksi-gaf-arg-index-values except that all spec-predicates\nand spec-inverses of PREDICATE are relevant.")
    public static SubLObject do_sksi_gaf_arg_index_values_gp(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list15);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject gather_arg = NIL;
        SubLObject gather_mt = NIL;
        SubLObject index_arg = NIL;
        SubLObject predicate = NIL;
        destructuring_bind_must_consp(current, datum, $list15);
        gather_arg = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list15);
        gather_mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list15);
        index_arg = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list15);
        predicate = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$6 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list15);
            current_$6 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list15);
            if (NIL == member(current_$6, $list16, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$6 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list15);
        }
        final SubLObject gather_argnum_tail = property_list_member($GATHER_ARGNUM, current);
        final SubLObject gather_argnum = (NIL != gather_argnum_tail) ? cadr(gather_argnum_tail) : TWO_INTEGER;
        final SubLObject index_argnum_tail = property_list_member($INDEX_ARGNUM, current);
        final SubLObject index_argnum = (NIL != index_argnum_tail) ? cadr(index_argnum_tail) : ONE_INTEGER;
        final SubLObject truth_tail = property_list_member($TRUTH, current);
        final SubLObject truth = (NIL != truth_tail) ? cadr(truth_tail) : $TRUE;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject spec_pred = $sym27$SPEC_PRED;
        final SubLObject inverse_modeP = $sym28$INVERSE_MODE_;
        final SubLObject new_gather_argnum = $sym29$NEW_GATHER_ARGNUM;
        final SubLObject new_index_argnum = $sym30$NEW_INDEX_ARGNUM;
        return list(PROGN, list(DO_ALL_SPEC_PREDICATES_AND_INVERSES, list(spec_pred, inverse_modeP, predicate), list(CLET, list(list(new_gather_argnum, list(FIF, inverse_modeP, index_argnum, gather_argnum)), list(new_index_argnum, list(FIF, inverse_modeP, gather_argnum, index_argnum))), listS(DO_SKSI_GAF_ARG_INDEX_VALUES, list(new SubLObject[]{ gather_arg, gather_mt, index_arg, spec_pred, $GATHER_ARGNUM, new_gather_argnum, $INDEX_ARGNUM, new_index_argnum, $TRUTH, truth, $DONE, done }), append(body, NIL)))));
    }

    /**
     * Like @xref do-sksi-gaf-arg-index-values except that predicate relevance is established from outside.
     */
    @LispMethod(comment = "Like @xref do-sksi-gaf-arg-index-values except that predicate relevance is established from outside.")
    public static final SubLObject do_sksi_gaf_arg_index_values_relevant_pred_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt35);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject gather_arg = NIL;
                    SubLObject gather_mt = NIL;
                    SubLObject gather_pred = NIL;
                    SubLObject index_arg = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt35);
                    gather_arg = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt35);
                    gather_mt = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt35);
                    gather_pred = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt35);
                    index_arg = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_7 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt35);
                            current_7 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt35);
                            if (NIL == member(current_7, $list_alt16, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_7 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt35);
                        }
                        {
                            SubLObject gather_argnum_tail = property_list_member($GATHER_ARGNUM, current);
                            SubLObject gather_argnum = (NIL != gather_argnum_tail) ? ((SubLObject) (cadr(gather_argnum_tail))) : TWO_INTEGER;
                            SubLObject index_argnum_tail = property_list_member($INDEX_ARGNUM, current);
                            SubLObject index_argnum = (NIL != index_argnum_tail) ? ((SubLObject) (cadr(index_argnum_tail))) : ONE_INTEGER;
                            SubLObject truth_tail = property_list_member($TRUTH, current);
                            SubLObject truth = (NIL != truth_tail) ? ((SubLObject) (cadr(truth_tail))) : $TRUE;
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject gather_arg_mt_pred_tuple = $sym36$GATHER_ARG_MT_PRED_TUPLE;
                                return list(DO_LIST, list(gather_arg_mt_pred_tuple, list(GATHER_SKSI_GAF_ARG_INDEX_VALUES_RELEVANT_PRED, index_arg, index_argnum, gather_argnum, truth), $DONE, done), listS(CDESTRUCTURING_BIND, list(gather_arg, gather_mt, gather_pred), gather_arg_mt_pred_tuple, append(body, NIL)));
                            }
                        }
                    }
                }
            }
        }
    }

    @LispMethod(comment = "Like @xref do-sksi-gaf-arg-index-values except that predicate relevance is established from outside.")
    public static SubLObject do_sksi_gaf_arg_index_values_relevant_pred(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list35);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject gather_arg = NIL;
        SubLObject gather_mt = NIL;
        SubLObject gather_pred = NIL;
        SubLObject index_arg = NIL;
        destructuring_bind_must_consp(current, datum, $list35);
        gather_arg = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list35);
        gather_mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list35);
        gather_pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list35);
        index_arg = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$7 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list35);
            current_$7 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list35);
            if (NIL == member(current_$7, $list16, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$7 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list35);
        }
        final SubLObject gather_argnum_tail = property_list_member($GATHER_ARGNUM, current);
        final SubLObject gather_argnum = (NIL != gather_argnum_tail) ? cadr(gather_argnum_tail) : TWO_INTEGER;
        final SubLObject index_argnum_tail = property_list_member($INDEX_ARGNUM, current);
        final SubLObject index_argnum = (NIL != index_argnum_tail) ? cadr(index_argnum_tail) : ONE_INTEGER;
        final SubLObject truth_tail = property_list_member($TRUTH, current);
        final SubLObject truth = (NIL != truth_tail) ? cadr(truth_tail) : $TRUE;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject gather_arg_mt_pred_tuple = $sym36$GATHER_ARG_MT_PRED_TUPLE;
        return list(DO_LIST, list(gather_arg_mt_pred_tuple, list(GATHER_SKSI_GAF_ARG_INDEX_VALUES_RELEVANT_PRED, index_arg, index_argnum, gather_argnum, truth), $DONE, done), listS(CDESTRUCTURING_BIND, list(gather_arg, gather_mt, gather_pred), gather_arg_mt_pred_tuple, append(body, NIL)));
    }

    /**
     * Like @xref do-sksi-gaf-arg-index-values-relevant-pred except that iteration is over GAF formulas.
     */
    @LispMethod(comment = "Like @xref do-sksi-gaf-arg-index-values-relevant-pred except that iteration is over GAF formulas.")
    public static final SubLObject do_sksi_gaf_arg_index_relevant_pred_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt38);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject gather_sentence = NIL;
                    SubLObject gather_mt = NIL;
                    SubLObject index_arg = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt38);
                    gather_sentence = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt38);
                    gather_mt = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt38);
                    index_arg = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_8 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt38);
                            current_8 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt38);
                            if (NIL == member(current_8, $list_alt22, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_8 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt38);
                        }
                        {
                            SubLObject index_argnum_tail = property_list_member($INDEX_ARGNUM, current);
                            SubLObject index_argnum = (NIL != index_argnum_tail) ? ((SubLObject) (cadr(index_argnum_tail))) : ONE_INTEGER;
                            SubLObject truth_tail = property_list_member($TRUTH, current);
                            SubLObject truth = (NIL != truth_tail) ? ((SubLObject) (cadr(truth_tail))) : $TRUE;
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject gather_sentence_mt_pair = $sym39$GATHER_SENTENCE_MT_PAIR;
                                return list(DO_LIST, list(gather_sentence_mt_pair, list(GATHER_SKSI_GAF_ARG_INDEX_RELEVANT_PRED, index_arg, index_argnum, truth), $DONE, done), listS(CDESTRUCTURING_BIND, list(gather_sentence, gather_mt), gather_sentence_mt_pair, append(body, NIL)));
                            }
                        }
                    }
                }
            }
        }
    }

    @LispMethod(comment = "Like @xref do-sksi-gaf-arg-index-values-relevant-pred except that iteration is over GAF formulas.")
    public static SubLObject do_sksi_gaf_arg_index_relevant_pred(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list38);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject gather_sentence = NIL;
        SubLObject gather_mt = NIL;
        SubLObject index_arg = NIL;
        destructuring_bind_must_consp(current, datum, $list38);
        gather_sentence = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list38);
        gather_mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list38);
        index_arg = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$8 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list38);
            current_$8 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list38);
            if (NIL == member(current_$8, $list22, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$8 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list38);
        }
        final SubLObject index_argnum_tail = property_list_member($INDEX_ARGNUM, current);
        final SubLObject index_argnum = (NIL != index_argnum_tail) ? cadr(index_argnum_tail) : ONE_INTEGER;
        final SubLObject truth_tail = property_list_member($TRUTH, current);
        final SubLObject truth = (NIL != truth_tail) ? cadr(truth_tail) : $TRUE;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject gather_sentence_mt_pair = $sym39$GATHER_SENTENCE_MT_PAIR;
        return list(DO_LIST, list(gather_sentence_mt_pair, list(GATHER_SKSI_GAF_ARG_INDEX_RELEVANT_PRED, index_arg, index_argnum, truth), $DONE, done), listS(CDESTRUCTURING_BIND, list(gather_sentence, gather_mt), gather_sentence_mt_pair, append(body, NIL)));
    }/**
     * Like @xref do-sksi-gaf-arg-index-values-relevant-pred except that iteration is over GAF formulas.
     */


    public static SubLObject declare_sksi_sks_mapping_macros_file() {
        declareMacro("do_sksi_gaf_lookup_index", "DO-SKSI-GAF-LOOKUP-INDEX");
        declareMacro("do_sksi_predicate_extent_index", "DO-SKSI-PREDICATE-EXTENT-INDEX");
        declareMacro("do_sksi_gaf_arg_index_values", "DO-SKSI-GAF-ARG-INDEX-VALUES");
        declareMacro("do_sksi_gaf_arg_index", "DO-SKSI-GAF-ARG-INDEX");
        declareMacro("do_sksi_gaf_arg_index_gp", "DO-SKSI-GAF-ARG-INDEX-GP");
        declareMacro("do_sksi_gaf_arg_index_values_gp", "DO-SKSI-GAF-ARG-INDEX-VALUES-GP");
        declareMacro("do_sksi_gaf_arg_index_values_relevant_pred", "DO-SKSI-GAF-ARG-INDEX-VALUES-RELEVANT-PRED");
        declareMacro("do_sksi_gaf_arg_index_relevant_pred", "DO-SKSI-GAF-ARG-INDEX-RELEVANT-PRED");
        return NIL;
    }

    public static SubLObject init_sksi_sks_mapping_macros_file() {
        return NIL;
    }

    public static SubLObject setup_sksi_sks_mapping_macros_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sksi_sks_mapping_macros_file();
    }

    @Override
    public void initializeVariables() {
        init_sksi_sks_mapping_macros_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sksi_sks_mapping_macros_file();
    }

    static {
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(list(makeSymbol("SUPPORT-VAR"), makeSymbol("ASENT"), makeSymbol("SENSE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt1 = list($DONE);

    static private final SubLList $list_alt8 = list(list(makeSymbol("GATHER-SENTENCE"), makeSymbol("GATHER-MT"), makeSymbol("PREDICATE"), makeSymbol("&KEY"), list(makeSymbol("TRUTH"), $TRUE), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt9 = list(makeKeyword("TRUTH"), $DONE);

    static private final SubLList $list_alt15 = list(list(new SubLObject[]{ makeSymbol("GATHER-ARG"), makeSymbol("GATHER-MT"), makeSymbol("INDEX-ARG"), makeSymbol("PREDICATE"), makeSymbol("&KEY"), list(makeSymbol("GATHER-ARGNUM"), TWO_INTEGER), list(makeSymbol("INDEX-ARGNUM"), ONE_INTEGER), list(makeSymbol("TRUTH"), $TRUE), makeSymbol("DONE") }), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt16 = list(makeKeyword("GATHER-ARGNUM"), makeKeyword("INDEX-ARGNUM"), makeKeyword("TRUTH"), $DONE);

    static private final SubLList $list_alt21 = list(list(makeSymbol("GATHER-SENTENCE"), makeSymbol("GATHER-MT"), makeSymbol("INDEX-ARG"), makeSymbol("PREDICATE"), makeSymbol("&KEY"), list(makeSymbol("INDEX-ARGNUM"), ONE_INTEGER), list(makeSymbol("TRUTH"), $TRUE), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt22 = list(makeKeyword("INDEX-ARGNUM"), makeKeyword("TRUTH"), $DONE);

    static private final SubLList $list_alt35 = list(list(new SubLObject[]{ makeSymbol("GATHER-ARG"), makeSymbol("GATHER-MT"), makeSymbol("GATHER-PRED"), makeSymbol("INDEX-ARG"), makeSymbol("&KEY"), list(makeSymbol("GATHER-ARGNUM"), TWO_INTEGER), list(makeSymbol("INDEX-ARGNUM"), ONE_INTEGER), list(makeSymbol("TRUTH"), $TRUE), makeSymbol("DONE") }), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt38 = list(list(makeSymbol("GATHER-SENTENCE"), makeSymbol("GATHER-MT"), makeSymbol("INDEX-ARG"), makeSymbol("&KEY"), list(makeSymbol("INDEX-ARGNUM"), ONE_INTEGER), list(makeSymbol("TRUTH"), $TRUE), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
}

/**
 * Total time: 125 ms
 */
