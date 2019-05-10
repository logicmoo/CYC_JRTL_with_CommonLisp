package org.appdapter.gui.util;

import static org.appdapter.gui.util.PromiscuousClassUtilsA.classesSeen;
import static org.appdapter.gui.util.PromiscuousClassUtilsA.coerceClassloader;
import static org.appdapter.gui.util.PromiscuousClassUtilsA.forName;
import static org.appdapter.gui.util.PromiscuousClassUtilsA.getImplementingClasses;

import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import org.appdapter.core.convert.ReflectUtils;

/**
 * This is a stateless utility class that contains code for looking up
 * classes in the CLASSPATH and EXTDIRS in the current JVM. <br>
 *
 * @todo - replace Set with List and use forName(className, false, null) that doesn't
 * initialize the class
 *
 * Changes:
 *  <ul>
 *    <li> 15.01.2001/Bartlomiej Niechwiej - checking for existance of a file/directory being searched added, underisableClassModifiers added </li>
 *    <li> 08.02.2001/Marcin Slowik - replaced forName(classname) with forName(classname, false, loader)
 *    <li> 20.01.2001/Bartlomiej Niechwiej - a classLoader parameter added to getClasses methods, additional API provided </li>
 *  </ul>
 *
 *
 */
public class ClassFinder {

	public static boolean DISABLE_CLASS_FINDER = true;
	/**
	 * Class with these modifiers are skipped while searching the JVM classes.
	 */
	private static final int defaultUndesirableClassModifiers = 0;//Modifier.ABSTRACT | Modifier.INTERFACE | Modifier.PRIVATE | Modifier.PROTECTED;

	/**
	 * Returns a set of all classes that implement or extend
	 * the given class, directly or indirectly.
	 */
	public static <T> Set<Class<? extends T>> getClasses(Class<T> ancestor) throws IOException {
		if (DISABLE_CLASS_FINDER)
			return new HashSet();
		///.trace("Scaning for subclasses of " + ancestor);
		if (class_Cache != null && class_Cache.size() > 10) {
			return (Set<Class<? extends T>>) getImplementingClasses(ancestor);
		}
		Set<Class<? extends T>> set = getClasses("", ancestor);
		//theLogger.trace("returning " + set.size() + "  subclasses of " + ancestor);
		return set;
	}

	public static Set class_Cache = null;

	public static Set<Class> getAllClasses() throws IOException {
		if (class_Cache == null) {
			class_Cache = classesSeen;
			synchronized (class_Cache) {
				class_Cache.addAll(getClasses("", null));
			}
		}
		return class_Cache;
	}

	/**
	 * Returns a set of all classes within the given package (recursively)
	 * that implement or extend the given class, directly or indirectly.
	 */
	public static <T> Set<Class<? extends T>> getClasses(String packageName, Class<T> ancestor) throws IOException {
		return getClasses(packageName, ancestor, null, null, defaultUndesirableClassModifiers);
	}

	/**
	 * Returns a set of all classes within the given package (recursively)
	 * that implement or extend the given class, directly or indirectly.
	 */
	public static <T> Set<Class<? extends T>> getClasses(String packageName, Class<T> ancestor, ClassLoader classLoader, String dirsString) throws IOException {
		return getClasses(packageName, ancestor, classLoader, dirsString, defaultUndesirableClassModifiers);
	}

	/**
	 * Returns a set of all classes within the given package (recursively)
	 * that implement or extend the given class, directly or indirectly.
	 * All classes that have at least one modifier from <code>undesirableClassModifiers</code>
	 * set are skipped.
	 */
	public static <T> Set<Class<? extends T>> getClasses(final String packageName, final Class<T> ancestor, final ClassLoader classLoader, final String dirsString, final int undesirableClassModifiers)
			throws IOException {
		return ReflectUtils.cachedResult(new Callable() {
			@Override public Object call() throws Exception {
				return getClassesImpl(packageName, ancestor, classLoader, dirsString, undesirableClassModifiers);
			}
		}, packageName, ancestor, classLoader, dirsString, undesirableClassModifiers);
	}

