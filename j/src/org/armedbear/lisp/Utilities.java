/*
 * Utilities.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: Utilities.java,v 1.5 2003-12-13 00:28:08 piso Exp $
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

public final class Utilities extends Lisp
{
    private static final boolean isPlatformUnix;
    private static final boolean isPlatformWindows;

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

    public static File getFile(LispObject pathspec) throws ConditionThrowable
    {
        String namestring;
        if (pathspec instanceof LispString)
            namestring = ((LispString)pathspec).getValue();
        else if (pathspec instanceof Pathname)
            namestring = ((Pathname)pathspec).getNamestring();
        else {
            signal(new TypeError(pathspec, "pathname designator"));
            // Not reached.
            return null;
        }
        if (isFilenameAbsolute(namestring)) {
            if (isPlatformUnix()) {
                if (namestring.length() > 0 && namestring.charAt(0) == '~') {
                    namestring =
                        System.getProperty("user.home").concat(namestring.substring(1));
                }
            }
            return new File(namestring);
        }
        return new File(
            LispString.getValue(_DEFAULT_PATHNAME_DEFAULTS_.symbolValue()),
            namestring);
    }

    public static final char toUpperCase(char c)
    {
        if (c < 128)
            return UPPER_CASE_CHARS[c];
        return Character.toUpperCase(c);
    }

    private static final char[] UPPER_CASE_CHARS = new char[128];

    static {
        for (int i = UPPER_CASE_CHARS.length; i-- > 0;)
            UPPER_CASE_CHARS[i] = Character.toUpperCase((char)i);
    }

    public static final char toLowerCase(char c)
    {
        if (c < 128)
            return LOWER_CASE_CHARS[c];
        return Character.toLowerCase(c);
    }

    private static final char[] LOWER_CASE_CHARS = new char[128];

    static {
        for (int i = LOWER_CASE_CHARS.length; i-- > 0;)
            LOWER_CASE_CHARS[i] = Character.toLowerCase((char)i);
    }
}
