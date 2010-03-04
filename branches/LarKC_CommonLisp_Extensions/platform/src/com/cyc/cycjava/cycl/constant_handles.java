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
import com.cyc.cycjava.cycl.cfasl_kb_methods;
import com.cyc.cycjava.cycl.constant_completion;
import com.cyc.cycjava.cycl.constant_completion_high;
import com.cyc.cycjava.cycl.constant_completion_low;
import com.cyc.cycjava.cycl.constant_index_manager;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.constants_interface;
import com.cyc.cycjava.cycl.constants_low;
import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.cycjava.cycl.hl_interface_infrastructure;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_indexing_datastructures;
import com.cyc.cycjava.cycl.kb_macros;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.cycjava.cycl.utilities_macros;

public  final class constant_handles extends SubLTranslatedFile {

  //// Constructor

  private constant_handles() {}
  public static final SubLFile me = new constant_handles();
  public static final String myName = "com.cyc.cycjava.cycl.constant_handles";

  //// Definitions

  /** The SUID -> CONSTANT mapping table. */
  @SubL(source = "cycl/constant-handles.lisp", position = 1227) 
  private static SubLSymbol $constant_from_suid$ = null;

  @SubL(source = "cycl/constant-handles.lisp", position = 2717) 
  public static final SubLObject do_constants_table() {
    return $constant_from_suid$.getGlobalValue();
  }

  @SubL(source = "cycl/constant-handles.lisp", position = 2915) 
  public static final SubLObject setup_constant_suid_table(SubLObject size, SubLObject exactP) {
    if ((NIL != $constant_from_suid$.getGlobalValue())) {
      return NIL;
    }
    constant_completion.initialize_constant_names_in_code();
    $constant_from_suid$.setGlobalValue(id_index.new_id_index(size, ZERO_INTEGER));
    return T;
  }

