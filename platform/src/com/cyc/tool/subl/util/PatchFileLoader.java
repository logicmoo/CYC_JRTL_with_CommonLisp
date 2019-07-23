/* For LarKC */
package com.cyc.tool.subl.util;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;

public class PatchFileLoader extends ClassLoader {
	public PatchFileLoader(List<JarFile> files) {
		classNameToClassMap = new HashMap<String, Class>(1024);
		this.files = files;
		SubLThread.currentThread().setContextClassLoader(this);
	}

	private static void addPossibleCycLJarFilesToPatches(List<JarFile> jarFiles) {
		String classpath = System.getProperty("java.class.path");
		StringTokenizer st = new StringTokenizer(classpath, System.getProperty("path.separator"));
		while (st.hasMoreElements()) {
			String tok = st.nextToken();
			Label_0172: {
				if (!tok.endsWith("lib" + System.getProperty("file.separator") + "cyc-very-dead.jar")
						&& !tok.endsWith("dist" + System.getProperty("file.separator") + "SubL-very-dead.jar"))
					if (!tok.endsWith("lib" + System.getProperty("file.separator") + "cycSparqlEndpoint.jar"))
						break Label_0172;
				try {
					jarFiles.add(new JarFile(new File(tok).getCanonicalPath()));
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if (tok.endsWith("subl/build/classes")) {
			}
		}
	}

	private static List<JarFile> getSortedPatchJars() {
		List<JarFile> jarFilesResult = new ArrayList<JarFile>();
		File patchDir = new File("patches");
		if (!patchDir.exists()) {
			addPossibleCycLJarFilesToPatches(jarFilesResult);
			return jarFilesResult;
		}
		if (!patchDir.isDirectory() || !patchDir.canRead())
			throw new RuntimeException("Can't read from the patches directory.");
		File[] jarFiles = patchDir.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				return name.endsWith(".jar");
			}
		});
		Arrays.sort(jarFiles, new Comparator<File>() {
			@Override
			public int compare(File o1, File o2) {
				return o2.getName().compareTo(o1.getName());
			}

			@Override
			public boolean equals(Object obj) {
				return obj == this;
			}
		});
		int i = 0;
		for (File file : jarFiles)
			try {
				jarFilesResult.add(new JarFile(file.getCanonicalPath()));
			} catch (Exception e) {
				e.printStackTrace();
			}
		addPossibleCycLJarFilesToPatches(jarFilesResult);
		return jarFilesResult;
	}

	private List<JarFile> files;
	private Map<String, Class> classNameToClassMap;
	public static ClassLoader PATCH_FILE_LOADER;
	static {
		PATCH_FILE_LOADER = PatchFileLoader.class.getClassLoader();
	}

	@Override
	public synchronized Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
		Class c = findLoadedClass(name);
		if (c == null)
			try {
				if (isExternalClass( name ))
					throw new ClassNotFoundException(name);
				c = classNameToClassMap.get(name);
				if (c != null) {
					if (resolve)
						resolveClass(c);
					return c;
				}
				c = findClass(name);
			} catch (ClassNotFoundException e) {
				c = super.loadClass(name, false);
			}
		if (c == null)
			throw new ClassNotFoundException(name);
		if (resolve)
			resolveClass(c);
		return c;
	}

	@Override
	protected Class<?> findClass(String name) throws ClassNotFoundException {
		if (isExternalClass( name ))
			return super.findClass(name);
		String path = name.replace('.', '/').concat(".class");
		for (JarFile jarFile : files) {
			if (jarFile == null)
				continue;
			synchronized (jarFile) {
				try {
					ZipEntry entry = jarFile.getEntry(path);
					if (entry == null)
						continue;
					int fileSize = (int) entry.getSize();
					if (fileSize < 0)
						throw new RuntimeException("Unexpected class file size: " + fileSize);
					byte[] classDef = new byte[fileSize];
					InputStream input = jarFile.getInputStream(entry);
					BufferedInputStream bis = new BufferedInputStream(input);
					int curByte = 0;
					int curLoc = 0;
					while ((curByte = bis.read()) >= 0)
						classDef[curLoc++] = (byte) curByte;
					if (curLoc < fileSize)
						throw new RuntimeException(
								"Did not read enough class bytes got: " + curLoc + " but expected: " + fileSize + ".");
					Class<?> theClass = this.defineClass(name, classDef, 0, fileSize);
					classNameToClassMap.put(name, theClass);
					return theClass;
				} catch (FileNotFoundException fnfe) {
				} catch (Exception e) {
					throw new RuntimeException(e);
				}
			}
		}
		throw new ClassNotFoundException(name);
	}

  /**
   * @param name
   * @return
   */
  private boolean isExternalClass(String name)
  {
    return !name.startsWith("com.cyc.cycjava.cycl") && !name.startsWith("eu.cyc");
  }
}
