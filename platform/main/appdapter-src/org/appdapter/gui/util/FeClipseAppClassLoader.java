package org.appdapter.gui.util;

import static org.appdapter.gui.util.CollectionSetUtils.addAllNew;
import static org.appdapter.gui.util.CollectionSetUtils.*;
import static org.appdapter.gui.util.CollectionSetUtils.*;
import static org.appdapter.gui.util.PromiscuousClassUtilsA.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

import org.appdapter.core.debug.UIAnnotations.DontAdd;
import org.appdapter.core.debug.UIAnnotations.HRKRefinement;
import org.appdapter.core.log.Debuggable;
//import static org.appdapter.gui.util.CollectionSetUtils.*;
//import org.appdapter.api.trigger.AnyOper.*;

/**
 * A class loader to allow for loading of other jars that are added as a URL.
 */
public class FeClipseAppClassLoader extends URLClassLoader implements DontAdd, HRKRefinement {
	static Class[] CLASS_STRING_1 = new Class[] { String.class };

	public static <ET> boolean addCollection(List<Object> strings, ClassLoader thiz, ET[] elems) {
		boolean changed = false;
		if (addAllNew(strings, elems))
			changed = true;
		return changed;
	}

	public static <T> void appendURLS(final StringBuilder str, String sep, Iterable<T> urls) {
		boolean first = true;
		for (T u : urls) {
			Object url = u;
			if (url instanceof URL) {
				url = u.toString();
			}
			if (!(url instanceof String))
				continue;
			if (!first) {
				str.append(sep);
			} else {
				first = false;
			}
			str.append(url);
		}
	}

	public static boolean pathsOf(List<Object> strings, ClassLoader cl, boolean includeParent) {
		if (cl == getSystemClassLoader())
			return addIfNew(strings, "$CLASSPATH");
		if (cl instanceof IsolatingClassLoaderBase) {
			return ((URLClassLoaderBase) cl).addPathStringsForDebug(strings, includeParent);
		}
		if (cl instanceof URLClassLoader) {
			boolean changed = addCollection(strings, cl, ((URLClassLoader) cl).getURLs());
			if (includeParent) {
				if (pathsOf(strings, cl.getParent(), includeParent))
					changed = true;
			}
			return changed;
		}
		if (cl == null)
			cl = getBootstrapClassLoader();
		return addIfNew(strings, cl.toString());
	}

	/** Dynamically added ClassLoaders. */
	private final Collection<ClassLoader> classLoadersToSearch;
	private ClassLoader replacing;

	/**
	 * Constructs a new object.
	 * 
	 * @param parent
	 *            the parent class loader.
	 */
	public FeClipseAppClassLoader(final Collection<ClassLoader> list, ClassLoader replacingcl) {
		super(new URL[0], replacingcl.getParent());
		replacing = replacingcl;
		classLoadersToSearch = list;
		addClassloader(replacingcl);
		addClassloader(this);
	}

	public void addClassLoader(final ClassLoader url) {
		if (classLoadersToSearch.contains(url)) {
			return;
		}
		synchronized (classLoadersToSearch) {
			classLoadersToSearch.add(url);
		}
	}

	public boolean addPathStringsForDebug(List<Object> strings, boolean includeParent) {
		boolean changed = false;
		for (ClassLoader url : getClassLoadersToSearch(false)) {
			if (pathsOf(strings, url, includeParent))
				changed = true;
		}
		if (includeParent) {
			if (pathsOf(strings, getParent(), includeParent))
				changed = true;
		}
		return changed;
	}

	/**
	 * <code>
	 * public void addURL(final URL url) {
	 *   super.addURL_super(url);
	 * }
	 * </code>
	 */
	@Override public void addURL(final URL url) {
		addURL_super(url);
	}

	public final void addURL_super(URL url) {
		super.addURL(url);
	}

	/**
	 * Adds the given URLs to the classpath.
	 * 
	 * @param additions
	 *            URLs to add.
	 */
	public void addURLs(final URL[] additions) {
		for (URL url : additions) {
			addURL(url);
		}
	}

	/**
	* Returns a class loaded by the bootstrap class loader;
	* or return null if not found.
	*/
	final public Class findBootstrapClassOrNull(String name) {
		return rememberClass(name, (Class) callProtectedMethodNullOnUncheck(this, "findBootstrapClassOrNull", name));
	}

	@Override
	final protected Class<?> findClass(final String name) throws ClassNotFoundException {
		return rememberClass(name, findClassLocalMethodologyActuallyDefines(name));
	}

	public Class findClassLocalMethodologyActuallyDefines(String name) throws ClassNotFoundException {
		try {
			Class c = findClassLocalMethodologyActuallyDefines0(name);
			if (c != null) {
				return c;
			}
		} catch (Error e) {
			throw e;
		} catch (ClassNotFoundException e) {
			throw e;
		}
		return null;
	}

