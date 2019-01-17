/*
 * Package.java
 *
 * Copyright (C) 2002-2007 Peter Graves <peter@armedbear.org>
 * $Id$
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
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 *
 * As a special exception, the copyright holders of this library give you
 * permission to link this library with independent modules to produce an
 * executable, regardless of the license terms of these independent
 * modules, and to copy and distribute the resulting executable under
 * terms of your choice, provided that you also meet, for each linked
 * independent module, the terms and conditions of the license of that
 * module.  An independent module is a module which is not derived from
 * or based on this library.  If you modify this library, you may extend
 * this exception to your version of the library, but you are not
 * obligated to do so.  If you do not wish to do so, delete this
 * exception statement from your version.
 */

package org.armedbear.lisp;

import static org.armedbear.lisp.Lisp.NIL;
import static org.armedbear.lisp.Lisp.PACKAGE_KEYWORD;
import static org.armedbear.lisp.Lisp.T;
import static org.armedbear.lisp.Lisp._PRINT_FASL_;
import static org.armedbear.lisp.Lisp.error;
import static org.armedbear.lisp.Lisp.javaString;
import static org.armedbear.lisp.Lisp.memq;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class Package extends SubLPackage implements java.io.Serializable
{
	public boolean ALLOW_INHERIT_CONFLICTS = false;
	private String name;
	private transient AbstractString lispName;

	private transient LispObject propertyList;

	/** Symbols internal to the package. */
    private transient final HashMap<String, Symbol> internalSymbols
            = new HashMap<String, Symbol>(16);
    /** Symbols exported from the package.
	 *
	 * Those symbols in this collection are not contained in the internalSymbols
	 */
    private transient final  HashMap<String, Symbol> externalSymbols
            = new  HashMap<String, Symbol>(16);

	private transient HashMap<String, Symbol> shadowingSymbols;
	private transient ArrayList<String> nicknames;
	private transient LispObject useList = null;
	private transient ArrayList<Package> usedByList = null;
	private transient ConcurrentHashMap<String, Package> localNicknames;

	// Anonymous package.
    public Package()
    {
	}

    protected Package(String name)
    {
		this.name = name;
		lispName = new SimpleString(name);
	}

    protected Package(String name, int size)
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
			StringBuilder sb = new StringBuilder("The ");
			sb.append(name);
			sb.append(" package");
			return new SimpleString(sb);
		}
		return new SimpleString("PACKAGE");
	}

    public LispObject typep(LispObject type)
    {
		if (type == Symbol.PACKAGE)
			return T;
		if (type == BuiltInClass.PACKAGE)
			return T;
		return super.typep(type);
	}

    public SubLPackage toPackage() {
    	return this;
    }


	@Override
	public String toDebugString() {
		return showShortName();
	}

	public String showShortName() {
		String list = name;
		if (nicknames != null) {
			for (int i = nicknames.size(); i-- > 0;) {
				String nickname = (String) nicknames.get(i);
                if(list!=null && nickname!=null && nickname.length()<list.length() )
                {
					list = nickname;
				}
			}
            if(list==null) return super.toString();
		}
		return list;
	}

    public final String getName()
    {
		if(Lisp.insideToString>0) return showShortName();
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

	private void makeSymbolsUninterned(Map symbolMap) {
		Symbol sym;
        for (Iterator<Symbol> it = symbolMap.values().iterator();
                it.hasNext();) {
			sym = it.next();
			if (sym.getPackageOrNil() == this) {
				sym.setPackage(NIL);
			}
		}
		symbolMap.clear();
	}

    public final synchronized boolean delete()
    {
		if (name != null) {
			if (useList instanceof Cons) {
				LispObject usedPackages = useList;
				while (usedPackages != NIL) {
					Package pkg = (Package) usedPackages.car();
					unusePackage(pkg);
					usedPackages = usedPackages.cdr();
				}
			}

			if (usedByList != null) {
				while (!usedByList.isEmpty()) {
					int was = usedByList.size();
					Package unause = usedByList.get(0);
					unause.unusePackage(this);
					int now = usedByList.size();
					if(was==now) {
						Lisp.error(new ProgramError("Not unusing package"));
					}
				}
			}

			LispObject packages = Packages.getPackagesNicknamingPackage(this);
			while (packages != NIL) {
				Package p = (Package) ((Cons) packages).car();
				packages = ((Cons) packages).cdr();
				p.removeLocalPackageNicknamesForPackage(this);
			}

			Packages.deletePackage(this);

			makeSymbolsUninterned(internalSymbols);
            makeSymbolsUninterned(externalSymbols); // also clears externalSymbols

			name = null;
			lispName = null;
			nicknames = null;

			return true;
		}
		return false;
	}

	public final synchronized void rename(String newName, LispObject newNicks)

	{
		ArrayList<String> arrayList = null;
		while (newNicks != NIL) {
			if (arrayList == null)
				arrayList = new ArrayList<String>();
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

    public Symbol findInternalSymbol(AbstractString name)
    {
		return internalSymbols.get(name.getStringValue());
	}

    public Symbol findInternalSymbol(String name)
    {
		return internalSymbols.get(name);
	}

    public Symbol findExternalSymbol(AbstractString name)
    {
		return externalSymbols.get(name.getStringValue());
	}

    public Symbol findExternalSymbol(String name)
    {
		return externalSymbols.get(name);
	}

    public Symbol findExternalSymbol(AbstractString name, int hash)
    {
		return externalSymbols.get(name.getStringValue());
	}

	// Returns null if symbol is not accessible in this package.
	public Symbol findAccessibleSymbol(AbstractString name)

	{
		return findAccessibleSymbol(name.getStringValue());
	}

	// Returns null if symbol is not accessible in this package.
	public Symbol findAccessibleSymbol(String symbolName)

	{
		// Look in external and internal symbols of this package.
		Symbol symbol = externalSymbols.get(symbolName);
		if (symbol != null)
			return symbol;
		symbol = internalSymbols.get(symbolName);
		if (symbol != null)
			return symbol;
		// Look in external symbols of used packages.
		if (useList instanceof Cons) {
			LispObject usedPackages = useList;
			while (usedPackages != NIL) {
				Package pkg = (Package) usedPackages.car();
				symbol = pkg.findExternalSymbol(symbolName);
				if (symbol != null)
					return symbol;
				usedPackages = usedPackages.cdr();
			}
		}
		// Not found.
		return null;
	}

	public LispObject findSymbol(String name)

	{
		final AbstractString s = new SimpleString(name);
		final LispThread thread = LispThread.currentThread();
		// Look in external and internal symbols of this package.
		Symbol symbol = externalSymbols.get(name);
		if (symbol != null)
			return thread.setValues(symbol, Keyword.EXTERNAL);
		symbol = internalSymbols.get(name);
		if (symbol != null)
			return thread.setValues(symbol, Keyword.INTERNAL);
		// Look in external symbols of used packages.
		if (useList instanceof Cons) {
			LispObject usedPackages = useList;
			while (usedPackages != NIL) {
				Package pkg = (Package) usedPackages.car();
				symbol = pkg.findExternalSymbol(s);
				if (symbol != null)
					return thread.setValues(symbol, Keyword.INHERITED);
				usedPackages = usedPackages.cdr();
			}
		}
		// Not found.
		return thread.setValues(NIL, NIL);
	}

	public Cons findSymbolType(String name)

	{
		// Look in external and internal symbols of this package.
		Symbol symbol = externalSymbols.get(name);
		if (symbol != null)
			return new Cons(symbol, Keyword.EXTERNAL);
		symbol = internalSymbols.get(name);
		if (symbol != null)
			return new Cons(symbol, Keyword.INTERNAL);
		// Look in external symbols of used packages.
		if (useList instanceof Cons) {
			LispObject usedPackages = useList;
			while (usedPackages != NIL) {
				Package pkg = (Package) usedPackages.car();
				symbol = pkg.findExternalSymbol(name);
				if (symbol != null)
					return new Cons(symbol, pkg);
				usedPackages = usedPackages.cdr();
			}
		}
		// Not found.
		return null;
	}


	// Helper function to add T and NIL to PACKAGE_CL.
    public void addSymbol(Symbol symbol)
    {
		//Debug.assertTrue(symbol.getPackageOrNil() == this);
		final String symbolName = symbol.getName();
		//Debug.assertTrue(symbolName.equals("NIL") || symbolName.equals("T"));
		externalSymbols.put(symbolName, symbol);
	}

    private Symbol addSymbol(String name)
    {
		Symbol symbol = new Symbol(name, this);
		if (this == PACKAGE_KEYWORD) {
			symbol.initializeConstant(symbol);
			externalSymbols.put(name, symbol);
		} else
			internalSymbols.put(name, symbol);

		return symbol;
	}

    private Symbol addSymbol(AbstractString name)
    {
		return addSymbol(name.getStringValue());
	}

    public Symbol addInternalSymbol(String symbolName)
    {
		final Symbol symbol = new Symbol(symbolName, this);
		internalSymbols.put(symbolName, symbol);
		return symbol;
	}

    public Symbol addExternalSymbol(String symbolName)
    {
		final Symbol symbol = new Symbol(symbolName, this);
		externalSymbols.put(symbolName, symbol);
		return symbol;
	}

    public synchronized Symbol intern(AbstractString symbolName)
    {
		return intern(symbolName.getStringValue());
	}

    public synchronized Symbol intern(String symbolName)
    {
		// Look in external and internal symbols of this package.
		Symbol symbol = externalSymbols.get(symbolName);
		if (symbol != null)
			return symbol;
		symbol = internalSymbols.get(symbolName);
		if (symbol != null)
			return symbol;
		// Look in external symbols of used packages.
		if (useList instanceof Cons) {
			LispObject usedPackages = useList;
			while (usedPackages != NIL) {
				Package pkg = (Package) usedPackages.car();
				symbol = pkg.externalSymbols.get(symbolName);
				if (symbol != null)
					return symbol;
				usedPackages = usedPackages.cdr();
			}
		}
		// Not found.
		return addSymbol(symbolName);
	}

    public synchronized Symbol intern(final AbstractString s,
                                      final LispThread thread)
    {
		String symbolName = s.getStringValue();
		// Look in external and internal symbols of this package.
		Symbol symbol = externalSymbols.get(symbolName);
		if (symbol != null)
			return (Symbol) thread.setValues(symbol, Keyword.EXTERNAL);
		symbol = internalSymbols.get(symbolName);
		if (symbol != null)
			return (Symbol) thread.setValues(symbol, Keyword.INTERNAL);
		// Look in external symbols of used packages.
		if (useList instanceof Cons) {
			LispObject usedPackages = useList;
			while (usedPackages != NIL) {
				Package pkg = (Package) usedPackages.car();
				symbol = pkg.findExternalSymbol(symbolName);
				if (symbol != null)
					return (Symbol) thread.setValues(symbol, Keyword.INHERITED);
				usedPackages = usedPackages.cdr();
			}
		}
		// Not found.
		return (Symbol) thread.setValues(addSymbol(symbolName), NIL);
	}

	public synchronized Symbol internAndExport(String symbolName)

	{
		synchronized (this) {
		// Look in external and internal symbols of this package.
		Symbol symbol = externalSymbols.get(symbolName);
		if (symbol != null)
			return symbol;
		symbol = internalSymbols.get(symbolName);
		if (symbol != null) {
			export(symbol);
			return symbol;
		}
		final AbstractString s = new SimpleString(symbolName);
		if (useList instanceof Cons) {
			// Look in external symbols of used packages.
			LispObject usedPackages = useList;
			while (usedPackages != NIL) {
				Package pkg = (Package) usedPackages.car();
				symbol = pkg.findExternalSymbol(s);
				if (symbol != null) {
					export(symbol);
					return symbol;
				}
				usedPackages = usedPackages.cdr();
			}
		}
		// Not found.
		symbol = new Symbol(s, this);
		if (this == PACKAGE_KEYWORD)
			symbol.initializeConstant(symbol);
		externalSymbols.put(symbolName, symbol);
		return symbol;
	}
	}

	/**





(intern "FOO" (or (find-package "TEST1")  (make-package "TEST1" ))) (let ((sym  (find-symbol "FOO" :test1))) (unintern sym :test1) (symbol-package  sym ) )



(find-symbol "FOO")
(find-symbol "FOO" :test1)



	 */
	public synchronized LispObject unintern(final Symbol symbol)

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
					Symbol s = pkg.findExternalSymbol(symbolName);
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
							return packageError((sb.toString()));
						}
					}
					usedPackages = usedPackages.cdr();
				}
			}
		}
		// Reaching here, it's OK to remove the symbol.
		boolean found = false;
		if (externalSymbols.get(symbolName) == symbol) {
			externalSymbols.remove(symbolName);
			found = true;
		}
		if (internalSymbols.get(symbolName) == symbol) {
			internalSymbols.remove(symbolName);
			found = true;
		}
		if (!found)
			return NIL;

		if (shadow) {
			Debug.assertTrue(shadowingSymbols != null);
			shadowingSymbols.remove(symbolName);
		}
		if (symbol.getPackageOrNil() == this)
		{	symbol.setPackage(NIL);
			symbol.setDisownedby(this);
		}
		return T;
	}


	private LispObject packageError(String err)
	{
		LispObject ret = new PackageError(err);
		if(!Lisp.cold && Lisp.initialized)  {
			error(ret);
		} else {
		   System.err.println(err);
		}
		return ret;
	}

	public void importSymbol(SubLObject symbol) {
		importSymbol((Symbol)symbol.toSymbol());
	}

    public synchronized void importSymbol(Symbol symbol)
    {
		if (symbol.getPackageOrNil() == this)
			return; // Nothing to do.
		final String symbolName = symbol.getName();
		Symbol sym = findAccessibleSymbol(symbolName);
		if (sym != null && sym != symbol) {
			StringBuilder sb = new StringBuilder("The symbol ");
			sb.append(sym.getQualifiedName());
			sb.append(" is already accessible in package ");
			sb.append(name);
			sb.append('.');
			packageError(sb.toString());
			return;

		}
		internalSymbols.put(symbolName, symbol);
		if (symbol.getPackageOrNil() == NIL)
			symbol.setPackage(this);
	}

    public synchronized void export(final Symbol symbol)
    {
		final String symbolName = symbol.getName();
		Symbol sym = null;
		boolean added = false;
		if (symbol.getPackageOrNil() != this) {
			sym = findAccessibleSymbol(symbolName);
			if (sym != symbol && sym != null) {
				StringBuilder sb = new StringBuilder("The symbol ");
				sb.append(symbol.getQualifiedName());
				sb.append(" is not accessible in package ");
				sb.append(name);
				sb.append('.');
				packageError(sb.toString());
				return;
			}
			internalSymbols.put(symbolName, symbol);
			added = true;
		}
		sym = internalSymbols.get(symbolName);
		if (added || sym == symbol) {
			if (usedByList != null) {
				for (Iterator it = usedByList.iterator(); it.hasNext();) {
					Package pkg = (Package) it.next();
					sym = pkg.findAccessibleSymbol(symbolName);
					if (sym != null && sym != symbol) {
                        if (pkg.shadowingSymbols != null &&
                            pkg.shadowingSymbols.get(symbolName) == sym) {
							// OK.
						} else {
							StringBuilder sb = new StringBuilder("The symbol ");
							sb.append(sym.toDebugString());
							sb.append(" is already accessible in package ");
							sb.append(pkg.getName());
							sb.append('.');
							if(!pkg.ALLOW_INHERIT_CONFLICTS && !Main.isSubLisp()) {
								packageError(sb.toString());
							return;
							} else {

							}
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
		StringBuilder sb = new StringBuilder("The symbol ");
		sb.append(symbol.getQualifiedName());
		sb.append(" is not accessible in package ");
		sb.append(name);
		sb.append('.');
		packageError(sb.toString());
	}

	public synchronized void unexport(final Symbol symbol)

	{
		final String symbolName = symbol.getName();
		if (externalSymbols.get(symbolName) == symbol) {
			externalSymbols.remove(symbolName);
			internalSymbols.put(symbolName, symbol);
		} else if (findAccessibleSymbol(symbolName) != symbol) {
			StringBuilder sb = new StringBuilder("The symbol ");
			sb.append(symbol.getQualifiedName());
			sb.append(" is not accessible in package ");
			sb.append(name);
			packageError(sb.toString());
		}
	}

	public synchronized void shadow(final String symbolName)

	{
		if (shadowingSymbols == null)
			shadowingSymbols = new HashMap<String, Symbol>();
		// final AbstractString s = new SimpleString(symbolName);
		Symbol symbol = externalSymbols.get(symbolName);
		if (symbol != null) {
			shadowingSymbols.put(symbolName, symbol);
			return;
		}
		symbol = internalSymbols.get(symbolName);
		if (symbol != null) {
			shadowingSymbols.put(symbolName, symbol);
			return;
		}
		if (shadowingSymbols.get(symbolName) != null)
			return;
		symbol = new Symbol(symbolName, this);
		internalSymbols.put(symbolName, symbol);
		shadowingSymbols.put(symbolName, symbol);
	}

    public synchronized void shadowingImport(Symbol symbol)
    {
		final String symbolName = symbol.getName();
		Symbol existing = externalSymbols.get(symbolName);
		if (existing == null)
			existing = internalSymbols.get(symbolName);

		// if a different symbol with the same name is accessible,
		// [..] which implies that it must be uninterned if it was present
		if (existing != null && existing != symbol) {
			if (shadowingSymbols != null)
				shadowingSymbols.remove(symbolName);
			unintern(existing);
		}

		if (existing == null || existing != symbol) {
			// there was no symbol, or we just unintered it another one
			// intern the new one
			internalSymbols.put(symbolName, symbol);
		}

		if (shadowingSymbols == null)
			shadowingSymbols = new HashMap<String, Symbol>();
		shadowingSymbols.put(symbolName, symbol);
	}

	// "USE-PACKAGE causes PACKAGE to inherit all the external symbols of
	// PACKAGES-TO-USE. The inherited symbols become accessible as internal
	// symbols of PACKAGE."
	public void usePackage(Package pkg) {
		usePackage(pkg, false);
	}

	public void usePackage(Package pkg, boolean ignoreErrors)
	{
		if(pkg==this) return;
		if (useList == null)
			useList = NIL;
		if (!memq(pkg, useList)) {
			// "USE-PACKAGE checks for name conflicts between the newly
			// imported symbols and those already accessible in package."
			Collection symbols = pkg.getExternalSymbols();
			for (Iterator<Symbol> i = symbols.iterator(); i.hasNext();) {
				Symbol symbol = i.next();
				final String symbolName = symbol.getName();
				Symbol existing = findAccessibleSymbol(symbolName);
				if (existing != null && existing != symbol) {
					if (shadowingSymbols == null || shadowingSymbols.get(symbolName) == null) {
						if(ignoreErrors) {
							if (existing.getPackage()==this) {
								System.err.println("Local Symbol " + existing +  " will trump "+ symbol + " in pkg " + name + ".");
							} else {
								System.err.println("External Symbol " + symbol +  " will trump "+ existing + " in pkg " + name + ".");
							}
						} else {
							packageError(
								"A symbol named " + existing +  " and wont be replaced by "+ symbol + " in pkg " + name + ".");
						return;
					}
				}
			}
			}
			useList = useList.push(pkg);
			// Add this package to the used-by list of pkg.
		//if (pkg.usedByList != null) Debug.assertTrue(!pkg.usedByList.contains(this));
			if (pkg.usedByList == null)
				pkg.usedByList = new ArrayList<Package>();
			pkg.usedByList.add(this);
			} else {
			//useList = useList.push(pkg);
		}
	}

	public LispObject importPackage(Package pkg, boolean forceReplacemetn)
	{

			if (useList == null) useList = NIL;
			if(false && (!memq(pkg, useList))) {
				useList = useList.push(pkg);
				// Add this package to the used-by list of pkg.
				//if (pkg.usedByList != null) Debug.assertTrue(!pkg.usedByList.contains(this));
				if (pkg.usedByList == null)
					pkg.usedByList = new ArrayList<Package>();
				pkg.usedByList.add(this);
			}

			// "USE-PACKAGE checks for name conflicts between the newly
			// imported symbols and those already accessible in package."
			Collection symbols = pkg.getAccessibleSymbolWithTypes();
			for (Iterator<Cons> i = symbols.iterator(); i.hasNext();) {
				Cons symbol = i.next();
				importSymbolMaybe(symbol,forceReplacemetn);
			}
			if(forceReplacemetn) usePackage(pkg, true);
			return T;
	}

	public boolean importSymbolMaybe(Cons symbolInfo, boolean forceReplacemetn) {
		Symbol symbol = symbolInfo.car().toSymbol().toLispObject();
		final String symbolName = symbol.getName();
		LispObject isWhy = symbolInfo.cdr();
		int symbolSize = symbol.attributeSize();
		boolean isExternal = isWhy == Keyword.EXTERNAL;
		boolean isImported = isWhy instanceof Package;
		String symbolM = (isExternal ? "EXTERNAL " : isImported ? "INHERITED " : "INTERNAL ") + symbol.toDebugString() + "("+symbolSize+")";
		Cons existingType = findSymbolType(symbolName);
		if (existingType == null) {
			if (isExternal) {
				//System.err.println(
				//		"RE-EXPORTING " + symbolM + " into pkg " + name + ".");
				importSymbol(symbol);
				export(symbol);
			} else {
				System.err.println(
						"IMPORTING " + symbolM + " into pkg " + name + ".");
				importSymbol(symbol);
			}
			return true;
		}
		Symbol existing = existingType.car().toSymbol().toLispObject();
		int existingSize = existing.attributeSize();
		LispObject wasWhy = existingType.cdr();
		boolean wasExternal = wasWhy == Keyword.EXTERNAL;
		boolean wasInherited = wasWhy instanceof Package;
		String existingM = (wasExternal ? "EXTERNAL " : wasInherited ? "INHERITED " : "INTERNAL ") + existing.toDebugString()+ "("+existingSize+")";
		if (existing == symbol) {
			if(wasInherited && isImported) {
				//System.err.println("IGNORING already inherited symbol " + existingM + " in pkg " + name + ".");
				return false;
			}
			if(wasInherited) {
				System.err.println(
						"IMPORT-INHERITED symbol " + existingM + " into pkg " + name + ".");
				importSymbol(symbol);
				return true;
			}
			return false;
		}
		// different symbols
  // to make CYC packege more robust .. (cl:import-package :sl :cyc) (cl:import-package :cl-user :cyc) (cl:import-package :cl :cyc)
 // to make CYC packege more robust  (cl:import-package :cyc :cl-user)
		if (existingSize == 0 && symbolSize==0) {
			System.err.println(
					"LAME " + symbolM + " because we have " + existingM + " in pkg " + name + ".");
			if(forceReplacemetn) {
				System.err.println(
						"SWAPPING " + symbolM + " (WILL replace " + existingM + " ) in pkg " + name + ".");
				shadowingImport(symbol);
				shadowingImport(existing);
				shadowingImport(symbol);
				return true;
			}
			return false;
		}
		if (existingSize > 0 && symbolSize==0) {
			if(forceReplacemetn) {
				System.err.println(
						"BAD " + symbolM + " (BUT WONT replace " + existingM + " ) in pkg " + name + ".");
				shadowingImport(symbol);
				shadowingImport(existing);
				importSymbol(existing);
				return true;
			}
			System.err.println(
					"SKIPPING " + symbolM + " because we have BETTER " + existingM + " in pkg " + name + ".");
			return false;
		}

		if (existingSize == 0) {
			if(wasInherited) {
				System.err.println(
						"IMPROVE " + symbolM + " (HIDES " + existingM + ") in pkg " + name + ".");
				shadowingImport(symbol);
				return true;
			} else {
				System.err.println(
						"BETTER " + symbolM + " (SHADOW " + existingM + ") in pkg " + name + ".");
				shadowingImport(symbol);
				if (isExternal || wasExternal) export(symbol);
				return true;
			}
		}
		if(forceReplacemetn) {
			System.err.println(
					"FORCED " + existingM + " (WILL NOT be replaced by " + symbolM + " ) in pkg " + name + ".");
			shadowingImport(symbol);
			if(wasExternal) export(symbol);
		}
		System.err.println(
				"KEEPING " + existingM + " (WILL NOT be replaced by " + symbolM + " ) in pkg " + name + ".");
		return false;
	}



	public void unusePackage(Package pkg)
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
			}
		}
		pkg.usedByList.remove(this);
	}

    public final void addNickname(String s)
    {
		// This call will signal an error if there's a naming conflict.
		Packages.addNickname(this, s);

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

    public boolean uses(LispObject pkg)
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

  public LispObject getLocalPackageNicknames()
  {
		LispObject list = NIL;
		if (localNicknames != null) {
			for (Map.Entry<String, Package> entry : localNicknames.entrySet()) {
				list = new Cons(new Cons(entry.getKey(), entry.getValue()), list);
			}
		}
		return list;
	}

  public LispObject addLocalPackageNickname(String name, Package pack)
  {
		if (localNicknames == null) {
			localNicknames = new ConcurrentHashMap<String, Package>();
		}
		if (localNicknames.containsKey(name)) {
			if (localNicknames.get(name) != pack) {
        return error(new LispError(name + " is already a nickname for "
                                   + pack.getName()));
			} else {
				// nothing to do
				return this;
			}
		} else {
			localNicknames.put(name, pack);
			return this;
		}
	}

  public LispObject removeLocalPackageNickname(String name)
  {
		if (localNicknames == null || !localNicknames.containsKey(name)) {
			return NIL;
		} else {
			// return generalized boolean: package that was nicknamed to `name'
			return localNicknames.remove(name);
		}
	}

  public void removeLocalPackageNicknamesForPackage(Package p)
  {
		if (localNicknames == null || !localNicknames.containsValue(p)) {
			return;
		} else {
			for (Map.Entry<String, Package> entry : localNicknames.entrySet()) {
				if (entry.getValue() == p) {
					localNicknames.remove(entry.getKey());
				}
			}
		}
	}

  public Collection<Package> getLocallyNicknamedPackages()
  {
		// for implementing package-locally-nicknamed-by-list
    if (localNicknames == null) return new ArrayList<Package>();
    else return localNicknames.values();
	}

	// Find package named `name', taking local nicknames into account
  public Package findPackage(String name)
  {
		if (localNicknames != null) {
			Package pkg = localNicknames.get(name);
      if (pkg != null) return (Package) pkg;
		}
		return Packages.findPackageGlobally(name);
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

    public synchronized Collection getExternalSymbols()
    {
		return externalSymbols.values();
	}

    public synchronized List<Symbol> getAccessibleSymbols()
    {
		ArrayList<Symbol> list = new ArrayList<Symbol>();
		list.addAll(internalSymbols.values());
		list.addAll(externalSymbols.values());
		if (useList instanceof Cons) {
			LispObject usedPackages = useList;
			while (usedPackages != NIL) {
				Package pkg = (Package) usedPackages.car();
				list.addAll(pkg.externalSymbols.values());

				usedPackages = usedPackages.cdr();
			}
		}
		return list;
	}
	public  List<Cons> getAccessibleSymbolWithTypes() {
		ArrayList<Cons> list = new ArrayList<Cons>();
		for(Symbol symbol: externalSymbols.values()){
			list.add(new Cons(symbol,Keyword.EXTERNAL));
		}
		for(Symbol symbol: internalSymbols.values()){
			list.add(new Cons(symbol,Keyword.INTERNAL));
		}
		if (useList instanceof Cons) {
			LispObject usedPackages = useList;
			while (usedPackages != NIL) {
				Package pkg = (Package) usedPackages.car();
				for(Symbol symbol: pkg.externalSymbols.values()){
					list.add(new Cons(symbol,pkg));
				}
				usedPackages = usedPackages.cdr();
			}
		}
		return list;
	}

    public synchronized LispObject PACKAGE_INTERNAL_SYMBOLS()
    {
		LispObject list = NIL;
		Collection symbols = internalSymbols.values();
		for (Iterator<Symbol> i = symbols.iterator(); i.hasNext();)
			list = new Cons(i.next(), list);
		return list;
	}

    public synchronized LispObject PACKAGE_EXTERNAL_SYMBOLS()
    {
		LispObject list = NIL;
		Collection symbols = externalSymbols.values();
		for (Iterator<Symbol> i = symbols.iterator(); i.hasNext();)
			list = new Cons(i.next(), list);
		return list;
	}

    public synchronized LispObject PACKAGE_INHERITED_SYMBOLS()
    {
		LispObject list = NIL;
		if (useList instanceof Cons) {
			LispObject usedPackages = useList;
			while (usedPackages != NIL) {
				Package pkg = (Package) usedPackages.car();
				Collection externals = pkg.getExternalSymbols();
				for (Iterator<Symbol> i = externals.iterator(); i.hasNext();) {
					Symbol symbol = i.next();
					final String symbolName = symbol.getName();
					if (shadowingSymbols != null && shadowingSymbols.get(symbolName) != null)
						continue;
					if (externalSymbols.get(symbolName) == symbol)
						continue;
					list = new Cons(symbol, list);
				}
				usedPackages = usedPackages.cdr();
			}
		}
		return list;
	}

    public synchronized LispObject getSymbols()
    {
		LispObject list = NIL;
		Collection internals = internalSymbols.values();
		for (Iterator<Symbol> i = internals.iterator(); i.hasNext();)
			list = new Cons(i.next(), list);
		Collection externals = externalSymbols.values();
		for (Iterator<Symbol> i = externals.iterator(); i.hasNext();)
			list = new Cons(i.next(), list);
		return list;
		}

    public synchronized Symbol[] symbols()
    {
		return (Symbol[]) getLocalSymbols().toArray();
	}

    public String printObject()
    {
    	boolean printReadable = Lisp.initialized && (_PRINT_FASL_.symbolValue() != NIL|| Lisp.isPrintReadable(null)) && name != null;
		if (printReadable) {
			StringBuilder sb = new StringBuilder("#.(CL:FIND-PACKAGE \"");
			sb.append(name);
			sb.append("\")");
			return sb.toString();
		} else {
			if (name != null) {
				return unreadableString("PACKAGE " + name, false);
			} else
				return unreadableString("PACKAGE");
		}
	}

	public Object readResolve() throws java.io.ObjectStreamException {
		Package pkg = findPackage(name);
		if (pkg != null) {
			return pkg;
		} else {
			return packageError(name + " is not the name of a package.");
		}
	}

	public boolean isExported(SubLSymbol symbol) {
		final String symbolName = symbol.getName();
		/// if(true) return externalSymbols.containsKey(symbolName);
		Object sym = externalSymbols.get(symbolName);
		return sym == symbol;
	}

	public LispObject unintern(SubLSymbol symbol) {
		return unintern(symbol.toLispObject());
	}

	public Set getLocalSymbols() {
		synchronized(this) {
		Set set = new HashSet();
		set.addAll(internalSymbols.values());
		set.addAll(externalSymbols.values());
		return set;
		}
	}

	public Symbol internAndExport(SubLString symbolName, boolean updatePackage) {
		Symbol symbol = internAndExport(symbolName.getStringValue());

		return symbol;
	}

	public SubLObject getNickNames() {
		return SubLObjectFactory.makeCons(nicknames);
	}

	public SubLString getNameAsSubLString() {
		return lispName.toStr();
	}
}
