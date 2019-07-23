/* For LarKC */
package com.cyc.tool.subl.webserver;

import static org.armedbear.lisp.Lisp.*;

import java.io.File;
import java.util.List;

import org.armedbear.lisp.Lisp;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.ContextHandlerCollection;
import org.eclipse.jetty.webapp.WebAppContext;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;

public class Jetty {
	public static class JettyStartFailureException extends RuntimeException {
		public JettyStartFailureException(String str) {
			super(str);
		}
	}

	private static void deleteDirectory(File dir) {
		File[] files = dir.listFiles();
		if (files != null)
			for (File f : files)
				if (f.isDirectory())
					deleteDirectory(f);
				else {
					try {
						f.delete();
					} catch (Throwable t) {
						t.printStackTrace();
					}
				}
		try {
			dir.delete();
		} catch (Throwable t) {
			t.printStackTrace();
		}

	}


	private static void deleteDir(String tmpDirString) {
		File tmpDir = tmpDirString == null ? null : new File(tmpDirString);
		possiblyDeleteTmpDir(tmpDir);
	}

	private static void possiblyDeleteTmpDir(File tmpDir) {
		if (tmpDir != null && tmpDir.exists()) {
		/*	PrintLow.format(T,
					SubLObjectFactory.makeString("Clearing old webapp tmp directory: " + tmpDir.getAbsolutePath()));
			streams_high.force_output(T);*/

			deleteDirectory(tmpDir);
		}
	}

	protected static synchronized void startJettyServer(int port, List<ServletContainer.WarSpec> warFiles,
			String tmpDirString) {
		Label_0411: {
		 deleteDir(tmpDirString);
			if (Jetty.jettyServer != null)
				if (!(Jetty.jettyServer instanceof Server) || Jetty.jettyServer.isRunning())
					break Label_0411;
			try {
				File tmpDir = tmpDirString != null ? new File(tmpDirString) : null;
				possiblyDeleteTmpDir(tmpDir);
				Jetty.jettyServer = new Server(port);
				ContextHandlerCollection handlers = new ContextHandlerCollection();
				for (ServletContainer.WarSpec war : warFiles) {
					String warFilename = "webapps/apps/" + war.getFilename();
					File warFile = new File(warFilename);
					if (warFile.canRead()) {
						WebAppContext webapp = new WebAppContext();
						webapp.setContextPath(war.getContextRoot());
						if (tmpDir != null) {
							File tmpAppDir = new File(tmpDir + war.getContextRoot());
							tmpAppDir.mkdirs();
							webapp.setTempDirectory(tmpAppDir);
							tmpAppDir.deleteOnExit();
						}
						webapp.setWar("webapps/apps/" + war.getFilename());
						handlers.addHandler(webapp);
					} else {
						PrintLow.format(T, SubLObjectFactory
								.makeString("Unable to find " + warFile + ".  Not loading into Jetty.\n"));
						streams_high.force_output(T);
					}
				}
				Jetty.jettyServer.setHandler(handlers);
				Jetty.jettyServer.start();
				if (Jetty.jettyServer.isRunning()) {
					PrintLow.format(T,
							SubLObjectFactory.makeString("Jetty server started on port " + port));
					return;
				}
				throw new JettyStartFailureException("Jetty server failed to start on port " + port);
			} catch (JettyStartFailureException ex) {
				throw ex;
			} catch (Exception ex2) {
				throw new RuntimeException("Jetty server failed to start on port " + Lisp.valueOfString(port), ex2);
			}
		}
		PrintLow.format(T, SubLObjectFactory
				.makeString("Jetty is already running on port " + Jetty.jettyServer.getConnectors()[0].getLocalPort()));
	}

	protected static synchronized void stopJettyServer(String tmpDirString) {
		try {
			if (Jetty.jettyServer instanceof Server && Jetty.jettyServer.isRunning()) {
				Jetty.jettyServer.stop();

			}
		} catch (Exception e) {
			throw new RuntimeException("Problem encountered while trying to stop Jetty server.", e);
		}
		deleteDir(tmpDirString);
	}


	private static Server jettyServer;
	private static String webappHome = "webapps/apps/";
}
