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

import com.cyc.tool.subl.jrtl.nativeCode.mapper.LoadMap;
import com.cyc.tool.subl.jrtl.nativeCode.mapper.Snapshot;
import com.cyc.tool.subl.jrtl.nativeCode.mapper.Snapshot.SnapShootingListener;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLStream;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;

//// Internal Imports
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//// External Imports
import java.io.OutputStream;

public  class Mapper implements SubLFile {
  
  //// Constructors
  
  /** Creates a new instance of Mapper. */
  public Mapper() {}
  public static final SubLFile me = new Mapper();
  
   
  //// Public Area
  
  public static final SubLObject write_image(SubLObject filename, SubLObject do_full_gc) {
    if ((do_full_gc == UNPROVIDED)) {
      do_full_gc = NIL;
    }
    try {
      return write_image_internal(filename);
    } catch (IOException xcpt) {
      Errors.error(xcpt);
    }
    return NIL;
  }
 
  
  //// Private Area
  
  static private final SubLObject write_image_internal(SubLObject subLFileName) throws IOException {
    final LoadMap loadMap = writeStateFile(subLFileName);
    writeMapFile(subLFileName, loadMap);    
    return T;
  }
  
  static private final String mapFileFromStateFileName(String stateFileName) {
    return stateFileName.concat(".map");
  }
  
  static private final void writeMapFile( SubLObject subLFileName, LoadMap loadMap) throws IOException {
    final String mapFileName = mapFileFromStateFileName(subLFileName.getString());
    final OutputStream os = new BufferedOutputStream(new FileOutputStream(mapFileName));
    loadMap.save(os);
    os.close();
  }
  
  static private final LoadMap writeStateFile(SubLObject subLFileName) throws IOException {
    final LoadMap loadMap = LoadMap.newLoadMap();
    final SubLObject rawStream = compatibility.open_binary(subLFileName, CommonSymbols.OUTPUT_KEYWORD);
    final SubLStream stateStream = rawStream.toOutputStream();
    writeStateInformation(stateStream, loadMap);
    streams_high.close(rawStream, CommonSymbols.NIL);        
    return loadMap;
  }
  
  static private final void writeStateInformation(SubLStream stateStream, LoadMap loadMap) throws IOException {
    final Snapshot snapShot = new Snapshot(stateStream);
    final SnapShootingListener mapListener = loadMap.getListener();
    // @uncomment this if debugging is not needed
    final SnapShootingListener traceListener = new Snapshot.SnapShootingListener() {

      @Override
      public void noteSymbol(String pkgName, String symbolName, SubLObject filePosition) {
        System.out.println(";;; writing " + pkgName + "::" + symbolName + " at " + filePosition);
      }

      @Override
      public void skippedSymbol(String pkgName, String symbolName, Exception xcpt) {
        System.out.println(";;; skipping " + pkgName + "::" + symbolName + ": " + xcpt.getMessage());
      }
    };
    snapShot.addListener(mapListener);
    snapShot.addListener(traceListener);
    snapShot.snapShoot();
    snapShot.removeListener(mapListener);
    snapShot.removeListener(traceListener);    
  }
  
  //// Initializers
  
  @Override
  public void declareFunctions() {
    SubLFiles.declareFunction(me, "write_image", "WRITE-IMAGE", 1, 1, false);
  }
  
  @Override
  public void initializeVariables() {
  }
  
  @Override
  public void runTopLevelForms() {
  }
  
  //// Protected Area
  
  //// Private Area
  
  //// Internal Rep
  
  //// Main
  
}
