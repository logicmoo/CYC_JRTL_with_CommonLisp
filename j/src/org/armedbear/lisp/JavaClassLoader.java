/*
 * JavaClassLoader.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: JavaClassLoader.java,v 1.3 2004-01-02 11:33:58 asimon Exp $
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

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

public class JavaClassLoader extends ClassLoader
{
    private static JavaClassLoader persistentInstance;

    public static JavaClassLoader getPersistentInstance()
    {
        if (persistentInstance == null)
            persistentInstance = new JavaClassLoader();
        return persistentInstance;
    }

    protected Class loadClassFromFile(File file)
    {
        try {
            long length = file.length();
            if (length < Integer.MAX_VALUE) {
                byte[] classbytes = new byte[(int)length];
                DataInputStream in =
                    new DataInputStream(new FileInputStream(file));
                in.readFully(classbytes);
                in.close();
                Class c = defineClass(null, classbytes, 0, (int) length);
                if (c != null) {
                    resolveClass(c);
                    return c;
                }
            }
        }
        catch (Throwable t) {
            Debug.trace(t);
        }
        return null;
    }


    public Class loadClassFromByteArray(String className, byte[] classbytes)
    {
        try {
            long length = classbytes.length;
            if (length < Integer.MAX_VALUE) {
                Class c = defineClass(className, classbytes, 0, (int) length);
                if (c != null) {
                    resolveClass(c);
                    return c;
                }
            }
        }
        catch (Throwable t) {
            Debug.trace(t);
        }
        return null;
    }

}
