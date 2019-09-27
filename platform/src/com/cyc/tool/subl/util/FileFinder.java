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
package com.cyc.tool.subl.util;

import static java.nio.file.FileVisitResult.CONTINUE;
import static java.nio.file.FileVisitResult.SKIP_SUBTREE;

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
import java.util.function.Consumer;

public class FileFinder extends SimpleFileVisitor<Path> {
	public Consumer<File> eachFile;
	private final PathMatcher matcher;
	private int numMatches = 0;
	Path startingDir;
	private boolean recurse;

	public FileFinder(String pattern, boolean recurse, Consumer<File> method) throws IOException {
		this.eachFile = method;
		this.recurse = recurse;
		String startingDirString = ".";
		int globcard = pattern.indexOf("**");
		if (globcard == -1) {
			int lastSlash = pattern.lastIndexOf("/");
			if (lastSlash > 0) {
				startingDirString = pattern.substring(0, lastSlash);
				pattern = pattern.substring(lastSlash + 1);
			}
		} else {
			this.recurse = true;
			int lastSlash = pattern.substring(0, globcard).lastIndexOf("/");
			if (lastSlash > 0) {
				startingDirString = pattern.substring(0, lastSlash);
				pattern = pattern.substring(lastSlash + 1);
			}
			int nextSlash = pattern.indexOf("/");
			if (nextSlash > 0) {
				pattern = pattern.substring(nextSlash + 1);
			}

			//System.err.println("startingDirString=" + startingDirString);
			//System.err.println("pattern=" + pattern);
		}

		startingDir = Paths.get(startingDirString);
		matcher = FileSystems.getDefault().getPathMatcher("glob:" + pattern);

	}

	public int doFiles() throws IOException {
		Files.walkFileTree(startingDir, this);
		return numMatches;
	}

	// Compares the glob pattern against
	// the file or directory name.
	void find(Path file) {
		Path name = file.getFileName();
		if (name != null && (matcher.matches(file) || matcher.matches(name))) {
			numMatches++;
			eachFile.accept(file.toFile());
		}
	}

	/**
	 * TODO Describe the purpose of this method.
	 * @param file
	 */
	private void println(Object file) {
		System.out.println(file);
	}

	// Invoke the pattern matching
	// method on each file.
	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
		find(file);
		return CONTINUE;
	}

	// Invoke the pattern matching
	// method on each directory.
	@Override
	public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
		if (dir.equals(startingDir))
			return CONTINUE;
		if (!recurse)
			return SKIP_SUBTREE;
		//find(dir);
		return CONTINUE;
	}

	@Override
	public FileVisitResult visitFileFailed(Path file, IOException exc) {
		System.err.println(exc);
		return CONTINUE;

	}

}