/*
 * JavaClassLoader.java
 *
 * Copyright (C) 2003-2004 Peter Graves
 * $Id: JavaClassLoader.java,v 1.9 2004-08-24 18:22:35 asimon Exp $
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
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;


public class JavaClassLoader extends ClassLoader
{
    private static final boolean isSableVM;

    static {
        String vm = System.getProperty("java.vm.name");
        if (vm != null && vm.equals("SableVM"))
            isSableVM = true;
        else
            isSableVM = false;
    }

    private static JavaClassLoader persistentInstance;

    private static Set packages = Collections.synchronizedSet(new HashSet());

    public static JavaClassLoader getPersistentInstance()
    {
        return getPersistentInstance(null);
    }

    public static JavaClassLoader getPersistentInstance(String packageName)
    {
        if (persistentInstance == null)
            persistentInstance = new JavaClassLoader();
	definePackage(packageName);
        return persistentInstance;
    }

    private static void definePackage(String packageName)
    {
        if (packageName != null && !packages.contains(packageName)) {
            persistentInstance.definePackage(packageName,"","1.0","","","1.0","",null);
            packages.add(packageName);
        }
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
                final String name;
                // SableVM requires a non-null name.
                if (isSableVM) {
                    String s = file.getName();
                    int index = s.lastIndexOf('.');
                    if (index >= 0)
                        s = s.substring(0, index);
                    name = "org.armedbear.lisp.".concat(s.replace('-', '_'));
                } else
                    name = null;
                Class c = defineClass(name, classbytes, 0, (int) length);
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
	catch (LinkageError e) {
            throw e;
	}
        catch (Throwable t) {
            Debug.trace(t);
        }
        return null;
    }
}
