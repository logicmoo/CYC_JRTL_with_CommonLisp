/**
 *
 */
package com.cyc.tool.subl.util;

/**
 * <P>IsolatedClassLoader is designed to isolate classes loaded into SubL
 *
 * <P>Copyright (c) 2008 Cycorp, Inc.  All rights reserved.
 * <BR>This software is the proprietary information of Cycorp, Inc.
 * <P>Use is subject to license terms.
 *
 *
 */
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;

public class IsolatedClassLoader extends URLClassLoader {
	public static boolean ALLOW_DYNAMIC_LOADING_OF_CODE = true;
	public static boolean ALLOW_LOADING_OF_DIRS_FROM_INTERPRETER = false;

	static URLClassLoader parentClassLoader = (URLClassLoader) ClassLoader.getSystemClassLoader();

	public static void addURLToClassPath(URL u) throws IOException {
		if (!IsolatedClassLoader.ALLOW_DYNAMIC_LOADING_OF_CODE)
			Errors.error("Loading of dynamic code is not allowed at this time.");

		// URLClassLoader sysLoader = parentClassLoader;;
		URL urls[] = IsolatedClassLoader.parentClassLoader.getURLs();
		for (int i = 0; i < urls.length; i++) {
			if (urls[i].toString().equalsIgnoreCase(u.toString()))
				return;

			Class sysclass = URLClassLoader.class;
			try {
				Method method = sysclass.getDeclaredMethod("addURL", new Class[] { URL.class });
				method.setAccessible(true);
				method.invoke(IsolatedClassLoader.parentClassLoader, new Object[] { u });
			} catch (Throwable t) {
				throw new IOException("Error, could not add URL to system classloader");
			}
		}
	}

	public static String slashify(String path, boolean isDirectory) {
		if (!IsolatedClassLoader.ALLOW_DYNAMIC_LOADING_OF_CODE)
			Errors.error("Loading of dynamic code is not allowed at this time.");
		String p = path;
		if (File.separatorChar != '/')
			p = p.replace(File.separatorChar, '/');
		if (!p.startsWith("/"))
			p = "/" + p;
		if (!p.endsWith("/") && isDirectory)
			p = p + "/";
		return p;
	}

	ArrayList<String> outerNames = new ArrayList<String>();

	Map<String, Class> loadedAlready = new HashMap<String, Class>();

	public IsolatedClassLoader() {
		super(new URL[0], IsolatedClassLoader.parentClassLoader);
	}

	/**
	 * @param jfile
	 * @throws ClassNotFoundException
	 */
	public Class addClassFile(File jfile) throws IOException, ClassNotFoundException {
		if (!IsolatedClassLoader.ALLOW_DYNAMIC_LOADING_OF_CODE)
			Errors.error("Loading of dynamic code is not allowed at this time.");
		Class c = this.loadClassFile(jfile);
		String className = c.getName();
		String simpleName = c.getSimpleName();
		this.scanForInners(jfile.getParentFile(), simpleName);
		this.resolveClass(Class.forName(className, false, this));
		Class[] inners = c.getDeclaredClasses();
		return c;
	}

	/**
	 * @param stringTyped
	 */
	public void addCode(String stringTyped) {
		if (!IsolatedClassLoader.ALLOW_DYNAMIC_LOADING_OF_CODE)
			Errors.error("Loading of dynamic code is not allowed at this time.");
		// not needed URI uri = URI.create(stringTyped);
		File jfile = new File(stringTyped);
		stringTyped = jfile.getAbsolutePath();
		String className;
		if (!jfile.exists()) {
			// inner .jar reference "myproj.jar!mypackage/myclass.class"
			int jarChars = stringTyped.indexOf(".jar!");
			if (jarChars > -1)
				try {
					jfile = new File(stringTyped.substring(0, jarChars + 3));
					className = stringTyped.substring(jarChars + 4);// .replace("/",
																	// ".");
					this.addJarClass(jfile, className);
					return;
				} catch (Exception e) {
					Errors.error("Error loading jar!class: " + stringTyped, e);
				}
		}

		if (jfile.exists()) {
			if (stringTyped.endsWith(".jar"))
				try {
					this.addJar(jfile);
				} catch (IOException e) {
					Errors.error("Error accessing jar: " + stringTyped, e);
				}
			else if (stringTyped.endsWith(".class"))
				try {
					this.addClassFile(jfile);
				} catch (Exception e) {
					Errors.error("Error accessing classfile: " + stringTyped, e);
				}
			else if (jfile.isDirectory()) {
				if (IsolatedClassLoader.ALLOW_LOADING_OF_DIRS_FROM_INTERPRETER)
					try {
						this.addDirectory(jfile);
					} catch (IOException e) {
						Errors.error("Error accessing classfile: " + stringTyped, e);
					}
				else
					Errors.error("Unable to load directory into classpath: " + jfile);
			} else
				Errors.error("Error loading file:: " + stringTyped + " not a class or jar file");

		} else
			Errors.error("Error finding file:: " + stringTyped);
	}

