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

package  com.cyc.tool.subl.jrtl.translatedCode_2.sublisp;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Alien;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public  final class foreign extends SubLTranslatedFile {

  //// Constructor

  private foreign() {}
  public static final SubLFile me = new foreign();
  public static final String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.foreign";

  //// Definitions

  @SubL(source = "sublisp/foreign.lisp", position = 783) 
  public static SubLSymbol $foreign_shared_library_lock$ = null;

  @SubL(source = "sublisp/foreign.lisp", position = 918) 
  public static SubLSymbol $char_pointer_idiom_declaration$ = null;

  @SubL(source = "sublisp/foreign.lisp", position = 993) 
  public static SubLSymbol $pointer_idiom_declaration$ = null;

  @SubL(source = "sublisp/foreign.lisp", position = 1052) 
  public static SubLSymbol $char_pointer_idiom_allegro$ = null;

  /** This is the list of foreign shared libraries that SL knows about. */
  @SubL(source = "sublisp/foreign.lisp", position = 1112) 
  public static SubLSymbol $foreign_shared_libraries$ = null;

  @SubL(source = "sublisp/foreign.lisp", position = 1223) 
  public static final SubLObject declare_foreign_shared_library(SubLObject moniker, SubLObject properties) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject pathname = conses_high.getf(properties, $kw4$FILENAME, NIL);
        SubLObject result = NIL;
        if ((NIL == pathname)) {
          Errors.error($str5$Foreign_shared_library_must_have_);
        }
        {
          SubLObject lock = $foreign_shared_library_lock$.getGlobalValue();
          SubLObject release = NIL;
          try {
            release = Locks.seize_lock(lock);
            if ((NIL != foreign_shared_library_p(moniker))) {
              edit_foreign_shared_library(moniker, properties);
            } else {
              $foreign_shared_libraries$.setDynamicValue(conses_high.acons(moniker, properties, $foreign_shared_libraries$.getDynamicValue(thread)), thread);
              result = $foreign_shared_libraries$.getDynamicValue(thread);
            }
          } finally {
            if ((NIL != release)) {
              Locks.release_lock(lock);
            }
          }
        }
        return result;
      }
    }
  }

  /** Find the moniker for the foreign shared library associated
   with the pathname given. */
  @SubL(source = "sublisp/foreign.lisp", position = 1810) 
  public static final SubLObject find_foreign_shared_library_by_pathname(SubLObject pathname) {
    {
      SubLObject tuple = NIL;
      SubLObject lock = $foreign_shared_library_lock$.getGlobalValue();
      SubLObject release = NIL;
      try {
        release = Locks.seize_lock(lock);
        tuple = find_foreign_shared_library_by_property($kw4$FILENAME, pathname, EQUAL);
      } finally {
        if ((NIL != release)) {
          Locks.release_lock(lock);
        }
      }
      return tuple;
    }
  }

  /** Find the pathname of the shared library with the moniker. */
  @SubL(source = "sublisp/foreign.lisp", position = 2136) 
  public static final SubLObject get_foreign_shared_library_pathname(SubLObject moniker) {
    return get_foreign_shared_library_property(moniker, $kw4$FILENAME, NIL);
  }

  /** Find the libraries that this shared library depends on. */
  @SubL(source = "sublisp/foreign.lisp", position = 2323) 
  public static final SubLObject get_foreign_shared_library_dependencies(SubLObject moniker) {
    return get_foreign_shared_library_property(moniker, $kw6$DEPENDS_ON, NIL);
  }

  /** Find any property of a foreign shared library. */
  @SubL(source = "sublisp/foreign.lisp", position = 2513) 
  public static final SubLObject get_foreign_shared_library_property(SubLObject moniker, SubLObject property, SubLObject v_default) {
    if ((v_default == UNPROVIDED)) {
      v_default = NIL;
    }
    {
      SubLObject tuple = NIL;
      SubLObject lock = $foreign_shared_library_lock$.getGlobalValue();
      SubLObject release = NIL;
      try {
        release = Locks.seize_lock(lock);
        tuple = find_foreign_shared_library_int(moniker);
      } finally {
        if ((NIL != release)) {
          Locks.release_lock(lock);
        }
      }
      {
        SubLObject properties = tuple.rest();
        return conses_high.getf(properties, property, v_default);
      }
    }
  }

  /** Is this moniker known to represent a shared library. */
  @SubL(source = "sublisp/foreign.lisp", position = 2866) 
  public static final SubLObject foreign_shared_library_p(SubLObject moniker) {
    return makeBoolean((NIL != get_foreign_shared_library_pathname(moniker)));
  }

  /** Unassociate all knowledge of the foreign shared library identified
   by the moniker. */
  @SubL(source = "sublisp/foreign.lisp", position = 3038) 
  public static final SubLObject undeclare_foreign_shared_library(SubLObject moniker) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject okP = NIL;
        SubLObject lock = $foreign_shared_library_lock$.getGlobalValue();
        SubLObject release = NIL;
        try {
          release = Locks.seize_lock(lock);
          if ((NIL != foreign_shared_library_p(moniker))) {
            {
              SubLObject tuple = find_foreign_shared_library_int(moniker);
              $foreign_shared_libraries$.setDynamicValue(Sequences.delete(tuple, $foreign_shared_libraries$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
              okP = T;
            }
          }
        } finally {
          if ((NIL != release)) {
            Locks.release_lock(lock);
          }
        }
        if ((NIL == okP)) {
          Errors.error($str7$_A_does_not_reference_a_known_for, moniker);
        }
        return okP;
      }
    }
  }

  @SubL(source = "sublisp/foreign.lisp", position = 3616) 
  public static final SubLObject all_foreign_shared_libraries() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return conses_high.copy_list($foreign_shared_libraries$.getDynamicValue(thread));
    }
  }

  @SubL(source = "sublisp/foreign.lisp", position = 3706) 
  public static final SubLObject foreign_shared_library_loadableP(SubLObject moniker) {
    {
      SubLObject pathname = get_foreign_shared_library_pathname(moniker);
      if ((NIL != pathname)) {
        return ((NIL != Filesys.probe_file(pathname)) ? ((SubLObject) T) : NIL);
      }
    }
    return NIL;
  }

  @SubL(source = "sublisp/foreign.lisp", position = 3916) 
  public static final SubLObject find_foreign_shared_library_by_property(SubLObject property, SubLObject value, SubLObject test) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject found = NIL;
        if ((NIL == found)) {
          {
            SubLObject csome_list_var = $foreign_shared_libraries$.getDynamicValue(thread);
            SubLObject libinfo = NIL;
            for (libinfo = csome_list_var.first(); (!(((NIL != found)
                  || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), libinfo = csome_list_var.first()) {
              {
                SubLObject moniker = libinfo.first();
                SubLObject properties = libinfo.rest();
                if ((NIL != Functions.funcall(test, value, conses_high.getf(properties, property, UNPROVIDED)))) {
                  found = moniker;
                }
              }
            }
          }
        }
        return found;
      }
    }
  }

  @SubL(source = "sublisp/foreign.lisp", position = 4302) 
  public static final SubLObject find_foreign_shared_library_int(SubLObject moniker) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return conses_high.assoc(moniker, $foreign_shared_libraries$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
    }
  }

  @SubL(source = "sublisp/foreign.lisp", position = 4406) 
  public static final SubLObject edit_foreign_shared_library(SubLObject moniker, SubLObject properties) {
    {
      SubLObject tuple = find_foreign_shared_library_int(moniker);
      if ((NIL != tuple)) {
        ConsesLow.rplacd(tuple, properties);
      }
    }
    return moniker;
  }

  @SubL(source = "sublisp/foreign.lisp", position = 4601) 
  public static SubLSymbol $active_foreign_shared_library_lock$ = null;

  /** This is the list of monikers foreign shared libraries that SL maintains itself (beyond
   the ones that the system has itself and that are currently loaded. */
  @SubL(source = "sublisp/foreign.lisp", position = 4779) 
  public static SubLSymbol $active_foreign_shared_libraries$ = null;

  /** Return T iff the file associated with the shared library
   declared by MONIKER is accessible */
  @SubL(source = "sublisp/foreign.lisp", position = 4988) 
  public static final SubLObject foreign_shared_library_accessibleP(SubLObject moniker) {
    return Filesys.probe_file(get_foreign_shared_library_pathname(moniker));
  }

  /** Given the moniker fo a previously declared shared library, load the 
   associated foreign shared library into the system, using the options
   passed in. */
  @SubL(source = "sublisp/foreign.lisp", position = 5210) 
  public static final SubLObject load_foreign_shared_library(SubLObject moniker, SubLObject options) {
    if ((options == UNPROVIDED)) {
      options = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject pathname = get_foreign_shared_library_pathname(moniker);
        if ((NIL == pathname)) {
          Errors.error($str9$_S_is_not_associated_with_any_for, moniker);
        }
        {
          SubLObject lock = $active_foreign_shared_library_lock$.getGlobalValue();
          SubLObject release = NIL;
          try {
            release = Locks.seize_lock(lock);
            if ((NIL != foreign_shared_library_loadedP(moniker))) {
              Errors.warn($str10$Shared_library__S___S__is_already, moniker, pathname);
            } else {
              load_shared_library_int(moniker, pathname, options);
              $active_foreign_shared_libraries$.setDynamicValue(cons(moniker, $active_foreign_shared_libraries$.getDynamicValue(thread)), thread);
            }
          } finally {
            if ((NIL != release)) {
              Locks.release_lock(lock);
            }
          }
        }
        return moniker;
      }
    }
  }

  /** Ensure that a foreign shared library is ready for use. */
  @SubL(source = "sublisp/foreign.lisp", position = 5971) 
  public static final SubLObject ensure_foreign_shared_library_loaded(SubLObject moniker, SubLObject options) {
    if ((options == UNPROVIDED)) {
      options = NIL;
    }
    if ((NIL == foreign_shared_library_loaded_intP(moniker))) {
      {
        SubLObject lock = $active_foreign_shared_library_lock$.getGlobalValue();
        SubLObject release = NIL;
        try {
          release = Locks.seize_lock(lock);
          if ((NIL == foreign_shared_library_loadedP(moniker))) {
            {
              SubLObject dependencies = get_foreign_shared_library_dependencies(moniker);
              SubLObject cdolist_list_var = dependencies;
              SubLObject dependency = NIL;
              for (dependency = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), dependency = cdolist_list_var.first()) {
                ensure_foreign_shared_library_loaded(dependency, UNPROVIDED);
              }
            }
            load_foreign_shared_library(moniker, options);
          }
        } finally {
          if ((NIL != release)) {
            Locks.release_lock(lock);
          }
        }
      }
    }
    return moniker;
  }

  /** Is this shared libary already loaded into the system? */
  @SubL(source = "sublisp/foreign.lisp", position = 6608) 
  public static final SubLObject foreign_shared_library_loadedP(SubLObject moniker) {
    {
      SubLObject result = NIL;
      SubLObject lock = $active_foreign_shared_library_lock$.getGlobalValue();
      SubLObject release = NIL;
      try {
        release = Locks.seize_lock(lock);
        result = foreign_shared_library_loaded_intP(moniker);
      } finally {
        if ((NIL != release)) {
          Locks.release_lock(lock);
        }
      }
      return result;
    }
  }

  @SubL(source = "sublisp/foreign.lisp", position = 6879) 
  public static final SubLObject unload_foreign_shared_library(SubLObject moniker) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject success = NIL;
        SubLObject lock = $active_foreign_shared_library_lock$.getGlobalValue();
        SubLObject release = NIL;
        try {
          release = Locks.seize_lock(lock);
          if ((NIL != foreign_shared_library_loadedP(moniker))) {
            {
              SubLObject pathname = get_foreign_shared_library_pathname(moniker);
              unload_shared_library_int(moniker, pathname);
            }
            $active_foreign_shared_libraries$.setDynamicValue(Sequences.delete(moniker, $active_foreign_shared_libraries$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            success = T;
          }
        } finally {
          if ((NIL != release)) {
            Locks.release_lock(lock);
          }
        }
        if ((NIL == success)) {
          if ((NIL != foreign_shared_library_p(moniker))) {
            Errors.error($str11$_S_does_not_designate_one_of_the_, moniker, all_foreign_shared_libraries());
          } else {
            Errors.error($str12$_S_does_not_designate_a_known_sha, moniker);
          }
        }
        return success;
      }
    }
  }

  @SubL(source = "sublisp/foreign.lisp", position = 7660) 
  public static final SubLObject foreign_shared_library_installedP(SubLObject moniker) {
    return makeBoolean(((NIL != foreign_shared_library_loadedP(moniker))
          || (NIL != foreign_shared_library_loadableP(moniker))));
  }

  /** Fan out into the separate implementations. */
  @SubL(source = "sublisp/foreign.lisp", position = 7825) 
  public static final SubLObject load_shared_library_int(SubLObject moniker, SubLObject pathname, SubLObject options) {
    return Alien.load_shared_object(moniker, pathname, options);
  }

  @SubL(source = "sublisp/foreign.lisp", position = 8180) 
  public static final SubLObject unload_shared_library_int(SubLObject moniker, SubLObject pathname) {
    return Alien.unload_shared_object(moniker);
  }

  @SubL(source = "sublisp/foreign.lisp", position = 8565) 
  public static final SubLObject foreign_shared_library_loaded_intP(SubLObject moniker) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean((NIL != conses_high.member(moniker, $active_foreign_shared_libraries$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)));
    }
  }

  @SubL(source = "sublisp/foreign.lisp", position = 8696) 
  public static final SubLObject return_type_string_p(SubLObject return_type) {
    if ((!((return_type.isList()
           && Sequences.length(return_type).numG(ONE_INTEGER))))) {
      return NIL;
    }
    return makeBoolean(($char_pointer_idiom_declaration$.getGlobalValue().first().equal(return_type.first())
           && conses_high.second($char_pointer_idiom_declaration$.getGlobalValue()).equal(conses_high.second(return_type))));
  }

  @SubL(source = "sublisp/foreign.lisp", position = 8977) 
  public static final SubLObject return_type_pointer_p(SubLObject return_type) {
    if ((NIL != return_type_string_p(return_type))) {
      return T;
    }
    if ((!((return_type.isList()
           && Sequences.length(return_type).numG(ONE_INTEGER))))) {
      return NIL;
    }
    return makeBoolean(($pointer_idiom_declaration$.getGlobalValue().first().equal(return_type.first())
           && conses_high.second($pointer_idiom_declaration$.getGlobalValue()).equal(conses_high.second(return_type))));
  }

  @SubL(source = "sublisp/foreign.lisp", position = 9300) 
  public static final SubLObject default_return_value(SubLObject return_type) {
    if ((NIL == return_type_pointer_p(return_type))) {
      return NIL;
    }
    if (Sequences.length(return_type).numL(THREE_INTEGER)) {
      return NIL;
    }
    return conses_high.third(return_type);
  }

  @SubL(source = "sublisp/foreign.lisp", position = 9479) 
  public static final SubLObject make_helper_function_symbol(SubLObject symbol, SubLObject return_type) {
    if ((NIL != return_type_pointer_p(return_type))) {
      return Symbols.make_symbol(Sequences.cconcatenate(Symbols.symbol_name(symbol), $str13$_));
    }
    return symbol;
  }

  @SubL(source = "sublisp/foreign.lisp", position = 9669) 
  public static final SubLObject define_foreign_function(SubLObject macroform, SubLObject environment) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject datum = macroform.rest();
        SubLObject current = datum;
        SubLObject symbol = NIL;
        SubLObject arglist = NIL;
        SubLObject rules = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list14);
        symbol = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list14);
        arglist = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list14);
        rules = current.first();
        current = current.rest();
        if ((NIL == current)) {
          checkType(symbol, $sym15$SYMBOLP);
          checkType(arglist, $sym16$LISTP);
          checkType(rules, $sym16$LISTP);
          thread.resetMultipleValues();
          {
            SubLObject calling_convention = analyze_define_foreign_function_arguments(symbol, arglist, rules);
            SubLObject foreign_shared_library = thread.secondMultipleValue();
            SubLObject foreign_name = thread.thirdMultipleValue();
            SubLObject arg_conversion = thread.fourthMultipleValue();
            SubLObject return_type = thread.fifthMultipleValue();
            thread.resetMultipleValues();
            return define_foreign_function_internal(symbol, arglist, calling_convention, foreign_shared_library, foreign_name, arg_conversion, return_type);
          }
        } else {
          cdestructuring_bind.cdestructuring_bind_error(datum, $list14);
        }
      }
      return NIL;
    }
  }

  @SubL(source = "sublisp/foreign.lisp", position = 10911) 
  public static final SubLObject analyze_define_foreign_function_arguments(SubLObject symbol, SubLObject arglist, SubLObject rules) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject datum = rules;
        SubLObject current = datum;
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_1 = NIL;
        for (; (NIL != rest); ) {
          cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list17);
          current_1 = rest.first();
          rest = rest.rest();
          cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list17);
          if ((NIL == conses_high.member(current_1, $list18, UNPROVIDED, UNPROVIDED))) {
            bad = T;
          }
          if ((current_1 == $kw19$ALLOW_OTHER_KEYS)) {
            allow_other_keys_p = rest.first();
          }
          rest = rest.rest();
        }
        if (((NIL != bad)
             && (NIL == allow_other_keys_p))) {
          cdestructuring_bind.cdestructuring_bind_error(datum, $list17);
        }
        {
          SubLObject calling_convention_tail = cdestructuring_bind.property_list_member($kw20$CALLING_CONVENTION, current);
          SubLObject calling_convention = ((NIL != calling_convention_tail) ? ((SubLObject) conses_high.cadr(calling_convention_tail)) : $kw21$C);
          SubLObject foreign_shared_library_tail = cdestructuring_bind.property_list_member($kw22$FOREIGN_SHARED_LIBRARY, current);
          SubLObject foreign_shared_library = ((NIL != foreign_shared_library_tail) ? ((SubLObject) conses_high.cadr(foreign_shared_library_tail)) : NIL);
          SubLObject foreign_name_tail = cdestructuring_bind.property_list_member($kw23$FOREIGN_NAME, current);
          SubLObject foreign_name = ((NIL != foreign_name_tail) ? ((SubLObject) conses_high.cadr(foreign_name_tail)) : NIL);
          SubLObject arg_conversion_tail = cdestructuring_bind.property_list_member($kw24$ARG_CONVERSION, current);
          SubLObject arg_conversion = ((NIL != arg_conversion_tail) ? ((SubLObject) conses_high.cadr(arg_conversion_tail)) : NIL);
          SubLObject return_type_tail = cdestructuring_bind.property_list_member($kw25$RETURN_TYPE, current);
          SubLObject return_type = ((NIL != return_type_tail) ? ((SubLObject) conses_high.cadr(return_type_tail)) : $kw26$VOID);
          if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
            if ((calling_convention != $kw21$C)) {
              Errors.error($str27$Currently__only_calling_conventio);
            }
          }
          if ((NIL == foreign_name)) {
            foreign_name = generate_foreign_name_from_sublisp_symbol(calling_convention, symbol);
          }
          if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
            if ((!(foreign_name.isString()))) {
              Errors.error($str28$_FOREIGN_NAME_expects_STRING__not, foreign_name);
            }
          }
          if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
            if ((!(Sequences.length(arglist).numE(Sequences.length(arg_conversion))))) {
              Errors.error($str29$The_argument_list__S_and_the__ARG, arglist, arg_conversion);
            }
          }
          if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
            if ((NIL == valid_arg_conversion_pattern(arg_conversion))) {
              Errors.error($str30$_S_is_not_a_valid__ARG_CONVERSION, arg_conversion);
            }
          }
          if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
            if ((!((return_type.isKeyword()
                  || return_type.isList())))) {
              Errors.error($str31$_S_is_not_a_valid__RETURN_TYPE_ar, return_type);
            }
          }
          return Values.values(calling_convention, foreign_shared_library, foreign_name, arg_conversion, return_type);
        }
      }
    }
  }

  @SubL(source = "sublisp/foreign.lisp", position = 13607) 
  public static final SubLObject generate_foreign_name_from_sublisp_symbol(SubLObject calling_convention, SubLObject symbol) {
    {
      SubLObject pcase_var = calling_convention;
      if (pcase_var.eql($kw21$C)) {
        return Strings.string_downcase(Symbols.symbol_name(symbol), UNPROVIDED, UNPROVIDED);
      } else {
        Errors.error($str32$Do_not_know_how_to_generate_a_for, symbol, calling_convention);
      }
    }
    return NIL;
  }

  /** @stub */
  @SubL(source = "sublisp/foreign.lisp", position = 13918) 
  public static final SubLObject valid_arg_conversion_pattern(SubLObject arg_conversion) {
    return Types.listp(arg_conversion);
  }

  /** @hack: do better here eventually */
  @SubL(source = "sublisp/foreign.lisp", position = 14016) 
  public static final SubLObject ffuncall(SubLObject macroform, SubLObject environment) {
    {
      SubLObject datum = macroform.rest();
      SubLObject current = datum;
      SubLObject symbol = NIL;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list33);
      symbol = current.first();
      current = current.rest();
      {
        SubLObject args = current;
        return listS($sym34$FUNCALL, symbol, ConsesLow.append(args, NIL));
      }
    }
  }

  @SubL(source = "sublisp/foreign.lisp", position = 14129) 
  public static final SubLObject make_dummy_arg_list(SubLObject arglist) {
    return arglist;
  }

  @SubL(source = "sublisp/foreign.lisp", position = 14259) 
  public static final SubLObject define_foreign_function_internal(SubLObject symbol, SubLObject arglist, SubLObject calling_convention, SubLObject foreign_shared_library, SubLObject foreign_name, SubLObject arg_conversion, SubLObject return_type) {
    {
      SubLObject ret_type = (return_type.isList() ? ((SubLObject) return_type.first()) : NIL);
      SubLObject symbol_ff = make_helper_function_symbol(symbol, return_type);
      SubLObject default_return_value = default_return_value(return_type);
      SubLObject main_function = list($sym35$DEF_FOREIGN_FUNCTION, foreign_shared_library, foreign_name, list($sym36$QUOTE, symbol_ff), list($sym36$QUOTE, arg_conversion), list($sym36$QUOTE, ret_type), calling_convention, default_return_value);
      if ((!(symbol.equal(symbol_ff)))) {
        {
          SubLObject dummy_arglist = make_dummy_arg_list(arglist);
          SubLObject retit = list($sym37$PROGN, main_function, list($sym38$DEFINE, symbol, dummy_arglist, list($sym39$CLET, list(list($sym40$_VAL, listS($sym41$FFUNCALL, list($sym36$QUOTE, symbol_ff), ConsesLow.append(dummy_arglist, NIL)))), listS($sym42$PIF, $list43, list($sym44$RET, default_return_value), $list45))));
          return retit;
        }
      } else {
        return main_function;
      }
    }
  }

  @SubL(source = "sublisp/foreign.lisp", position = 15537) 
  public static final SubLObject vector_for_marshalling(SubLObject size, SubLObject type, SubLObject initial_value) {
    return Vectors.make_vector(size, initial_value);
  }

  public static final SubLObject declare_foreign_file() {
    declareFunction("declare_foreign_shared_library", "DECLARE-FOREIGN-SHARED-LIBRARY", 2, 0, false);
    declareFunction("find_foreign_shared_library_by_pathname", "FIND-FOREIGN-SHARED-LIBRARY-BY-PATHNAME", 1, 0, false);
    declareFunction("get_foreign_shared_library_pathname", "GET-FOREIGN-SHARED-LIBRARY-PATHNAME", 1, 0, false);
    declareFunction("get_foreign_shared_library_dependencies", "GET-FOREIGN-SHARED-LIBRARY-DEPENDENCIES", 1, 0, false);
    declareFunction("get_foreign_shared_library_property", "GET-FOREIGN-SHARED-LIBRARY-PROPERTY", 2, 1, false);
    declareFunction("foreign_shared_library_p", "FOREIGN-SHARED-LIBRARY-P", 1, 0, false);
    declareFunction("undeclare_foreign_shared_library", "UNDECLARE-FOREIGN-SHARED-LIBRARY", 1, 0, false);
    declareFunction("all_foreign_shared_libraries", "ALL-FOREIGN-SHARED-LIBRARIES", 0, 0, false);
    declareFunction("foreign_shared_library_loadableP", "FOREIGN-SHARED-LIBRARY-LOADABLE?", 1, 0, false);
    declareFunction("find_foreign_shared_library_by_property", "FIND-FOREIGN-SHARED-LIBRARY-BY-PROPERTY", 2, 1, false);
    declareFunction("find_foreign_shared_library_int", "FIND-FOREIGN-SHARED-LIBRARY-INT", 1, 0, false);
    declareFunction("edit_foreign_shared_library", "EDIT-FOREIGN-SHARED-LIBRARY", 2, 0, false);
    declareFunction("foreign_shared_library_accessibleP", "FOREIGN-SHARED-LIBRARY-ACCESSIBLE?", 1, 0, false);
    declareFunction("load_foreign_shared_library", "LOAD-FOREIGN-SHARED-LIBRARY", 1, 1, false);
    declareFunction("ensure_foreign_shared_library_loaded", "ENSURE-FOREIGN-SHARED-LIBRARY-LOADED", 1, 1, false);
    declareFunction("foreign_shared_library_loadedP", "FOREIGN-SHARED-LIBRARY-LOADED?", 1, 0, false);
    declareFunction("unload_foreign_shared_library", "UNLOAD-FOREIGN-SHARED-LIBRARY", 1, 0, false);
    declareFunction("foreign_shared_library_installedP", "FOREIGN-SHARED-LIBRARY-INSTALLED?", 1, 0, false);
    declareFunction("load_shared_library_int", "LOAD-SHARED-LIBRARY-INT", 3, 0, false);
    declareFunction("unload_shared_library_int", "UNLOAD-SHARED-LIBRARY-INT", 2, 0, false);
    declareFunction("foreign_shared_library_loaded_intP", "FOREIGN-SHARED-LIBRARY-LOADED-INT?", 1, 0, false);
    declareFunction("return_type_string_p", "RETURN-TYPE-STRING-P", 1, 0, false);
    declareFunction("return_type_pointer_p", "RETURN-TYPE-POINTER-P", 1, 0, false);
    declareFunction("default_return_value", "DEFAULT-RETURN-VALUE", 1, 0, false);
    declareFunction("make_helper_function_symbol", "MAKE-HELPER-FUNCTION-SYMBOL", 2, 0, false);
    declareMacro("define_foreign_function", "DEFINE-FOREIGN-FUNCTION");
    declareFunction("analyze_define_foreign_function_arguments", "ANALYZE-DEFINE-FOREIGN-FUNCTION-ARGUMENTS", 3, 0, false);
    declareFunction("generate_foreign_name_from_sublisp_symbol", "GENERATE-FOREIGN-NAME-FROM-SUBLISP-SYMBOL", 2, 0, false);
    declareFunction("valid_arg_conversion_pattern", "VALID-ARG-CONVERSION-PATTERN", 1, 0, false);
    declareMacro("ffuncall", "FFUNCALL");
    declareFunction("make_dummy_arg_list", "MAKE-DUMMY-ARG-LIST", 1, 0, false);
    declareFunction("define_foreign_function_internal", "DEFINE-FOREIGN-FUNCTION-INTERNAL", 7, 0, false);
    declareFunction("vector_for_marshalling", "VECTOR-FOR-MARSHALLING", 3, 0, false);
    return NIL;
  }

  public static final SubLObject init_foreign_file() {
    $foreign_shared_library_lock$ = deflexical("*FOREIGN-SHARED-LIBRARY-LOCK*", Locks.make_lock($str0$Foreign_Shared_Libraries_Lock));
    $char_pointer_idiom_declaration$ = deflexical("*CHAR-POINTER-IDIOM-DECLARATION*", $list1);
    $pointer_idiom_declaration$ = deflexical("*POINTER-IDIOM-DECLARATION*", $list2);
    $char_pointer_idiom_allegro$ = deflexical("*CHAR-POINTER-IDIOM-ALLEGRO*", $list3);
    $foreign_shared_libraries$ = defvar("*FOREIGN-SHARED-LIBRARIES*", NIL);
    $active_foreign_shared_library_lock$ = deflexical("*ACTIVE-FOREIGN-SHARED-LIBRARY-LOCK*", Locks.make_lock($str8$Active_Foreign_Shared_Libraries));
    $active_foreign_shared_libraries$ = defvar("*ACTIVE-FOREIGN-SHARED-LIBRARIES*", NIL);
    return NIL;
  }

  public static final SubLObject setup_foreign_file() {
        return NIL;
  }

  //// Internal Constants

  public static final SubLString $str0$Foreign_Shared_Libraries_Lock = makeString("Foreign Shared Libraries Lock");
  public static final SubLList $list1 = list(list(makeKeyword("POINTER"), makeKeyword("CHAR")), makeKeyword("STRING"));
  public static final SubLList $list2 = list(makeKeyword("OPAQUE"), makeKeyword("ALIEN"));
  public static final SubLList $list3 = list(makeKeyword("INT32"), makeKeyword("FIXNUM"));
  public static final SubLSymbol $kw4$FILENAME = makeKeyword("FILENAME");
  public static final SubLString $str5$Foreign_shared_library_must_have_ = makeString("Foreign shared library must have :FILENAME property.");
  public static final SubLSymbol $kw6$DEPENDS_ON = makeKeyword("DEPENDS-ON");
  public static final SubLString $str7$_A_does_not_reference_a_known_for = makeString("~A does not reference a known foreign shared library.");
  public static final SubLString $str8$Active_Foreign_Shared_Libraries = makeString("Active Foreign Shared Libraries");
  public static final SubLString $str9$_S_is_not_associated_with_any_for = makeString("~S is not associated with any foreign shared library.");
  public static final SubLString $str10$Shared_library__S___S__is_already = makeString("Shared library ~S (~S) is already loaded.");
  public static final SubLString $str11$_S_does_not_designate_one_of_the_ = makeString("~S does not designate one of the libraries (~S) currently loaded.");
  public static final SubLString $str12$_S_does_not_designate_a_known_sha = makeString("~S does not designate a known shared library.");
  public static final SubLString $str13$_ = makeString("%");
  public static final SubLList $list14 = list(makeSymbol("SYMBOL"), makeSymbol("ARGLIST"), makeSymbol("RULES"));
  public static final SubLSymbol $sym15$SYMBOLP = makeSymbol("SYMBOLP");
  public static final SubLSymbol $sym16$LISTP = makeSymbol("LISTP");
  public static final SubLList $list17 = list(makeSymbol("&KEY"), list(makeSymbol("CALLING-CONVENTION"), makeKeyword("C")), makeSymbol("FOREIGN-SHARED-LIBRARY"), makeSymbol("FOREIGN-NAME"), makeSymbol("ARG-CONVERSION"), list(makeSymbol("RETURN-TYPE"), makeKeyword("VOID")));
  public static final SubLList $list18 = list(makeKeyword("CALLING-CONVENTION"), makeKeyword("FOREIGN-SHARED-LIBRARY"), makeKeyword("FOREIGN-NAME"), makeKeyword("ARG-CONVERSION"), makeKeyword("RETURN-TYPE"));
  public static final SubLSymbol $kw19$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw20$CALLING_CONVENTION = makeKeyword("CALLING-CONVENTION");
  public static final SubLSymbol $kw21$C = makeKeyword("C");
  public static final SubLSymbol $kw22$FOREIGN_SHARED_LIBRARY = makeKeyword("FOREIGN-SHARED-LIBRARY");
  public static final SubLSymbol $kw23$FOREIGN_NAME = makeKeyword("FOREIGN-NAME");
  public static final SubLSymbol $kw24$ARG_CONVERSION = makeKeyword("ARG-CONVERSION");
  public static final SubLSymbol $kw25$RETURN_TYPE = makeKeyword("RETURN-TYPE");
  public static final SubLSymbol $kw26$VOID = makeKeyword("VOID");
  public static final SubLString $str27$Currently__only_calling_conventio = makeString("Currently, only calling-convention :C is supported.");
  public static final SubLString $str28$_FOREIGN_NAME_expects_STRING__not = makeString(":FOREIGN-NAME expects STRING, not ~S.");
  public static final SubLString $str29$The_argument_list__S_and_the__ARG = makeString("The argument list ~S and the :ARG-CONVERSION pattern ~S appear malaligned.");
  public static final SubLString $str30$_S_is_not_a_valid__ARG_CONVERSION = makeString("~S is not a valid :ARG-CONVERSION argument.");
  public static final SubLString $str31$_S_is_not_a_valid__RETURN_TYPE_ar = makeString("~S is not a valid :RETURN-TYPE argument.");
  public static final SubLString $str32$Do_not_know_how_to_generate_a_for = makeString("Do not know how to generate a foreign name from ~S for ~S.");
  public static final SubLList $list33 = list(makeSymbol("SYMBOL"), makeSymbol("&REST"), makeSymbol("ARGS"));
  public static final SubLSymbol $sym34$FUNCALL = makeSymbol("FUNCALL");
  public static final SubLSymbol $sym35$DEF_FOREIGN_FUNCTION = makeSymbol("DEF-FOREIGN-FUNCTION");
  public static final SubLSymbol $sym36$QUOTE = makeSymbol("QUOTE");
  public static final SubLSymbol $sym37$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $sym38$DEFINE = makeSymbol("DEFINE");
  public static final SubLSymbol $sym39$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym40$_VAL = makeSymbol("%VAL");
  public static final SubLSymbol $sym41$FFUNCALL = makeSymbol("FFUNCALL");
  public static final SubLSymbol $sym42$PIF = makeSymbol("PIF");
  public static final SubLList $list43 = list(makeSymbol("ALIEN-NULL-PTR?"), makeSymbol("%VAL"), makeKeyword("C"));
  public static final SubLSymbol $sym44$RET = makeSymbol("RET");
  public static final SubLList $list45 = list(list(makeSymbol("RET"), makeSymbol("%VAL")));

  //// Initializers

  public void declareFunctions() {
    declare_foreign_file();
  }

  public void initializeVariables() {
    init_foreign_file();
  }

  public void runTopLevelForms() {
    setup_foreign_file();
  }

}
