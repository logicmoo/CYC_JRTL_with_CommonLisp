/*
 * Package.java
 *
 * Copyright (C) 2002-2007 Peter Graves <peter@armedbear.org>
 * $Id: Package.java 12431 2010-02-08 08:05:15Z mevenson $
 *
 * toSubLPackage() program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * toSubLPackage() program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with toSubLPackage() program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 *
 * As a special exception, the copyright holders of toSubLPackage() library give you
 * permission to link toSubLPackage() library with independent modules to produce an
 * executable, regardless of the license terms of these independent
 * modules, and to copy and distribute the resulting executable under
 * terms of your choice, provided that you also meet, for each linked
 * independent module, the terms and conditions of the license of that
 * module.  An independent module is a module which is not derived from
 * or based on toSubLPackage() library.  If you modify toSubLPackage() library, you may extend
 * toSubLPackage() exception to your version of the library, but you are not
 * obligated to do so.  If you do not wish to do so, delete toSubLPackage()
 * exception statement from your version.
 */

package com.cyc.tool.subl.jrtl.nativeCode.type.symbol;

import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Lisp.*;
import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObjectFactory.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;


import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.AbstractLispObject;
import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.BuiltInClass;
import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Debug;
import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Keyword;
import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispPackages;
import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispSymbolImpl;
import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispThread;
import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.PackageError;
import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SymbolHashTable;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;

public abstract class LispPackage extends AbstractLispObject
{
  private SubLPackage toSubLPackage() {
		return (SubLPackage)this;
	}

  protected SubLObject propertyList;

  protected final SymbolHashTable internalSymbols = new SymbolHashTable(16);
  protected final SymbolHashTable externalSymbols = new SymbolHashTable(16);

  protected HashMap<String,SubLSymbol> shadowingSymbolsHT;
  protected ArrayList<String> nicknames;
  protected SubLObject useList = null;
  protected ArrayList<SubLPackage> usedByList = null;
  
	protected String javaName;
  protected SubLString name;


    @Override
    public SubLObject typeOf()
    {
        return LispSymbols.PACKAGE;
    }

    @Override
    public SubLObject classOf()
    {
        return BuiltInClass.PACKAGE;
    }

    @Override
    public SubLObject getDescription()
    {
        if (getJavaName() != null) {
            StringBuilder sb = new StringBuilder("The ");
            sb.append(getJavaName());
            sb.append(" package");
            return makeString(sb);
        }
        return makeString("PACKAGE");
    }

    @Override
    public SubLObject typep(SubLObject type)
    {
        if (type == LispSymbols.PACKAGE)
            return T;
        if (type == BuiltInClass.PACKAGE)
            return T;
        return super.typep(type);
    }

    public final String getJavaName()
    {
        return javaName;
    }

    public final SubLObject NAME()
    {
        return name != null ? name : NIL;
    }

    @Override
    public final SubLObject getPropertyList()
    {
        if (propertyList == null)
            propertyList = NIL;
        return propertyList;
    }

    @Override
    public final void setPropertyList(SubLObject obj)
    {
        if (obj == null)
            throw new NullPointerException();
        propertyList = obj;
    }

    public final List getNicknames()
    {
        return nicknames;
    }

    public final synchronized boolean delete()
    {
        if (getJavaName() != null) {
            LispPackages.deletePackage(toSubLPackage());
            List internals = internalSymbols.getSymbols();
            for (int i = internals.size(); i-- > 0;) {
                SubLSymbol symbol = (SubLSymbol) internals.get(i);
                if (symbol.getLispPackage() == toSubLPackage())
                    symbol.setLispPackage(NIL);
                internalSymbols.removeHT(symbol);
            }
            List externals = externalSymbols.getSymbols();
            for (int i = externals.size(); i-- > 0;) {
                SubLSymbol symbol = (SubLSymbol) externals.get(i);
                if (symbol.getLispPackage() == toSubLPackage())
                    symbol.setLispPackage(NIL);
                externalSymbols.removeHT(symbol);
            }
            toPackage().setJavaName(null);
            name = null;
            nicknames = null;
            return true;
        }
        return false;
    }

