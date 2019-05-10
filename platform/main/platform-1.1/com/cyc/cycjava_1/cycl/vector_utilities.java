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

import com.cyc.cycjava.cycl.*;
import com.cyc.cycjava.cycl.cyc_testing.*;
import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.*;
import com.cyc.cycjava.cycl.inference.*;
 import com.cyc.cycjava.cycl.inference.harness.*;
 import com.cyc.cycjava.cycl.inference.modules.*;
import com.cyc.cycjava.cycl.inference.modules.removal.*;
import com.cyc.cycjava.cycl.sbhl.*;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.*;

import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.*;

 import com.cyc.cycjava.cycl.*;
 import com.cyc.cycjava.cycl.cyc_testing.*;
import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.*;
import com.cyc.cycjava.cycl.inference.*;
 import com.cyc.cycjava.cycl.inference.harness.*;
 import com.cyc.cycjava.cycl.inference.modules.*;
import com.cyc.cycjava.cycl.inference.modules.removal.*;
import com.cyc.cycjava.cycl.sbhl.*;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.*;

import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.*;
import com.cyc.cycjava.cycl.inference.*;
 import com.cyc.cycjava.cycl.inference.harness.*;
 import com.cyc.cycjava.cycl.inference.modules.*;
import com.cyc.cycjava.cycl.inference.modules.removal.*;
import com.cyc.cycjava.cycl.sbhl.*;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.*;



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


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
// //dm import com.cyc.cycjava_1.cycl.cyc_testing.generic_testing;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.number_utilities;
//dm import com.cyc.cycjava_1.cycl.string_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macros;

public  final class vector_utilities extends SubLTranslatedFile {

  //// Constructor

  private vector_utilities() {}
  public static final SubLFile me = new vector_utilities();
  public static final String myName = "com.cyc.cycjava_1.cycl.vector_utilities";

  //// Definitions

  /** Convert VECTOR to a list of its elements. */
  @SubL(source = "cycl/vector-utilities.lisp", position = 775) 
  public static final SubLObject vector_elements(SubLObject vector, SubLObject start_index) {
    if ((start_index == UNPROVIDED)) {
      start_index = ZERO_INTEGER;
    }
    checkType(vector, $sym0$VECTORP);
    checkType(start_index, $sym1$INTEGERP);
    {
      SubLObject length = Numbers.subtract(Sequences.length(vector), start_index);
      SubLObject list = ConsesLow.make_list(length, UNPROVIDED);
      SubLObject index = start_index;
      SubLObject rest = NIL;
      for (rest = list; (NIL != rest); rest = rest.rest()) {
        ConsesLow.rplaca(rest, Vectors.aref(vector, index));
        index = Numbers.add(index, ONE_INTEGER);
      }
      return list;
    }
  }

  /** Extend VECTOR to be NEW-LENGTH elements long, filling the new entries at the end with INITIAL-VALUE */
  @SubL(source = "cycl/vector-utilities.lisp", position = 1979) 
  public static final SubLObject extend_vector_to(SubLObject vector, SubLObject new_length, SubLObject initial_value) {
    if ((initial_value == UNPROVIDED)) {
      initial_value = NIL;
    }
    {
      SubLObject old_length = Sequences.length(vector);
      SubLObject new_vector = Vectors.make_vector(new_length, initial_value);
      Sequences.replace(new_vector, vector, ZERO_INTEGER, old_length, ZERO_INTEGER, old_length);
      return new_vector;
    }
  }

