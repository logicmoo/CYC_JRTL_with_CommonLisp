/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.define_obsolete_register;
import static com.cyc.cycjava.cycl.access_macros.defmacro_obsolete_warning;
import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.cfasl.cfasl_encoding_string_stream_encoding;
import static com.cyc.cycjava.cycl.cfasl.cfasl_output;
import static com.cyc.cycjava.cycl.cfasl.close_cfasl_encoding_stream;
import static com.cyc.cycjava.cycl.cfasl.new_cfasl_encoding_stream;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_promotions.copy_file;
import static com.cyc.cycjava.cycl.subl_promotions.ensure_physical_pathname;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_note$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_sofar$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_total$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_backslash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_colon;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_comma;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hyphen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_slash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.alpha_char_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.alphanumericp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.char_code;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.code_char;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.load;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.integerDivide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.max;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.zerop;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.copy_seq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_value;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.sleep;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.function_spec_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.symbolp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.butlast;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.last;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.file_length;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.file_position;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.input_stream_p;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.open_stream_p;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.output_stream_p;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.peek_char;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.read_byte;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.read_char;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.read_line;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.stream_element_type;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.unread_char;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_byte;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_char;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Processes;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      FILE-UTILITIES
 * source file: /cyc/top/cycl/file-utilities.lisp
 * created:     2019/07/03 17:37:15
 */
public final class file_utilities extends SubLTranslatedFile implements V12 {
    static private final SubLString $str_alt15$ = makeString("");

    public static final SubLFile me = new file_utilities();

