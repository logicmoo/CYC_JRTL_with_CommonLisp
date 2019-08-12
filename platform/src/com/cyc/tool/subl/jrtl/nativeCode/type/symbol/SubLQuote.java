/* For LarKC */
package com.cyc.tool.subl.jrtl.nativeCode.type.symbol;

import org.armedbear.lisp.Symbol;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.FromSubLisp;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.InvalidSubLExpressionException;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLOperator;
import com.cyc.tool.subl.util.SubLFiles;

public class SubLQuote extends FromSubLisp implements SubLObject, SubLSymbol {

    /* (non-Javadoc)
    * @see com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol#setGlobalValue(com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject, boolean)
    */
    @Override
    public void setGlobalUnmergedForcedValue(SubLObject newValue, boolean asGlobal, boolean noMerge, boolean forced) {
	// TODO Auto-generated method stub
	symbol.setGlobalUnmergedForcedValue(newValue, asGlobal, noMerge, forced);
    }

    @Override
    public Symbol toLispObject() {
	return symbol.toLispObject();
    }

    private SubLQuote(String packageName, String symbolName, String alternateRep) {
	symbol = SubLObjectFactory.makeSymbol(symbolName, packageName);
	alternateSymbol = SubLObjectFactory.makeSymbol(alternateRep, packageName);
    }

    public static String uniqueQuoteName(String packageName, String symbolName, String alternateRep) {
	String lookupName = packageName + ":" + symbolName + " (" + alternateRep + ")";
	return lookupName;
    }

    private SubLSymbol symbol;
    private SubLSymbol alternateSymbol;
    final public static SubLQuote QUOTE_SYMBOL = new SubLQuote("SUBLISP", "QUOTE", "'");
    final public static SubLQuote BACK_QUOTE_SYMBOL = new SubLQuote("SUBLISP", "BACKQUOTE", "`");
    final public static SubLQuote UNQUOTE_SYMBOL = new SubLQuote("SUBLISP", "UNQUOTE", ",");
    final public static SubLQuote SPLICING_UNQUOTE_SYMBOL = new SubLQuote("SUBLISP", "SPLICING-UNQUOTE", ",@");
    final public static SubLQuote FUNCTION_QUOTE_SYMBOL = new SubLQuote("SUBLISP", "FUNCTION", "#'");
    final public static String QUOTE_TYPE_NAME = "QUOTE";

    @Override
    public void bind(SubLObject newValue, SubLObject[] bindings) {
	symbol.bind(newValue, bindings);
    }

    @Override
    public void bind(SubLObject newValue, SubLThread thread) {
	symbol.bind(newValue, thread);
    }

    @Override
    public boolean boundp() {
	return symbol.boundp();
    }

    @Override
    public boolean canFastHash() {
	return true;
    }

    @Override
    public Object clone() {
	return this;
    }

    @Override
    public SubLObject currentBinding(SubLObject[] bindings) {
	return symbol.currentBinding(bindings);
    }

    @Override
    public SubLObject currentBinding(SubLThread thread) {
	return symbol.currentBinding(thread);
    }

    @Override
    public boolean lispEquals(Object obj) {
	return symbol.lispEquals(obj);
    }

    @Override
    public SubLObject eval(SubLEnvironment env) throws InvalidSubLExpressionException {
	throw new InvalidSubLExpressionException("Error: Attempt to take the value of the unbound variable '" + this + "'.");
    }

    @Override
    public boolean fboundp() {
	return symbol.fboundp();
    }

    @Override
    public void forceGlobalValue(SubLObject newValue) {
	symbol.forceGlobalValue(newValue);
    }

    public SubLSymbol getAlternateSymbol() {
	return alternateSymbol;
    }

    @Override
    public int getBindingId() {
	return symbol.getBindingId();
    }

    @Override
    public SubLObject getDynamicValue() {
	return symbol.getDynamicValue();
    }

    @Override
    public SubLObject getDynamicValue(SubLObject[] bindings) {
	return symbol.getDynamicValue(bindings);
    }

    @Override
    public SubLObject getDynamicValue(SubLThread thread) {
	return symbol.getDynamicValue(thread);
    }

    @Override
    public SubLFunction getFunc() {
	return symbol.getFunc();
    }

    @Override
    public SubLOperator getFunction() {
	return symbol.getFunction();
    }

    @Override
    public SubLObject getGlobalValue() {
	return symbol.getGlobalValue();
    }

    @Override
    public String getName() {
	return symbol.getName();
    }

    @Override
    public SubLPackage getPackage() {
	return symbol.getPackage();
    }

    @Override
    public SubLList getPlist() {
	return symbol.getPlist();
    }

    @Override
    public SubLObject getProperty(SubLObject indicator) {
	return symbol.getProperty(indicator);
    }

    @Override
    public SubLString getSubLName() {
	return symbol.getSubLName();
    }

    public SubLSymbol getSymbol() {
	return symbol;
    }

    @Override
    public SubLSymbol getType() {
	return Types.$dtp_symbol$;
    }

    @Override
    public SubLFixnum getTypeCode() {
	return CommonSymbols.TWO_INTEGER;
    }

    @Override
    public SubLObject getValue() {
	return symbol.getValue();
    }