  public static final SubLObject declare_vector_utilities_file() {
    declareFunction(myName, "vector_elements", "VECTOR-ELEMENTS", 1, 1, false);
    //declareFunction(myName, "copy_vector", "COPY-VECTOR", 1, 0, false);
    //declareFunction(myName, "first_aref", "FIRST-AREF", 1, 0, false);
    //declareFunction(myName, "last_aref", "LAST-AREF", 1, 0, false);
    //declareFunction(myName, "num_vector", "NUM-VECTOR", 1, 0, false);
    //declareFunction(myName, "extend_vector", "EXTEND-VECTOR", 2, 1, false);
    declareFunction(myName, "extend_vector_to", "EXTEND-VECTOR-TO", 2, 1, false);
    //declareFunction(myName, "grow_vector", "GROW-VECTOR", 1, 2, false);
    //declareFunction(myName, "reset_vector", "RESET-VECTOR", 1, 1, false);
    //declareFunction(myName, "clear_vector", "CLEAR-VECTOR", 1, 1, false);
    //declareFunction(myName, "percolate_vector", "PERCOLATE-VECTOR", 2, 0, false);
    //declareFunction(myName, "vector_nreplace_subsequence", "VECTOR-NREPLACE-SUBSEQUENCE", 3, 2, false);
    //declareFunction(myName, "vector_nreplace_subsequence_int", "VECTOR-NREPLACE-SUBSEQUENCE-INT", 4, 0, false);
    //declareFunction(myName, "print_vector_readably", "PRINT-VECTOR-READABLY", 1, 1, false);
    //declareFunction(myName, "print_vector_as_delimited_line", "PRINT-VECTOR-AS-DELIMITED-LINE", 1, 2, false);
    //declareFunction(myName, "max_element", "MAX-ELEMENT", 1, 0, false);
    //declareFunction(myName, "min_element", "MIN-ELEMENT", 1, 0, false);
    //declareFunction(myName, "extremal_element", "EXTREMAL-ELEMENT", 2, 0, false);
    //declareFunction(myName, "make_ndim_array", "MAKE-NDIM-ARRAY", 2, 0, false);
    //declareFunction(myName, "aref_ndim", "AREF-NDIM", 3, 0, false);
    //declareFunction(myName, "set_aref_ndim", "SET-AREF-NDIM", 4, 0, false);
    //declareFunction(myName, "f_2d_array_elements", "2D-ARRAY-ELEMENTS", 1, 0, false);
    //declareFunction(myName, "f_3d_array_elements", "3D-ARRAY-ELEMENTS", 1, 0, false);
    //declareFunction(myName, "byte_vector_p", "BYTE-VECTOR-P", 1, 0, false);
    //declareFunction(myName, "new_byte_vector_from_file", "NEW-BYTE-VECTOR-FROM-FILE", 1, 0, false);
    //declareFunction(myName, "byte_vector_to_hex_char_string", "BYTE-VECTOR-TO-HEX-CHAR-STRING", 1, 0, false);
    //declareFunction(myName, "byte_vector_to_formatted_hex_char_string", "BYTE-VECTOR-TO-FORMATTED-HEX-CHAR-STRING", 1, 0, false);
    //declareFunction(myName, "byte_vector_to_string", "BYTE-VECTOR-TO-STRING", 1, 0, false);
    //declareFunction(myName, "hex_char_string_to_byte_vector", "HEX-CHAR-STRING-TO-BYTE-VECTOR", 1, 0, false);
    //declareFunction(myName, "byte_to_hex_chars", "BYTE-TO-HEX-CHARS", 1, 0, false);
    //declareFunction(myName, "hex_chars_to_byte", "HEX-CHARS-TO-BYTE", 2, 0, false);
    //declareFunction(myName, "byte_vector_to_64_bit_char_string", "BYTE-VECTOR-TO-64-BIT-CHAR-STRING", 1, 0, false);
    //declareFunction(myName, "write_bytes_as_64_bit_chars", "WRITE-BYTES-AS-64-BIT-CHARS", 4, 0, false);
    //declareFunction(myName, "bytes_to_64_bit_chars", "BYTES-TO-64-BIT-CHARS", 3, 0, false);
    //declareFunction(myName, "f_64_bit_chars_to_bytes", "64-BIT-CHARS-TO-BYTES", 4, 0, false);
    //declareFunction(myName, "f_64_bit_char_string_to_byte_vector", "64-BIT-CHAR-STRING-TO-BYTE-VECTOR", 1, 0, false);
    //declareFunction(myName, "f_64_bit_string_tuples_length", "64-BIT-STRING-TUPLES-LENGTH", 1, 0, false);
    //declareFunction(myName, "f_64_bit_string_byte_vector_length", "64-BIT-STRING-BYTE-VECTOR-LENGTH", 1, 0, false);
    //declareFunction(myName, "binary_search_vector_range", "BINARY-SEARCH-VECTOR-RANGE", 3, 3, false);
    //declareFunction(myName, "binary_search_vector", "BINARY-SEARCH-VECTOR", 3, 3, false);
    //declareFunction(myName, "binary_search_vector_int", "BINARY-SEARCH-VECTOR-INT", 8, 0, false);
    return NIL;
  }

  public static final SubLObject init_vector_utilities_file() {
    return NIL;
  }