  @SubL(source = "cycl/constant-handles.lisp", position = 3240) 
  public static final SubLObject finalize_constant_suid_table(SubLObject max_constant_suid) {
    if ((max_constant_suid == UNPROVIDED)) {
      max_constant_suid = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      set_next_constant_suid(max_constant_suid);
      if ((NIL == max_constant_suid)) {
        {
          SubLObject _prev_bind_0 = Storage.$current_area$.currentBinding(thread);
          try {
            Storage.$current_area$.bind(Storage.get_static_area(), thread);
            id_index.optimize_id_index($constant_from_suid$.getGlobalValue(), UNPROVIDED);
          } finally {
            Storage.$current_area$.rebind(_prev_bind_0, thread);
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/constant-handles.lisp", position = 3581) 
  public static final SubLObject clear_constant_suid_table() {
    return id_index.clear_id_index($constant_from_suid$.getGlobalValue());
  }

  /** Return the total number of constants. */
  @SubL(source = "cycl/constant-handles.lisp", position = 3966) 
  public static final SubLObject constant_count() {
    if ((NIL == $constant_from_suid$.getGlobalValue())) {
      return ZERO_INTEGER;
    }
    return id_index.id_index_count($constant_from_suid$.getGlobalValue());
  }

  @SubL(source = "cycl/constant-handles.lisp", position = 4172) 
  public static final SubLObject lookup_constant_by_suid(SubLObject suid) {
    return id_index.id_index_lookup($constant_from_suid$.getGlobalValue(), suid, UNPROVIDED);
  }

  @SubL(source = "cycl/constant-handles.lisp", position = 4363) 
  public static final SubLObject new_constant_suid_threshold() {
    return id_index.id_index_new_id_threshold($constant_from_suid$.getGlobalValue());
  }

  @SubL(source = "cycl/constant-handles.lisp", position = 4942) 
  public static final SubLObject set_next_constant_suid(SubLObject max_constant_suid) {
    if ((max_constant_suid == UNPROVIDED)) {
      max_constant_suid = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject max = MINUS_ONE_INTEGER;
        if ((NIL != max_constant_suid)) {
          max = max_constant_suid;
        } else {
          {
            SubLObject idx = do_constants_table();
            SubLObject mess = $str25$Determining_maximum_constant_SUID;
            SubLObject total = id_index.id_index_count(idx);
            SubLObject sofar = ZERO_INTEGER;
            checkType(mess, $sym17$STRINGP);
            {
              SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
              SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
              SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
              SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
              try {
                utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.noting_percent_progress_preamble(mess);
                {
                  SubLObject idx_7 = idx;
                  if ((NIL == id_index.id_index_objects_empty_p(idx_7, $kw18$SKIP))) {
                    {
                      SubLObject idx_8 = idx_7;
                      if ((NIL == id_index.id_index_old_objects_empty_p(idx_8, $kw18$SKIP))) {
                        {
                          SubLObject vector_var = id_index.id_index_old_objects(idx_8);
                          SubLObject backwardP_var = NIL;
                          SubLObject length = Sequences.length(vector_var);
                          SubLObject v_iteration = NIL;
                          for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                            {
                              SubLObject id = ((NIL != backwardP_var) ? ((SubLObject) Numbers.subtract(length, v_iteration, ONE_INTEGER)) : v_iteration);
                              SubLObject constant = Vectors.aref(vector_var, id);
                              if ((!(((NIL != id_index.id_index_tombstone_p(constant))
                                     && (NIL != id_index.id_index_skip_tombstones_p($kw18$SKIP)))))) {
                                if ((NIL != id_index.id_index_tombstone_p(constant))) {
                                  constant = $kw18$SKIP;
                                }
                                utilities_macros.note_percent_progress(sofar, total);
                                sofar = Numbers.add(sofar, ONE_INTEGER);
                                {
                                  SubLObject suid = constant_suid(constant);
                                  max = Numbers.max(max, suid);
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    {
                      SubLObject idx_9 = idx_7;
                      if ((!(((NIL != id_index.id_index_new_objects_empty_p(idx_9))
                             && (NIL != id_index.id_index_skip_tombstones_p($kw18$SKIP)))))) {
                        {
                          SubLObject v_new = id_index.id_index_new_objects(idx_9);
                          SubLObject id = id_index.id_index_new_id_threshold(idx_9);
                          SubLObject end_id = id_index.id_index_next_id(idx_9);
                          SubLObject v_default = ((NIL != id_index.id_index_skip_tombstones_p($kw18$SKIP)) ? ((SubLObject) NIL) : $kw18$SKIP);
                          while (id.numL(end_id)) {
                            {
                              SubLObject constant = Hashtables.gethash_without_values(id, v_new, v_default);
                              if ((!(((NIL != id_index.id_index_skip_tombstones_p($kw18$SKIP))
                                     && (NIL != id_index.id_index_tombstone_p(constant)))))) {
                                utilities_macros.note_percent_progress(sofar, total);
                                sofar = Numbers.add(sofar, ONE_INTEGER);
                                {
                                  SubLObject suid = constant_suid(constant);
                                  max = Numbers.max(max, suid);
                                }
                              }
                            }
                            id = Numbers.add(id, ONE_INTEGER);
                          }
                        }
                      }
                    }
                  }
                }
                utilities_macros.noting_percent_progress_postamble();
              } finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
              }
            }
          }
        }
        {
          SubLObject next_suid = Numbers.add(max, ONE_INTEGER);
          id_index.set_id_index_next_id($constant_from_suid$.getGlobalValue(), next_suid);
          return next_suid;
        }
      }
    }
  }

  /** Note that SUID will be used as the suid for CONSTANT. */
  @SubL(source = "cycl/constant-handles.lisp", position = 5366) 
  public static final SubLObject register_constant_suid(SubLObject constant, SubLObject suid) {
    reset_constant_suid(constant, suid);
    id_index.id_index_enter($constant_from_suid$.getGlobalValue(), suid, constant);
    return constant;
  }

  /** Note that SUID is not in use as a constant suid. */
  @SubL(source = "cycl/constant-handles.lisp", position = 5590) 
  public static final SubLObject deregister_constant_suid(SubLObject suid) {
    return id_index.id_index_remove($constant_from_suid$.getGlobalValue(), suid);
  }

  /** Return a new integer suid for a constant. */
  @SubL(source = "cycl/constant-handles.lisp", position = 5747) 
  public static final SubLObject make_constant_suid() {
    return id_index.id_index_reserve($constant_from_suid$.getGlobalValue());
  }

  public static final class $constant_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $suid; }
    public SubLObject getField3() { return $name; }
    public SubLObject setField2(SubLObject value) { return $suid = value; }
    public SubLObject setField3(SubLObject value) { return $name = value; }
    public SubLObject $suid = NIL;
    public SubLObject $name = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($constant_native.class, $sym26$CONSTANT, $sym27$CONSTANT_P, $list29, $list30, new String[] {"$suid", "$name"}, $list31, $list32, $sym33$PRINT_CONSTANT);
  }

  @SubL(source = "cycl/constant-handles.lisp", position = 6230) 
  public static SubLSymbol $dtp_constant$ = null;

  @SubL(source = "cycl/constant-handles.lisp", position = 6230) 
  public static final SubLObject constant_print_function_trampoline(SubLObject object, SubLObject stream) {
    print_constant(object, stream, ZERO_INTEGER);
    return NIL;
  }

  public static final class $constant_print_function_trampoline$BinaryFunction extends BinaryFunction {
    public $constant_print_function_trampoline$BinaryFunction() { super(extractFunctionNamed("CONSTANT-PRINT-FUNCTION-TRAMPOLINE")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return constant_print_function_trampoline(arg1, arg2); }
  }

  @SubL(source = "cycl/constant-handles.lisp", position = 6230) 
  public static final SubLObject constant_p(SubLObject object) {
    return ((object.getClass() == $constant_native.class) ? ((SubLObject) T) : NIL);
  }

  public static final class $constant_p$UnaryFunction extends UnaryFunction {
    public $constant_p$UnaryFunction() { super(extractFunctionNamed("CONSTANT-P")); }
    public SubLObject processItem(SubLObject arg1) { return constant_p(arg1); }
  }

  @SubL(source = "cycl/constant-handles.lisp", position = 6230) 
  public static final SubLObject c_suid(SubLObject object) {
    checkType(object, $sym27$CONSTANT_P);
    return object.getField2();
  }

  @SubL(source = "cycl/constant-handles.lisp", position = 6230) 
  public static final SubLObject c_name(SubLObject object) {
    checkType(object, $sym27$CONSTANT_P);
    return object.getField3();
  }

  @SubL(source = "cycl/constant-handles.lisp", position = 6230) 
  public static final SubLObject _csetf_c_suid(SubLObject object, SubLObject value) {
    checkType(object, $sym27$CONSTANT_P);
    return object.setField2(value);
  }

  @SubL(source = "cycl/constant-handles.lisp", position = 6230) 
  public static final SubLObject _csetf_c_name(SubLObject object, SubLObject value) {
    checkType(object, $sym27$CONSTANT_P);
    return object.setField3(value);
  }

  @SubL(source = "cycl/constant-handles.lisp", position = 6230) 
  public static final SubLObject make_constant(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $constant_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw39$SUID)) {
            _csetf_c_suid(v_new, current_value);
          } else if (pcase_var.eql($kw40$NAME)) {
            _csetf_c_name(v_new, current_value);
          } else {
            Errors.error($str41$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  @SubL(source = "cycl/constant-handles.lisp", position = 6443) 
  public static final SubLObject print_constant(SubLObject object, SubLObject stream, SubLObject depth) {
    {
      SubLObject name = c_name(object);
      SubLObject suid = c_suid(object);
      if (name.isString()) {
        PrintLow.format(stream, $str42$___a, name);
      } else if ((object == cfasl_kb_methods.cfasl_invalid_constant())) {
        PrintLow.format(stream, $str43$_The_CFASL_invalid_constant_);
      } else if (suid.isInteger()) {
        PrintLow.format(stream, $str44$_Constant__a_, suid);
      } else {
        compatibility.default_struct_print_function(object, stream, depth);
      }
    }
    return object;
  }

  @SubL(source = "cycl/constant-handles.lisp", position = 6887) 
  public static final SubLObject sxhash_constant_method(SubLObject object) {
    {
      SubLObject suid = c_suid(object);
      if (suid.isInteger()) {
        return suid;
      }
    }
    return ZERO_INTEGER;
  }

  public static final class $sxhash_constant_method$UnaryFunction extends UnaryFunction {
    public $sxhash_constant_method$UnaryFunction() { super(extractFunctionNamed("SXHASH-CONSTANT-METHOD")); }
    public SubLObject processItem(SubLObject arg1) { return sxhash_constant_method(arg1); }
  }

  /** Make a new constant shell, potentially in static space. */
  @SubL(source = "cycl/constant-handles.lisp", position = 7020) 
  public static final SubLObject get_constant() {
    {
      SubLObject constant = NIL;
      constant = make_constant(UNPROVIDED);
      return constant;
    }
  }

  @SubL(source = "cycl/constant-handles.lisp", position = 7242) 
  public static final SubLObject init_constant(SubLObject constant) {
    _csetf_c_suid(constant, NIL);
    return constant;
  }

  /** Invalidate CONSTANT. */
  @SubL(source = "cycl/constant-handles.lisp", position = 7363) 
  public static final SubLObject free_constant(SubLObject constant) {
    return init_constant(constant);
  }

  /** Return T iff OBJECT is a valid constant handle. */
  @SubL(source = "cycl/constant-handles.lisp", position = 7639) 
  public static final SubLObject valid_constant_handleP(SubLObject constant) {
    return makeBoolean(((NIL != constant_p(constant))
           && (NIL != constant_handle_validP(constant))));
  }

  /** Return T if CONSTANT is a valid, fully-formed constant. */
  @SubL(source = "cycl/constant-handles.lisp", position = 7819) 
  public static final SubLObject valid_constantP(SubLObject constant, SubLObject robust) {
    if ((robust == UNPROVIDED)) {
      robust = NIL;
    }
    return valid_constant_handleP(constant);
  }

  public static final class $valid_constantP$UnaryFunction extends UnaryFunction {
    public $valid_constantP$UnaryFunction() { super(extractFunctionNamed("VALID-CONSTANT?")); }
    public SubLObject processItem(SubLObject arg1) { return valid_constantP(arg1, UNPROVIDED); }
  }

  public static final class $valid_constantP$BinaryFunction extends BinaryFunction {
    public $valid_constantP$BinaryFunction() { super(extractFunctionNamed("VALID-CONSTANT?")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return valid_constantP(arg1, arg2); }
  }

  @SubL(source = "cycl/constant-handles.lisp", position = 8856) 
  public static final SubLObject invalid_constant_handleP(SubLObject constant) {
    return makeBoolean(((NIL != constant_p(constant))
           && (NIL == valid_constant_handleP(constant))));
  }

  @SubL(source = "cycl/constant-handles.lisp", position = 8993) 
  public static final SubLObject invalid_constantP(SubLObject constant, SubLObject robust) {
    if ((robust == UNPROVIDED)) {
      robust = NIL;
    }
    return makeBoolean(((NIL != constant_p(constant))
           && (NIL == valid_constantP(constant, UNPROVIDED))));
  }

  public static final class $invalid_constantP$UnaryFunction extends UnaryFunction {
    public $invalid_constantP$UnaryFunction() { super(extractFunctionNamed("INVALID-CONSTANT?")); }
    public SubLObject processItem(SubLObject arg1) { return invalid_constantP(arg1, UNPROVIDED); }
  }

  public static final class $invalid_constantP$BinaryFunction extends BinaryFunction {
    public $invalid_constantP$BinaryFunction() { super(extractFunctionNamed("INVALID-CONSTANT?")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return invalid_constantP(arg1, arg2); }
  }

  @SubL(source = "cycl/constant-handles.lisp", position = 9307) 
  private static SubLSymbol $invalid_constants$ = null;

  @SubL(source = "cycl/constant-handles.lisp", position = 9690) 
  public static final SubLObject invalid_constant_names() {
    return hash_table_utilities.hash_table_keys($invalid_constants$.getGlobalValue());
  }

  @SubL(source = "cycl/constant-handles.lisp", position = 9873) 
  public static final SubLObject find_invalid_constant(SubLObject name) {
    return Hashtables.gethash(name, $invalid_constants$.getGlobalValue(), NIL);
  }

  @SubL(source = "cycl/constant-handles.lisp", position = 9969) 
  public static final SubLObject register_invalid_constant_by_name(SubLObject constant, SubLObject name) {
    return Hashtables.sethash(name, $invalid_constants$.getGlobalValue(), constant);
  }

  @SubL(source = "cycl/constant-handles.lisp", position = 10091) 
  public static final SubLObject deregister_invalid_constant_by_name(SubLObject name) {
    return Hashtables.remhash(name, $invalid_constants$.getGlobalValue());
  }

  @SubL(source = "cycl/constant-handles.lisp", position = 12532) 
  public static final SubLObject make_constant_shell(SubLObject name, SubLObject use_existingP) {
    if ((use_existingP == UNPROVIDED)) {
      use_existingP = NIL;
    }
    checkType(name, $sym61$CONSTANT_NAME_SPEC_P);
    if (((NIL != use_existingP)
         && name.isString())) {
      {
        SubLObject found = constant_completion_low.constant_shell_from_name(name);
        if ((NIL != found)) {
          return found;
        }
      }
      {
        SubLObject found = find_invalid_constant(name);
        if ((NIL != found)) {
          return found;
        }
      }
    }
    {
      SubLObject constant = make_constant_shell_internal(name, T);
      if (name.isString()) {
        register_invalid_constant_by_name(constant, name);
      }
      return constant;
    }
  }

  @SubL(source = "cycl/constant-handles.lisp", position = 13205) 
  public static final SubLObject make_constant_shell_internal(SubLObject name, SubLObject v_static) {
    {
      SubLObject constant = NIL;
      constant = get_constant();
      _csetf_c_name(constant, name);
      return constant;
    }
  }

  /** Trampoline called by the #$ reader */
  @SubL(source = "cycl/constant-handles.lisp", position = 13522) 
  public static final SubLObject reader_make_constant_shell(SubLObject constant_name) {
    return make_constant_shell(constant_name, T);
  }

  /** Create a sample invalid constant */
  @SubL(source = "cycl/constant-handles.lisp", position = 13993) 
  public static final SubLObject create_sample_invalid_constant() {
    return make_constant_shell_internal(NIL, NIL);
  }

  @SubL(source = "cycl/constant-handles.lisp", position = 14378) 
  public static final SubLObject free_all_constants() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject idx = do_constants_table();
        SubLObject mess = $str62$Freeing_constants;
        SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        checkType(mess, $sym17$STRINGP);
        {
          SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
          SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
          SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
          SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
          try {
            utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind(T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.noting_percent_progress_preamble(mess);
            {
              SubLObject idx_14 = idx;
              if ((NIL == id_index.id_index_objects_empty_p(idx_14, $kw18$SKIP))) {
                {
                  SubLObject idx_15 = idx_14;
                  if ((NIL == id_index.id_index_old_objects_empty_p(idx_15, $kw18$SKIP))) {
                    {
                      SubLObject vector_var = id_index.id_index_old_objects(idx_15);
                      SubLObject backwardP_var = NIL;
                      SubLObject length = Sequences.length(vector_var);
                      SubLObject v_iteration = NIL;
                      for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                        {
                          SubLObject id = ((NIL != backwardP_var) ? ((SubLObject) Numbers.subtract(length, v_iteration, ONE_INTEGER)) : v_iteration);
                          SubLObject constant = Vectors.aref(vector_var, id);
                          if ((!(((NIL != id_index.id_index_tombstone_p(constant))
                                 && (NIL != id_index.id_index_skip_tombstones_p($kw18$SKIP)))))) {
                            if ((NIL != id_index.id_index_tombstone_p(constant))) {
                              constant = $kw18$SKIP;
                            }
                            utilities_macros.note_percent_progress(sofar, total);
                            sofar = Numbers.add(sofar, ONE_INTEGER);
                            kb_indexing_datastructures.free_term_index(constant);
                            free_constant(constant);
                          }
                        }
                      }
                    }
                  }
                }
                {
                  SubLObject idx_16 = idx_14;
                  if ((!(((NIL != id_index.id_index_new_objects_empty_p(idx_16))
                         && (NIL != id_index.id_index_skip_tombstones_p($kw18$SKIP)))))) {
                    {
                      SubLObject v_new = id_index.id_index_new_objects(idx_16);
                      SubLObject id = id_index.id_index_new_id_threshold(idx_16);
                      SubLObject end_id = id_index.id_index_next_id(idx_16);
                      SubLObject v_default = ((NIL != id_index.id_index_skip_tombstones_p($kw18$SKIP)) ? ((SubLObject) NIL) : $kw18$SKIP);
                      while (id.numL(end_id)) {
                        {
                          SubLObject constant = Hashtables.gethash_without_values(id, v_new, v_default);
                          if ((!(((NIL != id_index.id_index_skip_tombstones_p($kw18$SKIP))
                                 && (NIL != id_index.id_index_tombstone_p(constant)))))) {
                            utilities_macros.note_percent_progress(sofar, total);
                            sofar = Numbers.add(sofar, ONE_INTEGER);
                            kb_indexing_datastructures.free_term_index(constant);
                            free_constant(constant);
                          }
                        }
                        id = Numbers.add(id, ONE_INTEGER);
                      }
                    }
                  }
                }
              }
            }
            utilities_macros.noting_percent_progress_postamble();
          } finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
          }
        }
      }
      clear_constant_tables();
      return NIL;
    }
  }

  /** Return the SUID of CONSTANT. */
  @SubL(source = "cycl/constant-handles.lisp", position = 14582) 
  public static final SubLObject constant_suid(SubLObject constant) {
    checkType(constant, $sym27$CONSTANT_P);
    return c_suid(constant);
  }

  @SubL(source = "cycl/constant-handles.lisp", position = 14734) 
  public static final SubLObject install_constant_suid(SubLObject constant, SubLObject suid) {
    checkType(constant, $sym27$CONSTANT_P);
    checkType(suid, $sym63$INTEGERP);
    if ((!(constant_suid(constant).isInteger()))) {
      register_constant_suid(constant, suid);
    }
    return constant;
  }

  /** Primitively change the SUID of CONSTANT to NEW-SUID. */
  @SubL(source = "cycl/constant-handles.lisp", position = 14976) 
  public static final SubLObject reset_constant_suid(SubLObject constant, SubLObject new_suid) {
    _csetf_c_suid(constant, new_suid);
    return constant;
  }

  @SubL(source = "cycl/constant-handles.lisp", position = 15145) 
  public static final SubLObject constant_handle_validP(SubLObject constant) {
    return Types.integerp(c_suid(constant));
  }

  /** Return the constant with SUID, or NIL if not present. */
  @SubL(source = "cycl/constant-handles.lisp", position = 15283) 
  public static final SubLObject find_constant_by_suid(SubLObject suid) {
    checkType(suid, $sym63$INTEGERP);
    return lookup_constant_by_suid(suid);
  }

  @SubL(source = "cycl/constant-handles.lisp", position = 15458) 
  public static final SubLObject setup_constant_tables(SubLObject size, SubLObject exactP) {
    constants_low.setup_constant_guid_table(size, exactP);
    setup_constant_suid_table(size, exactP);
    constant_index_manager.setup_constant_index_table(size, exactP);
    return NIL;
  }

  @SubL(source = "cycl/constant-handles.lisp", position = 15697) 
  public static final SubLObject finalize_constants(SubLObject max_constant_suid) {
    if ((max_constant_suid == UNPROVIDED)) {
      max_constant_suid = NIL;
    }
    finalize_constant_suid_table(max_constant_suid);
    return NIL;
  }

  @SubL(source = "cycl/constant-handles.lisp", position = 15829) 
  public static final SubLObject clear_constant_tables() {
    constants_low.clear_constant_guid_table();
    clear_constant_suid_table();
    return NIL;
  }

  public static final SubLObject declare_constant_handles_file() {
    declareFunction(myName, "new_constants_iterator", "NEW-CONSTANTS-ITERATOR", 0, 0, false);
    declareMacro(myName, "do_constants", "DO-CONSTANTS");
    declareMacro(myName, "do_old_constants", "DO-OLD-CONSTANTS");
    declareMacro(myName, "do_new_constants", "DO-NEW-CONSTANTS");
    declareFunction(myName, "do_constants_table", "DO-CONSTANTS-TABLE", 0, 0, false);
    declareFunction(myName, "map_constants", "MAP-CONSTANTS", 1, 0, false);
    declareFunction(myName, "setup_constant_suid_table", "SETUP-CONSTANT-SUID-TABLE", 2, 0, false);
    declareFunction(myName, "finalize_constant_suid_table", "FINALIZE-CONSTANT-SUID-TABLE", 0, 1, false);
    declareFunction(myName, "clear_constant_suid_table", "CLEAR-CONSTANT-SUID-TABLE", 0, 0, false);
    declareFunction(myName, "create_constant_dump_id_table", "CREATE-CONSTANT-DUMP-ID-TABLE", 0, 0, false);
    declareFunction(myName, "new_dense_constant_id_index", "NEW-DENSE-CONSTANT-ID-INDEX", 0, 0, false);
    declareFunction(myName, "constant_count", "CONSTANT-COUNT", 0, 0, false);
    declareFunction(myName, "lookup_constant_by_suid", "LOOKUP-CONSTANT-BY-SUID", 1, 0, false);
    declareFunction(myName, "next_constant_suid", "NEXT-CONSTANT-SUID", 0, 0, false);
    declareFunction(myName, "new_constant_suid_threshold", "NEW-CONSTANT-SUID-THRESHOLD", 0, 0, false);
    declareFunction(myName, "old_constant_count", "OLD-CONSTANT-COUNT", 0, 0, false);
    declareFunction(myName, "new_constant_count", "NEW-CONSTANT-COUNT", 0, 0, false);
    declareFunction(myName, "missing_old_constant_internal_ids", "MISSING-OLD-CONSTANT-INTERNAL-IDS", 0, 0, false);
    declareFunction(myName, "set_next_constant_suid", "SET-NEXT-CONSTANT-SUID", 0, 1, false);
    declareFunction(myName, "register_constant_suid", "REGISTER-CONSTANT-SUID", 2, 0, false);
    declareFunction(myName, "deregister_constant_suid", "DEREGISTER-CONSTANT-SUID", 1, 0, false);
    declareFunction(myName, "make_constant_suid", "MAKE-CONSTANT-SUID", 0, 0, false);
    declareFunction(myName, "constant_print_function_trampoline", "CONSTANT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false); new $constant_print_function_trampoline$BinaryFunction();
    declareFunction(myName, "constant_p", "CONSTANT-P", 1, 0, false); new $constant_p$UnaryFunction();
    declareFunction(myName, "c_suid", "C-SUID", 1, 0, false);
    declareFunction(myName, "c_name", "C-NAME", 1, 0, false);
    declareFunction(myName, "_csetf_c_suid", "_CSETF-C-SUID", 2, 0, false);
    declareFunction(myName, "_csetf_c_name", "_CSETF-C-NAME", 2, 0, false);
    declareFunction(myName, "make_constant", "MAKE-CONSTANT", 0, 1, false);
    declareFunction(myName, "print_constant", "PRINT-CONSTANT", 3, 0, false);
    declareFunction(myName, "sxhash_constant_method", "SXHASH-CONSTANT-METHOD", 1, 0, false); new $sxhash_constant_method$UnaryFunction();
    declareFunction(myName, "get_constant", "GET-CONSTANT", 0, 0, false);
    declareFunction(myName, "init_constant", "INIT-CONSTANT", 1, 0, false);
    declareFunction(myName, "free_constant", "FREE-CONSTANT", 1, 0, false);
    declareFunction(myName, "valid_constant_handleP", "VALID-CONSTANT-HANDLE?", 1, 0, false);
    declareFunction(myName, "valid_constantP", "VALID-CONSTANT?", 1, 1, false); new $valid_constantP$UnaryFunction(); new $valid_constantP$BinaryFunction();
    declareFunction(myName, "valid_constant_robustP", "VALID-CONSTANT-ROBUST?", 1, 0, false);
    declareFunction(myName, "valid_constant", "VALID-CONSTANT", 1, 1, false);
    declareFunction(myName, "invalid_constant_handleP", "INVALID-CONSTANT-HANDLE?", 1, 0, false);
    declareFunction(myName, "invalid_constantP", "INVALID-CONSTANT?", 1, 1, false); new $invalid_constantP$UnaryFunction(); new $invalid_constantP$BinaryFunction();
    declareFunction(myName, "invalid_constant_robustP", "INVALID-CONSTANT-ROBUST?", 1, 0, false);
    declareFunction(myName, "invalid_constant_names", "INVALID-CONSTANT-NAMES", 0, 0, false);
    declareFunction(myName, "clear_invalid_constants_table", "CLEAR-INVALID-CONSTANTS-TABLE", 0, 0, false);
    declareFunction(myName, "find_invalid_constant", "FIND-INVALID-CONSTANT", 1, 0, false);
    declareFunction(myName, "register_invalid_constant_by_name", "REGISTER-INVALID-CONSTANT-BY-NAME", 2, 0, false);
    declareFunction(myName, "deregister_invalid_constant_by_name", "DEREGISTER-INVALID-CONSTANT-BY-NAME", 1, 0, false);
    declareFunction(myName, "synchronize_constants_with_hl_store", "SYNCHRONIZE-CONSTANTS-WITH-HL-STORE", 0, 0, false);
    declareFunction(myName, "synchronize_constants_with_remote_hl_store", "SYNCHRONIZE-CONSTANTS-WITH-REMOTE-HL-STORE", 0, 0, false);
    declareFunction(myName, "synchronize_constants_with_local_hl_store", "SYNCHRONIZE-CONSTANTS-WITH-LOCAL-HL-STORE", 0, 0, false);
    declareFunction(myName, "make_constant_shell", "MAKE-CONSTANT-SHELL", 1, 1, false);
    declareFunction(myName, "make_constant_shell_internal", "MAKE-CONSTANT-SHELL-INTERNAL", 2, 0, false);
    declareFunction(myName, "reader_make_constant_shell", "READER-MAKE-CONSTANT-SHELL", 1, 0, false);
    declareFunction(myName, "make_bogus_constant_shell", "MAKE-BOGUS-CONSTANT-SHELL", 1, 0, false);
    declareFunction(myName, "create_sample_invalid_constant", "CREATE-SAMPLE-INVALID-CONSTANT", 0, 0, false);
    declareFunction(myName, "partition_create_invalid_constant", "PARTITION-CREATE-INVALID-CONSTANT", 0, 0, false);
    declareFunction(myName, "free_all_constants", "FREE-ALL-CONSTANTS", 0, 0, false);
    declareFunction(myName, "constant_suid", "CONSTANT-SUID", 1, 0, false);
    declareFunction(myName, "install_constant_suid", "INSTALL-CONSTANT-SUID", 2, 0, false);
    declareFunction(myName, "reset_constant_suid", "RESET-CONSTANT-SUID", 2, 0, false);
    declareFunction(myName, "constant_handle_validP", "CONSTANT-HANDLE-VALID?", 1, 0, false);
    declareFunction(myName, "find_constant_by_suid", "FIND-CONSTANT-BY-SUID", 1, 0, false);
    declareFunction(myName, "setup_constant_tables", "SETUP-CONSTANT-TABLES", 2, 0, false);
    declareFunction(myName, "finalize_constants", "FINALIZE-CONSTANTS", 0, 1, false);
    declareFunction(myName, "clear_constant_tables", "CLEAR-CONSTANT-TABLES", 0, 0, false);
    declareFunction(myName, "rebuild_constant_completion_table", "REBUILD-CONSTANT-COMPLETION-TABLE", 0, 0, false);
    declareFunction(myName, "remove_invalid_constants_from_completions", "REMOVE-INVALID-CONSTANTS-FROM-COMPLETIONS", 0, 0, false);
    return NIL;
  }

  public static final SubLObject init_constant_handles_file() {
    $constant_from_suid$ = deflexical("*CONSTANT-FROM-SUID*", ((NIL != Symbols.boundp($sym0$_CONSTANT_FROM_SUID_)) ? ((SubLObject) $constant_from_suid$.getGlobalValue()) : NIL));
    $dtp_constant$ = defconstant("*DTP-CONSTANT*", $sym26$CONSTANT);
    $invalid_constants$ = deflexical("*INVALID-CONSTANTS*", ((NIL != Symbols.boundp($sym56$_INVALID_CONSTANTS_)) ? ((SubLObject) $invalid_constants$.getGlobalValue()) : Hashtables.make_hash_table($int57$4000, Symbols.symbol_function(EQUAL), UNPROVIDED)));
    return NIL;
  }

  public static final SubLObject setup_constant_handles_file() {
    // CVS_ID("Id: constant-handles.lisp 128690 2009-09-02 19:44:47Z rck ");
    subl_macro_promotions.declare_defglobal($sym0$_CONSTANT_FROM_SUID_);
    utilities_macros.register_cyc_api_macro($sym10$DO_CONSTANTS, $list2, $str11$Iterate_over_all_HL_constant_data);
    access_macros.register_macro_helper($sym16$DO_CONSTANTS_TABLE, $sym10$DO_CONSTANTS);
    access_macros.register_macro_helper($sym19$CREATE_CONSTANT_DUMP_ID_TABLE, $sym20$WITH_CONSTANT_DUMP_ID_TABLE);
    utilities_macros.register_cyc_api_function($sym21$CONSTANT_COUNT, NIL, $str22$Return_the_total_number_of_consta, NIL, $list23);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_constant$.getGlobalValue(), Symbols.symbol_function($sym34$CONSTANT_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym35$C_SUID, $sym36$_CSETF_C_SUID);
    Structures.def_csetf($sym37$C_NAME, $sym38$_CSETF_C_NAME);
    Equality.identity($sym26$CONSTANT);
    Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_constant$.getGlobalValue(), Symbols.symbol_function($sym45$SXHASH_CONSTANT_METHOD));
    utilities_macros.register_cyc_api_function($sym27$CONSTANT_P, $list46, $str47$Return_T_iff_the_argument_is_a_Cy, NIL, $list48);
    utilities_macros.register_cyc_api_function($sym49$VALID_CONSTANT_, $list50, $str51$Return_T_if_CONSTANT_is_a_valid__, NIL, $list48);
    utilities_macros.register_obsolete_cyc_api_function($sym53$VALID_CONSTANT, $list54, $list50, $str55$Deprecated_in_favor_of_valid_cons, NIL, $list48);
    subl_macro_promotions.declare_defglobal($sym56$_INVALID_CONSTANTS_);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$_CONSTANT_FROM_SUID_ = makeSymbol("*CONSTANT-FROM-SUID*");
  public static final SubLSymbol $sym1$SECOND = makeSymbol("SECOND");
  public static final SubLList $list2 = list(list(makeSymbol("VAR"), makeSymbol("&OPTIONAL"), list(makeSymbol("PROGRESS-MESSAGE"), makeString("mapping Cyc constants")), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLString $str3$mapping_Cyc_constants = makeString("mapping Cyc constants");
  public static final SubLList $list4 = list(makeKeyword("DONE"));
  public static final SubLSymbol $kw5$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw6$DONE = makeKeyword("DONE");
  public static final SubLSymbol $sym7$DO_KB_SUID_TABLE = makeSymbol("DO-KB-SUID-TABLE");
  public static final SubLList $list8 = list(makeSymbol("DO-CONSTANTS-TABLE"));
  public static final SubLSymbol $kw9$PROGRESS_MESSAGE = makeKeyword("PROGRESS-MESSAGE");
  public static final SubLSymbol $sym10$DO_CONSTANTS = makeSymbol("DO-CONSTANTS");
  public static final SubLString $str11$Iterate_over_all_HL_constant_data = makeString("Iterate over all HL constant datastructures, executing BODY within the scope of VAR.\n   VAR is bound to each constant in turn.\n   PROGRESS-MESSAGE is a progress message string.\n   Iteration halts early as soon as DONE becomes non-nil.");
  public static final SubLList $list12 = list(list(makeSymbol("CONSTANT"), makeSymbol("&KEY"), makeSymbol("PROGRESS-MESSAGE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list13 = list(makeKeyword("PROGRESS-MESSAGE"), makeKeyword("DONE"));
  public static final SubLSymbol $sym14$DO_KB_SUID_TABLE_OLD_OBJECTS = makeSymbol("DO-KB-SUID-TABLE-OLD-OBJECTS");
  public static final SubLSymbol $sym15$DO_KB_SUID_TABLE_NEW_OBJECTS = makeSymbol("DO-KB-SUID-TABLE-NEW-OBJECTS");
  public static final SubLSymbol $sym16$DO_CONSTANTS_TABLE = makeSymbol("DO-CONSTANTS-TABLE");
  public static final SubLSymbol $sym17$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $kw18$SKIP = makeKeyword("SKIP");
  public static final SubLSymbol $sym19$CREATE_CONSTANT_DUMP_ID_TABLE = makeSymbol("CREATE-CONSTANT-DUMP-ID-TABLE");
  public static final SubLSymbol $sym20$WITH_CONSTANT_DUMP_ID_TABLE = makeSymbol("WITH-CONSTANT-DUMP-ID-TABLE");
  public static final SubLSymbol $sym21$CONSTANT_COUNT = makeSymbol("CONSTANT-COUNT");
  public static final SubLString $str22$Return_the_total_number_of_consta = makeString("Return the total number of constants.");
  public static final SubLList $list23 = list(makeSymbol("INTEGERP"));
  public static final SubLSymbol $kw24$OLD = makeKeyword("OLD");
  public static final SubLString $str25$Determining_maximum_constant_SUID = makeString("Determining maximum constant SUID");
  public static final SubLSymbol $sym26$CONSTANT = makeSymbol("CONSTANT");
  public static final SubLSymbol $sym27$CONSTANT_P = makeSymbol("CONSTANT-P");
  public static final SubLInteger $int28$140 = makeInteger(140);
  public static final SubLList $list29 = list(makeSymbol("SUID"), makeSymbol("NAME"));
  public static final SubLList $list30 = list(makeKeyword("SUID"), makeKeyword("NAME"));
  public static final SubLList $list31 = list(makeSymbol("C-SUID"), makeSymbol("C-NAME"));
  public static final SubLList $list32 = list(makeSymbol("_CSETF-C-SUID"), makeSymbol("_CSETF-C-NAME"));
  public static final SubLSymbol $sym33$PRINT_CONSTANT = makeSymbol("PRINT-CONSTANT");
  public static final SubLSymbol $sym34$CONSTANT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("CONSTANT-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym35$C_SUID = makeSymbol("C-SUID");
  public static final SubLSymbol $sym36$_CSETF_C_SUID = makeSymbol("_CSETF-C-SUID");
  public static final SubLSymbol $sym37$C_NAME = makeSymbol("C-NAME");
  public static final SubLSymbol $sym38$_CSETF_C_NAME = makeSymbol("_CSETF-C-NAME");
  public static final SubLSymbol $kw39$SUID = makeKeyword("SUID");
  public static final SubLSymbol $kw40$NAME = makeKeyword("NAME");
  public static final SubLString $str41$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str42$___a = makeString("#$~a");
  public static final SubLString $str43$_The_CFASL_invalid_constant_ = makeString("<The CFASL invalid constant>");
  public static final SubLString $str44$_Constant__a_ = makeString("<Constant ~a>");
  public static final SubLSymbol $sym45$SXHASH_CONSTANT_METHOD = makeSymbol("SXHASH-CONSTANT-METHOD");
  public static final SubLList $list46 = list(makeSymbol("OBJECT"));
  public static final SubLString $str47$Return_T_iff_the_argument_is_a_Cy = makeString("Return T iff the argument is a CycL constant");
  public static final SubLList $list48 = list(makeSymbol("BOOLEANP"));
  public static final SubLSymbol $sym49$VALID_CONSTANT_ = makeSymbol("VALID-CONSTANT?");
  public static final SubLList $list50 = list(makeSymbol("CONSTANT"), makeSymbol("&OPTIONAL"), makeSymbol("ROBUST"));
  public static final SubLString $str51$Return_T_if_CONSTANT_is_a_valid__ = makeString("Return T if CONSTANT is a valid, fully-formed constant.");
  public static final SubLSymbol $kw52$UNNAMED = makeKeyword("UNNAMED");
  public static final SubLSymbol $sym53$VALID_CONSTANT = makeSymbol("VALID-CONSTANT");
  public static final SubLList $list54 = list(makeSymbol("VALID-CONSTANT?"));
  public static final SubLString $str55$Deprecated_in_favor_of_valid_cons = makeString("Deprecated in favor of valid-constant?\n   Return T if CONSTANT is a valid constant.");
  public static final SubLSymbol $sym56$_INVALID_CONSTANTS_ = makeSymbol("*INVALID-CONSTANTS*");
  public static final SubLInteger $int57$4000 = makeInteger(4000);
  public static final SubLString $str58$clearing_local_constant_informati = makeString("clearing local constant information");
  public static final SubLInteger $int59$50000 = makeInteger(50000);
  public static final SubLList $list60 = list(makeSymbol("INTERNAL-ID"), makeSymbol("NAME"), makeSymbol("EXTERNAL-ID"));
  public static final SubLSymbol $sym61$CONSTANT_NAME_SPEC_P = makeSymbol("CONSTANT-NAME-SPEC-P");
  public static final SubLString $str62$Freeing_constants = makeString("Freeing constants");
  public static final SubLSymbol $sym63$INTEGERP = makeSymbol("INTEGERP");
  public static final SubLString $str64$Rebuilding_constant_completion_ta = makeString("Rebuilding constant completion table");

  //// Initializers

  public void declareFunctions() {
    declare_constant_handles_file();
  }

  public void initializeVariables() {
    init_constant_handles_file();
  }

  public void runTopLevelForms() {
    setup_constant_handles_file();
  }

}
