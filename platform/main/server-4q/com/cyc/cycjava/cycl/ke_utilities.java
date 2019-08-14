/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.valid_constantP;
import static com.cyc.cycjava.cycl.control_vars.$read_require_constant_exists$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_colon;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_dollar;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hyphen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_lparen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_percent;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_question;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quote;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_rparen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.charE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.char_code;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.digit_char_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.evenp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.subseq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.set_aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class ke_utilities extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new ke_utilities();

 public static final String myName = "com.cyc.cycjava.cycl.ke_utilities";


    // defparameter
    // Definitions
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $ke_state$ = makeSymbol("*KE-STATE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $ke_debug$ = makeSymbol("*KE-DEBUG*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $ke_state_keys$ = makeSymbol("*KE-STATE-KEYS*");

    // defparameter
    /**
     * A list of characters which may occur in KE Text files, but cannot be part of
     * a constant name.
     */
    @LispMethod(comment = "A list of characters which may occur in KE Text files, but cannot be part of\r\na constant name.\ndefparameter\nA list of characters which may occur in KE Text files, but cannot be part of\na constant name.")
    public static final SubLSymbol $ke_non_constant_name_chars$ = makeSymbol("*KE-NON-CONSTANT-NAME-CHARS*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(new SubLObject[]{ cons(makeKeyword("MT"), ZERO_INTEGER), cons(makeKeyword("TV"), ONE_INTEGER), cons(makeKeyword("DIRECTION"), TWO_INTEGER), cons(makeKeyword("CONSTANT"), THREE_INTEGER), cons(makeKeyword("UNKNOWNS"), FOUR_INTEGER), cons(makeKeyword("ALREADY-CREATED"), FIVE_INTEGER), cons(makeKeyword("OK-TOKEN-FORMS"), SIX_INTEGER), cons(makeKeyword("MALFORMED"), SEVEN_INTEGER), cons(makeKeyword("ALREADY-IN-KB"), EIGHT_INTEGER), cons(makeKeyword("FORMS-TO-EVAL"), NINE_INTEGER), cons($MODE, TEN_INTEGER), cons(makeKeyword("COMPOSE-HISTORY"), ELEVEN_INTEGER), cons(makeKeyword("NOT-IN-KB"), TWELVE_INTEGER), cons(makeKeyword("NOT-VALID-CONSTANTS"), THIRTEEN_INTEGER), cons(makeKeyword("ALREADY-CONSTANTS"), FOURTEEN_INTEGER), cons(makeKeyword("APPLICATION"), FIFTEEN_INTEGER), cons(makeKeyword("DEFAULT-MT"), SIXTEEN_INTEGER), cons(makeKeyword("DIALOG-SCRIPT"), SEVENTEEN_INTEGER) });

    static private final SubLList $list1 = list(new SubLObject[]{ CHAR_space, CHAR_quotation, CHAR_quote, CHAR_lparen, CHAR_rparen, CHAR_hash, CHAR_percent, CHAR_question, CHAR_dollar, CHAR_colon });

    static private final SubLList $list3 = list(NINE_INTEGER, TEN_INTEGER, THIRTEEN_INTEGER);

    private static final SubLSymbol INVALID_CONSTANT_NAME_CHAR_P = makeSymbol("INVALID-CONSTANT-NAME-CHAR-P");

    static private final SubLString $$$nil = makeString("nil");

    static private final SubLList $list6 = list(CHAR_space, CHAR_rparen);

    static private final SubLList $list7 = list(CHAR_space, CHAR_lparen);

    private static final SubLSymbol $sym8$_EXIT = makeSymbol("%EXIT");



    private static final SubLInteger $int$127 = makeInteger(127);



    /**
     *
     *
     * @unknown remove call to this from cb-similarity @owner jantos
     */
    @LispMethod(comment = "@unknown remove call to this from cb-similarity @owner jantos")
    public static final SubLObject ke_value_alt(SubLObject cyclist, SubLObject key) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return misc_utilities.get_vector_indexed_val(cyclist, $ke_state$.getDynamicValue(thread), key, $ke_state_keys$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        }
    }

    /**
     *
     *
     * @unknown remove call to this from cb-similarity @owner jantos
     */
    @LispMethod(comment = "@unknown remove call to this from cb-similarity @owner jantos")
    public static SubLObject ke_value(final SubLObject cyclist, final SubLObject key) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return misc_utilities.get_vector_indexed_val(cyclist, $ke_state$.getDynamicValue(thread), key, $ke_state_keys$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject change_ke_value_alt(SubLObject cyclist, SubLObject key, SubLObject method, SubLObject v_new) {
        if (method == UNPROVIDED) {
            method = $REPLACE;
        }
        if (v_new == UNPROVIDED) {
            v_new = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return misc_utilities.update_vector_indexed_val(cyclist, $ke_state$.getDynamicValue(thread), key, $ke_state_keys$.getDynamicValue(thread), v_new, method, symbol_function(EQUAL), symbol_function(EQUAL), symbol_function(EQUAL));
        }
    }

    public static SubLObject change_ke_value(final SubLObject cyclist, final SubLObject key, SubLObject method, SubLObject v_new) {
        if (method == UNPROVIDED) {
            method = $REPLACE;
        }
        if (v_new == UNPROVIDED) {
            v_new = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return misc_utilities.update_vector_indexed_val(cyclist, $ke_state$.getDynamicValue(thread), key, $ke_state_keys$.getDynamicValue(thread), v_new, method, symbol_function(EQUAL), symbol_function(EQUAL), symbol_function(EQUAL));
    }

    /**
     * used only by cycl-from-string
     */
    @LispMethod(comment = "used only by cycl-from-string")
    public static final SubLObject parens_equalP_alt(SubLObject string) {
        if (string.isString()) {
            {
                SubLObject left = string_utilities.count_chars_in_string(string, CHAR_lparen);
                SubLObject right = string_utilities.count_chars_in_string(string, CHAR_rparen);
                return numE(left, right);
            }
        } else {
            return NIL;
        }
    }

    /**
     * used only by cycl-from-string
     */
    @LispMethod(comment = "used only by cycl-from-string")
    public static SubLObject parens_equalP(final SubLObject string) {
        if (string.isString()) {
            final SubLObject left = string_utilities.count_chars_in_string(string, CHAR_lparen);
            final SubLObject right = string_utilities.count_chars_in_string(string, CHAR_rparen);
            return numE(left, right);
        }
        return NIL;
    }

    /**
     * used only by cycl-from-string
     */
    @LispMethod(comment = "used only by cycl-from-string")
    public static final SubLObject dqs_equalP_alt(SubLObject string) {
        if (string.isString()) {
            {
                SubLObject n = string_utilities.count_chars_in_string(string, CHAR_quotation);
                return evenp(n);
            }
        } else {
            return NIL;
        }
    }

    /**
     * used only by cycl-from-string
     */
    @LispMethod(comment = "used only by cycl-from-string")
    public static SubLObject dqs_equalP(final SubLObject string) {
        if (string.isString()) {
            final SubLObject n = string_utilities.count_chars_in_string(string, CHAR_quotation);
            return evenp(n);
        }
        return NIL;
    }

    /**
     * Add #$ to the front of appropriate constants in string.
     * used only by cycl-from-string
     */
    @LispMethod(comment = "Add #$ to the front of appropriate constants in string.\r\nused only by cycl-from-string\nAdd #$ to the front of appropriate constants in string.\nused only by cycl-from-string")
    public static final SubLObject hdify_string_alt(SubLObject string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (string.isString() && length(string).numG(ZERO_INTEGER)) {
                {
                    SubLObject temp = Strings.make_string(add(ONE_INTEGER, multiply(length(string), TWO_INTEGER)), UNPROVIDED);
                    SubLObject i = ZERO_INTEGER;
                    SubLObject inside_dqP = NIL;
                    SubLObject len = length(string);
                    SubLObject temp_i = NIL;
                    for (temp_i = ZERO_INTEGER; !i.numGE(len); temp_i = add(temp_i, ONE_INTEGER)) {
                        {
                            SubLObject lc = Strings.sublisp_char(string, i);
                            SubLObject fc = (subtract(i, ONE_INTEGER).numGE(ZERO_INTEGER)) ? ((SubLObject) (Strings.sublisp_char(string, subtract(i, ONE_INTEGER)))) : NIL;
                            SubLObject nc1 = (add(i, ONE_INTEGER).numL(len)) ? ((SubLObject) (Strings.sublisp_char(string, add(i, ONE_INTEGER)))) : NIL;
                            SubLObject nc2 = (add(i, TWO_INTEGER).numL(len)) ? ((SubLObject) (Strings.sublisp_char(string, add(i, TWO_INTEGER)))) : NIL;
                            SubLObject nc3 = (add(i, THREE_INTEGER).numL(len)) ? ((SubLObject) (Strings.sublisp_char(string, add(i, THREE_INTEGER)))) : NIL;
                            if (((((((NIL == find(lc, $ke_non_constant_name_chars$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && (!(lc.isChar() && (NIL != find(char_code(lc), $list_alt3, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))))) && (NIL == inside_dqP)) && (NIL == string_utilities.digit_stringP(subseq(string, i, position_if(symbol_function(INVALID_CONSTANT_NAME_CHAR_P), string, symbol_function(IDENTITY), i, UNPROVIDED))))) && (!(((lc == CHAR_hyphen) && nc1.isChar()) && (NIL != digit_char_p(nc1, UNPROVIDED))))) && (!(string_utilities.char_list_to_string(list(lc, nc1, nc2)).equalp($$$nil) && (NIL != find(nc3, $list_alt6, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))))) && ((NIL != find(fc, $list_alt7, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL == fc))) {
                                set_aref(temp, temp_i, CHAR_hash);
                                temp_i = add(temp_i, ONE_INTEGER);
                                set_aref(temp, temp_i, constant_reader.constant_reader_macro_char());
                                temp_i = add(temp_i, ONE_INTEGER);
                                set_aref(temp, temp_i, lc);
                                i = add(i, ONE_INTEGER);
                            } else {
                                if ((NIL == inside_dqP) && (fc == CHAR_quote)) {
                                    temp_i = subtract(temp_i, ONE_INTEGER);
                                    set_aref(temp, temp_i, lc);
                                    i = add(i, ONE_INTEGER);
                                } else {
                                    set_aref(temp, temp_i, lc);
                                    i = add(i, ONE_INTEGER);
                                }
                            }
                            if ((NIL != charE(CHAR_quotation, lc)) && (NIL == inside_dqP)) {
                                inside_dqP = T;
                            } else {
                                if ((NIL != charE(CHAR_quotation, lc)) && (NIL != inside_dqP)) {
                                    inside_dqP = NIL;
                                }
                            }
                        }
                    }
                    {
                        SubLObject ans = string_utilities.trim_sides(temp, UNPROVIDED);
                        if (length(ans).numGE(ZERO_INTEGER)) {
                            return ans;
                        } else {
                            return NIL;
                        }
                    }
                }
            } else {
                return NIL;
            }
        }
    }

    /**
     * Add #$ to the front of appropriate constants in string.
     * used only by cycl-from-string
     */
    @LispMethod(comment = "Add #$ to the front of appropriate constants in string.\r\nused only by cycl-from-string\nAdd #$ to the front of appropriate constants in string.\nused only by cycl-from-string")
    public static SubLObject hdify_string(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((!string.isString()) || (!length(string).numG(ZERO_INTEGER))) {
            return NIL;
        }
        final SubLObject temp = Strings.make_string(add(ONE_INTEGER, multiply(length(string), TWO_INTEGER)), UNPROVIDED);
        SubLObject i = ZERO_INTEGER;
        SubLObject inside_dqP = NIL;
        final SubLObject len = length(string);
        SubLObject temp_i = NIL;
        temp_i = ZERO_INTEGER;
        while (!i.numGE(len)) {
            final SubLObject lc = Strings.sublisp_char(string, i);
            final SubLObject fc = (subtract(i, ONE_INTEGER).numGE(ZERO_INTEGER)) ? Strings.sublisp_char(string, subtract(i, ONE_INTEGER)) : NIL;
            final SubLObject nc1 = (add(i, ONE_INTEGER).numL(len)) ? Strings.sublisp_char(string, add(i, ONE_INTEGER)) : NIL;
            final SubLObject nc2 = (add(i, TWO_INTEGER).numL(len)) ? Strings.sublisp_char(string, add(i, TWO_INTEGER)) : NIL;
            final SubLObject nc3 = (add(i, THREE_INTEGER).numL(len)) ? Strings.sublisp_char(string, add(i, THREE_INTEGER)) : NIL;
            if (((((((NIL == find(lc, $ke_non_constant_name_chars$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && ((!lc.isChar()) || (NIL == find(char_code(lc), $list3, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)))) && (NIL == inside_dqP)) && (NIL == string_utilities.digit_stringP(subseq(string, i, position_if(symbol_function(INVALID_CONSTANT_NAME_CHAR_P), string, symbol_function(IDENTITY), i, UNPROVIDED))))) && (((!lc.eql(CHAR_hyphen)) || (!nc1.isChar())) || (NIL == digit_char_p(nc1, UNPROVIDED)))) && ((!string_utilities.char_list_to_string(list(lc, nc1, nc2)).equalp($$$nil)) || (NIL == find(nc3, $list6, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)))) && ((NIL != find(fc, $list7, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL == fc))) {
                set_aref(temp, temp_i, CHAR_hash);
                temp_i = add(temp_i, ONE_INTEGER);
                set_aref(temp, temp_i, constant_reader.constant_reader_macro_char());
                temp_i = add(temp_i, ONE_INTEGER);
                set_aref(temp, temp_i, lc);
                i = add(i, ONE_INTEGER);
            } else
                if ((NIL == inside_dqP) && fc.eql(CHAR_quote)) {
                    temp_i = subtract(temp_i, ONE_INTEGER);
                    set_aref(temp, temp_i, lc);
                    i = add(i, ONE_INTEGER);
                } else {
                    set_aref(temp, temp_i, lc);
                    i = add(i, ONE_INTEGER);
                }

            if ((NIL != charE(CHAR_quotation, lc)) && (NIL == inside_dqP)) {
                inside_dqP = T;
            } else
                if ((NIL != charE(CHAR_quotation, lc)) && (NIL != inside_dqP)) {
                    inside_dqP = NIL;
                }

            temp_i = add(temp_i, ONE_INTEGER);
        } 
        final SubLObject ans = string_utilities.trim_sides(temp, UNPROVIDED);
        if (length(ans).numGE(ZERO_INTEGER)) {
            return ans;
        }
        return NIL;
    }

    /**
     * Takes a string.  Returns a CycL expression, if
     * string can be coerced into one.
     */
    @LispMethod(comment = "Takes a string.  Returns a CycL expression, if\r\nstring can be coerced into one.\nTakes a string.  Returns a CycL expression, if\nstring can be coerced into one.")
    public static final SubLObject cycl_from_string_alt(SubLObject string) {
        if (NIL != string_utilities.non_empty_stringP(string)) {
            if (NIL != constant_completion_high.valid_constant_name_p(string)) {
                {
                    SubLObject constant = constants_high.find_constant(string);
                    if (NIL != valid_constantP(constant, UNPROVIDED)) {
                        return constant;
                    }
                }
            }
            if (NIL != kb_utilities.compact_hl_external_id_stringP(string)) {
                {
                    SubLObject v_term = kb_utilities.find_object_by_compact_hl_external_id_string(string);
                    if (NIL != forts.fort_p(v_term)) {
                        return v_term;
                    }
                }
            } else {
                if (NIL != kb_utilities.hl_external_id_string_p(string)) {
                    {
                        SubLObject v_term = kb_utilities.find_object_by_hl_external_id_string(string);
                        if (NIL != forts.fort_p(v_term)) {
                            return v_term;
                        }
                    }
                } else {
                    if (NIL != Guids.guid_string_p(string)) {
                        {
                            SubLObject v_term = constants_high.find_constant_by_guid_string(string);
                            if (NIL != v_term) {
                                return v_term;
                            }
                        }
                    } else {
                        if ((NIL != com.cyc.cycjava.cycl.ke_utilities.parens_equalP(string)) && (NIL != com.cyc.cycjava.cycl.ke_utilities.dqs_equalP(string))) {
                            return read_from_string_ignoring_errors(com.cyc.cycjava.cycl.ke_utilities.hdify_string(string), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Takes a string.  Returns a CycL expression, if\r\nstring can be coerced into one.\nTakes a string.  Returns a CycL expression, if\nstring can be coerced into one.")
    public static SubLObject cycl_from_string(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != string_utilities.non_empty_stringP(string)) {
            if (NIL != constant_completion_high.valid_constant_name_p(string)) {
                final SubLObject constant = constants_high.find_constant(string);
                if (NIL != valid_constantP(constant, UNPROVIDED)) {
                    return constant;
                }
            }
            if (NIL != kb_utilities.compact_hl_external_id_stringP(string)) {
                final SubLObject v_term = kb_utilities.find_object_by_compact_hl_external_id_string(string);
                if (NIL != cycl_grammar.cycl_expression_p(v_term)) {
                    return v_term;
                }
            } else
                if (NIL != kb_utilities.hl_external_id_string_p(string)) {
                    final SubLObject v_term = kb_utilities.find_object_by_hl_external_id_string(string);
                    if (NIL != cycl_grammar.cycl_expression_p(v_term)) {
                        return v_term;
                    }
                } else
                    if (NIL != Guids.guid_string_p(string)) {
                        final SubLObject v_term = constants_high.find_constant_by_guid_string(string);
                        if (NIL != v_term) {
                            return v_term;
                        }
                    } else
                        if ((NIL != parens_equalP(string)) && (NIL != dqs_equalP(string))) {
                            final SubLObject _prev_bind_0 = $read_require_constant_exists$.currentBinding(thread);
                            try {
                                $read_require_constant_exists$.bind(T, thread);
                                SubLObject cycl = read_from_string_ignoring_errors(hdify_string(string), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                if (NIL == cycl) {
                                    cycl = read_from_string_ignoring_errors(hdify_string(kb_utilities.string_remove_nart_affixes(string)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                                return cycl;
                            } finally {
                                $read_require_constant_exists$.rebind(_prev_bind_0, thread);
                            }
                        }



        }
        return NIL;
    }

    /**
     * Return the fort indicated by STRING.
     */
    @LispMethod(comment = "Return the fort indicated by STRING.")
    public static final SubLObject fort_from_string_alt(SubLObject string) {
        {
            SubLObject v_term = com.cyc.cycjava.cycl.ke_utilities.cycl_from_string(string);
            if (NIL != forts.fort_p(v_term)) {
                return v_term;
            }
            if (NIL != term.hl_ground_nautP(v_term)) {
                v_term = narts_high.find_nart(v_term);
                if (NIL != nart_handles.nart_p(v_term)) {
                    return v_term;
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Return the fort indicated by STRING.")
    public static SubLObject fort_from_string(final SubLObject string) {
        SubLObject v_term = cycl_from_string(string);
        if (NIL != forts.fort_p(v_term)) {
            return v_term;
        }
        if (NIL != term.hl_ground_nautP(v_term)) {
            v_term = narts_high.find_nart(v_term);
            if (NIL != nart_handles.nart_p(v_term)) {
                return v_term;
            }
        }
        return NIL;
    }

    /**
     * Return the NART indicated by STRING.
     */
    @LispMethod(comment = "Return the NART indicated by STRING.")
    public static final SubLObject nart_from_string_alt(SubLObject string) {
        {
            SubLObject v_term = com.cyc.cycjava.cycl.ke_utilities.cycl_from_string(string);
            return com.cyc.cycjava.cycl.ke_utilities.nart_from_string_int(v_term);
        }
    }

    @LispMethod(comment = "Return the NART indicated by STRING.")
    public static SubLObject nart_from_string(final SubLObject string) {
        final SubLObject v_term = cycl_from_string(string);
        return nart_from_string_int(v_term);
    }

    public static final SubLObject nart_from_string_int_alt(SubLObject v_term) {
        if (NIL != nart_handles.nart_p(v_term)) {
            return v_term;
        }
        if (NIL != term.hl_ground_nautP(v_term)) {
            v_term = narts_high.find_nart(v_term);
            if (NIL != nart_handles.nart_p(v_term)) {
                return v_term;
            }
        }
        return NIL;
    }

    public static SubLObject nart_from_string_int(SubLObject v_term) {
        if (NIL != nart_handles.nart_p(v_term)) {
            return v_term;
        }
        if (NIL != term.hl_ground_nautP(v_term)) {
            v_term = narts_high.find_nart(v_term);
            if (NIL != nart_handles.nart_p(v_term)) {
                return v_term;
            }
        }
        return NIL;
    }

    /**
     * Return the NAT (NART or closed naut) indicated by STRING.
     */
    @LispMethod(comment = "Return the NAT (NART or closed naut) indicated by STRING.")
    public static final SubLObject nat_from_string_alt(SubLObject string) {
        {
            SubLObject v_term = com.cyc.cycjava.cycl.ke_utilities.cycl_from_string(string);
            SubLObject nart = com.cyc.cycjava.cycl.ke_utilities.nart_from_string_int(v_term);
            if (NIL != nart) {
                return nart;
            }
            if (NIL != term.closed_nautP(v_term, UNPROVIDED)) {
                return v_term;
            }
            return NIL;
        }
    }

    @LispMethod(comment = "Return the NAT (NART or closed naut) indicated by STRING.")
    public static SubLObject nat_from_string(final SubLObject string) {
        final SubLObject v_term = cycl_from_string(string);
        final SubLObject nart = nart_from_string_int(v_term);
        if (NIL != nart) {
            return nart;
        }
        if (NIL != term.closed_nautP(v_term, UNPROVIDED)) {
            return v_term;
        }
        return NIL;
    }

    public static final SubLObject printable_ascii_charP_alt(SubLObject character) {
        {
            SubLObject code = char_code(character);
            return makeBoolean(code.numG($int$31) && code.numL($int$127));
        }
    }

    public static SubLObject printable_ascii_charP(final SubLObject character) {
        final SubLObject code = char_code(character);
        return makeBoolean(code.numG($int$31) && code.numL($int$127));
    }

    /**
     * Substitute a space for every garbage character in string
     * that is not inside an embedded string
     */
    @LispMethod(comment = "Substitute a space for every garbage character in string\r\nthat is not inside an embedded string\nSubstitute a space for every garbage character in string\nthat is not inside an embedded string")
    public static final SubLObject strip_garbage_chars_alt(SubLObject string, SubLObject embedded_strings_tooP) {
        if (embedded_strings_tooP == UNPROVIDED) {
            embedded_strings_tooP = NIL;
        }
        {
            SubLObject inside_dqP = NIL;
            SubLObject string_var = string;
            SubLObject end_var = length(string_var);
            SubLObject end_var_1 = end_var;
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; !i.numGE(end_var_1); i = number_utilities.f_1X(i)) {
                {
                    SubLObject ch = Strings.sublisp_char(string_var, i);
                    SubLObject code = char_code(ch);
                    if (NIL != charE(ch, CHAR_quotation)) {
                        inside_dqP = makeBoolean(NIL == inside_dqP);
                    }
                    if (!((NIL != com.cyc.cycjava.cycl.ke_utilities.printable_ascii_charP(ch)) || (((NIL != inside_dqP) && (NIL != member(code, $list_alt3, UNPROVIDED, UNPROVIDED))) && (NIL == embedded_strings_tooP)))) {
                        Strings.set_char(string, i, CHAR_space);
                    }
                }
            }
        }
        return string;
    }

    @LispMethod(comment = "Substitute a space for every garbage character in string\r\nthat is not inside an embedded string\nSubstitute a space for every garbage character in string\nthat is not inside an embedded string")
    public static SubLObject strip_garbage_chars(final SubLObject string, SubLObject embedded_strings_tooP) {
        if (embedded_strings_tooP == UNPROVIDED) {
            embedded_strings_tooP = NIL;
        }
        SubLObject inside_dqP = NIL;
        SubLObject end_var_$1;
        SubLObject end_var;
        SubLObject i;
        SubLObject ch;
        SubLObject code;
        for (end_var = end_var_$1 = length(string), i = NIL, i = ZERO_INTEGER; !i.numGE(end_var_$1); i = number_utilities.f_1X(i)) {
            ch = Strings.sublisp_char(string, i);
            code = char_code(ch);
            if (NIL != charE(ch, CHAR_quotation)) {
                inside_dqP = makeBoolean(NIL == inside_dqP);
            }
            if ((NIL == printable_ascii_charP(ch)) && (((NIL == inside_dqP) || (NIL == member(code, $list3, UNPROVIDED, UNPROVIDED))) || (NIL != embedded_strings_tooP))) {
                Strings.set_char(string, i, CHAR_space);
            }
        }
        return string;
    }

    /**
     *
     *
     * @unknown remove call to this from cb-similarity @owner jantos
     */
    @LispMethod(comment = "@unknown remove call to this from cb-similarity @owner jantos")
    public static final SubLObject set_tv_to_use_alt(SubLObject predicate) {
        if (com.cyc.cycjava.cycl.ke_utilities.ke_value(operation_communication.the_cyclist(), $TV).equal($UNKNOWN) && (NIL != isa.isa_in_any_mtP(predicate, $$DefaultMonotonicPredicate))) {
            return $MONOTONIC;
        } else {
            if (com.cyc.cycjava.cycl.ke_utilities.ke_value(operation_communication.the_cyclist(), $TV) == $MONOTONIC) {
                return $MONOTONIC;
            } else {
                return $DEFAULT;
            }
        }
    }

    /**
     *
     *
     * @unknown remove call to this from cb-similarity @owner jantos
     */
    @LispMethod(comment = "@unknown remove call to this from cb-similarity @owner jantos")
    public static SubLObject set_tv_to_use(final SubLObject predicate) {
        if (ke_value(operation_communication.the_cyclist(), $TV).equal($UNKNOWN) && (NIL != isa.isa_in_any_mtP(predicate, $$DefaultMonotonicPredicate))) {
            return $MONOTONIC;
        }
        if (ke_value(operation_communication.the_cyclist(), $TV) == $MONOTONIC) {
            return $MONOTONIC;
        }
        return $DEFAULT;
    }

    /**
     * For each string in strings, call fi-create on the
     * string, thus making it into a Cyc constant (unit shell).
     */
    @LispMethod(comment = "For each string in strings, call fi-create on the\r\nstring, thus making it into a Cyc constant (unit shell).\nFor each string in strings, call fi-create on the\nstring, thus making it into a Cyc constant (unit shell).")
    public static final SubLObject constantify_alt(SubLObject strings) {
        {
            SubLObject cdolist_list_var = strings;
            SubLObject s = NIL;
            for (s = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , s = cdolist_list_var.first()) {
                if (NIL == subl_promotions.memberP(s, com.cyc.cycjava.cycl.ke_utilities.ke_value(operation_communication.the_cyclist(), $ALREADY_CREATED), symbol_function(EQUALP), UNPROVIDED)) {
                    ke.ke_create(s);
                    com.cyc.cycjava.cycl.ke_utilities.change_ke_value(operation_communication.the_cyclist(), $ALREADY_CREATED, $CONS, s);
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "For each string in strings, call fi-create on the\r\nstring, thus making it into a Cyc constant (unit shell).\nFor each string in strings, call fi-create on the\nstring, thus making it into a Cyc constant (unit shell).")
    public static SubLObject constantify(final SubLObject strings) {
        SubLObject cdolist_list_var = strings;
        SubLObject s = NIL;
        s = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == subl_promotions.memberP(s, ke_value(operation_communication.the_cyclist(), $ALREADY_CREATED), symbol_function(EQUALP), UNPROVIDED)) {
                ke.ke_create(s);
                change_ke_value(operation_communication.the_cyclist(), $ALREADY_CREATED, $CONS, s);
            }
            cdolist_list_var = cdolist_list_var.rest();
            s = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject declare_ke_utilities_file() {
        declareFunction("ke_value", "KE-VALUE", 2, 0, false);
        declareFunction("change_ke_value", "CHANGE-KE-VALUE", 2, 2, false);
        declareFunction("parens_equalP", "PARENS-EQUAL?", 1, 0, false);
        declareFunction("dqs_equalP", "DQS-EQUAL?", 1, 0, false);
        declareFunction("hdify_string", "HDIFY-STRING", 1, 0, false);
        declareFunction("cycl_from_string", "CYCL-FROM-STRING", 1, 0, false);
        declareFunction("fort_from_string", "FORT-FROM-STRING", 1, 0, false);
        declareFunction("nart_from_string", "NART-FROM-STRING", 1, 0, false);
        declareFunction("nart_from_string_int", "NART-FROM-STRING-INT", 1, 0, false);
        declareFunction("nat_from_string", "NAT-FROM-STRING", 1, 0, false);
        declareFunction("printable_ascii_charP", "PRINTABLE-ASCII-CHAR?", 1, 0, false);
        declareFunction("strip_garbage_chars", "STRIP-GARBAGE-CHARS", 1, 1, false);
        declareFunction("set_tv_to_use", "SET-TV-TO-USE", 1, 0, false);
        declareFunction("constantify", "CONSTANTIFY", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_ke_utilities_file() {
        defparameter("*KE-STATE*", NIL);
        defparameter("*KE-DEBUG*", NIL);
        defparameter("*KE-STATE-KEYS*", $list0);
        defparameter("*KE-NON-CONSTANT-NAME-CHARS*", $list1);
        return NIL;
    }

    public static SubLObject setup_ke_utilities_file() {
        return NIL;
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(new SubLObject[]{ cons(makeKeyword("MT"), ZERO_INTEGER), cons(makeKeyword("TV"), ONE_INTEGER), cons(makeKeyword("DIRECTION"), TWO_INTEGER), cons(makeKeyword("CONSTANT"), THREE_INTEGER), cons(makeKeyword("UNKNOWNS"), FOUR_INTEGER), cons(makeKeyword("ALREADY-CREATED"), FIVE_INTEGER), cons(makeKeyword("OK-TOKEN-FORMS"), SIX_INTEGER), cons(makeKeyword("MALFORMED"), SEVEN_INTEGER), cons(makeKeyword("ALREADY-IN-KB"), EIGHT_INTEGER), cons(makeKeyword("FORMS-TO-EVAL"), NINE_INTEGER), cons($MODE, TEN_INTEGER), cons(makeKeyword("COMPOSE-HISTORY"), ELEVEN_INTEGER), cons(makeKeyword("NOT-IN-KB"), TWELVE_INTEGER), cons(makeKeyword("NOT-VALID-CONSTANTS"), THIRTEEN_INTEGER), cons(makeKeyword("ALREADY-CONSTANTS"), FOURTEEN_INTEGER), cons(makeKeyword("APPLICATION"), FIFTEEN_INTEGER), cons(makeKeyword("DEFAULT-MT"), SIXTEEN_INTEGER), cons(makeKeyword("DIALOG-SCRIPT"), SEVENTEEN_INTEGER) });

    @Override
    public void declareFunctions() {
        declare_ke_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_ke_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_ke_utilities_file();
    }

    static {
    }

    static private final SubLList $list_alt1 = list(new SubLObject[]{ CHAR_space, CHAR_quotation, CHAR_quote, CHAR_lparen, CHAR_rparen, CHAR_hash, CHAR_percent, CHAR_question, CHAR_dollar, CHAR_colon });

    static private final SubLList $list_alt3 = list(NINE_INTEGER, TEN_INTEGER, THIRTEEN_INTEGER);

    static private final SubLList $list_alt6 = list(CHAR_space, CHAR_rparen);

    static private final SubLList $list_alt7 = list(CHAR_space, CHAR_lparen);
}

/**
 * Total time: 226 ms
 */