    @Override
    public int hashCode(int currentDepth) {
	if (currentDepth < 8)
	    return symbol.hashCode(currentDepth + 1);
	return 0;
    }

    @Override
    public boolean isAlien() {
	return false;
    }

    @Override
    public boolean isAtom() {
	return true;
    }

    @Override
    public boolean isBigIntegerBignum() {
	return false;
    }

    @Override
    public boolean isBignum() {
	return false;
    }

    @Override
    public boolean isBoolean() {
	return false;
    }

    @Override
    public boolean isChar() {
	return false;
    }

    @Override
    public boolean isCons() {
	return false;
    }

    @Override
    public boolean isConstantSymbol() {
	return symbol.isConstantSymbol();
    }

    @Override
    public boolean isDouble() {
	return false;
    }

    @Override
    public boolean isDynamic() {
	return symbol.isDynamic();
    }

    @Override
    public boolean isEnvironment() {
	return false;
    }

    @Override
    public boolean isError() {
	return false;
    }

    @Override
    public boolean isFixnum() {
	return false;
    }

    @Override
    public boolean isFunction() {
	return false;
    }

    @Override
    public boolean isFunctionSpec() {
	return false;
    }

    @Override
    public boolean isGlobal() {
	return symbol.isGlobal();
    }

    @Override
    public boolean isGuid() {
	return false;
    }

    @Override
    public boolean isHashtable() {
	return false;
    }

    @Override
    public boolean isHashtableIterator() {
	return false;
    }

    @Override
    public boolean isIntBignum() {
	return false;
    }

    @Override
    public boolean isInteger() {
	return false;
    }

    @Override
    public boolean isKeyhash() {
	return false;
    }

    @Override
    public boolean isKeyhashIterator() {
	return false;
    }

    @Override
    public boolean isKeyword() {
	return false;
    }

    @Override
    public boolean isList() {
	return false;
    }

    @Override
    public boolean isLock() {
	return false;
    }

    @Override
    public boolean isLongBignum() {
	return false;
    }

    @Override
    public boolean isMacroOperator() {
	return false;
    }

    @Override
    public boolean isNil() {
	return false;
    }

    @Override
    public boolean isNumber() {
	return false;
    }

    @Override
    public boolean isPackage() {
	return false;
    }

    @Override
    public boolean isPackageIterator() {
	return false;
    }

    @Override
    public boolean isProcess() {
	return false;
    }

    @Override
    public boolean isReadWriteLock() {
	return false;
    }

    @Override
    public boolean isRegexPattern() {
	return false;
    }

    @Override
    public boolean isSemaphore() {
	return false;
    }

    @Override
    public boolean isSequence() {
	return false;
    }

    @Override
    public boolean isStream() {
	return false;
    }

    @Override
    public boolean isString() {
	return false;
    }

    @Override
    public boolean isStructure() {
	return false;
    }

    @Override
    public boolean isSymbol() {
	return true;
    }

    @Override
    public boolean isUndeclared() {
	return symbol.isUndeclared();
    }

    @Override
    public boolean isVector() {
	return false;
    }

    @Override
    public SubLObject makeCopy() {
	return this;
    }

    @Override
    public SubLObject makeDeepCopy() {
	return this;
    }

    @Override
    public void rebind(SubLObject oldValue, SubLObject[] bindings) {
	symbol.rebind(oldValue, bindings);
    }

    @Override
    public void rebind(SubLObject oldValue, SubLThread thread) {
	symbol.rebind(oldValue, thread);
    }

    @Override
    public void removeProperty(SubLObject indicator) {
	symbol.removeProperty(indicator);
    }

    @Override
    public void setAccessMode(SubLFiles.VariableAccessMode accessMode) {
	symbol.setAccessMode(accessMode);
    }

    @Override
    public void setConstantValue(SubLObject value) {
	symbol.setConstantValue(value);
    }

    @Override
    public void setDynamicValue(SubLObject value) {
	symbol.setDynamicValue(value);
    }

    @Override
    public void setDynamicValue(SubLObject newValue, SubLObject[] bindings) {
	symbol.setDynamicValue(newValue, bindings);
    }

    @Override
    public void setDynamicValue(SubLObject newValue, SubLThread thread) {
	symbol.setDynamicValue(newValue, thread);
    }

    @Override
    public void setFunction(SubLOperator func) {
	symbol.setFunction(func);
    }

    @Override
    public void setGlobalValue(SubLObject value) {
	symbol.setGlobalValue(value);
    }

    @Override
    public void setPackage(SubLPackage thePackage) {
	Errors.error("Can't set package on symbol: " + getName());
    }

    @Override
    public void setProperty(SubLObject indicator, SubLObject value) {
	symbol.setProperty(indicator, value);
    }

    @Override
    public void setValue(SubLObject value) {
	symbol.setValue(value);
    }

    @Override
    public String printObjectImpl() {
	return symbol.printObject();
    }

    @Override
    public SubLSymbol toSymbol() {
	return symbol;
    }

    @Override
    public String toTypeName() {
	return SubLQuote.QUOTE_TYPE_NAME;
    }

    /* (non-Javadoc)
     * @see com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol#checkSymbol()
     */
    @Override
    public Symbol checkSymbol() {
	return toSymbol().checkSymbol();
    }
}
