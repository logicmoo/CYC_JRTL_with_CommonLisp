package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class unicode_support extends SubLTranslatedFile {
    public static final SubLFile me = new unicode_support();

    public static final String myName = "com.cyc.cycjava.cycl.unicode_support";

    public static final String myFingerPrint = "eceeceeb474a930c6a4664a7a5760d8ca4072ac62dd1c68e11dc6d3547b39c28";





    public static final SubLString $str2$_u__a__does_not_specify_a__UNICOD = makeString("#u\"~a\" does not specify a  UNICODE string.");



    public static final SubLString $str4$Error_at_end_of_unicode_code_poin = makeString("Error at end of unicode code point: #u~s~%");



    public static final SubLString $str6$Error_at_end_in_unicode_code_poin = makeString("Error at end in unicode code point, too many digits: #u~s~%");

    public static final SubLString $str7$Error_at_end_in_unicode_code_poin = makeString("Error at end in unicode code point, too few digits, at least 2 required: #u~s~%");

    public static final SubLString $str8$_u_x_does_not_specify_a__UNICODE_ = makeString("#u~x does not specify a  UNICODE codpoint.");

    public static final SubLString $str9$The__S_reader_macro_does_not_take = makeString("The ~S reader macro does not take an argument.");

    public static final SubLString $str10$Invalid_unicode_character_string_ = makeString("Invalid unicode character/string, the char after #u, in this case (~s), must be either a hex-digit or a double quote(\").");

    public static final SubLString $str11$End_of_file_on_stream__S_ = makeString("End of file on stream ~S.");

    public static final SubLSymbol SHARPSIGN_CAPITAL_U_RMF = makeSymbol("SHARPSIGN-CAPITAL-U-RMF");

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

    public static SubLObject unicode_end_of_file_error(final SubLObject stream) {
        return simple_reader_error($str11$End_of_file_on_stream__S_, list(stream));
    }

    public static SubLObject declare_unicode_support_file() {
        declareFunction(me, "read_unicode_string", "READ-UNICODE-STRING", 1, 0, false);
        declareFunction(me, "read_unicode_code_point", "READ-UNICODE-CODE-POINT", 2, 0, false);
        declareFunction(me, "sharpsign_capital_u_rmf", "SHARPSIGN-CAPITAL-U-RMF", 3, 0, false);
        declareFunction(me, "unicode_end_of_file_error", "UNICODE-END-OF-FILE-ERROR", 1, 0, false);
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

    
}

/**
 * Total time: 33 ms
 */
