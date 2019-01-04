//
// For LarKC
//
package com.cyc.tool.subl.util;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.JarURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;

public class IsolatedClassLoader extends URLClassLoader {
	public IsolatedClassLoader() {
		super(new URL[0], IsolatedClassLoader.parentClassLoader);
		outerNames = new ArrayList<String>();
		loadedAlready = new HashMap<String, Class>();
	}

	public static void addURLToClassPath(URL u) throws IOException {
		URL[] urls = IsolatedClassLoader.parentClassLoader.getURLs();
		for (int i = 0; i < urls.length; ++i) {
			if (urls[i].toString().equalsIgnoreCase(u.toString()))
				return;
			Class sysclass = URLClassLoader.class;
			try {
				Method method = sysclass.getDeclaredMethod("addURL", URL.class);
				method.setAccessible(true);
				method.invoke(IsolatedClassLoader.parentClassLoader, u);
			} catch (Throwable t) {
				throw new IOException("Error, could not add URL to system classloader");
			}
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
	Map<String, Class> loadedAlready;
	public static boolean ALLOW_DYNAMIC_LOADING_OF_CODE = true;
	public static boolean ALLOW_LOADING_OF_DIRS_FROM_INTERPRETER = false;
	static URLClassLoader parentClassLoader;
	static {
		parentClassLoader = (URLClassLoader) IsolatedClassLoader.class.getClassLoader();
	}

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
			System.out.println("defineClass: " + t);
		}
		loadedAlready.put(sfile, c);
		return c;
	}

	private void scanFiles(File jfile, boolean defineClasses) {
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
		if (jfile.isDirectory()) {
			File[] jfiles = jfile.listFiles();
			for (int i = 0; i < jfiles.length; ++i)
				scanFiles(jfiles[i], defineClasses);
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
		resolveClass(Class.forName(className, false, this));
		Class[] inners = c.getDeclaredClasses();
		return c;
	}

	public void addCode(String stringTyped) {
		URI uri = URI.create(stringTyped);
		File jfile = new File(stringTyped);
		stringTyped = jfile.getAbsolutePath();
		if (!jfile.exists()) {
			int jarChars = stringTyped.indexOf(".jar!");
			if (jarChars > -1)
				try {
					jfile = new File(stringTyped.substring(0, jarChars + 3));
					String className = stringTyped.substring(jarChars + 4);
					addJarClass(jfile, className);
					return;
				} catch (Exception e) {
					Errors.error("Error loading jar!class: " + stringTyped, e);
				}
		}
		if (jfile.exists()) {
			if (stringTyped.endsWith(".jar"))
				try {
					addJar(jfile);
				} catch (IOException e2) {
					Errors.error("Error accessing jar: " + stringTyped, e2);
				}
			else if (stringTyped.endsWith(".class"))
				try {
					addClassFile(jfile);
				} catch (Exception e3) {
					Errors.error("Error accessing classfile: " + stringTyped, e3);
				}
			else if (jfile.isDirectory())
				Errors.error("Unable to load directory into classpath: " + jfile);
			else
				Errors.error("Error loading file:: " + stringTyped + " not a class or jar file");
		} else
			Errors.error("Error finding file:: " + stringTyped);
	}

	public void addDirectory(File jfile) throws IOException {
		URL url = new URL("file", "", slashify(jfile.getAbsolutePath(), false));
		addURL(url);
		File[] jfiles = jfile.listFiles();
		for (int i = 0; i < jfiles.length; ++i)
			scanFiles(jfiles[i], false);
	}

	public void addJar(File jfile) throws IOException {
		URL url = new URL("jar:file://" + jfile.getPath() + "!/");
		addURL(url);
	}

	public void addJarClass(File jfile, String className) throws IOException {
		addJar(jfile);
		JarURLConnection jarConnection = (JarURLConnection) jfile.toURI().toURL().openConnection();
		jarConnection.getInputStream();
		Errors.unimplementedMethod("addJarClass " + jfile + "!" + className);
	}

	@Override
	public void addURL(URL url) {
		super.addURL(url);
	}

	@Override
	public Class<?> findClass(String name) throws ClassNotFoundException {
		return super.findClass(name);
	}

	public boolean isDefinedHere(String s) {
		for (String sl : outerNames)
			if (s.startsWith(sl))
				return true;
		return false;
	}

	@Override
	public synchronized Class loadClass(String className) throws ClassNotFoundException {
		Class c = findLoadedClass(className);
		ClassNotFoundException ex = null;
		if (c == null) {
			if (!isDefinedHere(className) && c == null)
				try {
					c = IsolatedClassLoader.parentClassLoader.loadClass(className);
					resolveClass(c);
					return c;
				} catch (ClassNotFoundException e) {
					ex = e;
				}
			System.out.println("local Loading: " + className);
			if (c == null)
				try {
					c = findClass(className);
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
		}
		if (c != null) {
			resolveClass(c);
			return c;
		}
		throw ex;
	}
}
