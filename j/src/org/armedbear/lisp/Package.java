/*
 * Package.java
 *
 * Copyright (C) 2002-2003 Peter Graves
 * $Id: Package.java,v 1.4 2003-03-05 19:42:47 piso Exp $
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

public final class Package extends LispObject
{
    private String name;
    private String nickname;

    private HashMap map = new HashMap();
    private ArrayList nicknames = new ArrayList();
    private ArrayList useList = new ArrayList();
    private ArrayList usedByList = new ArrayList();

    public Package(String name)
    {
        this.name = name;
    }

    public LispObject typeOf()
    {
        return Symbol.PACKAGE;
    }

    public final String getName()
    {
        return name;
    }

    public final void setName(String name)
    {
        this.name = name;
    }

    // Returns null if symbol not found in package.
    public Symbol findSymbol(String name)
    {
        synchronized (map) {
            return (Symbol) map.get(name);
        }
    }

    // Returns null if symbol is not accessible in this package.
    public synchronized Symbol findAccessibleSymbol(String name)
    {
        name = name.intern();
        // Look in external and internal symbols of this package.
        Symbol symbol = (Symbol) map.get(name);
        if (symbol != null)
            return symbol;
        // Look in external symbols of used packages.
        for (Iterator it = useList.iterator(); it.hasNext();) {
            Package pkg = (Package) it.next();
            symbol = pkg.findSymbol(name);
            if (symbol != null && symbol.isExternal())
                return symbol;
        }
        // Not found.
        return null;
    }

    public synchronized Symbol intern(String name)
    {
        name = name.intern();
        LispObject[] values = new LispObject[2];
        // Look in external and internal symbols of this package.
        Symbol symbol = (Symbol) map.get(name);
        if (symbol != null) {
            values[0] = symbol;
            values[1] =
                symbol.isExternal() ? Keyword.EXTERNAL : Keyword.INTERNAL;
            setValues(values);
            return symbol;
        }
        // Look in external symbols of used packages.
        for (Iterator it = useList.iterator(); it.hasNext();) {
            Package pkg = (Package) it.next();
            symbol = pkg.findSymbol(name);
            if (symbol != null && symbol.isExternal()) {
                values[0] = symbol;
                values[1] = Keyword.INHERITED;
                setValues(values);
                return symbol;
            }
        }
        // Not found.
        map.put(name, symbol = new Symbol(name, this));
        values[0] = symbol;
        values[1] = NIL;
        setValues(values);
        return symbol;
    }

    public synchronized LispObject unintern(Symbol symbol)
    {
        final String name = symbol.getName();
        if (map.get(name) == symbol) {
            map.remove(name);
            if (symbol.getPackage() == this)
                symbol.setPackage(NIL);
            return T;
        }
        return NIL;
    }

    public void export(Symbol symbol) throws LispError
    {
        if (symbol.getPackage() != this) {
            StringBuffer sb = new StringBuffer("attempt to export symbol ");
            sb.append(symbol.getQualifiedName());
            sb.append(" from package ");
            sb.append(name);
            throw new LispError(sb.toString());
        }
        String symbolName = symbol.getName();
        for (Iterator it = usedByList.iterator(); it.hasNext();) {
            Package pkg = (Package) it.next();
            Symbol sym = pkg.findAccessibleSymbol(symbolName);
            if (sym != null && sym != symbol) {
                StringBuffer sb = new StringBuffer("the symbol ");
                sb.append(sym.getQualifiedName());
                sb.append(" is already accessible in package ");
                sb.append(pkg.getName());
                throw new LispError(sb.toString());
            }
        }
        // No conflicts.
        symbol.setExternal(true);
    }

    // Adds pkg to the use list of this package.
    public void usePackage(Package pkg)
    {
        if (!useList.contains(pkg)) {
            useList.add(pkg);
            // Add this package to the used-by list of pkg.
            Debug.assertTrue(!pkg.usedByList.contains(this));
            pkg.usedByList.add(this);
        }
    }

    public void unusePackage(Package pkg)
    {
        if (!(useList.contains(pkg)))
            useList.remove(pkg);
    }

    public final void addNickname(String s) throws LispError
    {
        if (!nicknames.contains(s)) {
            nicknames.add(s);
            Packages.addNickname(this, s);
        }
    }

    public String getNickname()
    {
        return (nicknames.size() > 0) ? (String) nicknames.get(0) : null;
    }

    public LispObject getNicknames()
    {
        LispObject list = NIL;
        for (int i = nicknames.size(); i-- > 0;) {
            String nickname = (String) nicknames.get(i);
            list = new Cons(new LispString(nickname), list);
        }
        return list;
    }

    public LispObject getUseList()
    {
        LispObject list = NIL;
        for (Iterator it = useList.iterator(); it.hasNext();) {
            Package pkg = (Package) it.next();
            list = new Cons(pkg, list);
        }
        return list;
    }

    public boolean uses(LispObject pkg)
    {
        return useList.contains(pkg);
    }

    public LispObject getUsedByList()
    {
        LispObject list = NIL;
        for (Iterator it = usedByList.iterator(); it.hasNext();) {
            Package pkg = (Package) it.next();
            list = new Cons(pkg, list);
        }
        return list;
    }

    public LispObject getSymbols()
    {
        LispObject list = NIL;
        synchronized (map) {
            for (Iterator it = iterator(); it.hasNext();) {
                Symbol symbol = (Symbol) it.next();
                list = new Cons(symbol, list);
            }
        }
        return list;
    }

    public Symbol[] symbols()
    {
        synchronized (map) {
            Symbol[] array = new Symbol[map.size()];
            map.values().toArray(array);
            return array;
        }
    }

    public Iterator iterator()
    {
        return map.values().iterator();
    }

    public String toString()
    {
        StringBuffer sb = new StringBuffer("#<The ");
        sb.append(name);
        sb.append(" package>");
        return sb.toString();
    }
}
