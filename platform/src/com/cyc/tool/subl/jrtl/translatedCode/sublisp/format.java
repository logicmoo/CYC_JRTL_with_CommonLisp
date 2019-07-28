/**
 *
 */
/**
 * For LarKC
 */
/**
 *
 */
package com.cyc.tool.subl.jrtl.translatedCode.sublisp;


import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.format;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_0;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_A;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_B;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_C;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_D;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_E;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_F;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_G;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_I;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_L;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_M;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_O;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_P;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_R;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_S;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_V;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_W;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_X;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_a;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_ampersand;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_asterisk;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_at;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_b;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_c;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_caret;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_colon;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_comma;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_d;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_dollar;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_e;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_f;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_g;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hyphen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_i;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_lbrace;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_lbracket;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_less;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_lparen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_newline;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_o;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_page;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_percent;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_period;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_plus;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_question;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quote;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_r;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_rbrace;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_rbracket;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_rparen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_s;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_semicolon;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_slash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_t;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_tilde;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_underbar;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_vertical;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_w;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_x;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_y;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EIGHT_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FIVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FOUR_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.IDENTITY;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NINE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SIXTEEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.format.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public class format extends SubLTranslatedFile {
    public static SubLObject backup_args(SubLObject args, SubLObject all_args, SubLObject count) {
        SubLObject offset = ZERO_INTEGER;
        SubLObject tail;
        for (tail = SubLNil.NIL, tail = all_args; !tail.eql(args); tail = tail.rest())
            offset = add(offset, ONE_INTEGER);

        if (count.numG(offset))
            not_enough_format_arguments(CHAR_asterisk);

        return nthcdr(subtract(offset, count), all_args);
    }

    public static SubLObject bad_format_directive(SubLObject string, SubLObject index) {
        Errors.error($str39$_S_is_not_a_recognized__S_control, Strings.sublisp_char(string, index), FORMAT);
        return SubLNil.NIL;
    }

    public static SubLObject call_format_directive(SubLObject ch, SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject new_args = funcall(gethash(ch, $format_directives$.getDynamicValue(thread), UNPROVIDED), new SubLObject[]{ stream, string, start, end, args, all_args, parameters, at_sign_p, colonp });
        SubLObject new_start = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return values(new_args, new_start);
    }

    public static SubLObject check_flags(SubLObject directive, SubLObject at_sign_p, SubLObject at_sign_ok_p, SubLObject colonp, SubLObject colon_ok_p) {
        if ((SubLNil.NIL != at_sign_p) && (SubLNil.NIL == at_sign_ok_p))
            Errors.error($str13$The____C_format_directive_does_no, directive);

        if ((SubLNil.NIL != colonp) && (SubLNil.NIL == colon_ok_p))
            Errors.error($str14$The____C_format_directive_does_no, directive);

        if ((SubLNil.NIL != at_sign_p) && (SubLNil.NIL != colonp))
            Errors.error($str15$The____C_format_directive_does_no, directive);

        return SubLNil.NIL;
    }

    public static SubLObject declare_format_file() {
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_directive_p", "FORMAT-DIRECTIVE-P", 1, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "matching_bracket", "MATCHING-BRACKET", 1, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "call_format_directive", "CALL-FORMAT-DIRECTIVE", 10, 0, false);
        declareMacro("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "defformat", "DEFFORMAT");
        declareMacro("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "defformat_bracketed", "DEFFORMAT-BRACKETED");
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "unimplemented_format_directive", "UNIMPLEMENTED-FORMAT-DIRECTIVE", 1, 1, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "check_flags", "CHECK-FLAGS", 5, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_typep", "FORMAT-TYPEP", 2, 0, false);
        declareMacro("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "with_format_parameters", "WITH-FORMAT-PARAMETERS");
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "illegal_directive", "ILLEGAL-DIRECTIVE", 2, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "bad_format_directive", "BAD-FORMAT-DIRECTIVE", 2, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "not_enough_format_arguments", "NOT-ENOUGH-FORMAT-ARGUMENTS", 1, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "matching_bracket_not_found", "MATCHING-BRACKET-NOT-FOUND", 3, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "not_a_list_argument", "NOT-A-LIST-ARGUMENT", 1, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "not_a_format_control", "NOT-A-FORMAT-CONTROL", 1, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "repitition_designator_value", "REPITITION-DESIGNATOR-VALUE", 1, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_repeat", "FORMAT-REPEAT", 3, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_padded", "FORMAT-PADDED", 7, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_c_directive", "FORMAT-C-DIRECTIVE", 9, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_percent_directive", "FORMAT-PERCENT-DIRECTIVE", 9, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_ampersand_directive", "FORMAT-AMPERSAND-DIRECTIVE", 9, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_vertical_bar_directive", "FORMAT-VERTICAL-BAR-DIRECTIVE", 9, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_tilde_directive", "FORMAT-TILDE-DIRECTIVE", 9, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_integer_internal", "FORMAT-INTEGER-INTERNAL", 2, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_integer", "FORMAT-INTEGER", 6, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "integer_truncate", "INTEGER-TRUNCATE", 2, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_cardinal_internal", "FORMAT-CARDINAL-INTERNAL", 4, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_cardinal", "FORMAT-CARDINAL", 2, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_ordinal", "FORMAT-ORDINAL", 2, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_r_directive", "FORMAT-R-DIRECTIVE", 9, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_d_directive", "FORMAT-D-DIRECTIVE", 9, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_b_directive", "FORMAT-B-DIRECTIVE", 9, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_o_directive", "FORMAT-O-DIRECTIVE", 9, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_x_directive", "FORMAT-X-DIRECTIVE", 9, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "split_flonum_digits", "SPLIT-FLONUM-DIGITS", 2, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "round_digits", "ROUND-DIGITS", 2, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "digits_add_1_int", "DIGITS-ADD-1-INT", 1, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "digits_add_1", "DIGITS-ADD-1", 1, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "round_decimal_digits", "ROUND-DECIMAL-DIGITS", 3, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_f_directive", "FORMAT-F-DIRECTIVE", 9, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_e_directive", "FORMAT-E-DIRECTIVE", 9, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_g_directive", "FORMAT-G-DIRECTIVE", 9, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_dollarsign_directive", "FORMAT-DOLLARSIGN-DIRECTIVE", 9, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_a_directive", "FORMAT-A-DIRECTIVE", 9, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_s_directive", "FORMAT-S-DIRECTIVE", 9, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_w_directive", "FORMAT-W-DIRECTIVE", 9, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_underscore_directive", "FORMAT-UNDERSCORE-DIRECTIVE", 9, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_i_directive", "FORMAT-I-DIRECTIVE", 9, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_slash_directive", "FORMAT-SLASH-DIRECTIVE", 9, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_t_directive", "FORMAT-T-DIRECTIVE", 9, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_less_than_directive", "FORMAT-LESS-THAN-DIRECTIVE", 9, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_greater_than_directive", "FORMAT-GREATER-THAN-DIRECTIVE", 9, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "backup_args", "BACKUP-ARGS", 3, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_asterisk_directive", "FORMAT-ASTERISK-DIRECTIVE", 9, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_left_bracket_directive", "FORMAT-LEFT-BRACKET-DIRECTIVE", 9, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_right_bracket_directive", "FORMAT-RIGHT-BRACKET-DIRECTIVE", 9, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_sublist_iteration", "FORMAT-SUBLIST-ITERATION", 7, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_iteration", "FORMAT-ITERATION", 7, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_left_brace_directive", "FORMAT-LEFT-BRACE-DIRECTIVE", 9, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_right_brace_directive", "FORMAT-RIGHT-BRACE-DIRECTIVE", 9, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_question_mark_directive", "FORMAT-QUESTION-MARK-DIRECTIVE", 9, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_left_paren_directive", "FORMAT-LEFT-PAREN-DIRECTIVE", 9, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_right_paren_directive", "FORMAT-RIGHT-PAREN-DIRECTIVE", 9, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_p_directive", "FORMAT-P-DIRECTIVE", 9, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_semicolon_directive", "FORMAT-SEMICOLON-DIRECTIVE", 9, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_circumflex_directive", "FORMAT-CIRCUMFLEX-DIRECTIVE", 9, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_newline_directive", "FORMAT-NEWLINE-DIRECTIVE", 9, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "really_format", "REALLY-FORMAT", 3, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_internal", "FORMAT-INTERNAL", 6, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "find_directive", "FIND-DIRECTIVE", 4, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "parse_format_command", "PARSE-FORMAT-COMMAND", 3, 2, false);
        return SubLNil.NIL;
    }

    public static SubLObject defformat(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        SubLObject name = SubLNil.NIL;
        SubLObject character = SubLNil.NIL;
        SubLObject lambda_list = SubLNil.NIL;
        destructuring_bind_must_consp(current, datum, $list1);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list1);
        character = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list1);
        lambda_list = current.first();
        SubLObject body;
        current = body = current.rest();
        return list(PROGN, list(DECLAIM, list(FACCESS, PRIVATE, name)), listS(DEFINE, name, lambda_list, append(body, SubLNil.NIL)), list(SETHASH, char_downcase(character), $format_directives$, list(FUNCTION, name)), list(SETHASH, char_upcase(character), $format_directives$, list(FUNCTION, name)));
    }

    public static SubLObject defformat_bracketed(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        SubLObject name = SubLNil.NIL;
        SubLObject left = SubLNil.NIL;
        SubLObject right = SubLNil.NIL;
        SubLObject lambda_list = SubLNil.NIL;
        destructuring_bind_must_consp(current, datum, $list10);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list10);
        left = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list10);
        right = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list10);
        lambda_list = current.first();
        SubLObject body;
        current = body = current.rest();
        return list(PROGN, list(DECLAIM, list(FACCESS, PRIVATE, name)), listS(DEFINE, name, lambda_list, append(body, SubLNil.NIL)), list(SETHASH, left, $format_directives$, list(FUNCTION, name)), list(SETHASH, left, $matching_brackets$, right));
    }

    public static SubLObject digits_add_1(SubLObject digits) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject new_digits = digits_add_1_int(digits);
        SubLObject carry = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (SubLNil.NIL != carry)
            return cons(ONE_INTEGER, new_digits);

        return new_digits;
    }

    public static SubLObject digits_add_1_int(SubLObject digits) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject digit = digits.first();
        if (SubLNil.NIL == digits)
            return values(SubLNil.NIL, SubLNil.NIL);

        if (SubLNil.NIL == digits.rest()) {
            if (NINE_INTEGER.eql(digit))
                return values(list(ZERO_INTEGER), T);

            return values(list(add(ONE_INTEGER, digit)), SubLNil.NIL);
        } else {
            thread.resetMultipleValues();
            SubLObject new_rest_digits = digits_add_1_int(digits.rest());
            SubLObject carry = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (SubLNil.NIL == carry)
                return values(cons(digit, new_rest_digits), SubLNil.NIL);

            if (digit.numE(NINE_INTEGER))
                return values(cons(ZERO_INTEGER, new_rest_digits), T);

            return values(cons(add(ONE_INTEGER, digit), new_rest_digits), SubLNil.NIL);
        }
    }

    public static SubLObject find_directive(SubLObject directive, SubLObject string, SubLObject start, SubLObject end) {
        SubLThread thread = SubLProcess.currentSubLThread();
        while (true) {
            thread.resetMultipleValues();
            SubLObject ch = parse_format_command(string, start, end, UNPROVIDED, UNPROVIDED);
            SubLObject directive_start = thread.secondMultipleValue();
            SubLObject directive_end = thread.thirdMultipleValue();
            SubLObject at_sign_p = thread.fourthMultipleValue();
            SubLObject colonp = thread.fifthMultipleValue();
            SubLObject parameters = thread.sixthMultipleValue();
            SubLObject args = thread.seventhMultipleValue();
            thread.resetMultipleValues();
            if (SubLNil.NIL == ch)
                return values(SubLNil.NIL, SubLNil.NIL, SubLNil.NIL);

            if (SubLNil.NIL != charE(ch, directive))
                return values(directive_start, directive_end, at_sign_p, colonp);

            SubLObject matching = matching_bracket(ch);
            if (SubLNil.NIL != matching) {
                thread.resetMultipleValues();
                SubLObject matching_start = find_directive(matching, string, directive_end, end);
                SubLObject matching_end = thread.secondMultipleValue();
                SubLObject matching_colonp = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (SubLNil.NIL != matching_end)
                    start = matching_end;
                else
                    Errors.error($str127$No_matching__A_found_for__A_in__S, matching, directive, string);

            } else
                start = directive_end;

        } 
    }

    public static SubLObject format_a_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject _prev_bind_0 = $print_escape$.currentBinding(thread);
        SubLObject _prev_bind_2 = $print_readably$.currentBinding(thread);
        try {
            $print_escape$.bind(SubLNil.NIL, thread);
            $print_readably$.bind(SubLNil.NIL, thread);
            SubLObject arg = args.first();
            if ((SubLNil.NIL != colonp) && (SubLNil.NIL == arg))
                arg = $str93$__;

            if (SubLNil.NIL != parameters) {
                SubLObject padchar = SubLNil.NIL;
                SubLObject minpad = SubLNil.NIL;
                SubLObject colinc = SubLNil.NIL;
                SubLObject mincol = SubLNil.NIL;
                mincol = parameters.first();
                SubLObject tail = parameters.rest();
                if (SubLNil.NIL == mincol)
                    mincol = ZERO_INTEGER;

                if (SubLNil.NIL == format_typep(mincol, $list54))
                    Errors.error($str32$The__S_parameter__S_is_not_of_typ, FORMAT, mincol, $list54);

                colinc = tail.first();
                tail = tail.rest();
                if (SubLNil.NIL == colinc)
                    colinc = ONE_INTEGER;

                if (SubLNil.NIL == format_typep(colinc, $list54))
                    Errors.error($str32$The__S_parameter__S_is_not_of_typ, FORMAT, colinc, $list54);

                minpad = tail.first();
                tail = tail.rest();
                if (SubLNil.NIL == minpad)
                    minpad = ZERO_INTEGER;

                if (SubLNil.NIL == format_typep(minpad, $list54))
                    Errors.error($str32$The__S_parameter__S_is_not_of_typ, FORMAT, minpad, $list54);

                padchar = tail.first();
                tail = tail.rest();
                if (SubLNil.NIL == padchar)
                    padchar = CHAR_space;

                if (SubLNil.NIL == format_typep(padchar, CHARACTER))
                    Errors.error($str32$The__S_parameter__S_is_not_of_typ, FORMAT, padchar, CHARACTER);

                if (SubLNil.NIL != tail)
                    Errors.error($str45$Too_many__S_parameters_, FORMAT);

                funcall(symbol_function(FORMAT_PADDED), new SubLObject[]{ stream, write_to_string(arg, EMPTY_SUBL_OBJECT_ARRAY), at_sign_p, mincol, colinc, minpad, padchar });
            } else
                princ(arg, stream);

        } finally {
            $print_readably$.rebind(_prev_bind_2, thread);
            $print_escape$.rebind(_prev_bind_0, thread);
        }
        return values(args.rest(), start);
    }

    public static SubLObject format_ampersand_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
        check_flags(CHAR_ampersand, at_sign_p, SubLNil.NIL, colonp, SubLNil.NIL);
        SubLObject n = SubLNil.NIL;
        n = parameters.first();
        SubLObject tail = parameters.rest();
        if (SubLNil.NIL == n)
            n = SubLNil.NIL;

        if (SubLNil.NIL == format_typep(n, $list49))
            Errors.error($str32$The__S_parameter__S_is_not_of_typ, FORMAT, n, $list49);

        if (SubLNil.NIL != tail)
            Errors.error($str45$Too_many__S_parameters_, FORMAT);

        SubLObject repeat = repitition_designator_value(n);
        if (repeat.isPositive()) {
            fresh_line(stream);
            SubLObject cdotimes_end_var;
            SubLObject i;
            for (cdotimes_end_var = subtract(repeat, ONE_INTEGER), i = SubLNil.NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER))
                terpri(stream);

        }
        return values(args, start);
    }

    public static SubLObject format_asterisk_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
        check_flags(CHAR_asterisk, at_sign_p, T, colonp, T);
        SubLObject count = SubLNil.NIL;
        count = parameters.first();
        SubLObject tail = parameters.rest();
        if (SubLNil.NIL == count)
            count = SubLNil.NIL;

        if (SubLNil.NIL == format_typep(count, $list49))
            Errors.error($str32$The__S_parameter__S_is_not_of_typ, FORMAT, count, $list49);

        if (SubLNil.NIL != tail)
            Errors.error($str45$Too_many__S_parameters_, FORMAT);

        if (SubLNil.NIL != at_sign_p) {
            if (SubLNil.NIL == count)
                count = ZERO_INTEGER;

            if (count.numG(length(all_args)))
                not_enough_format_arguments(CHAR_asterisk);

            return values(nthcdr(count, all_args), start);
        }
        if (SubLNil.NIL != colonp)
            return values(backup_args(args, all_args, SubLNil.NIL != count ? count : ONE_INTEGER), start);

        if (SubLNil.NIL == count)
            count = ONE_INTEGER;

        if (count.numG(length(args)))
            not_enough_format_arguments(CHAR_asterisk);

        return values(nthcdr(count, args), start);
    }

    public static SubLObject format_b_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
        format_integer(stream, args.first(), TWO_INTEGER, parameters, at_sign_p, colonp);
        return values(args.rest(), start);
    }

    public static SubLObject format_c_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (SubLNil.NIL != parameters)
            Errors.error($str45$Too_many__S_parameters_, FORMAT);

        SubLObject arg = args.first();
        assert SubLNil.NIL != characterp(arg) : arg;
        if (SubLNil.NIL != colonp)
            write_string(character_names.character_names(arg).first(), stream, UNPROVIDED, UNPROVIDED);
        else
            if (SubLNil.NIL != at_sign_p) {
                SubLObject _prev_bind_0 = $print_escape$.currentBinding(thread);
                try {
                    $print_escape$.bind(T, thread);
                    write_string($str47$__, stream, UNPROVIDED, UNPROVIDED);
                    write_string(character_names.character_names(arg).first(), stream, UNPROVIDED, UNPROVIDED);
                } finally {
                    $print_escape$.rebind(_prev_bind_0, thread);
                }
            } else
                write_char(arg, stream);


        return values(args.rest(), start);
    }

    public static SubLObject format_cardinal(SubLObject stream, SubLObject integer) {
        assert SubLNil.NIL != integerp(integer) : integer;
        if (integer.isZero())
            write_string($$$zero, stream, UNPROVIDED, UNPROVIDED);
        else
            if (integer.isNegative()) {
                write_string($$$minus_, stream, UNPROVIDED, UNPROVIDED);
                format_cardinal(stream, minus(integer));
            } else
                format_cardinal_internal(stream, integer, ZERO_INTEGER, SubLNil.NIL);


        return SubLNil.NIL;
    }

    public static SubLObject format_cardinal_internal(SubLObject stream, SubLObject integer, SubLObject group, SubLObject more) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject groups = $ic59;
        SubLObject length = length(groups);
        if (integer.isZero())
            return SubLNil.NIL;

        if (group.numGE(length)) {
            thread.resetMultipleValues();
            SubLObject zillions = integer_truncate(integer, expt(TEN_INTEGER, multiply(length, THREE_INTEGER)));
            SubLObject remainder = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (zillions.isPositive()) {
                format_cardinal_internal(stream, zillions, add(group, length), makeBoolean((SubLNil.NIL != more) || remainder.isPositive()));
                if (remainder.isPositive())
                    write_char(CHAR_space, stream);

            }
            if (remainder.isPositive()) {
                format_cardinal(stream, remainder);
                write_string($$$_times_ten_to_the_, stream, UNPROVIDED, UNPROVIDED);
                format_ordinal(stream, multiply(group, THREE_INTEGER));
                write_string($$$_power, stream, UNPROVIDED, UNPROVIDED);
                if (SubLNil.NIL != more)
                    write_string($$$_plus, stream, UNPROVIDED, UNPROVIDED);

            }
        } else {
            thread.resetMultipleValues();
            SubLObject thousands = truncate(integer, $int$1000);
            SubLObject L1000 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (thousands.isPositive()) {
                format_cardinal_internal(stream, thousands, add(group, ONE_INTEGER), makeBoolean((SubLNil.NIL != more) || L1000.isPositive()));
                if (L1000.isPositive())
                    write_char(CHAR_space, stream);

            }
            if (L1000.isPositive()) {
                thread.resetMultipleValues();
                SubLObject hundreds = truncate(L1000, $int$100);
                SubLObject L1001 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                thread.resetMultipleValues();
                SubLObject tens = truncate(L1001, TEN_INTEGER);
                SubLObject L1002 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (hundreds.isPositive()) {
                    write_string(aref($ic65, hundreds), stream, UNPROVIDED, UNPROVIDED);
                    write_string($$$_hundred, stream, UNPROVIDED, UNPROVIDED);
                }
                if (tens.numE(ONE_INTEGER)) {
                    if (hundreds.isPositive())
                        write_char(CHAR_space, stream);

                    write_string(aref($ic67, L1002), stream, UNPROVIDED, UNPROVIDED);
                } else {
                    if (tens.isPositive()) {
                        if (hundreds.isPositive())
                            write_char(CHAR_space, stream);

                        write_string(aref($ic68, tens), stream, UNPROVIDED, UNPROVIDED);
                    }
                    if (L1002.isPositive()) {
                        if (tens.isPositive())
                            write_char(CHAR_hyphen, stream);
                        else
                            if (hundreds.isPositive())
                                write_char(CHAR_space, stream);


                        write_string(aref($ic69, L1002), stream, UNPROVIDED, UNPROVIDED);
                    }
                }
                write_string(aref(groups, group), stream, UNPROVIDED, UNPROVIDED);
            }
        }
        return SubLNil.NIL;
    }

    public static SubLObject format_circumflex_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
        SubLThread thread = SubLProcess.currentSubLThread();
        check_flags(CHAR_caret, at_sign_p, SubLNil.NIL, colonp, T);
        SubLObject pcase_var = length(parameters);
        if (pcase_var.eql(ZERO_INTEGER)) {
            if ((SubLNil.NIL != args) && (SubLNil.NIL == colonp))
                return values(args, start);

        } else
            if (pcase_var.eql(ONE_INTEGER)) {
                SubLObject x = SubLNil.NIL;
                x = parameters.first();
                SubLObject tail = parameters.rest();
                if (SubLNil.NIL == x)
                    x = SubLNil.NIL;

                if (SubLNil.NIL == format_typep(x, INTEGER))
                    Errors.error($str32$The__S_parameter__S_is_not_of_typ, FORMAT, x, INTEGER);

                if (SubLNil.NIL != tail)
                    Errors.error($str45$Too_many__S_parameters_, FORMAT);

                if (!x.isZero())
                    return values(args, start);

            } else
                if (pcase_var.eql(TWO_INTEGER)) {
                    SubLObject y = SubLNil.NIL;
                    SubLObject x2 = SubLNil.NIL;
                    x2 = parameters.first();
                    SubLObject tail = parameters.rest();
                    if (SubLNil.NIL == x2)
                        x2 = SubLNil.NIL;

                    if (SubLNil.NIL == format_typep(x2, INTEGER))
                        Errors.error($str32$The__S_parameter__S_is_not_of_typ, FORMAT, x2, INTEGER);

                    y = tail.first();
                    tail = tail.rest();
                    if (SubLNil.NIL == y)
                        y = SubLNil.NIL;

                    if (SubLNil.NIL == format_typep(y, INTEGER))
                        Errors.error($str32$The__S_parameter__S_is_not_of_typ, FORMAT, y, INTEGER);

                    if (SubLNil.NIL != tail)
                        Errors.error($str45$Too_many__S_parameters_, FORMAT);

                    if (!x2.numE(y))
                        return values(args, start);

                } else
                    if (pcase_var.eql(THREE_INTEGER)) {
                        SubLObject z = SubLNil.NIL;
                        SubLObject y2 = SubLNil.NIL;
                        SubLObject x3 = SubLNil.NIL;
                        x3 = parameters.first();
                        SubLObject tail = parameters.rest();
                        if (SubLNil.NIL == x3)
                            x3 = SubLNil.NIL;

                        if (SubLNil.NIL == format_typep(x3, INTEGER))
                            Errors.error($str32$The__S_parameter__S_is_not_of_typ, FORMAT, x3, INTEGER);

                        y2 = tail.first();
                        tail = tail.rest();
                        if (SubLNil.NIL == y2)
                            y2 = SubLNil.NIL;

                        if (SubLNil.NIL == format_typep(y2, INTEGER))
                            Errors.error($str32$The__S_parameter__S_is_not_of_typ, FORMAT, y2, INTEGER);

                        z = tail.first();
                        tail = tail.rest();
                        if (SubLNil.NIL == z)
                            z = SubLNil.NIL;

                        if (SubLNil.NIL == format_typep(z, INTEGER))
                            Errors.error($str32$The__S_parameter__S_is_not_of_typ, FORMAT, z, INTEGER);

                        if (SubLNil.NIL != tail)
                            Errors.error($str45$Too_many__S_parameters_, FORMAT);

                        if ((!x3.numLE(y2)) || (!y2.numLE(z)))
                            return values(args, start);

                    }



        if ((SubLNil.NIL != colonp) && (SubLNil.NIL == $remaining_args$.getDynamicValue(thread)))
            sublisp_throw(UP_AND_ALL_THE_WAY_OUT, args);
        else
            sublisp_throw(UP_AND_OUT, args);

        return SubLNil.NIL;
    }

    public static SubLObject format_d_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
        format_integer(stream, args.first(), TEN_INTEGER, parameters, at_sign_p, colonp);
        return values(args.rest(), start);
    }

    public static SubLObject format_directive_p(SubLObject ch) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return gethash(ch, $format_directives$.getDynamicValue(thread), UNPROVIDED);
    }

    public static SubLObject format_dollarsign_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
        unimplemented_format_directive(CHAR_dollar, UNPROVIDED);
        return values(args, start);
    }

    public static SubLObject format_e_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
        unimplemented_format_directive(CHAR_E, UNPROVIDED);
        return values(args.rest(), start);
    }

    public static SubLObject format_f_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
        SubLThread thread = SubLProcess.currentSubLThread();
        check_flags(CHAR_F, at_sign_p, T, colonp, SubLNil.NIL);
        SubLObject _prev_bind_0 = $print_escape$.currentBinding(thread);
        SubLObject _prev_bind_2 = $print_readably$.currentBinding(thread);
        try {
            $print_escape$.bind(SubLNil.NIL, thread);
            $print_readably$.bind(SubLNil.NIL, thread);
            SubLObject arg = args.first();
            SubLObject padchar = SubLNil.NIL;
            SubLObject overflowchar = SubLNil.NIL;
            SubLObject k = SubLNil.NIL;
            SubLObject d = SubLNil.NIL;
            SubLObject w = SubLNil.NIL;
            w = parameters.first();
            SubLObject tail = parameters.rest();
            if (SubLNil.NIL == w)
                w = SubLNil.NIL;

            if (SubLNil.NIL == format_typep(w, $list49))
                Errors.error($str32$The__S_parameter__S_is_not_of_typ, FORMAT, w, $list49);

            d = tail.first();
            tail = tail.rest();
            if (SubLNil.NIL == d)
                d = SubLNil.NIL;

            if (SubLNil.NIL == format_typep(d, $list49))
                Errors.error($str32$The__S_parameter__S_is_not_of_typ, FORMAT, d, $list49);

            k = tail.first();
            tail = tail.rest();
            if (SubLNil.NIL == k)
                k = ZERO_INTEGER;

            if (SubLNil.NIL == format_typep(k, INTEGER))
                Errors.error($str32$The__S_parameter__S_is_not_of_typ, FORMAT, k, INTEGER);

            overflowchar = tail.first();
            tail = tail.rest();
            if (SubLNil.NIL == overflowchar)
                overflowchar = SubLNil.NIL;

            if (SubLNil.NIL == format_typep(overflowchar, $list88))
                Errors.error($str32$The__S_parameter__S_is_not_of_typ, FORMAT, overflowchar, $list88);

            padchar = tail.first();
            tail = tail.rest();
            if (SubLNil.NIL == padchar)
                padchar = CHAR_space;

            if (SubLNil.NIL == format_typep(padchar, CHARACTER))
                Errors.error($str32$The__S_parameter__S_is_not_of_typ, FORMAT, padchar, CHARACTER);

            if (SubLNil.NIL != tail)
                Errors.error($str45$Too_many__S_parameters_, FORMAT);

            if (arg.isInteger() || arg.isDouble()) {
                thread.resetMultipleValues();
                SubLObject left = split_flonum_digits(sublisp_float(arg, UNPROVIDED), k);
                SubLObject right = thread.secondMultipleValue();
                thread.resetMultipleValues();
                SubLObject left_size = SubLNil.NIL;
                SubLObject right_size = SubLNil.NIL;
                SubLObject padding = SubLNil.NIL;
                if (SubLNil.NIL != left)
                    left_size = length(left);
                else
                    if ((((SubLNil.NIL == left) && (SubLNil.NIL != w)) && (SubLNil.NIL != d)) && w.numE(add(d, ONE_INTEGER)))
                        left_size = ZERO_INTEGER;
                    else
                        if ((SubLNil.NIL == left) && (SubLNil.NIL == d))
                            left_size = ZERO_INTEGER;
                        else
                            left_size = ONE_INTEGER;



                SubLObject except_for_right_size = add(arg.isNegative() || (SubLNil.NIL != at_sign_p) ? ONE_INTEGER : ZERO_INTEGER, left_size, ONE_INTEGER);
                if (SubLNil.NIL != d)
                    right_size = d;
                else
                    if (SubLNil.NIL != w) {
                        SubLObject remaining = subtract(w, except_for_right_size);
                        if (remaining.isPositive())
                            right_size = max(min(remaining, length(right)), ONE_INTEGER);
                        else
                            right_size = ZERO_INTEGER;

                    } else
                        right_size = max(length(right), ONE_INTEGER);


                padding = (SubLNil.NIL != w) ? subtract(w, add(except_for_right_size, right_size)) : ZERO_INTEGER;
                if (!right_size.eql(length(right))) {
                    thread.resetMultipleValues();
                    SubLObject new_left = round_decimal_digits(left, right, right_size);
                    SubLObject new_right = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (length(new_left).numG(length(left)))
                        if (padding.numG(ZERO_INTEGER))
                            padding = subtract(padding, ONE_INTEGER);
                        else
                            if (SubLNil.NIL == d)
                                right_size = subtract(right_size, ONE_INTEGER);



                    left = new_left;
                    right = new_right;
                }
                if (SubLNil.NIL == d) {
                    SubLObject index = right_size;
                    SubLObject doneP = SubLNil.NIL;
                    if (SubLNil.NIL == doneP) {
                        SubLObject csome_list_var = right;
                        SubLObject dummy = SubLNil.NIL;
                        dummy = csome_list_var.first();
                        while ((SubLNil.NIL == doneP) && (SubLNil.NIL != csome_list_var)) {
                            index = subtract(index, ONE_INTEGER);
                            if (index.eql(ZERO_INTEGER))
                                doneP = T;
                            else
                                if (nth(index, right).eql(ZERO_INTEGER)) {
                                    padding = add(padding, ONE_INTEGER);
                                    right_size = subtract(right_size, ONE_INTEGER);
                                } else
                                    doneP = T;


                            csome_list_var = csome_list_var.rest();
                            dummy = csome_list_var.first();
                        } 
                    }
                }
                if (padding.isNegative() && (SubLNil.NIL != overflowchar))
                    format_repeat(stream, overflowchar, w);
                else {
                    if (!padding.isNegative())
                        format_repeat(stream, padchar, padding);

                    if (arg.isNegative())
                        write_char(CHAR_hyphen, stream);
                    else
                        if (SubLNil.NIL != at_sign_p)
                            write_char(CHAR_plus, stream);


                    if (SubLNil.NIL != left) {
                        SubLObject cdolist_list_var = left;
                        SubLObject digit = SubLNil.NIL;
                        digit = cdolist_list_var.first();
                        while (SubLNil.NIL != cdolist_list_var) {
                            write_char(digit_char(digit), stream);
                            cdolist_list_var = cdolist_list_var.rest();
                            digit = cdolist_list_var.first();
                        } 
                    } else
                        if (left_size.isPositive())
                            write_char(CHAR_0, stream);


                    write_char(CHAR_period, stream);
                    SubLObject count = ZERO_INTEGER;
                    SubLObject doneP = SubLNil.NIL;
                    if (SubLNil.NIL == doneP) {
                        SubLObject csome_list_var = right;
                        SubLObject digit2 = SubLNil.NIL;
                        digit2 = csome_list_var.first();
                        while ((SubLNil.NIL == doneP) && (SubLNil.NIL != csome_list_var)) {
                            count = add(count, ONE_INTEGER);
                            if (count.numGE(right_size))
                                doneP = T;

                            write_char(digit_char(digit2), stream);
                            csome_list_var = csome_list_var.rest();
                            digit2 = csome_list_var.first();
                        } 
                    }
                }
            } else
                format_integer(stream, arg, TEN_INTEGER, list(w), at_sign_p, SubLNil.NIL);

        } finally {
            $print_readably$.rebind(_prev_bind_2, thread);
            $print_escape$.rebind(_prev_bind_0, thread);
        }
        return values(args.rest(), start);
    }

    public static SubLObject format_g_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
        unimplemented_format_directive(CHAR_G, UNPROVIDED);
        return values(args, start);
    }

    public static SubLObject format_greater_than_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
        illegal_directive(string, start);
        return values(args, start);
    }

    public static SubLObject format_i_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
        SubLObject n = SubLNil.NIL;
        n = parameters.first();
        SubLObject tail = parameters.rest();
        if (SubLNil.NIL == n)
            n = ZERO_INTEGER;

        if (SubLNil.NIL == format_typep(n, $list54))
            Errors.error($str32$The__S_parameter__S_is_not_of_typ, FORMAT, n, $list54);

        if (SubLNil.NIL != tail)
            Errors.error($str45$Too_many__S_parameters_, FORMAT);

        check_flags(CHAR_I, at_sign_p, SubLNil.NIL, colonp, T);
        unimplemented_format_directive(CHAR_I, UNPROVIDED);
        return values(args, end);
    }

    public static SubLObject format_integer(SubLObject stream, SubLObject integer, SubLObject radix, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject _prev_bind_0 = $print_escape$.currentBinding(thread);
        SubLObject _prev_bind_2 = $print_radix$.currentBinding(thread);
        SubLObject _prev_bind_3 = $print_base$.currentBinding(thread);
        SubLObject _prev_bind_4 = $print_readably$.currentBinding(thread);
        try {
            $print_escape$.bind(SubLNil.NIL, thread);
            $print_radix$.bind(SubLNil.NIL, thread);
            $print_base$.bind(radix, thread);
            $print_readably$.bind(SubLNil.NIL, thread);
            if ((SubLNil.NIL != parameters) || (SubLNil.NIL != colonp)) {
                SubLObject comma_interval = SubLNil.NIL;
                SubLObject commachar = SubLNil.NIL;
                SubLObject padchar = SubLNil.NIL;
                SubLObject mincol = SubLNil.NIL;
                mincol = parameters.first();
                SubLObject tail = parameters.rest();
                if (SubLNil.NIL == mincol)
                    mincol = ZERO_INTEGER;

                if (SubLNil.NIL == format_typep(mincol, $list54))
                    Errors.error($str32$The__S_parameter__S_is_not_of_typ, FORMAT, mincol, $list54);

                padchar = tail.first();
                tail = tail.rest();
                if (SubLNil.NIL == padchar)
                    padchar = CHAR_space;

                if (SubLNil.NIL == format_typep(padchar, CHARACTER))
                    Errors.error($str32$The__S_parameter__S_is_not_of_typ, FORMAT, padchar, CHARACTER);

                commachar = tail.first();
                tail = tail.rest();
                if (SubLNil.NIL == commachar)
                    commachar = CHAR_comma;

                if (SubLNil.NIL == format_typep(commachar, CHARACTER))
                    Errors.error($str32$The__S_parameter__S_is_not_of_typ, FORMAT, commachar, CHARACTER);

                comma_interval = tail.first();
                tail = tail.rest();
                if (SubLNil.NIL == comma_interval)
                    comma_interval = THREE_INTEGER;

                if (SubLNil.NIL == format_typep(comma_interval, $list55))
                    Errors.error($str32$The__S_parameter__S_is_not_of_typ, FORMAT, comma_interval, $list55);

                if (SubLNil.NIL != tail)
                    Errors.error($str45$Too_many__S_parameters_, FORMAT);

                if (integer.isInteger()) {
                    SubLObject output = SubLNil.NIL;
                    SubLObject temp_stream = SubLNil.NIL;
                    try {
                        temp_stream = make_private_string_output_stream();
                        format_integer_internal(temp_stream, integer);
                        output = get_output_stream_string(temp_stream);
                    } finally {
                        SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            SubLObject _values = getValuesAsVector();
                            close(temp_stream, UNPROVIDED);
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                        }
                    }
                    if (SubLNil.NIL != colonp) {
                        SubLObject length = length(output);
                        thread.resetMultipleValues();
                        SubLObject segments = truncate(length, comma_interval);
                        SubLObject extras = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        SubLObject new_output = Strings.make_string(add(length, extras.isZero() ? subtract(segments, ONE_INTEGER) : segments), UNPROVIDED);
                        replace(new_output, output, ZERO_INTEGER, extras, ZERO_INTEGER, UNPROVIDED);
                        SubLObject idx = extras;
                        SubLObject new_idx = extras;
                        SubLObject i;
                        for (i = SubLNil.NIL, i = ZERO_INTEGER; i.numL(segments); i = add(i, ONE_INTEGER)) {
                            if (!new_idx.isZero()) {
                                Strings.set_char(new_output, new_idx, commachar);
                                new_idx = add(new_idx, ONE_INTEGER);
                            }
                            replace(new_output, output, new_idx, add(new_idx, comma_interval), idx, UNPROVIDED);
                            idx = add(idx, comma_interval);
                            new_idx = add(new_idx, comma_interval);
                        }
                        output = new_output;
                    }
                    if (integer.isNegative())
                        output = cconcatenate($str56$_, output);
                    else
                        if (SubLNil.NIL != at_sign_p)
                            output = cconcatenate($str57$_, output);


                    format_padded(stream, output, T, mincol, ONE_INTEGER, ZERO_INTEGER, padchar);
                } else
                    format_padded(stream, write_to_string(integer, EMPTY_SUBL_OBJECT_ARRAY), T, mincol, ONE_INTEGER, ZERO_INTEGER, padchar);

            } else {
                if (integer.isNegative())
                    write_char(CHAR_hyphen, stream);
                else
                    if (SubLNil.NIL != at_sign_p)
                        write_char(CHAR_plus, stream);


                format_integer_internal(stream, integer);
            }
        } finally {
            $print_readably$.rebind(_prev_bind_4, thread);
            $print_base$.rebind(_prev_bind_3, thread);
            $print_radix$.rebind(_prev_bind_2, thread);
            $print_escape$.rebind(_prev_bind_0, thread);
        }
        return SubLNil.NIL;
    }

    public static SubLObject format_integer_internal(SubLObject stream, SubLObject integer) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject quotient = truncate(integer, $print_base$.getDynamicValue(thread));
        SubLObject remainder = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (!quotient.isZero())
            format_integer_internal(stream, quotient);

        write_char(digit_char(abs(remainder)), stream);
        return SubLNil.NIL;
    }

    public static SubLObject format_internal(SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args) {
        SubLThread thread = SubLProcess.currentSubLThread();
        while (!start.numGE(end)) {
            thread.resetMultipleValues();
            SubLObject ch = parse_format_command(string, start, end, T, args);
            SubLObject directive_start = thread.secondMultipleValue();
            SubLObject directive_end = thread.thirdMultipleValue();
            SubLObject at_sign_p = thread.fourthMultipleValue();
            SubLObject colonp = thread.fifthMultipleValue();
            SubLObject parameters = thread.sixthMultipleValue();
            SubLObject new_args = thread.seventhMultipleValue();
            thread.resetMultipleValues();
            args = new_args;
            if (SubLNil.NIL == ch) {
                if (start.numL(end))
                    write_string(string, stream, start, end);

                return args;
            }
            if (start.numL(directive_start))
                write_string(string, stream, start, directive_start);

            thread.resetMultipleValues();
            SubLObject newer_args = call_format_directive(ch, stream, string, directive_end, end, new_args, all_args, parameters, at_sign_p, colonp);
            SubLObject new_start = thread.secondMultipleValue();
            thread.resetMultipleValues();
            args = newer_args;
            start = new_start;
        } 
        return args;
    }

    public static SubLObject format_iteration(SubLObject stream, SubLObject format_control, SubLObject start, SubLObject end, SubLObject min, SubLObject max, SubLObject args) {
        SubLThread thread = SubLProcess.currentSubLThread();
        try {
            thread.throwStack.push(UP_AND_OUT);
            SubLObject count;
            for (count = SubLNil.NIL, count = ZERO_INTEGER; ((SubLNil.NIL == max) || (!count.numGE(max))) && ((SubLNil.NIL != args) || (!count.numGE(min))); args = (format_control.isFunction()) ? apply(format_control, stream, args) : format_internal(stream, format_control, start, end, args, args) , count = add(count, ONE_INTEGER)) {
            }
        } catch (Throwable ccatch_env_var) {
            args = Errors.handleThrowable(ccatch_env_var, UP_AND_OUT);
        } finally {
            thread.throwStack.pop();
        }
        return args;
    }

    public static SubLObject format_left_brace_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject max = SubLNil.NIL;
        max = parameters.first();
        SubLObject tail = parameters.rest();
        if (SubLNil.NIL == max)
            max = SubLNil.NIL;

        if (SubLNil.NIL == format_typep(max, $list49))
            Errors.error($str32$The__S_parameter__S_is_not_of_typ, FORMAT, max, $list49);

        if (SubLNil.NIL != tail)
            Errors.error($str45$Too_many__S_parameters_, FORMAT);

        thread.resetMultipleValues();
        SubLObject expr_end = find_directive(CHAR_rbrace, string, start, end);
        SubLObject new_start = thread.secondMultipleValue();
        SubLObject expr_end_at_sign_p = thread.thirdMultipleValue();
        SubLObject expr_end_colonp = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if (SubLNil.NIL == expr_end)
            matching_bracket_not_found(CHAR_lbrace, CHAR_rbrace, string);

        check_flags(CHAR_lbrace, expr_end_at_sign_p, SubLNil.NIL, expr_end_colonp, T);
        SubLObject min = (SubLNil.NIL != expr_end_colonp) ? ONE_INTEGER : ZERO_INTEGER;
        SubLObject format_control = SubLNil.NIL;
        SubLObject format_args = args;
        if (start.numE(expr_end)) {
            format_control = format_args.first();
            format_args = format_args.rest();
            if (format_control.isString()) {
                start = ZERO_INTEGER;
                expr_end = length(format_control);
            } else
                if (!format_control.isFunction())
                    not_a_format_control(format_control);


        } else
            format_control = string;

        if ((SubLNil.NIL != at_sign_p) && (SubLNil.NIL != colonp))
            return values(format_sublist_iteration(stream, format_control, start, expr_end, min, max, format_args), new_start);

        if (SubLNil.NIL != at_sign_p)
            return values(format_iteration(stream, format_control, start, expr_end, min, max, format_args), new_start);

        if (SubLNil.NIL != colonp) {
            if (!format_args.first().isList())
                not_a_list_argument(CHAR_lbrace);

            format_sublist_iteration(stream, format_control, start, expr_end, min, max, format_args.first());
            return values(format_args.rest(), new_start);
        }
        if (!format_args.first().isList())
            not_a_list_argument(CHAR_lbrace);

        format_iteration(stream, format_control, start, expr_end, min, max, format_args.first());
        return values(format_args.rest(), new_start);
    }

    public static SubLObject format_left_bracket_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
        SubLThread thread = SubLProcess.currentSubLThread();
        check_flags(CHAR_lbracket, at_sign_p, T, colonp, T);
        thread.resetMultipleValues();
        SubLObject expr_end = find_directive(CHAR_rbracket, string, start, end);
        SubLObject new_start = thread.secondMultipleValue();
        SubLObject expr_end_at_sign_p = thread.thirdMultipleValue();
        SubLObject expr_end_colonp = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if (SubLNil.NIL == expr_end)
            matching_bracket_not_found(CHAR_lbracket, CHAR_rbracket, string);

        check_flags(CHAR_rbracket, expr_end_at_sign_p, SubLNil.NIL, expr_end_colonp, SubLNil.NIL);
        if (SubLNil.NIL != at_sign_p) {
            if (SubLNil.NIL != parameters)
                Errors.error($str45$Too_many__S_parameters_, FORMAT);

            if (SubLNil.NIL != args.first())
                return values(format_internal(stream, string, start, expr_end, args, all_args), new_start);

            return values(args.rest(), new_start);
        } else
            if (SubLNil.NIL != colonp) {
                if (SubLNil.NIL != parameters)
                    Errors.error($str45$Too_many__S_parameters_, FORMAT);

                thread.resetMultipleValues();
                SubLObject separator_start = find_directive(CHAR_semicolon, string, start, expr_end);
                SubLObject separator_end = thread.secondMultipleValue();
                SubLObject separator_at_sign_p = thread.thirdMultipleValue();
                SubLObject separator_colonp = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                if (SubLNil.NIL == separator_start)
                    Errors.error($str107$No_clause_marker_found_for__S__S_, CHAR_lbracket, FORMAT);

                check_flags(CHAR_semicolon, separator_at_sign_p, SubLNil.NIL, separator_colonp, SubLNil.NIL);
                if (SubLNil.NIL != args.first())
                    return values(format_internal(stream, string, separator_end, expr_end, args.rest(), all_args), new_start);

                return values(format_internal(stream, string, start, separator_start, args.rest(), all_args), new_start);
            } else {
                SubLObject index = SubLNil.NIL;
                index = parameters.first();
                SubLObject tail = parameters.rest();
                if (SubLNil.NIL == index)
                    index = SubLNil.NIL;

                if (SubLNil.NIL == format_typep(index, $list108))
                    Errors.error($str32$The__S_parameter__S_is_not_of_typ, FORMAT, index, $list108);

                if (SubLNil.NIL != tail)
                    Errors.error($str45$Too_many__S_parameters_, FORMAT);

                if (SubLNil.NIL == index) {
                    index = args.first();
                    args = args.rest();
                }
                assert SubLNil.NIL != integerp(index) : index;
                SubLObject default_start = SubLNil.NIL;
                SubLObject count = ZERO_INTEGER;
                SubLObject donep = SubLNil.NIL;
                SubLObject clause_start = start;
                while ((SubLNil.NIL == donep) && (SubLNil.NIL == default_start)) {
                    thread.resetMultipleValues();
                    SubLObject separator_start2 = find_directive(CHAR_semicolon, string, clause_start, expr_end);
                    SubLObject separator_end2 = thread.secondMultipleValue();
                    SubLObject separator_at_sign_p2 = thread.thirdMultipleValue();
                    SubLObject separator_colonp2 = thread.fourthMultipleValue();
                    thread.resetMultipleValues();
                    check_flags(CHAR_semicolon, separator_at_sign_p2, SubLNil.NIL, separator_colonp2, T);
                    if (count.numE(index))
                        return values(format_internal(stream, string, clause_start, SubLNil.NIL != separator_start2 ? separator_start2 : expr_end, args, all_args), new_start);

                    count = add(count, ONE_INTEGER);
                    if (SubLNil.NIL != separator_start2) {
                        if (SubLNil.NIL != separator_colonp2)
                            default_start = separator_end2;
                        else
                            clause_start = separator_end2;

                    } else
                        donep = T;

                } 
                if (SubLNil.NIL != default_start)
                    return values(format_internal(stream, string, default_start, expr_end, args, all_args), new_start);

                return values(args, new_start);
            }

    }

    public static SubLObject format_left_paren_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (SubLNil.NIL != parameters)
            Errors.error($str45$Too_many__S_parameters_, FORMAT);

        thread.resetMultipleValues();
        SubLObject expr_end = find_directive(CHAR_rparen, string, start, end);
        SubLObject new_start = thread.secondMultipleValue();
        SubLObject expr_end_at_sign_p = thread.thirdMultipleValue();
        SubLObject expr_end_colonp = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if (SubLNil.NIL == expr_end)
            matching_bracket_not_found(CHAR_lbrace, CHAR_rbrace, string);

        check_flags(CHAR_rparen, expr_end_at_sign_p, SubLNil.NIL, expr_end_colonp, SubLNil.NIL);
        SubLObject continue_throw = T;
        SubLObject new_args = SubLNil.NIL;
        SubLObject output = SubLNil.NIL;
        SubLObject string_stream = SubLNil.NIL;
        try {
            string_stream = make_private_string_output_stream();
            try {
                thread.throwStack.push(UP_AND_OUT);
                new_args = format_internal(string_stream, string, start, expr_end, args, all_args);
                continue_throw = SubLNil.NIL;
            } catch (Throwable ccatch_env_var) {
                new_args = Errors.handleThrowable(ccatch_env_var, UP_AND_OUT);
            } finally {
                thread.throwStack.pop();
            }
            output = get_output_stream_string(string_stream);
        } finally {
            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                SubLObject _values = getValuesAsVector();
                close(string_stream, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        if ((SubLNil.NIL != at_sign_p) && (SubLNil.NIL != colonp))
            output = Strings.nstring_upcase(output, UNPROVIDED, UNPROVIDED);
        else
            if (SubLNil.NIL != at_sign_p) {
                output = Strings.nstring_downcase(output, UNPROVIDED, UNPROVIDED);
                SubLObject length;
                SubLObject done;
                SubLObject i;
                for (length = length(output), done = SubLNil.NIL, i = SubLNil.NIL, i = ZERO_INTEGER; (SubLNil.NIL == done) && (!i.numE(length)); i = add(i, ONE_INTEGER))
                    if (SubLNil.NIL != alpha_char_p(Strings.sublisp_char(output, i))) {
                        Strings.set_char(output, i, char_upcase(Strings.sublisp_char(output, i)));
                        done = T;
                    }

            } else
                if (SubLNil.NIL != colonp)
                    output = Strings.nstring_capitalize(output, UNPROVIDED, UNPROVIDED);
                else
                    output = Strings.nstring_downcase(output, UNPROVIDED, UNPROVIDED);



        write_string(output, stream, UNPROVIDED, UNPROVIDED);
        if (SubLNil.NIL != continue_throw) {
            sublisp_throw(UP_AND_OUT, new_args);
            return SubLNil.NIL;
        }
        return values(new_args, new_start);
    }

    public static SubLObject format_less_than_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
        unimplemented_format_directive(CHAR_less, UNPROVIDED);
        return values(args, start);
    }

    public static SubLObject format_newline_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
        if (SubLNil.NIL != parameters)
            Errors.error($str45$Too_many__S_parameters_, FORMAT);

        if (SubLNil.NIL != colonp)
            return values(args, start);

        if (SubLNil.NIL != at_sign_p)
            write_char(CHAR_newline, stream);

        while ((!start.numG(end)) && (SubLNil.NIL != whitespace_1_char_p(Strings.sublisp_char(string, start))))
            start = add(start, ONE_INTEGER);

        return values(args, start);
    }

    public static SubLObject format_o_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
        format_integer(stream, args.first(), EIGHT_INTEGER, parameters, at_sign_p, colonp);
        return values(args.rest(), start);
    }

    public static SubLObject format_ordinal(SubLObject stream, SubLObject integer) {
        SubLThread thread = SubLProcess.currentSubLThread();
        assert SubLNil.NIL != integerp(integer) : integer;
        if (integer.isZero())
            write_string($$$zeroth, stream, UNPROVIDED, UNPROVIDED);
        else
            if (integer.isNegative()) {
                write_string($$$minus_, stream, UNPROVIDED, UNPROVIDED);
                format_ordinal(stream, minus(integer));
            } else {
                thread.resetMultipleValues();
                SubLObject hundreds = truncate(integer, $int$100);
                SubLObject remainder = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (!hundreds.isZero())
                    format_cardinal(stream, subtract(integer, remainder));

                if (remainder.isPositive()) {
                    thread.resetMultipleValues();
                    SubLObject tens = truncate(remainder, TEN_INTEGER);
                    SubLObject zeros = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (hundreds.isPositive())
                        write_char(CHAR_space, stream);

                    if (zeros.isZero())
                        write_string(aref($ic73, tens), stream, UNPROVIDED, UNPROVIDED);
                    else
                        if (tens.numE(ONE_INTEGER))
                            write_string(aref($ic74, zeros), stream, UNPROVIDED, UNPROVIDED);
                        else {
                            if (tens.isPositive()) {
                                format_cardinal(stream, subtract(remainder, zeros));
                                write_char(CHAR_hyphen, stream);
                            }
                            write_string(aref($ic75, zeros), stream, UNPROVIDED, UNPROVIDED);
                        }

                } else
                    write_string($$$th, stream, UNPROVIDED, UNPROVIDED);

            }

        return SubLNil.NIL;
    }

    public static SubLObject format_p_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
        if (SubLNil.NIL != parameters)
            Errors.error($str45$Too_many__S_parameters_, FORMAT);

        SubLObject arg = SubLNil.NIL;
        if (SubLNil.NIL != colonp)
            arg = backup_args(args, all_args, ONE_INTEGER).first();
        else {
            arg = args.first();
            args = args.rest();
        }
        if (SubLNil.NIL != at_sign_p) {
            if (arg.eql(ONE_INTEGER))
                write_char(CHAR_y, stream);
            else
                write_string($$$ies, stream, UNPROVIDED, UNPROVIDED);

        } else
            if (!arg.eql(ONE_INTEGER))
                write_char(CHAR_s, stream);


        return values(args, start);
    }

    public static SubLObject format_padded(SubLObject stream, SubLObject string, SubLObject pad_left_p, SubLObject mincol, SubLObject colinc, SubLObject minpad, SubLObject padchar) {
        SubLObject length = add(length(string), minpad);
        SubLObject padding = add(minpad, length.numL(mincol) ? multiply(ceiling(subtract(mincol, length), colinc), colinc) : ZERO_INTEGER);
        if (SubLNil.NIL != pad_left_p)
            format_repeat(stream, padchar, padding);

        write_string(string, stream, UNPROVIDED, UNPROVIDED);
        if (SubLNil.NIL == pad_left_p)
            format_repeat(stream, padchar, padding);

        return SubLNil.NIL;
    }

    public static SubLObject format_percent_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
        check_flags(CHAR_percent, at_sign_p, SubLNil.NIL, colonp, SubLNil.NIL);
        SubLObject n = SubLNil.NIL;
        n = parameters.first();
        SubLObject tail = parameters.rest();
        if (SubLNil.NIL == n)
            n = SubLNil.NIL;

        if (SubLNil.NIL == format_typep(n, $list49))
            Errors.error($str32$The__S_parameter__S_is_not_of_typ, FORMAT, n, $list49);

        if (SubLNil.NIL != tail)
            Errors.error($str45$Too_many__S_parameters_, FORMAT);

        SubLObject cdotimes_end_var;
        SubLObject i;
        for (cdotimes_end_var = repitition_designator_value(n), i = SubLNil.NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER))
            terpri(stream);

        return values(args, start);
    }

    public static SubLObject format_question_mark_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
        SubLThread thread = SubLProcess.currentSubLThread();
        check_flags(CHAR_question, at_sign_p, T, colonp, SubLNil.NIL);
        if (SubLNil.NIL != parameters)
            Errors.error($str45$Too_many__S_parameters_, FORMAT);

        if (SubLNil.NIL != at_sign_p) {
            SubLObject string_$4 = args.first();
            SubLObject new_args = SubLNil.NIL;
            assert SubLNil.NIL != stringp(string_$4) : string_$4;
            try {
                thread.throwStack.push(UP_AND_OUT);
                new_args = format_internal(stream, string_$4, ZERO_INTEGER, length(string_$4), args.rest(), all_args);
            } catch (Throwable ccatch_env_var) {
                new_args = Errors.handleThrowable(ccatch_env_var, UP_AND_OUT);
            } finally {
                thread.throwStack.pop();
            }
            return values(new_args, start);
        } else {
            SubLObject format_control = args.first();
            SubLObject sub_args = cadr(args);
            SubLObject dummy = SubLNil.NIL;
            assert SubLNil.NIL != listp(sub_args) : sub_args;
            try {
                thread.throwStack.push(UP_AND_OUT);
                if (format_control.isString())
                    format_internal(stream, format_control, ZERO_INTEGER, length(format_control), sub_args, sub_args);
                else
                    if (format_control.isFunction())
                        apply(format_control, stream, sub_args);
                    else
                        not_a_format_control(format_control);


            } catch (Throwable ccatch_env_var2) {
                dummy = Errors.handleThrowable(ccatch_env_var2, UP_AND_OUT);
            } finally {
                thread.throwStack.pop();
            }
            return values(cddr(args), start);
        }
    }

    public static SubLObject format_r_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (SubLNil.NIL != parameters) {
            SubLObject radix = parameters.first();
            if (((!radix.isInteger()) || (!radix.numGE(TWO_INTEGER))) || (!radix.numLE($int$36)))
                Errors.error($str78$_S_is_not_a_valid_radix_, radix);

            format_integer(stream, args.first(), radix, parameters.rest(), at_sign_p, colonp);
        } else {
            SubLObject _prev_bind_0 = $print_base$.currentBinding(thread);
            try {
                $print_base$.bind(TEN_INTEGER, thread);
                SubLObject arg = args.first();
                assert SubLNil.NIL != integerp(arg) : arg;
                if ((SubLNil.NIL != at_sign_p) && (SubLNil.NIL != colonp)) {
                    if (arg.isPositive()) {
                        SubLObject chars;
                        SubLObject vals;
                        for (chars = SubLNil.NIL, vals = SubLNil.NIL, chars = $list79, vals = $list80; !arg.isZero(); arg = rem(arg, vals.first()) , chars = chars.rest() , vals = vals.rest())
                            format_repeat(stream, chars.first(), truncate(arg, vals.first()));

                    } else
                        format_integer(stream, arg, TEN_INTEGER, SubLNil.NIL, SubLNil.NIL, SubLNil.NIL);

                } else
                    if (SubLNil.NIL != at_sign_p) {
                        if (arg.isPositive()) {
                            SubLObject chars = SubLNil.NIL;
                            SubLObject vals = SubLNil.NIL;
                            SubLObject sub_vals = SubLNil.NIL;
                            SubLObject sub_chars = SubLNil.NIL;
                            chars = $list79;
                            vals = $list80;
                            sub_vals = $list81;
                            sub_chars = $list82;
                            while (!arg.isZero()) {
                                format_repeat(stream, chars.first(), integerDivide(arg, vals.first()));
                                arg = rem(arg, vals.first());
                                if ((SubLNil.NIL != sub_vals) && arg.numGE(sub_vals.first())) {
                                    write_char(sub_chars.first(), stream);
                                    write_char(chars.first(), stream);
                                    arg = subtract(arg, sub_vals.first());
                                }
                                chars = chars.rest();
                                vals = vals.rest();
                                sub_vals = sub_vals.rest();
                                sub_chars = sub_chars.rest();
                            } 
                        } else
                            format_integer(stream, arg, TEN_INTEGER, SubLNil.NIL, SubLNil.NIL, SubLNil.NIL);

                    } else
                        if (SubLNil.NIL != colonp)
                            format_ordinal(stream, arg);
                        else
                            format_cardinal(stream, arg);



            } finally {
                $print_base$.rebind(_prev_bind_0, thread);
            }
        }
        return values(args.rest(), start);
    }

    public static SubLObject format_repeat(SubLObject stream, SubLObject ch, SubLObject count) {
        SubLObject cdotimes_end_var;
        SubLObject i;
        for (cdotimes_end_var = repitition_designator_value(count), i = SubLNil.NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER))
            write_char(ch, stream);

        return SubLNil.NIL;
    }

    public static SubLObject format_right_brace_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
        illegal_directive(string, start);
        return values(args, start);
    }

    public static SubLObject format_right_bracket_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
        illegal_directive(string, start);
        return values(args, start);
    }

    public static SubLObject format_right_paren_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
        illegal_directive(string, start);
        return values(args, start);
    }

    public static SubLObject format_s_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject _prev_bind_0 = $print_escape$.currentBinding(thread);
        try {
            $print_escape$.bind(T, thread);
            SubLObject arg = args.first();
            if ((SubLNil.NIL != colonp) && (SubLNil.NIL == arg))
                arg = $str93$__;

            if (SubLNil.NIL != parameters) {
                SubLObject padchar = SubLNil.NIL;
                SubLObject minpad = SubLNil.NIL;
                SubLObject colinc = SubLNil.NIL;
                SubLObject mincol = SubLNil.NIL;
                mincol = parameters.first();
                SubLObject tail = parameters.rest();
                if (SubLNil.NIL == mincol)
                    mincol = ZERO_INTEGER;

                if (SubLNil.NIL == format_typep(mincol, $list54))
                    Errors.error($str32$The__S_parameter__S_is_not_of_typ, FORMAT, mincol, $list54);

                colinc = tail.first();
                tail = tail.rest();
                if (SubLNil.NIL == colinc)
                    colinc = ONE_INTEGER;

                if (SubLNil.NIL == format_typep(colinc, $list54))
                    Errors.error($str32$The__S_parameter__S_is_not_of_typ, FORMAT, colinc, $list54);

                minpad = tail.first();
                tail = tail.rest();
                if (SubLNil.NIL == minpad)
                    minpad = ZERO_INTEGER;

                if (SubLNil.NIL == format_typep(minpad, $list54))
                    Errors.error($str32$The__S_parameter__S_is_not_of_typ, FORMAT, minpad, $list54);

                padchar = tail.first();
                tail = tail.rest();
                if (SubLNil.NIL == padchar)
                    padchar = CHAR_space;

                if (SubLNil.NIL == format_typep(padchar, CHARACTER))
                    Errors.error($str32$The__S_parameter__S_is_not_of_typ, FORMAT, padchar, CHARACTER);

                if (SubLNil.NIL != tail)
                    Errors.error($str45$Too_many__S_parameters_, FORMAT);

                funcall(symbol_function(FORMAT_PADDED), new SubLObject[]{ stream, write_to_string(arg, EMPTY_SUBL_OBJECT_ARRAY), at_sign_p, mincol, colinc, minpad, padchar });
            } else
                prin1(arg, stream);

        } finally {
            $print_escape$.rebind(_prev_bind_0, thread);
        }
        return values(args.rest(), start);
    }

    public static SubLObject format_semicolon_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
        illegal_directive(string, start);
        return values(args, start);
    }

    public static SubLObject format_slash_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
        check_flags(CHAR_slash, at_sign_p, SubLNil.NIL, colonp, T);
        SubLObject slash_idx = position(CHAR_slash, string, symbol_function($sym101$CHAR_), symbol_function(IDENTITY), start, end);
        if (SubLNil.NIL == slash_idx)
            matching_bracket_not_found(CHAR_slash, CHAR_slash, string);

        SubLObject symbol = intern(Strings.string_upcase(string, start, slash_idx), UNPROVIDED);
        apply(symbol, stream, new SubLObject[]{ args.first(), colonp, at_sign_p, parameters });
        return values(args.rest(), add(slash_idx, ONE_INTEGER));
    }

    public static SubLObject format_sublist_iteration(SubLObject stream, SubLObject format_control, SubLObject start, SubLObject end, SubLObject min, SubLObject max, SubLObject args) {
        SubLThread thread = SubLProcess.currentSubLThread();
        try {
            thread.throwStack.push(UP_AND_ALL_THE_WAY_OUT);
            SubLObject count = SubLNil.NIL;
            SubLObject sub_args = SubLNil.NIL;
            count = ZERO_INTEGER;
            sub_args = args.first();
            while (((SubLNil.NIL == max) || (!count.numGE(max))) && ((SubLNil.NIL != args) || (!count.numGE(min)))) {
                if (!sub_args.isList())
                    not_a_list_argument(CHAR_lbrace);

                args = args.rest();
                SubLObject _prev_bind_0 = $remaining_args$.currentBinding(thread);
                try {
                    $remaining_args$.bind(args, thread);
                    SubLObject dummy = SubLNil.NIL;
                    try {
                        thread.throwStack.push(UP_AND_OUT);
                        if (format_control.isFunction())
                            apply(format_control, stream, sub_args);
                        else
                            format_internal(stream, format_control, start, end, sub_args, sub_args);

                    } catch (Throwable ccatch_env_var) {
                        dummy = Errors.handleThrowable(ccatch_env_var, UP_AND_OUT);
                    } finally {
                        thread.throwStack.pop();
                    }
                } finally {
                    $remaining_args$.rebind(_prev_bind_0, thread);
                }
                count = add(count, ONE_INTEGER);
                sub_args = args.first();
            } 
        } catch (Throwable ccatch_env_var2) {
            args = Errors.handleThrowable(ccatch_env_var2, UP_AND_ALL_THE_WAY_OUT);
        } finally {
            thread.throwStack.pop();
        }
        return args;
    }

    public static SubLObject format_t_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
        SubLObject colinc = SubLNil.NIL;
        SubLObject colnum = SubLNil.NIL;
        colnum = parameters.first();
        SubLObject tail = parameters.rest();
        if (SubLNil.NIL == colnum)
            colnum = ONE_INTEGER;

        if (SubLNil.NIL == format_typep(colnum, $list54))
            Errors.error($str32$The__S_parameter__S_is_not_of_typ, FORMAT, colnum, $list54);

        colinc = tail.first();
        tail = tail.rest();
        if (SubLNil.NIL == colinc)
            colinc = ONE_INTEGER;

        if (SubLNil.NIL == format_typep(colinc, $list54))
            Errors.error($str32$The__S_parameter__S_is_not_of_typ, FORMAT, colinc, $list54);

        if (SubLNil.NIL != tail)
            Errors.error($str45$Too_many__S_parameters_, FORMAT);

        if ((SubLNil.NIL != at_sign_p) && (SubLNil.NIL != colonp))
            unimplemented_format_directive(CHAR_T, T);
        else
            if (SubLNil.NIL != at_sign_p)
                format_repeat(stream, CHAR_space, colnum);
            else
                if (SubLNil.NIL != colonp)
                    unimplemented_format_directive(CHAR_T, T);
                else {
                    SubLObject current = stream_line_column(stream);
                    if (SubLNil.NIL == current)
                        current = ZERO_INTEGER;

                    if (current.numL(colnum))
                        format_repeat(stream, CHAR_space, subtract(colnum, current));
                    else
                        if (!colinc.isZero())
                            format_repeat(stream, CHAR_space, subtract(colinc, mod(subtract(current, colnum), colinc)));


                }


        return values(args, start);
    }

    public static SubLObject format_tilde_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
        check_flags(CHAR_tilde, at_sign_p, SubLNil.NIL, colonp, SubLNil.NIL);
        SubLObject n = SubLNil.NIL;
        n = parameters.first();
        SubLObject tail = parameters.rest();
        if (SubLNil.NIL == n)
            n = SubLNil.NIL;

        if (SubLNil.NIL == format_typep(n, $list49))
            Errors.error($str32$The__S_parameter__S_is_not_of_typ, FORMAT, n, $list49);

        if (SubLNil.NIL != tail)
            Errors.error($str45$Too_many__S_parameters_, FORMAT);

        format_repeat(stream, CHAR_tilde, n);
        return values(args, start);
    }

    public static SubLObject format_typep(SubLObject object, SubLObject type) {
        if (type.isCons()) {
            SubLObject pcase_var = type.first();
            if (pcase_var.eql(OR)) {
                SubLObject cdolist_list_var = type.rest();
                SubLObject distype = SubLNil.NIL;
                distype = cdolist_list_var.first();
                while (SubLNil.NIL != cdolist_list_var) {
                    if (SubLNil.NIL != format_typep(object, distype))
                        return T;

                    cdolist_list_var = cdolist_list_var.rest();
                    distype = cdolist_list_var.first();
                } 
                return SubLNil.NIL;
            }
            if (pcase_var.eql(INTEGER)) {
                SubLObject current;
                SubLObject datum = current = type.rest();
                SubLObject start = (current.isCons()) ? current.first() : SubLNil.NIL;
                destructuring_bind_must_listp(current, datum, $list18);
                current = current.rest();
                SubLObject end = (current.isCons()) ? current.first() : SubLNil.NIL;
                destructuring_bind_must_listp(current, datum, $list18);
                current = current.rest();
                if (SubLNil.NIL == current) {
                    if ((SubLNil.NIL != start) && object.numL(start))
                        return SubLNil.NIL;

                    if ((SubLNil.NIL != end) && object.numG(end))
                        return SubLNil.NIL;

                    return T;
                } else
                    cdestructuring_bind_error(datum, $list18);

            } else
                Errors.error($str19$Unrecognized_type_specifier__S_, type);

        } else {
            if (type == INTEGER)
                return integerp(object);

            if (type == CHARACTER)
                return characterp(object);

            if (type == NULL)
                return sublisp_null(object);

            Errors.error($str19$Unrecognized_type_specifier__S_, type);
        }
        return SubLNil.NIL;
    }

    public static SubLObject format_underscore_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
        unimplemented_format_directive(CHAR_underbar, UNPROVIDED);
        return values(args, start);
    }

    public static SubLObject format_vertical_bar_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
        check_flags(CHAR_vertical, at_sign_p, SubLNil.NIL, colonp, SubLNil.NIL);
        SubLObject n = SubLNil.NIL;
        n = parameters.first();
        SubLObject tail = parameters.rest();
        if (SubLNil.NIL == n)
            n = SubLNil.NIL;

        if (SubLNil.NIL == format_typep(n, $list49))
            Errors.error($str32$The__S_parameter__S_is_not_of_typ, FORMAT, n, $list49);

        if (SubLNil.NIL != tail)
            Errors.error($str45$Too_many__S_parameters_, FORMAT);

        format_repeat(stream, CHAR_page, n);
        return values(args, start);
    }

    public static SubLObject format_w_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (SubLNil.NIL != parameters)
            Errors.error($str45$Too_many__S_parameters_, FORMAT);

        SubLObject _prev_bind_0 = $print_pretty$.currentBinding(thread);
        SubLObject _prev_bind_2 = $print_level$.currentBinding(thread);
        SubLObject _prev_bind_3 = $print_length$.currentBinding(thread);
        try {
            $print_pretty$.bind(SubLNil.NIL != colonp ? T : $print_pretty$.getDynamicValue(thread), thread);
            $print_level$.bind(SubLNil.NIL != at_sign_p ? SubLNil.NIL : $print_level$.getDynamicValue(thread), thread);
            $print_length$.bind(SubLNil.NIL != at_sign_p ? SubLNil.NIL : $print_length$.getDynamicValue(thread), thread);
            write(args.first(), new SubLObject[]{ $STREAM, stream });
        } finally {
            $print_length$.rebind(_prev_bind_3, thread);
            $print_level$.rebind(_prev_bind_2, thread);
            $print_pretty$.rebind(_prev_bind_0, thread);
        }
        return values(args.rest(), start);
    }

    public static SubLObject format_x_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
        format_integer(stream, args.first(), SIXTEEN_INTEGER, parameters, at_sign_p, colonp);
        return values(args.rest(), start);
    }

    public static SubLObject illegal_directive(SubLObject string, SubLObject index) {
        Errors.error($str37$Stray____C_directive_in__S_string, Strings.sublisp_char(string, subtract(index, ONE_INTEGER)), FORMAT, string);
        return SubLNil.NIL;
    }

    public static SubLObject init_format_file() {
        defvar("*FORMAT-DIRECTIVES*", make_hash_table($int$50, UNPROVIDED, UNPROVIDED));
        defvar("*MATCHING-BRACKETS*", make_hash_table(TEN_INTEGER, UNPROVIDED, UNPROVIDED));
        defvar("*REMAINING-ARGS*", SubLNil.NIL);
        return SubLNil.NIL;
    }

    public static SubLObject integer_truncate(SubLObject numerator, SubLObject denominator) {
        assert SubLNil.NIL != integerp(numerator) : numerator;
        assert SubLNil.NIL != integerp(denominator) : denominator;
        SubLObject result = integerDivide(numerator, denominator);
        SubLObject remainder = subtract(numerator, multiply(result, denominator));
        return values(result, remainder);
    }

    public static SubLObject matching_bracket(SubLObject ch) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return gethash(ch, $matching_brackets$.getDynamicValue(thread), UNPROVIDED);
    }

    public static SubLObject matching_bracket_not_found(SubLObject left, SubLObject right, SubLObject string) {
        Errors.error($str41$No_matching__S_found_for__S_in__S, right, left, string);
        return SubLNil.NIL;
    }

    public static SubLObject not_a_format_control(SubLObject thing) {
        Errors.error($str43$_S_is_not_a_valid__S_control_, thing, FORMAT);
        return SubLNil.NIL;
    }

    public static SubLObject not_a_list_argument(SubLObject directive) {
        Errors.error($str42$The__S__S_directive_takes_a_list_, directive, FORMAT);
        return SubLNil.NIL;
    }

    public static SubLObject not_enough_format_arguments(SubLObject directive) {
        Errors.error($str40$_S_directive__S_ran_out_of_argume, FORMAT, directive);
        return SubLNil.NIL;
    }

    public static SubLObject parse_format_command(SubLObject string, SubLObject start, SubLObject end, SubLObject for_effect_p, SubLObject args) {
        if (for_effect_p == UNPROVIDED)
            for_effect_p = SubLNil.NIL;

        if (args == UNPROVIDED)
            args = SubLNil.NIL;

        SubLObject state = $NORMAL;
        SubLObject parameters = SubLNil.NIL;
        SubLObject at_sign_p = SubLNil.NIL;
        SubLObject colonp = SubLNil.NIL;
        SubLObject minusp = SubLNil.NIL;
        SubLObject number = ZERO_INTEGER;
        SubLObject tilde_idx = SubLNil.NIL;
        SubLObject i;
        for (i = start; !i.numGE(end); i = add(i, ONE_INTEGER)) {
            SubLObject ch = Strings.sublisp_char(string, i);
            SubLObject pcase_var = state;
            if (pcase_var.eql($NORMAL)) {
                if (SubLNil.NIL != charE(ch, CHAR_tilde)) {
                    tilde_idx = i;
                    state = $TILDE;
                }
            } else
                if (pcase_var.eql($TILDE)) {
                    if (SubLNil.NIL != charE(ch, CHAR_hash)) {
                        if (SubLNil.NIL != for_effect_p)
                            parameters = cons(length(args), parameters);

                        state = $PARAM;
                    } else
                        if (SubLNil.NIL != char_equal(ch, CHAR_V)) {
                            if (SubLNil.NIL != for_effect_p) {
                                SubLObject parameter = args.first();
                                if (((!parameter.isChar()) && (!parameter.isInteger())) && (SubLNil.NIL != parameter))
                                    Errors.error($str131$_S_parameter__S_is_not_a_characte, FORMAT, parameter);

                                if (SubLNil.NIL != parameter)
                                    parameters = cons(parameter, parameters);

                                args = args.rest();
                            }
                            state = $PARAM;
                        } else
                            if (SubLNil.NIL != charE(ch, CHAR_quote))
                                state = $QUOTE;
                            else
                                if (SubLNil.NIL != charE(ch, CHAR_comma)) {
                                    if (SubLNil.NIL != for_effect_p)
                                        parameters = cons(SubLNil.NIL, parameters);

                                } else
                                    if (SubLNil.NIL != charE(ch, CHAR_colon)) {
                                        colonp = T;
                                        state = $COLON;
                                    } else
                                        if (SubLNil.NIL != charE(ch, CHAR_at)) {
                                            at_sign_p = T;
                                            state = $AT_SIGN;
                                        } else
                                            if (SubLNil.NIL != charE(ch, CHAR_hyphen)) {
                                                if (SubLNil.NIL != for_effect_p) {
                                                    minusp = T;
                                                    number = ZERO_INTEGER;
                                                }
                                                state = $SIGN;
                                            } else
                                                if (SubLNil.NIL != charE(ch, CHAR_plus)) {
                                                    if (SubLNil.NIL != for_effect_p) {
                                                        minusp = SubLNil.NIL;
                                                        number = ZERO_INTEGER;
                                                    }
                                                    state = $SIGN;
                                                } else
                                                    if (SubLNil.NIL != digit_char_p(ch, TEN_INTEGER)) {
                                                        if (SubLNil.NIL != for_effect_p) {
                                                            minusp = SubLNil.NIL;
                                                            number = digit_char_p(ch, TEN_INTEGER);
                                                        }
                                                        state = $NUMBER;
                                                    } else {
                                                        if (SubLNil.NIL != format_directive_p(ch))
                                                            return values(ch, tilde_idx, add(i, ONE_INTEGER), at_sign_p, colonp, nreverse(parameters), args);

                                                        bad_format_directive(string, i);
                                                    }








                } else
                    if (pcase_var.eql($QUOTE)) {
                        if (SubLNil.NIL != for_effect_p)
                            parameters = cons(ch, parameters);

                        state = $PARAM;
                    } else
                        if (pcase_var.eql($PARAM)) {
                            if (SubLNil.NIL != charE(ch, CHAR_comma))
                                state = $TILDE;
                            else
                                if (SubLNil.NIL != charE(ch, CHAR_colon)) {
                                    colonp = T;
                                    state = $COLON;
                                } else
                                    if (SubLNil.NIL != charE(ch, CHAR_at)) {
                                        at_sign_p = T;
                                        state = $AT_SIGN;
                                    } else {
                                        if (SubLNil.NIL != format_directive_p(ch))
                                            return values(ch, tilde_idx, add(i, ONE_INTEGER), at_sign_p, colonp, nreverse(parameters), args);

                                        Errors.error($str137$Bad__S_parameter_, FORMAT);
                                    }


                        } else
                            if (pcase_var.eql($SIGN)) {
                                if (SubLNil.NIL != digit_char_p(ch, TEN_INTEGER)) {
                                    if (SubLNil.NIL != for_effect_p)
                                        number = add(multiply(number, TEN_INTEGER), digit_char_p(ch, TEN_INTEGER));

                                    state = $NUMBER;
                                } else
                                    Errors.error($str137$Bad__S_parameter_, FORMAT);

                            } else
                                if (pcase_var.eql($COLON)) {
                                    if (SubLNil.NIL != charE(ch, CHAR_at)) {
                                        at_sign_p = T;
                                        state = $COLON_AT;
                                    } else {
                                        if (SubLNil.NIL != format_directive_p(ch))
                                            return values(ch, tilde_idx, add(i, ONE_INTEGER), at_sign_p, colonp, nreverse(parameters), args);

                                        bad_format_directive(string, i);
                                    }
                                } else
                                    if (pcase_var.eql($AT_SIGN)) {
                                        if (SubLNil.NIL != charE(ch, CHAR_colon)) {
                                            colonp = T;
                                            state = $COLON_AT;
                                        } else {
                                            if (SubLNil.NIL != format_directive_p(ch))
                                                return values(ch, tilde_idx, add(i, ONE_INTEGER), at_sign_p, colonp, nreverse(parameters), args);

                                            bad_format_directive(string, i);
                                        }
                                    } else
                                        if (pcase_var.eql($COLON_AT)) {
                                            if (SubLNil.NIL != format_directive_p(ch))
                                                return values(ch, tilde_idx, add(i, ONE_INTEGER), at_sign_p, colonp, nreverse(parameters), args);

                                            bad_format_directive(string, i);
                                        } else
                                            if (pcase_var.eql($NUMBER))
                                                if (SubLNil.NIL != digit_char_p(ch, TEN_INTEGER)) {
                                                    if (SubLNil.NIL != for_effect_p)
                                                        number = add(multiply(number, TEN_INTEGER), digit_char_p(ch, TEN_INTEGER));

                                                } else
                                                    if (SubLNil.NIL != charE(ch, CHAR_comma)) {
                                                        if (SubLNil.NIL != for_effect_p) {
                                                            if (SubLNil.NIL != minusp)
                                                                number = minus(number);

                                                            parameters = cons(number, parameters);
                                                        }
                                                        state = $TILDE;
                                                    } else
                                                        if (SubLNil.NIL != charE(ch, CHAR_colon)) {
                                                            colonp = T;
                                                            if (SubLNil.NIL != for_effect_p) {
                                                                if (SubLNil.NIL != minusp)
                                                                    number = minus(number);

                                                                parameters = cons(number, parameters);
                                                            }
                                                            state = $COLON;
                                                        } else
                                                            if (SubLNil.NIL != charE(ch, CHAR_at)) {
                                                                at_sign_p = T;
                                                                if (SubLNil.NIL != for_effect_p) {
                                                                    if (SubLNil.NIL != minusp)
                                                                        number = minus(number);

                                                                    parameters = cons(number, parameters);
                                                                }
                                                                state = $AT_SIGN;
                                                            } else {
                                                                if (SubLNil.NIL != format_directive_p(ch)) {
                                                                    if (SubLNil.NIL != for_effect_p) {
                                                                        if (SubLNil.NIL != minusp)
                                                                            number = minus(number);

                                                                        parameters = cons(number, parameters);
                                                                    }
                                                                    return values(ch, tilde_idx, add(i, ONE_INTEGER), at_sign_p, colonp, nreverse(parameters), args);
                                                                }
                                                                bad_format_directive(string, i);
                                                            }












        }
        if (state != $NORMAL)
            Errors.error($str139$Unterminated__S_control_, FORMAT);

        return values(SubLNil.NIL, SubLNil.NIL, i, SubLNil.NIL, SubLNil.NIL, SubLNil.NIL, args);
    }

    public static SubLObject really_format(SubLObject destination, SubLObject format_control, SubLObject args) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stream = SubLNil.NIL;
        if (destination.isStream())
            stream = destination;
        else
            if (SubLNil.NIL == destination)
                stream = make_private_string_output_stream();
            else
                if (destination == T)
                    stream = StreamsLow.$standard_output$.getDynamicValue(thread);
                else
                    if (destination.isString())
                        Errors.error($str125$_S_does_not_support_string_destin, FORMAT);
                    else
                        Errors.error($str126$_S_is_not_a_valid__S_destination_, destination, FORMAT);




        SubLObject dummy = SubLNil.NIL;
        try {
            thread.throwStack.push(UP_AND_OUT);
            try {
                thread.throwStack.push(UP_AND_ALL_THE_WAY_OUT);
                if (format_control.isString())
                    format_internal(stream, format_control, ZERO_INTEGER, length(format_control), args, args);
                else
                    if (format_control.isFunction())
                        apply(format_control, stream, args);
                    else
                        not_a_format_control(format_control);


            } catch (Throwable ccatch_env_var) {
                dummy = Errors.handleThrowable(ccatch_env_var, UP_AND_ALL_THE_WAY_OUT);
            } finally {
                thread.throwStack.pop();
            }
        } catch (Throwable ccatch_env_var) {
            dummy = Errors.handleThrowable(ccatch_env_var, UP_AND_OUT);
        } finally {
            thread.throwStack.pop();
        }
        if (SubLNil.NIL != destination)
            return SubLNil.NIL;

        return get_output_stream_string(stream);
    }

    public static SubLObject repitition_designator_value(SubLObject count) {
        if (SubLNil.NIL == count)
            return ONE_INTEGER;

        if (count.isInteger() && (!count.isNegative()))
            return count;

        Errors.error($str44$_S_is_not_a_valid__S_repitition_s, count, FORMAT);
        return SubLNil.NIL;
    }

    public static SubLObject round_decimal_digits(SubLObject left, SubLObject right, SubLObject places) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (SubLNil.NIL == places)
            places = ZERO_INTEGER;

        SubLObject rounded_left = SubLNil.NIL;
        thread.resetMultipleValues();
        SubLObject rounded_right = round_digits(right, places);
        SubLObject carry = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (SubLNil.NIL != carry)
            rounded_left = digits_add_1(left);
        else
            rounded_left = left;

        return values(rounded_left, rounded_right);
    }

    public static SubLObject round_digits(SubLObject digits, SubLObject places) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (places.isZero())
            return values(SubLNil.NIL, makeBoolean((SubLNil.NIL != digits) && digits.first().numGE(FIVE_INTEGER)));

        thread.resetMultipleValues();
        SubLObject new_digits = round_digits(digits.rest(), subtract(places, ONE_INTEGER));
        SubLObject carry = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject digit = digits.first();
        if (SubLNil.NIL == digits)
            digit = ZERO_INTEGER;

        if (SubLNil.NIL == carry)
            return values(cons(digit, new_digits), SubLNil.NIL);

        if (digit.numE(NINE_INTEGER))
            return values(cons(ZERO_INTEGER, new_digits), T);

        return values(cons(add(digit, ONE_INTEGER), new_digits), SubLNil.NIL);
    }

    public static SubLObject setup_format_file() {
        sethash(CHAR_c, $format_directives$.getDynamicValue(), symbol_function(FORMAT_C_DIRECTIVE));
        sethash(CHAR_C, $format_directives$.getDynamicValue(), symbol_function(FORMAT_C_DIRECTIVE));
        sethash(CHAR_percent, $format_directives$.getDynamicValue(), symbol_function(FORMAT_PERCENT_DIRECTIVE));
        sethash(CHAR_percent, $format_directives$.getDynamicValue(), symbol_function(FORMAT_PERCENT_DIRECTIVE));
        sethash(CHAR_ampersand, $format_directives$.getDynamicValue(), symbol_function(FORMAT_AMPERSAND_DIRECTIVE));
        sethash(CHAR_ampersand, $format_directives$.getDynamicValue(), symbol_function(FORMAT_AMPERSAND_DIRECTIVE));
        sethash(CHAR_vertical, $format_directives$.getDynamicValue(), symbol_function(FORMAT_VERTICAL_BAR_DIRECTIVE));
        sethash(CHAR_vertical, $format_directives$.getDynamicValue(), symbol_function(FORMAT_VERTICAL_BAR_DIRECTIVE));
        sethash(CHAR_tilde, $format_directives$.getDynamicValue(), symbol_function(FORMAT_TILDE_DIRECTIVE));
        sethash(CHAR_tilde, $format_directives$.getDynamicValue(), symbol_function(FORMAT_TILDE_DIRECTIVE));
        sethash(CHAR_r, $format_directives$.getDynamicValue(), symbol_function(FORMAT_R_DIRECTIVE));
        sethash(CHAR_R, $format_directives$.getDynamicValue(), symbol_function(FORMAT_R_DIRECTIVE));
        sethash(CHAR_d, $format_directives$.getDynamicValue(), symbol_function(FORMAT_D_DIRECTIVE));
        sethash(CHAR_D, $format_directives$.getDynamicValue(), symbol_function(FORMAT_D_DIRECTIVE));
        sethash(CHAR_b, $format_directives$.getDynamicValue(), symbol_function(FORMAT_B_DIRECTIVE));
        sethash(CHAR_B, $format_directives$.getDynamicValue(), symbol_function(FORMAT_B_DIRECTIVE));
        sethash(CHAR_o, $format_directives$.getDynamicValue(), symbol_function(FORMAT_O_DIRECTIVE));
        sethash(CHAR_O, $format_directives$.getDynamicValue(), symbol_function(FORMAT_O_DIRECTIVE));
        sethash(CHAR_x, $format_directives$.getDynamicValue(), symbol_function(FORMAT_X_DIRECTIVE));
        sethash(CHAR_X, $format_directives$.getDynamicValue(), symbol_function(FORMAT_X_DIRECTIVE));
        sethash(CHAR_f, $format_directives$.getDynamicValue(), symbol_function(FORMAT_F_DIRECTIVE));
        sethash(CHAR_F, $format_directives$.getDynamicValue(), symbol_function(FORMAT_F_DIRECTIVE));
        sethash(CHAR_e, $format_directives$.getDynamicValue(), symbol_function(FORMAT_E_DIRECTIVE));
        sethash(CHAR_E, $format_directives$.getDynamicValue(), symbol_function(FORMAT_E_DIRECTIVE));
        sethash(CHAR_g, $format_directives$.getDynamicValue(), symbol_function(FORMAT_G_DIRECTIVE));
        sethash(CHAR_G, $format_directives$.getDynamicValue(), symbol_function(FORMAT_G_DIRECTIVE));
        sethash(CHAR_dollar, $format_directives$.getDynamicValue(), symbol_function(FORMAT_DOLLARSIGN_DIRECTIVE));
        sethash(CHAR_dollar, $format_directives$.getDynamicValue(), symbol_function(FORMAT_DOLLARSIGN_DIRECTIVE));
        sethash(CHAR_a, $format_directives$.getDynamicValue(), symbol_function(FORMAT_A_DIRECTIVE));
        sethash(CHAR_A, $format_directives$.getDynamicValue(), symbol_function(FORMAT_A_DIRECTIVE));
        sethash(CHAR_s, $format_directives$.getDynamicValue(), symbol_function(FORMAT_S_DIRECTIVE));
        sethash(CHAR_S, $format_directives$.getDynamicValue(), symbol_function(FORMAT_S_DIRECTIVE));
        sethash(CHAR_w, $format_directives$.getDynamicValue(), symbol_function(FORMAT_W_DIRECTIVE));
        sethash(CHAR_W, $format_directives$.getDynamicValue(), symbol_function(FORMAT_W_DIRECTIVE));
        sethash(CHAR_underbar, $format_directives$.getDynamicValue(), symbol_function(FORMAT_UNDERSCORE_DIRECTIVE));
        sethash(CHAR_underbar, $format_directives$.getDynamicValue(), symbol_function(FORMAT_UNDERSCORE_DIRECTIVE));
        sethash(CHAR_i, $format_directives$.getDynamicValue(), symbol_function(FORMAT_I_DIRECTIVE));
        sethash(CHAR_I, $format_directives$.getDynamicValue(), symbol_function(FORMAT_I_DIRECTIVE));
        sethash(CHAR_slash, $format_directives$.getDynamicValue(), symbol_function(FORMAT_SLASH_DIRECTIVE));
        sethash(CHAR_slash, $format_directives$.getDynamicValue(), symbol_function(FORMAT_SLASH_DIRECTIVE));
        sethash(CHAR_t, $format_directives$.getDynamicValue(), symbol_function(FORMAT_T_DIRECTIVE));
        sethash(CHAR_T, $format_directives$.getDynamicValue(), symbol_function(FORMAT_T_DIRECTIVE));
        sethash(CHAR_less, $format_directives$.getDynamicValue(), symbol_function(FORMAT_LESS_THAN_DIRECTIVE));
        sethash(CHAR_less, $matching_brackets$.getDynamicValue(), CHAR_greater);
        sethash(CHAR_greater, $format_directives$.getDynamicValue(), symbol_function(FORMAT_GREATER_THAN_DIRECTIVE));
        sethash(CHAR_greater, $format_directives$.getDynamicValue(), symbol_function(FORMAT_GREATER_THAN_DIRECTIVE));
        sethash(CHAR_asterisk, $format_directives$.getDynamicValue(), symbol_function(FORMAT_ASTERISK_DIRECTIVE));
        sethash(CHAR_asterisk, $format_directives$.getDynamicValue(), symbol_function(FORMAT_ASTERISK_DIRECTIVE));
        sethash(CHAR_lbracket, $format_directives$.getDynamicValue(), symbol_function(FORMAT_LEFT_BRACKET_DIRECTIVE));
        sethash(CHAR_lbracket, $matching_brackets$.getDynamicValue(), CHAR_rbracket);
        sethash(CHAR_rbracket, $format_directives$.getDynamicValue(), symbol_function(FORMAT_RIGHT_BRACKET_DIRECTIVE));
        sethash(CHAR_rbracket, $format_directives$.getDynamicValue(), symbol_function(FORMAT_RIGHT_BRACKET_DIRECTIVE));
        sethash(CHAR_lbrace, $format_directives$.getDynamicValue(), symbol_function(FORMAT_LEFT_BRACE_DIRECTIVE));
        sethash(CHAR_lbrace, $matching_brackets$.getDynamicValue(), CHAR_rbrace);
        sethash(CHAR_rbrace, $format_directives$.getDynamicValue(), symbol_function(FORMAT_RIGHT_BRACE_DIRECTIVE));
        sethash(CHAR_rbrace, $format_directives$.getDynamicValue(), symbol_function(FORMAT_RIGHT_BRACE_DIRECTIVE));
        sethash(CHAR_question, $format_directives$.getDynamicValue(), symbol_function(FORMAT_QUESTION_MARK_DIRECTIVE));
        sethash(CHAR_question, $format_directives$.getDynamicValue(), symbol_function(FORMAT_QUESTION_MARK_DIRECTIVE));
        sethash(CHAR_lparen, $format_directives$.getDynamicValue(), symbol_function(FORMAT_LEFT_PAREN_DIRECTIVE));
        sethash(CHAR_lparen, $matching_brackets$.getDynamicValue(), CHAR_rparen);
        sethash(CHAR_rparen, $format_directives$.getDynamicValue(), symbol_function(FORMAT_RIGHT_PAREN_DIRECTIVE));
        sethash(CHAR_rparen, $format_directives$.getDynamicValue(), symbol_function(FORMAT_RIGHT_PAREN_DIRECTIVE));
        sethash(CHAR_p, $format_directives$.getDynamicValue(), symbol_function(FORMAT_P_DIRECTIVE));
        sethash(CHAR_P, $format_directives$.getDynamicValue(), symbol_function(FORMAT_P_DIRECTIVE));
        sethash(CHAR_semicolon, $format_directives$.getDynamicValue(), symbol_function(FORMAT_SEMICOLON_DIRECTIVE));
        sethash(CHAR_semicolon, $format_directives$.getDynamicValue(), symbol_function(FORMAT_SEMICOLON_DIRECTIVE));
        sethash(CHAR_caret, $format_directives$.getDynamicValue(), symbol_function(FORMAT_CIRCUMFLEX_DIRECTIVE));
        sethash(CHAR_caret, $format_directives$.getDynamicValue(), symbol_function(FORMAT_CIRCUMFLEX_DIRECTIVE));
        sethash(CHAR_newline, $format_directives$.getDynamicValue(), symbol_function(FORMAT_NEWLINE_DIRECTIVE));
        sethash(CHAR_newline, $format_directives$.getDynamicValue(), symbol_function(FORMAT_NEWLINE_DIRECTIVE));
        return SubLNil.NIL;
    }

    public static SubLObject split_flonum_digits(SubLObject flonum, SubLObject scale) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject digits = math_utilities.flonum_digit_list(flonum);
        SubLObject real_scale = thread.secondMultipleValue();
        thread.resetMultipleValues();
        scale = add(scale, real_scale);
        SubLObject left = SubLNil.NIL;
        SubLObject right = SubLNil.NIL;
        if (scale.isPositive()) {
            SubLObject i;
            SubLObject digit;
            for (i = SubLNil.NIL, i = ZERO_INTEGER; i.numL(scale); i = add(i, ONE_INTEGER)) {
                digit = digits.first();
                if (SubLNil.NIL != digit) {
                    left = cons(digit, left);
                    digits = digits.rest();
                } else
                    left = cons(ZERO_INTEGER, left);

            }
            left = nreverse(left);
            right = digits;
        } else {
            SubLObject cdotimes_end_var;
            SubLObject j;
            for (cdotimes_end_var = minus(scale), j = SubLNil.NIL, j = ZERO_INTEGER; j.numL(cdotimes_end_var); j = add(j, ONE_INTEGER))
                right = cons(ZERO_INTEGER, right);

            right = nconc(right, digits);
        }
        return values(left, right);
    }

    public static SubLObject unimplemented_format_directive(SubLObject directive, SubLObject fullyp) {
        if (fullyp == UNPROVIDED)
            fullyp = SubLNil.NIL;

        Errors.error($str12$The__A_format_directive_is_not_ye, directive, fullyp);
        return SubLNil.NIL;
    }

    public static SubLObject with_format_parameters(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        SubLObject pattern = SubLNil.NIL;
        SubLObject parameters = SubLNil.NIL;
        destructuring_bind_must_consp(current, datum, $list22);
        pattern = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list22);
        parameters = current.first();
        SubLObject body;
        current = body = current.rest();
        SubLObject vars = SubLNil.NIL;
        SubLObject code = SubLNil.NIL;
        SubLObject tail = make_symbol($$$TAIL);
        SubLObject cdolist_list_var = pattern;
        SubLObject item = SubLNil.NIL;
        item = cdolist_list_var.first();
        while (SubLNil.NIL != cdolist_list_var) {
            SubLObject current_$2;
            SubLObject datum_$1 = current_$2 = item;
            SubLObject var = SubLNil.NIL;
            SubLObject init = SubLNil.NIL;
            SubLObject type = SubLNil.NIL;
            destructuring_bind_must_consp(current_$2, datum_$1, $list24);
            var = current_$2.first();
            current_$2 = current_$2.rest();
            destructuring_bind_must_consp(current_$2, datum_$1, $list24);
            init = current_$2.first();
            current_$2 = current_$2.rest();
            destructuring_bind_must_consp(current_$2, datum_$1, $list24);
            type = current_$2.first();
            current_$2 = current_$2.rest();
            if (SubLNil.NIL == current_$2) {
                vars = cons(var, vars);
                code = cons(list(PROGN, list(CSETF, var, list(CAR, tail)), list(CPOP, tail), list(PUNLESS, var, list(CSETF, var, init)), list(PUNLESS, list(FORMAT_TYPEP, var, list(QUOTE, type)), list(ERROR, $str32$The__S_parameter__S_is_not_of_typ, $list33, var, list(QUOTE, type)))), code);
            } else
                cdestructuring_bind_error(datum_$1, $list24);

            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        return listS(CLET, bq_cons(list(tail, parameters), append(vars, SubLNil.NIL)), append(nreverse(code), bq_cons(listS(PWHEN, tail, $list36), append(body, SubLNil.NIL))));
    }

    public static final SubLFile me = new format();

    public static final String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.format";





    // defvar
    private static final SubLSymbol $remaining_args$ = makeSymbol("*REMAINING-ARGS*");

    private static final SubLInteger $int$50 = makeInteger(50);

    public static final SubLList $list1 = list(makeSymbol("NAME"), makeSymbol("CHARACTER"), makeSymbol("LAMBDA-LIST"), makeSymbol("&BODY"), makeSymbol("BODY"));













    public static final SubLSymbol $format_directives$ = makeSymbol("*FORMAT-DIRECTIVES*");



    public static final SubLList $list10 = list(makeSymbol("NAME"), makeSymbol("LEFT"), makeSymbol("RIGHT"), makeSymbol("LAMBDA-LIST"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $matching_brackets$ = makeSymbol("*MATCHING-BRACKETS*");

    public static final SubLString $str12$The__A_format_directive_is_not_ye = makeString("The ~A format directive is not yet ~@[fully ~]implemented.");

    public static final SubLString $str13$The____C_format_directive_does_no = makeString("The ~~~C format directive does not take an at-sign modifier.");

    public static final SubLString $str14$The____C_format_directive_does_no = makeString("The ~~~C format directive does not take an colon modifier.");

    public static final SubLString $str15$The____C_format_directive_does_no = makeString("The ~~~C format directive does not take both an at-sign and colon modifier.");





    public static final SubLList $list18 = list(makeSymbol("&OPTIONAL"), makeSymbol("START"), makeSymbol("END"));

    public static final SubLString $str19$Unrecognized_type_specifier__S_ = makeString("Unrecognized type specifier ~S.");

    public static final SubLSymbol CHARACTER = makeSymbol("CHARACTER");



    public static final SubLList $list22 = list(makeSymbol("PATTERN"), makeSymbol("PARAMETERS"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLString $$$TAIL = makeString("TAIL");

    public static final SubLList $list24 = list(makeSymbol("VAR"), makeSymbol("INIT"), makeSymbol("TYPE"));









    public static final SubLSymbol FORMAT_TYPEP = makeSymbol("FORMAT-TYPEP");





    public static final SubLString $str32$The__S_parameter__S_is_not_of_typ = makeString("The ~S parameter ~S is not of type ~S.");

    public static final SubLList $list33 = list(makeSymbol("QUOTE"), makeSymbol("FORMAT"));





    public static final SubLList $list36 = list(list(makeSymbol("ERROR"), makeString("Too many ~S parameters."), list(makeSymbol("QUOTE"), makeSymbol("FORMAT"))));

    public static final SubLString $str37$Stray____C_directive_in__S_string = makeString("Stray ~~~C directive in ~S string ~S.");



    public static final SubLString $str39$_S_is_not_a_recognized__S_control = makeString("~S is not a recognized ~S control.");

    public static final SubLString $str40$_S_directive__S_ran_out_of_argume = makeString("~S directive ~S ran out of arguments.");

    public static final SubLString $str41$No_matching__S_found_for__S_in__S = makeString("No matching ~S found for ~S in ~S.");

    public static final SubLString $str42$The__S__S_directive_takes_a_list_ = makeString("The ~S ~S directive takes a list as an argument.");

    public static final SubLString $str43$_S_is_not_a_valid__S_control_ = makeString("~S is not a valid ~S control.");

    public static final SubLString $str44$_S_is_not_a_valid__S_repitition_s = makeString("~S is not a valid ~S repitition specifier.");

    public static final SubLString $str45$Too_many__S_parameters_ = makeString("Too many ~S parameters.");



    public static final SubLString $str47$__ = makeString("#\\");

    public static final SubLSymbol FORMAT_C_DIRECTIVE = makeSymbol("FORMAT-C-DIRECTIVE");

    public static final SubLList $list49 = list(makeSymbol("OR"), makeSymbol("NULL"), list(makeSymbol("INTEGER"), ZERO_INTEGER));

    public static final SubLSymbol FORMAT_PERCENT_DIRECTIVE = makeSymbol("FORMAT-PERCENT-DIRECTIVE");

    public static final SubLSymbol FORMAT_AMPERSAND_DIRECTIVE = makeSymbol("FORMAT-AMPERSAND-DIRECTIVE");

    public static final SubLSymbol FORMAT_VERTICAL_BAR_DIRECTIVE = makeSymbol("FORMAT-VERTICAL-BAR-DIRECTIVE");

    public static final SubLSymbol FORMAT_TILDE_DIRECTIVE = makeSymbol("FORMAT-TILDE-DIRECTIVE");

    public static final SubLList $list54 = list(makeSymbol("INTEGER"), ZERO_INTEGER);

    public static final SubLList $list55 = list(makeSymbol("INTEGER"), ONE_INTEGER);

    public static final SubLString $str56$_ = makeString("-");

    public static final SubLString $str57$_ = makeString("+");



    public static final SubLObject $ic59 = vector(new SubLObject[]{ makeString(""), makeString(" thousand"), makeString(" million"), makeString(" billion"), makeString(" trillion"), makeString(" quadrillion"), makeString(" quintillion"), makeString(" sextillion"), makeString(" septillion"), makeString(" octillion"), makeString(" nonillion"), makeString(" decillion"), makeString(" undecillion"), makeString(" duodecillion"), makeString(" tredecillion"), makeString(" quattuordecillion"), makeString(" quindecillion"), makeString(" sexdecillion"), makeString(" septendecillion"), makeString(" octodecillion"), makeString(" novemdecillion"), makeString(" vigintillion") });

    public static final SubLString $$$_times_ten_to_the_ = makeString(" times ten to the ");

    public static final SubLString $$$_power = makeString(" power");

    public static final SubLString $$$_plus = makeString(" plus");





    public static final SubLObject $ic65 = vector(new SubLObject[]{ SubLNil.NIL, makeString("one"), makeString("two"), makeString("three"), makeString("four"), makeString("five"), makeString("six"), makeString("seven"), makeString("eight"), makeString("nine") });

    public static final SubLString $$$_hundred = makeString(" hundred");

    public static final SubLObject $ic67 = vector(new SubLObject[]{ makeString("ten"), makeString("eleven"), makeString("twelve"), makeString("thirteen"), makeString("fourteen"), makeString("fifteen"), makeString("sixteen"), makeString("seventeen"), makeString("eighteen"), makeString("nineteen") });

    public static final SubLObject $ic68 = vector(new SubLObject[]{ SubLNil.NIL, SubLNil.NIL, makeString("twenty"), makeString("thirty"), makeString("forty"), makeString("fifty"), makeString("sixty"), makeString("seventy"), makeString("eighty"), makeString("ninety") });

    public static final SubLObject $ic69 = vector(new SubLObject[]{ SubLNil.NIL, makeString("one"), makeString("two"), makeString("three"), makeString("four"), makeString("five"), makeString("six"), makeString("seven"), makeString("eight"), makeString("nine") });

    public static final SubLString $$$zero = makeString("zero");

    public static final SubLString $$$minus_ = makeString("minus ");

    public static final SubLString $$$zeroth = makeString("zeroth");

    public static final SubLObject $ic73 = vector(new SubLObject[]{ SubLNil.NIL, makeString("tenth"), makeString("twentieth"), makeString("thirtieth"), makeString("fortieth"), makeString("fiftieth"), makeString("sixtieth"), makeString("seventieth"), makeString("eightieth"), makeString("ninetieth") });

    public static final SubLObject $ic74 = vector(new SubLObject[]{ SubLNil.NIL, makeString("eleventh"), makeString("twelfth"), makeString("thirteenth"), makeString("fourteenth"), makeString("fifteenth"), makeString("sixteenth"), makeString("seventeenth"), makeString("eighteenth"), makeString("nineteenth") });

    public static final SubLObject $ic75 = vector(new SubLObject[]{ SubLNil.NIL, makeString("first"), makeString("second"), makeString("third"), makeString("fourth"), makeString("fifth"), makeString("sixth"), makeString("seventh"), makeString("eighth"), makeString("ninth") });

    public static final SubLString $$$th = makeString("th");

    private static final SubLInteger $int$36 = makeInteger(36);

    public static final SubLString $str78$_S_is_not_a_valid_radix_ = makeString("~S is not a valid radix.");

    public static final SubLList $list79 = list(CHAR_M, CHAR_D, CHAR_C, CHAR_L, CHAR_X, CHAR_V, CHAR_I);

    public static final SubLList $list80 = list(makeInteger(1000), makeInteger(500), makeInteger(100), makeInteger(50), TEN_INTEGER, FIVE_INTEGER, ONE_INTEGER);

    public static final SubLList $list81 = list(makeInteger(900), makeInteger(400), makeInteger(90), makeInteger(40), NINE_INTEGER, FOUR_INTEGER);

    public static final SubLList $list82 = list(CHAR_C, CHAR_C, CHAR_X, CHAR_X, CHAR_I, CHAR_I);

    public static final SubLSymbol FORMAT_R_DIRECTIVE = makeSymbol("FORMAT-R-DIRECTIVE");

    public static final SubLSymbol FORMAT_D_DIRECTIVE = makeSymbol("FORMAT-D-DIRECTIVE");

    public static final SubLSymbol FORMAT_B_DIRECTIVE = makeSymbol("FORMAT-B-DIRECTIVE");

    public static final SubLSymbol FORMAT_O_DIRECTIVE = makeSymbol("FORMAT-O-DIRECTIVE");

    public static final SubLSymbol FORMAT_X_DIRECTIVE = makeSymbol("FORMAT-X-DIRECTIVE");

    public static final SubLList $list88 = list(makeSymbol("OR"), makeSymbol("NULL"), makeSymbol("CHARACTER"));

    public static final SubLSymbol FORMAT_F_DIRECTIVE = makeSymbol("FORMAT-F-DIRECTIVE");

    public static final SubLSymbol FORMAT_E_DIRECTIVE = makeSymbol("FORMAT-E-DIRECTIVE");

    public static final SubLSymbol FORMAT_G_DIRECTIVE = makeSymbol("FORMAT-G-DIRECTIVE");

    public static final SubLSymbol FORMAT_DOLLARSIGN_DIRECTIVE = makeSymbol("FORMAT-DOLLARSIGN-DIRECTIVE");

    public static final SubLString $str93$__ = makeString("()");

    public static final SubLSymbol FORMAT_PADDED = makeSymbol("FORMAT-PADDED");

    public static final SubLSymbol FORMAT_A_DIRECTIVE = makeSymbol("FORMAT-A-DIRECTIVE");

    public static final SubLSymbol FORMAT_S_DIRECTIVE = makeSymbol("FORMAT-S-DIRECTIVE");



    public static final SubLSymbol FORMAT_W_DIRECTIVE = makeSymbol("FORMAT-W-DIRECTIVE");

    public static final SubLSymbol FORMAT_UNDERSCORE_DIRECTIVE = makeSymbol("FORMAT-UNDERSCORE-DIRECTIVE");

    public static final SubLSymbol FORMAT_I_DIRECTIVE = makeSymbol("FORMAT-I-DIRECTIVE");

    public static final SubLSymbol $sym101$CHAR_ = makeSymbol("CHAR=");

    public static final SubLSymbol FORMAT_SLASH_DIRECTIVE = makeSymbol("FORMAT-SLASH-DIRECTIVE");

    public static final SubLSymbol FORMAT_T_DIRECTIVE = makeSymbol("FORMAT-T-DIRECTIVE");

    public static final SubLSymbol FORMAT_LESS_THAN_DIRECTIVE = makeSymbol("FORMAT-LESS-THAN-DIRECTIVE");

    public static final SubLSymbol FORMAT_GREATER_THAN_DIRECTIVE = makeSymbol("FORMAT-GREATER-THAN-DIRECTIVE");

    public static final SubLSymbol FORMAT_ASTERISK_DIRECTIVE = makeSymbol("FORMAT-ASTERISK-DIRECTIVE");

    public static final SubLString $str107$No_clause_marker_found_for__S__S_ = makeString("No clause marker found for ~S ~S directive.");

    public static final SubLList $list108 = list(makeSymbol("OR"), makeSymbol("NULL"), makeSymbol("INTEGER"));

    public static final SubLSymbol FORMAT_LEFT_BRACKET_DIRECTIVE = makeSymbol("FORMAT-LEFT-BRACKET-DIRECTIVE");

    public static final SubLSymbol FORMAT_RIGHT_BRACKET_DIRECTIVE = makeSymbol("FORMAT-RIGHT-BRACKET-DIRECTIVE");

    public static final SubLSymbol UP_AND_ALL_THE_WAY_OUT = makeSymbol("UP-AND-ALL-THE-WAY-OUT");

    public static final SubLSymbol UP_AND_OUT = makeSymbol("UP-AND-OUT");

    public static final SubLSymbol FORMAT_LEFT_BRACE_DIRECTIVE = makeSymbol("FORMAT-LEFT-BRACE-DIRECTIVE");

    public static final SubLSymbol FORMAT_RIGHT_BRACE_DIRECTIVE = makeSymbol("FORMAT-RIGHT-BRACE-DIRECTIVE");





    public static final SubLSymbol FORMAT_QUESTION_MARK_DIRECTIVE = makeSymbol("FORMAT-QUESTION-MARK-DIRECTIVE");

    public static final SubLSymbol FORMAT_LEFT_PAREN_DIRECTIVE = makeSymbol("FORMAT-LEFT-PAREN-DIRECTIVE");

    public static final SubLSymbol FORMAT_RIGHT_PAREN_DIRECTIVE = makeSymbol("FORMAT-RIGHT-PAREN-DIRECTIVE");

    public static final SubLString $$$ies = makeString("ies");

    public static final SubLSymbol FORMAT_P_DIRECTIVE = makeSymbol("FORMAT-P-DIRECTIVE");

    public static final SubLSymbol FORMAT_SEMICOLON_DIRECTIVE = makeSymbol("FORMAT-SEMICOLON-DIRECTIVE");

    public static final SubLSymbol FORMAT_CIRCUMFLEX_DIRECTIVE = makeSymbol("FORMAT-CIRCUMFLEX-DIRECTIVE");

    public static final SubLSymbol FORMAT_NEWLINE_DIRECTIVE = makeSymbol("FORMAT-NEWLINE-DIRECTIVE");

    public static final SubLString $str125$_S_does_not_support_string_destin = makeString("~S does not support string destinations.");

    public static final SubLString $str126$_S_is_not_a_valid__S_destination_ = makeString("~S is not a valid ~S destination.");

    public static final SubLString $str127$No_matching__A_found_for__A_in__S = makeString("No matching ~A found for ~A in ~S.");



    public static final SubLSymbol $TILDE = makeKeyword("TILDE");



    public static final SubLString $str131$_S_parameter__S_is_not_a_characte = makeString("~S parameter ~S is not a character, integer, or NIL.");



    public static final SubLSymbol $COLON = makeKeyword("COLON");

    public static final SubLSymbol $AT_SIGN = makeKeyword("AT-SIGN");





    public static final SubLString $str137$Bad__S_parameter_ = makeString("Bad ~S parameter.");

    public static final SubLSymbol $COLON_AT = makeKeyword("COLON-AT");

    public static final SubLString $str139$Unterminated__S_control_ = makeString("Unterminated ~S control.");

    static {
















































































































































    }

    @Override
    public void declareFunctions() {
        declare_format_file();
    }

    @Override
    public void initializeVariables() {
        init_format_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_format_file();
    }
}

