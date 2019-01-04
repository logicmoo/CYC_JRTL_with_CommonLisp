package org.appdapter.gui.util;

import static org.appdapter.core.convert.ReflectUtils.addIfNew;
import static org.appdapter.core.convert.ReflectUtils.getFieldValue;
import static org.appdapter.core.convert.ReflectUtils.setField;
import static org.appdapter.core.log.Debuggable.LOGGER;
import static org.appdapter.core.log.Debuggable.NoSuchClassImpl;
import static org.appdapter.core.log.Debuggable.UnhandledException;
import static org.appdapter.core.log.Debuggable.notImplemented;
import static org.appdapter.core.log.Debuggable.reThrowable;
import static org.appdapter.core.log.Debuggable.toInfoStringArgV;

import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.net.URLDecoder;
import java.security.ProtectionDomain;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.Properties;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.appdapter.core.debug.NoLeakThreadLocal;
import org.appdapter.core.debug.UIAnnotations.HRKRefinement;
import org.appdapter.core.log.Debuggable;

//import sun.reflect.Reflection;

//import org.slf4j.helpers.NOPLoggerFactory;

@SuppressWarnings("restriction")
abstract public class PromiscuousClassUtilsA {
	public static NoLeakThreadLocal<Boolean> dontActuallyDefine = new NoLeakThreadLocal<Boolean>();

	static public interface ArchiveSearcher {
		String replace(String target, boolean maySplit, int depth);
	}

	// Thread local to detect class loading cycles.
	private final static NoLeakThreadLocal m_depthCheck = new NoLeakThreadLocal();
	public static ClassLoader originalSystemClassLoader = getSystemClassLoader();
	public static ClassLoader bootstrapClassLoader = originalSystemClassLoader.getParent();
	public static ArrayList<ClassLoader> allClassLoaders = new ArrayList<ClassLoader>();
	public static FeClipseAppClassLoader feClipseAppClassLoader = new FeClipseAppClassLoader(allClassLoaders, originalSystemClassLoader);

	public static Set<Class> classesSeen = new HashSet<Class>();
	public static Map<String, Class> classnameToClass = new HashMap();
	private static Map<String, Throwable> classNotFoundYet = new HashMap<String, Throwable>();

	public static NoLeakThreadLocal<Map<String, List<?>>> m_currentModule = new NoLeakThreadLocal<Map<String, List<?>>>();

	private static String M2_REPO = null;

	public static FromManyClassLoader many;

	public static boolean missingDepsOK = false;

	private static Map<ClassLoader, ClassLoader> switchedOutClassLoader = new HashMap<ClassLoader, ClassLoader>();

	public static boolean treatmissingLikeOptional = true;

	public static boolean verifyClassNames = false;
	public static ClassLoader systemClassLoader;

	public static void addClassloader(ClassLoader useAlt) {
		if (useAlt == null)
			return;
		if (useAlt instanceof FromManyClassLoader)
			return;
		synchronized (allClassLoaders) {
			addIfNew(allClassLoaders, useAlt);
		}
	}

	public static void addLocationToSystemClassPath(String location) {
		ClassLoader syscl = getSystemClassLoader();
		scanLoadable(new AddToClassPath(syscl), location, true, false, null, true, null);
	}

	public static void applyConfigReplacements(Properties props) {
		// Perform variable substitution for system properties.
		for (Enumeration e = props.propertyNames(); e.hasMoreElements();) {
			String name = (String) e.nextElement();

			props.setProperty(name, substAll(props.getProperty(name)));
		}
	}

	private static URL asURL(String path) {
		URL url;
		try {
			url = new URL(path);
			return url;
		} catch (MalformedURLException e) {
			File f = new File(path);
			if (f.exists())
				try {
					return f.getAbsoluteFile().toURL();
				} catch (MalformedURLException e1) {
				}
			return null;
		}

	}

	public static String bundleJarToDir(String str) {
		return substAll(str, false, false);
	}

	//static NamingResolver namingResolver = new ClassLoadingNamingResolver();

	@SuppressWarnings("unchecked") static public <T> T callProtectedMethod(boolean skipNSM, Object from, String methodName, Object... args) throws InvocationTargetException, NoSuchMethodException {
		Throwable whyBroken = null;
		Method foundm = null;
		Class c = from.getClass();
		while (c != null) {
			try {
				for (Method method : c.getDeclaredMethods()) {
					if (!method.getName().equals(methodName))
						continue;
					if (foundm == null)
						foundm = method;
					Class[] pts = method.getParameterTypes();
					if (pts.length != args.length)
						continue;
					foundm = method;
					int peekAt = args.length - 1;
					if (peekAt >= 0) {
						Class pc = pts[peekAt];
						Object po = args[peekAt];
						if (pc.isPrimitive()) {
							if (po == null)
								continue;
							pc = nonPrimitiveTypeFor(pc);
						}
						if (po != null)
							if (!pc.isInstance(po))
								continue;
					}
					method.setAccessible(true);
					try {
						return (T) method.invoke(from, args);
					} catch (IllegalArgumentException e) {
						whyBroken = e;
					} catch (SecurityException e) {
						whyBroken = e;
					} catch (IllegalAccessException e) {
						whyBroken = e;
					} catch (InvocationTargetException e) {
						whyBroken = e.getCause();
						throw e;
					}
				}

			} catch (IllegalArgumentException e) {
				whyBroken = e;
			} catch (SecurityException e) {
				whyBroken = e;
			} catch (Throwable e) {
				whyBroken = e;
			}
			c = c.getSuperclass();
		}
		// whyBroken.printStackTrace();

		if (whyBroken instanceof RuntimeException) {
			throw (RuntimeException) whyBroken;
		}
		if (whyBroken instanceof Error) {
			throw (Error) whyBroken;
		}
		if (skipNSM)
			return null;
		throw new NoSuchMethodException(toInfoStringArgV("NoSuchMethod " + methodName + " on=", from, "args=", args));
		// NoSuchMethod
		// if (true)
		// throw new RuntimeException(whyBroken);
		//return null;
	}

	@SuppressWarnings("unchecked") static public <T> T callProtectedMethodNullOnUncheck(Object from, String methodName, Object... args) {
		try {
			return callProtectedMethodNullOnUncheck(false, true, from, methodName, args);
		} catch (RuntimeException we) {
			return null;
		}
	}

	@SuppressWarnings("unchecked") static public <T> T callProtectedMethodNullOnUncheck(boolean throwClause, boolean trace, Object from, String methodName, Object... args) throws RuntimeException {
		Throwable whyBroken;
		Throwable wb;
		Throwable fav = null;
		try {
			return callProtectedMethod(false, from, methodName, args);
		} catch (NoSuchMethodException e) {
			return null;
		} catch (Throwable e) {
			whyBroken = e.getCause();
			wb = e;
		}
		while (wb != null) {
			whyBroken = wb;
			if (whyBroken instanceof NoSuchMethodException) {
				if (!throwClause)
					return null;
				fav = wb;
				break;
			}
			if (whyBroken instanceof ClassNotFoundException) {
				if (!throwClause)
					return null;
				fav = wb;
				break;
			}
			if (whyBroken instanceof NoClassDefFoundError) {
				if (!throwClause)
					return null;
				fav = wb;
				break;
			}
			if (whyBroken instanceof MissingResourceException) {
				if (!throwClause)
					return null;
				fav = wb;
				break;
			}
			if (whyBroken instanceof LinkageError) {
				if (!throwClause)
					return null;
				fav = wb;
				break;
			}
			if (whyBroken instanceof IOException) {
				if (!throwClause)
					return null;
				fav = wb;
				break;
			}
			if (whyBroken instanceof NullPointerException) {
				//if (!throwClause) return null;
				fav = wb;
				break;
			}
			Throwable twb = wb.getCause();
			if (twb == wb || twb == null) {
				break;
			}
			wb = twb;
		}
		if (trace) {
			printStackTrace(whyBroken);
			UnhandledException(whyBroken);
		}
		if (fav != null) {
			throw new RuntimeException(fav);
		}
		if (whyBroken instanceof Error)
			throw ((Error) whyBroken);
		if (whyBroken instanceof RuntimeException)
			throw ((RuntimeException) whyBroken);
		throw reThrowable(whyBroken);

	}

