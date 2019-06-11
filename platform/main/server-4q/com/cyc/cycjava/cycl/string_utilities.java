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
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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

public final class string_utilities
    extends
      SubLTranslatedFile
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
  public static SubLObject not_test_char(final SubLObject obj)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return list_utilities.not_eql( obj, $test_char$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 830L)
  public static SubLObject do_words(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject word = NIL;
    SubLObject string = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1 );
    word = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1 );
    string = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list1 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list1 );
      if( NIL == conses_high.member( current_$1, $list2, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw3$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list1 );
    }
    final SubLObject break_char_tail = cdestructuring_bind.property_list_member( $kw4$BREAK_CHAR, current );
    final SubLObject break_char = ( NIL != break_char_tail ) ? conses_high.cadr( break_char_tail ) : $sym5$_SPACE_CHAR_;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject word_list_var = $sym6$WORD_LIST_VAR;
    return ConsesLow.list( $sym7$CLET, ConsesLow.list( ConsesLow.list( $sym8$_TEST_CHAR_, break_char ), ConsesLow.list( word_list_var, ConsesLow.listS( $sym9$BREAK_WORDS, string, $list10 ) ) ), ConsesLow.listS(
        $sym11$CDOLIST, ConsesLow.list( word, word_list_var ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 1280L)
  public static SubLObject empty_string_p(final SubLObject v_object)
  {
    return Equality.equal( $empty_string$.getGlobalValue(), v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 1403L)
  public static SubLObject empty_stringP(final SubLObject string)
  {
    return empty_string_p( string );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 1564L)
  public static SubLObject non_empty_string_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isString() && NIL == empty_string_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 1678L)
  public static SubLObject every_in_string(final SubLObject predicate, final SubLObject string, SubLObject key)
  {
    if( key == UNPROVIDED )
    {
      key = Symbols.symbol_function( IDENTITY );
    }
    SubLObject ans = NIL;
    if( key.eql( Symbols.symbol_function( IDENTITY ) ) || key == IDENTITY )
    {
      final SubLObject end_var = Sequences.length( string );
      if( NIL == ans )
      {
        SubLObject end_var_$2;
        SubLObject char_num;
        SubLObject v_char;
        for( end_var_$2 = end_var, char_num = NIL, char_num = ZERO_INTEGER; NIL == ans && !char_num.numGE( end_var_$2 ); ans = makeBoolean( NIL == Functions.funcall( predicate, v_char ) ), char_num = number_utilities
            .f_1X( char_num ) )
        {
          v_char = Strings.sublisp_char( string, char_num );
        }
      }
    }
    else
    {
      final SubLObject end_var = Sequences.length( string );
      if( NIL == ans )
      {
        SubLObject char_num;
        SubLObject v_char;
        SubLObject end_var_$3;
        for( end_var_$3 = end_var, char_num = NIL, char_num = ZERO_INTEGER; NIL == ans && !char_num.numGE( end_var_$3 ); ans = makeBoolean( NIL == Functions.funcall( predicate, Functions.funcall( key,
            v_char ) ) ), char_num = number_utilities.f_1X( char_num ) )
        {
          v_char = Strings.sublisp_char( string, char_num );
        }
      }
    }
    return makeBoolean( NIL == ans );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 2110L)
  public static SubLObject any_in_string(final SubLObject predicate, final SubLObject string, SubLObject key)
  {
    if( key == UNPROVIDED )
    {
      key = Symbols.symbol_function( IDENTITY );
    }
    SubLObject ans = NIL;
    if( key.eql( Symbols.symbol_function( IDENTITY ) ) || key == IDENTITY )
    {
      final SubLObject end_var = Sequences.length( string );
      if( NIL == ans )
      {
        SubLObject end_var_$4;
        SubLObject char_num;
        SubLObject v_char;
        for( end_var_$4 = end_var, char_num = NIL, char_num = ZERO_INTEGER; NIL == ans && !char_num.numGE( end_var_$4 ); ans = Functions.funcall( predicate, v_char ), char_num = number_utilities.f_1X( char_num ) )
        {
          v_char = Strings.sublisp_char( string, char_num );
        }
      }
    }
    else
    {
      final SubLObject end_var = Sequences.length( string );
      if( NIL == ans )
      {
        SubLObject char_num;
        SubLObject v_char;
        SubLObject end_var_$5;
        for( end_var_$5 = end_var, char_num = NIL, char_num = ZERO_INTEGER; NIL == ans && !char_num.numGE( end_var_$5 ); ans = Functions.funcall( predicate, Functions.funcall( key, v_char ) ), char_num = number_utilities
            .f_1X( char_num ) )
        {
          v_char = Strings.sublisp_char( string, char_num );
        }
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 2520L)
  public static SubLObject list_of_string_p(final SubLObject v_object)
  {
    return list_utilities.list_of_type_p( Symbols.symbol_function( $sym12$STRINGP ), v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 2649L)
  public static SubLObject clear_object_to_string()
  {
    final SubLObject cs = $object_to_string_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 2649L)
  public static SubLObject remove_object_to_string(final SubLObject v_object)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $object_to_string_caching_state$.getGlobalValue(), ConsesLow.list( v_object ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 2649L)
  public static SubLObject object_to_string_internal(final SubLObject v_object)
  {
    return print_high.princ_to_string( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 2649L)
  public static SubLObject object_to_string(final SubLObject v_object)
  {
    SubLObject caching_state = $object_to_string_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym13$OBJECT_TO_STRING, $sym14$_OBJECT_TO_STRING_CACHING_STATE_, $int15$1000, EQL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, v_object, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( object_to_string_internal( v_object ) ) );
      memoization_state.caching_state_put( caching_state, v_object, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 2748L)
  public static SubLObject fort_to_string(final SubLObject fort)
  {
    if( NIL != constant_handles.constant_p( fort ) )
    {
      return object_to_string( fort );
    }
    if( NIL != nart_handles.nart_p( fort ) )
    {
      return object_to_string( narts_high.nart_el_formula( fort ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 3056L)
  public static SubLObject function_to_string(final SubLObject function)
  {
    if( function.isSymbol() )
    {
      return Symbols.symbol_name( function );
    }
    if( function.isFunction() )
    {
      return post_remove( string_upto( substring( print_high.princ_to_string( function ), ELEVEN_INTEGER, UNPROVIDED ), UNPROVIDED ), $str16$_, UNPROVIDED );
    }
    return print_high.princ_to_string( function );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 3458L)
  public static SubLObject to_string(final SubLObject value)
  {
    return print_high.princ_to_string( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 3812L)
  public static SubLObject non_nil_to_string(final SubLObject value)
  {
    if( NIL != value )
    {
      return to_string( value );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 4323L)
  public static SubLObject to_lisp_string(final SubLObject value)
  {
    return unquote_string( print_high.prin1_to_string( value ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 4678L)
  public static SubLObject to_string_of_length(final SubLObject v_object, final SubLObject length)
  {
    final SubLObject string = to_string( v_object );
    final SubLObject string_length = Sequences.length( string );
    return string_length.numGE( length ) ? string_first_n( length, string ) : Sequences.cconcatenate( string, Strings.make_string( Numbers.subtract( length, string_length ), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 5186L)
  public static SubLObject first_n_list_items_to_string(final SubLObject list, final SubLObject n)
  {
    SubLObject result = NIL;
    final SubLObject last_index = number_utilities.f_1_( Sequences.length( list ) );
    SubLObject stream = NIL;
    try
    {
      stream = streams_high.make_private_string_output_stream();
      streams_high.write_string( $str17$_, stream, UNPROVIDED, UNPROVIDED );
      SubLObject cdotimes_end_var;
      SubLObject index;
      for( cdotimes_end_var = number_utilities.minimum( ConsesLow.list( n, Sequences.length( list ) ), UNPROVIDED ), index = NIL, index = ZERO_INTEGER; index.numL( cdotimes_end_var ); index = Numbers.add( index,
          ONE_INTEGER ) )
      {
        streams_high.write_string( to_string( Sequences.elt( list, index ) ), stream, UNPROVIDED, UNPROVIDED );
        if( !index.eql( last_index ) )
        {
          streams_high.write_string( $str18$_, stream, UNPROVIDED, UNPROVIDED );
        }
      }
      if( n.numL( Sequences.length( list ) ) )
      {
        streams_high.write_string( $str19$___, stream, UNPROVIDED, UNPROVIDED );
      }
      streams_high.write_string( $str20$_, stream, UNPROVIDED, UNPROVIDED );
      result = streams_high.get_output_stream_string( stream );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        streams_high.close( stream, UNPROVIDED );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 5876L)
  public static SubLObject char_at(final SubLObject string, final SubLObject index)
  {
    if( index.numGE( ZERO_INTEGER ) && index.numL( Sequences.length( string ) ) )
    {
      return Strings.sublisp_char( string, index );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 6211L)
  public static SubLObject quote_string(final SubLObject string, SubLObject quote_string)
  {
    if( quote_string == UNPROVIDED )
    {
      quote_string = $str21$_;
    }
    return pre_fix( post_fix( string, quote_string ), quote_string );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 6531L)
  public static SubLObject unquote_string(final SubLObject string)
  {
    SubLObject result = string;
    if( NIL != quoted_stringP( string ) )
    {
      result = substring( result, ONE_INTEGER, number_utilities.f_1_( Sequences.length( string ) ) );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 6909L)
  public static SubLObject quoted_stringP(final SubLObject string)
  {
    assert NIL != Types.stringp( string ) : string;
    if( NIL != list_utilities.lengthLE( string, ONE_INTEGER, UNPROVIDED ) )
    {
      return NIL;
    }
    final SubLObject lead_char = first_char( string );
    final SubLObject quotedP = makeBoolean( ( lead_char.eql( Characters.CHAR_quote ) || lead_char.eql( Characters.CHAR_quotation ) ) && lead_char.eql( last_char( string ) ) );
    return quotedP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 7235L)
  public static SubLObject str(final SubLObject v_object)
  {
    return format_nil.format_nil_a( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 7329L)
  public static SubLObject printed_forms_equalP(final SubLObject form1, final SubLObject form2, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQUAL );
    }
    return Functions.funcall( test, transform_list_utilities.quiescent_transform( form1, Symbols.symbol_function( $sym22$READABLE_P ), Symbols.symbol_function( $sym23$READ_FROM_STRING_IGNORING_ERRORS ), Symbols
        .symbol_function( $sym13$OBJECT_TO_STRING ), UNPROVIDED ), transform_list_utilities.quiescent_transform( form2, Symbols.symbol_function( $sym22$READABLE_P ), Symbols.symbol_function(
            $sym23$READ_FROM_STRING_IGNORING_ERRORS ), Symbols.symbol_function( $sym13$OBJECT_TO_STRING ), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 7616L)
  public static SubLObject readable_p(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject string = object_to_string( v_object );
    thread.resetMultipleValues();
    final SubLObject read_as = reader.read_from_string_ignoring_errors( string, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject status = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return makeBoolean( !status.eql( $kw24$ERROR ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 7882L)
  public static SubLObject string_to_number(final SubLObject string)
  {
    final SubLObject result = reader.read_from_string_ignoring_errors( string, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return result.isNumber() ? result : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 8053L)
  public static SubLObject string_to_integer(final SubLObject string)
  {
    final SubLObject result = reader.read_from_string_ignoring_errors( string, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return result.isInteger() ? result : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 8227L)
  public static SubLObject integer_string_p(final SubLObject string)
  {
    return string_to_integer( string );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 8448L)
  public static SubLObject integer_stringL(final SubLObject integer_string1, final SubLObject integer_string2)
  {
    final SubLObject integer1 = string_to_integer( integer_string1 );
    final SubLObject integer2 = string_to_integer( integer_string2 );
    if( NIL == integer2 )
    {
      return T;
    }
    if( NIL == integer1 )
    {
      return NIL;
    }
    return Numbers.numL( integer1, integer2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 8754L)
  public static SubLObject to_hex_string(final SubLObject integer)
  {
    return PrintLow.format( NIL, $str25$_X, integer );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 8829L)
  public static SubLObject hex_int_from_string(final SubLObject string)
  {
    final SubLObject end = Sequences.length( string );
    return reader.parse_integer( string, TWO_INTEGER, end, SIXTEEN_INTEGER, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 8950L)
  public static SubLObject string_length_L(final SubLObject string1, final SubLObject string2)
  {
    return Numbers.numL( Sequences.length( string1 ), Sequences.length( string2 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 9198L)
  public static SubLObject indent(final SubLObject stream, final SubLObject n)
  {
    SubLObject i;
    for( i = NIL, i = ZERO_INTEGER; i.numL( n ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      streams_high.write_char( Characters.CHAR_space, stream );
    }
    return stream;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 9313L)
  public static SubLObject aref_from_end(final SubLObject vector, SubLObject index)
  {
    assert NIL != Types.fixnump( index ) : index;
    index = Numbers.subtract( Sequences.length( vector ), index, ONE_INTEGER );
    return Vectors.aref( vector, index );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 9540L)
  public static SubLObject char_from_end(final SubLObject string, final SubLObject index)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( string ) : string;
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == list_utilities.lengthGE( string, index, UNPROVIDED ) )
    {
      Errors.error( $str27$_S_is_too_short_to_remove__D_char, string, index );
    }
    return aref_from_end( string, index );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 9822L)
  public static SubLObject first_char(final SubLObject string)
  {
    return Strings.sublisp_char( string, ZERO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 9933L)
  public static SubLObject first_of_string(final SubLObject string)
  {
    return string_first_n( ONE_INTEGER, string );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 10074L)
  public static SubLObject rest_of_string(final SubLObject string)
  {
    assert NIL != non_empty_stringP( string ) : string;
    return strip_first( string );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 10321L)
  public static SubLObject last_char(final SubLObject string)
  {
    return char_from_end( string, ZERO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 10383L)
  public static SubLObject pre_add_character_to_string(final SubLObject v_char, final SubLObject string)
  {
    return Sequences.replace( Strings.make_string( number_utilities.f_1X( Sequences.length( string ) ), v_char ), string, ONE_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 10625L)
  public static SubLObject post_add_character_to_string(final SubLObject v_char, final SubLObject string)
  {
    return Sequences.replace( Strings.make_string( number_utilities.f_1X( Sequences.length( string ) ), v_char ), string, ZERO_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 10862L)
  public static SubLObject pre_and_post_add_character_to_string(final SubLObject v_char, final SubLObject string)
  {
    return Sequences.replace( Strings.make_string( Numbers.add( TWO_INTEGER, Sequences.length( string ) ), v_char ), string, ONE_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 11122L)
  public static SubLObject copy_string(final SubLObject string)
  {
    assert NIL != Types.stringp( string ) : string;
    return Sequences.copy_seq( string );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 11211L)
  public static SubLObject string_substitute(final SubLObject v_new, final SubLObject old, final SubLObject string, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQUAL );
    }
    assert NIL != Types.stringp( v_new ) : v_new;
    assert NIL != Types.stringp( old ) : old;
    assert NIL != Types.stringp( string ) : string;
    if( NIL == Sequences.search( old, string, test, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return string;
    }
    final SubLObject old_length = Sequences.length( old );
    if( ZERO_INTEGER.numE( old_length ) && NIL == Functions.funcall( test, old, $str0$ ) )
    {
      return string;
    }
    SubLObject result = NIL;
    SubLObject stream = NIL;
    try
    {
      stream = streams_high.make_private_string_output_stream();
      final SubLObject string_length = Sequences.length( string );
      if( ZERO_INTEGER.numE( old_length ) )
      {
        SubLObject search_start;
        SubLObject old_position;
        for( search_start = NIL, search_start = ZERO_INTEGER; search_start.numL( string_length ); search_start = Numbers.add( search_start, ONE_INTEGER ) )
        {
          old_position = Numbers.add( ONE_INTEGER, search_start );
          streams_high.write_string( v_new, stream, UNPROVIDED, UNPROVIDED );
          streams_high.write_string( string, stream, search_start, old_position );
        }
        streams_high.write_string( v_new, stream, UNPROVIDED, UNPROVIDED );
      }
      else
      {
        SubLObject search_start;
        SubLObject old_position;
        for( search_start = NIL, old_position = NIL, search_start = ZERO_INTEGER, old_position = Sequences.search( old, string, test, Symbols.symbol_function( IDENTITY ), ZERO_INTEGER, old_length, search_start,
            string_length ); NIL != old_position; old_position = Sequences.search( old, string, test, Symbols.symbol_function( IDENTITY ), ZERO_INTEGER, old_length, search_start, string_length ) )
        {
          streams_high.write_string( string, stream, search_start, old_position );
          streams_high.write_string( v_new, stream, UNPROVIDED, UNPROVIDED );
          search_start = Numbers.add( old_position, old_length );
        }
        streams_high.write_string( string, stream, search_start, UNPROVIDED );
      }
      result = streams_high.get_output_stream_string( stream );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        streams_high.close( stream, UNPROVIDED );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 13408L)
  public static SubLObject string_substitute_word(final SubLObject v_new, final SubLObject word, final SubLObject string, SubLObject test, SubLObject word_boundary)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQUAL );
    }
    if( word_boundary == UNPROVIDED )
    {
      word_boundary = $space_char$.getGlobalValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( v_new ) : v_new;
    assert NIL != Types.stringp( word ) : word;
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL != Sequences.find( word_boundary, word, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      Errors.error( $str29$_S_must_be_a_single_word___cannot, word, word_boundary );
    }
    assert NIL != Types.stringp( string ) : string;
    SubLObject result = NIL;
    SubLObject stream = NIL;
    try
    {
      stream = streams_high.make_private_string_output_stream();
      final SubLObject _prev_bind_0 = $test_char$.currentBinding( thread );
      try
      {
        $test_char$.bind( word_boundary, thread );
        SubLObject cdolist_list_var;
        final SubLObject word_list_var = cdolist_list_var = break_words( string, $sym30$NOT_TEST_CHAR, UNPROVIDED );
        SubLObject this_word = NIL;
        this_word = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL != Functions.funcall( test, this_word, word ) )
          {
            streams_high.write_string( v_new, stream, UNPROVIDED, UNPROVIDED );
          }
          else
          {
            streams_high.write_string( this_word, stream, UNPROVIDED, UNPROVIDED );
          }
          streams_high.write_char( word_boundary, stream );
          cdolist_list_var = cdolist_list_var.rest();
          this_word = cdolist_list_var.first();
        }
      }
      finally
      {
        $test_char$.rebind( _prev_bind_0, thread );
      }
      result = streams_high.get_output_stream_string( stream );
    }
    finally
    {
      final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        streams_high.close( stream, UNPROVIDED );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
      }
    }
    return string_butlast( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 14306L)
  public static SubLObject do_string_substitutions(final SubLObject string, final SubLObject subst_list, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    if( Sequences.length( string ).numE( ZERO_INTEGER ) )
    {
      return string;
    }
    SubLObject result = Strings.make_string( Numbers.max( $int31$100, Numbers.multiply( FOUR_INTEGER, Sequences.length( string ) ) ), UNPROVIDED );
    SubLObject result_end = ZERO_INTEGER;
    SubLObject index;
    SubLObject start = index = ZERO_INTEGER;
    SubLObject something_copiedP = NIL;
    for( SubLObject done = NIL; NIL == done; done = Numbers.numGE( index, Sequences.length( string ) ) )
    {
      SubLObject found = NIL;
      SubLObject position = NIL;
      if( NIL == found )
      {
        SubLObject csome_list_var = subst_list;
        SubLObject sub = NIL;
        sub = csome_list_var.first();
        while ( NIL == found && NIL != csome_list_var)
        {
          position = Sequences.search( sub.first(), string, test, Symbols.symbol_function( IDENTITY ), ZERO_INTEGER, NIL, index, NIL );
          if( NIL != position )
          {
            found = sub;
          }
          csome_list_var = csome_list_var.rest();
          sub = csome_list_var.first();
        }
      }
      if( NIL != found )
      {
        something_copiedP = T;
        result = Sequences.replace( result, string, result_end, NIL, start, position );
        result_end = Numbers.add( result_end, Numbers.subtract( position, start ) );
        result = Sequences.replace( result, found.rest(), result_end, NIL, ZERO_INTEGER, Sequences.length( found.rest() ) );
        result_end = Numbers.add( result_end, Sequences.length( found.rest() ) );
        start = ( index = Numbers.add( position, Sequences.length( found.first() ) ) );
      }
      else
      {
        index = Numbers.add( index, ONE_INTEGER );
      }
    }
    if( NIL != something_copiedP )
    {
      Sequences.replace( result, string, result_end, NIL, start, index );
      result_end = Numbers.add( result_end, Numbers.subtract( index, start ) );
      result = Sequences.subseq( result, ZERO_INTEGER, result_end );
    }
    else
    {
      result = string;
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 15596L)
  public static SubLObject do_string_substitutions_robust(final SubLObject string, final SubLObject subst_list, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    if( Sequences.length( string ).numE( ZERO_INTEGER ) )
    {
      return string;
    }
    SubLObject result = Strings.make_string( Numbers.max( $int32$256, Numbers.multiply( FOUR_INTEGER, Sequences.length( string ) ) ), UNPROVIDED );
    SubLObject result_end = ZERO_INTEGER;
    SubLObject index;
    SubLObject start = index = ZERO_INTEGER;
    SubLObject something_copiedP = NIL;
    for( SubLObject done = NIL; NIL == done; done = Numbers.numGE( index, Sequences.length( string ) ) )
    {
      SubLObject min = Sequences.length( string );
      SubLObject found = NIL;
      SubLObject position = NIL;
      SubLObject cdolist_list_var = subst_list;
      SubLObject sub = NIL;
      sub = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        position = Sequences.search( sub.first(), string, test, Symbols.symbol_function( IDENTITY ), ZERO_INTEGER, NIL, index, NIL );
        if( NIL != position && position.numL( min ) )
        {
          min = position;
          found = sub;
        }
        cdolist_list_var = cdolist_list_var.rest();
        sub = cdolist_list_var.first();
      }
      if( NIL != found )
      {
        something_copiedP = T;
        result = Sequences.replace( result, string, result_end, NIL, start, min );
        result_end = Numbers.add( result_end, Numbers.subtract( min, start ) );
        result = Sequences.replace( result, found.rest(), result_end, NIL, ZERO_INTEGER, Sequences.length( found.rest() ) );
        result_end = Numbers.add( result_end, Sequences.length( found.rest() ) );
        start = ( index = Numbers.add( min, Sequences.length( found.first() ) ) );
      }
      else
      {
        index = Numbers.add( index, ONE_INTEGER );
      }
    }
    if( NIL != something_copiedP )
    {
      Sequences.replace( result, string, result_end, NIL, start, index );
      result_end = Numbers.add( result_end, Numbers.subtract( index, start ) );
      result = Sequences.subseq( result, ZERO_INTEGER, result_end );
    }
    else
    {
      result = string;
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 17053L)
  public static SubLObject insert_escape_for_chars_in_string(final SubLObject chars, final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.listp( chars ) : chars;
    assert NIL != Types.stringp( string ) : string;
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == list_utilities.every_in_list( Symbols.symbol_function( $sym34$CHARACTERP ), chars, UNPROVIDED ) )
    {
      Errors.error( $str35$Some_element_of__A_is_not_charact, chars );
    }
    if( NIL == chars )
    {
      return string;
    }
    if( string.equal( $str0$ ) )
    {
      return string;
    }
    SubLObject increase = ZERO_INTEGER;
    SubLObject end_var_$6;
    SubLObject end_var;
    SubLObject char_num;
    SubLObject string_char;
    for( end_var = ( end_var_$6 = Sequences.length( string ) ), char_num = NIL, char_num = ZERO_INTEGER; !char_num.numGE( end_var_$6 ); char_num = number_utilities.f_1X( char_num ) )
    {
      string_char = Strings.sublisp_char( string, char_num );
      if( NIL != subl_promotions.memberP( string_char, chars, UNPROVIDED, UNPROVIDED ) )
      {
        increase = Numbers.add( increase, ONE_INTEGER );
      }
    }
    if( increase.numE( ZERO_INTEGER ) )
    {
      return string;
    }
    final SubLObject new_string = Strings.make_string( Numbers.add( Sequences.length( string ), increase ), UNPROVIDED );
    SubLObject index = ZERO_INTEGER;
    SubLObject drift = ZERO_INTEGER;
    SubLObject end_var_$7;
    SubLObject end_var2;
    SubLObject char_num2;
    SubLObject string_char2;
    for( end_var2 = ( end_var_$7 = Sequences.length( string ) ), char_num2 = NIL, char_num2 = ZERO_INTEGER; !char_num2.numGE( end_var_$7 ); char_num2 = number_utilities.f_1X( char_num2 ) )
    {
      string_char2 = Strings.sublisp_char( string, char_num2 );
      if( NIL != subl_promotions.memberP( string_char2, chars, UNPROVIDED, UNPROVIDED ) )
      {
        Strings.set_char( new_string, Numbers.add( index, drift ), Characters.CHAR_backslash );
        drift = Numbers.add( drift, ONE_INTEGER );
      }
      Strings.set_char( new_string, Numbers.add( index, drift ), Sequences.elt( string, index ) );
      index = Numbers.add( index, ONE_INTEGER );
    }
    return new_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 18111L)
  public static SubLObject html_escaped_string_p(final SubLObject string)
  {
    SubLObject inside_escapeP = NIL;
    SubLObject numericP = misc_utilities.uninitialized();
    SubLObject hexP = misc_utilities.uninitialized();
    SubLObject found_escapeP = NIL;
    final SubLObject end_var = Sequences.length( string );
    if( NIL == found_escapeP )
    {
      SubLObject end_var_$8;
      SubLObject char_num;
      SubLObject v_char;
      for( end_var_$8 = end_var, char_num = NIL, char_num = ZERO_INTEGER; NIL == found_escapeP && !char_num.numGE( end_var_$8 ); char_num = number_utilities.f_1X( char_num ) )
      {
        v_char = Strings.sublisp_char( string, char_num );
        if( v_char.eql( Characters.CHAR_ampersand ) )
        {
          inside_escapeP = T;
          numericP = misc_utilities.uninitialized();
          hexP = misc_utilities.uninitialized();
        }
        else if( NIL != inside_escapeP )
        {
          if( v_char.eql( Characters.CHAR_semicolon ) )
          {
            found_escapeP = T;
          }
          else if( NIL != Characters.digit_char_p( v_char, UNPROVIDED ) )
          {
            if( NIL != misc_utilities.uninitialized_p( numericP ) )
            {
              numericP = NIL;
            }
            else if( NIL != misc_utilities.uninitialized_p( hexP ) )
            {
              hexP = NIL;
            }
          }
          else if( v_char.eql( Characters.CHAR_x ) && NIL != misc_utilities.initialized_p( numericP ) && NIL != numericP && NIL != misc_utilities.uninitialized_p( hexP ) )
          {
            hexP = T;
          }
          else if( NIL != Characters.alpha_char_p( v_char ) )
          {
            if( NIL != misc_utilities.uninitialized_p( numericP ) )
            {
              numericP = NIL;
            }
            else if( NIL != numericP && ( NIL.eql( hexP ) || NIL == hex_char_p( v_char ) ) )
            {
              inside_escapeP = NIL;
              numericP = misc_utilities.uninitialized();
              hexP = misc_utilities.uninitialized();
            }
          }
          else if( Characters.CHAR_hash.eql( v_char ) && NIL != misc_utilities.uninitialized_p( numericP ) )
          {
            numericP = T;
          }
          else
          {
            inside_escapeP = NIL;
            numericP = misc_utilities.uninitialized();
            hexP = misc_utilities.uninitialized();
          }
        }
      }
    }
    return found_escapeP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 19548L)
  public static SubLObject remove_last_char(final SubLObject string, SubLObject n)
  {
    if( n == UNPROVIDED )
    {
      n = ONE_INTEGER;
    }
    return substring( string, ZERO_INTEGER, Numbers.subtract( Sequences.length( string ), n ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 19717L)
  public static SubLObject remove_substring(final SubLObject string, final SubLObject substring)
  {
    if( NIL != substringP( substring, string, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return do_string_substitutions_robust( string, ConsesLow.list( ConsesLow.cons( substring, $empty_string$.getGlobalValue() ) ), UNPROVIDED );
    }
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 19913L)
  public static SubLObject replace_substring(final SubLObject string, final SubLObject substring, final SubLObject v_new)
  {
    if( NIL != substringP( substring, string, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return do_string_substitutions_robust( string, ConsesLow.list( ConsesLow.cons( substring, v_new ) ), UNPROVIDED );
    }
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 20247L)
  public static SubLObject replace_substring_once(final SubLObject string, final SubLObject substring, final SubLObject v_new, SubLObject start)
  {
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    final SubLObject pos = Sequences.search( substring, string, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ), ZERO_INTEGER, NIL, start, UNPROVIDED );
    if( NIL != pos )
    {
      final SubLObject new_string = Sequences.cconcatenate( substring( string, ZERO_INTEGER, pos ), new SubLObject[] { v_new, substring( string, Numbers.add( pos, Sequences.length( substring ) ), UNPROVIDED )
      } );
      return new_string;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 20714L)
  public static SubLObject nreplace_substring_at(final SubLObject string, final SubLObject start, final SubLObject length, final SubLObject v_new)
  {
    assert NIL != Types.stringp( string ) : string;
    assert NIL != subl_promotions.non_negative_integer_p( start ) : start;
    assert NIL != subl_promotions.non_negative_integer_p( length ) : length;
    assert NIL != Types.stringp( v_new ) : v_new;
    if( NIL != list_utilities.lengthE( v_new, length, UNPROVIDED ) )
    {
      SubLObject end_var_$9;
      SubLObject end_var;
      SubLObject char_num;
      SubLObject v_char;
      for( end_var = ( end_var_$9 = Sequences.length( v_new ) ), char_num = NIL, char_num = ZERO_INTEGER; !char_num.numGE( end_var_$9 ); char_num = number_utilities.f_1X( char_num ) )
      {
        v_char = Strings.sublisp_char( v_new, char_num );
        Strings.set_char( string, Numbers.add( start, char_num ), v_char );
      }
      return string;
    }
    return Sequences.cconcatenate( substring( string, ZERO_INTEGER, start ), new SubLObject[] { v_new, substring( string, Numbers.add( start, length ), UNPROVIDED )
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 21318L)
  public static SubLObject infix(final SubLObject str1, final SubLObject str2, final SubLObject place)
  {
    if( Sequences.length( str2 ).numG( place ) )
    {
      return Sequences.cconcatenate( substring( str2, ZERO_INTEGER, Numbers.add( place, ONE_INTEGER ) ), new SubLObject[] { str1, substring( str2, Numbers.add( place, ONE_INTEGER ), Sequences.length( str2 ) )
      } );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 21499L)
  public static SubLObject post_fix(final SubLObject w, final SubLObject p)
  {
    return Sequences.cconcatenate( w, p );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 21551L)
  public static SubLObject pre_fix(final SubLObject w, final SubLObject p)
  {
    return Sequences.cconcatenate( p, w );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 21602L)
  public static SubLObject post_remove(final SubLObject w, final SubLObject p, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQUAL );
    }
    final SubLObject lp = Sequences.length( p );
    final SubLObject lw = Sequences.length( w );
    return ( NIL != ends_with( w, p, test ) ) ? substring( w, ZERO_INTEGER, Numbers.subtract( lw, lp ) ) : w;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 21885L)
  public static SubLObject pre_remove(final SubLObject w, final SubLObject p, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQUAL );
    }
    return ( NIL != starts_with_by_test( w, p, test ) ) ? substring( w, Sequences.length( p ), UNPROVIDED ) : w;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 22130L)
  public static SubLObject substring(final SubLObject string, final SubLObject start, SubLObject end)
  {
    if( end == UNPROVIDED )
    {
      end = NIL;
    }
    assert NIL != Types.stringp( string ) : string;
    return Sequences.subseq( string, start, end );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 22243L)
  public static SubLObject string_first_n(final SubLObject n, final SubLObject string)
  {
    final SubLObject end = Numbers.min( n, Sequences.length( string ) );
    return substring( string, ZERO_INTEGER, end );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 22511L)
  public static SubLObject string_last_n(final SubLObject n, final SubLObject string)
  {
    final SubLObject len = Sequences.length( string );
    final SubLObject start = Numbers.subtract( len, Numbers.min( n, len ) );
    return substring( string, start, len );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 22801L)
  public static SubLObject string_butlast(final SubLObject string)
  {
    return strip_final( string, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 22913L)
  public static SubLObject ends_with(final SubLObject w, final SubLObject ending, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQUAL );
    }
    return makeBoolean( NIL != list_utilities.greater_or_same_length_p( w, ending ) && NIL != substring_matchP( w, ending, Numbers.subtract( Sequences.length( w ), Sequences.length( ending ) ), test ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 23126L)
  public static SubLObject ends_with_one_of(final SubLObject string, final SubLObject ending_strings)
  {
    SubLObject v_boolean = NIL;
    SubLObject matching_string = NIL;
    if( NIL == v_boolean )
    {
      SubLObject csome_list_var = ending_strings;
      SubLObject s = NIL;
      s = csome_list_var.first();
      while ( NIL == v_boolean && NIL != csome_list_var)
      {
        v_boolean = ends_with( string, s, UNPROVIDED );
        if( NIL != v_boolean )
        {
          matching_string = s;
        }
        csome_list_var = csome_list_var.rest();
        s = csome_list_var.first();
      }
    }
    return Values.values( v_boolean, matching_string );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 23576L)
  public static SubLObject ends_with_punctuation_p(final SubLObject stryng)
  {
    final SubLObject string_length = Sequences.length( stryng );
    final SubLObject end_char = Strings.sublisp_char( stryng, Numbers.subtract( string_length, ONE_INTEGER ) );
    return punctuation_p( end_char );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 23751L)
  public static SubLObject ends_with_number_p(final SubLObject str)
  {
    return Characters.digit_char_p( last_char( str ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 23832L)
  public static SubLObject ends_with_number(final SubLObject str)
  {
    SubLObject last_num_index = NIL;
    SubLObject done = NIL;
    final SubLObject string_var = Sequences.reverse( str );
    final SubLObject end_var = Sequences.length( string_var );
    if( NIL == done )
    {
      SubLObject end_var_$10;
      SubLObject char_num;
      SubLObject v_char;
      for( end_var_$10 = end_var, char_num = NIL, char_num = ZERO_INTEGER; NIL == done && !char_num.numGE( end_var_$10 ); char_num = number_utilities.f_1X( char_num ) )
      {
        v_char = Strings.sublisp_char( string_var, char_num );
        if( NIL != Characters.digit_char_p( v_char, UNPROVIDED ) )
        {
          last_num_index = char_num;
        }
        else
        {
          done = T;
        }
      }
    }
    if( NIL == last_num_index )
    {
      return NIL;
    }
    final SubLObject number_string = Sequences.subseq( str, Numbers.subtract( Sequences.length( str ), ONE_INTEGER, last_num_index ), UNPROVIDED );
    final SubLObject number = reader.read_from_string( number_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return number;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 24280L)
  public static SubLObject starts_with(final SubLObject w, final SubLObject starting)
  {
    return makeBoolean( NIL != list_utilities.greater_or_same_length_p( w, starting ) && NIL != substring_matchP( w, starting, ZERO_INTEGER, Symbols.symbol_function( EQUAL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 24505L)
  public static SubLObject starts_with_one_of(final SubLObject string, final SubLObject starting_strings)
  {
    SubLObject v_boolean = NIL;
    if( NIL == v_boolean )
    {
      SubLObject csome_list_var;
      SubLObject s;
      for( csome_list_var = starting_strings, s = NIL, s = csome_list_var.first(); NIL == v_boolean && NIL != csome_list_var; v_boolean = starts_with( string, s ), csome_list_var = csome_list_var
          .rest(), s = csome_list_var.first() )
      {
      }
    }
    return v_boolean;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 24683L)
  public static SubLObject starts_with_by_test(final SubLObject string, final SubLObject starting, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQUALP );
    }
    return makeBoolean( NIL != list_utilities.greater_or_same_length_p( string, starting ) && NIL != substring_matchP( string, starting, ZERO_INTEGER, test ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 24928L)
  public static SubLObject starts_with_one_of_by_test(final SubLObject string, final SubLObject starting_strings, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQUALP );
    }
    SubLObject v_boolean = NIL;
    if( NIL == v_boolean )
    {
      SubLObject csome_list_var;
      SubLObject x;
      for( csome_list_var = starting_strings, x = NIL, x = csome_list_var.first(); NIL == v_boolean && NIL != csome_list_var; v_boolean = starts_with_by_test( string, x, test ), csome_list_var = csome_list_var
          .rest(), x = csome_list_var.first() )
      {
      }
    }
    return v_boolean;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 25153L)
  public static SubLObject starting_string(final SubLObject string, final SubLObject starting_string, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQUALP );
    }
    return ( NIL != starts_with_by_test( string, starting_string, test ) ) ? starting_string : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 25424L)
  public static SubLObject ends_with_start_of(final SubLObject string1, final SubLObject string2, SubLObject test, SubLObject split_strings)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQUALP );
    }
    if( split_strings == UNPROVIDED )
    {
      split_strings = NIL;
    }
    SubLObject search_starting_points = ConsesLow.list( ZERO_INTEGER );
    if( NIL != split_strings )
    {
      SubLObject cdolist_list_var = split_strings;
      SubLObject split_string = NIL;
      split_string = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject this_split_string_length = Sequences.length( split_string );
        SubLObject cdolist_list_var_$11 = search_all( split_string, string1, test, UNPROVIDED );
        SubLObject search_result = NIL;
        search_result = cdolist_list_var_$11.first();
        while ( NIL != cdolist_list_var_$11)
        {
          search_starting_points = ConsesLow.cons( Numbers.add( search_result, this_split_string_length ), search_starting_points );
          cdolist_list_var_$11 = cdolist_list_var_$11.rest();
          search_result = cdolist_list_var_$11.first();
        }
        cdolist_list_var = cdolist_list_var.rest();
        split_string = cdolist_list_var.first();
      }
      search_starting_points = Sort.sort( search_starting_points, $sym45$_, UNPROVIDED );
    }
    else
    {
      search_starting_points = list_utilities.num_list( Sequences.length( string2 ), UNPROVIDED );
    }
    SubLObject cdolist_list_var = search_starting_points;
    SubLObject position = NIL;
    position = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject end_string = substring( string1, position, UNPROVIDED );
      if( NIL != starting_string( string2, end_string, test ) )
      {
        return end_string;
      }
      cdolist_list_var = cdolist_list_var.rest();
      position = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 26985L)
  public static SubLObject number_of_commas(final SubLObject string)
  {
    SubLObject result = ZERO_INTEGER;
    SubLObject end_var_$12;
    SubLObject end_var;
    SubLObject char_num;
    SubLObject v_char;
    for( end_var = ( end_var_$12 = Sequences.length( string ) ), char_num = NIL, char_num = ZERO_INTEGER; !char_num.numGE( end_var_$12 ); char_num = number_utilities.f_1X( char_num ) )
    {
      v_char = Strings.sublisp_char( string, char_num );
      if( v_char.eql( Characters.CHAR_comma ) )
      {
        result = Numbers.add( result, ONE_INTEGER );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 27261L)
  public static SubLObject comma_sub_string(final SubLObject string)
  {
    SubLObject result = NIL;
    if( number_of_commas( string ).numG( ZERO_INTEGER ) )
    {
      final SubLObject comma_pos_list = search_all( $str48$_, string, UNPROVIDED, UNPROVIDED );
      final SubLObject comma_pos = comma_pos_list.first();
      final SubLObject raw_substring = strip_first_n( string, Numbers.add( comma_pos, ONE_INTEGER ) );
      final SubLObject substring = result = Strings.string_left_trim( $str49$__, raw_substring );
      return result;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 27819L)
  public static SubLObject concatenate_adjacent_strings(final SubLObject items)
  {
    SubLObject new_items = NIL;
    SubLObject current_string = NIL;
    SubLObject cdolist_list_var = items;
    SubLObject item = NIL;
    item = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( item.isString() )
      {
        if( NIL != current_string )
        {
          current_string = Sequences.cconcatenate( current_string, item );
        }
        else
        {
          current_string = item;
        }
      }
      else
      {
        final SubLObject var = current_string;
        if( NIL != var )
        {
          new_items = ConsesLow.cons( var, new_items );
        }
        new_items = ConsesLow.cons( item, new_items );
        current_string = NIL;
      }
      cdolist_list_var = cdolist_list_var.rest();
      item = cdolist_list_var.first();
    }
    final SubLObject var = current_string;
    if( NIL != var )
    {
      new_items = ConsesLow.cons( var, new_items );
    }
    return Sequences.nreverse( new_items );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 28373L)
  public static SubLObject string_starts_with_constant_reader_prefix_p(final SubLObject string)
  {
    assert NIL != Types.stringp( string ) : string;
    return starts_with( string, constant_reader.constant_reader_prefix() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 28599L)
  public static SubLObject string_contains_constant_reader_prefix_p(final SubLObject string)
  {
    assert NIL != Types.stringp( string ) : string;
    return substringP( constant_reader.constant_reader_prefix(), string, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 28818L)
  public static SubLObject string_add_constant_reader_prefix(final SubLObject string)
  {
    assert NIL != Types.stringp( string ) : string;
    return Sequences.cconcatenate( constant_reader.constant_reader_prefix(), string );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 29030L)
  public static SubLObject string_remove_constant_reader_prefix(final SubLObject string)
  {
    assert NIL != Types.stringp( string ) : string;
    return pre_remove( string, constant_reader.constant_reader_prefix(), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 29244L)
  public static SubLObject string_remove_constant_reader_prefixes(final SubLObject string)
  {
    assert NIL != Types.stringp( string ) : string;
    return string_subst( $empty_string$.getGlobalValue(), constant_reader.constant_reader_prefix(), string, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 29489L)
  public static SubLObject one_is_starting_string(final SubLObject string, final SubLObject starting_strings, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQUALP );
    }
    SubLObject ans = NIL;
    if( NIL == ans )
    {
      SubLObject csome_list_var;
      SubLObject x;
      for( csome_list_var = starting_strings, x = NIL, x = csome_list_var.first(); NIL == ans && NIL != csome_list_var; ans = starting_string( string, x, test ), csome_list_var = csome_list_var.rest(), x = csome_list_var
          .first() )
      {
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 29798L)
  public static SubLObject strings_common_prefix(final SubLObject strings, SubLObject key, SubLObject start)
  {
    if( key == UNPROVIDED )
    {
      key = Symbols.symbol_function( IDENTITY );
    }
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    final SubLObject first_string = Functions.funcall( key, strings.first() );
    SubLObject rest_strings = strings.rest();
    assert NIL != Types.stringp( first_string ) : first_string;
    final SubLObject prefix = first_string;
    final SubLObject prefix_start = start;
    SubLObject prefix_end = Sequences.length( prefix );
    while ( !prefix_start.numE( prefix_end ) && NIL != rest_strings)
    {
      final SubLObject next_string = Functions.funcall( key, rest_strings.first() );
      assert NIL != Types.stringp( next_string ) : next_string;
      rest_strings = rest_strings.rest();
      final SubLObject first_mismatch = Strings.stringNE( prefix, next_string, prefix_start, prefix_end, prefix_start, Sequences.length( next_string ) );
      if( !first_mismatch.isNumber() )
      {
        continue;
      }
      prefix_end = first_mismatch;
    }
    return substring( prefix, prefix_start, prefix_end );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 30715L)
  public static SubLObject char_position(final SubLObject v_char, final SubLObject string, SubLObject n)
  {
    if( n == UNPROVIDED )
    {
      n = ZERO_INTEGER;
    }
    return Sequences.position( v_char, string, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ), n, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 30939L)
  public static SubLObject string_upto(final SubLObject string, SubLObject v_char)
  {
    if( v_char == UNPROVIDED )
    {
      v_char = Characters.CHAR_space;
    }
    final SubLObject pos = char_position( v_char, string, UNPROVIDED );
    if( NIL != pos )
    {
      return Sequences.subseq( string, ZERO_INTEGER, pos );
    }
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 31099L)
  public static SubLObject string_after(final SubLObject string, SubLObject v_char)
  {
    if( v_char == UNPROVIDED )
    {
      v_char = Characters.CHAR_space;
    }
    final SubLObject pos = char_position( v_char, string, UNPROVIDED );
    if( NIL != pos )
    {
      return Sequences.subseq( string, Numbers.add( pos, ONE_INTEGER ), UNPROVIDED );
    }
    return $empty_string$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 31272L)
  public static SubLObject string_between(final SubLObject string, SubLObject between_chars, SubLObject start)
  {
    if( between_chars == UNPROVIDED )
    {
      between_chars = $list50;
    }
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    final SubLObject start_pos = char_position( between_chars.first(), string, start );
    final SubLObject end_pos = ( NIL != start_pos ) ? char_position( conses_high.cadr( between_chars ), string, start_pos ) : NIL;
    if( NIL != end_pos && end_pos.numL( Sequences.length( string ) ) )
    {
      return Sequences.subseq( string, Numbers.add( ONE_INTEGER, start_pos ), end_pos );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 31890L)
  public static SubLObject get_substring_between_tags(final SubLObject string, final SubLObject start_tag, final SubLObject end_tag, SubLObject start_pos, SubLObject end_pos)
  {
    if( start_pos == UNPROVIDED )
    {
      start_pos = ZERO_INTEGER;
    }
    if( end_pos == UNPROVIDED )
    {
      end_pos = NIL;
    }
    SubLObject data_string = NIL;
    SubLObject test_pos = NIL;
    start_pos = Sequences.search( start_tag, string, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ), ZERO_INTEGER, NIL, start_pos, end_pos );
    if( NIL == start_pos )
    {
      return Values.values( NIL, NIL );
    }
    if( NIL != end_tag )
    {
      test_pos = Sequences.search( end_tag, string, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ), ZERO_INTEGER, NIL, Numbers.add( Sequences.length( start_tag ), start_pos ), end_pos );
    }
    if( NIL == test_pos )
    {
      return Values.values( NIL, NIL );
    }
    end_pos = get_end_pos( end_tag, test_pos, end_pos, Sequences.length( string ) );
    data_string = substring( string, Numbers.add( start_pos, Sequences.length( start_tag ) ), end_pos );
    return Values.values( data_string, end_pos );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 33050L)
  public static SubLObject get_substring_between_tags_list(final SubLObject string, final SubLObject start_tag, final SubLObject end_tag, SubLObject start_pos, SubLObject end_pos)
  {
    if( start_pos == UNPROVIDED )
    {
      start_pos = ZERO_INTEGER;
    }
    if( end_pos == UNPROVIDED )
    {
      end_pos = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject data_string = get_substring_between_tags( string, start_tag, end_tag, start_pos, end_pos );
    final SubLObject test_pos = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return ConsesLow.list( data_string, test_pos );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 33381L)
  public static SubLObject get_end_pos(final SubLObject end_tag, final SubLObject true_end, final SubLObject arg_end, final SubLObject string_end)
  {
    return ( NIL != true_end && NIL != end_tag ) ? true_end : ( ( NIL != arg_end ) ? arg_end : string_end );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 33610L)
  public static SubLObject strip_header(final SubLObject string, final SubLObject header)
  {
    if( NIL != starts_with( string, header ) )
    {
      return Sequences.subseq( string, Sequences.length( header ), UNPROVIDED );
    }
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 33750L)
  public static SubLObject strip_trailer(final SubLObject string, final SubLObject trailer)
  {
    if( NIL != ends_with( string, trailer, UNPROVIDED ) )
    {
      return Sequences.subseq( string, ZERO_INTEGER, Numbers.subtract( Sequences.length( string ), Sequences.length( trailer ) ) );
    }
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 33913L)
  public static SubLObject strip_first(final SubLObject string)
  {
    if( Sequences.length( string ).numG( ZERO_INTEGER ) )
    {
      return Sequences.subseq( string, ONE_INTEGER, Sequences.length( string ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 34072L)
  public static SubLObject strip_final(final SubLObject string, SubLObject n)
  {
    if( n == UNPROVIDED )
    {
      n = ONE_INTEGER;
    }
    if( NIL != list_utilities.lengthGE( string, n, UNPROVIDED ) )
    {
      return Sequences.subseq( string, ZERO_INTEGER, Numbers.subtract( Sequences.length( string ), n ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 34254L)
  public static SubLObject strip_first_if_char(final SubLObject string, final SubLObject v_char)
  {
    if( Sequences.length( string ).numG( ZERO_INTEGER ) && NIL != Characters.charE( v_char, Strings.sublisp_char( string, ZERO_INTEGER ) ) )
    {
      return Sequences.subseq( string, ONE_INTEGER, Sequences.length( string ) );
    }
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 34439L)
  public static SubLObject strip_final_if_char(final SubLObject string, final SubLObject v_char)
  {
    if( Sequences.length( string ).numG( ZERO_INTEGER ) && NIL != Characters.charE( v_char, Strings.sublisp_char( string, Numbers.subtract( Sequences.length( string ), ONE_INTEGER ) ) ) )
    {
      return Sequences.subseq( string, ZERO_INTEGER, Numbers.subtract( Sequences.length( string ), ONE_INTEGER ) );
    }
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 34650L)
  public static SubLObject strip_first_n(final SubLObject string, final SubLObject n)
  {
    final SubLObject length_of_string = Sequences.length( string );
    if( length_of_string.numGE( n ) )
    {
      return Sequences.subseq( string, n, length_of_string );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 34870L)
  public static SubLObject strip_final_n(final SubLObject string, final SubLObject n)
  {
    final SubLObject length_of_string = Sequences.length( string );
    if( length_of_string.numGE( n ) )
    {
      return Sequences.subseq( string, ZERO_INTEGER, Numbers.subtract( length_of_string, n ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 35095L)
  public static SubLObject strip_punctuation(SubLObject string)
  {
    while ( NIL != non_empty_string_p( string ) && NIL != punctuation_p( first_char( string ) ))
    {
      string = strip_first( string );
    }
    while ( NIL != non_empty_string_p( string ) && NIL != punctuation_p( last_char( string ) ))
    {
      string = strip_final( string, UNPROVIDED );
    }
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 35501L)
  public static SubLObject strip_sentential_punctuation(final SubLObject sentence_string)
  {
    if( NIL != ends_with_one_of( sentence_string, $list51 ) )
    {
      return strip_final( sentence_string, UNPROVIDED );
    }
    return sentence_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 35749L)
  public static SubLObject ends_in_geminateP(final SubLObject string)
  {
    final SubLObject last_n = Numbers.subtract( Sequences.length( string ), ONE_INTEGER );
    final SubLObject second_last_n = Numbers.subtract( Sequences.length( string ), TWO_INTEGER );
    if( last_n.numG( ZERO_INTEGER ) && Vectors.aref( string, last_n ).eql( Vectors.aref( string, second_last_n ) ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 36113L)
  public static SubLObject null_stringP(final SubLObject v_object)
  {
    return empty_string_p( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 36177L)
  public static SubLObject non_empty_stringP(final SubLObject v_object)
  {
    return non_empty_subl_stringP( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 36437L)
  public static SubLObject non_empty_cycl_stringP(final SubLObject v_object)
  {
    return makeBoolean( NIL != cycl_string.cycl_string_p( v_object ) && NIL == empty_string_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 36554L)
  public static SubLObject non_empty_subl_stringP(final SubLObject v_object)
  {
    return makeBoolean( v_object.isString() && NIL == empty_string_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 36748L)
  public static SubLObject char_set_position(final SubLObject char_set, final SubLObject string, SubLObject start, SubLObject end)
  {
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    if( end == UNPROVIDED )
    {
      end = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( string ) : string;
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = $char_set$.currentBinding( thread );
    try
    {
      $char_set$.bind( char_set, thread );
      ans = Sequences.position_if( Symbols.symbol_function( $sym53$CHAR_IN_CHAR_SET ), string, Symbols.symbol_function( IDENTITY ), start, end );
    }
    finally
    {
      $char_set$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 37192L)
  public static SubLObject char_type_position(final SubLObject char_type, final SubLObject string, SubLObject start, SubLObject end)
  {
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    if( end == UNPROVIDED )
    {
      end = NIL;
    }
    assert NIL != Types.stringp( string ) : string;
    return Sequences.position_if( char_type, string, Symbols.symbol_function( IDENTITY ), start, end );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 37505L)
  public static SubLObject space_p(final SubLObject v_object)
  {
    return Equality.eql( $space_char$.getGlobalValue(), v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 37573L)
  public static SubLObject non_space_char_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isChar() && NIL == space_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 37681L)
  public static SubLObject tab_p(final SubLObject v_object)
  {
    return Equality.eql( $tab_char$.getGlobalValue(), v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 37745L)
  public static SubLObject non_tab_char_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isChar() && NIL == tab_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 37849L)
  public static SubLObject not_digit_char_p(final SubLObject thing)
  {
    return makeBoolean( NIL == Characters.digit_char_p( thing, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 37920L)
  public static SubLObject isa_digit_charP(final SubLObject thing)
  {
    return makeBoolean( thing.isChar() && NIL != Characters.digit_char_p( thing, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 38015L)
  public static SubLObject digit_stringP(final SubLObject v_object)
  {
    return makeBoolean( v_object.isString() && NIL == list_utilities.find_if_not( $sym54$DIGIT_CHAR_P, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 38222L)
  public static SubLObject alphanumeric_stringP(final SubLObject v_object)
  {
    return makeBoolean( v_object.isString() && NIL == list_utilities.find_if_not( $sym55$ALPHANUMERICP, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 38437L)
  public static SubLObject alphanumeric_char_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isChar() && NIL != Characters.alphanumericp( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 38547L)
  public static SubLObject alphabetic_char_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isChar() && NIL != Characters.alpha_char_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 38654L)
  public static SubLObject partially_numeric_stringP(final SubLObject v_object)
  {
    return makeBoolean( v_object.isString() && NIL != Sequences.find_if( $sym54$DIGIT_CHAR_P, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 38775L)
  public static SubLObject alphabetic_stringP(final SubLObject v_object)
  {
    return makeBoolean( v_object.isString() && NIL != Sequences.find_if( $sym56$ALPHA_CHAR_P, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 38987L)
  public static SubLObject non_alphabetic_stringP(final SubLObject v_object)
  {
    return makeBoolean( v_object.isString() && NIL == Sequences.find_if( $sym56$ALPHA_CHAR_P, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 39214L)
  public static SubLObject is_numericP(final SubLObject string)
  {
    return collection_defns.cyc_numeric_string( trim_whitespace( string ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 39444L)
  public static SubLObject is_numeric_rangeP(final SubLObject string)
  {
    return parse_numeric_range( string );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 39754L)
  public static SubLObject parse_numeric_range(final SubLObject string)
  {
    SubLObject numeric_list = NIL;
    SubLObject num_list = NIL;
    if( NIL != char_position( Characters.CHAR_hyphen, string, UNPROVIDED ) )
    {
      numeric_list = string_tokenize( string, $list57, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( !Sequences.length( num_list ).numE( TWO_INTEGER ) )
      {
        num_list = NIL;
      }
    }
    else if( NIL != char_position( Characters.CHAR_comma, string, UNPROVIDED ) )
    {
      numeric_list = string_tokenize( string, $list58, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    else if( NIL != is_numericP( string ) )
    {
      numeric_list = ConsesLow.list( string );
    }
    if( NIL != numeric_list && NIL != list_utilities.every_in_list( Symbols.symbol_function( $sym59$IS_NUMERIC_ ), numeric_list, UNPROVIDED ) )
    {
      num_list = Mapping.mapcar( Symbols.symbol_function( $sym60$PARSE_INTEGER ), numeric_list );
    }
    return num_list;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 40715L)
  public static SubLObject ordinal(final SubLObject cardinal)
  {
    return PrintLow.format( NIL, $str61$__R, cardinal );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 40890L)
  public static SubLObject english_ordinal_number_string_p(final SubLObject string)
  {
    final SubLObject possibly_ordinal_numberP = ends_with_one_of( string, $list62 );
    return ( NIL != possibly_ordinal_numberP ) ? number_utilities.number_string_p( english_ordinal_string_to_cardinal_string( string ) ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 41218L)
  public static SubLObject english_ordinal_string_to_cardinal_string(final SubLObject string)
  {
    return strip_final_n( string, TWO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 41322L)
  public static SubLObject integer_suffix(final SubLObject string)
  {
    SubLObject last_digit_pos = NIL;
    SubLObject doneP;
    SubLObject i;
    SubLObject v_char;
    for( doneP = NIL, i = NIL, i = Numbers.subtract( Sequences.length( string ), ONE_INTEGER ); NIL == doneP && !i.numL( ZERO_INTEGER ); i = Numbers.subtract( i, ONE_INTEGER ) )
    {
      v_char = Vectors.aref( string, i );
      if( NIL != Characters.digit_char_p( v_char, UNPROVIDED ) )
      {
        last_digit_pos = i;
      }
      else
      {
        doneP = T;
      }
    }
    if( last_digit_pos.isInteger() )
    {
      return string_to_integer( Sequences.subseq( string, last_digit_pos, UNPROVIDED ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 43153L)
  public static SubLObject set_nth_char(final SubLObject n, final SubLObject string, final SubLObject new_char, SubLObject safeP)
  {
    if( safeP == UNPROVIDED )
    {
      safeP = T;
    }
    if( NIL != safeP )
    {
      assert NIL != Types.stringp( string ) : string;
      assert NIL != subl_promotions.non_negative_integer_p( n ) : n;
      assert NIL != Types.characterp( new_char ) : new_char;
    }
    if( NIL == safeP || NIL != list_utilities.lengthG( string, n, UNPROVIDED ) )
    {
      Strings.set_char( string, n, new_char );
    }
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 43622L)
  public static SubLObject strip_chars_meeting_test(final SubLObject string, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( $sym63$CONTROL_CHAR_P );
    }
    return substitute_char_if( string, Characters.CHAR_space, test );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 43865L)
  public static SubLObject substitute_char_if(final SubLObject string, final SubLObject new_char, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( $sym63$CONTROL_CHAR_P );
    }
    assert NIL != Types.stringp( string ) : string;
    final SubLObject string_var;
    final SubLObject output_string = string_var = copy_string( string );
    SubLObject end_var_$13;
    SubLObject end_var;
    SubLObject i;
    SubLObject ch;
    for( end_var = ( end_var_$13 = Sequences.length( string_var ) ), i = NIL, i = ZERO_INTEGER; !i.numGE( end_var_$13 ); i = number_utilities.f_1X( i ) )
    {
      ch = Strings.sublisp_char( string_var, i );
      if( NIL != Functions.funcall( test, ch ) )
      {
        set_nth_char( i, output_string, new_char, UNPROVIDED );
      }
    }
    return output_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 44285L)
  public static SubLObject string_wXo_control_charsP(final SubLObject string)
  {
    return makeBoolean( string.isString() && NIL == Sequences.find_if( Symbols.symbol_function( $sym63$CONTROL_CHAR_P ), string, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 44500L)
  public static SubLObject control_char_p(final SubLObject v_char)
  {
    return makeBoolean( v_char.isChar() && Characters.char_code( v_char ).numL( $int64$32 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 44657L)
  public static SubLObject utf_8_combining_character_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isChar() && Characters.char_code( v_object ).numGE( $int65$128 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 44887L)
  public static SubLObject integer_char_p(final SubLObject v_char)
  {
    return makeBoolean( v_char.isChar() && NIL != Characters.digit_char_p( v_char, TEN_INTEGER ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 45044L)
  public static SubLObject contains_charP(final SubLObject string, final SubLObject v_char)
  {
    return makeBoolean( NIL != Sequences.position( v_char, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 45128L)
  public static SubLObject char_in_char_set(final SubLObject v_char)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Sequences.find( v_char, $char_set$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 45193L)
  public static SubLObject split_string(final SubLObject string, SubLObject char_set)
  {
    if( char_set == UNPROVIDED )
    {
      char_set = $list66;
    }
    SubLObject ans = NIL;
    SubLObject previous;
    SubLObject position;
    for( previous = NIL, position = NIL, previous = NIL, position = char_set_position( char_set, string, ZERO_INTEGER, UNPROVIDED ); NIL != position; position = char_set_position( char_set, string, Numbers.add( previous,
        ONE_INTEGER ), UNPROVIDED ) )
    {
      ans = ConsesLow.cons( substring( string, ( NIL != previous ) ? Numbers.add( previous, ONE_INTEGER ) : ZERO_INTEGER, position ), ans );
      previous = position;
    }
    if( NIL != previous )
    {
      ans = ConsesLow.cons( substring( string, Numbers.add( previous, ONE_INTEGER ), UNPROVIDED ), ans );
    }
    else
    {
      ans = ConsesLow.list( string );
    }
    return Sequences.nreverse( ans );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 45652L)
  public static SubLObject split_string_on_string(final SubLObject string, final SubLObject delimiter)
  {
    SubLObject ans = NIL;
    SubLObject remaining = string;
    for( SubLObject pos = Sequences.search( delimiter, remaining, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ); NIL != pos; pos = Sequences.search( delimiter, remaining, UNPROVIDED,
        UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      ans = ConsesLow.cons( substring( remaining, ZERO_INTEGER, pos ), ans );
      remaining = substring( remaining, Numbers.add( pos, Sequences.length( delimiter ) ), UNPROVIDED );
    }
    ans = ConsesLow.cons( remaining, ans );
    remaining = NIL;
    return Sequences.nreverse( ans );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 46261L)
  public static SubLObject string_rotations(final SubLObject string, SubLObject stoplist_trie, SubLObject rotate_about, SubLObject rotate_insert, SubLObject valid_rotation_start_test)
  {
    if( stoplist_trie == UNPROVIDED )
    {
      stoplist_trie = NIL;
    }
    if( rotate_about == UNPROVIDED )
    {
      rotate_about = $list66;
    }
    if( rotate_insert == UNPROVIDED )
    {
      rotate_insert = $str49$__;
    }
    if( valid_rotation_start_test == UNPROVIDED )
    {
      valid_rotation_start_test = Symbols.symbol_function( $sym56$ALPHA_CHAR_P );
    }
    assert NIL != Types.stringp( string ) : string;
    assert NIL != Types.stringp( rotate_insert ) : rotate_insert;
    SubLObject answers = NIL;
    SubLObject previous;
    SubLObject position;
    SubLObject rotation;
    for( previous = NIL, position = NIL, previous = NIL, position = char_set_position( rotate_about, string, ZERO_INTEGER, UNPROVIDED ); NIL != position; position = char_set_position( rotate_about, string, Numbers.add(
        previous, ONE_INTEGER ), UNPROVIDED ) )
    {
      rotation = string_rotation_int( string, Numbers.add( position, ONE_INTEGER ), stoplist_trie, rotate_about, rotate_insert, valid_rotation_start_test );
      if( NIL != rotation )
      {
        answers = ConsesLow.cons( rotation, answers );
      }
      previous = position;
    }
    return Sequences.nreverse( answers );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 47178L)
  public static SubLObject string_rotation_int(final SubLObject string, SubLObject position, final SubLObject stoplist_trie, final SubLObject rotate_about, final SubLObject rotate_insert,
      final SubLObject valid_rotation_start_test)
  {
    final SubLObject strlen = Sequences.length( string );
    final SubLObject rotlen = Sequences.length( rotate_insert );
    final SubLObject endlen = Numbers.subtract( Sequences.length( string ), position );
    final SubLObject prelen = Numbers.add( endlen, rotlen );
    if( position.numGE( strlen ) )
    {
      return NIL;
    }
    if( NIL == Functions.funcall( valid_rotation_start_test, Strings.sublisp_char( string, position ) ) )
    {
      return NIL;
    }
    if( NIL != tries.trie_p( stoplist_trie ) )
    {
      final SubLObject next_position = char_set_position( rotate_about, string, Numbers.add( position, ONE_INTEGER ), UNPROVIDED );
      if( NIL != tries.trie_exact( stoplist_trie, string, NIL, position, next_position ) )
      {
        return NIL;
      }
    }
    final SubLObject rotated_string = Strings.make_string( Numbers.subtract( Numbers.add( strlen, rotlen ), ONE_INTEGER ), UNPROVIDED );
    Sequences.replace( rotated_string, string, ZERO_INTEGER, endlen, position, NIL );
    Sequences.replace( rotated_string, rotate_insert, endlen, prelen, ZERO_INTEGER, NIL );
    Sequences.replace( rotated_string, string, prelen, NIL, ZERO_INTEGER, position );
    return rotated_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 48269L)
  public static SubLObject substringP(final SubLObject little, final SubLObject big, SubLObject test, SubLObject start_index, SubLObject end_index)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQUALP );
    }
    if( start_index == UNPROVIDED )
    {
      start_index = ZERO_INTEGER;
    }
    if( end_index == UNPROVIDED )
    {
      end_index = NIL;
    }
    if( !little.isString() || !big.isString() )
    {
      return NIL;
    }
    if( NIL != list_utilities.lengthE( little, ONE_INTEGER, UNPROVIDED ) )
    {
      return Sequences.find( first_char( little ), big, test, Symbols.symbol_function( IDENTITY ), start_index, end_index );
    }
    return Sequences.search( little, big, test, Symbols.symbol_function( IDENTITY ), ZERO_INTEGER, NIL, start_index, end_index );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 48961L)
  public static SubLObject superstringP(final SubLObject big, final SubLObject little, SubLObject test, SubLObject start_index)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQUALP );
    }
    if( start_index == UNPROVIDED )
    {
      start_index = ZERO_INTEGER;
    }
    return substringP( little, big, test, start_index, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 49155L)
  public static SubLObject proper_superstringP(final SubLObject big, final SubLObject little, SubLObject test, SubLObject start_index)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQUALP );
    }
    if( start_index == UNPROVIDED )
    {
      start_index = ZERO_INTEGER;
    }
    return makeBoolean( NIL == Functions.funcall( test, big, little ) && NIL != substringP( little, big, test, start_index, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 49421L)
  public static SubLObject substring_matchP(final SubLObject big, final SubLObject little, final SubLObject start, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQUAL );
    }
    final SubLObject end = Numbers.add( start, Sequences.length( little ) );
    return makeBoolean( NIL != list_utilities.lengthGE( big, end, UNPROVIDED ) && NIL != substringP( little, big, test, start, end ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 49882L)
  public static SubLObject search_all(final SubLObject seq1, final SubLObject seq2, SubLObject test, SubLObject key)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    if( key == UNPROVIDED )
    {
      key = Symbols.symbol_function( IDENTITY );
    }
    final SubLObject seq2_length = Sequences.length( seq2 );
    SubLObject index = ZERO_INTEGER;
    SubLObject doneP = NIL;
    SubLObject result = NIL;
    while ( index.numLE( seq2_length ) && NIL == doneP)
    {
      final SubLObject position = Sequences.search( seq1, seq2, test, key, ZERO_INTEGER, NIL, index, UNPROVIDED );
      if( NIL != position )
      {
        result = ConsesLow.cons( position, result );
        index = number_utilities.f_1X( position );
      }
      else
      {
        doneP = T;
      }
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 50563L)
  public static SubLObject count_matches(final SubLObject seq1, final SubLObject seq2, SubLObject test, SubLObject key)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    if( key == UNPROVIDED )
    {
      key = Symbols.symbol_function( IDENTITY );
    }
    final SubLObject seq2_length = Sequences.length( seq2 );
    SubLObject index = ZERO_INTEGER;
    SubLObject result = ZERO_INTEGER;
    SubLObject doneP = NIL;
    if( NIL != empty_string_p( seq1 ) )
    {
      return number_utilities.f_1X( seq2_length );
    }
    while ( index.numLE( seq2_length ) && NIL == doneP)
    {
      final SubLObject position = Sequences.search( seq1, seq2, test, key, ZERO_INTEGER, NIL, index, UNPROVIDED );
      if( NIL != position )
      {
        result = Numbers.add( result, ONE_INTEGER );
        index = number_utilities.f_1X( position );
      }
      else
      {
        doneP = T;
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 51286L)
  public static SubLObject subwordP(final SubLObject substring, final SubLObject string, SubLObject charseq, SubLObject test)
  {
    if( charseq == UNPROVIDED )
    {
      charseq = NIL;
    }
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQUALP );
    }
    SubLObject i;
    for( i = NIL, i = ZERO_INTEGER; NIL == list_utilities.lengthLE( substring, i, UNPROVIDED ) && NIL != Sequences.find( Strings.sublisp_char( substring, i ), charseq, UNPROVIDED, UNPROVIDED, UNPROVIDED,
        UNPROVIDED ); i = Numbers.add( i, ONE_INTEGER ) )
    {
    }
    SubLObject mod_sub;
    for( mod_sub = substring( substring, i, UNPROVIDED ), i = NIL, i = Numbers.subtract( Sequences.length( mod_sub ), ONE_INTEGER ); !i.numLE( ZERO_INTEGER ) && NIL != Sequences.find( Strings.sublisp_char( mod_sub, i ),
        charseq, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ); i = Numbers.subtract( i, ONE_INTEGER ) )
    {
    }
    mod_sub = substring( mod_sub, ZERO_INTEGER, number_utilities.f_1X( i ) );
    if( NIL != null_stringP( string ) || NIL != null_stringP( mod_sub ) )
    {
      return NIL;
    }
    final SubLObject strend = Sequences.length( string );
    final SubLObject subend = Sequences.length( mod_sub );
    SubLObject retval = NIL;
    SubLObject temp = NIL;
    SubLObject start = NIL;
    SubLObject end = NIL;
    temp = Sequences.search( mod_sub, string, test, Symbols.symbol_function( IDENTITY ), ZERO_INTEGER, subend, ZERO_INTEGER, strend );
    start = ( ( NIL != temp ) ? temp : strend );
    end = Numbers.add( subend, start );
    while ( !start.numGE( strend ))
    {
      retval = makeBoolean( NIL != ( start.numE( ZERO_INTEGER ) ? T
          : makeBoolean( NIL != Sequences.find( Strings.sublisp_char( string, Numbers.subtract( start, ONE_INTEGER ) ), charseq, test, UNPROVIDED, UNPROVIDED, UNPROVIDED ) || NIL != whitespacep( Strings.sublisp_char(
              string, Numbers.subtract( start, ONE_INTEGER ) ) ) ) ) && NIL != ( end.numE( strend ) ? T
                  : makeBoolean( NIL != Sequences.find( Strings.sublisp_char( string, end ), charseq, test, UNPROVIDED, UNPROVIDED, UNPROVIDED ) || NIL != whitespacep( Strings.sublisp_char( string, end ) ) ) ) );
      if( NIL != retval )
      {
        return T;
      }
      temp = Sequences.search( mod_sub, string, test, Symbols.symbol_function( IDENTITY ), ZERO_INTEGER, subend, end, strend );
      start = ( ( NIL != temp ) ? temp : strend );
      end = Numbers.add( subend, start );
    }
    return retval;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 52870L)
  public static SubLObject bunge(SubLObject strings, SubLObject v_char)
  {
    if( v_char == UNPROVIDED )
    {
      v_char = Characters.CHAR_space;
    }
    assert NIL != Types.characterp( v_char ) : v_char;
    strings = Sequences.delete( $empty_string$.getGlobalValue(), Sequences.delete( NIL, strings, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED,
        UNPROVIDED, UNPROVIDED );
    final SubLObject num_strings = Sequences.length( strings );
    if( num_strings.numE( ZERO_INTEGER ) )
    {
      return $empty_string$.getGlobalValue();
    }
    if( num_strings.numE( ONE_INTEGER ) )
    {
      return strings.first();
    }
    SubLObject total_length = ZERO_INTEGER;
    SubLObject cdolist_list_var = strings;
    SubLObject string = NIL;
    string = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      total_length = Numbers.add( total_length, Sequences.length( string ) );
      cdolist_list_var = cdolist_list_var.rest();
      string = cdolist_list_var.first();
    }
    total_length = Numbers.add( total_length, Numbers.subtract( num_strings, ONE_INTEGER ) );
    final SubLObject new_string = Strings.make_string( total_length, v_char );
    SubLObject index = ZERO_INTEGER;
    Sequences.replace( new_string, strings.first(), index, NIL, ZERO_INTEGER, NIL );
    index = Numbers.add( index, Sequences.length( strings.first() ) );
    SubLObject cdolist_list_var2 = strings.rest();
    SubLObject string2 = NIL;
    string2 = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      index = Numbers.add( index, ONE_INTEGER );
      Sequences.replace( new_string, string2, index, NIL, ZERO_INTEGER, NIL );
      index = Numbers.add( index, Sequences.length( string2 ) );
      cdolist_list_var2 = cdolist_list_var2.rest();
      string2 = cdolist_list_var2.first();
    }
    return new_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 53993L)
  public static SubLObject bunge_with_string(SubLObject strings, SubLObject spacer)
  {
    if( spacer == UNPROVIDED )
    {
      spacer = $str18$_;
    }
    assert NIL != Strings.string( spacer ) : spacer;
    strings = Sequences.delete( $empty_string$.getGlobalValue(), Sequences.delete( NIL, strings, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject num_strings = Sequences.length( strings );
    if( num_strings.numE( ZERO_INTEGER ) )
    {
      return $empty_string$.getGlobalValue();
    }
    if( num_strings.numE( ONE_INTEGER ) )
    {
      return strings.first();
    }
    SubLObject total_length = ZERO_INTEGER;
    final SubLObject spacer_length = Sequences.length( spacer );
    SubLObject cdolist_list_var = strings;
    SubLObject string = NIL;
    string = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      total_length = Numbers.add( total_length, Sequences.length( string ) );
      cdolist_list_var = cdolist_list_var.rest();
      string = cdolist_list_var.first();
    }
    total_length = Numbers.add( total_length, Numbers.multiply( spacer_length, Numbers.subtract( num_strings, ONE_INTEGER ) ) );
    final SubLObject new_string = Strings.make_string( total_length, UNPROVIDED );
    SubLObject index = ZERO_INTEGER;
    Sequences.replace( new_string, strings.first(), index, NIL, ZERO_INTEGER, NIL );
    index = Numbers.add( index, Sequences.length( strings.first() ) );
    SubLObject cdolist_list_var2 = strings.rest();
    SubLObject string2 = NIL;
    string2 = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      Sequences.replace( new_string, spacer, index, NIL, ZERO_INTEGER, NIL );
      index = Numbers.add( index, spacer_length );
      Sequences.replace( new_string, string2, index, NIL, ZERO_INTEGER, NIL );
      index = Numbers.add( index, Sequences.length( string2 ) );
      cdolist_list_var2 = cdolist_list_var2.rest();
      string2 = cdolist_list_var2.first();
    }
    return new_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 55228L)
  public static SubLObject offsets_of_token(final SubLObject token, final SubLObject string)
  {
    if( NIL != list_utilities.lengthE( token, ONE_INTEGER, UNPROVIDED ) && NIL != punctuation_p( first_char( token ) ) )
    {
      return search_all( token, string, UNPROVIDED, UNPROVIDED );
    }
    final SubLObject escaped_token = regular_expression_utilities.escape_regex_special_chars( token );
    SubLObject regex = Sequences.cconcatenate( $str68$_b, new SubLObject[] { format_nil.format_nil_a_no_copy( escaped_token ), $str68$_b
    } );
    SubLObject offsets = list_utilities.alist_keys( regular_expression_utilities.offsets_of_regex_matches( regex, string, $list69, UNPROVIDED ) );
    if( NIL == offsets )
    {
      regex = format_nil.format_nil_a( escaped_token );
      offsets = list_utilities.alist_keys( regular_expression_utilities.offsets_of_regex_matches( regex, string, $list69, UNPROVIDED ) );
    }
    return offsets;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 55865L)
  public static SubLObject string_of_allowed_charsP(final SubLObject string, final SubLObject allowed_chars)
  {
    SubLObject end_var_$14;
    SubLObject end_var;
    SubLObject char_num;
    SubLObject v_char;
    for( end_var = ( end_var_$14 = Sequences.length( string ) ), char_num = NIL, char_num = ZERO_INTEGER; !char_num.numGE( end_var_$14 ); char_num = number_utilities.f_1X( char_num ) )
    {
      v_char = Strings.sublisp_char( string, char_num );
      if( NIL == subl_promotions.memberP( v_char, allowed_chars, UNPROVIDED, UNPROVIDED ) )
      {
        return NIL;
      }
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 56028L)
  public static SubLObject bunge_according_to_string(SubLObject parts, final SubLObject string, SubLObject chars_allowed_bXw_words, SubLObject v_char, SubLObject warnP)
  {
    if( chars_allowed_bXw_words == UNPROVIDED )
    {
      chars_allowed_bXw_words = $list66;
    }
    if( v_char == UNPROVIDED )
    {
      v_char = Characters.CHAR_space;
    }
    if( warnP == UNPROVIDED )
    {
      warnP = NIL;
    }
    assert NIL != Types.listp( parts ) : parts;
    assert NIL != Types.stringp( string ) : string;
    parts = Sequences.delete( $empty_string$.getGlobalValue(), Sequences.delete( NIL, parts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL == parts )
    {
      return $str0$;
    }
    if( NIL != list_utilities.singletonP( parts ) )
    {
      return parts.first();
    }
    final SubLObject first_part = parts.first();
    SubLObject previous_part_length = Sequences.length( first_part );
    SubLObject starting_points = offsets_of_token( first_part, string );
    if( NIL == starting_points )
    {
      Errors.error( $str70$_S_is_not_a_part_of_the_reference, first_part, string );
    }
    SubLObject cdolist_list_var = parts.rest();
    SubLObject part = NIL;
    part = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject part_offsets = offsets_of_token( part, string );
      SubLObject bunged_string_length = NIL;
      SubLObject valid_starts = NIL;
      if( NIL == part_offsets )
      {
        Errors.error( $str70$_S_is_not_a_part_of_the_reference, part, string );
      }
      SubLObject cdolist_list_var_$15 = part_offsets;
      SubLObject offset = NIL;
      offset = cdolist_list_var_$15.first();
      while ( NIL != cdolist_list_var_$15)
      {
        SubLObject cdolist_list_var_$16 = starting_points;
        SubLObject starting_point = NIL;
        starting_point = cdolist_list_var_$16.first();
        while ( NIL != cdolist_list_var_$16)
        {
          final SubLObject current_pointer = Numbers.add( starting_point, previous_part_length );
          if( offset.numGE( current_pointer ) && NIL != string_of_allowed_charsP( substring( string, current_pointer, offset ), chars_allowed_bXw_words ) )
          {
            final SubLObject item_var = starting_point;
            if( NIL == conses_high.member( item_var, valid_starts, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              valid_starts = ConsesLow.cons( item_var, valid_starts );
            }
            if( NIL == bunged_string_length )
            {
              bunged_string_length = Numbers.add( Numbers.subtract( offset, starting_point ), Sequences.length( part ) );
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
    if( NIL == starting_points && NIL == previous_part_length )
    {
      final SubLObject result = ( NIL != v_char ) ? bunge( parts, v_char ) : NIL;
      if( NIL != warnP )
      {
        Errors.warn( $str71$Failed_to_bunge__S_according_to__, parts, string, result );
      }
      return result;
    }
    final SubLObject start = starting_points.first();
    final SubLObject end = Numbers.add( start, previous_part_length );
    return substring( string, start, end );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 58226L)
  public static SubLObject bunge_according_to_string_ignoring_errors(final SubLObject word_list, final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject error = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym72$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          result = bunge_according_to_string( word_list, string, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
        catch( final Throwable catch_var )
        {
          Errors.handleThrowable( catch_var, NIL );
        }
      }
      finally
      {
        Errors.$error_handler$.rebind( _prev_bind_0, thread );
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      error = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL != error || NIL == result )
    {
      result = bunge( word_list, UNPROVIDED );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 58556L)
  public static SubLObject concatenate_strings(final SubLObject strings)
  {
    final SubLObject unicodeP = Sequences.find_if( $sym73$UNICODE_NAUT_P, strings, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject stringy_strings = ( NIL != unicodeP ) ? strings_to_display_vector_strings( strings ) : strings;
    final SubLObject big_string = ( NIL != stringy_strings ) ? Functions.apply( Symbols.symbol_function( $sym74$CCONCATENATE ), stringy_strings ) : $str0$;
    return ( NIL != unicodeP ) ? unicode_nauts.make_unicode_naut( big_string ) : big_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 58922L)
  public static SubLObject strings_to_display_vector_strings(final SubLObject strings)
  {
    final SubLObject display_vector_strings = conses_high.copy_list( strings );
    SubLObject list_var = NIL;
    SubLObject string = NIL;
    SubLObject i = NIL;
    list_var = strings;
    string = list_var.first();
    for( i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), string = list_var.first(), i = Numbers.add( ONE_INTEGER, i ) )
    {
      if( NIL != unicode_nauts.unicode_naut_p( string, UNPROVIDED ) )
      {
        ConsesLow.set_nth( i, display_vector_strings, cycl_utilities.nat_arg1( string, UNPROVIDED ) );
      }
      else
      {
        ConsesLow.set_nth( i, display_vector_strings, html_utilities.subl_string_to_display_vector_string( string ) );
      }
    }
    return display_vector_strings;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 59371L)
  public static SubLObject join_strings(final SubLObject string_list, SubLObject separator_text)
  {
    if( separator_text == UNPROVIDED )
    {
      separator_text = $str49$__;
    }
    final SubLObject first_string = string_list.first();
    final SubLObject other_strings = string_list.rest();
    SubLObject joined_text = ( NIL != first_string ) ? first_string : $str0$;
    SubLObject cdolist_list_var = other_strings;
    SubLObject string = NIL;
    string = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      joined_text = Sequences.cconcatenate( joined_text, new SubLObject[] { separator_text, string
      } );
      cdolist_list_var = cdolist_list_var.rest();
      string = cdolist_list_var.first();
    }
    return joined_text;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 60120L)
  public static SubLObject quoted_join_strings(final SubLObject string_list, SubLObject quote_char, SubLObject separator_text)
  {
    if( quote_char == UNPROVIDED )
    {
      quote_char = Characters.CHAR_quotation;
    }
    if( separator_text == UNPROVIDED )
    {
      separator_text = $str49$__;
    }
    SubLObject quoted_result = $str0$;
    if( NIL != string_list )
    {
      final SubLObject quote_string = Strings.string( quote_char );
      final SubLObject full_separator_text = Sequences.cconcatenate( quote_string, new SubLObject[] { separator_text, quote_string
      } );
      final SubLObject result = join_strings( string_list, full_separator_text );
      quoted_result = Sequences.cconcatenate( quote_string, new SubLObject[] { result, quote_string
      } );
    }
    return quoted_result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 60752L)
  public static SubLObject camel_case_to_underscores(final SubLObject string)
  {
    SubLObject prev_char = Characters.CHAR_A;
    SubLObject result = NIL;
    SubLObject s = NIL;
    try
    {
      s = streams_high.make_private_string_output_stream();
      SubLObject end_var_$17;
      SubLObject end_var;
      SubLObject char_num;
      SubLObject v_char;
      for( end_var = ( end_var_$17 = Sequences.length( string ) ), char_num = NIL, char_num = ZERO_INTEGER; !char_num.numGE( end_var_$17 ); char_num = number_utilities.f_1X( char_num ) )
      {
        v_char = Strings.sublisp_char( string, char_num );
        if( NIL != Characters.upper_case_p( v_char ) )
        {
          if( NIL != Characters.lower_case_p( prev_char ) )
          {
            streams_high.write_char( Characters.CHAR_underbar, s );
          }
          streams_high.write_char( Characters.char_downcase( v_char ), s );
        }
        else
        {
          streams_high.write_char( v_char, s );
        }
        prev_char = v_char;
      }
      result = streams_high.get_output_stream_string( s );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        streams_high.close( s, UNPROVIDED );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 61329L)
  public static SubLObject capitalize_first(final SubLObject string)
  {
    return Sequences.cconcatenate( str( Characters.char_upcase( Strings.sublisp_char( string, ZERO_INTEGER ) ) ), substring( string, ONE_INTEGER, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 61524L)
  public static SubLObject uncapitalize_first(final SubLObject string)
  {
    return Sequences.cconcatenate( str( Characters.char_downcase( Strings.sublisp_char( string, ZERO_INTEGER ) ) ), substring( string, ONE_INTEGER, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 61700L)
  public static SubLObject nth_word_of_string(final SubLObject num, final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current_pos = ZERO_INTEGER;
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = $test_char$.currentBinding( thread );
    try
    {
      $test_char$.bind( $space_char$.getGlobalValue(), thread );
      SubLObject cdolist_list_var;
      final SubLObject word_list_var = cdolist_list_var = break_words( string, $sym30$NOT_TEST_CHAR, UNPROVIDED );
      SubLObject word = NIL;
      word = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == result && num.numE( current_pos ) )
        {
          result = word;
        }
        current_pos = Numbers.add( current_pos, ONE_INTEGER );
        cdolist_list_var = cdolist_list_var.rest();
        word = cdolist_list_var.first();
      }
    }
    finally
    {
      $test_char$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 62014L)
  public static SubLObject capitalize_smart(final SubLObject string)
  {
    final SubLObject words = cycl_string.cycl_string_tokenize( string, $list75 );
    if( words.first().isString() )
    {
      nstring_proper( words.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    SubLObject cdolist_list_var = words.rest();
    SubLObject word = NIL;
    word = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( word.isString() && NIL != lexicon_utilities.smart_to_capitalizeP( word ) )
      {
        nstring_proper( word, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      cdolist_list_var = cdolist_list_var.rest();
      word = cdolist_list_var.first();
    }
    return cycl_string.cycl_string_bunge( words, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 62570L)
  public static SubLObject uncapitalize_smart(final SubLObject string)
  {
    final SubLObject uncapped = Strings.string_downcase( string, UNPROVIDED, UNPROVIDED );
    return capitalize_smart( uncapped );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 62940L)
  public static SubLObject properly_capitalized_stringP(final SubLObject string)
  {
    final SubLObject cap_string = capitalize_smart( string );
    return Equality.equal( string, cap_string );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 63211L)
  public static SubLObject capitalized_string_p(final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( !string.isString() )
    {
      return NIL;
    }
    SubLObject uncapitalized_open_class_wordsP = NIL;
    SubLObject capitalized_but_not_enitirely_wordsP = NIL;
    final SubLObject _prev_bind_0 = $test_char$.currentBinding( thread );
    try
    {
      $test_char$.bind( $space_char$.getGlobalValue(), thread );
      SubLObject cdolist_list_var;
      final SubLObject word_list_var = cdolist_list_var = break_words( string, $sym30$NOT_TEST_CHAR, UNPROVIDED );
      SubLObject word = NIL;
      word = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject first_letter = first_char( word );
        if( NIL == lexicon_accessors.closed_lexical_class_stringP( word, UNPROVIDED ) && NIL != Characters.lower_case_p( first_letter ) )
        {
          uncapitalized_open_class_wordsP = T;
        }
        if( NIL != Characters.upper_case_p( first_letter ) && NIL != Sequences.find_if( Symbols.symbol_function( $sym76$LOWER_CASE_P ), word, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
        {
          capitalized_but_not_enitirely_wordsP = T;
        }
        cdolist_list_var = cdolist_list_var.rest();
        word = cdolist_list_var.first();
      }
    }
    finally
    {
      $test_char$.rebind( _prev_bind_0, thread );
    }
    return makeBoolean( NIL != capitalized_but_not_enitirely_wordsP && NIL == uncapitalized_open_class_wordsP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 64383L)
  public static SubLObject string_encode_capitalization(final SubLObject string)
  {
    SubLObject ans = ZERO_INTEGER;
    SubLObject char_value = ONE_INTEGER;
    SubLObject end_var_$18;
    SubLObject end_var;
    SubLObject char_num;
    SubLObject v_char;
    for( end_var = ( end_var_$18 = Sequences.length( string ) ), char_num = NIL, char_num = ZERO_INTEGER; !char_num.numGE( end_var_$18 ); char_num = number_utilities.f_1X( char_num ) )
    {
      v_char = Strings.sublisp_char( string, char_num );
      if( NIL != Characters.upper_case_p( v_char ) )
      {
        ans = Numbers.add( ans, char_value );
      }
      char_value = Numbers.multiply( TWO_INTEGER, char_value );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 64682L)
  public static SubLObject string_has_capitalization_p(final SubLObject string, final SubLObject cap_code)
  {
    return string_has_capitalization_p_mod( string, cap_code );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 67052L)
  public static SubLObject string_has_capitalization_p_mod(final SubLObject string, final SubLObject cap_code)
  {
    SubLObject remaining_value = cap_code;
    SubLObject char_value = ONE_INTEGER;
    SubLObject mismatchP = NIL;
    final SubLObject end_var = Sequences.length( string );
    if( NIL == mismatchP )
    {
      SubLObject end_var_$19;
      SubLObject char_num;
      SubLObject v_char;
      for( end_var_$19 = end_var, char_num = NIL, char_num = ZERO_INTEGER; NIL == mismatchP && !char_num.numGE( end_var_$19 ); char_num = number_utilities.f_1X( char_num ) )
      {
        v_char = Strings.sublisp_char( string, char_num );
        if( NIL != Characters.upper_case_p( v_char ) )
        {
          remaining_value = Numbers.subtract( remaining_value, char_value );
        }
        char_value = Numbers.multiply( TWO_INTEGER, char_value );
        if( NIL == number_utilities.divides_evenly( remaining_value, char_value ) )
        {
          mismatchP = T;
        }
      }
    }
    if( !remaining_value.isZero() )
    {
      mismatchP = T;
    }
    return makeBoolean( NIL == mismatchP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 67702L)
  public static SubLObject string_has_capitalization_p_expt(final SubLObject string, final SubLObject cap_code)
  {
    SubLObject remaining_value = cap_code;
    SubLObject char_value = Numbers.expt( TWO_INTEGER, number_utilities.f_1_( Sequences.length( string ) ) );
    SubLObject mismatchP = NIL;
    final SubLObject string_var = Sequences.reverse( string );
    final SubLObject end_var = Sequences.length( string_var );
    if( NIL == mismatchP )
    {
      SubLObject end_var_$20;
      SubLObject char_num;
      SubLObject v_char;
      for( end_var_$20 = end_var, char_num = NIL, char_num = ZERO_INTEGER; NIL == mismatchP && !char_num.numGE( end_var_$20 ); char_num = number_utilities.f_1X( char_num ) )
      {
        v_char = Strings.sublisp_char( string_var, char_num );
        if( NIL != Characters.upper_case_p( v_char ) )
        {
          remaining_value = Numbers.subtract( remaining_value, char_value );
        }
        if( !remaining_value.numGE( ZERO_INTEGER ) || !remaining_value.numL( char_value ) )
        {
          mismatchP = T;
        }
        char_value = Numbers.divide( char_value, TWO_INTEGER );
      }
    }
    if( !remaining_value.isZero() )
    {
      mismatchP = T;
    }
    return makeBoolean( NIL == mismatchP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 68415L)
  public static SubLObject nstring_proper(final SubLObject string, SubLObject start, SubLObject end, SubLObject test, SubLObject leading)
  {
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    if( end == UNPROVIDED )
    {
      end = NIL;
    }
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( $sym77$WHITESPACEP );
    }
    if( leading == UNPROVIDED )
    {
      leading = T;
    }
    SubLObject str_len = Sequences.length( string );
    if( NIL != end && end.isNumber() && end.numLE( str_len ) )
    {
      str_len = end;
    }
    if( start.numG( str_len ) )
    {
      return string;
    }
    SubLObject i;
    for( i = NIL, i = start; !i.numE( str_len ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      if( NIL != leading )
      {
        Strings.set_char( string, i, Characters.char_upcase( Strings.sublisp_char( string, i ) ) );
        leading = NIL;
      }
      if( NIL != Functions.funcall( test, Vectors.aref( string, i ) ) )
      {
        leading = T;
      }
    }
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 69304L)
  public static SubLObject string_proper(final SubLObject string, SubLObject start, SubLObject end, SubLObject test, SubLObject leading)
  {
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    if( end == UNPROVIDED )
    {
      end = NIL;
    }
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( $sym77$WHITESPACEP );
    }
    if( leading == UNPROVIDED )
    {
      leading = T;
    }
    return nstring_proper( copy_string( string ), start, end, test, leading );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 69803L)
  public static SubLObject space_uncapitalize(final SubLObject string)
  {
    assert NIL != Types.stringp( string ) : string;
    final SubLObject length = Sequences.length( string );
    if( length.numE( ZERO_INTEGER ) )
    {
      return string;
    }
    final SubLObject capitals = Sequences.count_if( Symbols.symbol_function( $sym78$UPPER_CASE_P ), string, Symbols.symbol_function( IDENTITY ), ONE_INTEGER, UNPROVIDED );
    final SubLObject digits = Sequences.count_if( Symbols.symbol_function( $sym54$DIGIT_CHAR_P ), string, Symbols.symbol_function( IDENTITY ), ONE_INTEGER, UNPROVIDED );
    final SubLObject punctutation = Sequences.count_if( Symbols.symbol_function( $sym79$PUNCTUATION_P ), string, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject increase = Numbers.add( capitals, digits, punctutation );
    if( increase.numE( ZERO_INTEGER ) )
    {
      return string;
    }
    final SubLObject new_length = Numbers.add( length, increase );
    final SubLObject new_string = Strings.make_string( new_length, UNPROVIDED );
    SubLObject new_index = ZERO_INTEGER;
    SubLObject index = NIL;
    SubLObject prev_i = NIL;
    SubLObject v_char = NIL;
    SubLObject prev = NIL;
    index = ( prev_i = ZERO_INTEGER );
    v_char = ( prev = Strings.sublisp_char( string, index ) );
    while ( !index.numE( Numbers.subtract( length, ONE_INTEGER ) ))
    {
      if( ( NIL != Characters.upper_case_p( v_char ) || NIL != punctuation_p( v_char ) || ( NIL != Characters.digit_char_p( v_char, UNPROVIDED ) && NIL == Characters.digit_char_p( prev, UNPROVIDED ) ) ) && !index.numE(
          ZERO_INTEGER ) )
      {
        new_index = Numbers.add( new_index, ONE_INTEGER );
      }
      set_nth_char( new_index, new_string, Characters.char_downcase( v_char ), UNPROVIDED );
      new_index = Numbers.add( new_index, ONE_INTEGER );
      index = Numbers.add( index, ONE_INTEGER );
      prev_i = Numbers.subtract( index, ONE_INTEGER );
      v_char = Strings.sublisp_char( string, index );
      prev = Strings.sublisp_char( string, prev_i );
    }
    if( ( NIL != Characters.upper_case_p( v_char ) || NIL != punctuation_p( v_char ) || ( NIL != Characters.digit_char_p( v_char, UNPROVIDED ) && NIL == Characters.digit_char_p( prev, UNPROVIDED ) ) ) && !index.numE(
        ZERO_INTEGER ) )
    {
      new_index = Numbers.add( new_index, ONE_INTEGER );
    }
    set_nth_char( new_index, new_string, Characters.char_downcase( v_char ), UNPROVIDED );
    return trim_sides( new_string, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 71140L)
  public static SubLObject space_dont_uncapitalize(final SubLObject string)
  {
    assert NIL != Types.stringp( string ) : string;
    final SubLObject length = Sequences.length( string );
    SubLObject ans = length.isZero() ? string : NIL;
    if( NIL == ans )
    {
      final SubLObject capitals = Sequences.count_if( Symbols.symbol_function( $sym78$UPPER_CASE_P ), string, Symbols.symbol_function( IDENTITY ), ONE_INTEGER, UNPROVIDED );
      final SubLObject digits = Sequences.count_if( Symbols.symbol_function( $sym54$DIGIT_CHAR_P ), string, Symbols.symbol_function( IDENTITY ), ONE_INTEGER, UNPROVIDED );
      final SubLObject doomed = Sequences.count_if( Symbols.symbol_function( $sym80$EAT_CHAR_P ), string, Symbols.symbol_function( IDENTITY ), ONE_INTEGER, UNPROVIDED );
      final SubLObject increase = Numbers.subtract( Numbers.add( capitals, digits ), doomed );
      if( increase.isZero() )
      {
        ans = string;
      }
      if( NIL == ans )
      {
        final SubLObject new_length = Numbers.add( length, increase );
        final SubLObject new_string = Strings.make_string( new_length, UNPROVIDED );
        SubLObject new_index = ZERO_INTEGER;
        SubLObject prev = NIL;
        SubLObject index = NIL;
        SubLObject v_char = NIL;
        SubLObject next = NIL;
        index = ZERO_INTEGER;
        v_char = Strings.sublisp_char( string, index );
        next = Strings.sublisp_char( string, number_utilities.f_1X( index ) );
        while ( !index.numE( Numbers.subtract( length, ONE_INTEGER ) ))
        {
          if( NIL != Characters.lower_case_p( v_char ) && NIL == prev && NIL != capitalize_initial_char_p( v_char, next ) )
          {
            v_char = Characters.char_upcase( v_char );
          }
          if( NIL == eat_char_p( v_char ) )
          {
            if( NIL != add_space_between_chars_p( v_char, prev, next ) && !index.numE( ZERO_INTEGER ) )
            {
              new_index = Numbers.add( new_index, ONE_INTEGER );
            }
            set_nth_char( new_index, new_string, v_char, UNPROVIDED );
            new_index = Numbers.add( new_index, ONE_INTEGER );
          }
          prev = v_char;
          index = Numbers.add( index, ONE_INTEGER );
          v_char = Strings.sublisp_char( string, index );
          next = index.numL( number_utilities.f_1_( length ) ) ? Strings.sublisp_char( string, number_utilities.f_1X( index ) ) : NIL;
        }
        if( NIL != add_space_between_chars_p( v_char, prev, next ) && !index.numE( ZERO_INTEGER ) )
        {
          new_index = Numbers.add( new_index, ONE_INTEGER );
        }
        set_nth_char( new_index, new_string, v_char, UNPROVIDED );
        ans = trim_sides( new_string, UNPROVIDED );
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 72625L)
  public static SubLObject add_space_between_chars_p(final SubLObject v_char, final SubLObject prev, final SubLObject next)
  {
    return makeBoolean( ( NIL != Characters.upper_case_p( v_char ) && ( ( NIL != prev && NIL == Characters.upper_case_p( prev ) ) || ( next.isChar() && NIL != Characters.lower_case_p( next ) && !next.eql(
        Characters.CHAR_s ) ) ) ) || ( NIL != Characters.digit_char_p( v_char, UNPROVIDED ) && ( NIL == prev || NIL == Characters.digit_char_p( prev, UNPROVIDED ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 73034L)
  public static SubLObject eat_char_p(final SubLObject v_char)
  {
    return Equality.eq( v_char, Characters.CHAR_hyphen );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 73092L)
  public static SubLObject capitalize_initial_char_p(final SubLObject v_char, final SubLObject next)
  {
    return makeBoolean( NIL != Characters.lower_case_p( v_char ) && NIL != Characters.upper_case_p( next ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 73209L)
  public static SubLObject string_downcase_except_acronyms(final SubLObject string)
  {
    return string_ndowncase_except_acronyms( copy_string( string ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 73487L)
  public static SubLObject string_ndowncase_except_acronyms(final SubLObject string)
  {
    SubLObject prev = NIL;
    SubLObject continueP = T;
    while ( NIL != continueP)
    {
      continueP = NIL;
      prev = NIL;
      SubLObject end_var_$21;
      SubLObject end_var;
      SubLObject i;
      SubLObject curr;
      for( end_var = ( end_var_$21 = Sequences.length( string ) ), i = NIL, i = ZERO_INTEGER; !i.numGE( end_var_$21 ); i = number_utilities.f_1X( i ) )
      {
        curr = Strings.sublisp_char( string, i );
        if( prev.isChar() )
        {
          if( NIL != Characters.upper_case_p( prev ) && NIL != Characters.lower_case_p( curr ) && ( !curr.eql( Characters.CHAR_s ) || i.numL( TWO_INTEGER ) || NIL != whitespacep( Strings.sublisp_char( string, Numbers
              .subtract( i, TWO_INTEGER ) ) ) || ( NIL == list_utilities.lengthLE( string, number_utilities.f_1X( i ), UNPROVIDED ) && NIL == whitespacep( Strings.sublisp_char( string, number_utilities.f_1X(
                  i ) ) ) ) ) )
          {
            set_nth_char( number_utilities.f_1_( i ), string, Characters.char_downcase( prev ), UNPROVIDED );
            continueP = T;
          }
          else if( NIL != Characters.upper_case_p( curr ) && NIL != Characters.lower_case_p( prev ) )
          {
            set_nth_char( i, string, Characters.char_downcase( curr ), UNPROVIDED );
            continueP = T;
          }
          else if( NIL != Characters.upper_case_p( curr ) && NIL != whitespacep( prev ) && NIL != list_utilities.lengthG( string, number_utilities.f_1X( i ), UNPROVIDED ) && NIL != whitespacep( Strings.sublisp_char(
              string, number_utilities.f_1X( i ) ) ) )
          {
            set_nth_char( i, string, Characters.char_downcase( curr ), UNPROVIDED );
            continueP = T;
          }
        }
        prev = curr;
      }
    }
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 74656L)
  public static SubLObject hex_char_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isChar() && NIL != list_utilities.sublisp_boolean( Characters.digit_char_p( v_object, SIXTEEN_INTEGER ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 74814L)
  public static SubLObject hex_char(final SubLObject value)
  {
    assert NIL != Types.integerp( value ) : value;
    return Strings.sublisp_char( $str82$0123456789ABCDEF, value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 74983L)
  public static SubLObject hex_char_value(final SubLObject hex_char)
  {
    assert NIL != hex_char_p( hex_char ) : hex_char;
    return Characters.digit_char_p( hex_char, SIXTEEN_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 75145L)
  public static SubLObject hex_char_string_p(final SubLObject v_object)
  {
    return hex_string_p_int( v_object, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 75293L)
  public static SubLObject hex_string_p(final SubLObject v_object)
  {
    return hex_string_p_int( v_object, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 75420L)
  public static SubLObject hex_string_p_int(final SubLObject v_object, final SubLObject enforce_even_lengthP)
  {
    if( v_object.isString() )
    {
      final SubLObject length = Sequences.length( v_object );
      if( NIL == enforce_even_lengthP || NIL != Numbers.evenp( length ) )
      {
        SubLObject i;
        for( i = NIL, i = ZERO_INTEGER; i.numL( length ); i = Numbers.add( i, ONE_INTEGER ) )
        {
          if( NIL == hex_char_p( Strings.sublisp_char( v_object, i ) ) )
          {
            return NIL;
          }
        }
        return T;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 75700L)
  public static SubLObject integer_to_hex_string(final SubLObject integer)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.integerp( integer ) : integer;
    SubLObject hex_string = NIL;
    final SubLObject _prev_bind_0 = print_high.$print_base$.currentBinding( thread );
    try
    {
      print_high.$print_base$.bind( SIXTEEN_INTEGER, thread );
      hex_string = print_high.princ_to_string( integer );
    }
    finally
    {
      print_high.$print_base$.rebind( _prev_bind_0, thread );
    }
    return hex_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 77841L)
  public static SubLObject f_64_bit_char_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isChar() && NIL != Hashtables.gethash( v_object, $64_bit_char_index$.getGlobalValue(), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 77959L)
  public static SubLObject f_64_bit_char(final SubLObject value)
  {
    assert NIL != Types.integerp( value ) : value;
    final SubLObject result = Hashtables.gethash( value, $64_bit_integer_index$.getGlobalValue(), UNPROVIDED );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 78169L)
  public static SubLObject f_64_bit_char_value(final SubLObject v_char)
  {
    assert NIL != Types.characterp( v_char ) : v_char;
    final SubLObject result = Hashtables.gethash( v_char, $64_bit_char_index$.getGlobalValue(), UNPROVIDED );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 78381L)
  public static SubLObject f_64_bit_string_p(final SubLObject v_object)
  {
    if( v_object.isString() )
    {
      SubLObject end_var_$22;
      SubLObject end_var;
      SubLObject char_num;
      SubLObject v_char;
      for( end_var = ( end_var_$22 = Sequences.length( v_object ) ), char_num = NIL, char_num = ZERO_INTEGER; !char_num.numGE( end_var_$22 ); char_num = number_utilities.f_1X( char_num ) )
      {
        v_char = Strings.sublisp_char( v_object, char_num );
        if( NIL == f_64_bit_char_p( v_char ) && !Characters.CHAR_equal.eql( v_char ) )
        {
          return NIL;
        }
      }
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 78567L)
  public static SubLObject upper_case_alphanumeric_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != Characters.upper_case_p( v_object ) || NIL != Characters.digit_char_p( v_object, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 78785L)
  public static SubLObject punctuation_p(final SubLObject v_char)
  {
    return makeBoolean( v_char.isChar() && NIL != Sequences.find( v_char, $str85$____________, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 78883L)
  public static SubLObject punctuation_extended_p(final SubLObject v_char)
  {
    return makeBoolean( v_char.isChar() && NIL != Sequences.find( v_char, $str86$_____________, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 79224L)
  public static SubLObject punctuation_string_p(final SubLObject string)
  {
    return makeBoolean( Sequences.length( string ).numE( ONE_INTEGER ) && NIL != punctuation_p( first_char( string ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 79448L)
  public static SubLObject remove_punctuation(final SubLObject string)
  {
    return Sequences.remove_if( Symbols.symbol_function( $sym87$PUNCTUATION_EXTENDED_P ), string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 79638L)
  public static SubLObject upper_case_char_p(final SubLObject v_char)
  {
    return makeBoolean( v_char.isChar() && NIL != Characters.upper_case_p( v_char ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 79732L)
  public static SubLObject lower_case_char_p(final SubLObject v_char)
  {
    return makeBoolean( v_char.isChar() && NIL != Characters.lower_case_p( v_char ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 79826L)
  public static SubLObject upper_case_string_p(final SubLObject string)
  {
    SubLObject end_var_$23;
    SubLObject end_var;
    SubLObject char_num;
    SubLObject ch;
    for( end_var = ( end_var_$23 = Sequences.length( string ) ), char_num = NIL, char_num = ZERO_INTEGER; !char_num.numGE( end_var_$23 ); char_num = number_utilities.f_1X( char_num ) )
    {
      ch = Strings.sublisp_char( string, char_num );
      if( NIL != Characters.alpha_char_p( ch ) && NIL != Characters.lower_case_p( ch ) )
      {
        return NIL;
      }
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 79975L)
  public static SubLObject lower_case_string_p(final SubLObject string)
  {
    SubLObject end_var_$24;
    SubLObject end_var;
    SubLObject char_num;
    SubLObject ch;
    for( end_var = ( end_var_$24 = Sequences.length( string ) ), char_num = NIL, char_num = ZERO_INTEGER; !char_num.numGE( end_var_$24 ); char_num = number_utilities.f_1X( char_num ) )
    {
      ch = Strings.sublisp_char( string, char_num );
      if( NIL != Characters.alpha_char_p( ch ) && NIL != Characters.upper_case_p( ch ) )
      {
        return NIL;
      }
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 80275L)
  public static SubLObject string_list_downcase(final SubLObject string_list)
  {
    SubLObject ans = NIL;
    SubLObject cdolist_list_var = string_list;
    SubLObject string = NIL;
    string = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( string.isString() )
      {
        ans = ConsesLow.cons( Strings.string_downcase( string, UNPROVIDED, UNPROVIDED ), ans );
      }
      else
      {
        ans = ConsesLow.cons( string, ans );
      }
      cdolist_list_var = cdolist_list_var.rest();
      string = cdolist_list_var.first();
    }
    return Sequences.nreverse( ans );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 80651L)
  public static SubLObject string_list_upcase(final SubLObject string_list)
  {
    SubLObject ans = NIL;
    SubLObject cdolist_list_var = string_list;
    SubLObject string = NIL;
    string = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( string.isString() )
      {
        ans = ConsesLow.cons( Strings.string_upcase( string, UNPROVIDED, UNPROVIDED ), ans );
      }
      else
      {
        ans = ConsesLow.cons( string, ans );
      }
      cdolist_list_var = cdolist_list_var.rest();
      string = cdolist_list_var.first();
    }
    return Sequences.nreverse( ans );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 81023L)
  public static SubLObject nupcase_nth(final SubLObject string, final SubLObject n, SubLObject safeP)
  {
    if( safeP == UNPROVIDED )
    {
      safeP = T;
    }
    if( NIL != safeP )
    {
      assert NIL != subl_promotions.non_negative_integer_p( n ) : n;
      assert NIL != Types.stringp( string ) : string;
    }
    if( NIL == safeP || NIL != list_utilities.lengthG( string, n, UNPROVIDED ) )
    {
      set_nth_char( n, string, Characters.char_upcase( Strings.sublisp_char( string, n ) ), NIL );
    }
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 81417L)
  public static SubLObject nupcase_leading(final SubLObject string)
  {
    return nupcase_nth( string, ZERO_INTEGER, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 81548L)
  public static SubLObject upcase_leading(final SubLObject string)
  {
    return nupcase_leading( copy_string( string ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 81699L)
  public static SubLObject ndowncase_nth(final SubLObject string, final SubLObject n, SubLObject safeP)
  {
    if( safeP == UNPROVIDED )
    {
      safeP = T;
    }
    if( NIL != safeP )
    {
      assert NIL != subl_promotions.non_negative_integer_p( n ) : n;
      assert NIL != Types.stringp( string ) : string;
    }
    if( NIL == safeP || NIL != list_utilities.lengthG( string, n, UNPROVIDED ) )
    {
      set_nth_char( n, string, Characters.char_downcase( Strings.sublisp_char( string, n ) ), UNPROVIDED );
    }
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 82092L)
  public static SubLObject ndowncase_leading(final SubLObject string)
  {
    return ndowncase_nth( string, ZERO_INTEGER, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 82229L)
  public static SubLObject downcase_leading(final SubLObject string)
  {
    return ndowncase_leading( copy_string( string ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 82384L)
  public static SubLObject all_chars_EP(final SubLObject ch, final SubLObject string)
  {
    final SubLObject len = Sequences.length( string );
    SubLObject v_boolean = T;
    if( len.numG( ZERO_INTEGER ) )
    {
      SubLObject pos;
      for( pos = NIL, pos = ZERO_INTEGER; !pos.numE( len ) && NIL != v_boolean; pos = Numbers.add( pos, ONE_INTEGER ) )
      {
        if( NIL == Characters.charE( ch, Strings.sublisp_char( string, pos ) ) )
        {
          v_boolean = NIL;
        }
      }
      return v_boolean;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 82743L)
  public static SubLObject string_contains_only_charsP(final SubLObject string, final SubLObject char_list)
  {
    SubLObject other_charsP = NIL;
    final SubLObject end_var = Sequences.length( string );
    if( NIL == other_charsP )
    {
      SubLObject end_var_$25;
      SubLObject char_num;
      SubLObject v_char;
      for( end_var_$25 = end_var, char_num = NIL, char_num = ZERO_INTEGER; NIL == other_charsP && !char_num.numGE( end_var_$25 ); char_num = number_utilities.f_1X( char_num ) )
      {
        v_char = Strings.sublisp_char( string, char_num );
        if( NIL == subl_promotions.memberP( v_char, char_list, UNPROVIDED, UNPROVIDED ) )
        {
          other_charsP = T;
        }
      }
    }
    return makeBoolean( NIL == other_charsP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 83398L)
  public static SubLObject whitespace_chars()
  {
    return conses_high.copy_list( $whitespace_chars$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 83474L)
  public static SubLObject whitespace_charP(final SubLObject v_char)
  {
    return subl_promotions.memberP( v_char, $whitespace_chars$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 83832L)
  public static SubLObject grammatical_punctuation_chars()
  {
    return conses_high.copy_list( $grammatical_punctuation_chars$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 83934L)
  public static SubLObject grammatical_punctuation_charP(final SubLObject v_char)
  {
    return subl_promotions.memberP( v_char, $grammatical_punctuation_chars$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 84043L)
  public static SubLObject trim_whitespace(final SubLObject string)
  {
    assert NIL != Types.stringp( string ) : string;
    return Strings.string_trim( $whitespace_chars$.getGlobalValue(), string );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 84346L)
  public static SubLObject left_trim_whitespace(final SubLObject string)
  {
    assert NIL != Types.stringp( string ) : string;
    return Strings.string_left_trim( $whitespace_chars$.getGlobalValue(), string );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 84476L)
  public static SubLObject right_trim_whitespace(final SubLObject string)
  {
    assert NIL != Types.stringp( string ) : string;
    return Strings.string_right_trim( $whitespace_chars$.getGlobalValue(), string );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 84608L)
  public static SubLObject trim_whitespace_if_string(final SubLObject v_object)
  {
    if( v_object.isString() )
    {
      return Strings.string_trim( $whitespace_chars$.getGlobalValue(), v_object );
    }
    return $str0$;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 84886L)
  public static SubLObject nsubst_whitespace(SubLObject string)
  {
    final SubLObject string_var;
    string = ( string_var = normalize_spaces( string ) );
    SubLObject end_var_$26;
    SubLObject end_var;
    SubLObject i;
    SubLObject v_char;
    for( end_var = ( end_var_$26 = Sequences.length( string_var ) ), i = NIL, i = ZERO_INTEGER; !i.numGE( end_var_$26 ); i = number_utilities.f_1X( i ) )
    {
      v_char = Strings.sublisp_char( string_var, i );
      if( NIL != subl_promotions.memberP( v_char, $whitespace_chars$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) && !v_char.eql( Characters.CHAR_space ) )
      {
        set_nth_char( i, string, Characters.CHAR_space, UNPROVIDED );
      }
    }
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 85287L)
  public static SubLObject normalize_spaces(SubLObject string)
  {
    if( NIL != unicode_strings.non_ascii_string_p( string ) )
    {
      string = unicode_strings.utf8_vector_to_utf8_string( unicode_strings.unicode_vector_to_utf8_vector( Sequences.nsubstitute_if( $int64$32, $sym91$UNICODE_SPACE_CHAR_CODE_P, unicode_strings
          .utf8_string_to_unicode_vector( string ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED ) );
    }
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 85652L)
  public static SubLObject subst_whitespace(final SubLObject string)
  {
    return nsubst_whitespace( copy_string( string ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 85883L)
  public static SubLObject whitespacep(final SubLObject v_char)
  {
    return makeBoolean( v_char.isChar() && ( NIL != Sequences.find( v_char, $whitespace_chars$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) || ( NIL != unicode_strings.non_ascii_char_p( v_char )
        && NIL != unicode_space_char_code_p( Characters.char_code( v_char ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 86071L)
  public static SubLObject unicode_space_char_code_p(final SubLObject code)
  {
    return makeBoolean( code.numGE( $int92$8192 ) && code.numLE( $int93$8203 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 86179L)
  public static SubLObject non_whitespace_p(final SubLObject v_char)
  {
    return makeBoolean( NIL == whitespacep( v_char ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 86247L)
  public static SubLObject read_whitespace_no_hang(SubLObject stream, SubLObject eof_error_p, SubLObject eof_value)
  {
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_input$.getDynamicValue();
    }
    if( eof_error_p == UNPROVIDED )
    {
      eof_error_p = T;
    }
    if( eof_value == UNPROVIDED )
    {
      eof_value = NIL;
    }
    SubLObject v_char;
    for( v_char = NIL, v_char = streams_high.read_char_no_hang( stream, eof_error_p, eof_value, UNPROVIDED ); NIL != v_char && NIL != whitespacep( v_char ); v_char = streams_high.read_char_no_hang( stream, eof_error_p,
        eof_value, UNPROVIDED ) )
    {
    }
    if( v_char.isChar() )
    {
      streams_high.unread_char( v_char, stream );
    }
    return v_char;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 86603L)
  public static SubLObject whitespace_stringP(final SubLObject string)
  {
    return string_contains_only_charsP( string, $whitespace_chars$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 86712L)
  public static SubLObject trim_quotes(SubLObject string, SubLObject escaped_quote_as_string)
  {
    if( escaped_quote_as_string == UNPROVIDED )
    {
      escaped_quote_as_string = $str21$_;
    }
    if( NIL != starts_with( string, escaped_quote_as_string ) )
    {
      string = Sequences.subseq( string, ONE_INTEGER, UNPROVIDED );
    }
    if( NIL != ends_with( string, escaped_quote_as_string, UNPROVIDED ) )
    {
      string = Sequences.subseq( string, ZERO_INTEGER, Numbers.subtract( Sequences.length( string ), ONE_INTEGER ) );
    }
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 87057L)
  public static SubLObject remove_whitespace(final SubLObject string)
  {
    return Sequences.remove_if( $sym77$WHITESPACEP, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 87141L)
  public static SubLObject equal_modulo_whitespace(final SubLObject string1, final SubLObject string2)
  {
    return Equality.equal( remove_whitespace( string1 ), remove_whitespace( string2 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 87318L)
  public static SubLObject equalp_modulo_whitespace(final SubLObject string1, final SubLObject string2)
  {
    return Equality.equalp( remove_whitespace( string1 ), remove_whitespace( string2 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 87497L)
  public static SubLObject substringP_modulo_whitespace(final SubLObject little, final SubLObject big)
  {
    return substringP( remove_whitespace( little ), remove_whitespace( big ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 87674L)
  public static SubLObject network_terpri(final SubLObject stream)
  {
    streams_high.write_char( Characters.code_char( THIRTEEN_INTEGER ), stream );
    streams_high.terpri( stream );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 88090L)
  public static SubLObject add_to_buffer(final SubLObject v_char, SubLObject buffer, final SubLObject idx)
  {
    final SubLObject length = Sequences.length( buffer );
    if( idx.numGE( length ) )
    {
      final SubLObject new_buffer = Strings.make_string( Numbers.multiply( length, TWO_INTEGER ), UNPROVIDED );
      SubLObject i;
      for( i = NIL, i = ZERO_INTEGER; i.numL( length ); i = Numbers.add( i, ONE_INTEGER ) )
      {
        set_nth_char( i, new_buffer, Strings.sublisp_char( buffer, i ), UNPROVIDED );
      }
      buffer = new_buffer;
    }
    set_nth_char( idx, buffer, v_char, UNPROVIDED );
    return buffer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 88396L)
  public static SubLObject network_read_line(SubLObject stream, SubLObject eof_error_p, SubLObject eof_value, SubLObject return_partial_lineP)
  {
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_input$.getDynamicValue();
    }
    if( eof_error_p == UNPROVIDED )
    {
      eof_error_p = T;
    }
    if( eof_value == UNPROVIDED )
    {
      eof_value = $kw94$EOF;
    }
    if( return_partial_lineP == UNPROVIDED )
    {
      return_partial_lineP = NIL;
    }
    final SubLObject length = $int95$64;
    SubLObject buffer = Strings.make_string( length, UNPROVIDED );
    SubLObject idx = ZERO_INTEGER;
    SubLObject state = $kw96$NORMAL;
    SubLObject done = NIL;
    while ( NIL == done)
    {
      final SubLObject ch = streams_high.read_char( stream, eof_error_p, NIL, UNPROVIDED );
      if( NIL != ch )
      {
        if( NIL != Characters.charE( ch, Characters.code_char( THIRTEEN_INTEGER ) ) )
        {
          final SubLObject pcase_var = state;
          if( pcase_var.eql( $kw96$NORMAL ) )
          {
            state = $kw97$CR;
          }
          else
          {
            if( !pcase_var.eql( $kw97$CR ) )
            {
              continue;
            }
            buffer = add_to_buffer( Characters.code_char( THIRTEEN_INTEGER ), buffer, idx );
            idx = Numbers.add( idx, ONE_INTEGER );
          }
        }
        else if( NIL != Characters.charE( ch, Characters.code_char( TEN_INTEGER ) ) )
        {
          final SubLObject pcase_var = state;
          if( pcase_var.eql( $kw96$NORMAL ) )
          {
            done = T;
          }
          else
          {
            if( !pcase_var.eql( $kw97$CR ) )
            {
              continue;
            }
            done = T;
          }
        }
        else
        {
          final SubLObject pcase_var = state;
          if( pcase_var.eql( $kw96$NORMAL ) )
          {
            buffer = add_to_buffer( ch, buffer, idx );
            idx = Numbers.add( idx, ONE_INTEGER );
          }
          else
          {
            if( !pcase_var.eql( $kw97$CR ) )
            {
              continue;
            }
            buffer = add_to_buffer( Characters.code_char( THIRTEEN_INTEGER ), buffer, idx );
            idx = Numbers.add( idx, ONE_INTEGER );
            buffer = add_to_buffer( ch, buffer, idx );
            idx = Numbers.add( idx, ONE_INTEGER );
            state = $kw96$NORMAL;
          }
        }
      }
      else
      {
        if( NIL == return_partial_lineP || !idx.isPositive() )
        {
          return Values.values( eof_value, T );
        }
        done = T;
      }
    }
    return Values.values( substring( buffer, ZERO_INTEGER, idx ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 89765L)
  public static SubLObject read_possibly_continued_line(SubLObject stream, SubLObject eof_error_p, SubLObject eof_value)
  {
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_input$.getDynamicValue();
    }
    if( eof_error_p == UNPROVIDED )
    {
      eof_error_p = T;
    }
    if( eof_value == UNPROVIDED )
    {
      eof_value = $kw94$EOF;
    }
    SubLObject lines = NIL;
    SubLObject state = $kw96$NORMAL;
    while ( true)
    {
      final SubLObject line = network_read_line( stream, eof_error_p, NIL, UNPROVIDED );
      if( NIL == line )
      {
        return Values.values( eof_value, T );
      }
      final SubLObject string_var = line;
      SubLObject end_var_$27;
      SubLObject end_var;
      SubLObject char_num;
      SubLObject ch;
      SubLObject pcase_var;
      SubLObject pcase_var_$28;
      SubLObject pcase_var_$29;
      for( end_var = ( end_var_$27 = Sequences.length( string_var ) ), char_num = NIL, char_num = ZERO_INTEGER; !char_num.numGE( end_var_$27 ); char_num = number_utilities.f_1X( char_num ) )
      {
        ch = Strings.sublisp_char( string_var, char_num );
        pcase_var = state;
        if( pcase_var.eql( $kw96$NORMAL ) )
        {
          pcase_var_$28 = ch;
          if( pcase_var_$28.eql( Characters.CHAR_quotation ) )
          {
            state = $kw98$STRING;
          }
        }
        else if( pcase_var.eql( $kw98$STRING ) )
        {
          pcase_var_$29 = ch;
          if( pcase_var_$29.eql( Characters.CHAR_quotation ) )
          {
            state = $kw96$NORMAL;
          }
          else if( pcase_var_$29.eql( Characters.CHAR_backslash ) )
          {
            state = $kw99$SLASH;
          }
        }
        else if( pcase_var.eql( $kw99$SLASH ) )
        {
          state = $kw98$STRING;
        }
      }
      if( state == $kw96$NORMAL )
      {
        if( NIL != lines )
        {
          SubLObject new_lines = ConsesLow.list( line );
          SubLObject cdolist_list_var = lines;
          SubLObject old_line = NIL;
          old_line = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            new_lines = ConsesLow.cons( Strings.make_string( ONE_INTEGER, Characters.CHAR_newline ), new_lines );
            new_lines = ConsesLow.cons( old_line, new_lines );
            cdolist_list_var = cdolist_list_var.rest();
            old_line = cdolist_list_var.first();
          }
          return Values.values( Functions.apply( Symbols.symbol_function( $sym74$CCONCATENATE ), new_lines ), NIL );
        }
        return Values.values( line, NIL );
      }
      else
      {
        lines = ConsesLow.cons( line, lines );
      }
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 90726L)
  public static SubLObject find_earliest_string(final SubLObject string, final SubLObject search_strings, SubLObject test, SubLObject start)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    SubLObject earliest_position = Sequences.length( string );
    SubLObject earliest_string = NIL;
    SubLObject done = NIL;
    if( NIL == done )
    {
      SubLObject csome_list_var = search_strings;
      SubLObject control_string = NIL;
      control_string = csome_list_var.first();
      while ( NIL == done && NIL != csome_list_var)
      {
        final SubLObject position = Sequences.search( control_string, string, test, Symbols.symbol_function( IDENTITY ), ZERO_INTEGER, NIL, start, earliest_position );
        if( NIL != position && position.numL( earliest_position ) )
        {
          earliest_position = position;
          earliest_string = control_string;
        }
        done = Numbers.numE( earliest_position, start );
        csome_list_var = csome_list_var.rest();
        control_string = csome_list_var.first();
      }
    }
    return Values.values( ( NIL != earliest_string ) ? earliest_position : NIL, earliest_string );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 91541L)
  public static SubLObject search_last(final SubLObject seq1, final SubLObject seq2, SubLObject test, SubLObject key)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    if( key == UNPROVIDED )
    {
      key = Symbols.symbol_function( IDENTITY );
    }
    return list_utilities.last_one( search_all( seq1, seq2, test, key ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 91673L)
  public static SubLObject princ_substring(final SubLObject string, final SubLObject stream, SubLObject start, SubLObject end)
  {
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    if( end == UNPROVIDED )
    {
      end = NIL;
    }
    assert NIL != Types.stringp( string ) : string;
    if( NIL == end )
    {
      end = Sequences.length( string );
    }
    final SubLObject substring_length = Numbers.subtract( end, start );
    if( substring_length.isPositive() )
    {
      SubLObject index;
      for( index = NIL, index = ZERO_INTEGER; index.numL( substring_length ); index = Numbers.add( index, ONE_INTEGER ) )
      {
        streams_high.write_char( Strings.sublisp_char( string, Numbers.add( start, index ) ), stream );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 92071L)
  public static SubLObject strcat(final SubLObject string_list)
  {
    if( NIL == string_list )
    {
      return NIL;
    }
    return Functions.apply( Symbols.symbol_function( $sym74$CCONCATENATE ), string_list );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 92262L)
  public static SubLObject nchar_subst(final SubLObject v_new, final SubLObject old, final SubLObject string)
  {
    assert NIL != Types.characterp( v_new ) : v_new;
    assert NIL != Types.characterp( old ) : old;
    assert NIL != Types.stringp( string ) : string;
    SubLObject end_var_$30;
    SubLObject end_var;
    SubLObject i;
    SubLObject v_char;
    for( end_var = ( end_var_$30 = Sequences.length( string ) ), i = NIL, i = ZERO_INTEGER; !i.numGE( end_var_$30 ); i = number_utilities.f_1X( i ) )
    {
      v_char = Strings.sublisp_char( string, i );
      if( v_char.eql( old ) )
      {
        set_nth_char( i, string, v_new, UNPROVIDED );
      }
    }
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 92633L)
  public static SubLObject char_subst(final SubLObject v_new, final SubLObject old, final SubLObject string)
  {
    return nchar_subst( v_new, old, copy_string( string ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 92840L)
  public static SubLObject nchar_subst_if(final SubLObject v_new, final SubLObject test, final SubLObject string)
  {
    assert NIL != Types.characterp( v_new ) : v_new;
    assert NIL != Symbols.fboundp( test ) : test;
    assert NIL != Types.stringp( string ) : string;
    SubLObject end_var_$31;
    SubLObject end_var;
    SubLObject i;
    SubLObject v_char;
    for( end_var = ( end_var_$31 = Sequences.length( string ) ), i = NIL, i = ZERO_INTEGER; !i.numGE( end_var_$31 ); i = number_utilities.f_1X( i ) )
    {
      v_char = Strings.sublisp_char( string, i );
      if( NIL != Functions.funcall( test, v_char ) )
      {
        set_nth_char( i, string, v_new, UNPROVIDED );
      }
    }
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 93223L)
  public static SubLObject char_subst_if(final SubLObject v_new, final SubLObject test, final SubLObject string)
  {
    return nchar_subst_if( v_new, test, copy_string( string ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 93458L)
  public static SubLObject nchar_subst_if_not(final SubLObject v_new, final SubLObject test, final SubLObject string)
  {
    assert NIL != Types.characterp( v_new ) : v_new;
    assert NIL != Symbols.fboundp( test ) : test;
    assert NIL != Types.stringp( string ) : string;
    SubLObject end_var_$32;
    SubLObject end_var;
    SubLObject i;
    SubLObject v_char;
    for( end_var = ( end_var_$32 = Sequences.length( string ) ), i = NIL, i = ZERO_INTEGER; !i.numGE( end_var_$32 ); i = number_utilities.f_1X( i ) )
    {
      v_char = Strings.sublisp_char( string, i );
      if( NIL == Functions.funcall( test, v_char ) )
      {
        set_nth_char( i, string, v_new, UNPROVIDED );
      }
    }
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 93847L)
  public static SubLObject char_subst_if_not(final SubLObject v_new, final SubLObject test, final SubLObject string)
  {
    return nchar_subst_if_not( v_new, test, copy_string( string ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 94090L)
  public static SubLObject string_subst(final SubLObject v_new, final SubLObject old, final SubLObject string, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQUALP );
    }
    assert NIL != Types.stringp( v_new ) : v_new;
    assert NIL != non_empty_string_p( old ) : old;
    assert NIL != Types.stringp( string ) : string;
    final SubLObject new_length = Sequences.length( v_new );
    final SubLObject old_length = Sequences.length( old );
    SubLObject total_occurrences = ZERO_INTEGER;
    SubLObject string_start;
    SubLObject position;
    for( string_start = NIL, position = NIL, string_start = ZERO_INTEGER, position = Sequences.search( old, string, test, Symbols.symbol_function( IDENTITY ), ZERO_INTEGER, NIL, string_start,
        NIL ); NIL != position; position = Sequences.search( old, string, test, Symbols.symbol_function( IDENTITY ), ZERO_INTEGER, NIL, string_start, NIL ) )
    {
      total_occurrences = Numbers.add( total_occurrences, ONE_INTEGER );
      string_start = Numbers.add( position, old_length );
    }
    if( total_occurrences.numE( ZERO_INTEGER ) )
    {
      return string;
    }
    final SubLObject string_length = Sequences.length( string );
    final SubLObject delta = Numbers.multiply( total_occurrences, Numbers.subtract( new_length, old_length ) );
    final SubLObject subst_length = Numbers.add( string_length, delta );
    final SubLObject subst_string = Strings.make_string( subst_length, Characters.CHAR_space );
    SubLObject string_index = ZERO_INTEGER;
    SubLObject subst_index = ZERO_INTEGER;
    SubLObject string_start2;
    SubLObject position2;
    SubLObject string_seq_length;
    for( string_start2 = NIL, position2 = NIL, string_start2 = ZERO_INTEGER, position2 = Sequences.search( old, string, test, Symbols.symbol_function( IDENTITY ), ZERO_INTEGER, NIL, string_start2,
        NIL ); NIL != position2; position2 = Sequences.search( old, string, test, Symbols.symbol_function( IDENTITY ), ZERO_INTEGER, NIL, string_start2, NIL ) )
    {
      string_seq_length = Numbers.subtract( position2, string_index );
      Sequences.replace( subst_string, string, subst_index, Numbers.add( subst_index, string_seq_length ), string_index, position2 );
      string_index = Numbers.add( string_index, string_seq_length );
      subst_index = Numbers.add( subst_index, string_seq_length );
      Sequences.replace( subst_string, v_new, subst_index, Numbers.add( subst_index, new_length ), ZERO_INTEGER, new_length );
      string_index = Numbers.add( string_index, old_length );
      subst_index = Numbers.add( subst_index, new_length );
      string_start2 = Numbers.add( position2, old_length );
    }
    if( !subst_index.numE( subst_length ) )
    {
      Sequences.replace( subst_string, string, subst_index, NIL, string_index, NIL );
    }
    return subst_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 96020L)
  public static SubLObject trim_sides(final SubLObject string, SubLObject char_to_trim)
  {
    if( char_to_trim == UNPROVIDED )
    {
      char_to_trim = Characters.CHAR_space;
    }
    SubLObject result = string.isString() ? Strings.string_trim( ConsesLow.list( char_to_trim ), string ) : NIL;
    if( NIL != empty_string_p( result ) )
    {
      result = NIL;
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 96409L)
  public static SubLObject valid_timestring_charP(final SubLObject ch)
  {
    return makeBoolean( NIL != Characters.digit_char_p( ch, UNPROVIDED ) || NIL != Sequences.find( ch, $list102, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 96500L)
  public static SubLObject string_trim_symmetric_n(final SubLObject char_list, final SubLObject string, SubLObject n)
  {
    if( n == UNPROVIDED )
    {
      n = NIL;
    }
    if( ZERO_INTEGER.eql( n ) )
    {
      return string;
    }
    final SubLObject string_length = Sequences.length( string );
    if( TWO_INTEGER.numG( string_length ) )
    {
      return string;
    }
    final SubLObject first_char = Strings.sublisp_char( string, ZERO_INTEGER );
    if( NIL != subl_promotions.memberP( first_char, char_list, UNPROVIDED, UNPROVIDED ) )
    {
      final SubLObject last_char = Strings.sublisp_char( string, Numbers.subtract( string_length, ONE_INTEGER ) );
      if( NIL != Characters.charE( first_char, last_char ) )
      {
        final SubLObject new_string = substring( string, ONE_INTEGER, Numbers.subtract( string_length, ONE_INTEGER ) );
        if( NIL == n )
        {
          return string_trim_symmetric_n( char_list, new_string, UNPROVIDED );
        }
        if( n.numE( ZERO_INTEGER ) )
        {
          return new_string;
        }
        return string_trim_symmetric_n( char_list, new_string, Numbers.subtract( n, ONE_INTEGER ) );
      }
    }
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 97493L)
  public static SubLObject break_words(final SubLObject string, SubLObject non_break_char_test, SubLObject leave_embedded_stringsP)
  {
    if( non_break_char_test == UNPROVIDED )
    {
      non_break_char_test = Symbols.symbol_function( $sym103$VALID_CONSTANT_NAME_CHAR_P );
    }
    if( leave_embedded_stringsP == UNPROVIDED )
    {
      leave_embedded_stringsP = NIL;
    }
    final SubLObject len = Sequences.length( string );
    SubLObject p1 = ZERO_INTEGER;
    SubLObject p2 = ONE_INTEGER;
    SubLObject ans = NIL;
    SubLObject inside_dqP = NIL;
    while ( !p2.numG( len ))
    {
      final SubLObject px = Numbers.subtract( p2, ONE_INTEGER );
      final SubLObject c1 = Strings.sublisp_char( string, p1 );
      final SubLObject c2 = p2.numL( len ) ? Strings.sublisp_char( string, p2 ) : NIL;
      final SubLObject cx = Strings.sublisp_char( string, px );
      final SubLObject c1_is_breakP = makeBoolean( c1.isChar() && ( NIL == leave_embedded_stringsP || NIL == Characters.charE( c1, Characters.CHAR_quotation ) ) && NIL == Functions.funcall( non_break_char_test, c1 ) );
      final SubLObject c2_is_breakP = makeBoolean( c2.isChar() && ( NIL == leave_embedded_stringsP || NIL == Characters.charE( c2, Characters.CHAR_quotation ) ) && NIL == Functions.funcall( non_break_char_test, c2 ) );
      if( NIL != Characters.charE( c1, Characters.CHAR_quotation ) && NIL != leave_embedded_stringsP )
      {
        if( NIL != inside_dqP )
        {
          if( NIL != Characters.charE( cx, Characters.CHAR_quotation ) && !p1.numE( px ) )
          {
            inside_dqP = NIL;
          }
        }
        else
        {
          inside_dqP = T;
        }
      }
      if( p2.numE( len ) && NIL == c1_is_breakP )
      {
        ans = ConsesLow.cons( Sequences.subseq( string, p1, p2 ), ans );
        p2 = Numbers.add( p2, ONE_INTEGER );
      }
      else if( NIL != c1_is_breakP )
      {
        p1 = Numbers.add( p1, ONE_INTEGER );
        p2 = Numbers.add( p1, ONE_INTEGER );
      }
      else if( NIL == c1_is_breakP && NIL == c2_is_breakP )
      {
        p2 = Numbers.add( p2, ONE_INTEGER );
      }
      else if( NIL == c1_is_breakP && NIL == inside_dqP && NIL != c2_is_breakP )
      {
        ans = ConsesLow.cons( Sequences.subseq( string, p1, p2 ), ans );
        p1 = Numbers.add( p2, ONE_INTEGER );
        p2 = Numbers.add( p1, ONE_INTEGER );
      }
      else
      {
        if( NIL != c1_is_breakP || NIL == inside_dqP || NIL == c2_is_breakP )
        {
          continue;
        }
        p2 = Numbers.add( p2, ONE_INTEGER );
      }
    }
    return Sequences.nreverse( ans );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 99831L)
  public static SubLObject sub_phrases(final SubLObject string)
  {
    SubLObject strings = NIL;
    final SubLObject space_positions = list_utilities.all_positions( Characters.CHAR_space, string, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject cdolist_list_var = ConsesLow.cons( ZERO_INTEGER, Mapping.mapcar( $sym104$1_, space_positions ) );
    SubLObject start = NIL;
    start = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$33 = ConsesLow.cons( NIL, space_positions );
      SubLObject end = NIL;
      end = cdolist_list_var_$33.first();
      while ( NIL != cdolist_list_var_$33)
      {
        if( NIL == end || end.numG( start ) )
        {
          final SubLObject item_var = substring( string, start, end );
          if( NIL == conses_high.member( item_var, strings, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            strings = ConsesLow.cons( item_var, strings );
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
  public static SubLObject number_of_words(final SubLObject string)
  {
    return Numbers.add( ONE_INTEGER, count_chars_in_string( trim_whitespace( string ), Characters.CHAR_space ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 100418L)
  public static SubLObject first_word(final SubLObject string, SubLObject word_boundary)
  {
    if( word_boundary == UNPROVIDED )
    {
      word_boundary = $space_char$.getGlobalValue();
    }
    assert NIL != Types.stringp( string ) : string;
    assert NIL != Types.characterp( word_boundary ) : word_boundary;
    return string_upto( string, word_boundary );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 100708L)
  public static SubLObject substring_positions(final SubLObject string, final SubLObject strings)
  {
    SubLObject ans = NIL;
    SubLObject cdotimes_end_var;
    SubLObject i;
    SubLObject found_one;
    SubLObject csome_list_var;
    SubLObject d;
    for( cdotimes_end_var = Sequences.length( string ), i = NIL, i = ZERO_INTEGER; i.numL( cdotimes_end_var ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      found_one = NIL;
      if( NIL == found_one )
      {
        csome_list_var = strings;
        d = NIL;
        d = csome_list_var.first();
        while ( NIL == found_one && NIL != csome_list_var)
        {
          if( NIL != starts_with( Sequences.subseq( string, i, UNPROVIDED ), d ) )
          {
            ans = ConsesLow.cons( ConsesLow.list( i, d ), ans );
            found_one = T;
          }
          csome_list_var = csome_list_var.rest();
          d = csome_list_var.first();
        }
      }
    }
    return Sequences.nreverse( ans );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 101164L)
  public static SubLObject break_string(final SubLObject string, final SubLObject break_substrings)
  {
    SubLObject ans = NIL;
    final SubLObject len = Sequences.length( string );
    final SubLObject substr_positions = substring_positions( string, break_substrings );
    SubLObject i1 = ZERO_INTEGER;
    SubLObject i2 = ZERO_INTEGER;
    while ( !i2.numG( len ))
    {
      final SubLObject pair = conses_high.assoc( i2, substr_positions, UNPROVIDED, UNPROVIDED );
      final SubLObject str = conses_high.second( pair );
      final SubLObject strlen = Sequences.length( str );
      if( i2.numE( len ) && i1.numL( i2 ) )
      {
        ans = ConsesLow.cons( Sequences.subseq( string, i1, i2 ), ans );
        i2 = ( i1 = Numbers.add( i2, ONE_INTEGER ) );
      }
      else if( NIL != str )
      {
        ans = ConsesLow.cons( Sequences.subseq( string, i1, i2 ), ans );
        ans = ConsesLow.cons( str, ans );
        i2 = ( i1 = Numbers.add( i2, strlen ) );
      }
      else
      {
        i2 = Numbers.add( i2, ONE_INTEGER );
      }
    }
    return Sequences.nreverse( ans );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 101961L)
  public static SubLObject first_name_first(final SubLObject string)
  {
    assert NIL != Types.stringp( string ) : string;
    SubLObject ans = string;
    SubLObject coordP = NIL;
    if( NIL == coordP )
    {
      SubLObject csome_list_var = $list105;
      SubLObject sub = NIL;
      sub = csome_list_var.first();
      while ( NIL == coordP && NIL != csome_list_var)
      {
        if( NIL != substringP( sub, string, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
        {
          coordP = T;
        }
        csome_list_var = csome_list_var.rest();
        sub = csome_list_var.first();
      }
    }
    if( NIL == coordP )
    {
      final SubLObject strings = string_tokenize( string, $list106, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( Sequences.length( strings ).numE( TWO_INTEGER ) )
      {
        ans = bunge( Sequences.reverse( strings ), UNPROVIDED );
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 102515L)
  public static SubLObject char_list_to_string(final SubLObject chars)
  {
    final SubLObject len = Sequences.length( chars );
    SubLObject i = ZERO_INTEGER;
    final SubLObject string = Strings.make_string( len, UNPROVIDED );
    SubLObject cdolist_list_var = chars;
    SubLObject c = NIL;
    c = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject char_to_use = c.isChar() ? c : Characters.CHAR_space;
      set_nth_char( i, string, char_to_use, NIL );
      i = Numbers.add( i, ONE_INTEGER );
      cdolist_list_var = cdolist_list_var.rest();
      c = cdolist_list_var.first();
    }
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 102824L)
  public static SubLObject string_to_char_list(final SubLObject string)
  {
    SubLObject char_list = NIL;
    SubLObject index;
    for( index = NIL, index = ZERO_INTEGER; !index.eql( Sequences.length( string ) ); index = Numbers.add( index, ONE_INTEGER ) )
    {
      char_list = ConsesLow.cons( Sequences.elt( string, index ), char_list );
    }
    return Sequences.nreverse( char_list );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 103072L)
  public static SubLObject count_chars_in_string(final SubLObject string, final SubLObject character)
  {
    return Sequences.count( character, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 103217L)
  public static SubLObject some_are_substringsP(final SubLObject stringlist, final SubLObject string, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQUALP );
    }
    SubLObject v_boolean = NIL;
    if( NIL == v_boolean )
    {
      SubLObject csome_list_var = stringlist;
      SubLObject s = NIL;
      s = csome_list_var.first();
      while ( NIL == v_boolean && NIL != csome_list_var)
      {
        if( NIL != substringP( s, string, test, UNPROVIDED, UNPROVIDED ) )
        {
          v_boolean = T;
        }
        csome_list_var = csome_list_var.rest();
        s = csome_list_var.first();
      }
    }
    return v_boolean;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 103505L)
  public static SubLObject substring_every_in_list(final SubLObject stringlist, final SubLObject string, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQUALP );
    }
    SubLObject failP = NIL;
    if( NIL == failP )
    {
      SubLObject csome_list_var = stringlist;
      SubLObject s = NIL;
      s = csome_list_var.first();
      while ( NIL == failP && NIL != csome_list_var)
      {
        if( NIL == substringP( s, string, test, UNPROVIDED, UNPROVIDED ) )
        {
          failP = T;
        }
        csome_list_var = csome_list_var.rest();
        s = csome_list_var.first();
      }
    }
    return makeBoolean( NIL == failP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 103819L)
  public static SubLObject target_character_found(final SubLObject v_char)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return conses_high.member( v_char, $target_characters$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 103900L)
  public static SubLObject separate_sentences(final SubLObject string, SubLObject sentence_breaks)
  {
    if( sentence_breaks == UNPROVIDED )
    {
      sentence_breaks = $list107;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = $target_characters$.currentBinding( thread );
    try
    {
      $target_characters$.bind( sentence_breaks, thread );
      SubLObject start;
      SubLObject index;
      for( start = NIL, index = NIL, start = ZERO_INTEGER, index = Sequences.position_if( Symbols.symbol_function( $sym108$TARGET_CHARACTER_FOUND ), string, Symbols.symbol_function( IDENTITY ), start,
          UNPROVIDED ); NIL != index && !index.eql( Sequences.length( string ) ); index = Sequences.position_if( Symbols.symbol_function( $sym108$TARGET_CHARACTER_FOUND ), string, Symbols.symbol_function( IDENTITY ),
              start, UNPROVIDED ) )
      {
        ans = ConsesLow.cons( trim_whitespace( Sequences.subseq( string, start, Numbers.add( index, ONE_INTEGER ) ) ), ans );
        start = Numbers.add( index, ONE_INTEGER );
      }
      ans = ConsesLow.cons( trim_whitespace( Sequences.subseq( string, start, UNPROVIDED ) ), ans );
    }
    finally
    {
      $target_characters$.rebind( _prev_bind_0, thread );
    }
    return Sequences.nreverse( Sequences.delete( $empty_string$.getGlobalValue(), ans, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 104554L)
  public static SubLObject extract_lines(final SubLObject string)
  {
    if( NIL != string )
    {
      final SubLObject lines = split_string( string, $list109 );
      SubLObject new_lines = NIL;
      SubLObject cdolist_list_var = lines;
      SubLObject line = NIL;
      line = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject new_line = Strings.string_trim( $list66, line );
        if( NIL == empty_string_p( new_line ) )
        {
          new_lines = ConsesLow.cons( new_line, new_lines );
        }
        cdolist_list_var = cdolist_list_var.rest();
        line = cdolist_list_var.first();
      }
      return Sequences.nreverse( new_lines );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 104966L)
  public static SubLObject collapse_lines(final SubLObject lines)
  {
    SubLObject size = ZERO_INTEGER;
    SubLObject cdolist_list_var = lines;
    SubLObject line = NIL;
    line = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      size = Numbers.add( size, Sequences.length( line ) );
      cdolist_list_var = cdolist_list_var.rest();
      line = cdolist_list_var.first();
    }
    size = Numbers.add( size, Sequences.length( lines ) );
    final SubLObject v_new = Strings.make_string( size, UNPROVIDED );
    SubLObject new_idx = ZERO_INTEGER;
    SubLObject cdolist_list_var2 = lines;
    SubLObject line2 = NIL;
    line2 = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      SubLObject cdotimes_end_var;
      SubLObject line_idx;
      for( cdotimes_end_var = Sequences.length( line2 ), line_idx = NIL, line_idx = ZERO_INTEGER; line_idx.numL( cdotimes_end_var ); line_idx = Numbers.add( line_idx, ONE_INTEGER ) )
      {
        set_nth_char( new_idx, v_new, Strings.sublisp_char( line2, line_idx ), UNPROVIDED );
        new_idx = Numbers.add( new_idx, ONE_INTEGER );
      }
      set_nth_char( new_idx, v_new, Characters.CHAR_newline, UNPROVIDED );
      new_idx = Numbers.add( new_idx, ONE_INTEGER );
      cdolist_list_var2 = cdolist_list_var2.rest();
      line2 = cdolist_list_var2.first();
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 105409L)
  public static SubLObject quotify_string(final SubLObject string)
  {
    final SubLObject quotables = $list110;
    SubLObject size;
    final SubLObject length = size = Sequences.length( string );
    SubLObject end_var_$34;
    SubLObject end_var;
    SubLObject char_num;
    SubLObject v_char;
    for( end_var = ( end_var_$34 = Sequences.length( string ) ), char_num = NIL, char_num = ZERO_INTEGER; !char_num.numGE( end_var_$34 ); char_num = number_utilities.f_1X( char_num ) )
    {
      v_char = Strings.sublisp_char( string, char_num );
      if( NIL != subl_promotions.memberP( v_char, quotables, UNPROVIDED, UNPROVIDED ) )
      {
        size = Numbers.add( size, ONE_INTEGER );
      }
    }
    final SubLObject ans = Strings.make_string( size, UNPROVIDED );
    SubLObject idx = ZERO_INTEGER;
    SubLObject end_var_$35;
    SubLObject end_var2;
    SubLObject char_num2;
    SubLObject v_char2;
    for( end_var2 = ( end_var_$35 = Sequences.length( string ) ), char_num2 = NIL, char_num2 = ZERO_INTEGER; !char_num2.numGE( end_var_$35 ); char_num2 = number_utilities.f_1X( char_num2 ) )
    {
      v_char2 = Strings.sublisp_char( string, char_num2 );
      if( NIL != subl_promotions.memberP( v_char2, quotables, UNPROVIDED, UNPROVIDED ) )
      {
        Strings.set_char( ans, idx, Characters.CHAR_backslash );
        idx = Numbers.add( idx, ONE_INTEGER );
      }
      set_nth_char( idx, ans, v_char2, UNPROVIDED );
      idx = Numbers.add( idx, ONE_INTEGER );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 105968L)
  public static SubLObject string_line_lengths(final SubLObject string)
  {
    final SubLObject string_length = Sequences.length( string );
    final SubLObject found_newlines = search_all( Strings.make_string( ONE_INTEGER, Characters.CHAR_newline ), string, UNPROVIDED, UNPROVIDED );
    SubLObject line_lengths = NIL;
    SubLObject last_pos = ZERO_INTEGER;
    SubLObject cdolist_list_var = found_newlines;
    SubLObject found_newline = NIL;
    found_newline = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      line_lengths = ConsesLow.cons( Numbers.subtract( found_newline, last_pos ), line_lengths );
      last_pos = Numbers.add( found_newline, ONE_INTEGER );
      cdolist_list_var = cdolist_list_var.rest();
      found_newline = cdolist_list_var.first();
    }
    line_lengths = ConsesLow.cons( Numbers.subtract( string_length, last_pos ), line_lengths );
    return Sequences.nreverse( line_lengths );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 106499L)
  public static SubLObject relevant_substrings(final SubLObject in_string)
  {
    SubLObject out_strings = NIL;
    SubLObject cur_string_list = NIL;
    SubLObject end_var_$36;
    SubLObject end_var;
    SubLObject char_num;
    SubLObject this_character;
    for( end_var = ( end_var_$36 = Sequences.length( in_string ) ), char_num = NIL, char_num = ZERO_INTEGER; !char_num.numGE( end_var_$36 ); char_num = number_utilities.f_1X( char_num ) )
    {
      this_character = Strings.sublisp_char( in_string, char_num );
      if( NIL != Characters.upper_case_p( this_character ) || NIL == Characters.alphanumericp( this_character ) )
      {
        if( NIL != cur_string_list )
        {
          out_strings = ConsesLow.cons( Functions.apply( Symbols.symbol_function( $sym74$CCONCATENATE ), Sequences.nreverse( cur_string_list ) ), out_strings );
          cur_string_list = NIL;
        }
        if( NIL != Characters.upper_case_p( this_character ) )
        {
          this_character = Characters.char_downcase( this_character );
        }
      }
      if( NIL != Characters.alphanumericp( this_character ) )
      {
        cur_string_list = ConsesLow.cons( Strings.make_string( ONE_INTEGER, this_character ), cur_string_list );
      }
    }
    if( NIL != cur_string_list )
    {
      out_strings = ConsesLow.cons( Functions.apply( Symbols.symbol_function( $sym74$CCONCATENATE ), Sequences.nreverse( cur_string_list ) ), out_strings );
      cur_string_list = NIL;
    }
    return Sequences.nreverse( out_strings );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 107563L)
  public static SubLObject make_valid_constant_name(final SubLObject in_string, SubLObject upcase_initial_letterP)
  {
    if( upcase_initial_letterP == UNPROVIDED )
    {
      upcase_initial_letterP = T;
    }
    SubLObject cur_string_list = NIL;
    SubLObject should_we_upcaseP = upcase_initial_letterP;
    SubLObject end_var_$37;
    SubLObject end_var;
    SubLObject char_num;
    SubLObject this_character;
    for( end_var = ( end_var_$37 = Sequences.length( in_string ) ), char_num = NIL, char_num = ZERO_INTEGER; !char_num.numGE( end_var_$37 ); char_num = number_utilities.f_1X( char_num ) )
    {
      this_character = Strings.sublisp_char( in_string, char_num );
      if( NIL != constant_completion_high.valid_constant_name_char_p( this_character ) )
      {
        if( NIL != Characters.alphanumericp( this_character ) )
        {
          if( NIL != should_we_upcaseP )
          {
            cur_string_list = ConsesLow.cons( Strings.string_upcase( Strings.make_string( ONE_INTEGER, this_character ), UNPROVIDED, UNPROVIDED ), cur_string_list );
            should_we_upcaseP = NIL;
          }
          else
          {
            cur_string_list = ConsesLow.cons( Strings.make_string( ONE_INTEGER, this_character ), cur_string_list );
          }
        }
        else
        {
          cur_string_list = ConsesLow.cons( Strings.make_string( ONE_INTEGER, this_character ), cur_string_list );
          should_we_upcaseP = T;
        }
      }
      else
      {
        should_we_upcaseP = T;
      }
    }
    return Functions.apply( Symbols.symbol_function( $sym74$CCONCATENATE ), Sequences.nreverse( cur_string_list ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 108715L)
  public static SubLObject nl_string_tokenize(final SubLObject in_string, SubLObject break_list, SubLObject embed_list, SubLObject include_stopsP, SubLObject ignore_empty_stringsP, SubLObject quote_chars,
      SubLObject break_list_to_return)
  {
    if( break_list == UNPROVIDED )
    {
      break_list = $whitespace_chars$.getGlobalValue();
    }
    if( embed_list == UNPROVIDED )
    {
      embed_list = NIL;
    }
    if( include_stopsP == UNPROVIDED )
    {
      include_stopsP = NIL;
    }
    if( ignore_empty_stringsP == UNPROVIDED )
    {
      ignore_empty_stringsP = NIL;
    }
    if( quote_chars == UNPROVIDED )
    {
      quote_chars = NIL;
    }
    if( break_list_to_return == UNPROVIDED )
    {
      break_list_to_return = $grammatical_punctuation_chars$.getGlobalValue();
    }
    return string_tokenize_int( in_string, break_list, break_list_to_return, embed_list, include_stopsP, ignore_empty_stringsP, quote_chars );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 109322L)
  public static SubLObject string_tokenize(final SubLObject in_string, SubLObject break_list, SubLObject embed_list, SubLObject include_stopsP, SubLObject ignore_empty_stringsP, SubLObject quote_chars,
      SubLObject break_list_to_return)
  {
    if( break_list == UNPROVIDED )
    {
      break_list = $whitespace_chars$.getGlobalValue();
    }
    if( embed_list == UNPROVIDED )
    {
      embed_list = NIL;
    }
    if( include_stopsP == UNPROVIDED )
    {
      include_stopsP = NIL;
    }
    if( ignore_empty_stringsP == UNPROVIDED )
    {
      ignore_empty_stringsP = NIL;
    }
    if( quote_chars == UNPROVIDED )
    {
      quote_chars = NIL;
    }
    if( break_list_to_return == UNPROVIDED )
    {
      break_list_to_return = NIL;
    }
    return string_tokenize_int( in_string, break_list, break_list_to_return, embed_list, include_stopsP, ignore_empty_stringsP, quote_chars );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 109694L)
  public static SubLObject string_tokenize_int(final SubLObject in_string, SubLObject break_list, SubLObject break_list_to_return, SubLObject embed_list, SubLObject include_stopsP, SubLObject ignore_empty_stringsP,
      SubLObject quote_chars)
  {
    if( break_list == UNPROVIDED )
    {
      break_list = $whitespace_chars$.getGlobalValue();
    }
    if( break_list_to_return == UNPROVIDED )
    {
      break_list_to_return = NIL;
    }
    if( embed_list == UNPROVIDED )
    {
      embed_list = NIL;
    }
    if( include_stopsP == UNPROVIDED )
    {
      include_stopsP = NIL;
    }
    if( ignore_empty_stringsP == UNPROVIDED )
    {
      ignore_empty_stringsP = NIL;
    }
    if( quote_chars == UNPROVIDED )
    {
      quote_chars = NIL;
    }
    if( $kw111$DEFAULT.eql( break_list ) )
    {
      break_list = $whitespace_chars$.getGlobalValue();
    }
    SubLObject out_string_list = NIL;
    SubLObject cur_string = $empty_string$.getGlobalValue();
    SubLObject cur_char_list = NIL;
    SubLObject break_satisfiedP = NIL;
    SubLObject this_quotedP = NIL;
    final SubLObject complete_break_list = Sequences.cconcatenate( break_list_to_return, break_list );
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
    for( end_var = ( end_var_$38 = Sequences.length( in_string ) ), pos_now = NIL, pos_now = ZERO_INTEGER; !pos_now.numGE( end_var_$38 ); pos_now = number_utilities.f_1X( pos_now ) )
    {
      this_character = Strings.sublisp_char( in_string, pos_now );
      if( NIL != this_quotedP )
      {
        this_quotedP = NIL;
        cur_char_list = ConsesLow.cons( this_character, cur_char_list );
      }
      else if( NIL != conses_high.member( this_character, quote_chars, UNPROVIDED, UNPROVIDED ) )
      {
        this_quotedP = T;
        cur_char_list = ConsesLow.cons( this_character, cur_char_list );
      }
      else
      {
        cdolist_list_var = embed_list;
        this_embed = NIL;
        this_embed = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          this_embed_start = first_char( this_embed.first() );
          this_embed_end = last_char( conses_high.second( this_embed ) );
          if( this_character.eql( this_embed_start ) )
          {
            pos_find = NIL;
            quotedP = NIL;
            doneP = NIL;
            pos_find = number_utilities.f_1X( pos_now );
            quotedP = NIL;
            for( doneP = NIL; NIL == doneP && NIL == list_utilities.lengthE( in_string, pos_find, UNPROVIDED ); pos_find = number_utilities.f_1X( pos_find ) //, quotedP = quotedP, doneP = doneP
            		)
            {
              cur_char_list = ConsesLow.cons( this_character, cur_char_list );
              pos_now = pos_find;
              this_character = Strings.sublisp_char( in_string, pos_now );
              if( NIL != quotedP )
              {
                quotedP = NIL;
              }
              else if( this_character.eql( this_embed_end ) )
              {
                doneP = T;
              }
              else if( NIL != conses_high.member( this_character, quote_chars, UNPROVIDED, UNPROVIDED ) )
              {
                quotedP = T;
              }
            }
          }
          cdolist_list_var = cdolist_list_var.rest();
          this_embed = cdolist_list_var.first();
        }
        found_a_breakP = NIL;
        if( NIL == found_a_breakP )
        {
          csome_list_var = complete_break_list;
          this_break = NIL;
          this_break = csome_list_var.first();
          while ( NIL == found_a_breakP && NIL != csome_list_var)
          {
            this_break_length = string_tokenize_break_length( this_break );
            post_break_pos = Numbers.add( pos_now, this_break_length );
            if( this_break_length.isPositive() && NIL != list_utilities.lengthGE( in_string, post_break_pos, UNPROVIDED ) && NIL != string_tokenize_break_matchP( in_string, this_break, pos_now ) )
            {
              found_a_breakP = T;
              cur_string = char_list_to_string( Sequences.nreverse( cur_char_list ) );
              if( NIL == ignore_empty_stringsP || NIL == empty_string_p( cur_string ) )
              {
                out_string_list = ConsesLow.cons( cur_string, out_string_list );
              }
              cur_char_list = NIL;
              if( NIL != include_stopsP || NIL != conses_high.member( this_break, break_list_to_return, UNPROVIDED, UNPROVIDED ) )
              {
                out_string_list = ConsesLow.cons( format_nil.format_nil_a( this_break ), out_string_list );
              }
              pos_now = number_utilities.f_1_( post_break_pos );
              this_character = Strings.sublisp_char( in_string, pos_now );
              break_satisfiedP = T;
            }
            csome_list_var = csome_list_var.rest();
            this_break = csome_list_var.first();
          }
        }
        if( NIL != break_satisfiedP )
        {
          break_satisfiedP = NIL;
        }
        else
        {
          cur_char_list = ConsesLow.cons( this_character, cur_char_list );
        }
      }
    }
    cur_string = char_list_to_string( Sequences.nreverse( cur_char_list ) );
    if( NIL == ignore_empty_stringsP || NIL == empty_string_p( cur_string ) )
    {
      out_string_list = ConsesLow.cons( cur_string, out_string_list );
    }
    if( NIL == out_string_list && NIL == ignore_empty_stringsP )
    {
      out_string_list = ConsesLow.list( $empty_string$.getGlobalValue() );
    }
    return Sequences.nreverse( out_string_list );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 113571L)
  public static SubLObject string_tokenize_break_length(final SubLObject v_break)
  {
    if( v_break.isChar() )
    {
      return ONE_INTEGER;
    }
    return Sequences.length( v_break );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 113696L)
  public static SubLObject string_tokenize_break_matchP(final SubLObject in_string, final SubLObject v_break, final SubLObject pos)
  {
    if( v_break.isChar() )
    {
      return Characters.charE( Strings.sublisp_char( in_string, pos ), v_break );
    }
    return substring_matchP( in_string, v_break, pos, $sym112$CHAR_ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 113964L)
  public static SubLObject listify_string(final SubLObject string, SubLObject break_chars)
  {
    if( break_chars == UNPROVIDED )
    {
      break_chars = $whitespace_chars$.getGlobalValue();
    }
    SubLObject next_char_quotedP = NIL;
    SubLObject inside_stringP = NIL;
    SubLObject had_negative_parensP = NIL;
    SubLObject paren_depth = ZERO_INTEGER;
    SubLObject char_list = NIL;
    SubLObject error_list = NIL;
    SubLObject out_list = NIL;
    SubLObject end_var_$39;
    SubLObject end_var;
    SubLObject char_num;
    SubLObject this_char;
    for( end_var = ( end_var_$39 = Sequences.length( string ) ), char_num = NIL, char_num = ZERO_INTEGER; !char_num.numGE( end_var_$39 ); char_num = number_utilities.f_1X( char_num ) )
    {
      this_char = Strings.sublisp_char( string, char_num );
      if( T.equal( next_char_quotedP ) )
      {
        char_list = ConsesLow.cons( this_char, char_list );
        next_char_quotedP = NIL;
      }
      else if( this_char.eql( Characters.CHAR_backslash ) )
      {
        next_char_quotedP = T;
      }
      else if( T.equal( inside_stringP ) )
      {
        char_list = ConsesLow.cons( this_char, char_list );
        if( this_char.eql( Characters.CHAR_quotation ) )
        {
          inside_stringP = NIL;
        }
      }
      else if( this_char.eql( Characters.CHAR_quotation ) )
      {
        char_list = ConsesLow.cons( this_char, char_list );
        inside_stringP = T;
      }
      else if( this_char.eql( Characters.CHAR_lparen ) )
      {
        paren_depth = Numbers.add( paren_depth, ONE_INTEGER );
        if( NIL != char_list )
        {
          out_list = list_utilities.push_on_car( out_list, char_list_to_string( Sequences.nreverse( char_list ) ) );
          char_list = NIL;
        }
        out_list = ConsesLow.cons( NIL, out_list );
      }
      else if( this_char.eql( Characters.CHAR_rparen ) )
      {
        paren_depth = Numbers.subtract( paren_depth, ONE_INTEGER );
        if( ZERO_INTEGER.numG( paren_depth ) )
        {
          had_negative_parensP = T;
        }
        if( NIL != char_list )
        {
          out_list = list_utilities.push_on_car( out_list, char_list_to_string( Sequences.nreverse( char_list ) ) );
          char_list = NIL;
        }
        out_list = list_utilities.pop_and_reverse_car_and_push_on_cadr( out_list );
      }
      else if( NIL != subl_promotions.memberP( this_char, break_chars, UNPROVIDED, UNPROVIDED ) )
      {
        if( NIL != char_list )
        {
          out_list = list_utilities.push_on_car( out_list, char_list_to_string( Sequences.nreverse( char_list ) ) );
          char_list = NIL;
        }
      }
      else
      {
        char_list = ConsesLow.cons( this_char, char_list );
      }
    }
    if( NIL != char_list )
    {
      out_list = list_utilities.push_on_car( out_list, char_list_to_string( Sequences.nreverse( char_list ) ) );
      char_list = NIL;
    }
    if( ZERO_INTEGER.numL( paren_depth ) )
    {
      error_list = ConsesLow.cons( $str113$Unmatched_open_parenthesis, error_list );
    }
    else if( NIL != had_negative_parensP || ZERO_INTEGER.numG( paren_depth ) )
    {
      error_list = ConsesLow.cons( $str114$Unmatched_close_parenthesis, error_list );
    }
    if( NIL != error_list )
    {
      return Values.values( NIL, error_list );
    }
    return Values.values( Sequences.nreverse( out_list.first() ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 116424L)
  public static SubLObject all_parens_matchedP(final SubLObject string, SubLObject start, SubLObject end)
  {
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    if( end == UNPROVIDED )
    {
      end = NIL;
    }
    SubLObject some_unmatched_parenthesesP = NIL;
    SubLObject paren_depth = ZERO_INTEGER;
    SubLObject within_stringP = NIL;
    SubLObject just_saw_an_escape_charP = NIL;
    final SubLObject end_var = ( NIL != end ) ? end : Sequences.length( string );
    if( NIL == some_unmatched_parenthesesP )
    {
      SubLObject end_var_$40;
      SubLObject char_num;
      SubLObject pcase_var;
      SubLObject v_char;
      for( end_var_$40 = end_var, char_num = NIL, char_num = start; NIL == some_unmatched_parenthesesP && !char_num.numGE( end_var_$40 ); char_num = number_utilities.f_1X( char_num ) )
      {
        v_char = ( pcase_var = Strings.sublisp_char( string, char_num ) );
        if( pcase_var.eql( Characters.CHAR_lparen ) )
        {
          if( NIL == within_stringP )
          {
            paren_depth = Numbers.add( paren_depth, ONE_INTEGER );
          }
          just_saw_an_escape_charP = NIL;
        }
        else if( pcase_var.eql( Characters.CHAR_rparen ) )
        {
          if( NIL == within_stringP )
          {
            if( paren_depth.isPositive() )
            {
              paren_depth = Numbers.subtract( paren_depth, ONE_INTEGER );
            }
            else
            {
              some_unmatched_parenthesesP = T;
            }
          }
          just_saw_an_escape_charP = NIL;
        }
        else if( pcase_var.eql( Characters.CHAR_quotation ) )
        {
          if( NIL == just_saw_an_escape_charP )
          {
            within_stringP = makeBoolean( NIL == within_stringP );
          }
          just_saw_an_escape_charP = NIL;
        }
        else if( pcase_var.eql( Characters.CHAR_backslash ) )
        {
          if( NIL != just_saw_an_escape_charP )
          {
            just_saw_an_escape_charP = NIL;
          }
          else
          {
            just_saw_an_escape_charP = T;
          }
        }
        else
        {
          just_saw_an_escape_charP = NIL;
        }
      }
    }
    if( !paren_depth.isZero() )
    {
      some_unmatched_parenthesesP = T;
    }
    return makeBoolean( NIL == some_unmatched_parenthesesP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 117586L)
  public static SubLObject unmatched_parentheses(final SubLObject string, SubLObject start, SubLObject end)
  {
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    if( end == UNPROVIDED )
    {
      end = NIL;
    }
    SubLObject unmatched_parentheses = NIL;
    final SubLObject paren_stack = stacks.create_stack();
    SubLObject within_stringP = NIL;
    SubLObject just_saw_an_escape_charP = NIL;
    SubLObject end_var_$41;
    SubLObject end_var;
    SubLObject char_num;
    SubLObject pcase_var;
    SubLObject v_char;
    for( end_var = ( end_var_$41 = ( ( NIL != end ) ? end : Sequences.length( string ) ) ), char_num = NIL, char_num = start; !char_num.numGE( end_var_$41 ); char_num = number_utilities.f_1X( char_num ) )
    {
      v_char = ( pcase_var = Strings.sublisp_char( string, char_num ) );
      if( pcase_var.eql( Characters.CHAR_lparen ) )
      {
        if( NIL == within_stringP )
        {
          stacks.stack_push( char_num, paren_stack );
        }
        just_saw_an_escape_charP = NIL;
      }
      else if( pcase_var.eql( Characters.CHAR_rparen ) )
      {
        if( NIL == within_stringP )
        {
          if( NIL == stacks.stack_empty_p( paren_stack ) )
          {
            stacks.stack_pop( paren_stack );
          }
          else
          {
            unmatched_parentheses = ConsesLow.cons( char_num, unmatched_parentheses );
          }
        }
        just_saw_an_escape_charP = NIL;
      }
      else if( pcase_var.eql( Characters.CHAR_quotation ) )
      {
        if( NIL == just_saw_an_escape_charP )
        {
          within_stringP = makeBoolean( NIL == within_stringP );
        }
        just_saw_an_escape_charP = NIL;
      }
      else if( pcase_var.eql( Characters.CHAR_backslash ) )
      {
        if( NIL != just_saw_an_escape_charP )
        {
          just_saw_an_escape_charP = NIL;
        }
        else
        {
          just_saw_an_escape_charP = T;
        }
      }
      else
      {
        just_saw_an_escape_charP = NIL;
      }
    }
    while ( NIL == stacks.stack_empty_p( paren_stack ))
    {
      unmatched_parentheses = ConsesLow.cons( stacks.stack_pop( paren_stack ), unmatched_parentheses );
    }
    return Sequences.nreverse( unmatched_parentheses );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 118842L)
  public static SubLObject unmatched_parentheses_terse_hint(final SubLObject string, SubLObject start, SubLObject end)
  {
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    if( end == UNPROVIDED )
    {
      end = NIL;
    }
    final SubLObject positions = unmatched_parentheses( string, start, end );
    final SubLObject hint = Strings.make_string( Sequences.length( positions ), UNPROVIDED );
    SubLObject list_var = NIL;
    SubLObject position = NIL;
    SubLObject index = NIL;
    list_var = positions;
    position = list_var.first();
    for( index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), position = list_var.first(), index = Numbers.add( ONE_INTEGER, index ) )
    {
      Strings.set_char( hint, index, Strings.sublisp_char( string, position ) );
    }
    return hint;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 119151L)
  public static SubLObject byte_string_p(final SubLObject v_object)
  {
    if( v_object.isString() )
    {
      final SubLObject number = string_to_integer( v_object );
      return makeBoolean( number.numGE( ZERO_INTEGER ) && number.numLE( $int115$255 ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 119502L)
  public static SubLObject ip_address_p(final SubLObject v_object)
  {
    if( !v_object.isString() )
    {
      return NIL;
    }
    final SubLObject byte_strings = string_tokenize( v_object, $list116, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL == list_utilities.lengthE( byte_strings, FOUR_INTEGER, UNPROVIDED ) )
    {
      return NIL;
    }
    SubLObject cdolist_list_var = byte_strings;
    SubLObject byte_string = NIL;
    byte_string = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == byte_string_p( byte_string ) )
      {
        return NIL;
      }
      cdolist_list_var = cdolist_list_var.rest();
      byte_string = cdolist_list_var.first();
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 119937L)
  public static SubLObject ip_addressL(final SubLObject ip_address1, final SubLObject ip_address2)
  {
    final SubLObject ip_address1_strings = string_tokenize( ip_address1, $list116, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject ip_address2_strings = string_tokenize( ip_address2, $list116, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL == list_utilities.lengthE( ip_address1_strings, FOUR_INTEGER, UNPROVIDED ) )
    {
      return NIL;
    }
    if( NIL == list_utilities.lengthE( ip_address2_strings, FOUR_INTEGER, UNPROVIDED ) )
    {
      return T;
    }
    SubLObject ip_address1_byte_string = NIL;
    SubLObject ip_address1_byte_string_$42 = NIL;
    SubLObject ip_address2_byte_string = NIL;
    SubLObject ip_address2_byte_string_$43 = NIL;
    ip_address1_byte_string = ip_address1_strings;
    ip_address1_byte_string_$42 = ip_address1_byte_string.first();
    ip_address2_byte_string = ip_address2_strings;
    ip_address2_byte_string_$43 = ip_address2_byte_string.first();
    while ( NIL != ip_address2_byte_string || NIL != ip_address1_byte_string)
    {
      if( NIL != integer_stringL( ip_address1_byte_string_$42, ip_address2_byte_string_$43 ) )
      {
        return T;
      }
      if( !ip_address1_byte_string_$42.equal( ip_address2_byte_string_$43 ) )
      {
        return NIL;
      }
      ip_address1_byte_string = ip_address1_byte_string.rest();
      ip_address1_byte_string_$42 = ip_address1_byte_string.first();
      ip_address2_byte_string = ip_address2_byte_string.rest();
      ip_address2_byte_string_$43 = ip_address2_byte_string.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 121033L)
  public static SubLObject get_trigraph_metric()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $trigraph_metric$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 121092L)
  public static SubLObject set_trigraph_metric(SubLObject n)
  {
    if( n == UNPROVIDED )
    {
      n = $float117$0_8;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    $trigraph_metric$.setDynamicValue( ( n.isNumber() && n.numG( ZERO_INTEGER ) && n.numLE( ONE_INTEGER ) ) ? n : $float117$0_8, thread );
    return $trigraph_metric$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 121272L)
  public static SubLObject get_trigraph_table()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    if( NIL == ans )
    {
      SubLObject csome_list_var = $trigraph_tables$.getDynamicValue( thread );
      SubLObject table = NIL;
      table = csome_list_var.first();
      while ( NIL == ans && NIL != csome_list_var)
      {
        if( NIL != Hashtables.gethash( $kw118$FREE, table, UNPROVIDED ) )
        {
          Hashtables.sethash( $kw118$FREE, table, NIL );
          ans = table;
        }
        csome_list_var = csome_list_var.rest();
        table = csome_list_var.first();
      }
    }
    if( NIL == ans )
    {
      final SubLObject v_new = Hashtables.make_hash_table( $int119$50, UNPROVIDED, UNPROVIDED );
      $trigraph_tables$.setDynamicValue( ConsesLow.cons( v_new, $trigraph_tables$.getDynamicValue( thread ) ), thread );
      ans = v_new;
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 121573L)
  public static SubLObject free_trigraph_table(final SubLObject table)
  {
    if( table.isHashtable() )
    {
      Hashtables.clrhash( table );
      Hashtables.sethash( $kw118$FREE, table, T );
      return table;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 121726L)
  public static SubLObject plural_length_to_subtract(final SubLObject string)
  {
    final SubLObject len = Sequences.length( string );
    if( len.numLE( TWO_INTEGER ) )
    {
      return ZERO_INTEGER;
    }
    if( Sequences.subseq( string, Numbers.subtract( len, TWO_INTEGER ), len ).equalp( $str120$es ) )
    {
      return TWO_INTEGER;
    }
    if( Sequences.subseq( string, Numbers.subtract( len, ONE_INTEGER ), len ).equalp( $str121$s ) )
    {
      return ONE_INTEGER;
    }
    return ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 121983L)
  public static SubLObject update_string1_table(final SubLObject trigraph_code, final SubLObject table)
  {
    SubLObject val = Hashtables.gethash( trigraph_code, table, UNPROVIDED );
    if( val.isInteger() )
    {
      val = Numbers.add( val, ONE_INTEGER );
    }
    else
    {
      val = ONE_INTEGER;
    }
    Hashtables.sethash( trigraph_code, table, val );
    return trigraph_code;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 122205L)
  public static SubLObject make_trigraph_integer_code(final SubLObject code0, final SubLObject code1, final SubLObject code2)
  {
    return Numbers.add( code0, Numbers.multiply( $int15$1000, code1 ), Numbers.multiply( $int122$1000000, code2 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 122313L)
  public static SubLObject string_trigraph_match_p(final SubLObject string1, final SubLObject string2, SubLObject case_sensitiveP, SubLObject metric)
  {
    if( case_sensitiveP == UNPROVIDED )
    {
      case_sensitiveP = NIL;
    }
    if( metric == UNPROVIDED )
    {
      metric = get_trigraph_metric();
    }
    if( !string1.isString() || !string2.isString() )
    {
      return NIL;
    }
    if( !metric.isNumber() )
    {
      set_trigraph_metric( UNPROVIDED );
    }
    final SubLObject table = get_trigraph_table();
    final SubLObject l1 = Numbers.subtract( Sequences.length( string1 ), plural_length_to_subtract( string1 ) );
    final SubLObject l2 = Numbers.subtract( Sequences.length( string2 ), plural_length_to_subtract( string2 ) );
    SubLObject s1_count = ZERO_INTEGER;
    SubLObject s2_count = ZERO_INTEGER;
    SubLObject intersection_count = ZERO_INTEGER;
    SubLObject ch_count = ZERO_INTEGER;
    SubLObject code0 = ZERO_INTEGER;
    SubLObject code2 = ZERO_INTEGER;
    SubLObject code3 = ZERO_INTEGER;
    SubLObject i;
    SubLObject ch;
    SubLObject pcase_var;
    for( i = NIL, i = ZERO_INTEGER; i.numL( l1 ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      ch = ( ( NIL != case_sensitiveP ) ? Strings.sublisp_char( string1, i ) : Characters.char_downcase( Strings.sublisp_char( string1, i ) ) );
      if( NIL != Characters.alphanumericp( ch ) )
      {
        pcase_var = ch_count;
        if( pcase_var.eql( ZERO_INTEGER ) )
        {
          code0 = Characters.char_code( ch );
          ch_count = Numbers.add( ch_count, ONE_INTEGER );
        }
        else if( pcase_var.eql( ONE_INTEGER ) )
        {
          code2 = Characters.char_code( ch );
          ch_count = Numbers.add( ch_count, ONE_INTEGER );
        }
        else if( pcase_var.eql( TWO_INTEGER ) )
        {
          code3 = Characters.char_code( ch );
          update_string1_table( make_trigraph_integer_code( code0, code2, code3 ), table );
          s1_count = Numbers.add( s1_count, ONE_INTEGER );
          ch_count = Numbers.add( ch_count, ONE_INTEGER );
        }
        else
        {
          code0 = code2;
          code2 = code3;
          code3 = Characters.char_code( ch );
          update_string1_table( make_trigraph_integer_code( code0, code2, code3 ), table );
          s1_count = Numbers.add( s1_count, ONE_INTEGER );
          ch_count = Numbers.add( ch_count, ONE_INTEGER );
        }
      }
    }
    if( ch_count.numGE( ZERO_INTEGER ) && ch_count.numL( THREE_INTEGER ) )
    {
      update_string1_table( make_trigraph_integer_code( code0, code2, code3 ), table );
      s1_count = Numbers.add( s1_count, ONE_INTEGER );
    }
    ch_count = ZERO_INTEGER;
    code0 = ZERO_INTEGER;
    code2 = ZERO_INTEGER;
    code3 = ZERO_INTEGER;
    SubLObject trigraph_code;
    SubLObject val;
    for( i = NIL, i = ZERO_INTEGER; i.numL( l2 ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      ch = ( ( NIL != case_sensitiveP ) ? Strings.sublisp_char( string2, i ) : Characters.char_downcase( Strings.sublisp_char( string2, i ) ) );
      if( NIL != Characters.alphanumericp( ch ) )
      {
        pcase_var = ch_count;
        if( pcase_var.eql( ZERO_INTEGER ) )
        {
          code0 = Characters.char_code( ch );
          ch_count = Numbers.add( ch_count, ONE_INTEGER );
        }
        else if( pcase_var.eql( ONE_INTEGER ) )
        {
          code2 = Characters.char_code( ch );
          ch_count = Numbers.add( ch_count, ONE_INTEGER );
        }
        else if( pcase_var.eql( TWO_INTEGER ) )
        {
          code3 = Characters.char_code( ch );
          trigraph_code = make_trigraph_integer_code( code0, code2, code3 );
          val = Hashtables.gethash( trigraph_code, table, UNPROVIDED );
          if( val.isInteger() && val.numG( ZERO_INTEGER ) )
          {
            intersection_count = Numbers.add( intersection_count, ONE_INTEGER );
            Hashtables.sethash( trigraph_code, table, Numbers.subtract( val, ONE_INTEGER ) );
          }
          s2_count = Numbers.add( s2_count, ONE_INTEGER );
          ch_count = Numbers.add( ch_count, ONE_INTEGER );
        }
        else
        {
          code0 = code2;
          code2 = code3;
          code3 = Characters.char_code( ch );
          trigraph_code = make_trigraph_integer_code( code0, code2, code3 );
          val = Hashtables.gethash( trigraph_code, table, UNPROVIDED );
          if( val.isInteger() && val.numG( ZERO_INTEGER ) )
          {
            intersection_count = Numbers.add( intersection_count, ONE_INTEGER );
            Hashtables.sethash( trigraph_code, table, Numbers.subtract( val, ONE_INTEGER ) );
          }
          s2_count = Numbers.add( s2_count, ONE_INTEGER );
          ch_count = Numbers.add( ch_count, ONE_INTEGER );
        }
      }
    }
    if( ch_count.numGE( ZERO_INTEGER ) && ch_count.numL( THREE_INTEGER ) )
    {
      final SubLObject trigraph_code2 = make_trigraph_integer_code( code0, code2, code3 );
      final SubLObject val2 = Hashtables.gethash( trigraph_code2, table, UNPROVIDED );
      if( val2.isInteger() && val2.numG( ZERO_INTEGER ) )
      {
        intersection_count = Numbers.add( intersection_count, ONE_INTEGER );
        Hashtables.sethash( trigraph_code2, table, Numbers.subtract( val2, ONE_INTEGER ) );
      }
      s2_count = Numbers.add( s2_count, ONE_INTEGER );
    }
    free_trigraph_table( table );
    return makeBoolean( s1_count.numG( ZERO_INTEGER ) && s2_count.numG( ZERO_INTEGER ) && Numbers.divide( intersection_count, s1_count ).numGE( metric ) && Numbers.divide( intersection_count, s2_count ).numGE(
        metric ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 125222L)
  public static SubLObject stringify_terms(final SubLObject terms, SubLObject separator, SubLObject last_separator)
  {
    if( separator == UNPROVIDED )
    {
      separator = $str18$_;
    }
    if( last_separator == UNPROVIDED )
    {
      last_separator = separator;
    }
    return stringify_items( terms, Symbols.symbol_function( $sym123$FORT_PRINT_NAME ), separator, last_separator );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 125487L)
  public static SubLObject fort_print_name(final SubLObject fort)
  {
    if( NIL != nart_handles.nart_p( fort ) )
    {
      return str( narts_high.nart_hl_formula( fort ) );
    }
    if( NIL != constant_handles.constant_p( fort ) )
    {
      return constants_high.constant_name( fort );
    }
    return str( fort );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 125680L)
  public static SubLObject stringify_items(final SubLObject items, SubLObject accessor, SubLObject separator, SubLObject last_separator)
  {
    if( accessor == UNPROVIDED )
    {
      accessor = Symbols.symbol_function( $sym124$STR_BY_TYPE );
    }
    if( separator == UNPROVIDED )
    {
      separator = $str18$_;
    }
    if( last_separator == UNPROVIDED )
    {
      last_separator = separator;
    }
    if( NIL == items )
    {
      return $empty_string$.getGlobalValue();
    }
    if( NIL != list_utilities.singletonP( items ) )
    {
      return str_by_type( Functions.funcall( accessor, items.first() ) );
    }
    final SubLObject names = Mapping.mapcar( Symbols.symbol_function( $sym124$STR_BY_TYPE ), Mapping.mapcar( accessor, Sequences.reverse( items ) ) );
    SubLObject result = Sequences.cconcatenate( conses_high.second( names ), new SubLObject[] { last_separator, names.first()
    } );
    SubLObject cdolist_list_var = conses_high.cddr( names );
    SubLObject name = NIL;
    name = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      result = Sequences.cconcatenate( name, new SubLObject[] { separator, result
      } );
      cdolist_list_var = cdolist_list_var.rest();
      name = cdolist_list_var.first();
    }
    return PrintLow.format( NIL, result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 126191L)
  public static SubLObject str_by_type(final SubLObject v_object)
  {
    if( v_object.isString() )
    {
      return v_object;
    }
    if( NIL != constant_handles.constant_p( v_object ) )
    {
      return constants_high.constant_name( v_object );
    }
    return str( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 126347L)
  public static SubLObject add_line(final SubLObject line, final SubLObject text, SubLObject nl_margin, SubLObject new_line)
  {
    if( nl_margin == UNPROVIDED )
    {
      nl_margin = $empty_string$.getGlobalValue();
    }
    if( new_line == UNPROVIDED )
    {
      new_line = $str125$__;
    }
    if( NIL != empty_string_p( text ) )
    {
      return line;
    }
    return Sequences.cconcatenate( text, new SubLObject[] { new_line, nl_margin, line
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 126873L)
  public static SubLObject cyclify_status_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 126873L)
  public static SubLObject cyclify_status_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $cyclify_status_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 126873L)
  public static SubLObject cyclify_status_out_string_list(final SubLObject v_object)
  {
    assert NIL != cyclify_status_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 126873L)
  public static SubLObject cyclify_status_references_added(final SubLObject v_object)
  {
    assert NIL != cyclify_status_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 126873L)
  public static SubLObject cyclify_status_inside_quoteP(final SubLObject v_object)
  {
    assert NIL != cyclify_status_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 126873L)
  public static SubLObject cyclify_status_inside_el_var_nameP(final SubLObject v_object)
  {
    assert NIL != cyclify_status_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 126873L)
  public static SubLObject cyclify_status_already_cyclifiedP(final SubLObject v_object)
  {
    assert NIL != cyclify_status_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 126873L)
  public static SubLObject cyclify_status_escapeP(final SubLObject v_object)
  {
    assert NIL != cyclify_status_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 126873L)
  public static SubLObject cyclify_status_inside_subl_quote_fnP(final SubLObject v_object)
  {
    assert NIL != cyclify_status_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 126873L)
  public static SubLObject cyclify_status_inside_expand_subl_fnP(final SubLObject v_object)
  {
    assert NIL != cyclify_status_p( v_object ) : v_object;
    return v_object.getField9();
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 126873L)
  public static SubLObject cyclify_status_inside_expand_subl_fn_arg1P(final SubLObject v_object)
  {
    assert NIL != cyclify_status_p( v_object ) : v_object;
    return v_object.getField10();
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 126873L)
  public static SubLObject cyclify_status_inside_expand_subl_fn_arg2P(final SubLObject v_object)
  {
    assert NIL != cyclify_status_p( v_object ) : v_object;
    return v_object.getField11();
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 126873L)
  public static SubLObject cyclify_status_immediately_following_parenP(final SubLObject v_object)
  {
    assert NIL != cyclify_status_p( v_object ) : v_object;
    return v_object.getField12();
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 126873L)
  public static SubLObject cyclify_status_paren_count(final SubLObject v_object)
  {
    assert NIL != cyclify_status_p( v_object ) : v_object;
    return v_object.getField13();
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 126873L)
  public static SubLObject _csetf_cyclify_status_out_string_list(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != cyclify_status_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 126873L)
  public static SubLObject _csetf_cyclify_status_references_added(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != cyclify_status_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 126873L)
  public static SubLObject _csetf_cyclify_status_inside_quoteP(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != cyclify_status_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 126873L)
  public static SubLObject _csetf_cyclify_status_inside_el_var_nameP(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != cyclify_status_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 126873L)
  public static SubLObject _csetf_cyclify_status_already_cyclifiedP(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != cyclify_status_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 126873L)
  public static SubLObject _csetf_cyclify_status_escapeP(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != cyclify_status_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 126873L)
  public static SubLObject _csetf_cyclify_status_inside_subl_quote_fnP(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != cyclify_status_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 126873L)
  public static SubLObject _csetf_cyclify_status_inside_expand_subl_fnP(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != cyclify_status_p( v_object ) : v_object;
    return v_object.setField9( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 126873L)
  public static SubLObject _csetf_cyclify_status_inside_expand_subl_fn_arg1P(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != cyclify_status_p( v_object ) : v_object;
    return v_object.setField10( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 126873L)
  public static SubLObject _csetf_cyclify_status_inside_expand_subl_fn_arg2P(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != cyclify_status_p( v_object ) : v_object;
    return v_object.setField11( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 126873L)
  public static SubLObject _csetf_cyclify_status_immediately_following_parenP(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != cyclify_status_p( v_object ) : v_object;
    return v_object.setField12( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 126873L)
  public static SubLObject _csetf_cyclify_status_paren_count(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != cyclify_status_p( v_object ) : v_object;
    return v_object.setField13( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 126873L)
  public static SubLObject make_cyclify_status(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $cyclify_status_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw162$OUT_STRING_LIST ) )
      {
        _csetf_cyclify_status_out_string_list( v_new, current_value );
      }
      else if( pcase_var.eql( $kw163$REFERENCES_ADDED ) )
      {
        _csetf_cyclify_status_references_added( v_new, current_value );
      }
      else if( pcase_var.eql( $kw164$INSIDE_QUOTE_ ) )
      {
        _csetf_cyclify_status_inside_quoteP( v_new, current_value );
      }
      else if( pcase_var.eql( $kw165$INSIDE_EL_VAR_NAME_ ) )
      {
        _csetf_cyclify_status_inside_el_var_nameP( v_new, current_value );
      }
      else if( pcase_var.eql( $kw166$ALREADY_CYCLIFIED_ ) )
      {
        _csetf_cyclify_status_already_cyclifiedP( v_new, current_value );
      }
      else if( pcase_var.eql( $kw167$ESCAPE_ ) )
      {
        _csetf_cyclify_status_escapeP( v_new, current_value );
      }
      else if( pcase_var.eql( $kw168$INSIDE_SUBL_QUOTE_FN_ ) )
      {
        _csetf_cyclify_status_inside_subl_quote_fnP( v_new, current_value );
      }
      else if( pcase_var.eql( $kw169$INSIDE_EXPAND_SUBL_FN_ ) )
      {
        _csetf_cyclify_status_inside_expand_subl_fnP( v_new, current_value );
      }
      else if( pcase_var.eql( $kw170$INSIDE_EXPAND_SUBL_FN_ARG1_ ) )
      {
        _csetf_cyclify_status_inside_expand_subl_fn_arg1P( v_new, current_value );
      }
      else if( pcase_var.eql( $kw171$INSIDE_EXPAND_SUBL_FN_ARG2_ ) )
      {
        _csetf_cyclify_status_inside_expand_subl_fn_arg2P( v_new, current_value );
      }
      else if( pcase_var.eql( $kw172$IMMEDIATELY_FOLLOWING_PAREN_ ) )
      {
        _csetf_cyclify_status_immediately_following_parenP( v_new, current_value );
      }
      else if( pcase_var.eql( $kw173$PAREN_COUNT ) )
      {
        _csetf_cyclify_status_paren_count( v_new, current_value );
      }
      else
      {
        Errors.error( $str174$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 126873L)
  public static SubLObject visit_defstruct_cyclify_status(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw175$BEGIN, $sym176$MAKE_CYCLIFY_STATUS, TWELVE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw177$SLOT, $kw162$OUT_STRING_LIST, cyclify_status_out_string_list( obj ) );
    Functions.funcall( visitor_fn, obj, $kw177$SLOT, $kw163$REFERENCES_ADDED, cyclify_status_references_added( obj ) );
    Functions.funcall( visitor_fn, obj, $kw177$SLOT, $kw164$INSIDE_QUOTE_, cyclify_status_inside_quoteP( obj ) );
    Functions.funcall( visitor_fn, obj, $kw177$SLOT, $kw165$INSIDE_EL_VAR_NAME_, cyclify_status_inside_el_var_nameP( obj ) );
    Functions.funcall( visitor_fn, obj, $kw177$SLOT, $kw166$ALREADY_CYCLIFIED_, cyclify_status_already_cyclifiedP( obj ) );
    Functions.funcall( visitor_fn, obj, $kw177$SLOT, $kw167$ESCAPE_, cyclify_status_escapeP( obj ) );
    Functions.funcall( visitor_fn, obj, $kw177$SLOT, $kw168$INSIDE_SUBL_QUOTE_FN_, cyclify_status_inside_subl_quote_fnP( obj ) );
    Functions.funcall( visitor_fn, obj, $kw177$SLOT, $kw169$INSIDE_EXPAND_SUBL_FN_, cyclify_status_inside_expand_subl_fnP( obj ) );
    Functions.funcall( visitor_fn, obj, $kw177$SLOT, $kw170$INSIDE_EXPAND_SUBL_FN_ARG1_, cyclify_status_inside_expand_subl_fn_arg1P( obj ) );
    Functions.funcall( visitor_fn, obj, $kw177$SLOT, $kw171$INSIDE_EXPAND_SUBL_FN_ARG2_, cyclify_status_inside_expand_subl_fn_arg2P( obj ) );
    Functions.funcall( visitor_fn, obj, $kw177$SLOT, $kw172$IMMEDIATELY_FOLLOWING_PAREN_, cyclify_status_immediately_following_parenP( obj ) );
    Functions.funcall( visitor_fn, obj, $kw177$SLOT, $kw173$PAREN_COUNT, cyclify_status_paren_count( obj ) );
    Functions.funcall( visitor_fn, obj, $kw178$END, $sym176$MAKE_CYCLIFY_STATUS, TWELVE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 126873L)
  public static SubLObject visit_defstruct_object_cyclify_status_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_cyclify_status( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 127196L)
  public static SubLObject cyclify_string_initialize_cyclify_status()
  {
    final SubLObject cyclify_status = make_cyclify_status( UNPROVIDED );
    _csetf_cyclify_status_out_string_list( cyclify_status, NIL );
    _csetf_cyclify_status_references_added( cyclify_status, NIL );
    _csetf_cyclify_status_inside_quoteP( cyclify_status, NIL );
    _csetf_cyclify_status_inside_el_var_nameP( cyclify_status, NIL );
    _csetf_cyclify_status_already_cyclifiedP( cyclify_status, NIL );
    _csetf_cyclify_status_escapeP( cyclify_status, NIL );
    _csetf_cyclify_status_inside_subl_quote_fnP( cyclify_status, NIL );
    _csetf_cyclify_status_inside_expand_subl_fnP( cyclify_status, NIL );
    _csetf_cyclify_status_inside_expand_subl_fn_arg1P( cyclify_status, NIL );
    _csetf_cyclify_status_inside_expand_subl_fn_arg2P( cyclify_status, NIL );
    _csetf_cyclify_status_immediately_following_parenP( cyclify_status, NIL );
    _csetf_cyclify_status_paren_count( cyclify_status, ZERO_INTEGER );
    return cyclify_status;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 128153L)
  public static SubLObject cyclify_string_possibly_cyclify_string(SubLObject cur_string, final SubLObject cyclify_status)
  {
    if( NIL == cyclify_status_inside_quoteP( cyclify_status ) && NIL == cyclify_status_inside_el_var_nameP( cyclify_status ) && NIL == cyclify_status_already_cyclifiedP( cyclify_status )
        && NIL == cyclify_status_inside_expand_subl_fn_arg2P( cyclify_status ) && NIL == cyclify_status_inside_subl_quote_fnP( cyclify_status ) && NIL != constant_completion_high.constant_complete_exact( cur_string,
            UNPROVIDED, UNPROVIDED ) )
    {
      final SubLObject item_var = constants_high.find_constant( cur_string );
      if( NIL == conses_high.member( item_var, cyclify_status_references_added( cyclify_status ), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
      {
        _csetf_cyclify_status_references_added( cyclify_status, ConsesLow.cons( item_var, cyclify_status_references_added( cyclify_status ) ) );
      }
      cur_string = string_add_constant_reader_prefix( cur_string );
    }
    return Values.values( cur_string, cyclify_status );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 128834L)
  public static SubLObject cyclify_string_not_inside_quote_and_not_escapedP(final SubLObject cyclify_status)
  {
    return makeBoolean( NIL == cyclify_status_inside_quoteP( cyclify_status ) && NIL == cyclify_status_escapeP( cyclify_status ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 129039L)
  public static SubLObject cyclify_string_found_quoteP(final SubLObject this_character, final SubLObject cyclify_status)
  {
    return makeBoolean( NIL != Characters.charE( this_character, Characters.CHAR_quotation ) && NIL == cyclify_status_escapeP( cyclify_status ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 129212L)
  public static SubLObject cyclify_string_found_open_parenP(final SubLObject this_character, final SubLObject cyclify_status)
  {
    return makeBoolean( NIL != cyclify_string_not_inside_quote_and_not_escapedP( cyclify_status ) && NIL != Characters.charE( this_character, Characters.CHAR_lparen ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 129409L)
  public static SubLObject cyclify_string_found_close_parenP(final SubLObject this_character, final SubLObject cyclify_status)
  {
    return makeBoolean( NIL != cyclify_string_not_inside_quote_and_not_escapedP( cyclify_status ) && NIL != Characters.charE( this_character, Characters.CHAR_rparen ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 129607L)
  public static SubLObject cyclify_string_add_to_out_string_list(final SubLObject string, final SubLObject cyclify_status)
  {
    _csetf_cyclify_status_out_string_list( cyclify_status, ConsesLow.cons( string, cyclify_status_out_string_list( cyclify_status ) ) );
    return cyclify_status;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 129775L)
  public static SubLObject cyclify_string_check_for_escape_to_subl(final SubLObject cur_string, final SubLObject cyclify_status)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != cyclify_status_immediately_following_parenP( cyclify_status ) && NIL == cyclify_status_inside_quoteP( cyclify_status ) && NIL == cyclify_status_inside_subl_quote_fnP( cyclify_status )
        && NIL == cyclify_status_inside_expand_subl_fn_arg2P( cyclify_status ) )
    {
      if( NIL != subl_promotions.memberP( cur_string, $cyclify_string_subl_quote_fn_strings$.getDynamicValue( thread ), EQUAL, UNPROVIDED ) )
      {
        _csetf_cyclify_status_inside_subl_quote_fnP( cyclify_status, T );
        _csetf_cyclify_status_paren_count( cyclify_status, ONE_INTEGER );
      }
      if( NIL != subl_promotions.memberP( cur_string, $cyclify_string_expand_subl_fn_strings$.getDynamicValue( thread ), EQUAL, UNPROVIDED ) )
      {
        _csetf_cyclify_status_inside_expand_subl_fnP( cyclify_status, T );
        _csetf_cyclify_status_paren_count( cyclify_status, ONE_INTEGER );
        _csetf_cyclify_status_inside_expand_subl_fn_arg1P( cyclify_status, NIL );
        _csetf_cyclify_status_inside_expand_subl_fn_arg2P( cyclify_status, NIL );
      }
    }
    return cyclify_status;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 130872L)
  public static SubLObject cyclify_string_handle_last_valid_char(SubLObject cyclify_status, final SubLObject in_string, final SubLObject pos_prev)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cur_string = substring( in_string, pos_prev, UNPROVIDED );
    thread.resetMultipleValues();
    final SubLObject cur_string_$44 = cyclify_string_possibly_cyclify_string( cur_string, cyclify_status );
    final SubLObject cyclify_status_$45 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    cur_string = cur_string_$44;
    cyclify_status = cyclify_status_$45;
    _csetf_cyclify_status_already_cyclifiedP( cyclify_status, NIL );
    cyclify_string_add_to_out_string_list( cur_string, cyclify_status );
    return cyclify_status;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 131302L)
  public static SubLObject cyclify_string_handle_open_paren_int(final SubLObject cyclify_status)
  {
    _csetf_cyclify_status_paren_count( cyclify_status, Numbers.add( cyclify_status_paren_count( cyclify_status ), ONE_INTEGER ) );
    _csetf_cyclify_status_immediately_following_parenP( cyclify_status, T );
    if( NIL != cyclify_status_inside_expand_subl_fnP( cyclify_status ) && cyclify_status_paren_count( cyclify_status ).numE( TWO_INTEGER ) )
    {
      if( NIL == cyclify_status_inside_expand_subl_fn_arg1P( cyclify_status ) )
      {
      }
      _csetf_cyclify_status_inside_expand_subl_fn_arg1P( cyclify_status, T );
    }
    return cyclify_status;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 131942L)
  public static SubLObject cyclify_string_handle_close_paren_int(final SubLObject cyclify_status)
  {
    _csetf_cyclify_status_immediately_following_parenP( cyclify_status, NIL );
    _csetf_cyclify_status_paren_count( cyclify_status, Numbers.subtract( cyclify_status_paren_count( cyclify_status ), ONE_INTEGER ) );
    if( NIL != cyclify_status_inside_subl_quote_fnP( cyclify_status ) && cyclify_status_paren_count( cyclify_status ).numE( ZERO_INTEGER ) )
    {
      _csetf_cyclify_status_inside_subl_quote_fnP( cyclify_status, NIL );
    }
    if( NIL != cyclify_status_inside_expand_subl_fnP( cyclify_status ) )
    {
      if( cyclify_status_paren_count( cyclify_status ).numE( ZERO_INTEGER ) )
      {
        _csetf_cyclify_status_inside_expand_subl_fnP( cyclify_status, NIL );
        _csetf_cyclify_status_inside_expand_subl_fn_arg1P( cyclify_status, NIL );
        _csetf_cyclify_status_inside_expand_subl_fn_arg2P( cyclify_status, NIL );
      }
      else if( cyclify_status_paren_count( cyclify_status ).numE( ONE_INTEGER ) && NIL != cyclify_status_inside_expand_subl_fn_arg1P( cyclify_status ) )
      {
        _csetf_cyclify_status_inside_expand_subl_fn_arg1P( cyclify_status, NIL );
        _csetf_cyclify_status_inside_expand_subl_fn_arg2P( cyclify_status, T );
      }
    }
    return cyclify_status;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 133264L)
  public static SubLObject cyclify_string_handle_end_of_current_word(SubLObject cyclify_status, final SubLObject in_string, SubLObject pos_prev, final SubLObject pos_now, final SubLObject this_character)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cur_string = substring( in_string, pos_prev, pos_now );
    thread.resetMultipleValues();
    final SubLObject cur_string_$46 = cyclify_string_possibly_cyclify_string( cur_string, cyclify_status );
    final SubLObject cyclify_status_$47 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    cur_string = cur_string_$46;
    cyclify_status = cyclify_status_$47;
    cyclify_status = cyclify_string_check_for_escape_to_subl( cur_string, cyclify_status );
    if( NIL != cyclify_string_found_quoteP( this_character, cyclify_status ) )
    {
      _csetf_cyclify_status_inside_quoteP( cyclify_status, makeBoolean( NIL == cyclify_status_inside_quoteP( cyclify_status ) ) );
    }
    if( NIL != cyclify_string_found_open_parenP( this_character, cyclify_status ) )
    {
      cyclify_status = cyclify_string_handle_open_paren_int( cyclify_status );
    }
    if( NIL != cyclify_string_found_close_parenP( this_character, cyclify_status ) )
    {
      cyclify_status = cyclify_string_handle_close_paren_int( cyclify_status );
    }
    if( NIL == Characters.charE( this_character, cycl_variables.el_variable_prefix_char() ) )
    {
      _csetf_cyclify_status_inside_el_var_nameP( cyclify_status, NIL );
    }
    _csetf_cyclify_status_already_cyclifiedP( cyclify_status, NIL );
    cur_string = Sequences.cconcatenate( cur_string, str( this_character ) );
    cyclify_string_add_to_out_string_list( cur_string, cyclify_status );
    pos_prev = number_utilities.f_1X( pos_now );
    return Values.values( cyclify_status, pos_prev );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 134723L)
  public static SubLObject cyclify_string(final SubLObject in_string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( in_string ) : in_string;
    final SubLObject end_pos = number_utilities.f_1_( Sequences.length( in_string ) );
    SubLObject pos_prev = ZERO_INTEGER;
    SubLObject cyclify_status = cyclify_string_initialize_cyclify_status();
    SubLObject end_var_$48;
    SubLObject end_var;
    SubLObject pos_now;
    SubLObject this_character;
    SubLObject last_charP;
    SubLObject cyclify_status_$49;
    SubLObject pos_prev_$50;
    SubLObject cur_string;
    for( end_var = ( end_var_$48 = Sequences.length( in_string ) ), pos_now = NIL, pos_now = ZERO_INTEGER; !pos_now.numGE( end_var_$48 ); pos_now = number_utilities.f_1X( pos_now ) )
    {
      this_character = Strings.sublisp_char( in_string, pos_now );
      last_charP = Equality.eql( pos_now, end_pos );
      if( NIL != last_charP || NIL == constant_completion_high.valid_constant_name_char_p( this_character ) )
      {
        if( NIL != constant_completion_high.valid_constant_name_char_p( this_character ) )
        {
          cyclify_status = cyclify_string_handle_last_valid_char( cyclify_status, in_string, pos_prev );
        }
        else if( pos_now.numG( pos_prev ) )
        {
          thread.resetMultipleValues();
          cyclify_status_$49 = cyclify_string_handle_end_of_current_word( cyclify_status, in_string, pos_prev, pos_now, this_character );
          pos_prev_$50 = thread.secondMultipleValue();
          thread.resetMultipleValues();
          cyclify_status = cyclify_status_$49;
          pos_prev = pos_prev_$50;
        }
        else if( NIL != last_charP )
        {
          cyclify_string_add_to_out_string_list( str( this_character ), cyclify_status );
          pos_prev = Numbers.add( pos_prev, ONE_INTEGER );
        }
        else if( NIL != Characters.charE( this_character, Characters.CHAR_hash ) && NIL != Characters.charE( Strings.sublisp_char( in_string, number_utilities.f_1X( pos_now ) ), constant_reader
            .constant_reader_macro_char() ) )
        {
          _csetf_cyclify_status_already_cyclifiedP( cyclify_status, T );
          cyclify_string_add_to_out_string_list( str( this_character ), cyclify_status );
          pos_prev = Numbers.add( pos_prev, ONE_INTEGER );
        }
        else if( NIL != cyclify_string_found_quoteP( this_character, cyclify_status ) )
        {
          if( NIL != cyclify_status_inside_quoteP( cyclify_status ) )
          {
            cur_string = substring( in_string, pos_prev, pos_now );
            _csetf_cyclify_status_inside_quoteP( cyclify_status, NIL );
            cyclify_string_add_to_out_string_list( cur_string, cyclify_status );
            pos_prev = pos_now;
          }
          else
          {
            _csetf_cyclify_status_inside_quoteP( cyclify_status, T );
          }
        }
        else if( NIL != cyclify_string_found_open_parenP( this_character, cyclify_status ) )
        {
          cyclify_status = cyclify_string_handle_open_paren_int( cyclify_status );
          cyclify_string_add_to_out_string_list( str( this_character ), cyclify_status );
          pos_prev = Numbers.add( pos_prev, ONE_INTEGER );
        }
        else if( NIL != cyclify_string_found_close_parenP( this_character, cyclify_status ) )
        {
          cyclify_status = cyclify_string_handle_close_paren_int( cyclify_status );
          cyclify_string_add_to_out_string_list( str( this_character ), cyclify_status );
          pos_prev = Numbers.add( pos_prev, ONE_INTEGER );
        }
        else if( NIL != Characters.charE( this_character, cycl_variables.el_variable_prefix_char() ) )
        {
          _csetf_cyclify_status_inside_el_var_nameP( cyclify_status, T );
        }
        else
        {
          cyclify_string_add_to_out_string_list( str( this_character ), cyclify_status );
          pos_prev = Numbers.add( pos_prev, ONE_INTEGER );
        }
        _csetf_cyclify_status_escapeP( cyclify_status, makeBoolean( NIL != subl_promotions.memberP( this_character, $cyclify_string_quote_chars$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED )
            && NIL == cyclify_status_escapeP( cyclify_status ) ) );
      }
    }
    return Values.values( ( NIL != cyclify_status_out_string_list( cyclify_status ) ) ? Functions.apply( Symbols.symbol_function( $sym74$CCONCATENATE ), Sequences.nreverse( cyclify_status_out_string_list(
        cyclify_status ) ) ) : $empty_string$.getGlobalValue(), Sequences.nreverse( cyclify_status_references_added( cyclify_status ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 138378L)
  public static SubLObject constant_names_in_string(final SubLObject string, SubLObject require_exact)
  {
    if( require_exact == UNPROVIDED )
    {
      require_exact = NIL;
    }
    final SubLObject length = Sequences.length( string );
    SubLObject last_idx = ZERO_INTEGER;
    SubLObject valid_names = NIL;
    SubLObject invalid_names = NIL;
    SubLObject hash_idx;
    SubLObject dollar_idx;
    SubLObject token_start;
    SubLObject token_end;
    SubLObject token_last;
    SubLObject possible_constant;
    SubLObject item_var;
    for( hash_idx = NIL, hash_idx = Sequences.position( Characters.CHAR_hash, string, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ), last_idx, UNPROVIDED ); NIL != hash_idx; hash_idx = Sequences
        .position( Characters.CHAR_hash, string, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ), last_idx, UNPROVIDED ) )
    {
      dollar_idx = Numbers.add( hash_idx, ONE_INTEGER );
      if( dollar_idx.numE( length ) || !Strings.sublisp_char( string, dollar_idx ).eql( constant_reader.constant_reader_macro_char() ) )
      {
        last_idx = dollar_idx;
      }
      else
      {
        token_start = Numbers.add( dollar_idx, ONE_INTEGER );
        token_end = list_utilities.position_if_not( Symbols.symbol_function( $sym103$VALID_CONSTANT_NAME_CHAR_P ), string, Symbols.symbol_function( IDENTITY ), token_start, UNPROVIDED );
        token_last = NIL;
        possible_constant = NIL;
        if( NIL == token_end )
        {
          token_end = length;
        }
        token_last = Numbers.subtract( token_end, ONE_INTEGER );
        possible_constant = constant_completion_high.constant_complete_exact( string, token_start, token_end );
        if( NIL == possible_constant && NIL == require_exact )
        {
          if( token_last.numG( token_start ) && NIL != Characters.char_equal( Characters.CHAR_s, Strings.sublisp_char( string, token_last ) ) )
          {
            possible_constant = constant_completion_high.constant_complete_exact( string, token_start, token_last );
            if( NIL != possible_constant )
            {
              token_end = token_last;
            }
            else
            {
              token_last = Numbers.subtract( token_last, ONE_INTEGER );
              if( token_last.numG( token_start ) && NIL != Characters.char_equal( Characters.CHAR_e, Strings.sublisp_char( string, token_last ) ) )
              {
                possible_constant = constant_completion_high.constant_complete_exact( string, token_start, token_last );
                if( NIL != possible_constant )
                {
                  token_end = token_last;
                }
              }
            }
          }
          else if( token_last.numG( token_start ) && NIL != Characters.char_equal( Characters.CHAR_question, Strings.sublisp_char( string, token_last ) ) )
          {
            possible_constant = constant_completion_high.constant_complete_exact( string, token_start, token_last );
          }
        }
        if( NIL != possible_constant )
        {
          item_var = constants_high.constant_name( possible_constant );
          if( NIL == conses_high.member( item_var, valid_names, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            valid_names = ConsesLow.cons( item_var, valid_names );
          }
        }
        else
        {
          item_var = substring( string, token_start, token_end );
          if( NIL == conses_high.member( item_var, invalid_names, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            invalid_names = ConsesLow.cons( item_var, invalid_names );
          }
        }
        last_idx = token_end;
      }
    }
    return Values.values( Sequences.nreverse( valid_names ), Sequences.nreverse( invalid_names ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 141620L)
  public static SubLObject invalid_constant_names_in_string(final SubLObject string, SubLObject require_exactP)
  {
    if( require_exactP == UNPROVIDED )
    {
      require_exactP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject valid_references = constant_names_in_string( string, require_exactP );
    final SubLObject invalid_references = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return invalid_references;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 142002L)
  public static SubLObject invalid_constant_names_in_stringP(final SubLObject string, SubLObject require_exactP)
  {
    if( require_exactP == UNPROVIDED )
    {
      require_exactP = NIL;
    }
    return list_utilities.sublisp_boolean( invalid_constant_names_in_string( string, require_exactP ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 142283L)
  public static SubLObject nonbreak_char(final SubLObject v_char)
  {
    if( v_char.isChar() )
    {
      return makeBoolean( NIL == whitespacep( v_char ) && NIL == Sequences.find( v_char, $str181$__, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 142611L)
  public static SubLObject read_string_until_char(final SubLObject stream, final SubLObject quit_char, SubLObject eof_value)
  {
    if( eof_value == UNPROVIDED )
    {
      eof_value = $kw94$EOF;
    }
    SubLThread thread;
    SubLObject index;
    SubLObject v_char;
    for( thread = SubLProcess.currentSubLThread(), index = ZERO_INTEGER, v_char = NIL, v_char = streams_high.read_char( stream, NIL, eof_value, UNPROVIDED ); !index.eql( $string_read_buffer_size$.getDynamicValue(
        thread ) ) && !v_char.eql( eof_value ) && !v_char.eql( quit_char ); index = Numbers.add( index, ONE_INTEGER ), v_char = streams_high.read_char( stream, NIL, eof_value, UNPROVIDED ) )
    {
      Vectors.set_aref( $string_read_buffer$.getDynamicValue( thread ), index, v_char );
    }
    if( index.eql( $string_read_buffer_size$.getDynamicValue( thread ) ) )
    {
      Errors.cerror( $str183$quit_reading_file, $str184$string_read_larger_than_buffer_si, $string_read_buffer_size$.getDynamicValue( thread ) );
      return eof_value;
    }
    final SubLObject v_answer = Strings.make_string( index, UNPROVIDED );
    SubLObject i;
    for( i = NIL, i = ZERO_INTEGER; i.numL( index ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      set_nth_char( i, v_answer, Vectors.aref( $string_read_buffer$.getDynamicValue( thread ), i ), UNPROVIDED );
    }
    if( NIL == empty_string_p( v_answer ) )
    {
      return v_answer;
    }
    if( v_char.eql( eof_value ) )
    {
      return eof_value;
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 143412L)
  public static SubLObject align_char(SubLObject string, final SubLObject v_char, final SubLObject field_width, final SubLObject char_psn, SubLObject fill)
  {
    if( fill == UNPROVIDED )
    {
      fill = $str18$_;
    }
    final SubLObject position = char_position( v_char, string, UNPROVIDED );
    final SubLObject length = Sequences.length( string );
    final SubLObject max = Numbers.subtract( field_width, length );
    SubLObject cdotimes_end_var;
    SubLObject n;
    for( cdotimes_end_var = Numbers.min( max, Numbers.subtract( char_psn, position, ONE_INTEGER ) ), n = NIL, n = ZERO_INTEGER; n.numL( cdotimes_end_var ); n = Numbers.add( n, ONE_INTEGER ) )
    {
      string = Sequences.cconcatenate( fill, string );
    }
    for( cdotimes_end_var = Numbers.min( max, Numbers.subtract( field_width, Numbers.add( Numbers.subtract( length, position, ONE_INTEGER ), char_psn ) ) ), n = NIL, n = ZERO_INTEGER; n.numL(
        cdotimes_end_var ); n = Numbers.add( n, ONE_INTEGER ) )
    {
      string = Sequences.cconcatenate( string, fill );
    }
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 144043L)
  public static SubLObject right_justify(SubLObject string, final SubLObject field_width, SubLObject fill)
  {
    if( fill == UNPROVIDED )
    {
      fill = $str18$_;
    }
    SubLObject cdotimes_end_var;
    SubLObject n;
    for( cdotimes_end_var = Numbers.subtract( field_width, Sequences.length( string ) ), n = NIL, n = ZERO_INTEGER; n.numL( cdotimes_end_var ); n = Numbers.add( n, ONE_INTEGER ) )
    {
      string = Sequences.cconcatenate( fill, string );
    }
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 144215L)
  public static SubLObject left_justify(SubLObject string, final SubLObject field_width, SubLObject fill)
  {
    if( fill == UNPROVIDED )
    {
      fill = $str18$_;
    }
    SubLObject cdotimes_end_var;
    SubLObject n;
    for( cdotimes_end_var = Numbers.subtract( field_width, Sequences.length( string ) ), n = NIL, n = ZERO_INTEGER; n.numL( cdotimes_end_var ); n = Numbers.add( n, ONE_INTEGER ) )
    {
      string = Sequences.cconcatenate( string, fill );
    }
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 144386L)
  public static SubLObject center_string(SubLObject string, final SubLObject field_width, SubLObject fill)
  {
    if( fill == UNPROVIDED )
    {
      fill = $str18$_;
    }
    final SubLObject length = Sequences.length( string );
    final SubLObject left = Numbers.truncate( Numbers.add( $float185$0_5, Numbers.divide( Numbers.subtract( field_width, length ), TWO_INTEGER ) ), UNPROVIDED );
    final SubLObject right = Numbers.subtract( field_width, length, left );
    SubLObject n;
    for( n = NIL, n = ZERO_INTEGER; n.numL( left ); n = Numbers.add( n, ONE_INTEGER ) )
    {
      string = Sequences.cconcatenate( fill, string );
    }
    for( n = NIL, n = ZERO_INTEGER; n.numL( right ); n = Numbers.add( n, ONE_INTEGER ) )
    {
      string = Sequences.cconcatenate( string, fill );
    }
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 144856L)
  public static SubLObject print_length(final SubLObject v_object)
  {
    if( v_object.isString() )
    {
      return Sequences.length( v_object );
    }
    return Sequences.length( PrintLow.format( NIL, $str186$_a, v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 144989L)
  public static SubLObject tab(final SubLObject indent, SubLObject stream, SubLObject new_lineP, SubLObject fill, SubLObject fill_psn)
  {
    if( stream == UNPROVIDED )
    {
      stream = T;
    }
    if( new_lineP == UNPROVIDED )
    {
      new_lineP = NIL;
    }
    if( fill == UNPROVIDED )
    {
      fill = $str18$_;
    }
    if( fill_psn == UNPROVIDED )
    {
      fill_psn = ONE_INTEGER;
    }
    if( NIL != new_lineP )
    {
      PrintLow.format( stream, $str125$__ );
    }
    SubLObject n;
    for( n = NIL, n = ZERO_INTEGER; n.numL( indent ); n = Numbers.add( n, ONE_INTEGER ) )
    {
      if( Numbers.mod( n, fill_psn ).eql( ZERO_INTEGER ) )
      {
        PrintLow.format( stream, fill );
      }
      else
      {
        PrintLow.format( stream, $str18$_ );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 145226L)
  public static SubLObject tabstr(final SubLObject indent, SubLObject fill)
  {
    if( fill == UNPROVIDED )
    {
      fill = $str18$_;
    }
    SubLObject string = $empty_string$.getGlobalValue();
    SubLObject n;
    for( n = NIL, n = ZERO_INTEGER; n.numL( indent ); n = Numbers.add( n, ONE_INTEGER ) )
    {
      string = Sequences.cconcatenate( string, fill );
    }
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 145393L)
  public static SubLObject reduce_whitespace(SubLObject string)
  {
    assert NIL != Types.stringp( string ) : string;
    final SubLObject new_size = compute_reduced_length( string );
    if( !new_size.numE( Sequences.length( string ) ) )
    {
      final SubLObject new_string = Strings.make_string( new_size, UNPROVIDED );
      SubLObject state = $kw187$BEFORE;
      SubLObject index = ZERO_INTEGER;
      final SubLObject string_var = string;
      SubLObject end_var_$51;
      SubLObject end_var;
      SubLObject char_num;
      SubLObject curr;
      SubLObject blankP;
      for( end_var = ( end_var_$51 = Sequences.length( string_var ) ), char_num = NIL, char_num = ZERO_INTEGER; !char_num.numGE( end_var_$51 ); char_num = number_utilities.f_1X( char_num ) )
      {
        curr = Strings.sublisp_char( string_var, char_num );
        blankP = whitespacep( curr );
        if( state == $kw187$BEFORE )
        {
          if( NIL == blankP )
          {
            set_nth_char( index, new_string, curr, UNPROVIDED );
            index = Numbers.add( index, ONE_INTEGER );
            state = $kw188$WORD;
          }
        }
        else if( state == $kw188$WORD )
        {
          if( NIL != blankP )
          {
            state = $kw189$KEEP_BLANK;
          }
          else
          {
            set_nth_char( index, new_string, curr, UNPROVIDED );
            index = Numbers.add( index, ONE_INTEGER );
          }
        }
        else if( state == $kw189$KEEP_BLANK )
        {
          if( NIL != blankP )
          {
            state = $kw190$SKIP_BLANKS;
          }
          else
          {
            set_nth_char( index, new_string, Characters.CHAR_space, UNPROVIDED );
            index = Numbers.add( index, ONE_INTEGER );
            set_nth_char( index, new_string, curr, UNPROVIDED );
            index = Numbers.add( index, ONE_INTEGER );
            state = $kw188$WORD;
          }
        }
        else
        {
          if( state != $kw190$SKIP_BLANKS )
          {
            Errors.cerror( $str191$Unknown_State__S__Flaw_in_state_m, state );
            return string;
          }
          if( NIL == blankP )
          {
            set_nth_char( index, new_string, Characters.CHAR_space, UNPROVIDED );
            index = Numbers.add( index, ONE_INTEGER );
            set_nth_char( index, new_string, curr, UNPROVIDED );
            index = Numbers.add( index, ONE_INTEGER );
            state = $kw188$WORD;
          }
        }
      }
      string = new_string;
    }
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 147012L)
  public static SubLObject compute_reduced_length(final SubLObject string)
  {
    assert NIL != Types.stringp( string ) : string;
    SubLObject state = $kw187$BEFORE;
    SubLObject count = ZERO_INTEGER;
    SubLObject end_var_$52;
    SubLObject end_var;
    SubLObject char_num;
    SubLObject v_char;
    SubLObject blankP;
    for( end_var = ( end_var_$52 = Sequences.length( string ) ), char_num = NIL, char_num = ZERO_INTEGER; !char_num.numGE( end_var_$52 ); char_num = number_utilities.f_1X( char_num ) )
    {
      v_char = Strings.sublisp_char( string, char_num );
      blankP = whitespacep( v_char );
      if( state == $kw187$BEFORE )
      {
        if( NIL != blankP )
        {
          count = Numbers.add( count, ONE_INTEGER );
        }
        else
        {
          state = $kw188$WORD;
        }
      }
      else if( state == $kw188$WORD )
      {
        if( NIL != blankP )
        {
          state = $kw189$KEEP_BLANK;
        }
      }
      else if( state == $kw189$KEEP_BLANK )
      {
        if( NIL != blankP )
        {
          state = $kw192$SPACE;
        }
        else
        {
          state = $kw188$WORD;
        }
      }
      else
      {
        if( state != $kw192$SPACE )
        {
          Errors.cerror( $str193$Unknown_state__S__Design_flaw_in_, state );
          return Sequences.length( string );
        }
        count = Numbers.add( count, ONE_INTEGER );
        if( NIL == blankP )
        {
          state = $kw188$WORD;
        }
      }
    }
    if( state == $kw189$KEEP_BLANK )
    {
      count = Numbers.add( count, ONE_INTEGER );
    }
    else if( state == $kw192$SPACE )
    {
      count = Numbers.add( count, TWO_INTEGER );
    }
    return Numbers.subtract( Sequences.length( string ), count );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 148101L)
  public static SubLObject single_word_string_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isString() && NIL == multi_word_string( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 148269L)
  public static SubLObject multi_word_string(final SubLObject string)
  {
    assert NIL != Types.stringp( string ) : string;
    final SubLObject first_non_whitespace = list_utilities.position_if_not( Symbols.symbol_function( $sym77$WHITESPACEP ), string, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL == first_non_whitespace )
    {
      return NIL;
    }
    final SubLObject middle_whitespace = Sequences.position_if( Symbols.symbol_function( $sym77$WHITESPACEP ), string, Symbols.symbol_function( IDENTITY ), first_non_whitespace, UNPROVIDED );
    if( NIL == middle_whitespace )
    {
      return NIL;
    }
    return Types.integerp( list_utilities.position_if_not( Symbols.symbol_function( $sym77$WHITESPACEP ), string, Symbols.symbol_function( IDENTITY ), middle_whitespace, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 148739L)
  public static SubLObject multi_word_quote(final SubLObject string)
  {
    if( NIL != multi_word_string( string ) )
    {
      return Sequences.cconcatenate( $str21$_, new SubLObject[] { string, $str21$_
      } );
    }
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 149130L)
  public static SubLObject process_file(final SubLObject infile, final SubLObject read_function, final SubLObject process_item_function, SubLObject outfile, SubLObject write_function)
  {
    if( outfile == UNPROVIDED )
    {
      outfile = NIL;
    }
    if( write_function == UNPROVIDED )
    {
      write_function = $sym194$PRIN1;
    }
    assert NIL != subl_promotions.function_symbol_p( process_item_function ) : process_item_function;
    assert NIL != subl_promotions.function_symbol_p( read_function ) : read_function;
    assert NIL != subl_promotions.function_symbol_p( write_function ) : write_function;
    SubLObject stream = NIL;
    try
    {
      stream = compatibility.open_text( infile, $kw196$INPUT );
      if( !stream.isStream() )
      {
        Errors.error( $str197$Unable_to_open__S, infile );
      }
      final SubLObject in = stream;
      if( !in.isStream() )
      {
        Errors.error( $str198$Could_not_open_an_input_stream_fo, infile );
      }
      SubLObject out = NIL;
      try
      {
        if( outfile.isString() )
        {
          out = compatibility.open_text( outfile, $kw199$OUTPUT );
        }
        SubLObject done = NIL;
        while ( NIL == done)
        {
          SubLObject item = NIL;
          item = Functions.funcall( read_function, in );
          if( item == $kw94$EOF )
          {
            done = T;
          }
          else
          {
            SubLObject result = NIL;
            result = Functions.funcall( process_item_function, item );
            if( !out.isStream() )
            {
              continue;
            }
            Functions.funcall( write_function, result, out );
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
        try
        {
          Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
          final SubLObject _values = Values.getValuesAsVector();
          if( out.isStream() )
          {
            streams_high.close( out, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
        }
      }
    }
    finally
    {
      final SubLObject _prev_bind_2 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values2 = Values.getValuesAsVector();
        if( stream.isStream() )
        {
          streams_high.close( stream, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values2 );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_2 );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 150874L)
  public static SubLObject princ_file_to_stream(final SubLObject infile, final SubLObject stream, SubLObject subst_space_for_newlineP, SubLObject ignore_lines)
  {
    if( subst_space_for_newlineP == UNPROVIDED )
    {
      subst_space_for_newlineP = NIL;
    }
    if( ignore_lines == UNPROVIDED )
    {
      ignore_lines = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject newline = ( NIL != subst_space_for_newlineP ) ? $str18$_ : PrintLow.format( NIL, $str125$__ );
    SubLObject line = NIL;
    SubLObject done = NIL;
    SubLObject stream_$53 = NIL;
    try
    {
      stream_$53 = compatibility.open_text( infile, $kw196$INPUT );
      if( !stream_$53.isStream() )
      {
        Errors.error( $str197$Unable_to_open__S, infile );
      }
      final SubLObject in = stream_$53;
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !in.isStream() )
      {
        Errors.error( $str200$__Cannot_open_input_stream_for__A, infile );
      }
      if( NIL != subl_promotions.positive_integer_p( ignore_lines ) )
      {
        SubLObject n;
        for( n = NIL, n = ZERO_INTEGER; n.numL( ignore_lines ); n = Numbers.add( n, ONE_INTEGER ) )
        {
          if( NIL == done )
          {
            line = streams_high.read_line( in, NIL, $kw94$EOF, UNPROVIDED );
            if( line == $kw94$EOF )
            {
              done = T;
            }
          }
        }
      }
      while ( NIL == done)
      {
        line = streams_high.read_line( in, NIL, $kw94$EOF, UNPROVIDED );
        if( line == $kw94$EOF )
        {
          done = T;
        }
        else
        {
          print_high.princ( line, stream );
          print_high.princ( newline, stream );
        }
      }
    }
    finally
    {
      final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        if( stream_$53.isStream() )
        {
          streams_high.close( stream_$53, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
      }
    }
    return infile;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 151651L)
  public static SubLObject read_string_from_file(final SubLObject infile, SubLObject subst_space_for_newlineP, SubLObject ignore_lines)
  {
    if( subst_space_for_newlineP == UNPROVIDED )
    {
      subst_space_for_newlineP = NIL;
    }
    if( ignore_lines == UNPROVIDED )
    {
      ignore_lines = NIL;
    }
    assert NIL != Types.stringp( infile ) : infile;
    SubLObject input_string = NIL;
    SubLObject stream = NIL;
    try
    {
      stream = streams_high.make_private_string_output_stream();
      princ_file_to_stream( infile, stream, subst_space_for_newlineP, ignore_lines );
      input_string = streams_high.get_output_stream_string( stream );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        streams_high.close( stream, UNPROVIDED );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    return input_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 152255L)
  public static SubLObject uniquify_string(final SubLObject string, final SubLObject other_strings, SubLObject test, SubLObject glue_string)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQUAL );
    }
    if( glue_string == UNPROVIDED )
    {
      glue_string = $str201$_;
    }
    return uniquify_string_via_set( string, set_utilities.construct_set_from_list( other_strings, test, UNPROVIDED ), glue_string );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 153820L)
  public static SubLObject uniquify_string_via_set(final SubLObject string, final SubLObject other_string_set, SubLObject glue_string)
  {
    if( glue_string == UNPROVIDED )
    {
      glue_string = $str201$_;
    }
    SubLObject curr_string = string;
    for( SubLObject uniquifying_integer = ONE_INTEGER; NIL != set.set_memberP( curr_string, other_string_set ); curr_string = Sequences.cconcatenate( string, new SubLObject[] { glue_string, str( uniquifying_integer )
    } ) )
    {
      uniquifying_integer = Numbers.add( uniquifying_integer, ONE_INTEGER );
    }
    return curr_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 154292L)
  public static SubLObject possibly_read_from_string_ignoring_errors(final SubLObject string, final SubLObject do_itP)
  {
    return ( NIL != do_itP ) ? reader.read_from_string_ignoring_errors( string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) : string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 154447L)
  public static SubLObject random_string(final SubLObject length)
  {
    final SubLObject string = Strings.make_string( length, UNPROVIDED );
    SubLObject i;
    for( i = NIL, i = ZERO_INTEGER; i.numL( length ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      Vectors.set_aref( string, i, Characters.code_char( Numbers.add( $int202$97, random.random( $int203$26 ) ) ) );
    }
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 154632L)
  public static SubLObject alphacize(final SubLObject string)
  {
    return list_utilities.remove_if_not( $sym56$ALPHA_CHAR_P, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 154713L)
  public static SubLObject alphanumericize(final SubLObject string)
  {
    return list_utilities.remove_if_not( $sym55$ALPHANUMERICP, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 154801L)
  public static SubLObject alphanumeric_or_hyphen_p(final SubLObject v_char)
  {
    return makeBoolean( NIL != Characters.alphanumericp( v_char ) || v_char.eql( Characters.CHAR_hyphen ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 154904L)
  public static SubLObject alpha_or_underscore_p(final SubLObject v_char)
  {
    return makeBoolean( NIL != Characters.alpha_char_p( v_char ) || v_char.eql( Characters.CHAR_underbar ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 155003L)
  public static SubLObject alphanumericize_admitting_hyphens(final SubLObject string)
  {
    return list_utilities.remove_if_not( $sym204$ALPHANUMERIC_OR_HYPHEN_P, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 155120L)
  public static SubLObject alphanumeric_or_number_char_p(final SubLObject v_char)
  {
    return makeBoolean( NIL != Characters.alphanumericp( v_char ) || v_char.eql( Characters.CHAR_hyphen ) || v_char.eql( Characters.CHAR_period ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 155247L)
  public static SubLObject nth_letter_of_alphabet(final SubLObject n)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != subl_promotions.non_negative_integer_p( n ) : n;
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !n.numL( $int203$26 ) )
    {
      Errors.error( $str205$_a_is_not_a_number_between_0_and_, n );
    }
    return Characters.code_char( Numbers.add( Characters.char_code( Characters.CHAR_a ), n ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 155522L)
  public static SubLObject nth_letter_of_alphabet_upcase(final SubLObject n)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != subl_promotions.non_negative_integer_p( n ) : n;
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !n.numL( $int203$26 ) )
    {
      Errors.error( $str205$_a_is_not_a_number_between_0_and_, n );
    }
    return Characters.code_char( Numbers.add( Characters.char_code( Characters.CHAR_A ), n ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 155804L)
  public static SubLObject keyword_from_string(final SubLObject string)
  {
    if( string.isString() && Sequences.length( string ).numG( ZERO_INTEGER ) )
    {
      return Symbols.make_keyword( string );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 156099L)
  public static SubLObject pretty_keyword_from_string(final SubLObject string)
  {
    final SubLObject upcased_string = Strings.string_upcase( string, UNPROVIDED, UNPROVIDED );
    final SubLObject replaced_string = substitute_char_if( upcased_string, Characters.CHAR_hyphen, $sym206$NON_ALPHANUMERIC_P );
    return keyword_from_string( replaced_string );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 156331L)
  public static SubLObject non_alphanumeric_p(final SubLObject v_char)
  {
    return makeBoolean( NIL == Characters.alphanumericp( v_char ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 156410L)
  public static SubLObject string_from_keyword(final SubLObject keyword)
  {
    if( keyword.isKeyword() )
    {
      return Symbols.symbol_name( keyword );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 156597L)
  public static SubLObject keyword_impostor_p(final SubLObject v_object)
  {
    if( v_object.isSymbol() && !v_object.isKeyword() )
    {
      final SubLObject name = Symbols.symbol_name( v_object );
      return makeBoolean( ZERO_INTEGER.numL( Sequences.length( name ) ) && NIL != Characters.charE( Characters.CHAR_colon, Strings.sublisp_char( name, ZERO_INTEGER ) ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 156897L)
  public static SubLObject keyword_from_impostor(final SubLObject keyword_impostor)
  {
    assert NIL != keyword_impostor_p( keyword_impostor ) : keyword_impostor;
    final SubLObject impostor_name = Symbols.symbol_name( keyword_impostor );
    return Symbols.make_keyword( substring( impostor_name, ONE_INTEGER, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 157180L)
  public static SubLObject coerce_to_keyword(final SubLObject v_object)
  {
    if( v_object.isKeyword() )
    {
      return v_object;
    }
    if( v_object.isString() )
    {
      return keyword_from_string( v_object );
    }
    if( NIL != keyword_impostor_p( v_object ) )
    {
      return keyword_from_impostor( v_object );
    }
    if( v_object.isSymbol() )
    {
      return keyword_from_string( Symbols.symbol_name( v_object ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 157618L)
  public static SubLObject cfasl_compile_from_string(final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject forms = NIL;
    SubLObject pos = ZERO_INTEGER;
    SubLObject eof = NIL;
    while ( NIL == eof)
    {
      thread.resetMultipleValues();
      final SubLObject form = reader.read_from_string_ignoring_errors( string, NIL, $kw94$EOF, pos, UNPROVIDED );
      final SubLObject new_pos = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( form.eql( $kw94$EOF ) )
      {
        eof = T;
      }
      else
      {
        forms = ConsesLow.cons( form, forms );
        pos = new_pos;
      }
    }
    forms = reader.bq_cons( $sym208$PROGN, ConsesLow.append( Sequences.nreverse( forms ), NIL ) );
    return forms;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 158110L)
  public static SubLObject weak_string_equal(final SubLObject string_1, final SubLObject string_2)
  {
    SubLObject index_1 = ZERO_INTEGER;
    SubLObject index_2 = ZERO_INTEGER;
    for( SubLObject total_iterations = Numbers.add( Numbers.max( Sequences.length( string_1 ), Sequences.length( string_2 ) ), ONE_INTEGER ), curr_iteration = ZERO_INTEGER, doneP = NIL; NIL == doneP; doneP = Numbers
        .numL( total_iterations, curr_iteration ) )
    {
      final SubLObject next_1 = Sequences.position_if( $sym55$ALPHANUMERICP, string_1, IDENTITY, index_1, UNPROVIDED );
      final SubLObject next_2 = Sequences.position_if( $sym55$ALPHANUMERICP, string_2, IDENTITY, index_2, UNPROVIDED );
      if( NIL == next_1 && NIL == next_2 )
      {
        return T;
      }
      if( NIL == next_1 || NIL == next_2 )
      {
        return NIL;
      }
      if( NIL == Characters.char_equal( Strings.sublisp_char( string_1, next_1 ), Strings.sublisp_char( string_2, next_2 ) ) )
      {
        return NIL;
      }
      curr_iteration = Numbers.add( curr_iteration, ONE_INTEGER );
      index_1 = Numbers.add( next_1, ONE_INTEGER );
      index_2 = Numbers.add( next_2, ONE_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 159215L)
  public static SubLObject comma_separated_string(final SubLObject list)
  {
    SubLObject result = NIL;
    SubLObject s = NIL;
    try
    {
      s = streams_high.make_private_string_output_stream();
      final SubLObject first_elem = list.first();
      PrintLow.format( s, $str186$_a, first_elem );
      SubLObject cdolist_list_var = list.rest();
      SubLObject elem = NIL;
      elem = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        PrintLow.format( s, $str209$__a, elem );
        cdolist_list_var = cdolist_list_var.rest();
        elem = cdolist_list_var.first();
      }
      result = streams_high.get_output_stream_string( s );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        streams_high.close( s, UNPROVIDED );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities.lisp", position = 159616L)
  public static SubLObject format_nil_test(final SubLObject format_control, final SubLObject format_arguments)
  {
    return PrintLow.format( NIL, format_control, format_arguments );
  }

  public static SubLObject declare_string_utilities_file()
  {
    SubLFiles.declareFunction( me, "not_test_char", "NOT-TEST-CHAR", 1, 0, false );
    SubLFiles.declareMacro( me, "do_words", "DO-WORDS" );
    SubLFiles.declareFunction( me, "empty_string_p", "EMPTY-STRING-P", 1, 0, false );
    SubLFiles.declareFunction( me, "empty_stringP", "EMPTY-STRING?", 1, 0, false );
    SubLFiles.declareFunction( me, "non_empty_string_p", "NON-EMPTY-STRING-P", 1, 0, false );
    SubLFiles.declareFunction( me, "every_in_string", "EVERY-IN-STRING", 2, 1, false );
    SubLFiles.declareFunction( me, "any_in_string", "ANY-IN-STRING", 2, 1, false );
    SubLFiles.declareFunction( me, "list_of_string_p", "LIST-OF-STRING-P", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_object_to_string", "CLEAR-OBJECT-TO-STRING", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_object_to_string", "REMOVE-OBJECT-TO-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "object_to_string_internal", "OBJECT-TO-STRING-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "object_to_string", "OBJECT-TO-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "fort_to_string", "FORT-TO-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "function_to_string", "FUNCTION-TO-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "to_string", "TO-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "non_nil_to_string", "NON-NIL-TO-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "to_lisp_string", "TO-LISP-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "to_string_of_length", "TO-STRING-OF-LENGTH", 2, 0, false );
    SubLFiles.declareFunction( me, "first_n_list_items_to_string", "FIRST-N-LIST-ITEMS-TO-STRING", 2, 0, false );
    SubLFiles.declareFunction( me, "char_at", "CHAR-AT", 2, 0, false );
    SubLFiles.declareFunction( me, "quote_string", "QUOTE-STRING", 1, 1, false );
    SubLFiles.declareFunction( me, "unquote_string", "UNQUOTE-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "quoted_stringP", "QUOTED-STRING?", 1, 0, false );
    SubLFiles.declareFunction( me, "str", "STR", 1, 0, false );
    SubLFiles.declareFunction( me, "printed_forms_equalP", "PRINTED-FORMS-EQUAL?", 2, 1, false );
    SubLFiles.declareFunction( me, "readable_p", "READABLE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "string_to_number", "STRING-TO-NUMBER", 1, 0, false );
    SubLFiles.declareFunction( me, "string_to_integer", "STRING-TO-INTEGER", 1, 0, false );
    SubLFiles.declareFunction( me, "integer_string_p", "INTEGER-STRING-P", 1, 0, false );
    SubLFiles.declareFunction( me, "integer_stringL", "INTEGER-STRING<", 2, 0, false );
    SubLFiles.declareFunction( me, "to_hex_string", "TO-HEX-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "hex_int_from_string", "HEX-INT-FROM-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "string_length_L", "STRING-LENGTH-<", 2, 0, false );
    SubLFiles.declareFunction( me, "indent", "INDENT", 2, 0, false );
    SubLFiles.declareFunction( me, "aref_from_end", "AREF-FROM-END", 2, 0, false );
    SubLFiles.declareFunction( me, "char_from_end", "CHAR-FROM-END", 2, 0, false );
    SubLFiles.declareFunction( me, "first_char", "FIRST-CHAR", 1, 0, false );
    SubLFiles.declareFunction( me, "first_of_string", "FIRST-OF-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "rest_of_string", "REST-OF-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "last_char", "LAST-CHAR", 1, 0, false );
    SubLFiles.declareFunction( me, "pre_add_character_to_string", "PRE-ADD-CHARACTER-TO-STRING", 2, 0, false );
    SubLFiles.declareFunction( me, "post_add_character_to_string", "POST-ADD-CHARACTER-TO-STRING", 2, 0, false );
    SubLFiles.declareFunction( me, "pre_and_post_add_character_to_string", "PRE-AND-POST-ADD-CHARACTER-TO-STRING", 2, 0, false );
    SubLFiles.declareFunction( me, "copy_string", "COPY-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "string_substitute", "STRING-SUBSTITUTE", 3, 1, false );
    SubLFiles.declareFunction( me, "string_substitute_word", "STRING-SUBSTITUTE-WORD", 3, 2, false );
    SubLFiles.declareFunction( me, "do_string_substitutions", "DO-STRING-SUBSTITUTIONS", 2, 1, false );
    SubLFiles.declareFunction( me, "do_string_substitutions_robust", "DO-STRING-SUBSTITUTIONS-ROBUST", 2, 1, false );
    SubLFiles.declareFunction( me, "insert_escape_for_chars_in_string", "INSERT-ESCAPE-FOR-CHARS-IN-STRING", 2, 0, false );
    SubLFiles.declareFunction( me, "html_escaped_string_p", "HTML-ESCAPED-STRING-P", 1, 0, false );
    SubLFiles.declareFunction( me, "remove_last_char", "REMOVE-LAST-CHAR", 1, 1, false );
    SubLFiles.declareFunction( me, "remove_substring", "REMOVE-SUBSTRING", 2, 0, false );
    SubLFiles.declareFunction( me, "replace_substring", "REPLACE-SUBSTRING", 3, 0, false );
    SubLFiles.declareFunction( me, "replace_substring_once", "REPLACE-SUBSTRING-ONCE", 3, 1, false );
    SubLFiles.declareFunction( me, "nreplace_substring_at", "NREPLACE-SUBSTRING-AT", 4, 0, false );
    SubLFiles.declareFunction( me, "infix", "INFIX", 3, 0, false );
    SubLFiles.declareFunction( me, "post_fix", "POST-FIX", 2, 0, false );
    SubLFiles.declareFunction( me, "pre_fix", "PRE-FIX", 2, 0, false );
    SubLFiles.declareFunction( me, "post_remove", "POST-REMOVE", 2, 1, false );
    SubLFiles.declareFunction( me, "pre_remove", "PRE-REMOVE", 2, 1, false );
    SubLFiles.declareFunction( me, "substring", "SUBSTRING", 2, 1, false );
    SubLFiles.declareFunction( me, "string_first_n", "STRING-FIRST-N", 2, 0, false );
    SubLFiles.declareFunction( me, "string_last_n", "STRING-LAST-N", 2, 0, false );
    SubLFiles.declareFunction( me, "string_butlast", "STRING-BUTLAST", 1, 0, false );
    SubLFiles.declareFunction( me, "ends_with", "ENDS-WITH", 2, 1, false );
    SubLFiles.declareFunction( me, "ends_with_one_of", "ENDS-WITH-ONE-OF", 2, 0, false );
    SubLFiles.declareFunction( me, "ends_with_punctuation_p", "ENDS-WITH-PUNCTUATION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "ends_with_number_p", "ENDS-WITH-NUMBER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "ends_with_number", "ENDS-WITH-NUMBER", 1, 0, false );
    SubLFiles.declareFunction( me, "starts_with", "STARTS-WITH", 2, 0, false );
    SubLFiles.declareFunction( me, "starts_with_one_of", "STARTS-WITH-ONE-OF", 2, 0, false );
    SubLFiles.declareFunction( me, "starts_with_by_test", "STARTS-WITH-BY-TEST", 2, 1, false );
    SubLFiles.declareFunction( me, "starts_with_one_of_by_test", "STARTS-WITH-ONE-OF-BY-TEST", 2, 1, false );
    SubLFiles.declareFunction( me, "starting_string", "STARTING-STRING", 2, 1, false );
    SubLFiles.declareFunction( me, "ends_with_start_of", "ENDS-WITH-START-OF", 2, 2, false );
    SubLFiles.declareFunction( me, "number_of_commas", "NUMBER-OF-COMMAS", 1, 0, false );
    SubLFiles.declareFunction( me, "comma_sub_string", "COMMA-SUB-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "concatenate_adjacent_strings", "CONCATENATE-ADJACENT-STRINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "string_starts_with_constant_reader_prefix_p", "STRING-STARTS-WITH-CONSTANT-READER-PREFIX-P", 1, 0, false );
    SubLFiles.declareFunction( me, "string_contains_constant_reader_prefix_p", "STRING-CONTAINS-CONSTANT-READER-PREFIX-P", 1, 0, false );
    SubLFiles.declareFunction( me, "string_add_constant_reader_prefix", "STRING-ADD-CONSTANT-READER-PREFIX", 1, 0, false );
    SubLFiles.declareFunction( me, "string_remove_constant_reader_prefix", "STRING-REMOVE-CONSTANT-READER-PREFIX", 1, 0, false );
    SubLFiles.declareFunction( me, "string_remove_constant_reader_prefixes", "STRING-REMOVE-CONSTANT-READER-PREFIXES", 1, 0, false );
    SubLFiles.declareFunction( me, "one_is_starting_string", "ONE-IS-STARTING-STRING", 2, 1, false );
    SubLFiles.declareFunction( me, "strings_common_prefix", "STRINGS-COMMON-PREFIX", 1, 2, false );
    SubLFiles.declareFunction( me, "char_position", "CHAR-POSITION", 2, 1, false );
    SubLFiles.declareFunction( me, "string_upto", "STRING-UPTO", 1, 1, false );
    SubLFiles.declareFunction( me, "string_after", "STRING-AFTER", 1, 1, false );
    SubLFiles.declareFunction( me, "string_between", "STRING-BETWEEN", 1, 2, false );
    SubLFiles.declareFunction( me, "get_substring_between_tags", "GET-SUBSTRING-BETWEEN-TAGS", 3, 2, false );
    SubLFiles.declareFunction( me, "get_substring_between_tags_list", "GET-SUBSTRING-BETWEEN-TAGS-LIST", 3, 2, false );
    SubLFiles.declareFunction( me, "get_end_pos", "GET-END-POS", 4, 0, false );
    SubLFiles.declareFunction( me, "strip_header", "STRIP-HEADER", 2, 0, false );
    SubLFiles.declareFunction( me, "strip_trailer", "STRIP-TRAILER", 2, 0, false );
    SubLFiles.declareFunction( me, "strip_first", "STRIP-FIRST", 1, 0, false );
    SubLFiles.declareFunction( me, "strip_final", "STRIP-FINAL", 1, 1, false );
    SubLFiles.declareFunction( me, "strip_first_if_char", "STRIP-FIRST-IF-CHAR", 2, 0, false );
    SubLFiles.declareFunction( me, "strip_final_if_char", "STRIP-FINAL-IF-CHAR", 2, 0, false );
    SubLFiles.declareFunction( me, "strip_first_n", "STRIP-FIRST-N", 2, 0, false );
    SubLFiles.declareFunction( me, "strip_final_n", "STRIP-FINAL-N", 2, 0, false );
    SubLFiles.declareFunction( me, "strip_punctuation", "STRIP-PUNCTUATION", 1, 0, false );
    SubLFiles.declareFunction( me, "strip_sentential_punctuation", "STRIP-SENTENTIAL-PUNCTUATION", 1, 0, false );
    SubLFiles.declareFunction( me, "ends_in_geminateP", "ENDS-IN-GEMINATE?", 1, 0, false );
    SubLFiles.declareFunction( me, "null_stringP", "NULL-STRING?", 1, 0, false );
    SubLFiles.declareFunction( me, "non_empty_stringP", "NON-EMPTY-STRING?", 1, 0, false );
    SubLFiles.declareFunction( me, "non_empty_cycl_stringP", "NON-EMPTY-CYCL-STRING?", 1, 0, false );
    SubLFiles.declareFunction( me, "non_empty_subl_stringP", "NON-EMPTY-SUBL-STRING?", 1, 0, false );
    SubLFiles.declareFunction( me, "char_set_position", "CHAR-SET-POSITION", 2, 2, false );
    SubLFiles.declareFunction( me, "char_type_position", "CHAR-TYPE-POSITION", 2, 2, false );
    SubLFiles.declareFunction( me, "space_p", "SPACE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "non_space_char_p", "NON-SPACE-CHAR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "tab_p", "TAB-P", 1, 0, false );
    SubLFiles.declareFunction( me, "non_tab_char_p", "NON-TAB-CHAR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "not_digit_char_p", "NOT-DIGIT-CHAR-P", 1, 0, false );
    new $not_digit_char_p$UnaryFunction();
    SubLFiles.declareFunction( me, "isa_digit_charP", "ISA-DIGIT-CHAR?", 1, 0, false );
    SubLFiles.declareFunction( me, "digit_stringP", "DIGIT-STRING?", 1, 0, false );
    SubLFiles.declareFunction( me, "alphanumeric_stringP", "ALPHANUMERIC-STRING?", 1, 0, false );
    SubLFiles.declareFunction( me, "alphanumeric_char_p", "ALPHANUMERIC-CHAR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "alphabetic_char_p", "ALPHABETIC-CHAR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "partially_numeric_stringP", "PARTIALLY-NUMERIC-STRING?", 1, 0, false );
    SubLFiles.declareFunction( me, "alphabetic_stringP", "ALPHABETIC-STRING?", 1, 0, false );
    SubLFiles.declareFunction( me, "non_alphabetic_stringP", "NON-ALPHABETIC-STRING?", 1, 0, false );
    SubLFiles.declareFunction( me, "is_numericP", "IS-NUMERIC?", 1, 0, false );
    SubLFiles.declareFunction( me, "is_numeric_rangeP", "IS-NUMERIC-RANGE?", 1, 0, false );
    SubLFiles.declareFunction( me, "parse_numeric_range", "PARSE-NUMERIC-RANGE", 1, 0, false );
    SubLFiles.declareFunction( me, "ordinal", "ORDINAL", 1, 0, false );
    SubLFiles.declareFunction( me, "english_ordinal_number_string_p", "ENGLISH-ORDINAL-NUMBER-STRING-P", 1, 0, false );
    SubLFiles.declareFunction( me, "english_ordinal_string_to_cardinal_string", "ENGLISH-ORDINAL-STRING-TO-CARDINAL-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "integer_suffix", "INTEGER-SUFFIX", 1, 0, false );
    SubLFiles.declareFunction( me, "set_nth_char", "SET-NTH-CHAR", 3, 1, false );
    SubLFiles.declareFunction( me, "strip_chars_meeting_test", "STRIP-CHARS-MEETING-TEST", 1, 1, false );
    SubLFiles.declareFunction( me, "substitute_char_if", "SUBSTITUTE-CHAR-IF", 2, 1, false );
    SubLFiles.declareFunction( me, "string_wXo_control_charsP", "STRING-W/O-CONTROL-CHARS?", 1, 0, false );
    new $string_wXo_control_charsP$UnaryFunction();
    SubLFiles.declareFunction( me, "control_char_p", "CONTROL-CHAR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "utf_8_combining_character_p", "UTF-8-COMBINING-CHARACTER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "integer_char_p", "INTEGER-CHAR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "contains_charP", "CONTAINS-CHAR?", 2, 0, false );
    SubLFiles.declareFunction( me, "char_in_char_set", "CHAR-IN-CHAR-SET", 1, 0, false );
    new $char_in_char_set$UnaryFunction();
    SubLFiles.declareFunction( me, "split_string", "SPLIT-STRING", 1, 1, false );
    SubLFiles.declareFunction( me, "split_string_on_string", "SPLIT-STRING-ON-STRING", 2, 0, false );
    SubLFiles.declareFunction( me, "string_rotations", "STRING-ROTATIONS", 1, 4, false );
    SubLFiles.declareFunction( me, "string_rotation_int", "STRING-ROTATION-INT", 6, 0, false );
    SubLFiles.declareFunction( me, "substringP", "SUBSTRING?", 2, 3, false );
    SubLFiles.declareFunction( me, "superstringP", "SUPERSTRING?", 2, 2, false );
    SubLFiles.declareFunction( me, "proper_superstringP", "PROPER-SUPERSTRING?", 2, 2, false );
    SubLFiles.declareFunction( me, "substring_matchP", "SUBSTRING-MATCH?", 3, 1, false );
    SubLFiles.declareFunction( me, "search_all", "SEARCH-ALL", 2, 2, false );
    SubLFiles.declareFunction( me, "count_matches", "COUNT-MATCHES", 2, 2, false );
    SubLFiles.declareFunction( me, "subwordP", "SUBWORD?", 2, 2, false );
    SubLFiles.declareFunction( me, "bunge", "BUNGE", 1, 1, false );
    SubLFiles.declareFunction( me, "bunge_with_string", "BUNGE-WITH-STRING", 1, 1, false );
    SubLFiles.declareFunction( me, "offsets_of_token", "OFFSETS-OF-TOKEN", 2, 0, false );
    SubLFiles.declareFunction( me, "string_of_allowed_charsP", "STRING-OF-ALLOWED-CHARS?", 2, 0, false );
    SubLFiles.declareFunction( me, "bunge_according_to_string", "BUNGE-ACCORDING-TO-STRING", 2, 3, false );
    SubLFiles.declareFunction( me, "bunge_according_to_string_ignoring_errors", "BUNGE-ACCORDING-TO-STRING-IGNORING-ERRORS", 2, 0, false );
    SubLFiles.declareFunction( me, "concatenate_strings", "CONCATENATE-STRINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "strings_to_display_vector_strings", "STRINGS-TO-DISPLAY-VECTOR-STRINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "join_strings", "JOIN-STRINGS", 1, 1, false );
    SubLFiles.declareFunction( me, "quoted_join_strings", "QUOTED-JOIN-STRINGS", 1, 2, false );
    SubLFiles.declareFunction( me, "camel_case_to_underscores", "CAMEL-CASE-TO-UNDERSCORES", 1, 0, false );
    SubLFiles.declareFunction( me, "capitalize_first", "CAPITALIZE-FIRST", 1, 0, false );
    SubLFiles.declareFunction( me, "uncapitalize_first", "UNCAPITALIZE-FIRST", 1, 0, false );
    SubLFiles.declareFunction( me, "nth_word_of_string", "NTH-WORD-OF-STRING", 2, 0, false );
    SubLFiles.declareFunction( me, "capitalize_smart", "CAPITALIZE-SMART", 1, 0, false );
    SubLFiles.declareFunction( me, "uncapitalize_smart", "UNCAPITALIZE-SMART", 1, 0, false );
    SubLFiles.declareFunction( me, "properly_capitalized_stringP", "PROPERLY-CAPITALIZED-STRING?", 1, 0, false );
    SubLFiles.declareFunction( me, "capitalized_string_p", "CAPITALIZED-STRING-P", 1, 0, false );
    SubLFiles.declareFunction( me, "string_encode_capitalization", "STRING-ENCODE-CAPITALIZATION", 1, 0, false );
    SubLFiles.declareFunction( me, "string_has_capitalization_p", "STRING-HAS-CAPITALIZATION-P", 2, 0, false );
    SubLFiles.declareFunction( me, "string_has_capitalization_p_mod", "STRING-HAS-CAPITALIZATION-P-MOD", 2, 0, false );
    SubLFiles.declareFunction( me, "string_has_capitalization_p_expt", "STRING-HAS-CAPITALIZATION-P-EXPT", 2, 0, false );
    SubLFiles.declareFunction( me, "nstring_proper", "NSTRING-PROPER", 1, 4, false );
    SubLFiles.declareFunction( me, "string_proper", "STRING-PROPER", 1, 4, false );
    SubLFiles.declareFunction( me, "space_uncapitalize", "SPACE-UNCAPITALIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "space_dont_uncapitalize", "SPACE-DONT-UNCAPITALIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "add_space_between_chars_p", "ADD-SPACE-BETWEEN-CHARS-P", 3, 0, false );
    SubLFiles.declareFunction( me, "eat_char_p", "EAT-CHAR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "capitalize_initial_char_p", "CAPITALIZE-INITIAL-CHAR-P", 2, 0, false );
    SubLFiles.declareFunction( me, "string_downcase_except_acronyms", "STRING-DOWNCASE-EXCEPT-ACRONYMS", 1, 0, false );
    SubLFiles.declareFunction( me, "string_ndowncase_except_acronyms", "STRING-NDOWNCASE-EXCEPT-ACRONYMS", 1, 0, false );
    SubLFiles.declareFunction( me, "hex_char_p", "HEX-CHAR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "hex_char", "HEX-CHAR", 1, 0, false );
    SubLFiles.declareFunction( me, "hex_char_value", "HEX-CHAR-VALUE", 1, 0, false );
    SubLFiles.declareFunction( me, "hex_char_string_p", "HEX-CHAR-STRING-P", 1, 0, false );
    SubLFiles.declareFunction( me, "hex_string_p", "HEX-STRING-P", 1, 0, false );
    SubLFiles.declareFunction( me, "hex_string_p_int", "HEX-STRING-P-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "integer_to_hex_string", "INTEGER-TO-HEX-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "f_64_bit_char_p", "64-BIT-CHAR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "f_64_bit_char", "64-BIT-CHAR", 1, 0, false );
    SubLFiles.declareFunction( me, "f_64_bit_char_value", "64-BIT-CHAR-VALUE", 1, 0, false );
    SubLFiles.declareFunction( me, "f_64_bit_string_p", "64-BIT-STRING-P", 1, 0, false );
    SubLFiles.declareFunction( me, "upper_case_alphanumeric_p", "UPPER-CASE-ALPHANUMERIC-P", 1, 0, false );
    SubLFiles.declareFunction( me, "punctuation_p", "PUNCTUATION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "punctuation_extended_p", "PUNCTUATION-EXTENDED-P", 1, 0, false );
    SubLFiles.declareFunction( me, "punctuation_string_p", "PUNCTUATION-STRING-P", 1, 0, false );
    SubLFiles.declareFunction( me, "remove_punctuation", "REMOVE-PUNCTUATION", 1, 0, false );
    SubLFiles.declareFunction( me, "upper_case_char_p", "UPPER-CASE-CHAR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "lower_case_char_p", "LOWER-CASE-CHAR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "upper_case_string_p", "UPPER-CASE-STRING-P", 1, 0, false );
    SubLFiles.declareFunction( me, "lower_case_string_p", "LOWER-CASE-STRING-P", 1, 0, false );
    SubLFiles.declareFunction( me, "string_list_downcase", "STRING-LIST-DOWNCASE", 1, 0, false );
    SubLFiles.declareFunction( me, "string_list_upcase", "STRING-LIST-UPCASE", 1, 0, false );
    SubLFiles.declareFunction( me, "nupcase_nth", "NUPCASE-NTH", 2, 1, false );
    SubLFiles.declareFunction( me, "nupcase_leading", "NUPCASE-LEADING", 1, 0, false );
    SubLFiles.declareFunction( me, "upcase_leading", "UPCASE-LEADING", 1, 0, false );
    SubLFiles.declareFunction( me, "ndowncase_nth", "NDOWNCASE-NTH", 2, 1, false );
    SubLFiles.declareFunction( me, "ndowncase_leading", "NDOWNCASE-LEADING", 1, 0, false );
    SubLFiles.declareFunction( me, "downcase_leading", "DOWNCASE-LEADING", 1, 0, false );
    SubLFiles.declareFunction( me, "all_chars_EP", "ALL-CHARS-=?", 2, 0, false );
    SubLFiles.declareFunction( me, "string_contains_only_charsP", "STRING-CONTAINS-ONLY-CHARS?", 2, 0, false );
    SubLFiles.declareFunction( me, "whitespace_chars", "WHITESPACE-CHARS", 0, 0, false );
    SubLFiles.declareFunction( me, "whitespace_charP", "WHITESPACE-CHAR?", 1, 0, false );
    SubLFiles.declareFunction( me, "grammatical_punctuation_chars", "GRAMMATICAL-PUNCTUATION-CHARS", 0, 0, false );
    SubLFiles.declareFunction( me, "grammatical_punctuation_charP", "GRAMMATICAL-PUNCTUATION-CHAR?", 1, 0, false );
    SubLFiles.declareFunction( me, "trim_whitespace", "TRIM-WHITESPACE", 1, 0, false );
    SubLFiles.declareFunction( me, "left_trim_whitespace", "LEFT-TRIM-WHITESPACE", 1, 0, false );
    SubLFiles.declareFunction( me, "right_trim_whitespace", "RIGHT-TRIM-WHITESPACE", 1, 0, false );
    SubLFiles.declareFunction( me, "trim_whitespace_if_string", "TRIM-WHITESPACE-IF-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "nsubst_whitespace", "NSUBST-WHITESPACE", 1, 0, false );
    SubLFiles.declareFunction( me, "normalize_spaces", "NORMALIZE-SPACES", 1, 0, false );
    SubLFiles.declareFunction( me, "subst_whitespace", "SUBST-WHITESPACE", 1, 0, false );
    SubLFiles.declareFunction( me, "whitespacep", "WHITESPACEP", 1, 0, false );
    new $whitespacep$UnaryFunction();
    SubLFiles.declareFunction( me, "unicode_space_char_code_p", "UNICODE-SPACE-CHAR-CODE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "non_whitespace_p", "NON-WHITESPACE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "read_whitespace_no_hang", "READ-WHITESPACE-NO-HANG", 0, 3, false );
    SubLFiles.declareFunction( me, "whitespace_stringP", "WHITESPACE-STRING?", 1, 0, false );
    SubLFiles.declareFunction( me, "trim_quotes", "TRIM-QUOTES", 1, 1, false );
    SubLFiles.declareFunction( me, "remove_whitespace", "REMOVE-WHITESPACE", 1, 0, false );
    SubLFiles.declareFunction( me, "equal_modulo_whitespace", "EQUAL-MODULO-WHITESPACE", 2, 0, false );
    SubLFiles.declareFunction( me, "equalp_modulo_whitespace", "EQUALP-MODULO-WHITESPACE", 2, 0, false );
    SubLFiles.declareFunction( me, "substringP_modulo_whitespace", "SUBSTRING?-MODULO-WHITESPACE", 2, 0, false );
    SubLFiles.declareFunction( me, "network_terpri", "NETWORK-TERPRI", 1, 0, false );
    SubLFiles.declareFunction( me, "add_to_buffer", "ADD-TO-BUFFER", 3, 0, false );
    SubLFiles.declareFunction( me, "network_read_line", "NETWORK-READ-LINE", 0, 4, false );
    SubLFiles.declareFunction( me, "read_possibly_continued_line", "READ-POSSIBLY-CONTINUED-LINE", 0, 3, false );
    SubLFiles.declareFunction( me, "find_earliest_string", "FIND-EARLIEST-STRING", 2, 2, false );
    SubLFiles.declareFunction( me, "search_last", "SEARCH-LAST", 2, 2, false );
    SubLFiles.declareFunction( me, "princ_substring", "PRINC-SUBSTRING", 2, 2, false );
    SubLFiles.declareFunction( me, "strcat", "STRCAT", 1, 0, false );
    SubLFiles.declareFunction( me, "nchar_subst", "NCHAR-SUBST", 3, 0, false );
    SubLFiles.declareFunction( me, "char_subst", "CHAR-SUBST", 3, 0, false );
    SubLFiles.declareFunction( me, "nchar_subst_if", "NCHAR-SUBST-IF", 3, 0, false );
    SubLFiles.declareFunction( me, "char_subst_if", "CHAR-SUBST-IF", 3, 0, false );
    SubLFiles.declareFunction( me, "nchar_subst_if_not", "NCHAR-SUBST-IF-NOT", 3, 0, false );
    SubLFiles.declareFunction( me, "char_subst_if_not", "CHAR-SUBST-IF-NOT", 3, 0, false );
    SubLFiles.declareFunction( me, "string_subst", "STRING-SUBST", 3, 1, false );
    SubLFiles.declareFunction( me, "trim_sides", "TRIM-SIDES", 1, 1, false );
    SubLFiles.declareFunction( me, "valid_timestring_charP", "VALID-TIMESTRING-CHAR?", 1, 0, false );
    SubLFiles.declareFunction( me, "string_trim_symmetric_n", "STRING-TRIM-SYMMETRIC-N", 2, 1, false );
    SubLFiles.declareFunction( me, "break_words", "BREAK-WORDS", 1, 2, false );
    SubLFiles.declareFunction( me, "sub_phrases", "SUB-PHRASES", 1, 0, false );
    SubLFiles.declareFunction( me, "number_of_words", "NUMBER-OF-WORDS", 1, 0, false );
    SubLFiles.declareFunction( me, "first_word", "FIRST-WORD", 1, 1, false );
    SubLFiles.declareFunction( me, "substring_positions", "SUBSTRING-POSITIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "break_string", "BREAK-STRING", 2, 0, false );
    SubLFiles.declareFunction( me, "first_name_first", "FIRST-NAME-FIRST", 1, 0, false );
    SubLFiles.declareFunction( me, "char_list_to_string", "CHAR-LIST-TO-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "string_to_char_list", "STRING-TO-CHAR-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "count_chars_in_string", "COUNT-CHARS-IN-STRING", 2, 0, false );
    SubLFiles.declareFunction( me, "some_are_substringsP", "SOME-ARE-SUBSTRINGS?", 2, 1, false );
    SubLFiles.declareFunction( me, "substring_every_in_list", "SUBSTRING-EVERY-IN-LIST", 2, 1, false );
    SubLFiles.declareFunction( me, "target_character_found", "TARGET-CHARACTER-FOUND", 1, 0, false );
    SubLFiles.declareFunction( me, "separate_sentences", "SEPARATE-SENTENCES", 1, 1, false );
    SubLFiles.declareFunction( me, "extract_lines", "EXTRACT-LINES", 1, 0, false );
    SubLFiles.declareFunction( me, "collapse_lines", "COLLAPSE-LINES", 1, 0, false );
    SubLFiles.declareFunction( me, "quotify_string", "QUOTIFY-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "string_line_lengths", "STRING-LINE-LENGTHS", 1, 0, false );
    SubLFiles.declareFunction( me, "relevant_substrings", "RELEVANT-SUBSTRINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "make_valid_constant_name", "MAKE-VALID-CONSTANT-NAME", 1, 1, false );
    SubLFiles.declareFunction( me, "nl_string_tokenize", "NL-STRING-TOKENIZE", 1, 6, false );
    SubLFiles.declareFunction( me, "string_tokenize", "STRING-TOKENIZE", 1, 6, false );
    SubLFiles.declareFunction( me, "string_tokenize_int", "STRING-TOKENIZE-INT", 1, 6, false );
    SubLFiles.declareFunction( me, "string_tokenize_break_length", "STRING-TOKENIZE-BREAK-LENGTH", 1, 0, false );
    SubLFiles.declareFunction( me, "string_tokenize_break_matchP", "STRING-TOKENIZE-BREAK-MATCH?", 3, 0, false );
    SubLFiles.declareFunction( me, "listify_string", "LISTIFY-STRING", 1, 1, false );
    SubLFiles.declareFunction( me, "all_parens_matchedP", "ALL-PARENS-MATCHED?", 1, 2, false );
    SubLFiles.declareFunction( me, "unmatched_parentheses", "UNMATCHED-PARENTHESES", 1, 2, false );
    SubLFiles.declareFunction( me, "unmatched_parentheses_terse_hint", "UNMATCHED-PARENTHESES-TERSE-HINT", 1, 2, false );
    SubLFiles.declareFunction( me, "byte_string_p", "BYTE-STRING-P", 1, 0, false );
    SubLFiles.declareFunction( me, "ip_address_p", "IP-ADDRESS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "ip_addressL", "IP-ADDRESS<", 2, 0, false );
    SubLFiles.declareFunction( me, "get_trigraph_metric", "GET-TRIGRAPH-METRIC", 0, 0, false );
    SubLFiles.declareFunction( me, "set_trigraph_metric", "SET-TRIGRAPH-METRIC", 0, 1, false );
    SubLFiles.declareFunction( me, "get_trigraph_table", "GET-TRIGRAPH-TABLE", 0, 0, false );
    SubLFiles.declareFunction( me, "free_trigraph_table", "FREE-TRIGRAPH-TABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "plural_length_to_subtract", "PLURAL-LENGTH-TO-SUBTRACT", 1, 0, false );
    SubLFiles.declareFunction( me, "update_string1_table", "UPDATE-STRING1-TABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "make_trigraph_integer_code", "MAKE-TRIGRAPH-INTEGER-CODE", 3, 0, false );
    SubLFiles.declareFunction( me, "string_trigraph_match_p", "STRING-TRIGRAPH-MATCH-P", 2, 2, false );
    SubLFiles.declareFunction( me, "stringify_terms", "STRINGIFY-TERMS", 1, 2, false );
    SubLFiles.declareFunction( me, "fort_print_name", "FORT-PRINT-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "stringify_items", "STRINGIFY-ITEMS", 1, 3, false );
    SubLFiles.declareFunction( me, "str_by_type", "STR-BY-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "add_line", "ADD-LINE", 2, 2, false );
    SubLFiles.declareFunction( me, "cyclify_status_print_function_trampoline", "CYCLIFY-STATUS-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "cyclify_status_p", "CYCLIFY-STATUS-P", 1, 0, false );
    new $cyclify_status_p$UnaryFunction();
    SubLFiles.declareFunction( me, "cyclify_status_out_string_list", "CYCLIFY-STATUS-OUT-STRING-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "cyclify_status_references_added", "CYCLIFY-STATUS-REFERENCES-ADDED", 1, 0, false );
    SubLFiles.declareFunction( me, "cyclify_status_inside_quoteP", "CYCLIFY-STATUS-INSIDE-QUOTE?", 1, 0, false );
    SubLFiles.declareFunction( me, "cyclify_status_inside_el_var_nameP", "CYCLIFY-STATUS-INSIDE-EL-VAR-NAME?", 1, 0, false );
    SubLFiles.declareFunction( me, "cyclify_status_already_cyclifiedP", "CYCLIFY-STATUS-ALREADY-CYCLIFIED?", 1, 0, false );
    SubLFiles.declareFunction( me, "cyclify_status_escapeP", "CYCLIFY-STATUS-ESCAPE?", 1, 0, false );
    SubLFiles.declareFunction( me, "cyclify_status_inside_subl_quote_fnP", "CYCLIFY-STATUS-INSIDE-SUBL-QUOTE-FN?", 1, 0, false );
    SubLFiles.declareFunction( me, "cyclify_status_inside_expand_subl_fnP", "CYCLIFY-STATUS-INSIDE-EXPAND-SUBL-FN?", 1, 0, false );
    SubLFiles.declareFunction( me, "cyclify_status_inside_expand_subl_fn_arg1P", "CYCLIFY-STATUS-INSIDE-EXPAND-SUBL-FN-ARG1?", 1, 0, false );
    SubLFiles.declareFunction( me, "cyclify_status_inside_expand_subl_fn_arg2P", "CYCLIFY-STATUS-INSIDE-EXPAND-SUBL-FN-ARG2?", 1, 0, false );
    SubLFiles.declareFunction( me, "cyclify_status_immediately_following_parenP", "CYCLIFY-STATUS-IMMEDIATELY-FOLLOWING-PAREN?", 1, 0, false );
    SubLFiles.declareFunction( me, "cyclify_status_paren_count", "CYCLIFY-STATUS-PAREN-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_cyclify_status_out_string_list", "_CSETF-CYCLIFY-STATUS-OUT-STRING-LIST", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_cyclify_status_references_added", "_CSETF-CYCLIFY-STATUS-REFERENCES-ADDED", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_cyclify_status_inside_quoteP", "_CSETF-CYCLIFY-STATUS-INSIDE-QUOTE?", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_cyclify_status_inside_el_var_nameP", "_CSETF-CYCLIFY-STATUS-INSIDE-EL-VAR-NAME?", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_cyclify_status_already_cyclifiedP", "_CSETF-CYCLIFY-STATUS-ALREADY-CYCLIFIED?", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_cyclify_status_escapeP", "_CSETF-CYCLIFY-STATUS-ESCAPE?", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_cyclify_status_inside_subl_quote_fnP", "_CSETF-CYCLIFY-STATUS-INSIDE-SUBL-QUOTE-FN?", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_cyclify_status_inside_expand_subl_fnP", "_CSETF-CYCLIFY-STATUS-INSIDE-EXPAND-SUBL-FN?", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_cyclify_status_inside_expand_subl_fn_arg1P", "_CSETF-CYCLIFY-STATUS-INSIDE-EXPAND-SUBL-FN-ARG1?", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_cyclify_status_inside_expand_subl_fn_arg2P", "_CSETF-CYCLIFY-STATUS-INSIDE-EXPAND-SUBL-FN-ARG2?", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_cyclify_status_immediately_following_parenP", "_CSETF-CYCLIFY-STATUS-IMMEDIATELY-FOLLOWING-PAREN?", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_cyclify_status_paren_count", "_CSETF-CYCLIFY-STATUS-PAREN-COUNT", 2, 0, false );
    SubLFiles.declareFunction( me, "make_cyclify_status", "MAKE-CYCLIFY-STATUS", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_cyclify_status", "VISIT-DEFSTRUCT-CYCLIFY-STATUS", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_cyclify_status_method", "VISIT-DEFSTRUCT-OBJECT-CYCLIFY-STATUS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cyclify_string_initialize_cyclify_status", "CYCLIFY-STRING-INITIALIZE-CYCLIFY-STATUS", 0, 0, false );
    SubLFiles.declareFunction( me, "cyclify_string_possibly_cyclify_string", "CYCLIFY-STRING-POSSIBLY-CYCLIFY-STRING", 2, 0, false );
    SubLFiles.declareFunction( me, "cyclify_string_not_inside_quote_and_not_escapedP", "CYCLIFY-STRING-NOT-INSIDE-QUOTE-AND-NOT-ESCAPED?", 1, 0, false );
    SubLFiles.declareFunction( me, "cyclify_string_found_quoteP", "CYCLIFY-STRING-FOUND-QUOTE?", 2, 0, false );
    SubLFiles.declareFunction( me, "cyclify_string_found_open_parenP", "CYCLIFY-STRING-FOUND-OPEN-PAREN?", 2, 0, false );
    SubLFiles.declareFunction( me, "cyclify_string_found_close_parenP", "CYCLIFY-STRING-FOUND-CLOSE-PAREN?", 2, 0, false );
    SubLFiles.declareFunction( me, "cyclify_string_add_to_out_string_list", "CYCLIFY-STRING-ADD-TO-OUT-STRING-LIST", 2, 0, false );
    SubLFiles.declareFunction( me, "cyclify_string_check_for_escape_to_subl", "CYCLIFY-STRING-CHECK-FOR-ESCAPE-TO-SUBL", 2, 0, false );
    SubLFiles.declareFunction( me, "cyclify_string_handle_last_valid_char", "CYCLIFY-STRING-HANDLE-LAST-VALID-CHAR", 3, 0, false );
    SubLFiles.declareFunction( me, "cyclify_string_handle_open_paren_int", "CYCLIFY-STRING-HANDLE-OPEN-PAREN-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "cyclify_string_handle_close_paren_int", "CYCLIFY-STRING-HANDLE-CLOSE-PAREN-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "cyclify_string_handle_end_of_current_word", "CYCLIFY-STRING-HANDLE-END-OF-CURRENT-WORD", 5, 0, false );
    SubLFiles.declareFunction( me, "cyclify_string", "CYCLIFY-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "constant_names_in_string", "CONSTANT-NAMES-IN-STRING", 1, 1, false );
    SubLFiles.declareFunction( me, "invalid_constant_names_in_string", "INVALID-CONSTANT-NAMES-IN-STRING", 1, 1, false );
    SubLFiles.declareFunction( me, "invalid_constant_names_in_stringP", "INVALID-CONSTANT-NAMES-IN-STRING?", 1, 1, false );
    SubLFiles.declareFunction( me, "nonbreak_char", "NONBREAK-CHAR", 1, 0, false );
    SubLFiles.declareFunction( me, "read_string_until_char", "READ-STRING-UNTIL-CHAR", 2, 1, false );
    SubLFiles.declareFunction( me, "align_char", "ALIGN-CHAR", 4, 1, false );
    SubLFiles.declareFunction( me, "right_justify", "RIGHT-JUSTIFY", 2, 1, false );
    SubLFiles.declareFunction( me, "left_justify", "LEFT-JUSTIFY", 2, 1, false );
    SubLFiles.declareFunction( me, "center_string", "CENTER-STRING", 2, 1, false );
    SubLFiles.declareFunction( me, "print_length", "PRINT-LENGTH", 1, 0, false );
    SubLFiles.declareFunction( me, "tab", "TAB", 1, 4, false );
    SubLFiles.declareFunction( me, "tabstr", "TABSTR", 1, 1, false );
    SubLFiles.declareFunction( me, "reduce_whitespace", "REDUCE-WHITESPACE", 1, 0, false );
    SubLFiles.declareFunction( me, "compute_reduced_length", "COMPUTE-REDUCED-LENGTH", 1, 0, false );
    SubLFiles.declareFunction( me, "single_word_string_p", "SINGLE-WORD-STRING-P", 1, 0, false );
    SubLFiles.declareFunction( me, "multi_word_string", "MULTI-WORD-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "multi_word_quote", "MULTI-WORD-QUOTE", 1, 0, false );
    SubLFiles.declareFunction( me, "process_file", "PROCESS-FILE", 3, 2, false );
    SubLFiles.declareFunction( me, "princ_file_to_stream", "PRINC-FILE-TO-STREAM", 2, 2, false );
    SubLFiles.declareFunction( me, "read_string_from_file", "READ-STRING-FROM-FILE", 1, 2, false );
    SubLFiles.declareFunction( me, "uniquify_string", "UNIQUIFY-STRING", 2, 2, false );
    SubLFiles.declareFunction( me, "uniquify_string_via_set", "UNIQUIFY-STRING-VIA-SET", 2, 1, false );
    SubLFiles.declareFunction( me, "possibly_read_from_string_ignoring_errors", "POSSIBLY-READ-FROM-STRING-IGNORING-ERRORS", 2, 0, false );
    SubLFiles.declareFunction( me, "random_string", "RANDOM-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "alphacize", "ALPHACIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "alphanumericize", "ALPHANUMERICIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "alphanumeric_or_hyphen_p", "ALPHANUMERIC-OR-HYPHEN-P", 1, 0, false );
    SubLFiles.declareFunction( me, "alpha_or_underscore_p", "ALPHA-OR-UNDERSCORE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "alphanumericize_admitting_hyphens", "ALPHANUMERICIZE-ADMITTING-HYPHENS", 1, 0, false );
    SubLFiles.declareFunction( me, "alphanumeric_or_number_char_p", "ALPHANUMERIC-OR-NUMBER-CHAR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "nth_letter_of_alphabet", "NTH-LETTER-OF-ALPHABET", 1, 0, false );
    SubLFiles.declareFunction( me, "nth_letter_of_alphabet_upcase", "NTH-LETTER-OF-ALPHABET-UPCASE", 1, 0, false );
    SubLFiles.declareFunction( me, "keyword_from_string", "KEYWORD-FROM-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "pretty_keyword_from_string", "PRETTY-KEYWORD-FROM-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "non_alphanumeric_p", "NON-ALPHANUMERIC-P", 1, 0, false );
    SubLFiles.declareFunction( me, "string_from_keyword", "STRING-FROM-KEYWORD", 1, 0, false );
    SubLFiles.declareFunction( me, "keyword_impostor_p", "KEYWORD-IMPOSTOR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "keyword_from_impostor", "KEYWORD-FROM-IMPOSTOR", 1, 0, false );
    SubLFiles.declareFunction( me, "coerce_to_keyword", "COERCE-TO-KEYWORD", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_compile_from_string", "CFASL-COMPILE-FROM-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "weak_string_equal", "WEAK-STRING-EQUAL", 2, 0, false );
    SubLFiles.declareFunction( me, "comma_separated_string", "COMMA-SEPARATED-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "format_nil_test", "FORMAT-NIL-TEST", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_string_utilities_file()
  {
    $point_char$ = SubLFiles.defconstant( "*POINT-CHAR*", Characters.CHAR_period );
    $space_char$ = SubLFiles.defconstant( "*SPACE-CHAR*", Characters.CHAR_space );
    $tab_char$ = SubLFiles.defconstant( "*TAB-CHAR*", Characters.CHAR_tab );
    $empty_string$ = SubLFiles.defconstant( "*EMPTY-STRING*", $str0$ );
    $new_line_string$ = SubLFiles.defconstant( "*NEW-LINE-STRING*", Strings.make_string( ONE_INTEGER, Characters.CHAR_newline ) );
    $test_char$ = SubLFiles.defvar( "*TEST-CHAR*", NIL );
    $object_to_string_caching_state$ = SubLFiles.deflexical( "*OBJECT-TO-STRING-CACHING-STATE*", NIL );
    $char_set$ = SubLFiles.defparameter( "*CHAR-SET*", NIL );
    $64_bit_encoding_table$ = SubLFiles.defconstant( "*64-BIT-ENCODING-TABLE*", $list84 );
    $64_bit_integer_index$ = SubLFiles.deflexical( "*64-BIT-INTEGER-INDEX*", list_utilities.alist_to_hash_table( $64_bit_encoding_table$.getGlobalValue(), Symbols.symbol_function( EQL ) ) );
    $64_bit_char_index$ = SubLFiles.deflexical( "*64-BIT-CHAR-INDEX*", list_utilities.alist_to_reverse_hash_table( $64_bit_encoding_table$.getGlobalValue(), Symbols.symbol_function( EQL ) ) );
    $raw_whitespace_chars$ = SubLFiles.deflexical( "*RAW-WHITESPACE-CHARS*", $list88 );
    $whitespace_chars$ = SubLFiles.deflexical( "*WHITESPACE-CHARS*", Sequences.delete_duplicates( $raw_whitespace_chars$.getGlobalValue(), Symbols.symbol_function( $sym89$CHAR_EQUAL ), UNPROVIDED, UNPROVIDED,
        UNPROVIDED ) );
    $grammatical_punctuation_chars$ = SubLFiles.deflexical( "*GRAMMATICAL-PUNCTUATION-CHARS*", $list90 );
    $target_characters$ = SubLFiles.defparameter( "*TARGET-CHARACTERS*", NIL );
    $trigraph_metric$ = SubLFiles.defparameter( "*TRIGRAPH-METRIC*", $float117$0_8 );
    $trigraph_tables$ = SubLFiles.defparameter( "*TRIGRAPH-TABLES*", NIL );
    $cyclify_string_expand_subl_fn_strings$ = SubLFiles.defvar( "*CYCLIFY-STRING-EXPAND-SUBL-FN-STRINGS*", $list126 );
    $cyclify_string_subl_quote_fn_strings$ = SubLFiles.defvar( "*CYCLIFY-STRING-SUBL-QUOTE-FN-STRINGS*", $list127 );
    $cyclify_string_quote_chars$ = SubLFiles.defvar( "*CYCLIFY-STRING-QUOTE-CHARS*", $list128 );
    $dtp_cyclify_status$ = SubLFiles.defconstant( "*DTP-CYCLIFY-STATUS*", $sym129$CYCLIFY_STATUS );
    $string_read_buffer_size$ = SubLFiles.defparameter( "*STRING-READ-BUFFER-SIZE*", $int182$1024 );
    $string_read_buffer$ = SubLFiles.defparameter( "*STRING-READ-BUFFER*", Vectors.make_vector( $string_read_buffer_size$.getDynamicValue(), Characters.CHAR_space ) );
    return NIL;
  }

  public static SubLObject setup_string_utilities_file()
  {
    memoization_state.note_globally_cached_function( $sym13$OBJECT_TO_STRING );
    generic_testing.define_test_case_table_int( $sym36$HTML_ESCAPED_STRING_P, ConsesLow.list( new SubLObject[] { $kw37$TEST, Symbols.symbol_function( EQUAL ), $kw38$OWNER, NIL, $kw39$CLASSES, NIL, $kw40$KB, $kw41$TINY,
      $kw42$WORKING_, T
    } ), $list43 );
    generic_testing.define_test_case_table_int( $sym46$ENDS_WITH_START_OF, ConsesLow.list( new SubLObject[] { $kw37$TEST, EQUAL, $kw38$OWNER, NIL, $kw39$CLASSES, NIL, $kw40$KB, $kw41$TINY, $kw42$WORKING_, T
    } ), $list47 );
    access_macros.define_obsolete_register( $sym28$NON_EMPTY_STRING_, $list52 );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_cyclify_status$.getGlobalValue(), Symbols.symbol_function( $sym136$CYCLIFY_STATUS_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list137 );
    Structures.def_csetf( $sym138$CYCLIFY_STATUS_OUT_STRING_LIST, $sym139$_CSETF_CYCLIFY_STATUS_OUT_STRING_LIST );
    Structures.def_csetf( $sym140$CYCLIFY_STATUS_REFERENCES_ADDED, $sym141$_CSETF_CYCLIFY_STATUS_REFERENCES_ADDED );
    Structures.def_csetf( $sym142$CYCLIFY_STATUS_INSIDE_QUOTE_, $sym143$_CSETF_CYCLIFY_STATUS_INSIDE_QUOTE_ );
    Structures.def_csetf( $sym144$CYCLIFY_STATUS_INSIDE_EL_VAR_NAME_, $sym145$_CSETF_CYCLIFY_STATUS_INSIDE_EL_VAR_NAME_ );
    Structures.def_csetf( $sym146$CYCLIFY_STATUS_ALREADY_CYCLIFIED_, $sym147$_CSETF_CYCLIFY_STATUS_ALREADY_CYCLIFIED_ );
    Structures.def_csetf( $sym148$CYCLIFY_STATUS_ESCAPE_, $sym149$_CSETF_CYCLIFY_STATUS_ESCAPE_ );
    Structures.def_csetf( $sym150$CYCLIFY_STATUS_INSIDE_SUBL_QUOTE_FN_, $sym151$_CSETF_CYCLIFY_STATUS_INSIDE_SUBL_QUOTE_FN_ );
    Structures.def_csetf( $sym152$CYCLIFY_STATUS_INSIDE_EXPAND_SUBL_FN_, $sym153$_CSETF_CYCLIFY_STATUS_INSIDE_EXPAND_SUBL_FN_ );
    Structures.def_csetf( $sym154$CYCLIFY_STATUS_INSIDE_EXPAND_SUBL_FN_ARG1_, $sym155$_CSETF_CYCLIFY_STATUS_INSIDE_EXPAND_SUBL_FN_ARG1_ );
    Structures.def_csetf( $sym156$CYCLIFY_STATUS_INSIDE_EXPAND_SUBL_FN_ARG2_, $sym157$_CSETF_CYCLIFY_STATUS_INSIDE_EXPAND_SUBL_FN_ARG2_ );
    Structures.def_csetf( $sym158$CYCLIFY_STATUS_IMMEDIATELY_FOLLOWING_PAREN_, $sym159$_CSETF_CYCLIFY_STATUS_IMMEDIATELY_FOLLOWING_PAREN_ );
    Structures.def_csetf( $sym160$CYCLIFY_STATUS_PAREN_COUNT, $sym161$_CSETF_CYCLIFY_STATUS_PAREN_COUNT );
    Equality.identity( $sym129$CYCLIFY_STATUS );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_cyclify_status$.getGlobalValue(), Symbols.symbol_function( $sym179$VISIT_DEFSTRUCT_OBJECT_CYCLIFY_STATUS_METHOD ) );
    access_macros.register_external_symbol( $sym180$CYCLIFY_STRING );
    generic_testing.define_test_case_table_int( $sym180$CYCLIFY_STRING, ConsesLow.list( new SubLObject[] { $kw37$TEST, NIL, $kw38$OWNER, NIL, $kw39$CLASSES, NIL, $kw40$KB, $kw210$FULL, $kw42$WORKING_, T
    } ), $list211 );
    generic_testing.define_test_case_table_int( $sym212$SUBWORD_, ConsesLow.list( new SubLObject[] { $kw37$TEST, NIL, $kw38$OWNER, NIL, $kw39$CLASSES, NIL, $kw40$KB, $kw41$TINY, $kw42$WORKING_, T
    } ), $list213 );
    generic_testing.define_test_case_table_int( $sym214$STRING_DOWNCASE_EXCEPT_ACRONYMS, ConsesLow.list( new SubLObject[] { $kw37$TEST, NIL, $kw38$OWNER, NIL, $kw39$CLASSES, NIL, $kw40$KB, $kw41$TINY, $kw42$WORKING_, T
    } ), $list215 );
    generic_testing.define_test_case_table_int( $sym216$SPACE_DONT_UNCAPITALIZE, ConsesLow.list( new SubLObject[] { $kw37$TEST, NIL, $kw38$OWNER, NIL, $kw39$CLASSES, NIL, $kw40$KB, $kw41$TINY, $kw42$WORKING_, T
    } ), $list217 );
    generic_testing.define_test_case_table_int( $sym218$QUOTED_STRING_, ConsesLow.list( new SubLObject[] { $kw37$TEST, NIL, $kw38$OWNER, NIL, $kw39$CLASSES, NIL, $kw40$KB, $kw41$TINY, $kw42$WORKING_, T
    } ), $list219 );
    generic_testing.define_test_case_table_int( $sym220$CONCATENATE_ADJACENT_STRINGS, ConsesLow.list( new SubLObject[] { $kw37$TEST, NIL, $kw38$OWNER, NIL, $kw39$CLASSES, NIL, $kw40$KB, $kw41$TINY, $kw42$WORKING_, T
    } ), $list221 );
    generic_testing.define_test_case_table_int( $sym222$FORMAT_NIL_TEST, ConsesLow.list( new SubLObject[] { $kw37$TEST, NIL, $kw38$OWNER, NIL, $kw39$CLASSES, NIL, $kw40$KB, $kw41$TINY, $kw42$WORKING_, T
    } ), $list223 );
    generic_testing.define_test_case_table_int( $sym224$HEX_INT_FROM_STRING, ConsesLow.list( new SubLObject[] { $kw37$TEST, NIL, $kw38$OWNER, NIL, $kw39$CLASSES, NIL, $kw40$KB, $kw41$TINY, $kw42$WORKING_, T
    } ), $list225 );
    return NIL;
  }

  private static SubLObject _constant_215_initializer()
  {
    return ConsesLow.list( new SubLObject[] { ConsesLow.list( ConsesLow.list( makeString( "organization Grants Franchises Of Type" ) ), makeString( "organization grants franchises of type" ) ), ConsesLow.list( ConsesLow
        .list( makeString( "identity Conditions For" ) ), makeString( "identity conditions for" ) ), ConsesLow.list( ConsesLow.list( makeString( "date Of Death" ) ), makeString( "date of death" ) ), ConsesLow.list(
            ConsesLow.list( makeString( "developer Of IBT Type" ) ), makeString( "developer of IBT type" ) ), ConsesLow.list( ConsesLow.list( makeString( "corresponding Cyc Collection" ) ), makeString(
                "corresponding cyc collection" ) ), ConsesLow.list( ConsesLow.list( makeString( "Inverse Binary Predicate Fn" ) ), makeString( "inverse binary predicate fn" ) ), ConsesLow.list( ConsesLow.list(
                    makeString( "toxin Type Produced By Organism Type" ) ), makeString( "toxin type produced by organism type" ) ), ConsesLow.list( ConsesLow.list( makeString( "european Discovery By" ) ), makeString(
                        "european discovery by" ) ), ConsesLow.list( ConsesLow.list( makeString( "construction Starting Date" ) ), makeString( "construction starting date" ) ), ConsesLow.list( ConsesLow.list( makeString(
                            "highest Peak In This Group" ) ), makeString( "highest peak in this group" ) ), ConsesLow.list( ConsesLow.list( makeString( "uml Name" ) ), makeString( "uml name" ) ), ConsesLow.list(
                                ConsesLow.list( makeString( "program Object Type Represents" ) ), makeString( "program object type represents" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                    "higher Priority Template Type Immediate" ) ), makeString( "higher priority template type immediate" ) ), ConsesLow.list( ConsesLow.list( makeString( "subcat Frame Arity" ) ),
                                        makeString( "subcat frame arity" ) ), ConsesLow.list( ConsesLow.list( makeString( "field Studies" ) ), makeString( "field studies" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                            "vulnerability Enables Attack" ) ), makeString( "vulnerability enables attack" ) ), ConsesLow.list( ConsesLow.list( makeString( "owl Defining Ontology URI" ) ), makeString(
                                                "owl defining ontology URI" ) ), ConsesLow.list( ConsesLow.list( makeString( "languages Spoken Here" ) ), makeString( "languages spoken here" ) ), ConsesLow.list( ConsesLow
                                                    .list( makeString( "number Of Hostages Taken" ) ), makeString( "number of hostages taken" ) ), ConsesLow.list( ConsesLow.list( makeString( "lowercase Of Letter" ) ),
                                                        makeString( "lowercase of letter" ) ), ConsesLow.list( ConsesLow.list( makeString( "condition Affects Part Type" ) ), makeString( "condition affects part type" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "time Zone Offset To GMT" ) ), makeString( "time zone offset to GMT" ) ), ConsesLow.list( ConsesLow.list( makeString( "has Department Types" ) ), makeString(
          "has department types" ) ), ConsesLow.list( ConsesLow.list( makeString( "cyclist Primary Project" ) ), makeString( "cyclist primary project" ) ), ConsesLow.list( ConsesLow.list( makeString(
              "land Area Of Region" ) ), makeString( "land area of region" ) ), ConsesLow.list( ConsesLow.list( makeString( "comparative Degree" ) ), makeString( "comparative degree" ) ), ConsesLow.list( ConsesLow.list(
                  makeString( "polity Has Transport Means" ) ), makeString( "polity has transport means" ) ), ConsesLow.list( ConsesLow.list( makeString( "file Format Has Suffix" ) ), makeString(
                      "file format has suffix" ) ), ConsesLow.list( ConsesLow.list( makeString( "drug Of Choice Administered For" ) ), makeString( "drug of choice administered for" ) ), ConsesLow.list( ConsesLow.list(
                          makeString( "task Status" ) ), makeString( "task status" ) ), ConsesLow.list( ConsesLow.list( makeString( "principal Landmarks Of City" ) ), makeString( "principal landmarks of city" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "infinitive" ) ), makeString( "infinitive" ) ), ConsesLow.list( ConsesLow.list( makeString( "performs Acts Of Type" ) ), makeString( "performs acts of type" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "geographical Sub Regions Of Country" ) ), makeString( "geographical sub regions of country" ) ), ConsesLow.list( ConsesLow.list( makeString( "television Actors" ) ),
          makeString( "television actors" ) ), ConsesLow.list( ConsesLow.list( makeString( "character Set For Writing System" ) ), makeString( "character set for writing system" ) ), ConsesLow.list( ConsesLow.list(
              makeString( "international Organization Member Countries" ) ), makeString( "international organization member countries" ) ), ConsesLow.list( ConsesLow.list( makeString( "builder Query For Template" ) ),
                  makeString( "builder query for template" ) ), ConsesLow.list( ConsesLow.list( makeString( "alter Ego Of Hero" ) ), makeString( "alter ego of hero" ) ), ConsesLow.list( ConsesLow.list( makeString(
                      "animal Type Makes Sound Type" ) ), makeString( "animal type makes sound type" ) ), ConsesLow.list( ConsesLow.list( makeString( "main Color Of Object" ) ), makeString( "main color of object" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "antisymmetric On" ) ), makeString( "antisymmetric on" ) ), ConsesLow.list( ConsesLow.list( makeString( "lexical Word Type For Language" ) ), makeString(
          "lexical word type for language" ) ), ConsesLow.list( ConsesLow.list( makeString( "drainage Area" ) ), makeString( "drainage area" ) ), ConsesLow.list( ConsesLow.list( makeString( "source Node In System" ) ),
              makeString( "source node in system" ) ), ConsesLow.list( ConsesLow.list( makeString( "complete Extent Enumerable For Arg" ) ), makeString( "complete extent enumerable for arg" ) ), ConsesLow.list( ConsesLow
                  .list( makeString( "morphologically Derived From" ) ), makeString( "morphologically derived from" ) ), ConsesLow.list( ConsesLow.list( makeString( "cw Series Type" ) ), makeString( "cw series type" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "program Typically Installed With" ) ), makeString( "program typically installed with" ) ), ConsesLow.list( ConsesLow.list( makeString(
          "test Collection Project Responsible" ) ), makeString( "test collection project responsible" ) ), ConsesLow.list( ConsesLow.list( makeString( "infection Type Has Vector Type" ) ), makeString(
              "infection type has vector type" ) ), ConsesLow.list( ConsesLow.list( makeString( "state Of Address" ) ), makeString( "state of address" ) ), ConsesLow.list( ConsesLow.list( makeString(
                  "default Specialized Type" ) ), makeString( "default specialized type" ) ), ConsesLow.list( ConsesLow.list( makeString( "agent Type Provides Service Of Type" ) ), makeString(
                      "agent type provides service of type" ) ), ConsesLow.list( ConsesLow.list( makeString( "discovered By Europeans When" ) ), makeString( "discovered by europeans when" ) ), ConsesLow.list( ConsesLow
                          .list( makeString( "project Of Department" ) ), makeString( "project of department" ) ), ConsesLow.list( ConsesLow.list( makeString( "director Organizational Role" ) ), makeString(
                              "director organizational role" ) ), ConsesLow.list( ConsesLow.list( makeString( "regulates Activity Type" ) ), makeString( "regulates activity type" ) ), ConsesLow.list( ConsesLow.list(
                                  makeString( "task Scheduler Task Date Pattern" ) ), makeString( "task scheduler task date pattern" ) ), ConsesLow.list( ConsesLow.list( makeString( "computer MAC Address" ) ),
                                      makeString( "computer MAC address" ) ), ConsesLow.list( ConsesLow.list( makeString( "derivational Affix Base POS" ) ), makeString( "derivational affix base POS" ) ), ConsesLow.list(
                                          ConsesLow.list( makeString( "software Designed For Architecture" ) ), makeString( "software designed for architecture" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                              "region Produces" ) ), makeString( "region produces" ) ), ConsesLow.list( ConsesLow.list( makeString( "source Used For Task" ) ), makeString( "source used for task" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "social Quantity Type Expressed By Ins Of Event Type" ) ), makeString( "social quantity type expressed by ins of event type" ) ), ConsesLow.list( ConsesLow.list(
          makeString( "software Parameter Set In Software Object" ) ), makeString( "software parameter set in software object" ) ), ConsesLow.list( ConsesLow.list( makeString( "expression Type For Tag" ) ), makeString(
              "expression type for tag" ) ), ConsesLow.list( ConsesLow.list( makeString( "performances Of Work Are" ) ), makeString( "performances of work are" ) ), ConsesLow.list( ConsesLow.list( makeString(
                  "bugzilla Bug Report Assigned To" ) ), makeString( "bugzilla bug report assigned to" ) ), ConsesLow.list( ConsesLow.list( makeString( "derived Using Prefix" ) ), makeString( "derived using prefix" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "capital City Of State" ) ), makeString( "capital city of state" ) ), ConsesLow.list( ConsesLow.list( makeString( "net Migration Rate" ) ), makeString(
          "net migration rate" ) ), ConsesLow.list( ConsesLow.list( makeString( "faces Direction" ) ), makeString( "faces direction" ) ), ConsesLow.list( ConsesLow.list( makeString( "program Source Code Written In" ) ),
              makeString( "program source code written in" ) ), ConsesLow.list( ConsesLow.list( makeString( "top In Thesaurus" ) ), makeString( "top in thesaurus" ) ), ConsesLow.list( ConsesLow.list( makeString(
                  "important Company" ) ), makeString( "important company" ) ), ConsesLow.list( ConsesLow.list( makeString( "clump Syntax List" ) ), makeString( "clump syntax list" ) ), ConsesLow.list( ConsesLow.list(
                      makeString( "corresponding KE Interaction Resource" ) ), makeString( "corresponding KE interaction resource" ) ), ConsesLow.list( ConsesLow.list( makeString( "former Occupation" ) ), makeString(
                          "former occupation" ) ), ConsesLow.list( ConsesLow.list( makeString( "min Quant Value" ) ), makeString( "min quant value" ) ), ConsesLow.list( ConsesLow.list( makeString(
                              "ke Genls Induced Weak Suggestion Preds" ) ), makeString( "ke genls induced weak suggestion preds" ) ), ConsesLow.list( ConsesLow.list( makeString( "binary Role Type Pred" ) ), makeString(
                                  "binary role type pred" ) ), ConsesLow.list( ConsesLow.list( makeString( "hour Of Day Index 24 Hour" ) ), makeString( "hour of day index 24 hour" ) ), ConsesLow.list( ConsesLow.list(
                                      makeString( "type Genl Mt" ) ), makeString( "type genl mt" ) ), ConsesLow.list( ConsesLow.list( makeString( "reads Language" ) ), makeString( "reads language" ) ), ConsesLow.list(
                                          ConsesLow.list( makeString( "empties Into" ) ), makeString( "empties into" ) ), ConsesLow.list( ConsesLow.list( makeString( "transport Facility For Type" ) ), makeString(
                                              "transport facility for type" ) ), ConsesLow.list( ConsesLow.list( makeString( "sem Trans Arg" ) ), makeString( "sem trans arg" ) ), ConsesLow.list( ConsesLow.list(
                                                  makeString( "venture Company" ) ), makeString( "venture company" ) ), ConsesLow.list( ConsesLow.list( makeString( "preserves Genls In Arg" ) ), makeString(
                                                      "preserves genls in arg" ) ), ConsesLow.list( ConsesLow.list( makeString( "venture Member" ) ), makeString( "venture member" ) ), ConsesLow.list( ConsesLow.list(
                                                          makeString( "inter Arg Reln 3 2" ) ), makeString( "inter arg reln 3 2" ) ), ConsesLow.list( ConsesLow.list( makeString( "base Form" ) ), makeString(
                                                              "base form" ) ), ConsesLow.list( ConsesLow.list( makeString( "first Publication Date CW" ) ), makeString( "first publication date CW" ) ), ConsesLow.list(
                                                                  ConsesLow.list( makeString( "number Type Interval Type" ) ), makeString( "number type interval type" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                      "event Type Implemented By Program Function" ) ), makeString( "event type implemented by program function" ) ), ConsesLow.list( ConsesLow.list(
                                                                          makeString( "main Languages Of GPE" ) ), makeString( "main languages of GPE" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                              "geographical Sub Regions Of State" ) ), makeString( "geographical sub regions of state" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                  "fan Out Arg" ) ), makeString( "fan out arg" ) ), ConsesLow.list( ConsesLow.list( makeString( "sks Schema Translation Mt" ) ), makeString(
                                                                                      "sks schema translation mt" ) ), ConsesLow.list( ConsesLow.list( makeString( "sub Topic Query Better Words" ) ), makeString(
                                                                                          "sub topic query better words" ) ), ConsesLow.list( ConsesLow.list( makeString( "succeeding Value Of Munsell Hue" ) ), makeString(
                                                                                              "succeeding value of munsell hue" ) ), ConsesLow.list( ConsesLow.list( makeString( "runs OS" ) ), makeString( "runs OS" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "works Found In Structure" ) ), makeString( "works found in structure" ) ), ConsesLow.list( ConsesLow.list( makeString( "highest Point In Region" ) ), makeString(
          "highest point in region" ) ), ConsesLow.list( ConsesLow.list( makeString( "facet Based On Binary Pred Inverse" ) ), makeString( "facet based on binary pred inverse" ) ), ConsesLow.list( ConsesLow.list(
              makeString( "independent Arg" ) ), makeString( "independent arg" ) ), ConsesLow.list( ConsesLow.list( makeString( "node In LAN" ) ), makeString( "node in LAN" ) ), ConsesLow.list( ConsesLow.list(
                  makeString( "field Fosters Advanced Artifacts Of Type" ) ), makeString( "field fosters advanced artifacts of type" ) ), ConsesLow.list( ConsesLow.list( makeString( "local Chief In Organization" ) ),
                      makeString( "local chief in organization" ) ), ConsesLow.list( ConsesLow.list( makeString( "role With Event Type Entails Some Time In Time Index" ) ), makeString(
                          "role with event type entails some time in time index" ) ), ConsesLow.list( ConsesLow.list( makeString( "occurs During" ) ), makeString( "occurs during" ) ), ConsesLow.list( ConsesLow.list(
                              makeString( "pathogen Type Causes Infection Type" ) ), makeString( "pathogen type causes infection type" ) ), ConsesLow.list( ConsesLow.list( makeString( "prefix String" ) ), makeString(
                                  "prefix string" ) ), ConsesLow.list( ConsesLow.list( makeString( "covering" ) ), makeString( "covering" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                      "microtheory Designation Argnum" ) ), makeString( "microtheory designation argnum" ) ), ConsesLow.list( ConsesLow.list( makeString( "other Common Language Here" ) ), makeString(
                                          "other common language here" ) ), ConsesLow.list( ConsesLow.list( makeString( "not Equipment Of Unit Type" ) ), makeString( "not equipment of unit type" ) ), ConsesLow.list(
                                              ConsesLow.list( makeString( "nc Rule Constraint" ) ), makeString( "nc rule constraint" ) ), ConsesLow.list( ConsesLow.list( makeString( "holy Site" ) ), makeString(
                                                  "holy site" ) ), ConsesLow.list( ConsesLow.list( makeString( "subcat Frame Example" ) ), makeString( "subcat frame example" ) ), ConsesLow.list( ConsesLow.list(
                                                      makeString( "music Type Is Of Genre" ) ), makeString( "music type is of genre" ) ), ConsesLow.list( ConsesLow.list( makeString( "contains Programs" ) ), makeString(
                                                          "contains programs" ) ), ConsesLow.list( ConsesLow.list( makeString( "account Name" ) ), makeString( "account name" ) ), ConsesLow.list( ConsesLow.list(
                                                              makeString( "network Knowledge Predicate For Cyc Secure Component" ) ), makeString( "network knowledge predicate for cyc secure component" ) ), ConsesLow
                                                                  .list( ConsesLow.list( makeString( "common Nickname" ) ), makeString( "common nickname" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                      "within Range Of Fire" ) ), makeString( "within range of fire" ) ), ConsesLow.list( ConsesLow.list( makeString( "controlling Suborganizations" ) ),
                                                                          makeString( "controlling suborganizations" ) ), ConsesLow.list( ConsesLow.list( makeString( "constrains Arg" ) ), makeString(
                                                                              "constrains arg" ) ), ConsesLow.list( ConsesLow.list( makeString( "slots Additive" ) ), makeString( "slots additive" ) ), ConsesLow.list(
                                                                                  ConsesLow.list( makeString( "moves In Direction Average" ) ), makeString( "moves in direction average" ) ), ConsesLow.list( ConsesLow
                                                                                      .list( makeString( "temporally Intersects Type Type" ) ), makeString( "temporally intersects type type" ) ), ConsesLow.list( ConsesLow
                                                                                          .list( makeString( "quantity Ordered Quantity Type" ) ), makeString( "quantity ordered quantity type" ) ), ConsesLow.list(
                                                                                              ConsesLow.list( makeString( "country Of Nationality" ) ), makeString( "country of nationality" ) ), ConsesLow.list( ConsesLow
                                                                                                  .list( makeString( "assignment Rough Duration" ) ), makeString( "assignment rough duration" ) ), ConsesLow.list( ConsesLow
                                                                                                      .list( makeString( "sources For Topic" ) ), makeString( "sources for topic" ) ), ConsesLow.list( ConsesLow.list(
                                                                                                          makeString( "predicates SBHL Path Marking Function Type" ) ), makeString(
                                                                                                              "predicates SBHL path marking function type" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                                                  "task Scheduler Task Time Pattern" ) ), makeString( "task scheduler task time pattern" ) ), ConsesLow
                                                                                                                      .list( ConsesLow.list( makeString( "criterial For Terrain Tactical Role Negative" ) ), makeString(
                                                                                                                          "criterial for terrain tactical role negative" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                                                              "parser Test Target" ) ), makeString( "parser test target" ) ), ConsesLow.list( ConsesLow
                                                                                                                                  .list( makeString( "affix Semantics" ) ), makeString( "affix semantics" ) ), ConsesLow
                                                                                                                                      .list( ConsesLow.list( makeString( "context Of PCW" ) ), makeString(
                                                                                                                                          "context of PCW" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                                                                              "fault Vulnerability OS" ) ), makeString( "fault vulnerability OS" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "sub Topic Print String" ) ), makeString( "sub topic print string" ) ), ConsesLow.list( ConsesLow.list( makeString( "common Language" ) ), makeString(
          "common language" ) ), ConsesLow.list( ConsesLow.list( makeString( "divisor Type For Quantity Type" ) ), makeString( "divisor type for quantity type" ) ), ConsesLow.list( ConsesLow.list( makeString(
              "average Precipitation" ) ), makeString( "average precipitation" ) ), ConsesLow.list( ConsesLow.list( makeString( "predicate SBHL Transfers Via Arg" ) ), makeString( "predicate SBHL transfers via arg" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "task Scheduler Task User" ) ), makeString( "task scheduler task user" ) ), ConsesLow.list( ConsesLow.list( makeString( "use For" ) ), makeString( "use for" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "industry Facilities" ) ), makeString( "industry facilities" ) ), ConsesLow.list( ConsesLow.list( makeString( "predicate SBHL Transfers Through Module" ) ), makeString(
          "predicate SBHL transfers through module" ) ), ConsesLow.list( ConsesLow.list( makeString( "period Of Time Interval Series" ) ), makeString( "period of time interval series" ) ), ConsesLow.list( ConsesLow.list(
              makeString( "ke Weak Suggestion" ) ), makeString( "ke weak suggestion" ) ), ConsesLow.list( ConsesLow.list( makeString( "spatially Disjoint" ) ), makeString( "spatially disjoint" ) ), ConsesLow.list(
                  ConsesLow.list( makeString( "bugzilla Bug For Product" ) ), makeString( "bugzilla bug for product" ) ), ConsesLow.list( ConsesLow.list( makeString( "task Advisor" ) ), makeString( "task advisor" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "body Parts Used Type Type" ) ), makeString( "body parts used type type" ) ), ConsesLow.list( ConsesLow.list( makeString( "task Reviewer" ) ), makeString(
          "task reviewer" ) ), ConsesLow.list( ConsesLow.list( makeString( "cn: Is A" ) ), makeString( "cn: is A" ) ), ConsesLow.list( ConsesLow.list( makeString( "most" ) ), makeString( "most" ) ), ConsesLow.list(
              ConsesLow.list( makeString( "organization Type Members Active In Field" ) ), makeString( "organization type members active in field" ) ), ConsesLow.list( ConsesLow.list( makeString( "maximum Depth" ) ),
                  makeString( "maximum depth" ) ), ConsesLow.list( ConsesLow.list( makeString( "ft Deducible From" ) ), makeString( "ft deducible from" ) ), ConsesLow.list( ConsesLow.list( makeString(
                      "domain Knowledge Predicate For Cyc Secure Component" ) ), makeString( "domain knowledge predicate for cyc secure component" ) ), ConsesLow.list( ConsesLow.list( makeString(
                          "inter Arg Reln 3 1" ) ), makeString( "inter arg reln 3 1" ) ), ConsesLow.list( ConsesLow.list( makeString( "addicted To" ) ), makeString( "addicted to" ) ), ConsesLow.list( ConsesLow.list(
                              makeString( "provenance Of Media Series Product" ) ), makeString( "provenance of media series product" ) ), ConsesLow.list( ConsesLow.list( makeString( "common Genl Preds" ) ), makeString(
                                  "common genl preds" ) ), ConsesLow.list( ConsesLow.list( makeString( "subcat Frame Head Keyword" ) ), makeString( "subcat frame head keyword" ) ), ConsesLow.list( ConsesLow.list(
                                      makeString( "government" ) ), makeString( "government" ) ), ConsesLow.list( ConsesLow.list( makeString( "native Language" ) ), makeString( "native language" ) ), ConsesLow.list(
                                          ConsesLow.list( makeString( "granule Of Spatial Stuff" ) ), makeString( "granule of spatial stuff" ) ), ConsesLow.list( ConsesLow.list( makeString( "program Type Strings" ) ),
                                              makeString( "program type strings" ) ), ConsesLow.list( ConsesLow.list( makeString( "cbl Relationship Has Keyword" ) ), makeString( "cbl relationship has keyword" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "sub Event Types" ) ), makeString( "sub event types" ) ), ConsesLow.list( ConsesLow.list( makeString( "requires Operating System" ) ), makeString(
          "requires operating system" ) ), ConsesLow.list( ConsesLow.list( makeString( "bio For Proposalshort" ) ), makeString( "bio for proposalshort" ) ), ConsesLow.list( ConsesLow.list( makeString(
              "superlative Degree" ) ), makeString( "superlative degree" ) ), ConsesLow.list( ConsesLow.list( makeString( "geographical Sub Regions Of Body Of Water" ) ), makeString(
                  "geographical sub regions of body of water" ) ), ConsesLow.list( ConsesLow.list( makeString( "last Proper Sub Event Types" ) ), makeString( "last proper sub event types" ) ), ConsesLow.list( ConsesLow
                      .list( makeString( "test Collection For Knowledge Source" ) ), makeString( "test collection for knowledge source" ) ), ConsesLow.list( ConsesLow.list( makeString( "role Types For Event Type" ) ),
                          makeString( "role types for event type" ) ), ConsesLow.list( ConsesLow.list( makeString( "facet Based On Type Binary Pred Inverse" ) ), makeString( "facet based on type binary pred inverse" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "inter Arg Reln 1 4" ) ), makeString( "inter arg reln 1 4" ) ), ConsesLow.list( ConsesLow.list( makeString( "software Parameter Domain" ) ), makeString(
          "software parameter domain" ) ), ConsesLow.list( ConsesLow.list( makeString( "prototypical Activity Type Of Person Type" ) ), makeString( "prototypical activity type of person type" ) ), ConsesLow.list(
              ConsesLow.list( makeString( "program Function Identifier" ) ), makeString( "program function identifier" ) ), ConsesLow.list( ConsesLow.list( makeString( "pn Mass Number" ) ), makeString(
                  "pn mass number" ) ), ConsesLow.list( ConsesLow.list( makeString( "authentication Source For" ) ), makeString( "authentication source for" ) ), ConsesLow.list( ConsesLow.list( makeString(
                      "string Skipped" ) ), makeString( "string skipped" ) ), ConsesLow.list( ConsesLow.list( makeString( "program Installed With Package" ) ), makeString( "program installed with package" ) ), ConsesLow
                          .list( ConsesLow.list( makeString( "characteristic Activity Type Of Person Type" ) ), makeString( "characteristic activity type of person type" ) ), ConsesLow.list( ConsesLow.list( makeString(
                              "biological Weapon Type Basis Type" ) ), makeString( "biological weapon type basis type" ) ), ConsesLow.list( ConsesLow.list( makeString( "owl URI" ) ), makeString( "owl URI" ) ), ConsesLow
                                  .list( ConsesLow.list( makeString( "immediate Precursors Chemical" ) ), makeString( "immediate precursors chemical" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                      "performance Of Work" ) ), makeString( "performance of work" ) ), ConsesLow.list( ConsesLow.list( makeString( "language Prompt For UIA" ) ), makeString(
                                          "language prompt for UIA" ) ), ConsesLow.list( ConsesLow.list( makeString( "issuer Of CW" ) ), makeString( "issuer of CW" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                              "genl Works" ) ), makeString( "genl works" ) ), ConsesLow.list( ConsesLow.list( makeString( "sub Time Slice Type" ) ), makeString( "sub time slice type" ) ), ConsesLow.list(
                                                  ConsesLow.list( makeString( "product Type Licensed For Treatment Of" ) ), makeString( "product type licensed for treatment of" ) ), ConsesLow.list( ConsesLow.list(
                                                      makeString( "date Of Invention" ) ), makeString( "date of invention" ) ), ConsesLow.list( ConsesLow.list( makeString( "agent Type Employed By Org Type" ) ),
                                                          makeString( "agent type employed by org type" ) ), ConsesLow.list( ConsesLow.list( makeString( "constant Copied From" ) ), makeString( "constant copied from" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "negation Quantities" ) ), makeString( "negation quantities" ) ), ConsesLow.list( ConsesLow.list( makeString( "based In Region" ) ), makeString( "based in region" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "originally From Region" ) ), makeString( "originally from region" ) ), ConsesLow.list( ConsesLow.list( makeString( "genl Programs" ) ), makeString( "genl programs" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "average Discharge" ) ), makeString( "average discharge" ) ), ConsesLow.list( ConsesLow.list( makeString( "program Calls Program" ) ), makeString(
          "program calls program" ) ), ConsesLow.list( ConsesLow.list( makeString( "chief Ports" ) ), makeString( "chief ports" ) ), ConsesLow.list( ConsesLow.list( makeString( "named After" ) ), makeString(
              "named after" ) ), ConsesLow.list( ConsesLow.list( makeString( "validation Required On Template Position" ) ), makeString( "validation required on template position" ) ), ConsesLow.list( ConsesLow.list(
                  makeString( "population Growth Rate" ) ), makeString( "population growth rate" ) ), ConsesLow.list( ConsesLow.list( makeString( "test Collection Cyclist Responsible" ) ), makeString(
                      "test collection cyclist responsible" ) ), ConsesLow.list( ConsesLow.list( makeString( "file Configures Software" ) ), makeString( "file configures software" ) ), ConsesLow.list( ConsesLow.list(
                          makeString( "policy Type Protects Against" ) ), makeString( "policy type protects against" ) ), ConsesLow.list( ConsesLow.list( makeString( "arity Max" ) ), makeString( "arity max" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "characteristic Activity Type Of Person Type At Least Once" ) ), makeString( "characteristic activity type of person type at least once" ) ), ConsesLow.list( ConsesLow
          .list( makeString( "developed Product Type" ) ), makeString( "developed product type" ) ), ConsesLow.list( ConsesLow.list( makeString( "spans-Bridgelike" ) ), makeString( "spans-bridgelike" ) ), ConsesLow.list(
              ConsesLow.list( makeString( "inter Arg Reln 3 4" ) ), makeString( "inter arg reln 3 4" ) ), ConsesLow.list( ConsesLow.list( makeString( "major Religions" ) ), makeString( "major religions" ) ), ConsesLow
                  .list( ConsesLow.list( makeString( "candidate Proper Sub Situation Types" ) ), makeString( "candidate proper sub situation types" ) ), ConsesLow.list( ConsesLow.list( makeString( "nc Rule Template" ) ),
                      makeString( "nc rule template" ) ), ConsesLow.list( ConsesLow.list( makeString( "template Type For Focal Term Type" ) ), makeString( "template type for focal term type" ) ), ConsesLow.list(
                          ConsesLow.list( makeString( "regular Degree" ) ), makeString( "regular degree" ) ), ConsesLow.list( ConsesLow.list( makeString( "studies" ) ), makeString( "studies" ) ), ConsesLow.list(
                              ConsesLow.list( makeString( "cn: Used For" ) ), makeString( "cn: used for" ) ), ConsesLow.list( ConsesLow.list( makeString( "software Update Download Link" ) ), makeString(
                                  "software update download link" ) ), ConsesLow.list( ConsesLow.list( makeString( "unit Type Dimensional Analysis" ) ), makeString( "unit type dimensional analysis" ) ), ConsesLow.list(
                                      ConsesLow.list( makeString( "school Symbol Name Female" ) ), makeString( "school symbol name female" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                          "assert Mt For Formula Template" ) ), makeString( "assert mt for formula template" ) ), ConsesLow.list( ConsesLow.list( makeString( "query Mt For Topic Assertions" ) ),
                                              makeString( "query mt for topic assertions" ) ), ConsesLow.list( ConsesLow.list( makeString( "symmetric Physical Part Types" ) ), makeString(
                                                  "symmetric physical part types" ) ), ConsesLow.list( ConsesLow.list( makeString( "predicates SBHL Path Terminating Mark Function" ) ), makeString(
                                                      "predicates SBHL path terminating mark function" ) ), ConsesLow.list( ConsesLow.list( makeString( "construction Existential State" ) ), makeString(
                                                          "construction existential state" ) ), ConsesLow.list( ConsesLow.list( makeString( "event Type Uses Device Type" ) ), makeString(
                                                              "event type uses device type" ) ), ConsesLow.list( ConsesLow.list( makeString( "generate Arg With Outside Scope" ) ), makeString(
                                                                  "generate arg with outside scope" ) ), ConsesLow.list( ConsesLow.list( makeString( "noun Learner Sense Gloss" ) ), makeString(
                                                                      "noun learner sense gloss" ) ), ConsesLow.list( ConsesLow.list( makeString( "vehicle Load Class" ) ), makeString( "vehicle load class" ) ), ConsesLow
                                                                          .list( ConsesLow.list( makeString( "data Type Exploited By" ) ), makeString( "data type exploited by" ) ), ConsesLow.list( ConsesLow.list(
                                                                              makeString( "topic Of Database" ) ), makeString( "topic of database" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                  "syntactic Node Category" ) ), makeString( "syntactic node category" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                      "software Object Uses Library" ) ), makeString( "software object uses library" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                          "template Topic Genls" ) ), makeString( "template topic genls" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                              "typical Armament Of Unit Type" ) ), makeString( "typical armament of unit type" ) ), ConsesLow.list( ConsesLow.list(
                                                                                                  makeString( "greater Than" ) ), makeString( "greater than" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                                      "cn: Property Of" ) ), makeString( "cn: property of" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                                          "filter Collections" ) ), makeString( "filter collections" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                                              "has What As Boundary" ) ), makeString( "has what as boundary" ) ), ConsesLow.list( ConsesLow.list(
                                                                                                                  makeString( "terrain Climate Type" ) ), makeString( "terrain climate type" ) ), ConsesLow.list( ConsesLow
                                                                                                                      .list( makeString( "software Parameter Has Type" ) ), makeString( "software parameter has type" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "TNT Equivalent Type" ) ), makeString( "TNT equivalent type" ) ), ConsesLow.list( ConsesLow.list( makeString( "unit Type Uses Tactical Object Type" ) ), makeString(
          "unit type uses tactical object type" ) ), ConsesLow.list( ConsesLow.list( makeString( "coa Supporting Task" ) ), makeString( "coa supporting task" ) ), ConsesLow.list( ConsesLow.list( makeString(
              "classification Of Report" ) ), makeString( "classification of report" ) ), ConsesLow.list( ConsesLow.list( makeString( "street Of Address" ) ), makeString( "street of address" ) ), ConsesLow.list(
                  ConsesLow.list( makeString( "formula Template Type Has Topic Type" ) ), makeString( "formula template type has topic type" ) ), ConsesLow.list( ConsesLow.list( makeString( "web Site URL" ) ),
                      makeString( "web site URL" ) ), ConsesLow.list( ConsesLow.list( makeString( "RAM Size" ) ), makeString( "RAM size" ) ), ConsesLow.list( ConsesLow.list( makeString( "senior Executives" ) ),
                          makeString( "senior executives" ) ), ConsesLow.list( ConsesLow.list( makeString( "tm Inverse Symbol" ) ), makeString( "tm inverse symbol" ) ), ConsesLow.list( ConsesLow.list( makeString(
                              "major City In State" ) ), makeString( "major city in state" ) ), ConsesLow.list( ConsesLow.list( makeString( "derivational Affix Result POS" ) ), makeString(
                                  "derivational affix result POS" ) ), ConsesLow.list( ConsesLow.list( makeString( "employee Status" ) ), makeString( "employee status" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                      "denotatum Arg" ) ), makeString( "denotatum arg" ) ), ConsesLow.list( ConsesLow.list( makeString( "program Implements Protocol" ) ), makeString( "program implements protocol" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "water Area Of Region" ) ), makeString( "water area of region" ) ), ConsesLow.list( ConsesLow.list( makeString( "to-Generic" ) ), makeString( "to-generic" ) ), ConsesLow
          .list( ConsesLow.list( makeString( "ke Strong Suggestion Inverse" ) ), makeString( "ke strong suggestion inverse" ) ), ConsesLow.list( ConsesLow.list( makeString( "duration Of Type" ) ), makeString(
              "duration of type" ) ), ConsesLow.list( ConsesLow.list( makeString( "test Derived From" ) ), makeString( "test derived from" ) ), ConsesLow.list( ConsesLow.list( makeString( "infant Mortality Rate" ) ),
                  makeString( "infant mortality rate" ) ), ConsesLow.list( ConsesLow.list( makeString( "type Launches Projectile Type" ) ), makeString( "type launches projectile type" ) ), ConsesLow.list( ConsesLow.list(
                      makeString( "national Budget Revenues" ) ), makeString( "national budget revenues" ) ), ConsesLow.list( ConsesLow.list( makeString( "max Quant Value" ) ), makeString( "max quant value" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "taxon Members" ) ), makeString( "taxon members" ) ), ConsesLow.list( ConsesLow.list( makeString( "national Budget Expenditures" ) ), makeString(
          "national budget expenditures" ) ), ConsesLow.list( ConsesLow.list( makeString( "predicates Cyc L Initialization Module" ) ), makeString( "predicates cyc l initialization module" ) ), ConsesLow.list( ConsesLow
              .list( makeString( "natural Hazards In Region" ) ), makeString( "natural hazards in region" ) ), ConsesLow.list( ConsesLow.list( makeString( "linked" ) ), makeString( "linked" ) ), ConsesLow.list( ConsesLow
                  .list( makeString( "position In Formula Template Is Replaceable" ) ), makeString( "position in formula template is replaceable" ) ), ConsesLow.list( ConsesLow.list( makeString( "mass Number" ) ),
                      makeString( "mass number" ) ), ConsesLow.list( ConsesLow.list( makeString( "device Type Used" ) ), makeString( "device type used" ) ), ConsesLow.list( ConsesLow.list( makeString(
                          "river End Topography" ) ), makeString( "river end topography" ) ), ConsesLow.list( ConsesLow.list( makeString( "object Has Color" ) ), makeString( "object has color" ) ), ConsesLow.list(
                              ConsesLow.list( makeString( "regular Adverb" ) ), makeString( "regular adverb" ) ), ConsesLow.list( ConsesLow.list( makeString( "condition Affects Org Type" ) ), makeString(
                                  "condition affects org type" ) ), ConsesLow.list( ConsesLow.list( makeString( "nc Rule Tests" ) ), makeString( "nc rule tests" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                      "sentence Designation Argnum" ) ), makeString( "sentence designation argnum" ) ), ConsesLow.list( ConsesLow.list( makeString( "regulates Object Type" ) ), makeString(
                                          "regulates object type" ) ), ConsesLow.list( ConsesLow.list( makeString( "consider Specializing" ) ), makeString( "consider specializing" ) ), ConsesLow.list( ConsesLow.list(
                                              makeString( "genl Mod Features" ) ), makeString( "genl mod features" ) ), ConsesLow.list( ConsesLow.list( makeString( "fields Of Competence" ) ), makeString(
                                                  "fields of competence" ) ), ConsesLow.list( ConsesLow.list( makeString( "policy Type Covers Types" ) ), makeString( "policy type covers types" ) ), ConsesLow.list(
                                                      ConsesLow.list( makeString( "topic Of Clump" ) ), makeString( "topic of clump" ) ), ConsesLow.list( ConsesLow.list( makeString( "device Type Manipulates" ) ),
                                                          makeString( "device type manipulates" ) ), ConsesLow.list( ConsesLow.list( makeString( "predicate SBHL Index Arg" ) ), makeString( "predicate SBHL index arg" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "sub Information" ) ), makeString( "sub information" ) ), ConsesLow.list( ConsesLow.list( makeString( "derived Conceptual Work" ) ), makeString(
          "derived conceptual work" ) ), ConsesLow.list( ConsesLow.list( makeString( "tm Superset" ) ), makeString( "tm superset" ) ), ConsesLow.list( ConsesLow.list( makeString(
              "glf Label For Arcs Based On Expanded Pred" ) ), makeString( "glf label for arcs based on expanded pred" ) ), ConsesLow.list( ConsesLow.list( makeString( "source Of Term Person" ) ), makeString(
                  "source of term person" ) ), ConsesLow.list( ConsesLow.list( makeString( "orbits" ) ), makeString( "orbits" ) ), ConsesLow.list( ConsesLow.list( makeString( "literacy Rate" ) ), makeString(
                      "literacy rate" ) ), ConsesLow.list( ConsesLow.list( makeString( "test Type Folder" ) ), makeString( "test type folder" ) ), ConsesLow.list( ConsesLow.list( makeString( "suffix String" ) ),
                          makeString( "suffix string" ) ), ConsesLow.list( ConsesLow.list( makeString( "has Award" ) ), makeString( "has award" ) ), ConsesLow.list( ConsesLow.list( makeString(
                              "topic Of Belief System" ) ), makeString( "topic of belief system" ) ), ConsesLow.list( ConsesLow.list( makeString( "sks Physical Schema Description Mt" ) ), makeString(
                                  "sks physical schema description mt" ) ), ConsesLow.list( ConsesLow.list( makeString( "program Function Operator" ) ), makeString( "program function operator" ) ), ConsesLow.list(
                                      ConsesLow.list( makeString( "commercially Useful Part Types" ) ), makeString( "commercially useful part types" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                          "perpendicular Vectors" ) ), makeString( "perpendicular vectors" ) ), ConsesLow.list( ConsesLow.list( makeString( "sticks Into 2 D" ) ), makeString( "sticks into 2 D" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "perfect" ) ), makeString( "perfect" ) ), ConsesLow.list( ConsesLow.list( makeString( "compass Value Of Direction" ) ), makeString( "compass value of direction" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "bug Causes Bad Paraphrase In Query Library" ) ), makeString( "bug causes bad paraphrase in query library" ) ), ConsesLow.list( ConsesLow.list( makeString(
          "organism Type Existential Threat State" ) ), makeString( "organism type existential threat state" ) ), ConsesLow.list( ConsesLow.list( makeString( "correlated Color" ) ), makeString( "correlated color" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "notable Peaks In This Group" ) ), makeString( "notable peaks in this group" ) ), ConsesLow.list( ConsesLow.list( makeString( "form Of Disease" ) ), makeString(
          "form of disease" ) ), ConsesLow.list( ConsesLow.list( makeString( "formula Template Has Type" ) ), makeString( "formula template has type" ) ), ConsesLow.list( ConsesLow.list( makeString( "starts During" ) ),
              makeString( "starts during" ) ), ConsesLow.list( ConsesLow.list( makeString( "altitude Of Lowest Point Is" ) ), makeString( "altitude of lowest point is" ) ), ConsesLow.list( ConsesLow.list( makeString(
                  "where River Starts" ) ), makeString( "where river starts" ) ), ConsesLow.list( ConsesLow.list( makeString( "maximum Duration Of Type" ) ), makeString( "maximum duration of type" ) ), ConsesLow.list(
                      ConsesLow.list( makeString( "embedded Region" ) ), makeString( "embedded region" ) ), ConsesLow.list( ConsesLow.list( makeString( "controls" ) ), makeString( "controls" ) ), ConsesLow.list(
                          ConsesLow.list( makeString( "standard Equipment Of Unit Type" ) ), makeString( "standard equipment of unit type" ) ), ConsesLow.list( ConsesLow.list( makeString(
                              "agent Supports Agent Generic" ) ), makeString( "agent supports agent generic" ) ), ConsesLow.list( ConsesLow.list( makeString( "arg 5 Format" ) ), makeString( "arg 5 format" ) ), ConsesLow
                                  .list( ConsesLow.list( makeString( "sub Industry Types" ) ), makeString( "sub industry types" ) ), ConsesLow.list( ConsesLow.list( makeString( "school Type Attended" ) ), makeString(
                                      "school type attended" ) ), ConsesLow.list( ConsesLow.list( makeString( "has Portal To Region" ) ), makeString( "has portal to region" ) ), ConsesLow.list( ConsesLow.list(
                                          makeString( "predicates SBHL Path Unmarking Function Type" ) ), makeString( "predicates SBHL path unmarking function type" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                              "sks Source Description Mt" ) ), makeString( "sks source description mt" ) ), ConsesLow.list( ConsesLow.list( makeString( "serves Cuisine" ) ), makeString(
                                                  "serves cuisine" ) ), ConsesLow.list( ConsesLow.list( makeString( "arg 5 Genl" ) ), makeString( "arg 5 genl" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                      "key Participants" ) ), makeString( "key participants" ) ), ConsesLow.list( ConsesLow.list( makeString( "purpose Of Event Type Sit Type" ) ), makeString(
                                                          "purpose of event type sit type" ) ), ConsesLow.list( ConsesLow.list( makeString( "has Headquarters In Country" ) ), makeString(
                                                              "has headquarters in country" ) ), ConsesLow.list( ConsesLow.list( makeString( "local E Mail Address Text" ) ), makeString( "local e mail address text" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "opposite Collections" ) ), makeString( "opposite collections" ) ), ConsesLow.list( ConsesLow.list( makeString( "sem Trans Pred For POS" ) ), makeString(
          "sem trans pred for POS" ) ), ConsesLow.list( ConsesLow.list( makeString( "project Source Fact Entry" ) ), makeString( "project source fact entry" ) ), ConsesLow.list( ConsesLow.list( makeString(
              "type Measures Quantity" ) ), makeString( "type measures quantity" ) ), ConsesLow.list( ConsesLow.list( makeString( "intersection Type" ) ), makeString( "intersection type" ) ), ConsesLow.list( ConsesLow
                  .list( makeString( "arity Min" ) ), makeString( "arity min" ) ), ConsesLow.list( ConsesLow.list( makeString( "facet Based On Binary Pred" ) ), makeString( "facet based on binary pred" ) ), ConsesLow
                      .list( ConsesLow.list( makeString( "computer IP" ) ), makeString( "computer IP" ) ), ConsesLow.list( ConsesLow.list( makeString( "has Zodiac Sign" ) ), makeString( "has zodiac sign" ) ), ConsesLow
                          .list( ConsesLow.list( makeString( "link In System" ) ), makeString( "link in system" ) ), ConsesLow.list( ConsesLow.list( makeString( "strictly Functional In Args" ) ), makeString(
                              "strictly functional in args" ) ), ConsesLow.list( ConsesLow.list( makeString( "has Personality" ) ), makeString( "has personality" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                  "html Tag Symbol" ) ), makeString( "html tag symbol" ) ), ConsesLow.list( ConsesLow.list( makeString( "bugzilla Bug Report Reporter" ) ), makeString( "bugzilla bug report reporter" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "bug Blocks Query" ) ), makeString( "bug blocks query" ) ), ConsesLow.list( ConsesLow.list( makeString( "adjective Of Country" ) ), makeString(
          "adjective of country" ) ), ConsesLow.list( ConsesLow.list( makeString( "unique ID For Type" ) ), makeString( "unique ID for type" ) ), ConsesLow.list( ConsesLow.list( makeString( "education Level" ) ),
              makeString( "education level" ) ), ConsesLow.list( ConsesLow.list( makeString( "city In State" ) ), makeString( "city in state" ) ), ConsesLow.list( ConsesLow.list( makeString(
                  "bug Causes Spurious Proof" ) ), makeString( "bug causes spurious proof" ) ), ConsesLow.list( ConsesLow.list( makeString( "ft Deducible From Dual" ) ), makeString( "ft deducible from dual" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "exclude Replacement Option For Formula Template" ) ), makeString( "exclude replacement option for formula template" ) ), ConsesLow.list( ConsesLow.list( makeString(
          "typical Color Of Type" ) ), makeString( "typical color of type" ) ), ConsesLow.list( ConsesLow.list( makeString( "predicates Property Type Of Arg 1" ) ), makeString( "predicates property type of arg 1" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "terrain Type" ) ), makeString( "terrain type" ) ), ConsesLow.list( ConsesLow.list( makeString( "proper Physical Part Types" ) ), makeString(
          "proper physical part types" ) ), ConsesLow.list( ConsesLow.list( makeString( "task Type Requires Resource Type" ) ), makeString( "task type requires resource type" ) ), ConsesLow.list( ConsesLow.list(
              makeString( "vaccine Effective Against Microorg Type" ) ), makeString( "vaccine effective against microorg type" ) ), ConsesLow.list( ConsesLow.list( makeString( "area This Language Native To" ) ),
                  makeString( "area this language native to" ) ), ConsesLow.list( ConsesLow.list( makeString( "has Office" ) ), makeString( "has office" ) ), ConsesLow.list( ConsesLow.list( makeString( "dialects" ) ),
                      makeString( "dialects" ) ), ConsesLow.list( ConsesLow.list( makeString( "el Inverse" ) ), makeString( "el inverse" ) ), ConsesLow.list( ConsesLow.list( makeString( "node In System" ) ), makeString(
                          "node in system" ) ), ConsesLow.list( ConsesLow.list( makeString( "performed By Part" ) ), makeString( "performed by part" ) ), ConsesLow.list( ConsesLow.list( makeString(
                              "past Tense Universal" ) ), makeString( "past tense universal" ) ), ConsesLow.list( ConsesLow.list( makeString( "precondition For Events" ) ), makeString( "precondition for events" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "device Types Commonly Used Together" ) ), makeString( "device types commonly used together" ) ), ConsesLow.list( ConsesLow.list( makeString(
          "agent Type Performs Work Of Type" ) ), makeString( "agent type performs work of type" ) ), ConsesLow.list( ConsesLow.list( makeString( "runs Under OS" ) ), makeString( "runs under OS" ) ), ConsesLow.list(
              ConsesLow.list( makeString( "located At Point Surface Geographical" ) ), makeString( "located at point surface geographical" ) ), ConsesLow.list( ConsesLow.list( makeString( "population Of Region" ) ),
                  makeString( "population of region" ) ), ConsesLow.list( ConsesLow.list( makeString( "cn: Thematic K Line" ) ), makeString( "cn: thematic k line" ) ), ConsesLow.list( ConsesLow.list( makeString(
                      "standard Vehicle Of Unit Type" ) ), makeString( "standard vehicle of unit type" ) ), ConsesLow.list( ConsesLow.list( makeString( "genl KB Content Tests" ) ), makeString(
                          "genl KB content tests" ) ), ConsesLow.list( ConsesLow.list( makeString( "basic Speech Part Pred" ) ), makeString( "basic speech part pred" ) ), ConsesLow.list( ConsesLow.list( makeString(
                              "industry Produces Type" ) ), makeString( "industry produces type" ) ), ConsesLow.list( ConsesLow.list( makeString( "has Rights Over" ) ), makeString( "has rights over" ) ), ConsesLow.list(
                                  ConsesLow.list( makeString( "type Used With Cyc Module" ) ), makeString( "type used with cyc module" ) ), ConsesLow.list( ConsesLow.list( makeString( "tm Symbol" ) ), makeString(
                                      "tm symbol" ) ), ConsesLow.list( ConsesLow.list( makeString( "head Of State Of" ) ), makeString( "head of state of" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                          "post Events" ) ), makeString( "post events" ) ), ConsesLow.list( ConsesLow.list( makeString( "causes Sit Type Sit Type" ) ), makeString( "causes sit type sit type" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "focal Term Introduction" ) ), makeString( "focal term introduction" ) ), ConsesLow.list( ConsesLow.list( makeString( "title Of Person String" ) ), makeString(
          "title of person string" ) ), ConsesLow.list( ConsesLow.list( makeString( "stufflike WRT Pred" ) ), makeString( "stufflike WRT pred" ) ), ConsesLow.list( ConsesLow.list( makeString( "requesting Agent" ) ),
              makeString( "requesting agent" ) ), ConsesLow.list( ConsesLow.list( makeString( "template Replacements Invisible For Position" ) ), makeString( "template replacements invisible for position" ) ), ConsesLow
                  .list( ConsesLow.list( makeString( "proper Sub Events" ) ), makeString( "proper sub events" ) ), ConsesLow.list( ConsesLow.list( makeString( "temporally Intrinsic Arg" ) ), makeString(
                      "temporally intrinsic arg" ) ), ConsesLow.list( ConsesLow.list( makeString( "string Length" ) ), makeString( "string length" ) ), ConsesLow.list( ConsesLow.list( makeString(
                          "org Type Facility Type" ) ), makeString( "org type facility type" ) ), ConsesLow.list( ConsesLow.list( makeString( "person Hair Color" ) ), makeString( "person hair color" ) ), ConsesLow.list(
                              ConsesLow.list( makeString( "national Language" ) ), makeString( "national language" ) ), ConsesLow.list( ConsesLow.list( makeString( "reflexive On" ) ), makeString( "reflexive on" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "city Of Address" ) ), makeString( "city of address" ) ), ConsesLow.list( ConsesLow.list( makeString( "preferred Name String" ) ), makeString(
          "preferred name string" ) ), ConsesLow.list( ConsesLow.list( makeString( "next Higher Order" ) ), makeString( "next higher order" ) ), ConsesLow.list( ConsesLow.list( makeString( "pos Of Phrase Type" ) ),
              makeString( "pos of phrase type" ) ), ConsesLow.list( ConsesLow.list( makeString( "primary Activity Type Of Location" ) ), makeString( "primary activity type of location" ) ), ConsesLow.list( ConsesLow
                  .list( makeString( "arg 4 Format" ) ), makeString( "arg 4 format" ) ), ConsesLow.list( ConsesLow.list( makeString( "where River Ends" ) ), makeString( "where river ends" ) ), ConsesLow.list( ConsesLow
                      .list( makeString( "inhabitant Types" ) ), makeString( "inhabitant types" ) ), ConsesLow.list( ConsesLow.list( makeString( "plural" ) ), makeString( "plural" ) ), ConsesLow.list( ConsesLow.list(
                          makeString( "inter Arg Reln 2 1" ) ), makeString( "inter arg reln 2 1" ) ), ConsesLow.list( ConsesLow.list( makeString( "office In Country" ) ), makeString( "office in country" ) ), ConsesLow
                              .list( ConsesLow.list( makeString( "pos For Template Category" ) ), makeString( "pos for template category" ) ), ConsesLow.list( ConsesLow.list( makeString( "salient URL" ) ), makeString(
                                  "salient URL" ) ), ConsesLow.list( ConsesLow.list( makeString( "predicates Cyc L Module Type" ) ), makeString( "predicates cyc l module type" ) ), ConsesLow.list( ConsesLow.list(
                                      makeString( "suffrage Age" ) ), makeString( "suffrage age" ) ), ConsesLow.list( ConsesLow.list( makeString( "report Time" ) ), makeString( "report time" ) ), ConsesLow.list(
                                          ConsesLow.list( makeString( "sub Topic Ordered Query Words" ) ), makeString( "sub topic ordered query words" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                              "computer Speed" ) ), makeString( "computer speed" ) ), ConsesLow.list( ConsesLow.list( makeString( "founding Date" ) ), makeString( "founding date" ) ), ConsesLow.list(
                                                  ConsesLow.list( makeString( "task Scheduler Task Expression" ) ), makeString( "task scheduler task expression" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                      "regional Telephone Area Code" ) ), makeString( "regional telephone area code" ) ), ConsesLow.list( ConsesLow.list( makeString( "sub Topic Query Restrict Clause" ) ),
                                                          makeString( "sub topic query restrict clause" ) ), ConsesLow.list( ConsesLow.list( makeString( "hobby CW Performed By" ) ), makeString(
                                                              "hobby CW performed by" ) ), ConsesLow.list( ConsesLow.list( makeString( "date Of Publication CW" ) ), makeString( "date of publication CW" ) ), ConsesLow
                                                                  .list( ConsesLow.list( makeString( "sks Logical Schema Description Mt" ) ), makeString( "sks logical schema description mt" ) ), ConsesLow.list( ConsesLow
                                                                      .list( makeString( "room Faces" ) ), makeString( "room faces" ) ), ConsesLow.list( ConsesLow.list( makeString( "has Status With Organization" ) ),
                                                                          makeString( "has status with organization" ) ), ConsesLow.list( ConsesLow.list( makeString( "place Joined Jihad" ) ), makeString(
                                                                              "place joined jihad" ) ), ConsesLow.list( ConsesLow.list( makeString( "program Author" ) ), makeString( "program author" ) ), ConsesLow.list(
                                                                                  ConsesLow.list( makeString( "typical Location Of Type" ) ), makeString( "typical location of type" ) ), ConsesLow.list( ConsesLow.list(
                                                                                      makeString( "from-Generic" ) ), makeString( "from-generic" ) ), ConsesLow.list( ConsesLow.list( makeString( "standard Unit" ) ),
                                                                                          makeString( "standard unit" ) ), ConsesLow.list( ConsesLow.list( makeString( "ke Genls Induced Strong Suggestion Preds" ) ),
                                                                                              makeString( "ke genls induced strong suggestion preds" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                                  "predicates Cyc L Graph Type" ) ), makeString( "predicates cyc l graph type" ) ), ConsesLow.list( ConsesLow.list(
                                                                                                      makeString( "task Type Uses Tactical Object Type" ) ), makeString( "task type uses tactical object type" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "negative Vested Interest" ) ), makeString( "negative vested interest" ) ), ConsesLow.list( ConsesLow.list( makeString( "required Actor Slots" ) ), makeString(
          "required actor slots" ) ), ConsesLow.list( ConsesLow.list( makeString( "parasite Causes Ailment Condition" ) ), makeString( "parasite causes ailment condition" ) ), ConsesLow.list( ConsesLow.list( makeString(
              "closed Under" ) ), makeString( "closed under" ) ), ConsesLow.list( ConsesLow.list( makeString( "incorporated In" ) ), makeString( "incorporated in" ) ), ConsesLow.list( ConsesLow.list( makeString(
                  "place Of Death" ) ), makeString( "place of death" ) ), ConsesLow.list( ConsesLow.list( makeString( "order Of Collection" ) ), makeString( "order of collection" ) ), ConsesLow.list( ConsesLow.list(
                      makeString( "account Logged In On" ) ), makeString( "account logged in on" ) ), ConsesLow.list( ConsesLow.list( makeString( "holds In" ) ), makeString( "holds in" ) ), ConsesLow.list( ConsesLow
                          .list( makeString( "holiday Celebrated In Polity" ) ), makeString( "holiday celebrated in polity" ) ), ConsesLow.list( ConsesLow.list( makeString( "ke Strong Suggestion Preds" ) ), makeString(
                              "ke strong suggestion preds" ) ), ConsesLow.list( ConsesLow.list( makeString( "contains Modules" ) ), makeString( "contains modules" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                  "target Posture" ) ), makeString( "target posture" ) ), ConsesLow.list( ConsesLow.list( makeString( "spatially Intersects" ) ), makeString( "spatially intersects" ) ), ConsesLow.list(
                                      ConsesLow.list( makeString( "inter Arg Reln 2 3" ) ), makeString( "inter arg reln 2 3" ) ), ConsesLow.list( ConsesLow.list( makeString( "total Merchant Marine Mass" ) ), makeString(
                                          "total merchant marine mass" ) ), ConsesLow.list( ConsesLow.list( makeString( "region Lacks Transport Means" ) ), makeString( "region lacks transport means" ) ), ConsesLow.list(
                                              ConsesLow.list( makeString( "task Uses Contributions Of" ) ), makeString( "task uses contributions of" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                  "holds Sometime During" ) ), makeString( "holds sometime during" ) ), ConsesLow.list( ConsesLow.list( makeString( "affiliated Organizations" ) ), makeString(
                                                      "affiliated organizations" ) ), ConsesLow.list( ConsesLow.list( makeString( "succeeding Interval Type" ) ), makeString( "succeeding interval type" ) ), ConsesLow
                                                          .list( ConsesLow.list( makeString( "quantity Subsumes" ) ), makeString( "quantity subsumes" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                              "glf Node Semantics Underspecified" ) ), makeString( "glf node semantics underspecified" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                  "worn With Garment Type" ) ), makeString( "worn with garment type" ) ), ConsesLow.list( ConsesLow.list( makeString( "present In Region" ) ), makeString(
                                                                      "present in region" ) ), ConsesLow.list( ConsesLow.list( makeString( "participant In" ) ), makeString( "participant in" ) ), ConsesLow.list( ConsesLow
                                                                          .list( makeString( "gun Takes Ammunition" ) ), makeString( "gun takes ammunition" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                              "multiplier Type For Quantity Type" ) ), makeString( "multiplier type for quantity type" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                  "pos Pred For Template Category" ) ), makeString( "pos pred for template category" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                      "style Of Music Performer" ) ), makeString( "style of music performer" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                          "capital City" ) ), makeString( "capital city" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                              "task Type Commensurate With Op Type" ) ), makeString( "task type commensurate with op type" ) ), ConsesLow.list( ConsesLow
                                                                                                  .list( makeString( "chemical CAS Registry" ) ), makeString( "chemical CAS registry" ) ), ConsesLow.list( ConsesLow.list(
                                                                                                      makeString( "type Associated Payment Plan" ) ), makeString( "type associated payment plan" ) ), ConsesLow.list(
                                                                                                          ConsesLow.list( makeString( "color Has Brightness" ) ), makeString( "color has brightness" ) ), ConsesLow.list(
                                                                                                              ConsesLow.list( makeString( "urge Type Satisfied" ) ), makeString( "urge type satisfied" ) ), ConsesLow.list(
                                                                                                                  ConsesLow.list( makeString( "partitioned Into Spec Preds" ) ), makeString(
                                                                                                                      "partitioned into spec preds" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                                                          "type Ingredient Types" ) ), makeString( "type ingredient types" ) ), ConsesLow.list( ConsesLow
                                                                                                                              .list( makeString( "singular" ) ), makeString( "singular" ) ), ConsesLow.list( ConsesLow.list(
                                                                                                                                  makeString( "movie Actors" ) ), makeString( "movie actors" ) ), ConsesLow.list( ConsesLow
                                                                                                                                      .list( makeString( "physical Extent" ) ), makeString( "physical extent" ) ), ConsesLow
                                                                                                                                          .list( ConsesLow.list( makeString( "version Of Product Brand" ) ), makeString(
                                                                                                                                              "version of product brand" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                                                                                  "age Of Agent When Joined Jihad" ) ), makeString(
                                                                                                                                                      "age of agent when joined jihad" ) ), ConsesLow.list( ConsesLow.list(
                                                                                                                                                          makeString( "ins Marketed As" ) ), makeString(
                                                                                                                                                              "ins marketed as" ) ), ConsesLow.list( ConsesLow.list(
                                                                                                                                                                  makeString( "contemporary In Arg" ) ), makeString(
                                                                                                                                                                      "contemporary in arg" ) ), ConsesLow.list( ConsesLow
                                                                                                                                                                          .list( makeString( "predominant Language" ) ),
                                                                                                                                                                          makeString( "predominant language" ) ), ConsesLow
                                                                                                                                                                              .list( ConsesLow.list( makeString(
                                                                                                                                                                                  "fault Vulnerability Installed" ) ),
                                                                                                                                                                                  makeString(
                                                                                                                                                                                      "fault vulnerability installed" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "sole Maker Of Product Type" ) ), makeString( "sole maker of product type" ) ), ConsesLow.list( ConsesLow.list( makeString( "orthography" ) ), makeString(
          "orthography" ) ), ConsesLow.list( ConsesLow.list( makeString( "inherit All Role Players Sit Type To Sub Sit Type" ) ), makeString( "inherit all role players sit type to sub sit type" ) ), ConsesLow.list(
              ConsesLow.list( makeString( "significant Event Acquaintance" ) ), makeString( "significant event acquaintance" ) ), ConsesLow.list( ConsesLow.list( makeString( "penn Tag For Pred" ) ), makeString(
                  "penn tag for pred" ) ), ConsesLow.list( ConsesLow.list( makeString( "sub Works" ) ), makeString( "sub works" ) ), ConsesLow.list( ConsesLow.list( makeString( "program Running On" ) ), makeString(
                      "program running on" ) ), ConsesLow.list( ConsesLow.list( makeString( "ks Term String" ) ), makeString( "ks term string" ) ), ConsesLow.list( ConsesLow.list( makeString( "arg 4 Genl" ) ),
                          makeString( "arg 4 genl" ) ), ConsesLow.list( ConsesLow.list( makeString( "fields Of Formal Education" ) ), makeString( "fields of formal education" ) ), ConsesLow.list( ConsesLow.list(
                              makeString( "permanently Northwest Of" ) ), makeString( "permanently northwest of" ) ), ConsesLow.list( ConsesLow.list( makeString( "frequently In Contact With" ) ), makeString(
                                  "frequently in contact with" ) ), ConsesLow.list( ConsesLow.list( makeString( "minor League Affiliates" ) ), makeString( "minor league affiliates" ) ), ConsesLow.list( ConsesLow.list(
                                      makeString( "test Query Specification" ) ), makeString( "test query specification" ) ), ConsesLow.list( ConsesLow.list( makeString( "parameter Of Program" ) ), makeString(
                                          "parameter of program" ) ), ConsesLow.list( ConsesLow.list( makeString( "country Of City" ) ), makeString( "country of city" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                              "information Origin" ) ), makeString( "information origin" ) ), ConsesLow.list( ConsesLow.list( makeString( "program Found On Computer" ) ), makeString(
                                                  "program found on computer" ) ), ConsesLow.list( ConsesLow.list( makeString( "eats Willingly" ) ), makeString( "eats willingly" ) ), ConsesLow.list( ConsesLow.list(
                                                      makeString( "means Of Deploying Agent BCW" ) ), makeString( "means of deploying agent BCW" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                          "exploit Targets Program" ) ), makeString( "exploit targets program" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                              "characteristic Activity Type Of Organization Type" ) ), makeString( "characteristic activity type of organization type" ) ), ConsesLow.list( ConsesLow.list(
                                                                  makeString( "type Genls" ) ), makeString( "type genls" ) ), ConsesLow.list( ConsesLow.list( makeString( "ethnicity" ) ), makeString( "ethnicity" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "arg 2 Not Isa" ) ), makeString( "arg 2 not isa" ) ), ConsesLow.list( ConsesLow.list( makeString( "episode Type" ) ), makeString( "episode type" ) ), ConsesLow.list(
          ConsesLow.list( makeString( "following Value" ) ), makeString( "following value" ) ), ConsesLow.list( ConsesLow.list( makeString( "variant Of Suffix" ) ), makeString( "variant of suffix" ) ), ConsesLow.list(
              ConsesLow.list( makeString( "forms Border Part" ) ), makeString( "forms border part" ) ), ConsesLow.list( ConsesLow.list( makeString( "permanently East Of" ) ), makeString( "permanently east of" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "test Metrics To Gather" ) ), makeString( "test metrics to gather" ) ), ConsesLow.list( ConsesLow.list( makeString( "speech Part Preds" ) ), makeString(
          "speech part preds" ) ), ConsesLow.list( ConsesLow.list( makeString( "ke Weak Suggestion Preds" ) ), makeString( "ke weak suggestion preds" ) ), ConsesLow.list( ConsesLow.list( makeString(
              "spatially Intrinsic Arg" ) ), makeString( "spatially intrinsic arg" ) ), ConsesLow.list( ConsesLow.list( makeString( "required Arg 1 Pred" ) ), makeString( "required arg 1 pred" ) ), ConsesLow.list(
                  ConsesLow.list( makeString( "highest Education Level" ) ), makeString( "highest education level" ) ), ConsesLow.list( ConsesLow.list( makeString( "occupation" ) ), makeString( "occupation" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "expansion" ) ), makeString( "expansion" ) ), ConsesLow.list( ConsesLow.list( makeString( "agent Stays Viable After Deployment BCW" ) ), makeString(
          "agent stays viable after deployment BCW" ) ), ConsesLow.list( ConsesLow.list( makeString( "pathogen With Respect To" ) ), makeString( "pathogen with respect to" ) ), ConsesLow.list( ConsesLow.list( makeString(
              "facet Based On Type Binary Pred" ) ), makeString( "facet based on type binary pred" ) ), ConsesLow.list( ConsesLow.list( makeString( "symmetric On" ) ), makeString( "symmetric on" ) ), ConsesLow.list(
                  ConsesLow.list( makeString( "date Left Jihad" ) ), makeString( "date left jihad" ) ), ConsesLow.list( ConsesLow.list( makeString( "state Of County" ) ), makeString( "state of county" ) ), ConsesLow
                      .list( ConsesLow.list( makeString( "agent Type Sells Product Type" ) ), makeString( "agent type sells product type" ) ), ConsesLow.list( ConsesLow.list( makeString(
                          "fault Vulnerability Running" ) ), makeString( "fault vulnerability running" ) ), ConsesLow.list( ConsesLow.list( makeString( "temporally Subsumes Type Type" ) ), makeString(
                              "temporally subsumes type type" ) ), ConsesLow.list( ConsesLow.list( makeString( "proper Sub Situation Types" ) ), makeString( "proper sub situation types" ) ), ConsesLow.list( ConsesLow
                                  .list( makeString( "intended Target Type Of Weapon Type" ) ), makeString( "intended target type of weapon type" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                      "last Proper Sub Situation Types" ) ), makeString( "last proper sub situation types" ) ), ConsesLow.list( ConsesLow.list( makeString( "homepage" ) ), makeString( "homepage" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "pathogen Sole Cause Of Infection Type" ) ), makeString( "pathogen sole cause of infection type" ) ), ConsesLow.list( ConsesLow.list( makeString( "borders On" ) ),
          makeString( "borders on" ) ), ConsesLow.list( ConsesLow.list( makeString( "active Ingredients Of Type" ) ), makeString( "active ingredients of type" ) ), ConsesLow.list( ConsesLow.list( makeString(
              "common Food Type Of Cuisine" ) ), makeString( "common food type of cuisine" ) ), ConsesLow.list( ConsesLow.list( makeString( "inter Arg Reln 1 2" ) ), makeString( "inter arg reln 1 2" ) ), ConsesLow.list(
                  ConsesLow.list( makeString( "event Type Duration Of Effects" ) ), makeString( "event type duration of effects" ) ), ConsesLow.list( ConsesLow.list( makeString( "name String NC" ) ), makeString(
                      "name string NC" ) ), ConsesLow.list( ConsesLow.list( makeString( "corresponding Military Task Type" ) ), makeString( "corresponding military task type" ) ), ConsesLow.list( ConsesLow.list(
                          makeString( "contains Information About Focally" ) ), makeString( "contains information about focally" ) ), ConsesLow.list( ConsesLow.list( makeString( "protects Against Type" ) ), makeString(
                              "protects against type" ) ), ConsesLow.list( ConsesLow.list( makeString( "geopolitical Subdivision" ) ), makeString( "geopolitical subdivision" ) ), ConsesLow.list( ConsesLow.list(
                                  makeString( "domain Example Pred Sentences" ) ), makeString( "domain example pred sentences" ) ), ConsesLow.list( ConsesLow.list( makeString( "preferred E Mail Address Text" ) ),
                                      makeString( "preferred e mail address text" ) ), ConsesLow.list( ConsesLow.list( makeString( "subject Of Report Prop" ) ), makeString( "subject of report prop" ) ), ConsesLow.list(
                                          ConsesLow.list( makeString( "ke Requirement Preds" ) ), makeString( "ke requirement preds" ) ), ConsesLow.list( ConsesLow.list( makeString( "unique Physical Part Types" ) ),
                                              makeString( "unique physical part types" ) ), ConsesLow.list( ConsesLow.list( makeString( "place In City" ) ), makeString( "place in city" ) ), ConsesLow.list( ConsesLow
                                                  .list( makeString( "temporally Disjoint Action Types" ) ), makeString( "temporally disjoint action types" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                      "indicated Drug" ) ), makeString( "indicated drug" ) ), ConsesLow.list( ConsesLow.list( makeString( "alias" ) ), makeString( "alias" ) ), ConsesLow.list( ConsesLow
                                                          .list( makeString( "central Reference Point" ) ), makeString( "central reference point" ) ), ConsesLow.list( ConsesLow.list( makeString( "agentive-Sg" ) ),
                                                              makeString( "agentive-sg" ) ), ConsesLow.list( ConsesLow.list( makeString( "partitioned Into" ) ), makeString( "partitioned into" ) ), ConsesLow.list(
                                                                  ConsesLow.list( makeString( "url Of CW" ) ), makeString( "url of CW" ) ), ConsesLow.list( ConsesLow.list( makeString( "social Class" ) ), makeString(
                                                                      "social class" ) ), ConsesLow.list( ConsesLow.list( makeString( "language Spoken" ) ), makeString( "language spoken" ) ), ConsesLow.list( ConsesLow
                                                                          .list( makeString( "fault Vulnerability Remote" ) ), makeString( "fault vulnerability remote" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                              "total Merchant Marine Volume" ) ), makeString( "total merchant marine volume" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                  "permanently Northeast Of" ) ), makeString( "permanently northeast of" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                      "sub L Symbol For Module" ) ), makeString( "sub l symbol for module" ) ), ConsesLow.list( ConsesLow.list( makeString( "arg 5 Isa" ) ),
                                                                                          makeString( "arg 5 isa" ) ), ConsesLow.list( ConsesLow.list( makeString( "date Of Death Event" ) ), makeString(
                                                                                              "date of death event" ) ), ConsesLow.list( ConsesLow.list( makeString( "altitude Of Highest Point Is" ) ), makeString(
                                                                                                  "altitude of highest point is" ) ), ConsesLow.list( ConsesLow.list( makeString( "event Type Caused Death Of" ) ),
                                                                                                      makeString( "event type caused death of" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                                          "territories Controlled" ) ), makeString( "territories controlled" ) ), ConsesLow.list( ConsesLow.list(
                                                                                                              makeString( "possessive Relation" ) ), makeString( "possessive relation" ) ), ConsesLow.list( ConsesLow.list(
                                                                                                                  makeString( "color Has RGB Red Value" ) ), makeString( "color has RGB red value" ) ), ConsesLow.list(
                                                                                                                      ConsesLow.list( makeString( "ke Strong Suggestion" ) ), makeString( "ke strong suggestion" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "characteristic Activity Type Of Person Type Frequently" ) ), makeString( "characteristic activity type of person type frequently" ) ), ConsesLow.list( ConsesLow.list(
          makeString( "architectural Style" ) ), makeString( "architectural style" ) ), ConsesLow.list( ConsesLow.list( makeString( "shared Notes" ) ), makeString( "shared notes" ) ), ConsesLow.list( ConsesLow.list(
              makeString( "frequent Prototypical Activity Type Of Person Type" ) ), makeString( "frequent prototypical activity type of person type" ) ), ConsesLow.list( ConsesLow.list( makeString( "able To Control" ) ),
                  makeString( "able to control" ) ), ConsesLow.list( ConsesLow.list( makeString( "color Has RGB Blue Value" ) ), makeString( "color has RGB blue value" ) ), ConsesLow.list( ConsesLow.list( makeString(
                      "distribution Medium" ) ), makeString( "distribution medium" ) ), ConsesLow.list( ConsesLow.list( makeString( "sub Orgs Command" ) ), makeString( "sub orgs command" ) ), ConsesLow.list( ConsesLow
                          .list( makeString( "cultural Region Of Origin" ) ), makeString( "cultural region of origin" ) ), ConsesLow.list( ConsesLow.list( makeString( "qa Web String" ) ), makeString( "qa web string" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "arg 4 Isa" ) ), makeString( "arg 4 isa" ) ), ConsesLow.list( ConsesLow.list( makeString( "program Strings" ) ), makeString( "program strings" ) ), ConsesLow.list(
          ConsesLow.list( makeString( "color Has RGB Green Value" ) ), makeString( "color has RGB green value" ) ), ConsesLow.list( ConsesLow.list( makeString( "example NATs" ) ), makeString( "example NATs" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "ethnic Groups Here" ) ), makeString( "ethnic groups here" ) ), ConsesLow.list( ConsesLow.list( makeString( "unit Definition" ) ), makeString( "unit definition" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "inter Arg Reln 1 3" ) ), makeString( "inter arg reln 1 3" ) ), ConsesLow.list( ConsesLow.list( makeString( "action Type Expresses Feeling Type" ) ), makeString(
          "action type expresses feeling type" ) ), ConsesLow.list( ConsesLow.list( makeString( "genre Heyday" ) ), makeString( "genre heyday" ) ), ConsesLow.list( ConsesLow.list( makeString( "structure In Area" ) ),
              makeString( "structure in area" ) ), ConsesLow.list( ConsesLow.list( makeString( "uppercase Of Lowercase" ) ), makeString( "uppercase of lowercase" ) ), ConsesLow.list( ConsesLow.list( makeString(
                  "E Mail Address Text" ) ), makeString( "E mail address text" ) ), ConsesLow.list( ConsesLow.list( makeString( "quoted Argument" ) ), makeString( "quoted argument" ) ), ConsesLow.list( ConsesLow.list(
                      makeString( "focal Activity Type" ) ), makeString( "focal activity type" ) ), ConsesLow.list( ConsesLow.list( makeString( "modality Features" ) ), makeString( "modality features" ) ), ConsesLow
                          .list( ConsesLow.list( makeString( "mandatory Game Equipment Type" ) ), makeString( "mandatory game equipment type" ) ), ConsesLow.list( ConsesLow.list( makeString(
                              "test Responsible Cyclist" ) ), makeString( "test responsible cyclist" ) ), ConsesLow.list( ConsesLow.list( makeString( "formula For Formula Template" ) ), makeString(
                                  "formula for formula template" ) ), ConsesLow.list( ConsesLow.list( makeString( "ke Induced Weak Suggestion Preds" ) ), makeString( "ke induced weak suggestion preds" ) ), ConsesLow
                                      .list( ConsesLow.list( makeString( "specified Subset Of" ) ), makeString( "specified subset of" ) ), ConsesLow.list( ConsesLow.list( makeString( "proper Sub Event Types" ) ),
                                          makeString( "proper sub event types" ) ), ConsesLow.list( ConsesLow.list( makeString( "date Joined Jihad" ) ), makeString( "date joined jihad" ) ), ConsesLow.list( ConsesLow
                                              .list( makeString( "cyc Subject Clumps" ) ), makeString( "cyc subject clumps" ) ), ConsesLow.list( ConsesLow.list( makeString( "president Of Country" ) ), makeString(
                                                  "president of country" ) ), ConsesLow.list( ConsesLow.list( makeString( "sub L Identifier" ) ), makeString( "sub l identifier" ) ), ConsesLow.list( ConsesLow.list(
                                                      makeString( "file Found On Computer" ) ), makeString( "file found on computer" ) ), ConsesLow.list( ConsesLow.list( makeString( "in Region" ) ), makeString(
                                                          "in region" ) ), ConsesLow.list( ConsesLow.list( makeString( "country Phone Code" ) ), makeString( "country phone code" ) ), ConsesLow.list( ConsesLow.list(
                                                              makeString( "intended Target Type Of Attack" ) ), makeString( "intended target type of attack" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                  "polities Border Each Other" ) ), makeString( "polities border each other" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                      "predicates SBHL Disjoins Module" ) ), makeString( "predicates SBHL disjoins module" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                          "reified Using Tool" ) ), makeString( "reified using tool" ) ), ConsesLow.list( ConsesLow.list( makeString( "arg 3 Isa" ) ), makeString(
                                                                              "arg 3 isa" ) ), ConsesLow.list( ConsesLow.list( makeString( "predicates SBHL Type Test" ) ), makeString( "predicates SBHL type test" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "arg 3 Genl" ) ), makeString( "arg 3 genl" ) ), ConsesLow.list( ConsesLow.list( makeString( "arg 2 Genl" ) ), makeString( "arg 2 genl" ) ), ConsesLow.list( ConsesLow
          .list( makeString( "middle Name Initial" ) ), makeString( "middle name initial" ) ), ConsesLow.list( ConsesLow.list( makeString( "has Authority Over" ) ), makeString( "has authority over" ) ), ConsesLow.list(
              ConsesLow.list( makeString( "temporally Contains" ) ), makeString( "temporally contains" ) ), ConsesLow.list( ConsesLow.list( makeString( "super Topics" ) ), makeString( "super topics" ) ), ConsesLow.list(
                  ConsesLow.list( makeString( "member Types" ) ), makeString( "member types" ) ), ConsesLow.list( ConsesLow.list( makeString( "color Has Hue" ) ), makeString( "color has hue" ) ), ConsesLow.list(
                      ConsesLow.list( makeString( "args Isa" ) ), makeString( "args isa" ) ), ConsesLow.list( ConsesLow.list( makeString( "arg 1 Not Isa" ) ), makeString( "arg 1 not isa" ) ), ConsesLow.list( ConsesLow
                          .list( makeString( "main Topic" ) ), makeString( "main topic" ) ), ConsesLow.list( ConsesLow.list( makeString( "open Entry Format In Args" ) ), makeString( "open entry format in args" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "reformulate Template Via Specification" ) ), makeString( "reformulate template via specification" ) ), ConsesLow.list( ConsesLow.list( makeString(
          "terrain Decompositions" ) ), makeString( "terrain decompositions" ) ), ConsesLow.list( ConsesLow.list( makeString( "info Transferred" ) ), makeString( "info transferred" ) ), ConsesLow.list( ConsesLow.list(
              makeString( "transported In Types" ) ), makeString( "transported in types" ) ), ConsesLow.list( ConsesLow.list( makeString( "contradictory Preds" ) ), makeString( "contradictory preds" ) ), ConsesLow.list(
                  ConsesLow.list( makeString( "agent Type Uses Artifact Type" ) ), makeString( "agent type uses artifact type" ) ), ConsesLow.list( ConsesLow.list( makeString( "gen Template" ) ), makeString(
                      "gen template" ) ), ConsesLow.list( ConsesLow.list( makeString( "system Of Writing" ) ), makeString( "system of writing" ) ), ConsesLow.list( ConsesLow.list( makeString( "uppercase Of Letter" ) ),
                          makeString( "uppercase of letter" ) ), ConsesLow.list( ConsesLow.list( makeString( "roles For Event Type" ) ), makeString( "roles for event type" ) ), ConsesLow.list( ConsesLow.list( makeString(
                              "template Topic Prefix" ) ), makeString( "template topic prefix" ) ), ConsesLow.list( ConsesLow.list( makeString( "job Class" ) ), makeString( "job class" ) ), ConsesLow.list( ConsesLow
                                  .list( makeString( "super Event Types" ) ), makeString( "super event types" ) ), ConsesLow.list( ConsesLow.list( makeString( "iterated Proper Sub Situation Types" ) ), makeString(
                                      "iterated proper sub situation types" ) ), ConsesLow.list( ConsesLow.list( makeString( "ke Induced Strong Suggestion Preds" ) ), makeString( "ke induced strong suggestion preds" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "permanently North Of" ) ), makeString( "permanently north of" ) ), ConsesLow.list( ConsesLow.list( makeString( "percent Natural Population Increase" ) ), makeString(
          "percent natural population increase" ) ), ConsesLow.list( ConsesLow.list( makeString( "title For Formula Template Type String" ) ), makeString( "title for formula template type string" ) ), ConsesLow.list(
              ConsesLow.list( makeString( "subcat Frame Keywords" ) ), makeString( "subcat frame keywords" ) ), ConsesLow.list( ConsesLow.list( makeString( "rewrite Of" ) ), makeString( "rewrite of" ) ), ConsesLow.list(
                  ConsesLow.list( makeString( "residence Of Organization" ) ), makeString( "residence of organization" ) ), ConsesLow.list( ConsesLow.list( makeString( "arg 2 Format" ) ), makeString( "arg 2 format" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "surrounds Horizontally" ) ), makeString( "surrounds horizontally" ) ), ConsesLow.list( ConsesLow.list( makeString( "most Notable Isa" ) ), makeString(
          "most notable isa" ) ), ConsesLow.list( ConsesLow.list( makeString( "style Of Artist" ) ), makeString( "style of artist" ) ), ConsesLow.list( ConsesLow.list( makeString(
              "specialized Equipment Of Unit Type" ) ), makeString( "specialized equipment of unit type" ) ), ConsesLow.list( ConsesLow.list( makeString( "in Topic" ) ), makeString( "in topic" ) ), ConsesLow.list(
                  ConsesLow.list( makeString( "disjoint With" ) ), makeString( "disjoint with" ) ), ConsesLow.list( ConsesLow.list( makeString( "areas Of Origin" ) ), makeString( "areas of origin" ) ), ConsesLow.list(
                      ConsesLow.list( makeString( "conceptually Related" ) ), makeString( "conceptually related" ) ), ConsesLow.list( ConsesLow.list( makeString( "inter Arg Reln 2 4" ) ), makeString(
                          "inter arg reln 2 4" ) ), ConsesLow.list( ConsesLow.list( makeString( "arg 1 Genl" ) ), makeString( "arg 1 genl" ) ), ConsesLow.list( ConsesLow.list( makeString( "arg 3 Format" ) ), makeString(
                              "arg 3 format" ) ), ConsesLow.list( ConsesLow.list( makeString( "temporal Bounds Contain" ) ), makeString( "temporal bounds contain" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                  "agent Type Works At Location Type" ) ), makeString( "agent type works at location type" ) ), ConsesLow.list( ConsesLow.list( makeString( "relation Category Type" ) ), makeString(
                                      "relation category type" ) ), ConsesLow.list( ConsesLow.list( makeString( "main Subject Clump" ) ), makeString( "main subject clump" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                          "arg 1 Format" ) ), makeString( "arg 1 format" ) ), ConsesLow.list( ConsesLow.list( makeString( "conceptually Co Related" ) ), makeString( "conceptually co related" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "genl Functions" ) ), makeString( "genl functions" ) ), ConsesLow.list( ConsesLow.list( makeString( "arg 2 Isa" ) ), makeString( "arg 2 isa" ) ), ConsesLow.list(
          ConsesLow.list( makeString( "definitional Mt For Topic Assertions" ) ), makeString( "definitional mt for topic assertions" ) ), ConsesLow.list( ConsesLow.list( makeString( "arg 1 Isa" ) ), makeString(
              "arg 1 isa" ) ), ConsesLow.list( ConsesLow.list( makeString( "color Has Chroma" ) ), makeString( "color has chroma" ) ), ConsesLow.list( ConsesLow.list( makeString( "indigenous To" ) ), makeString(
                  "indigenous to" ) )
    } );
  }

  private static SubLObject _constant_217_initializer()
  {
    return ConsesLow.list( new SubLObject[] { ConsesLow.list( ConsesLow.list( makeString( "organizationGrantsFranchisesOfType" ) ), makeString( "organization Grants Franchises Of Type" ) ), ConsesLow.list( ConsesLow
        .list( makeString( "identityConditionsFor" ) ), makeString( "identity Conditions For" ) ), ConsesLow.list( ConsesLow.list( makeString( "dateOfDeath" ) ), makeString( "date Of Death" ) ), ConsesLow.list( ConsesLow
            .list( makeString( "developerOfIBTType" ) ), makeString( "developer Of IBT Type" ) ), ConsesLow.list( ConsesLow.list( makeString( "correspondingCycCollection" ) ), makeString(
                "corresponding Cyc Collection" ) ), ConsesLow.list( ConsesLow.list( makeString( "InverseBinaryPredicateFn" ) ), makeString( "Inverse Binary Predicate Fn" ) ), ConsesLow.list( ConsesLow.list( makeString(
                    "toxinTypeProducedByOrganismType" ) ), makeString( "toxin Type Produced By Organism Type" ) ), ConsesLow.list( ConsesLow.list( makeString( "europeanDiscoveryBy" ) ), makeString(
                        "european Discovery By" ) ), ConsesLow.list( ConsesLow.list( makeString( "constructionStartingDate" ) ), makeString( "construction Starting Date" ) ), ConsesLow.list( ConsesLow.list( makeString(
                            "highestPeakInThisGroup" ) ), makeString( "highest Peak In This Group" ) ), ConsesLow.list( ConsesLow.list( makeString( "umlName" ) ), makeString( "uml Name" ) ), ConsesLow.list( ConsesLow
                                .list( makeString( "programObjectTypeRepresents" ) ), makeString( "program Object Type Represents" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                    "higherPriorityTemplateType-Immediate" ) ), makeString( "higher Priority Template Type Immediate" ) ), ConsesLow.list( ConsesLow.list( makeString( "subcatFrameArity" ) ), makeString(
                                        "subcat Frame Arity" ) ), ConsesLow.list( ConsesLow.list( makeString( "fieldStudies" ) ), makeString( "field Studies" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                            "vulnerabilityEnablesAttack" ) ), makeString( "vulnerability Enables Attack" ) ), ConsesLow.list( ConsesLow.list( makeString( "owlDefiningOntologyURI" ) ), makeString(
                                                "owl Defining Ontology URI" ) ), ConsesLow.list( ConsesLow.list( makeString( "languagesSpokenHere" ) ), makeString( "languages Spoken Here" ) ), ConsesLow.list( ConsesLow
                                                    .list( makeString( "numberOfHostagesTaken" ) ), makeString( "number Of Hostages Taken" ) ), ConsesLow.list( ConsesLow.list( makeString( "lowercaseOfLetter" ) ),
                                                        makeString( "lowercase Of Letter" ) ), ConsesLow.list( ConsesLow.list( makeString( "conditionAffectsPartType" ) ), makeString( "condition Affects Part Type" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "timeZoneOffsetToGMT" ) ), makeString( "time Zone Offset To GMT" ) ), ConsesLow.list( ConsesLow.list( makeString( "hasDepartmentTypes" ) ), makeString(
          "has Department Types" ) ), ConsesLow.list( ConsesLow.list( makeString( "cyclistPrimaryProject" ) ), makeString( "cyclist Primary Project" ) ), ConsesLow.list( ConsesLow.list( makeString(
              "landAreaOfRegion" ) ), makeString( "land Area Of Region" ) ), ConsesLow.list( ConsesLow.list( makeString( "comparativeDegree" ) ), makeString( "comparative Degree" ) ), ConsesLow.list( ConsesLow.list(
                  makeString( "polityHasTransportMeans" ) ), makeString( "polity Has Transport Means" ) ), ConsesLow.list( ConsesLow.list( makeString( "fileFormatHasSuffix" ) ), makeString( "file Format Has Suffix" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "drugOfChoiceAdministeredFor" ) ), makeString( "drug Of Choice Administered For" ) ), ConsesLow.list( ConsesLow.list( makeString( "taskStatus" ) ), makeString(
          "task Status" ) ), ConsesLow.list( ConsesLow.list( makeString( "principalLandmarksOfCity" ) ), makeString( "principal Landmarks Of City" ) ), ConsesLow.list( ConsesLow.list( makeString( "infinitive" ) ),
              makeString( "infinitive" ) ), ConsesLow.list( ConsesLow.list( makeString( "performsActsOfType" ) ), makeString( "performs Acts Of Type" ) ), ConsesLow.list( ConsesLow.list( makeString(
                  "geographicalSubRegionsOfCountry" ) ), makeString( "geographical Sub Regions Of Country" ) ), ConsesLow.list( ConsesLow.list( makeString( "televisionActors" ) ), makeString( "television Actors" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "characterSetForWritingSystem" ) ), makeString( "character Set For Writing System" ) ), ConsesLow.list( ConsesLow.list( makeString(
          "internationalOrganizationMemberCountries" ) ), makeString( "international Organization Member Countries" ) ), ConsesLow.list( ConsesLow.list( makeString( "builderQueryForTemplate" ) ), makeString(
              "builder Query For Template" ) ), ConsesLow.list( ConsesLow.list( makeString( "alterEgoOfHero" ) ), makeString( "alter Ego Of Hero" ) ), ConsesLow.list( ConsesLow.list( makeString(
                  "animalTypeMakesSoundType" ) ), makeString( "animal Type Makes Sound Type" ) ), ConsesLow.list( ConsesLow.list( makeString( "mainColorOfObject" ) ), makeString( "main Color Of Object" ) ), ConsesLow
                      .list( ConsesLow.list( makeString( "antisymmetricOn" ) ), makeString( "antisymmetric On" ) ), ConsesLow.list( ConsesLow.list( makeString( "lexicalWordTypeForLanguage" ) ), makeString(
                          "lexical Word Type For Language" ) ), ConsesLow.list( ConsesLow.list( makeString( "drainageArea" ) ), makeString( "drainage Area" ) ), ConsesLow.list( ConsesLow.list( makeString(
                              "sourceNodeInSystem" ) ), makeString( "source Node In System" ) ), ConsesLow.list( ConsesLow.list( makeString( "completeExtentEnumerableForArg" ) ), makeString(
                                  "complete Extent Enumerable For Arg" ) ), ConsesLow.list( ConsesLow.list( makeString( "morphologicallyDerivedFrom" ) ), makeString( "morphologically Derived From" ) ), ConsesLow.list(
                                      ConsesLow.list( makeString( "cwSeriesType" ) ), makeString( "cw Series Type" ) ), ConsesLow.list( ConsesLow.list( makeString( "programTypicallyInstalledWith" ) ), makeString(
                                          "program Typically Installed With" ) ), ConsesLow.list( ConsesLow.list( makeString( "testCollectionProjectResponsible" ) ), makeString( "test Collection Project Responsible" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "infectionTypeHasVectorType" ) ), makeString( "infection Type Has Vector Type" ) ), ConsesLow.list( ConsesLow.list( makeString( "stateOfAddress" ) ), makeString(
          "state Of Address" ) ), ConsesLow.list( ConsesLow.list( makeString( "defaultSpecializedType" ) ), makeString( "default Specialized Type" ) ), ConsesLow.list( ConsesLow.list( makeString(
              "agentTypeProvidesServiceOfType" ) ), makeString( "agent Type Provides Service Of Type" ) ), ConsesLow.list( ConsesLow.list( makeString( "discoveredByEuropeansWhen" ) ), makeString(
                  "discovered By Europeans When" ) ), ConsesLow.list( ConsesLow.list( makeString( "projectOfDepartment" ) ), makeString( "project Of Department" ) ), ConsesLow.list( ConsesLow.list( makeString(
                      "director-OrganizationalRole" ) ), makeString( "director Organizational Role" ) ), ConsesLow.list( ConsesLow.list( makeString( "regulatesActivityType" ) ), makeString( "regulates Activity Type" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "taskSchedulerTaskDatePattern" ) ), makeString( "task Scheduler Task Date Pattern" ) ), ConsesLow.list( ConsesLow.list( makeString( "computerMACAddress" ) ), makeString(
          "computer MAC Address" ) ), ConsesLow.list( ConsesLow.list( makeString( "derivationalAffixBasePOS" ) ), makeString( "derivational Affix Base POS" ) ), ConsesLow.list( ConsesLow.list( makeString(
              "softwareDesignedForArchitecture" ) ), makeString( "software Designed For Architecture" ) ), ConsesLow.list( ConsesLow.list( makeString( "regionProduces" ) ), makeString( "region Produces" ) ), ConsesLow
                  .list( ConsesLow.list( makeString( "sourceUsedForTask" ) ), makeString( "source Used For Task" ) ), ConsesLow.list( ConsesLow.list( makeString( "socialQuantityTypeExpressedByInsOfEventType" ) ),
                      makeString( "social Quantity Type Expressed By Ins Of Event Type" ) ), ConsesLow.list( ConsesLow.list( makeString( "softwareParameterSetInSoftwareObject" ) ), makeString(
                          "software Parameter Set In Software Object" ) ), ConsesLow.list( ConsesLow.list( makeString( "expressionTypeForTag" ) ), makeString( "expression Type For Tag" ) ), ConsesLow.list( ConsesLow
                              .list( makeString( "performancesOfWorkAre" ) ), makeString( "performances Of Work Are" ) ), ConsesLow.list( ConsesLow.list( makeString( "bugzillaBugReportAssignedTo" ) ), makeString(
                                  "bugzilla Bug Report Assigned To" ) ), ConsesLow.list( ConsesLow.list( makeString( "derivedUsingPrefix" ) ), makeString( "derived Using Prefix" ) ), ConsesLow.list( ConsesLow.list(
                                      makeString( "capitalCityOfState" ) ), makeString( "capital City Of State" ) ), ConsesLow.list( ConsesLow.list( makeString( "netMigrationRate" ) ), makeString(
                                          "net Migration Rate" ) ), ConsesLow.list( ConsesLow.list( makeString( "facesDirection" ) ), makeString( "faces Direction" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                              "programSourceCodeWrittenIn" ) ), makeString( "program Source Code Written In" ) ), ConsesLow.list( ConsesLow.list( makeString( "topInThesaurus" ) ), makeString(
                                                  "top In Thesaurus" ) ), ConsesLow.list( ConsesLow.list( makeString( "importantCompany" ) ), makeString( "important Company" ) ), ConsesLow.list( ConsesLow.list(
                                                      makeString( "clumpSyntaxList" ) ), makeString( "clump Syntax List" ) ), ConsesLow.list( ConsesLow.list( makeString( "correspondingKEInteractionResource" ) ),
                                                          makeString( "corresponding KE Interaction Resource" ) ), ConsesLow.list( ConsesLow.list( makeString( "formerOccupation" ) ), makeString( "former Occupation" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "minQuantValue" ) ), makeString( "min Quant Value" ) ), ConsesLow.list( ConsesLow.list( makeString( "keGenlsInducedWeakSuggestionPreds" ) ), makeString(
          "ke Genls Induced Weak Suggestion Preds" ) ), ConsesLow.list( ConsesLow.list( makeString( "binaryRoleTypePred" ) ), makeString( "binary Role Type Pred" ) ), ConsesLow.list( ConsesLow.list( makeString(
              "hourOfDayIndex-24Hour" ) ), makeString( "hour Of Day Index 24 Hour" ) ), ConsesLow.list( ConsesLow.list( makeString( "typeGenlMt" ) ), makeString( "type Genl Mt" ) ), ConsesLow.list( ConsesLow.list(
                  makeString( "readsLanguage" ) ), makeString( "reads Language" ) ), ConsesLow.list( ConsesLow.list( makeString( "emptiesInto" ) ), makeString( "empties Into" ) ), ConsesLow.list( ConsesLow.list(
                      makeString( "transportFacilityForType" ) ), makeString( "transport Facility For Type" ) ), ConsesLow.list( ConsesLow.list( makeString( "semTransArg" ) ), makeString( "sem Trans Arg" ) ), ConsesLow
                          .list( ConsesLow.list( makeString( "ventureCompany" ) ), makeString( "venture Company" ) ), ConsesLow.list( ConsesLow.list( makeString( "preservesGenlsInArg" ) ), makeString(
                              "preserves Genls In Arg" ) ), ConsesLow.list( ConsesLow.list( makeString( "ventureMember" ) ), makeString( "venture Member" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                  "interArgReln3-2" ) ), makeString( "inter Arg Reln 3 2" ) ), ConsesLow.list( ConsesLow.list( makeString( "baseForm" ) ), makeString( "base Form" ) ), ConsesLow.list( ConsesLow.list(
                                      makeString( "firstPublicationDate-CW" ) ), makeString( "first Publication Date CW" ) ), ConsesLow.list( ConsesLow.list( makeString( "numberTypeIntervalType" ) ), makeString(
                                          "number Type Interval Type" ) ), ConsesLow.list( ConsesLow.list( makeString( "eventTypeImplementedByProgramFunction" ) ), makeString(
                                              "event Type Implemented By Program Function" ) ), ConsesLow.list( ConsesLow.list( makeString( "mainLanguagesOfGPE" ) ), makeString( "main Languages Of GPE" ) ), ConsesLow
                                                  .list( ConsesLow.list( makeString( "geographicalSubRegionsOfState" ) ), makeString( "geographical Sub Regions Of State" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                      "fanOutArg" ) ), makeString( "fan Out Arg" ) ), ConsesLow.list( ConsesLow.list( makeString( "sksSchemaTranslationMt" ) ), makeString( "sks Schema Translation Mt" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "subTopicQueryBetterWords" ) ), makeString( "sub Topic Query Better Words" ) ), ConsesLow.list( ConsesLow.list( makeString( "succeedingValueOfMunsellHue" ) ), makeString(
          "succeeding Value Of Munsell Hue" ) ), ConsesLow.list( ConsesLow.list( makeString( "runsOS" ) ), makeString( "runs OS" ) ), ConsesLow.list( ConsesLow.list( makeString( "worksFoundInStructure" ) ), makeString(
              "works Found In Structure" ) ), ConsesLow.list( ConsesLow.list( makeString( "highestPointInRegion" ) ), makeString( "highest Point In Region" ) ), ConsesLow.list( ConsesLow.list( makeString(
                  "facetBasedOnBinaryPredInverse" ) ), makeString( "facet Based On Binary Pred Inverse" ) ), ConsesLow.list( ConsesLow.list( makeString( "independentArg" ) ), makeString( "independent Arg" ) ), ConsesLow
                      .list( ConsesLow.list( makeString( "nodeInLAN" ) ), makeString( "node In LAN" ) ), ConsesLow.list( ConsesLow.list( makeString( "fieldFostersAdvancedArtifactsOfType" ) ), makeString(
                          "field Fosters Advanced Artifacts Of Type" ) ), ConsesLow.list( ConsesLow.list( makeString( "localChiefInOrganization" ) ), makeString( "local Chief In Organization" ) ), ConsesLow.list(
                              ConsesLow.list( makeString( "roleWithEventTypeEntailsSomeTimeInTimeIndex" ) ), makeString( "role With Event Type Entails Some Time In Time Index" ) ), ConsesLow.list( ConsesLow.list(
                                  makeString( "occursDuring" ) ), makeString( "occurs During" ) ), ConsesLow.list( ConsesLow.list( makeString( "pathogenTypeCausesInfectionType" ) ), makeString(
                                      "pathogen Type Causes Infection Type" ) ), ConsesLow.list( ConsesLow.list( makeString( "prefixString" ) ), makeString( "prefix String" ) ), ConsesLow.list( ConsesLow.list(
                                          makeString( "covering" ) ), makeString( "covering" ) ), ConsesLow.list( ConsesLow.list( makeString( "microtheoryDesignationArgnum" ) ), makeString(
                                              "microtheory Designation Argnum" ) ), ConsesLow.list( ConsesLow.list( makeString( "otherCommonLanguageHere" ) ), makeString( "other Common Language Here" ) ), ConsesLow.list(
                                                  ConsesLow.list( makeString( "notEquipmentOfUnitType" ) ), makeString( "not Equipment Of Unit Type" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                      "ncRuleConstraint" ) ), makeString( "nc Rule Constraint" ) ), ConsesLow.list( ConsesLow.list( makeString( "holySite" ) ), makeString( "holy Site" ) ), ConsesLow.list(
                                                          ConsesLow.list( makeString( "subcatFrameExample" ) ), makeString( "subcat Frame Example" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                              "musicTypeIsOfGenre" ) ), makeString( "music Type Is Of Genre" ) ), ConsesLow.list( ConsesLow.list( makeString( "containsPrograms" ) ), makeString(
                                                                  "contains Programs" ) ), ConsesLow.list( ConsesLow.list( makeString( "accountName" ) ), makeString( "account Name" ) ), ConsesLow.list( ConsesLow.list(
                                                                      makeString( "networkKnowledgePredicateForCycSecureComponent" ) ), makeString( "network Knowledge Predicate For Cyc Secure Component" ) ), ConsesLow
                                                                          .list( ConsesLow.list( makeString( "commonNickname" ) ), makeString( "common Nickname" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                              "withinRangeOfFire" ) ), makeString( "within Range Of Fire" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                  "controllingSuborganizations" ) ), makeString( "controlling Suborganizations" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                      "constrainsArg" ) ), makeString( "constrains Arg" ) ), ConsesLow.list( ConsesLow.list( makeString( "slotsAdditive" ) ), makeString(
                                                                                          "slots Additive" ) ), ConsesLow.list( ConsesLow.list( makeString( "movesInDirection-Average" ) ), makeString(
                                                                                              "moves In Direction Average" ) ), ConsesLow.list( ConsesLow.list( makeString( "temporallyIntersects-TypeType" ) ), makeString(
                                                                                                  "temporally Intersects Type Type" ) ), ConsesLow.list( ConsesLow.list( makeString( "quantityOrderedQuantityType" ) ),
                                                                                                      makeString( "quantity Ordered Quantity Type" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                                          "countryOfNationality" ) ), makeString( "country Of Nationality" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                                              "assignmentRoughDuration" ) ), makeString( "assignment Rough Duration" ) ), ConsesLow.list( ConsesLow.list(
                                                                                                                  makeString( "sourcesForTopic" ) ), makeString( "sources For Topic" ) ), ConsesLow.list( ConsesLow.list(
                                                                                                                      makeString( "predicatesSBHLPathMarkingFunctionType" ) ), makeString(
                                                                                                                          "predicates SBHL Path Marking Function Type" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                                                              "taskSchedulerTaskTimePattern" ) ), makeString( "task Scheduler Task Time Pattern" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "criterialForTerrainTacticalRole-Negative" ) ), makeString( "criterial For Terrain Tactical Role Negative" ) ), ConsesLow.list( ConsesLow.list( makeString(
          "parserTestTarget" ) ), makeString( "parser Test Target" ) ), ConsesLow.list( ConsesLow.list( makeString( "affixSemantics" ) ), makeString( "affix Semantics" ) ), ConsesLow.list( ConsesLow.list( makeString(
              "contextOfPCW" ) ), makeString( "context Of PCW" ) ), ConsesLow.list( ConsesLow.list( makeString( "faultVulnerability-OS" ) ), makeString( "fault Vulnerability OS" ) ), ConsesLow.list( ConsesLow.list(
                  makeString( "subTopicPrintString" ) ), makeString( "sub Topic Print String" ) ), ConsesLow.list( ConsesLow.list( makeString( "commonLanguage" ) ), makeString( "common Language" ) ), ConsesLow.list(
                      ConsesLow.list( makeString( "divisorTypeForQuantityType" ) ), makeString( "divisor Type For Quantity Type" ) ), ConsesLow.list( ConsesLow.list( makeString( "averagePrecipitation" ) ), makeString(
                          "average Precipitation" ) ), ConsesLow.list( ConsesLow.list( makeString( "predicateSBHLTransfersViaArg" ) ), makeString( "predicate SBHL Transfers Via Arg" ) ), ConsesLow.list( ConsesLow.list(
                              makeString( "taskSchedulerTaskUser" ) ), makeString( "task Scheduler Task User" ) ), ConsesLow.list( ConsesLow.list( makeString( "useFor" ) ), makeString( "use For" ) ), ConsesLow.list(
                                  ConsesLow.list( makeString( "industryFacilities" ) ), makeString( "industry Facilities" ) ), ConsesLow.list( ConsesLow.list( makeString( "predicateSBHLTransfersThroughModule" ) ),
                                      makeString( "predicate SBHL Transfers Through Module" ) ), ConsesLow.list( ConsesLow.list( makeString( "periodOfTimeIntervalSeries" ) ), makeString(
                                          "period Of Time Interval Series" ) ), ConsesLow.list( ConsesLow.list( makeString( "keWeakSuggestion" ) ), makeString( "ke Weak Suggestion" ) ), ConsesLow.list( ConsesLow.list(
                                              makeString( "spatiallyDisjoint" ) ), makeString( "spatially Disjoint" ) ), ConsesLow.list( ConsesLow.list( makeString( "bugzillaBugForProduct" ) ), makeString(
                                                  "bugzilla Bug For Product" ) ), ConsesLow.list( ConsesLow.list( makeString( "taskAdvisor" ) ), makeString( "task Advisor" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                      "bodyPartsUsed-TypeType" ) ), makeString( "body Parts Used Type Type" ) ), ConsesLow.list( ConsesLow.list( makeString( "taskReviewer" ) ), makeString(
                                                          "task Reviewer" ) ), ConsesLow.list( ConsesLow.list( makeString( "cn:IsA" ) ), makeString( "cn: Is A" ) ), ConsesLow.list( ConsesLow.list( makeString( "most" ) ),
                                                              makeString( "most" ) ), ConsesLow.list( ConsesLow.list( makeString( "organizationTypeMembersActiveInField" ) ), makeString(
                                                                  "organization Type Members Active In Field" ) ), ConsesLow.list( ConsesLow.list( makeString( "maximumDepth" ) ), makeString( "maximum Depth" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "ftDeducibleFrom" ) ), makeString( "ft Deducible From" ) ), ConsesLow.list( ConsesLow.list( makeString( "domainKnowledgePredicateForCycSecureComponent" ) ), makeString(
          "domain Knowledge Predicate For Cyc Secure Component" ) ), ConsesLow.list( ConsesLow.list( makeString( "interArgReln3-1" ) ), makeString( "inter Arg Reln 3 1" ) ), ConsesLow.list( ConsesLow.list( makeString(
              "addictedTo" ) ), makeString( "addicted To" ) ), ConsesLow.list( ConsesLow.list( makeString( "provenanceOfMediaSeriesProduct" ) ), makeString( "provenance Of Media Series Product" ) ), ConsesLow.list(
                  ConsesLow.list( makeString( "commonGenlPreds" ) ), makeString( "common Genl Preds" ) ), ConsesLow.list( ConsesLow.list( makeString( "subcatFrameHeadKeyword" ) ), makeString(
                      "subcat Frame Head Keyword" ) ), ConsesLow.list( ConsesLow.list( makeString( "government" ) ), makeString( "government" ) ), ConsesLow.list( ConsesLow.list( makeString( "nativeLanguage" ) ),
                          makeString( "native Language" ) ), ConsesLow.list( ConsesLow.list( makeString( "granuleOfSpatialStuff" ) ), makeString( "granule Of Spatial Stuff" ) ), ConsesLow.list( ConsesLow.list(
                              makeString( "programTypeStrings" ) ), makeString( "program Type Strings" ) ), ConsesLow.list( ConsesLow.list( makeString( "cblRelationshipHasKeyword" ) ), makeString(
                                  "cbl Relationship Has Keyword" ) ), ConsesLow.list( ConsesLow.list( makeString( "subEventTypes" ) ), makeString( "sub Event Types" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                      "requiresOperatingSystem" ) ), makeString( "requires Operating System" ) ), ConsesLow.list( ConsesLow.list( makeString( "bioForProposal-short" ) ), makeString(
                                          "bio For Proposalshort" ) ), ConsesLow.list( ConsesLow.list( makeString( "superlativeDegree" ) ), makeString( "superlative Degree" ) ), ConsesLow.list( ConsesLow.list(
                                              makeString( "geographicalSubRegionsOfBodyOfWater" ) ), makeString( "geographical Sub Regions Of Body Of Water" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                  "lastProperSubEventTypes" ) ), makeString( "last Proper Sub Event Types" ) ), ConsesLow.list( ConsesLow.list( makeString( "testCollectionForKnowledgeSource" ) ),
                                                      makeString( "test Collection For Knowledge Source" ) ), ConsesLow.list( ConsesLow.list( makeString( "roleTypesForEventType" ) ), makeString(
                                                          "role Types For Event Type" ) ), ConsesLow.list( ConsesLow.list( makeString( "facetBasedOnTypeBinaryPredInverse" ) ), makeString(
                                                              "facet Based On Type Binary Pred Inverse" ) ), ConsesLow.list( ConsesLow.list( makeString( "interArgReln1-4" ) ), makeString( "inter Arg Reln 1 4" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "softwareParameterDomain" ) ), makeString( "software Parameter Domain" ) ), ConsesLow.list( ConsesLow.list( makeString( "prototypicalActivityTypeOfPersonType" ) ),
          makeString( "prototypical Activity Type Of Person Type" ) ), ConsesLow.list( ConsesLow.list( makeString( "programFunctionIdentifier" ) ), makeString( "program Function Identifier" ) ), ConsesLow.list( ConsesLow
              .list( makeString( "pnMassNumber" ) ), makeString( "pn Mass Number" ) ), ConsesLow.list( ConsesLow.list( makeString( "authenticationSourceFor" ) ), makeString( "authentication Source For" ) ), ConsesLow
                  .list( ConsesLow.list( makeString( "stringSkipped" ) ), makeString( "string Skipped" ) ), ConsesLow.list( ConsesLow.list( makeString( "programInstalledWithPackage" ) ), makeString(
                      "program Installed With Package" ) ), ConsesLow.list( ConsesLow.list( makeString( "characteristicActivityTypeOfPersonType" ) ), makeString( "characteristic Activity Type Of Person Type" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "biologicalWeaponTypeBasisType" ) ), makeString( "biological Weapon Type Basis Type" ) ), ConsesLow.list( ConsesLow.list( makeString( "owlURI" ) ), makeString(
          "owl URI" ) ), ConsesLow.list( ConsesLow.list( makeString( "immediatePrecursors-Chemical" ) ), makeString( "immediate Precursors Chemical" ) ), ConsesLow.list( ConsesLow.list( makeString(
              "performanceOfWork" ) ), makeString( "performance Of Work" ) ), ConsesLow.list( ConsesLow.list( makeString( "languagePromptForUIA" ) ), makeString( "language Prompt For UIA" ) ), ConsesLow.list( ConsesLow
                  .list( makeString( "issuerOfCW" ) ), makeString( "issuer Of CW" ) ), ConsesLow.list( ConsesLow.list( makeString( "genlWorks" ) ), makeString( "genl Works" ) ), ConsesLow.list( ConsesLow.list(
                      makeString( "subTimeSliceType" ) ), makeString( "sub Time Slice Type" ) ), ConsesLow.list( ConsesLow.list( makeString( "productTypeLicensedForTreatmentOf" ) ), makeString(
                          "product Type Licensed For Treatment Of" ) ), ConsesLow.list( ConsesLow.list( makeString( "dateOfInvention" ) ), makeString( "date Of Invention" ) ), ConsesLow.list( ConsesLow.list( makeString(
                              "agentTypeEmployedByOrgType" ) ), makeString( "agent Type Employed By Org Type" ) ), ConsesLow.list( ConsesLow.list( makeString( "constantCopiedFrom" ) ), makeString(
                                  "constant Copied From" ) ), ConsesLow.list( ConsesLow.list( makeString( "negationQuantities" ) ), makeString( "negation Quantities" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                      "basedInRegion" ) ), makeString( "based In Region" ) ), ConsesLow.list( ConsesLow.list( makeString( "originallyFromRegion" ) ), makeString( "originally From Region" ) ), ConsesLow
                                          .list( ConsesLow.list( makeString( "genlPrograms" ) ), makeString( "genl Programs" ) ), ConsesLow.list( ConsesLow.list( makeString( "averageDischarge" ) ), makeString(
                                              "average Discharge" ) ), ConsesLow.list( ConsesLow.list( makeString( "programCallsProgram" ) ), makeString( "program Calls Program" ) ), ConsesLow.list( ConsesLow.list(
                                                  makeString( "chiefPorts" ) ), makeString( "chief Ports" ) ), ConsesLow.list( ConsesLow.list( makeString( "namedAfter" ) ), makeString( "named After" ) ), ConsesLow.list(
                                                      ConsesLow.list( makeString( "validationRequiredOnTemplatePosition" ) ), makeString( "validation Required On Template Position" ) ), ConsesLow.list( ConsesLow.list(
                                                          makeString( "populationGrowthRate" ) ), makeString( "population Growth Rate" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                              "testCollectionCyclistResponsible" ) ), makeString( "test Collection Cyclist Responsible" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                  "fileConfiguresSoftware" ) ), makeString( "file Configures Software" ) ), ConsesLow.list( ConsesLow.list( makeString( "policyTypeProtectsAgainst" ) ),
                                                                      makeString( "policy Type Protects Against" ) ), ConsesLow.list( ConsesLow.list( makeString( "arityMax" ) ), makeString( "arity Max" ) ), ConsesLow
                                                                          .list( ConsesLow.list( makeString( "characteristicActivityTypeOfPersonType-AtLeastOnce" ) ), makeString(
                                                                              "characteristic Activity Type Of Person Type At Least Once" ) ), ConsesLow.list( ConsesLow.list( makeString( "developedProductType" ) ),
                                                                                  makeString( "developed Product Type" ) ), ConsesLow.list( ConsesLow.list( makeString( "spans-Bridgelike" ) ), makeString(
                                                                                      "spans-Bridgelike" ) ), ConsesLow.list( ConsesLow.list( makeString( "interArgReln3-4" ) ), makeString( "inter Arg Reln 3 4" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "majorReligions" ) ), makeString( "major Religions" ) ), ConsesLow.list( ConsesLow.list( makeString( "candidateProperSubSituationTypes" ) ), makeString(
          "candidate Proper Sub Situation Types" ) ), ConsesLow.list( ConsesLow.list( makeString( "ncRuleTemplate" ) ), makeString( "nc Rule Template" ) ), ConsesLow.list( ConsesLow.list( makeString(
              "templateTypeForFocalTermType" ) ), makeString( "template Type For Focal Term Type" ) ), ConsesLow.list( ConsesLow.list( makeString( "regularDegree" ) ), makeString( "regular Degree" ) ), ConsesLow.list(
                  ConsesLow.list( makeString( "studies" ) ), makeString( "studies" ) ), ConsesLow.list( ConsesLow.list( makeString( "cn:UsedFor" ) ), makeString( "cn: Used For" ) ), ConsesLow.list( ConsesLow.list(
                      makeString( "softwareUpdateDownloadLink" ) ), makeString( "software Update Download Link" ) ), ConsesLow.list( ConsesLow.list( makeString( "unitTypeDimensionalAnalysis" ) ), makeString(
                          "unit Type Dimensional Analysis" ) ), ConsesLow.list( ConsesLow.list( makeString( "schoolSymbolName-Female" ) ), makeString( "school Symbol Name Female" ) ), ConsesLow.list( ConsesLow.list(
                              makeString( "assertMtForFormulaTemplate" ) ), makeString( "assert Mt For Formula Template" ) ), ConsesLow.list( ConsesLow.list( makeString( "queryMtForTopicAssertions" ) ), makeString(
                                  "query Mt For Topic Assertions" ) ), ConsesLow.list( ConsesLow.list( makeString( "symmetricPhysicalPartTypes" ) ), makeString( "symmetric Physical Part Types" ) ), ConsesLow.list(
                                      ConsesLow.list( makeString( "predicatesSBHLPathTerminatingMarkFunction" ) ), makeString( "predicates SBHL Path Terminating Mark Function" ) ), ConsesLow.list( ConsesLow.list(
                                          makeString( "constructionExistentialState" ) ), makeString( "construction Existential State" ) ), ConsesLow.list( ConsesLow.list( makeString( "eventTypeUsesDeviceType" ) ),
                                              makeString( "event Type Uses Device Type" ) ), ConsesLow.list( ConsesLow.list( makeString( "generateArgWithOutsideScope" ) ), makeString(
                                                  "generate Arg With Outside Scope" ) ), ConsesLow.list( ConsesLow.list( makeString( "nounLearnerSenseGloss" ) ), makeString( "noun Learner Sense Gloss" ) ), ConsesLow
                                                      .list( ConsesLow.list( makeString( "vehicleLoadClass" ) ), makeString( "vehicle Load Class" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                          "dataTypeExploitedBy" ) ), makeString( "data Type Exploited By" ) ), ConsesLow.list( ConsesLow.list( makeString( "topicOfDatabase" ) ), makeString(
                                                              "topic Of Database" ) ), ConsesLow.list( ConsesLow.list( makeString( "syntacticNodeCategory" ) ), makeString( "syntactic Node Category" ) ), ConsesLow.list(
                                                                  ConsesLow.list( makeString( "softwareObjectUsesLibrary" ) ), makeString( "software Object Uses Library" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                      "templateTopicGenls" ) ), makeString( "template Topic Genls" ) ), ConsesLow.list( ConsesLow.list( makeString( "typicalArmamentOfUnitType" ) ),
                                                                          makeString( "typical Armament Of Unit Type" ) ), ConsesLow.list( ConsesLow.list( makeString( "greaterThan" ) ), makeString( "greater Than" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "cn:PropertyOf" ) ), makeString( "cn: Property Of" ) ), ConsesLow.list( ConsesLow.list( makeString( "filterCollections" ) ), makeString( "filter Collections" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "hasWhatAsBoundary" ) ), makeString( "has What As Boundary" ) ), ConsesLow.list( ConsesLow.list( makeString( "terrainClimateType" ) ), makeString(
          "terrain Climate Type" ) ), ConsesLow.list( ConsesLow.list( makeString( "softwareParameterHasType" ) ), makeString( "software Parameter Has Type" ) ), ConsesLow.list( ConsesLow.list( makeString(
              "tNTEquivalent-Type" ) ), makeString( "TNT Equivalent Type" ) ), ConsesLow.list( ConsesLow.list( makeString( "unitTypeUsesTacticalObjectType" ) ), makeString( "unit Type Uses Tactical Object Type" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "coaSupportingTask" ) ), makeString( "coa Supporting Task" ) ), ConsesLow.list( ConsesLow.list( makeString( "classificationOfReport" ) ), makeString(
          "classification Of Report" ) ), ConsesLow.list( ConsesLow.list( makeString( "streetOfAddress" ) ), makeString( "street Of Address" ) ), ConsesLow.list( ConsesLow.list( makeString(
              "formulaTemplateTypeHasTopicType" ) ), makeString( "formula Template Type Has Topic Type" ) ), ConsesLow.list( ConsesLow.list( makeString( "webSiteURL" ) ), makeString( "web Site URL" ) ), ConsesLow.list(
                  ConsesLow.list( makeString( "rAMSize" ) ), makeString( "RAM Size" ) ), ConsesLow.list( ConsesLow.list( makeString( "seniorExecutives" ) ), makeString( "senior Executives" ) ), ConsesLow.list( ConsesLow
                      .list( makeString( "tmInverseSymbol" ) ), makeString( "tm Inverse Symbol" ) ), ConsesLow.list( ConsesLow.list( makeString( "majorCityInState" ) ), makeString( "major City In State" ) ), ConsesLow
                          .list( ConsesLow.list( makeString( "derivationalAffixResultPOS" ) ), makeString( "derivational Affix Result POS" ) ), ConsesLow.list( ConsesLow.list( makeString( "employeeStatus" ) ),
                              makeString( "employee Status" ) ), ConsesLow.list( ConsesLow.list( makeString( "denotatumArg" ) ), makeString( "denotatum Arg" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                  "programImplementsProtocol" ) ), makeString( "program Implements Protocol" ) ), ConsesLow.list( ConsesLow.list( makeString( "waterAreaOfRegion" ) ), makeString(
                                      "water Area Of Region" ) ), ConsesLow.list( ConsesLow.list( makeString( "to-Generic" ) ), makeString( "to-Generic" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                          "keStrongSuggestionInverse" ) ), makeString( "ke Strong Suggestion Inverse" ) ), ConsesLow.list( ConsesLow.list( makeString( "durationOfType" ) ), makeString(
                                              "duration Of Type" ) ), ConsesLow.list( ConsesLow.list( makeString( "testDerivedFrom" ) ), makeString( "test Derived From" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                  "infantMortalityRate" ) ), makeString( "infant Mortality Rate" ) ), ConsesLow.list( ConsesLow.list( makeString( "typeLaunchesProjectileType" ) ), makeString(
                                                      "type Launches Projectile Type" ) ), ConsesLow.list( ConsesLow.list( makeString( "nationalBudgetRevenues" ) ), makeString( "national Budget Revenues" ) ), ConsesLow
                                                          .list( ConsesLow.list( makeString( "maxQuantValue" ) ), makeString( "max Quant Value" ) ), ConsesLow.list( ConsesLow.list( makeString( "taxonMembers" ) ),
                                                              makeString( "taxon Members" ) ), ConsesLow.list( ConsesLow.list( makeString( "nationalBudgetExpenditures" ) ), makeString( "national Budget Expenditures" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "predicatesCycLInitializationModule" ) ), makeString( "predicates Cyc L Initialization Module" ) ), ConsesLow.list( ConsesLow.list( makeString(
          "naturalHazardsInRegion" ) ), makeString( "natural Hazards In Region" ) ), ConsesLow.list( ConsesLow.list( makeString( "linked" ) ), makeString( "linked" ) ), ConsesLow.list( ConsesLow.list( makeString(
              "positionInFormulaTemplateIsReplaceable" ) ), makeString( "position In Formula Template Is Replaceable" ) ), ConsesLow.list( ConsesLow.list( makeString( "massNumber" ) ), makeString( "mass Number" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "deviceTypeUsed" ) ), makeString( "device Type Used" ) ), ConsesLow.list( ConsesLow.list( makeString( "riverEndTopography" ) ), makeString( "river End Topography" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "objectHasColor" ) ), makeString( "object Has Color" ) ), ConsesLow.list( ConsesLow.list( makeString( "regularAdverb" ) ), makeString( "regular Adverb" ) ), ConsesLow
          .list( ConsesLow.list( makeString( "conditionAffectsOrgType" ) ), makeString( "condition Affects Org Type" ) ), ConsesLow.list( ConsesLow.list( makeString( "ncRuleTests" ) ), makeString( "nc Rule Tests" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "sentenceDesignationArgnum" ) ), makeString( "sentence Designation Argnum" ) ), ConsesLow.list( ConsesLow.list( makeString( "regulatesObjectType" ) ), makeString(
          "regulates Object Type" ) ), ConsesLow.list( ConsesLow.list( makeString( "considerSpecializing" ) ), makeString( "consider Specializing" ) ), ConsesLow.list( ConsesLow.list( makeString( "genlModFeatures" ) ),
              makeString( "genl Mod Features" ) ), ConsesLow.list( ConsesLow.list( makeString( "fieldsOfCompetence" ) ), makeString( "fields Of Competence" ) ), ConsesLow.list( ConsesLow.list( makeString(
                  "policyTypeCoversTypes" ) ), makeString( "policy Type Covers Types" ) ), ConsesLow.list( ConsesLow.list( makeString( "topicOfClump" ) ), makeString( "topic Of Clump" ) ), ConsesLow.list( ConsesLow.list(
                      makeString( "deviceTypeManipulates" ) ), makeString( "device Type Manipulates" ) ), ConsesLow.list( ConsesLow.list( makeString( "predicateSBHLIndexArg" ) ), makeString(
                          "predicate SBHL Index Arg" ) ), ConsesLow.list( ConsesLow.list( makeString( "subInformation" ) ), makeString( "sub Information" ) ), ConsesLow.list( ConsesLow.list( makeString(
                              "derivedConceptualWork" ) ), makeString( "derived Conceptual Work" ) ), ConsesLow.list( ConsesLow.list( makeString( "tmSuperset" ) ), makeString( "tm Superset" ) ), ConsesLow.list( ConsesLow
                                  .list( makeString( "glfLabelForArcsBasedOnExpandedPred" ) ), makeString( "glf Label For Arcs Based On Expanded Pred" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                      "sourceOfTerm-Person" ) ), makeString( "source Of Term Person" ) ), ConsesLow.list( ConsesLow.list( makeString( "orbits" ) ), makeString( "orbits" ) ), ConsesLow.list( ConsesLow
                                          .list( makeString( "literacyRate" ) ), makeString( "literacy Rate" ) ), ConsesLow.list( ConsesLow.list( makeString( "testTypeFolder" ) ), makeString( "test Type Folder" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "suffixString" ) ), makeString( "suffix String" ) ), ConsesLow.list( ConsesLow.list( makeString( "hasAward" ) ), makeString( "has Award" ) ), ConsesLow.list( ConsesLow
          .list( makeString( "topicOfBeliefSystem" ) ), makeString( "topic Of Belief System" ) ), ConsesLow.list( ConsesLow.list( makeString( "sksPhysicalSchemaDescriptionMt" ) ), makeString(
              "sks Physical Schema Description Mt" ) ), ConsesLow.list( ConsesLow.list( makeString( "programFunctionOperator" ) ), makeString( "program Function Operator" ) ), ConsesLow.list( ConsesLow.list( makeString(
                  "commerciallyUsefulPartTypes" ) ), makeString( "commercially Useful Part Types" ) ), ConsesLow.list( ConsesLow.list( makeString( "perpendicularVectors" ) ), makeString( "perpendicular Vectors" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "sticksInto-2D" ) ), makeString( "sticks Into 2 D" ) ), ConsesLow.list( ConsesLow.list( makeString( "perfect" ) ), makeString( "perfect" ) ), ConsesLow.list( ConsesLow
          .list( makeString( "compassValueOfDirection" ) ), makeString( "compass Value Of Direction" ) ), ConsesLow.list( ConsesLow.list( makeString( "bugCausesBadParaphraseInQueryLibrary" ) ), makeString(
              "bug Causes Bad Paraphrase In Query Library" ) ), ConsesLow.list( ConsesLow.list( makeString( "organismTypeExistentialThreatState" ) ), makeString( "organism Type Existential Threat State" ) ), ConsesLow
                  .list( ConsesLow.list( makeString( "correlatedColor" ) ), makeString( "correlated Color" ) ), ConsesLow.list( ConsesLow.list( makeString( "notablePeaksInThisGroup" ) ), makeString(
                      "notable Peaks In This Group" ) ), ConsesLow.list( ConsesLow.list( makeString( "formOfDisease" ) ), makeString( "form Of Disease" ) ), ConsesLow.list( ConsesLow.list( makeString(
                          "formulaTemplateHasType" ) ), makeString( "formula Template Has Type" ) ), ConsesLow.list( ConsesLow.list( makeString( "startsDuring" ) ), makeString( "starts During" ) ), ConsesLow.list(
                              ConsesLow.list( makeString( "altitudeOfLowestPointIs" ) ), makeString( "altitude Of Lowest Point Is" ) ), ConsesLow.list( ConsesLow.list( makeString( "whereRiverStarts" ) ), makeString(
                                  "where River Starts" ) ), ConsesLow.list( ConsesLow.list( makeString( "maximumDurationOfType" ) ), makeString( "maximum Duration Of Type" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                      "embeddedRegion" ) ), makeString( "embedded Region" ) ), ConsesLow.list( ConsesLow.list( makeString( "controls" ) ), makeString( "controls" ) ), ConsesLow.list( ConsesLow.list(
                                          makeString( "standardEquipmentOfUnitType" ) ), makeString( "standard Equipment Of Unit Type" ) ), ConsesLow.list( ConsesLow.list( makeString( "agentSupportsAgent-Generic" ) ),
                                              makeString( "agent Supports Agent Generic" ) ), ConsesLow.list( ConsesLow.list( makeString( "arg5Format" ) ), makeString( "arg 5 Format" ) ), ConsesLow.list( ConsesLow.list(
                                                  makeString( "subIndustryTypes" ) ), makeString( "sub Industry Types" ) ), ConsesLow.list( ConsesLow.list( makeString( "schoolTypeAttended" ) ), makeString(
                                                      "school Type Attended" ) ), ConsesLow.list( ConsesLow.list( makeString( "hasPortalToRegion" ) ), makeString( "has Portal To Region" ) ), ConsesLow.list( ConsesLow
                                                          .list( makeString( "predicatesSBHLPathUnmarkingFunctionType" ) ), makeString( "predicates SBHL Path Unmarking Function Type" ) ), ConsesLow.list( ConsesLow.list(
                                                              makeString( "sksSourceDescriptionMt" ) ), makeString( "sks Source Description Mt" ) ), ConsesLow.list( ConsesLow.list( makeString( "servesCuisine" ) ),
                                                                  makeString( "serves Cuisine" ) ), ConsesLow.list( ConsesLow.list( makeString( "arg5Genl" ) ), makeString( "arg 5 Genl" ) ), ConsesLow.list( ConsesLow
                                                                      .list( makeString( "keyParticipants" ) ), makeString( "key Participants" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                          "purposeOf-EventTypeSitType" ) ), makeString( "purpose Of Event Type Sit Type" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                              "hasHeadquartersInCountry" ) ), makeString( "has Headquarters In Country" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                  "localEMailAddressText" ) ), makeString( "local E Mail Address Text" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                      "oppositeCollections" ) ), makeString( "opposite Collections" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                          "semTransPredForPOS" ) ), makeString( "sem Trans Pred For POS" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                              "projectSource-FactEntry" ) ), makeString( "project Source Fact Entry" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                                  "typeMeasuresQuantity" ) ), makeString( "type Measures Quantity" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                                      "intersectionType" ) ), makeString( "intersection Type" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                                          "arityMin" ) ), makeString( "arity Min" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                                              "facetBasedOnBinaryPred" ) ), makeString( "facet Based On Binary Pred" ) ), ConsesLow.list( ConsesLow.list(
                                                                                                                  makeString( "computerIP" ) ), makeString( "computer IP" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                                                      "hasZodiacSign" ) ), makeString( "has Zodiac Sign" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                                                          "linkInSystem" ) ), makeString( "link In System" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                                                              "strictlyFunctionalInArgs" ) ), makeString( "strictly Functional In Args" ) ), ConsesLow.list(
                                                                                                                                  ConsesLow.list( makeString( "hasPersonality" ) ), makeString( "has Personality" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "htmlTagSymbol" ) ), makeString( "html Tag Symbol" ) ), ConsesLow.list( ConsesLow.list( makeString( "bugzillaBugReportReporter" ) ), makeString(
          "bugzilla Bug Report Reporter" ) ), ConsesLow.list( ConsesLow.list( makeString( "bugBlocksQuery" ) ), makeString( "bug Blocks Query" ) ), ConsesLow.list( ConsesLow.list( makeString( "adjectiveOfCountry" ) ),
              makeString( "adjective Of Country" ) ), ConsesLow.list( ConsesLow.list( makeString( "uniqueIDForType" ) ), makeString( "unique ID For Type" ) ), ConsesLow.list( ConsesLow.list( makeString(
                  "educationLevel" ) ), makeString( "education Level" ) ), ConsesLow.list( ConsesLow.list( makeString( "cityInState" ) ), makeString( "city In State" ) ), ConsesLow.list( ConsesLow.list( makeString(
                      "bugCausesSpuriousProof" ) ), makeString( "bug Causes Spurious Proof" ) ), ConsesLow.list( ConsesLow.list( makeString( "ftDeducibleFrom-Dual" ) ), makeString( "ft Deducible From Dual" ) ), ConsesLow
                          .list( ConsesLow.list( makeString( "excludeReplacementOptionForFormulaTemplate" ) ), makeString( "exclude Replacement Option For Formula Template" ) ), ConsesLow.list( ConsesLow.list(
                              makeString( "typicalColorOfType" ) ), makeString( "typical Color Of Type" ) ), ConsesLow.list( ConsesLow.list( makeString( "predicatesPropertyTypeOfArg1" ) ), makeString(
                                  "predicates Property Type Of Arg 1" ) ), ConsesLow.list( ConsesLow.list( makeString( "terrainType" ) ), makeString( "terrain Type" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                      "properPhysicalPartTypes" ) ), makeString( "proper Physical Part Types" ) ), ConsesLow.list( ConsesLow.list( makeString( "taskTypeRequiresResourceType" ) ), makeString(
                                          "task Type Requires Resource Type" ) ), ConsesLow.list( ConsesLow.list( makeString( "vaccineEffectiveAgainstMicroorgType" ) ), makeString(
                                              "vaccine Effective Against Microorg Type" ) ), ConsesLow.list( ConsesLow.list( makeString( "areaThisLanguageNativeTo" ) ), makeString( "area This Language Native To" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "hasOffice" ) ), makeString( "has Office" ) ), ConsesLow.list( ConsesLow.list( makeString( "dialects" ) ), makeString( "dialects" ) ), ConsesLow.list( ConsesLow.list(
          makeString( "elInverse" ) ), makeString( "el Inverse" ) ), ConsesLow.list( ConsesLow.list( makeString( "nodeInSystem" ) ), makeString( "node In System" ) ), ConsesLow.list( ConsesLow.list( makeString(
              "performedByPart" ) ), makeString( "performed By Part" ) ), ConsesLow.list( ConsesLow.list( makeString( "pastTense-Universal" ) ), makeString( "past Tense Universal" ) ), ConsesLow.list( ConsesLow.list(
                  makeString( "preconditionFor-Events" ) ), makeString( "precondition For Events" ) ), ConsesLow.list( ConsesLow.list( makeString( "deviceTypesCommonlyUsedTogether" ) ), makeString(
                      "device Types Commonly Used Together" ) ), ConsesLow.list( ConsesLow.list( makeString( "agentTypePerformsWorkOfType" ) ), makeString( "agent Type Performs Work Of Type" ) ), ConsesLow.list(
                          ConsesLow.list( makeString( "runsUnderOS" ) ), makeString( "runs Under OS" ) ), ConsesLow.list( ConsesLow.list( makeString( "locatedAtPoint-SurfaceGeographical" ) ), makeString(
                              "located At Point Surface Geographical" ) ), ConsesLow.list( ConsesLow.list( makeString( "populationOfRegion" ) ), makeString( "population Of Region" ) ), ConsesLow.list( ConsesLow.list(
                                  makeString( "cn:ThematicKLine" ) ), makeString( "cn: Thematic K Line" ) ), ConsesLow.list( ConsesLow.list( makeString( "standardVehicleOfUnitType" ) ), makeString(
                                      "standard Vehicle Of Unit Type" ) ), ConsesLow.list( ConsesLow.list( makeString( "genlKBContentTests" ) ), makeString( "genl KB Content Tests" ) ), ConsesLow.list( ConsesLow.list(
                                          makeString( "basicSpeechPartPred" ) ), makeString( "basic Speech Part Pred" ) ), ConsesLow.list( ConsesLow.list( makeString( "industryProducesType" ) ), makeString(
                                              "industry Produces Type" ) ), ConsesLow.list( ConsesLow.list( makeString( "hasRightsOver" ) ), makeString( "has Rights Over" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                  "typeUsedWithCycModule" ) ), makeString( "type Used With Cyc Module" ) ), ConsesLow.list( ConsesLow.list( makeString( "tmSymbol" ) ), makeString( "tm Symbol" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "headOfStateOf" ) ), makeString( "head Of State Of" ) ), ConsesLow.list( ConsesLow.list( makeString( "postEvents" ) ), makeString( "post Events" ) ), ConsesLow.list(
          ConsesLow.list( makeString( "causes-SitTypeSitType" ) ), makeString( "causes Sit Type Sit Type" ) ), ConsesLow.list( ConsesLow.list( makeString( "focalTermIntroduction" ) ), makeString(
              "focal Term Introduction" ) ), ConsesLow.list( ConsesLow.list( makeString( "titleOfPerson-String" ) ), makeString( "title Of Person String" ) ), ConsesLow.list( ConsesLow.list( makeString(
                  "stufflikeWRTPred" ) ), makeString( "stufflike WRT Pred" ) ), ConsesLow.list( ConsesLow.list( makeString( "requestingAgent" ) ), makeString( "requesting Agent" ) ), ConsesLow.list( ConsesLow.list(
                      makeString( "templateReplacementsInvisibleForPosition" ) ), makeString( "template Replacements Invisible For Position" ) ), ConsesLow.list( ConsesLow.list( makeString( "properSubEvents" ) ),
                          makeString( "proper Sub Events" ) ), ConsesLow.list( ConsesLow.list( makeString( "temporallyIntrinsicArg" ) ), makeString( "temporally Intrinsic Arg" ) ), ConsesLow.list( ConsesLow.list(
                              makeString( "stringLength" ) ), makeString( "string Length" ) ), ConsesLow.list( ConsesLow.list( makeString( "orgTypeFacilityType" ) ), makeString( "org Type Facility Type" ) ), ConsesLow
                                  .list( ConsesLow.list( makeString( "personHairColor" ) ), makeString( "person Hair Color" ) ), ConsesLow.list( ConsesLow.list( makeString( "nationalLanguage" ) ), makeString(
                                      "national Language" ) ), ConsesLow.list( ConsesLow.list( makeString( "reflexiveOn" ) ), makeString( "reflexive On" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                          "cityOfAddress" ) ), makeString( "city Of Address" ) ), ConsesLow.list( ConsesLow.list( makeString( "preferredNameString" ) ), makeString( "preferred Name String" ) ), ConsesLow
                                              .list( ConsesLow.list( makeString( "nextHigherOrder" ) ), makeString( "next Higher Order" ) ), ConsesLow.list( ConsesLow.list( makeString( "posOfPhraseType" ) ), makeString(
                                                  "pos Of Phrase Type" ) ), ConsesLow.list( ConsesLow.list( makeString( "primaryActivityTypeOfLocation" ) ), makeString( "primary Activity Type Of Location" ) ), ConsesLow
                                                      .list( ConsesLow.list( makeString( "arg4Format" ) ), makeString( "arg 4 Format" ) ), ConsesLow.list( ConsesLow.list( makeString( "whereRiverEnds" ) ), makeString(
                                                          "where River Ends" ) ), ConsesLow.list( ConsesLow.list( makeString( "inhabitantTypes" ) ), makeString( "inhabitant Types" ) ), ConsesLow.list( ConsesLow.list(
                                                              makeString( "plural" ) ), makeString( "plural" ) ), ConsesLow.list( ConsesLow.list( makeString( "interArgReln2-1" ) ), makeString( "inter Arg Reln 2 1" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "officeInCountry" ) ), makeString( "office In Country" ) ), ConsesLow.list( ConsesLow.list( makeString( "posForTemplateCategory" ) ), makeString(
          "pos For Template Category" ) ), ConsesLow.list( ConsesLow.list( makeString( "salientURL" ) ), makeString( "salient URL" ) ), ConsesLow.list( ConsesLow.list( makeString( "predicatesCycLModuleType" ) ),
              makeString( "predicates Cyc L Module Type" ) ), ConsesLow.list( ConsesLow.list( makeString( "suffrageAge" ) ), makeString( "suffrage Age" ) ), ConsesLow.list( ConsesLow.list( makeString( "reportTime" ) ),
                  makeString( "report Time" ) ), ConsesLow.list( ConsesLow.list( makeString( "subTopicOrderedQueryWords" ) ), makeString( "sub Topic Ordered Query Words" ) ), ConsesLow.list( ConsesLow.list( makeString(
                      "computerSpeed" ) ), makeString( "computer Speed" ) ), ConsesLow.list( ConsesLow.list( makeString( "foundingDate" ) ), makeString( "founding Date" ) ), ConsesLow.list( ConsesLow.list( makeString(
                          "taskSchedulerTaskExpression" ) ), makeString( "task Scheduler Task Expression" ) ), ConsesLow.list( ConsesLow.list( makeString( "regionalTelephoneAreaCode" ) ), makeString(
                              "regional Telephone Area Code" ) ), ConsesLow.list( ConsesLow.list( makeString( "subTopicQueryRestrictClause" ) ), makeString( "sub Topic Query Restrict Clause" ) ), ConsesLow.list(
                                  ConsesLow.list( makeString( "hobbyCWPerformedBy" ) ), makeString( "hobby CW Performed By" ) ), ConsesLow.list( ConsesLow.list( makeString( "dateOfPublication-CW" ) ), makeString(
                                      "date Of Publication CW" ) ), ConsesLow.list( ConsesLow.list( makeString( "sksLogicalSchemaDescriptionMt" ) ), makeString( "sks Logical Schema Description Mt" ) ), ConsesLow.list(
                                          ConsesLow.list( makeString( "roomFaces" ) ), makeString( "room Faces" ) ), ConsesLow.list( ConsesLow.list( makeString( "hasStatusWithOrganization" ) ), makeString(
                                              "has Status With Organization" ) ), ConsesLow.list( ConsesLow.list( makeString( "placeJoinedJihad" ) ), makeString( "place Joined Jihad" ) ), ConsesLow.list( ConsesLow.list(
                                                  makeString( "programAuthor" ) ), makeString( "program Author" ) ), ConsesLow.list( ConsesLow.list( makeString( "typicalLocationOfType" ) ), makeString(
                                                      "typical Location Of Type" ) ), ConsesLow.list( ConsesLow.list( makeString( "from-Generic" ) ), makeString( "from-Generic" ) ), ConsesLow.list( ConsesLow.list(
                                                          makeString( "standardUnit" ) ), makeString( "standard Unit" ) ), ConsesLow.list( ConsesLow.list( makeString( "keGenlsInducedStrongSuggestionPreds" ) ),
                                                              makeString( "ke Genls Induced Strong Suggestion Preds" ) ), ConsesLow.list( ConsesLow.list( makeString( "predicatesCycLGraphType" ) ), makeString(
                                                                  "predicates Cyc L Graph Type" ) ), ConsesLow.list( ConsesLow.list( makeString( "taskTypeUsesTacticalObjectType" ) ), makeString(
                                                                      "task Type Uses Tactical Object Type" ) ), ConsesLow.list( ConsesLow.list( makeString( "negativeVestedInterest" ) ), makeString(
                                                                          "negative Vested Interest" ) ), ConsesLow.list( ConsesLow.list( makeString( "requiredActorSlots" ) ), makeString( "required Actor Slots" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "parasiteCausesAilmentCondition" ) ), makeString( "parasite Causes Ailment Condition" ) ), ConsesLow.list( ConsesLow.list( makeString( "closedUnder" ) ), makeString(
          "closed Under" ) ), ConsesLow.list( ConsesLow.list( makeString( "incorporatedIn" ) ), makeString( "incorporated In" ) ), ConsesLow.list( ConsesLow.list( makeString( "placeOfDeath" ) ), makeString(
              "place Of Death" ) ), ConsesLow.list( ConsesLow.list( makeString( "orderOfCollection" ) ), makeString( "order Of Collection" ) ), ConsesLow.list( ConsesLow.list( makeString( "accountLoggedInOn" ) ),
                  makeString( "account Logged In On" ) ), ConsesLow.list( ConsesLow.list( makeString( "holdsIn" ) ), makeString( "holds In" ) ), ConsesLow.list( ConsesLow.list( makeString(
                      "holidayCelebratedInPolity" ) ), makeString( "holiday Celebrated In Polity" ) ), ConsesLow.list( ConsesLow.list( makeString( "keStrongSuggestionPreds" ) ), makeString(
                          "ke Strong Suggestion Preds" ) ), ConsesLow.list( ConsesLow.list( makeString( "containsModules" ) ), makeString( "contains Modules" ) ), ConsesLow.list( ConsesLow.list( makeString(
                              "targetPosture" ) ), makeString( "target Posture" ) ), ConsesLow.list( ConsesLow.list( makeString( "spatiallyIntersects" ) ), makeString( "spatially Intersects" ) ), ConsesLow.list(
                                  ConsesLow.list( makeString( "interArgReln2-3" ) ), makeString( "inter Arg Reln 2 3" ) ), ConsesLow.list( ConsesLow.list( makeString( "totalMerchantMarine-Mass" ) ), makeString(
                                      "total Merchant Marine Mass" ) ), ConsesLow.list( ConsesLow.list( makeString( "regionLacksTransportMeans" ) ), makeString( "region Lacks Transport Means" ) ), ConsesLow.list(
                                          ConsesLow.list( makeString( "taskUsesContributionsOf" ) ), makeString( "task Uses Contributions Of" ) ), ConsesLow.list( ConsesLow.list( makeString( "holdsSometimeDuring" ) ),
                                              makeString( "holds Sometime During" ) ), ConsesLow.list( ConsesLow.list( makeString( "affiliatedOrganizations" ) ), makeString( "affiliated Organizations" ) ), ConsesLow
                                                  .list( ConsesLow.list( makeString( "succeedingIntervalType" ) ), makeString( "succeeding Interval Type" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                      "quantitySubsumes" ) ), makeString( "quantity Subsumes" ) ), ConsesLow.list( ConsesLow.list( makeString( "glfNodeSemantics-Underspecified" ) ), makeString(
                                                          "glf Node Semantics Underspecified" ) ), ConsesLow.list( ConsesLow.list( makeString( "wornWithGarmentType" ) ), makeString( "worn With Garment Type" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "presentInRegion" ) ), makeString( "present In Region" ) ), ConsesLow.list( ConsesLow.list( makeString( "participantIn" ) ), makeString( "participant In" ) ), ConsesLow
          .list( ConsesLow.list( makeString( "gunTakesAmmunition" ) ), makeString( "gun Takes Ammunition" ) ), ConsesLow.list( ConsesLow.list( makeString( "multiplierTypeForQuantityType" ) ), makeString(
              "multiplier Type For Quantity Type" ) ), ConsesLow.list( ConsesLow.list( makeString( "posPredForTemplateCategory" ) ), makeString( "pos Pred For Template Category" ) ), ConsesLow.list( ConsesLow.list(
                  makeString( "styleOfMusicPerformer" ) ), makeString( "style Of Music Performer" ) ), ConsesLow.list( ConsesLow.list( makeString( "capitalCity" ) ), makeString( "capital City" ) ), ConsesLow.list(
                      ConsesLow.list( makeString( "taskTypeCommensurateWithOpType" ) ), makeString( "task Type Commensurate With Op Type" ) ), ConsesLow.list( ConsesLow.list( makeString( "chemicalCASRegistry" ) ),
                          makeString( "chemical CAS Registry" ) ), ConsesLow.list( ConsesLow.list( makeString( "typeAssociatedPaymentPlan" ) ), makeString( "type Associated Payment Plan" ) ), ConsesLow.list( ConsesLow
                              .list( makeString( "colorHasBrightness" ) ), makeString( "color Has Brightness" ) ), ConsesLow.list( ConsesLow.list( makeString( "urgeTypeSatisfied" ) ), makeString(
                                  "urge Type Satisfied" ) ), ConsesLow.list( ConsesLow.list( makeString( "partitionedIntoSpecPreds" ) ), makeString( "partitioned Into Spec Preds" ) ), ConsesLow.list( ConsesLow.list(
                                      makeString( "typeIngredientTypes" ) ), makeString( "type Ingredient Types" ) ), ConsesLow.list( ConsesLow.list( makeString( "singular" ) ), makeString( "singular" ) ), ConsesLow
                                          .list( ConsesLow.list( makeString( "movieActors" ) ), makeString( "movie Actors" ) ), ConsesLow.list( ConsesLow.list( makeString( "physicalExtent" ) ), makeString(
                                              "physical Extent" ) ), ConsesLow.list( ConsesLow.list( makeString( "versionOfProductBrand" ) ), makeString( "version Of Product Brand" ) ), ConsesLow.list( ConsesLow.list(
                                                  makeString( "ageOfAgentWhenJoinedJihad" ) ), makeString( "age Of Agent When Joined Jihad" ) ), ConsesLow.list( ConsesLow.list( makeString( "insMarketedAs" ) ),
                                                      makeString( "ins Marketed As" ) ), ConsesLow.list( ConsesLow.list( makeString( "contemporaryInArg" ) ), makeString( "contemporary In Arg" ) ), ConsesLow.list(
                                                          ConsesLow.list( makeString( "predominantLanguage" ) ), makeString( "predominant Language" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                              "faultVulnerability-Installed" ) ), makeString( "fault Vulnerability Installed" ) ), ConsesLow.list( ConsesLow.list( makeString( "soleMakerOfProductType" ) ),
                                                                  makeString( "sole Maker Of Product Type" ) ), ConsesLow.list( ConsesLow.list( makeString( "orthography" ) ), makeString( "orthography" ) ), ConsesLow
                                                                      .list( ConsesLow.list( makeString( "inheritAllRolePlayers-SitTypeToSubSitType" ) ), makeString(
                                                                          "inherit All Role Players Sit Type To Sub Sit Type" ) ), ConsesLow.list( ConsesLow.list( makeString( "significantEventAcquaintance" ) ),
                                                                              makeString( "significant Event Acquaintance" ) ), ConsesLow.list( ConsesLow.list( makeString( "pennTagForPred" ) ), makeString(
                                                                                  "penn Tag For Pred" ) ), ConsesLow.list( ConsesLow.list( makeString( "subWorks" ) ), makeString( "sub Works" ) ), ConsesLow.list(
                                                                                      ConsesLow.list( makeString( "programRunningOn" ) ), makeString( "program Running On" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                          "ksTermString" ) ), makeString( "ks Term String" ) ), ConsesLow.list( ConsesLow.list( makeString( "arg4Genl" ) ), makeString(
                                                                                              "arg 4 Genl" ) ), ConsesLow.list( ConsesLow.list( makeString( "fieldsOfFormalEducation" ) ), makeString(
                                                                                                  "fields Of Formal Education" ) ), ConsesLow.list( ConsesLow.list( makeString( "permanentlyNorthwestOf" ) ), makeString(
                                                                                                      "permanently Northwest Of" ) ), ConsesLow.list( ConsesLow.list( makeString( "frequentlyInContactWith" ) ), makeString(
                                                                                                          "frequently In Contact With" ) ), ConsesLow.list( ConsesLow.list( makeString( "minorLeagueAffiliates" ) ),
                                                                                                              makeString( "minor League Affiliates" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                                                  "testQuerySpecification" ) ), makeString( "test Query Specification" ) ), ConsesLow.list( ConsesLow.list(
                                                                                                                      makeString( "parameterOfProgram" ) ), makeString( "parameter Of Program" ) ), ConsesLow.list(
                                                                                                                          ConsesLow.list( makeString( "countryOfCity" ) ), makeString( "country Of City" ) ), ConsesLow
                                                                                                                              .list( ConsesLow.list( makeString( "informationOrigin" ) ), makeString(
                                                                                                                                  "information Origin" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                                                                      "programFoundOnComputer" ) ), makeString( "program Found On Computer" ) ), ConsesLow
                                                                                                                                          .list( ConsesLow.list( makeString( "eatsWillingly" ) ), makeString(
                                                                                                                                              "eats Willingly" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                                                                                  "meansOfDeployingAgent-BCW" ) ), makeString(
                                                                                                                                                      "means Of Deploying Agent BCW" ) ), ConsesLow.list( ConsesLow.list(
                                                                                                                                                          makeString( "exploitTargetsProgram" ) ), makeString(
                                                                                                                                                              "exploit Targets Program" ) ), ConsesLow.list( ConsesLow.list(
                                                                                                                                                                  makeString(
                                                                                                                                                                      "characteristicActivityTypeOfOrganizationType" ) ),
                                                                                                                                                                  makeString(
                                                                                                                                                                      "characteristic Activity Type Of Organization Type" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "typeGenls" ) ), makeString( "type Genls" ) ), ConsesLow.list( ConsesLow.list( makeString( "ethnicity" ) ), makeString( "ethnicity" ) ), ConsesLow.list( ConsesLow.list(
          makeString( "arg2NotIsa" ) ), makeString( "arg 2 Not Isa" ) ), ConsesLow.list( ConsesLow.list( makeString( "episodeType" ) ), makeString( "episode Type" ) ), ConsesLow.list( ConsesLow.list( makeString(
              "followingValue" ) ), makeString( "following Value" ) ), ConsesLow.list( ConsesLow.list( makeString( "variantOfSuffix" ) ), makeString( "variant Of Suffix" ) ), ConsesLow.list( ConsesLow.list( makeString(
                  "formsBorderPart" ) ), makeString( "forms Border Part" ) ), ConsesLow.list( ConsesLow.list( makeString( "permanentlyEastOf" ) ), makeString( "permanently East Of" ) ), ConsesLow.list( ConsesLow.list(
                      makeString( "testMetricsToGather" ) ), makeString( "test Metrics To Gather" ) ), ConsesLow.list( ConsesLow.list( makeString( "speechPartPreds" ) ), makeString( "speech Part Preds" ) ), ConsesLow
                          .list( ConsesLow.list( makeString( "keWeakSuggestionPreds" ) ), makeString( "ke Weak Suggestion Preds" ) ), ConsesLow.list( ConsesLow.list( makeString( "spatiallyIntrinsicArg" ) ), makeString(
                              "spatially Intrinsic Arg" ) ), ConsesLow.list( ConsesLow.list( makeString( "requiredArg1Pred" ) ), makeString( "required Arg 1 Pred" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                  "highestEducationLevel" ) ), makeString( "highest Education Level" ) ), ConsesLow.list( ConsesLow.list( makeString( "occupation" ) ), makeString( "occupation" ) ), ConsesLow.list(
                                      ConsesLow.list( makeString( "expansion" ) ), makeString( "expansion" ) ), ConsesLow.list( ConsesLow.list( makeString( "agentStaysViableAfterDeployment-BCW" ) ), makeString(
                                          "agent Stays Viable After Deployment BCW" ) ), ConsesLow.list( ConsesLow.list( makeString( "pathogenWithRespectTo" ) ), makeString( "pathogen With Respect To" ) ), ConsesLow
                                              .list( ConsesLow.list( makeString( "facetBasedOnTypeBinaryPred" ) ), makeString( "facet Based On Type Binary Pred" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                  "symmetricOn" ) ), makeString( "symmetric On" ) ), ConsesLow.list( ConsesLow.list( makeString( "dateLeftJihad" ) ), makeString( "date Left Jihad" ) ), ConsesLow.list(
                                                      ConsesLow.list( makeString( "stateOfCounty" ) ), makeString( "state Of County" ) ), ConsesLow.list( ConsesLow.list( makeString( "agentTypeSellsProductType" ) ),
                                                          makeString( "agent Type Sells Product Type" ) ), ConsesLow.list( ConsesLow.list( makeString( "faultVulnerability-Running" ) ), makeString(
                                                              "fault Vulnerability Running" ) ), ConsesLow.list( ConsesLow.list( makeString( "temporallySubsumes-TypeType" ) ), makeString(
                                                                  "temporally Subsumes Type Type" ) ), ConsesLow.list( ConsesLow.list( makeString( "properSubSituationTypes" ) ), makeString(
                                                                      "proper Sub Situation Types" ) ), ConsesLow.list( ConsesLow.list( makeString( "intendedTargetTypeOfWeaponType" ) ), makeString(
                                                                          "intended Target Type Of Weapon Type" ) ), ConsesLow.list( ConsesLow.list( makeString( "lastProperSubSituationTypes" ) ), makeString(
                                                                              "last Proper Sub Situation Types" ) ), ConsesLow.list( ConsesLow.list( makeString( "homepage" ) ), makeString( "homepage" ) ), ConsesLow.list(
                                                                                  ConsesLow.list( makeString( "pathogenSoleCauseOfInfectionType" ) ), makeString( "pathogen Sole Cause Of Infection Type" ) ), ConsesLow
                                                                                      .list( ConsesLow.list( makeString( "bordersOn" ) ), makeString( "borders On" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                          "activeIngredientsOfType" ) ), makeString( "active Ingredients Of Type" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                              "commonFoodTypeOfCuisine" ) ), makeString( "common Food Type Of Cuisine" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                                  "interArgReln1-2" ) ), makeString( "inter Arg Reln 1 2" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                                      "eventTypeDurationOfEffects" ) ), makeString( "event Type Duration Of Effects" ) ), ConsesLow.list( ConsesLow.list(
                                                                                                          makeString( "nameString-NC" ) ), makeString( "name String NC" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                                              "correspondingMilitaryTaskType" ) ), makeString( "corresponding Military Task Type" ) ), ConsesLow.list(
                                                                                                                  ConsesLow.list( makeString( "containsInformationAbout-Focally" ) ), makeString(
                                                                                                                      "contains Information About Focally" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                                                          "protectsAgainstType" ) ), makeString( "protects Against Type" ) ), ConsesLow.list( ConsesLow
                                                                                                                              .list( makeString( "geopoliticalSubdivision" ) ), makeString( "geopolitical Subdivision" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "domainExamplePredSentences" ) ), makeString( "domain Example Pred Sentences" ) ), ConsesLow.list( ConsesLow.list( makeString( "preferredEMailAddressText" ) ),
          makeString( "preferred E Mail Address Text" ) ), ConsesLow.list( ConsesLow.list( makeString( "subjectOfReport-Prop" ) ), makeString( "subject Of Report Prop" ) ), ConsesLow.list( ConsesLow.list( makeString(
              "keRequirementPreds" ) ), makeString( "ke Requirement Preds" ) ), ConsesLow.list( ConsesLow.list( makeString( "uniquePhysicalPartTypes" ) ), makeString( "unique Physical Part Types" ) ), ConsesLow.list(
                  ConsesLow.list( makeString( "placeInCity" ) ), makeString( "place In City" ) ), ConsesLow.list( ConsesLow.list( makeString( "temporallyDisjointActionTypes" ) ), makeString(
                      "temporally Disjoint Action Types" ) ), ConsesLow.list( ConsesLow.list( makeString( "indicatedDrug" ) ), makeString( "indicated Drug" ) ), ConsesLow.list( ConsesLow.list( makeString( "alias" ) ),
                          makeString( "alias" ) ), ConsesLow.list( ConsesLow.list( makeString( "centralReferencePoint" ) ), makeString( "central Reference Point" ) ), ConsesLow.list( ConsesLow.list( makeString(
                              "agentive-Sg" ) ), makeString( "agentive-Sg" ) ), ConsesLow.list( ConsesLow.list( makeString( "partitionedInto" ) ), makeString( "partitioned Into" ) ), ConsesLow.list( ConsesLow.list(
                                  makeString( "urlOfCW" ) ), makeString( "url Of CW" ) ), ConsesLow.list( ConsesLow.list( makeString( "socialClass" ) ), makeString( "social Class" ) ), ConsesLow.list( ConsesLow.list(
                                      makeString( "languageSpoken" ) ), makeString( "language Spoken" ) ), ConsesLow.list( ConsesLow.list( makeString( "faultVulnerability-Remote" ) ), makeString(
                                          "fault Vulnerability Remote" ) ), ConsesLow.list( ConsesLow.list( makeString( "totalMerchantMarine-Volume" ) ), makeString( "total Merchant Marine Volume" ) ), ConsesLow.list(
                                              ConsesLow.list( makeString( "permanentlyNortheastOf" ) ), makeString( "permanently Northeast Of" ) ), ConsesLow.list( ConsesLow.list( makeString( "subLSymbolForModule" ) ),
                                                  makeString( "sub L Symbol For Module" ) ), ConsesLow.list( ConsesLow.list( makeString( "arg5Isa" ) ), makeString( "arg 5 Isa" ) ), ConsesLow.list( ConsesLow.list(
                                                      makeString( "dateOfDeathEvent" ) ), makeString( "date Of Death Event" ) ), ConsesLow.list( ConsesLow.list( makeString( "altitudeOfHighestPointIs" ) ), makeString(
                                                          "altitude Of Highest Point Is" ) ), ConsesLow.list( ConsesLow.list( makeString( "eventTypeCausedDeathOf" ) ), makeString( "event Type Caused Death Of" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "territoriesControlled" ) ), makeString( "territories Controlled" ) ), ConsesLow.list( ConsesLow.list( makeString( "possessiveRelation" ) ), makeString(
          "possessive Relation" ) ), ConsesLow.list( ConsesLow.list( makeString( "colorHasRGBRedValue" ) ), makeString( "color Has RGB Red Value" ) ), ConsesLow.list( ConsesLow.list( makeString( "keStrongSuggestion" ) ),
              makeString( "ke Strong Suggestion" ) ), ConsesLow.list( ConsesLow.list( makeString( "characteristicActivityTypeOfPersonType-Frequently" ) ), makeString(
                  "characteristic Activity Type Of Person Type Frequently" ) ), ConsesLow.list( ConsesLow.list( makeString( "architecturalStyle" ) ), makeString( "architectural Style" ) ), ConsesLow.list( ConsesLow.list(
                      makeString( "sharedNotes" ) ), makeString( "shared Notes" ) ), ConsesLow.list( ConsesLow.list( makeString( "frequentPrototypicalActivityTypeOfPersonType" ) ), makeString(
                          "frequent Prototypical Activity Type Of Person Type" ) ), ConsesLow.list( ConsesLow.list( makeString( "ableToControl" ) ), makeString( "able To Control" ) ), ConsesLow.list( ConsesLow.list(
                              makeString( "colorHasRGBBlueValue" ) ), makeString( "color Has RGB Blue Value" ) ), ConsesLow.list( ConsesLow.list( makeString( "distributionMedium" ) ), makeString(
                                  "distribution Medium" ) ), ConsesLow.list( ConsesLow.list( makeString( "subOrgs-Command" ) ), makeString( "sub Orgs Command" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                      "culturalRegionOfOrigin" ) ), makeString( "cultural Region Of Origin" ) ), ConsesLow.list( ConsesLow.list( makeString( "qaWebString" ) ), makeString( "qa Web String" ) ), ConsesLow
                                          .list( ConsesLow.list( makeString( "arg4Isa" ) ), makeString( "arg 4 Isa" ) ), ConsesLow.list( ConsesLow.list( makeString( "programStrings" ) ), makeString(
                                              "program Strings" ) ), ConsesLow.list( ConsesLow.list( makeString( "colorHasRGBGreenValue" ) ), makeString( "color Has RGB Green Value" ) ), ConsesLow.list( ConsesLow.list(
                                                  makeString( "exampleNATs" ) ), makeString( "example NATs" ) ), ConsesLow.list( ConsesLow.list( makeString( "ethnicGroupsHere" ) ), makeString( "ethnic Groups Here" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "unitDefinition" ) ), makeString( "unit Definition" ) ), ConsesLow.list( ConsesLow.list( makeString( "interArgReln1-3" ) ), makeString( "inter Arg Reln 1 3" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "actionTypeExpressesFeelingType" ) ), makeString( "action Type Expresses Feeling Type" ) ), ConsesLow.list( ConsesLow.list( makeString( "genreHeyday" ) ), makeString(
          "genre Heyday" ) ), ConsesLow.list( ConsesLow.list( makeString( "structureInArea" ) ), makeString( "structure In Area" ) ), ConsesLow.list( ConsesLow.list( makeString( "uppercaseOfLowercase" ) ), makeString(
              "uppercase Of Lowercase" ) ), ConsesLow.list( ConsesLow.list( makeString( "eMailAddressText" ) ), makeString( "E Mail Address Text" ) ), ConsesLow.list( ConsesLow.list( makeString( "quotedArgument" ) ),
                  makeString( "quoted Argument" ) ), ConsesLow.list( ConsesLow.list( makeString( "focalActivityType" ) ), makeString( "focal Activity Type" ) ), ConsesLow.list( ConsesLow.list( makeString(
                      "modalityFeatures" ) ), makeString( "modality Features" ) ), ConsesLow.list( ConsesLow.list( makeString( "mandatoryGameEquipmentType" ) ), makeString( "mandatory Game Equipment Type" ) ), ConsesLow
                          .list( ConsesLow.list( makeString( "testResponsibleCyclist" ) ), makeString( "test Responsible Cyclist" ) ), ConsesLow.list( ConsesLow.list( makeString( "formulaForFormulaTemplate" ) ),
                              makeString( "formula For Formula Template" ) ), ConsesLow.list( ConsesLow.list( makeString( "keInducedWeakSuggestionPreds" ) ), makeString( "ke Induced Weak Suggestion Preds" ) ), ConsesLow
                                  .list( ConsesLow.list( makeString( "specifiedSubsetOf" ) ), makeString( "specified Subset Of" ) ), ConsesLow.list( ConsesLow.list( makeString( "properSubEventTypes" ) ), makeString(
                                      "proper Sub Event Types" ) ), ConsesLow.list( ConsesLow.list( makeString( "dateJoinedJihad" ) ), makeString( "date Joined Jihad" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                          "cycSubjectClumps" ) ), makeString( "cyc Subject Clumps" ) ), ConsesLow.list( ConsesLow.list( makeString( "presidentOfCountry" ) ), makeString( "president Of Country" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "subLIdentifier" ) ), makeString( "sub L Identifier" ) ), ConsesLow.list( ConsesLow.list( makeString( "fileFoundOnComputer" ) ), makeString( "file Found On Computer" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "inRegion" ) ), makeString( "in Region" ) ), ConsesLow.list( ConsesLow.list( makeString( "countryPhoneCode" ) ), makeString( "country Phone Code" ) ), ConsesLow.list(
          ConsesLow.list( makeString( "intendedTargetTypeOfAttack" ) ), makeString( "intended Target Type Of Attack" ) ), ConsesLow.list( ConsesLow.list( makeString( "politiesBorderEachOther" ) ), makeString(
              "polities Border Each Other" ) ), ConsesLow.list( ConsesLow.list( makeString( "predicatesSBHLDisjoinsModule" ) ), makeString( "predicates SBHL Disjoins Module" ) ), ConsesLow.list( ConsesLow.list(
                  makeString( "reifiedUsingTool" ) ), makeString( "reified Using Tool" ) ), ConsesLow.list( ConsesLow.list( makeString( "arg3Isa" ) ), makeString( "arg 3 Isa" ) ), ConsesLow.list( ConsesLow.list(
                      makeString( "predicatesSBHLTypeTest" ) ), makeString( "predicates SBHL Type Test" ) ), ConsesLow.list( ConsesLow.list( makeString( "arg3Genl" ) ), makeString( "arg 3 Genl" ) ), ConsesLow.list(
                          ConsesLow.list( makeString( "arg2Genl" ) ), makeString( "arg 2 Genl" ) ), ConsesLow.list( ConsesLow.list( makeString( "middleNameInitial" ) ), makeString( "middle Name Initial" ) ), ConsesLow
                              .list( ConsesLow.list( makeString( "hasAuthorityOver" ) ), makeString( "has Authority Over" ) ), ConsesLow.list( ConsesLow.list( makeString( "temporallyContains" ) ), makeString(
                                  "temporally Contains" ) ), ConsesLow.list( ConsesLow.list( makeString( "superTopics" ) ), makeString( "super Topics" ) ), ConsesLow.list( ConsesLow.list( makeString( "memberTypes" ) ),
                                      makeString( "member Types" ) ), ConsesLow.list( ConsesLow.list( makeString( "colorHasHue" ) ), makeString( "color Has Hue" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                          "argsIsa" ) ), makeString( "args Isa" ) ), ConsesLow.list( ConsesLow.list( makeString( "arg1NotIsa" ) ), makeString( "arg 1 Not Isa" ) ), ConsesLow.list( ConsesLow.list(
                                              makeString( "mainTopic" ) ), makeString( "main Topic" ) ), ConsesLow.list( ConsesLow.list( makeString( "openEntryFormatInArgs" ) ), makeString(
                                                  "open Entry Format In Args" ) ), ConsesLow.list( ConsesLow.list( makeString( "reformulateTemplateViaSpecification" ) ), makeString(
                                                      "reformulate Template Via Specification" ) ), ConsesLow.list( ConsesLow.list( makeString( "terrainDecompositions" ) ), makeString( "terrain Decompositions" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "infoTransferred" ) ), makeString( "info Transferred" ) ), ConsesLow.list( ConsesLow.list( makeString( "transportedInTypes" ) ), makeString( "transported In Types" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "contradictoryPreds" ) ), makeString( "contradictory Preds" ) ), ConsesLow.list( ConsesLow.list( makeString( "agentTypeUsesArtifactType" ) ), makeString(
          "agent Type Uses Artifact Type" ) ), ConsesLow.list( ConsesLow.list( makeString( "genTemplate" ) ), makeString( "gen Template" ) ), ConsesLow.list( ConsesLow.list( makeString( "systemOfWriting" ) ), makeString(
              "system Of Writing" ) ), ConsesLow.list( ConsesLow.list( makeString( "uppercaseOfLetter" ) ), makeString( "uppercase Of Letter" ) ), ConsesLow.list( ConsesLow.list( makeString( "rolesForEventType" ) ),
                  makeString( "roles For Event Type" ) ), ConsesLow.list( ConsesLow.list( makeString( "templateTopicPrefix" ) ), makeString( "template Topic Prefix" ) ), ConsesLow.list( ConsesLow.list( makeString(
                      "jobClass" ) ), makeString( "job Class" ) ), ConsesLow.list( ConsesLow.list( makeString( "superEventTypes" ) ), makeString( "super Event Types" ) ), ConsesLow.list( ConsesLow.list( makeString(
                          "iteratedProperSubSituationTypes" ) ), makeString( "iterated Proper Sub Situation Types" ) ), ConsesLow.list( ConsesLow.list( makeString( "keInducedStrongSuggestionPreds" ) ), makeString(
                              "ke Induced Strong Suggestion Preds" ) ), ConsesLow.list( ConsesLow.list( makeString( "permanentlyNorthOf" ) ), makeString( "permanently North Of" ) ), ConsesLow.list( ConsesLow.list(
                                  makeString( "percentNaturalPopulationIncrease" ) ), makeString( "percent Natural Population Increase" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                      "titleForFormulaTemplateType-String" ) ), makeString( "title For Formula Template Type String" ) ), ConsesLow.list( ConsesLow.list( makeString( "subcatFrameKeywords" ) ), makeString(
                                          "subcat Frame Keywords" ) ), ConsesLow.list( ConsesLow.list( makeString( "rewriteOf" ) ), makeString( "rewrite Of" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                              "residenceOfOrganization" ) ), makeString( "residence Of Organization" ) ), ConsesLow.list( ConsesLow.list( makeString( "arg2Format" ) ), makeString( "arg 2 Format" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "surroundsHorizontally" ) ), makeString( "surrounds Horizontally" ) ), ConsesLow.list( ConsesLow.list( makeString( "mostNotableIsa" ) ), makeString(
          "most Notable Isa" ) ), ConsesLow.list( ConsesLow.list( makeString( "styleOfArtist" ) ), makeString( "style Of Artist" ) ), ConsesLow.list( ConsesLow.list( makeString( "specializedEquipmentOfUnitType" ) ),
              makeString( "specialized Equipment Of Unit Type" ) ), ConsesLow.list( ConsesLow.list( makeString( "inTopic" ) ), makeString( "in Topic" ) ), ConsesLow.list( ConsesLow.list( makeString( "disjointWith" ) ),
                  makeString( "disjoint With" ) ), ConsesLow.list( ConsesLow.list( makeString( "areasOfOrigin" ) ), makeString( "areas Of Origin" ) ), ConsesLow.list( ConsesLow.list( makeString(
                      "conceptuallyRelated" ) ), makeString( "conceptually Related" ) ), ConsesLow.list( ConsesLow.list( makeString( "interArgReln2-4" ) ), makeString( "inter Arg Reln 2 4" ) ), ConsesLow.list( ConsesLow
                          .list( makeString( "arg1Genl" ) ), makeString( "arg 1 Genl" ) ), ConsesLow.list( ConsesLow.list( makeString( "arg3Format" ) ), makeString( "arg 3 Format" ) ), ConsesLow.list( ConsesLow.list(
                              makeString( "temporalBoundsContain" ) ), makeString( "temporal Bounds Contain" ) ), ConsesLow.list( ConsesLow.list( makeString( "agentTypeWorksAtLocationType" ) ), makeString(
                                  "agent Type Works At Location Type" ) ), ConsesLow.list( ConsesLow.list( makeString( "relationCategoryType" ) ), makeString( "relation Category Type" ) ), ConsesLow.list( ConsesLow.list(
                                      makeString( "mainSubjectClump" ) ), makeString( "main Subject Clump" ) ), ConsesLow.list( ConsesLow.list( makeString( "arg1Format" ) ), makeString( "arg 1 Format" ) ), ConsesLow
                                          .list( ConsesLow.list( makeString( "conceptuallyCoRelated" ) ), makeString( "conceptually Co Related" ) ), ConsesLow.list( ConsesLow.list( makeString( "genlFunctions" ) ),
                                              makeString( "genl Functions" ) ), ConsesLow.list( ConsesLow.list( makeString( "arg2Isa" ) ), makeString( "arg 2 Isa" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                  "definitionalMtForTopicAssertions" ) ), makeString( "definitional Mt For Topic Assertions" ) ), ConsesLow.list( ConsesLow.list( makeString( "arg1Isa" ) ), makeString(
                                                      "arg 1 Isa" ) ), ConsesLow.list( ConsesLow.list( makeString( "colorHasChroma" ) ), makeString( "color Has Chroma" ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                          "indigenousTo" ) ), makeString( "indigenous To" ) )
    } );
  }

  @Override
  public void declareFunctions()
  {
    declare_string_utilities_file();
  }

  @Override
  public void initializeVariables()
  {
    init_string_utilities_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_string_utilities_file();
  }
  static
  {
    me = new string_utilities();
    $point_char$ = null;
    $space_char$ = null;
    $tab_char$ = null;
    $empty_string$ = null;
    $new_line_string$ = null;
    $test_char$ = null;
    $object_to_string_caching_state$ = null;
    $char_set$ = null;
    $64_bit_encoding_table$ = null;
    $64_bit_integer_index$ = null;
    $64_bit_char_index$ = null;
    $raw_whitespace_chars$ = null;
    $whitespace_chars$ = null;
    $grammatical_punctuation_chars$ = null;
    $target_characters$ = null;
    $trigraph_metric$ = null;
    $trigraph_tables$ = null;
    $cyclify_string_expand_subl_fn_strings$ = null;
    $cyclify_string_subl_quote_fn_strings$ = null;
    $cyclify_string_quote_chars$ = null;
    $dtp_cyclify_status$ = null;
    $string_read_buffer_size$ = null;
    $string_read_buffer$ = null;
    $str0$ = makeString( "" );
    $list1 = ConsesLow.list( ConsesLow.list( makeSymbol( "WORD" ), makeSymbol( "STRING" ), makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "BREAK-CHAR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
        "*SPACE-CHAR*" ) ) ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list2 = ConsesLow.list( makeKeyword( "BREAK-CHAR" ) );
    $kw3$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw4$BREAK_CHAR = makeKeyword( "BREAK-CHAR" );
    $sym5$_SPACE_CHAR_ = makeSymbol( "*SPACE-CHAR*" );
    $sym6$WORD_LIST_VAR = makeUninternedSymbol( "WORD-LIST-VAR" );
    $sym7$CLET = makeSymbol( "CLET" );
    $sym8$_TEST_CHAR_ = makeSymbol( "*TEST-CHAR*" );
    $sym9$BREAK_WORDS = makeSymbol( "BREAK-WORDS" );
    $list10 = ConsesLow.list( ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "NOT-TEST-CHAR" ) ) );
    $sym11$CDOLIST = makeSymbol( "CDOLIST" );
    $sym12$STRINGP = makeSymbol( "STRINGP" );
    $sym13$OBJECT_TO_STRING = makeSymbol( "OBJECT-TO-STRING" );
    $sym14$_OBJECT_TO_STRING_CACHING_STATE_ = makeSymbol( "*OBJECT-TO-STRING-CACHING-STATE*" );
    $int15$1000 = makeInteger( 1000 );
    $str16$_ = makeString( ">" );
    $str17$_ = makeString( "(" );
    $str18$_ = makeString( " " );
    $str19$___ = makeString( "..." );
    $str20$_ = makeString( ")" );
    $str21$_ = makeString( "\"" );
    $sym22$READABLE_P = makeSymbol( "READABLE-P" );
    $sym23$READ_FROM_STRING_IGNORING_ERRORS = makeSymbol( "READ-FROM-STRING-IGNORING-ERRORS" );
    $kw24$ERROR = makeKeyword( "ERROR" );
    $str25$_X = makeString( "~X" );
    $sym26$FIXNUMP = makeSymbol( "FIXNUMP" );
    $str27$_S_is_too_short_to_remove__D_char = makeString( "~S is too short to remove ~D characters." );
    $sym28$NON_EMPTY_STRING_ = makeSymbol( "NON-EMPTY-STRING?" );
    $str29$_S_must_be_a_single_word___cannot = makeString( "~S must be a single word - cannot contain ~S" );
    $sym30$NOT_TEST_CHAR = makeSymbol( "NOT-TEST-CHAR" );
    $int31$100 = makeInteger( 100 );
    $int32$256 = makeInteger( 256 );
    $sym33$LISTP = makeSymbol( "LISTP" );
    $sym34$CHARACTERP = makeSymbol( "CHARACTERP" );
    $str35$Some_element_of__A_is_not_charact = makeString( "Some element of ~A is not characterp." );
    $sym36$HTML_ESCAPED_STRING_P = makeSymbol( "HTML-ESCAPED-STRING-P" );
    $kw37$TEST = makeKeyword( "TEST" );
    $kw38$OWNER = makeKeyword( "OWNER" );
    $kw39$CLASSES = makeKeyword( "CLASSES" );
    $kw40$KB = makeKeyword( "KB" );
    $kw41$TINY = makeKeyword( "TINY" );
    $kw42$WORKING_ = makeKeyword( "WORKING?" );
    $list43 = ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "foo &bar; bam" ) ), T ), ConsesLow.list( ConsesLow.list( makeString( "PB&#x2014;J" ) ), T ), ConsesLow.list( ConsesLow.list( makeString(
        "PB&J" ) ), NIL ), ConsesLow.list( ConsesLow.list( makeString( "PB&amp;J" ) ), T ), ConsesLow.list( ConsesLow.list( makeString( "PB&#151;J" ) ), T ) );
    $sym44$NON_NEGATIVE_INTEGER_P = makeSymbol( "NON-NEGATIVE-INTEGER-P" );
    $sym45$_ = makeSymbol( "<" );
    $sym46$ENDS_WITH_START_OF = makeSymbol( "ENDS-WITH-START-OF" );
    $list47 = ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "Author Harriet" ), makeString( "Harriet Beecher Stowe" ), EQUALP ), makeString( "Harriet" ) ), ConsesLow.list( ConsesLow.list( makeString(
        "Author Harriet Beecher Stowe" ), makeString( "Harriet Beecher Stowe" ), EQUALP ), makeString( "Harriet Beecher Stowe" ) ), ConsesLow.list( ConsesLow.list( makeString( "Author Harriet Beecher Stowes" ),
            makeString( "Harriet Beecher Stowe" ), EQUALP ), NIL ), ConsesLow.list( ConsesLow.list( makeString( "Author Harriet Beecher Sto" ), makeString( "Harriet Beecher Stowe" ), EQUALP ), makeString(
                "Harriet Beecher Sto" ) ), ConsesLow.list( ConsesLow.list( makeString( "Author Harriet Beecher Sto" ), makeString( "riet Beecher Stowe" ), EQUALP, ConsesLow.list( makeString( " " ) ) ), NIL ) );
    $str48$_ = makeString( "," );
    $str49$__ = makeString( ", " );
    $list50 = ConsesLow.list( Characters.CHAR_lparen, Characters.CHAR_rparen );
    $list51 = ConsesLow.list( makeString( "." ), makeString( "?" ), makeString( "!" ) );
    $list52 = ConsesLow.list( makeSymbol( "NON-EMPTY-CYCL-STRING?" ), makeSymbol( "NON-EMPTY-SUBL-STRING?//////" ) );
    $sym53$CHAR_IN_CHAR_SET = makeSymbol( "CHAR-IN-CHAR-SET" );
    $sym54$DIGIT_CHAR_P = makeSymbol( "DIGIT-CHAR-P" );
    $sym55$ALPHANUMERICP = makeSymbol( "ALPHANUMERICP" );
    $sym56$ALPHA_CHAR_P = makeSymbol( "ALPHA-CHAR-P" );
    $list57 = ConsesLow.list( makeString( "-" ) );
    $list58 = ConsesLow.list( makeString( "," ) );
    $sym59$IS_NUMERIC_ = makeSymbol( "IS-NUMERIC?" );
    $sym60$PARSE_INTEGER = makeSymbol( "PARSE-INTEGER" );
    $str61$__R = makeString( "~:R" );
    $list62 = ConsesLow.list( makeString( "st" ), makeString( "nd" ), makeString( "rd" ), makeString( "th" ) );
    $sym63$CONTROL_CHAR_P = makeSymbol( "CONTROL-CHAR-P" );
    $int64$32 = makeInteger( 32 );
    $int65$128 = makeInteger( 128 );
    $list66 = ConsesLow.list( Characters.CHAR_space );
    $sym67$STRING = makeSymbol( "STRING" );
    $str68$_b = makeString( "\\b" );
    $list69 = ConsesLow.list( makeKeyword( "CASELESS" ) );
    $str70$_S_is_not_a_part_of_the_reference = makeString( "~S is not a part of the reference string: ~S" );
    $str71$Failed_to_bunge__S_according_to__ = makeString( "Failed to bunge ~S according to ~S.  Returning: ~S" );
    $sym72$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $sym73$UNICODE_NAUT_P = makeSymbol( "UNICODE-NAUT-P" );
    $sym74$CCONCATENATE = makeSymbol( "CCONCATENATE" );
    $list75 = ConsesLow.list( makeString( " " ) );
    $sym76$LOWER_CASE_P = makeSymbol( "LOWER-CASE-P" );
    $sym77$WHITESPACEP = makeSymbol( "WHITESPACEP" );
    $sym78$UPPER_CASE_P = makeSymbol( "UPPER-CASE-P" );
    $sym79$PUNCTUATION_P = makeSymbol( "PUNCTUATION-P" );
    $sym80$EAT_CHAR_P = makeSymbol( "EAT-CHAR-P" );
    $sym81$INTEGERP = makeSymbol( "INTEGERP" );
    $str82$0123456789ABCDEF = makeString( "0123456789ABCDEF" );
    $sym83$HEX_CHAR_P = makeSymbol( "HEX-CHAR-P" );
    $list84 = ConsesLow.list( new SubLObject[] { ConsesLow.cons( ZERO_INTEGER, Characters.CHAR_A ), ConsesLow.cons( ONE_INTEGER, Characters.CHAR_B ), ConsesLow.cons( TWO_INTEGER, Characters.CHAR_C ), ConsesLow.cons(
        THREE_INTEGER, Characters.CHAR_D ), ConsesLow.cons( FOUR_INTEGER, Characters.CHAR_E ), ConsesLow.cons( FIVE_INTEGER, Characters.CHAR_F ), ConsesLow.cons( SIX_INTEGER, Characters.CHAR_G ), ConsesLow.cons(
            SEVEN_INTEGER, Characters.CHAR_H ), ConsesLow.cons( EIGHT_INTEGER, Characters.CHAR_I ), ConsesLow.cons( NINE_INTEGER, Characters.CHAR_J ), ConsesLow.cons( TEN_INTEGER, Characters.CHAR_K ), ConsesLow.cons(
                ELEVEN_INTEGER, Characters.CHAR_L ), ConsesLow.cons( TWELVE_INTEGER, Characters.CHAR_M ), ConsesLow.cons( THIRTEEN_INTEGER, Characters.CHAR_N ), ConsesLow.cons( FOURTEEN_INTEGER, Characters.CHAR_O ),
      ConsesLow.cons( FIFTEEN_INTEGER, Characters.CHAR_P ), ConsesLow.cons( SIXTEEN_INTEGER, Characters.CHAR_Q ), ConsesLow.cons( SEVENTEEN_INTEGER, Characters.CHAR_R ), ConsesLow.cons( EIGHTEEN_INTEGER,
          Characters.CHAR_S ), ConsesLow.cons( NINETEEN_INTEGER, Characters.CHAR_T ), ConsesLow.cons( TWENTY_INTEGER, Characters.CHAR_U ), ConsesLow.cons( makeInteger( 21 ), Characters.CHAR_V ), ConsesLow.cons(
              makeInteger( 22 ), Characters.CHAR_W ), ConsesLow.cons( makeInteger( 23 ), Characters.CHAR_X ), ConsesLow.cons( makeInteger( 24 ), Characters.CHAR_Y ), ConsesLow.cons( makeInteger( 25 ),
                  Characters.CHAR_Z ), ConsesLow.cons( makeInteger( 26 ), Characters.CHAR_a ), ConsesLow.cons( makeInteger( 27 ), Characters.CHAR_b ), ConsesLow.cons( makeInteger( 28 ), Characters.CHAR_c ), ConsesLow
                      .cons( makeInteger( 29 ), Characters.CHAR_d ), ConsesLow.cons( makeInteger( 30 ), Characters.CHAR_e ), ConsesLow.cons( makeInteger( 31 ), Characters.CHAR_f ), ConsesLow.cons( makeInteger( 32 ),
                          Characters.CHAR_g ), ConsesLow.cons( makeInteger( 33 ), Characters.CHAR_h ), ConsesLow.cons( makeInteger( 34 ), Characters.CHAR_i ), ConsesLow.cons( makeInteger( 35 ), Characters.CHAR_j ),
      ConsesLow.cons( makeInteger( 36 ), Characters.CHAR_k ), ConsesLow.cons( makeInteger( 37 ), Characters.CHAR_l ), ConsesLow.cons( makeInteger( 38 ), Characters.CHAR_m ), ConsesLow.cons( makeInteger( 39 ),
          Characters.CHAR_n ), ConsesLow.cons( makeInteger( 40 ), Characters.CHAR_o ), ConsesLow.cons( makeInteger( 41 ), Characters.CHAR_p ), ConsesLow.cons( makeInteger( 42 ), Characters.CHAR_q ), ConsesLow.cons(
              makeInteger( 43 ), Characters.CHAR_r ), ConsesLow.cons( makeInteger( 44 ), Characters.CHAR_s ), ConsesLow.cons( makeInteger( 45 ), Characters.CHAR_t ), ConsesLow.cons( makeInteger( 46 ),
                  Characters.CHAR_u ), ConsesLow.cons( makeInteger( 47 ), Characters.CHAR_v ), ConsesLow.cons( makeInteger( 48 ), Characters.CHAR_w ), ConsesLow.cons( makeInteger( 49 ), Characters.CHAR_x ), ConsesLow
                      .cons( makeInteger( 50 ), Characters.CHAR_y ), ConsesLow.cons( makeInteger( 51 ), Characters.CHAR_z ), ConsesLow.cons( makeInteger( 52 ), Characters.CHAR_0 ), ConsesLow.cons( makeInteger( 53 ),
                          Characters.CHAR_1 ), ConsesLow.cons( makeInteger( 54 ), Characters.CHAR_2 ), ConsesLow.cons( makeInteger( 55 ), Characters.CHAR_3 ), ConsesLow.cons( makeInteger( 56 ), Characters.CHAR_4 ),
      ConsesLow.cons( makeInteger( 57 ), Characters.CHAR_5 ), ConsesLow.cons( makeInteger( 58 ), Characters.CHAR_6 ), ConsesLow.cons( makeInteger( 59 ), Characters.CHAR_7 ), ConsesLow.cons( makeInteger( 60 ),
          Characters.CHAR_8 ), ConsesLow.cons( makeInteger( 61 ), Characters.CHAR_9 ), ConsesLow.cons( makeInteger( 62 ), Characters.CHAR_plus ), ConsesLow.cons( makeInteger( 63 ), Characters.CHAR_slash ), ConsesLow
              .cons( makeInteger( 62 ), Characters.CHAR_hyphen ), ConsesLow.cons( makeInteger( 63 ), Characters.CHAR_underbar )
    } );
    $str85$____________ = makeString( ",.?!&'\";:()-" );
    $str86$_____________ = makeString( ",.?!&'\";:()-/" );
    $sym87$PUNCTUATION_EXTENDED_P = makeSymbol( "PUNCTUATION-EXTENDED-P" );
    $list88 = ConsesLow.list( Characters.CHAR_space, Characters.CHAR_tab, Characters.CHAR_return, Characters.CHAR_newline, Characters.CHAR_newline );
    $sym89$CHAR_EQUAL = makeSymbol( "CHAR-EQUAL" );
    $list90 = ConsesLow.list( new SubLObject[] { Characters.CHAR_comma, Characters.CHAR_question, Characters.CHAR_exclamation, Characters.CHAR_ampersand, Characters.CHAR_backslash, Characters.CHAR_slash,
      Characters.CHAR_quotation, Characters.CHAR_semicolon, Characters.CHAR_colon, Characters.CHAR_lparen, Characters.CHAR_rparen, Characters.CHAR_plus
    } );
    $sym91$UNICODE_SPACE_CHAR_CODE_P = makeSymbol( "UNICODE-SPACE-CHAR-CODE-P" );
    $int92$8192 = makeInteger( 8192 );
    $int93$8203 = makeInteger( 8203 );
    $kw94$EOF = makeKeyword( "EOF" );
    $int95$64 = makeInteger( 64 );
    $kw96$NORMAL = makeKeyword( "NORMAL" );
    $kw97$CR = makeKeyword( "CR" );
    $kw98$STRING = makeKeyword( "STRING" );
    $kw99$SLASH = makeKeyword( "SLASH" );
    $sym100$FBOUNDP = makeSymbol( "FBOUNDP" );
    $sym101$NON_EMPTY_STRING_P = makeSymbol( "NON-EMPTY-STRING-P" );
    $list102 = ConsesLow.list( Characters.CHAR_colon, Characters.CHAR_slash );
    $sym103$VALID_CONSTANT_NAME_CHAR_P = makeSymbol( "VALID-CONSTANT-NAME-CHAR-P" );
    $sym104$1_ = makeSymbol( "1+" );
    $list105 = ConsesLow.list( makeString( " and " ), makeString( " or " ) );
    $list106 = ConsesLow.list( makeString( ", " ) );
    $list107 = ConsesLow.list( Characters.CHAR_period, Characters.CHAR_question, Characters.CHAR_exclamation );
    $sym108$TARGET_CHARACTER_FOUND = makeSymbol( "TARGET-CHARACTER-FOUND" );
    $list109 = ConsesLow.list( Characters.CHAR_newline, Characters.CHAR_return );
    $list110 = ConsesLow.list( Characters.CHAR_quotation, Characters.CHAR_backslash, Characters.CHAR_asterisk, Characters.CHAR_question, Characters.CHAR_lbracket, Characters.CHAR_rbracket, Characters.CHAR_quote );
    $kw111$DEFAULT = makeKeyword( "DEFAULT" );
    $sym112$CHAR_ = makeSymbol( "CHAR=" );
    $str113$Unmatched_open_parenthesis = makeString( "Unmatched open parenthesis" );
    $str114$Unmatched_close_parenthesis = makeString( "Unmatched close parenthesis" );
    $int115$255 = makeInteger( 255 );
    $list116 = ConsesLow.list( makeString( "." ) );
    $float117$0_8 = makeDouble( 0.8 );
    $kw118$FREE = makeKeyword( "FREE" );
    $int119$50 = makeInteger( 50 );
    $str120$es = makeString( "es" );
    $str121$s = makeString( "s" );
    $int122$1000000 = makeInteger( 1000000 );
    $sym123$FORT_PRINT_NAME = makeSymbol( "FORT-PRINT-NAME" );
    $sym124$STR_BY_TYPE = makeSymbol( "STR-BY-TYPE" );
    $str125$__ = makeString( "~%" );
    $list126 = ConsesLow.list( makeString( "#$ExpandSubLFn" ), makeString( "ExpandSubLFn" ) );
    $list127 = ConsesLow.list( makeString( "#$SubLQuoteFn" ), makeString( "SubLQuoteFn" ) );
    $list128 = ConsesLow.list( Characters.CHAR_backslash );
    $sym129$CYCLIFY_STATUS = makeSymbol( "CYCLIFY-STATUS" );
    $sym130$CYCLIFY_STATUS_P = makeSymbol( "CYCLIFY-STATUS-P" );
    $list131 = ConsesLow.list( new SubLObject[] { makeSymbol( "OUT-STRING-LIST" ), makeSymbol( "REFERENCES-ADDED" ), makeSymbol( "INSIDE-QUOTE?" ), makeSymbol( "INSIDE-EL-VAR-NAME?" ), makeSymbol( "ALREADY-CYCLIFIED?" ),
      makeSymbol( "ESCAPE?" ), makeSymbol( "INSIDE-SUBL-QUOTE-FN?" ), makeSymbol( "INSIDE-EXPAND-SUBL-FN?" ), makeSymbol( "INSIDE-EXPAND-SUBL-FN-ARG1?" ), makeSymbol( "INSIDE-EXPAND-SUBL-FN-ARG2?" ), makeSymbol(
          "IMMEDIATELY-FOLLOWING-PAREN?" ), makeSymbol( "PAREN-COUNT" )
    } );
    $list132 = ConsesLow.list( new SubLObject[] { makeKeyword( "OUT-STRING-LIST" ), makeKeyword( "REFERENCES-ADDED" ), makeKeyword( "INSIDE-QUOTE?" ), makeKeyword( "INSIDE-EL-VAR-NAME?" ), makeKeyword(
        "ALREADY-CYCLIFIED?" ), makeKeyword( "ESCAPE?" ), makeKeyword( "INSIDE-SUBL-QUOTE-FN?" ), makeKeyword( "INSIDE-EXPAND-SUBL-FN?" ), makeKeyword( "INSIDE-EXPAND-SUBL-FN-ARG1?" ), makeKeyword(
            "INSIDE-EXPAND-SUBL-FN-ARG2?" ), makeKeyword( "IMMEDIATELY-FOLLOWING-PAREN?" ), makeKeyword( "PAREN-COUNT" )
    } );
    $list133 = ConsesLow.list( new SubLObject[] { makeSymbol( "CYCLIFY-STATUS-OUT-STRING-LIST" ), makeSymbol( "CYCLIFY-STATUS-REFERENCES-ADDED" ), makeSymbol( "CYCLIFY-STATUS-INSIDE-QUOTE?" ), makeSymbol(
        "CYCLIFY-STATUS-INSIDE-EL-VAR-NAME?" ), makeSymbol( "CYCLIFY-STATUS-ALREADY-CYCLIFIED?" ), makeSymbol( "CYCLIFY-STATUS-ESCAPE?" ), makeSymbol( "CYCLIFY-STATUS-INSIDE-SUBL-QUOTE-FN?" ), makeSymbol(
            "CYCLIFY-STATUS-INSIDE-EXPAND-SUBL-FN?" ), makeSymbol( "CYCLIFY-STATUS-INSIDE-EXPAND-SUBL-FN-ARG1?" ), makeSymbol( "CYCLIFY-STATUS-INSIDE-EXPAND-SUBL-FN-ARG2?" ), makeSymbol(
                "CYCLIFY-STATUS-IMMEDIATELY-FOLLOWING-PAREN?" ), makeSymbol( "CYCLIFY-STATUS-PAREN-COUNT" )
    } );
    $list134 = ConsesLow.list( new SubLObject[] { makeSymbol( "_CSETF-CYCLIFY-STATUS-OUT-STRING-LIST" ), makeSymbol( "_CSETF-CYCLIFY-STATUS-REFERENCES-ADDED" ), makeSymbol( "_CSETF-CYCLIFY-STATUS-INSIDE-QUOTE?" ),
      makeSymbol( "_CSETF-CYCLIFY-STATUS-INSIDE-EL-VAR-NAME?" ), makeSymbol( "_CSETF-CYCLIFY-STATUS-ALREADY-CYCLIFIED?" ), makeSymbol( "_CSETF-CYCLIFY-STATUS-ESCAPE?" ), makeSymbol(
          "_CSETF-CYCLIFY-STATUS-INSIDE-SUBL-QUOTE-FN?" ), makeSymbol( "_CSETF-CYCLIFY-STATUS-INSIDE-EXPAND-SUBL-FN?" ), makeSymbol( "_CSETF-CYCLIFY-STATUS-INSIDE-EXPAND-SUBL-FN-ARG1?" ), makeSymbol(
              "_CSETF-CYCLIFY-STATUS-INSIDE-EXPAND-SUBL-FN-ARG2?" ), makeSymbol( "_CSETF-CYCLIFY-STATUS-IMMEDIATELY-FOLLOWING-PAREN?" ), makeSymbol( "_CSETF-CYCLIFY-STATUS-PAREN-COUNT" )
    } );
    $sym135$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol( "DEFAULT-STRUCT-PRINT-FUNCTION" );
    $sym136$CYCLIFY_STATUS_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "CYCLIFY-STATUS-PRINT-FUNCTION-TRAMPOLINE" );
    $list137 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "CYCLIFY-STATUS-P" ) );
    $sym138$CYCLIFY_STATUS_OUT_STRING_LIST = makeSymbol( "CYCLIFY-STATUS-OUT-STRING-LIST" );
    $sym139$_CSETF_CYCLIFY_STATUS_OUT_STRING_LIST = makeSymbol( "_CSETF-CYCLIFY-STATUS-OUT-STRING-LIST" );
    $sym140$CYCLIFY_STATUS_REFERENCES_ADDED = makeSymbol( "CYCLIFY-STATUS-REFERENCES-ADDED" );
    $sym141$_CSETF_CYCLIFY_STATUS_REFERENCES_ADDED = makeSymbol( "_CSETF-CYCLIFY-STATUS-REFERENCES-ADDED" );
    $sym142$CYCLIFY_STATUS_INSIDE_QUOTE_ = makeSymbol( "CYCLIFY-STATUS-INSIDE-QUOTE?" );
    $sym143$_CSETF_CYCLIFY_STATUS_INSIDE_QUOTE_ = makeSymbol( "_CSETF-CYCLIFY-STATUS-INSIDE-QUOTE?" );
    $sym144$CYCLIFY_STATUS_INSIDE_EL_VAR_NAME_ = makeSymbol( "CYCLIFY-STATUS-INSIDE-EL-VAR-NAME?" );
    $sym145$_CSETF_CYCLIFY_STATUS_INSIDE_EL_VAR_NAME_ = makeSymbol( "_CSETF-CYCLIFY-STATUS-INSIDE-EL-VAR-NAME?" );
    $sym146$CYCLIFY_STATUS_ALREADY_CYCLIFIED_ = makeSymbol( "CYCLIFY-STATUS-ALREADY-CYCLIFIED?" );
    $sym147$_CSETF_CYCLIFY_STATUS_ALREADY_CYCLIFIED_ = makeSymbol( "_CSETF-CYCLIFY-STATUS-ALREADY-CYCLIFIED?" );
    $sym148$CYCLIFY_STATUS_ESCAPE_ = makeSymbol( "CYCLIFY-STATUS-ESCAPE?" );
    $sym149$_CSETF_CYCLIFY_STATUS_ESCAPE_ = makeSymbol( "_CSETF-CYCLIFY-STATUS-ESCAPE?" );
    $sym150$CYCLIFY_STATUS_INSIDE_SUBL_QUOTE_FN_ = makeSymbol( "CYCLIFY-STATUS-INSIDE-SUBL-QUOTE-FN?" );
    $sym151$_CSETF_CYCLIFY_STATUS_INSIDE_SUBL_QUOTE_FN_ = makeSymbol( "_CSETF-CYCLIFY-STATUS-INSIDE-SUBL-QUOTE-FN?" );
    $sym152$CYCLIFY_STATUS_INSIDE_EXPAND_SUBL_FN_ = makeSymbol( "CYCLIFY-STATUS-INSIDE-EXPAND-SUBL-FN?" );
    $sym153$_CSETF_CYCLIFY_STATUS_INSIDE_EXPAND_SUBL_FN_ = makeSymbol( "_CSETF-CYCLIFY-STATUS-INSIDE-EXPAND-SUBL-FN?" );
    $sym154$CYCLIFY_STATUS_INSIDE_EXPAND_SUBL_FN_ARG1_ = makeSymbol( "CYCLIFY-STATUS-INSIDE-EXPAND-SUBL-FN-ARG1?" );
    $sym155$_CSETF_CYCLIFY_STATUS_INSIDE_EXPAND_SUBL_FN_ARG1_ = makeSymbol( "_CSETF-CYCLIFY-STATUS-INSIDE-EXPAND-SUBL-FN-ARG1?" );
    $sym156$CYCLIFY_STATUS_INSIDE_EXPAND_SUBL_FN_ARG2_ = makeSymbol( "CYCLIFY-STATUS-INSIDE-EXPAND-SUBL-FN-ARG2?" );
    $sym157$_CSETF_CYCLIFY_STATUS_INSIDE_EXPAND_SUBL_FN_ARG2_ = makeSymbol( "_CSETF-CYCLIFY-STATUS-INSIDE-EXPAND-SUBL-FN-ARG2?" );
    $sym158$CYCLIFY_STATUS_IMMEDIATELY_FOLLOWING_PAREN_ = makeSymbol( "CYCLIFY-STATUS-IMMEDIATELY-FOLLOWING-PAREN?" );
    $sym159$_CSETF_CYCLIFY_STATUS_IMMEDIATELY_FOLLOWING_PAREN_ = makeSymbol( "_CSETF-CYCLIFY-STATUS-IMMEDIATELY-FOLLOWING-PAREN?" );
    $sym160$CYCLIFY_STATUS_PAREN_COUNT = makeSymbol( "CYCLIFY-STATUS-PAREN-COUNT" );
    $sym161$_CSETF_CYCLIFY_STATUS_PAREN_COUNT = makeSymbol( "_CSETF-CYCLIFY-STATUS-PAREN-COUNT" );
    $kw162$OUT_STRING_LIST = makeKeyword( "OUT-STRING-LIST" );
    $kw163$REFERENCES_ADDED = makeKeyword( "REFERENCES-ADDED" );
    $kw164$INSIDE_QUOTE_ = makeKeyword( "INSIDE-QUOTE?" );
    $kw165$INSIDE_EL_VAR_NAME_ = makeKeyword( "INSIDE-EL-VAR-NAME?" );
    $kw166$ALREADY_CYCLIFIED_ = makeKeyword( "ALREADY-CYCLIFIED?" );
    $kw167$ESCAPE_ = makeKeyword( "ESCAPE?" );
    $kw168$INSIDE_SUBL_QUOTE_FN_ = makeKeyword( "INSIDE-SUBL-QUOTE-FN?" );
    $kw169$INSIDE_EXPAND_SUBL_FN_ = makeKeyword( "INSIDE-EXPAND-SUBL-FN?" );
    $kw170$INSIDE_EXPAND_SUBL_FN_ARG1_ = makeKeyword( "INSIDE-EXPAND-SUBL-FN-ARG1?" );
    $kw171$INSIDE_EXPAND_SUBL_FN_ARG2_ = makeKeyword( "INSIDE-EXPAND-SUBL-FN-ARG2?" );
    $kw172$IMMEDIATELY_FOLLOWING_PAREN_ = makeKeyword( "IMMEDIATELY-FOLLOWING-PAREN?" );
    $kw173$PAREN_COUNT = makeKeyword( "PAREN-COUNT" );
    $str174$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw175$BEGIN = makeKeyword( "BEGIN" );
    $sym176$MAKE_CYCLIFY_STATUS = makeSymbol( "MAKE-CYCLIFY-STATUS" );
    $kw177$SLOT = makeKeyword( "SLOT" );
    $kw178$END = makeKeyword( "END" );
    $sym179$VISIT_DEFSTRUCT_OBJECT_CYCLIFY_STATUS_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-CYCLIFY-STATUS-METHOD" );
    $sym180$CYCLIFY_STRING = makeSymbol( "CYCLIFY-STRING" );
    $str181$__ = makeString( "_-" );
    $int182$1024 = makeInteger( 1024 );
    $str183$quit_reading_file = makeString( "quit reading file" );
    $str184$string_read_larger_than_buffer_si = makeString( "string read larger than buffer size of ~S" );
    $float185$0_5 = makeDouble( 0.5 );
    $str186$_a = makeString( "~a" );
    $kw187$BEFORE = makeKeyword( "BEFORE" );
    $kw188$WORD = makeKeyword( "WORD" );
    $kw189$KEEP_BLANK = makeKeyword( "KEEP-BLANK" );
    $kw190$SKIP_BLANKS = makeKeyword( "SKIP-BLANKS" );
    $str191$Unknown_State__S__Flaw_in_state_m = makeString( "Unknown State ~S: Flaw in state machine design." );
    $kw192$SPACE = makeKeyword( "SPACE" );
    $str193$Unknown_state__S__Design_flaw_in_ = makeString( "Unknown state ~S: Design flaw in state machine." );
    $sym194$PRIN1 = makeSymbol( "PRIN1" );
    $sym195$FUNCTION_SYMBOL_P = makeSymbol( "FUNCTION-SYMBOL-P" );
    $kw196$INPUT = makeKeyword( "INPUT" );
    $str197$Unable_to_open__S = makeString( "Unable to open ~S" );
    $str198$Could_not_open_an_input_stream_fo = makeString( "Could not open an input stream for ~S." );
    $kw199$OUTPUT = makeKeyword( "OUTPUT" );
    $str200$__Cannot_open_input_stream_for__A = makeString( "~%Cannot open input stream for ~A" );
    $str201$_ = makeString( "_" );
    $int202$97 = makeInteger( 97 );
    $int203$26 = makeInteger( 26 );
    $sym204$ALPHANUMERIC_OR_HYPHEN_P = makeSymbol( "ALPHANUMERIC-OR-HYPHEN-P" );
    $str205$_a_is_not_a_number_between_0_and_ = makeString( "~a is not a number between 0 and 25" );
    $sym206$NON_ALPHANUMERIC_P = makeSymbol( "NON-ALPHANUMERIC-P" );
    $sym207$KEYWORD_IMPOSTOR_P = makeSymbol( "KEYWORD-IMPOSTOR-P" );
    $sym208$PROGN = makeSymbol( "PROGN" );
    $str209$__a = makeString( ",~a" );
    $kw210$FULL = makeKeyword( "FULL" );
    $list211 = ConsesLow.list( new SubLObject[] { ConsesLow.list( ConsesLow.list( makeString( "" ) ), makeString( "" ) ), ConsesLow.list( ConsesLow.list( makeString( "Dog" ) ), makeString( "#$Dog" ) ), ConsesLow.list(
        ConsesLow.list( makeString( "\"Dog\"" ) ), makeString( "\"Dog\"" ) ), ConsesLow.list( ConsesLow.list( makeString( "\\\"Dog\\\"" ) ), makeString( "\\\"#$Dog\\\"" ) ), ConsesLow.list( ConsesLow.list( makeString(
            "(comment Dog \"A ... Dog ... Muffet\")" ) ), makeString( "(#$comment #$Dog \"A ... Dog ... Muffet\")" ) ), ConsesLow.list( ConsesLow.list( makeString( "(isa Muffet Dog)" ) ), makeString(
                "(#$isa #$Muffet #$Dog)" ) ), ConsesLow.list( ConsesLow.list( makeString( "(isa ?Muffet Dog)" ) ), makeString( "(#$isa ?Muffet #$Dog)" ) ), ConsesLow.list( ConsesLow.list( makeString( "Thing" ) ),
                    makeString( "#$Thing" ) ), ConsesLow.list( ConsesLow.list( makeString( "\"Thing\"" ) ), makeString( "\"Thing\"" ) ), ConsesLow.list( ConsesLow.list( makeString( "Xyzzy" ) ), makeString( "Xyzzy" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "SubLQuoteFn Thing" ) ), makeString( "#$SubLQuoteFn #$Thing" ) ), ConsesLow.list( ConsesLow.list( makeString( "ExpandSubLFn () Thing" ) ), makeString(
          "#$ExpandSubLFn () #$Thing" ) ), ConsesLow.list( ConsesLow.list( makeString( "'Dog" ) ), makeString( "'#$Dog" ) )
    } );
    $sym212$SUBWORD_ = makeSymbol( "SUBWORD?" );
    $list213 = ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "emus" ), makeString( "Emus are nice" ), NIL, EQUALP ), T ), ConsesLow.list( ConsesLow.list( makeString( "emus" ), makeString( "Emus are nice" ),
        NIL, EQUAL ), NIL ), ConsesLow.list( ConsesLow.list( makeString( "emus" ), makeString( "" ) ), NIL ), ConsesLow.list( ConsesLow.list( makeString( "emus" ), makeString( "e" ), ConsesLow.list(
            Characters.CHAR_period ) ), NIL ), ConsesLow.list( ConsesLow.list( makeString( "emus" ), makeString( ".emus." ), ConsesLow.list( Characters.CHAR_period ) ), T ), ConsesLow.list( ConsesLow.list( makeString(
                "..emus." ), makeString( "emus" ), ConsesLow.list( Characters.CHAR_period ) ), T ), ConsesLow.list( ConsesLow.list( makeString( "emus" ), makeString( "I like emus." ), ConsesLow.list(
                    Characters.CHAR_period ), EQUALP ), T ), ConsesLow.list( ConsesLow.list( makeString( ".." ), makeString( "Emus are nice" ), ConsesLow.list( Characters.CHAR_period ), EQUAL ), NIL ) );
    $sym214$STRING_DOWNCASE_EXCEPT_ACRONYMS = makeSymbol( "STRING-DOWNCASE-EXCEPT-ACRONYMS" );
    $list215 = _constant_215_initializer();
    $sym216$SPACE_DONT_UNCAPITALIZE = makeSymbol( "SPACE-DONT-UNCAPITALIZE" );
    $list217 = _constant_217_initializer();
    $sym218$QUOTED_STRING_ = makeSymbol( "QUOTED-STRING?" );
    $list219 = ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "" ) ), NIL ), ConsesLow.list( ConsesLow.list( makeString( "string" ) ), NIL ), ConsesLow.list( ConsesLow.list( makeString( "'string" ) ), NIL ),
        ConsesLow.list( ConsesLow.list( makeString( "'string'" ) ), T ) );
    $sym220$CONCATENATE_ADJACENT_STRINGS = makeSymbol( "CONCATENATE-ADJACENT-STRINGS" );
    $list221 = ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( ONE_INTEGER, TWO_INTEGER, THREE_INTEGER ) ), ConsesLow.list( ONE_INTEGER, TWO_INTEGER, THREE_INTEGER ) ), ConsesLow.list( ConsesLow.list(
        ConsesLow.list( ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, makeString( "a" ), makeString( "b" ), makeString( "C" ) ) ), ConsesLow.list( ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, makeString( "abC" ) ) ), ConsesLow
            .list( ConsesLow.list( ConsesLow.list( new SubLObject[]
            { makeString( "e" ), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, makeString( "a" ), makeString( "b" ), makeString( "C" ), FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER, makeString( "c" )
    } ) ), ConsesLow.list( new SubLObject[] { makeString( "e" ), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, makeString( "abC" ), FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER, makeString( "c" )
    } ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( new SubLObject[] { makeString( "e" ), makeString( "f" ), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, makeString( "a" ), makeString( "b" ), makeString( "C" ),
      FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER, makeString( "c" ), makeString( "e" )
    } ) ), ConsesLow.list( new SubLObject[] { makeString( "ef" ), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, makeString( "abC" ), FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER, makeString( "ce" )
    } ) ) );
    $sym222$FORMAT_NIL_TEST = makeSymbol( "FORMAT-NIL-TEST" );
    $list223 = ConsesLow.list( new SubLObject[] { ConsesLow.list( ConsesLow.list( makeString( "~7,1F" ), makeDouble( 1.999 ) ), makeString( "    2.0" ) ), ConsesLow.list( ConsesLow.list( makeString( "~2,1F" ),
        makeDouble( 1.999 ) ), makeString( "2.0" ) ), ConsesLow.list( ConsesLow.list( makeString( "~4,1F" ), makeDouble( 1.999 ) ), makeString( " 2.0" ) ), ConsesLow.list( ConsesLow.list( makeString( "~4,F" ),
            makeDouble( 1.999 ) ), makeString( " 2.0" ) ), ConsesLow.list( ConsesLow.list( makeString( "~4,F" ), makeDouble( 1.199 ) ), makeString( " 1.2" ) ), ConsesLow.list( ConsesLow.list( makeString( "~2,1F" ),
                makeDouble( 19.999 ) ), makeString( "20.0" ) ), ConsesLow.list( ConsesLow.list( makeString( "~2,1F" ), makeDouble( 99.999 ) ), makeString( "100.0" ) ), ConsesLow.list( ConsesLow.list( makeString(
                    "~1,1F" ), makeDouble( 99.999 ) ), makeString( "100.0" ) ), ConsesLow.list( ConsesLow.list( makeString( "~2,F" ), makeDouble( 99.999 ) ), makeString( "100." ) ), ConsesLow.list( ConsesLow.list(
                        makeString( "~2,F" ), makeDouble( 100.0 ) ), makeString( "100." ) ), ConsesLow.list( ConsesLow.list( makeString( "~2,F" ), makeDouble( 100.5 ) ), makeString( "101." ) ), ConsesLow.list( ConsesLow
                            .list( makeString( "~2,0F" ), makeDouble( 100.5111 ) ), makeString( "101." ) ), ConsesLow.list( ConsesLow.list( makeString( "~2,1F" ), makeDouble( 100.5111 ) ), makeString( "100.5" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "~1,3F" ), makeDouble( 99.999 ) ), makeString( "99.999" ) ), ConsesLow.list( ConsesLow.list( makeString( "~7,3F" ), makeDouble( 99.9 ) ), makeString( " 99.900" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "~7,7F" ), makeDouble( 1.01 ) ), makeString( "1.0100000" ) ), ConsesLow.list( ConsesLow.list( makeString( "~7,8F" ), makeDouble( 99.999 ) ), makeString(
          "99.99900000" ) ), ConsesLow.list( ConsesLow.list( makeString( "~4,2F" ), makeDouble( 6.375 ) ), makeString( "6.38" ) ), ConsesLow.list( ConsesLow.list( makeString( "~2,F" ), makeDouble( 5.2292 ) ), makeString(
              "5." ) ), ConsesLow.list( ConsesLow.list( makeString( "~1,F" ), makeDouble( 5.2292 ) ), makeString( "5." ) ), ConsesLow.list( ConsesLow.list( makeString( "~,F" ), makeDouble( 5.2292 ) ), makeString(
                  "5.2292" ) ), ConsesLow.list( ConsesLow.list( makeString( "~4,F" ), makeDouble( 33.0 ) ), makeString( "33.0" ) ), ConsesLow.list( ConsesLow.list( makeString( "~4,F" ), makeDouble( 11.330999 ) ),
                      makeString( "11.3" ) ), ConsesLow.list( ConsesLow.list( makeString( "~4,F" ), makeDouble( 0.330999 ) ), makeString( ".331" ) ), ConsesLow.list( ConsesLow.list( makeString( "~4,F" ), makeDouble(
                          1.0999 ) ), makeString( " 1.1" ) ), ConsesLow.list( ConsesLow.list( makeString( "~5F" ), makeDouble( 9.9999 ) ), makeString( " 10.0" ) ), ConsesLow.list( ConsesLow.list( makeString( "~5,3F" ),
                              makeDouble( 9.9999 ) ), makeString( "10.000" ) ), ConsesLow.list( ConsesLow.list( makeString( "~,4F" ), makeDouble( 9.99999 ) ), makeString( "10.0000" ) ), ConsesLow.list( ConsesLow.list(
                                  makeString( "~,4F" ), makeDouble( 9.99995 ) ), makeString( "10.0000" ) ), ConsesLow.list( ConsesLow.list( makeString( "~,4F" ), makeDouble( 9.99994 ) ), makeString( "9.9999" ) )
    } );
    $sym224$HEX_INT_FROM_STRING = makeSymbol( "HEX-INT-FROM-STRING" );
    $list225 = ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "0x410bf" ) ), makeInteger( 266431 ) ) );
  }

  public static final class $not_digit_char_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $not_digit_char_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "NOT-DIGIT-CHAR-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return not_digit_char_p( arg1 );
    }
  }

  public static final class $string_wXo_control_charsP$UnaryFunction
      extends
        UnaryFunction
  {
    public $string_wXo_control_charsP$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "STRING-W/O-CONTROL-CHARS?" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return string_wXo_control_charsP( arg1 );
    }
  }

  public static final class $char_in_char_set$UnaryFunction
      extends
        UnaryFunction
  {
    public $char_in_char_set$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CHAR-IN-CHAR-SET" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return char_in_char_set( arg1 );
    }
  }

  public static final class $whitespacep$UnaryFunction
      extends
        UnaryFunction
  {
    public $whitespacep$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "WHITESPACEP" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return whitespacep( arg1 );
    }
  }

  public static final class $cyclify_status_native
      extends
        SubLStructNative
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

    public $cyclify_status_native()
    {
      this.$out_string_list = CommonSymbols.NIL;
      this.$references_added = CommonSymbols.NIL;
      this.$inside_quoteP = CommonSymbols.NIL;
      this.$inside_el_var_nameP = CommonSymbols.NIL;
      this.$already_cyclifiedP = CommonSymbols.NIL;
      this.$escapeP = CommonSymbols.NIL;
      this.$inside_subl_quote_fnP = CommonSymbols.NIL;
      this.$inside_expand_subl_fnP = CommonSymbols.NIL;
      this.$inside_expand_subl_fn_arg1P = CommonSymbols.NIL;
      this.$inside_expand_subl_fn_arg2P = CommonSymbols.NIL;
      this.$immediately_following_parenP = CommonSymbols.NIL;
      this.$paren_count = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $cyclify_status_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$out_string_list;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$references_added;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$inside_quoteP;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$inside_el_var_nameP;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$already_cyclifiedP;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$escapeP;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$inside_subl_quote_fnP;
    }

    @Override
    public SubLObject getField9()
    {
      return this.$inside_expand_subl_fnP;
    }

    @Override
    public SubLObject getField10()
    {
      return this.$inside_expand_subl_fn_arg1P;
    }

    @Override
    public SubLObject getField11()
    {
      return this.$inside_expand_subl_fn_arg2P;
    }

    @Override
    public SubLObject getField12()
    {
      return this.$immediately_following_parenP;
    }

    @Override
    public SubLObject getField13()
    {
      return this.$paren_count;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$out_string_list = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$references_added = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$inside_quoteP = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$inside_el_var_nameP = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$already_cyclifiedP = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$escapeP = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$inside_subl_quote_fnP = value;
    }

    @Override
    public SubLObject setField9(final SubLObject value)
    {
      return this.$inside_expand_subl_fnP = value;
    }

    @Override
    public SubLObject setField10(final SubLObject value)
    {
      return this.$inside_expand_subl_fn_arg1P = value;
    }

    @Override
    public SubLObject setField11(final SubLObject value)
    {
      return this.$inside_expand_subl_fn_arg2P = value;
    }

    @Override
    public SubLObject setField12(final SubLObject value)
    {
      return this.$immediately_following_parenP = value;
    }

    @Override
    public SubLObject setField13(final SubLObject value)
    {
      return this.$paren_count = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $cyclify_status_native.class, $sym129$CYCLIFY_STATUS, $sym130$CYCLIFY_STATUS_P, $list131, $list132, new String[] { "$out_string_list", "$references_added",
        "$inside_quoteP", "$inside_el_var_nameP", "$already_cyclifiedP", "$escapeP", "$inside_subl_quote_fnP", "$inside_expand_subl_fnP", "$inside_expand_subl_fn_arg1P", "$inside_expand_subl_fn_arg2P",
        "$immediately_following_parenP", "$paren_count"
      }, $list133, $list134, $sym135$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $cyclify_status_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $cyclify_status_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CYCLIFY-STATUS-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return cyclify_status_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 2805 ms
 * 
 */