    public final synchronized void rename(String newName, SubLObject newNicks)

    {
        ArrayList<String> arrayList = null;
        while (newNicks != NIL) {
            if (arrayList == null)
                arrayList = new ArrayList<String>();
            arrayList.add(javaString(newNicks.first()));
            newNicks = newNicks.rest();
        }
        // Remove old name and nicknames from Packages map.
        LispPackages.deletePackage(toSubLPackage());
        // Now change the names...
        toPackage().setJavaName(newName);
        name = makeString(newName);
        nicknames = arrayList;
        // And add the package back.
        LispPackages.addPackage(toSubLPackage());
    }

    public synchronized SubLSymbol findInternalSymbol(SubLString name)
    {
        return internalSymbols.getHT(name);
    }

    public synchronized SubLSymbol findExternalSymbol(SubLString name)
    {
        return externalSymbols.getHT(name);
    }

    public synchronized SubLSymbol findExternalSymbol(SubLString name, int hash)
    {
        return externalSymbols.getHT(name, hash);
    }

    // Returns null if symbol is not accessible in toSubLPackage() package.
    public synchronized SubLSymbol findAccessibleSymbol(String name)

    {
        return findAccessibleSymbol(makeString(name));
    }

    // Returns null if symbol is not accessible in toSubLPackage() package.
    public synchronized SubLSymbol findAccessibleSymbol(SubLString name)

    {
        // Look in external and internal symbols of toSubLPackage() package.
        SubLSymbol symbol = externalSymbols.getHT(name);
        if (symbol != null)
            return symbol;
        symbol = internalSymbols.getHT(name);
        if (symbol != null)
            return symbol;
        // Look in external symbols of used packages.
        if (useList instanceof SubLCons) {
            SubLObject usedPackages = useList;
            while (usedPackages != NIL) {
                SubLPackage pkg = (SubLPackage) usedPackages.first();
                symbol = pkg.findExternalSymbol(name);
                if (symbol != null)
                    return symbol;
                usedPackages = usedPackages.rest();
            }
        }
        // Not found.
        return null;
    }

    public synchronized SubLObject findSymbol(String name)

    {
        final SubLString s = makeString(name);
        final LispThread thread = LispThread.currentThread();
        // Look in external and internal symbols of toSubLPackage() package.
        SubLSymbol symbol = externalSymbols.getHT(s);
        if (symbol != null)
            return thread.setValues(symbol, Keyword.EXTERNAL);
        symbol = internalSymbols.getHT(s);
        if (symbol != null)
            return thread.setValues(symbol, Keyword.INTERNAL);
        // Look in external symbols of used packages.
        if (useList instanceof SubLCons) {
            SubLObject usedPackages = useList;
            while (usedPackages != NIL) {
                SubLPackage pkg = (SubLPackage) usedPackages.first();
                symbol = pkg.findExternalSymbol(s);
                if (symbol != null)
                    return thread.setValues(symbol, Keyword.INHERITED);
                usedPackages = usedPackages.rest();
            }
        }
        // Not found.
        return thread.setValues(NIL, NIL);
    }

    // Helper function to add NIL to PACKAGE_CL.
    public synchronized void addSymbol(SubLSymbol symbol)
    {
        Debug.assertTrue(symbol.getLispPackage() == toSubLPackage());
        Debug.assertTrue(symbol.getJavaSymbolName().equals("NIL"));
        externalSymbols.putHT(symbol.getSubLName(), symbol);
    }

    private synchronized SubLSymbol addSymbol(SubLString name, int hash)
    {
        SubLSymbol symbol = new LispSymbolImpl(name, hash, toSubLPackage());
        if (toSubLPackage() == PACKAGE_KEYWORD) {
            symbol.initializeConstant(symbol);
            externalSymbols.putHT(name, symbol);
        } else
            internalSymbols.putHT(name, symbol);
        
        return symbol;
    }