	public static <T> T castAs(Object obj) {
		try {
			return (T) obj;
		} catch (ClassCastException cce) {
			return null;
		}
	}

	public static ClassLoader coerceClassloader(ClassLoader cl2, boolean spyOnly, boolean sharedFirst, boolean fallBackPromiscuous) {
		if (cl2 instanceof IsolatingClassLoaderBase)
			return cl2;
		if (!sharedFirst && !spyOnly)
			return cl2;
		if (cl2 instanceof HRKRefinement) {
			return cl2;
		}
		synchronized (switchedOutClassLoader) {
			IsolatedClassLoader icl = (IsolatedClassLoader) switchedOutClassLoader.get(cl2);
			if (icl == null) {
				addClassloader(cl2);
				ClassLoader parentWillBe = null;
				List<ClassLoader> clList = new ArrayList<ClassLoader>();
				if (sharedFirst) {
					clList.add(getPromiscuousClassLoader());
				}
				if (spyOnly) {
					parentWillBe = cl2;
				} else {
					clList.add(cl2);
				}
				if (fallBackPromiscuous && !sharedFirst) {
					clList.add(getPromiscuousClassLoader());
				}
				icl = new IsolatedClassLoader(parentWillBe, spyOnly, sharedFirst, fallBackPromiscuous, clList);
				switchedOutClassLoader.put(cl2, icl);
			}
			return icl;
		}
	}

	public static <T> boolean contains(String act, T impl) {
		List<T> currentModulePrev = getModuleStack(act);
		return currentModulePrev.contains(impl);
	}

	static public <T> T createInstance(Class<T> clz) throws InstantiationException {
		Throwable why = null;
		try {
			try {
				final Constructor constructor = clz.getDeclaredConstructor();
				constructor.setAccessible(true);
				return (T) constructor.newInstance();
			} catch (IllegalArgumentException e) {
				why = e;
			} catch (InvocationTargetException e) {
				why = e.getCause();
			}
			return clz.newInstance();
		} catch (SecurityException e) {
			why = e;
		} catch (NoSuchMethodException e) {
			why = e;
		} catch (InstantiationException e) {
			why = e;
		} catch (IllegalAccessException e) {
			why = e;
		}
		return (T) NoSuchClassImpl("newInstance=" + clz + " err=", why);
	}

	public static Class defineClass(LoadableScanner scanner, ClassLoader loader, String className, byte[] bytes, ProtectionDomain pd) throws LinkageError, ClassNotFoundException {
		loader = getCorrectLoader(loader);
		if (isJustClassCheck()) {
			try {
				return forName(className, false, loader);
			} catch (ClassNotFoundException e) {
				return newClassNotFound("isJustClassCheck", className, e, true, false);
			}
		}

		if (className.startsWith("java.") || className.startsWith("sun.")) {
			try {
				return Class.forName(className, false, null);
			} catch (Throwable e) {
				return newClassNotFound("defineClass", className, e, true, false);
			}
		}

		ClassLoader cl = getThreadClassLoader();
		try {
			if (loader == null) {
				loader = getCurrentClassLoader();
			}
			setContextClassLoader(loader);
			return defineClass0(loader, className, bytes, pd);
		} finally {
			setContextClassLoader(cl);
		}
	}

	private static Class newClassNotFound(String which, String className, Throwable e, boolean needPrint, boolean dontThrow) throws LinkageError, NoClassDefFoundError, ClassNotFoundException {
		Throwable t = e;
		if (t instanceof InvocationTargetException) {
			t = t.getCause();
		}
		if (t instanceof NoClassDefFoundError) {
			if (needPrint)
				warn(which + " " + className + " caught " + t);
			needPrint = false;
			// A class refers to an uunresolvable class.. thatr is bound to happen with 34rd party jars
			if (!dontThrow)
				throw (NoClassDefFoundError) t;
		} else if (t instanceof LinkageError) {
			if (needPrint)
				warn(which + " " + className + " caught " + t);
			needPrint = false;
			if (!dontThrow)
				throw (LinkageError) t;
			// A class refers to an uunresolvable class.. thatr is bound to happen with 34rd party jars
		}
		if (!(t instanceof ClassNotFoundException)) {
			if (needPrint)
				printStackTrace(t);
		} else {
			Throwable whyCNF = t.getCause();
			if (whyCNF != null && whyCNF != t) {
				printStackTrace(whyCNF);
				warn("WHEN: " + which + " " + className + " caught " + t);

				if (!dontThrow)
					throw (ClassNotFoundException) t;
			}
		}
		if (needPrint)
			warn(which + " " + className + " caught " + t);
		return null;
	}

	public static boolean isJustClassCheck() {
		return dontActuallyDefine.get() == Boolean.TRUE;
	}

	public static Class defineClass0(ClassLoader loader, String className, byte[] bytes, ProtectionDomain pd) throws LinkageError, ClassNotFoundException {
		try {
			pd = null;
			Class c = null;
			if (className == null) {
				c = callProtectedMethod(false, loader, "defineClass", bytes, 0, bytes.length, pd);
				className = c.getCanonicalName();
			} else {
				if (className.startsWith("java.") || className.startsWith("sun.")) {
					try {
						return Class.forName(className, false, null);
					} catch (ClassNotFoundException e) {
						printStackTrace(e);
						return null;
					}
				}
				c = callProtectedMethod(false, loader, "findLoadedClass", className);
				if (c == null) {
					c = findLoadedClassByName(className);
					if (c == null) {
						c = callProtectedMethod(false, loader, "defineClass", className, bytes, 0, bytes.length, pd);
					} else {
						// something is odd
					}
				}
			}
			rememberClass(className, c);
			return c;
		} catch (Throwable e) {
			return newClassNotFound("defineClass0", className, e, true, false);
		}
	}

	static Thread mainThread = null;

	public static void ensureInstalled() {
		Thread ct = Thread.currentThread();
		boolean onNewThreads = false;
		if (mainThread == null) {
			mainThread = Thread.currentThread();
			ensureInstalledGUI();
		} else if (mainThread == ct) {
			return;
		} else {
			ensureInstalledGUI();
		}
	}

	public static void ensureInstalledGUI() {
		/*
				if (FeClipse.installManyClassloaderUtils) {
					try {
						overrideSCL();
					} catch (Throwable e) {
						e.printStackTrace();
					}
				}
				if (FeClipse.installAppClassUtils) {
					if (ensureInstalledApplCL(FeClipseAppClassLoader.class, feClipseAppClassLoader))
						return;
				}
				if (FeClipse.installPromiscuousClassUtils)
					ensureInstalled(true, false, false);*/
	}

	private static void overrideSCL() throws Throwable {
		if (true)
			return;
		ClassLoader scl = ClassLoader.getSystemClassLoader();
		if (scl instanceof HRKRefinement)
			return;
		ClassLoader scl1 = feClipseAppClassLoader;
		setField(null, ClassLoader.class, ClassLoader.class, "scl", scl1);
		Object scl2 = getFieldValue(null, ClassLoader.class, ClassLoader.class, "scl");
		ClassLoader scl3 = ClassLoader.getSystemClassLoader();
		if (scl1 != scl3) {
			throw new Throwable("cant set classloader!");
		}

		// The class loader for the system
		//private static ClassLoader scl;

		// Set to true once the system class loader has been set
		//private static boolean sclSet;

	}

