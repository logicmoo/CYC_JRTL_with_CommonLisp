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

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public  final class file_vector_utilities extends SubLTranslatedFile {

  //// Constructor

  private file_vector_utilities() {}
  public static final SubLFile me = new file_vector_utilities();
  public static final String myName = "com.cyc.cycjava.cycl.file_vector_utilities";

  //// Definitions

  /** Rebind this to T in order to see the contents of the file-vector reference payloads. */
  @SubL(source = "cycl/file-vector-utilities.lisp", position = 4718) 
  public static SubLSymbol $show_file_vector_reference_payload_in_print$ = null;

  public static final class $file_vector_reference_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $index; }
    public SubLObject getField3() { return $payload; }
    public SubLObject setField2(SubLObject value) { return $index = value; }
    public SubLObject setField3(SubLObject value) { return $payload = value; }
    public SubLObject $index = NIL;
    public SubLObject $payload = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($file_vector_reference_native.class, $sym4$FILE_VECTOR_REFERENCE, $sym5$FILE_VECTOR_REFERENCE_P, $list6, $list7, new String[] {"$index", "$payload"}, $list8, $list9, $sym10$PRINT_FVECTOR_REF);
  }

  @SubL(source = "cycl/file-vector-utilities.lisp", position = 5381) 
  public static SubLSymbol $dtp_file_vector_reference$ = null;

  @SubL(source = "cycl/file-vector-utilities.lisp", position = 5381) 
  public static final SubLObject file_vector_reference_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 6228");
    return NIL;
  }

  @SubL(source = "cycl/file-vector-utilities.lisp", position = 5381) 
  public static final SubLObject file_vector_reference_p(SubLObject object) {
    return ((object.getClass() == $file_vector_reference_native.class) ? ((SubLObject) T) : NIL);
  }

  public static final class $file_vector_reference_p$UnaryFunction extends UnaryFunction {
    public $file_vector_reference_p$UnaryFunction() { super(extractFunctionNamed("FILE-VECTOR-REFERENCE-P")); }
    public SubLObject processItem(SubLObject arg1) { return file_vector_reference_p(arg1); }
  }

  @SubL(source = "cycl/file-vector-utilities.lisp", position = 9893) 
  private static SubLSymbol $cfasl_opcode_fvector_reference$ = null;

  @SubL(source = "cycl/file-vector-utilities.lisp", position = 10734) 
  public static final SubLObject cfasl_output_object_file_vector_reference_method(SubLObject object, SubLObject stream) {
    return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 6156");
  }

  /** A lock that may or may not be defined to gate access to the underlying
   data stream. */
  @SubL(source = "cycl/file-vector-utilities.lisp", position = 10870) 
  public static SubLSymbol $file_vector_backed_map_read_lock$ = null;


  @SubL(source = "cycl/file-vector-utilities.lisp", position = 9718) 
  public static final SubLObject file_vector_reference_presentP(SubLObject ref) {
    return makeBoolean(((NIL != file_vector_reference_present_pristineP(ref))
          || (NIL != file_vector_reference_present_mutatedP(ref))));
  }


  /** The file vector reference stands in for an object that is not the one that
   was swapped in. */
  @SubL(source = "cycl/file-vector-utilities.lisp", position = 8799) 
  public static final SubLObject file_vector_reference_present_mutatedP(SubLObject ref) {
    return makeBoolean(((NIL != fvector_ref_has_mutated_index_p(ref))
           && (NIL != fvector_ref_payload_in_memory_p(ref))));
  }


  @SubL(source = "cycl/file-vector-utilities.lisp", position = 8086) 
  public static final SubLObject fvector_ref_has_mutated_index_p(SubLObject ref) {
    return fvector_ref_mutated_index_p(fvector_ref_index(ref));
  }


  @SubL(source = "cycl/file-vector-utilities.lisp", position = 7714) 
  public static final SubLObject fvector_ref_payload_in_memory_p(SubLObject ref) {
    return makeBoolean((NIL != fvector_ref_payload(ref)));
  }

  @SubL(source = "cycl/file-vector-utilities.lisp", position = 5381) 
  public static final SubLObject fvector_ref_index(SubLObject object) {
    checkType(object, $sym5$FILE_VECTOR_REFERENCE_P);
    return object.getField2();
  }


  @SubL(source = "cycl/file-vector-utilities.lisp", position = 5381) 
  public static final SubLObject fvector_ref_payload(SubLObject object) {
    checkType(object, $sym5$FILE_VECTOR_REFERENCE_P);
    return object.getField3();
  }

  
  @SubL(source = "cycl/file-vector-utilities.lisp", position = 8008) 
  public static final SubLObject fvector_ref_mutated_index_p(SubLObject index) {
    return Numbers.minusp(index);
  }

  

  
  /** The file vector reference has brought the referenced object in
   from the index in the reference and holds on to it in the payload. */
  @SubL(source = "cycl/file-vector-utilities.lisp", position = 8494) 
  public static final SubLObject file_vector_reference_present_pristineP(SubLObject ref) {
    return makeBoolean(((NIL != fvector_ref_has_valid_index_p(ref))
           && (NIL != fvector_ref_payload_in_memory_p(ref))));
  }


  @SubL(source = "cycl/file-vector-utilities.lisp", position = 7894) 
  public static final SubLObject fvector_ref_has_valid_index_p(SubLObject ref) {
    return fvector_ref_valid_index_p(fvector_ref_index(ref));
  }

  
  /** Lookup the value. If the stored result is a FILE-VECTOR-REFERENCE-P,
   check whether it is loaded in. If it is present & pristine, update the
   cache-strategy's tracking. If it is not loaded, load the information,
   enable tracking with the cache-strategy for the key, and page out
   the key least likely to be needed according to the cache-strategy.
   @param CACHE-STRATEGY can be SYMBOLP if no cache strategy is needed.
   @return the value retrieved under the KEY or NOT-FOUND if not present */
  @SubL(source = "cycl/file-vector-utilities.lisp", position = 15396) 
  public static final SubLObject file_vector_backed_map_wX_cache_get(SubLObject map, SubLObject v_file_vector, SubLObject cache_strategy, SubLObject key, SubLObject not_found) {
    if ((not_found == UNPROVIDED)) {
      not_found = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(cache_strategy, $sym43$CACHE_STRATEGY_OR_SYMBOL_P);
      {
        SubLObject datum = map_utilities.map_get_without_values(map, key, not_found);
        if ((NIL != file_vector_reference_p(datum))) {
          if ((NIL != file_vector_reference_presentP(datum))) {
            {
              SubLObject value = file_vector_reference_referenced_object(datum);
              if ((NIL != cache_utilities.cache_strategy_p(cache_strategy))) {
                if ((NIL != file_vector_reference_present_pristineP(datum))) {
                  {
                    SubLObject data_stream_lock = $file_vector_backed_map_read_lock$.getDynamicValue(thread);
                    if (data_stream_lock.isLock()) {
                      {
                        SubLObject lock = data_stream_lock;
                        SubLObject release = NIL;
                        try {
                          release = Locks.seize_lock(lock);
                          cache_utilities.cache_strategy_note_cache_hit(cache_strategy);
                          cache_utilities.cache_strategy_note_reference(cache_strategy,key);
                        } finally {
                          if ((NIL != release)) {
                            Locks.release_lock(lock);
                          }
                        }
                      }
                    } else {
                      Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31209");
                      Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31215");
                    }
                  }
                }
              }
              return value;
            }
          } else if ((NIL !=  file_vector_reference_deletedP(datum))) {
            return not_found;
          } else if ((NIL != file_vector_reference_swapped_outP(datum))) {
            {
              SubLObject index = file_vector_reference_index(datum);
              SubLObject data_stream = file_vector.get_file_vector_data_stream(v_file_vector);
              SubLObject payload = NIL;
              {
                SubLObject data_stream_lock = $file_vector_backed_map_read_lock$.getDynamicValue(thread);
                if (data_stream_lock.isLock()) {
                  {
                    SubLObject lock = data_stream_lock;
                    SubLObject release = NIL;
                    try {
                      release = Locks.seize_lock(lock);
                      file_vector.position_file_vector(v_file_vector, index);
                      payload = file_vector_backed_map_read_value(data_stream);
                    } finally {
                      if ((NIL != release)) {
                        Locks.release_lock(lock);
                      }
                    }
                  }
                } else {
                  file_vector.position_file_vector(v_file_vector, index);
                  payload = Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 6173");
                }
              }
              set_file_vector_reference_referenced_object(datum,payload);
              if ((NIL != cache_utilities.cache_strategy_p(cache_strategy))) {
                {
                  SubLObject data_stream_lock = $file_vector_backed_map_read_lock$.getDynamicValue(thread);
                  if (data_stream_lock.isLock()) {
                    {
                      SubLObject lock = data_stream_lock;
                      SubLObject release = NIL;
                      try {
                        release = Locks.seize_lock(lock);
                        {
                          SubLObject potential_loser = cache_utilities.cache_strategy_track(cache_strategy,key);
                          if ((potential_loser != key)) {
                            Errors
									.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 6234");
                          }
                        }
                        cache_utilities.cache_strategy_note_cache_miss(cache_strategy);
                      } finally {
                        if ((NIL != release)) {
                          Locks.release_lock(lock);
                        }
                      }
                    }
                  } else {
                    {
                      SubLObject potential_loser = Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31238");
                      if ((potential_loser != key)) {
                        Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 6235");
                      }
                      Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31211");
                    }
                  }
                }
              }
              return payload;
            }
          } else {
            Errors.error($str44$Invalid_state_transition___A_is_n, datum);
          }
        }
        return datum;
      }
    }
  }
  

  
 

  @SubL(source = "cycl/file-vector-utilities.lisp", position = 7446) 
  public static final SubLObject file_vector_reference_referenced_object(SubLObject ref) {
    return fvector_ref_payload(ref);
  }

  
  @SubL(source = "cycl/file-vector-utilities.lisp", position = 6533) 
  public static final SubLObject file_vector_reference_index(SubLObject ref) {
    return fvector_ref_index(ref);
  }

  

  /** The file vector reference refers to an object in the file vector
   but that object does not reside yet in memory. */
  @SubL(source = "cycl/file-vector-utilities.lisp", position = 8204) 
  public static final SubLObject file_vector_reference_swapped_outP(SubLObject ref) {
    return makeBoolean(((NIL != fvector_ref_has_valid_index_p(ref))
           && (NIL == fvector_ref_payload_in_memory_p(ref))));
  }

  

  @SubL(source = "cycl/file-vector-utilities.lisp", position = 31593) 
  public static final SubLObject file_vector_backed_map_read_value(SubLObject data_stream) {
    return cfasl.cfasl_input(data_stream, UNPROVIDED, UNPROVIDED);
  }

  
  /** The file vector reference refers to a deleted object. */
  @SubL(source = "cycl/file-vector-utilities.lisp", position = 9066) 
  public static final SubLObject file_vector_reference_deletedP(SubLObject ref) {
    return makeBoolean(((NIL != fvector_ref_has_mutated_index_p(ref))
           && (NIL == fvector_ref_payload_in_memory_p(ref))));
  }


  /** Put the value into the file-vector backed map. If the entry denoted by the key
   has a file vector backed reference, then mark the file vector reference as mutated
   and replace the payload with the value. If the CACHE-STRATEGY is valid, then
   untrack the key.
   Otherwise, simply store the passed-in new value.
   @param CACHE-STRATEGY can be SYMBOLP if no cache strategy is needed.
   @return :mutated if the entry was a file-vector reference, nil otherwise */
  @SubL(source = "cycl/file-vector-utilities.lisp", position = 18201) 
  public static final SubLObject file_vector_backed_map_wX_cache_put(SubLObject map, SubLObject cache_strategy, SubLObject key, SubLObject value) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(cache_strategy, $sym43$CACHE_STRATEGY_OR_SYMBOL_P);
      {
        SubLObject new_value = value;
        SubLObject current_value = map_utilities.map_get_without_values(map, key, $kw45$NOT_FOUND);
        SubLObject mutated_p = NIL;
        if ((NIL != file_vector_reference_p(current_value))) {
          {
            SubLObject ref = current_value;
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 6215");
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 6233");
            if ((NIL != Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31227"))) {
              {
                SubLObject data_stream_lock = $file_vector_backed_map_read_lock$.getDynamicValue(thread);
                if (data_stream_lock.isLock()) {
                  {
                    SubLObject lock = data_stream_lock;
                    SubLObject release = NIL;
                    try {
                      release = Locks.seize_lock(lock);
                      Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31246");
                    } finally {
                      if ((NIL != release)) {
                        Locks.release_lock(lock);
                      }
                    }
                  }
                } else {
                  Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31247");
                }
              }
            }
          }
          mutated_p = $kw46$MUTATED;
        } else {
          map_utilities.map_put(map, key, new_value);
        }
        return mutated_p;
      }
    }
  }

  /** Produce the effect of removing the key from the file vector backed map. If the entry 
   denoted by the key has a file-vector backed reference and SUPPORT-UNDO-P
   is true, then mark the file vector reference as deleted (which nulls out the 
   payload). Otherwise simply remove the entry from the map.
   If the cache-strategy is valid and the entry was a file vector reference, then the
   key is untracked.
   @param CACHE-STRATEGY can be SYMBOLP if no cache strategy is needed.
   @return :deleted if the entry was a file vector reference, nil otherwise. */
  @SubL(source = "cycl/file-vector-utilities.lisp", position = 19937) 
  public static final SubLObject file_vector_backed_map_wX_cache_remove(SubLObject map, SubLObject cache_strategy, SubLObject key, SubLObject support_undo_p) {
    if ((support_undo_p == UNPROVIDED)) {
      support_undo_p = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(cache_strategy, $sym43$CACHE_STRATEGY_OR_SYMBOL_P);
      {
        SubLObject current_value = map_utilities.map_get_without_values(map, key, $kw45$NOT_FOUND);
        SubLObject is_file_vector_reference = file_vector_reference_p(current_value);
        SubLObject deleted_p = NIL;
        if (((NIL != support_undo_p)
             && (NIL != is_file_vector_reference))) {
          {
            SubLObject ref = current_value;
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 6214");
          }
          deleted_p = $kw47$DELETED;
        } else {
          map_utilities.map_remove(map, key);
        }
        if (((NIL != is_file_vector_reference)
             && (NIL != Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31228")))) {
          {
            SubLObject data_stream_lock = $file_vector_backed_map_read_lock$.getDynamicValue(thread);
            if (data_stream_lock.isLock()) {
              {
                SubLObject lock = data_stream_lock;
                SubLObject release = NIL;
                try {
                  release = Locks.seize_lock(lock);
                  Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31248");
                } finally {
                  if ((NIL != release)) {
                    Locks.release_lock(lock);
                  }
                }
              }
            } else {
              Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31249");
            }
          }
        }
        return deleted_p;
      }
    }
  }


  @SubL(source = "cycl/file-vector-utilities.lisp", position = 7819) 
  public static final SubLObject fvector_ref_valid_index_p(SubLObject index) {
    return Numbers.plusp(index);
  }


  @SubL(source = "cycl/file-vector-utilities.lisp", position = 6057) 
  public static final SubLObject new_file_vector_reference(SubLObject index) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
        if ((!(index.isPositive()))) {
          Errors.error($str23$File_Vector_references_cannot_be_);
        }
      }
      {
        SubLObject ref = make_file_vector_reference(UNPROVIDED);
        _csetf_fvector_ref_index(ref, index);
        clear_file_vector_reference_referenced_object(ref);
        return ref;
      }
    }
  }


  @SubL(source = "cycl/file-vector-utilities.lisp", position = 7313) 
  public static final SubLObject clear_file_vector_reference_referenced_object(SubLObject ref) {
    return set_file_vector_reference_referenced_object(ref, NIL);
  }

  

  @SubL(source = "cycl/file-vector-utilities.lisp", position = 7182) 
  public static final SubLObject set_file_vector_reference_referenced_object(SubLObject ref, SubLObject object) {
    _csetf_fvector_ref_payload(ref, object);
    return ref;
  }


  @SubL(source = "cycl/file-vector-utilities.lisp", position = 5381) 
  public static final SubLObject _csetf_fvector_ref_payload(SubLObject object, SubLObject value) {
    checkType(object, $sym5$FILE_VECTOR_REFERENCE_P);
    return object.setField3(value);
  }

  
  
  @SubL(source = "cycl/file-vector-utilities.lisp", position = 5381) 
  public static final SubLObject make_file_vector_reference(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $file_vector_reference_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw16$INDEX)) {
            _csetf_fvector_ref_index(v_new, current_value);
          } else if (pcase_var.eql($kw17$PAYLOAD)) {
            _csetf_fvector_ref_payload(v_new, current_value);
          } else {
            Errors.error($str18$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }


  @SubL(source = "cycl/file-vector-utilities.lisp", position = 5381) 
  public static final SubLObject _csetf_fvector_ref_index(SubLObject object, SubLObject value) {
    checkType(object, $sym5$FILE_VECTOR_REFERENCE_P);
    return object.setField2(value);
  }

  
  
  @SubL(source = "cycl/file-vector-utilities.lisp", position = 10011) 
  public static final SubLObject cfasl_input_file_vector_reference(SubLObject stream) {
    {
      SubLObject index = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
      if ((NIL != fvector_ref_valid_index_p(index))) {
        return new_file_vector_reference(index);
      } else {
        {
          SubLObject payload = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
          return new_file_vector_reference_wX_payload(index, payload);
        }
      }
    }
  }


  @SubL(source = "cycl/file-vector-utilities.lisp", position = 6335) 
  public static final SubLObject new_file_vector_reference_wX_payload(SubLObject index, SubLObject payload) {
    {
      SubLObject ref = new_file_vector_reference(index);
      set_file_vector_reference_referenced_object(ref, payload);
      return ref;
    }
  }

  
  /** If the entry denoted by key has a file-vector backed reference, then mark
   the reference as mutated. This allows to percolate change information
   properly in situations where the value of a map is a container.
   Touched items have to be untracked in the cache strategy if caching is active.
   @param CACHE-STRATEGY can be SYMBOLP if no cache strategy is needed.
   @param FVECTOR this value need only be valid if the entry is swapped out
   at the time of the call, because touch must page the absent values in
   @return :MUTATED if the entry was a file vecotr reference, nil otherwise */
  @SubL(source = "cycl/file-vector-utilities.lisp", position = 21837) 
  public static final SubLObject file_vector_backed_map_wX_cache_touch(SubLObject map, SubLObject cache_strategy, SubLObject key, SubLObject fvector) {
    if ((fvector == UNPROVIDED)) {
      fvector = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(cache_strategy, $sym43$CACHE_STRATEGY_OR_SYMBOL_P);
      {
        SubLObject current_value = map_utilities.map_get_without_values(map, key, $kw45$NOT_FOUND);
        SubLObject mutated_p = NIL;
        if ((NIL != file_vector_reference_p(current_value))) {
          {
            SubLObject ref = current_value;
            if ((NIL != file_vector_reference_swapped_outP(ref))) {
              checkType(fvector, $sym48$FILE_VECTOR_P);
              file_vector_backed_map_wX_cache_get(map, fvector, cache_strategy, key, UNPROVIDED);
            }
            mark_file_vector_reference_as_mutated(ref);
            if ((NIL != cache_utilities.cache_strategy_p(cache_strategy))) {
              {
                SubLObject data_stream_lock = $file_vector_backed_map_read_lock$.getDynamicValue(thread);
                if (data_stream_lock.isLock()) {
                  {
                    SubLObject lock = data_stream_lock;
                    SubLObject release = NIL;
                    try {
                      release = Locks.seize_lock(lock);
                      Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31250");
                    } finally {
                      if ((NIL != release)) {
                        Locks.release_lock(lock);
                      }
                    }
                  }
                } else {
                  Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31251");
                }
              }
            }
          }
          mutated_p = $kw46$MUTATED;
        }
        return mutated_p;
      }
    }
  }


  @SubL(source = "cycl/file-vector-utilities.lisp", position = 6617) 
  public static final SubLObject mark_file_vector_reference_as_mutated(SubLObject ref) {
    {
      SubLObject index = fvector_ref_index(ref);
      SubLObject mutated_index = Numbers.minus(Numbers.abs(index));
      _csetf_fvector_ref_index(ref, mutated_index);
    }
    return ref;
  }

  
  /** For all values in the MAP, if the value is a pristine file
   vector reference, then zero out its payload to make that data 
   available for garbage collection.
   @return 0 the MAP
   @return 1 the count of paged out items */
  @SubL(source = "cycl/file-vector-utilities.lisp", position = 28519) 
  public static final SubLObject swap_out_all_pristine_file_vector_backed_map_objects(SubLObject map) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject swapped_out = ZERO_INTEGER;
        SubLObject iterator = map_utilities.new_map_iterator(map);
        SubLObject done_var = NIL;
        while ((NIL == done_var)) {
          thread.resetMultipleValues();
          {
            SubLObject var = iteration.iteration_next(iterator);
            SubLObject valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if ((NIL != valid)) {
              {
                SubLObject datum = var;
                SubLObject current = datum;
                SubLObject key = NIL;
                SubLObject value = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list2);
                key = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list2);
                value = current.first();
                current = current.rest();
                if ((NIL == current)) {
                  if ((NIL != potentially_swap_out_pristine_file_vector_backed_map_object(value))) {
                    swapped_out = Numbers.add(swapped_out, ONE_INTEGER);
                  }
                } else {
                  cdestructuring_bind.cdestructuring_bind_error(datum, $list2);
                }
              }
            }
            done_var = makeBoolean((NIL == valid));
          }
        }
        return Values.values(map, swapped_out);
      }
    }
  }

  /** Helper for swapping out, both in the larger context of swapping out all and
   in the more specific context of swapping out some.
   @return T if there was a file vector reference that was pristine and swapped
   out, NIL otherwise */
  @SubL(source = "cycl/file-vector-utilities.lisp", position = 29455) 
  public static final SubLObject potentially_swap_out_pristine_file_vector_backed_map_object(SubLObject value) {
    if ((NIL != file_vector_reference_p(value))) {
      if ((NIL != file_vector_reference_present_pristineP(value))) {
      	clear_file_vector_reference_referenced_object(value);
        return T;
      }
    }
    return NIL;
  }

  public static final class $backed_map_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $map; }
    public SubLObject getField3() { return $fvector; }
    public SubLObject getField4() { return $common_symbols; }
    public SubLObject setField2(SubLObject value) { return $map = value; }
    public SubLObject setField3(SubLObject value) { return $fvector = value; }
    public SubLObject setField4(SubLObject value) { return $common_symbols = value; }
    public SubLObject $map = NIL;
    public SubLObject $fvector = NIL;
    public SubLObject $common_symbols = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($backed_map_native.class, $sym67$BACKED_MAP, $sym68$BACKED_MAP_P, $list69, $list70, new String[] {"$map", "$fvector", "$common_symbols"}, $list71, $list72, $sym73$PRINT_BACKED_MAP);
  }

  @SubL(source = "cycl/file-vector-utilities.lisp", position = 34659) 
  public static SubLSymbol $dtp_backed_map$ = null;

  @SubL(source = "cycl/file-vector-utilities.lisp", position = 34659) 
  public static final SubLObject backed_map_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 6227");
    return NIL;
  }

  public static final class $backed_map_p$UnaryFunction extends UnaryFunction {
    public $backed_map_p$UnaryFunction() { super(extractFunctionNamed("BACKED-MAP-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 6142"); }
  }

  @SubL(source = "cycl/file-vector-utilities.lisp", position = 37273) 
  private static SubLSymbol $cfasl_opcode_backed_map$ = null;

  @SubL(source = "cycl/file-vector-utilities.lisp", position = 37742) 
  public static final SubLObject cfasl_output_object_backed_map_method(SubLObject object, SubLObject stream) {
    return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 6155");
  }

  /** The current cache strategy to use for this backed-map operation. Defaults to none. */
  @SubL(source = "cycl/file-vector-utilities.lisp", position = 37856) 
  public static SubLSymbol $current_backed_map_cache_strategy$ = null;

  @SubL(source = "cycl/file-vector-utilities.lisp", position = 38438) 
  public static final SubLObject is_map_object_p_backed_map_method(SubLObject object) {
    return T;
  }

  @SubL(source = "cycl/file-vector-utilities.lisp", position = 38551) 
  public static final SubLObject map_object_size_backed_map_method(SubLObject object) {
    return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 6210");
  }

  @SubL(source = "cycl/file-vector-utilities.lisp", position = 38944) 
  public static final SubLObject map_object_test_backed_map_method(SubLObject object) {
    return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 6211");
  }

  @SubL(source = "cycl/file-vector-utilities.lisp", position = 39168) 
  public static final SubLObject map_object_put_backed_map_method(SubLObject object, SubLObject key, SubLObject value) {
    return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 6207");
  }

  @SubL(source = "cycl/file-vector-utilities.lisp", position = 39494) 
  public static final SubLObject map_object_get_backed_map_method(SubLObject object, SubLObject key, SubLObject not_found) {
    return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 6205");
  }

  @SubL(source = "cycl/file-vector-utilities.lisp", position = 40164) 
  public static final SubLObject map_object_get_without_values_backed_map_method(SubLObject object, SubLObject key, SubLObject not_found) {
    return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 6206");
  }

  @SubL(source = "cycl/file-vector-utilities.lisp", position = 40806) 
  public static final SubLObject map_object_remove_backed_map_method(SubLObject object, SubLObject key) {
    return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 6208");
  }

  @SubL(source = "cycl/file-vector-utilities.lisp", position = 41175) 
  public static final SubLObject map_object_remove_all_backed_map_method(SubLObject object) {
    return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 6209");
  }

  @SubL(source = "cycl/file-vector-utilities.lisp", position = 41616) 
  public static final SubLObject map_object_touch_backed_map_method(SubLObject object, SubLObject key) {
    return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 6212");
  }

  @SubL(source = "cycl/file-vector-utilities.lisp", position = 42082) 
  public static final SubLObject new_map_object_with_same_properties_backed_map_method(SubLObject object, SubLObject test, SubLObject size) {
    return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 6226");
  }

  @SubL(source = "cycl/file-vector-utilities.lisp", position = 43076) 
  public static final SubLObject new_map_object_iterator_backed_map_method(SubLObject object) {
    return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 6225");
  }

  @SubL(source = "cycl/file-vector-utilities.lisp", position = 44805) 
  public static final SubLObject map_object_arbitrary_key_backed_map_method(SubLObject object) {
    return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 6204");
  }

  public static final SubLObject declare_file_vector_utilities_file() {
    //declareFunction(myName, "create_file_backing_for_map", "CREATE-FILE-BACKING-FOR-MAP", 3, 0, false);
    //declareFunction(myName, "create_file_vector_backing_for_map", "CREATE-FILE-VECTOR-BACKING-FOR-MAP", 2, 0, false);
    //declareFunction(myName, "write_file_vector_backing_map_prologue", "WRITE-FILE-VECTOR-BACKING-MAP-PROLOGUE", 2, 0, false);
    //declareFunction(myName, "write_file_vector_backing_map_entry", "WRITE-FILE-VECTOR-BACKING-MAP-ENTRY", 3, 0, false);
    //declareFunction(myName, "write_file_vector_backing_map_prologue_to_data_stream", "WRITE-FILE-VECTOR-BACKING-MAP-PROLOGUE-TO-DATA-STREAM", 2, 0, false);
    //declareFunction(myName, "create_file_backing_for_maps", "CREATE-FILE-BACKING-FOR-MAPS", 3, 0, false);
    //declareFunction(myName, "create_file_vector_backing_for_maps", "CREATE-FILE-VECTOR-BACKING-FOR-MAPS", 2, 0, false);
    declareFunction(myName, "file_vector_reference_print_function_trampoline", "FILE-VECTOR-REFERENCE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "file_vector_reference_p", "FILE-VECTOR-REFERENCE-P", 1, 0, false); new $file_vector_reference_p$UnaryFunction();
    //declareFunction(myName, "fvector_ref_index", "FVECTOR-REF-INDEX", 1, 0, false);
    //declareFunction(myName, "fvector_ref_payload", "FVECTOR-REF-PAYLOAD", 1, 0, false);
    //declareFunction(myName, "_csetf_fvector_ref_index", "_CSETF-FVECTOR-REF-INDEX", 2, 0, false);
    //declareFunction(myName, "_csetf_fvector_ref_payload", "_CSETF-FVECTOR-REF-PAYLOAD", 2, 0, false);
    //declareFunction(myName, "make_file_vector_reference", "MAKE-FILE-VECTOR-REFERENCE", 0, 1, false);
    //declareFunction(myName, "print_fvector_ref", "PRINT-FVECTOR-REF", 3, 0, false);
    //declareFunction(myName, "new_file_vector_reference", "NEW-FILE-VECTOR-REFERENCE", 1, 0, false);
    //declareFunction(myName, "new_file_vector_reference_wX_payload", "NEW-FILE-VECTOR-REFERENCE-W/-PAYLOAD", 2, 0, false);
    //declareFunction(myName, "file_vector_reference_index", "FILE-VECTOR-REFERENCE-INDEX", 1, 0, false);
    //declareFunction(myName, "mark_file_vector_reference_as_mutated", "MARK-FILE-VECTOR-REFERENCE-AS-MUTATED", 1, 0, false);
    //declareFunction(myName, "recover_mutated_file_vector_reference", "RECOVER-MUTATED-FILE-VECTOR-REFERENCE", 1, 0, false);
    //declareFunction(myName, "restore_file_vector_reference", "RESTORE-FILE-VECTOR-REFERENCE", 1, 0, false);
    //declareFunction(myName, "set_file_vector_reference_referenced_object", "SET-FILE-VECTOR-REFERENCE-REFERENCED-OBJECT", 2, 0, false);
    //declareFunction(myName, "clear_file_vector_reference_referenced_object", "CLEAR-FILE-VECTOR-REFERENCE-REFERENCED-OBJECT", 1, 0, false);
    //declareFunction(myName, "file_vector_reference_referenced_object", "FILE-VECTOR-REFERENCE-REFERENCED-OBJECT", 1, 0, false);
    //declareFunction(myName, "mark_file_vector_reference_as_deleted", "MARK-FILE-VECTOR-REFERENCE-AS-DELETED", 1, 0, false);
    //declareFunction(myName, "fvector_ref_payload_in_memory_p", "FVECTOR-REF-PAYLOAD-IN-MEMORY-P", 1, 0, false);
    //declareFunction(myName, "fvector_ref_valid_index_p", "FVECTOR-REF-VALID-INDEX-P", 1, 0, false);
    //declareFunction(myName, "fvector_ref_has_valid_index_p", "FVECTOR-REF-HAS-VALID-INDEX-P", 1, 0, false);
    //declareFunction(myName, "fvector_ref_mutated_index_p", "FVECTOR-REF-MUTATED-INDEX-P", 1, 0, false);
    //declareFunction(myName, "fvector_ref_has_mutated_index_p", "FVECTOR-REF-HAS-MUTATED-INDEX-P", 1, 0, false);
    //declareFunction(myName, "file_vector_reference_swapped_outP", "FILE-VECTOR-REFERENCE-SWAPPED-OUT?", 1, 0, false);
    //declareFunction(myName, "file_vector_reference_present_pristineP", "FILE-VECTOR-REFERENCE-PRESENT-PRISTINE?", 1, 0, false);
    //declareFunction(myName, "file_vector_reference_present_mutatedP", "FILE-VECTOR-REFERENCE-PRESENT-MUTATED?", 1, 0, false);
    //declareFunction(myName, "file_vector_reference_deletedP", "FILE-VECTOR-REFERENCE-DELETED?", 1, 0, false);
    //declareFunction(myName, "file_vector_reference_status", "FILE-VECTOR-REFERENCE-STATUS", 1, 0, false);
    //declareFunction(myName, "file_vector_reference_presentP", "FILE-VECTOR-REFERENCE-PRESENT?", 1, 0, false);
    declareFunction(myName, "cfasl_input_file_vector_reference", "CFASL-INPUT-FILE-VECTOR-REFERENCE", 1, 0, false);
    //declareFunction(myName, "cfasl_output_file_vector_reference", "CFASL-OUTPUT-FILE-VECTOR-REFERENCE", 2, 0, false);
    declareFunction(myName, "cfasl_output_object_file_vector_reference_method", "CFASL-OUTPUT-OBJECT-FILE-VECTOR-REFERENCE-METHOD", 2, 0, false);
    //declareMacro(myName, "with_potential_data_stream_lock", "WITH-POTENTIAL-DATA-STREAM-LOCK");
    //declareMacro(myName, "with_file_vector_backed_map_stream_lock", "WITH-FILE-VECTOR-BACKED-MAP-STREAM-LOCK");
    //declareFunction(myName, "new_file_vector_backed_map", "NEW-FILE-VECTOR-BACKED-MAP", 1, 3, false);
    //declareFunction(myName, "load_file_vector_backed_map", "LOAD-FILE-VECTOR-BACKED-MAP", 2, 0, false);
    //declareFunction(myName, "load_one_file_vector_backed_map", "LOAD-ONE-FILE-VECTOR-BACKED-MAP", 1, 1, false);
    //declareFunction(myName, "load_file_vector_backed_maps", "LOAD-FILE-VECTOR-BACKED-MAPS", 2, 0, false);
    //declareFunction(myName, "file_vector_backed_map_get", "FILE-VECTOR-BACKED-MAP-GET", 3, 1, false);
    declareFunction(myName, "file_vector_backed_map_wX_cache_get", "FILE-VECTOR-BACKED-MAP-W/-CACHE-GET", 4, 1, false);
    //declareFunction(myName, "file_vector_backed_map_put", "FILE-VECTOR-BACKED-MAP-PUT", 3, 0, false);
    declareFunction(myName, "file_vector_backed_map_wX_cache_put", "FILE-VECTOR-BACKED-MAP-W/-CACHE-PUT", 4, 0, false);
    //declareFunction(myName, "file_vector_backed_map_remove", "FILE-VECTOR-BACKED-MAP-REMOVE", 2, 1, false);
    declareFunction(myName, "file_vector_backed_map_wX_cache_remove", "FILE-VECTOR-BACKED-MAP-W/-CACHE-REMOVE", 3, 1, false);
    //declareFunction(myName, "file_vector_backed_map_touch", "FILE-VECTOR-BACKED-MAP-TOUCH", 2, 1, false);
    declareFunction(myName, "file_vector_backed_map_wX_cache_touch", "FILE-VECTOR-BACKED-MAP-W/-CACHE-TOUCH", 3, 1, false);
    //declareFunction(myName, "undo_change_to_file_vector_backed_map", "UNDO-CHANGE-TO-FILE-VECTOR-BACKED-MAP", 2, 0, false);
    //declareFunction(myName, "undo_change_to_file_vector_backed_map_wX_cache", "UNDO-CHANGE-TO-FILE-VECTOR-BACKED-MAP-W/-CACHE", 3, 0, false);
    //declareMacro(myName, "do_file_vector_backed_map", "DO-FILE-VECTOR-BACKED-MAP");
    //declareFunction(myName, "new_file_vector_backed_map_iterator", "NEW-FILE-VECTOR-BACKED-MAP-ITERATOR", 2, 2, false);
    //declareFunction(myName, "new_file_vector_backed_map_iterator_state", "NEW-FILE-VECTOR-BACKED-MAP-ITERATOR-STATE", 4, 0, false);
    //declareFunction(myName, "file_vector_backed_map_iterator_done", "FILE-VECTOR-BACKED-MAP-ITERATOR-DONE", 1, 0, false);
    //declareFunction(myName, "file_vector_backed_map_iterator_next", "FILE-VECTOR-BACKED-MAP-ITERATOR-NEXT", 1, 0, false);
    //declareFunction(myName, "file_vector_backed_map_cache_ratio", "FILE-VECTOR-BACKED-MAP-CACHE-RATIO", 1, 0, false);
    declareFunction(myName, "swap_out_all_pristine_file_vector_backed_map_objects", "SWAP-OUT-ALL-PRISTINE-FILE-VECTOR-BACKED-MAP-OBJECTS", 1, 0, false);
    //declareFunction(myName, "swap_out_pristine_file_vector_backed_map_object", "SWAP-OUT-PRISTINE-FILE-VECTOR-BACKED-MAP-OBJECT", 2, 0, false);
    declareFunction(myName, "potentially_swap_out_pristine_file_vector_backed_map_object", "POTENTIALLY-SWAP-OUT-PRISTINE-FILE-VECTOR-BACKED-MAP-OBJECT", 1, 0, false);
    //declareFunction(myName, "compact_file_vector_backed_map_representation", "COMPACT-FILE-VECTOR-BACKED-MAP-REPRESENTATION", 1, 0, false);
    //declareFunction(myName, "file_vector_index_from_map_element_number", "FILE-VECTOR-INDEX-FROM-MAP-ELEMENT-NUMBER", 1, 0, false);
    //declareFunction(myName, "file_vector_value_index_from_key_index", "FILE-VECTOR-VALUE-INDEX-FROM-KEY-INDEX", 1, 0, false);
    //declareFunction(myName, "map_size_from_file_vector_length", "MAP-SIZE-FROM-FILE-VECTOR-LENGTH", 1, 0, false);
    //declareFunction(myName, "file_vector_backed_map_read_key", "FILE-VECTOR-BACKED-MAP-READ-KEY", 1, 0, false);
    //declareFunction(myName, "file_vector_backed_map_read_value", "FILE-VECTOR-BACKED-MAP-READ-VALUE", 1, 0, false);
    //declareFunction(myName, "convert_map_to_file_vector_backed_map", "CONVERT-MAP-TO-FILE-VECTOR-BACKED-MAP", 2, 1, false);
    //declareFunction(myName, "create_file_vector_backed_map_from_map", "CREATE-FILE-VECTOR-BACKED-MAP-FROM-MAP", 2, 1, false);
    //declareFunction(myName, "populate_file_vector_backed_map_from_map", "POPULATE-FILE-VECTOR-BACKED-MAP-FROM-MAP", 3, 1, false);
    //declareFunction(myName, "build_file_vector_backed_map_from_map", "BUILD-FILE-VECTOR-BACKED-MAP-FROM-MAP", 3, 1, false);
    declareFunction(myName, "backed_map_print_function_trampoline", "BACKED-MAP-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction(myName, "backed_map_p", "BACKED-MAP-P", 1, 0, false); new $backed_map_p$UnaryFunction();
    //declareFunction(myName, "backed_map_map", "BACKED-MAP-MAP", 1, 0, false);
    //declareFunction(myName, "backed_map_fvector", "BACKED-MAP-FVECTOR", 1, 0, false);
    //declareFunction(myName, "backed_map_common_symbols", "BACKED-MAP-COMMON-SYMBOLS", 1, 0, false);
    //declareFunction(myName, "_csetf_backed_map_map", "_CSETF-BACKED-MAP-MAP", 2, 0, false);
    //declareFunction(myName, "_csetf_backed_map_fvector", "_CSETF-BACKED-MAP-FVECTOR", 2, 0, false);
    //declareFunction(myName, "_csetf_backed_map_common_symbols", "_CSETF-BACKED-MAP-COMMON-SYMBOLS", 2, 0, false);
    //declareFunction(myName, "make_backed_map", "MAKE-BACKED-MAP", 0, 1, false);
    //declareFunction(myName, "new_backed_map", "NEW-BACKED-MAP", 2, 1, false);
    //declareFunction(myName, "new_backed_map_from_files", "NEW-BACKED-MAP-FROM-FILES", 3, 1, false);
    //declareMacro(myName, "with_backed_map_common_symbols", "WITH-BACKED-MAP-COMMON-SYMBOLS");
    //declareFunction(myName, "print_backed_map", "PRINT-BACKED-MAP", 3, 0, false);
    //declareFunction(myName, "new_future_backed_map", "NEW-FUTURE-BACKED-MAP", 1, 0, false);
    //declareFunction(myName, "reconnect_backed_map", "RECONNECT-BACKED-MAP", 2, 1, false);
    //declareFunction(myName, "reconnect_backed_map_based_on_backed_map", "RECONNECT-BACKED-MAP-BASED-ON-BACKED-MAP", 2, 0, false);
    //declareFunction(myName, "cfasl_input_backed_map", "CFASL-INPUT-BACKED-MAP", 1, 0, false);
    //declareFunction(myName, "cfasl_output_backed_map", "CFASL-OUTPUT-BACKED-MAP", 2, 0, false);
    declareFunction(myName, "cfasl_output_object_backed_map_method", "CFASL-OUTPUT-OBJECT-BACKED-MAP-METHOD", 2, 0, false);
    //declareMacro(myName, "with_backed_map_cache_strategy", "WITH-BACKED-MAP-CACHE-STRATEGY");
    //declareFunction(myName, "backed_map_cache_strategy", "BACKED-MAP-CACHE-STRATEGY", 0, 0, false);
    declareFunction(myName, "is_map_object_p_backed_map_method", "IS-MAP-OBJECT-P-BACKED-MAP-METHOD", 1, 0, false);
    declareFunction(myName, "map_object_size_backed_map_method", "MAP-OBJECT-SIZE-BACKED-MAP-METHOD", 1, 0, false);
    //declareFunction(myName, "map_backed_map_size", "MAP-BACKED-MAP-SIZE", 1, 0, false);
    declareFunction(myName, "map_object_test_backed_map_method", "MAP-OBJECT-TEST-BACKED-MAP-METHOD", 1, 0, false);
    //declareFunction(myName, "map_backed_map_test", "MAP-BACKED-MAP-TEST", 1, 0, false);
    declareFunction(myName, "map_object_put_backed_map_method", "MAP-OBJECT-PUT-BACKED-MAP-METHOD", 3, 0, false);
    //declareFunction(myName, "map_backed_map_put", "MAP-BACKED-MAP-PUT", 3, 0, false);
    declareFunction(myName, "map_object_get_backed_map_method", "MAP-OBJECT-GET-BACKED-MAP-METHOD", 3, 0, false);
    //declareFunction(myName, "map_backed_map_get", "MAP-BACKED-MAP-GET", 3, 0, false);
    declareFunction(myName, "map_object_get_without_values_backed_map_method", "MAP-OBJECT-GET-WITHOUT-VALUES-BACKED-MAP-METHOD", 3, 0, false);
    //declareFunction(myName, "map_backed_map_get_without_values", "MAP-BACKED-MAP-GET-WITHOUT-VALUES", 3, 0, false);
    declareFunction(myName, "map_object_remove_backed_map_method", "MAP-OBJECT-REMOVE-BACKED-MAP-METHOD", 2, 0, false);
    //declareFunction(myName, "map_backed_map_remove", "MAP-BACKED-MAP-REMOVE", 2, 0, false);
    declareFunction(myName, "map_object_remove_all_backed_map_method", "MAP-OBJECT-REMOVE-ALL-BACKED-MAP-METHOD", 1, 0, false);
    //declareFunction(myName, "map_backed_map_remove_all", "MAP-BACKED-MAP-REMOVE-ALL", 1, 0, false);
    declareFunction(myName, "map_object_touch_backed_map_method", "MAP-OBJECT-TOUCH-BACKED-MAP-METHOD", 2, 0, false);
    //declareFunction(myName, "map_backed_map_touch", "MAP-BACKED-MAP-TOUCH", 2, 0, false);
    declareFunction(myName, "new_map_object_with_same_properties_backed_map_method", "NEW-MAP-OBJECT-WITH-SAME-PROPERTIES-BACKED-MAP-METHOD", 3, 0, false);
    //declareFunction(myName, "new_map_backed_map_with_same_properties", "NEW-MAP-BACKED-MAP-WITH-SAME-PROPERTIES", 3, 0, false);
    declareFunction(myName, "new_map_object_iterator_backed_map_method", "NEW-MAP-OBJECT-ITERATOR-BACKED-MAP-METHOD", 1, 0, false);
    //declareFunction(myName, "new_map_backed_map_iterator", "NEW-MAP-BACKED-MAP-ITERATOR", 1, 0, false);
    //declareFunction(myName, "new_map_backed_map_iterator_state", "NEW-MAP-BACKED-MAP-ITERATOR-STATE", 1, 0, false);
    //declareFunction(myName, "map_backed_map_iterator_done", "MAP-BACKED-MAP-ITERATOR-DONE", 1, 0, false);
    //declareFunction(myName, "map_backed_map_iterator_next", "MAP-BACKED-MAP-ITERATOR-NEXT", 1, 0, false);
    declareFunction(myName, "map_object_arbitrary_key_backed_map_method", "MAP-OBJECT-ARBITRARY-KEY-BACKED-MAP-METHOD", 1, 0, false);
    //declareFunction(myName, "map_backed_map_arbitrary_key", "MAP-BACKED-MAP-ARBITRARY-KEY", 1, 0, false);
    //declareFunction(myName, "swap_out_all_pristine_backed_map_objects", "SWAP-OUT-ALL-PRISTINE-BACKED-MAP-OBJECTS", 1, 0, false);
    //declareFunction(myName, "get_backed_map_non_pristine_object_count", "GET-BACKED-MAP-NON-PRISTINE-OBJECT-COUNT", 1, 0, false);
    //declareFunction(myName, "test_file_vector_backed_map_with_alist", "TEST-FILE-VECTOR-BACKED-MAP-WITH-ALIST", 1, 1, false);
    //declareFunction(myName, "test_file_vector_backed_map", "TEST-FILE-VECTOR-BACKED-MAP", 1, 1, false);
    //declareFunction(myName, "test_enforce_map_specific_cache_ratios", "TEST-ENFORCE-MAP-SPECIFIC-CACHE-RATIOS", 3, 0, false);
    //declareFunction(myName, "test_map_to_file_vector_backed_map_conversion_with_alist", "TEST-MAP-TO-FILE-VECTOR-BACKED-MAP-CONVERSION-WITH-ALIST", 1, 1, false);
    //declareFunction(myName, "test_map_to_file_vector_backed_map_conversion", "TEST-MAP-TO-FILE-VECTOR-BACKED-MAP-CONVERSION", 1, 1, false);
    return NIL;
  }

  public static final SubLObject init_file_vector_utilities_file() {
    $show_file_vector_reference_payload_in_print$ = defparameter("*SHOW-FILE-VECTOR-REFERENCE-PAYLOAD-IN-PRINT*", NIL);
    $dtp_file_vector_reference$ = defconstant("*DTP-FILE-VECTOR-REFERENCE*", $sym4$FILE_VECTOR_REFERENCE);
    $cfasl_opcode_fvector_reference$ = defconstant("*CFASL-OPCODE-FVECTOR-REFERENCE*", $int29$69);
    $file_vector_backed_map_read_lock$ = defparameter("*FILE-VECTOR-BACKED-MAP-READ-LOCK*", NIL);
    $dtp_backed_map$ = defconstant("*DTP-BACKED-MAP*", $sym67$BACKED_MAP);
    $cfasl_opcode_backed_map$ = defconstant("*CFASL-OPCODE-BACKED-MAP*", $int95$76);
    $current_backed_map_cache_strategy$ = defparameter("*CURRENT-BACKED-MAP-CACHE-STRATEGY*", NIL);
    return NIL;
  }

  public static final SubLObject setup_file_vector_utilities_file() {
    // CVS_ID("Id: file-vector-utilities.lisp 126703 2008-12-17 22:27:48Z rck ");
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_file_vector_reference$.getGlobalValue(), Symbols.symbol_function($sym11$FILE_VECTOR_REFERENCE_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym12$FVECTOR_REF_INDEX, $sym13$_CSETF_FVECTOR_REF_INDEX);
    Structures.def_csetf($sym14$FVECTOR_REF_PAYLOAD, $sym15$_CSETF_FVECTOR_REF_PAYLOAD);
    Equality.identity($sym4$FILE_VECTOR_REFERENCE);
    cfasl.register_cfasl_input_function($cfasl_opcode_fvector_reference$.getGlobalValue(), $sym30$CFASL_INPUT_FILE_VECTOR_REFERENCE);
    Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), $dtp_file_vector_reference$.getGlobalValue(), Symbols.symbol_function($sym31$CFASL_OUTPUT_OBJECT_FILE_VECTOR_REFERENCE_METHOD));
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_backed_map$.getGlobalValue(), Symbols.symbol_function($sym74$BACKED_MAP_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym75$BACKED_MAP_MAP, $sym76$_CSETF_BACKED_MAP_MAP);
    Structures.def_csetf($sym77$BACKED_MAP_FVECTOR, $sym78$_CSETF_BACKED_MAP_FVECTOR);
    Structures.def_csetf($sym79$BACKED_MAP_COMMON_SYMBOLS, $sym80$_CSETF_BACKED_MAP_COMMON_SYMBOLS);
    Equality.identity($sym67$BACKED_MAP);
    cfasl.register_cfasl_input_function($cfasl_opcode_backed_map$.getGlobalValue(), $sym96$CFASL_INPUT_BACKED_MAP);
    Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), $dtp_backed_map$.getGlobalValue(), Symbols.symbol_function($sym97$CFASL_OUTPUT_OBJECT_BACKED_MAP_METHOD));
    Structures.register_method(map_utilities.$is_map_object_p_method_table$.getGlobalValue(), $dtp_backed_map$.getGlobalValue(), Symbols.symbol_function($sym100$IS_MAP_OBJECT_P_BACKED_MAP_METHOD));
    Structures.register_method(map_utilities.$map_object_size_method_table$.getGlobalValue(), $dtp_backed_map$.getGlobalValue(), Symbols.symbol_function($sym101$MAP_OBJECT_SIZE_BACKED_MAP_METHOD));
    Structures.register_method(map_utilities.$map_object_test_method_table$.getGlobalValue(), $dtp_backed_map$.getGlobalValue(), Symbols.symbol_function($sym102$MAP_OBJECT_TEST_BACKED_MAP_METHOD));
    Structures.register_method(map_utilities.$map_object_put_method_table$.getGlobalValue(), $dtp_backed_map$.getGlobalValue(), Symbols.symbol_function($sym103$MAP_OBJECT_PUT_BACKED_MAP_METHOD));
    Structures.register_method(map_utilities.$map_object_get_method_table$.getGlobalValue(), $dtp_backed_map$.getGlobalValue(), Symbols.symbol_function($sym104$MAP_OBJECT_GET_BACKED_MAP_METHOD));
    Structures.register_method(map_utilities.$map_object_get_without_values_method_table$.getGlobalValue(), $dtp_backed_map$.getGlobalValue(), Symbols.symbol_function($sym105$MAP_OBJECT_GET_WITHOUT_VALUES_BACKED_MAP_METHOD));
    Structures.register_method(map_utilities.$map_object_remove_method_table$.getGlobalValue(), $dtp_backed_map$.getGlobalValue(), Symbols.symbol_function($sym106$MAP_OBJECT_REMOVE_BACKED_MAP_METHOD));
    Structures.register_method(map_utilities.$map_object_remove_all_method_table$.getGlobalValue(), $dtp_backed_map$.getGlobalValue(), Symbols.symbol_function($sym107$MAP_OBJECT_REMOVE_ALL_BACKED_MAP_METHOD));
    Structures.register_method(map_utilities.$map_object_touch_method_table$.getGlobalValue(), $dtp_backed_map$.getGlobalValue(), Symbols.symbol_function($sym108$MAP_OBJECT_TOUCH_BACKED_MAP_METHOD));
    Structures.register_method(map_utilities.$new_map_object_with_same_properties_method_table$.getGlobalValue(), $dtp_backed_map$.getGlobalValue(), Symbols.symbol_function($sym109$NEW_MAP_OBJECT_WITH_SAME_PROPERTIES_BACKED_MAP_METHOD));
    Structures.register_method(map_utilities.$new_map_object_iterator_method_table$.getGlobalValue(), $dtp_backed_map$.getGlobalValue(), Symbols.symbol_function($sym112$NEW_MAP_OBJECT_ITERATOR_BACKED_MAP_METHOD));
    Structures.register_method(map_utilities.$map_object_arbitrary_key_method_table$.getGlobalValue(), $dtp_backed_map$.getGlobalValue(), Symbols.symbol_function($sym116$MAP_OBJECT_ARBITRARY_KEY_BACKED_MAP_METHOD));
    generic_testing.define_test_case_table_int($sym119$TEST_FILE_VECTOR_BACKED_MAP_WITH_ALIST, list(new SubLObject[] {$kw120$TEST, EQUALP, $kw121$OWNER, NIL, $kw122$CLASSES, NIL, $kw123$KB, $kw124$TINY, $kw125$WORKING_, T}), $list126);
    generic_testing.define_test_case_table_int($sym127$TEST_MAP_TO_FILE_VECTOR_BACKED_MAP_CONVERSION_WITH_ALIST, list(new SubLObject[] {$kw120$TEST, EQUAL, $kw121$OWNER, NIL, $kw122$CLASSES, NIL, $kw123$KB, $kw124$TINY, $kw125$WORKING_, T}), $list126);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $kw0$OUTPUT = makeKeyword("OUTPUT");
  public static final SubLString $str1$Unable_to_open__S = makeString("Unable to open ~S");
  public static final SubLList $list2 = list(makeSymbol("KEY"), makeSymbol("VALUE"));
  public static final SubLString $str3$Error__writing_file_vector_backin = makeString("Error, writing file vector backing for map is not contiguous: expected ~A, got ~A~%");
  public static final SubLSymbol $sym4$FILE_VECTOR_REFERENCE = makeSymbol("FILE-VECTOR-REFERENCE");
  public static final SubLSymbol $sym5$FILE_VECTOR_REFERENCE_P = makeSymbol("FILE-VECTOR-REFERENCE-P");
  public static final SubLList $list6 = list(makeSymbol("INDEX"), makeSymbol("PAYLOAD"));
  public static final SubLList $list7 = list(makeKeyword("INDEX"), makeKeyword("PAYLOAD"));
  public static final SubLList $list8 = list(makeSymbol("FVECTOR-REF-INDEX"), makeSymbol("FVECTOR-REF-PAYLOAD"));
  public static final SubLList $list9 = list(makeSymbol("_CSETF-FVECTOR-REF-INDEX"), makeSymbol("_CSETF-FVECTOR-REF-PAYLOAD"));
  public static final SubLSymbol $sym10$PRINT_FVECTOR_REF = makeSymbol("PRINT-FVECTOR-REF");
  public static final SubLSymbol $sym11$FILE_VECTOR_REFERENCE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("FILE-VECTOR-REFERENCE-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym12$FVECTOR_REF_INDEX = makeSymbol("FVECTOR-REF-INDEX");
  public static final SubLSymbol $sym13$_CSETF_FVECTOR_REF_INDEX = makeSymbol("_CSETF-FVECTOR-REF-INDEX");
  public static final SubLSymbol $sym14$FVECTOR_REF_PAYLOAD = makeSymbol("FVECTOR-REF-PAYLOAD");
  public static final SubLSymbol $sym15$_CSETF_FVECTOR_REF_PAYLOAD = makeSymbol("_CSETF-FVECTOR-REF-PAYLOAD");
  public static final SubLSymbol $kw16$INDEX = makeKeyword("INDEX");
  public static final SubLSymbol $kw17$PAYLOAD = makeKeyword("PAYLOAD");
  public static final SubLString $str18$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str19$__FILE_VECTOR_REF__ = makeString("#<FILE-VECTOR-REF #");
  public static final SubLString $str20$__ = makeString(" (");
  public static final SubLString $str21$__ = makeString(") ");
  public static final SubLString $str22$_ = makeString(">");
  public static final SubLString $str23$File_Vector_references_cannot_be_ = makeString("File Vector references cannot be zero.");
  public static final SubLString $str24$swapped_out = makeString("swapped out");
  public static final SubLString $str25$present___pristine = makeString("present & pristine");
  public static final SubLString $str26$present_but_mutated = makeString("present but mutated");
  public static final SubLString $str27$present_but_deleted = makeString("present but deleted");
  public static final SubLString $str28$invalid_state = makeString("invalid state");
  public static final SubLInteger $int29$69 = makeInteger(69);
  public static final SubLSymbol $sym30$CFASL_INPUT_FILE_VECTOR_REFERENCE = makeSymbol("CFASL-INPUT-FILE-VECTOR-REFERENCE");
  public static final SubLSymbol $sym31$CFASL_OUTPUT_OBJECT_FILE_VECTOR_REFERENCE_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-FILE-VECTOR-REFERENCE-METHOD");
  public static final SubLSymbol $sym32$DATA_STREAM_LOCK = makeUninternedSymbol("DATA-STREAM-LOCK");
  public static final SubLSymbol $sym33$CLET = makeSymbol("CLET");
  public static final SubLList $list34 = list(makeSymbol("*FILE-VECTOR-BACKED-MAP-READ-LOCK*"));
  public static final SubLSymbol $sym35$PIF = makeSymbol("PIF");
  public static final SubLSymbol $sym36$LOCK_P = makeSymbol("LOCK-P");
  public static final SubLSymbol $sym37$WITH_LOCK_HELD = makeSymbol("WITH-LOCK-HELD");
  public static final SubLSymbol $sym38$PROGN = makeSymbol("PROGN");
  public static final SubLList $list39 = list(list(makeSymbol("LOCK")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym40$_FILE_VECTOR_BACKED_MAP_READ_LOCK_ = makeSymbol("*FILE-VECTOR-BACKED-MAP-READ-LOCK*");
  public static final SubLSymbol $kw41$UNPROVIDED = makeKeyword("UNPROVIDED");
  public static final SubLSymbol $kw42$INPUT = makeKeyword("INPUT");
  public static final SubLSymbol $sym43$CACHE_STRATEGY_OR_SYMBOL_P = makeSymbol("CACHE-STRATEGY-OR-SYMBOL-P");
  public static final SubLString $str44$Invalid_state_transition___A_is_n = makeString("Invalid state transition: ~A is neither present, nor deleted nor swapped out.");
  public static final SubLSymbol $kw45$NOT_FOUND = makeKeyword("NOT-FOUND");
  public static final SubLSymbol $kw46$MUTATED = makeKeyword("MUTATED");
  public static final SubLSymbol $kw47$DELETED = makeKeyword("DELETED");
  public static final SubLSymbol $sym48$FILE_VECTOR_P = makeSymbol("FILE-VECTOR-P");
  public static final SubLSymbol $kw49$RECOVERED = makeKeyword("RECOVERED");
  public static final SubLList $list50 = list(list(makeSymbol("KEY"), makeSymbol("VALUE"), makeSymbol("MAP"), makeSymbol("FILE-VECTOR"), makeSymbol("&KEY"), makeSymbol("DONE"), makeSymbol("CACHE-STRATEGY")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list51 = list(makeKeyword("DONE"), makeKeyword("CACHE-STRATEGY"));
  public static final SubLSymbol $kw52$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw53$DONE = makeKeyword("DONE");
  public static final SubLSymbol $kw54$CACHE_STRATEGY = makeKeyword("CACHE-STRATEGY");
  public static final SubLSymbol $sym55$IMPL_VALUE = makeUninternedSymbol("IMPL-VALUE");
  public static final SubLSymbol $sym56$DO_MAP = makeSymbol("DO-MAP");
  public static final SubLSymbol $sym57$PUNLESS = makeSymbol("PUNLESS");
  public static final SubLSymbol $sym58$CAND = makeSymbol("CAND");
  public static final SubLSymbol $sym59$FILE_VECTOR_REFERENCE_DELETED_ = makeSymbol("FILE-VECTOR-REFERENCE-DELETED?");
  public static final SubLSymbol $sym60$CSETQ = makeSymbol("CSETQ");
  public static final SubLSymbol $sym61$FILE_VECTOR_BACKED_MAP_W__CACHE_GET = makeSymbol("FILE-VECTOR-BACKED-MAP-W/-CACHE-GET");
  public static final SubLSymbol $sym62$FILE_VECTOR_BACKED_MAP_ITERATOR_DONE = makeSymbol("FILE-VECTOR-BACKED-MAP-ITERATOR-DONE");
  public static final SubLSymbol $sym63$FILE_VECTOR_BACKED_MAP_ITERATOR_NEXT = makeSymbol("FILE-VECTOR-BACKED-MAP-ITERATOR-NEXT");
  public static final SubLList $list64 = list(makeSymbol("CURR-ITEM"), makeSymbol("ITERATOR"), makeSymbol("MAP"), makeSymbol("FILE-VECTOR"), makeSymbol("COMMON-SYMBOLS"), makeSymbol("CACHE-STRATEGY"));
  public static final SubLSymbol $kw65$ITERATION_HALTED_PREMATURELY = makeKeyword("ITERATION-HALTED-PREMATURELY");
  public static final SubLString $str66$Cannot_convert_a_file_backed_map_ = makeString("Cannot convert a file-backed map that is not all swapped in.");
  public static final SubLSymbol $sym67$BACKED_MAP = makeSymbol("BACKED-MAP");
  public static final SubLSymbol $sym68$BACKED_MAP_P = makeSymbol("BACKED-MAP-P");
  public static final SubLList $list69 = list(makeSymbol("MAP"), makeSymbol("FVECTOR"), makeSymbol("COMMON-SYMBOLS"));
  public static final SubLList $list70 = list(makeKeyword("MAP"), makeKeyword("FVECTOR"), makeKeyword("COMMON-SYMBOLS"));
  public static final SubLList $list71 = list(makeSymbol("BACKED-MAP-MAP"), makeSymbol("BACKED-MAP-FVECTOR"), makeSymbol("BACKED-MAP-COMMON-SYMBOLS"));
  public static final SubLList $list72 = list(makeSymbol("_CSETF-BACKED-MAP-MAP"), makeSymbol("_CSETF-BACKED-MAP-FVECTOR"), makeSymbol("_CSETF-BACKED-MAP-COMMON-SYMBOLS"));
  public static final SubLSymbol $sym73$PRINT_BACKED_MAP = makeSymbol("PRINT-BACKED-MAP");
  public static final SubLSymbol $sym74$BACKED_MAP_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("BACKED-MAP-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym75$BACKED_MAP_MAP = makeSymbol("BACKED-MAP-MAP");
  public static final SubLSymbol $sym76$_CSETF_BACKED_MAP_MAP = makeSymbol("_CSETF-BACKED-MAP-MAP");
  public static final SubLSymbol $sym77$BACKED_MAP_FVECTOR = makeSymbol("BACKED-MAP-FVECTOR");
  public static final SubLSymbol $sym78$_CSETF_BACKED_MAP_FVECTOR = makeSymbol("_CSETF-BACKED-MAP-FVECTOR");
  public static final SubLSymbol $sym79$BACKED_MAP_COMMON_SYMBOLS = makeSymbol("BACKED-MAP-COMMON-SYMBOLS");
  public static final SubLSymbol $sym80$_CSETF_BACKED_MAP_COMMON_SYMBOLS = makeSymbol("_CSETF-BACKED-MAP-COMMON-SYMBOLS");
  public static final SubLSymbol $kw81$MAP = makeKeyword("MAP");
  public static final SubLSymbol $kw82$FVECTOR = makeKeyword("FVECTOR");
  public static final SubLSymbol $kw83$COMMON_SYMBOLS = makeKeyword("COMMON-SYMBOLS");
  public static final SubLSymbol $sym84$MAP_P = makeSymbol("MAP-P");
  public static final SubLList $list85 = list(list(makeSymbol("BACKED-MAP")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym86$COMMON_SYMBOLS = makeUninternedSymbol("COMMON-SYMBOLS");
  public static final SubLSymbol $sym87$WITH_CFASL_COMMON_SYMBOLS_SIMPLE = makeSymbol("WITH-CFASL-COMMON-SYMBOLS-SIMPLE");
  public static final SubLString $str88$__ = makeString("#<");
  public static final SubLSymbol $kw89$STREAM = makeKeyword("STREAM");
  public static final SubLString $str90$_Map_ = makeString(" Map ");
  public static final SubLString $str91$_FVector_ = makeString(" FVector ");
  public static final SubLString $str92$_CFASL_ComSym_ = makeString(" CFASL ComSym ");
  public static final SubLString $str93$_ = makeString(" ");
  public static final SubLSymbol $kw94$BASE = makeKeyword("BASE");
  public static final SubLInteger $int95$76 = makeInteger(76);
  public static final SubLSymbol $sym96$CFASL_INPUT_BACKED_MAP = makeSymbol("CFASL-INPUT-BACKED-MAP");
  public static final SubLSymbol $sym97$CFASL_OUTPUT_OBJECT_BACKED_MAP_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-BACKED-MAP-METHOD");
  public static final SubLList $list98 = list(list(makeSymbol("STRATEGY")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym99$_CURRENT_BACKED_MAP_CACHE_STRATEGY_ = makeSymbol("*CURRENT-BACKED-MAP-CACHE-STRATEGY*");
  public static final SubLSymbol $sym100$IS_MAP_OBJECT_P_BACKED_MAP_METHOD = makeSymbol("IS-MAP-OBJECT-P-BACKED-MAP-METHOD");
  public static final SubLSymbol $sym101$MAP_OBJECT_SIZE_BACKED_MAP_METHOD = makeSymbol("MAP-OBJECT-SIZE-BACKED-MAP-METHOD");
  public static final SubLSymbol $sym102$MAP_OBJECT_TEST_BACKED_MAP_METHOD = makeSymbol("MAP-OBJECT-TEST-BACKED-MAP-METHOD");
  public static final SubLSymbol $sym103$MAP_OBJECT_PUT_BACKED_MAP_METHOD = makeSymbol("MAP-OBJECT-PUT-BACKED-MAP-METHOD");
  public static final SubLSymbol $sym104$MAP_OBJECT_GET_BACKED_MAP_METHOD = makeSymbol("MAP-OBJECT-GET-BACKED-MAP-METHOD");
  public static final SubLSymbol $sym105$MAP_OBJECT_GET_WITHOUT_VALUES_BACKED_MAP_METHOD = makeSymbol("MAP-OBJECT-GET-WITHOUT-VALUES-BACKED-MAP-METHOD");
  public static final SubLSymbol $sym106$MAP_OBJECT_REMOVE_BACKED_MAP_METHOD = makeSymbol("MAP-OBJECT-REMOVE-BACKED-MAP-METHOD");
  public static final SubLSymbol $sym107$MAP_OBJECT_REMOVE_ALL_BACKED_MAP_METHOD = makeSymbol("MAP-OBJECT-REMOVE-ALL-BACKED-MAP-METHOD");
  public static final SubLSymbol $sym108$MAP_OBJECT_TOUCH_BACKED_MAP_METHOD = makeSymbol("MAP-OBJECT-TOUCH-BACKED-MAP-METHOD");
  public static final SubLSymbol $sym109$NEW_MAP_OBJECT_WITH_SAME_PROPERTIES_BACKED_MAP_METHOD = makeSymbol("NEW-MAP-OBJECT-WITH-SAME-PROPERTIES-BACKED-MAP-METHOD");
  public static final SubLString $str110$The_test_of_the_interior_map__A_d = makeString("The test of the interior map ~A does not correspond to the provided test ~A.");
  public static final SubLString $str111$The_size_of_the_interior_map__A_d = makeString("The size of the interior map ~A does not correspond to the provided size ~A.");
  public static final SubLSymbol $sym112$NEW_MAP_OBJECT_ITERATOR_BACKED_MAP_METHOD = makeSymbol("NEW-MAP-OBJECT-ITERATOR-BACKED-MAP-METHOD");
  public static final SubLSymbol $sym113$MAP_BACKED_MAP_ITERATOR_DONE = makeSymbol("MAP-BACKED-MAP-ITERATOR-DONE");
  public static final SubLSymbol $sym114$MAP_BACKED_MAP_ITERATOR_NEXT = makeSymbol("MAP-BACKED-MAP-ITERATOR-NEXT");
  public static final SubLList $list115 = list(makeSymbol("BACKED-MAP"), makeSymbol("ITERATOR"), makeSymbol("CACHE-STRATEGY"));
  public static final SubLSymbol $sym116$MAP_OBJECT_ARBITRARY_KEY_BACKED_MAP_METHOD = makeSymbol("MAP-OBJECT-ARBITRARY-KEY-BACKED-MAP-METHOD");
  public static final SubLString $str117$Error_in_swap_out_algorithm___A_i = makeString("Error in swap-out algorithm: ~A is NOT a backed map.");
  public static final SubLString $str118$Error_in_non_pristine_object_coun = makeString("Error in non-pristine object count algorithm: ~A is NOT a backed map.");
  public static final SubLSymbol $sym119$TEST_FILE_VECTOR_BACKED_MAP_WITH_ALIST = makeSymbol("TEST-FILE-VECTOR-BACKED-MAP-WITH-ALIST");
  public static final SubLSymbol $kw120$TEST = makeKeyword("TEST");
  public static final SubLSymbol $kw121$OWNER = makeKeyword("OWNER");
  public static final SubLSymbol $kw122$CLASSES = makeKeyword("CLASSES");
  public static final SubLSymbol $kw123$KB = makeKeyword("KB");
  public static final SubLSymbol $kw124$TINY = makeKeyword("TINY");
  public static final SubLSymbol $kw125$WORKING_ = makeKeyword("WORKING?");
  public static final SubLList $list126 = list(list(list(list(cons(ONE_INTEGER, makeString("Eins")), cons(TWO_INTEGER, makeString("Zwei")), cons(THREE_INTEGER, makeString("Drei")), cons(FOUR_INTEGER, makeString("Vier"))), EQUAL), makeKeyword("SUCCESS")));
  public static final SubLSymbol $sym127$TEST_MAP_TO_FILE_VECTOR_BACKED_MAP_CONVERSION_WITH_ALIST = makeSymbol("TEST-MAP-TO-FILE-VECTOR-BACKED-MAP-CONVERSION-WITH-ALIST");
  public static final SubLString $str128$_tmp_ = makeString("/tmp/");
  public static final SubLString $str129$Key__A_should_be_in_the_map_but_i = makeString("Key ~A should be in the map but is not.");
  public static final SubLString $str130$The_value_for_the_key__A_is_missi = makeString("The value for the key ~A is missing altogether from the new map.");
  public static final SubLString $str131$The_old_value__A_does_not_match_t = makeString("The old value ~A does not match the new value ~A according to ~A.");
  public static final SubLString $str132$The_value_for_the_key__A_can_all_ = makeString("The value for the key ~A can all of a sudden no longer be found.");
  public static final SubLString $str133$The_accessing_of_the_value_for__A = makeString("The accessing of the value for ~A did not swap in the value.");
  public static final SubLString $str134$The_touching_of_the_object_did_no = makeString("The touching of the object did not mutate the object.");
  public static final SubLString $str135$Undoing_the_change_for_key__A_did = makeString("Undoing the change for key ~A did actually not succeed.");
  public static final SubLString $str136$The_modification_of_the_entry_for = makeString("The modification of the entry for ~A did not mutate anything.");
  public static final SubLString $str137$The_modified_entry_for__A_no_long = makeString("The modified entry for ~A no longer contains the new value ~A but rather ~A.");
  public static final SubLString $str138$The_stored_entry_for__A_is_not_a_ = makeString("The stored entry for ~A is not a present and mutated file vector reference.");
  public static final SubLSymbol $kw139$IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");
  public static final SubLSymbol $sym140$IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
  public static final SubLSymbol $kw141$SUCCESS = makeKeyword("SUCCESS");
  public static final SubLString $str142$_A_should_be_paged_in__but__A_are = makeString("~A should be paged in, but ~A are actually paged in.");
  public static final SubLString $str143$_A_should_be_paged_out__but__A_ar = makeString("~A should be paged out, but ~A are actually paged out.");
  public static final SubLSymbol $kw144$COPY_CONTENTS = makeKeyword("COPY-CONTENTS");
  public static final SubLList $list145 = list(makeSymbol("KEY"), makeSymbol("REFERENCE"));
  public static final SubLString $str146$The_entry_for__A_in_the_original_ = makeString("The entry for ~A in the original map is not a file vector reference.~%");
  public static final SubLString $str147$The_loaded_map_does_not_have_the_ = makeString("The loaded map does not have the same size as the original map: ~A =/= ~A~%");
  public static final SubLString $str148$The_entry_for__A_in_the_new_map_i = makeString("The entry for ~A in the new map is not a file vector reference.");
  public static final SubLList $list149 = list(makeSymbol("NEW-KEY"), makeUninternedSymbol("IMPL-VALUE"));
  public static final SubLString $str150$The_new_map_has_an_entry_for_key_ = makeString("The new map has an entry for key ~A while the old one has none.");
  public static final SubLString $str151$The_values_for_key__A_are_not_equ = makeString("The values for key ~A are not equal according to ~A: ~A =/= ~A (new =/= old).~%");
  public static final SubLSymbol $kw152$SUPPORT_UNDO = makeKeyword("SUPPORT-UNDO");
  public static final SubLString $str153$We_are_getting_the_removed_key__A = makeString("We are getting the removed key ~A returned to us with value ~A~%!");
  public static final SubLString $str154$We_are_not_getting_back_the_same_ = makeString("We are not getting back the same reference for ~A: we expected ~A and got ~A.");
  public static final SubLString $str155$We_visited__A_entries_but_we_shou = makeString("We visited ~A entries but we should have visited ~A entries.");

  //// Initializers

  public void declareFunctions() {
    declare_file_vector_utilities_file();
  }

  public void initializeVariables() {
    init_file_vector_utilities_file();
  }

  public void runTopLevelForms() {
    setup_file_vector_utilities_file();
  }

}