    public synchronized SubLSymbol addInternalSymbol(String symbolName)
    {
        final SubLSymbol symbol = new LispSymbolImpl(symbolName, toSubLPackage());
        internalSymbols.putHT(symbol);
        return symbol;
    }

    public synchronized SubLSymbol addExternalSymbol(String symbolName)
    {
        final SubLSymbol symbol = new LispSymbolImpl(symbolName, toSubLPackage());
        externalSymbols.putHT(symbol);
        return symbol;
    }

    public synchronized SubLSymbol intern(String symbolName)
    {
        return intern(makeString(symbolName));
    }

    public synchronized SubLSymbol intern(SubLString symbolName)
    {
        final int hash = symbolName.sxhash();
        // Look in external and internal symbols of toSubLPackage() package.
        SubLSymbol symbol = externalSymbols.getHT(symbolName, hash);
        if (symbol != null)
            return symbol;
        symbol = internalSymbols.getHT(symbolName, hash);
        if (symbol != null)
            return symbol;
        // Look in external symbols of used packages.
        if (useList instanceof SubLCons) {
            SubLObject usedPackages = useList;
            while (usedPackages != NIL) {
                SubLPackage pkg = (SubLPackage) usedPackages.first();
                symbol = pkg.findExternalSymbol(symbolName, hash);
                if (symbol != null)
                    return symbol;
                usedPackages = usedPackages.rest();
            }
        }
        // Not found.
        return addSymbol(symbolName, hash);
    }

    public synchronized SubLSymbol intern(final SubLString s,
                                      final LispThread thread)
    {
        final int hash = s.sxhash();
        // Look in external and internal symbols of toSubLPackage() package.
        SubLSymbol symbol = externalSymbols.getHT(s, hash);
        if (symbol != null)
            return (SubLSymbol) thread.setValues(symbol, Keyword.EXTERNAL);
        symbol = internalSymbols.getHT(s, hash);
        if (symbol != null)
            return (SubLSymbol) thread.setValues(symbol, Keyword.INTERNAL);
        // Look in external symbols of used packages.
        if (useList instanceof SubLCons) {
            SubLObject usedPackages = useList;
            while (usedPackages != NIL) {
                SubLPackage pkg = (SubLPackage) usedPackages.first();
                symbol = pkg.findExternalSymbol(s, hash);
                if (symbol != null)
                    return (SubLSymbol) thread.setValues(symbol, Keyword.INHERITED);
                usedPackages = usedPackages.rest();
            }
        }
        // Not found.
        return (SubLSymbol) thread.setValues(addSymbol(s, hash), NIL);
    }

    public synchronized SubLSymbol internAndExport(String symbolName)

    {
        final SubLString s = makeString(symbolName);
        final int hash = s.sxhash();
        // Look in external and internal symbols of toSubLPackage() package.
        SubLSymbol symbol = externalSymbols.getHT(s, hash);
        if (symbol != null)
            return symbol;
        symbol = internalSymbols.getHT(s, hash);
        if (symbol != null) {
            export(symbol);
            return symbol;
        }
        if (useList instanceof SubLCons) {
            // Look in external symbols of used packages.
            SubLObject usedPackages = useList;
            while (usedPackages != NIL) {
                SubLPackage pkg = (SubLPackage) usedPackages.first();
                symbol = pkg.findExternalSymbol(s, hash);
                if (symbol != null) {
                    export(symbol);
                    return symbol;
                }
                usedPackages = usedPackages.rest();
            }
        }
        // Not found.
        symbol = new LispSymbolImpl(s, hash, toSubLPackage());
        if (toSubLPackage() == PACKAGE_KEYWORD)
            symbol.initializeConstant(symbol);
        externalSymbols.putHT(s, symbol);
        return symbol;
    }

    public synchronized SubLObject unintern(final SubLSymbol symbol)

