/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_0;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_1;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_3;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_4;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_5;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_6;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_7;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_8;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_9;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_A;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_B;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_C;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_D;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_E;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_F;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_U;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_a;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_b;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_backslash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_c;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_d;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_e;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_f;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.ash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.set_dispatch_macro_character;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.simple_reader_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.read_char;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.unread_char;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      UNICODE-SUPPORT
 * source file: /cyc/top/cycl/unicode-support.lisp
 * created:     2019/07/03 17:37:12
 */
public final class unicode_support extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new unicode_support();

 public static final String myName = "com.cyc.cycjava.cycl.unicode_support";


    static private final SubLString $str2$_u__a__does_not_specify_a__UNICOD = makeString("#u\"~a\" does not specify a  UNICODE string.");

    static private final SubLString $str4$Error_at_end_of_unicode_code_poin = makeString("Error at end of unicode code point: #u~s~%");

    static private final SubLString $str6$Error_at_end_in_unicode_code_poin = makeString("Error at end in unicode code point, too many digits: #u~s~%");

    static private final SubLString $str7$Error_at_end_in_unicode_code_poin = makeString("Error at end in unicode code point, too few digits, at least 2 required: #u~s~%");

    static private final SubLString $str8$_u_x_does_not_specify_a__UNICODE_ = makeString("#u~x does not specify a  UNICODE codpoint.");

    static private final SubLString $str9$The__S_reader_macro_does_not_take = makeString("The ~S reader macro does not take an argument.");

    static private final SubLString $str10$Invalid_unicode_character_string_ = makeString("Invalid unicode character/string, the char after #u, in this case (~s), must be either a hex-digit or a double quote(\").");

    static private final SubLString $str11$End_of_file_on_stream__S_ = makeString("End of file on stream ~S.");

    private static final SubLSymbol SHARPSIGN_CAPITAL_U_RMF = makeSymbol("SHARPSIGN-CAPITAL-U-RMF");

    // Definitions
    /**
     * Read the name of a unicode character. Look up the name and return the
     * Unicode char to the caller. @return unicode-character
     */
    @LispMethod(comment = "Read the name of a unicode character. Look up the name and return the\r\nUnicode char to the caller. @return unicode-character\nRead the name of a unicode character. Look up the name and return the\nUnicode char to the caller. @return unicode-character")
    public static final SubLObject read_unicode_string_alt(SubLObject stream) {
        {
            SubLObject buffer = NIL;
            SubLObject state = $IN_STRING;
            SubLObject len = ZERO_INTEGER;
            while (state == $IN_STRING) {
                {
                    SubLObject curr = read_char(stream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (NIL == curr) {
                        com.cyc.cycjava.cycl.unicode_support.unicode_end_of_file_error(stream);
                    }
                    {
                        SubLObject pcase_var = curr;
                        if (pcase_var.eql(CHAR_quotation)) {
                            state = $OPEN;
                        } else {
                            if (pcase_var.eql(CHAR_backslash)) {
                                buffer = cons(curr, buffer);
                                len = add(len, ONE_INTEGER);
                                {
                                    SubLObject curr_1 = read_char(stream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    if (NIL == curr_1) {
                                        com.cyc.cycjava.cycl.unicode_support.unicode_end_of_file_error(stream);
                                    }
                                    buffer = cons(curr_1, buffer);
                                    len = add(len, ONE_INTEGER);
                                }
                            } else {
                                buffer = cons(curr, buffer);
                                len = add(len, ONE_INTEGER);
                            }
                        }
                    }
                }
            } 
            buffer = nreverse(buffer);
            {
                SubLObject str = unicode_strings.string_from_char_list(buffer, len);
                SubLObject retval = unicode_strings.unicode_string_create(str);
                if (NIL == retval) {
                    return simple_reader_error($str_alt2$_u__a__does_not_specify_a__UNICOD, list(str));
                } else {
                    return values(retval, T);
                }
            }
        }
    }

    // Definitions
    /**
     * Read the name of a unicode character. Look up the name and return the
     * Unicode char to the caller. @return unicode-character
     */
    @LispMethod(comment = "Read the name of a unicode character. Look up the name and return the\r\nUnicode char to the caller. @return unicode-character\nRead the name of a unicode character. Look up the name and return the\nUnicode char to the caller. @return unicode-character")
    public static SubLObject read_unicode_string(final SubLObject stream) {
        SubLObject buffer = NIL;
        SubLObject state = $IN_STRING;
        SubLObject len = ZERO_INTEGER;
        while (state == $IN_STRING) {
            final SubLObject curr = read_char(stream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL == curr) {
                unicode_end_of_file_error(stream);
            }
            final SubLObject pcase_var = curr;
            if (pcase_var.eql(CHAR_quotation)) {
                state = $OPEN;
            } else
                if (pcase_var.eql(CHAR_backslash)) {
                    buffer = cons(curr, buffer);
                    len = add(len, ONE_INTEGER);
                    final SubLObject curr_$1 = read_char(stream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (NIL == curr_$1) {
                        unicode_end_of_file_error(stream);
                    }
                    buffer = cons(curr_$1, buffer);
                    len = add(len, ONE_INTEGER);
                } else {
                    buffer = cons(curr, buffer);
                    len = add(len, ONE_INTEGER);
                }

        } 
        buffer = nreverse(buffer);
        final SubLObject str = unicode_strings.string_from_char_list(buffer, len);
        final SubLObject retval = unicode_strings.unicode_string_create(str);
        if (NIL == retval) {
            return simple_reader_error($str2$_u__a__does_not_specify_a__UNICOD, list(str));
        }
        return values(retval, T);
    }

    /**
     * Reads the unicode encoding in hexadecimal from the stream and returns
     * the Unicode character selected by this code point.
     *
     * @unknown unicode-character.
     */
    @LispMethod(comment = "Reads the unicode encoding in hexadecimal from the stream and returns\r\nthe Unicode character selected by this code point.\r\n\r\n@unknown unicode-character.\nReads the unicode encoding in hexadecimal from the stream and returns\nthe Unicode character selected by this code point.")
    public static final SubLObject read_unicode_code_point_alt(SubLObject curr, SubLObject stream) {
        {
            SubLObject cc = curr;
            SubLObject state = $IN_CHARS;
            SubLObject count = ONE_INTEGER;
            SubLObject uvalue = ZERO_INTEGER;
            while (state == $IN_CHARS) {
                if (NIL == cc) {
                    com.cyc.cycjava.cycl.unicode_support.unicode_end_of_file_error(stream);
                }
                {
                    SubLObject pcase_var = cc;
                    if (((((((((((((((((((((pcase_var.eql(CHAR_0) || pcase_var.eql(CHAR_1)) || pcase_var.eql(CHAR_2)) || pcase_var.eql(CHAR_3)) || pcase_var.eql(CHAR_4)) || pcase_var.eql(CHAR_5)) || pcase_var.eql(CHAR_6)) || pcase_var.eql(CHAR_7)) || pcase_var.eql(CHAR_8)) || pcase_var.eql(CHAR_9)) || pcase_var.eql(CHAR_a)) || pcase_var.eql(CHAR_b)) || pcase_var.eql(CHAR_c)) || pcase_var.eql(CHAR_d)) || pcase_var.eql(CHAR_e)) || pcase_var.eql(CHAR_f)) || pcase_var.eql(CHAR_A)) || pcase_var.eql(CHAR_B)) || pcase_var.eql(CHAR_C)) || pcase_var.eql(CHAR_D)) || pcase_var.eql(CHAR_E)) || pcase_var.eql(CHAR_F)) {
                        uvalue = add(ash(uvalue, FOUR_INTEGER), string_utilities.hex_char_value(cc));
                        cc = read_char(stream, NIL, NIL, UNPROVIDED);
                        count = add(count, ONE_INTEGER);
                        if (NIL == cc) {
                            return simple_reader_error($str_alt4$Error_at_end_of_unicode_code_poin, list(uvalue));
                        }
                    } else {
                        state = $COMPLETE;
                        unread_char(cc, stream);
                    }
                }
            } 
            if (count.numG(SEVEN_INTEGER)) {
                return simple_reader_error($str_alt6$Error_at_end_in_unicode_code_poin, list(uvalue));
            }
            if (count.numL(THREE_INTEGER)) {
                return simple_reader_error($str_alt7$Error_at_end_in_unicode_code_poin, list(uvalue));
            }
            {
                SubLObject retval = unicode_strings.unicode_char_create(uvalue);
                if (NIL == retval) {
                    return simple_reader_error($str_alt8$_u_x_does_not_specify_a__UNICODE_, list(uvalue));
                } else {
                    return values(retval, T);
                }
            }
        }
    }

    @LispMethod(comment = "Reads the unicode encoding in hexadecimal from the stream and returns\r\nthe Unicode character selected by this code point.\r\n\r\n@unknown unicode-character.\nReads the unicode encoding in hexadecimal from the stream and returns\nthe Unicode character selected by this code point.")
    public static SubLObject read_unicode_code_point(final SubLObject curr, final SubLObject stream) {
        SubLObject cc = curr;
        SubLObject state = $IN_CHARS;
        SubLObject count = ONE_INTEGER;
        SubLObject uvalue = ZERO_INTEGER;
        while (state == $IN_CHARS) {
            if (NIL == cc) {
                unicode_end_of_file_error(stream);
            }
            final SubLObject pcase_var = cc;
            if (((((((((((((((((((((pcase_var.eql(CHAR_0) || pcase_var.eql(CHAR_1)) || pcase_var.eql(CHAR_2)) || pcase_var.eql(CHAR_3)) || pcase_var.eql(CHAR_4)) || pcase_var.eql(CHAR_5)) || pcase_var.eql(CHAR_6)) || pcase_var.eql(CHAR_7)) || pcase_var.eql(CHAR_8)) || pcase_var.eql(CHAR_9)) || pcase_var.eql(CHAR_a)) || pcase_var.eql(CHAR_b)) || pcase_var.eql(CHAR_c)) || pcase_var.eql(CHAR_d)) || pcase_var.eql(CHAR_e)) || pcase_var.eql(CHAR_f)) || pcase_var.eql(CHAR_A)) || pcase_var.eql(CHAR_B)) || pcase_var.eql(CHAR_C)) || pcase_var.eql(CHAR_D)) || pcase_var.eql(CHAR_E)) || pcase_var.eql(CHAR_F)) {
                uvalue = add(ash(uvalue, FOUR_INTEGER), string_utilities.hex_char_value(cc));
                cc = read_char(stream, NIL, NIL, UNPROVIDED);
                count = add(count, ONE_INTEGER);
                if (NIL == cc) {
                    return simple_reader_error($str4$Error_at_end_of_unicode_code_poin, list(uvalue));
                }
                continue;
            } else {
                state = $COMPLETE;
                unread_char(cc, stream);
            }
        } 
        if (count.numG(SEVEN_INTEGER)) {
            return simple_reader_error($str6$Error_at_end_in_unicode_code_poin, list(uvalue));
        }
        if (count.numL(THREE_INTEGER)) {
            return simple_reader_error($str7$Error_at_end_in_unicode_code_poin, list(uvalue));
        }
        final SubLObject retval = unicode_strings.unicode_char_create(uvalue);
        if (NIL == retval) {
            return simple_reader_error($str8$_u_x_does_not_specify_a__UNICODE_, list(uvalue));
        }
        return values(retval, T);
    }

    public static final SubLObject sharpsign_capital_u_rmf_alt(SubLObject stream, SubLObject ch, SubLObject arg) {
        if (NIL != arg) {
            return simple_reader_error($str_alt9$The__S_reader_macro_does_not_take, list(ch));
        }
        {
            SubLObject curr = read_char(stream, NIL, NIL, UNPROVIDED);
            if (NIL == curr) {
                com.cyc.cycjava.cycl.unicode_support.unicode_end_of_file_error(stream);
            }
            {
                SubLObject pcase_var = curr;
                if (pcase_var.eql(CHAR_quotation)) {
                    return com.cyc.cycjava.cycl.unicode_support.read_unicode_string(stream);
                } else {
                    if (((((((((((((((((((((pcase_var.eql(CHAR_0) || pcase_var.eql(CHAR_1)) || pcase_var.eql(CHAR_2)) || pcase_var.eql(CHAR_3)) || pcase_var.eql(CHAR_4)) || pcase_var.eql(CHAR_5)) || pcase_var.eql(CHAR_6)) || pcase_var.eql(CHAR_7)) || pcase_var.eql(CHAR_8)) || pcase_var.eql(CHAR_9)) || pcase_var.eql(CHAR_a)) || pcase_var.eql(CHAR_b)) || pcase_var.eql(CHAR_c)) || pcase_var.eql(CHAR_d)) || pcase_var.eql(CHAR_e)) || pcase_var.eql(CHAR_f)) || pcase_var.eql(CHAR_A)) || pcase_var.eql(CHAR_B)) || pcase_var.eql(CHAR_C)) || pcase_var.eql(CHAR_D)) || pcase_var.eql(CHAR_E)) || pcase_var.eql(CHAR_F)) {
                        return com.cyc.cycjava.cycl.unicode_support.read_unicode_code_point(curr, stream);
                    } else {
                        return simple_reader_error($str_alt10$Invalid_unicode_character_string_, list(curr));
                    }
                }
            }
        }
    }

    public static SubLObject sharpsign_capital_u_rmf(final SubLObject stream, final SubLObject ch, final SubLObject arg) {
        if (NIL != arg) {
            return simple_reader_error($str9$The__S_reader_macro_does_not_take, list(ch));
        }
        final SubLObject curr = read_char(stream, NIL, NIL, UNPROVIDED);
        if (NIL == curr) {
            unicode_end_of_file_error(stream);
        }
        final SubLObject pcase_var = curr;
        if (pcase_var.eql(CHAR_quotation)) {
            return read_unicode_string(stream);
        }
        if (((((((((((((((((((((pcase_var.eql(CHAR_0) || pcase_var.eql(CHAR_1)) || pcase_var.eql(CHAR_2)) || pcase_var.eql(CHAR_3)) || pcase_var.eql(CHAR_4)) || pcase_var.eql(CHAR_5)) || pcase_var.eql(CHAR_6)) || pcase_var.eql(CHAR_7)) || pcase_var.eql(CHAR_8)) || pcase_var.eql(CHAR_9)) || pcase_var.eql(CHAR_a)) || pcase_var.eql(CHAR_b)) || pcase_var.eql(CHAR_c)) || pcase_var.eql(CHAR_d)) || pcase_var.eql(CHAR_e)) || pcase_var.eql(CHAR_f)) || pcase_var.eql(CHAR_A)) || pcase_var.eql(CHAR_B)) || pcase_var.eql(CHAR_C)) || pcase_var.eql(CHAR_D)) || pcase_var.eql(CHAR_E)) || pcase_var.eql(CHAR_F)) {
            return read_unicode_code_point(curr, stream);
        }
        return simple_reader_error($str10$Invalid_unicode_character_string_, list(curr));
    }

    public static final SubLObject unicode_end_of_file_error_alt(SubLObject stream) {
        return simple_reader_error($str_alt11$End_of_file_on_stream__S_, list(stream));
    }

    public static SubLObject unicode_end_of_file_error(final SubLObject stream) {
        return simple_reader_error($str11$End_of_file_on_stream__S_, list(stream));
    }

    public static SubLObject declare_unicode_support_file() {
        declareFunction("read_unicode_string", "READ-UNICODE-STRING", 1, 0, false);
        declareFunction("read_unicode_code_point", "READ-UNICODE-CODE-POINT", 2, 0, false);
        declareFunction("sharpsign_capital_u_rmf", "SHARPSIGN-CAPITAL-U-RMF", 3, 0, false);
        declareFunction("unicode_end_of_file_error", "UNICODE-END-OF-FILE-ERROR", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_unicode_support_file() {
        return NIL;
    }

    public static SubLObject setup_unicode_support_file() {
        set_dispatch_macro_character(CHAR_hash, CHAR_U, SHARPSIGN_CAPITAL_U_RMF, UNPROVIDED);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_unicode_support_file();
    }

    @Override
    public void initializeVariables() {
        init_unicode_support_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_unicode_support_file();
    }

    

    static private final SubLString $str_alt2$_u__a__does_not_specify_a__UNICOD = makeString("#u\"~a\" does not specify a  UNICODE string.");

    static private final SubLString $str_alt4$Error_at_end_of_unicode_code_poin = makeString("Error at end of unicode code point: #u~s~%");

    static private final SubLString $str_alt6$Error_at_end_in_unicode_code_poin = makeString("Error at end in unicode code point, too many digits: #u~s~%");

    static private final SubLString $str_alt7$Error_at_end_in_unicode_code_poin = makeString("Error at end in unicode code point, too few digits, at least 2 required: #u~s~%");

    static private final SubLString $str_alt8$_u_x_does_not_specify_a__UNICODE_ = makeString("#u~x does not specify a  UNICODE codpoint.");

    static private final SubLString $str_alt9$The__S_reader_macro_does_not_take = makeString("The ~S reader macro does not take an argument.");

    static private final SubLString $str_alt10$Invalid_unicode_character_string_ = makeString("Invalid unicode character/string, the char after #u, in this case (~s), must be either a hex-digit or a double quote(\").");

    static private final SubLString $str_alt11$End_of_file_on_stream__S_ = makeString("End of file on stream ~S.");
}

/**
 * Total time: 33 ms
 */
