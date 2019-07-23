/* For LarKC */
package com.cyc.tool.subl.jrtl.nativeCode.type.stream;

import java.io.File;
import java.util.ArrayList;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Resourcer;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLListListIterator;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;

public class FileSystem {
	static public String constructFileName(SubLList directoryList, String pathname, String extension,
			boolean isRelative) {
		StringBuilder parentName = new StringBuilder();
		if (!isRelative)
			parentName.append(File.separator);
		Resourcer resourcer = Resourcer.getInstance();
		SubLListListIterator iter = null;
		try {
			iter = resourcer.acquireSubLListListIterator(directoryList);
			while (iter.hasNext()) {
				SubLString directoryName = iter.nextSubLObject().toStr();
				parentName.append(directoryName.getStringValue());
				parentName.append(File.separator);
			}
		} finally {
			resourcer.releaseSubLListListIterator(iter);
		}
		if (extension != null)
			pathname = pathname + "." + extension;
		String parentStr = parentName.toString();
		if (isRelative) {
			String result = parentStr + (pathname == null ? "" : pathname);
			return result;
		}
		return new File("".equals(parentStr) ? null : parentStr, pathname).getAbsolutePath();
	}

	static public boolean deleteDirectory(String directoryName, boolean deleteRecursively) {
		File directory = new File(directoryName);
		return directory.isDirectory() && directory.delete();
	}

	static public boolean deleteFile(String filename) {
		File file = new File(filename);
		return file.delete();
	}

	static public String fileExists(String filename) {
		File file = new File(filename);
		boolean accessible = file.exists();
		if (accessible)
			return file.getAbsolutePath();
		return null;
	}

	static public long fileModificationTime(String filename) {
		File file = new File(filename);
		return file.lastModified();
	}

	static public ArrayList<SubLString> getDirectoryContents(String directoryName, boolean includeDirectory) {
		File directory = new File(directoryName);
		ArrayList<SubLString> contents = new ArrayList<SubLString>();
		File[] directoryContents = directory.listFiles();
		if (directoryContents != null)
			for (int i = 0; i < directoryContents.length; ++i) {
				File current = directoryContents[i];
				String fileName = null;
				if (includeDirectory)
					fileName = current.getAbsolutePath();
				else
					fileName = current.getName();
				contents.add(SubLObjectFactory.makeString(fileName));
			}
		return contents;
	}

	static public boolean isDirectory(String directoryName) {
		File directory = new File(directoryName);
		return directory.isDirectory();
	}

	static public boolean makeDirectory(String parentName, String directoryName) {
		if (directoryName.endsWith(FileSystem.fileSeparator))
			directoryName = directoryName.substring(0, directoryName.length() - FileSystem.fileSeparator.length());
		File directory = new File(directoryName);
		if (!directory.getAbsolutePath().startsWith(directoryName) && parentName != null)
			directory = new File(parentName, directoryName);
		return directory.mkdir();
	}

	static public Object[] renameFile(String oldName, String newName) {
		File oldFile = new File(oldName);
		File newFile = new File(newName);
		boolean success = oldFile.renameTo(newFile);
		if (success)
			return new Object[] { Boolean.TRUE, oldFile.getAbsolutePath(), newFile.getAbsolutePath() };
		return new Object[] { Boolean.FALSE, oldFile.getAbsolutePath(), newFile.getAbsolutePath() };
	}

	static public String fileSeparator;
	static {
		fileSeparator = System.getProperty("file.separator");
	}
}
