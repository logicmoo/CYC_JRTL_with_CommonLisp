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

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.cfasl;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.hash_table_utilities;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.number_utilities;
//dm import com.cyc.cycjava_1.cycl.set;
//dm import com.cyc.cycjava_1.cycl.subl_macros;

public  final class sparse_vector extends SubLTranslatedFile {

  //// Constructor

  private sparse_vector() {}
  public static final SubLFile me = new sparse_vector();
  public static final String myName = "com.cyc.cycjava_1.cycl.sparse_vector";

  //// Definitions

  public static final class $sparse_vector_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $magnitude; }
    public SubLObject getField3() { return $dimensions; }
    public SubLObject setField2(SubLObject value) { return $magnitude = value; }
    public SubLObject setField3(SubLObject value) { return $dimensions = value; }
    public SubLObject $magnitude = NIL;
    public SubLObject $dimensions = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($sparse_vector_native.class, $sym0$SPARSE_VECTOR, $sym1$SPARSE_VECTOR_P, $list2, $list3, new String[] {"$magnitude", "$dimensions"}, $list4, $list5, $sym6$SVECTOR_PRINT);
  }

  @SubL(source = "cycl/sparse-vector.lisp", position = 3370) 
  public static SubLSymbol $dtp_sparse_vector$ = null;

  @SubL(source = "cycl/sparse-vector.lisp", position = 3370) 
  public static final SubLObject sparse_vector_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8150");
    return NIL;
  }

  public static final class $sparse_vector_p$UnaryFunction extends UnaryFunction {
    public $sparse_vector_p$UnaryFunction() { super(extractFunctionNamed("SPARSE-VECTOR-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8121"); }
  }

  @SubL(source = "cycl/sparse-vector.lisp", position = 13767) 
  private static SubLSymbol $cfasl_opcode_sparse_vector$ = null;

  @SubL(source = "cycl/sparse-vector.lisp", position = 13906) 
  public static final SubLObject cfasl_output_object_sparse_vector_method(SubLObject object, SubLObject stream) {
    return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8116");
  }

  public static final SubLObject declare_sparse_vector_file() {
    declareFunction("sparse_vector_print_function_trampoline", "SPARSE-VECTOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction("sparse_vector_p", "SPARSE-VECTOR-P", 1, 0, false); new $sparse_vector_p$UnaryFunction();
    //declareFunction("svector_magnitude", "SVECTOR-MAGNITUDE", 1, 0, false);
    //declareFunction("svector_dimensions", "SVECTOR-DIMENSIONS", 1, 0, false);
    //declareFunction("_csetf_svector_magnitude", "_CSETF-SVECTOR-MAGNITUDE", 2, 0, false);
    //declareFunction("_csetf_svector_dimensions", "_CSETF-SVECTOR-DIMENSIONS", 2, 0, false);
    //declareFunction("make_sparse_vector", "MAKE-SPARSE-VECTOR", 0, 1, false);
    //declareFunction("new_sparse_vector", "NEW-SPARSE-VECTOR", 0, 2, false);
    //declareFunction("svector_print", "SVECTOR-PRINT", 3, 0, false);
    //declareFunction("svector_test", "SVECTOR-TEST", 1, 0, false);
    //declareFunction("svector_cardinality", "SVECTOR-CARDINALITY", 1, 0, false);
    //declareFunction("svector_copy", "SVECTOR-COPY", 1, 0, false);
    //declareFunction("svector_get", "SVECTOR-GET", 2, 0, false);
    //declareFunction("svector_set", "SVECTOR-SET", 3, 0, false);
    //declareFunction("svector_inc", "SVECTOR-INC", 2, 0, false);
    //declareFunction("svector_dec", "SVECTOR-DEC", 2, 0, false);
    //declareFunction("svector_length", "SVECTOR-LENGTH", 1, 0, false);
    //declareMacro("do_svector", "DO-SVECTOR");
    //declareFunction("zero_svector_p", "ZERO-SVECTOR-P", 1, 0, false);
    //declareFunction("svector_euclidean_norm", "SVECTOR-EUCLIDEAN-NORM", 1, 0, false);
    //declareFunction("svector_sum_norm", "SVECTOR-SUM-NORM", 1, 0, false);
    //declareFunction("svector_max_norm", "SVECTOR-MAX-NORM", 1, 0, false);
    //declareFunction("svector_add", "SVECTOR-ADD", 2, 0, false);
    //declareFunction("svector_sum", "SVECTOR-SUM", 2, 0, false);
    //declareFunction("svector_scalar_product", "SVECTOR-SCALAR-PRODUCT", 2, 0, false);
    //declareFunction("svector_scale", "SVECTOR-SCALE", 2, 0, false);
    //declareFunction("svector_normalize", "SVECTOR-NORMALIZE", 1, 0, false);
    //declareFunction("svector_normalizedP", "SVECTOR-NORMALIZED?", 1, 0, false);
    //declareFunction("svector_distance", "SVECTOR-DISTANCE", 2, 0, false);
    //declareFunction("svector_centroid", "SVECTOR-CENTROID", 1, 0, false);
    //declareFunction("svector_matching_coefficient", "SVECTOR-MATCHING-COEFFICIENT", 2, 0, false);
    //declareFunction("svector_cosine_angle", "SVECTOR-COSINE-ANGLE", 2, 0, false);
    //declareFunction("svector_overlap_coefficient", "SVECTOR-OVERLAP-COEFFICIENT", 2, 0, false);
    declareFunction("cfasl_output_object_sparse_vector_method", "CFASL-OUTPUT-OBJECT-SPARSE-VECTOR-METHOD", 2, 0, false);
    //declareFunction("cfasl_output_sparse_vector", "CFASL-OUTPUT-SPARSE-VECTOR", 2, 0, false);
    //declareFunction("cfasl_input_sparse_vector", "CFASL-INPUT-SPARSE-VECTOR", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_sparse_vector_file() {
    $dtp_sparse_vector$ = defconstant("*DTP-SPARSE-VECTOR*", $sym0$SPARSE_VECTOR);
    $cfasl_opcode_sparse_vector$ = defconstant("*CFASL-OPCODE-SPARSE-VECTOR*", $int31$65);
    return NIL;
  }

  public static final SubLObject setup_sparse_vector_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_sparse_vector$.getGlobalValue(), Symbols.symbol_function($sym7$SPARSE_VECTOR_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym8$SVECTOR_MAGNITUDE, $sym9$_CSETF_SVECTOR_MAGNITUDE);
    Structures.def_csetf($sym10$SVECTOR_DIMENSIONS, $sym11$_CSETF_SVECTOR_DIMENSIONS);
    Equality.identity($sym0$SPARSE_VECTOR);
    cfasl.register_cfasl_input_function($cfasl_opcode_sparse_vector$.getGlobalValue(), $sym32$CFASL_INPUT_SPARSE_VECTOR);
    Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), $dtp_sparse_vector$.getGlobalValue(), Symbols.symbol_function($sym33$CFASL_OUTPUT_OBJECT_SPARSE_VECTOR_METHOD));
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$SPARSE_VECTOR = makeSymbol("SPARSE-VECTOR");
  public static final SubLSymbol $sym1$SPARSE_VECTOR_P = makeSymbol("SPARSE-VECTOR-P");
  public static final SubLList $list2 = list(makeSymbol("MAGNITUDE"), makeSymbol("DIMENSIONS"));
  public static final SubLList $list3 = list(makeKeyword("MAGNITUDE"), makeKeyword("DIMENSIONS"));
  public static final SubLList $list4 = list(makeSymbol("SVECTOR-MAGNITUDE"), makeSymbol("SVECTOR-DIMENSIONS"));
  public static final SubLList $list5 = list(makeSymbol("_CSETF-SVECTOR-MAGNITUDE"), makeSymbol("_CSETF-SVECTOR-DIMENSIONS"));
  public static final SubLSymbol $sym6$SVECTOR_PRINT = makeSymbol("SVECTOR-PRINT");
  public static final SubLSymbol $sym7$SPARSE_VECTOR_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SPARSE-VECTOR-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym8$SVECTOR_MAGNITUDE = makeSymbol("SVECTOR-MAGNITUDE");
  public static final SubLSymbol $sym9$_CSETF_SVECTOR_MAGNITUDE = makeSymbol("_CSETF-SVECTOR-MAGNITUDE");
  public static final SubLSymbol $sym10$SVECTOR_DIMENSIONS = makeSymbol("SVECTOR-DIMENSIONS");
  public static final SubLSymbol $sym11$_CSETF_SVECTOR_DIMENSIONS = makeSymbol("_CSETF-SVECTOR-DIMENSIONS");
  public static final SubLSymbol $kw12$MAGNITUDE = makeKeyword("MAGNITUDE");
  public static final SubLSymbol $kw13$DIMENSIONS = makeKeyword("DIMENSIONS");
  public static final SubLString $str14$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLInteger $int15$50 = makeInteger(50);
  public static final SubLSymbol $sym16$VALID_HASH_TEST_P = makeSymbol("VALID-HASH-TEST-P");
  public static final SubLSymbol $sym17$INTEGERP = makeSymbol("INTEGERP");
  public static final SubLString $str18$__SVECTOR__ = makeString("#<SVECTOR: ");
  public static final SubLSymbol $kw19$DO_HASH_TABLE = makeKeyword("DO-HASH-TABLE");
  public static final SubLString $str20$____ = makeString(" -> ");
  public static final SubLString $str21$__ = makeString(", ");
  public static final SubLString $str22$___ = makeString("...");
  public static final SubLString $str23$_ = makeString(">");
  public static final SubLSymbol $sym24$NUMBERP = makeSymbol("NUMBERP");
  public static final SubLList $list25 = list(list(makeSymbol("DIMENSION"), makeSymbol("VALUE"), makeSymbol("VECTOR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym26$CDOHASH = makeSymbol("CDOHASH");
  public static final SubLSymbol $sym27$NON_EMPTY_LIST_P = makeSymbol("NON-EMPTY-LIST-P");
  public static final SubLString $str28$_a_is_not_a_sparse_vector_with_te = makeString("~a is not a sparse vector with test ~a");
  public static final SubLString $str29$Non_matching_vector_tests__a_and_ = makeString("Non-matching vector tests ~a and ~a");
  public static final SubLInteger $int30$64 = makeInteger(64);
  public static final SubLInteger $int31$65 = makeInteger(65);
  public static final SubLSymbol $sym32$CFASL_INPUT_SPARSE_VECTOR = makeSymbol("CFASL-INPUT-SPARSE-VECTOR");
  public static final SubLSymbol $sym33$CFASL_OUTPUT_OBJECT_SPARSE_VECTOR_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-SPARSE-VECTOR-METHOD");

  //// Initializers

  public void declareFunctions() {
    declare_sparse_vector_file();
  }

  public void initializeVariables() {
    init_sparse_vector_file();
  }

  public void runTopLevelForms() {
    setup_sparse_vector_file();
  }

}
