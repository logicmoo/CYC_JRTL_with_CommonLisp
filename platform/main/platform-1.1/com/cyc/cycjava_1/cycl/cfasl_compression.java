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
//dm import com.cyc.cycjava_1.cycl.assertion_handles;
//dm import com.cyc.cycjava_1.cycl.cfasl;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.cycl_grammar;
//dm import com.cyc.cycjava_1.cycl.dictionary;
//dm import com.cyc.cycjava_1.cycl.dictionary_contents;
//dm import com.cyc.cycjava_1.cycl.dictionary_utilities;
//dm import com.cyc.cycjava_1.cycl.format_nil;
//dm import com.cyc.cycjava_1.cycl.integer_sequence_generator;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.nart_handles;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class cfasl_compression extends SubLTranslatedFile {

  //// Constructor

  private cfasl_compression() {}
  public static final SubLFile me = new cfasl_compression();
  public static final String myName = "com.cyc.cycjava_1.cycl.cfasl_compression";

  //// Definitions

  @SubL(source = "cycl/cfasl-compression.lisp", position = 1137) 
  private static SubLSymbol $cfasl_opcode_open_compressed_block$ = null;

  @SubL(source = "cycl/cfasl-compression.lisp", position = 1236) 
  private static SubLSymbol $cfasl_opcode_compression_pair$ = null;

  @SubL(source = "cycl/cfasl-compression.lisp", position = 1329) 
  private static SubLSymbol $cfasl_opcode_compression_key$ = null;

  @SubL(source = "cycl/cfasl-compression.lisp", position = 1421) 
  private static SubLSymbol $cfasl_opcode_close_compressed_block$ = null;

  /** A dictionary mapping streams to a stack of decompression tables,
   the topmost of which is the active one. */
  @SubL(source = "cycl/cfasl-compression.lisp", position = 1520) 
  private static SubLSymbol $cfasl_decompression_index$ = null;

  @SubL(source = "cycl/cfasl-compression.lisp", position = 2707) 
  private static SubLSymbol $cfasl_compression_not_found$ = null;

  @SubL(source = "cycl/cfasl-compression.lisp", position = 4128) 
  public static SubLSymbol $cfasl_output_compression_options$ = null;

  @SubL(source = "cycl/cfasl-compression.lisp", position = 4269) 
  public static SubLSymbol $cfasl_output_compression_table$ = null;

  @SubL(source = "cycl/cfasl-compression.lisp", position = 4371) 
  public static SubLSymbol $cfasl_output_compression_code_isg$ = null;

  @SubL(source = "cycl/cfasl-compression.lisp", position = 4476) 
  private static SubLSymbol $within_cfasl_compression_analysisP$ = null;

  /** The valid properties for the CFASL compression options property list. */
  @SubL(source = "cycl/cfasl-compression.lisp", position = 6017) 
  private static SubLSymbol $cfasl_compression_options_properties$ = null;

  @SubL(source = "cycl/cfasl-compression.lisp", position = 6827) 
  public static final SubLObject cfasl_compress_objectP(SubLObject object) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == $cfasl_output_compression_table$.getDynamicValue(thread))) {
        return NIL;
      } else if ((NIL != Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12990"))) {
        return NIL;
      } else if ((NIL != conses_high.getf($cfasl_output_compression_options$.getDynamicValue(thread), $kw21$ANALYZE, UNPROVIDED))) {
        return list_utilities.sublisp_boolean(dictionary.dictionary_lookup($cfasl_output_compression_table$.getDynamicValue(thread), object, UNPROVIDED));
      } else if ((NIL != list_utilities.member_eqP(object, conses_high.getf($cfasl_output_compression_options$.getDynamicValue(thread), $kw23$NOT, UNPROVIDED)))) {
        return NIL;
      } else if ((NIL != conses_high.getf($cfasl_output_compression_options$.getDynamicValue(thread), $kw22$ALL_, UNPROVIDED))) {
        return T;
      } else {
        return NIL;
      }
    }
  }

  public static final SubLObject declare_cfasl_compression_file() {
    //declareFunction(myName, "new_cfasl_decompression_table", "NEW-CFASL-DECOMPRESSION-TABLE", 0, 0, false);
    //declareFunction(myName, "push_new_cfasl_decompression_table", "PUSH-NEW-CFASL-DECOMPRESSION-TABLE", 1, 0, false);
    //declareFunction(myName, "pop_cfasl_decompression_table", "POP-CFASL-DECOMPRESSION-TABLE", 1, 0, false);
    //declareFunction(myName, "current_cfasl_decompression_table_for_stream", "CURRENT-CFASL-DECOMPRESSION-TABLE-FOR-STREAM", 1, 0, false);
    //declareFunction(myName, "enter_cfasl_decompression_pair", "ENTER-CFASL-DECOMPRESSION-PAIR", 3, 0, false);
    //declareFunction(myName, "decompress_cfasl_object", "DECOMPRESS-CFASL-OBJECT", 2, 0, false);
    //declareFunction(myName, "cfasl_input_open_compressed_block", "CFASL-INPUT-OPEN-COMPRESSED-BLOCK", 1, 0, false);
    //declareFunction(myName, "cfasl_input_compression_pair", "CFASL-INPUT-COMPRESSION-PAIR", 1, 0, false);
    //declareFunction(myName, "cfasl_input_compression_key", "CFASL-INPUT-COMPRESSION-KEY", 1, 0, false);
    //declareFunction(myName, "cfasl_input_close_compressed_block", "CFASL-INPUT-CLOSE-COMPRESSED-BLOCK", 1, 0, false);
    //declareMacro(myName, "with_cfasl_compression", "WITH-CFASL-COMPRESSION");
    //declareFunction(myName, "with_cfasl_compression_cfasl_output_compression_table", "WITH-CFASL-COMPRESSION-CFASL-OUTPUT-COMPRESSION-TABLE", 1, 0, false);
    //declareFunction(myName, "with_cfasl_compression_preamble", "WITH-CFASL-COMPRESSION-PREAMBLE", 1, 0, false);
    //declareFunction(myName, "cfasl_compression_options_property_p", "CFASL-COMPRESSION-OPTIONS-PROPERTY-P", 1, 0, false);
    //declareFunction(myName, "validate_cfasl_compression_options", "VALIDATE-CFASL-COMPRESSION-OPTIONS", 1, 0, false);
    //declareFunction(myName, "with_cfasl_compression_postamble", "WITH-CFASL-COMPRESSION-POSTAMBLE", 1, 0, false);
    //declareMacro(myName, "without_cfasl_compression", "WITHOUT-CFASL-COMPRESSION");
    declareFunction(myName, "cfasl_compress_objectP", "CFASL-COMPRESS-OBJECT?", 1, 0, false);
    //declareFunction(myName, "cfasl_uncompressible_object_p", "CFASL-UNCOMPRESSIBLE-OBJECT-P", 1, 0, false);
    //declareFunction(myName, "finalize_cfasl_output_compression_table", "FINALIZE-CFASL-OUTPUT-COMPRESSION-TABLE", 1, 0, false);
    //declareFunction(myName, "cfasl_output_open_compressed_block", "CFASL-OUTPUT-OPEN-COMPRESSED-BLOCK", 1, 0, false);
    //declareFunction(myName, "cfasl_output_object_compressed", "CFASL-OUTPUT-OBJECT-COMPRESSED", 2, 0, false);
    //declareFunction(myName, "cfasl_output_compression_pair", "CFASL-OUTPUT-COMPRESSION-PAIR", 2, 0, false);
    //declareFunction(myName, "cfasl_output_compressed_object", "CFASL-OUTPUT-COMPRESSED-OBJECT", 2, 0, false);
    //declareFunction(myName, "cfasl_output_close_compressed_block", "CFASL-OUTPUT-CLOSE-COMPRESSED-BLOCK", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_cfasl_compression_file() {
    $cfasl_opcode_open_compressed_block$ = defconstant("*CFASL-OPCODE-OPEN-COMPRESSED-BLOCK*", $int0$54);
    $cfasl_opcode_compression_pair$ = defconstant("*CFASL-OPCODE-COMPRESSION-PAIR*", $int2$55);
    $cfasl_opcode_compression_key$ = defconstant("*CFASL-OPCODE-COMPRESSION-KEY*", $int4$56);
    $cfasl_opcode_close_compressed_block$ = defconstant("*CFASL-OPCODE-CLOSE-COMPRESSED-BLOCK*", $int6$57);
    $cfasl_decompression_index$ = deflexical("*CFASL-DECOMPRESSION-INDEX*", maybeDefault( $sym8$_CFASL_DECOMPRESSION_INDEX_, $cfasl_decompression_index$, ()-> (dictionary.new_dictionary(Symbols.symbol_function(EQ), UNPROVIDED))));
    $cfasl_compression_not_found$ = deflexical("*CFASL-COMPRESSION-NOT-FOUND*", maybeDefault( $sym9$_CFASL_COMPRESSION_NOT_FOUND_, $cfasl_compression_not_found$, ()-> (Symbols.make_symbol($str10$NOT_FOUND))));
    $cfasl_output_compression_options$ = defparameter("*CFASL-OUTPUT-COMPRESSION-OPTIONS*", NIL);
    $cfasl_output_compression_table$ = defparameter("*CFASL-OUTPUT-COMPRESSION-TABLE*", NIL);
    $cfasl_output_compression_code_isg$ = defparameter("*CFASL-OUTPUT-COMPRESSION-CODE-ISG*", NIL);
    $within_cfasl_compression_analysisP$ = defparameter("*WITHIN-CFASL-COMPRESSION-ANALYSIS?*", NIL);
    $cfasl_compression_options_properties$ = deflexical("*CFASL-COMPRESSION-OPTIONS-PROPERTIES*", $list25);
    return NIL;
  }

  public static final SubLObject setup_cfasl_compression_file() {
    // CVS_ID("Id: cfasl-compression.lisp 126640 2008-12-04 13:39:36Z builder ");
    cfasl.register_cfasl_input_function($cfasl_opcode_open_compressed_block$.getGlobalValue(), $sym1$CFASL_INPUT_OPEN_COMPRESSED_BLOCK);
    cfasl.register_cfasl_input_function($cfasl_opcode_compression_pair$.getGlobalValue(), $sym3$CFASL_INPUT_COMPRESSION_PAIR);
    cfasl.register_cfasl_input_function($cfasl_opcode_compression_key$.getGlobalValue(), $sym5$CFASL_INPUT_COMPRESSION_KEY);
    cfasl.register_cfasl_input_function($cfasl_opcode_close_compressed_block$.getGlobalValue(), $sym7$CFASL_INPUT_CLOSE_COMPRESSED_BLOCK);
    subl_macro_promotions.declare_defglobal($sym8$_CFASL_DECOMPRESSION_INDEX_);
    subl_macro_promotions.declare_defglobal($sym9$_CFASL_COMPRESSION_NOT_FOUND_);
    utilities_macros.note_funcall_helper_function($sym1$CFASL_INPUT_OPEN_COMPRESSED_BLOCK);
    utilities_macros.note_funcall_helper_function($sym3$CFASL_INPUT_COMPRESSION_PAIR);
    utilities_macros.note_funcall_helper_function($sym5$CFASL_INPUT_COMPRESSION_KEY);
    utilities_macros.note_funcall_helper_function($sym7$CFASL_INPUT_CLOSE_COMPRESSED_BLOCK);
    access_macros.register_macro_helper($sym17$WITH_CFASL_COMPRESSION_CFASL_OUTPUT_COMPRESSION_TABLE, $sym20$WITH_CFASL_COMPRESSION);
    access_macros.register_macro_helper($sym18$WITH_CFASL_COMPRESSION_PREAMBLE, $sym20$WITH_CFASL_COMPRESSION);
    access_macros.register_macro_helper($sym19$WITH_CFASL_COMPRESSION_POSTAMBLE, $sym20$WITH_CFASL_COMPRESSION);
    return NIL;
  }

  //// Internal Constants

  public static final SubLInteger $int0$54 = makeInteger(54);
  public static final SubLSymbol $sym1$CFASL_INPUT_OPEN_COMPRESSED_BLOCK = makeSymbol("CFASL-INPUT-OPEN-COMPRESSED-BLOCK");
  public static final SubLInteger $int2$55 = makeInteger(55);
  public static final SubLSymbol $sym3$CFASL_INPUT_COMPRESSION_PAIR = makeSymbol("CFASL-INPUT-COMPRESSION-PAIR");
  public static final SubLInteger $int4$56 = makeInteger(56);
  public static final SubLSymbol $sym5$CFASL_INPUT_COMPRESSION_KEY = makeSymbol("CFASL-INPUT-COMPRESSION-KEY");
  public static final SubLInteger $int6$57 = makeInteger(57);
  public static final SubLSymbol $sym7$CFASL_INPUT_CLOSE_COMPRESSED_BLOCK = makeSymbol("CFASL-INPUT-CLOSE-COMPRESSED-BLOCK");
  public static final SubLSymbol $sym8$_CFASL_DECOMPRESSION_INDEX_ = makeSymbol("*CFASL-DECOMPRESSION-INDEX*");
  public static final SubLSymbol $sym9$_CFASL_COMPRESSION_NOT_FOUND_ = makeSymbol("*CFASL-COMPRESSION-NOT-FOUND*");
  public static final SubLString $str10$NOT_FOUND = makeString("NOT-FOUND");
  public static final SubLString $str11$Couldn_t_decompress__s_using_tabl = makeString("Couldn't decompress ~s using table ~s");
  public static final SubLList $list12 = list(list(makeSymbol("STREAM"), makeSymbol("OPTIONS")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym13$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym14$_CFASL_OUTPUT_COMPRESSION_OPTIONS_ = makeSymbol("*CFASL-OUTPUT-COMPRESSION-OPTIONS*");
  public static final SubLList $list15 = list(makeSymbol("*CFASL-OUTPUT-COMPRESSION-CODE-ISG*"), list(makeSymbol("NEW-INTEGER-SEQUENCE-GENERATOR")));
  public static final SubLSymbol $sym16$_CFASL_OUTPUT_COMPRESSION_TABLE_ = makeSymbol("*CFASL-OUTPUT-COMPRESSION-TABLE*");
  public static final SubLSymbol $sym17$WITH_CFASL_COMPRESSION_CFASL_OUTPUT_COMPRESSION_TABLE = makeSymbol("WITH-CFASL-COMPRESSION-CFASL-OUTPUT-COMPRESSION-TABLE");
  public static final SubLSymbol $sym18$WITH_CFASL_COMPRESSION_PREAMBLE = makeSymbol("WITH-CFASL-COMPRESSION-PREAMBLE");
  public static final SubLSymbol $sym19$WITH_CFASL_COMPRESSION_POSTAMBLE = makeSymbol("WITH-CFASL-COMPRESSION-POSTAMBLE");
  public static final SubLSymbol $sym20$WITH_CFASL_COMPRESSION = makeSymbol("WITH-CFASL-COMPRESSION");
  public static final SubLSymbol $kw21$ANALYZE = makeKeyword("ANALYZE");
  public static final SubLSymbol $kw22$ALL_ = makeKeyword("ALL?");
  public static final SubLSymbol $kw23$NOT = makeKeyword("NOT");
  public static final SubLSymbol $kw24$VERBOSE_ = makeKeyword("VERBOSE?");
  public static final SubLList $list25 = list(makeKeyword("ALL?"), makeKeyword("ANALYZE"), makeKeyword("NOT"), makeKeyword("VERBOSE?"));
  public static final SubLSymbol $sym26$PROPERTY_LIST_P = makeSymbol("PROPERTY-LIST-P");
  public static final SubLSymbol $sym27$CFASL_COMPRESSION_OPTIONS_PROPERTY_P = makeSymbol("CFASL-COMPRESSION-OPTIONS-PROPERTY-P");
  public static final SubLList $list28 = list(list(makeSymbol("*CFASL-OUTPUT-COMPRESSION-TABLE*"), NIL));
  public static final SubLList $list29 = cons(makeSymbol("OBJECT"), makeSymbol("COUNT"));
  public static final SubLString $str30$__CFASL_compression_dictionary___ = makeString("~&CFASL compression dictionary:~%");
  public static final SubLSymbol $sym31$_ = makeSymbol(">");
  public static final SubLSymbol $sym32$CDR = makeSymbol("CDR");
  public static final SubLSymbol $kw33$PRECOMPUTED = makeKeyword("PRECOMPUTED");

  //// Initializers

  public void declareFunctions() {
    declare_cfasl_compression_file();
  }

  public void initializeVariables() {
    init_cfasl_compression_file();
  }

  public void runTopLevelForms() {
    setup_cfasl_compression_file();
  }

}
