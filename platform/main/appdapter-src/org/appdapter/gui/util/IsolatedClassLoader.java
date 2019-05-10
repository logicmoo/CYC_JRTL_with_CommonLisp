package org.appdapter.gui.util;

import static org.appdapter.gui.util.CollectionSetUtils.addAllNew;
import static org.appdapter.gui.util.PromiscuousClassUtilsA.addClassloader;
import static org.appdapter.gui.util.PromiscuousClassUtilsA.rememberClass;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.List;

import org.appdapter.core.debug.UIAnnotations.HRKRefinement;

/**
 * A class loader to allow for loading of other jars that are added as a URL.
 * 
 */
public final class IsolatedClassLoader extends FromManyClassLoader implements HRKRefinement {
	/** Dynamically added URLs. */
	private final Collection<URL> urls;

	@Override public String toString() {
		ArrayList<Object> strings = new ArrayList<Object>();
		this.addPathStringsForDebug(strings, true);
		final StringBuilder str = new StringBuilder();
		str.append(getClass().getSimpleName());
		str.append('[');
		appendURLS(str, ";", strings);
		str.append(']');
		return str.toString();
	}

	/**
	 * Constructs a new object.
	 * 
	 * @param parent
	 *            the parent class loader.
	 */
	public IsolatedClassLoader(final ClassLoader parent, boolean spyOnly, boolean sharedFirst, boolean fallBackPromiscuous, List<ClassLoader> fileCls) {
		super(fileCls, parent);
		urls = new java.util.ArrayList<URL>();
		addClassloader(parent);
		addClassloader(this);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override public void addURL(final URL url) {
		if (urls.contains(url)) {
			return;
		}

		urls.add(url);
		super.addURL_super(url);
	}

	/**
	 * Adds the given URLs to the classpath.
	 * 
	 * @param additions
	 *            URLs to add.
	 */
	@Override public void addURLs(final URL[] additions) {
		for (URL url : additions) {
			addURL(url);
		}
	}

	@Override public URL findResource(String name) {
		return super.findResource(name);
	}

	@Override public Enumeration<URL> findResources(String name) throws IOException {
		return super.findResources(name);
	}

	@Override public Class<?> findClassLocalMethodologyActuallyDefines(String name) throws ClassNotFoundException {
		return null;
	}

	@Override public Class<?> findLoadedClassLocalMethodology(final String name) throws ClassNotFoundException {
		ClassNotFoundException orig = null;
		Class c = null;
		try {
			c = super.findLoadedClassLocalMethodology(name);
		} catch (ClassNotFoundException e) {
			orig = e;
		} catch (Throwable e) {
		}
		if (c == null) {
		try {
			c = rememberClass(name, loadClassUseSystem(name, false));
		} catch (ClassNotFoundException e) {
			orig = e;
			} catch (Throwable e) {
		}
		}
		if (c == null) {
		try {
			c = rememberClass(name, loadClassUseSystem(name, true));
		} catch (ClassNotFoundException e) {
				if (orig != null)
			throw orig;
			} catch (Throwable e) {
			}
		}
		if (c != null) {
			resolveClass(c);
		}
		return c;
	}

	private Class<?> loadClassUseSystem(final String name, boolean useSystem) throws ClassNotFoundException {
		Class<?> loadedClass = findLoadedClass(name);
		if (loadedClass != null)
			return loadedClass;
		if (!useSystem) {
			if (name.startsWith("java.")/* || name.startsWith("scala.")*/)
				useSystem = true;
		}

		try {
			if (useSystem) {
				loadedClass = PromiscuousClassUtilsA.forName(name, false, null);
			} else {
				loadedClass = findClass(name);
			}
		} catch (ClassNotFoundException e) {
			// Swallow exception
			// does not exist locally
		}
		if (loadedClass != null)
			return loadedClass;
		try {
			if (useSystem) {
				final ClassLoader systemLoader = ClassLoader.getSystemClassLoader();
				loadedClass = systemLoader.loadClass(name);
			} else {
				loadedClass = loadClassParentNoResolve(name);
			}
		} catch (ClassNotFoundException e) {
			throw e;
		}

		return loadedClass;
	}

	/**
	 * Returns the search path of URLs for loading classes and resources. This
	 * includes the original list of URLs specified to the constructor, along
	 * with any URLs subsequently appended by the addURL() method.
	 * 
	 * @return the search path of URLs for loading classes and resources.
	 */
	@Override public URL[] getURLs() {
		URL[] surls = super.getURLs();
		if (surls.length != urls.size()) {
			throw new RuntimeException("Bad get URLS! ");
		}
		return surls;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override public boolean addPathStringsForDebug(List<Object> strings, boolean includeParent) {
		boolean changed = addCollection(strings, this, getURLs());
		if (includeParent) {
			if (pathsOf(strings, getParent(), includeParent))
				changed = true;
		}
		return changed;
	}

	public static <ET> boolean addCollection(List<Object> strings, ClassLoader thiz, ET[] elems) {
		boolean changed = false;
		if (addAllNew(strings, elems))
			changed = true;
		return changed;
	}

}
