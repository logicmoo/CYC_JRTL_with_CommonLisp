/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      NL-GENERATION-API-MACROS
 * source file: /cyc/top/cycl/nl-generation-api-macros.lisp
 * created:     2019/07/03 17:37:49
 */
public final class nl_generation_api_macros extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new nl_generation_api_macros();

 public static final String myName = "com.cyc.cycjava.cycl.nl_generation_api_macros";


    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol CYCL_TERM_TO_NL_STRING = makeSymbol("CYCL-TERM-TO-NL-STRING");

    static private final SubLList $list1 = list(makeSymbol("CYCL-TERM"), makeSymbol("&KEY"), list(makeSymbol("PPH-PARAMS"), makeKeyword("DEFAULT")));

    static private final SubLList $list2 = list(makeKeyword("PPH-PARAMS"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol CYCL_TERM_TO_NL_STRING_INTERNAL = makeSymbol("CYCL-TERM-TO-NL-STRING-INTERNAL");

    private static final SubLSymbol CYCL_TERM_TO_NL = makeSymbol("CYCL-TERM-TO-NL");

    private static final SubLSymbol CYCL_TERM_TO_NL_INTERNAL = makeSymbol("CYCL-TERM-TO-NL-INTERNAL");

    private static final SubLSymbol CYCL_TERMS_TO_NL = makeSymbol("CYCL-TERMS-TO-NL");

    static private final SubLList $list10 = list(makeSymbol("CYCL-TERM-LIST"), makeSymbol("&KEY"), list(makeSymbol("PPH-PARAMS"), makeKeyword("DEFAULT")));

    private static final SubLSymbol CYCL_TERMS_TO_NL_INTERNAL = makeSymbol("CYCL-TERMS-TO-NL-INTERNAL");

    private static final SubLSymbol CYCL_TERMS_TO_NL_STRINGS = makeSymbol("CYCL-TERMS-TO-NL-STRINGS");

    private static final SubLSymbol CYCL_TERMS_TO_NL_STRINGS_INTERNAL = makeSymbol("CYCL-TERMS-TO-NL-STRINGS-INTERNAL");

    private static final SubLSymbol CYCL_TERM_TO_SEARCH_QUERY = makeSymbol("CYCL-TERM-TO-SEARCH-QUERY");

    static private final SubLList $list15 = list(makeSymbol("CYCL-TERM"), makeSymbol("&KEY"), makeSymbol("ENGINE"), makeSymbol("MAX-WORDS"), list(makeSymbol("PPH-PARAMS"), makeKeyword("DEFAULT")));

    static private final SubLList $list16 = list(makeKeyword("ENGINE"), makeKeyword("MAX-WORDS"), makeKeyword("PPH-PARAMS"));

    private static final SubLSymbol CYCL_TERM_TO_SEARCH_QUERY_INTERNAL = makeSymbol("CYCL-TERM-TO-SEARCH-QUERY-INTERNAL");

    private static final SubLSymbol PPH_OUTPUT_MAP_TO_TEXT = makeSymbol("PPH-OUTPUT-MAP-TO-TEXT");

    static private final SubLList $list21 = list(makeSymbol("MAP"), makeSymbol("&KEY"), makeSymbol("USE-BULLETED-LISTS?"), list(makeSymbol("BULLETED-LIST-INDENT-LEVEL"), ZERO_INTEGER), makeSymbol("ALLOW-UTF8?"), makeSymbol("USE-BLANKS-FOR-VARS?"));

    static private final SubLList $list22 = list(makeKeyword("USE-BULLETED-LISTS?"), makeKeyword("BULLETED-LIST-INDENT-LEVEL"), makeKeyword("ALLOW-UTF8?"), makeKeyword("USE-BLANKS-FOR-VARS?"));

    private static final SubLSymbol $kw23$USE_BULLETED_LISTS_ = makeKeyword("USE-BULLETED-LISTS?");

    private static final SubLSymbol $BULLETED_LIST_INDENT_LEVEL = makeKeyword("BULLETED-LIST-INDENT-LEVEL");

    private static final SubLSymbol $kw26$USE_BLANKS_FOR_VARS_ = makeKeyword("USE-BLANKS-FOR-VARS?");

    private static final SubLSymbol PPH_OUTPUT_MAP_TO_TEXT_INTERNAL = makeSymbol("PPH-OUTPUT-MAP-TO-TEXT-INTERNAL");

    private static final SubLSymbol PPH_OUTPUT_MAP_TO_HTML = makeSymbol("PPH-OUTPUT-MAP-TO-HTML");

    static private final SubLList $list29 = list(makeSymbol("MAP"), makeSymbol("&KEY"), list(makeSymbol("TAG-FUNCTION"), list(QUOTE, makeSymbol("PPH-ANCHOR-TAGS-FOR-TERM"))), list(makeSymbol("USE-BULLETED-LISTS?"), T), list(makeSymbol("BULLETED-LIST-INDENT-LEVEL"), ZERO_INTEGER), list(makeSymbol("LINK-ARG0?"), T), list(makeSymbol("USE-BLANKS-FOR-VARS?"), NIL));

    static private final SubLList $list30 = list(makeKeyword("TAG-FUNCTION"), makeKeyword("USE-BULLETED-LISTS?"), makeKeyword("BULLETED-LIST-INDENT-LEVEL"), makeKeyword("LINK-ARG0?"), makeKeyword("USE-BLANKS-FOR-VARS?"));

    private static final SubLSymbol PPH_ANCHOR_TAGS_FOR_TERM = makeSymbol("PPH-ANCHOR-TAGS-FOR-TERM");

    private static final SubLSymbol PPH_OUTPUT_MAP_TO_HTML_INTERNAL = makeSymbol("PPH-OUTPUT-MAP-TO-HTML-INTERNAL");

    // Definitions
    /**
     *
     */
    public static final SubLObject cycl_term_to_nl_string_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject cycl_term = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt1);
            cycl_term = current.first();
            current = current.rest();
            {
                SubLObject allow_other_keys_p = NIL;
                SubLObject rest = current;
                SubLObject bad = NIL;
                SubLObject current_1 = NIL;
                for (; NIL != rest;) {
                    destructuring_bind_must_consp(rest, datum, $list_alt1);
                    current_1 = rest.first();
                    rest = rest.rest();
                    destructuring_bind_must_consp(rest, datum, $list_alt1);
                    if (NIL == member(current_1, $list_alt2, UNPROVIDED, UNPROVIDED)) {
                        bad = T;
                    }
                    if (current_1 == $ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                    cdestructuring_bind_error(datum, $list_alt1);
                }
                {
                    SubLObject pph_params_tail = property_list_member($PPH_PARAMS, current);
                    SubLObject pph_params = (NIL != pph_params_tail) ? ((SubLObject) (cadr(pph_params_tail))) : $DEFAULT;
                    return list(CYCL_TERM_TO_NL_STRING_INTERNAL, cycl_term, pph_params);
                }
            }
        }
    }

    // Definitions
    public static SubLObject cycl_term_to_nl_string(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject cycl_term = NIL;
        destructuring_bind_must_consp(current, datum, $list1);
        cycl_term = current.first();
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
        final SubLObject pph_params_tail = property_list_member($PPH_PARAMS, current);
        final SubLObject pph_params = (NIL != pph_params_tail) ? cadr(pph_params_tail) : $DEFAULT;
        return list(CYCL_TERM_TO_NL_STRING_INTERNAL, cycl_term, pph_params);
    }

    /**
     *
     */
    public static final SubLObject cycl_term_to_nl_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject cycl_term = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt1);
            cycl_term = current.first();
            current = current.rest();
            {
                SubLObject allow_other_keys_p = NIL;
                SubLObject rest = current;
                SubLObject bad = NIL;
                SubLObject current_2 = NIL;
                for (; NIL != rest;) {
                    destructuring_bind_must_consp(rest, datum, $list_alt1);
                    current_2 = rest.first();
                    rest = rest.rest();
                    destructuring_bind_must_consp(rest, datum, $list_alt1);
                    if (NIL == member(current_2, $list_alt2, UNPROVIDED, UNPROVIDED)) {
                        bad = T;
                    }
                    if (current_2 == $ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                    cdestructuring_bind_error(datum, $list_alt1);
                }
                {
                    SubLObject pph_params_tail = property_list_member($PPH_PARAMS, current);
                    SubLObject pph_params = (NIL != pph_params_tail) ? ((SubLObject) (cadr(pph_params_tail))) : $DEFAULT;
                    return list(CYCL_TERM_TO_NL_INTERNAL, cycl_term, pph_params);
                }
            }
        }
    }

    public static SubLObject cycl_term_to_nl(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject cycl_term = NIL;
        destructuring_bind_must_consp(current, datum, $list1);
        cycl_term = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list1);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list1);
            if (NIL == member(current_$2, $list2, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list1);
        }
        final SubLObject pph_params_tail = property_list_member($PPH_PARAMS, current);
        final SubLObject pph_params = (NIL != pph_params_tail) ? cadr(pph_params_tail) : $DEFAULT;
        return list(CYCL_TERM_TO_NL_INTERNAL, cycl_term, pph_params);
    }

    /**
     *
     */
    public static final SubLObject cycl_terms_to_nl_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject cycl_term_list = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt10);
            cycl_term_list = current.first();
            current = current.rest();
            {
                SubLObject allow_other_keys_p = NIL;
                SubLObject rest = current;
                SubLObject bad = NIL;
                SubLObject current_3 = NIL;
                for (; NIL != rest;) {
                    destructuring_bind_must_consp(rest, datum, $list_alt10);
                    current_3 = rest.first();
                    rest = rest.rest();
                    destructuring_bind_must_consp(rest, datum, $list_alt10);
                    if (NIL == member(current_3, $list_alt2, UNPROVIDED, UNPROVIDED)) {
                        bad = T;
                    }
                    if (current_3 == $ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                    cdestructuring_bind_error(datum, $list_alt10);
                }
                {
                    SubLObject pph_params_tail = property_list_member($PPH_PARAMS, current);
                    SubLObject pph_params = (NIL != pph_params_tail) ? ((SubLObject) (cadr(pph_params_tail))) : $DEFAULT;
                    return list(CYCL_TERMS_TO_NL_INTERNAL, cycl_term_list, pph_params);
                }
            }
        }
    }

    public static SubLObject cycl_terms_to_nl(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject cycl_term_list = NIL;
        destructuring_bind_must_consp(current, datum, $list10);
        cycl_term_list = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$3 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list10);
            current_$3 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list10);
            if (NIL == member(current_$3, $list2, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$3 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list10);
        }
        final SubLObject pph_params_tail = property_list_member($PPH_PARAMS, current);
        final SubLObject pph_params = (NIL != pph_params_tail) ? cadr(pph_params_tail) : $DEFAULT;
        return list(CYCL_TERMS_TO_NL_INTERNAL, cycl_term_list, pph_params);
    }

    /**
     *
     */
    public static final SubLObject cycl_terms_to_nl_strings_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject cycl_term_list = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt10);
            cycl_term_list = current.first();
            current = current.rest();
            {
                SubLObject allow_other_keys_p = NIL;
                SubLObject rest = current;
                SubLObject bad = NIL;
                SubLObject current_4 = NIL;
                for (; NIL != rest;) {
                    destructuring_bind_must_consp(rest, datum, $list_alt10);
                    current_4 = rest.first();
                    rest = rest.rest();
                    destructuring_bind_must_consp(rest, datum, $list_alt10);
                    if (NIL == member(current_4, $list_alt2, UNPROVIDED, UNPROVIDED)) {
                        bad = T;
                    }
                    if (current_4 == $ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                    cdestructuring_bind_error(datum, $list_alt10);
                }
                {
                    SubLObject pph_params_tail = property_list_member($PPH_PARAMS, current);
                    SubLObject pph_params = (NIL != pph_params_tail) ? ((SubLObject) (cadr(pph_params_tail))) : $DEFAULT;
                    return list(CYCL_TERMS_TO_NL_STRINGS_INTERNAL, cycl_term_list, pph_params);
                }
            }
        }
    }

    public static SubLObject cycl_terms_to_nl_strings(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject cycl_term_list = NIL;
        destructuring_bind_must_consp(current, datum, $list10);
        cycl_term_list = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$4 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list10);
            current_$4 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list10);
            if (NIL == member(current_$4, $list2, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$4 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list10);
        }
        final SubLObject pph_params_tail = property_list_member($PPH_PARAMS, current);
        final SubLObject pph_params = (NIL != pph_params_tail) ? cadr(pph_params_tail) : $DEFAULT;
        return list(CYCL_TERMS_TO_NL_STRINGS_INTERNAL, cycl_term_list, pph_params);
    }

    /**
     *
     */
    public static final SubLObject cycl_term_to_search_query_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject cycl_term = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt15);
            cycl_term = current.first();
            current = current.rest();
            {
                SubLObject allow_other_keys_p = NIL;
                SubLObject rest = current;
                SubLObject bad = NIL;
                SubLObject current_5 = NIL;
                for (; NIL != rest;) {
                    destructuring_bind_must_consp(rest, datum, $list_alt15);
                    current_5 = rest.first();
                    rest = rest.rest();
                    destructuring_bind_must_consp(rest, datum, $list_alt15);
                    if (NIL == member(current_5, $list_alt16, UNPROVIDED, UNPROVIDED)) {
                        bad = T;
                    }
                    if (current_5 == $ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                    cdestructuring_bind_error(datum, $list_alt15);
                }
                {
                    SubLObject engine_tail = property_list_member($ENGINE, current);
                    SubLObject engine = (NIL != engine_tail) ? ((SubLObject) (cadr(engine_tail))) : NIL;
                    SubLObject max_words_tail = property_list_member($MAX_WORDS, current);
                    SubLObject max_words = (NIL != max_words_tail) ? ((SubLObject) (cadr(max_words_tail))) : NIL;
                    SubLObject pph_params_tail = property_list_member($PPH_PARAMS, current);
                    SubLObject pph_params = (NIL != pph_params_tail) ? ((SubLObject) (cadr(pph_params_tail))) : $DEFAULT;
                    return list(CYCL_TERM_TO_SEARCH_QUERY_INTERNAL, cycl_term, engine, max_words, pph_params);
                }
            }
        }
    }

    public static SubLObject cycl_term_to_search_query(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject cycl_term = NIL;
        destructuring_bind_must_consp(current, datum, $list15);
        cycl_term = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$5 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list15);
            current_$5 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list15);
            if (NIL == member(current_$5, $list16, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$5 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list15);
        }
        final SubLObject engine_tail = property_list_member($ENGINE, current);
        final SubLObject engine = (NIL != engine_tail) ? cadr(engine_tail) : NIL;
        final SubLObject max_words_tail = property_list_member($MAX_WORDS, current);
        final SubLObject max_words = (NIL != max_words_tail) ? cadr(max_words_tail) : NIL;
        final SubLObject pph_params_tail = property_list_member($PPH_PARAMS, current);
        final SubLObject pph_params = (NIL != pph_params_tail) ? cadr(pph_params_tail) : $DEFAULT;
        return list(CYCL_TERM_TO_SEARCH_QUERY_INTERNAL, cycl_term, engine, max_words, pph_params);
    }

    /**
     * Get the plaintext string for a given pph-output-map
     */
    @LispMethod(comment = "Get the plaintext string for a given pph-output-map")
    public static final SubLObject pph_output_map_to_text_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject map = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt21);
            map = current.first();
            current = current.rest();
            {
                SubLObject allow_other_keys_p = NIL;
                SubLObject rest = current;
                SubLObject bad = NIL;
                SubLObject current_6 = NIL;
                for (; NIL != rest;) {
                    destructuring_bind_must_consp(rest, datum, $list_alt21);
                    current_6 = rest.first();
                    rest = rest.rest();
                    destructuring_bind_must_consp(rest, datum, $list_alt21);
                    if (NIL == member(current_6, $list_alt22, UNPROVIDED, UNPROVIDED)) {
                        bad = T;
                    }
                    if (current_6 == $ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                    cdestructuring_bind_error(datum, $list_alt21);
                }
                {
                    SubLObject use_bulleted_listsP_tail = property_list_member($kw23$USE_BULLETED_LISTS_, current);
                    SubLObject use_bulleted_listsP = (NIL != use_bulleted_listsP_tail) ? ((SubLObject) (cadr(use_bulleted_listsP_tail))) : NIL;
                    SubLObject bulleted_list_indent_level_tail = property_list_member($BULLETED_LIST_INDENT_LEVEL, current);
                    SubLObject bulleted_list_indent_level = (NIL != bulleted_list_indent_level_tail) ? ((SubLObject) (cadr(bulleted_list_indent_level_tail))) : ZERO_INTEGER;
                    SubLObject allow_utf8P_tail = property_list_member($ALLOW_UTF8_, current);
                    SubLObject allow_utf8P = (NIL != allow_utf8P_tail) ? ((SubLObject) (cadr(allow_utf8P_tail))) : NIL;
                    SubLObject use_blanks_for_varsP_tail = property_list_member($kw26$USE_BLANKS_FOR_VARS_, current);
                    SubLObject use_blanks_for_varsP = (NIL != use_blanks_for_varsP_tail) ? ((SubLObject) (cadr(use_blanks_for_varsP_tail))) : NIL;
                    return list(PPH_OUTPUT_MAP_TO_TEXT_INTERNAL, map, use_bulleted_listsP, bulleted_list_indent_level, allow_utf8P, use_blanks_for_varsP);
                }
            }
        }
    }

    /**
     * Get the plaintext string for a given pph-output-map
     */
    @LispMethod(comment = "Get the plaintext string for a given pph-output-map")
    public static SubLObject pph_output_map_to_text(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject map = NIL;
        destructuring_bind_must_consp(current, datum, $list21);
        map = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$6 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list21);
            current_$6 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list21);
            if (NIL == member(current_$6, $list22, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$6 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list21);
        }
        final SubLObject use_bulleted_listsP_tail = property_list_member($kw23$USE_BULLETED_LISTS_, current);
        final SubLObject use_bulleted_listsP = (NIL != use_bulleted_listsP_tail) ? cadr(use_bulleted_listsP_tail) : NIL;
        final SubLObject bulleted_list_indent_level_tail = property_list_member($BULLETED_LIST_INDENT_LEVEL, current);
        final SubLObject bulleted_list_indent_level = (NIL != bulleted_list_indent_level_tail) ? cadr(bulleted_list_indent_level_tail) : ZERO_INTEGER;
        final SubLObject allow_utf8P_tail = property_list_member($ALLOW_UTF8_, current);
        final SubLObject allow_utf8P = (NIL != allow_utf8P_tail) ? cadr(allow_utf8P_tail) : NIL;
        final SubLObject use_blanks_for_varsP_tail = property_list_member($kw26$USE_BLANKS_FOR_VARS_, current);
        final SubLObject use_blanks_for_varsP = (NIL != use_blanks_for_varsP_tail) ? cadr(use_blanks_for_varsP_tail) : NIL;
        return list(PPH_OUTPUT_MAP_TO_TEXT_INTERNAL, map, use_bulleted_listsP, bulleted_list_indent_level, allow_utf8P, use_blanks_for_varsP);
    }

    /**
     * Get the html string for a given pph-output-map
     */
    @LispMethod(comment = "Get the html string for a given pph-output-map")
    public static final SubLObject pph_output_map_to_html_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject map = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt29);
            map = current.first();
            current = current.rest();
            {
                SubLObject allow_other_keys_p = NIL;
                SubLObject rest = current;
                SubLObject bad = NIL;
                SubLObject current_7 = NIL;
                for (; NIL != rest;) {
                    destructuring_bind_must_consp(rest, datum, $list_alt29);
                    current_7 = rest.first();
                    rest = rest.rest();
                    destructuring_bind_must_consp(rest, datum, $list_alt29);
                    if (NIL == member(current_7, $list_alt30, UNPROVIDED, UNPROVIDED)) {
                        bad = T;
                    }
                    if (current_7 == $ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                    cdestructuring_bind_error(datum, $list_alt29);
                }
                {
                    SubLObject tag_function_tail = property_list_member($TAG_FUNCTION, current);
                    SubLObject tag_function = (NIL != tag_function_tail) ? ((SubLObject) (cadr(tag_function_tail))) : PPH_ANCHOR_TAGS_FOR_TERM;
                    SubLObject use_bulleted_listsP_tail = property_list_member($kw23$USE_BULLETED_LISTS_, current);
                    SubLObject use_bulleted_listsP = (NIL != use_bulleted_listsP_tail) ? ((SubLObject) (cadr(use_bulleted_listsP_tail))) : T;
                    SubLObject bulleted_list_indent_level_tail = property_list_member($BULLETED_LIST_INDENT_LEVEL, current);
                    SubLObject bulleted_list_indent_level = (NIL != bulleted_list_indent_level_tail) ? ((SubLObject) (cadr(bulleted_list_indent_level_tail))) : ZERO_INTEGER;
                    SubLObject link_arg0P_tail = property_list_member($LINK_ARG0_, current);
                    SubLObject link_arg0P = (NIL != link_arg0P_tail) ? ((SubLObject) (cadr(link_arg0P_tail))) : T;
                    SubLObject use_blanks_for_varsP_tail = property_list_member($kw26$USE_BLANKS_FOR_VARS_, current);
                    SubLObject use_blanks_for_varsP = (NIL != use_blanks_for_varsP_tail) ? ((SubLObject) (cadr(use_blanks_for_varsP_tail))) : NIL;
                    return list(PPH_OUTPUT_MAP_TO_HTML_INTERNAL, map, list(QUOTE, tag_function), use_bulleted_listsP, bulleted_list_indent_level, link_arg0P, use_blanks_for_varsP);
                }
            }
        }
    }

    /**
     * Get the html string for a given pph-output-map
     */
    @LispMethod(comment = "Get the html string for a given pph-output-map")
    public static SubLObject pph_output_map_to_html(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject map = NIL;
        destructuring_bind_must_consp(current, datum, $list29);
        map = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$7 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list29);
            current_$7 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list29);
            if (NIL == member(current_$7, $list30, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$7 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list29);
        }
        final SubLObject tag_function_tail = property_list_member($TAG_FUNCTION, current);
        final SubLObject tag_function = (NIL != tag_function_tail) ? cadr(tag_function_tail) : PPH_ANCHOR_TAGS_FOR_TERM;
        final SubLObject use_bulleted_listsP_tail = property_list_member($kw23$USE_BULLETED_LISTS_, current);
        final SubLObject use_bulleted_listsP = (NIL != use_bulleted_listsP_tail) ? cadr(use_bulleted_listsP_tail) : T;
        final SubLObject bulleted_list_indent_level_tail = property_list_member($BULLETED_LIST_INDENT_LEVEL, current);
        final SubLObject bulleted_list_indent_level = (NIL != bulleted_list_indent_level_tail) ? cadr(bulleted_list_indent_level_tail) : ZERO_INTEGER;
        final SubLObject link_arg0P_tail = property_list_member($LINK_ARG0_, current);
        final SubLObject link_arg0P = (NIL != link_arg0P_tail) ? cadr(link_arg0P_tail) : T;
        final SubLObject use_blanks_for_varsP_tail = property_list_member($kw26$USE_BLANKS_FOR_VARS_, current);
        final SubLObject use_blanks_for_varsP = (NIL != use_blanks_for_varsP_tail) ? cadr(use_blanks_for_varsP_tail) : NIL;
        return list(PPH_OUTPUT_MAP_TO_HTML_INTERNAL, map, list(QUOTE, tag_function), use_bulleted_listsP, bulleted_list_indent_level, link_arg0P, use_blanks_for_varsP);
    }

    public static SubLObject declare_nl_generation_api_macros_file() {
        declareMacro("cycl_term_to_nl_string", "CYCL-TERM-TO-NL-STRING");
        declareMacro("cycl_term_to_nl", "CYCL-TERM-TO-NL");
        declareMacro("cycl_terms_to_nl", "CYCL-TERMS-TO-NL");
        declareMacro("cycl_terms_to_nl_strings", "CYCL-TERMS-TO-NL-STRINGS");
        declareMacro("cycl_term_to_search_query", "CYCL-TERM-TO-SEARCH-QUERY");
        declareMacro("pph_output_map_to_text", "PPH-OUTPUT-MAP-TO-TEXT");
        declareMacro("pph_output_map_to_html", "PPH-OUTPUT-MAP-TO-HTML");
        return NIL;
    }

    static private final SubLList $list_alt1 = list(makeSymbol("CYCL-TERM"), makeSymbol("&KEY"), list(makeSymbol("PPH-PARAMS"), makeKeyword("DEFAULT")));

    public static SubLObject init_nl_generation_api_macros_file() {
        return NIL;
    }

    public static SubLObject setup_nl_generation_api_macros_file() {
        register_external_symbol(CYCL_TERM_TO_NL_STRING);
        register_external_symbol(CYCL_TERM_TO_NL);
        register_external_symbol(CYCL_TERMS_TO_NL);
        register_external_symbol(CYCL_TERMS_TO_NL_STRINGS);
        register_external_symbol(CYCL_TERM_TO_SEARCH_QUERY);
        register_external_symbol(PPH_OUTPUT_MAP_TO_TEXT);
        register_external_symbol(PPH_OUTPUT_MAP_TO_HTML);
        return NIL;
    }

    static private final SubLList $list_alt2 = list(makeKeyword("PPH-PARAMS"));

    @Override
    public void declareFunctions() {
        declare_nl_generation_api_macros_file();
    }

    @Override
    public void initializeVariables() {
        init_nl_generation_api_macros_file();
    }

    static private final SubLList $list_alt10 = list(makeSymbol("CYCL-TERM-LIST"), makeSymbol("&KEY"), list(makeSymbol("PPH-PARAMS"), makeKeyword("DEFAULT")));

    @Override
    public void runTopLevelForms() {
        setup_nl_generation_api_macros_file();
    }

    static {
    }

    static private final SubLList $list_alt15 = list(makeSymbol("CYCL-TERM"), makeSymbol("&KEY"), makeSymbol("ENGINE"), makeSymbol("MAX-WORDS"), list(makeSymbol("PPH-PARAMS"), makeKeyword("DEFAULT")));

    static private final SubLList $list_alt16 = list(makeKeyword("ENGINE"), makeKeyword("MAX-WORDS"), makeKeyword("PPH-PARAMS"));

    static private final SubLList $list_alt21 = list(makeSymbol("MAP"), makeSymbol("&KEY"), makeSymbol("USE-BULLETED-LISTS?"), list(makeSymbol("BULLETED-LIST-INDENT-LEVEL"), ZERO_INTEGER), makeSymbol("ALLOW-UTF8?"), makeSymbol("USE-BLANKS-FOR-VARS?"));

    static private final SubLList $list_alt22 = list(makeKeyword("USE-BULLETED-LISTS?"), makeKeyword("BULLETED-LIST-INDENT-LEVEL"), makeKeyword("ALLOW-UTF8?"), makeKeyword("USE-BLANKS-FOR-VARS?"));

    static private final SubLList $list_alt29 = list(makeSymbol("MAP"), makeSymbol("&KEY"), list(makeSymbol("TAG-FUNCTION"), list(QUOTE, makeSymbol("PPH-ANCHOR-TAGS-FOR-TERM"))), list(makeSymbol("USE-BULLETED-LISTS?"), T), list(makeSymbol("BULLETED-LIST-INDENT-LEVEL"), ZERO_INTEGER), list(makeSymbol("LINK-ARG0?"), T), list(makeSymbol("USE-BLANKS-FOR-VARS?"), NIL));

    static private final SubLList $list_alt30 = list(makeKeyword("TAG-FUNCTION"), makeKeyword("USE-BULLETED-LISTS?"), makeKeyword("BULLETED-LIST-INDENT-LEVEL"), makeKeyword("LINK-ARG0?"), makeKeyword("USE-BLANKS-FOR-VARS?"));
}

/**
 * Total time: 117 ms
 */
