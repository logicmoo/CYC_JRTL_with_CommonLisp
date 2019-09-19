/* For LarKC */
package com.cyc.tool.subl.webserver;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.armedbear.lisp.Lisp;
import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.ContextHandlerCollection;
import org.eclipse.jetty.util.resource.Resource;
import org.eclipse.jetty.webapp.WebAppClassLoader;
import org.eclipse.jetty.webapp.WebAppContext;
import org.logicmoo.system.Startup;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.util.IsolatedClassLoader;
import com.cyc.tool.subl.webserver.ServletContainer.WarSpec;

public class Jetty implements CommonSymbols {
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
					}
				}
		try {
			dir.delete();
		} catch (Throwable t) {
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

	public static void start() {
		startJettyServer(ServletContainer.usePortNum, ServletContainer.useWarSpecs, ServletContainer.useTmpDir);
	}

	public static void stop() {
		stopJettyServer(ServletContainer.useTmpDir);
	}

	protected static synchronized void startJettyServer(int port, List<WarSpec> warFiles, String tmpDirString) {
		//addJettyClassesToClasspath(IsolatedClassLoader.getCommonClassLoader());

		Label_0411: {
			try {
				//configChecks();
			} catch (Exception e) {
				e.printStackTrace();
			}

			boolean wasJettyRunning = isJettyRunning();
			if (wasJettyRunning) {
				info("Jetty is already running on port " + jettyServer.getConnectors()[0]);
				break Label_0411;
			}
			try {
				File tmpDir = tmpDirString != null ? new File(tmpDirString) : null;
				possiblyDeleteTmpDir(tmpDir);
				//deleteDir(tmpDirString);
				jettyServer = new Server(port);
				ContextHandlerCollection handlers = (ContextHandlerCollection) jettyServer.getHandler();
				if (handlers == null) {
					handlers = new ContextHandlerCollection();
					jettyServer.setHandler(handlers);
					handlers = (ContextHandlerCollection) jettyServer.getHandler();
				}

				for (WarSpec war : warFiles) {
					WebAppContext ctx = addWarSpec(tmpDir, handlers, war);
					if (ctx != null) {
						if (false) {
							WebAppClassLoader classLoader = new CycWebAppClassLoader(IsolatedClassLoader.getCommonClassLoader(), ctx);
							ctx.setClassLoader(classLoader);
						}
						ctx.setParentLoaderPriority(true);
						if (!jettyContexts.contains(ctx)) {
							jettyContexts.add(ctx);
						}
					}

				}
				jettyServer.setHandler(handlers);
				wasJettyRunning = isJettyRunning();
				if (wasJettyRunning) {
					info("Jetty server started on port " + port);
					break Label_0411;
				}
				jettyServer.start();
				wasJettyRunning = isJettyRunning();
				if (wasJettyRunning) {
					info("Jetty server started on port " + port);
					break Label_0411;
				}
				throw new JettyStartFailureException("Jetty server failed to start on port " + port);
			} catch (JettyStartFailureException ex) {
				ex.printStackTrace();
				throw ex;
			} catch (Exception ex2) {
				ex2.printStackTrace();
				throw new RuntimeException("Jetty server failed to start on port " + Lisp.valueOfString(port), ex2);
			} catch (Error ex2) {
				ex2.printStackTrace();
				throw new RuntimeException("Jetty server failed to start on port " + Lisp.valueOfString(port), ex2);
			}
		}
		try {
			//Startup.enableAjaxSwing();
			Handler[] handlersA = ((ContextHandlerCollection) jettyServer.getHandler()).getHandlers();
			for (Handler h : handlersA) {
				System.err.println("Handler=" + h);
			}
			for (WebAppContext h : jettyContexts) {
				vetWebApp(h);
				System.err.println("WebAppContext=" + h); // h.setAvailable(true);
			}
			//configChecks();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * TODO Describe the purpose of this method.
	 */
	private static void addJettyClassesToClasspath(ClassLoader cl) {
		// TODO Auto-generated method stub
		final File LibDir = new File(Startup.getPlatformDir(), "lib");
		if (LibDir != null) {
			for (File f : LibDir.listFiles()) {
				if (f.isDirectory()) {
					final String shortName = f.getName().toLowerCase();
					if (shortName.contains("unused"))
						continue;
					if (shortName.contains("~"))
						continue;
					if (shortName.contains("-deps")) {
						try {
							final URL url = f.getCanonicalFile().toURL();
							IsolatedClassLoader.addURLToClassloader("addJettyClassesToClasspath", cl, url);
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}
	}

	final static List<WebAppContext> jettyContexts = new ArrayList(20);

	public static final class CycWebAppClassLoader extends WebAppClassLoader {
		/**
		 * TODO Describe this constructor.
		 * @param parent
		 * @param context
		 */
		private CycWebAppClassLoader(ClassLoader parent, org.eclipse.jetty.webapp.WebAppClassLoader.Context context) throws IOException {
			super(parent, context);
		}

		@Override
		public Class<?> findClass(String name) throws ClassNotFoundException {
			Class found;
			try {
				found = super.findClass(name);
				return found;
			} catch (ClassNotFoundException e) {
				if (neverFind(name))
					throw e;
				found = maybeGlobal(name);
				if (found != null)
					return found;
				e.printStackTrace();
				throw e;
			} catch (Error e) {
				e.printStackTrace();
				found = maybeGlobal(name);
				if (found != null)
					return found;
				throw e;
			}
		}

		private boolean neverFind(String name) {
			return name.contentEquals("java.util.ConcurrentNavigableMap");
		}

		private Class maybeGlobal(String name) {

			Class found = classMap.get(name);
			if (found != null)
				return found;
			if (name.contentEquals("org.apache.xerces.jaxp.SAXParserFactoryImpl")) {
				return org.apache.xerces.jaxp.SAXParserFactoryImpl.class;
			}
			return found;
		}

		@Override
		public void setDefaultAssertionStatus(boolean enabled) {
			super.setDefaultAssertionStatus(enabled);
		}

		/* (non-Javadoc)
		 * @see org.eclipse.jetty.webapp.WebAppClassLoader#addClassPath(java.lang.String)
		 */
		@Override
		public void addClassPath(String classPath) throws IOException {
			super.addClassPath(classPath);
		}

		/* (non-Javadoc)
		 * @see org.eclipse.jetty.webapp.WebAppClassLoader#addJars(org.eclipse.jetty.util.resource.Resource)
		 */
		@Override
		public void addJars(Resource lib) {
			super.addJars(lib);
		}

		//		/* (non-Javadoc)
		//		 * @see org.eclipse.jetty.webapp.WebAppClassLoader#addTransformer(java.lang.instrument.ClassFileTransformer)
		//		 */
		//		@Override
		//		public void addTransformer(ClassFileTransformer transformer) {
		//			super.addTransformer(transformer);
		//		}
	}

	private static WebAppContext addWarSpec(File tmpDir, ContextHandlerCollection handlers, WarSpec war) throws IOException {
		final String warFilename = webappHome + war.getFilename();
		File warFile = new File(warFilename);
		final String contextRoot = war.getContextRoot();
		WebAppContext webapp = new WebAppContext();
		webapp.setContextPath(contextRoot);
		if (new File(warFilename).isDirectory()) {
			String webappDirLocation = warFilename;
			String asWebApp = asWebApp(webappDirLocation);
			webapp.setDescriptor(asWebApp);
			webapp.setResourceBase(webappDirLocation);
			handlers.addHandler(webapp);
			vetWebApp(webapp);
			return webapp;
		} else if (warFilename.endsWith(".war")) {
			if (true) {
				String webappDirLocation = warFilename.substring(0, (int) warFilename.length() - 4);
				String asWebApp = asWebApp(webappDirLocation);
				if (new File(webappDirLocation).exists()) {
					webapp.setDescriptor(asWebApp);
					webapp.setResourceBase(webappDirLocation);
					handlers.addHandler(webapp);
					vetWebApp(webapp);
					return webapp;
				}
				if (webappDirLocation.contains("/apps/")) {
					webappDirLocation = webappDirLocation.replace("/apps/", "/");
					asWebApp = asWebApp(webappDirLocation);
					if (new File(webappDirLocation).exists()) {
						webapp.setDescriptor(asWebApp);
						webapp.setResourceBase(webappDirLocation);
						handlers.addHandler(webapp);
						vetWebApp(webapp);
						return webapp;
					}
				}
			}
			if (tmpDir != null) {
				File tmpAppDir = new File(tmpDir + war.getContextRoot());
				tmpAppDir.mkdirs();
				webapp.setTempDirectory(tmpAppDir);
				//tmpAppDir.deleteOnExit();
			}
			webapp.setWar(warFilename);
			handlers.addHandler(webapp);
			vetWebApp(webapp);
			return webapp;
		} else {
			Errors.warn(SubLObjectFactory.makeString("Unable to find " + warFile + ".  Not loading into \n"));
			return null;
		}
	}

	/**
	 * TODO Describe the purpose of this method.
	 * @param webappDirLocation
	 * @return
	 */
	static boolean isWebApp(String webappDirLocation) {
		String asWebApp = asWebApp(webappDirLocation);
		if (new File(asWebApp).exists()) {
			return true;
		}
		return false;
	}

	private static String asWebApp(String webappDirLocation) {
		String string = webappDirLocation + "/WEB-INF/web.xml";
		return string;
	}

	private static void info(String string) {
		PrintLow.format(T, SubLObjectFactory.makeString(string));
		PrintLow.format(T, SubLObjectFactory.makeString("~%"));
		streams_high.force_output(T);
	}

	private static boolean vetWebApp(WebAppContext webapp) {
		Throwable t = webapp.getUnavailableException();
		if (t != null) {
			info("BEGIN ERROR vetWebApp=" + webapp.toString());
			t.printStackTrace();
			info("END ERROR vetWebApp=" + webapp.toString());
			return false;
		}
		return true;
	}

	protected static synchronized void stopJettyServer(String tmpDirString) {
		try {
			if (jettyServer instanceof Server && jettyServer.isRunning()) {
				jettyServer.stop();

			}
		} catch (Exception e) {
			throw new RuntimeException("Problem encountered while trying to stop Jetty server.", e);
		}
		deleteDir(tmpDirString);
	}

	/**
	 * TODO Describe the purpose of this method.
	 * @return
	 */
	private static boolean isJettyRunning() {
		return jettyServer != null && jettyServer instanceof Server && jettyServer.isRunning();
	}

	private static Server jettyServer;
	private static String webappHome = "webapps/apps/";
	final private static HashMap<String, Class> classMap = new HashMap<String, Class>();
	static {
		if (!new File(webappHome).exists())
			webappHome = "webapps/";
	}

}
