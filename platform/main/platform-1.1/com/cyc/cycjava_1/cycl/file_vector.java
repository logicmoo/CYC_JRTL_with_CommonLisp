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

package com.cyc.cycjava_1.cycl;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.cyc_testing.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.cfasl;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.file_hash_table;
//dm import com.cyc.cycjava_1.cycl.file_utilities;
//dm import com.cyc.cycjava_1.cycl.format_nil;
// //dm import com.cyc.cycjava_1.cycl.cyc_testing.generic_testing;
//dm import com.cyc.cycjava_1.cycl.iteration;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;

public  final class file_vector extends SubLTranslatedFile {

  //// Constructor

  private file_vector() {}
  public static final SubLFile me = new file_vector();
  public static final String myName = "com.cyc.cycjava_1.cycl.file_vector";

  //// Definitions

  public static final class $fvector_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $data_stream; }
    public SubLObject getField3() { return $index_stream; }
    public SubLObject setField2(SubLObject value) { return $data_stream = value; }
    public SubLObject setField3(SubLObject value) { return $index_stream = value; }
    public SubLObject $data_stream = NIL;
    public SubLObject $index_stream = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($fvector_native.class, $sym0$FVECTOR, $sym1$FVECTOR_P, $list2, $list3, new String[] {"$data_stream", "$index_stream"}, $list4, $list5, $sym6$PRINT_FVECTOR);
  }

  @SubL(source = "cycl/file-vector.lisp", position = 2434) 
  public static SubLSymbol $dtp_fvector$ = null;

  @SubL(source = "cycl/file-vector.lisp", position = 2434) 
  public static final SubLObject fvector_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29650");
    return NIL;
  }

  @SubL(source = "cycl/file-vector.lisp", position = 2434) 
  public static final SubLObject fvector_p(SubLObject object) {
    return ((object.getClass() == $fvector_native.class) ? ((SubLObject) T) : NIL);
  }

  public static final class $fvector_p$UnaryFunction extends UnaryFunction {
    public $fvector_p$UnaryFunction() { super(extractFunctionNamed("FVECTOR-P")); }
    public SubLObject processItem(SubLObject arg1) { return fvector_p(arg1); }
  }


  /** Return the STREAMP that is used for the data. */
  @SubL(source = "cycl/file-vector.lisp", position = 4828) 
  public static final SubLObject get_file_vector_data_stream(SubLObject fvector) {
    checkType(fvector, $sym24$FILE_VECTOR_P);
    return fvector_data_stream(fvector);
  }

  
  @SubL(source = "cycl/file-vector.lisp", position = 2434) 
  public static final SubLObject fvector_data_stream(SubLObject object) {
    checkType(object, $sym1$FVECTOR_P);
    return object.getField2();
  }

  @SubL(source = "cycl/file-vector.lisp", position = 2434) 
  public static final SubLObject fvector_index_stream(SubLObject object) {
    checkType(object, $sym1$FVECTOR_P);
    return object.getField3();
  }

  @SubL(source = "cycl/file-vector.lisp", position = 2434) 
  public static final SubLObject _csetf_fvector_data_stream(SubLObject object, SubLObject value) {
    checkType(object, $sym1$FVECTOR_P);
    return object.setField2(value);
  }

  @SubL(source = "cycl/file-vector.lisp", position = 2434) 
  public static final SubLObject _csetf_fvector_index_stream(SubLObject object, SubLObject value) {
    checkType(object, $sym1$FVECTOR_P);
    return object.setField3(value);
  }

  @SubL(source = "cycl/file-vector.lisp", position = 2434) 
  public static final SubLObject make_fvector(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $fvector_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw12$DATA_STREAM)) {
            _csetf_fvector_data_stream(v_new, current_value);
          } else if (pcase_var.eql($kw13$INDEX_STREAM)) {
            _csetf_fvector_index_stream(v_new, current_value);
          } else {
            Errors.error($str14$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  @SubL(source = "cycl/file-vector.lisp", position = 2914) 
  public static final SubLObject new_fvector(SubLObject data_stream, SubLObject index_stream) {
    {
      SubLObject fvector = make_fvector(UNPROVIDED);
      _csetf_fvector_data_stream(fvector, data_stream);
      _csetf_fvector_index_stream(fvector, index_stream);
      return fvector;
    }
  }

  /** Return T iff object is a FILE-VECTOR datastructure. */
  @SubL(source = "cycl/file-vector.lisp", position = 3138) 
  public static final SubLObject file_vector_p(SubLObject object) {
    return fvector_p(object);
  }

  /** Creates a new FILE-VECTOR-P if it can open the two files for DIRECTION */
  @SubL(source = "cycl/file-vector.lisp", position = 3262) 
  public static final SubLObject new_file_vector(SubLObject data_filename, SubLObject index_filename, SubLObject direction) {
    if ((direction == UNPROVIDED)) {
      direction = $kw20$INPUT;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject data_stream = NIL;
        SubLObject index_stream = NIL;
        data_stream = compatibility.open_binary(data_filename, direction);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
          if ((NIL == streams_high.open_stream_p(data_stream))) {
            Errors.error(Errors.error($str21$Invalid_data_filename__A_, data_filename));
          }
        }
        index_stream = compatibility.open_binary(index_filename, direction);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
          if ((NIL == streams_high.open_stream_p(index_stream))) {
            Errors.error(Errors.error($str22$Invalid_index_filename__A_, index_filename));
          }
        }
        return create_file_vector(data_stream, index_stream);
      }
    }
  }

  @SubL(source = "cycl/file-vector.lisp", position = 3843) 
  public static final SubLObject create_file_vector(SubLObject data_stream, SubLObject index_stream) {
    return new_fvector(data_stream, index_stream);
  }

  /** Close the streams associated with the file vector under question. */
  @SubL(source = "cycl/file-vector.lisp", position = 4317) 
  public static final SubLObject close_file_vector(SubLObject fvector) {
    checkType(fvector, $sym24$FILE_VECTOR_P);
    {
      SubLObject data_stream = fvector_data_stream(fvector);
      if ((NIL != streams_high.open_stream_p(data_stream))) {
        streams_high.close(data_stream, UNPROVIDED);
      }
      _csetf_fvector_data_stream(fvector, NIL);
    }
    {
      SubLObject index_stream = fvector_index_stream(fvector);
      if ((NIL != streams_high.open_stream_p(index_stream))) {
        streams_high.close(index_stream, UNPROVIDED);
      }
      _csetf_fvector_index_stream(fvector, NIL);
    }
    return fvector;
  }

  /** Return the FIXNUMP number of entries in the file vector */
  @SubL(source = "cycl/file-vector.lisp", position = 5196) 
  public static final SubLObject file_vector_length(SubLObject fvector) {
    checkType(fvector, $sym24$FILE_VECTOR_P);
    return fvector_raw_byte_size_to_length(streams_high.file_length(fvector_index_stream(fvector)));
  }

  /** A helper function that allows getting the index without allocating the file-vector object. */
  @SubL(source = "cycl/file-vector.lisp", position = 5427) 
  public static final SubLObject file_vector_length_from_index(SubLObject index_filename) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == Filesys.probe_file(index_filename))) {
        Errors.error($str22$Invalid_index_filename__A_, index_filename);
      }
      {
        SubLObject length = NIL;
        SubLObject stream = NIL;
        try {
          {
            SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
              stream_macros.$stream_requires_locking$.bind(NIL, thread);
              stream = compatibility.open_binary(index_filename, $kw20$INPUT);
            } finally {
              stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
          }
          if ((!(stream.isStream()))) {
            Errors.error($str25$Unable_to_open__S, index_filename);
          }
          {
            SubLObject index_stream = stream;
            SubLObject bytes = streams_high.file_length(index_stream);
            length = fvector_raw_byte_size_to_length(bytes);
          }
        } finally {
          {
            SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
              Threads.$is_thread_performing_cleanupP$.bind(T, thread);
              if (stream.isStream()) {
                streams_high.close(stream, UNPROVIDED);
              }
            } finally {
              Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
          }
        }
        return length;
      }
    }
  }

  @SubL(source = "cycl/file-vector.lisp", position = 6204) 
  public static final SubLObject fvector_raw_byte_size_to_length(SubLObject bytes) {
    return Numbers.integerDivide(bytes, FOUR_INTEGER);
  }

  /** Position the data stream of the file vector. If an INDEX is supplied,
   the data stream is positioned to the data offset stored in the index file
   for that nth entry. If no index is supplied, it is positioned to the next
   value in the index-stream (e.g. in the case of a loop).
   @return OPEN-STREAM-P the data stream */
  @SubL(source = "cycl/file-vector.lisp", position = 6286) 
  public static final SubLObject position_file_vector(SubLObject fvector, SubLObject index) {
    if ((index == UNPROVIDED)) {
      index = NIL;
    }
    checkType(fvector, $sym24$FILE_VECTOR_P);
    {
      SubLObject data_stream = fvector_data_stream(fvector);
      SubLObject data_address = read_file_vector_index_entry(fvector, index);
      compatibility.set_file_position(data_stream, data_address);
      return data_stream;
    }
  }

  /** fetch a specific entry from the file vector index. Move first to the
   specified INDEX if provided.
   @return NON-NEGATIVE-INTEGER-P the file position in the data stream */
  @SubL(source = "cycl/file-vector.lisp", position = 6915) 
  public static final SubLObject read_file_vector_index_entry(SubLObject fvector, SubLObject index) {
    if ((index == UNPROVIDED)) {
      index = NIL;
    }
    if ((NIL != index)) {
      checkType(index, $sym26$NON_NEGATIVE_INTEGER_P);
    }
    {
      SubLObject index_stream = fvector_index_stream(fvector);
      SubLObject data_address = NIL;
      SubLObject index_address = NIL;
      if ((NIL != index)) {
        index_address = Numbers.multiply(index, FOUR_INTEGER);
        compatibility.set_file_position(index_stream, index_address);
      }
      data_address = file_hash_table.read_fht_uint4(index_stream);
      return data_address;
    }
  }

  public static final SubLObject declare_file_vector_file() {
    declareFunction(myName, "fvector_print_function_trampoline", "FVECTOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "fvector_p", "FVECTOR-P", 1, 0, false); new $fvector_p$UnaryFunction();
    declareFunction(myName, "fvector_data_stream", "FVECTOR-DATA-STREAM", 1, 0, false);
    declareFunction(myName, "fvector_index_stream", "FVECTOR-INDEX-STREAM", 1, 0, false);
    declareFunction(myName, "_csetf_fvector_data_stream", "_CSETF-FVECTOR-DATA-STREAM", 2, 0, false);
    declareFunction(myName, "_csetf_fvector_index_stream", "_CSETF-FVECTOR-INDEX-STREAM", 2, 0, false);
    declareFunction(myName, "make_fvector", "MAKE-FVECTOR", 0, 1, false);
    declareFunction(myName, "print_fvector", "PRINT-FVECTOR", 3, 0, false);
    declareFunction(myName, "new_fvector", "NEW-FVECTOR", 2, 0, false);
    declareFunction(myName, "file_vector_p", "FILE-VECTOR-P", 1, 0, false);
    declareFunction(myName, "new_file_vector", "NEW-FILE-VECTOR", 2, 1, false);
    declareFunction(myName, "create_file_vector", "CREATE-FILE-VECTOR", 2, 0, false);
    declareFunction(myName, "clone_file_vector", "CLONE-FILE-VECTOR", 1, 0, false);
    declareFunction(myName, "close_file_vector", "CLOSE-FILE-VECTOR", 1, 0, false);
    declareFunction(myName, "get_file_vector_data_stream", "GET-FILE-VECTOR-DATA-STREAM", 1, 0, false);
    declareFunction(myName, "get_file_vector_index_stream", "GET-FILE-VECTOR-INDEX-STREAM", 1, 0, false);
    declareFunction(myName, "file_vector_length", "FILE-VECTOR-LENGTH", 1, 0, false);
    declareFunction(myName, "file_vector_length_from_index", "FILE-VECTOR-LENGTH-FROM-INDEX", 1, 0, false);
    declareFunction(myName, "file_vector_next_index", "FILE-VECTOR-NEXT-INDEX", 1, 0, false);
    declareFunction(myName, "fvector_raw_byte_size_to_length", "FVECTOR-RAW-BYTE-SIZE-TO-LENGTH", 1, 0, false);
    declareFunction(myName, "position_file_vector", "POSITION-FILE-VECTOR", 1, 1, false);
    declareFunction(myName, "read_file_vector_index_entry", "READ-FILE-VECTOR-INDEX-ENTRY", 1, 1, false);
    declareMacro(myName, "with_output_to_file_vector", "WITH-OUTPUT-TO-FILE-VECTOR");
    declareFunction(myName, "update_file_vector_index", "UPDATE-FILE-VECTOR-INDEX", 1, 0, false);
    declareFunction(myName, "update_file_vector_index_linear", "UPDATE-FILE-VECTOR-INDEX-LINEAR", 1, 0, false);
    declareMacro(myName, "with_input_from_file_vector", "WITH-INPUT-FROM-FILE-VECTOR");
    declareFunction(myName, "new_file_vector_index_iterator", "NEW-FILE-VECTOR-INDEX-ITERATOR", 1, 0, false);
    declareFunction(myName, "make_file_vector_index_iterator_state", "MAKE-FILE-VECTOR-INDEX-ITERATOR-STATE", 1, 0, false);
    declareFunction(myName, "fvector_index_iterator_done", "FVECTOR-INDEX-ITERATOR-DONE", 1, 0, false);
    declareFunction(myName, "fvector_index_iterator_next", "FVECTOR-INDEX-ITERATOR-NEXT", 1, 0, false);
    declareFunction(myName, "test_file_vector_writing_and_positioning", "TEST-FILE-VECTOR-WRITING-AND-POSITIONING", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_file_vector_file() {
    $dtp_fvector$ = defconstant("*DTP-FVECTOR*", $sym0$FVECTOR);
    return NIL;
  }

  public static final SubLObject setup_file_vector_file() {
    // CVS_ID("Id: file-vector.lisp 128666 2009-09-01 15:44:24Z rck ");
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_fvector$.getGlobalValue(), Symbols.symbol_function($sym7$FVECTOR_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym8$FVECTOR_DATA_STREAM, $sym9$_CSETF_FVECTOR_DATA_STREAM);
    Structures.def_csetf($sym10$FVECTOR_INDEX_STREAM, $sym11$_CSETF_FVECTOR_INDEX_STREAM);
    Equality.identity($sym0$FVECTOR);
    generic_testing.define_test_case_table_int($sym40$TEST_FILE_VECTOR_WRITING_AND_POSITIONING, list(new SubLObject[] {$kw41$TEST, EQL, $kw42$OWNER, NIL, $kw43$CLASSES, NIL, $kw44$KB, $kw45$TINY, $kw46$WORKING_, T}), $list47);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$FVECTOR = makeSymbol("FVECTOR");
  public static final SubLSymbol $sym1$FVECTOR_P = makeSymbol("FVECTOR-P");
  public static final SubLList $list2 = list(makeSymbol("DATA-STREAM"), makeSymbol("INDEX-STREAM"));
  public static final SubLList $list3 = list(makeKeyword("DATA-STREAM"), makeKeyword("INDEX-STREAM"));
  public static final SubLList $list4 = list(makeSymbol("FVECTOR-DATA-STREAM"), makeSymbol("FVECTOR-INDEX-STREAM"));
  public static final SubLList $list5 = list(makeSymbol("_CSETF-FVECTOR-DATA-STREAM"), makeSymbol("_CSETF-FVECTOR-INDEX-STREAM"));
  public static final SubLSymbol $sym6$PRINT_FVECTOR = makeSymbol("PRINT-FVECTOR");
  public static final SubLSymbol $sym7$FVECTOR_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("FVECTOR-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym8$FVECTOR_DATA_STREAM = makeSymbol("FVECTOR-DATA-STREAM");
  public static final SubLSymbol $sym9$_CSETF_FVECTOR_DATA_STREAM = makeSymbol("_CSETF-FVECTOR-DATA-STREAM");
  public static final SubLSymbol $sym10$FVECTOR_INDEX_STREAM = makeSymbol("FVECTOR-INDEX-STREAM");
  public static final SubLSymbol $sym11$_CSETF_FVECTOR_INDEX_STREAM = makeSymbol("_CSETF-FVECTOR-INDEX-STREAM");
  public static final SubLSymbol $kw12$DATA_STREAM = makeKeyword("DATA-STREAM");
  public static final SubLSymbol $kw13$INDEX_STREAM = makeKeyword("INDEX-STREAM");
  public static final SubLString $str14$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str15$__ = makeString("#<");
  public static final SubLSymbol $kw16$STREAM = makeKeyword("STREAM");
  public static final SubLString $str17$Data__ = makeString("Data: ");
  public static final SubLString $str18$Index__ = makeString("Index: ");
  public static final SubLSymbol $kw19$BASE = makeKeyword("BASE");
  public static final SubLSymbol $kw20$INPUT = makeKeyword("INPUT");
  public static final SubLString $str21$Invalid_data_filename__A_ = makeString("Invalid data filename ~A.");
  public static final SubLString $str22$Invalid_index_filename__A_ = makeString("Invalid index filename ~A.");
  public static final SubLString $str23$Cannot_clone__A__This_method_is_c = makeString("Cannot clone ~A: This method is currently not implemented.");
  public static final SubLSymbol $sym24$FILE_VECTOR_P = makeSymbol("FILE-VECTOR-P");
  public static final SubLString $str25$Unable_to_open__S = makeString("Unable to open ~S");
  public static final SubLSymbol $sym26$NON_NEGATIVE_INTEGER_P = makeSymbol("NON-NEGATIVE-INTEGER-P");
  public static final SubLList $list27 = list(list(makeSymbol("FVECTOR"), makeSymbol("DATA-FILE"), makeSymbol("INDEX-FILE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym28$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym29$CUNWIND_PROTECT = makeSymbol("CUNWIND-PROTECT");
  public static final SubLSymbol $sym30$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $sym31$CSETQ = makeSymbol("CSETQ");
  public static final SubLSymbol $sym32$NEW_FILE_VECTOR = makeSymbol("NEW-FILE-VECTOR");
  public static final SubLList $list33 = list(makeKeyword("OUTPUT"));
  public static final SubLSymbol $sym34$PWHEN = makeSymbol("PWHEN");
  public static final SubLSymbol $sym35$CLOSE_FILE_VECTOR = makeSymbol("CLOSE-FILE-VECTOR");
  public static final SubLList $list36 = list(makeKeyword("INPUT"));
  public static final SubLSymbol $sym37$FVECTOR_INDEX_ITERATOR_DONE = makeSymbol("FVECTOR-INDEX-ITERATOR-DONE");
  public static final SubLSymbol $sym38$FVECTOR_INDEX_ITERATOR_NEXT = makeSymbol("FVECTOR-INDEX-ITERATOR-NEXT");
  public static final SubLList $list39 = list(makeSymbol("FVECTOR"), makeSymbol("CURRENT"), makeSymbol("SIZE"), makeSymbol("TUPLE"));
  public static final SubLSymbol $sym40$TEST_FILE_VECTOR_WRITING_AND_POSITIONING = makeSymbol("TEST-FILE-VECTOR-WRITING-AND-POSITIONING");
  public static final SubLSymbol $kw41$TEST = makeKeyword("TEST");
  public static final SubLSymbol $kw42$OWNER = makeKeyword("OWNER");
  public static final SubLSymbol $kw43$CLASSES = makeKeyword("CLASSES");
  public static final SubLSymbol $kw44$KB = makeKeyword("KB");
  public static final SubLSymbol $kw45$TINY = makeKeyword("TINY");
  public static final SubLSymbol $kw46$WORKING_ = makeKeyword("WORKING?");
  public static final SubLList $list47 = list(list(list(TEN_INTEGER), TEN_INTEGER), list(list(makeInteger(23)), makeInteger(23)));
  public static final SubLString $str48$_tmp_ = makeString("/tmp/");
  public static final SubLSymbol $kw49$OUTPUT = makeKeyword("OUTPUT");
  public static final SubLString $str50$The_next_index_is_supposed_to_be_ = makeString("The next index is supposed to be ~A, but it is ~A.");
  public static final SubLString $str51$Position_ = makeString("Position ");
  public static final SubLString $str52$On_step___A__the_iteration_result = makeString("On step #~A, the iteration result was no longer valid.");
  public static final SubLList $list53 = cons(makeSymbol("ACTUAL-INDEX"), makeSymbol("ACTUAL-ADDRESS"));
  public static final SubLString $str54$The_expected_index__A_was_____act = makeString("The expected index ~A was =/= actual index ~A.");
  public static final SubLString $str55$The_expected_address__A_was_____a = makeString("The expected address ~A was =/= actual address ~A.");
  public static final SubLSymbol $kw56$IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");
  public static final SubLSymbol $sym57$IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

  //// Initializers

  public void declareFunctions() {
    declare_file_vector_file();
  }

  public void initializeVariables() {
    init_file_vector_file();
  }

  public void runTopLevelForms() {
    setup_file_vector_file();
  }

}
