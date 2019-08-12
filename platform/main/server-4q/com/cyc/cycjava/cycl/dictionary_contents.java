/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.hashtables_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class dictionary_contents extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new dictionary_contents();

 public static final String myName = "com.cyc.cycjava.cycl.dictionary_contents";


    // deflexical
    // Definitions
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $dictionary_contents_high_water_mark$ = makeSymbol("*DICTIONARY-CONTENTS-HIGH-WATER-MARK*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $dictionary_contents_low_water_mark$ = makeSymbol("*DICTIONARY-CONTENTS-LOW-WATER-MARK*");





    private static final SubLList $list2 = list(makeSymbol("INLINE"), makeSymbol("DICTIONARY-CONTENTS-STYLE"), makeSymbol("DICTIONARY-CONTENTS-STYLE-ERROR"));

    private static final SubLString $str6$Corrupted_dictionary_contents__un = makeString("Corrupted dictionary-contents; unsupported style ~S.~%");

    static private final SubLList $list7 = list(makeSymbol("INLINE"), makeSymbol("DICTIONARY-CONTENTS-LOOKUP-ALIST-STYLE"), makeSymbol("DICTIONARY-CONTENTS-LOOKUP-WITHOUT-VALUES-ALIST-STYLE"), makeSymbol("DICTIONARY-CONTENTS-ENTER-ALIST-STYLE"), makeSymbol("DICTIONARY-CONTENTS-DELETE-ALIST-STYLE"));

    private static final SubLList $list8 = list(makeSymbol("INLINE"), makeSymbol("DICTIONARY-CONTENTS-LOOKUP-HASHTABLE-STYLE"), makeSymbol("DICTIONARY-CONTENTS-LOOKUP-WITHOUT-VALUES-HASHTABLE-STYLE"), makeSymbol("DICTIONARY-CONTENTS-ENTER-HASHTABLE-STYLE"), makeSymbol("DICTIONARY-CONTENTS-DELETE-HASHTABLE-STYLE"));

    private static final SubLList $list9 = list(list(makeSymbol("KEY"), makeSymbol("VALUE"), makeSymbol("DICTIONARY-CONTENTS"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list10 = list($DONE);

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol $sym13$ITERATION_STATE = makeUninternedSymbol("ITERATION-STATE");

    private static final SubLSymbol DO_DICTIONARY_CONTENTS_STATE = makeSymbol("DO-DICTIONARY-CONTENTS-STATE");

    private static final SubLSymbol $sym18$DO_DICTIONARY_CONTENTS_DONE_ = makeSymbol("DO-DICTIONARY-CONTENTS-DONE?");

    private static final SubLSymbol DO_DICTIONARY_CONTENTS_KEY_VALUE = makeSymbol("DO-DICTIONARY-CONTENTS-KEY-VALUE");

    private static final SubLSymbol DO_DICTIONARY_CONTENTS_NEXT = makeSymbol("DO-DICTIONARY-CONTENTS-NEXT");

    private static final SubLSymbol DO_DICTIONARY_CONTENTS_FINALIZE = makeSymbol("DO-DICTIONARY-CONTENTS-FINALIZE");

    private static final SubLSymbol DO_DICTIONARY_CONTENTS = makeSymbol("DO-DICTIONARY-CONTENTS");

    /**
     * Return the current style of DICTIONARY-CONTENTS
     *
     * @return type-symbol.
     */
    @LispMethod(comment = "Return the current style of DICTIONARY-CONTENTS\r\n\r\n@return type-symbol.")
    public static final SubLObject dictionary_contents_style_alt(SubLObject v_dictionary_contents) {
        if (NIL != list_utilities.alist_p(v_dictionary_contents)) {
            return $ALIST;
        } else {
            if (v_dictionary_contents.isHashtable()) {
                return $HASHTABLE;
            } else {
                return $UNKNOWN;
            }
        }
    }

    /**
     * Return the current style of DICTIONARY-CONTENTS
     *
     * @return type-symbol.
     */
    @LispMethod(comment = "Return the current style of DICTIONARY-CONTENTS\r\n\r\n@return type-symbol.")
    public static SubLObject dictionary_contents_style(final SubLObject v_dictionary_contents) {
        if (NIL != list_utilities.alist_p(v_dictionary_contents)) {
            return $ALIST;
        }
        if (v_dictionary_contents.isHashtable()) {
            return $HASHTABLE;
        }
        return $UNKNOWN;
    }

    public static final SubLObject dictionary_contents_style_error_alt(SubLObject v_dictionary_contents) {
        return Errors.error($str_alt5$Corrupted_dictionary_contents__un, com.cyc.cycjava.cycl.dictionary_contents.dictionary_contents_style(v_dictionary_contents));
    }

    public static SubLObject dictionary_contents_style_error(final SubLObject v_dictionary_contents) {
        return Errors.error($str6$Corrupted_dictionary_contents__un, dictionary_contents_style(v_dictionary_contents));
    }

    public static final SubLObject dictionary_contents_lookup_alist_style_alt(SubLObject v_dictionary_contents, SubLObject key, SubLObject test, SubLObject not_found) {
        return list_utilities.alist_lookup(v_dictionary_contents, key, test, not_found);
    }

    public static SubLObject dictionary_contents_lookup_alist_style(final SubLObject v_dictionary_contents, final SubLObject key, final SubLObject test, final SubLObject not_found) {
        return list_utilities.alist_lookup(v_dictionary_contents, key, test, not_found);
    }

    public static final SubLObject dictionary_contents_lookup_without_values_alist_style_alt(SubLObject v_dictionary_contents, SubLObject key, SubLObject test, SubLObject not_found) {
        return list_utilities.alist_lookup_without_values(v_dictionary_contents, key, test, not_found);
    }

    public static SubLObject dictionary_contents_lookup_without_values_alist_style(final SubLObject v_dictionary_contents, final SubLObject key, final SubLObject test, final SubLObject not_found) {
        return list_utilities.alist_lookup_without_values(v_dictionary_contents, key, test, not_found);
    }

    public static final SubLObject dictionary_contents_nlookup_without_values_alist_style_alt(SubLObject v_dictionary_contents, SubLObject key, SubLObject test, SubLObject not_found) {
        return list_utilities.alist_nlookup_without_values(v_dictionary_contents, key, test, not_found);
    }

    public static SubLObject dictionary_contents_nlookup_without_values_alist_style(final SubLObject v_dictionary_contents, final SubLObject key, final SubLObject test, final SubLObject not_found) {
        return list_utilities.alist_nlookup_without_values(v_dictionary_contents, key, test, not_found);
    }

    public static final SubLObject dictionary_contents_enter_alist_style_alt(SubLObject v_dictionary_contents, SubLObject key, SubLObject value, SubLObject test) {
        {
            SubLObject pair = assoc(key, v_dictionary_contents, test, UNPROVIDED);
            if (NIL != pair) {
                rplacd(pair, value);
            } else {
                v_dictionary_contents = cons(cons(key, value), v_dictionary_contents);
                if (length(v_dictionary_contents).numG($dictionary_contents_high_water_mark$.getGlobalValue())) {
                    v_dictionary_contents = list_utilities.alist_to_hash_table(v_dictionary_contents, test);
                }
            }
        }
        return v_dictionary_contents;
    }

    public static SubLObject dictionary_contents_enter_alist_style(SubLObject v_dictionary_contents, final SubLObject key, final SubLObject value, final SubLObject test) {
        final SubLObject pair = assoc(key, v_dictionary_contents, test, UNPROVIDED);
        if (NIL != pair) {
            rplacd(pair, value);
        } else {
            v_dictionary_contents = cons(cons(key, value), v_dictionary_contents);
            if (length(v_dictionary_contents).numG($dictionary_contents_high_water_mark$.getGlobalValue())) {
                v_dictionary_contents = list_utilities.alist_to_hash_table(v_dictionary_contents, test);
            }
        }
        return v_dictionary_contents;
    }

    public static final SubLObject dictionary_contents_delete_alist_style_alt(SubLObject v_dictionary_contents, SubLObject key, SubLObject test) {
        return list_utilities.alist_delete_without_values(v_dictionary_contents, key, test);
    }

    public static SubLObject dictionary_contents_delete_alist_style(final SubLObject v_dictionary_contents, final SubLObject key, final SubLObject test) {
        return list_utilities.alist_delete_without_values(v_dictionary_contents, key, test);
    }

    public static final SubLObject dictionary_contents_lookup_hashtable_style_alt(SubLObject v_dictionary_contents, SubLObject key, SubLObject not_found) {
        return gethash(key, v_dictionary_contents, not_found);
    }

    public static SubLObject dictionary_contents_lookup_hashtable_style(final SubLObject v_dictionary_contents, final SubLObject key, final SubLObject not_found) {
        return gethash(key, v_dictionary_contents, not_found);
    }

    public static final SubLObject dictionary_contents_lookup_without_values_hashtable_style_alt(SubLObject v_dictionary_contents, SubLObject key, SubLObject not_found) {
        return gethash_without_values(key, v_dictionary_contents, not_found);
    }

    public static SubLObject dictionary_contents_lookup_without_values_hashtable_style(final SubLObject v_dictionary_contents, final SubLObject key, final SubLObject not_found) {
        return gethash_without_values(key, v_dictionary_contents, not_found);
    }

    public static final SubLObject dictionary_contents_enter_hashtable_style_alt(SubLObject v_dictionary_contents, SubLObject key, SubLObject value) {
        sethash(key, v_dictionary_contents, value);
        return v_dictionary_contents;
    }

    public static SubLObject dictionary_contents_enter_hashtable_style(final SubLObject v_dictionary_contents, final SubLObject key, final SubLObject value) {
        sethash(key, v_dictionary_contents, value);
        return v_dictionary_contents;
    }

    public static final SubLObject dictionary_contents_delete_hashtable_style_alt(SubLObject v_dictionary_contents, SubLObject key) {
        remhash(key, v_dictionary_contents);
        if (hash_table_count(v_dictionary_contents).numL($dictionary_contents_low_water_mark$.getGlobalValue())) {
            v_dictionary_contents = hash_table_utilities.hash_table_to_alist(v_dictionary_contents);
        }
        return v_dictionary_contents;
    }

    public static SubLObject dictionary_contents_delete_hashtable_style(SubLObject v_dictionary_contents, final SubLObject key) {
        remhash(key, v_dictionary_contents);
        if (hash_table_count(v_dictionary_contents).numL($dictionary_contents_low_water_mark$.getGlobalValue())) {
            v_dictionary_contents = hash_table_utilities.hash_table_to_alist(v_dictionary_contents);
        }
        return v_dictionary_contents;
    }

    /**
     * Return T iff OBJECT can be interpreted as the contents of a dictionary.
     */
    @LispMethod(comment = "Return T iff OBJECT can be interpreted as the contents of a dictionary.")
    public static final SubLObject dictionary_contents_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != list_utilities.alist_p(v_object)) || v_object.isHashtable());
    }

    /**
     * Return T iff OBJECT can be interpreted as the contents of a dictionary.
     */
    @LispMethod(comment = "Return T iff OBJECT can be interpreted as the contents of a dictionary.")
    public static SubLObject dictionary_contents_p(final SubLObject v_object) {
        return makeBoolean((NIL != list_utilities.alist_p(v_object)) || v_object.isHashtable());
    }

    /**
     * Allocate a new dictionary-contents with TEST as the equality test.
     * Assume that SIZE elements will likely be immediately added.
     *
     * @return dictionary-contents
     */
    @LispMethod(comment = "Allocate a new dictionary-contents with TEST as the equality test.\r\nAssume that SIZE elements will likely be immediately added.\r\n\r\n@return dictionary-contents\nAllocate a new dictionary-contents with TEST as the equality test.\nAssume that SIZE elements will likely be immediately added.")
    public static final SubLObject new_dictionary_contents_alt(SubLObject size, SubLObject test) {
        if (size == UNPROVIDED) {
            size = ZERO_INTEGER;
        }
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (size.numG($dictionary_contents_high_water_mark$.getGlobalValue())) {
            return make_hash_table(size, test, UNPROVIDED);
        } else {
            return NIL;
        }
    }

    /**
     * Allocate a new dictionary-contents with TEST as the equality test.
     * Assume that SIZE elements will likely be immediately added.
     *
     * @return dictionary-contents
     */
    @LispMethod(comment = "Allocate a new dictionary-contents with TEST as the equality test.\r\nAssume that SIZE elements will likely be immediately added.\r\n\r\n@return dictionary-contents\nAllocate a new dictionary-contents with TEST as the equality test.\nAssume that SIZE elements will likely be immediately added.")
    public static SubLObject new_dictionary_contents(SubLObject size, SubLObject test) {
        if (size == UNPROVIDED) {
            size = ZERO_INTEGER;
        }
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (size.numG($dictionary_contents_high_water_mark$.getGlobalValue())) {
            return make_hash_table(size, test, UNPROVIDED);
        }
        return NIL;
    }

    /**
     * Return a new copy of DICTIONARY-CONTENTS.
     *
     * @return dictionary-contents-p
     */
    @LispMethod(comment = "Return a new copy of DICTIONARY-CONTENTS.\r\n\r\n@return dictionary-contents-p")
    public static final SubLObject copy_dictionary_contents_alt(SubLObject v_dictionary_contents) {
        {
            SubLObject pcase_var = com.cyc.cycjava.cycl.dictionary_contents.dictionary_contents_style(v_dictionary_contents);
            if (pcase_var.eql($ALIST)) {
                return copy_alist(v_dictionary_contents);
            } else {
                if (pcase_var.eql($HASHTABLE)) {
                    return hash_table_utilities.copy_hashtable(v_dictionary_contents, UNPROVIDED);
                } else {
                    return com.cyc.cycjava.cycl.dictionary_contents.dictionary_contents_style_error(v_dictionary_contents);
                }
            }
        }
    }

    /**
     * Return a new copy of DICTIONARY-CONTENTS.
     *
     * @return dictionary-contents-p
     */
    @LispMethod(comment = "Return a new copy of DICTIONARY-CONTENTS.\r\n\r\n@return dictionary-contents-p")
    public static SubLObject copy_dictionary_contents(final SubLObject v_dictionary_contents) {
        final SubLObject pcase_var = dictionary_contents_style(v_dictionary_contents);
        if (pcase_var.eql($ALIST)) {
            return copy_alist(v_dictionary_contents);
        }
        if (pcase_var.eql($HASHTABLE)) {
            return hash_table_utilities.copy_hashtable(v_dictionary_contents, UNPROVIDED);
        }
        return dictionary_contents_style_error(v_dictionary_contents);
    }

    /**
     * Return the number of associations currently entered in DICTIONARY-CONTENTS.
     *
     * @return non-negative-integer-p.
     */
    @LispMethod(comment = "Return the number of associations currently entered in DICTIONARY-CONTENTS.\r\n\r\n@return non-negative-integer-p.")
    public static final SubLObject dictionary_contents_size_alt(SubLObject v_dictionary_contents) {
        {
            SubLObject pcase_var = com.cyc.cycjava.cycl.dictionary_contents.dictionary_contents_style(v_dictionary_contents);
            if (pcase_var.eql($ALIST)) {
                return length(v_dictionary_contents);
            } else {
                if (pcase_var.eql($HASHTABLE)) {
                    return hash_table_count(v_dictionary_contents);
                } else {
                    return com.cyc.cycjava.cycl.dictionary_contents.dictionary_contents_style_error(v_dictionary_contents);
                }
            }
        }
    }

    /**
     * Return the number of associations currently entered in DICTIONARY-CONTENTS.
     *
     * @return non-negative-integer-p.
     */
    @LispMethod(comment = "Return the number of associations currently entered in DICTIONARY-CONTENTS.\r\n\r\n@return non-negative-integer-p.")
    public static SubLObject dictionary_contents_size(final SubLObject v_dictionary_contents) {
        final SubLObject pcase_var = dictionary_contents_style(v_dictionary_contents);
        if (pcase_var.eql($ALIST)) {
            return length(v_dictionary_contents);
        }
        if (pcase_var.eql($HASHTABLE)) {
            return hash_table_count(v_dictionary_contents);
        }
        return dictionary_contents_style_error(v_dictionary_contents);
    }

    /**
     * Return T iff DICTIONARY-CONTENTS is empty.
     */
    @LispMethod(comment = "Return T iff DICTIONARY-CONTENTS is empty.")
    public static final SubLObject dictionary_contents_empty_p_alt(SubLObject v_dictionary_contents) {
        {
            SubLObject pcase_var = com.cyc.cycjava.cycl.dictionary_contents.dictionary_contents_style(v_dictionary_contents);
            if (pcase_var.eql($ALIST)) {
                return sublisp_null(v_dictionary_contents);
            } else {
                if (pcase_var.eql($HASHTABLE)) {
                    return zerop(hash_table_count(v_dictionary_contents));
                } else {
                    return com.cyc.cycjava.cycl.dictionary_contents.dictionary_contents_style_error(v_dictionary_contents);
                }
            }
        }
    }

    /**
     * Return T iff DICTIONARY-CONTENTS is empty.
     */
    @LispMethod(comment = "Return T iff DICTIONARY-CONTENTS is empty.")
    public static SubLObject dictionary_contents_empty_p(final SubLObject v_dictionary_contents) {
        final SubLObject pcase_var = dictionary_contents_style(v_dictionary_contents);
        if (pcase_var.eql($ALIST)) {
            return sublisp_null(v_dictionary_contents);
        }
        if (pcase_var.eql($HASHTABLE)) {
            return zerop(hash_table_count(v_dictionary_contents));
        }
        return dictionary_contents_style_error(v_dictionary_contents);
    }

    /**
     * Return T iff OBJECT is a dictionary-contents that is not empty.
     */
    @LispMethod(comment = "Return T iff OBJECT is a dictionary-contents that is not empty.")
    public static final SubLObject non_empty_dictionary_contents_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.dictionary_contents.dictionary_contents_p(v_object)) && (NIL == com.cyc.cycjava.cycl.dictionary_contents.dictionary_contents_empty_p(v_object)));
    }

    @LispMethod(comment = "Return T iff OBJECT is a dictionary-contents that is not empty.")
    public static SubLObject non_empty_dictionary_contents_p(final SubLObject v_object) {
        return makeBoolean((NIL != dictionary_contents_p(v_object)) && (NIL == dictionary_contents_empty_p(v_object)));
    }

    public static SubLObject dictionary_contents_has_keyP(final SubLObject v_dictionary_contents, final SubLObject key, final SubLObject test) {
        return nth_value_step_2(nth_value_step_1(ONE_INTEGER), dictionary_contents_lookup(v_dictionary_contents, key, test, UNPROVIDED));
    }

    /**
     * Return the value mapped from KEY in DICTIONARY-CONTENTS.
     * TEST is the assumed equality test.
     * Return the formal NOT-FOUND if there was no entry.
     * Return a second value of T iff KEY was found.
     */
    @LispMethod(comment = "Return the value mapped from KEY in DICTIONARY-CONTENTS.\r\nTEST is the assumed equality test.\r\nReturn the formal NOT-FOUND if there was no entry.\r\nReturn a second value of T iff KEY was found.\nReturn the value mapped from KEY in DICTIONARY-CONTENTS.\nTEST is the assumed equality test.\nReturn the formal NOT-FOUND if there was no entry.\nReturn a second value of T iff KEY was found.")
    public static final SubLObject dictionary_contents_lookup_alt(SubLObject v_dictionary_contents, SubLObject key, SubLObject test, SubLObject not_found) {
        if (not_found == UNPROVIDED) {
            not_found = NIL;
        }
        {
            SubLObject pcase_var = com.cyc.cycjava.cycl.dictionary_contents.dictionary_contents_style(v_dictionary_contents);
            if (pcase_var.eql($ALIST)) {
                return com.cyc.cycjava.cycl.dictionary_contents.dictionary_contents_lookup_alist_style(v_dictionary_contents, key, test, not_found);
            } else {
                if (pcase_var.eql($HASHTABLE)) {
                    return com.cyc.cycjava.cycl.dictionary_contents.dictionary_contents_lookup_hashtable_style(v_dictionary_contents, key, not_found);
                } else {
                    return com.cyc.cycjava.cycl.dictionary_contents.dictionary_contents_style_error(v_dictionary_contents);
                }
            }
        }
    }

    @LispMethod(comment = "Return the value mapped from KEY in DICTIONARY-CONTENTS.\r\nTEST is the assumed equality test.\r\nReturn the formal NOT-FOUND if there was no entry.\r\nReturn a second value of T iff KEY was found.\nReturn the value mapped from KEY in DICTIONARY-CONTENTS.\nTEST is the assumed equality test.\nReturn the formal NOT-FOUND if there was no entry.\nReturn a second value of T iff KEY was found.")
    public static SubLObject dictionary_contents_lookup(final SubLObject v_dictionary_contents, final SubLObject key, final SubLObject test, SubLObject not_found) {
        if (not_found == UNPROVIDED) {
            not_found = NIL;
        }
        final SubLObject pcase_var = dictionary_contents_style(v_dictionary_contents);
        if (pcase_var.eql($ALIST)) {
            return dictionary_contents_lookup_alist_style(v_dictionary_contents, key, test, not_found);
        }
        if (pcase_var.eql($HASHTABLE)) {
            return dictionary_contents_lookup_hashtable_style(v_dictionary_contents, key, not_found);
        }
        return dictionary_contents_style_error(v_dictionary_contents);
    }

    /**
     * Return the value mapped from KEY in DICTIONARY-CONTENTS.
     * TEST is the assumed equality test.
     * Return the formal NOT-FOUND if there was no entry.
     * Unlike DICTIONARY-CONTENTS-LOOKUP, only 1 value is returned.
     */
    @LispMethod(comment = "Return the value mapped from KEY in DICTIONARY-CONTENTS.\r\nTEST is the assumed equality test.\r\nReturn the formal NOT-FOUND if there was no entry.\r\nUnlike DICTIONARY-CONTENTS-LOOKUP, only 1 value is returned.\nReturn the value mapped from KEY in DICTIONARY-CONTENTS.\nTEST is the assumed equality test.\nReturn the formal NOT-FOUND if there was no entry.\nUnlike DICTIONARY-CONTENTS-LOOKUP, only 1 value is returned.")
    public static final SubLObject dictionary_contents_lookup_without_values_alt(SubLObject v_dictionary_contents, SubLObject key, SubLObject test, SubLObject not_found) {
        if (not_found == UNPROVIDED) {
            not_found = NIL;
        }
        {
            SubLObject pcase_var = com.cyc.cycjava.cycl.dictionary_contents.dictionary_contents_style(v_dictionary_contents);
            if (pcase_var.eql($ALIST)) {
                return com.cyc.cycjava.cycl.dictionary_contents.dictionary_contents_lookup_without_values_alist_style(v_dictionary_contents, key, test, not_found);
            } else {
                if (pcase_var.eql($HASHTABLE)) {
                    return com.cyc.cycjava.cycl.dictionary_contents.dictionary_contents_lookup_without_values_hashtable_style(v_dictionary_contents, key, not_found);
                } else {
                    return com.cyc.cycjava.cycl.dictionary_contents.dictionary_contents_style_error(v_dictionary_contents);
                }
            }
        }
    }

    @LispMethod(comment = "Return the value mapped from KEY in DICTIONARY-CONTENTS.\r\nTEST is the assumed equality test.\r\nReturn the formal NOT-FOUND if there was no entry.\r\nUnlike DICTIONARY-CONTENTS-LOOKUP, only 1 value is returned.\nReturn the value mapped from KEY in DICTIONARY-CONTENTS.\nTEST is the assumed equality test.\nReturn the formal NOT-FOUND if there was no entry.\nUnlike DICTIONARY-CONTENTS-LOOKUP, only 1 value is returned.")
    public static SubLObject dictionary_contents_lookup_without_values(final SubLObject v_dictionary_contents, final SubLObject key, final SubLObject test, SubLObject not_found) {
        if (not_found == UNPROVIDED) {
            not_found = NIL;
        }
        final SubLObject pcase_var = dictionary_contents_style(v_dictionary_contents);
        if (pcase_var.eql($ALIST)) {
            return dictionary_contents_lookup_without_values_alist_style(v_dictionary_contents, key, test, not_found);
        }
        if (pcase_var.eql($HASHTABLE)) {
            return dictionary_contents_lookup_without_values_hashtable_style(v_dictionary_contents, key, not_found);
        }
        return dictionary_contents_style_error(v_dictionary_contents);
    }

    /**
     * Return the value mapped from KEY in DICTIONARY-CONTENTS.
     * TEST is the assumed equality test.
     * Return the formal NOT-FOUND if there was no entry.
     */
    @LispMethod(comment = "Return the value mapped from KEY in DICTIONARY-CONTENTS.\r\nTEST is the assumed equality test.\r\nReturn the formal NOT-FOUND if there was no entry.\nReturn the value mapped from KEY in DICTIONARY-CONTENTS.\nTEST is the assumed equality test.\nReturn the formal NOT-FOUND if there was no entry.")
    public static final SubLObject dictionary_contents_nlookup_without_values_alt(SubLObject v_dictionary_contents, SubLObject key, SubLObject test, SubLObject not_found) {
        if (not_found == UNPROVIDED) {
            not_found = NIL;
        }
        {
            SubLObject pcase_var = com.cyc.cycjava.cycl.dictionary_contents.dictionary_contents_style(v_dictionary_contents);
            if (pcase_var.eql($ALIST)) {
                return com.cyc.cycjava.cycl.dictionary_contents.dictionary_contents_nlookup_without_values_alist_style(v_dictionary_contents, key, test, not_found);
            } else {
                if (pcase_var.eql($HASHTABLE)) {
                    return com.cyc.cycjava.cycl.dictionary_contents.dictionary_contents_lookup_without_values_hashtable_style(v_dictionary_contents, key, not_found);
                } else {
                    return com.cyc.cycjava.cycl.dictionary_contents.dictionary_contents_style_error(v_dictionary_contents);
                }
            }
        }
    }

    @LispMethod(comment = "Return the value mapped from KEY in DICTIONARY-CONTENTS.\r\nTEST is the assumed equality test.\r\nReturn the formal NOT-FOUND if there was no entry.\nReturn the value mapped from KEY in DICTIONARY-CONTENTS.\nTEST is the assumed equality test.\nReturn the formal NOT-FOUND if there was no entry.")
    public static SubLObject dictionary_contents_nlookup_without_values(final SubLObject v_dictionary_contents, final SubLObject key, final SubLObject test, SubLObject not_found) {
        if (not_found == UNPROVIDED) {
            not_found = NIL;
        }
        final SubLObject pcase_var = dictionary_contents_style(v_dictionary_contents);
        if (pcase_var.eql($ALIST)) {
            return dictionary_contents_nlookup_without_values_alist_style(v_dictionary_contents, key, test, not_found);
        }
        if (pcase_var.eql($HASHTABLE)) {
            return dictionary_contents_lookup_without_values_hashtable_style(v_dictionary_contents, key, not_found);
        }
        return dictionary_contents_style_error(v_dictionary_contents);
    }

    /**
     * Note that KEY maps to VALUE in DICTIONARY-CONTENTS.
     * TEST is the assumed equality test.
     *
     * @return updated DICTIONARY-CONTENTS
     */
    @LispMethod(comment = "Note that KEY maps to VALUE in DICTIONARY-CONTENTS.\r\nTEST is the assumed equality test.\r\n\r\n@return updated DICTIONARY-CONTENTS\nNote that KEY maps to VALUE in DICTIONARY-CONTENTS.\nTEST is the assumed equality test.")
    public static final SubLObject dictionary_contents_enter_alt(SubLObject v_dictionary_contents, SubLObject key, SubLObject value, SubLObject test) {
        {
            SubLObject pcase_var = com.cyc.cycjava.cycl.dictionary_contents.dictionary_contents_style(v_dictionary_contents);
            if (pcase_var.eql($ALIST)) {
                return com.cyc.cycjava.cycl.dictionary_contents.dictionary_contents_enter_alist_style(v_dictionary_contents, key, value, test);
            } else {
                if (pcase_var.eql($HASHTABLE)) {
                    return com.cyc.cycjava.cycl.dictionary_contents.dictionary_contents_enter_hashtable_style(v_dictionary_contents, key, value);
                } else {
                    return com.cyc.cycjava.cycl.dictionary_contents.dictionary_contents_style_error(v_dictionary_contents);
                }
            }
        }
    }

    @LispMethod(comment = "Note that KEY maps to VALUE in DICTIONARY-CONTENTS.\r\nTEST is the assumed equality test.\r\n\r\n@return updated DICTIONARY-CONTENTS\nNote that KEY maps to VALUE in DICTIONARY-CONTENTS.\nTEST is the assumed equality test.")
    public static SubLObject dictionary_contents_enter(final SubLObject v_dictionary_contents, final SubLObject key, final SubLObject value, final SubLObject test) {
        final SubLObject pcase_var = dictionary_contents_style(v_dictionary_contents);
        if (pcase_var.eql($ALIST)) {
            return dictionary_contents_enter_alist_style(v_dictionary_contents, key, value, test);
        }
        if (pcase_var.eql($HASHTABLE)) {
            return dictionary_contents_enter_hashtable_style(v_dictionary_contents, key, value);
        }
        return dictionary_contents_style_error(v_dictionary_contents);
    }

    /**
     * Delete any mapping for KEY in DICTIONARY-CONTENTS.
     * TEST is the assumed equality test.
     *
     * @return updated DICTIONARY-CONTENTS
     */
    @LispMethod(comment = "Delete any mapping for KEY in DICTIONARY-CONTENTS.\r\nTEST is the assumed equality test.\r\n\r\n@return updated DICTIONARY-CONTENTS\nDelete any mapping for KEY in DICTIONARY-CONTENTS.\nTEST is the assumed equality test.")
    public static final SubLObject dictionary_contents_delete_alt(SubLObject v_dictionary_contents, SubLObject key, SubLObject test) {
        {
            SubLObject pcase_var = com.cyc.cycjava.cycl.dictionary_contents.dictionary_contents_style(v_dictionary_contents);
            if (pcase_var.eql($ALIST)) {
                return com.cyc.cycjava.cycl.dictionary_contents.dictionary_contents_delete_alist_style(v_dictionary_contents, key, test);
            } else {
                if (pcase_var.eql($HASHTABLE)) {
                    return com.cyc.cycjava.cycl.dictionary_contents.dictionary_contents_delete_hashtable_style(v_dictionary_contents, key);
                } else {
                    return com.cyc.cycjava.cycl.dictionary_contents.dictionary_contents_style_error(v_dictionary_contents);
                }
            }
        }
    }

    @LispMethod(comment = "Delete any mapping for KEY in DICTIONARY-CONTENTS.\r\nTEST is the assumed equality test.\r\n\r\n@return updated DICTIONARY-CONTENTS\nDelete any mapping for KEY in DICTIONARY-CONTENTS.\nTEST is the assumed equality test.")
    public static SubLObject dictionary_contents_delete(final SubLObject v_dictionary_contents, final SubLObject key, final SubLObject test) {
        final SubLObject pcase_var = dictionary_contents_style(v_dictionary_contents);
        if (pcase_var.eql($ALIST)) {
            return dictionary_contents_delete_alist_style(v_dictionary_contents, key, test);
        }
        if (pcase_var.eql($HASHTABLE)) {
            return dictionary_contents_delete_hashtable_style(v_dictionary_contents, key);
        }
        return dictionary_contents_style_error(v_dictionary_contents);
    }

    /**
     * Reset DICTIONARY-CONTENTS to the status of being just allocated.
     *
     * @return dictionary-contents-p
     */
    @LispMethod(comment = "Reset DICTIONARY-CONTENTS to the status of being just allocated.\r\n\r\n@return dictionary-contents-p")
    public static final SubLObject clear_dictionary_contents_alt(SubLObject v_dictionary_contents) {
        {
            SubLObject pcase_var = com.cyc.cycjava.cycl.dictionary_contents.dictionary_contents_style(v_dictionary_contents);
            if (pcase_var.eql($HASHTABLE)) {
                clrhash(v_dictionary_contents);
            }
        }
        return com.cyc.cycjava.cycl.dictionary_contents.new_dictionary_contents(ZERO_INTEGER, UNPROVIDED);
    }

    /**
     * Reset DICTIONARY-CONTENTS to the status of being just allocated.
     *
     * @return dictionary-contents-p
     */
    @LispMethod(comment = "Reset DICTIONARY-CONTENTS to the status of being just allocated.\r\n\r\n@return dictionary-contents-p")
    public static SubLObject clear_dictionary_contents(final SubLObject v_dictionary_contents) {
        final SubLObject pcase_var = dictionary_contents_style(v_dictionary_contents);
        if (pcase_var.eql($HASHTABLE)) {
            clrhash(v_dictionary_contents);
        }
        return new_dictionary_contents(ZERO_INTEGER, UNPROVIDED);
    }

    /**
     * Returns an iterator for DICTIONARY-CONTENTS.
     * Values returned are tuples of the form (<key> <value>).
     */
    @LispMethod(comment = "Returns an iterator for DICTIONARY-CONTENTS.\r\nValues returned are tuples of the form (<key> <value>).\nReturns an iterator for DICTIONARY-CONTENTS.\nValues returned are tuples of the form (<key> <value>).")
    public static final SubLObject new_dictionary_contents_iterator_alt(SubLObject v_dictionary_contents) {
        {
            SubLObject pcase_var = com.cyc.cycjava.cycl.dictionary_contents.dictionary_contents_style(v_dictionary_contents);
            if (pcase_var.eql($ALIST)) {
                return iteration.new_alist_iterator(v_dictionary_contents);
            } else {
                if (pcase_var.eql($HASHTABLE)) {
                    return iteration.new_hash_table_iterator(v_dictionary_contents);
                } else {
                    return com.cyc.cycjava.cycl.dictionary_contents.dictionary_contents_style_error(v_dictionary_contents);
                }
            }
        }
    }

    /**
     * Returns an iterator for DICTIONARY-CONTENTS.
     * Values returned are tuples of the form (<key> <value>).
     */
    @LispMethod(comment = "Returns an iterator for DICTIONARY-CONTENTS.\r\nValues returned are tuples of the form (<key> <value>).\nReturns an iterator for DICTIONARY-CONTENTS.\nValues returned are tuples of the form (<key> <value>).")
    public static SubLObject new_dictionary_contents_iterator(final SubLObject v_dictionary_contents) {
        final SubLObject pcase_var = dictionary_contents_style(v_dictionary_contents);
        if (pcase_var.eql($ALIST)) {
            return iteration.new_alist_iterator(v_dictionary_contents);
        }
        if (pcase_var.eql($HASHTABLE)) {
            return iteration.new_hash_table_iterator(v_dictionary_contents);
        }
        return dictionary_contents_style_error(v_dictionary_contents);
    }

    /**
     * Iterate over DICTIONARY-CONTENTS, binding KEY and VALUE to each key and value indexed.
     * BODY is executed once within the scope of each binding of KEY VALUE.
     * Iteration halts as soon as DONE becomes non-nil.
     */
    @LispMethod(comment = "Iterate over DICTIONARY-CONTENTS, binding KEY and VALUE to each key and value indexed.\r\nBODY is executed once within the scope of each binding of KEY VALUE.\r\nIteration halts as soon as DONE becomes non-nil.\nIterate over DICTIONARY-CONTENTS, binding KEY and VALUE to each key and value indexed.\nBODY is executed once within the scope of each binding of KEY VALUE.\nIteration halts as soon as DONE becomes non-nil.")
    public static final SubLObject do_dictionary_contents_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt6);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject key = NIL;
                    SubLObject value = NIL;
                    SubLObject v_dictionary_contents = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt6);
                    key = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt6);
                    value = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt6);
                    v_dictionary_contents = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_1 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt6);
                            current_1 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt6);
                            if (NIL == member(current_1, $list_alt7, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_1 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt6);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject iteration_state = $sym10$ITERATION_STATE;
                                return list(CLET, list(list(iteration_state, list(DO_DICTIONARY_CONTENTS_STATE, v_dictionary_contents))), list(UNTIL, list(COR, done, list($sym15$DO_DICTIONARY_CONTENTS_DONE_, iteration_state)), listS(CMULTIPLE_VALUE_BIND, list(key, value), list(DO_DICTIONARY_CONTENTS_KEY_VALUE, iteration_state), append(body, list(list(CSETQ, iteration_state, list(DO_DICTIONARY_CONTENTS_NEXT, iteration_state)))))), list(DO_DICTIONARY_CONTENTS_FINALIZE, iteration_state));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Iterate over DICTIONARY-CONTENTS, binding KEY and VALUE to each key and value indexed.
     * BODY is executed once within the scope of each binding of KEY VALUE.
     * Iteration halts as soon as DONE becomes non-nil.
     */
    @LispMethod(comment = "Iterate over DICTIONARY-CONTENTS, binding KEY and VALUE to each key and value indexed.\r\nBODY is executed once within the scope of each binding of KEY VALUE.\r\nIteration halts as soon as DONE becomes non-nil.\nIterate over DICTIONARY-CONTENTS, binding KEY and VALUE to each key and value indexed.\nBODY is executed once within the scope of each binding of KEY VALUE.\nIteration halts as soon as DONE becomes non-nil.")
    public static SubLObject do_dictionary_contents(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list9);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = NIL;
        SubLObject value = NIL;
        SubLObject v_dictionary_contents = NIL;
        destructuring_bind_must_consp(current, datum, $list9);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list9);
        value = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list9);
        v_dictionary_contents = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list9);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list9);
            if (NIL == member(current_$1, $list10, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list9);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject iteration_state = $sym13$ITERATION_STATE;
        return list(CLET, list(list(iteration_state, list(DO_DICTIONARY_CONTENTS_STATE, v_dictionary_contents))), list(UNTIL, list(COR, done, list($sym18$DO_DICTIONARY_CONTENTS_DONE_, iteration_state)), listS(CMULTIPLE_VALUE_BIND, list(key, value), list(DO_DICTIONARY_CONTENTS_KEY_VALUE, iteration_state), append(body, list(list(CSETQ, iteration_state, list(DO_DICTIONARY_CONTENTS_NEXT, iteration_state)))))), list(DO_DICTIONARY_CONTENTS_FINALIZE, iteration_state));
    }

    public static final SubLObject do_dictionary_contents_state_alt(SubLObject v_dictionary_contents) {
        {
            SubLObject pcase_var = com.cyc.cycjava.cycl.dictionary_contents.dictionary_contents_style(v_dictionary_contents);
            if (pcase_var.eql($ALIST)) {
                return v_dictionary_contents;
            } else {
                if (pcase_var.eql($HASHTABLE)) {
                    return hashtables_high.make_hash_table_iterator(v_dictionary_contents);
                } else {
                    return com.cyc.cycjava.cycl.dictionary_contents.dictionary_contents_style_error(v_dictionary_contents);
                }
            }
        }
    }

    public static SubLObject do_dictionary_contents_state(final SubLObject v_dictionary_contents) {
        final SubLObject pcase_var = dictionary_contents_style(v_dictionary_contents);
        if (pcase_var.eql($ALIST)) {
            return v_dictionary_contents;
        }
        if (pcase_var.eql($HASHTABLE)) {
            return hashtables_high.make_hash_table_iterator(v_dictionary_contents);
        }
        return dictionary_contents_style_error(v_dictionary_contents);
    }

    public static final SubLObject do_dictionary_contents_key_value_alt(SubLObject state) {
        if (state.isList()) {
            {
                SubLObject key_value_pair = state.first();
                SubLObject key = key_value_pair.first();
                SubLObject value = key_value_pair.rest();
                return values(key, value);
            }
        } else {
            {
                SubLObject key = hashtables_high.hash_table_iterator_key(state);
                SubLObject value = hashtables_high.hash_table_iterator_value(state);
                return values(key, value);
            }
        }
    }

    public static SubLObject do_dictionary_contents_key_value(final SubLObject state) {
        if (state.isList()) {
            final SubLObject key_value_pair = state.first();
            final SubLObject key = key_value_pair.first();
            final SubLObject value = key_value_pair.rest();
            return subl_promotions.values2(key, value);
        }
        final SubLObject key2 = hashtables_high.hash_table_iterator_key(state);
        final SubLObject value2 = hashtables_high.hash_table_iterator_value(state);
        return subl_promotions.values2(key2, value2);
    }

    public static final SubLObject do_dictionary_contents_next_alt(SubLObject state) {
        if (state.isList()) {
            return state.rest();
        } else {
            return hashtables_high.hash_table_iterator_next(state);
        }
    }

    public static SubLObject do_dictionary_contents_next(final SubLObject state) {
        if (state.isList()) {
            return state.rest();
        }
        return hashtables_high.hash_table_iterator_next(state);
    }

    public static final SubLObject do_dictionary_contents_doneP_alt(SubLObject state) {
        if (state.isList()) {
            return sublisp_null(state);
        } else {
            return hashtables_high.hash_table_iterator_done_p(state);
        }
    }

    public static SubLObject do_dictionary_contents_doneP(final SubLObject state) {
        if (state.isList()) {
            return sublisp_null(state);
        }
        return hashtables_high.hash_table_iterator_done_p(state);
    }

    public static final SubLObject do_dictionary_contents_finalize_alt(SubLObject state) {
        if (NIL != hashtables_high.hash_table_iterator_p(state)) {
            hashtables_high.destroy_hash_table_iterator(state);
        }
        return NIL;
    }

    public static SubLObject do_dictionary_contents_finalize(final SubLObject state) {
        if (NIL != hashtables_high.hash_table_iterator_p(state)) {
            hashtables_high.destroy_hash_table_iterator(state);
        }
        return NIL;
    }

    /**
     * Map across the key/value pairs of DICTIONARY-CONTENTS,
     * applying FUNCTION to (KEY VALUE ARGS).
     * Function should have a formal parameter list of (key value . args).
     *
     * @return NIL
     */
    @LispMethod(comment = "Map across the key/value pairs of DICTIONARY-CONTENTS,\r\napplying FUNCTION to (KEY VALUE ARGS).\r\nFunction should have a formal parameter list of (key value . args).\r\n\r\n@return NIL\nMap across the key/value pairs of DICTIONARY-CONTENTS,\napplying FUNCTION to (KEY VALUE ARGS).\nFunction should have a formal parameter list of (key value . args).")
    public static final SubLObject map_dictionary_contents_alt(SubLObject v_dictionary_contents, SubLObject function, SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject iteration_state = com.cyc.cycjava.cycl.dictionary_contents.do_dictionary_contents_state(v_dictionary_contents);
                while (NIL == com.cyc.cycjava.cycl.dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject key = com.cyc.cycjava.cycl.dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject value = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        apply(function, key, new SubLObject[]{ value, args });
                        iteration_state = com.cyc.cycjava.cycl.dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                com.cyc.cycjava.cycl.dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
            return NIL;
        }
    }

    @LispMethod(comment = "Map across the key/value pairs of DICTIONARY-CONTENTS,\r\napplying FUNCTION to (KEY VALUE ARGS).\r\nFunction should have a formal parameter list of (key value . args).\r\n\r\n@return NIL\nMap across the key/value pairs of DICTIONARY-CONTENTS,\napplying FUNCTION to (KEY VALUE ARGS).\nFunction should have a formal parameter list of (key value . args).")
    public static SubLObject map_dictionary_contents(final SubLObject v_dictionary_contents, final SubLObject function, SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject iteration_state;
        for (iteration_state = do_dictionary_contents_state(v_dictionary_contents); NIL == do_dictionary_contents_doneP(iteration_state); iteration_state = do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = do_dictionary_contents_key_value(iteration_state);
            final SubLObject value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            apply(function, key, new SubLObject[]{ value, args });
        }
        do_dictionary_contents_finalize(iteration_state);
        return NIL;
    }/**
     * Map across the key/value pairs of DICTIONARY-CONTENTS,
     * applying FUNCTION to (KEY VALUE ARGS).
     * Function should have a formal parameter list of (key value . args).
     *
     * @return NIL
     */


    /**
     *
     *
     * @return list; a list of all keys of DICTIONARY-CONTENTS
     */
    @LispMethod(comment = "@return list; a list of all keys of DICTIONARY-CONTENTS")
    public static final SubLObject dictionary_contents_keys_alt(SubLObject v_dictionary_contents) {
        {
            SubLObject pcase_var = com.cyc.cycjava.cycl.dictionary_contents.dictionary_contents_style(v_dictionary_contents);
            if (pcase_var.eql($ALIST)) {
                return list_utilities.alist_keys(v_dictionary_contents);
            } else {
                if (pcase_var.eql($HASHTABLE)) {
                    return hash_table_utilities.hash_table_keys(v_dictionary_contents);
                } else {
                    return com.cyc.cycjava.cycl.dictionary_contents.dictionary_contents_style_error(v_dictionary_contents);
                }
            }
        }
    }

    /**
     *
     *
     * @return list; a list of all keys of DICTIONARY-CONTENTS
     */
    @LispMethod(comment = "@return list; a list of all keys of DICTIONARY-CONTENTS")
    public static SubLObject dictionary_contents_keys(final SubLObject v_dictionary_contents) {
        final SubLObject pcase_var = dictionary_contents_style(v_dictionary_contents);
        if (pcase_var.eql($ALIST)) {
            return list_utilities.alist_keys(v_dictionary_contents);
        }
        if (pcase_var.eql($HASHTABLE)) {
            return hash_table_utilities.hash_table_keys(v_dictionary_contents);
        }
        return dictionary_contents_style_error(v_dictionary_contents);
    }

    /**
     *
     *
     * @return list; a list of all values of DICTIONARY-CONTENTS
     */
    @LispMethod(comment = "@return list; a list of all values of DICTIONARY-CONTENTS")
    public static final SubLObject dictionary_contents_values_alt(SubLObject v_dictionary_contents) {
        {
            SubLObject pcase_var = com.cyc.cycjava.cycl.dictionary_contents.dictionary_contents_style(v_dictionary_contents);
            if (pcase_var.eql($ALIST)) {
                return list_utilities.alist_values(v_dictionary_contents);
            } else {
                if (pcase_var.eql($HASHTABLE)) {
                    return hash_table_utilities.hash_table_values(v_dictionary_contents);
                } else {
                    return com.cyc.cycjava.cycl.dictionary_contents.dictionary_contents_style_error(v_dictionary_contents);
                }
            }
        }
    }

    /**
     *
     *
     * @return list; a list of all values of DICTIONARY-CONTENTS
     */
    @LispMethod(comment = "@return list; a list of all values of DICTIONARY-CONTENTS")
    public static SubLObject dictionary_contents_values(final SubLObject v_dictionary_contents) {
        final SubLObject pcase_var = dictionary_contents_style(v_dictionary_contents);
        if (pcase_var.eql($ALIST)) {
            return list_utilities.alist_values(v_dictionary_contents);
        }
        if (pcase_var.eql($HASHTABLE)) {
            return hash_table_utilities.hash_table_values(v_dictionary_contents);
        }
        return dictionary_contents_style_error(v_dictionary_contents);
    }

    /**
     *
     *
     * @return the first key that comes to hand.
     */
    @LispMethod(comment = "@return the first key that comes to hand.")
    public static final SubLObject dictionary_contents_random_key_alt(SubLObject v_dictionary_contents) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject first_key = NIL;
                SubLObject iteration_state = com.cyc.cycjava.cycl.dictionary_contents.do_dictionary_contents_state(v_dictionary_contents);
                while (!((NIL != first_key) || (NIL != com.cyc.cycjava.cycl.dictionary_contents.do_dictionary_contents_doneP(iteration_state)))) {
                    thread.resetMultipleValues();
                    {
                        SubLObject key = com.cyc.cycjava.cycl.dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject value = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        first_key = key;
                        iteration_state = com.cyc.cycjava.cycl.dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                com.cyc.cycjava.cycl.dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                return first_key;
            }
        }
    }

    /**
     *
     *
     * @return the first key that comes to hand.
     */
    @LispMethod(comment = "@return the first key that comes to hand.")
    public static SubLObject dictionary_contents_random_key(final SubLObject v_dictionary_contents) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject first_key;
        SubLObject iteration_state;
        SubLObject key;
        for (first_key = NIL, iteration_state = do_dictionary_contents_state(v_dictionary_contents); (NIL == first_key) && (NIL == do_dictionary_contents_doneP(iteration_state)); first_key = key , iteration_state = do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            key = do_dictionary_contents_key_value(iteration_state);
            final SubLObject value = thread.secondMultipleValue();
            thread.resetMultipleValues();
        }
        do_dictionary_contents_finalize(iteration_state);
        return first_key;
    }

    public static SubLObject declare_dictionary_contents_file() {
        declareFunction("dictionary_contents_style", "DICTIONARY-CONTENTS-STYLE", 1, 0, false);
        declareFunction("dictionary_contents_style_error", "DICTIONARY-CONTENTS-STYLE-ERROR", 1, 0, false);
        declareFunction("dictionary_contents_lookup_alist_style", "DICTIONARY-CONTENTS-LOOKUP-ALIST-STYLE", 4, 0, false);
        declareFunction("dictionary_contents_lookup_without_values_alist_style", "DICTIONARY-CONTENTS-LOOKUP-WITHOUT-VALUES-ALIST-STYLE", 4, 0, false);
        declareFunction("dictionary_contents_nlookup_without_values_alist_style", "DICTIONARY-CONTENTS-NLOOKUP-WITHOUT-VALUES-ALIST-STYLE", 4, 0, false);
        declareFunction("dictionary_contents_enter_alist_style", "DICTIONARY-CONTENTS-ENTER-ALIST-STYLE", 4, 0, false);
        declareFunction("dictionary_contents_delete_alist_style", "DICTIONARY-CONTENTS-DELETE-ALIST-STYLE", 3, 0, false);
        declareFunction("dictionary_contents_lookup_hashtable_style", "DICTIONARY-CONTENTS-LOOKUP-HASHTABLE-STYLE", 3, 0, false);
        declareFunction("dictionary_contents_lookup_without_values_hashtable_style", "DICTIONARY-CONTENTS-LOOKUP-WITHOUT-VALUES-HASHTABLE-STYLE", 3, 0, false);
        declareFunction("dictionary_contents_enter_hashtable_style", "DICTIONARY-CONTENTS-ENTER-HASHTABLE-STYLE", 3, 0, false);
        declareFunction("dictionary_contents_delete_hashtable_style", "DICTIONARY-CONTENTS-DELETE-HASHTABLE-STYLE", 2, 0, false);
        declareFunction("dictionary_contents_p", "DICTIONARY-CONTENTS-P", 1, 0, false);
        declareFunction("new_dictionary_contents", "NEW-DICTIONARY-CONTENTS", 0, 2, false);
        declareFunction("copy_dictionary_contents", "COPY-DICTIONARY-CONTENTS", 1, 0, false);
        declareFunction("dictionary_contents_size", "DICTIONARY-CONTENTS-SIZE", 1, 0, false);
        declareFunction("dictionary_contents_empty_p", "DICTIONARY-CONTENTS-EMPTY-P", 1, 0, false);
        declareFunction("non_empty_dictionary_contents_p", "NON-EMPTY-DICTIONARY-CONTENTS-P", 1, 0, false);
        declareFunction("dictionary_contents_has_keyP", "DICTIONARY-CONTENTS-HAS-KEY?", 3, 0, false);
        declareFunction("dictionary_contents_lookup", "DICTIONARY-CONTENTS-LOOKUP", 3, 1, false);
        declareFunction("dictionary_contents_lookup_without_values", "DICTIONARY-CONTENTS-LOOKUP-WITHOUT-VALUES", 3, 1, false);
        declareFunction("dictionary_contents_nlookup_without_values", "DICTIONARY-CONTENTS-NLOOKUP-WITHOUT-VALUES", 3, 1, false);
        declareFunction("dictionary_contents_enter", "DICTIONARY-CONTENTS-ENTER", 4, 0, false);
        declareFunction("dictionary_contents_delete", "DICTIONARY-CONTENTS-DELETE", 3, 0, false);
        declareFunction("clear_dictionary_contents", "CLEAR-DICTIONARY-CONTENTS", 1, 0, false);
        declareFunction("new_dictionary_contents_iterator", "NEW-DICTIONARY-CONTENTS-ITERATOR", 1, 0, false);
        declareMacro("do_dictionary_contents", "DO-DICTIONARY-CONTENTS");
        declareFunction("do_dictionary_contents_state", "DO-DICTIONARY-CONTENTS-STATE", 1, 0, false);
        declareFunction("do_dictionary_contents_key_value", "DO-DICTIONARY-CONTENTS-KEY-VALUE", 1, 0, false);
        declareFunction("do_dictionary_contents_next", "DO-DICTIONARY-CONTENTS-NEXT", 1, 0, false);
        declareFunction("do_dictionary_contents_doneP", "DO-DICTIONARY-CONTENTS-DONE?", 1, 0, false);
        declareFunction("do_dictionary_contents_finalize", "DO-DICTIONARY-CONTENTS-FINALIZE", 1, 0, false);
        declareFunction("map_dictionary_contents", "MAP-DICTIONARY-CONTENTS", 2, 1, false);
        declareFunction("dictionary_contents_keys", "DICTIONARY-CONTENTS-KEYS", 1, 0, false);
        declareFunction("dictionary_contents_values", "DICTIONARY-CONTENTS-VALUES", 1, 0, false);
        declareFunction("dictionary_contents_random_key", "DICTIONARY-CONTENTS-RANDOM-KEY", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_dictionary_contents_file() {
        deflexical("*DICTIONARY-CONTENTS-HIGH-WATER-MARK*", $int$40);
        deflexical("*DICTIONARY-CONTENTS-LOW-WATER-MARK*", $int$30);
        return NIL;
    }

    public static final SubLObject setup_dictionary_contents_file_alt() {
        register_macro_helper(DO_DICTIONARY_CONTENTS_STATE, DO_DICTIONARY_CONTENTS);
        register_macro_helper(DO_DICTIONARY_CONTENTS_KEY_VALUE, DO_DICTIONARY);
        register_macro_helper(DO_DICTIONARY_CONTENTS_NEXT, DO_DICTIONARY);
        register_macro_helper($sym15$DO_DICTIONARY_CONTENTS_DONE_, DO_DICTIONARY);
        register_macro_helper(DO_DICTIONARY_CONTENTS_FINALIZE, DO_DICTIONARY);
        return NIL;
    }

    public static SubLObject setup_dictionary_contents_file() {
        if (SubLFiles.USE_V1) {
            SubLSpecialOperatorDeclarations.proclaim($list2);
            SubLSpecialOperatorDeclarations.proclaim($list7);
            SubLSpecialOperatorDeclarations.proclaim($list8);
            register_macro_helper(DO_DICTIONARY_CONTENTS_STATE, DO_DICTIONARY_CONTENTS);
            register_macro_helper(DO_DICTIONARY_CONTENTS_KEY_VALUE, DO_DICTIONARY);
            register_macro_helper(DO_DICTIONARY_CONTENTS_NEXT, DO_DICTIONARY);
            register_macro_helper($sym18$DO_DICTIONARY_CONTENTS_DONE_, DO_DICTIONARY);
            register_macro_helper(DO_DICTIONARY_CONTENTS_FINALIZE, DO_DICTIONARY);
        }
        if (SubLFiles.USE_V2) {
            register_macro_helper($sym15$DO_DICTIONARY_CONTENTS_DONE_, DO_DICTIONARY);
        }
        return NIL;
    }

    public static SubLObject setup_dictionary_contents_file_Previous() {
        SubLSpecialOperatorDeclarations.proclaim($list2);
        SubLSpecialOperatorDeclarations.proclaim($list7);
        SubLSpecialOperatorDeclarations.proclaim($list8);
        register_macro_helper(DO_DICTIONARY_CONTENTS_STATE, DO_DICTIONARY_CONTENTS);
        register_macro_helper(DO_DICTIONARY_CONTENTS_KEY_VALUE, DO_DICTIONARY);
        register_macro_helper(DO_DICTIONARY_CONTENTS_NEXT, DO_DICTIONARY);
        register_macro_helper($sym18$DO_DICTIONARY_CONTENTS_DONE_, DO_DICTIONARY);
        register_macro_helper(DO_DICTIONARY_CONTENTS_FINALIZE, DO_DICTIONARY);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_dictionary_contents_file();
    }

    @Override
    public void initializeVariables() {
        init_dictionary_contents_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_dictionary_contents_file();
    }

    static {
    }

    static private final SubLString $str_alt5$Corrupted_dictionary_contents__un = makeString("Corrupted dictionary-contents; unsupported style ~S.~%");

    static private final SubLList $list_alt6 = list(list(makeSymbol("KEY"), makeSymbol("VALUE"), makeSymbol("DICTIONARY-CONTENTS"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt7 = list($DONE);

    static private final SubLSymbol $sym10$ITERATION_STATE = makeUninternedSymbol("ITERATION-STATE");

    static private final SubLSymbol $sym15$DO_DICTIONARY_CONTENTS_DONE_ = makeSymbol("DO-DICTIONARY-CONTENTS-DONE?");
}

/**
 * Total time: 153 ms
 */
