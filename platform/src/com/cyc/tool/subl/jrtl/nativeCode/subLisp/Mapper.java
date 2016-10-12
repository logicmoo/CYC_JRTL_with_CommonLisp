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

package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

//// Internal Imports
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//// External Imports
import java.io.OutputStream;

import com.cyc.tool.subl.jrtl.nativeCode.mapper.LoadMap;
import com.cyc.tool.subl.jrtl.nativeCode.mapper.Snapshot;
import com.cyc.tool.subl.jrtl.nativeCode.mapper.Snapshot.SnapShootingListener;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLStream;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;

public class Mapper implements SubLFile {

	//// Constructors

	public static SubLFile me = new Mapper();

	static private String mapFileFromStateFileName(String stateFileName) {
		return stateFileName.concat(".map");
	}

	//// Public Area

	public static SubLObject write_image(SubLObject filename, SubLObject do_full_gc) {
		if (do_full_gc == CommonSymbols.UNPROVIDED)
			do_full_gc = CommonSymbols.NIL;
		try {
			return Mapper.write_image_internal(filename);
		} catch (IOException xcpt) {
			Errors.error(xcpt);
		}
		return CommonSymbols.NIL;
	}

	//// Private Area

	static private SubLObject write_image_internal(SubLObject subLFileName) throws IOException {
		LoadMap loadMap = Mapper.writeStateFile(subLFileName);
		Mapper.writeMapFile(subLFileName, loadMap);
		return CommonSymbols.T;
	}

	static private void writeMapFile(SubLObject subLFileName, LoadMap loadMap) throws IOException {
		String mapFileName = Mapper.mapFileFromStateFileName(subLFileName.getString());
		OutputStream os = new BufferedOutputStream(new FileOutputStream(mapFileName));
		loadMap.save(os);
		os.close();
	}

	static private LoadMap writeStateFile(SubLObject subLFileName) throws IOException {
		LoadMap loadMap = LoadMap.newLoadMap();
		SubLObject rawStream = compatibility.open_binary(subLFileName, CommonSymbols.OUTPUT_KEYWORD);
		SubLStream stateStream = rawStream.toOutputStream();
		Mapper.writeStateInformation(stateStream, loadMap);
		streams_high.close(rawStream, CommonSymbols.NIL);
		return loadMap;
	}

	static private void writeStateInformation(SubLStream stateStream, LoadMap loadMap) throws IOException {
		Snapshot snapShot = new Snapshot(stateStream);
		SnapShootingListener mapListener = loadMap.getListener();
		// @uncomment this if debugging is not needed
		SnapShootingListener traceListener = new Snapshot.SnapShootingListener() {

			public void noteSymbol(String pkgName, String symbolName, SubLObject filePosition) {
				System.out.println(";;; writing " + pkgName + "::" + symbolName + " at " + filePosition);
			}

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

	/** Creates a new instance of Mapper. */
	public Mapper() {
	}

	//// Initializers

	public void declareFunctions() {
		SubLFiles.declareFunction(Mapper.me, "write_image", "WRITE-IMAGE", 1, 1, false);
	}

	public void initializeVariables() {
	}

	public void runTopLevelForms() {
	}

	//// Protected Area

	//// Private Area

	//// Internal Rep

	//// Main

}