	public static void ensureInstalled(boolean spyOnly, boolean sharedFirst, boolean fallBackPromiscuous) {
		ClassLoader cl1 = ClassLoader.getSystemClassLoader();
		if (!(cl1 instanceof HRKRefinement)) {
			coerceClassloader(cl1, spyOnly, sharedFirst, fallBackPromiscuous);
		}
		ClassLoader cl2 = Thread.currentThread().getContextClassLoader();

		ClassLoader cl3 = coerceClassloader(cl2, spyOnly, sharedFirst, fallBackPromiscuous);
		if (cl3 != cl2) {
			setContextClassLoader(cl3);
		}
		//namingResolver.toString();
	}

	public static boolean ensureInstalledApplCL(Class type, ClassLoader orelse) {
		ClassLoader cl2 = Thread.currentThread().getContextClassLoader();
		if (type.isInstance(cl2))
			return true;
		addClassloader(cl2);
		if (orelse == null)
			return false;

		ClassLoader cl3 = orelse;

		if (cl3 != cl2) {
			setContextClassLoader(cl3);
		}
		return true;
	}

	public static boolean ensureLoadable(String className) {
		if (ensureLoadable(className, getCurrentClassLoader()))
			return true;

		warn("Unable to load: " + className);
		ensureLoadable(className, false, null, true, true);
		return false;
	}

	public static boolean ensureLoadable(String className, ClassLoader cl) {
		if (ensureLoadable(className, false, cl, false, false) != null)
			return true;
		return false;
	}

	public static Class ensureLoadable(String className, boolean tryInit, ClassLoader threadCL, boolean trace, boolean tryPCL) {
		PrintStream ps = System.err;
		//threadCL = getCorrectLoader(threadCL);
		try {
			Class c = Class.forName(className, false, threadCL);
			if (tryInit) {
				Class.forName(className, true, threadCL);
			}
			rememberClass(className, c);
			return c;
		} catch (Throwable e) {
			ClassLoader pcl = getPromiscuousClassLoader();
			if (tryPCL && pcl != threadCL && feClipseAppClassLoader != threadCL) {
				Class c = ensureLoadable(className, tryInit, pcl, trace, false);
				if (c != null) {
					ps.println("PCL can see but not thread-context-CL=" + threadCL + " cannot see " + className + " " + e);
					if (threadCL != null) {
						try {
							callProtectedMethod(false, threadCL, "resolveClass", c);
						} catch (Throwable e1) {
							printStackTrace(e1);
						}
					}
				}
				return c;
			}
			if (trace) {
				printStackTrace(e);
			}
			return null;
		}
	}

	public static void ensureOntoligized(Class interfaceClass) {
		boolean wasTrue = true || HRKRefinement.class.isAssignableFrom(interfaceClass);
		if (!wasTrue) {
			LOGGER.warning("interfaceClass " + interfaceClass + " is not Ontoligized");
		}
		//Assert.assertTrue("All our classes are ontoligized", wasTrue);

	}

	private static File findClassesDir(Class<?> clazz) {
		try {
			String path = clazz.getProtectionDomain().getCodeSource().getLocation().getFile();
			final String codeSourcePath = URLDecoder.decode(path, "UTF-8");
			return new File(codeSourcePath, clazz.getPackage().getName().replace('.', File.separatorChar));
		} catch (UnsupportedEncodingException e) {
			throw new AssertionError(e);
		}
	}

	public static Object findClassOrResourceByDelegation(String pkgname, String name, boolean isClass, boolean useAllClassLoaders) //throws ClassNotFoundException, ResourceNotFoundException
	{
		// Get the package of the target class/resource.
		if (pkgname == null || pkgname.equals("")) {
			pkgname = (isClass) ? getClassPackage(name) : getResourcePackage(name);
		}
		if (isClass) {
			Class z = findLoadedClassByName(name);
			if (z != null) {
				if (loadPackageInBundleOnly(pkgname)) {
					return null;
				}
				return z;
			}
		}
		if (loadPackageInBundleOnly(pkgname)) {
			return null;
		}
		LinkageError le = null;
		ClassNotFoundException cnf0 = null;
		boolean wasFound = false;
		try {
			Object o = findClassOrResourceByDelegationUncaugth(pkgname, name, isClass, useAllClassLoaders);
			if (o != null) {
				wasFound = true;
				return o;
			}
		} catch (ClassNotFoundException cnf) {
			cnf0 = cnf;
		} catch (NoClassDefFoundError cnf) {
			le = cnf;
			//	throw cnf;
		} catch (LinkageError cnf) {
			le = cnf;

		} finally {
			if (!wasFound && loadPackageOutsideBundleOnly(pkgname)) {
				throw new RuntimeException("loadPackageOutsideBundleOnly p=" + pkgname + " c=" + name);
			}
		}
		return null;
	}

	public static Object findClassOrResourceByDelegationLastChance(String pkgname, String name, boolean isClass, boolean useAllClassLoaders) //throws ClassNotFoundException, ResourceNotFoundException
	{
		return findClassOrResourceByDelegation(pkgname, name, isClass, useAllClassLoaders);
	}

	public static Object findClassOrResourceByDelegationOverride(String pkgname, String name, boolean isClass, boolean useAllClassLoaders) {
		return findClassOrResourceByDelegation(pkgname, name, isClass, useAllClassLoaders);
	}

	public static Object findClassOrResourceByDelegationUncaugth(String pkgname, String name, boolean isClass, boolean useAllClassLoaders) throws ClassNotFoundException {
		ClassLoader ccl = getCallerClassLoader();
		ClassLoader pcl = getPromiscuousClassLoader();
		ClassLoader useCL = getCurrentClassLoader();
		if (useCL == null) {
			useCL = ccl;
		}
		Object co;
		try {
			if (useAllClassLoaders) {
				if (pcl == null) {
					useCL = pcl;
				}
			}
			co = findClassOrResourceByDelegationWithClassloader(pkgname, name, false, useCL, isClass);
		} catch (NoClassDefFoundError e) {
			return null;
		} catch (ClassNotFoundException e) {
			return null;
		} catch (Error e) {
			if (true)
				throw e;
			return null;
		} catch (RuntimeException e) {
			if (true)
				throw e;
			return null;
		} catch (Exception e) {
			return null;
		} catch (Throwable e) {
			return null;
		}

		if (co == null)
			return null;
		if (isClass && pkgname != null) {
			if (pkgname.startsWith("scala")) {
				return null;
			}
			if (pkgname.startsWith("java")) {
				return null;
			}
		}
		return co;

	}

