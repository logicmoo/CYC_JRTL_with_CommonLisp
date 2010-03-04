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

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbolFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbolImpl;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTrampolineFile;

//// Internal Imports

//// External Imports

public  final class Symbols extends SubLTrampolineFile {
  
  //// Constructors
  
  /** Creates a new instance of Symbols. */
  public Symbols() {}
  public static final SubLFile me = new Symbols();
  
  //// Public Area
  
  public static SubLSymbol $gensym_counter$;
  public static SubLSymbol $gentemp_counter$;
  
  public static final SubLObject make_symbol(SubLObject name) {
    return SubLSymbolFactory.makeUninternedSymbol(name.toStr());
  }
  
  public static final SubLObject make_keyword(SubLObject name) {
    return SubLSymbolFactory.makeKeyword(Strings.string(name).toStr());
  }
  
  public static final SubLObject symbol_name(SubLObject symbol) {
    return symbol.toSymbol().getSubLName();
  }
  
  public static final SubLObject symbol_package(SubLObject symbol) {
    SubLObject result = symbol.toSymbol().getPackage();
    return (result == null) ? NIL : result;
  }
  
  public static final SubLObject symbol_value(SubLObject symbol) {
    return symbol.toSymbol().getValue(); //this must be as fast as possible
  }
  
  public static final SubLObject set(SubLObject symbol, SubLObject value) {
    symbol.toSymbol().setValue(value);
    return value;
  }
  
  public static final SubLObject symbol_function(SubLObject symbol) {
    return symbol.toSymbol().getFunction();
  }
  
  public static final SubLObject boundp(SubLObject symbol) {
    if (symbol.toSymbol().boundp()) { return T; }
    return NIL;
  }
  
  public static final SubLObject fboundp(SubLObject symbol) {
    if (symbol.toSymbol().fboundp()) {
      return T;
    }
    return NIL;
  }

  public static final SubLObject fmakunbound(SubLObject symbol) {
    symbol.toSymbol().setFunction(null);
    return symbol;
  }

  public static final SubLObject gensym(SubLObject val) {
    return SubLSymbolImpl.gensym((val == UNPROVIDED) ? NIL : val);
  }
  
  public static final SubLObject gentemp(SubLObject prefix) {
    return gentemp(prefix, UNPROVIDED);
  }
  
  public static final SubLObject gentemp(SubLObject prefix, SubLObject thePackage) {
    if (prefix == UNPROVIDED) { prefix = NIL; }
    return SubLSymbolImpl.gentemp(prefix, extractPackage(thePackage));
  }

  public static final SubLObject makunbound(SubLObject symbol) {
    symbol.toSymbol().setValue(SubLSymbolImpl.UNBOUND);
    return symbol;
  }

  public static final SubLObject get(SubLObject symbol, SubLObject indicator, SubLObject value) {
    SubLObject result = symbol.toSymbol().getProperty(indicator);
    return (result != null) ? result : ((value == UNPROVIDED) ? NIL : value);
  }

  public static final SubLObject put(SubLObject symbol, SubLObject indicator, SubLObject value) {
    symbol.toSymbol().setProperty(indicator, value);
    return value;
  }

  public static final SubLObject remprop(SubLObject symbol, SubLObject indicator) {
    SubLSymbol symbolTyped = symbol.toSymbol();
    SubLObject isPresent = symbolTyped.getProperty(indicator);
    symbolTyped.removeProperty(indicator);
    return (isPresent == null) ? (SubLObject)NIL : T;
  }

  public static final SubLObject symbol_plist(SubLObject symbol) {
    return symbol.toSymbol().getPlist();
  }
  
  //// Initializers
  
  public void declareFunctions() {
    SubLFiles.declareFunction(me, "make_symbol",  "MAKE-SYMBOL",  1, 0, false);
    SubLFiles.declareFunction(me, "make_keyword", "MAKE-KEYWORD", 1, 0, false);
    
    SubLFiles.declareFunction(me, "symbol_name",     "SYMBOL-NAME",     1, 0, false);
    SubLFiles.declareFunction(me, "symbol_package",  "SYMBOL-PACKAGE",  1, 0, false);
    SubLFiles.declareFunction(me, "symbol_value",    "SYMBOL-VALUE",    1, 0, false);
    SubLFiles.declareFunction(me, "symbol_function", "SYMBOL-FUNCTION", 1, 0, false);
    
    SubLFiles.declareFunction(me, "boundp",  "BOUNDP",  1, 0, false);
    SubLFiles.declareFunction(me, "fboundp", "FBOUNDP", 1, 0, false);
    
    SubLFiles.declareFunction(me, "set", "SET", 2, 0, false);
    
    SubLFiles.declareFunction(me, "fmakunbound", "FMAKUNBOUND", 1, 0, false);
    SubLFiles.declareFunction(me, "makunbound", "MAKUNBOUND", 1, 0, false);
    SubLFiles.declareFunction(me, "gensym", "GENSYM", 0, 1, false);
    SubLFiles.declareFunction(me, "gentemp", "GENTEMP", 0, 1, false);
    SubLFiles.declareFunction(me, "get", "GET", 2, 1, false);
    SubLFiles.declareFunction(me, "put", "PUT", 3, 0, false);
    SubLFiles.declareFunction(me, "remprop", "REMPROP", 2, 0, false);
    SubLFiles.declareFunction(me, "symbol_plist", "SYMBOL-PLIST", 1, 0, false);
  }
  
  public void initializeVariables() {
    $gensym_counter$ = SubLFiles.defvar(me, "*GENSYM-COUNTER*", ZERO_INTEGER);
    $gentemp_counter$ = SubLFiles.defvar(me, "*GENTEMP-COUNTER*", ZERO_INTEGER);
  }
  
  public void runTopLevelForms() {
  }
  
  //// Protected Area
  
  //// Private Area

  
  //// Internal Rep
  
  //// Main
  
}
