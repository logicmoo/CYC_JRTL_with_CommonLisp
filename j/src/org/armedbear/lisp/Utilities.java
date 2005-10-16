/*
 * Utilities.java
 *
 * Copyright (C) 2003-2005 Peter Graves
 * $Id: Utilities.java,v 1.12 2005-10-16 02:03:28 piso Exp $
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

package org.armedbear.lisp;

import java.io.File;
import java.io.IOException;

public final class Utilities extends Lisp
{
    public static final boolean isPlatformUnix;
    public static final boolean isPlatformWindows;

    static {
        String osName = System.getProperty("os.name");
        isPlatformUnix = osName.startsWith("Linux") ||
            osName.startsWith("Mac OS X") || osName.startsWith("Solaris") ||
            osName.startsWith("SunOS") || osName.startsWith("AIX");
        isPlatformWindows = osName.startsWith("Windows");
    }

    public static boolean isPlatformUnix()
    {
        return isPlatformUnix;
    }

    public static boolean isPlatformWindows()
    {
        return isPlatformWindows;
    }

    public static boolean isFilenameAbsolute(String filename)
    {
        final int length = filename.length();
        if (length > 0) {
            char c0 = filename.charAt(0);
            if (c0 == '\\' || c0 == '/')
                return true;
            if (length > 2) {
                if (isPlatformWindows()) {
                    // Check for drive letter.
                    char c1 = filename.charAt(1);
                    if (c1 == ':') {
                        if (c0 >= 'a' && c0 <= 'z')
                            return true;
                        if (c0 >= 'A' && c0 <= 'Z')
                            return true;
                    }
                } else {
                    // Unix.
                    if (filename.equals("~") || filename.startsWith("~/"))
                        return true;
                }
            }
        }
        return false;
    }

    public static File getFile(Pathname pathname) throws ConditionThrowable
    {
        return getFile(pathname,
                       Pathname.coerceToPathname(_DEFAULT_PATHNAME_DEFAULTS_.symbolValue()));
    }

    public static File getFile(Pathname pathname, Pathname defaultPathname)
        throws ConditionThrowable
    {
        Pathname merged =
            Pathname.mergePathnames(pathname, defaultPathname, NIL);
        String namestring = merged.getNamestring();
        if (namestring != null)
            return new File(namestring);
        signal(new FileError("Pathname has no namestring: " + merged.writeToString(),
                             merged));
        // Not reached.
        return null;
    }

    public static Pathname getDirectoryPathname(File file)
        throws ConditionThrowable
    {
        try {
            String namestring = file.getCanonicalPath();
            if (namestring != null && namestring.length() > 0) {
                if (namestring.charAt(namestring.length() - 1) != File.separatorChar)
                    namestring = namestring.concat(File.separator);
            }
            return new Pathname(namestring);
        }
        catch (IOException e) {
            signal(new LispError(e.getMessage()));
            // Not reached.
            return null;
        }
    }
}
