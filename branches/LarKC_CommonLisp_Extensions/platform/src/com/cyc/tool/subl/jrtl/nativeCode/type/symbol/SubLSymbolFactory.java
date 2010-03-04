/*
 * SubLSymbolFactory.java
 *
 * Created on January 6, 2006, 2:18 AM
 *
 * To change this template, choose Tools | Options and locate the template under
 * the Source Creation and Management node. Right-click the template and choose
 * Open. You can then make changes to the template in the Source Editor.
 */

package com.cyc.tool.subl.jrtl.nativeCode.type.symbol;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;

/**
 *
 * @author Tony Brusseau
 */
public final class SubLSymbolFactory {
  
  /** Creates a new instance of SubLSymbolFactory */
  private SubLSymbolFactory() {}
    
  public static final SubLSymbol makeSymbol(SubLString symbolName) {
    SubLSymbol result = makeSymbol(symbolName, SubLPackage.getCurrentPackage());
    return result;
  }
    
  public static final SubLSymbol makeSymbol(String symbolName) {
    SubLSymbol result = makeSymbol(symbolName, SubLPackage.getCurrentPackage());
    return result;
  }
  
  public static final SubLSymbol makeSymbol(String symbolName, SubLPackage thePackage) {
    if (thePackage == null) {
      return new SubLSymbolImpl(symbolName, thePackage);
    }
    return thePackage.intern(symbolName, false);
  }
  
  public static final SubLSymbol makeSymbol(SubLString symbolName, SubLPackage thePackage) {
    if (thePackage == null) {
      return new SubLSymbolImpl(symbolName, thePackage);
    }
    return thePackage.intern(symbolName, false);
  }
  
  public static final SubLPackage makePackage(SubLString name, SubLList usedPackagesList, SubLList nickNames) {
    return new SubLPackage(name, usedPackagesList, nickNames);
  }
  
  public static final SubLSymbol makeSymbol(String symbolName, String packageName) {
    if (packageName == null) {
      return makeSymbol(symbolName, (SubLPackage)null);
    }
    packageName = SubLSymbolImpl.canonicalizeName(packageName);
    SubLPackage thePackage = SubLPackage.findPackageNamed(packageName);
    if (thePackage == null) {
      Errors.error("Unkown package: " + packageName + ".");
    }
    SubLSymbol result = makeSymbol(symbolName, thePackage);
    return result;
  }
  
  public static final SubLSymbol makeUninternedSymbol(SubLString symbolName) {
    SubLSymbol result = makeSymbol(symbolName, (SubLPackage)null);
    return result;
  }
  
  public static final SubLSymbol makeUninternedSymbol(String symbolName) {
    SubLSymbol result = makeSymbol(SubLObjectFactory.makeString(symbolName), (SubLPackage)null);
    return result;
  }
  
  public static final SubLSymbol makeKeyword(String symbolName) {
    SubLSymbol result = makeSymbol(symbolName, SubLPackage.KEYWORD_PACKAGE);
    return result;
  }
  
  public static final SubLSymbol makeKeyword(SubLString symbolName) {
    SubLSymbol result = makeSymbol(symbolName, SubLPackage.KEYWORD_PACKAGE);
    return result;
  }
  
}
