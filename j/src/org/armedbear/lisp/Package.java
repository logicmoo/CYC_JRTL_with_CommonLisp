/*
 * Package.java
 *
 * Copyright (C) 2002-2003 Peter Graves
 * $Id: Package.java,v 1.31 2003-07-07 13:01:40 piso Exp $
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

    private final HashMap internalSymbols;
    private final HashMap externalSymbols;

    private ArrayList nicknames;
    private final ArrayList useList = new ArrayList();
    private ArrayList usedByList = null;
    private final ArrayList shadowingSymbols = new ArrayList();

    public Package(String name)
    {
        this.name = name;
        internalSymbols = new HashMap();
        externalSymbols = new HashMap();
    }

    public Package(String name, int size)
    {
        this.name = name;
        internalSymbols = new HashMap();
        externalSymbols = new HashMap();
    }

    public LispObject typeOf()
    {
        return Symbol.PACKAGE;
    }

    public LispObject typep(LispObject typeSpecifier) throws LispError
    {
        if (typeSpecifier == Symbol.PACKAGE || typeSpecifier == T)
            return T;
        return NIL;
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
            nicknames = null;
            return true;
        }
        return false;
    }

    public final synchronized void rename(String newName, LispObject newNicks)
        throws LispError
    {
        ArrayList arrayList = null;
        while (newNicks != NIL) {
            if (arrayList == null)
                arrayList = new ArrayList();
            arrayList.add(javaString(newNicks.car()));
            newNicks = newNicks.cdr();
        }

        // Remove old name and nicknames from Packages map.
        Packages.deletePackage(this);

        // Now change the names...
        name = newName;
        nicknames = arrayList;

        // And add the package back.
        Packages.addPackage(this);
    }

    public synchronized Symbol findInternalSymbol(String name)
    {
        return (Symbol) internalSymbols.get(name);
    }

    public synchronized Symbol findExternalSymbol(String name)
    {
        return (Symbol) externalSymbols.get(name);
    }

    // Returns null if symbol is not accessible in this package.
    public synchronized Symbol findAccessibleSymbol(String name)
    {
        // Look in external and internal symbols of this package.
        Symbol symbol = (Symbol) externalSymbols.get(name);
        if (symbol != null)
            return symbol;
        symbol = (Symbol) internalSymbols.get(name);
        if (symbol != null)
            return symbol;
        // Look in external symbols of used packages.
        for (Iterator it = useList.iterator(); it.hasNext();) {
            Package pkg = (Package) it.next();
            symbol = pkg.findExternalSymbol(name);
            if (symbol != null)
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
        Symbol symbol = (Symbol) externalSymbols.get(name);
        if (symbol != null) {
            values[0] = symbol;
            values[1] = Keyword.EXTERNAL;
            thread.setValues(values);
            return symbol;
        }
        symbol = (Symbol) internalSymbols.get(name);
        if (symbol != null) {
            values[0] = symbol;
            values[1] = Keyword.INTERNAL;
            thread.setValues(values);
            return symbol;
        }
        // Look in external symbols of used packages.
        for (Iterator it = useList.iterator(); it.hasNext();) {
            Package pkg = (Package) it.next();
            symbol = pkg.findExternalSymbol(name);
            if (symbol != null) {
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

    // Helper function to add NIL to PACKAGE_CL.
    public synchronized void addSymbol(Symbol symbol)
    {
        Debug.assertTrue(symbol.getPackage() == this);
        final String name = symbol.getName();
        Debug.assertTrue(name.equals("NIL"));
        externalSymbols.put(symbol.getName(), symbol);
    }

    private synchronized Symbol addSymbol(String symbolName)
    {
        Symbol symbol = new Symbol(symbolName, this);
        if (this == PACKAGE_KEYWORD) {
            symbol.setSymbolValue(symbol);
            symbol.setConstant(true);
            externalSymbols.put(symbolName, symbol);
        } else
            internalSymbols.put(symbolName, symbol);
        return symbol;
    }

    public synchronized Symbol addInternalSymbol(String symbolName)
    {
        Symbol symbol = new Symbol(symbolName, this);
        internalSymbols.put(symbolName, symbol);
        return symbol;
    }

    public synchronized Symbol addExternalSymbol(String symbolName)
    {
        Symbol symbol = new Symbol(symbolName, this);
        externalSymbols.put(symbolName, symbol);
        return symbol;
    }

    public synchronized void addInitialExports(String[] names)
    {
        for (int i = names.length; i-- > 0;) {
            String symbolName = names[i];
            Debug.assertTrue(internalSymbols.get(symbolName) == null);
            if (externalSymbols.get(symbolName) == null)
                externalSymbols.put(symbolName, new Symbol(symbolName, this));
        }
    }

    public synchronized Symbol intern(String symbolName)
    {
        // Look in external and internal symbols of this package.
        Symbol symbol = (Symbol) externalSymbols.get(symbolName);
        if (symbol != null)
            return symbol;
        symbol = (Symbol) internalSymbols.get(symbolName);
        if (symbol != null)
            return symbol;
        // Look in external symbols of used packages.
        for (Iterator it = useList.iterator(); it.hasNext();) {
            Package pkg = (Package) it.next();
            symbol = pkg.findExternalSymbol(symbolName);
            if (symbol != null)
                return symbol;
        }
        // Not found.
        return addSymbol(symbolName);
    }

    public synchronized Symbol intern(String name, LispThread thread)
    {
        LispObject[] values = new LispObject[2];
        // Look in external and internal symbols of this package.
        Symbol symbol = (Symbol) externalSymbols.get(name);
        if (symbol != null) {
            values[0] = symbol;
            values[1] = Keyword.EXTERNAL;
            thread.setValues(values);
            return symbol;
        }
        symbol = (Symbol) internalSymbols.get(name);
        if (symbol != null) {
            values[0] = symbol;
            values[1] = Keyword.INTERNAL;
            thread.setValues(values);
            return symbol;
        }
        // Look in external symbols of used packages.
        for (Iterator it = useList.iterator(); it.hasNext();) {
            Package pkg = (Package) it.next();
            symbol = pkg.findExternalSymbol(name);
            if (symbol != null) {
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
        final String symbolName = symbol.getName();
        if (internalSymbols.get(symbolName) == symbol) {
            internalSymbols.remove(symbolName);
        } else if (externalSymbols.get(symbolName) == symbol) {
            externalSymbols.remove(symbolName);
        } else {
            // Not found.
            return NIL;
        }
        if (symbol.getPackage() == this)
            symbol.setPackage(NIL);
        return T;
    }

    public synchronized void importSymbol(Symbol symbol) throws LispError
    {
        if (symbol.getPackage() == this)
            return; // Nothing to do.
        Symbol sym = findAccessibleSymbol(symbol.getName());
        if (sym != null && sym != symbol) {
            StringBuffer sb = new StringBuffer("the symbol ");
            sb.append(sym.getQualifiedName());
            sb.append(" is already accessible in package ");
            sb.append(name);
            throw new PackageError(sb.toString());
        }
        internalSymbols.put(symbol.getName(), symbol);
    }

    public synchronized void export(Symbol symbol) throws LispError
    {
        if (symbol.getPackage() != this) {
            Symbol sym = findAccessibleSymbol(symbol.getName());
            if (sym == null) {
                StringBuffer sb = new StringBuffer("the symbol ");
                sb.append(symbol.getQualifiedName());
                sb.append(" is not accessible in package ");
                sb.append(name);
                throw new PackageError(sb.toString());
            }
            if (sym != symbol) {
                // Conflict.
                StringBuffer sb = new StringBuffer("the symbol ");
                sb.append(sym.getQualifiedName());
                sb.append(" is already accessible in package ");
                sb.append(name);
                throw new PackageError(sb.toString());
            }
            internalSymbols.put(symbol.getName(), symbol);
        }
        final String symbolName = symbol.getName();
        if (internalSymbols.get(symbolName) == symbol) {
            // Found existing internal symbol in this package.
            if (usedByList != null) {
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
            }
            // No conflicts.
            internalSymbols.remove(symbolName);
            externalSymbols.put(symbolName, symbol);
            return;
        }
        if (externalSymbols.get(symbolName) == symbol) {
            // Symbol is already exported; there's nothing to do.
            return;
        }
        StringBuffer sb = new StringBuffer("the symbol ");
        sb.append(symbol.getQualifiedName());
        sb.append(" is not accessible in package ");
        sb.append(name);
        throw new PackageError(sb.toString());
    }

    public synchronized void shadow(String name) throws LispError
    {
        Symbol symbol = (Symbol) externalSymbols.get(name);
        if (symbol == null)
            symbol = (Symbol) internalSymbols.get(name);
        if (symbol == null)
            symbol = addSymbol(name);
        if (!shadowingSymbols.contains(symbol))
            shadowingSymbols.add(symbol);
    }

    public synchronized void shadowingImport(Symbol symbol) throws LispError
    {
        LispObject where = NIL;
        final String name = symbol.getName();
        Symbol sym = (Symbol) externalSymbols.get(name);
        if (sym != null) {
            where = Keyword.EXTERNAL;
        } else {
            sym = (Symbol) internalSymbols.get(name);
            if (sym != null) {
                where = Keyword.INTERNAL;
            } else {
                // Look in external syms of used packages.
                for (Iterator it = useList.iterator(); it.hasNext();) {
                    Package pkg = (Package) it.next();
                    sym = pkg.findExternalSymbol(name);
                    if (sym != null) {
                        where = Keyword.INHERITED;
                        break;
                    }
                }
            }
        }
        if (sym != null) {
            if (where == Keyword.INTERNAL || where == Keyword.EXTERNAL) {
                if (sym != symbol) {
                    shadowingSymbols.remove(sym);
                    unintern(sym);
                }
            }
        }
        internalSymbols.put(name, symbol);
        Debug.assertTrue(!shadowingSymbols.contains(symbol));
        shadowingSymbols.add(symbol);
    }

    // Adds pkg to the use list of this package.
    public void usePackage(Package pkg)
    {
        if (!useList.contains(pkg)) {
            useList.add(pkg);
            // Add this package to the used-by list of pkg.
            if (pkg.usedByList != null)
                Debug.assertTrue(!pkg.usedByList.contains(this));
            if (pkg.usedByList == null)
                pkg.usedByList = new ArrayList();
            pkg.usedByList.add(this);
        }
    }

    public void unusePackage(Package pkg)
    {
        if (useList.contains(pkg)) {
            useList.remove(pkg);
            Debug.assertTrue(pkg.usedByList != null);
            Debug.assertTrue(pkg.usedByList.contains(this));
            pkg.usedByList.remove(this);
        }
    }

    public final void addNickname(String s) throws LispError
    {
        if (nicknames != null) {
            if (nicknames.contains(s))
                return; // Nothing to do.
        } else
            nicknames = new ArrayList();
        nicknames.add(s);
        Packages.addNickname(this, s);
    }

    public String getNickname()
    {
        if (nicknames != null && nicknames.size() > 0)
            return (String) nicknames.get(0);
        return null;
    }

    public LispObject packageNicknames()
    {
        LispObject list = NIL;
        if (nicknames != null) {
            for (int i = nicknames.size(); i-- > 0;) {
                String nickname = (String) nicknames.get(i);
                list = new Cons(new LispString(nickname), list);
            }
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
        if (usedByList != null) {
            for (Iterator it = usedByList.iterator(); it.hasNext();) {
                Package pkg = (Package) it.next();
                list = new Cons(pkg, list);
            }
        }
        return list;
    }

    public LispObject getShadowingSymbols()
    {
        LispObject list = NIL;
        for (Iterator it = shadowingSymbols.iterator(); it.hasNext();) {
            Symbol symbol = (Symbol) it.next();
            list = new Cons(symbol, list);
        }
        return list;
    }

    public synchronized List getExternalSymbols()
    {
        ArrayList list = new ArrayList();
        for (Iterator it = externalSymbols.values().iterator(); it.hasNext();) {
            Symbol symbol = (Symbol) it.next();
            list.add(symbol);
        }
        return list;
    }

    public synchronized List getAccessibleSymbols()
    {
        ArrayList list = new ArrayList();
        for (Iterator it = externalSymbols.values().iterator(); it.hasNext();) {
            Symbol symbol = (Symbol) it.next();
            list.add(symbol);
        }
        for (Iterator packageIter = useList.iterator(); packageIter.hasNext();) {
            Package pkg = (Package) packageIter.next();
            for (Iterator it = pkg.externalSymbols.values().iterator(); it.hasNext();) {
                Symbol symbol = (Symbol) it.next();
                list.add(symbol);
            }
        }
        return list;
    }

    public synchronized LispObject getSymbols()
    {
        LispObject list = NIL;
        for (Iterator it = internalSymbols.values().iterator(); it.hasNext();) {
            Symbol symbol = (Symbol) it.next();
            list = new Cons(symbol, list);
        }
        for (Iterator it = externalSymbols.values().iterator(); it.hasNext();) {
            Symbol symbol = (Symbol) it.next();
            list = new Cons(symbol, list);
        }
        return list;
    }

    public synchronized Symbol[] symbols()
    {
        Symbol[] array = new Symbol[internalSymbols.size() + externalSymbols.size()];
        int i = 0;
        for (Iterator it = internalSymbols.values().iterator(); it.hasNext();) {
            Symbol symbol = (Symbol) it.next();
            array[i++] = symbol;
        }
        for (Iterator it = externalSymbols.values().iterator(); it.hasNext();) {
            Symbol symbol = (Symbol) it.next();
            array[i++] = symbol;
        }
        return array;
    }

    public String toString()
    {
        StringBuffer sb = new StringBuffer("#<The ");
        sb.append(name);
        sb.append(" package>");
        return sb.toString();
    }
}
