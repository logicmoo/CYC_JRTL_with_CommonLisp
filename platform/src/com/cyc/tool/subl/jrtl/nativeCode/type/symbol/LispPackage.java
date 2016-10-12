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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.AbstractLispObject;
import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.BuiltInClass;
import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Debug;
import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Keyword;
import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Lisp;
import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispPackages;
import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispSymbolImpl;
import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispThread;
import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.PackageError;
import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SymbolHashTable;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;

public abstract class LispPackage extends AbstractLispObject {
	protected SubLObject propertyList;

	protected SymbolHashTable internalSymbols = new SymbolHashTable(16);

	protected SymbolHashTable externalSymbols = new SymbolHashTable(16);
	protected HashMap<String, SubLSymbol> shadowingSymbolsHT;

	protected ArrayList<String> nicknames;
	protected SubLObject usesPackagesList = null;
	protected ArrayList<SubLObject> usedByPackagesList = new ArrayList<SubLObject>();
	protected String javaName;

	protected SubLString name;

	public synchronized SubLSymbol addExternalSymbol(String symbolName) {
		SubLSymbol symbol = new LispSymbolImpl(symbolName, this.toSubLPackage());
		this.externalSymbols.putHT(symbol);
		return symbol;
	}

	public synchronized SubLSymbol addInternalSymbol(String symbolName) {
		SubLSymbol symbol = new LispSymbolImpl(symbolName, this.toSubLPackage());
		this.internalSymbols.putHT(symbol);
		return symbol;
	}

	public void addNickname(String s) {
		// toSubLPackage() call will signal an error if there's a naming
		// conflict.
		LispPackages.addNickname(this.toSubLPackage(), s);

		if (this.nicknames != null) {
			if (this.nicknames.contains(s))
				return; // Nothing to do.
		} else
			this.nicknames = new ArrayList<String>();

		this.nicknames.add(s);
	}

	private synchronized SubLSymbol addSymbol(SubLString name, int hash) {
		SubLSymbol symbol = new LispSymbolImpl(name, hash, this.toSubLPackage());
		if (this.toSubLPackage() == Lisp.PACKAGE_KEYWORD) {
			symbol.initializeConstant(symbol);
			this.externalSymbols.putHT(name, symbol);
		} else
			this.internalSymbols.putHT(name, symbol);

		return symbol;
	}

	// Helper function to add NIL to PACKAGE_CL.
	public synchronized void addSymbol(SubLSymbol symbol) {
		Debug.assertTrue(symbol.getLispPackage() == this.toSubLPackage());
		Debug.assertTrue(symbol.getJavaSymbolName().equals("NIL"));
		this.externalSymbols.putHT(symbol.getSubLName(), symbol);
	}

	public SubLObject classOf() {
		return BuiltInClass.PACKAGE;
	}

	public synchronized boolean delete() {
		if (this.getJavaName() != null) {
			LispPackages.deletePackage(this.toSubLPackage());
			List internals = this.internalSymbols.getSymbols();
			for (int i = internals.size(); i-- > 0;) {
				SubLSymbol symbol = (SubLSymbol) internals.get(i);
				if (symbol.getLispPackage() == this.toSubLPackage())
					symbol.setLispPackage(Lisp.NIL);
				this.internalSymbols.removeHT(symbol);
			}
			List externals = this.externalSymbols.getSymbols();
			for (int i = externals.size(); i-- > 0;) {
				SubLSymbol symbol = (SubLSymbol) externals.get(i);
				if (symbol.getLispPackage() == this.toSubLPackage())
					symbol.setLispPackage(Lisp.NIL);
				this.externalSymbols.removeHT(symbol);
			}
			this.toPackage().setJavaName(null);
			this.name = null;
			this.nicknames = null;
			return true;
		}
		return false;
	}

