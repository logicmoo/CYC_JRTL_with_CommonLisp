/* For LarKC */
package com.cyc.tool.subl.webserver;

import static com.cyc.tool.subl.util.IsolatedClassLoader.classDupes;
import static com.cyc.tool.subl.util.IsolatedClassLoader.configChecks;

import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.lang.instrument.ClassFileTransformer;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

import javax.servlet.http.HttpServletRequest;

import org.armedbear.lisp.Lisp;
import org.eclipse.jetty.demo.JettyMain.JspStarter;
import org.eclipse.jetty.jsp.JettyJspServlet;
import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.ContextHandlerCollection;
import org.eclipse.jetty.server.handler.ErrorHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.eclipse.jetty.util.resource.Resource;
import org.eclipse.jetty.webapp.WebAppClassLoader;
import org.eclipse.jetty.webapp.WebAppContext;
import org.logicmoo.system.Startup;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.IsolatedClassLoader;

public class Jetty {

	public static final IsolatedClassLoader sharingLoader = IsolatedClassLoader.theIsolatedClassLoader;

	public interface RunnableExc {

		void call();

	}

	public static boolean loadToParent;

	public static class CycWebAppContext extends WebAppContext {

		@Override
		protected void doStart() throws Exception {
			try {
				super.doStart();
			} catch (Throwable e) {
				e.printStackTrace();
			}
		}

		@Override
		public void preConfigure() throws Exception {
			try {
				File tmpDir = this.getTempDirectory();
				if (tmpDir != null) {
					String tmpDirStr = tmpDir.getAbsolutePath();
					if (tmpDirStr.endsWith("-UNSET")) {
						this.setTempDirectory(new File(tmpDir, "ROOT"));
						info("preConfigure " + this + " tempDir=" + getTempDirectory());

					}
				}
				super.preConfigure();
			} catch (Throwable e) {
				e.printStackTrace();
			}
			return;
		}

	}

	public static final class CycWebAppClassLoader extends WebAppClassLoader {
		/**
		 * TODO Describe this constructor.
		 * @param parent
		 * @param context
		 */
		private Context context;

		private CycWebAppClassLoader(org.eclipse.jetty.webapp.WebAppClassLoader.Context context) throws IOException {
			super(context);
			this.context = context;
		}

		@Override
		public Class<?> loadClass(String name) throws ClassNotFoundException {
			return with_classloader(this, () -> super.loadClass(name));
		}

		@Override
		protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
			if (neverFindOurselves(name)) {
				return with_classloader(this, () -> super.loadClass(name, resolve));
			}

			Class found;
			try {
				found = with_classloader(this, () -> sharingLoader.loadClass(name, resolve));
				if (found != null) {
					info(" sharingLoader found " + name);
					if (false && resolve) {
						claimResolveClass(found);
					}
					return found;
				}
			} catch (Throwable ee1) {
			}

			found = with_classloader(this, () -> super.loadClass(name, resolve));
			if (found != null) {
				info(" super found " + name);
				if (false && resolve) {
					claimResolveClass(found);
				}
				return found;
			}
			return found;
		}

		private void claimResolveClass(Class c) {
			//String s = c.getName();
			//classMap.put(s, c);
			with_classloader(this, () -> resolveClass(c));
		}

		@Override
		public void addClassPath(Resource resource) throws IOException {
			super.addClassPath(resource);
		}

		@Override
		public Class<?> findClass(String name) throws ClassNotFoundException {
			if (neverFindOurselves(name)) {
				return with_classloader(this, () -> super.findClass(name));
			}
			Class found;
			try {
				found = with_classloader(this, () -> sharingLoader.findClass(name));
				if (found != null) {
					info(" sharingLoader found " + name);
					return found;
				}
			} catch (Throwable ee1) {
			}
			found = with_classloader(this, () -> super.findClass(name));
			if (found != null) {
				info("super found " + name);
				return found;
			}
			return found;
		}

		private Class maybeGlobal(String name) {

			Class found = classMap.get(name);
			if (found != null)
				return found;
			//			if (name.contentEquals("org.apache.xerces.jaxp.SAXParserFactoryImpl")) {
			//				return org.apache.xerces.jaxp.SAXParserFactoryImpl.class;
			//			}

			return found;
		}

