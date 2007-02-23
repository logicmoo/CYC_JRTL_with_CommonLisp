/*
 * Packages.java
 *
 * Copyright (C) 2002-2005 Peter Graves
 * $Id: Packages.java,v 1.14 2007-02-23 21:17:34 piso Exp $
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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class Packages extends Lisp
{
    private static final ArrayList packages = new ArrayList();
    private static final HashMap map = new HashMap();

    public static final synchronized Package createPackage(String name)
    {
        return createPackage(name, 0);
    }

    public static final synchronized Package createPackage(String name, int size)
    {
        Package pkg = (Package) map.get(name);
        if (pkg == null) {
            pkg = size != 0 ? new Package(name, size) : new Package(name);
            packages.add(pkg);
            map.put(name, pkg);
        } else
            Debug.trace("package " + name + " already exists");
        return pkg;
    }

    public static final synchronized void addPackage(Package pkg)
        throws ConditionThrowable
    {
        final String name = pkg.getName();
        if (map.get(name) != null) {
            error(new LispError("A package named " + name + " already exists."));
            return;
        }
        packages.add(pkg);
        map.put(name, pkg);
        List nicknames = pkg.getNicknames();
        if (nicknames != null) {
            for (Iterator it = nicknames.iterator(); it.hasNext();) {
                String nickname = (String) it.next();
                addNickname(pkg, nickname);
            }
        }
    }

    // Returns null if package doesn't exist.
    public static final synchronized Package findPackage(String name)
    {
        return (Package) map.get(name);
    }

    public static final synchronized Package makePackage(String name)
        throws ConditionThrowable
    {
        if (map.get(name) != null) {
            error(new LispError("A package named " + name + " already exists."));
            // Not reached.
            return null;
        }
        Package pkg = new Package(name);
        packages.add(pkg);
        map.put(name, pkg);
        return pkg;
    }

    public static final synchronized void addNickname(Package pkg,
                                                      String nickname)
        throws ConditionThrowable
    {
        if (map.get(nickname) != null) {
            error(new PackageError("A package named " + nickname + " already exists."));
            return;
        }
        map.put(nickname, pkg);
    }

    // Removes name and nicknames from map, removes pkg from packages.
    public static final synchronized boolean deletePackage(Package pkg)
    {
        String name = pkg.getName();
        if (name != null) {
            map.remove(name);
            List nicknames = pkg.getNicknames();
            if (nicknames != null) {
                for (Iterator it = nicknames.iterator(); it.hasNext();) {
                    String nickname = (String) it.next();
                    map.remove(nickname);
                }
            }
            packages.remove(pkg);
            return true;
        }
        return false;
    }

    public static final synchronized LispObject listAllPackages()
    {
        LispObject result = NIL;
        for (Iterator it = packages.iterator(); it.hasNext();) {
            Package pkg = (Package) it.next();
            result = new Cons(pkg, result);
        }
        return result;
    }

    public static final synchronized Package[] getAllPackages()
    {
        Package[] array = new Package[packages.size()];
        packages.toArray(array);
        return array;
    }
}