	public static Object findClassOrResourceByDelegationWithClassloader(String pkgname, String name, boolean initialize, ClassLoader useCL, boolean isClass) throws ClassNotFoundException, Throwable /*throws , ResourceNotFoundException */{

		if (isClass) {
			Class z = findLoadedClassByName(name);
			if (z != null)
				return z;
		}
		String m_cycleCheck = "m_cycleCheck isClass = " + isClass;
		if (contains(m_cycleCheck, name)) {
			// If a cycle is detected, we should return null to break the
			// cycle. This should only ever be return to internal class
			// loading code and not to the actual instigator of the class load.
			return null;
		}
		Integer depthCheck = (Integer) m_depthCheck.get();
		if (depthCheck == null) {
			depthCheck = Integer.valueOf(1);
			m_depthCheck.set(depthCheck);
		} else {
			depthCheck = depthCheck.intValue() + 1;
			m_depthCheck.set(depthCheck);
		}
		int depth = depthCheck;
		try {
			push(m_cycleCheck, name);
			if (isClass) {
				{
					try {
						Class fnd1 = Class.forName(name, initialize, getCorrectLoader(useCL));
						if (fnd1 != null) {
							ClassLoader cl = fnd1.getClassLoader();
							return fnd1;
						} else {
							// wierd?
							return null;
						}
					} catch (ClassNotFoundException e) {
						trace("while findClassOrResourceByDelegationWithClassloader " + name + "" + e);
						if (depth > 1)
							throw e;
						return null;
					} catch (NoClassDefFoundError e) {
						trace("while findClassOrResourceByDelegationWithClassloader " + name + "" + e);
						if (depth > 1)
							throw e;
						return null;
					} catch (LinkageError e) {
						trace("while findClassOrResourceByDelegationWithClassloader " + name + "" + e);
						if (depth > 1)
							throw e;
						return null;
					}

				}
			} else {
				URL fnd1 = useCL.getResource(name);
				if (fnd1 != null)
					return fnd1;
				return null;
			}

		} finally {
			pop(m_cycleCheck, name);
			depthCheck = depth - 1;
			m_depthCheck.set(depthCheck);
		}
	}

	public static Class findLoadedClassByName(String name) {
		synchronized (classnameToClass) {
			Class c = classnameToClass.get(name);
			if (c != null) {
				return c;
			}
		}
		return null;
	}

	public static Class findLoadedClassByName(String className, ClassLoader loader) {
		if (loader == null)
			loader = getCurrentClassLoader();
		Class c = null;
		try {
			c = callProtectedMethod(false, loader, "findLoadedClass", className);
			if (c != null)
				return c;
		} catch (InvocationTargetException e) {
			printStackTrace(e.getCause());
		} catch (NoSuchMethodException e) {
			printStackTrace(e);
		}
		if (c == null) {
			c = findLoadedClassByName(className);
			if (c == null)
				return null;
			// something is odd maybe resolve it here?
		}
		return c;
	}

	public static Class findPromiscuousClass(String className) throws ClassNotFoundException {
		return getPromiscuousClassLoader().findClass(className);
	}

	public static URL findPromiscuousResource(String name, Collection<URL> exceptFor) throws Exception {
		FromManyClassLoader pcl = getPromiscuousClassLoader();
		if (name.startsWith("/"))
			name = name.substring(1);
		URL url = pcl.findPromiscuousResource(name, exceptFor);
		if (url != null && (exceptFor == null || !exceptFor.contains(url))) {
			return url;
		}
		return null;
	}

	public static <T> Class<T> forName(String className) throws ClassNotFoundException {
		return forName(className, false, getCallerClassLoader());
	}

	public static <T> Class<T> forName(String className, boolean initialize, ClassLoader loader) throws ClassNotFoundException, NoClassDefFoundError {
		ClassNotFoundException cnf = null;
		LinkageError ncde = null;
		Class pl = findLoadedClassByName(className);
		if (pl != null)
			return pl;
		try {
			loader = getCorrectLoader(loader);
			return (Class<T>) rememberClass(className, (Class<T>) Class.forName(className, initialize, loader));
		} catch (VirtualMachineError e) {
			throw e;
		} catch (LinkageError e) {
			ncde = e;
			classNotFoundYet.put(className, e);
		} catch (ClassNotFoundException e) {
			cnf = e;
		} catch (SecurityException e) {
			//cnf = e;
		} catch (Throwable e) {
			e.printStackTrace();
		}
		try {
			Class c = (Class<T>) findPromiscuousClass(className);
			if (c == null)
				throw new NoClassDefFoundError(className);
			return rememberClass(className, c);
		} catch (Throwable e) {
			if (cnf != null)
				throw cnf;
			if (e instanceof VirtualMachineError)
				throw (VirtualMachineError) e;
			if (ncde != null)
				throw ncde;
			if (e instanceof ClassNotFoundException)
				throw (ClassNotFoundException) e;
			if (e instanceof LinkageError)
				throw (LinkageError) e;
			throw new ClassNotFoundExceptionFA(className, e);
		}
	}

	public static ClassLoader getBootstrapClassLoader() {
		if (bootstrapClassLoader != null) {
			return bootstrapClassLoader;
		}
		return Object.class.getClassLoader();
	}

	private static byte[] getBytes(InputStream is) throws IOException {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		byte[] buf = new byte[2048];
		OutputStream out = new BufferedOutputStream(bos);
		int len;

		while ((len = is.read(buf)) > 0) {
			out.write(buf, 0, len);
		}

		// release resource
		out.flush();
		out.close();
		byte[] bytes = bos.toByteArray();
		return bytes;
	}

	// Returns the invoker's class loader, or null if none.
	// NOTE: This must always be invoked when there is exactly one intervening
	// frame from the core libraries on the stack between this method's
	// invocation and the desired invoker.
	public static ClassLoader getCallerClassLoader() {
		// NOTE use of more generic Reflection.getCallerClass()
		Class caller = PromiscuousClassUtilsA.class;
		int depth = 4;
		while (caller == PromiscuousClassUtilsA.class) {
			depth++;
			caller = sun.reflect.Reflection.getCallerClass(depth);
      //System.out.println("-- using StackWalker --");
      //StackWalker instance = StackWalker.getInstance(StackWalker.Option.RETAIN_CLASS_REFERENCE);
      //caller = instance.getCallerClass();
      //System.out.println(callerClass);

      //System.out.println("-- using stack trace --");
      for (StackTraceElement ste : Thread.currentThread().getStackTrace()) {
          //System.out.println(caller.getClassLoader());
      	// if(depth--<0) caller =  getClassPackage(ste.getClassName());
      }
		}
		// This can be null if the VM is requesting it
		if (caller == null) {
			return null;
		}
		// CANT Circumvent security check
		ClassLoader ccl = caller.getClassLoader();
		if (ccl == null) {
			//	warn("Class with no loader " + caller);
		}
		return ccl;
	}

	public static String getClassPackage(String className) {
		if (className == null) {
			className = "";
		}
		return (className.lastIndexOf('.') < 0) ? "" : className.substring(0, className.lastIndexOf('.'));
	}

	public static ClassLoader getCorrectLoader(ClassLoader loader) {

		if (isJustClassCheck())
			return getJustCheckingLoader();

		if (loader == feClipseAppClassLoader && feClipseAppClassLoader != null)
			return loader;

		/*	if (FeClipse.installAppClassUtils && feClipseAppClassLoader != null) {
				if (loader == null)
					return feClipseAppClassLoader;
				return feClipseAppClassLoader;
			}
		*/
		if (loader == bootstrapClassLoader && bootstrapClassLoader != null)
			return loader;

		if (loader == null) {
			return null;
		}

		if (loader == many && many != null)
			return loader;

		ClassLoader scl = getSystemClassLoader();
		if (loader == scl && scl != null)
			return loader;

		if (loader != null) {
			return scl;

		}
		return scl;
	}

	public static ClassLoader getCurrentClassLoader() {
		if (isJustClassCheck()) {
			return getJustCheckingLoader();
		}
		ClassLoader cl = getCallerClassLoader();
		return getThreadClassLoader();
	}

	private static String getFClassName(String packageOff, String path) {
		if (path.startsWith(packageOff))
			path = path.substring(packageOff.length());
		if (path.endsWith(".class")) {
			path = path.substring(0, path.length() - 6);
		}
		String className = path.replaceAll("\\\\", "/").replaceAll("/", ".");
		if (className.startsWith("."))
			className = className.substring(1);
		return className;
	}

	public static <T> Collection<Class<? extends T>> getImplementingClasses(Class<T> interfaceClass) {
		ensureOntoligized(interfaceClass);
		Collection<Class<? extends T>> foundClasses = new HashSet<Class<? extends T>>();
		ensureInstalled();
		for (Class type : getInstalledClasses()) {
			if (!isCreateable(type))
				continue;
			if (interfaceClass.isAssignableFrom(type)) {
				addIfNew(foundClasses, type);
			}
		}
		return foundClasses;
	}