    {
      final SubLString symbolName = symbol.getSubLName();
        final boolean shadow;
        if (shadowingSymbolsHT != null && shadowingSymbolsHT.get(symbolName.getString()) == symbol)
            shadow = true;
        else
            shadow = false;
        if (shadow) {
            // Check for conflicts that might be exposed in used package list
            // if we remove the shadowing symbol.
            SubLSymbol sym = null;
            if (useList instanceof SubLCons) {
                SubLObject usedPackages = useList;
                while (usedPackages != NIL) {
                    SubLPackage pkg = (SubLPackage) usedPackages.first();
                    SubLSymbol s = pkg.findExternalSymbol(symbolName);
                    if (s != null) {
                        if (sym == null)
                            sym = s;
                        else if (sym != s) {
                            StringBuilder sb =
                                new StringBuilder("Uninterning the symbol ");
                            sb.append(symbol.getQualifiedName());
                            sb.append(" causes a name conflict between ");
                            sb.append(sym.getQualifiedName());
                            sb.append(" and ");
                            sb.append(s.getQualifiedName());
                            return error(new PackageError(sb.toString()));
                        }
                    }
                    usedPackages = usedPackages.rest();
                }
            }
        }
        // Reaching here, it's OK to remove the symbol.
        if (internalSymbols.getHT(symbolName) == symbol)
            internalSymbols.removeHT(symbolName);
        else if (externalSymbols.getHT(symbolName) == symbol)
            externalSymbols.removeHT(symbolName);
        else
            // Not found.
            return NIL;
        if (shadow) {
            Debug.assertTrue(shadowingSymbolsHT != null);
            shadowingSymbolsHT.remove(symbolName.getString());
        }
        if (symbol.getLispPackage() == toSubLPackage())
            symbol.setLispPackage(NIL);
        return T;
    }

    public synchronized void importSymbol(SubLSymbol symbol)
    {
      final SubLString symbolName = symbol.getSubLName();
        if (symbol.getLispPackage() == toSubLPackage())
            return; // Nothing to do.
        SubLSymbol sym = findAccessibleSymbol(symbolName);
        if (sym != null && sym != symbol) {
            StringBuilder sb = new StringBuilder("The symbol ");
            sb.append(sym.getQualifiedName());
            sb.append(" is already accessible in package ");
            sb.append(getJavaName());
            sb.append('.');
            error(new PackageError(sb.toString()));
        }
        internalSymbols.putHT(symbolName, symbol);
        if (symbol.getLispPackage() == NIL)
            symbol.setLispPackage(toSubLPackage());
    }

    public synchronized void export(final SubLSymbol symbol)
    {
      final SubLString symbolName = symbol.getSubLName();
        boolean added = false;
        if (symbol.getLispPackage() != toSubLPackage()) {
            SubLSymbol sym = findAccessibleSymbol(symbolName);
            if (sym != symbol) {
                StringBuilder sb = new StringBuilder("The symbol ");
                sb.append(symbol.getQualifiedName());
                sb.append(" is not accessible in package ");
                sb.append(getJavaName());
                sb.append('.');
                error(new PackageError(sb.toString()));
                return;
            }
            internalSymbols.putHT(symbolName, symbol);
            added = true;
        }
        if (added || internalSymbols.getHT(symbolName) == symbol) {
            if (usedByList != null) {
                for (Iterator it = usedByList.iterator(); it.hasNext();) {
                    SubLPackage pkg = (SubLPackage) it.next();
                    SubLSymbol sym = pkg.findAccessibleSymbol(symbolName);
                    if (sym != null && sym != symbol) {
                        if (pkg.shadowingSymbolsHT != null &&
                            pkg.shadowingSymbolsHT.get(symbolName.getString()) == sym) {
                            // OK.
                        } else {
                            StringBuilder sb = new StringBuilder("The symbol ");
                            sb.append(sym.getQualifiedName());
                            sb.append(" is already accessible in package ");
                            sb.append(pkg.getJavaName());
                            sb.append('.');
                            error(new PackageError(sb.toString()));
                            return;
                        }
                    }
                }
            }
            // No conflicts.
            internalSymbols.removeHT(symbolName);
            externalSymbols.putHT(symbolName, symbol);
            return;
        }
        if (externalSymbols.getHT(symbolName) == symbol)
            // Symbol is already exported; there's nothing to do.
            return;
        StringBuilder sb = new StringBuilder("The symbol ");
        sb.append(symbol.getQualifiedName());
        sb.append(" is not accessible in package ");
        sb.append(getJavaName());
        sb.append('.');
        error(new PackageError(sb.toString()));
    }

