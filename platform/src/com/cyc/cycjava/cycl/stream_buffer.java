/***
 *   Copyright (c) 1995-2009 Cycorp Inc.
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *   
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *  Substantial portions of this code were developed by the Cyc project
 *  and by Cycorp Inc, whose contribution is gratefully acknowledged.
*/

package  com.cyc.cycjava.cycl;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.ArrayList;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeChar;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeGuid;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;


import com.cyc.cycjava.cycl.access_macros;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.meta_macros;
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.utilities_macros;

public  final class stream_buffer extends SubLTranslatedFile {

  //// Constructor

  private stream_buffer() {}
  public static final SubLFile me = new stream_buffer();
  public static final String myName = "com.cyc.cycjava.cycl.stream_buffer";

  //// Definitions

  public static final class $string_buffer_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $string; }
    public SubLObject getField3() { return $position; }
    public SubLObject setField2(SubLObject value) { return $string = value; }
    public SubLObject setField3(SubLObject value) { return $position = value; }
    public SubLObject $string = NIL;
    public SubLObject $position = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($string_buffer_native.class, $sym1$STRING_BUFFER, $sym2$STRING_BUFFER_P, $list3, $list4, new String[] {"$string", "$position"}, $list5, $list6, $sym7$PRINT_STRING_BUFFER);
  }

  @SubL(source = "cycl/stream-buffer.lisp", position = 3615) 
  public static SubLSymbol $dtp_string_buffer$ = null;

  public static final class $string_buffer_p$UnaryFunction extends UnaryFunction {
    public $string_buffer_p$UnaryFunction() { super(extractFunctionNamed("STRING-BUFFER-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10485"); }
  }

  public static final class $stream_buffer_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $stream; }
    public SubLObject getField3() { return $buffer; }
    public SubLObject getField4() { return $end; }
    public SubLObject getField5() { return $position; }
    public SubLObject setField2(SubLObject value) { return $stream = value; }
    public SubLObject setField3(SubLObject value) { return $buffer = value; }
    public SubLObject setField4(SubLObject value) { return $end = value; }
    public SubLObject setField5(SubLObject value) { return $position = value; }
    public SubLObject $stream = NIL;
    public SubLObject $buffer = NIL;
    public SubLObject $end = NIL;
    public SubLObject $position = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($stream_buffer_native.class, $sym24$STREAM_BUFFER, $sym25$STREAM_BUFFER_P, $list26, $list27, new String[] {"$stream", "$buffer", "$end", "$position"}, $list28, $list29, $sym30$PRINT_STREAM_BUFFER);
  }

  @SubL(source = "cycl/stream-buffer.lisp", position = 9117) 
  public static SubLSymbol $dtp_stream_buffer$ = null;

  public static final class $stream_buffer_p$UnaryFunction extends UnaryFunction {
    public $stream_buffer_p$UnaryFunction() { super(extractFunctionNamed("STREAM-BUFFER-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10483"); }
  }

  public static final SubLObject declare_stream_buffer_file() {
    //declareFunction(myName, "stream_buffer_read_sequence", "STREAM-BUFFER-READ-SEQUENCE", 2, 2, false);
    //declareFunction(myName, "string_buffer_replace", "STRING-BUFFER-REPLACE", 2, 4, false);
    //declareFunction(myName, "read_text_into_vector", "READ-TEXT-INTO-VECTOR", 2, 2, false);
    //declareFunction(myName, "replace_string_from_vector", "REPLACE-STRING-FROM-VECTOR", 2, 4, false);
    declareFunction(myName, "string_buffer_print_function_trampoline", "STRING-BUFFER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction(myName, "string_buffer_p", "STRING-BUFFER-P", 1, 0, false); new $string_buffer_p$UnaryFunction();
    //declareFunction(myName, "strbuf_string", "STRBUF-STRING", 1, 0, false);
    //declareFunction(myName, "strbuf_position", "STRBUF-POSITION", 1, 0, false);
    //declareFunction(myName, "_csetf_strbuf_string", "_CSETF-STRBUF-STRING", 2, 0, false);
    //declareFunction(myName, "_csetf_strbuf_position", "_CSETF-STRBUF-POSITION", 2, 0, false);
    //declareFunction(myName, "make_string_buffer", "MAKE-STRING-BUFFER", 0, 1, false);
    //declareFunction(myName, "print_string_buffer", "PRINT-STRING-BUFFER", 3, 0, false);
    //declareFunction(myName, "new_string_buffer", "NEW-STRING-BUFFER", 0, 1, false);
    //declareFunction(myName, "destroy_string_buffer", "DESTROY-STRING-BUFFER", 1, 0, false);
    //declareFunction(myName, "string_buffer_string", "STRING-BUFFER-STRING", 1, 0, false);
    //declareFunction(myName, "string_buffer_position", "STRING-BUFFER-POSITION", 1, 0, false);
    //declareMacro(myName, "with_string_buffer", "WITH-STRING-BUFFER");
    //declareFunction(myName, "string_buffer_capacity", "STRING-BUFFER-CAPACITY", 1, 0, false);
    //declareFunction(myName, "string_buffer_write", "STRING-BUFFER-WRITE", 1, 1, false);
    //declareFunction(myName, "string_buffer_read", "STRING-BUFFER-READ", 1, 3, false);
    //declareFunction(myName, "string_buffer_reset", "STRING-BUFFER-RESET", 1, 0, false);
    //declareFunction(myName, "string_buffer_add", "STRING-BUFFER-ADD", 2, 0, false);
    //declareFunction(myName, "string_buffer_add_sequence", "STRING-BUFFER-ADD-SEQUENCE", 2, 2, false);
    declareFunction(myName, "stream_buffer_print_function_trampoline", "STREAM-BUFFER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction(myName, "stream_buffer_p", "STREAM-BUFFER-P", 1, 0, false); new $stream_buffer_p$UnaryFunction();
    //declareFunction(myName, "strm_buf_stream", "STRM-BUF-STREAM", 1, 0, false);
    //declareFunction(myName, "strm_buf_buffer", "STRM-BUF-BUFFER", 1, 0, false);
    //declareFunction(myName, "strm_buf_end", "STRM-BUF-END", 1, 0, false);
    //declareFunction(myName, "strm_buf_position", "STRM-BUF-POSITION", 1, 0, false);
    //declareFunction(myName, "_csetf_strm_buf_stream", "_CSETF-STRM-BUF-STREAM", 2, 0, false);
    //declareFunction(myName, "_csetf_strm_buf_buffer", "_CSETF-STRM-BUF-BUFFER", 2, 0, false);
    //declareFunction(myName, "_csetf_strm_buf_end", "_CSETF-STRM-BUF-END", 2, 0, false);
    //declareFunction(myName, "_csetf_strm_buf_position", "_CSETF-STRM-BUF-POSITION", 2, 0, false);
    //declareFunction(myName, "make_stream_buffer", "MAKE-STREAM-BUFFER", 0, 1, false);
    //declareFunction(myName, "print_stream_buffer", "PRINT-STREAM-BUFFER", 3, 0, false);
    //declareFunction(myName, "new_stream_buffer", "NEW-STREAM-BUFFER", 1, 1, false);
    //declareFunction(myName, "destroy_stream_buffer", "DESTROY-STREAM-BUFFER", 1, 0, false);
    //declareFunction(myName, "stream_buffer_stream", "STREAM-BUFFER-STREAM", 1, 0, false);
    //declareFunction(myName, "stream_buffer_block_size", "STREAM-BUFFER-BLOCK-SIZE", 1, 0, false);
    //declareFunction(myName, "stream_buffer_reset", "STREAM-BUFFER-RESET", 1, 0, false);
    //declareFunction(myName, "stream_buffer_load", "STREAM-BUFFER-LOAD", 1, 0, false);
    //declareFunction(myName, "read_line_into_string_buffer", "READ-LINE-INTO-STRING-BUFFER", 1, 3, false);
    //declareFunction(myName, "stream_buffer_read_line_into_string_buffer", "STREAM-BUFFER-READ-LINE-INTO-STRING-BUFFER", 1, 3, false);
    //declareFunction(myName, "read_line_into_string_buffer_int", "READ-LINE-INTO-STRING-BUFFER-INT", 2, 0, false);
    //declareFunction(myName, "stream_buffer_read_line_into_string_buffer_int", "STREAM-BUFFER-READ-LINE-INTO-STRING-BUFFER-INT", 2, 0, false);
    //declareMacro(myName, "do_file_lines_buffered", "DO-FILE-LINES-BUFFERED");
    //declareMacro(myName, "do_stream_lines_buffered", "DO-STREAM-LINES-BUFFERED");
    //declareFunction(myName, "do_stream_lines_buffered_initialize", "DO-STREAM-LINES-BUFFERED-INITIALIZE", 1, 1, false);
    //declareFunction(myName, "do_stream_lines_buffered_next", "DO-STREAM-LINES-BUFFERED-NEXT", 2, 0, false);
    //declareFunction(myName, "do_stream_lines_buffered_finalize", "DO-STREAM-LINES-BUFFERED-FINALIZE", 2, 0, false);
    //declareFunction(myName, "new_stream_line_iterator", "NEW-STREAM-LINE-ITERATOR", 1, 1, false);
    //declareFunction(myName, "make_stream_line_iterator_state", "MAKE-STREAM-LINE-ITERATOR-STATE", 2, 0, false);
    //declareFunction(myName, "stream_line_iterator_doneP", "STREAM-LINE-ITERATOR-DONE?", 1, 0, false);
    //declareFunction(myName, "stream_line_iterator_next", "STREAM-LINE-ITERATOR-NEXT", 1, 0, false);
    //declareFunction(myName, "stream_line_iterator_finalize", "STREAM-LINE-ITERATOR-FINALIZE", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_stream_buffer_file() {
    $dtp_string_buffer$ = defconstant("*DTP-STRING-BUFFER*", $sym1$STRING_BUFFER);
    $dtp_stream_buffer$ = defconstant("*DTP-STREAM-BUFFER*", $sym24$STREAM_BUFFER);
    return NIL;
  }

  public static final SubLObject setup_stream_buffer_file() {
    // CVS_ID("Id: stream-buffer.lisp 128436 2009-07-28 22:59:45Z goolsbey ");
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_string_buffer$.getGlobalValue(), Symbols.symbol_function($sym8$STRING_BUFFER_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym9$STRBUF_STRING, $sym10$_CSETF_STRBUF_STRING);
    Structures.def_csetf($sym11$STRBUF_POSITION, $sym12$_CSETF_STRBUF_POSITION);
    Equality.identity($sym1$STRING_BUFFER);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_stream_buffer$.getGlobalValue(), Symbols.symbol_function($sym31$STREAM_BUFFER_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym32$STRM_BUF_STREAM, $sym33$_CSETF_STRM_BUF_STREAM);
    Structures.def_csetf($sym34$STRM_BUF_BUFFER, $sym35$_CSETF_STRM_BUF_BUFFER);
    Structures.def_csetf($sym36$STRM_BUF_END, $sym37$_CSETF_STRM_BUF_END);
    Structures.def_csetf($sym38$STRM_BUF_POSITION, $sym39$_CSETF_STRM_BUF_POSITION);
    Equality.identity($sym24$STREAM_BUFFER);
    access_macros.register_macro_helper($sym62$DO_STREAM_LINES_BUFFERED_INITIALIZE, $sym57$DO_STREAM_LINES_BUFFERED);
    access_macros.register_macro_helper($sym67$DO_STREAM_LINES_BUFFERED_NEXT, $sym57$DO_STREAM_LINES_BUFFERED);
    access_macros.register_macro_helper($sym71$DO_STREAM_LINES_BUFFERED_FINALIZE, $sym57$DO_STREAM_LINES_BUFFERED);
    utilities_macros.note_funcall_helper_function($sym72$STREAM_LINE_ITERATOR_DONE_);
    utilities_macros.note_funcall_helper_function($sym73$STREAM_LINE_ITERATOR_NEXT);
    utilities_macros.note_funcall_helper_function($sym74$STREAM_LINE_ITERATOR_FINALIZE);
    return NIL;
  }

  //// Internal Constants

  public static final SubLString $str0$Improper_index_bounds__S__S = makeString("Improper index bounds ~S ~S");
  public static final SubLSymbol $sym1$STRING_BUFFER = makeSymbol("STRING-BUFFER");
  public static final SubLSymbol $sym2$STRING_BUFFER_P = makeSymbol("STRING-BUFFER-P");
  public static final SubLList $list3 = list(makeSymbol("STRING"), makeSymbol("POSITION"));
  public static final SubLList $list4 = list(makeKeyword("STRING"), makeKeyword("POSITION"));
  public static final SubLList $list5 = list(makeSymbol("STRBUF-STRING"), makeSymbol("STRBUF-POSITION"));
  public static final SubLList $list6 = list(makeSymbol("_CSETF-STRBUF-STRING"), makeSymbol("_CSETF-STRBUF-POSITION"));
  public static final SubLSymbol $sym7$PRINT_STRING_BUFFER = makeSymbol("PRINT-STRING-BUFFER");
  public static final SubLSymbol $sym8$STRING_BUFFER_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("STRING-BUFFER-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym9$STRBUF_STRING = makeSymbol("STRBUF-STRING");
  public static final SubLSymbol $sym10$_CSETF_STRBUF_STRING = makeSymbol("_CSETF-STRBUF-STRING");
  public static final SubLSymbol $sym11$STRBUF_POSITION = makeSymbol("STRBUF-POSITION");
  public static final SubLSymbol $sym12$_CSETF_STRBUF_POSITION = makeSymbol("_CSETF-STRBUF-POSITION");
  public static final SubLSymbol $kw13$STRING = makeKeyword("STRING");
  public static final SubLSymbol $kw14$POSITION = makeKeyword("POSITION");
  public static final SubLString $str15$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str16$__STRING_BUFFER_capacity__S_posit = makeString("#<STRING-BUFFER capacity=~S position=~S>");
  public static final SubLInteger $int17$64 = makeInteger(64);
  public static final SubLSymbol $sym18$NON_NEGATIVE_INTEGER_P = makeSymbol("NON-NEGATIVE-INTEGER-P");
  public static final SubLSymbol $kw19$DESTROYED = makeKeyword("DESTROYED");
  public static final SubLList $list20 = list(list(makeSymbol("BUFFER-STRING-VAR"), makeSymbol("BUFFER-END-VAR")), makeSymbol("STRING-BUFFER"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym21$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym22$STRING_BUFFER_STRING = makeSymbol("STRING-BUFFER-STRING");
  public static final SubLSymbol $sym23$STRING_BUFFER_POSITION = makeSymbol("STRING-BUFFER-POSITION");
  public static final SubLSymbol $sym24$STREAM_BUFFER = makeSymbol("STREAM-BUFFER");
  public static final SubLSymbol $sym25$STREAM_BUFFER_P = makeSymbol("STREAM-BUFFER-P");
  public static final SubLList $list26 = list(makeSymbol("STREAM"), makeSymbol("BUFFER"), makeSymbol("END"), makeSymbol("POSITION"));
  public static final SubLList $list27 = list(makeKeyword("STREAM"), makeKeyword("BUFFER"), makeKeyword("END"), makeKeyword("POSITION"));
  public static final SubLList $list28 = list(makeSymbol("STRM-BUF-STREAM"), makeSymbol("STRM-BUF-BUFFER"), makeSymbol("STRM-BUF-END"), makeSymbol("STRM-BUF-POSITION"));
  public static final SubLList $list29 = list(makeSymbol("_CSETF-STRM-BUF-STREAM"), makeSymbol("_CSETF-STRM-BUF-BUFFER"), makeSymbol("_CSETF-STRM-BUF-END"), makeSymbol("_CSETF-STRM-BUF-POSITION"));
  public static final SubLSymbol $sym30$PRINT_STREAM_BUFFER = makeSymbol("PRINT-STREAM-BUFFER");
  public static final SubLSymbol $sym31$STREAM_BUFFER_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("STREAM-BUFFER-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym32$STRM_BUF_STREAM = makeSymbol("STRM-BUF-STREAM");
  public static final SubLSymbol $sym33$_CSETF_STRM_BUF_STREAM = makeSymbol("_CSETF-STRM-BUF-STREAM");
  public static final SubLSymbol $sym34$STRM_BUF_BUFFER = makeSymbol("STRM-BUF-BUFFER");
  public static final SubLSymbol $sym35$_CSETF_STRM_BUF_BUFFER = makeSymbol("_CSETF-STRM-BUF-BUFFER");
  public static final SubLSymbol $sym36$STRM_BUF_END = makeSymbol("STRM-BUF-END");
  public static final SubLSymbol $sym37$_CSETF_STRM_BUF_END = makeSymbol("_CSETF-STRM-BUF-END");
  public static final SubLSymbol $sym38$STRM_BUF_POSITION = makeSymbol("STRM-BUF-POSITION");
  public static final SubLSymbol $sym39$_CSETF_STRM_BUF_POSITION = makeSymbol("_CSETF-STRM-BUF-POSITION");
  public static final SubLSymbol $kw40$STREAM = makeKeyword("STREAM");
  public static final SubLSymbol $kw41$BUFFER = makeKeyword("BUFFER");
  public static final SubLSymbol $kw42$END = makeKeyword("END");
  public static final SubLString $str43$__STREAM_BUFFER_block_size__S_for = makeString("#<STREAM-BUFFER block size=~S for ~S>");
  public static final SubLInteger $int44$1024 = makeInteger(1024);
  public static final SubLSymbol $sym45$STREAMP = makeSymbol("STREAMP");
  public static final SubLSymbol $sym46$POSITIVE_INTEGER_P = makeSymbol("POSITIVE-INTEGER-P");
  public static final SubLString $str47$EOF_reached_on__S = makeString("EOF reached on ~S");
  public static final SubLList $list48 = list(list(makeSymbol("LINE-BUFFER-VAR"), makeSymbol("FILENAME"), makeSymbol("&KEY"), makeSymbol("BLOCK-SIZE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list49 = list(makeKeyword("BLOCK-SIZE"), makeKeyword("DONE"));
  public static final SubLSymbol $kw50$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw51$BLOCK_SIZE = makeKeyword("BLOCK-SIZE");
  public static final SubLSymbol $kw52$DONE = makeKeyword("DONE");
  public static final SubLSymbol $sym53$STREAM_VAR = makeUninternedSymbol("STREAM-VAR");
  public static final SubLSymbol $sym54$WITH_PRIVATE_TEXT_FILE = makeSymbol("WITH-PRIVATE-TEXT-FILE");
  public static final SubLList $list55 = list(makeKeyword("INPUT"));
  public static final SubLSymbol $sym56$PWHEN = makeSymbol("PWHEN");
  public static final SubLSymbol $sym57$DO_STREAM_LINES_BUFFERED = makeSymbol("DO-STREAM-LINES-BUFFERED");
  public static final SubLList $list58 = list(list(makeSymbol("LINE-BUFFER-VAR"), makeSymbol("STREAM"), makeSymbol("&KEY"), makeSymbol("BLOCK-SIZE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym59$DONE_VAR = makeUninternedSymbol("DONE-VAR");
  public static final SubLSymbol $sym60$STREAM_BUFFER_VAR = makeUninternedSymbol("STREAM-BUFFER-VAR");
  public static final SubLSymbol $sym61$CMULTIPLE_VALUE_BIND = makeSymbol("CMULTIPLE-VALUE-BIND");
  public static final SubLSymbol $sym62$DO_STREAM_LINES_BUFFERED_INITIALIZE = makeSymbol("DO-STREAM-LINES-BUFFERED-INITIALIZE");
  public static final SubLSymbol $sym63$CUNWIND_PROTECT = makeSymbol("CUNWIND-PROTECT");
  public static final SubLSymbol $sym64$WHILE = makeSymbol("WHILE");
  public static final SubLSymbol $sym65$CNOT = makeSymbol("CNOT");
  public static final SubLSymbol $sym66$PIF = makeSymbol("PIF");
  public static final SubLSymbol $sym67$DO_STREAM_LINES_BUFFERED_NEXT = makeSymbol("DO-STREAM-LINES-BUFFERED-NEXT");
  public static final SubLSymbol $sym68$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $sym69$CSETQ = makeSymbol("CSETQ");
  public static final SubLList $list70 = list(T);
  public static final SubLSymbol $sym71$DO_STREAM_LINES_BUFFERED_FINALIZE = makeSymbol("DO-STREAM-LINES-BUFFERED-FINALIZE");
  public static final SubLSymbol $sym72$STREAM_LINE_ITERATOR_DONE_ = makeSymbol("STREAM-LINE-ITERATOR-DONE?");
  public static final SubLSymbol $sym73$STREAM_LINE_ITERATOR_NEXT = makeSymbol("STREAM-LINE-ITERATOR-NEXT");
  public static final SubLSymbol $sym74$STREAM_LINE_ITERATOR_FINALIZE = makeSymbol("STREAM-LINE-ITERATOR-FINALIZE");
  public static final SubLList $list75 = list(makeSymbol("STREAM-BUFFER"), makeSymbol("LINE-BUFFER"));

  //// Initializers

  public void declareFunctions() {
    declare_stream_buffer_file();
  }

  public void initializeVariables() {
    init_stream_buffer_file();
  }

  public void runTopLevelForms() {
    setup_stream_buffer_file();
  }

}
