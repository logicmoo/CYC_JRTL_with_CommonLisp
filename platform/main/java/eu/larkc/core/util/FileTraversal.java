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
package eu.larkc.core.util;

import java.io.File;
import java.io.IOException;

/**
 * Utility class to recursively traverse all files in a given directory. A
 * user-supplied method is called when each file and subdirectory is visited.
 * 
 */
public abstract class FileTraversal {
	/**
	 * Traverse all files (recursively) in the given directory
	 * 
	 * @param directory
	 *            directory or file to visit (recursively)
	 * @throws IOException
	 */
	public final void traverse(final File directory) throws IOException {
		if (directory.isDirectory()) {
			onDirectory(directory);
			final File[] childs = directory.listFiles();
			for (File child : childs) {
				traverse(child);
			}
			return;
		}
		onFile(directory);
	}

	/**
	 * This method is called during file traversal when a directory is
	 * encountered.
	 */
	public void onDirectory(final File directory) {}

	/**
	 * This method is called during file traversal when a file is encountered.
	 * Should be overridden by user, doesn't do anything by default.
	 */
	public void onFile(final File file) {}
}
