/***
 *   Copyright (c) 1995-2009 Cycorp Inc.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *  Substantial portions of this code were developed by the Cyc project
 *  and by Cycorp Inc, whose contribution is gratefully acknowledged.
*/

package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import java.util.Iterator;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCharacter;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbolFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTrampolineFile;

//// Internal Imports

//// External Imports

public class Packages extends SubLTrampolineFile {

	//// Constructors

	public static SubLFile me = new Packages();

	public static SubLSymbol $package$ = CommonSymbols.NIL;

	//// Public Area

	static {
		Packages.$package$ = SubLFiles.defvar(Packages.me, "*PACKAGE*", SubLPackage.SUBLISP_PACKAGE,
				SubLPackage.SUBLISP_PACKAGE);
	}

	public static SubLObject apropos(SubLObject nameSpec, SubLObject packageSpec, SubLObject externalOnly,
			SubLObject caseInsensitive) {
		if (externalOnly == CommonSymbols.UNPROVIDED)
			externalOnly = CommonSymbols.NIL;
		if (caseInsensitive == CommonSymbols.UNPROVIDED)
			caseInsensitive = CommonSymbols.T;
		SubLString nameTyped = nameSpec.isString() ? nameSpec.toStr() : nameSpec.toSymbol().getSubLName();
		boolean externalOnlyTyped = externalOnly != CommonSymbols.NIL;
		boolean caseInsensitiveTyped = caseInsensitive != CommonSymbols.NIL;
		if (packageSpec == CommonSymbols.UNPROVIDED) {
			SubLList packages = SubLPackage.getAllPackages();
			SubLObject result = CommonSymbols.NIL;
			for (int i = 0, size = packages.size(); i < size; i++) {
				SubLPackage thePackage = packages.get(i).toPackage();
				result = Packages.apropos_one_package(nameTyped, thePackage);
			}
			return result;
		} else {
			// get a valid usable package
			if (!packageSpec.isPackage()) {
				SubLObject realPackage = Packages.find_package(packageSpec);
				if (!realPackage.isPackage())
					Errors.error(SubLObjectFactory.makeString("~S does not designate a package."), packageSpec);
				packageSpec = realPackage;
			}
			SubLPackage thePackage = packageSpec.toPackage();
			return Packages.apropos_one_package(nameTyped, thePackage);
		}
	}

	protected static SubLObject apropos_one_package(SubLString name, SubLPackage thePackage) {
		SubLList hits = thePackage.aproposList(name);
		SubLCharacter blank = SubLObjectFactory.makeChar(' ');
		SubLString function = SubLObjectFactory.makeString("[FUNCTION]");
		SubLString unbound = SubLObjectFactory.makeString("unbound");
		for (int i = 0, size = hits.size(); i < size; i++) {
			SubLSymbol symbol = (SubLSymbol) hits.get(i);
			print_high.prin1(symbol, CommonSymbols.T);
			if (symbol.fboundp()) {
				print_high.princ(blank, CommonSymbols.T);
				print_high.princ(function, CommonSymbols.T);
			} else if (symbol.boundp()) {
				SubLObject value = symbol.getValue();
				print_high.princ(blank, CommonSymbols.T);
				print_high.princ(value, CommonSymbols.T);
			} else {
				print_high.princ(blank, CommonSymbols.T);
				print_high.princ(unbound, CommonSymbols.T);
			}
			streams_high.terpri(CommonSymbols.T);
		}
		return CommonSymbols.T;
	}

	public static SubLObject export(SubLObject symbols, SubLObject thePackage) {
		if (symbols.isSymbol())
			SubLTrampolineFile.extractPackage(thePackage).exportSymbol(symbols);
		else
			SubLTrampolineFile.extractPackage(thePackage).exportSymbols(symbols);
		return CommonSymbols.T;
	}

	public static SubLObject find_package(SubLObject packageName) {
		SubLString packageNameTyped = packageName.isString() ? packageName.toStr()
				: Strings.string(packageName).toStr();
		SubLPackage result = SubLPackage.findPackageNamed(packageNameTyped);
		if (result == null)
			return CommonSymbols.NIL;
		return result;
	}

