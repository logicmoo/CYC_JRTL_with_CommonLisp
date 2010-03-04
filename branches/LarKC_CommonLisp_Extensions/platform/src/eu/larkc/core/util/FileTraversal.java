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
