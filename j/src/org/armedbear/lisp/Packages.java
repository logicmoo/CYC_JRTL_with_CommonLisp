/*
 * Packages.java
 *
 * Copyright (C) 2002-2003 Peter Graves
 * $Id: Packages.java,v 1.3 2003-02-15 16:48:17 piso Exp $
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

public final class Packages extends Lisp
{
    private static final ArrayList packages = new ArrayList();
    private static final HashMap map = new HashMap();

    // Creates package if it doesn't already exist.
    public static final synchronized Package getPackage(String name)
    {
        Package pkg = (Package) map.get(name);
        if (pkg == null) {
            pkg = new Package(name);
            packages.add(pkg);
            map.put(name, pkg);
        }
        return pkg;
    }

    // Returns null if package doesn't exist.
    public static final synchronized Package findPackage(String name)
    {
        return (Package) map.get(name);
    }

    public static final synchronized Package makePackage(String name)
        throws LispError
    {
        if (map.get(name) != null)
            throw new LispError("a package named " + name +
                " already exists");
        Package pkg = new Package(name);
        packages.add(pkg);
        map.put(name, pkg);
        return pkg;
    }

    public static final synchronized void addNickname(Package pkg,
        String nickname) throws LispError
    {
        if (map.get(nickname) != null)
            throw new LispError("a package named " + nickname +
                " already exists");
        map.put(nickname, pkg);
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
}
