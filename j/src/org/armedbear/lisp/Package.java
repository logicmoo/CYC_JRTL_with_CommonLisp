/*
 * Package.java
 *
 * Copyright (C) 2002-2003 Peter Graves
 * $Id: Package.java,v 1.16 2003-05-25 17:20:05 piso Exp $
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

public final class Package extends LispObject
{
    private String name;

    private final HashMap map;
    private final ArrayList nicknames = new ArrayList();
    private final ArrayList useList = new ArrayList();
    private final ArrayList usedByList = new ArrayList();
    private final ArrayList shadowingSymbols = new ArrayList();

    public Package(String name)
    {
        this.name = name;
        map = new HashMap();
    }

    public Package(String name, int size)
    {
        this.name = name;
        map = new HashMap(size);
    }

    public LispObject typeOf()
    {
        return Symbol.PACKAGE;
    }

    public LispObject constantp()
    {
        return T;
    }

    public final String getName()
    {
        return name;
    }

    public final List getNicknames()
    {
        return nicknames;
    }

    public final synchronized boolean delete()
    {
        if (name != null) {
            Packages.deletePackage(this);
            name = null;
            nicknames.clear();
            return true;
        }
        return false;
    }

    // Returns null if symbol not found in package.
    public Symbol findSymbolInPackage(String name)
    {
        synchronized (map) {
            return (Symbol) map.get(name);
        }
    }

    // Returns null if symbol is not accessible in this package.
    public synchronized Symbol findAccessibleSymbol(String name)
    {
        // Look in external and internal symbols of this package.
        Symbol symbol = (Symbol) map.get(name);
        if (symbol != null)
            return symbol;
        // Look in external symbols of used packages.
        for (Iterator it = useList.iterator(); it.hasNext();) {
            Package pkg = (Package) it.next();
            symbol = pkg.findSymbolInPackage(name);
            if (symbol != null && symbol.isExternal())
                return symbol;
        }
        // Not found.
        return null;
    }

    public synchronized LispObject findSymbol(String name)
    {
        final LispThread thread = LispThread.currentThread();
        LispObject[] values = new LispObject[2];
        // Look in external and internal symbols of this package.
        Symbol symbol = (Symbol) map.get(name);
        if (symbol != null) {
            values[0] = symbol;
            values[1] =
                symbol.isExternal() ? Keyword.EXTERNAL : Keyword.INTERNAL;
            thread.setValues(values);
            return symbol;
        }
        // Look in external symbols of used packages.
        for (Iterator it = useList.iterator(); it.hasNext();) {
            Package pkg = (Package) it.next();
            symbol = pkg.findSymbolInPackage(name);
            if (symbol != null && symbol.isExternal()) {
                values[0] = symbol;
                values[1] = Keyword.INHERITED;
                thread.setValues(values);
                return symbol;
            }
        }
        // Not found.
        values[0] = NIL;
        values[1] = NIL;
        thread.setValues(values);
        return NIL;
    }

    private synchronized Symbol addSymbol(String name)
    {
        Symbol symbol = new Symbol(name, this);
        map.put(name, symbol);
        if (this == PACKAGE_KEYWORD) {
            symbol.setSymbolValue(symbol);
            symbol.setConstant(true);
            symbol.setExternal(true);
        }
        return symbol;
    }

    public synchronized Symbol intern(String name)
    {
        final LispThread thread = LispThread.currentThread();
        LispObject[] values = new LispObject[2];
        // Look in external and internal symbols of this package.
        Symbol symbol = (Symbol) map.get(name);
        if (symbol != null) {
            values[0] = symbol;
            values[1] =
                symbol.isExternal() ? Keyword.EXTERNAL : Keyword.INTERNAL;
            thread.setValues(values);
            return symbol;
        }
        // Look in external symbols of used packages.
        for (Iterator it = useList.iterator(); it.hasNext();) {
            Package pkg = (Package) it.next();
            symbol = pkg.findSymbolInPackage(name);
            if (symbol != null && symbol.isExternal()) {
                values[0] = symbol;
                values[1] = Keyword.INHERITED;
                thread.setValues(values);
                return symbol;
            }
        }
        // Not found.
        symbol = addSymbol(name);
        values[0] = symbol;
        values[1] = NIL;
        thread.setValues(values);
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
            throw new PackageError(sb.toString());
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

    public synchronized void shadow(String name) throws LispError
    {
        Symbol symbol = (Symbol) map.get(name);
        if (symbol == null)
            symbol = addSymbol(name);
        if (!shadowingSymbols.contains(symbol))
            shadowingSymbols.add(symbol);
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

    public LispObject packageNicknames()
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
