/* For LarKC */
package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.AbstractSubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbolFactory;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTrampolineFile;

public class Symbols extends SubLTrampolineFile {

    public static SubLObject boundp(SubLObject symbol) {
	if (Loader.nothingBoundP()) {
	    return SubLNil.NIL;
	}
	if (symbol.toSymbol().boundp())
	    return CommonSymbols.T;
	return SubLNil.NIL;
    }

    public static SubLObject fboundp(SubLObject symbol) {
	if (symbol.toSymbol().fboundp())
	    return CommonSymbols.T;
	return SubLNil.NIL;
    }

    public static SubLObject fmakunbound(SubLObject symbol) {
	symbol.toSymbol().setFunction(null);
	return symbol;
    }

    public static SubLObject gensym(SubLObject val) {
	return AbstractSubLSymbol.gensym(val == CommonSymbols.UNPROVIDED ? SubLNil.NIL : val);
    }

    public static SubLObject gentemp(SubLObject prefix) {
	return gentemp(prefix, CommonSymbols.UNPROVIDED);
    }

    public static SubLObject gentemp(SubLObject prefix, SubLObject thePackage) {
	if (prefix == CommonSymbols.UNPROVIDED)
	    prefix = SubLNil.NIL;
	return AbstractSubLSymbol.gentemp(prefix, SubLTrampolineFile.extractPackage(thePackage));
    }

    public static SubLObject get(SubLObject symbol, SubLObject indicator, SubLObject value) {
	SubLObject result = symbol.toSymbol().getProperty(indicator);
	return result != null ? result : value == CommonSymbols.UNPROVIDED ? SubLNil.NIL : value;
    }

    public static SubLObject make_keyword(SubLObject name) {
	return SubLSymbolFactory.makeKeyword(Strings.string(name).toStr());
    }

    public static SubLObject make_interned_symbol(SubLObject name) {
	return SubLSymbolFactory.makeUninternedSymbol(name.toStr());
    }

    public static SubLObject make_uninterned_symbol(SubLObject name) {
	return SubLSymbolFactory.makeUninternedSymbol(name.toStr());
    }

    public static SubLObject makunbound(SubLObject symbol) {
	symbol.toSymbol().setValue(SubLSymbol.UNBOUND);
	return symbol;
    }

    public static SubLObject put(SubLObject symbol, SubLObject indicator, SubLObject value) {
	symbol.toSymbol().setProperty(indicator, value);
	return value;
    }

    public static SubLObject remprop(SubLObject symbol, SubLObject indicator) {
	SubLSymbol symbolTyped = symbol.toSymbol();
	SubLObject isPresent = symbolTyped.getProperty(indicator);
	symbolTyped.removeProperty(indicator);
	return isPresent == null ? SubLNil.NIL : CommonSymbols.T;
    }

    public static SubLObject set(SubLObject symbol, SubLObject value) {
	symbol.toSymbol().setValue(value);
	return value;
    }

    public static SubLObject symbol_function(SubLObject symbol) {
	return symbol.toSymbol().getFunction();
    }

    public static SubLObject symbol_name(SubLObject symbol) {
	return symbol.toSymbol().getSubLName();
    }

    public static SubLObject symbol_package(SubLObject symbol) {
	SubLObject result = symbol.toSymbol().getPackage();
	return result == null ? SubLNil.NIL : result;
    }

    public static SubLObject symbol_plist(SubLObject symbol) {
	return symbol.toSymbol().getPlist();
    }

    public static SubLObject symbol_value(SubLObject symbol) {
	return symbol.toSymbol().getValue();
    }

    public static SubLObject dynamic_value(SubLObject symbol) {
	return symbol.toSymbol().getDynamicValue();
    }

    public static SubLObject dynamic_value(SubLObject symbol, SubLThread thread) {
	return symbol.toSymbol().getDynamicValue(thread);
    }

    public static SubLFile me;
    public static SubLSymbol $gensym_counter$;
    public static SubLSymbol $gentemp_counter$;
    static {
	me = new Symbols();
    }

    @Override
    public void declareFunctions() {
	SubLFiles.declareFunction(Symbols.me, "make_symbol", "MAKE-SYMBOL", 1, 0, false);
	SubLFiles.declareFunction(Symbols.me, "make_keyword", "MAKE-KEYWORD", 1, 0, false);
	SubLFiles.declareFunction(Symbols.me, "symbol_name", "SYMBOL-NAME", 1, 0, false);
	SubLFiles.declareFunction(Symbols.me, "symbol_package", "SYMBOL-PACKAGE", 1, 0, false);
	SubLFiles.declareFunction(Symbols.me, "symbol_value", "SYMBOL-VALUE", 1, 0, false);
	SubLFiles.declareFunction(Symbols.me, "symbol_function", "SYMBOL-FUNCTION", 1, 0, false);
	SubLFiles.declareFunction(Symbols.me, "boundp", "BOUNDP", 1, 0, false);
	SubLFiles.declareFunction(Symbols.me, "fboundp", "FBOUNDP", 1, 0, false);
	SubLFiles.declareFunction(Symbols.me, "set", "SET", 2, 0, false);
	SubLFiles.declareFunction(Symbols.me, "fmakunbound", "FMAKUNBOUND", 1, 0, false);
	SubLFiles.declareFunction(Symbols.me, "makunbound", "MAKUNBOUND", 1, 0, false);
	SubLFiles.declareFunction(Symbols.me, "gensym", "GENSYM", 0, 1, false);
	SubLFiles.declareFunction(Symbols.me, "gentemp", "GENTEMP", 0, 1, false);
	SubLFiles.declareFunction(Symbols.me, "get", "GET", 2, 1, false);
	SubLFiles.declareFunction(Symbols.me, "put", "PUT", 3, 0, false);
	SubLFiles.declareFunction(Symbols.me, "remprop", "REMPROP", 2, 0, false);
	SubLFiles.declareFunction(Symbols.me, "symbol_plist", "SYMBOL-PLIST", 1, 0, false);
    }

    @Override
    public void initializeVariables() {
	Symbols.$gensym_counter$ = SubLFiles.defvar(Symbols.me, "*GENSYM-COUNTER*", CommonSymbols.ZERO_INTEGER);
	Symbols.$gentemp_counter$ = SubLFiles.defvar(Symbols.me, "*GENTEMP-COUNTER*", CommonSymbols.ZERO_INTEGER);
    }

    @Override
    public void runTopLevelForms() {
    }

    /**
     * TODO Describe the purpose of this method.
     * @param $str1$datum
     * @return
     */
    public static SubLObject make_symbol(SubLObject subLObject) {
	// TODO Auto-generated method stub
	return make_uninterned_symbol(subLObject);
    }
}