	/**
	 * @param jfile
	 */
	public void addDirectory(File jfile) throws IOException {
		if (!IsolatedClassLoader.ALLOW_DYNAMIC_LOADING_OF_CODE)
			Errors.error("Loading of dynamic code is not allowed at this time.");
		URL url = new URL("file", "", IsolatedClassLoader.slashify(jfile.getAbsolutePath(), false));
		this.addURL(url);
		File[] jfiles = jfile.listFiles();
		for (int i = 0; i < jfiles.length; i++)
			this.scanFiles(jfiles[i], false);
	}

	/**
	 * @param jfile
	 * @throws MalformedURLException
	 */
	public void addJar(File jfile) throws IOException {
		if (!IsolatedClassLoader.ALLOW_DYNAMIC_LOADING_OF_CODE)
			Errors.error("Loading of dynamic code is not allowed at this time.");
		URL url = new URL("jar:file://" + jfile.getPath() + "!/");
		// URL url = new URL("file", "", slashify(jfile.getAbsolutePath() +
		// "!/", false));
		this.addURL(url);
	}

	/**
	 * @param jfile
	 * @param className
	 */
	public void addJarClass(File jfile, String className) throws IOException {
		if (!IsolatedClassLoader.ALLOW_DYNAMIC_LOADING_OF_CODE)
			Errors.error("Loading of dynamic code is not allowed at this time.");
		this.addJar(jfile);
		JarURLConnection jarConnection = (JarURLConnection) jfile.toURI().toURL().openConnection();
		jarConnection.getInputStream();
		Errors.unimplementedMethod("addJarClass " + jfile + "!" + className);
	}

	public void addURL(URL url) {
		if (!IsolatedClassLoader.ALLOW_DYNAMIC_LOADING_OF_CODE)
			Errors.error("Loading of dynamic code is not allowed at this time.");
		// System.out.println(";; INFO adding URL " + url);
		super.addURL(url);
	}

	/**
	 * Finds and loads the class with the specified name from the URL search
	 * path. Any URLs referring to JAR files are loaded and opened as needed
	 * until the class is found.
	 *
	 * @param name
	 *            the name of the class
	 * @return the resulting class
	 * @exception ClassNotFoundException
	 *                if the class could not be found
	 */
	public Class<?> findClass(String name) throws ClassNotFoundException {
		if (!IsolatedClassLoader.ALLOW_DYNAMIC_LOADING_OF_CODE)
			Errors.error("Loading of dynamic code is not allowed at this time.");
		return super.findClass(name);
		// String path = name.replace('.', '/').concat(".class");
		// URL res = getResource(path);
		//
		//
		// if (res != null) {
		// try {
		// URLConnection uc = new URLConnection(res);
		// byte[] def = res.getContent();
		// return defineClass(def, 0, def.length);
		// } catch (IOException e) {
		// throw new ClassNotFoundException(name, e);
		// }
		// } else {
		// throw new ClassNotFoundException(name);
		// }
	}

	public boolean isDefinedHere(String s) {
		if (!IsolatedClassLoader.ALLOW_DYNAMIC_LOADING_OF_CODE)
			Errors.error("Loading of dynamic code is not allowed at this time.");
		Iterator<String> ss = this.outerNames.iterator();
		while (ss.hasNext()) {
			String sl = ss.next();
			if (s.startsWith(sl))
				return true;
		}
		return false;
	}