	public Class findClassLocalMethodologyActuallyDefines0(String name) throws ClassNotFoundException {

		boolean useSystem = (name.startsWith("java.") || name.startsWith("sun.") || name.startsWith("javax."));
		ClassLoader systemLoader = getTrueSCL();
		boolean testedUsingRealSL = false;
		ClassLoader bpsystemLoader = getBootstrapClassLoader();
		ClassNotFoundException cnf = null;
		Error error = null;

		if (useSystem) {
			try {
				testedUsingRealSL = true;
				Class loadedClass = loadClass(systemLoader, name);
				if (isSomething(loadedClass))
					return rememberClass(name, loadedClass);
			} catch (ClassNotFoundException t) {
				cnf = t;
			} catch (Error t) {
				if (cnf == null)
					error = t;
				throw t;
			} catch (Throwable t) {
				Debuggable.printStackTrace(t);
			}
			if (bpsystemLoader != this && bpsystemLoader != systemLoader) {

				try {
					Class loadedClass = bpsystemLoader.loadClass(name);
					if (loadedClass != null)
						return loadedClass;
				} catch (ClassNotFoundException t) {
					if (cnf == null)
						cnf = t;
					throw t;
				} catch (Error t) {
					if (cnf == null)
						error = t;
					throw t;
				} catch (Throwable t) {
					Debuggable.printStackTrace(t);
				}
				System.err.println("EVILY SEARCHING MISSING SYSTEM CLASS " + name);
			}
		}
		int searched = 0;
		for (ClassLoader cl : getClassLoadersToSearch(true)) {
			searched++;
			try {
				if (useSystem) {
					if (cl == systemLoader || cl == bpsystemLoader)
						continue;
				} else if (cl == systemLoader) {
					testedUsingRealSL = true;
				}
				Class<?> result = callProtectedMethodNullOnUncheck(cl, "findClass", name);
				if (isSomething(result))
					return rememberClass(name, result);
			} catch (Throwable e) {
				Debuggable.printStackTrace(e);
				continue;
			}
		}

		if (!testedUsingRealSL) {
			Class loadedClass = loadClass(replacing, name);
			if (isSomething(loadedClass))
				return rememberClass(name, loadedClass);
		}
		if (cnf != null && useSystem)
			throw cnf;
		return rememberClass(name, findClassSuperThruURLS(name));
	}

	private Class loadClass(ClassLoader systemLoader, String name) throws ClassNotFoundException, LinkageError {
		return systemLoader.loadClass(name);
	}

	private ClassLoader getTrueSCL() {
		ClassLoader systemLoader = ClassLoader.getSystemClassLoader();
		if (systemLoader == this) {
			systemLoader = originalSystemClassLoader;
		}
		if (replacing != systemLoader) {
			return replacing;
		}
		return systemLoader;
	}

	protected Class<?> findClassSuperThruURLS(String name) throws ClassNotFoundException {
		try {
			return rememberClass(name, super.findClass(name));
		} catch (ClassNotFoundException cnf) {
			throw cnf;
		} catch (Error err) {
			throw err;
		}
	}

	public Class<?> findLoadedClassLocalMethodology(String name) throws ClassNotFoundException {
		Class pl = findLoadedClassByName(name);
		if (pl != null)
			return pl;
		for (ClassLoader cl : getClassLoadersToSearch(true)) {
			Class<?> result = callProtectedMethodNullOnUncheck(cl, "findLoadedClass", name);
			if (isSomething(result))
				return rememberClass(name, result);
		}
		return rememberClass(name, super.findLoadedClass(name));
	}

	public URL findPromiscuousResource(String name, Collection<URL> exceptFor) {
		if (contains("findResource", name)) {
			return null;
		}
		push("findResource", name);
		try {
			Collection<ClassLoader> cls = getClassLoadersToSearch(true);
			URL url = null;
			for (ClassLoader cl : cls) {
				try {
					url = callProtectedMethodNullOnUncheck(cl, "findResource", name);
					if (isSomething(url)) {
						if (exceptFor.contains(url))
							continue;
						return url;
					}
				} catch (Throwable e) {
					e.printStackTrace();
					continue;
				}
			}
			try {
				Enumeration<URL> enumU = getResources(name);
				while (enumU.hasMoreElements()) {
					url = enumU.nextElement();
					if (url == null)
						continue;
					if (exceptFor != null && exceptFor.contains(url))
						continue;
					return url;
				}
				return null;
			} catch (Throwable t) {
				Debuggable.printStackTrace(t);
				return super.findResource(name);
			}

		} finally {
			pop("findResource", name);
		}
	}