	private static InputStream getInputStream(String path) throws IOException {
		File file = new File(path);
		if (file.exists()) {
			return new FileInputStream(file);
		}
		try {
			return new URL(path).openStream();
		} catch (MalformedURLException e) {
			throw new IOException(e);
		}
	}

	private static InputStream getInputStream(URL path) throws IOException {
		return path.openStream();
	}

	public static ArrayList<Class> getInstalledClasses() {
		synchronized (classesSeen) {
			return new ArrayList<Class>(classesSeen);
		}
	}

	public static String getMavenRepo() {
		if (M2_REPO == null) {
			M2_REPO = System.getenv("M2_REPO");
			if (M2_REPO == null) {
				M2_REPO = System.getProperty("user.home").replace("\\", "/") + "/.m2/repository";
			} else {
				M2_REPO = M2_REPO.replace("\\", "/");
			}
		}
		return M2_REPO;
	}

	public static <T> List<T> getModuleStack(String act) {
		Map map = getModuleStackMap();
		List<T> currentModulePrev = (List<T>) map.get(act);
		if (currentModulePrev == null) {
			currentModulePrev = new LinkedList<T>();
			map.put(act, currentModulePrev);
		}
		return currentModulePrev;
	}

	public static synchronized Map<String, List<?>> getModuleStackMap() {
		Map<String, List<?>> currentModulePrev = m_currentModule.get();
		if (currentModulePrev == null) {
			currentModulePrev = new HashMap<String, List<?>>();
			m_currentModule.set(currentModulePrev);
		}
		return currentModulePrev;
	}

	public synchronized static FromManyClassLoader getPromiscuousClassLoader() {
		if (many == null) {
			ClassLoader parent = getBootstrapClassLoader();
			synchronized (allClassLoaders) {
				allClassLoaders.add(parent);
			}
			many = new FromManyClassLoader(allClassLoaders, parent);
		}
		return many;
	}

	public static ProtectionDomain getProtectionDomain(ClassLoader loader) {
		return loader.getClass().getProtectionDomain();
	}

	public static String getResourcePackage(String resource) {
		if (resource == null) {
			resource = "";
		}
		// NOTE: The package of a resource is tricky to determine since
		// resources do not follow the same naming conventions as classes.
		// This code is pessimistic and assumes that the package of a
		// resource is everything up to the last '/' character. By making
		// this choice, it will not be possible to load resources from
		// imports using relative resource names. For example, if a
		// bundle exports "foo" and an importer of "foo" tries to load
		// "/foo/bar/myresource.txt", this will not be found in the exporter
		// because the following algorithm assumes the package name is
		// "foo.bar", not just "foo". This only affects imported resources,
		// local resources will work as expected.
		String pkgName = (resource.startsWith("/")) ? resource.substring(1) : resource;
		pkgName = (pkgName.lastIndexOf('/') < 0) ? "" : pkgName.substring(0, pkgName.lastIndexOf('/'));
		pkgName = pkgName.replace('/', '.');
		return pkgName;
	}

	public static ClassLoader getSystemClassLoader() {
		if (systemClassLoader != null)
			return systemClassLoader;
		return ClassLoader.getSystemClassLoader();
	}

	public static ClassLoader getThreadClassLoader() {
		return Thread.currentThread().getContextClassLoader();
	}

	public static boolean isCreateable(Class type) {
		if (type.isInterface())
			return false;
		if (Modifier.isAbstract(type.getModifiers()))
			return false;
		if (Modifier.isInterface(type.getModifiers()))
			return false;
		/*
		Constructor[] v = type.getConstructors();
		if (v == null || v.length == 0)
			return false;*/
		return true;
	}

	public static boolean isSomething(Object result) {
		if (result == null)
			return false;
		if (result instanceof Enumeration) {
			Enumeration e = (Enumeration) result;
			if (e.hasMoreElements())
				return true;
			return false;
		}
		if (result instanceof Collection) {
			Collection e = (Collection) result;
			if (e.size() > 0)
				return true;
			return false;
		}
		if (result instanceof Iterator) {
			Iterator e = (Iterator) result;
			if (e.hasNext())
				return true;
			return false;
		}
		if (result instanceof Iterable) {
			Iterator e = ((Iterable) result).iterator();
			if (e.hasNext())
				return true;
			return false;
		}
		return true;
	}

	private static String join(String[] properties, String splitter) {
		if (properties == null)
			return null;
		int len = properties.length;
		if (len == 0)
			return "";
		if (len == 1)
			return properties[0];
		StringBuffer buff = new StringBuffer(properties[len - 1]);
		for (int i = 1; i < len; i++) {
			buff.append(splitter);
			buff.append(properties[i]);
		}
		return buff.toString();
	}

	public static boolean loadPackageInBundleOnly(String pkgname) {
		if (true)
			return false;
		if (true)
			return true;
		if (pkgname != null) {
			if (pkgname.contains("puma") || pkgname.contains("preview") || pkgname.contains("content"))
				return true;
		}
		return false;
	}

	public static boolean loadPackageOutsideBundleOnly(String pkgname) {
		if (true)
			return false;
		if (pkgname != null) {
			if (pkgname.contains("java") || pkgname.contains("org.appdapter"))
				return true;
		}
		return false;
	}

	public static Class nonPrimitiveTypeFor(Class wrapper) {
		if (!wrapper.isPrimitive())
			return wrapper;
		if (wrapper == Boolean.TYPE)
			return Boolean.class;
		if (wrapper == Byte.TYPE)
			return Byte.class;
		if (wrapper == Character.TYPE)
			return Character.class;
		if (wrapper == Short.TYPE)
			return Short.class;
		if (wrapper == Integer.TYPE)
			return Integer.class;
		if (wrapper == Long.TYPE)
			return Long.class;
		if (wrapper == Float.TYPE)
			return Float.class;
		if (wrapper == Double.TYPE)
			return Double.class;
		if (wrapper == Void.TYPE)
			return Void.class;
		throw new ClassCastException("cant make non primitive from :" + wrapper);
	}

	public static <T> Class<T> OneInstC(String p, String c) {
		notImplemented();
		try {
			return (Class<T>) forName(p + "" + c);
		} catch (ClassNotFoundException e) {
			return null;
		} catch (Throwable e) {
			printStackTrace(e);
			return null;
		}
	}

	public static <T> T OneInstO(String p, String c) {
		Class clz = OneInstC(p, c);
		if (clz == null)
			return null;
		notImplemented();
		try {
			return (T) createInstance(clz);
		} catch (Exception e1) {
			UnhandledException(e1);
		}
		return null;
	}

	public static <T> T peek(String act) {
		List<T> currentModulePrev = getModuleStack(act);
		if (currentModulePrev.size() < 1)
			return (T) null;
		return currentModulePrev.get(0);

	}

	public static <T> T peek(String act, int idx) {
		List<T> currentModulePrev = getModuleStack(act);
		int len = currentModulePrev.size() - 1;
		int fnd = 0;
		T was = null;
		while (idx > 0) {
			T iz = currentModulePrev.get(fnd);
			if (iz != was) {
				idx--;
				was = iz;
			}
			if (fnd >= idx) {
				return null;
			}
			fnd++;
		}
		return was;

	}

	public static <T> T pop(String act, T impl) {
		List<T> currentModulePrev = getModuleStack(act);
		T was = currentModulePrev.get(0);
		assert (was == impl);
		return currentModulePrev.remove(0);
	}

	public static boolean isClassPathIsMissingFromLoader = false;

