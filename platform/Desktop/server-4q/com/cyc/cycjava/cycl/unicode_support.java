package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class unicode_support extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.unicode_support";
    public static final String myFingerPrint = "eceeceeb474a930c6a4664a7a5760d8ca4072ac62dd1c68e11dc6d3547b39c28";
    private static final SubLSymbol $kw0$IN_STRING;
    private static final SubLSymbol $kw1$OPEN;
    private static final SubLString $str2$_u__a__does_not_specify_a__UNICOD;
    private static final SubLSymbol $kw3$IN_CHARS;
    private static final SubLString $str4$Error_at_end_of_unicode_code_poin;
    private static final SubLSymbol $kw5$COMPLETE;
    private static final SubLString $str6$Error_at_end_in_unicode_code_poin;
    private static final SubLString $str7$Error_at_end_in_unicode_code_poin;
    private static final SubLString $str8$_u_x_does_not_specify_a__UNICODE_;
    private static final SubLString $str9$The__S_reader_macro_does_not_take;
    private static final SubLString $str10$Invalid_unicode_character_string_;
    private static final SubLString $str11$End_of_file_on_stream__S_;
    private static final SubLSymbol $sym12$SHARPSIGN_CAPITAL_U_RMF;
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-support.lisp", position = 688L)
    public static SubLObject read_unicode_string(final SubLObject stream) {
        SubLObject buffer = (SubLObject)unicode_support.NIL;
        SubLObject state = (SubLObject)unicode_support.$kw0$IN_STRING;
        SubLObject len = (SubLObject)unicode_support.ZERO_INTEGER;
        while (state == unicode_support.$kw0$IN_STRING) {
            final SubLObject curr = streams_high.read_char(stream, (SubLObject)unicode_support.UNPROVIDED, (SubLObject)unicode_support.UNPROVIDED, (SubLObject)unicode_support.UNPROVIDED);
            if (unicode_support.NIL == curr) {
                unicode_end_of_file_error(stream);
            }
            final SubLObject pcase_var = curr;
            if (pcase_var.eql((SubLObject)Characters.CHAR_quotation)) {
                state = (SubLObject)unicode_support.$kw1$OPEN;
            }
            else if (pcase_var.eql((SubLObject)Characters.CHAR_backslash)) {
                buffer = (SubLObject)ConsesLow.cons(curr, buffer);
                len = Numbers.add(len, (SubLObject)unicode_support.ONE_INTEGER);
                final SubLObject curr_$1 = streams_high.read_char(stream, (SubLObject)unicode_support.UNPROVIDED, (SubLObject)unicode_support.UNPROVIDED, (SubLObject)unicode_support.UNPROVIDED);
                if (unicode_support.NIL == curr_$1) {
                    unicode_end_of_file_error(stream);
                }
                buffer = (SubLObject)ConsesLow.cons(curr_$1, buffer);
                len = Numbers.add(len, (SubLObject)unicode_support.ONE_INTEGER);
            }
            else {
                buffer = (SubLObject)ConsesLow.cons(curr, buffer);
                len = Numbers.add(len, (SubLObject)unicode_support.ONE_INTEGER);
            }
        }
        buffer = Sequences.nreverse(buffer);
        final SubLObject str = unicode_strings.string_from_char_list(buffer, len);
        final SubLObject retval = unicode_strings.unicode_string_create(str);
        if (unicode_support.NIL == retval) {
            return reader.simple_reader_error((SubLObject)unicode_support.$str2$_u__a__does_not_specify_a__UNICOD, (SubLObject)ConsesLow.list(str));
        }
        return Values.values(retval, (SubLObject)unicode_support.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-support.lisp", position = 1727L)
    public static SubLObject read_unicode_code_point(final SubLObject curr, final SubLObject stream) {
        SubLObject cc = curr;
        SubLObject state = (SubLObject)unicode_support.$kw3$IN_CHARS;
        SubLObject count = (SubLObject)unicode_support.ONE_INTEGER;
        SubLObject uvalue = (SubLObject)unicode_support.ZERO_INTEGER;
        while (state == unicode_support.$kw3$IN_CHARS) {
            if (unicode_support.NIL == cc) {
                unicode_end_of_file_error(stream);
            }
            final SubLObject pcase_var = cc;
            if (pcase_var.eql((SubLObject)Characters.CHAR_0) || pcase_var.eql((SubLObject)Characters.CHAR_1) || pcase_var.eql((SubLObject)Characters.CHAR_2) || pcase_var.eql((SubLObject)Characters.CHAR_3) || pcase_var.eql((SubLObject)Characters.CHAR_4) || pcase_var.eql((SubLObject)Characters.CHAR_5) || pcase_var.eql((SubLObject)Characters.CHAR_6) || pcase_var.eql((SubLObject)Characters.CHAR_7) || pcase_var.eql((SubLObject)Characters.CHAR_8) || pcase_var.eql((SubLObject)Characters.CHAR_9) || pcase_var.eql((SubLObject)Characters.CHAR_a) || pcase_var.eql((SubLObject)Characters.CHAR_b) || pcase_var.eql((SubLObject)Characters.CHAR_c) || pcase_var.eql((SubLObject)Characters.CHAR_d) || pcase_var.eql((SubLObject)Characters.CHAR_e) || pcase_var.eql((SubLObject)Characters.CHAR_f) || pcase_var.eql((SubLObject)Characters.CHAR_A) || pcase_var.eql((SubLObject)Characters.CHAR_B) || pcase_var.eql((SubLObject)Characters.CHAR_C) || pcase_var.eql((SubLObject)Characters.CHAR_D) || pcase_var.eql((SubLObject)Characters.CHAR_E) || pcase_var.eql((SubLObject)Characters.CHAR_F)) {
                uvalue = Numbers.add(Numbers.ash(uvalue, (SubLObject)unicode_support.FOUR_INTEGER), string_utilities.hex_char_value(cc));
                cc = streams_high.read_char(stream, (SubLObject)unicode_support.NIL, (SubLObject)unicode_support.NIL, (SubLObject)unicode_support.UNPROVIDED);
                count = Numbers.add(count, (SubLObject)unicode_support.ONE_INTEGER);
                if (unicode_support.NIL == cc) {
                    return reader.simple_reader_error((SubLObject)unicode_support.$str4$Error_at_end_of_unicode_code_poin, (SubLObject)ConsesLow.list(uvalue));
                }
                continue;
            }
            else {
                state = (SubLObject)unicode_support.$kw5$COMPLETE;
                streams_high.unread_char(cc, stream);
            }
        }
        if (count.numG((SubLObject)unicode_support.SEVEN_INTEGER)) {
            return reader.simple_reader_error((SubLObject)unicode_support.$str6$Error_at_end_in_unicode_code_poin, (SubLObject)ConsesLow.list(uvalue));
        }
        if (count.numL((SubLObject)unicode_support.THREE_INTEGER)) {
            return reader.simple_reader_error((SubLObject)unicode_support.$str7$Error_at_end_in_unicode_code_poin, (SubLObject)ConsesLow.list(uvalue));
        }
        final SubLObject retval = unicode_strings.unicode_char_create(uvalue);
        if (unicode_support.NIL == retval) {
            return reader.simple_reader_error((SubLObject)unicode_support.$str8$_u_x_does_not_specify_a__UNICODE_, (SubLObject)ConsesLow.list(uvalue));
        }
        return Values.values(retval, (SubLObject)unicode_support.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-support.lisp", position = 3092L)
    public static SubLObject sharpsign_capital_u_rmf(final SubLObject stream, final SubLObject ch, final SubLObject arg) {
        if (unicode_support.NIL != arg) {
            return reader.simple_reader_error((SubLObject)unicode_support.$str9$The__S_reader_macro_does_not_take, (SubLObject)ConsesLow.list(ch));
        }
        final SubLObject curr = streams_high.read_char(stream, (SubLObject)unicode_support.NIL, (SubLObject)unicode_support.NIL, (SubLObject)unicode_support.UNPROVIDED);
        if (unicode_support.NIL == curr) {
            unicode_end_of_file_error(stream);
        }
        final SubLObject pcase_var = curr;
        if (pcase_var.eql((SubLObject)Characters.CHAR_quotation)) {
            return read_unicode_string(stream);
        }
        if (pcase_var.eql((SubLObject)Characters.CHAR_0) || pcase_var.eql((SubLObject)Characters.CHAR_1) || pcase_var.eql((SubLObject)Characters.CHAR_2) || pcase_var.eql((SubLObject)Characters.CHAR_3) || pcase_var.eql((SubLObject)Characters.CHAR_4) || pcase_var.eql((SubLObject)Characters.CHAR_5) || pcase_var.eql((SubLObject)Characters.CHAR_6) || pcase_var.eql((SubLObject)Characters.CHAR_7) || pcase_var.eql((SubLObject)Characters.CHAR_8) || pcase_var.eql((SubLObject)Characters.CHAR_9) || pcase_var.eql((SubLObject)Characters.CHAR_a) || pcase_var.eql((SubLObject)Characters.CHAR_b) || pcase_var.eql((SubLObject)Characters.CHAR_c) || pcase_var.eql((SubLObject)Characters.CHAR_d) || pcase_var.eql((SubLObject)Characters.CHAR_e) || pcase_var.eql((SubLObject)Characters.CHAR_f) || pcase_var.eql((SubLObject)Characters.CHAR_A) || pcase_var.eql((SubLObject)Characters.CHAR_B) || pcase_var.eql((SubLObject)Characters.CHAR_C) || pcase_var.eql((SubLObject)Characters.CHAR_D) || pcase_var.eql((SubLObject)Characters.CHAR_E) || pcase_var.eql((SubLObject)Characters.CHAR_F)) {
            return read_unicode_code_point(curr, stream);
        }
        return reader.simple_reader_error((SubLObject)unicode_support.$str10$Invalid_unicode_character_string_, (SubLObject)ConsesLow.list(curr));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-support.lisp", position = 3812L)
    public static SubLObject unicode_end_of_file_error(final SubLObject stream) {
        return reader.simple_reader_error((SubLObject)unicode_support.$str11$End_of_file_on_stream__S_, (SubLObject)ConsesLow.list(stream));
    }
    
    public static SubLObject declare_unicode_support_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_support", "read_unicode_string", "READ-UNICODE-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_support", "read_unicode_code_point", "READ-UNICODE-CODE-POINT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_support", "sharpsign_capital_u_rmf", "SHARPSIGN-CAPITAL-U-RMF", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_support", "unicode_end_of_file_error", "UNICODE-END-OF-FILE-ERROR", 1, 0, false);
        return (SubLObject)unicode_support.NIL;
    }
    
    public static SubLObject init_unicode_support_file() {
        return (SubLObject)unicode_support.NIL;
    }
    
    public static SubLObject setup_unicode_support_file() {
        reader.set_dispatch_macro_character((SubLObject)Characters.CHAR_hash, (SubLObject)Characters.CHAR_U, (SubLObject)unicode_support.$sym12$SHARPSIGN_CAPITAL_U_RMF, (SubLObject)unicode_support.UNPROVIDED);
        return (SubLObject)unicode_support.NIL;
    }
    
    public void declareFunctions() {
        declare_unicode_support_file();
    }
    
    public void initializeVariables() {
        init_unicode_support_file();
    }
    
    public void runTopLevelForms() {
        setup_unicode_support_file();
    }
    
    static {
        me = (SubLFile)new unicode_support();
        $kw0$IN_STRING = SubLObjectFactory.makeKeyword("IN-STRING");
        $kw1$OPEN = SubLObjectFactory.makeKeyword("OPEN");
        $str2$_u__a__does_not_specify_a__UNICOD = SubLObjectFactory.makeString("#u\"~a\" does not specify a  UNICODE string.");
        $kw3$IN_CHARS = SubLObjectFactory.makeKeyword("IN-CHARS");
        $str4$Error_at_end_of_unicode_code_poin = SubLObjectFactory.makeString("Error at end of unicode code point: #u~s~%");
        $kw5$COMPLETE = SubLObjectFactory.makeKeyword("COMPLETE");
        $str6$Error_at_end_in_unicode_code_poin = SubLObjectFactory.makeString("Error at end in unicode code point, too many digits: #u~s~%");
        $str7$Error_at_end_in_unicode_code_poin = SubLObjectFactory.makeString("Error at end in unicode code point, too few digits, at least 2 required: #u~s~%");
        $str8$_u_x_does_not_specify_a__UNICODE_ = SubLObjectFactory.makeString("#u~x does not specify a  UNICODE codpoint.");
        $str9$The__S_reader_macro_does_not_take = SubLObjectFactory.makeString("The ~S reader macro does not take an argument.");
        $str10$Invalid_unicode_character_string_ = SubLObjectFactory.makeString("Invalid unicode character/string, the char after #u, in this case (~s), must be either a hex-digit or a double quote(\").");
        $str11$End_of_file_on_stream__S_ = SubLObjectFactory.makeString("End of file on stream ~S.");
        $sym12$SHARPSIGN_CAPITAL_U_RMF = SubLObjectFactory.makeSymbol("SHARPSIGN-CAPITAL-U-RMF");
    }
}

/*

	Total time: 33 ms
	
*/