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
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.cache;
//dm import com.cyc.cycjava_1.cycl.cfasl;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.dictionary;
//dm import com.cyc.cycjava_1.cycl.dictionary_contents;
//dm import com.cyc.cycjava_1.cycl.file_utilities;
//dm import com.cyc.cycjava_1.cycl.format_nil;
// //dm import com.cyc.cycjava_1.cycl.cyc_testing.generic_testing;
//dm import com.cyc.cycjava_1.cycl.iteration;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.map_utilities;
//dm import com.cyc.cycjava_1.cycl.meta_macros;
//dm import com.cyc.cycjava_1.cycl.number_utilities;
//dm import com.cyc.cycjava_1.cycl.queues;
//dm import com.cyc.cycjava_1.cycl.string_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class file_hash_table extends SubLTranslatedFile {

  //// Constructor

  private file_hash_table() {}
  public static final SubLFile me = new file_hash_table();
  public static final String myName = "com.cyc.cycjava_1.cycl.file_hash_table";

  //// Definitions

  public static final class $file_hash_table_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $stream; }
    public SubLObject getField3() { return $header; }
    public SubLObject getField4() { return $lock; }
    public SubLObject getField5() { return $encoding_input_fn; }
    public SubLObject getField6() { return $encoding_output_fn; }
    public SubLObject getField7() { return $encoding_size_fn; }
    public SubLObject getField8() { return $encoding_key_input_fn; }
    public SubLObject getField9() { return $encoding_key_output_fn; }
    public SubLObject getField10() { return $testfn; }
    public SubLObject getField11() { return $hash_fn; }
    public SubLObject getField12() { return $input_cache; }
    public SubLObject getField13() { return $output_cache; }
    public SubLObject getField14() { return $property_list; }
    public SubLObject setField2(SubLObject value) { return $stream = value; }
    public SubLObject setField3(SubLObject value) { return $header = value; }
    public SubLObject setField4(SubLObject value) { return $lock = value; }
    public SubLObject setField5(SubLObject value) { return $encoding_input_fn = value; }
    public SubLObject setField6(SubLObject value) { return $encoding_output_fn = value; }
    public SubLObject setField7(SubLObject value) { return $encoding_size_fn = value; }
    public SubLObject setField8(SubLObject value) { return $encoding_key_input_fn = value; }
    public SubLObject setField9(SubLObject value) { return $encoding_key_output_fn = value; }
    public SubLObject setField10(SubLObject value) { return $testfn = value; }
    public SubLObject setField11(SubLObject value) { return $hash_fn = value; }
    public SubLObject setField12(SubLObject value) { return $input_cache = value; }
    public SubLObject setField13(SubLObject value) { return $output_cache = value; }
    public SubLObject setField14(SubLObject value) { return $property_list = value; }
    public SubLObject $stream = NIL;
    public SubLObject $header = NIL;
    public SubLObject $lock = NIL;
    public SubLObject $encoding_input_fn = NIL;
    public SubLObject $encoding_output_fn = NIL;
    public SubLObject $encoding_size_fn = NIL;
    public SubLObject $encoding_key_input_fn = NIL;
    public SubLObject $encoding_key_output_fn = NIL;
    public SubLObject $testfn = NIL;
    public SubLObject $hash_fn = NIL;
    public SubLObject $input_cache = NIL;
    public SubLObject $output_cache = NIL;
    public SubLObject $property_list = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($file_hash_table_native.class, $sym0$FILE_HASH_TABLE, $sym1$FILE_HASH_TABLE_P, $list2, $list3, new String[] {"$stream", "$header", "$lock", "$encoding_input_fn", "$encoding_output_fn", "$encoding_size_fn", "$encoding_key_input_fn", "$encoding_key_output_fn", "$testfn", "$hash_fn", "$input_cache", "$output_cache", "$property_list"}, $list4, $list5, $sym6$DEFAULT_STRUCT_PRINT_FUNCTION);
  }

  @SubL(source = "cycl/file-hash-table.lisp", position = 1414) 
  public static SubLSymbol $dtp_file_hash_table$ = null;

  @SubL(source = "cycl/file-hash-table.lisp", position = 1414) 
  public static final SubLObject file_hash_table_print_function_trampoline(SubLObject object, SubLObject stream) {
    compatibility.default_struct_print_function(object, stream, ZERO_INTEGER);
    return NIL;
  }

  public static final class $file_hash_table_p$UnaryFunction extends UnaryFunction {
    public $file_hash_table_p$UnaryFunction() { super(extractFunctionNamed("FILE-HASH-TABLE-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10014"); }
  }

  public static final class $htfile_header_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $size; }
    public SubLObject getField3() { return $version_major; }
    public SubLObject getField4() { return $version_minor; }
    public SubLObject getField5() { return $object_space_offset; }
    public SubLObject getField6() { return $key_space_offset; }
    public SubLObject getField7() { return $current_heap_top; }
    public SubLObject getField8() { return $item_count; }
    public SubLObject getField9() { return $capacity; }
    public SubLObject getField10() { return $free_list_head; }
    public SubLObject getField11() { return $deletion_count; }
    public SubLObject getField12() { return $header_crc; }
    public SubLObject getField13() { return $extension_space_size; }
    public SubLObject getField14() { return $extension_space; }
    public SubLObject setField2(SubLObject value) { return $size = value; }
    public SubLObject setField3(SubLObject value) { return $version_major = value; }
    public SubLObject setField4(SubLObject value) { return $version_minor = value; }
    public SubLObject setField5(SubLObject value) { return $object_space_offset = value; }
    public SubLObject setField6(SubLObject value) { return $key_space_offset = value; }
    public SubLObject setField7(SubLObject value) { return $current_heap_top = value; }
    public SubLObject setField8(SubLObject value) { return $item_count = value; }
    public SubLObject setField9(SubLObject value) { return $capacity = value; }
    public SubLObject setField10(SubLObject value) { return $free_list_head = value; }
    public SubLObject setField11(SubLObject value) { return $deletion_count = value; }
    public SubLObject setField12(SubLObject value) { return $header_crc = value; }
    public SubLObject setField13(SubLObject value) { return $extension_space_size = value; }
    public SubLObject setField14(SubLObject value) { return $extension_space = value; }
    public SubLObject $size = NIL;
    public SubLObject $version_major = NIL;
    public SubLObject $version_minor = NIL;
    public SubLObject $object_space_offset = NIL;
    public SubLObject $key_space_offset = NIL;
    public SubLObject $current_heap_top = NIL;
    public SubLObject $item_count = NIL;
    public SubLObject $capacity = NIL;
    public SubLObject $free_list_head = NIL;
    public SubLObject $deletion_count = NIL;
    public SubLObject $header_crc = NIL;
    public SubLObject $extension_space_size = NIL;
    public SubLObject $extension_space = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($htfile_header_native.class, $sym55$HTFILE_HEADER, $sym56$HTFILE_HEADER_P, $list57, $list58, new String[] {"$size", "$version_major", "$version_minor", "$object_space_offset", "$key_space_offset", "$current_heap_top", "$item_count", "$capacity", "$free_list_head", "$deletion_count", "$header_crc", "$extension_space_size", "$extension_space"}, $list59, $list60, $sym6$DEFAULT_STRUCT_PRINT_FUNCTION);
  }

  @SubL(source = "cycl/file-hash-table.lisp", position = 4411) 
  public static SubLSymbol $dtp_htfile_header$ = null;

  @SubL(source = "cycl/file-hash-table.lisp", position = 4411) 
  public static final SubLObject htfile_header_print_function_trampoline(SubLObject object, SubLObject stream) {
    compatibility.default_struct_print_function(object, stream, ZERO_INTEGER);
    return NIL;
  }

  public static final class $htfile_header_p$UnaryFunction extends UnaryFunction {
    public $htfile_header_p$UnaryFunction() { super(extractFunctionNamed("HTFILE-HEADER-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10087"); }
  }

  public static final class $htfile_object_entry_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $size; }
    public SubLObject getField3() { return $type; }
    public SubLObject getField4() { return $key_size; }
    public SubLObject getField5() { return $key; }
    public SubLObject getField6() { return $data_size; }
    public SubLObject getField7() { return $data; }
    public SubLObject setField2(SubLObject value) { return $size = value; }
    public SubLObject setField3(SubLObject value) { return $type = value; }
    public SubLObject setField4(SubLObject value) { return $key_size = value; }
    public SubLObject setField5(SubLObject value) { return $key = value; }
    public SubLObject setField6(SubLObject value) { return $data_size = value; }
    public SubLObject setField7(SubLObject value) { return $data = value; }
    public SubLObject $size = NIL;
    public SubLObject $type = NIL;
    public SubLObject $key_size = NIL;
    public SubLObject $key = NIL;
    public SubLObject $data_size = NIL;
    public SubLObject $data = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($htfile_object_entry_native.class, $sym112$HTFILE_OBJECT_ENTRY, $sym113$HTFILE_OBJECT_ENTRY_P, $list114, $list115, new String[] {"$size", "$type", "$key_size", "$key", "$data_size", "$data"}, $list116, $list117, $sym6$DEFAULT_STRUCT_PRINT_FUNCTION);
  }

  @SubL(source = "cycl/file-hash-table.lisp", position = 6347) 
  public static SubLSymbol $dtp_htfile_object_entry$ = null;

  @SubL(source = "cycl/file-hash-table.lisp", position = 6347) 
  public static final SubLObject htfile_object_entry_print_function_trampoline(SubLObject object, SubLObject stream) {
    compatibility.default_struct_print_function(object, stream, ZERO_INTEGER);
    return NIL;
  }

  public static final class $htfile_object_entry_p$UnaryFunction extends UnaryFunction {
    public $htfile_object_entry_p$UnaryFunction() { super(extractFunctionNamed("HTFILE-OBJECT-ENTRY-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10117"); }
  }

  public static final class $htfile_key_entry_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $key_offset; }
    public SubLObject getField3() { return $hash_code; }
    public SubLObject setField2(SubLObject value) { return $key_offset = value; }
    public SubLObject setField3(SubLObject value) { return $hash_code = value; }
    public SubLObject $key_offset = NIL;
    public SubLObject $hash_code = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($htfile_key_entry_native.class, $sym136$HTFILE_KEY_ENTRY, $sym137$HTFILE_KEY_ENTRY_P, $list138, $list139, new String[] {"$key_offset", "$hash_code"}, $list140, $list141, $sym6$DEFAULT_STRUCT_PRINT_FUNCTION);
  }

  @SubL(source = "cycl/file-hash-table.lisp", position = 6444) 
  public static SubLSymbol $dtp_htfile_key_entry$ = null;

  @SubL(source = "cycl/file-hash-table.lisp", position = 6444) 
  public static final SubLObject htfile_key_entry_print_function_trampoline(SubLObject object, SubLObject stream) {
    compatibility.default_struct_print_function(object, stream, ZERO_INTEGER);
    return NIL;
  }

  public static final class $htfile_key_entry_p$UnaryFunction extends UnaryFunction {
    public $htfile_key_entry_p$UnaryFunction() { super(extractFunctionNamed("HTFILE-KEY-ENTRY-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10107"); }
  }

  @SubL(source = "cycl/file-hash-table.lisp", position = 6444) 
  public static final SubLObject _csetf_htfile_key_entry_key_offset(SubLObject object, SubLObject value) {
    checkType(object, $sym137$HTFILE_KEY_ENTRY_P);
    return object.setField2(value);
  }

  @SubL(source = "cycl/file-hash-table.lisp", position = 6444) 
  public static final SubLObject _csetf_htfile_key_entry_hash_code(SubLObject object, SubLObject value) {
    checkType(object, $sym137$HTFILE_KEY_ENTRY_P);
    return object.setField3(value);
  }

  @SubL(source = "cycl/file-hash-table.lisp", position = 6444) 
  public static final SubLObject make_htfile_key_entry(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $htfile_key_entry_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw147$KEY_OFFSET)) {
            _csetf_htfile_key_entry_key_offset(v_new, current_value);
          } else if (pcase_var.eql($kw148$HASH_CODE)) {
            _csetf_htfile_key_entry_hash_code(v_new, current_value);
          } else {
            Errors.error($str47$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  @SubL(source = "cycl/file-hash-table.lisp", position = 6563) 
  public static SubLSymbol $default_fht_test_function$ = null;

  @SubL(source = "cycl/file-hash-table.lisp", position = 7045) 
  public static SubLSymbol $default_fht_serialization_protocol$ = null;

  /** The minimum cache size of a file hashtable */
  @SubL(source = "cycl/file-hash-table.lisp", position = 7325) 
  public static SubLSymbol $fht_min_cache_capacity$ = null;

  /** The percentage of file hashtable entries to be cached */
  @SubL(source = "cycl/file-hash-table.lisp", position = 7431) 
  public static SubLSymbol $fht_cache_percentage$ = null;

  @SubL(source = "cycl/file-hash-table.lisp", position = 7540) 
  private static SubLSymbol $htfile_header_current_vmajor$ = null;

  @SubL(source = "cycl/file-hash-table.lisp", position = 7710) 
  private static SubLSymbol $htfile_header_current_vminor$ = null;

  @SubL(source = "cycl/file-hash-table.lisp", position = 8025) 
  private static SubLSymbol $htfile_header_current_size$ = null;

  @SubL(source = "cycl/file-hash-table.lisp", position = 8080) 
  public static SubLSymbol $htfile_default_expected_items$ = null;

  @SubL(source = "cycl/file-hash-table.lisp", position = 8140) 
  public static SubLSymbol $htfile_default_average_size$ = null;

  @SubL(source = "cycl/file-hash-table.lisp", position = 11995) 
  private static SubLSymbol $fht_empty_offset_marker$ = null;

  @SubL(source = "cycl/file-hash-table.lisp", position = 12100) 
  private static SubLSymbol $fht_tombstone_offset_marker$ = null;

  @SubL(source = "cycl/file-hash-table.lisp", position = 12154) 
  private static SubLSymbol $fht_invalid_hash_code$ = null;

  @SubL(source = "cycl/file-hash-table.lisp", position = 12202) 
  public static final SubLObject new_htfile_key_entry(SubLObject code, SubLObject offset) {
    if ((offset == UNPROVIDED)) {
      offset = ZERO_INTEGER;
    }
    {
      SubLObject entry = make_htfile_key_entry(UNPROVIDED);
      _csetf_htfile_key_entry_key_offset(entry, offset);
      _csetf_htfile_key_entry_hash_code(entry, code);
      return entry;
    }
  }

  @SubL(source = "cycl/file-hash-table.lisp", position = 12436) 
  public static final SubLObject construct_tombstone_key_entry() {
    return new_htfile_key_entry($fht_invalid_hash_code$.getGlobalValue(), $fht_tombstone_offset_marker$.getGlobalValue());
  }

  @SubL(source = "cycl/file-hash-table.lisp", position = 12572) 
  private static SubLSymbol $fht_tombstone_key_entry$ = null;

  @SubL(source = "cycl/file-hash-table.lisp", position = 12752) 
  public static final SubLObject construct_empty_key_entry() {
    return new_htfile_key_entry($fht_invalid_hash_code$.getGlobalValue(), $fht_empty_offset_marker$.getGlobalValue());
  }

  @SubL(source = "cycl/file-hash-table.lisp", position = 12880) 
  private static SubLSymbol $fht_empty_key_entry$ = null;

  public static final class $fht_serialization_entry_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $encoding_input_fn; }
    public SubLObject getField3() { return $encoding_output_fn; }
    public SubLObject getField4() { return $encoding_size_fn; }
    public SubLObject getField5() { return $hash_fn; }
    public SubLObject getField6() { return $encoding_key_input_fn; }
    public SubLObject getField7() { return $encoding_key_output_fn; }
    public SubLObject setField2(SubLObject value) { return $encoding_input_fn = value; }
    public SubLObject setField3(SubLObject value) { return $encoding_output_fn = value; }
    public SubLObject setField4(SubLObject value) { return $encoding_size_fn = value; }
    public SubLObject setField5(SubLObject value) { return $hash_fn = value; }
    public SubLObject setField6(SubLObject value) { return $encoding_key_input_fn = value; }
    public SubLObject setField7(SubLObject value) { return $encoding_key_output_fn = value; }
    public SubLObject $encoding_input_fn = NIL;
    public SubLObject $encoding_output_fn = NIL;
    public SubLObject $encoding_size_fn = NIL;
    public SubLObject $hash_fn = NIL;
    public SubLObject $encoding_key_input_fn = NIL;
    public SubLObject $encoding_key_output_fn = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($fht_serialization_entry_native.class, $sym155$FHT_SERIALIZATION_ENTRY, $sym156$FHT_SERIALIZATION_ENTRY_P, $list157, $list158, new String[] {"$encoding_input_fn", "$encoding_output_fn", "$encoding_size_fn", "$hash_fn", "$encoding_key_input_fn", "$encoding_key_output_fn"}, $list159, $list160, $sym161$PRINT_FHT_SERIALIZATION_ENTRY);
  }

  @SubL(source = "cycl/file-hash-table.lisp", position = 14410) 
  public static SubLSymbol $dtp_fht_serialization_entry$ = null;

  @SubL(source = "cycl/file-hash-table.lisp", position = 14410) 
  public static final SubLObject fht_serialization_entry_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10154");
    return NIL;
  }

  public static final class $fht_serialization_entry_p$UnaryFunction extends UnaryFunction {
    public $fht_serialization_entry_p$UnaryFunction() { super(extractFunctionNamed("FHT-SERIALIZATION-ENTRY-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9958"); }
  }

  @SubL(source = "cycl/file-hash-table.lisp", position = 14410) 
  public static final SubLObject _csetf_fht_se_encoding_input_fn(SubLObject object, SubLObject value) {
    checkType(object, $sym156$FHT_SERIALIZATION_ENTRY_P);
    return object.setField2(value);
  }

  @SubL(source = "cycl/file-hash-table.lisp", position = 14410) 
  public static final SubLObject _csetf_fht_se_encoding_output_fn(SubLObject object, SubLObject value) {
    checkType(object, $sym156$FHT_SERIALIZATION_ENTRY_P);
    return object.setField3(value);
  }

  @SubL(source = "cycl/file-hash-table.lisp", position = 14410) 
  public static final SubLObject _csetf_fht_se_encoding_size_fn(SubLObject object, SubLObject value) {
    checkType(object, $sym156$FHT_SERIALIZATION_ENTRY_P);
    return object.setField4(value);
  }

  @SubL(source = "cycl/file-hash-table.lisp", position = 14410) 
  public static final SubLObject _csetf_fht_se_hash_fn(SubLObject object, SubLObject value) {
    checkType(object, $sym156$FHT_SERIALIZATION_ENTRY_P);
    return object.setField5(value);
  }

  @SubL(source = "cycl/file-hash-table.lisp", position = 14410) 
  public static final SubLObject _csetf_fht_se_encoding_key_input_fn(SubLObject object, SubLObject value) {
    checkType(object, $sym156$FHT_SERIALIZATION_ENTRY_P);
    return object.setField6(value);
  }

  @SubL(source = "cycl/file-hash-table.lisp", position = 14410) 
  public static final SubLObject _csetf_fht_se_encoding_key_output_fn(SubLObject object, SubLObject value) {
    checkType(object, $sym156$FHT_SERIALIZATION_ENTRY_P);
    return object.setField7(value);
  }

  @SubL(source = "cycl/file-hash-table.lisp", position = 14410) 
  public static final SubLObject make_fht_serialization_entry(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $fht_serialization_entry_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw37$ENCODING_INPUT_FN)) {
            _csetf_fht_se_encoding_input_fn(v_new, current_value);
          } else if (pcase_var.eql($kw38$ENCODING_OUTPUT_FN)) {
            _csetf_fht_se_encoding_output_fn(v_new, current_value);
          } else if (pcase_var.eql($kw39$ENCODING_SIZE_FN)) {
            _csetf_fht_se_encoding_size_fn(v_new, current_value);
          } else if (pcase_var.eql($kw43$HASH_FN)) {
            _csetf_fht_se_hash_fn(v_new, current_value);
          } else if (pcase_var.eql($kw40$ENCODING_KEY_INPUT_FN)) {
            _csetf_fht_se_encoding_key_input_fn(v_new, current_value);
          } else if (pcase_var.eql($kw41$ENCODING_KEY_OUTPUT_FN)) {
            _csetf_fht_se_encoding_key_output_fn(v_new, current_value);
          } else {
            Errors.error($str47$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  @SubL(source = "cycl/file-hash-table.lisp", position = 15785) 
  public static final SubLObject new_fht_serialization_entry(SubLObject plist) {
    {
      SubLObject serialization_entry = make_fht_serialization_entry(UNPROVIDED);
      SubLObject input_fn = conses_high.getf(plist, $kw37$ENCODING_INPUT_FN, UNPROVIDED);
      SubLObject output_fn = conses_high.getf(plist, $kw38$ENCODING_OUTPUT_FN, UNPROVIDED);
      SubLObject size_fn = conses_high.getf(plist, $kw39$ENCODING_SIZE_FN, UNPROVIDED);
      SubLObject hash_fn = conses_high.getf(plist, $kw43$HASH_FN, UNPROVIDED);
      SubLObject key_input_fn = conses_high.getf(plist, $kw40$ENCODING_KEY_INPUT_FN, IDENTITY);
      SubLObject key_output_fn = conses_high.getf(plist, $kw41$ENCODING_KEY_OUTPUT_FN, IDENTITY);
      _csetf_fht_se_encoding_input_fn(serialization_entry, input_fn);
      _csetf_fht_se_encoding_output_fn(serialization_entry, output_fn);
      _csetf_fht_se_encoding_size_fn(serialization_entry, size_fn);
      _csetf_fht_se_hash_fn(serialization_entry, hash_fn);
      _csetf_fht_se_encoding_key_input_fn(serialization_entry, key_input_fn);
      _csetf_fht_se_encoding_key_output_fn(serialization_entry, key_output_fn);
      return serialization_entry;
    }
  }

  @SubL(source = "cycl/file-hash-table.lisp", position = 16659) 
  private static SubLSymbol $fht_serialization_table$ = null;

  @SubL(source = "cycl/file-hash-table.lisp", position = 16724) 
  public static final SubLObject register_fht_serialization_entry(SubLObject serialization, SubLObject plist) {
    {
      SubLObject serialization_entry = new_fht_serialization_entry(plist);
      dictionary.dictionary_enter($fht_serialization_table$.getGlobalValue(), serialization, serialization_entry);
      return serialization_entry;
    }
  }

  @SubL(source = "cycl/file-hash-table.lisp", position = 25465) 
  private static SubLSymbol $fht_not_found$ = null;

  @SubL(source = "cycl/file-hash-table.lisp", position = 25543) 
  private static SubLSymbol $not_in_fht$ = null;

  /** When set to T, we are in fast put mode, i.e. doing serial insertion, and constantly
   flushing the buffers is seriously slowing us down. */
  @SubL(source = "cycl/file-hash-table.lisp", position = 44299) 
  private static SubLSymbol $fast_put_skip_output_forcing$ = null;

  @SubL(source = "cycl/file-hash-table.lisp", position = 52993) 
  private static SubLSymbol $htfile_minimal_file_block_size$ = null;

  public static final class $htfile_file_block_entry_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $size; }
    public SubLObject getField3() { return $next; }
    public SubLObject setField2(SubLObject value) { return $size = value; }
    public SubLObject setField3(SubLObject value) { return $next = value; }
    public SubLObject $size = NIL;
    public SubLObject $next = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($htfile_file_block_entry_native.class, $sym285$HTFILE_FILE_BLOCK_ENTRY, $sym286$HTFILE_FILE_BLOCK_ENTRY_P, $list287, $list288, new String[] {"$size", "$next"}, $list289, $list290, $sym291$PRINT_HTFILE_FILE_BLOCK_ENTRY);
  }

  @SubL(source = "cycl/file-hash-table.lisp", position = 53177) 
  public static SubLSymbol $dtp_htfile_file_block_entry$ = null;

  @SubL(source = "cycl/file-hash-table.lisp", position = 53177) 
  public static final SubLObject htfile_file_block_entry_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10155");
    return NIL;
  }

  public static final class $htfile_file_block_entry_p$UnaryFunction extends UnaryFunction {
    public $htfile_file_block_entry_p$UnaryFunction() { super(extractFunctionNamed("HTFILE-FILE-BLOCK-ENTRY-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10054"); }
  }

  @SubL(source = "cycl/file-hash-table.lisp", position = 64842) 
  private static SubLSymbol $htfile_key_entry_size$ = null;

  @SubL(source = "cycl/file-hash-table.lisp", position = 68104) 
  private static SubLSymbol $fht_hash_constant_a$ = null;

  @SubL(source = "cycl/file-hash-table.lisp", position = 68209) 
  private static SubLSymbol $fht_hash_step_size$ = null;

  @SubL(source = "cycl/file-hash-table.lisp", position = 68255) 
  private static SubLSymbol $fht_hash_next_step_pow2$ = null;

  @SubL(source = "cycl/file-hash-table.lisp", position = 72183) 
  private static SubLSymbol $fht_dknuths_magic_cutoff$ = null;

  @SubL(source = "cycl/file-hash-table.lisp", position = 73313) 
  private static SubLSymbol $keyspace_move_size$ = null;

  @SubL(source = "cycl/file-hash-table.lisp", position = 74282) 
  private static SubLSymbol $keyspace_rehash_cache_size$ = null;

  @SubL(source = "cycl/file-hash-table.lisp", position = 77352) 
  private static SubLSymbol $htfile_object_entry_size$ = null;

  @SubL(source = "cycl/file-hash-table.lisp", position = 84379) 
  public static SubLSymbol $file_hash_table_header_position$ = null;

  @SubL(source = "cycl/file-hash-table.lisp", position = 84497) 
  private static SubLSymbol $file_hash_table_headers$ = null;

  @SubL(source = "cycl/file-hash-table.lisp", position = 88299) 
  public static final SubLObject read_fht_uint4(SubLObject stream) {
    {
      SubLObject byte4 = streams_high.read_byte(stream, UNPROVIDED, UNPROVIDED);
      SubLObject byte3 = streams_high.read_byte(stream, UNPROVIDED, UNPROVIDED);
      SubLObject byte2 = streams_high.read_byte(stream, UNPROVIDED, UNPROVIDED);
      SubLObject byte1 = streams_high.read_byte(stream, UNPROVIDED, UNPROVIDED);
      return cfasl.assemble_4_fixnums_to_non_negative_integer(byte1, byte2, byte3, byte4);
    }
  }

  /** Which optimization mode we want to employ. There is :conservative,
   :moderate and :aggressive */
  @SubL(source = "cycl/file-hash-table.lisp", position = 92045) 
  public static SubLSymbol $fast_file_hash_table_optimization_mode$ = null;

  public static final class $fast_create_fht_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $fht; }
    public SubLObject getField3() { return $tempstem; }
    public SubLObject getField4() { return $tempfile; }
    public SubLObject getField5() { return $keystream; }
    public SubLObject setField2(SubLObject value) { return $fht = value; }
    public SubLObject setField3(SubLObject value) { return $tempstem = value; }
    public SubLObject setField4(SubLObject value) { return $tempfile = value; }
    public SubLObject setField5(SubLObject value) { return $keystream = value; }
    public SubLObject $fht = NIL;
    public SubLObject $tempstem = NIL;
    public SubLObject $tempfile = NIL;
    public SubLObject $keystream = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($fast_create_fht_native.class, $sym335$FAST_CREATE_FHT, $sym336$FAST_CREATE_FHT_P, $list337, $list338, new String[] {"$fht", "$tempstem", "$tempfile", "$keystream"}, $list339, $list340, $sym6$DEFAULT_STRUCT_PRINT_FUNCTION);
  }

  @SubL(source = "cycl/file-hash-table.lisp", position = 93423) 
  public static SubLSymbol $dtp_fast_create_fht$ = null;

  @SubL(source = "cycl/file-hash-table.lisp", position = 93423) 
  public static final SubLObject fast_create_fht_print_function_trampoline(SubLObject object, SubLObject stream) {
    compatibility.default_struct_print_function(object, stream, ZERO_INTEGER);
    return NIL;
  }

  public static final class $fast_create_fht_p$UnaryFunction extends UnaryFunction {
    public $fast_create_fht_p$UnaryFunction() { super(extractFunctionNamed("FAST-CREATE-FHT-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9856"); }
  }

  @SubL(source = "cycl/file-hash-table.lisp", position = 97398) 
  public static SubLSymbol $fast_fht_keyspace_alignment$ = null;

  public static final class $fast_fht_keystream_sorter_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $tempstem; }
    public SubLObject getField3() { return $in_files; }
    public SubLObject getField4() { return $out_files; }
    public SubLObject setField2(SubLObject value) { return $tempstem = value; }
    public SubLObject setField3(SubLObject value) { return $in_files = value; }
    public SubLObject setField4(SubLObject value) { return $out_files = value; }
    public SubLObject $tempstem = NIL;
    public SubLObject $in_files = NIL;
    public SubLObject $out_files = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($fast_fht_keystream_sorter_native.class, $sym369$FAST_FHT_KEYSTREAM_SORTER, $sym370$FAST_FHT_KEYSTREAM_SORTER_P, $list371, $list372, new String[] {"$tempstem", "$in_files", "$out_files"}, $list373, $list374, $sym6$DEFAULT_STRUCT_PRINT_FUNCTION);
  }

  @SubL(source = "cycl/file-hash-table.lisp", position = 104626) 
  public static SubLSymbol $dtp_fast_fht_keystream_sorter$ = null;

  public static final class $fast_fht_keystream_sorter_p$UnaryFunction extends UnaryFunction {
    public $fast_fht_keystream_sorter_p$UnaryFunction() { super(extractFunctionNamed("FAST-FHT-KEYSTREAM-SORTER-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9882"); }
  }

  /** The value written out as a hashcode for the chunk sentinel. */
  @SubL(source = "cycl/file-hash-table.lisp", position = 105921) 
  private static SubLSymbol $fast_fht_sentinel_hashcode_value$ = null;

  /** The value returned for a sentinel hashcode; it is larger than any other value should be. */
  @SubL(source = "cycl/file-hash-table.lisp", position = 106051) 
  private static SubLSymbol $fast_fht_sentinel_index_value$ = null;

  /** Assume 64K of entries. */
  @SubL(source = "cycl/file-hash-table.lisp", position = 106219) 
  public static SubLSymbol $fast_fht_keystream_tile_size_pow2$ = null;

  public static final SubLObject declare_file_hash_table_file() {
    declareFunction(myName, "file_hash_table_print_function_trampoline", "FILE-HASH-TABLE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction(myName, "file_hash_table_p", "FILE-HASH-TABLE-P", 1, 0, false); new $file_hash_table_p$UnaryFunction();
    //declareFunction(myName, "file_hash_table_stream", "FILE-HASH-TABLE-STREAM", 1, 0, false);
    //declareFunction(myName, "file_hash_table_header", "FILE-HASH-TABLE-HEADER", 1, 0, false);
    //declareFunction(myName, "file_hash_table_lock", "FILE-HASH-TABLE-LOCK", 1, 0, false);
    //declareFunction(myName, "file_hash_table_encoding_input_fn", "FILE-HASH-TABLE-ENCODING-INPUT-FN", 1, 0, false);
    //declareFunction(myName, "file_hash_table_encoding_output_fn", "FILE-HASH-TABLE-ENCODING-OUTPUT-FN", 1, 0, false);
    //declareFunction(myName, "file_hash_table_encoding_size_fn", "FILE-HASH-TABLE-ENCODING-SIZE-FN", 1, 0, false);
    //declareFunction(myName, "file_hash_table_encoding_key_input_fn", "FILE-HASH-TABLE-ENCODING-KEY-INPUT-FN", 1, 0, false);
    //declareFunction(myName, "file_hash_table_encoding_key_output_fn", "FILE-HASH-TABLE-ENCODING-KEY-OUTPUT-FN", 1, 0, false);
    //declareFunction(myName, "file_hash_table_testfn", "FILE-HASH-TABLE-TESTFN", 1, 0, false);
    //declareFunction(myName, "file_hash_table_hash_fn", "FILE-HASH-TABLE-HASH-FN", 1, 0, false);
    //declareFunction(myName, "file_hash_table_input_cache", "FILE-HASH-TABLE-INPUT-CACHE", 1, 0, false);
    //declareFunction(myName, "file_hash_table_output_cache", "FILE-HASH-TABLE-OUTPUT-CACHE", 1, 0, false);
    //declareFunction(myName, "file_hash_table_property_list", "FILE-HASH-TABLE-PROPERTY-LIST", 1, 0, false);
    //declareFunction(myName, "_csetf_file_hash_table_stream", "_CSETF-FILE-HASH-TABLE-STREAM", 2, 0, false);
    //declareFunction(myName, "_csetf_file_hash_table_header", "_CSETF-FILE-HASH-TABLE-HEADER", 2, 0, false);
    //declareFunction(myName, "_csetf_file_hash_table_lock", "_CSETF-FILE-HASH-TABLE-LOCK", 2, 0, false);
    //declareFunction(myName, "_csetf_file_hash_table_encoding_input_fn", "_CSETF-FILE-HASH-TABLE-ENCODING-INPUT-FN", 2, 0, false);
    //declareFunction(myName, "_csetf_file_hash_table_encoding_output_fn", "_CSETF-FILE-HASH-TABLE-ENCODING-OUTPUT-FN", 2, 0, false);
    //declareFunction(myName, "_csetf_file_hash_table_encoding_size_fn", "_CSETF-FILE-HASH-TABLE-ENCODING-SIZE-FN", 2, 0, false);
    //declareFunction(myName, "_csetf_file_hash_table_encoding_key_input_fn", "_CSETF-FILE-HASH-TABLE-ENCODING-KEY-INPUT-FN", 2, 0, false);
    //declareFunction(myName, "_csetf_file_hash_table_encoding_key_output_fn", "_CSETF-FILE-HASH-TABLE-ENCODING-KEY-OUTPUT-FN", 2, 0, false);
    //declareFunction(myName, "_csetf_file_hash_table_testfn", "_CSETF-FILE-HASH-TABLE-TESTFN", 2, 0, false);
    //declareFunction(myName, "_csetf_file_hash_table_hash_fn", "_CSETF-FILE-HASH-TABLE-HASH-FN", 2, 0, false);
    //declareFunction(myName, "_csetf_file_hash_table_input_cache", "_CSETF-FILE-HASH-TABLE-INPUT-CACHE", 2, 0, false);
    //declareFunction(myName, "_csetf_file_hash_table_output_cache", "_CSETF-FILE-HASH-TABLE-OUTPUT-CACHE", 2, 0, false);
    //declareFunction(myName, "_csetf_file_hash_table_property_list", "_CSETF-FILE-HASH-TABLE-PROPERTY-LIST", 2, 0, false);
    //declareFunction(myName, "make_file_hash_table", "MAKE-FILE-HASH-TABLE", 0, 1, false);
    //declareFunction(myName, "describe_file_hash_table", "DESCRIBE-FILE-HASH-TABLE", 1, 1, false);
    //declareFunction(myName, "read_only_file_hash_table_p", "READ-ONLY-FILE-HASH-TABLE-P", 1, 0, false);
    //declareFunction(myName, "writeable_file_hash_table_p", "WRITEABLE-FILE-HASH-TABLE-P", 1, 0, false);
    //declareFunction(myName, "file_hash_table_is_read_onlyP", "FILE-HASH-TABLE-IS-READ-ONLY?", 1, 0, false);
    //declareFunction(myName, "file_hash_table_path", "FILE-HASH-TABLE-PATH", 1, 0, false);
    //declareFunction(myName, "file_hash_table_serialization", "FILE-HASH-TABLE-SERIALIZATION", 1, 0, false);
    declareFunction(myName, "htfile_header_print_function_trampoline", "HTFILE-HEADER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction(myName, "htfile_header_p", "HTFILE-HEADER-P", 1, 0, false); new $htfile_header_p$UnaryFunction();
    //declareFunction(myName, "htfile_header_size", "HTFILE-HEADER-SIZE", 1, 0, false);
    //declareFunction(myName, "htfile_header_version_major", "HTFILE-HEADER-VERSION-MAJOR", 1, 0, false);
    //declareFunction(myName, "htfile_header_version_minor", "HTFILE-HEADER-VERSION-MINOR", 1, 0, false);
    //declareFunction(myName, "htfile_header_object_space_offset", "HTFILE-HEADER-OBJECT-SPACE-OFFSET", 1, 0, false);
    //declareFunction(myName, "htfile_header_key_space_offset", "HTFILE-HEADER-KEY-SPACE-OFFSET", 1, 0, false);
    //declareFunction(myName, "htfile_header_current_heap_top", "HTFILE-HEADER-CURRENT-HEAP-TOP", 1, 0, false);
    //declareFunction(myName, "htfile_header_item_count", "HTFILE-HEADER-ITEM-COUNT", 1, 0, false);
    //declareFunction(myName, "htfile_header_capacity", "HTFILE-HEADER-CAPACITY", 1, 0, false);
    //declareFunction(myName, "htfile_header_free_list_head", "HTFILE-HEADER-FREE-LIST-HEAD", 1, 0, false);
    //declareFunction(myName, "htfile_header_deletion_count", "HTFILE-HEADER-DELETION-COUNT", 1, 0, false);
    //declareFunction(myName, "htfile_header_header_crc", "HTFILE-HEADER-HEADER-CRC", 1, 0, false);
    //declareFunction(myName, "htfile_header_extension_space_size", "HTFILE-HEADER-EXTENSION-SPACE-SIZE", 1, 0, false);
    //declareFunction(myName, "htfile_header_extension_space", "HTFILE-HEADER-EXTENSION-SPACE", 1, 0, false);
    //declareFunction(myName, "_csetf_htfile_header_size", "_CSETF-HTFILE-HEADER-SIZE", 2, 0, false);
    //declareFunction(myName, "_csetf_htfile_header_version_major", "_CSETF-HTFILE-HEADER-VERSION-MAJOR", 2, 0, false);
    //declareFunction(myName, "_csetf_htfile_header_version_minor", "_CSETF-HTFILE-HEADER-VERSION-MINOR", 2, 0, false);
    //declareFunction(myName, "_csetf_htfile_header_object_space_offset", "_CSETF-HTFILE-HEADER-OBJECT-SPACE-OFFSET", 2, 0, false);
    //declareFunction(myName, "_csetf_htfile_header_key_space_offset", "_CSETF-HTFILE-HEADER-KEY-SPACE-OFFSET", 2, 0, false);
    //declareFunction(myName, "_csetf_htfile_header_current_heap_top", "_CSETF-HTFILE-HEADER-CURRENT-HEAP-TOP", 2, 0, false);
    //declareFunction(myName, "_csetf_htfile_header_item_count", "_CSETF-HTFILE-HEADER-ITEM-COUNT", 2, 0, false);
    //declareFunction(myName, "_csetf_htfile_header_capacity", "_CSETF-HTFILE-HEADER-CAPACITY", 2, 0, false);
    //declareFunction(myName, "_csetf_htfile_header_free_list_head", "_CSETF-HTFILE-HEADER-FREE-LIST-HEAD", 2, 0, false);
    //declareFunction(myName, "_csetf_htfile_header_deletion_count", "_CSETF-HTFILE-HEADER-DELETION-COUNT", 2, 0, false);
    //declareFunction(myName, "_csetf_htfile_header_header_crc", "_CSETF-HTFILE-HEADER-HEADER-CRC", 2, 0, false);
    //declareFunction(myName, "_csetf_htfile_header_extension_space_size", "_CSETF-HTFILE-HEADER-EXTENSION-SPACE-SIZE", 2, 0, false);
    //declareFunction(myName, "_csetf_htfile_header_extension_space", "_CSETF-HTFILE-HEADER-EXTENSION-SPACE", 2, 0, false);
    //declareFunction(myName, "make_htfile_header", "MAKE-HTFILE-HEADER", 0, 1, false);
    //declareFunction(myName, "describe_htfile_header", "DESCRIBE-HTFILE-HEADER", 1, 1, false);
    declareFunction(myName, "htfile_object_entry_print_function_trampoline", "HTFILE-OBJECT-ENTRY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction(myName, "htfile_object_entry_p", "HTFILE-OBJECT-ENTRY-P", 1, 0, false); new $htfile_object_entry_p$UnaryFunction();
    //declareFunction(myName, "htfile_object_entry_size", "HTFILE-OBJECT-ENTRY-SIZE", 1, 0, false);
    //declareFunction(myName, "htfile_object_entry_type", "HTFILE-OBJECT-ENTRY-TYPE", 1, 0, false);
    //declareFunction(myName, "htfile_object_entry_key_size", "HTFILE-OBJECT-ENTRY-KEY-SIZE", 1, 0, false);
    //declareFunction(myName, "htfile_object_entry_key", "HTFILE-OBJECT-ENTRY-KEY", 1, 0, false);
    //declareFunction(myName, "htfile_object_entry_data_size", "HTFILE-OBJECT-ENTRY-DATA-SIZE", 1, 0, false);
    //declareFunction(myName, "htfile_object_entry_data", "HTFILE-OBJECT-ENTRY-DATA", 1, 0, false);
    //declareFunction(myName, "_csetf_htfile_object_entry_size", "_CSETF-HTFILE-OBJECT-ENTRY-SIZE", 2, 0, false);
    //declareFunction(myName, "_csetf_htfile_object_entry_type", "_CSETF-HTFILE-OBJECT-ENTRY-TYPE", 2, 0, false);
    //declareFunction(myName, "_csetf_htfile_object_entry_key_size", "_CSETF-HTFILE-OBJECT-ENTRY-KEY-SIZE", 2, 0, false);
    //declareFunction(myName, "_csetf_htfile_object_entry_key", "_CSETF-HTFILE-OBJECT-ENTRY-KEY", 2, 0, false);
    //declareFunction(myName, "_csetf_htfile_object_entry_data_size", "_CSETF-HTFILE-OBJECT-ENTRY-DATA-SIZE", 2, 0, false);
    //declareFunction(myName, "_csetf_htfile_object_entry_data", "_CSETF-HTFILE-OBJECT-ENTRY-DATA", 2, 0, false);
    //declareFunction(myName, "make_htfile_object_entry", "MAKE-HTFILE-OBJECT-ENTRY", 0, 1, false);
    declareFunction(myName, "htfile_key_entry_print_function_trampoline", "HTFILE-KEY-ENTRY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction(myName, "htfile_key_entry_p", "HTFILE-KEY-ENTRY-P", 1, 0, false); new $htfile_key_entry_p$UnaryFunction();
    //declareFunction(myName, "htfile_key_entry_key_offset", "HTFILE-KEY-ENTRY-KEY-OFFSET", 1, 0, false);
    //declareFunction(myName, "htfile_key_entry_hash_code", "HTFILE-KEY-ENTRY-HASH-CODE", 1, 0, false);
    declareFunction(myName, "_csetf_htfile_key_entry_key_offset", "_CSETF-HTFILE-KEY-ENTRY-KEY-OFFSET", 2, 0, false);
    declareFunction(myName, "_csetf_htfile_key_entry_hash_code", "_CSETF-HTFILE-KEY-ENTRY-HASH-CODE", 2, 0, false);
    declareFunction(myName, "make_htfile_key_entry", "MAKE-HTFILE-KEY-ENTRY", 0, 1, false);
    //declareFunction(myName, "get_default_fht_test_function", "GET-DEFAULT-FHT-TEST-FUNCTION", 0, 0, false);
    //declareFunction(myName, "get_default_fht_serialization_protocol", "GET-DEFAULT-FHT-SERIALIZATION-PROTOCOL", 0, 0, false);
    //declareFunction(myName, "new_htfile_header", "NEW-HTFILE-HEADER", 0, 0, false);
    //declareFunction(myName, "construct_empty_htfile_header", "CONSTRUCT-EMPTY-HTFILE-HEADER", 1, 1, false);
    //declareFunction(myName, "htfile_scale_user_space_to_implementation_space", "HTFILE-SCALE-USER-SPACE-TO-IMPLEMENTATION-SPACE", 1, 0, false);
    //declareFunction(myName, "htfile_minimal_space_required", "HTFILE-MINIMAL-SPACE-REQUIRED", 0, 0, false);
    //declareFunction(myName, "new_file_hash_table", "NEW-FILE-HASH-TABLE", 5, 3, false);
    //declareFunction(myName, "new_empty_file_hash_table", "NEW-EMPTY-FILE-HASH-TABLE", 6, 4, false);
    declareFunction(myName, "new_htfile_key_entry", "NEW-HTFILE-KEY-ENTRY", 1, 1, false);
    declareFunction(myName, "construct_tombstone_key_entry", "CONSTRUCT-TOMBSTONE-KEY-ENTRY", 0, 0, false);
    //declareFunction(myName, "is_tombstoned_key_entryP", "IS-TOMBSTONED-KEY-ENTRY?", 1, 0, false);
    declareFunction(myName, "construct_empty_key_entry", "CONSTRUCT-EMPTY-KEY-ENTRY", 0, 0, false);
    //declareFunction(myName, "is_empty_key_entryP", "IS-EMPTY-KEY-ENTRY?", 1, 0, false);
    //declareFunction(myName, "is_valid_key_entryP", "IS-VALID-KEY-ENTRY?", 2, 0, false);
    //declareFunction(myName, "fht_sxhash_for_fht", "FHT-SXHASH-FOR-FHT", 2, 0, false);
    //declareFunction(myName, "fht_sxhash", "FHT-SXHASH", 2, 0, false);
    //declareFunction(myName, "valid_hash_code_p", "VALID-HASH-CODE-P", 1, 0, false);
    //declareFunction(myName, "new_object_entry", "NEW-OBJECT-ENTRY", 2, 0, false);
    declareFunction(myName, "fht_serialization_entry_print_function_trampoline", "FHT-SERIALIZATION-ENTRY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction(myName, "fht_serialization_entry_p", "FHT-SERIALIZATION-ENTRY-P", 1, 0, false); new $fht_serialization_entry_p$UnaryFunction();
    //declareFunction(myName, "fht_se_encoding_input_fn", "FHT-SE-ENCODING-INPUT-FN", 1, 0, false);
    //declareFunction(myName, "fht_se_encoding_output_fn", "FHT-SE-ENCODING-OUTPUT-FN", 1, 0, false);
    //declareFunction(myName, "fht_se_encoding_size_fn", "FHT-SE-ENCODING-SIZE-FN", 1, 0, false);
    //declareFunction(myName, "fht_se_hash_fn", "FHT-SE-HASH-FN", 1, 0, false);
    //declareFunction(myName, "fht_se_encoding_key_input_fn", "FHT-SE-ENCODING-KEY-INPUT-FN", 1, 0, false);
    //declareFunction(myName, "fht_se_encoding_key_output_fn", "FHT-SE-ENCODING-KEY-OUTPUT-FN", 1, 0, false);
    declareFunction(myName, "_csetf_fht_se_encoding_input_fn", "_CSETF-FHT-SE-ENCODING-INPUT-FN", 2, 0, false);
    declareFunction(myName, "_csetf_fht_se_encoding_output_fn", "_CSETF-FHT-SE-ENCODING-OUTPUT-FN", 2, 0, false);
    declareFunction(myName, "_csetf_fht_se_encoding_size_fn", "_CSETF-FHT-SE-ENCODING-SIZE-FN", 2, 0, false);
    declareFunction(myName, "_csetf_fht_se_hash_fn", "_CSETF-FHT-SE-HASH-FN", 2, 0, false);
    declareFunction(myName, "_csetf_fht_se_encoding_key_input_fn", "_CSETF-FHT-SE-ENCODING-KEY-INPUT-FN", 2, 0, false);
    declareFunction(myName, "_csetf_fht_se_encoding_key_output_fn", "_CSETF-FHT-SE-ENCODING-KEY-OUTPUT-FN", 2, 0, false);
    declareFunction(myName, "make_fht_serialization_entry", "MAKE-FHT-SERIALIZATION-ENTRY", 0, 1, false);
    //declareFunction(myName, "print_fht_serialization_entry", "PRINT-FHT-SERIALIZATION-ENTRY", 3, 0, false);
    declareFunction(myName, "new_fht_serialization_entry", "NEW-FHT-SERIALIZATION-ENTRY", 1, 0, false);
    declareFunction(myName, "register_fht_serialization_entry", "REGISTER-FHT-SERIALIZATION-ENTRY", 2, 0, false);
    //declareFunction(myName, "fht_serialization_entry", "FHT-SERIALIZATION-ENTRY", 1, 0, false);
    //declareFunction(myName, "fht_serialization_encoding_input_fn", "FHT-SERIALIZATION-ENCODING-INPUT-FN", 1, 0, false);
    //declareFunction(myName, "fht_serialization_encoding_output_fn", "FHT-SERIALIZATION-ENCODING-OUTPUT-FN", 1, 0, false);
    //declareFunction(myName, "fht_serialization_encoding_size_fn", "FHT-SERIALIZATION-ENCODING-SIZE-FN", 1, 0, false);
    //declareFunction(myName, "fht_serialization_hash_fn", "FHT-SERIALIZATION-HASH-FN", 1, 0, false);
    //declareFunction(myName, "fht_serialization_encoding_key_input_fn", "FHT-SERIALIZATION-ENCODING-KEY-INPUT-FN", 1, 0, false);
    //declareFunction(myName, "fht_serialization_encoding_key_output_fn", "FHT-SERIALIZATION-ENCODING-KEY-OUTPUT-FN", 1, 0, false);
    //declareMacro(myName, "do_fht_serializations", "DO-FHT-SERIALIZATIONS");
    //declareFunction(myName, "find_fht_serialization_by_functions", "FIND-FHT-SERIALIZATION-BY-FUNCTIONS", 4, 2, false);
    //declareFunction(myName, "create_file_hash_table", "CREATE-FILE-HASH-TABLE", 2, 3, false);
    //declareFunction(myName, "open_file_hash_table", "OPEN-FILE-HASH-TABLE", 1, 2, false);
    //declareFunction(myName, "open_file_hash_table_read_only", "OPEN-FILE-HASH-TABLE-READ-ONLY", 1, 2, false);
    //declareFunction(myName, "file_hash_table_open_p", "FILE-HASH-TABLE-OPEN-P", 1, 0, false);
    //declareFunction(myName, "finalize_file_hash_table", "FINALIZE-FILE-HASH-TABLE", 1, 0, false);
    //declareFunction(myName, "file_hash_table_count", "FILE-HASH-TABLE-COUNT", 1, 0, false);
    //declareFunction(myName, "file_hash_table_capacity", "FILE-HASH-TABLE-CAPACITY", 1, 0, false);
    //declareFunction(myName, "put_file_hash_table", "PUT-FILE-HASH-TABLE", 3, 0, false);
    //declareFunction(myName, "get_file_hash_table", "GET-FILE-HASH-TABLE", 2, 1, false);
    //declareFunction(myName, "remove_file_hash_table", "REMOVE-FILE-HASH-TABLE", 2, 0, false);
    //declareFunction(myName, "cinc_file_hash_table", "CINC-FILE-HASH-TABLE", 2, 2, false);
    //declareMacro(myName, "dosome_file_hash_table", "DOSOME-FILE-HASH-TABLE");
    //declareMacro(myName, "do_file_hash_table", "DO-FILE-HASH-TABLE");
    //declareFunction(myName, "print_file_hash_table_contents", "PRINT-FILE-HASH-TABLE-CONTENTS", 1, 0, false);
    //declareMacro(myName, "progress_do_file_hash_table", "PROGRESS-DO-FILE-HASH-TABLE");
    //declareMacro(myName, "dosome_file_hash_table_keys", "DOSOME-FILE-HASH-TABLE-KEYS");
    //declareMacro(myName, "do_file_hash_table_keys", "DO-FILE-HASH-TABLE-KEYS");
    //declareMacro(myName, "progress_do_file_hash_table_keys", "PROGRESS-DO-FILE-HASH-TABLE-KEYS");
    //declareFunction(myName, "file_hash_table_keys", "FILE-HASH-TABLE-KEYS", 1, 0, false);
    //declareFunction(myName, "file_hash_table_random_n", "FILE-HASH-TABLE-RANDOM-N", 2, 1, false);
    //declareFunction(myName, "validate_file_hash_table", "VALIDATE-FILE-HASH-TABLE", 1, 1, false);
    //declareFunction(myName, "recover_file_hash_table_heap", "RECOVER-FILE-HASH-TABLE-HEAP", 1, 1, false);
    //declareFunction(myName, "new_file_hash_table_iterator", "NEW-FILE-HASH-TABLE-ITERATOR", 1, 1, false);
    //declareFunction(myName, "new_file_hash_table_keys_iterator", "NEW-FILE-HASH-TABLE-KEYS-ITERATOR", 1, 1, false);
    //declareFunction(myName, "new_file_hash_table_values_iterator", "NEW-FILE-HASH-TABLE-VALUES-ITERATOR", 1, 1, false);
    //declareFunction(myName, "iterate_file_hash_table_next_value", "ITERATE-FILE-HASH-TABLE-NEXT-VALUE", 1, 0, false);
    //declareFunction(myName, "new_file_hash_table_iterator_internal", "NEW-FILE-HASH-TABLE-ITERATOR-INTERNAL", 3, 0, false);
    //declareFunction(myName, "make_iterator_file_hash_table_state", "MAKE-ITERATOR-FILE-HASH-TABLE-STATE", 3, 0, false);
    //declareFunction(myName, "iterate_file_hash_table_doneP", "ITERATE-FILE-HASH-TABLE-DONE?", 1, 0, false);
    //declareFunction(myName, "iterate_file_hash_table_next", "ITERATE-FILE-HASH-TABLE-NEXT", 1, 0, false);
    //declareFunction(myName, "make_fht_iterator_next", "MAKE-FHT-ITERATOR-NEXT", 3, 0, false);
    //declareFunction(myName, "fht_iterator_next_value", "FHT-ITERATOR-NEXT-VALUE", 1, 0, false);
    //declareFunction(myName, "file_hash_table_to_alist", "FILE-HASH-TABLE-TO-ALIST", 1, 0, false);
    //declareFunction(myName, "hash_table_to_file_hash_table", "HASH-TABLE-TO-FILE-HASH-TABLE", 2, 4, false);
    //declareFunction(myName, "alist_to_file_hash_table", "ALIST-TO-FILE-HASH-TABLE", 2, 3, false);
    //declareFunction(myName, "file_hash_table_copy", "FILE-HASH-TABLE-COPY", 2, 5, false);
    //declareFunction(myName, "get_file_hash_table_storage_resourcing", "GET-FILE-HASH-TABLE-STORAGE-RESOURCING", 1, 0, false);
    //declareFunction(myName, "set_file_hash_table_storage_resourcing", "SET-FILE-HASH-TABLE-STORAGE-RESOURCING", 1, 1, false);
    //declareFunction(myName, "file_hash_table_storage_resourcing_onP", "FILE-HASH-TABLE-STORAGE-RESOURCING-ON?", 1, 0, false);
    //declareFunction(myName, "compute_fht_cache_capacity", "COMPUTE-FHT-CACHE-CAPACITY", 1, 0, false);
    //declareFunction(myName, "allocate_file_hash_table_caches", "ALLOCATE-FILE-HASH-TABLE-CACHES", 2, 0, false);
    //declareFunction(myName, "put_fht_lookaside_cache", "PUT-FHT-LOOKASIDE-CACHE", 3, 0, false);
    //declareFunction(myName, "get_fht_lookaside_cache", "GET-FHT-LOOKASIDE-CACHE", 2, 0, false);
    //declareFunction(myName, "remove_fht_lookaside_cache", "REMOVE-FHT-LOOKASIDE-CACHE", 2, 0, false);
    //declareFunction(myName, "get_file_hash_table_any", "GET-FILE-HASH-TABLE-ANY", 1, 2, false);
    //declareFunction(myName, "perform_fht_put", "PERFORM-FHT-PUT", 3, 0, false);
    //declareFunction(myName, "perform_fht_put_insert", "PERFORM-FHT-PUT-INSERT", 6, 1, false);
    //declareFunction(myName, "perform_fht_put_replace", "PERFORM-FHT-PUT-REPLACE", 6, 0, false);
    //declareFunction(myName, "perform_fht_remove", "PERFORM-FHT-REMOVE", 2, 0, false);
    //declareFunction(myName, "perform_fht_remove_int", "PERFORM-FHT-REMOVE-INT", 4, 0, false);
    //declareFunction(myName, "clear_fht_key_entry_node", "CLEAR-FHT-KEY-ENTRY-NODE", 2, 0, false);
    //declareFunction(myName, "fht_fill_key_entry_gap", "FHT-FILL-KEY-ENTRY-GAP", 2, 0, false);
    //declareFunction(myName, "fht_lookup_key_index_only", "FHT-LOOKUP-KEY-INDEX-ONLY", 3, 0, false);
    //declareFunction(myName, "increase_fht_item_count", "INCREASE-FHT-ITEM-COUNT", 1, 1, false);
    //declareFunction(myName, "decrease_fht_item_count", "DECREASE-FHT-ITEM-COUNT", 1, 0, false);
    //declareFunction(myName, "perform_fht_get", "PERFORM-FHT-GET", 2, 0, false);
    declareFunction(myName, "htfile_file_block_entry_print_function_trampoline", "HTFILE-FILE-BLOCK-ENTRY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction(myName, "htfile_file_block_entry_p", "HTFILE-FILE-BLOCK-ENTRY-P", 1, 0, false); new $htfile_file_block_entry_p$UnaryFunction();
    //declareFunction(myName, "htfile_file_block_entry_size", "HTFILE-FILE-BLOCK-ENTRY-SIZE", 1, 0, false);
    //declareFunction(myName, "htfile_file_block_entry_next", "HTFILE-FILE-BLOCK-ENTRY-NEXT", 1, 0, false);
    //declareFunction(myName, "_csetf_htfile_file_block_entry_size", "_CSETF-HTFILE-FILE-BLOCK-ENTRY-SIZE", 2, 0, false);
    //declareFunction(myName, "_csetf_htfile_file_block_entry_next", "_CSETF-HTFILE-FILE-BLOCK-ENTRY-NEXT", 2, 0, false);
    //declareFunction(myName, "make_htfile_file_block_entry", "MAKE-HTFILE-FILE-BLOCK-ENTRY", 0, 1, false);
    //declareFunction(myName, "new_htfile_file_block_entry", "NEW-HTFILE-FILE-BLOCK-ENTRY", 0, 1, false);
    //declareFunction(myName, "print_htfile_file_block_entry", "PRINT-HTFILE-FILE-BLOCK-ENTRY", 3, 0, false);
    //declareFunction(myName, "copy_file_block", "COPY-FILE-BLOCK", 2, 0, false);
    //declareFunction(myName, "write_file_block_entry_to_space", "WRITE-FILE-BLOCK-ENTRY-TO-SPACE", 3, 0, false);
    //declareFunction(myName, "read_file_block_entry_from_space", "READ-FILE-BLOCK-ENTRY-FROM-SPACE", 3, 0, false);
    //declareFunction(myName, "deallocate_object_space", "DEALLOCATE-OBJECT-SPACE", 3, 0, false);
    //declareFunction(myName, "insert_file_block_in_free_list", "INSERT-FILE-BLOCK-IN-FREE-LIST", 4, 0, false);
    //declareFunction(myName, "allocate_object_space_from_free_list", "ALLOCATE-OBJECT-SPACE-FROM-FREE-LIST", 2, 0, false);
    //declareFunction(myName, "write_initial_table", "WRITE-INITIAL-TABLE", 1, 0, false);
    //declareFunction(myName, "allocate_fht_heap_space", "ALLOCATE-FHT-HEAP-SPACE", 1, 0, false);
    //declareFunction(myName, "allocate_fht_key_space", "ALLOCATE-FHT-KEY-SPACE", 1, 1, false);
    //declareFunction(myName, "htfile_minimal_space_required_for_key", "HTFILE-MINIMAL-SPACE-REQUIRED-FOR-KEY", 0, 0, false);
    //declareFunction(myName, "fht_key_index_to_reladdr", "FHT-KEY-INDEX-TO-RELADDR", 1, 0, false);
    //declareFunction(myName, "fht_keyspace_byte_size", "FHT-KEYSPACE-BYTE-SIZE", 1, 0, false);
    //declareFunction(myName, "valid_heap_offset_p", "VALID-HEAP-OFFSET-P", 3, 0, false);
    //declareFunction(myName, "valid_fht_heap_offset_p", "VALID-FHT-HEAP-OFFSET-P", 2, 0, false);
    //declareFunction(myName, "valid_offset_in_keyspace_p", "VALID-OFFSET-IN-KEYSPACE-P", 3, 0, false);
    //declareFunction(myName, "fht_get_keyspace_size", "FHT-GET-KEYSPACE-SIZE", 1, 0, false);
    //declareFunction(myName, "fht_key_reladdr_to_address", "FHT-KEY-RELADDR-TO-ADDRESS", 2, 0, false);
    //declareFunction(myName, "fht_key_index_to_address", "FHT-KEY-INDEX-TO-ADDRESS", 2, 0, false);
    //declareFunction(myName, "validate_fht_key_index", "VALIDATE-FHT-KEY-INDEX", 2, 0, false);
    //declareFunction(myName, "write_key_entry_object", "WRITE-KEY-ENTRY-OBJECT", 2, 0, false);
    //declareFunction(myName, "read_key_entry_object", "READ-KEY-ENTRY-OBJECT", 2, 0, false);
    //declareFunction(myName, "fetch_fht_key_entry", "FETCH-FHT-KEY-ENTRY", 3, 0, false);
    //declareFunction(myName, "store_fht_key_entry", "STORE-FHT-KEY-ENTRY", 3, 0, false);
    //declareFunction(myName, "fht_hash", "FHT-HASH", 2, 0, false);
    //declareFunction(myName, "fht_ensure_hash_table_size", "FHT-ENSURE-HASH-TABLE-SIZE", 1, 0, false);
    //declareFunction(myName, "fht_compute_fence_post_index", "FHT-COMPUTE-FENCE-POST-INDEX", 2, 0, false);
    //declareFunction(myName, "fht_step_key_index", "FHT-STEP-KEY-INDEX", 2, 0, false);
    //declareFunction(myName, "fht_lookup_key", "FHT-LOOKUP-KEY", 2, 1, false);
    //declareFunction(myName, "identical_fht_key_entryP", "IDENTICAL-FHT-KEY-ENTRY?", 5, 0, false);
    //declareFunction(myName, "complete_fht_object_entry_for_key", "COMPLETE-FHT-OBJECT-ENTRY-FOR-KEY", 3, 1, false);
    //declareFunction(myName, "potentially_grow_fht_table", "POTENTIALLY-GROW-FHT-TABLE", 1, 0, false);
    //declareFunction(myName, "perform_grow_fht_table", "PERFORM-GROW-FHT-TABLE", 1, 0, false);
    //declareFunction(myName, "is_fht_too_smallP", "IS-FHT-TOO-SMALL?", 1, 0, false);
    //declareFunction(myName, "resize_fht_object_and_key_spaces", "RESIZE-FHT-OBJECT-AND-KEY-SPACES", 1, 0, false);
    //declareFunction(myName, "allocate_new_fht_key_space", "ALLOCATE-NEW-FHT-KEY-SPACE", 3, 0, false);
    //declareFunction(myName, "move_htfile_key_space", "MOVE-HTFILE-KEY-SPACE", 3, 0, false);
    //declareFunction(myName, "rehash_fht_key_space", "REHASH-FHT-KEY-SPACE", 3, 0, false);
    //declareMacro(myName, "with_different_keyspace", "WITH-DIFFERENT-KEYSPACE");
    //declareFunction(myName, "rehash_fht_cached_keys", "REHASH-FHT-CACHED-KEYS", 6, 0, false);
    //declareFunction(myName, "handle_rehash_fht_insert", "HANDLE-REHASH-FHT-INSERT", 5, 0, false);
    //declareFunction(myName, "htfile_minimal_space_required_for_object", "HTFILE-MINIMAL-SPACE-REQUIRED-FOR-OBJECT", 0, 0, false);
    //declareFunction(myName, "specify_object_entry", "SPECIFY-OBJECT-ENTRY", 3, 1, false);
    //declareFunction(myName, "compute_object_entry_size", "COMPUTE-OBJECT-ENTRY-SIZE", 2, 0, false);
    //declareFunction(myName, "allocate_object_space", "ALLOCATE-OBJECT-SPACE", 2, 0, false);
    //declareFunction(myName, "store_fht_object_entry", "STORE-FHT-OBJECT-ENTRY", 3, 0, false);
    //declareFunction(myName, "write_object_entry_to_space", "WRITE-OBJECT-ENTRY-TO-SPACE", 3, 0, false);
    //declareFunction(myName, "read_object_entry_from_space", "READ-OBJECT-ENTRY-FROM-SPACE", 3, 1, false);
    //declareFunction(myName, "increase_htfile_heap_size", "INCREASE-HTFILE-HEAP-SIZE", 2, 0, false);
    //declareFunction(myName, "compute_new_htfile_heap_size", "COMPUTE-NEW-HTFILE-HEAP-SIZE", 1, 1, false);
    //declareMacro(myName, "register_file_table_header_support", "REGISTER-FILE-TABLE-HEADER-SUPPORT");
    //declareFunction(myName, "read_fht_header", "READ-FHT-HEADER", 1, 0, false);
    //declareFunction(myName, "write_fht_header", "WRITE-FHT-HEADER", 1, 0, false);
    //declareFunction(myName, "read_fht_header_version1p3", "READ-FHT-HEADER-VERSION1P3", 1, 0, false);
    //declareFunction(myName, "write_fht_header_version1p3", "WRITE-FHT-HEADER-VERSION1P3", 1, 0, false);
    //declareFunction(myName, "read_fht_extension_space", "READ-FHT-EXTENSION-SPACE", 1, 0, false);
    //declareFunction(myName, "write_fht_extension_space", "WRITE-FHT-EXTENSION-SPACE", 1, 0, false);
    //declareFunction(myName, "verify_version1p3_crc", "VERIFY-VERSION1P3-CRC", 1, 0, false);
    declareFunction(myName, "read_fht_uint4", "READ-FHT-UINT4", 1, 0, false);
    //declareFunction(myName, "write_fht_uint4", "WRITE-FHT-UINT4", 2, 0, false);
    //declareFunction(myName, "read_fht_uint8", "READ-FHT-UINT8", 1, 0, false);
    //declareFunction(myName, "write_fht_uint8", "WRITE-FHT-UINT8", 2, 0, false);
    //declareFunction(myName, "write_null_fht_bytes", "WRITE-NULL-FHT-BYTES", 2, 0, false);
    //declareFunction(myName, "read_fht_encoded_object", "READ-FHT-ENCODED-OBJECT", 2, 0, false);
    //declareFunction(myName, "write_fht_encoded_object", "WRITE-FHT-ENCODED-OBJECT", 4, 0, false);
    //declareFunction(myName, "read_fht_binary_block", "READ-FHT-BINARY-BLOCK", 3, 0, false);
    //declareFunction(myName, "write_fht_binary_block", "WRITE-FHT-BINARY-BLOCK", 3, 0, false);
    //declareFunction(myName, "move_fht_binary_block", "MOVE-FHT-BINARY-BLOCK", 5, 0, false);
    //declareFunction(myName, "aggressive_fast_fht_optimization_modeP", "AGGRESSIVE-FAST-FHT-OPTIMIZATION-MODE?", 0, 0, false);
    //declareFunction(myName, "moderate_fast_fht_optimization_modeP", "MODERATE-FAST-FHT-OPTIMIZATION-MODE?", 0, 0, false);
    //declareFunction(myName, "conservative_fast_fht_optimization_modeP", "CONSERVATIVE-FAST-FHT-OPTIMIZATION-MODE?", 0, 0, false);
    //declareFunction(myName, "invalid_fast_fht_optimization_mode", "INVALID-FAST-FHT-OPTIMIZATION-MODE", 0, 0, false);
    declareFunction(myName, "fast_create_fht_print_function_trampoline", "FAST-CREATE-FHT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction(myName, "fast_create_fht_p", "FAST-CREATE-FHT-P", 1, 0, false); new $fast_create_fht_p$UnaryFunction();
    //declareFunction(myName, "fast_create_fht_fht", "FAST-CREATE-FHT-FHT", 1, 0, false);
    //declareFunction(myName, "fast_create_fht_tempstem", "FAST-CREATE-FHT-TEMPSTEM", 1, 0, false);
    //declareFunction(myName, "fast_create_fht_tempfile", "FAST-CREATE-FHT-TEMPFILE", 1, 0, false);
    //declareFunction(myName, "fast_create_fht_keystream", "FAST-CREATE-FHT-KEYSTREAM", 1, 0, false);
    //declareFunction(myName, "_csetf_fast_create_fht_fht", "_CSETF-FAST-CREATE-FHT-FHT", 2, 0, false);
    //declareFunction(myName, "_csetf_fast_create_fht_tempstem", "_CSETF-FAST-CREATE-FHT-TEMPSTEM", 2, 0, false);
    //declareFunction(myName, "_csetf_fast_create_fht_tempfile", "_CSETF-FAST-CREATE-FHT-TEMPFILE", 2, 0, false);
    //declareFunction(myName, "_csetf_fast_create_fht_keystream", "_CSETF-FAST-CREATE-FHT-KEYSTREAM", 2, 0, false);
    //declareFunction(myName, "make_fast_create_fht", "MAKE-FAST-CREATE-FHT", 0, 1, false);
    //declareFunction(myName, "fast_create_file_hash_table", "FAST-CREATE-FILE-HASH-TABLE", 1, 3, false);
    //declareFunction(myName, "fast_create_allocate_keystream", "FAST-CREATE-ALLOCATE-KEYSTREAM", 1, 0, false);
    //declareFunction(myName, "fast_create_fixup_object_heap", "FAST-CREATE-FIXUP-OBJECT-HEAP", 1, 0, false);
    //declareFunction(myName, "fast_put_file_hash_table", "FAST-PUT-FILE-HASH-TABLE", 3, 0, false);
    //declareFunction(myName, "perform_fast_fht_put", "PERFORM-FAST-FHT-PUT", 3, 0, false);
    //declareFunction(myName, "update_fast_fht_keystream", "UPDATE-FAST-FHT-KEYSTREAM", 3, 0, false);
    //declareFunction(myName, "finalize_fast_create_file_hash_table", "FINALIZE-FAST-CREATE-FILE-HASH-TABLE", 1, 2, false);
    //declareFunction(myName, "prepare_fast_fht_keyspace", "PREPARE-FAST-FHT-KEYSPACE", 1, 0, false);
    //declareFunction(myName, "realign_fast_fht_keyspace_offset", "REALIGN-FAST-FHT-KEYSPACE-OFFSET", 1, 0, false);
    //declareFunction(myName, "realign_fast_fht_keyspace_capacity", "REALIGN-FAST-FHT-KEYSPACE-CAPACITY", 1, 0, false);
    //declareFunction(myName, "allocate_fast_fht_keyspace", "ALLOCATE-FAST-FHT-KEYSPACE", 1, 0, false);
    //declareFunction(myName, "insert_fast_fht_keystream_content", "INSERT-FAST-FHT-KEYSTREAM-CONTENT", 1, 2, false);
    //declareFunction(myName, "perform_fast_fht_insert_of_unambiguous_keys", "PERFORM-FAST-FHT-INSERT-OF-UNAMBIGUOUS-KEYS", 2, 0, false);
    //declareFunction(myName, "perform_fast_fht_insert_by_keystream_ordering", "PERFORM-FAST-FHT-INSERT-BY-KEYSTREAM-ORDERING", 4, 0, false);
    //declareFunction(myName, "shutdown_fast_create_fht", "SHUTDOWN-FAST-CREATE-FHT", 1, 1, false);
    declareFunction(myName, "fast_fht_keystream_sorter_print_function_trampoline", "FAST-FHT-KEYSTREAM-SORTER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction(myName, "fast_fht_keystream_sorter_p", "FAST-FHT-KEYSTREAM-SORTER-P", 1, 0, false); new $fast_fht_keystream_sorter_p$UnaryFunction();
    //declareFunction(myName, "fstfht_ksorter_tempstem", "FSTFHT-KSORTER-TEMPSTEM", 1, 0, false);
    //declareFunction(myName, "fstfht_ksorter_in_files", "FSTFHT-KSORTER-IN-FILES", 1, 0, false);
    //declareFunction(myName, "fstfht_ksorter_out_files", "FSTFHT-KSORTER-OUT-FILES", 1, 0, false);
    //declareFunction(myName, "_csetf_fstfht_ksorter_tempstem", "_CSETF-FSTFHT-KSORTER-TEMPSTEM", 2, 0, false);
    //declareFunction(myName, "_csetf_fstfht_ksorter_in_files", "_CSETF-FSTFHT-KSORTER-IN-FILES", 2, 0, false);
    //declareFunction(myName, "_csetf_fstfht_ksorter_out_files", "_CSETF-FSTFHT-KSORTER-OUT-FILES", 2, 0, false);
    //declareFunction(myName, "make_fast_fht_keystream_sorter", "MAKE-FAST-FHT-KEYSTREAM-SORTER", 0, 1, false);
    //declareFunction(myName, "fast_fht_sort_keystream_by_expected_index", "FAST-FHT-SORT-KEYSTREAM-BY-EXPECTED-INDEX", 3, 2, false);
    //declareFunction(myName, "new_fast_fht_keystream_sorter", "NEW-FAST-FHT-KEYSTREAM-SORTER", 1, 0, false);
    //declareFunction(myName, "fast_fht_n_temp_files", "FAST-FHT-N-TEMP-FILES", 3, 0, false);
    //declareFunction(myName, "fast_fht_split_keystream_into_tiled_input_files", "FAST-FHT-SPLIT-KEYSTREAM-INTO-TILED-INPUT-FILES", 3, 0, false);
    //declareFunction(myName, "fast_fht_read_one_keystream_entry", "FAST-FHT-READ-ONE-KEYSTREAM-ENTRY", 2, 1, false);
    //declareFunction(myName, "fast_fht_keystream_sentinel_entry", "FAST-FHT-KEYSTREAM-SENTINEL-ENTRY", 0, 1, false);
    //declareFunction(myName, "fast_fht_keystream_eof_entry", "FAST-FHT-KEYSTREAM-EOF-ENTRY", 0, 1, false);
    //declareFunction(myName, "fast_fht_keystream_entry_cmp", "FAST-FHT-KEYSTREAM-ENTRY-CMP", 2, 0, false);
    //declareFunction(myName, "fast_fht_keystream_entryL", "FAST-FHT-KEYSTREAM-ENTRY<", 2, 0, false);
    //declareFunction(myName, "fast_fht_write_one_keystream_tile", "FAST-FHT-WRITE-ONE-KEYSTREAM-TILE", 2, 0, false);
    //declareFunction(myName, "is_fast_fht_keystream_chunk_separator_entryP", "IS-FAST-FHT-KEYSTREAM-CHUNK-SEPARATOR-ENTRY?", 1, 0, false);
    //declareFunction(myName, "is_fast_fht_keystream_eofP", "IS-FAST-FHT-KEYSTREAM-EOF?", 1, 0, false);
    //declareFunction(myName, "fast_fht_write_keystream_chunk_separator", "FAST-FHT-WRITE-KEYSTREAM-CHUNK-SEPARATOR", 1, 0, false);
    //declareFunction(myName, "fast_fht_write_keystream_entry", "FAST-FHT-WRITE-KEYSTREAM-ENTRY", 3, 1, false);
    //declareFunction(myName, "fast_fht_write_one_keystream_entry", "FAST-FHT-WRITE-ONE-KEYSTREAM-ENTRY", 2, 0, false);
    //declareFunction(myName, "fast_fht_write_one_collision_stream_entry", "FAST-FHT-WRITE-ONE-COLLISION-STREAM-ENTRY", 3, 0, false);
    //declareFunction(myName, "fast_fht_almost_merge_sort_keystream", "FAST-FHT-ALMOST-MERGE-SORT-KEYSTREAM", 2, 1, false);
    //declareFunction(myName, "fast_fht_merge_keystream_input_files", "FAST-FHT-MERGE-KEYSTREAM-INPUT-FILES", 3, 0, false);
    //declareFunction(myName, "fast_fht_merge_keystream_chunks", "FAST-FHT-MERGE-KEYSTREAM-CHUNKS", 4, 0, false);
    //declareMacro(myName, "fast_fht_drain_index_run", "FAST-FHT-DRAIN-INDEX-RUN");
    //declareMacro(myName, "fast_fht_manage_index_collisions", "FAST-FHT-MANAGE-INDEX-COLLISIONS");
    //declareFunction(myName, "fast_fht_uniquify_keystream", "FAST-FHT-UNIQUIFY-KEYSTREAM", 2, 0, false);
    //declareFunction(myName, "fast_fht_get_comparable_index_from_entry", "FAST-FHT-GET-COMPARABLE-INDEX-FROM-ENTRY", 1, 0, false);
    //declareFunction(myName, "fast_fht_dump_keystream", "FAST-FHT-DUMP-KEYSTREAM", 2, 1, false);
    //declareFunction(myName, "fast_fht_dump_keystream_files", "FAST-FHT-DUMP-KEYSTREAM-FILES", 2, 1, false);
    //declareFunction(myName, "enforce_valid_fast_fht_dump_keystream_files", "ENFORCE-VALID-FAST-FHT-DUMP-KEYSTREAM-FILES", 2, 0, false);
    //declareFunction(myName, "validate_fast_fht_dump_keystream", "VALIDATE-FAST-FHT-DUMP-KEYSTREAM", 2, 0, false);
    //declareFunction(myName, "test_fast_fht_keystream_entry_cmp", "TEST-FAST-FHT-KEYSTREAM-ENTRY-CMP", 2, 0, false);
    //declareFunction(myName, "fast_fht_keystream_entry_cmp_expand_argument", "FAST-FHT-KEYSTREAM-ENTRY-CMP-EXPAND-ARGUMENT", 1, 0, false);
    //declareMacro(myName, "with_input_file_hash_table", "WITH-INPUT-FILE-HASH-TABLE");
    //declareMacro(myName, "with_writable_file_hash_table", "WITH-WRITABLE-FILE-HASH-TABLE");
    //declareMacro(myName, "with_output_file_hash_table", "WITH-OUTPUT-FILE-HASH-TABLE");
    //declareMacro(myName, "with_fast_create_file_hash_table", "WITH-FAST-CREATE-FILE-HASH-TABLE");
    //declareFunction(myName, "test_fast_fht_creation_with_merge_sorted_keystream", "TEST-FAST-FHT-CREATION-WITH-MERGE-SORTED-KEYSTREAM", 3, 0, false);
    return NIL;
  }

  public static final SubLObject init_file_hash_table_file() {
    $dtp_file_hash_table$ = defconstant("*DTP-FILE-HASH-TABLE*", $sym0$FILE_HASH_TABLE);
    $dtp_htfile_header$ = defconstant("*DTP-HTFILE-HEADER*", $sym55$HTFILE_HEADER);
    $dtp_htfile_object_entry$ = defconstant("*DTP-HTFILE-OBJECT-ENTRY*", $sym112$HTFILE_OBJECT_ENTRY);
    $dtp_htfile_key_entry$ = defconstant("*DTP-HTFILE-KEY-ENTRY*", $sym136$HTFILE_KEY_ENTRY);
    $default_fht_test_function$ = deflexical("*DEFAULT-FHT-TEST-FUNCTION*", Symbols.symbol_function(EQL));
    $default_fht_serialization_protocol$ = deflexical("*DEFAULT-FHT-SERIALIZATION-PROTOCOL*", $kw149$IMAGE_DEPENDENT_CFASL);
    $fht_min_cache_capacity$ = defparameter("*FHT-MIN-CACHE-CAPACITY*", $int150$2000);
    $fht_cache_percentage$ = defparameter("*FHT-CACHE-PERCENTAGE*", FOUR_INTEGER);
    $htfile_header_current_vmajor$ = defconstant("*HTFILE-HEADER-CURRENT-VMAJOR*", ONE_INTEGER);
    $htfile_header_current_vminor$ = defconstant("*HTFILE-HEADER-CURRENT-VMINOR*", THREE_INTEGER);
    $htfile_header_current_size$ = defconstant("*HTFILE-HEADER-CURRENT-SIZE*", $int151$84);
    $htfile_default_expected_items$ = defconstant("*HTFILE-DEFAULT-EXPECTED-ITEMS*", $int152$256);
    $htfile_default_average_size$ = defconstant("*HTFILE-DEFAULT-AVERAGE-SIZE*", $int152$256);
    $fht_empty_offset_marker$ = defconstant("*FHT-EMPTY-OFFSET-MARKER*", ZERO_INTEGER);
    $fht_tombstone_offset_marker$ = defconstant("*FHT-TOMBSTONE-OFFSET-MARKER*", ONE_INTEGER);
    $fht_invalid_hash_code$ = defconstant("*FHT-INVALID-HASH-CODE*", ZERO_INTEGER);
    $fht_tombstone_key_entry$ = deflexical("*FHT-TOMBSTONE-KEY-ENTRY*", construct_tombstone_key_entry());
    $fht_empty_key_entry$ = deflexical("*FHT-EMPTY-KEY-ENTRY*", construct_empty_key_entry());
    $dtp_fht_serialization_entry$ = defconstant("*DTP-FHT-SERIALIZATION-ENTRY*", $sym155$FHT_SERIALIZATION_ENTRY);
    $fht_serialization_table$ = deflexical("*FHT-SERIALIZATION-TABLE*", maybeDefault( $sym182$_FHT_SERIALIZATION_TABLE_, $fht_serialization_table$, ()-> (dictionary.new_dictionary(UNPROVIDED, UNPROVIDED))));
    $fht_not_found$ = deflexical("*FHT-NOT-FOUND*", maybeDefault( $sym202$_FHT_NOT_FOUND_, $fht_not_found$, ()-> (Symbols.make_symbol($str203$FileHashTable_Not_Found))));
    $not_in_fht$ = deflexical("*NOT-IN-FHT*", maybeDefault( $sym204$_NOT_IN_FHT_, $not_in_fht$, ()-> (Symbols.make_symbol($str205$Not_In_FHT))));
    $fast_put_skip_output_forcing$ = defparameter("*FAST-PUT-SKIP-OUTPUT-FORCING*", NIL);
    $htfile_minimal_file_block_size$ = defconstant("*HTFILE-MINIMAL-FILE-BLOCK-SIZE*", TWELVE_INTEGER);
    $dtp_htfile_file_block_entry$ = defconstant("*DTP-HTFILE-FILE-BLOCK-ENTRY*", $sym285$HTFILE_FILE_BLOCK_ENTRY);
    $htfile_key_entry_size$ = defconstant("*HTFILE-KEY-ENTRY-SIZE*", TWELVE_INTEGER);
    $fht_hash_constant_a$ = defconstant("*FHT-HASH-CONSTANT-A*", $int302$10009);
    $fht_hash_step_size$ = defconstant("*FHT-HASH-STEP-SIZE*", THIRTEEN_INTEGER);
    $fht_hash_next_step_pow2$ = defconstant("*FHT-HASH-NEXT-STEP-POW2*", SIXTEEN_INTEGER);
    $fht_dknuths_magic_cutoff$ = defconstant("*FHT-DKNUTHS-MAGIC-CUTOFF*", $int303$66);
    $keyspace_move_size$ = deflexical("*KEYSPACE-MOVE-SIZE*", Numbers.expt(TWO_INTEGER, SIXTEEN_INTEGER));
    $keyspace_rehash_cache_size$ = deflexical("*KEYSPACE-REHASH-CACHE-SIZE*", Numbers.integerDivide($keyspace_move_size$.getGlobalValue(), $htfile_key_entry_size$.getGlobalValue()));
    $htfile_object_entry_size$ = defconstant("*HTFILE-OBJECT-ENTRY-SIZE*", TWELVE_INTEGER);
    $file_hash_table_header_position$ = defconstant("*FILE-HASH-TABLE-HEADER-POSITION*", ZERO_INTEGER);
    $file_hash_table_headers$ = deflexical("*FILE-HASH-TABLE-HEADERS*", maybeDefault( $sym314$_FILE_HASH_TABLE_HEADERS_, $file_hash_table_headers$, ()-> (Hashtables.make_hash_table(TEN_INTEGER, Symbols.symbol_function(EQUAL), UNPROVIDED))));
    $fast_file_hash_table_optimization_mode$ = defparameter("*FAST-FILE-HASH-TABLE-OPTIMIZATION-MODE*", $kw331$AGGRESSIVE);
    $dtp_fast_create_fht$ = defconstant("*DTP-FAST-CREATE-FHT*", $sym335$FAST_CREATE_FHT);
    $fast_fht_keyspace_alignment$ = defparameter("*FAST-FHT-KEYSPACE-ALIGNMENT*", SIXTEEN_INTEGER);
    $dtp_fast_fht_keystream_sorter$ = defconstant("*DTP-FAST-FHT-KEYSTREAM-SORTER*", $sym369$FAST_FHT_KEYSTREAM_SORTER);
    $fast_fht_sentinel_hashcode_value$ = defconstant("*FAST-FHT-SENTINEL-HASHCODE-VALUE*", MINUS_ONE_INTEGER);
    $fast_fht_sentinel_index_value$ = defconstant("*FAST-FHT-SENTINEL-INDEX-VALUE*", Numbers.expt(TWO_INTEGER, $int384$1024));
    $fast_fht_keystream_tile_size_pow2$ = defparameter("*FAST-FHT-KEYSTREAM-TILE-SIZE-POW2*", SIXTEEN_INTEGER);
    return NIL;
  }

  public static final SubLObject setup_file_hash_table_file() {
    // CVS_ID("Id: file-hash-table.lisp 128717 2009-09-08 17:00:19Z rck ");
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_file_hash_table$.getGlobalValue(), Symbols.symbol_function($sym7$FILE_HASH_TABLE_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym8$FILE_HASH_TABLE_STREAM, $sym9$_CSETF_FILE_HASH_TABLE_STREAM);
    Structures.def_csetf($sym10$FILE_HASH_TABLE_HEADER, $sym11$_CSETF_FILE_HASH_TABLE_HEADER);
    Structures.def_csetf($sym12$FILE_HASH_TABLE_LOCK, $sym13$_CSETF_FILE_HASH_TABLE_LOCK);
    Structures.def_csetf($sym14$FILE_HASH_TABLE_ENCODING_INPUT_FN, $sym15$_CSETF_FILE_HASH_TABLE_ENCODING_INPUT_FN);
    Structures.def_csetf($sym16$FILE_HASH_TABLE_ENCODING_OUTPUT_FN, $sym17$_CSETF_FILE_HASH_TABLE_ENCODING_OUTPUT_FN);
    Structures.def_csetf($sym18$FILE_HASH_TABLE_ENCODING_SIZE_FN, $sym19$_CSETF_FILE_HASH_TABLE_ENCODING_SIZE_FN);
    Structures.def_csetf($sym20$FILE_HASH_TABLE_ENCODING_KEY_INPUT_FN, $sym21$_CSETF_FILE_HASH_TABLE_ENCODING_KEY_INPUT_FN);
    Structures.def_csetf($sym22$FILE_HASH_TABLE_ENCODING_KEY_OUTPUT_FN, $sym23$_CSETF_FILE_HASH_TABLE_ENCODING_KEY_OUTPUT_FN);
    Structures.def_csetf($sym24$FILE_HASH_TABLE_TESTFN, $sym25$_CSETF_FILE_HASH_TABLE_TESTFN);
    Structures.def_csetf($sym26$FILE_HASH_TABLE_HASH_FN, $sym27$_CSETF_FILE_HASH_TABLE_HASH_FN);
    Structures.def_csetf($sym28$FILE_HASH_TABLE_INPUT_CACHE, $sym29$_CSETF_FILE_HASH_TABLE_INPUT_CACHE);
    Structures.def_csetf($sym30$FILE_HASH_TABLE_OUTPUT_CACHE, $sym31$_CSETF_FILE_HASH_TABLE_OUTPUT_CACHE);
    Structures.def_csetf($sym32$FILE_HASH_TABLE_PROPERTY_LIST, $sym33$_CSETF_FILE_HASH_TABLE_PROPERTY_LIST);
    Equality.identity($sym0$FILE_HASH_TABLE);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_htfile_header$.getGlobalValue(), Symbols.symbol_function($sym61$HTFILE_HEADER_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym62$HTFILE_HEADER_SIZE, $sym63$_CSETF_HTFILE_HEADER_SIZE);
    Structures.def_csetf($sym64$HTFILE_HEADER_VERSION_MAJOR, $sym65$_CSETF_HTFILE_HEADER_VERSION_MAJOR);
    Structures.def_csetf($sym66$HTFILE_HEADER_VERSION_MINOR, $sym67$_CSETF_HTFILE_HEADER_VERSION_MINOR);
    Structures.def_csetf($sym68$HTFILE_HEADER_OBJECT_SPACE_OFFSET, $sym69$_CSETF_HTFILE_HEADER_OBJECT_SPACE_OFFSET);
    Structures.def_csetf($sym70$HTFILE_HEADER_KEY_SPACE_OFFSET, $sym71$_CSETF_HTFILE_HEADER_KEY_SPACE_OFFSET);
    Structures.def_csetf($sym72$HTFILE_HEADER_CURRENT_HEAP_TOP, $sym73$_CSETF_HTFILE_HEADER_CURRENT_HEAP_TOP);
    Structures.def_csetf($sym74$HTFILE_HEADER_ITEM_COUNT, $sym75$_CSETF_HTFILE_HEADER_ITEM_COUNT);
    Structures.def_csetf($sym76$HTFILE_HEADER_CAPACITY, $sym77$_CSETF_HTFILE_HEADER_CAPACITY);
    Structures.def_csetf($sym78$HTFILE_HEADER_FREE_LIST_HEAD, $sym79$_CSETF_HTFILE_HEADER_FREE_LIST_HEAD);
    Structures.def_csetf($sym80$HTFILE_HEADER_DELETION_COUNT, $sym81$_CSETF_HTFILE_HEADER_DELETION_COUNT);
    Structures.def_csetf($sym82$HTFILE_HEADER_HEADER_CRC, $sym83$_CSETF_HTFILE_HEADER_HEADER_CRC);
    Structures.def_csetf($sym84$HTFILE_HEADER_EXTENSION_SPACE_SIZE, $sym85$_CSETF_HTFILE_HEADER_EXTENSION_SPACE_SIZE);
    Structures.def_csetf($sym86$HTFILE_HEADER_EXTENSION_SPACE, $sym87$_CSETF_HTFILE_HEADER_EXTENSION_SPACE);
    Equality.identity($sym55$HTFILE_HEADER);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_htfile_object_entry$.getGlobalValue(), Symbols.symbol_function($sym118$HTFILE_OBJECT_ENTRY_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym119$HTFILE_OBJECT_ENTRY_SIZE, $sym120$_CSETF_HTFILE_OBJECT_ENTRY_SIZE);
    Structures.def_csetf($sym121$HTFILE_OBJECT_ENTRY_TYPE, $sym122$_CSETF_HTFILE_OBJECT_ENTRY_TYPE);
    Structures.def_csetf($sym123$HTFILE_OBJECT_ENTRY_KEY_SIZE, $sym124$_CSETF_HTFILE_OBJECT_ENTRY_KEY_SIZE);
    Structures.def_csetf($sym125$HTFILE_OBJECT_ENTRY_KEY, $sym126$_CSETF_HTFILE_OBJECT_ENTRY_KEY);
    Structures.def_csetf($sym127$HTFILE_OBJECT_ENTRY_DATA_SIZE, $sym128$_CSETF_HTFILE_OBJECT_ENTRY_DATA_SIZE);
    Structures.def_csetf($sym129$HTFILE_OBJECT_ENTRY_DATA, $sym130$_CSETF_HTFILE_OBJECT_ENTRY_DATA);
    Equality.identity($sym112$HTFILE_OBJECT_ENTRY);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_htfile_key_entry$.getGlobalValue(), Symbols.symbol_function($sym142$HTFILE_KEY_ENTRY_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym143$HTFILE_KEY_ENTRY_KEY_OFFSET, $sym144$_CSETF_HTFILE_KEY_ENTRY_KEY_OFFSET);
    Structures.def_csetf($sym145$HTFILE_KEY_ENTRY_HASH_CODE, $sym146$_CSETF_HTFILE_KEY_ENTRY_HASH_CODE);
    Equality.identity($sym136$HTFILE_KEY_ENTRY);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_fht_serialization_entry$.getGlobalValue(), Symbols.symbol_function($sym162$FHT_SERIALIZATION_ENTRY_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym163$FHT_SE_ENCODING_INPUT_FN, $sym164$_CSETF_FHT_SE_ENCODING_INPUT_FN);
    Structures.def_csetf($sym165$FHT_SE_ENCODING_OUTPUT_FN, $sym166$_CSETF_FHT_SE_ENCODING_OUTPUT_FN);
    Structures.def_csetf($sym167$FHT_SE_ENCODING_SIZE_FN, $sym168$_CSETF_FHT_SE_ENCODING_SIZE_FN);
    Structures.def_csetf($sym169$FHT_SE_HASH_FN, $sym170$_CSETF_FHT_SE_HASH_FN);
    Structures.def_csetf($sym171$FHT_SE_ENCODING_KEY_INPUT_FN, $sym172$_CSETF_FHT_SE_ENCODING_KEY_INPUT_FN);
    Structures.def_csetf($sym173$FHT_SE_ENCODING_KEY_OUTPUT_FN, $sym174$_CSETF_FHT_SE_ENCODING_KEY_OUTPUT_FN);
    Equality.identity($sym155$FHT_SERIALIZATION_ENTRY);
    subl_macro_promotions.declare_defglobal($sym182$_FHT_SERIALIZATION_TABLE_);
    register_fht_serialization_entry($kw149$IMAGE_DEPENDENT_CFASL, $list188);
    register_fht_serialization_entry($kw189$IMAGE_INDEPENDENT_CFASL, $list190);
    register_fht_serialization_entry($kw191$HL_EXTERNALIZED_KEYS, $list192);
    subl_macro_promotions.declare_defglobal($sym202$_FHT_NOT_FOUND_);
    subl_macro_promotions.declare_defglobal($sym204$_NOT_IN_FHT_);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_htfile_file_block_entry$.getGlobalValue(), Symbols.symbol_function($sym292$HTFILE_FILE_BLOCK_ENTRY_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym293$HTFILE_FILE_BLOCK_ENTRY_SIZE, $sym294$_CSETF_HTFILE_FILE_BLOCK_ENTRY_SIZE);
    Structures.def_csetf($sym295$HTFILE_FILE_BLOCK_ENTRY_NEXT, $sym296$_CSETF_HTFILE_FILE_BLOCK_ENTRY_NEXT);
    Equality.identity($sym285$HTFILE_FILE_BLOCK_ENTRY);
    subl_macro_promotions.declare_defglobal($sym314$_FILE_HASH_TABLE_HEADERS_);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_fast_create_fht$.getGlobalValue(), Symbols.symbol_function($sym341$FAST_CREATE_FHT_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym342$FAST_CREATE_FHT_FHT, $sym343$_CSETF_FAST_CREATE_FHT_FHT);
    Structures.def_csetf($sym344$FAST_CREATE_FHT_TEMPSTEM, $sym345$_CSETF_FAST_CREATE_FHT_TEMPSTEM);
    Structures.def_csetf($sym346$FAST_CREATE_FHT_TEMPFILE, $sym347$_CSETF_FAST_CREATE_FHT_TEMPFILE);
    Structures.def_csetf($sym348$FAST_CREATE_FHT_KEYSTREAM, $sym349$_CSETF_FAST_CREATE_FHT_KEYSTREAM);
    Equality.identity($sym335$FAST_CREATE_FHT);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_fast_fht_keystream_sorter$.getGlobalValue(), Symbols.symbol_function($sym375$FAST_FHT_KEYSTREAM_SORTER_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym376$FSTFHT_KSORTER_TEMPSTEM, $sym377$_CSETF_FSTFHT_KSORTER_TEMPSTEM);
    Structures.def_csetf($sym378$FSTFHT_KSORTER_IN_FILES, $sym379$_CSETF_FSTFHT_KSORTER_IN_FILES);
    Structures.def_csetf($sym380$FSTFHT_KSORTER_OUT_FILES, $sym381$_CSETF_FSTFHT_KSORTER_OUT_FILES);
    Equality.identity($sym369$FAST_FHT_KEYSTREAM_SORTER);
    generic_testing.define_test_case_table_int($sym424$TEST_FAST_FHT_KEYSTREAM_ENTRY_CMP, list(new SubLObject[] {$kw425$TEST, EQ, $kw426$OWNER, NIL, $kw427$CLASSES, NIL, $kw428$KB, $kw429$TINY, $kw430$WORKING_, T}), $list431);
    generic_testing.define_test_case_table_int($sym454$TEST_FAST_FHT_CREATION_WITH_MERGE_SORTED_KEYSTREAM, list(new SubLObject[] {$kw425$TEST, EQ, $kw426$OWNER, NIL, $kw427$CLASSES, NIL, $kw428$KB, $kw429$TINY, $kw430$WORKING_, T}), $list455);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$FILE_HASH_TABLE = makeSymbol("FILE-HASH-TABLE");
  public static final SubLSymbol $sym1$FILE_HASH_TABLE_P = makeSymbol("FILE-HASH-TABLE-P");
  public static final SubLList $list2 = list(new SubLObject[] {makeSymbol("STREAM"), makeSymbol("HEADER"), makeSymbol("LOCK"), makeSymbol("ENCODING-INPUT-FN"), makeSymbol("ENCODING-OUTPUT-FN"), makeSymbol("ENCODING-SIZE-FN"), makeSymbol("ENCODING-KEY-INPUT-FN"), makeSymbol("ENCODING-KEY-OUTPUT-FN"), makeSymbol("TESTFN"), makeSymbol("HASH-FN"), makeSymbol("INPUT-CACHE"), makeSymbol("OUTPUT-CACHE"), makeSymbol("PROPERTY-LIST")});
  public static final SubLList $list3 = list(new SubLObject[] {makeKeyword("STREAM"), makeKeyword("HEADER"), makeKeyword("LOCK"), makeKeyword("ENCODING-INPUT-FN"), makeKeyword("ENCODING-OUTPUT-FN"), makeKeyword("ENCODING-SIZE-FN"), makeKeyword("ENCODING-KEY-INPUT-FN"), makeKeyword("ENCODING-KEY-OUTPUT-FN"), makeKeyword("TESTFN"), makeKeyword("HASH-FN"), makeKeyword("INPUT-CACHE"), makeKeyword("OUTPUT-CACHE"), makeKeyword("PROPERTY-LIST")});
  public static final SubLList $list4 = list(new SubLObject[] {makeSymbol("FILE-HASH-TABLE-STREAM"), makeSymbol("FILE-HASH-TABLE-HEADER"), makeSymbol("FILE-HASH-TABLE-LOCK"), makeSymbol("FILE-HASH-TABLE-ENCODING-INPUT-FN"), makeSymbol("FILE-HASH-TABLE-ENCODING-OUTPUT-FN"), makeSymbol("FILE-HASH-TABLE-ENCODING-SIZE-FN"), makeSymbol("FILE-HASH-TABLE-ENCODING-KEY-INPUT-FN"), makeSymbol("FILE-HASH-TABLE-ENCODING-KEY-OUTPUT-FN"), makeSymbol("FILE-HASH-TABLE-TESTFN"), makeSymbol("FILE-HASH-TABLE-HASH-FN"), makeSymbol("FILE-HASH-TABLE-INPUT-CACHE"), makeSymbol("FILE-HASH-TABLE-OUTPUT-CACHE"), makeSymbol("FILE-HASH-TABLE-PROPERTY-LIST")});
  public static final SubLList $list5 = list(new SubLObject[] {makeSymbol("_CSETF-FILE-HASH-TABLE-STREAM"), makeSymbol("_CSETF-FILE-HASH-TABLE-HEADER"), makeSymbol("_CSETF-FILE-HASH-TABLE-LOCK"), makeSymbol("_CSETF-FILE-HASH-TABLE-ENCODING-INPUT-FN"), makeSymbol("_CSETF-FILE-HASH-TABLE-ENCODING-OUTPUT-FN"), makeSymbol("_CSETF-FILE-HASH-TABLE-ENCODING-SIZE-FN"), makeSymbol("_CSETF-FILE-HASH-TABLE-ENCODING-KEY-INPUT-FN"), makeSymbol("_CSETF-FILE-HASH-TABLE-ENCODING-KEY-OUTPUT-FN"), makeSymbol("_CSETF-FILE-HASH-TABLE-TESTFN"), makeSymbol("_CSETF-FILE-HASH-TABLE-HASH-FN"), makeSymbol("_CSETF-FILE-HASH-TABLE-INPUT-CACHE"), makeSymbol("_CSETF-FILE-HASH-TABLE-OUTPUT-CACHE"), makeSymbol("_CSETF-FILE-HASH-TABLE-PROPERTY-LIST")});
  public static final SubLSymbol $sym6$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
  public static final SubLSymbol $sym7$FILE_HASH_TABLE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("FILE-HASH-TABLE-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym8$FILE_HASH_TABLE_STREAM = makeSymbol("FILE-HASH-TABLE-STREAM");
  public static final SubLSymbol $sym9$_CSETF_FILE_HASH_TABLE_STREAM = makeSymbol("_CSETF-FILE-HASH-TABLE-STREAM");
  public static final SubLSymbol $sym10$FILE_HASH_TABLE_HEADER = makeSymbol("FILE-HASH-TABLE-HEADER");
  public static final SubLSymbol $sym11$_CSETF_FILE_HASH_TABLE_HEADER = makeSymbol("_CSETF-FILE-HASH-TABLE-HEADER");
  public static final SubLSymbol $sym12$FILE_HASH_TABLE_LOCK = makeSymbol("FILE-HASH-TABLE-LOCK");
  public static final SubLSymbol $sym13$_CSETF_FILE_HASH_TABLE_LOCK = makeSymbol("_CSETF-FILE-HASH-TABLE-LOCK");
  public static final SubLSymbol $sym14$FILE_HASH_TABLE_ENCODING_INPUT_FN = makeSymbol("FILE-HASH-TABLE-ENCODING-INPUT-FN");
  public static final SubLSymbol $sym15$_CSETF_FILE_HASH_TABLE_ENCODING_INPUT_FN = makeSymbol("_CSETF-FILE-HASH-TABLE-ENCODING-INPUT-FN");
  public static final SubLSymbol $sym16$FILE_HASH_TABLE_ENCODING_OUTPUT_FN = makeSymbol("FILE-HASH-TABLE-ENCODING-OUTPUT-FN");
  public static final SubLSymbol $sym17$_CSETF_FILE_HASH_TABLE_ENCODING_OUTPUT_FN = makeSymbol("_CSETF-FILE-HASH-TABLE-ENCODING-OUTPUT-FN");
  public static final SubLSymbol $sym18$FILE_HASH_TABLE_ENCODING_SIZE_FN = makeSymbol("FILE-HASH-TABLE-ENCODING-SIZE-FN");
  public static final SubLSymbol $sym19$_CSETF_FILE_HASH_TABLE_ENCODING_SIZE_FN = makeSymbol("_CSETF-FILE-HASH-TABLE-ENCODING-SIZE-FN");
  public static final SubLSymbol $sym20$FILE_HASH_TABLE_ENCODING_KEY_INPUT_FN = makeSymbol("FILE-HASH-TABLE-ENCODING-KEY-INPUT-FN");
  public static final SubLSymbol $sym21$_CSETF_FILE_HASH_TABLE_ENCODING_KEY_INPUT_FN = makeSymbol("_CSETF-FILE-HASH-TABLE-ENCODING-KEY-INPUT-FN");
  public static final SubLSymbol $sym22$FILE_HASH_TABLE_ENCODING_KEY_OUTPUT_FN = makeSymbol("FILE-HASH-TABLE-ENCODING-KEY-OUTPUT-FN");
  public static final SubLSymbol $sym23$_CSETF_FILE_HASH_TABLE_ENCODING_KEY_OUTPUT_FN = makeSymbol("_CSETF-FILE-HASH-TABLE-ENCODING-KEY-OUTPUT-FN");
  public static final SubLSymbol $sym24$FILE_HASH_TABLE_TESTFN = makeSymbol("FILE-HASH-TABLE-TESTFN");
  public static final SubLSymbol $sym25$_CSETF_FILE_HASH_TABLE_TESTFN = makeSymbol("_CSETF-FILE-HASH-TABLE-TESTFN");
  public static final SubLSymbol $sym26$FILE_HASH_TABLE_HASH_FN = makeSymbol("FILE-HASH-TABLE-HASH-FN");
  public static final SubLSymbol $sym27$_CSETF_FILE_HASH_TABLE_HASH_FN = makeSymbol("_CSETF-FILE-HASH-TABLE-HASH-FN");
  public static final SubLSymbol $sym28$FILE_HASH_TABLE_INPUT_CACHE = makeSymbol("FILE-HASH-TABLE-INPUT-CACHE");
  public static final SubLSymbol $sym29$_CSETF_FILE_HASH_TABLE_INPUT_CACHE = makeSymbol("_CSETF-FILE-HASH-TABLE-INPUT-CACHE");
  public static final SubLSymbol $sym30$FILE_HASH_TABLE_OUTPUT_CACHE = makeSymbol("FILE-HASH-TABLE-OUTPUT-CACHE");
  public static final SubLSymbol $sym31$_CSETF_FILE_HASH_TABLE_OUTPUT_CACHE = makeSymbol("_CSETF-FILE-HASH-TABLE-OUTPUT-CACHE");
  public static final SubLSymbol $sym32$FILE_HASH_TABLE_PROPERTY_LIST = makeSymbol("FILE-HASH-TABLE-PROPERTY-LIST");
  public static final SubLSymbol $sym33$_CSETF_FILE_HASH_TABLE_PROPERTY_LIST = makeSymbol("_CSETF-FILE-HASH-TABLE-PROPERTY-LIST");
  public static final SubLSymbol $kw34$STREAM = makeKeyword("STREAM");
  public static final SubLSymbol $kw35$HEADER = makeKeyword("HEADER");
  public static final SubLSymbol $kw36$LOCK = makeKeyword("LOCK");
  public static final SubLSymbol $kw37$ENCODING_INPUT_FN = makeKeyword("ENCODING-INPUT-FN");
  public static final SubLSymbol $kw38$ENCODING_OUTPUT_FN = makeKeyword("ENCODING-OUTPUT-FN");
  public static final SubLSymbol $kw39$ENCODING_SIZE_FN = makeKeyword("ENCODING-SIZE-FN");
  public static final SubLSymbol $kw40$ENCODING_KEY_INPUT_FN = makeKeyword("ENCODING-KEY-INPUT-FN");
  public static final SubLSymbol $kw41$ENCODING_KEY_OUTPUT_FN = makeKeyword("ENCODING-KEY-OUTPUT-FN");
  public static final SubLSymbol $kw42$TESTFN = makeKeyword("TESTFN");
  public static final SubLSymbol $kw43$HASH_FN = makeKeyword("HASH-FN");
  public static final SubLSymbol $kw44$INPUT_CACHE = makeKeyword("INPUT-CACHE");
  public static final SubLSymbol $kw45$OUTPUT_CACHE = makeKeyword("OUTPUT-CACHE");
  public static final SubLSymbol $kw46$PROPERTY_LIST = makeKeyword("PROPERTY-LIST");
  public static final SubLString $str47$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str48$__FHT__Stream___A_Lock___A___ = makeString("#<FHT: Stream: ~A Lock: ~A ~%");
  public static final SubLString $str49$_Test___A__ = makeString(" Test: ~A~%");
  public static final SubLString $str50$_Encoding__Input__A_Output__A_Siz = makeString(" Encoding: Input ~A Output ~A Sizing ~A~%");
  public static final SubLString $str51$_Key_Encoding__Input__A_Output__A = makeString(" Key Encoding: Input ~A Output ~A~%");
  public static final SubLString $str52$_Hashing___A__ = makeString(" Hashing: ~A~%");
  public static final SubLString $str53$_Caches__Input__A_Output__A____ = makeString(" Caches: Input ~A Output ~A >~%");
  public static final SubLString $str54$_Properties___A__ = makeString(" Properties: ~A~%");
  public static final SubLSymbol $sym55$HTFILE_HEADER = makeSymbol("HTFILE-HEADER");
  public static final SubLSymbol $sym56$HTFILE_HEADER_P = makeSymbol("HTFILE-HEADER-P");
  public static final SubLList $list57 = list(new SubLObject[] {makeSymbol("SIZE"), makeSymbol("VERSION-MAJOR"), makeSymbol("VERSION-MINOR"), makeSymbol("OBJECT-SPACE-OFFSET"), makeSymbol("KEY-SPACE-OFFSET"), makeSymbol("CURRENT-HEAP-TOP"), makeSymbol("ITEM-COUNT"), makeSymbol("CAPACITY"), makeSymbol("FREE-LIST-HEAD"), makeSymbol("DELETION-COUNT"), makeSymbol("HEADER-CRC"), makeSymbol("EXTENSION-SPACE-SIZE"), makeSymbol("EXTENSION-SPACE")});
  public static final SubLList $list58 = list(new SubLObject[] {makeKeyword("SIZE"), makeKeyword("VERSION-MAJOR"), makeKeyword("VERSION-MINOR"), makeKeyword("OBJECT-SPACE-OFFSET"), makeKeyword("KEY-SPACE-OFFSET"), makeKeyword("CURRENT-HEAP-TOP"), makeKeyword("ITEM-COUNT"), makeKeyword("CAPACITY"), makeKeyword("FREE-LIST-HEAD"), makeKeyword("DELETION-COUNT"), makeKeyword("HEADER-CRC"), makeKeyword("EXTENSION-SPACE-SIZE"), makeKeyword("EXTENSION-SPACE")});
  public static final SubLList $list59 = list(new SubLObject[] {makeSymbol("HTFILE-HEADER-SIZE"), makeSymbol("HTFILE-HEADER-VERSION-MAJOR"), makeSymbol("HTFILE-HEADER-VERSION-MINOR"), makeSymbol("HTFILE-HEADER-OBJECT-SPACE-OFFSET"), makeSymbol("HTFILE-HEADER-KEY-SPACE-OFFSET"), makeSymbol("HTFILE-HEADER-CURRENT-HEAP-TOP"), makeSymbol("HTFILE-HEADER-ITEM-COUNT"), makeSymbol("HTFILE-HEADER-CAPACITY"), makeSymbol("HTFILE-HEADER-FREE-LIST-HEAD"), makeSymbol("HTFILE-HEADER-DELETION-COUNT"), makeSymbol("HTFILE-HEADER-HEADER-CRC"), makeSymbol("HTFILE-HEADER-EXTENSION-SPACE-SIZE"), makeSymbol("HTFILE-HEADER-EXTENSION-SPACE")});
  public static final SubLList $list60 = list(new SubLObject[] {makeSymbol("_CSETF-HTFILE-HEADER-SIZE"), makeSymbol("_CSETF-HTFILE-HEADER-VERSION-MAJOR"), makeSymbol("_CSETF-HTFILE-HEADER-VERSION-MINOR"), makeSymbol("_CSETF-HTFILE-HEADER-OBJECT-SPACE-OFFSET"), makeSymbol("_CSETF-HTFILE-HEADER-KEY-SPACE-OFFSET"), makeSymbol("_CSETF-HTFILE-HEADER-CURRENT-HEAP-TOP"), makeSymbol("_CSETF-HTFILE-HEADER-ITEM-COUNT"), makeSymbol("_CSETF-HTFILE-HEADER-CAPACITY"), makeSymbol("_CSETF-HTFILE-HEADER-FREE-LIST-HEAD"), makeSymbol("_CSETF-HTFILE-HEADER-DELETION-COUNT"), makeSymbol("_CSETF-HTFILE-HEADER-HEADER-CRC"), makeSymbol("_CSETF-HTFILE-HEADER-EXTENSION-SPACE-SIZE"), makeSymbol("_CSETF-HTFILE-HEADER-EXTENSION-SPACE")});
  public static final SubLSymbol $sym61$HTFILE_HEADER_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("HTFILE-HEADER-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym62$HTFILE_HEADER_SIZE = makeSymbol("HTFILE-HEADER-SIZE");
  public static final SubLSymbol $sym63$_CSETF_HTFILE_HEADER_SIZE = makeSymbol("_CSETF-HTFILE-HEADER-SIZE");
  public static final SubLSymbol $sym64$HTFILE_HEADER_VERSION_MAJOR = makeSymbol("HTFILE-HEADER-VERSION-MAJOR");
  public static final SubLSymbol $sym65$_CSETF_HTFILE_HEADER_VERSION_MAJOR = makeSymbol("_CSETF-HTFILE-HEADER-VERSION-MAJOR");
  public static final SubLSymbol $sym66$HTFILE_HEADER_VERSION_MINOR = makeSymbol("HTFILE-HEADER-VERSION-MINOR");
  public static final SubLSymbol $sym67$_CSETF_HTFILE_HEADER_VERSION_MINOR = makeSymbol("_CSETF-HTFILE-HEADER-VERSION-MINOR");
  public static final SubLSymbol $sym68$HTFILE_HEADER_OBJECT_SPACE_OFFSET = makeSymbol("HTFILE-HEADER-OBJECT-SPACE-OFFSET");
  public static final SubLSymbol $sym69$_CSETF_HTFILE_HEADER_OBJECT_SPACE_OFFSET = makeSymbol("_CSETF-HTFILE-HEADER-OBJECT-SPACE-OFFSET");
  public static final SubLSymbol $sym70$HTFILE_HEADER_KEY_SPACE_OFFSET = makeSymbol("HTFILE-HEADER-KEY-SPACE-OFFSET");
  public static final SubLSymbol $sym71$_CSETF_HTFILE_HEADER_KEY_SPACE_OFFSET = makeSymbol("_CSETF-HTFILE-HEADER-KEY-SPACE-OFFSET");
  public static final SubLSymbol $sym72$HTFILE_HEADER_CURRENT_HEAP_TOP = makeSymbol("HTFILE-HEADER-CURRENT-HEAP-TOP");
  public static final SubLSymbol $sym73$_CSETF_HTFILE_HEADER_CURRENT_HEAP_TOP = makeSymbol("_CSETF-HTFILE-HEADER-CURRENT-HEAP-TOP");
  public static final SubLSymbol $sym74$HTFILE_HEADER_ITEM_COUNT = makeSymbol("HTFILE-HEADER-ITEM-COUNT");
  public static final SubLSymbol $sym75$_CSETF_HTFILE_HEADER_ITEM_COUNT = makeSymbol("_CSETF-HTFILE-HEADER-ITEM-COUNT");
  public static final SubLSymbol $sym76$HTFILE_HEADER_CAPACITY = makeSymbol("HTFILE-HEADER-CAPACITY");
  public static final SubLSymbol $sym77$_CSETF_HTFILE_HEADER_CAPACITY = makeSymbol("_CSETF-HTFILE-HEADER-CAPACITY");
  public static final SubLSymbol $sym78$HTFILE_HEADER_FREE_LIST_HEAD = makeSymbol("HTFILE-HEADER-FREE-LIST-HEAD");
  public static final SubLSymbol $sym79$_CSETF_HTFILE_HEADER_FREE_LIST_HEAD = makeSymbol("_CSETF-HTFILE-HEADER-FREE-LIST-HEAD");
  public static final SubLSymbol $sym80$HTFILE_HEADER_DELETION_COUNT = makeSymbol("HTFILE-HEADER-DELETION-COUNT");
  public static final SubLSymbol $sym81$_CSETF_HTFILE_HEADER_DELETION_COUNT = makeSymbol("_CSETF-HTFILE-HEADER-DELETION-COUNT");
  public static final SubLSymbol $sym82$HTFILE_HEADER_HEADER_CRC = makeSymbol("HTFILE-HEADER-HEADER-CRC");
  public static final SubLSymbol $sym83$_CSETF_HTFILE_HEADER_HEADER_CRC = makeSymbol("_CSETF-HTFILE-HEADER-HEADER-CRC");
  public static final SubLSymbol $sym84$HTFILE_HEADER_EXTENSION_SPACE_SIZE = makeSymbol("HTFILE-HEADER-EXTENSION-SPACE-SIZE");
  public static final SubLSymbol $sym85$_CSETF_HTFILE_HEADER_EXTENSION_SPACE_SIZE = makeSymbol("_CSETF-HTFILE-HEADER-EXTENSION-SPACE-SIZE");
  public static final SubLSymbol $sym86$HTFILE_HEADER_EXTENSION_SPACE = makeSymbol("HTFILE-HEADER-EXTENSION-SPACE");
  public static final SubLSymbol $sym87$_CSETF_HTFILE_HEADER_EXTENSION_SPACE = makeSymbol("_CSETF-HTFILE-HEADER-EXTENSION-SPACE");
  public static final SubLSymbol $kw88$SIZE = makeKeyword("SIZE");
  public static final SubLSymbol $kw89$VERSION_MAJOR = makeKeyword("VERSION-MAJOR");
  public static final SubLSymbol $kw90$VERSION_MINOR = makeKeyword("VERSION-MINOR");
  public static final SubLSymbol $kw91$OBJECT_SPACE_OFFSET = makeKeyword("OBJECT-SPACE-OFFSET");
  public static final SubLSymbol $kw92$KEY_SPACE_OFFSET = makeKeyword("KEY-SPACE-OFFSET");
  public static final SubLSymbol $kw93$CURRENT_HEAP_TOP = makeKeyword("CURRENT-HEAP-TOP");
  public static final SubLSymbol $kw94$ITEM_COUNT = makeKeyword("ITEM-COUNT");
  public static final SubLSymbol $kw95$CAPACITY = makeKeyword("CAPACITY");
  public static final SubLSymbol $kw96$FREE_LIST_HEAD = makeKeyword("FREE-LIST-HEAD");
  public static final SubLSymbol $kw97$DELETION_COUNT = makeKeyword("DELETION-COUNT");
  public static final SubLSymbol $kw98$HEADER_CRC = makeKeyword("HEADER-CRC");
  public static final SubLSymbol $kw99$EXTENSION_SPACE_SIZE = makeKeyword("EXTENSION-SPACE-SIZE");
  public static final SubLSymbol $kw100$EXTENSION_SPACE = makeKeyword("EXTENSION-SPACE");
  public static final SubLString $str101$__HTFile_Header__Size__A_Format_V = makeString("#<HTFile-Header: Size=~A Format-Version ~A.~A~%");
  public static final SubLString $str102$_ObjSpace_Offset__0x_X___D___KeyS = makeString(" ObjSpace Offset: 0x~X (~D)  KeySpace Offset: 0x~X (~D) HeapTop: 0x~X (~D)~%");
  public static final SubLString $str103$_Item_Count___A__Capacity___A__ = makeString(" Item Count: ~A  Capacity: ~A~%");
  public static final SubLString $str104$_FreeListHead___A_ = makeString(" FreeListHead: ~A ");
  public static final SubLString $str105$_no_free_list_ = makeString(" no free-list ");
  public static final SubLString $str106$_Deletions___A_ = makeString(" Deletions: ~A ");
  public static final SubLString $str107$_no_deletions_ = makeString(" no deletions ");
  public static final SubLString $str108$_CRC___A_ = makeString(" CRC: ~A ");
  public static final SubLString $str109$_no_CRC_support_ = makeString(" no CRC support ");
  public static final SubLString $str110$_Extension_Space____A____A____ = makeString(" Extension Space: (~A) |~A| ~%");
  public static final SubLString $str111$__ = makeString("> ");
  public static final SubLSymbol $sym112$HTFILE_OBJECT_ENTRY = makeSymbol("HTFILE-OBJECT-ENTRY");
  public static final SubLSymbol $sym113$HTFILE_OBJECT_ENTRY_P = makeSymbol("HTFILE-OBJECT-ENTRY-P");
  public static final SubLList $list114 = list(makeSymbol("SIZE"), makeSymbol("TYPE"), makeSymbol("KEY-SIZE"), makeSymbol("KEY"), makeSymbol("DATA-SIZE"), makeSymbol("DATA"));
  public static final SubLList $list115 = list(makeKeyword("SIZE"), makeKeyword("TYPE"), makeKeyword("KEY-SIZE"), makeKeyword("KEY"), makeKeyword("DATA-SIZE"), makeKeyword("DATA"));
  public static final SubLList $list116 = list(makeSymbol("HTFILE-OBJECT-ENTRY-SIZE"), makeSymbol("HTFILE-OBJECT-ENTRY-TYPE"), makeSymbol("HTFILE-OBJECT-ENTRY-KEY-SIZE"), makeSymbol("HTFILE-OBJECT-ENTRY-KEY"), makeSymbol("HTFILE-OBJECT-ENTRY-DATA-SIZE"), makeSymbol("HTFILE-OBJECT-ENTRY-DATA"));
  public static final SubLList $list117 = list(makeSymbol("_CSETF-HTFILE-OBJECT-ENTRY-SIZE"), makeSymbol("_CSETF-HTFILE-OBJECT-ENTRY-TYPE"), makeSymbol("_CSETF-HTFILE-OBJECT-ENTRY-KEY-SIZE"), makeSymbol("_CSETF-HTFILE-OBJECT-ENTRY-KEY"), makeSymbol("_CSETF-HTFILE-OBJECT-ENTRY-DATA-SIZE"), makeSymbol("_CSETF-HTFILE-OBJECT-ENTRY-DATA"));
  public static final SubLSymbol $sym118$HTFILE_OBJECT_ENTRY_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("HTFILE-OBJECT-ENTRY-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym119$HTFILE_OBJECT_ENTRY_SIZE = makeSymbol("HTFILE-OBJECT-ENTRY-SIZE");
  public static final SubLSymbol $sym120$_CSETF_HTFILE_OBJECT_ENTRY_SIZE = makeSymbol("_CSETF-HTFILE-OBJECT-ENTRY-SIZE");
  public static final SubLSymbol $sym121$HTFILE_OBJECT_ENTRY_TYPE = makeSymbol("HTFILE-OBJECT-ENTRY-TYPE");
  public static final SubLSymbol $sym122$_CSETF_HTFILE_OBJECT_ENTRY_TYPE = makeSymbol("_CSETF-HTFILE-OBJECT-ENTRY-TYPE");
  public static final SubLSymbol $sym123$HTFILE_OBJECT_ENTRY_KEY_SIZE = makeSymbol("HTFILE-OBJECT-ENTRY-KEY-SIZE");
  public static final SubLSymbol $sym124$_CSETF_HTFILE_OBJECT_ENTRY_KEY_SIZE = makeSymbol("_CSETF-HTFILE-OBJECT-ENTRY-KEY-SIZE");
  public static final SubLSymbol $sym125$HTFILE_OBJECT_ENTRY_KEY = makeSymbol("HTFILE-OBJECT-ENTRY-KEY");
  public static final SubLSymbol $sym126$_CSETF_HTFILE_OBJECT_ENTRY_KEY = makeSymbol("_CSETF-HTFILE-OBJECT-ENTRY-KEY");
  public static final SubLSymbol $sym127$HTFILE_OBJECT_ENTRY_DATA_SIZE = makeSymbol("HTFILE-OBJECT-ENTRY-DATA-SIZE");
  public static final SubLSymbol $sym128$_CSETF_HTFILE_OBJECT_ENTRY_DATA_SIZE = makeSymbol("_CSETF-HTFILE-OBJECT-ENTRY-DATA-SIZE");
  public static final SubLSymbol $sym129$HTFILE_OBJECT_ENTRY_DATA = makeSymbol("HTFILE-OBJECT-ENTRY-DATA");
  public static final SubLSymbol $sym130$_CSETF_HTFILE_OBJECT_ENTRY_DATA = makeSymbol("_CSETF-HTFILE-OBJECT-ENTRY-DATA");
  public static final SubLSymbol $kw131$TYPE = makeKeyword("TYPE");
  public static final SubLSymbol $kw132$KEY_SIZE = makeKeyword("KEY-SIZE");
  public static final SubLSymbol $kw133$KEY = makeKeyword("KEY");
  public static final SubLSymbol $kw134$DATA_SIZE = makeKeyword("DATA-SIZE");
  public static final SubLSymbol $kw135$DATA = makeKeyword("DATA");
  public static final SubLSymbol $sym136$HTFILE_KEY_ENTRY = makeSymbol("HTFILE-KEY-ENTRY");
  public static final SubLSymbol $sym137$HTFILE_KEY_ENTRY_P = makeSymbol("HTFILE-KEY-ENTRY-P");
  public static final SubLList $list138 = list(makeSymbol("KEY-OFFSET"), makeSymbol("HASH-CODE"));
  public static final SubLList $list139 = list(makeKeyword("KEY-OFFSET"), makeKeyword("HASH-CODE"));
  public static final SubLList $list140 = list(makeSymbol("HTFILE-KEY-ENTRY-KEY-OFFSET"), makeSymbol("HTFILE-KEY-ENTRY-HASH-CODE"));
  public static final SubLList $list141 = list(makeSymbol("_CSETF-HTFILE-KEY-ENTRY-KEY-OFFSET"), makeSymbol("_CSETF-HTFILE-KEY-ENTRY-HASH-CODE"));
  public static final SubLSymbol $sym142$HTFILE_KEY_ENTRY_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("HTFILE-KEY-ENTRY-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym143$HTFILE_KEY_ENTRY_KEY_OFFSET = makeSymbol("HTFILE-KEY-ENTRY-KEY-OFFSET");
  public static final SubLSymbol $sym144$_CSETF_HTFILE_KEY_ENTRY_KEY_OFFSET = makeSymbol("_CSETF-HTFILE-KEY-ENTRY-KEY-OFFSET");
  public static final SubLSymbol $sym145$HTFILE_KEY_ENTRY_HASH_CODE = makeSymbol("HTFILE-KEY-ENTRY-HASH-CODE");
  public static final SubLSymbol $sym146$_CSETF_HTFILE_KEY_ENTRY_HASH_CODE = makeSymbol("_CSETF-HTFILE-KEY-ENTRY-HASH-CODE");
  public static final SubLSymbol $kw147$KEY_OFFSET = makeKeyword("KEY-OFFSET");
  public static final SubLSymbol $kw148$HASH_CODE = makeKeyword("HASH-CODE");
  public static final SubLSymbol $kw149$IMAGE_DEPENDENT_CFASL = makeKeyword("IMAGE-DEPENDENT-CFASL");
  public static final SubLInteger $int150$2000 = makeInteger(2000);
  public static final SubLInteger $int151$84 = makeInteger(84);
  public static final SubLInteger $int152$256 = makeInteger(256);
  public static final SubLSymbol $sym153$SXHASH = makeSymbol("SXHASH");
  public static final SubLString $str154$File_Hash_Table_Lock = makeString("File Hash Table Lock");
  public static final SubLSymbol $sym155$FHT_SERIALIZATION_ENTRY = makeSymbol("FHT-SERIALIZATION-ENTRY");
  public static final SubLSymbol $sym156$FHT_SERIALIZATION_ENTRY_P = makeSymbol("FHT-SERIALIZATION-ENTRY-P");
  public static final SubLList $list157 = list(makeSymbol("ENCODING-INPUT-FN"), makeSymbol("ENCODING-OUTPUT-FN"), makeSymbol("ENCODING-SIZE-FN"), makeSymbol("HASH-FN"), makeSymbol("ENCODING-KEY-INPUT-FN"), makeSymbol("ENCODING-KEY-OUTPUT-FN"));
  public static final SubLList $list158 = list(makeKeyword("ENCODING-INPUT-FN"), makeKeyword("ENCODING-OUTPUT-FN"), makeKeyword("ENCODING-SIZE-FN"), makeKeyword("HASH-FN"), makeKeyword("ENCODING-KEY-INPUT-FN"), makeKeyword("ENCODING-KEY-OUTPUT-FN"));
  public static final SubLList $list159 = list(makeSymbol("FHT-SE-ENCODING-INPUT-FN"), makeSymbol("FHT-SE-ENCODING-OUTPUT-FN"), makeSymbol("FHT-SE-ENCODING-SIZE-FN"), makeSymbol("FHT-SE-HASH-FN"), makeSymbol("FHT-SE-ENCODING-KEY-INPUT-FN"), makeSymbol("FHT-SE-ENCODING-KEY-OUTPUT-FN"));
  public static final SubLList $list160 = list(makeSymbol("_CSETF-FHT-SE-ENCODING-INPUT-FN"), makeSymbol("_CSETF-FHT-SE-ENCODING-OUTPUT-FN"), makeSymbol("_CSETF-FHT-SE-ENCODING-SIZE-FN"), makeSymbol("_CSETF-FHT-SE-HASH-FN"), makeSymbol("_CSETF-FHT-SE-ENCODING-KEY-INPUT-FN"), makeSymbol("_CSETF-FHT-SE-ENCODING-KEY-OUTPUT-FN"));
  public static final SubLSymbol $sym161$PRINT_FHT_SERIALIZATION_ENTRY = makeSymbol("PRINT-FHT-SERIALIZATION-ENTRY");
  public static final SubLSymbol $sym162$FHT_SERIALIZATION_ENTRY_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("FHT-SERIALIZATION-ENTRY-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym163$FHT_SE_ENCODING_INPUT_FN = makeSymbol("FHT-SE-ENCODING-INPUT-FN");
  public static final SubLSymbol $sym164$_CSETF_FHT_SE_ENCODING_INPUT_FN = makeSymbol("_CSETF-FHT-SE-ENCODING-INPUT-FN");
  public static final SubLSymbol $sym165$FHT_SE_ENCODING_OUTPUT_FN = makeSymbol("FHT-SE-ENCODING-OUTPUT-FN");
  public static final SubLSymbol $sym166$_CSETF_FHT_SE_ENCODING_OUTPUT_FN = makeSymbol("_CSETF-FHT-SE-ENCODING-OUTPUT-FN");
  public static final SubLSymbol $sym167$FHT_SE_ENCODING_SIZE_FN = makeSymbol("FHT-SE-ENCODING-SIZE-FN");
  public static final SubLSymbol $sym168$_CSETF_FHT_SE_ENCODING_SIZE_FN = makeSymbol("_CSETF-FHT-SE-ENCODING-SIZE-FN");
  public static final SubLSymbol $sym169$FHT_SE_HASH_FN = makeSymbol("FHT-SE-HASH-FN");
  public static final SubLSymbol $sym170$_CSETF_FHT_SE_HASH_FN = makeSymbol("_CSETF-FHT-SE-HASH-FN");
  public static final SubLSymbol $sym171$FHT_SE_ENCODING_KEY_INPUT_FN = makeSymbol("FHT-SE-ENCODING-KEY-INPUT-FN");
  public static final SubLSymbol $sym172$_CSETF_FHT_SE_ENCODING_KEY_INPUT_FN = makeSymbol("_CSETF-FHT-SE-ENCODING-KEY-INPUT-FN");
  public static final SubLSymbol $sym173$FHT_SE_ENCODING_KEY_OUTPUT_FN = makeSymbol("FHT-SE-ENCODING-KEY-OUTPUT-FN");
  public static final SubLSymbol $sym174$_CSETF_FHT_SE_ENCODING_KEY_OUTPUT_FN = makeSymbol("_CSETF-FHT-SE-ENCODING-KEY-OUTPUT-FN");
  public static final SubLString $str175$__FHT_Serialization__Input_Fn____ = makeString("#<FHT-Serialization: Input Fn:    ~S~%");
  public static final SubLString $str176$_____________________Output_Fn___ = makeString("                     Output Fn:   ~S~%");
  public static final SubLString $str177$_____________________Size_Fn_____ = makeString("                     Size Fn:     ~S~%");
  public static final SubLString $str178$_____________________Hash_Fn_____ = makeString("                     Hash Fn:     ~S~%");
  public static final SubLString $str179$_____________________Key_Input___ = makeString("                     Key Input    ~S~%");
  public static final SubLString $str180$_____________________Key_Output__ = makeString("                     Key Output    ~S~%");
  public static final SubLString $str181$_ = makeString(">");
  public static final SubLSymbol $sym182$_FHT_SERIALIZATION_TABLE_ = makeSymbol("*FHT-SERIALIZATION-TABLE*");
  public static final SubLList $list183 = list(list(makeSymbol("SERIALIZATION"), makeSymbol("SERIALIZATION-ENTRY"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list184 = list(makeKeyword("DONE"));
  public static final SubLSymbol $kw185$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw186$DONE = makeKeyword("DONE");
  public static final SubLSymbol $sym187$DO_DICTIONARY = makeSymbol("DO-DICTIONARY");
  public static final SubLList $list188 = list(makeKeyword("ENCODING-INPUT-FN"), makeSymbol("CFASL-INPUT"), makeKeyword("ENCODING-OUTPUT-FN"), makeSymbol("CFASL-OUTPUT"), makeKeyword("ENCODING-SIZE-FN"), makeSymbol("CFASL-OBJECT-SIZE"), makeKeyword("HASH-FN"), makeSymbol("SXHASH"));
  public static final SubLSymbol $kw189$IMAGE_INDEPENDENT_CFASL = makeKeyword("IMAGE-INDEPENDENT-CFASL");
  public static final SubLList $list190 = list(makeKeyword("ENCODING-INPUT-FN"), makeSymbol("CFASL-INPUT"), makeKeyword("ENCODING-OUTPUT-FN"), makeSymbol("CFASL-OUTPUT-EXTERNALIZED"), makeKeyword("ENCODING-SIZE-FN"), makeSymbol("CFASL-EXTERNALIZED-OBJECT-SIZE"), makeKeyword("HASH-FN"), makeSymbol("SXHASH-EXTERNAL"));
  public static final SubLSymbol $kw191$HL_EXTERNALIZED_KEYS = makeKeyword("HL-EXTERNALIZED-KEYS");
  public static final SubLList $list192 = list(new SubLObject[] {makeKeyword("ENCODING-INPUT-FN"), makeSymbol("CFASL-INPUT"), makeKeyword("ENCODING-OUTPUT-FN"), makeSymbol("CFASL-OUTPUT-EXTERNALIZED"), makeKeyword("ENCODING-SIZE-FN"), makeSymbol("CFASL-EXTERNALIZED-OBJECT-SIZE"), makeKeyword("HASH-FN"), makeSymbol("SXHASH-EXTERNAL"), makeKeyword("ENCODING-KEY-INPUT-FN"), makeSymbol("FIND-OBJECT-BY-HL-EXTERNAL-ID-STRING"), makeKeyword("ENCODING-KEY-OUTPUT-FN"), makeSymbol("HL-EXTERNAL-ID-STRING")});
  public static final SubLSymbol $kw193$IO = makeKeyword("IO");
  public static final SubLSymbol $kw194$DIRECTION = makeKeyword("DIRECTION");
  public static final SubLSymbol $kw195$IF_EXISTS = makeKeyword("IF-EXISTS");
  public static final SubLSymbol $kw196$OVERWRITE = makeKeyword("OVERWRITE");
  public static final SubLSymbol $kw197$IF_DOES_NOT_EXIST = makeKeyword("IF-DOES-NOT-EXIST");
  public static final SubLSymbol $kw198$ERROR = makeKeyword("ERROR");
  public static final SubLSymbol $kw199$ELEMENT_TYPE = makeKeyword("ELEMENT-TYPE");
  public static final SubLSymbol $kw200$BINARY = makeKeyword("BINARY");
  public static final SubLSymbol $kw201$INPUT = makeKeyword("INPUT");
  public static final SubLSymbol $sym202$_FHT_NOT_FOUND_ = makeSymbol("*FHT-NOT-FOUND*");
  public static final SubLString $str203$FileHashTable_Not_Found = makeString("FileHashTable Not Found");
  public static final SubLSymbol $sym204$_NOT_IN_FHT_ = makeSymbol("*NOT-IN-FHT*");
  public static final SubLString $str205$Not_In_FHT = makeString("Not In FHT");
  public static final SubLSymbol $kw206$FOUND = makeKeyword("FOUND");
  public static final SubLString $str207$The_key__S_maps_to_the_non_numeri = makeString("The key ~S maps to the non-numeric value ~S in the file-hash-table ~A.");
  public static final SubLList $list208 = list(list(makeSymbol("KEY"), makeSymbol("VAL"), makeSymbol("FHT"), makeSymbol("DONE-VAR"), makeSymbol("&OPTIONAL"), makeSymbol("KEYS-ONLY?")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym209$THE_KEY = makeUninternedSymbol("THE-KEY");
  public static final SubLSymbol $sym210$THE_VALUE = makeUninternedSymbol("THE-VALUE");
  public static final SubLSymbol $sym211$CONTINUATION = makeUninternedSymbol("CONTINUATION");
  public static final SubLSymbol $sym212$NEXT = makeUninternedSymbol("NEXT");
  public static final SubLSymbol $sym213$COMPLETE_ = makeUninternedSymbol("COMPLETE?");
  public static final SubLSymbol $sym214$CLET = makeSymbol("CLET");
  public static final SubLList $list215 = list(NIL);
  public static final SubLSymbol $sym216$WHILE = makeSymbol("WHILE");
  public static final SubLSymbol $sym217$CAND = makeSymbol("CAND");
  public static final SubLSymbol $sym218$CNOT = makeSymbol("CNOT");
  public static final SubLSymbol $sym219$CMULTIPLE_VALUE_BIND = makeSymbol("CMULTIPLE-VALUE-BIND");
  public static final SubLSymbol $sym220$GET_FILE_HASH_TABLE_ANY = makeSymbol("GET-FILE-HASH-TABLE-ANY");
  public static final SubLSymbol $sym221$PUNLESS = makeSymbol("PUNLESS");
  public static final SubLSymbol $sym222$NULL = makeSymbol("NULL");
  public static final SubLSymbol $sym223$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $sym224$CSETQ = makeSymbol("CSETQ");
  public static final SubLList $list225 = list(list(makeSymbol("KEY"), makeSymbol("VALUE"), makeSymbol("FHT"), makeSymbol("&KEY"), makeSymbol("MESSAGE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list226 = list(makeKeyword("MESSAGE"), makeKeyword("DONE"));
  public static final SubLSymbol $kw227$MESSAGE = makeKeyword("MESSAGE");
  public static final SubLSymbol $sym228$TABLE_VAR = makeUninternedSymbol("TABLE-VAR");
  public static final SubLSymbol $sym229$_PROGRESS_NOTE_ = makeSymbol("*PROGRESS-NOTE*");
  public static final SubLList $list230 = list(makeSymbol("CSETQ"), makeSymbol("*PROGRESS-START-TIME*"), list(makeSymbol("GET-UNIVERSAL-TIME")));
  public static final SubLSymbol $sym231$_PROGRESS_TOTAL_ = makeSymbol("*PROGRESS-TOTAL*");
  public static final SubLSymbol $sym232$FILE_HASH_TABLE_COUNT = makeSymbol("FILE-HASH-TABLE-COUNT");
  public static final SubLList $list233 = list(makeSymbol("CSETQ"), makeSymbol("*PROGRESS-SOFAR*"), ZERO_INTEGER);
  public static final SubLSymbol $sym234$NOTING_PERCENT_PROGRESS = makeSymbol("NOTING-PERCENT-PROGRESS");
  public static final SubLSymbol $sym235$DO_FILE_HASH_TABLE = makeSymbol("DO-FILE-HASH-TABLE");
  public static final SubLList $list236 = list(makeSymbol("NOTE-PERCENT-PROGRESS"), makeSymbol("*PROGRESS-SOFAR*"), makeSymbol("*PROGRESS-TOTAL*"));
  public static final SubLList $list237 = list(makeSymbol("CINC"), makeSymbol("*PROGRESS-SOFAR*"));
  public static final SubLSymbol $sym238$DOSOME_FILE_HASH_TABLE = makeSymbol("DOSOME-FILE-HASH-TABLE");
  public static final SubLString $str239$_S_____S__ = makeString("~S -> ~S~%");
  public static final SubLList $list240 = list(list(makeSymbol("KEY"), makeSymbol("VALUE"), makeSymbol("FHT"), makeSymbol("&OPTIONAL"), list(makeSymbol("MESSAGE"), makeString("do-file-hash-table"))), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLString $str241$do_file_hash_table = makeString("do-file-hash-table");
  public static final SubLSymbol $sym242$PROGRESS_DO_FILE_HASH_TABLE = makeSymbol("PROGRESS-DO-FILE-HASH-TABLE");
  public static final SubLList $list243 = list(makeSymbol("DO-FILE-HASH-TABLE"));
  public static final SubLList $list244 = list(list(makeSymbol("KEY"), makeSymbol("FHT"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym245$DOSOME_FILE_HASH_TABLE_KEYS = makeSymbol("DOSOME-FILE-HASH-TABLE-KEYS");
  public static final SubLList $list246 = list(makeSymbol("DO-FILE-HASH-TABLE-KEYS"));
  public static final SubLSymbol $sym247$DO_FILE_HASH_TABLE_KEYS = makeSymbol("DO-FILE-HASH-TABLE-KEYS");
  public static final SubLList $list248 = list(list(makeSymbol("KEY"), makeSymbol("FHT"), makeSymbol("&KEY"), makeSymbol("MESSAGE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym249$FHT_VAR = makeUninternedSymbol("FHT-VAR");
  public static final SubLSymbol $sym250$VALUE = makeUninternedSymbol("VALUE");
  public static final SubLList $list251 = list(T);
  public static final SubLSymbol $sym252$IGNORE = makeSymbol("IGNORE");
  public static final SubLList $list253 = list(list(makeSymbol("KEY"), makeSymbol("FHT"), makeSymbol("&OPTIONAL"), list(makeSymbol("MESSAGE"), makeString("do-file-hash-table-keys"))), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLString $str254$do_file_hash_table_keys = makeString("do-file-hash-table-keys");
  public static final SubLSymbol $sym255$PROGRESS_DO_FILE_HASH_TABLE_KEYS = makeSymbol("PROGRESS-DO-FILE-HASH-TABLE-KEYS");
  public static final SubLSymbol $sym256$NON_NEGATIVE_INTEGER_P = makeSymbol("NON-NEGATIVE-INTEGER-P");
  public static final SubLSymbol $sym257$_ = makeSymbol("<");
  public static final SubLString $str258$Invalid_key_entry__A__Offset_0x_X = makeString("Invalid key entry ~A: Offset 0x~X (~A) HashCode ~A~%");
  public static final SubLString $str259$FHT_for__A_corrupted___A_____A__A = makeString("FHT for ~A corrupted; ~A != ~A+~A+ -- cannot recover in this fashion.~%");
  public static final SubLString $str260$Entry__A___A_bytes_total___A_byte = makeString("Entry ~A: ~A bytes total, ~A bytes key size, ~A bytes object size (+ ~A bytes header).~%");
  public static final SubLSymbol $sym261$ITERATE_FILE_HASH_TABLE_DONE_ = makeSymbol("ITERATE-FILE-HASH-TABLE-DONE?");
  public static final SubLSymbol $sym262$ITERATE_FILE_HASH_TABLE_NEXT_VALUE = makeSymbol("ITERATE-FILE-HASH-TABLE-NEXT-VALUE");
  public static final SubLSymbol $sym263$ITERATE_FILE_HASH_TABLE_NEXT = makeSymbol("ITERATE-FILE-HASH-TABLE-NEXT");
  public static final SubLSymbol $kw264$START = makeKeyword("START");
  public static final SubLList $list265 = list(makeSymbol("CURRENT"), makeSymbol("FHT"), makeSymbol("KEYS-ONLY?"), makeSymbol("FINALIZE-FHT?"));
  public static final SubLSymbol $kw266$UNINITIALIZED = makeKeyword("UNINITIALIZED");
  public static final SubLString $str267$converting_file_hash_table_to_ali = makeString("converting file-hash-table to alist");
  public static final SubLString $str268$tmp_ = makeString("tmp/");
  public static final SubLSymbol $sym269$HASH_TABLE_P = makeSymbol("HASH-TABLE-P");
  public static final SubLString $str270$ = makeString("");
  public static final SubLString $str271$_tmp_ = makeString("/tmp/");
  public static final SubLSymbol $sym272$LISTP = makeSymbol("LISTP");
  public static final SubLSymbol $sym273$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $kw274$STORAGE_RESOURCING = makeKeyword("STORAGE-RESOURCING");
  public static final SubLInteger $int275$100 = makeInteger(100);
  public static final SubLSymbol $kw276$KEY_ONLY = makeKeyword("KEY-ONLY");
  public static final SubLSymbol $kw277$FULL = makeKeyword("FULL");
  public static final SubLSymbol $kw278$NOT_FOUND = makeKeyword("NOT-FOUND");
  public static final SubLSymbol $kw279$TABLE_FULL = makeKeyword("TABLE-FULL");
  public static final SubLString $str280$Cannot_put_into_table__table_is_f = makeString("Cannot put into table; table is full and cannot grow.");
  public static final SubLString $str281$Implementation_Error__Unexpected_ = makeString("Implementation Error: Unexpected status ~A returned by FHT-LOOKUP-KEY. (KEY = ~A, INDEX = ~A.)");
  public static final SubLSymbol $sym282$COR = makeSymbol("COR");
  public static final SubLString $str283$Can_neither_find_key__S_nor_prove = makeString("Can neither find key ~S nor prove its non-presence. Ensure that your encoding function and your test function work correctly together, i.e. (funcall testfn <OBJ> (cfasl-decoding (cfasl-encoding <OBJ))) -> T. If they are, then this is an implementation error. (INDEX = ~A, STATUS = ~A, KEY-ENTRY = ~A)");
  public static final SubLString $str284$Cannot_get_key__S_from_table__Imp = makeString("Cannot get key ~S from table: Implementation error (INDEX = ~A, STATUS = ~A, KEY-ENTRY = ~A).");
  public static final SubLSymbol $sym285$HTFILE_FILE_BLOCK_ENTRY = makeSymbol("HTFILE-FILE-BLOCK-ENTRY");
  public static final SubLSymbol $sym286$HTFILE_FILE_BLOCK_ENTRY_P = makeSymbol("HTFILE-FILE-BLOCK-ENTRY-P");
  public static final SubLList $list287 = list(makeSymbol("SIZE"), makeSymbol("NEXT"));
  public static final SubLList $list288 = list(makeKeyword("SIZE"), makeKeyword("NEXT"));
  public static final SubLList $list289 = list(makeSymbol("HTFILE-FILE-BLOCK-ENTRY-SIZE"), makeSymbol("HTFILE-FILE-BLOCK-ENTRY-NEXT"));
  public static final SubLList $list290 = list(makeSymbol("_CSETF-HTFILE-FILE-BLOCK-ENTRY-SIZE"), makeSymbol("_CSETF-HTFILE-FILE-BLOCK-ENTRY-NEXT"));
  public static final SubLSymbol $sym291$PRINT_HTFILE_FILE_BLOCK_ENTRY = makeSymbol("PRINT-HTFILE-FILE-BLOCK-ENTRY");
  public static final SubLSymbol $sym292$HTFILE_FILE_BLOCK_ENTRY_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("HTFILE-FILE-BLOCK-ENTRY-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym293$HTFILE_FILE_BLOCK_ENTRY_SIZE = makeSymbol("HTFILE-FILE-BLOCK-ENTRY-SIZE");
  public static final SubLSymbol $sym294$_CSETF_HTFILE_FILE_BLOCK_ENTRY_SIZE = makeSymbol("_CSETF-HTFILE-FILE-BLOCK-ENTRY-SIZE");
  public static final SubLSymbol $sym295$HTFILE_FILE_BLOCK_ENTRY_NEXT = makeSymbol("HTFILE-FILE-BLOCK-ENTRY-NEXT");
  public static final SubLSymbol $sym296$_CSETF_HTFILE_FILE_BLOCK_ENTRY_NEXT = makeSymbol("_CSETF-HTFILE-FILE-BLOCK-ENTRY-NEXT");
  public static final SubLSymbol $kw297$NEXT = makeKeyword("NEXT");
  public static final SubLString $str298$__FILE_BLOCK_ENTRY__s__s_ = makeString("#<FILE-BLOCK-ENTRY:~s:~s>");
  public static final SubLString $str299$Unable_to_position_to_file_pos__D = makeString("Unable to position to file-pos ~D; true position is.");
  public static final SubLString $str300$Unable_to_position_to_file_pos__A = makeString("Unable to position to file-pos ~A; true position is ~A.");
  public static final SubLString $str301$Invalid_key_index__D_into_key_spa = makeString("Invalid key index ~D into key space [0,~D).");
  public static final SubLInteger $int302$10009 = makeInteger(10009);
  public static final SubLInteger $int303$66 = makeInteger(66);
  public static final SubLList $list304 = list(list(makeSymbol("FHT"), makeSymbol("DIFF-KEYSPACE"), makeSymbol("DIFF-CAPACITY")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym305$HEADER_LOCAL = makeUninternedSymbol("HEADER-LOCAL");
  public static final SubLSymbol $sym306$KEYSPACE_TEMP = makeUninternedSymbol("KEYSPACE-TEMP");
  public static final SubLSymbol $sym307$CAPACITY_TEMP = makeUninternedSymbol("CAPACITY-TEMP");
  public static final SubLSymbol $sym308$CSETF = makeSymbol("CSETF");
  public static final SubLString $str309$Internal_error__S_during_table_re = makeString("Internal error ~S during table rehashing; file might be corrupted.");
  public static final SubLSymbol $kw310$VALID = makeKeyword("VALID");
  public static final SubLString $str311$Cannot_correctly_determine_file_p = makeString("Cannot correctly determine file position after writing object entry of ~D bytes to ~D.");
  public static final SubLString $str312$Predicted_object_size__D_did_not_ = makeString("Predicted object size ~D did not match I/O size ~D; file might be corrupted.");
  public static final SubLString $str313$Claimed_object_size__D_did_not_ma = makeString("Claimed object size ~D did not match I/O size ~D; file might be corrupted.");
  public static final SubLSymbol $sym314$_FILE_HASH_TABLE_HEADERS_ = makeSymbol("*FILE-HASH-TABLE-HEADERS*");
  public static final SubLList $list315 = list(makeSymbol("VMAJOR"), makeSymbol("VMINOR"), makeSymbol("READER"), makeSymbol("WRITER"), makeSymbol("VERIFIER"));
  public static final SubLSymbol $kw316$READER = makeKeyword("READER");
  public static final SubLSymbol $kw317$WRITER = makeKeyword("WRITER");
  public static final SubLSymbol $kw318$VERIFIER = makeKeyword("VERIFIER");
  public static final SubLSymbol $sym319$SETHASH = makeSymbol("SETHASH");
  public static final SubLInteger $int320$32792 = makeInteger(32792);
  public static final SubLInteger $int321$32784 = makeInteger(32784);
  public static final SubLInteger $int322$32776 = makeInteger(32776);
  public static final SubLInteger $int323$32768 = makeInteger(32768);
  public static final SubLInteger $int324$32824 = makeInteger(32824);
  public static final SubLInteger $int325$32816 = makeInteger(32816);
  public static final SubLInteger $int326$32808 = makeInteger(32808);
  public static final SubLInteger $int327$32800 = makeInteger(32800);
  public static final SubLString $str328$After_reading__S__computed_positi = makeString("After reading ~S, computed position ~D /= actual file position ~D.");
  public static final SubLSymbol $kw329$EOF = makeKeyword("EOF");
  public static final SubLString $str330$Premature_end_of_file_when_moving = makeString("Premature end-of-file when moving block (~D bytes) from ~D to ~D.");
  public static final SubLSymbol $kw331$AGGRESSIVE = makeKeyword("AGGRESSIVE");
  public static final SubLSymbol $kw332$MODERATE = makeKeyword("MODERATE");
  public static final SubLSymbol $kw333$CONSERVATIVE = makeKeyword("CONSERVATIVE");
  public static final SubLString $str334$Invalid_Fast_FHT_optimization_mod = makeString("Invalid Fast-FHT optimization mode ~A.");
  public static final SubLSymbol $sym335$FAST_CREATE_FHT = makeSymbol("FAST-CREATE-FHT");
  public static final SubLSymbol $sym336$FAST_CREATE_FHT_P = makeSymbol("FAST-CREATE-FHT-P");
  public static final SubLList $list337 = list(makeSymbol("FHT"), makeSymbol("TEMPSTEM"), makeSymbol("TEMPFILE"), makeSymbol("KEYSTREAM"));
  public static final SubLList $list338 = list(makeKeyword("FHT"), makeKeyword("TEMPSTEM"), makeKeyword("TEMPFILE"), makeKeyword("KEYSTREAM"));
  public static final SubLList $list339 = list(makeSymbol("FAST-CREATE-FHT-FHT"), makeSymbol("FAST-CREATE-FHT-TEMPSTEM"), makeSymbol("FAST-CREATE-FHT-TEMPFILE"), makeSymbol("FAST-CREATE-FHT-KEYSTREAM"));
  public static final SubLList $list340 = list(makeSymbol("_CSETF-FAST-CREATE-FHT-FHT"), makeSymbol("_CSETF-FAST-CREATE-FHT-TEMPSTEM"), makeSymbol("_CSETF-FAST-CREATE-FHT-TEMPFILE"), makeSymbol("_CSETF-FAST-CREATE-FHT-KEYSTREAM"));
  public static final SubLSymbol $sym341$FAST_CREATE_FHT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("FAST-CREATE-FHT-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym342$FAST_CREATE_FHT_FHT = makeSymbol("FAST-CREATE-FHT-FHT");
  public static final SubLSymbol $sym343$_CSETF_FAST_CREATE_FHT_FHT = makeSymbol("_CSETF-FAST-CREATE-FHT-FHT");
  public static final SubLSymbol $sym344$FAST_CREATE_FHT_TEMPSTEM = makeSymbol("FAST-CREATE-FHT-TEMPSTEM");
  public static final SubLSymbol $sym345$_CSETF_FAST_CREATE_FHT_TEMPSTEM = makeSymbol("_CSETF-FAST-CREATE-FHT-TEMPSTEM");
  public static final SubLSymbol $sym346$FAST_CREATE_FHT_TEMPFILE = makeSymbol("FAST-CREATE-FHT-TEMPFILE");
  public static final SubLSymbol $sym347$_CSETF_FAST_CREATE_FHT_TEMPFILE = makeSymbol("_CSETF-FAST-CREATE-FHT-TEMPFILE");
  public static final SubLSymbol $sym348$FAST_CREATE_FHT_KEYSTREAM = makeSymbol("FAST-CREATE-FHT-KEYSTREAM");
  public static final SubLSymbol $sym349$_CSETF_FAST_CREATE_FHT_KEYSTREAM = makeSymbol("_CSETF-FAST-CREATE-FHT-KEYSTREAM");
  public static final SubLSymbol $kw350$FHT = makeKeyword("FHT");
  public static final SubLSymbol $kw351$TEMPSTEM = makeKeyword("TEMPSTEM");
  public static final SubLSymbol $kw352$TEMPFILE = makeKeyword("TEMPFILE");
  public static final SubLSymbol $kw353$KEYSTREAM = makeKeyword("KEYSTREAM");
  public static final SubLString $str354$keystream_ = makeString("keystream-");
  public static final SubLList $list355 = list(makeKeyword("ERROR"), makeKeyword("USE-FIRST"));
  public static final SubLString $str356$Unknown_NON_UNIQUE_KEY_HANDLING_v = makeString("Unknown NON-UNIQUE-KEY-HANDLING value ~S");
  public static final SubLSymbol $kw357$IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");
  public static final SubLSymbol $sym358$IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
  public static final SubLString $str359$ambiguous = makeString("ambiguous");
  public static final SubLString $str360$Unable_to_open__S = makeString("Unable to open ~S");
  public static final SubLString $str361$unambiguous = makeString("unambiguous");
  public static final SubLString $str362$Cannot_call_this_method_in_mode__ = makeString("Cannot call this method in mode ~A.");
  public static final SubLString $str363$Seeding_keyspace_with_unambiguous = makeString("Seeding keyspace with unambiguous keys ....");
  public static final SubLString $str364$Run_in_index_of_keystream__prev__ = makeString("Run in index of keystream (prev=~A curr=~A). Fix FAST-FHT-UNIQUIFY-KEYSTREAM");
  public static final SubLString $str365$Inserting_ = makeString("Inserting ");
  public static final SubLString $str366$_keys_into_keyspace_____ = makeString(" keys into keyspace ....");
  public static final SubLString $str367$Sorry__key__A_appears_not_to_be_u = makeString("Sorry, key ~A appears not to be unique within the set; fast hash table create only works for already unique sets.");
  public static final SubLSymbol $kw368$USE_FIRST = makeKeyword("USE-FIRST");
  public static final SubLSymbol $sym369$FAST_FHT_KEYSTREAM_SORTER = makeSymbol("FAST-FHT-KEYSTREAM-SORTER");
  public static final SubLSymbol $sym370$FAST_FHT_KEYSTREAM_SORTER_P = makeSymbol("FAST-FHT-KEYSTREAM-SORTER-P");
  public static final SubLList $list371 = list(makeSymbol("TEMPSTEM"), makeSymbol("IN-FILES"), makeSymbol("OUT-FILES"));
  public static final SubLList $list372 = list(makeKeyword("TEMPSTEM"), makeKeyword("IN-FILES"), makeKeyword("OUT-FILES"));
  public static final SubLList $list373 = list(makeSymbol("FSTFHT-KSORTER-TEMPSTEM"), makeSymbol("FSTFHT-KSORTER-IN-FILES"), makeSymbol("FSTFHT-KSORTER-OUT-FILES"));
  public static final SubLList $list374 = list(makeSymbol("_CSETF-FSTFHT-KSORTER-TEMPSTEM"), makeSymbol("_CSETF-FSTFHT-KSORTER-IN-FILES"), makeSymbol("_CSETF-FSTFHT-KSORTER-OUT-FILES"));
  public static final SubLSymbol $sym375$FAST_FHT_KEYSTREAM_SORTER_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("FAST-FHT-KEYSTREAM-SORTER-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym376$FSTFHT_KSORTER_TEMPSTEM = makeSymbol("FSTFHT-KSORTER-TEMPSTEM");
  public static final SubLSymbol $sym377$_CSETF_FSTFHT_KSORTER_TEMPSTEM = makeSymbol("_CSETF-FSTFHT-KSORTER-TEMPSTEM");
  public static final SubLSymbol $sym378$FSTFHT_KSORTER_IN_FILES = makeSymbol("FSTFHT-KSORTER-IN-FILES");
  public static final SubLSymbol $sym379$_CSETF_FSTFHT_KSORTER_IN_FILES = makeSymbol("_CSETF-FSTFHT-KSORTER-IN-FILES");
  public static final SubLSymbol $sym380$FSTFHT_KSORTER_OUT_FILES = makeSymbol("FSTFHT-KSORTER-OUT-FILES");
  public static final SubLSymbol $sym381$_CSETF_FSTFHT_KSORTER_OUT_FILES = makeSymbol("_CSETF-FSTFHT-KSORTER-OUT-FILES");
  public static final SubLSymbol $kw382$IN_FILES = makeKeyword("IN-FILES");
  public static final SubLSymbol $kw383$OUT_FILES = makeKeyword("OUT-FILES");
  public static final SubLInteger $int384$1024 = makeInteger(1024);
  public static final SubLString $str385$Prepare_tiled_input_files_____ = makeString("Prepare tiled input files ....");
  public static final SubLString $str386$Less_than_3_tiles__no_sort_needed = makeString("Less than 3 tiles, no sort needed ....");
  public static final SubLSymbol $kw387$OUTPUT = makeKeyword("OUTPUT");
  public static final SubLString $str388$Merge_sorting_keystream_of_ = makeString("Merge-sorting keystream of ");
  public static final SubLString $str389$_tiles_in_ = makeString(" tiles in ");
  public static final SubLString $str390$_passes____ = makeString(" passes....");
  public static final SubLString $str391$Generate_set_and_activity_files__ = makeString("Generate set and activity files ....");
  public static final SubLString $str392$in_ = makeString("in-");
  public static final SubLString $str393$out_ = makeString("out-");
  public static final SubLString $str394$Can_only_work_from_a_rewound_keys = makeString("Can only work from a rewound keystream ~A.");
  public static final SubLSymbol $sym395$FAST_FHT_KEYSTREAM_ENTRY_ = makeSymbol("FAST-FHT-KEYSTREAM-ENTRY<");
  public static final SubLSymbol $kw396$EQ = makeKeyword("EQ");
  public static final SubLSymbol $kw397$GT = makeKeyword("GT");
  public static final SubLSymbol $kw398$LT = makeKeyword("LT");
  public static final SubLSymbol $kw399$APPEND = makeKeyword("APPEND");
  public static final SubLList $list400 = list(makeUninternedSymbol("START"), makeUninternedSymbol("END"), makeUninternedSymbol("DELTA"));
  public static final SubLString $str401$_of_ = makeString(" of ");
  public static final SubLString $str402$Merge_Pass_ = makeString("Merge Pass ");
  public static final SubLString $str403$The_chunk_count_should_have_decli = makeString("The chunk count should have declined, but did not: ~A >= ~A.");
  public static final SubLString $str404$Only_sentinels_or__EOF_can_be_equ = makeString("Only sentinels or :EOF can be equal, but ~A and ~A are.");
  public static final SubLSymbol $kw405$MORE = makeKeyword("MORE");
  public static final SubLList $list406 = list(makeSymbol("FHT"), makeSymbol("INDEX"), makeSymbol("ENTRY"), makeSymbol("IN-STREAM"), makeSymbol("LOSER-ITEMS"), makeSymbol("COLLISION-STREAM"));
  public static final SubLSymbol $sym407$_ = makeSymbol("=");
  public static final SubLSymbol $sym408$FAST_FHT_GET_COMPARABLE_INDEX_FROM_ENTRY = makeSymbol("FAST-FHT-GET-COMPARABLE-INDEX-FROM-ENTRY");
  public static final SubLSymbol $sym409$FAST_FHT_WRITE_ONE_COLLISION_STREAM_ENTRY = makeSymbol("FAST-FHT-WRITE-ONE-COLLISION-STREAM-ENTRY");
  public static final SubLSymbol $sym410$FAST_FHT_READ_ONE_KEYSTREAM_ENTRY = makeSymbol("FAST-FHT-READ-ONE-KEYSTREAM-ENTRY");
  public static final SubLSymbol $sym411$CINC = makeSymbol("CINC");
  public static final SubLList $list412 = list(new SubLObject[] {makeSymbol("FHT"), makeSymbol("KEEPER-ENTRY"), makeSymbol("LOSER-ENTRY"), makeSymbol("KEEPER-STREAM"), makeSymbol("LOSER-STREAM"), makeSymbol("KEEPER-ITEMS"), makeSymbol("LOSER-ITEMS"), makeSymbol("SET-STREAM"), makeSymbol("COLLISION-STREAM")});
  public static final SubLSymbol $sym413$INDEX_KEEPER = makeUninternedSymbol("INDEX-KEEPER");
  public static final SubLSymbol $sym414$INDEX_LOSER = makeUninternedSymbol("INDEX-LOSER");
  public static final SubLSymbol $sym415$FAST_FHT_WRITE_ONE_KEYSTREAM_ENTRY = makeSymbol("FAST-FHT-WRITE-ONE-KEYSTREAM-ENTRY");
  public static final SubLSymbol $sym416$FAST_FHT_DRAIN_INDEX_RUN = makeSymbol("FAST-FHT-DRAIN-INDEX-RUN");
  public static final SubLString $str417$__A_set_item_A___A_activity_item_ = makeString(" ~A set item~A, ~A activity item~A ");
  public static final SubLString $str418$s = makeString("s");
  public static final SubLString $str419$_________________________ = makeString("=========================");
  public static final SubLString $str420$______File__A______ = makeString("~&<<<<File ~A>>>>~%");
  public static final SubLString $str421$File__A_no_does_not_contain_a_val = makeString("File ~A no does not contain a valid keystream: problem at ~A.");
  public static final SubLSymbol $kw422$MID_STREAM_EOF = makeKeyword("MID-STREAM-EOF");
  public static final SubLSymbol $kw423$UNSORTED_INDEX = makeKeyword("UNSORTED-INDEX");
  public static final SubLSymbol $sym424$TEST_FAST_FHT_KEYSTREAM_ENTRY_CMP = makeSymbol("TEST-FAST-FHT-KEYSTREAM-ENTRY-CMP");
  public static final SubLSymbol $kw425$TEST = makeKeyword("TEST");
  public static final SubLSymbol $kw426$OWNER = makeKeyword("OWNER");
  public static final SubLSymbol $kw427$CLASSES = makeKeyword("CLASSES");
  public static final SubLSymbol $kw428$KB = makeKeyword("KB");
  public static final SubLSymbol $kw429$TINY = makeKeyword("TINY");
  public static final SubLSymbol $kw430$WORKING_ = makeKeyword("WORKING?");
  public static final SubLList $list431 = list(new SubLObject[] {list(list(makeKeyword("SENTINEL"), makeKeyword("SENTINEL")), makeKeyword("EQ")), list(list(makeKeyword("EOF"), makeKeyword("EOF")), makeKeyword("EQ")), list(list(makeKeyword("SENTINEL"), makeKeyword("EOF")), makeKeyword("LT")), list(list(makeKeyword("EOF"), makeKeyword("SENTINEL")), makeKeyword("GT")), list(list(list(makeInteger(104), makeInteger(168), makeInteger(12850), makeString("137")), makeKeyword("SENTINEL")), makeKeyword("LT")), list(list(makeKeyword("SENTINEL"), list(makeInteger(104), makeInteger(168), makeInteger(12850), makeString("137"))), makeKeyword("GT")), list(list(list(makeInteger(104), makeInteger(168), makeInteger(12850), makeString("137")), makeKeyword("EOF")), makeKeyword("LT")), list(list(makeKeyword("EOF"), list(makeInteger(104), makeInteger(168), makeInteger(12850), makeString("137"))), makeKeyword("GT")), list(list(list(makeInteger(128), makeInteger(128), makeInteger(13062), makeString("97")), list(makeInteger(104), makeInteger(168), makeInteger(12850), makeString("137"))), makeKeyword("GT")), list(list(list(makeInteger(104), makeInteger(168), makeInteger(12850), makeString("137")), list(makeInteger(128), makeInteger(128), makeInteger(13062), makeString("97"))), makeKeyword("LT")), list(list(list(makeInteger(104), makeInteger(168), makeInteger(12850), makeString("137")), list(makeInteger(104), makeInteger(168), makeInteger(12850), makeString("137"))), makeKeyword("EQ"))});
  public static final SubLSymbol $kw432$SENTINEL = makeKeyword("SENTINEL");
  public static final SubLList $list433 = list(list(makeSymbol("FHT"), makeSymbol("FILENAME"), makeSymbol("&KEY"), list(makeSymbol("TEST-FN"), list(makeSymbol("QUOTE"), makeSymbol("*DEFAULT-FHT-TEST-FUNCTION*"))), list(makeSymbol("SERIALIZATION-FN"), makeSymbol("*DEFAULT-FHT-SERIALIZATION-PROTOCOL*"))), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list434 = list(makeKeyword("TEST-FN"), makeKeyword("SERIALIZATION-FN"));
  public static final SubLSymbol $kw435$TEST_FN = makeKeyword("TEST-FN");
  public static final SubLSymbol $sym436$_DEFAULT_FHT_TEST_FUNCTION_ = makeSymbol("*DEFAULT-FHT-TEST-FUNCTION*");
  public static final SubLSymbol $kw437$SERIALIZATION_FN = makeKeyword("SERIALIZATION-FN");
  public static final SubLSymbol $sym438$CUNWIND_PROTECT = makeSymbol("CUNWIND-PROTECT");
  public static final SubLSymbol $sym439$OPEN_FILE_HASH_TABLE_READ_ONLY = makeSymbol("OPEN-FILE-HASH-TABLE-READ-ONLY");
  public static final SubLSymbol $sym440$PWHEN = makeSymbol("PWHEN");
  public static final SubLSymbol $sym441$FINALIZE_FILE_HASH_TABLE = makeSymbol("FINALIZE-FILE-HASH-TABLE");
  public static final SubLSymbol $sym442$OPEN_FILE_HASH_TABLE = makeSymbol("OPEN-FILE-HASH-TABLE");
  public static final SubLList $list443 = list(list(makeSymbol("FHT"), makeSymbol("FILENAME"), makeSymbol("&KEY"), list(makeSymbol("EXPECTED-ITEMS"), makeSymbol("*HTFILE-DEFAULT-EXPECTED-ITEMS*")), list(makeSymbol("AVERAGE-SIZE"), makeSymbol("*HTFILE-DEFAULT-AVERAGE-SIZE*")), list(makeSymbol("TEST-FN"), list(makeSymbol("QUOTE"), makeSymbol("*DEFAULT-FHT-TEST-FUNCTION*"))), list(makeSymbol("SERIALIZATION-FN"), makeSymbol("*DEFAULT-FHT-SERIALIZATION-PROTOCOL*"))), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list444 = list(makeKeyword("EXPECTED-ITEMS"), makeKeyword("AVERAGE-SIZE"), makeKeyword("TEST-FN"), makeKeyword("SERIALIZATION-FN"));
  public static final SubLSymbol $kw445$EXPECTED_ITEMS = makeKeyword("EXPECTED-ITEMS");
  public static final SubLSymbol $kw446$AVERAGE_SIZE = makeKeyword("AVERAGE-SIZE");
  public static final SubLSymbol $sym447$CREATE_FILE_HASH_TABLE = makeSymbol("CREATE-FILE-HASH-TABLE");
  public static final SubLList $list448 = list(list(makeSymbol("FAST-FHT"), makeSymbol("FILENAME"), makeSymbol("&KEY"), list(makeSymbol("TEMPDIR"), list(makeSymbol("TEMP-DIRECTORY"))), list(makeSymbol("TEST-FN"), list(makeSymbol("QUOTE"), makeSymbol("*DEFAULT-FHT-TEST-FUNCTION*"))), list(makeSymbol("SERIALIZATION-FN"), makeSymbol("*DEFAULT-FHT-SERIALIZATION-PROTOCOL*")), list(makeSymbol("KEEP-TEMPORARY-KEYFILE"))), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list449 = list(makeKeyword("TEMPDIR"), makeKeyword("TEST-FN"), makeKeyword("SERIALIZATION-FN"), makeKeyword("KEEP-TEMPORARY-KEYFILE"));
  public static final SubLSymbol $kw450$TEMPDIR = makeKeyword("TEMPDIR");
  public static final SubLSymbol $kw451$KEEP_TEMPORARY_KEYFILE = makeKeyword("KEEP-TEMPORARY-KEYFILE");
  public static final SubLSymbol $sym452$FAST_CREATE_FILE_HASH_TABLE = makeSymbol("FAST-CREATE-FILE-HASH-TABLE");
  public static final SubLSymbol $sym453$FINALIZE_FAST_CREATE_FILE_HASH_TABLE = makeSymbol("FINALIZE-FAST-CREATE-FILE-HASH-TABLE");
  public static final SubLSymbol $sym454$TEST_FAST_FHT_CREATION_WITH_MERGE_SORTED_KEYSTREAM = makeSymbol("TEST-FAST-FHT-CREATION-WITH-MERGE-SORTED-KEYSTREAM");
  public static final SubLList $list455 = list(new SubLObject[] {list(list(makeInteger(31), THREE_INTEGER, makeKeyword("MODERATE")), makeKeyword("SUCCESS")), list(list(makeInteger(23), THREE_INTEGER, makeKeyword("MODERATE")), makeKeyword("SUCCESS")), list(list(FIFTEEN_INTEGER, THREE_INTEGER, makeKeyword("MODERATE")), makeKeyword("SUCCESS")), list(list(SEVEN_INTEGER, THREE_INTEGER, makeKeyword("MODERATE")), makeKeyword("SUCCESS")), list(list(makeInteger(31), THREE_INTEGER, makeKeyword("AGGRESSIVE")), makeKeyword("SUCCESS")), list(list(makeInteger(23), THREE_INTEGER, makeKeyword("AGGRESSIVE")), makeKeyword("SUCCESS")), list(list(FIFTEEN_INTEGER, THREE_INTEGER, makeKeyword("AGGRESSIVE")), makeKeyword("SUCCESS")), list(list(SEVEN_INTEGER, THREE_INTEGER, makeKeyword("AGGRESSIVE")), makeKeyword("SUCCESS")), list(list(makeInteger(31), THREE_INTEGER, makeKeyword("CONSERVATIVE")), makeKeyword("SUCCESS")), list(list(makeInteger(23), THREE_INTEGER, makeKeyword("CONSERVATIVE")), makeKeyword("SUCCESS")), list(list(FIFTEEN_INTEGER, THREE_INTEGER, makeKeyword("CONSERVATIVE")), makeKeyword("SUCCESS")), list(list(SEVEN_INTEGER, THREE_INTEGER, makeKeyword("CONSERVATIVE")), makeKeyword("SUCCESS"))});
  public static final SubLString $str456$My_String_ = makeString("My String ");
  public static final SubLString $str457$fht_ = makeString("fht-");
  public static final SubLString $str458$Writing_out_FHT_____ = makeString("Writing out FHT ....");
  public static final SubLList $list459 = list(makeSymbol("KEY"), makeSymbol("VALUES"));
  public static final SubLString $str460$Error__expected__A_items__got__A_ = makeString("Error, expected ~A items, got ~A.");
  public static final SubLString $str461$Checking_against_FHT_____ = makeString("Checking against FHT ....");
  public static final SubLString $str462$For__A__expected__A__got__A_inste = makeString("For ~A, expected ~A, got ~A instead.");
  public static final SubLString $str463$Checking_aggressively_built_FHT_a = makeString("Checking aggressively built FHT against map ...");
  public static final SubLString $str464$For__A__epxected__A__got__A_inste = makeString("For ~A, epxected ~A, got ~A instead.");
  public static final SubLSymbol $kw465$SUCCESS = makeKeyword("SUCCESS");

  //// Initializers

  public void declareFunctions() {
    declare_file_hash_table_file();
  }

  public void initializeVariables() {
    init_file_hash_table_file();
  }

  public void runTopLevelForms() {
    setup_file_hash_table_file();
  }

}