	public interface LoadableScanner {

		boolean isClassFileScanned(String className, ClassLoader loader);

		Class getClassFile();

		boolean isJarFileScanned(URL jarName, ClassLoader loader);

		boolean validClassFile(Class c);

		boolean isDirScanned(URL scan);

	}

	public static class AddToClassPath implements LoadableScanner {

		URLClassLoader classLoader;

		public AddToClassPath(ClassLoader loader) {
			classLoader = getURLCLassLoader(loader);
		}

		@Override public boolean isClassFileScanned(String className, ClassLoader loader) {
			return true;
		}

		@Override public Class getClassFile() {
			return null;
		}

		@Override public boolean validClassFile(Class c) {
			return true;
		}

		@Override public boolean isJarFileScanned(URL jarName, ClassLoader loader) {
			if (classLoader != null) {
				addURLToClassloader(jarName, classLoader);
				return true;
			}
			return addURLToClassloader(jarName, loader);
		}

		HashSet<URL> scannedURLS = new HashSet<URL>();

		@Override public boolean isDirScanned(URL jarName) {
			if (scannedURLS.contains(jarName))
				return true;
			scannedURLS.add(jarName);
			return false;
		}
	}

	public static class PreloadClasses extends CheckClassPath {

		public PreloadClasses(ClassLoader loader) {
			super(loader);
		}

		@Override public boolean isClassFileScanned(String className, ClassLoader loader) {
			return false;
		}

		@Override public boolean validClassFile(Class c) {
			return c != null;
		}

		@Override public boolean isJarFileScanned(URL jarName, ClassLoader loader) {
			return false;
		}

	}

	public static class CheckClassPath extends AddToClassPath {

		Class lastClass = null;

		public CheckClassPath(ClassLoader loader) {
			super(loader);
		}

		@Override public boolean isClassFileScanned(String className, ClassLoader loader) {
			try {
				lastClass = null;
				if (className == null)
					return false;
				lastClass = forName(className, false, loader);
			} catch (Throwable e) {
				if (e instanceof LinkageError)
					throw (LinkageError) e;
				lastClass = null;
			}
			return true;
		}

		@Override public Class getClassFile() {
			return lastClass;
		}

		@Override public boolean validClassFile(Class c) {
			return lastClass != null;
		}

		@Override public boolean isJarFileScanned(URL jarName, ClassLoader loader) {
			return false;
		}
	}

	public static void preloadSystemClasspath(Class anyClass) {
		ClassLoader loader = anyClass.getClassLoader();
		String cp = System.getProperty("java.class.path");

		if (!ensureLoadable("scala.Option", loader)) {
			warn("ClassPath IsMissingFromLoader");
			isClassPathIsMissingFromLoader = true;
			URLClassLoader ucl = getURLCLassLoader(loader);
			addURLToClassloader(asURL(M2_REPO + "/org/scala-lang/scala-library/2.10.2/scala-library-2.10.2.jar"), ucl);
			if (!ensureLoadable("scala.ScalaObject", loader)) {
				if (false)
					throw new NoClassDefFoundError("Cant add anyting to classpath!");
				warn("Cant add anyting to classpath!");
			}
		}

		if (isClassPathIsMissingFromLoader) {
			scanLoadable(new AddToClassPath(loader), cp, true, true, true);
		}

		loader = getSystemClassLoader();
		if (!ensureLoadable("scala.Option", loader)) {
			loader = getSystemClassLoader();
			scanLoadable(new PreloadClasses(loader), cp, true, true, true);
		}
		loader = getSystemClassLoader();

		if (!ensureLoadable("scala.Serializable", loader)) {
			scanLoadable(new PreloadClasses(loader), cp, true, true, true);
		}

		Boolean before = dontActuallyDefine.get() == Boolean.TRUE;
		ClassLoader tcl = getThreadClassLoader();
		try {
			dontActuallyDefine.set(true);
			ClassLoader jcl = getJustCheckingLoader();
			setContextClassLoader(jcl);
			preloadSystemClasspath0(new CheckClassPath(jcl), anyClass);
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			dontActuallyDefine.set(before);
			setContextClassLoader(tcl);
		}
	}

	public static void setContextClassLoader(ClassLoader cl) {
		Thread.currentThread().setContextClassLoader(cl);
	}

	public static void preloadSystemClasspath0(LoadableScanner scanner, Class anyClass) {
		String M2_REPO = getMavenRepo();
		String cp = System.getProperty("java.class.path");

		//PromiscuousClassUtils.scanLoadable("D:/MyEclipse2013/configuration/org.eclipse.osgi/bundles/1277/1/.cp/lib/scala-library.jar", true, false, true);
		//PromiscuousClassUtils.scanLoadable(M2_REPO + "/org/scala-lang/scala-library/2.8.1/scala-library-2.8.1.jar", true, false, true);
		scanLoadableJar(scanner, M2_REPO + "/org/scala-lang/scala-library/2.10.2/scala-library-2.10.2.jar");
		scanLoadableJar(scanner, M2_REPO + "/org/slf4j/slf4j-log4j12/1.7.5/slf4j-log4j12-1.7.5.jar");
		scanLoadableJar(scanner, M2_REPO + "/org/slf4j/slf4j-api/1.7.5/slf4j-api-1.7.5.jar");
		//PromiscuousClassUtils.scanLoadable(M2_REPO + "/org/slf4j/slf4j-log4j12/1.5.8/slf4j-log4j12-1.5.8.jar", true, false, true);
		scanLoadableJar(scanner, M2_REPO + "/org/apache/jena/jena-core/2.10.1/jena-core-2.10.1.jar");

		ensureLoadable("scala.ScalaObject");
		if (false) {
			scanLoadable(scanner, cp, true, true, true);
		}
		//PromiscuousClassUtils.ensureLoadable("scala.Options");
		ensureLoadable("com.hp.hpl.jena.rdf.model.ModelFactory");
		//PromiscuousClassUtils.scanLoadable(M2_REPO + "/dmiles/resources/", true, false, true);
		ensureLoadable("org.slf4j.helpers.NOPLoggerFactory");
		Class c = findLoadedClassByName("org.slf4j.helpers.NOPLoggerFactory");
		ensureLoadable("org.slf4j.Logger");
		c = findLoadedClassByName("org.slf4j.spi.LocationAwareLogger");
		ensureLoadable("org.slf4j.spi.LocationAwareLogger");
		ensureLoadable("org.appdapter.osgi.core.BundleActivatorBase");
		ensureLoadable("org.slf4j.ILoggerFactory");
		ensureLoadable("org.slf4j.helpers.SubstituteLoggerFactory");
		//PromiscuousClassUtils.scanLoadable("D:/dev/hrk_eclipse_workspace/Robokind/target/eclipse-classes/", true, false, false);
	}

	public static <T> void push(String act, T impl) {
		List<T> currentModulePrev = getModuleStack(act);
		currentModulePrev.add(0, impl);
	}

	public static <T> Class<T> rememberClass(String name, Class<T> findClass) {
		if (findClass == null)
			return findClass;
		if (name == null) {
			name = findClass.getCanonicalName();
		}
		synchronized (classesSeen) {
			addIfNew(classesSeen, findClass);
		}
		if (classesSeen.size() % 1000 == 1) {

		}
		try {
			String cn = name;
			if (verifyClassNames) {
				try {
					String cn0 = findClass.getCanonicalName();
					if (cn0 != null && name.compareTo(cn0) != 0) {
						classnameToClass.put(cn0, findClass);
					}
				} catch (Throwable err) {
					debugLog("while trying to 'rememberClass' " + name + " " + " " + findClass + " had " + err);
				}
			}
			try {
				String cn1 = findClass.getName();
				if (cn1 != null && name.compareTo(cn1) != 0) {
					classnameToClass.put(cn1, findClass);
				}
			} catch (Throwable err) {
				debugLog("while trying to 'rememberClass' " + name + " " + " " + findClass + " had " + err);
			}
			if (cn != null) {
				classnameToClass.put(cn, findClass);
			}
		} catch (Exception e) {

		}
		return findClass;
	}

