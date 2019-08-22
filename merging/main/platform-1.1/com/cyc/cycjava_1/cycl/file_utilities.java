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
//dm import com.cyc.cycjava_1.cycl.accumulation;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.format_nil;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.meta_macros;
//dm import com.cyc.cycjava_1.cycl.number_utilities;
//dm import com.cyc.cycjava_1.cycl.numeric_date_utilities;
//dm import com.cyc.cycjava_1.cycl.os_process_utilities;
//dm import com.cyc.cycjava_1.cycl.red_infrastructure_macros;
//dm import com.cyc.cycjava_1.cycl.string_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.system_info;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class file_utilities extends SubLTranslatedFile {

  //// Constructor

  private file_utilities() {}
  public static final SubLFile me = new file_utilities();
  public static final String myName = "com.cyc.cycjava_1.cycl.file_utilities";

  //// Definitions

  /** construct a full filename relative to the *CYC-HOME-DIRECTORY*
SUBDIRECTORY-LIST is the relative subdirectory
FILENAME and EXTENSION are used for the file in the directory */
  @SubL(source = "cycl/file-utilities.lisp", position = 3776) 
  public static final SubLObject cyc_home_filename(SubLObject subdirectory_list, SubLObject filename, SubLObject extension) {
    if ((extension == UNPROVIDED)) {
      extension = NIL;
    }
    checkType(subdirectory_list, $sym14$LISTP);
    return relative_filename(system_info.$cyc_home_directory$.getGlobalValue(), Filesys.construct_filename(subdirectory_list, filename, extension, T), UNPROVIDED);
  }

  /** construct a pathname relative to the *CYC-HOME-DIRECTORY*
SUBDIRECTORY-LIST is the relative subdirectory */
  @SubL(source = "cycl/file-utilities.lisp", position = 4182) 
  public static final SubLObject cyc_home_subdirectory(SubLObject subdirectory_list) {
    checkType(subdirectory_list, $sym14$LISTP);
    return relative_filename(system_info.$cyc_home_directory$.getGlobalValue(), Filesys.construct_filename(subdirectory_list, $str15$, NIL, T), UNPROVIDED);
  }

  /** construct a full filename relative to the DIRECTORY-STRING from FILENAME and EXTENSION
DIRECTORY-STRING should include the appropriate directory separator character at the end */
  @SubL(source = "cycl/file-utilities.lisp", position = 4484) 
  public static final SubLObject relative_filename(SubLObject directory_string, SubLObject filename, SubLObject extension) {
    if ((extension == UNPROVIDED)) {
      extension = NIL;
    }
    checkType(directory_string, $sym16$STRINGP);
    return Sequences.cconcatenate(directory_string, basic_filename(filename, extension));
  }

  /** construct a filename with no directory component from FILENAME and EXTENSION */
  @SubL(source = "cycl/file-utilities.lisp", position = 4865) 
  public static final SubLObject basic_filename(SubLObject filename, SubLObject extension) {
    if ((extension == UNPROVIDED)) {
      extension = NIL;
    }
    if ((NIL == extension)) {
      return filename;
    }
    return Filesys.construct_filename(NIL, filename, extension, T);
  }

  /** A directory to which Cyc can write temporary files. */
  @SubL(source = "cycl/file-utilities.lisp", position = 5240) 
  private static SubLSymbol $temp_directory$ = null;

  @SubL(source = "cycl/file-utilities.lisp", position = 5399) 
  public static final SubLObject temp_directory() {
    return $temp_directory$.getGlobalValue();
  }

  @SubL(source = "cycl/file-utilities.lisp", position = 5459) 
  private static SubLSymbol $random_path_chars$ = null;

  /** Like @xref probe-file except does not error on an invalid filename. */
  @SubL(source = "cycl/file-utilities.lisp", position = 22771) 
  public static final SubLObject file_existsP(SubLObject filename) {
    {
      SubLObject existsP = NIL;
      SubLObject ignore_errors_tag = NIL;
      try {
        {
          SubLObject _prev_bind_0 = Dynamic.currentBinding(Errors.$error_handler$);
          try {
            Dynamic.bind(Errors.$error_handler$, Symbols.symbol_function($sym54$IGNORE_ERRORS_HANDLER));
            try {
              existsP = list_utilities.sublisp_boolean(Filesys.probe_file(filename));
            } catch (Throwable catch_var) {
              Errors.handleThrowable(catch_var, NIL);
            }
          } finally {
            Dynamic.rebind(Errors.$error_handler$, _prev_bind_0);
          }
        }
      } catch (Throwable ccatch_env_var) {
        ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $kw53$IGNORE_ERRORS_TARGET);
      }
      return existsP;
    }
  }

  /** Look at the string PATH and determine whether it's for a unix or dos filesystem.
@param PATH string
@return keyword ;; :unix or :dos or nil
@owner jantos
@privacy done
 */
  @SubL(source = "cycl/file-utilities.lisp", position = 24400) 
  public static final SubLObject guess_path_type(SubLObject path) {
    if ((NIL != string_utilities.char_position(Characters.CHAR_slash, path, UNPROVIDED))) {
      return $kw179$UNIX;
    } else {
      if ((NIL != string_utilities.char_position(Characters.CHAR_backslash, path, UNPROVIDED))) {
        return $kw180$DOS;
      } else {
        return NIL;
      }
    }
  }

  /** Determine whether PATH is absolute, i.e. on unix if it starts with a /, on msdos if it starts with <drive>: or \ (e.g. \serverwindowsshare)
@param PATH string
@return boolean
@owner jantos
@privacy done
 */
  @SubL(source = "cycl/file-utilities.lisp", position = 26502) 
  public static final SubLObject absolute_pathP(SubLObject path) {
    {
      SubLObject path_length = Sequences.length(path);
      if ((path_length == ZERO_INTEGER)) {
        return NIL;
      }
      {
        SubLObject pcase_var = guess_path_type(path);
        if (pcase_var.eql($kw179$UNIX)) {
          return Equality.eq(Characters.CHAR_slash, Strings.sublisp_char(path, ZERO_INTEGER));
        } else if (pcase_var.eql($kw180$DOS)) {
          return makeBoolean((path_length.numG(TWO_INTEGER)
                 && (((Characters.CHAR_colon == Strings.sublisp_char(path, ONE_INTEGER))
                     && (NIL != Characters.alpha_char_p(Strings.sublisp_char(path, ZERO_INTEGER))))
                  || (NIL != string_utilities.starts_with(path, $str181$__)))));
        } else {
          return NIL;
        }
      }
    }
  }

  /** Return the appropriate separator char for the given PATH-TYPE.
@param PATH-TYPE keyword
@return char
@owner jantos
@privacy done
 */
  @SubL(source = "cycl/file-utilities.lisp", position = 27168) 
  public static final SubLObject path_separator_char(SubLObject path_type) {
    {
      SubLObject pcase_var = path_type;
      if (pcase_var.eql($kw179$UNIX)) {
        return Characters.CHAR_slash;
      } else if (pcase_var.eql($kw180$DOS)) {
        return Characters.CHAR_backslash;
      } else if (pcase_var.eql($kw182$MAC)) {
        return Characters.CHAR_colon;
      } else {
        return NIL;
      }
    }
  }

  /** Analyze and deconstruct the path into PATH-LIST leading up to FILENAME (a file, directory, symlink,.) and the PATH-TYPE (currently :unix or :dos).  @see reconstruct-path.
@param PATH string
@return 0 list ;; PATH-LIST
@return 1 string ;; FILENAME
@return 2 keyword ;; PATH-TYPE
@owner jantos
@privacy done
 */
  @SubL(source = "cycl/file-utilities.lisp", position = 27813) 
  public static final SubLObject deconstruct_path(SubLObject path) {
    {
      SubLObject path_type = guess_path_type(path);
      if ((NIL == path_type)) {
        return Values.values(NIL, path, NIL);
      }
      {
        SubLObject path_list = string_utilities.string_tokenize(path, list(Strings.make_string(ONE_INTEGER, path_separator_char(path_type))), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject filename = NIL;
        path_list = Sequences.nreverse(path_list);
        filename = path_list.first();
        path_list = path_list.rest();
        path_list = Sequences.nreverse(path_list);
        return Values.values(path_list, filename, path_type);
      }
    }
  }

  /** Reconstruct the deconstructed path.  @see deconstruct-path.
@param PATH-LIST list
@param FILENAME string
@param PATH-TYPE keyword
@return string
@owner jantos
@privacy done
 */
  @SubL(source = "cycl/file-utilities.lisp", position = 28613) 
  public static final SubLObject reconstruct_path(SubLObject path_list, SubLObject filename, SubLObject path_type) {
    if ((path_type == UNPROVIDED)) {
      path_type = $kw179$UNIX;
    }
    {
      SubLObject build_path = NIL;
      SubLObject path_separator_string = Strings.make_string(ONE_INTEGER, path_separator_char(path_type));
      SubLObject cdolist_list_var = path_list;
      SubLObject path_step = NIL;
      for (path_step = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), path_step = cdolist_list_var.first()) {
        build_path = cons(path_step, build_path);
        build_path = cons(path_separator_string, build_path);
      }
      build_path = cons(filename, build_path);
      return Functions.apply(Symbols.symbol_function($sym157$CCONCATENATE), Sequences.nreverse(build_path));
    }
  }

  /** Recursively calls MAKE-DIRECTORY to create one by one each directory leading to DIRECTORY-PATH.
@param DIRECTORY-PATH; stringp
@param FORCE?; boolean ;; If any of the intermediate paths exists as a file, the file is removed and a directory by the same path is created instead. o/w an error is thrown.
@param PERMISSIONS stringp ;; if a directory is created, chmod the newly-created directory with these permissions.  Otherwise, they will be created with MAKE-DIRECTORY's default, 0755.
@owner zelal */
  @SubL(source = "cycl/file-utilities.lisp", position = 34048) 
  public static final SubLObject make_directory_recursive(SubLObject directory_path, SubLObject forceP, SubLObject permissions) {
    if ((forceP == UNPROVIDED)) {
      forceP = NIL;
    }
    if ((permissions == UNPROVIDED)) {
      permissions = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != permissions)) {
        checkType(permissions, $sym16$STRINGP);
      }
      checkType(directory_path, $sym16$STRINGP);
      {
        SubLObject physical_path = subl_promotions.ensure_physical_pathname(directory_path);
        SubLObject path_list_so_far = NIL;
        SubLObject path_type = NIL;
        SubLObject chmod_list = NIL;
        thread.resetMultipleValues();
        {
          SubLObject directories = deconstruct_path(physical_path);
          SubLObject last_directory = thread.secondMultipleValue();
          SubLObject pt = thread.thirdMultipleValue();
          thread.resetMultipleValues();
          path_type = pt;
          directories = list_utilities.nadd_to_end(last_directory, directories);
          {
            SubLObject cdolist_list_var = directories;
            SubLObject each_directory = NIL;
            for (each_directory = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), each_directory = cdolist_list_var.first()) {
              {
                SubLObject each_directory_path = reconstruct_path(path_list_so_far, each_directory, path_type);
                path_list_so_far = list_utilities.nadd_to_end(each_directory, path_list_so_far);
                if ((!(((NIL != Filesys.directory_p(each_directory_path))
                      || ((path_type == $kw180$DOS)
                         && (NIL != string_utilities.ends_with(each_directory_path, $str186$_, UNPROVIDED))))))) {
                  if ((NIL != Filesys.probe_file(each_directory_path))) {
                    if ((NIL != forceP)) {
                      Filesys.delete_file(each_directory_path);
                    } else {
                      Errors.error($str187$make_directory_recursive__could_n, each_directory_path);
                    }
                  }
                  Filesys.make_directory(each_directory_path, UNPROVIDED, UNPROVIDED);
                  chmod_list = cons(each_directory_path, chmod_list);
                }
              }
            }
          }
          if ((NIL != permissions)) {
            {
              SubLObject cdolist_list_var = chmod_list;
              SubLObject chmod_directory = NIL;
              for (chmod_directory = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), chmod_directory = cdolist_list_var.first()) {
                chmod(chmod_directory, permissions);
              }
            }
          }
        }
        return Filesys.probe_file(reconstruct_path(conses_high.butlast(path_list_so_far, UNPROVIDED), conses_high.last(path_list_so_far, UNPROVIDED).first(), path_type));
      }
    }
  }

  /** @param PATHNAME stringp; the full path to the file in question
   @param PERMISSIONS-STRING stringp; the permissions, as specified to the operating system (currently, only unix/linux)
   @hack make this work on windows, not just on unix */
  @SubL(source = "cycl/file-utilities.lisp", position = 38162) 
  public static final SubLObject chmod(SubLObject pathname, SubLObject permissions_string) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == Processes.external_processes_supportedP())) {
        return NIL;
      }
      return os_process_utilities.system_eval_using_make_os_process_successfulP($str188$chmod, list(permissions_string, pathname), ZERO_INTEGER, StreamsLow.$null_input$.getDynamicValue(thread), StreamsLow.$null_output$.getDynamicValue(thread), UNPROVIDED);
    }
  }

  public static final SubLObject declare_file_utilities_file() {
    //declareMacro(myName, "possibly_with_text_file", "POSSIBLY-WITH-TEXT-FILE");
    //declareMacro(myName, "possibly_with_private_text_file", "POSSIBLY-WITH-PRIVATE-TEXT-FILE");
    //declareMacro(myName, "possibly_with_binary_file", "POSSIBLY-WITH-BINARY-FILE");
    //declareMacro(myName, "possibly_with_private_binary_file", "POSSIBLY-WITH-PRIVATE-BINARY-FILE");
    //declareFunction(myName, "peek_byte_from_char_stream", "PEEK-BYTE-FROM-CHAR-STREAM", 0, 3, false);
    //declareFunction(myName, "read_byte_from_char_stream", "READ-BYTE-FROM-CHAR-STREAM", 0, 3, false);
    //declareFunction(myName, "unread_byte_from_char_stream", "UNREAD-BYTE-FROM-CHAR-STREAM", 1, 1, false);
    //declareFunction(myName, "write_byte_to_char_stream", "WRITE-BYTE-TO-CHAR-STREAM", 1, 1, false);
    //declareFunction(myName, "stream_designator_p", "STREAM-DESIGNATOR-P", 1, 0, false);
    //declareFunction(myName, "pathname_designator_p", "PATHNAME-DESIGNATOR-P", 1, 0, false);
    declareFunction(myName, "cyc_home_filename", "CYC-HOME-FILENAME", 2, 1, false);
    declareFunction(myName, "cyc_home_subdirectory", "CYC-HOME-SUBDIRECTORY", 1, 0, false);
    declareFunction(myName, "relative_filename", "RELATIVE-FILENAME", 2, 1, false);
    declareFunction(myName, "basic_filename", "BASIC-FILENAME", 1, 1, false);
    declareFunction(myName, "temp_directory", "TEMP-DIRECTORY", 0, 0, false);
    //declareFunction(myName, "random_path_char", "RANDOM-PATH-CHAR", 0, 0, false);
    //declareFunction(myName, "make_temp_filename", "MAKE-TEMP-FILENAME", 0, 1, false);
    //declareFunction(myName, "random_filename_part", "RANDOM-FILENAME-PART", 0, 1, false);
    //declareFunction(myName, "make_unused_temp_filename", "MAKE-UNUSED-TEMP-FILENAME", 0, 1, false);
    //declareFunction(myName, "make_prefixed_temp_filename", "MAKE-PREFIXED-TEMP-FILENAME", 1, 1, false);
    //declareFunction(myName, "open_temp_file", "OPEN-TEMP-FILE", 0, 2, false);
    //declareMacro(myName, "with_temp_file", "WITH-TEMP-FILE");
    //declareMacro(myName, "with_temporary_filename", "WITH-TEMPORARY-FILENAME");
    //declareFunction(myName, "open_tmp_file", "OPEN-TMP-FILE", 0, 2, false);
    //declareMacro(myName, "with_tmp_file", "WITH-TMP-FILE");
    //declareFunction(myName, "directory_writeable_p", "DIRECTORY-WRITEABLE-P", 1, 1, false);
    //declareFunction(myName, "file_valid_for_writing_p", "FILE-VALID-FOR-WRITING-P", 1, 0, false);
    //declareFunction(myName, "delete_file_if_exists", "DELETE-FILE-IF-EXISTS", 1, 0, false);
    //declareFunction(myName, "clean_filename", "CLEAN-FILENAME", 1, 0, false);
    //declareFunction(myName, "append_files", "APPEND-FILES", 2, 1, false);
    //declareMacro(myName, "cdolines", "CDOLINES");
    //declareMacro(myName, "do_stream_lines", "DO-STREAM-LINES");
    //declareMacro(myName, "do_file_lines", "DO-FILE-LINES");
    //declareFunction(myName, "count_file_lines", "COUNT-FILE-LINES", 1, 0, false);
    //declareMacro(myName, "do_csv_file_lines", "DO-CSV-FILE-LINES");
    //declareMacro(myName, "cdolines_tokenized", "CDOLINES-TOKENIZED");
    //declareMacro(myName, "cdolines_read", "CDOLINES-READ");
    //declareMacro(myName, "do_file_records", "DO-FILE-RECORDS");
    //declareMacro(myName, "do_directory_contents", "DO-DIRECTORY-CONTENTS");
    //declareMacro(myName, "do_directory_subdirectories", "DO-DIRECTORY-SUBDIRECTORIES");
    //declareMacro(myName, "do_directory_tree_files", "DO-DIRECTORY-TREE-FILES");
    //declareFunction(myName, "directory_file_count", "DIRECTORY-FILE-COUNT", 1, 0, false);
    //declareFunction(myName, "sort_files_by_date", "SORT-FILES-BY-DATE", 1, 0, false);
    //declareFunction(myName, "slurp_file", "SLURP-FILE", 1, 0, false);
    //declareFunction(myName, "slurp_file_lines", "SLURP-FILE-LINES", 1, 0, false);
    declareFunction(myName, "file_existsP", "FILE-EXISTS?", 1, 0, false);
    //declareFunction(myName, "why_not_probe_fileP", "WHY-NOT-PROBE-FILE?", 1, 0, false);
    declareFunction(myName, "guess_path_type", "GUESS-PATH-TYPE", 1, 0, false);
    //declareFunction(myName, "guess_path_type_robust", "GUESS-PATH-TYPE-ROBUST", 1, 0, false);
    //declareFunction(myName, "absolute_default_path_string", "ABSOLUTE-DEFAULT-PATH-STRING", 0, 0, false);
    //declareFunction(myName, "possibly_append_path_separator_char", "POSSIBLY-APPEND-PATH-SEPARATOR-CHAR", 1, 0, false);
    //declareFunction(myName, "get_absolute_path_string", "GET-ABSOLUTE-PATH-STRING", 1, 0, false);
    declareFunction(myName, "absolute_pathP", "ABSOLUTE-PATH?", 1, 0, false);
    declareFunction(myName, "path_separator_char", "PATH-SEPARATOR-CHAR", 1, 0, false);
    declareFunction(myName, "deconstruct_path", "DECONSTRUCT-PATH", 1, 0, false);
    declareFunction(myName, "reconstruct_path", "RECONSTRUCT-PATH", 2, 1, false);
    //declareFunction(myName, "make_path_absolute_relative_to", "MAKE-PATH-ABSOLUTE-RELATIVE-TO", 2, 0, false);
    //declareFunction(myName, "pathstring_filename", "PATHSTRING-FILENAME", 1, 0, false);
    //declareFunction(myName, "partially_deconstruct_path", "PARTIALLY-DECONSTRUCT-PATH", 1, 0, false);
    //declareFunction(myName, "read_text_file", "READ-TEXT-FILE", 1, 0, false);
    //declareFunction(myName, "output_text_file", "OUTPUT-TEXT-FILE", 2, 1, false);
    //declareFunction(myName, "write_text_file", "WRITE-TEXT-FILE", 2, 0, false);
    //declareFunction(myName, "append_text_file", "APPEND-TEXT-FILE", 2, 0, false);
    //declareFunction(myName, "truncate_file", "TRUNCATE-FILE", 1, 0, false);
    //declareFunction(myName, "empty_file_p", "EMPTY-FILE-P", 1, 0, false);
    declareFunction(myName, "make_directory_recursive", "MAKE-DIRECTORY-RECURSIVE", 1, 2, false);
    //declareFunction(myName, "logical_pathname_to_physical", "LOGICAL-PATHNAME-TO-PHYSICAL", 1, 0, false);
    //declareFunction(myName, "recursive_delete_directory", "RECURSIVE-DELETE-DIRECTORY", 1, 0, false);
    //declareFunction(myName, "recursive_copy_directory", "RECURSIVE-COPY-DIRECTORY", 2, 0, false);
    declareFunction(myName, "chmod", "CHMOD", 2, 0, false);
    //declareFunction(myName, "delete_file_via_os", "DELETE-FILE-VIA-OS", 1, 0, false);
    //declareFunction(myName, "create_symbolic_link", "CREATE-SYMBOLIC-LINK", 2, 0, false);
    //declareFunction(myName, "link_or_copy_file", "LINK-OR-COPY-FILE", 2, 0, false);
    //declareFunction(myName, "move_file", "MOVE-FILE", 2, 0, false);
    //declareFunction(myName, "get_file_length", "GET-FILE-LENGTH", 1, 0, false);
    //declareFunction(myName, "get_file_lines", "GET-FILE-LINES", 1, 0, false);
    //declareFunction(myName, "get_file_line_count", "GET-FILE-LINE-COUNT", 1, 0, false);
    //declareFunction(myName, "load_file_catching_error", "LOAD-FILE-CATCHING-ERROR", 1, 0, false);
    //declareFunction(myName, "normal_pathstring", "NORMAL-PATHSTRING", 1, 0, false);
    //declareFunction(myName, "possibly_update_keepalive_file", "POSSIBLY-UPDATE-KEEPALIVE-FILE", 1, 0, false);
    //declareFunction(myName, "update_keepalive_file", "UPDATE-KEEPALIVE-FILE", 1, 0, false);
    //declareFunction(myName, "make_directory_or_error", "MAKE-DIRECTORY-OR-ERROR", 1, 1, false);
    //declareFunction(myName, "make_directory_or_possibly_error", "MAKE-DIRECTORY-OR-POSSIBLY-ERROR", 1, 2, false);
    //declareFunction(myName, "make_timestamp_subdirectory", "MAKE-TIMESTAMP-SUBDIRECTORY", 1, 0, false);
    //declareFunction(myName, "timestamp_subdirectory", "TIMESTAMP-SUBDIRECTORY", 1, 0, false);
    //declareFunction(myName, "prepare_to_possibly_overwrite_file", "PREPARE-TO-POSSIBLY-OVERWRITE-FILE", 1, 1, false);
    //declareFunction(myName, "new_file_accumulator", "NEW-FILE-ACCUMULATOR", 1, 2, false);
    //declareFunction(myName, "close_file_accumulator", "CLOSE-FILE-ACCUMULATOR", 1, 0, false);
    //declareFunction(myName, "make_file_accumulator_state", "MAKE-FILE-ACCUMULATOR-STATE", 2, 0, false);
    //declareMacro(myName, "with_file_accumulator_state", "WITH-FILE-ACCUMULATOR-STATE");
    //declareFunction(myName, "file_accumulator_state_set_item_count", "FILE-ACCUMULATOR-STATE-SET-ITEM-COUNT", 2, 0, false);
    //declareFunction(myName, "file_accumulator_state_reset_item_count", "FILE-ACCUMULATOR-STATE-RESET-ITEM-COUNT", 1, 0, false);
    //declareFunction(myName, "file_accumulator_state_get_stream", "FILE-ACCUMULATOR-STATE-GET-STREAM", 1, 0, false);
    //declareFunction(myName, "file_accumulator_reset", "FILE-ACCUMULATOR-RESET", 1, 0, false);
    //declareFunction(myName, "file_accumulator_add", "FILE-ACCUMULATOR-ADD", 2, 0, false);
    //declareFunction(myName, "file_accumulator_size", "FILE-ACCUMULATOR-SIZE", 1, 0, false);
    //declareFunction(myName, "file_accumulator_contents", "FILE-ACCUMULATOR-CONTENTS", 2, 0, false);
    //declareFunction(myName, "file_accumulator_iterator", "FILE-ACCUMULATOR-ITERATOR", 1, 0, false);
    //declareFunction(myName, "file_accumulator_release_resources", "FILE-ACCUMULATOR-RELEASE-RESOURCES", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_file_utilities_file() {
    $temp_directory$ = deflexical("*TEMP-DIRECTORY*", red_infrastructure_macros.red_def_helper(($list18.isSymbol() ? ((SubLObject) Symbols.symbol_value($list18)) : $list18), $sym19$_TEMP_DIRECTORY_, ($str20$_tmp_.isSymbol() ? ((SubLObject) Symbols.symbol_value($str20$_tmp_)) : $str20$_tmp_), $kw21$LEXICAL, UNPROVIDED));
    $random_path_chars$ = deflexical("*RANDOM-PATH-CHARS*", $str22$0123456789abcdefghijklmnopqrstuvw);
    return NIL;
  }

  public static final SubLObject setup_file_utilities_file() {
        access_macros.define_obsolete_register($sym35$OPEN_TMP_FILE, $list47);
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(list(makeSymbol("STREAM"), makeSymbol("FILENAME"), makeSymbol("DIRECTION")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym1$FILENAME_VAR = makeUninternedSymbol("FILENAME-VAR");
  public static final SubLSymbol $sym2$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym3$PIF = makeSymbol("PIF");
  public static final SubLSymbol $sym4$WITH_TEXT_FILE = makeSymbol("WITH-TEXT-FILE");
  public static final SubLList $list5 = list(NIL);
  public static final SubLSymbol $sym6$FILENAME_VAR = makeUninternedSymbol("FILENAME-VAR");
  public static final SubLSymbol $sym7$WITH_PRIVATE_TEXT_FILE = makeSymbol("WITH-PRIVATE-TEXT-FILE");
  public static final SubLSymbol $sym8$FILENAME_VAR = makeUninternedSymbol("FILENAME-VAR");
  public static final SubLSymbol $sym9$WITH_BINARY_FILE = makeSymbol("WITH-BINARY-FILE");
  public static final SubLSymbol $sym10$FILENAME_VAR = makeUninternedSymbol("FILENAME-VAR");
  public static final SubLSymbol $sym11$WITH_PRIVATE_BINARY_FILE = makeSymbol("WITH-PRIVATE-BINARY-FILE");
  public static final SubLSymbol $kw12$EOF = makeKeyword("EOF");
  public static final SubLSymbol $sym13$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
  public static final SubLSymbol $sym14$LISTP = makeSymbol("LISTP");
  public static final SubLString $str15$ = makeString("");
  public static final SubLSymbol $sym16$STRINGP = makeSymbol("STRINGP");
  public static final SubLString $str17$_ = makeString(".");
  public static final SubLList $list18 = list(makeString("rck.please.put.this.in.the.right.place"));
  public static final SubLSymbol $sym19$_TEMP_DIRECTORY_ = makeSymbol("*TEMP-DIRECTORY*");
  public static final SubLString $str20$_tmp_ = makeString("/tmp/");
  public static final SubLSymbol $kw21$LEXICAL = makeKeyword("LEXICAL");
  public static final SubLString $str22$0123456789abcdefghijklmnopqrstuvw = makeString("0123456789abcdefghijklmnopqrstuvwxyz");
  public static final SubLInteger $int23$36 = makeInteger(36);
  public static final SubLString $str24$tmp = makeString("tmp");
  public static final SubLSymbol $kw25$TEXT = makeKeyword("TEXT");
  public static final SubLSymbol $kw26$DIRECTION = makeKeyword("DIRECTION");
  public static final SubLSymbol $kw27$IO = makeKeyword("IO");
  public static final SubLSymbol $kw28$IF_EXISTS = makeKeyword("IF-EXISTS");
  public static final SubLSymbol $kw29$IF_DOES_NOT_EXIST = makeKeyword("IF-DOES-NOT-EXIST");
  public static final SubLSymbol $kw30$CREATE = makeKeyword("CREATE");
  public static final SubLSymbol $kw31$ELEMENT_TYPE = makeKeyword("ELEMENT-TYPE");
  public static final SubLList $list32 = list(list(makeSymbol("STREAM"), makeSymbol("&KEY"), list(makeSymbol("ELEMENT-TYPE"), makeKeyword("TEXT"))), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list33 = list(makeKeyword("ELEMENT-TYPE"));
  public static final SubLSymbol $kw34$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $sym35$OPEN_TMP_FILE = makeSymbol("OPEN-TMP-FILE");
  public static final SubLSymbol $sym36$CUNWIND_PROTECT = makeSymbol("CUNWIND-PROTECT");
  public static final SubLSymbol $sym37$PWHEN = makeSymbol("PWHEN");
  public static final SubLSymbol $sym38$STREAMP = makeSymbol("STREAMP");
  public static final SubLSymbol $sym39$DELETE_FILE = makeSymbol("DELETE-FILE");
  public static final SubLSymbol $sym40$CLOSE = makeSymbol("CLOSE");
  public static final SubLList $list41 = list(list(makeSymbol("FILENAME"), makeSymbol("&KEY"), list(makeSymbol("DIRECTORY"), makeSymbol("*TEMP-DIRECTORY*"))), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list42 = list(makeKeyword("DIRECTORY"));
  public static final SubLSymbol $kw43$DIRECTORY = makeKeyword("DIRECTORY");
  public static final SubLSymbol $sym44$MAKE_TEMP_FILENAME = makeSymbol("MAKE-TEMP-FILENAME");
  public static final SubLSymbol $sym45$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $sym46$IGNORE_ERRORS = makeSymbol("IGNORE-ERRORS");
  public static final SubLList $list47 = list(makeSymbol("OPEN-TEMP-FILE"));
  public static final SubLList $list48 = list(list(makeSymbol("STREAM"), makeSymbol("&OPTIONAL"), list(makeSymbol("ELEMENT-TYPE"), makeKeyword("TEXT"))), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym49$WITH_TMP_FILE = makeSymbol("WITH-TMP-FILE");
  public static final SubLList $list50 = list(makeSymbol("WITH-TEMP-FILE"));
  public static final SubLSymbol $sym51$WITH_TEMP_FILE = makeSymbol("WITH-TEMP-FILE");
  public static final SubLSymbol $sym52$INTEGERP = makeSymbol("INTEGERP");
  public static final SubLSymbol $kw53$IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");
  public static final SubLSymbol $sym54$IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
  public static final SubLSymbol $kw55$OUTPUT = makeKeyword("OUTPUT");
  public static final SubLString $str56$Unable_to_open__S = makeString("Unable to open ~S");
  public static final SubLSymbol $sym57$READ_CHAR = makeSymbol("READ-CHAR");
  public static final SubLSymbol $sym58$WRITE_CHAR = makeSymbol("WRITE-CHAR");
  public static final SubLSymbol $kw59$BINARY = makeKeyword("BINARY");
  public static final SubLSymbol $kw60$DEFAULT = makeKeyword("DEFAULT");
  public static final SubLSymbol $sym61$READ_BYTE = makeSymbol("READ-BYTE");
  public static final SubLSymbol $sym62$WRITE_BYTE = makeSymbol("WRITE-BYTE");
  public static final SubLString $str63$_S_is_not_a_valid_mode_ = makeString("~S is not a valid mode.");
  public static final SubLSymbol $kw64$APPEND = makeKeyword("APPEND");
  public static final SubLList $list65 = list(list(makeSymbol("VAR"), makeSymbol("FILE"), makeSymbol("&OPTIONAL"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym66$INFILE = makeUninternedSymbol("INFILE");
  public static final SubLList $list67 = list(makeKeyword("INPUT"));
  public static final SubLSymbol $sym68$CDO = makeSymbol("CDO");
  public static final SubLSymbol $sym69$READ_LINE = makeSymbol("READ-LINE");
  public static final SubLList $list70 = list(NIL, NIL);
  public static final SubLSymbol $sym71$COR = makeSymbol("COR");
  public static final SubLSymbol $sym72$NULL = makeSymbol("NULL");
  public static final SubLList $list73 = list(list(makeSymbol("LINE-VAR"), makeSymbol("STREAM"), makeSymbol("&KEY"), makeSymbol("LINE-NUMBER"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list74 = list(makeKeyword("LINE-NUMBER"), makeKeyword("DONE"));
  public static final SubLSymbol $kw75$LINE_NUMBER = makeKeyword("LINE-NUMBER");
  public static final SubLSymbol $kw76$DONE = makeKeyword("DONE");
  public static final SubLSymbol $sym77$LINE_NUMBER_VAR = makeUninternedSymbol("LINE-NUMBER-VAR");
  public static final SubLSymbol $sym78$DO_STREAM_LINES = makeSymbol("DO-STREAM-LINES");
  public static final SubLSymbol $sym79$STREAM_VAR = makeUninternedSymbol("STREAM-VAR");
  public static final SubLSymbol $sym80$SYMBOLP = makeSymbol("SYMBOLP");
  public static final SubLSymbol $sym81$1_ = makeSymbol("1+");
  public static final SubLList $list82 = list(list(makeSymbol("LINE-VAR"), makeSymbol("FILE"), makeSymbol("&KEY"), makeSymbol("LINE-NUMBER"), makeSymbol("PROGRESS-MESSAGE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list83 = list(makeKeyword("LINE-NUMBER"), makeKeyword("PROGRESS-MESSAGE"), makeKeyword("DONE"));
  public static final SubLSymbol $kw84$PROGRESS_MESSAGE = makeKeyword("PROGRESS-MESSAGE");
  public static final SubLSymbol $sym85$FILE_VAR = makeUninternedSymbol("FILE-VAR");
  public static final SubLSymbol $sym86$STREAM_VAR = makeUninternedSymbol("STREAM-VAR");
  public static final SubLSymbol $sym87$FILE_VAR = makeUninternedSymbol("FILE-VAR");
  public static final SubLSymbol $sym88$STREAM_VAR = makeUninternedSymbol("STREAM-VAR");
  public static final SubLSymbol $sym89$LENGTH_VAR = makeUninternedSymbol("LENGTH-VAR");
  public static final SubLSymbol $sym90$NOTING_PERCENT_PROGRESS = makeSymbol("NOTING-PERCENT-PROGRESS");
  public static final SubLSymbol $sym91$FILE_LENGTH = makeSymbol("FILE-LENGTH");
  public static final SubLSymbol $sym92$NOTE_PERCENT_PROGRESS = makeSymbol("NOTE-PERCENT-PROGRESS");
  public static final SubLSymbol $sym93$FILE_POSITION = makeSymbol("FILE-POSITION");
  public static final SubLSymbol $kw94$INPUT = makeKeyword("INPUT");
  public static final SubLList $list95 = list(list(makeSymbol("TOKENIZED-LINE"), makeSymbol("FILE"), makeSymbol("&KEY"), list(makeSymbol("BREAK-LIST"), list(makeSymbol("QUOTE"), list(makeSymbol("LIST"), Characters.CHAR_comma))), list(makeSymbol("EMBED-LIST"), list(makeSymbol("QUOTE"), list(makeSymbol("LIST"), list(makeSymbol("LIST"), makeString("\""), makeString("\""))))), makeSymbol("INCLUDE-STOPS"), makeSymbol("IGNORE-EMPTY-STRINGS"), list(makeSymbol("QUOTE-CHARS"), list(makeSymbol("QUOTE"), list(makeSymbol("LIST"), Characters.CHAR_backslash)))), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list96 = list(makeKeyword("BREAK-LIST"), makeKeyword("EMBED-LIST"), makeKeyword("INCLUDE-STOPS"), makeKeyword("IGNORE-EMPTY-STRINGS"), makeKeyword("QUOTE-CHARS"));
  public static final SubLSymbol $kw97$BREAK_LIST = makeKeyword("BREAK-LIST");
  public static final SubLList $list98 = list(makeSymbol("LIST"), Characters.CHAR_comma);
  public static final SubLSymbol $kw99$EMBED_LIST = makeKeyword("EMBED-LIST");
  public static final SubLList $list100 = list(makeSymbol("LIST"), list(makeSymbol("LIST"), makeString("\""), makeString("\"")));
  public static final SubLSymbol $kw101$INCLUDE_STOPS = makeKeyword("INCLUDE-STOPS");
  public static final SubLSymbol $kw102$IGNORE_EMPTY_STRINGS = makeKeyword("IGNORE-EMPTY-STRINGS");
  public static final SubLSymbol $kw103$QUOTE_CHARS = makeKeyword("QUOTE-CHARS");
  public static final SubLList $list104 = list(makeSymbol("LIST"), Characters.CHAR_backslash);
  public static final SubLSymbol $sym105$LINE = makeUninternedSymbol("LINE");
  public static final SubLSymbol $sym106$DO_FILE_LINES = makeSymbol("DO-FILE-LINES");
  public static final SubLSymbol $sym107$STRING_TOKENIZE = makeSymbol("STRING-TOKENIZE");
  public static final SubLList $list108 = list(list(makeSymbol("FILE"), makeSymbol("&KEY"), list(makeSymbol("BREAK-LIST"), list(makeSymbol("QUOTE"), list(makeSymbol("MAPCAR"), list(makeSymbol("FUNCTION"), makeSymbol("TO-STRING")), list(makeSymbol("WHITESPACE-CHARS"))))), makeSymbol("EMBED-LIST"), makeSymbol("INCLUDE-STOPS"), list(makeSymbol("IGNORE-EMPTY-STRINGS"), T), makeSymbol("QUOTE-CHARS")), makeSymbol("LAMBDA-LIST"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list109 = list(makeSymbol("MAPCAR"), list(makeSymbol("FUNCTION"), makeSymbol("TO-STRING")), list(makeSymbol("WHITESPACE-CHARS")));
  public static final SubLSymbol $sym110$LINE = makeUninternedSymbol("LINE");
  public static final SubLSymbol $sym111$CDOLINES = makeSymbol("CDOLINES");
  public static final SubLSymbol $sym112$CDESTRUCTURING_BIND = makeSymbol("CDESTRUCTURING-BIND");
  public static final SubLSymbol $sym113$MAPCAR = makeSymbol("MAPCAR");
  public static final SubLList $list114 = list(makeSymbol("FUNCTION"), makeSymbol("READ-FROM-STRING"));
  public static final SubLSymbol $sym115$LINE = makeUninternedSymbol("LINE");
  public static final SubLSymbol $sym116$LINE_INDEX = makeUninternedSymbol("LINE-INDEX");
  public static final SubLSymbol $sym117$DONE_INT = makeUninternedSymbol("DONE-INT");
  public static final SubLList $list118 = list(ZERO_INTEGER);
  public static final SubLList $list119 = list(list(makeSymbol("QUOTE"), NIL));
  public static final SubLSymbol $sym120$WHILE = makeSymbol("WHILE");
  public static final SubLSymbol $sym121$_ = makeSymbol("<");
  public static final SubLSymbol $sym122$LENGTH = makeSymbol("LENGTH");
  public static final SubLSymbol $sym123$CMULTIPLE_VALUE_BIND = makeSymbol("CMULTIPLE-VALUE-BIND");
  public static final SubLList $list124 = list(makeSymbol("ITEM"), makeSymbol("TEMP-LINE-INDEX"));
  public static final SubLSymbol $sym125$READ_FROM_STRING = makeSymbol("READ-FROM-STRING");
  public static final SubLSymbol $sym126$CPUSH = makeSymbol("CPUSH");
  public static final SubLSymbol $sym127$ITEM = makeSymbol("ITEM");
  public static final SubLSymbol $sym128$CSETQ = makeSymbol("CSETQ");
  public static final SubLList $list129 = list(makeSymbol("TEMP-LINE-INDEX"));
  public static final SubLSymbol $sym130$NREVERSE = makeSymbol("NREVERSE");
  public static final SubLSymbol $sym131$PUNLESS = makeSymbol("PUNLESS");
  public static final SubLList $list132 = list(list(makeSymbol("RECORD"), makeSymbol("FILE"), makeSymbol("&OPTIONAL"), list(makeSymbol("SEPARATOR-TEST"), list(makeSymbol("FUNCTION"), makeSymbol("WHITESPACE-STRING?"))), list(makeSymbol("IGNORE-TEST"), list(makeSymbol("FUNCTION"), makeSymbol("FALSE")))), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym133$WHITESPACE_STRING_ = makeSymbol("WHITESPACE-STRING?");
  public static final SubLSymbol $sym134$FALSE = makeSymbol("FALSE");
  public static final SubLSymbol $sym135$INSTREAM = makeUninternedSymbol("INSTREAM");
  public static final SubLSymbol $sym136$LINE = makeUninternedSymbol("LINE");
  public static final SubLSymbol $sym137$INPUT_STREAM_P = makeSymbol("INPUT-STREAM-P");
  public static final SubLSymbol $sym138$FUNCALL = makeSymbol("FUNCALL");
  public static final SubLList $list139 = list(list(makeSymbol("FILE-VAR"), makeSymbol("DIRECTORY"), makeSymbol("&KEY"), list(makeSymbol("INCLUDE-DIRECTORY?"), T), makeSymbol("PROGRESS-MESSAGE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list140 = list(makeKeyword("INCLUDE-DIRECTORY?"), makeKeyword("PROGRESS-MESSAGE"), makeKeyword("DONE"));
  public static final SubLSymbol $kw141$INCLUDE_DIRECTORY_ = makeKeyword("INCLUDE-DIRECTORY?");
  public static final SubLSymbol $sym142$DIRECTORY_CONTENTS_VAR = makeUninternedSymbol("DIRECTORY-CONTENTS-VAR");
  public static final SubLSymbol $sym143$PROGRESS_MESSAGE_VAR = makeUninternedSymbol("PROGRESS-MESSAGE-VAR");
  public static final SubLSymbol $sym144$CHECK_TYPE = makeSymbol("CHECK-TYPE");
  public static final SubLList $list145 = list(makeSymbol("DIRECTORY-P"));
  public static final SubLSymbol $sym146$DIRECTORY = makeSymbol("DIRECTORY");
  public static final SubLSymbol $sym147$_SILENT_PROGRESS__ = makeSymbol("*SILENT-PROGRESS?*");
  public static final SubLSymbol $sym148$CNOT = makeSymbol("CNOT");
  public static final SubLSymbol $sym149$PROGRESS_CSOME = makeSymbol("PROGRESS-CSOME");
  public static final SubLList $list150 = list(list(makeSymbol("SUBDIRECTORY"), makeSymbol("DIRECTORY"), makeSymbol("&KEY"), list(makeSymbol("INCLUDE-DIRECTORY?"), T)), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list151 = list(makeKeyword("INCLUDE-DIRECTORY?"));
  public static final SubLSymbol $sym152$DO_DIRECTORY_CONTENTS = makeSymbol("DO-DIRECTORY-CONTENTS");
  public static final SubLSymbol $sym153$DIRECTORY_P = makeSymbol("DIRECTORY-P");
  public static final SubLSymbol $sym154$FCOND = makeSymbol("FCOND");
  public static final SubLSymbol $sym155$ENDS_WITH = makeSymbol("ENDS-WITH");
  public static final SubLList $list156 = list(makeString("/"));
  public static final SubLSymbol $sym157$CCONCATENATE = makeSymbol("CCONCATENATE");
  public static final SubLString $str158$_ = makeString("/");
  public static final SubLSymbol $sym159$LAST_CHAR = makeSymbol("LAST-CHAR");
  public static final SubLList $list160 = list(Characters.CHAR_slash);
  public static final SubLList $list161 = list(list(makeSymbol("FILE-VAR"), makeSymbol("DIRECTORY"), makeSymbol("&KEY"), list(makeSymbol("INCLUDE-DIRECTORY?"), T), list(makeSymbol("PROGRESS-MESSAGE"), makeString("Processing directory tree files..."))), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list162 = list(makeKeyword("INCLUDE-DIRECTORY?"), makeKeyword("PROGRESS-MESSAGE"));
  public static final SubLString $str163$Processing_directory_tree_files__ = makeString("Processing directory tree files...");
  public static final SubLSymbol $sym164$DIRECTORY_LIST_VAR = makeUninternedSymbol("DIRECTORY-LIST-VAR");
  public static final SubLSymbol $sym165$CURRENT_DIRECTORY_VAR = makeUninternedSymbol("CURRENT-DIRECTORY-VAR");
  public static final SubLSymbol $sym166$LIST = makeSymbol("LIST");
  public static final SubLSymbol $sym167$FIRST = makeSymbol("FIRST");
  public static final SubLSymbol $sym168$CPOP = makeSymbol("CPOP");
  public static final SubLSymbol $sym169$FWHEN = makeSymbol("FWHEN");
  public static final SubLSymbol $sym170$FORMAT_NIL = makeSymbol("FORMAT-NIL");
  public static final SubLString $str171$___Directory___S = makeString("~% Directory: ~S");
  public static final SubLSymbol $sym172$FILE_WRITE_DATE = makeSymbol("FILE-WRITE-DATE");
  public static final SubLString $str173$_ = makeString("\\");
  public static final SubLList $list174 = list(makeString("/"), makeString("\\"));
  public static final SubLString $str175$Could_not_find__A = makeString("Could not find ~A");
  public static final SubLString $str176$Could_not_find__A_A = makeString("Could not find ~A~A");
  public static final SubLString $str177$File_not_found_ = makeString("File not found.");
  public static final SubLString $str178$File_not_found_from_directory__A = makeString("File not found from directory ~A");
  public static final SubLSymbol $kw179$UNIX = makeKeyword("UNIX");
  public static final SubLSymbol $kw180$DOS = makeKeyword("DOS");
  public static final SubLString $str181$__ = makeString("\\\\");
  public static final SubLSymbol $kw182$MAC = makeKeyword("MAC");
  public static final SubLString $str183$Path_type_mismatch_ = makeString("Path type mismatch.");
  public static final SubLString $str184$__ = makeString("..");
  public static final SubLString $str185$Warning__unable_to_read_file__s__ = makeString("Warning: unable to read file ~s~%");
  public static final SubLString $str186$_ = makeString(":");
  public static final SubLString $str187$make_directory_recursive__could_n = makeString("make-directory-recursive: could not create ~A since it exists as a file.");
  public static final SubLString $str188$chmod = makeString("chmod");
  public static final SubLString $str189$ln = makeString("ln");
  public static final SubLString $str190$_s = makeString("-s");
  public static final SubLString $str191$I_m_alive___ = makeString("I'm alive!~%");
  public static final SubLString $str192$Could_not_make_directory__a_with_ = makeString("Could not make directory ~a with path ~a");
  public static final SubLString $str193$File_already_exists___A__ = makeString("File already exists: ~A~%");
  public static final SubLSymbol $sym194$PRINT = makeSymbol("PRINT");
  public static final SubLSymbol $sym195$FUNCTION_SPEC_P = makeSymbol("FUNCTION-SPEC-P");
  public static final SubLSymbol $sym196$OPEN_TEXT = makeSymbol("OPEN-TEXT");
  public static final SubLSymbol $sym197$OPEN_BINARY = makeSymbol("OPEN-BINARY");
  public static final SubLString $str198$Cannot_open__A_for_writing___ = makeString("Cannot open ~A for writing.~%");
  public static final SubLSymbol $sym199$FILE_ACCUMULATOR_RESET = makeSymbol("FILE-ACCUMULATOR-RESET");
  public static final SubLSymbol $sym200$FILE_ACCUMULATOR_ADD = makeSymbol("FILE-ACCUMULATOR-ADD");
  public static final SubLSymbol $sym201$FILE_ACCUMULATOR_SIZE = makeSymbol("FILE-ACCUMULATOR-SIZE");
  public static final SubLSymbol $sym202$FILE_ACCUMULATOR_CONTENTS = makeSymbol("FILE-ACCUMULATOR-CONTENTS");
  public static final SubLSymbol $sym203$FILE_ACCUMULATOR_ITERATOR = makeSymbol("FILE-ACCUMULATOR-ITERATOR");
  public static final SubLSymbol $kw204$STREAM = makeKeyword("STREAM");
  public static final SubLSymbol $kw205$WRITER = makeKeyword("WRITER");
  public static final SubLSymbol $kw206$ITEM_COUNT = makeKeyword("ITEM-COUNT");
  public static final SubLList $list207 = list(list(makeSymbol("STATE"), makeSymbol("STREAM"), makeSymbol("WRITER"), makeSymbol("ITEM-COUNT")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym208$_KEY = makeSymbol("&KEY");
  public static final SubLList $list209 = list(makeSymbol("&KEY"), makeSymbol("STREAM"), makeSymbol("WRITER"), makeSymbol("ITEM-COUNT"));
  public static final SubLList $list210 = list(makeKeyword("STREAM"), makeKeyword("WRITER"), makeKeyword("ITEM-COUNT"));
  public static final SubLString $str211$Operation_not_supported_for_file_ = makeString("Operation not supported for file accumulator ~A.");
  public static final SubLString $str212$Operation_not_yet_supported_for_f = makeString("Operation not yet supported for file accumulator ~A");

  //// Initializers

  public void declareFunctions() {
    declare_file_utilities_file();
  }

  public void initializeVariables() {
    init_file_utilities_file();
  }

  public void runTopLevelForms() {
    setup_file_utilities_file();
  }

}