		@Override
		public void setDefaultAssertionStatus(boolean enabled) {
			super.setDefaultAssertionStatus(enabled);
		}

		@Override
		protected void addURL(URL url) {
			try {
				if (loadToParent)
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
			if (loadToParent)
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
				//PrintLow.format(T, SubLObjectFactory.makeString("Clearing old webapp tmp directory: " + absolutePath));
				//streams_high.force_output(T);
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
					//	break Label_0411;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

			try {
				File tmpDir = tmpDirString != null ? new File(tmpDirString) : null;
				possiblyDeleteTmpDir(tmpDir);

				ContextHandlerCollection handlers = ensureJettyServer(port);

				for (ServletContainer.WarSpec war : warFiles) {
					final String contextRoot = war.getContextRoot();
					final String id = contextKey(port, contextRoot);
					WebAppContext webapp = jettyContexts.get(id);
					if (webapp == null) {
						final String filename = war.getFilename();
						webapp = addWarSpec(port, tmpDir, filename, contextRoot);
						jettyContexts.put(id, webapp);
						handlers.addHandler(webapp);
						if (filename.endsWith(".war")) {
							ensureRunning(port, handlers, webapp);
						}
					}
				}
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
			} catch (Throwable ex2) {
				ex2.printStackTrace();
				throw new RuntimeException("Jetty server failed to start on port " + Lisp.valueOfString(port), ex2);
			}
		}
		try

		{
			Startup.enableAjaxSwing();
			Startup.configWebSwing();
			final ContextHandlerCollection contextHandlerCollection = (ContextHandlerCollection) jettyServer.getHandler();
			Handler[] handlersA = contextHandlerCollection.getHandlers();
			for (Handler h : handlersA) {
				WebAppContext webapp = (WebAppContext) h;
				//ensureRunning(port, contextHandlerCollection, webapp);
			}
			for (Map.Entry<String, WebAppContext> sh : jettyContexts.entrySet()) {
				final WebAppContext value = sh.getValue();
				vetWebApp(value);
				info("WebAppContext=" + value);
				//	h.setAvailable(true); 
			}
			configChecks();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param port
	 * @param contextHandlerCollection
	 * @param webapp
	 */
	public static void ensureRunning(int port, final ContextHandlerCollection contextHandlerCollection, WebAppContext webapp) {
		try {
			if (vetWebApp(webapp)) {
				if (!webapp.isRunning()) {
					try {
						webapp.start();
					} catch (Exception e) {
						e.printStackTrace();
						webapp.stop();
						throw e;
					}
					vetWebApp(webapp);
				}
			}
		} catch (Throwable t) {
			t.printStackTrace();
			final String id = contextKey(port, webapp.getContextPath());
			jettyContexts.remove(id);
			contextHandlerCollection.removeHandler(webapp);
		}
	}

	public static ContextHandlerCollection ensureJettyServer(int port) throws IOException {
		//deleteDir(tmpDirString);
		if (jettyServer == null) {
			jettyServer = new Server(port);
			ContextHandlerCollection handlers = (ContextHandlerCollection) jettyServer.getHandler();
			if (handlers == null) {
				handlers = new ContextHandlerCollection();
				jettyServer.setHandler(handlers);
				handlers = (ContextHandlerCollection) jettyServer.getHandler();
			}
			try {
				jettyServer.start();
			} catch (Throwable t) {
				throw new IOException(t);
			}
		}
		return (ContextHandlerCollection) jettyServer.getHandler();
	}

	private static void jettyConfigChecks() throws IOException {
		classDupes(javax.servlet.ServletContext.class);
		//classDupes(org.apache.jasper.servlet.JspServlet.class);
		classDupes(ContextHandlerCollection.class);
		classDupes(Server.class);
		classDupes(WebAppContext.class);
		classDupes(org.eclipse.jetty.security.SecurityHandler.class);
		//classDupes(com.sun.jndi.url.java.javaURLContextFactory.class);
		classDupes("com.sun.jndi.url.java.javaURLContextFactory");
		classDupes("org.eclipse.jetty.webapp.WebAppClassLoader$Context");
		//classDupes("org.glassfish.jersey.internal.inject.AbstractBinder");
		//classDupes(org.glassfish.jersey.internal.inject.AbstractBinder.class.getName());
		//com.sun.enterprise.web.PEWebContainer.class.getName();
		//		classDupes(sun.awt.shell.PublicShellFolderManager.class.getName());
		//		classDupes("org.webswing.toolkit.extra.IsolatedFsShellFolderManager");
		//          org.webswing.toolkit.extra.IsolatedFsShellFolderManager
		//Class found = org.webswing.server.model.exception.WsInitException.class;
		//classDupes("org.webswing.server.model.exception.WsInitException");
	}

	/**
	 * TODO Describe the purpose of this method.
	 */
	private static void addJettyClassesToClasspath() {
		if (true) {
			ClassLoader cl = IsolatedClassLoader.getCommonClassLoader();
			final File file = new File("lib/jetty-libs/");
			if (file.exists()) {
				for (File f : file.listFiles()) {
					final String name = f.getName();
					if (!name.startsWith("~") && name.endsWith("v20190813.jar") && name.startsWith("jetty-")) {
						try {
							final URL url = f.getCanonicalFile().toURL();
							IsolatedClassLoader.addURL(cl, url);
						} catch (IOException e) {
							e.printStackTrace();
						}
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

	final static Map<String, WebAppContext> jettyContexts = new HashMap();
	final static HashSet<String> neverFind = new HashSet<String>();
	static {
		neverFind.add("java.util.ConcurrentNavigableMap");
		// neverFind.add("com.sun.jndi.url.java.javaURLContextFactory");
	}

	private static WebAppContext addWarSpec(int port, File tmpDir, String filename, String contextRoot) throws Exception {
		final String id = contextKey(port, contextRoot);
		WebAppContext webapp = jettyContexts.get(id);
		if (webapp == null) {
			webapp = new CycWebAppContext();
			WebAppContext servletContextHandler = webapp;
			//servletContextHandler.setAttribute("javax.servlet.context.tempdir", scratchDir);

			if (!filename.toLowerCase().contains("proxy")) {
				// Set Classloader of Context to be sane (needed for JSTL)
				// JSP requires a non-System classloader, this simply wraps the
				// embedded System classloader in a way that makes it suitable
				// for JSP to use
				//ClassLoader jspClassLoader = new URLClassLoader(new URL[0], JettyMain.class.getClassLoader());
				//servletContextHandler.setClassLoader(jspClassLoader);
				servletContextHandler.setInitParameter("dirAllowed", "true");

				// Manually call JettyJasperInitializer on context startup
				servletContextHandler.addBean(new JspStarter(servletContextHandler));
				// Create / Register JSP Servlet (must be named "jsp" per spec)
				ServletHolder holderJsp = new ServletHolder("jsp", JettyJspServlet.class);
				holderJsp.setInitOrder(0);
				holderJsp.setInitParameter("logVerbosityLevel", "DEBUG");
				holderJsp.setInitParameter("fork", "false");
				holderJsp.setInitParameter("xpoweredBy", "false");
				holderJsp.setInitParameter("compilerTargetVM", "1.8");
				holderJsp.setInitParameter("compilerSourceVM", "1.8");
				holderJsp.setInitParameter("keepgenerated", "true");
				holderJsp.setInitParameter("dirAllowed", "true");
				servletContextHandler.addServlet(holderJsp, "*.jsp");
			}
		}
		webapp.setContextPath(contextRoot);

		if (tmpDir != null) {
			File tmpAppDir = new File(tmpDir + id);
			tmpAppDir.mkdirs();
			webapp.setTempDirectory(tmpAppDir);
		}

		final String warFilename = webappHome + filename;
		File warFile = new File(warFilename);
		//tmpAppDir.deleteOnExit();

		CycWebAppClassLoader classLoader = new CycWebAppClassLoader(webapp);
		//		final WebAppClassLoader parent = new CycWebAppClassLoader(IsolatedClassLoader.getCommonClassLoader(), webapp);
		//		final WebAppClassLoader classLoader = new WebAppClassLoaderVis(parent, webapp);
		//final WebAppClassLoader classLoader = new WebAppClassLoaderVis(IsolatedClassLoader.getCommonClassLoader(), webapp);
		webapp.setClassLoader(classLoader);
		webapp.setParentLoaderPriority(true);
		///webapp.setAttribute("org.eclipse.jetty.server.webapp.WebInfIncludeJarPattern", "");
		//webapp.setThrowUnavailableOnStartupException(true);

		ErrorHandler errorHandler = new ErrorHandler() {//custom event handler to hide running jetty version (pen test)
			@Override
			protected void writeErrorPageBody(HttpServletRequest request, Writer writer, int code, String message, boolean showStacks) throws IOException {
				String uri = request.getRequestURI();
				this.writeErrorPageMessage(request, writer, code, message, uri);
			}
		};
		webapp.setErrorHandler(errorHandler);

		if (new File(warFilename).isDirectory())

		{
			String webappDirLocation = warFilename;
			String asWebApp = asWebApp(webappDirLocation);
			webapp.setDescriptor(asWebApp);
			webapp.setResourceBase(webappDirLocation);
			return webapp;
		} else if (warFilename.endsWith(".war")) {
			if (true) {
				String webappDirLocation = warFilename.substring(0, (int) warFilename.length() - 4);
				String asWebApp = asWebApp(webappDirLocation);
				if (new File(webappDirLocation).exists()) {
					webapp.setDescriptor(asWebApp);
					webapp.setResourceBase(webappDirLocation);
					return webapp;
				}
				if (webappDirLocation.contains("/apps/")) {
					webappDirLocation = webappDirLocation.replace("/apps/", "/");
					asWebApp = asWebApp(webappDirLocation);
					if (new File(webappDirLocation).exists()) {
						webapp.setDescriptor(asWebApp);
						webapp.setResourceBase(webappDirLocation);
						return webapp;
					}
				}
			}
			webapp.setWar(warFilename);
			return webapp;
		} else {
			Errors.warn(SubLObjectFactory.makeString("Unable to find " + warFile + ".  Not loading into \n"));
			return null;
		}
	}

	/**
	 * @param port
	 * @param contextRoot
	 * @return
	 */
	public static String contextKey(int port, String contextRoot) {
		if (contextRoot != null) {
			if (!contextRoot.startsWith("/")) {
				contextRoot = "/" + contextRoot;
			}
		}
		String id = contextRoot;
		if (id == null || id.equals("/")) {
			id = "/ROOT";
		}
		id = id + "-port" + port;
		return id;
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
		//		PrintLow.format(T, SubLObjectFactory.makeString(string));
		//		PrintLow.format(T, SubLObjectFactory.makeString("~%"));
		//		streams_high.force_output(T);
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

	/**
	 * @param name
	 * @return
	 */
	public static boolean neverFindOurselves(String name) {
		name = name.replace('/', '.');
		if (neverFind.contains(name))
			return true;
		if (name.startsWith("com.sun.jersey")) {
			neverFind.add(name);
			return true;
		}
		if (name.startsWith("org.eclipse.jetty")) {
			neverFind.add(name);
			return true;
		}
		return false;
	}

	private static Server jettyServer;
	private static String webappHome = "webapps/apps/";
	final private static HashMap<String, Class> classMap = new HashMap<String, Class>();
	static {
		if (!new File(webappHome).exists())
			webappHome = "webapps/";
	}

	static public <T> T with_classloader(ClassLoader replace, Callable<T> call) throws ClassNotFoundException {
		final Thread currentThread = Thread.currentThread();
		ClassLoader was = currentThread.getContextClassLoader();
		try {
			if (replace != was) {
				currentThread.setContextClassLoader(replace);
			}
			return call.call();
		} catch (ClassNotFoundException e) {
			throw e;
		} catch (Throwable e) {
			if (e instanceof ClassNotFoundException)
				throw (ClassNotFoundException) e;
			e.printStackTrace();
			if (e instanceof Error) {
				throw (Error) e;
			}
			return null;

		} finally {
			currentThread.setContextClassLoader(was);
		}
	}

	static public <T> T with_classloader(ClassLoader replace, Runnable call) {
		final Thread currentThread = Thread.currentThread();
		ClassLoader was = currentThread.getContextClassLoader();
		try {
			if (replace != was) {
				currentThread.setContextClassLoader(replace);
			}
			call.run();
			return null;
		} catch (Throwable e) {
			e.printStackTrace();
			if (e instanceof Error) {
				throw (Error) e;
			}
			return null;

		} finally {
			currentThread.setContextClassLoader(was);
		}
	}
}
