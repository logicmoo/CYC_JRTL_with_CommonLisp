/* For LarKC */
package com.cyc.tool.subl.webserver;

import static com.cyc.tool.subl.util.IsolatedClassLoader.classDupes;
import static com.cyc.tool.subl.util.IsolatedClassLoader.configChecks;
import static org.logicmoo.system.Startup.*;
import static org.armedbear.lisp.Lisp.T;

import java.io.File;
import java.io.IOException;
import java.lang.instrument.ClassFileTransformer;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import org.armedbear.lisp.Lisp;
import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.ContextHandlerCollection;
import org.eclipse.jetty.util.resource.Resource;
import org.eclipse.jetty.webapp.WebAppClassLoader;
import org.eclipse.jetty.webapp.WebAppContext;
import org.logicmoo.system.Startup;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.util.IsolatedClassLoader;

public class NewJetty {

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
			final String absolutePath = tmpDir.getAbsolutePath();
			String lc = absolutePath.toLowerCase();
			if (lc.contains("tmp") || lc.contains("temp")) {
				PrintLow.format(T, SubLObjectFactory.makeString("Clearing old webapp tmp directory: " + absolutePath));
				streams_high.force_output(T);
				deleteDirectory(tmpDir);
			}
		}
	}

	protected static synchronized void startJettyServer(int port, List<ServletContainer.WarSpec> warFiles, String tmpDirString) {
		addJettyClassesToClasspath();

		Label_0411: {
			try {
				if (isJettyRunning()) {
					info("Jetty is already running on port " + Arrays.toString(jettyServer.getConnectors()));
					break Label_0411;
				}
			} catch (Exception e) {
				e.printStackTrace();
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

				for (ServletContainer.WarSpec war : warFiles) {
					WebAppContext ctx = addWarSpec(tmpDir, handlers, war);
					if (ctx != null) {
						if (!jettyContexts.contains(ctx)) {
							//info("ADD: " + ctx);
							jettyContexts.add(ctx);
						}
					}

				}
				jettyServer.setHandler(handlers);

				if (false) {
					final ContextHandlerCollection contextHandlerCollection = (ContextHandlerCollection) jettyServer.getHandler();
					Handler[] handlersA = contextHandlerCollection.getHandlers();
					for (Handler h : handlersA) {
						info("Handler=" + h);

					}
				}
				jettyServer.start();

				if (isJettyRunning()) {
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
			Startup.enableAjaxSwing();
			final ContextHandlerCollection contextHandlerCollection = (ContextHandlerCollection) jettyServer.getHandler();
			Handler[] handlersA = contextHandlerCollection.getHandlers();
			for (Handler h : handlersA) {
				info("Handler=" + h);
			}
			for (WebAppContext h : jettyContexts) {
				vetWebApp(h);
				info("WebAppContext=" + h);
				//	h.setAvailable(true);
			}
			configChecks();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void jettyConfigChecks() throws IOException {
		classDupes(javax.servlet.ServletContext.class);
		classDupes(org.apache.jasper.servlet.JspServlet.class);
		classDupes(ContextHandlerCollection.class);
		classDupes(Server.class);
		classDupes(WebAppContext.class);
		classDupes(org.eclipse.jetty.security.SecurityHandler.class);
		//classDupes(com.sun.jndi.url.java.javaURLContextFactory.class);
		classDupes("com.sun.jndi.url.java.javaURLContextFactory");
		classDupes("org.eclipse.jetty.webapp.WebAppClassLoader$Context");
	}

	/**
	 * TODO Describe the purpose of this method.
	 */
	private static void addJettyClassesToClasspath() {
		// TODO Auto-generated method stub
		ClassLoader cl = IsolatedClassLoader.getCommonClassLoader();
		final File file = new File("lib/jetty-libs/");
		if (file.exists()) {
			for (File f : file.listFiles()) {
				final String name = f.getName();
				if (name.endsWith("v20190813.jar") && name.startsWith("jetty-")) {
					try {
						final URL url = f.getCanonicalFile().toURL();
						IsolatedClassLoader.addURL(cl, url);
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
		try

		{
			jettyConfigChecks();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	final static List<WebAppContext> jettyContexts = new ArrayList(20);
	final static HashSet<String> neverFind = new HashSet<String>();
	static {
		neverFind.add("java.util.ConcurrentNavigableMap");
		// neverFind.add("com.sun.jndi.url.java.javaURLContextFactory");
	}

	static public class WebAppClassLoaderVis extends WebAppClassLoader {

		public WebAppClassLoaderVis(ClassLoader parent, Context context) throws IOException {
			super(parent, context);
		}

		@Override
		public Class<?> findClass(String name) throws ClassNotFoundException {
			return super.findClass(name);
		}

		@Override
		public void addClassPath(Resource resource) throws IOException {
			super.addClassPath(resource);
		}

		@Override
		public void addURL(URL url) {
			try {
				IsolatedClassLoader.addClassPath(url);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			super.addURL(url);
		}

		/* (non-Javadoc)
		 * @see org.eclipse.jetty.webapp.WebAppClassLoader#addClassPath(java.lang.String)
		 */
		@Override
		public void addClassPath(String classPath) throws IOException {
			IsolatedClassLoader.addToClassPath(classPath);
			super.addClassPath(classPath);
		}
	}

	public static final class CycWebAppClassLoader extends WebAppClassLoader {
		/**
		 * TODO Describe this constructor.
		 * @param parent
		 * @param context
		 */
		WebAppClassLoaderVis webAppClassLoader;

		private CycWebAppClassLoader(ClassLoader parent, org.eclipse.jetty.webapp.WebAppClassLoader.Context context) throws IOException {
			super(parent, context);
			if (parent instanceof WebAppClassLoaderVis) {
				webAppClassLoader = (WebAppClassLoaderVis) parent;
			}
		}

		@Override
		public Class<?> findClass(String name) throws ClassNotFoundException {
			Class found;
			try {
				found = super.findClass(name);
				return found;
			} catch (ClassNotFoundException e) {
				if (neverFind.contains(name))
					throw e;
				found = maybeGlobal(name);
				if (found != null)
					return found;
				if (webAppClassLoader != null)
					found = webAppClassLoader.findClass(name);
				if (found != null) {
					info("" + webAppClassLoader + " found " + name);
					return found;
				}
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

		@Override
		protected void addURL(URL url) {
			try {
				IsolatedClassLoader.addClassPath(url);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			super.addURL(url);
		}

		/* (non-Javadoc)
		 * @see org.eclipse.jetty.webapp.WebAppClassLoader#addClassPath(java.lang.String)
		 */
		@Override
		public void addClassPath(String classPath) throws IOException {
			IsolatedClassLoader.addToClassPath(classPath);
			super.addClassPath(classPath);
		}

		/* (non-Javadoc)
		 * @see org.eclipse.jetty.webapp.WebAppClassLoader#addJars(org.eclipse.jetty.util.resource.Resource)
		 */
		@Override
		public void addJars(Resource lib) {
			super.addJars(lib);
		}

		/* (non-Javadoc)
		 * @see org.eclipse.jetty.webapp.WebAppClassLoader#addTransformer(java.lang.instrument.ClassFileTransformer)
		 */
		public void addTransformer(ClassFileTransformer transformer) {
			Class baseClass = getClass().getSuperclass();
			Method found = null;
			try {
				found = baseClass.getMethod("addTransformer", ClassFileTransformer.class);
			} catch (NoSuchMethodException e1) {
				return;
			} catch (SecurityException e1) {
			}
			try {
				MethodHandle h1 = MethodHandles.lookup().findSpecial(found.getDeclaringClass(), "addTransformer", MethodType.methodType(void.class), ClassFileTransformer.class);
				h1.invokeExact(transformer);
			} catch (NoSuchMethodException | IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			//MethodHandle h2 = MethodHandles.lookup().findSpecial(Object.class, "toString", MethodType.methodType(String.class), Test.class);
			//super.addTransformer(transformer);
		}
	}

	private static WebAppContext addWarSpec(File tmpDir, ContextHandlerCollection handlers, ServletContainer.WarSpec war) throws IOException {
		final String warFilename = webappHome + war.getFilename();
		File warFile = new File(warFilename);
		final String contextRoot = war.getContextRoot();
		WebAppContext webapp = new WebAppContext();
		webapp.setContextPath(contextRoot);
		//final WebAppClassLoaderVis parent = new WebAppClassLoaderVis(IsolatedClassLoader.getCommonClassLoader(), webapp);
		//CycWebAppClassLoader classLoader = new CycWebAppClassLoader(parent, webapp);
		//		final WebAppClassLoader parent = new CycWebAppClassLoader(IsolatedClassLoader.getCommonClassLoader(), webapp);
		//		final WebAppClassLoader classLoader = new WebAppClassLoaderVis(parent, webapp);
		//final WebAppClassLoader classLoader = new WebAppClassLoaderVis(IsolatedClassLoader.getCommonClassLoader(), webapp);
		//webapp.setClassLoader(classLoader);
		webapp.setParentLoaderPriority(true);
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
		Startup.getNoticeStream().println(string);
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
