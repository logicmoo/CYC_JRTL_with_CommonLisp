/*
 * Platform.java
 *
 * Copyright (C) 1998-2004 Peter Graves
 * $Id: Platform.java,v 1.5 2004-06-09 23:44:24 piso Exp $
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

public final class Platform
{
    private static final String osName = System.getProperty("os.name");
    private static final boolean isPlatformLinux = osName.startsWith("Linux");
    private static final boolean isPlatformUnix =
        isPlatformLinux || osName.startsWith("Mac OS X") ||
        osName.startsWith("Solaris") || osName.startsWith("SunOS") ||
        osName.startsWith("AIX");
    private static final boolean isPlatformWindows =
        osName.startsWith("Windows");
    private static final boolean isJava13 =
        System.getProperty("java.version").startsWith("1.3");
    private static final boolean isJava14 =
        System.getProperty("java.version").startsWith("1.4");
    private static final boolean isJava140 =
        System.getProperty("java.version").startsWith("1.4.0");

    public static final boolean isPlatformLinux()
    {
        return isPlatformLinux;
    }

    public static final boolean isPlatformUnix()
    {
        return isPlatformUnix;
    }

    public static final boolean isPlatformWindows()
    {
        return isPlatformWindows;
    }

    public static final boolean isPlatformMacOSX()
    {
        return osName.startsWith("Mac OS X");
    }

    public static final boolean isPlatformWindows5()
    {
        if (!isPlatformWindows)
            return false;
        final String version = System.getProperty("os.version");
        int index = version.indexOf('.');
        final String s = index >= 0 ? version.substring(0, index) : version;
        try {
            final int major = Integer.parseInt(s);
            return major >= 5;
        }
        catch (NumberFormatException e) {
            Log.error(e);
            return false;
        }
    }

    public static final boolean isPlatformWindowsNT4()
    {
        if (!isPlatformWindows)
            return false;
        if (osName.indexOf("Windows NT") < 0)
            return false;
        final String version = System.getProperty("os.version");
        int index = version.indexOf('.');
        final String s = index >= 0 ? version.substring(0, index) : version;
        try {
            final int major = Integer.parseInt(s);
            return major >= 4;
        }
        catch (NumberFormatException e) {
            Log.error(e);
            return false;
        }
    }

    public static final boolean isJava13()
    {
        return isJava13;
    }

    public static final boolean isJava14()
    {
        return isJava14;
    }

    public static final boolean isJava140()
    {
        return isJava140;
    }
}