	public static <T> Set<Class<? extends T>> getClassesImpl(String packageName, Class<T> ancestor, ClassLoader classLoader0, String dirsString, int undesirableClassModifiers) throws IOException {
		Set<Class<? extends T>> classes = new HashSet();
		if (DISABLE_CLASS_FINDER)
			return classes;

		if (packageName == null) {
			packageName = "";
		}

		ClassLoader classLoader;
		if (classLoader0 == null)
			//use the default class loader for this class
			classLoader = ClassFinder.class.getClassLoader();
		else
			classLoader = coerceClassloader(classLoader0, true, false, false);

		//Get all class names
		Set allClassNames = getAllClassNames(dirsString);

		//Loop through the class names
		Iterator it = allClassNames.iterator();
		while (it.hasNext()) {
			String className = (String) it.next();

			//Check if the class is in the right package
			if (className.startsWith(packageName)) {

				//check if it should be included
				try {
					Class cls = null;
					try {
						cls = forName(className, false, classLoader);
					} catch (NoClassDefFoundError ncdfe) {
						//ignore the exception because nothing can be do in this case
						continue;
					}
					if (cls == null) {
						logError("Cant find class called " + className, null);
						continue;
					}
					if ((ancestor == null || ancestor.isAssignableFrom(cls)) && (cls.getModifiers() & undesirableClassModifiers) == 0) {
						classes.add(cls);
					}
				} catch (Throwable err) {
					//Something went wrong. Skip it and move on.
					if (err.getCause() != null)
						err = err.getCause();
					if (err instanceof ClassNotFoundException) {
						continue;
					}
					if (err instanceof VirtualMachineError) {
						throw (VirtualMachineError) err;
					}
					logError("Class '" + className + "' could not be loaded - I will ignore it", err);
				}
			}
		}
		return classes;
	}

	/**
	 * Returns a set of all class names within the given package,
	 * recursively
	 */
	public static Set getClassNames(final String packageName) {
		return ReflectUtils.cachedResult(new Callable() {
			@Override public Object call() throws Exception {
				Set classNames = new HashSet();

				Set allClassNames = getAllClassNames();
				Iterator it = allClassNames.iterator();
				while (it.hasNext()) {
					String className = (String) it.next();
					if (className.startsWith(packageName)) {
						classNames.add(className);
					}
				}
				return classNames;
			}
		}, packageName);
	}

	/**
	 * Returns a set of all class names currently available in this JVM
	 */
	static Set classNames_Cache = new HashSet();

	private static Set getAllClassNames() throws IOException {
		if (classNames_Cache == null || classPathFiles_Cache.size() == 0) {
			classNames_Cache = getAllClassNames0();
		}
		return classNames_Cache;
	}

	public static Set getAllClassNames0() throws IOException {
		return getAllClassNames(null);
	}

	/**
	 * Returns a set of all class names currently available in this JVM
	 *
	 * @param dirsString additional directiories to search, it can be <code>null</code>
	 */
	static Map<String, Set> cachedClassNames = new HashMap<String, Set>();

	public synchronized static Set getAllClassNames(String dirsString) throws IOException {
		String key = dirsString;
		if (key == null || key.length() == 0 || key.equals("$CLASSPATH"))
			key = "";
		synchronized (cachedClassNames) {
			Set fnd = cachedClassNames.get(key);
			if (fnd != null)
				return fnd;
			if (cachedClassNames.containsKey(key)) {
				return null;
			}
			cachedClassNames.put(key, null);
			fnd = getAllClassNames0(dirsString);
			cachedClassNames.put(key, fnd);
			return fnd;
		}
	}

	public synchronized static Set getAllClassNames0(String dirsString) throws IOException {
		Set classNames = new HashSet();
		if (DISABLE_CLASS_FINDER)
			return classNames;
		Set classPathFiles = getClassPathFiles();
		if (dirsString != null)
			classPathFiles.addAll(getFilesFromExtDirs(dirsString));
		Iterator it = classPathFiles.iterator();
		while (it.hasNext()) {
			File classPathFile = (File) it.next();
			if (classPathFile.exists()) {
				if (classPathFile.isDirectory()) {
					classNames.addAll(getClassNamesFromDirectory(classPathFile));
				} else {
					classNames.addAll(getClassNamesFromJar(classPathFile));
				}
			}
		}
		return classNames;
	}

	//====== Private utility methods ============================

	/**
	 * Returns a set of files containing all the
	 * class path JARs, ZIPs, and directories
	 */
	static Set classPathFiles_Cache = new HashSet();

	private static Set getClassPathFiles() {
		if (classPathFiles_Cache == null || classPathFiles_Cache.size() == 0) {
			classPathFiles_Cache = getClassPathFiles0();
		}
		return classPathFiles_Cache;
	}

	private static Set getClassPathFiles0() {
		Set classPathFiles = new HashSet();

		//Get the global class path and ext dirs
		String classPathString = System.getProperty("java.class.path", ".");
		String extDirsString = System.getProperty("java.ext.dirs", "");

		//For classpath, each element is either a JAR/ZIP file or a class file root
		StringTokenizer st = new StringTokenizer(classPathString, ";");
		while (st.hasMoreTokens()) {
			classPathFiles.add(new File(st.nextToken()));
		}

		//For ext dirs, each element is a directory who's JAR/ZIP files and
		//subdirectories should be included in the classpath
		classPathFiles.addAll(getFilesFromExtDirs(extDirsString));

		return classPathFiles;
	}