	public synchronized void export(SubLSymbol symbol) {
		SubLString symbolName = symbol.getSubLName();
		boolean added = false;
		if (symbol.getLispPackage() != this.toSubLPackage()) {
			SubLSymbol sym = this.findAccessibleSymbol(symbolName);
			if (sym != symbol) {
				StringBuilder sb = new StringBuilder("The symbol ");
				sb.append(symbol.getQualifiedName());
				sb.append(" is not accessible in package ");
				sb.append(this.getJavaName());
				sb.append('.');
				Lisp.error(new PackageError(sb.toString()));
				return;
			}
			this.internalSymbols.putHT(symbolName, symbol);
			added = true;
		}
		if (added || this.internalSymbols.getHT(symbolName) == symbol) {
			if (this.usedByPackagesList != null)
				for (Iterator it = this.usedByPackagesList.iterator(); it.hasNext();) {
					SubLPackage pkg = (SubLPackage) it.next();
					SubLSymbol sym = pkg.findAccessibleSymbol(symbolName);
					if (sym != null && sym != symbol)
						if (pkg.shadowingSymbolsHT != null
								&& pkg.shadowingSymbolsHT.get(symbolName.getString()) == sym) {
							// OK.
						} else {
							StringBuilder sb = new StringBuilder("The symbol ");
							sb.append(sym.getQualifiedName());
							sb.append(" is already accessible in package ");
							sb.append(pkg.getJavaName());
							sb.append('.');
							Lisp.error(new PackageError(sb.toString()));
							return;
						}
				}
			// No conflicts.
			this.internalSymbols.removeHT(symbolName);
			this.externalSymbols.putHT(symbolName, symbol);
			return;
		}
		if (this.externalSymbols.getHT(symbolName) == symbol)
			// Symbol is already exported; there's nothing to do.
			return;
		StringBuilder sb = new StringBuilder("The symbol ");
		sb.append(symbol.getQualifiedName());
		sb.append(" is not accessible in package ");
		sb.append(this.getJavaName());
		sb.append('.');
		Lisp.error(new PackageError(sb.toString()));
	}

	// Returns null if symbol is not accessible in toSubLPackage() package.
	public synchronized SubLSymbol findAccessibleSymbol(String name)

	{
		return this.findAccessibleSymbol(LispObjectFactory.makeString(name));
	}

	// Returns null if symbol is not accessible in toSubLPackage() package.
	public synchronized SubLSymbol findAccessibleSymbol(SubLString name)