    public synchronized void unexport(final SubLSymbol symbol)

    {
      final SubLString symbolName = symbol.getSubLName();
        if (symbol.getLispPackage() == toSubLPackage()) {
            if (externalSymbols.getHT(symbolName) == symbol) {
                externalSymbols.removeHT(symbolName);
                internalSymbols.putHT(symbolName, symbol);
            }
        } else {
            // Signal an error if symbol is not accessible.
            if (useList instanceof SubLCons) {
                SubLObject usedPackages = useList;
                while (usedPackages != NIL) {
                    SubLPackage pkg = (SubLPackage) usedPackages.first();
                    if (pkg.findExternalSymbol(symbolName) == symbol)
                        return; // OK.
                    usedPackages = usedPackages.rest();
                }
            }
            StringBuilder sb = new StringBuilder("The symbol ");
            sb.append(symbol.getQualifiedName());
            sb.append(" is not accessible in package ");
            sb.append(getJavaName());
            error(new PackageError(sb.toString()));
        }
    }

    public synchronized void shadow(final String symbolName)

    {
        if (shadowingSymbolsHT == null)
            shadowingSymbolsHT = new HashMap<String,SubLSymbol>();
        final SubLString s = makeString(symbolName);
        SubLSymbol symbol = externalSymbols.getHT(s);
        if (symbol != null) {
            shadowingSymbolsHT.put(symbolName, symbol);
            return;
        }
        symbol = internalSymbols.getHT(s);
        if (symbol != null) {
            shadowingSymbolsHT.put(symbolName, symbol);
            return;
        }
        if (shadowingSymbolsHT.get(symbolName) != null)
            return;
        symbol = new LispSymbolImpl(s, toSubLPackage());
        internalSymbols.putHT(s, symbol);
        shadowingSymbolsHT.put(symbolName, symbol);
    }

    public synchronized void shadowingImport(SubLSymbol symbol)
    {
      final SubLString symbolName = symbol.getSubLName();
        SubLObject where = NIL;
        SubLSymbol sym = externalSymbols.getHT(symbolName);
        if (sym != null) {
            where = Keyword.EXTERNAL;
        } else {
            sym = internalSymbols.getHT(symbolName);
            if (sym != null) {
                where = Keyword.INTERNAL;
            } else {
                // Look in external symbols of used packages.
                if (useList instanceof SubLCons) {
                    SubLObject usedPackages = useList;
                    while (usedPackages != NIL) {
                        SubLPackage pkg = (SubLPackage) usedPackages.first();
                        sym = pkg.findExternalSymbol(symbolName);
                        if (sym != null) {
                            where = Keyword.INHERITED;
                            break;
                        }
                        usedPackages = usedPackages.rest();
                    }
                }
            }
        }
        if (sym != null) {
            if (where == Keyword.INTERNAL || where == Keyword.EXTERNAL) {
                if (sym != symbol) {
                    if (shadowingSymbolsHT != null)
                        shadowingSymbolsHT.remove(symbol.getJavaSymbolName());
                    unintern(sym);
                }
            }
        }
        internalSymbols.putHT(symbolName, symbol);
        if (shadowingSymbolsHT == null)
            shadowingSymbolsHT = new HashMap<String,SubLSymbol>();
        Debug.assertTrue(shadowingSymbolsHT.get(symbolName.getString()) == null);
        shadowingSymbolsHT.put(symbolName.getString(), symbol);
    }

