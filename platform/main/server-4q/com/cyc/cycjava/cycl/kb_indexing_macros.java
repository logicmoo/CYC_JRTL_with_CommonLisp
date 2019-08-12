/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class kb_indexing_macros extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new kb_indexing_macros();

 public static final String myName = "com.cyc.cycjava.cycl.kb_indexing_macros";


    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(makeSymbol("RESULT"), makeSymbol("INDEX"), makeSymbol("TERM"), makeSymbol("&REST"), makeSymbol("KEYS"));

    private static final SubLSymbol $SIMPLE_MATCH_FUNCTION = makeKeyword("SIMPLE-MATCH-FUNCTION");

    private static final SubLSymbol $GET_SUBINDEX_FUNCTION = makeKeyword("GET-SUBINDEX-FUNCTION");

    static private final SubLSymbol $sym3$COUNT = makeUninternedSymbol("COUNT");

    static private final SubLSymbol $sym4$ASS = makeUninternedSymbol("ASS");

    private static final SubLSymbol SIMPLE_INDEXED_TERM_P = makeSymbol("SIMPLE-INDEXED-TERM-P");

    static private final SubLList $list8 = list(ZERO_INTEGER);

    private static final SubLSymbol DO_SIMPLE_INDEX = makeSymbol("DO-SIMPLE-INDEX");

    static private final SubLList $list14 = list(list(makeSymbol("FIF"), makeSymbol("SUBINDEX"), list(makeSymbol("SUBINDEX-LEAF-COUNT"), makeSymbol("SUBINDEX")), ZERO_INTEGER));

    private static final SubLSymbol SET_RELEVANT_SIMPLE_INDEX_COUNT = makeSymbol("SET-RELEVANT-SIMPLE-INDEX-COUNT");

    private static final SubLSymbol SET_RELEVANT_NUM_ARBITRARY_INDEX = makeSymbol("SET-RELEVANT-NUM-ARBITRARY-INDEX");

    static private final SubLList $list17 = list(makeSymbol("COUNT-VAR"), list(makeSymbol("FUNCTION"), makeSymbol("TERM"), makeSymbol("&REST"), makeSymbol("ARGS")));

    private static final SubLSymbol ASS = makeSymbol("ASS");

    static private final SubLList $list19 = list(makeSymbol("RELEVANT-MT?"), list(makeSymbol("ASSERTION-MT"), makeSymbol("ASS")));

    private static final SubLSymbol SET_RELEVANT_COMPLEX_INDEX_COUNT = makeSymbol("SET-RELEVANT-COMPLEX-INDEX-COUNT");

    private static final SubLSymbol $RELEVANT_NUM_FUNCTION = makeKeyword("RELEVANT-NUM-FUNCTION");

    static private final SubLString $str23$SET_RELEVANT_COMPLEX_INDEX_COUNT_ = makeString("SET-RELEVANT-COMPLEX-INDEX-COUNT called on an index (~s) without an mt layer");

    static private final SubLString $str24$SET_RELEVANT_COMPLEX_INDEX_COUNT_ = makeString("SET-RELEVANT-COMPLEX-INDEX-COUNT called with too many arguments");

    static private final SubLSymbol $sym25$GOOD_KEY_COUNT = makeUninternedSymbol("GOOD-KEY-COUNT");

    static private final SubLSymbol $sym26$GOOD_KEYS = makeUninternedSymbol("GOOD-KEYS");

    static private final SubLSymbol $sym27$MT_SUBINDEX = makeUninternedSymbol("MT-SUBINDEX");

    static private final SubLSymbol $sym28$NEXT_LEVEL_KEYS = makeUninternedSymbol("NEXT-LEVEL-KEYS");

    static private final SubLSymbol $sym29$NEXT_KEY = makeUninternedSymbol("NEXT-KEY");

    private static final SubLSymbol NUMBER_OF_NON_NULL_ARGS_IN_ORDER = makeSymbol("NUMBER-OF-NON-NULL-ARGS-IN-ORDER");

    static private final SubLSymbol $sym31$_ = makeSymbol("=");

    static private final SubLSymbol $sym32$_ = makeSymbol("-");

    static private final SubLList $list33 = list(ONE_INTEGER);

    private static final SubLSymbol RELEVANT_MT_SUBINDEX_COUNT = makeSymbol("RELEVANT-MT-SUBINDEX-COUNT");

    private static final SubLSymbol LIST_OF_FIRST_N_ARGS = makeSymbol("LIST-OF-FIRST-N-ARGS");

    static private final SubLList $list42 = list(makeSymbol("ALL-MT-SUBINDEX-KEYS-RELEVANT-P"));

    private static final SubLSymbol SET_RELEVANT_SIMPLE_INDEX_COUNT_WITH_CUTOFF = makeSymbol("SET-RELEVANT-SIMPLE-INDEX-COUNT-WITH-CUTOFF");

    static private final SubLList $list44 = list(makeSymbol("COUNT-VAR"), makeSymbol("CUTOFF"), list(makeSymbol("FUNCTION"), makeSymbol("TERM"), makeSymbol("&REST"), makeSymbol("ARGS")));

    static private final SubLSymbol $sym46$NUMBER_HAS_REACHED_CUTOFF_ = makeSymbol("NUMBER-HAS-REACHED-CUTOFF?");

    private static final SubLSymbol SET_RELEVANT_COMPLEX_INDEX_COUNT_WITH_CUTOFF = makeSymbol("SET-RELEVANT-COMPLEX-INDEX-COUNT-WITH-CUTOFF");

    static private final SubLList $list48 = list(makeSymbol("RESULT"), makeSymbol("CUTOFF"), makeSymbol("INDEX"), makeSymbol("TERM"), makeSymbol("&REST"), makeSymbol("KEYS"));

    private static final SubLSymbol $RELEVANT_NUM_FUNCTION_WITH_CUTOFF = makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF");

    static private final SubLString $str50$SET_RELEVANT_COMPLEX_INDEX_COUNT_ = makeString("SET-RELEVANT-COMPLEX-INDEX-COUNT-WITH-CUTOFF called on an index (~s) without an mt layer");

    static private final SubLString $str51$SET_RELEVANT_COMPLEX_INDEX_COUNT_ = makeString("SET-RELEVANT-COMPLEX-INDEX-COUNT-WITH-CUTOFF called with too many arguments");

    static private final SubLSymbol $sym52$GOOD_KEY_COUNT = makeUninternedSymbol("GOOD-KEY-COUNT");

    static private final SubLSymbol $sym53$GOOD_KEYS = makeUninternedSymbol("GOOD-KEYS");

    static private final SubLSymbol $sym54$MT_SUBINDEX = makeUninternedSymbol("MT-SUBINDEX");

    static private final SubLSymbol $sym55$NEXT_LEVEL_KEYS = makeUninternedSymbol("NEXT-LEVEL-KEYS");

    static private final SubLSymbol $sym56$NEXT_KEY = makeUninternedSymbol("NEXT-KEY");

    private static final SubLSymbol RELEVANT_MT_SUBINDEX_COUNT_WITH_CUTOFF = makeSymbol("RELEVANT-MT-SUBINDEX-COUNT-WITH-CUTOFF");

    private static final SubLSymbol $SIMPLE_KEY_FUNCTION = makeKeyword("SIMPLE-KEY-FUNCTION");

    static private final SubLSymbol $sym60$KEYS_ACCUM = makeUninternedSymbol("KEYS-ACCUM");

    static private final SubLSymbol $sym61$ASS = makeUninternedSymbol("ASS");

    static private final SubLList $list62 = list(NIL);

    private static final SubLSymbol NEXT_LEVEL_SUBINDEX = makeSymbol("NEXT-LEVEL-SUBINDEX");

    static private final SubLList $list64 = list(list(makeSymbol("FWHEN"), list(makeSymbol("INTERMEDIATE-INDEX-P"), makeSymbol("NEXT-LEVEL-SUBINDEX")), list(makeSymbol("INTERMEDIATE-INDEX-KEYS"), makeSymbol("NEXT-LEVEL-SUBINDEX"))));

    private static final SubLSymbol SET_RELEVANT_KEY_SIMPLE_INDEX = makeSymbol("SET-RELEVANT-KEY-SIMPLE-INDEX");

    private static final SubLSymbol SET_RELEVANT_KEY_ARBITRARY_INDEX = makeSymbol("SET-RELEVANT-KEY-ARBITRARY-INDEX");

    static private final SubLSymbol $sym67$KEYS_ACCUM = makeUninternedSymbol("KEYS-ACCUM");

    static private final SubLSymbol $sym68$ASS = makeUninternedSymbol("ASS");

    static private final SubLSymbol $sym69$RELEVANT_MT_ = makeSymbol("RELEVANT-MT?");

    private static final SubLSymbol SET_RELEVANT_KEY_COMPLEX_INDEX = makeSymbol("SET-RELEVANT-KEY-COMPLEX-INDEX");

    static private final SubLSymbol $sym72$GOOD_KEY_COUNT = makeUninternedSymbol("GOOD-KEY-COUNT");

    static private final SubLSymbol $sym73$GOOD_KEYS = makeUninternedSymbol("GOOD-KEYS");

    static private final SubLSymbol $sym74$MT_SUBINDEX = makeUninternedSymbol("MT-SUBINDEX");

    static private final SubLSymbol $sym75$NEXT_LEVEL_KEYS = makeUninternedSymbol("NEXT-LEVEL-KEYS");

    static private final SubLSymbol $sym76$NEXT_KEY = makeUninternedSymbol("NEXT-KEY");

    private static final SubLSymbol RELEVANT_MT_SUBINDEX_KEYS = makeSymbol("RELEVANT-MT-SUBINDEX-KEYS");

    private static final SubLSymbol MT_KEY_LEVEL = makeSymbol("MT-KEY-LEVEL");

    static private final SubLList $list83 = list(list(makeSymbol("ARGNUM"), makeSymbol("SUBINDEX"), makeSymbol("TERM"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list84 = list($DONE);

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol DO_INTERMEDIATE_INDEX = makeSymbol("DO-INTERMEDIATE-INDEX");

    private static final SubLSymbol TERM_GAF_ARG_INDEX = makeSymbol("TERM-GAF-ARG-INDEX");

    static private final SubLSymbol $sym89$VALID_GAF_ARG_INDEX_KEY_ = makeSymbol("VALID-GAF-ARG-INDEX-KEY?");

    static private final SubLList $list90 = list(list(makeSymbol("ARGNUM"), makeSymbol("TERM"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym91$SUBINDEX = makeUninternedSymbol("SUBINDEX");

    private static final SubLSymbol DO_GAF_ARG_INDICES = makeSymbol("DO-GAF-ARG-INDICES");

    private static final SubLSymbol TERM_NART_ARG_INDEX = makeSymbol("TERM-NART-ARG-INDEX");

    static private final SubLSymbol $sym96$VALID_NART_ARG_INDEX_KEY_ = makeSymbol("VALID-NART-ARG-INDEX-KEY?");

    static private final SubLSymbol $sym97$SUBINDEX = makeUninternedSymbol("SUBINDEX");

    private static final SubLSymbol DO_NART_ARG_INDICES = makeSymbol("DO-NART-ARG-INDICES");

    static private final SubLList $list100 = list(list(makeSymbol("SENSE"), makeSymbol("SUBINDEX"), makeSymbol("PRED"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol TERM_PREDICATE_RULE_INDEX = makeSymbol("TERM-PREDICATE-RULE-INDEX");

    static private final SubLSymbol $sym102$VALID_PREDICATE_RULE_INDEX_KEY_ = makeSymbol("VALID-PREDICATE-RULE-INDEX-KEY?");

    static private final SubLList $list103 = list(list(makeSymbol("SENSE"), makeSymbol("PRED"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym104$SUBINDEX = makeUninternedSymbol("SUBINDEX");

    private static final SubLSymbol DO_PREDICATE_RULE_INDICES = makeSymbol("DO-PREDICATE-RULE-INDICES");

    private static final SubLSymbol TERM_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX = makeSymbol("TERM-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX");

    static private final SubLSymbol $sym108$SUBINDEX = makeUninternedSymbol("SUBINDEX");

    private static final SubLSymbol DO_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDICES = makeSymbol("DO-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDICES");

    private static final SubLSymbol $DECONTEXTUALIZED_IST_PREDICATE_RULE = makeKeyword("DECONTEXTUALIZED-IST-PREDICATE-RULE");

    static private final SubLSymbol $sym111$VALID_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX_KEY_ = makeSymbol("VALID-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX-KEY?");

    static private final SubLList $list112 = list(list(makeSymbol("SENSE"), makeSymbol("SUBINDEX"), makeSymbol("COL"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol TERM_ISA_RULE_INDEX = makeSymbol("TERM-ISA-RULE-INDEX");

    static private final SubLSymbol $sym114$VALID_ISA_RULE_INDEX_KEY_ = makeSymbol("VALID-ISA-RULE-INDEX-KEY?");

    static private final SubLList $list115 = list(list(makeSymbol("SENSE"), makeSymbol("COL"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym116$SUBINDEX = makeUninternedSymbol("SUBINDEX");

    private static final SubLSymbol DO_ISA_RULE_INDICES = makeSymbol("DO-ISA-RULE-INDICES");

    private static final SubLSymbol TERM_GENLS_RULE_INDEX = makeSymbol("TERM-GENLS-RULE-INDEX");

    static private final SubLSymbol $sym120$VALID_GENLS_RULE_INDEX_KEY_ = makeSymbol("VALID-GENLS-RULE-INDEX-KEY?");

    static private final SubLSymbol $sym121$SUBINDEX = makeUninternedSymbol("SUBINDEX");

    private static final SubLSymbol DO_GENLS_RULE_INDICES = makeSymbol("DO-GENLS-RULE-INDICES");

    private static final SubLSymbol TERM_GENL_MT_RULE_INDEX = makeSymbol("TERM-GENL-MT-RULE-INDEX");

    static private final SubLSymbol $sym125$VALID_GENL_MT_RULE_INDEX_KEY_ = makeSymbol("VALID-GENL-MT-RULE-INDEX-KEY?");

    static private final SubLSymbol $sym126$SUBINDEX = makeUninternedSymbol("SUBINDEX");

    private static final SubLSymbol DO_GENL_MT_RULE_INDICES = makeSymbol("DO-GENL-MT-RULE-INDICES");

    private static final SubLSymbol $GENL_MT_RULE = makeKeyword("GENL-MT-RULE");

    // Definitions
    /**
     * Generates code which will set RESULT to the number of leaves under INDEX with the given key sequence.
     */
    @LispMethod(comment = "Generates code which will set RESULT to the number of leaves under INDEX with the given key sequence.")
    public static final SubLObject set_num_arbitrary_index_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject result = NIL;
            SubLObject index = NIL;
            SubLObject v_term = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            result = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            index = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            v_term = current.first();
            current = current.rest();
            {
                SubLObject keys = current;
                SubLObject simple_match_function = kb_indexing_declarations.get_index_prop(index, $SIMPLE_MATCH_FUNCTION);
                SubLObject get_subindex_function = kb_indexing_declarations.get_index_prop(index, $GET_SUBINDEX_FUNCTION);
                SubLObject count = $sym3$COUNT;
                SubLObject ass = $sym4$ASS;
                return list(PIF, list(SIMPLE_INDEXED_TERM_P, v_term), list(CLET, list(bq_cons(count, $list_alt8)), list(DO_SIMPLE_INDEX, list(ass, v_term), list(PWHEN, listS(simple_match_function, ass, v_term, append(keys, NIL)), list(CINC, count))), list(CSETQ, result, count)), list(CLET, list(list(SUBINDEX, listS(get_subindex_function, v_term, append(keys, NIL)))), listS(CSETQ, result, $list_alt14)));
            }
        }
    }

    // Definitions
    /**
     * Generates code which will set RESULT to the number of leaves under INDEX with the given key sequence.
     */
    @LispMethod(comment = "Generates code which will set RESULT to the number of leaves under INDEX with the given key sequence.")
    public static SubLObject set_num_arbitrary_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject result = NIL;
        SubLObject index = NIL;
        SubLObject v_term = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        result = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        index = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        v_term = current.first();
        final SubLObject keys;
        current = keys = current.rest();
        final SubLObject simple_match_function = kb_indexing_declarations.get_index_prop(index, $SIMPLE_MATCH_FUNCTION);
        final SubLObject get_subindex_function = kb_indexing_declarations.get_index_prop(index, $GET_SUBINDEX_FUNCTION);
        final SubLObject count = $sym3$COUNT;
        final SubLObject ass = $sym4$ASS;
        return list(PIF, list(SIMPLE_INDEXED_TERM_P, v_term), list(CLET, list(bq_cons(count, $list8)), list(DO_SIMPLE_INDEX, list(ass, v_term), list(PWHEN, listS(simple_match_function, ass, v_term, append(keys, NIL)), list(CINC, count))), list(CSETQ, result, count)), list(CLET, list(list(SUBINDEX, listS(get_subindex_function, v_term, append(keys, NIL)))), listS(CSETQ, result, $list14)));
    }

    /**
     *
     *
     * @param COUNT-VAR,
     * 		a variable which should be set to zero
     * @param TERM;
     * 		the term to count the simple index for
     * @param FUNCTION;
     * 		a SubL function to call on the arglist (assertion, TERM, then the remaining arguments)
     */
    @LispMethod(comment = "@param COUNT-VAR,\r\n\t\ta variable which should be set to zero\r\n@param TERM;\r\n\t\tthe term to count the simple index for\r\n@param FUNCTION;\r\n\t\ta SubL function to call on the arglist (assertion, TERM, then the remaining arguments)")
    public static final SubLObject set_relevant_simple_index_count_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject count_var = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt17);
            count_var = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt17);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject function = NIL;
                    SubLObject v_term = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt17);
                    function = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt17);
                    v_term = current.first();
                    current = current.rest();
                    {
                        SubLObject args = current;
                        current = temp;
                        if (NIL == current) {
                            return list(DO_SIMPLE_INDEX, list(ASS, v_term), list(PWHEN, listS(function, ASS, v_term, append(args, NIL)), list(PWHEN, $list_alt19, list(CINC, count_var))));
                        } else {
                            cdestructuring_bind_error(datum, $list_alt17);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param COUNT-VAR,
     * 		a variable which should be set to zero
     * @param TERM;
     * 		the term to count the simple index for
     * @param FUNCTION;
     * 		a SubL function to call on the arglist (assertion, TERM, then the remaining arguments)
     */
    @LispMethod(comment = "@param COUNT-VAR,\r\n\t\ta variable which should be set to zero\r\n@param TERM;\r\n\t\tthe term to count the simple index for\r\n@param FUNCTION;\r\n\t\ta SubL function to call on the arglist (assertion, TERM, then the remaining arguments)")
    public static SubLObject set_relevant_simple_index_count(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject count_var = NIL;
        destructuring_bind_must_consp(current, datum, $list17);
        count_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list17);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject function = NIL;
        SubLObject v_term = NIL;
        destructuring_bind_must_consp(current, datum, $list17);
        function = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list17);
        v_term = current.first();
        final SubLObject args;
        current = args = current.rest();
        current = temp;
        if (NIL == current) {
            return list(DO_SIMPLE_INDEX, list(ASS, v_term), list(PWHEN, listS(function, ASS, v_term, append(args, NIL)), list(PWHEN, $list19, list(CINC, count_var))));
        }
        cdestructuring_bind_error(datum, $list17);
        return NIL;
    }

    /**
     * Generates code which will set RESULT to the number of leaves under INDEX with the given key sequence,
     * which are also mt-relevant.
     */
    @LispMethod(comment = "Generates code which will set RESULT to the number of leaves under INDEX with the given key sequence,\r\nwhich are also mt-relevant.\nGenerates code which will set RESULT to the number of leaves under INDEX with the given key sequence,\nwhich are also mt-relevant.")
    public static final SubLObject set_relevant_complex_index_count_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject result = NIL;
            SubLObject index = NIL;
            SubLObject v_term = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            result = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            index = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            v_term = current.first();
            current = current.rest();
            {
                SubLObject keys = current;
                SubLObject get_subindex_function = kb_indexing_declarations.get_index_prop(index, $GET_SUBINDEX_FUNCTION);
                SubLObject key_function = kb_indexing_declarations.get_index_prop(index, $KEY_FUNCTION);
                SubLObject relevant_num_function = kb_indexing_declarations.get_index_prop(index, $RELEVANT_NUM_FUNCTION);
                SubLObject mt_key_level = com.cyc.cycjava.cycl.kb_indexing_macros.mt_key_level(index);
                if (!mt_key_level.isInteger()) {
                    Errors.error($str_alt23$SET_RELEVANT_COMPLEX_INDEX_COUNT_, index);
                }
                if (com.cyc.cycjava.cycl.kb_indexing_macros.number_of_non_null_args_in_order(keys, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED).numGE(mt_key_level)) {
                    Errors.error($str_alt24$SET_RELEVANT_COMPLEX_INDEX_COUNT_);
                }
                {
                    SubLObject good_key_count = $sym25$GOOD_KEY_COUNT;
                    SubLObject good_keys = $sym26$GOOD_KEYS;
                    SubLObject mt_subindex = $sym27$MT_SUBINDEX;
                    SubLObject next_level_keys = $sym28$NEXT_LEVEL_KEYS;
                    SubLObject next_key = $sym29$NEXT_KEY;
                    return list(CLET, list(list(good_key_count, bq_cons(NUMBER_OF_NON_NULL_ARGS_IN_ORDER, append(keys, NIL)))), list(PIF, list($sym31$_, good_key_count, listS($sym32$_, mt_key_level, $list_alt33)), list(CLET, list(list(mt_subindex, listS(get_subindex_function, v_term, append(keys, NIL)))), list(PWHEN, mt_subindex, list(CSETQ, result, list(RELEVANT_MT_SUBINDEX_COUNT, mt_subindex)))), list(CLET, list(list(good_keys, listS(LIST_OF_FIRST_N_ARGS, good_key_count, append(keys, NIL))), list(next_level_keys, list(APPLY, list(QUOTE, key_function), v_term, good_keys))), list(CDOLIST, list(next_key, next_level_keys), list(CINC, result, list(APPLY, list(QUOTE, relevant_num_function), v_term, list(APPEND, good_keys, list(LIST, next_key))))))));
                }
            }
        }
    }

    /**
     * Generates code which will set RESULT to the number of leaves under INDEX with the given key sequence,
     * which are also mt-relevant.
     */
    @LispMethod(comment = "Generates code which will set RESULT to the number of leaves under INDEX with the given key sequence,\r\nwhich are also mt-relevant.\nGenerates code which will set RESULT to the number of leaves under INDEX with the given key sequence,\nwhich are also mt-relevant.")
    public static SubLObject set_relevant_complex_index_count(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject result = NIL;
        SubLObject index = NIL;
        SubLObject v_term = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        result = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        index = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        v_term = current.first();
        final SubLObject keys;
        current = keys = current.rest();
        final SubLObject get_subindex_function = kb_indexing_declarations.get_index_prop(index, $GET_SUBINDEX_FUNCTION);
        final SubLObject key_function = kb_indexing_declarations.get_index_prop(index, $KEY_FUNCTION);
        final SubLObject relevant_num_function = kb_indexing_declarations.get_index_prop(index, $RELEVANT_NUM_FUNCTION);
        final SubLObject mt_key_level = mt_key_level(index);
        if (!mt_key_level.isInteger()) {
            Errors.error($str23$SET_RELEVANT_COMPLEX_INDEX_COUNT_, index);
        }
        if (number_of_non_null_args_in_order(keys, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED).numGE(mt_key_level)) {
            Errors.error($str24$SET_RELEVANT_COMPLEX_INDEX_COUNT_);
        }
        final SubLObject good_key_count = $sym25$GOOD_KEY_COUNT;
        final SubLObject good_keys = $sym26$GOOD_KEYS;
        final SubLObject mt_subindex = $sym27$MT_SUBINDEX;
        final SubLObject next_level_keys = $sym28$NEXT_LEVEL_KEYS;
        final SubLObject next_key = $sym29$NEXT_KEY;
        return list(CLET, list(list(good_key_count, bq_cons(NUMBER_OF_NON_NULL_ARGS_IN_ORDER, append(keys, NIL)))), list(PIF, list($sym31$_, good_key_count, listS($sym32$_, mt_key_level, $list33)), list(CLET, list(list(mt_subindex, listS(get_subindex_function, v_term, append(keys, NIL)))), list(PWHEN, mt_subindex, list(CSETQ, result, list(RELEVANT_MT_SUBINDEX_COUNT, mt_subindex)))), list(CLET, list(list(good_keys, listS(LIST_OF_FIRST_N_ARGS, good_key_count, append(keys, NIL))), list(next_level_keys, list(APPLY, list(QUOTE, key_function), v_term, good_keys))), list(CDOLIST, list(next_key, next_level_keys), list(CINC, result, list(APPLY, list(QUOTE, relevant_num_function), v_term, list(APPEND, good_keys, list(LIST, next_key))))))));
    }

    public static final SubLObject set_relevant_num_arbitrary_index_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject result = NIL;
            SubLObject index = NIL;
            SubLObject v_term = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            result = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            index = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            v_term = current.first();
            current = current.rest();
            {
                SubLObject keys = current;
                SubLObject simple_match_function = kb_indexing_declarations.get_index_prop(index, $SIMPLE_MATCH_FUNCTION);
                SubLObject num_function = kb_indexing_declarations.get_index_prop(index, $NUM_FUNCTION);
                return list(PIF, $list_alt42, list(CSETQ, result, listS(num_function, v_term, append(keys, NIL))), list(PIF, list(SIMPLE_INDEXED_TERM_P, v_term), list(SET_RELEVANT_SIMPLE_INDEX_COUNT, result, listS(simple_match_function, v_term, append(keys, NIL))), listS(SET_RELEVANT_COMPLEX_INDEX_COUNT, result, index, v_term, append(keys, NIL))));
            }
        }
    }

    public static SubLObject set_relevant_num_arbitrary_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject result = NIL;
        SubLObject index = NIL;
        SubLObject v_term = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        result = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        index = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        v_term = current.first();
        final SubLObject keys;
        current = keys = current.rest();
        final SubLObject simple_match_function = kb_indexing_declarations.get_index_prop(index, $SIMPLE_MATCH_FUNCTION);
        final SubLObject num_function = kb_indexing_declarations.get_index_prop(index, $NUM_FUNCTION);
        return list(PIF, $list42, list(CSETQ, result, listS(num_function, v_term, append(keys, NIL))), list(PIF, list(SIMPLE_INDEXED_TERM_P, v_term), list(SET_RELEVANT_SIMPLE_INDEX_COUNT, result, listS(simple_match_function, v_term, append(keys, NIL))), listS(SET_RELEVANT_COMPLEX_INDEX_COUNT, result, index, v_term, append(keys, NIL))));
    }

    public static final SubLObject number_has_reached_cutoffP_alt(SubLObject number, SubLObject cutoff) {
        return numGE(number, cutoff);
    }

    public static SubLObject number_has_reached_cutoffP(final SubLObject number, final SubLObject cutoff) {
        return numGE(number, cutoff);
    }

    /**
     *
     *
     * @param COUNT-VAR,
     * 		a variable which should be set to zero
     * @param CUTOFF;
     * 		nil or positive-integer-p; a number beyond which to stop counting, i.e. the max possible return value
     * @param TERM;
     * 		the term to count the simple index for
     * @param FUNCTION;
     * 		a SubL function to call on the arglist (assertion, TERM, then the remaining arguments)
     */
    @LispMethod(comment = "@param COUNT-VAR,\r\n\t\ta variable which should be set to zero\r\n@param CUTOFF;\r\n\t\tnil or positive-integer-p; a number beyond which to stop counting, i.e. the max possible return value\r\n@param TERM;\r\n\t\tthe term to count the simple index for\r\n@param FUNCTION;\r\n\t\ta SubL function to call on the arglist (assertion, TERM, then the remaining arguments)")
    public static final SubLObject set_relevant_simple_index_count_with_cutoff_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject count_var = NIL;
            SubLObject cutoff = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt44);
            count_var = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt44);
            cutoff = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt44);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject function = NIL;
                    SubLObject v_term = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt44);
                    function = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt44);
                    v_term = current.first();
                    current = current.rest();
                    {
                        SubLObject args = current;
                        current = temp;
                        if (NIL == current) {
                            return list(DO_SIMPLE_INDEX, list(ASS, v_term), list(PUNLESS, list($sym46$NUMBER_HAS_REACHED_CUTOFF_, count_var, cutoff), list(PWHEN, listS(function, ASS, v_term, append(args, NIL)), list(PWHEN, $list_alt19, list(CINC, count_var)))));
                        } else {
                            cdestructuring_bind_error(datum, $list_alt44);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param COUNT-VAR,
     * 		a variable which should be set to zero
     * @param CUTOFF;
     * 		nil or positive-integer-p; a number beyond which to stop counting, i.e. the max possible return value
     * @param TERM;
     * 		the term to count the simple index for
     * @param FUNCTION;
     * 		a SubL function to call on the arglist (assertion, TERM, then the remaining arguments)
     */
    @LispMethod(comment = "@param COUNT-VAR,\r\n\t\ta variable which should be set to zero\r\n@param CUTOFF;\r\n\t\tnil or positive-integer-p; a number beyond which to stop counting, i.e. the max possible return value\r\n@param TERM;\r\n\t\tthe term to count the simple index for\r\n@param FUNCTION;\r\n\t\ta SubL function to call on the arglist (assertion, TERM, then the remaining arguments)")
    public static SubLObject set_relevant_simple_index_count_with_cutoff(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject count_var = NIL;
        SubLObject cutoff = NIL;
        destructuring_bind_must_consp(current, datum, $list44);
        count_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list44);
        cutoff = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list44);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject function = NIL;
        SubLObject v_term = NIL;
        destructuring_bind_must_consp(current, datum, $list44);
        function = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list44);
        v_term = current.first();
        final SubLObject args;
        current = args = current.rest();
        current = temp;
        if (NIL == current) {
            return list(DO_SIMPLE_INDEX, list(ASS, v_term), list(PUNLESS, list($sym46$NUMBER_HAS_REACHED_CUTOFF_, count_var, cutoff), list(PWHEN, listS(function, ASS, v_term, append(args, NIL)), list(PWHEN, $list19, list(CINC, count_var)))));
        }
        cdestructuring_bind_error(datum, $list44);
        return NIL;
    }

    /**
     * Generates code which will set RESULT to the number of leaves under INDEX with the given key sequence,
     * which are also mt-relevant.
     *
     * @param CUTOFF;
     * 		nil or positive-integer-p; a number beyond which to stop counting, i.e. the max possible return value
     */
    @LispMethod(comment = "Generates code which will set RESULT to the number of leaves under INDEX with the given key sequence,\r\nwhich are also mt-relevant.\r\n\r\n@param CUTOFF;\r\n\t\tnil or positive-integer-p; a number beyond which to stop counting, i.e. the max possible return value\nGenerates code which will set RESULT to the number of leaves under INDEX with the given key sequence,\nwhich are also mt-relevant.")
    public static final SubLObject set_relevant_complex_index_count_with_cutoff_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject result = NIL;
            SubLObject cutoff = NIL;
            SubLObject index = NIL;
            SubLObject v_term = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt48);
            result = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt48);
            cutoff = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt48);
            index = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt48);
            v_term = current.first();
            current = current.rest();
            {
                SubLObject keys = current;
                SubLObject get_subindex_function = kb_indexing_declarations.get_index_prop(index, $GET_SUBINDEX_FUNCTION);
                SubLObject key_function = kb_indexing_declarations.get_index_prop(index, $KEY_FUNCTION);
                SubLObject relevant_num_function_with_cutoff = kb_indexing_declarations.get_index_prop(index, $RELEVANT_NUM_FUNCTION_WITH_CUTOFF);
                SubLObject mt_key_level = com.cyc.cycjava.cycl.kb_indexing_macros.mt_key_level(index);
                if (!mt_key_level.isInteger()) {
                    Errors.error($str_alt50$SET_RELEVANT_COMPLEX_INDEX_COUNT_, index);
                }
                if (com.cyc.cycjava.cycl.kb_indexing_macros.number_of_non_null_args_in_order(keys, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED).numGE(mt_key_level)) {
                    Errors.error($str_alt51$SET_RELEVANT_COMPLEX_INDEX_COUNT_);
                }
                {
                    SubLObject good_key_count = $sym52$GOOD_KEY_COUNT;
                    SubLObject good_keys = $sym53$GOOD_KEYS;
                    SubLObject mt_subindex = $sym54$MT_SUBINDEX;
                    SubLObject next_level_keys = $sym55$NEXT_LEVEL_KEYS;
                    SubLObject next_key = $sym56$NEXT_KEY;
                    return list(CLET, list(list(good_key_count, bq_cons(NUMBER_OF_NON_NULL_ARGS_IN_ORDER, append(keys, NIL)))), list(PIF, list($sym31$_, good_key_count, listS($sym32$_, mt_key_level, $list_alt33)), list(CLET, list(list(mt_subindex, listS(get_subindex_function, v_term, append(keys, NIL)))), list(PWHEN, mt_subindex, list(CSETQ, result, list(RELEVANT_MT_SUBINDEX_COUNT_WITH_CUTOFF, mt_subindex, cutoff)))), list(CLET, list(list(good_keys, listS(LIST_OF_FIRST_N_ARGS, good_key_count, append(keys, NIL))), list(next_level_keys, list(APPLY, list(QUOTE, key_function), v_term, good_keys))), list(CDOLIST, list(next_key, next_level_keys), list(CINC, result, list(APPLY, list(QUOTE, relevant_num_function_with_cutoff), v_term, cutoff, list(APPEND, good_keys, list(LIST, next_key))))))));
                }
            }
        }
    }

    /**
     * Generates code which will set RESULT to the number of leaves under INDEX with the given key sequence,
     * which are also mt-relevant.
     *
     * @param CUTOFF;
     * 		nil or positive-integer-p; a number beyond which to stop counting, i.e. the max possible return value
     */
    @LispMethod(comment = "Generates code which will set RESULT to the number of leaves under INDEX with the given key sequence,\r\nwhich are also mt-relevant.\r\n\r\n@param CUTOFF;\r\n\t\tnil or positive-integer-p; a number beyond which to stop counting, i.e. the max possible return value\nGenerates code which will set RESULT to the number of leaves under INDEX with the given key sequence,\nwhich are also mt-relevant.")
    public static SubLObject set_relevant_complex_index_count_with_cutoff(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject result = NIL;
        SubLObject cutoff = NIL;
        SubLObject index = NIL;
        SubLObject v_term = NIL;
        destructuring_bind_must_consp(current, datum, $list48);
        result = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list48);
        cutoff = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list48);
        index = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list48);
        v_term = current.first();
        final SubLObject keys;
        current = keys = current.rest();
        final SubLObject get_subindex_function = kb_indexing_declarations.get_index_prop(index, $GET_SUBINDEX_FUNCTION);
        final SubLObject key_function = kb_indexing_declarations.get_index_prop(index, $KEY_FUNCTION);
        final SubLObject relevant_num_function_with_cutoff = kb_indexing_declarations.get_index_prop(index, $RELEVANT_NUM_FUNCTION_WITH_CUTOFF);
        final SubLObject mt_key_level = mt_key_level(index);
        if (!mt_key_level.isInteger()) {
            Errors.error($str50$SET_RELEVANT_COMPLEX_INDEX_COUNT_, index);
        }
        if (number_of_non_null_args_in_order(keys, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED).numGE(mt_key_level)) {
            Errors.error($str51$SET_RELEVANT_COMPLEX_INDEX_COUNT_);
        }
        final SubLObject good_key_count = $sym52$GOOD_KEY_COUNT;
        final SubLObject good_keys = $sym53$GOOD_KEYS;
        final SubLObject mt_subindex = $sym54$MT_SUBINDEX;
        final SubLObject next_level_keys = $sym55$NEXT_LEVEL_KEYS;
        final SubLObject next_key = $sym56$NEXT_KEY;
        return list(CLET, list(list(good_key_count, bq_cons(NUMBER_OF_NON_NULL_ARGS_IN_ORDER, append(keys, NIL)))), list(PIF, list($sym31$_, good_key_count, listS($sym32$_, mt_key_level, $list33)), list(CLET, list(list(mt_subindex, listS(get_subindex_function, v_term, append(keys, NIL)))), list(PWHEN, mt_subindex, list(CSETQ, result, list(RELEVANT_MT_SUBINDEX_COUNT_WITH_CUTOFF, mt_subindex, cutoff)))), list(CLET, list(list(good_keys, listS(LIST_OF_FIRST_N_ARGS, good_key_count, append(keys, NIL))), list(next_level_keys, list(APPLY, list(QUOTE, key_function), v_term, good_keys))), list(CDOLIST, list(next_key, next_level_keys), list(CINC, result, list(APPLY, list(QUOTE, relevant_num_function_with_cutoff), v_term, cutoff, list(APPEND, good_keys, list(LIST, next_key))))))));
    }

    public static final SubLObject set_relevant_num_arbitrary_index_with_cutoff_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject result = NIL;
            SubLObject cutoff = NIL;
            SubLObject index = NIL;
            SubLObject v_term = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt48);
            result = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt48);
            cutoff = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt48);
            index = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt48);
            v_term = current.first();
            current = current.rest();
            {
                SubLObject keys = current;
                SubLObject simple_match_function = kb_indexing_declarations.get_index_prop(index, $SIMPLE_MATCH_FUNCTION);
                SubLObject num_function = kb_indexing_declarations.get_index_prop(index, $NUM_FUNCTION);
                return list(PIF, $list_alt42, list(PROGN, list(CSETQ, result, listS(num_function, v_term, append(keys, NIL))), list(PWHEN, list($sym46$NUMBER_HAS_REACHED_CUTOFF_, result, cutoff), list(CSETQ, result, cutoff))), list(PIF, list(SIMPLE_INDEXED_TERM_P, v_term), list(SET_RELEVANT_SIMPLE_INDEX_COUNT_WITH_CUTOFF, result, cutoff, listS(simple_match_function, v_term, append(keys, NIL))), listS(SET_RELEVANT_COMPLEX_INDEX_COUNT_WITH_CUTOFF, result, cutoff, index, v_term, append(keys, NIL))));
            }
        }
    }

    public static SubLObject set_relevant_num_arbitrary_index_with_cutoff(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject result = NIL;
        SubLObject cutoff = NIL;
        SubLObject index = NIL;
        SubLObject v_term = NIL;
        destructuring_bind_must_consp(current, datum, $list48);
        result = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list48);
        cutoff = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list48);
        index = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list48);
        v_term = current.first();
        final SubLObject keys;
        current = keys = current.rest();
        final SubLObject simple_match_function = kb_indexing_declarations.get_index_prop(index, $SIMPLE_MATCH_FUNCTION);
        final SubLObject num_function = kb_indexing_declarations.get_index_prop(index, $NUM_FUNCTION);
        return list(PIF, $list42, list(PROGN, list(CSETQ, result, listS(num_function, v_term, append(keys, NIL))), list(PWHEN, list($sym46$NUMBER_HAS_REACHED_CUTOFF_, result, cutoff), list(CSETQ, result, cutoff))), list(PIF, list(SIMPLE_INDEXED_TERM_P, v_term), list(SET_RELEVANT_SIMPLE_INDEX_COUNT_WITH_CUTOFF, result, cutoff, listS(simple_match_function, v_term, append(keys, NIL))), listS(SET_RELEVANT_COMPLEX_INDEX_COUNT_WITH_CUTOFF, result, cutoff, index, v_term, append(keys, NIL))));
    }

    /**
     * Generates code which will set RESULT to a list of the keys to the next index level of INDEX below the keys provided.
     */
    @LispMethod(comment = "Generates code which will set RESULT to a list of the keys to the next index level of INDEX below the keys provided.")
    public static final SubLObject set_key_arbitrary_index_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject result = NIL;
            SubLObject index = NIL;
            SubLObject v_term = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            result = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            index = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            v_term = current.first();
            current = current.rest();
            {
                SubLObject keys = current;
                SubLObject simple_key_function = kb_indexing_declarations.get_index_prop(index, $SIMPLE_KEY_FUNCTION);
                SubLObject get_subindex_function = kb_indexing_declarations.get_index_prop(index, $GET_SUBINDEX_FUNCTION);
                SubLObject keys_accum = $sym60$KEYS_ACCUM;
                SubLObject ass = $sym61$ASS;
                return list(PIF, list(SIMPLE_INDEXED_TERM_P, v_term), list(CLET, list(bq_cons(keys_accum, $list_alt62)), list(DO_SIMPLE_INDEX, list(ass, v_term), list(CSETQ, keys_accum, listS(simple_key_function, ass, keys_accum, v_term, append(keys, NIL)))), list(CSETQ, result, keys_accum)), list(CLET, list(list(NEXT_LEVEL_SUBINDEX, listS(get_subindex_function, v_term, append(keys, NIL)))), listS(CSETQ, result, $list_alt64)));
            }
        }
    }

    /**
     * Generates code which will set RESULT to a list of the keys to the next index level of INDEX below the keys provided.
     */
    @LispMethod(comment = "Generates code which will set RESULT to a list of the keys to the next index level of INDEX below the keys provided.")
    public static SubLObject set_key_arbitrary_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject result = NIL;
        SubLObject index = NIL;
        SubLObject v_term = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        result = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        index = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        v_term = current.first();
        final SubLObject keys;
        current = keys = current.rest();
        final SubLObject simple_key_function = kb_indexing_declarations.get_index_prop(index, $SIMPLE_KEY_FUNCTION);
        final SubLObject get_subindex_function = kb_indexing_declarations.get_index_prop(index, $GET_SUBINDEX_FUNCTION);
        final SubLObject keys_accum = $sym60$KEYS_ACCUM;
        final SubLObject ass = $sym61$ASS;
        return list(PIF, list(SIMPLE_INDEXED_TERM_P, v_term), list(CLET, list(bq_cons(keys_accum, $list62)), list(DO_SIMPLE_INDEX, list(ass, v_term), list(CSETQ, keys_accum, listS(simple_key_function, ass, keys_accum, v_term, append(keys, NIL)))), list(CSETQ, result, keys_accum)), list(CLET, list(list(NEXT_LEVEL_SUBINDEX, listS(get_subindex_function, v_term, append(keys, NIL)))), listS(CSETQ, result, $list64)));
    }

    public static final SubLObject set_relevant_key_simple_index_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject result = NIL;
            SubLObject index = NIL;
            SubLObject v_term = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            result = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            index = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            v_term = current.first();
            current = current.rest();
            {
                SubLObject keys = current;
                SubLObject simple_match_function = kb_indexing_declarations.get_index_prop(index, $SIMPLE_MATCH_FUNCTION);
                SubLObject simple_key_function = kb_indexing_declarations.get_index_prop(index, $SIMPLE_KEY_FUNCTION);
                SubLObject keys_accum = $sym67$KEYS_ACCUM;
                SubLObject ass = $sym68$ASS;
                return list(CLET, list(bq_cons(keys_accum, $list_alt62)), list(DO_SIMPLE_INDEX, list(ass, v_term), list(PWHEN, listS(simple_match_function, ass, v_term, append(keys, NIL)), list(PWHEN, list($sym69$RELEVANT_MT_, list(ASSERTION_MT, ass)), list(CSETQ, keys_accum, listS(simple_key_function, ass, keys_accum, v_term, append(keys, NIL)))))), list(CSETQ, result, keys_accum));
            }
        }
    }

    public static SubLObject set_relevant_key_simple_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject result = NIL;
        SubLObject index = NIL;
        SubLObject v_term = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        result = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        index = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        v_term = current.first();
        final SubLObject keys;
        current = keys = current.rest();
        final SubLObject simple_match_function = kb_indexing_declarations.get_index_prop(index, $SIMPLE_MATCH_FUNCTION);
        final SubLObject simple_key_function = kb_indexing_declarations.get_index_prop(index, $SIMPLE_KEY_FUNCTION);
        final SubLObject keys_accum = $sym67$KEYS_ACCUM;
        final SubLObject ass = $sym68$ASS;
        return list(CLET, list(bq_cons(keys_accum, $list62)), list(DO_SIMPLE_INDEX, list(ass, v_term), list(PWHEN, listS(simple_match_function, ass, v_term, append(keys, NIL)), list(PWHEN, list($sym69$RELEVANT_MT_, list(ASSERTION_MT, ass)), list(CSETQ, keys_accum, listS(simple_key_function, ass, keys_accum, v_term, append(keys, NIL)))))), list(CSETQ, result, keys_accum));
    }

    public static final SubLObject set_relevant_key_complex_index_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject result = NIL;
            SubLObject index = NIL;
            SubLObject v_term = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            result = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            index = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            v_term = current.first();
            current = current.rest();
            {
                SubLObject keys = current;
                SubLObject key_function = kb_indexing_declarations.get_index_prop(index, $KEY_FUNCTION);
                SubLObject get_subindex_function = kb_indexing_declarations.get_index_prop(index, $GET_SUBINDEX_FUNCTION);
                SubLObject relevant_num_function = kb_indexing_declarations.get_index_prop(index, $RELEVANT_NUM_FUNCTION);
                SubLObject mt_key_level = com.cyc.cycjava.cycl.kb_indexing_macros.mt_key_level(index);
                if (!mt_key_level.isInteger()) {
                    Errors.error($str_alt23$SET_RELEVANT_COMPLEX_INDEX_COUNT_, index);
                }
                if (com.cyc.cycjava.cycl.kb_indexing_macros.number_of_non_null_args_in_order(keys, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED).numGE(mt_key_level)) {
                    Errors.error($str_alt24$SET_RELEVANT_COMPLEX_INDEX_COUNT_);
                }
                {
                    SubLObject good_key_count = $sym72$GOOD_KEY_COUNT;
                    SubLObject good_keys = $sym73$GOOD_KEYS;
                    SubLObject mt_subindex = $sym74$MT_SUBINDEX;
                    SubLObject next_level_keys = $sym75$NEXT_LEVEL_KEYS;
                    SubLObject next_key = $sym76$NEXT_KEY;
                    return list(CLET, list(list(good_key_count, bq_cons(NUMBER_OF_NON_NULL_ARGS_IN_ORDER, append(keys, NIL)))), list(PIF, list($sym31$_, good_key_count, listS($sym32$_, mt_key_level, $list_alt33)), list(CLET, list(list(mt_subindex, listS(get_subindex_function, v_term, append(keys, NIL)))), list(PWHEN, mt_subindex, list(CSETQ, result, list(RELEVANT_MT_SUBINDEX_KEYS, mt_subindex)))), list(CLET, list(list(good_keys, listS(LIST_OF_FIRST_N_ARGS, good_key_count, append(keys, NIL))), list(next_level_keys, list(APPLY, list(QUOTE, key_function), v_term, good_keys))), list(CDOLIST, list(next_key, next_level_keys), list(PWHEN, list(PLUSP, list(APPLY, list(QUOTE, relevant_num_function), v_term, list(APPEND, good_keys, list(LIST, next_key)))), list(CPUSH, next_key, result))))));
                }
            }
        }
    }

    public static SubLObject set_relevant_key_complex_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject result = NIL;
        SubLObject index = NIL;
        SubLObject v_term = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        result = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        index = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        v_term = current.first();
        final SubLObject keys;
        current = keys = current.rest();
        final SubLObject key_function = kb_indexing_declarations.get_index_prop(index, $KEY_FUNCTION);
        final SubLObject get_subindex_function = kb_indexing_declarations.get_index_prop(index, $GET_SUBINDEX_FUNCTION);
        final SubLObject relevant_num_function = kb_indexing_declarations.get_index_prop(index, $RELEVANT_NUM_FUNCTION);
        final SubLObject mt_key_level = mt_key_level(index);
        if (!mt_key_level.isInteger()) {
            Errors.error($str23$SET_RELEVANT_COMPLEX_INDEX_COUNT_, index);
        }
        if (number_of_non_null_args_in_order(keys, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED).numGE(mt_key_level)) {
            Errors.error($str24$SET_RELEVANT_COMPLEX_INDEX_COUNT_);
        }
        final SubLObject good_key_count = $sym72$GOOD_KEY_COUNT;
        final SubLObject good_keys = $sym73$GOOD_KEYS;
        final SubLObject mt_subindex = $sym74$MT_SUBINDEX;
        final SubLObject next_level_keys = $sym75$NEXT_LEVEL_KEYS;
        final SubLObject next_key = $sym76$NEXT_KEY;
        return list(CLET, list(list(good_key_count, bq_cons(NUMBER_OF_NON_NULL_ARGS_IN_ORDER, append(keys, NIL)))), list(PIF, list($sym31$_, good_key_count, listS($sym32$_, mt_key_level, $list33)), list(CLET, list(list(mt_subindex, listS(get_subindex_function, v_term, append(keys, NIL)))), list(PWHEN, mt_subindex, list(CSETQ, result, list(RELEVANT_MT_SUBINDEX_KEYS, mt_subindex)))), list(CLET, list(list(good_keys, listS(LIST_OF_FIRST_N_ARGS, good_key_count, append(keys, NIL))), list(next_level_keys, list(APPLY, list(QUOTE, key_function), v_term, good_keys))), list(CDOLIST, list(next_key, next_level_keys), list(PWHEN, list(PLUSP, list(APPLY, list(QUOTE, relevant_num_function), v_term, list(APPEND, good_keys, list(LIST, next_key)))), list(CPUSH, next_key, result))))));
    }

    public static final SubLObject set_relevant_key_arbitrary_index_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject result = NIL;
            SubLObject index = NIL;
            SubLObject v_term = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            result = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            index = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            v_term = current.first();
            current = current.rest();
            {
                SubLObject keys = current;
                SubLObject key_function = kb_indexing_declarations.get_index_prop(index, $KEY_FUNCTION);
                return list(PIF, $list_alt42, list(CSETQ, result, listS(key_function, v_term, append(keys, NIL))), list(PIF, list(SIMPLE_INDEXED_TERM_P, v_term), listS(SET_RELEVANT_KEY_SIMPLE_INDEX, result, index, v_term, append(keys, NIL)), listS(SET_RELEVANT_KEY_COMPLEX_INDEX, result, index, v_term, append(keys, NIL))));
            }
        }
    }

    public static SubLObject set_relevant_key_arbitrary_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject result = NIL;
        SubLObject index = NIL;
        SubLObject v_term = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        result = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        index = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        v_term = current.first();
        final SubLObject keys;
        current = keys = current.rest();
        final SubLObject key_function = kb_indexing_declarations.get_index_prop(index, $KEY_FUNCTION);
        return list(PIF, $list42, list(CSETQ, result, listS(key_function, v_term, append(keys, NIL))), list(PIF, list(SIMPLE_INDEXED_TERM_P, v_term), listS(SET_RELEVANT_KEY_SIMPLE_INDEX, result, index, v_term, append(keys, NIL)), listS(SET_RELEVANT_KEY_COMPLEX_INDEX, result, index, v_term, append(keys, NIL))));
    }

    /**
     *
     *
     * @return integerp; the level of indexing (starting at 1) which is the mt level of INDEX.
     */
    @LispMethod(comment = "@return integerp; the level of indexing (starting at 1) which is the mt level of INDEX.")
    public static final SubLObject mt_key_level_alt(SubLObject index) {
        {
            SubLObject keys_declaration = kb_indexing_declarations.get_index_prop(index, $KEYS);
            SubLObject level = ONE_INTEGER;
            SubLObject cdolist_list_var = keys_declaration;
            SubLObject key_plist = NIL;
            for (key_plist = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , key_plist = cdolist_list_var.first()) {
                if (NIL != getf(key_plist, $MT_, UNPROVIDED)) {
                    return level;
                } else {
                    level = add(level, ONE_INTEGER);
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return integerp; the level of indexing (starting at 1) which is the mt level of INDEX.
     */
    @LispMethod(comment = "@return integerp; the level of indexing (starting at 1) which is the mt level of INDEX.")
    public static SubLObject mt_key_level(final SubLObject index) {
        final SubLObject keys_declaration = kb_indexing_declarations.get_index_prop(index, $KEYS);
        SubLObject level = ONE_INTEGER;
        SubLObject cdolist_list_var = keys_declaration;
        SubLObject key_plist = NIL;
        key_plist = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != getf(key_plist, $MT_, UNPROVIDED)) {
                return level;
            }
            level = add(level, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            key_plist = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject list_of_first_n_args_alt(SubLObject n, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        if (arg5 == UNPROVIDED) {
            arg5 = NIL;
        }
        {
            SubLObject result = NIL;
            if (n.numGE(ONE_INTEGER)) {
                result = cons(arg1, result);
            }
            if (n.numGE(TWO_INTEGER)) {
                result = cons(arg2, result);
            }
            if (n.numGE(THREE_INTEGER)) {
                result = cons(arg3, result);
            }
            if (n.numGE(FOUR_INTEGER)) {
                result = cons(arg4, result);
            }
            if (n.numGE(FIVE_INTEGER)) {
                result = cons(arg5, result);
            }
            return nreverse(result);
        }
    }

    public static SubLObject list_of_first_n_args(final SubLObject n, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        if (arg5 == UNPROVIDED) {
            arg5 = NIL;
        }
        SubLObject result = NIL;
        if (n.numGE(ONE_INTEGER)) {
            result = cons(arg1, result);
        }
        if (n.numGE(TWO_INTEGER)) {
            result = cons(arg2, result);
        }
        if (n.numGE(THREE_INTEGER)) {
            result = cons(arg3, result);
        }
        if (n.numGE(FOUR_INTEGER)) {
            result = cons(arg4, result);
        }
        if (n.numGE(FIVE_INTEGER)) {
            result = cons(arg5, result);
        }
        return nreverse(result);
    }

    /**
     * stops counting if it hits a null one
     */
    @LispMethod(comment = "stops counting if it hits a null one")
    public static final SubLObject number_of_non_null_args_in_order_alt(SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        if (arg5 == UNPROVIDED) {
            arg5 = NIL;
        }
        {
            SubLObject count = ZERO_INTEGER;
            if (NIL == arg1) {
                return count;
            }
            count = add(count, ONE_INTEGER);
            if (NIL == arg2) {
                return count;
            }
            count = add(count, ONE_INTEGER);
            if (NIL == arg3) {
                return count;
            }
            count = add(count, ONE_INTEGER);
            if (NIL == arg4) {
                return count;
            }
            count = add(count, ONE_INTEGER);
            if (NIL == arg5) {
                return count;
            }
            count = add(count, ONE_INTEGER);
            return count;
        }
    }

    /**
     * stops counting if it hits a null one
     */
    @LispMethod(comment = "stops counting if it hits a null one")
    public static SubLObject number_of_non_null_args_in_order(SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        if (arg5 == UNPROVIDED) {
            arg5 = NIL;
        }
        SubLObject count = ZERO_INTEGER;
        if (NIL == arg1) {
            return count;
        }
        count = add(count, ONE_INTEGER);
        if (NIL == arg2) {
            return count;
        }
        count = add(count, ONE_INTEGER);
        if (NIL == arg3) {
            return count;
        }
        count = add(count, ONE_INTEGER);
        if (NIL == arg4) {
            return count;
        }
        count = add(count, ONE_INTEGER);
        if (NIL == arg5) {
            return count;
        }
        count = add(count, ONE_INTEGER);
        return count;
    }

    public static final SubLObject do_gaf_arg_indices_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt83);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject argnum = NIL;
                    SubLObject subindex = NIL;
                    SubLObject v_term = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt83);
                    argnum = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt83);
                    subindex = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt83);
                    v_term = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_1 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt83);
                            current_1 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt83);
                            if (NIL == member(current_1, $list_alt84, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_1 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt83);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return list(DO_INTERMEDIATE_INDEX, list(argnum, subindex, list(TERM_GAF_ARG_INDEX, v_term), $DONE, done), listS(PWHEN, list($sym89$VALID_GAF_ARG_INDEX_KEY_, argnum), append(body, NIL)));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_gaf_arg_indices(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list83);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject argnum = NIL;
        SubLObject subindex = NIL;
        SubLObject v_term = NIL;
        destructuring_bind_must_consp(current, datum, $list83);
        argnum = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list83);
        subindex = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list83);
        v_term = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list83);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list83);
            if (NIL == member(current_$1, $list84, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list83);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return list(DO_INTERMEDIATE_INDEX, list(argnum, subindex, list(TERM_GAF_ARG_INDEX, v_term), $DONE, done), listS(PWHEN, list($sym89$VALID_GAF_ARG_INDEX_KEY_, argnum), append(body, NIL)));
    }

    public static final SubLObject do_gaf_arg_index_keys_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt90);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject argnum = NIL;
                    SubLObject v_term = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt90);
                    argnum = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt90);
                    v_term = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_2 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt90);
                            current_2 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt90);
                            if (NIL == member(current_2, $list_alt84, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_2 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt90);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject subindex = $sym91$SUBINDEX;
                                return listS(DO_GAF_ARG_INDICES, list(argnum, subindex, v_term, $DONE, done), list(IGNORE, subindex), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_gaf_arg_index_keys(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list90);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject argnum = NIL;
        SubLObject v_term = NIL;
        destructuring_bind_must_consp(current, datum, $list90);
        argnum = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list90);
        v_term = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list90);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list90);
            if (NIL == member(current_$2, $list84, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list90);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject subindex = $sym91$SUBINDEX;
        return listS(DO_GAF_ARG_INDICES, list(argnum, subindex, v_term, $DONE, done), list(IGNORE, subindex), append(body, NIL));
    }

    public static final SubLObject term_gaf_arg_index_alt(SubLObject v_term) {
        return intermediate_index_lookup(term_index(v_term), $GAF_ARG);
    }

    public static SubLObject term_gaf_arg_index(final SubLObject v_term) {
        return intermediate_index_lookup(term_index(v_term), $GAF_ARG);
    }

    public static final SubLObject valid_gaf_arg_index_keyP_alt(SubLObject key) {
        return T;
    }

    public static SubLObject valid_gaf_arg_index_keyP(final SubLObject key) {
        return T;
    }

    public static final SubLObject do_nart_arg_indices_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt83);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject argnum = NIL;
                    SubLObject subindex = NIL;
                    SubLObject v_term = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt83);
                    argnum = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt83);
                    subindex = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt83);
                    v_term = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_3 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt83);
                            current_3 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt83);
                            if (NIL == member(current_3, $list_alt84, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_3 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt83);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return list(DO_INTERMEDIATE_INDEX, list(argnum, subindex, list(TERM_NART_ARG_INDEX, v_term), $DONE, done), listS(PWHEN, list($sym96$VALID_NART_ARG_INDEX_KEY_, argnum), append(body, NIL)));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_nart_arg_indices(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list83);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject argnum = NIL;
        SubLObject subindex = NIL;
        SubLObject v_term = NIL;
        destructuring_bind_must_consp(current, datum, $list83);
        argnum = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list83);
        subindex = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list83);
        v_term = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$3 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list83);
            current_$3 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list83);
            if (NIL == member(current_$3, $list84, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$3 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list83);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return list(DO_INTERMEDIATE_INDEX, list(argnum, subindex, list(TERM_NART_ARG_INDEX, v_term), $DONE, done), listS(PWHEN, list($sym96$VALID_NART_ARG_INDEX_KEY_, argnum), append(body, NIL)));
    }

    public static final SubLObject do_nart_arg_index_keys_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt90);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject argnum = NIL;
                    SubLObject v_term = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt90);
                    argnum = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt90);
                    v_term = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_4 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt90);
                            current_4 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt90);
                            if (NIL == member(current_4, $list_alt84, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_4 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt90);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject subindex = $sym97$SUBINDEX;
                                return listS(DO_NART_ARG_INDICES, list(argnum, subindex, v_term, $DONE, done), list(IGNORE, subindex), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_nart_arg_index_keys(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list90);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject argnum = NIL;
        SubLObject v_term = NIL;
        destructuring_bind_must_consp(current, datum, $list90);
        argnum = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list90);
        v_term = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$4 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list90);
            current_$4 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list90);
            if (NIL == member(current_$4, $list84, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$4 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list90);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject subindex = $sym97$SUBINDEX;
        return listS(DO_NART_ARG_INDICES, list(argnum, subindex, v_term, $DONE, done), list(IGNORE, subindex), append(body, NIL));
    }

    public static final SubLObject term_nart_arg_index_alt(SubLObject v_term) {
        return intermediate_index_lookup(term_index(v_term), $NART_ARG);
    }

    public static SubLObject term_nart_arg_index(final SubLObject v_term) {
        return intermediate_index_lookup(term_index(v_term), $NART_ARG);
    }

    public static final SubLObject valid_nart_arg_index_keyP_alt(SubLObject key) {
        return T;
    }

    public static SubLObject valid_nart_arg_index_keyP(final SubLObject key) {
        return T;
    }

    public static final SubLObject do_predicate_rule_indices_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt100);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject sense = NIL;
                    SubLObject subindex = NIL;
                    SubLObject pred = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt100);
                    sense = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt100);
                    subindex = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt100);
                    pred = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_5 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt100);
                            current_5 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt100);
                            if (NIL == member(current_5, $list_alt84, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_5 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt100);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return list(DO_INTERMEDIATE_INDEX, list(sense, subindex, list(TERM_PREDICATE_RULE_INDEX, pred), $DONE, done), listS(PWHEN, list($sym102$VALID_PREDICATE_RULE_INDEX_KEY_, sense), append(body, NIL)));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_predicate_rule_indices(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list100);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject sense = NIL;
        SubLObject subindex = NIL;
        SubLObject pred = NIL;
        destructuring_bind_must_consp(current, datum, $list100);
        sense = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list100);
        subindex = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list100);
        pred = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$5 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list100);
            current_$5 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list100);
            if (NIL == member(current_$5, $list84, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$5 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list100);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return list(DO_INTERMEDIATE_INDEX, list(sense, subindex, list(TERM_PREDICATE_RULE_INDEX, pred), $DONE, done), listS(PWHEN, list($sym102$VALID_PREDICATE_RULE_INDEX_KEY_, sense), append(body, NIL)));
    }

    public static final SubLObject do_predicate_rule_index_keys_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt103);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject sense = NIL;
                    SubLObject pred = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt103);
                    sense = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt103);
                    pred = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_6 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt103);
                            current_6 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt103);
                            if (NIL == member(current_6, $list_alt84, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_6 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt103);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject subindex = $sym104$SUBINDEX;
                                return listS(DO_PREDICATE_RULE_INDICES, list(sense, subindex, pred, $DONE, done), list(IGNORE, subindex), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_predicate_rule_index_keys(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list103);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject sense = NIL;
        SubLObject pred = NIL;
        destructuring_bind_must_consp(current, datum, $list103);
        sense = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list103);
        pred = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$6 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list103);
            current_$6 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list103);
            if (NIL == member(current_$6, $list84, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$6 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list103);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject subindex = $sym104$SUBINDEX;
        return listS(DO_PREDICATE_RULE_INDICES, list(sense, subindex, pred, $DONE, done), list(IGNORE, subindex), append(body, NIL));
    }

    public static final SubLObject term_predicate_rule_index_alt(SubLObject pred) {
        return intermediate_index_lookup(term_index(pred), $PREDICATE_RULE);
    }

    public static SubLObject term_predicate_rule_index(final SubLObject pred) {
        return intermediate_index_lookup(term_index(pred), $PREDICATE_RULE);
    }

    public static final SubLObject valid_predicate_rule_index_keyP_alt(SubLObject key) {
        return T;
    }

    public static SubLObject valid_predicate_rule_index_keyP(final SubLObject key) {
        return T;
    }

    public static final SubLObject do_decontextualized_ist_predicate_rule_indices_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt100);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject sense = NIL;
                    SubLObject subindex = NIL;
                    SubLObject pred = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt100);
                    sense = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt100);
                    subindex = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt100);
                    pred = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_7 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt100);
                            current_7 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt100);
                            if (NIL == member(current_7, $list_alt84, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_7 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt100);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return list(DO_INTERMEDIATE_INDEX, list(sense, subindex, list(TERM_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX, pred), $DONE, done), listS(PWHEN, list($sym102$VALID_PREDICATE_RULE_INDEX_KEY_, sense), append(body, NIL)));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_decontextualized_ist_predicate_rule_indices(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list100);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject sense = NIL;
        SubLObject subindex = NIL;
        SubLObject pred = NIL;
        destructuring_bind_must_consp(current, datum, $list100);
        sense = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list100);
        subindex = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list100);
        pred = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$7 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list100);
            current_$7 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list100);
            if (NIL == member(current_$7, $list84, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$7 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list100);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return list(DO_INTERMEDIATE_INDEX, list(sense, subindex, list(TERM_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX, pred), $DONE, done), listS(PWHEN, list($sym102$VALID_PREDICATE_RULE_INDEX_KEY_, sense), append(body, NIL)));
    }

    public static final SubLObject do_decontextualized_ist_predicate_rule_index_keys_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt103);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject sense = NIL;
                    SubLObject pred = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt103);
                    sense = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt103);
                    pred = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_8 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt103);
                            current_8 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt103);
                            if (NIL == member(current_8, $list_alt84, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_8 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt103);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject subindex = $sym108$SUBINDEX;
                                return listS(DO_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDICES, list(sense, subindex, pred, $DONE, done), list(IGNORE, subindex), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_decontextualized_ist_predicate_rule_index_keys(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list103);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject sense = NIL;
        SubLObject pred = NIL;
        destructuring_bind_must_consp(current, datum, $list103);
        sense = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list103);
        pred = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$8 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list103);
            current_$8 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list103);
            if (NIL == member(current_$8, $list84, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$8 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list103);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject subindex = $sym108$SUBINDEX;
        return listS(DO_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDICES, list(sense, subindex, pred, $DONE, done), list(IGNORE, subindex), append(body, NIL));
    }

    public static final SubLObject term_decontextualized_ist_predicate_rule_index_alt(SubLObject pred) {
        return intermediate_index_lookup(term_index(pred), $DECONTEXTUALIZED_IST_PREDICATE_RULE);
    }

    public static SubLObject term_decontextualized_ist_predicate_rule_index(final SubLObject pred) {
        return intermediate_index_lookup(term_index(pred), $DECONTEXTUALIZED_IST_PREDICATE_RULE);
    }

    public static final SubLObject valid_decontextualized_ist_predicate_rule_index_keyP_alt(SubLObject key) {
        return T;
    }

    public static SubLObject valid_decontextualized_ist_predicate_rule_index_keyP(final SubLObject key) {
        return T;
    }

    public static final SubLObject do_isa_rule_indices_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt112);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject sense = NIL;
                    SubLObject subindex = NIL;
                    SubLObject col = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt112);
                    sense = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt112);
                    subindex = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt112);
                    col = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_9 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt112);
                            current_9 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt112);
                            if (NIL == member(current_9, $list_alt84, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_9 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt112);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return list(DO_INTERMEDIATE_INDEX, list(sense, subindex, list(TERM_ISA_RULE_INDEX, col), $DONE, done), listS(PWHEN, list($sym114$VALID_ISA_RULE_INDEX_KEY_, sense), append(body, NIL)));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_isa_rule_indices(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list112);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject sense = NIL;
        SubLObject subindex = NIL;
        SubLObject col = NIL;
        destructuring_bind_must_consp(current, datum, $list112);
        sense = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list112);
        subindex = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list112);
        col = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$9 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list112);
            current_$9 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list112);
            if (NIL == member(current_$9, $list84, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$9 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list112);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return list(DO_INTERMEDIATE_INDEX, list(sense, subindex, list(TERM_ISA_RULE_INDEX, col), $DONE, done), listS(PWHEN, list($sym114$VALID_ISA_RULE_INDEX_KEY_, sense), append(body, NIL)));
    }

    public static final SubLObject do_isa_rule_index_keys_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt115);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject sense = NIL;
                    SubLObject col = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt115);
                    sense = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt115);
                    col = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_10 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt115);
                            current_10 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt115);
                            if (NIL == member(current_10, $list_alt84, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_10 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt115);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject subindex = $sym116$SUBINDEX;
                                return listS(DO_ISA_RULE_INDICES, list(sense, subindex, col, $DONE, done), list(IGNORE, subindex), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_isa_rule_index_keys(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list115);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject sense = NIL;
        SubLObject col = NIL;
        destructuring_bind_must_consp(current, datum, $list115);
        sense = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list115);
        col = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$10 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list115);
            current_$10 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list115);
            if (NIL == member(current_$10, $list84, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$10 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list115);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject subindex = $sym116$SUBINDEX;
        return listS(DO_ISA_RULE_INDICES, list(sense, subindex, col, $DONE, done), list(IGNORE, subindex), append(body, NIL));
    }

    public static final SubLObject term_isa_rule_index_alt(SubLObject col) {
        return intermediate_index_lookup(term_index(col), $ISA_RULE);
    }

    public static SubLObject term_isa_rule_index(final SubLObject col) {
        return intermediate_index_lookup(term_index(col), $ISA_RULE);
    }

    public static final SubLObject valid_isa_rule_index_keyP_alt(SubLObject key) {
        return T;
    }

    public static SubLObject valid_isa_rule_index_keyP(final SubLObject key) {
        return T;
    }

    public static final SubLObject do_genls_rule_indices_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt112);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject sense = NIL;
                    SubLObject subindex = NIL;
                    SubLObject col = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt112);
                    sense = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt112);
                    subindex = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt112);
                    col = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_11 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt112);
                            current_11 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt112);
                            if (NIL == member(current_11, $list_alt84, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_11 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt112);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return list(DO_INTERMEDIATE_INDEX, list(sense, subindex, list(TERM_GENLS_RULE_INDEX, col), $DONE, done), listS(PWHEN, list($sym120$VALID_GENLS_RULE_INDEX_KEY_, sense), append(body, NIL)));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_genls_rule_indices(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list112);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject sense = NIL;
        SubLObject subindex = NIL;
        SubLObject col = NIL;
        destructuring_bind_must_consp(current, datum, $list112);
        sense = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list112);
        subindex = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list112);
        col = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$11 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list112);
            current_$11 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list112);
            if (NIL == member(current_$11, $list84, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$11 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list112);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return list(DO_INTERMEDIATE_INDEX, list(sense, subindex, list(TERM_GENLS_RULE_INDEX, col), $DONE, done), listS(PWHEN, list($sym120$VALID_GENLS_RULE_INDEX_KEY_, sense), append(body, NIL)));
    }

    public static final SubLObject do_genls_rule_index_keys_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt115);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject sense = NIL;
                    SubLObject col = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt115);
                    sense = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt115);
                    col = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_12 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt115);
                            current_12 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt115);
                            if (NIL == member(current_12, $list_alt84, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_12 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt115);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject subindex = $sym121$SUBINDEX;
                                return listS(DO_GENLS_RULE_INDICES, list(sense, subindex, col, $DONE, done), list(IGNORE, subindex), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_genls_rule_index_keys(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list115);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject sense = NIL;
        SubLObject col = NIL;
        destructuring_bind_must_consp(current, datum, $list115);
        sense = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list115);
        col = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$12 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list115);
            current_$12 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list115);
            if (NIL == member(current_$12, $list84, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$12 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list115);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject subindex = $sym121$SUBINDEX;
        return listS(DO_GENLS_RULE_INDICES, list(sense, subindex, col, $DONE, done), list(IGNORE, subindex), append(body, NIL));
    }

    public static final SubLObject term_genls_rule_index_alt(SubLObject col) {
        return intermediate_index_lookup(term_index(col), $GENLS_RULE);
    }

    public static SubLObject term_genls_rule_index(final SubLObject col) {
        return intermediate_index_lookup(term_index(col), $GENLS_RULE);
    }

    public static final SubLObject valid_genls_rule_index_keyP_alt(SubLObject key) {
        return T;
    }

    public static SubLObject valid_genls_rule_index_keyP(final SubLObject key) {
        return T;
    }

    public static final SubLObject do_genl_mt_rule_indices_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt112);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject sense = NIL;
                    SubLObject subindex = NIL;
                    SubLObject col = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt112);
                    sense = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt112);
                    subindex = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt112);
                    col = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_13 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt112);
                            current_13 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt112);
                            if (NIL == member(current_13, $list_alt84, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_13 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt112);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return list(DO_INTERMEDIATE_INDEX, list(sense, subindex, list(TERM_GENL_MT_RULE_INDEX, col), $DONE, done), listS(PWHEN, list($sym125$VALID_GENL_MT_RULE_INDEX_KEY_, sense), append(body, NIL)));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_genl_mt_rule_indices(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list112);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject sense = NIL;
        SubLObject subindex = NIL;
        SubLObject col = NIL;
        destructuring_bind_must_consp(current, datum, $list112);
        sense = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list112);
        subindex = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list112);
        col = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$13 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list112);
            current_$13 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list112);
            if (NIL == member(current_$13, $list84, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$13 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list112);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return list(DO_INTERMEDIATE_INDEX, list(sense, subindex, list(TERM_GENL_MT_RULE_INDEX, col), $DONE, done), listS(PWHEN, list($sym125$VALID_GENL_MT_RULE_INDEX_KEY_, sense), append(body, NIL)));
    }

    public static final SubLObject do_genl_mt_rule_index_keys_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt115);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject sense = NIL;
                    SubLObject col = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt115);
                    sense = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt115);
                    col = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_14 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt115);
                            current_14 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt115);
                            if (NIL == member(current_14, $list_alt84, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_14 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt115);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject subindex = $sym126$SUBINDEX;
                                return listS(DO_GENL_MT_RULE_INDICES, list(sense, subindex, col, $DONE, done), list(IGNORE, subindex), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_genl_mt_rule_index_keys(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list115);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject sense = NIL;
        SubLObject col = NIL;
        destructuring_bind_must_consp(current, datum, $list115);
        sense = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list115);
        col = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$14 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list115);
            current_$14 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list115);
            if (NIL == member(current_$14, $list84, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$14 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list115);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject subindex = $sym126$SUBINDEX;
        return listS(DO_GENL_MT_RULE_INDICES, list(sense, subindex, col, $DONE, done), list(IGNORE, subindex), append(body, NIL));
    }

    public static final SubLObject term_genl_mt_rule_index_alt(SubLObject col) {
        return intermediate_index_lookup(term_index(col), $GENL_MT_RULE);
    }

    public static SubLObject term_genl_mt_rule_index(final SubLObject col) {
        return intermediate_index_lookup(term_index(col), $GENL_MT_RULE);
    }

    public static final SubLObject valid_genl_mt_rule_index_keyP_alt(SubLObject key) {
        return T;
    }

    public static SubLObject valid_genl_mt_rule_index_keyP(final SubLObject key) {
        return T;
    }

    public static SubLObject declare_kb_indexing_macros_file() {
        declareMacro("set_num_arbitrary_index", "SET-NUM-ARBITRARY-INDEX");
        declareMacro("set_relevant_simple_index_count", "SET-RELEVANT-SIMPLE-INDEX-COUNT");
        declareMacro("set_relevant_complex_index_count", "SET-RELEVANT-COMPLEX-INDEX-COUNT");
        declareMacro("set_relevant_num_arbitrary_index", "SET-RELEVANT-NUM-ARBITRARY-INDEX");
        declareFunction("number_has_reached_cutoffP", "NUMBER-HAS-REACHED-CUTOFF?", 2, 0, false);
        declareMacro("set_relevant_simple_index_count_with_cutoff", "SET-RELEVANT-SIMPLE-INDEX-COUNT-WITH-CUTOFF");
        declareMacro("set_relevant_complex_index_count_with_cutoff", "SET-RELEVANT-COMPLEX-INDEX-COUNT-WITH-CUTOFF");
        declareMacro("set_relevant_num_arbitrary_index_with_cutoff", "SET-RELEVANT-NUM-ARBITRARY-INDEX-WITH-CUTOFF");
        declareMacro("set_key_arbitrary_index", "SET-KEY-ARBITRARY-INDEX");
        declareMacro("set_relevant_key_simple_index", "SET-RELEVANT-KEY-SIMPLE-INDEX");
        declareMacro("set_relevant_key_complex_index", "SET-RELEVANT-KEY-COMPLEX-INDEX");
        declareMacro("set_relevant_key_arbitrary_index", "SET-RELEVANT-KEY-ARBITRARY-INDEX");
        declareFunction("mt_key_level", "MT-KEY-LEVEL", 1, 0, false);
        declareFunction("list_of_first_n_args", "LIST-OF-FIRST-N-ARGS", 1, 5, false);
        declareFunction("number_of_non_null_args_in_order", "NUMBER-OF-NON-NULL-ARGS-IN-ORDER", 0, 5, false);
        declareMacro("do_gaf_arg_indices", "DO-GAF-ARG-INDICES");
        declareMacro("do_gaf_arg_index_keys", "DO-GAF-ARG-INDEX-KEYS");
        declareFunction("term_gaf_arg_index", "TERM-GAF-ARG-INDEX", 1, 0, false);
        declareFunction("valid_gaf_arg_index_keyP", "VALID-GAF-ARG-INDEX-KEY?", 1, 0, false);
        declareMacro("do_nart_arg_indices", "DO-NART-ARG-INDICES");
        declareMacro("do_nart_arg_index_keys", "DO-NART-ARG-INDEX-KEYS");
        declareFunction("term_nart_arg_index", "TERM-NART-ARG-INDEX", 1, 0, false);
        declareFunction("valid_nart_arg_index_keyP", "VALID-NART-ARG-INDEX-KEY?", 1, 0, false);
        declareMacro("do_predicate_rule_indices", "DO-PREDICATE-RULE-INDICES");
        declareMacro("do_predicate_rule_index_keys", "DO-PREDICATE-RULE-INDEX-KEYS");
        declareFunction("term_predicate_rule_index", "TERM-PREDICATE-RULE-INDEX", 1, 0, false);
        declareFunction("valid_predicate_rule_index_keyP", "VALID-PREDICATE-RULE-INDEX-KEY?", 1, 0, false);
        declareMacro("do_decontextualized_ist_predicate_rule_indices", "DO-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDICES");
        declareMacro("do_decontextualized_ist_predicate_rule_index_keys", "DO-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX-KEYS");
        declareFunction("term_decontextualized_ist_predicate_rule_index", "TERM-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX", 1, 0, false);
        declareFunction("valid_decontextualized_ist_predicate_rule_index_keyP", "VALID-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX-KEY?", 1, 0, false);
        declareMacro("do_isa_rule_indices", "DO-ISA-RULE-INDICES");
        declareMacro("do_isa_rule_index_keys", "DO-ISA-RULE-INDEX-KEYS");
        declareFunction("term_isa_rule_index", "TERM-ISA-RULE-INDEX", 1, 0, false);
        declareFunction("valid_isa_rule_index_keyP", "VALID-ISA-RULE-INDEX-KEY?", 1, 0, false);
        declareMacro("do_genls_rule_indices", "DO-GENLS-RULE-INDICES");
        declareMacro("do_genls_rule_index_keys", "DO-GENLS-RULE-INDEX-KEYS");
        declareFunction("term_genls_rule_index", "TERM-GENLS-RULE-INDEX", 1, 0, false);
        declareFunction("valid_genls_rule_index_keyP", "VALID-GENLS-RULE-INDEX-KEY?", 1, 0, false);
        declareMacro("do_genl_mt_rule_indices", "DO-GENL-MT-RULE-INDICES");
        declareMacro("do_genl_mt_rule_index_keys", "DO-GENL-MT-RULE-INDEX-KEYS");
        declareFunction("term_genl_mt_rule_index", "TERM-GENL-MT-RULE-INDEX", 1, 0, false);
        declareFunction("valid_genl_mt_rule_index_keyP", "VALID-GENL-MT-RULE-INDEX-KEY?", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_kb_indexing_macros_file() {
        return NIL;
    }

    public static SubLObject setup_kb_indexing_macros_file() {
        register_macro_helper(SET_RELEVANT_SIMPLE_INDEX_COUNT, SET_RELEVANT_NUM_ARBITRARY_INDEX);
        register_macro_helper(SET_RELEVANT_COMPLEX_INDEX_COUNT, SET_RELEVANT_NUM_ARBITRARY_INDEX);
        register_macro_helper(SET_RELEVANT_SIMPLE_INDEX_COUNT_WITH_CUTOFF, SET_RELEVANT_NUM_ARBITRARY_INDEX);
        register_macro_helper(SET_RELEVANT_COMPLEX_INDEX_COUNT_WITH_CUTOFF, SET_RELEVANT_NUM_ARBITRARY_INDEX);
        register_macro_helper(SET_RELEVANT_KEY_SIMPLE_INDEX, SET_RELEVANT_KEY_ARBITRARY_INDEX);
        register_macro_helper(SET_RELEVANT_KEY_COMPLEX_INDEX, SET_RELEVANT_KEY_ARBITRARY_INDEX);
        register_macro_helper(MT_KEY_LEVEL, SET_RELEVANT_COMPLEX_INDEX_COUNT);
        register_macro_helper(LIST_OF_FIRST_N_ARGS, SET_RELEVANT_COMPLEX_INDEX_COUNT);
        register_macro_helper(NUMBER_OF_NON_NULL_ARGS_IN_ORDER, SET_RELEVANT_COMPLEX_INDEX_COUNT);
        register_macro_helper(TERM_GAF_ARG_INDEX, DO_GAF_ARG_INDICES);
        register_macro_helper($sym89$VALID_GAF_ARG_INDEX_KEY_, DO_GAF_ARG_INDICES);
        register_macro_helper(TERM_NART_ARG_INDEX, DO_NART_ARG_INDICES);
        register_macro_helper($sym96$VALID_NART_ARG_INDEX_KEY_, DO_NART_ARG_INDICES);
        register_macro_helper(TERM_PREDICATE_RULE_INDEX, DO_PREDICATE_RULE_INDICES);
        register_macro_helper($sym102$VALID_PREDICATE_RULE_INDEX_KEY_, DO_PREDICATE_RULE_INDICES);
        register_macro_helper(TERM_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX, DO_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDICES);
        register_macro_helper($sym111$VALID_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX_KEY_, DO_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDICES);
        register_macro_helper(TERM_ISA_RULE_INDEX, DO_ISA_RULE_INDICES);
        register_macro_helper($sym114$VALID_ISA_RULE_INDEX_KEY_, DO_ISA_RULE_INDICES);
        register_macro_helper(TERM_GENLS_RULE_INDEX, DO_GENLS_RULE_INDICES);
        register_macro_helper($sym120$VALID_GENLS_RULE_INDEX_KEY_, DO_GENLS_RULE_INDICES);
        register_macro_helper(TERM_GENL_MT_RULE_INDEX, DO_GENL_MT_RULE_INDICES);
        register_macro_helper($sym125$VALID_GENL_MT_RULE_INDEX_KEY_, DO_GENL_MT_RULE_INDICES);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_kb_indexing_macros_file();
    }

    @Override
    public void initializeVariables() {
        init_kb_indexing_macros_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_kb_indexing_macros_file();
    }

    static {
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(makeSymbol("RESULT"), makeSymbol("INDEX"), makeSymbol("TERM"), makeSymbol("&REST"), makeSymbol("KEYS"));

    static private final SubLList $list_alt8 = list(ZERO_INTEGER);

    static private final SubLList $list_alt14 = list(list(makeSymbol("FIF"), makeSymbol("SUBINDEX"), list(makeSymbol("SUBINDEX-LEAF-COUNT"), makeSymbol("SUBINDEX")), ZERO_INTEGER));

    static private final SubLList $list_alt17 = list(makeSymbol("COUNT-VAR"), list(makeSymbol("FUNCTION"), makeSymbol("TERM"), makeSymbol("&REST"), makeSymbol("ARGS")));

    static private final SubLList $list_alt19 = list(makeSymbol("RELEVANT-MT?"), list(makeSymbol("ASSERTION-MT"), makeSymbol("ASS")));

    static private final SubLString $str_alt23$SET_RELEVANT_COMPLEX_INDEX_COUNT_ = makeString("SET-RELEVANT-COMPLEX-INDEX-COUNT called on an index (~s) without an mt layer");

    static private final SubLString $str_alt24$SET_RELEVANT_COMPLEX_INDEX_COUNT_ = makeString("SET-RELEVANT-COMPLEX-INDEX-COUNT called with too many arguments");

    static private final SubLList $list_alt33 = list(ONE_INTEGER);

    static private final SubLList $list_alt42 = list(makeSymbol("ALL-MT-SUBINDEX-KEYS-RELEVANT-P"));

    static private final SubLList $list_alt44 = list(makeSymbol("COUNT-VAR"), makeSymbol("CUTOFF"), list(makeSymbol("FUNCTION"), makeSymbol("TERM"), makeSymbol("&REST"), makeSymbol("ARGS")));

    static private final SubLList $list_alt48 = list(makeSymbol("RESULT"), makeSymbol("CUTOFF"), makeSymbol("INDEX"), makeSymbol("TERM"), makeSymbol("&REST"), makeSymbol("KEYS"));

    static private final SubLString $str_alt50$SET_RELEVANT_COMPLEX_INDEX_COUNT_ = makeString("SET-RELEVANT-COMPLEX-INDEX-COUNT-WITH-CUTOFF called on an index (~s) without an mt layer");

    static private final SubLString $str_alt51$SET_RELEVANT_COMPLEX_INDEX_COUNT_ = makeString("SET-RELEVANT-COMPLEX-INDEX-COUNT-WITH-CUTOFF called with too many arguments");

    static private final SubLList $list_alt62 = list(NIL);

    static private final SubLList $list_alt64 = list(list(makeSymbol("FWHEN"), list(makeSymbol("INTERMEDIATE-INDEX-P"), makeSymbol("NEXT-LEVEL-SUBINDEX")), list(makeSymbol("INTERMEDIATE-INDEX-KEYS"), makeSymbol("NEXT-LEVEL-SUBINDEX"))));

    static private final SubLList $list_alt83 = list(list(makeSymbol("ARGNUM"), makeSymbol("SUBINDEX"), makeSymbol("TERM"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt84 = list($DONE);

    static private final SubLList $list_alt90 = list(list(makeSymbol("ARGNUM"), makeSymbol("TERM"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt100 = list(list(makeSymbol("SENSE"), makeSymbol("SUBINDEX"), makeSymbol("PRED"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt103 = list(list(makeSymbol("SENSE"), makeSymbol("PRED"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt112 = list(list(makeSymbol("SENSE"), makeSymbol("SUBINDEX"), makeSymbol("COL"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt115 = list(list(makeSymbol("SENSE"), makeSymbol("COL"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
}

/**
 * Total time: 339 ms
 */
