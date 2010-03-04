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

package  com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCharacter;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbolFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import java.util.Iterator;

//// Internal Imports

//// External Imports

public  final class Packages extends SubLTrampolineFile {
  
  //// Constructors
  
  /** Creates a new instance of Package. */
  private Packages() { }
  public static final SubLFile me = new Packages();
  
  //// Public Area
  
  public static SubLSymbol $package$ = NIL;
  
  public static final SubLObject package_name(SubLObject thePackage) {
    return extractPackage(thePackage).getNameAsSubLString();
  }
  
  public static final SubLObject package_use_list(SubLObject thePackage) {
    return extractPackage(thePackage).getUsesPackagesList();
  }
  
  public static final SubLObject package_used_by_list(SubLObject thePackage) {
    return extractPackage(thePackage).getUsedByPackagesList();
  }
  
  public static final SubLObject package_nicknames(SubLObject thePackage) {
    return extractPackage(thePackage).getNickNames();
  }
  
  public static final SubLObject package_shadowing_symbols(SubLObject thePackage) {
    return extractPackage(thePackage).getShadowingSymbols();
  }
  
  public static final SubLObject package_locked_p(SubLObject thePackage) {
    return SubLObjectFactory.makeBoolean(extractPackage(thePackage).isLocked());
  }
  
  public static final SubLObject lock_package(SubLObject thePackage) {
    SubLPackage thePackageTyped = extractPackage(thePackage);
    thePackageTyped.setLocked();
    return thePackageTyped;
  }
  
  public static final SubLObject make_package(SubLObject name, 
      SubLObject usedPackageList, SubLObject nickNames) {
    SubLString nameTyped = name.toStr();
    SubLList usedPackageListTyped = usedPackageList.toList();
    SubLList nickNamesTyped = nickNames.toList();
    SubLPackage thePackage =  SubLObjectFactory.makePackage(nameTyped, 
      usedPackageListTyped, nickNamesTyped);
    
    return thePackage;
  }
  
  public static final SubLObject find_package(SubLObject packageName) {
    SubLString packageNameTyped = packageName.isString() ? 
      packageName.toStr() : Strings.string(packageName).toStr();
    SubLPackage result = SubLPackage.findPackageNamed(packageNameTyped);
    if (result == null) { return NIL; }
    return result;
  }
  
  public static final SubLObject list_all_packages() {
    SubLList result =  SubLPackage.getAllPackages();
    if (result == null) { return NIL; }
    return result;
  }
  
  public static final SubLObject in_package(SubLObject packageName) {
    SubLString packageNameTyped = packageName.isString() ? 
      packageName.toStr() : Strings.string(packageName).toStr();
    return SubLPackage.setCurrentPackage(packageNameTyped);
  }
  
  public static final SubLObject intern(SubLObject symbolSpec, SubLObject packageSpec) {
    SubLString nameTyped = (symbolSpec.isString()) 
      ? symbolSpec.toStr() : symbolSpec.toSymbol().getSubLName();
    if (packageSpec == UNPROVIDED) { packageSpec = SubLPackage.getCurrentPackage(); }
    SubLPackage thePackage = packageSpec.isPackage() 
      ? packageSpec.toPackage() : find_package(packageSpec).toPackage();
    SubLSymbol result = SubLSymbolFactory.makeSymbol(nameTyped, thePackage);
    return Values.values(result, thePackage.isExported(result) ? EXTERNAL_KEYWORD : INTERNAL_KEYWORD);
  }
  
  public static final SubLObject unintern(SubLObject symbol, SubLObject packageSpec) {
    SubLSymbol symbolTyped = symbol.toSymbol();
    if (packageSpec == UNPROVIDED) { packageSpec = SubLPackage.getCurrentPackage(); }
    SubLPackage thePackage = packageSpec.isPackage() 
      ? packageSpec.toPackage() : find_package(packageSpec).toPackage();
    boolean result = thePackage.unintern(symbolTyped);
    return SubLObjectFactory.makeBoolean(result);
  } 
  
  public static final SubLObject find_symbol(SubLObject name, SubLObject packageSpec) {
    String nameTyped = name.getString();
    if (packageSpec == UNPROVIDED) { packageSpec = SubLPackage.getCurrentPackage(); }
    SubLPackage thePackage = packageSpec.isPackage() ? 
      packageSpec.toPackage() : find_package(packageSpec).toPackage();
    SubLSymbol result = thePackage.retrieveSymbol(nameTyped);
    if (result == null) { return Values.values(NIL, NIL); }
    return Values.values(result, 
      thePackage.isExported(result) ? EXTERNAL_KEYWORD : INTERNAL_KEYWORD);
  }
  
  public static final SubLObject sublisp_import(SubLObject symbols, SubLObject thePackage) {
    if (symbols.isSymbol()) {
      extractPackage(thePackage).importSymbol(symbols);
    } else {
      extractPackage(thePackage).importSymbols(symbols);
    }
    return T;
  }
  
  public static final SubLObject export(SubLObject symbols, SubLObject thePackage) {
    if (symbols.isSymbol()) {
      extractPackage(thePackage).exportSymbol(symbols);
    } else {
      extractPackage(thePackage).exportSymbols(symbols);
    }
    return T;
  }
  
  public static final SubLObject unexport(SubLObject symbols, SubLObject thePackage) {
    if (symbols.isSymbol()) {
      extractPackage(thePackage).unexportSymbol(symbols);
    } else {
      extractPackage(thePackage).unexportSymbols(symbols);
    }
    return T;
  }
  
