package com.cyc.cycjava.cycl;

import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Processes;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class file_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.file_utilities";
    public static final String myFingerPrint = "e8f24c3a52725edf553091de28d9d9b55e4ec54c12e78b5da6d7650202ca96b9";
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 455L)
    public static SubLSymbol $default_big_stream_buffer_size$;
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 587L)
    public static SubLSymbol $default_small_stream_buffer_size$;
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 6307L)
    public static SubLSymbol $temp_directory$;
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 6653L)
    private static SubLSymbol $random_path_chars$;
    private static final SubLInteger $int0$4194304;
    private static final SubLInteger $int1$4096;
    private static final SubLList $list2;
    private static final SubLSymbol $sym3$CLET;
    private static final SubLSymbol $sym4$_STREAM_INITIAL_INPUT_BUFFER_SIZE_;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLList $list7;
    private static final SubLSymbol $sym8$FILENAME_VAR;
    private static final SubLSymbol $sym9$PIF;
    private static final SubLSymbol $sym10$WITH_TEXT_FILE;
    private static final SubLList $list11;
    private static final SubLSymbol $sym12$FILENAME_VAR;
    private static final SubLSymbol $sym13$WITH_PRIVATE_TEXT_FILE;
    private static final SubLSymbol $sym14$FILENAME_VAR;
    private static final SubLSymbol $sym15$WITH_BINARY_FILE;
    private static final SubLSymbol $sym16$FILENAME_VAR;
    private static final SubLSymbol $sym17$WITH_PRIVATE_BINARY_FILE;
    private static final SubLSymbol $kw18$EOF;
    private static final SubLSymbol $sym19$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLSymbol $sym20$LOAD_FROM_CYC_HOME;
    private static final SubLSymbol $sym21$LISTP;
    private static final SubLString $str22$;
    private static final SubLString $str23$_;
    private static final SubLSymbol $sym24$STRINGP;
    private static final SubLList $list25;
    private static final SubLSymbol $sym26$_TEMP_DIRECTORY_;
    private static final SubLString $str27$_tmp_;
    private static final SubLSymbol $kw28$LEXICAL;
    private static final SubLString $str29$0123456789abcdefghijklmnopqrstuvw;
    private static final SubLInteger $int30$36;
    private static final SubLString $str31$tmp;
    private static final SubLSymbol $kw32$TEXT;
    private static final SubLSymbol $kw33$DIRECTION;
    private static final SubLSymbol $kw34$IO;
    private static final SubLSymbol $kw35$IF_EXISTS;
    private static final SubLSymbol $kw36$IF_DOES_NOT_EXIST;
    private static final SubLSymbol $kw37$CREATE;
    private static final SubLSymbol $kw38$ELEMENT_TYPE;
    private static final SubLList $list39;
    private static final SubLList $list40;
    private static final SubLSymbol $kw41$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $sym42$OPEN_TMP_FILE;
    private static final SubLSymbol $sym43$CUNWIND_PROTECT;
    private static final SubLSymbol $sym44$PWHEN;
    private static final SubLSymbol $sym45$STREAMP;
    private static final SubLSymbol $sym46$DELETE_FILE;
    private static final SubLSymbol $sym47$CLOSE;
    private static final SubLList $list48;
    private static final SubLSymbol $sym49$FORCE_OUTPUT;
    private static final SubLSymbol $sym50$PROBE_FILE;
    private static final SubLSymbol $sym51$COPY_FILE;
    private static final SubLSymbol $sym52$TO_STRING;
    private static final SubLList $list53;
    private static final SubLList $list54;
    private static final SubLSymbol $kw55$DIRECTORY;
    private static final SubLSymbol $sym56$MAKE_TEMP_FILENAME;
    private static final SubLSymbol $sym57$PROGN;
    private static final SubLSymbol $sym58$IGNORE_ERRORS;
    private static final SubLList $list59;
    private static final SubLList $list60;
    private static final SubLSymbol $sym61$WITH_TMP_FILE;
    private static final SubLList $list62;
    private static final SubLSymbol $sym63$WITH_TEMP_FILE;
    private static final SubLSymbol $sym64$INTEGERP;
    private static final SubLSymbol $kw65$IGNORE_ERRORS_TARGET;
    private static final SubLSymbol $sym66$IGNORE_ERRORS_HANDLER;
    private static final SubLSymbol $kw67$OUTPUT;
    private static final SubLString $str68$Unable_to_open__S;
    private static final SubLSymbol $sym69$READ_CHAR;
    private static final SubLSymbol $sym70$WRITE_CHAR;
    private static final SubLSymbol $kw71$BINARY;
    private static final SubLSymbol $kw72$DEFAULT;
    private static final SubLSymbol $sym73$READ_BYTE;
    private static final SubLSymbol $sym74$WRITE_BYTE;
    private static final SubLString $str75$_S_is_not_a_valid_mode_;
    private static final SubLSymbol $kw76$APPEND;
    private static final SubLList $list77;
    private static final SubLSymbol $sym78$INFILE;
    private static final SubLList $list79;
    private static final SubLSymbol $sym80$CDO;
    private static final SubLSymbol $sym81$CDOLINES_GET_NEXT_LINE;
    private static final SubLSymbol $sym82$COR;
    private static final SubLSymbol $sym83$NULL;
    private static final SubLSymbol $sym84$CDOLINES;
    private static final SubLList $list85;
    private static final SubLList $list86;
    private static final SubLSymbol $kw87$LINE_NUMBER;
    private static final SubLSymbol $kw88$DONE;
    private static final SubLSymbol $sym89$LINE_NUMBER_VAR;
    private static final SubLSymbol $sym90$DO_STREAM_LINES;
    private static final SubLSymbol $sym91$STREAM_VAR;
    private static final SubLSymbol $sym92$SYMBOLP;
    private static final SubLSymbol $sym93$1_;
    private static final SubLSymbol $sym94$DO_STREAM_LINES_GET_NEXT_LINE;
    private static final SubLList $list95;
    private static final SubLList $list96;
    private static final SubLSymbol $kw97$PROGRESS_MESSAGE;
    private static final SubLSymbol $sym98$FILE_VAR;
    private static final SubLSymbol $sym99$STREAM_VAR;
    private static final SubLSymbol $sym100$FILE_VAR;
    private static final SubLSymbol $sym101$STREAM_VAR;
    private static final SubLSymbol $sym102$LENGTH_VAR;
    private static final SubLSymbol $sym103$NOTING_PERCENT_PROGRESS;
    private static final SubLSymbol $sym104$FILE_LENGTH;
    private static final SubLSymbol $sym105$NOTE_PERCENT_PROGRESS;
    private static final SubLSymbol $sym106$FILE_POSITION;
    private static final SubLSymbol $kw107$INPUT;
    private static final SubLList $list108;
    private static final SubLList $list109;
    private static final SubLSymbol $kw110$BREAK_LIST;
    private static final SubLList $list111;
    private static final SubLSymbol $kw112$EMBED_LIST;
    private static final SubLList $list113;
    private static final SubLSymbol $kw114$INCLUDE_STOPS;
    private static final SubLSymbol $kw115$IGNORE_EMPTY_STRINGS;
    private static final SubLSymbol $kw116$QUOTE_CHARS;
    private static final SubLList $list117;
    private static final SubLSymbol $sym118$LINE;
    private static final SubLSymbol $sym119$DO_FILE_LINES;
    private static final SubLSymbol $sym120$STRING_TOKENIZE;
    private static final SubLList $list121;
    private static final SubLList $list122;
    private static final SubLSymbol $sym123$LINE;
    private static final SubLSymbol $sym124$CDESTRUCTURING_BIND;
    private static final SubLSymbol $sym125$MAPCAR;
    private static final SubLList $list126;
    private static final SubLSymbol $sym127$LINE;
    private static final SubLSymbol $sym128$LINE_INDEX;
    private static final SubLSymbol $sym129$DONE_INT;
    private static final SubLList $list130;
    private static final SubLList $list131;
    private static final SubLSymbol $sym132$WHILE;
    private static final SubLSymbol $sym133$_;
    private static final SubLSymbol $sym134$LENGTH;
    private static final SubLSymbol $sym135$CMULTIPLE_VALUE_BIND;
    private static final SubLList $list136;
    private static final SubLSymbol $sym137$READ_FROM_STRING;
    private static final SubLSymbol $sym138$CPUSH;
    private static final SubLSymbol $sym139$ITEM;
    private static final SubLSymbol $sym140$CSETQ;
    private static final SubLList $list141;
    private static final SubLSymbol $sym142$NREVERSE;
    private static final SubLSymbol $sym143$PUNLESS;
    private static final SubLList $list144;
    private static final SubLSymbol $sym145$WHITESPACE_STRING_;
    private static final SubLSymbol $sym146$FALSE;
    private static final SubLSymbol $sym147$INSTREAM;
    private static final SubLSymbol $sym148$LINE;
    private static final SubLSymbol $sym149$INPUT_STREAM_P;
    private static final SubLSymbol $sym150$NETWORK_READ_LINE;
    private static final SubLList $list151;
    private static final SubLSymbol $sym152$FUNCALL;
    private static final SubLList $list153;
    private static final SubLList $list154;
    private static final SubLSymbol $kw155$INCLUDE_DIRECTORY_;
    private static final SubLSymbol $kw156$SORT_FN;
    private static final SubLSymbol $sym157$DIRECTORY_CONTENTS_VAR;
    private static final SubLSymbol $sym158$PROGRESS_MESSAGE_VAR;
    private static final SubLSymbol $sym159$CHECK_TYPE;
    private static final SubLList $list160;
    private static final SubLSymbol $sym161$DIRECTORY;
    private static final SubLSymbol $sym162$_SILENT_PROGRESS__;
    private static final SubLSymbol $sym163$CNOT;
    private static final SubLSymbol $sym164$FUNCTION_SPEC_P;
    private static final SubLSymbol $sym165$SORT;
    private static final SubLSymbol $sym166$PROGRESS_CSOME;
    private static final SubLList $list167;
    private static final SubLList $list168;
    private static final SubLSymbol $sym169$DO_DIRECTORY_CONTENTS;
    private static final SubLSymbol $sym170$DIRECTORY_P;
    private static final SubLSymbol $sym171$FCOND;
    private static final SubLSymbol $sym172$ENDS_WITH;
    private static final SubLList $list173;
    private static final SubLSymbol $sym174$CCONCATENATE;
    private static final SubLString $str175$_;
    private static final SubLSymbol $sym176$LAST_CHAR;
    private static final SubLList $list177;
    private static final SubLList $list178;
    private static final SubLList $list179;
    private static final SubLString $str180$Processing_directory_tree_files__;
    private static final SubLSymbol $sym181$DIRECTORY_LIST_VAR;
    private static final SubLSymbol $sym182$CURRENT_DIRECTORY_VAR;
    private static final SubLSymbol $sym183$LIST;
    private static final SubLSymbol $sym184$FIRST;
    private static final SubLSymbol $sym185$CPOP;
    private static final SubLSymbol $sym186$FWHEN;
    private static final SubLSymbol $sym187$FORMAT_NIL;
    private static final SubLString $str188$___Directory___S;
    private static final SubLString $str189$cdolist;
    private static final SubLSymbol $sym190$SECOND;
    private static final SubLSymbol $sym191$FILE_WRITE_DATE;
    private static final SubLString $str192$_;
    private static final SubLList $list193;
    private static final SubLString $str194$Could_not_find__A;
    private static final SubLString $str195$Could_not_find__A_A;
    private static final SubLString $str196$File_not_found_;
    private static final SubLString $str197$File_not_found_from_directory__A;
    private static final SubLSymbol $kw198$UNIX;
    private static final SubLSymbol $kw199$DOS;
    private static final SubLString $str200$__;
    private static final SubLSymbol $kw201$MAC;
    private static final SubLString $str202$_;
    private static final SubLString $str203$Path_type_mismatch_;
    private static final SubLString $str204$__;
    private static final SubLString $str205$Cannot_make_relative_path__A_even;
    private static final SubLString $str206$Cannot_strip_non_absolute_prefix_;
    private static final SubLString $str207$_;
    private static final SubLString $str208$Warning__unable_to_read_file__s__;
    private static final SubLString $str209$make_directory_recursive__could_n;
    private static final SubLString $str210$Able_to_create_directory__A__but_;
    private static final SubLString $str211$chmod;
    private static final SubLString $str212$ln;
    private static final SubLString $str213$_s;
    private static final SubLString $str214$Copy_of__A_to__A_failed___A_has__;
    private static final SubLString $str215$I_m_alive___;
    private static final SubLString $str216$Could_not_make_directory__a_with_;
    private static final SubLString $str217$File_already_exists___A__;
    private static final SubLSymbol $sym218$PRINT;
    private static final SubLSymbol $sym219$OPEN_TEXT;
    private static final SubLSymbol $sym220$OPEN_BINARY;
    private static final SubLString $str221$Cannot_open__A_for_writing___;
    private static final SubLSymbol $sym222$FILE_ACCUMULATOR_RESET;
    private static final SubLSymbol $sym223$FILE_ACCUMULATOR_ADD;
    private static final SubLSymbol $sym224$FILE_ACCUMULATOR_SIZE;
    private static final SubLSymbol $sym225$FILE_ACCUMULATOR_CONTENTS;
    private static final SubLSymbol $sym226$FILE_ACCUMULATOR_ITERATOR;
    private static final SubLSymbol $kw227$STREAM;
    private static final SubLSymbol $kw228$WRITER;
    private static final SubLSymbol $kw229$ITEM_COUNT;
    private static final SubLList $list230;
    private static final SubLSymbol $sym231$_KEY;
    private static final SubLList $list232;
    private static final SubLList $list233;
    private static final SubLString $str234$Operation_not_supported_for_file_;
    private static final SubLString $str235$Operation_not_yet_supported_for_f;
    private static final SubLSymbol $sym236$TEST_GET_BINARY_DATA_FROM_STREAM;
    private static final SubLSymbol $kw237$TEST;
    private static final SubLSymbol $kw238$OWNER;
    private static final SubLSymbol $kw239$CLASSES;
    private static final SubLSymbol $kw240$KB;
    private static final SubLSymbol $kw241$TINY;
    private static final SubLSymbol $kw242$WORKING_;
    private static final SubLList $list243;
    private static final SubLString $str244$Expected__S__which_is___A__A__of_;
    private static final SubLSymbol $kw245$SUCCESS;
    private static final SubLSymbol $kw246$ERROR;
    private static final SubLList $list247;
    private static final SubLList $list248;
    private static final SubLString $str249$ads65jh3_;
    private static final SubLString $str250$Couldn_t_test_creation_of__S__as_;
    private static final SubLString $str251$Failed_to_create_or_delete__S;
    private static final SubLString $str252$ds6sdg32;
    private static final SubLString $str253$Couldn_t_test_creation_and_deleti;
    private static final SubLList $list254;
    private static final SubLString $str255$ads65jh3;
    private static final SubLSymbol $sym256$TEST_DIRECTORY_CREATION_AND_DELETION;
    private static final SubLList $list257;
    static  boolean assertionsDisabledSynth = true;
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 730L)
    public static SubLObject with_stream_buffer_size(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_utilities.$list2);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject size = (SubLObject)file_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_utilities.$list2);
        size = current.first();
        current = current.rest();
        if (file_utilities.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)file_utilities.$sym3$CLET, reader.bq_cons((SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym4$_STREAM_INITIAL_INPUT_BUFFER_SIZE_, size), (SubLObject)file_utilities.$list5), (SubLObject)file_utilities.$list6, ConsesLow.append(body, (SubLObject)file_utilities.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)file_utilities.$list2);
        return (SubLObject)file_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 1080L)
    public static SubLObject possibly_with_text_file(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_utilities.$list7);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject stream = (SubLObject)file_utilities.NIL;
        SubLObject filename = (SubLObject)file_utilities.NIL;
        SubLObject direction = (SubLObject)file_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_utilities.$list7);
        stream = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_utilities.$list7);
        filename = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_utilities.$list7);
        direction = current.first();
        current = current.rest();
        if (file_utilities.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject filename_var = (SubLObject)file_utilities.$sym8$FILENAME_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym3$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(filename_var, filename)), (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym9$PIF, filename_var, (SubLObject)ConsesLow.listS((SubLObject)file_utilities.$sym10$WITH_TEXT_FILE, (SubLObject)ConsesLow.list(stream, filename_var, direction), ConsesLow.append(body, (SubLObject)file_utilities.NIL)), (SubLObject)ConsesLow.listS((SubLObject)file_utilities.$sym3$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(stream, (SubLObject)file_utilities.$list11)), ConsesLow.append(body, (SubLObject)file_utilities.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)file_utilities.$list7);
        return (SubLObject)file_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 1418L)
    public static SubLObject possibly_with_private_text_file(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_utilities.$list7);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject stream = (SubLObject)file_utilities.NIL;
        SubLObject filename = (SubLObject)file_utilities.NIL;
        SubLObject direction = (SubLObject)file_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_utilities.$list7);
        stream = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_utilities.$list7);
        filename = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_utilities.$list7);
        direction = current.first();
        current = current.rest();
        if (file_utilities.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject filename_var = (SubLObject)file_utilities.$sym12$FILENAME_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym3$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(filename_var, filename)), (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym9$PIF, filename_var, (SubLObject)ConsesLow.listS((SubLObject)file_utilities.$sym13$WITH_PRIVATE_TEXT_FILE, (SubLObject)ConsesLow.list(stream, filename_var, direction), ConsesLow.append(body, (SubLObject)file_utilities.NIL)), (SubLObject)ConsesLow.listS((SubLObject)file_utilities.$sym3$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(stream, (SubLObject)file_utilities.$list11)), ConsesLow.append(body, (SubLObject)file_utilities.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)file_utilities.$list7);
        return (SubLObject)file_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 1772L)
    public static SubLObject possibly_with_binary_file(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_utilities.$list7);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject stream = (SubLObject)file_utilities.NIL;
        SubLObject filename = (SubLObject)file_utilities.NIL;
        SubLObject direction = (SubLObject)file_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_utilities.$list7);
        stream = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_utilities.$list7);
        filename = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_utilities.$list7);
        direction = current.first();
        current = current.rest();
        if (file_utilities.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject filename_var = (SubLObject)file_utilities.$sym14$FILENAME_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym3$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(filename_var, filename)), (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym9$PIF, filename_var, (SubLObject)ConsesLow.listS((SubLObject)file_utilities.$sym15$WITH_BINARY_FILE, (SubLObject)ConsesLow.list(stream, filename_var, direction), ConsesLow.append(body, (SubLObject)file_utilities.NIL)), (SubLObject)ConsesLow.listS((SubLObject)file_utilities.$sym3$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(stream, (SubLObject)file_utilities.$list11)), ConsesLow.append(body, (SubLObject)file_utilities.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)file_utilities.$list7);
        return (SubLObject)file_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 2114L)
    public static SubLObject possibly_with_private_binary_file(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_utilities.$list7);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject stream = (SubLObject)file_utilities.NIL;
        SubLObject filename = (SubLObject)file_utilities.NIL;
        SubLObject direction = (SubLObject)file_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_utilities.$list7);
        stream = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_utilities.$list7);
        filename = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_utilities.$list7);
        direction = current.first();
        current = current.rest();
        if (file_utilities.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject filename_var = (SubLObject)file_utilities.$sym16$FILENAME_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym3$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(filename_var, filename)), (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym9$PIF, filename_var, (SubLObject)ConsesLow.listS((SubLObject)file_utilities.$sym17$WITH_PRIVATE_BINARY_FILE, (SubLObject)ConsesLow.list(stream, filename_var, direction), ConsesLow.append(body, (SubLObject)file_utilities.NIL)), (SubLObject)ConsesLow.listS((SubLObject)file_utilities.$sym3$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(stream, (SubLObject)file_utilities.$list11)), ConsesLow.append(body, (SubLObject)file_utilities.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)file_utilities.$list7);
        return (SubLObject)file_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 2472L)
    public static SubLObject peek_byte_from_char_stream(SubLObject stream, SubLObject eof_error_p, SubLObject eof_value) {
        if (stream == file_utilities.UNPROVIDED) {
            stream = StreamsLow.$standard_input$.getDynamicValue();
        }
        if (eof_error_p == file_utilities.UNPROVIDED) {
            eof_error_p = (SubLObject)file_utilities.T;
        }
        if (eof_value == file_utilities.UNPROVIDED) {
            eof_value = (SubLObject)file_utilities.NIL;
        }
        final SubLObject byte_as_char = streams_high.peek_char((SubLObject)file_utilities.NIL, stream, (SubLObject)file_utilities.NIL, (SubLObject)file_utilities.$kw18$EOF, (SubLObject)file_utilities.UNPROVIDED);
        if (file_utilities.$kw18$EOF != byte_as_char) {
            return Characters.char_code(byte_as_char);
        }
        if (file_utilities.NIL == eof_error_p) {
            return eof_value;
        }
        return streams_high.peek_char((SubLObject)file_utilities.NIL, stream, (SubLObject)file_utilities.T, eof_value, (SubLObject)file_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 3166L)
    public static SubLObject read_byte_from_char_stream(SubLObject stream, SubLObject eof_error_p, SubLObject eof_value) {
        if (stream == file_utilities.UNPROVIDED) {
            stream = StreamsLow.$standard_input$.getDynamicValue();
        }
        if (eof_error_p == file_utilities.UNPROVIDED) {
            eof_error_p = (SubLObject)file_utilities.T;
        }
        if (eof_value == file_utilities.UNPROVIDED) {
            eof_value = (SubLObject)file_utilities.NIL;
        }
        final SubLObject byte_as_char = streams_high.read_char(stream, (SubLObject)file_utilities.NIL, (SubLObject)file_utilities.$kw18$EOF, (SubLObject)file_utilities.UNPROVIDED);
        if (file_utilities.$kw18$EOF != byte_as_char) {
            return Characters.char_code(byte_as_char);
        }
        if (file_utilities.NIL == eof_error_p) {
            return eof_value;
        }
        return streams_high.read_char(stream, (SubLObject)file_utilities.T, eof_value, (SubLObject)file_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 3550L)
    public static SubLObject unread_byte_from_char_stream(final SubLObject v_byte, SubLObject stream) {
        if (stream == file_utilities.UNPROVIDED) {
            stream = StreamsLow.$standard_input$.getDynamicValue();
        }
        final SubLObject byte_as_char = Characters.code_char(v_byte);
        return streams_high.unread_char(byte_as_char, stream);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 3785L)
    public static SubLObject write_byte_to_char_stream(final SubLObject v_byte, SubLObject stream) {
        if (stream == file_utilities.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLObject byte_as_char = Characters.code_char(v_byte);
        return streams_high.write_char(byte_as_char, stream);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 4016L)
    public static SubLObject stream_designator_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isStream() || v_object == file_utilities.T || v_object == file_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 4245L)
    public static SubLObject pathname_designator_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject error = (SubLObject)file_utilities.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)file_utilities.$sym19$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    Filesys.probe_file(v_object);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)file_utilities.NIL);
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
        return Types.sublisp_null(error);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 4547L)
    public static SubLObject load_from_cyc_home(final SubLObject filename) {
        return Eval.load(cyc_home_filename((SubLObject)file_utilities.NIL, filename, (SubLObject)file_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 4644L)
    public static SubLObject cyc_home_filename(final SubLObject subdirectory_list, final SubLObject filename, SubLObject extension) {
        if (extension == file_utilities.UNPROVIDED) {
            extension = (SubLObject)file_utilities.NIL;
        }
        assert file_utilities.NIL != Types.listp(subdirectory_list) : subdirectory_list;
        return relative_filename(system_info.$cyc_home_directory$.getGlobalValue(), Filesys.construct_filename(subdirectory_list, filename, extension, (SubLObject)file_utilities.T), (SubLObject)file_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 5050L)
    public static SubLObject cyc_home_subdirectory(final SubLObject subdirectory_list) {
        assert file_utilities.NIL != Types.listp(subdirectory_list) : subdirectory_list;
        return relative_filename(system_info.$cyc_home_directory$.getGlobalValue(), Filesys.construct_filename(subdirectory_list, (SubLObject)file_utilities.$str22$, (SubLObject)file_utilities.NIL, (SubLObject)file_utilities.T), (SubLObject)file_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 5352L)
    public static SubLObject canonical_cyc_working_directory() {
        return string_utilities.to_string(Filesys.probe_file((SubLObject)file_utilities.$str23$_));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 5551L)
    public static SubLObject relative_filename(final SubLObject directory_string, final SubLObject filename, SubLObject extension) {
        if (extension == file_utilities.UNPROVIDED) {
            extension = (SubLObject)file_utilities.NIL;
        }
        assert file_utilities.NIL != Types.stringp(directory_string) : directory_string;
        return Sequences.cconcatenate(directory_string, basic_filename(filename, extension));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 5932L)
    public static SubLObject basic_filename(final SubLObject filename, SubLObject extension) {
        if (extension == file_utilities.UNPROVIDED) {
            extension = (SubLObject)file_utilities.NIL;
        }
        if (file_utilities.NIL == extension) {
            return filename;
        }
        return Filesys.construct_filename((SubLObject)file_utilities.NIL, filename, extension, (SubLObject)file_utilities.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 6470L)
    public static SubLObject temp_directory() {
        final SubLObject temp_dir = subl_promotions.get_temp_directory();
        if (file_utilities.NIL != temp_dir) {
            return possibly_append_path_separator_char(temp_dir);
        }
        return file_utilities.$temp_directory$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 6734L)
    public static SubLObject random_path_char() {
        return Strings.sublisp_char(file_utilities.$random_path_chars$.getGlobalValue(), random.random((SubLObject)file_utilities.$int30$36));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 6818L)
    public static SubLObject make_temp_filename(SubLObject directory_string) {
        if (directory_string == file_utilities.UNPROVIDED) {
            directory_string = file_utilities.$temp_directory$.getGlobalValue();
        }
        assert file_utilities.NIL != Types.stringp(directory_string) : directory_string;
        final SubLObject filename = random_filename_part((SubLObject)file_utilities.EIGHT_INTEGER);
        return relative_filename(possibly_append_path_separator_char(directory_string), filename, (SubLObject)file_utilities.$str31$tmp);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 7168L)
    public static SubLObject random_filename_part(SubLObject length) {
        if (length == file_utilities.UNPROVIDED) {
            length = (SubLObject)file_utilities.EIGHT_INTEGER;
        }
        final SubLObject part = Strings.make_string(length, (SubLObject)Characters.CHAR_space);
        SubLObject i;
        for (i = (SubLObject)file_utilities.NIL, i = (SubLObject)file_utilities.ZERO_INTEGER; i.numL(length); i = Numbers.add(i, (SubLObject)file_utilities.ONE_INTEGER)) {
            Strings.set_char(part, i, random_path_char());
        }
        return part;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 7473L)
    public static SubLObject make_unused_temp_filename(SubLObject directory_string) {
        if (directory_string == file_utilities.UNPROVIDED) {
            directory_string = file_utilities.$temp_directory$.getGlobalValue();
        }
        SubLObject filename;
        for (filename = (SubLObject)file_utilities.NIL; file_utilities.NIL == filename || file_utilities.NIL != Filesys.probe_file(filename); filename = Strings.string_downcase(make_temp_filename(directory_string), (SubLObject)file_utilities.UNPROVIDED, (SubLObject)file_utilities.UNPROVIDED)) {}
        return filename;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 7877L)
    public static SubLObject make_prefixed_temp_filename(final SubLObject prefix, SubLObject directory_string) {
        if (directory_string == file_utilities.UNPROVIDED) {
            directory_string = file_utilities.$temp_directory$.getGlobalValue();
        }
        assert file_utilities.NIL != Types.stringp(directory_string) : directory_string;
        final SubLObject random_part = random_filename_part((SubLObject)file_utilities.EIGHT_INTEGER);
        final SubLObject filename = Sequences.cconcatenate(prefix, random_part);
        return relative_filename(directory_string, filename, (SubLObject)file_utilities.$str31$tmp);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 8276L)
    public static SubLObject open_temp_file(SubLObject element_type, SubLObject directory) {
        if (element_type == file_utilities.UNPROVIDED) {
            element_type = (SubLObject)file_utilities.$kw32$TEXT;
        }
        if (directory == file_utilities.UNPROVIDED) {
            directory = file_utilities.$temp_directory$.getGlobalValue();
        }
        SubLObject stream;
        for (stream = (SubLObject)file_utilities.NIL; file_utilities.NIL == stream; stream = StreamsLow.open(make_temp_filename(directory), new SubLObject[] { file_utilities.$kw33$DIRECTION, file_utilities.$kw34$IO, file_utilities.$kw35$IF_EXISTS, file_utilities.NIL, file_utilities.$kw36$IF_DOES_NOT_EXIST, file_utilities.$kw37$CREATE, file_utilities.$kw38$ELEMENT_TYPE, element_type })) {}
        return stream;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 8704L)
    public static SubLObject with_temp_file(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_utilities.$list39);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject stream = (SubLObject)file_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_utilities.$list39);
        stream = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)file_utilities.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)file_utilities.NIL;
        SubLObject current_$1 = (SubLObject)file_utilities.NIL;
        while (file_utilities.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)file_utilities.$list39);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)file_utilities.$list39);
            if (file_utilities.NIL == conses_high.member(current_$1, (SubLObject)file_utilities.$list40, (SubLObject)file_utilities.UNPROVIDED, (SubLObject)file_utilities.UNPROVIDED)) {
                bad = (SubLObject)file_utilities.T;
            }
            if (current_$1 == file_utilities.$kw41$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (file_utilities.NIL != bad && file_utilities.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)file_utilities.$list39);
        }
        final SubLObject element_type_tail = cdestructuring_bind.property_list_member((SubLObject)file_utilities.$kw38$ELEMENT_TYPE, current);
        final SubLObject element_type = (SubLObject)((file_utilities.NIL != element_type_tail) ? conses_high.cadr(element_type_tail) : file_utilities.$kw32$TEXT);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym3$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(stream, (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym42$OPEN_TMP_FILE, element_type))), reader.bq_cons((SubLObject)file_utilities.$sym43$CUNWIND_PROTECT, ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym44$PWHEN, (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym45$STREAMP, stream), (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym46$DELETE_FILE, stream), (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym47$CLOSE, stream))))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 9048L)
    public static SubLObject with_file_replacement(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_utilities.$list48);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject stream = (SubLObject)file_utilities.NIL;
        SubLObject filename = (SubLObject)file_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_utilities.$list48);
        stream = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_utilities.$list48);
        filename = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)file_utilities.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)file_utilities.NIL;
        SubLObject current_$2 = (SubLObject)file_utilities.NIL;
        while (file_utilities.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)file_utilities.$list48);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)file_utilities.$list48);
            if (file_utilities.NIL == conses_high.member(current_$2, (SubLObject)file_utilities.$list40, (SubLObject)file_utilities.UNPROVIDED, (SubLObject)file_utilities.UNPROVIDED)) {
                bad = (SubLObject)file_utilities.T;
            }
            if (current_$2 == file_utilities.$kw41$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (file_utilities.NIL != bad && file_utilities.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)file_utilities.$list48);
        }
        final SubLObject element_type_tail = cdestructuring_bind.property_list_member((SubLObject)file_utilities.$kw38$ELEMENT_TYPE, current);
        final SubLObject element_type = (SubLObject)((file_utilities.NIL != element_type_tail) ? conses_high.cadr(element_type_tail) : file_utilities.$kw32$TEXT);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym3$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(stream, (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym42$OPEN_TMP_FILE, element_type))), reader.bq_cons((SubLObject)file_utilities.$sym43$CUNWIND_PROTECT, ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym44$PWHEN, (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym45$STREAMP, stream), (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym49$FORCE_OUTPUT, stream), (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym44$PWHEN, (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym50$PROBE_FILE, filename), (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym46$DELETE_FILE, filename)), (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym51$COPY_FILE, (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym52$TO_STRING, (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym50$PROBE_FILE, stream)), filename), (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym46$DELETE_FILE, stream), (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym47$CLOSE, stream))))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 9842L)
    public static SubLObject with_temporary_filename(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_utilities.$list53);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject filename = (SubLObject)file_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_utilities.$list53);
        filename = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)file_utilities.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)file_utilities.NIL;
        SubLObject current_$3 = (SubLObject)file_utilities.NIL;
        while (file_utilities.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)file_utilities.$list53);
            current_$3 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)file_utilities.$list53);
            if (file_utilities.NIL == conses_high.member(current_$3, (SubLObject)file_utilities.$list54, (SubLObject)file_utilities.UNPROVIDED, (SubLObject)file_utilities.UNPROVIDED)) {
                bad = (SubLObject)file_utilities.T;
            }
            if (current_$3 == file_utilities.$kw41$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (file_utilities.NIL != bad && file_utilities.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)file_utilities.$list53);
        }
        final SubLObject directory_tail = cdestructuring_bind.property_list_member((SubLObject)file_utilities.$kw55$DIRECTORY, current);
        final SubLObject directory = (file_utilities.NIL != directory_tail) ? conses_high.cadr(directory_tail) : file_utilities.$temp_directory$.getGlobalValue();
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym3$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(filename, (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym56$MAKE_TEMP_FILENAME, directory))), (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym43$CUNWIND_PROTECT, reader.bq_cons((SubLObject)file_utilities.$sym57$PROGN, ConsesLow.append(body, (SubLObject)file_utilities.NIL)), (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym58$IGNORE_ERRORS, (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym46$DELETE_FILE, filename))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 10298L)
    public static SubLObject open_tmp_file(SubLObject element_type, SubLObject directory) {
        if (element_type == file_utilities.UNPROVIDED) {
            element_type = (SubLObject)file_utilities.$kw32$TEXT;
        }
        if (directory == file_utilities.UNPROVIDED) {
            directory = file_utilities.$temp_directory$.getGlobalValue();
        }
        return open_temp_file(element_type, directory);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 10478L)
    public static SubLObject with_tmp_file(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_utilities.$list60);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject stream = (SubLObject)file_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_utilities.$list60);
        stream = current.first();
        current = current.rest();
        final SubLObject element_type = (SubLObject)(current.isCons() ? current.first() : file_utilities.$kw32$TEXT);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)file_utilities.$list60);
        current = current.rest();
        if (file_utilities.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            access_macros.defmacro_obsolete_warning((SubLObject)file_utilities.$sym61$WITH_TMP_FILE, (SubLObject)file_utilities.$list62);
            return (SubLObject)ConsesLow.listS((SubLObject)file_utilities.$sym63$WITH_TEMP_FILE, (SubLObject)ConsesLow.list(stream, (SubLObject)file_utilities.$kw38$ELEMENT_TYPE, element_type), ConsesLow.append(body, (SubLObject)file_utilities.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)file_utilities.$list60);
        return (SubLObject)file_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 10673L)
    public static SubLObject directory_writeable_p(final SubLObject directory_string, SubLObject byte_size) {
        if (byte_size == file_utilities.UNPROVIDED) {
            byte_size = (SubLObject)file_utilities.ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert file_utilities.NIL != Types.stringp(directory_string) : directory_string;
        assert file_utilities.NIL != Types.integerp(byte_size) : byte_size;
        if (file_utilities.NIL == Filesys.directory_p(directory_string)) {
            return (SubLObject)file_utilities.NIL;
        }
        final SubLObject temp_file = make_temp_filename(directory_string);
        SubLObject created = (SubLObject)file_utilities.NIL;
        SubLObject sized = (SubLObject)file_utilities.NIL;
        SubLObject writeable = (SubLObject)file_utilities.NIL;
        SubLObject ignore_errors_tag = (SubLObject)file_utilities.NIL;
        try {
            thread.throwStack.push(file_utilities.$kw65$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)file_utilities.$sym66$IGNORE_ERRORS_HANDLER), thread);
                try {
                    try {
                        SubLObject stream = (SubLObject)file_utilities.NIL;
                        try {
                            final SubLObject _prev_bind_0_$4 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                            try {
                                stream_macros.$stream_requires_locking$.bind((SubLObject)file_utilities.NIL, thread);
                                stream = compatibility.open_binary(temp_file, (SubLObject)file_utilities.$kw67$OUTPUT);
                            }
                            finally {
                                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$4, thread);
                            }
                            if (!stream.isStream()) {
                                Errors.error((SubLObject)file_utilities.$str68$Unable_to_open__S, temp_file);
                            }
                            final SubLObject s = stream;
                            created = (SubLObject)file_utilities.T;
                            sized = (SubLObject)file_utilities.T;
                        }
                        finally {
                            final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_utilities.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (stream.isStream()) {
                                    streams_high.close(stream, (SubLObject)file_utilities.UNPROVIDED);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                            }
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_utilities.T, thread);
                            final SubLObject _values2 = Values.getValuesAsVector();
                            if (file_utilities.NIL != created) {
                                if (file_utilities.NIL != sized) {
                                    writeable = list_utilities.sublisp_boolean(Filesys.probe_file(temp_file));
                                }
                                Filesys.delete_file(temp_file);
                            }
                            Values.restoreValuesFromVector(_values2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                        }
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)file_utilities.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)file_utilities.$kw65$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        return writeable;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 11843L)
    public static SubLObject file_valid_for_writing_p(final SubLObject file_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject validP = (SubLObject)file_utilities.NIL;
        if (file_string.isString()) {
            SubLObject ignore_errors_tag = (SubLObject)file_utilities.NIL;
            try {
                thread.throwStack.push(file_utilities.$kw65$IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)file_utilities.$sym66$IGNORE_ERRORS_HANDLER), thread);
                    try {
                        if (file_utilities.NIL != Filesys.probe_file(file_string) || file_utilities.NIL != directory_writeable_p(reconstruct_path(deconstruct_path(file_string), (SubLObject)file_utilities.$str22$, (SubLObject)file_utilities.UNPROVIDED), (SubLObject)file_utilities.UNPROVIDED)) {
                            validP = (SubLObject)file_utilities.T;
                        }
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)file_utilities.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)file_utilities.$kw65$IGNORE_ERRORS_TARGET);
            }
            finally {
                thread.throwStack.pop();
            }
        }
        return validP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 12230L)
    public static SubLObject delete_file_if_exists(final SubLObject filename) {
        if (file_utilities.NIL != Filesys.probe_file(filename)) {
            return Filesys.delete_file(filename);
        }
        return (SubLObject)file_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 12345L)
    public static SubLObject clean_filename(final SubLObject filename) {
        final SubLObject string_var;
        final SubLObject frobbed_filename = string_var = Sequences.copy_seq(filename);
        SubLObject end_var_$7;
        SubLObject end_var;
        SubLObject i;
        SubLObject ch;
        for (end_var = (end_var_$7 = Sequences.length(string_var)), i = (SubLObject)file_utilities.NIL, i = (SubLObject)file_utilities.ZERO_INTEGER; !i.numGE(end_var_$7); i = number_utilities.f_1X(i)) {
            ch = Strings.sublisp_char(string_var, i);
            if (file_utilities.NIL == Characters.alphanumericp(ch)) {
                Strings.set_char(frobbed_filename, i, (SubLObject)Characters.CHAR_hyphen);
            }
        }
        return frobbed_filename;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 12652L)
    public static SubLObject append_files(final SubLObject f1, final SubLObject f2, SubLObject mode) {
        if (mode == file_utilities.UNPROVIDED) {
            mode = (SubLObject)file_utilities.$kw32$TEXT;
        }
        SubLObject reader = (SubLObject)file_utilities.NIL;
        SubLObject writer = (SubLObject)file_utilities.NIL;
        final SubLObject pcase_var = mode;
        if (pcase_var.eql((SubLObject)file_utilities.$kw32$TEXT)) {
            reader = Symbols.symbol_function((SubLObject)file_utilities.$sym69$READ_CHAR);
            writer = Symbols.symbol_function((SubLObject)file_utilities.$sym70$WRITE_CHAR);
        }
        else if (pcase_var.eql((SubLObject)file_utilities.$kw71$BINARY) || pcase_var.eql((SubLObject)file_utilities.$kw72$DEFAULT)) {
            reader = Symbols.symbol_function((SubLObject)file_utilities.$sym73$READ_BYTE);
            writer = Symbols.symbol_function((SubLObject)file_utilities.$sym74$WRITE_BYTE);
        }
        else {
            Errors.error((SubLObject)file_utilities.$str75$_S_is_not_a_valid_mode_, mode);
        }
        SubLObject stream_var = (SubLObject)file_utilities.NIL;
        try {
            final SubLObject in;
            stream_var = (in = StreamsLow.open(f1, new SubLObject[] { file_utilities.$kw38$ELEMENT_TYPE, mode, file_utilities.$kw36$IF_DOES_NOT_EXIST, file_utilities.NIL }));
            if (file_utilities.NIL != in) {
                SubLObject stream_var_$8 = (SubLObject)file_utilities.NIL;
                try {
                    final SubLObject out;
                    stream_var_$8 = (out = StreamsLow.open(f2, new SubLObject[] { file_utilities.$kw33$DIRECTION, file_utilities.$kw67$OUTPUT, file_utilities.$kw35$IF_EXISTS, file_utilities.$kw76$APPEND, file_utilities.$kw38$ELEMENT_TYPE, mode, file_utilities.$kw36$IF_DOES_NOT_EXIST, file_utilities.$kw37$CREATE }));
                    SubLObject elt;
                    for (elt = (SubLObject)file_utilities.NIL, elt = Functions.funcall(reader, in, (SubLObject)file_utilities.NIL, (SubLObject)file_utilities.NIL); file_utilities.NIL != elt; elt = Functions.funcall(reader, in, (SubLObject)file_utilities.NIL, (SubLObject)file_utilities.NIL)) {
                        Functions.funcall(writer, elt, out);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                    try {
                        Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)file_utilities.T);
                        final SubLObject _values = Values.getValuesAsVector();
                        if (file_utilities.NIL != stream_var_$8) {
                            streams_high.close(stream_var_$8, (SubLObject)file_utilities.UNPROVIDED);
                        }
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)file_utilities.T);
                final SubLObject _values2 = Values.getValuesAsVector();
                if (file_utilities.NIL != stream_var) {
                    streams_high.close(stream_var, (SubLObject)file_utilities.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_2);
            }
        }
        return (SubLObject)file_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 13387L)
    public static SubLObject cdolines(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_utilities.$list77);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)file_utilities.NIL;
        SubLObject file = (SubLObject)file_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_utilities.$list77);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_utilities.$list77);
        file = current.first();
        current = current.rest();
        final SubLObject done = (SubLObject)(current.isCons() ? current.first() : file_utilities.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)file_utilities.$list77);
        current = current.rest();
        if (file_utilities.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject infile = (SubLObject)file_utilities.$sym78$INFILE;
            return (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym13$WITH_PRIVATE_TEXT_FILE, (SubLObject)ConsesLow.listS(infile, file, (SubLObject)file_utilities.$list79), (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym44$PWHEN, (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym45$STREAMP, infile), (SubLObject)ConsesLow.listS((SubLObject)file_utilities.$sym80$CDO, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var, (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym81$CDOLINES_GET_NEXT_LINE, infile), (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym81$CDOLINES_GET_NEXT_LINE, infile))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym82$COR, (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym83$NULL, var), done)), ConsesLow.append(body, (SubLObject)file_utilities.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)file_utilities.$list77);
        return (SubLObject)file_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 13891L)
    public static SubLObject cdolines_get_next_line(final SubLObject infile) {
        return string_utilities.network_read_line(infile, (SubLObject)file_utilities.NIL, (SubLObject)file_utilities.NIL, (SubLObject)file_utilities.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 14011L)
    public static SubLObject do_stream_lines(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_utilities.$list85);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject line_var = (SubLObject)file_utilities.NIL;
        SubLObject stream = (SubLObject)file_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_utilities.$list85);
        line_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_utilities.$list85);
        stream = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)file_utilities.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)file_utilities.NIL;
        SubLObject current_$9 = (SubLObject)file_utilities.NIL;
        while (file_utilities.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)file_utilities.$list85);
            current_$9 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)file_utilities.$list85);
            if (file_utilities.NIL == conses_high.member(current_$9, (SubLObject)file_utilities.$list86, (SubLObject)file_utilities.UNPROVIDED, (SubLObject)file_utilities.UNPROVIDED)) {
                bad = (SubLObject)file_utilities.T;
            }
            if (current_$9 == file_utilities.$kw41$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (file_utilities.NIL != bad && file_utilities.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)file_utilities.$list85);
        }
        final SubLObject line_number_tail = cdestructuring_bind.property_list_member((SubLObject)file_utilities.$kw87$LINE_NUMBER, current);
        final SubLObject line_number = (SubLObject)((file_utilities.NIL != line_number_tail) ? conses_high.cadr(line_number_tail) : file_utilities.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)file_utilities.$kw88$DONE, current);
        final SubLObject done = (SubLObject)((file_utilities.NIL != done_tail) ? conses_high.cadr(done_tail) : file_utilities.NIL);
        final SubLObject body;
        current = (body = temp);
        if (file_utilities.NIL == line_number) {
            final SubLObject line_number_var = (SubLObject)file_utilities.$sym89$LINE_NUMBER_VAR;
            return (SubLObject)ConsesLow.listS((SubLObject)file_utilities.$sym90$DO_STREAM_LINES, (SubLObject)ConsesLow.list(line_var, stream, (SubLObject)file_utilities.$kw87$LINE_NUMBER, line_number_var, (SubLObject)file_utilities.$kw88$DONE, done), ConsesLow.append(body, (SubLObject)file_utilities.NIL));
        }
        final SubLObject stream_var = (SubLObject)file_utilities.$sym91$STREAM_VAR;
        assert file_utilities.NIL != Types.symbolp(line_number) : line_number;
        return (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym3$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(stream_var, stream)), (SubLObject)ConsesLow.listS((SubLObject)file_utilities.$sym80$CDO, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(line_number, (SubLObject)file_utilities.ZERO_INTEGER, (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym93$1_, line_number)), (SubLObject)ConsesLow.list(line_var, (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym94$DO_STREAM_LINES_GET_NEXT_LINE, stream_var), (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym94$DO_STREAM_LINES_GET_NEXT_LINE, stream_var))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym82$COR, done, (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym83$NULL, line_var))), ConsesLow.append(body, (SubLObject)file_utilities.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 14938L)
    public static SubLObject do_stream_lines_get_next_line(final SubLObject stream) {
        return string_utilities.network_read_line(stream, (SubLObject)file_utilities.NIL, (SubLObject)file_utilities.NIL, (SubLObject)file_utilities.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 15072L)
    public static SubLObject do_file_lines(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_utilities.$list95);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject line_var = (SubLObject)file_utilities.NIL;
        SubLObject file = (SubLObject)file_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_utilities.$list95);
        line_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_utilities.$list95);
        file = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)file_utilities.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)file_utilities.NIL;
        SubLObject current_$10 = (SubLObject)file_utilities.NIL;
        while (file_utilities.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)file_utilities.$list95);
            current_$10 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)file_utilities.$list95);
            if (file_utilities.NIL == conses_high.member(current_$10, (SubLObject)file_utilities.$list96, (SubLObject)file_utilities.UNPROVIDED, (SubLObject)file_utilities.UNPROVIDED)) {
                bad = (SubLObject)file_utilities.T;
            }
            if (current_$10 == file_utilities.$kw41$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (file_utilities.NIL != bad && file_utilities.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)file_utilities.$list95);
        }
        final SubLObject line_number_tail = cdestructuring_bind.property_list_member((SubLObject)file_utilities.$kw87$LINE_NUMBER, current);
        final SubLObject line_number = (SubLObject)((file_utilities.NIL != line_number_tail) ? conses_high.cadr(line_number_tail) : file_utilities.NIL);
        final SubLObject progress_message_tail = cdestructuring_bind.property_list_member((SubLObject)file_utilities.$kw97$PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (SubLObject)((file_utilities.NIL != progress_message_tail) ? conses_high.cadr(progress_message_tail) : file_utilities.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)file_utilities.$kw88$DONE, current);
        final SubLObject done = (SubLObject)((file_utilities.NIL != done_tail) ? conses_high.cadr(done_tail) : file_utilities.NIL);
        final SubLObject body;
        current = (body = temp);
        if (file_utilities.NIL == progress_message) {
            final SubLObject file_var = (SubLObject)file_utilities.$sym98$FILE_VAR;
            final SubLObject stream_var = (SubLObject)file_utilities.$sym99$STREAM_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym3$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(file_var, file)), (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym13$WITH_PRIVATE_TEXT_FILE, (SubLObject)ConsesLow.listS(stream_var, file_var, (SubLObject)file_utilities.$list79), (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym44$PWHEN, (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym45$STREAMP, stream_var), (SubLObject)ConsesLow.listS((SubLObject)file_utilities.$sym90$DO_STREAM_LINES, (SubLObject)ConsesLow.list(line_var, stream_var, (SubLObject)file_utilities.$kw87$LINE_NUMBER, line_number, (SubLObject)file_utilities.$kw88$DONE, done), ConsesLow.append(body, (SubLObject)file_utilities.NIL)))));
        }
        final SubLObject file_var = (SubLObject)file_utilities.$sym100$FILE_VAR;
        final SubLObject stream_var = (SubLObject)file_utilities.$sym101$STREAM_VAR;
        final SubLObject length_var = (SubLObject)file_utilities.$sym102$LENGTH_VAR;
        return (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym103$NOTING_PERCENT_PROGRESS, progress_message, (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym3$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(file_var, file)), (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym13$WITH_PRIVATE_TEXT_FILE, (SubLObject)ConsesLow.listS(stream_var, file_var, (SubLObject)file_utilities.$list79), (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym44$PWHEN, (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym45$STREAMP, stream_var), (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym3$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(length_var, (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym104$FILE_LENGTH, stream_var))), (SubLObject)ConsesLow.listS((SubLObject)file_utilities.$sym90$DO_STREAM_LINES, (SubLObject)ConsesLow.list(line_var, stream_var, (SubLObject)file_utilities.$kw87$LINE_NUMBER, line_number, (SubLObject)file_utilities.$kw88$DONE, done), ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym105$NOTE_PERCENT_PROGRESS, (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym106$FILE_POSITION, stream_var), length_var)))))))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 16394L)
    public static SubLObject count_file_lines(final SubLObject file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = (SubLObject)file_utilities.ZERO_INTEGER;
        SubLObject stream = (SubLObject)file_utilities.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)file_utilities.NIL, thread);
                stream = compatibility.open_text(file, (SubLObject)file_utilities.$kw107$INPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)file_utilities.$str68$Unable_to_open__S, file);
            }
            final SubLObject stream_var = stream;
            if (stream_var.isStream()) {
                final SubLObject stream_var_$11 = stream_var;
                SubLObject line_number_var = (SubLObject)file_utilities.NIL;
                SubLObject line = (SubLObject)file_utilities.NIL;
                line_number_var = (SubLObject)file_utilities.ZERO_INTEGER;
                for (line = do_stream_lines_get_next_line(stream_var_$11); file_utilities.NIL != line; line = do_stream_lines_get_next_line(stream_var_$11)) {
                    count = Numbers.add(count, (SubLObject)file_utilities.ONE_INTEGER);
                    line_number_var = number_utilities.f_1X(line_number_var);
                }
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_utilities.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)file_utilities.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 16594L)
    public static SubLObject do_csv_file_lines(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_utilities.$list108);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject tokenized_line = (SubLObject)file_utilities.NIL;
        SubLObject file = (SubLObject)file_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_utilities.$list108);
        tokenized_line = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_utilities.$list108);
        file = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)file_utilities.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)file_utilities.NIL;
        SubLObject current_$12 = (SubLObject)file_utilities.NIL;
        while (file_utilities.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)file_utilities.$list108);
            current_$12 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)file_utilities.$list108);
            if (file_utilities.NIL == conses_high.member(current_$12, (SubLObject)file_utilities.$list109, (SubLObject)file_utilities.UNPROVIDED, (SubLObject)file_utilities.UNPROVIDED)) {
                bad = (SubLObject)file_utilities.T;
            }
            if (current_$12 == file_utilities.$kw41$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (file_utilities.NIL != bad && file_utilities.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)file_utilities.$list108);
        }
        final SubLObject break_list_tail = cdestructuring_bind.property_list_member((SubLObject)file_utilities.$kw110$BREAK_LIST, current);
        final SubLObject break_list = (SubLObject)((file_utilities.NIL != break_list_tail) ? conses_high.cadr(break_list_tail) : file_utilities.$list111);
        final SubLObject embed_list_tail = cdestructuring_bind.property_list_member((SubLObject)file_utilities.$kw112$EMBED_LIST, current);
        final SubLObject embed_list = (SubLObject)((file_utilities.NIL != embed_list_tail) ? conses_high.cadr(embed_list_tail) : file_utilities.$list113);
        final SubLObject include_stops_tail = cdestructuring_bind.property_list_member((SubLObject)file_utilities.$kw114$INCLUDE_STOPS, current);
        final SubLObject include_stops = (SubLObject)((file_utilities.NIL != include_stops_tail) ? conses_high.cadr(include_stops_tail) : file_utilities.NIL);
        final SubLObject ignore_empty_strings_tail = cdestructuring_bind.property_list_member((SubLObject)file_utilities.$kw115$IGNORE_EMPTY_STRINGS, current);
        final SubLObject ignore_empty_strings = (SubLObject)((file_utilities.NIL != ignore_empty_strings_tail) ? conses_high.cadr(ignore_empty_strings_tail) : file_utilities.NIL);
        final SubLObject quote_chars_tail = cdestructuring_bind.property_list_member((SubLObject)file_utilities.$kw116$QUOTE_CHARS, current);
        final SubLObject quote_chars = (SubLObject)((file_utilities.NIL != quote_chars_tail) ? conses_high.cadr(quote_chars_tail) : file_utilities.$list117);
        final SubLObject body;
        current = (body = temp);
        final SubLObject line = (SubLObject)file_utilities.$sym118$LINE;
        return (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym119$DO_FILE_LINES, (SubLObject)ConsesLow.list(line, file), (SubLObject)ConsesLow.listS((SubLObject)file_utilities.$sym3$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(tokenized_line, (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym120$STRING_TOKENIZE, line, break_list, embed_list, include_stops, ignore_empty_strings, quote_chars))), ConsesLow.append(body, (SubLObject)file_utilities.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 17027L)
    public static SubLObject cdolines_tokenized(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_utilities.$list121);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject file = (SubLObject)file_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_utilities.$list121);
        file = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)file_utilities.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)file_utilities.NIL;
        SubLObject current_$13 = (SubLObject)file_utilities.NIL;
        while (file_utilities.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)file_utilities.$list121);
            current_$13 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)file_utilities.$list121);
            if (file_utilities.NIL == conses_high.member(current_$13, (SubLObject)file_utilities.$list109, (SubLObject)file_utilities.UNPROVIDED, (SubLObject)file_utilities.UNPROVIDED)) {
                bad = (SubLObject)file_utilities.T;
            }
            if (current_$13 == file_utilities.$kw41$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (file_utilities.NIL != bad && file_utilities.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)file_utilities.$list121);
        }
        final SubLObject break_list_tail = cdestructuring_bind.property_list_member((SubLObject)file_utilities.$kw110$BREAK_LIST, current);
        final SubLObject break_list = (SubLObject)((file_utilities.NIL != break_list_tail) ? conses_high.cadr(break_list_tail) : file_utilities.$list122);
        final SubLObject embed_list_tail = cdestructuring_bind.property_list_member((SubLObject)file_utilities.$kw112$EMBED_LIST, current);
        final SubLObject embed_list = (SubLObject)((file_utilities.NIL != embed_list_tail) ? conses_high.cadr(embed_list_tail) : file_utilities.NIL);
        final SubLObject include_stops_tail = cdestructuring_bind.property_list_member((SubLObject)file_utilities.$kw114$INCLUDE_STOPS, current);
        final SubLObject include_stops = (SubLObject)((file_utilities.NIL != include_stops_tail) ? conses_high.cadr(include_stops_tail) : file_utilities.NIL);
        final SubLObject ignore_empty_strings_tail = cdestructuring_bind.property_list_member((SubLObject)file_utilities.$kw115$IGNORE_EMPTY_STRINGS, current);
        final SubLObject ignore_empty_strings = (SubLObject)((file_utilities.NIL != ignore_empty_strings_tail) ? conses_high.cadr(ignore_empty_strings_tail) : file_utilities.T);
        final SubLObject quote_chars_tail = cdestructuring_bind.property_list_member((SubLObject)file_utilities.$kw116$QUOTE_CHARS, current);
        final SubLObject quote_chars = (SubLObject)((file_utilities.NIL != quote_chars_tail) ? conses_high.cadr(quote_chars_tail) : file_utilities.NIL);
        current = temp;
        SubLObject lambda_list = (SubLObject)file_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_utilities.$list121);
        lambda_list = current.first();
        final SubLObject body;
        current = (body = current.rest());
        final SubLObject line = (SubLObject)file_utilities.$sym123$LINE;
        return (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym84$CDOLINES, (SubLObject)ConsesLow.list(line, file), (SubLObject)ConsesLow.listS((SubLObject)file_utilities.$sym124$CDESTRUCTURING_BIND, lambda_list, (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym125$MAPCAR, (SubLObject)file_utilities.$list126, (SubLObject)ConsesLow.listS((SubLObject)file_utilities.$sym120$STRING_TOKENIZE, line, ConsesLow.append((SubLObject)ConsesLow.list(break_list, embed_list, include_stops, ignore_empty_strings, quote_chars), (SubLObject)file_utilities.NIL))), ConsesLow.append(body, (SubLObject)file_utilities.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 17943L)
    public static SubLObject cdolines_read(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_utilities.$list77);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)file_utilities.NIL;
        SubLObject file = (SubLObject)file_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_utilities.$list77);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_utilities.$list77);
        file = current.first();
        current = current.rest();
        final SubLObject done = (SubLObject)(current.isCons() ? current.first() : file_utilities.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)file_utilities.$list77);
        current = current.rest();
        if (file_utilities.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject line = (SubLObject)file_utilities.$sym127$LINE;
            final SubLObject line_index = (SubLObject)file_utilities.$sym128$LINE_INDEX;
            final SubLObject done_int = (SubLObject)file_utilities.$sym129$DONE_INT;
            return (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym3$CLET, (SubLObject)ConsesLow.list(done_int), (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym84$CDOLINES, (SubLObject)ConsesLow.list(line, file, done_int), (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym3$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(line_index, (SubLObject)file_utilities.$list130), reader.bq_cons(var, (SubLObject)file_utilities.$list131)), (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym132$WHILE, (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym133$_, line_index, (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym134$LENGTH, line)), (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym135$CMULTIPLE_VALUE_BIND, (SubLObject)file_utilities.$list136, (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym137$READ_FROM_STRING, line, (SubLObject)file_utilities.NIL, (SubLObject)file_utilities.NIL, line_index), (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym138$CPUSH, (SubLObject)file_utilities.$sym139$ITEM, var), (SubLObject)ConsesLow.listS((SubLObject)file_utilities.$sym140$CSETQ, line_index, (SubLObject)file_utilities.$list141))), (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym140$CSETQ, var, (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym142$NREVERSE, var)), (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym140$CSETQ, done_int, done), (SubLObject)ConsesLow.listS((SubLObject)file_utilities.$sym143$PUNLESS, done, ConsesLow.append(body, (SubLObject)file_utilities.NIL)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)file_utilities.$list77);
        return (SubLObject)file_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 18736L)
    public static SubLObject do_file_records(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_utilities.$list144);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject record = (SubLObject)file_utilities.NIL;
        SubLObject file = (SubLObject)file_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_utilities.$list144);
        record = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_utilities.$list144);
        file = current.first();
        current = current.rest();
        final SubLObject separator_test = current.isCons() ? current.first() : Symbols.symbol_function((SubLObject)file_utilities.$sym145$WHITESPACE_STRING_);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)file_utilities.$list144);
        current = current.rest();
        final SubLObject ignore_test = current.isCons() ? current.first() : Symbols.symbol_function((SubLObject)file_utilities.$sym146$FALSE);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)file_utilities.$list144);
        current = current.rest();
        if (file_utilities.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject instream = (SubLObject)file_utilities.$sym147$INSTREAM;
            final SubLObject line = (SubLObject)file_utilities.$sym148$LINE;
            return (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym13$WITH_PRIVATE_TEXT_FILE, (SubLObject)ConsesLow.listS(instream, file, (SubLObject)file_utilities.$list79), (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym44$PWHEN, (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym149$INPUT_STREAM_P, instream), (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym3$CLET, (SubLObject)ConsesLow.list(record), (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym80$CDO, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(line, (SubLObject)ConsesLow.listS((SubLObject)file_utilities.$sym150$NETWORK_READ_LINE, instream, (SubLObject)file_utilities.$list151), (SubLObject)ConsesLow.listS((SubLObject)file_utilities.$sym150$NETWORK_READ_LINE, instream, (SubLObject)file_utilities.$list151))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym83$NULL, line)), (SubLObject)ConsesLow.listS((SubLObject)file_utilities.$sym140$CSETQ, record, (SubLObject)file_utilities.$list11), (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym143$PUNLESS, (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym82$COR, (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym152$FUNCALL, ignore_test, line), (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym152$FUNCALL, separator_test, line)), (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym138$CPUSH, line, record), (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym80$CDO, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(line, (SubLObject)ConsesLow.listS((SubLObject)file_utilities.$sym150$NETWORK_READ_LINE, instream, (SubLObject)file_utilities.$list151), (SubLObject)ConsesLow.listS((SubLObject)file_utilities.$sym150$NETWORK_READ_LINE, instream, (SubLObject)file_utilities.$list151))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym82$COR, (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym83$NULL, line), (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym152$FUNCALL, separator_test, line))), (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym143$PUNLESS, (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym152$FUNCALL, ignore_test, line), (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym138$CPUSH, line, record)))), (SubLObject)ConsesLow.listS((SubLObject)file_utilities.$sym44$PWHEN, record, (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym140$CSETQ, record, (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym142$NREVERSE, record)), ConsesLow.append(body, (SubLObject)file_utilities.NIL))))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)file_utilities.$list144);
        return (SubLObject)file_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 19994L)
    public static SubLObject do_directory_contents(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_utilities.$list153);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject file_var = (SubLObject)file_utilities.NIL;
        SubLObject directory = (SubLObject)file_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_utilities.$list153);
        file_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_utilities.$list153);
        directory = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)file_utilities.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)file_utilities.NIL;
        SubLObject current_$14 = (SubLObject)file_utilities.NIL;
        while (file_utilities.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)file_utilities.$list153);
            current_$14 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)file_utilities.$list153);
            if (file_utilities.NIL == conses_high.member(current_$14, (SubLObject)file_utilities.$list154, (SubLObject)file_utilities.UNPROVIDED, (SubLObject)file_utilities.UNPROVIDED)) {
                bad = (SubLObject)file_utilities.T;
            }
            if (current_$14 == file_utilities.$kw41$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (file_utilities.NIL != bad && file_utilities.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)file_utilities.$list153);
        }
        final SubLObject include_directoryP_tail = cdestructuring_bind.property_list_member((SubLObject)file_utilities.$kw155$INCLUDE_DIRECTORY_, current);
        final SubLObject include_directoryP = (SubLObject)((file_utilities.NIL != include_directoryP_tail) ? conses_high.cadr(include_directoryP_tail) : file_utilities.T);
        final SubLObject progress_message_tail = cdestructuring_bind.property_list_member((SubLObject)file_utilities.$kw97$PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (SubLObject)((file_utilities.NIL != progress_message_tail) ? conses_high.cadr(progress_message_tail) : file_utilities.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)file_utilities.$kw88$DONE, current);
        final SubLObject done = (SubLObject)((file_utilities.NIL != done_tail) ? conses_high.cadr(done_tail) : file_utilities.NIL);
        final SubLObject sort_fn_tail = cdestructuring_bind.property_list_member((SubLObject)file_utilities.$kw156$SORT_FN, current);
        final SubLObject sort_fn = (SubLObject)((file_utilities.NIL != sort_fn_tail) ? conses_high.cadr(sort_fn_tail) : file_utilities.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject directory_contents_var = (SubLObject)file_utilities.$sym157$DIRECTORY_CONTENTS_VAR;
        final SubLObject progress_message_var = (SubLObject)file_utilities.$sym158$PROGRESS_MESSAGE_VAR;
        return (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym57$PROGN, (SubLObject)ConsesLow.listS((SubLObject)file_utilities.$sym159$CHECK_TYPE, directory, (SubLObject)file_utilities.$list160), (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym3$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(directory_contents_var, (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym161$DIRECTORY, directory, include_directoryP)), (SubLObject)ConsesLow.list(progress_message_var, progress_message), (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym162$_SILENT_PROGRESS__, (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym163$CNOT, (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym24$STRINGP, progress_message_var)))), (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym44$PWHEN, (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym164$FUNCTION_SPEC_P, sort_fn), (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym140$CSETQ, directory_contents_var, (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym165$SORT, directory_contents_var, sort_fn))), (SubLObject)ConsesLow.listS((SubLObject)file_utilities.$sym166$PROGRESS_CSOME, (SubLObject)ConsesLow.list(file_var, directory_contents_var, progress_message_var, done), ConsesLow.append(body, (SubLObject)file_utilities.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 20925L)
    public static SubLObject do_directory_subdirectories(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_utilities.$list167);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject subdirectory = (SubLObject)file_utilities.NIL;
        SubLObject directory = (SubLObject)file_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_utilities.$list167);
        subdirectory = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_utilities.$list167);
        directory = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)file_utilities.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)file_utilities.NIL;
        SubLObject current_$15 = (SubLObject)file_utilities.NIL;
        while (file_utilities.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)file_utilities.$list167);
            current_$15 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)file_utilities.$list167);
            if (file_utilities.NIL == conses_high.member(current_$15, (SubLObject)file_utilities.$list168, (SubLObject)file_utilities.UNPROVIDED, (SubLObject)file_utilities.UNPROVIDED)) {
                bad = (SubLObject)file_utilities.T;
            }
            if (current_$15 == file_utilities.$kw41$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (file_utilities.NIL != bad && file_utilities.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)file_utilities.$list167);
        }
        final SubLObject include_directoryP_tail = cdestructuring_bind.property_list_member((SubLObject)file_utilities.$kw155$INCLUDE_DIRECTORY_, current);
        final SubLObject include_directoryP = (SubLObject)((file_utilities.NIL != include_directoryP_tail) ? conses_high.cadr(include_directoryP_tail) : file_utilities.T);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym169$DO_DIRECTORY_CONTENTS, (SubLObject)ConsesLow.list(subdirectory, directory, (SubLObject)file_utilities.$kw155$INCLUDE_DIRECTORY_, include_directoryP), (SubLObject)ConsesLow.listS((SubLObject)file_utilities.$sym44$PWHEN, (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym170$DIRECTORY_P, (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym171$FCOND, (SubLObject)ConsesLow.list(include_directoryP, subdirectory), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)file_utilities.$sym172$ENDS_WITH, directory, (SubLObject)file_utilities.$list173), (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym174$CCONCATENATE, directory, subdirectory)), (SubLObject)ConsesLow.list((SubLObject)file_utilities.T, (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym174$CCONCATENATE, directory, (SubLObject)file_utilities.$str175$_, subdirectory)))), (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym143$PUNLESS, (SubLObject)ConsesLow.listS((SubLObject)file_utilities.EQL, (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym176$LAST_CHAR, subdirectory), (SubLObject)file_utilities.$list177), (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym140$CSETQ, subdirectory, (SubLObject)ConsesLow.listS((SubLObject)file_utilities.$sym174$CCONCATENATE, subdirectory, (SubLObject)file_utilities.$list173))), ConsesLow.append(body, (SubLObject)file_utilities.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 21487L)
    public static SubLObject do_directory_tree_files(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_utilities.$list178);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject file_var = (SubLObject)file_utilities.NIL;
        SubLObject directory = (SubLObject)file_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_utilities.$list178);
        file_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_utilities.$list178);
        directory = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)file_utilities.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)file_utilities.NIL;
        SubLObject current_$16 = (SubLObject)file_utilities.NIL;
        while (file_utilities.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)file_utilities.$list178);
            current_$16 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)file_utilities.$list178);
            if (file_utilities.NIL == conses_high.member(current_$16, (SubLObject)file_utilities.$list179, (SubLObject)file_utilities.UNPROVIDED, (SubLObject)file_utilities.UNPROVIDED)) {
                bad = (SubLObject)file_utilities.T;
            }
            if (current_$16 == file_utilities.$kw41$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (file_utilities.NIL != bad && file_utilities.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)file_utilities.$list178);
        }
        final SubLObject include_directoryP_tail = cdestructuring_bind.property_list_member((SubLObject)file_utilities.$kw155$INCLUDE_DIRECTORY_, current);
        final SubLObject include_directoryP = (SubLObject)((file_utilities.NIL != include_directoryP_tail) ? conses_high.cadr(include_directoryP_tail) : file_utilities.T);
        final SubLObject progress_message_tail = cdestructuring_bind.property_list_member((SubLObject)file_utilities.$kw97$PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (SubLObject)((file_utilities.NIL != progress_message_tail) ? conses_high.cadr(progress_message_tail) : file_utilities.$str180$Processing_directory_tree_files__);
        final SubLObject body;
        current = (body = temp);
        final SubLObject directory_list_var = (SubLObject)file_utilities.$sym181$DIRECTORY_LIST_VAR;
        final SubLObject current_directory_var = (SubLObject)file_utilities.$sym182$CURRENT_DIRECTORY_VAR;
        return (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym57$PROGN, (SubLObject)ConsesLow.listS((SubLObject)file_utilities.$sym159$CHECK_TYPE, directory, (SubLObject)file_utilities.$list160), (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym3$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(directory_list_var, (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym183$LIST, directory))), (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym80$CDO, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(current_directory_var, (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym184$FIRST, directory_list_var), (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym184$FIRST, directory_list_var))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym83$NULL, directory_list_var)), (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym185$CPOP, directory_list_var), (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym169$DO_DIRECTORY_CONTENTS, (SubLObject)ConsesLow.list(file_var, current_directory_var, (SubLObject)file_utilities.$kw155$INCLUDE_DIRECTORY_, include_directoryP, (SubLObject)file_utilities.$kw97$PROGRESS_MESSAGE, (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym186$FWHEN, (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym24$STRINGP, progress_message), (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym174$CCONCATENATE, progress_message, (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym187$FORMAT_NIL, (SubLObject)file_utilities.$str188$___Directory___S, current_directory_var)))), (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym9$PIF, (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym170$DIRECTORY_P, file_var), (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym138$CPUSH, file_var, directory_list_var), reader.bq_cons((SubLObject)file_utilities.$sym57$PROGN, ConsesLow.append(body, (SubLObject)file_utilities.NIL)))))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 22985L)
    public static SubLObject directory_file_count(final SubLObject directory) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert file_utilities.NIL != Filesys.directory_p(directory) : directory;
        SubLObject count = (SubLObject)file_utilities.NIL;
        if (!count.isInteger()) {
            count = (SubLObject)file_utilities.ZERO_INTEGER;
            assert file_utilities.NIL != Filesys.directory_p(directory) : directory;
            SubLObject directory_contents_var = Filesys.directory(directory, (SubLObject)file_utilities.T);
            final SubLObject progress_message_var = (SubLObject)file_utilities.NIL;
            final SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding(thread);
            try {
                utilities_macros.$silent_progressP$.bind((SubLObject)SubLObjectFactory.makeBoolean(!progress_message_var.isString()), thread);
                if (file_utilities.NIL.isFunctionSpec()) {
                    directory_contents_var = Sort.sort(directory_contents_var, (SubLObject)file_utilities.NIL, (SubLObject)file_utilities.UNPROVIDED);
                }
                final SubLObject list_var = directory_contents_var;
                final SubLObject _prev_bind_0_$17 = utilities_macros.$progress_note$.currentBinding(thread);
                final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
                final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                try {
                    utilities_macros.$progress_note$.bind((SubLObject)((file_utilities.NIL != progress_message_var) ? progress_message_var : file_utilities.$str189$cdolist), thread);
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                    utilities_macros.$progress_sofar$.bind((SubLObject)file_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_index$.bind((SubLObject)file_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)file_utilities.NIL, thread);
                    utilities_macros.$within_noting_percent_progress$.bind((SubLObject)file_utilities.T, thread);
                    utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                    try {
                        utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                        SubLObject csome_list_var = list_var;
                        SubLObject file = (SubLObject)file_utilities.NIL;
                        file = csome_list_var.first();
                        while (file_utilities.NIL != csome_list_var) {
                            count = Numbers.add(count, (SubLObject)file_utilities.ONE_INTEGER);
                            utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)file_utilities.ONE_INTEGER), thread);
                            utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                            csome_list_var = csome_list_var.rest();
                            file = csome_list_var.first();
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$18 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_utilities.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            utilities_macros.noting_percent_progress_postamble();
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$18, thread);
                        }
                    }
                }
                finally {
                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
                    utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
                    utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
                    utilities_macros.$progress_note$.rebind(_prev_bind_0_$17, thread);
                }
            }
            finally {
                utilities_macros.$silent_progressP$.rebind(_prev_bind_0, thread);
            }
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 23723L)
    public static SubLObject list_directory(final SubLObject directory, final SubLObject regexp, SubLObject include_path, SubLObject comp_options, SubLObject match_options) {
        if (include_path == file_utilities.UNPROVIDED) {
            include_path = (SubLObject)file_utilities.NIL;
        }
        if (comp_options == file_utilities.UNPROVIDED) {
            comp_options = (SubLObject)file_utilities.NIL;
        }
        if (match_options == file_utilities.UNPROVIDED) {
            match_options = (SubLObject)file_utilities.NIL;
        }
        return Mapping.mapcar((SubLObject)file_utilities.$sym190$SECOND, regular_expression_utilities.list_grep(regexp, Filesys.directory(directory, include_path), comp_options, match_options));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 24448L)
    public static SubLObject sort_files_by_date(final SubLObject file_list) {
        return Sort.sort(file_list, (SubLObject)file_utilities.$sym133$_, (SubLObject)file_utilities.$sym191$FILE_WRITE_DATE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 24694L)
    public static SubLObject slurp_file(final SubLObject path) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject string = (SubLObject)file_utilities.NIL;
        SubLObject stream = (SubLObject)file_utilities.NIL;
        try {
            stream = streams_high.make_private_string_output_stream();
            SubLObject stream_$19 = (SubLObject)file_utilities.NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)file_utilities.NIL, thread);
                    stream_$19 = compatibility.open_text(path, (SubLObject)file_utilities.$kw107$INPUT);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream_$19.isStream()) {
                    Errors.error((SubLObject)file_utilities.$str68$Unable_to_open__S, path);
                }
                final SubLObject infile = stream_$19;
                if (infile.isStream()) {
                    SubLObject line;
                    for (line = (SubLObject)file_utilities.NIL, line = cdolines_get_next_line(infile); file_utilities.NIL != line; line = cdolines_get_next_line(infile)) {
                        streams_high.write_string(line, stream, (SubLObject)file_utilities.UNPROVIDED, (SubLObject)file_utilities.UNPROVIDED);
                        streams_high.terpri(stream);
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (stream_$19.isStream()) {
                        streams_high.close(stream_$19, (SubLObject)file_utilities.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
            string = streams_high.get_output_stream_string(stream);
        }
        finally {
            final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_utilities.T, thread);
                final SubLObject _values2 = Values.getValuesAsVector();
                streams_high.close(stream, (SubLObject)file_utilities.UNPROVIDED);
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 25042L)
    public static SubLObject slurp_file_robust(final SubLObject path) {
        if (file_utilities.NIL != Filesys.probe_file(path)) {
            return slurp_file(path);
        }
        return (SubLObject)file_utilities.$str22$;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 25235L)
    public static SubLObject slurp_file_lines(final SubLObject path) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject lines = (SubLObject)file_utilities.NIL;
        SubLObject stream = (SubLObject)file_utilities.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)file_utilities.NIL, thread);
                stream = compatibility.open_text(path, (SubLObject)file_utilities.$kw107$INPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)file_utilities.$str68$Unable_to_open__S, path);
            }
            final SubLObject stream_var = stream;
            if (stream_var.isStream()) {
                final SubLObject stream_var_$20 = stream_var;
                SubLObject line_number_var = (SubLObject)file_utilities.NIL;
                SubLObject line = (SubLObject)file_utilities.NIL;
                line_number_var = (SubLObject)file_utilities.ZERO_INTEGER;
                for (line = do_stream_lines_get_next_line(stream_var_$20); file_utilities.NIL != line; line = do_stream_lines_get_next_line(stream_var_$20)) {
                    lines = (SubLObject)ConsesLow.cons(line, lines);
                    line_number_var = number_utilities.f_1X(line_number_var);
                }
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_utilities.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)file_utilities.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return Sequences.nreverse(lines);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 25528L)
    public static SubLObject file_existsP(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject existsP = (SubLObject)file_utilities.NIL;
        SubLObject ignore_errors_tag = (SubLObject)file_utilities.NIL;
        try {
            thread.throwStack.push(file_utilities.$kw65$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)file_utilities.$sym66$IGNORE_ERRORS_HANDLER), thread);
                try {
                    existsP = list_utilities.sublisp_boolean(Filesys.probe_file(filename));
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)file_utilities.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)file_utilities.$kw65$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        return existsP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 25752L)
    public static SubLObject why_not_probe_fileP(final SubLObject filename) {
        if (file_utilities.NIL != Filesys.probe_file(filename)) {
            return (SubLObject)file_utilities.NIL;
        }
        final SubLObject separator = (SubLObject)((file_utilities.NIL != string_utilities.char_position((SubLObject)Characters.CHAR_backslash, filename, (SubLObject)file_utilities.UNPROVIDED)) ? file_utilities.$str192$_ : file_utilities.$str175$_);
        SubLObject path_components = string_utilities.string_tokenize(filename, (SubLObject)file_utilities.$list193, (SubLObject)file_utilities.UNPROVIDED, (SubLObject)file_utilities.UNPROVIDED, (SubLObject)file_utilities.UNPROVIDED, (SubLObject)file_utilities.UNPROVIDED, (SubLObject)file_utilities.UNPROVIDED);
        final SubLObject absolute_pathP = Equality.eq(Strings.sublisp_char(separator, (SubLObject)file_utilities.ZERO_INTEGER), Strings.sublisp_char(filename, (SubLObject)file_utilities.ZERO_INTEGER));
        SubLObject building_path = (SubLObject)((file_utilities.NIL != absolute_pathP) ? separator : file_utilities.$str22$);
        SubLObject found_bad_pathP = (SubLObject)file_utilities.NIL;
        SubLObject error_message = (SubLObject)file_utilities.NIL;
        if (file_utilities.NIL != absolute_pathP) {
            path_components = path_components.rest();
        }
        if (file_utilities.NIL == found_bad_pathP) {
            SubLObject csome_list_var = path_components;
            SubLObject this_component = (SubLObject)file_utilities.NIL;
            this_component = csome_list_var.first();
            while (file_utilities.NIL == found_bad_pathP && file_utilities.NIL != csome_list_var) {
                building_path = Sequences.cconcatenate(building_path, this_component);
                if (file_utilities.NIL == Filesys.probe_file(building_path)) {
                    if (file_utilities.NIL != absolute_pathP || file_utilities.NIL == Filesys.probe_file((SubLObject)file_utilities.$str22$)) {
                        error_message = PrintLow.format((SubLObject)file_utilities.NIL, (SubLObject)file_utilities.$str194$Could_not_find__A, building_path);
                    }
                    else {
                        error_message = PrintLow.format((SubLObject)file_utilities.NIL, (SubLObject)file_utilities.$str195$Could_not_find__A_A, Filesys.probe_file((SubLObject)file_utilities.$str22$), building_path);
                    }
                    found_bad_pathP = (SubLObject)file_utilities.T;
                }
                building_path = Sequences.cconcatenate(building_path, separator);
                csome_list_var = csome_list_var.rest();
                this_component = csome_list_var.first();
            }
        }
        if (file_utilities.NIL == found_bad_pathP) {
            if (file_utilities.NIL != absolute_pathP) {
                error_message = (SubLObject)file_utilities.$str196$File_not_found_;
            }
            else {
                error_message = PrintLow.format((SubLObject)file_utilities.NIL, (SubLObject)file_utilities.$str197$File_not_found_from_directory__A, Filesys.probe_file((SubLObject)file_utilities.$str22$));
            }
        }
        return error_message;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 27157L)
    public static SubLObject guess_path_type(final SubLObject path) {
        if (file_utilities.NIL != string_utilities.char_position((SubLObject)Characters.CHAR_slash, path, (SubLObject)file_utilities.UNPROVIDED)) {
            return (SubLObject)file_utilities.$kw198$UNIX;
        }
        if (file_utilities.NIL != string_utilities.char_position((SubLObject)Characters.CHAR_backslash, path, (SubLObject)file_utilities.UNPROVIDED)) {
            return (SubLObject)file_utilities.$kw199$DOS;
        }
        return (SubLObject)file_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 27491L)
    public static SubLObject guess_path_type_robust(final SubLObject path) {
        final SubLObject path_type = guess_path_type(path);
        return (SubLObject)((file_utilities.NIL != path_type) ? path_type : file_utilities.$kw198$UNIX);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 28015L)
    public static SubLObject absolute_default_path_string() {
        return possibly_append_path_separator_char(format_nil.format_nil_a(Filesys.probe_file((SubLObject)file_utilities.$str23$_)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 28365L)
    public static SubLObject possibly_append_path_separator_char(final SubLObject raw_path_string) {
        final SubLObject path_type = guess_path_type_robust(raw_path_string);
        final SubLObject separator = path_separator_char(path_type);
        final SubLObject path_string = string_utilities.last_char(raw_path_string).eql(separator) ? raw_path_string : string_utilities.post_add_character_to_string(separator, raw_path_string);
        return path_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 28922L)
    public static SubLObject get_absolute_path_string(final SubLObject logical_path) {
        return normal_pathstring(logical_pathname_to_physical(logical_path));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 29213L)
    public static SubLObject absolute_pathP(final SubLObject path) {
        final SubLObject path_length = Sequences.length(path);
        if (path_length.eql((SubLObject)file_utilities.ZERO_INTEGER)) {
            return (SubLObject)file_utilities.NIL;
        }
        final SubLObject pcase_var = guess_path_type(path);
        if (pcase_var.eql((SubLObject)file_utilities.$kw198$UNIX)) {
            return Equality.eq((SubLObject)Characters.CHAR_slash, Strings.sublisp_char(path, (SubLObject)file_utilities.ZERO_INTEGER));
        }
        if (pcase_var.eql((SubLObject)file_utilities.$kw199$DOS)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(path_length.numG((SubLObject)file_utilities.TWO_INTEGER) && ((Characters.CHAR_colon.eql(Strings.sublisp_char(path, (SubLObject)file_utilities.ONE_INTEGER)) && file_utilities.NIL != Characters.alpha_char_p(Strings.sublisp_char(path, (SubLObject)file_utilities.ZERO_INTEGER))) || file_utilities.NIL != string_utilities.starts_with(path, (SubLObject)file_utilities.$str200$__)));
        }
        return (SubLObject)file_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 29879L)
    public static SubLObject path_separator_char(final SubLObject path_type) {
        final SubLObject string = path_separator_string(path_type);
        if (string.isString()) {
            return Strings.sublisp_char(string, (SubLObject)file_utilities.ZERO_INTEGER);
        }
        return (SubLObject)file_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 30537L)
    public static SubLObject path_separator_string(final SubLObject path_type) {
        if (path_type.eql((SubLObject)file_utilities.$kw198$UNIX)) {
            return (SubLObject)file_utilities.$str175$_;
        }
        if (path_type.eql((SubLObject)file_utilities.$kw199$DOS)) {
            return (SubLObject)file_utilities.$str192$_;
        }
        if (path_type.eql((SubLObject)file_utilities.$kw201$MAC)) {
            return (SubLObject)file_utilities.$str202$_;
        }
        return (SubLObject)file_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 30750L)
    public static SubLObject deconstruct_path(final SubLObject path) {
        final SubLObject path_type = guess_path_type(path);
        if (file_utilities.NIL == path_type) {
            return Values.values((SubLObject)file_utilities.NIL, path, (SubLObject)file_utilities.NIL);
        }
        SubLObject path_list = string_utilities.string_tokenize(path, (SubLObject)ConsesLow.list(path_separator_string(path_type)), (SubLObject)file_utilities.UNPROVIDED, (SubLObject)file_utilities.UNPROVIDED, (SubLObject)file_utilities.UNPROVIDED, (SubLObject)file_utilities.UNPROVIDED, (SubLObject)file_utilities.UNPROVIDED);
        SubLObject filename = (SubLObject)file_utilities.NIL;
        path_list = Sequences.nreverse(path_list);
        filename = path_list.first();
        path_list = path_list.rest();
        path_list = Sequences.nreverse(path_list);
        return Values.values(path_list, filename, path_type);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 31537L)
    public static SubLObject reconstruct_path(final SubLObject path_list, final SubLObject filename, SubLObject path_type) {
        if (path_type == file_utilities.UNPROVIDED) {
            path_type = (SubLObject)file_utilities.$kw198$UNIX;
        }
        SubLObject build_path = (SubLObject)file_utilities.NIL;
        final SubLObject path_separator_string = path_separator_string(path_type);
        SubLObject cdolist_list_var = path_list;
        SubLObject path_step = (SubLObject)file_utilities.NIL;
        path_step = cdolist_list_var.first();
        while (file_utilities.NIL != cdolist_list_var) {
            build_path = (SubLObject)ConsesLow.cons(path_step, build_path);
            build_path = (SubLObject)ConsesLow.cons(path_separator_string, build_path);
            cdolist_list_var = cdolist_list_var.rest();
            path_step = cdolist_list_var.first();
        }
        build_path = (SubLObject)ConsesLow.cons(filename, build_path);
        return Functions.apply(Symbols.symbol_function((SubLObject)file_utilities.$sym174$CCONCATENATE), Sequences.nreverse(build_path));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 32263L)
    public static SubLObject make_path_absolute_relative_to(final SubLObject absolute_path, final SubLObject path) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (file_utilities.NIL != absolute_pathP(path)) {
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
            if (file_utilities.NIL != relative_path_type) {
                return Values.values((SubLObject)file_utilities.NIL, (SubLObject)file_utilities.$str203$Path_type_mismatch_);
            }
            relative_path_type = working_path_type;
        }
        working_path = Sequences.nreverse(working_path);
        SubLObject cdolist_list_var = relative_path;
        SubLObject relative_path_step = (SubLObject)file_utilities.NIL;
        relative_path_step = cdolist_list_var.first();
        while (file_utilities.NIL != cdolist_list_var) {
            if (!relative_path_step.equal((SubLObject)file_utilities.$str23$_)) {
                if (relative_path_step.equal((SubLObject)file_utilities.$str204$__)) {
                    working_path = working_path.rest();
                }
                else {
                    working_path = (SubLObject)ConsesLow.cons(relative_path_step, working_path);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            relative_path_step = cdolist_list_var.first();
        }
        return reconstruct_path(Sequences.nreverse(working_path), relative_file, relative_path_type);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 33775L)
    public static SubLObject make_absolute_path_relative_to(final SubLObject absolute_path, final SubLObject root) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (file_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && file_utilities.NIL == absolute_pathP(absolute_path)) {
            Errors.error((SubLObject)file_utilities.$str205$Cannot_make_relative_path__A_even, absolute_path);
        }
        if (file_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && file_utilities.NIL == absolute_pathP(root)) {
            Errors.error((SubLObject)file_utilities.$str206$Cannot_strip_non_absolute_prefix_, root, absolute_path);
        }
        return string_utilities.pre_remove(absolute_path, possibly_append_path_separator_char(root), (SubLObject)file_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 34322L)
    public static SubLObject pathstring_filename(final SubLObject pathstring) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (file_utilities.NIL != Filesys.directory_p(pathstring)) {
            return (SubLObject)file_utilities.NIL;
        }
        final SubLObject physical_path = subl_promotions.ensure_physical_pathname(pathstring);
        SubLObject result = (SubLObject)file_utilities.NIL;
        thread.resetMultipleValues();
        final SubLObject directory_list = deconstruct_path(physical_path);
        final SubLObject filename = thread.secondMultipleValue();
        final SubLObject type = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        result = filename;
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 35064L)
    public static SubLObject pathstring_directory_name(final SubLObject pathstring) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject directory = partially_deconstruct_path(pathstring);
        final SubLObject filename = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return directory;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 35426L)
    public static SubLObject partially_deconstruct_path(final SubLObject pathstring) {
        final SubLObject filename = pathstring_filename(pathstring);
        final SubLObject filename_length = Sequences.length(filename);
        final SubLObject directory = string_utilities.substring(pathstring, (SubLObject)file_utilities.ZERO_INTEGER, Numbers.subtract(Sequences.length(pathstring), filename_length));
        return Values.values(directory, filename);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 35706L)
    public static SubLObject ensure_unique_filename(SubLObject pathstring, SubLObject suffix) {
        if (suffix == file_utilities.UNPROVIDED) {
            suffix = (SubLObject)file_utilities.$str22$;
        }
        for (SubLObject counter = (SubLObject)file_utilities.ZERO_INTEGER, base_path = string_utilities.post_remove(pathstring, suffix, Symbols.symbol_function((SubLObject)file_utilities.EQUAL)); file_utilities.NIL != file_existsP(pathstring); pathstring = Sequences.cconcatenate(format_nil.format_nil_a_no_copy(base_path), new SubLObject[] { file_utilities.$str207$_, format_nil.format_nil_a_no_copy(counter), format_nil.format_nil_a_no_copy(suffix) }), counter = Numbers.add(counter, (SubLObject)file_utilities.ONE_INTEGER)) {}
        return pathstring;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 36448L)
    public static SubLObject read_text_file(final SubLObject file_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (file_utilities.NIL == string_utilities.non_empty_stringP(file_name) || file_utilities.NIL == Filesys.probe_file(file_name)) {
            PrintLow.format(StreamsLow.$trace_output$.getDynamicValue(thread), (SubLObject)file_utilities.$str208$Warning__unable_to_read_file__s__, file_name);
            return (SubLObject)file_utilities.NIL;
        }
        SubLObject result = (SubLObject)file_utilities.NIL;
        SubLObject stream = (SubLObject)file_utilities.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)file_utilities.NIL, thread);
                stream = compatibility.open_text(file_name, (SubLObject)file_utilities.$kw107$INPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)file_utilities.$str68$Unable_to_open__S, file_name);
            }
            SubLObject in;
            SubLObject line;
            for (in = stream, line = (SubLObject)file_utilities.NIL, line = string_utilities.network_read_line(in, (SubLObject)file_utilities.NIL, (SubLObject)file_utilities.UNPROVIDED, (SubLObject)file_utilities.UNPROVIDED); line != file_utilities.$kw18$EOF && file_utilities.NIL != line; line = string_utilities.network_read_line(in, (SubLObject)file_utilities.NIL, (SubLObject)file_utilities.UNPROVIDED, (SubLObject)file_utilities.UNPROVIDED)) {
                result = (SubLObject)ConsesLow.cons(line, result);
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_utilities.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)file_utilities.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return Sequences.reverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 37281L)
    public static SubLObject output_text_file(final SubLObject file_name, final SubLObject lines, SubLObject output_mode) {
        if (output_mode == file_utilities.UNPROVIDED) {
            output_mode = (SubLObject)file_utilities.$kw67$OUTPUT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stream = (SubLObject)file_utilities.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)file_utilities.NIL, thread);
                stream = compatibility.open_text(file_name, output_mode);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)file_utilities.$str68$Unable_to_open__S, file_name);
            }
            final SubLObject out = stream;
            SubLObject cdolist_list_var = lines;
            SubLObject line = (SubLObject)file_utilities.NIL;
            line = cdolist_list_var.first();
            while (file_utilities.NIL != cdolist_list_var) {
                streams_high.write_string(line, out, (SubLObject)file_utilities.UNPROVIDED, (SubLObject)file_utilities.UNPROVIDED);
                streams_high.terpri(out);
                cdolist_list_var = cdolist_list_var.rest();
                line = cdolist_list_var.first();
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_utilities.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)file_utilities.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return (SubLObject)file_utilities.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 37587L)
    public static SubLObject write_text_file(final SubLObject file_name, final SubLObject lines) {
        return output_text_file(file_name, lines, (SubLObject)file_utilities.$kw67$OUTPUT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 37859L)
    public static SubLObject append_text_file(final SubLObject file_name, final SubLObject lines) {
        return output_text_file(file_name, lines, (SubLObject)file_utilities.$kw76$APPEND);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 38227L)
    public static SubLObject truncate_file(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stream = (SubLObject)file_utilities.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)file_utilities.NIL, thread);
                stream = compatibility.open_binary(filename, (SubLObject)file_utilities.$kw67$OUTPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)file_utilities.$str68$Unable_to_open__S, filename);
            }
            final SubLObject s = stream;
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_utilities.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)file_utilities.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return filename;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 38437L)
    public static SubLObject empty_file_p(final SubLObject filename) {
        if (file_utilities.NIL != Filesys.probe_file(filename)) {
            SubLObject size = (SubLObject)file_utilities.NIL;
            final SubLObject stream = compatibility.open_binary(filename, (SubLObject)file_utilities.$kw107$INPUT);
            size = streams_high.file_length(stream);
            streams_high.close(stream, (SubLObject)file_utilities.UNPROVIDED);
            return Numbers.zerop(size);
        }
        return (SubLObject)file_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 38732L)
    public static SubLObject ensure_directories_exist(final SubLObject filepath) {
        return make_directory_recursive(pathstring_directory_name(filepath), (SubLObject)file_utilities.UNPROVIDED, (SubLObject)file_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 38949L)
    public static SubLObject make_directory_recursive(final SubLObject directory_path, SubLObject forceP, SubLObject permissions) {
        if (forceP == file_utilities.UNPROVIDED) {
            forceP = (SubLObject)file_utilities.NIL;
        }
        if (permissions == file_utilities.UNPROVIDED) {
            permissions = (SubLObject)file_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (file_utilities.NIL != permissions && !file_utilities.assertionsDisabledSynth && file_utilities.NIL == Types.stringp(permissions)) {
            throw new AssertionError(permissions);
        }
        assert file_utilities.NIL != Types.stringp(directory_path) : directory_path;
        final SubLObject physical_path = subl_promotions.ensure_physical_pathname(directory_path);
        SubLObject path_list_so_far = (SubLObject)file_utilities.NIL;
        SubLObject path_type = (SubLObject)file_utilities.NIL;
        SubLObject chmod_list = (SubLObject)file_utilities.NIL;
        SubLObject error = (SubLObject)file_utilities.NIL;
        thread.resetMultipleValues();
        SubLObject directories = deconstruct_path(physical_path);
        final SubLObject last_directory = thread.secondMultipleValue();
        final SubLObject pt = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        path_type = pt;
        SubLObject cdolist_list_var;
        directories = (cdolist_list_var = list_utilities.nadd_to_end(last_directory, directories));
        SubLObject each_directory = (SubLObject)file_utilities.NIL;
        each_directory = cdolist_list_var.first();
        while (file_utilities.NIL != cdolist_list_var) {
            final SubLObject each_directory_path = reconstruct_path(path_list_so_far, each_directory, path_type);
            path_list_so_far = list_utilities.nadd_to_end(each_directory, path_list_so_far);
            if (file_utilities.NIL == Filesys.directory_p(each_directory_path) && (path_type != file_utilities.$kw199$DOS || file_utilities.NIL == string_utilities.ends_with(each_directory_path, (SubLObject)file_utilities.$str202$_, (SubLObject)file_utilities.UNPROVIDED))) {
                if (file_utilities.NIL != Filesys.probe_file(each_directory_path)) {
                    if (file_utilities.NIL != forceP) {
                        Filesys.delete_file(each_directory_path);
                    }
                    else {
                        Errors.error((SubLObject)file_utilities.$str209$make_directory_recursive__could_n, each_directory_path);
                    }
                }
                Filesys.make_directory(each_directory_path, (SubLObject)file_utilities.UNPROVIDED, (SubLObject)file_utilities.UNPROVIDED);
                chmod_list = (SubLObject)ConsesLow.cons(each_directory_path, chmod_list);
            }
            cdolist_list_var = cdolist_list_var.rest();
            each_directory = cdolist_list_var.first();
        }
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)file_utilities.$sym19$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    if (file_utilities.NIL != permissions) {
                        SubLObject cdolist_list_var2 = chmod_list;
                        SubLObject chmod_directory = (SubLObject)file_utilities.NIL;
                        chmod_directory = cdolist_list_var2.first();
                        while (file_utilities.NIL != cdolist_list_var2) {
                            chmod(chmod_directory, permissions);
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            chmod_directory = cdolist_list_var2.first();
                        }
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)file_utilities.NIL);
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
        if (file_utilities.NIL != error) {
            Errors.warn((SubLObject)file_utilities.$str210$Able_to_create_directory__A__but_, directory_path);
        }
        return Filesys.probe_file(reconstruct_path(conses_high.butlast(path_list_so_far, (SubLObject)file_utilities.UNPROVIDED), conses_high.last(path_list_so_far, (SubLObject)file_utilities.UNPROVIDED).first(), path_type));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 41286L)
    public static SubLObject logical_pathname_to_physical(final SubLObject pathname) {
        return subl_promotions.ensure_physical_pathname(pathname);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 42493L)
    public static SubLObject recursive_delete_directory(final SubLObject path) {
        if (file_utilities.NIL == Filesys.directory_p(path)) {
            return (SubLObject)file_utilities.NIL;
        }
        SubLObject cdolist_list_var;
        final SubLObject children = cdolist_list_var = Filesys.directory(path, (SubLObject)file_utilities.UNPROVIDED);
        SubLObject child = (SubLObject)file_utilities.NIL;
        child = cdolist_list_var.first();
        while (file_utilities.NIL != cdolist_list_var) {
            final SubLObject child_path = Sequences.cconcatenate(path, new SubLObject[] { file_utilities.$str175$_, child });
            if (file_utilities.NIL != Filesys.directory_p(child_path)) {
                recursive_delete_directory(child_path);
            }
            else {
                Filesys.delete_file(child_path);
            }
            cdolist_list_var = cdolist_list_var.rest();
            child = cdolist_list_var.first();
        }
        return Filesys.delete_directory(path, (SubLObject)file_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 42943L)
    public static SubLObject recursive_copy_directory(final SubLObject old, final SubLObject v_new) {
        if (file_utilities.NIL == Filesys.directory_p(old)) {
            return (SubLObject)file_utilities.NIL;
        }
        Filesys.make_directory(v_new, (SubLObject)file_utilities.UNPROVIDED, (SubLObject)file_utilities.UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject children = cdolist_list_var = Filesys.directory(old, (SubLObject)file_utilities.UNPROVIDED);
        SubLObject child = (SubLObject)file_utilities.NIL;
        child = cdolist_list_var.first();
        while (file_utilities.NIL != cdolist_list_var) {
            final SubLObject old_child_path = Sequences.cconcatenate(old, new SubLObject[] { file_utilities.$str175$_, child });
            final SubLObject new_child_path = Sequences.cconcatenate(v_new, new SubLObject[] { file_utilities.$str175$_, child });
            if (file_utilities.NIL != Filesys.directory_p(old_child_path)) {
                recursive_copy_directory(old_child_path, new_child_path);
            }
            else {
                Filesys.copy_file(old_child_path, new_child_path);
            }
            cdolist_list_var = cdolist_list_var.rest();
            child = cdolist_list_var.first();
        }
        return (SubLObject)file_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 43522L)
    public static SubLObject chmod(final SubLObject pathname, final SubLObject permissions_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (file_utilities.NIL == Processes.external_processes_supportedP()) {
            return (SubLObject)file_utilities.NIL;
        }
        return os_process_utilities.system_eval_using_make_os_process_successfulP((SubLObject)file_utilities.$str211$chmod, (SubLObject)ConsesLow.list(permissions_string, pathname), (SubLObject)file_utilities.ZERO_INTEGER, StreamsLow.$null_input$.getDynamicValue(thread), StreamsLow.$null_output$.getDynamicValue(thread), (SubLObject)file_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 44006L)
    public static SubLObject delete_file_via_os(final SubLObject filename) {
        assert file_utilities.NIL != Types.stringp(filename) : filename;
        return Filesys.delete_file(filename);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 44401L)
    public static SubLObject create_symbolic_link(final SubLObject link_file, final SubLObject target_file) {
        assert file_utilities.NIL != Types.stringp(target_file) : target_file;
        assert file_utilities.NIL != Types.stringp(link_file) : link_file;
        if (file_utilities.NIL != Processes.external_processes_supportedP()) {
            return os_process_utilities.system_eval_using_make_os_process_successfulP((SubLObject)file_utilities.$str212$ln, (SubLObject)ConsesLow.list((SubLObject)file_utilities.$str213$_s, target_file, link_file), (SubLObject)file_utilities.UNPROVIDED, (SubLObject)file_utilities.UNPROVIDED, (SubLObject)file_utilities.UNPROVIDED, (SubLObject)file_utilities.UNPROVIDED);
        }
        return (SubLObject)file_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 44990L)
    public static SubLObject link_or_copy_file(final SubLObject old, final SubLObject v_new) {
        return (SubLObject)SubLObjectFactory.makeBoolean(file_utilities.NIL != create_symbolic_link(v_new, old) || file_utilities.NIL != Filesys.copy_file(old, v_new));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 45253L)
    public static SubLObject move_file(final SubLObject old, final SubLObject v_new) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject successP = (SubLObject)file_utilities.T;
        SubLObject error = (SubLObject)file_utilities.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)file_utilities.$sym19$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    successP = Filesys.copy_file(old, v_new);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)file_utilities.NIL);
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
        if (file_utilities.NIL != successP && file_utilities.NIL == error) {
            try {
                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind((SubLObject)file_utilities.$sym19$CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        successP = Filesys.delete_file(old);
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)file_utilities.NIL);
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
        }
        if (file_utilities.NIL != error) {
            successP = (SubLObject)file_utilities.NIL;
        }
        return Values.values(successP, error);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 45608L)
    public static SubLObject get_file_length(final SubLObject pathname) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)file_utilities.ZERO_INTEGER;
        if (pathname.isString() && file_utilities.NIL != Filesys.probe_file(pathname)) {
            SubLObject stream = (SubLObject)file_utilities.NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)file_utilities.NIL, thread);
                    stream = compatibility.open_binary(pathname, (SubLObject)file_utilities.$kw107$INPUT);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error((SubLObject)file_utilities.$str68$Unable_to_open__S, pathname);
                }
                final SubLObject stream_$21 = stream;
                ans = streams_high.file_length(stream_$21);
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (stream.isStream()) {
                        streams_high.close(stream, (SubLObject)file_utilities.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 45890L)
    public static SubLObject copy_file_checked(final SubLObject old, final SubLObject v_new) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject expected = get_file_length(old);
        final SubLObject result = Filesys.copy_file(old, v_new);
        final SubLObject actual = get_file_length(v_new);
        if (file_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !expected.numE(actual)) {
            Errors.error((SubLObject)file_utilities.$str214$Copy_of__A_to__A_failed___A_has__, new SubLObject[] { old, v_new, old, expected, v_new, actual });
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 46305L)
    public static SubLObject get_file_lines(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)file_utilities.NIL;
        SubLObject stream = (SubLObject)file_utilities.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)file_utilities.NIL, thread);
                stream = compatibility.open_text(filename, (SubLObject)file_utilities.$kw107$INPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)file_utilities.$str68$Unable_to_open__S, filename);
            }
            final SubLObject infile = stream;
            if (infile.isStream()) {
                SubLObject line;
                for (line = (SubLObject)file_utilities.NIL, line = cdolines_get_next_line(infile); file_utilities.NIL != line; line = cdolines_get_next_line(infile)) {
                    result = (SubLObject)ConsesLow.cons(line, result);
                }
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_utilities.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)file_utilities.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 46533L)
    public static SubLObject get_stream_forms(final SubLObject stream) {
        SubLObject result = (SubLObject)file_utilities.NIL;
        SubLObject doneP = (SubLObject)file_utilities.NIL;
        while (file_utilities.NIL == doneP) {
            final SubLObject form = reader.read(stream, (SubLObject)file_utilities.NIL, (SubLObject)file_utilities.$kw18$EOF, (SubLObject)file_utilities.UNPROVIDED);
            if (form == file_utilities.$kw18$EOF) {
                doneP = (SubLObject)file_utilities.T;
            }
            else {
                result = (SubLObject)ConsesLow.cons(form, result);
            }
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 46850L)
    public static SubLObject get_file_forms(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)file_utilities.NIL;
        SubLObject stream = (SubLObject)file_utilities.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)file_utilities.NIL, thread);
                stream = compatibility.open_text(filename, (SubLObject)file_utilities.$kw107$INPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)file_utilities.$str68$Unable_to_open__S, filename);
            }
            final SubLObject stream_$22 = stream;
            result = get_stream_forms(stream_$22);
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_utilities.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)file_utilities.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 47096L)
    public static SubLObject get_file_line_count(final SubLObject pathname) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)file_utilities.ZERO_INTEGER;
        if (pathname.isString() && file_utilities.NIL != Filesys.probe_file(pathname)) {
            SubLObject stream = (SubLObject)file_utilities.NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)file_utilities.NIL, thread);
                    stream = compatibility.open_text(pathname, (SubLObject)file_utilities.$kw107$INPUT);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error((SubLObject)file_utilities.$str68$Unable_to_open__S, pathname);
                }
                final SubLObject infile = stream;
                if (infile.isStream()) {
                    SubLObject line;
                    for (line = (SubLObject)file_utilities.NIL, line = cdolines_get_next_line(infile); file_utilities.NIL != line; line = cdolines_get_next_line(infile)) {
                        ans = Numbers.add(ans, (SubLObject)file_utilities.ONE_INTEGER);
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (stream.isStream()) {
                        streams_high.close(stream, (SubLObject)file_utilities.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 47364L)
    public static SubLObject load_file_catching_error(final SubLObject pathname) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject error = (SubLObject)file_utilities.NIL;
        SubLObject success = (SubLObject)file_utilities.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)file_utilities.$sym19$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    Eval.load(pathname);
                    success = (SubLObject)file_utilities.T;
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)file_utilities.NIL);
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
        return Values.values(success, error);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 47833L)
    public static SubLObject normal_pathstring(final SubLObject pathstring) {
        final SubLObject pathstring_crtl = Filesys.probe_file(pathstring);
        if (file_utilities.NIL != pathstring_crtl) {
            return pathstring_crtl;
        }
        return pathstring;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 48243L)
    public static SubLObject possibly_update_keepalive_file(final SubLObject keepalive_filename) {
        if (file_utilities.NIL != keepalive_filename) {
            return update_keepalive_file(keepalive_filename);
        }
        return (SubLObject)file_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 48394L)
    public static SubLObject update_keepalive_file(final SubLObject keepalive_filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stream = (SubLObject)file_utilities.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)file_utilities.NIL, thread);
                stream = compatibility.open_text(keepalive_filename, (SubLObject)file_utilities.$kw67$OUTPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)file_utilities.$str68$Unable_to_open__S, keepalive_filename);
            }
            final SubLObject stream_$23 = stream;
            PrintLow.format(stream_$23, (SubLObject)file_utilities.$str215$I_m_alive___);
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_utilities.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)file_utilities.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return keepalive_filename;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 48579L)
    public static SubLObject make_directory_or_error(final SubLObject directory_name, SubLObject path) {
        if (path == file_utilities.UNPROVIDED) {
            path = (SubLObject)file_utilities.NIL;
        }
        return make_directory_or_possibly_error(directory_name, path, (SubLObject)file_utilities.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 48733L)
    public static SubLObject make_directory_or_possibly_error(final SubLObject directory_name, SubLObject path, SubLObject errorP) {
        if (path == file_utilities.UNPROVIDED) {
            path = (SubLObject)file_utilities.NIL;
        }
        if (errorP == file_utilities.UNPROVIDED) {
            errorP = (SubLObject)file_utilities.NIL;
        }
        final SubLObject result = Filesys.make_directory(directory_name, path, (SubLObject)file_utilities.UNPROVIDED);
        if (file_utilities.NIL != errorP && file_utilities.NIL == result) {
            Errors.error((SubLObject)file_utilities.$str216$Could_not_make_directory__a_with_, directory_name, path);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 49032L)
    public static SubLObject make_timestamp_subdirectory(final SubLObject pathname) {
        return make_directory_or_error(timestamp_subdirectory(pathname), (SubLObject)file_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 49294L)
    public static SubLObject timestamp_subdirectory(SubLObject pathname) {
        pathname = possibly_append_path_separator_char(pathname);
        final SubLObject dir_name = numeric_date_utilities.timestamp((SubLObject)file_utilities.UNPROVIDED, (SubLObject)file_utilities.UNPROVIDED);
        final SubLObject full_pathname = Sequences.cconcatenate(pathname, dir_name);
        return possibly_append_path_separator_char(full_pathname);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 49671L)
    public static SubLObject prepare_to_possibly_overwrite_file(final SubLObject filename, SubLObject overwriteP) {
        if (overwriteP == file_utilities.UNPROVIDED) {
            overwriteP = (SubLObject)file_utilities.T;
        }
        assert file_utilities.NIL != Types.stringp(filename) : filename;
        if (file_utilities.NIL != file_existsP(filename)) {
            if (file_utilities.NIL != overwriteP) {
                Filesys.delete_file(filename);
                return filename;
            }
            Errors.error((SubLObject)file_utilities.$str217$File_already_exists___A__, filename);
        }
        return make_directory_recursive(partially_deconstruct_path(filename), overwriteP, (SubLObject)file_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 50337L)
    public static SubLObject new_file_accumulator(final SubLObject path, SubLObject mode, SubLObject write_fn) {
        if (mode == file_utilities.UNPROVIDED) {
            mode = (SubLObject)file_utilities.$kw32$TEXT;
        }
        if (write_fn == file_utilities.UNPROVIDED) {
            write_fn = (SubLObject)file_utilities.$sym218$PRINT;
        }
        assert file_utilities.NIL != Types.function_spec_p(write_fn) : write_fn;
        final SubLObject open_method = (SubLObject)((file_utilities.$kw32$TEXT == mode) ? file_utilities.$sym219$OPEN_TEXT : file_utilities.$sym220$OPEN_BINARY);
        final SubLObject stream = Functions.funcall(open_method, path, (SubLObject)file_utilities.$kw67$OUTPUT);
        if (file_utilities.NIL == streams_high.open_stream_p(stream) || file_utilities.NIL == streams_high.output_stream_p(stream)) {
            Errors.error((SubLObject)file_utilities.$str221$Cannot_open__A_for_writing___, path);
        }
        final SubLObject state = make_file_accumulator_state(stream, write_fn);
        return accumulation.new_accumulator(state, (SubLObject)file_utilities.$sym222$FILE_ACCUMULATOR_RESET, (SubLObject)file_utilities.$sym223$FILE_ACCUMULATOR_ADD, (SubLObject)file_utilities.$sym224$FILE_ACCUMULATOR_SIZE, (SubLObject)file_utilities.$sym225$FILE_ACCUMULATOR_CONTENTS, (SubLObject)file_utilities.$sym226$FILE_ACCUMULATOR_ITERATOR, (SubLObject)file_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 51310L)
    public static SubLObject close_file_accumulator(final SubLObject acc) {
        file_accumulator_release_resources(accumulation.accumulation_peek_state(acc));
        return acc;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 51622L)
    public static SubLObject make_file_accumulator_state(final SubLObject stream, final SubLObject write_fn) {
        final SubLObject function_spec = write_fn.isSymbol() ? Symbols.symbol_function(write_fn) : write_fn;
        return (SubLObject)ConsesLow.list((SubLObject)file_utilities.$kw227$STREAM, stream, (SubLObject)file_utilities.$kw228$WRITER, function_spec, (SubLObject)file_utilities.$kw229$ITEM_COUNT, (SubLObject)file_utilities.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 51903L)
    public static SubLObject with_file_accumulator_state(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_utilities.$list230);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject state = (SubLObject)file_utilities.NIL;
        SubLObject stream = (SubLObject)file_utilities.NIL;
        SubLObject writer = (SubLObject)file_utilities.NIL;
        SubLObject item_count = (SubLObject)file_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_utilities.$list230);
        state = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_utilities.$list230);
        stream = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_utilities.$list230);
        writer = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_utilities.$list230);
        item_count = current.first();
        current = current.rest();
        if (file_utilities.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)file_utilities.$sym124$CDESTRUCTURING_BIND, (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym231$_KEY, stream, writer, item_count), state, ConsesLow.append(body, (SubLObject)file_utilities.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)file_utilities.$list230);
        return (SubLObject)file_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 52100L)
    public static SubLObject file_accumulator_state_set_item_count(final SubLObject state, final SubLObject count) {
        return conses_high.putf(state, (SubLObject)file_utilities.$kw229$ITEM_COUNT, count);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 52210L)
    public static SubLObject file_accumulator_state_reset_item_count(final SubLObject state) {
        return file_accumulator_state_set_item_count(state, (SubLObject)file_utilities.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 52333L)
    public static SubLObject file_accumulator_state_get_stream(final SubLObject state) {
        return conses_high.getf(state, (SubLObject)file_utilities.$kw227$STREAM, (SubLObject)file_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 52423L)
    public static SubLObject file_accumulator_reset(final SubLObject state) {
        final SubLObject stream = file_accumulator_state_get_stream(state);
        streams_high.file_position(stream, (SubLObject)file_utilities.ZERO_INTEGER);
        return file_accumulator_state_reset_item_count(state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 52620L)
    public static SubLObject file_accumulator_add(final SubLObject state, final SubLObject element) {
        SubLObject allow_other_keys_p = (SubLObject)file_utilities.NIL;
        SubLObject rest = state;
        SubLObject bad = (SubLObject)file_utilities.NIL;
        SubLObject current_$24 = (SubLObject)file_utilities.NIL;
        while (file_utilities.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, state, (SubLObject)file_utilities.$list232);
            current_$24 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, state, (SubLObject)file_utilities.$list232);
            if (file_utilities.NIL == conses_high.member(current_$24, (SubLObject)file_utilities.$list233, (SubLObject)file_utilities.UNPROVIDED, (SubLObject)file_utilities.UNPROVIDED)) {
                bad = (SubLObject)file_utilities.T;
            }
            if (current_$24 == file_utilities.$kw41$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (file_utilities.NIL != bad && file_utilities.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)file_utilities.$list232);
        }
        final SubLObject stream_tail = cdestructuring_bind.property_list_member((SubLObject)file_utilities.$kw227$STREAM, state);
        final SubLObject stream = (SubLObject)((file_utilities.NIL != stream_tail) ? conses_high.cadr(stream_tail) : file_utilities.NIL);
        final SubLObject writer_tail = cdestructuring_bind.property_list_member((SubLObject)file_utilities.$kw228$WRITER, state);
        final SubLObject writer = (SubLObject)((file_utilities.NIL != writer_tail) ? conses_high.cadr(writer_tail) : file_utilities.NIL);
        final SubLObject item_count_tail = cdestructuring_bind.property_list_member((SubLObject)file_utilities.$kw229$ITEM_COUNT, state);
        final SubLObject item_count = (SubLObject)((file_utilities.NIL != item_count_tail) ? conses_high.cadr(item_count_tail) : file_utilities.NIL);
        Functions.funcall(writer, element, stream);
        return file_accumulator_state_set_item_count(state, Numbers.add(item_count, (SubLObject)file_utilities.ONE_INTEGER));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 52850L)
    public static SubLObject file_accumulator_size(final SubLObject state) {
        SubLObject allow_other_keys_p = (SubLObject)file_utilities.NIL;
        SubLObject rest = state;
        SubLObject bad = (SubLObject)file_utilities.NIL;
        SubLObject current_$25 = (SubLObject)file_utilities.NIL;
        while (file_utilities.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, state, (SubLObject)file_utilities.$list232);
            current_$25 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, state, (SubLObject)file_utilities.$list232);
            if (file_utilities.NIL == conses_high.member(current_$25, (SubLObject)file_utilities.$list233, (SubLObject)file_utilities.UNPROVIDED, (SubLObject)file_utilities.UNPROVIDED)) {
                bad = (SubLObject)file_utilities.T;
            }
            if (current_$25 == file_utilities.$kw41$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (file_utilities.NIL != bad && file_utilities.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)file_utilities.$list232);
        }
        final SubLObject stream_tail = cdestructuring_bind.property_list_member((SubLObject)file_utilities.$kw227$STREAM, state);
        final SubLObject stream = (SubLObject)((file_utilities.NIL != stream_tail) ? conses_high.cadr(stream_tail) : file_utilities.NIL);
        final SubLObject writer_tail = cdestructuring_bind.property_list_member((SubLObject)file_utilities.$kw228$WRITER, state);
        final SubLObject writer = (SubLObject)((file_utilities.NIL != writer_tail) ? conses_high.cadr(writer_tail) : file_utilities.NIL);
        final SubLObject item_count_tail = cdestructuring_bind.property_list_member((SubLObject)file_utilities.$kw229$ITEM_COUNT, state);
        final SubLObject item_count = (SubLObject)((file_utilities.NIL != item_count_tail) ? conses_high.cadr(item_count_tail) : file_utilities.NIL);
        return item_count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 53012L)
    public static SubLObject file_accumulator_contents(final SubLObject state, final SubLObject reset_p) {
        return Errors.error((SubLObject)file_utilities.$str234$Operation_not_supported_for_file_, state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 53165L)
    public static SubLObject file_accumulator_iterator(final SubLObject state) {
        return Errors.error((SubLObject)file_utilities.$str235$Operation_not_yet_supported_for_f, state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 53294L)
    public static SubLObject file_accumulator_release_resources(final SubLObject state) {
        final SubLObject stream = file_accumulator_state_get_stream(state);
        streams_high.close(stream, (SubLObject)file_utilities.UNPROVIDED);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 53451L)
    public static SubLObject copy_binary_data_to_hex_stream(final SubLObject in_stream, final SubLObject hex_stream, final SubLObject start, SubLObject end) {
        if (end == file_utilities.UNPROVIDED) {
            end = streams_high.file_length(in_stream);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject curr = start;
        compatibility.set_file_position(in_stream, start);
        while (curr.numL(end)) {
            final SubLObject v_byte = streams_high.read_byte(in_stream, (SubLObject)file_utilities.NIL, (SubLObject)file_utilities.$kw18$EOF);
            if (v_byte.isFixnum()) {
                thread.resetMultipleValues();
                final SubLObject high_char = vector_utilities.byte_to_hex_chars(v_byte);
                final SubLObject low_char = thread.secondMultipleValue();
                thread.resetMultipleValues();
                print_high.princ(high_char, hex_stream);
                print_high.princ(low_char, hex_stream);
            }
            curr = Numbers.add(curr, (SubLObject)file_utilities.ONE_INTEGER);
        }
        return hex_stream;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 54221L)
    public static SubLObject get_binary_data_from_stream(final SubLObject stream, final SubLObject start, SubLObject end) {
        if (end == file_utilities.UNPROVIDED) {
            end = streams_high.file_length(stream);
        }
        SubLObject hex_string = (SubLObject)file_utilities.NIL;
        SubLObject s = (SubLObject)file_utilities.NIL;
        try {
            s = streams_high.make_private_string_output_stream();
            copy_binary_data_to_hex_stream(stream, s, start, end);
            hex_string = streams_high.get_output_stream_string(s);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)file_utilities.T);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(s, (SubLObject)file_utilities.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return hex_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 54836L)
    public static SubLObject test_get_binary_data_from_stream(final SubLObject objects) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject file = make_temp_filename(file_utilities.$temp_directory$.getGlobalValue());
        SubLObject encoding = (SubLObject)file_utilities.NIL;
        try {
            SubLObject stream = (SubLObject)file_utilities.NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)file_utilities.NIL, thread);
                    stream = compatibility.open_binary(file, (SubLObject)file_utilities.$kw67$OUTPUT);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error((SubLObject)file_utilities.$str68$Unable_to_open__S, file);
                }
                final SubLObject bin_s = stream;
                final SubLObject encoding_s = cfasl.new_cfasl_encoding_stream();
                try {
                    SubLObject cdolist_list_var = objects;
                    SubLObject v_object = (SubLObject)file_utilities.NIL;
                    v_object = cdolist_list_var.first();
                    while (file_utilities.NIL != cdolist_list_var) {
                        cfasl.cfasl_output(v_object, encoding_s);
                        cfasl.cfasl_output(v_object, bin_s);
                        cdolist_list_var = cdolist_list_var.rest();
                        v_object = cdolist_list_var.first();
                    }
                    encoding = cfasl.cfasl_encoding_string_stream_encoding(encoding_s);
                }
                finally {
                    final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_utilities.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        cfasl.close_cfasl_encoding_stream(encoding_s);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_utilities.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    if (stream.isStream()) {
                        streams_high.close(stream, (SubLObject)file_utilities.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                }
            }
            SubLObject stream_$26 = (SubLObject)file_utilities.NIL;
            try {
                final SubLObject _prev_bind_4 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)file_utilities.NIL, thread);
                    stream_$26 = compatibility.open_binary(file, (SubLObject)file_utilities.$kw107$INPUT);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_4, thread);
                }
                if (!stream_$26.isStream()) {
                    Errors.error((SubLObject)file_utilities.$str68$Unable_to_open__S, file);
                }
                final SubLObject bin_s2 = stream_$26;
                final SubLObject byte_length = Numbers.integerDivide(Sequences.length(encoding), (SubLObject)file_utilities.TWO_INTEGER);
                SubLObject times;
                SubLObject offset;
                SubLObject start;
                SubLObject end;
                SubLObject actual;
                SubLObject string_start;
                SubLObject string_end;
                SubLObject sub_encoding;
                for (times = Numbers.max((SubLObject)file_utilities.ONE_INTEGER, Numbers.integerDivide(byte_length, (SubLObject)file_utilities.THREE_INTEGER)), offset = (SubLObject)file_utilities.NIL, offset = (SubLObject)file_utilities.ZERO_INTEGER; offset.numL(times); offset = Numbers.add(offset, (SubLObject)file_utilities.ONE_INTEGER)) {
                    start = offset;
                    end = Numbers.subtract(byte_length, offset);
                    actual = get_binary_data_from_stream(bin_s2, start, end);
                    string_start = Numbers.multiply(start, (SubLObject)file_utilities.TWO_INTEGER);
                    string_end = Numbers.multiply(end, (SubLObject)file_utilities.TWO_INTEGER);
                    sub_encoding = string_utilities.substring(encoding, string_start, string_end);
                    if (file_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && file_utilities.NIL == Strings.string_equal(actual, sub_encoding, (SubLObject)file_utilities.UNPROVIDED, (SubLObject)file_utilities.UNPROVIDED, (SubLObject)file_utilities.UNPROVIDED, (SubLObject)file_utilities.UNPROVIDED)) {
                        Errors.error((SubLObject)file_utilities.$str244$Expected__S__which_is___A__A__of_, new SubLObject[] { sub_encoding, start, end, encoding, actual });
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_utilities.T, thread);
                    final SubLObject _values3 = Values.getValuesAsVector();
                    if (stream_$26.isStream()) {
                        streams_high.close(stream_$26, (SubLObject)file_utilities.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values3);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
                }
            }
        }
        finally {
            final SubLObject _prev_bind_6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_utilities.T, thread);
                final SubLObject _values4 = Values.getValuesAsVector();
                SubLObject ignore_errors_tag = (SubLObject)file_utilities.NIL;
                try {
                    thread.throwStack.push(file_utilities.$kw65$IGNORE_ERRORS_TARGET);
                    final SubLObject _prev_bind_0_$27 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)file_utilities.$sym66$IGNORE_ERRORS_HANDLER), thread);
                        try {
                            Filesys.delete_file(file);
                        }
                        catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, (SubLObject)file_utilities.NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(_prev_bind_0_$27, thread);
                    }
                }
                catch (Throwable ccatch_env_var) {
                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)file_utilities.$kw65$IGNORE_ERRORS_TARGET);
                    thread.throwStack.pop();
                }
                finally {
                    thread.throwStack.pop();
                }
                Values.restoreValuesFromVector(_values4);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_6, thread);
            }
        }
        return (SubLObject)file_utilities.$kw245$SUCCESS;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 56096L)
    public static SubLObject file_contents_to_hex_string(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject hex_string = (SubLObject)file_utilities.NIL;
        SubLObject stream = (SubLObject)file_utilities.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)file_utilities.NIL, thread);
                stream = compatibility.open_binary(filename, (SubLObject)file_utilities.$kw107$INPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)file_utilities.$str68$Unable_to_open__S, filename);
            }
            final SubLObject s = stream;
            hex_string = get_binary_data_from_stream(s, (SubLObject)file_utilities.ZERO_INTEGER, (SubLObject)file_utilities.UNPROVIDED);
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_utilities.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)file_utilities.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return hex_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 56427L)
    public static SubLObject hex_string_to_file_contents(final SubLObject hex_string, final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject bytes = (SubLObject)file_utilities.NIL;
        SubLObject hi = (SubLObject)file_utilities.NIL;
        SubLObject stream = (SubLObject)file_utilities.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)file_utilities.NIL, thread);
                stream = compatibility.open_binary(filename, (SubLObject)file_utilities.$kw67$OUTPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)file_utilities.$str68$Unable_to_open__S, filename);
            }
            final SubLObject s = stream;
            SubLObject end_var_$28;
            SubLObject end_var;
            SubLObject char_num;
            SubLObject v_char;
            SubLObject v_byte;
            for (end_var = (end_var_$28 = Sequences.length(hex_string)), char_num = (SubLObject)file_utilities.NIL, char_num = (SubLObject)file_utilities.ZERO_INTEGER; !char_num.numGE(end_var_$28); char_num = number_utilities.f_1X(char_num)) {
                v_char = Strings.sublisp_char(hex_string, char_num);
                if (file_utilities.NIL != string_utilities.hex_char_p(v_char)) {
                    if (file_utilities.NIL == hi) {
                        hi = v_char;
                    }
                    else {
                        v_byte = vector_utilities.hex_chars_to_byte(hi, v_char);
                        streams_high.write_byte(v_byte, s);
                        hi = (SubLObject)file_utilities.NIL;
                    }
                }
            }
            streams_high.force_output(s);
            bytes = streams_high.file_length(s);
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_utilities.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)file_utilities.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return bytes;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 56989L)
    public static SubLObject file_stream_direction(final SubLObject file_stream) {
        if (file_utilities.NIL == streams_high.output_stream_p(file_stream)) {
            return (SubLObject)file_utilities.$kw107$INPUT;
        }
        if (file_utilities.NIL != streams_high.input_stream_p(file_stream)) {
            return (SubLObject)file_utilities.$kw34$IO;
        }
        return (SubLObject)file_utilities.$kw67$OUTPUT;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 57451L)
    public static SubLObject change_file_stream_buffer_size(final SubLObject old_stream, final SubLObject new_buffer_size) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (file_utilities.NIL != streams_high.output_stream_p(old_stream)) {
            streams_high.force_output(old_stream);
        }
        final SubLObject loc = streams_high.file_position(old_stream, (SubLObject)file_utilities.UNPROVIDED);
        final SubLObject file_name = string_utilities.to_string(Filesys.probe_file(old_stream));
        final SubLObject element_type = streams_high.stream_element_type(old_stream);
        final SubLObject direction = file_stream_direction(old_stream);
        SubLObject new_stream = (SubLObject)file_utilities.NIL;
        streams_high.close(old_stream, (SubLObject)file_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(thread);
        final SubLObject _prev_bind_2 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(thread);
        try {
            StreamsLow.$stream_initial_input_buffer_size$.bind(new_buffer_size, thread);
            StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(thread), thread);
            if (file_utilities.$kw32$TEXT == element_type) {
                new_stream = StreamsLow.open(file_name, new SubLObject[] { file_utilities.$kw33$DIRECTION, direction, file_utilities.$kw35$IF_EXISTS, file_utilities.$kw76$APPEND, file_utilities.$kw36$IF_DOES_NOT_EXIST, file_utilities.$kw246$ERROR, file_utilities.$kw38$ELEMENT_TYPE, file_utilities.$kw32$TEXT });
            }
            else {
                new_stream = StreamsLow.open(file_name, new SubLObject[] { file_utilities.$kw33$DIRECTION, direction, file_utilities.$kw35$IF_EXISTS, file_utilities.$kw76$APPEND, file_utilities.$kw36$IF_DOES_NOT_EXIST, file_utilities.$kw246$ERROR, file_utilities.$kw38$ELEMENT_TYPE, file_utilities.$kw71$BINARY });
            }
        }
        finally {
            StreamsLow.$stream_initial_output_buffer_size$.rebind(_prev_bind_2, thread);
            StreamsLow.$stream_initial_input_buffer_size$.rebind(_prev_bind_0, thread);
        }
        streams_high.file_position(new_stream, loc);
        return new_stream;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 58595L)
    public static SubLObject with_file_memory_mapping(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym3$CLET, (SubLObject)file_utilities.$list247, reader.bq_cons((SubLObject)file_utilities.$sym57$PROGN, ConsesLow.append(body, (SubLObject)file_utilities.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 58835L)
    public static SubLObject without_file_memory_mapping(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)file_utilities.$sym3$CLET, (SubLObject)file_utilities.$list248, reader.bq_cons((SubLObject)file_utilities.$sym57$PROGN, ConsesLow.append(body, (SubLObject)file_utilities.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 58983L)
    public static SubLObject file_stream_memory_mappedP(final SubLObject file_stream) {
        return StreamsLow.isMemoryMappedStream(file_stream);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 59305L)
    public static SubLObject enable_file_stream_memory_mapping(final SubLObject old_stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (file_utilities.NIL == streams_high.open_stream_p(old_stream)) {
            return old_stream;
        }
        if (file_utilities.NIL != file_stream_memory_mappedP(old_stream)) {
            return old_stream;
        }
        if (file_utilities.NIL != streams_high.output_stream_p(old_stream)) {
            streams_high.force_output(old_stream);
        }
        final SubLObject loc = streams_high.file_position(old_stream, (SubLObject)file_utilities.UNPROVIDED);
        final SubLObject file_name = string_utilities.to_string(Filesys.probe_file(old_stream));
        final SubLObject element_type = streams_high.stream_element_type(old_stream);
        final SubLObject direction = file_stream_direction(old_stream);
        SubLObject new_stream = (SubLObject)file_utilities.NIL;
        streams_high.close(old_stream, (SubLObject)file_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = StreamsLow.$should_memory_map_files$.currentBinding(thread);
        try {
            StreamsLow.$should_memory_map_files$.bind((SubLObject)file_utilities.T, thread);
            if (file_utilities.$kw32$TEXT == element_type) {
                new_stream = StreamsLow.open(file_name, new SubLObject[] { file_utilities.$kw33$DIRECTION, direction, file_utilities.$kw35$IF_EXISTS, file_utilities.$kw76$APPEND, file_utilities.$kw36$IF_DOES_NOT_EXIST, file_utilities.$kw246$ERROR, file_utilities.$kw38$ELEMENT_TYPE, file_utilities.$kw32$TEXT });
            }
            else {
                new_stream = StreamsLow.open(file_name, new SubLObject[] { file_utilities.$kw33$DIRECTION, direction, file_utilities.$kw35$IF_EXISTS, file_utilities.$kw76$APPEND, file_utilities.$kw36$IF_DOES_NOT_EXIST, file_utilities.$kw246$ERROR, file_utilities.$kw38$ELEMENT_TYPE, file_utilities.$kw71$BINARY });
            }
        }
        finally {
            StreamsLow.$should_memory_map_files$.rebind(_prev_bind_0, thread);
        }
        streams_high.file_position(new_stream, loc);
        return new_stream;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 60967L)
    public static SubLObject check_directory_creation_and_deletion(final SubLObject directory_name) {
        SubLObject createdP = (SubLObject)file_utilities.NIL;
        SubLObject deletedP = (SubLObject)file_utilities.NIL;
        make_directory_recursive(directory_name, (SubLObject)file_utilities.UNPROVIDED, (SubLObject)file_utilities.UNPROVIDED);
        if (file_utilities.NIL != Filesys.directory_p(directory_name)) {
            createdP = (SubLObject)file_utilities.T;
            Filesys.delete_directory(directory_name, (SubLObject)file_utilities.UNPROVIDED);
            Threads.sleep((SubLObject)file_utilities.ONE_INTEGER);
            deletedP = (SubLObject)SubLObjectFactory.makeBoolean(file_utilities.NIL == Filesys.directory_p(directory_name));
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(file_utilities.NIL != createdP && file_utilities.NIL != deletedP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 60967L)
    public static SubLObject test_directory_creation_and_deletion() {
        return (SubLObject)SubLObjectFactory.makeBoolean(file_utilities.NIL != test_directory_creation_and_deletion_absolute() && file_utilities.NIL != test_directory_creation_and_deletion_relative());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 60967L)
    public static SubLObject test_directory_creation_and_deletion_absolute() {
        final SubLObject absolute_directory = (SubLObject)file_utilities.$str27$_tmp_;
        SubLObject failP = (SubLObject)file_utilities.NIL;
        if (file_utilities.NIL != Filesys.directory_p(absolute_directory)) {
            final SubLObject name = (SubLObject)file_utilities.$str249$ads65jh3_;
            final SubLObject subdirectory = Sequences.cconcatenate(absolute_directory, name);
            if (file_utilities.NIL != Filesys.directory_p(subdirectory)) {
                Errors.warn((SubLObject)file_utilities.$str250$Couldn_t_test_creation_of__S__as_, subdirectory);
            }
            else if (file_utilities.NIL == check_directory_creation_and_deletion(subdirectory)) {
                Errors.warn((SubLObject)file_utilities.$str251$Failed_to_create_or_delete__S, subdirectory);
                failP = (SubLObject)file_utilities.T;
            }
            final SubLObject name_$29 = (SubLObject)file_utilities.$str252$ds6sdg32;
            final SubLObject sub_sub = Sequences.cconcatenate(subdirectory, name_$29);
            if (file_utilities.NIL != Filesys.directory_p(sub_sub)) {
                Errors.warn((SubLObject)file_utilities.$str250$Couldn_t_test_creation_of__S__as_, sub_sub);
            }
            else if (file_utilities.NIL == check_directory_creation_and_deletion(sub_sub)) {
                Errors.warn((SubLObject)file_utilities.$str251$Failed_to_create_or_delete__S, sub_sub);
                failP = (SubLObject)file_utilities.T;
            }
            Filesys.delete_directory(subdirectory, (SubLObject)file_utilities.UNPROVIDED);
        }
        else {
            Errors.warn((SubLObject)file_utilities.$str253$Couldn_t_test_creation_and_deleti, absolute_directory);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(file_utilities.NIL == failP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 60967L)
    public static SubLObject test_directory_creation_and_deletion_relative() {
        final SubLObject relative_directory = relative_filename(string_utilities.$empty_string$.getGlobalValue(), Filesys.construct_filename((SubLObject)file_utilities.$list254, string_utilities.$empty_string$.getGlobalValue(), (SubLObject)file_utilities.NIL, (SubLObject)file_utilities.T), (SubLObject)file_utilities.UNPROVIDED);
        SubLObject failP = (SubLObject)file_utilities.NIL;
        if (file_utilities.NIL != Filesys.directory_p(relative_directory)) {
            final SubLObject name = (SubLObject)file_utilities.$str255$ads65jh3;
            final SubLObject subdirectory = relative_filename(relative_directory, Filesys.construct_filename((SubLObject)ConsesLow.list(name), string_utilities.$empty_string$.getGlobalValue(), (SubLObject)file_utilities.NIL, (SubLObject)file_utilities.T), (SubLObject)file_utilities.UNPROVIDED);
            if (file_utilities.NIL != Filesys.directory_p(subdirectory)) {
                Errors.warn((SubLObject)file_utilities.$str250$Couldn_t_test_creation_of__S__as_, subdirectory);
            }
            else if (file_utilities.NIL == check_directory_creation_and_deletion(subdirectory)) {
                Errors.warn((SubLObject)file_utilities.$str251$Failed_to_create_or_delete__S, subdirectory);
                failP = (SubLObject)file_utilities.T;
            }
            final SubLObject name_$30 = (SubLObject)file_utilities.$str252$ds6sdg32;
            final SubLObject sub_sub = relative_filename(subdirectory, Filesys.construct_filename((SubLObject)ConsesLow.list(name_$30), string_utilities.$empty_string$.getGlobalValue(), (SubLObject)file_utilities.NIL, (SubLObject)file_utilities.T), (SubLObject)file_utilities.UNPROVIDED);
            if (file_utilities.NIL != Filesys.directory_p(sub_sub)) {
                Errors.warn((SubLObject)file_utilities.$str250$Couldn_t_test_creation_of__S__as_, sub_sub);
            }
            else if (file_utilities.NIL == check_directory_creation_and_deletion(sub_sub)) {
                Errors.warn((SubLObject)file_utilities.$str251$Failed_to_create_or_delete__S, sub_sub);
                failP = (SubLObject)file_utilities.T;
            }
            Filesys.delete_directory(subdirectory, (SubLObject)file_utilities.UNPROVIDED);
        }
        else {
            Errors.warn((SubLObject)file_utilities.$str253$Couldn_t_test_creation_and_deleti, relative_directory);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(file_utilities.NIL == failP);
    }
    
    public static SubLObject declare_file_utilities_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.file_utilities", "with_stream_buffer_size", "WITH-STREAM-BUFFER-SIZE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.file_utilities", "possibly_with_text_file", "POSSIBLY-WITH-TEXT-FILE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.file_utilities", "possibly_with_private_text_file", "POSSIBLY-WITH-PRIVATE-TEXT-FILE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.file_utilities", "possibly_with_binary_file", "POSSIBLY-WITH-BINARY-FILE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.file_utilities", "possibly_with_private_binary_file", "POSSIBLY-WITH-PRIVATE-BINARY-FILE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "peek_byte_from_char_stream", "PEEK-BYTE-FROM-CHAR-STREAM", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "read_byte_from_char_stream", "READ-BYTE-FROM-CHAR-STREAM", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "unread_byte_from_char_stream", "UNREAD-BYTE-FROM-CHAR-STREAM", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "write_byte_to_char_stream", "WRITE-BYTE-TO-CHAR-STREAM", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "stream_designator_p", "STREAM-DESIGNATOR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "pathname_designator_p", "PATHNAME-DESIGNATOR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "load_from_cyc_home", "LOAD-FROM-CYC-HOME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "cyc_home_filename", "CYC-HOME-FILENAME", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "cyc_home_subdirectory", "CYC-HOME-SUBDIRECTORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "canonical_cyc_working_directory", "CANONICAL-CYC-WORKING-DIRECTORY", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "relative_filename", "RELATIVE-FILENAME", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "basic_filename", "BASIC-FILENAME", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "temp_directory", "TEMP-DIRECTORY", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "random_path_char", "RANDOM-PATH-CHAR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "make_temp_filename", "MAKE-TEMP-FILENAME", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "random_filename_part", "RANDOM-FILENAME-PART", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "make_unused_temp_filename", "MAKE-UNUSED-TEMP-FILENAME", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "make_prefixed_temp_filename", "MAKE-PREFIXED-TEMP-FILENAME", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "open_temp_file", "OPEN-TEMP-FILE", 0, 2, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.file_utilities", "with_temp_file", "WITH-TEMP-FILE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.file_utilities", "with_file_replacement", "WITH-FILE-REPLACEMENT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.file_utilities", "with_temporary_filename", "WITH-TEMPORARY-FILENAME");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "open_tmp_file", "OPEN-TMP-FILE", 0, 2, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.file_utilities", "with_tmp_file", "WITH-TMP-FILE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "directory_writeable_p", "DIRECTORY-WRITEABLE-P", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "file_valid_for_writing_p", "FILE-VALID-FOR-WRITING-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "delete_file_if_exists", "DELETE-FILE-IF-EXISTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "clean_filename", "CLEAN-FILENAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "append_files", "APPEND-FILES", 2, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.file_utilities", "cdolines", "CDOLINES");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "cdolines_get_next_line", "CDOLINES-GET-NEXT-LINE", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.file_utilities", "do_stream_lines", "DO-STREAM-LINES");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "do_stream_lines_get_next_line", "DO-STREAM-LINES-GET-NEXT-LINE", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.file_utilities", "do_file_lines", "DO-FILE-LINES");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "count_file_lines", "COUNT-FILE-LINES", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.file_utilities", "do_csv_file_lines", "DO-CSV-FILE-LINES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.file_utilities", "cdolines_tokenized", "CDOLINES-TOKENIZED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.file_utilities", "cdolines_read", "CDOLINES-READ");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.file_utilities", "do_file_records", "DO-FILE-RECORDS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.file_utilities", "do_directory_contents", "DO-DIRECTORY-CONTENTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.file_utilities", "do_directory_subdirectories", "DO-DIRECTORY-SUBDIRECTORIES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.file_utilities", "do_directory_tree_files", "DO-DIRECTORY-TREE-FILES");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "directory_file_count", "DIRECTORY-FILE-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "list_directory", "LIST-DIRECTORY", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "sort_files_by_date", "SORT-FILES-BY-DATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "slurp_file", "SLURP-FILE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "slurp_file_robust", "SLURP-FILE-ROBUST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "slurp_file_lines", "SLURP-FILE-LINES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "file_existsP", "FILE-EXISTS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "why_not_probe_fileP", "WHY-NOT-PROBE-FILE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "guess_path_type", "GUESS-PATH-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "guess_path_type_robust", "GUESS-PATH-TYPE-ROBUST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "absolute_default_path_string", "ABSOLUTE-DEFAULT-PATH-STRING", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "possibly_append_path_separator_char", "POSSIBLY-APPEND-PATH-SEPARATOR-CHAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "get_absolute_path_string", "GET-ABSOLUTE-PATH-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "absolute_pathP", "ABSOLUTE-PATH?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "path_separator_char", "PATH-SEPARATOR-CHAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "path_separator_string", "PATH-SEPARATOR-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "deconstruct_path", "DECONSTRUCT-PATH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "reconstruct_path", "RECONSTRUCT-PATH", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "make_path_absolute_relative_to", "MAKE-PATH-ABSOLUTE-RELATIVE-TO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "make_absolute_path_relative_to", "MAKE-ABSOLUTE-PATH-RELATIVE-TO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "pathstring_filename", "PATHSTRING-FILENAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "pathstring_directory_name", "PATHSTRING-DIRECTORY-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "partially_deconstruct_path", "PARTIALLY-DECONSTRUCT-PATH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "ensure_unique_filename", "ENSURE-UNIQUE-FILENAME", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "read_text_file", "READ-TEXT-FILE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "output_text_file", "OUTPUT-TEXT-FILE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "write_text_file", "WRITE-TEXT-FILE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "append_text_file", "APPEND-TEXT-FILE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "truncate_file", "TRUNCATE-FILE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "empty_file_p", "EMPTY-FILE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "ensure_directories_exist", "ENSURE-DIRECTORIES-EXIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "make_directory_recursive", "MAKE-DIRECTORY-RECURSIVE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "logical_pathname_to_physical", "LOGICAL-PATHNAME-TO-PHYSICAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "recursive_delete_directory", "RECURSIVE-DELETE-DIRECTORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "recursive_copy_directory", "RECURSIVE-COPY-DIRECTORY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "chmod", "CHMOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "delete_file_via_os", "DELETE-FILE-VIA-OS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "create_symbolic_link", "CREATE-SYMBOLIC-LINK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "link_or_copy_file", "LINK-OR-COPY-FILE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "move_file", "MOVE-FILE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "get_file_length", "GET-FILE-LENGTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "copy_file_checked", "COPY-FILE-CHECKED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "get_file_lines", "GET-FILE-LINES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "get_stream_forms", "GET-STREAM-FORMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "get_file_forms", "GET-FILE-FORMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "get_file_line_count", "GET-FILE-LINE-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "load_file_catching_error", "LOAD-FILE-CATCHING-ERROR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "normal_pathstring", "NORMAL-PATHSTRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "possibly_update_keepalive_file", "POSSIBLY-UPDATE-KEEPALIVE-FILE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "update_keepalive_file", "UPDATE-KEEPALIVE-FILE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "make_directory_or_error", "MAKE-DIRECTORY-OR-ERROR", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "make_directory_or_possibly_error", "MAKE-DIRECTORY-OR-POSSIBLY-ERROR", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "make_timestamp_subdirectory", "MAKE-TIMESTAMP-SUBDIRECTORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "timestamp_subdirectory", "TIMESTAMP-SUBDIRECTORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "prepare_to_possibly_overwrite_file", "PREPARE-TO-POSSIBLY-OVERWRITE-FILE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "new_file_accumulator", "NEW-FILE-ACCUMULATOR", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "close_file_accumulator", "CLOSE-FILE-ACCUMULATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "make_file_accumulator_state", "MAKE-FILE-ACCUMULATOR-STATE", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.file_utilities", "with_file_accumulator_state", "WITH-FILE-ACCUMULATOR-STATE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "file_accumulator_state_set_item_count", "FILE-ACCUMULATOR-STATE-SET-ITEM-COUNT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "file_accumulator_state_reset_item_count", "FILE-ACCUMULATOR-STATE-RESET-ITEM-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "file_accumulator_state_get_stream", "FILE-ACCUMULATOR-STATE-GET-STREAM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "file_accumulator_reset", "FILE-ACCUMULATOR-RESET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "file_accumulator_add", "FILE-ACCUMULATOR-ADD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "file_accumulator_size", "FILE-ACCUMULATOR-SIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "file_accumulator_contents", "FILE-ACCUMULATOR-CONTENTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "file_accumulator_iterator", "FILE-ACCUMULATOR-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "file_accumulator_release_resources", "FILE-ACCUMULATOR-RELEASE-RESOURCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "copy_binary_data_to_hex_stream", "COPY-BINARY-DATA-TO-HEX-STREAM", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "get_binary_data_from_stream", "GET-BINARY-DATA-FROM-STREAM", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "test_get_binary_data_from_stream", "TEST-GET-BINARY-DATA-FROM-STREAM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "file_contents_to_hex_string", "FILE-CONTENTS-TO-HEX-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "hex_string_to_file_contents", "HEX-STRING-TO-FILE-CONTENTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "file_stream_direction", "FILE-STREAM-DIRECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "change_file_stream_buffer_size", "CHANGE-FILE-STREAM-BUFFER-SIZE", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.file_utilities", "with_file_memory_mapping", "WITH-FILE-MEMORY-MAPPING");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.file_utilities", "without_file_memory_mapping", "WITHOUT-FILE-MEMORY-MAPPING");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "file_stream_memory_mappedP", "FILE-STREAM-MEMORY-MAPPED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "enable_file_stream_memory_mapping", "ENABLE-FILE-STREAM-MEMORY-MAPPING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "check_directory_creation_and_deletion", "CHECK-DIRECTORY-CREATION-AND-DELETION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "test_directory_creation_and_deletion", "TEST-DIRECTORY-CREATION-AND-DELETION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "test_directory_creation_and_deletion_absolute", "TEST-DIRECTORY-CREATION-AND-DELETION-ABSOLUTE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_utilities", "test_directory_creation_and_deletion_relative", "TEST-DIRECTORY-CREATION-AND-DELETION-RELATIVE", 0, 0, false);
        return (SubLObject)file_utilities.NIL;
    }
    
    public static SubLObject init_file_utilities_file() {
        file_utilities.$default_big_stream_buffer_size$ = SubLFiles.defparameter("*DEFAULT-BIG-STREAM-BUFFER-SIZE*", (SubLObject)file_utilities.$int0$4194304);
        file_utilities.$default_small_stream_buffer_size$ = SubLFiles.defparameter("*DEFAULT-SMALL-STREAM-BUFFER-SIZE*", (SubLObject)file_utilities.$int1$4096);
        file_utilities.$temp_directory$ = SubLFiles.deflexical("*TEMP-DIRECTORY*", red_infrastructure_macros.red_def_helper((SubLObject)(file_utilities.$list25.isSymbol() ? Symbols.symbol_value((SubLObject)file_utilities.$list25) : file_utilities.$list25), (SubLObject)file_utilities.$sym26$_TEMP_DIRECTORY_, (SubLObject)(file_utilities.$str27$_tmp_.isSymbol() ? Symbols.symbol_value((SubLObject)file_utilities.$str27$_tmp_) : file_utilities.$str27$_tmp_), (SubLObject)file_utilities.$kw28$LEXICAL, (SubLObject)file_utilities.UNPROVIDED));
        file_utilities.$random_path_chars$ = SubLFiles.deflexical("*RANDOM-PATH-CHARS*", (SubLObject)file_utilities.$str29$0123456789abcdefghijklmnopqrstuvw);
        return (SubLObject)file_utilities.NIL;
    }
    
    public static SubLObject setup_file_utilities_file() {
        access_macros.register_external_symbol((SubLObject)file_utilities.$sym20$LOAD_FROM_CYC_HOME);
        access_macros.define_obsolete_register((SubLObject)file_utilities.$sym42$OPEN_TMP_FILE, (SubLObject)file_utilities.$list59);
        access_macros.register_macro_helper((SubLObject)file_utilities.$sym81$CDOLINES_GET_NEXT_LINE, (SubLObject)file_utilities.$sym84$CDOLINES);
        access_macros.register_macro_helper((SubLObject)file_utilities.$sym94$DO_STREAM_LINES_GET_NEXT_LINE, (SubLObject)file_utilities.$sym90$DO_STREAM_LINES);
        generic_testing.define_test_case_table_int((SubLObject)file_utilities.$sym236$TEST_GET_BINARY_DATA_FROM_STREAM, (SubLObject)ConsesLow.list(new SubLObject[] { file_utilities.$kw237$TEST, file_utilities.NIL, file_utilities.$kw238$OWNER, file_utilities.NIL, file_utilities.$kw239$CLASSES, file_utilities.NIL, file_utilities.$kw240$KB, file_utilities.$kw241$TINY, file_utilities.$kw242$WORKING_, file_utilities.T }), (SubLObject)file_utilities.$list243);
        generic_testing.define_test_case_table_int((SubLObject)file_utilities.$sym256$TEST_DIRECTORY_CREATION_AND_DELETION, (SubLObject)ConsesLow.list(new SubLObject[] { file_utilities.$kw237$TEST, file_utilities.NIL, file_utilities.$kw238$OWNER, file_utilities.NIL, file_utilities.$kw239$CLASSES, file_utilities.NIL, file_utilities.$kw240$KB, file_utilities.$kw241$TINY, file_utilities.$kw242$WORKING_, file_utilities.T }), (SubLObject)file_utilities.$list257);
        return (SubLObject)file_utilities.NIL;
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
    
    static {
        me = (SubLFile)new file_utilities();
        file_utilities.$default_big_stream_buffer_size$ = null;
        file_utilities.$default_small_stream_buffer_size$ = null;
        file_utilities.$temp_directory$ = null;
        file_utilities.$random_path_chars$ = null;
        $int0$4194304 = SubLObjectFactory.makeInteger(4194304);
        $int1$4096 = SubLObjectFactory.makeInteger(4096);
        $list2 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SIZE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym3$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym4$_STREAM_INITIAL_INPUT_BUFFER_SIZE_ = SubLObjectFactory.makeSymbol("*STREAM-INITIAL-INPUT-BUFFER-SIZE*");
        $list5 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*STREAM-INITIAL-OUTPUT-BUFFER-SIZE*"), (SubLObject)SubLObjectFactory.makeSymbol("*STREAM-INITIAL-INPUT-BUFFER-SIZE*")));
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("*STREAM-INITIAL-INPUT-BUFFER-SIZE*"), (SubLObject)SubLObjectFactory.makeSymbol("*STREAM-INITIAL-OUTPUT-BUFFER-SIZE*"));
        $list7 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("FILENAME"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym8$FILENAME_VAR = SubLObjectFactory.makeUninternedSymbol("FILENAME-VAR");
        $sym9$PIF = SubLObjectFactory.makeSymbol("PIF");
        $sym10$WITH_TEXT_FILE = SubLObjectFactory.makeSymbol("WITH-TEXT-FILE");
        $list11 = ConsesLow.list((SubLObject)file_utilities.NIL);
        $sym12$FILENAME_VAR = SubLObjectFactory.makeUninternedSymbol("FILENAME-VAR");
        $sym13$WITH_PRIVATE_TEXT_FILE = SubLObjectFactory.makeSymbol("WITH-PRIVATE-TEXT-FILE");
        $sym14$FILENAME_VAR = SubLObjectFactory.makeUninternedSymbol("FILENAME-VAR");
        $sym15$WITH_BINARY_FILE = SubLObjectFactory.makeSymbol("WITH-BINARY-FILE");
        $sym16$FILENAME_VAR = SubLObjectFactory.makeUninternedSymbol("FILENAME-VAR");
        $sym17$WITH_PRIVATE_BINARY_FILE = SubLObjectFactory.makeSymbol("WITH-PRIVATE-BINARY-FILE");
        $kw18$EOF = SubLObjectFactory.makeKeyword("EOF");
        $sym19$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $sym20$LOAD_FROM_CYC_HOME = SubLObjectFactory.makeSymbol("LOAD-FROM-CYC-HOME");
        $sym21$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $str22$ = SubLObjectFactory.makeString("");
        $str23$_ = SubLObjectFactory.makeString(".");
        $sym24$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $list25 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rck.please.put.this.in.the.right.place"));
        $sym26$_TEMP_DIRECTORY_ = SubLObjectFactory.makeSymbol("*TEMP-DIRECTORY*");
        $str27$_tmp_ = SubLObjectFactory.makeString("/tmp/");
        $kw28$LEXICAL = SubLObjectFactory.makeKeyword("LEXICAL");
        $str29$0123456789abcdefghijklmnopqrstuvw = SubLObjectFactory.makeString("0123456789abcdefghijklmnopqrstuvwxyz");
        $int30$36 = SubLObjectFactory.makeInteger(36);
        $str31$tmp = SubLObjectFactory.makeString("tmp");
        $kw32$TEXT = SubLObjectFactory.makeKeyword("TEXT");
        $kw33$DIRECTION = SubLObjectFactory.makeKeyword("DIRECTION");
        $kw34$IO = SubLObjectFactory.makeKeyword("IO");
        $kw35$IF_EXISTS = SubLObjectFactory.makeKeyword("IF-EXISTS");
        $kw36$IF_DOES_NOT_EXIST = SubLObjectFactory.makeKeyword("IF-DOES-NOT-EXIST");
        $kw37$CREATE = SubLObjectFactory.makeKeyword("CREATE");
        $kw38$ELEMENT_TYPE = SubLObjectFactory.makeKeyword("ELEMENT-TYPE");
        $list39 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELEMENT-TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("TEXT"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list40 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ELEMENT-TYPE"));
        $kw41$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $sym42$OPEN_TMP_FILE = SubLObjectFactory.makeSymbol("OPEN-TMP-FILE");
        $sym43$CUNWIND_PROTECT = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
        $sym44$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym45$STREAMP = SubLObjectFactory.makeSymbol("STREAMP");
        $sym46$DELETE_FILE = SubLObjectFactory.makeSymbol("DELETE-FILE");
        $sym47$CLOSE = SubLObjectFactory.makeSymbol("CLOSE");
        $list48 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("FILENAME"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELEMENT-TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("TEXT"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym49$FORCE_OUTPUT = SubLObjectFactory.makeSymbol("FORCE-OUTPUT");
        $sym50$PROBE_FILE = SubLObjectFactory.makeSymbol("PROBE-FILE");
        $sym51$COPY_FILE = SubLObjectFactory.makeSymbol("COPY-FILE");
        $sym52$TO_STRING = SubLObjectFactory.makeSymbol("TO-STRING");
        $list53 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FILENAME"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DIRECTORY"), (SubLObject)SubLObjectFactory.makeSymbol("*TEMP-DIRECTORY*"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list54 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DIRECTORY"));
        $kw55$DIRECTORY = SubLObjectFactory.makeKeyword("DIRECTORY");
        $sym56$MAKE_TEMP_FILENAME = SubLObjectFactory.makeSymbol("MAKE-TEMP-FILENAME");
        $sym57$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym58$IGNORE_ERRORS = SubLObjectFactory.makeSymbol("IGNORE-ERRORS");
        $list59 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPEN-TEMP-FILE"));
        $list60 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELEMENT-TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("TEXT"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym61$WITH_TMP_FILE = SubLObjectFactory.makeSymbol("WITH-TMP-FILE");
        $list62 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-TEMP-FILE"));
        $sym63$WITH_TEMP_FILE = SubLObjectFactory.makeSymbol("WITH-TEMP-FILE");
        $sym64$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $kw65$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym66$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $kw67$OUTPUT = SubLObjectFactory.makeKeyword("OUTPUT");
        $str68$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $sym69$READ_CHAR = SubLObjectFactory.makeSymbol("READ-CHAR");
        $sym70$WRITE_CHAR = SubLObjectFactory.makeSymbol("WRITE-CHAR");
        $kw71$BINARY = SubLObjectFactory.makeKeyword("BINARY");
        $kw72$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $sym73$READ_BYTE = SubLObjectFactory.makeSymbol("READ-BYTE");
        $sym74$WRITE_BYTE = SubLObjectFactory.makeSymbol("WRITE-BYTE");
        $str75$_S_is_not_a_valid_mode_ = SubLObjectFactory.makeString("~S is not a valid mode.");
        $kw76$APPEND = SubLObjectFactory.makeKeyword("APPEND");
        $list77 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("FILE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym78$INFILE = SubLObjectFactory.makeUninternedSymbol("INFILE");
        $list79 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INPUT"));
        $sym80$CDO = SubLObjectFactory.makeSymbol("CDO");
        $sym81$CDOLINES_GET_NEXT_LINE = SubLObjectFactory.makeSymbol("CDOLINES-GET-NEXT-LINE");
        $sym82$COR = SubLObjectFactory.makeSymbol("COR");
        $sym83$NULL = SubLObjectFactory.makeSymbol("NULL");
        $sym84$CDOLINES = SubLObjectFactory.makeSymbol("CDOLINES");
        $list85 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LINE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("LINE-NUMBER"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list86 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LINE-NUMBER"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw87$LINE_NUMBER = SubLObjectFactory.makeKeyword("LINE-NUMBER");
        $kw88$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym89$LINE_NUMBER_VAR = SubLObjectFactory.makeUninternedSymbol("LINE-NUMBER-VAR");
        $sym90$DO_STREAM_LINES = SubLObjectFactory.makeSymbol("DO-STREAM-LINES");
        $sym91$STREAM_VAR = SubLObjectFactory.makeUninternedSymbol("STREAM-VAR");
        $sym92$SYMBOLP = SubLObjectFactory.makeSymbol("SYMBOLP");
        $sym93$1_ = SubLObjectFactory.makeSymbol("1+");
        $sym94$DO_STREAM_LINES_GET_NEXT_LINE = SubLObjectFactory.makeSymbol("DO-STREAM-LINES-GET-NEXT-LINE");
        $list95 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LINE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("FILE"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("LINE-NUMBER"), (SubLObject)SubLObjectFactory.makeSymbol("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list96 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LINE-NUMBER"), (SubLObject)SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw97$PROGRESS_MESSAGE = SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE");
        $sym98$FILE_VAR = SubLObjectFactory.makeUninternedSymbol("FILE-VAR");
        $sym99$STREAM_VAR = SubLObjectFactory.makeUninternedSymbol("STREAM-VAR");
        $sym100$FILE_VAR = SubLObjectFactory.makeUninternedSymbol("FILE-VAR");
        $sym101$STREAM_VAR = SubLObjectFactory.makeUninternedSymbol("STREAM-VAR");
        $sym102$LENGTH_VAR = SubLObjectFactory.makeUninternedSymbol("LENGTH-VAR");
        $sym103$NOTING_PERCENT_PROGRESS = SubLObjectFactory.makeSymbol("NOTING-PERCENT-PROGRESS");
        $sym104$FILE_LENGTH = SubLObjectFactory.makeSymbol("FILE-LENGTH");
        $sym105$NOTE_PERCENT_PROGRESS = SubLObjectFactory.makeSymbol("NOTE-PERCENT-PROGRESS");
        $sym106$FILE_POSITION = SubLObjectFactory.makeSymbol("FILE-POSITION");
        $kw107$INPUT = SubLObjectFactory.makeKeyword("INPUT");
        $list108 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TOKENIZED-LINE"), (SubLObject)SubLObjectFactory.makeSymbol("FILE"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BREAK-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)Characters.CHAR_comma))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EMBED-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeString("\""), (SubLObject)SubLObjectFactory.makeString("\""))))), (SubLObject)SubLObjectFactory.makeSymbol("INCLUDE-STOPS"), (SubLObject)SubLObjectFactory.makeSymbol("IGNORE-EMPTY-STRINGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE-CHARS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)Characters.CHAR_backslash)))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list109 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BREAK-LIST"), (SubLObject)SubLObjectFactory.makeKeyword("EMBED-LIST"), (SubLObject)SubLObjectFactory.makeKeyword("INCLUDE-STOPS"), (SubLObject)SubLObjectFactory.makeKeyword("IGNORE-EMPTY-STRINGS"), (SubLObject)SubLObjectFactory.makeKeyword("QUOTE-CHARS"));
        $kw110$BREAK_LIST = SubLObjectFactory.makeKeyword("BREAK-LIST");
        $list111 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)Characters.CHAR_comma);
        $kw112$EMBED_LIST = SubLObjectFactory.makeKeyword("EMBED-LIST");
        $list113 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeString("\""), (SubLObject)SubLObjectFactory.makeString("\"")));
        $kw114$INCLUDE_STOPS = SubLObjectFactory.makeKeyword("INCLUDE-STOPS");
        $kw115$IGNORE_EMPTY_STRINGS = SubLObjectFactory.makeKeyword("IGNORE-EMPTY-STRINGS");
        $kw116$QUOTE_CHARS = SubLObjectFactory.makeKeyword("QUOTE-CHARS");
        $list117 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)Characters.CHAR_backslash);
        $sym118$LINE = SubLObjectFactory.makeUninternedSymbol("LINE");
        $sym119$DO_FILE_LINES = SubLObjectFactory.makeSymbol("DO-FILE-LINES");
        $sym120$STRING_TOKENIZE = SubLObjectFactory.makeSymbol("STRING-TOKENIZE");
        $list121 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FILE"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BREAK-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAPCAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("TO-STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHITESPACE-CHARS"))))), (SubLObject)SubLObjectFactory.makeSymbol("EMBED-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("INCLUDE-STOPS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE-EMPTY-STRINGS"), (SubLObject)file_utilities.T), (SubLObject)SubLObjectFactory.makeSymbol("QUOTE-CHARS")), (SubLObject)SubLObjectFactory.makeSymbol("LAMBDA-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list122 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAPCAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("TO-STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHITESPACE-CHARS")));
        $sym123$LINE = SubLObjectFactory.makeUninternedSymbol("LINE");
        $sym124$CDESTRUCTURING_BIND = SubLObjectFactory.makeSymbol("CDESTRUCTURING-BIND");
        $sym125$MAPCAR = SubLObjectFactory.makeSymbol("MAPCAR");
        $list126 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("READ-FROM-STRING"));
        $sym127$LINE = SubLObjectFactory.makeUninternedSymbol("LINE");
        $sym128$LINE_INDEX = SubLObjectFactory.makeUninternedSymbol("LINE-INDEX");
        $sym129$DONE_INT = SubLObjectFactory.makeUninternedSymbol("DONE-INT");
        $list130 = ConsesLow.list((SubLObject)file_utilities.ZERO_INTEGER);
        $list131 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)file_utilities.NIL));
        $sym132$WHILE = SubLObjectFactory.makeSymbol("WHILE");
        $sym133$_ = SubLObjectFactory.makeSymbol("<");
        $sym134$LENGTH = SubLObjectFactory.makeSymbol("LENGTH");
        $sym135$CMULTIPLE_VALUE_BIND = SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-BIND");
        $list136 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ITEM"), (SubLObject)SubLObjectFactory.makeSymbol("TEMP-LINE-INDEX"));
        $sym137$READ_FROM_STRING = SubLObjectFactory.makeSymbol("READ-FROM-STRING");
        $sym138$CPUSH = SubLObjectFactory.makeSymbol("CPUSH");
        $sym139$ITEM = SubLObjectFactory.makeSymbol("ITEM");
        $sym140$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $list141 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMP-LINE-INDEX"));
        $sym142$NREVERSE = SubLObjectFactory.makeSymbol("NREVERSE");
        $sym143$PUNLESS = SubLObjectFactory.makeSymbol("PUNLESS");
        $list144 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RECORD"), (SubLObject)SubLObjectFactory.makeSymbol("FILE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEPARATOR-TEST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("WHITESPACE-STRING?"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE-TEST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("FALSE")))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym145$WHITESPACE_STRING_ = SubLObjectFactory.makeSymbol("WHITESPACE-STRING?");
        $sym146$FALSE = SubLObjectFactory.makeSymbol("FALSE");
        $sym147$INSTREAM = SubLObjectFactory.makeUninternedSymbol("INSTREAM");
        $sym148$LINE = SubLObjectFactory.makeUninternedSymbol("LINE");
        $sym149$INPUT_STREAM_P = SubLObjectFactory.makeSymbol("INPUT-STREAM-P");
        $sym150$NETWORK_READ_LINE = SubLObjectFactory.makeSymbol("NETWORK-READ-LINE");
        $list151 = ConsesLow.list((SubLObject)file_utilities.NIL, (SubLObject)file_utilities.NIL);
        $sym152$FUNCALL = SubLObjectFactory.makeSymbol("FUNCALL");
        $list153 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FILE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTORY"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INCLUDE-DIRECTORY?"), (SubLObject)file_utilities.T), (SubLObject)SubLObjectFactory.makeSymbol("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeSymbol("DONE"), (SubLObject)SubLObjectFactory.makeSymbol("SORT-FN")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list154 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INCLUDE-DIRECTORY?"), (SubLObject)SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"), (SubLObject)SubLObjectFactory.makeKeyword("SORT-FN"));
        $kw155$INCLUDE_DIRECTORY_ = SubLObjectFactory.makeKeyword("INCLUDE-DIRECTORY?");
        $kw156$SORT_FN = SubLObjectFactory.makeKeyword("SORT-FN");
        $sym157$DIRECTORY_CONTENTS_VAR = SubLObjectFactory.makeUninternedSymbol("DIRECTORY-CONTENTS-VAR");
        $sym158$PROGRESS_MESSAGE_VAR = SubLObjectFactory.makeUninternedSymbol("PROGRESS-MESSAGE-VAR");
        $sym159$CHECK_TYPE = SubLObjectFactory.makeSymbol("CHECK-TYPE");
        $list160 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DIRECTORY-P"));
        $sym161$DIRECTORY = SubLObjectFactory.makeSymbol("DIRECTORY");
        $sym162$_SILENT_PROGRESS__ = SubLObjectFactory.makeSymbol("*SILENT-PROGRESS?*");
        $sym163$CNOT = SubLObjectFactory.makeSymbol("CNOT");
        $sym164$FUNCTION_SPEC_P = SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P");
        $sym165$SORT = SubLObjectFactory.makeSymbol("SORT");
        $sym166$PROGRESS_CSOME = SubLObjectFactory.makeSymbol("PROGRESS-CSOME");
        $list167 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBDIRECTORY"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTORY"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INCLUDE-DIRECTORY?"), (SubLObject)file_utilities.T)), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list168 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INCLUDE-DIRECTORY?"));
        $sym169$DO_DIRECTORY_CONTENTS = SubLObjectFactory.makeSymbol("DO-DIRECTORY-CONTENTS");
        $sym170$DIRECTORY_P = SubLObjectFactory.makeSymbol("DIRECTORY-P");
        $sym171$FCOND = SubLObjectFactory.makeSymbol("FCOND");
        $sym172$ENDS_WITH = SubLObjectFactory.makeSymbol("ENDS-WITH");
        $list173 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("/"));
        $sym174$CCONCATENATE = SubLObjectFactory.makeSymbol("CCONCATENATE");
        $str175$_ = SubLObjectFactory.makeString("/");
        $sym176$LAST_CHAR = SubLObjectFactory.makeSymbol("LAST-CHAR");
        $list177 = ConsesLow.list((SubLObject)Characters.CHAR_slash);
        $list178 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FILE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTORY"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INCLUDE-DIRECTORY?"), (SubLObject)file_utilities.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeString("Processing directory tree files..."))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list179 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INCLUDE-DIRECTORY?"), (SubLObject)SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE"));
        $str180$Processing_directory_tree_files__ = SubLObjectFactory.makeString("Processing directory tree files...");
        $sym181$DIRECTORY_LIST_VAR = SubLObjectFactory.makeUninternedSymbol("DIRECTORY-LIST-VAR");
        $sym182$CURRENT_DIRECTORY_VAR = SubLObjectFactory.makeUninternedSymbol("CURRENT-DIRECTORY-VAR");
        $sym183$LIST = SubLObjectFactory.makeSymbol("LIST");
        $sym184$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $sym185$CPOP = SubLObjectFactory.makeSymbol("CPOP");
        $sym186$FWHEN = SubLObjectFactory.makeSymbol("FWHEN");
        $sym187$FORMAT_NIL = SubLObjectFactory.makeSymbol("FORMAT-NIL");
        $str188$___Directory___S = SubLObjectFactory.makeString("~% Directory: ~S");
        $str189$cdolist = SubLObjectFactory.makeString("cdolist");
        $sym190$SECOND = SubLObjectFactory.makeSymbol("SECOND");
        $sym191$FILE_WRITE_DATE = SubLObjectFactory.makeSymbol("FILE-WRITE-DATE");
        $str192$_ = SubLObjectFactory.makeString("\\");
        $list193 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("/"), (SubLObject)SubLObjectFactory.makeString("\\"));
        $str194$Could_not_find__A = SubLObjectFactory.makeString("Could not find ~A");
        $str195$Could_not_find__A_A = SubLObjectFactory.makeString("Could not find ~A~A");
        $str196$File_not_found_ = SubLObjectFactory.makeString("File not found.");
        $str197$File_not_found_from_directory__A = SubLObjectFactory.makeString("File not found from directory ~A");
        $kw198$UNIX = SubLObjectFactory.makeKeyword("UNIX");
        $kw199$DOS = SubLObjectFactory.makeKeyword("DOS");
        $str200$__ = SubLObjectFactory.makeString("\\\\");
        $kw201$MAC = SubLObjectFactory.makeKeyword("MAC");
        $str202$_ = SubLObjectFactory.makeString(":");
        $str203$Path_type_mismatch_ = SubLObjectFactory.makeString("Path type mismatch.");
        $str204$__ = SubLObjectFactory.makeString("..");
        $str205$Cannot_make_relative_path__A_even = SubLObjectFactory.makeString("Cannot make relative path ~A even more relative ....");
        $str206$Cannot_strip_non_absolute_prefix_ = SubLObjectFactory.makeString("Cannot strip non-absolute prefix ~A from path ~A.");
        $str207$_ = SubLObjectFactory.makeString("-");
        $str208$Warning__unable_to_read_file__s__ = SubLObjectFactory.makeString("Warning: unable to read file ~s~%");
        $str209$make_directory_recursive__could_n = SubLObjectFactory.makeString("make-directory-recursive: could not create ~A since it exists as a file.");
        $str210$Able_to_create_directory__A__but_ = SubLObjectFactory.makeString("Able to create directory ~A, but unable to set permissions.");
        $str211$chmod = SubLObjectFactory.makeString("chmod");
        $str212$ln = SubLObjectFactory.makeString("ln");
        $str213$_s = SubLObjectFactory.makeString("-s");
        $str214$Copy_of__A_to__A_failed___A_has__ = SubLObjectFactory.makeString("Copy of ~A to ~A failed; ~A has ~A bytes, but ~A has ~A.~%");
        $str215$I_m_alive___ = SubLObjectFactory.makeString("I'm alive!~%");
        $str216$Could_not_make_directory__a_with_ = SubLObjectFactory.makeString("Could not make directory ~a with path ~a");
        $str217$File_already_exists___A__ = SubLObjectFactory.makeString("File already exists: ~A~%");
        $sym218$PRINT = SubLObjectFactory.makeSymbol("PRINT");
        $sym219$OPEN_TEXT = SubLObjectFactory.makeSymbol("OPEN-TEXT");
        $sym220$OPEN_BINARY = SubLObjectFactory.makeSymbol("OPEN-BINARY");
        $str221$Cannot_open__A_for_writing___ = SubLObjectFactory.makeString("Cannot open ~A for writing.~%");
        $sym222$FILE_ACCUMULATOR_RESET = SubLObjectFactory.makeSymbol("FILE-ACCUMULATOR-RESET");
        $sym223$FILE_ACCUMULATOR_ADD = SubLObjectFactory.makeSymbol("FILE-ACCUMULATOR-ADD");
        $sym224$FILE_ACCUMULATOR_SIZE = SubLObjectFactory.makeSymbol("FILE-ACCUMULATOR-SIZE");
        $sym225$FILE_ACCUMULATOR_CONTENTS = SubLObjectFactory.makeSymbol("FILE-ACCUMULATOR-CONTENTS");
        $sym226$FILE_ACCUMULATOR_ITERATOR = SubLObjectFactory.makeSymbol("FILE-ACCUMULATOR-ITERATOR");
        $kw227$STREAM = SubLObjectFactory.makeKeyword("STREAM");
        $kw228$WRITER = SubLObjectFactory.makeKeyword("WRITER");
        $kw229$ITEM_COUNT = SubLObjectFactory.makeKeyword("ITEM-COUNT");
        $list230 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STATE"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("WRITER"), (SubLObject)SubLObjectFactory.makeSymbol("ITEM-COUNT")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym231$_KEY = SubLObjectFactory.makeSymbol("&KEY");
        $list232 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("WRITER"), (SubLObject)SubLObjectFactory.makeSymbol("ITEM-COUNT"));
        $list233 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("STREAM"), (SubLObject)SubLObjectFactory.makeKeyword("WRITER"), (SubLObject)SubLObjectFactory.makeKeyword("ITEM-COUNT"));
        $str234$Operation_not_supported_for_file_ = SubLObjectFactory.makeString("Operation not supported for file accumulator ~A.");
        $str235$Operation_not_yet_supported_for_f = SubLObjectFactory.makeString("Operation not yet supported for file accumulator ~A");
        $sym236$TEST_GET_BINARY_DATA_FROM_STREAM = SubLObjectFactory.makeSymbol("TEST-GET-BINARY-DATA-FROM-STREAM");
        $kw237$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw238$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw239$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw240$KB = SubLObjectFactory.makeKeyword("KB");
        $kw241$TINY = SubLObjectFactory.makeKeyword("TINY");
        $kw242$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list243 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("abc"), (SubLObject)SubLObjectFactory.makeInteger(123), (SubLObject)ConsesLow.list((SubLObject)file_utilities.ONE_INTEGER, (SubLObject)file_utilities.TWO_INTEGER, (SubLObject)file_utilities.THREE_INTEGER))), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")));
        $str244$Expected__S__which_is___A__A__of_ = SubLObjectFactory.makeString("Expected ~S, which is [~A,~A) of ~S, got ~S back.");
        $kw245$SUCCESS = SubLObjectFactory.makeKeyword("SUCCESS");
        $kw246$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $list247 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SHOULD-MEMORY-MAP-FILES?*", "SUBLISP"), (SubLObject)file_utilities.T));
        $list248 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SHOULD-MEMORY-MAP-FILES?*", "SUBLISP")));
        $str249$ads65jh3_ = SubLObjectFactory.makeString("ads65jh3/");
        $str250$Couldn_t_test_creation_of__S__as_ = SubLObjectFactory.makeString("Couldn't test creation of ~S, as it already is a known directory");
        $str251$Failed_to_create_or_delete__S = SubLObjectFactory.makeString("Failed to create or delete ~S");
        $str252$ds6sdg32 = SubLObjectFactory.makeString("ds6sdg32");
        $str253$Couldn_t_test_creation_and_deleti = SubLObjectFactory.makeString("Couldn't test creation and deletion of subdirectories in ~S, as it is not known to be a directory");
        $list254 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("data"));
        $str255$ads65jh3 = SubLObjectFactory.makeString("ads65jh3");
        $sym256$TEST_DIRECTORY_CREATION_AND_DELETION = SubLObjectFactory.makeSymbol("TEST-DIRECTORY-CREATION-AND-DELETION");
        $list257 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)file_utilities.NIL, (SubLObject)file_utilities.T));
    }
}

/*

	Total time: 1189 ms
	 synthetic 
*/