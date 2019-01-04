////
//// For LarKC
////
//package com.cyc.tool.subl.jrtl.nativeCode.type.symbol;
//
//import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
//import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
//import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
//import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
//import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
//import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
//import com.cyc.tool.subl.jrtl.nativeCode.type.exception.InvalidSubLExpressionException;
//import com.cyc.tool.subl.util.SubLFiles;
//
//abstract class SubLSymbolKeyword_UNUSED extends AbstractSubLSymbol implements SubLSymbol {
//	private SubLString symbolName;
//	private int hashCode;
//
//
//	SubLSymbolKeyword_UNUSED(String symbolName) {
//		this.symbolName = SubLObjectFactory.makeString(symbolName);
//	}
//
//	SubLSymbolKeyword_UNUSED(SubLString symbolName) {
//		this.symbolName = symbolName;
//	}
//
//	public static String SYMBOL_TYPE_NAME  = "SYMBOL";
//
//
//	@Override
//	public void bind(SubLObject newValue, SubLObject[] bindings) {
//		Errors.error("Keyword: " + this + " cannot be dynamically bound.");
//	}
//
//	@Override
//	public void bind(SubLObject newValue, SubLThread thread) {
//		Errors.error("Keyword: " + this + " cannot be dynamically bound.");
//	}
//
//	@Override
//	public SubLObject currentBinding(SubLObject[] bindings) {
//		return Errors.error("Keyword: " + this + " does not have a dynamic binding.");
//	}
//
//	@Override
//	public SubLObject currentBinding(SubLThread thread) {
//		return Errors.error("Keyword: " + this + " does not have a dynamic binding.");
//	}
//
//	@Override
//	public SubLObject eval(SubLEnvironment env) throws InvalidSubLExpressionException {
//		return this;
//	}
//
//	@Override
//	public void forceGlobalValue(SubLObject newValue) {
//		Errors.error("Cannot set the value of keyword: " + this + ".");
//	}
//
//	@Override
//	public int getBindingId() {
//		return Integer.MIN_VALUE;
//	}
//
//	@Override
//	public SubLObject getDynamicValue() {
//		Errors.error(this + " is not boundp.");
//		return null;
//	}
//
//	@Override
//	public SubLObject getDynamicValue(SubLObject[] bindings) {
//		return Errors.error(this + " is not boundp.");
//	}
//
//	@Override
//	public SubLObject getDynamicValue(SubLThread thread) {
//		return Errors.error(this + " is not boundp.");
//	}
//
//	@Override
//	public SubLObject getGlobalValue() {
//		Errors.error(this + " is not boundp.");
//		return null;
//	}
//
//	@Override
//	public SubLObject getValue() {
//		return this;
//	}
//
//	@Override
//	public boolean isAlien() {
//		return false;
//	}
//
//	@Override
//	public boolean isAtom() {
//		return true;
//	}
//
//	@Override
//	public boolean isBigIntegerBignum() {
//		return false;
//	}
//
//	@Override
//	public boolean isBignum() {
//		return false;
//	}
//
//	@Override
//	public boolean isBoolean() {
//		return false;
//	}
//
//	@Override
//	public boolean isChar() {
//		return false;
//	}
//
//	@Override
//	public boolean isCons() {
//		return false;
//	}
//
//	@Override
//	public boolean isConstantSymbol() {
//		return true;
//	}
//
//	@Override
//	public boolean isDouble() {
//		return false;
//	}
//
//	@Override
//	public boolean isDynamic() {
//		return false;
//	}
//
//	@Override
//	public boolean isEnvironment() {
//		return false;
//	}
//
//	@Override
//	public boolean isError() {
//		return false;
//	}
//
//	@Override
//	public boolean isFixnum() {
//		return false;
//	}
//
//	@Override
//	public boolean isFunction() {
//		return false;
//	}
//
//	@Override
//	public boolean isFunctionSpec() {
//		return false;
//	}
//
//	@Override
//	public boolean isGlobal() {
//		return true;
//	}
//
//	@Override
//	public boolean isGuid() {
//		return false;
//	}
//
//	@Override
//	public boolean isHashtable() {
//		return false;
//	}
//
//	@Override
//	public boolean isHashtableIterator() {
//		return false;
//	}
//
//	@Override
//	public boolean isIntBignum() {
//		return false;
//	}
//
//	@Override
//	public boolean isInteger() {
//		return false;
//	}
//
//	@Override
//	public boolean isKeyhash() {
//		return false;
//	}
//
//	@Override
//	public boolean isKeyhashIterator() {
//		return false;
//	}
//
//	@Override
//	public boolean isKeyword() {
//		return true;
//	}
//
//	@Override
//	public boolean isList() {
//		return false;
//	}
//
//	@Override
//	public boolean isLock() {
//		return false;
//	}
//
//	@Override
//	public boolean isLongBignum() {
//		return false;
//	}
//
//	@Override
//	public boolean isMacroOperator() {
//		return false;
//	}
//
//	@Override
//	public boolean isNil() {
//		return false;
//	}
//
//	@Override
//	public boolean isNumber() {
//		return false;
//	}
//
//	@Override
//	public boolean isPackage() {
//		return false;
//	}
//
//	@Override
//	public boolean isPackageIterator() {
//		return false;
//	}
//
//	@Override
//	public boolean isProcess() {
//		return false;
//	}
//
//	@Override
//	public boolean isReadWriteLock() {
//		return false;
//	}
//
//	@Override
//	public boolean isRegexPattern() {
//		return false;
//	}
//
//	@Override
//	public boolean isSemaphore() {
//		return false;
//	}
//
//	@Override
//	public boolean isSequence() {
//		return false;
//	}
//
//	@Override
//	public boolean isStream() {
//		return false;
//	}
//
//	@Override
//	public boolean isString() {
//		return false;
//	}
//
//	@Override
//	public boolean isStructure() {
//		return false;
//	}
//
//	@Override
//	public boolean isSymbol() {
//		return true;
//	}
//
//	@Override
//	public boolean isUndeclared() {
//		return false;
//	}
//
//	@Override
//	public boolean isVector() {
//		return false;
//	}
//
//	@Override
//	public void rebind(SubLObject oldValue, SubLObject[] bindings) {
//		Errors.error("Keyword: " + this + " cannot be dynamically rebound.");
//	}
//
//	@Override
//	public void rebind(SubLObject oldValue, SubLThread thread) {
//		Errors.error("Keyword: " + this + " cannot be dynamically rebound.");
//	}
//
//	@Override
//	public void setAccessMode(SubLFiles.VariableAccessMode accessMode) {
//	}
//
//	@Override
//	public void setDynamicValue(SubLObject value) {
//		Errors.error("Can't change the value of keyword symbol: " + this);
//	}
//
//	@Override
//	public void setDynamicValue(SubLObject newValue, SubLObject[] bindings) {
//		Errors.error("Can't change the value of keyword symbol: " + this);
//	}
//
//	@Override
//	public void setDynamicValue(SubLObject newValue, SubLThread thread) {
//		Errors.error("Can't change the value of keyword symbol: " + this);
//	}
//
//	@Override
//	public void setGlobalValue(SubLObject value) {
//		Errors.error("Can't change the value of keyword symbol: " + this);
//	}
//
//	@Override
//	public void setValue(SubLObject value) {
//		Errors.error("Can't change the value of keyword symbol: " + this);
//	}
//
//	@Override
//	public SubLSymbol toSymbol() {
//		return this;
//	}
//
//	@Override
//	public String toTypeName() {
//		return SYMBOL_TYPE_NAME;
//	}
//
//	@Override
//	public CharSequence getPackageNamePrecise() {
//		// TODO Auto-generated method stub
//		if(true) Errors.unimplementedMethod("Auto-generated method stub:  AbstractSubLSymbol.getPackageNamePrecise");
//		return null;
//	}
//
//	@Override
//	public boolean boundp() {
//		return true;
//	}
//
//	@Override
//	public String getName() {
//		return symbolName.getStringValue();
//	}
//
//	@Override
//	public SubLPackage getPackage() {
//		return SubLPackage.KEYWORD_PACKAGE;
//	}
//
//	@Override
//	public SubLString getSubLName() {
//		return symbolName;
//	}
//
//	@Override
//	public int hashCode(int currentDepth) {
//		if(this.hashCode <0) hashCode = SubLPackage.KEYWORD_PACKAGE.hashCode() ^ symbolName.hashCode();
//		return hashCode;
//	}
//
//	@Override
//	public void setPackage(SubLPackage thePackage) {
//		if(thePackage!=SubLPackage.KEYWORD_PACKAGE) {
//			Errors.error("Can't change the package of keyword symbol: " + this);
//		}
//	}
//}
