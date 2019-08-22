/*
   This file is part of the LarKC platform 
   http://www.larkc.eu/

   Copyright 2010 LarKC project consortium

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package org.logicmoo.translate;

import static java.nio.file.FileVisitResult.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.Predicate;

/**
 * A {@code FileVisitor} that finds all files that match the specified
 * filePattern.
 */
public class FileRecurseVisitor extends SimpleFileVisitor<Path> {

	/**
	 * TODO Describe the purpose of this method.
	 * 
	 * @param relativePath
	 * @throws IOException
	 */

	public static int addInputResourceMask(String startFromDir, String relativePath, Predicate<File> offer, int max,
			boolean recurse) throws IOException {
		final int indexOf = relativePath.indexOf("*");
		String startingDirStr = relativePath.substring(0, indexOf + 1);
		final int endIndex = startingDirStr.lastIndexOf('/') + 1;
		startingDirStr = startingDirStr.substring(0, endIndex);
		final String filePattern = relativePath.substring(endIndex);
		final Path dirPart = Paths.get(startingDirStr);
		final FileRecurseVisitor finder = new FileRecurseVisitor(startFromDir, startingDirStr, filePattern, offer, max,
				recurse);
		return finder.doSome();
	}

	/**
	 * TODO Describe the purpose of this method.
	 * 
	 * @return
	 * @throws IOException
	 */
	private int doSome() throws IOException {
		final Path start = Paths.get(startFromDir + dirPart);
		Files.walkFileTree(start, this);
		return done();
	}

	public FileRecurseVisitor(String startFromDir, String startingDirStr, String filePattern, Predicate offer2, int max,
			boolean recurse) {
		this.max = max;
		this.startFromDir = startFromDir;
		this.dirPart = startingDirStr;
		this.offer = offer2;
		doRecurse = recurse;
		matcher = FileSystems.getDefault().getPathMatcher("glob:" + filePattern);

	}

	final PathMatcher matcher;
	final int max;
	int numMatches = 0;
	final String startFromDir;
	final String dirPart;

	final boolean doRecurse;
	private java.util.function.Predicate<File> offer;

	// Invoke the filePattern matching
	// method on each directory.
	@Override
	public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
		find(dir);
		if (noMore())
			return TERMINATE;
		return CONTINUE;
	}

	// Invoke the filePattern matching
	// method on each file.
	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
		find(file);
		if (noMore())
			return TERMINATE;
		return CONTINUE;
	}

	@Override
	public FileVisitResult visitFileFailed(Path file, IOException exc) {
		System.err.println(exc);
		return CONTINUE;
	}

	/**
	 * TODO Describe the purpose of this method.
	 * 
	 * @return
	 */
	boolean noMore() {
		return numMatches >= max;
	}

	// Prints the total number of
	// matches to standard out.
	int done() {
		System.out.println("Matched: " + numMatches);
		return numMatches;
	}

	// Compares the glob filePattern against
	// the file or directory name.
	void find(final Path file) {
		if (noMore())
			return;
		String relativePath = file.toString().replace("\\", "/");

		if (relativePath.startsWith(startFromDir)) {
			relativePath = relativePath.substring(startFromDir.length());
		}

		String filePart = relativePath;
		if (filePart.startsWith(this.dirPart)) {
			filePart = filePart.substring(dirPart.length());
		}
		// System.out.println("checking: " + relativePath);
		if (filePart.endsWith(".java")) {
			// System.out.println("checking: " + filePart);
		}

		// String classStem = relativePath.substring(dirPart.indexOf("com") + 1);
		final Path path = Paths.get(filePart);
		if (matcher.matches(path)) {
			if (!doRecurse) {
				if (filePart.contains("/") || filePart.contains("\\")) {
					// return;
				}
			}

			// final File target = new File(startFromDir, stem);
			if (!(offer.test(new File(startFromDir, relativePath)))) {
//				System.out.println("skipping: " + target.getCanonicalPath());
				return;
			}
			numMatches++;
		}
	}
}