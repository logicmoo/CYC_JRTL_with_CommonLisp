/* For LarKC */
package com.cyc.tool.subl.util;

import static org.logicmoo.system.Startup.*;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.instrument.Instrumentation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.JarURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLClassLoader;
import java.net.URLConnection;
import java.security.CodeSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.jar.Attributes;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.armedbear.lisp.JavaClassLoader;
import org.armedbear.lisp.Lisp;
import org.armedbear.lisp.Main;
import org.logicmoo.system.Startup;
import org.logicmoo.system.SystemCurrent;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;

public class IsolatedClassLoader extends URLClassLoader {
	public static final String BANG_SLASH = "!/";
	public static boolean suspendAdding = false;
	public static int debug = 2;
	public static boolean ALLOW_DYNAMIC_LOADING_OF_CODE = true;
	public static boolean ALLOW_LOADING_OF_DIRS_FROM_INTERPRETER = false;
	private static ArrayList<ClassLoader> peerLoaders = new ArrayList();
	private static boolean shortend;
	public final static Set<String> _zip_extensions = new HashSet<String>();
	static {
		_zip_extensions.add(".jar");
		_zip_extensions.add(".zip");
		_zip_extensions.add(".abcl");
		_zip_extensions.add(".war");
		// IKVM _zip_extensions.add(".dll");  _zip_extensions.add(".exe");

	}
	public final static Set<String> _cu_extensions = new HashSet<String>();
	static {
		_cu_extensions.add(".class");
		_cu_extensions.add(".cls");
		_cu_extensions.add(".java");
		_cu_extensions.add(".subl");
		_cu_extensions.add(".lisp");
		// IKVM _zip_extensions.add(".res");
	}
	static ClassLoader parentClassLoader;
	static URL modpatch1;
	static {
		parentClassLoader = IsolatedClassLoader.class.getClassLoader();
		try {
			modpatch1 = normalizedFile(new File("lib/java.desktop.modpatch-1.jar")).toURL();
			if (!Main.noinform) {
				String lcl = System.getProperty("java.system.class.loader", null);
				System.out.println("java.system.class.loader=" + lcl);
			}
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			Startup.printStackTrace(e);
		}
		//classDupes(sun.awt.shell.PublicShellFolderManager.class.getName());
	}

	volatile public static IsolatedClassLoader theIsolatedClassLoader = new IsolatedClassLoader();

	public String toString() {
		//com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider
		// javax.ws.rs.ext.MessageBodyReader
		if (this == theIsolatedClassLoader)
			return "theIsolatedClassLoader";
		return super.toString();
	}

	/**
	 *
	 */
	public void checkForlderOverride() {
		ClassLoader lcl = getSystemClassLoader();
		try {
			Method method = getDeclaredMethod(lcl.getClass(), "loadClass", String.class, boolean.class);
			method.setAccessible(true);
			Class psfm1 = parentClassLoader.loadClass("sun.awt.shell.PublicShellFolderManager");
			Class psfm0 = (Class) method.invoke(lcl, "sun.awt.shell.ShellFolderManager", true);
			Class psfm2 = loadClass("sun.awt.shell.PublicShellFolderManager", true);
			if (psfm1 != psfm2) {
				Thread.dumpStack();
			}
			if (psfm0 != psfm2) {
				Thread.dumpStack();
			}
		} catch (Throwable e) {
			printStackTrace(e);
		}
	}

	public IsolatedClassLoader() {
		super(new URL[0], parentClassLoader);
		safeToGetSystemClassLaoder = true;
		outerNames = new ArrayList<String>();
		theIsolatedClassLoader = this;
		blockedNames = new ArrayList<String>();
		loadedAlready = new HashMap<String, Class>();
		if (false) {
			addURL(modpatch1);
			checkForlderOverride();
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
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException e) {
			printStackTrace(e);
		}
		System.out.println("parentClassLoader=" + parentClassLoader);
		final Thread currentThread = Thread.currentThread();
		System.out.println("getContextClassLoader=" + currentThread.getContextClassLoader());
		currentThread.setContextClassLoader(this);
		outerNames = new ArrayList<String>();
		theIsolatedClassLoader = this;
		blockedNames = new ArrayList<String>();
		loadedAlready = new HashMap<String, Class>();
		addURL(modpatch1);
		if (false) {
			checkForlderOverride();
		}
	}

