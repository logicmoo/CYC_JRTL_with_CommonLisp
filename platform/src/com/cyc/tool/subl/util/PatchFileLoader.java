/***
 *   Copyright (c) 1995-2009 Cycorp Inc.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *  Substantial portions of this code were developed by the Cyc project
 *  and by Cycorp Inc, whose contribution is gratefully acknowledged.
*/

package com.cyc.tool.subl.util;

//// Internal Imports

//// External Imports
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
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;

public class PatchFileLoader extends ClassLoader {

	public static PatchFileLoader PATCH_FILE_LOADER = new PatchFileLoader(PatchFileLoader.getSortedPatchJars());

	private static void addPossibleCycLJarFilesToPatches(List<JarFile> jarFiles) {
		try { // @hack
			jarFiles.add(new JarFile(new File("lib/cyc.jar").getCanonicalPath()));
		} catch (Exception e) {
		} // do nothing
		try { // @hack this will do the wrong thing for subl-tester and
				// subl-builder projects
			String path = System.getProperty("user.home")
					+ "/src/head/cycorp/cyc/java/netbeans/project/SubL/dist/SubL.jar";
			jarFiles.add(new JarFile(path));
		} catch (Exception e) {
		} // do nothing
	}

	private static List<JarFile> getSortedPatchJars() {
		List<JarFile> jarFilesResult = new ArrayList<JarFile>();
		File patchDir = new File("patches");
		if (!patchDir.exists()) {
			PatchFileLoader.addPossibleCycLJarFilesToPatches(jarFilesResult);
			return jarFilesResult; // no patches to process
		}
		if (!patchDir.isDirectory() || !patchDir.canRead())
			throw new RuntimeException("Can't read from the patches directory.");
		File[] jarFiles = patchDir.listFiles(new FilenameFilter() {
			public boolean accept(File dir, String name) {
				return name.endsWith(".jar");
			}
		});
		Arrays.sort(jarFiles, new Comparator<File>() {
			public int compare(File o1, File o2) {
				return o2.getName().compareTo(o1.getName());
			}

			public boolean equals(Object obj) {
				return obj == this;
			}
		});
		int i = 0;
		for (File file : jarFiles)
			try {
				jarFilesResult.add(new JarFile(file.getCanonicalPath()));
			} catch (Exception e) {
				e.printStackTrace(); // @hack
			}
		PatchFileLoader.addPossibleCycLJarFilesToPatches(jarFilesResult);
		return jarFilesResult;
	}

	private List<JarFile> files;

	private Map<String, Class> classNameToClassMap = new HashMap<String, Class>(1024);

	// @todo consider makign this based on URLs instead
	public PatchFileLoader(List<JarFile> files) {
		this.files = files;
		Thread.currentThread().setContextClassLoader(this);
	}

	protected Class<?> findClass(String name) throws ClassNotFoundException {
		Class c = this.classNameToClassMap.get(name);
		if (c != null)
			return c;
		String path = name.replace('.', '/').concat(".class");
		for (JarFile jarFile : this.files) {
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
					// new Exception("Finding CLASS: " +
					// name).printStackTrace();
					Class<?> theClass = this.defineClass(name, classDef, 0, fileSize);
					this.classNameToClassMap.put(name, theClass);
					return theClass;
				} catch (FileNotFoundException fnfe) {
					// do nothing
				} catch (Exception e) {
					e.printStackTrace(); // @hack
					throw new RuntimeException(e);
				}
			}
		}
		throw new ClassNotFoundException(name);
	}

	public synchronized Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
		// First, check if the class has already been loaded
		Class c = this.findLoadedClass(name);
		if (c == null) {
			try {
				// Second, find my classes next
				if (name.startsWith("com.cyc.cycjava.cycl")) {
					c = this.classNameToClassMap.get(name);
					if (c != null) {
						if (resolve)
							this.resolveClass(c);
						return c;
					}
					c = this.findClass(name);
				} else {
					// throw new ClassNotFoundException(name);
				}
			} catch (ClassNotFoundException e) {
				// Finaly, only if not already loaded and not my class then load
				// from default
			}
			if (c == null)
				c = super.loadClass(name, false);
		}
		if (c == null)
			throw new ClassNotFoundException(name);
		if (resolve)
			this.resolveClass(c);
		return c;
	}
}
