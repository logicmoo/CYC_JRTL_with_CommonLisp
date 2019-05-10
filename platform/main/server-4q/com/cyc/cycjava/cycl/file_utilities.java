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

public final class file_utilities
    extends
      SubLTranslatedFile
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
  static boolean assertionsDisabledSynth = true;

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 730L)
  public static SubLObject with_stream_buffer_size(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list2 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject size = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list2 );
    size = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym3$CLET, reader.bq_cons( ConsesLow.list( $sym4$_STREAM_INITIAL_INPUT_BUFFER_SIZE_, size ), $list5 ), $list6, ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list2 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 1080L)
  public static SubLObject possibly_with_text_file(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject stream = NIL;
    SubLObject filename = NIL;
    SubLObject direction = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    stream = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    filename = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    direction = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject filename_var = $sym8$FILENAME_VAR;
      return ConsesLow.list( $sym3$CLET, ConsesLow.list( ConsesLow.list( filename_var, filename ) ), ConsesLow.list( $sym9$PIF, filename_var, ConsesLow.listS( $sym10$WITH_TEXT_FILE, ConsesLow.list( stream, filename_var,
          direction ), ConsesLow.append( body, NIL ) ), ConsesLow.listS( $sym3$CLET, ConsesLow.list( reader.bq_cons( stream, $list11 ) ), ConsesLow.append( body, NIL ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list7 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 1418L)
  public static SubLObject possibly_with_private_text_file(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject stream = NIL;
    SubLObject filename = NIL;
    SubLObject direction = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    stream = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    filename = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    direction = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject filename_var = $sym12$FILENAME_VAR;
      return ConsesLow.list( $sym3$CLET, ConsesLow.list( ConsesLow.list( filename_var, filename ) ), ConsesLow.list( $sym9$PIF, filename_var, ConsesLow.listS( $sym13$WITH_PRIVATE_TEXT_FILE, ConsesLow.list( stream,
          filename_var, direction ), ConsesLow.append( body, NIL ) ), ConsesLow.listS( $sym3$CLET, ConsesLow.list( reader.bq_cons( stream, $list11 ) ), ConsesLow.append( body, NIL ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list7 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 1772L)
  public static SubLObject possibly_with_binary_file(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject stream = NIL;
    SubLObject filename = NIL;
    SubLObject direction = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    stream = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    filename = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    direction = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject filename_var = $sym14$FILENAME_VAR;
      return ConsesLow.list( $sym3$CLET, ConsesLow.list( ConsesLow.list( filename_var, filename ) ), ConsesLow.list( $sym9$PIF, filename_var, ConsesLow.listS( $sym15$WITH_BINARY_FILE, ConsesLow.list( stream,
          filename_var, direction ), ConsesLow.append( body, NIL ) ), ConsesLow.listS( $sym3$CLET, ConsesLow.list( reader.bq_cons( stream, $list11 ) ), ConsesLow.append( body, NIL ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list7 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 2114L)
  public static SubLObject possibly_with_private_binary_file(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject stream = NIL;
    SubLObject filename = NIL;
    SubLObject direction = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    stream = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    filename = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    direction = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject filename_var = $sym16$FILENAME_VAR;
      return ConsesLow.list( $sym3$CLET, ConsesLow.list( ConsesLow.list( filename_var, filename ) ), ConsesLow.list( $sym9$PIF, filename_var, ConsesLow.listS( $sym17$WITH_PRIVATE_BINARY_FILE, ConsesLow.list( stream,
          filename_var, direction ), ConsesLow.append( body, NIL ) ), ConsesLow.listS( $sym3$CLET, ConsesLow.list( reader.bq_cons( stream, $list11 ) ), ConsesLow.append( body, NIL ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list7 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 2472L)
  public static SubLObject peek_byte_from_char_stream(SubLObject stream, SubLObject eof_error_p, SubLObject eof_value)
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
    final SubLObject byte_as_char = streams_high.peek_char( NIL, stream, NIL, $kw18$EOF, UNPROVIDED );
    if( $kw18$EOF != byte_as_char )
    {
      return Characters.char_code( byte_as_char );
    }
    if( NIL == eof_error_p )
    {
      return eof_value;
    }
    return streams_high.peek_char( NIL, stream, T, eof_value, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 3166L)
  public static SubLObject read_byte_from_char_stream(SubLObject stream, SubLObject eof_error_p, SubLObject eof_value)
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
    final SubLObject byte_as_char = streams_high.read_char( stream, NIL, $kw18$EOF, UNPROVIDED );
    if( $kw18$EOF != byte_as_char )
    {
      return Characters.char_code( byte_as_char );
    }
    if( NIL == eof_error_p )
    {
      return eof_value;
    }
    return streams_high.read_char( stream, T, eof_value, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 3550L)
  public static SubLObject unread_byte_from_char_stream(final SubLObject v_byte, SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_input$.getDynamicValue();
    }
    final SubLObject byte_as_char = Characters.code_char( v_byte );
    return streams_high.unread_char( byte_as_char, stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 3785L)
  public static SubLObject write_byte_to_char_stream(final SubLObject v_byte, SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    final SubLObject byte_as_char = Characters.code_char( v_byte );
    return streams_high.write_char( byte_as_char, stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 4016L)
  public static SubLObject stream_designator_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isStream() || v_object == T || v_object == NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 4245L)
  public static SubLObject pathname_designator_p(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject error = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym19$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          Filesys.probe_file( v_object );
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
    return Types.sublisp_null( error );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 4547L)
  public static SubLObject load_from_cyc_home(final SubLObject filename)
  {
    return Eval.load( cyc_home_filename( NIL, filename, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 4644L)
  public static SubLObject cyc_home_filename(final SubLObject subdirectory_list, final SubLObject filename, SubLObject extension)
  {
    if( extension == UNPROVIDED )
    {
      extension = NIL;
    }
    assert NIL != Types.listp( subdirectory_list ) : subdirectory_list;
    return relative_filename( system_info.$cyc_home_directory$.getGlobalValue(), Filesys.construct_filename( subdirectory_list, filename, extension, T ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 5050L)
  public static SubLObject cyc_home_subdirectory(final SubLObject subdirectory_list)
  {
    assert NIL != Types.listp( subdirectory_list ) : subdirectory_list;
    return relative_filename( system_info.$cyc_home_directory$.getGlobalValue(), Filesys.construct_filename( subdirectory_list, $str22$, NIL, T ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 5352L)
  public static SubLObject canonical_cyc_working_directory()
  {
    return string_utilities.to_string( Filesys.probe_file( $str23$_ ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 5551L)
  public static SubLObject relative_filename(final SubLObject directory_string, final SubLObject filename, SubLObject extension)
  {
    if( extension == UNPROVIDED )
    {
      extension = NIL;
    }
    assert NIL != Types.stringp( directory_string ) : directory_string;
    return Sequences.cconcatenate( directory_string, basic_filename( filename, extension ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 5932L)
  public static SubLObject basic_filename(final SubLObject filename, SubLObject extension)
  {
    if( extension == UNPROVIDED )
    {
      extension = NIL;
    }
    if( NIL == extension )
    {
      return filename;
    }
    return Filesys.construct_filename( NIL, filename, extension, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 6470L)
  public static SubLObject temp_directory()
  {
    final SubLObject temp_dir = subl_promotions.get_temp_directory();
    if( NIL != temp_dir )
    {
      return possibly_append_path_separator_char( temp_dir );
    }
    return $temp_directory$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 6734L)
  public static SubLObject random_path_char()
  {
    return Strings.sublisp_char( $random_path_chars$.getGlobalValue(), random.random( $int30$36 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 6818L)
  public static SubLObject make_temp_filename(SubLObject directory_string)
  {
    if( directory_string == UNPROVIDED )
    {
      directory_string = $temp_directory$.getGlobalValue();
    }
    assert NIL != Types.stringp( directory_string ) : directory_string;
    final SubLObject filename = random_filename_part( EIGHT_INTEGER );
    return relative_filename( possibly_append_path_separator_char( directory_string ), filename, $str31$tmp );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 7168L)
  public static SubLObject random_filename_part(SubLObject length)
  {
    if( length == UNPROVIDED )
    {
      length = EIGHT_INTEGER;
    }
    final SubLObject part = Strings.make_string( length, Characters.CHAR_space );
    SubLObject i;
    for( i = NIL, i = ZERO_INTEGER; i.numL( length ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      Strings.set_char( part, i, random_path_char() );
    }
    return part;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 7473L)
  public static SubLObject make_unused_temp_filename(SubLObject directory_string)
  {
    if( directory_string == UNPROVIDED )
    {
      directory_string = $temp_directory$.getGlobalValue();
    }
    SubLObject filename;
    for( filename = NIL; NIL == filename || NIL != Filesys.probe_file( filename ); filename = Strings.string_downcase( make_temp_filename( directory_string ), UNPROVIDED, UNPROVIDED ) )
    {
    }
    return filename;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 7877L)
  public static SubLObject make_prefixed_temp_filename(final SubLObject prefix, SubLObject directory_string)
  {
    if( directory_string == UNPROVIDED )
    {
      directory_string = $temp_directory$.getGlobalValue();
    }
    assert NIL != Types.stringp( directory_string ) : directory_string;
    final SubLObject random_part = random_filename_part( EIGHT_INTEGER );
    final SubLObject filename = Sequences.cconcatenate( prefix, random_part );
    return relative_filename( directory_string, filename, $str31$tmp );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 8276L)
  public static SubLObject open_temp_file(SubLObject element_type, SubLObject directory)
  {
    if( element_type == UNPROVIDED )
    {
      element_type = $kw32$TEXT;
    }
    if( directory == UNPROVIDED )
    {
      directory = $temp_directory$.getGlobalValue();
    }
    SubLObject stream;
    for( stream = NIL; NIL == stream; stream = StreamsLow.open( make_temp_filename( directory ), new SubLObject[] { $kw33$DIRECTION, $kw34$IO, $kw35$IF_EXISTS, NIL, $kw36$IF_DOES_NOT_EXIST, $kw37$CREATE,
      $kw38$ELEMENT_TYPE, element_type
    } ) )
    {
    }
    return stream;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 8704L)
  public static SubLObject with_temp_file(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list39 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject stream = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list39 );
    stream = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list39 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list39 );
      if( NIL == conses_high.member( current_$1, $list40, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw41$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list39 );
    }
    final SubLObject element_type_tail = cdestructuring_bind.property_list_member( $kw38$ELEMENT_TYPE, current );
    final SubLObject element_type = ( NIL != element_type_tail ) ? conses_high.cadr( element_type_tail ) : $kw32$TEXT;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.list( $sym3$CLET, ConsesLow.list( ConsesLow.list( stream, ConsesLow.list( $sym42$OPEN_TMP_FILE, element_type ) ) ), reader.bq_cons( $sym43$CUNWIND_PROTECT, ConsesLow.append( body, ConsesLow.list(
        ConsesLow.list( $sym44$PWHEN, ConsesLow.list( $sym45$STREAMP, stream ), ConsesLow.list( $sym46$DELETE_FILE, stream ), ConsesLow.list( $sym47$CLOSE, stream ) ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 9048L)
  public static SubLObject with_file_replacement(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list48 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject stream = NIL;
    SubLObject filename = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list48 );
    stream = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list48 );
    filename = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$2 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list48 );
      current_$2 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list48 );
      if( NIL == conses_high.member( current_$2, $list40, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$2 == $kw41$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list48 );
    }
    final SubLObject element_type_tail = cdestructuring_bind.property_list_member( $kw38$ELEMENT_TYPE, current );
    final SubLObject element_type = ( NIL != element_type_tail ) ? conses_high.cadr( element_type_tail ) : $kw32$TEXT;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.list( $sym3$CLET, ConsesLow.list( ConsesLow.list( stream, ConsesLow.list( $sym42$OPEN_TMP_FILE, element_type ) ) ), reader.bq_cons( $sym43$CUNWIND_PROTECT, ConsesLow.append( body, ConsesLow.list(
        ConsesLow.list( $sym44$PWHEN, ConsesLow.list( $sym45$STREAMP, stream ), ConsesLow.list( $sym49$FORCE_OUTPUT, stream ), ConsesLow.list( $sym44$PWHEN, ConsesLow.list( $sym50$PROBE_FILE, filename ), ConsesLow.list(
            $sym46$DELETE_FILE, filename ) ), ConsesLow.list( $sym51$COPY_FILE, ConsesLow.list( $sym52$TO_STRING, ConsesLow.list( $sym50$PROBE_FILE, stream ) ), filename ), ConsesLow.list( $sym46$DELETE_FILE, stream ),
            ConsesLow.list( $sym47$CLOSE, stream ) ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 9842L)
  public static SubLObject with_temporary_filename(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list53 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject filename = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list53 );
    filename = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$3 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list53 );
      current_$3 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list53 );
      if( NIL == conses_high.member( current_$3, $list54, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$3 == $kw41$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list53 );
    }
    final SubLObject directory_tail = cdestructuring_bind.property_list_member( $kw55$DIRECTORY, current );
    final SubLObject directory = ( NIL != directory_tail ) ? conses_high.cadr( directory_tail ) : $temp_directory$.getGlobalValue();
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.list( $sym3$CLET, ConsesLow.list( ConsesLow.list( filename, ConsesLow.list( $sym56$MAKE_TEMP_FILENAME, directory ) ) ), ConsesLow.list( $sym43$CUNWIND_PROTECT, reader.bq_cons( $sym57$PROGN, ConsesLow
        .append( body, NIL ) ), ConsesLow.list( $sym58$IGNORE_ERRORS, ConsesLow.list( $sym46$DELETE_FILE, filename ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 10298L)
  public static SubLObject open_tmp_file(SubLObject element_type, SubLObject directory)
  {
    if( element_type == UNPROVIDED )
    {
      element_type = $kw32$TEXT;
    }
    if( directory == UNPROVIDED )
    {
      directory = $temp_directory$.getGlobalValue();
    }
    return open_temp_file( element_type, directory );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 10478L)
  public static SubLObject with_tmp_file(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list60 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject stream = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list60 );
    stream = current.first();
    current = current.rest();
    final SubLObject element_type = current.isCons() ? current.first() : $kw32$TEXT;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list60 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      access_macros.defmacro_obsolete_warning( $sym61$WITH_TMP_FILE, $list62 );
      return ConsesLow.listS( $sym63$WITH_TEMP_FILE, ConsesLow.list( stream, $kw38$ELEMENT_TYPE, element_type ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list60 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 10673L)
  public static SubLObject directory_writeable_p(final SubLObject directory_string, SubLObject byte_size)
  {
    if( byte_size == UNPROVIDED )
    {
      byte_size = ZERO_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( directory_string ) : directory_string;
    assert NIL != Types.integerp( byte_size ) : byte_size;
    if( NIL == Filesys.directory_p( directory_string ) )
    {
      return NIL;
    }
    final SubLObject temp_file = make_temp_filename( directory_string );
    SubLObject created = NIL;
    SubLObject sized = NIL;
    SubLObject writeable = NIL;
    SubLObject ignore_errors_tag = NIL;
    try
    {
      thread.throwStack.push( $kw65$IGNORE_ERRORS_TARGET );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( Symbols.symbol_function( $sym66$IGNORE_ERRORS_HANDLER ), thread );
        try
        {
          try
          {
            SubLObject stream = NIL;
            try
            {
              final SubLObject _prev_bind_0_$4 = stream_macros.$stream_requires_locking$.currentBinding( thread );
              try
              {
                stream_macros.$stream_requires_locking$.bind( NIL, thread );
                stream = compatibility.open_binary( temp_file, $kw67$OUTPUT );
              }
              finally
              {
                stream_macros.$stream_requires_locking$.rebind( _prev_bind_0_$4, thread );
              }
              if( !stream.isStream() )
              {
                Errors.error( $str68$Unable_to_open__S, temp_file );
              }
              final SubLObject s = stream;
              created = T;
              sized = T;
            }
            finally
            {
              final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                if( stream.isStream() )
                {
                  streams_high.close( stream, UNPROVIDED );
                }
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$5, thread );
              }
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values2 = Values.getValuesAsVector();
              if( NIL != created )
              {
                if( NIL != sized )
                {
                  writeable = list_utilities.sublisp_boolean( Filesys.probe_file( temp_file ) );
                }
                Filesys.delete_file( temp_file );
              }
              Values.restoreValuesFromVector( _values2 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$6, thread );
            }
          }
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
      ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw65$IGNORE_ERRORS_TARGET );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return writeable;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 11843L)
  public static SubLObject file_valid_for_writing_p(final SubLObject file_string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject validP = NIL;
    if( file_string.isString() )
    {
      SubLObject ignore_errors_tag = NIL;
      try
      {
        thread.throwStack.push( $kw65$IGNORE_ERRORS_TARGET );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( Symbols.symbol_function( $sym66$IGNORE_ERRORS_HANDLER ), thread );
          try
          {
            if( NIL != Filesys.probe_file( file_string ) || NIL != directory_writeable_p( reconstruct_path( deconstruct_path( file_string ), $str22$, UNPROVIDED ), UNPROVIDED ) )
            {
              validP = T;
            }
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
        ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw65$IGNORE_ERRORS_TARGET );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    return validP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 12230L)
  public static SubLObject delete_file_if_exists(final SubLObject filename)
  {
    if( NIL != Filesys.probe_file( filename ) )
    {
      return Filesys.delete_file( filename );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 12345L)
  public static SubLObject clean_filename(final SubLObject filename)
  {
    final SubLObject string_var;
    final SubLObject frobbed_filename = string_var = Sequences.copy_seq( filename );
    SubLObject end_var_$7;
    SubLObject end_var;
    SubLObject i;
    SubLObject ch;
    for( end_var = ( end_var_$7 = Sequences.length( string_var ) ), i = NIL, i = ZERO_INTEGER; !i.numGE( end_var_$7 ); i = number_utilities.f_1X( i ) )
    {
      ch = Strings.sublisp_char( string_var, i );
      if( NIL == Characters.alphanumericp( ch ) )
      {
        Strings.set_char( frobbed_filename, i, Characters.CHAR_hyphen );
      }
    }
    return frobbed_filename;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 12652L)
  public static SubLObject append_files(final SubLObject f1, final SubLObject f2, SubLObject mode)
  {
    if( mode == UNPROVIDED )
    {
      mode = $kw32$TEXT;
    }
    SubLObject reader = NIL;
    SubLObject writer = NIL;
    final SubLObject pcase_var = mode;
    if( pcase_var.eql( $kw32$TEXT ) )
    {
      reader = Symbols.symbol_function( $sym69$READ_CHAR );
      writer = Symbols.symbol_function( $sym70$WRITE_CHAR );
    }
    else if( pcase_var.eql( $kw71$BINARY ) || pcase_var.eql( $kw72$DEFAULT ) )
    {
      reader = Symbols.symbol_function( $sym73$READ_BYTE );
      writer = Symbols.symbol_function( $sym74$WRITE_BYTE );
    }
    else
    {
      Errors.error( $str75$_S_is_not_a_valid_mode_, mode );
    }
    SubLObject stream_var = NIL;
    try
    {
      final SubLObject in;
      stream_var = ( in = StreamsLow.open( f1, new SubLObject[] { $kw38$ELEMENT_TYPE, mode, $kw36$IF_DOES_NOT_EXIST, NIL
      } ) );
      if( NIL != in )
      {
        SubLObject stream_var_$8 = NIL;
        try
        {
          final SubLObject out;
          stream_var_$8 = ( out = StreamsLow.open( f2, new SubLObject[] { $kw33$DIRECTION, $kw67$OUTPUT, $kw35$IF_EXISTS, $kw76$APPEND, $kw38$ELEMENT_TYPE, mode, $kw36$IF_DOES_NOT_EXIST, $kw37$CREATE
          } ) );
          SubLObject elt;
          for( elt = NIL, elt = Functions.funcall( reader, in, NIL, NIL ); NIL != elt; elt = Functions.funcall( reader, in, NIL, NIL ) )
          {
            Functions.funcall( writer, elt, out );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
          try
          {
            Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
            final SubLObject _values = Values.getValuesAsVector();
            if( NIL != stream_var_$8 )
            {
              streams_high.close( stream_var_$8, UNPROVIDED );
            }
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
          }
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
        if( NIL != stream_var )
        {
          streams_high.close( stream_var, UNPROVIDED );
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

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 13387L)
  public static SubLObject cdolines(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list77 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject file = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list77 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list77 );
    file = current.first();
    current = current.rest();
    final SubLObject done = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list77 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject infile = $sym78$INFILE;
      return ConsesLow.list( $sym13$WITH_PRIVATE_TEXT_FILE, ConsesLow.listS( infile, file, $list79 ), ConsesLow.list( $sym44$PWHEN, ConsesLow.list( $sym45$STREAMP, infile ), ConsesLow.listS( $sym80$CDO, ConsesLow.list(
          ConsesLow.list( var, ConsesLow.list( $sym81$CDOLINES_GET_NEXT_LINE, infile ), ConsesLow.list( $sym81$CDOLINES_GET_NEXT_LINE, infile ) ) ), ConsesLow.list( ConsesLow.list( $sym82$COR, ConsesLow.list(
              $sym83$NULL, var ), done ) ), ConsesLow.append( body, NIL ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list77 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 13891L)
  public static SubLObject cdolines_get_next_line(final SubLObject infile)
  {
    return string_utilities.network_read_line( infile, NIL, NIL, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 14011L)
  public static SubLObject do_stream_lines(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list85 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject line_var = NIL;
    SubLObject stream = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list85 );
    line_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list85 );
    stream = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$9 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list85 );
      current_$9 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list85 );
      if( NIL == conses_high.member( current_$9, $list86, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$9 == $kw41$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list85 );
    }
    final SubLObject line_number_tail = cdestructuring_bind.property_list_member( $kw87$LINE_NUMBER, current );
    final SubLObject line_number = ( NIL != line_number_tail ) ? conses_high.cadr( line_number_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw88$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    if( NIL == line_number )
    {
      final SubLObject line_number_var = $sym89$LINE_NUMBER_VAR;
      return ConsesLow.listS( $sym90$DO_STREAM_LINES, ConsesLow.list( line_var, stream, $kw87$LINE_NUMBER, line_number_var, $kw88$DONE, done ), ConsesLow.append( body, NIL ) );
    }
    final SubLObject stream_var = $sym91$STREAM_VAR;
    assert NIL != Types.symbolp( line_number ) : line_number;
    return ConsesLow.list( $sym3$CLET, ConsesLow.list( ConsesLow.list( stream_var, stream ) ), ConsesLow.listS( $sym80$CDO, ConsesLow.list( ConsesLow.list( line_number, ZERO_INTEGER, ConsesLow.list( $sym93$1_,
        line_number ) ), ConsesLow.list( line_var, ConsesLow.list( $sym94$DO_STREAM_LINES_GET_NEXT_LINE, stream_var ), ConsesLow.list( $sym94$DO_STREAM_LINES_GET_NEXT_LINE, stream_var ) ) ), ConsesLow.list( ConsesLow
            .list( $sym82$COR, done, ConsesLow.list( $sym83$NULL, line_var ) ) ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 14938L)
  public static SubLObject do_stream_lines_get_next_line(final SubLObject stream)
  {
    return string_utilities.network_read_line( stream, NIL, NIL, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 15072L)
  public static SubLObject do_file_lines(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list95 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject line_var = NIL;
    SubLObject file = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list95 );
    line_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list95 );
    file = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$10 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list95 );
      current_$10 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list95 );
      if( NIL == conses_high.member( current_$10, $list96, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$10 == $kw41$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list95 );
    }
    final SubLObject line_number_tail = cdestructuring_bind.property_list_member( $kw87$LINE_NUMBER, current );
    final SubLObject line_number = ( NIL != line_number_tail ) ? conses_high.cadr( line_number_tail ) : NIL;
    final SubLObject progress_message_tail = cdestructuring_bind.property_list_member( $kw97$PROGRESS_MESSAGE, current );
    final SubLObject progress_message = ( NIL != progress_message_tail ) ? conses_high.cadr( progress_message_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw88$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    if( NIL == progress_message )
    {
      final SubLObject file_var = $sym98$FILE_VAR;
      final SubLObject stream_var = $sym99$STREAM_VAR;
      return ConsesLow.list( $sym3$CLET, ConsesLow.list( ConsesLow.list( file_var, file ) ), ConsesLow.list( $sym13$WITH_PRIVATE_TEXT_FILE, ConsesLow.listS( stream_var, file_var, $list79 ), ConsesLow.list( $sym44$PWHEN,
          ConsesLow.list( $sym45$STREAMP, stream_var ), ConsesLow.listS( $sym90$DO_STREAM_LINES, ConsesLow.list( line_var, stream_var, $kw87$LINE_NUMBER, line_number, $kw88$DONE, done ), ConsesLow.append( body,
              NIL ) ) ) ) );
    }
    final SubLObject file_var = $sym100$FILE_VAR;
    final SubLObject stream_var = $sym101$STREAM_VAR;
    final SubLObject length_var = $sym102$LENGTH_VAR;
    return ConsesLow.list( $sym103$NOTING_PERCENT_PROGRESS, progress_message, ConsesLow.list( $sym3$CLET, ConsesLow.list( ConsesLow.list( file_var, file ) ), ConsesLow.list( $sym13$WITH_PRIVATE_TEXT_FILE, ConsesLow
        .listS( stream_var, file_var, $list79 ), ConsesLow.list( $sym44$PWHEN, ConsesLow.list( $sym45$STREAMP, stream_var ), ConsesLow.list( $sym3$CLET, ConsesLow.list( ConsesLow.list( length_var, ConsesLow.list(
            $sym104$FILE_LENGTH, stream_var ) ) ), ConsesLow.listS( $sym90$DO_STREAM_LINES, ConsesLow.list( line_var, stream_var, $kw87$LINE_NUMBER, line_number, $kw88$DONE, done ), ConsesLow.append( body, ConsesLow
                .list( ConsesLow.list( $sym105$NOTE_PERCENT_PROGRESS, ConsesLow.list( $sym106$FILE_POSITION, stream_var ), length_var ) ) ) ) ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 16394L)
  public static SubLObject count_file_lines(final SubLObject file)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject count = ZERO_INTEGER;
    SubLObject stream = NIL;
    try
    {
      final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
      try
      {
        stream_macros.$stream_requires_locking$.bind( NIL, thread );
        stream = compatibility.open_text( file, $kw107$INPUT );
      }
      finally
      {
        stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
      }
      if( !stream.isStream() )
      {
        Errors.error( $str68$Unable_to_open__S, file );
      }
      final SubLObject stream_var = stream;
      if( stream_var.isStream() )
      {
        final SubLObject stream_var_$11 = stream_var;
        SubLObject line_number_var = NIL;
        SubLObject line = NIL;
        line_number_var = ZERO_INTEGER;
        for( line = do_stream_lines_get_next_line( stream_var_$11 ); NIL != line; line = do_stream_lines_get_next_line( stream_var_$11 ) )
        {
          count = Numbers.add( count, ONE_INTEGER );
          line_number_var = number_utilities.f_1X( line_number_var );
        }
      }
    }
    finally
    {
      final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        if( stream.isStream() )
        {
          streams_high.close( stream, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 16594L)
  public static SubLObject do_csv_file_lines(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list108 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject tokenized_line = NIL;
    SubLObject file = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list108 );
    tokenized_line = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list108 );
    file = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$12 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list108 );
      current_$12 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list108 );
      if( NIL == conses_high.member( current_$12, $list109, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$12 == $kw41$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list108 );
    }
    final SubLObject break_list_tail = cdestructuring_bind.property_list_member( $kw110$BREAK_LIST, current );
    final SubLObject break_list = ( NIL != break_list_tail ) ? conses_high.cadr( break_list_tail ) : $list111;
    final SubLObject embed_list_tail = cdestructuring_bind.property_list_member( $kw112$EMBED_LIST, current );
    final SubLObject embed_list = ( NIL != embed_list_tail ) ? conses_high.cadr( embed_list_tail ) : $list113;
    final SubLObject include_stops_tail = cdestructuring_bind.property_list_member( $kw114$INCLUDE_STOPS, current );
    final SubLObject include_stops = ( NIL != include_stops_tail ) ? conses_high.cadr( include_stops_tail ) : NIL;
    final SubLObject ignore_empty_strings_tail = cdestructuring_bind.property_list_member( $kw115$IGNORE_EMPTY_STRINGS, current );
    final SubLObject ignore_empty_strings = ( NIL != ignore_empty_strings_tail ) ? conses_high.cadr( ignore_empty_strings_tail ) : NIL;
    final SubLObject quote_chars_tail = cdestructuring_bind.property_list_member( $kw116$QUOTE_CHARS, current );
    final SubLObject quote_chars = ( NIL != quote_chars_tail ) ? conses_high.cadr( quote_chars_tail ) : $list117;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject line = $sym118$LINE;
    return ConsesLow.list( $sym119$DO_FILE_LINES, ConsesLow.list( line, file ), ConsesLow.listS( $sym3$CLET, ConsesLow.list( ConsesLow.list( tokenized_line, ConsesLow.list( $sym120$STRING_TOKENIZE, line, break_list,
        embed_list, include_stops, ignore_empty_strings, quote_chars ) ) ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 17027L)
  public static SubLObject cdolines_tokenized(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list121 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject file = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list121 );
    file = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$13 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list121 );
      current_$13 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list121 );
      if( NIL == conses_high.member( current_$13, $list109, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$13 == $kw41$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list121 );
    }
    final SubLObject break_list_tail = cdestructuring_bind.property_list_member( $kw110$BREAK_LIST, current );
    final SubLObject break_list = ( NIL != break_list_tail ) ? conses_high.cadr( break_list_tail ) : $list122;
    final SubLObject embed_list_tail = cdestructuring_bind.property_list_member( $kw112$EMBED_LIST, current );
    final SubLObject embed_list = ( NIL != embed_list_tail ) ? conses_high.cadr( embed_list_tail ) : NIL;
    final SubLObject include_stops_tail = cdestructuring_bind.property_list_member( $kw114$INCLUDE_STOPS, current );
    final SubLObject include_stops = ( NIL != include_stops_tail ) ? conses_high.cadr( include_stops_tail ) : NIL;
    final SubLObject ignore_empty_strings_tail = cdestructuring_bind.property_list_member( $kw115$IGNORE_EMPTY_STRINGS, current );
    final SubLObject ignore_empty_strings = ( NIL != ignore_empty_strings_tail ) ? conses_high.cadr( ignore_empty_strings_tail ) : T;
    final SubLObject quote_chars_tail = cdestructuring_bind.property_list_member( $kw116$QUOTE_CHARS, current );
    final SubLObject quote_chars = ( NIL != quote_chars_tail ) ? conses_high.cadr( quote_chars_tail ) : NIL;
    current = temp;
    SubLObject lambda_list = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list121 );
    lambda_list = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    final SubLObject line = $sym123$LINE;
    return ConsesLow.list( $sym84$CDOLINES, ConsesLow.list( line, file ), ConsesLow.listS( $sym124$CDESTRUCTURING_BIND, lambda_list, ConsesLow.list( $sym125$MAPCAR, $list126, ConsesLow.listS( $sym120$STRING_TOKENIZE,
        line, ConsesLow.append( ConsesLow.list( break_list, embed_list, include_stops, ignore_empty_strings, quote_chars ), NIL ) ) ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 17943L)
  public static SubLObject cdolines_read(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list77 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject file = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list77 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list77 );
    file = current.first();
    current = current.rest();
    final SubLObject done = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list77 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject line = $sym127$LINE;
      final SubLObject line_index = $sym128$LINE_INDEX;
      final SubLObject done_int = $sym129$DONE_INT;
      return ConsesLow.list( $sym3$CLET, ConsesLow.list( done_int ), ConsesLow.list( $sym84$CDOLINES, ConsesLow.list( line, file, done_int ), ConsesLow.list( $sym3$CLET, ConsesLow.list( reader.bq_cons( line_index,
          $list130 ), reader.bq_cons( var, $list131 ) ), ConsesLow.list( $sym132$WHILE, ConsesLow.list( $sym133$_, line_index, ConsesLow.list( $sym134$LENGTH, line ) ), ConsesLow.list( $sym135$CMULTIPLE_VALUE_BIND,
              $list136, ConsesLow.list( $sym137$READ_FROM_STRING, line, NIL, NIL, line_index ), ConsesLow.list( $sym138$CPUSH, $sym139$ITEM, var ), ConsesLow.listS( $sym140$CSETQ, line_index, $list141 ) ) ), ConsesLow
                  .list( $sym140$CSETQ, var, ConsesLow.list( $sym142$NREVERSE, var ) ), ConsesLow.list( $sym140$CSETQ, done_int, done ), ConsesLow.listS( $sym143$PUNLESS, done, ConsesLow.append( body, NIL ) ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list77 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 18736L)
  public static SubLObject do_file_records(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list144 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject record = NIL;
    SubLObject file = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list144 );
    record = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list144 );
    file = current.first();
    current = current.rest();
    final SubLObject separator_test = current.isCons() ? current.first() : Symbols.symbol_function( $sym145$WHITESPACE_STRING_ );
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list144 );
    current = current.rest();
    final SubLObject ignore_test = current.isCons() ? current.first() : Symbols.symbol_function( $sym146$FALSE );
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list144 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject instream = $sym147$INSTREAM;
      final SubLObject line = $sym148$LINE;
      return ConsesLow.list( $sym13$WITH_PRIVATE_TEXT_FILE, ConsesLow.listS( instream, file, $list79 ), ConsesLow.list( $sym44$PWHEN, ConsesLow.list( $sym149$INPUT_STREAM_P, instream ), ConsesLow.list( $sym3$CLET,
          ConsesLow.list( record ), ConsesLow.list( $sym80$CDO, ConsesLow.list( ConsesLow.list( line, ConsesLow.listS( $sym150$NETWORK_READ_LINE, instream, $list151 ), ConsesLow.listS( $sym150$NETWORK_READ_LINE,
              instream, $list151 ) ) ), ConsesLow.list( ConsesLow.list( $sym83$NULL, line ) ), ConsesLow.listS( $sym140$CSETQ, record, $list11 ), ConsesLow.list( $sym143$PUNLESS, ConsesLow.list( $sym82$COR, ConsesLow
                  .list( $sym152$FUNCALL, ignore_test, line ), ConsesLow.list( $sym152$FUNCALL, separator_test, line ) ), ConsesLow.list( $sym138$CPUSH, line, record ), ConsesLow.list( $sym80$CDO, ConsesLow.list(
                      ConsesLow.list( line, ConsesLow.listS( $sym150$NETWORK_READ_LINE, instream, $list151 ), ConsesLow.listS( $sym150$NETWORK_READ_LINE, instream, $list151 ) ) ), ConsesLow.list( ConsesLow.list(
                          $sym82$COR, ConsesLow.list( $sym83$NULL, line ), ConsesLow.list( $sym152$FUNCALL, separator_test, line ) ) ), ConsesLow.list( $sym143$PUNLESS, ConsesLow.list( $sym152$FUNCALL, ignore_test,
                              line ), ConsesLow.list( $sym138$CPUSH, line, record ) ) ) ), ConsesLow.listS( $sym44$PWHEN, record, ConsesLow.list( $sym140$CSETQ, record, ConsesLow.list( $sym142$NREVERSE, record ) ),
                                  ConsesLow.append( body, NIL ) ) ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list144 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 19994L)
  public static SubLObject do_directory_contents(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list153 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject file_var = NIL;
    SubLObject directory = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list153 );
    file_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list153 );
    directory = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$14 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list153 );
      current_$14 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list153 );
      if( NIL == conses_high.member( current_$14, $list154, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$14 == $kw41$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list153 );
    }
    final SubLObject include_directoryP_tail = cdestructuring_bind.property_list_member( $kw155$INCLUDE_DIRECTORY_, current );
    final SubLObject include_directoryP = ( NIL != include_directoryP_tail ) ? conses_high.cadr( include_directoryP_tail ) : T;
    final SubLObject progress_message_tail = cdestructuring_bind.property_list_member( $kw97$PROGRESS_MESSAGE, current );
    final SubLObject progress_message = ( NIL != progress_message_tail ) ? conses_high.cadr( progress_message_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw88$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject sort_fn_tail = cdestructuring_bind.property_list_member( $kw156$SORT_FN, current );
    final SubLObject sort_fn = ( NIL != sort_fn_tail ) ? conses_high.cadr( sort_fn_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject directory_contents_var = $sym157$DIRECTORY_CONTENTS_VAR;
    final SubLObject progress_message_var = $sym158$PROGRESS_MESSAGE_VAR;
    return ConsesLow.list( $sym57$PROGN, ConsesLow.listS( $sym159$CHECK_TYPE, directory, $list160 ), ConsesLow.list( $sym3$CLET, ConsesLow.list( ConsesLow.list( directory_contents_var, ConsesLow.list( $sym161$DIRECTORY,
        directory, include_directoryP ) ), ConsesLow.list( progress_message_var, progress_message ), ConsesLow.list( $sym162$_SILENT_PROGRESS__, ConsesLow.list( $sym163$CNOT, ConsesLow.list( $sym24$STRINGP,
            progress_message_var ) ) ) ), ConsesLow.list( $sym44$PWHEN, ConsesLow.list( $sym164$FUNCTION_SPEC_P, sort_fn ), ConsesLow.list( $sym140$CSETQ, directory_contents_var, ConsesLow.list( $sym165$SORT,
                directory_contents_var, sort_fn ) ) ), ConsesLow.listS( $sym166$PROGRESS_CSOME, ConsesLow.list( file_var, directory_contents_var, progress_message_var, done ), ConsesLow.append( body, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 20925L)
  public static SubLObject do_directory_subdirectories(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list167 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject subdirectory = NIL;
    SubLObject directory = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list167 );
    subdirectory = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list167 );
    directory = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$15 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list167 );
      current_$15 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list167 );
      if( NIL == conses_high.member( current_$15, $list168, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$15 == $kw41$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list167 );
    }
    final SubLObject include_directoryP_tail = cdestructuring_bind.property_list_member( $kw155$INCLUDE_DIRECTORY_, current );
    final SubLObject include_directoryP = ( NIL != include_directoryP_tail ) ? conses_high.cadr( include_directoryP_tail ) : T;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.list( $sym169$DO_DIRECTORY_CONTENTS, ConsesLow.list( subdirectory, directory, $kw155$INCLUDE_DIRECTORY_, include_directoryP ), ConsesLow.listS( $sym44$PWHEN, ConsesLow.list( $sym170$DIRECTORY_P,
        ConsesLow.list( $sym171$FCOND, ConsesLow.list( include_directoryP, subdirectory ), ConsesLow.list( ConsesLow.listS( $sym172$ENDS_WITH, directory, $list173 ), ConsesLow.list( $sym174$CCONCATENATE, directory,
            subdirectory ) ), ConsesLow.list( T, ConsesLow.list( $sym174$CCONCATENATE, directory, $str175$_, subdirectory ) ) ) ), ConsesLow.list( $sym143$PUNLESS, ConsesLow.listS( EQL, ConsesLow.list( $sym176$LAST_CHAR,
                subdirectory ), $list177 ), ConsesLow.list( $sym140$CSETQ, subdirectory, ConsesLow.listS( $sym174$CCONCATENATE, subdirectory, $list173 ) ) ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 21487L)
  public static SubLObject do_directory_tree_files(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list178 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject file_var = NIL;
    SubLObject directory = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list178 );
    file_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list178 );
    directory = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$16 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list178 );
      current_$16 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list178 );
      if( NIL == conses_high.member( current_$16, $list179, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$16 == $kw41$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list178 );
    }
    final SubLObject include_directoryP_tail = cdestructuring_bind.property_list_member( $kw155$INCLUDE_DIRECTORY_, current );
    final SubLObject include_directoryP = ( NIL != include_directoryP_tail ) ? conses_high.cadr( include_directoryP_tail ) : T;
    final SubLObject progress_message_tail = cdestructuring_bind.property_list_member( $kw97$PROGRESS_MESSAGE, current );
    final SubLObject progress_message = ( NIL != progress_message_tail ) ? conses_high.cadr( progress_message_tail ) : $str180$Processing_directory_tree_files__;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject directory_list_var = $sym181$DIRECTORY_LIST_VAR;
    final SubLObject current_directory_var = $sym182$CURRENT_DIRECTORY_VAR;
    return ConsesLow.list( $sym57$PROGN, ConsesLow.listS( $sym159$CHECK_TYPE, directory, $list160 ), ConsesLow.list( $sym3$CLET, ConsesLow.list( ConsesLow.list( directory_list_var, ConsesLow.list( $sym183$LIST,
        directory ) ) ), ConsesLow.list( $sym80$CDO, ConsesLow.list( ConsesLow.list( current_directory_var, ConsesLow.list( $sym184$FIRST, directory_list_var ), ConsesLow.list( $sym184$FIRST, directory_list_var ) ) ),
            ConsesLow.list( ConsesLow.list( $sym83$NULL, directory_list_var ) ), ConsesLow.list( $sym185$CPOP, directory_list_var ), ConsesLow.list( $sym169$DO_DIRECTORY_CONTENTS, ConsesLow.list( file_var,
                current_directory_var, $kw155$INCLUDE_DIRECTORY_, include_directoryP, $kw97$PROGRESS_MESSAGE, ConsesLow.list( $sym186$FWHEN, ConsesLow.list( $sym24$STRINGP, progress_message ), ConsesLow.list(
                    $sym174$CCONCATENATE, progress_message, ConsesLow.list( $sym187$FORMAT_NIL, $str188$___Directory___S, current_directory_var ) ) ) ), ConsesLow.list( $sym9$PIF, ConsesLow.list( $sym170$DIRECTORY_P,
                        file_var ), ConsesLow.list( $sym138$CPUSH, file_var, directory_list_var ), reader.bq_cons( $sym57$PROGN, ConsesLow.append( body, NIL ) ) ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 22985L)
  public static SubLObject directory_file_count(final SubLObject directory)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Filesys.directory_p( directory ) : directory;
    SubLObject count = NIL;
    if( !count.isInteger() )
    {
      count = ZERO_INTEGER;
      assert NIL != Filesys.directory_p( directory ) : directory;
      SubLObject directory_contents_var = Filesys.directory( directory, T );
      final SubLObject progress_message_var = NIL;
      final SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding( thread );
      try
      {
        utilities_macros.$silent_progressP$.bind( makeBoolean( !progress_message_var.isString() ), thread );
        if( NIL.isFunctionSpec() )
        {
          directory_contents_var = Sort.sort( directory_contents_var, NIL, UNPROVIDED );
        }
        final SubLObject list_var = directory_contents_var;
        final SubLObject _prev_bind_0_$17 = utilities_macros.$progress_note$.currentBinding( thread );
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
        try
        {
          utilities_macros.$progress_note$.bind( ( NIL != progress_message_var ) ? progress_message_var : $str189$cdolist, thread );
          utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
          utilities_macros.$progress_total$.bind( Sequences.length( list_var ), thread );
          utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
          utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
          utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
          utilities_macros.$within_noting_percent_progress$.bind( T, thread );
          utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
          try
          {
            utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
            SubLObject csome_list_var = list_var;
            SubLObject file = NIL;
            file = csome_list_var.first();
            while ( NIL != csome_list_var)
            {
              count = Numbers.add( count, ONE_INTEGER );
              utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
              utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
              csome_list_var = csome_list_var.rest();
              file = csome_list_var.first();
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$18 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              utilities_macros.noting_percent_progress_postamble();
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$18, thread );
            }
          }
        }
        finally
        {
          utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
          utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
          utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
          utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
          utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
          utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
          utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
          utilities_macros.$progress_note$.rebind( _prev_bind_0_$17, thread );
        }
      }
      finally
      {
        utilities_macros.$silent_progressP$.rebind( _prev_bind_0, thread );
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 23723L)
  public static SubLObject list_directory(final SubLObject directory, final SubLObject regexp, SubLObject include_path, SubLObject comp_options, SubLObject match_options)
  {
    if( include_path == UNPROVIDED )
    {
      include_path = NIL;
    }
    if( comp_options == UNPROVIDED )
    {
      comp_options = NIL;
    }
    if( match_options == UNPROVIDED )
    {
      match_options = NIL;
    }
    return Mapping.mapcar( $sym190$SECOND, regular_expression_utilities.list_grep( regexp, Filesys.directory( directory, include_path ), comp_options, match_options ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 24448L)
  public static SubLObject sort_files_by_date(final SubLObject file_list)
  {
    return Sort.sort( file_list, $sym133$_, $sym191$FILE_WRITE_DATE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 24694L)
  public static SubLObject slurp_file(final SubLObject path)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject string = NIL;
    SubLObject stream = NIL;
    try
    {
      stream = streams_high.make_private_string_output_stream();
      SubLObject stream_$19 = NIL;
      try
      {
        final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream_$19 = compatibility.open_text( path, $kw107$INPUT );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
        }
        if( !stream_$19.isStream() )
        {
          Errors.error( $str68$Unable_to_open__S, path );
        }
        final SubLObject infile = stream_$19;
        if( infile.isStream() )
        {
          SubLObject line;
          for( line = NIL, line = cdolines_get_next_line( infile ); NIL != line; line = cdolines_get_next_line( infile ) )
          {
            streams_high.write_string( line, stream, UNPROVIDED, UNPROVIDED );
            streams_high.terpri( stream );
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          if( stream_$19.isStream() )
          {
            streams_high.close( stream_$19, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
      string = streams_high.get_output_stream_string( stream );
    }
    finally
    {
      final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values2 = Values.getValuesAsVector();
        streams_high.close( stream, UNPROVIDED );
        Values.restoreValuesFromVector( _values2 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
      }
    }
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 25042L)
  public static SubLObject slurp_file_robust(final SubLObject path)
  {
    if( NIL != Filesys.probe_file( path ) )
    {
      return slurp_file( path );
    }
    return $str22$;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 25235L)
  public static SubLObject slurp_file_lines(final SubLObject path)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject lines = NIL;
    SubLObject stream = NIL;
    try
    {
      final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
      try
      {
        stream_macros.$stream_requires_locking$.bind( NIL, thread );
        stream = compatibility.open_text( path, $kw107$INPUT );
      }
      finally
      {
        stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
      }
      if( !stream.isStream() )
      {
        Errors.error( $str68$Unable_to_open__S, path );
      }
      final SubLObject stream_var = stream;
      if( stream_var.isStream() )
      {
        final SubLObject stream_var_$20 = stream_var;
        SubLObject line_number_var = NIL;
        SubLObject line = NIL;
        line_number_var = ZERO_INTEGER;
        for( line = do_stream_lines_get_next_line( stream_var_$20 ); NIL != line; line = do_stream_lines_get_next_line( stream_var_$20 ) )
        {
          lines = ConsesLow.cons( line, lines );
          line_number_var = number_utilities.f_1X( line_number_var );
        }
      }
    }
    finally
    {
      final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        if( stream.isStream() )
        {
          streams_high.close( stream, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
      }
    }
    return Sequences.nreverse( lines );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 25528L)
  public static SubLObject file_existsP(final SubLObject filename)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject existsP = NIL;
    SubLObject ignore_errors_tag = NIL;
    try
    {
      thread.throwStack.push( $kw65$IGNORE_ERRORS_TARGET );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( Symbols.symbol_function( $sym66$IGNORE_ERRORS_HANDLER ), thread );
        try
        {
          existsP = list_utilities.sublisp_boolean( Filesys.probe_file( filename ) );
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
      ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw65$IGNORE_ERRORS_TARGET );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return existsP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 25752L)
  public static SubLObject why_not_probe_fileP(final SubLObject filename)
  {
    if( NIL != Filesys.probe_file( filename ) )
    {
      return NIL;
    }
    final SubLObject separator = ( NIL != string_utilities.char_position( Characters.CHAR_backslash, filename, UNPROVIDED ) ) ? $str192$_ : $str175$_;
    SubLObject path_components = string_utilities.string_tokenize( filename, $list193, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject absolute_pathP = Equality.eq( Strings.sublisp_char( separator, ZERO_INTEGER ), Strings.sublisp_char( filename, ZERO_INTEGER ) );
    SubLObject building_path = ( NIL != absolute_pathP ) ? separator : $str22$;
    SubLObject found_bad_pathP = NIL;
    SubLObject error_message = NIL;
    if( NIL != absolute_pathP )
    {
      path_components = path_components.rest();
    }
    if( NIL == found_bad_pathP )
    {
      SubLObject csome_list_var = path_components;
      SubLObject this_component = NIL;
      this_component = csome_list_var.first();
      while ( NIL == found_bad_pathP && NIL != csome_list_var)
      {
        building_path = Sequences.cconcatenate( building_path, this_component );
        if( NIL == Filesys.probe_file( building_path ) )
        {
          if( NIL != absolute_pathP || NIL == Filesys.probe_file( $str22$ ) )
          {
            error_message = PrintLow.format( NIL, $str194$Could_not_find__A, building_path );
          }
          else
          {
            error_message = PrintLow.format( NIL, $str195$Could_not_find__A_A, Filesys.probe_file( $str22$ ), building_path );
          }
          found_bad_pathP = T;
        }
        building_path = Sequences.cconcatenate( building_path, separator );
        csome_list_var = csome_list_var.rest();
        this_component = csome_list_var.first();
      }
    }
    if( NIL == found_bad_pathP )
    {
      if( NIL != absolute_pathP )
      {
        error_message = $str196$File_not_found_;
      }
      else
      {
        error_message = PrintLow.format( NIL, $str197$File_not_found_from_directory__A, Filesys.probe_file( $str22$ ) );
      }
    }
    return error_message;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 27157L)
  public static SubLObject guess_path_type(final SubLObject path)
  {
    if( NIL != string_utilities.char_position( Characters.CHAR_slash, path, UNPROVIDED ) )
    {
      return $kw198$UNIX;
    }
    if( NIL != string_utilities.char_position( Characters.CHAR_backslash, path, UNPROVIDED ) )
    {
      return $kw199$DOS;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 27491L)
  public static SubLObject guess_path_type_robust(final SubLObject path)
  {
    final SubLObject path_type = guess_path_type( path );
    return ( NIL != path_type ) ? path_type : $kw198$UNIX;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 28015L)
  public static SubLObject absolute_default_path_string()
  {
    return possibly_append_path_separator_char( format_nil.format_nil_a( Filesys.probe_file( $str23$_ ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 28365L)
  public static SubLObject possibly_append_path_separator_char(final SubLObject raw_path_string)
  {
    final SubLObject path_type = guess_path_type_robust( raw_path_string );
    final SubLObject separator = path_separator_char( path_type );
    final SubLObject path_string = string_utilities.last_char( raw_path_string ).eql( separator ) ? raw_path_string : string_utilities.post_add_character_to_string( separator, raw_path_string );
    return path_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 28922L)
  public static SubLObject get_absolute_path_string(final SubLObject logical_path)
  {
    return normal_pathstring( logical_pathname_to_physical( logical_path ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 29213L)
  public static SubLObject absolute_pathP(final SubLObject path)
  {
    final SubLObject path_length = Sequences.length( path );
    if( path_length.eql( ZERO_INTEGER ) )
    {
      return NIL;
    }
    final SubLObject pcase_var = guess_path_type( path );
    if( pcase_var.eql( $kw198$UNIX ) )
    {
      return Equality.eq( Characters.CHAR_slash, Strings.sublisp_char( path, ZERO_INTEGER ) );
    }
    if( pcase_var.eql( $kw199$DOS ) )
    {
      return makeBoolean( path_length.numG( TWO_INTEGER ) && ( ( Characters.CHAR_colon.eql( Strings.sublisp_char( path, ONE_INTEGER ) ) && NIL != Characters.alpha_char_p( Strings.sublisp_char( path, ZERO_INTEGER ) ) )
          || NIL != string_utilities.starts_with( path, $str200$__ ) ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 29879L)
  public static SubLObject path_separator_char(final SubLObject path_type)
  {
    final SubLObject string = path_separator_string( path_type );
    if( string.isString() )
    {
      return Strings.sublisp_char( string, ZERO_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 30537L)
  public static SubLObject path_separator_string(final SubLObject path_type)
  {
    if( path_type.eql( $kw198$UNIX ) )
    {
      return $str175$_;
    }
    if( path_type.eql( $kw199$DOS ) )
    {
      return $str192$_;
    }
    if( path_type.eql( $kw201$MAC ) )
    {
      return $str202$_;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 30750L)
  public static SubLObject deconstruct_path(final SubLObject path)
  {
    final SubLObject path_type = guess_path_type( path );
    if( NIL == path_type )
    {
      return Values.values( NIL, path, NIL );
    }
    SubLObject path_list = string_utilities.string_tokenize( path, ConsesLow.list( path_separator_string( path_type ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject filename = NIL;
    path_list = Sequences.nreverse( path_list );
    filename = path_list.first();
    path_list = path_list.rest();
    path_list = Sequences.nreverse( path_list );
    return Values.values( path_list, filename, path_type );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 31537L)
  public static SubLObject reconstruct_path(final SubLObject path_list, final SubLObject filename, SubLObject path_type)
  {
    if( path_type == UNPROVIDED )
    {
      path_type = $kw198$UNIX;
    }
    SubLObject build_path = NIL;
    final SubLObject path_separator_string = path_separator_string( path_type );
    SubLObject cdolist_list_var = path_list;
    SubLObject path_step = NIL;
    path_step = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      build_path = ConsesLow.cons( path_step, build_path );
      build_path = ConsesLow.cons( path_separator_string, build_path );
      cdolist_list_var = cdolist_list_var.rest();
      path_step = cdolist_list_var.first();
    }
    build_path = ConsesLow.cons( filename, build_path );
    return Functions.apply( Symbols.symbol_function( $sym174$CCONCATENATE ), Sequences.nreverse( build_path ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 32263L)
  public static SubLObject make_path_absolute_relative_to(final SubLObject absolute_path, final SubLObject path)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != absolute_pathP( path ) )
    {
      return path;
    }
    thread.resetMultipleValues();
    SubLObject working_path = deconstruct_path( absolute_path );
    final SubLObject working_file = thread.secondMultipleValue();
    final SubLObject working_path_type = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    thread.resetMultipleValues();
    final SubLObject relative_path = deconstruct_path( path );
    final SubLObject relative_file = thread.secondMultipleValue();
    SubLObject relative_path_type = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( !working_path_type.eql( relative_path_type ) )
    {
      if( NIL != relative_path_type )
      {
        return Values.values( NIL, $str203$Path_type_mismatch_ );
      }
      relative_path_type = working_path_type;
    }
    working_path = Sequences.nreverse( working_path );
    SubLObject cdolist_list_var = relative_path;
    SubLObject relative_path_step = NIL;
    relative_path_step = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( !relative_path_step.equal( $str23$_ ) )
      {
        if( relative_path_step.equal( $str204$__ ) )
        {
          working_path = working_path.rest();
        }
        else
        {
          working_path = ConsesLow.cons( relative_path_step, working_path );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      relative_path_step = cdolist_list_var.first();
    }
    return reconstruct_path( Sequences.nreverse( working_path ), relative_file, relative_path_type );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 33775L)
  public static SubLObject make_absolute_path_relative_to(final SubLObject absolute_path, final SubLObject root)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == absolute_pathP( absolute_path ) )
    {
      Errors.error( $str205$Cannot_make_relative_path__A_even, absolute_path );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == absolute_pathP( root ) )
    {
      Errors.error( $str206$Cannot_strip_non_absolute_prefix_, root, absolute_path );
    }
    return string_utilities.pre_remove( absolute_path, possibly_append_path_separator_char( root ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 34322L)
  public static SubLObject pathstring_filename(final SubLObject pathstring)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != Filesys.directory_p( pathstring ) )
    {
      return NIL;
    }
    final SubLObject physical_path = subl_promotions.ensure_physical_pathname( pathstring );
    SubLObject result = NIL;
    thread.resetMultipleValues();
    final SubLObject directory_list = deconstruct_path( physical_path );
    final SubLObject filename = thread.secondMultipleValue();
    final SubLObject type = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    result = filename;
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 35064L)
  public static SubLObject pathstring_directory_name(final SubLObject pathstring)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject directory = partially_deconstruct_path( pathstring );
    final SubLObject filename = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return directory;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 35426L)
  public static SubLObject partially_deconstruct_path(final SubLObject pathstring)
  {
    final SubLObject filename = pathstring_filename( pathstring );
    final SubLObject filename_length = Sequences.length( filename );
    final SubLObject directory = string_utilities.substring( pathstring, ZERO_INTEGER, Numbers.subtract( Sequences.length( pathstring ), filename_length ) );
    return Values.values( directory, filename );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 35706L)
  public static SubLObject ensure_unique_filename(SubLObject pathstring, SubLObject suffix)
  {
    if( suffix == UNPROVIDED )
    {
      suffix = $str22$;
    }
    for( SubLObject counter = ZERO_INTEGER, base_path = string_utilities.post_remove( pathstring, suffix, Symbols.symbol_function( EQUAL ) ); NIL != file_existsP( pathstring ); pathstring = Sequences.cconcatenate(
        format_nil.format_nil_a_no_copy( base_path ), new SubLObject[]
        { $str207$_, format_nil.format_nil_a_no_copy( counter ), format_nil.format_nil_a_no_copy( suffix )
        } ), counter = Numbers.add( counter, ONE_INTEGER ) )
    {
    }
    return pathstring;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 36448L)
  public static SubLObject read_text_file(final SubLObject file_name)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == string_utilities.non_empty_stringP( file_name ) || NIL == Filesys.probe_file( file_name ) )
    {
      PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str208$Warning__unable_to_read_file__s__, file_name );
      return NIL;
    }
    SubLObject result = NIL;
    SubLObject stream = NIL;
    try
    {
      final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
      try
      {
        stream_macros.$stream_requires_locking$.bind( NIL, thread );
        stream = compatibility.open_text( file_name, $kw107$INPUT );
      }
      finally
      {
        stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
      }
      if( !stream.isStream() )
      {
        Errors.error( $str68$Unable_to_open__S, file_name );
      }
      SubLObject in;
      SubLObject line;
      for( in = stream, line = NIL, line = string_utilities.network_read_line( in, NIL, UNPROVIDED, UNPROVIDED ); line != $kw18$EOF && NIL != line; line = string_utilities.network_read_line( in, NIL, UNPROVIDED,
          UNPROVIDED ) )
      {
        result = ConsesLow.cons( line, result );
      }
    }
    finally
    {
      final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        if( stream.isStream() )
        {
          streams_high.close( stream, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
      }
    }
    return Sequences.reverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 37281L)
  public static SubLObject output_text_file(final SubLObject file_name, final SubLObject lines, SubLObject output_mode)
  {
    if( output_mode == UNPROVIDED )
    {
      output_mode = $kw67$OUTPUT;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject stream = NIL;
    try
    {
      final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
      try
      {
        stream_macros.$stream_requires_locking$.bind( NIL, thread );
        stream = compatibility.open_text( file_name, output_mode );
      }
      finally
      {
        stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
      }
      if( !stream.isStream() )
      {
        Errors.error( $str68$Unable_to_open__S, file_name );
      }
      final SubLObject out = stream;
      SubLObject cdolist_list_var = lines;
      SubLObject line = NIL;
      line = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        streams_high.write_string( line, out, UNPROVIDED, UNPROVIDED );
        streams_high.terpri( out );
        cdolist_list_var = cdolist_list_var.rest();
        line = cdolist_list_var.first();
      }
    }
    finally
    {
      final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        if( stream.isStream() )
        {
          streams_high.close( stream, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
      }
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 37587L)
  public static SubLObject write_text_file(final SubLObject file_name, final SubLObject lines)
  {
    return output_text_file( file_name, lines, $kw67$OUTPUT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 37859L)
  public static SubLObject append_text_file(final SubLObject file_name, final SubLObject lines)
  {
    return output_text_file( file_name, lines, $kw76$APPEND );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 38227L)
  public static SubLObject truncate_file(final SubLObject filename)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject stream = NIL;
    try
    {
      final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
      try
      {
        stream_macros.$stream_requires_locking$.bind( NIL, thread );
        stream = compatibility.open_binary( filename, $kw67$OUTPUT );
      }
      finally
      {
        stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
      }
      if( !stream.isStream() )
      {
        Errors.error( $str68$Unable_to_open__S, filename );
      }
      final SubLObject s = stream;
    }
    finally
    {
      final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        if( stream.isStream() )
        {
          streams_high.close( stream, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
      }
    }
    return filename;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 38437L)
  public static SubLObject empty_file_p(final SubLObject filename)
  {
    if( NIL != Filesys.probe_file( filename ) )
    {
      SubLObject size = NIL;
      final SubLObject stream = compatibility.open_binary( filename, $kw107$INPUT );
      size = streams_high.file_length( stream );
      streams_high.close( stream, UNPROVIDED );
      return Numbers.zerop( size );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 38732L)
  public static SubLObject ensure_directories_exist(final SubLObject filepath)
  {
    return make_directory_recursive( pathstring_directory_name( filepath ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 38949L)
  public static SubLObject make_directory_recursive(final SubLObject directory_path, SubLObject forceP, SubLObject permissions)
  {
    if( forceP == UNPROVIDED )
    {
      forceP = NIL;
    }
    if( permissions == UNPROVIDED )
    {
      permissions = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != permissions && !assertionsDisabledSynth && NIL == Types.stringp( permissions ) )
    {
      throw new AssertionError( permissions );
    }
    assert NIL != Types.stringp( directory_path ) : directory_path;
    final SubLObject physical_path = subl_promotions.ensure_physical_pathname( directory_path );
    SubLObject path_list_so_far = NIL;
    SubLObject path_type = NIL;
    SubLObject chmod_list = NIL;
    SubLObject error = NIL;
    thread.resetMultipleValues();
    SubLObject directories = deconstruct_path( physical_path );
    final SubLObject last_directory = thread.secondMultipleValue();
    final SubLObject pt = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    path_type = pt;
    SubLObject cdolist_list_var;
    directories = ( cdolist_list_var = list_utilities.nadd_to_end( last_directory, directories ) );
    SubLObject each_directory = NIL;
    each_directory = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject each_directory_path = reconstruct_path( path_list_so_far, each_directory, path_type );
      path_list_so_far = list_utilities.nadd_to_end( each_directory, path_list_so_far );
      if( NIL == Filesys.directory_p( each_directory_path ) && ( path_type != $kw199$DOS || NIL == string_utilities.ends_with( each_directory_path, $str202$_, UNPROVIDED ) ) )
      {
        if( NIL != Filesys.probe_file( each_directory_path ) )
        {
          if( NIL != forceP )
          {
            Filesys.delete_file( each_directory_path );
          }
          else
          {
            Errors.error( $str209$make_directory_recursive__could_n, each_directory_path );
          }
        }
        Filesys.make_directory( each_directory_path, UNPROVIDED, UNPROVIDED );
        chmod_list = ConsesLow.cons( each_directory_path, chmod_list );
      }
      cdolist_list_var = cdolist_list_var.rest();
      each_directory = cdolist_list_var.first();
    }
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym19$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          if( NIL != permissions )
          {
            SubLObject cdolist_list_var2 = chmod_list;
            SubLObject chmod_directory = NIL;
            chmod_directory = cdolist_list_var2.first();
            while ( NIL != cdolist_list_var2)
            {
              chmod( chmod_directory, permissions );
              cdolist_list_var2 = cdolist_list_var2.rest();
              chmod_directory = cdolist_list_var2.first();
            }
          }
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
    if( NIL != error )
    {
      Errors.warn( $str210$Able_to_create_directory__A__but_, directory_path );
    }
    return Filesys.probe_file( reconstruct_path( conses_high.butlast( path_list_so_far, UNPROVIDED ), conses_high.last( path_list_so_far, UNPROVIDED ).first(), path_type ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 41286L)
  public static SubLObject logical_pathname_to_physical(final SubLObject pathname)
  {
    return subl_promotions.ensure_physical_pathname( pathname );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 42493L)
  public static SubLObject recursive_delete_directory(final SubLObject path)
  {
    if( NIL == Filesys.directory_p( path ) )
    {
      return NIL;
    }
    SubLObject cdolist_list_var;
    final SubLObject children = cdolist_list_var = Filesys.directory( path, UNPROVIDED );
    SubLObject child = NIL;
    child = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject child_path = Sequences.cconcatenate( path, new SubLObject[] { $str175$_, child
      } );
      if( NIL != Filesys.directory_p( child_path ) )
      {
        recursive_delete_directory( child_path );
      }
      else
      {
        Filesys.delete_file( child_path );
      }
      cdolist_list_var = cdolist_list_var.rest();
      child = cdolist_list_var.first();
    }
    return Filesys.delete_directory( path, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 42943L)
  public static SubLObject recursive_copy_directory(final SubLObject old, final SubLObject v_new)
  {
    if( NIL == Filesys.directory_p( old ) )
    {
      return NIL;
    }
    Filesys.make_directory( v_new, UNPROVIDED, UNPROVIDED );
    SubLObject cdolist_list_var;
    final SubLObject children = cdolist_list_var = Filesys.directory( old, UNPROVIDED );
    SubLObject child = NIL;
    child = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject old_child_path = Sequences.cconcatenate( old, new SubLObject[] { $str175$_, child
      } );
      final SubLObject new_child_path = Sequences.cconcatenate( v_new, new SubLObject[] { $str175$_, child
      } );
      if( NIL != Filesys.directory_p( old_child_path ) )
      {
        recursive_copy_directory( old_child_path, new_child_path );
      }
      else
      {
        Filesys.copy_file( old_child_path, new_child_path );
      }
      cdolist_list_var = cdolist_list_var.rest();
      child = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 43522L)
  public static SubLObject chmod(final SubLObject pathname, final SubLObject permissions_string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Processes.external_processes_supportedP() )
    {
      return NIL;
    }
    return os_process_utilities.system_eval_using_make_os_process_successfulP( $str211$chmod, ConsesLow.list( permissions_string, pathname ), ZERO_INTEGER, StreamsLow.$null_input$.getDynamicValue( thread ),
        StreamsLow.$null_output$.getDynamicValue( thread ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 44006L)
  public static SubLObject delete_file_via_os(final SubLObject filename)
  {
    assert NIL != Types.stringp( filename ) : filename;
    return Filesys.delete_file( filename );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 44401L)
  public static SubLObject create_symbolic_link(final SubLObject link_file, final SubLObject target_file)
  {
    assert NIL != Types.stringp( target_file ) : target_file;
    assert NIL != Types.stringp( link_file ) : link_file;
    if( NIL != Processes.external_processes_supportedP() )
    {
      return os_process_utilities.system_eval_using_make_os_process_successfulP( $str212$ln, ConsesLow.list( $str213$_s, target_file, link_file ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 44990L)
  public static SubLObject link_or_copy_file(final SubLObject old, final SubLObject v_new)
  {
    return makeBoolean( NIL != create_symbolic_link( v_new, old ) || NIL != Filesys.copy_file( old, v_new ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 45253L)
  public static SubLObject move_file(final SubLObject old, final SubLObject v_new)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject successP = T;
    SubLObject error = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym19$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          successP = Filesys.copy_file( old, v_new );
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
    if( NIL != successP && NIL == error )
    {
      try
      {
        thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( $sym19$CATCH_ERROR_MESSAGE_HANDLER, thread );
          try
          {
            successP = Filesys.delete_file( old );
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
    }
    if( NIL != error )
    {
      successP = NIL;
    }
    return Values.values( successP, error );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 45608L)
  public static SubLObject get_file_length(final SubLObject pathname)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = ZERO_INTEGER;
    if( pathname.isString() && NIL != Filesys.probe_file( pathname ) )
    {
      SubLObject stream = NIL;
      try
      {
        final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream = compatibility.open_binary( pathname, $kw107$INPUT );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
        }
        if( !stream.isStream() )
        {
          Errors.error( $str68$Unable_to_open__S, pathname );
        }
        final SubLObject stream_$21 = stream;
        ans = streams_high.file_length( stream_$21 );
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 45890L)
  public static SubLObject copy_file_checked(final SubLObject old, final SubLObject v_new)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject expected = get_file_length( old );
    final SubLObject result = Filesys.copy_file( old, v_new );
    final SubLObject actual = get_file_length( v_new );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !expected.numE( actual ) )
    {
      Errors.error( $str214$Copy_of__A_to__A_failed___A_has__, new SubLObject[] { old, v_new, old, expected, v_new, actual
      } );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 46305L)
  public static SubLObject get_file_lines(final SubLObject filename)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject stream = NIL;
    try
    {
      final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
      try
      {
        stream_macros.$stream_requires_locking$.bind( NIL, thread );
        stream = compatibility.open_text( filename, $kw107$INPUT );
      }
      finally
      {
        stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
      }
      if( !stream.isStream() )
      {
        Errors.error( $str68$Unable_to_open__S, filename );
      }
      final SubLObject infile = stream;
      if( infile.isStream() )
      {
        SubLObject line;
        for( line = NIL, line = cdolines_get_next_line( infile ); NIL != line; line = cdolines_get_next_line( infile ) )
        {
          result = ConsesLow.cons( line, result );
        }
      }
    }
    finally
    {
      final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        if( stream.isStream() )
        {
          streams_high.close( stream, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
      }
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 46533L)
  public static SubLObject get_stream_forms(final SubLObject stream)
  {
    SubLObject result = NIL;
    SubLObject doneP = NIL;
    while ( NIL == doneP)
    {
      final SubLObject form = reader.read( stream, NIL, $kw18$EOF, UNPROVIDED );
      if( form == $kw18$EOF )
      {
        doneP = T;
      }
      else
      {
        result = ConsesLow.cons( form, result );
      }
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 46850L)
  public static SubLObject get_file_forms(final SubLObject filename)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject stream = NIL;
    try
    {
      final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
      try
      {
        stream_macros.$stream_requires_locking$.bind( NIL, thread );
        stream = compatibility.open_text( filename, $kw107$INPUT );
      }
      finally
      {
        stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
      }
      if( !stream.isStream() )
      {
        Errors.error( $str68$Unable_to_open__S, filename );
      }
      final SubLObject stream_$22 = stream;
      result = get_stream_forms( stream_$22 );
    }
    finally
    {
      final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        if( stream.isStream() )
        {
          streams_high.close( stream, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 47096L)
  public static SubLObject get_file_line_count(final SubLObject pathname)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = ZERO_INTEGER;
    if( pathname.isString() && NIL != Filesys.probe_file( pathname ) )
    {
      SubLObject stream = NIL;
      try
      {
        final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream = compatibility.open_text( pathname, $kw107$INPUT );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
        }
        if( !stream.isStream() )
        {
          Errors.error( $str68$Unable_to_open__S, pathname );
        }
        final SubLObject infile = stream;
        if( infile.isStream() )
        {
          SubLObject line;
          for( line = NIL, line = cdolines_get_next_line( infile ); NIL != line; line = cdolines_get_next_line( infile ) )
          {
            ans = Numbers.add( ans, ONE_INTEGER );
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 47364L)
  public static SubLObject load_file_catching_error(final SubLObject pathname)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject error = NIL;
    SubLObject success = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym19$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          Eval.load( pathname );
          success = T;
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
    return Values.values( success, error );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 47833L)
  public static SubLObject normal_pathstring(final SubLObject pathstring)
  {
    final SubLObject pathstring_crtl = Filesys.probe_file( pathstring );
    if( NIL != pathstring_crtl )
    {
      return pathstring_crtl;
    }
    return pathstring;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 48243L)
  public static SubLObject possibly_update_keepalive_file(final SubLObject keepalive_filename)
  {
    if( NIL != keepalive_filename )
    {
      return update_keepalive_file( keepalive_filename );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 48394L)
  public static SubLObject update_keepalive_file(final SubLObject keepalive_filename)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject stream = NIL;
    try
    {
      final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
      try
      {
        stream_macros.$stream_requires_locking$.bind( NIL, thread );
        stream = compatibility.open_text( keepalive_filename, $kw67$OUTPUT );
      }
      finally
      {
        stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
      }
      if( !stream.isStream() )
      {
        Errors.error( $str68$Unable_to_open__S, keepalive_filename );
      }
      final SubLObject stream_$23 = stream;
      PrintLow.format( stream_$23, $str215$I_m_alive___ );
    }
    finally
    {
      final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        if( stream.isStream() )
        {
          streams_high.close( stream, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
      }
    }
    return keepalive_filename;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 48579L)
  public static SubLObject make_directory_or_error(final SubLObject directory_name, SubLObject path)
  {
    if( path == UNPROVIDED )
    {
      path = NIL;
    }
    return make_directory_or_possibly_error( directory_name, path, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 48733L)
  public static SubLObject make_directory_or_possibly_error(final SubLObject directory_name, SubLObject path, SubLObject errorP)
  {
    if( path == UNPROVIDED )
    {
      path = NIL;
    }
    if( errorP == UNPROVIDED )
    {
      errorP = NIL;
    }
    final SubLObject result = Filesys.make_directory( directory_name, path, UNPROVIDED );
    if( NIL != errorP && NIL == result )
    {
      Errors.error( $str216$Could_not_make_directory__a_with_, directory_name, path );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 49032L)
  public static SubLObject make_timestamp_subdirectory(final SubLObject pathname)
  {
    return make_directory_or_error( timestamp_subdirectory( pathname ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 49294L)
  public static SubLObject timestamp_subdirectory(SubLObject pathname)
  {
    pathname = possibly_append_path_separator_char( pathname );
    final SubLObject dir_name = numeric_date_utilities.timestamp( UNPROVIDED, UNPROVIDED );
    final SubLObject full_pathname = Sequences.cconcatenate( pathname, dir_name );
    return possibly_append_path_separator_char( full_pathname );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 49671L)
  public static SubLObject prepare_to_possibly_overwrite_file(final SubLObject filename, SubLObject overwriteP)
  {
    if( overwriteP == UNPROVIDED )
    {
      overwriteP = T;
    }
    assert NIL != Types.stringp( filename ) : filename;
    if( NIL != file_existsP( filename ) )
    {
      if( NIL != overwriteP )
      {
        Filesys.delete_file( filename );
        return filename;
      }
      Errors.error( $str217$File_already_exists___A__, filename );
    }
    return make_directory_recursive( partially_deconstruct_path( filename ), overwriteP, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 50337L)
  public static SubLObject new_file_accumulator(final SubLObject path, SubLObject mode, SubLObject write_fn)
  {
    if( mode == UNPROVIDED )
    {
      mode = $kw32$TEXT;
    }
    if( write_fn == UNPROVIDED )
    {
      write_fn = $sym218$PRINT;
    }
    assert NIL != Types.function_spec_p( write_fn ) : write_fn;
    final SubLObject open_method = ( $kw32$TEXT == mode ) ? $sym219$OPEN_TEXT : $sym220$OPEN_BINARY;
    final SubLObject stream = Functions.funcall( open_method, path, $kw67$OUTPUT );
    if( NIL == streams_high.open_stream_p( stream ) || NIL == streams_high.output_stream_p( stream ) )
    {
      Errors.error( $str221$Cannot_open__A_for_writing___, path );
    }
    final SubLObject state = make_file_accumulator_state( stream, write_fn );
    return accumulation.new_accumulator( state, $sym222$FILE_ACCUMULATOR_RESET, $sym223$FILE_ACCUMULATOR_ADD, $sym224$FILE_ACCUMULATOR_SIZE, $sym225$FILE_ACCUMULATOR_CONTENTS, $sym226$FILE_ACCUMULATOR_ITERATOR,
        UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 51310L)
  public static SubLObject close_file_accumulator(final SubLObject acc)
  {
    file_accumulator_release_resources( accumulation.accumulation_peek_state( acc ) );
    return acc;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 51622L)
  public static SubLObject make_file_accumulator_state(final SubLObject stream, final SubLObject write_fn)
  {
    final SubLObject function_spec = write_fn.isSymbol() ? Symbols.symbol_function( write_fn ) : write_fn;
    return ConsesLow.list( $kw227$STREAM, stream, $kw228$WRITER, function_spec, $kw229$ITEM_COUNT, ZERO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 51903L)
  public static SubLObject with_file_accumulator_state(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list230 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject state = NIL;
    SubLObject stream = NIL;
    SubLObject writer = NIL;
    SubLObject item_count = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list230 );
    state = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list230 );
    stream = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list230 );
    writer = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list230 );
    item_count = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym124$CDESTRUCTURING_BIND, ConsesLow.list( $sym231$_KEY, stream, writer, item_count ), state, ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list230 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 52100L)
  public static SubLObject file_accumulator_state_set_item_count(final SubLObject state, final SubLObject count)
  {
    return conses_high.putf( state, $kw229$ITEM_COUNT, count );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 52210L)
  public static SubLObject file_accumulator_state_reset_item_count(final SubLObject state)
  {
    return file_accumulator_state_set_item_count( state, ZERO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 52333L)
  public static SubLObject file_accumulator_state_get_stream(final SubLObject state)
  {
    return conses_high.getf( state, $kw227$STREAM, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 52423L)
  public static SubLObject file_accumulator_reset(final SubLObject state)
  {
    final SubLObject stream = file_accumulator_state_get_stream( state );
    streams_high.file_position( stream, ZERO_INTEGER );
    return file_accumulator_state_reset_item_count( state );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 52620L)
  public static SubLObject file_accumulator_add(final SubLObject state, final SubLObject element)
  {
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = state;
    SubLObject bad = NIL;
    SubLObject current_$24 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, state, $list232 );
      current_$24 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, state, $list232 );
      if( NIL == conses_high.member( current_$24, $list233, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$24 == $kw41$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( state, $list232 );
    }
    final SubLObject stream_tail = cdestructuring_bind.property_list_member( $kw227$STREAM, state );
    final SubLObject stream = ( NIL != stream_tail ) ? conses_high.cadr( stream_tail ) : NIL;
    final SubLObject writer_tail = cdestructuring_bind.property_list_member( $kw228$WRITER, state );
    final SubLObject writer = ( NIL != writer_tail ) ? conses_high.cadr( writer_tail ) : NIL;
    final SubLObject item_count_tail = cdestructuring_bind.property_list_member( $kw229$ITEM_COUNT, state );
    final SubLObject item_count = ( NIL != item_count_tail ) ? conses_high.cadr( item_count_tail ) : NIL;
    Functions.funcall( writer, element, stream );
    return file_accumulator_state_set_item_count( state, Numbers.add( item_count, ONE_INTEGER ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 52850L)
  public static SubLObject file_accumulator_size(final SubLObject state)
  {
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = state;
    SubLObject bad = NIL;
    SubLObject current_$25 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, state, $list232 );
      current_$25 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, state, $list232 );
      if( NIL == conses_high.member( current_$25, $list233, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$25 == $kw41$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( state, $list232 );
    }
    final SubLObject stream_tail = cdestructuring_bind.property_list_member( $kw227$STREAM, state );
    final SubLObject stream = ( NIL != stream_tail ) ? conses_high.cadr( stream_tail ) : NIL;
    final SubLObject writer_tail = cdestructuring_bind.property_list_member( $kw228$WRITER, state );
    final SubLObject writer = ( NIL != writer_tail ) ? conses_high.cadr( writer_tail ) : NIL;
    final SubLObject item_count_tail = cdestructuring_bind.property_list_member( $kw229$ITEM_COUNT, state );
    final SubLObject item_count = ( NIL != item_count_tail ) ? conses_high.cadr( item_count_tail ) : NIL;
    return item_count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 53012L)
  public static SubLObject file_accumulator_contents(final SubLObject state, final SubLObject reset_p)
  {
    return Errors.error( $str234$Operation_not_supported_for_file_, state );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 53165L)
  public static SubLObject file_accumulator_iterator(final SubLObject state)
  {
    return Errors.error( $str235$Operation_not_yet_supported_for_f, state );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 53294L)
  public static SubLObject file_accumulator_release_resources(final SubLObject state)
  {
    final SubLObject stream = file_accumulator_state_get_stream( state );
    streams_high.close( stream, UNPROVIDED );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 53451L)
  public static SubLObject copy_binary_data_to_hex_stream(final SubLObject in_stream, final SubLObject hex_stream, final SubLObject start, SubLObject end)
  {
    if( end == UNPROVIDED )
    {
      end = streams_high.file_length( in_stream );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject curr = start;
    compatibility.set_file_position( in_stream, start );
    while ( curr.numL( end ))
    {
      final SubLObject v_byte = streams_high.read_byte( in_stream, NIL, $kw18$EOF );
      if( v_byte.isFixnum() )
      {
        thread.resetMultipleValues();
        final SubLObject high_char = vector_utilities.byte_to_hex_chars( v_byte );
        final SubLObject low_char = thread.secondMultipleValue();
        thread.resetMultipleValues();
        print_high.princ( high_char, hex_stream );
        print_high.princ( low_char, hex_stream );
      }
      curr = Numbers.add( curr, ONE_INTEGER );
    }
    return hex_stream;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 54221L)
  public static SubLObject get_binary_data_from_stream(final SubLObject stream, final SubLObject start, SubLObject end)
  {
    if( end == UNPROVIDED )
    {
      end = streams_high.file_length( stream );
    }
    SubLObject hex_string = NIL;
    SubLObject s = NIL;
    try
    {
      s = streams_high.make_private_string_output_stream();
      copy_binary_data_to_hex_stream( stream, s, start, end );
      hex_string = streams_high.get_output_stream_string( s );
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
    return hex_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 54836L)
  public static SubLObject test_get_binary_data_from_stream(final SubLObject objects)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject file = make_temp_filename( $temp_directory$.getGlobalValue() );
    SubLObject encoding = NIL;
    try
    {
      SubLObject stream = NIL;
      try
      {
        final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream = compatibility.open_binary( file, $kw67$OUTPUT );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
        }
        if( !stream.isStream() )
        {
          Errors.error( $str68$Unable_to_open__S, file );
        }
        final SubLObject bin_s = stream;
        final SubLObject encoding_s = cfasl.new_cfasl_encoding_stream();
        try
        {
          SubLObject cdolist_list_var = objects;
          SubLObject v_object = NIL;
          v_object = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            cfasl.cfasl_output( v_object, encoding_s );
            cfasl.cfasl_output( v_object, bin_s );
            cdolist_list_var = cdolist_list_var.rest();
            v_object = cdolist_list_var.first();
          }
          encoding = cfasl.cfasl_encoding_string_stream_encoding( encoding_s );
        }
        finally
        {
          final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            cfasl.close_cfasl_encoding_stream( encoding_s );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
        }
      }
      SubLObject stream_$26 = NIL;
      try
      {
        final SubLObject _prev_bind_4 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream_$26 = compatibility.open_binary( file, $kw107$INPUT );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_4, thread );
        }
        if( !stream_$26.isStream() )
        {
          Errors.error( $str68$Unable_to_open__S, file );
        }
        final SubLObject bin_s2 = stream_$26;
        final SubLObject byte_length = Numbers.integerDivide( Sequences.length( encoding ), TWO_INTEGER );
        SubLObject times;
        SubLObject offset;
        SubLObject start;
        SubLObject end;
        SubLObject actual;
        SubLObject string_start;
        SubLObject string_end;
        SubLObject sub_encoding;
        for( times = Numbers.max( ONE_INTEGER, Numbers.integerDivide( byte_length, THREE_INTEGER ) ), offset = NIL, offset = ZERO_INTEGER; offset.numL( times ); offset = Numbers.add( offset, ONE_INTEGER ) )
        {
          start = offset;
          end = Numbers.subtract( byte_length, offset );
          actual = get_binary_data_from_stream( bin_s2, start, end );
          string_start = Numbers.multiply( start, TWO_INTEGER );
          string_end = Numbers.multiply( end, TWO_INTEGER );
          sub_encoding = string_utilities.substring( encoding, string_start, string_end );
          if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == Strings.string_equal( actual, sub_encoding, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
          {
            Errors.error( $str244$Expected__S__which_is___A__A__of_, new SubLObject[] { sub_encoding, start, end, encoding, actual
            } );
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_5 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values3 = Values.getValuesAsVector();
          if( stream_$26.isStream() )
          {
            streams_high.close( stream_$26, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values3 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_5, thread );
        }
      }
    }
    finally
    {
      final SubLObject _prev_bind_6 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values4 = Values.getValuesAsVector();
        SubLObject ignore_errors_tag = NIL;
        try
        {
          thread.throwStack.push( $kw65$IGNORE_ERRORS_TARGET );
          final SubLObject _prev_bind_0_$27 = Errors.$error_handler$.currentBinding( thread );
          try
          {
            Errors.$error_handler$.bind( Symbols.symbol_function( $sym66$IGNORE_ERRORS_HANDLER ), thread );
            try
            {
              Filesys.delete_file( file );
            }
            catch( final Throwable catch_var )
            {
              Errors.handleThrowable( catch_var, NIL );
            }
          }
          finally
          {
            Errors.$error_handler$.rebind( _prev_bind_0_$27, thread );
          }
        }
        catch( final Throwable ccatch_env_var )
        {
          ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw65$IGNORE_ERRORS_TARGET );
          thread.throwStack.pop();
        }
        finally
        {
          thread.throwStack.pop();
        }
        Values.restoreValuesFromVector( _values4 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_6, thread );
      }
    }
    return $kw245$SUCCESS;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 56096L)
  public static SubLObject file_contents_to_hex_string(final SubLObject filename)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject hex_string = NIL;
    SubLObject stream = NIL;
    try
    {
      final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
      try
      {
        stream_macros.$stream_requires_locking$.bind( NIL, thread );
        stream = compatibility.open_binary( filename, $kw107$INPUT );
      }
      finally
      {
        stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
      }
      if( !stream.isStream() )
      {
        Errors.error( $str68$Unable_to_open__S, filename );
      }
      final SubLObject s = stream;
      hex_string = get_binary_data_from_stream( s, ZERO_INTEGER, UNPROVIDED );
    }
    finally
    {
      final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        if( stream.isStream() )
        {
          streams_high.close( stream, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
      }
    }
    return hex_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 56427L)
  public static SubLObject hex_string_to_file_contents(final SubLObject hex_string, final SubLObject filename)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject bytes = NIL;
    SubLObject hi = NIL;
    SubLObject stream = NIL;
    try
    {
      final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
      try
      {
        stream_macros.$stream_requires_locking$.bind( NIL, thread );
        stream = compatibility.open_binary( filename, $kw67$OUTPUT );
      }
      finally
      {
        stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
      }
      if( !stream.isStream() )
      {
        Errors.error( $str68$Unable_to_open__S, filename );
      }
      final SubLObject s = stream;
      SubLObject end_var_$28;
      SubLObject end_var;
      SubLObject char_num;
      SubLObject v_char;
      SubLObject v_byte;
      for( end_var = ( end_var_$28 = Sequences.length( hex_string ) ), char_num = NIL, char_num = ZERO_INTEGER; !char_num.numGE( end_var_$28 ); char_num = number_utilities.f_1X( char_num ) )
      {
        v_char = Strings.sublisp_char( hex_string, char_num );
        if( NIL != string_utilities.hex_char_p( v_char ) )
        {
          if( NIL == hi )
          {
            hi = v_char;
          }
          else
          {
            v_byte = vector_utilities.hex_chars_to_byte( hi, v_char );
            streams_high.write_byte( v_byte, s );
            hi = NIL;
          }
        }
      }
      streams_high.force_output( s );
      bytes = streams_high.file_length( s );
    }
    finally
    {
      final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        if( stream.isStream() )
        {
          streams_high.close( stream, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
      }
    }
    return bytes;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 56989L)
  public static SubLObject file_stream_direction(final SubLObject file_stream)
  {
    if( NIL == streams_high.output_stream_p( file_stream ) )
    {
      return $kw107$INPUT;
    }
    if( NIL != streams_high.input_stream_p( file_stream ) )
    {
      return $kw34$IO;
    }
    return $kw67$OUTPUT;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 57451L)
  public static SubLObject change_file_stream_buffer_size(final SubLObject old_stream, final SubLObject new_buffer_size)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != streams_high.output_stream_p( old_stream ) )
    {
      streams_high.force_output( old_stream );
    }
    final SubLObject loc = streams_high.file_position( old_stream, UNPROVIDED );
    final SubLObject file_name = string_utilities.to_string( Filesys.probe_file( old_stream ) );
    final SubLObject element_type = streams_high.stream_element_type( old_stream );
    final SubLObject direction = file_stream_direction( old_stream );
    SubLObject new_stream = NIL;
    streams_high.close( old_stream, UNPROVIDED );
    final SubLObject _prev_bind_0 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding( thread );
    final SubLObject _prev_bind_2 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding( thread );
    try
    {
      StreamsLow.$stream_initial_input_buffer_size$.bind( new_buffer_size, thread );
      StreamsLow.$stream_initial_output_buffer_size$.bind( StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue( thread ), thread );
      if( $kw32$TEXT == element_type )
      {
        new_stream = StreamsLow.open( file_name, new SubLObject[] { $kw33$DIRECTION, direction, $kw35$IF_EXISTS, $kw76$APPEND, $kw36$IF_DOES_NOT_EXIST, $kw246$ERROR, $kw38$ELEMENT_TYPE, $kw32$TEXT
        } );
      }
      else
      {
        new_stream = StreamsLow.open( file_name, new SubLObject[] { $kw33$DIRECTION, direction, $kw35$IF_EXISTS, $kw76$APPEND, $kw36$IF_DOES_NOT_EXIST, $kw246$ERROR, $kw38$ELEMENT_TYPE, $kw71$BINARY
        } );
      }
    }
    finally
    {
      StreamsLow.$stream_initial_output_buffer_size$.rebind( _prev_bind_2, thread );
      StreamsLow.$stream_initial_input_buffer_size$.rebind( _prev_bind_0, thread );
    }
    streams_high.file_position( new_stream, loc );
    return new_stream;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 58595L)
  public static SubLObject with_file_memory_mapping(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym3$CLET, $list247, reader.bq_cons( $sym57$PROGN, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 58835L)
  public static SubLObject without_file_memory_mapping(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym3$CLET, $list248, reader.bq_cons( $sym57$PROGN, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 58983L)
  public static SubLObject file_stream_memory_mappedP(final SubLObject file_stream)
  {
    return StreamsLow.isMemoryMappedStream( file_stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 59305L)
  public static SubLObject enable_file_stream_memory_mapping(final SubLObject old_stream)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == streams_high.open_stream_p( old_stream ) )
    {
      return old_stream;
    }
    if( NIL != file_stream_memory_mappedP( old_stream ) )
    {
      return old_stream;
    }
    if( NIL != streams_high.output_stream_p( old_stream ) )
    {
      streams_high.force_output( old_stream );
    }
    final SubLObject loc = streams_high.file_position( old_stream, UNPROVIDED );
    final SubLObject file_name = string_utilities.to_string( Filesys.probe_file( old_stream ) );
    final SubLObject element_type = streams_high.stream_element_type( old_stream );
    final SubLObject direction = file_stream_direction( old_stream );
    SubLObject new_stream = NIL;
    streams_high.close( old_stream, UNPROVIDED );
    final SubLObject _prev_bind_0 = StreamsLow.$should_memory_map_files$.currentBinding( thread );
    try
    {
      StreamsLow.$should_memory_map_files$.bind( T, thread );
      if( $kw32$TEXT == element_type )
      {
        new_stream = StreamsLow.open( file_name, new SubLObject[] { $kw33$DIRECTION, direction, $kw35$IF_EXISTS, $kw76$APPEND, $kw36$IF_DOES_NOT_EXIST, $kw246$ERROR, $kw38$ELEMENT_TYPE, $kw32$TEXT
        } );
      }
      else
      {
        new_stream = StreamsLow.open( file_name, new SubLObject[] { $kw33$DIRECTION, direction, $kw35$IF_EXISTS, $kw76$APPEND, $kw36$IF_DOES_NOT_EXIST, $kw246$ERROR, $kw38$ELEMENT_TYPE, $kw71$BINARY
        } );
      }
    }
    finally
    {
      StreamsLow.$should_memory_map_files$.rebind( _prev_bind_0, thread );
    }
    streams_high.file_position( new_stream, loc );
    return new_stream;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 60967L)
  public static SubLObject check_directory_creation_and_deletion(final SubLObject directory_name)
  {
    SubLObject createdP = NIL;
    SubLObject deletedP = NIL;
    make_directory_recursive( directory_name, UNPROVIDED, UNPROVIDED );
    if( NIL != Filesys.directory_p( directory_name ) )
    {
      createdP = T;
      Filesys.delete_directory( directory_name, UNPROVIDED );
      Threads.sleep( ONE_INTEGER );
      deletedP = makeBoolean( NIL == Filesys.directory_p( directory_name ) );
    }
    return makeBoolean( NIL != createdP && NIL != deletedP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 60967L)
  public static SubLObject test_directory_creation_and_deletion()
  {
    return makeBoolean( NIL != test_directory_creation_and_deletion_absolute() && NIL != test_directory_creation_and_deletion_relative() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 60967L)
  public static SubLObject test_directory_creation_and_deletion_absolute()
  {
    final SubLObject absolute_directory = $str27$_tmp_;
    SubLObject failP = NIL;
    if( NIL != Filesys.directory_p( absolute_directory ) )
    {
      final SubLObject name = $str249$ads65jh3_;
      final SubLObject subdirectory = Sequences.cconcatenate( absolute_directory, name );
      if( NIL != Filesys.directory_p( subdirectory ) )
      {
        Errors.warn( $str250$Couldn_t_test_creation_of__S__as_, subdirectory );
      }
      else if( NIL == check_directory_creation_and_deletion( subdirectory ) )
      {
        Errors.warn( $str251$Failed_to_create_or_delete__S, subdirectory );
        failP = T;
      }
      final SubLObject name_$29 = $str252$ds6sdg32;
      final SubLObject sub_sub = Sequences.cconcatenate( subdirectory, name_$29 );
      if( NIL != Filesys.directory_p( sub_sub ) )
      {
        Errors.warn( $str250$Couldn_t_test_creation_of__S__as_, sub_sub );
      }
      else if( NIL == check_directory_creation_and_deletion( sub_sub ) )
      {
        Errors.warn( $str251$Failed_to_create_or_delete__S, sub_sub );
        failP = T;
      }
      Filesys.delete_directory( subdirectory, UNPROVIDED );
    }
    else
    {
      Errors.warn( $str253$Couldn_t_test_creation_and_deleti, absolute_directory );
    }
    return makeBoolean( NIL == failP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-utilities.lisp", position = 60967L)
  public static SubLObject test_directory_creation_and_deletion_relative()
  {
    final SubLObject relative_directory = relative_filename( string_utilities.$empty_string$.getGlobalValue(), Filesys.construct_filename( $list254, string_utilities.$empty_string$.getGlobalValue(), NIL, T ),
        UNPROVIDED );
    SubLObject failP = NIL;
    if( NIL != Filesys.directory_p( relative_directory ) )
    {
      final SubLObject name = $str255$ads65jh3;
      final SubLObject subdirectory = relative_filename( relative_directory, Filesys.construct_filename( ConsesLow.list( name ), string_utilities.$empty_string$.getGlobalValue(), NIL, T ), UNPROVIDED );
      if( NIL != Filesys.directory_p( subdirectory ) )
      {
        Errors.warn( $str250$Couldn_t_test_creation_of__S__as_, subdirectory );
      }
      else if( NIL == check_directory_creation_and_deletion( subdirectory ) )
      {
        Errors.warn( $str251$Failed_to_create_or_delete__S, subdirectory );
        failP = T;
      }
      final SubLObject name_$30 = $str252$ds6sdg32;
      final SubLObject sub_sub = relative_filename( subdirectory, Filesys.construct_filename( ConsesLow.list( name_$30 ), string_utilities.$empty_string$.getGlobalValue(), NIL, T ), UNPROVIDED );
      if( NIL != Filesys.directory_p( sub_sub ) )
      {
        Errors.warn( $str250$Couldn_t_test_creation_of__S__as_, sub_sub );
      }
      else if( NIL == check_directory_creation_and_deletion( sub_sub ) )
      {
        Errors.warn( $str251$Failed_to_create_or_delete__S, sub_sub );
        failP = T;
      }
      Filesys.delete_directory( subdirectory, UNPROVIDED );
    }
    else
    {
      Errors.warn( $str253$Couldn_t_test_creation_and_deleti, relative_directory );
    }
    return makeBoolean( NIL == failP );
  }

  public static SubLObject declare_file_utilities_file()
  {
    SubLFiles.declareMacro( me, "with_stream_buffer_size", "WITH-STREAM-BUFFER-SIZE" );
    SubLFiles.declareMacro( me, "possibly_with_text_file", "POSSIBLY-WITH-TEXT-FILE" );
    SubLFiles.declareMacro( me, "possibly_with_private_text_file", "POSSIBLY-WITH-PRIVATE-TEXT-FILE" );
    SubLFiles.declareMacro( me, "possibly_with_binary_file", "POSSIBLY-WITH-BINARY-FILE" );
    SubLFiles.declareMacro( me, "possibly_with_private_binary_file", "POSSIBLY-WITH-PRIVATE-BINARY-FILE" );
    SubLFiles.declareFunction( me, "peek_byte_from_char_stream", "PEEK-BYTE-FROM-CHAR-STREAM", 0, 3, false );
    SubLFiles.declareFunction( me, "read_byte_from_char_stream", "READ-BYTE-FROM-CHAR-STREAM", 0, 3, false );
    SubLFiles.declareFunction( me, "unread_byte_from_char_stream", "UNREAD-BYTE-FROM-CHAR-STREAM", 1, 1, false );
    SubLFiles.declareFunction( me, "write_byte_to_char_stream", "WRITE-BYTE-TO-CHAR-STREAM", 1, 1, false );
    SubLFiles.declareFunction( me, "stream_designator_p", "STREAM-DESIGNATOR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "pathname_designator_p", "PATHNAME-DESIGNATOR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "load_from_cyc_home", "LOAD-FROM-CYC-HOME", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_home_filename", "CYC-HOME-FILENAME", 2, 1, false );
    SubLFiles.declareFunction( me, "cyc_home_subdirectory", "CYC-HOME-SUBDIRECTORY", 1, 0, false );
    SubLFiles.declareFunction( me, "canonical_cyc_working_directory", "CANONICAL-CYC-WORKING-DIRECTORY", 0, 0, false );
    SubLFiles.declareFunction( me, "relative_filename", "RELATIVE-FILENAME", 2, 1, false );
    SubLFiles.declareFunction( me, "basic_filename", "BASIC-FILENAME", 1, 1, false );
    SubLFiles.declareFunction( me, "temp_directory", "TEMP-DIRECTORY", 0, 0, false );
    SubLFiles.declareFunction( me, "random_path_char", "RANDOM-PATH-CHAR", 0, 0, false );
    SubLFiles.declareFunction( me, "make_temp_filename", "MAKE-TEMP-FILENAME", 0, 1, false );
    SubLFiles.declareFunction( me, "random_filename_part", "RANDOM-FILENAME-PART", 0, 1, false );
    SubLFiles.declareFunction( me, "make_unused_temp_filename", "MAKE-UNUSED-TEMP-FILENAME", 0, 1, false );
    SubLFiles.declareFunction( me, "make_prefixed_temp_filename", "MAKE-PREFIXED-TEMP-FILENAME", 1, 1, false );
    SubLFiles.declareFunction( me, "open_temp_file", "OPEN-TEMP-FILE", 0, 2, false );
    SubLFiles.declareMacro( me, "with_temp_file", "WITH-TEMP-FILE" );
    SubLFiles.declareMacro( me, "with_file_replacement", "WITH-FILE-REPLACEMENT" );
    SubLFiles.declareMacro( me, "with_temporary_filename", "WITH-TEMPORARY-FILENAME" );
    SubLFiles.declareFunction( me, "open_tmp_file", "OPEN-TMP-FILE", 0, 2, false );
    SubLFiles.declareMacro( me, "with_tmp_file", "WITH-TMP-FILE" );
    SubLFiles.declareFunction( me, "directory_writeable_p", "DIRECTORY-WRITEABLE-P", 1, 1, false );
    SubLFiles.declareFunction( me, "file_valid_for_writing_p", "FILE-VALID-FOR-WRITING-P", 1, 0, false );
    SubLFiles.declareFunction( me, "delete_file_if_exists", "DELETE-FILE-IF-EXISTS", 1, 0, false );
    SubLFiles.declareFunction( me, "clean_filename", "CLEAN-FILENAME", 1, 0, false );
    SubLFiles.declareFunction( me, "append_files", "APPEND-FILES", 2, 1, false );
    SubLFiles.declareMacro( me, "cdolines", "CDOLINES" );
    SubLFiles.declareFunction( me, "cdolines_get_next_line", "CDOLINES-GET-NEXT-LINE", 1, 0, false );
    SubLFiles.declareMacro( me, "do_stream_lines", "DO-STREAM-LINES" );
    SubLFiles.declareFunction( me, "do_stream_lines_get_next_line", "DO-STREAM-LINES-GET-NEXT-LINE", 1, 0, false );
    SubLFiles.declareMacro( me, "do_file_lines", "DO-FILE-LINES" );
    SubLFiles.declareFunction( me, "count_file_lines", "COUNT-FILE-LINES", 1, 0, false );
    SubLFiles.declareMacro( me, "do_csv_file_lines", "DO-CSV-FILE-LINES" );
    SubLFiles.declareMacro( me, "cdolines_tokenized", "CDOLINES-TOKENIZED" );
    SubLFiles.declareMacro( me, "cdolines_read", "CDOLINES-READ" );
    SubLFiles.declareMacro( me, "do_file_records", "DO-FILE-RECORDS" );
    SubLFiles.declareMacro( me, "do_directory_contents", "DO-DIRECTORY-CONTENTS" );
    SubLFiles.declareMacro( me, "do_directory_subdirectories", "DO-DIRECTORY-SUBDIRECTORIES" );
    SubLFiles.declareMacro( me, "do_directory_tree_files", "DO-DIRECTORY-TREE-FILES" );
    SubLFiles.declareFunction( me, "directory_file_count", "DIRECTORY-FILE-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "list_directory", "LIST-DIRECTORY", 2, 3, false );
    SubLFiles.declareFunction( me, "sort_files_by_date", "SORT-FILES-BY-DATE", 1, 0, false );
    SubLFiles.declareFunction( me, "slurp_file", "SLURP-FILE", 1, 0, false );
    SubLFiles.declareFunction( me, "slurp_file_robust", "SLURP-FILE-ROBUST", 1, 0, false );
    SubLFiles.declareFunction( me, "slurp_file_lines", "SLURP-FILE-LINES", 1, 0, false );
    SubLFiles.declareFunction( me, "file_existsP", "FILE-EXISTS?", 1, 0, false );
    SubLFiles.declareFunction( me, "why_not_probe_fileP", "WHY-NOT-PROBE-FILE?", 1, 0, false );
    SubLFiles.declareFunction( me, "guess_path_type", "GUESS-PATH-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "guess_path_type_robust", "GUESS-PATH-TYPE-ROBUST", 1, 0, false );
    SubLFiles.declareFunction( me, "absolute_default_path_string", "ABSOLUTE-DEFAULT-PATH-STRING", 0, 0, false );
    SubLFiles.declareFunction( me, "possibly_append_path_separator_char", "POSSIBLY-APPEND-PATH-SEPARATOR-CHAR", 1, 0, false );
    SubLFiles.declareFunction( me, "get_absolute_path_string", "GET-ABSOLUTE-PATH-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "absolute_pathP", "ABSOLUTE-PATH?", 1, 0, false );
    SubLFiles.declareFunction( me, "path_separator_char", "PATH-SEPARATOR-CHAR", 1, 0, false );
    SubLFiles.declareFunction( me, "path_separator_string", "PATH-SEPARATOR-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "deconstruct_path", "DECONSTRUCT-PATH", 1, 0, false );
    SubLFiles.declareFunction( me, "reconstruct_path", "RECONSTRUCT-PATH", 2, 1, false );
    SubLFiles.declareFunction( me, "make_path_absolute_relative_to", "MAKE-PATH-ABSOLUTE-RELATIVE-TO", 2, 0, false );
    SubLFiles.declareFunction( me, "make_absolute_path_relative_to", "MAKE-ABSOLUTE-PATH-RELATIVE-TO", 2, 0, false );
    SubLFiles.declareFunction( me, "pathstring_filename", "PATHSTRING-FILENAME", 1, 0, false );
    SubLFiles.declareFunction( me, "pathstring_directory_name", "PATHSTRING-DIRECTORY-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "partially_deconstruct_path", "PARTIALLY-DECONSTRUCT-PATH", 1, 0, false );
    SubLFiles.declareFunction( me, "ensure_unique_filename", "ENSURE-UNIQUE-FILENAME", 1, 1, false );
    SubLFiles.declareFunction( me, "read_text_file", "READ-TEXT-FILE", 1, 0, false );
    SubLFiles.declareFunction( me, "output_text_file", "OUTPUT-TEXT-FILE", 2, 1, false );
    SubLFiles.declareFunction( me, "write_text_file", "WRITE-TEXT-FILE", 2, 0, false );
    SubLFiles.declareFunction( me, "append_text_file", "APPEND-TEXT-FILE", 2, 0, false );
    SubLFiles.declareFunction( me, "truncate_file", "TRUNCATE-FILE", 1, 0, false );
    SubLFiles.declareFunction( me, "empty_file_p", "EMPTY-FILE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "ensure_directories_exist", "ENSURE-DIRECTORIES-EXIST", 1, 0, false );
    SubLFiles.declareFunction( me, "make_directory_recursive", "MAKE-DIRECTORY-RECURSIVE", 1, 2, false );
    SubLFiles.declareFunction( me, "logical_pathname_to_physical", "LOGICAL-PATHNAME-TO-PHYSICAL", 1, 0, false );
    SubLFiles.declareFunction( me, "recursive_delete_directory", "RECURSIVE-DELETE-DIRECTORY", 1, 0, false );
    SubLFiles.declareFunction( me, "recursive_copy_directory", "RECURSIVE-COPY-DIRECTORY", 2, 0, false );
    SubLFiles.declareFunction( me, "chmod", "CHMOD", 2, 0, false );
    SubLFiles.declareFunction( me, "delete_file_via_os", "DELETE-FILE-VIA-OS", 1, 0, false );
    SubLFiles.declareFunction( me, "create_symbolic_link", "CREATE-SYMBOLIC-LINK", 2, 0, false );
    SubLFiles.declareFunction( me, "link_or_copy_file", "LINK-OR-COPY-FILE", 2, 0, false );
    SubLFiles.declareFunction( me, "move_file", "MOVE-FILE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_file_length", "GET-FILE-LENGTH", 1, 0, false );
    SubLFiles.declareFunction( me, "copy_file_checked", "COPY-FILE-CHECKED", 2, 0, false );
    SubLFiles.declareFunction( me, "get_file_lines", "GET-FILE-LINES", 1, 0, false );
    SubLFiles.declareFunction( me, "get_stream_forms", "GET-STREAM-FORMS", 1, 0, false );
    SubLFiles.declareFunction( me, "get_file_forms", "GET-FILE-FORMS", 1, 0, false );
    SubLFiles.declareFunction( me, "get_file_line_count", "GET-FILE-LINE-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "load_file_catching_error", "LOAD-FILE-CATCHING-ERROR", 1, 0, false );
    SubLFiles.declareFunction( me, "normal_pathstring", "NORMAL-PATHSTRING", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_update_keepalive_file", "POSSIBLY-UPDATE-KEEPALIVE-FILE", 1, 0, false );
    SubLFiles.declareFunction( me, "update_keepalive_file", "UPDATE-KEEPALIVE-FILE", 1, 0, false );
    SubLFiles.declareFunction( me, "make_directory_or_error", "MAKE-DIRECTORY-OR-ERROR", 1, 1, false );
    SubLFiles.declareFunction( me, "make_directory_or_possibly_error", "MAKE-DIRECTORY-OR-POSSIBLY-ERROR", 1, 2, false );
    SubLFiles.declareFunction( me, "make_timestamp_subdirectory", "MAKE-TIMESTAMP-SUBDIRECTORY", 1, 0, false );
    SubLFiles.declareFunction( me, "timestamp_subdirectory", "TIMESTAMP-SUBDIRECTORY", 1, 0, false );
    SubLFiles.declareFunction( me, "prepare_to_possibly_overwrite_file", "PREPARE-TO-POSSIBLY-OVERWRITE-FILE", 1, 1, false );
    SubLFiles.declareFunction( me, "new_file_accumulator", "NEW-FILE-ACCUMULATOR", 1, 2, false );
    SubLFiles.declareFunction( me, "close_file_accumulator", "CLOSE-FILE-ACCUMULATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "make_file_accumulator_state", "MAKE-FILE-ACCUMULATOR-STATE", 2, 0, false );
    SubLFiles.declareMacro( me, "with_file_accumulator_state", "WITH-FILE-ACCUMULATOR-STATE" );
    SubLFiles.declareFunction( me, "file_accumulator_state_set_item_count", "FILE-ACCUMULATOR-STATE-SET-ITEM-COUNT", 2, 0, false );
    SubLFiles.declareFunction( me, "file_accumulator_state_reset_item_count", "FILE-ACCUMULATOR-STATE-RESET-ITEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "file_accumulator_state_get_stream", "FILE-ACCUMULATOR-STATE-GET-STREAM", 1, 0, false );
    SubLFiles.declareFunction( me, "file_accumulator_reset", "FILE-ACCUMULATOR-RESET", 1, 0, false );
    SubLFiles.declareFunction( me, "file_accumulator_add", "FILE-ACCUMULATOR-ADD", 2, 0, false );
    SubLFiles.declareFunction( me, "file_accumulator_size", "FILE-ACCUMULATOR-SIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "file_accumulator_contents", "FILE-ACCUMULATOR-CONTENTS", 2, 0, false );
    SubLFiles.declareFunction( me, "file_accumulator_iterator", "FILE-ACCUMULATOR-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "file_accumulator_release_resources", "FILE-ACCUMULATOR-RELEASE-RESOURCES", 1, 0, false );
    SubLFiles.declareFunction( me, "copy_binary_data_to_hex_stream", "COPY-BINARY-DATA-TO-HEX-STREAM", 3, 1, false );
    SubLFiles.declareFunction( me, "get_binary_data_from_stream", "GET-BINARY-DATA-FROM-STREAM", 2, 1, false );
    SubLFiles.declareFunction( me, "test_get_binary_data_from_stream", "TEST-GET-BINARY-DATA-FROM-STREAM", 1, 0, false );
    SubLFiles.declareFunction( me, "file_contents_to_hex_string", "FILE-CONTENTS-TO-HEX-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "hex_string_to_file_contents", "HEX-STRING-TO-FILE-CONTENTS", 2, 0, false );
    SubLFiles.declareFunction( me, "file_stream_direction", "FILE-STREAM-DIRECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "change_file_stream_buffer_size", "CHANGE-FILE-STREAM-BUFFER-SIZE", 2, 0, false );
    SubLFiles.declareMacro( me, "with_file_memory_mapping", "WITH-FILE-MEMORY-MAPPING" );
    SubLFiles.declareMacro( me, "without_file_memory_mapping", "WITHOUT-FILE-MEMORY-MAPPING" );
    SubLFiles.declareFunction( me, "file_stream_memory_mappedP", "FILE-STREAM-MEMORY-MAPPED?", 1, 0, false );
    SubLFiles.declareFunction( me, "enable_file_stream_memory_mapping", "ENABLE-FILE-STREAM-MEMORY-MAPPING", 1, 0, false );
    SubLFiles.declareFunction( me, "check_directory_creation_and_deletion", "CHECK-DIRECTORY-CREATION-AND-DELETION", 1, 0, false );
    SubLFiles.declareFunction( me, "test_directory_creation_and_deletion", "TEST-DIRECTORY-CREATION-AND-DELETION", 0, 0, false );
    SubLFiles.declareFunction( me, "test_directory_creation_and_deletion_absolute", "TEST-DIRECTORY-CREATION-AND-DELETION-ABSOLUTE", 0, 0, false );
    SubLFiles.declareFunction( me, "test_directory_creation_and_deletion_relative", "TEST-DIRECTORY-CREATION-AND-DELETION-RELATIVE", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_file_utilities_file()
  {
    $default_big_stream_buffer_size$ = SubLFiles.defparameter( "*DEFAULT-BIG-STREAM-BUFFER-SIZE*", $int0$4194304 );
    $default_small_stream_buffer_size$ = SubLFiles.defparameter( "*DEFAULT-SMALL-STREAM-BUFFER-SIZE*", $int1$4096 );
    $temp_directory$ = SubLFiles.deflexical( "*TEMP-DIRECTORY*", red_infrastructure_macros.red_def_helper( $list25.isSymbol() ? Symbols.symbol_value( $list25 ) : $list25, $sym26$_TEMP_DIRECTORY_, $str27$_tmp_.isSymbol()
        ? Symbols.symbol_value( $str27$_tmp_ )
        : $str27$_tmp_, $kw28$LEXICAL, UNPROVIDED ) );
    $random_path_chars$ = SubLFiles.deflexical( "*RANDOM-PATH-CHARS*", $str29$0123456789abcdefghijklmnopqrstuvw );
    return NIL;
  }

  public static SubLObject setup_file_utilities_file()
  {
    access_macros.register_external_symbol( $sym20$LOAD_FROM_CYC_HOME );
    access_macros.define_obsolete_register( $sym42$OPEN_TMP_FILE, $list59 );
    access_macros.register_macro_helper( $sym81$CDOLINES_GET_NEXT_LINE, $sym84$CDOLINES );
    access_macros.register_macro_helper( $sym94$DO_STREAM_LINES_GET_NEXT_LINE, $sym90$DO_STREAM_LINES );
    generic_testing.define_test_case_table_int( $sym236$TEST_GET_BINARY_DATA_FROM_STREAM, ConsesLow.list( new SubLObject[] { $kw237$TEST, NIL, $kw238$OWNER, NIL, $kw239$CLASSES, NIL, $kw240$KB, $kw241$TINY,
      $kw242$WORKING_, T
    } ), $list243 );
    generic_testing.define_test_case_table_int( $sym256$TEST_DIRECTORY_CREATION_AND_DELETION, ConsesLow.list( new SubLObject[] { $kw237$TEST, NIL, $kw238$OWNER, NIL, $kw239$CLASSES, NIL, $kw240$KB, $kw241$TINY,
      $kw242$WORKING_, T
    } ), $list257 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_file_utilities_file();
  }

  @Override
  public void initializeVariables()
  {
    init_file_utilities_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_file_utilities_file();
  }
  static
  {
    me = new file_utilities();
    $default_big_stream_buffer_size$ = null;
    $default_small_stream_buffer_size$ = null;
    $temp_directory$ = null;
    $random_path_chars$ = null;
    $int0$4194304 = makeInteger( 4194304 );
    $int1$4096 = makeInteger( 4096 );
    $list2 = ConsesLow.list( ConsesLow.list( makeSymbol( "SIZE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym3$CLET = makeSymbol( "CLET" );
    $sym4$_STREAM_INITIAL_INPUT_BUFFER_SIZE_ = makeSymbol( "*STREAM-INITIAL-INPUT-BUFFER-SIZE*" );
    $list5 = ConsesLow.list( ConsesLow.list( makeSymbol( "*STREAM-INITIAL-OUTPUT-BUFFER-SIZE*" ), makeSymbol( "*STREAM-INITIAL-INPUT-BUFFER-SIZE*" ) ) );
    $list6 = ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "*STREAM-INITIAL-INPUT-BUFFER-SIZE*" ), makeSymbol( "*STREAM-INITIAL-OUTPUT-BUFFER-SIZE*" ) );
    $list7 = ConsesLow.list( ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "FILENAME" ), makeSymbol( "DIRECTION" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym8$FILENAME_VAR = makeUninternedSymbol( "FILENAME-VAR" );
    $sym9$PIF = makeSymbol( "PIF" );
    $sym10$WITH_TEXT_FILE = makeSymbol( "WITH-TEXT-FILE" );
    $list11 = ConsesLow.list( NIL );
    $sym12$FILENAME_VAR = makeUninternedSymbol( "FILENAME-VAR" );
    $sym13$WITH_PRIVATE_TEXT_FILE = makeSymbol( "WITH-PRIVATE-TEXT-FILE" );
    $sym14$FILENAME_VAR = makeUninternedSymbol( "FILENAME-VAR" );
    $sym15$WITH_BINARY_FILE = makeSymbol( "WITH-BINARY-FILE" );
    $sym16$FILENAME_VAR = makeUninternedSymbol( "FILENAME-VAR" );
    $sym17$WITH_PRIVATE_BINARY_FILE = makeSymbol( "WITH-PRIVATE-BINARY-FILE" );
    $kw18$EOF = makeKeyword( "EOF" );
    $sym19$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $sym20$LOAD_FROM_CYC_HOME = makeSymbol( "LOAD-FROM-CYC-HOME" );
    $sym21$LISTP = makeSymbol( "LISTP" );
    $str22$ = makeString( "" );
    $str23$_ = makeString( "." );
    $sym24$STRINGP = makeSymbol( "STRINGP" );
    $list25 = ConsesLow.list( makeString( "rck.please.put.this.in.the.right.place" ) );
    $sym26$_TEMP_DIRECTORY_ = makeSymbol( "*TEMP-DIRECTORY*" );
    $str27$_tmp_ = makeString( "/tmp/" );
    $kw28$LEXICAL = makeKeyword( "LEXICAL" );
    $str29$0123456789abcdefghijklmnopqrstuvw = makeString( "0123456789abcdefghijklmnopqrstuvwxyz" );
    $int30$36 = makeInteger( 36 );
    $str31$tmp = makeString( "tmp" );
    $kw32$TEXT = makeKeyword( "TEXT" );
    $kw33$DIRECTION = makeKeyword( "DIRECTION" );
    $kw34$IO = makeKeyword( "IO" );
    $kw35$IF_EXISTS = makeKeyword( "IF-EXISTS" );
    $kw36$IF_DOES_NOT_EXIST = makeKeyword( "IF-DOES-NOT-EXIST" );
    $kw37$CREATE = makeKeyword( "CREATE" );
    $kw38$ELEMENT_TYPE = makeKeyword( "ELEMENT-TYPE" );
    $list39 = ConsesLow.list( ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "ELEMENT-TYPE" ), makeKeyword( "TEXT" ) ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list40 = ConsesLow.list( makeKeyword( "ELEMENT-TYPE" ) );
    $kw41$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $sym42$OPEN_TMP_FILE = makeSymbol( "OPEN-TMP-FILE" );
    $sym43$CUNWIND_PROTECT = makeSymbol( "CUNWIND-PROTECT" );
    $sym44$PWHEN = makeSymbol( "PWHEN" );
    $sym45$STREAMP = makeSymbol( "STREAMP" );
    $sym46$DELETE_FILE = makeSymbol( "DELETE-FILE" );
    $sym47$CLOSE = makeSymbol( "CLOSE" );
    $list48 = ConsesLow.list( ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "FILENAME" ), makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "ELEMENT-TYPE" ), makeKeyword( "TEXT" ) ) ), makeSymbol( "&BODY" ),
        makeSymbol( "BODY" ) );
    $sym49$FORCE_OUTPUT = makeSymbol( "FORCE-OUTPUT" );
    $sym50$PROBE_FILE = makeSymbol( "PROBE-FILE" );
    $sym51$COPY_FILE = makeSymbol( "COPY-FILE" );
    $sym52$TO_STRING = makeSymbol( "TO-STRING" );
    $list53 = ConsesLow.list( ConsesLow.list( makeSymbol( "FILENAME" ), makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "DIRECTORY" ), makeSymbol( "*TEMP-DIRECTORY*" ) ) ), makeSymbol( "&BODY" ), makeSymbol(
        "BODY" ) );
    $list54 = ConsesLow.list( makeKeyword( "DIRECTORY" ) );
    $kw55$DIRECTORY = makeKeyword( "DIRECTORY" );
    $sym56$MAKE_TEMP_FILENAME = makeSymbol( "MAKE-TEMP-FILENAME" );
    $sym57$PROGN = makeSymbol( "PROGN" );
    $sym58$IGNORE_ERRORS = makeSymbol( "IGNORE-ERRORS" );
    $list59 = ConsesLow.list( makeSymbol( "OPEN-TEMP-FILE" ) );
    $list60 = ConsesLow.list( ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "ELEMENT-TYPE" ), makeKeyword( "TEXT" ) ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym61$WITH_TMP_FILE = makeSymbol( "WITH-TMP-FILE" );
    $list62 = ConsesLow.list( makeSymbol( "WITH-TEMP-FILE" ) );
    $sym63$WITH_TEMP_FILE = makeSymbol( "WITH-TEMP-FILE" );
    $sym64$INTEGERP = makeSymbol( "INTEGERP" );
    $kw65$IGNORE_ERRORS_TARGET = makeKeyword( "IGNORE-ERRORS-TARGET" );
    $sym66$IGNORE_ERRORS_HANDLER = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $kw67$OUTPUT = makeKeyword( "OUTPUT" );
    $str68$Unable_to_open__S = makeString( "Unable to open ~S" );
    $sym69$READ_CHAR = makeSymbol( "READ-CHAR" );
    $sym70$WRITE_CHAR = makeSymbol( "WRITE-CHAR" );
    $kw71$BINARY = makeKeyword( "BINARY" );
    $kw72$DEFAULT = makeKeyword( "DEFAULT" );
    $sym73$READ_BYTE = makeSymbol( "READ-BYTE" );
    $sym74$WRITE_BYTE = makeSymbol( "WRITE-BYTE" );
    $str75$_S_is_not_a_valid_mode_ = makeString( "~S is not a valid mode." );
    $kw76$APPEND = makeKeyword( "APPEND" );
    $list77 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "FILE" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym78$INFILE = makeUninternedSymbol( "INFILE" );
    $list79 = ConsesLow.list( makeKeyword( "INPUT" ) );
    $sym80$CDO = makeSymbol( "CDO" );
    $sym81$CDOLINES_GET_NEXT_LINE = makeSymbol( "CDOLINES-GET-NEXT-LINE" );
    $sym82$COR = makeSymbol( "COR" );
    $sym83$NULL = makeSymbol( "NULL" );
    $sym84$CDOLINES = makeSymbol( "CDOLINES" );
    $list85 = ConsesLow.list( ConsesLow.list( makeSymbol( "LINE-VAR" ), makeSymbol( "STREAM" ), makeSymbol( "&KEY" ), makeSymbol( "LINE-NUMBER" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list86 = ConsesLow.list( makeKeyword( "LINE-NUMBER" ), makeKeyword( "DONE" ) );
    $kw87$LINE_NUMBER = makeKeyword( "LINE-NUMBER" );
    $kw88$DONE = makeKeyword( "DONE" );
    $sym89$LINE_NUMBER_VAR = makeUninternedSymbol( "LINE-NUMBER-VAR" );
    $sym90$DO_STREAM_LINES = makeSymbol( "DO-STREAM-LINES" );
    $sym91$STREAM_VAR = makeUninternedSymbol( "STREAM-VAR" );
    $sym92$SYMBOLP = makeSymbol( "SYMBOLP" );
    $sym93$1_ = makeSymbol( "1+" );
    $sym94$DO_STREAM_LINES_GET_NEXT_LINE = makeSymbol( "DO-STREAM-LINES-GET-NEXT-LINE" );
    $list95 = ConsesLow.list( ConsesLow.list( makeSymbol( "LINE-VAR" ), makeSymbol( "FILE" ), makeSymbol( "&KEY" ), makeSymbol( "LINE-NUMBER" ), makeSymbol( "PROGRESS-MESSAGE" ), makeSymbol( "DONE" ) ), makeSymbol(
        "&BODY" ), makeSymbol( "BODY" ) );
    $list96 = ConsesLow.list( makeKeyword( "LINE-NUMBER" ), makeKeyword( "PROGRESS-MESSAGE" ), makeKeyword( "DONE" ) );
    $kw97$PROGRESS_MESSAGE = makeKeyword( "PROGRESS-MESSAGE" );
    $sym98$FILE_VAR = makeUninternedSymbol( "FILE-VAR" );
    $sym99$STREAM_VAR = makeUninternedSymbol( "STREAM-VAR" );
    $sym100$FILE_VAR = makeUninternedSymbol( "FILE-VAR" );
    $sym101$STREAM_VAR = makeUninternedSymbol( "STREAM-VAR" );
    $sym102$LENGTH_VAR = makeUninternedSymbol( "LENGTH-VAR" );
    $sym103$NOTING_PERCENT_PROGRESS = makeSymbol( "NOTING-PERCENT-PROGRESS" );
    $sym104$FILE_LENGTH = makeSymbol( "FILE-LENGTH" );
    $sym105$NOTE_PERCENT_PROGRESS = makeSymbol( "NOTE-PERCENT-PROGRESS" );
    $sym106$FILE_POSITION = makeSymbol( "FILE-POSITION" );
    $kw107$INPUT = makeKeyword( "INPUT" );
    $list108 = ConsesLow.list( ConsesLow.list( makeSymbol( "TOKENIZED-LINE" ), makeSymbol( "FILE" ), makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "BREAK-LIST" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow
        .list( makeSymbol( "LIST" ), Characters.CHAR_comma ) ) ), ConsesLow.list( makeSymbol( "EMBED-LIST" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeSymbol( "LIST" ), ConsesLow.list( makeSymbol(
            "LIST" ), makeString( "\"" ), makeString( "\"" ) ) ) ) ), makeSymbol( "INCLUDE-STOPS" ), makeSymbol( "IGNORE-EMPTY-STRINGS" ), ConsesLow.list( makeSymbol( "QUOTE-CHARS" ), ConsesLow.list( makeSymbol(
                "QUOTE" ), ConsesLow.list( makeSymbol( "LIST" ), Characters.CHAR_backslash ) ) ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list109 = ConsesLow.list( makeKeyword( "BREAK-LIST" ), makeKeyword( "EMBED-LIST" ), makeKeyword( "INCLUDE-STOPS" ), makeKeyword( "IGNORE-EMPTY-STRINGS" ), makeKeyword( "QUOTE-CHARS" ) );
    $kw110$BREAK_LIST = makeKeyword( "BREAK-LIST" );
    $list111 = ConsesLow.list( makeSymbol( "LIST" ), Characters.CHAR_comma );
    $kw112$EMBED_LIST = makeKeyword( "EMBED-LIST" );
    $list113 = ConsesLow.list( makeSymbol( "LIST" ), ConsesLow.list( makeSymbol( "LIST" ), makeString( "\"" ), makeString( "\"" ) ) );
    $kw114$INCLUDE_STOPS = makeKeyword( "INCLUDE-STOPS" );
    $kw115$IGNORE_EMPTY_STRINGS = makeKeyword( "IGNORE-EMPTY-STRINGS" );
    $kw116$QUOTE_CHARS = makeKeyword( "QUOTE-CHARS" );
    $list117 = ConsesLow.list( makeSymbol( "LIST" ), Characters.CHAR_backslash );
    $sym118$LINE = makeUninternedSymbol( "LINE" );
    $sym119$DO_FILE_LINES = makeSymbol( "DO-FILE-LINES" );
    $sym120$STRING_TOKENIZE = makeSymbol( "STRING-TOKENIZE" );
    $list121 = ConsesLow.list( ConsesLow.list( makeSymbol( "FILE" ), makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "BREAK-LIST" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeSymbol( "MAPCAR" ),
        ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "TO-STRING" ) ), ConsesLow.list( makeSymbol( "WHITESPACE-CHARS" ) ) ) ) ), makeSymbol( "EMBED-LIST" ), makeSymbol( "INCLUDE-STOPS" ), ConsesLow.list(
            makeSymbol( "IGNORE-EMPTY-STRINGS" ), T ), makeSymbol( "QUOTE-CHARS" ) ), makeSymbol( "LAMBDA-LIST" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list122 = ConsesLow.list( makeSymbol( "MAPCAR" ), ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "TO-STRING" ) ), ConsesLow.list( makeSymbol( "WHITESPACE-CHARS" ) ) );
    $sym123$LINE = makeUninternedSymbol( "LINE" );
    $sym124$CDESTRUCTURING_BIND = makeSymbol( "CDESTRUCTURING-BIND" );
    $sym125$MAPCAR = makeSymbol( "MAPCAR" );
    $list126 = ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "READ-FROM-STRING" ) );
    $sym127$LINE = makeUninternedSymbol( "LINE" );
    $sym128$LINE_INDEX = makeUninternedSymbol( "LINE-INDEX" );
    $sym129$DONE_INT = makeUninternedSymbol( "DONE-INT" );
    $list130 = ConsesLow.list( ZERO_INTEGER );
    $list131 = ConsesLow.list( ConsesLow.list( makeSymbol( "QUOTE" ), NIL ) );
    $sym132$WHILE = makeSymbol( "WHILE" );
    $sym133$_ = makeSymbol( "<" );
    $sym134$LENGTH = makeSymbol( "LENGTH" );
    $sym135$CMULTIPLE_VALUE_BIND = makeSymbol( "CMULTIPLE-VALUE-BIND" );
    $list136 = ConsesLow.list( makeSymbol( "ITEM" ), makeSymbol( "TEMP-LINE-INDEX" ) );
    $sym137$READ_FROM_STRING = makeSymbol( "READ-FROM-STRING" );
    $sym138$CPUSH = makeSymbol( "CPUSH" );
    $sym139$ITEM = makeSymbol( "ITEM" );
    $sym140$CSETQ = makeSymbol( "CSETQ" );
    $list141 = ConsesLow.list( makeSymbol( "TEMP-LINE-INDEX" ) );
    $sym142$NREVERSE = makeSymbol( "NREVERSE" );
    $sym143$PUNLESS = makeSymbol( "PUNLESS" );
    $list144 = ConsesLow.list( ConsesLow.list( makeSymbol( "RECORD" ), makeSymbol( "FILE" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "SEPARATOR-TEST" ), ConsesLow.list( makeSymbol( "FUNCTION" ),
        makeSymbol( "WHITESPACE-STRING?" ) ) ), ConsesLow.list( makeSymbol( "IGNORE-TEST" ), ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "FALSE" ) ) ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym145$WHITESPACE_STRING_ = makeSymbol( "WHITESPACE-STRING?" );
    $sym146$FALSE = makeSymbol( "FALSE" );
    $sym147$INSTREAM = makeUninternedSymbol( "INSTREAM" );
    $sym148$LINE = makeUninternedSymbol( "LINE" );
    $sym149$INPUT_STREAM_P = makeSymbol( "INPUT-STREAM-P" );
    $sym150$NETWORK_READ_LINE = makeSymbol( "NETWORK-READ-LINE" );
    $list151 = ConsesLow.list( NIL, NIL );
    $sym152$FUNCALL = makeSymbol( "FUNCALL" );
    $list153 = ConsesLow.list( ConsesLow.list( makeSymbol( "FILE-VAR" ), makeSymbol( "DIRECTORY" ), makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "INCLUDE-DIRECTORY?" ), T ), makeSymbol( "PROGRESS-MESSAGE" ),
        makeSymbol( "DONE" ), makeSymbol( "SORT-FN" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list154 = ConsesLow.list( makeKeyword( "INCLUDE-DIRECTORY?" ), makeKeyword( "PROGRESS-MESSAGE" ), makeKeyword( "DONE" ), makeKeyword( "SORT-FN" ) );
    $kw155$INCLUDE_DIRECTORY_ = makeKeyword( "INCLUDE-DIRECTORY?" );
    $kw156$SORT_FN = makeKeyword( "SORT-FN" );
    $sym157$DIRECTORY_CONTENTS_VAR = makeUninternedSymbol( "DIRECTORY-CONTENTS-VAR" );
    $sym158$PROGRESS_MESSAGE_VAR = makeUninternedSymbol( "PROGRESS-MESSAGE-VAR" );
    $sym159$CHECK_TYPE = makeSymbol( "CHECK-TYPE" );
    $list160 = ConsesLow.list( makeSymbol( "DIRECTORY-P" ) );
    $sym161$DIRECTORY = makeSymbol( "DIRECTORY" );
    $sym162$_SILENT_PROGRESS__ = makeSymbol( "*SILENT-PROGRESS?*" );
    $sym163$CNOT = makeSymbol( "CNOT" );
    $sym164$FUNCTION_SPEC_P = makeSymbol( "FUNCTION-SPEC-P" );
    $sym165$SORT = makeSymbol( "SORT" );
    $sym166$PROGRESS_CSOME = makeSymbol( "PROGRESS-CSOME" );
    $list167 = ConsesLow.list( ConsesLow.list( makeSymbol( "SUBDIRECTORY" ), makeSymbol( "DIRECTORY" ), makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "INCLUDE-DIRECTORY?" ), T ) ), makeSymbol( "&BODY" ), makeSymbol(
        "BODY" ) );
    $list168 = ConsesLow.list( makeKeyword( "INCLUDE-DIRECTORY?" ) );
    $sym169$DO_DIRECTORY_CONTENTS = makeSymbol( "DO-DIRECTORY-CONTENTS" );
    $sym170$DIRECTORY_P = makeSymbol( "DIRECTORY-P" );
    $sym171$FCOND = makeSymbol( "FCOND" );
    $sym172$ENDS_WITH = makeSymbol( "ENDS-WITH" );
    $list173 = ConsesLow.list( makeString( "/" ) );
    $sym174$CCONCATENATE = makeSymbol( "CCONCATENATE" );
    $str175$_ = makeString( "/" );
    $sym176$LAST_CHAR = makeSymbol( "LAST-CHAR" );
    $list177 = ConsesLow.list( Characters.CHAR_slash );
    $list178 = ConsesLow.list( ConsesLow.list( makeSymbol( "FILE-VAR" ), makeSymbol( "DIRECTORY" ), makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "INCLUDE-DIRECTORY?" ), T ), ConsesLow.list( makeSymbol(
        "PROGRESS-MESSAGE" ), makeString( "Processing directory tree files..." ) ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list179 = ConsesLow.list( makeKeyword( "INCLUDE-DIRECTORY?" ), makeKeyword( "PROGRESS-MESSAGE" ) );
    $str180$Processing_directory_tree_files__ = makeString( "Processing directory tree files..." );
    $sym181$DIRECTORY_LIST_VAR = makeUninternedSymbol( "DIRECTORY-LIST-VAR" );
    $sym182$CURRENT_DIRECTORY_VAR = makeUninternedSymbol( "CURRENT-DIRECTORY-VAR" );
    $sym183$LIST = makeSymbol( "LIST" );
    $sym184$FIRST = makeSymbol( "FIRST" );
    $sym185$CPOP = makeSymbol( "CPOP" );
    $sym186$FWHEN = makeSymbol( "FWHEN" );
    $sym187$FORMAT_NIL = makeSymbol( "FORMAT-NIL" );
    $str188$___Directory___S = makeString( "~% Directory: ~S" );
    $str189$cdolist = makeString( "cdolist" );
    $sym190$SECOND = makeSymbol( "SECOND" );
    $sym191$FILE_WRITE_DATE = makeSymbol( "FILE-WRITE-DATE" );
    $str192$_ = makeString( "\\" );
    $list193 = ConsesLow.list( makeString( "/" ), makeString( "\\" ) );
    $str194$Could_not_find__A = makeString( "Could not find ~A" );
    $str195$Could_not_find__A_A = makeString( "Could not find ~A~A" );
    $str196$File_not_found_ = makeString( "File not found." );
    $str197$File_not_found_from_directory__A = makeString( "File not found from directory ~A" );
    $kw198$UNIX = makeKeyword( "UNIX" );
    $kw199$DOS = makeKeyword( "DOS" );
    $str200$__ = makeString( "\\\\" );
    $kw201$MAC = makeKeyword( "MAC" );
    $str202$_ = makeString( ":" );
    $str203$Path_type_mismatch_ = makeString( "Path type mismatch." );
    $str204$__ = makeString( ".." );
    $str205$Cannot_make_relative_path__A_even = makeString( "Cannot make relative path ~A even more relative ...." );
    $str206$Cannot_strip_non_absolute_prefix_ = makeString( "Cannot strip non-absolute prefix ~A from path ~A." );
    $str207$_ = makeString( "-" );
    $str208$Warning__unable_to_read_file__s__ = makeString( "Warning: unable to read file ~s~%" );
    $str209$make_directory_recursive__could_n = makeString( "make-directory-recursive: could not create ~A since it exists as a file." );
    $str210$Able_to_create_directory__A__but_ = makeString( "Able to create directory ~A, but unable to set permissions." );
    $str211$chmod = makeString( "chmod" );
    $str212$ln = makeString( "ln" );
    $str213$_s = makeString( "-s" );
    $str214$Copy_of__A_to__A_failed___A_has__ = makeString( "Copy of ~A to ~A failed; ~A has ~A bytes, but ~A has ~A.~%" );
    $str215$I_m_alive___ = makeString( "I'm alive!~%" );
    $str216$Could_not_make_directory__a_with_ = makeString( "Could not make directory ~a with path ~a" );
    $str217$File_already_exists___A__ = makeString( "File already exists: ~A~%" );
    $sym218$PRINT = makeSymbol( "PRINT" );
    $sym219$OPEN_TEXT = makeSymbol( "OPEN-TEXT" );
    $sym220$OPEN_BINARY = makeSymbol( "OPEN-BINARY" );
    $str221$Cannot_open__A_for_writing___ = makeString( "Cannot open ~A for writing.~%" );
    $sym222$FILE_ACCUMULATOR_RESET = makeSymbol( "FILE-ACCUMULATOR-RESET" );
    $sym223$FILE_ACCUMULATOR_ADD = makeSymbol( "FILE-ACCUMULATOR-ADD" );
    $sym224$FILE_ACCUMULATOR_SIZE = makeSymbol( "FILE-ACCUMULATOR-SIZE" );
    $sym225$FILE_ACCUMULATOR_CONTENTS = makeSymbol( "FILE-ACCUMULATOR-CONTENTS" );
    $sym226$FILE_ACCUMULATOR_ITERATOR = makeSymbol( "FILE-ACCUMULATOR-ITERATOR" );
    $kw227$STREAM = makeKeyword( "STREAM" );
    $kw228$WRITER = makeKeyword( "WRITER" );
    $kw229$ITEM_COUNT = makeKeyword( "ITEM-COUNT" );
    $list230 = ConsesLow.list( ConsesLow.list( makeSymbol( "STATE" ), makeSymbol( "STREAM" ), makeSymbol( "WRITER" ), makeSymbol( "ITEM-COUNT" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym231$_KEY = makeSymbol( "&KEY" );
    $list232 = ConsesLow.list( makeSymbol( "&KEY" ), makeSymbol( "STREAM" ), makeSymbol( "WRITER" ), makeSymbol( "ITEM-COUNT" ) );
    $list233 = ConsesLow.list( makeKeyword( "STREAM" ), makeKeyword( "WRITER" ), makeKeyword( "ITEM-COUNT" ) );
    $str234$Operation_not_supported_for_file_ = makeString( "Operation not supported for file accumulator ~A." );
    $str235$Operation_not_yet_supported_for_f = makeString( "Operation not yet supported for file accumulator ~A" );
    $sym236$TEST_GET_BINARY_DATA_FROM_STREAM = makeSymbol( "TEST-GET-BINARY-DATA-FROM-STREAM" );
    $kw237$TEST = makeKeyword( "TEST" );
    $kw238$OWNER = makeKeyword( "OWNER" );
    $kw239$CLASSES = makeKeyword( "CLASSES" );
    $kw240$KB = makeKeyword( "KB" );
    $kw241$TINY = makeKeyword( "TINY" );
    $kw242$WORKING_ = makeKeyword( "WORKING?" );
    $list243 = ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "abc" ), makeInteger( 123 ), ConsesLow.list( ONE_INTEGER, TWO_INTEGER, THREE_INTEGER ) ) ), makeKeyword( "SUCCESS" ) ) );
    $str244$Expected__S__which_is___A__A__of_ = makeString( "Expected ~S, which is [~A,~A) of ~S, got ~S back." );
    $kw245$SUCCESS = makeKeyword( "SUCCESS" );
    $kw246$ERROR = makeKeyword( "ERROR" );
    $list247 = ConsesLow.list( ConsesLow.list( makeSymbol( "*SHOULD-MEMORY-MAP-FILES?*", "SUBLISP" ), T ) );
    $list248 = ConsesLow.list( ConsesLow.list( makeSymbol( "*SHOULD-MEMORY-MAP-FILES?*", "SUBLISP" ) ) );
    $str249$ads65jh3_ = makeString( "ads65jh3/" );
    $str250$Couldn_t_test_creation_of__S__as_ = makeString( "Couldn't test creation of ~S, as it already is a known directory" );
    $str251$Failed_to_create_or_delete__S = makeString( "Failed to create or delete ~S" );
    $str252$ds6sdg32 = makeString( "ds6sdg32" );
    $str253$Couldn_t_test_creation_and_deleti = makeString( "Couldn't test creation and deletion of subdirectories in ~S, as it is not known to be a directory" );
    $list254 = ConsesLow.list( makeString( "data" ) );
    $str255$ads65jh3 = makeString( "ads65jh3" );
    $sym256$TEST_DIRECTORY_CREATION_AND_DELETION = makeSymbol( "TEST-DIRECTORY-CREATION-AND-DELETION" );
    $list257 = ConsesLow.list( ConsesLow.list( NIL, T ) );
  }
}
/*
 * 
 * Total time: 1189 ms synthetic
 */