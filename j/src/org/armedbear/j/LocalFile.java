/*
 * LocalFile.java
 *
 * Copyright (C) 2002 Peter Graves
 * $Id: LocalFile.java,v 1.1.1.1 2002-09-24 16:07:54 piso Exp $
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

/**
 * As it stands, LocalFile is a convenience class for accessing <code>
 * java.io.File</code>'s separator variables.
 *
 * @future LocalFile should extend File and implement all of the
 *         functionality specific to local files (as opposed to remote
 *         files).
 *
 * @see File
 * @see java.io.File
 */
public final class LocalFile
{
    /**
     * Returns the path separator character for the current platform (as a
     * String).
     *
     * @return The platform-specific path separator character
     */
    public static final String getPathSeparator()
    {
        return java.io.File.pathSeparator;
    }

    /**
     * Returns the path separator character for the current platform.
     *
     * @return The platform-specific path separator character
     */
    public static final char getPathSeparatorChar()
    {
        return java.io.File.pathSeparatorChar;
    }

    /**
     * Returns the name separator character for the current platform (as a
     * String).
     *
     * @return The platform-specific name separator character
     */
    public static final String getSeparator()
    {
        return java.io.File.separator;
    }

    /**
     * Returns the name separator character for the current platform.
     *
     * @return The platform specific name separator character
     */
    public static final char getSeparatorChar()
    {
        return java.io.File.separatorChar;
    }
}