	public static SubLObject find_symbol(SubLObject name, SubLObject packageSpec) {
		String nameTyped = name.getString();
		if (packageSpec == CommonSymbols.UNPROVIDED)
			packageSpec = SubLPackage.getCurrentPackage();
		SubLPackage thePackage = packageSpec.isPackage() ? packageSpec.toPackage()
				: Packages.find_package(packageSpec).toPackage();
		SubLSymbol result = thePackage.retrieveSymbol(nameTyped);
		if (result == null)
			return Values.values(CommonSymbols.NIL, CommonSymbols.NIL);
		return Values.values(result,
				thePackage.isExported(result) ? CommonSymbols.EXTERNAL_KEYWORD : CommonSymbols.INTERNAL_KEYWORD);
	}

	public static SubLObject in_package(SubLObject packageName) {
		SubLString packageNameTyped = packageName.isString() ? packageName.toStr()
				: Strings.string(packageName).toStr();
		return SubLPackage.setCurrentPackage(packageNameTyped);
	}

	public static SubLObject intern(SubLObject symbolSpec, SubLObject packageSpec) {
		SubLString nameTyped = symbolSpec.isString() ? symbolSpec.toStr() : symbolSpec.toSymbol().getSubLName();
		if (packageSpec == CommonSymbols.UNPROVIDED)
			packageSpec = SubLPackage.getCurrentPackage();
		SubLPackage thePackage = packageSpec.isPackage() ? packageSpec.toPackage()
				: Packages.find_package(packageSpec).toPackage();
		SubLSymbol result = SubLSymbolFactory.makeSymbol(nameTyped, thePackage);
		return Values.values(result,
				thePackage.isExported(result) ? CommonSymbols.EXTERNAL_KEYWORD : CommonSymbols.INTERNAL_KEYWORD);
	}

	public static SubLObject list_all_packages() {
		SubLList result = SubLPackage.getAllPackages();
		if (result == null)
			return CommonSymbols.NIL;
		return result;
	}

	public static SubLObject lock_package(SubLObject thePackage) {
		SubLPackage thePackageTyped = SubLTrampolineFile.extractPackage(thePackage);
		thePackageTyped.setLocked();
		return thePackageTyped;
	}

	public static SubLObject make_package(SubLObject name, SubLObject usedPackageList, SubLObject nickNames) {
		SubLString nameTyped = name.toStr();
		SubLList usedPackageListTyped = usedPackageList.toList();
		SubLList nickNamesTyped = nickNames.toList();
		SubLPackage thePackage = SubLObjectFactory.makePackage(nameTyped, usedPackageListTyped, nickNamesTyped);

		return thePackage;
	}

	public static Iterator makeSymbolIterator(SubLObject thePackage) {
		Errors.unimplementedMethod("makeSymbolIterator");
		return null;
	}

	public static SubLObject package_locked_p(SubLObject thePackage) {
		return SubLObjectFactory.makeBoolean(SubLTrampolineFile.extractPackage(thePackage).isLocked());
	}

	public static SubLObject package_name(SubLObject thePackage) {
		return SubLTrampolineFile.extractPackage(thePackage).getNameAsSubLString();
	}

	public static SubLObject package_nicknames(SubLObject thePackage) {
		return SubLTrampolineFile.extractPackage(thePackage).getNickNames();
	}

	public static SubLObject package_shadowing_symbols(SubLObject thePackage) {
		return SubLTrampolineFile.extractPackage(thePackage).getShadowingSymbols();
	}

	public static SubLObject package_use_list(SubLObject thePackage) {
		return SubLTrampolineFile.extractPackage(thePackage).getUsesPackagesList();
	}

	public static SubLObject package_used_by_list(SubLObject thePackage) {
		return SubLTrampolineFile.extractPackage(thePackage).getUsedByPackagesList();
	}

	public static SubLObject print_package(SubLObject thePackage, SubLObject stream) {
		return Errors.unimplementedMethod("print_package");
	}