	private static Instrumentation inst = null;

	// The JRE will call method before launching your main()
	public static void agentmain(final String a, final Instrumentation inst0) {
		inst = inst0;
	}

	static String[] larkcDefaultJarFiles = new String[] { //
			//"./lib/jetty-libs/*.jar",
			//	"./lib/jsp/*.jar", "./lib/jetty-libs/*.jar",
			//"./lib/jetty-libs/*v20190813.jar",
			//"./lib/larkc/*.jar", //
			"./lib/all-deps/", //
			//"./lib/*.jar"
	};

	static public void addDefaultJarsToClassPath(String LARKC_HOME) {
		ArrayList<File> al = new ArrayList();
		Consumer<File> foo = new Consumer<File>() {

			@Override
			public void accept(File t) {
				t = normalizedFile(t);
				if (!isSkipped(t)) {
					if (!al.contains(t))
						al.add(t);
				}
			}
		};
		for (String s : larkcDefaultJarFiles) {
			final File file = new File(s);
			if (file.isDirectory()) {
				addCommonClassPath(file);
				continue;
			}
			if (false && s.startsWith(".")) {
				if (!file.exists()) {
					s = LARKC_HOME + s.substring(1);
				}
			}

			try {
				if (s.contains("*")) {

					new FileFinder(s, false, foo).doFiles();
				} else
					foo.accept(normalizedFile(file));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				printStackTrace(e);
			}
		}
		for (File f : al) {
			addCommonClassPath(f);
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

	//	public void addClassPath(URL u) throws IOException {
	//		//final ClassLoader pcl = getIsolatedParent();
	//		addURL(u);
	//	}

	public static ClassLoader asURLClassLoader(ClassLoader lcl, boolean traceSearch) throws IOException {

		if (lcl instanceof URLClassLoader)
			return lcl;

		println("Classloader is not a URLClassLoader: " + lcl);
		ClassLoader classLoader = null;
		if (lcl != null) {
			classLoader = lcl.getParent();
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
	public static ClassLoader addURLToClassloader(String why, ClassLoader lcl, URL url) throws IOException {
		url = normalizedURL(url);
		if (isSkipped(url)) {
			println(why + ": isSkipped! " + url + " to " + lcl);
			return lcl;
		}
		if (!(lcl instanceof URLClassLoader)) {
			println("Classloader is not a URLClassLoader: " + lcl);
			{
				ClassLoader extClassLoader = asURLClassLoader(lcl, true);
				if (extClassLoader instanceof URLClassLoader) {
					return addURLToClassloader(why, extClassLoader, url);
				}
				println("asURLClassLoader is not a URLClassLoader: " + extClassLoader);
			}
		}
		if (containsURL(lcl, url)) {
			if (debug > 2) {
				println(why + ": " + " " + url + " to " + lcl);
			} else if (debug > 2 && shortend) {
				println(why + ": SHORTEND ALREADY " + url + " to " + lcl);

			}
			return lcl;
		}
		if (suspendAdding)

		{
			if (debug > 0) {
				println(why + ": Suspended Adding " + url + " to " + lcl);
			}
			return lcl;
		}
		try {
			Method method = getDeclaredMethod(lcl.getClass(), "addURL", URL.class);
			method.setAccessible(true);
			if (debug > 1) {
				if (!(lcl instanceof IsolatedClassLoader))
					println(why + ": Adding " + url + " to " + lcl);
			}
			method.invoke(lcl, url);
			return lcl;
		} catch (NoSuchMethodException e) {
			printStackTrace(e);
			new IOException("No URL (addURL) classloader", e).printStackTrace();
			return lcl;
		} catch (Throwable t) {
			throw new IOException("Error, could not add URL to system classloader", t);
		}
	}

	private static boolean isSkipped(Object url) {
		String str = "" + url;
		return str.contains("~");
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

	public static Field getDeclaredField(Class sysclass, String name) throws NoSuchFieldException, SecurityException {
		try {
			return sysclass.getDeclaredField(name);
		} catch (NoSuchFieldException poe) {
			Class superClass = sysclass.getSuperclass();
			while (superClass != null && superClass != Object.class && superClass != sysclass) {
				sysclass = superClass;
				try {
					return sysclass.getDeclaredField(name);
				} catch (NoSuchFieldException e) {
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

	private void scanFiles(ClassLoader lcl, File jfile, boolean defineClasses, boolean decendDirs) {
		if (jfile.isFile()) {
			String s = jfile.getAbsolutePath();
			if (isCompilationUnit(s)) {
				try {
					if (defineClasses)
						addClassFile(jfile);
				} catch (Exception e) {
					Errors.error("Error while loading inner classes for: " + jfile, e);
				}
				return;
			}
			if (isZip(s)) {
				try {
					addJar(lcl, jfile, defineClasses);
				} catch (IOException e2) {
					Errors.error("Error while loading inner classes for: " + jfile, e2);
				}
				return;
			}
		}
		if (jfile.isDirectory() && decendDirs) {
			File[] jfiles = jfile.listFiles();
			for (int i = 0; i < jfiles.length; ++i)
				scanFiles(lcl, jfiles[i], defineClasses, decendDirs);
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

	static public void addCommonClassPath(String stringTyped) {
		ClassLoader lcl = getSystemClassLoader();
		theIsolatedClassLoader.addCode(lcl, stringTyped, false);
	}

	static public void addCommonClassPath(URL stringTyped) {
		try {
			addURLToClassloader("addCommonClassPath", theIsolatedClassLoader, stringTyped);
		} catch (IOException e) {
			printStackTrace(e);
		}
	}

	public static boolean addCommonClassPath(File f) {
		ClassLoader lcl = getSystemClassLoader();
		f = normalizedFile(f);
		try {

			// If Java 9 or higher use Instrumentation
			if (!(lcl instanceof URLClassLoader)) {
				if (inst == null) {
					inst = getInstrumentation();
				}
				inst.appendToSystemClassLoaderSearch(new JarFile(f));
				return true;
			}
			final URL url = normalizedURL(f.toURI().toURL());
			final String urlString = url.toString();
			if (urlString.contains("/javagat/")) {
				Errors.warn("adding? " + urlString);
			}
			if (!f.isDirectory()) {
				if (containsURL(lcl, f.toURI().toURL())) {
					String why = "addCommonClassPath";
					if (debug > 2) {
						println(why + ": ALREADY " + url + " to " + lcl);
					} else if (debug > 2 && shortend) {
						println(why + ": SHORTEND ALREADY " + url + " to " + lcl);

					}
					return true;
				}
			}
			addURLToClassloader("addCommonClassPath", lcl, url);
			return true;
		} catch (Throwable e) {
			printStackTrace(e);
			return false;
		}
	}

	public void addCode(ClassLoader lcl, String stringTyped, boolean loadNow) {
		stringTyped = org.logicmoo.system.Startup.unquote(stringTyped);
		if (stringTyped.contains(";")) {
			for (String s : stringTyped.split(";")) {
				addCode(lcl, s, loadNow);
			}
			return;
		}
		int indexOf = stringTyped.indexOf(":");
		if (indexOf > 6) {
			for (String s : stringTyped.split(":")) {
				addCode(lcl, s, loadNow);
			}
			return;
		}
		stringTyped = org.logicmoo.system.Startup.unquote(stringTyped);
		URL url;
		do_more: do {
			if (stringTyped.startsWith("file:")) {

				try {
					url = new URL(stringTyped);
					stringTyped = url.getFile();
					continue do_more;
				} catch (MalformedURLException e) {
					printStackTrace(e);
				}

			} else if (stringTyped.startsWith("jar:")) {
				try {
					url = new URL(stringTyped);
					stringTyped = url.getFile();
					continue do_more;
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					printStackTrace(e);
				}
			}

		} while (false);

		File jfile = normalizedFile(new File(stringTyped));

		stringTyped = jfile.getAbsolutePath();
		if (!jfile.exists()) {
			int jarChars = stringTyped.indexOf(".jar!");
			if (jarChars > -1)
				try {
					jfile = normalizedFile(new File(stringTyped.substring(0, jarChars + 3)));
					String className = stringTyped.substring(jarChars + 4);
					addJarClass(lcl, jfile, className);
					return;
				} catch (Throwable e) {
					Errors.error("Error loading jar!class: " + stringTyped, e);
				}
		}
		if (jfile.exists()) {
			if (isZip(stringTyped))
				try {
					addJar(lcl, jfile, loadNow);
				} catch (Throwable e2) {
					Errors.error("Error accessing jar: " + stringTyped, e2);
				}
			else if (isCompilationUnit(stringTyped))
				try {
					addClassFile(jfile);
				} catch (Throwable e3) {
					Errors.error("Error accessing classfile: " + stringTyped, e3);
				}
			else if (jfile.isDirectory()) {
				try {
					addURLToClassloader("AddCode", lcl, jfile.toURI().toURL());
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
		String s = url.toString();
		if (s.startsWith("jar:")) {
			try {
				String s2 = url.getPath();
				if (s2.endsWith(BANG_SLASH)) {
					s2 = s2.substring(0, s.length() - 2);
				}
				url = new URL(s2);
			} catch (MalformedURLException e) {
				printStackTrace(e);
			}
		}
		try {
			return url.toURI().toURL();
		} catch (MalformedURLException | URISyntaxException e) {
			return url;
		}
	}

	public void addDirectory(ClassLoader lcl, File jfile) throws IOException {
		jfile = normalizedFile(jfile);
		final String extracted = slashify(jfile.getAbsolutePath(), false);
		final URL withHost = new URL("file", "", extracted);
		URL url = normalizedURL(withHost);
		addURL(url);
		File[] jfiles = jfile.listFiles();
		for (int i = 0; i < jfiles.length; ++i)
			scanFiles(lcl, jfiles[i], false, true);
	}

	public void addJar(ClassLoader lcl, File jfile, boolean loadNow) throws IOException {
		jfile = normalizedFile(jfile);
		final URL url = jfile.toURI().toURL();
		ArrayList<String> classFileList = new ArrayList<String>();
		addURL(url);
		if (!loadNow)
			return;
		//CodeSource src =  getProtectionDomain().getCodeSource();
		//if (src != null) {
		ZipInputStream zip = new ZipInputStream(url.openStream());
		while (true) {
			ZipEntry e = zip.getNextEntry();
			if (e == null)
				break;
			String name = e.getName();
			if (name != null) {
				classFileList.add(name);
			}
		}
		zip.close();
		for (String n : classFileList) {
			if (n.endsWith("/"))
				continue;
			if (isCompilationUnit(n)) {
				if (loadNow) {
					addJarClass(lcl, jfile, classNameFromFile(n));
				}
			}
		}
	}

	/**
	 * @param name
	 */
	static public String classNameFromFile(String name) {
		String cn = name;
		if (isCompilationUnit(name)) {
			cn = baseName(name);
		}
		cn = cn.replace('/', '.').replace('-', '_').replace('$', '.');
		return cn;
	}

	public void addJarClass(ClassLoader lcl, File jfile, String className) throws IOException {
		try {
			//
			jfile = normalizedFile(jfile);
			// Create a URL that refers to a jar file in the file system
			addJarClass(lcl, jarFileClassURL(jfile, className), className);
		} catch (MalformedURLException e) {
			printStackTrace(e);
		} catch (IOException e) {
			printStackTrace(e);
		} catch (ClassFormatError e) {
			printStackTrace(e);
		} catch (Error e) {
			printStackTrace(e);
		} catch (Throwable e) {
			printStackTrace(e);
		}
		return;
	}

	public void addJarClass(ClassLoader lcl, URL FileSysUrl, String className) throws IOException {
		try {

			// Create a jar URL connection object
			JarURLConnection jarURLConn = (JarURLConnection) FileSysUrl.openConnection();

			if (debug > 1) {
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
			if (className == null) {
				className = c.getName();
			}
			loadedAlready.put(className, c);
		} catch (MalformedURLException e) {
			printStackTrace(e);
		} catch (IOException e) {
			printStackTrace(e);
		} catch (ClassFormatError e) {
			printStackTrace(e);
		} catch (Error e) {
			printStackTrace(e);
		} catch (Throwable e) {
			printStackTrace(e);
		}
		return;

	}

	/**
	 * @param jfile
	 * @param classfileName
	 * @return
	 * @throws MalformedURLException
	 */
	public URL jarFileClassURL(File jfile, String className) throws MalformedURLException {
		jfile = normalizedFile(jfile);
		String classfileName = className.replace('.', File.separatorChar);
		if (classfileName.length() > 0) {
			classfileName += ".class";
		} else {
			final URL withHost = jfile.toURI().toURL();

			URL url = normalizedURL(withHost);
			final String extracted = slashify(jfile.getAbsolutePath(), false);
			//final URL withHost = new URL("file", "", extracted);

			return url;
		}
		return new URL("jar:file://" + jfile.getAbsolutePath() + BANG_SLASH + classfileName);
	}

	/**
	 * TODO Describe the purpose of this method.
	 * @param string
	 */
	static void println(String s) {
		s = "" + s;
		s = s.replace("G:/opt/CYC_JRTL_with_CommonLisp/platform", "$PLATFORM");
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
		Object lcl = this;
		String why = "AddUrl";
		url = normalizedURL(url);
		if (containsURL(this, url)) {
			if (debug > 2) {
				println(why + ": ALREADY " + url + " to " + lcl);
			} else if (debug > 1 && shortend) {
				println(why + ": SHORTEND ALREADY " + url + " to " + lcl);
			}
			return;
		}
		if (safeToGetSystemClassLaoder) {
			ClassLoader parent = getParent();
			if (containsURL(parent, url)) {
				if (debug > 0) {
					println(why + ": ALREADY PARENT " + url + " to " + parent);
				}
				return;
			}
			if (parent != parentClassLoader) {
				if (containsURL(parentClassLoader, url)) {
					if (debug > 0) {
						println(why + ": ALREADY parentClassLoader " + url + " to " + parentClassLoader);
					}
					return;
				}
			}
			ClassLoader sscl = getSystemClassLoader();
			if (lcl != parentClassLoader) {
				if (containsURL(sscl, url)) {
					if (debug > 0) {
						println(why + ": ALREADY getSystemClassLoader " + url + " to " + sscl);
					}
					return;
				}
			}
		}
		if (debug > 1)
			println(why + ": ADDING " + url + " to " + lcl);
		super.addURL(url);
	}

	/**
	 * TODO Describe the purpose of this method.
	 * @param url
	 */
	public static boolean containsURL(ClassLoader lcl, URL url) {
		if (lcl == null)
			return false;
		shortend = false;
		String urlstr = getUrlShortPath(url);
		boolean was = shortend;
		try {
			return containsURL(lcl, urlstr);
		} finally {
			if (was)
				shortend = true;
		}
	}

	public static boolean containsURL(ClassLoader lcl, String urlstr) {
		shortend = false;

		if ((lcl instanceof URLClassLoader)) {
			for (URL url : ((URLClassLoader) lcl).getURLs()) {
				final String string = getUrlShortPath(url);
				if (string.endsWith(urlstr))
					return true;
			}
		}
		final ClassLoader parent = lcl.getParent();
		if (parent == null)
			return false;
		return containsURL(parent, urlstr);
	}

	private static String getUrlShortPath(URL url) {
		url = normalizedURL(url);
		String urlPath = url.getPath();
		urlPath = slashify(urlPath, false);
		File jfile = normalizedFile(new File(urlPath));
		if (jfile.isDirectory()) {
			urlPath = slashify(jfile.getAbsolutePath(), true);
		} else {
			if (jfile.isFile()) {
				urlPath = slashify(jfile.getAbsolutePath(), false);
				urlPath = jfile.getName();
			} else {
				urlPath = slashify(urlPath, false);
			}
			if (isZip(urlPath)) {
				urlPath = baseName(urlPath);
			}
		}
		//if (true)
		//return urlPath;

		final String urlPathI = urlPath;
		int last = urlPath.lastIndexOf("-");
		String ro = urlPath.substring(last + 1);
		final boolean hyphen = last > 0 && !ro.contains("/");
		if (hyphen) {
			//			urlPath = urlPath.substring(0, last);
			urlPath = urlPath.replaceAll("[.][v0-9]+", "");
			urlPath = urlPath.replaceAll("[0-9]+[-]", "");
		}

		if (!urlPathI.equals(urlPath)) {
			shortend = true;
			if (debug > 2) {
				println("getUrlShortPath: `" + urlPath + "` from " + urlPathI);
			}
		}
		return urlPath;
	}

	/**
	 * @param urlPath
	 * @return
	 */
	public static String baseName(String urlPath) {
		int last = urlPath.lastIndexOf('.');
		if (last > 1) {
			return urlPath.substring(0, last);
		}
		return urlPath;
	}

	/**
	 * @param urlPath
	 * @return
	 */
	public static boolean isZip(String urlPath) {
		int last = urlPath.lastIndexOf('.');
		if (last > 1) {
			String ro = urlPath.substring(last).toLowerCase();
			return _zip_extensions.contains(ro);
		}
		return false;
	}

	public static boolean isCompilationUnit(String urlPath) {
		int last = urlPath.lastIndexOf('.');
		if (last > 1) {
			String ro = urlPath.substring(last + 1).toLowerCase();
			return _cu_extensions.contains(ro);
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
			if (debug > 2)
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
		if (isCompilationUnit(name)) {
			name = classNameFromFile(name);
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
	public static IsolatedClassLoader getCommonClassLoader() {
		IsolatedClassLoader lcl = IsolatedClassLoader.theIsolatedClassLoader;
		//assert lcl == Thread.currentThread().getContextClassLoader();
		return lcl;
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
		ClassLoader lcl = IsolatedClassLoader.getCommonClassLoader();
		Enumeration<URL> urls = lcl.getResources(classAsResource);
		while (urls.hasMoreElements()) {
			found++;
			URL url = urls.nextElement();
			if (debug > 1)
				printf("Found: %s%n", url.toExternalForm());
		}
		if (found == 0) {
			printf(" MISSING!: %s%n", name);
		} else if (found != 1) {
			printf(" DUPERS(%d): %s%n", found, name);

			urls = lcl.getResources(classAsResource);
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
		if (!Main.noinform) {
			printf("CLASSPATH=%s%n", System.getProperty("java.class.path"));
		}

		if (true)
			return;
		classDupes("org.apache.xerces.jaxp.SAXParserFactoryImpl");
		classDupes("com.cyc.library.webserviceutil.util.XMLWebService");

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
		//			printStackTrace(e);
		//		}
		//classDupes(com.sun.jersey.spi.scanning.AnnotationScannerListener.class);
	}
}
