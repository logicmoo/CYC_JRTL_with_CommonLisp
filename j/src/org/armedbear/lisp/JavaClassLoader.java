/*
 * JavaClassLoader.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: JavaClassLoader.java,v 1.1 2003-04-14 15:42:06 piso Exp $
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
    protected Class loadClassFromFile(String filename)
    {
        try {
            File file = new File(filename);
            if (file.isFile()) {
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
            } else
                Debug.trace("file not found: " + filename);
        }
        catch (Throwable t) {
            Debug.trace(t);
        }
        return null;
    }
}
