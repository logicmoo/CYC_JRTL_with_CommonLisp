package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.cfasl.*;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.load;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

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
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class file_utilities extends SubLTranslatedFile {
    public static final SubLFile me = new file_utilities();

    public static final String myName = "com.cyc.cycjava.cycl.file_utilities";

    public static final String myFingerPrint = "e8f24c3a52725edf553091de28d9d9b55e4ec54c12e78b5da6d7650202ca96b9";

    // defparameter
    public static final SubLSymbol $default_big_stream_buffer_size$ = makeSymbol("*DEFAULT-BIG-STREAM-BUFFER-SIZE*");

    // defparameter
    public static final SubLSymbol $default_small_stream_buffer_size$ = makeSymbol("*DEFAULT-SMALL-STREAM-BUFFER-SIZE*");



    // deflexical
    private static final SubLSymbol $random_path_chars$ = makeSymbol("*RANDOM-PATH-CHARS*");

    private static final SubLInteger $int$4194304 = makeInteger(4194304);



    private static final SubLList $list2 = list(list(makeSymbol("SIZE")), makeSymbol("&BODY"), makeSymbol("BODY"));



    private static final SubLSymbol $stream_initial_input_buffer_size$ = makeSymbol("*STREAM-INITIAL-INPUT-BUFFER-SIZE*");

    public static final SubLList $list5 = list(list(makeSymbol("*STREAM-INITIAL-OUTPUT-BUFFER-SIZE*"), makeSymbol("*STREAM-INITIAL-INPUT-BUFFER-SIZE*")));

    private static final SubLList $list6 = list(makeSymbol("IGNORE"), makeSymbol("*STREAM-INITIAL-INPUT-BUFFER-SIZE*"), makeSymbol("*STREAM-INITIAL-OUTPUT-BUFFER-SIZE*"));

    private static final SubLList $list7 = list(list(makeSymbol("STREAM"), makeSymbol("FILENAME"), makeSymbol("DIRECTION")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym8$FILENAME_VAR = makeUninternedSymbol("FILENAME-VAR");





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

    private static final SubLInteger $int$36 = makeInteger(36);

    private static final SubLString $$$tmp = makeString("tmp");









    private static final SubLSymbol $IF_DOES_NOT_EXIST = makeKeyword("IF-DOES-NOT-EXIST");





    private static final SubLList $list39 = list(list(makeSymbol("STREAM"), makeSymbol("&KEY"), list(makeSymbol("ELEMENT-TYPE"), makeKeyword("TEXT"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list40 = list(makeKeyword("ELEMENT-TYPE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol OPEN_TMP_FILE = makeSymbol("OPEN-TMP-FILE");











    public static final SubLList $list48 = list(list(makeSymbol("STREAM"), makeSymbol("FILENAME"), makeSymbol("&KEY"), list(makeSymbol("ELEMENT-TYPE"), makeKeyword("TEXT"))), makeSymbol("&BODY"), makeSymbol("BODY"));





    private static final SubLSymbol COPY_FILE = makeSymbol("COPY-FILE");



    private static final SubLList $list53 = list(list(makeSymbol("FILENAME"), makeSymbol("&KEY"), list(makeSymbol("DIRECTORY"), makeSymbol("*TEMP-DIRECTORY*"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list54 = list(makeKeyword("DIRECTORY"));



    private static final SubLSymbol MAKE_TEMP_FILENAME = makeSymbol("MAKE-TEMP-FILENAME");



    private static final SubLSymbol IGNORE_ERRORS = makeSymbol("IGNORE-ERRORS");

    private static final SubLList $list59 = list(makeSymbol("OPEN-TEMP-FILE"));

    private static final SubLList $list60 = list(list(makeSymbol("STREAM"), makeSymbol("&OPTIONAL"), list(makeSymbol("ELEMENT-TYPE"), makeKeyword("TEXT"))), makeSymbol("&BODY"), makeSymbol("BODY"));

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

    private static final SubLList $list86 = list(makeKeyword("LINE-NUMBER"), makeKeyword("DONE"));





    private static final SubLSymbol $sym89$LINE_NUMBER_VAR = makeUninternedSymbol("LINE-NUMBER-VAR");

    private static final SubLSymbol DO_STREAM_LINES = makeSymbol("DO-STREAM-LINES");

    private static final SubLSymbol $sym91$STREAM_VAR = makeUninternedSymbol("STREAM-VAR");



    private static final SubLSymbol $sym93$1_ = makeSymbol("1+");

    private static final SubLSymbol DO_STREAM_LINES_GET_NEXT_LINE = makeSymbol("DO-STREAM-LINES-GET-NEXT-LINE");

    public static final SubLList $list95 = list(list(makeSymbol("LINE-VAR"), makeSymbol("FILE"), makeSymbol("&KEY"), makeSymbol("LINE-NUMBER"), makeSymbol("PROGRESS-MESSAGE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list96 = list(makeKeyword("LINE-NUMBER"), makeKeyword("PROGRESS-MESSAGE"), makeKeyword("DONE"));



    private static final SubLSymbol $sym98$FILE_VAR = makeUninternedSymbol("FILE-VAR");

    private static final SubLSymbol $sym99$STREAM_VAR = makeUninternedSymbol("STREAM-VAR");

    private static final SubLSymbol $sym100$FILE_VAR = makeUninternedSymbol("FILE-VAR");

    private static final SubLSymbol $sym101$STREAM_VAR = makeUninternedSymbol("STREAM-VAR");

    private static final SubLSymbol $sym102$LENGTH_VAR = makeUninternedSymbol("LENGTH-VAR");



    private static final SubLSymbol FILE_LENGTH = makeSymbol("FILE-LENGTH");



    private static final SubLSymbol FILE_POSITION = makeSymbol("FILE-POSITION");



    public static final SubLList $list108 = list(list(makeSymbol("TOKENIZED-LINE"), makeSymbol("FILE"), makeSymbol("&KEY"), list(makeSymbol("BREAK-LIST"), list(makeSymbol("QUOTE"), list(makeSymbol("LIST"), CHAR_comma))), list(makeSymbol("EMBED-LIST"), list(makeSymbol("QUOTE"), list(makeSymbol("LIST"), list(makeSymbol("LIST"), makeString("\""), makeString("\""))))), makeSymbol("INCLUDE-STOPS"), makeSymbol("IGNORE-EMPTY-STRINGS"), list(makeSymbol("QUOTE-CHARS"), list(makeSymbol("QUOTE"), list(makeSymbol("LIST"), CHAR_backslash)))), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list109 = list(makeKeyword("BREAK-LIST"), makeKeyword("EMBED-LIST"), makeKeyword("INCLUDE-STOPS"), makeKeyword("IGNORE-EMPTY-STRINGS"), makeKeyword("QUOTE-CHARS"));



    private static final SubLList $list111 = list(makeSymbol("LIST"), CHAR_comma);



    private static final SubLList $list113 = list(makeSymbol("LIST"), list(makeSymbol("LIST"), makeString("\""), makeString("\"")));



    private static final SubLSymbol $IGNORE_EMPTY_STRINGS = makeKeyword("IGNORE-EMPTY-STRINGS");



    private static final SubLList $list117 = list(makeSymbol("LIST"), CHAR_backslash);

    private static final SubLSymbol $sym118$LINE = makeUninternedSymbol("LINE");

    private static final SubLSymbol DO_FILE_LINES = makeSymbol("DO-FILE-LINES");

    private static final SubLSymbol STRING_TOKENIZE = makeSymbol("STRING-TOKENIZE");

    private static final SubLList $list121 = list(list(makeSymbol("FILE"), makeSymbol("&KEY"), list(makeSymbol("BREAK-LIST"), list(makeSymbol("QUOTE"), list(makeSymbol("MAPCAR"), list(makeSymbol("FUNCTION"), makeSymbol("TO-STRING")), list(makeSymbol("WHITESPACE-CHARS"))))), makeSymbol("EMBED-LIST"), makeSymbol("INCLUDE-STOPS"), list(makeSymbol("IGNORE-EMPTY-STRINGS"), T), makeSymbol("QUOTE-CHARS")), makeSymbol("LAMBDA-LIST"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list122 = list(makeSymbol("MAPCAR"), list(makeSymbol("FUNCTION"), makeSymbol("TO-STRING")), list(makeSymbol("WHITESPACE-CHARS")));

    private static final SubLSymbol $sym123$LINE = makeUninternedSymbol("LINE");





    private static final SubLList $list126 = list(makeSymbol("FUNCTION"), makeSymbol("READ-FROM-STRING"));

    private static final SubLSymbol $sym127$LINE = makeUninternedSymbol("LINE");

    private static final SubLSymbol $sym128$LINE_INDEX = makeUninternedSymbol("LINE-INDEX");

    private static final SubLSymbol $sym129$DONE_INT = makeUninternedSymbol("DONE-INT");

    private static final SubLList $list130 = list(ZERO_INTEGER);

    private static final SubLList $list131 = list(list(makeSymbol("QUOTE"), NIL));



    private static final SubLSymbol $sym133$_ = makeSymbol("<");





    private static final SubLList $list136 = list(makeSymbol("ITEM"), makeSymbol("TEMP-LINE-INDEX"));









    private static final SubLList $list141 = list(makeSymbol("TEMP-LINE-INDEX"));





    private static final SubLList $list144 = list(list(makeSymbol("RECORD"), makeSymbol("FILE"), makeSymbol("&OPTIONAL"), list(makeSymbol("SEPARATOR-TEST"), list(makeSymbol("FUNCTION"), makeSymbol("WHITESPACE-STRING?"))), list(makeSymbol("IGNORE-TEST"), list(makeSymbol("FUNCTION"), makeSymbol("FALSE")))), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym145$WHITESPACE_STRING_ = makeSymbol("WHITESPACE-STRING?");



    private static final SubLSymbol $sym147$INSTREAM = makeUninternedSymbol("INSTREAM");

    private static final SubLSymbol $sym148$LINE = makeUninternedSymbol("LINE");



    private static final SubLSymbol NETWORK_READ_LINE = makeSymbol("NETWORK-READ-LINE");

    public static final SubLList $list151 = list(NIL, NIL);



    private static final SubLList $list153 = list(list(makeSymbol("FILE-VAR"), makeSymbol("DIRECTORY"), makeSymbol("&KEY"), list(makeSymbol("INCLUDE-DIRECTORY?"), T), makeSymbol("PROGRESS-MESSAGE"), makeSymbol("DONE"), makeSymbol("SORT-FN")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list154 = list(makeKeyword("INCLUDE-DIRECTORY?"), makeKeyword("PROGRESS-MESSAGE"), makeKeyword("DONE"), makeKeyword("SORT-FN"));

    private static final SubLSymbol $kw155$INCLUDE_DIRECTORY_ = makeKeyword("INCLUDE-DIRECTORY?");



    private static final SubLSymbol $sym157$DIRECTORY_CONTENTS_VAR = makeUninternedSymbol("DIRECTORY-CONTENTS-VAR");

    private static final SubLSymbol $sym158$PROGRESS_MESSAGE_VAR = makeUninternedSymbol("PROGRESS-MESSAGE-VAR");



    public static final SubLList $list160 = list(makeSymbol("DIRECTORY-P"));



    private static final SubLSymbol $sym162$_SILENT_PROGRESS__ = makeSymbol("*SILENT-PROGRESS?*");







    private static final SubLSymbol PROGRESS_CSOME = makeSymbol("PROGRESS-CSOME");

    private static final SubLList $list167 = list(list(makeSymbol("SUBDIRECTORY"), makeSymbol("DIRECTORY"), makeSymbol("&KEY"), list(makeSymbol("INCLUDE-DIRECTORY?"), T)), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list168 = list(makeKeyword("INCLUDE-DIRECTORY?"));

    private static final SubLSymbol DO_DIRECTORY_CONTENTS = makeSymbol("DO-DIRECTORY-CONTENTS");







    private static final SubLList $list173 = list(makeString("/"));



    private static final SubLString $str175$_ = makeString("/");

    private static final SubLSymbol LAST_CHAR = makeSymbol("LAST-CHAR");

    private static final SubLList $list177 = list(CHAR_slash);

    public static final SubLList $list178 = list(list(makeSymbol("FILE-VAR"), makeSymbol("DIRECTORY"), makeSymbol("&KEY"), list(makeSymbol("INCLUDE-DIRECTORY?"), T), list(makeSymbol("PROGRESS-MESSAGE"), makeString("Processing directory tree files..."))), makeSymbol("&BODY"), makeSymbol("BODY"));

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

    public static SubLObject unread_byte_from_char_stream(final SubLObject v_byte, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_input$.getDynamicValue();
        }
        final SubLObject byte_as_char = code_char(v_byte);
        return unread_char(byte_as_char, stream);
    }

    public static SubLObject write_byte_to_char_stream(final SubLObject v_byte, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLObject byte_as_char = code_char(v_byte);
        return write_char(byte_as_char, stream);
    }

    public static SubLObject stream_designator_p(final SubLObject v_object) {
        return makeBoolean((v_object.isStream() || (v_object == T)) || (v_object == NIL));
    }

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

    public static SubLObject cyc_home_filename(final SubLObject subdirectory_list, final SubLObject filename, SubLObject extension) {
        if (extension == UNPROVIDED) {
            extension = NIL;
        }
        assert NIL != listp(subdirectory_list) : "Types.listp(subdirectory_list) " + "CommonSymbols.NIL != Types.listp(subdirectory_list) " + subdirectory_list;
        return relative_filename(system_info.$cyc_home_directory$.getGlobalValue(), Filesys.construct_filename(subdirectory_list, filename, extension, T), UNPROVIDED);
    }

    public static SubLObject cyc_home_subdirectory(final SubLObject subdirectory_list) {
        assert NIL != listp(subdirectory_list) : "Types.listp(subdirectory_list) " + "CommonSymbols.NIL != Types.listp(subdirectory_list) " + subdirectory_list;
        return relative_filename(system_info.$cyc_home_directory$.getGlobalValue(), Filesys.construct_filename(subdirectory_list, $str22$, NIL, T), UNPROVIDED);
    }

    public static SubLObject canonical_cyc_working_directory() {
        return string_utilities.to_string(Filesys.probe_file($str23$_));
    }

    public static SubLObject relative_filename(final SubLObject directory_string, final SubLObject filename, SubLObject extension) {
        if (extension == UNPROVIDED) {
            extension = NIL;
        }
        assert NIL != stringp(directory_string) : "Types.stringp(directory_string) " + "CommonSymbols.NIL != Types.stringp(directory_string) " + directory_string;
        return cconcatenate(directory_string, basic_filename(filename, extension));
    }

    public static SubLObject basic_filename(final SubLObject filename, SubLObject extension) {
        if (extension == UNPROVIDED) {
            extension = NIL;
        }
        if (NIL == extension) {
            return filename;
        }
        return Filesys.construct_filename(NIL, filename, extension, T);
    }

    public static SubLObject temp_directory() {
        final SubLObject temp_dir = subl_promotions.get_temp_directory();
        if (NIL != temp_dir) {
            return possibly_append_path_separator_char(temp_dir);
        }
        return $temp_directory$.getGlobalValue();
    }

    public static SubLObject random_path_char() {
        return Strings.sublisp_char($random_path_chars$.getGlobalValue(), random.random($int$36));
    }

    public static SubLObject make_temp_filename(SubLObject directory_string) {
        if (directory_string == UNPROVIDED) {
            directory_string = $temp_directory$.getGlobalValue();
        }
        assert NIL != stringp(directory_string) : "Types.stringp(directory_string) " + "CommonSymbols.NIL != Types.stringp(directory_string) " + directory_string;
        final SubLObject filename = random_filename_part(EIGHT_INTEGER);
        return relative_filename(possibly_append_path_separator_char(directory_string), filename, $$$tmp);
    }

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

    public static SubLObject make_unused_temp_filename(SubLObject directory_string) {
        if (directory_string == UNPROVIDED) {
            directory_string = $temp_directory$.getGlobalValue();
        }
        SubLObject filename;
        for (filename = NIL; (NIL == filename) || (NIL != Filesys.probe_file(filename)); filename = Strings.string_downcase(make_temp_filename(directory_string), UNPROVIDED, UNPROVIDED)) {
        }
        return filename;
    }

    public static SubLObject make_prefixed_temp_filename(final SubLObject prefix, SubLObject directory_string) {
        if (directory_string == UNPROVIDED) {
            directory_string = $temp_directory$.getGlobalValue();
        }
        assert NIL != stringp(directory_string) : "Types.stringp(directory_string) " + "CommonSymbols.NIL != Types.stringp(directory_string) " + directory_string;
        final SubLObject random_part = random_filename_part(EIGHT_INTEGER);
        final SubLObject filename = cconcatenate(prefix, random_part);
        return relative_filename(directory_string, filename, $$$tmp);
    }

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

    public static SubLObject open_tmp_file(SubLObject element_type, SubLObject directory) {
        if (element_type == UNPROVIDED) {
            element_type = $TEXT;
        }
        if (directory == UNPROVIDED) {
            directory = $temp_directory$.getGlobalValue();
        }
        return open_temp_file(element_type, directory);
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

    public static SubLObject directory_writeable_p(final SubLObject directory_string, SubLObject byte_size) {
        if (byte_size == UNPROVIDED) {
            byte_size = ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(directory_string) : "Types.stringp(directory_string) " + "CommonSymbols.NIL != Types.stringp(directory_string) " + directory_string;
        assert NIL != integerp(byte_size) : "Types.integerp(byte_size) " + "CommonSymbols.NIL != Types.integerp(byte_size) " + byte_size;
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

    public static SubLObject delete_file_if_exists(final SubLObject filename) {
        if (NIL != Filesys.probe_file(filename)) {
            return Filesys.delete_file(filename);
        }
        return NIL;
    }

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
        assert NIL != symbolp(line_number) : "Types.symbolp(line_number) " + "CommonSymbols.NIL != Types.symbolp(line_number) " + line_number;
        return list(CLET, list(list(stream_var, stream)), listS(CDO, list(list(line_number, ZERO_INTEGER, list($sym93$1_, line_number)), list(line_var, list(DO_STREAM_LINES_GET_NEXT_LINE, stream_var), list(DO_STREAM_LINES_GET_NEXT_LINE, stream_var))), list(list(COR, done, list(NULL, line_var))), append(body, NIL)));
    }

    public static SubLObject do_stream_lines_get_next_line(final SubLObject stream) {
        return string_utilities.network_read_line(stream, NIL, NIL, T);
    }

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
        return list(PROGN, listS(CHECK_TYPE, directory, $list160), list(CLET, list(list(directory_contents_var, list(DIRECTORY, directory, include_directoryP)), list(progress_message_var, progress_message), list($sym162$_SILENT_PROGRESS__, list(CNOT, list(STRINGP, progress_message_var)))), list(PWHEN, list(FUNCTION_SPEC_P, sort_fn), list(CSETQ, directory_contents_var, list(SORT, directory_contents_var, sort_fn))), listS(PROGRESS_CSOME, list(file_var, directory_contents_var, progress_message_var, done), append(body, NIL))));
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

    public static SubLObject directory_file_count(final SubLObject directory) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != Filesys.directory_p(directory) : "Filesys.directory_p(directory) " + "CommonSymbols.NIL != Filesys.directory_p(directory) " + directory;
        SubLObject count = NIL;
        if (!count.isInteger()) {
            count = ZERO_INTEGER;
            assert NIL != Filesys.directory_p(directory) : "Filesys.directory_p(directory) " + "CommonSymbols.NIL != Filesys.directory_p(directory) " + directory;
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

    public static SubLObject sort_files_by_date(final SubLObject file_list) {
        return Sort.sort(file_list, $sym133$_, FILE_WRITE_DATE);
    }

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

    public static SubLObject guess_path_type(final SubLObject path) {
        if (NIL != string_utilities.char_position(CHAR_slash, path, UNPROVIDED)) {
            return $UNIX;
        }
        if (NIL != string_utilities.char_position(CHAR_backslash, path, UNPROVIDED)) {
            return $DOS;
        }
        return NIL;
    }

    public static SubLObject guess_path_type_robust(final SubLObject path) {
        final SubLObject path_type = guess_path_type(path);
        return NIL != path_type ? path_type : $UNIX;
    }

    public static SubLObject absolute_default_path_string() {
        return possibly_append_path_separator_char(format_nil.format_nil_a(Filesys.probe_file($str23$_)));
    }

    public static SubLObject possibly_append_path_separator_char(final SubLObject raw_path_string) {
        final SubLObject path_type = guess_path_type_robust(raw_path_string);
        final SubLObject separator = path_separator_char(path_type);
        final SubLObject path_string = (string_utilities.last_char(raw_path_string).eql(separator)) ? raw_path_string : string_utilities.post_add_character_to_string(separator, raw_path_string);
        return path_string;
    }

    public static SubLObject get_absolute_path_string(final SubLObject logical_path) {
        return normal_pathstring(logical_pathname_to_physical(logical_path));
    }

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

    public static SubLObject path_separator_char(final SubLObject path_type) {
        final SubLObject string = path_separator_string(path_type);
        if (string.isString()) {
            return Strings.sublisp_char(string, ZERO_INTEGER);
        }
        return NIL;
    }

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

    public static SubLObject write_text_file(final SubLObject file_name, final SubLObject lines) {
        return output_text_file(file_name, lines, $OUTPUT);
    }

    public static SubLObject append_text_file(final SubLObject file_name, final SubLObject lines) {
        return output_text_file(file_name, lines, $APPEND);
    }

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
        assert NIL != stringp(directory_path) : "Types.stringp(directory_path) " + "CommonSymbols.NIL != Types.stringp(directory_path) " + directory_path;
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

    public static SubLObject logical_pathname_to_physical(final SubLObject pathname) {
        return subl_promotions.ensure_physical_pathname(pathname);
    }

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

    public static SubLObject chmod(final SubLObject pathname, final SubLObject permissions_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == Processes.external_processes_supportedP()) {
            return NIL;
        }
        return os_process_utilities.system_eval_using_make_os_process_successfulP($$$chmod, list(permissions_string, pathname), ZERO_INTEGER, StreamsLow.$null_input$.getDynamicValue(thread), StreamsLow.$null_output$.getDynamicValue(thread), UNPROVIDED);
    }

    public static SubLObject delete_file_via_os(final SubLObject filename) {
        assert NIL != stringp(filename) : "Types.stringp(filename) " + "CommonSymbols.NIL != Types.stringp(filename) " + filename;
        return Filesys.delete_file(filename);
    }

    public static SubLObject create_symbolic_link(final SubLObject link_file, final SubLObject target_file) {
        assert NIL != stringp(target_file) : "Types.stringp(target_file) " + "CommonSymbols.NIL != Types.stringp(target_file) " + target_file;
        assert NIL != stringp(link_file) : "Types.stringp(link_file) " + "CommonSymbols.NIL != Types.stringp(link_file) " + link_file;
        if (NIL != Processes.external_processes_supportedP()) {
            return os_process_utilities.system_eval_using_make_os_process_successfulP($$$ln, list($str213$_s, target_file, link_file), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject link_or_copy_file(final SubLObject old, final SubLObject v_new) {
        return makeBoolean((NIL != create_symbolic_link(v_new, old)) || (NIL != Filesys.copy_file(old, v_new)));
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

    public static SubLObject normal_pathstring(final SubLObject pathstring) {
        final SubLObject pathstring_crtl = Filesys.probe_file(pathstring);
        if (NIL != pathstring_crtl) {
            return pathstring_crtl;
        }
        return pathstring;
    }

    public static SubLObject possibly_update_keepalive_file(final SubLObject keepalive_filename) {
        if (NIL != keepalive_filename) {
            return update_keepalive_file(keepalive_filename);
        }
        return NIL;
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

    public static SubLObject make_directory_or_error(final SubLObject directory_name, SubLObject path) {
        if (path == UNPROVIDED) {
            path = NIL;
        }
        return make_directory_or_possibly_error(directory_name, path, T);
    }

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

    public static SubLObject make_timestamp_subdirectory(final SubLObject pathname) {
        return make_directory_or_error(timestamp_subdirectory(pathname), UNPROVIDED);
    }

    public static SubLObject timestamp_subdirectory(SubLObject pathname) {
        pathname = possibly_append_path_separator_char(pathname);
        final SubLObject dir_name = numeric_date_utilities.timestamp(UNPROVIDED, UNPROVIDED);
        final SubLObject full_pathname = cconcatenate(pathname, dir_name);
        return possibly_append_path_separator_char(full_pathname);
    }

    public static SubLObject prepare_to_possibly_overwrite_file(final SubLObject filename, SubLObject overwriteP) {
        if (overwriteP == UNPROVIDED) {
            overwriteP = T;
        }
        assert NIL != stringp(filename) : "Types.stringp(filename) " + "CommonSymbols.NIL != Types.stringp(filename) " + filename;
        if (NIL != file_existsP(filename)) {
            if (NIL != overwriteP) {
                Filesys.delete_file(filename);
                return filename;
            }
            Errors.error($str217$File_already_exists___A__, filename);
        }
        return make_directory_recursive(partially_deconstruct_path(filename), overwriteP, UNPROVIDED);
    }

    public static SubLObject new_file_accumulator(final SubLObject path, SubLObject mode, SubLObject write_fn) {
        if (mode == UNPROVIDED) {
            mode = $TEXT;
        }
        if (write_fn == UNPROVIDED) {
            write_fn = PRINT;
        }
        assert NIL != function_spec_p(write_fn) : "Types.function_spec_p(write_fn) " + "CommonSymbols.NIL != Types.function_spec_p(write_fn) " + write_fn;
        final SubLObject open_method = ($TEXT == mode) ? OPEN_TEXT : OPEN_BINARY;
        final SubLObject stream = funcall(open_method, path, $OUTPUT);
        if ((NIL == open_stream_p(stream)) || (NIL == output_stream_p(stream))) {
            Errors.error($str221$Cannot_open__A_for_writing___, path);
        }
        final SubLObject state = make_file_accumulator_state(stream, write_fn);
        return accumulation.new_accumulator(state, FILE_ACCUMULATOR_RESET, FILE_ACCUMULATOR_ADD, FILE_ACCUMULATOR_SIZE, FILE_ACCUMULATOR_CONTENTS, FILE_ACCUMULATOR_ITERATOR, UNPROVIDED);
    }

    public static SubLObject close_file_accumulator(final SubLObject acc) {
        file_accumulator_release_resources(accumulation.accumulation_peek_state(acc));
        return acc;
    }

    public static SubLObject make_file_accumulator_state(final SubLObject stream, final SubLObject write_fn) {
        final SubLObject function_spec = (write_fn.isSymbol()) ? symbol_function(write_fn) : write_fn;
        return list($STREAM, stream, $WRITER, function_spec, $ITEM_COUNT, ZERO_INTEGER);
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

    public static SubLObject file_accumulator_state_set_item_count(final SubLObject state, final SubLObject count) {
        return putf(state, $ITEM_COUNT, count);
    }

    public static SubLObject file_accumulator_state_reset_item_count(final SubLObject state) {
        return file_accumulator_state_set_item_count(state, ZERO_INTEGER);
    }

    public static SubLObject file_accumulator_state_get_stream(final SubLObject state) {
        return getf(state, $STREAM, UNPROVIDED);
    }

    public static SubLObject file_accumulator_reset(final SubLObject state) {
        final SubLObject stream = file_accumulator_state_get_stream(state);
        file_position(stream, ZERO_INTEGER);
        return file_accumulator_state_reset_item_count(state);
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

    public static SubLObject file_accumulator_contents(final SubLObject state, final SubLObject reset_p) {
        return Errors.error($str234$Operation_not_supported_for_file_, state);
    }

    public static SubLObject file_accumulator_iterator(final SubLObject state) {
        return Errors.error($str235$Operation_not_yet_supported_for_f, state);
    }

    public static SubLObject file_accumulator_release_resources(final SubLObject state) {
        final SubLObject stream = file_accumulator_state_get_stream(state);
        close(stream, UNPROVIDED);
        return state;
    }

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

    public static SubLObject test_directory_creation_and_deletion() {
        return makeBoolean((NIL != test_directory_creation_and_deletion_absolute()) && (NIL != test_directory_creation_and_deletion_relative()));
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
        declareMacro(me, "with_stream_buffer_size", "WITH-STREAM-BUFFER-SIZE");
        declareMacro(me, "possibly_with_text_file", "POSSIBLY-WITH-TEXT-FILE");
        declareMacro(me, "possibly_with_private_text_file", "POSSIBLY-WITH-PRIVATE-TEXT-FILE");
        declareMacro(me, "possibly_with_binary_file", "POSSIBLY-WITH-BINARY-FILE");
        declareMacro(me, "possibly_with_private_binary_file", "POSSIBLY-WITH-PRIVATE-BINARY-FILE");
        declareFunction(me, "peek_byte_from_char_stream", "PEEK-BYTE-FROM-CHAR-STREAM", 0, 3, false);
        declareFunction(me, "read_byte_from_char_stream", "READ-BYTE-FROM-CHAR-STREAM", 0, 3, false);
        declareFunction(me, "unread_byte_from_char_stream", "UNREAD-BYTE-FROM-CHAR-STREAM", 1, 1, false);
        declareFunction(me, "write_byte_to_char_stream", "WRITE-BYTE-TO-CHAR-STREAM", 1, 1, false);
        declareFunction(me, "stream_designator_p", "STREAM-DESIGNATOR-P", 1, 0, false);
        declareFunction(me, "pathname_designator_p", "PATHNAME-DESIGNATOR-P", 1, 0, false);
        declareFunction(me, "load_from_cyc_home", "LOAD-FROM-CYC-HOME", 1, 0, false);
        declareFunction(me, "cyc_home_filename", "CYC-HOME-FILENAME", 2, 1, false);
        declareFunction(me, "cyc_home_subdirectory", "CYC-HOME-SUBDIRECTORY", 1, 0, false);
        declareFunction(me, "canonical_cyc_working_directory", "CANONICAL-CYC-WORKING-DIRECTORY", 0, 0, false);
        declareFunction(me, "relative_filename", "RELATIVE-FILENAME", 2, 1, false);
        declareFunction(me, "basic_filename", "BASIC-FILENAME", 1, 1, false);
        declareFunction(me, "temp_directory", "TEMP-DIRECTORY", 0, 0, false);
        declareFunction(me, "random_path_char", "RANDOM-PATH-CHAR", 0, 0, false);
        declareFunction(me, "make_temp_filename", "MAKE-TEMP-FILENAME", 0, 1, false);
        declareFunction(me, "random_filename_part", "RANDOM-FILENAME-PART", 0, 1, false);
        declareFunction(me, "make_unused_temp_filename", "MAKE-UNUSED-TEMP-FILENAME", 0, 1, false);
        declareFunction(me, "make_prefixed_temp_filename", "MAKE-PREFIXED-TEMP-FILENAME", 1, 1, false);
        declareFunction(me, "open_temp_file", "OPEN-TEMP-FILE", 0, 2, false);
        declareMacro(me, "with_temp_file", "WITH-TEMP-FILE");
        declareMacro(me, "with_file_replacement", "WITH-FILE-REPLACEMENT");
        declareMacro(me, "with_temporary_filename", "WITH-TEMPORARY-FILENAME");
        declareFunction(me, "open_tmp_file", "OPEN-TMP-FILE", 0, 2, false);
        declareMacro(me, "with_tmp_file", "WITH-TMP-FILE");
        declareFunction(me, "directory_writeable_p", "DIRECTORY-WRITEABLE-P", 1, 1, false);
        declareFunction(me, "file_valid_for_writing_p", "FILE-VALID-FOR-WRITING-P", 1, 0, false);
        declareFunction(me, "delete_file_if_exists", "DELETE-FILE-IF-EXISTS", 1, 0, false);
        declareFunction(me, "clean_filename", "CLEAN-FILENAME", 1, 0, false);
        declareFunction(me, "append_files", "APPEND-FILES", 2, 1, false);
        declareMacro(me, "cdolines", "CDOLINES");
        declareFunction(me, "cdolines_get_next_line", "CDOLINES-GET-NEXT-LINE", 1, 0, false);
        declareMacro(me, "do_stream_lines", "DO-STREAM-LINES");
        declareFunction(me, "do_stream_lines_get_next_line", "DO-STREAM-LINES-GET-NEXT-LINE", 1, 0, false);
        declareMacro(me, "do_file_lines", "DO-FILE-LINES");
        declareFunction(me, "count_file_lines", "COUNT-FILE-LINES", 1, 0, false);
        declareMacro(me, "do_csv_file_lines", "DO-CSV-FILE-LINES");
        declareMacro(me, "cdolines_tokenized", "CDOLINES-TOKENIZED");
        declareMacro(me, "cdolines_read", "CDOLINES-READ");
        declareMacro(me, "do_file_records", "DO-FILE-RECORDS");
        declareMacro(me, "do_directory_contents", "DO-DIRECTORY-CONTENTS");
        declareMacro(me, "do_directory_subdirectories", "DO-DIRECTORY-SUBDIRECTORIES");
        declareMacro(me, "do_directory_tree_files", "DO-DIRECTORY-TREE-FILES");
        declareFunction(me, "directory_file_count", "DIRECTORY-FILE-COUNT", 1, 0, false);
        declareFunction(me, "list_directory", "LIST-DIRECTORY", 2, 3, false);
        declareFunction(me, "sort_files_by_date", "SORT-FILES-BY-DATE", 1, 0, false);
        declareFunction(me, "slurp_file", "SLURP-FILE", 1, 0, false);
        declareFunction(me, "slurp_file_robust", "SLURP-FILE-ROBUST", 1, 0, false);
        declareFunction(me, "slurp_file_lines", "SLURP-FILE-LINES", 1, 0, false);
        declareFunction(me, "file_existsP", "FILE-EXISTS?", 1, 0, false);
        declareFunction(me, "why_not_probe_fileP", "WHY-NOT-PROBE-FILE?", 1, 0, false);
        declareFunction(me, "guess_path_type", "GUESS-PATH-TYPE", 1, 0, false);
        declareFunction(me, "guess_path_type_robust", "GUESS-PATH-TYPE-ROBUST", 1, 0, false);
        declareFunction(me, "absolute_default_path_string", "ABSOLUTE-DEFAULT-PATH-STRING", 0, 0, false);
        declareFunction(me, "possibly_append_path_separator_char", "POSSIBLY-APPEND-PATH-SEPARATOR-CHAR", 1, 0, false);
        declareFunction(me, "get_absolute_path_string", "GET-ABSOLUTE-PATH-STRING", 1, 0, false);
        declareFunction(me, "absolute_pathP", "ABSOLUTE-PATH?", 1, 0, false);
        declareFunction(me, "path_separator_char", "PATH-SEPARATOR-CHAR", 1, 0, false);
        declareFunction(me, "path_separator_string", "PATH-SEPARATOR-STRING", 1, 0, false);
        declareFunction(me, "deconstruct_path", "DECONSTRUCT-PATH", 1, 0, false);
        declareFunction(me, "reconstruct_path", "RECONSTRUCT-PATH", 2, 1, false);
        declareFunction(me, "make_path_absolute_relative_to", "MAKE-PATH-ABSOLUTE-RELATIVE-TO", 2, 0, false);
        declareFunction(me, "make_absolute_path_relative_to", "MAKE-ABSOLUTE-PATH-RELATIVE-TO", 2, 0, false);
        declareFunction(me, "pathstring_filename", "PATHSTRING-FILENAME", 1, 0, false);
        declareFunction(me, "pathstring_directory_name", "PATHSTRING-DIRECTORY-NAME", 1, 0, false);
        declareFunction(me, "partially_deconstruct_path", "PARTIALLY-DECONSTRUCT-PATH", 1, 0, false);
        declareFunction(me, "ensure_unique_filename", "ENSURE-UNIQUE-FILENAME", 1, 1, false);
        declareFunction(me, "read_text_file", "READ-TEXT-FILE", 1, 0, false);
        declareFunction(me, "output_text_file", "OUTPUT-TEXT-FILE", 2, 1, false);
        declareFunction(me, "write_text_file", "WRITE-TEXT-FILE", 2, 0, false);
        declareFunction(me, "append_text_file", "APPEND-TEXT-FILE", 2, 0, false);
        declareFunction(me, "truncate_file", "TRUNCATE-FILE", 1, 0, false);
        declareFunction(me, "empty_file_p", "EMPTY-FILE-P", 1, 0, false);
        declareFunction(me, "ensure_directories_exist", "ENSURE-DIRECTORIES-EXIST", 1, 0, false);
        declareFunction(me, "make_directory_recursive", "MAKE-DIRECTORY-RECURSIVE", 1, 2, false);
        declareFunction(me, "logical_pathname_to_physical", "LOGICAL-PATHNAME-TO-PHYSICAL", 1, 0, false);
        declareFunction(me, "recursive_delete_directory", "RECURSIVE-DELETE-DIRECTORY", 1, 0, false);
        declareFunction(me, "recursive_copy_directory", "RECURSIVE-COPY-DIRECTORY", 2, 0, false);
        declareFunction(me, "chmod", "CHMOD", 2, 0, false);
        declareFunction(me, "delete_file_via_os", "DELETE-FILE-VIA-OS", 1, 0, false);
        declareFunction(me, "create_symbolic_link", "CREATE-SYMBOLIC-LINK", 2, 0, false);
        declareFunction(me, "link_or_copy_file", "LINK-OR-COPY-FILE", 2, 0, false);
        declareFunction(me, "move_file", "MOVE-FILE", 2, 0, false);
        declareFunction(me, "get_file_length", "GET-FILE-LENGTH", 1, 0, false);
        declareFunction(me, "copy_file_checked", "COPY-FILE-CHECKED", 2, 0, false);
        declareFunction(me, "get_file_lines", "GET-FILE-LINES", 1, 0, false);
        declareFunction(me, "get_stream_forms", "GET-STREAM-FORMS", 1, 0, false);
        declareFunction(me, "get_file_forms", "GET-FILE-FORMS", 1, 0, false);
        declareFunction(me, "get_file_line_count", "GET-FILE-LINE-COUNT", 1, 0, false);
        declareFunction(me, "load_file_catching_error", "LOAD-FILE-CATCHING-ERROR", 1, 0, false);
        declareFunction(me, "normal_pathstring", "NORMAL-PATHSTRING", 1, 0, false);
        declareFunction(me, "possibly_update_keepalive_file", "POSSIBLY-UPDATE-KEEPALIVE-FILE", 1, 0, false);
        declareFunction(me, "update_keepalive_file", "UPDATE-KEEPALIVE-FILE", 1, 0, false);
        declareFunction(me, "make_directory_or_error", "MAKE-DIRECTORY-OR-ERROR", 1, 1, false);
        declareFunction(me, "make_directory_or_possibly_error", "MAKE-DIRECTORY-OR-POSSIBLY-ERROR", 1, 2, false);
        declareFunction(me, "make_timestamp_subdirectory", "MAKE-TIMESTAMP-SUBDIRECTORY", 1, 0, false);
        declareFunction(me, "timestamp_subdirectory", "TIMESTAMP-SUBDIRECTORY", 1, 0, false);
        declareFunction(me, "prepare_to_possibly_overwrite_file", "PREPARE-TO-POSSIBLY-OVERWRITE-FILE", 1, 1, false);
        declareFunction(me, "new_file_accumulator", "NEW-FILE-ACCUMULATOR", 1, 2, false);
        declareFunction(me, "close_file_accumulator", "CLOSE-FILE-ACCUMULATOR", 1, 0, false);
        declareFunction(me, "make_file_accumulator_state", "MAKE-FILE-ACCUMULATOR-STATE", 2, 0, false);
        declareMacro(me, "with_file_accumulator_state", "WITH-FILE-ACCUMULATOR-STATE");
        declareFunction(me, "file_accumulator_state_set_item_count", "FILE-ACCUMULATOR-STATE-SET-ITEM-COUNT", 2, 0, false);
        declareFunction(me, "file_accumulator_state_reset_item_count", "FILE-ACCUMULATOR-STATE-RESET-ITEM-COUNT", 1, 0, false);
        declareFunction(me, "file_accumulator_state_get_stream", "FILE-ACCUMULATOR-STATE-GET-STREAM", 1, 0, false);
        declareFunction(me, "file_accumulator_reset", "FILE-ACCUMULATOR-RESET", 1, 0, false);
        declareFunction(me, "file_accumulator_add", "FILE-ACCUMULATOR-ADD", 2, 0, false);
        declareFunction(me, "file_accumulator_size", "FILE-ACCUMULATOR-SIZE", 1, 0, false);
        declareFunction(me, "file_accumulator_contents", "FILE-ACCUMULATOR-CONTENTS", 2, 0, false);
        declareFunction(me, "file_accumulator_iterator", "FILE-ACCUMULATOR-ITERATOR", 1, 0, false);
        declareFunction(me, "file_accumulator_release_resources", "FILE-ACCUMULATOR-RELEASE-RESOURCES", 1, 0, false);
        declareFunction(me, "copy_binary_data_to_hex_stream", "COPY-BINARY-DATA-TO-HEX-STREAM", 3, 1, false);
        declareFunction(me, "get_binary_data_from_stream", "GET-BINARY-DATA-FROM-STREAM", 2, 1, false);
        declareFunction(me, "test_get_binary_data_from_stream", "TEST-GET-BINARY-DATA-FROM-STREAM", 1, 0, false);
        declareFunction(me, "file_contents_to_hex_string", "FILE-CONTENTS-TO-HEX-STRING", 1, 0, false);
        declareFunction(me, "hex_string_to_file_contents", "HEX-STRING-TO-FILE-CONTENTS", 2, 0, false);
        declareFunction(me, "file_stream_direction", "FILE-STREAM-DIRECTION", 1, 0, false);
        declareFunction(me, "change_file_stream_buffer_size", "CHANGE-FILE-STREAM-BUFFER-SIZE", 2, 0, false);
        declareMacro(me, "with_file_memory_mapping", "WITH-FILE-MEMORY-MAPPING");
        declareMacro(me, "without_file_memory_mapping", "WITHOUT-FILE-MEMORY-MAPPING");
        declareFunction(me, "file_stream_memory_mappedP", "FILE-STREAM-MEMORY-MAPPED?", 1, 0, false);
        declareFunction(me, "enable_file_stream_memory_mapping", "ENABLE-FILE-STREAM-MEMORY-MAPPING", 1, 0, false);
        declareFunction(me, "check_directory_creation_and_deletion", "CHECK-DIRECTORY-CREATION-AND-DELETION", 1, 0, false);
        declareFunction(me, "test_directory_creation_and_deletion", "TEST-DIRECTORY-CREATION-AND-DELETION", 0, 0, false);
        declareFunction(me, "test_directory_creation_and_deletion_absolute", "TEST-DIRECTORY-CREATION-AND-DELETION-ABSOLUTE", 0, 0, false);
        declareFunction(me, "test_directory_creation_and_deletion_relative", "TEST-DIRECTORY-CREATION-AND-DELETION-RELATIVE", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_file_utilities_file() {
        defparameter("*DEFAULT-BIG-STREAM-BUFFER-SIZE*", $int$4194304);
        defparameter("*DEFAULT-SMALL-STREAM-BUFFER-SIZE*", $int$4096);
        deflexical("*TEMP-DIRECTORY*", red_infrastructure_macros.red_def_helper($list25.isSymbol() ? symbol_value($list25) : $list25, $temp_directory$, $str27$_tmp_.isSymbol() ? symbol_value($str27$_tmp_) : $str27$_tmp_, $LEXICAL, UNPROVIDED));
        deflexical("*RANDOM-PATH-CHARS*", $str29$0123456789abcdefghijklmnopqrstuvw);
        return NIL;
    }

    public static SubLObject setup_file_utilities_file() {
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
