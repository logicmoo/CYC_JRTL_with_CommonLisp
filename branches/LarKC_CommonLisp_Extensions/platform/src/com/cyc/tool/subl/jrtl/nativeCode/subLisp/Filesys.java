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

package  com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.SubLException;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.FileSystem;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import java.util.ArrayList;
import java.io.File;

//// External Imports

public  class Filesys extends SubLTrampolineFile {
  
  //// Constructors
  
  /** Creates a new instance of Filesys. */
  public Filesys() {}
  public static final SubLFile me = new Filesys();
  
  public static SubLSymbol $canonical_null_file_stream_path$;

  //// Public Area
  
  public static final SubLObject construct_filename(SubLObject directory_list, SubLObject filename, SubLObject extension, SubLObject relativeP) {
    final SubLList directoryListTyped = directory_list.toList();
    final String filenameTyped = (filename == NIL) ? "" : filename.getString();
    if (extension == UNPROVIDED) { extension = NIL; }
    String extensionTyped = (extension == NIL) ? null : extension.getString();
    if (relativeP == UNPROVIDED) { relativeP = NIL; }
    boolean isRelative = (relativeP != NIL);
    String result = FileSystem.constructFileName(directoryListTyped, filenameTyped, extensionTyped, isRelative);
    return SubLObjectFactory.makeString(result);
  }
  
  public static final SubLObject delete_directory(SubLObject directory_name, SubLObject recursiveP) {
    directory_name = pathname_designator_pathname(directory_name);
    final String directoryNameTyped = directory_name.getString();
    if (recursiveP == UNPROVIDED) { recursiveP = NIL; }
    final boolean deleteRecursively = (recursiveP != NIL);
    final boolean result = FileSystem.deleteDirectory(directoryNameTyped, deleteRecursively);
    return SubLObjectFactory.makeBoolean(result);
  }
  
  public static final SubLObject delete_file(SubLObject filename) {
    filename = pathname_designator_pathname(filename);
    final String filenameTyped = filename.getString();
    final boolean result = FileSystem.deleteFile(filenameTyped);
    return SubLObjectFactory.makeBoolean(result);
  }
  
  public static final SubLObject directory(SubLObject directory_name, SubLObject include_directory) {
    directory_name = pathname_designator_pathname(directory_name);
    final String directoryNameTyped = directory_name.getString();
    if (include_directory == UNPROVIDED) { include_directory = NIL; }
    final boolean includeDirectory = (include_directory != NIL);
    final ArrayList directoryContents = FileSystem.getDirectoryContents(directoryNameTyped, includeDirectory);
    return SubLObjectFactory.makeList(directoryContents);
  }
  
  public static final SubLObject directory_p(SubLObject pathspec) {
    if (pathspec.isString()) {
      try {
        pathspec = pathname_designator_pathname(pathspec);
      } catch (RuntimeException re) {
        return NIL;
      }
      final String pathspecTyped = pathspec.getString();
      final boolean result = FileSystem.isDirectory(pathspecTyped);
      return SubLObjectFactory.makeBoolean(result);
    } else {
      return NIL;
    }
  }
  
  public static final SubLObject file_author(SubLObject filename) {
    filename = pathname_designator_pathname(filename);
    final String filenameTyped = filename.getString();
    // @stub the Java API provides no way to get at the file's author
    return NIL;
  }
  
  public static final SubLObject file_write_date(SubLObject filename) {
    filename = pathname_designator_pathname(filename);
    final String filenameTyped = filename.getString();
    final long modificationTime = FileSystem.fileModificationTime(filenameTyped);
    final SubLObject result = Time.unixTimeToUniversalTime(modificationTime);
    return result;
  }
  
