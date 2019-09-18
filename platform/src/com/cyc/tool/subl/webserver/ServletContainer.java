/* For LarKC */
package com.cyc.tool.subl.webserver;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;

public class ServletContainer extends SubLSystemTrampolineFile {

	public static List<WarSpec> useWarSpecs;
	public static int usePortNum;
	public static String useTmpDir;
	public static Class useTomcatOrJetty;
	static {
		try {
			Class.forName("org.eclipse.jetty.webapp.WebAppClassLoader");
			useTomcatOrJetty = Class.forName("com.cyc.tool.subl.webserver.BadJetty");
		} catch (ClassNotFoundException e2) {
			try {
				Class.forName("org.apache.catalina.startup.Catalina");
				useTomcatOrJetty = Class.forName("com.cyc.tool.subl.webserver.Tomcat");
			} catch (ClassNotFoundException e) {
				try {
					useTomcatOrJetty = Class.forName("com.cyc.tool.subl.webserver.BadJetty");
				} catch (ClassNotFoundException e1) {
				}
			}
		}
	}

	public static class WarSpec {
		public WarSpec(String file, String contextRoot) {
			filename = file;
			this.contextRoot = contextRoot;
		}

		private String filename;
		private String contextRoot;

		public String getContextRoot() {
			return contextRoot;
		}

		public String getFilename() {
			return filename;
		}
	}

	public static SubLObject startServletContainerInt(SubLObject port, SubLObject fileSpecs, SubLObject tmpDirString) {
		int portNum = port == UNPROVIDED ? 3603 : port.toInteger().intValue();
		List<WarSpec> warSpecs = new ArrayList<WarSpec>();
		for (SubLObject fileSpec : fileSpecs.asConsList().toSubLObjectArray()) {
			SubLList alistEntry = fileSpec.asConsList();
			warSpecs.add(new WarSpec(alistEntry.first().getStringValue(), alistEntry.rest().getStringValue()));
		}
		return startServletContainerInt(portNum, warSpecs, tmpDirString);
	}

	public static SubLObject startServletContainerInt(int portNum, List<WarSpec> warSpecs, SubLObject tmpDirString) {
		String tmpDir = tmpDirString == UNPROVIDED ? null : tmpDirString.getStringValue();
		usePortNum = portNum;
		useWarSpecs = warSpecs;
		useTmpDir = tmpDir;
		if (true) {
			Jetty.startJettyServer(portNum, warSpecs, tmpDir);
			return NIL;
		}
		if (useTomcatOrJetty != null) {

			//Tomcat.startJettyServer(portNum, warSpecs, tmpDir);
			try {
				useTomcatOrJetty.getDeclaredMethod("start").invoke(null);
			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return NIL;
	}

	public static SubLObject stopServletContainerInt(SubLObject tmpDirString) {
		String tmpDir = tmpDirString == UNPROVIDED ? null : tmpDirString.getStringValue();
		useTmpDir = tmpDir;
		//Jetty.stopJettyServer(tmpDir);
		//Tomcat.stopJettyServer(tmpDir);
		if (useTomcatOrJetty != null) {
			//Jetty.startJettyServer(portNum, warSpecs, tmpDir);
			//Tomcat.startJettyServer(portNum, warSpecs, tmpDir);
			try {
				useTomcatOrJetty.getDeclaredMethod("stop").invoke(null);
			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return NIL;
	}

	public static SubLFile me;
	static {
		me = new ServletContainer();
	}

	@Override
	public void declareFunctions() {
		declareFunction(me, "startServletContainerInt", "START-SERVLET-CONTAINER-INT", 2, 1, false);
		declareFunction(me, "stopServletContainerInt", "STOP-SERVLET-CONTAINER-INT", 0, 1, false);
	}

	@Override
	public void initializeVariables() {
	}

	@Override
	public void runTopLevelForms() {
	}
}
