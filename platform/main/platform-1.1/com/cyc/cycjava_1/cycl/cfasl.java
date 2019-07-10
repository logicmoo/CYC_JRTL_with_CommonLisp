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
//dm import com.cyc.cycjava_1.cycl.cfasl_compression;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.control_vars;
//dm import com.cyc.cycjava_1.cycl.hash_table_utilities;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.number_utilities;
//dm import com.cyc.cycjava_1.cycl.sdbc;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.vector_utilities;

public  final class cfasl extends SubLTranslatedFile {

  //// Constructor

  private cfasl() {}
  public static final SubLFile me = new cfasl();
  public static final String myName = "com.cyc.cycjava_1.cycl.cfasl";

  //// Definitions

  public static final class $cfasl_encoding_stream_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $internal_stream; }
    public SubLObject setField2(SubLObject value) { return $internal_stream = value; }
    public SubLObject $internal_stream = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($cfasl_encoding_stream_native.class, $sym0$CFASL_ENCODING_STREAM, $sym1$CFASL_ENCODING_STREAM_P, $list2, $list3, new String[] {"$internal_stream"}, $list4, $list5, $sym6$DEFAULT_STRUCT_PRINT_FUNCTION);
  }

  @SubL(source = "cycl/cfasl.lisp", position = 2449) 
  public static SubLSymbol $dtp_cfasl_encoding_stream$ = null;

  @SubL(source = "cycl/cfasl.lisp", position = 2449) 
  public static final SubLObject cfasl_encoding_stream_print_function_trampoline(SubLObject object, SubLObject stream) {
    compatibility.default_struct_print_function(object, stream, ZERO_INTEGER);
    return NIL;
  }

  @SubL(source = "cycl/cfasl.lisp", position = 2449) 
  public static final SubLObject cfasl_encoding_stream_p(SubLObject object) {
    return ((object.getClass() == $cfasl_encoding_stream_native.class) ? ((SubLObject) T) : NIL);
  }

  public static final class $cfasl_encoding_stream_p$UnaryFunction extends UnaryFunction {
    public $cfasl_encoding_stream_p$UnaryFunction() { super(extractFunctionNamed("CFASL-ENCODING-STREAM-P")); }
    public SubLObject processItem(SubLObject arg1) { return cfasl_encoding_stream_p(arg1); }
  }

  /** Temporary control variable, should eventually stay T. */
  @SubL(source = "cycl/cfasl.lisp", position = 5492) 
  private static SubLSymbol $terse_guid_serialization_enabledP$ = null;

  /** Temporary control variable, the only controls whether cfasl-econde-externalized-terse uses terse GUID serialization */
  @SubL(source = "cycl/cfasl.lisp", position = 5614) 
  public static SubLSymbol $terse_guid_serialization_enabled_for_cfasl_encode_externalizedP$ = null;

  public static final class $cfasl_decoding_stream_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $internal_stream; }
    public SubLObject setField2(SubLObject value) { return $internal_stream = value; }
    public SubLObject $internal_stream = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($cfasl_decoding_stream_native.class, $sym28$CFASL_DECODING_STREAM, $sym29$CFASL_DECODING_STREAM_P, $list2, $list3, new String[] {"$internal_stream"}, $list30, $list31, $sym6$DEFAULT_STRUCT_PRINT_FUNCTION);
  }

  @SubL(source = "cycl/cfasl.lisp", position = 6745) 
  public static SubLSymbol $dtp_cfasl_decoding_stream$ = null;

  @SubL(source = "cycl/cfasl.lisp", position = 6745) 
  public static final SubLObject cfasl_decoding_stream_print_function_trampoline(SubLObject object, SubLObject stream) {
    compatibility.default_struct_print_function(object, stream, ZERO_INTEGER);
    return NIL;
  }

  @SubL(source = "cycl/cfasl.lisp", position = 6745) 
  public static final SubLObject cfasl_decoding_stream_p(SubLObject object) {
    return ((object.getClass() == $cfasl_decoding_stream_native.class) ? ((SubLObject) T) : NIL);
  }

  public static final class $cfasl_decoding_stream_p$UnaryFunction extends UnaryFunction {
    public $cfasl_decoding_stream_p$UnaryFunction() { super(extractFunctionNamed("CFASL-DECODING-STREAM-P")); }
    public SubLObject processItem(SubLObject arg1) { return cfasl_decoding_stream_p(arg1); }
  }

  public static final class $cfasl_count_stream_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $position; }
    public SubLObject setField2(SubLObject value) { return $position = value; }
    public SubLObject $position = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($cfasl_count_stream_native.class, $sym43$CFASL_COUNT_STREAM, $sym44$CFASL_COUNT_STREAM_P, $list45, $list46, new String[] {"$position"}, $list47, $list48, $sym6$DEFAULT_STRUCT_PRINT_FUNCTION);
  }

  @SubL(source = "cycl/cfasl.lisp", position = 9427) 
  public static SubLSymbol $dtp_cfasl_count_stream$ = null;

  @SubL(source = "cycl/cfasl.lisp", position = 9427) 
  public static final SubLObject cfasl_count_stream_print_function_trampoline(SubLObject object, SubLObject stream) {
    compatibility.default_struct_print_function(object, stream, ZERO_INTEGER);
    return NIL;
  }

  @SubL(source = "cycl/cfasl.lisp", position = 9427) 
  public static final SubLObject cfasl_count_stream_p(SubLObject object) {
    return ((object.getClass() == $cfasl_count_stream_native.class) ? ((SubLObject) T) : NIL);
  }

  public static final class $cfasl_count_stream_p$UnaryFunction extends UnaryFunction {
    public $cfasl_count_stream_p$UnaryFunction() { super(extractFunctionNamed("CFASL-COUNT-STREAM-P")); }
    public SubLObject processItem(SubLObject arg1) { return cfasl_count_stream_p(arg1); }
  }

  @SubL(source = "cycl/cfasl.lisp", position = 11114) 
  public static SubLSymbol $cfasl_stream_extensions_enabled$ = null;

  @SubL(source = "cycl/cfasl.lisp", position = 11425) 
  public static SubLSymbol $cfasl_unread_byte$ = null;

  /** Output OBJECT to STREAM in the CFASL protocol.
   The encoding is relevant to this image only. */
  @SubL(source = "cycl/cfasl.lisp", position = 11711) 
  public static final SubLObject cfasl_output(SubLObject object, SubLObject stream) {
    if ((NIL != cfasl_compression.cfasl_compress_objectP(object))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12988");
    } else {
      return cfasl_output_object(object, stream);
    }
  }

  /** Output OBJECT to STREAM in the CFASL protocol.
   The encoding is relevant to any image, not just this one. */
  @SubL(source = "cycl/cfasl.lisp", position = 13331) 
  public static final SubLObject cfasl_output_externalized(SubLObject object, SubLObject stream) {
    return cfasl_output_externalization(object, stream);
  }

  @SubL(source = "cycl/cfasl.lisp", position = 13816) 
  public static SubLSymbol $cfasl_output_object_method_table$ = null;

  @SubL(source = "cycl/cfasl.lisp", position = 13816) 
  public static final SubLObject cfasl_output_object(SubLObject object, SubLObject stream) {
    {
      SubLObject method_function = Structures.method_func(object, $cfasl_output_object_method_table$.getGlobalValue());
      if ((NIL != method_function)) {
        return Functions.funcall(method_function, object, stream);
      }
      if ((NIL == Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31000"))) {
        {
          SubLObject msg = NIL;
          try {
            {
              SubLObject _prev_bind_0 = Dynamic.currentBinding(Errors.$error_handler$);
              try {
                Dynamic.bind(Errors.$error_handler$, $sym59$CATCH_ERROR_MESSAGE_HANDLER);
                try {
                  cfasl_output_defstruct_recipe(object, stream);
                } catch (Throwable catch_var) {
                  Errors.handleThrowable(catch_var, NIL);
                }
              } finally {
                Dynamic.rebind(Errors.$error_handler$, _prev_bind_0);
              }
            }
          } catch (Throwable ccatch_env_var) {
            msg = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
          }
          if (msg.isString()) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30984");
            return NIL;
          }
        }
      }
      return object;
    }
  }

  @SubL(source = "cycl/cfasl.lisp", position = 14280) 
  public static final SubLObject cfasl_raw_write_byte(SubLObject v_byte, SubLObject stream) {
    if ((NIL != cfasl_count_stream_p(stream))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30957");
    } else if ((NIL != cfasl_encoding_stream_p(stream))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30966");
    }
    return streams_high.write_byte(v_byte, stream);
  }

  /** If non-nil, then structure created during CFASL input is allocated in the static area. */
  @SubL(source = "cycl/cfasl.lisp", position = 14821) 
  public static SubLSymbol $cfasl_input_to_static_area$ = null;

  /** Input an object from STREAM in the CFASL protocol.
EOF-ERROR-P indicates whether an end-of-file is considered an error.
EOF-VALUE indicates a value to return when end-of-file is encountered and eof-error-p is nil. */
  @SubL(source = "cycl/cfasl.lisp", position = 15014) 
  public static final SubLObject cfasl_input(SubLObject stream, SubLObject eof_error_p, SubLObject eof_value) {
    if ((eof_error_p == UNPROVIDED)) {
      eof_error_p = T;
    }
    if ((eof_value == UNPROVIDED)) {
      eof_value = $kw42$EOF;
    }
    return cfasl_input_internal(stream, eof_error_p, eof_value);
  }

  /** Peek at STREAM to return the opcode for the next object to be read in CFASL protocol.
EOF-ERROR-P indicates whether an end-of-file is considered an error.
EOF-VALUE indicates a value to return when end-of-file is encountered and eof-error-p is nil. */
  @SubL(source = "cycl/cfasl.lisp", position = 15373) 
  public static final SubLObject cfasl_opcode_peek(SubLObject stream, SubLObject eof_error_p, SubLObject eof_value) {
    if ((eof_error_p == UNPROVIDED)) {
      eof_error_p = T;
    }
    if ((eof_value == UNPROVIDED)) {
      eof_value = $kw42$EOF;
    }
    return cfasl_opcode_peek_internal(stream, eof_error_p, eof_value);
  }

  @SubL(source = "cycl/cfasl.lisp", position = 15779) 
  public static final SubLObject cfasl_input_object(SubLObject stream) {
    return cfasl_input_internal(stream, NIL, NIL);
  }

  @SubL(source = "cycl/cfasl.lisp", position = 16059) 
  public static final SubLObject cfasl_input_internal(SubLObject stream, SubLObject eof_error_p, SubLObject eof_value) {
    {
      SubLObject opcode = cfasl_raw_read_byte(stream);
      if ((NIL == opcode)) {
        if ((NIL != eof_error_p)) {
          Errors.error($str63$end_of_file_on_stream__S, stream);
        }
        return eof_value;
      }
      if ((NIL != cfasl_immediate_fixnum_opcode(opcode))) {
        return cfasl_extract_immediate_fixnum(opcode);
      }
      {
        SubLObject cfasl_input_method = cfasl_input_method(opcode);
        if (($sym64$CFASL_INPUT_ERROR == cfasl_input_method)) {
          return Errors.error($str65$Undefined_cfasl_opcode__A_in__S, opcode, stream);
        } else {
          return Functions.funcall(cfasl_input_method, stream);
        }
      }
    }
  }

  @SubL(source = "cycl/cfasl.lisp", position = 16698) 
  public static final SubLObject cfasl_opcode_peek_internal(SubLObject stream, SubLObject eof_error_p, SubLObject eof_value) {
    {
      SubLObject opcode = cfasl_raw_peek_byte(stream);
      if ((NIL == opcode)) {
        if ((NIL != eof_error_p)) {
          Errors.error($str63$end_of_file_on_stream__S, stream);
        }
        return eof_value;
      }
      return opcode;
    }
  }

  @SubL(source = "cycl/cfasl.lisp", position = 16952) 
  private static SubLSymbol $cfasl_max_opcode$ = null;

  /** Dispatch table used by CFASL-INPUT. */
  @SubL(source = "cycl/cfasl.lisp", position = 16998) 
  private static SubLSymbol $cfasl_input_method_table$ = null;

  @SubL(source = "cycl/cfasl.lisp", position = 17146) 
  public static final SubLObject cfasl_input_method(SubLObject cfasl_opcode) {
    return Vectors.aref($cfasl_input_method_table$.getGlobalValue(), cfasl_opcode);
  }

  @SubL(source = "cycl/cfasl.lisp", position = 17567) 
  public static final SubLObject register_cfasl_input_function(SubLObject cfasl_opcode, SubLObject function) {
    Vectors.set_aref($cfasl_input_method_table$.getGlobalValue(), cfasl_opcode, function);
    return function;
  }

  @SubL(source = "cycl/cfasl.lisp", position = 17759) 
  public static final SubLObject cfasl_raw_peek_byte(SubLObject stream) {
    {
      SubLObject v_byte = cfasl_raw_read_byte(stream);
      if ((NIL != number_utilities.bytep(v_byte))) {
        streams_high.unread_byte(v_byte, stream);
      }
      return v_byte;
    }
  }

  @SubL(source = "cycl/cfasl.lisp", position = 18039) 
  public static final SubLObject cfasl_raw_read_byte(SubLObject stream) {
    if ((NIL != cfasl_decoding_stream_p(stream))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30961");
    }
    return streams_high.read_byte(stream, NIL, NIL);
  }

  @SubL(source = "cycl/cfasl.lisp", position = 18984) 
  public static SubLSymbol $within_cfasl_externalization$ = null;

  /** Return T iff we are assuming CFASL externalization. */
  @SubL(source = "cycl/cfasl.lisp", position = 19428) 
  public static final SubLObject within_cfasl_externalization_p() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $within_cfasl_externalization$.getDynamicValue(thread);
    }
  }

  @SubL(source = "cycl/cfasl.lisp", position = 19577) 
  public static SubLSymbol $cfasl_channel_externalizedP$ = null;

  @SubL(source = "cycl/cfasl.lisp", position = 19981) 
  private static SubLSymbol $cfasl_extensions$ = null;

  @SubL(source = "cycl/cfasl.lisp", position = 21907) 
  private static SubLSymbol $cfasl_opcode_externalization$ = null;

  @SubL(source = "cycl/cfasl.lisp", position = 22087) 
  public static final SubLObject cfasl_output_externalization(SubLObject object, SubLObject stream) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      cfasl_raw_write_byte($cfasl_opcode_externalization$.getGlobalValue(), stream);
      {
        SubLObject answer = NIL;
        {
          SubLObject _prev_bind_0 = $within_cfasl_externalization$.currentBinding(thread);
          try {
            $within_cfasl_externalization$.bind(T, thread);
            answer = cfasl_output(object, stream);
          } finally {
            $within_cfasl_externalization$.rebind(_prev_bind_0, thread);
          }
        }
        return answer;
      }
    }
  }

  @SubL(source = "cycl/cfasl.lisp", position = 22344) 
  public static final SubLObject cfasl_input_externalization(SubLObject stream) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject answer = NIL;
        {
          SubLObject _prev_bind_0 = $within_cfasl_externalization$.currentBinding(thread);
          try {
            $within_cfasl_externalization$.bind(T, thread);
            answer = cfasl_input_object(stream);
          } finally {
            $within_cfasl_externalization$.rebind(_prev_bind_0, thread);
          }
        }
        return answer;
      }
    }
  }

  /** The current stream to which the CFASL-DEFSTRUCT-RECIPE-OUTPUT-METHOD
   is writing. */
  @SubL(source = "cycl/cfasl.lisp", position = 22528) 
  private static SubLSymbol $current_cfasl_defstruct_output_stream$ = null;

  @SubL(source = "cycl/cfasl.lisp", position = 22858) 
  private static SubLSymbol $cfasl_opcode_defstruct_recipe$ = null;

  /** This method expects to be called by CFASL-OUTPUT in the case
   where no implementation is available for a STRUCTURE-P. */
  @SubL(source = "cycl/cfasl.lisp", position = 22969) 
  public static final SubLObject cfasl_output_defstruct_recipe(SubLObject object, SubLObject stream) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30992");
      {
        SubLObject _prev_bind_0 = $current_cfasl_defstruct_output_stream$.currentBinding(thread);
        try {
          $current_cfasl_defstruct_output_stream$.bind(stream, thread);
          visitation.visit_defstruct(object, Symbols.symbol_function($sym89$CFASL_OUTPUT_DEFSTRUCT_RECIPE_VISITORFN));
        } finally {
          $current_cfasl_defstruct_output_stream$.rebind(_prev_bind_0, thread);
        }
      }
      return object;
    }
  }

  @SubL(source = "cycl/cfasl.lisp", position = 23408) 
  public static final SubLObject cfasl_output_defstruct_recipe_visitorfn(SubLObject obj, SubLObject phase, SubLObject param_a, SubLObject param_b) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject stream = $current_cfasl_defstruct_output_stream$.getDynamicValue(thread);
        SubLObject pcase_var = phase;
        if (pcase_var.eql($kw90$BEGIN)) {
          {
            SubLObject constructor_fn = param_a;
            SubLObject num_of_slots = param_b;
            cfasl_output(constructor_fn, stream);
            cfasl_output(num_of_slots, stream);
          }
        } else if (pcase_var.eql($kw91$SLOT)) {
          {
            SubLObject slot_name = param_a;
            SubLObject slot_value = param_b;
            cfasl_output(slot_name, stream);
            cfasl_output(slot_value, stream);
          }
        } else if (pcase_var.eql($kw92$END)) {
        }
      }
      return obj;
    }
  }

  /** @note this method is dispatched to by the CFASL-INPUT infrastructure
   after the *CFASL-OPCODE-DEFSTRUCT-RECIPE* has been read.
   @return STRUCTURE-P */
  @SubL(source = "cycl/cfasl.lisp", position = 24143) 
  public static final SubLObject cfasl_input_defstruct_recipe(SubLObject stream) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject constructor_fn = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        SubLObject num_of_slots = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        SubLObject plist = NIL;
        SubLObject cursor = NIL;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
          if ((!(constructor_fn.isFunctionSpec()))) {
            Errors.error($str93$Error__expected_constructor_for_d, constructor_fn);
          }
        }
        plist = ConsesLow.make_list(Numbers.add(num_of_slots, num_of_slots), UNPROVIDED);
        cursor = plist;
        {
          SubLObject i = NIL;
          for (i = ZERO_INTEGER; i.numL(num_of_slots); i = Numbers.add(i, ONE_INTEGER)) {
            {
              SubLObject slot_name = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
              SubLObject slot_value = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
              if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
                if ((!(slot_name.isKeyword()))) {
                  Errors.error($str94$Expected_keyword_at_slot___A_of_s, i, constructor_fn, slot_name);
                }
              }
              ConsesLow.set_nth(ZERO_INTEGER, cursor, slot_name);
              ConsesLow.set_nth(ONE_INTEGER, cursor, slot_value);
              cursor = conses_high.cddr(cursor);
            }
          }
        }
        return Functions.funcall(constructor_fn, plist);
      }
    }
  }

  @SubL(source = "cycl/cfasl.lisp", position = 25439) 
  private static SubLSymbol $cfasl_immediate_fixnum_cutoff$ = null;

  @SubL(source = "cycl/cfasl.lisp", position = 25729) 
  private static SubLSymbol $cfasl_immediate_fixnum_offset$ = null;

  @SubL(source = "cycl/cfasl.lisp", position = 25827) 
  public static final SubLObject cfasl_immediate_fixnump(SubLObject object) {
    return makeBoolean((object.isFixnum()
           && object.numGE(ZERO_INTEGER)
           && object.numL($cfasl_immediate_fixnum_cutoff$.getGlobalValue())));
  }

  @SubL(source = "cycl/cfasl.lisp", position = 25990) 
  public static final SubLObject cfasl_output_immediate_fixnum(SubLObject object, SubLObject stream) {
    cfasl_raw_write_byte(Numbers.add($cfasl_immediate_fixnum_offset$.getGlobalValue(), object), stream);
    return object;
  }

  @SubL(source = "cycl/cfasl.lisp", position = 26144) 
  public static final SubLObject cfasl_immediate_fixnum_opcode(SubLObject opcode) {
    return Numbers.numGE(opcode, $cfasl_immediate_fixnum_offset$.getGlobalValue());
  }

  @SubL(source = "cycl/cfasl.lisp", position = 26263) 
  public static final SubLObject cfasl_extract_immediate_fixnum(SubLObject opcode) {
    return Numbers.subtract(opcode, $cfasl_immediate_fixnum_offset$.getGlobalValue());
  }

  @SubL(source = "cycl/cfasl.lisp", position = 26372) 
  private static SubLSymbol $cfasl_opcode_p_8bit_int$ = null;

  @SubL(source = "cycl/cfasl.lisp", position = 26483) 
  private static SubLSymbol $cfasl_opcode_n_8bit_int$ = null;

  @SubL(source = "cycl/cfasl.lisp", position = 26559) 
  private static SubLSymbol $cfasl_opcode_p_16bit_int$ = null;

  @SubL(source = "cycl/cfasl.lisp", position = 26636) 
  private static SubLSymbol $cfasl_opcode_n_16bit_int$ = null;

  @SubL(source = "cycl/cfasl.lisp", position = 26713) 
  private static SubLSymbol $cfasl_opcode_p_24bit_int$ = null;

  @SubL(source = "cycl/cfasl.lisp", position = 26790) 
  private static SubLSymbol $cfasl_opcode_n_24bit_int$ = null;

  @SubL(source = "cycl/cfasl.lisp", position = 26867) 
  private static SubLSymbol $cfasl_opcode_p_32bit_int$ = null;

  @SubL(source = "cycl/cfasl.lisp", position = 26944) 
  private static SubLSymbol $cfasl_opcode_n_32bit_int$ = null;

  @SubL(source = "cycl/cfasl.lisp", position = 27021) 
  private static SubLSymbol $cfasl_opcode_p_bignum$ = null;

  @SubL(source = "cycl/cfasl.lisp", position = 27095) 
  private static SubLSymbol $cfasl_opcode_n_bignum$ = null;

  @SubL(source = "cycl/cfasl.lisp", position = 27169) 
  public static final SubLObject cfasl_output_object_integer_method(SubLObject object, SubLObject stream) {
    return cfasl_output_integer(object, stream);
  }

  @SubL(source = "cycl/cfasl.lisp", position = 27288) 
  public static final SubLObject cfasl_output_integer(SubLObject integer, SubLObject stream) {
    if ((NIL != cfasl_immediate_fixnump(integer))) {
      return cfasl_output_immediate_fixnum(integer, stream);
    }
    {
      SubLObject positive = Numbers.plusp(integer);
      SubLObject value = ((NIL != positive) ? ((SubLObject) integer) : Numbers.abs(integer));
      if (value.numL($int66$128)) {
        if ((NIL != positive)) {
          cfasl_raw_write_byte($cfasl_opcode_p_8bit_int$.getGlobalValue(), stream);
        } else {
          cfasl_raw_write_byte($cfasl_opcode_n_8bit_int$.getGlobalValue(), stream);
        }
        cfasl_output_integer_internal(value, ONE_INTEGER, stream);
      } else if (value.numL($int108$32768)) {
        if ((NIL != positive)) {
          cfasl_raw_write_byte($cfasl_opcode_p_16bit_int$.getGlobalValue(), stream);
        } else {
          cfasl_raw_write_byte($cfasl_opcode_n_16bit_int$.getGlobalValue(), stream);
        }
        cfasl_output_integer_internal(value, TWO_INTEGER, stream);
      } else if (value.numL($int109$8388608)) {
        if ((NIL != positive)) {
          cfasl_raw_write_byte($cfasl_opcode_p_24bit_int$.getGlobalValue(), stream);
        } else {
          cfasl_raw_write_byte($cfasl_opcode_n_24bit_int$.getGlobalValue(), stream);
        }
        cfasl_output_integer_internal(value, THREE_INTEGER, stream);
      } else if (value.numL($int110$2147483648)) {
        if ((NIL != positive)) {
          cfasl_raw_write_byte($cfasl_opcode_p_32bit_int$.getGlobalValue(), stream);
        } else {
          cfasl_raw_write_byte($cfasl_opcode_n_32bit_int$.getGlobalValue(), stream);
        }
        cfasl_output_integer_internal(value, FOUR_INTEGER, stream);
      } else {
        {
          SubLObject bignum_spec = Numbers.disassemble_integer_to_fixnums(integer);
          SubLObject datum = bignum_spec;
          SubLObject current = datum;
          SubLObject sign = NIL;
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list111);
          sign = current.first();
          current = current.rest();
          {
            SubLObject fixnums = current;
            if (sign.isNegative()) {
              cfasl_raw_write_byte($cfasl_opcode_n_bignum$.getGlobalValue(), stream);
            } else {
              cfasl_raw_write_byte($cfasl_opcode_p_bignum$.getGlobalValue(), stream);
            }
            cfasl_output(Sequences.length(fixnums), stream);
            {
              SubLObject cdolist_list_var = fixnums;
              SubLObject fixnum = NIL;
              for (fixnum = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), fixnum = cdolist_list_var.first()) {
                cfasl_output(fixnum, stream);
              }
            }
          }
        }
      }
    }
    return integer;
  }

  @SubL(source = "cycl/cfasl.lisp", position = 29265) 
  public static final SubLObject cfasl_output_integer_internal(SubLObject integer, SubLObject bytes, SubLObject stream) {
    if (bytes.numE(ONE_INTEGER)) {
      cfasl_raw_write_byte(integer, stream);
    } else {
      {
        SubLObject low_part = Numbers.mod(integer, $int58$256);
        SubLObject high_part = Numbers.integerDivide(Numbers.subtract(integer, low_part), $int58$256);
        cfasl_raw_write_byte(low_part, stream);
        cfasl_output_integer_internal(high_part, Numbers.subtract(bytes, ONE_INTEGER), stream);
      }
    }
    return integer;
  }

  @SubL(source = "cycl/cfasl.lisp", position = 29788) 
  public static final SubLObject cfasl_input_n_8bit_int(SubLObject stream) {
    return Numbers.minus(cfasl_input_integer(ONE_INTEGER, stream));
  }

  public static final class $cfasl_input_n_8bit_int$UnaryFunction extends UnaryFunction {
    public $cfasl_input_n_8bit_int$UnaryFunction() { super(extractFunctionNamed("CFASL-INPUT-N-8BIT-INT")); }
    public SubLObject processItem(SubLObject arg1) { return cfasl_input_n_8bit_int(arg1); }
  }

  @SubL(source = "cycl/cfasl.lisp", position = 29882) 
  public static final SubLObject cfasl_input_p_16bit_int(SubLObject stream) {
    return cfasl_input_integer(TWO_INTEGER, stream);
  }

  public static final class $cfasl_input_p_16bit_int$UnaryFunction extends UnaryFunction {
    public $cfasl_input_p_16bit_int$UnaryFunction() { super(extractFunctionNamed("CFASL-INPUT-P-16BIT-INT")); }
    public SubLObject processItem(SubLObject arg1) { return cfasl_input_p_16bit_int(arg1); }
  }

  @SubL(source = "cycl/cfasl.lisp", position = 30066) 
  public static final SubLObject cfasl_input_p_24bit_int(SubLObject stream) {
    return cfasl_input_integer(THREE_INTEGER, stream);
  }

  public static final class $cfasl_input_p_24bit_int$UnaryFunction extends UnaryFunction {
    public $cfasl_input_p_24bit_int$UnaryFunction() { super(extractFunctionNamed("CFASL-INPUT-P-24BIT-INT")); }
    public SubLObject processItem(SubLObject arg1) { return cfasl_input_p_24bit_int(arg1); }
  }

  public static final class $cfasl_input_n_24bit_int$UnaryFunction extends UnaryFunction {
    public $cfasl_input_n_24bit_int$UnaryFunction() { super(extractFunctionNamed("CFASL-INPUT-N-24BIT-INT")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30975"); }
  }

  @SubL(source = "cycl/cfasl.lisp", position = 30250) 
  public static final SubLObject cfasl_input_p_32bit_int(SubLObject stream) {
    return cfasl_input_integer(FOUR_INTEGER, stream);
  }

  public static final class $cfasl_input_p_32bit_int$UnaryFunction extends UnaryFunction {
    public $cfasl_input_p_32bit_int$UnaryFunction() { super(extractFunctionNamed("CFASL-INPUT-P-32BIT-INT")); }
    public SubLObject processItem(SubLObject arg1) { return cfasl_input_p_32bit_int(arg1); }
  }

  @SubL(source = "cycl/cfasl.lisp", position = 30590) 
  public static final SubLObject assemble_2_fixnums_to_non_negative_integer(SubLObject fixnum0, SubLObject fixnum1) {
    return Numbers.add(fixnum0, Numbers.ash(fixnum1, EIGHT_INTEGER));
  }

  @SubL(source = "cycl/cfasl.lisp", position = 30777) 
  public static final SubLObject assemble_3_fixnums_to_non_negative_integer(SubLObject fixnum0, SubLObject fixnum1, SubLObject fixnum2) {
    return Numbers.add(assemble_2_fixnums_to_non_negative_integer(fixnum0, fixnum1), Numbers.ash(fixnum2, SIXTEEN_INTEGER));
  }

  @SubL(source = "cycl/cfasl.lisp", position = 31033) 
  public static final SubLObject assemble_4_fixnums_to_non_negative_integer(SubLObject fixnum0, SubLObject fixnum1, SubLObject fixnum2, SubLObject fixnum3) {
    return Numbers.add(assemble_3_fixnums_to_non_negative_integer(fixnum0, fixnum1, fixnum2), Numbers.ash(fixnum3, $int105$24));
  }

  @SubL(source = "cycl/cfasl.lisp", position = 31315) 
  public static final SubLObject cfasl_input_integer(SubLObject bytes, SubLObject stream) {
    if ((NIL == cfasl_decoding_stream_p(stream))) {
      return streams_high.read_byte_sequence_to_positive_integer(bytes, stream, UNPROVIDED, UNPROVIDED);
    }
    if (bytes.numG(FOUR_INTEGER)) {
      {
        SubLObject high_recursive = cfasl_input_integer(Numbers.subtract(bytes, FOUR_INTEGER), stream);
        SubLObject low_4 = cfasl_input_integer(FOUR_INTEGER, stream);
        return Numbers.add(Numbers.ash(high_recursive, $int112$32), low_4);
      }
    }
    {
      SubLObject pcase_var = bytes;
      if (pcase_var.eql(FOUR_INTEGER)) {
        {
          SubLObject fixnum0 = cfasl_raw_read_byte(stream);
          SubLObject fixnum1 = cfasl_raw_read_byte(stream);
          SubLObject fixnum2 = cfasl_raw_read_byte(stream);
          SubLObject fixnum3 = cfasl_raw_read_byte(stream);
          return assemble_4_fixnums_to_non_negative_integer(fixnum0, fixnum1, fixnum2, fixnum3);
        }
      } else if (pcase_var.eql(THREE_INTEGER)) {
        {
          SubLObject fixnum0 = cfasl_raw_read_byte(stream);
          SubLObject fixnum1 = cfasl_raw_read_byte(stream);
          SubLObject fixnum2 = cfasl_raw_read_byte(stream);
          return assemble_3_fixnums_to_non_negative_integer(fixnum0, fixnum1, fixnum2);
        }
      } else if (pcase_var.eql(TWO_INTEGER)) {
        {
          SubLObject fixnum0 = cfasl_raw_read_byte(stream);
          SubLObject fixnum1 = cfasl_raw_read_byte(stream);
          return assemble_2_fixnums_to_non_negative_integer(fixnum0, fixnum1);
        }
      } else if (pcase_var.eql(ONE_INTEGER)) {
        {
          SubLObject fixnum0 = cfasl_raw_read_byte(stream);
          return fixnum0;
        }
      } else if (pcase_var.eql(ZERO_INTEGER)) {
        return ZERO_INTEGER;
      }
    }
    return NIL;
  }

  public static final class $cfasl_input_p_bignum$UnaryFunction extends UnaryFunction {
    public $cfasl_input_p_bignum$UnaryFunction() { super(extractFunctionNamed("CFASL-INPUT-P-BIGNUM")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30977"); }
  }

  @SubL(source = "cycl/cfasl.lisp", position = 33185) 
  private static SubLSymbol $cfasl_opcode_p_float$ = null;

  @SubL(source = "cycl/cfasl.lisp", position = 33282) 
  private static SubLSymbol $cfasl_opcode_n_float$ = null;

  @SubL(source = "cycl/cfasl.lisp", position = 33350) 
  public static final SubLObject cfasl_output_object_float_method(SubLObject object, SubLObject stream) {
    return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30985");
  }

  public static final class $cfasl_input_p_float$UnaryFunction extends UnaryFunction {
    public $cfasl_input_p_float$UnaryFunction() { super(extractFunctionNamed("CFASL-INPUT-P-FLOAT")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30978"); }
  }

  public static final class $cfasl_input_n_float$UnaryFunction extends UnaryFunction {
    public $cfasl_input_n_float$UnaryFunction() { super(extractFunctionNamed("CFASL-INPUT-N-FLOAT")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30976"); }
  }

  @SubL(source = "cycl/cfasl.lisp", position = 34189) 
  public static final SubLObject cfasl_output_object_symbol_method(SubLObject object, SubLObject stream) {
    if ((NIL == object)) {
      return cfasl_output_nil(stream);
    } else if ((NIL != cfasl_common_symbol_p(object))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30983");
    } else if (object.isKeyword()) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30988");
    } else {
      return cfasl_output_other_symbol(object, stream);
    }
  }

  @SubL(source = "cycl/cfasl.lisp", position = 34698) 
  private static SubLSymbol $cfasl_opcode_keyword$ = null;

  @SubL(source = "cycl/cfasl.lisp", position = 35034) 
  public static final SubLObject cfasl_input_keyword(SubLObject stream) {
    {
      SubLObject name = cfasl_input_object(stream);
      if (Characters.CHAR_colon.eql(Strings.sublisp_char(name, ZERO_INTEGER))) {
        name = Sequences.subseq(name, ONE_INTEGER, UNPROVIDED);
      }
      return Symbols.make_keyword(name);
    }
  }

  public static final class $cfasl_input_keyword$UnaryFunction extends UnaryFunction {
    public $cfasl_input_keyword$UnaryFunction() { super(extractFunctionNamed("CFASL-INPUT-KEYWORD")); }
    public SubLObject processItem(SubLObject arg1) { return cfasl_input_keyword(arg1); }
  }

  @SubL(source = "cycl/cfasl.lisp", position = 35238) 
  private static SubLSymbol $cfasl_opcode_other_symbol$ = null;

  @SubL(source = "cycl/cfasl.lisp", position = 35401) 
  public static final SubLObject cfasl_output_other_symbol(SubLObject object, SubLObject stream) {
    cfasl_raw_write_byte($cfasl_opcode_other_symbol$.getGlobalValue(), stream);
    if ((NIL == cyc_package_symbol_p(object))) {
      {
        SubLObject v_package = Symbols.symbol_package(object);
        cfasl_output(v_package, stream);
      }
    }
    cfasl_output_string(Symbols.symbol_name(object), stream);
    return object;
  }

  /** Return T iff OBJECT is a symbol in the Cyc package. */
  @SubL(source = "cycl/cfasl.lisp", position = 35724) 
  public static final SubLObject cyc_package_symbol_p(SubLObject object) {
    return makeBoolean((object.isSymbol()
           && (!(object.isKeyword()))
           && ((control_vars.$cyc_package$.getGlobalValue() == Symbols.symbol_package(object))
            || (object == Packages.find_symbol(Symbols.symbol_name(object), control_vars.$cyc_package$.getGlobalValue())))));
  }

  @SubL(source = "cycl/cfasl.lisp", position = 36087) 
  public static final SubLObject cfasl_input_other_symbol(SubLObject stream) {
    {
      SubLObject input = cfasl_input_object(stream);
      if (input.isString()) {
        {
          SubLObject name = input;
          return Packages.intern(name, control_vars.$cyc_package$.getGlobalValue());
        }
      }
      {
        SubLObject v_package = input;
        SubLObject name = cfasl_input_object(stream);
        if ((NIL == v_package)) {
          return Symbols.make_symbol(name);
        } else {
          return Packages.intern(name, v_package);
        }
      }
    }
  }

  public static final class $cfasl_input_other_symbol$UnaryFunction extends UnaryFunction {
    public $cfasl_input_other_symbol$UnaryFunction() { super(extractFunctionNamed("CFASL-INPUT-OTHER-SYMBOL")); }
    public SubLObject processItem(SubLObject arg1) { return cfasl_input_other_symbol(arg1); }
  }

  @SubL(source = "cycl/cfasl.lisp", position = 36443) 
  private static SubLSymbol $cfasl_opcode_nil$ = null;

  @SubL(source = "cycl/cfasl.lisp", position = 36579) 
  public static final SubLObject cfasl_output_nil(SubLObject stream) {
    cfasl_raw_write_byte($cfasl_opcode_nil$.getGlobalValue(), stream);
    return NIL;
  }

  @SubL(source = "cycl/cfasl.lisp", position = 36697) 
  public static final SubLObject cfasl_input_nil(SubLObject stream) {
    return NIL;
  }

  public static final class $cfasl_input_nil$UnaryFunction extends UnaryFunction {
    public $cfasl_input_nil$UnaryFunction() { super(extractFunctionNamed("CFASL-INPUT-NIL")); }
    public SubLObject processItem(SubLObject arg1) { return cfasl_input_nil(arg1); }
  }

  @SubL(source = "cycl/cfasl.lisp", position = 36780) 
  private static SubLSymbol $cfasl_opcode_common_symbol$ = null;

  /** A list of commonly used symbols for which is it cost-effective
to output in a terser representation. */
  @SubL(source = "cycl/cfasl.lisp", position = 36947) 
  public static SubLSymbol $cfasl_common_symbols$ = null;

  /** Set the currently used list of common symbols for CFASL to be SYMBOLS. */
  @SubL(source = "cycl/cfasl.lisp", position = 37133) 
  public static final SubLObject cfasl_set_common_symbols(SubLObject symbols) {
    $cfasl_common_symbols$.setDynamicValue(Functions.apply(Symbols.symbol_function($sym123$VECTOR), symbols));
    return NIL;
  }

  /** Set the currently used list of common symbols for CFASL to be SYMBOLS, assuming that we're only doing a few cfasl functions and so will sacrifice time for space and not make a vector */
  @SubL(source = "cycl/cfasl.lisp", position = 37530) 
  public static final SubLObject cfasl_set_common_symbols_simple(SubLObject symbols) {
    $cfasl_common_symbols$.setDynamicValue(symbols);
    return NIL;
  }

  /** Get the currently active common symbol;s in a form that can be
   used in conjunction with CFASL-SET-COMMON-SYMBOLS.
   @return SYMBOL-LIST-P */
  @SubL(source = "cycl/cfasl.lisp", position = 38043) 
  public static final SubLObject cfasl_current_common_symbols() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ($cfasl_common_symbols$.getDynamicValue(thread).isVector()) {
        return vector_utilities.vector_elements($cfasl_common_symbols$.getDynamicValue(thread), UNPROVIDED);
      } else {
        return $cfasl_common_symbols$.getDynamicValue(thread);
      }
    }
  }

  @SubL(source = "cycl/cfasl.lisp", position = 38369) 
  public static final SubLObject cfasl_common_symbol_p(SubLObject object) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean(((NIL != $cfasl_common_symbols$.getDynamicValue(thread))
             && object.isSymbol()
             && (NIL != Sequences.position(object, $cfasl_common_symbols$.getDynamicValue(thread), Symbols.symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED))));
    }
  }

  @SubL(source = "cycl/cfasl.lisp", position = 38641) 
  public static final SubLObject cfasl_decode_common_symbol(SubLObject integer) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return ($cfasl_common_symbols$.getDynamicValue(thread).isVector() ? ((SubLObject) Vectors.aref($cfasl_common_symbols$.getDynamicValue(thread), integer)) : ConsesLow.nth(integer, $cfasl_common_symbols$.getDynamicValue(thread)));
    }
  }

  @SubL(source = "cycl/cfasl.lisp", position = 39079) 
  public static final SubLObject cfasl_input_common_symbol(SubLObject stream) {
    {
      SubLObject encoding = cfasl_input_object(stream);
      SubLObject symbol = cfasl_decode_common_symbol(encoding);
      if ((NIL == symbol)) {
        Errors.cerror($str128$Use_NIL_, $str129$Common_symbol_at_index__D_was_not, encoding, $sym130$_CFASL_COMMON_SYMBOLS_);
      }
      return symbol;
    }
  }

  public static final class $cfasl_input_common_symbol$UnaryFunction extends UnaryFunction {
    public $cfasl_input_common_symbol$UnaryFunction() { super(extractFunctionNamed("CFASL-INPUT-COMMON-SYMBOL")); }
    public SubLObject processItem(SubLObject arg1) { return cfasl_input_common_symbol(arg1); }
  }

  @SubL(source = "cycl/cfasl.lisp", position = 39393) 
  public static final SubLObject cfasl_output_object_cons_method(SubLObject object, SubLObject stream) {
    if ((NIL != list_utilities.proper_list_p(object))) {
      return cfasl_output_list(object, stream);
    } else {
      return cfasl_output_dotted_list(object, stream);
    }
  }

  @SubL(source = "cycl/cfasl.lisp", position = 39610) 
  private static SubLSymbol $cfasl_list_methods$ = null;

  @SubL(source = "cycl/cfasl.lisp", position = 40465) 
  private static SubLSymbol $cfasl_opcode_list$ = null;

  @SubL(source = "cycl/cfasl.lisp", position = 40608) 
  public static final SubLObject cfasl_output_list(SubLObject list, SubLObject stream) {
    {
      SubLObject length = conses_high.list_length(list);
      if ((NIL == length)) {
        Errors.cerror($str134$Output_NIL_instead, $str135$Trying_to_output_a_circular_list_);
        return cfasl_output_nil(stream);
      } else if (length.numE(ZERO_INTEGER)) {
        return cfasl_output_nil(stream);
      } else if (((NIL != $cfasl_list_methods$.getGlobalValue())
           && (NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31001")))) {
      } else {
        cfasl_raw_write_byte($cfasl_opcode_list$.getGlobalValue(), stream);
        cfasl_output_integer(length, stream);
        {
          SubLObject cdolist_list_var = list;
          SubLObject item = NIL;
          for (item = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), item = cdolist_list_var.first()) {
            cfasl_output(item, stream);
          }
        }
        return list;
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/cfasl.lisp", position = 41356) 
  public static final SubLObject cfasl_input_list(SubLObject stream) {
    {
      SubLObject length = cfasl_input_object(stream);
      SubLObject list = NIL;
      SubLObject list_item = NIL;
      list = ConsesLow.make_list(length, UNPROVIDED);
      {
        SubLObject cell = NIL;
        for (cell = list; (NIL != cell); cell = cell.rest()) {
          list_item = cfasl_input_object(stream);
          ConsesLow.rplaca(cell, list_item);
        }
      }
      return list;
    }
  }

  public static final class $cfasl_input_list$UnaryFunction extends UnaryFunction {
    public $cfasl_input_list$UnaryFunction() { super(extractFunctionNamed("CFASL-INPUT-LIST")); }
    public SubLObject processItem(SubLObject arg1) { return cfasl_input_list(arg1); }
  }

  @SubL(source = "cycl/cfasl.lisp", position = 41693) 
  private static SubLSymbol $cfasl_opcode_dotted_list$ = null;

  @SubL(source = "cycl/cfasl.lisp", position = 41847) 
  public static final SubLObject cfasl_output_dotted_list(SubLObject object, SubLObject stream) {
    {
      SubLObject length = list_utilities.dotted_length(object);
      cfasl_raw_write_byte($cfasl_opcode_dotted_list$.getGlobalValue(), stream);
      cfasl_output_integer(length, stream);
      {
        SubLObject i = NIL;
        SubLObject cons = NIL;
        for (i = ZERO_INTEGER, cons = object; (!(i.numE(length))); i = Numbers.add(i, ONE_INTEGER), cons = cons.rest()) {
          cfasl_output(cons.first(), stream);
        }
        cfasl_output(cons, stream);
      }
    }
    return object;
  }

  @SubL(source = "cycl/cfasl.lisp", position = 42249) 
  public static final SubLObject cfasl_input_dotted_list(SubLObject stream) {
    {
      SubLObject length = cfasl_input_object(stream);
      SubLObject list = NIL;
      if (length.numE(ONE_INTEGER)) {
        list = cons(NIL, NIL);
        ConsesLow.rplaca(list, cfasl_input_object(stream));
        ConsesLow.rplacd(list, cfasl_input_object(stream));
      } else {
        list = ConsesLow.make_list(length, UNPROVIDED);
        {
          SubLObject cell = NIL;
          for (cell = list; (NIL != cell.rest()); cell = cell.rest()) {
            ConsesLow.rplaca(cell, cfasl_input_object(stream));
          }
          ConsesLow.rplaca(cell, cfasl_input_object(stream));
          ConsesLow.rplacd(cell, cfasl_input_object(stream));
        }
      }
      return list;
    }
  }

  public static final class $cfasl_input_dotted_list$UnaryFunction extends UnaryFunction {
    public $cfasl_input_dotted_list$UnaryFunction() { super(extractFunctionNamed("CFASL-INPUT-DOTTED-LIST")); }
    public SubLObject processItem(SubLObject arg1) { return cfasl_input_dotted_list(arg1); }
  }

  @SubL(source = "cycl/cfasl.lisp", position = 42881) 
  public static final SubLObject cfasl_output_object_vector_method(SubLObject object, SubLObject stream) {
    if ((NIL != Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 4931"))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30981");
    } else {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30986");
    }
  }

  @SubL(source = "cycl/cfasl.lisp", position = 43163) 
  private static SubLSymbol $cfasl_opcode_general_vector$ = null;

  public static final class $cfasl_input_general_vector$UnaryFunction extends UnaryFunction {
    public $cfasl_input_general_vector$UnaryFunction() { super(extractFunctionNamed("CFASL-INPUT-GENERAL-VECTOR")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30973"); }
  }

  @SubL(source = "cycl/cfasl.lisp", position = 43928) 
  private static SubLSymbol $cfasl_opcode_byte_vector$ = null;

  @SubL(source = "cycl/cfasl.lisp", position = 44805) 
  private static SubLSymbol $cfasl_opcode_string$ = null;

  @SubL(source = "cycl/cfasl.lisp", position = 44906) 
  public static final SubLObject cfasl_output_object_string_method(SubLObject object, SubLObject stream) {
    return cfasl_output_string(object, stream);
  }

  @SubL(source = "cycl/cfasl.lisp", position = 45023) 
  public static final SubLObject cfasl_output_string(SubLObject string, SubLObject stream) {
    cfasl_raw_write_byte($cfasl_opcode_string$.getGlobalValue(), stream);
    {
      SubLObject length = Sequences.length(string);
      cfasl_output_integer(length, stream);
      {
        SubLObject i = NIL;
        for (i = ZERO_INTEGER; i.numL(length); i = Numbers.add(i, ONE_INTEGER)) {
          cfasl_raw_write_byte(Characters.char_code(Strings.sublisp_char(string, i)), stream);
        }
      }
    }
    return string;
  }

  /** If non-nil, a string that is destructively re-used when loading a string of the same length. */
  @SubL(source = "cycl/cfasl.lisp", position = 45315) 
  private static SubLSymbol $cfasl_input_string_resource$ = null;

  @SubL(source = "cycl/cfasl.lisp", position = 45488) 
  public static final SubLObject cfasl_input_string(SubLObject stream) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject length = cfasl_input_object(stream);
        SubLObject string = NIL;
        if (($cfasl_input_string_resource$.getDynamicValue(thread).isString()
             && length.numE(Sequences.length($cfasl_input_string_resource$.getDynamicValue(thread))))) {
          string = $cfasl_input_string_resource$.getDynamicValue(thread);
        } else {
          string = Strings.make_string(length, UNPROVIDED);
        }
        if ((NIL == cfasl_decoding_stream_p(stream))) {
          return streams_high.read_byte_sequence_into_string(string, stream, UNPROVIDED, UNPROVIDED);
        }
        {
          SubLObject i = NIL;
          for (i = ZERO_INTEGER; i.numL(length); i = Numbers.add(i, ONE_INTEGER)) {
            Strings.set_char(string, i, Characters.code_char(cfasl_raw_read_byte(stream)));
          }
        }
        return string;
      }
    }
  }

  public static final class $cfasl_input_string$UnaryFunction extends UnaryFunction {
    public $cfasl_input_string$UnaryFunction() { super(extractFunctionNamed("CFASL-INPUT-STRING")); }
    public SubLObject processItem(SubLObject arg1) { return cfasl_input_string(arg1); }
  }

  @SubL(source = "cycl/cfasl.lisp", position = 46074) 
  private static SubLSymbol $cfasl_opcode_character$ = null;

  @SubL(source = "cycl/cfasl.lisp", position = 46189) 
  public static final SubLObject cfasl_output_object_character_method(SubLObject object, SubLObject stream) {
    return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30982");
  }

  public static final class $cfasl_input_character$UnaryFunction extends UnaryFunction {
    public $cfasl_input_character$UnaryFunction() { super(extractFunctionNamed("CFASL-INPUT-CHARACTER")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30970"); }
  }

  @SubL(source = "cycl/cfasl.lisp", position = 46600) 
  private static SubLSymbol $cfasl_opcode_hashtable$ = null;

  @SubL(source = "cycl/cfasl.lisp", position = 47239) 
  public static final SubLObject cfasl_input_hashtable(SubLObject stream) {
    {
      SubLObject test = cfasl_input_object(stream);
      SubLObject size = cfasl_input_object(stream);
      SubLObject hashtable = NIL;
      SubLObject pcase_var = test;
      if ((pcase_var.eql(EQ)
          || pcase_var.eql(EQL)
          || pcase_var.eql(EQUAL)
          || pcase_var.eql(EQUALP))) {
        test = Symbols.symbol_function(test);
      }
      hashtable = Hashtables.make_hash_table(size, test, UNPROVIDED);
      {
        SubLObject i = NIL;
        for (i = ZERO_INTEGER; i.numL(size); i = Numbers.add(i, ONE_INTEGER)) {
          {
            SubLObject key = cfasl_input_object(stream);
            SubLObject value = cfasl_input_object(stream);
            Hashtables.sethash(key, hashtable, value);
          }
        }
      }
      return hashtable;
    }
  }

  @SubL(source = "cycl/cfasl.lisp", position = 47779) 
  private static SubLSymbol $cfasl_opcode_guid$ = null;

  @SubL(source = "cycl/cfasl.lisp", position = 47868) 
  public static final SubLObject cfasl_output_object_guid_method(SubLObject object, SubLObject stream) {
    return cfasl_output_guid(object, stream);
  }

  @SubL(source = "cycl/cfasl.lisp", position = 47982) 
  public static final SubLObject cfasl_output_guid(SubLObject guid, SubLObject stream) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == $terse_guid_serialization_enabledP$.getDynamicValue(thread))) {
        return cfasl_output_legacy_guid(guid, stream);
      }
      cfasl_raw_write_byte($cfasl_opcode_guid$.getGlobalValue(), stream);
      {
        SubLObject byte_vector = Guids.disassemble_guid_to_fixnums(guid, UNPROVIDED);
        SubLObject i = NIL;
        for (i = ZERO_INTEGER; i.numL(SIXTEEN_INTEGER); i = Numbers.add(i, ONE_INTEGER)) {
          cfasl_raw_write_byte(Vectors.aref(byte_vector, i), stream);
        }
      }
      return guid;
    }
  }

  public static final class $cfasl_input_guid$UnaryFunction extends UnaryFunction {
    public $cfasl_input_guid$UnaryFunction() { super(extractFunctionNamed("CFASL-INPUT-GUID")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30974"); }
  }

  @SubL(source = "cycl/cfasl.lisp", position = 48833) 
  private static SubLSymbol $cfasl_opcode_legacy_guid$ = null;

  @SubL(source = "cycl/cfasl.lisp", position = 48964) 
  public static final SubLObject cfasl_output_legacy_guid(SubLObject guid, SubLObject stream) {
    cfasl_raw_write_byte($cfasl_opcode_legacy_guid$.getGlobalValue(), stream);
    {
      SubLObject string = Guids.guid_to_string(guid);
      cfasl_output_string(string, stream);
    }
    return guid;
  }

  @SubL(source = "cycl/cfasl.lisp", position = 49187) 
  public static final SubLObject cfasl_input_legacy_guid(SubLObject stream) {
    {
      SubLObject string = cfasl_input_guid_string(stream);
      SubLObject guid = NIL;
      guid = Guids.string_to_guid(string);
      return guid;
    }
  }

  @SubL(source = "cycl/cfasl.lisp", position = 49399) 
  public static SubLSymbol $cfasl_input_guid_string_resource$ = null;

  @SubL(source = "cycl/cfasl.lisp", position = 49472) 
  public static final SubLObject cfasl_input_guid_string(SubLObject stream) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject string = NIL;
        {
          SubLObject _prev_bind_0 = $cfasl_input_string_resource$.currentBinding(thread);
          try {
            $cfasl_input_string_resource$.bind($cfasl_input_guid_string_resource$.getDynamicValue(thread), thread);
            string = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
          } finally {
            $cfasl_input_string_resource$.rebind(_prev_bind_0, thread);
          }
        }
        return string;
      }
    }
  }

  /** Allocates and provides access to a new GUID string resource
   object.
   @see *CFASL-INPUT-GUID-STRING-RESOURCE*
   @return STRINGP */
  @SubL(source = "cycl/cfasl.lisp", position = 49680) 
  public static final SubLObject get_new_cfasl_input_guid_string_resource() {
    return Strings.make_string($int152$36, UNPROVIDED);
  }

  /** Allocates a new GUID string resource and makes it available to the 
   GUID loading infrastructure. */
  @SubL(source = "cycl/cfasl.lisp", position = 49962) 
  public static final SubLObject with_new_cfasl_input_guid_string_resource(SubLObject macroform, SubLObject environment) {
    {
      SubLObject datum = macroform.rest();
      SubLObject current = datum;
      SubLObject body = current;
      return listS($sym14$CLET, $list153, ConsesLow.append(body, NIL));
    }
  }

  @SubL(source = "cycl/cfasl.lisp", position = 50276) 
  private static SubLSymbol $cfasl_opcode_result_set$ = null;

  @SubL(source = "cycl/cfasl.lisp", position = 50949) 
  private static SubLSymbol $cfasl_opcode_package$ = null;

  @SubL(source = "cycl/cfasl.lisp", position = 51060) 
  public static final SubLObject cfasl_output_object_package_method(SubLObject object, SubLObject stream) {
    return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30993");
  }

  @SubL(source = "cycl/cfasl.lisp", position = 51493) 
  private static SubLSymbol $cfasl_opcode_wide_cfasl_opcode$ = null;

  /** All wide opcodes have to be more than one byte, so that all narrow opcodes
   can be re-encoded as wide opcodes without loss of functionality. */
  @SubL(source = "cycl/cfasl.lisp", position = 52404) 
  public static SubLSymbol $cfasl_min_wide_opcode$ = null;

  /** Dispatch table used by the wide CFASL-INPUT methods. */
  @SubL(source = "cycl/cfasl.lisp", position = 52806) 
  private static SubLSymbol $cfasl_wide_opcode_input_method_table$ = null;

  @SubL(source = "cycl/cfasl.lisp", position = 53989) 
  public static final SubLObject register_wide_cfasl_opcode_input_function(SubLObject wide_opcode, SubLObject function) {
    Hashtables.sethash(wide_opcode, $cfasl_wide_opcode_input_method_table$.getGlobalValue(), function);
    return function;
  }

  @SubL(source = "cycl/cfasl.lisp", position = 54414) 
  private static SubLSymbol $cfasl_opcode_instance$ = null;

  @SubL(source = "cycl/cfasl.lisp", position = 55133) 
  private static SubLSymbol $cfasl_opcode_guid_denoted_type$ = null;

  /** Stores the GUIDs -> input type Mappings. */
  @SubL(source = "cycl/cfasl.lisp", position = 55363) 
  private static SubLSymbol $cfasl_guid_denoted_type_input_method_table$ = null;

  @SubL(source = "cycl/cfasl.lisp", position = 56274) 
  public static final SubLObject register_cfasl_guid_denoted_type_input_function(SubLObject cfasl_guid_opcode, SubLObject function) {
    Hashtables.sethash(cfasl_guid_opcode, $cfasl_guid_denoted_type_input_method_table$.getGlobalValue(), function);
    return function;
  }

  public static final SubLObject declare_cfasl_file() {
    declareFunction(myName, "cfasl_encoding_p", "CFASL-ENCODING-P", 1, 0, false);
    declareFunction(myName, "cfasl_encodable_stream_p", "CFASL-ENCODABLE-STREAM-P", 1, 0, false);
    declareFunction(myName, "cfasl_encoding_stream_print_function_trampoline", "CFASL-ENCODING-STREAM-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "cfasl_encoding_stream_p", "CFASL-ENCODING-STREAM-P", 1, 0, false); new $cfasl_encoding_stream_p$UnaryFunction();
    declareFunction(myName, "cfasl_encoding_stream_internal_stream", "CFASL-ENCODING-STREAM-INTERNAL-STREAM", 1, 0, false);
    declareFunction(myName, "_csetf_cfasl_encoding_stream_internal_stream", "_CSETF-CFASL-ENCODING-STREAM-INTERNAL-STREAM", 2, 0, false);
    declareFunction(myName, "make_cfasl_encoding_stream", "MAKE-CFASL-ENCODING-STREAM", 0, 1, false);
    declareMacro(myName, "with_cfasl_output_to_hex_string", "WITH-CFASL-OUTPUT-TO-HEX-STRING");
    declareFunction(myName, "cfasl_encoding_string_stream_encoding", "CFASL-ENCODING-STRING-STREAM-ENCODING", 1, 0, false);
    declareMacro(myName, "with_cfasl_output_to_byte_vector", "WITH-CFASL-OUTPUT-TO-BYTE-VECTOR");
    declareFunction(myName, "new_cfasl_encoding_stream", "NEW-CFASL-ENCODING-STREAM", 0, 0, false);
    declareFunction(myName, "cfasl_encoding_stream_write_byte", "CFASL-ENCODING-STREAM-WRITE-BYTE", 2, 0, false);
    declareFunction(myName, "cfasl_encoding_stream_encoding", "CFASL-ENCODING-STREAM-ENCODING", 1, 0, false);
    declareFunction(myName, "close_cfasl_encoding_stream", "CLOSE-CFASL-ENCODING-STREAM", 1, 0, false);
    declareFunction(myName, "cfasl_encode", "CFASL-ENCODE", 1, 0, false);
    declareFunction(myName, "cfasl_encode_externalized", "CFASL-ENCODE-EXTERNALIZED", 1, 0, false);
    declareFunction(myName, "cfasl_encode_externalized_terse", "CFASL-ENCODE-EXTERNALIZED-TERSE", 1, 0, false);
    declareFunction(myName, "cfasl_decodable_stream_p", "CFASL-DECODABLE-STREAM-P", 1, 0, false);
    declareFunction(myName, "cfasl_decoding_stream_print_function_trampoline", "CFASL-DECODING-STREAM-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "cfasl_decoding_stream_p", "CFASL-DECODING-STREAM-P", 1, 0, false); new $cfasl_decoding_stream_p$UnaryFunction();
    declareFunction(myName, "cfasl_decoding_stream_internal_stream", "CFASL-DECODING-STREAM-INTERNAL-STREAM", 1, 0, false);
    declareFunction(myName, "_csetf_cfasl_decoding_stream_internal_stream", "_CSETF-CFASL-DECODING-STREAM-INTERNAL-STREAM", 2, 0, false);
    declareFunction(myName, "make_cfasl_decoding_stream", "MAKE-CFASL-DECODING-STREAM", 0, 1, false);
    declareMacro(myName, "with_cfasl_input_from_string", "WITH-CFASL-INPUT-FROM-STRING");
    declareFunction(myName, "new_cfasl_decoding_stream_from_string", "NEW-CFASL-DECODING-STREAM-FROM-STRING", 1, 0, false);
    declareMacro(myName, "with_cfasl_input_from_byte_vector", "WITH-CFASL-INPUT-FROM-BYTE-VECTOR");
    declareFunction(myName, "new_cfasl_decoding_stream", "NEW-CFASL-DECODING-STREAM", 1, 0, false);
    declareFunction(myName, "cfasl_decoding_stream_read_byte", "CFASL-DECODING-STREAM-READ-BYTE", 1, 2, false);
    declareFunction(myName, "close_cfasl_decoding_stream", "CLOSE-CFASL-DECODING-STREAM", 1, 0, false);
    declareFunction(myName, "cfasl_decode", "CFASL-DECODE", 1, 0, false);
    declareFunction(myName, "cfasl_count_stream_print_function_trampoline", "CFASL-COUNT-STREAM-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "cfasl_count_stream_p", "CFASL-COUNT-STREAM-P", 1, 0, false); new $cfasl_count_stream_p$UnaryFunction();
    declareFunction(myName, "cfasl_count_stream_position", "CFASL-COUNT-STREAM-POSITION", 1, 0, false);
    declareFunction(myName, "_csetf_cfasl_count_stream_position", "_CSETF-CFASL-COUNT-STREAM-POSITION", 2, 0, false);
    declareFunction(myName, "make_cfasl_count_stream", "MAKE-CFASL-COUNT-STREAM", 0, 1, false);
    declareMacro(myName, "with_cfasl_output_to_count_stream", "WITH-CFASL-OUTPUT-TO-COUNT-STREAM");
    declareFunction(myName, "new_cfasl_count_stream", "NEW-CFASL-COUNT-STREAM", 0, 0, false);
    declareFunction(myName, "cfasl_count_stream_write_byte", "CFASL-COUNT-STREAM-WRITE-BYTE", 2, 0, false);
    declareFunction(myName, "cfasl_count_stream_size", "CFASL-COUNT-STREAM-SIZE", 1, 0, false);
    declareFunction(myName, "close_cfasl_count_stream", "CLOSE-CFASL-COUNT-STREAM", 1, 0, false);
    declareFunction(myName, "cfasl_object_size", "CFASL-OBJECT-SIZE", 1, 0, false);
    declareFunction(myName, "cfasl_externalized_object_size", "CFASL-EXTERNALIZED-OBJECT-SIZE", 1, 0, false);
    declareMacro(myName, "with_cfasl_stream_extensions", "WITH-CFASL-STREAM-EXTENSIONS");
    declareFunction(myName, "cfasl_output", "CFASL-OUTPUT", 2, 0, false);
    declareFunction(myName, "cfasl_output_externalized", "CFASL-OUTPUT-EXTERNALIZED", 2, 0, false);
    declareFunction(myName, "cfasl_output_maybe_externalized", "CFASL-OUTPUT-MAYBE-EXTERNALIZED", 3, 0, false);
    declareFunction(myName, "cfasl_output_object", "CFASL-OUTPUT-OBJECT", 2, 0, false);
    declareFunction(myName, "cfasl_output_error", "CFASL-OUTPUT-ERROR", 2, 0, false);
    declareFunction(myName, "cfasl_raw_write_byte", "CFASL-RAW-WRITE-BYTE", 2, 0, false);
    declareFunction(myName, "cfasl_input", "CFASL-INPUT", 1, 2, false);
    declareFunction(myName, "cfasl_opcode_peek", "CFASL-OPCODE-PEEK", 1, 2, false);
    declareFunction(myName, "cfasl_input_object", "CFASL-INPUT-OBJECT", 1, 0, false);
    declareFunction(myName, "cfasl_input_error", "CFASL-INPUT-ERROR", 1, 0, false);
    declareFunction(myName, "cfasl_input_internal", "CFASL-INPUT-INTERNAL", 3, 0, false);
    declareFunction(myName, "cfasl_opcode_peek_internal", "CFASL-OPCODE-PEEK-INTERNAL", 3, 0, false);
    declareFunction(myName, "cfasl_input_method", "CFASL-INPUT-METHOD", 1, 0, false);
    declareMacro(myName, "declare_cfasl_opcode", "DECLARE-CFASL-OPCODE");
    declareFunction(myName, "register_cfasl_input_function", "REGISTER-CFASL-INPUT-FUNCTION", 2, 0, false);
    declareFunction(myName, "cfasl_raw_peek_byte", "CFASL-RAW-PEEK-BYTE", 1, 0, false);
    declareFunction(myName, "cfasl_raw_read_byte", "CFASL-RAW-READ-BYTE", 1, 0, false);
    declareMacro(myName, "with_cfasl_area_allocation", "WITH-CFASL-AREA-ALLOCATION");
    declareMacro(myName, "within_cfasl_externalization", "WITHIN-CFASL-EXTERNALIZATION");
    declareMacro(myName, "without_cfasl_externalization", "WITHOUT-CFASL-EXTERNALIZATION");
    declareFunction(myName, "within_cfasl_externalization_p", "WITHIN-CFASL-EXTERNALIZATION-P", 0, 0, false);
    declareMacro(myName, "without_cfasl_channel_externalization", "WITHOUT-CFASL-CHANNEL-EXTERNALIZATION");
    declareFunction(myName, "cfasl_channel_externalizedP", "CFASL-CHANNEL-EXTERNALIZED?", 0, 0, false);
    declareMacro(myName, "declare_cfasl_extension_opcode", "DECLARE-CFASL-EXTENSION-OPCODE");
    declareFunction(myName, "register_cfasl_extension", "REGISTER-CFASL-EXTENSION", 4, 0, false);
    declareFunction(myName, "handle_cfasl_extensions", "HANDLE-CFASL-EXTENSIONS", 2, 0, false);
    declareFunction(myName, "cfasl_output_narrow_opcode", "CFASL-OUTPUT-NARROW-OPCODE", 2, 0, false);
    declareFunction(myName, "cfasl_output_opcode", "CFASL-OUTPUT-OPCODE", 2, 0, false);
    declareFunction(myName, "cfasl_output_externalization", "CFASL-OUTPUT-EXTERNALIZATION", 2, 0, false);
    declareFunction(myName, "cfasl_input_externalization", "CFASL-INPUT-EXTERNALIZATION", 1, 0, false);
    declareFunction(myName, "cfasl_output_defstruct_recipe", "CFASL-OUTPUT-DEFSTRUCT-RECIPE", 2, 0, false);
    declareFunction(myName, "cfasl_output_defstruct_recipe_visitorfn", "CFASL-OUTPUT-DEFSTRUCT-RECIPE-VISITORFN", 4, 0, false);
    declareFunction(myName, "cfasl_input_defstruct_recipe", "CFASL-INPUT-DEFSTRUCT-RECIPE", 1, 0, false);
    declareFunction(myName, "cfasl_immediate_fixnump", "CFASL-IMMEDIATE-FIXNUMP", 1, 0, false);
    declareFunction(myName, "cfasl_output_immediate_fixnum", "CFASL-OUTPUT-IMMEDIATE-FIXNUM", 2, 0, false);
    declareFunction(myName, "cfasl_immediate_fixnum_opcode", "CFASL-IMMEDIATE-FIXNUM-OPCODE", 1, 0, false);
    declareFunction(myName, "cfasl_extract_immediate_fixnum", "CFASL-EXTRACT-IMMEDIATE-FIXNUM", 1, 0, false);
    declareFunction(myName, "cfasl_output_object_integer_method", "CFASL-OUTPUT-OBJECT-INTEGER-METHOD", 2, 0, false);
    declareFunction(myName, "cfasl_output_integer", "CFASL-OUTPUT-INTEGER", 2, 0, false);
    declareFunction(myName, "cfasl_output_integer_internal", "CFASL-OUTPUT-INTEGER-INTERNAL", 3, 0, false);
    declareFunction(myName, "cfasl_input_p_8bit_int", "CFASL-INPUT-P-8BIT-INT", 1, 0, false);
    declareFunction(myName, "cfasl_input_n_8bit_int", "CFASL-INPUT-N-8BIT-INT", 1, 0, false); new $cfasl_input_n_8bit_int$UnaryFunction();
    declareFunction(myName, "cfasl_input_p_16bit_int", "CFASL-INPUT-P-16BIT-INT", 1, 0, false); new $cfasl_input_p_16bit_int$UnaryFunction();
    declareFunction(myName, "cfasl_input_n_16bit_int", "CFASL-INPUT-N-16BIT-INT", 1, 0, false);
    declareFunction(myName, "cfasl_input_p_24bit_int", "CFASL-INPUT-P-24BIT-INT", 1, 0, false); new $cfasl_input_p_24bit_int$UnaryFunction();
    declareFunction(myName, "cfasl_input_n_24bit_int", "CFASL-INPUT-N-24BIT-INT", 1, 0, false); new $cfasl_input_n_24bit_int$UnaryFunction();
    declareFunction(myName, "cfasl_input_p_32bit_int", "CFASL-INPUT-P-32BIT-INT", 1, 0, false); new $cfasl_input_p_32bit_int$UnaryFunction();
    declareFunction(myName, "cfasl_input_n_32bit_int", "CFASL-INPUT-N-32BIT-INT", 1, 0, false);
    declareFunction(myName, "assemble_2_fixnums_to_non_negative_integer", "ASSEMBLE-2-FIXNUMS-TO-NON-NEGATIVE-INTEGER", 2, 0, false);
    declareFunction(myName, "assemble_3_fixnums_to_non_negative_integer", "ASSEMBLE-3-FIXNUMS-TO-NON-NEGATIVE-INTEGER", 3, 0, false);
    declareFunction(myName, "assemble_4_fixnums_to_non_negative_integer", "ASSEMBLE-4-FIXNUMS-TO-NON-NEGATIVE-INTEGER", 4, 0, false);
    declareFunction(myName, "cfasl_input_integer", "CFASL-INPUT-INTEGER", 2, 0, false);
    declareFunction(myName, "cfasl_input_p_bignum", "CFASL-INPUT-P-BIGNUM", 1, 0, false); new $cfasl_input_p_bignum$UnaryFunction();
    declareFunction(myName, "cfasl_input_n_bignum", "CFASL-INPUT-N-BIGNUM", 1, 0, false);
    declareFunction(myName, "cfasl_input_bignum", "CFASL-INPUT-BIGNUM", 2, 0, false);
    declareFunction(myName, "cfasl_output_object_float_method", "CFASL-OUTPUT-OBJECT-FLOAT-METHOD", 2, 0, false);
    declareFunction(myName, "cfasl_output_float", "CFASL-OUTPUT-FLOAT", 2, 0, false);
    declareFunction(myName, "cfasl_input_p_float", "CFASL-INPUT-P-FLOAT", 1, 0, false); new $cfasl_input_p_float$UnaryFunction();
    declareFunction(myName, "cfasl_input_n_float", "CFASL-INPUT-N-FLOAT", 1, 0, false); new $cfasl_input_n_float$UnaryFunction();
    declareFunction(myName, "cfasl_input_float", "CFASL-INPUT-FLOAT", 1, 0, false);
    declareFunction(myName, "cfasl_output_object_symbol_method", "CFASL-OUTPUT-OBJECT-SYMBOL-METHOD", 2, 0, false);
    declareFunction(myName, "cfasl_output_keyword", "CFASL-OUTPUT-KEYWORD", 2, 0, false);
    declareFunction(myName, "cfasl_input_keyword", "CFASL-INPUT-KEYWORD", 1, 0, false); new $cfasl_input_keyword$UnaryFunction();
    declareFunction(myName, "cfasl_output_other_symbol", "CFASL-OUTPUT-OTHER-SYMBOL", 2, 0, false);
    declareFunction(myName, "cyc_package_symbol_p", "CYC-PACKAGE-SYMBOL-P", 1, 0, false);
    declareFunction(myName, "cfasl_input_other_symbol", "CFASL-INPUT-OTHER-SYMBOL", 1, 0, false); new $cfasl_input_other_symbol$UnaryFunction();
    declareFunction(myName, "cfasl_output_nil", "CFASL-OUTPUT-NIL", 1, 0, false);
    declareFunction(myName, "cfasl_input_nil", "CFASL-INPUT-NIL", 1, 0, false); new $cfasl_input_nil$UnaryFunction();
    declareFunction(myName, "cfasl_set_common_symbols", "CFASL-SET-COMMON-SYMBOLS", 1, 0, false);
    declareMacro(myName, "with_cfasl_common_symbols", "WITH-CFASL-COMMON-SYMBOLS");
    declareFunction(myName, "cfasl_set_common_symbols_simple", "CFASL-SET-COMMON-SYMBOLS-SIMPLE", 1, 0, false);
    declareMacro(myName, "with_cfasl_common_symbols_simple", "WITH-CFASL-COMMON-SYMBOLS-SIMPLE");
    declareFunction(myName, "cfasl_current_common_symbols", "CFASL-CURRENT-COMMON-SYMBOLS", 0, 0, false);
    declareFunction(myName, "cfasl_common_symbol_p", "CFASL-COMMON-SYMBOL-P", 1, 0, false);
    declareFunction(myName, "cfasl_encode_common_symbol", "CFASL-ENCODE-COMMON-SYMBOL", 1, 0, false);
    declareFunction(myName, "cfasl_decode_common_symbol", "CFASL-DECODE-COMMON-SYMBOL", 1, 0, false);
    declareFunction(myName, "cfasl_output_common_symbol", "CFASL-OUTPUT-COMMON-SYMBOL", 2, 0, false);
    declareFunction(myName, "cfasl_input_common_symbol", "CFASL-INPUT-COMMON-SYMBOL", 1, 0, false); new $cfasl_input_common_symbol$UnaryFunction();
    declareFunction(myName, "cfasl_output_object_cons_method", "CFASL-OUTPUT-OBJECT-CONS-METHOD", 2, 0, false);
    declareFunction(myName, "register_cfasl_list_method", "REGISTER-CFASL-LIST-METHOD", 3, 0, false);
    declareFunction(myName, "handle_cfasl_list_methods", "HANDLE-CFASL-LIST-METHODS", 2, 0, false);
    declareFunction(myName, "cfasl_output_list", "CFASL-OUTPUT-LIST", 2, 0, false);
    declareFunction(myName, "cfasl_input_list", "CFASL-INPUT-LIST", 1, 0, false); new $cfasl_input_list$UnaryFunction();
    declareFunction(myName, "cfasl_output_dotted_list", "CFASL-OUTPUT-DOTTED-LIST", 2, 0, false);
    declareFunction(myName, "cfasl_input_dotted_list", "CFASL-INPUT-DOTTED-LIST", 1, 0, false); new $cfasl_input_dotted_list$UnaryFunction();
    declareFunction(myName, "cfasl_output_object_vector_method", "CFASL-OUTPUT-OBJECT-VECTOR-METHOD", 2, 0, false);
    declareFunction(myName, "cfasl_output_general_vector", "CFASL-OUTPUT-GENERAL-VECTOR", 2, 0, false);
    declareFunction(myName, "cfasl_input_general_vector", "CFASL-INPUT-GENERAL-VECTOR", 1, 0, false); new $cfasl_input_general_vector$UnaryFunction();
    declareFunction(myName, "cfasl_output_byte_vector", "CFASL-OUTPUT-BYTE-VECTOR", 2, 0, false);
    declareFunction(myName, "cfasl_input_byte_vector", "CFASL-INPUT-BYTE-VECTOR", 1, 0, false);
    declareFunction(myName, "cfasl_output_object_string_method", "CFASL-OUTPUT-OBJECT-STRING-METHOD", 2, 0, false);
    declareFunction(myName, "cfasl_output_string", "CFASL-OUTPUT-STRING", 2, 0, false);
    declareFunction(myName, "cfasl_input_string", "CFASL-INPUT-STRING", 1, 0, false); new $cfasl_input_string$UnaryFunction();
    declareFunction(myName, "cfasl_output_object_character_method", "CFASL-OUTPUT-OBJECT-CHARACTER-METHOD", 2, 0, false);
    declareFunction(myName, "cfasl_output_character", "CFASL-OUTPUT-CHARACTER", 2, 0, false);
    declareFunction(myName, "cfasl_input_character", "CFASL-INPUT-CHARACTER", 1, 0, false); new $cfasl_input_character$UnaryFunction();
    declareFunction(myName, "cfasl_output_object_hash_table_method", "CFASL-OUTPUT-OBJECT-HASH-TABLE-METHOD", 2, 0, false);
    declareFunction(myName, "cfasl_output_hashtable", "CFASL-OUTPUT-HASHTABLE", 2, 0, false);
    declareFunction(myName, "cfasl_input_hashtable", "CFASL-INPUT-HASHTABLE", 1, 0, false);
    declareFunction(myName, "cfasl_output_object_guid_method", "CFASL-OUTPUT-OBJECT-GUID-METHOD", 2, 0, false);
    declareFunction(myName, "cfasl_output_guid", "CFASL-OUTPUT-GUID", 2, 0, false);
    declareFunction(myName, "cfasl_input_guid", "CFASL-INPUT-GUID", 1, 0, false); new $cfasl_input_guid$UnaryFunction();
    declareFunction(myName, "cfasl_input_guid_byte_vector", "CFASL-INPUT-GUID-BYTE-VECTOR", 1, 0, false);
    declareFunction(myName, "cfasl_output_legacy_guid", "CFASL-OUTPUT-LEGACY-GUID", 2, 0, false);
    declareFunction(myName, "cfasl_input_legacy_guid", "CFASL-INPUT-LEGACY-GUID", 1, 0, false);
    declareFunction(myName, "cfasl_input_guid_string", "CFASL-INPUT-GUID-STRING", 1, 0, false);
    declareFunction(myName, "get_new_cfasl_input_guid_string_resource", "GET-NEW-CFASL-INPUT-GUID-STRING-RESOURCE", 0, 0, false);
    declareMacro(myName, "with_new_cfasl_input_guid_string_resource", "WITH-NEW-CFASL-INPUT-GUID-STRING-RESOURCE");
    declareFunction(myName, "cfasl_input_result_set", "CFASL-INPUT-RESULT-SET", 1, 0, false);
    declareFunction(myName, "cfasl_output_object_package_method", "CFASL-OUTPUT-OBJECT-PACKAGE-METHOD", 2, 0, false);
    declareFunction(myName, "cfasl_output_package", "CFASL-OUTPUT-PACKAGE", 2, 0, false);
    declareFunction(myName, "cfasl_input_package", "CFASL-INPUT-PACKAGE", 1, 0, false);
    declareFunction(myName, "cfasl_narrow_opcode_p", "CFASL-NARROW-OPCODE-P", 1, 0, false);
    declareFunction(myName, "cfasl_wide_opcode_input_method", "CFASL-WIDE-OPCODE-INPUT-METHOD", 1, 0, false);
    declareFunction(myName, "cfasl_input_wide_opcode_encoded", "CFASL-INPUT-WIDE-OPCODE-ENCODED", 1, 0, false);
    declareMacro(myName, "declare_wide_cfasl_opcode", "DECLARE-WIDE-CFASL-OPCODE");
    declareFunction(myName, "register_wide_cfasl_opcode_input_function", "REGISTER-WIDE-CFASL-OPCODE-INPUT-FUNCTION", 2, 0, false);
    declareFunction(myName, "cfasl_output_wide_opcode", "CFASL-OUTPUT-WIDE-OPCODE", 2, 0, false);
    declareFunction(myName, "cfasl_input_instance", "CFASL-INPUT-INSTANCE", 1, 0, false);
    declareMacro(myName, "declare_cfasl_guid_opcode", "DECLARE-CFASL-GUID-OPCODE");
    declareMacro(myName, "declare_cfasl_guid_string_opcode", "DECLARE-CFASL-GUID-STRING-OPCODE");
    declareFunction(myName, "register_cfasl_guid_denoted_type_input_function", "REGISTER-CFASL-GUID-DENOTED-TYPE-INPUT-FUNCTION", 2, 0, false);
    declareFunction(myName, "write_cfasl_guid_denoted_type_opcode", "WRITE-CFASL-GUID-DENOTED-TYPE-OPCODE", 2, 0, false);
    declareFunction(myName, "cfasl_guid_denoted_type_input_method", "CFASL-GUID-DENOTED-TYPE-INPUT-METHOD", 1, 0, false);
    declareFunction(myName, "cfasl_input_guid_denoted_type", "CFASL-INPUT-GUID-DENOTED-TYPE", 1, 0, false);
    declareMacro(myName, "with_guid_denoted_type_cfasl_encoding", "WITH-GUID-DENOTED-TYPE-CFASL-ENCODING");
    declareFunction(myName, "cfasl_test", "CFASL-TEST", 1, 0, false);
    declareFunction(myName, "show_cfasl_file", "SHOW-CFASL-FILE", 1, 1, false);
    return NIL;
  }

  public static final SubLObject init_cfasl_file() {
    $dtp_cfasl_encoding_stream$ = defconstant("*DTP-CFASL-ENCODING-STREAM*", $sym0$CFASL_ENCODING_STREAM);
    $terse_guid_serialization_enabledP$ = defparameter("*TERSE-GUID-SERIALIZATION-ENABLED?*", NIL);
    $terse_guid_serialization_enabled_for_cfasl_encode_externalizedP$ = defparameter("*TERSE-GUID-SERIALIZATION-ENABLED-FOR-CFASL-ENCODE-EXTERNALIZED?*", $kw27$UNINITIALIZED);
    $dtp_cfasl_decoding_stream$ = defconstant("*DTP-CFASL-DECODING-STREAM*", $sym28$CFASL_DECODING_STREAM);
    $dtp_cfasl_count_stream$ = defconstant("*DTP-CFASL-COUNT-STREAM*", $sym43$CFASL_COUNT_STREAM);
    $cfasl_stream_extensions_enabled$ = defparameter("*CFASL-STREAM-EXTENSIONS-ENABLED*", NIL);
    $cfasl_unread_byte$ = defparameter("*CFASL-UNREAD-BYTE*", NIL);
    $cfasl_output_object_method_table$ = deflexical("*CFASL-OUTPUT-OBJECT-METHOD-TABLE*", Vectors.make_vector($int58$256, NIL));
    $cfasl_input_to_static_area$ = defparameter("*CFASL-INPUT-TO-STATIC-AREA*", NIL);
    $cfasl_max_opcode$ = defconstant("*CFASL-MAX-OPCODE*", $int66$128);
    $cfasl_input_method_table$ = deflexical("*CFASL-INPUT-METHOD-TABLE*", maybeDefault( $sym67$_CFASL_INPUT_METHOD_TABLE_, $cfasl_input_method_table$, ()-> (Vectors.make_vector($cfasl_max_opcode$.getGlobalValue(), $sym64$CFASL_INPUT_ERROR))));
    $within_cfasl_externalization$ = defparameter("*WITHIN-CFASL-EXTERNALIZATION*", NIL);
    $cfasl_channel_externalizedP$ = defparameter("*CFASL-CHANNEL-EXTERNALIZED?*", T);
    $cfasl_extensions$ = deflexical("*CFASL-EXTENSIONS*", maybeDefault( $sym81$_CFASL_EXTENSIONS_, $cfasl_extensions$, NIL));
    $cfasl_opcode_externalization$ = defconstant("*CFASL-OPCODE-EXTERNALIZATION*", $int85$51);
    $current_cfasl_defstruct_output_stream$ = defparameter("*CURRENT-CFASL-DEFSTRUCT-OUTPUT-STREAM*", NIL);
    $cfasl_opcode_defstruct_recipe$ = defconstant("*CFASL-OPCODE-DEFSTRUCT-RECIPE*", $int87$44);
    $cfasl_immediate_fixnum_cutoff$ = defconstant("*CFASL-IMMEDIATE-FIXNUM-CUTOFF*", $cfasl_max_opcode$.getGlobalValue());
    $cfasl_immediate_fixnum_offset$ = defconstant("*CFASL-IMMEDIATE-FIXNUM-OFFSET*", Numbers.subtract($int58$256, $cfasl_immediate_fixnum_cutoff$.getGlobalValue()));
    $cfasl_opcode_p_8bit_int$ = defconstant("*CFASL-OPCODE-P-8BIT-INT*", ZERO_INTEGER);
    $cfasl_opcode_n_8bit_int$ = defconstant("*CFASL-OPCODE-N-8BIT-INT*", ONE_INTEGER);
    $cfasl_opcode_p_16bit_int$ = defconstant("*CFASL-OPCODE-P-16BIT-INT*", TWO_INTEGER);
    $cfasl_opcode_n_16bit_int$ = defconstant("*CFASL-OPCODE-N-16BIT-INT*", THREE_INTEGER);
    $cfasl_opcode_p_24bit_int$ = defconstant("*CFASL-OPCODE-P-24BIT-INT*", FOUR_INTEGER);
    $cfasl_opcode_n_24bit_int$ = defconstant("*CFASL-OPCODE-N-24BIT-INT*", FIVE_INTEGER);
    $cfasl_opcode_p_32bit_int$ = defconstant("*CFASL-OPCODE-P-32BIT-INT*", SIX_INTEGER);
    $cfasl_opcode_n_32bit_int$ = defconstant("*CFASL-OPCODE-N-32BIT-INT*", SEVEN_INTEGER);
    $cfasl_opcode_p_bignum$ = defconstant("*CFASL-OPCODE-P-BIGNUM*", $int103$23);
    $cfasl_opcode_n_bignum$ = defconstant("*CFASL-OPCODE-N-BIGNUM*", $int105$24);
    $cfasl_opcode_p_float$ = defconstant("*CFASL-OPCODE-P-FLOAT*", EIGHT_INTEGER);
    $cfasl_opcode_n_float$ = defconstant("*CFASL-OPCODE-N-FLOAT*", NINE_INTEGER);
    $cfasl_opcode_keyword$ = defconstant("*CFASL-OPCODE-KEYWORD*", TEN_INTEGER);
    $cfasl_opcode_other_symbol$ = defconstant("*CFASL-OPCODE-OTHER-SYMBOL*", ELEVEN_INTEGER);
    $cfasl_opcode_nil$ = defconstant("*CFASL-OPCODE-NIL*", TWELVE_INTEGER);
    $cfasl_opcode_common_symbol$ = defconstant("*CFASL-OPCODE-COMMON-SYMBOL*", $int121$50);
    $cfasl_common_symbols$ = defparameter("*CFASL-COMMON-SYMBOLS*", NIL);
    $cfasl_list_methods$ = deflexical("*CFASL-LIST-METHODS*", maybeDefault( $sym132$_CFASL_LIST_METHODS_, $cfasl_list_methods$, NIL));
    $cfasl_opcode_list$ = defconstant("*CFASL-OPCODE-LIST*", THIRTEEN_INTEGER);
    $cfasl_opcode_dotted_list$ = defconstant("*CFASL-OPCODE-DOTTED-LIST*", SEVENTEEN_INTEGER);
    $cfasl_opcode_general_vector$ = defconstant("*CFASL-OPCODE-GENERAL-VECTOR*", FOURTEEN_INTEGER);
    $cfasl_opcode_byte_vector$ = defconstant("*CFASL-OPCODE-BYTE-VECTOR*", $int139$26);
    $cfasl_opcode_string$ = defconstant("*CFASL-OPCODE-STRING*", FIFTEEN_INTEGER);
    $cfasl_input_string_resource$ = defparameter("*CFASL-INPUT-STRING-RESOURCE*", NIL);
    $cfasl_opcode_character$ = defconstant("*CFASL-OPCODE-CHARACTER*", SIXTEEN_INTEGER);
    $cfasl_opcode_hashtable$ = defconstant("*CFASL-OPCODE-HASHTABLE*", EIGHTEEN_INTEGER);
    $cfasl_opcode_guid$ = defconstant("*CFASL-OPCODE-GUID*", $int147$43);
    $cfasl_opcode_legacy_guid$ = defconstant("*CFASL-OPCODE-LEGACY-GUID*", $int150$25);
    $cfasl_input_guid_string_resource$ = defparameter("*CFASL-INPUT-GUID-STRING-RESOURCE*", NIL);
    $cfasl_opcode_result_set$ = defconstant("*CFASL-OPCODE-RESULT-SET*", $int154$27);
    $cfasl_opcode_package$ = defconstant("*CFASL-OPCODE-PACKAGE*", $int156$28);
    $cfasl_opcode_wide_cfasl_opcode$ = defconstant("*CFASL-OPCODE-WIDE-CFASL-OPCODE*", $int159$29);
    $cfasl_min_wide_opcode$ = defconstant("*CFASL-MIN-WIDE-OPCODE*", $cfasl_max_opcode$.getGlobalValue());
    $cfasl_wide_opcode_input_method_table$ = deflexical("*CFASL-WIDE-OPCODE-INPUT-METHOD-TABLE*", maybeDefault( $sym161$_CFASL_WIDE_OPCODE_INPUT_METHOD_TABLE_, $cfasl_wide_opcode_input_method_table$, ()-> (Hashtables.make_hash_table($int112$32, Symbols.symbol_function(EQL), UNPROVIDED))));
    $cfasl_opcode_instance$ = defconstant("*CFASL-OPCODE-INSTANCE*", $int167$124);
    $cfasl_opcode_guid_denoted_type$ = defconstant("*CFASL-OPCODE-GUID-DENOTED-TYPE*", $int170$126);
    $cfasl_guid_denoted_type_input_method_table$ = deflexical("*CFASL-GUID-DENOTED-TYPE-INPUT-METHOD-TABLE*", maybeDefault( $sym172$_CFASL_GUID_DENOTED_TYPE_INPUT_METHOD_TABLE_, $cfasl_guid_denoted_type_input_method_table$, ()-> (Hashtables.make_hash_table($int173$100, Symbols.symbol_function(EQUALP), UNPROVIDED))));
    return NIL;
  }

  public static final SubLObject setup_cfasl_file() {
    // CVS_ID("Id: cfasl.lisp 128945 2009-10-13 22:05:33Z rck ");
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_cfasl_encoding_stream$.getGlobalValue(), Symbols.symbol_function($sym7$CFASL_ENCODING_STREAM_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym8$CFASL_ENCODING_STREAM_INTERNAL_STREAM, $sym9$_CSETF_CFASL_ENCODING_STREAM_INTERNAL_STREAM);
    Equality.identity($sym0$CFASL_ENCODING_STREAM);
    access_macros.register_macro_helper($sym19$CFASL_ENCODING_STRING_STREAM_ENCODING, $sym21$WITH_CFASL_OUTPUT_TO_HEX_STRING);
    access_macros.register_macro_helper($sym24$NEW_CFASL_ENCODING_STREAM, $sym25$WITH_CFASL_OUTPUT_TO_BYTE_VECTOR);
    access_macros.register_macro_helper($sym26$CFASL_ENCODING_STREAM_WRITE_BYTE, $sym25$WITH_CFASL_OUTPUT_TO_BYTE_VECTOR);
    access_macros.register_macro_helper($sym23$CFASL_ENCODING_STREAM_ENCODING, $sym25$WITH_CFASL_OUTPUT_TO_BYTE_VECTOR);
    access_macros.register_macro_helper($sym20$CLOSE_CFASL_ENCODING_STREAM, $sym25$WITH_CFASL_OUTPUT_TO_BYTE_VECTOR);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_cfasl_decoding_stream$.getGlobalValue(), Symbols.symbol_function($sym32$CFASL_DECODING_STREAM_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym33$CFASL_DECODING_STREAM_INTERNAL_STREAM, $sym34$_CSETF_CFASL_DECODING_STREAM_INTERNAL_STREAM);
    Equality.identity($sym28$CFASL_DECODING_STREAM);
    access_macros.register_macro_helper($sym35$NEW_CFASL_DECODING_STREAM_FROM_STRING, $sym37$WITH_CFASL_INPUT_FROM_STRING);
    access_macros.register_macro_helper($sym38$NEW_CFASL_DECODING_STREAM, $sym39$WITH_CFASL_INPUT_FROM_BYTE_VECTOR);
    access_macros.register_macro_helper($sym41$CFASL_DECODING_STREAM_READ_BYTE, $sym39$WITH_CFASL_INPUT_FROM_BYTE_VECTOR);
    access_macros.register_macro_helper($sym36$CLOSE_CFASL_DECODING_STREAM, $sym39$WITH_CFASL_INPUT_FROM_BYTE_VECTOR);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_cfasl_count_stream$.getGlobalValue(), Symbols.symbol_function($sym49$CFASL_COUNT_STREAM_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym50$CFASL_COUNT_STREAM_POSITION, $sym51$_CSETF_CFASL_COUNT_STREAM_POSITION);
    Equality.identity($sym43$CFASL_COUNT_STREAM);
    subl_macro_promotions.declare_defglobal($sym67$_CFASL_INPUT_METHOD_TABLE_);
    access_macros.register_macro_helper($sym71$REGISTER_CFASL_INPUT_FUNCTION, $sym73$DECLARE_CFASL_OPCODE);
    subl_macro_promotions.declare_defglobal($sym81$_CFASL_EXTENSIONS_);
    access_macros.register_macro_helper($sym83$REGISTER_CFASL_EXTENSION, $sym84$DECLARE_CFASL_EXTENSION_OPCODE);
    register_cfasl_input_function($cfasl_opcode_externalization$.getGlobalValue(), $sym86$CFASL_INPUT_EXTERNALIZATION);
    register_cfasl_input_function($cfasl_opcode_defstruct_recipe$.getGlobalValue(), $sym88$CFASL_INPUT_DEFSTRUCT_RECIPE);
    register_cfasl_input_function($cfasl_opcode_p_8bit_int$.getGlobalValue(), $sym95$CFASL_INPUT_P_8BIT_INT);
    register_cfasl_input_function($cfasl_opcode_n_8bit_int$.getGlobalValue(), $sym96$CFASL_INPUT_N_8BIT_INT);
    register_cfasl_input_function($cfasl_opcode_p_16bit_int$.getGlobalValue(), $sym97$CFASL_INPUT_P_16BIT_INT);
    register_cfasl_input_function($cfasl_opcode_n_16bit_int$.getGlobalValue(), $sym98$CFASL_INPUT_N_16BIT_INT);
    register_cfasl_input_function($cfasl_opcode_p_24bit_int$.getGlobalValue(), $sym99$CFASL_INPUT_P_24BIT_INT);
    register_cfasl_input_function($cfasl_opcode_n_24bit_int$.getGlobalValue(), $sym100$CFASL_INPUT_N_24BIT_INT);
    register_cfasl_input_function($cfasl_opcode_p_32bit_int$.getGlobalValue(), $sym101$CFASL_INPUT_P_32BIT_INT);
    register_cfasl_input_function($cfasl_opcode_n_32bit_int$.getGlobalValue(), $sym102$CFASL_INPUT_N_32BIT_INT);
    register_cfasl_input_function($cfasl_opcode_p_bignum$.getGlobalValue(), $sym104$CFASL_INPUT_P_BIGNUM);
    register_cfasl_input_function($cfasl_opcode_n_bignum$.getGlobalValue(), $sym106$CFASL_INPUT_N_BIGNUM);
    Structures.register_method($cfasl_output_object_method_table$.getGlobalValue(), Types.$dtp_bignum$.getGlobalValue(), Symbols.symbol_function($sym107$CFASL_OUTPUT_OBJECT_INTEGER_METHOD));
    Structures.register_method($cfasl_output_object_method_table$.getGlobalValue(), Types.$dtp_fixnum$.getGlobalValue(), Symbols.symbol_function($sym107$CFASL_OUTPUT_OBJECT_INTEGER_METHOD));
    register_cfasl_input_function($cfasl_opcode_p_float$.getGlobalValue(), $sym114$CFASL_INPUT_P_FLOAT);
    register_cfasl_input_function($cfasl_opcode_n_float$.getGlobalValue(), $sym115$CFASL_INPUT_N_FLOAT);
    Structures.register_method($cfasl_output_object_method_table$.getGlobalValue(), Types.$dtp_float$.getGlobalValue(), Symbols.symbol_function($sym116$CFASL_OUTPUT_OBJECT_FLOAT_METHOD));
    Structures.register_method($cfasl_output_object_method_table$.getGlobalValue(), Types.$dtp_symbol$.getGlobalValue(), Symbols.symbol_function($sym117$CFASL_OUTPUT_OBJECT_SYMBOL_METHOD));
    register_cfasl_input_function($cfasl_opcode_keyword$.getGlobalValue(), $sym118$CFASL_INPUT_KEYWORD);
    register_cfasl_input_function($cfasl_opcode_other_symbol$.getGlobalValue(), $sym119$CFASL_INPUT_OTHER_SYMBOL);
    register_cfasl_input_function($cfasl_opcode_nil$.getGlobalValue(), $sym120$CFASL_INPUT_NIL);
    register_cfasl_input_function($cfasl_opcode_common_symbol$.getGlobalValue(), $sym122$CFASL_INPUT_COMMON_SYMBOL);
    Structures.register_method($cfasl_output_object_method_table$.getGlobalValue(), Types.$dtp_cons$.getGlobalValue(), Symbols.symbol_function($sym131$CFASL_OUTPUT_OBJECT_CONS_METHOD));
    subl_macro_promotions.declare_defglobal($sym132$_CFASL_LIST_METHODS_);
    register_cfasl_input_function($cfasl_opcode_list$.getGlobalValue(), $sym133$CFASL_INPUT_LIST);
    register_cfasl_input_function($cfasl_opcode_dotted_list$.getGlobalValue(), $sym136$CFASL_INPUT_DOTTED_LIST);
    Structures.register_method($cfasl_output_object_method_table$.getGlobalValue(), Types.$dtp_vector$.getGlobalValue(), Symbols.symbol_function($sym137$CFASL_OUTPUT_OBJECT_VECTOR_METHOD));
    register_cfasl_input_function($cfasl_opcode_general_vector$.getGlobalValue(), $sym138$CFASL_INPUT_GENERAL_VECTOR);
    register_cfasl_input_function($cfasl_opcode_byte_vector$.getGlobalValue(), $sym140$CFASL_INPUT_BYTE_VECTOR);
    register_cfasl_input_function($cfasl_opcode_string$.getGlobalValue(), $sym141$CFASL_INPUT_STRING);
    Structures.register_method($cfasl_output_object_method_table$.getGlobalValue(), Types.$dtp_string$.getGlobalValue(), Symbols.symbol_function($sym142$CFASL_OUTPUT_OBJECT_STRING_METHOD));
    register_cfasl_input_function($cfasl_opcode_character$.getGlobalValue(), $sym143$CFASL_INPUT_CHARACTER);
    Structures.register_method($cfasl_output_object_method_table$.getGlobalValue(), Types.$dtp_character$.getGlobalValue(), Symbols.symbol_function($sym144$CFASL_OUTPUT_OBJECT_CHARACTER_METHOD));
    register_cfasl_input_function($cfasl_opcode_hashtable$.getGlobalValue(), $sym145$CFASL_INPUT_HASHTABLE);
    Structures.register_method($cfasl_output_object_method_table$.getGlobalValue(), Types.$dtp_hash_table$.getGlobalValue(), Symbols.symbol_function($sym146$CFASL_OUTPUT_OBJECT_HASH_TABLE_METHOD));
    register_cfasl_input_function($cfasl_opcode_guid$.getGlobalValue(), $sym148$CFASL_INPUT_GUID);
    Structures.register_method($cfasl_output_object_method_table$.getGlobalValue(), Guids.$dtp_guid$.getGlobalValue(), Symbols.symbol_function($sym149$CFASL_OUTPUT_OBJECT_GUID_METHOD));
    register_cfasl_input_function($cfasl_opcode_legacy_guid$.getGlobalValue(), $sym151$CFASL_INPUT_LEGACY_GUID);
    register_cfasl_input_function($cfasl_opcode_result_set$.getGlobalValue(), $sym155$CFASL_INPUT_RESULT_SET);
    register_cfasl_input_function($cfasl_opcode_package$.getGlobalValue(), $sym157$CFASL_INPUT_PACKAGE);
    Structures.register_method($cfasl_output_object_method_table$.getGlobalValue(), Types.$dtp_package$.getGlobalValue(), Symbols.symbol_function($sym158$CFASL_OUTPUT_OBJECT_PACKAGE_METHOD));
    register_cfasl_input_function($cfasl_opcode_wide_cfasl_opcode$.getGlobalValue(), $sym160$CFASL_INPUT_WIDE_OPCODE_ENCODED);
    subl_macro_promotions.declare_defglobal($sym161$_CFASL_WIDE_OPCODE_INPUT_METHOD_TABLE_);
    access_macros.register_macro_helper($sym165$REGISTER_WIDE_CFASL_OPCODE_INPUT_FUNCTION, $sym166$DECLARE_WIDE_CFASL_OPCODE);
    register_cfasl_input_function($cfasl_opcode_instance$.getGlobalValue(), $sym168$CFASL_INPUT_INSTANCE);
    register_cfasl_input_function($cfasl_opcode_guid_denoted_type$.getGlobalValue(), $sym171$CFASL_INPUT_GUID_DENOTED_TYPE);
    subl_macro_promotions.declare_defglobal($sym172$_CFASL_GUID_DENOTED_TYPE_INPUT_METHOD_TABLE_);
    access_macros.register_macro_helper($sym177$REGISTER_CFASL_GUID_DENOTED_TYPE_INPUT_FUNCTION, $sym181$DECLARE_CFASL_GUID_OPCODE);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$CFASL_ENCODING_STREAM = makeSymbol("CFASL-ENCODING-STREAM");
  public static final SubLSymbol $sym1$CFASL_ENCODING_STREAM_P = makeSymbol("CFASL-ENCODING-STREAM-P");
  public static final SubLList $list2 = list(makeSymbol("INTERNAL-STREAM"));
  public static final SubLList $list3 = list(makeKeyword("INTERNAL-STREAM"));
  public static final SubLList $list4 = list(makeSymbol("CFASL-ENCODING-STREAM-INTERNAL-STREAM"));
  public static final SubLList $list5 = list(makeSymbol("_CSETF-CFASL-ENCODING-STREAM-INTERNAL-STREAM"));
  public static final SubLSymbol $sym6$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
  public static final SubLSymbol $sym7$CFASL_ENCODING_STREAM_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("CFASL-ENCODING-STREAM-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym8$CFASL_ENCODING_STREAM_INTERNAL_STREAM = makeSymbol("CFASL-ENCODING-STREAM-INTERNAL-STREAM");
  public static final SubLSymbol $sym9$_CSETF_CFASL_ENCODING_STREAM_INTERNAL_STREAM = makeSymbol("_CSETF-CFASL-ENCODING-STREAM-INTERNAL-STREAM");
  public static final SubLSymbol $kw10$INTERNAL_STREAM = makeKeyword("INTERNAL-STREAM");
  public static final SubLString $str11$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLList $list12 = list(list(makeSymbol("STREAM"), makeSymbol("STRING")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym13$SYMBOLP = makeSymbol("SYMBOLP");
  public static final SubLSymbol $sym14$CLET = makeSymbol("CLET");
  public static final SubLList $list15 = list(list(makeSymbol("NEW-CFASL-ENCODING-STREAM")));
  public static final SubLSymbol $sym16$CUNWIND_PROTECT = makeSymbol("CUNWIND-PROTECT");
  public static final SubLSymbol $sym17$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $sym18$CSETQ = makeSymbol("CSETQ");
  public static final SubLSymbol $sym19$CFASL_ENCODING_STRING_STREAM_ENCODING = makeSymbol("CFASL-ENCODING-STRING-STREAM-ENCODING");
  public static final SubLSymbol $sym20$CLOSE_CFASL_ENCODING_STREAM = makeSymbol("CLOSE-CFASL-ENCODING-STREAM");
  public static final SubLSymbol $sym21$WITH_CFASL_OUTPUT_TO_HEX_STRING = makeSymbol("WITH-CFASL-OUTPUT-TO-HEX-STRING");
  public static final SubLList $list22 = list(list(makeSymbol("STREAM"), makeSymbol("BYTE-VECTOR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym23$CFASL_ENCODING_STREAM_ENCODING = makeSymbol("CFASL-ENCODING-STREAM-ENCODING");
  public static final SubLSymbol $sym24$NEW_CFASL_ENCODING_STREAM = makeSymbol("NEW-CFASL-ENCODING-STREAM");
  public static final SubLSymbol $sym25$WITH_CFASL_OUTPUT_TO_BYTE_VECTOR = makeSymbol("WITH-CFASL-OUTPUT-TO-BYTE-VECTOR");
  public static final SubLSymbol $sym26$CFASL_ENCODING_STREAM_WRITE_BYTE = makeSymbol("CFASL-ENCODING-STREAM-WRITE-BYTE");
  public static final SubLSymbol $kw27$UNINITIALIZED = makeKeyword("UNINITIALIZED");
  public static final SubLSymbol $sym28$CFASL_DECODING_STREAM = makeSymbol("CFASL-DECODING-STREAM");
  public static final SubLSymbol $sym29$CFASL_DECODING_STREAM_P = makeSymbol("CFASL-DECODING-STREAM-P");
  public static final SubLList $list30 = list(makeSymbol("CFASL-DECODING-STREAM-INTERNAL-STREAM"));
  public static final SubLList $list31 = list(makeSymbol("_CSETF-CFASL-DECODING-STREAM-INTERNAL-STREAM"));
  public static final SubLSymbol $sym32$CFASL_DECODING_STREAM_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("CFASL-DECODING-STREAM-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym33$CFASL_DECODING_STREAM_INTERNAL_STREAM = makeSymbol("CFASL-DECODING-STREAM-INTERNAL-STREAM");
  public static final SubLSymbol $sym34$_CSETF_CFASL_DECODING_STREAM_INTERNAL_STREAM = makeSymbol("_CSETF-CFASL-DECODING-STREAM-INTERNAL-STREAM");
  public static final SubLSymbol $sym35$NEW_CFASL_DECODING_STREAM_FROM_STRING = makeSymbol("NEW-CFASL-DECODING-STREAM-FROM-STRING");
  public static final SubLSymbol $sym36$CLOSE_CFASL_DECODING_STREAM = makeSymbol("CLOSE-CFASL-DECODING-STREAM");
  public static final SubLSymbol $sym37$WITH_CFASL_INPUT_FROM_STRING = makeSymbol("WITH-CFASL-INPUT-FROM-STRING");
  public static final SubLSymbol $sym38$NEW_CFASL_DECODING_STREAM = makeSymbol("NEW-CFASL-DECODING-STREAM");
  public static final SubLSymbol $sym39$WITH_CFASL_INPUT_FROM_BYTE_VECTOR = makeSymbol("WITH-CFASL-INPUT-FROM-BYTE-VECTOR");
  public static final SubLSymbol $sym40$CFASL_ENCODING_P = makeSymbol("CFASL-ENCODING-P");
  public static final SubLSymbol $sym41$CFASL_DECODING_STREAM_READ_BYTE = makeSymbol("CFASL-DECODING-STREAM-READ-BYTE");
  public static final SubLSymbol $kw42$EOF = makeKeyword("EOF");
  public static final SubLSymbol $sym43$CFASL_COUNT_STREAM = makeSymbol("CFASL-COUNT-STREAM");
  public static final SubLSymbol $sym44$CFASL_COUNT_STREAM_P = makeSymbol("CFASL-COUNT-STREAM-P");
  public static final SubLList $list45 = list(makeSymbol("POSITION"));
  public static final SubLList $list46 = list(makeKeyword("POSITION"));
  public static final SubLList $list47 = list(makeSymbol("CFASL-COUNT-STREAM-POSITION"));
  public static final SubLList $list48 = list(makeSymbol("_CSETF-CFASL-COUNT-STREAM-POSITION"));
  public static final SubLSymbol $sym49$CFASL_COUNT_STREAM_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("CFASL-COUNT-STREAM-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym50$CFASL_COUNT_STREAM_POSITION = makeSymbol("CFASL-COUNT-STREAM-POSITION");
  public static final SubLSymbol $sym51$_CSETF_CFASL_COUNT_STREAM_POSITION = makeSymbol("_CSETF-CFASL-COUNT-STREAM-POSITION");
  public static final SubLSymbol $kw52$POSITION = makeKeyword("POSITION");
  public static final SubLList $list53 = list(list(makeSymbol("STREAM"), makeSymbol("COUNT")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list54 = list(list(makeSymbol("NEW-CFASL-COUNT-STREAM")));
  public static final SubLSymbol $sym55$CFASL_COUNT_STREAM_SIZE = makeSymbol("CFASL-COUNT-STREAM-SIZE");
  public static final SubLSymbol $sym56$CLOSE_CFASL_COUNT_STREAM = makeSymbol("CLOSE-CFASL-COUNT-STREAM");
  public static final SubLList $list57 = list(list(makeSymbol("*CFASL-STREAM-EXTENSIONS-ENABLED*"), T), list(makeSymbol("*CFASL-UNREAD-BYTE*"), NIL));
  public static final SubLInteger $int58$256 = makeInteger(256);
  public static final SubLSymbol $sym59$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
  public static final SubLString $str60$Use_NIL_instead = makeString("Use NIL instead");
  public static final SubLString $str61$CFASL_cannot_handle____S = makeString("CFASL cannot handle : ~S");
  public static final SubLString $str62$Undefined_cfasl_opcode_in__S = makeString("Undefined cfasl opcode in ~S");
  public static final SubLString $str63$end_of_file_on_stream__S = makeString("end-of-file on stream ~S");
  public static final SubLSymbol $sym64$CFASL_INPUT_ERROR = makeSymbol("CFASL-INPUT-ERROR");
  public static final SubLString $str65$Undefined_cfasl_opcode__A_in__S = makeString("Undefined cfasl opcode ~A in ~S");
  public static final SubLInteger $int66$128 = makeInteger(128);
  public static final SubLSymbol $sym67$_CFASL_INPUT_METHOD_TABLE_ = makeSymbol("*CFASL-INPUT-METHOD-TABLE*");
  public static final SubLList $list68 = list(makeSymbol("VARIABLE"), makeSymbol("CFASL-OPCODE"), makeSymbol("INPUT-FUNCTION"));
  public static final SubLSymbol $sym69$INTEGERP = makeSymbol("INTEGERP");
  public static final SubLSymbol $sym70$DEFCONSTANT_PRIVATE = makeSymbol("DEFCONSTANT-PRIVATE");
  public static final SubLSymbol $sym71$REGISTER_CFASL_INPUT_FUNCTION = makeSymbol("REGISTER-CFASL-INPUT-FUNCTION");
  public static final SubLSymbol $sym72$QUOTE = makeSymbol("QUOTE");
  public static final SubLSymbol $sym73$DECLARE_CFASL_OPCODE = makeSymbol("DECLARE-CFASL-OPCODE");
  public static final SubLSymbol $kw74$SL2JAVA = makeKeyword("SL2JAVA");
  public static final SubLSymbol $sym75$PIF = makeSymbol("PIF");
  public static final SubLSymbol $sym76$_CFASL_INPUT_TO_STATIC_AREA_ = makeSymbol("*CFASL-INPUT-TO-STATIC-AREA*");
  public static final SubLSymbol $sym77$WITH_STATIC_AREA = makeSymbol("WITH-STATIC-AREA");
  public static final SubLList $list78 = list(list(makeSymbol("*WITHIN-CFASL-EXTERNALIZATION*"), T));
  public static final SubLList $list79 = list(list(makeSymbol("*WITHIN-CFASL-EXTERNALIZATION*"), NIL));
  public static final SubLList $list80 = list(list(makeSymbol("*CFASL-CHANNEL-EXTERNALIZED?*"), NIL));
  public static final SubLSymbol $sym81$_CFASL_EXTENSIONS_ = makeSymbol("*CFASL-EXTENSIONS*");
  public static final SubLList $list82 = list(makeSymbol("VARIABLE"), makeSymbol("CFASL-OPCODE"), makeSymbol("PRED-FUNC"), makeSymbol("OUTPUT-FUNC"), makeSymbol("INPUT-FUNC"));
  public static final SubLSymbol $sym83$REGISTER_CFASL_EXTENSION = makeSymbol("REGISTER-CFASL-EXTENSION");
  public static final SubLSymbol $sym84$DECLARE_CFASL_EXTENSION_OPCODE = makeSymbol("DECLARE-CFASL-EXTENSION-OPCODE");
  public static final SubLInteger $int85$51 = makeInteger(51);
  public static final SubLSymbol $sym86$CFASL_INPUT_EXTERNALIZATION = makeSymbol("CFASL-INPUT-EXTERNALIZATION");
  public static final SubLInteger $int87$44 = makeInteger(44);
  public static final SubLSymbol $sym88$CFASL_INPUT_DEFSTRUCT_RECIPE = makeSymbol("CFASL-INPUT-DEFSTRUCT-RECIPE");
  public static final SubLSymbol $sym89$CFASL_OUTPUT_DEFSTRUCT_RECIPE_VISITORFN = makeSymbol("CFASL-OUTPUT-DEFSTRUCT-RECIPE-VISITORFN");
  public static final SubLSymbol $kw90$BEGIN = makeKeyword("BEGIN");
  public static final SubLSymbol $kw91$SLOT = makeKeyword("SLOT");
  public static final SubLSymbol $kw92$END = makeKeyword("END");
  public static final SubLString $str93$Error__expected_constructor_for_d = makeString("Error, expected constructor for defstruct, got ~A.");
  public static final SubLString $str94$Expected_keyword_at_slot___A_of_s = makeString("Expected keyword at slot #~A of structure with constructor ~A, got ~A.");
  public static final SubLSymbol $sym95$CFASL_INPUT_P_8BIT_INT = makeSymbol("CFASL-INPUT-P-8BIT-INT");
  public static final SubLSymbol $sym96$CFASL_INPUT_N_8BIT_INT = makeSymbol("CFASL-INPUT-N-8BIT-INT");
  public static final SubLSymbol $sym97$CFASL_INPUT_P_16BIT_INT = makeSymbol("CFASL-INPUT-P-16BIT-INT");
  public static final SubLSymbol $sym98$CFASL_INPUT_N_16BIT_INT = makeSymbol("CFASL-INPUT-N-16BIT-INT");
  public static final SubLSymbol $sym99$CFASL_INPUT_P_24BIT_INT = makeSymbol("CFASL-INPUT-P-24BIT-INT");
  public static final SubLSymbol $sym100$CFASL_INPUT_N_24BIT_INT = makeSymbol("CFASL-INPUT-N-24BIT-INT");
  public static final SubLSymbol $sym101$CFASL_INPUT_P_32BIT_INT = makeSymbol("CFASL-INPUT-P-32BIT-INT");
  public static final SubLSymbol $sym102$CFASL_INPUT_N_32BIT_INT = makeSymbol("CFASL-INPUT-N-32BIT-INT");
  public static final SubLInteger $int103$23 = makeInteger(23);
  public static final SubLSymbol $sym104$CFASL_INPUT_P_BIGNUM = makeSymbol("CFASL-INPUT-P-BIGNUM");
  public static final SubLInteger $int105$24 = makeInteger(24);
  public static final SubLSymbol $sym106$CFASL_INPUT_N_BIGNUM = makeSymbol("CFASL-INPUT-N-BIGNUM");
  public static final SubLSymbol $sym107$CFASL_OUTPUT_OBJECT_INTEGER_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-INTEGER-METHOD");
  public static final SubLInteger $int108$32768 = makeInteger(32768);
  public static final SubLInteger $int109$8388608 = makeInteger(8388608);
  public static final SubLInteger $int110$2147483648 = makeInteger("2147483648");
  public static final SubLList $list111 = list(makeSymbol("SIGN"), makeSymbol("&REST"), makeSymbol("FIXNUMS"));
  public static final SubLInteger $int112$32 = makeInteger(32);
  public static final SubLSymbol $sym113$ASSEMBLE_FIXNUMS_TO_INTEGER = makeSymbol("ASSEMBLE-FIXNUMS-TO-INTEGER");
  public static final SubLSymbol $sym114$CFASL_INPUT_P_FLOAT = makeSymbol("CFASL-INPUT-P-FLOAT");
  public static final SubLSymbol $sym115$CFASL_INPUT_N_FLOAT = makeSymbol("CFASL-INPUT-N-FLOAT");
  public static final SubLSymbol $sym116$CFASL_OUTPUT_OBJECT_FLOAT_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-FLOAT-METHOD");
  public static final SubLSymbol $sym117$CFASL_OUTPUT_OBJECT_SYMBOL_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-SYMBOL-METHOD");
  public static final SubLSymbol $sym118$CFASL_INPUT_KEYWORD = makeSymbol("CFASL-INPUT-KEYWORD");
  public static final SubLSymbol $sym119$CFASL_INPUT_OTHER_SYMBOL = makeSymbol("CFASL-INPUT-OTHER-SYMBOL");
  public static final SubLSymbol $sym120$CFASL_INPUT_NIL = makeSymbol("CFASL-INPUT-NIL");
  public static final SubLInteger $int121$50 = makeInteger(50);
  public static final SubLSymbol $sym122$CFASL_INPUT_COMMON_SYMBOL = makeSymbol("CFASL-INPUT-COMMON-SYMBOL");
  public static final SubLSymbol $sym123$VECTOR = makeSymbol("VECTOR");
  public static final SubLList $list124 = list(makeSymbol("SYMBOLS"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list125 = list(list(makeSymbol("*CFASL-COMMON-SYMBOLS*"), NIL));
  public static final SubLSymbol $sym126$CFASL_SET_COMMON_SYMBOLS = makeSymbol("CFASL-SET-COMMON-SYMBOLS");
  public static final SubLSymbol $sym127$CFASL_SET_COMMON_SYMBOLS_SIMPLE = makeSymbol("CFASL-SET-COMMON-SYMBOLS-SIMPLE");
  public static final SubLString $str128$Use_NIL_ = makeString("Use NIL.");
  public static final SubLString $str129$Common_symbol_at_index__D_was_not = makeString("Common symbol at index ~D was not found in ~S.");
  public static final SubLSymbol $sym130$_CFASL_COMMON_SYMBOLS_ = makeSymbol("*CFASL-COMMON-SYMBOLS*");
  public static final SubLSymbol $sym131$CFASL_OUTPUT_OBJECT_CONS_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-CONS-METHOD");
  public static final SubLSymbol $sym132$_CFASL_LIST_METHODS_ = makeSymbol("*CFASL-LIST-METHODS*");
  public static final SubLSymbol $sym133$CFASL_INPUT_LIST = makeSymbol("CFASL-INPUT-LIST");
  public static final SubLString $str134$Output_NIL_instead = makeString("Output NIL instead");
  public static final SubLString $str135$Trying_to_output_a_circular_list_ = makeString("Trying to output a circular list!");
  public static final SubLSymbol $sym136$CFASL_INPUT_DOTTED_LIST = makeSymbol("CFASL-INPUT-DOTTED-LIST");
  public static final SubLSymbol $sym137$CFASL_OUTPUT_OBJECT_VECTOR_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-VECTOR-METHOD");
  public static final SubLSymbol $sym138$CFASL_INPUT_GENERAL_VECTOR = makeSymbol("CFASL-INPUT-GENERAL-VECTOR");
  public static final SubLInteger $int139$26 = makeInteger(26);
  public static final SubLSymbol $sym140$CFASL_INPUT_BYTE_VECTOR = makeSymbol("CFASL-INPUT-BYTE-VECTOR");
  public static final SubLSymbol $sym141$CFASL_INPUT_STRING = makeSymbol("CFASL-INPUT-STRING");
  public static final SubLSymbol $sym142$CFASL_OUTPUT_OBJECT_STRING_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-STRING-METHOD");
  public static final SubLSymbol $sym143$CFASL_INPUT_CHARACTER = makeSymbol("CFASL-INPUT-CHARACTER");
  public static final SubLSymbol $sym144$CFASL_OUTPUT_OBJECT_CHARACTER_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-CHARACTER-METHOD");
  public static final SubLSymbol $sym145$CFASL_INPUT_HASHTABLE = makeSymbol("CFASL-INPUT-HASHTABLE");
  public static final SubLSymbol $sym146$CFASL_OUTPUT_OBJECT_HASH_TABLE_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-HASH-TABLE-METHOD");
  public static final SubLInteger $int147$43 = makeInteger(43);
  public static final SubLSymbol $sym148$CFASL_INPUT_GUID = makeSymbol("CFASL-INPUT-GUID");
  public static final SubLSymbol $sym149$CFASL_OUTPUT_OBJECT_GUID_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-GUID-METHOD");
  public static final SubLInteger $int150$25 = makeInteger(25);
  public static final SubLSymbol $sym151$CFASL_INPUT_LEGACY_GUID = makeSymbol("CFASL-INPUT-LEGACY-GUID");
  public static final SubLInteger $int152$36 = makeInteger(36);
  public static final SubLList $list153 = list(list(makeSymbol("*CFASL-INPUT-GUID-STRING-RESOURCE*"), list(makeSymbol("GET-NEW-CFASL-INPUT-GUID-STRING-RESOURCE"))));
  public static final SubLInteger $int154$27 = makeInteger(27);
  public static final SubLSymbol $sym155$CFASL_INPUT_RESULT_SET = makeSymbol("CFASL-INPUT-RESULT-SET");
  public static final SubLInteger $int156$28 = makeInteger(28);
  public static final SubLSymbol $sym157$CFASL_INPUT_PACKAGE = makeSymbol("CFASL-INPUT-PACKAGE");
  public static final SubLSymbol $sym158$CFASL_OUTPUT_OBJECT_PACKAGE_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-PACKAGE-METHOD");
  public static final SubLInteger $int159$29 = makeInteger(29);
  public static final SubLSymbol $sym160$CFASL_INPUT_WIDE_OPCODE_ENCODED = makeSymbol("CFASL-INPUT-WIDE-OPCODE-ENCODED");
  public static final SubLSymbol $sym161$_CFASL_WIDE_OPCODE_INPUT_METHOD_TABLE_ = makeSymbol("*CFASL-WIDE-OPCODE-INPUT-METHOD-TABLE*");
  public static final SubLSymbol $kw162$NOT_FOUND = makeKeyword("NOT-FOUND");
  public static final SubLList $list163 = list(makeSymbol("VARIABLE"), makeSymbol("WIDE-OPCODE"), makeSymbol("INPUT-FUNCTION"));
  public static final SubLString $str164$_A_is_too_small_to_be_a_wide_opco = makeString("~A is too small to be a wide opcode.");
  public static final SubLSymbol $sym165$REGISTER_WIDE_CFASL_OPCODE_INPUT_FUNCTION = makeSymbol("REGISTER-WIDE-CFASL-OPCODE-INPUT-FUNCTION");
  public static final SubLSymbol $sym166$DECLARE_WIDE_CFASL_OPCODE = makeSymbol("DECLARE-WIDE-CFASL-OPCODE");
  public static final SubLInteger $int167$124 = makeInteger(124);
  public static final SubLSymbol $sym168$CFASL_INPUT_INSTANCE = makeSymbol("CFASL-INPUT-INSTANCE");
  public static final SubLString $str169$CFASL_cannot_read_in_the_serializ = makeString("CFASL cannot read in the serialized SubLOOP instance because the :SUBLOOP feature is not present.");
  public static final SubLInteger $int170$126 = makeInteger(126);
  public static final SubLSymbol $sym171$CFASL_INPUT_GUID_DENOTED_TYPE = makeSymbol("CFASL-INPUT-GUID-DENOTED-TYPE");
  public static final SubLSymbol $sym172$_CFASL_GUID_DENOTED_TYPE_INPUT_METHOD_TABLE_ = makeSymbol("*CFASL-GUID-DENOTED-TYPE-INPUT-METHOD-TABLE*");
  public static final SubLInteger $int173$100 = makeInteger(100);
  public static final SubLList $list174 = list(makeSymbol("VARIABLE"), makeSymbol("CFASL-GUID-OPCODE"), makeSymbol("INPUT-FUNCTION"));
  public static final SubLSymbol $sym175$GUID_P = makeSymbol("GUID-P");
  public static final SubLSymbol $sym176$DEFLEXICAL_PRIVATE = makeSymbol("DEFLEXICAL-PRIVATE");
  public static final SubLSymbol $sym177$REGISTER_CFASL_GUID_DENOTED_TYPE_INPUT_FUNCTION = makeSymbol("REGISTER-CFASL-GUID-DENOTED-TYPE-INPUT-FUNCTION");
  public static final SubLList $list178 = list(makeSymbol("VARIABLE"), makeSymbol("CFASL-GUID-STRING-OPCODE"), makeSymbol("INPUT-FUNCTION"));
  public static final SubLSymbol $sym179$GUID_STRING_P = makeSymbol("GUID-STRING-P");
  public static final SubLSymbol $sym180$STRING_TO_GUID = makeSymbol("STRING-TO-GUID");
  public static final SubLSymbol $sym181$DECLARE_CFASL_GUID_OPCODE = makeSymbol("DECLARE-CFASL-GUID-OPCODE");
  public static final SubLList $list182 = list(list(makeSymbol("TYPE-DENOTING-GUID"), makeSymbol("STREAM")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym183$WRITE_CFASL_GUID_DENOTED_TYPE_OPCODE = makeSymbol("WRITE-CFASL-GUID-DENOTED-TYPE-OPCODE");
  public static final SubLSymbol $kw184$INPUT = makeKeyword("INPUT");
  public static final SubLString $str185$Unable_to_open__S = makeString("Unable to open ~S");

  //// Initializers

  public void declareFunctions() {
    declare_cfasl_file();
  }

  public void initializeVariables() {
    init_cfasl_file();
  }

  public void runTopLevelForms() {
    setup_cfasl_file();
  }

}
