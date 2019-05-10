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
//dm import com.cyc.cycjava_1.cycl.cfasl;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.dictionary_contents;
//dm //dm import com.cyc.cycjava_1.cycl.cyc_testing.generic_testing;
//dm import com.cyc.cycjava_1.cycl.hash_table_utilities;
//dm import com.cyc.cycjava_1.cycl.iteration;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.meta_macros;
//dm import com.cyc.cycjava_1.cycl.set_contents;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;

public  final class bag extends SubLTranslatedFile {

  //// Constructor

  private bag() {}
  public static final SubLFile me = new bag();
  public static final String myName = "com.cyc.cycjava_1.cycl.bag";

  //// Definitions

  public static final class $bag_native extends SubLStructNative {
    @Override
    public SubLStructDecl getStructDecl() { return structDecl; }
    @Override
    public SubLObject getField2() { return $unique_contents; }
    @Override
    public SubLObject getField3() { return $repeat_contents; }
    @Override
    public SubLObject getField4() { return $repeat_size; }
    @Override
    public SubLObject getField5() { return $test; }
    @Override
    public SubLObject setField2(SubLObject value) { return $unique_contents = value; }
    @Override
    public SubLObject setField3(SubLObject value) { return $repeat_contents = value; }
    @Override
    public SubLObject setField4(SubLObject value) { return $repeat_size = value; }
    @Override
    public SubLObject setField5(SubLObject value) { return $test = value; }
    public SubLObject $unique_contents = NIL;
    public SubLObject $repeat_contents = NIL;
    public SubLObject $repeat_size = NIL;
    public SubLObject $test = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($bag_native.class, $sym0$BAG, $sym1$BAG_P, $list3, $list4, new String[] {"$unique_contents", "$repeat_contents", "$repeat_size", "$test"}, $list5, $list6, $sym7$PRINT_BAG);
  }

  @SubL(source = "cycl/bag.lisp", position = 1941)
  public static SubLSymbol $dtp_bag$ = null;