  public static final SubLObject setup_vector_utilities_file() {
    // CVS_ID("Id: vector-utilities.lisp 127256 2009-02-26 15:28:07Z baxter ");
    access_macros.define_obsolete_register($sym2$CLEAR_VECTOR, $list3);
    generic_testing.define_test_case_table_int($sym13$64_BIT_STRING_TUPLES_LENGTH, list(new SubLObject[] {$kw14$TEST, NIL, $kw15$OWNER, NIL, $kw16$CLASSES, NIL, $kw17$KB, $kw18$TINY, $kw19$WORKING_, T}), $list20);
    generic_testing.define_test_case_table_int($sym21$64_BIT_STRING_BYTE_VECTOR_LENGTH, list(new SubLObject[] {$kw14$TEST, NIL, $kw15$OWNER, NIL, $kw16$CLASSES, NIL, $kw17$KB, $kw18$TINY, $kw19$WORKING_, T}), $list22);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$VECTORP = makeSymbol("VECTORP");
  public static final SubLSymbol $sym1$INTEGERP = makeSymbol("INTEGERP");
  public static final SubLSymbol $sym2$CLEAR_VECTOR = makeSymbol("CLEAR-VECTOR");
  public static final SubLList $list3 = list(makeSymbol("RESET-VECTOR"));
  public static final SubLSymbol $sym4$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $kw5$INPUT = makeKeyword("INPUT");
  public static final SubLString $str6$Unable_to_open__S = makeString("Unable to open ~S");
  public static final SubLSymbol $sym7$BYTE_VECTOR_P = makeSymbol("BYTE-VECTOR-P");
  public static final SubLInteger $int8$32 = makeInteger(32);
  public static final SubLString $str9$Did_not_fill_up_all_the_expected_ = makeString("Did not fill up all the expected characters of the hex string: ~s != ~s~%");
  public static final SubLSymbol $sym10$HEX_CHAR_STRING_P = makeSymbol("HEX-CHAR-STRING-P");
  public static final SubLSymbol $sym11$EVENP = makeSymbol("EVENP");
  public static final SubLSymbol $sym12$64_BIT_STRING_P = makeSymbol("64-BIT-STRING-P");
  public static final SubLSymbol $sym13$64_BIT_STRING_TUPLES_LENGTH = makeSymbol("64-BIT-STRING-TUPLES-LENGTH");
  public static final SubLSymbol $kw14$TEST = makeKeyword("TEST");
  public static final SubLSymbol $kw15$OWNER = makeKeyword("OWNER");
  public static final SubLSymbol $kw16$CLASSES = makeKeyword("CLASSES");
  public static final SubLSymbol $kw17$KB = makeKeyword("KB");
  public static final SubLSymbol $kw18$TINY = makeKeyword("TINY");
  public static final SubLSymbol $kw19$WORKING_ = makeKeyword("WORKING?");
  public static final SubLList $list20 = list(list(list(makeString("")), ZERO_INTEGER), list(list(makeString("AA")), ONE_INTEGER), list(list(makeString("AAA")), ONE_INTEGER), list(list(makeString("AA==")), ONE_INTEGER), list(list(makeString("AAA=")), ONE_INTEGER), list(list(makeString("AAAA")), ONE_INTEGER), list(list(makeString("AAAAAA")), TWO_INTEGER), list(list(makeString("AAAAAA==")), TWO_INTEGER));
  public static final SubLSymbol $sym21$64_BIT_STRING_BYTE_VECTOR_LENGTH = makeSymbol("64-BIT-STRING-BYTE-VECTOR-LENGTH");
  public static final SubLList $list22 = list(list(list(makeString("")), ZERO_INTEGER), list(list(makeString("AA")), ONE_INTEGER), list(list(makeString("AA==")), ONE_INTEGER), list(list(makeString("AAA")), TWO_INTEGER), list(list(makeString("AAA=")), TWO_INTEGER), list(list(makeString("AAAA")), THREE_INTEGER), list(list(makeString("AAAAAA")), FOUR_INTEGER), list(list(makeString("AAAAAA==")), FOUR_INTEGER));

  //// Initializers

  public void declareFunctions() {
    declare_vector_utilities_file();
  }

  public void initializeVariables() {
    init_vector_utilities_file();
  }

  public void runTopLevelForms() {
    setup_vector_utilities_file();
  }

}