  public static final SubLObject apropos(SubLObject nameSpec, SubLObject packageSpec, 
      SubLObject externalOnly, SubLObject caseInsensitive) {
    if (externalOnly == UNPROVIDED) { externalOnly = NIL; }
    if (caseInsensitive == UNPROVIDED) { caseInsensitive = T; }
    SubLString nameTyped = (nameSpec.isString()) 
      ? nameSpec.toStr() : nameSpec.toSymbol().getSubLName();
    boolean externalOnlyTyped = (externalOnly != NIL);
    boolean caseInsensitiveTyped = (caseInsensitive != NIL);
    if (packageSpec == UNPROVIDED) { 
       SubLList packages = SubLPackage.getAllPackages();
       SubLObject result = NIL;
       for (int i = 0, size = packages.size(); i < size; i++) {
	   SubLPackage thePackage = packages.get(i).toPackage();
	   result = apropos_one_package(nameTyped, thePackage);
       }	
       return result;
    } else {
      // get a valid usable package
      if (!packageSpec.isPackage()) {
         SubLObject realPackage = find_package(packageSpec);
         if (!realPackage.isPackage()) {
            Errors.error(SubLObjectFactory.makeString("~S does not designate a package."), packageSpec);
         }
         packageSpec = realPackage;
      }
      SubLPackage thePackage = packageSpec.toPackage();
      return apropos_one_package(nameTyped, thePackage);
    }
  }


  protected static final SubLObject apropos_one_package(SubLString name, SubLPackage thePackage) {
    final SubLList hits = thePackage.aproposList(name);
    final SubLCharacter blank = SubLObjectFactory.makeChar(' ');
    final SubLString function = SubLObjectFactory.makeString("[FUNCTION]");
    final SubLString unbound = SubLObjectFactory.makeString("unbound");
    for (int i = 0, size = hits.size(); i < size; i++) {
      final SubLSymbol symbol = (SubLSymbol)hits.get(i);
      print_high.prin1(symbol, T);
      if (symbol.fboundp()) {
        print_high.princ(blank, T);
        print_high.princ(function, T);
      } else if (symbol.boundp()) {
        final SubLObject value = symbol.getValue();
        print_high.princ(blank, T);
        print_high.princ(value, T);        
      } else {
        print_high.princ(blank, T);
        print_high.princ(unbound, T);        
      }
      streams_high.terpri(T);
    }
    return T;
  }  
  
  public static final SubLObject print_package(SubLObject thePackage, SubLObject stream) {
    return Errors.unimplementedMethod("print_package");
  }
  
  // CDO-SYMBOLS helpers
  
  public static final Iterator makeSymbolIterator(SubLObject thePackage) {
    Errors.unimplementedMethod("makeSymbolIterator");
    return null;
  }
  
  public static final boolean symbolIteratorHasNext(Iterator symbolIterator) {
    Errors.unimplementedMethod("symbolIteratorHasNext");
    return false;
  }
  
  public static final SubLObject symbolIteratorNext(Iterator symbolIterator) {
    Errors.unimplementedMethod("symbolIteratorNext");
    return null;
  }
  
  //// Initializers
  
  static {
    $package$ = SubLFiles.defvar(me, "*PACKAGE*", SubLPackage.SUBLISP_PACKAGE, 
      SubLPackage.SUBLISP_PACKAGE);
  }
  
  public void declareFunctions() {
    SubLFiles.declareFunction(me, "package_name", "PACKAGE-NAME", 1, 0, false);
    SubLFiles.declareFunction(me, "package_use_list", "PACKAGE-USE-LIST", 1, 0, false);
    SubLFiles.declareFunction(me, "package_used_by_list", "PACKAGE-USED-BY-LIST", 1, 0, false);
    SubLFiles.declareFunction(me, "package_nicknames", "PACKAGE-NICKNAMES", 1, 0, false);
    SubLFiles.declareFunction(me, "package_shadowing_symbols", "PACKAGE-SHADOWING-SYMBOLS", 1, 0, false);
    
    SubLFiles.declareFunction(me, "package_locked_p", "PACKAGE-LOCKED-P", 1, 0, false);
    SubLFiles.declareFunction(me, "lock_package", "LOCK-PACKAGE", 1, 0, false);
    
    SubLFiles.declareFunction(me, "make_package", "MAKE-PACKAGE", 3, 0, false);
    SubLFiles.declareFunction(me, "find_package", "FIND-PACKAGE", 1, 0, false);
    SubLFiles.declareFunction(me, "list_all_packages", "LIST-ALL-PACKAGES", 0, 0, false);
    SubLFiles.declareFunction(me, "in_package", "IN-PACKAGE", 1, 0, false);
    SubLFiles.declareFunction(me, "intern",       "INTERN",       1, 1, false);
    SubLFiles.declareFunction(me, "unintern", "UNINTERN", 1, 1, false);
    SubLFiles.declareFunction(me, "find_symbol",  "FIND-SYMBOL",  1, 1, false);
    SubLFiles.declareFunction(me, "apropos", "APROPOS", 1, 3, false);
    
    SubLFiles.declareFunction(me, "sublisp_import", "IMPORT", 1, 1, false);
    SubLFiles.declareFunction(me, "export", "EXPORT", 1, 1, false);
    SubLFiles.declareFunction(me, "unexport", "UNEXPORT", 1, 1, false);
    
    SubLFiles.declareFunction(me, "print_package", "PRINT-PACKAGE", 2, 0, false);
  }
  
  public void initializeVariables() {
  }
  
  public void runTopLevelForms() {
  }
  
  //// Protected Area
  
  //// Private Area
  
  //// Internal Rep
  
}
