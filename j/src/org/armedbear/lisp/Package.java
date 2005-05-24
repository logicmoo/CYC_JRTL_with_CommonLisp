/*
 * Package.java
 *
 * Copyright (C) 2002-2005 Peter Graves
 * $Id: Package.java,v 1.66 2005-05-24 18:55:54 piso Exp $
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
    private SimpleString lispName;

    private LispObject propertyList;

    private final SymbolHashTable internalSymbols = new SymbolHashTable(16);
    private final SymbolHashTable externalSymbols = new SymbolHashTable(16);

    private HashMap shadowingSymbols;
    private ArrayList nicknames;
    private LispObject useList = null;
    private ArrayList usedByList = null;

    // Anonymous package.
    public Package()
    {
    }

    public Package(String name)
    {
        this.name = name;
        lispName = new SimpleString(name);
    }

    public Package(String name, int size)
    {
        this.name = name;
        lispName = new SimpleString(name);
    }

    public LispObject typeOf()
    {
        return Symbol.PACKAGE;
    }

    public LispObject classOf()
    {
        return BuiltInClass.PACKAGE;
    }

    public LispObject getDescription()
    {
        if (name != null) {
            StringBuffer sb = new StringBuffer("The ");
            sb.append(name);
            sb.append(" package");
            return new SimpleString(sb);
        }
        return new SimpleString("PACKAGE");
    }

    public LispObject typep(LispObject type) throws ConditionThrowable
    {
        if (type == Symbol.PACKAGE)
            return T;
        if (type == BuiltInClass.PACKAGE)
            return T;
        return super.typep(type);
    }

    public final String getName()
    {
        return name;
    }

    public final LispObject NAME()
    {
        return lispName != null ? lispName : NIL;
    }

    public final LispObject getPropertyList()
    {
        if (propertyList == null)
            propertyList = NIL;
        return propertyList;
    }

    public final void setPropertyList(LispObject obj)
    {
        if (obj == null)
            throw new NullPointerException();
        propertyList = obj;
    }

    public final List getNicknames()
    {
        return nicknames;
    }

    public final synchronized boolean delete() throws ConditionThrowable
    {
        if (name != null) {
            Packages.deletePackage(this);
            List internals = internalSymbols.getSymbols();
            for (int i = internals.size(); i-- > 0;) {
                Symbol symbol = (Symbol) internals.get(i);
                if (symbol.getPackage() == this)
                    symbol.setPackage(NIL);
                internalSymbols.remove(symbol);
            }
            List externals = externalSymbols.getSymbols();
            for (int i = externals.size(); i-- > 0;) {
                Symbol symbol = (Symbol) externals.get(i);
                if (symbol.getPackage() == this)
                    symbol.setPackage(NIL);
                externalSymbols.remove(symbol);
            }
            name = null;
            lispName = null;
            nicknames = null;
            return true;
        }
        return false;
    }

    public final synchronized void rename(String newName, LispObject newNicks)
        throws ConditionThrowable
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
        lispName = new SimpleString(newName);
        nicknames = arrayList;
        // And add the package back.
        Packages.addPackage(this);
    }

    public synchronized Symbol findInternalSymbol(String name)
    {
        return (Symbol) internalSymbols.get(name); // FIXME
    }

    public synchronized Symbol findInternalSymbol(AbstractString name)
    {
        return (Symbol) internalSymbols.get(name);
    }

    public synchronized Symbol findExternalSymbol(String name)
    {
        return (Symbol) externalSymbols.get(name); // FIXME
    }

    public synchronized Symbol findExternalSymbol(AbstractString name)
    {
        return (Symbol) externalSymbols.get(name);
    }

    public synchronized Symbol findExternalSymbol(AbstractString name, int hash)
    {
        return (Symbol) externalSymbols.get(name, hash);
    }

    // Returns null if symbol is not accessible in this package.
    public synchronized Symbol findAccessibleSymbol(String name)
        throws ConditionThrowable
    {
        // Look in external and internal symbols of this package.
        Symbol symbol = (Symbol) externalSymbols.get(name);
        if (symbol != null)
            return symbol;
        symbol = (Symbol) internalSymbols.get(name);
        if (symbol != null)
            return symbol;
        // Look in external symbols of used packages.
        if (useList instanceof Cons) {
            LispObject usedPackages = useList;
            while (usedPackages != NIL) {
                Package pkg = (Package) usedPackages.car();
                symbol = pkg.findExternalSymbol(name);
                if (symbol != null)
                    return symbol;
                usedPackages = usedPackages.cdr();
            }
        }
        // Not found.
        return null;
    }

    public synchronized LispObject findSymbol(String name)
        throws ConditionThrowable
    {
        final LispThread thread = LispThread.currentThread();
        // Look in external and internal symbols of this package.
        Symbol symbol = (Symbol) externalSymbols.get(name);
        if (symbol != null)
            return thread.setValues(symbol, Keyword.EXTERNAL);
        symbol = (Symbol) internalSymbols.get(name);
        if (symbol != null)
            return thread.setValues(symbol, Keyword.INTERNAL);
        // Look in external symbols of used packages.
        if (useList instanceof Cons) {
            LispObject usedPackages = useList;
            while (usedPackages != NIL) {
                Package pkg = (Package) usedPackages.car();
                symbol = pkg.findExternalSymbol(name);
                if (symbol != null)
                    return thread.setValues(symbol, Keyword.INHERITED);
                usedPackages = usedPackages.cdr();
            }
        }
        // Not found.
        return thread.setValues(NIL, NIL);
    }

    // Helper function to add NIL to PACKAGE_CL.
    public synchronized void addSymbol(Symbol symbol)
    {
        Debug.assertTrue(symbol.getPackage() == this);
        final String name = symbol.getName();
        Debug.assertTrue(name.equals("NIL"));
        try {
            externalSymbols.put(symbol.name, symbol);
        }
        catch (Throwable t) {
            Debug.trace(t); // FIXME
        }
    }

    private synchronized Symbol addSymbol(String symbolName)
    {
        Symbol symbol = new Symbol(symbolName, this);
        try {
            if (this == PACKAGE_KEYWORD) {
                symbol.setSymbolValue(symbol);
                symbol.setConstant(true);
                externalSymbols.put(symbolName, symbol);
            } else
                internalSymbols.put(symbolName, symbol);
        }
        catch (Throwable t) {
            Debug.trace(t); // FIXME
        }
        return symbol;
    }

    private synchronized Symbol addSymbol(SimpleString name)
    {
        Symbol symbol = new Symbol(name, this);
        try {
            if (this == PACKAGE_KEYWORD) {
                symbol.setSymbolValue(symbol);
                symbol.setConstant(true);
                externalSymbols.put(name, symbol);
            } else
                internalSymbols.put(name, symbol);
        }
        catch (Throwable t) {
            Debug.trace(t); // FIXME
        }
        return symbol;
    }

    private synchronized Symbol addSymbol(SimpleString name, int hash)
    {
        Symbol symbol = new Symbol(name, hash, this);
        try {
            if (this == PACKAGE_KEYWORD) {
                symbol.setSymbolValue(symbol);
                symbol.setConstant(true);
                externalSymbols.put(name, symbol);
            } else
                internalSymbols.put(name, symbol);
        }
        catch (Throwable t) {
            Debug.trace(t); // FIXME
        }
        return symbol;
    }

    public synchronized Symbol addInternalSymbol(String symbolName)
    {
        Symbol symbol = new Symbol(symbolName, this);
        try {
            internalSymbols.put(symbolName, symbol);
        }
        catch (Throwable t) {
            Debug.trace(t); // FIXME
        }
        return symbol;
    }

    public synchronized Symbol addExternalSymbol(String symbolName)
    {
        Symbol symbol = new Symbol(symbolName, this);
        try {
            externalSymbols.put(symbol);
        }
        catch (Throwable t) {
            Debug.trace(t); // FIXME
        }
        return symbol;
    }

    public synchronized void addInitialExports(String[] names)
    {
        for (int i = names.length; i-- > 0;) {
            final SimpleString name = new SimpleString(names[i]);
            final int hash = name.sxhash();
            // There shouldn't be any internal symbols in the COMMON-LISP
            // package.
            Debug.assertTrue(internalSymbols.get(name, hash) == null);
            // The symbol in question may have been exported already. If we
            // replace an existing symbol, we'll lose any information that
            // might be associated with it. So we check first...
            if (externalSymbols.get(name, hash) == null)
                externalSymbols.put(new Symbol(name, hash, this));
        }
    }

    public synchronized Symbol intern(String symbolName)
    {
        return intern(new SimpleString(symbolName));
    }

    public synchronized Symbol intern(SimpleString symbolName)
    {
        final int hash = symbolName.sxhash();
        // Look in external and internal symbols of this package.
        Symbol symbol = (Symbol) externalSymbols.get(symbolName, hash);
        if (symbol != null)
            return symbol;
        symbol = (Symbol) internalSymbols.get(symbolName, hash);
        if (symbol != null)
            return symbol;
        // Look in external symbols of used packages.
        if (useList instanceof Cons) {
            try {
                LispObject usedPackages = useList;
                while (usedPackages != NIL) {
                    Package pkg = (Package) usedPackages.car();
                    symbol = pkg.findExternalSymbol(symbolName, hash);
                    if (symbol != null)
                        return symbol;
                    usedPackages = usedPackages.cdr();
                }
            }
            catch (Throwable t) {
                Debug.trace(t);
            }
        }
        // Not found.
        return addSymbol(symbolName, hash);
    }

    public synchronized Symbol intern(String name, LispThread thread)
    {
        // Look in external and internal symbols of this package.
        Symbol symbol = (Symbol) externalSymbols.get(name);
        if (symbol != null)
            return (Symbol) thread.setValues(symbol, Keyword.EXTERNAL);
        symbol = (Symbol) internalSymbols.get(name);
        if (symbol != null)
            return (Symbol) thread.setValues(symbol, Keyword.INTERNAL);
        // Look in external symbols of used packages.
        if (useList instanceof Cons) {
            try {
                LispObject usedPackages = useList;
                while (usedPackages != NIL) {
                    Package pkg = (Package) usedPackages.car();
                    symbol = pkg.findExternalSymbol(name);
                    if (symbol != null)
                        return (Symbol) thread.setValues(symbol, Keyword.INHERITED);
                    usedPackages = usedPackages.cdr();
                }
            }
            catch (Throwable t) {
                Debug.trace(t);
            }
        }
        // Not found.
        return (Symbol) thread.setValues(addSymbol(name), NIL);
    }

    public synchronized Symbol internAndExport(String symbolName)
        throws ConditionThrowable
    {
        final SimpleString name = new SimpleString(symbolName);
        final int hash = name.sxhash();
        // Look in external and internal symbols of this package.
        Symbol symbol = (Symbol) externalSymbols.get(name, hash);
        if (symbol != null)
            return symbol;
        symbol = (Symbol) internalSymbols.get(name, hash);
        if (symbol != null) {
            export(symbol);
            return symbol;
        }
        if (useList instanceof Cons) {
            // Look in external symbols of used packages.
            LispObject usedPackages = useList;
            while (usedPackages != NIL) {
                Package pkg = (Package) usedPackages.car();
                symbol = pkg.findExternalSymbol(name, hash);
                if (symbol != null) {
                    export(symbol);
                    return symbol;
                }
                usedPackages = usedPackages.cdr();
            }
        }
        // Not found.
        symbol = new Symbol(name, hash, this);
        if (this == PACKAGE_KEYWORD) {
            symbol.setSymbolValue(symbol);
            symbol.setConstant(true);
        }
        externalSymbols.put(name, symbol);
        return symbol;
    }

    public synchronized LispObject unintern(Symbol symbol) throws ConditionThrowable
    {
        final String symbolName = symbol.getName();
        final boolean shadow;
        if (shadowingSymbols != null && shadowingSymbols.get(symbolName) == symbol)
            shadow = true;
        else
            shadow = false;
        if (shadow) {
            // Check for conflicts that might be exposed in used package list
            // if we remove the shadowing symbol.
            Symbol sym = null;
            if (useList instanceof Cons) {
                LispObject usedPackages = useList;
                while (usedPackages != NIL) {
                    Package pkg = (Package) usedPackages.car();
                    Symbol s = pkg.findExternalSymbol(symbol.name);
                    if (s != null) {
                        if (sym == null)
                            sym = s;
                        else if (sym != s) {
                            StringBuffer sb =
                                new StringBuffer("Uninterning the symbol ");
                            sb.append(symbol.getQualifiedName());
                            sb.append(" causes a name conflict between ");
                            sb.append(sym.getQualifiedName());
                            sb.append(" and ");
                            sb.append(s.getQualifiedName());
                            return signal(new PackageError(sb.toString()));
                        }
                    }
                    usedPackages = usedPackages.cdr();
                }
            }
        }
        // Reaching here, it's OK to remove the symbol.
        if (internalSymbols.get(symbolName) == symbol)
            internalSymbols.remove(symbolName);
        else if (externalSymbols.get(symbolName) == symbol)
            externalSymbols.remove(symbolName);
        else
            // Not found.
            return NIL;
        if (shadow) {
            Debug.assertTrue(shadowingSymbols != null);
            shadowingSymbols.remove(symbolName);
        }
        if (symbol.getPackage() == this)
            symbol.setPackage(NIL);
        return T;
    }

    public synchronized void importSymbol(Symbol symbol) throws ConditionThrowable
    {
        if (symbol.getPackage() == this)
            return; // Nothing to do.
        Symbol sym = findAccessibleSymbol(symbol.getName());
        if (sym != null && sym != symbol) {
            StringBuffer sb = new StringBuffer("The symbol ");
            sb.append(sym.getQualifiedName());
            sb.append(" is already accessible in package ");
            sb.append(name);
            sb.append('.');
            signal(new PackageError(sb.toString()));
        }
        internalSymbols.put(symbol.name, symbol);
        if (symbol.getPackage() == NIL)
            symbol.setPackage(this);
    }

    public synchronized void export(Symbol symbol) throws ConditionThrowable
    {
        final String symbolName = symbol.getName();
        boolean added = false;
        if (symbol.getPackage() != this) {
            Symbol sym = findAccessibleSymbol(symbolName);
            if (sym == null) {
                StringBuffer sb = new StringBuffer("The symbol ");
                sb.append(symbol.getQualifiedName());
                sb.append(" is not accessible in package ");
                sb.append(name);
                sb.append('.');
                signal(new PackageError(sb.toString()));
                return;
            }
            if (sym != symbol) {
                // Conflict.
                StringBuffer sb = new StringBuffer("The symbol ");
                sb.append(sym.getQualifiedName());
                sb.append(" is already accessible in package ");
                sb.append(name);
                sb.append('.');
                signal(new PackageError(sb.toString()));
                return;
            }
            internalSymbols.put(symbolName, symbol);
            added = true;
        }
        if (added || internalSymbols.get(symbolName) == symbol) {
            if (usedByList != null) {
                for (Iterator it = usedByList.iterator(); it.hasNext();) {
                    Package pkg = (Package) it.next();
                    Symbol sym = pkg.findAccessibleSymbol(symbolName);
                    if (sym != null && sym != symbol) {
                        if (pkg.shadowingSymbols != null &&
                            pkg.shadowingSymbols.get(symbolName) == sym) {
                            ; // OK.
                        } else {
                            StringBuffer sb = new StringBuffer("The symbol ");
                            sb.append(sym.getQualifiedName());
                            sb.append(" is already accessible in package ");
                            sb.append(pkg.getName());
                            sb.append('.');
                            signal(new PackageError(sb.toString()));
                            return;
                        }
                    }
                }
            }
            // No conflicts.
            internalSymbols.remove(symbolName);
            externalSymbols.put(symbolName, symbol);
            return;
        }
        if (externalSymbols.get(symbolName) == symbol)
            // Symbol is already exported; there's nothing to do.
            return;
        StringBuffer sb = new StringBuffer("The symbol ");
        sb.append(symbol.getQualifiedName());
        sb.append(" is not accessible in package ");
        sb.append(name);
        sb.append('.');
        Debug.trace(sb.toString());
        signal(new PackageError(sb.toString()));
    }

    public synchronized void unexport(Symbol symbol) throws ConditionThrowable
    {
        final String symbolName = symbol.getName();
        if (symbol.getPackage() == this) {
            if (externalSymbols.get(symbolName) == symbol) {
                externalSymbols.remove(symbolName);
                internalSymbols.put(symbolName, symbol);
            }
        } else {
            // Signal an error if symbol is not accessible.
            if (useList instanceof Cons) {
                LispObject usedPackages = useList;
                while (usedPackages != NIL) {
                    Package pkg = (Package) usedPackages.car();
                    if (pkg.findExternalSymbol(symbolName) == symbol)
                        return; // OK.
                    usedPackages = usedPackages.cdr();
                }
            }
            StringBuffer sb = new StringBuffer("The symbol ");
            sb.append(symbol.getQualifiedName());
            sb.append(" is not accessible in package ");
            sb.append(name);
            signal(new PackageError(sb.toString()));
        }
    }

    public synchronized void shadow(String symbolName) throws ConditionThrowable
    {
        if (shadowingSymbols == null)
            shadowingSymbols = new HashMap();

        Symbol symbol = (Symbol) externalSymbols.get(symbolName);
        if (symbol != null) {
            shadowingSymbols.put(symbolName, symbol);
            return;
        }
        symbol = (Symbol) internalSymbols.get(symbolName);
        if (symbol != null) {
            shadowingSymbols.put(symbolName, symbol);
            return;
        }
//         if (shadowingSymbols != null) {
            if (shadowingSymbols.get(symbolName) != null)
                return;
//         } else
//             shadowingSymbols = new HashMap();

        symbol = new Symbol(symbolName, this);
        internalSymbols.put(symbolName, symbol);
        shadowingSymbols.put(symbolName, symbol);
    }

    public synchronized void shadowingImport(Symbol symbol) throws ConditionThrowable
    {
        LispObject where = NIL;
        final String symbolName = symbol.getName();
        Symbol sym = (Symbol) externalSymbols.get(symbolName);
        if (sym != null) {
            where = Keyword.EXTERNAL;
        } else {
            sym = (Symbol) internalSymbols.get(symbolName);
            if (sym != null) {
                where = Keyword.INTERNAL;
            } else {
                // Look in external symbols of used packages.
                if (useList instanceof Cons) {
                    LispObject usedPackages = useList;
                    while (usedPackages != NIL) {
                        Package pkg = (Package) usedPackages.car();
                        sym = pkg.findExternalSymbol(symbol.name);
                        if (sym != null) {
                            where = Keyword.INHERITED;
                            break;
                        }
                        usedPackages = usedPackages.cdr();
                    }
                }
            }
        }
        if (sym != null) {
            if (where == Keyword.INTERNAL || where == Keyword.EXTERNAL) {
                if (sym != symbol) {
                    if (shadowingSymbols != null)
                        shadowingSymbols.remove(symbolName);
                    unintern(sym);
                }
            }
        }
        internalSymbols.put(symbolName, symbol);
        if (shadowingSymbols == null)
            shadowingSymbols = new HashMap();
        Debug.assertTrue(shadowingSymbols.get(symbolName) == null);
        shadowingSymbols.put(symbolName, symbol);
    }

    // "USE-PACKAGE causes PACKAGE to inherit all the external symbols of
    // PACKAGES-TO-USE. The inherited symbols become accessible as internal
    // symbols of PACKAGE."
    public void usePackage(Package pkg) throws ConditionThrowable
    {
        if (useList == null)
            useList = NIL;
        if (!memq(pkg, useList)) {
            // "USE-PACKAGE checks for name conflicts between the newly
            // imported symbols and those already accessible in package."
            List symbols = pkg.getExternalSymbols();
            for (int i = symbols.size(); i-- > 0;) {
                Symbol symbol = (Symbol) symbols.get(i);
                Symbol existing = findAccessibleSymbol(symbol.getName());
                if (existing != null && existing != symbol) {
                    if (shadowingSymbols == null ||
                        shadowingSymbols.get(symbol.getName()) == null)
                    {
                        signal(new PackageError("A symbol named " + symbol.getName() +
                                                " is already accessible in package " +
                                                name + "."));
                        return;
                    }
                }
            }
            useList = useList.push(pkg);
            // Add this package to the used-by list of pkg.
            if (pkg.usedByList != null)
                Debug.assertTrue(!pkg.usedByList.contains(this));
            if (pkg.usedByList == null)
                pkg.usedByList = new ArrayList();
            pkg.usedByList.add(this);
        }
    }

    public void unusePackage(Package pkg) throws ConditionThrowable
    {
        if (useList instanceof Cons) {
            if (memq(pkg, useList)) {
                // FIXME Modify the original list instead of copying it!
                LispObject newList = NIL;
                while (useList != NIL) {
                    if (useList.car() != pkg)
                        newList = newList.push(useList.car());
                    useList = useList.cdr();
                }
                useList = newList.nreverse();
                Debug.assertTrue(!memq(pkg, useList));
                Debug.assertTrue(pkg.usedByList != null);
                Debug.assertTrue(pkg.usedByList.contains(this));
                pkg.usedByList.remove(this);
            }
        }
    }

    public final void addNickname(String s) throws ConditionThrowable
    {
        // This call will throw an error if there's a naming conflict.
        Packages.addNickname(this, s);

        if (nicknames != null) {
            if (nicknames.contains(s))
                return; // Nothing to do.
        } else
            nicknames = new ArrayList();

        nicknames.add(s);
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
                list = new Cons(new SimpleString(nickname), list);
            }
        }
        return list;
    }

    public LispObject getUseList()
    {
        if (useList == null)
            useList = NIL;
        return useList;
    }

    public boolean uses(LispObject pkg) throws ConditionThrowable
    {
        return (useList instanceof Cons) && memq(pkg, useList);
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
        if (shadowingSymbols != null) {
            for (Iterator it = shadowingSymbols.values().iterator(); it.hasNext();) {
                Symbol symbol = (Symbol) it.next();
                list = new Cons(symbol, list);
            }
        }
        return list;
    }

    public synchronized List getExternalSymbols()
    {
        return externalSymbols.getSymbols();
    }

    public synchronized List getAccessibleSymbols()
    {
        ArrayList list = new ArrayList();
        list.addAll(internalSymbols.getSymbols());
        list.addAll(externalSymbols.getSymbols());
        if (useList instanceof Cons) {
            try {
                LispObject usedPackages = useList;
                while (usedPackages != NIL) {
                    Package pkg = (Package) usedPackages.car();
                    List symbols = pkg.externalSymbols.getSymbols();
                    for (int i = 0; i < symbols.size(); i++) {
                        Symbol symbol = (Symbol) symbols.get(i);
                        if (shadowingSymbols == null || shadowingSymbols.get(symbol.getName()) == null)
                            list.add(symbol);
                    }
                    usedPackages = usedPackages.cdr();
                }
            }
            catch (Throwable t) {
                Debug.trace(t);
            }
        }
        return list;
    }

    public synchronized LispObject PACKAGE_INTERNAL_SYMBOLS()
    {
        LispObject list = NIL;
        List symbols = internalSymbols.getSymbols();
        for (int i = symbols.size(); i-- > 0;)
            list = new Cons((Symbol)symbols.get(i), list);;
        return list;
    }

    public synchronized LispObject PACKAGE_EXTERNAL_SYMBOLS()
    {
        LispObject list = NIL;
        List symbols = externalSymbols.getSymbols();
        for (int i = symbols.size(); i-- > 0;)
            list = new Cons((Symbol)symbols.get(i), list);;
        return list;
    }

    public synchronized LispObject PACKAGE_INHERITED_SYMBOLS()
    {
        LispObject list = NIL;
        if (useList instanceof Cons) {
            try {
                LispObject usedPackages = useList;
                while (usedPackages != NIL) {
                    Package pkg = (Package) usedPackages.car();
                    List externals = pkg.getExternalSymbols();
                    for (int i = externals.size(); i-- > 0;) {
                        Symbol symbol = (Symbol) externals.get(i);
                        if (shadowingSymbols != null && shadowingSymbols.get(symbol.getName()) != null)
                            continue;
                        if (externalSymbols.get(symbol.name) == symbol)
                            continue;
                        list = new Cons(symbol, list);
                    }
                    usedPackages = usedPackages.cdr();
                }
            }
            catch (Throwable t) {
                Debug.trace(t);
            }
        }
        return list;
    }

    public synchronized LispObject getSymbols()
    {
        LispObject list = NIL;
        List internals = internalSymbols.getSymbols();
        for (int i = internals.size(); i-- > 0;)
            list = new Cons((Symbol)internals.get(i), list);
        List externals = externalSymbols.getSymbols();
        for (int i = externals.size(); i-- > 0;)
            list = new Cons((Symbol)externals.get(i), list);
        return list;
    }

    public synchronized Symbol[] symbols()
    {
        List internals = internalSymbols.getSymbols();
        List externals = externalSymbols.getSymbols();
        Symbol[] array = new Symbol[internals.size() + externals.size()];
        int i = 0;
        for (Iterator it = internals.iterator(); it.hasNext();) {
            Symbol symbol = (Symbol) it.next();
            array[i++] = symbol;
        }
        for (Iterator it = externals.iterator(); it.hasNext();) {
            Symbol symbol = (Symbol) it.next();
            array[i++] = symbol;
        }
        return array;
    }

    public String writeToString() throws ConditionThrowable
    {
        if (_PRINT_FASL_.symbolValue() != NIL && name != null) {
            StringBuffer sb = new StringBuffer("#.(FIND-PACKAGE \"");
            sb.append(name);
            sb.append("\")");
            return sb.toString();
        } else if (name != null) {
            StringBuffer sb = new StringBuffer("#<PACKAGE \"");
            sb.append(name);
            sb.append("\">");
            return sb.toString();
        } else
            return unreadableString("PACKAGE");
    }
}
