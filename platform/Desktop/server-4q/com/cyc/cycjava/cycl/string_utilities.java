package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;
 
public final class string_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.string_utilities";
    public static final String myFingerPrint = "7e85581c2389ffbaf9174f970096aaab4cbeb022873a5c95e9bac95d844e34f2";
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 399L)
    public static SubLSymbol $point_char$;
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 442L)
    public static SubLSymbol $space_char$;
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 487L)
    public static SubLSymbol $tab_char$;
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 528L)
    public static SubLSymbol $empty_string$;
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 570L)
    public static SubLSymbol $new_line_string$;
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 638L)
    public static SubLSymbol $test_char$;
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 2649L)
    private static SubLSymbol $object_to_string_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 36665L)
    public static SubLSymbol $char_set$;
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 75906L)
    private static SubLSymbol $64_bit_encoding_table$;
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 77356L)
    private static SubLSymbol $64_bit_integer_index$;
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 77597L)
    private static SubLSymbol $64_bit_char_index$;
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 82975L)
    private static SubLSymbol $raw_whitespace_chars$;
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 83223L)
    private static SubLSymbol $whitespace_chars$;
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 83557L)
    private static SubLSymbol $grammatical_punctuation_chars$;
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 103779L)
    public static SubLSymbol $target_characters$;
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 120653L)
    private static SubLSymbol $trigraph_metric$;
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 120883L)
    private static SubLSymbol $trigraph_tables$;
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 126536L)
    private static SubLSymbol $cyclify_string_expand_subl_fn_strings$;
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 126731L)
    private static SubLSymbol $cyclify_string_subl_quote_fn_strings$;
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 126820L)
    private static SubLSymbol $cyclify_string_quote_chars$;
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 126873L)
    public static SubLSymbol $dtp_cyclify_status$;
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 142401L)
    public static SubLSymbol $string_read_buffer_size$;
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 142527L)
    public static SubLSymbol $string_read_buffer$;
    private static final SubLString $str0$;
    private static final SubLList $list1;
    private static final SubLList $list2;
    private static final SubLSymbol $kw3$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw4$BREAK_CHAR;
    private static final SubLSymbol $sym5$_SPACE_CHAR_;
    private static final SubLSymbol $sym6$WORD_LIST_VAR;
    private static final SubLSymbol $sym7$CLET;
    private static final SubLSymbol $sym8$_TEST_CHAR_;
    private static final SubLSymbol $sym9$BREAK_WORDS;
    private static final SubLList $list10;
    private static final SubLSymbol $sym11$CDOLIST;
    private static final SubLSymbol $sym12$STRINGP;
    private static final SubLSymbol $sym13$OBJECT_TO_STRING;
    private static final SubLSymbol $sym14$_OBJECT_TO_STRING_CACHING_STATE_;
    private static final SubLInteger $int15$1000;
    private static final SubLString $str16$_;
    private static final SubLString $str17$_;
    private static final SubLString $str18$_;
    private static final SubLString $str19$___;
    private static final SubLString $str20$_;
    private static final SubLString $str21$_;
    private static final SubLSymbol $sym22$READABLE_P;
    private static final SubLSymbol $sym23$READ_FROM_STRING_IGNORING_ERRORS;
    private static final SubLSymbol $kw24$ERROR;
    private static final SubLString $str25$_X;
    private static final SubLSymbol $sym26$FIXNUMP;
    private static final SubLString $str27$_S_is_too_short_to_remove__D_char;
    private static final SubLSymbol $sym28$NON_EMPTY_STRING_;
    private static final SubLString $str29$_S_must_be_a_single_word___cannot;
    private static final SubLSymbol $sym30$NOT_TEST_CHAR;
    private static final SubLInteger $int31$100;
    private static final SubLInteger $int32$256;
    private static final SubLSymbol $sym33$LISTP;
    private static final SubLSymbol $sym34$CHARACTERP;
    private static final SubLString $str35$Some_element_of__A_is_not_charact;
    private static final SubLSymbol $sym36$HTML_ESCAPED_STRING_P;
    private static final SubLSymbol $kw37$TEST;
    private static final SubLSymbol $kw38$OWNER;
    private static final SubLSymbol $kw39$CLASSES;
    private static final SubLSymbol $kw40$KB;
    private static final SubLSymbol $kw41$TINY;
    private static final SubLSymbol $kw42$WORKING_;
    private static final SubLList $list43;
    private static final SubLSymbol $sym44$NON_NEGATIVE_INTEGER_P;
    private static final SubLSymbol $sym45$_;
    private static final SubLSymbol $sym46$ENDS_WITH_START_OF;
    private static final SubLList $list47;
    private static final SubLString $str48$_;
    private static final SubLString $str49$__;
    private static final SubLList $list50;
    private static final SubLList $list51;
    private static final SubLList $list52;
    private static final SubLSymbol $sym53$CHAR_IN_CHAR_SET;
    private static final SubLSymbol $sym54$DIGIT_CHAR_P;
    private static final SubLSymbol $sym55$ALPHANUMERICP;
    private static final SubLSymbol $sym56$ALPHA_CHAR_P;
    private static final SubLList $list57;
    private static final SubLList $list58;
    private static final SubLSymbol $sym59$IS_NUMERIC_;
    private static final SubLSymbol $sym60$PARSE_INTEGER;
    private static final SubLString $str61$__R;
    private static final SubLList $list62;
    private static final SubLSymbol $sym63$CONTROL_CHAR_P;
    private static final SubLInteger $int64$32;
    private static final SubLInteger $int65$128;
    private static final SubLList $list66;
    private static final SubLSymbol $sym67$STRING;
    private static final SubLString $str68$_b;
    private static final SubLList $list69;
    private static final SubLString $str70$_S_is_not_a_part_of_the_reference;
    private static final SubLString $str71$Failed_to_bunge__S_according_to__;
    private static final SubLSymbol $sym72$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLSymbol $sym73$UNICODE_NAUT_P;
    private static final SubLSymbol $sym74$CCONCATENATE;
    private static final SubLList $list75;
    private static final SubLSymbol $sym76$LOWER_CASE_P;
    private static final SubLSymbol $sym77$WHITESPACEP;
    private static final SubLSymbol $sym78$UPPER_CASE_P;
    private static final SubLSymbol $sym79$PUNCTUATION_P;
    private static final SubLSymbol $sym80$EAT_CHAR_P;
    private static final SubLSymbol $sym81$INTEGERP;
    private static final SubLString $str82$0123456789ABCDEF;
    private static final SubLSymbol $sym83$HEX_CHAR_P;
    private static final SubLList $list84;
    private static final SubLString $str85$____________;
    private static final SubLString $str86$_____________;
    private static final SubLSymbol $sym87$PUNCTUATION_EXTENDED_P;
    private static final SubLList $list88;
    private static final SubLSymbol $sym89$CHAR_EQUAL;
    private static final SubLList $list90;
    private static final SubLSymbol $sym91$UNICODE_SPACE_CHAR_CODE_P;
    private static final SubLInteger $int92$8192;
    private static final SubLInteger $int93$8203;
    private static final SubLSymbol $kw94$EOF;
    private static final SubLInteger $int95$64;
    private static final SubLSymbol $kw96$NORMAL;
    private static final SubLSymbol $kw97$CR;
    private static final SubLSymbol $kw98$STRING;
    private static final SubLSymbol $kw99$SLASH;
    private static final SubLSymbol $sym100$FBOUNDP;
    private static final SubLSymbol $sym101$NON_EMPTY_STRING_P;
    private static final SubLList $list102;
    private static final SubLSymbol $sym103$VALID_CONSTANT_NAME_CHAR_P;
    private static final SubLSymbol $sym104$1_;
    private static final SubLList $list105;
    private static final SubLList $list106;
    private static final SubLList $list107;
    private static final SubLSymbol $sym108$TARGET_CHARACTER_FOUND;
    private static final SubLList $list109;
    private static final SubLList $list110;
    private static final SubLSymbol $kw111$DEFAULT;
    private static final SubLSymbol $sym112$CHAR_;
    private static final SubLString $str113$Unmatched_open_parenthesis;
    private static final SubLString $str114$Unmatched_close_parenthesis;
    private static final SubLInteger $int115$255;
    private static final SubLList $list116;
    private static final SubLFloat $float117$0_8;
    private static final SubLSymbol $kw118$FREE;
    private static final SubLInteger $int119$50;
    private static final SubLString $str120$es;
    private static final SubLString $str121$s;
    private static final SubLInteger $int122$1000000;
    private static final SubLSymbol $sym123$FORT_PRINT_NAME;
    private static final SubLSymbol $sym124$STR_BY_TYPE;
    private static final SubLString $str125$__;
    private static final SubLList $list126;
    private static final SubLList $list127;
    private static final SubLList $list128;
    private static final SubLSymbol $sym129$CYCLIFY_STATUS;
    private static final SubLSymbol $sym130$CYCLIFY_STATUS_P;
    private static final SubLList $list131;
    private static final SubLList $list132;
    private static final SubLList $list133;
    private static final SubLList $list134;
    private static final SubLSymbol $sym135$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static final SubLSymbol $sym136$CYCLIFY_STATUS_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list137;
    private static final SubLSymbol $sym138$CYCLIFY_STATUS_OUT_STRING_LIST;
    private static final SubLSymbol $sym139$_CSETF_CYCLIFY_STATUS_OUT_STRING_LIST;
    private static final SubLSymbol $sym140$CYCLIFY_STATUS_REFERENCES_ADDED;
    private static final SubLSymbol $sym141$_CSETF_CYCLIFY_STATUS_REFERENCES_ADDED;
    private static final SubLSymbol $sym142$CYCLIFY_STATUS_INSIDE_QUOTE_;
    private static final SubLSymbol $sym143$_CSETF_CYCLIFY_STATUS_INSIDE_QUOTE_;
    private static final SubLSymbol $sym144$CYCLIFY_STATUS_INSIDE_EL_VAR_NAME_;
    private static final SubLSymbol $sym145$_CSETF_CYCLIFY_STATUS_INSIDE_EL_VAR_NAME_;
    private static final SubLSymbol $sym146$CYCLIFY_STATUS_ALREADY_CYCLIFIED_;
    private static final SubLSymbol $sym147$_CSETF_CYCLIFY_STATUS_ALREADY_CYCLIFIED_;
    private static final SubLSymbol $sym148$CYCLIFY_STATUS_ESCAPE_;
    private static final SubLSymbol $sym149$_CSETF_CYCLIFY_STATUS_ESCAPE_;
    private static final SubLSymbol $sym150$CYCLIFY_STATUS_INSIDE_SUBL_QUOTE_FN_;
    private static final SubLSymbol $sym151$_CSETF_CYCLIFY_STATUS_INSIDE_SUBL_QUOTE_FN_;
    private static final SubLSymbol $sym152$CYCLIFY_STATUS_INSIDE_EXPAND_SUBL_FN_;
    private static final SubLSymbol $sym153$_CSETF_CYCLIFY_STATUS_INSIDE_EXPAND_SUBL_FN_;
    private static final SubLSymbol $sym154$CYCLIFY_STATUS_INSIDE_EXPAND_SUBL_FN_ARG1_;
    private static final SubLSymbol $sym155$_CSETF_CYCLIFY_STATUS_INSIDE_EXPAND_SUBL_FN_ARG1_;
    private static final SubLSymbol $sym156$CYCLIFY_STATUS_INSIDE_EXPAND_SUBL_FN_ARG2_;
    private static final SubLSymbol $sym157$_CSETF_CYCLIFY_STATUS_INSIDE_EXPAND_SUBL_FN_ARG2_;
    private static final SubLSymbol $sym158$CYCLIFY_STATUS_IMMEDIATELY_FOLLOWING_PAREN_;
    private static final SubLSymbol $sym159$_CSETF_CYCLIFY_STATUS_IMMEDIATELY_FOLLOWING_PAREN_;
    private static final SubLSymbol $sym160$CYCLIFY_STATUS_PAREN_COUNT;
    private static final SubLSymbol $sym161$_CSETF_CYCLIFY_STATUS_PAREN_COUNT;
    private static final SubLSymbol $kw162$OUT_STRING_LIST;
    private static final SubLSymbol $kw163$REFERENCES_ADDED;
    private static final SubLSymbol $kw164$INSIDE_QUOTE_;
    private static final SubLSymbol $kw165$INSIDE_EL_VAR_NAME_;
    private static final SubLSymbol $kw166$ALREADY_CYCLIFIED_;
    private static final SubLSymbol $kw167$ESCAPE_;
    private static final SubLSymbol $kw168$INSIDE_SUBL_QUOTE_FN_;
    private static final SubLSymbol $kw169$INSIDE_EXPAND_SUBL_FN_;
    private static final SubLSymbol $kw170$INSIDE_EXPAND_SUBL_FN_ARG1_;
    private static final SubLSymbol $kw171$INSIDE_EXPAND_SUBL_FN_ARG2_;
    private static final SubLSymbol $kw172$IMMEDIATELY_FOLLOWING_PAREN_;
    private static final SubLSymbol $kw173$PAREN_COUNT;
    private static final SubLString $str174$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw175$BEGIN;
    private static final SubLSymbol $sym176$MAKE_CYCLIFY_STATUS;
    private static final SubLSymbol $kw177$SLOT;
    private static final SubLSymbol $kw178$END;
    private static final SubLSymbol $sym179$VISIT_DEFSTRUCT_OBJECT_CYCLIFY_STATUS_METHOD;
    private static final SubLSymbol $sym180$CYCLIFY_STRING;
    private static final SubLString $str181$__;
    private static final SubLInteger $int182$1024;
    private static final SubLString $str183$quit_reading_file;
    private static final SubLString $str184$string_read_larger_than_buffer_si;
    private static final SubLFloat $float185$0_5;
    private static final SubLString $str186$_a;
    private static final SubLSymbol $kw187$BEFORE;
    private static final SubLSymbol $kw188$WORD;
    private static final SubLSymbol $kw189$KEEP_BLANK;
    private static final SubLSymbol $kw190$SKIP_BLANKS;
    private static final SubLString $str191$Unknown_State__S__Flaw_in_state_m;
    private static final SubLSymbol $kw192$SPACE;
    private static final SubLString $str193$Unknown_state__S__Design_flaw_in_;
    private static final SubLSymbol $sym194$PRIN1;
    private static final SubLSymbol $sym195$FUNCTION_SYMBOL_P;
    private static final SubLSymbol $kw196$INPUT;
    private static final SubLString $str197$Unable_to_open__S;
    private static final SubLString $str198$Could_not_open_an_input_stream_fo;
    private static final SubLSymbol $kw199$OUTPUT;
    private static final SubLString $str200$__Cannot_open_input_stream_for__A;
    private static final SubLString $str201$_;
    private static final SubLInteger $int202$97;
    private static final SubLInteger $int203$26;
    private static final SubLSymbol $sym204$ALPHANUMERIC_OR_HYPHEN_P;
    private static final SubLString $str205$_a_is_not_a_number_between_0_and_;
    private static final SubLSymbol $sym206$NON_ALPHANUMERIC_P;
    private static final SubLSymbol $sym207$KEYWORD_IMPOSTOR_P;
    private static final SubLSymbol $sym208$PROGN;
    private static final SubLString $str209$__a;
    private static final SubLSymbol $kw210$FULL;
    private static final SubLList $list211;
    private static final SubLSymbol $sym212$SUBWORD_;
    private static final SubLList $list213;
    private static final SubLSymbol $sym214$STRING_DOWNCASE_EXCEPT_ACRONYMS;
    private static final SubLObject $list215;
    private static final SubLSymbol $sym216$SPACE_DONT_UNCAPITALIZE;
    private static final SubLObject $list217;
    private static final SubLSymbol $sym218$QUOTED_STRING_;
    private static final SubLList $list219;
    private static final SubLSymbol $sym220$CONCATENATE_ADJACENT_STRINGS;
    private static final SubLList $list221;
    private static final SubLSymbol $sym222$FORMAT_NIL_TEST;
    private static final SubLList $list223;
    private static final SubLSymbol $sym224$HEX_INT_FROM_STRING;
    private static final SubLList $list225;
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 669L)
    public static SubLObject not_test_char(final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.not_eql(obj, string_utilities.$test_char$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 830L)
    public static SubLObject do_words(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)string_utilities.$list1);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject word = (SubLObject)string_utilities.NIL;
        SubLObject string = (SubLObject)string_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)string_utilities.$list1);
        word = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)string_utilities.$list1);
        string = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)string_utilities.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)string_utilities.NIL;
        SubLObject current_$1 = (SubLObject)string_utilities.NIL;
        while (string_utilities.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)string_utilities.$list1);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)string_utilities.$list1);
            if (string_utilities.NIL == conses_high.member(current_$1, (SubLObject)string_utilities.$list2, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED)) {
                bad = (SubLObject)string_utilities.T;
            }
            if (current_$1 == string_utilities.$kw3$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (string_utilities.NIL != bad && string_utilities.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)string_utilities.$list1);
        }
        final SubLObject break_char_tail = cdestructuring_bind.property_list_member((SubLObject)string_utilities.$kw4$BREAK_CHAR, current);
        final SubLObject break_char = (SubLObject)((string_utilities.NIL != break_char_tail) ? conses_high.cadr(break_char_tail) : string_utilities.$sym5$_SPACE_CHAR_);
        final SubLObject body;
        current = (body = temp);
        final SubLObject word_list_var = (SubLObject)string_utilities.$sym6$WORD_LIST_VAR;
        return (SubLObject)ConsesLow.list((SubLObject)string_utilities.$sym7$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)string_utilities.$sym8$_TEST_CHAR_, break_char), (SubLObject)ConsesLow.list(word_list_var, (SubLObject)ConsesLow.listS((SubLObject)string_utilities.$sym9$BREAK_WORDS, string, (SubLObject)string_utilities.$list10))), (SubLObject)ConsesLow.listS((SubLObject)string_utilities.$sym11$CDOLIST, (SubLObject)ConsesLow.list(word, word_list_var), ConsesLow.append(body, (SubLObject)string_utilities.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 1280L)
    public static SubLObject empty_string_p(final SubLObject v_object) {
        return Equality.equal(string_utilities.$empty_string$.getGlobalValue(), v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 1403L)
    public static SubLObject empty_stringP(final SubLObject string) {
        return empty_string_p(string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 1564L)
    public static SubLObject non_empty_string_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isString() && string_utilities.NIL == empty_string_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 1678L)
    public static SubLObject every_in_string(final SubLObject predicate, final SubLObject string, SubLObject key) {
        if (key == string_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)string_utilities.IDENTITY);
        }
        SubLObject ans = (SubLObject)string_utilities.NIL;
        if (key.eql(Symbols.symbol_function((SubLObject)string_utilities.IDENTITY)) || key == string_utilities.IDENTITY) {
            final SubLObject end_var = Sequences.length(string);
            if (string_utilities.NIL == ans) {
                SubLObject end_var_$2;
                SubLObject char_num;
                SubLObject v_char;
                for (end_var_$2 = end_var, char_num = (SubLObject)string_utilities.NIL, char_num = (SubLObject)string_utilities.ZERO_INTEGER; string_utilities.NIL == ans && !char_num.numGE(end_var_$2); ans = (SubLObject)SubLObjectFactory.makeBoolean(string_utilities.NIL == Functions.funcall(predicate, v_char)), char_num = number_utilities.f_1X(char_num)) {
                    v_char = Strings.sublisp_char(string, char_num);
                }
            }
        }
        else {
            final SubLObject end_var = Sequences.length(string);
            if (string_utilities.NIL == ans) {
                SubLObject char_num;
                SubLObject v_char;
                SubLObject end_var_$3;
                for (end_var_$3 = end_var, char_num = (SubLObject)string_utilities.NIL, char_num = (SubLObject)string_utilities.ZERO_INTEGER; string_utilities.NIL == ans && !char_num.numGE(end_var_$3); ans = (SubLObject)SubLObjectFactory.makeBoolean(string_utilities.NIL == Functions.funcall(predicate, Functions.funcall(key, v_char))), char_num = number_utilities.f_1X(char_num)) {
                    v_char = Strings.sublisp_char(string, char_num);
                }
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(string_utilities.NIL == ans);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 2110L)
    public static SubLObject any_in_string(final SubLObject predicate, final SubLObject string, SubLObject key) {
        if (key == string_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)string_utilities.IDENTITY);
        }
        SubLObject ans = (SubLObject)string_utilities.NIL;
        if (key.eql(Symbols.symbol_function((SubLObject)string_utilities.IDENTITY)) || key == string_utilities.IDENTITY) {
            final SubLObject end_var = Sequences.length(string);
            if (string_utilities.NIL == ans) {
                SubLObject end_var_$4;
                SubLObject char_num;
                SubLObject v_char;
                for (end_var_$4 = end_var, char_num = (SubLObject)string_utilities.NIL, char_num = (SubLObject)string_utilities.ZERO_INTEGER; string_utilities.NIL == ans && !char_num.numGE(end_var_$4); ans = Functions.funcall(predicate, v_char), char_num = number_utilities.f_1X(char_num)) {
                    v_char = Strings.sublisp_char(string, char_num);
                }
            }
        }
        else {
            final SubLObject end_var = Sequences.length(string);
            if (string_utilities.NIL == ans) {
                SubLObject char_num;
                SubLObject v_char;
                SubLObject end_var_$5;
                for (end_var_$5 = end_var, char_num = (SubLObject)string_utilities.NIL, char_num = (SubLObject)string_utilities.ZERO_INTEGER; string_utilities.NIL == ans && !char_num.numGE(end_var_$5); ans = Functions.funcall(predicate, Functions.funcall(key, v_char)), char_num = number_utilities.f_1X(char_num)) {
                    v_char = Strings.sublisp_char(string, char_num);
                }
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 2520L)
    public static SubLObject list_of_string_p(final SubLObject v_object) {
        return list_utilities.list_of_type_p(Symbols.symbol_function((SubLObject)string_utilities.$sym12$STRINGP), v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 2649L)
    public static SubLObject clear_object_to_string() {
        final SubLObject cs = string_utilities.$object_to_string_caching_state$.getGlobalValue();
        if (string_utilities.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)string_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 2649L)
    public static SubLObject remove_object_to_string(final SubLObject v_object) {
        return memoization_state.caching_state_remove_function_results_with_args(string_utilities.$object_to_string_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(v_object), (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 2649L)
    public static SubLObject object_to_string_internal(final SubLObject v_object) {
        return print_high.princ_to_string(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 2649L)
    public static SubLObject object_to_string(final SubLObject v_object) {
        SubLObject caching_state = string_utilities.$object_to_string_caching_state$.getGlobalValue();
        if (string_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)string_utilities.$sym13$OBJECT_TO_STRING, (SubLObject)string_utilities.$sym14$_OBJECT_TO_STRING_CACHING_STATE_, (SubLObject)string_utilities.$int15$1000, (SubLObject)string_utilities.EQL, (SubLObject)string_utilities.ONE_INTEGER, (SubLObject)string_utilities.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_object, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(object_to_string_internal(v_object)));
            memoization_state.caching_state_put(caching_state, v_object, results, (SubLObject)string_utilities.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 2748L)
    public static SubLObject fort_to_string(final SubLObject fort) {
        if (string_utilities.NIL != constant_handles.constant_p(fort)) {
            return object_to_string(fort);
        }
        if (string_utilities.NIL != nart_handles.nart_p(fort)) {
            return object_to_string(narts_high.nart_el_formula(fort));
        }
        return (SubLObject)string_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 3056L)
    public static SubLObject function_to_string(final SubLObject function) {
        if (function.isSymbol()) {
            return Symbols.symbol_name(function);
        }
        if (function.isFunction()) {
            return post_remove(string_upto(substring(print_high.princ_to_string(function), (SubLObject)string_utilities.ELEVEN_INTEGER, (SubLObject)string_utilities.UNPROVIDED), (SubLObject)string_utilities.UNPROVIDED), (SubLObject)string_utilities.$str16$_, (SubLObject)string_utilities.UNPROVIDED);
        }
        return print_high.princ_to_string(function);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 3458L)
    public static SubLObject to_string(final SubLObject value) {
        return print_high.princ_to_string(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 3812L)
    public static SubLObject non_nil_to_string(final SubLObject value) {
        if (string_utilities.NIL != value) {
            return to_string(value);
        }
        return (SubLObject)string_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 4323L)
    public static SubLObject to_lisp_string(final SubLObject value) {
        return unquote_string(print_high.prin1_to_string(value));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 4678L)
    public static SubLObject to_string_of_length(final SubLObject v_object, final SubLObject length) {
        final SubLObject string = to_string(v_object);
        final SubLObject string_length = Sequences.length(string);
        return string_length.numGE(length) ? string_first_n(length, string) : Sequences.cconcatenate(string, Strings.make_string(Numbers.subtract(length, string_length), (SubLObject)string_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 5186L)
    public static SubLObject first_n_list_items_to_string(final SubLObject list, final SubLObject n) {
        SubLObject result = (SubLObject)string_utilities.NIL;
        final SubLObject last_index = number_utilities.f_1_(Sequences.length(list));
        SubLObject stream = (SubLObject)string_utilities.NIL;
        try {
            stream = streams_high.make_private_string_output_stream();
            streams_high.write_string((SubLObject)string_utilities.$str17$_, stream, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED);
            SubLObject cdotimes_end_var;
            SubLObject index;
            for (cdotimes_end_var = number_utilities.minimum((SubLObject)ConsesLow.list(n, Sequences.length(list)), (SubLObject)string_utilities.UNPROVIDED), index = (SubLObject)string_utilities.NIL, index = (SubLObject)string_utilities.ZERO_INTEGER; index.numL(cdotimes_end_var); index = Numbers.add(index, (SubLObject)string_utilities.ONE_INTEGER)) {
                streams_high.write_string(to_string(Sequences.elt(list, index)), stream, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED);
                if (!index.eql(last_index)) {
                    streams_high.write_string((SubLObject)string_utilities.$str18$_, stream, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED);
                }
            }
            if (n.numL(Sequences.length(list))) {
                streams_high.write_string((SubLObject)string_utilities.$str19$___, stream, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED);
            }
            streams_high.write_string((SubLObject)string_utilities.$str20$_, stream, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED);
            result = streams_high.get_output_stream_string(stream);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)string_utilities.T);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(stream, (SubLObject)string_utilities.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 5876L)
    public static SubLObject char_at(final SubLObject string, final SubLObject index) {
        if (index.numGE((SubLObject)string_utilities.ZERO_INTEGER) && index.numL(Sequences.length(string))) {
            return Strings.sublisp_char(string, index);
        }
        return (SubLObject)string_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 6211L)
    public static SubLObject quote_string(final SubLObject string, SubLObject quote_string) {
        if (quote_string == string_utilities.UNPROVIDED) {
            quote_string = (SubLObject)string_utilities.$str21$_;
        }
        return pre_fix(post_fix(string, quote_string), quote_string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 6531L)
    public static SubLObject unquote_string(final SubLObject string) {
        SubLObject result = string;
        if (string_utilities.NIL != quoted_stringP(string)) {
            result = substring(result, (SubLObject)string_utilities.ONE_INTEGER, number_utilities.f_1_(Sequences.length(string)));
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 6909L)
    public static SubLObject quoted_stringP(final SubLObject string) {
        assert string_utilities.NIL != Types.stringp(string) : string;
        if (string_utilities.NIL != list_utilities.lengthLE(string, (SubLObject)string_utilities.ONE_INTEGER, (SubLObject)string_utilities.UNPROVIDED)) {
            return (SubLObject)string_utilities.NIL;
        }
        final SubLObject lead_char = first_char(string);
        final SubLObject quotedP = (SubLObject)SubLObjectFactory.makeBoolean((lead_char.eql((SubLObject)Characters.CHAR_quote) || lead_char.eql((SubLObject)Characters.CHAR_quotation)) && lead_char.eql(last_char(string)));
        return quotedP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 7235L)
    public static SubLObject str(final SubLObject v_object) {
        return format_nil.format_nil_a(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 7329L)
    public static SubLObject printed_forms_equalP(final SubLObject form1, final SubLObject form2, SubLObject test) {
        if (test == string_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)string_utilities.EQUAL);
        }
        return Functions.funcall(test, transform_list_utilities.quiescent_transform(form1, Symbols.symbol_function((SubLObject)string_utilities.$sym22$READABLE_P), Symbols.symbol_function((SubLObject)string_utilities.$sym23$READ_FROM_STRING_IGNORING_ERRORS), Symbols.symbol_function((SubLObject)string_utilities.$sym13$OBJECT_TO_STRING), (SubLObject)string_utilities.UNPROVIDED), transform_list_utilities.quiescent_transform(form2, Symbols.symbol_function((SubLObject)string_utilities.$sym22$READABLE_P), Symbols.symbol_function((SubLObject)string_utilities.$sym23$READ_FROM_STRING_IGNORING_ERRORS), Symbols.symbol_function((SubLObject)string_utilities.$sym13$OBJECT_TO_STRING), (SubLObject)string_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 7616L)
    public static SubLObject readable_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject string = object_to_string(v_object);
        thread.resetMultipleValues();
        final SubLObject read_as = reader.read_from_string_ignoring_errors(string, (SubLObject)string_utilities.NIL, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED);
        final SubLObject status = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return (SubLObject)SubLObjectFactory.makeBoolean(!status.eql((SubLObject)string_utilities.$kw24$ERROR));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 7882L)
    public static SubLObject string_to_number(final SubLObject string) {
        final SubLObject result = reader.read_from_string_ignoring_errors(string, (SubLObject)string_utilities.NIL, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED);
        return (SubLObject)(result.isNumber() ? result : string_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 8053L)
    public static SubLObject string_to_integer(final SubLObject string) {
        final SubLObject result = reader.read_from_string_ignoring_errors(string, (SubLObject)string_utilities.NIL, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED);
        return (SubLObject)(result.isInteger() ? result : string_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 8227L)
    public static SubLObject integer_string_p(final SubLObject string) {
        return string_to_integer(string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 8448L)
    public static SubLObject integer_stringL(final SubLObject integer_string1, final SubLObject integer_string2) {
        final SubLObject integer1 = string_to_integer(integer_string1);
        final SubLObject integer2 = string_to_integer(integer_string2);
        if (string_utilities.NIL == integer2) {
            return (SubLObject)string_utilities.T;
        }
        if (string_utilities.NIL == integer1) {
            return (SubLObject)string_utilities.NIL;
        }
        return Numbers.numL(integer1, integer2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 8754L)
    public static SubLObject to_hex_string(final SubLObject integer) {
        return PrintLow.format((SubLObject)string_utilities.NIL, (SubLObject)string_utilities.$str25$_X, integer);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 8829L)
    public static SubLObject hex_int_from_string(final SubLObject string) {
        final SubLObject end = Sequences.length(string);
        return reader.parse_integer(string, (SubLObject)string_utilities.TWO_INTEGER, end, (SubLObject)string_utilities.SIXTEEN_INTEGER, (SubLObject)string_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 8950L)
    public static SubLObject string_length_L(final SubLObject string1, final SubLObject string2) {
        return Numbers.numL(Sequences.length(string1), Sequences.length(string2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 9198L)
    public static SubLObject indent(final SubLObject stream, final SubLObject n) {
        SubLObject i;
        for (i = (SubLObject)string_utilities.NIL, i = (SubLObject)string_utilities.ZERO_INTEGER; i.numL(n); i = Numbers.add(i, (SubLObject)string_utilities.ONE_INTEGER)) {
            streams_high.write_char((SubLObject)Characters.CHAR_space, stream);
        }
        return stream;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 9313L)
    public static SubLObject aref_from_end(final SubLObject vector, SubLObject index) {
        assert string_utilities.NIL != Types.fixnump(index) : index;
        index = Numbers.subtract(Sequences.length(vector), index, (SubLObject)string_utilities.ONE_INTEGER);
        return Vectors.aref(vector, index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 9540L)
    public static SubLObject char_from_end(final SubLObject string, final SubLObject index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert string_utilities.NIL != Types.stringp(string) : string;
        if (string_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && string_utilities.NIL == list_utilities.lengthGE(string, index, (SubLObject)string_utilities.UNPROVIDED)) {
            Errors.error((SubLObject)string_utilities.$str27$_S_is_too_short_to_remove__D_char, string, index);
        }
        return aref_from_end(string, index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 9822L)
    public static SubLObject first_char(final SubLObject string) {
        return Strings.sublisp_char(string, (SubLObject)string_utilities.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 9933L)
    public static SubLObject first_of_string(final SubLObject string) {
        return string_first_n((SubLObject)string_utilities.ONE_INTEGER, string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 10074L)
    public static SubLObject rest_of_string(final SubLObject string) {
        assert string_utilities.NIL != non_empty_stringP(string) : string;
        return strip_first(string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 10321L)
    public static SubLObject last_char(final SubLObject string) {
        return char_from_end(string, (SubLObject)string_utilities.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 10383L)
    public static SubLObject pre_add_character_to_string(final SubLObject v_char, final SubLObject string) {
        return Sequences.replace(Strings.make_string(number_utilities.f_1X(Sequences.length(string)), v_char), string, (SubLObject)string_utilities.ONE_INTEGER, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 10625L)
    public static SubLObject post_add_character_to_string(final SubLObject v_char, final SubLObject string) {
        return Sequences.replace(Strings.make_string(number_utilities.f_1X(Sequences.length(string)), v_char), string, (SubLObject)string_utilities.ZERO_INTEGER, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 10862L)
    public static SubLObject pre_and_post_add_character_to_string(final SubLObject v_char, final SubLObject string) {
        return Sequences.replace(Strings.make_string(Numbers.add((SubLObject)string_utilities.TWO_INTEGER, Sequences.length(string)), v_char), string, (SubLObject)string_utilities.ONE_INTEGER, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 11122L)
    public static SubLObject copy_string(final SubLObject string) {
        assert string_utilities.NIL != Types.stringp(string) : string;
        return Sequences.copy_seq(string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 11211L)
    public static SubLObject string_substitute(final SubLObject v_new, final SubLObject old, final SubLObject string, SubLObject test) {
        if (test == string_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)string_utilities.EQUAL);
        }
        assert string_utilities.NIL != Types.stringp(v_new) : v_new;
        assert string_utilities.NIL != Types.stringp(old) : old;
        assert string_utilities.NIL != Types.stringp(string) : string;
        if (string_utilities.NIL == Sequences.search(old, string, test, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED)) {
            return string;
        }
        final SubLObject old_length = Sequences.length(old);
        if (string_utilities.ZERO_INTEGER.numE(old_length) && string_utilities.NIL == Functions.funcall(test, old, (SubLObject)string_utilities.$str0$)) {
            return string;
        }
        SubLObject result = (SubLObject)string_utilities.NIL;
        SubLObject stream = (SubLObject)string_utilities.NIL;
        try {
            stream = streams_high.make_private_string_output_stream();
            final SubLObject string_length = Sequences.length(string);
            if (string_utilities.ZERO_INTEGER.numE(old_length)) {
                SubLObject search_start;
                SubLObject old_position;
                for (search_start = (SubLObject)string_utilities.NIL, search_start = (SubLObject)string_utilities.ZERO_INTEGER; search_start.numL(string_length); search_start = Numbers.add(search_start, (SubLObject)string_utilities.ONE_INTEGER)) {
                    old_position = Numbers.add((SubLObject)string_utilities.ONE_INTEGER, search_start);
                    streams_high.write_string(v_new, stream, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED);
                    streams_high.write_string(string, stream, search_start, old_position);
                }
                streams_high.write_string(v_new, stream, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED);
            }
            else {
                SubLObject search_start;
                SubLObject old_position;
                for (search_start = (SubLObject)string_utilities.NIL, old_position = (SubLObject)string_utilities.NIL, search_start = (SubLObject)string_utilities.ZERO_INTEGER, old_position = Sequences.search(old, string, test, Symbols.symbol_function((SubLObject)string_utilities.IDENTITY), (SubLObject)string_utilities.ZERO_INTEGER, old_length, search_start, string_length); string_utilities.NIL != old_position; old_position = Sequences.search(old, string, test, Symbols.symbol_function((SubLObject)string_utilities.IDENTITY), (SubLObject)string_utilities.ZERO_INTEGER, old_length, search_start, string_length)) {
                    streams_high.write_string(string, stream, search_start, old_position);
                    streams_high.write_string(v_new, stream, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED);
                    search_start = Numbers.add(old_position, old_length);
                }
                streams_high.write_string(string, stream, search_start, (SubLObject)string_utilities.UNPROVIDED);
            }
            result = streams_high.get_output_stream_string(stream);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)string_utilities.T);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(stream, (SubLObject)string_utilities.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 13408L)
    public static SubLObject string_substitute_word(final SubLObject v_new, final SubLObject word, final SubLObject string, SubLObject test, SubLObject word_boundary) {
        if (test == string_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)string_utilities.EQUAL);
        }
        if (word_boundary == string_utilities.UNPROVIDED) {
            word_boundary = string_utilities.$space_char$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert string_utilities.NIL != Types.stringp(v_new) : v_new;
        assert string_utilities.NIL != Types.stringp(word) : word;
        if (string_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && string_utilities.NIL != Sequences.find(word_boundary, word, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED)) {
            Errors.error((SubLObject)string_utilities.$str29$_S_must_be_a_single_word___cannot, word, word_boundary);
        }
        assert string_utilities.NIL != Types.stringp(string) : string;
        SubLObject result = (SubLObject)string_utilities.NIL;
        SubLObject stream = (SubLObject)string_utilities.NIL;
        try {
            stream = streams_high.make_private_string_output_stream();
            final SubLObject _prev_bind_0 = string_utilities.$test_char$.currentBinding(thread);
            try {
                string_utilities.$test_char$.bind(word_boundary, thread);
                SubLObject cdolist_list_var;
                final SubLObject word_list_var = cdolist_list_var = break_words(string, (SubLObject)string_utilities.$sym30$NOT_TEST_CHAR, (SubLObject)string_utilities.UNPROVIDED);
                SubLObject this_word = (SubLObject)string_utilities.NIL;
                this_word = cdolist_list_var.first();
                while (string_utilities.NIL != cdolist_list_var) {
                    if (string_utilities.NIL != Functions.funcall(test, this_word, word)) {
                        streams_high.write_string(v_new, stream, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED);
                    }
                    else {
                        streams_high.write_string(this_word, stream, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED);
                    }
                    streams_high.write_char(word_boundary, stream);
                    cdolist_list_var = cdolist_list_var.rest();
                    this_word = cdolist_list_var.first();
                }
            }
            finally {
                string_utilities.$test_char$.rebind(_prev_bind_0, thread);
            }
            result = streams_high.get_output_stream_string(stream);
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)string_utilities.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(stream, (SubLObject)string_utilities.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return string_butlast(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 14306L)
    public static SubLObject do_string_substitutions(final SubLObject string, final SubLObject subst_list, SubLObject test) {
        if (test == string_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)string_utilities.EQL);
        }
        if (Sequences.length(string).numE((SubLObject)string_utilities.ZERO_INTEGER)) {
            return string;
        }
        SubLObject result = Strings.make_string(Numbers.max((SubLObject)string_utilities.$int31$100, Numbers.multiply((SubLObject)string_utilities.FOUR_INTEGER, Sequences.length(string))), (SubLObject)string_utilities.UNPROVIDED);
        SubLObject result_end = (SubLObject)string_utilities.ZERO_INTEGER;
        SubLObject index;
        SubLObject start = index = (SubLObject)string_utilities.ZERO_INTEGER;
        SubLObject something_copiedP = (SubLObject)string_utilities.NIL;
        for (SubLObject done = (SubLObject)string_utilities.NIL; string_utilities.NIL == done; done = Numbers.numGE(index, Sequences.length(string))) {
            SubLObject found = (SubLObject)string_utilities.NIL;
            SubLObject position = (SubLObject)string_utilities.NIL;
            if (string_utilities.NIL == found) {
                SubLObject csome_list_var = subst_list;
                SubLObject sub = (SubLObject)string_utilities.NIL;
                sub = csome_list_var.first();
                while (string_utilities.NIL == found && string_utilities.NIL != csome_list_var) {
                    position = Sequences.search(sub.first(), string, test, Symbols.symbol_function((SubLObject)string_utilities.IDENTITY), (SubLObject)string_utilities.ZERO_INTEGER, (SubLObject)string_utilities.NIL, index, (SubLObject)string_utilities.NIL);
                    if (string_utilities.NIL != position) {
                        found = sub;
                    }
                    csome_list_var = csome_list_var.rest();
                    sub = csome_list_var.first();
                }
            }
            if (string_utilities.NIL != found) {
                something_copiedP = (SubLObject)string_utilities.T;
                result = Sequences.replace(result, string, result_end, (SubLObject)string_utilities.NIL, start, position);
                result_end = Numbers.add(result_end, Numbers.subtract(position, start));
                result = Sequences.replace(result, found.rest(), result_end, (SubLObject)string_utilities.NIL, (SubLObject)string_utilities.ZERO_INTEGER, Sequences.length(found.rest()));
                result_end = Numbers.add(result_end, Sequences.length(found.rest()));
                start = (index = Numbers.add(position, Sequences.length(found.first())));
            }
            else {
                index = Numbers.add(index, (SubLObject)string_utilities.ONE_INTEGER);
            }
        }
        if (string_utilities.NIL != something_copiedP) {
            Sequences.replace(result, string, result_end, (SubLObject)string_utilities.NIL, start, index);
            result_end = Numbers.add(result_end, Numbers.subtract(index, start));
            result = Sequences.subseq(result, (SubLObject)string_utilities.ZERO_INTEGER, result_end);
        }
        else {
            result = string;
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 15596L)
    public static SubLObject do_string_substitutions_robust(final SubLObject string, final SubLObject subst_list, SubLObject test) {
        if (test == string_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)string_utilities.EQL);
        }
        if (Sequences.length(string).numE((SubLObject)string_utilities.ZERO_INTEGER)) {
            return string;
        }
        SubLObject result = Strings.make_string(Numbers.max((SubLObject)string_utilities.$int32$256, Numbers.multiply((SubLObject)string_utilities.FOUR_INTEGER, Sequences.length(string))), (SubLObject)string_utilities.UNPROVIDED);
        SubLObject result_end = (SubLObject)string_utilities.ZERO_INTEGER;
        SubLObject index;
        SubLObject start = index = (SubLObject)string_utilities.ZERO_INTEGER;
        SubLObject something_copiedP = (SubLObject)string_utilities.NIL;
        for (SubLObject done = (SubLObject)string_utilities.NIL; string_utilities.NIL == done; done = Numbers.numGE(index, Sequences.length(string))) {
            SubLObject min = Sequences.length(string);
            SubLObject found = (SubLObject)string_utilities.NIL;
            SubLObject position = (SubLObject)string_utilities.NIL;
            SubLObject cdolist_list_var = subst_list;
            SubLObject sub = (SubLObject)string_utilities.NIL;
            sub = cdolist_list_var.first();
            while (string_utilities.NIL != cdolist_list_var) {
                position = Sequences.search(sub.first(), string, test, Symbols.symbol_function((SubLObject)string_utilities.IDENTITY), (SubLObject)string_utilities.ZERO_INTEGER, (SubLObject)string_utilities.NIL, index, (SubLObject)string_utilities.NIL);
                if (string_utilities.NIL != position && position.numL(min)) {
                    min = position;
                    found = sub;
                }
                cdolist_list_var = cdolist_list_var.rest();
                sub = cdolist_list_var.first();
            }
            if (string_utilities.NIL != found) {
                something_copiedP = (SubLObject)string_utilities.T;
                result = Sequences.replace(result, string, result_end, (SubLObject)string_utilities.NIL, start, min);
                result_end = Numbers.add(result_end, Numbers.subtract(min, start));
                result = Sequences.replace(result, found.rest(), result_end, (SubLObject)string_utilities.NIL, (SubLObject)string_utilities.ZERO_INTEGER, Sequences.length(found.rest()));
                result_end = Numbers.add(result_end, Sequences.length(found.rest()));
                start = (index = Numbers.add(min, Sequences.length(found.first())));
            }
            else {
                index = Numbers.add(index, (SubLObject)string_utilities.ONE_INTEGER);
            }
        }
        if (string_utilities.NIL != something_copiedP) {
            Sequences.replace(result, string, result_end, (SubLObject)string_utilities.NIL, start, index);
            result_end = Numbers.add(result_end, Numbers.subtract(index, start));
            result = Sequences.subseq(result, (SubLObject)string_utilities.ZERO_INTEGER, result_end);
        }
        else {
            result = string;
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 17053L)
    public static SubLObject insert_escape_for_chars_in_string(final SubLObject chars, final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert string_utilities.NIL != Types.listp(chars) : chars;
        assert string_utilities.NIL != Types.stringp(string) : string;
        if (string_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && string_utilities.NIL == list_utilities.every_in_list(Symbols.symbol_function((SubLObject)string_utilities.$sym34$CHARACTERP), chars, (SubLObject)string_utilities.UNPROVIDED)) {
            Errors.error((SubLObject)string_utilities.$str35$Some_element_of__A_is_not_charact, chars);
        }
        if (string_utilities.NIL == chars) {
            return string;
        }
        if (string.equal((SubLObject)string_utilities.$str0$)) {
            return string;
        }
        SubLObject increase = (SubLObject)string_utilities.ZERO_INTEGER;
        SubLObject end_var_$6;
        SubLObject end_var;
        SubLObject char_num;
        SubLObject string_char;
        for (end_var = (end_var_$6 = Sequences.length(string)), char_num = (SubLObject)string_utilities.NIL, char_num = (SubLObject)string_utilities.ZERO_INTEGER; !char_num.numGE(end_var_$6); char_num = number_utilities.f_1X(char_num)) {
            string_char = Strings.sublisp_char(string, char_num);
            if (string_utilities.NIL != subl_promotions.memberP(string_char, chars, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED)) {
                increase = Numbers.add(increase, (SubLObject)string_utilities.ONE_INTEGER);
            }
        }
        if (increase.numE((SubLObject)string_utilities.ZERO_INTEGER)) {
            return string;
        }
        final SubLObject new_string = Strings.make_string(Numbers.add(Sequences.length(string), increase), (SubLObject)string_utilities.UNPROVIDED);
        SubLObject index = (SubLObject)string_utilities.ZERO_INTEGER;
        SubLObject drift = (SubLObject)string_utilities.ZERO_INTEGER;
        SubLObject end_var_$7;
        SubLObject end_var2;
        SubLObject char_num2;
        SubLObject string_char2;
        for (end_var2 = (end_var_$7 = Sequences.length(string)), char_num2 = (SubLObject)string_utilities.NIL, char_num2 = (SubLObject)string_utilities.ZERO_INTEGER; !char_num2.numGE(end_var_$7); char_num2 = number_utilities.f_1X(char_num2)) {
            string_char2 = Strings.sublisp_char(string, char_num2);
            if (string_utilities.NIL != subl_promotions.memberP(string_char2, chars, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED)) {
                Strings.set_char(new_string, Numbers.add(index, drift), (SubLObject)Characters.CHAR_backslash);
                drift = Numbers.add(drift, (SubLObject)string_utilities.ONE_INTEGER);
            }
            Strings.set_char(new_string, Numbers.add(index, drift), Sequences.elt(string, index));
            index = Numbers.add(index, (SubLObject)string_utilities.ONE_INTEGER);
        }
        return new_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 18111L)
    public static SubLObject html_escaped_string_p(final SubLObject string) {
        SubLObject inside_escapeP = (SubLObject)string_utilities.NIL;
        SubLObject numericP = misc_utilities.uninitialized();
        SubLObject hexP = misc_utilities.uninitialized();
        SubLObject found_escapeP = (SubLObject)string_utilities.NIL;
        final SubLObject end_var = Sequences.length(string);
        if (string_utilities.NIL == found_escapeP) {
            SubLObject end_var_$8;
            SubLObject char_num;
            SubLObject v_char;
            for (end_var_$8 = end_var, char_num = (SubLObject)string_utilities.NIL, char_num = (SubLObject)string_utilities.ZERO_INTEGER; string_utilities.NIL == found_escapeP && !char_num.numGE(end_var_$8); char_num = number_utilities.f_1X(char_num)) {
                v_char = Strings.sublisp_char(string, char_num);
                if (v_char.eql((SubLObject)Characters.CHAR_ampersand)) {
                    inside_escapeP = (SubLObject)string_utilities.T;
                    numericP = misc_utilities.uninitialized();
                    hexP = misc_utilities.uninitialized();
                }
                else if (string_utilities.NIL != inside_escapeP) {
                    if (v_char.eql((SubLObject)Characters.CHAR_semicolon)) {
                        found_escapeP = (SubLObject)string_utilities.T;
                    }
                    else if (string_utilities.NIL != Characters.digit_char_p(v_char, (SubLObject)string_utilities.UNPROVIDED)) {
                        if (string_utilities.NIL != misc_utilities.uninitialized_p(numericP)) {
                            numericP = (SubLObject)string_utilities.NIL;
                        }
                        else if (string_utilities.NIL != misc_utilities.uninitialized_p(hexP)) {
                            hexP = (SubLObject)string_utilities.NIL;
                        }
                    }
                    else if (v_char.eql((SubLObject)Characters.CHAR_x) && string_utilities.NIL != misc_utilities.initialized_p(numericP) && string_utilities.NIL != numericP && string_utilities.NIL != misc_utilities.uninitialized_p(hexP)) {
                        hexP = (SubLObject)string_utilities.T;
                    }
                    else if (string_utilities.NIL != Characters.alpha_char_p(v_char)) {
                        if (string_utilities.NIL != misc_utilities.uninitialized_p(numericP)) {
                            numericP = (SubLObject)string_utilities.NIL;
                        }
                        else if (string_utilities.NIL != numericP && (string_utilities.NIL.eql(hexP) || string_utilities.NIL == hex_char_p(v_char))) {
                            inside_escapeP = (SubLObject)string_utilities.NIL;
                            numericP = misc_utilities.uninitialized();
                            hexP = misc_utilities.uninitialized();
                        }
                    }
                    else if (Characters.CHAR_hash.eql(v_char) && string_utilities.NIL != misc_utilities.uninitialized_p(numericP)) {
                        numericP = (SubLObject)string_utilities.T;
                    }
                    else {
                        inside_escapeP = (SubLObject)string_utilities.NIL;
                        numericP = misc_utilities.uninitialized();
                        hexP = misc_utilities.uninitialized();
                    }
                }
            }
        }
        return found_escapeP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 19548L)
    public static SubLObject remove_last_char(final SubLObject string, SubLObject n) {
        if (n == string_utilities.UNPROVIDED) {
            n = (SubLObject)string_utilities.ONE_INTEGER;
        }
        return substring(string, (SubLObject)string_utilities.ZERO_INTEGER, Numbers.subtract(Sequences.length(string), n));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 19717L)
    public static SubLObject remove_substring(final SubLObject string, final SubLObject substring) {
        if (string_utilities.NIL != substringP(substring, string, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED)) {
            return do_string_substitutions_robust(string, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons(substring, string_utilities.$empty_string$.getGlobalValue())), (SubLObject)string_utilities.UNPROVIDED);
        }
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 19913L)
    public static SubLObject replace_substring(final SubLObject string, final SubLObject substring, final SubLObject v_new) {
        if (string_utilities.NIL != substringP(substring, string, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED)) {
            return do_string_substitutions_robust(string, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons(substring, v_new)), (SubLObject)string_utilities.UNPROVIDED);
        }
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 20247L)
    public static SubLObject replace_substring_once(final SubLObject string, final SubLObject substring, final SubLObject v_new, SubLObject start) {
        if (start == string_utilities.UNPROVIDED) {
            start = (SubLObject)string_utilities.ZERO_INTEGER;
        }
        final SubLObject pos = Sequences.search(substring, string, Symbols.symbol_function((SubLObject)string_utilities.EQL), Symbols.symbol_function((SubLObject)string_utilities.IDENTITY), (SubLObject)string_utilities.ZERO_INTEGER, (SubLObject)string_utilities.NIL, start, (SubLObject)string_utilities.UNPROVIDED);
        if (string_utilities.NIL != pos) {
            final SubLObject new_string = Sequences.cconcatenate(substring(string, (SubLObject)string_utilities.ZERO_INTEGER, pos), new SubLObject[] { v_new, substring(string, Numbers.add(pos, Sequences.length(substring)), (SubLObject)string_utilities.UNPROVIDED) });
            return new_string;
        }
        return (SubLObject)string_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 20714L)
    public static SubLObject nreplace_substring_at(final SubLObject string, final SubLObject start, final SubLObject length, final SubLObject v_new) {
        assert string_utilities.NIL != Types.stringp(string) : string;
        assert string_utilities.NIL != subl_promotions.non_negative_integer_p(start) : start;
        assert string_utilities.NIL != subl_promotions.non_negative_integer_p(length) : length;
        assert string_utilities.NIL != Types.stringp(v_new) : v_new;
        if (string_utilities.NIL != list_utilities.lengthE(v_new, length, (SubLObject)string_utilities.UNPROVIDED)) {
            SubLObject end_var_$9;
            SubLObject end_var;
            SubLObject char_num;
            SubLObject v_char;
            for (end_var = (end_var_$9 = Sequences.length(v_new)), char_num = (SubLObject)string_utilities.NIL, char_num = (SubLObject)string_utilities.ZERO_INTEGER; !char_num.numGE(end_var_$9); char_num = number_utilities.f_1X(char_num)) {
                v_char = Strings.sublisp_char(v_new, char_num);
                Strings.set_char(string, Numbers.add(start, char_num), v_char);
            }
            return string;
        }
        return Sequences.cconcatenate(substring(string, (SubLObject)string_utilities.ZERO_INTEGER, start), new SubLObject[] { v_new, substring(string, Numbers.add(start, length), (SubLObject)string_utilities.UNPROVIDED) });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 21318L)
    public static SubLObject infix(final SubLObject str1, final SubLObject str2, final SubLObject place) {
        if (Sequences.length(str2).numG(place)) {
            return Sequences.cconcatenate(substring(str2, (SubLObject)string_utilities.ZERO_INTEGER, Numbers.add(place, (SubLObject)string_utilities.ONE_INTEGER)), new SubLObject[] { str1, substring(str2, Numbers.add(place, (SubLObject)string_utilities.ONE_INTEGER), Sequences.length(str2)) });
        }
        return (SubLObject)string_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 21499L)
    public static SubLObject post_fix(final SubLObject w, final SubLObject p) {
        return Sequences.cconcatenate(w, p);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 21551L)
    public static SubLObject pre_fix(final SubLObject w, final SubLObject p) {
        return Sequences.cconcatenate(p, w);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 21602L)
    public static SubLObject post_remove(final SubLObject w, final SubLObject p, SubLObject test) {
        if (test == string_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)string_utilities.EQUAL);
        }
        final SubLObject lp = Sequences.length(p);
        final SubLObject lw = Sequences.length(w);
        return (string_utilities.NIL != ends_with(w, p, test)) ? substring(w, (SubLObject)string_utilities.ZERO_INTEGER, Numbers.subtract(lw, lp)) : w;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 21885L)
    public static SubLObject pre_remove(final SubLObject w, final SubLObject p, SubLObject test) {
        if (test == string_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)string_utilities.EQUAL);
        }
        return (string_utilities.NIL != starts_with_by_test(w, p, test)) ? substring(w, Sequences.length(p), (SubLObject)string_utilities.UNPROVIDED) : w;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 22130L)
    public static SubLObject substring(final SubLObject string, final SubLObject start, SubLObject end) {
        if (end == string_utilities.UNPROVIDED) {
            end = (SubLObject)string_utilities.NIL;
        }
        assert string_utilities.NIL != Types.stringp(string) : string;
        return Sequences.subseq(string, start, end);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 22243L)
    public static SubLObject string_first_n(final SubLObject n, final SubLObject string) {
        final SubLObject end = Numbers.min(n, Sequences.length(string));
        return substring(string, (SubLObject)string_utilities.ZERO_INTEGER, end);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 22511L)
    public static SubLObject string_last_n(final SubLObject n, final SubLObject string) {
        final SubLObject len = Sequences.length(string);
        final SubLObject start = Numbers.subtract(len, Numbers.min(n, len));
        return substring(string, start, len);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 22801L)
    public static SubLObject string_butlast(final SubLObject string) {
        return strip_final(string, (SubLObject)string_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 22913L)
    public static SubLObject ends_with(final SubLObject w, final SubLObject ending, SubLObject test) {
        if (test == string_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)string_utilities.EQUAL);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(string_utilities.NIL != list_utilities.greater_or_same_length_p(w, ending) && string_utilities.NIL != substring_matchP(w, ending, Numbers.subtract(Sequences.length(w), Sequences.length(ending)), test));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 23126L)
    public static SubLObject ends_with_one_of(final SubLObject string, final SubLObject ending_strings) {
        SubLObject v_boolean = (SubLObject)string_utilities.NIL;
        SubLObject matching_string = (SubLObject)string_utilities.NIL;
        if (string_utilities.NIL == v_boolean) {
            SubLObject csome_list_var = ending_strings;
            SubLObject s = (SubLObject)string_utilities.NIL;
            s = csome_list_var.first();
            while (string_utilities.NIL == v_boolean && string_utilities.NIL != csome_list_var) {
                v_boolean = ends_with(string, s, (SubLObject)string_utilities.UNPROVIDED);
                if (string_utilities.NIL != v_boolean) {
                    matching_string = s;
                }
                csome_list_var = csome_list_var.rest();
                s = csome_list_var.first();
            }
        }
        return Values.values(v_boolean, matching_string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 23576L)
    public static SubLObject ends_with_punctuation_p(final SubLObject stryng) {
        final SubLObject string_length = Sequences.length(stryng);
        final SubLObject end_char = Strings.sublisp_char(stryng, Numbers.subtract(string_length, (SubLObject)string_utilities.ONE_INTEGER));
        return punctuation_p(end_char);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 23751L)
    public static SubLObject ends_with_number_p(final SubLObject str) {
        return Characters.digit_char_p(last_char(str), (SubLObject)string_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 23832L)
    public static SubLObject ends_with_number(final SubLObject str) {
        SubLObject last_num_index = (SubLObject)string_utilities.NIL;
        SubLObject done = (SubLObject)string_utilities.NIL;
        final SubLObject string_var = Sequences.reverse(str);
        final SubLObject end_var = Sequences.length(string_var);
        if (string_utilities.NIL == done) {
            SubLObject end_var_$10;
            SubLObject char_num;
            SubLObject v_char;
            for (end_var_$10 = end_var, char_num = (SubLObject)string_utilities.NIL, char_num = (SubLObject)string_utilities.ZERO_INTEGER; string_utilities.NIL == done && !char_num.numGE(end_var_$10); char_num = number_utilities.f_1X(char_num)) {
                v_char = Strings.sublisp_char(string_var, char_num);
                if (string_utilities.NIL != Characters.digit_char_p(v_char, (SubLObject)string_utilities.UNPROVIDED)) {
                    last_num_index = char_num;
                }
                else {
                    done = (SubLObject)string_utilities.T;
                }
            }
        }
        if (string_utilities.NIL == last_num_index) {
            return (SubLObject)string_utilities.NIL;
        }
        final SubLObject number_string = Sequences.subseq(str, Numbers.subtract(Sequences.length(str), (SubLObject)string_utilities.ONE_INTEGER, last_num_index), (SubLObject)string_utilities.UNPROVIDED);
        final SubLObject number = reader.read_from_string(number_string, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED);
        return number;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 24280L)
    public static SubLObject starts_with(final SubLObject w, final SubLObject starting) {
        return (SubLObject)SubLObjectFactory.makeBoolean(string_utilities.NIL != list_utilities.greater_or_same_length_p(w, starting) && string_utilities.NIL != substring_matchP(w, starting, (SubLObject)string_utilities.ZERO_INTEGER, Symbols.symbol_function((SubLObject)string_utilities.EQUAL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 24505L)
    public static SubLObject starts_with_one_of(final SubLObject string, final SubLObject starting_strings) {
        SubLObject v_boolean = (SubLObject)string_utilities.NIL;
        if (string_utilities.NIL == v_boolean) {
            SubLObject csome_list_var;
            SubLObject s;
            for (csome_list_var = starting_strings, s = (SubLObject)string_utilities.NIL, s = csome_list_var.first(); string_utilities.NIL == v_boolean && string_utilities.NIL != csome_list_var; v_boolean = starts_with(string, s), csome_list_var = csome_list_var.rest(), s = csome_list_var.first()) {}
        }
        return v_boolean;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 24683L)
    public static SubLObject starts_with_by_test(final SubLObject string, final SubLObject starting, SubLObject test) {
        if (test == string_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)string_utilities.EQUALP);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(string_utilities.NIL != list_utilities.greater_or_same_length_p(string, starting) && string_utilities.NIL != substring_matchP(string, starting, (SubLObject)string_utilities.ZERO_INTEGER, test));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 24928L)
    public static SubLObject starts_with_one_of_by_test(final SubLObject string, final SubLObject starting_strings, SubLObject test) {
        if (test == string_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)string_utilities.EQUALP);
        }
        SubLObject v_boolean = (SubLObject)string_utilities.NIL;
        if (string_utilities.NIL == v_boolean) {
            SubLObject csome_list_var;
            SubLObject x;
            for (csome_list_var = starting_strings, x = (SubLObject)string_utilities.NIL, x = csome_list_var.first(); string_utilities.NIL == v_boolean && string_utilities.NIL != csome_list_var; v_boolean = starts_with_by_test(string, x, test), csome_list_var = csome_list_var.rest(), x = csome_list_var.first()) {}
        }
        return v_boolean;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 25153L)
    public static SubLObject starting_string(final SubLObject string, final SubLObject starting_string, SubLObject test) {
        if (test == string_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)string_utilities.EQUALP);
        }
        return (SubLObject)((string_utilities.NIL != starts_with_by_test(string, starting_string, test)) ? starting_string : string_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 25424L)
    public static SubLObject ends_with_start_of(final SubLObject string1, final SubLObject string2, SubLObject test, SubLObject split_strings) {
        if (test == string_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)string_utilities.EQUALP);
        }
        if (split_strings == string_utilities.UNPROVIDED) {
            split_strings = (SubLObject)string_utilities.NIL;
        }
        SubLObject search_starting_points = (SubLObject)ConsesLow.list((SubLObject)string_utilities.ZERO_INTEGER);
        if (string_utilities.NIL != split_strings) {
            SubLObject cdolist_list_var = split_strings;
            SubLObject split_string = (SubLObject)string_utilities.NIL;
            split_string = cdolist_list_var.first();
            while (string_utilities.NIL != cdolist_list_var) {
                final SubLObject this_split_string_length = Sequences.length(split_string);
                SubLObject cdolist_list_var_$11 = search_all(split_string, string1, test, (SubLObject)string_utilities.UNPROVIDED);
                SubLObject search_result = (SubLObject)string_utilities.NIL;
                search_result = cdolist_list_var_$11.first();
                while (string_utilities.NIL != cdolist_list_var_$11) {
                    search_starting_points = (SubLObject)ConsesLow.cons(Numbers.add(search_result, this_split_string_length), search_starting_points);
                    cdolist_list_var_$11 = cdolist_list_var_$11.rest();
                    search_result = cdolist_list_var_$11.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                split_string = cdolist_list_var.first();
            }
            search_starting_points = Sort.sort(search_starting_points, (SubLObject)string_utilities.$sym45$_, (SubLObject)string_utilities.UNPROVIDED);
        }
        else {
            search_starting_points = list_utilities.num_list(Sequences.length(string2), (SubLObject)string_utilities.UNPROVIDED);
        }
        SubLObject cdolist_list_var = search_starting_points;
        SubLObject position = (SubLObject)string_utilities.NIL;
        position = cdolist_list_var.first();
        while (string_utilities.NIL != cdolist_list_var) {
            final SubLObject end_string = substring(string1, position, (SubLObject)string_utilities.UNPROVIDED);
            if (string_utilities.NIL != starting_string(string2, end_string, test)) {
                return end_string;
            }
            cdolist_list_var = cdolist_list_var.rest();
            position = cdolist_list_var.first();
        }
        return (SubLObject)string_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 26985L)
    public static SubLObject number_of_commas(final SubLObject string) {
        SubLObject result = (SubLObject)string_utilities.ZERO_INTEGER;
        SubLObject end_var_$12;
        SubLObject end_var;
        SubLObject char_num;
        SubLObject v_char;
        for (end_var = (end_var_$12 = Sequences.length(string)), char_num = (SubLObject)string_utilities.NIL, char_num = (SubLObject)string_utilities.ZERO_INTEGER; !char_num.numGE(end_var_$12); char_num = number_utilities.f_1X(char_num)) {
            v_char = Strings.sublisp_char(string, char_num);
            if (v_char.eql((SubLObject)Characters.CHAR_comma)) {
                result = Numbers.add(result, (SubLObject)string_utilities.ONE_INTEGER);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 27261L)
    public static SubLObject comma_sub_string(final SubLObject string) {
        SubLObject result = (SubLObject)string_utilities.NIL;
        if (number_of_commas(string).numG((SubLObject)string_utilities.ZERO_INTEGER)) {
            final SubLObject comma_pos_list = search_all((SubLObject)string_utilities.$str48$_, string, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED);
            final SubLObject comma_pos = comma_pos_list.first();
            final SubLObject raw_substring = strip_first_n(string, Numbers.add(comma_pos, (SubLObject)string_utilities.ONE_INTEGER));
            final SubLObject substring = result = Strings.string_left_trim((SubLObject)string_utilities.$str49$__, raw_substring);
            return result;
        }
        return (SubLObject)string_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 27819L)
    public static SubLObject concatenate_adjacent_strings(final SubLObject items) {
        SubLObject new_items = (SubLObject)string_utilities.NIL;
        SubLObject current_string = (SubLObject)string_utilities.NIL;
        SubLObject cdolist_list_var = items;
        SubLObject item = (SubLObject)string_utilities.NIL;
        item = cdolist_list_var.first();
        while (string_utilities.NIL != cdolist_list_var) {
            if (item.isString()) {
                if (string_utilities.NIL != current_string) {
                    current_string = Sequences.cconcatenate(current_string, item);
                }
                else {
                    current_string = item;
                }
            }
            else {
                final SubLObject var = current_string;
                if (string_utilities.NIL != var) {
                    new_items = (SubLObject)ConsesLow.cons(var, new_items);
                }
                new_items = (SubLObject)ConsesLow.cons(item, new_items);
                current_string = (SubLObject)string_utilities.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        }
        final SubLObject var = current_string;
        if (string_utilities.NIL != var) {
            new_items = (SubLObject)ConsesLow.cons(var, new_items);
        }
        return Sequences.nreverse(new_items);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 28373L)
    public static SubLObject string_starts_with_constant_reader_prefix_p(final SubLObject string) {
        assert string_utilities.NIL != Types.stringp(string) : string;
        return starts_with(string, constant_reader.constant_reader_prefix());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 28599L)
    public static SubLObject string_contains_constant_reader_prefix_p(final SubLObject string) {
        assert string_utilities.NIL != Types.stringp(string) : string;
        return substringP(constant_reader.constant_reader_prefix(), string, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 28818L)
    public static SubLObject string_add_constant_reader_prefix(final SubLObject string) {
        assert string_utilities.NIL != Types.stringp(string) : string;
        return Sequences.cconcatenate(constant_reader.constant_reader_prefix(), string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 29030L)
    public static SubLObject string_remove_constant_reader_prefix(final SubLObject string) {
        assert string_utilities.NIL != Types.stringp(string) : string;
        return pre_remove(string, constant_reader.constant_reader_prefix(), (SubLObject)string_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 29244L)
    public static SubLObject string_remove_constant_reader_prefixes(final SubLObject string) {
        assert string_utilities.NIL != Types.stringp(string) : string;
        return string_subst(string_utilities.$empty_string$.getGlobalValue(), constant_reader.constant_reader_prefix(), string, (SubLObject)string_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 29489L)
    public static SubLObject one_is_starting_string(final SubLObject string, final SubLObject starting_strings, SubLObject test) {
        if (test == string_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)string_utilities.EQUALP);
        }
        SubLObject ans = (SubLObject)string_utilities.NIL;
        if (string_utilities.NIL == ans) {
            SubLObject csome_list_var;
            SubLObject x;
            for (csome_list_var = starting_strings, x = (SubLObject)string_utilities.NIL, x = csome_list_var.first(); string_utilities.NIL == ans && string_utilities.NIL != csome_list_var; ans = starting_string(string, x, test), csome_list_var = csome_list_var.rest(), x = csome_list_var.first()) {}
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 29798L)
    public static SubLObject strings_common_prefix(final SubLObject strings, SubLObject key, SubLObject start) {
        if (key == string_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)string_utilities.IDENTITY);
        }
        if (start == string_utilities.UNPROVIDED) {
            start = (SubLObject)string_utilities.ZERO_INTEGER;
        }
        final SubLObject first_string = Functions.funcall(key, strings.first());
        SubLObject rest_strings = strings.rest();
        assert string_utilities.NIL != Types.stringp(first_string) : first_string;
        final SubLObject prefix = first_string;
        final SubLObject prefix_start = start;
        SubLObject prefix_end = Sequences.length(prefix);
        while (!prefix_start.numE(prefix_end) && string_utilities.NIL != rest_strings) {
            final SubLObject next_string = Functions.funcall(key, rest_strings.first());
            assert string_utilities.NIL != Types.stringp(next_string) : next_string;
            rest_strings = rest_strings.rest();
            final SubLObject first_mismatch = Strings.stringNE(prefix, next_string, prefix_start, prefix_end, prefix_start, Sequences.length(next_string));
            if (!first_mismatch.isNumber()) {
                continue;
            }
            prefix_end = first_mismatch;
        }
        return substring(prefix, prefix_start, prefix_end);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 30715L)
    public static SubLObject char_position(final SubLObject v_char, final SubLObject string, SubLObject n) {
        if (n == string_utilities.UNPROVIDED) {
            n = (SubLObject)string_utilities.ZERO_INTEGER;
        }
        return Sequences.position(v_char, string, Symbols.symbol_function((SubLObject)string_utilities.EQL), Symbols.symbol_function((SubLObject)string_utilities.IDENTITY), n, (SubLObject)string_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 30939L)
    public static SubLObject string_upto(final SubLObject string, SubLObject v_char) {
        if (v_char == string_utilities.UNPROVIDED) {
            v_char = (SubLObject)Characters.CHAR_space;
        }
        final SubLObject pos = char_position(v_char, string, (SubLObject)string_utilities.UNPROVIDED);
        if (string_utilities.NIL != pos) {
            return Sequences.subseq(string, (SubLObject)string_utilities.ZERO_INTEGER, pos);
        }
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 31099L)
    public static SubLObject string_after(final SubLObject string, SubLObject v_char) {
        if (v_char == string_utilities.UNPROVIDED) {
            v_char = (SubLObject)Characters.CHAR_space;
        }
        final SubLObject pos = char_position(v_char, string, (SubLObject)string_utilities.UNPROVIDED);
        if (string_utilities.NIL != pos) {
            return Sequences.subseq(string, Numbers.add(pos, (SubLObject)string_utilities.ONE_INTEGER), (SubLObject)string_utilities.UNPROVIDED);
        }
        return string_utilities.$empty_string$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 31272L)
    public static SubLObject string_between(final SubLObject string, SubLObject between_chars, SubLObject start) {
        if (between_chars == string_utilities.UNPROVIDED) {
            between_chars = (SubLObject)string_utilities.$list50;
        }
        if (start == string_utilities.UNPROVIDED) {
            start = (SubLObject)string_utilities.ZERO_INTEGER;
        }
        final SubLObject start_pos = char_position(between_chars.first(), string, start);
        final SubLObject end_pos = (SubLObject)((string_utilities.NIL != start_pos) ? char_position(conses_high.cadr(between_chars), string, start_pos) : string_utilities.NIL);
        if (string_utilities.NIL != end_pos && end_pos.numL(Sequences.length(string))) {
            return Sequences.subseq(string, Numbers.add((SubLObject)string_utilities.ONE_INTEGER, start_pos), end_pos);
        }
        return (SubLObject)string_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 31890L)
    public static SubLObject get_substring_between_tags(final SubLObject string, final SubLObject start_tag, final SubLObject end_tag, SubLObject start_pos, SubLObject end_pos) {
        if (start_pos == string_utilities.UNPROVIDED) {
            start_pos = (SubLObject)string_utilities.ZERO_INTEGER;
        }
        if (end_pos == string_utilities.UNPROVIDED) {
            end_pos = (SubLObject)string_utilities.NIL;
        }
        SubLObject data_string = (SubLObject)string_utilities.NIL;
        SubLObject test_pos = (SubLObject)string_utilities.NIL;
        start_pos = Sequences.search(start_tag, string, Symbols.symbol_function((SubLObject)string_utilities.EQL), Symbols.symbol_function((SubLObject)string_utilities.IDENTITY), (SubLObject)string_utilities.ZERO_INTEGER, (SubLObject)string_utilities.NIL, start_pos, end_pos);
        if (string_utilities.NIL == start_pos) {
            return Values.values((SubLObject)string_utilities.NIL, (SubLObject)string_utilities.NIL);
        }
        if (string_utilities.NIL != end_tag) {
            test_pos = Sequences.search(end_tag, string, Symbols.symbol_function((SubLObject)string_utilities.EQL), Symbols.symbol_function((SubLObject)string_utilities.IDENTITY), (SubLObject)string_utilities.ZERO_INTEGER, (SubLObject)string_utilities.NIL, Numbers.add(Sequences.length(start_tag), start_pos), end_pos);
        }
        if (string_utilities.NIL == test_pos) {
            return Values.values((SubLObject)string_utilities.NIL, (SubLObject)string_utilities.NIL);
        }
        end_pos = get_end_pos(end_tag, test_pos, end_pos, Sequences.length(string));
        data_string = substring(string, Numbers.add(start_pos, Sequences.length(start_tag)), end_pos);
        return Values.values(data_string, end_pos);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 33050L)
    public static SubLObject get_substring_between_tags_list(final SubLObject string, final SubLObject start_tag, final SubLObject end_tag, SubLObject start_pos, SubLObject end_pos) {
        if (start_pos == string_utilities.UNPROVIDED) {
            start_pos = (SubLObject)string_utilities.ZERO_INTEGER;
        }
        if (end_pos == string_utilities.UNPROVIDED) {
            end_pos = (SubLObject)string_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject data_string = get_substring_between_tags(string, start_tag, end_tag, start_pos, end_pos);
        final SubLObject test_pos = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return (SubLObject)ConsesLow.list(data_string, test_pos);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 33381L)
    public static SubLObject get_end_pos(final SubLObject end_tag, final SubLObject true_end, final SubLObject arg_end, final SubLObject string_end) {
        return (string_utilities.NIL != true_end && string_utilities.NIL != end_tag) ? true_end : ((string_utilities.NIL != arg_end) ? arg_end : string_end);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 33610L)
    public static SubLObject strip_header(final SubLObject string, final SubLObject header) {
        if (string_utilities.NIL != starts_with(string, header)) {
            return Sequences.subseq(string, Sequences.length(header), (SubLObject)string_utilities.UNPROVIDED);
        }
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 33750L)
    public static SubLObject strip_trailer(final SubLObject string, final SubLObject trailer) {
        if (string_utilities.NIL != ends_with(string, trailer, (SubLObject)string_utilities.UNPROVIDED)) {
            return Sequences.subseq(string, (SubLObject)string_utilities.ZERO_INTEGER, Numbers.subtract(Sequences.length(string), Sequences.length(trailer)));
        }
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 33913L)
    public static SubLObject strip_first(final SubLObject string) {
        if (Sequences.length(string).numG((SubLObject)string_utilities.ZERO_INTEGER)) {
            return Sequences.subseq(string, (SubLObject)string_utilities.ONE_INTEGER, Sequences.length(string));
        }
        return (SubLObject)string_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 34072L)
    public static SubLObject strip_final(final SubLObject string, SubLObject n) {
        if (n == string_utilities.UNPROVIDED) {
            n = (SubLObject)string_utilities.ONE_INTEGER;
        }
        if (string_utilities.NIL != list_utilities.lengthGE(string, n, (SubLObject)string_utilities.UNPROVIDED)) {
            return Sequences.subseq(string, (SubLObject)string_utilities.ZERO_INTEGER, Numbers.subtract(Sequences.length(string), n));
        }
        return (SubLObject)string_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 34254L)
    public static SubLObject strip_first_if_char(final SubLObject string, final SubLObject v_char) {
        if (Sequences.length(string).numG((SubLObject)string_utilities.ZERO_INTEGER) && string_utilities.NIL != Characters.charE(v_char, Strings.sublisp_char(string, (SubLObject)string_utilities.ZERO_INTEGER))) {
            return Sequences.subseq(string, (SubLObject)string_utilities.ONE_INTEGER, Sequences.length(string));
        }
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 34439L)
    public static SubLObject strip_final_if_char(final SubLObject string, final SubLObject v_char) {
        if (Sequences.length(string).numG((SubLObject)string_utilities.ZERO_INTEGER) && string_utilities.NIL != Characters.charE(v_char, Strings.sublisp_char(string, Numbers.subtract(Sequences.length(string), (SubLObject)string_utilities.ONE_INTEGER)))) {
            return Sequences.subseq(string, (SubLObject)string_utilities.ZERO_INTEGER, Numbers.subtract(Sequences.length(string), (SubLObject)string_utilities.ONE_INTEGER));
        }
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 34650L)
    public static SubLObject strip_first_n(final SubLObject string, final SubLObject n) {
        final SubLObject length_of_string = Sequences.length(string);
        if (length_of_string.numGE(n)) {
            return Sequences.subseq(string, n, length_of_string);
        }
        return (SubLObject)string_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 34870L)
    public static SubLObject strip_final_n(final SubLObject string, final SubLObject n) {
        final SubLObject length_of_string = Sequences.length(string);
        if (length_of_string.numGE(n)) {
            return Sequences.subseq(string, (SubLObject)string_utilities.ZERO_INTEGER, Numbers.subtract(length_of_string, n));
        }
        return (SubLObject)string_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 35095L)
    public static SubLObject strip_punctuation(SubLObject string) {
        while (string_utilities.NIL != non_empty_string_p(string) && string_utilities.NIL != punctuation_p(first_char(string))) {
            string = strip_first(string);
        }
        while (string_utilities.NIL != non_empty_string_p(string) && string_utilities.NIL != punctuation_p(last_char(string))) {
            string = strip_final(string, (SubLObject)string_utilities.UNPROVIDED);
        }
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 35501L)
    public static SubLObject strip_sentential_punctuation(final SubLObject sentence_string) {
        if (string_utilities.NIL != ends_with_one_of(sentence_string, (SubLObject)string_utilities.$list51)) {
            return strip_final(sentence_string, (SubLObject)string_utilities.UNPROVIDED);
        }
        return sentence_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 35749L)
    public static SubLObject ends_in_geminateP(final SubLObject string) {
        final SubLObject last_n = Numbers.subtract(Sequences.length(string), (SubLObject)string_utilities.ONE_INTEGER);
        final SubLObject second_last_n = Numbers.subtract(Sequences.length(string), (SubLObject)string_utilities.TWO_INTEGER);
        if (last_n.numG((SubLObject)string_utilities.ZERO_INTEGER) && Vectors.aref(string, last_n).eql(Vectors.aref(string, second_last_n))) {
            return (SubLObject)string_utilities.T;
        }
        return (SubLObject)string_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 36113L)
    public static SubLObject null_stringP(final SubLObject v_object) {
        return empty_string_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 36177L)
    public static SubLObject non_empty_stringP(final SubLObject v_object) {
        return non_empty_subl_stringP(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 36437L)
    public static SubLObject non_empty_cycl_stringP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(string_utilities.NIL != cycl_string.cycl_string_p(v_object) && string_utilities.NIL == empty_string_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 36554L)
    public static SubLObject non_empty_subl_stringP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isString() && string_utilities.NIL == empty_string_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 36748L)
    public static SubLObject char_set_position(final SubLObject char_set, final SubLObject string, SubLObject start, SubLObject end) {
        if (start == string_utilities.UNPROVIDED) {
            start = (SubLObject)string_utilities.ZERO_INTEGER;
        }
        if (end == string_utilities.UNPROVIDED) {
            end = (SubLObject)string_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert string_utilities.NIL != Types.stringp(string) : string;
        SubLObject ans = (SubLObject)string_utilities.NIL;
        final SubLObject _prev_bind_0 = string_utilities.$char_set$.currentBinding(thread);
        try {
            string_utilities.$char_set$.bind(char_set, thread);
            ans = Sequences.position_if(Symbols.symbol_function((SubLObject)string_utilities.$sym53$CHAR_IN_CHAR_SET), string, Symbols.symbol_function((SubLObject)string_utilities.IDENTITY), start, end);
        }
        finally {
            string_utilities.$char_set$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 37192L)
    public static SubLObject char_type_position(final SubLObject char_type, final SubLObject string, SubLObject start, SubLObject end) {
        if (start == string_utilities.UNPROVIDED) {
            start = (SubLObject)string_utilities.ZERO_INTEGER;
        }
        if (end == string_utilities.UNPROVIDED) {
            end = (SubLObject)string_utilities.NIL;
        }
        assert string_utilities.NIL != Types.stringp(string) : string;
        return Sequences.position_if(char_type, string, Symbols.symbol_function((SubLObject)string_utilities.IDENTITY), start, end);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 37505L)
    public static SubLObject space_p(final SubLObject v_object) {
        return Equality.eql(string_utilities.$space_char$.getGlobalValue(), v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 37573L)
    public static SubLObject non_space_char_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isChar() && string_utilities.NIL == space_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 37681L)
    public static SubLObject tab_p(final SubLObject v_object) {
        return Equality.eql(string_utilities.$tab_char$.getGlobalValue(), v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 37745L)
    public static SubLObject non_tab_char_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isChar() && string_utilities.NIL == tab_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 37849L)
    public static SubLObject not_digit_char_p(final SubLObject thing) {
        return (SubLObject)SubLObjectFactory.makeBoolean(string_utilities.NIL == Characters.digit_char_p(thing, (SubLObject)string_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 37920L)
    public static SubLObject isa_digit_charP(final SubLObject thing) {
        return (SubLObject)SubLObjectFactory.makeBoolean(thing.isChar() && string_utilities.NIL != Characters.digit_char_p(thing, (SubLObject)string_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 38015L)
    public static SubLObject digit_stringP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isString() && string_utilities.NIL == list_utilities.find_if_not((SubLObject)string_utilities.$sym54$DIGIT_CHAR_P, v_object, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 38222L)
    public static SubLObject alphanumeric_stringP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isString() && string_utilities.NIL == list_utilities.find_if_not((SubLObject)string_utilities.$sym55$ALPHANUMERICP, v_object, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 38437L)
    public static SubLObject alphanumeric_char_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isChar() && string_utilities.NIL != Characters.alphanumericp(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 38547L)
    public static SubLObject alphabetic_char_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isChar() && string_utilities.NIL != Characters.alpha_char_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 38654L)
    public static SubLObject partially_numeric_stringP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isString() && string_utilities.NIL != Sequences.find_if((SubLObject)string_utilities.$sym54$DIGIT_CHAR_P, v_object, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 38775L)
    public static SubLObject alphabetic_stringP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isString() && string_utilities.NIL != Sequences.find_if((SubLObject)string_utilities.$sym56$ALPHA_CHAR_P, v_object, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 38987L)
    public static SubLObject non_alphabetic_stringP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isString() && string_utilities.NIL == Sequences.find_if((SubLObject)string_utilities.$sym56$ALPHA_CHAR_P, v_object, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 39214L)
    public static SubLObject is_numericP(final SubLObject string) {
        return collection_defns.cyc_numeric_string(trim_whitespace(string));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 39444L)
    public static SubLObject is_numeric_rangeP(final SubLObject string) {
        return parse_numeric_range(string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 39754L)
    public static SubLObject parse_numeric_range(final SubLObject string) {
        SubLObject numeric_list = (SubLObject)string_utilities.NIL;
        SubLObject num_list = (SubLObject)string_utilities.NIL;
        if (string_utilities.NIL != char_position((SubLObject)Characters.CHAR_hyphen, string, (SubLObject)string_utilities.UNPROVIDED)) {
            numeric_list = string_tokenize(string, (SubLObject)string_utilities.$list57, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED);
            if (!Sequences.length(num_list).numE((SubLObject)string_utilities.TWO_INTEGER)) {
                num_list = (SubLObject)string_utilities.NIL;
            }
        }
        else if (string_utilities.NIL != char_position((SubLObject)Characters.CHAR_comma, string, (SubLObject)string_utilities.UNPROVIDED)) {
            numeric_list = string_tokenize(string, (SubLObject)string_utilities.$list58, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED);
        }
        else if (string_utilities.NIL != is_numericP(string)) {
            numeric_list = (SubLObject)ConsesLow.list(string);
        }
        if (string_utilities.NIL != numeric_list && string_utilities.NIL != list_utilities.every_in_list(Symbols.symbol_function((SubLObject)string_utilities.$sym59$IS_NUMERIC_), numeric_list, (SubLObject)string_utilities.UNPROVIDED)) {
            num_list = Mapping.mapcar(Symbols.symbol_function((SubLObject)string_utilities.$sym60$PARSE_INTEGER), numeric_list);
        }
        return num_list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 40715L)
    public static SubLObject ordinal(final SubLObject cardinal) {
        return PrintLow.format((SubLObject)string_utilities.NIL, (SubLObject)string_utilities.$str61$__R, cardinal);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 40890L)
    public static SubLObject english_ordinal_number_string_p(final SubLObject string) {
        final SubLObject possibly_ordinal_numberP = ends_with_one_of(string, (SubLObject)string_utilities.$list62);
        return (SubLObject)((string_utilities.NIL != possibly_ordinal_numberP) ? number_utilities.number_string_p(english_ordinal_string_to_cardinal_string(string)) : string_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 41218L)
    public static SubLObject english_ordinal_string_to_cardinal_string(final SubLObject string) {
        return strip_final_n(string, (SubLObject)string_utilities.TWO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 41322L)
    public static SubLObject integer_suffix(final SubLObject string) {
        SubLObject last_digit_pos = (SubLObject)string_utilities.NIL;
        SubLObject doneP;
        SubLObject i;
        SubLObject v_char;
        for (doneP = (SubLObject)string_utilities.NIL, i = (SubLObject)string_utilities.NIL, i = Numbers.subtract(Sequences.length(string), (SubLObject)string_utilities.ONE_INTEGER); string_utilities.NIL == doneP && !i.numL((SubLObject)string_utilities.ZERO_INTEGER); i = Numbers.subtract(i, (SubLObject)string_utilities.ONE_INTEGER)) {
            v_char = Vectors.aref(string, i);
            if (string_utilities.NIL != Characters.digit_char_p(v_char, (SubLObject)string_utilities.UNPROVIDED)) {
                last_digit_pos = i;
            }
            else {
                doneP = (SubLObject)string_utilities.T;
            }
        }
        if (last_digit_pos.isInteger()) {
            return string_to_integer(Sequences.subseq(string, last_digit_pos, (SubLObject)string_utilities.UNPROVIDED));
        }
        return (SubLObject)string_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 43153L)
    public static SubLObject set_nth_char(final SubLObject n, final SubLObject string, final SubLObject new_char, SubLObject safeP) {
        if (safeP == string_utilities.UNPROVIDED) {
            safeP = (SubLObject)string_utilities.T;
        }
        if (string_utilities.NIL != safeP) {
            assert string_utilities.NIL != Types.stringp(string) : string;
            assert string_utilities.NIL != subl_promotions.non_negative_integer_p(n) : n;
            assert string_utilities.NIL != Types.characterp(new_char) : new_char;
        }
        if (string_utilities.NIL == safeP || string_utilities.NIL != list_utilities.lengthG(string, n, (SubLObject)string_utilities.UNPROVIDED)) {
            Strings.set_char(string, n, new_char);
        }
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 43622L)
    public static SubLObject strip_chars_meeting_test(final SubLObject string, SubLObject test) {
        if (test == string_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)string_utilities.$sym63$CONTROL_CHAR_P);
        }
        return substitute_char_if(string, (SubLObject)Characters.CHAR_space, test);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 43865L)
    public static SubLObject substitute_char_if(final SubLObject string, final SubLObject new_char, SubLObject test) {
        if (test == string_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)string_utilities.$sym63$CONTROL_CHAR_P);
        }
        assert string_utilities.NIL != Types.stringp(string) : string;
        final SubLObject string_var;
        final SubLObject output_string = string_var = copy_string(string);
        SubLObject end_var_$13;
        SubLObject end_var;
        SubLObject i;
        SubLObject ch;
        for (end_var = (end_var_$13 = Sequences.length(string_var)), i = (SubLObject)string_utilities.NIL, i = (SubLObject)string_utilities.ZERO_INTEGER; !i.numGE(end_var_$13); i = number_utilities.f_1X(i)) {
            ch = Strings.sublisp_char(string_var, i);
            if (string_utilities.NIL != Functions.funcall(test, ch)) {
                set_nth_char(i, output_string, new_char, (SubLObject)string_utilities.UNPROVIDED);
            }
        }
        return output_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 44285L)
    public static SubLObject string_wXo_control_charsP(final SubLObject string) {
        return (SubLObject)SubLObjectFactory.makeBoolean(string.isString() && string_utilities.NIL == Sequences.find_if(Symbols.symbol_function((SubLObject)string_utilities.$sym63$CONTROL_CHAR_P), string, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 44500L)
    public static SubLObject control_char_p(final SubLObject v_char) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_char.isChar() && Characters.char_code(v_char).numL((SubLObject)string_utilities.$int64$32));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 44657L)
    public static SubLObject utf_8_combining_character_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isChar() && Characters.char_code(v_object).numGE((SubLObject)string_utilities.$int65$128));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 44887L)
    public static SubLObject integer_char_p(final SubLObject v_char) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_char.isChar() && string_utilities.NIL != Characters.digit_char_p(v_char, (SubLObject)string_utilities.TEN_INTEGER));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 45044L)
    public static SubLObject contains_charP(final SubLObject string, final SubLObject v_char) {
        return (SubLObject)SubLObjectFactory.makeBoolean(string_utilities.NIL != Sequences.position(v_char, string, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 45128L)
    public static SubLObject char_in_char_set(final SubLObject v_char) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Sequences.find(v_char, string_utilities.$char_set$.getDynamicValue(thread), (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 45193L)
    public static SubLObject split_string(final SubLObject string, SubLObject char_set) {
        if (char_set == string_utilities.UNPROVIDED) {
            char_set = (SubLObject)string_utilities.$list66;
        }
        SubLObject ans = (SubLObject)string_utilities.NIL;
        SubLObject previous;
        SubLObject position;
        for (previous = (SubLObject)string_utilities.NIL, position = (SubLObject)string_utilities.NIL, previous = (SubLObject)string_utilities.NIL, position = char_set_position(char_set, string, (SubLObject)string_utilities.ZERO_INTEGER, (SubLObject)string_utilities.UNPROVIDED); string_utilities.NIL != position; position = char_set_position(char_set, string, Numbers.add(previous, (SubLObject)string_utilities.ONE_INTEGER), (SubLObject)string_utilities.UNPROVIDED)) {
            ans = (SubLObject)ConsesLow.cons(substring(string, (SubLObject)((string_utilities.NIL != previous) ? Numbers.add(previous, (SubLObject)string_utilities.ONE_INTEGER) : string_utilities.ZERO_INTEGER), position), ans);
            previous = position;
        }
        if (string_utilities.NIL != previous) {
            ans = (SubLObject)ConsesLow.cons(substring(string, Numbers.add(previous, (SubLObject)string_utilities.ONE_INTEGER), (SubLObject)string_utilities.UNPROVIDED), ans);
        }
        else {
            ans = (SubLObject)ConsesLow.list(string);
        }
        return Sequences.nreverse(ans);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 45652L)
    public static SubLObject split_string_on_string(final SubLObject string, final SubLObject delimiter) {
        SubLObject ans = (SubLObject)string_utilities.NIL;
        SubLObject remaining = string;
        for (SubLObject pos = Sequences.search(delimiter, remaining, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED); string_utilities.NIL != pos; pos = Sequences.search(delimiter, remaining, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED)) {
            ans = (SubLObject)ConsesLow.cons(substring(remaining, (SubLObject)string_utilities.ZERO_INTEGER, pos), ans);
            remaining = substring(remaining, Numbers.add(pos, Sequences.length(delimiter)), (SubLObject)string_utilities.UNPROVIDED);
        }
        ans = (SubLObject)ConsesLow.cons(remaining, ans);
        remaining = (SubLObject)string_utilities.NIL;
        return Sequences.nreverse(ans);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 46261L)
    public static SubLObject string_rotations(final SubLObject string, SubLObject stoplist_trie, SubLObject rotate_about, SubLObject rotate_insert, SubLObject valid_rotation_start_test) {
        if (stoplist_trie == string_utilities.UNPROVIDED) {
            stoplist_trie = (SubLObject)string_utilities.NIL;
        }
        if (rotate_about == string_utilities.UNPROVIDED) {
            rotate_about = (SubLObject)string_utilities.$list66;
        }
        if (rotate_insert == string_utilities.UNPROVIDED) {
            rotate_insert = (SubLObject)string_utilities.$str49$__;
        }
        if (valid_rotation_start_test == string_utilities.UNPROVIDED) {
            valid_rotation_start_test = Symbols.symbol_function((SubLObject)string_utilities.$sym56$ALPHA_CHAR_P);
        }
        assert string_utilities.NIL != Types.stringp(string) : string;
        assert string_utilities.NIL != Types.stringp(rotate_insert) : rotate_insert;
        SubLObject answers = (SubLObject)string_utilities.NIL;
        SubLObject previous;
        SubLObject position;
        SubLObject rotation;
        for (previous = (SubLObject)string_utilities.NIL, position = (SubLObject)string_utilities.NIL, previous = (SubLObject)string_utilities.NIL, position = char_set_position(rotate_about, string, (SubLObject)string_utilities.ZERO_INTEGER, (SubLObject)string_utilities.UNPROVIDED); string_utilities.NIL != position; position = char_set_position(rotate_about, string, Numbers.add(previous, (SubLObject)string_utilities.ONE_INTEGER), (SubLObject)string_utilities.UNPROVIDED)) {
            rotation = string_rotation_int(string, Numbers.add(position, (SubLObject)string_utilities.ONE_INTEGER), stoplist_trie, rotate_about, rotate_insert, valid_rotation_start_test);
            if (string_utilities.NIL != rotation) {
                answers = (SubLObject)ConsesLow.cons(rotation, answers);
            }
            previous = position;
        }
        return Sequences.nreverse(answers);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 47178L)
    public static SubLObject string_rotation_int(final SubLObject string, SubLObject position, final SubLObject stoplist_trie, final SubLObject rotate_about, final SubLObject rotate_insert, final SubLObject valid_rotation_start_test) {
        final SubLObject strlen = Sequences.length(string);
        final SubLObject rotlen = Sequences.length(rotate_insert);
        final SubLObject endlen = Numbers.subtract(Sequences.length(string), position);
        final SubLObject prelen = Numbers.add(endlen, rotlen);
        if (position.numGE(strlen)) {
            return (SubLObject)string_utilities.NIL;
        }
        if (string_utilities.NIL == Functions.funcall(valid_rotation_start_test, Strings.sublisp_char(string, position))) {
            return (SubLObject)string_utilities.NIL;
        }
        if (string_utilities.NIL != tries.trie_p(stoplist_trie)) {
            final SubLObject next_position = char_set_position(rotate_about, string, Numbers.add(position, (SubLObject)string_utilities.ONE_INTEGER), (SubLObject)string_utilities.UNPROVIDED);
            if (string_utilities.NIL != tries.trie_exact(stoplist_trie, string, (SubLObject)string_utilities.NIL, position, next_position)) {
                return (SubLObject)string_utilities.NIL;
            }
        }
        final SubLObject rotated_string = Strings.make_string(Numbers.subtract(Numbers.add(strlen, rotlen), (SubLObject)string_utilities.ONE_INTEGER), (SubLObject)string_utilities.UNPROVIDED);
        Sequences.replace(rotated_string, string, (SubLObject)string_utilities.ZERO_INTEGER, endlen, position, (SubLObject)string_utilities.NIL);
        Sequences.replace(rotated_string, rotate_insert, endlen, prelen, (SubLObject)string_utilities.ZERO_INTEGER, (SubLObject)string_utilities.NIL);
        Sequences.replace(rotated_string, string, prelen, (SubLObject)string_utilities.NIL, (SubLObject)string_utilities.ZERO_INTEGER, position);
        return rotated_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 48269L)
    public static SubLObject substringP(final SubLObject little, final SubLObject big, SubLObject test, SubLObject start_index, SubLObject end_index) {
        if (test == string_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)string_utilities.EQUALP);
        }
        if (start_index == string_utilities.UNPROVIDED) {
            start_index = (SubLObject)string_utilities.ZERO_INTEGER;
        }
        if (end_index == string_utilities.UNPROVIDED) {
            end_index = (SubLObject)string_utilities.NIL;
        }
        if (!little.isString() || !big.isString()) {
            return (SubLObject)string_utilities.NIL;
        }
        if (string_utilities.NIL != list_utilities.lengthE(little, (SubLObject)string_utilities.ONE_INTEGER, (SubLObject)string_utilities.UNPROVIDED)) {
            return Sequences.find(first_char(little), big, test, Symbols.symbol_function((SubLObject)string_utilities.IDENTITY), start_index, end_index);
        }
        return Sequences.search(little, big, test, Symbols.symbol_function((SubLObject)string_utilities.IDENTITY), (SubLObject)string_utilities.ZERO_INTEGER, (SubLObject)string_utilities.NIL, start_index, end_index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 48961L)
    public static SubLObject superstringP(final SubLObject big, final SubLObject little, SubLObject test, SubLObject start_index) {
        if (test == string_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)string_utilities.EQUALP);
        }
        if (start_index == string_utilities.UNPROVIDED) {
            start_index = (SubLObject)string_utilities.ZERO_INTEGER;
        }
        return substringP(little, big, test, start_index, (SubLObject)string_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 49155L)
    public static SubLObject proper_superstringP(final SubLObject big, final SubLObject little, SubLObject test, SubLObject start_index) {
        if (test == string_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)string_utilities.EQUALP);
        }
        if (start_index == string_utilities.UNPROVIDED) {
            start_index = (SubLObject)string_utilities.ZERO_INTEGER;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(string_utilities.NIL == Functions.funcall(test, big, little) && string_utilities.NIL != substringP(little, big, test, start_index, (SubLObject)string_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 49421L)
    public static SubLObject substring_matchP(final SubLObject big, final SubLObject little, final SubLObject start, SubLObject test) {
        if (test == string_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)string_utilities.EQUAL);
        }
        final SubLObject end = Numbers.add(start, Sequences.length(little));
        return (SubLObject)SubLObjectFactory.makeBoolean(string_utilities.NIL != list_utilities.lengthGE(big, end, (SubLObject)string_utilities.UNPROVIDED) && string_utilities.NIL != substringP(little, big, test, start, end));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 49882L)
    public static SubLObject search_all(final SubLObject seq1, final SubLObject seq2, SubLObject test, SubLObject key) {
        if (test == string_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)string_utilities.EQL);
        }
        if (key == string_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)string_utilities.IDENTITY);
        }
        final SubLObject seq2_length = Sequences.length(seq2);
        SubLObject index = (SubLObject)string_utilities.ZERO_INTEGER;
        SubLObject doneP = (SubLObject)string_utilities.NIL;
        SubLObject result = (SubLObject)string_utilities.NIL;
        while (index.numLE(seq2_length) && string_utilities.NIL == doneP) {
            final SubLObject position = Sequences.search(seq1, seq2, test, key, (SubLObject)string_utilities.ZERO_INTEGER, (SubLObject)string_utilities.NIL, index, (SubLObject)string_utilities.UNPROVIDED);
            if (string_utilities.NIL != position) {
                result = (SubLObject)ConsesLow.cons(position, result);
                index = number_utilities.f_1X(position);
            }
            else {
                doneP = (SubLObject)string_utilities.T;
            }
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 50563L)
    public static SubLObject count_matches(final SubLObject seq1, final SubLObject seq2, SubLObject test, SubLObject key) {
        if (test == string_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)string_utilities.EQL);
        }
        if (key == string_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)string_utilities.IDENTITY);
        }
        final SubLObject seq2_length = Sequences.length(seq2);
        SubLObject index = (SubLObject)string_utilities.ZERO_INTEGER;
        SubLObject result = (SubLObject)string_utilities.ZERO_INTEGER;
        SubLObject doneP = (SubLObject)string_utilities.NIL;
        if (string_utilities.NIL != empty_string_p(seq1)) {
            return number_utilities.f_1X(seq2_length);
        }
        while (index.numLE(seq2_length) && string_utilities.NIL == doneP) {
            final SubLObject position = Sequences.search(seq1, seq2, test, key, (SubLObject)string_utilities.ZERO_INTEGER, (SubLObject)string_utilities.NIL, index, (SubLObject)string_utilities.UNPROVIDED);
            if (string_utilities.NIL != position) {
                result = Numbers.add(result, (SubLObject)string_utilities.ONE_INTEGER);
                index = number_utilities.f_1X(position);
            }
            else {
                doneP = (SubLObject)string_utilities.T;
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 51286L)
    public static SubLObject subwordP(final SubLObject substring, final SubLObject string, SubLObject charseq, SubLObject test) {
        if (charseq == string_utilities.UNPROVIDED) {
            charseq = (SubLObject)string_utilities.NIL;
        }
        if (test == string_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)string_utilities.EQUALP);
        }
        SubLObject i;
        for (i = (SubLObject)string_utilities.NIL, i = (SubLObject)string_utilities.ZERO_INTEGER; string_utilities.NIL == list_utilities.lengthLE(substring, i, (SubLObject)string_utilities.UNPROVIDED) && string_utilities.NIL != Sequences.find(Strings.sublisp_char(substring, i), charseq, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED); i = Numbers.add(i, (SubLObject)string_utilities.ONE_INTEGER)) {}
        SubLObject mod_sub;
        for (mod_sub = substring(substring, i, (SubLObject)string_utilities.UNPROVIDED), i = (SubLObject)string_utilities.NIL, i = Numbers.subtract(Sequences.length(mod_sub), (SubLObject)string_utilities.ONE_INTEGER); !i.numLE((SubLObject)string_utilities.ZERO_INTEGER) && string_utilities.NIL != Sequences.find(Strings.sublisp_char(mod_sub, i), charseq, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED); i = Numbers.subtract(i, (SubLObject)string_utilities.ONE_INTEGER)) {}
        mod_sub = substring(mod_sub, (SubLObject)string_utilities.ZERO_INTEGER, number_utilities.f_1X(i));
        if (string_utilities.NIL != null_stringP(string) || string_utilities.NIL != null_stringP(mod_sub)) {
            return (SubLObject)string_utilities.NIL;
        }
        final SubLObject strend = Sequences.length(string);
        final SubLObject subend = Sequences.length(mod_sub);
        SubLObject retval = (SubLObject)string_utilities.NIL;
        SubLObject temp = (SubLObject)string_utilities.NIL;
        SubLObject start = (SubLObject)string_utilities.NIL;
        SubLObject end = (SubLObject)string_utilities.NIL;
        temp = Sequences.search(mod_sub, string, test, Symbols.symbol_function((SubLObject)string_utilities.IDENTITY), (SubLObject)string_utilities.ZERO_INTEGER, subend, (SubLObject)string_utilities.ZERO_INTEGER, strend);
        start = ((string_utilities.NIL != temp) ? temp : strend);
        end = Numbers.add(subend, start);
        while (!start.numGE(strend)) {
            retval = (SubLObject)SubLObjectFactory.makeBoolean(string_utilities.NIL != (start.numE((SubLObject)string_utilities.ZERO_INTEGER) ? string_utilities.T : SubLObjectFactory.makeBoolean(string_utilities.NIL != Sequences.find(Strings.sublisp_char(string, Numbers.subtract(start, (SubLObject)string_utilities.ONE_INTEGER)), charseq, test, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED) || string_utilities.NIL != whitespacep(Strings.sublisp_char(string, Numbers.subtract(start, (SubLObject)string_utilities.ONE_INTEGER))))) && string_utilities.NIL != (end.numE(strend) ? string_utilities.T : SubLObjectFactory.makeBoolean(string_utilities.NIL != Sequences.find(Strings.sublisp_char(string, end), charseq, test, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED) || string_utilities.NIL != whitespacep(Strings.sublisp_char(string, end)))));
            if (string_utilities.NIL != retval) {
                return (SubLObject)string_utilities.T;
            }
            temp = Sequences.search(mod_sub, string, test, Symbols.symbol_function((SubLObject)string_utilities.IDENTITY), (SubLObject)string_utilities.ZERO_INTEGER, subend, end, strend);
            start = ((string_utilities.NIL != temp) ? temp : strend);
            end = Numbers.add(subend, start);
        }
        return retval;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 52870L)
    public static SubLObject bunge(SubLObject strings, SubLObject v_char) {
        if (v_char == string_utilities.UNPROVIDED) {
            v_char = (SubLObject)Characters.CHAR_space;
        }
        assert string_utilities.NIL != Types.characterp(v_char) : v_char;
        strings = Sequences.delete(string_utilities.$empty_string$.getGlobalValue(), Sequences.delete((SubLObject)string_utilities.NIL, strings, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED), Symbols.symbol_function((SubLObject)string_utilities.EQUAL), (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED);
        final SubLObject num_strings = Sequences.length(strings);
        if (num_strings.numE((SubLObject)string_utilities.ZERO_INTEGER)) {
            return string_utilities.$empty_string$.getGlobalValue();
        }
        if (num_strings.numE((SubLObject)string_utilities.ONE_INTEGER)) {
            return strings.first();
        }
        SubLObject total_length = (SubLObject)string_utilities.ZERO_INTEGER;
        SubLObject cdolist_list_var = strings;
        SubLObject string = (SubLObject)string_utilities.NIL;
        string = cdolist_list_var.first();
        while (string_utilities.NIL != cdolist_list_var) {
            total_length = Numbers.add(total_length, Sequences.length(string));
            cdolist_list_var = cdolist_list_var.rest();
            string = cdolist_list_var.first();
        }
        total_length = Numbers.add(total_length, Numbers.subtract(num_strings, (SubLObject)string_utilities.ONE_INTEGER));
        final SubLObject new_string = Strings.make_string(total_length, v_char);
        SubLObject index = (SubLObject)string_utilities.ZERO_INTEGER;
        Sequences.replace(new_string, strings.first(), index, (SubLObject)string_utilities.NIL, (SubLObject)string_utilities.ZERO_INTEGER, (SubLObject)string_utilities.NIL);
        index = Numbers.add(index, Sequences.length(strings.first()));
        SubLObject cdolist_list_var2 = strings.rest();
        SubLObject string2 = (SubLObject)string_utilities.NIL;
        string2 = cdolist_list_var2.first();
        while (string_utilities.NIL != cdolist_list_var2) {
            index = Numbers.add(index, (SubLObject)string_utilities.ONE_INTEGER);
            Sequences.replace(new_string, string2, index, (SubLObject)string_utilities.NIL, (SubLObject)string_utilities.ZERO_INTEGER, (SubLObject)string_utilities.NIL);
            index = Numbers.add(index, Sequences.length(string2));
            cdolist_list_var2 = cdolist_list_var2.rest();
            string2 = cdolist_list_var2.first();
        }
        return new_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 53993L)
    public static SubLObject bunge_with_string(SubLObject strings, SubLObject spacer) {
        if (spacer == string_utilities.UNPROVIDED) {
            spacer = (SubLObject)string_utilities.$str18$_;
        }
        assert string_utilities.NIL != Strings.string(spacer) : spacer;
        strings = Sequences.delete(string_utilities.$empty_string$.getGlobalValue(), Sequences.delete((SubLObject)string_utilities.NIL, strings, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED), (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED);
        final SubLObject num_strings = Sequences.length(strings);
        if (num_strings.numE((SubLObject)string_utilities.ZERO_INTEGER)) {
            return string_utilities.$empty_string$.getGlobalValue();
        }
        if (num_strings.numE((SubLObject)string_utilities.ONE_INTEGER)) {
            return strings.first();
        }
        SubLObject total_length = (SubLObject)string_utilities.ZERO_INTEGER;
        final SubLObject spacer_length = Sequences.length(spacer);
        SubLObject cdolist_list_var = strings;
        SubLObject string = (SubLObject)string_utilities.NIL;
        string = cdolist_list_var.first();
        while (string_utilities.NIL != cdolist_list_var) {
            total_length = Numbers.add(total_length, Sequences.length(string));
            cdolist_list_var = cdolist_list_var.rest();
            string = cdolist_list_var.first();
        }
        total_length = Numbers.add(total_length, Numbers.multiply(spacer_length, Numbers.subtract(num_strings, (SubLObject)string_utilities.ONE_INTEGER)));
        final SubLObject new_string = Strings.make_string(total_length, (SubLObject)string_utilities.UNPROVIDED);
        SubLObject index = (SubLObject)string_utilities.ZERO_INTEGER;
        Sequences.replace(new_string, strings.first(), index, (SubLObject)string_utilities.NIL, (SubLObject)string_utilities.ZERO_INTEGER, (SubLObject)string_utilities.NIL);
        index = Numbers.add(index, Sequences.length(strings.first()));
        SubLObject cdolist_list_var2 = strings.rest();
        SubLObject string2 = (SubLObject)string_utilities.NIL;
        string2 = cdolist_list_var2.first();
        while (string_utilities.NIL != cdolist_list_var2) {
            Sequences.replace(new_string, spacer, index, (SubLObject)string_utilities.NIL, (SubLObject)string_utilities.ZERO_INTEGER, (SubLObject)string_utilities.NIL);
            index = Numbers.add(index, spacer_length);
            Sequences.replace(new_string, string2, index, (SubLObject)string_utilities.NIL, (SubLObject)string_utilities.ZERO_INTEGER, (SubLObject)string_utilities.NIL);
            index = Numbers.add(index, Sequences.length(string2));
            cdolist_list_var2 = cdolist_list_var2.rest();
            string2 = cdolist_list_var2.first();
        }
        return new_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 55228L)
    public static SubLObject offsets_of_token(final SubLObject token, final SubLObject string) {
        if (string_utilities.NIL != list_utilities.lengthE(token, (SubLObject)string_utilities.ONE_INTEGER, (SubLObject)string_utilities.UNPROVIDED) && string_utilities.NIL != punctuation_p(first_char(token))) {
            return search_all(token, string, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED);
        }
        final SubLObject escaped_token = regular_expression_utilities.escape_regex_special_chars(token);
        SubLObject regex = Sequences.cconcatenate((SubLObject)string_utilities.$str68$_b, new SubLObject[] { format_nil.format_nil_a_no_copy(escaped_token), string_utilities.$str68$_b });
        SubLObject offsets = list_utilities.alist_keys(regular_expression_utilities.offsets_of_regex_matches(regex, string, (SubLObject)string_utilities.$list69, (SubLObject)string_utilities.UNPROVIDED));
        if (string_utilities.NIL == offsets) {
            regex = format_nil.format_nil_a(escaped_token);
            offsets = list_utilities.alist_keys(regular_expression_utilities.offsets_of_regex_matches(regex, string, (SubLObject)string_utilities.$list69, (SubLObject)string_utilities.UNPROVIDED));
        }
        return offsets;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 55865L)
    public static SubLObject string_of_allowed_charsP(final SubLObject string, final SubLObject allowed_chars) {
        SubLObject end_var_$14;
        SubLObject end_var;
        SubLObject char_num;
        SubLObject v_char;
        for (end_var = (end_var_$14 = Sequences.length(string)), char_num = (SubLObject)string_utilities.NIL, char_num = (SubLObject)string_utilities.ZERO_INTEGER; !char_num.numGE(end_var_$14); char_num = number_utilities.f_1X(char_num)) {
            v_char = Strings.sublisp_char(string, char_num);
            if (string_utilities.NIL == subl_promotions.memberP(v_char, allowed_chars, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED)) {
                return (SubLObject)string_utilities.NIL;
            }
        }
        return (SubLObject)string_utilities.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 56028L)
    public static SubLObject bunge_according_to_string(SubLObject parts, final SubLObject string, SubLObject chars_allowed_bXw_words, SubLObject v_char, SubLObject warnP) {
        if (chars_allowed_bXw_words == string_utilities.UNPROVIDED) {
            chars_allowed_bXw_words = (SubLObject)string_utilities.$list66;
        }
        if (v_char == string_utilities.UNPROVIDED) {
            v_char = (SubLObject)Characters.CHAR_space;
        }
        if (warnP == string_utilities.UNPROVIDED) {
            warnP = (SubLObject)string_utilities.NIL;
        }
        assert string_utilities.NIL != Types.listp(parts) : parts;
        assert string_utilities.NIL != Types.stringp(string) : string;
        parts = Sequences.delete(string_utilities.$empty_string$.getGlobalValue(), Sequences.delete((SubLObject)string_utilities.NIL, parts, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED), (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED);
        if (string_utilities.NIL == parts) {
            return (SubLObject)string_utilities.$str0$;
        }
        if (string_utilities.NIL != list_utilities.singletonP(parts)) {
            return parts.first();
        }
        final SubLObject first_part = parts.first();
        SubLObject previous_part_length = Sequences.length(first_part);
        SubLObject starting_points = offsets_of_token(first_part, string);
        if (string_utilities.NIL == starting_points) {
            Errors.error((SubLObject)string_utilities.$str70$_S_is_not_a_part_of_the_reference, first_part, string);
        }
        SubLObject cdolist_list_var = parts.rest();
        SubLObject part = (SubLObject)string_utilities.NIL;
        part = cdolist_list_var.first();
        while (string_utilities.NIL != cdolist_list_var) {
            final SubLObject part_offsets = offsets_of_token(part, string);
            SubLObject bunged_string_length = (SubLObject)string_utilities.NIL;
            SubLObject valid_starts = (SubLObject)string_utilities.NIL;
            if (string_utilities.NIL == part_offsets) {
                Errors.error((SubLObject)string_utilities.$str70$_S_is_not_a_part_of_the_reference, part, string);
            }
            SubLObject cdolist_list_var_$15 = part_offsets;
            SubLObject offset = (SubLObject)string_utilities.NIL;
            offset = cdolist_list_var_$15.first();
            while (string_utilities.NIL != cdolist_list_var_$15) {
                SubLObject cdolist_list_var_$16 = starting_points;
                SubLObject starting_point = (SubLObject)string_utilities.NIL;
                starting_point = cdolist_list_var_$16.first();
                while (string_utilities.NIL != cdolist_list_var_$16) {
                    final SubLObject current_pointer = Numbers.add(starting_point, previous_part_length);
                    if (offset.numGE(current_pointer) && string_utilities.NIL != string_of_allowed_charsP(substring(string, current_pointer, offset), chars_allowed_bXw_words)) {
                        final SubLObject item_var = starting_point;
                        if (string_utilities.NIL == conses_high.member(item_var, valid_starts, Symbols.symbol_function((SubLObject)string_utilities.EQL), Symbols.symbol_function((SubLObject)string_utilities.IDENTITY))) {
                            valid_starts = (SubLObject)ConsesLow.cons(item_var, valid_starts);
                        }
                        if (string_utilities.NIL == bunged_string_length) {
                            bunged_string_length = Numbers.add(Numbers.subtract(offset, starting_point), Sequences.length(part));
                        }
                    }
                    cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                    starting_point = cdolist_list_var_$16.first();
                }
                cdolist_list_var_$15 = cdolist_list_var_$15.rest();
                offset = cdolist_list_var_$15.first();
            }
            starting_points = valid_starts;
            previous_part_length = bunged_string_length;
            cdolist_list_var = cdolist_list_var.rest();
            part = cdolist_list_var.first();
        }
        if (string_utilities.NIL == starting_points && string_utilities.NIL == previous_part_length) {
            final SubLObject result = (SubLObject)((string_utilities.NIL != v_char) ? bunge(parts, v_char) : string_utilities.NIL);
            if (string_utilities.NIL != warnP) {
                Errors.warn((SubLObject)string_utilities.$str71$Failed_to_bunge__S_according_to__, parts, string, result);
            }
            return result;
        }
        final SubLObject start = starting_points.first();
        final SubLObject end = Numbers.add(start, previous_part_length);
        return substring(string, start, end);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 58226L)
    public static SubLObject bunge_according_to_string_ignoring_errors(final SubLObject word_list, final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)string_utilities.NIL;
        SubLObject error = (SubLObject)string_utilities.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)string_utilities.$sym72$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    result = bunge_according_to_string(word_list, string, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)string_utilities.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (string_utilities.NIL != error || string_utilities.NIL == result) {
            result = bunge(word_list, (SubLObject)string_utilities.UNPROVIDED);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 58556L)
    public static SubLObject concatenate_strings(final SubLObject strings) {
        final SubLObject unicodeP = Sequences.find_if((SubLObject)string_utilities.$sym73$UNICODE_NAUT_P, strings, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED);
        final SubLObject stringy_strings = (string_utilities.NIL != unicodeP) ? strings_to_display_vector_strings(strings) : strings;
        final SubLObject big_string = (SubLObject)((string_utilities.NIL != stringy_strings) ? Functions.apply(Symbols.symbol_function((SubLObject)string_utilities.$sym74$CCONCATENATE), stringy_strings) : string_utilities.$str0$);
        return (string_utilities.NIL != unicodeP) ? unicode_nauts.make_unicode_naut(big_string) : big_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 58922L)
    public static SubLObject strings_to_display_vector_strings(final SubLObject strings) {
        final SubLObject display_vector_strings = conses_high.copy_list(strings);
        SubLObject list_var = (SubLObject)string_utilities.NIL;
        SubLObject string = (SubLObject)string_utilities.NIL;
        SubLObject i = (SubLObject)string_utilities.NIL;
        list_var = strings;
        string = list_var.first();
        for (i = (SubLObject)string_utilities.ZERO_INTEGER; string_utilities.NIL != list_var; list_var = list_var.rest(), string = list_var.first(), i = Numbers.add((SubLObject)string_utilities.ONE_INTEGER, i)) {
            if (string_utilities.NIL != unicode_nauts.unicode_naut_p(string, (SubLObject)string_utilities.UNPROVIDED)) {
                ConsesLow.set_nth(i, display_vector_strings, cycl_utilities.nat_arg1(string, (SubLObject)string_utilities.UNPROVIDED));
            }
            else {
                ConsesLow.set_nth(i, display_vector_strings, html_utilities.subl_string_to_display_vector_string(string));
            }
        }
        return display_vector_strings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 59371L)
    public static SubLObject join_strings(final SubLObject string_list, SubLObject separator_text) {
        if (separator_text == string_utilities.UNPROVIDED) {
            separator_text = (SubLObject)string_utilities.$str49$__;
        }
        final SubLObject first_string = string_list.first();
        final SubLObject other_strings = string_list.rest();
        SubLObject joined_text = (SubLObject)((string_utilities.NIL != first_string) ? first_string : string_utilities.$str0$);
        SubLObject cdolist_list_var = other_strings;
        SubLObject string = (SubLObject)string_utilities.NIL;
        string = cdolist_list_var.first();
        while (string_utilities.NIL != cdolist_list_var) {
            joined_text = Sequences.cconcatenate(joined_text, new SubLObject[] { separator_text, string });
            cdolist_list_var = cdolist_list_var.rest();
            string = cdolist_list_var.first();
        }
        return joined_text;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 60120L)
    public static SubLObject quoted_join_strings(final SubLObject string_list, SubLObject quote_char, SubLObject separator_text) {
        if (quote_char == string_utilities.UNPROVIDED) {
            quote_char = (SubLObject)Characters.CHAR_quotation;
        }
        if (separator_text == string_utilities.UNPROVIDED) {
            separator_text = (SubLObject)string_utilities.$str49$__;
        }
        SubLObject quoted_result = (SubLObject)string_utilities.$str0$;
        if (string_utilities.NIL != string_list) {
            final SubLObject quote_string = Strings.string(quote_char);
            final SubLObject full_separator_text = Sequences.cconcatenate(quote_string, new SubLObject[] { separator_text, quote_string });
            final SubLObject result = join_strings(string_list, full_separator_text);
            quoted_result = Sequences.cconcatenate(quote_string, new SubLObject[] { result, quote_string });
        }
        return quoted_result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 60752L)
    public static SubLObject camel_case_to_underscores(final SubLObject string) {
        SubLObject prev_char = (SubLObject)Characters.CHAR_A;
        SubLObject result = (SubLObject)string_utilities.NIL;
        SubLObject s = (SubLObject)string_utilities.NIL;
        try {
            s = streams_high.make_private_string_output_stream();
            SubLObject end_var_$17;
            SubLObject end_var;
            SubLObject char_num;
            SubLObject v_char;
            for (end_var = (end_var_$17 = Sequences.length(string)), char_num = (SubLObject)string_utilities.NIL, char_num = (SubLObject)string_utilities.ZERO_INTEGER; !char_num.numGE(end_var_$17); char_num = number_utilities.f_1X(char_num)) {
                v_char = Strings.sublisp_char(string, char_num);
                if (string_utilities.NIL != Characters.upper_case_p(v_char)) {
                    if (string_utilities.NIL != Characters.lower_case_p(prev_char)) {
                        streams_high.write_char((SubLObject)Characters.CHAR_underbar, s);
                    }
                    streams_high.write_char(Characters.char_downcase(v_char), s);
                }
                else {
                    streams_high.write_char(v_char, s);
                }
                prev_char = v_char;
            }
            result = streams_high.get_output_stream_string(s);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)string_utilities.T);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(s, (SubLObject)string_utilities.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 61329L)
    public static SubLObject capitalize_first(final SubLObject string) {
        return Sequences.cconcatenate(str(Characters.char_upcase(Strings.sublisp_char(string, (SubLObject)string_utilities.ZERO_INTEGER))), substring(string, (SubLObject)string_utilities.ONE_INTEGER, (SubLObject)string_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 61524L)
    public static SubLObject uncapitalize_first(final SubLObject string) {
        return Sequences.cconcatenate(str(Characters.char_downcase(Strings.sublisp_char(string, (SubLObject)string_utilities.ZERO_INTEGER))), substring(string, (SubLObject)string_utilities.ONE_INTEGER, (SubLObject)string_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 61700L)
    public static SubLObject nth_word_of_string(final SubLObject num, final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current_pos = (SubLObject)string_utilities.ZERO_INTEGER;
        SubLObject result = (SubLObject)string_utilities.NIL;
        final SubLObject _prev_bind_0 = string_utilities.$test_char$.currentBinding(thread);
        try {
            string_utilities.$test_char$.bind(string_utilities.$space_char$.getGlobalValue(), thread);
            SubLObject cdolist_list_var;
            final SubLObject word_list_var = cdolist_list_var = break_words(string, (SubLObject)string_utilities.$sym30$NOT_TEST_CHAR, (SubLObject)string_utilities.UNPROVIDED);
            SubLObject word = (SubLObject)string_utilities.NIL;
            word = cdolist_list_var.first();
            while (string_utilities.NIL != cdolist_list_var) {
                if (string_utilities.NIL == result && num.numE(current_pos)) {
                    result = word;
                }
                current_pos = Numbers.add(current_pos, (SubLObject)string_utilities.ONE_INTEGER);
                cdolist_list_var = cdolist_list_var.rest();
                word = cdolist_list_var.first();
            }
        }
        finally {
            string_utilities.$test_char$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 62014L)
    public static SubLObject capitalize_smart(final SubLObject string) {
        final SubLObject words = cycl_string.cycl_string_tokenize(string, (SubLObject)string_utilities.$list75);
        if (words.first().isString()) {
            nstring_proper(words.first(), (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED);
        }
        SubLObject cdolist_list_var = words.rest();
        SubLObject word = (SubLObject)string_utilities.NIL;
        word = cdolist_list_var.first();
        while (string_utilities.NIL != cdolist_list_var) {
            if (word.isString() && string_utilities.NIL != lexicon_utilities.smart_to_capitalizeP(word)) {
                nstring_proper(word, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        }
        return cycl_string.cycl_string_bunge(words, (SubLObject)string_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 62570L)
    public static SubLObject uncapitalize_smart(final SubLObject string) {
        final SubLObject uncapped = Strings.string_downcase(string, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED);
        return capitalize_smart(uncapped);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 62940L)
    public static SubLObject properly_capitalized_stringP(final SubLObject string) {
        final SubLObject cap_string = capitalize_smart(string);
        return Equality.equal(string, cap_string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 63211L)
    public static SubLObject capitalized_string_p(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!string.isString()) {
            return (SubLObject)string_utilities.NIL;
        }
        SubLObject uncapitalized_open_class_wordsP = (SubLObject)string_utilities.NIL;
        SubLObject capitalized_but_not_enitirely_wordsP = (SubLObject)string_utilities.NIL;
        final SubLObject _prev_bind_0 = string_utilities.$test_char$.currentBinding(thread);
        try {
            string_utilities.$test_char$.bind(string_utilities.$space_char$.getGlobalValue(), thread);
            SubLObject cdolist_list_var;
            final SubLObject word_list_var = cdolist_list_var = break_words(string, (SubLObject)string_utilities.$sym30$NOT_TEST_CHAR, (SubLObject)string_utilities.UNPROVIDED);
            SubLObject word = (SubLObject)string_utilities.NIL;
            word = cdolist_list_var.first();
            while (string_utilities.NIL != cdolist_list_var) {
                final SubLObject first_letter = first_char(word);
                if (string_utilities.NIL == lexicon_accessors.closed_lexical_class_stringP(word, (SubLObject)string_utilities.UNPROVIDED) && string_utilities.NIL != Characters.lower_case_p(first_letter)) {
                    uncapitalized_open_class_wordsP = (SubLObject)string_utilities.T;
                }
                if (string_utilities.NIL != Characters.upper_case_p(first_letter) && string_utilities.NIL != Sequences.find_if(Symbols.symbol_function((SubLObject)string_utilities.$sym76$LOWER_CASE_P), word, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED)) {
                    capitalized_but_not_enitirely_wordsP = (SubLObject)string_utilities.T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                word = cdolist_list_var.first();
            }
        }
        finally {
            string_utilities.$test_char$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(string_utilities.NIL != capitalized_but_not_enitirely_wordsP && string_utilities.NIL == uncapitalized_open_class_wordsP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 64383L)
    public static SubLObject string_encode_capitalization(final SubLObject string) {
        SubLObject ans = (SubLObject)string_utilities.ZERO_INTEGER;
        SubLObject char_value = (SubLObject)string_utilities.ONE_INTEGER;
        SubLObject end_var_$18;
        SubLObject end_var;
        SubLObject char_num;
        SubLObject v_char;
        for (end_var = (end_var_$18 = Sequences.length(string)), char_num = (SubLObject)string_utilities.NIL, char_num = (SubLObject)string_utilities.ZERO_INTEGER; !char_num.numGE(end_var_$18); char_num = number_utilities.f_1X(char_num)) {
            v_char = Strings.sublisp_char(string, char_num);
            if (string_utilities.NIL != Characters.upper_case_p(v_char)) {
                ans = Numbers.add(ans, char_value);
            }
            char_value = Numbers.multiply((SubLObject)string_utilities.TWO_INTEGER, char_value);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 64682L)
    public static SubLObject string_has_capitalization_p(final SubLObject string, final SubLObject cap_code) {
        return string_has_capitalization_p_mod(string, cap_code);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 67052L)
    public static SubLObject string_has_capitalization_p_mod(final SubLObject string, final SubLObject cap_code) {
        SubLObject remaining_value = cap_code;
        SubLObject char_value = (SubLObject)string_utilities.ONE_INTEGER;
        SubLObject mismatchP = (SubLObject)string_utilities.NIL;
        final SubLObject end_var = Sequences.length(string);
        if (string_utilities.NIL == mismatchP) {
            SubLObject end_var_$19;
            SubLObject char_num;
            SubLObject v_char;
            for (end_var_$19 = end_var, char_num = (SubLObject)string_utilities.NIL, char_num = (SubLObject)string_utilities.ZERO_INTEGER; string_utilities.NIL == mismatchP && !char_num.numGE(end_var_$19); char_num = number_utilities.f_1X(char_num)) {
                v_char = Strings.sublisp_char(string, char_num);
                if (string_utilities.NIL != Characters.upper_case_p(v_char)) {
                    remaining_value = Numbers.subtract(remaining_value, char_value);
                }
                char_value = Numbers.multiply((SubLObject)string_utilities.TWO_INTEGER, char_value);
                if (string_utilities.NIL == number_utilities.divides_evenly(remaining_value, char_value)) {
                    mismatchP = (SubLObject)string_utilities.T;
                }
            }
        }
        if (!remaining_value.isZero()) {
            mismatchP = (SubLObject)string_utilities.T;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(string_utilities.NIL == mismatchP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 67702L)
    public static SubLObject string_has_capitalization_p_expt(final SubLObject string, final SubLObject cap_code) {
        SubLObject remaining_value = cap_code;
        SubLObject char_value = Numbers.expt((SubLObject)string_utilities.TWO_INTEGER, number_utilities.f_1_(Sequences.length(string)));
        SubLObject mismatchP = (SubLObject)string_utilities.NIL;
        final SubLObject string_var = Sequences.reverse(string);
        final SubLObject end_var = Sequences.length(string_var);
        if (string_utilities.NIL == mismatchP) {
            SubLObject end_var_$20;
            SubLObject char_num;
            SubLObject v_char;
            for (end_var_$20 = end_var, char_num = (SubLObject)string_utilities.NIL, char_num = (SubLObject)string_utilities.ZERO_INTEGER; string_utilities.NIL == mismatchP && !char_num.numGE(end_var_$20); char_num = number_utilities.f_1X(char_num)) {
                v_char = Strings.sublisp_char(string_var, char_num);
                if (string_utilities.NIL != Characters.upper_case_p(v_char)) {
                    remaining_value = Numbers.subtract(remaining_value, char_value);
                }
                if (!remaining_value.numGE((SubLObject)string_utilities.ZERO_INTEGER) || !remaining_value.numL(char_value)) {
                    mismatchP = (SubLObject)string_utilities.T;
                }
                char_value = Numbers.divide(char_value, (SubLObject)string_utilities.TWO_INTEGER);
            }
        }
        if (!remaining_value.isZero()) {
            mismatchP = (SubLObject)string_utilities.T;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(string_utilities.NIL == mismatchP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 68415L)
    public static SubLObject nstring_proper(final SubLObject string, SubLObject start, SubLObject end, SubLObject test, SubLObject leading) {
        if (start == string_utilities.UNPROVIDED) {
            start = (SubLObject)string_utilities.ZERO_INTEGER;
        }
        if (end == string_utilities.UNPROVIDED) {
            end = (SubLObject)string_utilities.NIL;
        }
        if (test == string_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)string_utilities.$sym77$WHITESPACEP);
        }
        if (leading == string_utilities.UNPROVIDED) {
            leading = (SubLObject)string_utilities.T;
        }
        SubLObject str_len = Sequences.length(string);
        if (string_utilities.NIL != end && end.isNumber() && end.numLE(str_len)) {
            str_len = end;
        }
        if (start.numG(str_len)) {
            return string;
        }
        SubLObject i;
        for (i = (SubLObject)string_utilities.NIL, i = start; !i.numE(str_len); i = Numbers.add(i, (SubLObject)string_utilities.ONE_INTEGER)) {
            if (string_utilities.NIL != leading) {
                Strings.set_char(string, i, Characters.char_upcase(Strings.sublisp_char(string, i)));
                leading = (SubLObject)string_utilities.NIL;
            }
            if (string_utilities.NIL != Functions.funcall(test, Vectors.aref(string, i))) {
                leading = (SubLObject)string_utilities.T;
            }
        }
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 69304L)
    public static SubLObject string_proper(final SubLObject string, SubLObject start, SubLObject end, SubLObject test, SubLObject leading) {
        if (start == string_utilities.UNPROVIDED) {
            start = (SubLObject)string_utilities.ZERO_INTEGER;
        }
        if (end == string_utilities.UNPROVIDED) {
            end = (SubLObject)string_utilities.NIL;
        }
        if (test == string_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)string_utilities.$sym77$WHITESPACEP);
        }
        if (leading == string_utilities.UNPROVIDED) {
            leading = (SubLObject)string_utilities.T;
        }
        return nstring_proper(copy_string(string), start, end, test, leading);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 69803L)
    public static SubLObject space_uncapitalize(final SubLObject string) {
        assert string_utilities.NIL != Types.stringp(string) : string;
        final SubLObject length = Sequences.length(string);
        if (length.numE((SubLObject)string_utilities.ZERO_INTEGER)) {
            return string;
        }
        final SubLObject capitals = Sequences.count_if(Symbols.symbol_function((SubLObject)string_utilities.$sym78$UPPER_CASE_P), string, Symbols.symbol_function((SubLObject)string_utilities.IDENTITY), (SubLObject)string_utilities.ONE_INTEGER, (SubLObject)string_utilities.UNPROVIDED);
        final SubLObject digits = Sequences.count_if(Symbols.symbol_function((SubLObject)string_utilities.$sym54$DIGIT_CHAR_P), string, Symbols.symbol_function((SubLObject)string_utilities.IDENTITY), (SubLObject)string_utilities.ONE_INTEGER, (SubLObject)string_utilities.UNPROVIDED);
        final SubLObject punctutation = Sequences.count_if(Symbols.symbol_function((SubLObject)string_utilities.$sym79$PUNCTUATION_P), string, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED);
        final SubLObject increase = Numbers.add(capitals, digits, punctutation);
        if (increase.numE((SubLObject)string_utilities.ZERO_INTEGER)) {
            return string;
        }
        final SubLObject new_length = Numbers.add(length, increase);
        final SubLObject new_string = Strings.make_string(new_length, (SubLObject)string_utilities.UNPROVIDED);
        SubLObject new_index = (SubLObject)string_utilities.ZERO_INTEGER;
        SubLObject index = (SubLObject)string_utilities.NIL;
        SubLObject prev_i = (SubLObject)string_utilities.NIL;
        SubLObject v_char = (SubLObject)string_utilities.NIL;
        SubLObject prev = (SubLObject)string_utilities.NIL;
        index = (prev_i = (SubLObject)string_utilities.ZERO_INTEGER);
        v_char = (prev = Strings.sublisp_char(string, index));
        while (!index.numE(Numbers.subtract(length, (SubLObject)string_utilities.ONE_INTEGER))) {
            if ((string_utilities.NIL != Characters.upper_case_p(v_char) || string_utilities.NIL != punctuation_p(v_char) || (string_utilities.NIL != Characters.digit_char_p(v_char, (SubLObject)string_utilities.UNPROVIDED) && string_utilities.NIL == Characters.digit_char_p(prev, (SubLObject)string_utilities.UNPROVIDED))) && !index.numE((SubLObject)string_utilities.ZERO_INTEGER)) {
                new_index = Numbers.add(new_index, (SubLObject)string_utilities.ONE_INTEGER);
            }
            set_nth_char(new_index, new_string, Characters.char_downcase(v_char), (SubLObject)string_utilities.UNPROVIDED);
            new_index = Numbers.add(new_index, (SubLObject)string_utilities.ONE_INTEGER);
            index = Numbers.add(index, (SubLObject)string_utilities.ONE_INTEGER);
            prev_i = Numbers.subtract(index, (SubLObject)string_utilities.ONE_INTEGER);
            v_char = Strings.sublisp_char(string, index);
            prev = Strings.sublisp_char(string, prev_i);
        }
        if ((string_utilities.NIL != Characters.upper_case_p(v_char) || string_utilities.NIL != punctuation_p(v_char) || (string_utilities.NIL != Characters.digit_char_p(v_char, (SubLObject)string_utilities.UNPROVIDED) && string_utilities.NIL == Characters.digit_char_p(prev, (SubLObject)string_utilities.UNPROVIDED))) && !index.numE((SubLObject)string_utilities.ZERO_INTEGER)) {
            new_index = Numbers.add(new_index, (SubLObject)string_utilities.ONE_INTEGER);
        }
        set_nth_char(new_index, new_string, Characters.char_downcase(v_char), (SubLObject)string_utilities.UNPROVIDED);
        return trim_sides(new_string, (SubLObject)string_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 71140L)
    public static SubLObject space_dont_uncapitalize(final SubLObject string) {
        assert string_utilities.NIL != Types.stringp(string) : string;
        final SubLObject length = Sequences.length(string);
        SubLObject ans = (SubLObject)(length.isZero() ? string : string_utilities.NIL);
        if (string_utilities.NIL == ans) {
            final SubLObject capitals = Sequences.count_if(Symbols.symbol_function((SubLObject)string_utilities.$sym78$UPPER_CASE_P), string, Symbols.symbol_function((SubLObject)string_utilities.IDENTITY), (SubLObject)string_utilities.ONE_INTEGER, (SubLObject)string_utilities.UNPROVIDED);
            final SubLObject digits = Sequences.count_if(Symbols.symbol_function((SubLObject)string_utilities.$sym54$DIGIT_CHAR_P), string, Symbols.symbol_function((SubLObject)string_utilities.IDENTITY), (SubLObject)string_utilities.ONE_INTEGER, (SubLObject)string_utilities.UNPROVIDED);
            final SubLObject doomed = Sequences.count_if(Symbols.symbol_function((SubLObject)string_utilities.$sym80$EAT_CHAR_P), string, Symbols.symbol_function((SubLObject)string_utilities.IDENTITY), (SubLObject)string_utilities.ONE_INTEGER, (SubLObject)string_utilities.UNPROVIDED);
            final SubLObject increase = Numbers.subtract(Numbers.add(capitals, digits), doomed);
            if (increase.isZero()) {
                ans = string;
            }
            if (string_utilities.NIL == ans) {
                final SubLObject new_length = Numbers.add(length, increase);
                final SubLObject new_string = Strings.make_string(new_length, (SubLObject)string_utilities.UNPROVIDED);
                SubLObject new_index = (SubLObject)string_utilities.ZERO_INTEGER;
                SubLObject prev = (SubLObject)string_utilities.NIL;
                SubLObject index = (SubLObject)string_utilities.NIL;
                SubLObject v_char = (SubLObject)string_utilities.NIL;
                SubLObject next = (SubLObject)string_utilities.NIL;
                index = (SubLObject)string_utilities.ZERO_INTEGER;
                v_char = Strings.sublisp_char(string, index);
                next = Strings.sublisp_char(string, number_utilities.f_1X(index));
                while (!index.numE(Numbers.subtract(length, (SubLObject)string_utilities.ONE_INTEGER))) {
                    if (string_utilities.NIL != Characters.lower_case_p(v_char) && string_utilities.NIL == prev && string_utilities.NIL != capitalize_initial_char_p(v_char, next)) {
                        v_char = Characters.char_upcase(v_char);
                    }
                    if (string_utilities.NIL == eat_char_p(v_char)) {
                        if (string_utilities.NIL != add_space_between_chars_p(v_char, prev, next) && !index.numE((SubLObject)string_utilities.ZERO_INTEGER)) {
                            new_index = Numbers.add(new_index, (SubLObject)string_utilities.ONE_INTEGER);
                        }
                        set_nth_char(new_index, new_string, v_char, (SubLObject)string_utilities.UNPROVIDED);
                        new_index = Numbers.add(new_index, (SubLObject)string_utilities.ONE_INTEGER);
                    }
                    prev = v_char;
                    index = Numbers.add(index, (SubLObject)string_utilities.ONE_INTEGER);
                    v_char = Strings.sublisp_char(string, index);
                    next = (SubLObject)(index.numL(number_utilities.f_1_(length)) ? Strings.sublisp_char(string, number_utilities.f_1X(index)) : string_utilities.NIL);
                }
                if (string_utilities.NIL != add_space_between_chars_p(v_char, prev, next) && !index.numE((SubLObject)string_utilities.ZERO_INTEGER)) {
                    new_index = Numbers.add(new_index, (SubLObject)string_utilities.ONE_INTEGER);
                }
                set_nth_char(new_index, new_string, v_char, (SubLObject)string_utilities.UNPROVIDED);
                ans = trim_sides(new_string, (SubLObject)string_utilities.UNPROVIDED);
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 72625L)
    public static SubLObject add_space_between_chars_p(final SubLObject v_char, final SubLObject prev, final SubLObject next) {
        return (SubLObject)SubLObjectFactory.makeBoolean((string_utilities.NIL != Characters.upper_case_p(v_char) && ((string_utilities.NIL != prev && string_utilities.NIL == Characters.upper_case_p(prev)) || (next.isChar() && string_utilities.NIL != Characters.lower_case_p(next) && !next.eql((SubLObject)Characters.CHAR_s)))) || (string_utilities.NIL != Characters.digit_char_p(v_char, (SubLObject)string_utilities.UNPROVIDED) && (string_utilities.NIL == prev || string_utilities.NIL == Characters.digit_char_p(prev, (SubLObject)string_utilities.UNPROVIDED))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 73034L)
    public static SubLObject eat_char_p(final SubLObject v_char) {
        return Equality.eq(v_char, (SubLObject)Characters.CHAR_hyphen);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 73092L)
    public static SubLObject capitalize_initial_char_p(final SubLObject v_char, final SubLObject next) {
        return (SubLObject)SubLObjectFactory.makeBoolean(string_utilities.NIL != Characters.lower_case_p(v_char) && string_utilities.NIL != Characters.upper_case_p(next));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 73209L)
    public static SubLObject string_downcase_except_acronyms(final SubLObject string) {
        return string_ndowncase_except_acronyms(copy_string(string));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 73487L)
    public static SubLObject string_ndowncase_except_acronyms(final SubLObject string) {
        SubLObject prev = (SubLObject)string_utilities.NIL;
        SubLObject continueP = (SubLObject)string_utilities.T;
        while (string_utilities.NIL != continueP) {
            continueP = (SubLObject)string_utilities.NIL;
            prev = (SubLObject)string_utilities.NIL;
            SubLObject end_var_$21;
            SubLObject end_var;
            SubLObject i;
            SubLObject curr;
            for (end_var = (end_var_$21 = Sequences.length(string)), i = (SubLObject)string_utilities.NIL, i = (SubLObject)string_utilities.ZERO_INTEGER; !i.numGE(end_var_$21); i = number_utilities.f_1X(i)) {
                curr = Strings.sublisp_char(string, i);
                if (prev.isChar()) {
                    if (string_utilities.NIL != Characters.upper_case_p(prev) && string_utilities.NIL != Characters.lower_case_p(curr) && (!curr.eql((SubLObject)Characters.CHAR_s) || i.numL((SubLObject)string_utilities.TWO_INTEGER) || string_utilities.NIL != whitespacep(Strings.sublisp_char(string, Numbers.subtract(i, (SubLObject)string_utilities.TWO_INTEGER))) || (string_utilities.NIL == list_utilities.lengthLE(string, number_utilities.f_1X(i), (SubLObject)string_utilities.UNPROVIDED) && string_utilities.NIL == whitespacep(Strings.sublisp_char(string, number_utilities.f_1X(i)))))) {
                        set_nth_char(number_utilities.f_1_(i), string, Characters.char_downcase(prev), (SubLObject)string_utilities.UNPROVIDED);
                        continueP = (SubLObject)string_utilities.T;
                    }
                    else if (string_utilities.NIL != Characters.upper_case_p(curr) && string_utilities.NIL != Characters.lower_case_p(prev)) {
                        set_nth_char(i, string, Characters.char_downcase(curr), (SubLObject)string_utilities.UNPROVIDED);
                        continueP = (SubLObject)string_utilities.T;
                    }
                    else if (string_utilities.NIL != Characters.upper_case_p(curr) && string_utilities.NIL != whitespacep(prev) && string_utilities.NIL != list_utilities.lengthG(string, number_utilities.f_1X(i), (SubLObject)string_utilities.UNPROVIDED) && string_utilities.NIL != whitespacep(Strings.sublisp_char(string, number_utilities.f_1X(i)))) {
                        set_nth_char(i, string, Characters.char_downcase(curr), (SubLObject)string_utilities.UNPROVIDED);
                        continueP = (SubLObject)string_utilities.T;
                    }
                }
                prev = curr;
            }
        }
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 74656L)
    public static SubLObject hex_char_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isChar() && string_utilities.NIL != list_utilities.sublisp_boolean(Characters.digit_char_p(v_object, (SubLObject)string_utilities.SIXTEEN_INTEGER)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 74814L)
    public static SubLObject hex_char(final SubLObject value) {
        assert string_utilities.NIL != Types.integerp(value) : value;
        return Strings.sublisp_char((SubLObject)string_utilities.$str82$0123456789ABCDEF, value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 74983L)
    public static SubLObject hex_char_value(final SubLObject hex_char) {
        assert string_utilities.NIL != hex_char_p(hex_char) : hex_char;
        return Characters.digit_char_p(hex_char, (SubLObject)string_utilities.SIXTEEN_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 75145L)
    public static SubLObject hex_char_string_p(final SubLObject v_object) {
        return hex_string_p_int(v_object, (SubLObject)string_utilities.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 75293L)
    public static SubLObject hex_string_p(final SubLObject v_object) {
        return hex_string_p_int(v_object, (SubLObject)string_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 75420L)
    public static SubLObject hex_string_p_int(final SubLObject v_object, final SubLObject enforce_even_lengthP) {
        if (v_object.isString()) {
            final SubLObject length = Sequences.length(v_object);
            if (string_utilities.NIL == enforce_even_lengthP || string_utilities.NIL != Numbers.evenp(length)) {
                SubLObject i;
                for (i = (SubLObject)string_utilities.NIL, i = (SubLObject)string_utilities.ZERO_INTEGER; i.numL(length); i = Numbers.add(i, (SubLObject)string_utilities.ONE_INTEGER)) {
                    if (string_utilities.NIL == hex_char_p(Strings.sublisp_char(v_object, i))) {
                        return (SubLObject)string_utilities.NIL;
                    }
                }
                return (SubLObject)string_utilities.T;
            }
        }
        return (SubLObject)string_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 75700L)
    public static SubLObject integer_to_hex_string(final SubLObject integer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert string_utilities.NIL != Types.integerp(integer) : integer;
        SubLObject hex_string = (SubLObject)string_utilities.NIL;
        final SubLObject _prev_bind_0 = print_high.$print_base$.currentBinding(thread);
        try {
            print_high.$print_base$.bind((SubLObject)string_utilities.SIXTEEN_INTEGER, thread);
            hex_string = print_high.princ_to_string(integer);
        }
        finally {
            print_high.$print_base$.rebind(_prev_bind_0, thread);
        }
        return hex_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 77841L)
    public static SubLObject f_64_bit_char_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isChar() && string_utilities.NIL != Hashtables.gethash(v_object, string_utilities.$64_bit_char_index$.getGlobalValue(), (SubLObject)string_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 77959L)
    public static SubLObject f_64_bit_char(final SubLObject value) {
        assert string_utilities.NIL != Types.integerp(value) : value;
        final SubLObject result = Hashtables.gethash(value, string_utilities.$64_bit_integer_index$.getGlobalValue(), (SubLObject)string_utilities.UNPROVIDED);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 78169L)
    public static SubLObject f_64_bit_char_value(final SubLObject v_char) {
        assert string_utilities.NIL != Types.characterp(v_char) : v_char;
        final SubLObject result = Hashtables.gethash(v_char, string_utilities.$64_bit_char_index$.getGlobalValue(), (SubLObject)string_utilities.UNPROVIDED);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 78381L)
    public static SubLObject f_64_bit_string_p(final SubLObject v_object) {
        if (v_object.isString()) {
            SubLObject end_var_$22;
            SubLObject end_var;
            SubLObject char_num;
            SubLObject v_char;
            for (end_var = (end_var_$22 = Sequences.length(v_object)), char_num = (SubLObject)string_utilities.NIL, char_num = (SubLObject)string_utilities.ZERO_INTEGER; !char_num.numGE(end_var_$22); char_num = number_utilities.f_1X(char_num)) {
                v_char = Strings.sublisp_char(v_object, char_num);
                if (string_utilities.NIL == f_64_bit_char_p(v_char) && !Characters.CHAR_equal.eql(v_char)) {
                    return (SubLObject)string_utilities.NIL;
                }
            }
            return (SubLObject)string_utilities.T;
        }
        return (SubLObject)string_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 78567L)
    public static SubLObject upper_case_alphanumeric_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(string_utilities.NIL != Characters.upper_case_p(v_object) || string_utilities.NIL != Characters.digit_char_p(v_object, (SubLObject)string_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 78785L)
    public static SubLObject punctuation_p(final SubLObject v_char) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_char.isChar() && string_utilities.NIL != Sequences.find(v_char, (SubLObject)string_utilities.$str85$____________, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 78883L)
    public static SubLObject punctuation_extended_p(final SubLObject v_char) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_char.isChar() && string_utilities.NIL != Sequences.find(v_char, (SubLObject)string_utilities.$str86$_____________, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 79224L)
    public static SubLObject punctuation_string_p(final SubLObject string) {
        return (SubLObject)SubLObjectFactory.makeBoolean(Sequences.length(string).numE((SubLObject)string_utilities.ONE_INTEGER) && string_utilities.NIL != punctuation_p(first_char(string)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 79448L)
    public static SubLObject remove_punctuation(final SubLObject string) {
        return Sequences.remove_if(Symbols.symbol_function((SubLObject)string_utilities.$sym87$PUNCTUATION_EXTENDED_P), string, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 79638L)
    public static SubLObject upper_case_char_p(final SubLObject v_char) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_char.isChar() && string_utilities.NIL != Characters.upper_case_p(v_char));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 79732L)
    public static SubLObject lower_case_char_p(final SubLObject v_char) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_char.isChar() && string_utilities.NIL != Characters.lower_case_p(v_char));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 79826L)
    public static SubLObject upper_case_string_p(final SubLObject string) {
        SubLObject end_var_$23;
        SubLObject end_var;
        SubLObject char_num;
        SubLObject ch;
        for (end_var = (end_var_$23 = Sequences.length(string)), char_num = (SubLObject)string_utilities.NIL, char_num = (SubLObject)string_utilities.ZERO_INTEGER; !char_num.numGE(end_var_$23); char_num = number_utilities.f_1X(char_num)) {
            ch = Strings.sublisp_char(string, char_num);
            if (string_utilities.NIL != Characters.alpha_char_p(ch) && string_utilities.NIL != Characters.lower_case_p(ch)) {
                return (SubLObject)string_utilities.NIL;
            }
        }
        return (SubLObject)string_utilities.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 79975L)
    public static SubLObject lower_case_string_p(final SubLObject string) {
        SubLObject end_var_$24;
        SubLObject end_var;
        SubLObject char_num;
        SubLObject ch;
        for (end_var = (end_var_$24 = Sequences.length(string)), char_num = (SubLObject)string_utilities.NIL, char_num = (SubLObject)string_utilities.ZERO_INTEGER; !char_num.numGE(end_var_$24); char_num = number_utilities.f_1X(char_num)) {
            ch = Strings.sublisp_char(string, char_num);
            if (string_utilities.NIL != Characters.alpha_char_p(ch) && string_utilities.NIL != Characters.upper_case_p(ch)) {
                return (SubLObject)string_utilities.NIL;
            }
        }
        return (SubLObject)string_utilities.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 80275L)
    public static SubLObject string_list_downcase(final SubLObject string_list) {
        SubLObject ans = (SubLObject)string_utilities.NIL;
        SubLObject cdolist_list_var = string_list;
        SubLObject string = (SubLObject)string_utilities.NIL;
        string = cdolist_list_var.first();
        while (string_utilities.NIL != cdolist_list_var) {
            if (string.isString()) {
                ans = (SubLObject)ConsesLow.cons(Strings.string_downcase(string, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED), ans);
            }
            else {
                ans = (SubLObject)ConsesLow.cons(string, ans);
            }
            cdolist_list_var = cdolist_list_var.rest();
            string = cdolist_list_var.first();
        }
        return Sequences.nreverse(ans);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 80651L)
    public static SubLObject string_list_upcase(final SubLObject string_list) {
        SubLObject ans = (SubLObject)string_utilities.NIL;
        SubLObject cdolist_list_var = string_list;
        SubLObject string = (SubLObject)string_utilities.NIL;
        string = cdolist_list_var.first();
        while (string_utilities.NIL != cdolist_list_var) {
            if (string.isString()) {
                ans = (SubLObject)ConsesLow.cons(Strings.string_upcase(string, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED), ans);
            }
            else {
                ans = (SubLObject)ConsesLow.cons(string, ans);
            }
            cdolist_list_var = cdolist_list_var.rest();
            string = cdolist_list_var.first();
        }
        return Sequences.nreverse(ans);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 81023L)
    public static SubLObject nupcase_nth(final SubLObject string, final SubLObject n, SubLObject safeP) {
        if (safeP == string_utilities.UNPROVIDED) {
            safeP = (SubLObject)string_utilities.T;
        }
        if (string_utilities.NIL != safeP) {
            assert string_utilities.NIL != subl_promotions.non_negative_integer_p(n) : n;
            assert string_utilities.NIL != Types.stringp(string) : string;
        }
        if (string_utilities.NIL == safeP || string_utilities.NIL != list_utilities.lengthG(string, n, (SubLObject)string_utilities.UNPROVIDED)) {
            set_nth_char(n, string, Characters.char_upcase(Strings.sublisp_char(string, n)), (SubLObject)string_utilities.NIL);
        }
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 81417L)
    public static SubLObject nupcase_leading(final SubLObject string) {
        return nupcase_nth(string, (SubLObject)string_utilities.ZERO_INTEGER, (SubLObject)string_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 81548L)
    public static SubLObject upcase_leading(final SubLObject string) {
        return nupcase_leading(copy_string(string));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 81699L)
    public static SubLObject ndowncase_nth(final SubLObject string, final SubLObject n, SubLObject safeP) {
        if (safeP == string_utilities.UNPROVIDED) {
            safeP = (SubLObject)string_utilities.T;
        }
        if (string_utilities.NIL != safeP) {
            assert string_utilities.NIL != subl_promotions.non_negative_integer_p(n) : n;
            assert string_utilities.NIL != Types.stringp(string) : string;
        }
        if (string_utilities.NIL == safeP || string_utilities.NIL != list_utilities.lengthG(string, n, (SubLObject)string_utilities.UNPROVIDED)) {
            set_nth_char(n, string, Characters.char_downcase(Strings.sublisp_char(string, n)), (SubLObject)string_utilities.UNPROVIDED);
        }
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 82092L)
    public static SubLObject ndowncase_leading(final SubLObject string) {
        return ndowncase_nth(string, (SubLObject)string_utilities.ZERO_INTEGER, (SubLObject)string_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 82229L)
    public static SubLObject downcase_leading(final SubLObject string) {
        return ndowncase_leading(copy_string(string));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 82384L)
    public static SubLObject all_chars_EP(final SubLObject ch, final SubLObject string) {
        final SubLObject len = Sequences.length(string);
        SubLObject v_boolean = (SubLObject)string_utilities.T;
        if (len.numG((SubLObject)string_utilities.ZERO_INTEGER)) {
            SubLObject pos;
            for (pos = (SubLObject)string_utilities.NIL, pos = (SubLObject)string_utilities.ZERO_INTEGER; !pos.numE(len) && string_utilities.NIL != v_boolean; pos = Numbers.add(pos, (SubLObject)string_utilities.ONE_INTEGER)) {
                if (string_utilities.NIL == Characters.charE(ch, Strings.sublisp_char(string, pos))) {
                    v_boolean = (SubLObject)string_utilities.NIL;
                }
            }
            return v_boolean;
        }
        return (SubLObject)string_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 82743L)
    public static SubLObject string_contains_only_charsP(final SubLObject string, final SubLObject char_list) {
        SubLObject other_charsP = (SubLObject)string_utilities.NIL;
        final SubLObject end_var = Sequences.length(string);
        if (string_utilities.NIL == other_charsP) {
            SubLObject end_var_$25;
            SubLObject char_num;
            SubLObject v_char;
            for (end_var_$25 = end_var, char_num = (SubLObject)string_utilities.NIL, char_num = (SubLObject)string_utilities.ZERO_INTEGER; string_utilities.NIL == other_charsP && !char_num.numGE(end_var_$25); char_num = number_utilities.f_1X(char_num)) {
                v_char = Strings.sublisp_char(string, char_num);
                if (string_utilities.NIL == subl_promotions.memberP(v_char, char_list, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED)) {
                    other_charsP = (SubLObject)string_utilities.T;
                }
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(string_utilities.NIL == other_charsP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 83398L)
    public static SubLObject whitespace_chars() {
        return conses_high.copy_list(string_utilities.$whitespace_chars$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 83474L)
    public static SubLObject whitespace_charP(final SubLObject v_char) {
        return subl_promotions.memberP(v_char, string_utilities.$whitespace_chars$.getGlobalValue(), (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 83832L)
    public static SubLObject grammatical_punctuation_chars() {
        return conses_high.copy_list(string_utilities.$grammatical_punctuation_chars$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 83934L)
    public static SubLObject grammatical_punctuation_charP(final SubLObject v_char) {
        return subl_promotions.memberP(v_char, string_utilities.$grammatical_punctuation_chars$.getGlobalValue(), (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 84043L)
    public static SubLObject trim_whitespace(final SubLObject string) {
        assert string_utilities.NIL != Types.stringp(string) : string;
        return Strings.string_trim(string_utilities.$whitespace_chars$.getGlobalValue(), string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 84346L)
    public static SubLObject left_trim_whitespace(final SubLObject string) {
        assert string_utilities.NIL != Types.stringp(string) : string;
        return Strings.string_left_trim(string_utilities.$whitespace_chars$.getGlobalValue(), string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 84476L)
    public static SubLObject right_trim_whitespace(final SubLObject string) {
        assert string_utilities.NIL != Types.stringp(string) : string;
        return Strings.string_right_trim(string_utilities.$whitespace_chars$.getGlobalValue(), string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 84608L)
    public static SubLObject trim_whitespace_if_string(final SubLObject v_object) {
        if (v_object.isString()) {
            return Strings.string_trim(string_utilities.$whitespace_chars$.getGlobalValue(), v_object);
        }
        return (SubLObject)string_utilities.$str0$;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 84886L)
    public static SubLObject nsubst_whitespace(SubLObject string) {
        final SubLObject string_var;
        string = (string_var = normalize_spaces(string));
        SubLObject end_var_$26;
        SubLObject end_var;
        SubLObject i;
        SubLObject v_char;
        for (end_var = (end_var_$26 = Sequences.length(string_var)), i = (SubLObject)string_utilities.NIL, i = (SubLObject)string_utilities.ZERO_INTEGER; !i.numGE(end_var_$26); i = number_utilities.f_1X(i)) {
            v_char = Strings.sublisp_char(string_var, i);
            if (string_utilities.NIL != subl_promotions.memberP(v_char, string_utilities.$whitespace_chars$.getGlobalValue(), (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED) && !v_char.eql((SubLObject)Characters.CHAR_space)) {
                set_nth_char(i, string, (SubLObject)Characters.CHAR_space, (SubLObject)string_utilities.UNPROVIDED);
            }
        }
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 85287L)
    public static SubLObject normalize_spaces(SubLObject string) {
        if (string_utilities.NIL != unicode_strings.non_ascii_string_p(string)) {
            string = unicode_strings.utf8_vector_to_utf8_string(unicode_strings.unicode_vector_to_utf8_vector(Sequences.nsubstitute_if((SubLObject)string_utilities.$int64$32, (SubLObject)string_utilities.$sym91$UNICODE_SPACE_CHAR_CODE_P, unicode_strings.utf8_string_to_unicode_vector(string), (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED), (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED));
        }
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 85652L)
    public static SubLObject subst_whitespace(final SubLObject string) {
        return nsubst_whitespace(copy_string(string));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 85883L)
    public static SubLObject whitespacep(final SubLObject v_char) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_char.isChar() && (string_utilities.NIL != Sequences.find(v_char, string_utilities.$whitespace_chars$.getGlobalValue(), (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED) || (string_utilities.NIL != unicode_strings.non_ascii_char_p(v_char) && string_utilities.NIL != unicode_space_char_code_p(Characters.char_code(v_char)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 86071L)
    public static SubLObject unicode_space_char_code_p(final SubLObject code) {
        return (SubLObject)SubLObjectFactory.makeBoolean(code.numGE((SubLObject)string_utilities.$int92$8192) && code.numLE((SubLObject)string_utilities.$int93$8203));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 86179L)
    public static SubLObject non_whitespace_p(final SubLObject v_char) {
        return (SubLObject)SubLObjectFactory.makeBoolean(string_utilities.NIL == whitespacep(v_char));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 86247L)
    public static SubLObject read_whitespace_no_hang(SubLObject stream, SubLObject eof_error_p, SubLObject eof_value) {
        if (stream == string_utilities.UNPROVIDED) {
            stream = StreamsLow.$standard_input$.getDynamicValue();
        }
        if (eof_error_p == string_utilities.UNPROVIDED) {
            eof_error_p = (SubLObject)string_utilities.T;
        }
        if (eof_value == string_utilities.UNPROVIDED) {
            eof_value = (SubLObject)string_utilities.NIL;
        }
        SubLObject v_char;
        for (v_char = (SubLObject)string_utilities.NIL, v_char = streams_high.read_char_no_hang(stream, eof_error_p, eof_value, (SubLObject)string_utilities.UNPROVIDED); string_utilities.NIL != v_char && string_utilities.NIL != whitespacep(v_char); v_char = streams_high.read_char_no_hang(stream, eof_error_p, eof_value, (SubLObject)string_utilities.UNPROVIDED)) {}
        if (v_char.isChar()) {
            streams_high.unread_char(v_char, stream);
        }
        return v_char;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 86603L)
    public static SubLObject whitespace_stringP(final SubLObject string) {
        return string_contains_only_charsP(string, string_utilities.$whitespace_chars$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 86712L)
    public static SubLObject trim_quotes(SubLObject string, SubLObject escaped_quote_as_string) {
        if (escaped_quote_as_string == string_utilities.UNPROVIDED) {
            escaped_quote_as_string = (SubLObject)string_utilities.$str21$_;
        }
        if (string_utilities.NIL != starts_with(string, escaped_quote_as_string)) {
            string = Sequences.subseq(string, (SubLObject)string_utilities.ONE_INTEGER, (SubLObject)string_utilities.UNPROVIDED);
        }
        if (string_utilities.NIL != ends_with(string, escaped_quote_as_string, (SubLObject)string_utilities.UNPROVIDED)) {
            string = Sequences.subseq(string, (SubLObject)string_utilities.ZERO_INTEGER, Numbers.subtract(Sequences.length(string), (SubLObject)string_utilities.ONE_INTEGER));
        }
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 87057L)
    public static SubLObject remove_whitespace(final SubLObject string) {
        return Sequences.remove_if((SubLObject)string_utilities.$sym77$WHITESPACEP, string, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 87141L)
    public static SubLObject equal_modulo_whitespace(final SubLObject string1, final SubLObject string2) {
        return Equality.equal(remove_whitespace(string1), remove_whitespace(string2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 87318L)
    public static SubLObject equalp_modulo_whitespace(final SubLObject string1, final SubLObject string2) {
        return Equality.equalp(remove_whitespace(string1), remove_whitespace(string2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 87497L)
    public static SubLObject substringP_modulo_whitespace(final SubLObject little, final SubLObject big) {
        return substringP(remove_whitespace(little), remove_whitespace(big), (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 87674L)
    public static SubLObject network_terpri(final SubLObject stream) {
        streams_high.write_char(Characters.code_char((SubLObject)string_utilities.THIRTEEN_INTEGER), stream);
        streams_high.terpri(stream);
        return (SubLObject)string_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 88090L)
    public static SubLObject add_to_buffer(final SubLObject v_char, SubLObject buffer, final SubLObject idx) {
        final SubLObject length = Sequences.length(buffer);
        if (idx.numGE(length)) {
            final SubLObject new_buffer = Strings.make_string(Numbers.multiply(length, (SubLObject)string_utilities.TWO_INTEGER), (SubLObject)string_utilities.UNPROVIDED);
            SubLObject i;
            for (i = (SubLObject)string_utilities.NIL, i = (SubLObject)string_utilities.ZERO_INTEGER; i.numL(length); i = Numbers.add(i, (SubLObject)string_utilities.ONE_INTEGER)) {
                set_nth_char(i, new_buffer, Strings.sublisp_char(buffer, i), (SubLObject)string_utilities.UNPROVIDED);
            }
            buffer = new_buffer;
        }
        set_nth_char(idx, buffer, v_char, (SubLObject)string_utilities.UNPROVIDED);
        return buffer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 88396L)
    public static SubLObject network_read_line(SubLObject stream, SubLObject eof_error_p, SubLObject eof_value, SubLObject return_partial_lineP) {
        if (stream == string_utilities.UNPROVIDED) {
            stream = StreamsLow.$standard_input$.getDynamicValue();
        }
        if (eof_error_p == string_utilities.UNPROVIDED) {
            eof_error_p = (SubLObject)string_utilities.T;
        }
        if (eof_value == string_utilities.UNPROVIDED) {
            eof_value = (SubLObject)string_utilities.$kw94$EOF;
        }
        if (return_partial_lineP == string_utilities.UNPROVIDED) {
            return_partial_lineP = (SubLObject)string_utilities.NIL;
        }
        final SubLObject length = (SubLObject)string_utilities.$int95$64;
        SubLObject buffer = Strings.make_string(length, (SubLObject)string_utilities.UNPROVIDED);
        SubLObject idx = (SubLObject)string_utilities.ZERO_INTEGER;
        SubLObject state = (SubLObject)string_utilities.$kw96$NORMAL;
        SubLObject done = (SubLObject)string_utilities.NIL;
        while (string_utilities.NIL == done) {
            final SubLObject ch = streams_high.read_char(stream, eof_error_p, (SubLObject)string_utilities.NIL, (SubLObject)string_utilities.UNPROVIDED);
            if (string_utilities.NIL != ch) {
                if (string_utilities.NIL != Characters.charE(ch, Characters.code_char((SubLObject)string_utilities.THIRTEEN_INTEGER))) {
                    final SubLObject pcase_var = state;
                    if (pcase_var.eql((SubLObject)string_utilities.$kw96$NORMAL)) {
                        state = (SubLObject)string_utilities.$kw97$CR;
                    }
                    else {
                        if (!pcase_var.eql((SubLObject)string_utilities.$kw97$CR)) {
                            continue;
                        }
                        buffer = add_to_buffer(Characters.code_char((SubLObject)string_utilities.THIRTEEN_INTEGER), buffer, idx);
                        idx = Numbers.add(idx, (SubLObject)string_utilities.ONE_INTEGER);
                    }
                }
                else if (string_utilities.NIL != Characters.charE(ch, Characters.code_char((SubLObject)string_utilities.TEN_INTEGER))) {
                    final SubLObject pcase_var = state;
                    if (pcase_var.eql((SubLObject)string_utilities.$kw96$NORMAL)) {
                        done = (SubLObject)string_utilities.T;
                    }
                    else {
                        if (!pcase_var.eql((SubLObject)string_utilities.$kw97$CR)) {
                            continue;
                        }
                        done = (SubLObject)string_utilities.T;
                    }
                }
                else {
                    final SubLObject pcase_var = state;
                    if (pcase_var.eql((SubLObject)string_utilities.$kw96$NORMAL)) {
                        buffer = add_to_buffer(ch, buffer, idx);
                        idx = Numbers.add(idx, (SubLObject)string_utilities.ONE_INTEGER);
                    }
                    else {
                        if (!pcase_var.eql((SubLObject)string_utilities.$kw97$CR)) {
                            continue;
                        }
                        buffer = add_to_buffer(Characters.code_char((SubLObject)string_utilities.THIRTEEN_INTEGER), buffer, idx);
                        idx = Numbers.add(idx, (SubLObject)string_utilities.ONE_INTEGER);
                        buffer = add_to_buffer(ch, buffer, idx);
                        idx = Numbers.add(idx, (SubLObject)string_utilities.ONE_INTEGER);
                        state = (SubLObject)string_utilities.$kw96$NORMAL;
                    }
                }
            }
            else {
                if (string_utilities.NIL == return_partial_lineP || !idx.isPositive()) {
                    return Values.values(eof_value, (SubLObject)string_utilities.T);
                }
                done = (SubLObject)string_utilities.T;
            }
        }
        return Values.values(substring(buffer, (SubLObject)string_utilities.ZERO_INTEGER, idx), (SubLObject)string_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 89765L)
    public static SubLObject read_possibly_continued_line(SubLObject stream, SubLObject eof_error_p, SubLObject eof_value) {
        if (stream == string_utilities.UNPROVIDED) {
            stream = StreamsLow.$standard_input$.getDynamicValue();
        }
        if (eof_error_p == string_utilities.UNPROVIDED) {
            eof_error_p = (SubLObject)string_utilities.T;
        }
        if (eof_value == string_utilities.UNPROVIDED) {
            eof_value = (SubLObject)string_utilities.$kw94$EOF;
        }
        SubLObject lines = (SubLObject)string_utilities.NIL;
        SubLObject state = (SubLObject)string_utilities.$kw96$NORMAL;
        while (true) {
            final SubLObject line = network_read_line(stream, eof_error_p, (SubLObject)string_utilities.NIL, (SubLObject)string_utilities.UNPROVIDED);
            if (string_utilities.NIL == line) {
                return Values.values(eof_value, (SubLObject)string_utilities.T);
            }
            final SubLObject string_var = line;
            SubLObject end_var_$27;
            SubLObject end_var;
            SubLObject char_num;
            SubLObject ch;
            SubLObject pcase_var;
            SubLObject pcase_var_$28;
            SubLObject pcase_var_$29;
            for (end_var = (end_var_$27 = Sequences.length(string_var)), char_num = (SubLObject)string_utilities.NIL, char_num = (SubLObject)string_utilities.ZERO_INTEGER; !char_num.numGE(end_var_$27); char_num = number_utilities.f_1X(char_num)) {
                ch = Strings.sublisp_char(string_var, char_num);
                pcase_var = state;
                if (pcase_var.eql((SubLObject)string_utilities.$kw96$NORMAL)) {
                    pcase_var_$28 = ch;
                    if (pcase_var_$28.eql((SubLObject)Characters.CHAR_quotation)) {
                        state = (SubLObject)string_utilities.$kw98$STRING;
                    }
                }
                else if (pcase_var.eql((SubLObject)string_utilities.$kw98$STRING)) {
                    pcase_var_$29 = ch;
                    if (pcase_var_$29.eql((SubLObject)Characters.CHAR_quotation)) {
                        state = (SubLObject)string_utilities.$kw96$NORMAL;
                    }
                    else if (pcase_var_$29.eql((SubLObject)Characters.CHAR_backslash)) {
                        state = (SubLObject)string_utilities.$kw99$SLASH;
                    }
                }
                else if (pcase_var.eql((SubLObject)string_utilities.$kw99$SLASH)) {
                    state = (SubLObject)string_utilities.$kw98$STRING;
                }
            }
            if (state == string_utilities.$kw96$NORMAL) {
                if (string_utilities.NIL != lines) {
                    SubLObject new_lines = (SubLObject)ConsesLow.list(line);
                    SubLObject cdolist_list_var = lines;
                    SubLObject old_line = (SubLObject)string_utilities.NIL;
                    old_line = cdolist_list_var.first();
                    while (string_utilities.NIL != cdolist_list_var) {
                        new_lines = (SubLObject)ConsesLow.cons(Strings.make_string((SubLObject)string_utilities.ONE_INTEGER, (SubLObject)Characters.CHAR_newline), new_lines);
                        new_lines = (SubLObject)ConsesLow.cons(old_line, new_lines);
                        cdolist_list_var = cdolist_list_var.rest();
                        old_line = cdolist_list_var.first();
                    }
                    return Values.values(Functions.apply(Symbols.symbol_function((SubLObject)string_utilities.$sym74$CCONCATENATE), new_lines), (SubLObject)string_utilities.NIL);
                }
                return Values.values(line, (SubLObject)string_utilities.NIL);
            }
            else {
                lines = (SubLObject)ConsesLow.cons(line, lines);
            }
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 90726L)
    public static SubLObject find_earliest_string(final SubLObject string, final SubLObject search_strings, SubLObject test, SubLObject start) {
        if (test == string_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)string_utilities.EQL);
        }
        if (start == string_utilities.UNPROVIDED) {
            start = (SubLObject)string_utilities.ZERO_INTEGER;
        }
        SubLObject earliest_position = Sequences.length(string);
        SubLObject earliest_string = (SubLObject)string_utilities.NIL;
        SubLObject done = (SubLObject)string_utilities.NIL;
        if (string_utilities.NIL == done) {
            SubLObject csome_list_var = search_strings;
            SubLObject control_string = (SubLObject)string_utilities.NIL;
            control_string = csome_list_var.first();
            while (string_utilities.NIL == done && string_utilities.NIL != csome_list_var) {
                final SubLObject position = Sequences.search(control_string, string, test, Symbols.symbol_function((SubLObject)string_utilities.IDENTITY), (SubLObject)string_utilities.ZERO_INTEGER, (SubLObject)string_utilities.NIL, start, earliest_position);
                if (string_utilities.NIL != position && position.numL(earliest_position)) {
                    earliest_position = position;
                    earliest_string = control_string;
                }
                done = Numbers.numE(earliest_position, start);
                csome_list_var = csome_list_var.rest();
                control_string = csome_list_var.first();
            }
        }
        return Values.values((SubLObject)((string_utilities.NIL != earliest_string) ? earliest_position : string_utilities.NIL), earliest_string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 91541L)
    public static SubLObject search_last(final SubLObject seq1, final SubLObject seq2, SubLObject test, SubLObject key) {
        if (test == string_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)string_utilities.EQL);
        }
        if (key == string_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)string_utilities.IDENTITY);
        }
        return list_utilities.last_one(search_all(seq1, seq2, test, key));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 91673L)
    public static SubLObject princ_substring(final SubLObject string, final SubLObject stream, SubLObject start, SubLObject end) {
        if (start == string_utilities.UNPROVIDED) {
            start = (SubLObject)string_utilities.ZERO_INTEGER;
        }
        if (end == string_utilities.UNPROVIDED) {
            end = (SubLObject)string_utilities.NIL;
        }
        assert string_utilities.NIL != Types.stringp(string) : string;
        if (string_utilities.NIL == end) {
            end = Sequences.length(string);
        }
        final SubLObject substring_length = Numbers.subtract(end, start);
        if (substring_length.isPositive()) {
            SubLObject index;
            for (index = (SubLObject)string_utilities.NIL, index = (SubLObject)string_utilities.ZERO_INTEGER; index.numL(substring_length); index = Numbers.add(index, (SubLObject)string_utilities.ONE_INTEGER)) {
                streams_high.write_char(Strings.sublisp_char(string, Numbers.add(start, index)), stream);
            }
        }
        return (SubLObject)string_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 92071L)
    public static SubLObject strcat(final SubLObject string_list) {
        if (string_utilities.NIL == string_list) {
            return (SubLObject)string_utilities.NIL;
        }
        return Functions.apply(Symbols.symbol_function((SubLObject)string_utilities.$sym74$CCONCATENATE), string_list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 92262L)
    public static SubLObject nchar_subst(final SubLObject v_new, final SubLObject old, final SubLObject string) {
        assert string_utilities.NIL != Types.characterp(v_new) : v_new;
        assert string_utilities.NIL != Types.characterp(old) : old;
        assert string_utilities.NIL != Types.stringp(string) : string;
        SubLObject end_var_$30;
        SubLObject end_var;
        SubLObject i;
        SubLObject v_char;
        for (end_var = (end_var_$30 = Sequences.length(string)), i = (SubLObject)string_utilities.NIL, i = (SubLObject)string_utilities.ZERO_INTEGER; !i.numGE(end_var_$30); i = number_utilities.f_1X(i)) {
            v_char = Strings.sublisp_char(string, i);
            if (v_char.eql(old)) {
                set_nth_char(i, string, v_new, (SubLObject)string_utilities.UNPROVIDED);
            }
        }
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 92633L)
    public static SubLObject char_subst(final SubLObject v_new, final SubLObject old, final SubLObject string) {
        return nchar_subst(v_new, old, copy_string(string));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 92840L)
    public static SubLObject nchar_subst_if(final SubLObject v_new, final SubLObject test, final SubLObject string) {
        assert string_utilities.NIL != Types.characterp(v_new) : v_new;
        assert string_utilities.NIL != Symbols.fboundp(test) : test;
        assert string_utilities.NIL != Types.stringp(string) : string;
        SubLObject end_var_$31;
        SubLObject end_var;
        SubLObject i;
        SubLObject v_char;
        for (end_var = (end_var_$31 = Sequences.length(string)), i = (SubLObject)string_utilities.NIL, i = (SubLObject)string_utilities.ZERO_INTEGER; !i.numGE(end_var_$31); i = number_utilities.f_1X(i)) {
            v_char = Strings.sublisp_char(string, i);
            if (string_utilities.NIL != Functions.funcall(test, v_char)) {
                set_nth_char(i, string, v_new, (SubLObject)string_utilities.UNPROVIDED);
            }
        }
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 93223L)
    public static SubLObject char_subst_if(final SubLObject v_new, final SubLObject test, final SubLObject string) {
        return nchar_subst_if(v_new, test, copy_string(string));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 93458L)
    public static SubLObject nchar_subst_if_not(final SubLObject v_new, final SubLObject test, final SubLObject string) {
        assert string_utilities.NIL != Types.characterp(v_new) : v_new;
        assert string_utilities.NIL != Symbols.fboundp(test) : test;
        assert string_utilities.NIL != Types.stringp(string) : string;
        SubLObject end_var_$32;
        SubLObject end_var;
        SubLObject i;
        SubLObject v_char;
        for (end_var = (end_var_$32 = Sequences.length(string)), i = (SubLObject)string_utilities.NIL, i = (SubLObject)string_utilities.ZERO_INTEGER; !i.numGE(end_var_$32); i = number_utilities.f_1X(i)) {
            v_char = Strings.sublisp_char(string, i);
            if (string_utilities.NIL == Functions.funcall(test, v_char)) {
                set_nth_char(i, string, v_new, (SubLObject)string_utilities.UNPROVIDED);
            }
        }
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 93847L)
    public static SubLObject char_subst_if_not(final SubLObject v_new, final SubLObject test, final SubLObject string) {
        return nchar_subst_if_not(v_new, test, copy_string(string));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 94090L)
    public static SubLObject string_subst(final SubLObject v_new, final SubLObject old, final SubLObject string, SubLObject test) {
        if (test == string_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)string_utilities.EQUALP);
        }
        assert string_utilities.NIL != Types.stringp(v_new) : v_new;
        assert string_utilities.NIL != non_empty_string_p(old) : old;
        assert string_utilities.NIL != Types.stringp(string) : string;
        final SubLObject new_length = Sequences.length(v_new);
        final SubLObject old_length = Sequences.length(old);
        SubLObject total_occurrences = (SubLObject)string_utilities.ZERO_INTEGER;
        SubLObject string_start;
        SubLObject position;
        for (string_start = (SubLObject)string_utilities.NIL, position = (SubLObject)string_utilities.NIL, string_start = (SubLObject)string_utilities.ZERO_INTEGER, position = Sequences.search(old, string, test, Symbols.symbol_function((SubLObject)string_utilities.IDENTITY), (SubLObject)string_utilities.ZERO_INTEGER, (SubLObject)string_utilities.NIL, string_start, (SubLObject)string_utilities.NIL); string_utilities.NIL != position; position = Sequences.search(old, string, test, Symbols.symbol_function((SubLObject)string_utilities.IDENTITY), (SubLObject)string_utilities.ZERO_INTEGER, (SubLObject)string_utilities.NIL, string_start, (SubLObject)string_utilities.NIL)) {
            total_occurrences = Numbers.add(total_occurrences, (SubLObject)string_utilities.ONE_INTEGER);
            string_start = Numbers.add(position, old_length);
        }
        if (total_occurrences.numE((SubLObject)string_utilities.ZERO_INTEGER)) {
            return string;
        }
        final SubLObject string_length = Sequences.length(string);
        final SubLObject delta = Numbers.multiply(total_occurrences, Numbers.subtract(new_length, old_length));
        final SubLObject subst_length = Numbers.add(string_length, delta);
        final SubLObject subst_string = Strings.make_string(subst_length, (SubLObject)Characters.CHAR_space);
        SubLObject string_index = (SubLObject)string_utilities.ZERO_INTEGER;
        SubLObject subst_index = (SubLObject)string_utilities.ZERO_INTEGER;
        SubLObject string_start2;
        SubLObject position2;
        SubLObject string_seq_length;
        for (string_start2 = (SubLObject)string_utilities.NIL, position2 = (SubLObject)string_utilities.NIL, string_start2 = (SubLObject)string_utilities.ZERO_INTEGER, position2 = Sequences.search(old, string, test, Symbols.symbol_function((SubLObject)string_utilities.IDENTITY), (SubLObject)string_utilities.ZERO_INTEGER, (SubLObject)string_utilities.NIL, string_start2, (SubLObject)string_utilities.NIL); string_utilities.NIL != position2; position2 = Sequences.search(old, string, test, Symbols.symbol_function((SubLObject)string_utilities.IDENTITY), (SubLObject)string_utilities.ZERO_INTEGER, (SubLObject)string_utilities.NIL, string_start2, (SubLObject)string_utilities.NIL)) {
            string_seq_length = Numbers.subtract(position2, string_index);
            Sequences.replace(subst_string, string, subst_index, Numbers.add(subst_index, string_seq_length), string_index, position2);
            string_index = Numbers.add(string_index, string_seq_length);
            subst_index = Numbers.add(subst_index, string_seq_length);
            Sequences.replace(subst_string, v_new, subst_index, Numbers.add(subst_index, new_length), (SubLObject)string_utilities.ZERO_INTEGER, new_length);
            string_index = Numbers.add(string_index, old_length);
            subst_index = Numbers.add(subst_index, new_length);
            string_start2 = Numbers.add(position2, old_length);
        }
        if (!subst_index.numE(subst_length)) {
            Sequences.replace(subst_string, string, subst_index, (SubLObject)string_utilities.NIL, string_index, (SubLObject)string_utilities.NIL);
        }
        return subst_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 96020L)
    public static SubLObject trim_sides(final SubLObject string, SubLObject char_to_trim) {
        if (char_to_trim == string_utilities.UNPROVIDED) {
            char_to_trim = (SubLObject)Characters.CHAR_space;
        }
        SubLObject result = (SubLObject)(string.isString() ? Strings.string_trim((SubLObject)ConsesLow.list(char_to_trim), string) : string_utilities.NIL);
        if (string_utilities.NIL != empty_string_p(result)) {
            result = (SubLObject)string_utilities.NIL;
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 96409L)
    public static SubLObject valid_timestring_charP(final SubLObject ch) {
        return (SubLObject)SubLObjectFactory.makeBoolean(string_utilities.NIL != Characters.digit_char_p(ch, (SubLObject)string_utilities.UNPROVIDED) || string_utilities.NIL != Sequences.find(ch, (SubLObject)string_utilities.$list102, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 96500L)
    public static SubLObject string_trim_symmetric_n(final SubLObject char_list, final SubLObject string, SubLObject n) {
        if (n == string_utilities.UNPROVIDED) {
            n = (SubLObject)string_utilities.NIL;
        }
        if (string_utilities.ZERO_INTEGER.eql(n)) {
            return string;
        }
        final SubLObject string_length = Sequences.length(string);
        if (string_utilities.TWO_INTEGER.numG(string_length)) {
            return string;
        }
        final SubLObject first_char = Strings.sublisp_char(string, (SubLObject)string_utilities.ZERO_INTEGER);
        if (string_utilities.NIL != subl_promotions.memberP(first_char, char_list, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED)) {
            final SubLObject last_char = Strings.sublisp_char(string, Numbers.subtract(string_length, (SubLObject)string_utilities.ONE_INTEGER));
            if (string_utilities.NIL != Characters.charE(first_char, last_char)) {
                final SubLObject new_string = substring(string, (SubLObject)string_utilities.ONE_INTEGER, Numbers.subtract(string_length, (SubLObject)string_utilities.ONE_INTEGER));
                if (string_utilities.NIL == n) {
                    return string_trim_symmetric_n(char_list, new_string, (SubLObject)string_utilities.UNPROVIDED);
                }
                if (n.numE((SubLObject)string_utilities.ZERO_INTEGER)) {
                    return new_string;
                }
                return string_trim_symmetric_n(char_list, new_string, Numbers.subtract(n, (SubLObject)string_utilities.ONE_INTEGER));
            }
        }
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 97493L)
    public static SubLObject break_words(final SubLObject string, SubLObject non_break_char_test, SubLObject leave_embedded_stringsP) {
        if (non_break_char_test == string_utilities.UNPROVIDED) {
            non_break_char_test = Symbols.symbol_function((SubLObject)string_utilities.$sym103$VALID_CONSTANT_NAME_CHAR_P);
        }
        if (leave_embedded_stringsP == string_utilities.UNPROVIDED) {
            leave_embedded_stringsP = (SubLObject)string_utilities.NIL;
        }
        final SubLObject len = Sequences.length(string);
        SubLObject p1 = (SubLObject)string_utilities.ZERO_INTEGER;
        SubLObject p2 = (SubLObject)string_utilities.ONE_INTEGER;
        SubLObject ans = (SubLObject)string_utilities.NIL;
        SubLObject inside_dqP = (SubLObject)string_utilities.NIL;
        while (!p2.numG(len)) {
            final SubLObject px = Numbers.subtract(p2, (SubLObject)string_utilities.ONE_INTEGER);
            final SubLObject c1 = Strings.sublisp_char(string, p1);
            final SubLObject c2 = (SubLObject)(p2.numL(len) ? Strings.sublisp_char(string, p2) : string_utilities.NIL);
            final SubLObject cx = Strings.sublisp_char(string, px);
            final SubLObject c1_is_breakP = (SubLObject)SubLObjectFactory.makeBoolean(c1.isChar() && (string_utilities.NIL == leave_embedded_stringsP || string_utilities.NIL == Characters.charE(c1, (SubLObject)Characters.CHAR_quotation)) && string_utilities.NIL == Functions.funcall(non_break_char_test, c1));
            final SubLObject c2_is_breakP = (SubLObject)SubLObjectFactory.makeBoolean(c2.isChar() && (string_utilities.NIL == leave_embedded_stringsP || string_utilities.NIL == Characters.charE(c2, (SubLObject)Characters.CHAR_quotation)) && string_utilities.NIL == Functions.funcall(non_break_char_test, c2));
            if (string_utilities.NIL != Characters.charE(c1, (SubLObject)Characters.CHAR_quotation) && string_utilities.NIL != leave_embedded_stringsP) {
                if (string_utilities.NIL != inside_dqP) {
                    if (string_utilities.NIL != Characters.charE(cx, (SubLObject)Characters.CHAR_quotation) && !p1.numE(px)) {
                        inside_dqP = (SubLObject)string_utilities.NIL;
                    }
                }
                else {
                    inside_dqP = (SubLObject)string_utilities.T;
                }
            }
            if (p2.numE(len) && string_utilities.NIL == c1_is_breakP) {
                ans = (SubLObject)ConsesLow.cons(Sequences.subseq(string, p1, p2), ans);
                p2 = Numbers.add(p2, (SubLObject)string_utilities.ONE_INTEGER);
            }
            else if (string_utilities.NIL != c1_is_breakP) {
                p1 = Numbers.add(p1, (SubLObject)string_utilities.ONE_INTEGER);
                p2 = Numbers.add(p1, (SubLObject)string_utilities.ONE_INTEGER);
            }
            else if (string_utilities.NIL == c1_is_breakP && string_utilities.NIL == c2_is_breakP) {
                p2 = Numbers.add(p2, (SubLObject)string_utilities.ONE_INTEGER);
            }
            else if (string_utilities.NIL == c1_is_breakP && string_utilities.NIL == inside_dqP && string_utilities.NIL != c2_is_breakP) {
                ans = (SubLObject)ConsesLow.cons(Sequences.subseq(string, p1, p2), ans);
                p1 = Numbers.add(p2, (SubLObject)string_utilities.ONE_INTEGER);
                p2 = Numbers.add(p1, (SubLObject)string_utilities.ONE_INTEGER);
            }
            else {
                if (string_utilities.NIL != c1_is_breakP || string_utilities.NIL == inside_dqP || string_utilities.NIL == c2_is_breakP) {
                    continue;
                }
                p2 = Numbers.add(p2, (SubLObject)string_utilities.ONE_INTEGER);
            }
        }
        return Sequences.nreverse(ans);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 99831L)
    public static SubLObject sub_phrases(final SubLObject string) {
        SubLObject strings = (SubLObject)string_utilities.NIL;
        final SubLObject space_positions = list_utilities.all_positions((SubLObject)Characters.CHAR_space, string, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED);
        SubLObject cdolist_list_var = (SubLObject)ConsesLow.cons((SubLObject)string_utilities.ZERO_INTEGER, Mapping.mapcar((SubLObject)string_utilities.$sym104$1_, space_positions));
        SubLObject start = (SubLObject)string_utilities.NIL;
        start = cdolist_list_var.first();
        while (string_utilities.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$33 = (SubLObject)ConsesLow.cons((SubLObject)string_utilities.NIL, space_positions);
            SubLObject end = (SubLObject)string_utilities.NIL;
            end = cdolist_list_var_$33.first();
            while (string_utilities.NIL != cdolist_list_var_$33) {
                if (string_utilities.NIL == end || end.numG(start)) {
                    final SubLObject item_var = substring(string, start, end);
                    if (string_utilities.NIL == conses_high.member(item_var, strings, Symbols.symbol_function((SubLObject)string_utilities.EQL), Symbols.symbol_function((SubLObject)string_utilities.IDENTITY))) {
                        strings = (SubLObject)ConsesLow.cons(item_var, strings);
                    }
                }
                cdolist_list_var_$33 = cdolist_list_var_$33.rest();
                end = cdolist_list_var_$33.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            start = cdolist_list_var.first();
        }
        return strings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 100252L)
    public static SubLObject number_of_words(final SubLObject string) {
        return Numbers.add((SubLObject)string_utilities.ONE_INTEGER, count_chars_in_string(trim_whitespace(string), (SubLObject)Characters.CHAR_space));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 100418L)
    public static SubLObject first_word(final SubLObject string, SubLObject word_boundary) {
        if (word_boundary == string_utilities.UNPROVIDED) {
            word_boundary = string_utilities.$space_char$.getGlobalValue();
        }
        assert string_utilities.NIL != Types.stringp(string) : string;
        assert string_utilities.NIL != Types.characterp(word_boundary) : word_boundary;
        return string_upto(string, word_boundary);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 100708L)
    public static SubLObject substring_positions(final SubLObject string, final SubLObject strings) {
        SubLObject ans = (SubLObject)string_utilities.NIL;
        SubLObject cdotimes_end_var;
        SubLObject i;
        SubLObject found_one;
        SubLObject csome_list_var;
        SubLObject d;
        for (cdotimes_end_var = Sequences.length(string), i = (SubLObject)string_utilities.NIL, i = (SubLObject)string_utilities.ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, (SubLObject)string_utilities.ONE_INTEGER)) {
            found_one = (SubLObject)string_utilities.NIL;
            if (string_utilities.NIL == found_one) {
                csome_list_var = strings;
                d = (SubLObject)string_utilities.NIL;
                d = csome_list_var.first();
                while (string_utilities.NIL == found_one && string_utilities.NIL != csome_list_var) {
                    if (string_utilities.NIL != starts_with(Sequences.subseq(string, i, (SubLObject)string_utilities.UNPROVIDED), d)) {
                        ans = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(i, d), ans);
                        found_one = (SubLObject)string_utilities.T;
                    }
                    csome_list_var = csome_list_var.rest();
                    d = csome_list_var.first();
                }
            }
        }
        return Sequences.nreverse(ans);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 101164L)
    public static SubLObject break_string(final SubLObject string, final SubLObject break_substrings) {
        SubLObject ans = (SubLObject)string_utilities.NIL;
        final SubLObject len = Sequences.length(string);
        final SubLObject substr_positions = substring_positions(string, break_substrings);
        SubLObject i1 = (SubLObject)string_utilities.ZERO_INTEGER;
        SubLObject i2 = (SubLObject)string_utilities.ZERO_INTEGER;
        while (!i2.numG(len)) {
            final SubLObject pair = conses_high.assoc(i2, substr_positions, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED);
            final SubLObject str = conses_high.second(pair);
            final SubLObject strlen = Sequences.length(str);
            if (i2.numE(len) && i1.numL(i2)) {
                ans = (SubLObject)ConsesLow.cons(Sequences.subseq(string, i1, i2), ans);
                i2 = (i1 = Numbers.add(i2, (SubLObject)string_utilities.ONE_INTEGER));
            }
            else if (string_utilities.NIL != str) {
                ans = (SubLObject)ConsesLow.cons(Sequences.subseq(string, i1, i2), ans);
                ans = (SubLObject)ConsesLow.cons(str, ans);
                i2 = (i1 = Numbers.add(i2, strlen));
            }
            else {
                i2 = Numbers.add(i2, (SubLObject)string_utilities.ONE_INTEGER);
            }
        }
        return Sequences.nreverse(ans);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 101961L)
    public static SubLObject first_name_first(final SubLObject string) {
        assert string_utilities.NIL != Types.stringp(string) : string;
        SubLObject ans = string;
        SubLObject coordP = (SubLObject)string_utilities.NIL;
        if (string_utilities.NIL == coordP) {
            SubLObject csome_list_var = (SubLObject)string_utilities.$list105;
            SubLObject sub = (SubLObject)string_utilities.NIL;
            sub = csome_list_var.first();
            while (string_utilities.NIL == coordP && string_utilities.NIL != csome_list_var) {
                if (string_utilities.NIL != substringP(sub, string, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED)) {
                    coordP = (SubLObject)string_utilities.T;
                }
                csome_list_var = csome_list_var.rest();
                sub = csome_list_var.first();
            }
        }
        if (string_utilities.NIL == coordP) {
            final SubLObject strings = string_tokenize(string, (SubLObject)string_utilities.$list106, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED);
            if (Sequences.length(strings).numE((SubLObject)string_utilities.TWO_INTEGER)) {
                ans = bunge(Sequences.reverse(strings), (SubLObject)string_utilities.UNPROVIDED);
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 102515L)
    public static SubLObject char_list_to_string(final SubLObject chars) {
        final SubLObject len = Sequences.length(chars);
        SubLObject i = (SubLObject)string_utilities.ZERO_INTEGER;
        final SubLObject string = Strings.make_string(len, (SubLObject)string_utilities.UNPROVIDED);
        SubLObject cdolist_list_var = chars;
        SubLObject c = (SubLObject)string_utilities.NIL;
        c = cdolist_list_var.first();
        while (string_utilities.NIL != cdolist_list_var) {
            final SubLObject char_to_use = (SubLObject)(c.isChar() ? c : Characters.CHAR_space);
            set_nth_char(i, string, char_to_use, (SubLObject)string_utilities.NIL);
            i = Numbers.add(i, (SubLObject)string_utilities.ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            c = cdolist_list_var.first();
        }
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 102824L)
    public static SubLObject string_to_char_list(final SubLObject string) {
        SubLObject char_list = (SubLObject)string_utilities.NIL;
        SubLObject index;
        for (index = (SubLObject)string_utilities.NIL, index = (SubLObject)string_utilities.ZERO_INTEGER; !index.eql(Sequences.length(string)); index = Numbers.add(index, (SubLObject)string_utilities.ONE_INTEGER)) {
            char_list = (SubLObject)ConsesLow.cons(Sequences.elt(string, index), char_list);
        }
        return Sequences.nreverse(char_list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 103072L)
    public static SubLObject count_chars_in_string(final SubLObject string, final SubLObject character) {
        return Sequences.count(character, string, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 103217L)
    public static SubLObject some_are_substringsP(final SubLObject stringlist, final SubLObject string, SubLObject test) {
        if (test == string_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)string_utilities.EQUALP);
        }
        SubLObject v_boolean = (SubLObject)string_utilities.NIL;
        if (string_utilities.NIL == v_boolean) {
            SubLObject csome_list_var = stringlist;
            SubLObject s = (SubLObject)string_utilities.NIL;
            s = csome_list_var.first();
            while (string_utilities.NIL == v_boolean && string_utilities.NIL != csome_list_var) {
                if (string_utilities.NIL != substringP(s, string, test, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED)) {
                    v_boolean = (SubLObject)string_utilities.T;
                }
                csome_list_var = csome_list_var.rest();
                s = csome_list_var.first();
            }
        }
        return v_boolean;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 103505L)
    public static SubLObject substring_every_in_list(final SubLObject stringlist, final SubLObject string, SubLObject test) {
        if (test == string_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)string_utilities.EQUALP);
        }
        SubLObject failP = (SubLObject)string_utilities.NIL;
        if (string_utilities.NIL == failP) {
            SubLObject csome_list_var = stringlist;
            SubLObject s = (SubLObject)string_utilities.NIL;
            s = csome_list_var.first();
            while (string_utilities.NIL == failP && string_utilities.NIL != csome_list_var) {
                if (string_utilities.NIL == substringP(s, string, test, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED)) {
                    failP = (SubLObject)string_utilities.T;
                }
                csome_list_var = csome_list_var.rest();
                s = csome_list_var.first();
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(string_utilities.NIL == failP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 103819L)
    public static SubLObject target_character_found(final SubLObject v_char) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return conses_high.member(v_char, string_utilities.$target_characters$.getDynamicValue(thread), (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 103900L)
    public static SubLObject separate_sentences(final SubLObject string, SubLObject sentence_breaks) {
        if (sentence_breaks == string_utilities.UNPROVIDED) {
            sentence_breaks = (SubLObject)string_utilities.$list107;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)string_utilities.NIL;
        final SubLObject _prev_bind_0 = string_utilities.$target_characters$.currentBinding(thread);
        try {
            string_utilities.$target_characters$.bind(sentence_breaks, thread);
            SubLObject start;
            SubLObject index;
            for (start = (SubLObject)string_utilities.NIL, index = (SubLObject)string_utilities.NIL, start = (SubLObject)string_utilities.ZERO_INTEGER, index = Sequences.position_if(Symbols.symbol_function((SubLObject)string_utilities.$sym108$TARGET_CHARACTER_FOUND), string, Symbols.symbol_function((SubLObject)string_utilities.IDENTITY), start, (SubLObject)string_utilities.UNPROVIDED); string_utilities.NIL != index && !index.eql(Sequences.length(string)); index = Sequences.position_if(Symbols.symbol_function((SubLObject)string_utilities.$sym108$TARGET_CHARACTER_FOUND), string, Symbols.symbol_function((SubLObject)string_utilities.IDENTITY), start, (SubLObject)string_utilities.UNPROVIDED)) {
                ans = (SubLObject)ConsesLow.cons(trim_whitespace(Sequences.subseq(string, start, Numbers.add(index, (SubLObject)string_utilities.ONE_INTEGER))), ans);
                start = Numbers.add(index, (SubLObject)string_utilities.ONE_INTEGER);
            }
            ans = (SubLObject)ConsesLow.cons(trim_whitespace(Sequences.subseq(string, start, (SubLObject)string_utilities.UNPROVIDED)), ans);
        }
        finally {
            string_utilities.$target_characters$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(Sequences.delete(string_utilities.$empty_string$.getGlobalValue(), ans, Symbols.symbol_function((SubLObject)string_utilities.EQUAL), (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 104554L)
    public static SubLObject extract_lines(final SubLObject string) {
        if (string_utilities.NIL != string) {
            final SubLObject lines = split_string(string, (SubLObject)string_utilities.$list109);
            SubLObject new_lines = (SubLObject)string_utilities.NIL;
            SubLObject cdolist_list_var = lines;
            SubLObject line = (SubLObject)string_utilities.NIL;
            line = cdolist_list_var.first();
            while (string_utilities.NIL != cdolist_list_var) {
                final SubLObject new_line = Strings.string_trim((SubLObject)string_utilities.$list66, line);
                if (string_utilities.NIL == empty_string_p(new_line)) {
                    new_lines = (SubLObject)ConsesLow.cons(new_line, new_lines);
                }
                cdolist_list_var = cdolist_list_var.rest();
                line = cdolist_list_var.first();
            }
            return Sequences.nreverse(new_lines);
        }
        return (SubLObject)string_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 104966L)
    public static SubLObject collapse_lines(final SubLObject lines) {
        SubLObject size = (SubLObject)string_utilities.ZERO_INTEGER;
        SubLObject cdolist_list_var = lines;
        SubLObject line = (SubLObject)string_utilities.NIL;
        line = cdolist_list_var.first();
        while (string_utilities.NIL != cdolist_list_var) {
            size = Numbers.add(size, Sequences.length(line));
            cdolist_list_var = cdolist_list_var.rest();
            line = cdolist_list_var.first();
        }
        size = Numbers.add(size, Sequences.length(lines));
        final SubLObject v_new = Strings.make_string(size, (SubLObject)string_utilities.UNPROVIDED);
        SubLObject new_idx = (SubLObject)string_utilities.ZERO_INTEGER;
        SubLObject cdolist_list_var2 = lines;
        SubLObject line2 = (SubLObject)string_utilities.NIL;
        line2 = cdolist_list_var2.first();
        while (string_utilities.NIL != cdolist_list_var2) {
            SubLObject cdotimes_end_var;
            SubLObject line_idx;
            for (cdotimes_end_var = Sequences.length(line2), line_idx = (SubLObject)string_utilities.NIL, line_idx = (SubLObject)string_utilities.ZERO_INTEGER; line_idx.numL(cdotimes_end_var); line_idx = Numbers.add(line_idx, (SubLObject)string_utilities.ONE_INTEGER)) {
                set_nth_char(new_idx, v_new, Strings.sublisp_char(line2, line_idx), (SubLObject)string_utilities.UNPROVIDED);
                new_idx = Numbers.add(new_idx, (SubLObject)string_utilities.ONE_INTEGER);
            }
            set_nth_char(new_idx, v_new, (SubLObject)Characters.CHAR_newline, (SubLObject)string_utilities.UNPROVIDED);
            new_idx = Numbers.add(new_idx, (SubLObject)string_utilities.ONE_INTEGER);
            cdolist_list_var2 = cdolist_list_var2.rest();
            line2 = cdolist_list_var2.first();
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 105409L)
    public static SubLObject quotify_string(final SubLObject string) {
        final SubLObject quotables = (SubLObject)string_utilities.$list110;
        SubLObject size;
        final SubLObject length = size = Sequences.length(string);
        SubLObject end_var_$34;
        SubLObject end_var;
        SubLObject char_num;
        SubLObject v_char;
        for (end_var = (end_var_$34 = Sequences.length(string)), char_num = (SubLObject)string_utilities.NIL, char_num = (SubLObject)string_utilities.ZERO_INTEGER; !char_num.numGE(end_var_$34); char_num = number_utilities.f_1X(char_num)) {
            v_char = Strings.sublisp_char(string, char_num);
            if (string_utilities.NIL != subl_promotions.memberP(v_char, quotables, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED)) {
                size = Numbers.add(size, (SubLObject)string_utilities.ONE_INTEGER);
            }
        }
        final SubLObject ans = Strings.make_string(size, (SubLObject)string_utilities.UNPROVIDED);
        SubLObject idx = (SubLObject)string_utilities.ZERO_INTEGER;
        SubLObject end_var_$35;
        SubLObject end_var2;
        SubLObject char_num2;
        SubLObject v_char2;
        for (end_var2 = (end_var_$35 = Sequences.length(string)), char_num2 = (SubLObject)string_utilities.NIL, char_num2 = (SubLObject)string_utilities.ZERO_INTEGER; !char_num2.numGE(end_var_$35); char_num2 = number_utilities.f_1X(char_num2)) {
            v_char2 = Strings.sublisp_char(string, char_num2);
            if (string_utilities.NIL != subl_promotions.memberP(v_char2, quotables, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED)) {
                Strings.set_char(ans, idx, (SubLObject)Characters.CHAR_backslash);
                idx = Numbers.add(idx, (SubLObject)string_utilities.ONE_INTEGER);
            }
            set_nth_char(idx, ans, v_char2, (SubLObject)string_utilities.UNPROVIDED);
            idx = Numbers.add(idx, (SubLObject)string_utilities.ONE_INTEGER);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 105968L)
    public static SubLObject string_line_lengths(final SubLObject string) {
        final SubLObject string_length = Sequences.length(string);
        final SubLObject found_newlines = search_all(Strings.make_string((SubLObject)string_utilities.ONE_INTEGER, (SubLObject)Characters.CHAR_newline), string, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED);
        SubLObject line_lengths = (SubLObject)string_utilities.NIL;
        SubLObject last_pos = (SubLObject)string_utilities.ZERO_INTEGER;
        SubLObject cdolist_list_var = found_newlines;
        SubLObject found_newline = (SubLObject)string_utilities.NIL;
        found_newline = cdolist_list_var.first();
        while (string_utilities.NIL != cdolist_list_var) {
            line_lengths = (SubLObject)ConsesLow.cons(Numbers.subtract(found_newline, last_pos), line_lengths);
            last_pos = Numbers.add(found_newline, (SubLObject)string_utilities.ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            found_newline = cdolist_list_var.first();
        }
        line_lengths = (SubLObject)ConsesLow.cons(Numbers.subtract(string_length, last_pos), line_lengths);
        return Sequences.nreverse(line_lengths);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 106499L)
    public static SubLObject relevant_substrings(final SubLObject in_string) {
        SubLObject out_strings = (SubLObject)string_utilities.NIL;
        SubLObject cur_string_list = (SubLObject)string_utilities.NIL;
        SubLObject end_var_$36;
        SubLObject end_var;
        SubLObject char_num;
        SubLObject this_character;
        for (end_var = (end_var_$36 = Sequences.length(in_string)), char_num = (SubLObject)string_utilities.NIL, char_num = (SubLObject)string_utilities.ZERO_INTEGER; !char_num.numGE(end_var_$36); char_num = number_utilities.f_1X(char_num)) {
            this_character = Strings.sublisp_char(in_string, char_num);
            if (string_utilities.NIL != Characters.upper_case_p(this_character) || string_utilities.NIL == Characters.alphanumericp(this_character)) {
                if (string_utilities.NIL != cur_string_list) {
                    out_strings = (SubLObject)ConsesLow.cons(Functions.apply(Symbols.symbol_function((SubLObject)string_utilities.$sym74$CCONCATENATE), Sequences.nreverse(cur_string_list)), out_strings);
                    cur_string_list = (SubLObject)string_utilities.NIL;
                }
                if (string_utilities.NIL != Characters.upper_case_p(this_character)) {
                    this_character = Characters.char_downcase(this_character);
                }
            }
            if (string_utilities.NIL != Characters.alphanumericp(this_character)) {
                cur_string_list = (SubLObject)ConsesLow.cons(Strings.make_string((SubLObject)string_utilities.ONE_INTEGER, this_character), cur_string_list);
            }
        }
        if (string_utilities.NIL != cur_string_list) {
            out_strings = (SubLObject)ConsesLow.cons(Functions.apply(Symbols.symbol_function((SubLObject)string_utilities.$sym74$CCONCATENATE), Sequences.nreverse(cur_string_list)), out_strings);
            cur_string_list = (SubLObject)string_utilities.NIL;
        }
        return Sequences.nreverse(out_strings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 107563L)
    public static SubLObject make_valid_constant_name(final SubLObject in_string, SubLObject upcase_initial_letterP) {
        if (upcase_initial_letterP == string_utilities.UNPROVIDED) {
            upcase_initial_letterP = (SubLObject)string_utilities.T;
        }
        SubLObject cur_string_list = (SubLObject)string_utilities.NIL;
        SubLObject should_we_upcaseP = upcase_initial_letterP;
        SubLObject end_var_$37;
        SubLObject end_var;
        SubLObject char_num;
        SubLObject this_character;
        for (end_var = (end_var_$37 = Sequences.length(in_string)), char_num = (SubLObject)string_utilities.NIL, char_num = (SubLObject)string_utilities.ZERO_INTEGER; !char_num.numGE(end_var_$37); char_num = number_utilities.f_1X(char_num)) {
            this_character = Strings.sublisp_char(in_string, char_num);
            if (string_utilities.NIL != constant_completion_high.valid_constant_name_char_p(this_character)) {
                if (string_utilities.NIL != Characters.alphanumericp(this_character)) {
                    if (string_utilities.NIL != should_we_upcaseP) {
                        cur_string_list = (SubLObject)ConsesLow.cons(Strings.string_upcase(Strings.make_string((SubLObject)string_utilities.ONE_INTEGER, this_character), (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED), cur_string_list);
                        should_we_upcaseP = (SubLObject)string_utilities.NIL;
                    }
                    else {
                        cur_string_list = (SubLObject)ConsesLow.cons(Strings.make_string((SubLObject)string_utilities.ONE_INTEGER, this_character), cur_string_list);
                    }
                }
                else {
                    cur_string_list = (SubLObject)ConsesLow.cons(Strings.make_string((SubLObject)string_utilities.ONE_INTEGER, this_character), cur_string_list);
                    should_we_upcaseP = (SubLObject)string_utilities.T;
                }
            }
            else {
                should_we_upcaseP = (SubLObject)string_utilities.T;
            }
        }
        return Functions.apply(Symbols.symbol_function((SubLObject)string_utilities.$sym74$CCONCATENATE), Sequences.nreverse(cur_string_list));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 108715L)
    public static SubLObject nl_string_tokenize(final SubLObject in_string, SubLObject break_list, SubLObject embed_list, SubLObject include_stopsP, SubLObject ignore_empty_stringsP, SubLObject quote_chars, SubLObject break_list_to_return) {
        if (break_list == string_utilities.UNPROVIDED) {
            break_list = string_utilities.$whitespace_chars$.getGlobalValue();
        }
        if (embed_list == string_utilities.UNPROVIDED) {
            embed_list = (SubLObject)string_utilities.NIL;
        }
        if (include_stopsP == string_utilities.UNPROVIDED) {
            include_stopsP = (SubLObject)string_utilities.NIL;
        }
        if (ignore_empty_stringsP == string_utilities.UNPROVIDED) {
            ignore_empty_stringsP = (SubLObject)string_utilities.NIL;
        }
        if (quote_chars == string_utilities.UNPROVIDED) {
            quote_chars = (SubLObject)string_utilities.NIL;
        }
        if (break_list_to_return == string_utilities.UNPROVIDED) {
            break_list_to_return = string_utilities.$grammatical_punctuation_chars$.getGlobalValue();
        }
        return string_tokenize_int(in_string, break_list, break_list_to_return, embed_list, include_stopsP, ignore_empty_stringsP, quote_chars);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 109322L)
    public static SubLObject string_tokenize(final SubLObject in_string, SubLObject break_list, SubLObject embed_list, SubLObject include_stopsP, SubLObject ignore_empty_stringsP, SubLObject quote_chars, SubLObject break_list_to_return) {
        if (break_list == string_utilities.UNPROVIDED) {
            break_list = string_utilities.$whitespace_chars$.getGlobalValue();
        }
        if (embed_list == string_utilities.UNPROVIDED) {
            embed_list = (SubLObject)string_utilities.NIL;
        }
        if (include_stopsP == string_utilities.UNPROVIDED) {
            include_stopsP = (SubLObject)string_utilities.NIL;
        }
        if (ignore_empty_stringsP == string_utilities.UNPROVIDED) {
            ignore_empty_stringsP = (SubLObject)string_utilities.NIL;
        }
        if (quote_chars == string_utilities.UNPROVIDED) {
            quote_chars = (SubLObject)string_utilities.NIL;
        }
        if (break_list_to_return == string_utilities.UNPROVIDED) {
            break_list_to_return = (SubLObject)string_utilities.NIL;
        }
        return string_tokenize_int(in_string, break_list, break_list_to_return, embed_list, include_stopsP, ignore_empty_stringsP, quote_chars);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 109694L)
    public static SubLObject string_tokenize_int(final SubLObject in_string, SubLObject break_list, SubLObject break_list_to_return, SubLObject embed_list, SubLObject include_stopsP, SubLObject ignore_empty_stringsP, SubLObject quote_chars) {
        if (break_list == string_utilities.UNPROVIDED) {
            break_list = string_utilities.$whitespace_chars$.getGlobalValue();
        }
        if (break_list_to_return == string_utilities.UNPROVIDED) {
            break_list_to_return = (SubLObject)string_utilities.NIL;
        }
        if (embed_list == string_utilities.UNPROVIDED) {
            embed_list = (SubLObject)string_utilities.NIL;
        }
        if (include_stopsP == string_utilities.UNPROVIDED) {
            include_stopsP = (SubLObject)string_utilities.NIL;
        }
        if (ignore_empty_stringsP == string_utilities.UNPROVIDED) {
            ignore_empty_stringsP = (SubLObject)string_utilities.NIL;
        }
        if (quote_chars == string_utilities.UNPROVIDED) {
            quote_chars = (SubLObject)string_utilities.NIL;
        }
        if (string_utilities.$kw111$DEFAULT.eql(break_list)) {
            break_list = string_utilities.$whitespace_chars$.getGlobalValue();
        }
        SubLObject out_string_list = (SubLObject)string_utilities.NIL;
        SubLObject cur_string = string_utilities.$empty_string$.getGlobalValue();
        SubLObject cur_char_list = (SubLObject)string_utilities.NIL;
        SubLObject break_satisfiedP = (SubLObject)string_utilities.NIL;
        SubLObject this_quotedP = (SubLObject)string_utilities.NIL;
        final SubLObject complete_break_list = Sequences.cconcatenate(break_list_to_return, break_list);
        SubLObject end_var_$38;
        SubLObject end_var;
        SubLObject pos_now;
        SubLObject this_character;
        SubLObject cdolist_list_var;
        SubLObject this_embed;
        SubLObject this_embed_start;
        SubLObject this_embed_end;
        SubLObject pos_find;
        SubLObject quotedP;
        SubLObject doneP;
        SubLObject found_a_breakP;
        SubLObject csome_list_var;
        SubLObject this_break;
        SubLObject this_break_length;
        SubLObject post_break_pos;
        for (end_var = (end_var_$38 = Sequences.length(in_string)), pos_now = (SubLObject)string_utilities.NIL, pos_now = (SubLObject)string_utilities.ZERO_INTEGER; !pos_now.numGE(end_var_$38); pos_now = number_utilities.f_1X(pos_now)) {
            this_character = Strings.sublisp_char(in_string, pos_now);
            if (string_utilities.NIL != this_quotedP) {
                this_quotedP = (SubLObject)string_utilities.NIL;
                cur_char_list = (SubLObject)ConsesLow.cons(this_character, cur_char_list);
            }
            else if (string_utilities.NIL != conses_high.member(this_character, quote_chars, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED)) {
                this_quotedP = (SubLObject)string_utilities.T;
                cur_char_list = (SubLObject)ConsesLow.cons(this_character, cur_char_list);
            }
            else {
                cdolist_list_var = embed_list;
                this_embed = (SubLObject)string_utilities.NIL;
                this_embed = cdolist_list_var.first();
                while (string_utilities.NIL != cdolist_list_var) {
                    this_embed_start = first_char(this_embed.first());
                    this_embed_end = last_char(conses_high.second(this_embed));
                    if (this_character.eql(this_embed_start)) {
                        pos_find = (SubLObject)string_utilities.NIL;
                        quotedP = (SubLObject)string_utilities.NIL;
                        doneP = (SubLObject)string_utilities.NIL;
                        pos_find = number_utilities.f_1X(pos_now);
                        quotedP = (SubLObject)string_utilities.NIL;
                        for (doneP = (SubLObject)string_utilities.NIL; string_utilities.NIL == doneP && string_utilities.NIL == list_utilities.lengthE(in_string, pos_find, (SubLObject)string_utilities.UNPROVIDED); pos_find = number_utilities.f_1X(pos_find), quotedP = quotedP, doneP = doneP) {
                            cur_char_list = (SubLObject)ConsesLow.cons(this_character, cur_char_list);
                            pos_now = pos_find;
                            this_character = Strings.sublisp_char(in_string, pos_now);
                            if (string_utilities.NIL != quotedP) {
                                quotedP = (SubLObject)string_utilities.NIL;
                            }
                            else if (this_character.eql(this_embed_end)) {
                                doneP = (SubLObject)string_utilities.T;
                            }
                            else if (string_utilities.NIL != conses_high.member(this_character, quote_chars, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED)) {
                                quotedP = (SubLObject)string_utilities.T;
                            }
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    this_embed = cdolist_list_var.first();
                }
                found_a_breakP = (SubLObject)string_utilities.NIL;
                if (string_utilities.NIL == found_a_breakP) {
                    csome_list_var = complete_break_list;
                    this_break = (SubLObject)string_utilities.NIL;
                    this_break = csome_list_var.first();
                    while (string_utilities.NIL == found_a_breakP && string_utilities.NIL != csome_list_var) {
                        this_break_length = string_tokenize_break_length(this_break);
                        post_break_pos = Numbers.add(pos_now, this_break_length);
                        if (this_break_length.isPositive() && string_utilities.NIL != list_utilities.lengthGE(in_string, post_break_pos, (SubLObject)string_utilities.UNPROVIDED) && string_utilities.NIL != string_tokenize_break_matchP(in_string, this_break, pos_now)) {
                            found_a_breakP = (SubLObject)string_utilities.T;
                            cur_string = char_list_to_string(Sequences.nreverse(cur_char_list));
                            if (string_utilities.NIL == ignore_empty_stringsP || string_utilities.NIL == empty_string_p(cur_string)) {
                                out_string_list = (SubLObject)ConsesLow.cons(cur_string, out_string_list);
                            }
                            cur_char_list = (SubLObject)string_utilities.NIL;
                            if (string_utilities.NIL != include_stopsP || string_utilities.NIL != conses_high.member(this_break, break_list_to_return, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED)) {
                                out_string_list = (SubLObject)ConsesLow.cons(format_nil.format_nil_a(this_break), out_string_list);
                            }
                            pos_now = number_utilities.f_1_(post_break_pos);
                            this_character = Strings.sublisp_char(in_string, pos_now);
                            break_satisfiedP = (SubLObject)string_utilities.T;
                        }
                        csome_list_var = csome_list_var.rest();
                        this_break = csome_list_var.first();
                    }
                }
                if (string_utilities.NIL != break_satisfiedP) {
                    break_satisfiedP = (SubLObject)string_utilities.NIL;
                }
                else {
                    cur_char_list = (SubLObject)ConsesLow.cons(this_character, cur_char_list);
                }
            }
        }
        cur_string = char_list_to_string(Sequences.nreverse(cur_char_list));
        if (string_utilities.NIL == ignore_empty_stringsP || string_utilities.NIL == empty_string_p(cur_string)) {
            out_string_list = (SubLObject)ConsesLow.cons(cur_string, out_string_list);
        }
        if (string_utilities.NIL == out_string_list && string_utilities.NIL == ignore_empty_stringsP) {
            out_string_list = (SubLObject)ConsesLow.list(string_utilities.$empty_string$.getGlobalValue());
        }
        return Sequences.nreverse(out_string_list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 113571L)
    public static SubLObject string_tokenize_break_length(final SubLObject v_break) {
        if (v_break.isChar()) {
            return (SubLObject)string_utilities.ONE_INTEGER;
        }
        return Sequences.length(v_break);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 113696L)
    public static SubLObject string_tokenize_break_matchP(final SubLObject in_string, final SubLObject v_break, final SubLObject pos) {
        if (v_break.isChar()) {
            return Characters.charE(Strings.sublisp_char(in_string, pos), v_break);
        }
        return substring_matchP(in_string, v_break, pos, (SubLObject)string_utilities.$sym112$CHAR_);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 113964L)
    public static SubLObject listify_string(final SubLObject string, SubLObject break_chars) {
        if (break_chars == string_utilities.UNPROVIDED) {
            break_chars = string_utilities.$whitespace_chars$.getGlobalValue();
        }
        SubLObject next_char_quotedP = (SubLObject)string_utilities.NIL;
        SubLObject inside_stringP = (SubLObject)string_utilities.NIL;
        SubLObject had_negative_parensP = (SubLObject)string_utilities.NIL;
        SubLObject paren_depth = (SubLObject)string_utilities.ZERO_INTEGER;
        SubLObject char_list = (SubLObject)string_utilities.NIL;
        SubLObject error_list = (SubLObject)string_utilities.NIL;
        SubLObject out_list = (SubLObject)string_utilities.NIL;
        SubLObject end_var_$39;
        SubLObject end_var;
        SubLObject char_num;
        SubLObject this_char;
        for (end_var = (end_var_$39 = Sequences.length(string)), char_num = (SubLObject)string_utilities.NIL, char_num = (SubLObject)string_utilities.ZERO_INTEGER; !char_num.numGE(end_var_$39); char_num = number_utilities.f_1X(char_num)) {
            this_char = Strings.sublisp_char(string, char_num);
            if (string_utilities.T.equal(next_char_quotedP)) {
                char_list = (SubLObject)ConsesLow.cons(this_char, char_list);
                next_char_quotedP = (SubLObject)string_utilities.NIL;
            }
            else if (this_char.eql((SubLObject)Characters.CHAR_backslash)) {
                next_char_quotedP = (SubLObject)string_utilities.T;
            }
            else if (string_utilities.T.equal(inside_stringP)) {
                char_list = (SubLObject)ConsesLow.cons(this_char, char_list);
                if (this_char.eql((SubLObject)Characters.CHAR_quotation)) {
                    inside_stringP = (SubLObject)string_utilities.NIL;
                }
            }
            else if (this_char.eql((SubLObject)Characters.CHAR_quotation)) {
                char_list = (SubLObject)ConsesLow.cons(this_char, char_list);
                inside_stringP = (SubLObject)string_utilities.T;
            }
            else if (this_char.eql((SubLObject)Characters.CHAR_lparen)) {
                paren_depth = Numbers.add(paren_depth, (SubLObject)string_utilities.ONE_INTEGER);
                if (string_utilities.NIL != char_list) {
                    out_list = list_utilities.push_on_car(out_list, char_list_to_string(Sequences.nreverse(char_list)));
                    char_list = (SubLObject)string_utilities.NIL;
                }
                out_list = (SubLObject)ConsesLow.cons((SubLObject)string_utilities.NIL, out_list);
            }
            else if (this_char.eql((SubLObject)Characters.CHAR_rparen)) {
                paren_depth = Numbers.subtract(paren_depth, (SubLObject)string_utilities.ONE_INTEGER);
                if (string_utilities.ZERO_INTEGER.numG(paren_depth)) {
                    had_negative_parensP = (SubLObject)string_utilities.T;
                }
                if (string_utilities.NIL != char_list) {
                    out_list = list_utilities.push_on_car(out_list, char_list_to_string(Sequences.nreverse(char_list)));
                    char_list = (SubLObject)string_utilities.NIL;
                }
                out_list = list_utilities.pop_and_reverse_car_and_push_on_cadr(out_list);
            }
            else if (string_utilities.NIL != subl_promotions.memberP(this_char, break_chars, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED)) {
                if (string_utilities.NIL != char_list) {
                    out_list = list_utilities.push_on_car(out_list, char_list_to_string(Sequences.nreverse(char_list)));
                    char_list = (SubLObject)string_utilities.NIL;
                }
            }
            else {
                char_list = (SubLObject)ConsesLow.cons(this_char, char_list);
            }
        }
        if (string_utilities.NIL != char_list) {
            out_list = list_utilities.push_on_car(out_list, char_list_to_string(Sequences.nreverse(char_list)));
            char_list = (SubLObject)string_utilities.NIL;
        }
        if (string_utilities.ZERO_INTEGER.numL(paren_depth)) {
            error_list = (SubLObject)ConsesLow.cons((SubLObject)string_utilities.$str113$Unmatched_open_parenthesis, error_list);
        }
        else if (string_utilities.NIL != had_negative_parensP || string_utilities.ZERO_INTEGER.numG(paren_depth)) {
            error_list = (SubLObject)ConsesLow.cons((SubLObject)string_utilities.$str114$Unmatched_close_parenthesis, error_list);
        }
        if (string_utilities.NIL != error_list) {
            return Values.values((SubLObject)string_utilities.NIL, error_list);
        }
        return Values.values(Sequences.nreverse(out_list.first()), (SubLObject)string_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 116424L)
    public static SubLObject all_parens_matchedP(final SubLObject string, SubLObject start, SubLObject end) {
        if (start == string_utilities.UNPROVIDED) {
            start = (SubLObject)string_utilities.ZERO_INTEGER;
        }
        if (end == string_utilities.UNPROVIDED) {
            end = (SubLObject)string_utilities.NIL;
        }
        SubLObject some_unmatched_parenthesesP = (SubLObject)string_utilities.NIL;
        SubLObject paren_depth = (SubLObject)string_utilities.ZERO_INTEGER;
        SubLObject within_stringP = (SubLObject)string_utilities.NIL;
        SubLObject just_saw_an_escape_charP = (SubLObject)string_utilities.NIL;
        final SubLObject end_var = (string_utilities.NIL != end) ? end : Sequences.length(string);
        if (string_utilities.NIL == some_unmatched_parenthesesP) {
            SubLObject end_var_$40;
            SubLObject char_num;
            SubLObject pcase_var;
            SubLObject v_char;
            for (end_var_$40 = end_var, char_num = (SubLObject)string_utilities.NIL, char_num = start; string_utilities.NIL == some_unmatched_parenthesesP && !char_num.numGE(end_var_$40); char_num = number_utilities.f_1X(char_num)) {
                v_char = (pcase_var = Strings.sublisp_char(string, char_num));
                if (pcase_var.eql((SubLObject)Characters.CHAR_lparen)) {
                    if (string_utilities.NIL == within_stringP) {
                        paren_depth = Numbers.add(paren_depth, (SubLObject)string_utilities.ONE_INTEGER);
                    }
                    just_saw_an_escape_charP = (SubLObject)string_utilities.NIL;
                }
                else if (pcase_var.eql((SubLObject)Characters.CHAR_rparen)) {
                    if (string_utilities.NIL == within_stringP) {
                        if (paren_depth.isPositive()) {
                            paren_depth = Numbers.subtract(paren_depth, (SubLObject)string_utilities.ONE_INTEGER);
                        }
                        else {
                            some_unmatched_parenthesesP = (SubLObject)string_utilities.T;
                        }
                    }
                    just_saw_an_escape_charP = (SubLObject)string_utilities.NIL;
                }
                else if (pcase_var.eql((SubLObject)Characters.CHAR_quotation)) {
                    if (string_utilities.NIL == just_saw_an_escape_charP) {
                        within_stringP = (SubLObject)SubLObjectFactory.makeBoolean(string_utilities.NIL == within_stringP);
                    }
                    just_saw_an_escape_charP = (SubLObject)string_utilities.NIL;
                }
                else if (pcase_var.eql((SubLObject)Characters.CHAR_backslash)) {
                    if (string_utilities.NIL != just_saw_an_escape_charP) {
                        just_saw_an_escape_charP = (SubLObject)string_utilities.NIL;
                    }
                    else {
                        just_saw_an_escape_charP = (SubLObject)string_utilities.T;
                    }
                }
                else {
                    just_saw_an_escape_charP = (SubLObject)string_utilities.NIL;
                }
            }
        }
        if (!paren_depth.isZero()) {
            some_unmatched_parenthesesP = (SubLObject)string_utilities.T;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(string_utilities.NIL == some_unmatched_parenthesesP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 117586L)
    public static SubLObject unmatched_parentheses(final SubLObject string, SubLObject start, SubLObject end) {
        if (start == string_utilities.UNPROVIDED) {
            start = (SubLObject)string_utilities.ZERO_INTEGER;
        }
        if (end == string_utilities.UNPROVIDED) {
            end = (SubLObject)string_utilities.NIL;
        }
        SubLObject unmatched_parentheses = (SubLObject)string_utilities.NIL;
        final SubLObject paren_stack = stacks.create_stack();
        SubLObject within_stringP = (SubLObject)string_utilities.NIL;
        SubLObject just_saw_an_escape_charP = (SubLObject)string_utilities.NIL;
        SubLObject end_var_$41;
        SubLObject end_var;
        SubLObject char_num;
        SubLObject pcase_var;
        SubLObject v_char;
        for (end_var = (end_var_$41 = ((string_utilities.NIL != end) ? end : Sequences.length(string))), char_num = (SubLObject)string_utilities.NIL, char_num = start; !char_num.numGE(end_var_$41); char_num = number_utilities.f_1X(char_num)) {
            v_char = (pcase_var = Strings.sublisp_char(string, char_num));
            if (pcase_var.eql((SubLObject)Characters.CHAR_lparen)) {
                if (string_utilities.NIL == within_stringP) {
                    stacks.stack_push(char_num, paren_stack);
                }
                just_saw_an_escape_charP = (SubLObject)string_utilities.NIL;
            }
            else if (pcase_var.eql((SubLObject)Characters.CHAR_rparen)) {
                if (string_utilities.NIL == within_stringP) {
                    if (string_utilities.NIL == stacks.stack_empty_p(paren_stack)) {
                        stacks.stack_pop(paren_stack);
                    }
                    else {
                        unmatched_parentheses = (SubLObject)ConsesLow.cons(char_num, unmatched_parentheses);
                    }
                }
                just_saw_an_escape_charP = (SubLObject)string_utilities.NIL;
            }
            else if (pcase_var.eql((SubLObject)Characters.CHAR_quotation)) {
                if (string_utilities.NIL == just_saw_an_escape_charP) {
                    within_stringP = (SubLObject)SubLObjectFactory.makeBoolean(string_utilities.NIL == within_stringP);
                }
                just_saw_an_escape_charP = (SubLObject)string_utilities.NIL;
            }
            else if (pcase_var.eql((SubLObject)Characters.CHAR_backslash)) {
                if (string_utilities.NIL != just_saw_an_escape_charP) {
                    just_saw_an_escape_charP = (SubLObject)string_utilities.NIL;
                }
                else {
                    just_saw_an_escape_charP = (SubLObject)string_utilities.T;
                }
            }
            else {
                just_saw_an_escape_charP = (SubLObject)string_utilities.NIL;
            }
        }
        while (string_utilities.NIL == stacks.stack_empty_p(paren_stack)) {
            unmatched_parentheses = (SubLObject)ConsesLow.cons(stacks.stack_pop(paren_stack), unmatched_parentheses);
        }
        return Sequences.nreverse(unmatched_parentheses);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 118842L)
    public static SubLObject unmatched_parentheses_terse_hint(final SubLObject string, SubLObject start, SubLObject end) {
        if (start == string_utilities.UNPROVIDED) {
            start = (SubLObject)string_utilities.ZERO_INTEGER;
        }
        if (end == string_utilities.UNPROVIDED) {
            end = (SubLObject)string_utilities.NIL;
        }
        final SubLObject positions = unmatched_parentheses(string, start, end);
        final SubLObject hint = Strings.make_string(Sequences.length(positions), (SubLObject)string_utilities.UNPROVIDED);
        SubLObject list_var = (SubLObject)string_utilities.NIL;
        SubLObject position = (SubLObject)string_utilities.NIL;
        SubLObject index = (SubLObject)string_utilities.NIL;
        list_var = positions;
        position = list_var.first();
        for (index = (SubLObject)string_utilities.ZERO_INTEGER; string_utilities.NIL != list_var; list_var = list_var.rest(), position = list_var.first(), index = Numbers.add((SubLObject)string_utilities.ONE_INTEGER, index)) {
            Strings.set_char(hint, index, Strings.sublisp_char(string, position));
        }
        return hint;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 119151L)
    public static SubLObject byte_string_p(final SubLObject v_object) {
        if (v_object.isString()) {
            final SubLObject number = string_to_integer(v_object);
            return (SubLObject)SubLObjectFactory.makeBoolean(number.numGE((SubLObject)string_utilities.ZERO_INTEGER) && number.numLE((SubLObject)string_utilities.$int115$255));
        }
        return (SubLObject)string_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 119502L)
    public static SubLObject ip_address_p(final SubLObject v_object) {
        if (!v_object.isString()) {
            return (SubLObject)string_utilities.NIL;
        }
        final SubLObject byte_strings = string_tokenize(v_object, (SubLObject)string_utilities.$list116, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED);
        if (string_utilities.NIL == list_utilities.lengthE(byte_strings, (SubLObject)string_utilities.FOUR_INTEGER, (SubLObject)string_utilities.UNPROVIDED)) {
            return (SubLObject)string_utilities.NIL;
        }
        SubLObject cdolist_list_var = byte_strings;
        SubLObject byte_string = (SubLObject)string_utilities.NIL;
        byte_string = cdolist_list_var.first();
        while (string_utilities.NIL != cdolist_list_var) {
            if (string_utilities.NIL == byte_string_p(byte_string)) {
                return (SubLObject)string_utilities.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            byte_string = cdolist_list_var.first();
        }
        return (SubLObject)string_utilities.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 119937L)
    public static SubLObject ip_addressL(final SubLObject ip_address1, final SubLObject ip_address2) {
        final SubLObject ip_address1_strings = string_tokenize(ip_address1, (SubLObject)string_utilities.$list116, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED);
        final SubLObject ip_address2_strings = string_tokenize(ip_address2, (SubLObject)string_utilities.$list116, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED);
        if (string_utilities.NIL == list_utilities.lengthE(ip_address1_strings, (SubLObject)string_utilities.FOUR_INTEGER, (SubLObject)string_utilities.UNPROVIDED)) {
            return (SubLObject)string_utilities.NIL;
        }
        if (string_utilities.NIL == list_utilities.lengthE(ip_address2_strings, (SubLObject)string_utilities.FOUR_INTEGER, (SubLObject)string_utilities.UNPROVIDED)) {
            return (SubLObject)string_utilities.T;
        }
        SubLObject ip_address1_byte_string = (SubLObject)string_utilities.NIL;
        SubLObject ip_address1_byte_string_$42 = (SubLObject)string_utilities.NIL;
        SubLObject ip_address2_byte_string = (SubLObject)string_utilities.NIL;
        SubLObject ip_address2_byte_string_$43 = (SubLObject)string_utilities.NIL;
        ip_address1_byte_string = ip_address1_strings;
        ip_address1_byte_string_$42 = ip_address1_byte_string.first();
        ip_address2_byte_string = ip_address2_strings;
        ip_address2_byte_string_$43 = ip_address2_byte_string.first();
        while (string_utilities.NIL != ip_address2_byte_string || string_utilities.NIL != ip_address1_byte_string) {
            if (string_utilities.NIL != integer_stringL(ip_address1_byte_string_$42, ip_address2_byte_string_$43)) {
                return (SubLObject)string_utilities.T;
            }
            if (!ip_address1_byte_string_$42.equal(ip_address2_byte_string_$43)) {
                return (SubLObject)string_utilities.NIL;
            }
            ip_address1_byte_string = ip_address1_byte_string.rest();
            ip_address1_byte_string_$42 = ip_address1_byte_string.first();
            ip_address2_byte_string = ip_address2_byte_string.rest();
            ip_address2_byte_string_$43 = ip_address2_byte_string.first();
        }
        return (SubLObject)string_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 121033L)
    public static SubLObject get_trigraph_metric() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return string_utilities.$trigraph_metric$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 121092L)
    public static SubLObject set_trigraph_metric(SubLObject n) {
        if (n == string_utilities.UNPROVIDED) {
            n = (SubLObject)string_utilities.$float117$0_8;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        string_utilities.$trigraph_metric$.setDynamicValue((SubLObject)((n.isNumber() && n.numG((SubLObject)string_utilities.ZERO_INTEGER) && n.numLE((SubLObject)string_utilities.ONE_INTEGER)) ? n : string_utilities.$float117$0_8), thread);
        return string_utilities.$trigraph_metric$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 121272L)
    public static SubLObject get_trigraph_table() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)string_utilities.NIL;
        if (string_utilities.NIL == ans) {
            SubLObject csome_list_var = string_utilities.$trigraph_tables$.getDynamicValue(thread);
            SubLObject table = (SubLObject)string_utilities.NIL;
            table = csome_list_var.first();
            while (string_utilities.NIL == ans && string_utilities.NIL != csome_list_var) {
                if (string_utilities.NIL != Hashtables.gethash((SubLObject)string_utilities.$kw118$FREE, table, (SubLObject)string_utilities.UNPROVIDED)) {
                    Hashtables.sethash((SubLObject)string_utilities.$kw118$FREE, table, (SubLObject)string_utilities.NIL);
                    ans = table;
                }
                csome_list_var = csome_list_var.rest();
                table = csome_list_var.first();
            }
        }
        if (string_utilities.NIL == ans) {
            final SubLObject v_new = Hashtables.make_hash_table((SubLObject)string_utilities.$int119$50, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED);
            string_utilities.$trigraph_tables$.setDynamicValue((SubLObject)ConsesLow.cons(v_new, string_utilities.$trigraph_tables$.getDynamicValue(thread)), thread);
            ans = v_new;
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 121573L)
    public static SubLObject free_trigraph_table(final SubLObject table) {
        if (table.isHashtable()) {
            Hashtables.clrhash(table);
            Hashtables.sethash((SubLObject)string_utilities.$kw118$FREE, table, (SubLObject)string_utilities.T);
            return table;
        }
        return (SubLObject)string_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 121726L)
    public static SubLObject plural_length_to_subtract(final SubLObject string) {
        final SubLObject len = Sequences.length(string);
        if (len.numLE((SubLObject)string_utilities.TWO_INTEGER)) {
            return (SubLObject)string_utilities.ZERO_INTEGER;
        }
        if (Sequences.subseq(string, Numbers.subtract(len, (SubLObject)string_utilities.TWO_INTEGER), len).equalp((SubLObject)string_utilities.$str120$es)) {
            return (SubLObject)string_utilities.TWO_INTEGER;
        }
        if (Sequences.subseq(string, Numbers.subtract(len, (SubLObject)string_utilities.ONE_INTEGER), len).equalp((SubLObject)string_utilities.$str121$s)) {
            return (SubLObject)string_utilities.ONE_INTEGER;
        }
        return (SubLObject)string_utilities.ZERO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 121983L)
    public static SubLObject update_string1_table(final SubLObject trigraph_code, final SubLObject table) {
        SubLObject val = Hashtables.gethash(trigraph_code, table, (SubLObject)string_utilities.UNPROVIDED);
        if (val.isInteger()) {
            val = Numbers.add(val, (SubLObject)string_utilities.ONE_INTEGER);
        }
        else {
            val = (SubLObject)string_utilities.ONE_INTEGER;
        }
        Hashtables.sethash(trigraph_code, table, val);
        return trigraph_code;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 122205L)
    public static SubLObject make_trigraph_integer_code(final SubLObject code0, final SubLObject code1, final SubLObject code2) {
        return Numbers.add(code0, Numbers.multiply((SubLObject)string_utilities.$int15$1000, code1), Numbers.multiply((SubLObject)string_utilities.$int122$1000000, code2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 122313L)
    public static SubLObject string_trigraph_match_p(final SubLObject string1, final SubLObject string2, SubLObject case_sensitiveP, SubLObject metric) {
        if (case_sensitiveP == string_utilities.UNPROVIDED) {
            case_sensitiveP = (SubLObject)string_utilities.NIL;
        }
        if (metric == string_utilities.UNPROVIDED) {
            metric = get_trigraph_metric();
        }
        if (!string1.isString() || !string2.isString()) {
            return (SubLObject)string_utilities.NIL;
        }
        if (!metric.isNumber()) {
            set_trigraph_metric((SubLObject)string_utilities.UNPROVIDED);
        }
        final SubLObject table = get_trigraph_table();
        final SubLObject l1 = Numbers.subtract(Sequences.length(string1), plural_length_to_subtract(string1));
        final SubLObject l2 = Numbers.subtract(Sequences.length(string2), plural_length_to_subtract(string2));
        SubLObject s1_count = (SubLObject)string_utilities.ZERO_INTEGER;
        SubLObject s2_count = (SubLObject)string_utilities.ZERO_INTEGER;
        SubLObject intersection_count = (SubLObject)string_utilities.ZERO_INTEGER;
        SubLObject ch_count = (SubLObject)string_utilities.ZERO_INTEGER;
        SubLObject code0 = (SubLObject)string_utilities.ZERO_INTEGER;
        SubLObject code2 = (SubLObject)string_utilities.ZERO_INTEGER;
        SubLObject code3 = (SubLObject)string_utilities.ZERO_INTEGER;
        SubLObject i;
        SubLObject ch;
        SubLObject pcase_var;
        for (i = (SubLObject)string_utilities.NIL, i = (SubLObject)string_utilities.ZERO_INTEGER; i.numL(l1); i = Numbers.add(i, (SubLObject)string_utilities.ONE_INTEGER)) {
            ch = ((string_utilities.NIL != case_sensitiveP) ? Strings.sublisp_char(string1, i) : Characters.char_downcase(Strings.sublisp_char(string1, i)));
            if (string_utilities.NIL != Characters.alphanumericp(ch)) {
                pcase_var = ch_count;
                if (pcase_var.eql((SubLObject)string_utilities.ZERO_INTEGER)) {
                    code0 = Characters.char_code(ch);
                    ch_count = Numbers.add(ch_count, (SubLObject)string_utilities.ONE_INTEGER);
                }
                else if (pcase_var.eql((SubLObject)string_utilities.ONE_INTEGER)) {
                    code2 = Characters.char_code(ch);
                    ch_count = Numbers.add(ch_count, (SubLObject)string_utilities.ONE_INTEGER);
                }
                else if (pcase_var.eql((SubLObject)string_utilities.TWO_INTEGER)) {
                    code3 = Characters.char_code(ch);
                    update_string1_table(make_trigraph_integer_code(code0, code2, code3), table);
                    s1_count = Numbers.add(s1_count, (SubLObject)string_utilities.ONE_INTEGER);
                    ch_count = Numbers.add(ch_count, (SubLObject)string_utilities.ONE_INTEGER);
                }
                else {
                    code0 = code2;
                    code2 = code3;
                    code3 = Characters.char_code(ch);
                    update_string1_table(make_trigraph_integer_code(code0, code2, code3), table);
                    s1_count = Numbers.add(s1_count, (SubLObject)string_utilities.ONE_INTEGER);
                    ch_count = Numbers.add(ch_count, (SubLObject)string_utilities.ONE_INTEGER);
                }
            }
        }
        if (ch_count.numGE((SubLObject)string_utilities.ZERO_INTEGER) && ch_count.numL((SubLObject)string_utilities.THREE_INTEGER)) {
            update_string1_table(make_trigraph_integer_code(code0, code2, code3), table);
            s1_count = Numbers.add(s1_count, (SubLObject)string_utilities.ONE_INTEGER);
        }
        ch_count = (SubLObject)string_utilities.ZERO_INTEGER;
        code0 = (SubLObject)string_utilities.ZERO_INTEGER;
        code2 = (SubLObject)string_utilities.ZERO_INTEGER;
        code3 = (SubLObject)string_utilities.ZERO_INTEGER;
        SubLObject trigraph_code;
        SubLObject val;
        for (i = (SubLObject)string_utilities.NIL, i = (SubLObject)string_utilities.ZERO_INTEGER; i.numL(l2); i = Numbers.add(i, (SubLObject)string_utilities.ONE_INTEGER)) {
            ch = ((string_utilities.NIL != case_sensitiveP) ? Strings.sublisp_char(string2, i) : Characters.char_downcase(Strings.sublisp_char(string2, i)));
            if (string_utilities.NIL != Characters.alphanumericp(ch)) {
                pcase_var = ch_count;
                if (pcase_var.eql((SubLObject)string_utilities.ZERO_INTEGER)) {
                    code0 = Characters.char_code(ch);
                    ch_count = Numbers.add(ch_count, (SubLObject)string_utilities.ONE_INTEGER);
                }
                else if (pcase_var.eql((SubLObject)string_utilities.ONE_INTEGER)) {
                    code2 = Characters.char_code(ch);
                    ch_count = Numbers.add(ch_count, (SubLObject)string_utilities.ONE_INTEGER);
                }
                else if (pcase_var.eql((SubLObject)string_utilities.TWO_INTEGER)) {
                    code3 = Characters.char_code(ch);
                    trigraph_code = make_trigraph_integer_code(code0, code2, code3);
                    val = Hashtables.gethash(trigraph_code, table, (SubLObject)string_utilities.UNPROVIDED);
                    if (val.isInteger() && val.numG((SubLObject)string_utilities.ZERO_INTEGER)) {
                        intersection_count = Numbers.add(intersection_count, (SubLObject)string_utilities.ONE_INTEGER);
                        Hashtables.sethash(trigraph_code, table, Numbers.subtract(val, (SubLObject)string_utilities.ONE_INTEGER));
                    }
                    s2_count = Numbers.add(s2_count, (SubLObject)string_utilities.ONE_INTEGER);
                    ch_count = Numbers.add(ch_count, (SubLObject)string_utilities.ONE_INTEGER);
                }
                else {
                    code0 = code2;
                    code2 = code3;
                    code3 = Characters.char_code(ch);
                    trigraph_code = make_trigraph_integer_code(code0, code2, code3);
                    val = Hashtables.gethash(trigraph_code, table, (SubLObject)string_utilities.UNPROVIDED);
                    if (val.isInteger() && val.numG((SubLObject)string_utilities.ZERO_INTEGER)) {
                        intersection_count = Numbers.add(intersection_count, (SubLObject)string_utilities.ONE_INTEGER);
                        Hashtables.sethash(trigraph_code, table, Numbers.subtract(val, (SubLObject)string_utilities.ONE_INTEGER));
                    }
                    s2_count = Numbers.add(s2_count, (SubLObject)string_utilities.ONE_INTEGER);
                    ch_count = Numbers.add(ch_count, (SubLObject)string_utilities.ONE_INTEGER);
                }
            }
        }
        if (ch_count.numGE((SubLObject)string_utilities.ZERO_INTEGER) && ch_count.numL((SubLObject)string_utilities.THREE_INTEGER)) {
            final SubLObject trigraph_code2 = make_trigraph_integer_code(code0, code2, code3);
            final SubLObject val2 = Hashtables.gethash(trigraph_code2, table, (SubLObject)string_utilities.UNPROVIDED);
            if (val2.isInteger() && val2.numG((SubLObject)string_utilities.ZERO_INTEGER)) {
                intersection_count = Numbers.add(intersection_count, (SubLObject)string_utilities.ONE_INTEGER);
                Hashtables.sethash(trigraph_code2, table, Numbers.subtract(val2, (SubLObject)string_utilities.ONE_INTEGER));
            }
            s2_count = Numbers.add(s2_count, (SubLObject)string_utilities.ONE_INTEGER);
        }
        free_trigraph_table(table);
        return (SubLObject)SubLObjectFactory.makeBoolean(s1_count.numG((SubLObject)string_utilities.ZERO_INTEGER) && s2_count.numG((SubLObject)string_utilities.ZERO_INTEGER) && Numbers.divide(intersection_count, s1_count).numGE(metric) && Numbers.divide(intersection_count, s2_count).numGE(metric));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 125222L)
    public static SubLObject stringify_terms(final SubLObject terms, SubLObject separator, SubLObject last_separator) {
        if (separator == string_utilities.UNPROVIDED) {
            separator = (SubLObject)string_utilities.$str18$_;
        }
        if (last_separator == string_utilities.UNPROVIDED) {
            last_separator = separator;
        }
        return stringify_items(terms, Symbols.symbol_function((SubLObject)string_utilities.$sym123$FORT_PRINT_NAME), separator, last_separator);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 125487L)
    public static SubLObject fort_print_name(final SubLObject fort) {
        if (string_utilities.NIL != nart_handles.nart_p(fort)) {
            return str(narts_high.nart_hl_formula(fort));
        }
        if (string_utilities.NIL != constant_handles.constant_p(fort)) {
            return constants_high.constant_name(fort);
        }
        return str(fort);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 125680L)
    public static SubLObject stringify_items(final SubLObject items, SubLObject accessor, SubLObject separator, SubLObject last_separator) {
        if (accessor == string_utilities.UNPROVIDED) {
            accessor = Symbols.symbol_function((SubLObject)string_utilities.$sym124$STR_BY_TYPE);
        }
        if (separator == string_utilities.UNPROVIDED) {
            separator = (SubLObject)string_utilities.$str18$_;
        }
        if (last_separator == string_utilities.UNPROVIDED) {
            last_separator = separator;
        }
        if (string_utilities.NIL == items) {
            return string_utilities.$empty_string$.getGlobalValue();
        }
        if (string_utilities.NIL != list_utilities.singletonP(items)) {
            return str_by_type(Functions.funcall(accessor, items.first()));
        }
        final SubLObject names = Mapping.mapcar(Symbols.symbol_function((SubLObject)string_utilities.$sym124$STR_BY_TYPE), Mapping.mapcar(accessor, Sequences.reverse(items)));
        SubLObject result = Sequences.cconcatenate(conses_high.second(names), new SubLObject[] { last_separator, names.first() });
        SubLObject cdolist_list_var = conses_high.cddr(names);
        SubLObject name = (SubLObject)string_utilities.NIL;
        name = cdolist_list_var.first();
        while (string_utilities.NIL != cdolist_list_var) {
            result = Sequences.cconcatenate(name, new SubLObject[] { separator, result });
            cdolist_list_var = cdolist_list_var.rest();
            name = cdolist_list_var.first();
        }
        return PrintLow.format((SubLObject)string_utilities.NIL, result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 126191L)
    public static SubLObject str_by_type(final SubLObject v_object) {
        if (v_object.isString()) {
            return v_object;
        }
        if (string_utilities.NIL != constant_handles.constant_p(v_object)) {
            return constants_high.constant_name(v_object);
        }
        return str(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 126347L)
    public static SubLObject add_line(final SubLObject line, final SubLObject text, SubLObject nl_margin, SubLObject new_line) {
        if (nl_margin == string_utilities.UNPROVIDED) {
            nl_margin = string_utilities.$empty_string$.getGlobalValue();
        }
        if (new_line == string_utilities.UNPROVIDED) {
            new_line = (SubLObject)string_utilities.$str125$__;
        }
        if (string_utilities.NIL != empty_string_p(text)) {
            return line;
        }
        return Sequences.cconcatenate(text, new SubLObject[] { new_line, nl_margin, line });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 126873L)
    public static SubLObject cyclify_status_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)string_utilities.ZERO_INTEGER);
        return (SubLObject)string_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 126873L)
    public static SubLObject cyclify_status_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $cyclify_status_native.class) ? string_utilities.T : string_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 126873L)
    public static SubLObject cyclify_status_out_string_list(final SubLObject v_object) {
        assert string_utilities.NIL != cyclify_status_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 126873L)
    public static SubLObject cyclify_status_references_added(final SubLObject v_object) {
        assert string_utilities.NIL != cyclify_status_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 126873L)
    public static SubLObject cyclify_status_inside_quoteP(final SubLObject v_object) {
        assert string_utilities.NIL != cyclify_status_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 126873L)
    public static SubLObject cyclify_status_inside_el_var_nameP(final SubLObject v_object) {
        assert string_utilities.NIL != cyclify_status_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 126873L)
    public static SubLObject cyclify_status_already_cyclifiedP(final SubLObject v_object) {
        assert string_utilities.NIL != cyclify_status_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 126873L)
    public static SubLObject cyclify_status_escapeP(final SubLObject v_object) {
        assert string_utilities.NIL != cyclify_status_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 126873L)
    public static SubLObject cyclify_status_inside_subl_quote_fnP(final SubLObject v_object) {
        assert string_utilities.NIL != cyclify_status_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 126873L)
    public static SubLObject cyclify_status_inside_expand_subl_fnP(final SubLObject v_object) {
        assert string_utilities.NIL != cyclify_status_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 126873L)
    public static SubLObject cyclify_status_inside_expand_subl_fn_arg1P(final SubLObject v_object) {
        assert string_utilities.NIL != cyclify_status_p(v_object) : v_object;
        return v_object.getField10();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 126873L)
    public static SubLObject cyclify_status_inside_expand_subl_fn_arg2P(final SubLObject v_object) {
        assert string_utilities.NIL != cyclify_status_p(v_object) : v_object;
        return v_object.getField11();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 126873L)
    public static SubLObject cyclify_status_immediately_following_parenP(final SubLObject v_object) {
        assert string_utilities.NIL != cyclify_status_p(v_object) : v_object;
        return v_object.getField12();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 126873L)
    public static SubLObject cyclify_status_paren_count(final SubLObject v_object) {
        assert string_utilities.NIL != cyclify_status_p(v_object) : v_object;
        return v_object.getField13();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 126873L)
    public static SubLObject _csetf_cyclify_status_out_string_list(final SubLObject v_object, final SubLObject value) {
        assert string_utilities.NIL != cyclify_status_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 126873L)
    public static SubLObject _csetf_cyclify_status_references_added(final SubLObject v_object, final SubLObject value) {
        assert string_utilities.NIL != cyclify_status_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 126873L)
    public static SubLObject _csetf_cyclify_status_inside_quoteP(final SubLObject v_object, final SubLObject value) {
        assert string_utilities.NIL != cyclify_status_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 126873L)
    public static SubLObject _csetf_cyclify_status_inside_el_var_nameP(final SubLObject v_object, final SubLObject value) {
        assert string_utilities.NIL != cyclify_status_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 126873L)
    public static SubLObject _csetf_cyclify_status_already_cyclifiedP(final SubLObject v_object, final SubLObject value) {
        assert string_utilities.NIL != cyclify_status_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 126873L)
    public static SubLObject _csetf_cyclify_status_escapeP(final SubLObject v_object, final SubLObject value) {
        assert string_utilities.NIL != cyclify_status_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 126873L)
    public static SubLObject _csetf_cyclify_status_inside_subl_quote_fnP(final SubLObject v_object, final SubLObject value) {
        assert string_utilities.NIL != cyclify_status_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 126873L)
    public static SubLObject _csetf_cyclify_status_inside_expand_subl_fnP(final SubLObject v_object, final SubLObject value) {
        assert string_utilities.NIL != cyclify_status_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 126873L)
    public static SubLObject _csetf_cyclify_status_inside_expand_subl_fn_arg1P(final SubLObject v_object, final SubLObject value) {
        assert string_utilities.NIL != cyclify_status_p(v_object) : v_object;
        return v_object.setField10(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 126873L)
    public static SubLObject _csetf_cyclify_status_inside_expand_subl_fn_arg2P(final SubLObject v_object, final SubLObject value) {
        assert string_utilities.NIL != cyclify_status_p(v_object) : v_object;
        return v_object.setField11(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 126873L)
    public static SubLObject _csetf_cyclify_status_immediately_following_parenP(final SubLObject v_object, final SubLObject value) {
        assert string_utilities.NIL != cyclify_status_p(v_object) : v_object;
        return v_object.setField12(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 126873L)
    public static SubLObject _csetf_cyclify_status_paren_count(final SubLObject v_object, final SubLObject value) {
        assert string_utilities.NIL != cyclify_status_p(v_object) : v_object;
        return v_object.setField13(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 126873L)
    public static SubLObject make_cyclify_status(SubLObject arglist) {
        if (arglist == string_utilities.UNPROVIDED) {
            arglist = (SubLObject)string_utilities.NIL;
        }
        final SubLObject v_new = (SubLObject)new $cyclify_status_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)string_utilities.NIL, next = arglist; string_utilities.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)string_utilities.$kw162$OUT_STRING_LIST)) {
                _csetf_cyclify_status_out_string_list(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)string_utilities.$kw163$REFERENCES_ADDED)) {
                _csetf_cyclify_status_references_added(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)string_utilities.$kw164$INSIDE_QUOTE_)) {
                _csetf_cyclify_status_inside_quoteP(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)string_utilities.$kw165$INSIDE_EL_VAR_NAME_)) {
                _csetf_cyclify_status_inside_el_var_nameP(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)string_utilities.$kw166$ALREADY_CYCLIFIED_)) {
                _csetf_cyclify_status_already_cyclifiedP(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)string_utilities.$kw167$ESCAPE_)) {
                _csetf_cyclify_status_escapeP(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)string_utilities.$kw168$INSIDE_SUBL_QUOTE_FN_)) {
                _csetf_cyclify_status_inside_subl_quote_fnP(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)string_utilities.$kw169$INSIDE_EXPAND_SUBL_FN_)) {
                _csetf_cyclify_status_inside_expand_subl_fnP(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)string_utilities.$kw170$INSIDE_EXPAND_SUBL_FN_ARG1_)) {
                _csetf_cyclify_status_inside_expand_subl_fn_arg1P(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)string_utilities.$kw171$INSIDE_EXPAND_SUBL_FN_ARG2_)) {
                _csetf_cyclify_status_inside_expand_subl_fn_arg2P(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)string_utilities.$kw172$IMMEDIATELY_FOLLOWING_PAREN_)) {
                _csetf_cyclify_status_immediately_following_parenP(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)string_utilities.$kw173$PAREN_COUNT)) {
                _csetf_cyclify_status_paren_count(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)string_utilities.$str174$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 126873L)
    public static SubLObject visit_defstruct_cyclify_status(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)string_utilities.$kw175$BEGIN, (SubLObject)string_utilities.$sym176$MAKE_CYCLIFY_STATUS, (SubLObject)string_utilities.TWELVE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)string_utilities.$kw177$SLOT, (SubLObject)string_utilities.$kw162$OUT_STRING_LIST, cyclify_status_out_string_list(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)string_utilities.$kw177$SLOT, (SubLObject)string_utilities.$kw163$REFERENCES_ADDED, cyclify_status_references_added(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)string_utilities.$kw177$SLOT, (SubLObject)string_utilities.$kw164$INSIDE_QUOTE_, cyclify_status_inside_quoteP(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)string_utilities.$kw177$SLOT, (SubLObject)string_utilities.$kw165$INSIDE_EL_VAR_NAME_, cyclify_status_inside_el_var_nameP(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)string_utilities.$kw177$SLOT, (SubLObject)string_utilities.$kw166$ALREADY_CYCLIFIED_, cyclify_status_already_cyclifiedP(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)string_utilities.$kw177$SLOT, (SubLObject)string_utilities.$kw167$ESCAPE_, cyclify_status_escapeP(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)string_utilities.$kw177$SLOT, (SubLObject)string_utilities.$kw168$INSIDE_SUBL_QUOTE_FN_, cyclify_status_inside_subl_quote_fnP(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)string_utilities.$kw177$SLOT, (SubLObject)string_utilities.$kw169$INSIDE_EXPAND_SUBL_FN_, cyclify_status_inside_expand_subl_fnP(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)string_utilities.$kw177$SLOT, (SubLObject)string_utilities.$kw170$INSIDE_EXPAND_SUBL_FN_ARG1_, cyclify_status_inside_expand_subl_fn_arg1P(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)string_utilities.$kw177$SLOT, (SubLObject)string_utilities.$kw171$INSIDE_EXPAND_SUBL_FN_ARG2_, cyclify_status_inside_expand_subl_fn_arg2P(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)string_utilities.$kw177$SLOT, (SubLObject)string_utilities.$kw172$IMMEDIATELY_FOLLOWING_PAREN_, cyclify_status_immediately_following_parenP(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)string_utilities.$kw177$SLOT, (SubLObject)string_utilities.$kw173$PAREN_COUNT, cyclify_status_paren_count(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)string_utilities.$kw178$END, (SubLObject)string_utilities.$sym176$MAKE_CYCLIFY_STATUS, (SubLObject)string_utilities.TWELVE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 126873L)
    public static SubLObject visit_defstruct_object_cyclify_status_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_cyclify_status(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 127196L)
    public static SubLObject cyclify_string_initialize_cyclify_status() {
        final SubLObject cyclify_status = make_cyclify_status((SubLObject)string_utilities.UNPROVIDED);
        _csetf_cyclify_status_out_string_list(cyclify_status, (SubLObject)string_utilities.NIL);
        _csetf_cyclify_status_references_added(cyclify_status, (SubLObject)string_utilities.NIL);
        _csetf_cyclify_status_inside_quoteP(cyclify_status, (SubLObject)string_utilities.NIL);
        _csetf_cyclify_status_inside_el_var_nameP(cyclify_status, (SubLObject)string_utilities.NIL);
        _csetf_cyclify_status_already_cyclifiedP(cyclify_status, (SubLObject)string_utilities.NIL);
        _csetf_cyclify_status_escapeP(cyclify_status, (SubLObject)string_utilities.NIL);
        _csetf_cyclify_status_inside_subl_quote_fnP(cyclify_status, (SubLObject)string_utilities.NIL);
        _csetf_cyclify_status_inside_expand_subl_fnP(cyclify_status, (SubLObject)string_utilities.NIL);
        _csetf_cyclify_status_inside_expand_subl_fn_arg1P(cyclify_status, (SubLObject)string_utilities.NIL);
        _csetf_cyclify_status_inside_expand_subl_fn_arg2P(cyclify_status, (SubLObject)string_utilities.NIL);
        _csetf_cyclify_status_immediately_following_parenP(cyclify_status, (SubLObject)string_utilities.NIL);
        _csetf_cyclify_status_paren_count(cyclify_status, (SubLObject)string_utilities.ZERO_INTEGER);
        return cyclify_status;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 128153L)
    public static SubLObject cyclify_string_possibly_cyclify_string(SubLObject cur_string, final SubLObject cyclify_status) {
        if (string_utilities.NIL == cyclify_status_inside_quoteP(cyclify_status) && string_utilities.NIL == cyclify_status_inside_el_var_nameP(cyclify_status) && string_utilities.NIL == cyclify_status_already_cyclifiedP(cyclify_status) && string_utilities.NIL == cyclify_status_inside_expand_subl_fn_arg2P(cyclify_status) && string_utilities.NIL == cyclify_status_inside_subl_quote_fnP(cyclify_status) && string_utilities.NIL != constant_completion_high.constant_complete_exact(cur_string, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED)) {
            final SubLObject item_var = constants_high.find_constant(cur_string);
            if (string_utilities.NIL == conses_high.member(item_var, cyclify_status_references_added(cyclify_status), Symbols.symbol_function((SubLObject)string_utilities.EQL), Symbols.symbol_function((SubLObject)string_utilities.IDENTITY))) {
                _csetf_cyclify_status_references_added(cyclify_status, (SubLObject)ConsesLow.cons(item_var, cyclify_status_references_added(cyclify_status)));
            }
            cur_string = string_add_constant_reader_prefix(cur_string);
        }
        return Values.values(cur_string, cyclify_status);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 128834L)
    public static SubLObject cyclify_string_not_inside_quote_and_not_escapedP(final SubLObject cyclify_status) {
        return (SubLObject)SubLObjectFactory.makeBoolean(string_utilities.NIL == cyclify_status_inside_quoteP(cyclify_status) && string_utilities.NIL == cyclify_status_escapeP(cyclify_status));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 129039L)
    public static SubLObject cyclify_string_found_quoteP(final SubLObject this_character, final SubLObject cyclify_status) {
        return (SubLObject)SubLObjectFactory.makeBoolean(string_utilities.NIL != Characters.charE(this_character, (SubLObject)Characters.CHAR_quotation) && string_utilities.NIL == cyclify_status_escapeP(cyclify_status));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 129212L)
    public static SubLObject cyclify_string_found_open_parenP(final SubLObject this_character, final SubLObject cyclify_status) {
        return (SubLObject)SubLObjectFactory.makeBoolean(string_utilities.NIL != cyclify_string_not_inside_quote_and_not_escapedP(cyclify_status) && string_utilities.NIL != Characters.charE(this_character, (SubLObject)Characters.CHAR_lparen));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 129409L)
    public static SubLObject cyclify_string_found_close_parenP(final SubLObject this_character, final SubLObject cyclify_status) {
        return (SubLObject)SubLObjectFactory.makeBoolean(string_utilities.NIL != cyclify_string_not_inside_quote_and_not_escapedP(cyclify_status) && string_utilities.NIL != Characters.charE(this_character, (SubLObject)Characters.CHAR_rparen));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 129607L)
    public static SubLObject cyclify_string_add_to_out_string_list(final SubLObject string, final SubLObject cyclify_status) {
        _csetf_cyclify_status_out_string_list(cyclify_status, (SubLObject)ConsesLow.cons(string, cyclify_status_out_string_list(cyclify_status)));
        return cyclify_status;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 129775L)
    public static SubLObject cyclify_string_check_for_escape_to_subl(final SubLObject cur_string, final SubLObject cyclify_status) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (string_utilities.NIL != cyclify_status_immediately_following_parenP(cyclify_status) && string_utilities.NIL == cyclify_status_inside_quoteP(cyclify_status) && string_utilities.NIL == cyclify_status_inside_subl_quote_fnP(cyclify_status) && string_utilities.NIL == cyclify_status_inside_expand_subl_fn_arg2P(cyclify_status)) {
            if (string_utilities.NIL != subl_promotions.memberP(cur_string, string_utilities.$cyclify_string_subl_quote_fn_strings$.getDynamicValue(thread), (SubLObject)string_utilities.EQUAL, (SubLObject)string_utilities.UNPROVIDED)) {
                _csetf_cyclify_status_inside_subl_quote_fnP(cyclify_status, (SubLObject)string_utilities.T);
                _csetf_cyclify_status_paren_count(cyclify_status, (SubLObject)string_utilities.ONE_INTEGER);
            }
            if (string_utilities.NIL != subl_promotions.memberP(cur_string, string_utilities.$cyclify_string_expand_subl_fn_strings$.getDynamicValue(thread), (SubLObject)string_utilities.EQUAL, (SubLObject)string_utilities.UNPROVIDED)) {
                _csetf_cyclify_status_inside_expand_subl_fnP(cyclify_status, (SubLObject)string_utilities.T);
                _csetf_cyclify_status_paren_count(cyclify_status, (SubLObject)string_utilities.ONE_INTEGER);
                _csetf_cyclify_status_inside_expand_subl_fn_arg1P(cyclify_status, (SubLObject)string_utilities.NIL);
                _csetf_cyclify_status_inside_expand_subl_fn_arg2P(cyclify_status, (SubLObject)string_utilities.NIL);
            }
        }
        return cyclify_status;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 130872L)
    public static SubLObject cyclify_string_handle_last_valid_char(SubLObject cyclify_status, final SubLObject in_string, final SubLObject pos_prev) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cur_string = substring(in_string, pos_prev, (SubLObject)string_utilities.UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject cur_string_$44 = cyclify_string_possibly_cyclify_string(cur_string, cyclify_status);
        final SubLObject cyclify_status_$45 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        cur_string = cur_string_$44;
        cyclify_status = cyclify_status_$45;
        _csetf_cyclify_status_already_cyclifiedP(cyclify_status, (SubLObject)string_utilities.NIL);
        cyclify_string_add_to_out_string_list(cur_string, cyclify_status);
        return cyclify_status;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 131302L)
    public static SubLObject cyclify_string_handle_open_paren_int(final SubLObject cyclify_status) {
        _csetf_cyclify_status_paren_count(cyclify_status, Numbers.add(cyclify_status_paren_count(cyclify_status), (SubLObject)string_utilities.ONE_INTEGER));
        _csetf_cyclify_status_immediately_following_parenP(cyclify_status, (SubLObject)string_utilities.T);
        if (string_utilities.NIL != cyclify_status_inside_expand_subl_fnP(cyclify_status) && cyclify_status_paren_count(cyclify_status).numE((SubLObject)string_utilities.TWO_INTEGER)) {
            if (string_utilities.NIL == cyclify_status_inside_expand_subl_fn_arg1P(cyclify_status)) {}
            _csetf_cyclify_status_inside_expand_subl_fn_arg1P(cyclify_status, (SubLObject)string_utilities.T);
        }
        return cyclify_status;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 131942L)
    public static SubLObject cyclify_string_handle_close_paren_int(final SubLObject cyclify_status) {
        _csetf_cyclify_status_immediately_following_parenP(cyclify_status, (SubLObject)string_utilities.NIL);
        _csetf_cyclify_status_paren_count(cyclify_status, Numbers.subtract(cyclify_status_paren_count(cyclify_status), (SubLObject)string_utilities.ONE_INTEGER));
        if (string_utilities.NIL != cyclify_status_inside_subl_quote_fnP(cyclify_status) && cyclify_status_paren_count(cyclify_status).numE((SubLObject)string_utilities.ZERO_INTEGER)) {
            _csetf_cyclify_status_inside_subl_quote_fnP(cyclify_status, (SubLObject)string_utilities.NIL);
        }
        if (string_utilities.NIL != cyclify_status_inside_expand_subl_fnP(cyclify_status)) {
            if (cyclify_status_paren_count(cyclify_status).numE((SubLObject)string_utilities.ZERO_INTEGER)) {
                _csetf_cyclify_status_inside_expand_subl_fnP(cyclify_status, (SubLObject)string_utilities.NIL);
                _csetf_cyclify_status_inside_expand_subl_fn_arg1P(cyclify_status, (SubLObject)string_utilities.NIL);
                _csetf_cyclify_status_inside_expand_subl_fn_arg2P(cyclify_status, (SubLObject)string_utilities.NIL);
            }
            else if (cyclify_status_paren_count(cyclify_status).numE((SubLObject)string_utilities.ONE_INTEGER) && string_utilities.NIL != cyclify_status_inside_expand_subl_fn_arg1P(cyclify_status)) {
                _csetf_cyclify_status_inside_expand_subl_fn_arg1P(cyclify_status, (SubLObject)string_utilities.NIL);
                _csetf_cyclify_status_inside_expand_subl_fn_arg2P(cyclify_status, (SubLObject)string_utilities.T);
            }
        }
        return cyclify_status;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 133264L)
    public static SubLObject cyclify_string_handle_end_of_current_word(SubLObject cyclify_status, final SubLObject in_string, SubLObject pos_prev, final SubLObject pos_now, final SubLObject this_character) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cur_string = substring(in_string, pos_prev, pos_now);
        thread.resetMultipleValues();
        final SubLObject cur_string_$46 = cyclify_string_possibly_cyclify_string(cur_string, cyclify_status);
        final SubLObject cyclify_status_$47 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        cur_string = cur_string_$46;
        cyclify_status = cyclify_status_$47;
        cyclify_status = cyclify_string_check_for_escape_to_subl(cur_string, cyclify_status);
        if (string_utilities.NIL != cyclify_string_found_quoteP(this_character, cyclify_status)) {
            _csetf_cyclify_status_inside_quoteP(cyclify_status, (SubLObject)SubLObjectFactory.makeBoolean(string_utilities.NIL == cyclify_status_inside_quoteP(cyclify_status)));
        }
        if (string_utilities.NIL != cyclify_string_found_open_parenP(this_character, cyclify_status)) {
            cyclify_status = cyclify_string_handle_open_paren_int(cyclify_status);
        }
        if (string_utilities.NIL != cyclify_string_found_close_parenP(this_character, cyclify_status)) {
            cyclify_status = cyclify_string_handle_close_paren_int(cyclify_status);
        }
        if (string_utilities.NIL == Characters.charE(this_character, cycl_variables.el_variable_prefix_char())) {
            _csetf_cyclify_status_inside_el_var_nameP(cyclify_status, (SubLObject)string_utilities.NIL);
        }
        _csetf_cyclify_status_already_cyclifiedP(cyclify_status, (SubLObject)string_utilities.NIL);
        cur_string = Sequences.cconcatenate(cur_string, str(this_character));
        cyclify_string_add_to_out_string_list(cur_string, cyclify_status);
        pos_prev = number_utilities.f_1X(pos_now);
        return Values.values(cyclify_status, pos_prev);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 134723L)
    public static SubLObject cyclify_string(final SubLObject in_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert string_utilities.NIL != Types.stringp(in_string) : in_string;
        final SubLObject end_pos = number_utilities.f_1_(Sequences.length(in_string));
        SubLObject pos_prev = (SubLObject)string_utilities.ZERO_INTEGER;
        SubLObject cyclify_status = cyclify_string_initialize_cyclify_status();
        SubLObject end_var_$48;
        SubLObject end_var;
        SubLObject pos_now;
        SubLObject this_character;
        SubLObject last_charP;
        SubLObject cyclify_status_$49;
        SubLObject pos_prev_$50;
        SubLObject cur_string;
        for (end_var = (end_var_$48 = Sequences.length(in_string)), pos_now = (SubLObject)string_utilities.NIL, pos_now = (SubLObject)string_utilities.ZERO_INTEGER; !pos_now.numGE(end_var_$48); pos_now = number_utilities.f_1X(pos_now)) {
            this_character = Strings.sublisp_char(in_string, pos_now);
            last_charP = Equality.eql(pos_now, end_pos);
            if (string_utilities.NIL != last_charP || string_utilities.NIL == constant_completion_high.valid_constant_name_char_p(this_character)) {
                if (string_utilities.NIL != constant_completion_high.valid_constant_name_char_p(this_character)) {
                    cyclify_status = cyclify_string_handle_last_valid_char(cyclify_status, in_string, pos_prev);
                }
                else if (pos_now.numG(pos_prev)) {
                    thread.resetMultipleValues();
                    cyclify_status_$49 = cyclify_string_handle_end_of_current_word(cyclify_status, in_string, pos_prev, pos_now, this_character);
                    pos_prev_$50 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    cyclify_status = cyclify_status_$49;
                    pos_prev = pos_prev_$50;
                }
                else if (string_utilities.NIL != last_charP) {
                    cyclify_string_add_to_out_string_list(str(this_character), cyclify_status);
                    pos_prev = Numbers.add(pos_prev, (SubLObject)string_utilities.ONE_INTEGER);
                }
                else if (string_utilities.NIL != Characters.charE(this_character, (SubLObject)Characters.CHAR_hash) && string_utilities.NIL != Characters.charE(Strings.sublisp_char(in_string, number_utilities.f_1X(pos_now)), constant_reader.constant_reader_macro_char())) {
                    _csetf_cyclify_status_already_cyclifiedP(cyclify_status, (SubLObject)string_utilities.T);
                    cyclify_string_add_to_out_string_list(str(this_character), cyclify_status);
                    pos_prev = Numbers.add(pos_prev, (SubLObject)string_utilities.ONE_INTEGER);
                }
                else if (string_utilities.NIL != cyclify_string_found_quoteP(this_character, cyclify_status)) {
                    if (string_utilities.NIL != cyclify_status_inside_quoteP(cyclify_status)) {
                        cur_string = substring(in_string, pos_prev, pos_now);
                        _csetf_cyclify_status_inside_quoteP(cyclify_status, (SubLObject)string_utilities.NIL);
                        cyclify_string_add_to_out_string_list(cur_string, cyclify_status);
                        pos_prev = pos_now;
                    }
                    else {
                        _csetf_cyclify_status_inside_quoteP(cyclify_status, (SubLObject)string_utilities.T);
                    }
                }
                else if (string_utilities.NIL != cyclify_string_found_open_parenP(this_character, cyclify_status)) {
                    cyclify_status = cyclify_string_handle_open_paren_int(cyclify_status);
                    cyclify_string_add_to_out_string_list(str(this_character), cyclify_status);
                    pos_prev = Numbers.add(pos_prev, (SubLObject)string_utilities.ONE_INTEGER);
                }
                else if (string_utilities.NIL != cyclify_string_found_close_parenP(this_character, cyclify_status)) {
                    cyclify_status = cyclify_string_handle_close_paren_int(cyclify_status);
                    cyclify_string_add_to_out_string_list(str(this_character), cyclify_status);
                    pos_prev = Numbers.add(pos_prev, (SubLObject)string_utilities.ONE_INTEGER);
                }
                else if (string_utilities.NIL != Characters.charE(this_character, cycl_variables.el_variable_prefix_char())) {
                    _csetf_cyclify_status_inside_el_var_nameP(cyclify_status, (SubLObject)string_utilities.T);
                }
                else {
                    cyclify_string_add_to_out_string_list(str(this_character), cyclify_status);
                    pos_prev = Numbers.add(pos_prev, (SubLObject)string_utilities.ONE_INTEGER);
                }
                _csetf_cyclify_status_escapeP(cyclify_status, (SubLObject)SubLObjectFactory.makeBoolean(string_utilities.NIL != subl_promotions.memberP(this_character, string_utilities.$cyclify_string_quote_chars$.getDynamicValue(thread), (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED) && string_utilities.NIL == cyclify_status_escapeP(cyclify_status)));
            }
        }
        return Values.values((string_utilities.NIL != cyclify_status_out_string_list(cyclify_status)) ? Functions.apply(Symbols.symbol_function((SubLObject)string_utilities.$sym74$CCONCATENATE), Sequences.nreverse(cyclify_status_out_string_list(cyclify_status))) : string_utilities.$empty_string$.getGlobalValue(), Sequences.nreverse(cyclify_status_references_added(cyclify_status)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 138378L)
    public static SubLObject constant_names_in_string(final SubLObject string, SubLObject require_exact) {
        if (require_exact == string_utilities.UNPROVIDED) {
            require_exact = (SubLObject)string_utilities.NIL;
        }
        final SubLObject length = Sequences.length(string);
        SubLObject last_idx = (SubLObject)string_utilities.ZERO_INTEGER;
        SubLObject valid_names = (SubLObject)string_utilities.NIL;
        SubLObject invalid_names = (SubLObject)string_utilities.NIL;
        SubLObject hash_idx;
        SubLObject dollar_idx;
        SubLObject token_start;
        SubLObject token_end;
        SubLObject token_last;
        SubLObject possible_constant;
        SubLObject item_var;
        for (hash_idx = (SubLObject)string_utilities.NIL, hash_idx = Sequences.position((SubLObject)Characters.CHAR_hash, string, Symbols.symbol_function((SubLObject)string_utilities.EQL), Symbols.symbol_function((SubLObject)string_utilities.IDENTITY), last_idx, (SubLObject)string_utilities.UNPROVIDED); string_utilities.NIL != hash_idx; hash_idx = Sequences.position((SubLObject)Characters.CHAR_hash, string, Symbols.symbol_function((SubLObject)string_utilities.EQL), Symbols.symbol_function((SubLObject)string_utilities.IDENTITY), last_idx, (SubLObject)string_utilities.UNPROVIDED)) {
            dollar_idx = Numbers.add(hash_idx, (SubLObject)string_utilities.ONE_INTEGER);
            if (dollar_idx.numE(length) || !Strings.sublisp_char(string, dollar_idx).eql(constant_reader.constant_reader_macro_char())) {
                last_idx = dollar_idx;
            }
            else {
                token_start = Numbers.add(dollar_idx, (SubLObject)string_utilities.ONE_INTEGER);
                token_end = list_utilities.position_if_not(Symbols.symbol_function((SubLObject)string_utilities.$sym103$VALID_CONSTANT_NAME_CHAR_P), string, Symbols.symbol_function((SubLObject)string_utilities.IDENTITY), token_start, (SubLObject)string_utilities.UNPROVIDED);
                token_last = (SubLObject)string_utilities.NIL;
                possible_constant = (SubLObject)string_utilities.NIL;
                if (string_utilities.NIL == token_end) {
                    token_end = length;
                }
                token_last = Numbers.subtract(token_end, (SubLObject)string_utilities.ONE_INTEGER);
                possible_constant = constant_completion_high.constant_complete_exact(string, token_start, token_end);
                if (string_utilities.NIL == possible_constant && string_utilities.NIL == require_exact) {
                    if (token_last.numG(token_start) && string_utilities.NIL != Characters.char_equal((SubLObject)Characters.CHAR_s, Strings.sublisp_char(string, token_last))) {
                        possible_constant = constant_completion_high.constant_complete_exact(string, token_start, token_last);
                        if (string_utilities.NIL != possible_constant) {
                            token_end = token_last;
                        }
                        else {
                            token_last = Numbers.subtract(token_last, (SubLObject)string_utilities.ONE_INTEGER);
                            if (token_last.numG(token_start) && string_utilities.NIL != Characters.char_equal((SubLObject)Characters.CHAR_e, Strings.sublisp_char(string, token_last))) {
                                possible_constant = constant_completion_high.constant_complete_exact(string, token_start, token_last);
                                if (string_utilities.NIL != possible_constant) {
                                    token_end = token_last;
                                }
                            }
                        }
                    }
                    else if (token_last.numG(token_start) && string_utilities.NIL != Characters.char_equal((SubLObject)Characters.CHAR_question, Strings.sublisp_char(string, token_last))) {
                        possible_constant = constant_completion_high.constant_complete_exact(string, token_start, token_last);
                    }
                }
                if (string_utilities.NIL != possible_constant) {
                    item_var = constants_high.constant_name(possible_constant);
                    if (string_utilities.NIL == conses_high.member(item_var, valid_names, Symbols.symbol_function((SubLObject)string_utilities.EQUAL), Symbols.symbol_function((SubLObject)string_utilities.IDENTITY))) {
                        valid_names = (SubLObject)ConsesLow.cons(item_var, valid_names);
                    }
                }
                else {
                    item_var = substring(string, token_start, token_end);
                    if (string_utilities.NIL == conses_high.member(item_var, invalid_names, Symbols.symbol_function((SubLObject)string_utilities.EQUAL), Symbols.symbol_function((SubLObject)string_utilities.IDENTITY))) {
                        invalid_names = (SubLObject)ConsesLow.cons(item_var, invalid_names);
                    }
                }
                last_idx = token_end;
            }
        }
        return Values.values(Sequences.nreverse(valid_names), Sequences.nreverse(invalid_names));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 141620L)
    public static SubLObject invalid_constant_names_in_string(final SubLObject string, SubLObject require_exactP) {
        if (require_exactP == string_utilities.UNPROVIDED) {
            require_exactP = (SubLObject)string_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject valid_references = constant_names_in_string(string, require_exactP);
        final SubLObject invalid_references = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return invalid_references;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 142002L)
    public static SubLObject invalid_constant_names_in_stringP(final SubLObject string, SubLObject require_exactP) {
        if (require_exactP == string_utilities.UNPROVIDED) {
            require_exactP = (SubLObject)string_utilities.NIL;
        }
        return list_utilities.sublisp_boolean(invalid_constant_names_in_string(string, require_exactP));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 142283L)
    public static SubLObject nonbreak_char(final SubLObject v_char) {
        if (v_char.isChar()) {
            return (SubLObject)SubLObjectFactory.makeBoolean(string_utilities.NIL == whitespacep(v_char) && string_utilities.NIL == Sequences.find(v_char, (SubLObject)string_utilities.$str181$__, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED));
        }
        return (SubLObject)string_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 142611L)
    public static SubLObject read_string_until_char(final SubLObject stream, final SubLObject quit_char, SubLObject eof_value) {
        if (eof_value == string_utilities.UNPROVIDED) {
            eof_value = (SubLObject)string_utilities.$kw94$EOF;
        }
        SubLThread thread;
        SubLObject index;
        SubLObject v_char;
        for (thread = SubLProcess.currentSubLThread(), index = (SubLObject)string_utilities.ZERO_INTEGER, v_char = (SubLObject)string_utilities.NIL, v_char = streams_high.read_char(stream, (SubLObject)string_utilities.NIL, eof_value, (SubLObject)string_utilities.UNPROVIDED); !index.eql(string_utilities.$string_read_buffer_size$.getDynamicValue(thread)) && !v_char.eql(eof_value) && !v_char.eql(quit_char); index = Numbers.add(index, (SubLObject)string_utilities.ONE_INTEGER), v_char = streams_high.read_char(stream, (SubLObject)string_utilities.NIL, eof_value, (SubLObject)string_utilities.UNPROVIDED)) {
            Vectors.set_aref(string_utilities.$string_read_buffer$.getDynamicValue(thread), index, v_char);
        }
        if (index.eql(string_utilities.$string_read_buffer_size$.getDynamicValue(thread))) {
            Errors.cerror((SubLObject)string_utilities.$str183$quit_reading_file, (SubLObject)string_utilities.$str184$string_read_larger_than_buffer_si, string_utilities.$string_read_buffer_size$.getDynamicValue(thread));
            return eof_value;
        }
        final SubLObject v_answer = Strings.make_string(index, (SubLObject)string_utilities.UNPROVIDED);
        SubLObject i;
        for (i = (SubLObject)string_utilities.NIL, i = (SubLObject)string_utilities.ZERO_INTEGER; i.numL(index); i = Numbers.add(i, (SubLObject)string_utilities.ONE_INTEGER)) {
            set_nth_char(i, v_answer, Vectors.aref(string_utilities.$string_read_buffer$.getDynamicValue(thread), i), (SubLObject)string_utilities.UNPROVIDED);
        }
        if (string_utilities.NIL == empty_string_p(v_answer)) {
            return v_answer;
        }
        if (v_char.eql(eof_value)) {
            return eof_value;
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 143412L)
    public static SubLObject align_char(SubLObject string, final SubLObject v_char, final SubLObject field_width, final SubLObject char_psn, SubLObject fill) {
        if (fill == string_utilities.UNPROVIDED) {
            fill = (SubLObject)string_utilities.$str18$_;
        }
        final SubLObject position = char_position(v_char, string, (SubLObject)string_utilities.UNPROVIDED);
        final SubLObject length = Sequences.length(string);
        final SubLObject max = Numbers.subtract(field_width, length);
        SubLObject cdotimes_end_var;
        SubLObject n;
        for (cdotimes_end_var = Numbers.min(max, Numbers.subtract(char_psn, position, (SubLObject)string_utilities.ONE_INTEGER)), n = (SubLObject)string_utilities.NIL, n = (SubLObject)string_utilities.ZERO_INTEGER; n.numL(cdotimes_end_var); n = Numbers.add(n, (SubLObject)string_utilities.ONE_INTEGER)) {
            string = Sequences.cconcatenate(fill, string);
        }
        for (cdotimes_end_var = Numbers.min(max, Numbers.subtract(field_width, Numbers.add(Numbers.subtract(length, position, (SubLObject)string_utilities.ONE_INTEGER), char_psn))), n = (SubLObject)string_utilities.NIL, n = (SubLObject)string_utilities.ZERO_INTEGER; n.numL(cdotimes_end_var); n = Numbers.add(n, (SubLObject)string_utilities.ONE_INTEGER)) {
            string = Sequences.cconcatenate(string, fill);
        }
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 144043L)
    public static SubLObject right_justify(SubLObject string, final SubLObject field_width, SubLObject fill) {
        if (fill == string_utilities.UNPROVIDED) {
            fill = (SubLObject)string_utilities.$str18$_;
        }
        SubLObject cdotimes_end_var;
        SubLObject n;
        for (cdotimes_end_var = Numbers.subtract(field_width, Sequences.length(string)), n = (SubLObject)string_utilities.NIL, n = (SubLObject)string_utilities.ZERO_INTEGER; n.numL(cdotimes_end_var); n = Numbers.add(n, (SubLObject)string_utilities.ONE_INTEGER)) {
            string = Sequences.cconcatenate(fill, string);
        }
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 144215L)
    public static SubLObject left_justify(SubLObject string, final SubLObject field_width, SubLObject fill) {
        if (fill == string_utilities.UNPROVIDED) {
            fill = (SubLObject)string_utilities.$str18$_;
        }
        SubLObject cdotimes_end_var;
        SubLObject n;
        for (cdotimes_end_var = Numbers.subtract(field_width, Sequences.length(string)), n = (SubLObject)string_utilities.NIL, n = (SubLObject)string_utilities.ZERO_INTEGER; n.numL(cdotimes_end_var); n = Numbers.add(n, (SubLObject)string_utilities.ONE_INTEGER)) {
            string = Sequences.cconcatenate(string, fill);
        }
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 144386L)
    public static SubLObject center_string(SubLObject string, final SubLObject field_width, SubLObject fill) {
        if (fill == string_utilities.UNPROVIDED) {
            fill = (SubLObject)string_utilities.$str18$_;
        }
        final SubLObject length = Sequences.length(string);
        final SubLObject left = Numbers.truncate(Numbers.add((SubLObject)string_utilities.$float185$0_5, Numbers.divide(Numbers.subtract(field_width, length), (SubLObject)string_utilities.TWO_INTEGER)), (SubLObject)string_utilities.UNPROVIDED);
        final SubLObject right = Numbers.subtract(field_width, length, left);
        SubLObject n;
        for (n = (SubLObject)string_utilities.NIL, n = (SubLObject)string_utilities.ZERO_INTEGER; n.numL(left); n = Numbers.add(n, (SubLObject)string_utilities.ONE_INTEGER)) {
            string = Sequences.cconcatenate(fill, string);
        }
        for (n = (SubLObject)string_utilities.NIL, n = (SubLObject)string_utilities.ZERO_INTEGER; n.numL(right); n = Numbers.add(n, (SubLObject)string_utilities.ONE_INTEGER)) {
            string = Sequences.cconcatenate(string, fill);
        }
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 144856L)
    public static SubLObject print_length(final SubLObject v_object) {
        if (v_object.isString()) {
            return Sequences.length(v_object);
        }
        return Sequences.length(PrintLow.format((SubLObject)string_utilities.NIL, (SubLObject)string_utilities.$str186$_a, v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 144989L)
    public static SubLObject tab(final SubLObject indent, SubLObject stream, SubLObject new_lineP, SubLObject fill, SubLObject fill_psn) {
        if (stream == string_utilities.UNPROVIDED) {
            stream = (SubLObject)string_utilities.T;
        }
        if (new_lineP == string_utilities.UNPROVIDED) {
            new_lineP = (SubLObject)string_utilities.NIL;
        }
        if (fill == string_utilities.UNPROVIDED) {
            fill = (SubLObject)string_utilities.$str18$_;
        }
        if (fill_psn == string_utilities.UNPROVIDED) {
            fill_psn = (SubLObject)string_utilities.ONE_INTEGER;
        }
        if (string_utilities.NIL != new_lineP) {
            PrintLow.format(stream, (SubLObject)string_utilities.$str125$__);
        }
        SubLObject n;
        for (n = (SubLObject)string_utilities.NIL, n = (SubLObject)string_utilities.ZERO_INTEGER; n.numL(indent); n = Numbers.add(n, (SubLObject)string_utilities.ONE_INTEGER)) {
            if (Numbers.mod(n, fill_psn).eql((SubLObject)string_utilities.ZERO_INTEGER)) {
                PrintLow.format(stream, fill);
            }
            else {
                PrintLow.format(stream, (SubLObject)string_utilities.$str18$_);
            }
        }
        return (SubLObject)string_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 145226L)
    public static SubLObject tabstr(final SubLObject indent, SubLObject fill) {
        if (fill == string_utilities.UNPROVIDED) {
            fill = (SubLObject)string_utilities.$str18$_;
        }
        SubLObject string = string_utilities.$empty_string$.getGlobalValue();
        SubLObject n;
        for (n = (SubLObject)string_utilities.NIL, n = (SubLObject)string_utilities.ZERO_INTEGER; n.numL(indent); n = Numbers.add(n, (SubLObject)string_utilities.ONE_INTEGER)) {
            string = Sequences.cconcatenate(string, fill);
        }
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 145393L)
    public static SubLObject reduce_whitespace(SubLObject string) {
        assert string_utilities.NIL != Types.stringp(string) : string;
        final SubLObject new_size = compute_reduced_length(string);
        if (!new_size.numE(Sequences.length(string))) {
            final SubLObject new_string = Strings.make_string(new_size, (SubLObject)string_utilities.UNPROVIDED);
            SubLObject state = (SubLObject)string_utilities.$kw187$BEFORE;
            SubLObject index = (SubLObject)string_utilities.ZERO_INTEGER;
            final SubLObject string_var = string;
            SubLObject end_var_$51;
            SubLObject end_var;
            SubLObject char_num;
            SubLObject curr;
            SubLObject blankP;
            for (end_var = (end_var_$51 = Sequences.length(string_var)), char_num = (SubLObject)string_utilities.NIL, char_num = (SubLObject)string_utilities.ZERO_INTEGER; !char_num.numGE(end_var_$51); char_num = number_utilities.f_1X(char_num)) {
                curr = Strings.sublisp_char(string_var, char_num);
                blankP = whitespacep(curr);
                if (state == string_utilities.$kw187$BEFORE) {
                    if (string_utilities.NIL == blankP) {
                        set_nth_char(index, new_string, curr, (SubLObject)string_utilities.UNPROVIDED);
                        index = Numbers.add(index, (SubLObject)string_utilities.ONE_INTEGER);
                        state = (SubLObject)string_utilities.$kw188$WORD;
                    }
                }
                else if (state == string_utilities.$kw188$WORD) {
                    if (string_utilities.NIL != blankP) {
                        state = (SubLObject)string_utilities.$kw189$KEEP_BLANK;
                    }
                    else {
                        set_nth_char(index, new_string, curr, (SubLObject)string_utilities.UNPROVIDED);
                        index = Numbers.add(index, (SubLObject)string_utilities.ONE_INTEGER);
                    }
                }
                else if (state == string_utilities.$kw189$KEEP_BLANK) {
                    if (string_utilities.NIL != blankP) {
                        state = (SubLObject)string_utilities.$kw190$SKIP_BLANKS;
                    }
                    else {
                        set_nth_char(index, new_string, (SubLObject)Characters.CHAR_space, (SubLObject)string_utilities.UNPROVIDED);
                        index = Numbers.add(index, (SubLObject)string_utilities.ONE_INTEGER);
                        set_nth_char(index, new_string, curr, (SubLObject)string_utilities.UNPROVIDED);
                        index = Numbers.add(index, (SubLObject)string_utilities.ONE_INTEGER);
                        state = (SubLObject)string_utilities.$kw188$WORD;
                    }
                }
                else {
                    if (state != string_utilities.$kw190$SKIP_BLANKS) {
                        Errors.cerror((SubLObject)string_utilities.$str191$Unknown_State__S__Flaw_in_state_m, state);
                        return string;
                    }
                    if (string_utilities.NIL == blankP) {
                        set_nth_char(index, new_string, (SubLObject)Characters.CHAR_space, (SubLObject)string_utilities.UNPROVIDED);
                        index = Numbers.add(index, (SubLObject)string_utilities.ONE_INTEGER);
                        set_nth_char(index, new_string, curr, (SubLObject)string_utilities.UNPROVIDED);
                        index = Numbers.add(index, (SubLObject)string_utilities.ONE_INTEGER);
                        state = (SubLObject)string_utilities.$kw188$WORD;
                    }
                }
            }
            string = new_string;
        }
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 147012L)
    public static SubLObject compute_reduced_length(final SubLObject string) {
        assert string_utilities.NIL != Types.stringp(string) : string;
        SubLObject state = (SubLObject)string_utilities.$kw187$BEFORE;
        SubLObject count = (SubLObject)string_utilities.ZERO_INTEGER;
        SubLObject end_var_$52;
        SubLObject end_var;
        SubLObject char_num;
        SubLObject v_char;
        SubLObject blankP;
        for (end_var = (end_var_$52 = Sequences.length(string)), char_num = (SubLObject)string_utilities.NIL, char_num = (SubLObject)string_utilities.ZERO_INTEGER; !char_num.numGE(end_var_$52); char_num = number_utilities.f_1X(char_num)) {
            v_char = Strings.sublisp_char(string, char_num);
            blankP = whitespacep(v_char);
            if (state == string_utilities.$kw187$BEFORE) {
                if (string_utilities.NIL != blankP) {
                    count = Numbers.add(count, (SubLObject)string_utilities.ONE_INTEGER);
                }
                else {
                    state = (SubLObject)string_utilities.$kw188$WORD;
                }
            }
            else if (state == string_utilities.$kw188$WORD) {
                if (string_utilities.NIL != blankP) {
                    state = (SubLObject)string_utilities.$kw189$KEEP_BLANK;
                }
            }
            else if (state == string_utilities.$kw189$KEEP_BLANK) {
                if (string_utilities.NIL != blankP) {
                    state = (SubLObject)string_utilities.$kw192$SPACE;
                }
                else {
                    state = (SubLObject)string_utilities.$kw188$WORD;
                }
            }
            else {
                if (state != string_utilities.$kw192$SPACE) {
                    Errors.cerror((SubLObject)string_utilities.$str193$Unknown_state__S__Design_flaw_in_, state);
                    return Sequences.length(string);
                }
                count = Numbers.add(count, (SubLObject)string_utilities.ONE_INTEGER);
                if (string_utilities.NIL == blankP) {
                    state = (SubLObject)string_utilities.$kw188$WORD;
                }
            }
        }
        if (state == string_utilities.$kw189$KEEP_BLANK) {
            count = Numbers.add(count, (SubLObject)string_utilities.ONE_INTEGER);
        }
        else if (state == string_utilities.$kw192$SPACE) {
            count = Numbers.add(count, (SubLObject)string_utilities.TWO_INTEGER);
        }
        return Numbers.subtract(Sequences.length(string), count);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 148101L)
    public static SubLObject single_word_string_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isString() && string_utilities.NIL == multi_word_string(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 148269L)
    public static SubLObject multi_word_string(final SubLObject string) {
        assert string_utilities.NIL != Types.stringp(string) : string;
        final SubLObject first_non_whitespace = list_utilities.position_if_not(Symbols.symbol_function((SubLObject)string_utilities.$sym77$WHITESPACEP), string, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED);
        if (string_utilities.NIL == first_non_whitespace) {
            return (SubLObject)string_utilities.NIL;
        }
        final SubLObject middle_whitespace = Sequences.position_if(Symbols.symbol_function((SubLObject)string_utilities.$sym77$WHITESPACEP), string, Symbols.symbol_function((SubLObject)string_utilities.IDENTITY), first_non_whitespace, (SubLObject)string_utilities.UNPROVIDED);
        if (string_utilities.NIL == middle_whitespace) {
            return (SubLObject)string_utilities.NIL;
        }
        return Types.integerp(list_utilities.position_if_not(Symbols.symbol_function((SubLObject)string_utilities.$sym77$WHITESPACEP), string, Symbols.symbol_function((SubLObject)string_utilities.IDENTITY), middle_whitespace, (SubLObject)string_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 148739L)
    public static SubLObject multi_word_quote(final SubLObject string) {
        if (string_utilities.NIL != multi_word_string(string)) {
            return Sequences.cconcatenate((SubLObject)string_utilities.$str21$_, new SubLObject[] { string, string_utilities.$str21$_ });
        }
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 149130L)
    public static SubLObject process_file(final SubLObject infile, final SubLObject read_function, final SubLObject process_item_function, SubLObject outfile, SubLObject write_function) {
        if (outfile == string_utilities.UNPROVIDED) {
            outfile = (SubLObject)string_utilities.NIL;
        }
        if (write_function == string_utilities.UNPROVIDED) {
            write_function = (SubLObject)string_utilities.$sym194$PRIN1;
        }
        assert string_utilities.NIL != subl_promotions.function_symbol_p(process_item_function) : process_item_function;
        assert string_utilities.NIL != subl_promotions.function_symbol_p(read_function) : read_function;
        assert string_utilities.NIL != subl_promotions.function_symbol_p(write_function) : write_function;
        SubLObject stream = (SubLObject)string_utilities.NIL;
        try {
            stream = compatibility.open_text(infile, (SubLObject)string_utilities.$kw196$INPUT);
            if (!stream.isStream()) {
                Errors.error((SubLObject)string_utilities.$str197$Unable_to_open__S, infile);
            }
            final SubLObject in = stream;
            if (!in.isStream()) {
                Errors.error((SubLObject)string_utilities.$str198$Could_not_open_an_input_stream_fo, infile);
            }
            SubLObject out = (SubLObject)string_utilities.NIL;
            try {
                if (outfile.isString()) {
                    out = compatibility.open_text(outfile, (SubLObject)string_utilities.$kw199$OUTPUT);
                }
                SubLObject done = (SubLObject)string_utilities.NIL;
                while (string_utilities.NIL == done) {
                    SubLObject item = (SubLObject)string_utilities.NIL;
                    item = Functions.funcall(read_function, in);
                    if (item == string_utilities.$kw94$EOF) {
                        done = (SubLObject)string_utilities.T;
                    }
                    else {
                        SubLObject result = (SubLObject)string_utilities.NIL;
                        result = Functions.funcall(process_item_function, item);
                        if (!out.isStream()) {
                            continue;
                        }
                        Functions.funcall(write_function, result, out);
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)string_utilities.T);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (out.isStream()) {
                        streams_high.close(out, (SubLObject)string_utilities.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                }
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)string_utilities.T);
                final SubLObject _values2 = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)string_utilities.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_2);
            }
        }
        return (SubLObject)string_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 150874L)
    public static SubLObject princ_file_to_stream(final SubLObject infile, final SubLObject stream, SubLObject subst_space_for_newlineP, SubLObject ignore_lines) {
        if (subst_space_for_newlineP == string_utilities.UNPROVIDED) {
            subst_space_for_newlineP = (SubLObject)string_utilities.NIL;
        }
        if (ignore_lines == string_utilities.UNPROVIDED) {
            ignore_lines = (SubLObject)string_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject newline = (SubLObject)((string_utilities.NIL != subst_space_for_newlineP) ? string_utilities.$str18$_ : PrintLow.format((SubLObject)string_utilities.NIL, (SubLObject)string_utilities.$str125$__));
        SubLObject line = (SubLObject)string_utilities.NIL;
        SubLObject done = (SubLObject)string_utilities.NIL;
        SubLObject stream_$53 = (SubLObject)string_utilities.NIL;
        try {
            stream_$53 = compatibility.open_text(infile, (SubLObject)string_utilities.$kw196$INPUT);
            if (!stream_$53.isStream()) {
                Errors.error((SubLObject)string_utilities.$str197$Unable_to_open__S, infile);
            }
            final SubLObject in = stream_$53;
            if (string_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !in.isStream()) {
                Errors.error((SubLObject)string_utilities.$str200$__Cannot_open_input_stream_for__A, infile);
            }
            if (string_utilities.NIL != subl_promotions.positive_integer_p(ignore_lines)) {
                SubLObject n;
                for (n = (SubLObject)string_utilities.NIL, n = (SubLObject)string_utilities.ZERO_INTEGER; n.numL(ignore_lines); n = Numbers.add(n, (SubLObject)string_utilities.ONE_INTEGER)) {
                    if (string_utilities.NIL == done) {
                        line = streams_high.read_line(in, (SubLObject)string_utilities.NIL, (SubLObject)string_utilities.$kw94$EOF, (SubLObject)string_utilities.UNPROVIDED);
                        if (line == string_utilities.$kw94$EOF) {
                            done = (SubLObject)string_utilities.T;
                        }
                    }
                }
            }
            while (string_utilities.NIL == done) {
                line = streams_high.read_line(in, (SubLObject)string_utilities.NIL, (SubLObject)string_utilities.$kw94$EOF, (SubLObject)string_utilities.UNPROVIDED);
                if (line == string_utilities.$kw94$EOF) {
                    done = (SubLObject)string_utilities.T;
                }
                else {
                    print_high.princ(line, stream);
                    print_high.princ(newline, stream);
                }
            }
        }
        finally {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)string_utilities.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream_$53.isStream()) {
                    streams_high.close(stream_$53, (SubLObject)string_utilities.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return infile;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 151651L)
    public static SubLObject read_string_from_file(final SubLObject infile, SubLObject subst_space_for_newlineP, SubLObject ignore_lines) {
        if (subst_space_for_newlineP == string_utilities.UNPROVIDED) {
            subst_space_for_newlineP = (SubLObject)string_utilities.NIL;
        }
        if (ignore_lines == string_utilities.UNPROVIDED) {
            ignore_lines = (SubLObject)string_utilities.NIL;
        }
        assert string_utilities.NIL != Types.stringp(infile) : infile;
        SubLObject input_string = (SubLObject)string_utilities.NIL;
        SubLObject stream = (SubLObject)string_utilities.NIL;
        try {
            stream = streams_high.make_private_string_output_stream();
            princ_file_to_stream(infile, stream, subst_space_for_newlineP, ignore_lines);
            input_string = streams_high.get_output_stream_string(stream);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)string_utilities.T);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(stream, (SubLObject)string_utilities.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return input_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 152255L)
    public static SubLObject uniquify_string(final SubLObject string, final SubLObject other_strings, SubLObject test, SubLObject glue_string) {
        if (test == string_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)string_utilities.EQUAL);
        }
        if (glue_string == string_utilities.UNPROVIDED) {
            glue_string = (SubLObject)string_utilities.$str201$_;
        }
        return uniquify_string_via_set(string, set_utilities.construct_set_from_list(other_strings, test, (SubLObject)string_utilities.UNPROVIDED), glue_string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 153820L)
    public static SubLObject uniquify_string_via_set(final SubLObject string, final SubLObject other_string_set, SubLObject glue_string) {
        if (glue_string == string_utilities.UNPROVIDED) {
            glue_string = (SubLObject)string_utilities.$str201$_;
        }
        SubLObject curr_string = string;
        for (SubLObject uniquifying_integer = (SubLObject)string_utilities.ONE_INTEGER; string_utilities.NIL != set.set_memberP(curr_string, other_string_set); curr_string = Sequences.cconcatenate(string, new SubLObject[] { glue_string, str(uniquifying_integer) })) {
            uniquifying_integer = Numbers.add(uniquifying_integer, (SubLObject)string_utilities.ONE_INTEGER);
        }
        return curr_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 154292L)
    public static SubLObject possibly_read_from_string_ignoring_errors(final SubLObject string, final SubLObject do_itP) {
        return (string_utilities.NIL != do_itP) ? reader.read_from_string_ignoring_errors(string, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED) : string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 154447L)
    public static SubLObject random_string(final SubLObject length) {
        final SubLObject string = Strings.make_string(length, (SubLObject)string_utilities.UNPROVIDED);
        SubLObject i;
        for (i = (SubLObject)string_utilities.NIL, i = (SubLObject)string_utilities.ZERO_INTEGER; i.numL(length); i = Numbers.add(i, (SubLObject)string_utilities.ONE_INTEGER)) {
            Vectors.set_aref(string, i, Characters.code_char(Numbers.add((SubLObject)string_utilities.$int202$97, random.random((SubLObject)string_utilities.$int203$26))));
        }
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 154632L)
    public static SubLObject alphacize(final SubLObject string) {
        return list_utilities.remove_if_not((SubLObject)string_utilities.$sym56$ALPHA_CHAR_P, string, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 154713L)
    public static SubLObject alphanumericize(final SubLObject string) {
        return list_utilities.remove_if_not((SubLObject)string_utilities.$sym55$ALPHANUMERICP, string, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 154801L)
    public static SubLObject alphanumeric_or_hyphen_p(final SubLObject v_char) {
        return (SubLObject)SubLObjectFactory.makeBoolean(string_utilities.NIL != Characters.alphanumericp(v_char) || v_char.eql((SubLObject)Characters.CHAR_hyphen));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 154904L)
    public static SubLObject alpha_or_underscore_p(final SubLObject v_char) {
        return (SubLObject)SubLObjectFactory.makeBoolean(string_utilities.NIL != Characters.alpha_char_p(v_char) || v_char.eql((SubLObject)Characters.CHAR_underbar));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 155003L)
    public static SubLObject alphanumericize_admitting_hyphens(final SubLObject string) {
        return list_utilities.remove_if_not((SubLObject)string_utilities.$sym204$ALPHANUMERIC_OR_HYPHEN_P, string, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 155120L)
    public static SubLObject alphanumeric_or_number_char_p(final SubLObject v_char) {
        return (SubLObject)SubLObjectFactory.makeBoolean(string_utilities.NIL != Characters.alphanumericp(v_char) || v_char.eql((SubLObject)Characters.CHAR_hyphen) || v_char.eql((SubLObject)Characters.CHAR_period));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 155247L)
    public static SubLObject nth_letter_of_alphabet(final SubLObject n) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert string_utilities.NIL != subl_promotions.non_negative_integer_p(n) : n;
        if (string_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !n.numL((SubLObject)string_utilities.$int203$26)) {
            Errors.error((SubLObject)string_utilities.$str205$_a_is_not_a_number_between_0_and_, n);
        }
        return Characters.code_char(Numbers.add(Characters.char_code((SubLObject)Characters.CHAR_a), n));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 155522L)
    public static SubLObject nth_letter_of_alphabet_upcase(final SubLObject n) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert string_utilities.NIL != subl_promotions.non_negative_integer_p(n) : n;
        if (string_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !n.numL((SubLObject)string_utilities.$int203$26)) {
            Errors.error((SubLObject)string_utilities.$str205$_a_is_not_a_number_between_0_and_, n);
        }
        return Characters.code_char(Numbers.add(Characters.char_code((SubLObject)Characters.CHAR_A), n));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 155804L)
    public static SubLObject keyword_from_string(final SubLObject string) {
        if (string.isString() && Sequences.length(string).numG((SubLObject)string_utilities.ZERO_INTEGER)) {
            return Symbols.make_keyword(string);
        }
        return (SubLObject)string_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 156099L)
    public static SubLObject pretty_keyword_from_string(final SubLObject string) {
        final SubLObject upcased_string = Strings.string_upcase(string, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED);
        final SubLObject replaced_string = substitute_char_if(upcased_string, (SubLObject)Characters.CHAR_hyphen, (SubLObject)string_utilities.$sym206$NON_ALPHANUMERIC_P);
        return keyword_from_string(replaced_string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 156331L)
    public static SubLObject non_alphanumeric_p(final SubLObject v_char) {
        return (SubLObject)SubLObjectFactory.makeBoolean(string_utilities.NIL == Characters.alphanumericp(v_char));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 156410L)
    public static SubLObject string_from_keyword(final SubLObject keyword) {
        if (keyword.isKeyword()) {
            return Symbols.symbol_name(keyword);
        }
        return (SubLObject)string_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 156597L)
    public static SubLObject keyword_impostor_p(final SubLObject v_object) {
        if (v_object.isSymbol() && !v_object.isKeyword()) {
            final SubLObject name = Symbols.symbol_name(v_object);
            return (SubLObject)SubLObjectFactory.makeBoolean(string_utilities.ZERO_INTEGER.numL(Sequences.length(name)) && string_utilities.NIL != Characters.charE((SubLObject)Characters.CHAR_colon, Strings.sublisp_char(name, (SubLObject)string_utilities.ZERO_INTEGER)));
        }
        return (SubLObject)string_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 156897L)
    public static SubLObject keyword_from_impostor(final SubLObject keyword_impostor) {
        assert string_utilities.NIL != keyword_impostor_p(keyword_impostor) : keyword_impostor;
        final SubLObject impostor_name = Symbols.symbol_name(keyword_impostor);
        return Symbols.make_keyword(substring(impostor_name, (SubLObject)string_utilities.ONE_INTEGER, (SubLObject)string_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 157180L)
    public static SubLObject coerce_to_keyword(final SubLObject v_object) {
        if (v_object.isKeyword()) {
            return v_object;
        }
        if (v_object.isString()) {
            return keyword_from_string(v_object);
        }
        if (string_utilities.NIL != keyword_impostor_p(v_object)) {
            return keyword_from_impostor(v_object);
        }
        if (v_object.isSymbol()) {
            return keyword_from_string(Symbols.symbol_name(v_object));
        }
        return (SubLObject)string_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 157618L)
    public static SubLObject cfasl_compile_from_string(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject forms = (SubLObject)string_utilities.NIL;
        SubLObject pos = (SubLObject)string_utilities.ZERO_INTEGER;
        SubLObject eof = (SubLObject)string_utilities.NIL;
        while (string_utilities.NIL == eof) {
            thread.resetMultipleValues();
            final SubLObject form = reader.read_from_string_ignoring_errors(string, (SubLObject)string_utilities.NIL, (SubLObject)string_utilities.$kw94$EOF, pos, (SubLObject)string_utilities.UNPROVIDED);
            final SubLObject new_pos = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (form.eql((SubLObject)string_utilities.$kw94$EOF)) {
                eof = (SubLObject)string_utilities.T;
            }
            else {
                forms = (SubLObject)ConsesLow.cons(form, forms);
                pos = new_pos;
            }
        }
        forms = reader.bq_cons((SubLObject)string_utilities.$sym208$PROGN, ConsesLow.append(Sequences.nreverse(forms), (SubLObject)string_utilities.NIL));
        return forms;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 158110L)
    public static SubLObject weak_string_equal(final SubLObject string_1, final SubLObject string_2) {
        SubLObject index_1 = (SubLObject)string_utilities.ZERO_INTEGER;
        SubLObject index_2 = (SubLObject)string_utilities.ZERO_INTEGER;
        for (SubLObject total_iterations = Numbers.add(Numbers.max(Sequences.length(string_1), Sequences.length(string_2)), (SubLObject)string_utilities.ONE_INTEGER), curr_iteration = (SubLObject)string_utilities.ZERO_INTEGER, doneP = (SubLObject)string_utilities.NIL; string_utilities.NIL == doneP; doneP = Numbers.numL(total_iterations, curr_iteration)) {
            final SubLObject next_1 = Sequences.position_if((SubLObject)string_utilities.$sym55$ALPHANUMERICP, string_1, (SubLObject)string_utilities.IDENTITY, index_1, (SubLObject)string_utilities.UNPROVIDED);
            final SubLObject next_2 = Sequences.position_if((SubLObject)string_utilities.$sym55$ALPHANUMERICP, string_2, (SubLObject)string_utilities.IDENTITY, index_2, (SubLObject)string_utilities.UNPROVIDED);
            if (string_utilities.NIL == next_1 && string_utilities.NIL == next_2) {
                return (SubLObject)string_utilities.T;
            }
            if (string_utilities.NIL == next_1 || string_utilities.NIL == next_2) {
                return (SubLObject)string_utilities.NIL;
            }
            if (string_utilities.NIL == Characters.char_equal(Strings.sublisp_char(string_1, next_1), Strings.sublisp_char(string_2, next_2))) {
                return (SubLObject)string_utilities.NIL;
            }
            curr_iteration = Numbers.add(curr_iteration, (SubLObject)string_utilities.ONE_INTEGER);
            index_1 = Numbers.add(next_1, (SubLObject)string_utilities.ONE_INTEGER);
            index_2 = Numbers.add(next_2, (SubLObject)string_utilities.ONE_INTEGER);
        }
        return (SubLObject)string_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 159215L)
    public static SubLObject comma_separated_string(final SubLObject list) {
        SubLObject result = (SubLObject)string_utilities.NIL;
        SubLObject s = (SubLObject)string_utilities.NIL;
        try {
            s = streams_high.make_private_string_output_stream();
            final SubLObject first_elem = list.first();
            PrintLow.format(s, (SubLObject)string_utilities.$str186$_a, first_elem);
            SubLObject cdolist_list_var = list.rest();
            SubLObject elem = (SubLObject)string_utilities.NIL;
            elem = cdolist_list_var.first();
            while (string_utilities.NIL != cdolist_list_var) {
                PrintLow.format(s, (SubLObject)string_utilities.$str209$__a, elem);
                cdolist_list_var = cdolist_list_var.rest();
                elem = cdolist_list_var.first();
            }
            result = streams_high.get_output_stream_string(s);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)string_utilities.T);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(s, (SubLObject)string_utilities.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 159616L)
    public static SubLObject format_nil_test(final SubLObject format_control, final SubLObject format_arguments) {
        return PrintLow.format((SubLObject)string_utilities.NIL, format_control, format_arguments);
    }
    
    public static SubLObject declare_string_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "not_test_char", "NOT-TEST-CHAR", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.string_utilities", "do_words", "DO-WORDS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "empty_string_p", "EMPTY-STRING-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "empty_stringP", "EMPTY-STRING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "non_empty_string_p", "NON-EMPTY-STRING-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "every_in_string", "EVERY-IN-STRING", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "any_in_string", "ANY-IN-STRING", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "list_of_string_p", "LIST-OF-STRING-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "clear_object_to_string", "CLEAR-OBJECT-TO-STRING", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "remove_object_to_string", "REMOVE-OBJECT-TO-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "object_to_string_internal", "OBJECT-TO-STRING-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "object_to_string", "OBJECT-TO-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "fort_to_string", "FORT-TO-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "function_to_string", "FUNCTION-TO-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "to_string", "TO-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "non_nil_to_string", "NON-NIL-TO-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "to_lisp_string", "TO-LISP-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "to_string_of_length", "TO-STRING-OF-LENGTH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "first_n_list_items_to_string", "FIRST-N-LIST-ITEMS-TO-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "char_at", "CHAR-AT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "quote_string", "QUOTE-STRING", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "unquote_string", "UNQUOTE-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "quoted_stringP", "QUOTED-STRING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "str", "STR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "printed_forms_equalP", "PRINTED-FORMS-EQUAL?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "readable_p", "READABLE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "string_to_number", "STRING-TO-NUMBER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "string_to_integer", "STRING-TO-INTEGER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "integer_string_p", "INTEGER-STRING-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "integer_stringL", "INTEGER-STRING<", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "to_hex_string", "TO-HEX-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "hex_int_from_string", "HEX-INT-FROM-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "string_length_L", "STRING-LENGTH-<", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "indent", "INDENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "aref_from_end", "AREF-FROM-END", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "char_from_end", "CHAR-FROM-END", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "first_char", "FIRST-CHAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "first_of_string", "FIRST-OF-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "rest_of_string", "REST-OF-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "last_char", "LAST-CHAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "pre_add_character_to_string", "PRE-ADD-CHARACTER-TO-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "post_add_character_to_string", "POST-ADD-CHARACTER-TO-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "pre_and_post_add_character_to_string", "PRE-AND-POST-ADD-CHARACTER-TO-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "copy_string", "COPY-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "string_substitute", "STRING-SUBSTITUTE", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "string_substitute_word", "STRING-SUBSTITUTE-WORD", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "do_string_substitutions", "DO-STRING-SUBSTITUTIONS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "do_string_substitutions_robust", "DO-STRING-SUBSTITUTIONS-ROBUST", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "insert_escape_for_chars_in_string", "INSERT-ESCAPE-FOR-CHARS-IN-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "html_escaped_string_p", "HTML-ESCAPED-STRING-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "remove_last_char", "REMOVE-LAST-CHAR", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "remove_substring", "REMOVE-SUBSTRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "replace_substring", "REPLACE-SUBSTRING", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "replace_substring_once", "REPLACE-SUBSTRING-ONCE", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "nreplace_substring_at", "NREPLACE-SUBSTRING-AT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "infix", "INFIX", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "post_fix", "POST-FIX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "pre_fix", "PRE-FIX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "post_remove", "POST-REMOVE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "pre_remove", "PRE-REMOVE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "substring", "SUBSTRING", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "string_first_n", "STRING-FIRST-N", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "string_last_n", "STRING-LAST-N", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "string_butlast", "STRING-BUTLAST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "ends_with", "ENDS-WITH", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "ends_with_one_of", "ENDS-WITH-ONE-OF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "ends_with_punctuation_p", "ENDS-WITH-PUNCTUATION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "ends_with_number_p", "ENDS-WITH-NUMBER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "ends_with_number", "ENDS-WITH-NUMBER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "starts_with", "STARTS-WITH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "starts_with_one_of", "STARTS-WITH-ONE-OF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "starts_with_by_test", "STARTS-WITH-BY-TEST", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "starts_with_one_of_by_test", "STARTS-WITH-ONE-OF-BY-TEST", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "starting_string", "STARTING-STRING", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "ends_with_start_of", "ENDS-WITH-START-OF", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "number_of_commas", "NUMBER-OF-COMMAS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "comma_sub_string", "COMMA-SUB-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "concatenate_adjacent_strings", "CONCATENATE-ADJACENT-STRINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "string_starts_with_constant_reader_prefix_p", "STRING-STARTS-WITH-CONSTANT-READER-PREFIX-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "string_contains_constant_reader_prefix_p", "STRING-CONTAINS-CONSTANT-READER-PREFIX-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "string_add_constant_reader_prefix", "STRING-ADD-CONSTANT-READER-PREFIX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "string_remove_constant_reader_prefix", "STRING-REMOVE-CONSTANT-READER-PREFIX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "string_remove_constant_reader_prefixes", "STRING-REMOVE-CONSTANT-READER-PREFIXES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "one_is_starting_string", "ONE-IS-STARTING-STRING", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "strings_common_prefix", "STRINGS-COMMON-PREFIX", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "char_position", "CHAR-POSITION", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "string_upto", "STRING-UPTO", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "string_after", "STRING-AFTER", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "string_between", "STRING-BETWEEN", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "get_substring_between_tags", "GET-SUBSTRING-BETWEEN-TAGS", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "get_substring_between_tags_list", "GET-SUBSTRING-BETWEEN-TAGS-LIST", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "get_end_pos", "GET-END-POS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "strip_header", "STRIP-HEADER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "strip_trailer", "STRIP-TRAILER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "strip_first", "STRIP-FIRST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "strip_final", "STRIP-FINAL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "strip_first_if_char", "STRIP-FIRST-IF-CHAR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "strip_final_if_char", "STRIP-FINAL-IF-CHAR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "strip_first_n", "STRIP-FIRST-N", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "strip_final_n", "STRIP-FINAL-N", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "strip_punctuation", "STRIP-PUNCTUATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "strip_sentential_punctuation", "STRIP-SENTENTIAL-PUNCTUATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "ends_in_geminateP", "ENDS-IN-GEMINATE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "null_stringP", "NULL-STRING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "non_empty_stringP", "NON-EMPTY-STRING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "non_empty_cycl_stringP", "NON-EMPTY-CYCL-STRING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "non_empty_subl_stringP", "NON-EMPTY-SUBL-STRING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "char_set_position", "CHAR-SET-POSITION", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "char_type_position", "CHAR-TYPE-POSITION", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "space_p", "SPACE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "non_space_char_p", "NON-SPACE-CHAR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "tab_p", "TAB-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "non_tab_char_p", "NON-TAB-CHAR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "not_digit_char_p", "NOT-DIGIT-CHAR-P", 1, 0, false);
        new $not_digit_char_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "isa_digit_charP", "ISA-DIGIT-CHAR?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "digit_stringP", "DIGIT-STRING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "alphanumeric_stringP", "ALPHANUMERIC-STRING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "alphanumeric_char_p", "ALPHANUMERIC-CHAR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "alphabetic_char_p", "ALPHABETIC-CHAR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "partially_numeric_stringP", "PARTIALLY-NUMERIC-STRING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "alphabetic_stringP", "ALPHABETIC-STRING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "non_alphabetic_stringP", "NON-ALPHABETIC-STRING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "is_numericP", "IS-NUMERIC?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "is_numeric_rangeP", "IS-NUMERIC-RANGE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "parse_numeric_range", "PARSE-NUMERIC-RANGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "ordinal", "ORDINAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "english_ordinal_number_string_p", "ENGLISH-ORDINAL-NUMBER-STRING-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "english_ordinal_string_to_cardinal_string", "ENGLISH-ORDINAL-STRING-TO-CARDINAL-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "integer_suffix", "INTEGER-SUFFIX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "set_nth_char", "SET-NTH-CHAR", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "strip_chars_meeting_test", "STRIP-CHARS-MEETING-TEST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "substitute_char_if", "SUBSTITUTE-CHAR-IF", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "string_wXo_control_charsP", "STRING-W/O-CONTROL-CHARS?", 1, 0, false);
        new $string_wXo_control_charsP$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "control_char_p", "CONTROL-CHAR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "utf_8_combining_character_p", "UTF-8-COMBINING-CHARACTER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "integer_char_p", "INTEGER-CHAR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "contains_charP", "CONTAINS-CHAR?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "char_in_char_set", "CHAR-IN-CHAR-SET", 1, 0, false);
        new $char_in_char_set$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "split_string", "SPLIT-STRING", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "split_string_on_string", "SPLIT-STRING-ON-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "string_rotations", "STRING-ROTATIONS", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "string_rotation_int", "STRING-ROTATION-INT", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "substringP", "SUBSTRING?", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "superstringP", "SUPERSTRING?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "proper_superstringP", "PROPER-SUPERSTRING?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "substring_matchP", "SUBSTRING-MATCH?", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "search_all", "SEARCH-ALL", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "count_matches", "COUNT-MATCHES", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "subwordP", "SUBWORD?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "bunge", "BUNGE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "bunge_with_string", "BUNGE-WITH-STRING", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "offsets_of_token", "OFFSETS-OF-TOKEN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "string_of_allowed_charsP", "STRING-OF-ALLOWED-CHARS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "bunge_according_to_string", "BUNGE-ACCORDING-TO-STRING", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "bunge_according_to_string_ignoring_errors", "BUNGE-ACCORDING-TO-STRING-IGNORING-ERRORS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "concatenate_strings", "CONCATENATE-STRINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "strings_to_display_vector_strings", "STRINGS-TO-DISPLAY-VECTOR-STRINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "join_strings", "JOIN-STRINGS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "quoted_join_strings", "QUOTED-JOIN-STRINGS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "camel_case_to_underscores", "CAMEL-CASE-TO-UNDERSCORES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "capitalize_first", "CAPITALIZE-FIRST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "uncapitalize_first", "UNCAPITALIZE-FIRST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "nth_word_of_string", "NTH-WORD-OF-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "capitalize_smart", "CAPITALIZE-SMART", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "uncapitalize_smart", "UNCAPITALIZE-SMART", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "properly_capitalized_stringP", "PROPERLY-CAPITALIZED-STRING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "capitalized_string_p", "CAPITALIZED-STRING-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "string_encode_capitalization", "STRING-ENCODE-CAPITALIZATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "string_has_capitalization_p", "STRING-HAS-CAPITALIZATION-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "string_has_capitalization_p_mod", "STRING-HAS-CAPITALIZATION-P-MOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "string_has_capitalization_p_expt", "STRING-HAS-CAPITALIZATION-P-EXPT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "nstring_proper", "NSTRING-PROPER", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "string_proper", "STRING-PROPER", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "space_uncapitalize", "SPACE-UNCAPITALIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "space_dont_uncapitalize", "SPACE-DONT-UNCAPITALIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "add_space_between_chars_p", "ADD-SPACE-BETWEEN-CHARS-P", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "eat_char_p", "EAT-CHAR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "capitalize_initial_char_p", "CAPITALIZE-INITIAL-CHAR-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "string_downcase_except_acronyms", "STRING-DOWNCASE-EXCEPT-ACRONYMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "string_ndowncase_except_acronyms", "STRING-NDOWNCASE-EXCEPT-ACRONYMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "hex_char_p", "HEX-CHAR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "hex_char", "HEX-CHAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "hex_char_value", "HEX-CHAR-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "hex_char_string_p", "HEX-CHAR-STRING-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "hex_string_p", "HEX-STRING-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "hex_string_p_int", "HEX-STRING-P-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "integer_to_hex_string", "INTEGER-TO-HEX-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "f_64_bit_char_p", "64-BIT-CHAR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "f_64_bit_char", "64-BIT-CHAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "f_64_bit_char_value", "64-BIT-CHAR-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "f_64_bit_string_p", "64-BIT-STRING-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "upper_case_alphanumeric_p", "UPPER-CASE-ALPHANUMERIC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "punctuation_p", "PUNCTUATION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "punctuation_extended_p", "PUNCTUATION-EXTENDED-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "punctuation_string_p", "PUNCTUATION-STRING-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "remove_punctuation", "REMOVE-PUNCTUATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "upper_case_char_p", "UPPER-CASE-CHAR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "lower_case_char_p", "LOWER-CASE-CHAR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "upper_case_string_p", "UPPER-CASE-STRING-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "lower_case_string_p", "LOWER-CASE-STRING-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "string_list_downcase", "STRING-LIST-DOWNCASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "string_list_upcase", "STRING-LIST-UPCASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "nupcase_nth", "NUPCASE-NTH", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "nupcase_leading", "NUPCASE-LEADING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "upcase_leading", "UPCASE-LEADING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "ndowncase_nth", "NDOWNCASE-NTH", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "ndowncase_leading", "NDOWNCASE-LEADING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "downcase_leading", "DOWNCASE-LEADING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "all_chars_EP", "ALL-CHARS-=?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "string_contains_only_charsP", "STRING-CONTAINS-ONLY-CHARS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "whitespace_chars", "WHITESPACE-CHARS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "whitespace_charP", "WHITESPACE-CHAR?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "grammatical_punctuation_chars", "GRAMMATICAL-PUNCTUATION-CHARS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "grammatical_punctuation_charP", "GRAMMATICAL-PUNCTUATION-CHAR?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "trim_whitespace", "TRIM-WHITESPACE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "left_trim_whitespace", "LEFT-TRIM-WHITESPACE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "right_trim_whitespace", "RIGHT-TRIM-WHITESPACE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "trim_whitespace_if_string", "TRIM-WHITESPACE-IF-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "nsubst_whitespace", "NSUBST-WHITESPACE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "normalize_spaces", "NORMALIZE-SPACES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "subst_whitespace", "SUBST-WHITESPACE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "whitespacep", "WHITESPACEP", 1, 0, false);
        new $whitespacep$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "unicode_space_char_code_p", "UNICODE-SPACE-CHAR-CODE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "non_whitespace_p", "NON-WHITESPACE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "read_whitespace_no_hang", "READ-WHITESPACE-NO-HANG", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "whitespace_stringP", "WHITESPACE-STRING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "trim_quotes", "TRIM-QUOTES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "remove_whitespace", "REMOVE-WHITESPACE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "equal_modulo_whitespace", "EQUAL-MODULO-WHITESPACE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "equalp_modulo_whitespace", "EQUALP-MODULO-WHITESPACE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "substringP_modulo_whitespace", "SUBSTRING?-MODULO-WHITESPACE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "network_terpri", "NETWORK-TERPRI", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "add_to_buffer", "ADD-TO-BUFFER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "network_read_line", "NETWORK-READ-LINE", 0, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "read_possibly_continued_line", "READ-POSSIBLY-CONTINUED-LINE", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "find_earliest_string", "FIND-EARLIEST-STRING", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "search_last", "SEARCH-LAST", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "princ_substring", "PRINC-SUBSTRING", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "strcat", "STRCAT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "nchar_subst", "NCHAR-SUBST", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "char_subst", "CHAR-SUBST", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "nchar_subst_if", "NCHAR-SUBST-IF", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "char_subst_if", "CHAR-SUBST-IF", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "nchar_subst_if_not", "NCHAR-SUBST-IF-NOT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "char_subst_if_not", "CHAR-SUBST-IF-NOT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "string_subst", "STRING-SUBST", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "trim_sides", "TRIM-SIDES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "valid_timestring_charP", "VALID-TIMESTRING-CHAR?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "string_trim_symmetric_n", "STRING-TRIM-SYMMETRIC-N", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "break_words", "BREAK-WORDS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "sub_phrases", "SUB-PHRASES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "number_of_words", "NUMBER-OF-WORDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "first_word", "FIRST-WORD", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "substring_positions", "SUBSTRING-POSITIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "break_string", "BREAK-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "first_name_first", "FIRST-NAME-FIRST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "char_list_to_string", "CHAR-LIST-TO-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "string_to_char_list", "STRING-TO-CHAR-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "count_chars_in_string", "COUNT-CHARS-IN-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "some_are_substringsP", "SOME-ARE-SUBSTRINGS?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "substring_every_in_list", "SUBSTRING-EVERY-IN-LIST", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "target_character_found", "TARGET-CHARACTER-FOUND", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "separate_sentences", "SEPARATE-SENTENCES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "extract_lines", "EXTRACT-LINES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "collapse_lines", "COLLAPSE-LINES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "quotify_string", "QUOTIFY-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "string_line_lengths", "STRING-LINE-LENGTHS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "relevant_substrings", "RELEVANT-SUBSTRINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "make_valid_constant_name", "MAKE-VALID-CONSTANT-NAME", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "nl_string_tokenize", "NL-STRING-TOKENIZE", 1, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "string_tokenize", "STRING-TOKENIZE", 1, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "string_tokenize_int", "STRING-TOKENIZE-INT", 1, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "string_tokenize_break_length", "STRING-TOKENIZE-BREAK-LENGTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "string_tokenize_break_matchP", "STRING-TOKENIZE-BREAK-MATCH?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "listify_string", "LISTIFY-STRING", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "all_parens_matchedP", "ALL-PARENS-MATCHED?", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "unmatched_parentheses", "UNMATCHED-PARENTHESES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "unmatched_parentheses_terse_hint", "UNMATCHED-PARENTHESES-TERSE-HINT", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "byte_string_p", "BYTE-STRING-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "ip_address_p", "IP-ADDRESS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "ip_addressL", "IP-ADDRESS<", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "get_trigraph_metric", "GET-TRIGRAPH-METRIC", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "set_trigraph_metric", "SET-TRIGRAPH-METRIC", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "get_trigraph_table", "GET-TRIGRAPH-TABLE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "free_trigraph_table", "FREE-TRIGRAPH-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "plural_length_to_subtract", "PLURAL-LENGTH-TO-SUBTRACT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "update_string1_table", "UPDATE-STRING1-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "make_trigraph_integer_code", "MAKE-TRIGRAPH-INTEGER-CODE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "string_trigraph_match_p", "STRING-TRIGRAPH-MATCH-P", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "stringify_terms", "STRINGIFY-TERMS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "fort_print_name", "FORT-PRINT-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "stringify_items", "STRINGIFY-ITEMS", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "str_by_type", "STR-BY-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "add_line", "ADD-LINE", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "cyclify_status_print_function_trampoline", "CYCLIFY-STATUS-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "cyclify_status_p", "CYCLIFY-STATUS-P", 1, 0, false);
        new $cyclify_status_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "cyclify_status_out_string_list", "CYCLIFY-STATUS-OUT-STRING-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "cyclify_status_references_added", "CYCLIFY-STATUS-REFERENCES-ADDED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "cyclify_status_inside_quoteP", "CYCLIFY-STATUS-INSIDE-QUOTE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "cyclify_status_inside_el_var_nameP", "CYCLIFY-STATUS-INSIDE-EL-VAR-NAME?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "cyclify_status_already_cyclifiedP", "CYCLIFY-STATUS-ALREADY-CYCLIFIED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "cyclify_status_escapeP", "CYCLIFY-STATUS-ESCAPE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "cyclify_status_inside_subl_quote_fnP", "CYCLIFY-STATUS-INSIDE-SUBL-QUOTE-FN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "cyclify_status_inside_expand_subl_fnP", "CYCLIFY-STATUS-INSIDE-EXPAND-SUBL-FN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "cyclify_status_inside_expand_subl_fn_arg1P", "CYCLIFY-STATUS-INSIDE-EXPAND-SUBL-FN-ARG1?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "cyclify_status_inside_expand_subl_fn_arg2P", "CYCLIFY-STATUS-INSIDE-EXPAND-SUBL-FN-ARG2?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "cyclify_status_immediately_following_parenP", "CYCLIFY-STATUS-IMMEDIATELY-FOLLOWING-PAREN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "cyclify_status_paren_count", "CYCLIFY-STATUS-PAREN-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "_csetf_cyclify_status_out_string_list", "_CSETF-CYCLIFY-STATUS-OUT-STRING-LIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "_csetf_cyclify_status_references_added", "_CSETF-CYCLIFY-STATUS-REFERENCES-ADDED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "_csetf_cyclify_status_inside_quoteP", "_CSETF-CYCLIFY-STATUS-INSIDE-QUOTE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "_csetf_cyclify_status_inside_el_var_nameP", "_CSETF-CYCLIFY-STATUS-INSIDE-EL-VAR-NAME?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "_csetf_cyclify_status_already_cyclifiedP", "_CSETF-CYCLIFY-STATUS-ALREADY-CYCLIFIED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "_csetf_cyclify_status_escapeP", "_CSETF-CYCLIFY-STATUS-ESCAPE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "_csetf_cyclify_status_inside_subl_quote_fnP", "_CSETF-CYCLIFY-STATUS-INSIDE-SUBL-QUOTE-FN?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "_csetf_cyclify_status_inside_expand_subl_fnP", "_CSETF-CYCLIFY-STATUS-INSIDE-EXPAND-SUBL-FN?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "_csetf_cyclify_status_inside_expand_subl_fn_arg1P", "_CSETF-CYCLIFY-STATUS-INSIDE-EXPAND-SUBL-FN-ARG1?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "_csetf_cyclify_status_inside_expand_subl_fn_arg2P", "_CSETF-CYCLIFY-STATUS-INSIDE-EXPAND-SUBL-FN-ARG2?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "_csetf_cyclify_status_immediately_following_parenP", "_CSETF-CYCLIFY-STATUS-IMMEDIATELY-FOLLOWING-PAREN?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "_csetf_cyclify_status_paren_count", "_CSETF-CYCLIFY-STATUS-PAREN-COUNT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "make_cyclify_status", "MAKE-CYCLIFY-STATUS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "visit_defstruct_cyclify_status", "VISIT-DEFSTRUCT-CYCLIFY-STATUS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "visit_defstruct_object_cyclify_status_method", "VISIT-DEFSTRUCT-OBJECT-CYCLIFY-STATUS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "cyclify_string_initialize_cyclify_status", "CYCLIFY-STRING-INITIALIZE-CYCLIFY-STATUS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "cyclify_string_possibly_cyclify_string", "CYCLIFY-STRING-POSSIBLY-CYCLIFY-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "cyclify_string_not_inside_quote_and_not_escapedP", "CYCLIFY-STRING-NOT-INSIDE-QUOTE-AND-NOT-ESCAPED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "cyclify_string_found_quoteP", "CYCLIFY-STRING-FOUND-QUOTE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "cyclify_string_found_open_parenP", "CYCLIFY-STRING-FOUND-OPEN-PAREN?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "cyclify_string_found_close_parenP", "CYCLIFY-STRING-FOUND-CLOSE-PAREN?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "cyclify_string_add_to_out_string_list", "CYCLIFY-STRING-ADD-TO-OUT-STRING-LIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "cyclify_string_check_for_escape_to_subl", "CYCLIFY-STRING-CHECK-FOR-ESCAPE-TO-SUBL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "cyclify_string_handle_last_valid_char", "CYCLIFY-STRING-HANDLE-LAST-VALID-CHAR", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "cyclify_string_handle_open_paren_int", "CYCLIFY-STRING-HANDLE-OPEN-PAREN-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "cyclify_string_handle_close_paren_int", "CYCLIFY-STRING-HANDLE-CLOSE-PAREN-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "cyclify_string_handle_end_of_current_word", "CYCLIFY-STRING-HANDLE-END-OF-CURRENT-WORD", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "cyclify_string", "CYCLIFY-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "constant_names_in_string", "CONSTANT-NAMES-IN-STRING", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "invalid_constant_names_in_string", "INVALID-CONSTANT-NAMES-IN-STRING", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "invalid_constant_names_in_stringP", "INVALID-CONSTANT-NAMES-IN-STRING?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "nonbreak_char", "NONBREAK-CHAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "read_string_until_char", "READ-STRING-UNTIL-CHAR", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "align_char", "ALIGN-CHAR", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "right_justify", "RIGHT-JUSTIFY", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "left_justify", "LEFT-JUSTIFY", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "center_string", "CENTER-STRING", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "print_length", "PRINT-LENGTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "tab", "TAB", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "tabstr", "TABSTR", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "reduce_whitespace", "REDUCE-WHITESPACE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "compute_reduced_length", "COMPUTE-REDUCED-LENGTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "single_word_string_p", "SINGLE-WORD-STRING-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "multi_word_string", "MULTI-WORD-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "multi_word_quote", "MULTI-WORD-QUOTE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "process_file", "PROCESS-FILE", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "princ_file_to_stream", "PRINC-FILE-TO-STREAM", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "read_string_from_file", "READ-STRING-FROM-FILE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "uniquify_string", "UNIQUIFY-STRING", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "uniquify_string_via_set", "UNIQUIFY-STRING-VIA-SET", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "possibly_read_from_string_ignoring_errors", "POSSIBLY-READ-FROM-STRING-IGNORING-ERRORS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "random_string", "RANDOM-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "alphacize", "ALPHACIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "alphanumericize", "ALPHANUMERICIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "alphanumeric_or_hyphen_p", "ALPHANUMERIC-OR-HYPHEN-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "alpha_or_underscore_p", "ALPHA-OR-UNDERSCORE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "alphanumericize_admitting_hyphens", "ALPHANUMERICIZE-ADMITTING-HYPHENS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "alphanumeric_or_number_char_p", "ALPHANUMERIC-OR-NUMBER-CHAR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "nth_letter_of_alphabet", "NTH-LETTER-OF-ALPHABET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "nth_letter_of_alphabet_upcase", "NTH-LETTER-OF-ALPHABET-UPCASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "keyword_from_string", "KEYWORD-FROM-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "pretty_keyword_from_string", "PRETTY-KEYWORD-FROM-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "non_alphanumeric_p", "NON-ALPHANUMERIC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "string_from_keyword", "STRING-FROM-KEYWORD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "keyword_impostor_p", "KEYWORD-IMPOSTOR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "keyword_from_impostor", "KEYWORD-FROM-IMPOSTOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "coerce_to_keyword", "COERCE-TO-KEYWORD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "cfasl_compile_from_string", "CFASL-COMPILE-FROM-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "weak_string_equal", "WEAK-STRING-EQUAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "comma_separated_string", "COMMA-SEPARATED-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_utilities", "format_nil_test", "FORMAT-NIL-TEST", 2, 0, false);
        return (SubLObject)string_utilities.NIL;
    }
    
    public static SubLObject init_string_utilities_file() {
        string_utilities.$point_char$ = SubLFiles.defconstant("*POINT-CHAR*", (SubLObject)Characters.CHAR_period);
        string_utilities.$space_char$ = SubLFiles.defconstant("*SPACE-CHAR*", (SubLObject)Characters.CHAR_space);
        string_utilities.$tab_char$ = SubLFiles.defconstant("*TAB-CHAR*", (SubLObject)Characters.CHAR_tab);
        string_utilities.$empty_string$ = SubLFiles.defconstant("*EMPTY-STRING*", (SubLObject)string_utilities.$str0$);
        string_utilities.$new_line_string$ = SubLFiles.defconstant("*NEW-LINE-STRING*", Strings.make_string((SubLObject)string_utilities.ONE_INTEGER, (SubLObject)Characters.CHAR_newline));
        string_utilities.$test_char$ = SubLFiles.defvar("*TEST-CHAR*", (SubLObject)string_utilities.NIL);
        string_utilities.$object_to_string_caching_state$ = SubLFiles.deflexical("*OBJECT-TO-STRING-CACHING-STATE*", (SubLObject)string_utilities.NIL);
        string_utilities.$char_set$ = SubLFiles.defparameter("*CHAR-SET*", (SubLObject)string_utilities.NIL);
        string_utilities.$64_bit_encoding_table$ = SubLFiles.defconstant("*64-BIT-ENCODING-TABLE*", (SubLObject)string_utilities.$list84);
        string_utilities.$64_bit_integer_index$ = SubLFiles.deflexical("*64-BIT-INTEGER-INDEX*", list_utilities.alist_to_hash_table(string_utilities.$64_bit_encoding_table$.getGlobalValue(), Symbols.symbol_function((SubLObject)string_utilities.EQL)));
        string_utilities.$64_bit_char_index$ = SubLFiles.deflexical("*64-BIT-CHAR-INDEX*", list_utilities.alist_to_reverse_hash_table(string_utilities.$64_bit_encoding_table$.getGlobalValue(), Symbols.symbol_function((SubLObject)string_utilities.EQL)));
        string_utilities.$raw_whitespace_chars$ = SubLFiles.deflexical("*RAW-WHITESPACE-CHARS*", (SubLObject)string_utilities.$list88);
        string_utilities.$whitespace_chars$ = SubLFiles.deflexical("*WHITESPACE-CHARS*", Sequences.delete_duplicates(string_utilities.$raw_whitespace_chars$.getGlobalValue(), Symbols.symbol_function((SubLObject)string_utilities.$sym89$CHAR_EQUAL), (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED, (SubLObject)string_utilities.UNPROVIDED));
        string_utilities.$grammatical_punctuation_chars$ = SubLFiles.deflexical("*GRAMMATICAL-PUNCTUATION-CHARS*", (SubLObject)string_utilities.$list90);
        string_utilities.$target_characters$ = SubLFiles.defparameter("*TARGET-CHARACTERS*", (SubLObject)string_utilities.NIL);
        string_utilities.$trigraph_metric$ = SubLFiles.defparameter("*TRIGRAPH-METRIC*", (SubLObject)string_utilities.$float117$0_8);
        string_utilities.$trigraph_tables$ = SubLFiles.defparameter("*TRIGRAPH-TABLES*", (SubLObject)string_utilities.NIL);
        string_utilities.$cyclify_string_expand_subl_fn_strings$ = SubLFiles.defvar("*CYCLIFY-STRING-EXPAND-SUBL-FN-STRINGS*", (SubLObject)string_utilities.$list126);
        string_utilities.$cyclify_string_subl_quote_fn_strings$ = SubLFiles.defvar("*CYCLIFY-STRING-SUBL-QUOTE-FN-STRINGS*", (SubLObject)string_utilities.$list127);
        string_utilities.$cyclify_string_quote_chars$ = SubLFiles.defvar("*CYCLIFY-STRING-QUOTE-CHARS*", (SubLObject)string_utilities.$list128);
        string_utilities.$dtp_cyclify_status$ = SubLFiles.defconstant("*DTP-CYCLIFY-STATUS*", (SubLObject)string_utilities.$sym129$CYCLIFY_STATUS);
        string_utilities.$string_read_buffer_size$ = SubLFiles.defparameter("*STRING-READ-BUFFER-SIZE*", (SubLObject)string_utilities.$int182$1024);
        string_utilities.$string_read_buffer$ = SubLFiles.defparameter("*STRING-READ-BUFFER*", Vectors.make_vector(string_utilities.$string_read_buffer_size$.getDynamicValue(), (SubLObject)Characters.CHAR_space));
        return (SubLObject)string_utilities.NIL;
    }
    
    public static SubLObject setup_string_utilities_file() {
        memoization_state.note_globally_cached_function((SubLObject)string_utilities.$sym13$OBJECT_TO_STRING);
        generic_testing.define_test_case_table_int((SubLObject)string_utilities.$sym36$HTML_ESCAPED_STRING_P, (SubLObject)ConsesLow.list(new SubLObject[] { string_utilities.$kw37$TEST, Symbols.symbol_function((SubLObject)string_utilities.EQUAL), string_utilities.$kw38$OWNER, string_utilities.NIL, string_utilities.$kw39$CLASSES, string_utilities.NIL, string_utilities.$kw40$KB, string_utilities.$kw41$TINY, string_utilities.$kw42$WORKING_, string_utilities.T }), (SubLObject)string_utilities.$list43);
        generic_testing.define_test_case_table_int((SubLObject)string_utilities.$sym46$ENDS_WITH_START_OF, (SubLObject)ConsesLow.list(new SubLObject[] { string_utilities.$kw37$TEST, string_utilities.EQUAL, string_utilities.$kw38$OWNER, string_utilities.NIL, string_utilities.$kw39$CLASSES, string_utilities.NIL, string_utilities.$kw40$KB, string_utilities.$kw41$TINY, string_utilities.$kw42$WORKING_, string_utilities.T }), (SubLObject)string_utilities.$list47);
        access_macros.define_obsolete_register((SubLObject)string_utilities.$sym28$NON_EMPTY_STRING_, (SubLObject)string_utilities.$list52);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), string_utilities.$dtp_cyclify_status$.getGlobalValue(), Symbols.symbol_function((SubLObject)string_utilities.$sym136$CYCLIFY_STATUS_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)string_utilities.$list137);
        Structures.def_csetf((SubLObject)string_utilities.$sym138$CYCLIFY_STATUS_OUT_STRING_LIST, (SubLObject)string_utilities.$sym139$_CSETF_CYCLIFY_STATUS_OUT_STRING_LIST);
        Structures.def_csetf((SubLObject)string_utilities.$sym140$CYCLIFY_STATUS_REFERENCES_ADDED, (SubLObject)string_utilities.$sym141$_CSETF_CYCLIFY_STATUS_REFERENCES_ADDED);
        Structures.def_csetf((SubLObject)string_utilities.$sym142$CYCLIFY_STATUS_INSIDE_QUOTE_, (SubLObject)string_utilities.$sym143$_CSETF_CYCLIFY_STATUS_INSIDE_QUOTE_);
        Structures.def_csetf((SubLObject)string_utilities.$sym144$CYCLIFY_STATUS_INSIDE_EL_VAR_NAME_, (SubLObject)string_utilities.$sym145$_CSETF_CYCLIFY_STATUS_INSIDE_EL_VAR_NAME_);
        Structures.def_csetf((SubLObject)string_utilities.$sym146$CYCLIFY_STATUS_ALREADY_CYCLIFIED_, (SubLObject)string_utilities.$sym147$_CSETF_CYCLIFY_STATUS_ALREADY_CYCLIFIED_);
        Structures.def_csetf((SubLObject)string_utilities.$sym148$CYCLIFY_STATUS_ESCAPE_, (SubLObject)string_utilities.$sym149$_CSETF_CYCLIFY_STATUS_ESCAPE_);
        Structures.def_csetf((SubLObject)string_utilities.$sym150$CYCLIFY_STATUS_INSIDE_SUBL_QUOTE_FN_, (SubLObject)string_utilities.$sym151$_CSETF_CYCLIFY_STATUS_INSIDE_SUBL_QUOTE_FN_);
        Structures.def_csetf((SubLObject)string_utilities.$sym152$CYCLIFY_STATUS_INSIDE_EXPAND_SUBL_FN_, (SubLObject)string_utilities.$sym153$_CSETF_CYCLIFY_STATUS_INSIDE_EXPAND_SUBL_FN_);
        Structures.def_csetf((SubLObject)string_utilities.$sym154$CYCLIFY_STATUS_INSIDE_EXPAND_SUBL_FN_ARG1_, (SubLObject)string_utilities.$sym155$_CSETF_CYCLIFY_STATUS_INSIDE_EXPAND_SUBL_FN_ARG1_);
        Structures.def_csetf((SubLObject)string_utilities.$sym156$CYCLIFY_STATUS_INSIDE_EXPAND_SUBL_FN_ARG2_, (SubLObject)string_utilities.$sym157$_CSETF_CYCLIFY_STATUS_INSIDE_EXPAND_SUBL_FN_ARG2_);
        Structures.def_csetf((SubLObject)string_utilities.$sym158$CYCLIFY_STATUS_IMMEDIATELY_FOLLOWING_PAREN_, (SubLObject)string_utilities.$sym159$_CSETF_CYCLIFY_STATUS_IMMEDIATELY_FOLLOWING_PAREN_);
        Structures.def_csetf((SubLObject)string_utilities.$sym160$CYCLIFY_STATUS_PAREN_COUNT, (SubLObject)string_utilities.$sym161$_CSETF_CYCLIFY_STATUS_PAREN_COUNT);
        Equality.identity((SubLObject)string_utilities.$sym129$CYCLIFY_STATUS);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), string_utilities.$dtp_cyclify_status$.getGlobalValue(), Symbols.symbol_function((SubLObject)string_utilities.$sym179$VISIT_DEFSTRUCT_OBJECT_CYCLIFY_STATUS_METHOD));
        access_macros.register_external_symbol((SubLObject)string_utilities.$sym180$CYCLIFY_STRING);
        generic_testing.define_test_case_table_int((SubLObject)string_utilities.$sym180$CYCLIFY_STRING, (SubLObject)ConsesLow.list(new SubLObject[] { string_utilities.$kw37$TEST, string_utilities.NIL, string_utilities.$kw38$OWNER, string_utilities.NIL, string_utilities.$kw39$CLASSES, string_utilities.NIL, string_utilities.$kw40$KB, string_utilities.$kw210$FULL, string_utilities.$kw42$WORKING_, string_utilities.T }), (SubLObject)string_utilities.$list211);
        generic_testing.define_test_case_table_int((SubLObject)string_utilities.$sym212$SUBWORD_, (SubLObject)ConsesLow.list(new SubLObject[] { string_utilities.$kw37$TEST, string_utilities.NIL, string_utilities.$kw38$OWNER, string_utilities.NIL, string_utilities.$kw39$CLASSES, string_utilities.NIL, string_utilities.$kw40$KB, string_utilities.$kw41$TINY, string_utilities.$kw42$WORKING_, string_utilities.T }), (SubLObject)string_utilities.$list213);
        generic_testing.define_test_case_table_int((SubLObject)string_utilities.$sym214$STRING_DOWNCASE_EXCEPT_ACRONYMS, (SubLObject)ConsesLow.list(new SubLObject[] { string_utilities.$kw37$TEST, string_utilities.NIL, string_utilities.$kw38$OWNER, string_utilities.NIL, string_utilities.$kw39$CLASSES, string_utilities.NIL, string_utilities.$kw40$KB, string_utilities.$kw41$TINY, string_utilities.$kw42$WORKING_, string_utilities.T }), string_utilities.$list215);
        generic_testing.define_test_case_table_int((SubLObject)string_utilities.$sym216$SPACE_DONT_UNCAPITALIZE, (SubLObject)ConsesLow.list(new SubLObject[] { string_utilities.$kw37$TEST, string_utilities.NIL, string_utilities.$kw38$OWNER, string_utilities.NIL, string_utilities.$kw39$CLASSES, string_utilities.NIL, string_utilities.$kw40$KB, string_utilities.$kw41$TINY, string_utilities.$kw42$WORKING_, string_utilities.T }), string_utilities.$list217);
        generic_testing.define_test_case_table_int((SubLObject)string_utilities.$sym218$QUOTED_STRING_, (SubLObject)ConsesLow.list(new SubLObject[] { string_utilities.$kw37$TEST, string_utilities.NIL, string_utilities.$kw38$OWNER, string_utilities.NIL, string_utilities.$kw39$CLASSES, string_utilities.NIL, string_utilities.$kw40$KB, string_utilities.$kw41$TINY, string_utilities.$kw42$WORKING_, string_utilities.T }), (SubLObject)string_utilities.$list219);
        generic_testing.define_test_case_table_int((SubLObject)string_utilities.$sym220$CONCATENATE_ADJACENT_STRINGS, (SubLObject)ConsesLow.list(new SubLObject[] { string_utilities.$kw37$TEST, string_utilities.NIL, string_utilities.$kw38$OWNER, string_utilities.NIL, string_utilities.$kw39$CLASSES, string_utilities.NIL, string_utilities.$kw40$KB, string_utilities.$kw41$TINY, string_utilities.$kw42$WORKING_, string_utilities.T }), (SubLObject)string_utilities.$list221);
        generic_testing.define_test_case_table_int((SubLObject)string_utilities.$sym222$FORMAT_NIL_TEST, (SubLObject)ConsesLow.list(new SubLObject[] { string_utilities.$kw37$TEST, string_utilities.NIL, string_utilities.$kw38$OWNER, string_utilities.NIL, string_utilities.$kw39$CLASSES, string_utilities.NIL, string_utilities.$kw40$KB, string_utilities.$kw41$TINY, string_utilities.$kw42$WORKING_, string_utilities.T }), (SubLObject)string_utilities.$list223);
        generic_testing.define_test_case_table_int((SubLObject)string_utilities.$sym224$HEX_INT_FROM_STRING, (SubLObject)ConsesLow.list(new SubLObject[] { string_utilities.$kw37$TEST, string_utilities.NIL, string_utilities.$kw38$OWNER, string_utilities.NIL, string_utilities.$kw39$CLASSES, string_utilities.NIL, string_utilities.$kw40$KB, string_utilities.$kw41$TINY, string_utilities.$kw42$WORKING_, string_utilities.T }), (SubLObject)string_utilities.$list225);
        return (SubLObject)string_utilities.NIL;
    }
    
    private static SubLObject _constant_215_initializer() {
        return (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("organization Grants Franchises Of Type")), (SubLObject)SubLObjectFactory.makeString("organization grants franchises of type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("identity Conditions For")), (SubLObject)SubLObjectFactory.makeString("identity conditions for")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("date Of Death")), (SubLObject)SubLObjectFactory.makeString("date of death")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("developer Of IBT Type")), (SubLObject)SubLObjectFactory.makeString("developer of IBT type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("corresponding Cyc Collection")), (SubLObject)SubLObjectFactory.makeString("corresponding cyc collection")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Inverse Binary Predicate Fn")), (SubLObject)SubLObjectFactory.makeString("inverse binary predicate fn")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("toxin Type Produced By Organism Type")), (SubLObject)SubLObjectFactory.makeString("toxin type produced by organism type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("european Discovery By")), (SubLObject)SubLObjectFactory.makeString("european discovery by")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("construction Starting Date")), (SubLObject)SubLObjectFactory.makeString("construction starting date")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("highest Peak In This Group")), (SubLObject)SubLObjectFactory.makeString("highest peak in this group")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("uml Name")), (SubLObject)SubLObjectFactory.makeString("uml name")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("program Object Type Represents")), (SubLObject)SubLObjectFactory.makeString("program object type represents")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("higher Priority Template Type Immediate")), (SubLObject)SubLObjectFactory.makeString("higher priority template type immediate")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("subcat Frame Arity")), (SubLObject)SubLObjectFactory.makeString("subcat frame arity")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("field Studies")), (SubLObject)SubLObjectFactory.makeString("field studies")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("vulnerability Enables Attack")), (SubLObject)SubLObjectFactory.makeString("vulnerability enables attack")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl Defining Ontology URI")), (SubLObject)SubLObjectFactory.makeString("owl defining ontology URI")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("languages Spoken Here")), (SubLObject)SubLObjectFactory.makeString("languages spoken here")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("number Of Hostages Taken")), (SubLObject)SubLObjectFactory.makeString("number of hostages taken")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("lowercase Of Letter")), (SubLObject)SubLObjectFactory.makeString("lowercase of letter")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("condition Affects Part Type")), (SubLObject)SubLObjectFactory.makeString("condition affects part type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("time Zone Offset To GMT")), (SubLObject)SubLObjectFactory.makeString("time zone offset to GMT")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("has Department Types")), (SubLObject)SubLObjectFactory.makeString("has department types")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("cyclist Primary Project")), (SubLObject)SubLObjectFactory.makeString("cyclist primary project")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("land Area Of Region")), (SubLObject)SubLObjectFactory.makeString("land area of region")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("comparative Degree")), (SubLObject)SubLObjectFactory.makeString("comparative degree")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("polity Has Transport Means")), (SubLObject)SubLObjectFactory.makeString("polity has transport means")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("file Format Has Suffix")), (SubLObject)SubLObjectFactory.makeString("file format has suffix")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("drug Of Choice Administered For")), (SubLObject)SubLObjectFactory.makeString("drug of choice administered for")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("task Status")), (SubLObject)SubLObjectFactory.makeString("task status")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("principal Landmarks Of City")), (SubLObject)SubLObjectFactory.makeString("principal landmarks of city")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("infinitive")), (SubLObject)SubLObjectFactory.makeString("infinitive")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("performs Acts Of Type")), (SubLObject)SubLObjectFactory.makeString("performs acts of type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("geographical Sub Regions Of Country")), (SubLObject)SubLObjectFactory.makeString("geographical sub regions of country")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("television Actors")), (SubLObject)SubLObjectFactory.makeString("television actors")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("character Set For Writing System")), (SubLObject)SubLObjectFactory.makeString("character set for writing system")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("international Organization Member Countries")), (SubLObject)SubLObjectFactory.makeString("international organization member countries")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("builder Query For Template")), (SubLObject)SubLObjectFactory.makeString("builder query for template")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("alter Ego Of Hero")), (SubLObject)SubLObjectFactory.makeString("alter ego of hero")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("animal Type Makes Sound Type")), (SubLObject)SubLObjectFactory.makeString("animal type makes sound type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("main Color Of Object")), (SubLObject)SubLObjectFactory.makeString("main color of object")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("antisymmetric On")), (SubLObject)SubLObjectFactory.makeString("antisymmetric on")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("lexical Word Type For Language")), (SubLObject)SubLObjectFactory.makeString("lexical word type for language")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("drainage Area")), (SubLObject)SubLObjectFactory.makeString("drainage area")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("source Node In System")), (SubLObject)SubLObjectFactory.makeString("source node in system")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("complete Extent Enumerable For Arg")), (SubLObject)SubLObjectFactory.makeString("complete extent enumerable for arg")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("morphologically Derived From")), (SubLObject)SubLObjectFactory.makeString("morphologically derived from")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("cw Series Type")), (SubLObject)SubLObjectFactory.makeString("cw series type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("program Typically Installed With")), (SubLObject)SubLObjectFactory.makeString("program typically installed with")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("test Collection Project Responsible")), (SubLObject)SubLObjectFactory.makeString("test collection project responsible")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("infection Type Has Vector Type")), (SubLObject)SubLObjectFactory.makeString("infection type has vector type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("state Of Address")), (SubLObject)SubLObjectFactory.makeString("state of address")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("default Specialized Type")), (SubLObject)SubLObjectFactory.makeString("default specialized type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("agent Type Provides Service Of Type")), (SubLObject)SubLObjectFactory.makeString("agent type provides service of type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("discovered By Europeans When")), (SubLObject)SubLObjectFactory.makeString("discovered by europeans when")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("project Of Department")), (SubLObject)SubLObjectFactory.makeString("project of department")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("director Organizational Role")), (SubLObject)SubLObjectFactory.makeString("director organizational role")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("regulates Activity Type")), (SubLObject)SubLObjectFactory.makeString("regulates activity type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("task Scheduler Task Date Pattern")), (SubLObject)SubLObjectFactory.makeString("task scheduler task date pattern")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("computer MAC Address")), (SubLObject)SubLObjectFactory.makeString("computer MAC address")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("derivational Affix Base POS")), (SubLObject)SubLObjectFactory.makeString("derivational affix base POS")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("software Designed For Architecture")), (SubLObject)SubLObjectFactory.makeString("software designed for architecture")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("region Produces")), (SubLObject)SubLObjectFactory.makeString("region produces")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("source Used For Task")), (SubLObject)SubLObjectFactory.makeString("source used for task")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("social Quantity Type Expressed By Ins Of Event Type")), (SubLObject)SubLObjectFactory.makeString("social quantity type expressed by ins of event type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("software Parameter Set In Software Object")), (SubLObject)SubLObjectFactory.makeString("software parameter set in software object")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("expression Type For Tag")), (SubLObject)SubLObjectFactory.makeString("expression type for tag")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("performances Of Work Are")), (SubLObject)SubLObjectFactory.makeString("performances of work are")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("bugzilla Bug Report Assigned To")), (SubLObject)SubLObjectFactory.makeString("bugzilla bug report assigned to")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("derived Using Prefix")), (SubLObject)SubLObjectFactory.makeString("derived using prefix")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("capital City Of State")), (SubLObject)SubLObjectFactory.makeString("capital city of state")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("net Migration Rate")), (SubLObject)SubLObjectFactory.makeString("net migration rate")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("faces Direction")), (SubLObject)SubLObjectFactory.makeString("faces direction")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("program Source Code Written In")), (SubLObject)SubLObjectFactory.makeString("program source code written in")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("top In Thesaurus")), (SubLObject)SubLObjectFactory.makeString("top in thesaurus")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("important Company")), (SubLObject)SubLObjectFactory.makeString("important company")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("clump Syntax List")), (SubLObject)SubLObjectFactory.makeString("clump syntax list")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("corresponding KE Interaction Resource")), (SubLObject)SubLObjectFactory.makeString("corresponding KE interaction resource")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("former Occupation")), (SubLObject)SubLObjectFactory.makeString("former occupation")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("min Quant Value")), (SubLObject)SubLObjectFactory.makeString("min quant value")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("ke Genls Induced Weak Suggestion Preds")), (SubLObject)SubLObjectFactory.makeString("ke genls induced weak suggestion preds")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("binary Role Type Pred")), (SubLObject)SubLObjectFactory.makeString("binary role type pred")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("hour Of Day Index 24 Hour")), (SubLObject)SubLObjectFactory.makeString("hour of day index 24 hour")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("type Genl Mt")), (SubLObject)SubLObjectFactory.makeString("type genl mt")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("reads Language")), (SubLObject)SubLObjectFactory.makeString("reads language")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("empties Into")), (SubLObject)SubLObjectFactory.makeString("empties into")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("transport Facility For Type")), (SubLObject)SubLObjectFactory.makeString("transport facility for type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("sem Trans Arg")), (SubLObject)SubLObjectFactory.makeString("sem trans arg")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("venture Company")), (SubLObject)SubLObjectFactory.makeString("venture company")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("preserves Genls In Arg")), (SubLObject)SubLObjectFactory.makeString("preserves genls in arg")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("venture Member")), (SubLObject)SubLObjectFactory.makeString("venture member")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("inter Arg Reln 3 2")), (SubLObject)SubLObjectFactory.makeString("inter arg reln 3 2")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("base Form")), (SubLObject)SubLObjectFactory.makeString("base form")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("first Publication Date CW")), (SubLObject)SubLObjectFactory.makeString("first publication date CW")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("number Type Interval Type")), (SubLObject)SubLObjectFactory.makeString("number type interval type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("event Type Implemented By Program Function")), (SubLObject)SubLObjectFactory.makeString("event type implemented by program function")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("main Languages Of GPE")), (SubLObject)SubLObjectFactory.makeString("main languages of GPE")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("geographical Sub Regions Of State")), (SubLObject)SubLObjectFactory.makeString("geographical sub regions of state")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("fan Out Arg")), (SubLObject)SubLObjectFactory.makeString("fan out arg")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("sks Schema Translation Mt")), (SubLObject)SubLObjectFactory.makeString("sks schema translation mt")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("sub Topic Query Better Words")), (SubLObject)SubLObjectFactory.makeString("sub topic query better words")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("succeeding Value Of Munsell Hue")), (SubLObject)SubLObjectFactory.makeString("succeeding value of munsell hue")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("runs OS")), (SubLObject)SubLObjectFactory.makeString("runs OS")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("works Found In Structure")), (SubLObject)SubLObjectFactory.makeString("works found in structure")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("highest Point In Region")), (SubLObject)SubLObjectFactory.makeString("highest point in region")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("facet Based On Binary Pred Inverse")), (SubLObject)SubLObjectFactory.makeString("facet based on binary pred inverse")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("independent Arg")), (SubLObject)SubLObjectFactory.makeString("independent arg")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("node In LAN")), (SubLObject)SubLObjectFactory.makeString("node in LAN")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("field Fosters Advanced Artifacts Of Type")), (SubLObject)SubLObjectFactory.makeString("field fosters advanced artifacts of type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("local Chief In Organization")), (SubLObject)SubLObjectFactory.makeString("local chief in organization")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("role With Event Type Entails Some Time In Time Index")), (SubLObject)SubLObjectFactory.makeString("role with event type entails some time in time index")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("occurs During")), (SubLObject)SubLObjectFactory.makeString("occurs during")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("pathogen Type Causes Infection Type")), (SubLObject)SubLObjectFactory.makeString("pathogen type causes infection type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("prefix String")), (SubLObject)SubLObjectFactory.makeString("prefix string")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("covering")), (SubLObject)SubLObjectFactory.makeString("covering")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("microtheory Designation Argnum")), (SubLObject)SubLObjectFactory.makeString("microtheory designation argnum")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("other Common Language Here")), (SubLObject)SubLObjectFactory.makeString("other common language here")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("not Equipment Of Unit Type")), (SubLObject)SubLObjectFactory.makeString("not equipment of unit type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("nc Rule Constraint")), (SubLObject)SubLObjectFactory.makeString("nc rule constraint")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("holy Site")), (SubLObject)SubLObjectFactory.makeString("holy site")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("subcat Frame Example")), (SubLObject)SubLObjectFactory.makeString("subcat frame example")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("music Type Is Of Genre")), (SubLObject)SubLObjectFactory.makeString("music type is of genre")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("contains Programs")), (SubLObject)SubLObjectFactory.makeString("contains programs")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("account Name")), (SubLObject)SubLObjectFactory.makeString("account name")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("network Knowledge Predicate For Cyc Secure Component")), (SubLObject)SubLObjectFactory.makeString("network knowledge predicate for cyc secure component")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("common Nickname")), (SubLObject)SubLObjectFactory.makeString("common nickname")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("within Range Of Fire")), (SubLObject)SubLObjectFactory.makeString("within range of fire")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("controlling Suborganizations")), (SubLObject)SubLObjectFactory.makeString("controlling suborganizations")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("constrains Arg")), (SubLObject)SubLObjectFactory.makeString("constrains arg")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("slots Additive")), (SubLObject)SubLObjectFactory.makeString("slots additive")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("moves In Direction Average")), (SubLObject)SubLObjectFactory.makeString("moves in direction average")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("temporally Intersects Type Type")), (SubLObject)SubLObjectFactory.makeString("temporally intersects type type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("quantity Ordered Quantity Type")), (SubLObject)SubLObjectFactory.makeString("quantity ordered quantity type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("country Of Nationality")), (SubLObject)SubLObjectFactory.makeString("country of nationality")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("assignment Rough Duration")), (SubLObject)SubLObjectFactory.makeString("assignment rough duration")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("sources For Topic")), (SubLObject)SubLObjectFactory.makeString("sources for topic")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("predicates SBHL Path Marking Function Type")), (SubLObject)SubLObjectFactory.makeString("predicates SBHL path marking function type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("task Scheduler Task Time Pattern")), (SubLObject)SubLObjectFactory.makeString("task scheduler task time pattern")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("criterial For Terrain Tactical Role Negative")), (SubLObject)SubLObjectFactory.makeString("criterial for terrain tactical role negative")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("parser Test Target")), (SubLObject)SubLObjectFactory.makeString("parser test target")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("affix Semantics")), (SubLObject)SubLObjectFactory.makeString("affix semantics")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("context Of PCW")), (SubLObject)SubLObjectFactory.makeString("context of PCW")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("fault Vulnerability OS")), (SubLObject)SubLObjectFactory.makeString("fault vulnerability OS")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("sub Topic Print String")), (SubLObject)SubLObjectFactory.makeString("sub topic print string")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("common Language")), (SubLObject)SubLObjectFactory.makeString("common language")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("divisor Type For Quantity Type")), (SubLObject)SubLObjectFactory.makeString("divisor type for quantity type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("average Precipitation")), (SubLObject)SubLObjectFactory.makeString("average precipitation")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("predicate SBHL Transfers Via Arg")), (SubLObject)SubLObjectFactory.makeString("predicate SBHL transfers via arg")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("task Scheduler Task User")), (SubLObject)SubLObjectFactory.makeString("task scheduler task user")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("use For")), (SubLObject)SubLObjectFactory.makeString("use for")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("industry Facilities")), (SubLObject)SubLObjectFactory.makeString("industry facilities")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("predicate SBHL Transfers Through Module")), (SubLObject)SubLObjectFactory.makeString("predicate SBHL transfers through module")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("period Of Time Interval Series")), (SubLObject)SubLObjectFactory.makeString("period of time interval series")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("ke Weak Suggestion")), (SubLObject)SubLObjectFactory.makeString("ke weak suggestion")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("spatially Disjoint")), (SubLObject)SubLObjectFactory.makeString("spatially disjoint")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("bugzilla Bug For Product")), (SubLObject)SubLObjectFactory.makeString("bugzilla bug for product")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("task Advisor")), (SubLObject)SubLObjectFactory.makeString("task advisor")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("body Parts Used Type Type")), (SubLObject)SubLObjectFactory.makeString("body parts used type type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("task Reviewer")), (SubLObject)SubLObjectFactory.makeString("task reviewer")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("cn: Is A")), (SubLObject)SubLObjectFactory.makeString("cn: is A")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("most")), (SubLObject)SubLObjectFactory.makeString("most")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("organization Type Members Active In Field")), (SubLObject)SubLObjectFactory.makeString("organization type members active in field")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("maximum Depth")), (SubLObject)SubLObjectFactory.makeString("maximum depth")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("ft Deducible From")), (SubLObject)SubLObjectFactory.makeString("ft deducible from")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("domain Knowledge Predicate For Cyc Secure Component")), (SubLObject)SubLObjectFactory.makeString("domain knowledge predicate for cyc secure component")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("inter Arg Reln 3 1")), (SubLObject)SubLObjectFactory.makeString("inter arg reln 3 1")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("addicted To")), (SubLObject)SubLObjectFactory.makeString("addicted to")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("provenance Of Media Series Product")), (SubLObject)SubLObjectFactory.makeString("provenance of media series product")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("common Genl Preds")), (SubLObject)SubLObjectFactory.makeString("common genl preds")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("subcat Frame Head Keyword")), (SubLObject)SubLObjectFactory.makeString("subcat frame head keyword")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("government")), (SubLObject)SubLObjectFactory.makeString("government")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("native Language")), (SubLObject)SubLObjectFactory.makeString("native language")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("granule Of Spatial Stuff")), (SubLObject)SubLObjectFactory.makeString("granule of spatial stuff")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("program Type Strings")), (SubLObject)SubLObjectFactory.makeString("program type strings")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("cbl Relationship Has Keyword")), (SubLObject)SubLObjectFactory.makeString("cbl relationship has keyword")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("sub Event Types")), (SubLObject)SubLObjectFactory.makeString("sub event types")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("requires Operating System")), (SubLObject)SubLObjectFactory.makeString("requires operating system")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("bio For Proposalshort")), (SubLObject)SubLObjectFactory.makeString("bio for proposalshort")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("superlative Degree")), (SubLObject)SubLObjectFactory.makeString("superlative degree")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("geographical Sub Regions Of Body Of Water")), (SubLObject)SubLObjectFactory.makeString("geographical sub regions of body of water")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("last Proper Sub Event Types")), (SubLObject)SubLObjectFactory.makeString("last proper sub event types")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("test Collection For Knowledge Source")), (SubLObject)SubLObjectFactory.makeString("test collection for knowledge source")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("role Types For Event Type")), (SubLObject)SubLObjectFactory.makeString("role types for event type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("facet Based On Type Binary Pred Inverse")), (SubLObject)SubLObjectFactory.makeString("facet based on type binary pred inverse")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("inter Arg Reln 1 4")), (SubLObject)SubLObjectFactory.makeString("inter arg reln 1 4")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("software Parameter Domain")), (SubLObject)SubLObjectFactory.makeString("software parameter domain")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("prototypical Activity Type Of Person Type")), (SubLObject)SubLObjectFactory.makeString("prototypical activity type of person type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("program Function Identifier")), (SubLObject)SubLObjectFactory.makeString("program function identifier")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("pn Mass Number")), (SubLObject)SubLObjectFactory.makeString("pn mass number")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("authentication Source For")), (SubLObject)SubLObjectFactory.makeString("authentication source for")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("string Skipped")), (SubLObject)SubLObjectFactory.makeString("string skipped")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("program Installed With Package")), (SubLObject)SubLObjectFactory.makeString("program installed with package")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("characteristic Activity Type Of Person Type")), (SubLObject)SubLObjectFactory.makeString("characteristic activity type of person type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("biological Weapon Type Basis Type")), (SubLObject)SubLObjectFactory.makeString("biological weapon type basis type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl URI")), (SubLObject)SubLObjectFactory.makeString("owl URI")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("immediate Precursors Chemical")), (SubLObject)SubLObjectFactory.makeString("immediate precursors chemical")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("performance Of Work")), (SubLObject)SubLObjectFactory.makeString("performance of work")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("language Prompt For UIA")), (SubLObject)SubLObjectFactory.makeString("language prompt for UIA")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("issuer Of CW")), (SubLObject)SubLObjectFactory.makeString("issuer of CW")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("genl Works")), (SubLObject)SubLObjectFactory.makeString("genl works")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("sub Time Slice Type")), (SubLObject)SubLObjectFactory.makeString("sub time slice type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("product Type Licensed For Treatment Of")), (SubLObject)SubLObjectFactory.makeString("product type licensed for treatment of")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("date Of Invention")), (SubLObject)SubLObjectFactory.makeString("date of invention")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("agent Type Employed By Org Type")), (SubLObject)SubLObjectFactory.makeString("agent type employed by org type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("constant Copied From")), (SubLObject)SubLObjectFactory.makeString("constant copied from")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("negation Quantities")), (SubLObject)SubLObjectFactory.makeString("negation quantities")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("based In Region")), (SubLObject)SubLObjectFactory.makeString("based in region")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("originally From Region")), (SubLObject)SubLObjectFactory.makeString("originally from region")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("genl Programs")), (SubLObject)SubLObjectFactory.makeString("genl programs")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("average Discharge")), (SubLObject)SubLObjectFactory.makeString("average discharge")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("program Calls Program")), (SubLObject)SubLObjectFactory.makeString("program calls program")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("chief Ports")), (SubLObject)SubLObjectFactory.makeString("chief ports")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("named After")), (SubLObject)SubLObjectFactory.makeString("named after")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("validation Required On Template Position")), (SubLObject)SubLObjectFactory.makeString("validation required on template position")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("population Growth Rate")), (SubLObject)SubLObjectFactory.makeString("population growth rate")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("test Collection Cyclist Responsible")), (SubLObject)SubLObjectFactory.makeString("test collection cyclist responsible")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("file Configures Software")), (SubLObject)SubLObjectFactory.makeString("file configures software")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("policy Type Protects Against")), (SubLObject)SubLObjectFactory.makeString("policy type protects against")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("arity Max")), (SubLObject)SubLObjectFactory.makeString("arity max")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("characteristic Activity Type Of Person Type At Least Once")), (SubLObject)SubLObjectFactory.makeString("characteristic activity type of person type at least once")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("developed Product Type")), (SubLObject)SubLObjectFactory.makeString("developed product type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("spans-Bridgelike")), (SubLObject)SubLObjectFactory.makeString("spans-bridgelike")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("inter Arg Reln 3 4")), (SubLObject)SubLObjectFactory.makeString("inter arg reln 3 4")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("major Religions")), (SubLObject)SubLObjectFactory.makeString("major religions")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("candidate Proper Sub Situation Types")), (SubLObject)SubLObjectFactory.makeString("candidate proper sub situation types")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("nc Rule Template")), (SubLObject)SubLObjectFactory.makeString("nc rule template")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("template Type For Focal Term Type")), (SubLObject)SubLObjectFactory.makeString("template type for focal term type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("regular Degree")), (SubLObject)SubLObjectFactory.makeString("regular degree")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("studies")), (SubLObject)SubLObjectFactory.makeString("studies")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("cn: Used For")), (SubLObject)SubLObjectFactory.makeString("cn: used for")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("software Update Download Link")), (SubLObject)SubLObjectFactory.makeString("software update download link")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("unit Type Dimensional Analysis")), (SubLObject)SubLObjectFactory.makeString("unit type dimensional analysis")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("school Symbol Name Female")), (SubLObject)SubLObjectFactory.makeString("school symbol name female")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("assert Mt For Formula Template")), (SubLObject)SubLObjectFactory.makeString("assert mt for formula template")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("query Mt For Topic Assertions")), (SubLObject)SubLObjectFactory.makeString("query mt for topic assertions")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("symmetric Physical Part Types")), (SubLObject)SubLObjectFactory.makeString("symmetric physical part types")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("predicates SBHL Path Terminating Mark Function")), (SubLObject)SubLObjectFactory.makeString("predicates SBHL path terminating mark function")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("construction Existential State")), (SubLObject)SubLObjectFactory.makeString("construction existential state")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("event Type Uses Device Type")), (SubLObject)SubLObjectFactory.makeString("event type uses device type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("generate Arg With Outside Scope")), (SubLObject)SubLObjectFactory.makeString("generate arg with outside scope")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("noun Learner Sense Gloss")), (SubLObject)SubLObjectFactory.makeString("noun learner sense gloss")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("vehicle Load Class")), (SubLObject)SubLObjectFactory.makeString("vehicle load class")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("data Type Exploited By")), (SubLObject)SubLObjectFactory.makeString("data type exploited by")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("topic Of Database")), (SubLObject)SubLObjectFactory.makeString("topic of database")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("syntactic Node Category")), (SubLObject)SubLObjectFactory.makeString("syntactic node category")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("software Object Uses Library")), (SubLObject)SubLObjectFactory.makeString("software object uses library")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("template Topic Genls")), (SubLObject)SubLObjectFactory.makeString("template topic genls")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("typical Armament Of Unit Type")), (SubLObject)SubLObjectFactory.makeString("typical armament of unit type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("greater Than")), (SubLObject)SubLObjectFactory.makeString("greater than")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("cn: Property Of")), (SubLObject)SubLObjectFactory.makeString("cn: property of")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("filter Collections")), (SubLObject)SubLObjectFactory.makeString("filter collections")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("has What As Boundary")), (SubLObject)SubLObjectFactory.makeString("has what as boundary")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("terrain Climate Type")), (SubLObject)SubLObjectFactory.makeString("terrain climate type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("software Parameter Has Type")), (SubLObject)SubLObjectFactory.makeString("software parameter has type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("TNT Equivalent Type")), (SubLObject)SubLObjectFactory.makeString("TNT equivalent type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("unit Type Uses Tactical Object Type")), (SubLObject)SubLObjectFactory.makeString("unit type uses tactical object type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("coa Supporting Task")), (SubLObject)SubLObjectFactory.makeString("coa supporting task")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("classification Of Report")), (SubLObject)SubLObjectFactory.makeString("classification of report")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("street Of Address")), (SubLObject)SubLObjectFactory.makeString("street of address")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("formula Template Type Has Topic Type")), (SubLObject)SubLObjectFactory.makeString("formula template type has topic type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("web Site URL")), (SubLObject)SubLObjectFactory.makeString("web site URL")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("RAM Size")), (SubLObject)SubLObjectFactory.makeString("RAM size")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("senior Executives")), (SubLObject)SubLObjectFactory.makeString("senior executives")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("tm Inverse Symbol")), (SubLObject)SubLObjectFactory.makeString("tm inverse symbol")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("major City In State")), (SubLObject)SubLObjectFactory.makeString("major city in state")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("derivational Affix Result POS")), (SubLObject)SubLObjectFactory.makeString("derivational affix result POS")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("employee Status")), (SubLObject)SubLObjectFactory.makeString("employee status")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("denotatum Arg")), (SubLObject)SubLObjectFactory.makeString("denotatum arg")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("program Implements Protocol")), (SubLObject)SubLObjectFactory.makeString("program implements protocol")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("water Area Of Region")), (SubLObject)SubLObjectFactory.makeString("water area of region")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("to-Generic")), (SubLObject)SubLObjectFactory.makeString("to-generic")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("ke Strong Suggestion Inverse")), (SubLObject)SubLObjectFactory.makeString("ke strong suggestion inverse")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("duration Of Type")), (SubLObject)SubLObjectFactory.makeString("duration of type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("test Derived From")), (SubLObject)SubLObjectFactory.makeString("test derived from")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("infant Mortality Rate")), (SubLObject)SubLObjectFactory.makeString("infant mortality rate")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("type Launches Projectile Type")), (SubLObject)SubLObjectFactory.makeString("type launches projectile type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("national Budget Revenues")), (SubLObject)SubLObjectFactory.makeString("national budget revenues")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("max Quant Value")), (SubLObject)SubLObjectFactory.makeString("max quant value")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("taxon Members")), (SubLObject)SubLObjectFactory.makeString("taxon members")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("national Budget Expenditures")), (SubLObject)SubLObjectFactory.makeString("national budget expenditures")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("predicates Cyc L Initialization Module")), (SubLObject)SubLObjectFactory.makeString("predicates cyc l initialization module")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("natural Hazards In Region")), (SubLObject)SubLObjectFactory.makeString("natural hazards in region")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("linked")), (SubLObject)SubLObjectFactory.makeString("linked")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("position In Formula Template Is Replaceable")), (SubLObject)SubLObjectFactory.makeString("position in formula template is replaceable")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("mass Number")), (SubLObject)SubLObjectFactory.makeString("mass number")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("device Type Used")), (SubLObject)SubLObjectFactory.makeString("device type used")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("river End Topography")), (SubLObject)SubLObjectFactory.makeString("river end topography")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("object Has Color")), (SubLObject)SubLObjectFactory.makeString("object has color")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("regular Adverb")), (SubLObject)SubLObjectFactory.makeString("regular adverb")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("condition Affects Org Type")), (SubLObject)SubLObjectFactory.makeString("condition affects org type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("nc Rule Tests")), (SubLObject)SubLObjectFactory.makeString("nc rule tests")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("sentence Designation Argnum")), (SubLObject)SubLObjectFactory.makeString("sentence designation argnum")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("regulates Object Type")), (SubLObject)SubLObjectFactory.makeString("regulates object type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("consider Specializing")), (SubLObject)SubLObjectFactory.makeString("consider specializing")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("genl Mod Features")), (SubLObject)SubLObjectFactory.makeString("genl mod features")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("fields Of Competence")), (SubLObject)SubLObjectFactory.makeString("fields of competence")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("policy Type Covers Types")), (SubLObject)SubLObjectFactory.makeString("policy type covers types")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("topic Of Clump")), (SubLObject)SubLObjectFactory.makeString("topic of clump")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("device Type Manipulates")), (SubLObject)SubLObjectFactory.makeString("device type manipulates")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("predicate SBHL Index Arg")), (SubLObject)SubLObjectFactory.makeString("predicate SBHL index arg")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("sub Information")), (SubLObject)SubLObjectFactory.makeString("sub information")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("derived Conceptual Work")), (SubLObject)SubLObjectFactory.makeString("derived conceptual work")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("tm Superset")), (SubLObject)SubLObjectFactory.makeString("tm superset")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("glf Label For Arcs Based On Expanded Pred")), (SubLObject)SubLObjectFactory.makeString("glf label for arcs based on expanded pred")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("source Of Term Person")), (SubLObject)SubLObjectFactory.makeString("source of term person")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("orbits")), (SubLObject)SubLObjectFactory.makeString("orbits")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("literacy Rate")), (SubLObject)SubLObjectFactory.makeString("literacy rate")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("test Type Folder")), (SubLObject)SubLObjectFactory.makeString("test type folder")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("suffix String")), (SubLObject)SubLObjectFactory.makeString("suffix string")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("has Award")), (SubLObject)SubLObjectFactory.makeString("has award")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("topic Of Belief System")), (SubLObject)SubLObjectFactory.makeString("topic of belief system")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("sks Physical Schema Description Mt")), (SubLObject)SubLObjectFactory.makeString("sks physical schema description mt")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("program Function Operator")), (SubLObject)SubLObjectFactory.makeString("program function operator")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("commercially Useful Part Types")), (SubLObject)SubLObjectFactory.makeString("commercially useful part types")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("perpendicular Vectors")), (SubLObject)SubLObjectFactory.makeString("perpendicular vectors")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("sticks Into 2 D")), (SubLObject)SubLObjectFactory.makeString("sticks into 2 D")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("perfect")), (SubLObject)SubLObjectFactory.makeString("perfect")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("compass Value Of Direction")), (SubLObject)SubLObjectFactory.makeString("compass value of direction")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("bug Causes Bad Paraphrase In Query Library")), (SubLObject)SubLObjectFactory.makeString("bug causes bad paraphrase in query library")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("organism Type Existential Threat State")), (SubLObject)SubLObjectFactory.makeString("organism type existential threat state")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("correlated Color")), (SubLObject)SubLObjectFactory.makeString("correlated color")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("notable Peaks In This Group")), (SubLObject)SubLObjectFactory.makeString("notable peaks in this group")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("form Of Disease")), (SubLObject)SubLObjectFactory.makeString("form of disease")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("formula Template Has Type")), (SubLObject)SubLObjectFactory.makeString("formula template has type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("starts During")), (SubLObject)SubLObjectFactory.makeString("starts during")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("altitude Of Lowest Point Is")), (SubLObject)SubLObjectFactory.makeString("altitude of lowest point is")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("where River Starts")), (SubLObject)SubLObjectFactory.makeString("where river starts")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("maximum Duration Of Type")), (SubLObject)SubLObjectFactory.makeString("maximum duration of type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("embedded Region")), (SubLObject)SubLObjectFactory.makeString("embedded region")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("controls")), (SubLObject)SubLObjectFactory.makeString("controls")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("standard Equipment Of Unit Type")), (SubLObject)SubLObjectFactory.makeString("standard equipment of unit type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("agent Supports Agent Generic")), (SubLObject)SubLObjectFactory.makeString("agent supports agent generic")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("arg 5 Format")), (SubLObject)SubLObjectFactory.makeString("arg 5 format")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("sub Industry Types")), (SubLObject)SubLObjectFactory.makeString("sub industry types")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("school Type Attended")), (SubLObject)SubLObjectFactory.makeString("school type attended")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("has Portal To Region")), (SubLObject)SubLObjectFactory.makeString("has portal to region")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("predicates SBHL Path Unmarking Function Type")), (SubLObject)SubLObjectFactory.makeString("predicates SBHL path unmarking function type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("sks Source Description Mt")), (SubLObject)SubLObjectFactory.makeString("sks source description mt")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("serves Cuisine")), (SubLObject)SubLObjectFactory.makeString("serves cuisine")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("arg 5 Genl")), (SubLObject)SubLObjectFactory.makeString("arg 5 genl")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("key Participants")), (SubLObject)SubLObjectFactory.makeString("key participants")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("purpose Of Event Type Sit Type")), (SubLObject)SubLObjectFactory.makeString("purpose of event type sit type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("has Headquarters In Country")), (SubLObject)SubLObjectFactory.makeString("has headquarters in country")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("local E Mail Address Text")), (SubLObject)SubLObjectFactory.makeString("local e mail address text")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("opposite Collections")), (SubLObject)SubLObjectFactory.makeString("opposite collections")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("sem Trans Pred For POS")), (SubLObject)SubLObjectFactory.makeString("sem trans pred for POS")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("project Source Fact Entry")), (SubLObject)SubLObjectFactory.makeString("project source fact entry")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("type Measures Quantity")), (SubLObject)SubLObjectFactory.makeString("type measures quantity")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("intersection Type")), (SubLObject)SubLObjectFactory.makeString("intersection type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("arity Min")), (SubLObject)SubLObjectFactory.makeString("arity min")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("facet Based On Binary Pred")), (SubLObject)SubLObjectFactory.makeString("facet based on binary pred")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("computer IP")), (SubLObject)SubLObjectFactory.makeString("computer IP")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("has Zodiac Sign")), (SubLObject)SubLObjectFactory.makeString("has zodiac sign")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("link In System")), (SubLObject)SubLObjectFactory.makeString("link in system")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("strictly Functional In Args")), (SubLObject)SubLObjectFactory.makeString("strictly functional in args")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("has Personality")), (SubLObject)SubLObjectFactory.makeString("has personality")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("html Tag Symbol")), (SubLObject)SubLObjectFactory.makeString("html tag symbol")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("bugzilla Bug Report Reporter")), (SubLObject)SubLObjectFactory.makeString("bugzilla bug report reporter")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("bug Blocks Query")), (SubLObject)SubLObjectFactory.makeString("bug blocks query")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("adjective Of Country")), (SubLObject)SubLObjectFactory.makeString("adjective of country")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("unique ID For Type")), (SubLObject)SubLObjectFactory.makeString("unique ID for type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("education Level")), (SubLObject)SubLObjectFactory.makeString("education level")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("city In State")), (SubLObject)SubLObjectFactory.makeString("city in state")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("bug Causes Spurious Proof")), (SubLObject)SubLObjectFactory.makeString("bug causes spurious proof")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("ft Deducible From Dual")), (SubLObject)SubLObjectFactory.makeString("ft deducible from dual")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("exclude Replacement Option For Formula Template")), (SubLObject)SubLObjectFactory.makeString("exclude replacement option for formula template")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("typical Color Of Type")), (SubLObject)SubLObjectFactory.makeString("typical color of type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("predicates Property Type Of Arg 1")), (SubLObject)SubLObjectFactory.makeString("predicates property type of arg 1")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("terrain Type")), (SubLObject)SubLObjectFactory.makeString("terrain type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("proper Physical Part Types")), (SubLObject)SubLObjectFactory.makeString("proper physical part types")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("task Type Requires Resource Type")), (SubLObject)SubLObjectFactory.makeString("task type requires resource type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("vaccine Effective Against Microorg Type")), (SubLObject)SubLObjectFactory.makeString("vaccine effective against microorg type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("area This Language Native To")), (SubLObject)SubLObjectFactory.makeString("area this language native to")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("has Office")), (SubLObject)SubLObjectFactory.makeString("has office")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("dialects")), (SubLObject)SubLObjectFactory.makeString("dialects")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("el Inverse")), (SubLObject)SubLObjectFactory.makeString("el inverse")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("node In System")), (SubLObject)SubLObjectFactory.makeString("node in system")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("performed By Part")), (SubLObject)SubLObjectFactory.makeString("performed by part")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("past Tense Universal")), (SubLObject)SubLObjectFactory.makeString("past tense universal")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("precondition For Events")), (SubLObject)SubLObjectFactory.makeString("precondition for events")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("device Types Commonly Used Together")), (SubLObject)SubLObjectFactory.makeString("device types commonly used together")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("agent Type Performs Work Of Type")), (SubLObject)SubLObjectFactory.makeString("agent type performs work of type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("runs Under OS")), (SubLObject)SubLObjectFactory.makeString("runs under OS")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("located At Point Surface Geographical")), (SubLObject)SubLObjectFactory.makeString("located at point surface geographical")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("population Of Region")), (SubLObject)SubLObjectFactory.makeString("population of region")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("cn: Thematic K Line")), (SubLObject)SubLObjectFactory.makeString("cn: thematic k line")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("standard Vehicle Of Unit Type")), (SubLObject)SubLObjectFactory.makeString("standard vehicle of unit type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("genl KB Content Tests")), (SubLObject)SubLObjectFactory.makeString("genl KB content tests")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("basic Speech Part Pred")), (SubLObject)SubLObjectFactory.makeString("basic speech part pred")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("industry Produces Type")), (SubLObject)SubLObjectFactory.makeString("industry produces type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("has Rights Over")), (SubLObject)SubLObjectFactory.makeString("has rights over")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("type Used With Cyc Module")), (SubLObject)SubLObjectFactory.makeString("type used with cyc module")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("tm Symbol")), (SubLObject)SubLObjectFactory.makeString("tm symbol")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("head Of State Of")), (SubLObject)SubLObjectFactory.makeString("head of state of")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("post Events")), (SubLObject)SubLObjectFactory.makeString("post events")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("causes Sit Type Sit Type")), (SubLObject)SubLObjectFactory.makeString("causes sit type sit type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("focal Term Introduction")), (SubLObject)SubLObjectFactory.makeString("focal term introduction")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("title Of Person String")), (SubLObject)SubLObjectFactory.makeString("title of person string")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("stufflike WRT Pred")), (SubLObject)SubLObjectFactory.makeString("stufflike WRT pred")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("requesting Agent")), (SubLObject)SubLObjectFactory.makeString("requesting agent")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("template Replacements Invisible For Position")), (SubLObject)SubLObjectFactory.makeString("template replacements invisible for position")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("proper Sub Events")), (SubLObject)SubLObjectFactory.makeString("proper sub events")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("temporally Intrinsic Arg")), (SubLObject)SubLObjectFactory.makeString("temporally intrinsic arg")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("string Length")), (SubLObject)SubLObjectFactory.makeString("string length")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("org Type Facility Type")), (SubLObject)SubLObjectFactory.makeString("org type facility type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("person Hair Color")), (SubLObject)SubLObjectFactory.makeString("person hair color")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("national Language")), (SubLObject)SubLObjectFactory.makeString("national language")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("reflexive On")), (SubLObject)SubLObjectFactory.makeString("reflexive on")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("city Of Address")), (SubLObject)SubLObjectFactory.makeString("city of address")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("preferred Name String")), (SubLObject)SubLObjectFactory.makeString("preferred name string")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("next Higher Order")), (SubLObject)SubLObjectFactory.makeString("next higher order")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("pos Of Phrase Type")), (SubLObject)SubLObjectFactory.makeString("pos of phrase type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("primary Activity Type Of Location")), (SubLObject)SubLObjectFactory.makeString("primary activity type of location")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("arg 4 Format")), (SubLObject)SubLObjectFactory.makeString("arg 4 format")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("where River Ends")), (SubLObject)SubLObjectFactory.makeString("where river ends")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("inhabitant Types")), (SubLObject)SubLObjectFactory.makeString("inhabitant types")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("plural")), (SubLObject)SubLObjectFactory.makeString("plural")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("inter Arg Reln 2 1")), (SubLObject)SubLObjectFactory.makeString("inter arg reln 2 1")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("office In Country")), (SubLObject)SubLObjectFactory.makeString("office in country")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("pos For Template Category")), (SubLObject)SubLObjectFactory.makeString("pos for template category")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("salient URL")), (SubLObject)SubLObjectFactory.makeString("salient URL")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("predicates Cyc L Module Type")), (SubLObject)SubLObjectFactory.makeString("predicates cyc l module type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("suffrage Age")), (SubLObject)SubLObjectFactory.makeString("suffrage age")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("report Time")), (SubLObject)SubLObjectFactory.makeString("report time")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("sub Topic Ordered Query Words")), (SubLObject)SubLObjectFactory.makeString("sub topic ordered query words")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("computer Speed")), (SubLObject)SubLObjectFactory.makeString("computer speed")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("founding Date")), (SubLObject)SubLObjectFactory.makeString("founding date")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("task Scheduler Task Expression")), (SubLObject)SubLObjectFactory.makeString("task scheduler task expression")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("regional Telephone Area Code")), (SubLObject)SubLObjectFactory.makeString("regional telephone area code")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("sub Topic Query Restrict Clause")), (SubLObject)SubLObjectFactory.makeString("sub topic query restrict clause")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("hobby CW Performed By")), (SubLObject)SubLObjectFactory.makeString("hobby CW performed by")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("date Of Publication CW")), (SubLObject)SubLObjectFactory.makeString("date of publication CW")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("sks Logical Schema Description Mt")), (SubLObject)SubLObjectFactory.makeString("sks logical schema description mt")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("room Faces")), (SubLObject)SubLObjectFactory.makeString("room faces")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("has Status With Organization")), (SubLObject)SubLObjectFactory.makeString("has status with organization")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("place Joined Jihad")), (SubLObject)SubLObjectFactory.makeString("place joined jihad")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("program Author")), (SubLObject)SubLObjectFactory.makeString("program author")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("typical Location Of Type")), (SubLObject)SubLObjectFactory.makeString("typical location of type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("from-Generic")), (SubLObject)SubLObjectFactory.makeString("from-generic")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("standard Unit")), (SubLObject)SubLObjectFactory.makeString("standard unit")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("ke Genls Induced Strong Suggestion Preds")), (SubLObject)SubLObjectFactory.makeString("ke genls induced strong suggestion preds")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("predicates Cyc L Graph Type")), (SubLObject)SubLObjectFactory.makeString("predicates cyc l graph type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("task Type Uses Tactical Object Type")), (SubLObject)SubLObjectFactory.makeString("task type uses tactical object type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("negative Vested Interest")), (SubLObject)SubLObjectFactory.makeString("negative vested interest")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("required Actor Slots")), (SubLObject)SubLObjectFactory.makeString("required actor slots")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("parasite Causes Ailment Condition")), (SubLObject)SubLObjectFactory.makeString("parasite causes ailment condition")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("closed Under")), (SubLObject)SubLObjectFactory.makeString("closed under")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("incorporated In")), (SubLObject)SubLObjectFactory.makeString("incorporated in")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("place Of Death")), (SubLObject)SubLObjectFactory.makeString("place of death")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("order Of Collection")), (SubLObject)SubLObjectFactory.makeString("order of collection")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("account Logged In On")), (SubLObject)SubLObjectFactory.makeString("account logged in on")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("holds In")), (SubLObject)SubLObjectFactory.makeString("holds in")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("holiday Celebrated In Polity")), (SubLObject)SubLObjectFactory.makeString("holiday celebrated in polity")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("ke Strong Suggestion Preds")), (SubLObject)SubLObjectFactory.makeString("ke strong suggestion preds")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("contains Modules")), (SubLObject)SubLObjectFactory.makeString("contains modules")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("target Posture")), (SubLObject)SubLObjectFactory.makeString("target posture")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("spatially Intersects")), (SubLObject)SubLObjectFactory.makeString("spatially intersects")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("inter Arg Reln 2 3")), (SubLObject)SubLObjectFactory.makeString("inter arg reln 2 3")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("total Merchant Marine Mass")), (SubLObject)SubLObjectFactory.makeString("total merchant marine mass")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("region Lacks Transport Means")), (SubLObject)SubLObjectFactory.makeString("region lacks transport means")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("task Uses Contributions Of")), (SubLObject)SubLObjectFactory.makeString("task uses contributions of")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("holds Sometime During")), (SubLObject)SubLObjectFactory.makeString("holds sometime during")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("affiliated Organizations")), (SubLObject)SubLObjectFactory.makeString("affiliated organizations")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("succeeding Interval Type")), (SubLObject)SubLObjectFactory.makeString("succeeding interval type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("quantity Subsumes")), (SubLObject)SubLObjectFactory.makeString("quantity subsumes")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("glf Node Semantics Underspecified")), (SubLObject)SubLObjectFactory.makeString("glf node semantics underspecified")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("worn With Garment Type")), (SubLObject)SubLObjectFactory.makeString("worn with garment type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("present In Region")), (SubLObject)SubLObjectFactory.makeString("present in region")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("participant In")), (SubLObject)SubLObjectFactory.makeString("participant in")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("gun Takes Ammunition")), (SubLObject)SubLObjectFactory.makeString("gun takes ammunition")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("multiplier Type For Quantity Type")), (SubLObject)SubLObjectFactory.makeString("multiplier type for quantity type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("pos Pred For Template Category")), (SubLObject)SubLObjectFactory.makeString("pos pred for template category")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("style Of Music Performer")), (SubLObject)SubLObjectFactory.makeString("style of music performer")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("capital City")), (SubLObject)SubLObjectFactory.makeString("capital city")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("task Type Commensurate With Op Type")), (SubLObject)SubLObjectFactory.makeString("task type commensurate with op type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("chemical CAS Registry")), (SubLObject)SubLObjectFactory.makeString("chemical CAS registry")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("type Associated Payment Plan")), (SubLObject)SubLObjectFactory.makeString("type associated payment plan")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("color Has Brightness")), (SubLObject)SubLObjectFactory.makeString("color has brightness")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("urge Type Satisfied")), (SubLObject)SubLObjectFactory.makeString("urge type satisfied")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("partitioned Into Spec Preds")), (SubLObject)SubLObjectFactory.makeString("partitioned into spec preds")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("type Ingredient Types")), (SubLObject)SubLObjectFactory.makeString("type ingredient types")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("singular")), (SubLObject)SubLObjectFactory.makeString("singular")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("movie Actors")), (SubLObject)SubLObjectFactory.makeString("movie actors")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("physical Extent")), (SubLObject)SubLObjectFactory.makeString("physical extent")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("version Of Product Brand")), (SubLObject)SubLObjectFactory.makeString("version of product brand")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("age Of Agent When Joined Jihad")), (SubLObject)SubLObjectFactory.makeString("age of agent when joined jihad")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("ins Marketed As")), (SubLObject)SubLObjectFactory.makeString("ins marketed as")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("contemporary In Arg")), (SubLObject)SubLObjectFactory.makeString("contemporary in arg")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("predominant Language")), (SubLObject)SubLObjectFactory.makeString("predominant language")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("fault Vulnerability Installed")), (SubLObject)SubLObjectFactory.makeString("fault vulnerability installed")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("sole Maker Of Product Type")), (SubLObject)SubLObjectFactory.makeString("sole maker of product type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("orthography")), (SubLObject)SubLObjectFactory.makeString("orthography")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("inherit All Role Players Sit Type To Sub Sit Type")), (SubLObject)SubLObjectFactory.makeString("inherit all role players sit type to sub sit type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("significant Event Acquaintance")), (SubLObject)SubLObjectFactory.makeString("significant event acquaintance")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("penn Tag For Pred")), (SubLObject)SubLObjectFactory.makeString("penn tag for pred")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("sub Works")), (SubLObject)SubLObjectFactory.makeString("sub works")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("program Running On")), (SubLObject)SubLObjectFactory.makeString("program running on")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("ks Term String")), (SubLObject)SubLObjectFactory.makeString("ks term string")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("arg 4 Genl")), (SubLObject)SubLObjectFactory.makeString("arg 4 genl")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("fields Of Formal Education")), (SubLObject)SubLObjectFactory.makeString("fields of formal education")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("permanently Northwest Of")), (SubLObject)SubLObjectFactory.makeString("permanently northwest of")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("frequently In Contact With")), (SubLObject)SubLObjectFactory.makeString("frequently in contact with")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("minor League Affiliates")), (SubLObject)SubLObjectFactory.makeString("minor league affiliates")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("test Query Specification")), (SubLObject)SubLObjectFactory.makeString("test query specification")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("parameter Of Program")), (SubLObject)SubLObjectFactory.makeString("parameter of program")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("country Of City")), (SubLObject)SubLObjectFactory.makeString("country of city")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("information Origin")), (SubLObject)SubLObjectFactory.makeString("information origin")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("program Found On Computer")), (SubLObject)SubLObjectFactory.makeString("program found on computer")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("eats Willingly")), (SubLObject)SubLObjectFactory.makeString("eats willingly")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("means Of Deploying Agent BCW")), (SubLObject)SubLObjectFactory.makeString("means of deploying agent BCW")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("exploit Targets Program")), (SubLObject)SubLObjectFactory.makeString("exploit targets program")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("characteristic Activity Type Of Organization Type")), (SubLObject)SubLObjectFactory.makeString("characteristic activity type of organization type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("type Genls")), (SubLObject)SubLObjectFactory.makeString("type genls")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("ethnicity")), (SubLObject)SubLObjectFactory.makeString("ethnicity")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("arg 2 Not Isa")), (SubLObject)SubLObjectFactory.makeString("arg 2 not isa")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("episode Type")), (SubLObject)SubLObjectFactory.makeString("episode type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("following Value")), (SubLObject)SubLObjectFactory.makeString("following value")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("variant Of Suffix")), (SubLObject)SubLObjectFactory.makeString("variant of suffix")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("forms Border Part")), (SubLObject)SubLObjectFactory.makeString("forms border part")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("permanently East Of")), (SubLObject)SubLObjectFactory.makeString("permanently east of")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("test Metrics To Gather")), (SubLObject)SubLObjectFactory.makeString("test metrics to gather")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("speech Part Preds")), (SubLObject)SubLObjectFactory.makeString("speech part preds")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("ke Weak Suggestion Preds")), (SubLObject)SubLObjectFactory.makeString("ke weak suggestion preds")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("spatially Intrinsic Arg")), (SubLObject)SubLObjectFactory.makeString("spatially intrinsic arg")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("required Arg 1 Pred")), (SubLObject)SubLObjectFactory.makeString("required arg 1 pred")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("highest Education Level")), (SubLObject)SubLObjectFactory.makeString("highest education level")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("occupation")), (SubLObject)SubLObjectFactory.makeString("occupation")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("expansion")), (SubLObject)SubLObjectFactory.makeString("expansion")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("agent Stays Viable After Deployment BCW")), (SubLObject)SubLObjectFactory.makeString("agent stays viable after deployment BCW")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("pathogen With Respect To")), (SubLObject)SubLObjectFactory.makeString("pathogen with respect to")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("facet Based On Type Binary Pred")), (SubLObject)SubLObjectFactory.makeString("facet based on type binary pred")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("symmetric On")), (SubLObject)SubLObjectFactory.makeString("symmetric on")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("date Left Jihad")), (SubLObject)SubLObjectFactory.makeString("date left jihad")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("state Of County")), (SubLObject)SubLObjectFactory.makeString("state of county")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("agent Type Sells Product Type")), (SubLObject)SubLObjectFactory.makeString("agent type sells product type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("fault Vulnerability Running")), (SubLObject)SubLObjectFactory.makeString("fault vulnerability running")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("temporally Subsumes Type Type")), (SubLObject)SubLObjectFactory.makeString("temporally subsumes type type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("proper Sub Situation Types")), (SubLObject)SubLObjectFactory.makeString("proper sub situation types")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("intended Target Type Of Weapon Type")), (SubLObject)SubLObjectFactory.makeString("intended target type of weapon type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("last Proper Sub Situation Types")), (SubLObject)SubLObjectFactory.makeString("last proper sub situation types")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("homepage")), (SubLObject)SubLObjectFactory.makeString("homepage")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("pathogen Sole Cause Of Infection Type")), (SubLObject)SubLObjectFactory.makeString("pathogen sole cause of infection type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("borders On")), (SubLObject)SubLObjectFactory.makeString("borders on")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("active Ingredients Of Type")), (SubLObject)SubLObjectFactory.makeString("active ingredients of type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("common Food Type Of Cuisine")), (SubLObject)SubLObjectFactory.makeString("common food type of cuisine")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("inter Arg Reln 1 2")), (SubLObject)SubLObjectFactory.makeString("inter arg reln 1 2")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("event Type Duration Of Effects")), (SubLObject)SubLObjectFactory.makeString("event type duration of effects")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("name String NC")), (SubLObject)SubLObjectFactory.makeString("name string NC")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("corresponding Military Task Type")), (SubLObject)SubLObjectFactory.makeString("corresponding military task type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("contains Information About Focally")), (SubLObject)SubLObjectFactory.makeString("contains information about focally")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("protects Against Type")), (SubLObject)SubLObjectFactory.makeString("protects against type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("geopolitical Subdivision")), (SubLObject)SubLObjectFactory.makeString("geopolitical subdivision")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("domain Example Pred Sentences")), (SubLObject)SubLObjectFactory.makeString("domain example pred sentences")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("preferred E Mail Address Text")), (SubLObject)SubLObjectFactory.makeString("preferred e mail address text")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("subject Of Report Prop")), (SubLObject)SubLObjectFactory.makeString("subject of report prop")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("ke Requirement Preds")), (SubLObject)SubLObjectFactory.makeString("ke requirement preds")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("unique Physical Part Types")), (SubLObject)SubLObjectFactory.makeString("unique physical part types")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("place In City")), (SubLObject)SubLObjectFactory.makeString("place in city")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("temporally Disjoint Action Types")), (SubLObject)SubLObjectFactory.makeString("temporally disjoint action types")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("indicated Drug")), (SubLObject)SubLObjectFactory.makeString("indicated drug")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("alias")), (SubLObject)SubLObjectFactory.makeString("alias")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("central Reference Point")), (SubLObject)SubLObjectFactory.makeString("central reference point")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("agentive-Sg")), (SubLObject)SubLObjectFactory.makeString("agentive-sg")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("partitioned Into")), (SubLObject)SubLObjectFactory.makeString("partitioned into")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("url Of CW")), (SubLObject)SubLObjectFactory.makeString("url of CW")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("social Class")), (SubLObject)SubLObjectFactory.makeString("social class")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("language Spoken")), (SubLObject)SubLObjectFactory.makeString("language spoken")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("fault Vulnerability Remote")), (SubLObject)SubLObjectFactory.makeString("fault vulnerability remote")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("total Merchant Marine Volume")), (SubLObject)SubLObjectFactory.makeString("total merchant marine volume")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("permanently Northeast Of")), (SubLObject)SubLObjectFactory.makeString("permanently northeast of")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("sub L Symbol For Module")), (SubLObject)SubLObjectFactory.makeString("sub l symbol for module")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("arg 5 Isa")), (SubLObject)SubLObjectFactory.makeString("arg 5 isa")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("date Of Death Event")), (SubLObject)SubLObjectFactory.makeString("date of death event")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("altitude Of Highest Point Is")), (SubLObject)SubLObjectFactory.makeString("altitude of highest point is")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("event Type Caused Death Of")), (SubLObject)SubLObjectFactory.makeString("event type caused death of")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("territories Controlled")), (SubLObject)SubLObjectFactory.makeString("territories controlled")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("possessive Relation")), (SubLObject)SubLObjectFactory.makeString("possessive relation")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("color Has RGB Red Value")), (SubLObject)SubLObjectFactory.makeString("color has RGB red value")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("ke Strong Suggestion")), (SubLObject)SubLObjectFactory.makeString("ke strong suggestion")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("characteristic Activity Type Of Person Type Frequently")), (SubLObject)SubLObjectFactory.makeString("characteristic activity type of person type frequently")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("architectural Style")), (SubLObject)SubLObjectFactory.makeString("architectural style")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("shared Notes")), (SubLObject)SubLObjectFactory.makeString("shared notes")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("frequent Prototypical Activity Type Of Person Type")), (SubLObject)SubLObjectFactory.makeString("frequent prototypical activity type of person type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("able To Control")), (SubLObject)SubLObjectFactory.makeString("able to control")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("color Has RGB Blue Value")), (SubLObject)SubLObjectFactory.makeString("color has RGB blue value")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("distribution Medium")), (SubLObject)SubLObjectFactory.makeString("distribution medium")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("sub Orgs Command")), (SubLObject)SubLObjectFactory.makeString("sub orgs command")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("cultural Region Of Origin")), (SubLObject)SubLObjectFactory.makeString("cultural region of origin")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("qa Web String")), (SubLObject)SubLObjectFactory.makeString("qa web string")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("arg 4 Isa")), (SubLObject)SubLObjectFactory.makeString("arg 4 isa")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("program Strings")), (SubLObject)SubLObjectFactory.makeString("program strings")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("color Has RGB Green Value")), (SubLObject)SubLObjectFactory.makeString("color has RGB green value")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("example NATs")), (SubLObject)SubLObjectFactory.makeString("example NATs")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("ethnic Groups Here")), (SubLObject)SubLObjectFactory.makeString("ethnic groups here")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("unit Definition")), (SubLObject)SubLObjectFactory.makeString("unit definition")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("inter Arg Reln 1 3")), (SubLObject)SubLObjectFactory.makeString("inter arg reln 1 3")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("action Type Expresses Feeling Type")), (SubLObject)SubLObjectFactory.makeString("action type expresses feeling type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("genre Heyday")), (SubLObject)SubLObjectFactory.makeString("genre heyday")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("structure In Area")), (SubLObject)SubLObjectFactory.makeString("structure in area")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("uppercase Of Lowercase")), (SubLObject)SubLObjectFactory.makeString("uppercase of lowercase")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("E Mail Address Text")), (SubLObject)SubLObjectFactory.makeString("E mail address text")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("quoted Argument")), (SubLObject)SubLObjectFactory.makeString("quoted argument")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("focal Activity Type")), (SubLObject)SubLObjectFactory.makeString("focal activity type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("modality Features")), (SubLObject)SubLObjectFactory.makeString("modality features")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("mandatory Game Equipment Type")), (SubLObject)SubLObjectFactory.makeString("mandatory game equipment type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("test Responsible Cyclist")), (SubLObject)SubLObjectFactory.makeString("test responsible cyclist")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("formula For Formula Template")), (SubLObject)SubLObjectFactory.makeString("formula for formula template")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("ke Induced Weak Suggestion Preds")), (SubLObject)SubLObjectFactory.makeString("ke induced weak suggestion preds")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("specified Subset Of")), (SubLObject)SubLObjectFactory.makeString("specified subset of")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("proper Sub Event Types")), (SubLObject)SubLObjectFactory.makeString("proper sub event types")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("date Joined Jihad")), (SubLObject)SubLObjectFactory.makeString("date joined jihad")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("cyc Subject Clumps")), (SubLObject)SubLObjectFactory.makeString("cyc subject clumps")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("president Of Country")), (SubLObject)SubLObjectFactory.makeString("president of country")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("sub L Identifier")), (SubLObject)SubLObjectFactory.makeString("sub l identifier")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("file Found On Computer")), (SubLObject)SubLObjectFactory.makeString("file found on computer")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("in Region")), (SubLObject)SubLObjectFactory.makeString("in region")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("country Phone Code")), (SubLObject)SubLObjectFactory.makeString("country phone code")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("intended Target Type Of Attack")), (SubLObject)SubLObjectFactory.makeString("intended target type of attack")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("polities Border Each Other")), (SubLObject)SubLObjectFactory.makeString("polities border each other")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("predicates SBHL Disjoins Module")), (SubLObject)SubLObjectFactory.makeString("predicates SBHL disjoins module")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("reified Using Tool")), (SubLObject)SubLObjectFactory.makeString("reified using tool")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("arg 3 Isa")), (SubLObject)SubLObjectFactory.makeString("arg 3 isa")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("predicates SBHL Type Test")), (SubLObject)SubLObjectFactory.makeString("predicates SBHL type test")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("arg 3 Genl")), (SubLObject)SubLObjectFactory.makeString("arg 3 genl")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("arg 2 Genl")), (SubLObject)SubLObjectFactory.makeString("arg 2 genl")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("middle Name Initial")), (SubLObject)SubLObjectFactory.makeString("middle name initial")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("has Authority Over")), (SubLObject)SubLObjectFactory.makeString("has authority over")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("temporally Contains")), (SubLObject)SubLObjectFactory.makeString("temporally contains")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("super Topics")), (SubLObject)SubLObjectFactory.makeString("super topics")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("member Types")), (SubLObject)SubLObjectFactory.makeString("member types")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("color Has Hue")), (SubLObject)SubLObjectFactory.makeString("color has hue")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("args Isa")), (SubLObject)SubLObjectFactory.makeString("args isa")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("arg 1 Not Isa")), (SubLObject)SubLObjectFactory.makeString("arg 1 not isa")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("main Topic")), (SubLObject)SubLObjectFactory.makeString("main topic")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("open Entry Format In Args")), (SubLObject)SubLObjectFactory.makeString("open entry format in args")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("reformulate Template Via Specification")), (SubLObject)SubLObjectFactory.makeString("reformulate template via specification")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("terrain Decompositions")), (SubLObject)SubLObjectFactory.makeString("terrain decompositions")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("info Transferred")), (SubLObject)SubLObjectFactory.makeString("info transferred")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("transported In Types")), (SubLObject)SubLObjectFactory.makeString("transported in types")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("contradictory Preds")), (SubLObject)SubLObjectFactory.makeString("contradictory preds")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("agent Type Uses Artifact Type")), (SubLObject)SubLObjectFactory.makeString("agent type uses artifact type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("gen Template")), (SubLObject)SubLObjectFactory.makeString("gen template")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("system Of Writing")), (SubLObject)SubLObjectFactory.makeString("system of writing")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("uppercase Of Letter")), (SubLObject)SubLObjectFactory.makeString("uppercase of letter")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("roles For Event Type")), (SubLObject)SubLObjectFactory.makeString("roles for event type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("template Topic Prefix")), (SubLObject)SubLObjectFactory.makeString("template topic prefix")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("job Class")), (SubLObject)SubLObjectFactory.makeString("job class")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("super Event Types")), (SubLObject)SubLObjectFactory.makeString("super event types")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("iterated Proper Sub Situation Types")), (SubLObject)SubLObjectFactory.makeString("iterated proper sub situation types")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("ke Induced Strong Suggestion Preds")), (SubLObject)SubLObjectFactory.makeString("ke induced strong suggestion preds")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("permanently North Of")), (SubLObject)SubLObjectFactory.makeString("permanently north of")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("percent Natural Population Increase")), (SubLObject)SubLObjectFactory.makeString("percent natural population increase")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("title For Formula Template Type String")), (SubLObject)SubLObjectFactory.makeString("title for formula template type string")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("subcat Frame Keywords")), (SubLObject)SubLObjectFactory.makeString("subcat frame keywords")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rewrite Of")), (SubLObject)SubLObjectFactory.makeString("rewrite of")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("residence Of Organization")), (SubLObject)SubLObjectFactory.makeString("residence of organization")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("arg 2 Format")), (SubLObject)SubLObjectFactory.makeString("arg 2 format")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("surrounds Horizontally")), (SubLObject)SubLObjectFactory.makeString("surrounds horizontally")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("most Notable Isa")), (SubLObject)SubLObjectFactory.makeString("most notable isa")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("style Of Artist")), (SubLObject)SubLObjectFactory.makeString("style of artist")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("specialized Equipment Of Unit Type")), (SubLObject)SubLObjectFactory.makeString("specialized equipment of unit type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("in Topic")), (SubLObject)SubLObjectFactory.makeString("in topic")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("disjoint With")), (SubLObject)SubLObjectFactory.makeString("disjoint with")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("areas Of Origin")), (SubLObject)SubLObjectFactory.makeString("areas of origin")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("conceptually Related")), (SubLObject)SubLObjectFactory.makeString("conceptually related")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("inter Arg Reln 2 4")), (SubLObject)SubLObjectFactory.makeString("inter arg reln 2 4")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("arg 1 Genl")), (SubLObject)SubLObjectFactory.makeString("arg 1 genl")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("arg 3 Format")), (SubLObject)SubLObjectFactory.makeString("arg 3 format")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("temporal Bounds Contain")), (SubLObject)SubLObjectFactory.makeString("temporal bounds contain")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("agent Type Works At Location Type")), (SubLObject)SubLObjectFactory.makeString("agent type works at location type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("relation Category Type")), (SubLObject)SubLObjectFactory.makeString("relation category type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("main Subject Clump")), (SubLObject)SubLObjectFactory.makeString("main subject clump")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("arg 1 Format")), (SubLObject)SubLObjectFactory.makeString("arg 1 format")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("conceptually Co Related")), (SubLObject)SubLObjectFactory.makeString("conceptually co related")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("genl Functions")), (SubLObject)SubLObjectFactory.makeString("genl functions")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("arg 2 Isa")), (SubLObject)SubLObjectFactory.makeString("arg 2 isa")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("definitional Mt For Topic Assertions")), (SubLObject)SubLObjectFactory.makeString("definitional mt for topic assertions")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("arg 1 Isa")), (SubLObject)SubLObjectFactory.makeString("arg 1 isa")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("color Has Chroma")), (SubLObject)SubLObjectFactory.makeString("color has chroma")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("indigenous To")), (SubLObject)SubLObjectFactory.makeString("indigenous to")) });
    }
    
    private static SubLObject _constant_217_initializer() {
        return (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("organizationGrantsFranchisesOfType")), (SubLObject)SubLObjectFactory.makeString("organization Grants Franchises Of Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("identityConditionsFor")), (SubLObject)SubLObjectFactory.makeString("identity Conditions For")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("dateOfDeath")), (SubLObject)SubLObjectFactory.makeString("date Of Death")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("developerOfIBTType")), (SubLObject)SubLObjectFactory.makeString("developer Of IBT Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("correspondingCycCollection")), (SubLObject)SubLObjectFactory.makeString("corresponding Cyc Collection")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("InverseBinaryPredicateFn")), (SubLObject)SubLObjectFactory.makeString("Inverse Binary Predicate Fn")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("toxinTypeProducedByOrganismType")), (SubLObject)SubLObjectFactory.makeString("toxin Type Produced By Organism Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("europeanDiscoveryBy")), (SubLObject)SubLObjectFactory.makeString("european Discovery By")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("constructionStartingDate")), (SubLObject)SubLObjectFactory.makeString("construction Starting Date")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("highestPeakInThisGroup")), (SubLObject)SubLObjectFactory.makeString("highest Peak In This Group")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("umlName")), (SubLObject)SubLObjectFactory.makeString("uml Name")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("programObjectTypeRepresents")), (SubLObject)SubLObjectFactory.makeString("program Object Type Represents")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("higherPriorityTemplateType-Immediate")), (SubLObject)SubLObjectFactory.makeString("higher Priority Template Type Immediate")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("subcatFrameArity")), (SubLObject)SubLObjectFactory.makeString("subcat Frame Arity")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("fieldStudies")), (SubLObject)SubLObjectFactory.makeString("field Studies")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("vulnerabilityEnablesAttack")), (SubLObject)SubLObjectFactory.makeString("vulnerability Enables Attack")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owlDefiningOntologyURI")), (SubLObject)SubLObjectFactory.makeString("owl Defining Ontology URI")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("languagesSpokenHere")), (SubLObject)SubLObjectFactory.makeString("languages Spoken Here")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("numberOfHostagesTaken")), (SubLObject)SubLObjectFactory.makeString("number Of Hostages Taken")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("lowercaseOfLetter")), (SubLObject)SubLObjectFactory.makeString("lowercase Of Letter")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("conditionAffectsPartType")), (SubLObject)SubLObjectFactory.makeString("condition Affects Part Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("timeZoneOffsetToGMT")), (SubLObject)SubLObjectFactory.makeString("time Zone Offset To GMT")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("hasDepartmentTypes")), (SubLObject)SubLObjectFactory.makeString("has Department Types")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("cyclistPrimaryProject")), (SubLObject)SubLObjectFactory.makeString("cyclist Primary Project")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("landAreaOfRegion")), (SubLObject)SubLObjectFactory.makeString("land Area Of Region")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("comparativeDegree")), (SubLObject)SubLObjectFactory.makeString("comparative Degree")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("polityHasTransportMeans")), (SubLObject)SubLObjectFactory.makeString("polity Has Transport Means")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("fileFormatHasSuffix")), (SubLObject)SubLObjectFactory.makeString("file Format Has Suffix")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("drugOfChoiceAdministeredFor")), (SubLObject)SubLObjectFactory.makeString("drug Of Choice Administered For")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("taskStatus")), (SubLObject)SubLObjectFactory.makeString("task Status")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("principalLandmarksOfCity")), (SubLObject)SubLObjectFactory.makeString("principal Landmarks Of City")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("infinitive")), (SubLObject)SubLObjectFactory.makeString("infinitive")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("performsActsOfType")), (SubLObject)SubLObjectFactory.makeString("performs Acts Of Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("geographicalSubRegionsOfCountry")), (SubLObject)SubLObjectFactory.makeString("geographical Sub Regions Of Country")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("televisionActors")), (SubLObject)SubLObjectFactory.makeString("television Actors")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("characterSetForWritingSystem")), (SubLObject)SubLObjectFactory.makeString("character Set For Writing System")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("internationalOrganizationMemberCountries")), (SubLObject)SubLObjectFactory.makeString("international Organization Member Countries")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("builderQueryForTemplate")), (SubLObject)SubLObjectFactory.makeString("builder Query For Template")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("alterEgoOfHero")), (SubLObject)SubLObjectFactory.makeString("alter Ego Of Hero")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("animalTypeMakesSoundType")), (SubLObject)SubLObjectFactory.makeString("animal Type Makes Sound Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("mainColorOfObject")), (SubLObject)SubLObjectFactory.makeString("main Color Of Object")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("antisymmetricOn")), (SubLObject)SubLObjectFactory.makeString("antisymmetric On")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("lexicalWordTypeForLanguage")), (SubLObject)SubLObjectFactory.makeString("lexical Word Type For Language")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("drainageArea")), (SubLObject)SubLObjectFactory.makeString("drainage Area")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("sourceNodeInSystem")), (SubLObject)SubLObjectFactory.makeString("source Node In System")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("completeExtentEnumerableForArg")), (SubLObject)SubLObjectFactory.makeString("complete Extent Enumerable For Arg")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("morphologicallyDerivedFrom")), (SubLObject)SubLObjectFactory.makeString("morphologically Derived From")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("cwSeriesType")), (SubLObject)SubLObjectFactory.makeString("cw Series Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("programTypicallyInstalledWith")), (SubLObject)SubLObjectFactory.makeString("program Typically Installed With")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("testCollectionProjectResponsible")), (SubLObject)SubLObjectFactory.makeString("test Collection Project Responsible")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("infectionTypeHasVectorType")), (SubLObject)SubLObjectFactory.makeString("infection Type Has Vector Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("stateOfAddress")), (SubLObject)SubLObjectFactory.makeString("state Of Address")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("defaultSpecializedType")), (SubLObject)SubLObjectFactory.makeString("default Specialized Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("agentTypeProvidesServiceOfType")), (SubLObject)SubLObjectFactory.makeString("agent Type Provides Service Of Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("discoveredByEuropeansWhen")), (SubLObject)SubLObjectFactory.makeString("discovered By Europeans When")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("projectOfDepartment")), (SubLObject)SubLObjectFactory.makeString("project Of Department")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("director-OrganizationalRole")), (SubLObject)SubLObjectFactory.makeString("director Organizational Role")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("regulatesActivityType")), (SubLObject)SubLObjectFactory.makeString("regulates Activity Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("taskSchedulerTaskDatePattern")), (SubLObject)SubLObjectFactory.makeString("task Scheduler Task Date Pattern")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("computerMACAddress")), (SubLObject)SubLObjectFactory.makeString("computer MAC Address")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("derivationalAffixBasePOS")), (SubLObject)SubLObjectFactory.makeString("derivational Affix Base POS")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("softwareDesignedForArchitecture")), (SubLObject)SubLObjectFactory.makeString("software Designed For Architecture")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("regionProduces")), (SubLObject)SubLObjectFactory.makeString("region Produces")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("sourceUsedForTask")), (SubLObject)SubLObjectFactory.makeString("source Used For Task")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("socialQuantityTypeExpressedByInsOfEventType")), (SubLObject)SubLObjectFactory.makeString("social Quantity Type Expressed By Ins Of Event Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("softwareParameterSetInSoftwareObject")), (SubLObject)SubLObjectFactory.makeString("software Parameter Set In Software Object")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("expressionTypeForTag")), (SubLObject)SubLObjectFactory.makeString("expression Type For Tag")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("performancesOfWorkAre")), (SubLObject)SubLObjectFactory.makeString("performances Of Work Are")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("bugzillaBugReportAssignedTo")), (SubLObject)SubLObjectFactory.makeString("bugzilla Bug Report Assigned To")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("derivedUsingPrefix")), (SubLObject)SubLObjectFactory.makeString("derived Using Prefix")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("capitalCityOfState")), (SubLObject)SubLObjectFactory.makeString("capital City Of State")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("netMigrationRate")), (SubLObject)SubLObjectFactory.makeString("net Migration Rate")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("facesDirection")), (SubLObject)SubLObjectFactory.makeString("faces Direction")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("programSourceCodeWrittenIn")), (SubLObject)SubLObjectFactory.makeString("program Source Code Written In")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("topInThesaurus")), (SubLObject)SubLObjectFactory.makeString("top In Thesaurus")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("importantCompany")), (SubLObject)SubLObjectFactory.makeString("important Company")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("clumpSyntaxList")), (SubLObject)SubLObjectFactory.makeString("clump Syntax List")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("correspondingKEInteractionResource")), (SubLObject)SubLObjectFactory.makeString("corresponding KE Interaction Resource")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("formerOccupation")), (SubLObject)SubLObjectFactory.makeString("former Occupation")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("minQuantValue")), (SubLObject)SubLObjectFactory.makeString("min Quant Value")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("keGenlsInducedWeakSuggestionPreds")), (SubLObject)SubLObjectFactory.makeString("ke Genls Induced Weak Suggestion Preds")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("binaryRoleTypePred")), (SubLObject)SubLObjectFactory.makeString("binary Role Type Pred")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("hourOfDayIndex-24Hour")), (SubLObject)SubLObjectFactory.makeString("hour Of Day Index 24 Hour")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("typeGenlMt")), (SubLObject)SubLObjectFactory.makeString("type Genl Mt")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("readsLanguage")), (SubLObject)SubLObjectFactory.makeString("reads Language")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("emptiesInto")), (SubLObject)SubLObjectFactory.makeString("empties Into")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("transportFacilityForType")), (SubLObject)SubLObjectFactory.makeString("transport Facility For Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("semTransArg")), (SubLObject)SubLObjectFactory.makeString("sem Trans Arg")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("ventureCompany")), (SubLObject)SubLObjectFactory.makeString("venture Company")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("preservesGenlsInArg")), (SubLObject)SubLObjectFactory.makeString("preserves Genls In Arg")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("ventureMember")), (SubLObject)SubLObjectFactory.makeString("venture Member")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("interArgReln3-2")), (SubLObject)SubLObjectFactory.makeString("inter Arg Reln 3 2")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("baseForm")), (SubLObject)SubLObjectFactory.makeString("base Form")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("firstPublicationDate-CW")), (SubLObject)SubLObjectFactory.makeString("first Publication Date CW")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("numberTypeIntervalType")), (SubLObject)SubLObjectFactory.makeString("number Type Interval Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("eventTypeImplementedByProgramFunction")), (SubLObject)SubLObjectFactory.makeString("event Type Implemented By Program Function")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("mainLanguagesOfGPE")), (SubLObject)SubLObjectFactory.makeString("main Languages Of GPE")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("geographicalSubRegionsOfState")), (SubLObject)SubLObjectFactory.makeString("geographical Sub Regions Of State")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("fanOutArg")), (SubLObject)SubLObjectFactory.makeString("fan Out Arg")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("sksSchemaTranslationMt")), (SubLObject)SubLObjectFactory.makeString("sks Schema Translation Mt")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("subTopicQueryBetterWords")), (SubLObject)SubLObjectFactory.makeString("sub Topic Query Better Words")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("succeedingValueOfMunsellHue")), (SubLObject)SubLObjectFactory.makeString("succeeding Value Of Munsell Hue")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("runsOS")), (SubLObject)SubLObjectFactory.makeString("runs OS")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("worksFoundInStructure")), (SubLObject)SubLObjectFactory.makeString("works Found In Structure")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("highestPointInRegion")), (SubLObject)SubLObjectFactory.makeString("highest Point In Region")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("facetBasedOnBinaryPredInverse")), (SubLObject)SubLObjectFactory.makeString("facet Based On Binary Pred Inverse")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("independentArg")), (SubLObject)SubLObjectFactory.makeString("independent Arg")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("nodeInLAN")), (SubLObject)SubLObjectFactory.makeString("node In LAN")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("fieldFostersAdvancedArtifactsOfType")), (SubLObject)SubLObjectFactory.makeString("field Fosters Advanced Artifacts Of Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("localChiefInOrganization")), (SubLObject)SubLObjectFactory.makeString("local Chief In Organization")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("roleWithEventTypeEntailsSomeTimeInTimeIndex")), (SubLObject)SubLObjectFactory.makeString("role With Event Type Entails Some Time In Time Index")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("occursDuring")), (SubLObject)SubLObjectFactory.makeString("occurs During")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("pathogenTypeCausesInfectionType")), (SubLObject)SubLObjectFactory.makeString("pathogen Type Causes Infection Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("prefixString")), (SubLObject)SubLObjectFactory.makeString("prefix String")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("covering")), (SubLObject)SubLObjectFactory.makeString("covering")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("microtheoryDesignationArgnum")), (SubLObject)SubLObjectFactory.makeString("microtheory Designation Argnum")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("otherCommonLanguageHere")), (SubLObject)SubLObjectFactory.makeString("other Common Language Here")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("notEquipmentOfUnitType")), (SubLObject)SubLObjectFactory.makeString("not Equipment Of Unit Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("ncRuleConstraint")), (SubLObject)SubLObjectFactory.makeString("nc Rule Constraint")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("holySite")), (SubLObject)SubLObjectFactory.makeString("holy Site")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("subcatFrameExample")), (SubLObject)SubLObjectFactory.makeString("subcat Frame Example")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("musicTypeIsOfGenre")), (SubLObject)SubLObjectFactory.makeString("music Type Is Of Genre")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("containsPrograms")), (SubLObject)SubLObjectFactory.makeString("contains Programs")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("accountName")), (SubLObject)SubLObjectFactory.makeString("account Name")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("networkKnowledgePredicateForCycSecureComponent")), (SubLObject)SubLObjectFactory.makeString("network Knowledge Predicate For Cyc Secure Component")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("commonNickname")), (SubLObject)SubLObjectFactory.makeString("common Nickname")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("withinRangeOfFire")), (SubLObject)SubLObjectFactory.makeString("within Range Of Fire")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("controllingSuborganizations")), (SubLObject)SubLObjectFactory.makeString("controlling Suborganizations")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("constrainsArg")), (SubLObject)SubLObjectFactory.makeString("constrains Arg")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("slotsAdditive")), (SubLObject)SubLObjectFactory.makeString("slots Additive")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("movesInDirection-Average")), (SubLObject)SubLObjectFactory.makeString("moves In Direction Average")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("temporallyIntersects-TypeType")), (SubLObject)SubLObjectFactory.makeString("temporally Intersects Type Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("quantityOrderedQuantityType")), (SubLObject)SubLObjectFactory.makeString("quantity Ordered Quantity Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("countryOfNationality")), (SubLObject)SubLObjectFactory.makeString("country Of Nationality")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("assignmentRoughDuration")), (SubLObject)SubLObjectFactory.makeString("assignment Rough Duration")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("sourcesForTopic")), (SubLObject)SubLObjectFactory.makeString("sources For Topic")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("predicatesSBHLPathMarkingFunctionType")), (SubLObject)SubLObjectFactory.makeString("predicates SBHL Path Marking Function Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("taskSchedulerTaskTimePattern")), (SubLObject)SubLObjectFactory.makeString("task Scheduler Task Time Pattern")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("criterialForTerrainTacticalRole-Negative")), (SubLObject)SubLObjectFactory.makeString("criterial For Terrain Tactical Role Negative")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("parserTestTarget")), (SubLObject)SubLObjectFactory.makeString("parser Test Target")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("affixSemantics")), (SubLObject)SubLObjectFactory.makeString("affix Semantics")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("contextOfPCW")), (SubLObject)SubLObjectFactory.makeString("context Of PCW")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("faultVulnerability-OS")), (SubLObject)SubLObjectFactory.makeString("fault Vulnerability OS")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("subTopicPrintString")), (SubLObject)SubLObjectFactory.makeString("sub Topic Print String")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("commonLanguage")), (SubLObject)SubLObjectFactory.makeString("common Language")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("divisorTypeForQuantityType")), (SubLObject)SubLObjectFactory.makeString("divisor Type For Quantity Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("averagePrecipitation")), (SubLObject)SubLObjectFactory.makeString("average Precipitation")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("predicateSBHLTransfersViaArg")), (SubLObject)SubLObjectFactory.makeString("predicate SBHL Transfers Via Arg")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("taskSchedulerTaskUser")), (SubLObject)SubLObjectFactory.makeString("task Scheduler Task User")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("useFor")), (SubLObject)SubLObjectFactory.makeString("use For")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("industryFacilities")), (SubLObject)SubLObjectFactory.makeString("industry Facilities")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("predicateSBHLTransfersThroughModule")), (SubLObject)SubLObjectFactory.makeString("predicate SBHL Transfers Through Module")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("periodOfTimeIntervalSeries")), (SubLObject)SubLObjectFactory.makeString("period Of Time Interval Series")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("keWeakSuggestion")), (SubLObject)SubLObjectFactory.makeString("ke Weak Suggestion")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("spatiallyDisjoint")), (SubLObject)SubLObjectFactory.makeString("spatially Disjoint")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("bugzillaBugForProduct")), (SubLObject)SubLObjectFactory.makeString("bugzilla Bug For Product")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("taskAdvisor")), (SubLObject)SubLObjectFactory.makeString("task Advisor")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("bodyPartsUsed-TypeType")), (SubLObject)SubLObjectFactory.makeString("body Parts Used Type Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("taskReviewer")), (SubLObject)SubLObjectFactory.makeString("task Reviewer")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("cn:IsA")), (SubLObject)SubLObjectFactory.makeString("cn: Is A")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("most")), (SubLObject)SubLObjectFactory.makeString("most")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("organizationTypeMembersActiveInField")), (SubLObject)SubLObjectFactory.makeString("organization Type Members Active In Field")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("maximumDepth")), (SubLObject)SubLObjectFactory.makeString("maximum Depth")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("ftDeducibleFrom")), (SubLObject)SubLObjectFactory.makeString("ft Deducible From")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("domainKnowledgePredicateForCycSecureComponent")), (SubLObject)SubLObjectFactory.makeString("domain Knowledge Predicate For Cyc Secure Component")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("interArgReln3-1")), (SubLObject)SubLObjectFactory.makeString("inter Arg Reln 3 1")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("addictedTo")), (SubLObject)SubLObjectFactory.makeString("addicted To")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("provenanceOfMediaSeriesProduct")), (SubLObject)SubLObjectFactory.makeString("provenance Of Media Series Product")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("commonGenlPreds")), (SubLObject)SubLObjectFactory.makeString("common Genl Preds")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("subcatFrameHeadKeyword")), (SubLObject)SubLObjectFactory.makeString("subcat Frame Head Keyword")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("government")), (SubLObject)SubLObjectFactory.makeString("government")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("nativeLanguage")), (SubLObject)SubLObjectFactory.makeString("native Language")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("granuleOfSpatialStuff")), (SubLObject)SubLObjectFactory.makeString("granule Of Spatial Stuff")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("programTypeStrings")), (SubLObject)SubLObjectFactory.makeString("program Type Strings")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("cblRelationshipHasKeyword")), (SubLObject)SubLObjectFactory.makeString("cbl Relationship Has Keyword")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("subEventTypes")), (SubLObject)SubLObjectFactory.makeString("sub Event Types")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("requiresOperatingSystem")), (SubLObject)SubLObjectFactory.makeString("requires Operating System")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("bioForProposal-short")), (SubLObject)SubLObjectFactory.makeString("bio For Proposalshort")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("superlativeDegree")), (SubLObject)SubLObjectFactory.makeString("superlative Degree")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("geographicalSubRegionsOfBodyOfWater")), (SubLObject)SubLObjectFactory.makeString("geographical Sub Regions Of Body Of Water")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("lastProperSubEventTypes")), (SubLObject)SubLObjectFactory.makeString("last Proper Sub Event Types")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("testCollectionForKnowledgeSource")), (SubLObject)SubLObjectFactory.makeString("test Collection For Knowledge Source")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("roleTypesForEventType")), (SubLObject)SubLObjectFactory.makeString("role Types For Event Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("facetBasedOnTypeBinaryPredInverse")), (SubLObject)SubLObjectFactory.makeString("facet Based On Type Binary Pred Inverse")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("interArgReln1-4")), (SubLObject)SubLObjectFactory.makeString("inter Arg Reln 1 4")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("softwareParameterDomain")), (SubLObject)SubLObjectFactory.makeString("software Parameter Domain")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("prototypicalActivityTypeOfPersonType")), (SubLObject)SubLObjectFactory.makeString("prototypical Activity Type Of Person Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("programFunctionIdentifier")), (SubLObject)SubLObjectFactory.makeString("program Function Identifier")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("pnMassNumber")), (SubLObject)SubLObjectFactory.makeString("pn Mass Number")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("authenticationSourceFor")), (SubLObject)SubLObjectFactory.makeString("authentication Source For")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("stringSkipped")), (SubLObject)SubLObjectFactory.makeString("string Skipped")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("programInstalledWithPackage")), (SubLObject)SubLObjectFactory.makeString("program Installed With Package")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("characteristicActivityTypeOfPersonType")), (SubLObject)SubLObjectFactory.makeString("characteristic Activity Type Of Person Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("biologicalWeaponTypeBasisType")), (SubLObject)SubLObjectFactory.makeString("biological Weapon Type Basis Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owlURI")), (SubLObject)SubLObjectFactory.makeString("owl URI")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("immediatePrecursors-Chemical")), (SubLObject)SubLObjectFactory.makeString("immediate Precursors Chemical")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("performanceOfWork")), (SubLObject)SubLObjectFactory.makeString("performance Of Work")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("languagePromptForUIA")), (SubLObject)SubLObjectFactory.makeString("language Prompt For UIA")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("issuerOfCW")), (SubLObject)SubLObjectFactory.makeString("issuer Of CW")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("genlWorks")), (SubLObject)SubLObjectFactory.makeString("genl Works")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("subTimeSliceType")), (SubLObject)SubLObjectFactory.makeString("sub Time Slice Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("productTypeLicensedForTreatmentOf")), (SubLObject)SubLObjectFactory.makeString("product Type Licensed For Treatment Of")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("dateOfInvention")), (SubLObject)SubLObjectFactory.makeString("date Of Invention")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("agentTypeEmployedByOrgType")), (SubLObject)SubLObjectFactory.makeString("agent Type Employed By Org Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("constantCopiedFrom")), (SubLObject)SubLObjectFactory.makeString("constant Copied From")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("negationQuantities")), (SubLObject)SubLObjectFactory.makeString("negation Quantities")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("basedInRegion")), (SubLObject)SubLObjectFactory.makeString("based In Region")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("originallyFromRegion")), (SubLObject)SubLObjectFactory.makeString("originally From Region")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("genlPrograms")), (SubLObject)SubLObjectFactory.makeString("genl Programs")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("averageDischarge")), (SubLObject)SubLObjectFactory.makeString("average Discharge")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("programCallsProgram")), (SubLObject)SubLObjectFactory.makeString("program Calls Program")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("chiefPorts")), (SubLObject)SubLObjectFactory.makeString("chief Ports")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("namedAfter")), (SubLObject)SubLObjectFactory.makeString("named After")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("validationRequiredOnTemplatePosition")), (SubLObject)SubLObjectFactory.makeString("validation Required On Template Position")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("populationGrowthRate")), (SubLObject)SubLObjectFactory.makeString("population Growth Rate")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("testCollectionCyclistResponsible")), (SubLObject)SubLObjectFactory.makeString("test Collection Cyclist Responsible")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("fileConfiguresSoftware")), (SubLObject)SubLObjectFactory.makeString("file Configures Software")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("policyTypeProtectsAgainst")), (SubLObject)SubLObjectFactory.makeString("policy Type Protects Against")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("arityMax")), (SubLObject)SubLObjectFactory.makeString("arity Max")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("characteristicActivityTypeOfPersonType-AtLeastOnce")), (SubLObject)SubLObjectFactory.makeString("characteristic Activity Type Of Person Type At Least Once")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("developedProductType")), (SubLObject)SubLObjectFactory.makeString("developed Product Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("spans-Bridgelike")), (SubLObject)SubLObjectFactory.makeString("spans-Bridgelike")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("interArgReln3-4")), (SubLObject)SubLObjectFactory.makeString("inter Arg Reln 3 4")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("majorReligions")), (SubLObject)SubLObjectFactory.makeString("major Religions")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("candidateProperSubSituationTypes")), (SubLObject)SubLObjectFactory.makeString("candidate Proper Sub Situation Types")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("ncRuleTemplate")), (SubLObject)SubLObjectFactory.makeString("nc Rule Template")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("templateTypeForFocalTermType")), (SubLObject)SubLObjectFactory.makeString("template Type For Focal Term Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("regularDegree")), (SubLObject)SubLObjectFactory.makeString("regular Degree")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("studies")), (SubLObject)SubLObjectFactory.makeString("studies")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("cn:UsedFor")), (SubLObject)SubLObjectFactory.makeString("cn: Used For")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("softwareUpdateDownloadLink")), (SubLObject)SubLObjectFactory.makeString("software Update Download Link")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("unitTypeDimensionalAnalysis")), (SubLObject)SubLObjectFactory.makeString("unit Type Dimensional Analysis")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("schoolSymbolName-Female")), (SubLObject)SubLObjectFactory.makeString("school Symbol Name Female")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("assertMtForFormulaTemplate")), (SubLObject)SubLObjectFactory.makeString("assert Mt For Formula Template")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("queryMtForTopicAssertions")), (SubLObject)SubLObjectFactory.makeString("query Mt For Topic Assertions")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("symmetricPhysicalPartTypes")), (SubLObject)SubLObjectFactory.makeString("symmetric Physical Part Types")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("predicatesSBHLPathTerminatingMarkFunction")), (SubLObject)SubLObjectFactory.makeString("predicates SBHL Path Terminating Mark Function")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("constructionExistentialState")), (SubLObject)SubLObjectFactory.makeString("construction Existential State")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("eventTypeUsesDeviceType")), (SubLObject)SubLObjectFactory.makeString("event Type Uses Device Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("generateArgWithOutsideScope")), (SubLObject)SubLObjectFactory.makeString("generate Arg With Outside Scope")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("nounLearnerSenseGloss")), (SubLObject)SubLObjectFactory.makeString("noun Learner Sense Gloss")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("vehicleLoadClass")), (SubLObject)SubLObjectFactory.makeString("vehicle Load Class")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("dataTypeExploitedBy")), (SubLObject)SubLObjectFactory.makeString("data Type Exploited By")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("topicOfDatabase")), (SubLObject)SubLObjectFactory.makeString("topic Of Database")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("syntacticNodeCategory")), (SubLObject)SubLObjectFactory.makeString("syntactic Node Category")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("softwareObjectUsesLibrary")), (SubLObject)SubLObjectFactory.makeString("software Object Uses Library")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("templateTopicGenls")), (SubLObject)SubLObjectFactory.makeString("template Topic Genls")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("typicalArmamentOfUnitType")), (SubLObject)SubLObjectFactory.makeString("typical Armament Of Unit Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("greaterThan")), (SubLObject)SubLObjectFactory.makeString("greater Than")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("cn:PropertyOf")), (SubLObject)SubLObjectFactory.makeString("cn: Property Of")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("filterCollections")), (SubLObject)SubLObjectFactory.makeString("filter Collections")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("hasWhatAsBoundary")), (SubLObject)SubLObjectFactory.makeString("has What As Boundary")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("terrainClimateType")), (SubLObject)SubLObjectFactory.makeString("terrain Climate Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("softwareParameterHasType")), (SubLObject)SubLObjectFactory.makeString("software Parameter Has Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("tNTEquivalent-Type")), (SubLObject)SubLObjectFactory.makeString("TNT Equivalent Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("unitTypeUsesTacticalObjectType")), (SubLObject)SubLObjectFactory.makeString("unit Type Uses Tactical Object Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("coaSupportingTask")), (SubLObject)SubLObjectFactory.makeString("coa Supporting Task")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("classificationOfReport")), (SubLObject)SubLObjectFactory.makeString("classification Of Report")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("streetOfAddress")), (SubLObject)SubLObjectFactory.makeString("street Of Address")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("formulaTemplateTypeHasTopicType")), (SubLObject)SubLObjectFactory.makeString("formula Template Type Has Topic Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("webSiteURL")), (SubLObject)SubLObjectFactory.makeString("web Site URL")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rAMSize")), (SubLObject)SubLObjectFactory.makeString("RAM Size")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("seniorExecutives")), (SubLObject)SubLObjectFactory.makeString("senior Executives")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("tmInverseSymbol")), (SubLObject)SubLObjectFactory.makeString("tm Inverse Symbol")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("majorCityInState")), (SubLObject)SubLObjectFactory.makeString("major City In State")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("derivationalAffixResultPOS")), (SubLObject)SubLObjectFactory.makeString("derivational Affix Result POS")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("employeeStatus")), (SubLObject)SubLObjectFactory.makeString("employee Status")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("denotatumArg")), (SubLObject)SubLObjectFactory.makeString("denotatum Arg")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("programImplementsProtocol")), (SubLObject)SubLObjectFactory.makeString("program Implements Protocol")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("waterAreaOfRegion")), (SubLObject)SubLObjectFactory.makeString("water Area Of Region")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("to-Generic")), (SubLObject)SubLObjectFactory.makeString("to-Generic")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("keStrongSuggestionInverse")), (SubLObject)SubLObjectFactory.makeString("ke Strong Suggestion Inverse")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("durationOfType")), (SubLObject)SubLObjectFactory.makeString("duration Of Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("testDerivedFrom")), (SubLObject)SubLObjectFactory.makeString("test Derived From")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("infantMortalityRate")), (SubLObject)SubLObjectFactory.makeString("infant Mortality Rate")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("typeLaunchesProjectileType")), (SubLObject)SubLObjectFactory.makeString("type Launches Projectile Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("nationalBudgetRevenues")), (SubLObject)SubLObjectFactory.makeString("national Budget Revenues")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("maxQuantValue")), (SubLObject)SubLObjectFactory.makeString("max Quant Value")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("taxonMembers")), (SubLObject)SubLObjectFactory.makeString("taxon Members")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("nationalBudgetExpenditures")), (SubLObject)SubLObjectFactory.makeString("national Budget Expenditures")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("predicatesCycLInitializationModule")), (SubLObject)SubLObjectFactory.makeString("predicates Cyc L Initialization Module")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("naturalHazardsInRegion")), (SubLObject)SubLObjectFactory.makeString("natural Hazards In Region")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("linked")), (SubLObject)SubLObjectFactory.makeString("linked")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("positionInFormulaTemplateIsReplaceable")), (SubLObject)SubLObjectFactory.makeString("position In Formula Template Is Replaceable")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("massNumber")), (SubLObject)SubLObjectFactory.makeString("mass Number")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("deviceTypeUsed")), (SubLObject)SubLObjectFactory.makeString("device Type Used")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("riverEndTopography")), (SubLObject)SubLObjectFactory.makeString("river End Topography")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("objectHasColor")), (SubLObject)SubLObjectFactory.makeString("object Has Color")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("regularAdverb")), (SubLObject)SubLObjectFactory.makeString("regular Adverb")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("conditionAffectsOrgType")), (SubLObject)SubLObjectFactory.makeString("condition Affects Org Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("ncRuleTests")), (SubLObject)SubLObjectFactory.makeString("nc Rule Tests")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("sentenceDesignationArgnum")), (SubLObject)SubLObjectFactory.makeString("sentence Designation Argnum")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("regulatesObjectType")), (SubLObject)SubLObjectFactory.makeString("regulates Object Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("considerSpecializing")), (SubLObject)SubLObjectFactory.makeString("consider Specializing")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("genlModFeatures")), (SubLObject)SubLObjectFactory.makeString("genl Mod Features")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("fieldsOfCompetence")), (SubLObject)SubLObjectFactory.makeString("fields Of Competence")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("policyTypeCoversTypes")), (SubLObject)SubLObjectFactory.makeString("policy Type Covers Types")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("topicOfClump")), (SubLObject)SubLObjectFactory.makeString("topic Of Clump")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("deviceTypeManipulates")), (SubLObject)SubLObjectFactory.makeString("device Type Manipulates")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("predicateSBHLIndexArg")), (SubLObject)SubLObjectFactory.makeString("predicate SBHL Index Arg")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("subInformation")), (SubLObject)SubLObjectFactory.makeString("sub Information")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("derivedConceptualWork")), (SubLObject)SubLObjectFactory.makeString("derived Conceptual Work")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("tmSuperset")), (SubLObject)SubLObjectFactory.makeString("tm Superset")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("glfLabelForArcsBasedOnExpandedPred")), (SubLObject)SubLObjectFactory.makeString("glf Label For Arcs Based On Expanded Pred")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("sourceOfTerm-Person")), (SubLObject)SubLObjectFactory.makeString("source Of Term Person")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("orbits")), (SubLObject)SubLObjectFactory.makeString("orbits")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("literacyRate")), (SubLObject)SubLObjectFactory.makeString("literacy Rate")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("testTypeFolder")), (SubLObject)SubLObjectFactory.makeString("test Type Folder")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("suffixString")), (SubLObject)SubLObjectFactory.makeString("suffix String")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("hasAward")), (SubLObject)SubLObjectFactory.makeString("has Award")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("topicOfBeliefSystem")), (SubLObject)SubLObjectFactory.makeString("topic Of Belief System")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("sksPhysicalSchemaDescriptionMt")), (SubLObject)SubLObjectFactory.makeString("sks Physical Schema Description Mt")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("programFunctionOperator")), (SubLObject)SubLObjectFactory.makeString("program Function Operator")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("commerciallyUsefulPartTypes")), (SubLObject)SubLObjectFactory.makeString("commercially Useful Part Types")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("perpendicularVectors")), (SubLObject)SubLObjectFactory.makeString("perpendicular Vectors")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("sticksInto-2D")), (SubLObject)SubLObjectFactory.makeString("sticks Into 2 D")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("perfect")), (SubLObject)SubLObjectFactory.makeString("perfect")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("compassValueOfDirection")), (SubLObject)SubLObjectFactory.makeString("compass Value Of Direction")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("bugCausesBadParaphraseInQueryLibrary")), (SubLObject)SubLObjectFactory.makeString("bug Causes Bad Paraphrase In Query Library")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("organismTypeExistentialThreatState")), (SubLObject)SubLObjectFactory.makeString("organism Type Existential Threat State")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("correlatedColor")), (SubLObject)SubLObjectFactory.makeString("correlated Color")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("notablePeaksInThisGroup")), (SubLObject)SubLObjectFactory.makeString("notable Peaks In This Group")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("formOfDisease")), (SubLObject)SubLObjectFactory.makeString("form Of Disease")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("formulaTemplateHasType")), (SubLObject)SubLObjectFactory.makeString("formula Template Has Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("startsDuring")), (SubLObject)SubLObjectFactory.makeString("starts During")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("altitudeOfLowestPointIs")), (SubLObject)SubLObjectFactory.makeString("altitude Of Lowest Point Is")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("whereRiverStarts")), (SubLObject)SubLObjectFactory.makeString("where River Starts")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("maximumDurationOfType")), (SubLObject)SubLObjectFactory.makeString("maximum Duration Of Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("embeddedRegion")), (SubLObject)SubLObjectFactory.makeString("embedded Region")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("controls")), (SubLObject)SubLObjectFactory.makeString("controls")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("standardEquipmentOfUnitType")), (SubLObject)SubLObjectFactory.makeString("standard Equipment Of Unit Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("agentSupportsAgent-Generic")), (SubLObject)SubLObjectFactory.makeString("agent Supports Agent Generic")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("arg5Format")), (SubLObject)SubLObjectFactory.makeString("arg 5 Format")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("subIndustryTypes")), (SubLObject)SubLObjectFactory.makeString("sub Industry Types")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("schoolTypeAttended")), (SubLObject)SubLObjectFactory.makeString("school Type Attended")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("hasPortalToRegion")), (SubLObject)SubLObjectFactory.makeString("has Portal To Region")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("predicatesSBHLPathUnmarkingFunctionType")), (SubLObject)SubLObjectFactory.makeString("predicates SBHL Path Unmarking Function Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("sksSourceDescriptionMt")), (SubLObject)SubLObjectFactory.makeString("sks Source Description Mt")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("servesCuisine")), (SubLObject)SubLObjectFactory.makeString("serves Cuisine")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("arg5Genl")), (SubLObject)SubLObjectFactory.makeString("arg 5 Genl")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("keyParticipants")), (SubLObject)SubLObjectFactory.makeString("key Participants")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("purposeOf-EventTypeSitType")), (SubLObject)SubLObjectFactory.makeString("purpose Of Event Type Sit Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("hasHeadquartersInCountry")), (SubLObject)SubLObjectFactory.makeString("has Headquarters In Country")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("localEMailAddressText")), (SubLObject)SubLObjectFactory.makeString("local E Mail Address Text")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("oppositeCollections")), (SubLObject)SubLObjectFactory.makeString("opposite Collections")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("semTransPredForPOS")), (SubLObject)SubLObjectFactory.makeString("sem Trans Pred For POS")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("projectSource-FactEntry")), (SubLObject)SubLObjectFactory.makeString("project Source Fact Entry")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("typeMeasuresQuantity")), (SubLObject)SubLObjectFactory.makeString("type Measures Quantity")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("intersectionType")), (SubLObject)SubLObjectFactory.makeString("intersection Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("arityMin")), (SubLObject)SubLObjectFactory.makeString("arity Min")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("facetBasedOnBinaryPred")), (SubLObject)SubLObjectFactory.makeString("facet Based On Binary Pred")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("computerIP")), (SubLObject)SubLObjectFactory.makeString("computer IP")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("hasZodiacSign")), (SubLObject)SubLObjectFactory.makeString("has Zodiac Sign")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("linkInSystem")), (SubLObject)SubLObjectFactory.makeString("link In System")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("strictlyFunctionalInArgs")), (SubLObject)SubLObjectFactory.makeString("strictly Functional In Args")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("hasPersonality")), (SubLObject)SubLObjectFactory.makeString("has Personality")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("htmlTagSymbol")), (SubLObject)SubLObjectFactory.makeString("html Tag Symbol")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("bugzillaBugReportReporter")), (SubLObject)SubLObjectFactory.makeString("bugzilla Bug Report Reporter")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("bugBlocksQuery")), (SubLObject)SubLObjectFactory.makeString("bug Blocks Query")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("adjectiveOfCountry")), (SubLObject)SubLObjectFactory.makeString("adjective Of Country")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("uniqueIDForType")), (SubLObject)SubLObjectFactory.makeString("unique ID For Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("educationLevel")), (SubLObject)SubLObjectFactory.makeString("education Level")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("cityInState")), (SubLObject)SubLObjectFactory.makeString("city In State")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("bugCausesSpuriousProof")), (SubLObject)SubLObjectFactory.makeString("bug Causes Spurious Proof")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("ftDeducibleFrom-Dual")), (SubLObject)SubLObjectFactory.makeString("ft Deducible From Dual")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("excludeReplacementOptionForFormulaTemplate")), (SubLObject)SubLObjectFactory.makeString("exclude Replacement Option For Formula Template")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("typicalColorOfType")), (SubLObject)SubLObjectFactory.makeString("typical Color Of Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("predicatesPropertyTypeOfArg1")), (SubLObject)SubLObjectFactory.makeString("predicates Property Type Of Arg 1")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("terrainType")), (SubLObject)SubLObjectFactory.makeString("terrain Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("properPhysicalPartTypes")), (SubLObject)SubLObjectFactory.makeString("proper Physical Part Types")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("taskTypeRequiresResourceType")), (SubLObject)SubLObjectFactory.makeString("task Type Requires Resource Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("vaccineEffectiveAgainstMicroorgType")), (SubLObject)SubLObjectFactory.makeString("vaccine Effective Against Microorg Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("areaThisLanguageNativeTo")), (SubLObject)SubLObjectFactory.makeString("area This Language Native To")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("hasOffice")), (SubLObject)SubLObjectFactory.makeString("has Office")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("dialects")), (SubLObject)SubLObjectFactory.makeString("dialects")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("elInverse")), (SubLObject)SubLObjectFactory.makeString("el Inverse")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("nodeInSystem")), (SubLObject)SubLObjectFactory.makeString("node In System")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("performedByPart")), (SubLObject)SubLObjectFactory.makeString("performed By Part")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("pastTense-Universal")), (SubLObject)SubLObjectFactory.makeString("past Tense Universal")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("preconditionFor-Events")), (SubLObject)SubLObjectFactory.makeString("precondition For Events")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("deviceTypesCommonlyUsedTogether")), (SubLObject)SubLObjectFactory.makeString("device Types Commonly Used Together")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("agentTypePerformsWorkOfType")), (SubLObject)SubLObjectFactory.makeString("agent Type Performs Work Of Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("runsUnderOS")), (SubLObject)SubLObjectFactory.makeString("runs Under OS")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("locatedAtPoint-SurfaceGeographical")), (SubLObject)SubLObjectFactory.makeString("located At Point Surface Geographical")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("populationOfRegion")), (SubLObject)SubLObjectFactory.makeString("population Of Region")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("cn:ThematicKLine")), (SubLObject)SubLObjectFactory.makeString("cn: Thematic K Line")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("standardVehicleOfUnitType")), (SubLObject)SubLObjectFactory.makeString("standard Vehicle Of Unit Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("genlKBContentTests")), (SubLObject)SubLObjectFactory.makeString("genl KB Content Tests")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("basicSpeechPartPred")), (SubLObject)SubLObjectFactory.makeString("basic Speech Part Pred")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("industryProducesType")), (SubLObject)SubLObjectFactory.makeString("industry Produces Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("hasRightsOver")), (SubLObject)SubLObjectFactory.makeString("has Rights Over")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("typeUsedWithCycModule")), (SubLObject)SubLObjectFactory.makeString("type Used With Cyc Module")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("tmSymbol")), (SubLObject)SubLObjectFactory.makeString("tm Symbol")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("headOfStateOf")), (SubLObject)SubLObjectFactory.makeString("head Of State Of")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("postEvents")), (SubLObject)SubLObjectFactory.makeString("post Events")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("causes-SitTypeSitType")), (SubLObject)SubLObjectFactory.makeString("causes Sit Type Sit Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("focalTermIntroduction")), (SubLObject)SubLObjectFactory.makeString("focal Term Introduction")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("titleOfPerson-String")), (SubLObject)SubLObjectFactory.makeString("title Of Person String")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("stufflikeWRTPred")), (SubLObject)SubLObjectFactory.makeString("stufflike WRT Pred")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("requestingAgent")), (SubLObject)SubLObjectFactory.makeString("requesting Agent")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("templateReplacementsInvisibleForPosition")), (SubLObject)SubLObjectFactory.makeString("template Replacements Invisible For Position")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("properSubEvents")), (SubLObject)SubLObjectFactory.makeString("proper Sub Events")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("temporallyIntrinsicArg")), (SubLObject)SubLObjectFactory.makeString("temporally Intrinsic Arg")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("stringLength")), (SubLObject)SubLObjectFactory.makeString("string Length")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("orgTypeFacilityType")), (SubLObject)SubLObjectFactory.makeString("org Type Facility Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("personHairColor")), (SubLObject)SubLObjectFactory.makeString("person Hair Color")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("nationalLanguage")), (SubLObject)SubLObjectFactory.makeString("national Language")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("reflexiveOn")), (SubLObject)SubLObjectFactory.makeString("reflexive On")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("cityOfAddress")), (SubLObject)SubLObjectFactory.makeString("city Of Address")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("preferredNameString")), (SubLObject)SubLObjectFactory.makeString("preferred Name String")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("nextHigherOrder")), (SubLObject)SubLObjectFactory.makeString("next Higher Order")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("posOfPhraseType")), (SubLObject)SubLObjectFactory.makeString("pos Of Phrase Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("primaryActivityTypeOfLocation")), (SubLObject)SubLObjectFactory.makeString("primary Activity Type Of Location")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("arg4Format")), (SubLObject)SubLObjectFactory.makeString("arg 4 Format")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("whereRiverEnds")), (SubLObject)SubLObjectFactory.makeString("where River Ends")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("inhabitantTypes")), (SubLObject)SubLObjectFactory.makeString("inhabitant Types")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("plural")), (SubLObject)SubLObjectFactory.makeString("plural")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("interArgReln2-1")), (SubLObject)SubLObjectFactory.makeString("inter Arg Reln 2 1")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("officeInCountry")), (SubLObject)SubLObjectFactory.makeString("office In Country")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("posForTemplateCategory")), (SubLObject)SubLObjectFactory.makeString("pos For Template Category")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("salientURL")), (SubLObject)SubLObjectFactory.makeString("salient URL")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("predicatesCycLModuleType")), (SubLObject)SubLObjectFactory.makeString("predicates Cyc L Module Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("suffrageAge")), (SubLObject)SubLObjectFactory.makeString("suffrage Age")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("reportTime")), (SubLObject)SubLObjectFactory.makeString("report Time")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("subTopicOrderedQueryWords")), (SubLObject)SubLObjectFactory.makeString("sub Topic Ordered Query Words")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("computerSpeed")), (SubLObject)SubLObjectFactory.makeString("computer Speed")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("foundingDate")), (SubLObject)SubLObjectFactory.makeString("founding Date")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("taskSchedulerTaskExpression")), (SubLObject)SubLObjectFactory.makeString("task Scheduler Task Expression")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("regionalTelephoneAreaCode")), (SubLObject)SubLObjectFactory.makeString("regional Telephone Area Code")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("subTopicQueryRestrictClause")), (SubLObject)SubLObjectFactory.makeString("sub Topic Query Restrict Clause")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("hobbyCWPerformedBy")), (SubLObject)SubLObjectFactory.makeString("hobby CW Performed By")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("dateOfPublication-CW")), (SubLObject)SubLObjectFactory.makeString("date Of Publication CW")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("sksLogicalSchemaDescriptionMt")), (SubLObject)SubLObjectFactory.makeString("sks Logical Schema Description Mt")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("roomFaces")), (SubLObject)SubLObjectFactory.makeString("room Faces")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("hasStatusWithOrganization")), (SubLObject)SubLObjectFactory.makeString("has Status With Organization")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("placeJoinedJihad")), (SubLObject)SubLObjectFactory.makeString("place Joined Jihad")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("programAuthor")), (SubLObject)SubLObjectFactory.makeString("program Author")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("typicalLocationOfType")), (SubLObject)SubLObjectFactory.makeString("typical Location Of Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("from-Generic")), (SubLObject)SubLObjectFactory.makeString("from-Generic")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("standardUnit")), (SubLObject)SubLObjectFactory.makeString("standard Unit")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("keGenlsInducedStrongSuggestionPreds")), (SubLObject)SubLObjectFactory.makeString("ke Genls Induced Strong Suggestion Preds")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("predicatesCycLGraphType")), (SubLObject)SubLObjectFactory.makeString("predicates Cyc L Graph Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("taskTypeUsesTacticalObjectType")), (SubLObject)SubLObjectFactory.makeString("task Type Uses Tactical Object Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("negativeVestedInterest")), (SubLObject)SubLObjectFactory.makeString("negative Vested Interest")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("requiredActorSlots")), (SubLObject)SubLObjectFactory.makeString("required Actor Slots")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("parasiteCausesAilmentCondition")), (SubLObject)SubLObjectFactory.makeString("parasite Causes Ailment Condition")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("closedUnder")), (SubLObject)SubLObjectFactory.makeString("closed Under")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("incorporatedIn")), (SubLObject)SubLObjectFactory.makeString("incorporated In")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("placeOfDeath")), (SubLObject)SubLObjectFactory.makeString("place Of Death")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("orderOfCollection")), (SubLObject)SubLObjectFactory.makeString("order Of Collection")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("accountLoggedInOn")), (SubLObject)SubLObjectFactory.makeString("account Logged In On")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("holdsIn")), (SubLObject)SubLObjectFactory.makeString("holds In")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("holidayCelebratedInPolity")), (SubLObject)SubLObjectFactory.makeString("holiday Celebrated In Polity")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("keStrongSuggestionPreds")), (SubLObject)SubLObjectFactory.makeString("ke Strong Suggestion Preds")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("containsModules")), (SubLObject)SubLObjectFactory.makeString("contains Modules")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("targetPosture")), (SubLObject)SubLObjectFactory.makeString("target Posture")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("spatiallyIntersects")), (SubLObject)SubLObjectFactory.makeString("spatially Intersects")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("interArgReln2-3")), (SubLObject)SubLObjectFactory.makeString("inter Arg Reln 2 3")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("totalMerchantMarine-Mass")), (SubLObject)SubLObjectFactory.makeString("total Merchant Marine Mass")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("regionLacksTransportMeans")), (SubLObject)SubLObjectFactory.makeString("region Lacks Transport Means")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("taskUsesContributionsOf")), (SubLObject)SubLObjectFactory.makeString("task Uses Contributions Of")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("holdsSometimeDuring")), (SubLObject)SubLObjectFactory.makeString("holds Sometime During")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("affiliatedOrganizations")), (SubLObject)SubLObjectFactory.makeString("affiliated Organizations")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("succeedingIntervalType")), (SubLObject)SubLObjectFactory.makeString("succeeding Interval Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("quantitySubsumes")), (SubLObject)SubLObjectFactory.makeString("quantity Subsumes")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("glfNodeSemantics-Underspecified")), (SubLObject)SubLObjectFactory.makeString("glf Node Semantics Underspecified")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("wornWithGarmentType")), (SubLObject)SubLObjectFactory.makeString("worn With Garment Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("presentInRegion")), (SubLObject)SubLObjectFactory.makeString("present In Region")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("participantIn")), (SubLObject)SubLObjectFactory.makeString("participant In")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("gunTakesAmmunition")), (SubLObject)SubLObjectFactory.makeString("gun Takes Ammunition")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("multiplierTypeForQuantityType")), (SubLObject)SubLObjectFactory.makeString("multiplier Type For Quantity Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("posPredForTemplateCategory")), (SubLObject)SubLObjectFactory.makeString("pos Pred For Template Category")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("styleOfMusicPerformer")), (SubLObject)SubLObjectFactory.makeString("style Of Music Performer")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("capitalCity")), (SubLObject)SubLObjectFactory.makeString("capital City")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("taskTypeCommensurateWithOpType")), (SubLObject)SubLObjectFactory.makeString("task Type Commensurate With Op Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("chemicalCASRegistry")), (SubLObject)SubLObjectFactory.makeString("chemical CAS Registry")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("typeAssociatedPaymentPlan")), (SubLObject)SubLObjectFactory.makeString("type Associated Payment Plan")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("colorHasBrightness")), (SubLObject)SubLObjectFactory.makeString("color Has Brightness")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("urgeTypeSatisfied")), (SubLObject)SubLObjectFactory.makeString("urge Type Satisfied")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("partitionedIntoSpecPreds")), (SubLObject)SubLObjectFactory.makeString("partitioned Into Spec Preds")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("typeIngredientTypes")), (SubLObject)SubLObjectFactory.makeString("type Ingredient Types")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("singular")), (SubLObject)SubLObjectFactory.makeString("singular")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("movieActors")), (SubLObject)SubLObjectFactory.makeString("movie Actors")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("physicalExtent")), (SubLObject)SubLObjectFactory.makeString("physical Extent")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("versionOfProductBrand")), (SubLObject)SubLObjectFactory.makeString("version Of Product Brand")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("ageOfAgentWhenJoinedJihad")), (SubLObject)SubLObjectFactory.makeString("age Of Agent When Joined Jihad")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("insMarketedAs")), (SubLObject)SubLObjectFactory.makeString("ins Marketed As")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("contemporaryInArg")), (SubLObject)SubLObjectFactory.makeString("contemporary In Arg")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("predominantLanguage")), (SubLObject)SubLObjectFactory.makeString("predominant Language")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("faultVulnerability-Installed")), (SubLObject)SubLObjectFactory.makeString("fault Vulnerability Installed")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("soleMakerOfProductType")), (SubLObject)SubLObjectFactory.makeString("sole Maker Of Product Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("orthography")), (SubLObject)SubLObjectFactory.makeString("orthography")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("inheritAllRolePlayers-SitTypeToSubSitType")), (SubLObject)SubLObjectFactory.makeString("inherit All Role Players Sit Type To Sub Sit Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("significantEventAcquaintance")), (SubLObject)SubLObjectFactory.makeString("significant Event Acquaintance")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("pennTagForPred")), (SubLObject)SubLObjectFactory.makeString("penn Tag For Pred")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("subWorks")), (SubLObject)SubLObjectFactory.makeString("sub Works")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("programRunningOn")), (SubLObject)SubLObjectFactory.makeString("program Running On")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("ksTermString")), (SubLObject)SubLObjectFactory.makeString("ks Term String")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("arg4Genl")), (SubLObject)SubLObjectFactory.makeString("arg 4 Genl")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("fieldsOfFormalEducation")), (SubLObject)SubLObjectFactory.makeString("fields Of Formal Education")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("permanentlyNorthwestOf")), (SubLObject)SubLObjectFactory.makeString("permanently Northwest Of")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("frequentlyInContactWith")), (SubLObject)SubLObjectFactory.makeString("frequently In Contact With")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("minorLeagueAffiliates")), (SubLObject)SubLObjectFactory.makeString("minor League Affiliates")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("testQuerySpecification")), (SubLObject)SubLObjectFactory.makeString("test Query Specification")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("parameterOfProgram")), (SubLObject)SubLObjectFactory.makeString("parameter Of Program")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("countryOfCity")), (SubLObject)SubLObjectFactory.makeString("country Of City")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("informationOrigin")), (SubLObject)SubLObjectFactory.makeString("information Origin")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("programFoundOnComputer")), (SubLObject)SubLObjectFactory.makeString("program Found On Computer")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("eatsWillingly")), (SubLObject)SubLObjectFactory.makeString("eats Willingly")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("meansOfDeployingAgent-BCW")), (SubLObject)SubLObjectFactory.makeString("means Of Deploying Agent BCW")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("exploitTargetsProgram")), (SubLObject)SubLObjectFactory.makeString("exploit Targets Program")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("characteristicActivityTypeOfOrganizationType")), (SubLObject)SubLObjectFactory.makeString("characteristic Activity Type Of Organization Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("typeGenls")), (SubLObject)SubLObjectFactory.makeString("type Genls")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("ethnicity")), (SubLObject)SubLObjectFactory.makeString("ethnicity")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("arg2NotIsa")), (SubLObject)SubLObjectFactory.makeString("arg 2 Not Isa")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("episodeType")), (SubLObject)SubLObjectFactory.makeString("episode Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("followingValue")), (SubLObject)SubLObjectFactory.makeString("following Value")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("variantOfSuffix")), (SubLObject)SubLObjectFactory.makeString("variant Of Suffix")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("formsBorderPart")), (SubLObject)SubLObjectFactory.makeString("forms Border Part")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("permanentlyEastOf")), (SubLObject)SubLObjectFactory.makeString("permanently East Of")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("testMetricsToGather")), (SubLObject)SubLObjectFactory.makeString("test Metrics To Gather")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("speechPartPreds")), (SubLObject)SubLObjectFactory.makeString("speech Part Preds")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("keWeakSuggestionPreds")), (SubLObject)SubLObjectFactory.makeString("ke Weak Suggestion Preds")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("spatiallyIntrinsicArg")), (SubLObject)SubLObjectFactory.makeString("spatially Intrinsic Arg")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("requiredArg1Pred")), (SubLObject)SubLObjectFactory.makeString("required Arg 1 Pred")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("highestEducationLevel")), (SubLObject)SubLObjectFactory.makeString("highest Education Level")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("occupation")), (SubLObject)SubLObjectFactory.makeString("occupation")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("expansion")), (SubLObject)SubLObjectFactory.makeString("expansion")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("agentStaysViableAfterDeployment-BCW")), (SubLObject)SubLObjectFactory.makeString("agent Stays Viable After Deployment BCW")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("pathogenWithRespectTo")), (SubLObject)SubLObjectFactory.makeString("pathogen With Respect To")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("facetBasedOnTypeBinaryPred")), (SubLObject)SubLObjectFactory.makeString("facet Based On Type Binary Pred")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("symmetricOn")), (SubLObject)SubLObjectFactory.makeString("symmetric On")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("dateLeftJihad")), (SubLObject)SubLObjectFactory.makeString("date Left Jihad")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("stateOfCounty")), (SubLObject)SubLObjectFactory.makeString("state Of County")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("agentTypeSellsProductType")), (SubLObject)SubLObjectFactory.makeString("agent Type Sells Product Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("faultVulnerability-Running")), (SubLObject)SubLObjectFactory.makeString("fault Vulnerability Running")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("temporallySubsumes-TypeType")), (SubLObject)SubLObjectFactory.makeString("temporally Subsumes Type Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("properSubSituationTypes")), (SubLObject)SubLObjectFactory.makeString("proper Sub Situation Types")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("intendedTargetTypeOfWeaponType")), (SubLObject)SubLObjectFactory.makeString("intended Target Type Of Weapon Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("lastProperSubSituationTypes")), (SubLObject)SubLObjectFactory.makeString("last Proper Sub Situation Types")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("homepage")), (SubLObject)SubLObjectFactory.makeString("homepage")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("pathogenSoleCauseOfInfectionType")), (SubLObject)SubLObjectFactory.makeString("pathogen Sole Cause Of Infection Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("bordersOn")), (SubLObject)SubLObjectFactory.makeString("borders On")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("activeIngredientsOfType")), (SubLObject)SubLObjectFactory.makeString("active Ingredients Of Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("commonFoodTypeOfCuisine")), (SubLObject)SubLObjectFactory.makeString("common Food Type Of Cuisine")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("interArgReln1-2")), (SubLObject)SubLObjectFactory.makeString("inter Arg Reln 1 2")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("eventTypeDurationOfEffects")), (SubLObject)SubLObjectFactory.makeString("event Type Duration Of Effects")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("nameString-NC")), (SubLObject)SubLObjectFactory.makeString("name String NC")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("correspondingMilitaryTaskType")), (SubLObject)SubLObjectFactory.makeString("corresponding Military Task Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("containsInformationAbout-Focally")), (SubLObject)SubLObjectFactory.makeString("contains Information About Focally")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("protectsAgainstType")), (SubLObject)SubLObjectFactory.makeString("protects Against Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("geopoliticalSubdivision")), (SubLObject)SubLObjectFactory.makeString("geopolitical Subdivision")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("domainExamplePredSentences")), (SubLObject)SubLObjectFactory.makeString("domain Example Pred Sentences")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("preferredEMailAddressText")), (SubLObject)SubLObjectFactory.makeString("preferred E Mail Address Text")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("subjectOfReport-Prop")), (SubLObject)SubLObjectFactory.makeString("subject Of Report Prop")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("keRequirementPreds")), (SubLObject)SubLObjectFactory.makeString("ke Requirement Preds")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("uniquePhysicalPartTypes")), (SubLObject)SubLObjectFactory.makeString("unique Physical Part Types")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("placeInCity")), (SubLObject)SubLObjectFactory.makeString("place In City")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("temporallyDisjointActionTypes")), (SubLObject)SubLObjectFactory.makeString("temporally Disjoint Action Types")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("indicatedDrug")), (SubLObject)SubLObjectFactory.makeString("indicated Drug")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("alias")), (SubLObject)SubLObjectFactory.makeString("alias")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("centralReferencePoint")), (SubLObject)SubLObjectFactory.makeString("central Reference Point")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("agentive-Sg")), (SubLObject)SubLObjectFactory.makeString("agentive-Sg")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("partitionedInto")), (SubLObject)SubLObjectFactory.makeString("partitioned Into")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("urlOfCW")), (SubLObject)SubLObjectFactory.makeString("url Of CW")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("socialClass")), (SubLObject)SubLObjectFactory.makeString("social Class")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("languageSpoken")), (SubLObject)SubLObjectFactory.makeString("language Spoken")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("faultVulnerability-Remote")), (SubLObject)SubLObjectFactory.makeString("fault Vulnerability Remote")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("totalMerchantMarine-Volume")), (SubLObject)SubLObjectFactory.makeString("total Merchant Marine Volume")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("permanentlyNortheastOf")), (SubLObject)SubLObjectFactory.makeString("permanently Northeast Of")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("subLSymbolForModule")), (SubLObject)SubLObjectFactory.makeString("sub L Symbol For Module")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("arg5Isa")), (SubLObject)SubLObjectFactory.makeString("arg 5 Isa")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("dateOfDeathEvent")), (SubLObject)SubLObjectFactory.makeString("date Of Death Event")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("altitudeOfHighestPointIs")), (SubLObject)SubLObjectFactory.makeString("altitude Of Highest Point Is")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("eventTypeCausedDeathOf")), (SubLObject)SubLObjectFactory.makeString("event Type Caused Death Of")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("territoriesControlled")), (SubLObject)SubLObjectFactory.makeString("territories Controlled")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("possessiveRelation")), (SubLObject)SubLObjectFactory.makeString("possessive Relation")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("colorHasRGBRedValue")), (SubLObject)SubLObjectFactory.makeString("color Has RGB Red Value")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("keStrongSuggestion")), (SubLObject)SubLObjectFactory.makeString("ke Strong Suggestion")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("characteristicActivityTypeOfPersonType-Frequently")), (SubLObject)SubLObjectFactory.makeString("characteristic Activity Type Of Person Type Frequently")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("architecturalStyle")), (SubLObject)SubLObjectFactory.makeString("architectural Style")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("sharedNotes")), (SubLObject)SubLObjectFactory.makeString("shared Notes")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("frequentPrototypicalActivityTypeOfPersonType")), (SubLObject)SubLObjectFactory.makeString("frequent Prototypical Activity Type Of Person Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("ableToControl")), (SubLObject)SubLObjectFactory.makeString("able To Control")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("colorHasRGBBlueValue")), (SubLObject)SubLObjectFactory.makeString("color Has RGB Blue Value")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("distributionMedium")), (SubLObject)SubLObjectFactory.makeString("distribution Medium")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("subOrgs-Command")), (SubLObject)SubLObjectFactory.makeString("sub Orgs Command")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("culturalRegionOfOrigin")), (SubLObject)SubLObjectFactory.makeString("cultural Region Of Origin")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("qaWebString")), (SubLObject)SubLObjectFactory.makeString("qa Web String")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("arg4Isa")), (SubLObject)SubLObjectFactory.makeString("arg 4 Isa")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("programStrings")), (SubLObject)SubLObjectFactory.makeString("program Strings")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("colorHasRGBGreenValue")), (SubLObject)SubLObjectFactory.makeString("color Has RGB Green Value")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("exampleNATs")), (SubLObject)SubLObjectFactory.makeString("example NATs")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("ethnicGroupsHere")), (SubLObject)SubLObjectFactory.makeString("ethnic Groups Here")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("unitDefinition")), (SubLObject)SubLObjectFactory.makeString("unit Definition")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("interArgReln1-3")), (SubLObject)SubLObjectFactory.makeString("inter Arg Reln 1 3")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("actionTypeExpressesFeelingType")), (SubLObject)SubLObjectFactory.makeString("action Type Expresses Feeling Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("genreHeyday")), (SubLObject)SubLObjectFactory.makeString("genre Heyday")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("structureInArea")), (SubLObject)SubLObjectFactory.makeString("structure In Area")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("uppercaseOfLowercase")), (SubLObject)SubLObjectFactory.makeString("uppercase Of Lowercase")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("eMailAddressText")), (SubLObject)SubLObjectFactory.makeString("E Mail Address Text")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("quotedArgument")), (SubLObject)SubLObjectFactory.makeString("quoted Argument")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("focalActivityType")), (SubLObject)SubLObjectFactory.makeString("focal Activity Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("modalityFeatures")), (SubLObject)SubLObjectFactory.makeString("modality Features")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("mandatoryGameEquipmentType")), (SubLObject)SubLObjectFactory.makeString("mandatory Game Equipment Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("testResponsibleCyclist")), (SubLObject)SubLObjectFactory.makeString("test Responsible Cyclist")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("formulaForFormulaTemplate")), (SubLObject)SubLObjectFactory.makeString("formula For Formula Template")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("keInducedWeakSuggestionPreds")), (SubLObject)SubLObjectFactory.makeString("ke Induced Weak Suggestion Preds")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("specifiedSubsetOf")), (SubLObject)SubLObjectFactory.makeString("specified Subset Of")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("properSubEventTypes")), (SubLObject)SubLObjectFactory.makeString("proper Sub Event Types")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("dateJoinedJihad")), (SubLObject)SubLObjectFactory.makeString("date Joined Jihad")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("cycSubjectClumps")), (SubLObject)SubLObjectFactory.makeString("cyc Subject Clumps")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("presidentOfCountry")), (SubLObject)SubLObjectFactory.makeString("president Of Country")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("subLIdentifier")), (SubLObject)SubLObjectFactory.makeString("sub L Identifier")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("fileFoundOnComputer")), (SubLObject)SubLObjectFactory.makeString("file Found On Computer")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("inRegion")), (SubLObject)SubLObjectFactory.makeString("in Region")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("countryPhoneCode")), (SubLObject)SubLObjectFactory.makeString("country Phone Code")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("intendedTargetTypeOfAttack")), (SubLObject)SubLObjectFactory.makeString("intended Target Type Of Attack")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("politiesBorderEachOther")), (SubLObject)SubLObjectFactory.makeString("polities Border Each Other")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("predicatesSBHLDisjoinsModule")), (SubLObject)SubLObjectFactory.makeString("predicates SBHL Disjoins Module")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("reifiedUsingTool")), (SubLObject)SubLObjectFactory.makeString("reified Using Tool")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("arg3Isa")), (SubLObject)SubLObjectFactory.makeString("arg 3 Isa")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("predicatesSBHLTypeTest")), (SubLObject)SubLObjectFactory.makeString("predicates SBHL Type Test")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("arg3Genl")), (SubLObject)SubLObjectFactory.makeString("arg 3 Genl")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("arg2Genl")), (SubLObject)SubLObjectFactory.makeString("arg 2 Genl")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("middleNameInitial")), (SubLObject)SubLObjectFactory.makeString("middle Name Initial")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("hasAuthorityOver")), (SubLObject)SubLObjectFactory.makeString("has Authority Over")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("temporallyContains")), (SubLObject)SubLObjectFactory.makeString("temporally Contains")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("superTopics")), (SubLObject)SubLObjectFactory.makeString("super Topics")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("memberTypes")), (SubLObject)SubLObjectFactory.makeString("member Types")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("colorHasHue")), (SubLObject)SubLObjectFactory.makeString("color Has Hue")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("argsIsa")), (SubLObject)SubLObjectFactory.makeString("args Isa")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("arg1NotIsa")), (SubLObject)SubLObjectFactory.makeString("arg 1 Not Isa")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("mainTopic")), (SubLObject)SubLObjectFactory.makeString("main Topic")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("openEntryFormatInArgs")), (SubLObject)SubLObjectFactory.makeString("open Entry Format In Args")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("reformulateTemplateViaSpecification")), (SubLObject)SubLObjectFactory.makeString("reformulate Template Via Specification")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("terrainDecompositions")), (SubLObject)SubLObjectFactory.makeString("terrain Decompositions")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("infoTransferred")), (SubLObject)SubLObjectFactory.makeString("info Transferred")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("transportedInTypes")), (SubLObject)SubLObjectFactory.makeString("transported In Types")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("contradictoryPreds")), (SubLObject)SubLObjectFactory.makeString("contradictory Preds")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("agentTypeUsesArtifactType")), (SubLObject)SubLObjectFactory.makeString("agent Type Uses Artifact Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("genTemplate")), (SubLObject)SubLObjectFactory.makeString("gen Template")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("systemOfWriting")), (SubLObject)SubLObjectFactory.makeString("system Of Writing")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("uppercaseOfLetter")), (SubLObject)SubLObjectFactory.makeString("uppercase Of Letter")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rolesForEventType")), (SubLObject)SubLObjectFactory.makeString("roles For Event Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("templateTopicPrefix")), (SubLObject)SubLObjectFactory.makeString("template Topic Prefix")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("jobClass")), (SubLObject)SubLObjectFactory.makeString("job Class")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("superEventTypes")), (SubLObject)SubLObjectFactory.makeString("super Event Types")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("iteratedProperSubSituationTypes")), (SubLObject)SubLObjectFactory.makeString("iterated Proper Sub Situation Types")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("keInducedStrongSuggestionPreds")), (SubLObject)SubLObjectFactory.makeString("ke Induced Strong Suggestion Preds")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("permanentlyNorthOf")), (SubLObject)SubLObjectFactory.makeString("permanently North Of")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("percentNaturalPopulationIncrease")), (SubLObject)SubLObjectFactory.makeString("percent Natural Population Increase")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("titleForFormulaTemplateType-String")), (SubLObject)SubLObjectFactory.makeString("title For Formula Template Type String")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("subcatFrameKeywords")), (SubLObject)SubLObjectFactory.makeString("subcat Frame Keywords")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rewriteOf")), (SubLObject)SubLObjectFactory.makeString("rewrite Of")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("residenceOfOrganization")), (SubLObject)SubLObjectFactory.makeString("residence Of Organization")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("arg2Format")), (SubLObject)SubLObjectFactory.makeString("arg 2 Format")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("surroundsHorizontally")), (SubLObject)SubLObjectFactory.makeString("surrounds Horizontally")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("mostNotableIsa")), (SubLObject)SubLObjectFactory.makeString("most Notable Isa")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("styleOfArtist")), (SubLObject)SubLObjectFactory.makeString("style Of Artist")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("specializedEquipmentOfUnitType")), (SubLObject)SubLObjectFactory.makeString("specialized Equipment Of Unit Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("inTopic")), (SubLObject)SubLObjectFactory.makeString("in Topic")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("disjointWith")), (SubLObject)SubLObjectFactory.makeString("disjoint With")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("areasOfOrigin")), (SubLObject)SubLObjectFactory.makeString("areas Of Origin")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("conceptuallyRelated")), (SubLObject)SubLObjectFactory.makeString("conceptually Related")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("interArgReln2-4")), (SubLObject)SubLObjectFactory.makeString("inter Arg Reln 2 4")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("arg1Genl")), (SubLObject)SubLObjectFactory.makeString("arg 1 Genl")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("arg3Format")), (SubLObject)SubLObjectFactory.makeString("arg 3 Format")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("temporalBoundsContain")), (SubLObject)SubLObjectFactory.makeString("temporal Bounds Contain")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("agentTypeWorksAtLocationType")), (SubLObject)SubLObjectFactory.makeString("agent Type Works At Location Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("relationCategoryType")), (SubLObject)SubLObjectFactory.makeString("relation Category Type")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("mainSubjectClump")), (SubLObject)SubLObjectFactory.makeString("main Subject Clump")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("arg1Format")), (SubLObject)SubLObjectFactory.makeString("arg 1 Format")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("conceptuallyCoRelated")), (SubLObject)SubLObjectFactory.makeString("conceptually Co Related")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("genlFunctions")), (SubLObject)SubLObjectFactory.makeString("genl Functions")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("arg2Isa")), (SubLObject)SubLObjectFactory.makeString("arg 2 Isa")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("definitionalMtForTopicAssertions")), (SubLObject)SubLObjectFactory.makeString("definitional Mt For Topic Assertions")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("arg1Isa")), (SubLObject)SubLObjectFactory.makeString("arg 1 Isa")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("colorHasChroma")), (SubLObject)SubLObjectFactory.makeString("color Has Chroma")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("indigenousTo")), (SubLObject)SubLObjectFactory.makeString("indigenous To")) });
    }
    
    @Override
	public void declareFunctions() {
        declare_string_utilities_file();
    }
    
    @Override
	public void initializeVariables() {
        init_string_utilities_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_string_utilities_file();
    }
    
    static {
        me = (SubLFile)new string_utilities();
        string_utilities.$point_char$ = null;
        string_utilities.$space_char$ = null;
        string_utilities.$tab_char$ = null;
        string_utilities.$empty_string$ = null;
        string_utilities.$new_line_string$ = null;
        string_utilities.$test_char$ = null;
        string_utilities.$object_to_string_caching_state$ = null;
        string_utilities.$char_set$ = null;
        string_utilities.$64_bit_encoding_table$ = null;
        string_utilities.$64_bit_integer_index$ = null;
        string_utilities.$64_bit_char_index$ = null;
        string_utilities.$raw_whitespace_chars$ = null;
        string_utilities.$whitespace_chars$ = null;
        string_utilities.$grammatical_punctuation_chars$ = null;
        string_utilities.$target_characters$ = null;
        string_utilities.$trigraph_metric$ = null;
        string_utilities.$trigraph_tables$ = null;
        string_utilities.$cyclify_string_expand_subl_fn_strings$ = null;
        string_utilities.$cyclify_string_subl_quote_fn_strings$ = null;
        string_utilities.$cyclify_string_quote_chars$ = null;
        string_utilities.$dtp_cyclify_status$ = null;
        string_utilities.$string_read_buffer_size$ = null;
        string_utilities.$string_read_buffer$ = null;
        $str0$ = SubLObjectFactory.makeString("");
        $list1 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BREAK-CHAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("*SPACE-CHAR*")))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BREAK-CHAR"));
        $kw3$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw4$BREAK_CHAR = SubLObjectFactory.makeKeyword("BREAK-CHAR");
        $sym5$_SPACE_CHAR_ = SubLObjectFactory.makeSymbol("*SPACE-CHAR*");
        $sym6$WORD_LIST_VAR = SubLObjectFactory.makeUninternedSymbol("WORD-LIST-VAR");
        $sym7$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym8$_TEST_CHAR_ = SubLObjectFactory.makeSymbol("*TEST-CHAR*");
        $sym9$BREAK_WORDS = SubLObjectFactory.makeSymbol("BREAK-WORDS");
        $list10 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NOT-TEST-CHAR")));
        $sym11$CDOLIST = SubLObjectFactory.makeSymbol("CDOLIST");
        $sym12$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym13$OBJECT_TO_STRING = SubLObjectFactory.makeSymbol("OBJECT-TO-STRING");
        $sym14$_OBJECT_TO_STRING_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*OBJECT-TO-STRING-CACHING-STATE*");
        $int15$1000 = SubLObjectFactory.makeInteger(1000);
        $str16$_ = SubLObjectFactory.makeString(">");
        $str17$_ = SubLObjectFactory.makeString("(");
        $str18$_ = SubLObjectFactory.makeString(" ");
        $str19$___ = SubLObjectFactory.makeString("...");
        $str20$_ = SubLObjectFactory.makeString(")");
        $str21$_ = SubLObjectFactory.makeString("\"");
        $sym22$READABLE_P = SubLObjectFactory.makeSymbol("READABLE-P");
        $sym23$READ_FROM_STRING_IGNORING_ERRORS = SubLObjectFactory.makeSymbol("READ-FROM-STRING-IGNORING-ERRORS");
        $kw24$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str25$_X = SubLObjectFactory.makeString("~X");
        $sym26$FIXNUMP = SubLObjectFactory.makeSymbol("FIXNUMP");
        $str27$_S_is_too_short_to_remove__D_char = SubLObjectFactory.makeString("~S is too short to remove ~D characters.");
        $sym28$NON_EMPTY_STRING_ = SubLObjectFactory.makeSymbol("NON-EMPTY-STRING?");
        $str29$_S_must_be_a_single_word___cannot = SubLObjectFactory.makeString("~S must be a single word - cannot contain ~S");
        $sym30$NOT_TEST_CHAR = SubLObjectFactory.makeSymbol("NOT-TEST-CHAR");
        $int31$100 = SubLObjectFactory.makeInteger(100);
        $int32$256 = SubLObjectFactory.makeInteger(256);
        $sym33$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $sym34$CHARACTERP = SubLObjectFactory.makeSymbol("CHARACTERP");
        $str35$Some_element_of__A_is_not_charact = SubLObjectFactory.makeString("Some element of ~A is not characterp.");
        $sym36$HTML_ESCAPED_STRING_P = SubLObjectFactory.makeSymbol("HTML-ESCAPED-STRING-P");
        $kw37$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw38$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw39$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw40$KB = SubLObjectFactory.makeKeyword("KB");
        $kw41$TINY = SubLObjectFactory.makeKeyword("TINY");
        $kw42$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list43 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("foo &bar; bam")), (SubLObject)string_utilities.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("PB&#x2014;J")), (SubLObject)string_utilities.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("PB&J")), (SubLObject)string_utilities.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("PB&amp;J")), (SubLObject)string_utilities.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("PB&#151;J")), (SubLObject)string_utilities.T));
        $sym44$NON_NEGATIVE_INTEGER_P = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $sym45$_ = SubLObjectFactory.makeSymbol("<");
        $sym46$ENDS_WITH_START_OF = SubLObjectFactory.makeSymbol("ENDS-WITH-START-OF");
        $list47 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Author Harriet"), (SubLObject)SubLObjectFactory.makeString("Harriet Beecher Stowe"), (SubLObject)string_utilities.EQUALP), (SubLObject)SubLObjectFactory.makeString("Harriet")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Author Harriet Beecher Stowe"), (SubLObject)SubLObjectFactory.makeString("Harriet Beecher Stowe"), (SubLObject)string_utilities.EQUALP), (SubLObject)SubLObjectFactory.makeString("Harriet Beecher Stowe")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Author Harriet Beecher Stowes"), (SubLObject)SubLObjectFactory.makeString("Harriet Beecher Stowe"), (SubLObject)string_utilities.EQUALP), (SubLObject)string_utilities.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Author Harriet Beecher Sto"), (SubLObject)SubLObjectFactory.makeString("Harriet Beecher Stowe"), (SubLObject)string_utilities.EQUALP), (SubLObject)SubLObjectFactory.makeString("Harriet Beecher Sto")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Author Harriet Beecher Sto"), (SubLObject)SubLObjectFactory.makeString("riet Beecher Stowe"), (SubLObject)string_utilities.EQUALP, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString(" "))), (SubLObject)string_utilities.NIL));
        $str48$_ = SubLObjectFactory.makeString(",");
        $str49$__ = SubLObjectFactory.makeString(", ");
        $list50 = ConsesLow.list((SubLObject)Characters.CHAR_lparen, (SubLObject)Characters.CHAR_rparen);
        $list51 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("."), (SubLObject)SubLObjectFactory.makeString("?"), (SubLObject)SubLObjectFactory.makeString("!"));
        $list52 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NON-EMPTY-CYCL-STRING?"), (SubLObject)SubLObjectFactory.makeSymbol("NON-EMPTY-SUBL-STRING?//////"));
        $sym53$CHAR_IN_CHAR_SET = SubLObjectFactory.makeSymbol("CHAR-IN-CHAR-SET");
        $sym54$DIGIT_CHAR_P = SubLObjectFactory.makeSymbol("DIGIT-CHAR-P");
        $sym55$ALPHANUMERICP = SubLObjectFactory.makeSymbol("ALPHANUMERICP");
        $sym56$ALPHA_CHAR_P = SubLObjectFactory.makeSymbol("ALPHA-CHAR-P");
        $list57 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("-"));
        $list58 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString(","));
        $sym59$IS_NUMERIC_ = SubLObjectFactory.makeSymbol("IS-NUMERIC?");
        $sym60$PARSE_INTEGER = SubLObjectFactory.makeSymbol("PARSE-INTEGER");
        $str61$__R = SubLObjectFactory.makeString("~:R");
        $list62 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("st"), (SubLObject)SubLObjectFactory.makeString("nd"), (SubLObject)SubLObjectFactory.makeString("rd"), (SubLObject)SubLObjectFactory.makeString("th"));
        $sym63$CONTROL_CHAR_P = SubLObjectFactory.makeSymbol("CONTROL-CHAR-P");
        $int64$32 = SubLObjectFactory.makeInteger(32);
        $int65$128 = SubLObjectFactory.makeInteger(128);
        $list66 = ConsesLow.list((SubLObject)Characters.CHAR_space);
        $sym67$STRING = SubLObjectFactory.makeSymbol("STRING");
        $str68$_b = SubLObjectFactory.makeString("\\b");
        $list69 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CASELESS"));
        $str70$_S_is_not_a_part_of_the_reference = SubLObjectFactory.makeString("~S is not a part of the reference string: ~S");
        $str71$Failed_to_bunge__S_according_to__ = SubLObjectFactory.makeString("Failed to bunge ~S according to ~S.  Returning: ~S");
        $sym72$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $sym73$UNICODE_NAUT_P = SubLObjectFactory.makeSymbol("UNICODE-NAUT-P");
        $sym74$CCONCATENATE = SubLObjectFactory.makeSymbol("CCONCATENATE");
        $list75 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString(" "));
        $sym76$LOWER_CASE_P = SubLObjectFactory.makeSymbol("LOWER-CASE-P");
        $sym77$WHITESPACEP = SubLObjectFactory.makeSymbol("WHITESPACEP");
        $sym78$UPPER_CASE_P = SubLObjectFactory.makeSymbol("UPPER-CASE-P");
        $sym79$PUNCTUATION_P = SubLObjectFactory.makeSymbol("PUNCTUATION-P");
        $sym80$EAT_CHAR_P = SubLObjectFactory.makeSymbol("EAT-CHAR-P");
        $sym81$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $str82$0123456789ABCDEF = SubLObjectFactory.makeString("0123456789ABCDEF");
        $sym83$HEX_CHAR_P = SubLObjectFactory.makeSymbol("HEX-CHAR-P");
        $list84 = ConsesLow.list(new SubLObject[] { ConsesLow.cons((SubLObject)string_utilities.ZERO_INTEGER, (SubLObject)Characters.CHAR_A), ConsesLow.cons((SubLObject)string_utilities.ONE_INTEGER, (SubLObject)Characters.CHAR_B), ConsesLow.cons((SubLObject)string_utilities.TWO_INTEGER, (SubLObject)Characters.CHAR_C), ConsesLow.cons((SubLObject)string_utilities.THREE_INTEGER, (SubLObject)Characters.CHAR_D), ConsesLow.cons((SubLObject)string_utilities.FOUR_INTEGER, (SubLObject)Characters.CHAR_E), ConsesLow.cons((SubLObject)string_utilities.FIVE_INTEGER, (SubLObject)Characters.CHAR_F), ConsesLow.cons((SubLObject)string_utilities.SIX_INTEGER, (SubLObject)Characters.CHAR_G), ConsesLow.cons((SubLObject)string_utilities.SEVEN_INTEGER, (SubLObject)Characters.CHAR_H), ConsesLow.cons((SubLObject)string_utilities.EIGHT_INTEGER, (SubLObject)Characters.CHAR_I), ConsesLow.cons((SubLObject)string_utilities.NINE_INTEGER, (SubLObject)Characters.CHAR_J), ConsesLow.cons((SubLObject)string_utilities.TEN_INTEGER, (SubLObject)Characters.CHAR_K), ConsesLow.cons((SubLObject)string_utilities.ELEVEN_INTEGER, (SubLObject)Characters.CHAR_L), ConsesLow.cons((SubLObject)string_utilities.TWELVE_INTEGER, (SubLObject)Characters.CHAR_M), ConsesLow.cons((SubLObject)string_utilities.THIRTEEN_INTEGER, (SubLObject)Characters.CHAR_N), ConsesLow.cons((SubLObject)string_utilities.FOURTEEN_INTEGER, (SubLObject)Characters.CHAR_O), ConsesLow.cons((SubLObject)string_utilities.FIFTEEN_INTEGER, (SubLObject)Characters.CHAR_P), ConsesLow.cons((SubLObject)string_utilities.SIXTEEN_INTEGER, (SubLObject)Characters.CHAR_Q), ConsesLow.cons((SubLObject)string_utilities.SEVENTEEN_INTEGER, (SubLObject)Characters.CHAR_R), ConsesLow.cons((SubLObject)string_utilities.EIGHTEEN_INTEGER, (SubLObject)Characters.CHAR_S), ConsesLow.cons((SubLObject)string_utilities.NINETEEN_INTEGER, (SubLObject)Characters.CHAR_T), ConsesLow.cons((SubLObject)string_utilities.TWENTY_INTEGER, (SubLObject)Characters.CHAR_U), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(21), (SubLObject)Characters.CHAR_V), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(22), (SubLObject)Characters.CHAR_W), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(23), (SubLObject)Characters.CHAR_X), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(24), (SubLObject)Characters.CHAR_Y), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(25), (SubLObject)Characters.CHAR_Z), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(26), (SubLObject)Characters.CHAR_a), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(27), (SubLObject)Characters.CHAR_b), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(28), (SubLObject)Characters.CHAR_c), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(29), (SubLObject)Characters.CHAR_d), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(30), (SubLObject)Characters.CHAR_e), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(31), (SubLObject)Characters.CHAR_f), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(32), (SubLObject)Characters.CHAR_g), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(33), (SubLObject)Characters.CHAR_h), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(34), (SubLObject)Characters.CHAR_i), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(35), (SubLObject)Characters.CHAR_j), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(36), (SubLObject)Characters.CHAR_k), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(37), (SubLObject)Characters.CHAR_l), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(38), (SubLObject)Characters.CHAR_m), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(39), (SubLObject)Characters.CHAR_n), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(40), (SubLObject)Characters.CHAR_o), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(41), (SubLObject)Characters.CHAR_p), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(42), (SubLObject)Characters.CHAR_q), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(43), (SubLObject)Characters.CHAR_r), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(44), (SubLObject)Characters.CHAR_s), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(45), (SubLObject)Characters.CHAR_t), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(46), (SubLObject)Characters.CHAR_u), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(47), (SubLObject)Characters.CHAR_v), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(48), (SubLObject)Characters.CHAR_w), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(49), (SubLObject)Characters.CHAR_x), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(50), (SubLObject)Characters.CHAR_y), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(51), (SubLObject)Characters.CHAR_z), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(52), (SubLObject)Characters.CHAR_0), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(53), (SubLObject)Characters.CHAR_1), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(54), (SubLObject)Characters.CHAR_2), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(55), (SubLObject)Characters.CHAR_3), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(56), (SubLObject)Characters.CHAR_4), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(57), (SubLObject)Characters.CHAR_5), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(58), (SubLObject)Characters.CHAR_6), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(59), (SubLObject)Characters.CHAR_7), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(60), (SubLObject)Characters.CHAR_8), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(61), (SubLObject)Characters.CHAR_9), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(62), (SubLObject)Characters.CHAR_plus), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(63), (SubLObject)Characters.CHAR_slash), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(62), (SubLObject)Characters.CHAR_hyphen), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(63), (SubLObject)Characters.CHAR_underbar) });
        $str85$____________ = SubLObjectFactory.makeString(",.?!&'\";:()-");
        $str86$_____________ = SubLObjectFactory.makeString(",.?!&'\";:()-/");
        $sym87$PUNCTUATION_EXTENDED_P = SubLObjectFactory.makeSymbol("PUNCTUATION-EXTENDED-P");
        $list88 = ConsesLow.list((SubLObject)Characters.CHAR_space, (SubLObject)Characters.CHAR_tab, (SubLObject)Characters.CHAR_return, (SubLObject)Characters.CHAR_newline, (SubLObject)Characters.CHAR_newline);
        $sym89$CHAR_EQUAL = SubLObjectFactory.makeSymbol("CHAR-EQUAL");
        $list90 = ConsesLow.list(new SubLObject[] { Characters.CHAR_comma, Characters.CHAR_question, Characters.CHAR_exclamation, Characters.CHAR_ampersand, Characters.CHAR_backslash, Characters.CHAR_slash, Characters.CHAR_quotation, Characters.CHAR_semicolon, Characters.CHAR_colon, Characters.CHAR_lparen, Characters.CHAR_rparen, Characters.CHAR_plus });
        $sym91$UNICODE_SPACE_CHAR_CODE_P = SubLObjectFactory.makeSymbol("UNICODE-SPACE-CHAR-CODE-P");
        $int92$8192 = SubLObjectFactory.makeInteger(8192);
        $int93$8203 = SubLObjectFactory.makeInteger(8203);
        $kw94$EOF = SubLObjectFactory.makeKeyword("EOF");
        $int95$64 = SubLObjectFactory.makeInteger(64);
        $kw96$NORMAL = SubLObjectFactory.makeKeyword("NORMAL");
        $kw97$CR = SubLObjectFactory.makeKeyword("CR");
        $kw98$STRING = SubLObjectFactory.makeKeyword("STRING");
        $kw99$SLASH = SubLObjectFactory.makeKeyword("SLASH");
        $sym100$FBOUNDP = SubLObjectFactory.makeSymbol("FBOUNDP");
        $sym101$NON_EMPTY_STRING_P = SubLObjectFactory.makeSymbol("NON-EMPTY-STRING-P");
        $list102 = ConsesLow.list((SubLObject)Characters.CHAR_colon, (SubLObject)Characters.CHAR_slash);
        $sym103$VALID_CONSTANT_NAME_CHAR_P = SubLObjectFactory.makeSymbol("VALID-CONSTANT-NAME-CHAR-P");
        $sym104$1_ = SubLObjectFactory.makeSymbol("1+");
        $list105 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString(" and "), (SubLObject)SubLObjectFactory.makeString(" or "));
        $list106 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString(", "));
        $list107 = ConsesLow.list((SubLObject)Characters.CHAR_period, (SubLObject)Characters.CHAR_question, (SubLObject)Characters.CHAR_exclamation);
        $sym108$TARGET_CHARACTER_FOUND = SubLObjectFactory.makeSymbol("TARGET-CHARACTER-FOUND");
        $list109 = ConsesLow.list((SubLObject)Characters.CHAR_newline, (SubLObject)Characters.CHAR_return);
        $list110 = ConsesLow.list((SubLObject)Characters.CHAR_quotation, (SubLObject)Characters.CHAR_backslash, (SubLObject)Characters.CHAR_asterisk, (SubLObject)Characters.CHAR_question, (SubLObject)Characters.CHAR_lbracket, (SubLObject)Characters.CHAR_rbracket, (SubLObject)Characters.CHAR_quote);
        $kw111$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $sym112$CHAR_ = SubLObjectFactory.makeSymbol("CHAR=");
        $str113$Unmatched_open_parenthesis = SubLObjectFactory.makeString("Unmatched open parenthesis");
        $str114$Unmatched_close_parenthesis = SubLObjectFactory.makeString("Unmatched close parenthesis");
        $int115$255 = SubLObjectFactory.makeInteger(255);
        $list116 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("."));
        $float117$0_8 = (SubLFloat)SubLObjectFactory.makeDouble(0.8);
        $kw118$FREE = SubLObjectFactory.makeKeyword("FREE");
        $int119$50 = SubLObjectFactory.makeInteger(50);
        $str120$es = SubLObjectFactory.makeString("es");
        $str121$s = SubLObjectFactory.makeString("s");
        $int122$1000000 = SubLObjectFactory.makeInteger(1000000);
        $sym123$FORT_PRINT_NAME = SubLObjectFactory.makeSymbol("FORT-PRINT-NAME");
        $sym124$STR_BY_TYPE = SubLObjectFactory.makeSymbol("STR-BY-TYPE");
        $str125$__ = SubLObjectFactory.makeString("~%");
        $list126 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("#$ExpandSubLFn"), (SubLObject)SubLObjectFactory.makeString("ExpandSubLFn"));
        $list127 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("#$SubLQuoteFn"), (SubLObject)SubLObjectFactory.makeString("SubLQuoteFn"));
        $list128 = ConsesLow.list((SubLObject)Characters.CHAR_backslash);
        $sym129$CYCLIFY_STATUS = SubLObjectFactory.makeSymbol("CYCLIFY-STATUS");
        $sym130$CYCLIFY_STATUS_P = SubLObjectFactory.makeSymbol("CYCLIFY-STATUS-P");
        $list131 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("OUT-STRING-LIST"), SubLObjectFactory.makeSymbol("REFERENCES-ADDED"), SubLObjectFactory.makeSymbol("INSIDE-QUOTE?"), SubLObjectFactory.makeSymbol("INSIDE-EL-VAR-NAME?"), SubLObjectFactory.makeSymbol("ALREADY-CYCLIFIED?"), SubLObjectFactory.makeSymbol("ESCAPE?"), SubLObjectFactory.makeSymbol("INSIDE-SUBL-QUOTE-FN?"), SubLObjectFactory.makeSymbol("INSIDE-EXPAND-SUBL-FN?"), SubLObjectFactory.makeSymbol("INSIDE-EXPAND-SUBL-FN-ARG1?"), SubLObjectFactory.makeSymbol("INSIDE-EXPAND-SUBL-FN-ARG2?"), SubLObjectFactory.makeSymbol("IMMEDIATELY-FOLLOWING-PAREN?"), SubLObjectFactory.makeSymbol("PAREN-COUNT") });
        $list132 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("OUT-STRING-LIST"), SubLObjectFactory.makeKeyword("REFERENCES-ADDED"), SubLObjectFactory.makeKeyword("INSIDE-QUOTE?"), SubLObjectFactory.makeKeyword("INSIDE-EL-VAR-NAME?"), SubLObjectFactory.makeKeyword("ALREADY-CYCLIFIED?"), SubLObjectFactory.makeKeyword("ESCAPE?"), SubLObjectFactory.makeKeyword("INSIDE-SUBL-QUOTE-FN?"), SubLObjectFactory.makeKeyword("INSIDE-EXPAND-SUBL-FN?"), SubLObjectFactory.makeKeyword("INSIDE-EXPAND-SUBL-FN-ARG1?"), SubLObjectFactory.makeKeyword("INSIDE-EXPAND-SUBL-FN-ARG2?"), SubLObjectFactory.makeKeyword("IMMEDIATELY-FOLLOWING-PAREN?"), SubLObjectFactory.makeKeyword("PAREN-COUNT") });
        $list133 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("CYCLIFY-STATUS-OUT-STRING-LIST"), SubLObjectFactory.makeSymbol("CYCLIFY-STATUS-REFERENCES-ADDED"), SubLObjectFactory.makeSymbol("CYCLIFY-STATUS-INSIDE-QUOTE?"), SubLObjectFactory.makeSymbol("CYCLIFY-STATUS-INSIDE-EL-VAR-NAME?"), SubLObjectFactory.makeSymbol("CYCLIFY-STATUS-ALREADY-CYCLIFIED?"), SubLObjectFactory.makeSymbol("CYCLIFY-STATUS-ESCAPE?"), SubLObjectFactory.makeSymbol("CYCLIFY-STATUS-INSIDE-SUBL-QUOTE-FN?"), SubLObjectFactory.makeSymbol("CYCLIFY-STATUS-INSIDE-EXPAND-SUBL-FN?"), SubLObjectFactory.makeSymbol("CYCLIFY-STATUS-INSIDE-EXPAND-SUBL-FN-ARG1?"), SubLObjectFactory.makeSymbol("CYCLIFY-STATUS-INSIDE-EXPAND-SUBL-FN-ARG2?"), SubLObjectFactory.makeSymbol("CYCLIFY-STATUS-IMMEDIATELY-FOLLOWING-PAREN?"), SubLObjectFactory.makeSymbol("CYCLIFY-STATUS-PAREN-COUNT") });
        $list134 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("_CSETF-CYCLIFY-STATUS-OUT-STRING-LIST"), SubLObjectFactory.makeSymbol("_CSETF-CYCLIFY-STATUS-REFERENCES-ADDED"), SubLObjectFactory.makeSymbol("_CSETF-CYCLIFY-STATUS-INSIDE-QUOTE?"), SubLObjectFactory.makeSymbol("_CSETF-CYCLIFY-STATUS-INSIDE-EL-VAR-NAME?"), SubLObjectFactory.makeSymbol("_CSETF-CYCLIFY-STATUS-ALREADY-CYCLIFIED?"), SubLObjectFactory.makeSymbol("_CSETF-CYCLIFY-STATUS-ESCAPE?"), SubLObjectFactory.makeSymbol("_CSETF-CYCLIFY-STATUS-INSIDE-SUBL-QUOTE-FN?"), SubLObjectFactory.makeSymbol("_CSETF-CYCLIFY-STATUS-INSIDE-EXPAND-SUBL-FN?"), SubLObjectFactory.makeSymbol("_CSETF-CYCLIFY-STATUS-INSIDE-EXPAND-SUBL-FN-ARG1?"), SubLObjectFactory.makeSymbol("_CSETF-CYCLIFY-STATUS-INSIDE-EXPAND-SUBL-FN-ARG2?"), SubLObjectFactory.makeSymbol("_CSETF-CYCLIFY-STATUS-IMMEDIATELY-FOLLOWING-PAREN?"), SubLObjectFactory.makeSymbol("_CSETF-CYCLIFY-STATUS-PAREN-COUNT") });
        $sym135$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym136$CYCLIFY_STATUS_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("CYCLIFY-STATUS-PRINT-FUNCTION-TRAMPOLINE");
        $list137 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFY-STATUS-P"));
        $sym138$CYCLIFY_STATUS_OUT_STRING_LIST = SubLObjectFactory.makeSymbol("CYCLIFY-STATUS-OUT-STRING-LIST");
        $sym139$_CSETF_CYCLIFY_STATUS_OUT_STRING_LIST = SubLObjectFactory.makeSymbol("_CSETF-CYCLIFY-STATUS-OUT-STRING-LIST");
        $sym140$CYCLIFY_STATUS_REFERENCES_ADDED = SubLObjectFactory.makeSymbol("CYCLIFY-STATUS-REFERENCES-ADDED");
        $sym141$_CSETF_CYCLIFY_STATUS_REFERENCES_ADDED = SubLObjectFactory.makeSymbol("_CSETF-CYCLIFY-STATUS-REFERENCES-ADDED");
        $sym142$CYCLIFY_STATUS_INSIDE_QUOTE_ = SubLObjectFactory.makeSymbol("CYCLIFY-STATUS-INSIDE-QUOTE?");
        $sym143$_CSETF_CYCLIFY_STATUS_INSIDE_QUOTE_ = SubLObjectFactory.makeSymbol("_CSETF-CYCLIFY-STATUS-INSIDE-QUOTE?");
        $sym144$CYCLIFY_STATUS_INSIDE_EL_VAR_NAME_ = SubLObjectFactory.makeSymbol("CYCLIFY-STATUS-INSIDE-EL-VAR-NAME?");
        $sym145$_CSETF_CYCLIFY_STATUS_INSIDE_EL_VAR_NAME_ = SubLObjectFactory.makeSymbol("_CSETF-CYCLIFY-STATUS-INSIDE-EL-VAR-NAME?");
        $sym146$CYCLIFY_STATUS_ALREADY_CYCLIFIED_ = SubLObjectFactory.makeSymbol("CYCLIFY-STATUS-ALREADY-CYCLIFIED?");
        $sym147$_CSETF_CYCLIFY_STATUS_ALREADY_CYCLIFIED_ = SubLObjectFactory.makeSymbol("_CSETF-CYCLIFY-STATUS-ALREADY-CYCLIFIED?");
        $sym148$CYCLIFY_STATUS_ESCAPE_ = SubLObjectFactory.makeSymbol("CYCLIFY-STATUS-ESCAPE?");
        $sym149$_CSETF_CYCLIFY_STATUS_ESCAPE_ = SubLObjectFactory.makeSymbol("_CSETF-CYCLIFY-STATUS-ESCAPE?");
        $sym150$CYCLIFY_STATUS_INSIDE_SUBL_QUOTE_FN_ = SubLObjectFactory.makeSymbol("CYCLIFY-STATUS-INSIDE-SUBL-QUOTE-FN?");
        $sym151$_CSETF_CYCLIFY_STATUS_INSIDE_SUBL_QUOTE_FN_ = SubLObjectFactory.makeSymbol("_CSETF-CYCLIFY-STATUS-INSIDE-SUBL-QUOTE-FN?");
        $sym152$CYCLIFY_STATUS_INSIDE_EXPAND_SUBL_FN_ = SubLObjectFactory.makeSymbol("CYCLIFY-STATUS-INSIDE-EXPAND-SUBL-FN?");
        $sym153$_CSETF_CYCLIFY_STATUS_INSIDE_EXPAND_SUBL_FN_ = SubLObjectFactory.makeSymbol("_CSETF-CYCLIFY-STATUS-INSIDE-EXPAND-SUBL-FN?");
        $sym154$CYCLIFY_STATUS_INSIDE_EXPAND_SUBL_FN_ARG1_ = SubLObjectFactory.makeSymbol("CYCLIFY-STATUS-INSIDE-EXPAND-SUBL-FN-ARG1?");
        $sym155$_CSETF_CYCLIFY_STATUS_INSIDE_EXPAND_SUBL_FN_ARG1_ = SubLObjectFactory.makeSymbol("_CSETF-CYCLIFY-STATUS-INSIDE-EXPAND-SUBL-FN-ARG1?");
        $sym156$CYCLIFY_STATUS_INSIDE_EXPAND_SUBL_FN_ARG2_ = SubLObjectFactory.makeSymbol("CYCLIFY-STATUS-INSIDE-EXPAND-SUBL-FN-ARG2?");
        $sym157$_CSETF_CYCLIFY_STATUS_INSIDE_EXPAND_SUBL_FN_ARG2_ = SubLObjectFactory.makeSymbol("_CSETF-CYCLIFY-STATUS-INSIDE-EXPAND-SUBL-FN-ARG2?");
        $sym158$CYCLIFY_STATUS_IMMEDIATELY_FOLLOWING_PAREN_ = SubLObjectFactory.makeSymbol("CYCLIFY-STATUS-IMMEDIATELY-FOLLOWING-PAREN?");
        $sym159$_CSETF_CYCLIFY_STATUS_IMMEDIATELY_FOLLOWING_PAREN_ = SubLObjectFactory.makeSymbol("_CSETF-CYCLIFY-STATUS-IMMEDIATELY-FOLLOWING-PAREN?");
        $sym160$CYCLIFY_STATUS_PAREN_COUNT = SubLObjectFactory.makeSymbol("CYCLIFY-STATUS-PAREN-COUNT");
        $sym161$_CSETF_CYCLIFY_STATUS_PAREN_COUNT = SubLObjectFactory.makeSymbol("_CSETF-CYCLIFY-STATUS-PAREN-COUNT");
        $kw162$OUT_STRING_LIST = SubLObjectFactory.makeKeyword("OUT-STRING-LIST");
        $kw163$REFERENCES_ADDED = SubLObjectFactory.makeKeyword("REFERENCES-ADDED");
        $kw164$INSIDE_QUOTE_ = SubLObjectFactory.makeKeyword("INSIDE-QUOTE?");
        $kw165$INSIDE_EL_VAR_NAME_ = SubLObjectFactory.makeKeyword("INSIDE-EL-VAR-NAME?");
        $kw166$ALREADY_CYCLIFIED_ = SubLObjectFactory.makeKeyword("ALREADY-CYCLIFIED?");
        $kw167$ESCAPE_ = SubLObjectFactory.makeKeyword("ESCAPE?");
        $kw168$INSIDE_SUBL_QUOTE_FN_ = SubLObjectFactory.makeKeyword("INSIDE-SUBL-QUOTE-FN?");
        $kw169$INSIDE_EXPAND_SUBL_FN_ = SubLObjectFactory.makeKeyword("INSIDE-EXPAND-SUBL-FN?");
        $kw170$INSIDE_EXPAND_SUBL_FN_ARG1_ = SubLObjectFactory.makeKeyword("INSIDE-EXPAND-SUBL-FN-ARG1?");
        $kw171$INSIDE_EXPAND_SUBL_FN_ARG2_ = SubLObjectFactory.makeKeyword("INSIDE-EXPAND-SUBL-FN-ARG2?");
        $kw172$IMMEDIATELY_FOLLOWING_PAREN_ = SubLObjectFactory.makeKeyword("IMMEDIATELY-FOLLOWING-PAREN?");
        $kw173$PAREN_COUNT = SubLObjectFactory.makeKeyword("PAREN-COUNT");
        $str174$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw175$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym176$MAKE_CYCLIFY_STATUS = SubLObjectFactory.makeSymbol("MAKE-CYCLIFY-STATUS");
        $kw177$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw178$END = SubLObjectFactory.makeKeyword("END");
        $sym179$VISIT_DEFSTRUCT_OBJECT_CYCLIFY_STATUS_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-CYCLIFY-STATUS-METHOD");
        $sym180$CYCLIFY_STRING = SubLObjectFactory.makeSymbol("CYCLIFY-STRING");
        $str181$__ = SubLObjectFactory.makeString("_-");
        $int182$1024 = SubLObjectFactory.makeInteger(1024);
        $str183$quit_reading_file = SubLObjectFactory.makeString("quit reading file");
        $str184$string_read_larger_than_buffer_si = SubLObjectFactory.makeString("string read larger than buffer size of ~S");
        $float185$0_5 = (SubLFloat)SubLObjectFactory.makeDouble(0.5);
        $str186$_a = SubLObjectFactory.makeString("~a");
        $kw187$BEFORE = SubLObjectFactory.makeKeyword("BEFORE");
        $kw188$WORD = SubLObjectFactory.makeKeyword("WORD");
        $kw189$KEEP_BLANK = SubLObjectFactory.makeKeyword("KEEP-BLANK");
        $kw190$SKIP_BLANKS = SubLObjectFactory.makeKeyword("SKIP-BLANKS");
        $str191$Unknown_State__S__Flaw_in_state_m = SubLObjectFactory.makeString("Unknown State ~S: Flaw in state machine design.");
        $kw192$SPACE = SubLObjectFactory.makeKeyword("SPACE");
        $str193$Unknown_state__S__Design_flaw_in_ = SubLObjectFactory.makeString("Unknown state ~S: Design flaw in state machine.");
        $sym194$PRIN1 = SubLObjectFactory.makeSymbol("PRIN1");
        $sym195$FUNCTION_SYMBOL_P = SubLObjectFactory.makeSymbol("FUNCTION-SYMBOL-P");
        $kw196$INPUT = SubLObjectFactory.makeKeyword("INPUT");
        $str197$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $str198$Could_not_open_an_input_stream_fo = SubLObjectFactory.makeString("Could not open an input stream for ~S.");
        $kw199$OUTPUT = SubLObjectFactory.makeKeyword("OUTPUT");
        $str200$__Cannot_open_input_stream_for__A = SubLObjectFactory.makeString("~%Cannot open input stream for ~A");
        $str201$_ = SubLObjectFactory.makeString("_");
        $int202$97 = SubLObjectFactory.makeInteger(97);
        $int203$26 = SubLObjectFactory.makeInteger(26);
        $sym204$ALPHANUMERIC_OR_HYPHEN_P = SubLObjectFactory.makeSymbol("ALPHANUMERIC-OR-HYPHEN-P");
        $str205$_a_is_not_a_number_between_0_and_ = SubLObjectFactory.makeString("~a is not a number between 0 and 25");
        $sym206$NON_ALPHANUMERIC_P = SubLObjectFactory.makeSymbol("NON-ALPHANUMERIC-P");
        $sym207$KEYWORD_IMPOSTOR_P = SubLObjectFactory.makeSymbol("KEYWORD-IMPOSTOR-P");
        $sym208$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $str209$__a = SubLObjectFactory.makeString(",~a");
        $kw210$FULL = SubLObjectFactory.makeKeyword("FULL");
        $list211 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("")), (SubLObject)SubLObjectFactory.makeString("")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Dog")), (SubLObject)SubLObjectFactory.makeString("#$Dog")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("\"Dog\"")), (SubLObject)SubLObjectFactory.makeString("\"Dog\"")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("\\\"Dog\\\"")), (SubLObject)SubLObjectFactory.makeString("\\\"#$Dog\\\"")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("(comment Dog \"A ... Dog ... Muffet\")")), (SubLObject)SubLObjectFactory.makeString("(#$comment #$Dog \"A ... Dog ... Muffet\")")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("(isa Muffet Dog)")), (SubLObject)SubLObjectFactory.makeString("(#$isa #$Muffet #$Dog)")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("(isa ?Muffet Dog)")), (SubLObject)SubLObjectFactory.makeString("(#$isa ?Muffet #$Dog)")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Thing")), (SubLObject)SubLObjectFactory.makeString("#$Thing")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("\"Thing\"")), (SubLObject)SubLObjectFactory.makeString("\"Thing\"")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Xyzzy")), (SubLObject)SubLObjectFactory.makeString("Xyzzy")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("SubLQuoteFn Thing")), (SubLObject)SubLObjectFactory.makeString("#$SubLQuoteFn #$Thing")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("ExpandSubLFn () Thing")), (SubLObject)SubLObjectFactory.makeString("#$ExpandSubLFn () #$Thing")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("'Dog")), (SubLObject)SubLObjectFactory.makeString("'#$Dog")) });
        $sym212$SUBWORD_ = SubLObjectFactory.makeSymbol("SUBWORD?");
        $list213 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("emus"), (SubLObject)SubLObjectFactory.makeString("Emus are nice"), (SubLObject)string_utilities.NIL, (SubLObject)string_utilities.EQUALP), (SubLObject)string_utilities.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("emus"), (SubLObject)SubLObjectFactory.makeString("Emus are nice"), (SubLObject)string_utilities.NIL, (SubLObject)string_utilities.EQUAL), (SubLObject)string_utilities.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("emus"), (SubLObject)SubLObjectFactory.makeString("")), (SubLObject)string_utilities.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("emus"), (SubLObject)SubLObjectFactory.makeString("e"), (SubLObject)ConsesLow.list((SubLObject)Characters.CHAR_period)), (SubLObject)string_utilities.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("emus"), (SubLObject)SubLObjectFactory.makeString(".emus."), (SubLObject)ConsesLow.list((SubLObject)Characters.CHAR_period)), (SubLObject)string_utilities.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("..emus."), (SubLObject)SubLObjectFactory.makeString("emus"), (SubLObject)ConsesLow.list((SubLObject)Characters.CHAR_period)), (SubLObject)string_utilities.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("emus"), (SubLObject)SubLObjectFactory.makeString("I like emus."), (SubLObject)ConsesLow.list((SubLObject)Characters.CHAR_period), (SubLObject)string_utilities.EQUALP), (SubLObject)string_utilities.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString(".."), (SubLObject)SubLObjectFactory.makeString("Emus are nice"), (SubLObject)ConsesLow.list((SubLObject)Characters.CHAR_period), (SubLObject)string_utilities.EQUAL), (SubLObject)string_utilities.NIL));
        $sym214$STRING_DOWNCASE_EXCEPT_ACRONYMS = SubLObjectFactory.makeSymbol("STRING-DOWNCASE-EXCEPT-ACRONYMS");
        $list215 = _constant_215_initializer();
        $sym216$SPACE_DONT_UNCAPITALIZE = SubLObjectFactory.makeSymbol("SPACE-DONT-UNCAPITALIZE");
        $list217 = _constant_217_initializer();
        $sym218$QUOTED_STRING_ = SubLObjectFactory.makeSymbol("QUOTED-STRING?");
        $list219 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("")), (SubLObject)string_utilities.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("string")), (SubLObject)string_utilities.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("'string")), (SubLObject)string_utilities.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("'string'")), (SubLObject)string_utilities.T));
        $sym220$CONCATENATE_ADJACENT_STRINGS = SubLObjectFactory.makeSymbol("CONCATENATE-ADJACENT-STRINGS");
        $list221 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)string_utilities.ONE_INTEGER, (SubLObject)string_utilities.TWO_INTEGER, (SubLObject)string_utilities.THREE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)string_utilities.ONE_INTEGER, (SubLObject)string_utilities.TWO_INTEGER, (SubLObject)string_utilities.THREE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)string_utilities.ONE_INTEGER, (SubLObject)string_utilities.TWO_INTEGER, (SubLObject)string_utilities.THREE_INTEGER, (SubLObject)SubLObjectFactory.makeString("a"), (SubLObject)SubLObjectFactory.makeString("b"), (SubLObject)SubLObjectFactory.makeString("C"))), (SubLObject)ConsesLow.list((SubLObject)string_utilities.ONE_INTEGER, (SubLObject)string_utilities.TWO_INTEGER, (SubLObject)string_utilities.THREE_INTEGER, (SubLObject)SubLObjectFactory.makeString("abC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("e"), string_utilities.ONE_INTEGER, string_utilities.TWO_INTEGER, string_utilities.THREE_INTEGER, SubLObjectFactory.makeString("a"), SubLObjectFactory.makeString("b"), SubLObjectFactory.makeString("C"), string_utilities.FOUR_INTEGER, string_utilities.FIVE_INTEGER, string_utilities.SIX_INTEGER, SubLObjectFactory.makeString("c") })), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("e"), string_utilities.ONE_INTEGER, string_utilities.TWO_INTEGER, string_utilities.THREE_INTEGER, SubLObjectFactory.makeString("abC"), string_utilities.FOUR_INTEGER, string_utilities.FIVE_INTEGER, string_utilities.SIX_INTEGER, SubLObjectFactory.makeString("c") })), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("e"), SubLObjectFactory.makeString("f"), string_utilities.ONE_INTEGER, string_utilities.TWO_INTEGER, string_utilities.THREE_INTEGER, SubLObjectFactory.makeString("a"), SubLObjectFactory.makeString("b"), SubLObjectFactory.makeString("C"), string_utilities.FOUR_INTEGER, string_utilities.FIVE_INTEGER, string_utilities.SIX_INTEGER, SubLObjectFactory.makeString("c"), SubLObjectFactory.makeString("e") })), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("ef"), string_utilities.ONE_INTEGER, string_utilities.TWO_INTEGER, string_utilities.THREE_INTEGER, SubLObjectFactory.makeString("abC"), string_utilities.FOUR_INTEGER, string_utilities.FIVE_INTEGER, string_utilities.SIX_INTEGER, SubLObjectFactory.makeString("ce") })));
        $sym222$FORMAT_NIL_TEST = SubLObjectFactory.makeSymbol("FORMAT-NIL-TEST");
        $list223 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("~7,1F"), (SubLObject)SubLObjectFactory.makeDouble(1.999)), (SubLObject)SubLObjectFactory.makeString("    2.0")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("~2,1F"), (SubLObject)SubLObjectFactory.makeDouble(1.999)), (SubLObject)SubLObjectFactory.makeString("2.0")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("~4,1F"), (SubLObject)SubLObjectFactory.makeDouble(1.999)), (SubLObject)SubLObjectFactory.makeString(" 2.0")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("~4,F"), (SubLObject)SubLObjectFactory.makeDouble(1.999)), (SubLObject)SubLObjectFactory.makeString(" 2.0")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("~4,F"), (SubLObject)SubLObjectFactory.makeDouble(1.199)), (SubLObject)SubLObjectFactory.makeString(" 1.2")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("~2,1F"), (SubLObject)SubLObjectFactory.makeDouble(19.999)), (SubLObject)SubLObjectFactory.makeString("20.0")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("~2,1F"), (SubLObject)SubLObjectFactory.makeDouble(99.999)), (SubLObject)SubLObjectFactory.makeString("100.0")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("~1,1F"), (SubLObject)SubLObjectFactory.makeDouble(99.999)), (SubLObject)SubLObjectFactory.makeString("100.0")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("~2,F"), (SubLObject)SubLObjectFactory.makeDouble(99.999)), (SubLObject)SubLObjectFactory.makeString("100.")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("~2,F"), (SubLObject)SubLObjectFactory.makeDouble(100.0)), (SubLObject)SubLObjectFactory.makeString("100.")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("~2,F"), (SubLObject)SubLObjectFactory.makeDouble(100.5)), (SubLObject)SubLObjectFactory.makeString("101.")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("~2,0F"), (SubLObject)SubLObjectFactory.makeDouble(100.5111)), (SubLObject)SubLObjectFactory.makeString("101.")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("~2,1F"), (SubLObject)SubLObjectFactory.makeDouble(100.5111)), (SubLObject)SubLObjectFactory.makeString("100.5")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("~1,3F"), (SubLObject)SubLObjectFactory.makeDouble(99.999)), (SubLObject)SubLObjectFactory.makeString("99.999")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("~7,3F"), (SubLObject)SubLObjectFactory.makeDouble(99.9)), (SubLObject)SubLObjectFactory.makeString(" 99.900")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("~7,7F"), (SubLObject)SubLObjectFactory.makeDouble(1.01)), (SubLObject)SubLObjectFactory.makeString("1.0100000")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("~7,8F"), (SubLObject)SubLObjectFactory.makeDouble(99.999)), (SubLObject)SubLObjectFactory.makeString("99.99900000")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("~4,2F"), (SubLObject)SubLObjectFactory.makeDouble(6.375)), (SubLObject)SubLObjectFactory.makeString("6.38")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("~2,F"), (SubLObject)SubLObjectFactory.makeDouble(5.2292)), (SubLObject)SubLObjectFactory.makeString("5.")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("~1,F"), (SubLObject)SubLObjectFactory.makeDouble(5.2292)), (SubLObject)SubLObjectFactory.makeString("5.")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("~,F"), (SubLObject)SubLObjectFactory.makeDouble(5.2292)), (SubLObject)SubLObjectFactory.makeString("5.2292")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("~4,F"), (SubLObject)SubLObjectFactory.makeDouble(33.0)), (SubLObject)SubLObjectFactory.makeString("33.0")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("~4,F"), (SubLObject)SubLObjectFactory.makeDouble(11.330999)), (SubLObject)SubLObjectFactory.makeString("11.3")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("~4,F"), (SubLObject)SubLObjectFactory.makeDouble(0.330999)), (SubLObject)SubLObjectFactory.makeString(".331")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("~4,F"), (SubLObject)SubLObjectFactory.makeDouble(1.0999)), (SubLObject)SubLObjectFactory.makeString(" 1.1")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("~5F"), (SubLObject)SubLObjectFactory.makeDouble(9.9999)), (SubLObject)SubLObjectFactory.makeString(" 10.0")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("~5,3F"), (SubLObject)SubLObjectFactory.makeDouble(9.9999)), (SubLObject)SubLObjectFactory.makeString("10.000")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("~,4F"), (SubLObject)SubLObjectFactory.makeDouble(9.99999)), (SubLObject)SubLObjectFactory.makeString("10.0000")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("~,4F"), (SubLObject)SubLObjectFactory.makeDouble(9.99995)), (SubLObject)SubLObjectFactory.makeString("10.0000")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("~,4F"), (SubLObject)SubLObjectFactory.makeDouble(9.99994)), (SubLObject)SubLObjectFactory.makeString("9.9999")) });
        $sym224$HEX_INT_FROM_STRING = SubLObjectFactory.makeSymbol("HEX-INT-FROM-STRING");
        $list225 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("0x410bf")), (SubLObject)SubLObjectFactory.makeInteger(266431)));
    }
    
    public static final class $not_digit_char_p$UnaryFunction extends UnaryFunction
    {
        public $not_digit_char_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("NOT-DIGIT-CHAR-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return string_utilities.not_digit_char_p(arg1);
        }
    }
    
    public static final class $string_wXo_control_charsP$UnaryFunction extends UnaryFunction
    {
        public $string_wXo_control_charsP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("STRING-W/O-CONTROL-CHARS?"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return string_utilities.string_wXo_control_charsP(arg1);
        }
    }
    
    public static final class $char_in_char_set$UnaryFunction extends UnaryFunction
    {
        public $char_in_char_set$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CHAR-IN-CHAR-SET"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return string_utilities.char_in_char_set(arg1);
        }
    }
    
    public static final class $whitespacep$UnaryFunction extends UnaryFunction
    {
        public $whitespacep$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("WHITESPACEP"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return string_utilities.whitespacep(arg1);
        }
    }
    
    public static final class $cyclify_status_native extends SubLStructNative
    {
        public SubLObject $out_string_list;
        public SubLObject $references_added;
        public SubLObject $inside_quoteP;
        public SubLObject $inside_el_var_nameP;
        public SubLObject $already_cyclifiedP;
        public SubLObject $escapeP;
        public SubLObject $inside_subl_quote_fnP;
        public SubLObject $inside_expand_subl_fnP;
        public SubLObject $inside_expand_subl_fn_arg1P;
        public SubLObject $inside_expand_subl_fn_arg2P;
        public SubLObject $immediately_following_parenP;
        public SubLObject $paren_count;
        private static final SubLStructDeclNative structDecl;
        
        public $cyclify_status_native() {
            this.$out_string_list = (SubLObject)CommonSymbols.NIL;
            this.$references_added = (SubLObject)CommonSymbols.NIL;
            this.$inside_quoteP = (SubLObject)CommonSymbols.NIL;
            this.$inside_el_var_nameP = (SubLObject)CommonSymbols.NIL;
            this.$already_cyclifiedP = (SubLObject)CommonSymbols.NIL;
            this.$escapeP = (SubLObject)CommonSymbols.NIL;
            this.$inside_subl_quote_fnP = (SubLObject)CommonSymbols.NIL;
            this.$inside_expand_subl_fnP = (SubLObject)CommonSymbols.NIL;
            this.$inside_expand_subl_fn_arg1P = (SubLObject)CommonSymbols.NIL;
            this.$inside_expand_subl_fn_arg2P = (SubLObject)CommonSymbols.NIL;
            this.$immediately_following_parenP = (SubLObject)CommonSymbols.NIL;
            this.$paren_count = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$cyclify_status_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$out_string_list;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$references_added;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$inside_quoteP;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$inside_el_var_nameP;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$already_cyclifiedP;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$escapeP;
        }
        
        @Override
		public SubLObject getField8() {
            return this.$inside_subl_quote_fnP;
        }
        
        @Override
		public SubLObject getField9() {
            return this.$inside_expand_subl_fnP;
        }
        
        @Override
		public SubLObject getField10() {
            return this.$inside_expand_subl_fn_arg1P;
        }
        
        @Override
		public SubLObject getField11() {
            return this.$inside_expand_subl_fn_arg2P;
        }
        
        @Override
		public SubLObject getField12() {
            return this.$immediately_following_parenP;
        }
        
        @Override
		public SubLObject getField13() {
            return this.$paren_count;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$out_string_list = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$references_added = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$inside_quoteP = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$inside_el_var_nameP = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$already_cyclifiedP = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$escapeP = value;
        }
        
        @Override
		public SubLObject setField8(final SubLObject value) {
            return this.$inside_subl_quote_fnP = value;
        }
        
        @Override
		public SubLObject setField9(final SubLObject value) {
            return this.$inside_expand_subl_fnP = value;
        }
        
        @Override
		public SubLObject setField10(final SubLObject value) {
            return this.$inside_expand_subl_fn_arg1P = value;
        }
        
        @Override
		public SubLObject setField11(final SubLObject value) {
            return this.$inside_expand_subl_fn_arg2P = value;
        }
        
        @Override
		public SubLObject setField12(final SubLObject value) {
            return this.$immediately_following_parenP = value;
        }
        
        @Override
		public SubLObject setField13(final SubLObject value) {
            return this.$paren_count = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$cyclify_status_native.class, string_utilities.$sym129$CYCLIFY_STATUS, string_utilities.$sym130$CYCLIFY_STATUS_P, string_utilities.$list131, string_utilities.$list132, new String[] { "$out_string_list", "$references_added", "$inside_quoteP", "$inside_el_var_nameP", "$already_cyclifiedP", "$escapeP", "$inside_subl_quote_fnP", "$inside_expand_subl_fnP", "$inside_expand_subl_fn_arg1P", "$inside_expand_subl_fn_arg2P", "$immediately_following_parenP", "$paren_count" }, string_utilities.$list133, string_utilities.$list134, string_utilities.$sym135$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $cyclify_status_p$UnaryFunction extends UnaryFunction
    {
        public $cyclify_status_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CYCLIFY-STATUS-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return string_utilities.cyclify_status_p(arg1);
        }
    }
}

/*

	Total time: 2805 ms
	
*/