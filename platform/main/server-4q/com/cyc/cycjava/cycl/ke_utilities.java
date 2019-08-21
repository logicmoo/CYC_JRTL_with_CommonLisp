package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.ke_utilities;
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
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.ke_utilities.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
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
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EIGHT_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ELEVEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUALP;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FIFTEEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FIVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FOURTEEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FOUR_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.IDENTITY;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NINE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SEVENTEEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SEVEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SIXTEEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SIX_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THIRTEEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWELVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class ke_utilities extends SubLTranslatedFile {
    public static final SubLFile me = new ke_utilities();

    public static final String myName = "com.cyc.cycjava.cycl.ke_utilities";

    public static final String myFingerPrint = "9cacac2f2ae7b6d195d0fab6857479fc8c58c0726adaa88e0fd2abfa370de66a";

    // defparameter
    public static final SubLSymbol $ke_state$ = makeSymbol("*KE-STATE*");

    // defparameter
    public static final SubLSymbol $ke_debug$ = makeSymbol("*KE-DEBUG*");

    // defparameter
    public static final SubLSymbol $ke_state_keys$ = makeSymbol("*KE-STATE-KEYS*");

    // defparameter
    /**
     * A list of characters which may occur in KE Text files, but cannot be part of
     * a constant name.
     */
    public static final SubLSymbol $ke_non_constant_name_chars$ = makeSymbol("*KE-NON-CONSTANT-NAME-CHARS*");

    // Internal Constants
    public static final SubLList $list0 = list(new SubLObject[]{ cons(makeKeyword("MT"), ZERO_INTEGER), cons(makeKeyword("TV"), ONE_INTEGER), cons(makeKeyword("DIRECTION"), TWO_INTEGER), cons(makeKeyword("CONSTANT"), THREE_INTEGER), cons(makeKeyword("UNKNOWNS"), FOUR_INTEGER), cons(makeKeyword("ALREADY-CREATED"), FIVE_INTEGER), cons(makeKeyword("OK-TOKEN-FORMS"), SIX_INTEGER), cons(makeKeyword("MALFORMED"), SEVEN_INTEGER), cons(makeKeyword("ALREADY-IN-KB"), EIGHT_INTEGER), cons(makeKeyword("FORMS-TO-EVAL"), NINE_INTEGER), cons(makeKeyword("MODE"), TEN_INTEGER), cons(makeKeyword("COMPOSE-HISTORY"), ELEVEN_INTEGER), cons(makeKeyword("NOT-IN-KB"), TWELVE_INTEGER), cons(makeKeyword("NOT-VALID-CONSTANTS"), THIRTEEN_INTEGER), cons(makeKeyword("ALREADY-CONSTANTS"), FOURTEEN_INTEGER), cons(makeKeyword("APPLICATION"), FIFTEEN_INTEGER), cons(makeKeyword("DEFAULT-MT"), SIXTEEN_INTEGER), cons(makeKeyword("DIALOG-SCRIPT"), SEVENTEEN_INTEGER) });

    public static final SubLList $list1 = list(new SubLObject[]{ CHAR_space, CHAR_quotation, CHAR_quote, CHAR_lparen, CHAR_rparen, CHAR_hash, CHAR_percent, CHAR_question, CHAR_dollar, CHAR_colon });



    public static final SubLList $list3 = list(NINE_INTEGER, TEN_INTEGER, THIRTEEN_INTEGER);

    public static final SubLSymbol INVALID_CONSTANT_NAME_CHAR_P = makeSymbol("INVALID-CONSTANT-NAME-CHAR-P");

    public static final SubLString $$$nil = makeString("nil");

    public static final SubLList $list6 = list(CHAR_space, CHAR_rparen);

    public static final SubLList $list7 = list(CHAR_space, CHAR_lparen);

    private static final SubLSymbol $sym8$_EXIT = makeSymbol("%EXIT");

    private static final SubLInteger $int$31 = makeInteger(31);

    private static final SubLInteger $int$127 = makeInteger(127);





    private static final SubLObject $$DefaultMonotonicPredicate = reader_make_constant_shell(makeString("DefaultMonotonicPredicate"));









    public static SubLObject ke_value(final SubLObject cyclist, final SubLObject key) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return misc_utilities.get_vector_indexed_val(cyclist, $ke_state$.getDynamicValue(thread), key, $ke_state_keys$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
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

    public static SubLObject parens_equalP(final SubLObject string) {
        if (string.isString()) {
            final SubLObject left = string_utilities.count_chars_in_string(string, CHAR_lparen);
            final SubLObject right = string_utilities.count_chars_in_string(string, CHAR_rparen);
            return numE(left, right);
        }
        return NIL;
    }

    public static SubLObject dqs_equalP(final SubLObject string) {
        if (string.isString()) {
            final SubLObject n = string_utilities.count_chars_in_string(string, CHAR_quotation);
            return evenp(n);
        }
        return NIL;
    }

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

    public static SubLObject nart_from_string(final SubLObject string) {
        final SubLObject v_term = cycl_from_string(string);
        return nart_from_string_int(v_term);
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

    public static SubLObject printable_ascii_charP(final SubLObject character) {
        final SubLObject code = char_code(character);
        return makeBoolean(code.numG($int$31) && code.numL($int$127));
    }

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

    public static SubLObject set_tv_to_use(final SubLObject predicate) {
        if (ke_value(operation_communication.the_cyclist(), $TV).equal($UNKNOWN) && (NIL != isa.isa_in_any_mtP(predicate, $$DefaultMonotonicPredicate))) {
            return $MONOTONIC;
        }
        if (ke_value(operation_communication.the_cyclist(), $TV) == $MONOTONIC) {
            return $MONOTONIC;
        }
        return $DEFAULT;
    }

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
        declareFunction(me, "ke_value", "KE-VALUE", 2, 0, false);
        declareFunction(me, "change_ke_value", "CHANGE-KE-VALUE", 2, 2, false);
        declareFunction(me, "parens_equalP", "PARENS-EQUAL?", 1, 0, false);
        declareFunction(me, "dqs_equalP", "DQS-EQUAL?", 1, 0, false);
        declareFunction(me, "hdify_string", "HDIFY-STRING", 1, 0, false);
        declareFunction(me, "cycl_from_string", "CYCL-FROM-STRING", 1, 0, false);
        declareFunction(me, "fort_from_string", "FORT-FROM-STRING", 1, 0, false);
        declareFunction(me, "nart_from_string", "NART-FROM-STRING", 1, 0, false);
        declareFunction(me, "nart_from_string_int", "NART-FROM-STRING-INT", 1, 0, false);
        declareFunction(me, "nat_from_string", "NAT-FROM-STRING", 1, 0, false);
        declareFunction(me, "printable_ascii_charP", "PRINTABLE-ASCII-CHAR?", 1, 0, false);
        declareFunction(me, "strip_garbage_chars", "STRIP-GARBAGE-CHARS", 1, 1, false);
        declareFunction(me, "set_tv_to_use", "SET-TV-TO-USE", 1, 0, false);
        declareFunction(me, "constantify", "CONSTANTIFY", 1, 0, false);
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
}

/**
 * Total time: 226 ms
 */