	{
		// Look in external and internal symbols of toSubLPackage() package.
		SubLSymbol symbol = this.externalSymbols.getHT(name);
		if (symbol != null)
			return symbol;
		symbol = this.internalSymbols.getHT(name);
		if (symbol != null)
			return symbol;
		// Look in external symbols of used packages.
		if (this.usesPackagesList instanceof SubLCons) {
			SubLObject usedPackages = this.usesPackagesList;
			while (usedPackages instanceof SubLCons) {
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

	public synchronized SubLSymbol findExternalSymbol(SubLString name) {
		return this.externalSymbols.getHT(name);
	}

	public synchronized SubLSymbol findExternalSymbol(SubLString name, int hash) {
		return this.externalSymbols.getHT(name, hash);
	}

	public synchronized SubLSymbol findInternalSymbol(SubLString name) {
		return this.internalSymbols.getHT(name);
	}

	public synchronized SubLObject findSymbol(String name)

	{
		SubLString s = LispObjectFactory.makeString(name);
		LispThread thread = LispThread.currentThread();
		// Look in external and internal symbols of toSubLPackage() package.
		SubLSymbol symbol = this.externalSymbols.getHT(s);
		if (symbol != null)
			return thread.setValues(symbol, Keyword.EXTERNAL);
		symbol = this.internalSymbols.getHT(s);
		if (symbol != null)
			return thread.setValues(symbol, Keyword.INTERNAL);
		// Look in external symbols of used packages.
		if (this.usesPackagesList instanceof SubLCons) {
			SubLObject usedPackages = this.usesPackagesList;
			while (usedPackages instanceof SubLCons) {
				SubLPackage pkg = (SubLPackage) usedPackages.first();
				symbol = pkg.findExternalSymbol(s);
				if (symbol != null)
					return thread.setValues(symbol, Keyword.INHERITED);
				usedPackages = usedPackages.rest();
			}
		}
		// Not found.
		return thread.setValues(Lisp.NIL, Lisp.NIL);
	}

	public synchronized List<SubLSymbol> getAccessibleSymbols() {
		ArrayList<SubLSymbol> list = new ArrayList<SubLSymbol>();
		list.addAll(this.internalSymbols.getSymbols());
		list.addAll(this.externalSymbols.getSymbols());
		if (this.usesPackagesList instanceof SubLCons) {
			SubLObject usedPackages = this.usesPackagesList;
			while (usedPackages instanceof SubLCons) {
				SubLPackage pkg = (SubLPackage) usedPackages.first();
				List<SubLSymbol> symbols = ((LispPackage) pkg).externalSymbols.getSymbols();
				for (int i = 0; i < symbols.size(); i++) {
					SubLSymbol symbol = symbols.get(i);
					if (this.shadowingSymbolsHT == null
							|| this.shadowingSymbolsHT.get(symbol.getJavaSymbolName()) == null)
						list.add(symbol);
				}
				usedPackages = usedPackages.rest();
			}
		}
		return list;
	}

	public SubLObject getDescription() {
		if (this.getJavaName() != null) {
			StringBuilder sb = new StringBuilder("The ");
			sb.append(this.getJavaName());
			sb.append(" package");
			return LispObjectFactory.makeString(sb);
		}
		return LispObjectFactory.makeString("PACKAGE");
	}

	public synchronized List getExternalSymbols() {
		return this.externalSymbols.getSymbols();
	}

	public String getJavaName() {
		return this.javaName;
	}

	public String getNickname() {
		if (this.nicknames != null && this.nicknames.size() > 0)
			return this.nicknames.get(0);
		return null;
	}

	public List getNicknames() {
		return this.nicknames;
	}

	public SubLObject getPropertyList() {
		if (this.propertyList == null)
			this.propertyList = Lisp.NIL;
		return this.propertyList;
	}

	public SubLObject getShadowingSymbols() {
		SubLObject list = Lisp.NIL;
		if (this.shadowingSymbolsHT != null)
			for (Iterator it = this.shadowingSymbolsHT.values().iterator(); it.hasNext();) {
				SubLSymbol symbol = (SubLSymbol) it.next();
				list = LispObjectFactory.makeCons(symbol, list);
			}
		return list;
	}

	public synchronized SubLObject getSymbols() {
		SubLObject list = Lisp.NIL;
		List internals = this.internalSymbols.getSymbols();
		for (int i = internals.size(); i-- > 0;)
			list = LispObjectFactory.makeCons((SubLSymbol) internals.get(i), list);
		List externals = this.externalSymbols.getSymbols();
		for (int i = externals.size(); i-- > 0;)
			list = LispObjectFactory.makeCons((SubLSymbol) externals.get(i), list);
		return list;
	}

	public SubLObject getUsedByList() {
		SubLObject list = Lisp.NIL;
		if (this.usedByPackagesList != null)
			for (Iterator it = this.usedByPackagesList.iterator(); it.hasNext();) {
				SubLPackage pkg = (SubLPackage) it.next();
				list = LispObjectFactory.makeCons(pkg, list);
			}
		return list;
	}

	public SubLObject getUseList() {
		if (this.usesPackagesList == null)
			this.usesPackagesList = Lisp.NIL;
		return this.usesPackagesList;
	}

	public synchronized void importSymbol(SubLSymbol symbol) {
		SubLString symbolName = symbol.getSubLName();
		if (symbol.getLispPackage() == this.toSubLPackage())
			return; // Nothing to do.
		SubLSymbol sym = this.findAccessibleSymbol(symbolName);
		if (sym != null && sym != symbol) {
			StringBuilder sb = new StringBuilder("The symbol ");
			sb.append(sym.getQualifiedName());
			sb.append(" is already accessible in package ");
			sb.append(this.getJavaName());
			sb.append('.');
			Lisp.error(new PackageError(sb.toString()));
		}
		this.internalSymbols.putHT(symbolName, symbol);
		if (symbol.getLispPackage() == Lisp.NIL)
			symbol.setLispPackage(this.toSubLPackage());
	}

	public synchronized SubLSymbol intern(String symbolName) {
		return this.intern(LispObjectFactory.makeString(symbolName));
	}

	public synchronized SubLSymbol intern(SubLString symbolName) {
		int hash = symbolName.sxhash();
		// Look in external and internal symbols of toSubLPackage() package.
		SubLSymbol symbol = this.externalSymbols.getHT(symbolName, hash);
		if (symbol != null)
			return symbol;
		symbol = this.internalSymbols.getHT(symbolName, hash);
		if (symbol != null)
			return symbol;
		// Look in external symbols of used packages.
		if (this.usesPackagesList instanceof SubLCons) {
			SubLObject usedPackages = this.usesPackagesList;
			while (usedPackages instanceof SubLCons) {
				SubLPackage pkg = (SubLPackage) usedPackages.first();
				symbol = pkg.findExternalSymbol(symbolName, hash);
				if (symbol != null)
					return symbol;
				usedPackages = usedPackages.rest();
			}
		}
		// Not found.
		return this.addSymbol(symbolName, hash);
	}

	public synchronized SubLSymbol intern(SubLString s, LispThread thread) {
		int hash = s.sxhash();
		// Look in external and internal symbols of toSubLPackage() package.
		SubLSymbol symbol = this.externalSymbols.getHT(s, hash);
		if (symbol != null)
			return (SubLSymbol) thread.setValues(symbol, Keyword.EXTERNAL);
		symbol = this.internalSymbols.getHT(s, hash);
		if (symbol != null)
			return (SubLSymbol) thread.setValues(symbol, Keyword.INTERNAL);
		// Look in external symbols of used packages.
		if (this.usesPackagesList instanceof SubLCons) {
			SubLObject usedPackages = this.usesPackagesList;
			while (usedPackages instanceof SubLCons) {
				SubLPackage pkg = (SubLPackage) usedPackages.first();
				symbol = pkg.findExternalSymbol(s, hash);
				if (symbol != null)
					return (SubLSymbol) thread.setValues(symbol, Keyword.INHERITED);
				usedPackages = usedPackages.rest();
			}
		}
		// Not found.
		return (SubLSymbol) thread.setValues(this.addSymbol(s, hash), Lisp.NIL);
	}

	public synchronized SubLSymbol internAndExport(String symbolName)

	{
		SubLString s = LispObjectFactory.makeString(symbolName);
		int hash = s.sxhash();
		// Look in external and internal symbols of toSubLPackage() package.
		SubLSymbol symbol = this.externalSymbols.getHT(s, hash);
		if (symbol != null)
			return symbol;
		symbol = this.internalSymbols.getHT(s, hash);
		if (symbol != null) {
			this.export(symbol);
			return symbol;
		}
		if (this.usesPackagesList instanceof SubLCons) {
			// Look in external symbols of used packages.
			SubLObject usedPackages = this.usesPackagesList;
			while (usedPackages instanceof SubLCons) {
				SubLPackage pkg = (SubLPackage) usedPackages.first();
				symbol = pkg.findExternalSymbol(s, hash);
				if (symbol != null) {
					this.export(symbol);
					return symbol;
				}
				usedPackages = usedPackages.rest();
			}
		}
		// Not found.
		symbol = new LispSymbolImpl(s, hash, this.toSubLPackage());
		if (this.toSubLPackage() == Lisp.PACKAGE_KEYWORD)
			symbol.initializeConstant(symbol);
		this.externalSymbols.putHT(s, symbol);
		return symbol;
	}

	public SubLObject NAME() {
		return this.name != null ? this.name : Lisp.NIL;
	}

	public synchronized SubLObject PACKAGE_EXTERNAL_SYMBOLS() {
		SubLObject list = Lisp.NIL;
		List symbols = this.externalSymbols.getSymbols();
		for (int i = symbols.size(); i-- > 0;)
			list = LispObjectFactory.makeCons((SubLSymbol) symbols.get(i), list);
		return list;
	}

	public synchronized SubLObject PACKAGE_INHERITED_SYMBOLS() {
		SubLObject list = Lisp.NIL;
		if (this.usesPackagesList instanceof SubLCons) {
			SubLObject usedPackages = this.usesPackagesList;
			while (usedPackages instanceof SubLCons) {
				SubLPackage pkg = (SubLPackage) usedPackages.first();
				List externals = pkg.getExternalSymbols();
				for (int i = externals.size(); i-- > 0;) {
					SubLSymbol symbol = (SubLSymbol) externals.get(i);
					SubLString symbolName = symbol.getSubLName();
					if (this.shadowingSymbolsHT != null
							&& this.shadowingSymbolsHT.get(symbol.getJavaSymbolName()) != null)
						continue;
					if (this.externalSymbols.getHT(symbolName) == symbol)
						continue;
					list = LispObjectFactory.makeCons(symbol, list);
				}
				usedPackages = usedPackages.rest();
			}
		}
		return list;
	}

	public synchronized SubLObject PACKAGE_INTERNAL_SYMBOLS() {
		SubLObject list = Lisp.NIL;
		List symbols = this.internalSymbols.getSymbols();
		for (int i = symbols.size(); i-- > 0;)
			list = LispObjectFactory.makeCons((SubLSymbol) symbols.get(i), list);
		return list;
	}

	public SubLObject packageNicknames() {
		SubLObject list = Lisp.NIL;
		if (this.nicknames != null)
			for (int i = this.nicknames.size(); i-- > 0;) {
				String nickname = this.nicknames.get(i);
				list = LispObjectFactory.makeCons(LispObjectFactory.makeString(nickname), list);
			}
		return list;
	}

	public synchronized void rename(String newName, SubLObject newNicks)

	{
		ArrayList<String> arrayList = null;
		while (newNicks instanceof SubLCons) {
			if (arrayList == null)
				arrayList = new ArrayList<String>();
			arrayList.add(Lisp.javaString(newNicks.first()));
			newNicks = newNicks.rest();
		}
		// Remove old name and nicknames from Packages map.
		LispPackages.deletePackage(this.toSubLPackage());
		// Now change the names...
		this.toPackage().setJavaName(newName);
		this.name = LispObjectFactory.makeString(newName);
		this.nicknames = arrayList;
		// And add the package back.
		LispPackages.addPackage(this.toSubLPackage());
	}

	public void setPropertyList(SubLObject obj) {
		if (obj == null)
			throw new NullPointerException();
		this.propertyList = obj;
	}

	public synchronized void shadow(String symbolName)

	{
		if (this.shadowingSymbolsHT == null)
			this.shadowingSymbolsHT = new HashMap<String, SubLSymbol>();
		SubLString s = LispObjectFactory.makeString(symbolName);
		SubLSymbol symbol = this.externalSymbols.getHT(s);
		if (symbol != null) {
			this.shadowingSymbolsHT.put(symbolName, symbol);
			return;
		}
		symbol = this.internalSymbols.getHT(s);
		if (symbol != null) {
			this.shadowingSymbolsHT.put(symbolName, symbol);
			return;
		}
		if (this.shadowingSymbolsHT.get(symbolName) != null)
			return;
		symbol = new LispSymbolImpl(s, this.toSubLPackage());
		this.internalSymbols.putHT(s, symbol);
		this.shadowingSymbolsHT.put(symbolName, symbol);
	}

	public synchronized void shadowingImport(SubLSymbol symbol) {
		SubLString symbolName = symbol.getSubLName();
		SubLObject where = Lisp.NIL;
		SubLSymbol sym = this.externalSymbols.getHT(symbolName);
		if (sym != null)
			where = Keyword.EXTERNAL;
		else {
			sym = this.internalSymbols.getHT(symbolName);
			if (sym != null)
				where = Keyword.INTERNAL;
			else // Look in external symbols of used packages.
			if (this.usesPackagesList instanceof SubLCons) {
				SubLObject usedPackages = this.usesPackagesList;
				while (usedPackages instanceof SubLCons) {
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
		if (sym != null)
			if (where == Keyword.INTERNAL || where == Keyword.EXTERNAL)
				if (sym != symbol) {
					if (this.shadowingSymbolsHT != null)
						this.shadowingSymbolsHT.remove(symbol.getJavaSymbolName());
					this.unintern(sym);
				}
		this.internalSymbols.putHT(symbolName, symbol);
		if (this.shadowingSymbolsHT == null)
			this.shadowingSymbolsHT = new HashMap<String, SubLSymbol>();
		Debug.assertTrue(this.shadowingSymbolsHT.get(symbolName.getString()) == null);
		this.shadowingSymbolsHT.put(symbolName.getString(), symbol);
	}

	public synchronized SubLSymbol[] symbols() {
		List internals = this.internalSymbols.getSymbols();
		List externals = this.externalSymbols.getSymbols();
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

	public String toString() {
		String getJavaName = this.getJavaName();
		if (getJavaName != null) {
			StringBuilder sb = new StringBuilder("#<PACKAGE \"");
			sb.append(getJavaName);
			sb.append("\"");
			sb.append(this.toSubLPackage().isLocked() ? "!>" : ">");
			return sb.toString();
		} else
			return this.unreadableString("PACKAGE");
	}

	private SubLPackage toSubLPackage() {
		return (SubLPackage) this;
	}

	public SubLObject typeOf() {
		return LispSymbols.PACKAGE;
	}

	public SubLObject typep(SubLObject type) {
		if (type == LispSymbols.PACKAGE)
			return Lisp.T;
		if (type == BuiltInClass.PACKAGE)
			return Lisp.T;
		return super.typep(type);
	}

	public synchronized void unexport(SubLSymbol symbol)

	{
		SubLString symbolName = symbol.getSubLName();
		if (symbol.getLispPackage() == this.toSubLPackage()) {
			if (this.externalSymbols.getHT(symbolName) == symbol) {
				this.externalSymbols.removeHT(symbolName);
				this.internalSymbols.putHT(symbolName, symbol);
			}
		} else {
			// Signal an error if symbol is not accessible.
			if (this.usesPackagesList instanceof SubLCons) {
				SubLObject usedPackages = this.usesPackagesList;
				while (usedPackages instanceof SubLCons) {
					SubLPackage pkg = (SubLPackage) usedPackages.first();
					if (pkg.findExternalSymbol(symbolName) == symbol)
						return; // OK.
					usedPackages = usedPackages.rest();
				}
			}
			StringBuilder sb = new StringBuilder("The symbol ");
			sb.append(symbol.getQualifiedName());
			sb.append(" is not accessible in package ");
			sb.append(this.getJavaName());
			Lisp.error(new PackageError(sb.toString()));
		}
	}

	public synchronized SubLObject unintern(SubLSymbol symbol)

	{
		SubLString symbolName = symbol.getSubLName();
		boolean shadow;
		if (this.shadowingSymbolsHT != null && this.shadowingSymbolsHT.get(symbolName.getString()) == symbol)
			shadow = true;
		else
			shadow = false;
		if (shadow) {
			// Check for conflicts that might be exposed in used package list
			// if we remove the shadowing symbol.
			SubLSymbol sym = null;
			if (this.usesPackagesList instanceof SubLCons) {
				SubLObject usedPackages = this.usesPackagesList;
				while (usedPackages instanceof SubLCons) {
					SubLPackage pkg = (SubLPackage) usedPackages.first();
					SubLSymbol s = pkg.findExternalSymbol(symbolName);
					if (s != null)
						if (sym == null)
							sym = s;
						else if (sym != s) {
							StringBuilder sb = new StringBuilder("Uninterning the symbol ");
							sb.append(symbol.getQualifiedName());
							sb.append(" causes a name conflict between ");
							sb.append(sym.getQualifiedName());
							sb.append(" and ");
							sb.append(s.getQualifiedName());
							return Lisp.error(new PackageError(sb.toString()));
						}
					usedPackages = usedPackages.rest();
				}
			}
		}
		// Reaching here, it's OK to remove the symbol.
		if (this.internalSymbols.getHT(symbolName) == symbol)
			this.internalSymbols.removeHT(symbolName);
		else if (this.externalSymbols.getHT(symbolName) == symbol)
			this.externalSymbols.removeHT(symbolName);
		else
			// Not found.
			return Lisp.NIL;
		if (shadow) {
			Debug.assertTrue(this.shadowingSymbolsHT != null);
			this.shadowingSymbolsHT.remove(symbolName.getString());
		}
		if (symbol.getLispPackage() == this.toSubLPackage())
			symbol.setLispPackage(Lisp.NIL);
		return Lisp.T;
	}

	public void unusePackage(SubLPackage pkg) {
		if (this.usesPackagesList instanceof SubLCons)
			if (Lisp.memq(pkg, this.usesPackagesList)) {
				// FIXME Modify the original list instead of copying it!
				SubLObject newList = Lisp.NIL;
				while (this.usesPackagesList instanceof SubLCons) {
					if (this.usesPackagesList.first() != pkg)
						newList = newList.push(this.usesPackagesList.first());
					this.usesPackagesList = this.usesPackagesList.rest();
				}
				this.usesPackagesList = newList.nreverse();
				Debug.assertTrue(!Lisp.memq(pkg, this.usesPackagesList));
				Debug.assertTrue(pkg.usedByPackagesList != null);
				Debug.assertTrue(pkg.usedByPackagesList.contains(this.toSubLPackage()));
				pkg.usedByPackagesList.remove(this.toSubLPackage());
			}
	}

	// "USE-PACKAGE causes PACKAGE to inherit all the external symbols of
	// PACKAGES-TO-USE. The inherited symbols become accessible as internal
	// symbols of PACKAGE."
	public void usePackage(SubLPackage pkg) {
		if (this.usesPackagesList == null)
			this.usesPackagesList = Lisp.NIL;
		if (!Lisp.memq(pkg, this.usesPackagesList)) {
			// "USE-PACKAGE checks for name conflicts between the newly
			// imported symbols and those already accessible in package."
			List symbols = pkg.getExternalSymbols();
			for (int i = symbols.size(); i-- > 0;) {
				SubLSymbol symbol = (SubLSymbol) symbols.get(i);
				SubLString symbolName = symbol.getSubLName();
				SubLSymbol existing = this.findAccessibleSymbol(symbolName);
				if (existing != null && existing != symbol)
					if (this.shadowingSymbolsHT == null
							|| this.shadowingSymbolsHT.get(symbol.getJavaSymbolName()) == null) {
						Lisp.error(new PackageError("A symbol named " + symbol.getJavaSymbolName()
								+ " is already accessible in package " + this.getJavaName() + "."));
						return;
					}
			}
			this.usesPackagesList = this.usesPackagesList.push(pkg);
			// Add toSubLPackage() package to the used-by list of pkg.
			if (pkg.usedByPackagesList != null)
				Debug.assertTrue(!pkg.usedByPackagesList.contains(this.toSubLPackage()));
			if (pkg.usedByPackagesList == null)
				pkg.usedByPackagesList = new ArrayList<SubLObject>();
			pkg.usedByPackagesList.add(this.toSubLPackage());
		}
	}

	public boolean uses(SubLObject pkg) {
		return this.usesPackagesList instanceof SubLCons && Lisp.memq(pkg, this.usesPackagesList);
	}

	public String writeToString() {
		String getJavaName = this.getJavaName();
		if (Lisp._PRINT_FASL_.symbolValue() != Lisp.NIL && getJavaName != null) {
			StringBuilder sb = new StringBuilder("#.(FIND-PACKAGE \"");
			sb.append(getJavaName);
			sb.append("\")");
			return sb.toString();
		} else
			return this.toString();
	}

}
