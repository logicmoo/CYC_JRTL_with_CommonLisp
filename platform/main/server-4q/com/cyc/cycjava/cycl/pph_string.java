package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.pph_string;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.*;
import static com.cyc.cycjava.cycl.pph_string.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_o;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUALP;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.IDENTITY;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class pph_string extends SubLTranslatedFile {
    public static final SubLFile me = new pph_string();

    public static final String myName = "com.cyc.cycjava.cycl.pph_string";

    public static final String myFingerPrint = "5661bd411fab9aaf0b548258695e5a22862c139900a7cff4b1bb8d82347669bc";

    // deflexical
    private static final SubLSymbol $pph_string_from_utf8_string_caching_state$ = makeSymbol("*PPH-STRING-FROM-UTF8-STRING-CACHING-STATE*");

    // deflexical
    private static final SubLSymbol $pph_space_vector$ = makeSymbol("*PPH-SPACE-VECTOR*");

    // defparameter
    private static final SubLSymbol $pph_canonicalize_on_bungeP$ = makeSymbol("*PPH-CANONICALIZE-ON-BUNGE?*");

    private static final SubLList $list0 = list(list(makeSymbol("CHAR"), makeSymbol("STRING"), makeSymbol("&KEY"), list(makeSymbol("START"), ZERO_INTEGER), makeSymbol("END"), makeSymbol("CHAR-NUM"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list1 = list(makeKeyword("START"), makeKeyword("END"), makeKeyword("CHAR-NUM"), makeKeyword("DONE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");









    private static final SubLSymbol $sym7$ITEM = makeUninternedSymbol("ITEM");

    private static final SubLSymbol DO_SEQUENCE = makeSymbol("DO-SEQUENCE");









    private static final SubLSymbol $sym13$_ = makeSymbol("<");



    private static final SubLSymbol $sym15$__ = makeSymbol(">=");







    private static final SubLSymbol PPH_CODE_CHAR = makeSymbol("PPH-CODE-CHAR");

    private static final SubLSymbol PPH_STRING_FROM_UTF8_STRING = makeSymbol("PPH-STRING-FROM-UTF8-STRING");

    private static final SubLSymbol $sym21$_PPH_STRING_FROM_UTF8_STRING_CACHING_STATE_ = makeSymbol("*PPH-STRING-FROM-UTF8-STRING-CACHING-STATE*");



    private static final SubLString $str23$_PPH_error_level_ = makeString("(PPH error level ");

    private static final SubLString $str24$__ = makeString(") ");

    private static final SubLString $str25$Can_t_make_a_PPH_string_from__S = makeString("Can't make a PPH string from ~S");

    private static final SubLSymbol PPH_CHAR_CODE = makeSymbol("PPH-CHAR-CODE");



    private static final SubLObject $ic28 = vector(EMPTY_SUBL_OBJECT_ARRAY);

    private static final SubLString $str29$ = makeString("");

    private static final SubLSymbol $sym30$NON_EMPTY_PPH_STRING_ = makeSymbol("NON-EMPTY-PPH-STRING?");



    private static final SubLObject $ic32 = vector(EMPTY_SUBL_OBJECT_ARRAY);



    private static final SubLSymbol PPH_STRING_P = makeSymbol("PPH-STRING-P");







    private static final SubLList $list38 = list(makeSymbol("PPH-TEST-CASE-TABLES"), makeSymbol("PPH-STRING-TEST-CASE-TABLES"));







    private static final SubLList $list42 = list(list(list(makeString("")), T), list(list(vector(EMPTY_SUBL_OBJECT_ARRAY)), T), list(list(makeString("foo")), T), list(list(vector(new SubLObject[]{ makeInteger(32879), makeInteger(37030), makeInteger(24555), makeInteger(36958) })), T), list(list(list(reader_make_constant_shell(makeString("UnicodeStringFn")), makeString("&u806F;&u90A6;&u5FEB;&u905E;"))), NIL));

    private static final SubLList $list43 = list(list(list(makeString("")), NIL), list(list(vector(EMPTY_SUBL_OBJECT_ARRAY)), NIL), list(list(makeString("foo")), T), list(list(vector(new SubLObject[]{ makeInteger(32879), makeInteger(37030), makeInteger(24555), makeInteger(36958) })), T), list(list(list(reader_make_constant_shell(makeString("UnicodeStringFn")), makeString("&u806F;&u90A6;&u5FEB;&u905E;"))), NIL));

    private static final SubLSymbol PPH_STRING_TO_OUTPUT_FORMAT = makeSymbol("PPH-STRING-TO-OUTPUT-FORMAT");

    private static final SubLList $list45 = list(list(list(makeString("")), makeString("")), list(list(vector(EMPTY_SUBL_OBJECT_ARRAY)), makeString("")), list(list(makeString("foo")), makeString("foo")), list(list(vector(new SubLObject[]{ makeInteger(32879), makeInteger(37030), makeInteger(24555), makeInteger(36958) }), makeKeyword("TEXT")), list(reader_make_constant_shell(makeString("UnicodeStringFn")), makeString("&u806F;&u90A6;&u5FEB;&u905E;"))));

    private static final SubLSymbol PPH_STRING_COPY = makeSymbol("PPH-STRING-COPY");

    private static final SubLSymbol $sym47$PPH_STRING_EQUAL_ = makeSymbol("PPH-STRING-EQUAL?");

    private static final SubLList $list48 = list(list(list(makeString("")), makeString("")), list(list(vector(EMPTY_SUBL_OBJECT_ARRAY)), vector(EMPTY_SUBL_OBJECT_ARRAY)), list(list(makeString("foo")), makeString("foo")), list(list(vector(new SubLObject[]{ makeInteger(102), makeInteger(111), makeInteger(111) })), makeString("foo")), list(list(vector(new SubLObject[]{ makeInteger(32879), makeInteger(37030), makeInteger(24555), makeInteger(36958) })), vector(new SubLObject[]{ makeInteger(32879), makeInteger(37030), makeInteger(24555), makeInteger(36958) })));

    private static final SubLSymbol $sym49$PPH_STRING_FIND_IF_ = makeSymbol("PPH-STRING-FIND-IF?");

    private static final SubLList $list50 = list(list(list(makeSymbol("CHARACTERP"), makeString("")), NIL), list(list(makeSymbol("CHARACTERP"), vector(EMPTY_SUBL_OBJECT_ARRAY)), NIL), list(list(makeSymbol("ALPHANUMERIC-CHAR-P"), makeString("foo")), T), list(list(makeSymbol("ALPHANUMERIC-CHAR-P"), vector(new SubLObject[]{ makeInteger(102), makeInteger(111), makeInteger(111) })), T), list(list(makeSymbol("NON-ASCII-CHAR-P"), vector(new SubLObject[]{ makeInteger(128), makeInteger(37030), makeInteger(24555), makeInteger(36958) })), T));

    private static final SubLSymbol PPH_STRING_POSITION = makeSymbol("PPH-STRING-POSITION");

    private static final SubLList $list52 = list(list(list(CHAR_o, makeString("foo")), ONE_INTEGER), list(list(CHAR_o, vector(new SubLObject[]{ makeInteger(102), makeInteger(111), makeInteger(111) })), ONE_INTEGER));

    private static final SubLList $list53 = list(list(list(makeString(""), makeString("")), T), list(list(vector(EMPTY_SUBL_OBJECT_ARRAY), vector(EMPTY_SUBL_OBJECT_ARRAY)), T), list(list(makeString("foo"), makeString("foo")), T), list(list(makeString("foo"), vector(new SubLObject[]{ makeInteger(102), makeInteger(111), makeInteger(111) })), T), list(list(vector(new SubLObject[]{ makeInteger(102), makeInteger(111), makeInteger(111) }), makeString("foo")), T), list(list(vector(new SubLObject[]{ makeInteger(32879), makeInteger(37030), makeInteger(24555), makeInteger(36958) }), vector(new SubLObject[]{ makeInteger(32879), makeInteger(37030), makeInteger(24555), makeInteger(36958) })), T));

    private static final SubLSymbol PPH_STRING_DOWNCASE = makeSymbol("PPH-STRING-DOWNCASE");

    private static final SubLList $list55 = list(list(list(makeString("")), makeString("")), list(list(vector(EMPTY_SUBL_OBJECT_ARRAY)), vector(EMPTY_SUBL_OBJECT_ARRAY)), list(list(makeString("Foo")), makeString("foo")), list(list(vector(new SubLObject[]{ makeInteger(70), makeInteger(111), makeInteger(111) })), vector(new SubLObject[]{ makeInteger(102), makeInteger(111), makeInteger(111) })), list(list(vector(new SubLObject[]{ makeInteger(32879), makeInteger(37030), makeInteger(24555), makeInteger(36958) })), vector(new SubLObject[]{ makeInteger(32879), makeInteger(37030), makeInteger(24555), makeInteger(36958) })));

    private static final SubLSymbol PPH_STRING_FROM_CYCL_STRING = makeSymbol("PPH-STRING-FROM-CYCL-STRING");

    private static final SubLList $list57 = list(list(list(makeString("")), makeString("")), list(list(makeString("foo")), makeString("foo")), list(list(list(reader_make_constant_shell(makeString("UnicodeStringFn")), makeString("&u806F;&u90A6;&u5FEB;&u905E;"))), vector(new SubLObject[]{ makeInteger(32879), makeInteger(37030), makeInteger(24555), makeInteger(36958) })));

    private static final SubLSymbol PPH_STRING_STARTS_WITH = makeSymbol("PPH-STRING-STARTS-WITH");

    private static final SubLList $list59 = list(list(list(makeString(""), makeString("")), T), list(list(vector(EMPTY_SUBL_OBJECT_ARRAY), makeString("")), T), list(list(makeString("foo"), makeString("foo")), T), list(list(makeString("foo"), makeString("fo")), T), list(list(makeString("foo"), makeString("")), T), list(list(vector(new SubLObject[]{ makeInteger(102), makeInteger(111), makeInteger(111), makeInteger(32), makeInteger(32879), makeInteger(37030), makeInteger(24555), makeInteger(36958) }), makeString("foo")), T));

    private static final SubLSymbol PPH_STRING_ENDS_WITH = makeSymbol("PPH-STRING-ENDS-WITH");

    private static final SubLList $list61 = list(list(list(makeString(""), makeString("")), T), list(list(vector(EMPTY_SUBL_OBJECT_ARRAY), makeString("")), T), list(list(makeString("foo"), makeString("foo")), T), list(list(makeString("foo"), makeString("oo")), T), list(list(makeString("foo"), makeString("")), T), list(list(vector(new SubLObject[]{ makeInteger(32879), makeInteger(37030), makeInteger(24555), makeInteger(36958), makeInteger(32), makeInteger(102), makeInteger(111), makeInteger(111) }), makeString("foo")), T));

    private static final SubLSymbol $sym62$PPH_SUBSTRING_ = makeSymbol("PPH-SUBSTRING?");

    private static final SubLList $list63 = list(new SubLObject[]{ list(list(makeString(""), makeString("")), T), list(list(vector(EMPTY_SUBL_OBJECT_ARRAY), makeString("")), T), list(list(makeString(""), vector(EMPTY_SUBL_OBJECT_ARRAY)), T), list(list(makeString("foo"), makeString("foo")), T), list(list(vector(new SubLObject[]{ makeInteger(102), makeInteger(111), makeInteger(111) }), makeString("foo")), T), list(list(makeString("foo"), vector(new SubLObject[]{ makeInteger(102), makeInteger(111), makeInteger(111) })), T), list(list(makeString("fo"), makeString("foo")), T), list(list(makeString(""), makeString("foo")), T), list(list(makeString("foo"), makeString("")), NIL), list(list(makeString("o"), makeString("foo")), T), list(list(makeString("q"), makeString("foo")), NIL), list(list(makeString("foo"), vector(new SubLObject[]{ makeInteger(102), makeInteger(111), makeInteger(111), makeInteger(32), makeInteger(32879), makeInteger(37030), makeInteger(24555), makeInteger(36958) })), T) });

    private static final SubLSymbol PPH_SUBSTRING = makeSymbol("PPH-SUBSTRING");

    private static final SubLList $list65 = list(new SubLObject[]{ list(list(makeString(""), ZERO_INTEGER), makeString("")), list(list(makeString(""), ZERO_INTEGER, ZERO_INTEGER), vector(EMPTY_SUBL_OBJECT_ARRAY)), list(list(vector(EMPTY_SUBL_OBJECT_ARRAY), ZERO_INTEGER), makeString("")), list(list(makeString("foo"), ZERO_INTEGER), makeString("foo")), list(list(makeString("foo"), ZERO_INTEGER), vector(new SubLObject[]{ makeInteger(102), makeInteger(111), makeInteger(111) })), list(list(vector(new SubLObject[]{ makeInteger(102), makeInteger(111), makeInteger(111) }), ZERO_INTEGER, THREE_INTEGER), makeString("foo")), list(list(makeString("foo"), ZERO_INTEGER, TWO_INTEGER), makeString("fo")), list(list(makeString("foo"), ZERO_INTEGER, ZERO_INTEGER), makeString("")), list(list(makeString("foo"), ONE_INTEGER, ONE_INTEGER), makeString("")), list(list(makeString("foo"), ONE_INTEGER, TWO_INTEGER), makeString("o")), list(list(vector(new SubLObject[]{ makeInteger(102), makeInteger(111), makeInteger(111), makeInteger(32), makeInteger(32879), makeInteger(37030), makeInteger(24555), makeInteger(36958) }), ZERO_INTEGER, THREE_INTEGER), makeString("foo")) });

    private static final SubLSymbol $sym66$_EXIT = makeSymbol("%EXIT");

    private static final SubLSymbol PPH_CANONICALIZING_BUNGE = makeSymbol("PPH-CANONICALIZING-BUNGE");

    private static final SubLList $list68 = list(list(list(list(makeString(""))), vector(EMPTY_SUBL_OBJECT_ARRAY)), list(list(list(vector(EMPTY_SUBL_OBJECT_ARRAY), makeString(""))), vector(EMPTY_SUBL_OBJECT_ARRAY)), list(list(list(makeString("foo"), makeString("foo"))), vector(new SubLObject[]{ makeInteger(102), makeInteger(111), makeInteger(111), makeInteger(32), makeInteger(102), makeInteger(111), makeInteger(111) })), list(list(list(makeString("foo"), makeString("oo"))), vector(new SubLObject[]{ makeInteger(102), makeInteger(111), makeInteger(111), makeInteger(32), makeInteger(111), makeInteger(111) })), list(list(list(makeString("foo"))), vector(new SubLObject[]{ makeInteger(102), makeInteger(111), makeInteger(111) })), list(list(list(vector(new SubLObject[]{ makeInteger(32879), makeInteger(37030), makeInteger(24555), makeInteger(36958) }), makeString("foo"))), vector(new SubLObject[]{ makeInteger(32879), makeInteger(37030), makeInteger(24555), makeInteger(36958), makeInteger(32), makeInteger(102), makeInteger(111), makeInteger(111) })));

    private static final SubLSymbol PPH_NONCANONICALIZING_BUNGE = makeSymbol("PPH-NONCANONICALIZING-BUNGE");

    private static final SubLList $list70 = list(list(list(list(makeString(""))), makeString("")), list(list(list(makeString(""), makeString(""))), makeString("")), list(list(list(vector(EMPTY_SUBL_OBJECT_ARRAY), makeString(""))), makeString("")), list(list(list(makeString("foo"), makeString("foo"))), makeString("foo foo")), list(list(list(makeString("foo"), makeString("oo"))), makeString("foo oo")), list(list(list(makeString("foo"))), makeString("foo")), list(list(list(vector(new SubLObject[]{ makeInteger(32879), makeInteger(37030), makeInteger(24555), makeInteger(36958) }), makeString("foo"))), vector(new SubLObject[]{ makeInteger(32879), makeInteger(37030), makeInteger(24555), makeInteger(36958), makeInteger(32), makeInteger(102), makeInteger(111), makeInteger(111) })));

    public static SubLObject do_pph_string(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject v_char = NIL;
        SubLObject string = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        v_char = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        string = current.first();
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
        final SubLObject start_tail = property_list_member($START, current);
        final SubLObject start = (NIL != start_tail) ? cadr(start_tail) : ZERO_INTEGER;
        final SubLObject end_tail = property_list_member($END, current);
        final SubLObject end = (NIL != end_tail) ? cadr(end_tail) : NIL;
        final SubLObject char_num_tail = property_list_member($CHAR_NUM, current);
        final SubLObject char_num = (NIL != char_num_tail) ? cadr(char_num_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject item = $sym7$ITEM;
        return list(DO_SEQUENCE, list(item, string, $ELEMENT_NUM, char_num, $DONE, done), list(PCOND, list(list(CAND, list(INTEGERP, char_num), list($sym13$_, char_num, start)), list(IGNORE, item)), list(list(CAND, list(INTEGERP, end), list(INTEGERP, char_num), list($sym15$__, char_num, end)), list(IGNORE, item)), list(T, listS(CLET, list(list(v_char, list(FIF, list(CHARACTERP, item), item, list(PPH_CODE_CHAR, item)))), append(body, NIL)))));
    }

    public static SubLObject pph_string_p(final SubLObject obj) {
        return makeBoolean((NIL != unicode_strings.ascii_string_p(obj)) || (NIL != unicode_strings.unicode_vector_string_p(obj)));
    }

    public static SubLObject clear_pph_string_from_utf8_string() {
        final SubLObject cs = $pph_string_from_utf8_string_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_pph_string_from_utf8_string(final SubLObject utf8_string) {
        return memoization_state.caching_state_remove_function_results_with_args($pph_string_from_utf8_string_caching_state$.getGlobalValue(), list(utf8_string), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject pph_string_from_utf8_string_internal(final SubLObject utf8_string) {
        return NIL != unicode_strings.non_ascii_string_p(utf8_string) ? pph_string_from_cycl_string(unicode_nauts.utf8_string_to_cycl_safe_string(utf8_string)) : utf8_string;
    }

    public static SubLObject pph_string_from_utf8_string(final SubLObject utf8_string) {
        SubLObject caching_state = $pph_string_from_utf8_string_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(PPH_STRING_FROM_UTF8_STRING, $sym21$_PPH_STRING_FROM_UTF8_STRING_CACHING_STATE_, $int$256, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, utf8_string, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(pph_string_from_utf8_string_internal(utf8_string)));
            memoization_state.caching_state_put(caching_state, utf8_string, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject pph_string_from_unicode_naut(final SubLObject naut) {
        return unicode_strings.display_to_unicode_vector(cycl_utilities.nat_arg1(naut, UNPROVIDED));
    }

    public static SubLObject pph_string_from_cycl_string(final SubLObject v_cycl_string) {
        if (v_cycl_string.isString()) {
            return v_cycl_string;
        }
        if (NIL != unicode_nauts.unicode_naut_p(v_cycl_string, UNPROVIDED)) {
            return pph_string_from_unicode_naut(v_cycl_string);
        }
        final SubLObject new_format_string = cconcatenate($str23$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str24$__, format_nil.format_nil_a_no_copy($str25$Can_t_make_a_PPH_string_from__S) });
        pph_error.pph_handle_error(new_format_string, list(v_cycl_string));
        return NIL;
    }

    public static SubLObject pph_string_starts_with(final SubLObject string, final SubLObject start, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUAL);
        }
        if (string.isString()) {
            return string_utilities.starts_with_by_test(string, start, test);
        }
        return string_utilities.starts_with_by_test(unicode_strings.utf8_vector_to_utf8_string(unicode_strings.unicode_vector_to_utf8_vector(string, UNPROVIDED, UNPROVIDED)), start, test);
    }

    public static SubLObject pph_string_ends_with(final SubLObject string, final SubLObject end, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUAL);
        }
        if (string.isString()) {
            return string_utilities.ends_with(string, end, test);
        }
        return string_utilities.ends_with(unicode_strings.utf8_vector_to_utf8_string(unicode_strings.unicode_vector_to_utf8_vector(string, UNPROVIDED, UNPROVIDED)), end, test);
    }

    public static SubLObject pph_string_pre_remove(final SubLObject string, final SubLObject start, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUAL);
        }
        if (NIL != pph_string_starts_with(string, start, test)) {
            return subseq(string, length(start), UNPROVIDED);
        }
        return string;
    }

    public static SubLObject pph_string_copy(final SubLObject string) {
        return copy_seq(string);
    }

    public static SubLObject pph_char_downcase(final SubLObject v_char) {
        if (v_char.isChar()) {
            return char_downcase(v_char);
        }
        if (NIL != unicode_strings.ascii_char_p(pph_code_char(v_char))) {
            return char_code(char_downcase(pph_code_char(v_char)));
        }
        return v_char;
    }

    public static SubLObject pph_string_ndowncase_leading(final SubLObject string) {
        set_aref(string, ZERO_INTEGER, pph_char_downcase(aref(string, ZERO_INTEGER)));
        return string;
    }

    public static SubLObject pph_string_starts_with_one_of(final SubLObject string, final SubLObject starts) {
        if (string.isString()) {
            return string_utilities.starts_with_one_of(string, starts);
        }
        SubLObject cdolist_list_var = starts;
        SubLObject start = NIL;
        start = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != pph_string_starts_with(string, start, symbol_function(EQUAL))) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            start = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject pph_string_equalP(final SubLObject string1, final SubLObject string2) {
        if (string1.isString() && string2.isString()) {
            return equal(string1, string2);
        }
        return equalp(pph_string_canonicalize(string1), pph_string_canonicalize(string2));
    }

    public static SubLObject pph_string_concatenate(final SubLObject string1, final SubLObject string2) {
        if (string1.isString() && string2.isString()) {
            return cconcatenate(string1, string2);
        }
        if (NIL != list_utilities.lengthE(string1, ZERO_INTEGER, UNPROVIDED)) {
            return string2;
        }
        if (NIL != list_utilities.lengthE(string2, ZERO_INTEGER, UNPROVIDED)) {
            return string1;
        }
        return cconcatenate(pph_string_canonicalize(string1), pph_string_canonicalize(string2));
    }

    public static SubLObject pph_string_tokenize(final SubLObject v_pph_string, SubLObject break_list) {
        if (break_list == UNPROVIDED) {
            break_list = string_utilities.whitespace_chars();
        }
        if (v_pph_string.isString()) {
            return string_utilities.string_tokenize(v_pph_string, break_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        SubLObject token_stack = NIL;
        SubLObject current_string_char_stack = NIL;
        for (SubLObject sequence_var = v_pph_string, end_index = (sequence_var.isList()) ? NIL : length(sequence_var), ignore_me = ZERO_INTEGER, sequence_doneP = subl_macros.do_sequence_index_doneP(ignore_me, end_index, sequence_var); NIL == sequence_doneP; sequence_doneP = subl_macros.do_sequence_index_doneP(ignore_me, end_index, sequence_var)) {
            final SubLObject item = subl_macros.do_sequence_index_valueP(ignore_me, sequence_var);
            if ((!ignore_me.isInteger()) || (!ignore_me.numL(ZERO_INTEGER))) {
                if (((!NIL.isInteger()) || (!ignore_me.isInteger())) || (!ignore_me.numGE(NIL))) {
                    final SubLObject v_char = (item.isChar()) ? item : pph_code_char(item);
                    if (NIL != subl_promotions.memberP(v_char, break_list, UNPROVIDED, UNPROVIDED)) {
                        if (NIL != list_utilities.non_empty_list_p(current_string_char_stack)) {
                            token_stack = cons(pph_string_from_char_list(nreverse(current_string_char_stack)), token_stack);
                            current_string_char_stack = NIL;
                        }
                    } else {
                        current_string_char_stack = cons(v_char, current_string_char_stack);
                    }
                }
            }
            sequence_var = subl_macros.do_sequence_index_update(sequence_var);
            ignore_me = add(ignore_me, ONE_INTEGER);
        }
        if (NIL != list_utilities.non_empty_list_p(current_string_char_stack)) {
            token_stack = cons(pph_string_from_char_list(nreverse(current_string_char_stack)), token_stack);
        }
        return nreverse(token_stack);
    }

    public static SubLObject pph_string_from_char_list(final SubLObject chars) {
        if (NIL != list_utilities.find_if_not(CHARACTERP, chars, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return list_utilities.list2vector(Mapping.mapcar(PPH_CHAR_CODE, chars));
        }
        return unicode_strings.string_from_char_list(chars, UNPROVIDED);
    }

    public static SubLObject preds_of_pph_string(final SubLObject string, SubLObject misspellings) {
        if (misspellings == UNPROVIDED) {
            misspellings = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (string.isString()) {
            return lexicon_utilities.preds_of_string(string, misspellings, pph_vars.$pph_language_mt$.getDynamicValue(thread), UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject pph_string_last_char(final SubLObject string) {
        if (string.isString()) {
            return string_utilities.last_char(string);
        }
        return pph_string_char_from_end(string, ZERO_INTEGER);
    }

    public static SubLObject pph_string_char_from_end(final SubLObject string, final SubLObject i) {
        if (string.isString()) {
            return string_utilities.char_from_end(string, i);
        }
        return pph_string_char(string, subtract(length(string), number_utilities.f_1X(i)));
    }

    public static SubLObject pph_bunge(final SubLObject strings_to_bunge) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == $pph_canonicalize_on_bungeP$.getDynamicValue(thread)) && (NIL != list_utilities.list_of_type_p(STRINGP, strings_to_bunge))) {
            return string_utilities.bunge(strings_to_bunge, UNPROVIDED);
        }
        if (NIL != list_utilities.empty_list_p(strings_to_bunge)) {
            return NIL != $pph_canonicalize_on_bungeP$.getDynamicValue(thread) ? $ic28 : $str29$;
        }
        if (NIL != list_utilities.find_if_not($sym30$NON_EMPTY_PPH_STRING_, strings_to_bunge, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return pph_bunge(list_utilities.remove_if_not($sym30$NON_EMPTY_PPH_STRING_, strings_to_bunge, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        }
        final SubLObject first_string = strings_to_bunge.first();
        SubLObject ans = pph_string_canonicalize(first_string);
        SubLObject cdolist_list_var = strings_to_bunge.rest();
        SubLObject string = NIL;
        string = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            ans = cconcatenate(ans, new SubLObject[]{ $pph_space_vector$.getGlobalValue(), pph_string_canonicalize(string) });
            cdolist_list_var = cdolist_list_var.rest();
            string = cdolist_list_var.first();
        } 
        return ans;
    }

    public static SubLObject pph_string_find_if(final SubLObject test, final SubLObject string) {
        if (string.isString()) {
            return find_if(test, string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject code;
        SubLObject v_char;
        for (length = length(string), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            code = aref(string, element_num);
            v_char = code_char(code);
            if ((NIL != v_char) && (NIL != funcall(test, v_char))) {
                return v_char;
            }
        }
        return NIL;
    }

    public static SubLObject pph_string_position(final SubLObject v_char, final SubLObject string, SubLObject test, SubLObject key, SubLObject start, SubLObject end) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        if (string.isString()) {
            return position(v_char, string, test, key, start, end);
        }
        return position(pph_char_code(v_char), string, test, key, start, end);
    }

    public static SubLObject pph_string_char(final SubLObject string, final SubLObject i) {
        if (string.isString()) {
            return Strings.sublisp_char(string, i);
        }
        return pph_code_char(aref(string, i));
    }

    public static SubLObject pph_char_E(final SubLObject char1, final SubLObject char2) {
        if (char1.isChar() && char2.isChar()) {
            return charE(char1, char2);
        }
        return eql(pph_char_code(char1), pph_char_code(char2));
    }

    public static SubLObject pph_set_nth_char(final SubLObject n, final SubLObject string, final SubLObject new_char, SubLObject safeP) {
        if (safeP == UNPROVIDED) {
            safeP = NIL;
        }
        if (string.isString() && new_char.isChar()) {
            return string_utilities.set_nth_char(n, string, new_char, safeP);
        }
        if ((NIL == safeP) || (NIL != list_utilities.lengthG(string, n, UNPROVIDED))) {
            set_aref(string, n, pph_char_code(new_char));
            return string;
        }
        return NIL;
    }

    public static SubLObject pph_substringP(final SubLObject little, final SubLObject big, SubLObject test, SubLObject start, SubLObject end) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUAL);
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        if (little.isString() && big.isString()) {
            return list_utilities.sublisp_boolean(string_utilities.substringP(little, big, test, start, end));
        }
        if (NIL != list_utilities.greater_or_same_length_p(big, little)) {
            return list_utilities.sublisp_boolean(search(pph_string_canonicalize(little), pph_string_canonicalize(big), symbol_function(EQUALP), symbol_function(IDENTITY), ZERO_INTEGER, NIL, start, end));
        }
        return NIL;
    }

    public static SubLObject pph_substring(final SubLObject string, final SubLObject start, SubLObject end) {
        if (end == UNPROVIDED) {
            end = NIL;
        }
        if (string.isString()) {
            return string_utilities.substring(string, start, end);
        }
        return subseq(string, start, end);
    }

    public static SubLObject pph_string_to_display(final SubLObject string) {
        if (string.isString()) {
            return string;
        }
        return unicode_strings.unicode_vector_to_display(string);
    }

    public static SubLObject pph_string_if_non_null_to_output_format(final SubLObject string, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = pph_vars.$paraphrase_mode$.getDynamicValue();
        }
        return NIL == string ? string : pph_string_to_output_format(string, mode);
    }

    public static SubLObject pph_string_to_cycl(final SubLObject string) {
        if (string.isString()) {
            return string;
        }
        if (NIL != unicode_strings.unicode_vector_is_ascii_string_p(string, UNPROVIDED, UNPROVIDED)) {
            return unicode_strings.utf8_vector_to_utf8_string(unicode_strings.unicode_vector_to_utf8_vector(string, UNPROVIDED, UNPROVIDED));
        }
        return unicode_nauts.make_unicode_naut(unicode_strings.unicode_vector_to_display(string));
    }

    public static SubLObject pph_string_to_output_format(final SubLObject string, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = pph_vars.$paraphrase_mode$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != unicode_strings.ascii_string_p(string)) {
            return string;
        }
        if ((mode == $HTML) || (NIL != unicode_strings.unicode_vector_is_ascii_string_p(string, UNPROVIDED, UNPROVIDED))) {
            return pph_string_to_html_escaped(string, UNPROVIDED);
        }
        if (NIL != pph_vars.$allow_utf8_in_pph_text_mode$.getDynamicValue(thread)) {
            return pph_string_to_utf8(string);
        }
        if (string.isString()) {
            return unicode_nauts.utf8_string_to_cycl_safe_string(string);
        }
        return unicode_nauts.make_unicode_naut(unicode_strings.unicode_vector_to_display(string));
    }

    public static SubLObject pph_string_if_non_null_to_html_escaped(final SubLObject string) {
        return NIL == string ? string : pph_string_to_html_escaped(string, UNPROVIDED);
    }

    public static SubLObject pph_string_to_html_escaped(final SubLObject string, SubLObject escape_reserved_charsP) {
        if (escape_reserved_charsP == UNPROVIDED) {
            escape_reserved_charsP = NIL;
        }
        if (NIL != unicode_strings.ascii_string_p(string)) {
            return string;
        }
        if (string.isString()) {
            return unicode_strings.unicode_to_html_escaped(unicode_strings.utf8_string_to_unicode_vector(unicode_strings.html_escaped_to_utf8_string(string)), UNPROVIDED);
        }
        return unicode_strings.unicode_to_html_escaped(string, escape_reserved_charsP);
    }

    public static SubLObject pph_string_if_non_null_to_utf8(final SubLObject string) {
        return NIL == string ? string : pph_string_to_utf8(string);
    }

    public static SubLObject pph_string_to_utf8(final SubLObject string) {
        if (string.isString()) {
            return string;
        }
        return unicode_strings.utf8_vector_to_utf8_string(unicode_strings.unicode_vector_to_utf8_vector(string, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject non_empty_pph_stringP(final SubLObject obj) {
        return makeBoolean((NIL != pph_string_p(obj)) && (NIL != list_utilities.lengthG(obj, ZERO_INTEGER, UNPROVIDED)));
    }

    public static SubLObject pph_string_canonicalize(final SubLObject string) {
        return string.isString() ? unicode_strings.utf8_string_to_unicode_vector(string) : string;
    }

    public static SubLObject pph_nupcase_nth(final SubLObject string, final SubLObject n, SubLObject safeP) {
        if (safeP == UNPROVIDED) {
            safeP = T;
        }
        if (string.isString()) {
            return string_utilities.nupcase_nth(string, n, safeP);
        }
        if ((NIL == safeP) || (NIL != list_utilities.lengthG(string, n, UNPROVIDED))) {
            final SubLObject v_char = pph_code_char(aref(string, n));
            if (v_char.isChar()) {
                set_aref(string, n, char_code(char_upcase(v_char)));
            }
        }
        return string;
    }

    public static SubLObject pph_string_downcase(final SubLObject string) {
        if (string.isString()) {
            return Strings.string_downcase(string, UNPROVIDED, UNPROVIDED);
        }
        final SubLObject ans = vector_utilities.copy_vector(string);
        for (SubLObject sequence_var = string, end_index = (sequence_var.isList()) ? NIL : length(sequence_var), i = ZERO_INTEGER, sequence_doneP = subl_macros.do_sequence_index_doneP(i, end_index, sequence_var); NIL == sequence_doneP; sequence_doneP = subl_macros.do_sequence_index_doneP(i, end_index, sequence_var)) {
            final SubLObject code = subl_macros.do_sequence_index_valueP(i, sequence_var);
            final SubLObject downcased = pph_char_downcase(pph_code_char(code));
            set_aref(ans, i, downcased.isChar() ? char_code(downcased) : downcased);
            sequence_var = subl_macros.do_sequence_index_update(sequence_var);
            i = add(i, ONE_INTEGER);
        }
        return ans;
    }

    public static SubLObject pph_remove_substring(final SubLObject big, final SubLObject little) {
        if (big.isString() && little.isString()) {
            return string_utilities.remove_substring(big, little);
        }
        return vector_utilities.vector_nreplace_subsequence($ic32, pph_string_canonicalize(little), pph_string_canonicalize(big), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject pph_code_char(final SubLObject code) {
        return code.numLE($int$255) ? code_char(code) : get_pph_code_char(code);
    }

    public static SubLObject pph_char_code(final SubLObject v_char) {
        return v_char.isChar() ? char_code(v_char) : get_pph_char_code(v_char);
    }

    public static SubLObject get_pph_code_char(final SubLObject code) {
        return code;
    }

    public static SubLObject get_pph_char_code(final SubLObject v_char) {
        return v_char;
    }

    public static SubLObject pph_string_find_ifP(final SubLObject test, final SubLObject string) {
        return list_utilities.sublisp_boolean(pph_string_find_if(test, string));
    }

    public static SubLObject pph_canonicalizing_bunge(final SubLObject strings_to_bunge) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $pph_canonicalize_on_bungeP$.currentBinding(thread);
        try {
            $pph_canonicalize_on_bungeP$.bind(T, thread);
            return pph_bunge(strings_to_bunge);
        } finally {
            $pph_canonicalize_on_bungeP$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject pph_noncanonicalizing_bunge(final SubLObject strings_to_bunge) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $pph_canonicalize_on_bungeP$.currentBinding(thread);
        try {
            $pph_canonicalize_on_bungeP$.bind(NIL, thread);
            return pph_bunge(strings_to_bunge);
        } finally {
            $pph_canonicalize_on_bungeP$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject declare_pph_string_file() {
        declareMacro(me, "do_pph_string", "DO-PPH-STRING");
        declareFunction(me, "pph_string_p", "PPH-STRING-P", 1, 0, false);
        declareFunction(me, "clear_pph_string_from_utf8_string", "CLEAR-PPH-STRING-FROM-UTF8-STRING", 0, 0, false);
        declareFunction(me, "remove_pph_string_from_utf8_string", "REMOVE-PPH-STRING-FROM-UTF8-STRING", 1, 0, false);
        declareFunction(me, "pph_string_from_utf8_string_internal", "PPH-STRING-FROM-UTF8-STRING-INTERNAL", 1, 0, false);
        declareFunction(me, "pph_string_from_utf8_string", "PPH-STRING-FROM-UTF8-STRING", 1, 0, false);
        declareFunction(me, "pph_string_from_unicode_naut", "PPH-STRING-FROM-UNICODE-NAUT", 1, 0, false);
        declareFunction(me, "pph_string_from_cycl_string", "PPH-STRING-FROM-CYCL-STRING", 1, 0, false);
        declareFunction(me, "pph_string_starts_with", "PPH-STRING-STARTS-WITH", 2, 1, false);
        declareFunction(me, "pph_string_ends_with", "PPH-STRING-ENDS-WITH", 2, 1, false);
        declareFunction(me, "pph_string_pre_remove", "PPH-STRING-PRE-REMOVE", 2, 1, false);
        declareFunction(me, "pph_string_copy", "PPH-STRING-COPY", 1, 0, false);
        declareFunction(me, "pph_char_downcase", "PPH-CHAR-DOWNCASE", 1, 0, false);
        declareFunction(me, "pph_string_ndowncase_leading", "PPH-STRING-NDOWNCASE-LEADING", 1, 0, false);
        declareFunction(me, "pph_string_starts_with_one_of", "PPH-STRING-STARTS-WITH-ONE-OF", 2, 0, false);
        declareFunction(me, "pph_string_equalP", "PPH-STRING-EQUAL?", 2, 0, false);
        declareFunction(me, "pph_string_concatenate", "PPH-STRING-CONCATENATE", 2, 0, false);
        declareFunction(me, "pph_string_tokenize", "PPH-STRING-TOKENIZE", 1, 1, false);
        declareFunction(me, "pph_string_from_char_list", "PPH-STRING-FROM-CHAR-LIST", 1, 0, false);
        declareFunction(me, "preds_of_pph_string", "PREDS-OF-PPH-STRING", 1, 1, false);
        declareFunction(me, "pph_string_last_char", "PPH-STRING-LAST-CHAR", 1, 0, false);
        declareFunction(me, "pph_string_char_from_end", "PPH-STRING-CHAR-FROM-END", 2, 0, false);
        declareFunction(me, "pph_bunge", "PPH-BUNGE", 1, 0, false);
        declareFunction(me, "pph_string_find_if", "PPH-STRING-FIND-IF", 2, 0, false);
        declareFunction(me, "pph_string_position", "PPH-STRING-POSITION", 2, 4, false);
        declareFunction(me, "pph_string_char", "PPH-STRING-CHAR", 2, 0, false);
        declareFunction(me, "pph_char_E", "PPH-CHAR-=", 2, 0, false);
        declareFunction(me, "pph_set_nth_char", "PPH-SET-NTH-CHAR", 3, 1, false);
        declareFunction(me, "pph_substringP", "PPH-SUBSTRING?", 2, 3, false);
        declareFunction(me, "pph_substring", "PPH-SUBSTRING", 2, 1, false);
        declareFunction(me, "pph_string_to_display", "PPH-STRING-TO-DISPLAY", 1, 0, false);
        declareFunction(me, "pph_string_if_non_null_to_output_format", "PPH-STRING-IF-NON-NULL-TO-OUTPUT-FORMAT", 1, 1, false);
        declareFunction(me, "pph_string_to_cycl", "PPH-STRING-TO-CYCL", 1, 0, false);
        declareFunction(me, "pph_string_to_output_format", "PPH-STRING-TO-OUTPUT-FORMAT", 1, 1, false);
        declareFunction(me, "pph_string_if_non_null_to_html_escaped", "PPH-STRING-IF-NON-NULL-TO-HTML-ESCAPED", 1, 0, false);
        declareFunction(me, "pph_string_to_html_escaped", "PPH-STRING-TO-HTML-ESCAPED", 1, 1, false);
        declareFunction(me, "pph_string_if_non_null_to_utf8", "PPH-STRING-IF-NON-NULL-TO-UTF8", 1, 0, false);
        declareFunction(me, "pph_string_to_utf8", "PPH-STRING-TO-UTF8", 1, 0, false);
        declareFunction(me, "non_empty_pph_stringP", "NON-EMPTY-PPH-STRING?", 1, 0, false);
        declareFunction(me, "pph_string_canonicalize", "PPH-STRING-CANONICALIZE", 1, 0, false);
        declareFunction(me, "pph_nupcase_nth", "PPH-NUPCASE-NTH", 2, 1, false);
        declareFunction(me, "pph_string_downcase", "PPH-STRING-DOWNCASE", 1, 0, false);
        declareFunction(me, "pph_remove_substring", "PPH-REMOVE-SUBSTRING", 2, 0, false);
        declareFunction(me, "pph_code_char", "PPH-CODE-CHAR", 1, 0, false);
        declareFunction(me, "pph_char_code", "PPH-CHAR-CODE", 1, 0, false);
        declareFunction(me, "get_pph_code_char", "GET-PPH-CODE-CHAR", 1, 0, false);
        declareFunction(me, "get_pph_char_code", "GET-PPH-CHAR-CODE", 1, 0, false);
        declareFunction(me, "pph_string_find_ifP", "PPH-STRING-FIND-IF?", 2, 0, false);
        declareFunction(me, "pph_canonicalizing_bunge", "PPH-CANONICALIZING-BUNGE", 1, 0, false);
        declareFunction(me, "pph_noncanonicalizing_bunge", "PPH-NONCANONICALIZING-BUNGE", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_pph_string_file() {
        deflexical("*PPH-STRING-FROM-UTF8-STRING-CACHING-STATE*", NIL);
        deflexical("*PPH-SPACE-VECTOR*", make_vector(ONE_INTEGER, char_code(CHAR_space)));
        defparameter("*PPH-CANONICALIZE-ON-BUNGE?*", NIL);
        return NIL;
    }

    public static SubLObject setup_pph_string_file() {
        memoization_state.note_globally_cached_function(PPH_STRING_FROM_UTF8_STRING);
        define_test_case_table_int(PPH_STRING_P, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, $list38, $KB, $TINY, $WORKING_, T }), $list42);
        define_test_case_table_int($sym30$NON_EMPTY_PPH_STRING_, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, $list38, $KB, $TINY, $WORKING_, T }), $list43);
        define_test_case_table_int(PPH_STRING_TO_OUTPUT_FORMAT, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list38, $KB, $TINY, $WORKING_, T }), $list45);
        define_test_case_table_int(PPH_STRING_COPY, list(new SubLObject[]{ $TEST, symbol_function($sym47$PPH_STRING_EQUAL_), $OWNER, NIL, $CLASSES, $list38, $KB, $TINY, $WORKING_, T }), $list48);
        define_test_case_table_int($sym49$PPH_STRING_FIND_IF_, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, $list38, $KB, $TINY, $WORKING_, T }), $list50);
        define_test_case_table_int(PPH_STRING_POSITION, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, $list38, $KB, $TINY, $WORKING_, T }), $list52);
        define_test_case_table_int($sym47$PPH_STRING_EQUAL_, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, $list38, $KB, $TINY, $WORKING_, T }), $list53);
        define_test_case_table_int(PPH_STRING_DOWNCASE, list(new SubLObject[]{ $TEST, symbol_function($sym47$PPH_STRING_EQUAL_), $OWNER, NIL, $CLASSES, $list38, $KB, $TINY, $WORKING_, T }), $list55);
        define_test_case_table_int(PPH_STRING_FROM_CYCL_STRING, list(new SubLObject[]{ $TEST, symbol_function($sym47$PPH_STRING_EQUAL_), $OWNER, NIL, $CLASSES, $list38, $KB, $TINY, $WORKING_, T }), $list57);
        define_test_case_table_int(PPH_STRING_STARTS_WITH, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, $list38, $KB, $TINY, $WORKING_, T }), $list59);
        define_test_case_table_int(PPH_STRING_ENDS_WITH, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, $list38, $KB, $TINY, $WORKING_, T }), $list61);
        define_test_case_table_int($sym62$PPH_SUBSTRING_, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, $list38, $KB, $TINY, $WORKING_, T }), $list63);
        define_test_case_table_int(PPH_SUBSTRING, list(new SubLObject[]{ $TEST, symbol_function($sym47$PPH_STRING_EQUAL_), $OWNER, NIL, $CLASSES, $list38, $KB, $TINY, $WORKING_, T }), $list65);
        define_test_case_table_int(PPH_CANONICALIZING_BUNGE, list(new SubLObject[]{ $TEST, symbol_function(EQUALP), $OWNER, NIL, $CLASSES, $list38, $KB, $TINY, $WORKING_, T }), $list68);
        define_test_case_table_int(PPH_NONCANONICALIZING_BUNGE, list(new SubLObject[]{ $TEST, symbol_function(EQUALP), $OWNER, NIL, $CLASSES, $list38, $KB, $TINY, $WORKING_, T }), $list70);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_pph_string_file();
    }

    @Override
    public void initializeVariables() {
        init_pph_string_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_pph_string_file();
    }

    static {











































































    }
}

/**
 * Total time: 256 ms
 */
