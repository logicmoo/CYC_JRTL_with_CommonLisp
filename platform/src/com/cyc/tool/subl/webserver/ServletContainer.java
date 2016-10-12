//
//
//
package com.cyc.tool.subl.webserver;

import java.util.ArrayList;
import java.util.List;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTrampolineFile;

public class ServletContainer extends SubLTrampolineFile {
	public static class WarSpec {
		private String filename;

		private String contextRoot;

		public WarSpec(String file, String contextRoot) {
			this.filename = file;
			this.contextRoot = contextRoot;
		}

		public String getContextRoot() {
			return this.contextRoot;
		}

		public String getFilename() {
			return this.filename;
		}
	}

	public static SubLFile me;

	static {
		ServletContainer.me = new ServletContainer();
	}

	public static SubLObject startServletContainerInt(int portNum, List<WarSpec> warSpecs, SubLObject tmpDirString) {
		String tmpDir = tmpDirString == CommonSymbols.UNPROVIDED ? null : tmpDirString.getString();
		Jetty.startJettyServer(portNum, warSpecs, tmpDir);
		return CommonSymbols.NIL;
	}

	public static SubLObject startServletContainerInt(SubLObject port, SubLObject fileSpecs, SubLObject tmpDirString) {
		String tmpDir = tmpDirString == CommonSymbols.UNPROVIDED ? null : tmpDirString.getString();
		int portNum = port.toInteger().intValue();
		List<WarSpec> warSpecs = new ArrayList<WarSpec>();
		for (SubLObject fileSpec : fileSpecs.asConsList().toSubLObjectArray()) {
			SubLList alistEntry = fileSpec.asConsList();
			warSpecs.add(new WarSpec(alistEntry.first().getString(), alistEntry.rest().getString()));
		}
		Jetty.startJettyServer(portNum, warSpecs, tmpDir);
		return CommonSymbols.NIL;
	}

	public static SubLObject stopServletContainerInt(SubLObject tmpDirString) {
		String tmpDir = tmpDirString == CommonSymbols.UNPROVIDED ? null : tmpDirString.getString();
		Jetty.stopJettyServer(tmpDir);
		return CommonSymbols.NIL;
	}

	public void declareFunctions() {
		SubLFiles.declareFunction(ServletContainer.me, "startServletContainerInt", "START-SERVLET-CONTAINER-INT", 2, 1,
				false);
		SubLFiles.declareFunction(ServletContainer.me, "stopServletContainerInt", "STOP-SERVLET-CONTAINER-INT", 0, 1,
				false);
	}

	public void initializeVariables() {
	}

	public void runTopLevelForms() {
	}
}