	public static SubLObject sublisp_import(SubLObject symbols, SubLObject thePackage) {
		if (symbols.isSymbol())
			SubLTrampolineFile.extractPackage(thePackage).importSymbol(symbols);
		else
			SubLTrampolineFile.extractPackage(thePackage).importSymbols(symbols);
		return CommonSymbols.T;
	}

	public static boolean symbolIteratorHasNext(Iterator symbolIterator) {
		Errors.unimplementedMethod("symbolIteratorHasNext");
		return false;
	}

	// CDO-SYMBOLS helpers

	public static SubLObject symbolIteratorNext(Iterator symbolIterator) {
		Errors.unimplementedMethod("symbolIteratorNext");
		return null;
	}

	public static SubLObject unexport(SubLObject symbols, SubLObject thePackage) {
		if (symbols.isSymbol())
			SubLTrampolineFile.extractPackage(thePackage).unexportSymbol(symbols);
		else
			SubLTrampolineFile.extractPackage(thePackage).unexportSymbols(symbols);
		return CommonSymbols.T;
	}

	public static SubLObject unintern(SubLObject symbol, SubLObject packageSpec) {
		SubLSymbol symbolTyped = symbol.toSymbol();
		if (packageSpec == CommonSymbols.UNPROVIDED)
			packageSpec = SubLPackage.getCurrentPackage();
		SubLPackage thePackage = packageSpec.isPackage() ? packageSpec.toPackage()
				: Packages.find_package(packageSpec).toPackage();
		boolean result = thePackage.unintern(symbolTyped).getBooleanValue();
		return SubLObjectFactory.makeBoolean(result);
	}

	//// Initializers

	/** Creates a new instance of Package. */
	private Packages() {
	}

	public void declareFunctions() {
		SubLFiles.declareFunction(Packages.me, "package_name", "PACKAGE-NAME", 1, 0, false);
		SubLFiles.declareFunction(Packages.me, "package_use_list", "PACKAGE-USE-LIST", 1, 0, false);
		SubLFiles.declareFunction(Packages.me, "package_used_by_list", "PACKAGE-USED-BY-LIST", 1, 0, false);
		SubLFiles.declareFunction(Packages.me, "package_nicknames", "PACKAGE-NICKNAMES", 1, 0, false);
		SubLFiles.declareFunction(Packages.me, "package_shadowing_symbols", "PACKAGE-SHADOWING-SYMBOLS", 1, 0, false);

		SubLFiles.declareFunction(Packages.me, "package_locked_p", "PACKAGE-LOCKED-P", 1, 0, false);
		SubLFiles.declareFunction(Packages.me, "lock_package", "LOCK-PACKAGE", 1, 0, false);

		SubLFiles.declareFunction(Packages.me, "make_package", "MAKE-PACKAGE", 3, 0, false);
		SubLFiles.declareFunction(Packages.me, "find_package", "FIND-PACKAGE", 1, 0, false);
		SubLFiles.declareFunction(Packages.me, "list_all_packages", "LIST-ALL-PACKAGES", 0, 0, false);
		SubLFiles.declareFunction(Packages.me, "in_package", "IN-PACKAGE", 1, 0, false);
		SubLFiles.declareFunction(Packages.me, "intern", "INTERN", 1, 1, false);
		SubLFiles.declareFunction(Packages.me, "unintern", "UNINTERN", 1, 1, false);
		SubLFiles.declareFunction(Packages.me, "find_symbol", "FIND-SYMBOL", 1, 1, false);
		SubLFiles.declareFunction(Packages.me, "apropos", "APROPOS", 1, 3, false);

		SubLFiles.declareFunction(Packages.me, "sublisp_import", "IMPORT", 1, 1, false);
		SubLFiles.declareFunction(Packages.me, "export", "EXPORT", 1, 1, false);
		SubLFiles.declareFunction(Packages.me, "unexport", "UNEXPORT", 1, 1, false);

		SubLFiles.declareFunction(Packages.me, "print_package", "PRINT-PACKAGE", 2, 0, false);
	}

	public void initializeVariables() {
	}

	public void runTopLevelForms() {
	}

	//// Protected Area

	//// Private Area

	//// Internal Rep

}