	@Override public URL findResource(String name) {
		return findPromiscuousResource(name, new ArrayList<URL>());
	}

	@Override public Enumeration<URL> findResources(String name) throws IOException {
		Vector<URL> vect = new Vector<URL>();
		for (ClassLoader cl : getClassLoadersToSearch(true)) {
			Enumeration<URL> result = callProtectedMethodNullOnUncheck(cl, "findResources", name);
			if (result != null)
				addAllNew(vect, result);
		}
		return vect.elements();
	}

	/**
	 * @return the classLoadersToSearch
	 */
	private Collection<ClassLoader> getClassLoadersToSearch(boolean parentOK) {
		Collection<ClassLoader> al;
		synchronized (classLoadersToSearch) {
			al = new ArrayList<ClassLoader>(classLoadersToSearch);
		}
		al.remove(this);
		ClassLoader cl = getParent();
		if (cl != null) {
			al.remove(cl);
			if (parentOK) {
				al.add(cl);
			}
		}
		return al;
	}

	@Override public URL getResource(String name) {
		if (contains("getResource", name)) {
			return null;
		}
		push("getResource", name);
		try {
			Collection<ClassLoader> cls = getClassLoadersToSearch(true);
			Vector vect = new Vector();
			for (ClassLoader cl : cls) {
				URL result = callProtectedMethodNullOnUncheck(cl, "getResource", name);
				if (result != null)
					addIfNew(vect, result);
			}
			if (vect.size() < 1)
				return null;
			return (URL) vect.elements().nextElement();
		} finally {
			pop("getResource", name);
		}
	}

	@Override
	public InputStream getResourceAsStream(String name) {
		for (ClassLoader cl : getClassLoadersToSearch(false)) {
			try {
				InputStream result = cl.getResourceAsStream(name);
				if (result != null) {
					if (result.available() > 0) {
						return result;
					}
				}
			} catch (IOException e) {
			}

		}
		return getParent().getResourceAsStream(name);
	}

	@Override public Enumeration getResources(String name) throws IOException {
		Vector vect = new Vector();
		for (ClassLoader cl : getClassLoadersToSearch(true)) {
			Enumeration result = callProtectedMethodNullOnUncheck(cl, "getResources", name);
			if (result != null)
				addAllNew(vect, result);
		}
		return vect.elements();
	}

	/**
	 * {@inheritDoc}
	 */
	final @Override public Class<?> loadClass(final String name) throws ClassNotFoundException {
		// this is what the superclass does
		return loadClass(name, false);
	}

	final @Override public Class loadClass(String name, boolean resolve) throws ClassNotFoundException {
		// First, check if the class has already been loaded
		Class c = findLoadedClass(name);
		ClassLoader parent = getParent();
		if (c == null) {
			try {
				c = findLoadedClassLocalMethodology(name);
			} catch (Throwable e) {
				Debuggable.printStackTrace(e);
			}
		}
		if (c == null) {
			try {
				if (parent != null) {
					try {
						c = callProtectedMethodNullOnUncheck(true, false, parent, "loadClass", name, false);
					} catch (RuntimeException we) {
						//we.printStackTrace();
						//throw we.getCause();
					}
					if (c != null) {

					}
				} else {
					c = findBootstrapClassOrNull(name);
				}
			} catch (Throwable e) {
				//Debuggable.printStackTrace(e);
				// ClassNotFoundException thrown if class not found
				// from the non-null parent class loader
			}

		}
		if (c == null) {
			//try {
			c = findClass(name);
			//} catch (Throwable e) {
			//Debuggable.printStackTrace(e);
			//}
		}
		if (resolve) {
			resolveClass(c);
		}
		return c;
	}

	public Class loadClassParentNoResolve(String class_name) throws ClassNotFoundException {
		ClassLoader p = getParent();
		try {
			return callProtectedMethod(false, p, "loadClass", class_name, false);
		} catch (InvocationTargetException e1) {
			Throwable ee = e1.getCause();
			if (ee instanceof ClassNotFoundException)
				throw (ClassNotFoundException) ee;
			Debuggable.UnhandledException(ee);
			if (ee instanceof RuntimeException)
				throw (RuntimeException) ee;
			throw new ClassNotFoundException("InvallidTarget: ", ee);
		} catch (NoSuchMethodException ee) {
			throw new ClassNotFoundException("PROGRAMMER ERROR: ", ee);
		}
	}

	@Override public String toString() {
		ArrayList<Object> strings = new ArrayList<Object>();
		this.addPathStringsForDebug(strings, true);
		final StringBuilder str = new StringBuilder();
		str.append(getClass().getCanonicalName());
		str.append('[');
		appendURLS(str, ";", strings);
		str.append(']');
		return str.toString();
	}

}