 public static final String myName = "com.cyc.cycjava.cycl.file_utilities";


    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $default_big_stream_buffer_size$ = makeSymbol("*DEFAULT-BIG-STREAM-BUFFER-SIZE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $default_small_stream_buffer_size$ = makeSymbol("*DEFAULT-SMALL-STREAM-BUFFER-SIZE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $random_path_chars$ = makeSymbol("*RANDOM-PATH-CHARS*");

    private static final SubLInteger $int$4194304 = makeInteger(4194304);

    private static final SubLList $list2 = list(list(makeSymbol("SIZE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $stream_initial_input_buffer_size$ = makeSymbol("*STREAM-INITIAL-INPUT-BUFFER-SIZE*");

    static private final SubLList $list5 = list(list(makeSymbol("*STREAM-INITIAL-OUTPUT-BUFFER-SIZE*"), makeSymbol("*STREAM-INITIAL-INPUT-BUFFER-SIZE*")));

    private static final SubLList $list6 = list(makeSymbol("IGNORE"), makeSymbol("*STREAM-INITIAL-INPUT-BUFFER-SIZE*"), makeSymbol("*STREAM-INITIAL-OUTPUT-BUFFER-SIZE*"));

    private static final SubLList $list7 = list(list(makeSymbol("STREAM"), makeSymbol("FILENAME"), makeSymbol("DIRECTION")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym8$FILENAME_VAR = makeUninternedSymbol("FILENAME-VAR");

    private static final SubLList $list11 = list(NIL);

    private static final SubLSymbol $sym12$FILENAME_VAR = makeUninternedSymbol("FILENAME-VAR");

    private static final SubLSymbol $sym14$FILENAME_VAR = makeUninternedSymbol("FILENAME-VAR");

    private static final SubLSymbol WITH_BINARY_FILE = makeSymbol("WITH-BINARY-FILE");

    private static final SubLSymbol $sym16$FILENAME_VAR = makeUninternedSymbol("FILENAME-VAR");

    private static final SubLSymbol LOAD_FROM_CYC_HOME = makeSymbol("LOAD-FROM-CYC-HOME");

    private static final SubLString $str22$ = makeString("");

    private static final SubLString $str23$_ = makeString(".");

    private static final SubLList $list25 = list(makeString("rck.please.put.this.in.the.right.place"));

    public static final SubLSymbol $temp_directory$ = makeSymbol("*TEMP-DIRECTORY*");

    private static final SubLString $str27$_tmp_ = makeString("/tmp/");

    private static final SubLString $str29$0123456789abcdefghijklmnopqrstuvw = makeString("0123456789abcdefghijklmnopqrstuvwxyz");



    private static final SubLString $$$tmp = makeString("tmp");

    private static final SubLSymbol $IF_DOES_NOT_EXIST = makeKeyword("IF-DOES-NOT-EXIST");

    private static final SubLList $list39 = list(list(makeSymbol("STREAM"), makeSymbol("&KEY"), list(makeSymbol("ELEMENT-TYPE"), $TEXT)), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list40 = list(makeKeyword("ELEMENT-TYPE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol OPEN_TMP_FILE = makeSymbol("OPEN-TMP-FILE");

    static private final SubLList $list48 = list(list(makeSymbol("STREAM"), makeSymbol("FILENAME"), makeSymbol("&KEY"), list(makeSymbol("ELEMENT-TYPE"), $TEXT)), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol COPY_FILE = makeSymbol("COPY-FILE");

    private static final SubLList $list53 = list(list(makeSymbol("FILENAME"), makeSymbol("&KEY"), list(makeSymbol("DIRECTORY"), makeSymbol("*TEMP-DIRECTORY*"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list54 = list(makeKeyword("DIRECTORY"));

    private static final SubLSymbol MAKE_TEMP_FILENAME = makeSymbol("MAKE-TEMP-FILENAME");

    private static final SubLSymbol IGNORE_ERRORS = makeSymbol("IGNORE-ERRORS");

    private static final SubLList $list59 = list(makeSymbol("OPEN-TEMP-FILE"));

    private static final SubLList $list60 = list(list(makeSymbol("STREAM"), makeSymbol("&OPTIONAL"), list(makeSymbol("ELEMENT-TYPE"), $TEXT)), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol WITH_TMP_FILE = makeSymbol("WITH-TMP-FILE");

    private static final SubLList $list62 = list(makeSymbol("WITH-TEMP-FILE"));

    private static final SubLSymbol WITH_TEMP_FILE = makeSymbol("WITH-TEMP-FILE");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLString $str68$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLSymbol READ_CHAR = makeSymbol("READ-CHAR");

    private static final SubLSymbol READ_BYTE = makeSymbol("READ-BYTE");

    private static final SubLSymbol WRITE_BYTE = makeSymbol("WRITE-BYTE");

    private static final SubLString $str75$_S_is_not_a_valid_mode_ = makeString("~S is not a valid mode.");

    private static final SubLList $list77 = list(list(makeSymbol("VAR"), makeSymbol("FILE"), makeSymbol("&OPTIONAL"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym78$INFILE = makeUninternedSymbol("INFILE");

    private static final SubLList $list79 = list(makeKeyword("INPUT"));

    private static final SubLSymbol CDOLINES_GET_NEXT_LINE = makeSymbol("CDOLINES-GET-NEXT-LINE");

    private static final SubLSymbol CDOLINES = makeSymbol("CDOLINES");

    private static final SubLList $list85 = list(list(makeSymbol("LINE-VAR"), makeSymbol("STREAM"), makeSymbol("&KEY"), makeSymbol("LINE-NUMBER"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list86 = list(makeKeyword("LINE-NUMBER"), $DONE);

    private static final SubLSymbol $sym89$LINE_NUMBER_VAR = makeUninternedSymbol("LINE-NUMBER-VAR");

    private static final SubLSymbol DO_STREAM_LINES = makeSymbol("DO-STREAM-LINES");

    private static final SubLSymbol $sym91$STREAM_VAR = makeUninternedSymbol("STREAM-VAR");

    private static final SubLSymbol $sym93$1_ = makeSymbol("1+");

    private static final SubLSymbol DO_STREAM_LINES_GET_NEXT_LINE = makeSymbol("DO-STREAM-LINES-GET-NEXT-LINE");

    static private final SubLList $list95 = list(list(makeSymbol("LINE-VAR"), makeSymbol("FILE"), makeSymbol("&KEY"), makeSymbol("LINE-NUMBER"), makeSymbol("PROGRESS-MESSAGE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list96 = list(makeKeyword("LINE-NUMBER"), makeKeyword("PROGRESS-MESSAGE"), $DONE);

    private static final SubLSymbol $sym98$FILE_VAR = makeUninternedSymbol("FILE-VAR");

    private static final SubLSymbol $sym99$STREAM_VAR = makeUninternedSymbol("STREAM-VAR");

    private static final SubLSymbol $sym100$FILE_VAR = makeUninternedSymbol("FILE-VAR");

    private static final SubLSymbol $sym101$STREAM_VAR = makeUninternedSymbol("STREAM-VAR");

    private static final SubLSymbol $sym102$LENGTH_VAR = makeUninternedSymbol("LENGTH-VAR");

    private static final SubLSymbol FILE_LENGTH = makeSymbol("FILE-LENGTH");

    private static final SubLSymbol FILE_POSITION = makeSymbol("FILE-POSITION");

    static private final SubLList $list108 = list(list(makeSymbol("TOKENIZED-LINE"), makeSymbol("FILE"), makeSymbol("&KEY"), list(makeSymbol("BREAK-LIST"), list(QUOTE, list(makeSymbol("LIST"), CHAR_comma))), list(makeSymbol("EMBED-LIST"), list(QUOTE, list(makeSymbol("LIST"), list(makeSymbol("LIST"), makeString("\""), makeString("\""))))), makeSymbol("INCLUDE-STOPS"), makeSymbol("IGNORE-EMPTY-STRINGS"), list(makeSymbol("QUOTE-CHARS"), list(QUOTE, list(makeSymbol("LIST"), CHAR_backslash)))), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list109 = list(makeKeyword("BREAK-LIST"), makeKeyword("EMBED-LIST"), makeKeyword("INCLUDE-STOPS"), makeKeyword("IGNORE-EMPTY-STRINGS"), makeKeyword("QUOTE-CHARS"));

    private static final SubLList $list111 = list(makeSymbol("LIST"), CHAR_comma);

    private static final SubLList $list113 = list(makeSymbol("LIST"), list(makeSymbol("LIST"), makeString("\""), makeString("\"")));

    private static final SubLSymbol $IGNORE_EMPTY_STRINGS = makeKeyword("IGNORE-EMPTY-STRINGS");

    private static final SubLList $list117 = list(makeSymbol("LIST"), CHAR_backslash);

    private static final SubLSymbol $sym118$LINE = makeUninternedSymbol("LINE");

    private static final SubLSymbol DO_FILE_LINES = makeSymbol("DO-FILE-LINES");

    private static final SubLSymbol STRING_TOKENIZE = makeSymbol("STRING-TOKENIZE");

    private static final SubLList $list121 = list(list(makeSymbol("FILE"), makeSymbol("&KEY"), list(makeSymbol("BREAK-LIST"), list(QUOTE, list(makeSymbol("MAPCAR"), list(makeSymbol("FUNCTION"), makeSymbol("TO-STRING")), list(makeSymbol("WHITESPACE-CHARS"))))), makeSymbol("EMBED-LIST"), makeSymbol("INCLUDE-STOPS"), list(makeSymbol("IGNORE-EMPTY-STRINGS"), T), makeSymbol("QUOTE-CHARS")), makeSymbol("LAMBDA-LIST"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list122 = list(makeSymbol("MAPCAR"), list(makeSymbol("FUNCTION"), makeSymbol("TO-STRING")), list(makeSymbol("WHITESPACE-CHARS")));

    private static final SubLSymbol $sym123$LINE = makeUninternedSymbol("LINE");

    private static final SubLList $list126 = list(makeSymbol("FUNCTION"), makeSymbol("READ-FROM-STRING"));

    private static final SubLSymbol $sym127$LINE = makeUninternedSymbol("LINE");

    private static final SubLSymbol $sym128$LINE_INDEX = makeUninternedSymbol("LINE-INDEX");

    private static final SubLSymbol $sym129$DONE_INT = makeUninternedSymbol("DONE-INT");

    private static final SubLList $list130 = list(ZERO_INTEGER);

    private static final SubLList $list131 = list(list(QUOTE, NIL));

    private static final SubLSymbol $sym133$_ = makeSymbol("<");

    private static final SubLList $list136 = list(makeSymbol("ITEM"), makeSymbol("TEMP-LINE-INDEX"));

    private static final SubLList $list141 = list(makeSymbol("TEMP-LINE-INDEX"));

    private static final SubLList $list144 = list(list(makeSymbol("RECORD"), makeSymbol("FILE"), makeSymbol("&OPTIONAL"), list(makeSymbol("SEPARATOR-TEST"), list(makeSymbol("FUNCTION"), makeSymbol("WHITESPACE-STRING?"))), list(makeSymbol("IGNORE-TEST"), list(makeSymbol("FUNCTION"), makeSymbol("FALSE")))), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym145$WHITESPACE_STRING_ = makeSymbol("WHITESPACE-STRING?");

    private static final SubLSymbol $sym147$INSTREAM = makeUninternedSymbol("INSTREAM");

    private static final SubLSymbol $sym148$LINE = makeUninternedSymbol("LINE");

    private static final SubLSymbol NETWORK_READ_LINE = makeSymbol("NETWORK-READ-LINE");

    static private final SubLList $list151 = list(NIL, NIL);

    private static final SubLList $list153 = list(list(makeSymbol("FILE-VAR"), makeSymbol("DIRECTORY"), makeSymbol("&KEY"), list(makeSymbol("INCLUDE-DIRECTORY?"), T), makeSymbol("PROGRESS-MESSAGE"), makeSymbol("DONE"), makeSymbol("SORT-FN")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list154 = list(makeKeyword("INCLUDE-DIRECTORY?"), makeKeyword("PROGRESS-MESSAGE"), $DONE, makeKeyword("SORT-FN"));

    private static final SubLSymbol $kw155$INCLUDE_DIRECTORY_ = makeKeyword("INCLUDE-DIRECTORY?");

    private static final SubLSymbol $sym157$DIRECTORY_CONTENTS_VAR = makeUninternedSymbol("DIRECTORY-CONTENTS-VAR");

    private static final SubLSymbol $sym158$PROGRESS_MESSAGE_VAR = makeUninternedSymbol("PROGRESS-MESSAGE-VAR");

    static private final SubLList $list160 = list(makeSymbol("DIRECTORY-P"));

    private static final SubLSymbol $silent_progressP$ = makeSymbol("*SILENT-PROGRESS?*");

    private static final SubLSymbol PROGRESS_CSOME = makeSymbol("PROGRESS-CSOME");

    private static final SubLList $list167 = list(list(makeSymbol("SUBDIRECTORY"), makeSymbol("DIRECTORY"), makeSymbol("&KEY"), list(makeSymbol("INCLUDE-DIRECTORY?"), T)), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list168 = list(makeKeyword("INCLUDE-DIRECTORY?"));

    private static final SubLSymbol DO_DIRECTORY_CONTENTS = makeSymbol("DO-DIRECTORY-CONTENTS");

    private static final SubLList $list173 = list(makeString("/"));

    private static final SubLString $str175$_ = makeString("/");

    private static final SubLSymbol LAST_CHAR = makeSymbol("LAST-CHAR");

    private static final SubLList $list177 = list(CHAR_slash);

    static private final SubLList $list178 = list(list(makeSymbol("FILE-VAR"), makeSymbol("DIRECTORY"), makeSymbol("&KEY"), list(makeSymbol("INCLUDE-DIRECTORY?"), T), list(makeSymbol("PROGRESS-MESSAGE"), makeString("Processing directory tree files..."))), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list179 = list(makeKeyword("INCLUDE-DIRECTORY?"), makeKeyword("PROGRESS-MESSAGE"));

    private static final SubLString $str180$Processing_directory_tree_files__ = makeString("Processing directory tree files...");

    private static final SubLSymbol $sym181$DIRECTORY_LIST_VAR = makeUninternedSymbol("DIRECTORY-LIST-VAR");

    private static final SubLSymbol $sym182$CURRENT_DIRECTORY_VAR = makeUninternedSymbol("CURRENT-DIRECTORY-VAR");

    private static final SubLString $str188$___Directory___S = makeString("~% Directory: ~S");

    private static final SubLString $$$cdolist = makeString("cdolist");

    private static final SubLSymbol FILE_WRITE_DATE = makeSymbol("FILE-WRITE-DATE");

    private static final SubLString $str192$_ = makeString("\\");

    private static final SubLList $list193 = list(makeString("/"), makeString("\\"));

    private static final SubLString $str194$Could_not_find__A = makeString("Could not find ~A");

    private static final SubLString $str195$Could_not_find__A_A = makeString("Could not find ~A~A");

    private static final SubLString $str196$File_not_found_ = makeString("File not found.");

    private static final SubLString $str197$File_not_found_from_directory__A = makeString("File not found from directory ~A");

    private static final SubLString $str200$__ = makeString("\\\\");

    private static final SubLString $str202$_ = makeString(":");

    private static final SubLString $str203$Path_type_mismatch_ = makeString("Path type mismatch.");

    private static final SubLString $str204$__ = makeString("..");

    private static final SubLString $str205$Cannot_make_relative_path__A_even = makeString("Cannot make relative path ~A even more relative ....");

    private static final SubLString $str206$Cannot_strip_non_absolute_prefix_ = makeString("Cannot strip non-absolute prefix ~A from path ~A.");

    private static final SubLString $str207$_ = makeString("-");

    private static final SubLString $str208$Warning__unable_to_read_file__s__ = makeString("Warning: unable to read file ~s~%");

    private static final SubLString $str209$make_directory_recursive__could_n = makeString("make-directory-recursive: could not create ~A since it exists as a file.");

    private static final SubLString $str210$Able_to_create_directory__A__but_ = makeString("Able to create directory ~A, but unable to set permissions.");

    private static final SubLString $$$chmod = makeString("chmod");

    private static final SubLString $$$ln = makeString("ln");

    private static final SubLString $str213$_s = makeString("-s");

    private static final SubLString $str214$Copy_of__A_to__A_failed___A_has__ = makeString("Copy of ~A to ~A failed; ~A has ~A bytes, but ~A has ~A.~%");

    private static final SubLString $str215$I_m_alive___ = makeString("I'm alive!~%");

    private static final SubLString $str216$Could_not_make_directory__a_with_ = makeString("Could not make directory ~a with path ~a");

    private static final SubLString $str217$File_already_exists___A__ = makeString("File already exists: ~A~%");

    private static final SubLSymbol OPEN_BINARY = makeSymbol("OPEN-BINARY");

    private static final SubLString $str221$Cannot_open__A_for_writing___ = makeString("Cannot open ~A for writing.~%");

    private static final SubLSymbol FILE_ACCUMULATOR_RESET = makeSymbol("FILE-ACCUMULATOR-RESET");

    private static final SubLSymbol FILE_ACCUMULATOR_ADD = makeSymbol("FILE-ACCUMULATOR-ADD");

    private static final SubLSymbol FILE_ACCUMULATOR_SIZE = makeSymbol("FILE-ACCUMULATOR-SIZE");

    private static final SubLSymbol FILE_ACCUMULATOR_CONTENTS = makeSymbol("FILE-ACCUMULATOR-CONTENTS");

    private static final SubLSymbol FILE_ACCUMULATOR_ITERATOR = makeSymbol("FILE-ACCUMULATOR-ITERATOR");

    private static final SubLList $list230 = list(list(makeSymbol("STATE"), makeSymbol("STREAM"), makeSymbol("WRITER"), makeSymbol("ITEM-COUNT")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym231$_KEY = makeSymbol("&KEY");

    private static final SubLList $list232 = list(makeSymbol("&KEY"), makeSymbol("STREAM"), makeSymbol("WRITER"), makeSymbol("ITEM-COUNT"));

    private static final SubLList $list233 = list(makeKeyword("STREAM"), makeKeyword("WRITER"), makeKeyword("ITEM-COUNT"));

    private static final SubLString $str234$Operation_not_supported_for_file_ = makeString("Operation not supported for file accumulator ~A.");

    private static final SubLString $str235$Operation_not_yet_supported_for_f = makeString("Operation not yet supported for file accumulator ~A");

    private static final SubLSymbol TEST_GET_BINARY_DATA_FROM_STREAM = makeSymbol("TEST-GET-BINARY-DATA-FROM-STREAM");

    private static final SubLList $list243 = list(list(list(list(makeString("abc"), makeInteger(123), list(ONE_INTEGER, TWO_INTEGER, THREE_INTEGER))), makeKeyword("SUCCESS")));

    private static final SubLString $str244$Expected__S__which_is___A__A__of_ = makeString("Expected ~S, which is [~A,~A) of ~S, got ~S back.");

    private static final SubLList $list247 = list(list(makeSymbol("*SHOULD-MEMORY-MAP-FILES?*", "SUBLISP"), T));

    private static final SubLList $list248 = list(list(makeSymbol("*SHOULD-MEMORY-MAP-FILES?*", "SUBLISP")));

    private static final SubLString $str249$ads65jh3_ = makeString("ads65jh3/");

    private static final SubLString $str250$Couldn_t_test_creation_of__S__as_ = makeString("Couldn't test creation of ~S, as it already is a known directory");

    private static final SubLString $str251$Failed_to_create_or_delete__S = makeString("Failed to create or delete ~S");

    private static final SubLString $$$ds6sdg32 = makeString("ds6sdg32");

    private static final SubLString $str253$Couldn_t_test_creation_and_deleti = makeString("Couldn't test creation and deletion of subdirectories in ~S, as it is not known to be a directory");

    private static final SubLList $list254 = list(makeString("data"));

    private static final SubLString $$$ads65jh3 = makeString("ads65jh3");

    private static final SubLSymbol TEST_DIRECTORY_CREATION_AND_DELETION = makeSymbol("TEST-DIRECTORY-CREATION-AND-DELETION");

    private static final SubLList $list257 = list(list(NIL, T));

    static final boolean assertionsDisabledSynth = true;

    public static SubLObject with_stream_buffer_size(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list2);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject size = NIL;
        destructuring_bind_must_consp(current, datum, $list2);
        size = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CLET, bq_cons(list($stream_initial_input_buffer_size$, size), $list5), $list6, append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list2);
        return NIL;
    }

    // Definitions
    public static final SubLObject possibly_with_text_file_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject stream = NIL;
                    SubLObject filename = NIL;
                    SubLObject direction = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt0);
                    stream = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt0);
                    filename = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt0);
                    direction = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject filename_var = $sym1$FILENAME_VAR;
                            return list(CLET, list(list(filename_var, filename)), list(PIF, filename_var, listS(WITH_TEXT_FILE, list(stream, filename_var, direction), append(body, NIL)), listS(CLET, list(bq_cons(stream, $list_alt5)), append(body, NIL))));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt0);
                    }
                }
            }
        }
        return NIL;
    }

    // Definitions
    public static SubLObject possibly_with_text_file(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list7);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject stream = NIL;
        SubLObject filename = NIL;
        SubLObject direction = NIL;
        destructuring_bind_must_consp(current, datum, $list7);
        stream = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list7);
        filename = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list7);
        direction = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject filename_var = $sym8$FILENAME_VAR;
            return list(CLET, list(list(filename_var, filename)), list(PIF, filename_var, listS(WITH_TEXT_FILE, list(stream, filename_var, direction), append(body, NIL)), listS(CLET, list(bq_cons(stream, $list11)), append(body, NIL))));
        }
        cdestructuring_bind_error(datum, $list7);
        return NIL;
    }

    public static final SubLObject possibly_with_private_text_file_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject stream = NIL;
                    SubLObject filename = NIL;
                    SubLObject direction = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt0);
                    stream = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt0);
                    filename = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt0);
                    direction = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject filename_var = $sym6$FILENAME_VAR;
                            return list(CLET, list(list(filename_var, filename)), list(PIF, filename_var, listS(WITH_PRIVATE_TEXT_FILE, list(stream, filename_var, direction), append(body, NIL)), listS(CLET, list(bq_cons(stream, $list_alt5)), append(body, NIL))));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt0);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject possibly_with_private_text_file(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list7);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject stream = NIL;
        SubLObject filename = NIL;
        SubLObject direction = NIL;
        destructuring_bind_must_consp(current, datum, $list7);
        stream = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list7);
        filename = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list7);
        direction = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject filename_var = $sym12$FILENAME_VAR;
            return list(CLET, list(list(filename_var, filename)), list(PIF, filename_var, listS(WITH_PRIVATE_TEXT_FILE, list(stream, filename_var, direction), append(body, NIL)), listS(CLET, list(bq_cons(stream, $list11)), append(body, NIL))));
        }
        cdestructuring_bind_error(datum, $list7);
        return NIL;
    }

    public static final SubLObject possibly_with_binary_file_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject stream = NIL;
                    SubLObject filename = NIL;
                    SubLObject direction = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt0);
                    stream = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt0);
                    filename = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt0);
                    direction = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject filename_var = $sym8$FILENAME_VAR;
                            return list(CLET, list(list(filename_var, filename)), list(PIF, filename_var, listS(WITH_BINARY_FILE, list(stream, filename_var, direction), append(body, NIL)), listS(CLET, list(bq_cons(stream, $list_alt5)), append(body, NIL))));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt0);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject possibly_with_binary_file(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list7);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject stream = NIL;
        SubLObject filename = NIL;
        SubLObject direction = NIL;
        destructuring_bind_must_consp(current, datum, $list7);
        stream = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list7);
        filename = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list7);
        direction = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject filename_var = $sym14$FILENAME_VAR;
            return list(CLET, list(list(filename_var, filename)), list(PIF, filename_var, listS(WITH_BINARY_FILE, list(stream, filename_var, direction), append(body, NIL)), listS(CLET, list(bq_cons(stream, $list11)), append(body, NIL))));
        }
        cdestructuring_bind_error(datum, $list7);
        return NIL;
    }

    public static final SubLObject possibly_with_private_binary_file_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject stream = NIL;
                    SubLObject filename = NIL;
                    SubLObject direction = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt0);
                    stream = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt0);
                    filename = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt0);
                    direction = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject filename_var = $sym10$FILENAME_VAR;
                            return list(CLET, list(list(filename_var, filename)), list(PIF, filename_var, listS(WITH_PRIVATE_BINARY_FILE, list(stream, filename_var, direction), append(body, NIL)), listS(CLET, list(bq_cons(stream, $list_alt5)), append(body, NIL))));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt0);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject possibly_with_private_binary_file(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list7);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject stream = NIL;
        SubLObject filename = NIL;
        SubLObject direction = NIL;
        destructuring_bind_must_consp(current, datum, $list7);
        stream = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list7);
        filename = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list7);
        direction = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject filename_var = $sym16$FILENAME_VAR;
            return list(CLET, list(list(filename_var, filename)), list(PIF, filename_var, listS(WITH_PRIVATE_BINARY_FILE, list(stream, filename_var, direction), append(body, NIL)), listS(CLET, list(bq_cons(stream, $list11)), append(body, NIL))));
        }
        cdestructuring_bind_error(datum, $list7);
        return NIL;
    }

    /**
     * Like PEEK-CHAR, except return the character as a byte.
     */
    @LispMethod(comment = "Like PEEK-CHAR, except return the character as a byte.")
    public static final SubLObject peek_byte_from_char_stream_alt(SubLObject stream, SubLObject eof_error_p, SubLObject eof_value) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_input$.getDynamicValue();
        }
        if (eof_error_p == UNPROVIDED) {
            eof_error_p = T;
        }
        if (eof_value == UNPROVIDED) {
            eof_value = NIL;
        }
        {
            SubLObject byte_as_char = peek_char(NIL, stream, NIL, $EOF, UNPROVIDED);
            if ($EOF != byte_as_char) {
                return char_code(byte_as_char);
            }
            if (NIL == eof_error_p) {
                return eof_value;
            }
            return peek_char(NIL, stream, T, eof_value, UNPROVIDED);
        }
    }

    /**
     * Like PEEK-CHAR, except return the character as a byte.
     */
    @LispMethod(comment = "Like PEEK-CHAR, except return the character as a byte.")
    public static SubLObject peek_byte_from_char_stream(SubLObject stream, SubLObject eof_error_p, SubLObject eof_value) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_input$.getDynamicValue();
        }
        if (eof_error_p == UNPROVIDED) {
            eof_error_p = T;
        }
        if (eof_value == UNPROVIDED) {
            eof_value = NIL;
        }
        final SubLObject byte_as_char = peek_char(NIL, stream, NIL, $EOF, UNPROVIDED);
        if ($EOF != byte_as_char) {
            return char_code(byte_as_char);
        }
        if (NIL == eof_error_p) {
            return eof_value;
        }
        return peek_char(NIL, stream, T, eof_value, UNPROVIDED);
    }

    /**
     * Like READ-CHAR, except return the character as a byte.
     */
    @LispMethod(comment = "Like READ-CHAR, except return the character as a byte.")
    public static final SubLObject read_byte_from_char_stream_alt(SubLObject stream, SubLObject eof_error_p, SubLObject eof_value) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_input$.getDynamicValue();
        }
        if (eof_error_p == UNPROVIDED) {
            eof_error_p = T;
        }
        if (eof_value == UNPROVIDED) {
            eof_value = NIL;
        }
        {
            SubLObject byte_as_char = read_char(stream, NIL, $EOF, UNPROVIDED);
            if ($EOF != byte_as_char) {
                return char_code(byte_as_char);
            }
            if (NIL == eof_error_p) {
                return eof_value;
            }
            return read_char(stream, T, eof_value, UNPROVIDED);
        }
    }

    /**
     * Like READ-CHAR, except return the character as a byte.
     */
    @LispMethod(comment = "Like READ-CHAR, except return the character as a byte.")
    public static SubLObject read_byte_from_char_stream(SubLObject stream, SubLObject eof_error_p, SubLObject eof_value) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_input$.getDynamicValue();
        }
        if (eof_error_p == UNPROVIDED) {
            eof_error_p = T;
        }
        if (eof_value == UNPROVIDED) {
            eof_value = NIL;
        }
        final SubLObject byte_as_char = read_char(stream, NIL, $EOF, UNPROVIDED);
        if ($EOF != byte_as_char) {
            return char_code(byte_as_char);
        }
        if (NIL == eof_error_p) {
            return eof_value;
        }
        return read_char(stream, T, eof_value, UNPROVIDED);
    }

    /**
     * Like UNREAD-CHAR, except take the character as a byte.
     */
    @LispMethod(comment = "Like UNREAD-CHAR, except take the character as a byte.")
    public static final SubLObject unread_byte_from_char_stream_alt(SubLObject v_byte, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_input$.getDynamicValue();
        }
        {
            SubLObject byte_as_char = code_char(v_byte);
            return unread_char(byte_as_char, stream);
        }
    }

    /**
     * Like UNREAD-CHAR, except take the character as a byte.
     */
    @LispMethod(comment = "Like UNREAD-CHAR, except take the character as a byte.")
    public static SubLObject unread_byte_from_char_stream(final SubLObject v_byte, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_input$.getDynamicValue();
        }
        final SubLObject byte_as_char = code_char(v_byte);
        return unread_char(byte_as_char, stream);
    }

    /**
     * Like WRITE-CHAR, except take the character as a byte.
     */
    @LispMethod(comment = "Like WRITE-CHAR, except take the character as a byte.")
    public static final SubLObject write_byte_to_char_stream_alt(SubLObject v_byte, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        {
            SubLObject byte_as_char = code_char(v_byte);
            return write_char(byte_as_char, stream);
        }
    }

    /**
     * Like WRITE-CHAR, except take the character as a byte.
     */
    @LispMethod(comment = "Like WRITE-CHAR, except take the character as a byte.")
    public static SubLObject write_byte_to_char_stream(final SubLObject v_byte, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLObject byte_as_char = code_char(v_byte);
        return write_char(byte_as_char, stream);
    }

    /**
     * Return T IFF OBJECT is a stream, T, or NIL -- basically, a valid destination
     * argument to SubL's FORMAT.
     */
    @LispMethod(comment = "Return T IFF OBJECT is a stream, T, or NIL -- basically, a valid destination\r\nargument to SubL\'s FORMAT.\nReturn T IFF OBJECT is a stream, T, or NIL -- basically, a valid destination\nargument to SubL\'s FORMAT.")
    public static final SubLObject stream_designator_p_alt(SubLObject v_object) {
        return makeBoolean((v_object.isStream() || (v_object == T)) || (v_object == NIL));
    }

    /**
     * Return T IFF OBJECT is a stream, T, or NIL -- basically, a valid destination
     * argument to SubL's FORMAT.
     */
    @LispMethod(comment = "Return T IFF OBJECT is a stream, T, or NIL -- basically, a valid destination\r\nargument to SubL\'s FORMAT.\nReturn T IFF OBJECT is a stream, T, or NIL -- basically, a valid destination\nargument to SubL\'s FORMAT.")
    public static SubLObject stream_designator_p(final SubLObject v_object) {
        return makeBoolean((v_object.isStream() || (v_object == T)) || (v_object == NIL));
    }

    /**
     * Return whether OBJECT is a designator for a pathname.  It could be either a string, a stream associated with a file, or a pathname (denoting itself).
     */
    @LispMethod(comment = "Return whether OBJECT is a designator for a pathname.  It could be either a string, a stream associated with a file, or a pathname (denoting itself).")
    public static final SubLObject pathname_designator_p_alt(SubLObject v_object) {
        {
            SubLObject error = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                        try {
                            Filesys.probe_file(v_object);
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            }
            return sublisp_null(error);
        }
    }

    /**
     * Return whether OBJECT is a designator for a pathname.  It could be either a string, a stream associated with a file, or a pathname (denoting itself).
     */
    @LispMethod(comment = "Return whether OBJECT is a designator for a pathname.  It could be either a string, a stream associated with a file, or a pathname (denoting itself).")
    public static SubLObject pathname_designator_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject error = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    Filesys.probe_file(v_object);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        return sublisp_null(error);
    }

    public static SubLObject load_from_cyc_home(final SubLObject filename) {
        return load(cyc_home_filename(NIL, filename, UNPROVIDED));
    }

    /**
     * construct a full filename relative to the *CYC-HOME-DIRECTORY*
     * SUBDIRECTORY-LIST is the relative subdirectory
     * FILENAME and EXTENSION are used for the file in the directory
     */
    @LispMethod(comment = "construct a full filename relative to the *CYC-HOME-DIRECTORY*\r\nSUBDIRECTORY-LIST is the relative subdirectory\r\nFILENAME and EXTENSION are used for the file in the directory\nconstruct a full filename relative to the *CYC-HOME-DIRECTORY*\nSUBDIRECTORY-LIST is the relative subdirectory\nFILENAME and EXTENSION are used for the file in the directory")
    public static final SubLObject cyc_home_filename_alt(SubLObject subdirectory_list, SubLObject filename, SubLObject extension) {
        if (extension == UNPROVIDED) {
            extension = NIL;
        }
        SubLTrampolineFile.checkType(subdirectory_list, LISTP);
        return com.cyc.cycjava.cycl.file_utilities.relative_filename(system_info.$cyc_home_directory$.getGlobalValue(), Filesys.construct_filename(subdirectory_list, filename, extension, T), UNPROVIDED);
    }

    /**
     * construct a full filename relative to the *CYC-HOME-DIRECTORY*
     * SUBDIRECTORY-LIST is the relative subdirectory
     * FILENAME and EXTENSION are used for the file in the directory
     */
    @LispMethod(comment = "construct a full filename relative to the *CYC-HOME-DIRECTORY*\r\nSUBDIRECTORY-LIST is the relative subdirectory\r\nFILENAME and EXTENSION are used for the file in the directory\nconstruct a full filename relative to the *CYC-HOME-DIRECTORY*\nSUBDIRECTORY-LIST is the relative subdirectory\nFILENAME and EXTENSION are used for the file in the directory")
    public static SubLObject cyc_home_filename(final SubLObject subdirectory_list, final SubLObject filename, SubLObject extension) {
        if (extension == UNPROVIDED) {
            extension = NIL;
        }
        assert NIL != listp(subdirectory_list) : "! listp(subdirectory_list) " + ("Types.listp(subdirectory_list) " + "CommonSymbols.NIL != Types.listp(subdirectory_list) ") + subdirectory_list;
        return relative_filename(system_info.$cyc_home_directory$.getGlobalValue(), Filesys.construct_filename(subdirectory_list, filename, extension, T), UNPROVIDED);
    }

    /**
     * construct a pathname relative to the *CYC-HOME-DIRECTORY*
     * SUBDIRECTORY-LIST is the relative subdirectory
     */
    @LispMethod(comment = "construct a pathname relative to the *CYC-HOME-DIRECTORY*\r\nSUBDIRECTORY-LIST is the relative subdirectory\nconstruct a pathname relative to the *CYC-HOME-DIRECTORY*\nSUBDIRECTORY-LIST is the relative subdirectory")
    public static final SubLObject cyc_home_subdirectory_alt(SubLObject subdirectory_list) {
        SubLTrampolineFile.checkType(subdirectory_list, LISTP);
        return com.cyc.cycjava.cycl.file_utilities.relative_filename(system_info.$cyc_home_directory$.getGlobalValue(), Filesys.construct_filename(subdirectory_list, $str_alt15$, NIL, T), UNPROVIDED);
    }

    /**
     * construct a pathname relative to the *CYC-HOME-DIRECTORY*
     * SUBDIRECTORY-LIST is the relative subdirectory
     */
    @LispMethod(comment = "construct a pathname relative to the *CYC-HOME-DIRECTORY*\r\nSUBDIRECTORY-LIST is the relative subdirectory\nconstruct a pathname relative to the *CYC-HOME-DIRECTORY*\nSUBDIRECTORY-LIST is the relative subdirectory")
    public static SubLObject cyc_home_subdirectory(final SubLObject subdirectory_list) {
        assert NIL != listp(subdirectory_list) : "! listp(subdirectory_list) " + ("Types.listp(subdirectory_list) " + "CommonSymbols.NIL != Types.listp(subdirectory_list) ") + subdirectory_list;
        return relative_filename(system_info.$cyc_home_directory$.getGlobalValue(), Filesys.construct_filename(subdirectory_list, $str22$, NIL, T), UNPROVIDED);
    }

    /**
     * Return the canonical working directory of the current directory
     * of the CYC server.
     *
     * @return STRINGP
     */
    @LispMethod(comment = "Return the canonical working directory of the current directory\r\nof the CYC server.\r\n\r\n@return STRINGP\nReturn the canonical working directory of the current directory\nof the CYC server.")
    public static final SubLObject canonical_cyc_working_directory_alt() {
        return string_utilities.to_string(Filesys.probe_file($str_alt16$_));
    }

    /**
     * Return the canonical working directory of the current directory
     * of the CYC server.
     *
     * @return STRINGP
     */
    @LispMethod(comment = "Return the canonical working directory of the current directory\r\nof the CYC server.\r\n\r\n@return STRINGP\nReturn the canonical working directory of the current directory\nof the CYC server.")
    public static SubLObject canonical_cyc_working_directory() {
        return string_utilities.to_string(Filesys.probe_file($str23$_));
    }

    /**
     * construct a full filename relative to the DIRECTORY-STRING from FILENAME and EXTENSION
     * DIRECTORY-STRING should include the appropriate directory separator character at the end
     */
    @LispMethod(comment = "construct a full filename relative to the DIRECTORY-STRING from FILENAME and EXTENSION\r\nDIRECTORY-STRING should include the appropriate directory separator character at the end\nconstruct a full filename relative to the DIRECTORY-STRING from FILENAME and EXTENSION\nDIRECTORY-STRING should include the appropriate directory separator character at the end")
    public static final SubLObject relative_filename_alt(SubLObject directory_string, SubLObject filename, SubLObject extension) {
        if (extension == UNPROVIDED) {
            extension = NIL;
        }
        SubLTrampolineFile.checkType(directory_string, STRINGP);
        return cconcatenate(directory_string, com.cyc.cycjava.cycl.file_utilities.basic_filename(filename, extension));
    }

    /**
     * construct a full filename relative to the DIRECTORY-STRING from FILENAME and EXTENSION
     * DIRECTORY-STRING should include the appropriate directory separator character at the end
     */
    @LispMethod(comment = "construct a full filename relative to the DIRECTORY-STRING from FILENAME and EXTENSION\r\nDIRECTORY-STRING should include the appropriate directory separator character at the end\nconstruct a full filename relative to the DIRECTORY-STRING from FILENAME and EXTENSION\nDIRECTORY-STRING should include the appropriate directory separator character at the end")
    public static SubLObject relative_filename(final SubLObject directory_string, final SubLObject filename, SubLObject extension) {
        if (extension == UNPROVIDED) {
            extension = NIL;
        }
        assert NIL != stringp(directory_string) : "! stringp(directory_string) " + ("Types.stringp(directory_string) " + "CommonSymbols.NIL != Types.stringp(directory_string) ") + directory_string;
        return cconcatenate(directory_string, basic_filename(filename, extension));
    }

    /**
     * construct a filename with no directory component from FILENAME and EXTENSION
     */
    @LispMethod(comment = "construct a filename with no directory component from FILENAME and EXTENSION")
    public static final SubLObject basic_filename_alt(SubLObject filename, SubLObject extension) {
        if (extension == UNPROVIDED) {
            extension = NIL;
        }
        if (NIL == extension) {
            return filename;
        }
        return Filesys.construct_filename(NIL, filename, extension, T);
    }

    /**
     * construct a filename with no directory component from FILENAME and EXTENSION
     */
    @LispMethod(comment = "construct a filename with no directory component from FILENAME and EXTENSION")
    public static SubLObject basic_filename(final SubLObject filename, SubLObject extension) {
        if (extension == UNPROVIDED) {
            extension = NIL;
        }
        if (NIL == extension) {
            return filename;
        }
        return Filesys.construct_filename(NIL, filename, extension, T);
    }

    public static final SubLObject temp_directory_alt() {
        return $temp_directory$.getGlobalValue();
    }

    public static SubLObject temp_directory() {
        final SubLObject temp_dir = subl_promotions.get_temp_directory();
        if (NIL != temp_dir) {
            return possibly_append_path_separator_char(temp_dir);
        }
        return $temp_directory$.getGlobalValue();
    }

    public static final SubLObject random_path_char_alt() {
        return Strings.sublisp_char($random_path_chars$.getGlobalValue(), random.random($int$36));
    }

    public static SubLObject random_path_char() {
        return Strings.sublisp_char($random_path_chars$.getGlobalValue(), random.random($int$36));
    }

    /**
     * Return a randomly chosen filename that uses the directory DIRECTORY-STRING
     */
    @LispMethod(comment = "Return a randomly chosen filename that uses the directory DIRECTORY-STRING")
    public static final SubLObject make_temp_filename_alt(SubLObject directory_string) {
        if (directory_string == UNPROVIDED) {
            directory_string = $temp_directory$.getGlobalValue();
        }
        SubLTrampolineFile.checkType(directory_string, STRINGP);
        {
            SubLObject filename = com.cyc.cycjava.cycl.file_utilities.random_filename_part(EIGHT_INTEGER);
            return com.cyc.cycjava.cycl.file_utilities.relative_filename(directory_string, filename, $$$tmp);
        }
    }

    /**
     * Return a randomly chosen filename that uses the directory DIRECTORY-STRING
     */
    @LispMethod(comment = "Return a randomly chosen filename that uses the directory DIRECTORY-STRING")
    public static SubLObject make_temp_filename(SubLObject directory_string) {
        if (directory_string == UNPROVIDED) {
            directory_string = $temp_directory$.getGlobalValue();
        }
        assert NIL != stringp(directory_string) : "! stringp(directory_string) " + ("Types.stringp(directory_string) " + "CommonSymbols.NIL != Types.stringp(directory_string) ") + directory_string;
        final SubLObject filename = random_filename_part(EIGHT_INTEGER);
        return relative_filename(possibly_append_path_separator_char(directory_string), filename, $$$tmp);
    }

    /**
     * Get a string with LENGTH number of characters randomly chosen from RANDOM-PATH-CHARS.
     *
     * @return STRINGP
     */
    @LispMethod(comment = "Get a string with LENGTH number of characters randomly chosen from RANDOM-PATH-CHARS.\r\n\r\n@return STRINGP")
    public static final SubLObject random_filename_part_alt(SubLObject length) {
        if (length == UNPROVIDED) {
            length = EIGHT_INTEGER;
        }
        {
            SubLObject part = Strings.make_string(length, CHAR_space);
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(length); i = add(i, ONE_INTEGER)) {
                Strings.set_char(part, i, com.cyc.cycjava.cycl.file_utilities.random_path_char());
            }
            return part;
        }
    }

    /**
     * Get a string with LENGTH number of characters randomly chosen from RANDOM-PATH-CHARS.
     *
     * @return STRINGP
     */
    @LispMethod(comment = "Get a string with LENGTH number of characters randomly chosen from RANDOM-PATH-CHARS.\r\n\r\n@return STRINGP")
    public static SubLObject random_filename_part(SubLObject length) {
        if (length == UNPROVIDED) {
            length = EIGHT_INTEGER;
        }
        final SubLObject part = Strings.make_string(length, CHAR_space);
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(length); i = add(i, ONE_INTEGER)) {
            Strings.set_char(part, i, random_path_char());
        }
        return part;
    }

    /**
     * Return a random filename in directory DIRECTORY-STRING.
     * At the time this function is called, the returned filename will not exist.
     */
    @LispMethod(comment = "Return a random filename in directory DIRECTORY-STRING.\r\nAt the time this function is called, the returned filename will not exist.\nReturn a random filename in directory DIRECTORY-STRING.\nAt the time this function is called, the returned filename will not exist.")
    public static final SubLObject make_unused_temp_filename_alt(SubLObject directory_string) {
        if (directory_string == UNPROVIDED) {
            directory_string = $temp_directory$.getGlobalValue();
        }
        {
            SubLObject filename = NIL;
            while (!((NIL != filename) && (NIL == Filesys.probe_file(filename)))) {
                filename = Strings.string_downcase(com.cyc.cycjava.cycl.file_utilities.make_temp_filename(directory_string), UNPROVIDED, UNPROVIDED);
            } 
            return filename;
        }
    }

    /**
     * Return a random filename in directory DIRECTORY-STRING.
     * At the time this function is called, the returned filename will not exist.
     */
    @LispMethod(comment = "Return a random filename in directory DIRECTORY-STRING.\r\nAt the time this function is called, the returned filename will not exist.\nReturn a random filename in directory DIRECTORY-STRING.\nAt the time this function is called, the returned filename will not exist.")
    public static SubLObject make_unused_temp_filename(SubLObject directory_string) {
        if (directory_string == UNPROVIDED) {
            directory_string = $temp_directory$.getGlobalValue();
        }
        SubLObject filename;
        for (filename = NIL; (NIL == filename) || (NIL != Filesys.probe_file(filename)); filename = Strings.string_downcase(make_temp_filename(directory_string), UNPROVIDED, UNPROVIDED)) {
        }
        return filename;
    }

    /**
     * Return a random filename in directory DIRECTORY-STRING that has
     * PREFIX as its prefix.
     */
    @LispMethod(comment = "Return a random filename in directory DIRECTORY-STRING that has\r\nPREFIX as its prefix.\nReturn a random filename in directory DIRECTORY-STRING that has\nPREFIX as its prefix.")
    public static final SubLObject make_prefixed_temp_filename_alt(SubLObject prefix, SubLObject directory_string) {
        if (directory_string == UNPROVIDED) {
            directory_string = $temp_directory$.getGlobalValue();
        }
        SubLTrampolineFile.checkType(directory_string, STRINGP);
        {
            SubLObject random_part = com.cyc.cycjava.cycl.file_utilities.random_filename_part(EIGHT_INTEGER);
            SubLObject filename = cconcatenate(prefix, random_part);
            return com.cyc.cycjava.cycl.file_utilities.relative_filename(directory_string, filename, $$$tmp);
        }
    }

    /**
     * Return a random filename in directory DIRECTORY-STRING that has
     * PREFIX as its prefix.
     */
    @LispMethod(comment = "Return a random filename in directory DIRECTORY-STRING that has\r\nPREFIX as its prefix.\nReturn a random filename in directory DIRECTORY-STRING that has\nPREFIX as its prefix.")
    public static SubLObject make_prefixed_temp_filename(final SubLObject prefix, SubLObject directory_string) {
        if (directory_string == UNPROVIDED) {
            directory_string = $temp_directory$.getGlobalValue();
        }
        assert NIL != stringp(directory_string) : "! stringp(directory_string) " + ("Types.stringp(directory_string) " + "CommonSymbols.NIL != Types.stringp(directory_string) ") + directory_string;
        final SubLObject random_part = random_filename_part(EIGHT_INTEGER);
        final SubLObject filename = cconcatenate(prefix, random_part);
        return relative_filename(directory_string, filename, $$$tmp);
    }

    /**
     *
     *
     * @return streamp; an i/o stream to an anonymous file of type ELEMENT-TYPE in
    directory DIRECTORY
     */
    @LispMethod(comment = "@return streamp; an i/o stream to an anonymous file of type ELEMENT-TYPE in\r\ndirectory DIRECTORY")
    public static final SubLObject open_temp_file_alt(SubLObject element_type, SubLObject directory) {
        if (element_type == UNPROVIDED) {
            element_type = $TEXT;
        }
        if (directory == UNPROVIDED) {
            directory = $temp_directory$.getGlobalValue();
        }
        {
            SubLObject stream = NIL;
            while (NIL == stream) {
                stream = StreamsLow.open(com.cyc.cycjava.cycl.file_utilities.make_temp_filename(directory), new SubLObject[]{ $DIRECTION, $IO, $IF_EXISTS, NIL, $IF_DOES_NOT_EXIST, $CREATE, $ELEMENT_TYPE, element_type });
            } 
            return stream;
        }
    }

    /**
     *
     *
     * @return streamp; an i/o stream to an anonymous file of type ELEMENT-TYPE in
    directory DIRECTORY
     */
    @LispMethod(comment = "@return streamp; an i/o stream to an anonymous file of type ELEMENT-TYPE in\r\ndirectory DIRECTORY")
    public static SubLObject open_temp_file(SubLObject element_type, SubLObject directory) {
        if (element_type == UNPROVIDED) {
            element_type = $TEXT;
        }
        if (directory == UNPROVIDED) {
            directory = $temp_directory$.getGlobalValue();
        }
        SubLObject stream;
        for (stream = NIL; NIL == stream; stream = StreamsLow.open(make_temp_filename(directory), new SubLObject[]{ $DIRECTION, $IO, $IF_EXISTS, NIL, $IF_DOES_NOT_EXIST, $CREATE, $ELEMENT_TYPE, element_type })) {
        }
        return stream;
    }

    /**
     * Execute BODY with STREAM bound to an anonymous i/o file stream of type ELEMENT-TYPE
     */
    @LispMethod(comment = "Execute BODY with STREAM bound to an anonymous i/o file stream of type ELEMENT-TYPE")
    public static final SubLObject with_temp_file_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt32);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject stream = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt32);
                    stream = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_1 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt32);
                            current_1 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt32);
                            if (NIL == member(current_1, $list_alt33, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_1 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt32);
                        }
                        {
                            SubLObject element_type_tail = property_list_member($ELEMENT_TYPE, current);
                            SubLObject element_type = (NIL != element_type_tail) ? ((SubLObject) (cadr(element_type_tail))) : $TEXT;
                            current = temp;
                            {
                                SubLObject body = current;
                                return list(CLET, list(list(stream, list(OPEN_TMP_FILE, element_type))), bq_cons(CUNWIND_PROTECT, append(body, list(list(PWHEN, list(STREAMP, stream), list(DELETE_FILE, stream), list(CLOSE, stream))))));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Execute BODY with STREAM bound to an anonymous i/o file stream of type ELEMENT-TYPE
     */
    @LispMethod(comment = "Execute BODY with STREAM bound to an anonymous i/o file stream of type ELEMENT-TYPE")
    public static SubLObject with_temp_file(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list39);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject stream = NIL;
        destructuring_bind_must_consp(current, datum, $list39);
        stream = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list39);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list39);
            if (NIL == member(current_$1, $list40, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list39);
        }
        final SubLObject element_type_tail = property_list_member($ELEMENT_TYPE, current);
        final SubLObject element_type = (NIL != element_type_tail) ? cadr(element_type_tail) : $TEXT;
        final SubLObject body;
        current = body = temp;
        return list(CLET, list(list(stream, list(OPEN_TMP_FILE, element_type))), bq_cons(CUNWIND_PROTECT, append(body, list(list(PWHEN, list(STREAMP, stream), list(DELETE_FILE, stream), list(CLOSE, stream))))));
    }

    public static SubLObject with_file_replacement(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list48);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject stream = NIL;
        SubLObject filename = NIL;
        destructuring_bind_must_consp(current, datum, $list48);
        stream = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list48);
        filename = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list48);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list48);
            if (NIL == member(current_$2, $list40, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list48);
        }
        final SubLObject element_type_tail = property_list_member($ELEMENT_TYPE, current);
        final SubLObject element_type = (NIL != element_type_tail) ? cadr(element_type_tail) : $TEXT;
        final SubLObject body;
        current = body = temp;
        return list(CLET, list(list(stream, list(OPEN_TMP_FILE, element_type))), bq_cons(CUNWIND_PROTECT, append(body, list(list(PWHEN, list(STREAMP, stream), list(FORCE_OUTPUT, stream), list(PWHEN, list(PROBE_FILE, filename), list(DELETE_FILE, filename)), list(COPY_FILE, list(TO_STRING, list(PROBE_FILE, stream)), filename), list(DELETE_FILE, stream), list(CLOSE, stream))))));
    }

    /**
     * Identify an available temporary filename inside DIRECTORY, make the name availble in
     * FILENAME and ensure that the file is deleted at the conclusion of BODY.
     */
    @LispMethod(comment = "Identify an available temporary filename inside DIRECTORY, make the name availble in\r\nFILENAME and ensure that the file is deleted at the conclusion of BODY.\nIdentify an available temporary filename inside DIRECTORY, make the name availble in\nFILENAME and ensure that the file is deleted at the conclusion of BODY.")
    public static final SubLObject with_temporary_filename_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt41);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject filename = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt41);
                    filename = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_2 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt41);
                            current_2 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt41);
                            if (NIL == member(current_2, $list_alt42, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_2 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt41);
                        }
                        {
                            SubLObject directory_tail = property_list_member($DIRECTORY, current);
                            SubLObject directory = (NIL != directory_tail) ? ((SubLObject) (cadr(directory_tail))) : $temp_directory$.getGlobalValue();
                            current = temp;
                            {
                                SubLObject body = current;
                                return list(CLET, list(list(filename, list(MAKE_TEMP_FILENAME, directory))), list(CUNWIND_PROTECT, bq_cons(PROGN, append(body, NIL)), list(IGNORE_ERRORS, list(DELETE_FILE, filename))));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Identify an available temporary filename inside DIRECTORY, make the name availble in
     * FILENAME and ensure that the file is deleted at the conclusion of BODY.
     */
    @LispMethod(comment = "Identify an available temporary filename inside DIRECTORY, make the name availble in\r\nFILENAME and ensure that the file is deleted at the conclusion of BODY.\nIdentify an available temporary filename inside DIRECTORY, make the name availble in\nFILENAME and ensure that the file is deleted at the conclusion of BODY.")
    public static SubLObject with_temporary_filename(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list53);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject filename = NIL;
        destructuring_bind_must_consp(current, datum, $list53);
        filename = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$3 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list53);
            current_$3 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list53);
            if (NIL == member(current_$3, $list54, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$3 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list53);
        }
        final SubLObject directory_tail = property_list_member($DIRECTORY, current);
        final SubLObject directory = (NIL != directory_tail) ? cadr(directory_tail) : $temp_directory$.getGlobalValue();
        final SubLObject body;
        current = body = temp;
        return list(CLET, list(list(filename, list(MAKE_TEMP_FILENAME, directory))), list(CUNWIND_PROTECT, bq_cons(PROGN, append(body, NIL)), list(IGNORE_ERRORS, list(DELETE_FILE, filename))));
    }

    public static final SubLObject open_tmp_file_alt(SubLObject element_type, SubLObject directory) {
        if (element_type == UNPROVIDED) {
            element_type = $TEXT;
        }
        if (directory == UNPROVIDED) {
            directory = $temp_directory$.getGlobalValue();
        }
        return com.cyc.cycjava.cycl.file_utilities.open_temp_file(element_type, directory);
    }

    public static SubLObject open_tmp_file(SubLObject element_type, SubLObject directory) {
        if (element_type == UNPROVIDED) {
            element_type = $TEXT;
        }
        if (directory == UNPROVIDED) {
            directory = $temp_directory$.getGlobalValue();
        }
        return open_temp_file(element_type, directory);
    }

    public static final SubLObject with_tmp_file_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt48);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject stream = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt48);
                    stream = current.first();
                    current = current.rest();
                    {
                        SubLObject element_type = (current.isCons()) ? ((SubLObject) (current.first())) : $TEXT;
                        destructuring_bind_must_listp(current, datum, $list_alt48);
                        current = current.rest();
                        if (NIL == current) {
                            current = temp;
                            {
                                SubLObject body = current;
                                defmacro_obsolete_warning(WITH_TMP_FILE, $list_alt50);
                                return listS(WITH_TEMP_FILE, list(stream, $ELEMENT_TYPE, element_type), append(body, NIL));
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt48);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject with_tmp_file(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list60);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject stream = NIL;
        destructuring_bind_must_consp(current, datum, $list60);
        stream = current.first();
        current = current.rest();
        final SubLObject element_type = (current.isCons()) ? current.first() : $TEXT;
        destructuring_bind_must_listp(current, datum, $list60);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            defmacro_obsolete_warning(WITH_TMP_FILE, $list62);
            return listS(WITH_TEMP_FILE, list(stream, $ELEMENT_TYPE, element_type), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list60);
        return NIL;
    }

    /**
     * Return T iff it is possible to write a file of size BYTE-SIZE bytes to the directory in DIRECTORY-STRING.
     */
    @LispMethod(comment = "Return T iff it is possible to write a file of size BYTE-SIZE bytes to the directory in DIRECTORY-STRING.")
    public static final SubLObject directory_writeable_p_alt(SubLObject directory_string, SubLObject byte_size) {
        if (byte_size == UNPROVIDED) {
            byte_size = ZERO_INTEGER;
        }
        SubLTrampolineFile.checkType(directory_string, STRINGP);
        SubLTrampolineFile.checkType(byte_size, INTEGERP);
        if (NIL == Filesys.directory_p(directory_string)) {
            return NIL;
        }
        {
            SubLObject temp_file = com.cyc.cycjava.cycl.file_utilities.make_temp_filename(directory_string);
            SubLObject created = NIL;
            SubLObject sized = NIL;
            SubLObject writeable = NIL;
            SubLObject ignore_errors_tag = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, symbol_function(IGNORE_ERRORS_HANDLER));
                        try {
                            try {
                                {
                                    SubLObject stream = NIL;
                                    try {
                                        stream = compatibility.open_binary(temp_file, $OUTPUT, NIL);
                                        if (!stream.isStream()) {
                                            Errors.error($str_alt56$Unable_to_open__S, temp_file);
                                        }
                                        {
                                            SubLObject s = stream;
                                            created = T;
                                            sized = T;
                                        }
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0_3 = currentBinding($is_thread_performing_cleanupP$);
                                            try {
                                                bind($is_thread_performing_cleanupP$, T);
                                                if (stream.isStream()) {
                                                    close(stream, UNPROVIDED);
                                                }
                                            } finally {
                                                rebind($is_thread_performing_cleanupP$, _prev_bind_0_3);
                                            }
                                        }
                                    }
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0_4 = currentBinding($is_thread_performing_cleanupP$);
                                    try {
                                        bind($is_thread_performing_cleanupP$, T);
                                        if (NIL != created) {
                                            if (NIL != sized) {
                                                writeable = list_utilities.sublisp_boolean(Filesys.probe_file(temp_file));
                                            }
                                            Filesys.delete_file(temp_file);
                                        }
                                    } finally {
                                        rebind($is_thread_performing_cleanupP$, _prev_bind_0_4);
                                    }
                                }
                            }
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
            }
            return writeable;
        }
    }

    /**
     * Return T iff it is possible to write a file of size BYTE-SIZE bytes to the directory in DIRECTORY-STRING.
     */
    @LispMethod(comment = "Return T iff it is possible to write a file of size BYTE-SIZE bytes to the directory in DIRECTORY-STRING.")
    public static SubLObject directory_writeable_p(final SubLObject directory_string, SubLObject byte_size) {
        if (byte_size == UNPROVIDED) {
            byte_size = ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(directory_string) : "! stringp(directory_string) " + ("Types.stringp(directory_string) " + "CommonSymbols.NIL != Types.stringp(directory_string) ") + directory_string;
        assert NIL != integerp(byte_size) : "! integerp(byte_size) " + ("Types.integerp(byte_size) " + "CommonSymbols.NIL != Types.integerp(byte_size) ") + byte_size;
        if (NIL == Filesys.directory_p(directory_string)) {
            return NIL;
        }
        final SubLObject temp_file = make_temp_filename(directory_string);
        SubLObject created = NIL;
        SubLObject sized = NIL;
        SubLObject writeable = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    try {
                        SubLObject stream = NIL;
                        try {
                            final SubLObject _prev_bind_0_$4 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                            try {
                                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                stream = compatibility.open_binary(temp_file, $OUTPUT);
                            } finally {
                                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$4, thread);
                            }
                            if (!stream.isStream()) {
                                Errors.error($str68$Unable_to_open__S, temp_file);
                            }
                            final SubLObject s = stream;
                            created = T;
                            sized = T;
                        } finally {
                            final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (stream.isStream()) {
                                    close(stream, UNPROVIDED);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                            }
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            if (NIL != created) {
                                if (NIL != sized) {
                                    writeable = list_utilities.sublisp_boolean(Filesys.probe_file(temp_file));
                                }
                                Filesys.delete_file(temp_file);
                            }
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                        }
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        return writeable;
    }

    /**
     *
     *
     * @return booleanp; Detemines whether FILE-STRING is a valid specification for writing output.
     */
    @LispMethod(comment = "@return booleanp; Detemines whether FILE-STRING is a valid specification for writing output.")
    public static final SubLObject file_valid_for_writing_p_alt(SubLObject file_string) {
        {
            SubLObject validP = NIL;
            if (file_string.isString()) {
                {
                    SubLObject ignore_errors_tag = NIL;
                    try {
                        {
                            SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                            try {
                                bind(Errors.$error_handler$, symbol_function(IGNORE_ERRORS_HANDLER));
                                try {
                                    if ((NIL != Filesys.probe_file(file_string)) || (NIL != com.cyc.cycjava.cycl.file_utilities.directory_writeable_p(com.cyc.cycjava.cycl.file_utilities.reconstruct_path(com.cyc.cycjava.cycl.file_utilities.deconstruct_path(file_string), $str_alt15$, UNPROVIDED), UNPROVIDED))) {
                                        validP = T;
                                    }
                                } catch (Throwable catch_var) {
                                    Errors.handleThrowable(catch_var, NIL);
                                }
                            } finally {
                                rebind(Errors.$error_handler$, _prev_bind_0);
                            }
                        }
                    } catch (Throwable ccatch_env_var) {
                        ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                    }
                }
            }
            return validP;
        }
    }

    /**
     *
     *
     * @return booleanp; Detemines whether FILE-STRING is a valid specification for writing output.
     */
    @LispMethod(comment = "@return booleanp; Detemines whether FILE-STRING is a valid specification for writing output.")
    public static SubLObject file_valid_for_writing_p(final SubLObject file_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject validP = NIL;
        if (file_string.isString()) {
            SubLObject ignore_errors_tag = NIL;
            try {
                thread.throwStack.push($IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                    try {
                        if ((NIL != Filesys.probe_file(file_string)) || (NIL != directory_writeable_p(reconstruct_path(deconstruct_path(file_string), $str22$, UNPROVIDED), UNPROVIDED))) {
                            validP = T;
                        }
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
            } finally {
                thread.throwStack.pop();
            }
        }
        return validP;
    }

    public static final SubLObject delete_file_if_exists_alt(SubLObject filename) {
        if (NIL != Filesys.probe_file(filename)) {
            return Filesys.delete_file(filename);
        }
        return NIL;
    }

    public static SubLObject delete_file_if_exists(final SubLObject filename) {
        if (NIL != Filesys.probe_file(filename)) {
            return Filesys.delete_file(filename);
        }
        return NIL;
    }

    /**
     * Replace non-logical pathname characters in FILENAME with hyphens.
     */
    @LispMethod(comment = "Replace non-logical pathname characters in FILENAME with hyphens.")
    public static final SubLObject clean_filename_alt(SubLObject filename) {
        {
            SubLObject frobbed_filename = copy_seq(filename);
            SubLObject string_var = frobbed_filename;
            SubLObject end_var = length(string_var);
            SubLObject end_var_5 = end_var;
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; !i.numGE(end_var_5); i = number_utilities.f_1X(i)) {
                {
                    SubLObject ch = Strings.sublisp_char(string_var, i);
                    if (NIL == alphanumericp(ch)) {
                        Strings.set_char(frobbed_filename, i, CHAR_hyphen);
                    }
                }
            }
            return frobbed_filename;
        }
    }

    /**
     * Replace non-logical pathname characters in FILENAME with hyphens.
     */
    @LispMethod(comment = "Replace non-logical pathname characters in FILENAME with hyphens.")
    public static SubLObject clean_filename(final SubLObject filename) {
        final SubLObject string_var;
        final SubLObject frobbed_filename = string_var = copy_seq(filename);
        SubLObject end_var_$7;
        SubLObject end_var;
        SubLObject i;
        SubLObject ch;
        for (end_var = end_var_$7 = length(string_var), i = NIL, i = ZERO_INTEGER; !i.numGE(end_var_$7); i = number_utilities.f_1X(i)) {
            ch = Strings.sublisp_char(string_var, i);
            if (NIL == alphanumericp(ch)) {
                Strings.set_char(frobbed_filename, i, CHAR_hyphen);
            }
        }
        return frobbed_filename;
    }

    public static final SubLObject append_files_alt(SubLObject f1, SubLObject f2, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = $TEXT;
        }
        {
            SubLObject reader = NIL;
            SubLObject writer = NIL;
            SubLObject pcase_var = mode;
            if (pcase_var.eql($TEXT)) {
                reader = symbol_function(READ_CHAR);
                writer = symbol_function(WRITE_CHAR);
            } else {
                if (pcase_var.eql($BINARY) || pcase_var.eql($DEFAULT)) {
                    reader = symbol_function(READ_BYTE);
                    writer = symbol_function(WRITE_BYTE);
                } else {
                    Errors.error($str_alt63$_S_is_not_a_valid_mode_, mode);
                }
            }
            {
                SubLObject stream_var = NIL;
                try {
                    stream_var = StreamsLow.open(f1, new SubLObject[]{ $ELEMENT_TYPE, mode, $IF_DOES_NOT_EXIST, NIL });
                    {
                        SubLObject in = stream_var;
                        if (NIL != in) {
                            {
                                SubLObject stream_var_6 = NIL;
                                try {
                                    stream_var_6 = StreamsLow.open(f2, new SubLObject[]{ $DIRECTION, $OUTPUT, $IF_EXISTS, $APPEND, $ELEMENT_TYPE, mode, $IF_DOES_NOT_EXIST, $CREATE });
                                    {
                                        SubLObject out = stream_var_6;
                                        SubLObject elt = NIL;
                                        for (elt = funcall(reader, in, NIL, NIL); NIL != elt; elt = funcall(reader, in, NIL, NIL)) {
                                            funcall(writer, elt, out);
                                        }
                                    }
                                } finally {
                                    {
                                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                        try {
                                            bind($is_thread_performing_cleanupP$, T);
                                            if (NIL != stream_var_6) {
                                                close(stream_var_6, UNPROVIDED);
                                            }
                                        } finally {
                                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            if (NIL != stream_var) {
                                close(stream_var, UNPROVIDED);
                            }
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject append_files(final SubLObject f1, final SubLObject f2, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = $TEXT;
        }
        SubLObject reader = NIL;
        SubLObject writer = NIL;
        final SubLObject pcase_var = mode;
        if (pcase_var.eql($TEXT)) {
            reader = symbol_function(READ_CHAR);
            writer = symbol_function(WRITE_CHAR);
        } else
            if (pcase_var.eql($BINARY) || pcase_var.eql($DEFAULT)) {
                reader = symbol_function(READ_BYTE);
                writer = symbol_function(WRITE_BYTE);
            } else {
                Errors.error($str75$_S_is_not_a_valid_mode_, mode);
            }

        SubLObject stream_var = NIL;
        try {
            final SubLObject in;
            stream_var = in = StreamsLow.open(f1, new SubLObject[]{ $ELEMENT_TYPE, mode, $IF_DOES_NOT_EXIST, NIL });
            if (NIL != in) {
                SubLObject stream_var_$8 = NIL;
                try {
                    final SubLObject out;
                    stream_var_$8 = out = StreamsLow.open(f2, new SubLObject[]{ $DIRECTION, $OUTPUT, $IF_EXISTS, $APPEND, $ELEMENT_TYPE, mode, $IF_DOES_NOT_EXIST, $CREATE });
                    SubLObject elt;
                    for (elt = NIL, elt = funcall(reader, in, NIL, NIL); NIL != elt; elt = funcall(reader, in, NIL, NIL)) {
                        funcall(writer, elt, out);
                    }
                } finally {
                    final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        final SubLObject _values = getValuesAsVector();
                        if (NIL != stream_var_$8) {
                            close(stream_var_$8, UNPROVIDED);
                        }
                        restoreValuesFromVector(_values);
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
        } finally {
            final SubLObject _prev_bind_2 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values2 = getValuesAsVector();
                if (NIL != stream_var) {
                    close(stream_var, UNPROVIDED);
                }
                restoreValuesFromVector(_values2);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_2);
            }
        }
        return NIL;
    }

    /**
     * Macro that iterates VAR over all the lines in the text file FILE, evaluating BODY
     * for each line. Iteration stops when DONE becomes non-NIL.
     * For more flexibility, @see DO-FILE-LINES
     */
    @LispMethod(comment = "Macro that iterates VAR over all the lines in the text file FILE, evaluating BODY\r\nfor each line. Iteration stops when DONE becomes non-NIL.\r\nFor more flexibility, @see DO-FILE-LINES\nMacro that iterates VAR over all the lines in the text file FILE, evaluating BODY\nfor each line. Iteration stops when DONE becomes non-NIL.\nFor more flexibility, @see DO-FILE-LINES")
    public static final SubLObject cdolines_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt65);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject var = NIL;
                    SubLObject file = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt65);
                    var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt65);
                    file = current.first();
                    current = current.rest();
                    {
                        SubLObject done = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt65);
                        current = current.rest();
                        if (NIL == current) {
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject infile = $sym66$INFILE;
                                return list(WITH_TEXT_FILE, listS(infile, file, $list_alt67), list(PWHEN, list(STREAMP, infile), listS(CDO, list(list(var, listS(READ_LINE, infile, $list_alt70), listS(READ_LINE, infile, $list_alt70))), list(list(COR, list(NULL, var), done)), append(body, NIL))));
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt65);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Macro that iterates VAR over all the lines in the text file FILE, evaluating BODY
     * for each line. Iteration stops when DONE becomes non-NIL.
     * For more flexibility, @see DO-FILE-LINES
     */
    @LispMethod(comment = "Macro that iterates VAR over all the lines in the text file FILE, evaluating BODY\r\nfor each line. Iteration stops when DONE becomes non-NIL.\r\nFor more flexibility, @see DO-FILE-LINES\nMacro that iterates VAR over all the lines in the text file FILE, evaluating BODY\nfor each line. Iteration stops when DONE becomes non-NIL.\nFor more flexibility, @see DO-FILE-LINES")
    public static SubLObject cdolines(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list77);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject file = NIL;
        destructuring_bind_must_consp(current, datum, $list77);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list77);
        file = current.first();
        current = current.rest();
        final SubLObject done = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list77);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject infile = $sym78$INFILE;
            return list(WITH_PRIVATE_TEXT_FILE, listS(infile, file, $list79), list(PWHEN, list(STREAMP, infile), listS(CDO, list(list(var, list(CDOLINES_GET_NEXT_LINE, infile), list(CDOLINES_GET_NEXT_LINE, infile))), list(list(COR, list(NULL, var), done)), append(body, NIL))));
        }
        cdestructuring_bind_error(datum, $list77);
        return NIL;
    }

    public static SubLObject cdolines_get_next_line(final SubLObject infile) {
        return string_utilities.network_read_line(infile, NIL, NIL, T);
    }

    /**
     *
     *
     * @param LINE-VAR;
    variable
     * 		
     * @param STREAM;
    streamp
     * 		
     * @param LINE-NUMBER;
     * 		variable or NIL: If non-nil, incremented on each iteration starting from 0
     * @param DONE;
    object
     * 		
     * @param BODY;
     * 		form
     * 		Macro that iterates LINE-VAR over all the lines in the stream STREAM, evaluating BODY
     * 		for each line. Iteration stops when DONE becomes non-NIL.
     */
    @LispMethod(comment = "@param LINE-VAR;\nvariable\r\n\t\t\r\n@param STREAM;\nstreamp\r\n\t\t\r\n@param LINE-NUMBER;\r\n\t\tvariable or NIL: If non-nil, incremented on each iteration starting from 0\r\n@param DONE;\nobject\r\n\t\t\r\n@param BODY;\r\n\t\tform\r\n\t\tMacro that iterates LINE-VAR over all the lines in the stream STREAM, evaluating BODY\r\n\t\tfor each line. Iteration stops when DONE becomes non-NIL.")
    public static final SubLObject do_stream_lines_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt73);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject line_var = NIL;
                    SubLObject stream = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt73);
                    line_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt73);
                    stream = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_7 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt73);
                            current_7 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt73);
                            if (NIL == member(current_7, $list_alt74, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_7 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt73);
                        }
                        {
                            SubLObject line_number_tail = property_list_member($LINE_NUMBER, current);
                            SubLObject line_number = (NIL != line_number_tail) ? ((SubLObject) (cadr(line_number_tail))) : NIL;
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                if (NIL == line_number) {
                                    {
                                        SubLObject line_number_var = $sym77$LINE_NUMBER_VAR;
                                        return listS(DO_STREAM_LINES, list(line_var, stream, $LINE_NUMBER, line_number_var, $DONE, done), append(body, NIL));
                                    }
                                } else {
                                    {
                                        SubLObject stream_var = $sym79$STREAM_VAR;
                                        SubLTrampolineFile.checkType(line_number, SYMBOLP);
                                        return list(CLET, list(list(stream_var, stream)), listS(CDO, list(list(line_number, ZERO_INTEGER, list($sym81$1_, line_number)), list(line_var, listS(READ_LINE, stream_var, $list_alt70), listS(READ_LINE, stream_var, $list_alt70))), list(list(COR, done, list(NULL, line_var))), append(body, NIL)));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @param LINE-VAR;
    variable
     * 		
     * @param STREAM;
    streamp
     * 		
     * @param LINE-NUMBER;
     * 		variable or NIL: If non-nil, incremented on each iteration starting from 0
     * @param DONE;
    object
     * 		
     * @param BODY;
     * 		form
     * 		Macro that iterates LINE-VAR over all the lines in the stream STREAM, evaluating BODY
     * 		for each line. Iteration stops when DONE becomes non-NIL.
     */
    @LispMethod(comment = "@param LINE-VAR;\nvariable\r\n\t\t\r\n@param STREAM;\nstreamp\r\n\t\t\r\n@param LINE-NUMBER;\r\n\t\tvariable or NIL: If non-nil, incremented on each iteration starting from 0\r\n@param DONE;\nobject\r\n\t\t\r\n@param BODY;\r\n\t\tform\r\n\t\tMacro that iterates LINE-VAR over all the lines in the stream STREAM, evaluating BODY\r\n\t\tfor each line. Iteration stops when DONE becomes non-NIL.")
    public static SubLObject do_stream_lines(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list85);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject line_var = NIL;
        SubLObject stream = NIL;
        destructuring_bind_must_consp(current, datum, $list85);
        line_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list85);
        stream = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$9 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list85);
            current_$9 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list85);
            if (NIL == member(current_$9, $list86, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$9 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list85);
        }
        final SubLObject line_number_tail = property_list_member($LINE_NUMBER, current);
        final SubLObject line_number = (NIL != line_number_tail) ? cadr(line_number_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        if (NIL == line_number) {
            final SubLObject line_number_var = $sym89$LINE_NUMBER_VAR;
            return listS(DO_STREAM_LINES, list(line_var, stream, $LINE_NUMBER, line_number_var, $DONE, done), append(body, NIL));
        }
        final SubLObject stream_var = $sym91$STREAM_VAR;
        assert NIL != symbolp(line_number) : "! symbolp(line_number) " + ("Types.symbolp(line_number) " + "CommonSymbols.NIL != Types.symbolp(line_number) ") + line_number;
        return list(CLET, list(list(stream_var, stream)), listS(CDO, list(list(line_number, ZERO_INTEGER, list($sym93$1_, line_number)), list(line_var, list(DO_STREAM_LINES_GET_NEXT_LINE, stream_var), list(DO_STREAM_LINES_GET_NEXT_LINE, stream_var))), list(list(COR, done, list(NULL, line_var))), append(body, NIL)));
    }

    public static SubLObject do_stream_lines_get_next_line(final SubLObject stream) {
        return string_utilities.network_read_line(stream, NIL, NIL, T);
    }

    /**
     *
     *
     * @param LINE-VAR;
    variable
     * 		
     * @param FILE;
    stringp
     * 		
     * @param LINE-NUMBER;
     * 		variable or NIL: If non-nil, incremented on each iteration starting from 0
     * @param PROGRESS-MESSAGE;
     * 		stringp or NIL: If non-nil, percent progress is noted on each iteration
     * @param DONE;
    object
     * 		
     * @param BODY;
     * 		form
     * 		Macro that iterates LINE-VAR over all the lines in the text file FILE, evaluating BODY
     * 		for each line. Iteration stops when DONE becomes non-NIL.
     */
    @LispMethod(comment = "@param LINE-VAR;\nvariable\r\n\t\t\r\n@param FILE;\nstringp\r\n\t\t\r\n@param LINE-NUMBER;\r\n\t\tvariable or NIL: If non-nil, incremented on each iteration starting from 0\r\n@param PROGRESS-MESSAGE;\r\n\t\tstringp or NIL: If non-nil, percent progress is noted on each iteration\r\n@param DONE;\nobject\r\n\t\t\r\n@param BODY;\r\n\t\tform\r\n\t\tMacro that iterates LINE-VAR over all the lines in the text file FILE, evaluating BODY\r\n\t\tfor each line. Iteration stops when DONE becomes non-NIL.")
    public static final SubLObject do_file_lines_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt82);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject line_var = NIL;
                    SubLObject file = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt82);
                    line_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt82);
                    file = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_8 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt82);
                            current_8 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt82);
                            if (NIL == member(current_8, $list_alt83, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_8 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt82);
                        }
                        {
                            SubLObject line_number_tail = property_list_member($LINE_NUMBER, current);
                            SubLObject line_number = (NIL != line_number_tail) ? ((SubLObject) (cadr(line_number_tail))) : NIL;
                            SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
                            SubLObject progress_message = (NIL != progress_message_tail) ? ((SubLObject) (cadr(progress_message_tail))) : NIL;
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                if (NIL == progress_message) {
                                    {
                                        SubLObject file_var = $sym85$FILE_VAR;
                                        SubLObject stream_var = $sym86$STREAM_VAR;
                                        return list(CLET, list(list(file_var, file)), list(WITH_PRIVATE_TEXT_FILE, listS(stream_var, file_var, $list_alt67), list(PWHEN, list(STREAMP, stream_var), listS(DO_STREAM_LINES, list(line_var, stream_var, $LINE_NUMBER, line_number, $DONE, done), append(body, NIL)))));
                                    }
                                } else {
                                    {
                                        SubLObject file_var = $sym87$FILE_VAR;
                                        SubLObject stream_var = $sym88$STREAM_VAR;
                                        SubLObject length_var = $sym89$LENGTH_VAR;
                                        return list(NOTING_PERCENT_PROGRESS, progress_message, list(CLET, list(list(file_var, file)), list(WITH_PRIVATE_TEXT_FILE, listS(stream_var, file_var, $list_alt67), list(PWHEN, list(STREAMP, stream_var), list(CLET, list(list(length_var, list(FILE_LENGTH, stream_var))), listS(DO_STREAM_LINES, list(line_var, stream_var, $LINE_NUMBER, line_number, $DONE, done), append(body, list(list(NOTE_PERCENT_PROGRESS, list(FILE_POSITION, stream_var), length_var)))))))));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @param LINE-VAR;
    variable
     * 		
     * @param FILE;
    stringp
     * 		
     * @param LINE-NUMBER;
     * 		variable or NIL: If non-nil, incremented on each iteration starting from 0
     * @param PROGRESS-MESSAGE;
     * 		stringp or NIL: If non-nil, percent progress is noted on each iteration
     * @param DONE;
    object
     * 		
     * @param BODY;
     * 		form
     * 		Macro that iterates LINE-VAR over all the lines in the text file FILE, evaluating BODY
     * 		for each line. Iteration stops when DONE becomes non-NIL.
     */
    @LispMethod(comment = "@param LINE-VAR;\nvariable\r\n\t\t\r\n@param FILE;\nstringp\r\n\t\t\r\n@param LINE-NUMBER;\r\n\t\tvariable or NIL: If non-nil, incremented on each iteration starting from 0\r\n@param PROGRESS-MESSAGE;\r\n\t\tstringp or NIL: If non-nil, percent progress is noted on each iteration\r\n@param DONE;\nobject\r\n\t\t\r\n@param BODY;\r\n\t\tform\r\n\t\tMacro that iterates LINE-VAR over all the lines in the text file FILE, evaluating BODY\r\n\t\tfor each line. Iteration stops when DONE becomes non-NIL.")
    public static SubLObject do_file_lines(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list95);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject line_var = NIL;
        SubLObject file = NIL;
        destructuring_bind_must_consp(current, datum, $list95);
        line_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list95);
        file = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$10 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list95);
            current_$10 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list95);
            if (NIL == member(current_$10, $list96, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$10 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list95);
        }
        final SubLObject line_number_tail = property_list_member($LINE_NUMBER, current);
        final SubLObject line_number = (NIL != line_number_tail) ? cadr(line_number_tail) : NIL;
        final SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (NIL != progress_message_tail) ? cadr(progress_message_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        if (NIL == progress_message) {
            final SubLObject file_var = $sym98$FILE_VAR;
            final SubLObject stream_var = $sym99$STREAM_VAR;
            return list(CLET, list(list(file_var, file)), list(WITH_PRIVATE_TEXT_FILE, listS(stream_var, file_var, $list79), list(PWHEN, list(STREAMP, stream_var), listS(DO_STREAM_LINES, list(line_var, stream_var, $LINE_NUMBER, line_number, $DONE, done), append(body, NIL)))));
        }
        final SubLObject file_var = $sym100$FILE_VAR;
        final SubLObject stream_var = $sym101$STREAM_VAR;
        final SubLObject length_var = $sym102$LENGTH_VAR;
        return list(NOTING_PERCENT_PROGRESS, progress_message, list(CLET, list(list(file_var, file)), list(WITH_PRIVATE_TEXT_FILE, listS(stream_var, file_var, $list79), list(PWHEN, list(STREAMP, stream_var), list(CLET, list(list(length_var, list(FILE_LENGTH, stream_var))), listS(DO_STREAM_LINES, list(line_var, stream_var, $LINE_NUMBER, line_number, $DONE, done), append(body, list(list(NOTE_PERCENT_PROGRESS, list(FILE_POSITION, stream_var), length_var)))))))));
    }

    /**
     *
     *
     * @return INTEGERP; the number of lines in FILE.
     */
    @LispMethod(comment = "@return INTEGERP; the number of lines in FILE.")
    public static final SubLObject count_file_lines_alt(SubLObject file) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject count = ZERO_INTEGER;
                SubLObject file_var = file;
                SubLObject stream = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            stream = compatibility.open_text(file_var, $INPUT, NIL);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (!stream.isStream()) {
                        Errors.error($str_alt56$Unable_to_open__S, file_var);
                    }
                    {
                        SubLObject stream_var = stream;
                        if (stream_var.isStream()) {
                            {
                                SubLObject stream_var_9 = stream_var;
                                SubLObject line_number_var = NIL;
                                SubLObject line = NIL;
                                for (line_number_var = ZERO_INTEGER, line = read_line(stream_var_9, NIL, NIL, UNPROVIDED); NIL != line; line_number_var = number_utilities.f_1X(line_number_var) , line = read_line(stream_var_9, NIL, NIL, UNPROVIDED)) {
                                    count = add(count, ONE_INTEGER);
                                }
                            }
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return count;
            }
        }
    }

    /**
     *
     *
     * @return INTEGERP; the number of lines in FILE.
     */
    @LispMethod(comment = "@return INTEGERP; the number of lines in FILE.")
    public static SubLObject count_file_lines(final SubLObject file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(file, $INPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str68$Unable_to_open__S, file);
            }
            final SubLObject stream_var = stream;
            if (stream_var.isStream()) {
                final SubLObject stream_var_$11 = stream_var;
                SubLObject line_number_var = NIL;
                SubLObject line = NIL;
                line_number_var = ZERO_INTEGER;
                for (line = do_stream_lines_get_next_line(stream_var_$11); NIL != line; line = do_stream_lines_get_next_line(stream_var_$11)) {
                    count = add(count, ONE_INTEGER);
                    line_number_var = number_utilities.f_1X(line_number_var);
                }
            }
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return count;
    }

    public static final SubLObject do_csv_file_lines_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt95);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject tokenized_line = NIL;
                    SubLObject file = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt95);
                    tokenized_line = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt95);
                    file = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_10 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt95);
                            current_10 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt95);
                            if (NIL == member(current_10, $list_alt96, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_10 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt95);
                        }
                        {
                            SubLObject break_list_tail = property_list_member($BREAK_LIST, current);
                            SubLObject break_list = (NIL != break_list_tail) ? ((SubLObject) (cadr(break_list_tail))) : $list_alt98;
                            SubLObject embed_list_tail = property_list_member($EMBED_LIST, current);
                            SubLObject embed_list = (NIL != embed_list_tail) ? ((SubLObject) (cadr(embed_list_tail))) : $list_alt100;
                            SubLObject include_stops_tail = property_list_member($INCLUDE_STOPS, current);
                            SubLObject include_stops = (NIL != include_stops_tail) ? ((SubLObject) (cadr(include_stops_tail))) : NIL;
                            SubLObject ignore_empty_strings_tail = property_list_member($IGNORE_EMPTY_STRINGS, current);
                            SubLObject ignore_empty_strings = (NIL != ignore_empty_strings_tail) ? ((SubLObject) (cadr(ignore_empty_strings_tail))) : NIL;
                            SubLObject quote_chars_tail = property_list_member($QUOTE_CHARS, current);
                            SubLObject quote_chars = (NIL != quote_chars_tail) ? ((SubLObject) (cadr(quote_chars_tail))) : $list_alt104;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject line = $sym105$LINE;
                                return list(DO_FILE_LINES, list(line, file), listS(CLET, list(list(tokenized_line, list(STRING_TOKENIZE, line, break_list, embed_list, include_stops, ignore_empty_strings, quote_chars))), append(body, NIL)));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_csv_file_lines(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list108);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject tokenized_line = NIL;
        SubLObject file = NIL;
        destructuring_bind_must_consp(current, datum, $list108);
        tokenized_line = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list108);
        file = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$12 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list108);
            current_$12 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list108);
            if (NIL == member(current_$12, $list109, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$12 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list108);
        }
        final SubLObject break_list_tail = property_list_member($BREAK_LIST, current);
        final SubLObject break_list = (NIL != break_list_tail) ? cadr(break_list_tail) : $list111;
        final SubLObject embed_list_tail = property_list_member($EMBED_LIST, current);
        final SubLObject embed_list = (NIL != embed_list_tail) ? cadr(embed_list_tail) : $list113;
        final SubLObject include_stops_tail = property_list_member($INCLUDE_STOPS, current);
        final SubLObject include_stops = (NIL != include_stops_tail) ? cadr(include_stops_tail) : NIL;
        final SubLObject ignore_empty_strings_tail = property_list_member($IGNORE_EMPTY_STRINGS, current);
        final SubLObject ignore_empty_strings = (NIL != ignore_empty_strings_tail) ? cadr(ignore_empty_strings_tail) : NIL;
        final SubLObject quote_chars_tail = property_list_member($QUOTE_CHARS, current);
        final SubLObject quote_chars = (NIL != quote_chars_tail) ? cadr(quote_chars_tail) : $list117;
        final SubLObject body;
        current = body = temp;
        final SubLObject line = $sym118$LINE;
        return list(DO_FILE_LINES, list(line, file), listS(CLET, list(list(tokenized_line, list(STRING_TOKENIZE, line, break_list, embed_list, include_stops, ignore_empty_strings, quote_chars))), append(body, NIL)));
    }

    /**
     * A useful macro for parsing log files.  Opens the file named by FILE for input.
     * For each line in file, tokenizes line using STRING-TOKENIZE, READs each token,
     * binds the list of read tokens using LAMBDA-LIST, and evals BODY.  Keywords
     * BREAK-LIST EMBED-LIST INCLUDE-STOPS IGNORE-EMPTY-STRINGS and QUOTE-CHARS
     * control the action of STRING-TOKENIZE (q.v.).  READ is called with the default arguments.
     */
    @LispMethod(comment = "A useful macro for parsing log files.  Opens the file named by FILE for input.\r\nFor each line in file, tokenizes line using STRING-TOKENIZE, READs each token,\r\nbinds the list of read tokens using LAMBDA-LIST, and evals BODY.  Keywords\r\nBREAK-LIST EMBED-LIST INCLUDE-STOPS IGNORE-EMPTY-STRINGS and QUOTE-CHARS\r\ncontrol the action of STRING-TOKENIZE (q.v.).  READ is called with the default arguments.\nA useful macro for parsing log files.  Opens the file named by FILE for input.\nFor each line in file, tokenizes line using STRING-TOKENIZE, READs each token,\nbinds the list of read tokens using LAMBDA-LIST, and evals BODY.  Keywords\nBREAK-LIST EMBED-LIST INCLUDE-STOPS IGNORE-EMPTY-STRINGS and QUOTE-CHARS\ncontrol the action of STRING-TOKENIZE (q.v.).  READ is called with the default arguments.")
    public static final SubLObject cdolines_tokenized_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt108);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject file = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt108);
                    file = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_11 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt108);
                            current_11 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt108);
                            if (NIL == member(current_11, $list_alt96, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_11 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt108);
                        }
                        {
                            SubLObject break_list_tail = property_list_member($BREAK_LIST, current);
                            SubLObject break_list = (NIL != break_list_tail) ? ((SubLObject) (cadr(break_list_tail))) : $list_alt109;
                            SubLObject embed_list_tail = property_list_member($EMBED_LIST, current);
                            SubLObject embed_list = (NIL != embed_list_tail) ? ((SubLObject) (cadr(embed_list_tail))) : NIL;
                            SubLObject include_stops_tail = property_list_member($INCLUDE_STOPS, current);
                            SubLObject include_stops = (NIL != include_stops_tail) ? ((SubLObject) (cadr(include_stops_tail))) : NIL;
                            SubLObject ignore_empty_strings_tail = property_list_member($IGNORE_EMPTY_STRINGS, current);
                            SubLObject ignore_empty_strings = (NIL != ignore_empty_strings_tail) ? ((SubLObject) (cadr(ignore_empty_strings_tail))) : T;
                            SubLObject quote_chars_tail = property_list_member($QUOTE_CHARS, current);
                            SubLObject quote_chars = (NIL != quote_chars_tail) ? ((SubLObject) (cadr(quote_chars_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject lambda_list = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt108);
                                lambda_list = current.first();
                                current = current.rest();
                                {
                                    SubLObject body = current;
                                    SubLObject line = $sym110$LINE;
                                    return list(CDOLINES, list(line, file), listS(CDESTRUCTURING_BIND, lambda_list, list(MAPCAR, $list_alt114, listS(STRING_TOKENIZE, line, append(list(break_list, embed_list, include_stops, ignore_empty_strings, quote_chars), NIL))), append(body, NIL)));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * A useful macro for parsing log files.  Opens the file named by FILE for input.
     * For each line in file, tokenizes line using STRING-TOKENIZE, READs each token,
     * binds the list of read tokens using LAMBDA-LIST, and evals BODY.  Keywords
     * BREAK-LIST EMBED-LIST INCLUDE-STOPS IGNORE-EMPTY-STRINGS and QUOTE-CHARS
     * control the action of STRING-TOKENIZE (q.v.).  READ is called with the default arguments.
     */
    @LispMethod(comment = "A useful macro for parsing log files.  Opens the file named by FILE for input.\r\nFor each line in file, tokenizes line using STRING-TOKENIZE, READs each token,\r\nbinds the list of read tokens using LAMBDA-LIST, and evals BODY.  Keywords\r\nBREAK-LIST EMBED-LIST INCLUDE-STOPS IGNORE-EMPTY-STRINGS and QUOTE-CHARS\r\ncontrol the action of STRING-TOKENIZE (q.v.).  READ is called with the default arguments.\nA useful macro for parsing log files.  Opens the file named by FILE for input.\nFor each line in file, tokenizes line using STRING-TOKENIZE, READs each token,\nbinds the list of read tokens using LAMBDA-LIST, and evals BODY.  Keywords\nBREAK-LIST EMBED-LIST INCLUDE-STOPS IGNORE-EMPTY-STRINGS and QUOTE-CHARS\ncontrol the action of STRING-TOKENIZE (q.v.).  READ is called with the default arguments.")
    public static SubLObject cdolines_tokenized(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list121);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject file = NIL;
        destructuring_bind_must_consp(current, datum, $list121);
        file = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$13 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list121);
            current_$13 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list121);
            if (NIL == member(current_$13, $list109, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$13 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list121);
        }
        final SubLObject break_list_tail = property_list_member($BREAK_LIST, current);
        final SubLObject break_list = (NIL != break_list_tail) ? cadr(break_list_tail) : $list122;
        final SubLObject embed_list_tail = property_list_member($EMBED_LIST, current);
        final SubLObject embed_list = (NIL != embed_list_tail) ? cadr(embed_list_tail) : NIL;
        final SubLObject include_stops_tail = property_list_member($INCLUDE_STOPS, current);
        final SubLObject include_stops = (NIL != include_stops_tail) ? cadr(include_stops_tail) : NIL;
        final SubLObject ignore_empty_strings_tail = property_list_member($IGNORE_EMPTY_STRINGS, current);
        final SubLObject ignore_empty_strings = (NIL != ignore_empty_strings_tail) ? cadr(ignore_empty_strings_tail) : T;
        final SubLObject quote_chars_tail = property_list_member($QUOTE_CHARS, current);
        final SubLObject quote_chars = (NIL != quote_chars_tail) ? cadr(quote_chars_tail) : NIL;
        current = temp;
        SubLObject lambda_list = NIL;
        destructuring_bind_must_consp(current, datum, $list121);
        lambda_list = current.first();
        final SubLObject body;
        current = body = current.rest();
        final SubLObject line = $sym123$LINE;
        return list(CDOLINES, list(line, file), listS(CDESTRUCTURING_BIND, lambda_list, list(MAPCAR, $list126, listS(STRING_TOKENIZE, line, append(list(break_list, embed_list, include_stops, ignore_empty_strings, quote_chars), NIL))), append(body, NIL)));
    }

    /**
     * A mcaro for parsing log files.
     * For each line in FILE, binds VAR to a list, formed by calling @see READ-DELIMITED-LIST.
     * Then evals body.
     * Iteration stops when the form DONE becomes non-NIL, or on eof.  DONE may reference
     * VAR.
     */
    @LispMethod(comment = "A mcaro for parsing log files.\r\nFor each line in FILE, binds VAR to a list, formed by calling @see READ-DELIMITED-LIST.\r\nThen evals body.\r\nIteration stops when the form DONE becomes non-NIL, or on eof.  DONE may reference\r\nVAR.\nA mcaro for parsing log files.\nFor each line in FILE, binds VAR to a list, formed by calling @see READ-DELIMITED-LIST.\nThen evals body.\nIteration stops when the form DONE becomes non-NIL, or on eof.  DONE may reference\nVAR.")
    public static final SubLObject cdolines_read_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt65);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject var = NIL;
                    SubLObject file = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt65);
                    var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt65);
                    file = current.first();
                    current = current.rest();
                    {
                        SubLObject done = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt65);
                        current = current.rest();
                        if (NIL == current) {
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject line = $sym115$LINE;
                                SubLObject line_index = $sym116$LINE_INDEX;
                                SubLObject done_int = $sym117$DONE_INT;
                                return list(CLET, list(done_int), list(CDOLINES, list(line, file, done_int), list(CLET, list(bq_cons(line_index, $list_alt118), bq_cons(var, $list_alt119)), list(WHILE, list($sym121$_, line_index, list(LENGTH, line)), list(CMULTIPLE_VALUE_BIND, $list_alt124, list(READ_FROM_STRING, line, NIL, NIL, line_index), list(CPUSH, ITEM, var), listS(CSETQ, line_index, $list_alt129))), list(CSETQ, var, list(NREVERSE, var)), list(CSETQ, done_int, done), listS(PUNLESS, done, append(body, NIL)))));
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt65);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * A mcaro for parsing log files.
     * For each line in FILE, binds VAR to a list, formed by calling @see READ-DELIMITED-LIST.
     * Then evals body.
     * Iteration stops when the form DONE becomes non-NIL, or on eof.  DONE may reference
     * VAR.
     */
    @LispMethod(comment = "A mcaro for parsing log files.\r\nFor each line in FILE, binds VAR to a list, formed by calling @see READ-DELIMITED-LIST.\r\nThen evals body.\r\nIteration stops when the form DONE becomes non-NIL, or on eof.  DONE may reference\r\nVAR.\nA mcaro for parsing log files.\nFor each line in FILE, binds VAR to a list, formed by calling @see READ-DELIMITED-LIST.\nThen evals body.\nIteration stops when the form DONE becomes non-NIL, or on eof.  DONE may reference\nVAR.")
    public static SubLObject cdolines_read(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list77);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject file = NIL;
        destructuring_bind_must_consp(current, datum, $list77);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list77);
        file = current.first();
        current = current.rest();
        final SubLObject done = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list77);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject line = $sym127$LINE;
            final SubLObject line_index = $sym128$LINE_INDEX;
            final SubLObject done_int = $sym129$DONE_INT;
            return list(CLET, list(done_int), list(CDOLINES, list(line, file, done_int), list(CLET, list(bq_cons(line_index, $list130), bq_cons(var, $list131)), list(WHILE, list($sym133$_, line_index, list(LENGTH, line)), list(CMULTIPLE_VALUE_BIND, $list136, list(READ_FROM_STRING, line, NIL, NIL, line_index), list(CPUSH, ITEM, var), listS(CSETQ, line_index, $list141))), list(CSETQ, var, list(NREVERSE, var)), list(CSETQ, done_int, done), listS(PUNLESS, done, append(body, NIL)))));
        }
        cdestructuring_bind_error(datum, $list77);
        return NIL;
    }

    /**
     * Execute BODY with RECORD succcessively bound to each record in FILE.
     * Lines for which IGNORE-TEST returns true, e.g. comment lines, are ignored. A
     * record is defined as a list of consecutive lines between record separators.
     * Record separators are defined as consecutive lines passing SEPARATOR-TEST
     */
    @LispMethod(comment = "Execute BODY with RECORD succcessively bound to each record in FILE.\r\nLines for which IGNORE-TEST returns true, e.g. comment lines, are ignored. A\r\nrecord is defined as a list of consecutive lines between record separators.\r\nRecord separators are defined as consecutive lines passing SEPARATOR-TEST\nExecute BODY with RECORD succcessively bound to each record in FILE.\nLines for which IGNORE-TEST returns true, e.g. comment lines, are ignored. A\nrecord is defined as a list of consecutive lines between record separators.\nRecord separators are defined as consecutive lines passing SEPARATOR-TEST")
    public static final SubLObject do_file_records_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt132);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject record = NIL;
                    SubLObject file = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt132);
                    record = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt132);
                    file = current.first();
                    current = current.rest();
                    {
                        SubLObject separator_test = (current.isCons()) ? ((SubLObject) (current.first())) : symbol_function($sym133$WHITESPACE_STRING_);
                        destructuring_bind_must_listp(current, datum, $list_alt132);
                        current = current.rest();
                        {
                            SubLObject ignore_test = (current.isCons()) ? ((SubLObject) (current.first())) : symbol_function(FALSE);
                            destructuring_bind_must_listp(current, datum, $list_alt132);
                            current = current.rest();
                            if (NIL == current) {
                                current = temp;
                                {
                                    SubLObject body = current;
                                    SubLObject instream = $sym135$INSTREAM;
                                    SubLObject line = $sym136$LINE;
                                    return list(WITH_TEXT_FILE, listS(instream, file, $list_alt67), list(PWHEN, list(INPUT_STREAM_P, instream), list(CLET, list(record), list(CDO, list(list(line, listS(READ_LINE, instream, $list_alt70), listS(READ_LINE, instream, $list_alt70))), list(list(NULL, line)), listS(CSETQ, record, $list_alt5), list(PUNLESS, list(COR, list(FUNCALL, ignore_test, line), list(FUNCALL, separator_test, line)), list(CPUSH, line, record), list(CDO, list(list(line, listS(READ_LINE, instream, $list_alt70), listS(READ_LINE, instream, $list_alt70))), list(list(COR, list(NULL, line), list(FUNCALL, separator_test, line))), list(PUNLESS, list(FUNCALL, ignore_test, line), list(CPUSH, line, record)))), listS(PWHEN, record, list(CSETQ, record, list(NREVERSE, record)), append(body, NIL))))));
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt132);
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Execute BODY with RECORD succcessively bound to each record in FILE.
     * Lines for which IGNORE-TEST returns true, e.g. comment lines, are ignored. A
     * record is defined as a list of consecutive lines between record separators.
     * Record separators are defined as consecutive lines passing SEPARATOR-TEST
     */
    @LispMethod(comment = "Execute BODY with RECORD succcessively bound to each record in FILE.\r\nLines for which IGNORE-TEST returns true, e.g. comment lines, are ignored. A\r\nrecord is defined as a list of consecutive lines between record separators.\r\nRecord separators are defined as consecutive lines passing SEPARATOR-TEST\nExecute BODY with RECORD succcessively bound to each record in FILE.\nLines for which IGNORE-TEST returns true, e.g. comment lines, are ignored. A\nrecord is defined as a list of consecutive lines between record separators.\nRecord separators are defined as consecutive lines passing SEPARATOR-TEST")
    public static SubLObject do_file_records(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list144);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject record = NIL;
        SubLObject file = NIL;
        destructuring_bind_must_consp(current, datum, $list144);
        record = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list144);
        file = current.first();
        current = current.rest();
        final SubLObject separator_test = (current.isCons()) ? current.first() : symbol_function($sym145$WHITESPACE_STRING_);
        destructuring_bind_must_listp(current, datum, $list144);
        current = current.rest();
        final SubLObject ignore_test = (current.isCons()) ? current.first() : symbol_function(FALSE);
        destructuring_bind_must_listp(current, datum, $list144);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject instream = $sym147$INSTREAM;
            final SubLObject line = $sym148$LINE;
            return list(WITH_PRIVATE_TEXT_FILE, listS(instream, file, $list79), list(PWHEN, list(INPUT_STREAM_P, instream), list(CLET, list(record), list(CDO, list(list(line, listS(NETWORK_READ_LINE, instream, $list151), listS(NETWORK_READ_LINE, instream, $list151))), list(list(NULL, line)), listS(CSETQ, record, $list11), list(PUNLESS, list(COR, list(FUNCALL, ignore_test, line), list(FUNCALL, separator_test, line)), list(CPUSH, line, record), list(CDO, list(list(line, listS(NETWORK_READ_LINE, instream, $list151), listS(NETWORK_READ_LINE, instream, $list151))), list(list(COR, list(NULL, line), list(FUNCALL, separator_test, line))), list(PUNLESS, list(FUNCALL, ignore_test, line), list(CPUSH, line, record)))), listS(PWHEN, record, list(CSETQ, record, list(NREVERSE, record)), append(body, NIL))))));
        }
        cdestructuring_bind_error(datum, $list144);
        return NIL;
    }

    /**
     * Execute BODY with FILE-VAR bound to each file and subdirectory in DIRECTORY.
     * If INCLUDE-DIRECTORY? is non-nil, FILE-VAR will be the entire path of the file or directory,
     * otherwise it will only be the filename itself.
     *
     * @unknown baxter
     */
    @LispMethod(comment = "Execute BODY with FILE-VAR bound to each file and subdirectory in DIRECTORY.\r\nIf INCLUDE-DIRECTORY? is non-nil, FILE-VAR will be the entire path of the file or directory,\r\notherwise it will only be the filename itself.\r\n\r\n@unknown baxter\nExecute BODY with FILE-VAR bound to each file and subdirectory in DIRECTORY.\nIf INCLUDE-DIRECTORY? is non-nil, FILE-VAR will be the entire path of the file or directory,\notherwise it will only be the filename itself.")
    public static final SubLObject do_directory_contents_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt139);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject file_var = NIL;
                    SubLObject directory = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt139);
                    file_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt139);
                    directory = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_12 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt139);
                            current_12 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt139);
                            if (NIL == member(current_12, $list_alt140, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_12 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt139);
                        }
                        {
                            SubLObject include_directoryP_tail = property_list_member($kw141$INCLUDE_DIRECTORY_, current);
                            SubLObject include_directoryP = (NIL != include_directoryP_tail) ? ((SubLObject) (cadr(include_directoryP_tail))) : T;
                            SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
                            SubLObject progress_message = (NIL != progress_message_tail) ? ((SubLObject) (cadr(progress_message_tail))) : NIL;
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject directory_contents_var = $sym142$DIRECTORY_CONTENTS_VAR;
                                SubLObject progress_message_var = $sym143$PROGRESS_MESSAGE_VAR;
                                return list(PROGN, listS(CHECK_TYPE, directory, $list_alt145), list(CLET, list(list(directory_contents_var, list(DIRECTORY, directory, include_directoryP)), list(progress_message_var, progress_message), list($silent_progressP$, list(CNOT, list(STRINGP, progress_message_var)))), listS(PROGRESS_CSOME, list(file_var, directory_contents_var, progress_message_var, done), append(body, NIL))));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Execute BODY with FILE-VAR bound to each file and subdirectory in DIRECTORY.
     * If INCLUDE-DIRECTORY? is non-nil, FILE-VAR will be the entire path of the file or directory,
     * otherwise it will only be the filename itself.
     *
     * @unknown baxter
     */
    @LispMethod(comment = "Execute BODY with FILE-VAR bound to each file and subdirectory in DIRECTORY.\r\nIf INCLUDE-DIRECTORY? is non-nil, FILE-VAR will be the entire path of the file or directory,\r\notherwise it will only be the filename itself.\r\n\r\n@unknown baxter\nExecute BODY with FILE-VAR bound to each file and subdirectory in DIRECTORY.\nIf INCLUDE-DIRECTORY? is non-nil, FILE-VAR will be the entire path of the file or directory,\notherwise it will only be the filename itself.")
    public static SubLObject do_directory_contents(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list153);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject file_var = NIL;
        SubLObject directory = NIL;
        destructuring_bind_must_consp(current, datum, $list153);
        file_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list153);
        directory = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$14 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list153);
            current_$14 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list153);
            if (NIL == member(current_$14, $list154, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$14 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list153);
        }
        final SubLObject include_directoryP_tail = property_list_member($kw155$INCLUDE_DIRECTORY_, current);
        final SubLObject include_directoryP = (NIL != include_directoryP_tail) ? cadr(include_directoryP_tail) : T;
        final SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (NIL != progress_message_tail) ? cadr(progress_message_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject sort_fn_tail = property_list_member($SORT_FN, current);
        final SubLObject sort_fn = (NIL != sort_fn_tail) ? cadr(sort_fn_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject directory_contents_var = $sym157$DIRECTORY_CONTENTS_VAR;
        final SubLObject progress_message_var = $sym158$PROGRESS_MESSAGE_VAR;
        return list(PROGN, listS(CHECK_TYPE, directory, $list160), list(CLET, list(list(directory_contents_var, list(DIRECTORY, directory, include_directoryP)), list(progress_message_var, progress_message), list($silent_progressP$, list(CNOT, list(STRINGP, progress_message_var)))), list(PWHEN, list(FUNCTION_SPEC_P, sort_fn), list(CSETQ, directory_contents_var, list(SORT, directory_contents_var, sort_fn))), listS(PROGRESS_CSOME, list(file_var, directory_contents_var, progress_message_var, done), append(body, NIL))));
    }

    public static final SubLObject do_directory_subdirectories_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt150);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject subdirectory = NIL;
                    SubLObject directory = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt150);
                    subdirectory = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt150);
                    directory = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_13 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt150);
                            current_13 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt150);
                            if (NIL == member(current_13, $list_alt151, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_13 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt150);
                        }
                        {
                            SubLObject include_directoryP_tail = property_list_member($kw141$INCLUDE_DIRECTORY_, current);
                            SubLObject include_directoryP = (NIL != include_directoryP_tail) ? ((SubLObject) (cadr(include_directoryP_tail))) : T;
                            current = temp;
                            {
                                SubLObject body = current;
                                return list(DO_DIRECTORY_CONTENTS, list(subdirectory, directory, $kw141$INCLUDE_DIRECTORY_, include_directoryP), listS(PWHEN, list(DIRECTORY_P, list(FCOND, list(include_directoryP, subdirectory), list(listS(ENDS_WITH, directory, $list_alt156), list(CCONCATENATE, directory, subdirectory)), list(T, list(CCONCATENATE, directory, $str_alt158$_, subdirectory)))), list(PUNLESS, listS(EQL, list(LAST_CHAR, subdirectory), $list_alt160), list(CSETQ, subdirectory, listS(CCONCATENATE, subdirectory, $list_alt156))), append(body, NIL)));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_directory_subdirectories(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list167);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject subdirectory = NIL;
        SubLObject directory = NIL;
        destructuring_bind_must_consp(current, datum, $list167);
        subdirectory = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list167);
        directory = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$15 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list167);
            current_$15 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list167);
            if (NIL == member(current_$15, $list168, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$15 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list167);
        }
        final SubLObject include_directoryP_tail = property_list_member($kw155$INCLUDE_DIRECTORY_, current);
        final SubLObject include_directoryP = (NIL != include_directoryP_tail) ? cadr(include_directoryP_tail) : T;
        final SubLObject body;
        current = body = temp;
        return list(DO_DIRECTORY_CONTENTS, list(subdirectory, directory, $kw155$INCLUDE_DIRECTORY_, include_directoryP), listS(PWHEN, list(DIRECTORY_P, list(FCOND, list(include_directoryP, subdirectory), list(listS(ENDS_WITH, directory, $list173), list(CCONCATENATE, directory, subdirectory)), list(T, list(CCONCATENATE, directory, $str175$_, subdirectory)))), list(PUNLESS, listS(EQL, list(LAST_CHAR, subdirectory), $list177), list(CSETQ, subdirectory, listS(CCONCATENATE, subdirectory, $list173))), append(body, NIL)));
    }

    /**
     * Descend recursively into DIRECTORY, executing BODY with FILE-VAR bound to the entire path of each file
     * (just the files, not the subdirectories).
     * The order of iterations is arbitrary.
     *
     * @unknown bgottesm
     */
    @LispMethod(comment = "Descend recursively into DIRECTORY, executing BODY with FILE-VAR bound to the entire path of each file\r\n(just the files, not the subdirectories).\r\nThe order of iterations is arbitrary.\r\n\r\n@unknown bgottesm\nDescend recursively into DIRECTORY, executing BODY with FILE-VAR bound to the entire path of each file\n(just the files, not the subdirectories).\nThe order of iterations is arbitrary.")
    public static final SubLObject do_directory_tree_files_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt161);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject file_var = NIL;
                    SubLObject directory = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt161);
                    file_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt161);
                    directory = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_14 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt161);
                            current_14 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt161);
                            if (NIL == member(current_14, $list_alt162, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_14 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt161);
                        }
                        {
                            SubLObject include_directoryP_tail = property_list_member($kw141$INCLUDE_DIRECTORY_, current);
                            SubLObject include_directoryP = (NIL != include_directoryP_tail) ? ((SubLObject) (cadr(include_directoryP_tail))) : T;
                            SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
                            SubLObject progress_message = (NIL != progress_message_tail) ? ((SubLObject) (cadr(progress_message_tail))) : $str_alt163$Processing_directory_tree_files__;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject directory_list_var = $sym164$DIRECTORY_LIST_VAR;
                                SubLObject current_directory_var = $sym165$CURRENT_DIRECTORY_VAR;
                                return list(PROGN, listS(CHECK_TYPE, directory, $list_alt145), list(CLET, list(list(directory_list_var, list(LIST, directory))), list(CDO, list(list(current_directory_var, list(FIRST, directory_list_var), list(FIRST, directory_list_var))), list(list(NULL, directory_list_var)), list(CPOP, directory_list_var), list(DO_DIRECTORY_CONTENTS, list(file_var, current_directory_var, $kw141$INCLUDE_DIRECTORY_, include_directoryP, $PROGRESS_MESSAGE, list(FWHEN, list(STRINGP, progress_message), list(CCONCATENATE, progress_message, list(FORMAT_NIL, $str_alt171$___Directory___S, current_directory_var)))), list(PIF, list(DIRECTORY_P, file_var), list(CPUSH, file_var, directory_list_var), bq_cons(PROGN, append(body, NIL)))))));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Descend recursively into DIRECTORY, executing BODY with FILE-VAR bound to the entire path of each file
     * (just the files, not the subdirectories).
     * The order of iterations is arbitrary.
     *
     * @unknown bgottesm
     */
    @LispMethod(comment = "Descend recursively into DIRECTORY, executing BODY with FILE-VAR bound to the entire path of each file\r\n(just the files, not the subdirectories).\r\nThe order of iterations is arbitrary.\r\n\r\n@unknown bgottesm\nDescend recursively into DIRECTORY, executing BODY with FILE-VAR bound to the entire path of each file\n(just the files, not the subdirectories).\nThe order of iterations is arbitrary.")
    public static SubLObject do_directory_tree_files(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list178);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject file_var = NIL;
        SubLObject directory = NIL;
        destructuring_bind_must_consp(current, datum, $list178);
        file_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list178);
        directory = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$16 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list178);
            current_$16 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list178);
            if (NIL == member(current_$16, $list179, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$16 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list178);
        }
        final SubLObject include_directoryP_tail = property_list_member($kw155$INCLUDE_DIRECTORY_, current);
        final SubLObject include_directoryP = (NIL != include_directoryP_tail) ? cadr(include_directoryP_tail) : T;
        final SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (NIL != progress_message_tail) ? cadr(progress_message_tail) : $str180$Processing_directory_tree_files__;
        final SubLObject body;
        current = body = temp;
        final SubLObject directory_list_var = $sym181$DIRECTORY_LIST_VAR;
        final SubLObject current_directory_var = $sym182$CURRENT_DIRECTORY_VAR;
        return list(PROGN, listS(CHECK_TYPE, directory, $list160), list(CLET, list(list(directory_list_var, list(LIST, directory))), list(CDO, list(list(current_directory_var, list(FIRST, directory_list_var), list(FIRST, directory_list_var))), list(list(NULL, directory_list_var)), list(CPOP, directory_list_var), list(DO_DIRECTORY_CONTENTS, list(file_var, current_directory_var, $kw155$INCLUDE_DIRECTORY_, include_directoryP, $PROGRESS_MESSAGE, list(FWHEN, list(STRINGP, progress_message), list(CCONCATENATE, progress_message, list(FORMAT_NIL, $str188$___Directory___S, current_directory_var)))), list(PIF, list(DIRECTORY_P, file_var), list(CPUSH, file_var, directory_list_var), bq_cons(PROGN, append(body, NIL)))))));
    }

    /**
     *
     *
     * @return INTEGERP; How many files are in DIRECTORY?
     * @unknown baxter
     */
    @LispMethod(comment = "@return INTEGERP; How many files are in DIRECTORY?\r\n@unknown baxter")
    public static final SubLObject directory_file_count_alt(SubLObject directory) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(directory, DIRECTORY_P);
            {
                SubLObject count = NIL;
                SubLObject params = cconcatenate($str_alt172$_1_, new SubLObject[]{ format_nil.format_nil_a_no_copy(directory), $str_alt173$___wc__l });
                SubLObject ps_result_strings = os_process_utilities.os_process_evaluation_output_strings($$$ls, list(params), UNPROVIDED, UNPROVIDED);
                if (NIL != list_utilities.singletonP(ps_result_strings)) {
                    {
                        SubLObject first_string = ps_result_strings.first();
                        SubLObject read_count = read_from_string(first_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        if (read_count.isInteger()) {
                            count = read_count;
                        }
                    }
                }
                if (!count.isInteger()) {
                    count = ZERO_INTEGER;
                    SubLTrampolineFile.checkType(directory, DIRECTORY_P);
                    {
                        SubLObject directory_contents_var = Filesys.directory(directory, T);
                        SubLObject progress_message_var = NIL;
                        {
                            SubLObject _prev_bind_0 = $silent_progressP$.currentBinding(thread);
                            try {
                                $silent_progressP$.bind(makeBoolean(!progress_message_var.isString()), thread);
                                {
                                    SubLObject list_var = directory_contents_var;
                                    $progress_note$.setDynamicValue(progress_message_var, thread);
                                    $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                                    $progress_total$.setDynamicValue(length(list_var), thread);
                                    $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                                    {
                                        SubLObject _prev_bind_0_15 = $last_percent_progress_index$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                                        SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                        try {
                                            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                            $last_percent_progress_prediction$.bind(NIL, thread);
                                            $within_noting_percent_progress$.bind(T, thread);
                                            $percent_progress_start_time$.bind(get_universal_time(), thread);
                                            noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                                            {
                                                SubLObject csome_list_var = list_var;
                                                SubLObject file = NIL;
                                                for (file = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , file = csome_list_var.first()) {
                                                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                    count = add(count, ONE_INTEGER);
                                                }
                                            }
                                            noting_percent_progress_postamble();
                                        } finally {
                                            $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                            $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                            $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                            $last_percent_progress_index$.rebind(_prev_bind_0_15, thread);
                                        }
                                    }
                                }
                            } finally {
                                $silent_progressP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return count;
            }
        }
    }

    /**
     *
     *
     * @return INTEGERP; How many files are in DIRECTORY?
     * @unknown baxter
     */
    @LispMethod(comment = "@return INTEGERP; How many files are in DIRECTORY?\r\n@unknown baxter")
    public static SubLObject directory_file_count(final SubLObject directory) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != Filesys.directory_p(directory) : "! Filesys.directory_p(directory) " + ("Filesys.directory_p(directory) " + "CommonSymbols.NIL != Filesys.directory_p(directory) ") + directory;
        SubLObject count = NIL;
        if (!count.isInteger()) {
            count = ZERO_INTEGER;
            assert NIL != Filesys.directory_p(directory) : "! Filesys.directory_p(directory) " + ("Filesys.directory_p(directory) " + "CommonSymbols.NIL != Filesys.directory_p(directory) ") + directory;
            SubLObject directory_contents_var = Filesys.directory(directory, T);
            final SubLObject progress_message_var = NIL;
            final SubLObject _prev_bind_0 = $silent_progressP$.currentBinding(thread);
            try {
                $silent_progressP$.bind(makeBoolean(!progress_message_var.isString()), thread);
                if (NIL.isFunctionSpec()) {
                    directory_contents_var = Sort.sort(directory_contents_var, NIL, UNPROVIDED);
                }
                final SubLObject list_var = directory_contents_var;
                final SubLObject _prev_bind_0_$17 = $progress_note$.currentBinding(thread);
                final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
                final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
                try {
                    $progress_note$.bind(NIL != progress_message_var ? progress_message_var : $$$cdolist, thread);
                    $progress_start_time$.bind(get_universal_time(), thread);
                    $progress_total$.bind(length(list_var), thread);
                    $progress_sofar$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_prediction$.bind(NIL, thread);
                    $within_noting_percent_progress$.bind(T, thread);
                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                    try {
                        noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                        SubLObject csome_list_var = list_var;
                        SubLObject file = NIL;
                        file = csome_list_var.first();
                        while (NIL != csome_list_var) {
                            count = add(count, ONE_INTEGER);
                            $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                            note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                            csome_list_var = csome_list_var.rest();
                            file = csome_list_var.first();
                        } 
                    } finally {
                        final SubLObject _prev_bind_0_$18 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            noting_percent_progress_postamble();
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$18, thread);
                        }
                    }
                } finally {
                    $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                    $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                    $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                    $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                    $progress_sofar$.rebind(_prev_bind_4, thread);
                    $progress_total$.rebind(_prev_bind_3, thread);
                    $progress_start_time$.rebind(_prev_bind_2, thread);
                    $progress_note$.rebind(_prev_bind_0_$17, thread);
                }
            } finally {
                $silent_progressP$.rebind(_prev_bind_0, thread);
            }
        }
        return count;
    }

    /**
     *
     *
     * @param directory
     * 		the path of the directory to be listed
     * @param regexp
     * 		the regular expression to be used to filter the results
     * @param include-path
     * 		whether the filenames returned should include the directory path or not
     * @param comp-options
     * 		compiler options for compiling the regular expression
     * @param match-options
     * 		regular expression matching options
     * @see FIND-ALL-MATCHES-WITHIN-STRING
     * @return LISTP of STRINGP of the files that matched
     */
    @LispMethod(comment = "@param directory\r\n\t\tthe path of the directory to be listed\r\n@param regexp\r\n\t\tthe regular expression to be used to filter the results\r\n@param include-path\r\n\t\twhether the filenames returned should include the directory path or not\r\n@param comp-options\r\n\t\tcompiler options for compiling the regular expression\r\n@param match-options\r\n\t\tregular expression matching options\r\n@see FIND-ALL-MATCHES-WITHIN-STRING\r\n@return LISTP of STRINGP of the files that matched")
    public static final SubLObject list_directory_alt(SubLObject directory, SubLObject regexp, SubLObject include_path, SubLObject comp_options, SubLObject match_options) {
        if (include_path == UNPROVIDED) {
            include_path = NIL;
        }
        if (comp_options == UNPROVIDED) {
            comp_options = NIL;
        }
        if (match_options == UNPROVIDED) {
            match_options = NIL;
        }
        return Mapping.mapcar(SECOND, regular_expression_utilities.list_grep(regexp, Filesys.directory(directory, include_path), comp_options, match_options));
    }

    /**
     *
     *
     * @param directory
     * 		the path of the directory to be listed
     * @param regexp
     * 		the regular expression to be used to filter the results
     * @param include-path
     * 		whether the filenames returned should include the directory path or not
     * @param comp-options
     * 		compiler options for compiling the regular expression
     * @param match-options
     * 		regular expression matching options
     * @see FIND-ALL-MATCHES-WITHIN-STRING
     * @return LISTP of STRINGP of the files that matched
     */
    @LispMethod(comment = "@param directory\r\n\t\tthe path of the directory to be listed\r\n@param regexp\r\n\t\tthe regular expression to be used to filter the results\r\n@param include-path\r\n\t\twhether the filenames returned should include the directory path or not\r\n@param comp-options\r\n\t\tcompiler options for compiling the regular expression\r\n@param match-options\r\n\t\tregular expression matching options\r\n@see FIND-ALL-MATCHES-WITHIN-STRING\r\n@return LISTP of STRINGP of the files that matched")
    public static SubLObject list_directory(final SubLObject directory, final SubLObject regexp, SubLObject include_path, SubLObject comp_options, SubLObject match_options) {
        if (include_path == UNPROVIDED) {
            include_path = NIL;
        }
        if (comp_options == UNPROVIDED) {
            comp_options = NIL;
        }
        if (match_options == UNPROVIDED) {
            match_options = NIL;
        }
        return Mapping.mapcar(SECOND, regular_expression_utilities.list_grep(regexp, Filesys.directory(directory, include_path), comp_options, match_options));
    }

    /**
     *
     *
     * @param a
     * 		LISTP of STRINGP to be interpreted as file designations
     * @return a LISTP of STRINGP of file designations in their FILE-WRITE-DATE order
     */
    @LispMethod(comment = "@param a\r\n\t\tLISTP of STRINGP to be interpreted as file designations\r\n@return a LISTP of STRINGP of file designations in their FILE-WRITE-DATE order")
    public static final SubLObject sort_files_by_date_alt(SubLObject file_list) {
        return Sort.sort(file_list, $sym121$_, FILE_WRITE_DATE);
    }

    /**
     *
     *
     * @param a
     * 		LISTP of STRINGP to be interpreted as file designations
     * @return a LISTP of STRINGP of file designations in their FILE-WRITE-DATE order
     */
    @LispMethod(comment = "@param a\r\n\t\tLISTP of STRINGP to be interpreted as file designations\r\n@return a LISTP of STRINGP of file designations in their FILE-WRITE-DATE order")
    public static SubLObject sort_files_by_date(final SubLObject file_list) {
        return Sort.sort(file_list, $sym133$_, FILE_WRITE_DATE);
    }

    /**
     *
     *
     * @param PATH
     * 		stringp; the location of the file
     * @return stringp; the entire file at PATH as one string
     */
    @LispMethod(comment = "@param PATH\r\n\t\tstringp; the location of the file\r\n@return stringp; the entire file at PATH as one string")
    public static final SubLObject slurp_file_alt(SubLObject path) {
        {
            SubLObject string = NIL;
            SubLObject stream = NIL;
            try {
                stream = make_private_string_output_stream();
                {
                    SubLObject stream_16 = NIL;
                    try {
                        stream_16 = compatibility.open_text(path, $INPUT, NIL);
                        if (!stream_16.isStream()) {
                            Errors.error($str_alt56$Unable_to_open__S, path);
                        }
                        {
                            SubLObject infile = stream_16;
                            if (infile.isStream()) {
                                {
                                    SubLObject line = NIL;
                                    for (line = read_line(infile, NIL, NIL, UNPROVIDED); NIL != line; line = read_line(infile, NIL, NIL, UNPROVIDED)) {
                                        write_string(line, stream, UNPROVIDED, UNPROVIDED);
                                        terpri(stream);
                                    }
                                }
                            }
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                            try {
                                bind($is_thread_performing_cleanupP$, T);
                                if (stream_16.isStream()) {
                                    close(stream_16, UNPROVIDED);
                                }
                            } finally {
                                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                }
                string = get_output_stream_string(stream);
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        close(stream, UNPROVIDED);
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            return string;
        }
    }

    /**
     *
     *
     * @param PATH
     * 		stringp; the location of the file
     * @return stringp; the entire file at PATH as one string
     */
    @LispMethod(comment = "@param PATH\r\n\t\tstringp; the location of the file\r\n@return stringp; the entire file at PATH as one string")
    public static SubLObject slurp_file(final SubLObject path) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject string = NIL;
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            SubLObject stream_$19 = NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream_$19 = compatibility.open_text(path, $INPUT);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream_$19.isStream()) {
                    Errors.error($str68$Unable_to_open__S, path);
                }
                final SubLObject infile = stream_$19;
                if (infile.isStream()) {
                    SubLObject line;
                    for (line = NIL, line = cdolines_get_next_line(infile); NIL != line; line = cdolines_get_next_line(infile)) {
                        write_string(line, stream, UNPROVIDED, UNPROVIDED);
                        terpri(stream);
                    }
                }
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (stream_$19.isStream()) {
                        close(stream_$19, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
            string = get_output_stream_string(stream);
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                close(stream, UNPROVIDED);
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return string;
    }

    public static SubLObject slurp_file_robust(final SubLObject path) {
        if (NIL != Filesys.probe_file(path)) {
            return slurp_file(path);
        }
        return $str22$;
    }

    /**
     *
     *
     * @param PATH
     * 		stringp; the location of the file
     * @return list of stringp; the entire file at PATH as a list of strings,
    broken by newlines
     */
    @LispMethod(comment = "@param PATH\r\n\t\tstringp; the location of the file\r\n@return list of stringp; the entire file at PATH as a list of strings,\r\nbroken by newlines")
    public static final SubLObject slurp_file_lines_alt(SubLObject path) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject lines = NIL;
                SubLObject file_var = path;
                SubLObject stream = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            stream = compatibility.open_text(file_var, $INPUT, NIL);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (!stream.isStream()) {
                        Errors.error($str_alt56$Unable_to_open__S, file_var);
                    }
                    {
                        SubLObject stream_var = stream;
                        if (stream_var.isStream()) {
                            {
                                SubLObject stream_var_17 = stream_var;
                                SubLObject line_number_var = NIL;
                                SubLObject line = NIL;
                                for (line_number_var = ZERO_INTEGER, line = read_line(stream_var_17, NIL, NIL, UNPROVIDED); NIL != line; line_number_var = number_utilities.f_1X(line_number_var) , line = read_line(stream_var_17, NIL, NIL, UNPROVIDED)) {
                                    lines = cons(line, lines);
                                }
                            }
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return nreverse(lines);
            }
        }
    }

    /**
     *
     *
     * @param PATH
     * 		stringp; the location of the file
     * @return list of stringp; the entire file at PATH as a list of strings,
    broken by newlines
     */
    @LispMethod(comment = "@param PATH\r\n\t\tstringp; the location of the file\r\n@return list of stringp; the entire file at PATH as a list of strings,\r\nbroken by newlines")
    public static SubLObject slurp_file_lines(final SubLObject path) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject lines = NIL;
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(path, $INPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str68$Unable_to_open__S, path);
            }
            final SubLObject stream_var = stream;
            if (stream_var.isStream()) {
                final SubLObject stream_var_$20 = stream_var;
                SubLObject line_number_var = NIL;
                SubLObject line = NIL;
                line_number_var = ZERO_INTEGER;
                for (line = do_stream_lines_get_next_line(stream_var_$20); NIL != line; line = do_stream_lines_get_next_line(stream_var_$20)) {
                    lines = cons(line, lines);
                    line_number_var = number_utilities.f_1X(line_number_var);
                }
            }
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return nreverse(lines);
    }

    /**
     * Like @xref probe-file except does not error on an invalid filename.
     */
    @LispMethod(comment = "Like @xref probe-file except does not error on an invalid filename.")
    public static final SubLObject file_existsP_alt(SubLObject filename) {
        {
            SubLObject existsP = NIL;
            SubLObject ignore_errors_tag = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, symbol_function(IGNORE_ERRORS_HANDLER));
                        try {
                            existsP = list_utilities.sublisp_boolean(Filesys.probe_file(filename));
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
            }
            return existsP;
        }
    }

    /**
     * Like @xref probe-file except does not error on an invalid filename.
     */
    @LispMethod(comment = "Like @xref probe-file except does not error on an invalid filename.")
    public static SubLObject file_existsP(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject existsP = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    existsP = list_utilities.sublisp_boolean(Filesys.probe_file(filename));
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        return existsP;
    }

    /**
     * If we can't probe FILENAME, give an informative string telling why not, including where along the path the probe fails if applicable.
     *
     * @param FILENAME
    string
     * 		
     * @return string
     * @unknown jantos
     * @unknown done
     */
    @LispMethod(comment = "If we can\'t probe FILENAME, give an informative string telling why not, including where along the path the probe fails if applicable.\r\n\r\n@param FILENAME\nstring\r\n\t\t\r\n@return string\r\n@unknown jantos\r\n@unknown done")
    public static final SubLObject why_not_probe_fileP_alt(SubLObject filename) {
        if (NIL != Filesys.probe_file(filename)) {
            return NIL;
        }
        {
            SubLObject separator = (NIL != string_utilities.char_position(CHAR_backslash, filename, UNPROVIDED)) ? ((SubLObject) ($str_alt177$_)) : $str_alt158$_;
            SubLObject path_components = string_utilities.string_tokenize(filename, $list_alt178, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject absolute_pathP = eq(Strings.sublisp_char(separator, ZERO_INTEGER), Strings.sublisp_char(filename, ZERO_INTEGER));
            SubLObject building_path = (NIL != absolute_pathP) ? ((SubLObject) (separator)) : $str_alt15$;
            SubLObject found_bad_pathP = NIL;
            SubLObject error_message = NIL;
            if (NIL != absolute_pathP) {
                path_components = path_components.rest();
            }
            if (NIL == found_bad_pathP) {
                {
                    SubLObject csome_list_var = path_components;
                    SubLObject this_component = NIL;
                    for (this_component = csome_list_var.first(); !((NIL != found_bad_pathP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , this_component = csome_list_var.first()) {
                        building_path = cconcatenate(building_path, this_component);
                        if (NIL == Filesys.probe_file(building_path)) {
                            if ((NIL != absolute_pathP) || (NIL == Filesys.probe_file($str_alt15$))) {
                                error_message = format(NIL, $str_alt179$Could_not_find__A, building_path);
                            } else {
                                error_message = format(NIL, $str_alt180$Could_not_find__A_A, Filesys.probe_file($str_alt15$), building_path);
                            }
                            found_bad_pathP = T;
                        }
                        building_path = cconcatenate(building_path, separator);
                    }
                }
            }
            if (NIL == found_bad_pathP) {
                if (NIL != absolute_pathP) {
                    error_message = $str_alt181$File_not_found_;
                } else {
                    error_message = format(NIL, $str_alt182$File_not_found_from_directory__A, Filesys.probe_file($str_alt15$));
                }
            }
            return error_message;
        }
    }

    /**
     * If we can't probe FILENAME, give an informative string telling why not, including where along the path the probe fails if applicable.
     *
     * @param FILENAME
    		string
     * 		
     * @return string
     * @unknown jantos
     * @unknown done
     */
    @LispMethod(comment = "If we can\'t probe FILENAME, give an informative string telling why not, including where along the path the probe fails if applicable.\r\n\r\n@param FILENAME\n\t\tstring\r\n\t\t\r\n@return string\r\n@unknown jantos\r\n@unknown done")
    public static SubLObject why_not_probe_fileP(final SubLObject filename) {
        if (NIL != Filesys.probe_file(filename)) {
            return NIL;
        }
        final SubLObject separator = (NIL != string_utilities.char_position(CHAR_backslash, filename, UNPROVIDED)) ? $str192$_ : $str175$_;
        SubLObject path_components = string_utilities.string_tokenize(filename, $list193, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject absolute_pathP = eq(Strings.sublisp_char(separator, ZERO_INTEGER), Strings.sublisp_char(filename, ZERO_INTEGER));
        SubLObject building_path = (NIL != absolute_pathP) ? separator : $str22$;
        SubLObject found_bad_pathP = NIL;
        SubLObject error_message = NIL;
        if (NIL != absolute_pathP) {
            path_components = path_components.rest();
        }
        if (NIL == found_bad_pathP) {
            SubLObject csome_list_var = path_components;
            SubLObject this_component = NIL;
            this_component = csome_list_var.first();
            while ((NIL == found_bad_pathP) && (NIL != csome_list_var)) {
                building_path = cconcatenate(building_path, this_component);
                if (NIL == Filesys.probe_file(building_path)) {
                    if ((NIL != absolute_pathP) || (NIL == Filesys.probe_file($str22$))) {
                        error_message = format(NIL, $str194$Could_not_find__A, building_path);
                    } else {
                        error_message = format(NIL, $str195$Could_not_find__A_A, Filesys.probe_file($str22$), building_path);
                    }
                    found_bad_pathP = T;
                }
                building_path = cconcatenate(building_path, separator);
                csome_list_var = csome_list_var.rest();
                this_component = csome_list_var.first();
            } 
        }
        if (NIL == found_bad_pathP) {
            if (NIL != absolute_pathP) {
                error_message = $str196$File_not_found_;
            } else {
                error_message = format(NIL, $str197$File_not_found_from_directory__A, Filesys.probe_file($str22$));
            }
        }
        return error_message;
    }

    /**
     * Look at the string PATH and determine whether it's for a unix or dos filesystem.
     *
     * @param PATH
    string
     * 		
     * @return keyword ;; :unix or :dos or nil
     * @unknown jantos
     * @unknown done
     */
    @LispMethod(comment = "Look at the string PATH and determine whether it\'s for a unix or dos filesystem.\r\n\r\n@param PATH\nstring\r\n\t\t\r\n@return keyword ;; :unix or :dos or nil\r\n@unknown jantos\r\n@unknown done")
    public static final SubLObject guess_path_type_alt(SubLObject path) {
        if (NIL != string_utilities.char_position(CHAR_slash, path, UNPROVIDED)) {
            return $UNIX;
        } else {
            if (NIL != string_utilities.char_position(CHAR_backslash, path, UNPROVIDED)) {
                return $DOS;
            } else {
                return NIL;
            }
        }
    }

    /**
     * Look at the string PATH and determine whether it's for a unix or dos filesystem.
     *
     * @param PATH
    		string
     * 		
     * @return keyword ;; :unix or :dos or nil
     * @unknown jantos
     * @unknown done
     */
    @LispMethod(comment = "Look at the string PATH and determine whether it\'s for a unix or dos filesystem.\r\n\r\n@param PATH\n\t\tstring\r\n\t\t\r\n@return keyword ;; :unix or :dos or nil\r\n@unknown jantos\r\n@unknown done")
    public static SubLObject guess_path_type(final SubLObject path) {
        if (NIL != string_utilities.char_position(CHAR_slash, path, UNPROVIDED)) {
            return $UNIX;
        }
        if (NIL != string_utilities.char_position(CHAR_backslash, path, UNPROVIDED)) {
            return $DOS;
        }
        return NIL;
    }

    /**
     * Like @xref guess-path-type but guesses unix if it's not sure.
     *
     * @unknown pace
     */
    @LispMethod(comment = "Like @xref guess-path-type but guesses unix if it\'s not sure.\r\n\r\n@unknown pace")
    public static final SubLObject guess_path_type_robust_alt(SubLObject path) {
        {
            SubLObject path_type = com.cyc.cycjava.cycl.file_utilities.guess_path_type(path);
            return NIL != path_type ? ((SubLObject) (path_type)) : $UNIX;
        }
    }

    /**
     * Like @xref guess-path-type but guesses unix if it's not sure.
     *
     * @unknown pace
     */
    @LispMethod(comment = "Like @xref guess-path-type but guesses unix if it\'s not sure.\r\n\r\n@unknown pace")
    public static SubLObject guess_path_type_robust(final SubLObject path) {
        final SubLObject path_type = guess_path_type(path);
        return NIL != path_type ? path_type : $UNIX;
    }

    /**
     *
     *
     * @return stringp; the default path used by this image, as a system-specific string.  Also commonly known as 'where was this image started from?'
     */
    @LispMethod(comment = "@return stringp; the default path used by this image, as a system-specific string.  Also commonly known as \'where was this image started from?\'")
    public static final SubLObject absolute_default_path_string_alt() {
        return com.cyc.cycjava.cycl.file_utilities.possibly_append_path_separator_char(format_nil.format_nil_a(Filesys.probe_file($str_alt16$_)));
    }

    /**
     *
     *
     * @return stringp; the default path used by this image, as a system-specific string.  Also commonly known as 'where was this image started from?'
     */
    @LispMethod(comment = "@return stringp; the default path used by this image, as a system-specific string.  Also commonly known as \'where was this image started from?\'")
    public static SubLObject absolute_default_path_string() {
        return possibly_append_path_separator_char(format_nil.format_nil_a(Filesys.probe_file($str23$_)));
    }

    /**
     * Appends the appropriate directory path separator character to the end of RAW-PATH-STRING if it is missing.
     *
     * @unknown the internals of this function sometimes incorrectly assume Linux.
     * @unknown pace
     */
    @LispMethod(comment = "Appends the appropriate directory path separator character to the end of RAW-PATH-STRING if it is missing.\r\n\r\n@unknown the internals of this function sometimes incorrectly assume Linux.\r\n@unknown pace")
    public static final SubLObject possibly_append_path_separator_char_alt(SubLObject raw_path_string) {
        {
            SubLObject path_type = com.cyc.cycjava.cycl.file_utilities.guess_path_type_robust(raw_path_string);
            SubLObject separator = com.cyc.cycjava.cycl.file_utilities.path_separator_char(path_type);
            SubLObject path_string = (string_utilities.last_char(raw_path_string) == separator) ? ((SubLObject) (raw_path_string)) : string_utilities.post_add_character_to_string(separator, raw_path_string);
            return path_string;
        }
    }

    /**
     * Appends the appropriate directory path separator character to the end of RAW-PATH-STRING if it is missing.
     *
     * @unknown the internals of this function sometimes incorrectly assume Linux.
     * @unknown pace
     */
    @LispMethod(comment = "Appends the appropriate directory path separator character to the end of RAW-PATH-STRING if it is missing.\r\n\r\n@unknown the internals of this function sometimes incorrectly assume Linux.\r\n@unknown pace")
    public static SubLObject possibly_append_path_separator_char(final SubLObject raw_path_string) {
        final SubLObject path_type = guess_path_type_robust(raw_path_string);
        final SubLObject separator = path_separator_char(path_type);
        final SubLObject path_string = (string_utilities.last_char(raw_path_string).eql(separator)) ? raw_path_string : string_utilities.post_add_character_to_string(separator, raw_path_string);
        return path_string;
    }

    /**
     *
     *
     * @param LOGICAL-PATH
     * 		stringp; a path such as that returned by cyc-home-filename
     * @return stringp; absolute path to LOGICAL-PATH, suitable for use by the OS.
     */
    @LispMethod(comment = "@param LOGICAL-PATH\r\n\t\tstringp; a path such as that returned by cyc-home-filename\r\n@return stringp; absolute path to LOGICAL-PATH, suitable for use by the OS.")
    public static final SubLObject get_absolute_path_string_alt(SubLObject logical_path) {
        return cconcatenate(com.cyc.cycjava.cycl.file_utilities.absolute_default_path_string(), com.cyc.cycjava.cycl.file_utilities.normal_pathstring(com.cyc.cycjava.cycl.file_utilities.logical_pathname_to_physical(logical_path)));
    }

    /**
     *
     *
     * @param LOGICAL-PATH
     * 		stringp; a path such as that returned by cyc-home-filename
     * @return stringp; absolute path to LOGICAL-PATH, suitable for use by the OS.
     */
    @LispMethod(comment = "@param LOGICAL-PATH\r\n\t\tstringp; a path such as that returned by cyc-home-filename\r\n@return stringp; absolute path to LOGICAL-PATH, suitable for use by the OS.")
    public static SubLObject get_absolute_path_string(final SubLObject logical_path) {
        return normal_pathstring(logical_pathname_to_physical(logical_path));
    }

    /**
     * Determine whether PATH is absolute, i.e. on unix if it starts with a /, on msdos if it starts with <drive>: or \ (e.g. \serverwindowsshare)
     *
     * @param PATH
    string
     * 		
     * @return boolean
     * @unknown jantos
     * @unknown done
     */
    @LispMethod(comment = "Determine whether PATH is absolute, i.e. on unix if it starts with a /, on msdos if it starts with <drive>: or \\ (e.g. \\serverwindowsshare)\r\n\r\n@param PATH\nstring\r\n\t\t\r\n@return boolean\r\n@unknown jantos\r\n@unknown done")
    public static final SubLObject absolute_pathP_alt(SubLObject path) {
        {
            SubLObject path_length = length(path);
            if (path_length == ZERO_INTEGER) {
                return NIL;
            }
            {
                SubLObject pcase_var = com.cyc.cycjava.cycl.file_utilities.guess_path_type(path);
                if (pcase_var.eql($UNIX)) {
                    return eq(CHAR_slash, Strings.sublisp_char(path, ZERO_INTEGER));
                } else {
                    if (pcase_var.eql($DOS)) {
                        return makeBoolean(path_length.numG(TWO_INTEGER) && (((CHAR_colon == Strings.sublisp_char(path, ONE_INTEGER)) && (NIL != alpha_char_p(Strings.sublisp_char(path, ZERO_INTEGER)))) || (NIL != string_utilities.starts_with(path, $str_alt185$__))));
                    } else {
                        return NIL;
                    }
                }
            }
        }
    }

    /**
     * Determine whether PATH is absolute, i.e. on unix if it starts with a /, on msdos if it starts with <drive>: or \ (e.g. \serverwindowsshare)
     *
     * @param PATH
    		string
     * 		
     * @return boolean
     * @unknown jantos
     * @unknown done
     */
    @LispMethod(comment = "Determine whether PATH is absolute, i.e. on unix if it starts with a /, on msdos if it starts with <drive>: or \\ (e.g. \\serverwindowsshare)\r\n\r\n@param PATH\n\t\tstring\r\n\t\t\r\n@return boolean\r\n@unknown jantos\r\n@unknown done")
    public static SubLObject absolute_pathP(final SubLObject path) {
        final SubLObject path_length = length(path);
        if (path_length.eql(ZERO_INTEGER)) {
            return NIL;
        }
        final SubLObject pcase_var = guess_path_type(path);
        if (pcase_var.eql($UNIX)) {
            return eq(CHAR_slash, Strings.sublisp_char(path, ZERO_INTEGER));
        }
        if (pcase_var.eql($DOS)) {
            return makeBoolean(path_length.numG(TWO_INTEGER) && ((CHAR_colon.eql(Strings.sublisp_char(path, ONE_INTEGER)) && (NIL != alpha_char_p(Strings.sublisp_char(path, ZERO_INTEGER)))) || (NIL != string_utilities.starts_with(path, $str200$__))));
        }
        return NIL;
    }

    /**
     * Return the appropriate separator char for the given PATH-TYPE.
     *
     * @param PATH-TYPE
    keyword
     * 		
     * @return char
     * @unknown jantos
     * @unknown done
     */
    @LispMethod(comment = "Return the appropriate separator char for the given PATH-TYPE.\r\n\r\n@param PATH-TYPE\nkeyword\r\n\t\t\r\n@return char\r\n@unknown jantos\r\n@unknown done")
    public static final SubLObject path_separator_char_alt(SubLObject path_type) {
        {
            SubLObject string = com.cyc.cycjava.cycl.file_utilities.path_separator_string(path_type);
            if (string.isString()) {
                return Strings.sublisp_char(string, ZERO_INTEGER);
            }
            return NIL;
        }
    }

    /**
     * Return the appropriate separator char for the given PATH-TYPE.
     *
     * @param PATH-TYPE
    		keyword
     * 		
     * @return char
     * @unknown jantos
     * @unknown done
     */
    @LispMethod(comment = "Return the appropriate separator char for the given PATH-TYPE.\r\n\r\n@param PATH-TYPE\n\t\tkeyword\r\n\t\t\r\n@return char\r\n@unknown jantos\r\n@unknown done")
    public static SubLObject path_separator_char(final SubLObject path_type) {
        final SubLObject string = path_separator_string(path_type);
        if (string.isString()) {
            return Strings.sublisp_char(string, ZERO_INTEGER);
        }
        return NIL;
    }

    /**
     *
     *
     * @see PATH-SEPARATOR-CHAR
     * @return STRINGP
     */
    @LispMethod(comment = "@see PATH-SEPARATOR-CHAR\r\n@return STRINGP")
    public static final SubLObject path_separator_string_alt(SubLObject path_type) {
        {
            SubLObject pcase_var = path_type;
            if (pcase_var.eql($UNIX)) {
                return $str_alt158$_;
            } else {
                if (pcase_var.eql($DOS)) {
                    return $str_alt177$_;
                } else {
                    if (pcase_var.eql($MAC)) {
                        return $str_alt187$_;
                    } else {
                        return NIL;
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @see PATH-SEPARATOR-CHAR
     * @return STRINGP
     */
    @LispMethod(comment = "@see PATH-SEPARATOR-CHAR\r\n@return STRINGP")
    public static SubLObject path_separator_string(final SubLObject path_type) {
        if (path_type.eql($UNIX)) {
            return $str175$_;
        }
        if (path_type.eql($DOS)) {
            return $str192$_;
        }
        if (path_type.eql($MAC)) {
            return $str202$_;
        }
        return NIL;
    }

    /**
     * Analyze and deconstruct the path into PATH-LIST leading up to FILENAME (a file, directory, symlink,.) and the PATH-TYPE (currently :unix or :dos).  @see reconstruct-path.
     *
     * @param PATH
    string
     * 		
     * @return 0 list ;; PATH-LIST
     * @return 1 string ;; FILENAME
     * @return 2 keyword ;; PATH-TYPE
     * @unknown jantos
     * @unknown done
     */
    @LispMethod(comment = "Analyze and deconstruct the path into PATH-LIST leading up to FILENAME (a file, directory, symlink,.) and the PATH-TYPE (currently :unix or :dos).  @see reconstruct-path.\r\n\r\n@param PATH\nstring\r\n\t\t\r\n@return 0 list ;; PATH-LIST\r\n@return 1 string ;; FILENAME\r\n@return 2 keyword ;; PATH-TYPE\r\n@unknown jantos\r\n@unknown done")
    public static final SubLObject deconstruct_path_alt(SubLObject path) {
        {
            SubLObject path_type = com.cyc.cycjava.cycl.file_utilities.guess_path_type(path);
            if (NIL == path_type) {
                return values(NIL, path, NIL);
            }
            {
                SubLObject path_list = string_utilities.string_tokenize(path, list(com.cyc.cycjava.cycl.file_utilities.path_separator_string(path_type)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject filename = NIL;
                path_list = nreverse(path_list);
                filename = path_list.first();
                path_list = path_list.rest();
                path_list = nreverse(path_list);
                return values(path_list, filename, path_type);
            }
        }
    }

    /**
     * Analyze and deconstruct the path into PATH-LIST leading up to FILENAME (a file, directory, symlink,.) and the PATH-TYPE (currently :unix or :dos).  @see reconstruct-path.
     *
     * @param PATH
    		string
     * 		
     * @return 0 list ;; PATH-LIST
     * @return 1 string ;; FILENAME
     * @return 2 keyword ;; PATH-TYPE
     * @unknown jantos
     * @unknown done
     */
    @LispMethod(comment = "Analyze and deconstruct the path into PATH-LIST leading up to FILENAME (a file, directory, symlink,.) and the PATH-TYPE (currently :unix or :dos).  @see reconstruct-path.\r\n\r\n@param PATH\n\t\tstring\r\n\t\t\r\n@return 0 list ;; PATH-LIST\r\n@return 1 string ;; FILENAME\r\n@return 2 keyword ;; PATH-TYPE\r\n@unknown jantos\r\n@unknown done")
    public static SubLObject deconstruct_path(final SubLObject path) {
        final SubLObject path_type = guess_path_type(path);
        if (NIL == path_type) {
            return values(NIL, path, NIL);
        }
        SubLObject path_list = string_utilities.string_tokenize(path, list(path_separator_string(path_type)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject filename = NIL;
        path_list = nreverse(path_list);
        filename = path_list.first();
        path_list = path_list.rest();
        path_list = nreverse(path_list);
        return values(path_list, filename, path_type);
    }

    /**
     * Reconstruct the deconstructed path.  @see deconstruct-path.
     *
     * @param PATH-LIST
    list
     * 		
     * @param FILENAME
    string
     * 		
     * @param PATH-TYPE
    keyword
     * 		
     * @return string
     * @unknown jantos
     * @unknown done
     */
    @LispMethod(comment = "Reconstruct the deconstructed path.  @see deconstruct-path.\r\n\r\n@param PATH-LIST\nlist\r\n\t\t\r\n@param FILENAME\nstring\r\n\t\t\r\n@param PATH-TYPE\nkeyword\r\n\t\t\r\n@return string\r\n@unknown jantos\r\n@unknown done")
    public static final SubLObject reconstruct_path_alt(SubLObject path_list, SubLObject filename, SubLObject path_type) {
        if (path_type == UNPROVIDED) {
            path_type = $UNIX;
        }
        {
            SubLObject build_path = NIL;
            SubLObject path_separator_string = com.cyc.cycjava.cycl.file_utilities.path_separator_string(path_type);
            SubLObject cdolist_list_var = path_list;
            SubLObject path_step = NIL;
            for (path_step = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , path_step = cdolist_list_var.first()) {
                build_path = cons(path_step, build_path);
                build_path = cons(path_separator_string, build_path);
            }
            build_path = cons(filename, build_path);
            return apply(symbol_function(CCONCATENATE), nreverse(build_path));
        }
    }

    /**
     * Reconstruct the deconstructed path.  @see deconstruct-path.
     *
     * @param PATH-LIST
    		list
     * 		
     * @param FILENAME
    		string
     * 		
     * @param PATH-TYPE
    		keyword
     * 		
     * @return string
     * @unknown jantos
     * @unknown done
     */
    @LispMethod(comment = "Reconstruct the deconstructed path.  @see deconstruct-path.\r\n\r\n@param PATH-LIST\n\t\tlist\r\n\t\t\r\n@param FILENAME\n\t\tstring\r\n\t\t\r\n@param PATH-TYPE\n\t\tkeyword\r\n\t\t\r\n@return string\r\n@unknown jantos\r\n@unknown done")
    public static SubLObject reconstruct_path(final SubLObject path_list, final SubLObject filename, SubLObject path_type) {
        if (path_type == UNPROVIDED) {
            path_type = $UNIX;
        }
        SubLObject build_path = NIL;
        final SubLObject path_separator_string = path_separator_string(path_type);
        SubLObject cdolist_list_var = path_list;
        SubLObject path_step = NIL;
        path_step = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            build_path = cons(path_step, build_path);
            build_path = cons(path_separator_string, build_path);
            cdolist_list_var = cdolist_list_var.rest();
            path_step = cdolist_list_var.first();
        } 
        build_path = cons(filename, build_path);
        return apply(symbol_function(CCONCATENATE), nreverse(build_path));
    }

    /**
     * Make PATH into an absolute path by starting at the directory ABSOLUTE-PATH references and finding what PATH reference from that.  If PATH is already absolute we just return it.  Note that paths to directories must end in a path-separator so we know to start in the directory.
     *
     * @param ABSOLUTE-PATH
    string
     * 		
     * @param PATH
    string
     * 		
     * @return string
     * @unknown jantos
     * @unknown done
     */
    @LispMethod(comment = "Make PATH into an absolute path by starting at the directory ABSOLUTE-PATH references and finding what PATH reference from that.  If PATH is already absolute we just return it.  Note that paths to directories must end in a path-separator so we know to start in the directory.\r\n\r\n@param ABSOLUTE-PATH\nstring\r\n\t\t\r\n@param PATH\nstring\r\n\t\t\r\n@return string\r\n@unknown jantos\r\n@unknown done")
    public static final SubLObject make_path_absolute_relative_to_alt(SubLObject absolute_path, SubLObject path) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != com.cyc.cycjava.cycl.file_utilities.absolute_pathP(path)) {
                return path;
            }
            thread.resetMultipleValues();
            {
                SubLObject working_path = com.cyc.cycjava.cycl.file_utilities.deconstruct_path(absolute_path);
                SubLObject working_file = thread.secondMultipleValue();
                SubLObject working_path_type = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                thread.resetMultipleValues();
                {
                    SubLObject relative_path = com.cyc.cycjava.cycl.file_utilities.deconstruct_path(path);
                    SubLObject relative_file = thread.secondMultipleValue();
                    SubLObject relative_path_type = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (working_path_type != relative_path_type) {
                        if (NIL == relative_path_type) {
                            relative_path_type = working_path_type;
                        } else {
                            return values(NIL, $str_alt188$Path_type_mismatch_);
                        }
                    }
                    working_path = nreverse(working_path);
                    {
                        SubLObject cdolist_list_var = relative_path;
                        SubLObject relative_path_step = NIL;
                        for (relative_path_step = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , relative_path_step = cdolist_list_var.first()) {
                            if (relative_path_step.equal($str_alt16$_)) {
                            } else {
                                if (relative_path_step.equal($str_alt189$__)) {
                                    working_path = working_path.rest();
                                } else {
                                    working_path = cons(relative_path_step, working_path);
                                }
                            }
                        }
                    }
                    return com.cyc.cycjava.cycl.file_utilities.reconstruct_path(nreverse(working_path), relative_file, relative_path_type);
                }
            }
        }
    }

    /**
     * Make PATH into an absolute path by starting at the directory ABSOLUTE-PATH references and finding what PATH reference from that.  If PATH is already absolute we just return it.  Note that paths to directories must end in a path-separator so we know to start in the directory.
     *
     * @param ABSOLUTE-PATH
    		string
     * 		
     * @param PATH
    		string
     * 		
     * @return string
     * @unknown jantos
     * @unknown done
     */
    @LispMethod(comment = "Make PATH into an absolute path by starting at the directory ABSOLUTE-PATH references and finding what PATH reference from that.  If PATH is already absolute we just return it.  Note that paths to directories must end in a path-separator so we know to start in the directory.\r\n\r\n@param ABSOLUTE-PATH\n\t\tstring\r\n\t\t\r\n@param PATH\n\t\tstring\r\n\t\t\r\n@return string\r\n@unknown jantos\r\n@unknown done")
    public static SubLObject make_path_absolute_relative_to(final SubLObject absolute_path, final SubLObject path) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != absolute_pathP(path)) {
            return path;
        }
        thread.resetMultipleValues();
        SubLObject working_path = deconstruct_path(absolute_path);
        final SubLObject working_file = thread.secondMultipleValue();
        final SubLObject working_path_type = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject relative_path = deconstruct_path(path);
        final SubLObject relative_file = thread.secondMultipleValue();
        SubLObject relative_path_type = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (!working_path_type.eql(relative_path_type)) {
            if (NIL != relative_path_type) {
                return values(NIL, $str203$Path_type_mismatch_);
            }
            relative_path_type = working_path_type;
        }
        working_path = nreverse(working_path);
        SubLObject cdolist_list_var = relative_path;
        SubLObject relative_path_step = NIL;
        relative_path_step = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (!relative_path_step.equal($str23$_)) {
                if (relative_path_step.equal($str204$__)) {
                    working_path = working_path.rest();
                } else {
                    working_path = cons(relative_path_step, working_path);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            relative_path_step = cdolist_list_var.first();
        } 
        return reconstruct_path(nreverse(working_path), relative_file, relative_path_type);
    }

    /**
     * Remove the prefix of ROOT from ABSOLUTE-PATH and return a relative path.
     */
    @LispMethod(comment = "Remove the prefix of ROOT from ABSOLUTE-PATH and return a relative path.")
    public static final SubLObject make_absolute_path_relative_to_alt(SubLObject absolute_path, SubLObject root) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == com.cyc.cycjava.cycl.file_utilities.absolute_pathP(absolute_path)) {
                    Errors.error($str_alt190$Cannot_make_relative_path__A_even, absolute_path);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == com.cyc.cycjava.cycl.file_utilities.absolute_pathP(root)) {
                    Errors.error($str_alt191$Cannot_strip_non_absolute_prefix_, root, absolute_path);
                }
            }
            return string_utilities.pre_remove(absolute_path, com.cyc.cycjava.cycl.file_utilities.possibly_append_path_separator_char(root), UNPROVIDED);
        }
    }

    /**
     * Remove the prefix of ROOT from ABSOLUTE-PATH and return a relative path.
     */
    @LispMethod(comment = "Remove the prefix of ROOT from ABSOLUTE-PATH and return a relative path.")
    public static SubLObject make_absolute_path_relative_to(final SubLObject absolute_path, final SubLObject root) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == absolute_pathP(absolute_path))) {
            Errors.error($str205$Cannot_make_relative_path__A_even, absolute_path);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == absolute_pathP(root))) {
            Errors.error($str206$Cannot_strip_non_absolute_prefix_, root, absolute_path);
        }
        return string_utilities.pre_remove(absolute_path, possibly_append_path_separator_char(root), UNPROVIDED);
    }

    /**
     * Returns the substring of PATHSTRING that corresponds to the name of the file.
     *
     * @param PATHSTRING;
     * 		stringp; a logical or physical pathname
     * @return STRINGP
     * @unknown karen
     * @unknown done
     */
    @LispMethod(comment = "Returns the substring of PATHSTRING that corresponds to the name of the file.\r\n\r\n@param PATHSTRING;\r\n\t\tstringp; a logical or physical pathname\r\n@return STRINGP\r\n@unknown karen\r\n@unknown done")
    public static final SubLObject pathstring_filename_alt(SubLObject pathstring) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != Filesys.directory_p(pathstring)) {
                return NIL;
            }
            {
                SubLObject physical_path = ensure_physical_pathname(pathstring);
                SubLObject result = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject directory_list = com.cyc.cycjava.cycl.file_utilities.deconstruct_path(physical_path);
                    SubLObject filename = thread.secondMultipleValue();
                    SubLObject type = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    result = filename;
                }
                return result;
            }
        }
    }

    @LispMethod(comment = "Returns the substring of PATHSTRING that corresponds to the name of the file.\r\n\r\n@param PATHSTRING;\r\n\t\tstringp; a logical or physical pathname\r\n@return STRINGP\r\n@unknown karen\r\n@unknown done")
    public static SubLObject pathstring_filename(final SubLObject pathstring) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != Filesys.directory_p(pathstring)) {
            return NIL;
        }
        final SubLObject physical_path = subl_promotions.ensure_physical_pathname(pathstring);
        SubLObject result = NIL;
        thread.resetMultipleValues();
        final SubLObject directory_list = deconstruct_path(physical_path);
        final SubLObject filename = thread.secondMultipleValue();
        final SubLObject type = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        result = filename;
        return result;
    }

    public static SubLObject pathstring_directory_name(final SubLObject pathstring) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject directory = partially_deconstruct_path(pathstring);
        final SubLObject filename = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return directory;
    }

    public static final SubLObject partially_deconstruct_path_alt(SubLObject pathstring) {
        {
            SubLObject filename = com.cyc.cycjava.cycl.file_utilities.pathstring_filename(pathstring);
            SubLObject filename_length = length(filename);
            SubLObject directory = string_utilities.substring(pathstring, ZERO_INTEGER, subtract(length(pathstring), filename_length));
            return values(directory, filename);
        }
    }

    public static SubLObject partially_deconstruct_path(final SubLObject pathstring) {
        final SubLObject filename = pathstring_filename(pathstring);
        final SubLObject filename_length = length(filename);
        final SubLObject directory = string_utilities.substring(pathstring, ZERO_INTEGER, subtract(length(pathstring), filename_length));
        return values(directory, filename);
    }

    public static SubLObject ensure_unique_filename(SubLObject pathstring, SubLObject suffix) {
        if (suffix == UNPROVIDED) {
            suffix = $str22$;
        }
        for (SubLObject counter = ZERO_INTEGER, base_path = string_utilities.post_remove(pathstring, suffix, symbol_function(EQUAL)); NIL != file_existsP(pathstring); pathstring = cconcatenate(format_nil.format_nil_a_no_copy(base_path), new SubLObject[]{ $str207$_, format_nil.format_nil_a_no_copy(counter), format_nil.format_nil_a_no_copy(suffix) }) , counter = add(counter, ONE_INTEGER)) {
        }
        return pathstring;
    }

    /**
     * Reads in the file and return a string for each line
     *
     * @return list ; list of strings for each line in the file
     * @unknown This is not intended for large files; use @xref cdolines instead.
     * @unknown (read-text-file "/opt/local/pkg/wordnet-1.6/dict/adv.exc") => ("best well" "better well" "deeper deeply" "farther far" "further far" "harder hard" "hardest hard")
     * @unknown tom
     */
    @LispMethod(comment = "Reads in the file and return a string for each line\r\n\r\n@return list ; list of strings for each line in the file\r\n@unknown This is not intended for large files; use @xref cdolines instead.\r\n@unknown (read-text-file \"/opt/local/pkg/wordnet-1.6/dict/adv.exc\") => (\"best well\" \"better well\" \"deeper deeply\" \"farther far\" \"further far\" \"harder hard\" \"hardest hard\")\r\n@unknown tom")
    public static final SubLObject read_text_file_alt(SubLObject file_name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!((NIL != string_utilities.non_empty_stringP(file_name)) && (NIL != Filesys.probe_file(file_name)))) {
                format(StreamsLow.$trace_output$.getDynamicValue(thread), $str_alt192$Warning__unable_to_read_file__s__, file_name);
                return NIL;
            }
            {
                SubLObject result = NIL;
                SubLObject stream = NIL;
                try {
                    stream = compatibility.open_text(file_name, $INPUT, NIL);
                    if (!stream.isStream()) {
                        Errors.error($str_alt56$Unable_to_open__S, file_name);
                    }
                    {
                        SubLObject in = stream;
                        SubLObject line = NIL;
                        for (line = read_line(in, NIL, UNPROVIDED, UNPROVIDED); !((line == $EOF) || (NIL == line)); line = read_line(in, NIL, UNPROVIDED, UNPROVIDED)) {
                            result = cons(line, result);
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return reverse(result);
            }
        }
    }

    @LispMethod(comment = "Reads in the file and return a string for each line\r\n\r\n@return list ; list of strings for each line in the file\r\n@unknown This is not intended for large files; use @xref cdolines instead.\r\n@unknown (read-text-file \"/opt/local/pkg/wordnet-1.6/dict/adv.exc\") => (\"best well\" \"better well\" \"deeper deeply\" \"farther far\" \"further far\" \"harder hard\" \"hardest hard\")\r\n@unknown tom")
    public static SubLObject read_text_file(final SubLObject file_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == string_utilities.non_empty_stringP(file_name)) || (NIL == Filesys.probe_file(file_name))) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), $str208$Warning__unable_to_read_file__s__, file_name);
            return NIL;
        }
        SubLObject result = NIL;
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(file_name, $INPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str68$Unable_to_open__S, file_name);
            }
            SubLObject in;
            SubLObject line;
            for (in = stream, line = NIL, line = string_utilities.network_read_line(in, NIL, UNPROVIDED, UNPROVIDED); (line != $EOF) && (NIL != line); line = string_utilities.network_read_line(in, NIL, UNPROVIDED, UNPROVIDED)) {
                result = cons(line, result);
            }
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return reverse(result);
    }

    /**
     * Outputs the lines to file-name, each with a newline terminator
     *
     * @unknown tom
     */
    @LispMethod(comment = "Outputs the lines to file-name, each with a newline terminator\r\n\r\n@unknown tom")
    public static final SubLObject output_text_file_alt(SubLObject file_name, SubLObject lines, SubLObject output_mode) {
        if (output_mode == UNPROVIDED) {
            output_mode = $OUTPUT;
        }
        {
            SubLObject stream = NIL;
            try {
                stream = compatibility.open_text(file_name, output_mode, NIL);
                if (!stream.isStream()) {
                    Errors.error($str_alt56$Unable_to_open__S, file_name);
                }
                {
                    SubLObject out = stream;
                    SubLObject cdolist_list_var = lines;
                    SubLObject line = NIL;
                    for (line = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , line = cdolist_list_var.first()) {
                        write_string(line, out, UNPROVIDED, UNPROVIDED);
                        terpri(out);
                    }
                }
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        if (stream.isStream()) {
                            close(stream, UNPROVIDED);
                        }
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
        }
        return T;
    }

    @LispMethod(comment = "Outputs the lines to file-name, each with a newline terminator\r\n\r\n@unknown tom")
    public static SubLObject output_text_file(final SubLObject file_name, final SubLObject lines, SubLObject output_mode) {
        if (output_mode == UNPROVIDED) {
            output_mode = $OUTPUT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(file_name, output_mode);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str68$Unable_to_open__S, file_name);
            }
            final SubLObject out = stream;
            SubLObject cdolist_list_var = lines;
            SubLObject line = NIL;
            line = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                write_string(line, out, UNPROVIDED, UNPROVIDED);
                terpri(out);
                cdolist_list_var = cdolist_list_var.rest();
                line = cdolist_list_var.first();
            } 
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return T;
    }

    /**
     * Writes the lines (with newline terminators added) to file-name, which is replaced if exists
     *
     * @unknown (write-text-file "/tmp/abc.text" '("a" "b" "c")) => T
     */
    @LispMethod(comment = "Writes the lines (with newline terminators added) to file-name, which is replaced if exists\r\n\r\n@unknown (write-text-file \"/tmp/abc.text\" \'(\"a\" \"b\" \"c\")) => T")
    public static final SubLObject write_text_file_alt(SubLObject file_name, SubLObject lines) {
        return com.cyc.cycjava.cycl.file_utilities.output_text_file(file_name, lines, $OUTPUT);
    }

    @LispMethod(comment = "Writes the lines (with newline terminators added) to file-name, which is replaced if exists\r\n\r\n@unknown (write-text-file \"/tmp/abc.text\" \'(\"a\" \"b\" \"c\")) => T")
    public static SubLObject write_text_file(final SubLObject file_name, final SubLObject lines) {
        return output_text_file(file_name, lines, $OUTPUT);
    }

    /**
     * Appends the lines (with newline terminators added) to file-name, which is created if necessary
     *
     * @unknown (clet ((file "/tmp/a.text") (a "a")) (delete-file file) (cdotimes (i 3) (append-text-file file (list a))) (equal (read-text-file file) (list a a a)))
     */
    @LispMethod(comment = "Appends the lines (with newline terminators added) to file-name, which is created if necessary\r\n\r\n@unknown (clet ((file \"/tmp/a.text\") (a \"a\")) (delete-file file) (cdotimes (i 3) (append-text-file file (list a))) (equal (read-text-file file) (list a a a)))")
    public static final SubLObject append_text_file_alt(SubLObject file_name, SubLObject lines) {
        return com.cyc.cycjava.cycl.file_utilities.output_text_file(file_name, lines, $APPEND);
    }

    @LispMethod(comment = "Appends the lines (with newline terminators added) to file-name, which is created if necessary\r\n\r\n@unknown (clet ((file \"/tmp/a.text\") (a \"a\")) (delete-file file) (cdotimes (i 3) (append-text-file file (list a))) (equal (read-text-file file) (list a a a)))")
    public static SubLObject append_text_file(final SubLObject file_name, final SubLObject lines) {
        return output_text_file(file_name, lines, $APPEND);
    }

    /**
     * Truncates a file named FILENAME to file length zero.
     *
     * @return STRINGP filename
     */
    @LispMethod(comment = "Truncates a file named FILENAME to file length zero.\r\n\r\n@return STRINGP filename")
    public static final SubLObject truncate_file_alt(SubLObject filename) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject stream = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            stream = compatibility.open_binary(filename, $OUTPUT, NIL);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (!stream.isStream()) {
                        Errors.error($str_alt56$Unable_to_open__S, filename);
                    }
                    {
                        SubLObject s = stream;
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return filename;
        }
    }

    @LispMethod(comment = "Truncates a file named FILENAME to file length zero.\r\n\r\n@return STRINGP filename")
    public static SubLObject truncate_file(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_binary(filename, $OUTPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str68$Unable_to_open__S, filename);
            }
            final SubLObject s = stream;
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return filename;
    }

    /**
     * Return T iff filename exists and has a byte size of 0.
     */
    @LispMethod(comment = "Return T iff filename exists and has a byte size of 0.")
    public static final SubLObject empty_file_p_alt(SubLObject filename) {
        if (NIL != Filesys.probe_file(filename)) {
            {
                SubLObject size = NIL;
                SubLObject stream = compatibility.open_binary(filename, $INPUT, UNPROVIDED);
                size = file_length(stream);
                close(stream, UNPROVIDED);
                return zerop(size);
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Return T iff filename exists and has a byte size of 0.")
    public static SubLObject empty_file_p(final SubLObject filename) {
        if (NIL != Filesys.probe_file(filename)) {
            SubLObject size = NIL;
            final SubLObject stream = compatibility.open_binary(filename, $INPUT);
            size = file_length(stream);
            close(stream, UNPROVIDED);
            return zerop(size);
        }
        return NIL;
    }

    public static SubLObject ensure_directories_exist(final SubLObject filepath) {
        return make_directory_recursive(pathstring_directory_name(filepath), UNPROVIDED, UNPROVIDED);
    }

    /**
     * Recursively calls MAKE-DIRECTORY to create one by one each directory leading to DIRECTORY-PATH.
     *
     * @param DIRECTORY-PATH;
    stringp
     * 		
     * @param FORCE?;
     * 		boolean ;; If any of the intermediate paths exists as a file, the file is removed and a directory by the same path is created instead. o/w an error is thrown.
     * @param PERMISSIONS
     * 		stringp ;; if a directory is created, chmod the newly-created directory with these permissions.  Otherwise, they will be created with MAKE-DIRECTORY's default, 0755.
     * @unknown zelal
     */
    @LispMethod(comment = "Recursively calls MAKE-DIRECTORY to create one by one each directory leading to DIRECTORY-PATH.\r\n\r\n@param DIRECTORY-PATH;\nstringp\r\n\t\t\r\n@param FORCE?;\r\n\t\tboolean ;; If any of the intermediate paths exists as a file, the file is removed and a directory by the same path is created instead. o/w an error is thrown.\r\n@param PERMISSIONS\r\n\t\tstringp ;; if a directory is created, chmod the newly-created directory with these permissions.  Otherwise, they will be created with MAKE-DIRECTORY\'s default, 0755.\r\n@unknown zelal")
    public static final SubLObject make_directory_recursive_alt(SubLObject directory_path, SubLObject forceP, SubLObject permissions) {
        if (forceP == UNPROVIDED) {
            forceP = NIL;
        }
        if (permissions == UNPROVIDED) {
            permissions = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != permissions) {
                SubLTrampolineFile.checkType(permissions, STRINGP);
            }
            SubLTrampolineFile.checkType(directory_path, STRINGP);
            {
                SubLObject physical_path = ensure_physical_pathname(directory_path);
                SubLObject path_list_so_far = NIL;
                SubLObject path_type = NIL;
                SubLObject chmod_list = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject directories = com.cyc.cycjava.cycl.file_utilities.deconstruct_path(physical_path);
                    SubLObject last_directory = thread.secondMultipleValue();
                    SubLObject pt = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    path_type = pt;
                    directories = list_utilities.nadd_to_end(last_directory, directories);
                    {
                        SubLObject cdolist_list_var = directories;
                        SubLObject each_directory = NIL;
                        for (each_directory = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , each_directory = cdolist_list_var.first()) {
                            {
                                SubLObject each_directory_path = com.cyc.cycjava.cycl.file_utilities.reconstruct_path(path_list_so_far, each_directory, path_type);
                                path_list_so_far = list_utilities.nadd_to_end(each_directory, path_list_so_far);
                                if (!((NIL != Filesys.directory_p(each_directory_path)) || ((path_type == $DOS) && (NIL != string_utilities.ends_with(each_directory_path, $str_alt187$_, UNPROVIDED))))) {
                                    if (NIL != Filesys.probe_file(each_directory_path)) {
                                        if (NIL != forceP) {
                                            Filesys.delete_file(each_directory_path);
                                        } else {
                                            Errors.error($str_alt193$make_directory_recursive__could_n, each_directory_path);
                                        }
                                    }
                                    Filesys.make_directory(each_directory_path, UNPROVIDED, UNPROVIDED);
                                    chmod_list = cons(each_directory_path, chmod_list);
                                }
                            }
                        }
                    }
                    if (NIL != permissions) {
                        {
                            SubLObject cdolist_list_var = chmod_list;
                            SubLObject chmod_directory = NIL;
                            for (chmod_directory = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , chmod_directory = cdolist_list_var.first()) {
                                com.cyc.cycjava.cycl.file_utilities.chmod(chmod_directory, permissions);
                            }
                        }
                    }
                }
                return Filesys.probe_file(com.cyc.cycjava.cycl.file_utilities.reconstruct_path(butlast(path_list_so_far, UNPROVIDED), last(path_list_so_far, UNPROVIDED).first(), path_type));
            }
        }
    }

    @LispMethod(comment = "Recursively calls MAKE-DIRECTORY to create one by one each directory leading to DIRECTORY-PATH.\r\n\r\n@param DIRECTORY-PATH;\n\t\tstringp\r\n\t\t\r\n@param FORCE?;\r\n\t\tboolean ;; If any of the intermediate paths exists as a file, the file is removed and a directory by the same path is created instead. o/w an error is thrown.\r\n@param PERMISSIONS\r\n\t\tstringp ;; if a directory is created, chmod the newly-created directory with these permissions.  Otherwise, they will be created with MAKE-DIRECTORY\'s default, 0755.\r\n@unknown zelal")
    public static SubLObject make_directory_recursive(final SubLObject directory_path, SubLObject forceP, SubLObject permissions) {
        if (forceP == UNPROVIDED) {
            forceP = NIL;
        }
        if (permissions == UNPROVIDED) {
            permissions = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL != permissions) && (!assertionsDisabledSynth)) && (NIL == stringp(permissions))) {
            throw new AssertionError(permissions);
        }
        assert NIL != stringp(directory_path) : "! stringp(directory_path) " + ("Types.stringp(directory_path) " + "CommonSymbols.NIL != Types.stringp(directory_path) ") + directory_path;
        final SubLObject physical_path = subl_promotions.ensure_physical_pathname(directory_path);
        SubLObject path_list_so_far = NIL;
        SubLObject path_type = NIL;
        SubLObject chmod_list = NIL;
        SubLObject error = NIL;
        thread.resetMultipleValues();
        SubLObject directories = deconstruct_path(physical_path);
        final SubLObject last_directory = thread.secondMultipleValue();
        final SubLObject pt = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        path_type = pt;
        SubLObject cdolist_list_var;
        directories = cdolist_list_var = list_utilities.nadd_to_end(last_directory, directories);
        SubLObject each_directory = NIL;
        each_directory = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject each_directory_path = reconstruct_path(path_list_so_far, each_directory, path_type);
            path_list_so_far = list_utilities.nadd_to_end(each_directory, path_list_so_far);
            if ((NIL == Filesys.directory_p(each_directory_path)) && ((path_type != $DOS) || (NIL == string_utilities.ends_with(each_directory_path, $str202$_, UNPROVIDED)))) {
                if (NIL != Filesys.probe_file(each_directory_path)) {
                    if (NIL != forceP) {
                        Filesys.delete_file(each_directory_path);
                    } else {
                        Errors.error($str209$make_directory_recursive__could_n, each_directory_path);
                    }
                }
                Filesys.make_directory(each_directory_path, UNPROVIDED, UNPROVIDED);
                chmod_list = cons(each_directory_path, chmod_list);
            }
            cdolist_list_var = cdolist_list_var.rest();
            each_directory = cdolist_list_var.first();
        } 
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    if (NIL != permissions) {
                        SubLObject cdolist_list_var2 = chmod_list;
                        SubLObject chmod_directory = NIL;
                        chmod_directory = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            chmod(chmod_directory, permissions);
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            chmod_directory = cdolist_list_var2.first();
                        } 
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != error) {
            Errors.warn($str210$Able_to_create_directory__A__but_, directory_path);
        }
        return Filesys.probe_file(reconstruct_path(butlast(path_list_so_far, UNPROVIDED), last(path_list_so_far, UNPROVIDED).first(), path_type));
    }

    /**
     * Convert PATHNAME from logical to physical.
     *
     * @unknown baxter
     * @unknown assumes physical path contains no uppercase characters.
     */
    @LispMethod(comment = "Convert PATHNAME from logical to physical.\r\n\r\n@unknown baxter\r\n@unknown assumes physical path contains no uppercase characters.")
    public static final SubLObject logical_pathname_to_physical_alt(SubLObject pathname) {
        return ensure_physical_pathname(pathname);
    }

    @LispMethod(comment = "Convert PATHNAME from logical to physical.\r\n\r\n@unknown baxter\r\n@unknown assumes physical path contains no uppercase characters.")
    public static SubLObject logical_pathname_to_physical(final SubLObject pathname) {
        return subl_promotions.ensure_physical_pathname(pathname);
    }

    /**
     * Deletes a directory and all children (files or directories).
     *
     * @unknown william
     */
    @LispMethod(comment = "Deletes a directory and all children (files or directories).\r\n\r\n@unknown william")
    public static final SubLObject recursive_delete_directory_alt(SubLObject path) {
        if (NIL == Filesys.directory_p(path)) {
            return NIL;
        }
        {
            SubLObject children = Filesys.directory(path, UNPROVIDED);
            SubLObject cdolist_list_var = children;
            SubLObject child = NIL;
            for (child = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , child = cdolist_list_var.first()) {
                {
                    SubLObject child_path = cconcatenate(path, new SubLObject[]{ $str_alt158$_, child });
                    if (NIL != Filesys.directory_p(child_path)) {
                        com.cyc.cycjava.cycl.file_utilities.recursive_delete_directory(child_path);
                    } else {
                        Filesys.delete_file(child_path);
                    }
                }
            }
        }
        return Filesys.delete_directory(path, UNPROVIDED);
    }

    @LispMethod(comment = "Deletes a directory and all children (files or directories).\r\n\r\n@unknown william")
    public static SubLObject recursive_delete_directory(final SubLObject path) {
        if (NIL == Filesys.directory_p(path)) {
            return NIL;
        }
        SubLObject cdolist_list_var;
        final SubLObject children = cdolist_list_var = Filesys.directory(path, UNPROVIDED);
        SubLObject child = NIL;
        child = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject child_path = cconcatenate(path, new SubLObject[]{ $str175$_, child });
            if (NIL != Filesys.directory_p(child_path)) {
                recursive_delete_directory(child_path);
            } else {
                Filesys.delete_file(child_path);
            }
            cdolist_list_var = cdolist_list_var.rest();
            child = cdolist_list_var.first();
        } 
        return Filesys.delete_directory(path, UNPROVIDED);
    }

    /**
     *
     *
     * @param OLD;
    stringp
     * 		
     * @param NEW;
     * 		stringp
     * 		Recursively copies everything under OLD to NEW.
     * @unknown william
     */
    @LispMethod(comment = "@param OLD;\nstringp\r\n\t\t\r\n@param NEW;\r\n\t\tstringp\r\n\t\tRecursively copies everything under OLD to NEW.\r\n@unknown william")
    public static final SubLObject recursive_copy_directory_alt(SubLObject old, SubLObject v_new) {
        if (NIL == Filesys.directory_p(old)) {
            return NIL;
        }
        Filesys.make_directory(v_new, UNPROVIDED, UNPROVIDED);
        {
            SubLObject children = Filesys.directory(old, UNPROVIDED);
            SubLObject cdolist_list_var = children;
            SubLObject child = NIL;
            for (child = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , child = cdolist_list_var.first()) {
                {
                    SubLObject old_child_path = cconcatenate(old, new SubLObject[]{ $str_alt158$_, child });
                    SubLObject new_child_path = cconcatenate(v_new, new SubLObject[]{ $str_alt158$_, child });
                    if (NIL != Filesys.directory_p(old_child_path)) {
                        com.cyc.cycjava.cycl.file_utilities.recursive_copy_directory(old_child_path, new_child_path);
                    } else {
                        copy_file(old_child_path, new_child_path);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param OLD;
    stringp
     * 		
     * @param NEW;
     * 		stringp
     * 		Recursively copies everything under OLD to NEW.
     * @unknown william
     */
    @LispMethod(comment = "@param OLD;\nstringp\r\n\t\t\r\n@param NEW;\r\n\t\tstringp\r\n\t\tRecursively copies everything under OLD to NEW.\r\n@unknown william")
    public static SubLObject recursive_copy_directory(final SubLObject old, final SubLObject v_new) {
        if (NIL == Filesys.directory_p(old)) {
            return NIL;
        }
        Filesys.make_directory(v_new, UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject children = cdolist_list_var = Filesys.directory(old, UNPROVIDED);
        SubLObject child = NIL;
        child = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject old_child_path = cconcatenate(old, new SubLObject[]{ $str175$_, child });
            final SubLObject new_child_path = cconcatenate(v_new, new SubLObject[]{ $str175$_, child });
            if (NIL != Filesys.directory_p(old_child_path)) {
                recursive_copy_directory(old_child_path, new_child_path);
            } else {
                Filesys.copy_file(old_child_path, new_child_path);
            }
            cdolist_list_var = cdolist_list_var.rest();
            child = cdolist_list_var.first();
        } 
        return NIL;
    }

    /**
     *
     *
     * @param PATHNAME
     * 		stringp; the full path to the file in question
     * @param PERMISSIONS-STRING
     * 		stringp; the permissions, as specified to the operating system (currently, only unix/linux)
     * @unknown make this work on windows, not just on unix
     */
    @LispMethod(comment = "@param PATHNAME\r\n\t\tstringp; the full path to the file in question\r\n@param PERMISSIONS-STRING\r\n\t\tstringp; the permissions, as specified to the operating system (currently, only unix/linux)\r\n@unknown make this work on windows, not just on unix")
    public static final SubLObject chmod_alt(SubLObject pathname, SubLObject permissions_string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Processes.external_processes_supportedP()) {
                return NIL;
            }
            return os_process_utilities.system_eval_using_make_os_process_successfulP($$$chmod, list(permissions_string, pathname), ZERO_INTEGER, StreamsLow.$null_input$.getDynamicValue(thread), StreamsLow.$null_output$.getDynamicValue(thread), UNPROVIDED);
        }
    }

    /**
     *
     *
     * @param PATHNAME
     * 		stringp; the full path to the file in question
     * @param PERMISSIONS-STRING
     * 		stringp; the permissions, as specified to the operating system (currently, only unix/linux)
     * @unknown make this work on windows, not just on unix
     */
    @LispMethod(comment = "@param PATHNAME\r\n\t\tstringp; the full path to the file in question\r\n@param PERMISSIONS-STRING\r\n\t\tstringp; the permissions, as specified to the operating system (currently, only unix/linux)\r\n@unknown make this work on windows, not just on unix")
    public static SubLObject chmod(final SubLObject pathname, final SubLObject permissions_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == Processes.external_processes_supportedP()) {
            return NIL;
        }
        return os_process_utilities.system_eval_using_make_os_process_successfulP($$$chmod, list(permissions_string, pathname), ZERO_INTEGER, StreamsLow.$null_input$.getDynamicValue(thread), StreamsLow.$null_output$.getDynamicValue(thread), UNPROVIDED);
    }

    /**
     * Use the OS to delete a file.  This is a workaround for the fact that Allegro can't handle files
     * that have capital letters in them
     */
    @LispMethod(comment = "Use the OS to delete a file.  This is a workaround for the fact that Allegro can\'t handle files\r\nthat have capital letters in them\nUse the OS to delete a file.  This is a workaround for the fact that Allegro can\'t handle files\nthat have capital letters in them")
    public static final SubLObject delete_file_via_os_alt(SubLObject filename) {
        SubLTrampolineFile.checkType(filename, STRINGP);
        return Filesys.delete_file(filename);
    }

    @LispMethod(comment = "Use the OS to delete a file.  This is a workaround for the fact that Allegro can\'t handle files\r\nthat have capital letters in them\nUse the OS to delete a file.  This is a workaround for the fact that Allegro can\'t handle files\nthat have capital letters in them")
    public static SubLObject delete_file_via_os(final SubLObject filename) {
        assert NIL != stringp(filename) : "! stringp(filename) " + ("Types.stringp(filename) " + "CommonSymbols.NIL != Types.stringp(filename) ") + filename;
        return Filesys.delete_file(filename);
    }

    /**
     * Create LINK-FILE as a symbolic link to TARGET-FILE.
     * Return T iff this was successful.
     *
     * @param LINK-FILE;
    stringp
     * 		
     * @param TARGET-FILE;
    stringp
     * 		
     */
    @LispMethod(comment = "Create LINK-FILE as a symbolic link to TARGET-FILE.\r\nReturn T iff this was successful.\r\n\r\n@param LINK-FILE;\nstringp\r\n\t\t\r\n@param TARGET-FILE;\nstringp\nCreate LINK-FILE as a symbolic link to TARGET-FILE.\nReturn T iff this was successful.")
    public static final SubLObject create_symbolic_link_alt(SubLObject link_file, SubLObject target_file) {
        SubLTrampolineFile.checkType(target_file, STRINGP);
        SubLTrampolineFile.checkType(link_file, STRINGP);
        if (NIL != Processes.external_processes_supportedP()) {
            return os_process_utilities.system_eval_using_make_os_process_successfulP($$$ln, list($str_alt196$_s, target_file, link_file), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    @LispMethod(comment = "Create LINK-FILE as a symbolic link to TARGET-FILE.\r\nReturn T iff this was successful.\r\n\r\n@param LINK-FILE;\n\t\tstringp\r\n\t\t\r\n@param TARGET-FILE;\n\t\tstringp\nCreate LINK-FILE as a symbolic link to TARGET-FILE.\nReturn T iff this was successful.")
    public static SubLObject create_symbolic_link(final SubLObject link_file, final SubLObject target_file) {
        assert NIL != stringp(target_file) : "! stringp(target_file) " + ("Types.stringp(target_file) " + "CommonSymbols.NIL != Types.stringp(target_file) ") + target_file;
        assert NIL != stringp(link_file) : "! stringp(link_file) " + ("Types.stringp(link_file) " + "CommonSymbols.NIL != Types.stringp(link_file) ") + link_file;
        if (NIL != Processes.external_processes_supportedP()) {
            return os_process_utilities.system_eval_using_make_os_process_successfulP($$$ln, list($str213$_s, target_file, link_file), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    /**
     *
     *
     * @param OLD;
    stringp
     * 		
     * @param NEW;
     * 		stringp
     * 		If possible, create NEW as a symbolic link to the file OLD.
     * 		Otherwise, copy OLD to create NEW.
     */
    @LispMethod(comment = "@param OLD;\nstringp\r\n\t\t\r\n@param NEW;\r\n\t\tstringp\r\n\t\tIf possible, create NEW as a symbolic link to the file OLD.\r\n\t\tOtherwise, copy OLD to create NEW.")
    public static final SubLObject link_or_copy_file_alt(SubLObject old, SubLObject v_new) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.file_utilities.create_symbolic_link(v_new, old)) || (NIL != copy_file(old, v_new)));
    }

    /**
     *
     *
     * @param OLD;
    stringp
     * 		
     * @param NEW;
     * 		stringp
     * 		If possible, create NEW as a symbolic link to the file OLD.
     * 		Otherwise, copy OLD to create NEW.
     */
    @LispMethod(comment = "@param OLD;\nstringp\r\n\t\t\r\n@param NEW;\r\n\t\tstringp\r\n\t\tIf possible, create NEW as a symbolic link to the file OLD.\r\n\t\tOtherwise, copy OLD to create NEW.")
    public static SubLObject link_or_copy_file(final SubLObject old, final SubLObject v_new) {
        return makeBoolean((NIL != create_symbolic_link(v_new, old)) || (NIL != Filesys.copy_file(old, v_new)));
    }

    public static final SubLObject move_file_alt(SubLObject old, SubLObject v_new) {
        {
            SubLObject successP = T;
            SubLObject error = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                        try {
                            successP = copy_file(old, v_new);
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            }
            if ((NIL != successP) && (NIL == error)) {
                try {
                    {
                        SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                        try {
                            bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                            try {
                                successP = Filesys.delete_file(old);
                            } catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            rebind(Errors.$error_handler$, _prev_bind_0);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                }
            }
            if (NIL != error) {
                successP = NIL;
            }
            return values(successP, error);
        }
    }

    public static SubLObject move_file(final SubLObject old, final SubLObject v_new) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject successP = T;
        SubLObject error = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    successP = Filesys.copy_file(old, v_new);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if ((NIL != successP) && (NIL == error)) {
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        successP = Filesys.delete_file(old);
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            } finally {
                thread.throwStack.pop();
            }
        }
        if (NIL != error) {
            successP = NIL;
        }
        return values(successP, error);
    }

    /**
     * Return the size of the file at PATHNAME in bytes
     */
    @LispMethod(comment = "Return the size of the file at PATHNAME in bytes")
    public static final SubLObject get_file_length_alt(SubLObject pathname) {
        {
            SubLObject ans = ZERO_INTEGER;
            if (pathname.isString() && (NIL != Filesys.probe_file(pathname))) {
                {
                    SubLObject stream = NIL;
                    try {
                        stream = compatibility.open_text(pathname, $INPUT, NIL);
                        if (!stream.isStream()) {
                            Errors.error($str_alt56$Unable_to_open__S, pathname);
                        }
                        {
                            SubLObject stream_18 = stream;
                            ans = file_length(stream_18);
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                            try {
                                bind($is_thread_performing_cleanupP$, T);
                                if (stream.isStream()) {
                                    close(stream, UNPROVIDED);
                                }
                            } finally {
                                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                }
            }
            return ans;
        }
    }

    @LispMethod(comment = "Return the size of the file at PATHNAME in bytes")
    public static SubLObject get_file_length(final SubLObject pathname) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = ZERO_INTEGER;
        if (pathname.isString() && (NIL != Filesys.probe_file(pathname))) {
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_binary(pathname, $INPUT);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str68$Unable_to_open__S, pathname);
                }
                final SubLObject stream_$21 = stream;
                ans = file_length(stream_$21);
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        return ans;
    }

    public static SubLObject copy_file_checked(final SubLObject old, final SubLObject v_new) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject expected = get_file_length(old);
        final SubLObject result = Filesys.copy_file(old, v_new);
        final SubLObject actual = get_file_length(v_new);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!expected.numE(actual))) {
            Errors.error($str214$Copy_of__A_to__A_failed___A_has__, new SubLObject[]{ old, v_new, old, expected, v_new, actual });
        }
        return result;
    }

    /**
     * Return a list of strings where each string is a line of text file FILENAME.
     */
    @LispMethod(comment = "Return a list of strings where each string is a line of text file FILENAME.")
    public static final SubLObject get_file_lines_alt(SubLObject filename) {
        {
            SubLObject result = NIL;
            SubLObject stream = NIL;
            try {
                stream = compatibility.open_text(filename, $INPUT, NIL);
                if (!stream.isStream()) {
                    Errors.error($str_alt56$Unable_to_open__S, filename);
                }
                {
                    SubLObject infile = stream;
                    if (infile.isStream()) {
                        {
                            SubLObject line = NIL;
                            for (line = read_line(infile, NIL, NIL, UNPROVIDED); NIL != line; line = read_line(infile, NIL, NIL, UNPROVIDED)) {
                                result = cons(line, result);
                            }
                        }
                    }
                }
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        if (stream.isStream()) {
                            close(stream, UNPROVIDED);
                        }
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            return nreverse(result);
        }
    }

    @LispMethod(comment = "Return a list of strings where each string is a line of text file FILENAME.")
    public static SubLObject get_file_lines(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(filename, $INPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str68$Unable_to_open__S, filename);
            }
            final SubLObject infile = stream;
            if (infile.isStream()) {
                SubLObject line;
                for (line = NIL, line = cdolines_get_next_line(infile); NIL != line; line = cdolines_get_next_line(infile)) {
                    result = cons(line, result);
                }
            }
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return nreverse(result);
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(list(makeSymbol("STREAM"), makeSymbol("FILENAME"), makeSymbol("DIRECTION")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym1$FILENAME_VAR = makeUninternedSymbol("FILENAME-VAR");

    static private final SubLList $list_alt5 = list(NIL);

    static private final SubLSymbol $sym6$FILENAME_VAR = makeUninternedSymbol("FILENAME-VAR");

    public static SubLObject get_stream_forms(final SubLObject stream) {
        SubLObject result = NIL;
        SubLObject doneP = NIL;
        while (NIL == doneP) {
            final SubLObject form = read(stream, NIL, $EOF, UNPROVIDED);
            if (form == $EOF) {
                doneP = T;
            } else {
                result = cons(form, result);
            }
        } 
        return nreverse(result);
    }

    static private final SubLSymbol $sym10$FILENAME_VAR = makeUninternedSymbol("FILENAME-VAR");

    static private final SubLString $str_alt16$_ = makeString(".");

    public static SubLObject get_file_forms(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(filename, $INPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str68$Unable_to_open__S, filename);
            }
            final SubLObject stream_$22 = stream;
            result = get_stream_forms(stream_$22);
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return result;
    }

    static private final SubLList $list_alt18 = list(makeString("rck.please.put.this.in.the.right.place"));

    static private final SubLString $str_alt20$_tmp_ = makeString("/tmp/");

    static private final SubLString $str_alt22$0123456789abcdefghijklmnopqrstuvw = makeString("0123456789abcdefghijklmnopqrstuvwxyz");

    static private final SubLList $list_alt32 = list(list(makeSymbol("STREAM"), makeSymbol("&KEY"), list(makeSymbol("ELEMENT-TYPE"), $TEXT)), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt33 = list(makeKeyword("ELEMENT-TYPE"));

    static private final SubLList $list_alt41 = list(list(makeSymbol("FILENAME"), makeSymbol("&KEY"), list(makeSymbol("DIRECTORY"), makeSymbol("*TEMP-DIRECTORY*"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt42 = list(makeKeyword("DIRECTORY"));

    /**
     * Return a count of the number of lines in the file at PATHNAME.
     */
    @LispMethod(comment = "Return a count of the number of lines in the file at PATHNAME.")
    public static final SubLObject get_file_line_count_alt(SubLObject pathname) {
        {
            SubLObject ans = ZERO_INTEGER;
            if (pathname.isString() && (NIL != Filesys.probe_file(pathname))) {
                {
                    SubLObject stream = NIL;
                    try {
                        stream = compatibility.open_text(pathname, $INPUT, NIL);
                        if (!stream.isStream()) {
                            Errors.error($str_alt56$Unable_to_open__S, pathname);
                        }
                        {
                            SubLObject infile = stream;
                            if (infile.isStream()) {
                                {
                                    SubLObject line = NIL;
                                    for (line = read_line(infile, NIL, NIL, UNPROVIDED); NIL != line; line = read_line(infile, NIL, NIL, UNPROVIDED)) {
                                        ans = add(ans, ONE_INTEGER);
                                    }
                                }
                            }
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                            try {
                                bind($is_thread_performing_cleanupP$, T);
                                if (stream.isStream()) {
                                    close(stream, UNPROVIDED);
                                }
                            } finally {
                                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                }
            }
            return ans;
        }
    }

    @LispMethod(comment = "Return a count of the number of lines in the file at PATHNAME.")
    public static SubLObject get_file_line_count(final SubLObject pathname) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = ZERO_INTEGER;
        if (pathname.isString() && (NIL != Filesys.probe_file(pathname))) {
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_text(pathname, $INPUT);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str68$Unable_to_open__S, pathname);
                }
                final SubLObject infile = stream;
                if (infile.isStream()) {
                    SubLObject line;
                    for (line = NIL, line = cdolines_get_next_line(infile); NIL != line; line = cdolines_get_next_line(infile)) {
                        ans = add(ans, ONE_INTEGER);
                    }
                }
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        return ans;
    }

    static private final SubLList $list_alt47 = list(makeSymbol("OPEN-TEMP-FILE"));

    static private final SubLList $list_alt48 = list(list(makeSymbol("STREAM"), makeSymbol("&OPTIONAL"), list(makeSymbol("ELEMENT-TYPE"), $TEXT)), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt50 = list(makeSymbol("WITH-TEMP-FILE"));

    static private final SubLString $str_alt56$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $str_alt63$_S_is_not_a_valid_mode_ = makeString("~S is not a valid mode.");

    static private final SubLList $list_alt65 = list(list(makeSymbol("VAR"), makeSymbol("FILE"), makeSymbol("&OPTIONAL"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym66$INFILE = makeUninternedSymbol("INFILE");

    static private final SubLList $list_alt67 = list(makeKeyword("INPUT"));

    private static final SubLSymbol READ_LINE = makeSymbol("READ-LINE");

    static private final SubLList $list_alt70 = list(NIL, NIL);

    static private final SubLList $list_alt73 = list(list(makeSymbol("LINE-VAR"), makeSymbol("STREAM"), makeSymbol("&KEY"), makeSymbol("LINE-NUMBER"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    /**
     * (Attempt to) Load PATHNAME, and return two values: SUCCESS and ERROR.  SUCCESS
     * will be T if the file loaded without issue, and NIL otherwise.  ERROR will be NIL
     * if the file loaded successfully, and will be bound to the error message otherwise.
     */
    @LispMethod(comment = "(Attempt to) Load PATHNAME, and return two values: SUCCESS and ERROR.  SUCCESS\r\nwill be T if the file loaded without issue, and NIL otherwise.  ERROR will be NIL\r\nif the file loaded successfully, and will be bound to the error message otherwise.\n(Attempt to) Load PATHNAME, and return two values: SUCCESS and ERROR.  SUCCESS\nwill be T if the file loaded without issue, and NIL otherwise.  ERROR will be NIL\nif the file loaded successfully, and will be bound to the error message otherwise.")
    public static final SubLObject load_file_catching_error_alt(SubLObject pathname) {
        {
            SubLObject error = NIL;
            SubLObject success = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                        try {
                            load(pathname);
                            success = T;
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            }
            return values(success, error);
        }
    }

    @LispMethod(comment = "(Attempt to) Load PATHNAME, and return two values: SUCCESS and ERROR.  SUCCESS\r\nwill be T if the file loaded without issue, and NIL otherwise.  ERROR will be NIL\r\nif the file loaded successfully, and will be bound to the error message otherwise.\n(Attempt to) Load PATHNAME, and return two values: SUCCESS and ERROR.  SUCCESS\nwill be T if the file loaded without issue, and NIL otherwise.  ERROR will be NIL\nif the file loaded successfully, and will be bound to the error message otherwise.")
    public static SubLObject load_file_catching_error(final SubLObject pathname) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject error = NIL;
        SubLObject success = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    load(pathname);
                    success = T;
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        return values(success, error);
    }

    static private final SubLList $list_alt74 = list(makeKeyword("LINE-NUMBER"), $DONE);

    static private final SubLSymbol $sym77$LINE_NUMBER_VAR = makeUninternedSymbol("LINE-NUMBER-VAR");

    static private final SubLSymbol $sym79$STREAM_VAR = makeUninternedSymbol("STREAM-VAR");

    static private final SubLSymbol $sym81$1_ = makeSymbol("1+");

    static private final SubLList $list_alt82 = list(list(makeSymbol("LINE-VAR"), makeSymbol("FILE"), makeSymbol("&KEY"), makeSymbol("LINE-NUMBER"), makeSymbol("PROGRESS-MESSAGE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt83 = list(makeKeyword("LINE-NUMBER"), makeKeyword("PROGRESS-MESSAGE"), $DONE);

    static private final SubLSymbol $sym85$FILE_VAR = makeUninternedSymbol("FILE-VAR");

    static private final SubLSymbol $sym86$STREAM_VAR = makeUninternedSymbol("STREAM-VAR");

    /**
     * Given a PATHSTRING, return a normalized string representing the path, absolute when possible.
     */
    @LispMethod(comment = "Given a PATHSTRING, return a normalized string representing the path, absolute when possible.")
    public static final SubLObject normal_pathstring_alt(SubLObject pathstring) {
        {
            SubLObject pathstring_crtl = Filesys.probe_file(pathstring);
            if (NIL != pathstring_crtl) {
                return pathstring_crtl;
            } else {
                return pathstring;
            }
        }
    }

    @LispMethod(comment = "Given a PATHSTRING, return a normalized string representing the path, absolute when possible.")
    public static SubLObject normal_pathstring(final SubLObject pathstring) {
        final SubLObject pathstring_crtl = Filesys.probe_file(pathstring);
        if (NIL != pathstring_crtl) {
            return pathstring_crtl;
        }
        return pathstring;
    }

    static private final SubLSymbol $sym87$FILE_VAR = makeUninternedSymbol("FILE-VAR");

    static private final SubLSymbol $sym88$STREAM_VAR = makeUninternedSymbol("STREAM-VAR");

    static private final SubLSymbol $sym89$LENGTH_VAR = makeUninternedSymbol("LENGTH-VAR");

    public static final SubLObject possibly_update_keepalive_file_alt(SubLObject keepalive_filename) {
        if (NIL != keepalive_filename) {
            return com.cyc.cycjava.cycl.file_utilities.update_keepalive_file(keepalive_filename);
        }
        return NIL;
    }

    public static SubLObject possibly_update_keepalive_file(final SubLObject keepalive_filename) {
        if (NIL != keepalive_filename) {
            return update_keepalive_file(keepalive_filename);
        }
        return NIL;
    }

    public static final SubLObject update_keepalive_file_alt(SubLObject keepalive_filename) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject stream = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            stream = compatibility.open_text(keepalive_filename, $OUTPUT, NIL);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (!stream.isStream()) {
                        Errors.error($str_alt56$Unable_to_open__S, keepalive_filename);
                    }
                    {
                        SubLObject stream_19 = stream;
                        format(stream_19, $str_alt197$I_m_alive___);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return keepalive_filename;
        }
    }

    public static SubLObject update_keepalive_file(final SubLObject keepalive_filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(keepalive_filename, $OUTPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str68$Unable_to_open__S, keepalive_filename);
            }
            final SubLObject stream_$23 = stream;
            format(stream_$23, $str215$I_m_alive___);
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return keepalive_filename;
    }

    static private final SubLList $list_alt95 = list(list(makeSymbol("TOKENIZED-LINE"), makeSymbol("FILE"), makeSymbol("&KEY"), list(makeSymbol("BREAK-LIST"), list(QUOTE, list(makeSymbol("LIST"), CHAR_comma))), list(makeSymbol("EMBED-LIST"), list(QUOTE, list(makeSymbol("LIST"), list(makeSymbol("LIST"), makeString("\""), makeString("\""))))), makeSymbol("INCLUDE-STOPS"), makeSymbol("IGNORE-EMPTY-STRINGS"), list(makeSymbol("QUOTE-CHARS"), list(QUOTE, list(makeSymbol("LIST"), CHAR_backslash)))), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt96 = list(makeKeyword("BREAK-LIST"), makeKeyword("EMBED-LIST"), makeKeyword("INCLUDE-STOPS"), makeKeyword("IGNORE-EMPTY-STRINGS"), makeKeyword("QUOTE-CHARS"));

    static private final SubLList $list_alt98 = list(makeSymbol("LIST"), CHAR_comma);

    static private final SubLList $list_alt100 = list(makeSymbol("LIST"), list(makeSymbol("LIST"), makeString("\""), makeString("\"")));

    static private final SubLList $list_alt104 = list(makeSymbol("LIST"), CHAR_backslash);

    static private final SubLSymbol $sym105$LINE = makeUninternedSymbol("LINE");

    /**
     *
     *
     * @unknown pace
     */
    @LispMethod(comment = "@unknown pace")
    public static final SubLObject make_directory_or_error_alt(SubLObject directory_name, SubLObject path) {
        if (path == UNPROVIDED) {
            path = NIL;
        }
        return com.cyc.cycjava.cycl.file_utilities.make_directory_or_possibly_error(directory_name, path, T);
    }

    /**
     *
     *
     * @unknown pace
     */
    @LispMethod(comment = "@unknown pace")
    public static SubLObject make_directory_or_error(final SubLObject directory_name, SubLObject path) {
        if (path == UNPROVIDED) {
            path = NIL;
        }
        return make_directory_or_possibly_error(directory_name, path, T);
    }

    static private final SubLList $list_alt108 = list(list(makeSymbol("FILE"), makeSymbol("&KEY"), list(makeSymbol("BREAK-LIST"), list(QUOTE, list(makeSymbol("MAPCAR"), list(makeSymbol("FUNCTION"), makeSymbol("TO-STRING")), list(makeSymbol("WHITESPACE-CHARS"))))), makeSymbol("EMBED-LIST"), makeSymbol("INCLUDE-STOPS"), list(makeSymbol("IGNORE-EMPTY-STRINGS"), T), makeSymbol("QUOTE-CHARS")), makeSymbol("LAMBDA-LIST"), makeSymbol("&BODY"), makeSymbol("BODY"));

    /**
     *
     *
     * @unknown pace
     */
    @LispMethod(comment = "@unknown pace")
    public static final SubLObject make_directory_or_possibly_error_alt(SubLObject directory_name, SubLObject path, SubLObject errorP) {
        if (path == UNPROVIDED) {
            path = NIL;
        }
        if (errorP == UNPROVIDED) {
            errorP = NIL;
        }
        {
            SubLObject result = Filesys.make_directory(directory_name, path, UNPROVIDED);
            if ((NIL != errorP) && (NIL == result)) {
                Errors.error($str_alt198$Could_not_make_directory__a_with_, directory_name, path);
            }
            return result;
        }
    }

    /**
     *
     *
     * @unknown pace
     */
    @LispMethod(comment = "@unknown pace")
    public static SubLObject make_directory_or_possibly_error(final SubLObject directory_name, SubLObject path, SubLObject errorP) {
        if (path == UNPROVIDED) {
            path = NIL;
        }
        if (errorP == UNPROVIDED) {
            errorP = NIL;
        }
        final SubLObject result = Filesys.make_directory(directory_name, path, UNPROVIDED);
        if ((NIL != errorP) && (NIL == result)) {
            Errors.error($str216$Could_not_make_directory__a_with_, directory_name, path);
        }
        return result;
    }

    static private final SubLList $list_alt109 = list(makeSymbol("MAPCAR"), list(makeSymbol("FUNCTION"), makeSymbol("TO-STRING")), list(makeSymbol("WHITESPACE-CHARS")));

    static private final SubLSymbol $sym110$LINE = makeUninternedSymbol("LINE");

    /**
     * Creates a subdirectory of PATHNAME with a name based on the current time.
     * Errors if the directory already exists.
     *
     * @unknown pace
     */
    @LispMethod(comment = "Creates a subdirectory of PATHNAME with a name based on the current time.\r\nErrors if the directory already exists.\r\n\r\n@unknown pace\nCreates a subdirectory of PATHNAME with a name based on the current time.\nErrors if the directory already exists.")
    public static final SubLObject make_timestamp_subdirectory_alt(SubLObject pathname) {
        return com.cyc.cycjava.cycl.file_utilities.make_directory_or_error(com.cyc.cycjava.cycl.file_utilities.timestamp_subdirectory(pathname), UNPROVIDED);
    }

    @LispMethod(comment = "Creates a subdirectory of PATHNAME with a name based on the current time.\r\nErrors if the directory already exists.\r\n\r\n@unknown pace\nCreates a subdirectory of PATHNAME with a name based on the current time.\nErrors if the directory already exists.")
    public static SubLObject make_timestamp_subdirectory(final SubLObject pathname) {
        return make_directory_or_error(timestamp_subdirectory(pathname), UNPROVIDED);
    }

    static private final SubLList $list_alt114 = list(makeSymbol("FUNCTION"), makeSymbol("READ-FROM-STRING"));

    static private final SubLSymbol $sym115$LINE = makeUninternedSymbol("LINE");

    /**
     * Returns a string specifying a subdirectory of PATHNAME with a name based on the current time.
     *
     * @unknown pace
     */
    @LispMethod(comment = "Returns a string specifying a subdirectory of PATHNAME with a name based on the current time.\r\n\r\n@unknown pace")
    public static final SubLObject timestamp_subdirectory_alt(SubLObject pathname) {
        pathname = com.cyc.cycjava.cycl.file_utilities.possibly_append_path_separator_char(pathname);
        {
            SubLObject dir_name = numeric_date_utilities.timestamp(UNPROVIDED, UNPROVIDED);
            SubLObject full_pathname = cconcatenate(pathname, dir_name);
            return com.cyc.cycjava.cycl.file_utilities.possibly_append_path_separator_char(full_pathname);
        }
    }

    @LispMethod(comment = "Returns a string specifying a subdirectory of PATHNAME with a name based on the current time.\r\n\r\n@unknown pace")
    public static SubLObject timestamp_subdirectory(SubLObject pathname) {
        pathname = possibly_append_path_separator_char(pathname);
        final SubLObject dir_name = numeric_date_utilities.timestamp(UNPROVIDED, UNPROVIDED);
        final SubLObject full_pathname = cconcatenate(pathname, dir_name);
        return possibly_append_path_separator_char(full_pathname);
    }

    static private final SubLSymbol $sym116$LINE_INDEX = makeUninternedSymbol("LINE-INDEX");

    static private final SubLSymbol $sym117$DONE_INT = makeUninternedSymbol("DONE-INT");

    static private final SubLList $list_alt118 = list(ZERO_INTEGER);

    static private final SubLList $list_alt119 = list(list(QUOTE, NIL));

    static private final SubLSymbol $sym121$_ = makeSymbol("<");

    /**
     * Given an absolute pathname for a file, either make sure that the directory exists and that
     * the file does NOT exist, or throw an error.  If overwrite? is t, destroy any files that
     * are in the way.
     *
     * @unknown scollins
     */
    @LispMethod(comment = "Given an absolute pathname for a file, either make sure that the directory exists and that\r\nthe file does NOT exist, or throw an error.  If overwrite? is t, destroy any files that\r\nare in the way.\r\n\r\n@unknown scollins\nGiven an absolute pathname for a file, either make sure that the directory exists and that\nthe file does NOT exist, or throw an error.  If overwrite? is t, destroy any files that\nare in the way.")
    public static final SubLObject prepare_to_possibly_overwrite_file_alt(SubLObject filename, SubLObject overwriteP) {
        if (overwriteP == UNPROVIDED) {
            overwriteP = T;
        }
        SubLTrampolineFile.checkType(filename, STRINGP);
        if (NIL != com.cyc.cycjava.cycl.file_utilities.file_existsP(filename)) {
            if (NIL != overwriteP) {
                Filesys.delete_file(filename);
                return filename;
            }
            Errors.error($str_alt199$File_already_exists___A__, filename);
        }
        return com.cyc.cycjava.cycl.file_utilities.make_directory_recursive(com.cyc.cycjava.cycl.file_utilities.partially_deconstruct_path(filename), overwriteP, UNPROVIDED);
    }

    @LispMethod(comment = "Given an absolute pathname for a file, either make sure that the directory exists and that\r\nthe file does NOT exist, or throw an error.  If overwrite? is t, destroy any files that\r\nare in the way.\r\n\r\n@unknown scollins\nGiven an absolute pathname for a file, either make sure that the directory exists and that\nthe file does NOT exist, or throw an error.  If overwrite? is t, destroy any files that\nare in the way.")
    public static SubLObject prepare_to_possibly_overwrite_file(final SubLObject filename, SubLObject overwriteP) {
        if (overwriteP == UNPROVIDED) {
            overwriteP = T;
        }
        assert NIL != stringp(filename) : "! stringp(filename) " + ("Types.stringp(filename) " + "CommonSymbols.NIL != Types.stringp(filename) ") + filename;
        if (NIL != file_existsP(filename)) {
            if (NIL != overwriteP) {
                Filesys.delete_file(filename);
                return filename;
            }
            Errors.error($str217$File_already_exists___A__, filename);
        }
        return make_directory_recursive(partially_deconstruct_path(filename), overwriteP, UNPROVIDED);
    }

    static private final SubLList $list_alt124 = list(makeSymbol("ITEM"), makeSymbol("TEMP-LINE-INDEX"));

    static private final SubLList $list_alt129 = list(makeSymbol("TEMP-LINE-INDEX"));

    static private final SubLList $list_alt132 = list(list(makeSymbol("RECORD"), makeSymbol("FILE"), makeSymbol("&OPTIONAL"), list(makeSymbol("SEPARATOR-TEST"), list(makeSymbol("FUNCTION"), makeSymbol("WHITESPACE-STRING?"))), list(makeSymbol("IGNORE-TEST"), list(makeSymbol("FUNCTION"), makeSymbol("FALSE")))), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym133$WHITESPACE_STRING_ = makeSymbol("WHITESPACE-STRING?");

    /**
     * Allocate a new file accumulator. The information is written to the PATH
     * function, and the underlying stream is opened with a mode of :TEXT.
     *
     * @return FILE-ACCUMULATOR-STATE-P
     */
    @LispMethod(comment = "Allocate a new file accumulator. The information is written to the PATH\r\nfunction, and the underlying stream is opened with a mode of :TEXT.\r\n\r\n@return FILE-ACCUMULATOR-STATE-P\nAllocate a new file accumulator. The information is written to the PATH\nfunction, and the underlying stream is opened with a mode of :TEXT.")
    public static final SubLObject new_file_accumulator_alt(SubLObject path, SubLObject mode, SubLObject write_fn) {
        if (mode == UNPROVIDED) {
            mode = $TEXT;
        }
        if (write_fn == UNPROVIDED) {
            write_fn = PRINT;
        }
        SubLTrampolineFile.checkType(write_fn, FUNCTION_SPEC_P);
        {
            SubLObject open_method = ($TEXT == mode) ? ((SubLObject) (OPEN_TEXT)) : OPEN_BINARY;
            SubLObject stream = funcall(open_method, path, $OUTPUT);
            if (!((NIL != open_stream_p(stream)) && (NIL != output_stream_p(stream)))) {
                Errors.error($str_alt204$Cannot_open__A_for_writing___, path);
            }
            {
                SubLObject state = com.cyc.cycjava.cycl.file_utilities.make_file_accumulator_state(stream, write_fn);
                return accumulation.new_accumulator(state, FILE_ACCUMULATOR_RESET, FILE_ACCUMULATOR_ADD, FILE_ACCUMULATOR_SIZE, FILE_ACCUMULATOR_CONTENTS, FILE_ACCUMULATOR_ITERATOR, UNPROVIDED);
            }
        }
    }

    @LispMethod(comment = "Allocate a new file accumulator. The information is written to the PATH\r\nfunction, and the underlying stream is opened with a mode of :TEXT.\r\n\r\n@return FILE-ACCUMULATOR-STATE-P\nAllocate a new file accumulator. The information is written to the PATH\nfunction, and the underlying stream is opened with a mode of :TEXT.")
    public static SubLObject new_file_accumulator(final SubLObject path, SubLObject mode, SubLObject write_fn) {
        if (mode == UNPROVIDED) {
            mode = $TEXT;
        }
        if (write_fn == UNPROVIDED) {
            write_fn = PRINT;
        }
        assert NIL != function_spec_p(write_fn) : "! function_spec_p(write_fn) " + ("Types.function_spec_p(write_fn) " + "CommonSymbols.NIL != Types.function_spec_p(write_fn) ") + write_fn;
        final SubLObject open_method = ($TEXT == mode) ? OPEN_TEXT : OPEN_BINARY;
        final SubLObject stream = funcall(open_method, path, $OUTPUT);
        if ((NIL == open_stream_p(stream)) || (NIL == output_stream_p(stream))) {
            Errors.error($str221$Cannot_open__A_for_writing___, path);
        }
        final SubLObject state = make_file_accumulator_state(stream, write_fn);
        return accumulation.new_accumulator(state, FILE_ACCUMULATOR_RESET, FILE_ACCUMULATOR_ADD, FILE_ACCUMULATOR_SIZE, FILE_ACCUMULATOR_CONTENTS, FILE_ACCUMULATOR_ITERATOR, UNPROVIDED);
    }

    static private final SubLSymbol $sym135$INSTREAM = makeUninternedSymbol("INSTREAM");

    static private final SubLSymbol $sym136$LINE = makeUninternedSymbol("LINE");

    static private final SubLList $list_alt139 = list(list(makeSymbol("FILE-VAR"), makeSymbol("DIRECTORY"), makeSymbol("&KEY"), list(makeSymbol("INCLUDE-DIRECTORY?"), T), makeSymbol("PROGRESS-MESSAGE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt140 = list(makeKeyword("INCLUDE-DIRECTORY?"), makeKeyword("PROGRESS-MESSAGE"), $DONE);

    public static final SubLSymbol $kw141$INCLUDE_DIRECTORY_ = makeKeyword("INCLUDE-DIRECTORY?");

    static private final SubLSymbol $sym142$DIRECTORY_CONTENTS_VAR = makeUninternedSymbol("DIRECTORY-CONTENTS-VAR");

    static private final SubLSymbol $sym143$PROGRESS_MESSAGE_VAR = makeUninternedSymbol("PROGRESS-MESSAGE-VAR");

    static private final SubLList $list_alt145 = list(makeSymbol("DIRECTORY-P"));


    /**
     * Since the file accumulator state contains a secret stream variable and the
     * accumulation API has nothing akin to 'RELEASE-RESOURCES' yet, a separate
     * API is provided for this.
     */
    @LispMethod(comment = "Since the file accumulator state contains a secret stream variable and the\r\naccumulation API has nothing akin to \'RELEASE-RESOURCES\' yet, a separate\r\nAPI is provided for this.\nSince the file accumulator state contains a secret stream variable and the\naccumulation API has nothing akin to \'RELEASE-RESOURCES\' yet, a separate\nAPI is provided for this.")
    public static final SubLObject close_file_accumulator_alt(SubLObject acc) {
        com.cyc.cycjava.cycl.file_utilities.file_accumulator_release_resources(accumulation.accumulation_peek_state(acc));
        return acc;
    }

    @LispMethod(comment = "Since the file accumulator state contains a secret stream variable and the\r\naccumulation API has nothing akin to \'RELEASE-RESOURCES\' yet, a separate\r\nAPI is provided for this.\nSince the file accumulator state contains a secret stream variable and the\naccumulation API has nothing akin to \'RELEASE-RESOURCES\' yet, a separate\nAPI is provided for this.")
    public static SubLObject close_file_accumulator(final SubLObject acc) {
        file_accumulator_release_resources(accumulation.accumulation_peek_state(acc));
        return acc;
    }

    static private final SubLList $list_alt150 = list(list(makeSymbol("SUBDIRECTORY"), makeSymbol("DIRECTORY"), makeSymbol("&KEY"), list(makeSymbol("INCLUDE-DIRECTORY?"), T)), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLObject make_file_accumulator_state_alt(SubLObject stream, SubLObject write_fn) {
        {
            SubLObject function_spec = (write_fn.isSymbol()) ? ((SubLObject) (symbol_function(write_fn))) : write_fn;
            return list($STREAM, stream, $WRITER, function_spec, $ITEM_COUNT, ZERO_INTEGER);
        }
    }

    public static SubLObject make_file_accumulator_state(final SubLObject stream, final SubLObject write_fn) {
        final SubLObject function_spec = (write_fn.isSymbol()) ? symbol_function(write_fn) : write_fn;
        return list($STREAM, stream, $WRITER, function_spec, $ITEM_COUNT, ZERO_INTEGER);
    }

    static private final SubLList $list_alt151 = list(makeKeyword("INCLUDE-DIRECTORY?"));

    public static final SubLObject with_file_accumulator_state_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt213);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject state = NIL;
                    SubLObject stream = NIL;
                    SubLObject writer = NIL;
                    SubLObject item_count = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt213);
                    state = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt213);
                    stream = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt213);
                    writer = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt213);
                    item_count = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(CDESTRUCTURING_BIND, list($sym214$_KEY, stream, writer, item_count), state, append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt213);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject with_file_accumulator_state(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list230);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject state = NIL;
        SubLObject stream = NIL;
        SubLObject writer = NIL;
        SubLObject item_count = NIL;
        destructuring_bind_must_consp(current, datum, $list230);
        state = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list230);
        stream = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list230);
        writer = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list230);
        item_count = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CDESTRUCTURING_BIND, list($sym231$_KEY, stream, writer, item_count), state, append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list230);
        return NIL;
    }

    static private final SubLList $list_alt156 = list(makeString("/"));

    static private final SubLString $str_alt158$_ = makeString("/");

    static private final SubLList $list_alt160 = list(CHAR_slash);

    static private final SubLList $list_alt161 = list(list(makeSymbol("FILE-VAR"), makeSymbol("DIRECTORY"), makeSymbol("&KEY"), list(makeSymbol("INCLUDE-DIRECTORY?"), T), list(makeSymbol("PROGRESS-MESSAGE"), makeString("Processing directory tree files..."))), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt162 = list(makeKeyword("INCLUDE-DIRECTORY?"), makeKeyword("PROGRESS-MESSAGE"));

    static private final SubLString $str_alt163$Processing_directory_tree_files__ = makeString("Processing directory tree files...");

    static private final SubLSymbol $sym164$DIRECTORY_LIST_VAR = makeUninternedSymbol("DIRECTORY-LIST-VAR");

    static private final SubLSymbol $sym165$CURRENT_DIRECTORY_VAR = makeUninternedSymbol("CURRENT-DIRECTORY-VAR");

    static private final SubLString $str_alt171$___Directory___S = makeString("~% Directory: ~S");

    static private final SubLString $str_alt172$_1_ = makeString("-1 ");

    static private final SubLString $str_alt173$___wc__l = makeString(" | wc -l");

    public static final SubLObject file_accumulator_state_set_item_count_alt(SubLObject state, SubLObject count) {
        return putf(state, $ITEM_COUNT, count);
    }

    public static SubLObject file_accumulator_state_set_item_count(final SubLObject state, final SubLObject count) {
        return putf(state, $ITEM_COUNT, count);
    }

    static private final SubLString $$$ls = makeString("ls");

    public static final SubLObject file_accumulator_state_reset_item_count_alt(SubLObject state) {
        return com.cyc.cycjava.cycl.file_utilities.file_accumulator_state_set_item_count(state, ZERO_INTEGER);
    }

    public static SubLObject file_accumulator_state_reset_item_count(final SubLObject state) {
        return file_accumulator_state_set_item_count(state, ZERO_INTEGER);
    }

    static private final SubLString $str_alt177$_ = makeString("\\");

    static private final SubLList $list_alt178 = list(makeString("/"), makeString("\\"));

    public static final SubLObject file_accumulator_state_get_stream_alt(SubLObject state) {
        return getf(state, $STREAM, UNPROVIDED);
    }

    public static SubLObject file_accumulator_state_get_stream(final SubLObject state) {
        return getf(state, $STREAM, UNPROVIDED);
    }

    static private final SubLString $str_alt179$Could_not_find__A = makeString("Could not find ~A");

    static private final SubLString $str_alt180$Could_not_find__A_A = makeString("Could not find ~A~A");

    public static final SubLObject file_accumulator_reset_alt(SubLObject state) {
        {
            SubLObject stream = com.cyc.cycjava.cycl.file_utilities.file_accumulator_state_get_stream(state);
            file_position(stream, ZERO_INTEGER);
        }
        return com.cyc.cycjava.cycl.file_utilities.file_accumulator_state_reset_item_count(state);
    }

    public static SubLObject file_accumulator_reset(final SubLObject state) {
        final SubLObject stream = file_accumulator_state_get_stream(state);
        file_position(stream, ZERO_INTEGER);
        return file_accumulator_state_reset_item_count(state);
    }

    static private final SubLString $str_alt181$File_not_found_ = makeString("File not found.");

    static private final SubLString $str_alt182$File_not_found_from_directory__A = makeString("File not found from directory ~A");

    public static final SubLObject file_accumulator_add_alt(SubLObject state, SubLObject element) {
        {
            SubLObject datum = state;
            SubLObject current = datum;
            SubLObject allow_other_keys_p = NIL;
            SubLObject rest = current;
            SubLObject bad = NIL;
            SubLObject current_20 = NIL;
            for (; NIL != rest;) {
                destructuring_bind_must_consp(rest, datum, $list_alt215);
                current_20 = rest.first();
                rest = rest.rest();
                destructuring_bind_must_consp(rest, datum, $list_alt215);
                if (NIL == member(current_20, $list_alt216, UNPROVIDED, UNPROVIDED)) {
                    bad = T;
                }
                if (current_20 == $ALLOW_OTHER_KEYS) {
                    allow_other_keys_p = rest.first();
                }
                rest = rest.rest();
            }
            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                cdestructuring_bind_error(datum, $list_alt215);
            }
            {
                SubLObject stream_tail = property_list_member($STREAM, current);
                SubLObject stream = (NIL != stream_tail) ? ((SubLObject) (cadr(stream_tail))) : NIL;
                SubLObject writer_tail = property_list_member($WRITER, current);
                SubLObject writer = (NIL != writer_tail) ? ((SubLObject) (cadr(writer_tail))) : NIL;
                SubLObject item_count_tail = property_list_member($ITEM_COUNT, current);
                SubLObject item_count = (NIL != item_count_tail) ? ((SubLObject) (cadr(item_count_tail))) : NIL;
                funcall(writer, element, stream);
                return com.cyc.cycjava.cycl.file_utilities.file_accumulator_state_set_item_count(state, add(item_count, ONE_INTEGER));
            }
        }
    }

    public static SubLObject file_accumulator_add(final SubLObject state, final SubLObject element) {
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = state;
        SubLObject bad = NIL;
        SubLObject current_$24 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, state, $list232);
            current_$24 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, state, $list232);
            if (NIL == member(current_$24, $list233, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$24 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(state, $list232);
        }
        final SubLObject stream_tail = property_list_member($STREAM, state);
        final SubLObject stream = (NIL != stream_tail) ? cadr(stream_tail) : NIL;
        final SubLObject writer_tail = property_list_member($WRITER, state);
        final SubLObject writer = (NIL != writer_tail) ? cadr(writer_tail) : NIL;
        final SubLObject item_count_tail = property_list_member($ITEM_COUNT, state);
        final SubLObject item_count = (NIL != item_count_tail) ? cadr(item_count_tail) : NIL;
        funcall(writer, element, stream);
        return file_accumulator_state_set_item_count(state, add(item_count, ONE_INTEGER));
    }

    static private final SubLString $str_alt185$__ = makeString("\\\\");

    static private final SubLString $str_alt187$_ = makeString(":");

    static private final SubLString $str_alt188$Path_type_mismatch_ = makeString("Path type mismatch.");

    static private final SubLString $str_alt189$__ = makeString("..");

    static private final SubLString $str_alt190$Cannot_make_relative_path__A_even = makeString("Cannot make relative path ~A even more relative ....");

    static private final SubLString $str_alt191$Cannot_strip_non_absolute_prefix_ = makeString("Cannot strip non-absolute prefix ~A from path ~A.");

    static private final SubLString $str_alt192$Warning__unable_to_read_file__s__ = makeString("Warning: unable to read file ~s~%");

    static private final SubLString $str_alt193$make_directory_recursive__could_n = makeString("make-directory-recursive: could not create ~A since it exists as a file.");

    static private final SubLString $str_alt196$_s = makeString("-s");

    static private final SubLString $str_alt197$I_m_alive___ = makeString("I'm alive!~%");

    static private final SubLString $str_alt198$Could_not_make_directory__a_with_ = makeString("Could not make directory ~a with path ~a");

    static private final SubLString $str_alt199$File_already_exists___A__ = makeString("File already exists: ~A~%");

    public static final SubLObject file_accumulator_size_alt(SubLObject state) {
        {
            SubLObject datum = state;
            SubLObject current = datum;
            SubLObject allow_other_keys_p = NIL;
            SubLObject rest = current;
            SubLObject bad = NIL;
            SubLObject current_21 = NIL;
            for (; NIL != rest;) {
                destructuring_bind_must_consp(rest, datum, $list_alt215);
                current_21 = rest.first();
                rest = rest.rest();
                destructuring_bind_must_consp(rest, datum, $list_alt215);
                if (NIL == member(current_21, $list_alt216, UNPROVIDED, UNPROVIDED)) {
                    bad = T;
                }
                if (current_21 == $ALLOW_OTHER_KEYS) {
                    allow_other_keys_p = rest.first();
                }
                rest = rest.rest();
            }
            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                cdestructuring_bind_error(datum, $list_alt215);
            }
            {
                SubLObject stream_tail = property_list_member($STREAM, current);
                SubLObject stream = (NIL != stream_tail) ? ((SubLObject) (cadr(stream_tail))) : NIL;
                SubLObject writer_tail = property_list_member($WRITER, current);
                SubLObject writer = (NIL != writer_tail) ? ((SubLObject) (cadr(writer_tail))) : NIL;
                SubLObject item_count_tail = property_list_member($ITEM_COUNT, current);
                SubLObject item_count = (NIL != item_count_tail) ? ((SubLObject) (cadr(item_count_tail))) : NIL;
                return item_count;
            }
        }
    }

    public static SubLObject file_accumulator_size(final SubLObject state) {
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = state;
        SubLObject bad = NIL;
        SubLObject current_$25 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, state, $list232);
            current_$25 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, state, $list232);
            if (NIL == member(current_$25, $list233, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$25 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(state, $list232);
        }
        final SubLObject stream_tail = property_list_member($STREAM, state);
        final SubLObject stream = (NIL != stream_tail) ? cadr(stream_tail) : NIL;
        final SubLObject writer_tail = property_list_member($WRITER, state);
        final SubLObject writer = (NIL != writer_tail) ? cadr(writer_tail) : NIL;
        final SubLObject item_count_tail = property_list_member($ITEM_COUNT, state);
        final SubLObject item_count = (NIL != item_count_tail) ? cadr(item_count_tail) : NIL;
        return item_count;
    }

    static private final SubLString $str_alt204$Cannot_open__A_for_writing___ = makeString("Cannot open ~A for writing.~%");

    static private final SubLList $list_alt213 = list(list(makeSymbol("STATE"), makeSymbol("STREAM"), makeSymbol("WRITER"), makeSymbol("ITEM-COUNT")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym214$_KEY = makeSymbol("&KEY");

    static private final SubLList $list_alt215 = list(makeSymbol("&KEY"), makeSymbol("STREAM"), makeSymbol("WRITER"), makeSymbol("ITEM-COUNT"));

    static private final SubLList $list_alt216 = list(makeKeyword("STREAM"), makeKeyword("WRITER"), makeKeyword("ITEM-COUNT"));

    static private final SubLString $str_alt217$Operation_not_supported_for_file_ = makeString("Operation not supported for file accumulator ~A.");

    static private final SubLString $str_alt218$Operation_not_yet_supported_for_f = makeString("Operation not yet supported for file accumulator ~A");

    public static final SubLObject file_accumulator_contents_alt(SubLObject state, SubLObject reset_p) {
        return Errors.error($str_alt217$Operation_not_supported_for_file_, state);
    }

    public static SubLObject file_accumulator_contents(final SubLObject state, final SubLObject reset_p) {
        return Errors.error($str234$Operation_not_supported_for_file_, state);
    }

    static private final SubLString $str_alt219$ads65jh3_ = makeString("ads65jh3/");

    public static final SubLObject file_accumulator_iterator_alt(SubLObject state) {
        return Errors.error($str_alt218$Operation_not_yet_supported_for_f, state);
    }

    public static SubLObject file_accumulator_iterator(final SubLObject state) {
        return Errors.error($str235$Operation_not_yet_supported_for_f, state);
    }

    static private final SubLString $str_alt220$Couldn_t_test_creation_of__S__as_ = makeString("Couldn't test creation of ~S, as it already is a known directory");

    public static final SubLObject file_accumulator_release_resources_alt(SubLObject state) {
        {
            SubLObject stream = com.cyc.cycjava.cycl.file_utilities.file_accumulator_state_get_stream(state);
            close(stream, UNPROVIDED);
        }
        return state;
    }

    public static SubLObject file_accumulator_release_resources(final SubLObject state) {
        final SubLObject stream = file_accumulator_state_get_stream(state);
        close(stream, UNPROVIDED);
        return state;
    }

    static private final SubLString $str_alt221$Failed_to_create_or_delete__S = makeString("Failed to create or delete ~S");

    static private final SubLString $str_alt223$Couldn_t_test_creation_and_deleti = makeString("Couldn't test creation and deletion of subdirectories in ~S, as it is not known to be a directory");

    public static SubLObject copy_binary_data_to_hex_stream(final SubLObject in_stream, final SubLObject hex_stream, final SubLObject start, SubLObject end) {
        if (end == UNPROVIDED) {
            end = file_length(in_stream);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject curr = start;
        compatibility.set_file_position(in_stream, start);
        while (curr.numL(end)) {
            final SubLObject v_byte = read_byte(in_stream, NIL, $EOF);
            if (v_byte.isFixnum()) {
                thread.resetMultipleValues();
                final SubLObject high_char = vector_utilities.byte_to_hex_chars(v_byte);
                final SubLObject low_char = thread.secondMultipleValue();
                thread.resetMultipleValues();
                princ(high_char, hex_stream);
                princ(low_char, hex_stream);
            }
            curr = add(curr, ONE_INTEGER);
        } 
        return hex_stream;
    }

    static private final SubLList $list_alt224 = list(makeString("data"));

    static private final SubLString $$$baxter = makeString("baxter");

    static private final SubLList $list_alt234 = list(list(NIL, T));

    public static SubLObject get_binary_data_from_stream(final SubLObject stream, final SubLObject start, SubLObject end) {
        if (end == UNPROVIDED) {
            end = file_length(stream);
        }
        SubLObject hex_string = NIL;
        SubLObject s = NIL;
        try {
            s = make_private_string_output_stream();
            copy_binary_data_to_hex_stream(stream, s, start, end);
            hex_string = get_output_stream_string(s);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                close(s, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return hex_string;
    }

    public static SubLObject test_get_binary_data_from_stream(final SubLObject objects) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject file = make_temp_filename($temp_directory$.getGlobalValue());
        SubLObject encoding = NIL;
        try {
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_binary(file, $OUTPUT);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str68$Unable_to_open__S, file);
                }
                final SubLObject bin_s = stream;
                final SubLObject encoding_s = new_cfasl_encoding_stream();
                try {
                    SubLObject cdolist_list_var = objects;
                    SubLObject v_object = NIL;
                    v_object = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        cfasl_output(v_object, encoding_s);
                        cfasl_output(v_object, bin_s);
                        cdolist_list_var = cdolist_list_var.rest();
                        v_object = cdolist_list_var.first();
                    } 
                    encoding = cfasl_encoding_string_stream_encoding(encoding_s);
                } finally {
                    final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        close_cfasl_encoding_stream(encoding_s);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                    }
                }
            } finally {
                final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                }
            }
            SubLObject stream_$26 = NIL;
            try {
                final SubLObject _prev_bind_4 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream_$26 = compatibility.open_binary(file, $INPUT);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_4, thread);
                }
                if (!stream_$26.isStream()) {
                    Errors.error($str68$Unable_to_open__S, file);
                }
                final SubLObject bin_s2 = stream_$26;
                final SubLObject byte_length = integerDivide(length(encoding), TWO_INTEGER);
                SubLObject times;
                SubLObject offset;
                SubLObject start;
                SubLObject end;
                SubLObject actual;
                SubLObject string_start;
                SubLObject string_end;
                SubLObject sub_encoding;
                for (times = max(ONE_INTEGER, integerDivide(byte_length, THREE_INTEGER)), offset = NIL, offset = ZERO_INTEGER; offset.numL(times); offset = add(offset, ONE_INTEGER)) {
                    start = offset;
                    end = subtract(byte_length, offset);
                    actual = get_binary_data_from_stream(bin_s2, start, end);
                    string_start = multiply(start, TWO_INTEGER);
                    string_end = multiply(end, TWO_INTEGER);
                    sub_encoding = string_utilities.substring(encoding, string_start, string_end);
                    if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == Strings.string_equal(actual, sub_encoding, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                        Errors.error($str244$Expected__S__which_is___A__A__of_, new SubLObject[]{ sub_encoding, start, end, encoding, actual });
                    }
                }
            } finally {
                final SubLObject _prev_bind_5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values3 = getValuesAsVector();
                    if (stream_$26.isStream()) {
                        close(stream_$26, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values3);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
                }
            }
        } finally {
            final SubLObject _prev_bind_6 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values4 = getValuesAsVector();
                SubLObject ignore_errors_tag = NIL;
                try {
                    thread.throwStack.push($IGNORE_ERRORS_TARGET);
                    final SubLObject _prev_bind_0_$27 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                        try {
                            Filesys.delete_file(file);
                        } catch (final Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_0_$27, thread);
                    }
                } catch (final Throwable ccatch_env_var) {
                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                    thread.throwStack.pop();
                } finally {
                    thread.throwStack.pop();
                }
                restoreValuesFromVector(_values4);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_6, thread);
            }
        }
        return $SUCCESS;
    }

    public static SubLObject file_contents_to_hex_string(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject hex_string = NIL;
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_binary(filename, $INPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str68$Unable_to_open__S, filename);
            }
            final SubLObject s = stream;
            hex_string = get_binary_data_from_stream(s, ZERO_INTEGER, UNPROVIDED);
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return hex_string;
    }

    public static SubLObject hex_string_to_file_contents(final SubLObject hex_string, final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject bytes = NIL;
        SubLObject hi = NIL;
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_binary(filename, $OUTPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str68$Unable_to_open__S, filename);
            }
            final SubLObject s = stream;
            SubLObject end_var_$28;
            SubLObject end_var;
            SubLObject char_num;
            SubLObject v_char;
            SubLObject v_byte;
            for (end_var = end_var_$28 = length(hex_string), char_num = NIL, char_num = ZERO_INTEGER; !char_num.numGE(end_var_$28); char_num = number_utilities.f_1X(char_num)) {
                v_char = Strings.sublisp_char(hex_string, char_num);
                if (NIL != string_utilities.hex_char_p(v_char)) {
                    if (NIL == hi) {
                        hi = v_char;
                    } else {
                        v_byte = vector_utilities.hex_chars_to_byte(hi, v_char);
                        write_byte(v_byte, s);
                        hi = NIL;
                    }
                }
            }
            force_output(s);
            bytes = file_length(s);
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return bytes;
    }

    public static SubLObject file_stream_direction(final SubLObject file_stream) {
        if (NIL == output_stream_p(file_stream)) {
            return $INPUT;
        }
        if (NIL != input_stream_p(file_stream)) {
            return $IO;
        }
        return $OUTPUT;
    }

    public static SubLObject change_file_stream_buffer_size(final SubLObject old_stream, final SubLObject new_buffer_size) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != output_stream_p(old_stream)) {
            force_output(old_stream);
        }
        final SubLObject loc = file_position(old_stream, UNPROVIDED);
        final SubLObject file_name = string_utilities.to_string(Filesys.probe_file(old_stream));
        final SubLObject element_type = stream_element_type(old_stream);
        final SubLObject direction = file_stream_direction(old_stream);
        SubLObject new_stream = NIL;
        close(old_stream, UNPROVIDED);
        final SubLObject _prev_bind_0 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(thread);
        final SubLObject _prev_bind_2 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(thread);
        try {
            StreamsLow.$stream_initial_input_buffer_size$.bind(new_buffer_size, thread);
            StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(thread), thread);
            if ($TEXT == element_type) {
                new_stream = StreamsLow.open(file_name, new SubLObject[]{ $DIRECTION, direction, $IF_EXISTS, $APPEND, $IF_DOES_NOT_EXIST, $ERROR, $ELEMENT_TYPE, $TEXT });
            } else {
                new_stream = StreamsLow.open(file_name, new SubLObject[]{ $DIRECTION, direction, $IF_EXISTS, $APPEND, $IF_DOES_NOT_EXIST, $ERROR, $ELEMENT_TYPE, $BINARY });
            }
        } finally {
            StreamsLow.$stream_initial_output_buffer_size$.rebind(_prev_bind_2, thread);
            StreamsLow.$stream_initial_input_buffer_size$.rebind(_prev_bind_0, thread);
        }
        file_position(new_stream, loc);
        return new_stream;
    }

    public static SubLObject with_file_memory_mapping(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(CLET, $list247, bq_cons(PROGN, append(body, NIL)));
    }

    public static SubLObject without_file_memory_mapping(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(CLET, $list248, bq_cons(PROGN, append(body, NIL)));
    }

    public static SubLObject file_stream_memory_mappedP(final SubLObject file_stream) {
        return StreamsLow.isMemoryMappedStream(file_stream);
    }

    public static SubLObject enable_file_stream_memory_mapping(final SubLObject old_stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == open_stream_p(old_stream)) {
            return old_stream;
        }
        if (NIL != file_stream_memory_mappedP(old_stream)) {
            return old_stream;
        }
        if (NIL != output_stream_p(old_stream)) {
            force_output(old_stream);
        }
        final SubLObject loc = file_position(old_stream, UNPROVIDED);
        final SubLObject file_name = string_utilities.to_string(Filesys.probe_file(old_stream));
        final SubLObject element_type = stream_element_type(old_stream);
        final SubLObject direction = file_stream_direction(old_stream);
        SubLObject new_stream = NIL;
        close(old_stream, UNPROVIDED);
        final SubLObject _prev_bind_0 = StreamsLow.$should_memory_map_files$.currentBinding(thread);
        try {
            StreamsLow.$should_memory_map_files$.bind(T, thread);
            if ($TEXT == element_type) {
                new_stream = StreamsLow.open(file_name, new SubLObject[]{ $DIRECTION, direction, $IF_EXISTS, $APPEND, $IF_DOES_NOT_EXIST, $ERROR, $ELEMENT_TYPE, $TEXT });
            } else {
                new_stream = StreamsLow.open(file_name, new SubLObject[]{ $DIRECTION, direction, $IF_EXISTS, $APPEND, $IF_DOES_NOT_EXIST, $ERROR, $ELEMENT_TYPE, $BINARY });
            }
        } finally {
            StreamsLow.$should_memory_map_files$.rebind(_prev_bind_0, thread);
        }
        file_position(new_stream, loc);
        return new_stream;
    }

    public static final SubLObject check_directory_creation_and_deletion_alt(SubLObject directory_name) {
        {
            SubLObject createdP = NIL;
            SubLObject deletedP = NIL;
            com.cyc.cycjava.cycl.file_utilities.make_directory_recursive(directory_name, UNPROVIDED, UNPROVIDED);
            if (NIL != Filesys.directory_p(directory_name)) {
                createdP = T;
                Filesys.delete_directory(directory_name, UNPROVIDED);
                sleep(ONE_INTEGER);
                deletedP = makeBoolean(NIL == Filesys.directory_p(directory_name));
            }
            return makeBoolean((NIL != createdP) && (NIL != deletedP));
        }
    }

    public static SubLObject check_directory_creation_and_deletion(final SubLObject directory_name) {
        SubLObject createdP = NIL;
        SubLObject deletedP = NIL;
        make_directory_recursive(directory_name, UNPROVIDED, UNPROVIDED);
        if (NIL != Filesys.directory_p(directory_name)) {
            createdP = T;
            Filesys.delete_directory(directory_name, UNPROVIDED);
            sleep(ONE_INTEGER);
            deletedP = makeBoolean(NIL == Filesys.directory_p(directory_name));
        }
        return makeBoolean((NIL != createdP) && (NIL != deletedP));
    }

    public static final SubLObject test_directory_creation_and_deletion_alt() {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.file_utilities.test_directory_creation_and_deletion_absolute()) && (NIL != com.cyc.cycjava.cycl.file_utilities.test_directory_creation_and_deletion_relative()));
    }

    public static SubLObject test_directory_creation_and_deletion() {
        return makeBoolean((NIL != test_directory_creation_and_deletion_absolute()) && (NIL != test_directory_creation_and_deletion_relative()));
    }

    public static final SubLObject test_directory_creation_and_deletion_absolute_alt() {
        {
            SubLObject absolute_directory = $str_alt20$_tmp_;
            SubLObject failP = NIL;
            if (NIL != Filesys.directory_p(absolute_directory)) {
                {
                    SubLObject name = $str_alt219$ads65jh3_;
                    SubLObject subdirectory = cconcatenate(absolute_directory, name);
                    if (NIL != Filesys.directory_p(subdirectory)) {
                        Errors.warn($str_alt220$Couldn_t_test_creation_of__S__as_, subdirectory);
                    } else {
                        if (NIL == com.cyc.cycjava.cycl.file_utilities.check_directory_creation_and_deletion(subdirectory)) {
                            Errors.warn($str_alt221$Failed_to_create_or_delete__S, subdirectory);
                            failP = T;
                        }
                    }
                    {
                        SubLObject name_22 = $$$ds6sdg32;
                        SubLObject sub_sub = cconcatenate(subdirectory, name_22);
                        if (NIL != Filesys.directory_p(sub_sub)) {
                            Errors.warn($str_alt220$Couldn_t_test_creation_of__S__as_, sub_sub);
                        } else {
                            if (NIL == com.cyc.cycjava.cycl.file_utilities.check_directory_creation_and_deletion(sub_sub)) {
                                Errors.warn($str_alt221$Failed_to_create_or_delete__S, sub_sub);
                                failP = T;
                            }
                        }
                        Filesys.delete_directory(subdirectory, UNPROVIDED);
                    }
                }
            } else {
                Errors.warn($str_alt223$Couldn_t_test_creation_and_deleti, absolute_directory);
            }
            return makeBoolean(NIL == failP);
        }
    }

    public static SubLObject test_directory_creation_and_deletion_absolute() {
        final SubLObject absolute_directory = $str27$_tmp_;
        SubLObject failP = NIL;
        if (NIL != Filesys.directory_p(absolute_directory)) {
            final SubLObject name = $str249$ads65jh3_;
            final SubLObject subdirectory = cconcatenate(absolute_directory, name);
            if (NIL != Filesys.directory_p(subdirectory)) {
                Errors.warn($str250$Couldn_t_test_creation_of__S__as_, subdirectory);
            } else
                if (NIL == check_directory_creation_and_deletion(subdirectory)) {
                    Errors.warn($str251$Failed_to_create_or_delete__S, subdirectory);
                    failP = T;
                }

            final SubLObject name_$29 = $$$ds6sdg32;
            final SubLObject sub_sub = cconcatenate(subdirectory, name_$29);
            if (NIL != Filesys.directory_p(sub_sub)) {
                Errors.warn($str250$Couldn_t_test_creation_of__S__as_, sub_sub);
            } else
                if (NIL == check_directory_creation_and_deletion(sub_sub)) {
                    Errors.warn($str251$Failed_to_create_or_delete__S, sub_sub);
                    failP = T;
                }

            Filesys.delete_directory(subdirectory, UNPROVIDED);
        } else {
            Errors.warn($str253$Couldn_t_test_creation_and_deleti, absolute_directory);
        }
        return makeBoolean(NIL == failP);
    }

    public static final SubLObject test_directory_creation_and_deletion_relative_alt() {
        {
            SubLObject relative_directory = com.cyc.cycjava.cycl.file_utilities.relative_filename(string_utilities.$empty_string$.getGlobalValue(), Filesys.construct_filename($list_alt224, string_utilities.$empty_string$.getGlobalValue(), NIL, T), UNPROVIDED);
            SubLObject failP = NIL;
            if (NIL != Filesys.directory_p(relative_directory)) {
                {
                    SubLObject name = $$$ads65jh3;
                    SubLObject subdirectory = com.cyc.cycjava.cycl.file_utilities.relative_filename(relative_directory, Filesys.construct_filename(list(name), string_utilities.$empty_string$.getGlobalValue(), NIL, T), UNPROVIDED);
                    if (NIL != Filesys.directory_p(subdirectory)) {
                        Errors.warn($str_alt220$Couldn_t_test_creation_of__S__as_, subdirectory);
                    } else {
                        if (NIL == com.cyc.cycjava.cycl.file_utilities.check_directory_creation_and_deletion(subdirectory)) {
                            Errors.warn($str_alt221$Failed_to_create_or_delete__S, subdirectory);
                            failP = T;
                        }
                    }
                    {
                        SubLObject name_23 = $$$ds6sdg32;
                        SubLObject sub_sub = com.cyc.cycjava.cycl.file_utilities.relative_filename(subdirectory, Filesys.construct_filename(list(name_23), string_utilities.$empty_string$.getGlobalValue(), NIL, T), UNPROVIDED);
                        if (NIL != Filesys.directory_p(sub_sub)) {
                            Errors.warn($str_alt220$Couldn_t_test_creation_of__S__as_, sub_sub);
                        } else {
                            if (NIL == com.cyc.cycjava.cycl.file_utilities.check_directory_creation_and_deletion(sub_sub)) {
                                Errors.warn($str_alt221$Failed_to_create_or_delete__S, sub_sub);
                                failP = T;
                            }
                        }
                        Filesys.delete_directory(subdirectory, UNPROVIDED);
                    }
                }
            } else {
                Errors.warn($str_alt223$Couldn_t_test_creation_and_deleti, relative_directory);
            }
            return makeBoolean(NIL == failP);
        }
    }

    public static SubLObject test_directory_creation_and_deletion_relative() {
        final SubLObject relative_directory = relative_filename(string_utilities.$empty_string$.getGlobalValue(), Filesys.construct_filename($list254, string_utilities.$empty_string$.getGlobalValue(), NIL, T), UNPROVIDED);
        SubLObject failP = NIL;
        if (NIL != Filesys.directory_p(relative_directory)) {
            final SubLObject name = $$$ads65jh3;
            final SubLObject subdirectory = relative_filename(relative_directory, Filesys.construct_filename(list(name), string_utilities.$empty_string$.getGlobalValue(), NIL, T), UNPROVIDED);
            if (NIL != Filesys.directory_p(subdirectory)) {
                Errors.warn($str250$Couldn_t_test_creation_of__S__as_, subdirectory);
            } else
                if (NIL == check_directory_creation_and_deletion(subdirectory)) {
                    Errors.warn($str251$Failed_to_create_or_delete__S, subdirectory);
                    failP = T;
                }

            final SubLObject name_$30 = $$$ds6sdg32;
            final SubLObject sub_sub = relative_filename(subdirectory, Filesys.construct_filename(list(name_$30), string_utilities.$empty_string$.getGlobalValue(), NIL, T), UNPROVIDED);
            if (NIL != Filesys.directory_p(sub_sub)) {
                Errors.warn($str250$Couldn_t_test_creation_of__S__as_, sub_sub);
            } else
                if (NIL == check_directory_creation_and_deletion(sub_sub)) {
                    Errors.warn($str251$Failed_to_create_or_delete__S, sub_sub);
                    failP = T;
                }

            Filesys.delete_directory(subdirectory, UNPROVIDED);
        } else {
            Errors.warn($str253$Couldn_t_test_creation_and_deleti, relative_directory);
        }
        return makeBoolean(NIL == failP);
    }

    public static SubLObject declare_file_utilities_file() {
        declareMacro("with_stream_buffer_size", "WITH-STREAM-BUFFER-SIZE");
        declareMacro("possibly_with_text_file", "POSSIBLY-WITH-TEXT-FILE");
        declareMacro("possibly_with_private_text_file", "POSSIBLY-WITH-PRIVATE-TEXT-FILE");
        declareMacro("possibly_with_binary_file", "POSSIBLY-WITH-BINARY-FILE");
        declareMacro("possibly_with_private_binary_file", "POSSIBLY-WITH-PRIVATE-BINARY-FILE");
        declareFunction("peek_byte_from_char_stream", "PEEK-BYTE-FROM-CHAR-STREAM", 0, 3, false);
        declareFunction("read_byte_from_char_stream", "READ-BYTE-FROM-CHAR-STREAM", 0, 3, false);
        declareFunction("unread_byte_from_char_stream", "UNREAD-BYTE-FROM-CHAR-STREAM", 1, 1, false);
        declareFunction("write_byte_to_char_stream", "WRITE-BYTE-TO-CHAR-STREAM", 1, 1, false);
        declareFunction("stream_designator_p", "STREAM-DESIGNATOR-P", 1, 0, false);
        declareFunction("pathname_designator_p", "PATHNAME-DESIGNATOR-P", 1, 0, false);
        declareFunction("load_from_cyc_home", "LOAD-FROM-CYC-HOME", 1, 0, false);
        declareFunction("cyc_home_filename", "CYC-HOME-FILENAME", 2, 1, false);
        declareFunction("cyc_home_subdirectory", "CYC-HOME-SUBDIRECTORY", 1, 0, false);
        declareFunction("canonical_cyc_working_directory", "CANONICAL-CYC-WORKING-DIRECTORY", 0, 0, false);
        declareFunction("relative_filename", "RELATIVE-FILENAME", 2, 1, false);
        declareFunction("basic_filename", "BASIC-FILENAME", 1, 1, false);
        declareFunction("temp_directory", "TEMP-DIRECTORY", 0, 0, false);
        declareFunction("random_path_char", "RANDOM-PATH-CHAR", 0, 0, false);
        declareFunction("make_temp_filename", "MAKE-TEMP-FILENAME", 0, 1, false);
        declareFunction("random_filename_part", "RANDOM-FILENAME-PART", 0, 1, false);
        declareFunction("make_unused_temp_filename", "MAKE-UNUSED-TEMP-FILENAME", 0, 1, false);
        declareFunction("make_prefixed_temp_filename", "MAKE-PREFIXED-TEMP-FILENAME", 1, 1, false);
        declareFunction("open_temp_file", "OPEN-TEMP-FILE", 0, 2, false);
        declareMacro("with_temp_file", "WITH-TEMP-FILE");
        declareMacro("with_file_replacement", "WITH-FILE-REPLACEMENT");
        declareMacro("with_temporary_filename", "WITH-TEMPORARY-FILENAME");
        declareFunction("open_tmp_file", "OPEN-TMP-FILE", 0, 2, false);
        declareMacro("with_tmp_file", "WITH-TMP-FILE");
        declareFunction("directory_writeable_p", "DIRECTORY-WRITEABLE-P", 1, 1, false);
        declareFunction("file_valid_for_writing_p", "FILE-VALID-FOR-WRITING-P", 1, 0, false);
        declareFunction("delete_file_if_exists", "DELETE-FILE-IF-EXISTS", 1, 0, false);
        declareFunction("clean_filename", "CLEAN-FILENAME", 1, 0, false);
        declareFunction("append_files", "APPEND-FILES", 2, 1, false);
        declareMacro("cdolines", "CDOLINES");
        declareFunction("cdolines_get_next_line", "CDOLINES-GET-NEXT-LINE", 1, 0, false);
        declareMacro("do_stream_lines", "DO-STREAM-LINES");
        declareFunction("do_stream_lines_get_next_line", "DO-STREAM-LINES-GET-NEXT-LINE", 1, 0, false);
        declareMacro("do_file_lines", "DO-FILE-LINES");
        declareFunction("count_file_lines", "COUNT-FILE-LINES", 1, 0, false);
        declareMacro("do_csv_file_lines", "DO-CSV-FILE-LINES");
        declareMacro("cdolines_tokenized", "CDOLINES-TOKENIZED");
        declareMacro("cdolines_read", "CDOLINES-READ");
        declareMacro("do_file_records", "DO-FILE-RECORDS");
        declareMacro("do_directory_contents", "DO-DIRECTORY-CONTENTS");
        declareMacro("do_directory_subdirectories", "DO-DIRECTORY-SUBDIRECTORIES");
        declareMacro("do_directory_tree_files", "DO-DIRECTORY-TREE-FILES");
        declareFunction("directory_file_count", "DIRECTORY-FILE-COUNT", 1, 0, false);
        declareFunction("list_directory", "LIST-DIRECTORY", 2, 3, false);
        declareFunction("sort_files_by_date", "SORT-FILES-BY-DATE", 1, 0, false);
        declareFunction("slurp_file", "SLURP-FILE", 1, 0, false);
        declareFunction("slurp_file_robust", "SLURP-FILE-ROBUST", 1, 0, false);
        declareFunction("slurp_file_lines", "SLURP-FILE-LINES", 1, 0, false);
        declareFunction("file_existsP", "FILE-EXISTS?", 1, 0, false);
        declareFunction("why_not_probe_fileP", "WHY-NOT-PROBE-FILE?", 1, 0, false);
        declareFunction("guess_path_type", "GUESS-PATH-TYPE", 1, 0, false);
        declareFunction("guess_path_type_robust", "GUESS-PATH-TYPE-ROBUST", 1, 0, false);
        declareFunction("absolute_default_path_string", "ABSOLUTE-DEFAULT-PATH-STRING", 0, 0, false);
        declareFunction("possibly_append_path_separator_char", "POSSIBLY-APPEND-PATH-SEPARATOR-CHAR", 1, 0, false);
        declareFunction("get_absolute_path_string", "GET-ABSOLUTE-PATH-STRING", 1, 0, false);
        declareFunction("absolute_pathP", "ABSOLUTE-PATH?", 1, 0, false);
        declareFunction("path_separator_char", "PATH-SEPARATOR-CHAR", 1, 0, false);
        declareFunction("path_separator_string", "PATH-SEPARATOR-STRING", 1, 0, false);
        declareFunction("deconstruct_path", "DECONSTRUCT-PATH", 1, 0, false);
        declareFunction("reconstruct_path", "RECONSTRUCT-PATH", 2, 1, false);
        declareFunction("make_path_absolute_relative_to", "MAKE-PATH-ABSOLUTE-RELATIVE-TO", 2, 0, false);
        declareFunction("make_absolute_path_relative_to", "MAKE-ABSOLUTE-PATH-RELATIVE-TO", 2, 0, false);
        declareFunction("pathstring_filename", "PATHSTRING-FILENAME", 1, 0, false);
        declareFunction("pathstring_directory_name", "PATHSTRING-DIRECTORY-NAME", 1, 0, false);
        declareFunction("partially_deconstruct_path", "PARTIALLY-DECONSTRUCT-PATH", 1, 0, false);
        declareFunction("ensure_unique_filename", "ENSURE-UNIQUE-FILENAME", 1, 1, false);
        declareFunction("read_text_file", "READ-TEXT-FILE", 1, 0, false);
        declareFunction("output_text_file", "OUTPUT-TEXT-FILE", 2, 1, false);
        declareFunction("write_text_file", "WRITE-TEXT-FILE", 2, 0, false);
        declareFunction("append_text_file", "APPEND-TEXT-FILE", 2, 0, false);
        declareFunction("truncate_file", "TRUNCATE-FILE", 1, 0, false);
        declareFunction("empty_file_p", "EMPTY-FILE-P", 1, 0, false);
        declareFunction("ensure_directories_exist", "ENSURE-DIRECTORIES-EXIST", 1, 0, false);
        declareFunction("make_directory_recursive", "MAKE-DIRECTORY-RECURSIVE", 1, 2, false);
        declareFunction("logical_pathname_to_physical", "LOGICAL-PATHNAME-TO-PHYSICAL", 1, 0, false);
        declareFunction("recursive_delete_directory", "RECURSIVE-DELETE-DIRECTORY", 1, 0, false);
        declareFunction("recursive_copy_directory", "RECURSIVE-COPY-DIRECTORY", 2, 0, false);
        declareFunction("chmod", "CHMOD", 2, 0, false);
        declareFunction("delete_file_via_os", "DELETE-FILE-VIA-OS", 1, 0, false);
        declareFunction("create_symbolic_link", "CREATE-SYMBOLIC-LINK", 2, 0, false);
        declareFunction("link_or_copy_file", "LINK-OR-COPY-FILE", 2, 0, false);
        declareFunction("move_file", "MOVE-FILE", 2, 0, false);
        declareFunction("get_file_length", "GET-FILE-LENGTH", 1, 0, false);
        declareFunction("copy_file_checked", "COPY-FILE-CHECKED", 2, 0, false);
        declareFunction("get_file_lines", "GET-FILE-LINES", 1, 0, false);
        declareFunction("get_stream_forms", "GET-STREAM-FORMS", 1, 0, false);
        declareFunction("get_file_forms", "GET-FILE-FORMS", 1, 0, false);
        declareFunction("get_file_line_count", "GET-FILE-LINE-COUNT", 1, 0, false);
        declareFunction("load_file_catching_error", "LOAD-FILE-CATCHING-ERROR", 1, 0, false);
        declareFunction("normal_pathstring", "NORMAL-PATHSTRING", 1, 0, false);
        declareFunction("possibly_update_keepalive_file", "POSSIBLY-UPDATE-KEEPALIVE-FILE", 1, 0, false);
        declareFunction("update_keepalive_file", "UPDATE-KEEPALIVE-FILE", 1, 0, false);
        declareFunction("make_directory_or_error", "MAKE-DIRECTORY-OR-ERROR", 1, 1, false);
        declareFunction("make_directory_or_possibly_error", "MAKE-DIRECTORY-OR-POSSIBLY-ERROR", 1, 2, false);
        declareFunction("make_timestamp_subdirectory", "MAKE-TIMESTAMP-SUBDIRECTORY", 1, 0, false);
        declareFunction("timestamp_subdirectory", "TIMESTAMP-SUBDIRECTORY", 1, 0, false);
        declareFunction("prepare_to_possibly_overwrite_file", "PREPARE-TO-POSSIBLY-OVERWRITE-FILE", 1, 1, false);
        declareFunction("new_file_accumulator", "NEW-FILE-ACCUMULATOR", 1, 2, false);
        declareFunction("close_file_accumulator", "CLOSE-FILE-ACCUMULATOR", 1, 0, false);
        declareFunction("make_file_accumulator_state", "MAKE-FILE-ACCUMULATOR-STATE", 2, 0, false);
        declareMacro("with_file_accumulator_state", "WITH-FILE-ACCUMULATOR-STATE");
        declareFunction("file_accumulator_state_set_item_count", "FILE-ACCUMULATOR-STATE-SET-ITEM-COUNT", 2, 0, false);
        declareFunction("file_accumulator_state_reset_item_count", "FILE-ACCUMULATOR-STATE-RESET-ITEM-COUNT", 1, 0, false);
        declareFunction("file_accumulator_state_get_stream", "FILE-ACCUMULATOR-STATE-GET-STREAM", 1, 0, false);
        declareFunction("file_accumulator_reset", "FILE-ACCUMULATOR-RESET", 1, 0, false);
        declareFunction("file_accumulator_add", "FILE-ACCUMULATOR-ADD", 2, 0, false);
        declareFunction("file_accumulator_size", "FILE-ACCUMULATOR-SIZE", 1, 0, false);
        declareFunction("file_accumulator_contents", "FILE-ACCUMULATOR-CONTENTS", 2, 0, false);
        declareFunction("file_accumulator_iterator", "FILE-ACCUMULATOR-ITERATOR", 1, 0, false);
        declareFunction("file_accumulator_release_resources", "FILE-ACCUMULATOR-RELEASE-RESOURCES", 1, 0, false);
        declareFunction("copy_binary_data_to_hex_stream", "COPY-BINARY-DATA-TO-HEX-STREAM", 3, 1, false);
        declareFunction("get_binary_data_from_stream", "GET-BINARY-DATA-FROM-STREAM", 2, 1, false);
        declareFunction("test_get_binary_data_from_stream", "TEST-GET-BINARY-DATA-FROM-STREAM", 1, 0, false);
        declareFunction("file_contents_to_hex_string", "FILE-CONTENTS-TO-HEX-STRING", 1, 0, false);
        declareFunction("hex_string_to_file_contents", "HEX-STRING-TO-FILE-CONTENTS", 2, 0, false);
        declareFunction("file_stream_direction", "FILE-STREAM-DIRECTION", 1, 0, false);
        declareFunction("change_file_stream_buffer_size", "CHANGE-FILE-STREAM-BUFFER-SIZE", 2, 0, false);
        declareMacro("with_file_memory_mapping", "WITH-FILE-MEMORY-MAPPING");
        declareMacro("without_file_memory_mapping", "WITHOUT-FILE-MEMORY-MAPPING");
        declareFunction("file_stream_memory_mappedP", "FILE-STREAM-MEMORY-MAPPED?", 1, 0, false);
        declareFunction("enable_file_stream_memory_mapping", "ENABLE-FILE-STREAM-MEMORY-MAPPING", 1, 0, false);
        declareFunction("check_directory_creation_and_deletion", "CHECK-DIRECTORY-CREATION-AND-DELETION", 1, 0, false);
        declareFunction("test_directory_creation_and_deletion", "TEST-DIRECTORY-CREATION-AND-DELETION", 0, 0, false);
        declareFunction("test_directory_creation_and_deletion_absolute", "TEST-DIRECTORY-CREATION-AND-DELETION-ABSOLUTE", 0, 0, false);
        declareFunction("test_directory_creation_and_deletion_relative", "TEST-DIRECTORY-CREATION-AND-DELETION-RELATIVE", 0, 0, false);
        return NIL;
    }

    public static final SubLObject init_file_utilities_file_alt() {
        deflexical("*TEMP-DIRECTORY*", red_infrastructure_macros.red_def_helper($list_alt18.isSymbol() ? ((SubLObject) (symbol_value($list_alt18))) : $list_alt18, $temp_directory$, $str_alt20$_tmp_.isSymbol() ? ((SubLObject) (symbol_value($str_alt20$_tmp_))) : $str_alt20$_tmp_, $LEXICAL, UNPROVIDED));
        deflexical("*RANDOM-PATH-CHARS*", $str_alt22$0123456789abcdefghijklmnopqrstuvw);
        return NIL;
    }

    public static SubLObject init_file_utilities_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*DEFAULT-BIG-STREAM-BUFFER-SIZE*", $int$4194304);
            defparameter("*DEFAULT-SMALL-STREAM-BUFFER-SIZE*", $int$4096);
            deflexical("*TEMP-DIRECTORY*", red_infrastructure_macros.red_def_helper($list25.isSymbol() ? symbol_value($list25) : $list25, $temp_directory$, $str27$_tmp_.isSymbol() ? symbol_value($str27$_tmp_) : $str27$_tmp_, $LEXICAL, UNPROVIDED));
            deflexical("*RANDOM-PATH-CHARS*", $str29$0123456789abcdefghijklmnopqrstuvw);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*TEMP-DIRECTORY*", red_infrastructure_macros.red_def_helper($list_alt18.isSymbol() ? ((SubLObject) (symbol_value($list_alt18))) : $list_alt18, $temp_directory$, $str_alt20$_tmp_.isSymbol() ? ((SubLObject) (symbol_value($str_alt20$_tmp_))) : $str_alt20$_tmp_, $LEXICAL, UNPROVIDED));
            deflexical("*RANDOM-PATH-CHARS*", $str_alt22$0123456789abcdefghijklmnopqrstuvw);
        }
        return NIL;
    }

    public static SubLObject init_file_utilities_file_Previous() {
        defparameter("*DEFAULT-BIG-STREAM-BUFFER-SIZE*", $int$4194304);
        defparameter("*DEFAULT-SMALL-STREAM-BUFFER-SIZE*", $int$4096);
        deflexical("*TEMP-DIRECTORY*", red_infrastructure_macros.red_def_helper($list25.isSymbol() ? symbol_value($list25) : $list25, $temp_directory$, $str27$_tmp_.isSymbol() ? symbol_value($str27$_tmp_) : $str27$_tmp_, $LEXICAL, UNPROVIDED));
        deflexical("*RANDOM-PATH-CHARS*", $str29$0123456789abcdefghijklmnopqrstuvw);
        return NIL;
    }

    public static final SubLObject setup_file_utilities_file_alt() {
        define_obsolete_register(OPEN_TMP_FILE, $list_alt47);
        define_test_case_table_int(TEST_DIRECTORY_CREATION_AND_DELETION, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$baxter, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt234);
        return NIL;
    }

    public static SubLObject setup_file_utilities_file() {
        if (SubLFiles.USE_V1) {
            register_external_symbol(LOAD_FROM_CYC_HOME);
            define_obsolete_register(OPEN_TMP_FILE, $list59);
            register_macro_helper(CDOLINES_GET_NEXT_LINE, CDOLINES);
            register_macro_helper(DO_STREAM_LINES_GET_NEXT_LINE, DO_STREAM_LINES);
            define_test_case_table_int(TEST_GET_BINARY_DATA_FROM_STREAM, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list243);
            define_test_case_table_int(TEST_DIRECTORY_CREATION_AND_DELETION, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list257);
        }
        if (SubLFiles.USE_V2) {
            define_obsolete_register(OPEN_TMP_FILE, $list_alt47);
            define_test_case_table_int(TEST_DIRECTORY_CREATION_AND_DELETION, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$baxter, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt234);
        }
        return NIL;
    }

    public static SubLObject setup_file_utilities_file_Previous() {
        register_external_symbol(LOAD_FROM_CYC_HOME);
        define_obsolete_register(OPEN_TMP_FILE, $list59);
        register_macro_helper(CDOLINES_GET_NEXT_LINE, CDOLINES);
        register_macro_helper(DO_STREAM_LINES_GET_NEXT_LINE, DO_STREAM_LINES);
        define_test_case_table_int(TEST_GET_BINARY_DATA_FROM_STREAM, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list243);
        define_test_case_table_int(TEST_DIRECTORY_CREATION_AND_DELETION, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list257);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_file_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_file_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_file_utilities_file();
    }

    
}

/**
 * Total time: 1189 ms synthetic
 */