    // "USE-PACKAGE causes PACKAGE to inherit all the external symbols of
    // PACKAGES-TO-USE. The inherited symbols become accessible as internal
    // symbols of PACKAGE."
    public void usePackage(SubLPackage pkg)
    {
        if (useList == null)
            useList = NIL;
        if (!memq(pkg, useList)) {
            // "USE-PACKAGE checks for name conflicts between the newly
            // imported symbols and those already accessible in package."
            List symbols = pkg.getExternalSymbols();
            for (int i = symbols.size(); i-- > 0;) {
                SubLSymbol symbol = (SubLSymbol) symbols.get(i);
                final SubLString symbolName = symbol.getSubLName();
                SubLSymbol existing = findAccessibleSymbol(symbolName);
                if (existing != null && existing != symbol) {
                    if (shadowingSymbolsHT == null ||
                        shadowingSymbolsHT.get(symbol.getJavaSymbolName()) == null)
                    {
                        error(new PackageError("A symbol named " + symbol.getJavaSymbolName() +
                                                " is already accessible in package " +
                                                getJavaName() + "."));
                        return;
                    }
                }
            }
            useList = useList.push(pkg);
            // Add toSubLPackage() package to the used-by list of pkg.
            if (pkg.usedByList != null)
                Debug.assertTrue(!pkg.usedByList.contains(toSubLPackage()));
            if (pkg.usedByList == null)
                pkg.usedByList = new ArrayList<SubLPackage>();
            pkg.usedByList.add(toSubLPackage());
        }
    }

    public void unusePackage(SubLPackage pkg)
    {
        if (useList instanceof SubLCons) {
            if (memq(pkg, useList)) {
                // FIXME Modify the original list instead of copying it!
                SubLObject newList = NIL;
                while (useList != NIL) {
                    if (useList.first() != pkg)
                        newList = newList.push(useList.first());
                    useList = useList.rest();
                }
                useList = newList.nreverse();
                Debug.assertTrue(!memq(pkg, useList));
                Debug.assertTrue(pkg.usedByList != null);
                Debug.assertTrue(pkg.usedByList.contains(toSubLPackage()));
                pkg.usedByList.remove(toSubLPackage());
            }
        }
    }

    public final void addNickname(String s)
    {
        // toSubLPackage() call will signal an error if there's a naming conflict.
        LispPackages.addNickname(toSubLPackage(), s);

        if (nicknames != null) {
            if (nicknames.contains(s))
                return; // Nothing to do.
        } else
            nicknames = new ArrayList<String>();

        nicknames.add(s);
    }

    public String getNickname()
    {
        if (nicknames != null && nicknames.size() > 0)
            return (String) nicknames.get(0);
        return null;
    }

    public SubLObject packageNicknames()
    {
        SubLObject list = NIL;
        if (nicknames != null) {
            for (int i = nicknames.size(); i-- > 0;) {
                String nickname = (String) nicknames.get(i);
                list = makeCons(makeString(nickname), list);
            }
        }
        return list;
    }

    public SubLObject getUseList()
    {
        if (useList == null)
            useList = NIL;
        return useList;
    }

    public boolean uses(SubLObject pkg)
    {
        return (useList instanceof SubLCons) && memq(pkg, useList);
    }

    public SubLObject getUsedByList()
    {
        SubLObject list = NIL;
        if (usedByList != null) {
            for (Iterator it = usedByList.iterator(); it.hasNext();) {
                SubLPackage pkg = (SubLPackage) it.next();
                list = makeCons(pkg, list);
            }
        }
        return list;
    }

    public SubLObject getShadowingSymbols()
    {
        SubLObject list = NIL;
        if (shadowingSymbolsHT != null) {
            for (Iterator it = shadowingSymbolsHT.values().iterator(); it.hasNext();) {
                SubLSymbol symbol = (SubLSymbol) it.next();
                list = makeCons(symbol, list);
            }
        }
        return list;
    }

    public synchronized List getExternalSymbols()
    {
        return externalSymbols.getSymbols();
    }

