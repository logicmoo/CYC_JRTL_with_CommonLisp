/*
 * Completion.java
 *
 * Copyright (C) 1998-2002 Peter Graves
 * $Id: Completion.java,v 1.1.1.1 2002-09-24 16:07:58 piso Exp $
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

import java.util.List;
import java.util.Vector;

public final class Completion
{
    private String input;
    private String toBeCompleted;
    private boolean ignoreCase;

    private Vector v = new Vector();

    public Completion(File dir, String input)
    {
        this.input = input;
        toBeCompleted = input;
        if (Platform.isPlatformWindows()) {
            if (toBeCompleted.startsWith("~/")) {
                String home = Utilities.getUserHome();
                if (!home.startsWith("/"))
                    home = Utilities.cygnify(home);
                toBeCompleted = Utilities.uncygnify(home + toBeCompleted.substring(1));
            } else if (toBeCompleted.startsWith("../"))
                toBeCompleted = File.normalize(toBeCompleted);
            else
                toBeCompleted = Utilities.uncygnify(toBeCompleted);
            ignoreCase = true;
        }
        FilenameCompletion c = new FilenameCompletion(dir, toBeCompleted, null,
            ignoreCase);
        List files = c.listFiles();
        if (files != null) {
            String home = Utilities.getUserHome() + "/";
            String prefix = dir.canonicalPath() + LocalFile.getSeparator();
            int skip = prefix.length();
            String toBeAdded;
            int limit = files.size();
            for (int i = 0; i < limit; i++) {
                File file = (File) files.get(i);
                toBeAdded = file.getAbsolutePath();
                if (!Utilities.isFilenameAbsolute(toBeCompleted)) {
                    if (toBeAdded.startsWith(prefix)) {
                        toBeAdded = toBeAdded.substring(skip);
                        if (input.startsWith("./"))
                            toBeAdded = "./" + toBeAdded;
                    }
                }
                if (Platform.isPlatformWindows())
                    toBeAdded = Utilities.cygnify(toBeAdded);
                if (input.startsWith("~/")) {
                    if (toBeAdded.startsWith(home)) {
                        toBeAdded = "~/" + toBeAdded.substring(home.length());
                    }
                } else if (input.startsWith("..")) {
                    String  remaining    = input;
                    File parentDir    = dir;
                    String  parentPrefix = "";
                    while (remaining.startsWith("../")) {
                        parentDir = parentDir.getParentFile();
                        parentPrefix += "../";
                        remaining = remaining.substring(3);
                    }
                    String parentDirName = parentDir.canonicalPath();
                    if (Platform.isPlatformWindows())
                        parentDirName = Utilities.cygnify(parentDirName);
                    if (!parentDirName.endsWith("/"))
                        parentDirName += "/";
                    if (toBeAdded.startsWith(parentDirName))
                        toBeAdded = parentPrefix + toBeAdded.substring(parentDirName.length());
                }
                toBeAdded = Utilities.escapeSpaces(toBeAdded);
                if (file.isDirectory())
                    toBeAdded += "/";
                v.add(toBeAdded);
            }
        }
    }

    public final List getCompletions()
    {
        return v;
    }

    private boolean isUnique()
    {
        return v.size() == 1;
    }

    private String getLongestCommonPrefix()
    {
        String s = input;
        if (v.size() != 0) {
            if (v.size() == 1) {
                s = (String) v.get(0);
            } else {
                String first = (String) v.get(0);
                int length = toBeCompleted.length() + 1;
                while (true) {
                    if (length > first.length())
                        return s;
                    String maybe = first.substring(0, length);
                    for (int i = 1; i < v.size(); i++) {
                        String toBeChecked = (String) v.get(i);
                        if (!maybe.regionMatches(ignoreCase, 0, toBeChecked, 0, length)) {
                            if (Platform.isPlatformWindows())
                                s = Utilities.cygnify(s);
                            return s;
                        }
                    }
                    s = maybe;
                    ++length;
                }
            }
        }
        if (Platform.isPlatformWindows())
            s = Utilities.cygnify(s);
        return s;
    }

    public String toString()
    {
        if (isUnique()) {
            String s = (String) v.get(0);
            // Directories have file separator already appended.
            if (!s.endsWith("/"))
                s += ' ';
            return s;
        }
        return getLongestCommonPrefix();
    }
}
