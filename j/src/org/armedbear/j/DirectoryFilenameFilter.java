/*
 * DirectoryFilenameFilter.java
 *
 * Copyright (C) 1998-2002 Peter Graves
 * $Id: DirectoryFilenameFilter.java,v 1.2 2003-03-20 15:07:23 piso Exp $
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

public final class DirectoryFilenameFilter
{
    private String prefix;
    private String suffix;
    private String substring;
    private boolean ignoreCaseOfFiles;

    public DirectoryFilenameFilter(String filter)
    {
        // BUG! Error handling!
        processFilter(filter);
        if (Platform.isPlatformWindows()) {
            ignoreCaseOfFiles = true;
            if (prefix != null)
                prefix = prefix.toLowerCase();
            if (suffix != null)
                suffix = suffix.toLowerCase();
            if (substring != null)
                substring = substring.toLowerCase();
        }
    }

    private boolean processFilter(String filter)
    {
        if (filter.indexOf("*") < 0)
            return false;

        if (filter.startsWith("*")){
            suffix = filter.substring(1);
            if (suffix.endsWith("*")) {
                substring = suffix.substring(0, suffix.length()-1);
                suffix = null;
                if (substring.indexOf("*") >= 0)
                    return false;
            }
            return true;
        }
        if (filter.endsWith("*")) {
            prefix = filter.substring(0, filter.length()-1);
            if (prefix.indexOf("*") >= 0)
                return false;
        }
        int index = filter.indexOf("*");
        prefix = filter.substring(0, index);
        suffix = filter.substring(index+1, filter.length());
        if (suffix.indexOf("*") >= 0)
            return false;
        return true;
    }

    // Returns true if name meets filter criteria (dir is ignored).
    public boolean accept(String name)
    {
        if (name == null)
            return false;
        if (ignoreCaseOfFiles)
            name = name.toLowerCase();
        if (prefix != null)
            if (!name.startsWith(prefix))
                return false;
        if (suffix != null)
            if (!name.endsWith(suffix))
                return false;
        if (substring != null)
            if (name.indexOf(substring) < 0)
                return false;
        return true;
    }
}