  public static final SubLObject make_directory(SubLObject directory_name, SubLObject path, SubLObject mode) {
    // @todo handle streams.  make extractPath in the SubLTrampolines file
    directory_name = pathname_designator_pathname(directory_name);
    if (path == UNPROVIDED) { path = NIL; }
    if (mode == UNPROVIDED) { mode = NIL; }
    final String directoryNameTyped = directory_name.getString();
    final String pathTyped = (path == NIL) ? System.getProperty("user.dir") : path.getString();
    // @mode is ignored, cannot be implemented in Java
    final boolean result = FileSystem.makeDirectory( pathTyped, directoryNameTyped);
    return result ? directory_name : (SubLObject)NIL;
  }
  
  public static final SubLObject probe_file(SubLObject filename) {
    filename = pathname_designator_pathname(filename);
    final String filenameTyped = filename.getString();
    final String result = FileSystem.fileExists(filenameTyped);
    if (result == null) {
      return NIL;
    } else {
      return SubLObjectFactory.makeString(result);
    }
  }
  
  public static final SubLObject rename_file(SubLObject filename, SubLObject new_name) {
    filename = pathname_designator_pathname(filename);
    final String filenameTyped = filename.getString();
    new_name = pathname_designator_pathname(new_name);
    final String newNameTyped = new_name.getString();
    final Object[] results = FileSystem.renameFile(filenameTyped, newNameTyped);
    if (Boolean.TRUE.equals(results[0])) {
      return Values.values( new_name,
              SubLObjectFactory.makeString(results[1].toString()),
              SubLObjectFactory.makeString(results[2].toString()));
    } else {
      return Errors.error("Could not rename " + results[1] + " to " + results[2]);
    }
  }

  public static final SubLObject canonical_null_file_stream_path() {
    return $canonical_null_file_stream_path$.getValue();
  }
  
  /*
   * this should actually be in streams-high 
   */
  static final SubLObject pathname_designator_pathname(SubLObject pathspec) {
    return SubLObjectFactory.makeString(pathspec.getFileDesignator());
  }
  
  //// Initializers
  
  public void declareFunctions() {
    SubLFiles.declareFunction(me, "construct_filename", "CONSTRUCT-FILENAME", 2, 2, false);
    SubLFiles.declareFunction(me, "delete_directory", "DELETE-DIRECTORY", 1, 1, false);
    SubLFiles.declareFunction(me, "delete_file", "DELETE-FILE", 1, 0, false);
    SubLFiles.declareFunction(me, "directory", "DIRECTORY", 1, 1, false);
    SubLFiles.declareFunction(me, "directory_p", "DIRECTORY-P", 1, 0, false);
    SubLFiles.declareFunction(me, "file_author", "FILE-AUTHOR", 1, 0, false);
    SubLFiles.declareFunction(me, "file_write_date", "FILE-WRITE-DATE", 1, 0, false);
    SubLFiles.declareFunction(me, "make_directory", "MAKE-DIRECTORY", 1, 2, false);
    SubLFiles.declareFunction(me, "probe_file", "PROBE-FILE", 1, 0, false);
    SubLFiles.declareFunction(me, "rename_file", "RENAME-FILE", 2, 0, false);
    SubLFiles.declareFunction(me, "canonical_null_file_stream_path", "CANONICAL-NULL-FILE-STREAM-PATH", 0, 0, false);
  }
  
  public void initializeVariables() {
    $canonical_null_file_stream_path$ 
      = SubLFiles.defconstant(me, "*CANONICAL-NULL-FILE-STREAM-PATH*",
                              guessCanonicalNullFileStreamPath());
  }
  
  public void runTopLevelForms() {
  }
  
  //// Protected Area
  
  //// Private Area
  static final SubLObject guessCanonicalNullFileStreamPath() {
    // @rck 20070626 per APB, we dont want to return any other value as the UN*X one
    return SubLObjectFactory.makeString("/dev/null");
    /*
      // original version
      if (File.separatorChar == '/') {
        // guess that this is a UNIX-like file system
        return SubLObjectFactory.makeString("/dev/null");
      } else {
        // guess that this is a Win* file system
        return SubLObjectFactory.makeString("NUL:");
      }
    */
  }
  
  //// Internal Rep
  
  //// Main
  
}
