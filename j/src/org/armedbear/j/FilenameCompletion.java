/*
 * FilenameCompletion.java
 *
 * Copyright (C) 2000-2002 Peter Graves
 * $Id: FilenameCompletion.java,v 1.4 2002-12-06 00:02:10 piso Exp $
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */

package org.armedbear.j;

import java.util.ArrayList;
import java.util.List;

public final class FilenameCompletion
{
    private final File currentDirectory;
    private final String sourcePath;
    private final boolean ignoreCase;

    private String prefix;
    private ArrayList list;

    public FilenameCompletion(File directory, String prefix,
        String sourcePath, boolean ignoreCase)
    {
        currentDirectory = directory;
        this.prefix = prefix;
        this.sourcePath = sourcePath;
        this.ignoreCase = ignoreCase;
        initialize();
    }

    // Returns list of File objects.
    public List listFiles()
    {
        return list;
    }

    private void initialize()
    {
        list = new ArrayList();
        if (Utilities.isFilenameAbsolute(prefix)) {
            File file = File.getInstance(currentDirectory, prefix);
            if (file.isDirectory()) {
                addCompletionsFromDirectory(list, file, null);
            } else {
                File directory = file.getParentFile();
                prefix = file.getName();
                addCompletionsFromDirectory(list, directory, prefix);
            }
        } else if (prefix.indexOf(LocalFile.getSeparatorChar()) >= 0) {
            // Prefix specifies a directory.
            String dirName;
            if (prefix.endsWith(LocalFile.getSeparator())) {
                dirName = prefix.substring(0, prefix.length() - 1);
                prefix = null;
            } else {
                int index = prefix.lastIndexOf(LocalFile.getSeparatorChar());
                dirName = prefix.substring(0, index);
                prefix = prefix.substring(index + 1);
            }
            // First try relative to current directory.
            File dir = File.getInstance(currentDirectory, dirName);
            if (dir.isDirectory()) {
                addCompletionsFromDirectory(list, dir, prefix);
            } else {
                // No such directory relative to current directory.
                // Look in source path.
                if (sourcePath != null) {
                    List sourcePathDirectories = Utilities.getDirectoriesInPath(sourcePath);
                    for (int i = 0; i < sourcePathDirectories.size(); i++) {
                        File sourcePathDirectory =
                            File.getInstance((String) sourcePathDirectories.get(i));
                        dir = File.getInstance(sourcePathDirectory, dirName);
                        if (dir.isDirectory())
                            addCompletionsFromDirectory(list, dir, prefix);
                    }
                }
            }
        } else {
            // Short name.
            // Current directory.
            addCompletionsFromDirectory(list, currentDirectory, prefix);
            // Source path.
            if (sourcePath != null) {
                List sourcePathDirectories = Utilities.getDirectoriesInPath(sourcePath);
                for (int i = 0; i < sourcePathDirectories.size(); i++) {
                    File sourcePathDirectory =
                        File.getInstance((String) sourcePathDirectories.get(i));
                    addCompletionsFromDirectory(list, sourcePathDirectory, prefix);
                }
            }
        }
    }

    private void addCompletionsFromDirectory(List list, File directory, String prefix)
    {
        String[] names = directory.list();
        if (names != null) {
            if (prefix != null && prefix.length() > 0) {
                for (int i = 0; i < names.length; i++) {
                    boolean isMatch = false;
                    if (ignoreCase)
                        isMatch = names[i].regionMatches(true, 0, prefix, 0, prefix.length());
                    else
                        isMatch = names[i].startsWith(prefix);
                    if (isMatch)
                        list.add(File.getInstance(directory, names[i]));
                }
            } else {
                for (int i = 0; i < names.length; i++)
                    list.add(File.getInstance(directory, names[i]));
            }
        }
    }
}
