/*
 * Utilities.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: Utilities.java,v 1.2 2003-09-28 15:45:23 piso Exp $
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

public final class Utilities
{
    private static final boolean isPlatformWindows =
        System.getProperty("os.name").startsWith("Windows");

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
}