	private static Class scanClassFile(LoadableScanner scanner, String className, String path, InputStream fis, ClassLoader loader, boolean doWithBytes, ProtectionDomain pd) throws IOException {
		/*if (!FeClipse.mayLoadClassOutsideBundle(className)) {
			return null;
		}*/
		if (scanner != null) {
			if (scanner.isClassFileScanned(className, loader)) {
				return scanner.getClassFile();
			}
		}
		boolean isJustClassCheck = isJustClassCheck();
		if (isJustClassCheck) {
			try {
				if (className == null)
					return null;
				return forName(className, false, loader);
			} catch (Throwable e) {
				if (e instanceof LinkageError)
					throw (LinkageError) e;
				return null;
			}
		}
		if (!doWithBytes) {
			Class c;
			try {
				c = Class.forName(className, false, loader);
				rememberClass(className, c);
				return c;
			} catch (Throwable e) {
				printStackTrace(e);

			}
		}
		boolean closeStream = false;
		if (fis == null) {
			closeStream = true;
			fis = getInputStream(path);
		}
		byte[] bytes = getBytes(fis);
		if (closeStream)
			fis.close();
		try {
			return defineClass(scanner, loader, className, bytes, pd);
		} catch (Throwable t) {
			return null;
		}
	}

	public static int scanFile(LoadableScanner scanner, String packageOff, String path, InputStream openStream, ClassLoader loader0, boolean doWithBytes, ProtectionDomain pd) {
		final ClassLoader loader = getCorrectLoader(loader0);
		if (path.endsWith(".class")) {
			try {
				String className = getFClassName(packageOff, path);
				boolean useBytesHere = doWithBytes || className == null;
				Class scanned = scanClassFile(scanner, className, path, openStream, loader, useBytesHere, pd);
				return scanner.validClassFile(scanned) ? 1 : 0;
			} catch (IOException e) {
				printStackTrace(e);
			}
			return 0;
		}
		// otherwise its a zipish thing
		try {
			URL url = asURL(path);
			return scanJarFile(scanner, url, openStream, loader, "", doWithBytes, pd);
		} catch (IOException e) {
			printStackTrace(e);
			return 0;
		}
	}

	public static int scanJarFile(LoadableScanner scanner, URL jarName, InputStream jarIn, ClassLoader loader, String packageNameAndBelow, boolean doWithBytes, ProtectionDomain pd) throws IOException {
		int found = 0;
		int loadable = 0;
		if (scanner != null) {
			if (scanner.isJarFileScanned(jarName, loader))
				return 1;
		}
		loader = getCorrectLoader(loader);
		boolean isJustClassCheck = isJustClassCheck();

		if (isJustClassCheck)
			doWithBytes = false;

		if (jarIn == null) {
			jarIn = getInputStream(jarName);
		}

		if (loader != null && !isJustClassCheck) {
			addURLToClassloader(jarName, loader);
		}
		if (pd == null) {
			pd = getProtectionDomain(loader);
		}

		trace("Loading: " + jarName);

		ZipInputStream jarFile = new ZipInputStream(jarIn);
		try {
			ZipEntry jarEntry;
			while (true) {
				jarEntry = jarFile.getNextEntry();
				if (jarEntry == null) {
					break;
				}
				String entryName = jarEntry.getName();
				if (entryName.endsWith(".class")) {
					found++;
					Class c = null;
					String className = entryName.replaceAll("/", ".").substring(0, jarEntry.getName().length() - 6);
					if (!className.startsWith(packageNameAndBelow))
						continue;
					String path = "jar:" + jarName + "!" + entryName;

					if (!doWithBytes) {
						try {
							c = findLoadedClassByName(className, loader);
							if (c == null) {
								c = Class.forName(className, false, loader);
								c = rememberClass(className, c);
							}
							loadable++;
							continue;
						} catch (Throwable e) {
							if (isJustClassCheck) {
								continue;
							}
							newClassNotFound("Class.forName", className, e, true, true);
							// fall thru and define below
						}

					}
					byte[] buffer = getBytes(jarFile);
					InputStream bis = new ByteArrayInputStream(buffer);
					try {
						if (scanClassFile(scanner, className, path, bis, loader, doWithBytes, pd) != null) {
							loadable++;
						}
					} catch (Throwable r) {
						newClassNotFound("scanClassFile", className, r, true, true);
					} finally {
						bis.close();
					}
					//c = defineClass(loader, className, buffer);

					//	InputStream clzins = new ByteArrayInputStream(buffer);
					//	scanClassFile(className, "jar:" + jarName + "!" + entryName, clzins, loader, doWithBytes);

				}

			}
		} catch (Throwable ee) {
			printStackTrace(ee);
		} finally {
			try {
				if (jarFile != null)
					jarFile.close();
			} catch (IOException e) {
			}
		}
		if (found == 0)
			return loadable;
		return loadable;
	}

	public static boolean addURLToClassloader(URL jarName, ClassLoader loader0) {
		URLClassLoader ucl = getURLCLassLoader(loader0);
		try {
			callProtectedMethod(false, ucl, "addURL", jarName);
			return true;
		} catch (InvocationTargetException e) {
			printStackTrace(e);
			return false;
		} catch (NoSuchMethodException e) {
			printStackTrace(e);
			return false;
		}
	}

	public static URLClassLoader getURLCLassLoader(ClassLoader loader0) {
		if (!(loader0 instanceof URLClassLoader)) {
			ClassLoader loaderParent = loader0.getParent();
			if (loaderParent instanceof URLClassLoader)
				return (URLClassLoader) loaderParent;
			URLClassLoader newParent = null;
			try {
				newParent = new URLClassLoader(new URL[] {}, loaderParent);
			} catch (Throwable t) {
			}
			if (newParent == null) {
				newParent = URLClassLoader.newInstance(new URL[] {}, loaderParent);
				addClassloader(newParent);
				return newParent;
			}
			try {
				setField(loader0, loader0.getClass(), ClassLoader.class, "parent", newParent);
			} catch (Throwable e) {
				e.printStackTrace();
				throw new UnsupportedClassVersionError("cant find URL Parant");
			}
			return newParent;
		} else {
			return (URLClassLoader) loader0;
		}
	}

	private static ClassLoader getJustCheckingLoader() {
		ClassLoader ccl = getThreadClassLoader();
		if (ccl instanceof FeClipseAppClassLoader) {
			return ccl.getParent();
		}
		return getSystemClassLoader();
	}

	public static int scanLoadable(LoadableScanner scanner, String path, final boolean recurse, boolean canSplit, final boolean doWithBytez) {
		final boolean doWithBytes;
		if (isJustClassCheck()) {
			doWithBytes = false;
		} else {
			doWithBytes = doWithBytez;
		}
		ClassLoader loader = getCurrentClassLoader();
		try {
			return scanLoadable(scanner, path, recurse, canSplit, loader, doWithBytes, getProtectionDomain(loader));
		} catch (Throwable r) {
			throw reThrowable(r);
		}
	}

