/* For LarKC */
package com.cyc.tool.subl.util;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.instrument.Instrumentation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.JarURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.jar.Attributes;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.Manifest;

import org.armedbear.lisp.JavaClassLoader;
import org.armedbear.lisp.Lisp;
import org.logicmoo.system.Startup;
import org.logicmoo.system.SystemCurrent;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;

public class IsolatedClassLoader extends URLClassLoader {
	static ClassLoader parentClassLoader;
	static URL modpatch1;
	static {
		parentClassLoader = IsolatedClassLoader.class.getClassLoader();
		try {
			modpatch1 = normalizedFile(new File("lib/java.desktop.modpatch-1.jar")).toURL();
			String scl = System.getProperty("java.system.class.loader", null);
			System.out.println("java.system.class.loader=" + scl);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//classDupes(sun.awt.shell.PublicShellFolderManager.class.getName());
	}

	public static IsolatedClassLoader theIsolatedClassLoader = new IsolatedClassLoader();

	public IsolatedClassLoader() {
		super(new URL[0], parentClassLoader);
		safeToGetSystemClassLaoder = true;
		outerNames = new ArrayList<String>();
		theIsolatedClassLoader = this;
		blockedNames = new ArrayList<String>();
		loadedAlready = new HashMap<String, Class>();
		if (false) {
			ClassLoader scl = getSystemClassLoader();
			try {
				Method method = getDeclaredMethod(scl.getClass(), "loadClass", String.class, boolean.class);
				method.setAccessible(true);
				Class psfm1 = parentClassLoader.loadClass("sun.awt.shell.PublicShellFolderManager");
				Class psfm0 = (Class) method.invoke(scl, "sun.awt.shell.ShellFolderManager", true);
				Class psfm2 = loadClass("sun.awt.shell.PublicShellFolderManager", true);
				if (psfm1 != psfm2) {
					Thread.dumpStack();
				}
				if (psfm0 != psfm2) {
					Thread.dumpStack();
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	static boolean safeToGetSystemClassLaoder = false;

	public IsolatedClassLoader(ClassLoader pcl) {
		super(new URL[0], pcl);
		try {
			Method method = getDeclaredMethod(pcl.getClass(), "addURL", URL.class);
			method.setAccessible(true);
			method.invoke(pcl, modpatch1);
			System.out.println("parent of java.system.class.loader=" + pcl);
			System.out.println("parentClassLoader=" + parentClassLoader);
			final Thread currentThread = Thread.currentThread();
			System.out.println("getContextClassLoader=" + currentThread.getContextClassLoader());
			currentThread.setContextClassLoader(this);
			outerNames = new ArrayList<String>();
			theIsolatedClassLoader = this;
			blockedNames = new ArrayList<String>();
			loadedAlready = new HashMap<String, Class>();
			addURL(modpatch1);
			Class psfm0 = loadClass("sun.awt.shell.ShellFolderManager", true);
			Class psfm2 = loadClass("sun.awt.shell.PublicShellFolderManager", true);
			Class psfm1 = parentClassLoader.loadClass("sun.awt.shell.PublicShellFolderManager");
			if (psfm1 != psfm2) {
				Thread.dumpStack();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static Instrumentation inst = null;

	// The JRE will call method before launching your main()
	public static void agentmain(final String a, final Instrumentation inst0) {
		inst = inst0;
	}

	static String[] larkcDefaultJarFiles = new String[] { //
			"./lib/jetty-libs/",
			//"./lib/jetty-libs/*v20190813.jar",
			"./lib/larkc/*.jar", //
			// "./lib/jetty-libs/*.jar",
			"./lib/*.jar" };

	public static void addDefaultJarsToClassPath(String LARKC_HOME) {
		ArrayList<File> al = new ArrayList();
		Consumer<File> foo = new Consumer<File>() {

			@Override
			public void accept(File t) {
				t = normalizedFile(t);
				if (!al.contains(t))
					al.add(t);
			}
		};
		for (String s : larkcDefaultJarFiles) {
			if (false && s.startsWith(".")) {
				if (!new File(s).exists()) {
					s = LARKC_HOME + s.substring(1);
				}
			}
			try {
				if (s.contains("*")) {

					new FileFinder(s, false, foo).doFiles();
				} else
					foo.accept(normalizedFile(new File(s)));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		for (File f : al) {
			addClassPath(f);
		}
	}

	public static boolean addClassPath(File f) {
		ClassLoader cl = getSystemClassLoader();
		f = normalizedFile(f);
		try {

			// If Java 9 or higher use Instrumentation
			if (!(cl instanceof URLClassLoader)) {
				if (inst == null) {
					inst = getInstrumentation();
				}
				inst.appendToSystemClassLoaderSearch(new JarFile(f));
				return true;
			}
			final URL url = normalizedURL(f.toURI().toURL());
			if (containsURL(cl, url))
				return true;

			final String urlString = url.toString();
			if (urlString.contains("/javagat/")) {
				Errors.warn("adding? " + urlString);
			}
			if (f.isDirectory()) {

			}
			addURL(cl, url);
			return true;
		} catch (Throwable e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * TODO Describe the purpose of this method.
	 * @return
	 */
	public static Instrumentation getInstrumentation() {
		if (inst == null)
			throw new NullPointerException("getInstrumentation");
		return inst;
	}

	public static void addClassPath(URL u) throws IOException {
		final ClassLoader pcl = getIsolatedParent();
		addURL(pcl, u);
	}

	public static ClassLoader asURLClassLoader(ClassLoader o, boolean traceSearch) throws IOException {

		if (o instanceof URLClassLoader)
			return o;

		println("Classloader is not a URLClassLoader: " + o);
		ClassLoader classLoader = null;
		if (o != null) {
			classLoader = o.getParent();
			if (traceSearch)
				println("Checking Parent Classloader: " + classLoader);
			if (classLoader instanceof URLClassLoader) {
				return classLoader;
			}
		}
		classLoader = Thread.currentThread().getContextClassLoader();
		if (traceSearch)
			println("Checking Context Classloader: " + classLoader);
		if (classLoader instanceof URLClassLoader) {
			return classLoader;
		}
		classLoader = JavaClassLoader.getCurrentClassLoader();
		if (traceSearch)
			println("Checking Current Classloader: " + classLoader);
		if (classLoader instanceof URLClassLoader) {
			return classLoader;
		}
		classLoader = Lisp.class.getClassLoader();
		if (traceSearch)
			println("Checking Ext Classloader: " + classLoader);
		if (classLoader instanceof URLClassLoader) {
			return classLoader;
		}
		classLoader = IsolatedClassLoader.mightSystemClassLoader();
		if (traceSearch)
			println("Checking System Classloader: " + classLoader);
		if (classLoader instanceof URLClassLoader) {
			return classLoader;
		}
		classLoader = Class.class.getClassLoader();
		if (traceSearch)
			println("Checking Boot Classloader: " + classLoader);
		if (classLoader instanceof URLClassLoader) {
			return classLoader;
		}
		try {
			Method method = getDeclaredMethod(ClassLoader.class, "getPlatformClassLoader");
			ClassLoader platformClassLoader = (ClassLoader) method.invoke(null);
			method.setAccessible(true);
			if (platformClassLoader instanceof URLClassLoader) {
				return asURLClassLoader(platformClassLoader, traceSearch);
			}
			if (traceSearch)
				println("Platform Classloader is not a URLClassLoader: " + platformClassLoader);
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
		}
		return null;
	}

	private static ClassLoader mightSystemClassLoader() {
		if (safeToGetSystemClassLaoder)
			return getSystemClassLoader();
		return null;
	}

	/**
	 * TODO Describe the purpose of this method.
	 * 
	 * @param u
	 * @throws IOException
	 */
	public static ClassLoader addURL(ClassLoader o, URL url) throws IOException {
		url = normalizedURL(url);
		if (!(o instanceof URLClassLoader)) {
			println("Classloader is not a URLClassLoader: " + o);
			{
				ClassLoader extClassLoader = asURLClassLoader(o, true);
				if (extClassLoader instanceof URLClassLoader) {
					return addURL(extClassLoader, url);
				}
				println("asURLClassLoader is not a URLClassLoader: " + extClassLoader);
			}
		}
		URL[] urls = Lisp.getURLs(o);
		for (int i = 0; i < urls.length; ++i) {
			if (urls[i].toString().equalsIgnoreCase(url.toString()))
				return o;
		}
		try {
			Method method = getDeclaredMethod(o.getClass(), "addURL", URL.class);
			method.setAccessible(true);
			if (debug > 1)
				println("Add " + url + " to " + o);
			method.invoke(o, url);
			return o;
		} catch (NoSuchMethodException e) {
			new IOException("No URL classloader", e).printStackTrace();
			return o;
		} catch (Throwable t) {
			throw new IOException("Error, could not add URL to system classloader", t);
		}
	}

	/**
	 * TODO Describe the purpose of this method.
	 * @param sysclass
	 * @param string
	 * @param class1
	 * @return
	 */
	public static Method getDeclaredMethod(Class sysclass, String name, Class... paramClasses) throws NoSuchMethodException {
		try {
			return sysclass.getDeclaredMethod(name, paramClasses);
		} catch (NoSuchMethodException poe) {
			Class superClass = sysclass.getSuperclass();
			while (superClass != null && superClass != Object.class && superClass != sysclass) {
				sysclass = superClass;
				try {
					return sysclass.getDeclaredMethod(name, paramClasses);
				} catch (NoSuchMethodException e) {
					superClass = sysclass.getSuperclass();
					continue;
				}
			}
			throw poe;
		}

	}

	public static String slashify(String path, boolean isDirectory) {
		String p = path;
		if (File.separatorChar != '/')
			p = p.replace(File.separatorChar, '/');
		if (!p.startsWith("/"))
			p = "/" + p;
		if (!p.endsWith("/") && isDirectory)
			p += "/";
		return p;
	}

	ArrayList<String> outerNames;
	ArrayList<String> blockedNames;
	Map<String, Class> loadedAlready;
	static int debug = 1;
	public static boolean ALLOW_DYNAMIC_LOADING_OF_CODE = true;
	public static boolean ALLOW_LOADING_OF_DIRS_FROM_INTERPRETER = false;
	private static ArrayList<ClassLoader> peerLoaders = new ArrayList();

	private Class loadClassFile(File jfile) throws IOException {
		String sfile = jfile.getAbsolutePath();
		Class c = loadedAlready.get(sfile);
		if (c != null)
			return c;
		DataInputStream dis = new DataInputStream(new FileInputStream(jfile));
		int size = dis.available();
		byte[] byteArray = new byte[size];
		dis.read(byteArray, 0, size);
		try {
			c = this.defineClass(null, byteArray, 0, size);
			String className = c.getName();
			outerNames.add(className);
		} catch (Throwable t) {
			println("defineClass: " + t);
		}
		loadedAlready.put(sfile, c);
		return c;
	}

	private void scanFiles(File jfile, boolean defineClasses, boolean decendDirs) {
		if (jfile.isFile()) {
			String s = jfile.getAbsolutePath();
			if (s.endsWith(".class")) {
				try {
					if (defineClasses)
						addClassFile(jfile);
				} catch (Exception e) {
					Errors.error("Error while loading inner classes for: " + jfile, e);
				}
				return;
			}
			if (s.endsWith(".jar")) {
				try {
					addJar(jfile);
				} catch (IOException e2) {
					Errors.error("Error while loading inner classes for: " + jfile, e2);
				}
				return;
			}
		}
		if (jfile.isDirectory() && decendDirs) {
			File[] jfiles = jfile.listFiles();
			for (int i = 0; i < jfiles.length; ++i)
				scanFiles(jfiles[i], defineClasses, decendDirs);
		}
	}

	private void scanForInners(File parent, String className) throws IOException {
		File[] innersMaybe = parent.listFiles();
		for (int i = 0; i < innersMaybe.length; ++i) {
			String named = innersMaybe[i].getName();
			if (named.startsWith(className))
				try {
					loadClassFile(innersMaybe[i]);
				} catch (Throwable t) {
					Errors.error("Error while loading inner classes for: " + className, t);
				}
		}
	}

	public Class addClassFile(File jfile) throws IOException, ClassNotFoundException {
		Class c = loadClassFile(jfile);
		String className = c.getName();
		String simpleName = c.getSimpleName();
		scanForInners(jfile.getParentFile(), simpleName);
		myResolveClass(Class.forName(className, false, this));
		Class[] inners = c.getDeclaredClasses();
		for (Class ic : inners) {
			myResolveClass(ic);
		}
		return c;
	}

	static public void addToClassPath(String stringTyped) {
		stringTyped = org.logicmoo.system.Startup.unquote(stringTyped);
		if (stringTyped.contains(";")) {
			for (String s : stringTyped.split(";")) {
				theIsolatedClassLoader.addCode(s);
			}
			return;
		}
		int indexOf = stringTyped.indexOf(":");
		if (indexOf > 6) {
			for (String s : stringTyped.split(":")) {
				theIsolatedClassLoader.addCode(s);
			}
			return;
		}
		theIsolatedClassLoader.addCode(stringTyped);
	}

	public void addCode(String stringTyped) {

		stringTyped = org.logicmoo.system.Startup.unquote(stringTyped);
		URL url;
		if (stringTyped.startsWith("file:")) {

			try {
				url = new URL(stringTyped);
				stringTyped = url.getFile();
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}

		} else if (stringTyped.startsWith("jar:")) {
			try {
				url = new URL(stringTyped);
				stringTyped = url.getFile();
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		File jfile = normalizedFile(new File(stringTyped));

		stringTyped = jfile.getAbsolutePath();
		if (!jfile.exists()) {
			int jarChars = stringTyped.indexOf(".jar!");
			if (jarChars > -1)
				try {
					jfile = normalizedFile(new File(stringTyped.substring(0, jarChars + 3)));
					String className = stringTyped.substring(jarChars + 4);
					addJarClass(jfile, className);
					return;
				} catch (Throwable e) {
					Errors.error("Error loading jar!class: " + stringTyped, e);
				}
		}
		if (jfile.exists()) {
			if (stringTyped.endsWith(".jar"))
				try {
					addJar(jfile);
				} catch (Throwable e2) {
					Errors.error("Error accessing jar: " + stringTyped, e2);
				}
			else if (stringTyped.endsWith(".class"))
				try {
					addClassFile(jfile);
				} catch (Throwable e3) {
					Errors.error("Error accessing classfile: " + stringTyped, e3);
				}
			else if (jfile.isDirectory()) {
				try {
					addURL(jfile.toURI().toURL());
				} catch (Throwable e2) {
					Errors.error("Unable to load directory into classpath: " + jfile);
				}
			} else {
				Errors.error("Error loading file:: " + stringTyped + " not a class or jar file");
			}
		} else
			Errors.error("Error finding file:: " + stringTyped);
	}

	/**
	 * TODO Describe the purpose of this method.
	 * @param jfile
	 * @return
	 */
	private static File normalizedFile(File jfile) {
		jfile = jfile.getAbsoluteFile();
		try {
			return jfile.getCanonicalFile();
		} catch (IOException e) {
			final String absolutePath = jfile.getAbsolutePath();
			String newA = absolutePath.replace("/./", "/");
			if (newA.length() != absolutePath.length()) {
				return normalizedFile(new File(newA));
			}
			return jfile;
		}
	}

	/**
	 * TODO Describe the purpose of this method.
	 * @param url
	 * @return
	 * @throws MalformedURLException
	 * @throws URISyntaxException
	 */
	public static URL normalizedURL(URL url) {
		try {
			return url.toURI().toURL();
		} catch (MalformedURLException | URISyntaxException e) {
			return url;
		}
	}

	public void addDirectory(File jfile) throws IOException {
		jfile = normalizedFile(jfile);
		final String extracted = slashify(jfile.getAbsolutePath(), false);
		final URL withHost = new URL("file", "", extracted);
		URL url = normalizedURL(withHost);
		addURL(url);
		File[] jfiles = jfile.listFiles();
		for (int i = 0; i < jfiles.length; ++i)
			scanFiles(jfiles[i], false, true);
	}

	public void addJar(File jfile) throws IOException {
		jfile = normalizedFile(jfile);
		URL url = normalizedURL(new URL("jar:file://" + jfile.getAbsolutePath() + "!/"));
		addURL(url);
	}

	public void addJarClass(File jfile, String className) throws IOException {

		try {
			String classfileName = className.replace('.', File.separatorChar) + ".class";
			jfile = normalizedFile(jfile);
			// Create a URL that refers to a jar file in the file system 
			URL FileSysUrl = normalizedURL(new URL("jar:file://" + jfile.getAbsolutePath() + "!/" + classfileName));

			// Create a jar URL connection object 
			JarURLConnection jarURLConn = (JarURLConnection) FileSysUrl.openConnection();

			if (false) {
				// getJarFileURL() method 
				println("Jar file URL : " + jarURLConn.getJarFileURL());

				// getEntryName() method 
				println("Entry Name : " + jarURLConn.getEntryName());

				// getJarFile() method 
				JarFile jarFile = jarURLConn.getJarFile();
				println("Jar Entry: " + jarURLConn.getJarEntry());

				// getManifest() method 
				Manifest manifest = jarFile.getManifest();
				println("Manifest :" + manifest.toString());

				// getJarEntry() method 
				JarEntry jentry = jarURLConn.getJarEntry();
				println("Jar Entry : " + jentry.toString());

				// getAttributes() method 
				Attributes attr = jarURLConn.getAttributes();
				println("Attributes : " + attr);

				// getMainAttributes() method 
				Attributes attrmain = jarURLConn.getMainAttributes();
				println("\nMain Attributes details: ");

				for (Entry e : attrmain.entrySet()) {
					println(e.getKey() + " " + e.getValue());
				}

				// getCertificates() method 
				java.security.cert.Certificate cert[] = jarURLConn.getCertificates();
				println("\nCertificates Info :" + Arrays.toString(cert));
			}
			InputStream is = jarURLConn.getInputStream();
			byte[] byteArray = toByteArray(is);
			Class c = defineClass(null, byteArray, 0, byteArray.length);
			loadedAlready.put(className, c);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassFormatError e) {
			e.printStackTrace();
		} catch (Error e) {
			e.printStackTrace();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return;

	}

	/**
	 * TODO Describe the purpose of this method.
	 * @param string
	 */
	static void println(String s) {
		Startup.getNoticeStream().println(s);
	}

	/**
	* TODO Describe the purpose of this method.
	* @param string
	*/
	static void printf(String s, Object... a) {
		Startup.getNoticeStream().printf(s, a);
	}

	private byte[] toByteArray(InputStream inputStream) throws IOException {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		int read;
		byte[] byteArray = new byte[1024];
		while ((read = inputStream.read(byteArray, 0, byteArray.length)) != -1) {
			out.write(byteArray, 0, read);
		}
		out.flush();
		return out.toByteArray();
	}

	@Override
	public void addURL(URL url) {
		url = normalizedURL(url);
		if (containsURL(this, url))
			return;
		if (safeToGetSystemClassLaoder) {
			if (containsURL(getParent(), url))
				return;
		}
		println("Add " + url + " to " + this);
		super.addURL(url);
	}

	/**
	 * TODO Describe the purpose of this method.
	 * @param url
	 */
	public static boolean containsURL(ClassLoader cl, URL url) {
		if (!(cl instanceof URLClassLoader))
			return false;
		String urlstr = normalizedURL(url).toString();
		for (URL url0 : ((URLClassLoader) cl).getURLs()) {
			if (urlstr.equalsIgnoreCase(normalizedURL(url0).toString()))
				return true;
		}
		return false;
	}

	public boolean isDefinedHere(String s) {
		for (String sl : outerNames)
			if (s.startsWith(sl))
				return true;
		return false;
	}

	/**
	 * Loads the class with the specified <a href="#name">binary name</a>.
	 * This method searches for classes in the same manner as the {@link
	 * #loadClass(String, boolean)} method.  It is invoked by the Java virtual
	 * machine to resolve class references.  Invoking this method is equivalent
	 * to invoking {@link #loadClass(String, boolean) <tt>loadClass(name,
	 * false)</tt>}.
	 *
	 * @param  name
	 *         The <a href="#name">binary name</a> of the class
	 *
	 * @return  The resulting <tt>Class</tt> object
	 *
	 * @throws  ClassNotFoundException
	 *          If the class was not found
	 */
	@Override
	public synchronized Class loadClass(String className) throws ClassNotFoundException {
		Class c = maybeFindLoadedClass(className);
		boolean parentFirst = false;
		ClassNotFoundException ex = null;
		if (c == null) {
			if (!isDefinedHere(className) && c == null)
				try {
					final ClassLoader pcl = getIsolatedParent();
					if (parentFirst)
						if (pcl != null) {
							c = pcl.loadClass(className);
							if (debug > 1)
								println("Parent Loading: " + className);
							myResolveClass(c);
							return c;

						}
				} catch (ClassNotFoundException e) {
					ex = e;
				}
			if (debug > 1)
				println("local Loading: " + className);
			if (c == null)
				try {
					c = findClass(className);
				} catch (ClassNotFoundException e) {
					if (ex == null)
						ex = e;
				}
			if (c == null)
				try {
					final ClassLoader pcl = getIsolatedParent();
					if (pcl != null)
						c = pcl.loadClass(className);
				} catch (ClassNotFoundException e) {
					if (ex == null)
						ex = e;
				}
		}
		if (c != null) {
			myResolveClass(c);
			return c;
		}
		if (debug > 1)
			println("Not Found: " + className + " (this will be found later)");
		throw ex;
	}

	public void saveClass(Class<?> class1) {
		loadedAlready.put(class1.getName(), class1);
		// TODO Auto-generated method stub

	}

	public Class<?> findClassP(String name) throws ClassNotFoundException {
		Class c = super.findClass(name);
		saveClass(c);
		return c;
	}

	/**
	 * Returns the search path of URLs for loading classes and resources.
	 * This includes the original list of URLs specified to the constructor,
	 * along with any URLs subsequently appended by the addURL() method.
	 * @return the search path of URLs for loading classes and resources.
	 */
	public URL[] getURLs() {
		return super.getURLs();
	}

	@Override
	public Class<?> findClass(String name) throws ClassNotFoundException {
		return super.findClass(name);
	}

	//	/**
	//	 * Finds and loads the class with the specified name from the URL search
	//	 * path. Any URLs referring to JAR files are loaded and opened as needed
	//	 * until the class is found.
	//	 *
	//	 * @param name the name of the class
	//	 * @return the resulting class
	//	 * @exception ClassNotFoundException if the class could not be found,
	//	 *            or if the loader is closed.
	//	 * @exception NullPointerException if {@code name} is {@code null}.
	//	 */
	//	protected Class<?> findClass(final String name) throws ClassNotFoundException {
	//		final Class<?> result;
	//		try {
	//			result = AccessController.doPrivileged(new PrivilegedExceptionAction<Class<?>>() {
	//				public Class<?> run() throws ClassNotFoundException {
	//					String path = name.replace('.', '/').concat(".class");
	//					for (URL url : getURLs()) {
	//						Resource res = ucp.getResource(path, false);
	//						if (res != null) {
	//							try {
	//								return defineClass(name, res);
	//							} catch (IOException e) {
	//								throw new ClassNotFoundException(name, e);
	//							}
	//						} else {
	//							return null;
	//						}
	//					}
	//				}
	//			}, acc);
	//		} catch (java.security.PrivilegedActionException pae) {
	//			throw (ClassNotFoundException) pae.getException();
	//		}
	//		if (result == null) {
	//			throw new ClassNotFoundException(name);
	//		}
	//		return result;
	//	}
	//    /*
	//     * Defines a Class using the class bytes obtained from the specified
	//     * Resource. The resulting Class must be resolved before it can be
	//     * used.
	//     */
	//    private Class<?> defineClass(String name, Resource res) throws IOException {
	//        long t0 = System.nanoTime();
	//        int i = name.lastIndexOf('.');
	//        URL url = res.getCodeSourceURL();
	//        if (i != -1) {
	//            String pkgname = name.substring(0, i);
	//            // Check if package already loaded.
	//            Manifest man = res.getManifest();
	//            definePackageInternal(pkgname, man, url);
	//        }
	//        // Now read the class bytes and define the class
	//        java.nio.ByteBuffer bb = res.getByteBuffer();
	//        if (bb != null) {
	//            // Use (direct) ByteBuffer:
	//            CodeSigner[] signers = res.getCodeSigners();
	//            CodeSource cs = new CodeSource(url, signers);
	//            sun.misc.PerfCounter.getReadClassBytesTime().addElapsedTimeFrom(t0);
	//            return defineClass(name, bb, cs);
	//        } else {
	//            byte[] b = res.getBytes();
	//            // must read certificates AFTER reading bytes.
	//            CodeSigner[] signers = res.getCodeSigners();
	//            CodeSource cs = new CodeSource(url, signers);
	//            sun.misc.PerfCounter.getReadClassBytesTime().addElapsedTimeFrom(t0);
	//            return defineClass(name, b, 0, b.length, cs);
	//        }
	//    }

	/**
	 * TODO Describe the purpose of this method.
	 * @param c
	 */
	private void myResolveClass(Class c) {
		saveClass(c);
		resolveClass(c);
		// TODO Auto-generated method stub

	}

	/**
	 * TODO Describe the purpose of this method.
	 * @return
	 */
	public static ClassLoader getIsolatedParent() {
		return IsolatedClassLoader.parentClassLoader;
	}

	/**
	 * TODO Describe the purpose of this method.
	 * @return
	 */
	public static ClassLoader[] getPeers() {
		return peerLoaders.toArray(new ClassLoader[] { IsolatedClassLoader.parentClassLoader });
	}

	/**
	 * Loads the class with the specified <a href="#name">binary name</a>.  The
	 * default implementation of this method searches for classes in the
	 * following order:
	 *
	 * <ol>
	 *
	 *   <li><p> Invoke {@link #findLoadedClassCached(String)} to check if the class
	 *   has already been loaded.  </p></li>
	 *
	 *   <li><p> Invoke the {@link #loadClass(String) <tt>loadClass</tt>} method
	 *   on the parent class loader.  If the parent is <tt>null</tt> the class
	 *   loader built-in to the virtual machine is used, instead.  </p></li>
	 *
	 *   <li><p> Invoke the {@link #findClass(String)} method to find the
	 *   class.  </p></li>
	 *
	 * </ol>
	 *
	 * <p> If the class was found using the above steps, and the
	 * <tt>resolve</tt> flag is true, this method will then invoke the {@link
	 * #myResolveClass(Class)} method on the resulting <tt>Class</tt> object.
	 *
	 * <p> Subclasses of <tt>ClassLoader</tt> are encouraged to override {@link
	 * #findClass(String)}, rather than this method.  </p>
	 *
	 * <p> Unless overridden, this method synchronizes on the result of
	 * {@link #getClassLoadingLock <tt>getClassLoadingLock</tt>} method
	 * during the entire class loading process.
	 *
	 * @param  name
	 *         The <a href="#name">binary name</a> of the class
	 *
	 * @param  resolve
	 *         If <tt>true</tt> then resolve the class
	 *
	 * @return  The resulting <tt>Class</tt> object
	 *
	 * @throws  ClassNotFoundException
	 *          If the class could not be found
	 */
	public Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
		synchronized (getClassLoadingLock(name)) {
			// First, check if the class has already been loaded
			Class<?> c = maybeFindLoadedClass(name);
			if (c == null) {
				try {
					c = super.loadClass(name, false);
				} catch (ClassNotFoundException e) {
					// ClassNotFoundException thrown if class not found
					// from the non-null parent class loader
				}

				if (c == null) {
					// If still not found, then invoke findClass in order
					// to find the class.
					c = findClass(name);
				}
			}
			if (resolve) {
				myResolveClass(c);
			}
			return c;
		}
	}

	/**
	 * Returns the class with the given <a href="#name">binary name</a> if this
	 * loader has been recorded by the Java virtual machine as an initiating
	 * loader of a class with that <a href="#name">binary name</a>.  Otherwise
	 * <tt>null</tt> is returned.
	 *
	 * @param  name
	 *         The <a href="#name">binary name</a> of the class
	 *
	 * @return  The <tt>Class</tt> object, or <tt>null</tt> if the class has
	 *          not been loaded
	 *
	 * @since  1.1
	 */
	public final Class<?> maybeFindLoadedClass(String name) {
		if (name.endsWith(".class")) {
			String cn = name.substring(0, name.length() - 7);
			cn = cn.replace('/', '.').replace('$', '.');
			Class c = loadedAlready.get(name);
			if (c != null)
				return c;
		}
		return super.findLoadedClass(name);
	}

	/**
	 * TODO Describe the purpose of this method.
	 * @return
	 */
	public static ClassLoader getCommonClassLoader() {
		ClassLoader cl = IsolatedClassLoader.theIsolatedClassLoader;
		//assert cl == Thread.currentThread().getContextClassLoader();
		return cl;
	}

	/**
	 * TODO Describe the purpose of this method.
	 * @param class1
	 * @throws IOException
	 */
	public static void classDupes(final String name) throws IOException {
		String classAsResource = name.replace('.', '/') + ".class";
		//printf("Looking for: %s%n", classAsResource);
		int found = 0;
		ClassLoader cl = IsolatedClassLoader.getCommonClassLoader();
		Enumeration<URL> urls = cl.getResources(classAsResource);
		while (urls.hasMoreElements()) {
			found++;
			URL url = urls.nextElement();
			//printf("Found: %s%n", url.toExternalForm());
		}
		if (found == 0) {
			printf(" MISSING!: %s%n", name);
		} else if (found != 1) {
			printf(" DUPERS(%d): %s%n", found, name);

			urls = cl.getResources(classAsResource);
			while (urls.hasMoreElements()) {
				URL url = urls.nextElement();
				printf(" DUPE!: %s%n", url.toExternalForm());
			}
		}
	}

	/**
	 * TODO Describe the purpose of this method.
	 * @param class1
	 * @throws IOException
	 */
	public static void classDupes(final Class<?> class1) throws IOException {
		addPreloadedClass(class1);
		IsolatedClassLoader.classDupes(class1.getName());
	}

	/**
	 * TODO Describe the purpose of this method.
	 * @param class1
	 */
	public static void addPreloadedClass(Class<?> class1) {
		theIsolatedClassLoader.loadedAlready.put(class1.getName(), class1);
		// TODO Auto-generated method stub

	}

	/**
	 * TODO Describe the purpose of this method.
	 * @throws IOException
	 */
	public static void configChecks() throws IOException {
		printf("CLASSPATH=%s%n", System.getProperty("java.class.path"));

		classDupes("org.apache.xerces.jaxp.SAXParserFactoryImpl");

		classDupes("org.slf4j.spi.LocationAwareLogger");
		classDupes("org.slf4j.LoggerFactory");
		//classDupes("org.eclipse.jetty.websocket.jsr356.server.deploy.WebSocketServerContainerInitializer");
		//classDupes(org.apache.tomcat.util.security.MD5Encoder.class);

		//		classDupes(org.apache.jasper.servlet.JasperInitializer.class);
		//		classDupes(org.eclipse.jetty.util.component.AttributeContainerMap.class);
		//		classDupes(com.sun.jersey.spi.container.servlet.ServletContainer.class);
		//		classDupes(org.eclipse.jetty.http.HttpField.class);
		//		classDupes(HttpServletRequest.class);

		//classDupes("org.eclipse.jetty.io.ByteBufferPool");
		//		classDupes(RealmBase.class);
		//		classDupes(Embedded.class);
		//		classDupes(Loader.class);
		//		//JasperInitializer.class.toString();
		//		classDupes(org.apache.naming.resources.BaseDirContext.class);
		//		classDupes(ParallelWebappClassLoader.class);
		//		try {
		//			//org.apache.tomcat.util.security.MD5Encoder.class.getConstructor().setAccessible(true);
		//		} catch (SecurityException | NoSuchMethodException e) {
		//			// TODO Auto-generated catch block
		//			e.printStackTrace();
		//		}
		//classDupes(com.sun.jersey.spi.scanning.AnnotationScannerListener.class);
	}
}
