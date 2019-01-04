package com.netbreeze.util;

import java.util.*;
import java.util.zip.*;
import java.io.*;
import java.lang.reflect.*;
import org.apache.log4j.*;

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
 * @author Henrik Kniberg
 */
public class ClassFinder {
  private static Category cat = Category.getInstance(ClassFinder.class);

  /**
   * Class with these modifiers are skipped while searching the JVM classes.
   */
  private static final int defaultUndesirableClassModifiers = Modifier.ABSTRACT | Modifier.INTERFACE | Modifier.PRIVATE | Modifier.PROTECTED;

  /**
   * Returns a set of all classes that implement or extend
   * the given class, directly or indirectly.
   */
  public static Set getClasses(Class ancestor) throws IOException {
    return getClasses("", ancestor);
  }

  /**
   * Returns a set of all classes within the given package (recursively)
   * that implement or extend the given class, directly or indirectly.
   */
  public static Set getClasses(String packageName, Class ancestor) throws IOException {
    return getClasses(packageName, ancestor, null, null, defaultUndesirableClassModifiers);
  }

  /**
   * Returns a set of all classes within the given package (recursively)
   * that implement or extend the given class, directly or indirectly.
   */
  public static Set getClasses(String packageName, Class ancestor, ClassLoader classLoader, String dirsString) throws IOException {
    return getClasses(packageName, ancestor, classLoader, dirsString, defaultUndesirableClassModifiers);
  }

  /**
   * Returns a set of all classes within the given package (recursively)
   * that implement or extend the given class, directly or indirectly.
   * All classes that have at least one modifier from <code>undesirableClassModifiers</code>
   * set are skipped.
   */
  public static Set getClasses(String packageName, Class ancestor, ClassLoader classLoader, String dirsString, int undesirableClassModifiers) throws IOException {
    Set classes = new HashSet();

    if (packageName == null) {
      packageName = "";
    }

    if (classLoader == null)
      //use the default class loader for this class
      classLoader = ClassFinder.class.getClassLoader();

    //Get all class names
    Set allClassNames = getAllClassNames(dirsString);

    //Loop through the class names
    Iterator it = allClassNames.iterator();
    while(it.hasNext()) {
      String className = (String) it.next();

      //Check if the class is in the right package
      if (className.startsWith(packageName)) {

        //check if it should be included
        try {
          Class cls = null;
          try {
            cls = Class.forName(className, false, classLoader);
          } catch (NoClassDefFoundError ncdfe) {
            //ignore the exception because nothing can be do in this case
            continue;
          }
          if (ancestor.isAssignableFrom(cls) && (cls.getModifiers() & undesirableClassModifiers) == 0) {
            classes.add(cls);
          }
        } catch (Throwable err) {
          //Something went wrong. Skip it and move on.
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
  public static Set getClassNames(String packageName) throws IOException {
    Set classNames = new HashSet();

    Set allClassNames = getAllClassNames();
    Iterator it = allClassNames.iterator();
    while(it.hasNext()) {
      String className = (String) it.next();
      if (className.startsWith(packageName)) {
        classNames.add(className);
      }
    }
    return classNames;
  }

  /**
   * Returns a set of all class names currently available in this JVM
   */
  public static Set getAllClassNames() throws IOException {
    return getAllClassNames(null);
  }

  /**
   * Returns a set of all class names currently available in this JVM
   *
   * @param dirsString additional directiories to search, it can be <code>null</code>
   */
  public static Set getAllClassNames(String dirsString) throws IOException {
    Set classNames = new HashSet();
    Set classPathFiles = getClassPathFiles();
    if (dirsString != null)
      classPathFiles.addAll(getFilesFromExtDirs(dirsString));
    Iterator it = classPathFiles.iterator();
    while(it.hasNext()) {
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
  private static Set getClassPathFiles() {
    Set classPathFiles = new HashSet();

    //Get the global class path and ext dirs
    String classPathString = System.getProperty("java.class.path",".");
    String extDirsString = System.getProperty("java.ext.dirs","");

    //For classpath, each element is either a JAR/ZIP file or a class file root
    StringTokenizer st = new StringTokenizer(classPathString, ";");
    while(st.hasMoreTokens()) {
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
    while(st.hasMoreTokens()) {
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
  private static Set getClassNamesFromDirectory(String packageName, File rootDir) throws IOException {
    Set classNames = new HashSet();

    File[] files = rootDir.listFiles();

    for(int i = 0; i < files.length; i++) {
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

        classNames.addAll(getClassNamesFromDirectory(nextPackageName, file));

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
  private static Set getClassNamesFromJar(File jarFile) throws IOException {
    Set classNames = new HashSet();

    //Open the JAR file
    ZipFile file = new ZipFile(jarFile);

    //Loop through the contents of the JAR
    Enumeration enumr = file.entries();
    while(enumr.hasMoreElements()) {
      ZipEntry entry = (ZipEntry) enumr.nextElement();
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


  /**
   * Given a string of type "java/lang/String.class" it will return
   * the corresponding class name "java.lang.String"
   */
  private static String getClassNameFromFileName(String fileName) {
    String temp;

    //Get rid of .class at the end
    temp = Utility.replace(fileName, ".class", "");

    //Change slashes to dots
    temp = Utility.replace(temp, "\\", ".");
    temp = Utility.replace(temp, "/", ".");

    return temp;
  }

  private static void logError(String msg, Throwable err) {
    cat.error(msg, err);
  }


}