	public static int scanLoadable(final LoadableScanner scanner, final String pathIn, final boolean recurse, final boolean canSplit, final ClassLoader loader0, final boolean doWithBytes,
			final ProtectionDomain pd) {
		final ClassLoader loader = getCorrectLoader(loader0);
		String path = pathIn;
		File file = new File(path);
		if (file.exists()) {
			String np = file.getAbsolutePath();
			if (!np.equals(path)) {
				return scanLoadable(scanner, np, recurse, false, loader, doWithBytes, pd);
			}
			return scanLoadablePathRoot(scanner, path, path, loader, recurse, doWithBytes, pd);
		}
		try {
			URL url = new URL(path);
			file = new File(url.getFile());
			if (file.exists()) {
				path = file.getAbsolutePath();
			}
			if (url != null) {
				return scanFile(scanner, path, path, url.openStream(), loader, doWithBytes, pd);
			}
		} catch (MalformedURLException e) {
		} catch (IOException e) {
			printStackTrace(e);
		}
		if (!canSplit) {
			warn("Invalid path: " + pathIn);
			return 0;
		}
		final int[] collect = new int[1];
		final int[] found = new int[1];

		substAll(path, true, -1, new ArchiveSearcher() {
			@Override public String replace(String target, boolean maySplit, int depth) {
				found[0]++;
				int fnd = scanLoadable(scanner, target, recurse, maySplit, loader, doWithBytes, pd);
				collect[0] += fnd;
				return target;
			}
		});
		if (found[0] == 0) {
			warn("Invalid path: " + pathIn);
		}
		return collect[0];
	}

	public static int scanLoadableJar(LoadableScanner scanner, String path) {
		if (!new File(path).exists()) {
			warn("not exists " + path);
		}
		return scanLoadable(scanner, path, true, false, true);
	}

	private static int scanLoadablePath(LoadableScanner scanner, String opak, String packageOff, String path, ClassLoader loader0, final boolean recurse, final boolean doWithBytes, ProtectionDomain pd) {
		final ClassLoader loader = getCorrectLoader(loader0);
		try {

			File f = new File(path);
			if (f.isDirectory()) {
				boolean isTopDir = opak.equals(path);
				int fnd = 0;
				int count = 0;
				for (File o : f.listFiles()) {
					String of = o.getAbsolutePath();
					if (of.endsWith(".svn"))
						continue;
					count++;
					int cc = scanLoadablePath(scanner, opak, packageOff, of, loader, recurse, doWithBytes, pd);
					fnd += cc;
				}
				if (count == 0) {
					return fnd;
				}
				if (fnd == 0 && isTopDir) {
					warn("Dispite: " + count + " files no classes are defined in " + f);
					return 0;
				}
				return fnd;
			}
			if (f.exists()) {
				if (path.endsWith(".jar") || path.endsWith(".zip") || path.endsWith(".war") || path.endsWith(".class")) {
					try {
						return scanFile(scanner, packageOff, path, null, loader, doWithBytes, pd);
					} catch (Throwable e) {
						printStackTrace(e);
					}
				}
				return 0;
			}
			return 0;

		} catch (Throwable r) {
			throw reThrowable(r);
		}

	}

	private static int scanLoadablePathRoot(LoadableScanner scanner, String packageOff, String path, ClassLoader loader0, final boolean recurse, final boolean doWithBytes, ProtectionDomain pd) {
		final ClassLoader loader = getCorrectLoader(loader0);
		try {
			File f = new File(packageOff);
			if (f.isDirectory()) {
				URL scan = asURL(path);
				if (scanner.isDirScanned(scan)) {
					trace("isScannedDirectory: " + scan);
					return 0;
				}
				trace("Loading Dir: " + scan);
				int siz0 = scanLoadablePath(scanner, packageOff, packageOff, path, loader, recurse, doWithBytes, pd);
				return siz0;
			}
			int size = scanLoadablePath(scanner, packageOff, packageOff, path, loader, recurse, doWithBytes, pd);
			trace("Loaded NonDir: " + path + " size=" + size);
			return size;
		} catch (Throwable r) {
			throw reThrowable(r);
		}
	}

	public static <T> int size(String act) {
		List<T> currentModulePrev = getModuleStack(act);
		return currentModulePrev.size();
	}

	private static String subst(String property, String b, String a) {
		if (property == null || property.length() < 1)
			return property;
		return property.replace(b, a);
	}

	public static String substAll(String str) {
		return substAll(str, true, true);
	}

	public static String substAll(String str, boolean keepJar, boolean maySplit) {
		if (str == null || str.length() < 3)
			return str;
		String oldold = str;
		if (maySplit) {
			for (String splitter : new String[] { "\n", ",", "\r", File.pathSeparator, " " }) {

				if (str.contains(splitter)) {
					String[] properties = str.split("(?<!//)" + splitter);
					if (properties.length > 1) {
						int i = 0;
						for (String prop : properties) {
							properties[i] = substAll(prop, keepJar, false);
							i++;
						}
						str = join(properties, splitter);
						return str;
					}
				}
			}
		}

		//str = subst(str, "/:", ":");
		str = subst(str, "/", "/");
		str = subst(str, "0.9.0.jar", "0.9.1-SNAPSHOT.jar");
		str = subst(str, "0.9.0/", "0.9.1-SNAPSHOT/");
		str = subst(str, "D:", "d:");
		str = subst(str, "C:", "c:");
		if (str.contains("bundle") && keepJar)
			return str;
		String old = str;
		str = subst(str, "c.*/repository/org/robokind/", "d:/dev/hrk/org.robokind/maven/projects/SPLIT");
		str = subst(str, "c.*/repository/org/appdapter/", "d:/dev/hrk/org.appdapter/maven/SPLIT");
		str = subst(str, "c.*/repository/org/cogchar/", "d:/dev/hrk/org.cogchar/maven/SPLIT");
		str = subst(str, M2_REPO + "/org/robokind/", "d:/dev/hrk/org.robokind/maven/projects/SPLIT");
		str = subst(str, M2_REPO + "/org/appdapter/", "d:/dev/hrk/org.appdapter/maven/SPLIT");
		str = subst(str, M2_REPO + "/org/cogchar/", "d:/dev/hrk/org.cogchar/maven/SPLIT");
		if (!str.equals(old)) {
			if (keepJar) {
				return old;
			}
			String str2[] = str.split("SPLIT");
			String rest = str2[1];
			rest = rest.split("/")[0];
			str = str2[0] + "" + rest + "/target/classes/";
			str.toString();
		}
		if (str.startsWith("d:/dev/hrk/org.robokind/maven/projects/")) {
			if (!keepJar) {
				return "d:/dev/hrk_eclipse_workspace/Robokind/target/eclipse-classes";
			}
		}
		//org.robokind.headless.messaging/0.9.1/org.robokind.headless.messaging-0.9.1-SNAPSHOT.jar;

		return str;
	}

	public static String substAll(String str, boolean maySplit, int depth, ArchiveSearcher searcher) {
		if (depth == 0)
			return str;
		if (str == null || str.length() < 3)
			return str;
		String oldold = str;
		if (maySplit) {
			for (String splitter : new String[] { "\n", ",", "\r", File.pathSeparator, " " }) {

				if (str.contains(splitter)) {
					String[] properties = str.split("(?<!//)" + splitter);
					int pl = properties.length;
					if (pl > 1) {
						/*for (int i = pl - 1; i >= 0; i--)*/
						for (int i = 0; i < pl; i++) {
							String prop = properties[i];
							properties[i] = searcher.replace(prop, false, depth - 1);
						}
						str = join(properties, splitter);
						return str;
					}
				}
			}
		}
		return searcher.replace(str, maySplit, depth);
	}

	public static void trace(String msg) {
		System.out.println(msg);
	}

	public static void warn(String msg) {
		System.err.println(msg);
	}

	private static void debugLog(String msg) {
		System.err.println(msg);
		//LoggerFactory.getLogger(PromiscuousClassUtils.class).debug(msg);
	}

	private static void printStackTrace(Throwable e) {
		Debuggable.printStackTrace(e);
	}

}