	public synchronized Class loadClass(String className) throws ClassNotFoundException {
		if (!IsolatedClassLoader.ALLOW_DYNAMIC_LOADING_OF_CODE)
			Errors.error("Loading of dynamic code is not allowed at this time.");
		Class c = this.findLoadedClass(className);
		ClassNotFoundException ex = null;
		if (c == null) {
			// try {
			if (!this.isDefinedHere(className))
				if (c == null)
					try {
						c = IsolatedClassLoader.parentClassLoader.loadClass(className);
						// System.out.println("parent Loading: " + className);
						this.resolveClass(c);
						return c;
					} catch (ClassNotFoundException e) {
						ex = e;
					}

			System.out.println("local Loading: " + className);
			if (c == null)
				try {
					c = this.findClass(className);
				} catch (ClassNotFoundException e) {
					if (ex == null)
						ex = e;
				}

			if (c == null)
				try {
					if (IsolatedClassLoader.parentClassLoader != null)
						c = IsolatedClassLoader.parentClassLoader.loadClass(className);
				} catch (ClassNotFoundException e) {
					if (ex == null)
						ex = e;
				}

			// } catch (ClassNotFoundException e) {
		}
		if (c != null) {
			this.resolveClass(c);
			return c;
		}
		throw ex;
	}

	/**
	 * @param jfile
	 */
	private Class loadClassFile(File jfile) throws IOException {
		if (!IsolatedClassLoader.ALLOW_DYNAMIC_LOADING_OF_CODE)
			Errors.error("Loading of dynamic code is not allowed at this time.");
		String sfile = jfile.getAbsolutePath();
		Class c = this.loadedAlready.get(sfile);
		if (c != null)
			/// System.out.println("avoiding reloading of: " + sfile);
			return c;
		// System.out.println("loadClassfile: " + jfile + " @ " + sfile);
		DataInputStream dis = new DataInputStream(new FileInputStream(jfile));
		int size = dis.available();
		byte[] byteArray = new byte[size];
		dis.read(byteArray, 0, size);
		try {
			c = this.defineClass(null, byteArray, 0, size);
			String className = c.getName();
			this.outerNames.add(className);
		} catch (Throwable t) {
			System.out.println("defineClass: " + t);
		}
		this.loadedAlready.put(sfile, c);
		return c;
	}

	/**
	 * @param jfile
	 */
	private void scanFiles(File jfile, boolean defineClasses) {
		if (!IsolatedClassLoader.ALLOW_DYNAMIC_LOADING_OF_CODE)
			Errors.error("Loading of dynamic code is not allowed at this time.");
		if (jfile.isFile()) {
			String s = jfile.getAbsolutePath();
			if (s.endsWith(".class")) {
				try {
					if (defineClasses)
						this.addClassFile(jfile);
				} catch (Exception e) {
					Errors.error("Error while loading inner classes for: " + jfile, e);
				}
				return;
			}
			if (s.endsWith(".jar")) {
				try {
					this.addJar(jfile);
				} catch (IOException e) {
					Errors.error("Error while loading inner classes for: " + jfile, e);
				}
				return;
			}
		}
		if (jfile.isDirectory()) {
			File[] jfiles = jfile.listFiles();
			for (int i = 0; i < jfiles.length; i++)
				this.scanFiles(jfiles[i], defineClasses);
		}
	}

	/**
	 * @param parent
	 * @param className
	 */
	private void scanForInners(File parent, String className) throws IOException {
		if (!IsolatedClassLoader.ALLOW_DYNAMIC_LOADING_OF_CODE)
			Errors.error("Loading of dynamic code is not allowed at this time.");
		File[] innersMaybe = parent.listFiles();
		for (int i = 0; i < innersMaybe.length; i++) {
			String named = innersMaybe[i].getName();
			if (named.startsWith(className))
				try {
					this.loadClassFile(innersMaybe[i]);
				} catch (Throwable t) {
					Errors.error("Error while loading inner classes for: " + className, t);
				}
		}
	}
}