    public synchronized List<SubLSymbol> getAccessibleSymbols()
    {
        ArrayList<SubLSymbol> list = new ArrayList<SubLSymbol>();
        list.addAll(internalSymbols.getSymbols());
        list.addAll(externalSymbols.getSymbols());
        if (useList instanceof SubLCons) {
            SubLObject usedPackages = useList;
            while (usedPackages != NIL) {
                SubLPackage pkg = (SubLPackage) usedPackages.first();
                List<SubLSymbol> symbols = ((LispPackage)pkg).externalSymbols.getSymbols();
                for (int i = 0; i < symbols.size(); i++) {
                    SubLSymbol symbol = (SubLSymbol) symbols.get(i);
                    if (shadowingSymbolsHT == null || shadowingSymbolsHT.get(symbol.getJavaSymbolName()) == null)
                        list.add(symbol);
                }
                usedPackages = usedPackages.rest();
            }
        }
        return list;
    }

    public synchronized SubLObject PACKAGE_INTERNAL_SYMBOLS()
    {
        SubLObject list = NIL;
        List symbols = internalSymbols.getSymbols();
        for (int i = symbols.size(); i-- > 0;)
            list = makeCons((SubLSymbol)symbols.get(i), list);
        return list;
    }

    public synchronized SubLObject PACKAGE_EXTERNAL_SYMBOLS()
    {
        SubLObject list = NIL;
        List symbols = externalSymbols.getSymbols();
        for (int i = symbols.size(); i-- > 0;)
            list = makeCons((SubLSymbol)symbols.get(i), list);
        return list;
    }

    public synchronized SubLObject PACKAGE_INHERITED_SYMBOLS()
    {
        SubLObject list = NIL;
        if (useList instanceof SubLCons) {
            SubLObject usedPackages = useList;
            while (usedPackages != NIL) {
                SubLPackage pkg = (SubLPackage) usedPackages.first();
                List externals = pkg.getExternalSymbols();
                for (int i = externals.size(); i-- > 0;) {
                    SubLSymbol symbol = (SubLSymbol) externals.get(i);
                    final SubLString symbolName = symbol.getSubLName();
                    if (shadowingSymbolsHT != null && shadowingSymbolsHT.get(symbol.getJavaSymbolName()) != null)
                        continue;
                    if (externalSymbols.getHT(symbolName) == symbol)
                        continue;
                    list = makeCons(symbol, list);
                }
                usedPackages = usedPackages.rest();
            }
        }
        return list;
    }

    public synchronized SubLObject getSymbols()
    {
        SubLObject list = NIL;
        List internals = internalSymbols.getSymbols();
        for (int i = internals.size(); i-- > 0;)
            list = makeCons((SubLSymbol)internals.get(i), list);
        List externals = externalSymbols.getSymbols();
        for (int i = externals.size(); i-- > 0;)
            list = makeCons((SubLSymbol)externals.get(i), list);
        return list;
    }

    public synchronized SubLSymbol[] symbols()
    {
        List internals = internalSymbols.getSymbols();
        List externals = externalSymbols.getSymbols();
        SubLSymbol[] array = new SubLSymbol[internals.size() + externals.size()];
        int i = 0;
        for (Iterator it = internals.iterator(); it.hasNext();) {
            SubLSymbol symbol = (SubLSymbol) it.next();
            array[i++] = symbol;
        }
        for (Iterator it = externals.iterator(); it.hasNext();) {
            SubLSymbol symbol = (SubLSymbol) it.next();
            array[i++] = symbol;
        }
        return array;
    }

    @Override
    public String writeToString()
    {
  	  String getJavaName = getJavaName();
        if (_PRINT_FASL_.symbolValue() != NIL && getJavaName != null) {
            StringBuilder sb = new StringBuilder("#.(FIND-PACKAGE \"");
            sb.append(getJavaName);
            sb.append("\")");
            return sb.toString();
        } else
            return toString();
    }
    
    @Override
    public String toString() {
  	  String getJavaName = getJavaName();
         if (getJavaName != null) {
            StringBuilder sb = new StringBuilder("#<PACKAGE \"");
            sb.append(getJavaName);
            sb.append("\"");
            sb.append(toSubLPackage().isLocked() ? "!>" : ">");
            return sb.toString();
        } else
            return unreadableString("PACKAGE");
    }


}