	/**
	 * Returns a set of files in all directories in the given
	 * <code>extDirsString</code>.
	 *
	 * @param   extDirsString a string in the same format as <code>java.ext.dirs</code>
	 *          propertu
	 * @return  a set of files
	 */
	private static Set getFilesFromExtDirs(String extDirsString) {
		Set classPathFiles = new HashSet();
		StringTokenizer st = new StringTokenizer(extDirsString, ";");
		while (st.hasMoreTokens()) {
			File dir = new File(st.nextToken());
			if (dir.exists() && dir.isDirectory()) {
				File[] files = dir.listFiles();
				for (int i = 0; i < files.length; ++i) {
					File file = files[i];
					if (file.isDirectory()) {
						classPathFiles.add(file);
					} else {
						String name = file.getName().toLowerCase();
						if (name.endsWith(".jar") || name.endsWith(".zip")) {
							classPathFiles.add(file);
						}
					}
				}
			}
		}
		return classPathFiles;
	}

	/**
	 * Returns a set of the names of all classes under the given root directory.
	 *
	 * @param rootDir the directory under which the classes are stored
	 */
	private static Set getClassNamesFromDirectory(File rootDir) throws IOException {
		return getClassNamesFromDirectory(null, rootDir);
	}

	/**
	 * Returns a set of the names of all classes under the given root directory.
	 * The given package name will be put in front of the class name.
	 *
	 * @param packageName for example "com" or "java.lang"
	 * @param rootDir the directory under which the classes are stored
	 */
	private static Set getClassNamesFromDirectory(final String packageName, final File rootDir) throws IOException {
		return ReflectUtils.cachedResult(new Callable() {
			@Override public Object call() throws Exception {
				return getClassNamesFromDirectoryImpl(packageName, rootDir);
			}
		}, packageName, rootDir);
	}

	private static Set getClassNamesFromDirectoryImpl(String packageName, File rootDir) throws IOException {
		Set classNames = new HashSet();

		File[] files = rootDir.listFiles();

		for (int i = 0; i < files.length; i++) {
			File file = files[i];

			if (file.isDirectory()) {
				//for example "lang"
				String dirName = file.getName();

				//for example "java.lang" if the packageName was "java" was dirName was "lang"
				String nextPackageName;
				if (packageName == null || packageName.equals("")) {
					nextPackageName = dirName;
				} else {
					nextPackageName = packageName + "." + dirName;
				}

				classNames.addAll(getClassNamesFromDirectoryImpl(nextPackageName, file));

			} else {
				String fileName = file.getName();
				if (fileName.toLowerCase().endsWith(".class")) {
					//The short name is the class name without the package name prefix
					String shortClassName = fileName.substring(0, fileName.length() - 6);
					String fullClassName = packageName + "." + shortClassName;
					classNames.add(fullClassName);
				}
			}
		}
		return classNames;
	}

	/**
	 * Returns a set of the names of all classes stored
	 * in the given JAR or ZIP file
	 */
	private static Set getClassNamesFromJar(final File jarFile) throws IOException {
		return ReflectUtils.cachedResult(new Callable() {
			@Override public Object call() throws Exception {
				Set classNames = new HashSet();

				//Open the JAR file
				ZipFile file = new ZipFile(jarFile);

				//Loop through the contents of the JAR
				Enumeration enum0 = file.entries();
				while (enum0.hasMoreElements()) {
					ZipEntry entry = (ZipEntry) enum0.nextElement();
					if (!entry.isDirectory()) {
						String fileName = entry.getName();
						if (fileName.endsWith(".class")) {
							String className = getClassNameFromFileName(fileName);
							classNames.add(className);
						}
					}
				}
				return classNames;
			}
		}, jarFile);
	}

	/**
	 * Given a string of type "java/lang/String.class" it will return
	 * the corresponding class name "java.lang.String"
	 */
	private static String getClassNameFromFileName(String fileName) {
		String temp;

		//Get rid of .class at the end
		if (fileName.endsWith(".class")) {
			fileName = fileName.substring(0, fileName.length() - 6);
		}

		//Change slashes to dots
		temp = replace(fileName, "\\", ".");
		temp = replace(temp, "/", ".");
		//		temp = replace(temp, "$", ".");

		return temp;
	}

	public static String replace(String s, String b, String a) {
		return s.replace(b, a);
	}

	private static void logError(String msg, Throwable err) {
		//theLogger.error(msg, err);
	}

}