  @SubL(source = "cycl/bag.lisp", position = 1941)
  public static final SubLObject bag_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 6700");
    return NIL;
  }

  public static final class $bag_p$UnaryFunction extends UnaryFunction {
    public $bag_p$UnaryFunction() { super(extractFunctionNamed("BAG-P")); }
    @Override
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 6646"); }
  }

  /** @note there is no empirical evidence for this number yet,
   this is based on back of the envelope math */
  @SubL(source = "cycl/bag.lisp", position = 8179)
  private static SubLSymbol $bag_repeat_contents_iterator_watermark$ = null;

  @SubL(source = "cycl/bag.lisp", position = 12329)
  public static SubLSymbol $new_bag_default_test_function$ = null;

  @SubL(source = "cycl/bag.lisp", position = 24896)
  private static SubLSymbol $cfasl_opcode_bag$ = null;

  @SubL(source = "cycl/bag.lisp", position = 25010)
  public static final SubLObject cfasl_output_object_bag_method(SubLObject object, SubLObject stream) {
    return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 6694");
  }

  public static final SubLObject declare_bag_file() {
    declareFunction(myName, "bag_print_function_trampoline", "BAG-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction(myName, "bag_p", "BAG-P", 1, 0, false); new $bag_p$UnaryFunction();
    //declareFunction(myName, "bag_struct_unique_contents", "BAG-STRUCT-UNIQUE-CONTENTS", 1, 0, false);
    //declareFunction(myName, "bag_struct_repeat_contents", "BAG-STRUCT-REPEAT-CONTENTS", 1, 0, false);
    //declareFunction(myName, "bag_struct_repeat_size", "BAG-STRUCT-REPEAT-SIZE", 1, 0, false);
    //declareFunction(myName, "bag_struct_test", "BAG-STRUCT-TEST", 1, 0, false);
    //declareFunction(myName, "_csetf_bag_struct_unique_contents", "_CSETF-BAG-STRUCT-UNIQUE-CONTENTS", 2, 0, false);
    //declareFunction(myName, "_csetf_bag_struct_repeat_contents", "_CSETF-BAG-STRUCT-REPEAT-CONTENTS", 2, 0, false);
    //declareFunction(myName, "_csetf_bag_struct_repeat_size", "_CSETF-BAG-STRUCT-REPEAT-SIZE", 2, 0, false);
    //declareFunction(myName, "_csetf_bag_struct_test", "_CSETF-BAG-STRUCT-TEST", 2, 0, false);
    //declareFunction(myName, "make_bag", "MAKE-BAG", 0, 1, false);
    //declareFunction(myName, "print_bag", "PRINT-BAG", 3, 0, false);
    //declareFunction(myName, "make_new_bag", "MAKE-NEW-BAG", 4, 0, false);
    //declareFunction(myName, "new_bag_repeat_contents", "NEW-BAG-REPEAT-CONTENTS", 2, 0, false);
    //declareFunction(myName, "copy_bag_repeat_contents", "COPY-BAG-REPEAT-CONTENTS", 1, 0, false);
    //declareFunction(myName, "bag_repeat_contents_unique_size", "BAG-REPEAT-CONTENTS-UNIQUE-SIZE", 1, 0, false);
    //declareFunction(myName, "bag_repeat_contents_emptyP", "BAG-REPEAT-CONTENTS-EMPTY?", 1, 0, false);
    //declareFunction(myName, "bag_repeat_contents_member_count", "BAG-REPEAT-CONTENTS-MEMBER-COUNT", 3, 0, false);
    //declareFunction(myName, "bag_repeat_contents_memberP", "BAG-REPEAT-CONTENTS-MEMBER?", 3, 0, false);
    //declareFunction(myName, "bag_repeat_contents_matching_element", "BAG-REPEAT-CONTENTS-MATCHING-ELEMENT", 3, 0, false);
    //declareFunction(myName, "bag_repeat_contents_random_element", "BAG-REPEAT-CONTENTS-RANDOM-ELEMENT", 1, 0, false);
    //declareFunction(myName, "bag_repeat_contents_add", "BAG-REPEAT-CONTENTS-ADD", 3, 0, false);
    //declareFunction(myName, "bag_repeat_contents_delete", "BAG-REPEAT-CONTENTS-DELETE", 3, 0, false);
    //declareFunction(myName, "bag_repeat_contents_delete_all", "BAG-REPEAT-CONTENTS-DELETE-ALL", 3, 0, false);
    //declareFunction(myName, "clear_bag_repeat_contents", "CLEAR-BAG-REPEAT-CONTENTS", 1, 0, false);
    //declareMacro(myName, "do_bag_repeat_contents_unique", "DO-BAG-REPEAT-CONTENTS-UNIQUE");
    //declareMacro(myName, "do_bag_repeat_contents", "DO-BAG-REPEAT-CONTENTS");
    //declareFunction(myName, "map_bag_repeat_contents", "MAP-BAG-REPEAT-CONTENTS", 2, 1, false);
    //declareFunction(myName, "bag_repeat_contents_element_list", "BAG-REPEAT-CONTENTS-ELEMENT-LIST", 1, 0, false);
    //declareFunction(myName, "bag_repeat_contents_unique_element_list", "BAG-REPEAT-CONTENTS-UNIQUE-ELEMENT-LIST", 1, 0, false);
    //declareFunction(myName, "make_bag_iterator_state", "MAKE-BAG-ITERATOR-STATE", 1, 0, false);
    //declareFunction(myName, "iterate_bag_done", "ITERATE-BAG-DONE", 1, 0, false);
    //declareFunction(myName, "iterate_bag_next", "ITERATE-BAG-NEXT", 1, 0, false);
    //declareFunction(myName, "new_bag_repeat_contents_iterator", "NEW-BAG-REPEAT-CONTENTS-ITERATOR", 1, 0, false);
    //declareFunction(myName, "new_bag_unique_contents", "NEW-BAG-UNIQUE-CONTENTS", 2, 0, false);
    //declareFunction(myName, "copy_bag_unique_contents", "COPY-BAG-UNIQUE-CONTENTS", 1, 0, false);
    //declareFunction(myName, "bag_unique_contents_unique_size", "BAG-UNIQUE-CONTENTS-UNIQUE-SIZE", 1, 0, false);
    //declareFunction(myName, "bag_unique_contents_emptyP", "BAG-UNIQUE-CONTENTS-EMPTY?", 1, 0, false);
    //declareFunction(myName, "bag_unique_contents_memberP", "BAG-UNIQUE-CONTENTS-MEMBER?", 3, 0, false);
    //declareFunction(myName, "bag_unique_contents_member_count", "BAG-UNIQUE-CONTENTS-MEMBER-COUNT", 3, 0, false);
    //declareFunction(myName, "bag_unique_contents_matching_element", "BAG-UNIQUE-CONTENTS-MATCHING-ELEMENT", 3, 0, false);
    //declareFunction(myName, "bag_unique_contents_random_element", "BAG-UNIQUE-CONTENTS-RANDOM-ELEMENT", 1, 0, false);
    //declareFunction(myName, "bag_unique_contents_add", "BAG-UNIQUE-CONTENTS-ADD", 3, 0, false);
    //declareFunction(myName, "bag_unique_contents_delete", "BAG-UNIQUE-CONTENTS-DELETE", 3, 0, false);
    //declareFunction(myName, "bag_unique_contents_delete_all", "BAG-UNIQUE-CONTENTS-DELETE-ALL", 3, 0, false);
    //declareFunction(myName, "clear_bag_unique_contents", "CLEAR-BAG-UNIQUE-CONTENTS", 1, 0, false);
    //declareMacro(myName, "do_bag_unique_contents", "DO-BAG-UNIQUE-CONTENTS");
    //declareFunction(myName, "map_bag_unique_contents", "MAP-BAG-UNIQUE-CONTENTS", 2, 1, false);
    //declareFunction(myName, "bag_unique_contents_element_list", "BAG-UNIQUE-CONTENTS-ELEMENT-LIST", 1, 0, false);
    //declareFunction(myName, "bag_unique_contents_unique_element_list", "BAG-UNIQUE-CONTENTS-UNIQUE-ELEMENT-LIST", 1, 0, false);
    //declareFunction(myName, "new_bag_unique_contents_iterator", "NEW-BAG-UNIQUE-CONTENTS-ITERATOR", 1, 0, false);
    //declareFunction(myName, "new_bag_contents_iterator", "NEW-BAG-CONTENTS-ITERATOR", 2, 0, false);
    //declareFunction(myName, "new_bag", "NEW-BAG", 0, 2, false);
    //declareFunction(myName, "copy_bag", "COPY-BAG", 1, 0, false);
    //declareFunction(myName, "new_bag_from_elements", "NEW-BAG-FROM-ELEMENTS", 1, 2, false);
    //declareFunction(myName, "bag_test", "BAG-TEST", 1, 0, false);
    //declareFunction(myName, "bag_size", "BAG-SIZE", 1, 0, false);
    //declareFunction(myName, "bag_unique_size", "BAG-UNIQUE-SIZE", 1, 0, false);
    //declareFunction(myName, "bag_emptyP", "BAG-EMPTY?", 1, 0, false);
    //declareFunction(myName, "empty_bag_p", "EMPTY-BAG-P", 1, 0, false);
    //declareFunction(myName, "non_empty_bag_p", "NON-EMPTY-BAG-P", 1, 0, false);
    //declareFunction(myName, "bag_memberP", "BAG-MEMBER?", 2, 0, false);
    //declareFunction(myName, "bag_member_count", "BAG-MEMBER-COUNT", 2, 0, false);
    //declareFunction(myName, "bag_matching_element", "BAG-MATCHING-ELEMENT", 2, 0, false);
    //declareFunction(myName, "bag_random_element", "BAG-RANDOM-ELEMENT", 1, 0, false);
    //declareFunction(myName, "bag_add", "BAG-ADD", 2, 0, false);
    //declareFunction(myName, "bag_remove", "BAG-REMOVE", 2, 0, false);
    //declareFunction(myName, "bag_remove_all", "BAG-REMOVE-ALL", 2, 0, false);
    //declareFunction(myName, "clear_bag", "CLEAR-BAG", 1, 0, false);
    //declareFunction(myName, "new_bag_iterator", "NEW-BAG-ITERATOR", 1, 0, false);
    //declareMacro(myName, "do_bag_unique", "DO-BAG-UNIQUE");
    //declareMacro(myName, "do_bag", "DO-BAG");
    //declareFunction(myName, "do_bag_repeat_internal", "DO-BAG-REPEAT-INTERNAL", 1, 0, false);
    //declareFunction(myName, "do_bag_unique_internal", "DO-BAG-UNIQUE-INTERNAL", 1, 0, false);
    //declareFunction(myName, "map_bag", "MAP-BAG", 2, 1, false);
    //declareFunction(myName, "bag_element_list", "BAG-ELEMENT-LIST", 1, 0, false);
    //declareFunction(myName, "bag_unique_element_list", "BAG-UNIQUE-ELEMENT-LIST", 1, 0, false);
    //declareFunction(myName, "bag_element_count_list", "BAG-ELEMENT-COUNT-LIST", 1, 0, false);
    declareFunction(myName, "cfasl_output_object_bag_method", "CFASL-OUTPUT-OBJECT-BAG-METHOD", 2, 0, false);
    //declareFunction(myName, "cfasl_output_bag", "CFASL-OUTPUT-BAG", 2, 0, false);
    //declareFunction(myName, "cfasl_input_bag", "CFASL-INPUT-BAG", 1, 0, false);
    //declareFunction(myName, "bag_unit_test_kitchen_sink", "BAG-UNIT-TEST-KITCHEN-SINK", 2, 0, false);
    return NIL;
  }

  public static final SubLObject init_bag_file() {
    $dtp_bag$ = defconstant("*DTP-BAG*", $sym0$BAG);
    $bag_repeat_contents_iterator_watermark$ = deflexical("*BAG-REPEAT-CONTENTS-ITERATOR-WATERMARK*", EIGHT_INTEGER);
    $new_bag_default_test_function$ = deflexical("*NEW-BAG-DEFAULT-TEST-FUNCTION*", Symbols.symbol_function(EQL));
    $cfasl_opcode_bag$ = defconstant("*CFASL-OPCODE-BAG*", $int64$62);
    return NIL;
  }

  public static final SubLObject setup_bag_file() {
    // CVS_ID("Id: bag.lisp 126640 2008-12-04 13:39:36Z builder ");
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_bag$.getGlobalValue(), Symbols.symbol_function($sym8$BAG_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym9$BAG_STRUCT_UNIQUE_CONTENTS, $sym10$_CSETF_BAG_STRUCT_UNIQUE_CONTENTS);
    Structures.def_csetf($sym11$BAG_STRUCT_REPEAT_CONTENTS, $sym12$_CSETF_BAG_STRUCT_REPEAT_CONTENTS);
    Structures.def_csetf($sym13$BAG_STRUCT_REPEAT_SIZE, $sym14$_CSETF_BAG_STRUCT_REPEAT_SIZE);
    Structures.def_csetf($sym15$BAG_STRUCT_TEST, $sym16$_CSETF_BAG_STRUCT_TEST);
    Equality.identity($sym0$BAG);
    access_macros.register_macro_helper($sym54$DO_BAG_REPEAT_INTERNAL, $sym63$DO_BAG_UNIQUE);
    access_macros.register_macro_helper($sym58$DO_BAG_UNIQUE_INTERNAL, $sym63$DO_BAG_UNIQUE);
    cfasl.register_cfasl_input_function($cfasl_opcode_bag$.getGlobalValue(), $sym65$CFASL_INPUT_BAG);
    Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), $dtp_bag$.getGlobalValue(), Symbols.symbol_function($sym66$CFASL_OUTPUT_OBJECT_BAG_METHOD));
    generic_testing.define_test_case_table_int($sym70$BAG_UNIT_TEST_KITCHEN_SINK, list(new SubLObject[] {$kw20$TEST, NIL, $kw71$OWNER, NIL, $kw72$CLASSES, NIL, $kw73$KB, $kw74$TINY, $kw75$WORKING_, T}), $list76);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$BAG = makeSymbol("BAG");
  public static final SubLSymbol $sym1$BAG_P = makeSymbol("BAG-P");
  public static final SubLInteger $int2$138 = makeInteger(138);
  public static final SubLList $list3 = list(makeSymbol("UNIQUE-CONTENTS"), makeSymbol("REPEAT-CONTENTS"), makeSymbol("REPEAT-SIZE"), makeSymbol("TEST"));
  public static final SubLList $list4 = list(makeKeyword("UNIQUE-CONTENTS"), makeKeyword("REPEAT-CONTENTS"), makeKeyword("REPEAT-SIZE"), makeKeyword("TEST"));
  public static final SubLList $list5 = list(makeSymbol("BAG-STRUCT-UNIQUE-CONTENTS"), makeSymbol("BAG-STRUCT-REPEAT-CONTENTS"), makeSymbol("BAG-STRUCT-REPEAT-SIZE"), makeSymbol("BAG-STRUCT-TEST"));
  public static final SubLList $list6 = list(makeSymbol("_CSETF-BAG-STRUCT-UNIQUE-CONTENTS"), makeSymbol("_CSETF-BAG-STRUCT-REPEAT-CONTENTS"), makeSymbol("_CSETF-BAG-STRUCT-REPEAT-SIZE"), makeSymbol("_CSETF-BAG-STRUCT-TEST"));
  public static final SubLSymbol $sym7$PRINT_BAG = makeSymbol("PRINT-BAG");
  public static final SubLSymbol $sym8$BAG_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("BAG-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym9$BAG_STRUCT_UNIQUE_CONTENTS = makeSymbol("BAG-STRUCT-UNIQUE-CONTENTS");
  public static final SubLSymbol $sym10$_CSETF_BAG_STRUCT_UNIQUE_CONTENTS = makeSymbol("_CSETF-BAG-STRUCT-UNIQUE-CONTENTS");
  public static final SubLSymbol $sym11$BAG_STRUCT_REPEAT_CONTENTS = makeSymbol("BAG-STRUCT-REPEAT-CONTENTS");
  public static final SubLSymbol $sym12$_CSETF_BAG_STRUCT_REPEAT_CONTENTS = makeSymbol("_CSETF-BAG-STRUCT-REPEAT-CONTENTS");
  public static final SubLSymbol $sym13$BAG_STRUCT_REPEAT_SIZE = makeSymbol("BAG-STRUCT-REPEAT-SIZE");
  public static final SubLSymbol $sym14$_CSETF_BAG_STRUCT_REPEAT_SIZE = makeSymbol("_CSETF-BAG-STRUCT-REPEAT-SIZE");
  public static final SubLSymbol $sym15$BAG_STRUCT_TEST = makeSymbol("BAG-STRUCT-TEST");
  public static final SubLSymbol $sym16$_CSETF_BAG_STRUCT_TEST = makeSymbol("_CSETF-BAG-STRUCT-TEST");
  public static final SubLSymbol $kw17$UNIQUE_CONTENTS = makeKeyword("UNIQUE-CONTENTS");
  public static final SubLSymbol $kw18$REPEAT_CONTENTS = makeKeyword("REPEAT-CONTENTS");
  public static final SubLSymbol $kw19$REPEAT_SIZE = makeKeyword("REPEAT-SIZE");
  public static final SubLSymbol $kw20$TEST = makeKeyword("TEST");
  public static final SubLString $str21$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str22$__ = makeString("#<");
  public static final SubLSymbol $kw23$STREAM = makeKeyword("STREAM");
  public static final SubLString $str24$_ = makeString("(");
  public static final SubLString $str25$_impl_ = makeString(" impl ");
  public static final SubLString $str26$__ = makeString("//");
  public static final SubLString $str27$_ = makeString(")");
  public static final SubLString $str28$_size_ = makeString(" size=");
  public static final SubLSymbol $kw29$BASE = makeKeyword("BASE");
  public static final SubLList $list30 = list(list(makeSymbol("ELEMENT-VAR"), makeSymbol("ELEMENT-COUNT"), makeSymbol("BAG-REPEAT-CONTENTS"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list31 = list(makeKeyword("DONE"));
  public static final SubLSymbol $kw32$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw33$DONE = makeKeyword("DONE");
  public static final SubLSymbol $sym34$DO_DICTIONARY_CONTENTS = makeSymbol("DO-DICTIONARY-CONTENTS");
  public static final SubLList $list35 = list(list(makeSymbol("ELEMENT-VAR"), makeSymbol("BAG-REPEAT-CONTENTS"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym36$CURR_ELEMENT = makeUninternedSymbol("CURR-ELEMENT");
  public static final SubLSymbol $sym37$ELEMENT_COUNT = makeUninternedSymbol("ELEMENT-COUNT");
  public static final SubLSymbol $sym38$INDEX = makeUninternedSymbol("INDEX");
  public static final SubLSymbol $sym39$DO_BAG_REPEAT_CONTENTS_UNIQUE = makeSymbol("DO-BAG-REPEAT-CONTENTS-UNIQUE");
  public static final SubLSymbol $sym40$CDOTIMES = makeSymbol("CDOTIMES");
  public static final SubLSymbol $sym41$CLET = makeSymbol("CLET");
  public static final SubLList $list42 = list(makeSymbol("TIMES"), makeSymbol("ELEMENT"), makeSymbol("CONTENTS-ITERATOR"));
  public static final SubLSymbol $kw43$UNINITIALIZED = makeKeyword("UNINITIALIZED");
  public static final SubLList $list44 = list(makeSymbol("KEY"), makeSymbol("VALUE"));
  public static final SubLSymbol $sym45$ITERATE_BAG_NEXT = makeSymbol("ITERATE-BAG-NEXT");
  public static final SubLSymbol $sym46$ITERATE_BAG_DONE = makeSymbol("ITERATE-BAG-DONE");
  public static final SubLList $list47 = list(list(makeSymbol("ELEMENT-VAR"), makeSymbol("BAG-UNIQUE-CONTENTS"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym48$DO_SET_CONTENTS = makeSymbol("DO-SET-CONTENTS");
  public static final SubLSymbol $sym49$VALID_HASH_TEST_P = makeSymbol("VALID-HASH-TEST-P");
  public static final SubLSymbol $sym50$INTEGERP = makeSymbol("INTEGERP");
  public static final SubLSymbol $sym51$LISTP = makeSymbol("LISTP");
  public static final SubLList $list52 = list(list(makeSymbol("ELEMENT-VAR"), makeSymbol("ELEMENT-COUNT"), makeSymbol("BAG"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym53$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $sym54$DO_BAG_REPEAT_INTERNAL = makeSymbol("DO-BAG-REPEAT-INTERNAL");
  public static final SubLSymbol $sym55$PUNLESS = makeSymbol("PUNLESS");
  public static final SubLList $list56 = list(ONE_INTEGER);
  public static final SubLSymbol $sym57$DO_BAG_UNIQUE_CONTENTS = makeSymbol("DO-BAG-UNIQUE-CONTENTS");
  public static final SubLSymbol $sym58$DO_BAG_UNIQUE_INTERNAL = makeSymbol("DO-BAG-UNIQUE-INTERNAL");
  public static final SubLList $list59 = list(list(makeSymbol("ELEMENT-VAR"), makeSymbol("BAG"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym60$CURRENT_ELEMENT = makeUninternedSymbol("CURRENT-ELEMENT");
  public static final SubLSymbol $sym61$INDEX = makeUninternedSymbol("INDEX");
  public static final SubLSymbol $sym62$ELEMENT_COUNT = makeUninternedSymbol("ELEMENT-COUNT");
  public static final SubLSymbol $sym63$DO_BAG_UNIQUE = makeSymbol("DO-BAG-UNIQUE");
  public static final SubLInteger $int64$62 = makeInteger(62);
  public static final SubLSymbol $sym65$CFASL_INPUT_BAG = makeSymbol("CFASL-INPUT-BAG");
  public static final SubLSymbol $sym66$CFASL_OUTPUT_OBJECT_BAG_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-BAG-METHOD");
  public static final SubLString $str67$CFASL_loaded_bag__A_does_not_have = makeString("CFASL-loaded bag ~A does not have the needed number of unique elements ~A.");
  public static final SubLString $str68$CFASL_loaded_bag__A_has_more_than = makeString("CFASL-loaded bag ~A has more than the expected unumber of unique elements ~A.");
  public static final SubLString $str69$CFASL_loaded_bag__A_does_not_repr = makeString("CFASL-loaded bag ~A does not represent the expected number of total elements ~A.");
  public static final SubLSymbol $sym70$BAG_UNIT_TEST_KITCHEN_SINK = makeSymbol("BAG-UNIT-TEST-KITCHEN-SINK");
  public static final SubLSymbol $kw71$OWNER = makeKeyword("OWNER");
  public static final SubLSymbol $kw72$CLASSES = makeKeyword("CLASSES");
  public static final SubLSymbol $kw73$KB = makeKeyword("KB");
  public static final SubLSymbol $kw74$TINY = makeKeyword("TINY");
  public static final SubLSymbol $kw75$WORKING_ = makeKeyword("WORKING?");
  public static final SubLList $list76 = list(list(list(list(makeKeyword("RED"), makeKeyword("BLUE"), makeKeyword("GREEN"), makeKeyword("YELLOW"), makeKeyword("WHITE"), makeKeyword("BROWN"), makeKeyword("BLACK")), TEN_INTEGER), makeKeyword("SUCCESS")), list(list(list(makeKeyword("RED"), makeKeyword("BLUE"), makeKeyword("GREEN"), makeKeyword("YELLOW"), makeKeyword("WHITE"), makeKeyword("BROWN"), makeKeyword("BLACK")), ONE_INTEGER), makeKeyword("SUCCESS")));
  public static final SubLString $str77$bag_not_empty = makeString("bag not empty");
  public static final SubLString $str78$bag_size____item_count = makeString("bag size != item count");
  public static final SubLString $str79$bag_member_count_out_of_whack = makeString("bag member-count out of whack");
  public static final SubLString $str80$added_bag_members_not_findable = makeString("added bag members not findable");
  public static final SubLString $str81$cannot_find_existing_member_again = makeString("cannot find existing member again");
  public static final SubLString $str82$do_bag_existing_element_not_there = makeString("do-bag existing element not there often enough");
  public static final SubLString $str83$do_list_existing_element_not_ther = makeString("do-list existing element not there often enough");
  public static final SubLString $str84$iterator_existing_element_not_the = makeString("iterator existing element not there often enough");
  public static final SubLString $str85$unique_element_list_wrong = makeString("unique element list wrong");
  public static final SubLList $list86 = cons(makeSymbol("ELEMENT"), makeSymbol("ELEMENT-COUNT"));
  public static final SubLString $str87$bag_element_count_tuple_contains_ = makeString("bag-element-count tuple contains bad element");
  public static final SubLString $str88$bag_element_count_tuple_contains_ = makeString("bag-element-count tuple contains bad count");
  public static final SubLString $str89$list_of_elements_has_bogus_length = makeString("list of elements has bogus length");
  public static final SubLString $str90$CFASLed_bag_has_different_size_ = makeString("CFASLed bag has different size.");
  public static final SubLString $str91$CFASLed_bag_has_different_unique_ = makeString("CFASLed bag has different unique size.");
  public static final SubLString $str92$CFASLed_bag_does_not_contain_elem = makeString("CFASLed bag does not contain element.");
  public static final SubLString $str93$CFASLed_bag_does_not_contain_elem = makeString("CFASLed bag does not contain element as often.");
  public static final SubLString $str94$removing_items_whacks_bag_size = makeString("removing items whacks bag-size");
  public static final SubLString $str95$removing_items_whacks_member_coun = makeString("removing items whacks member count");
  public static final SubLString $str96$emptied_bag_is_not_empty = makeString("emptied bag is not empty");
  public static final SubLSymbol $kw97$SUCCESS = makeKeyword("SUCCESS");

  //// Initializers

  @Override
  public void declareFunctions() {
    declare_bag_file();
  }

  @Override
  public void initializeVariables() {
    init_bag_file();
  }

  @Override
  public void runTopLevelForms() {
    setup_bag_file();
  }

}
