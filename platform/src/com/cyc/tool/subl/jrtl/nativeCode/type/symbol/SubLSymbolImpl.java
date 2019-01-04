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
//import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
//import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
//import com.cyc.tool.subl.jrtl.nativeCode.type.exception.InvalidSubLExpressionException;
//import com.cyc.tool.subl.util.SubLFiles;
//
//abstract public class SubLSymbolImpl extends AbstractSubLSymbol implements SubLSymbol {
//	SubLSymbolImpl(String symbolName, SubLPackage thePackage) {
//		this.symbolName = SubLObjectFactory.makeString(symbolName);
//		this.thePackage = thePackage;
//		if(thePackage==SubLPackage.KEYWORD_PACKAGE) {
//			Errors.error("Wrong Class for createing keywords");
//		}
//		id = Integer.MIN_VALUE;
//		accessModeVar = SubLFiles.VariableAccessMode.UNDECLARED;
//		constantValue = SubLSymbol.UNBOUND;
//	}
//
//	SubLSymbolImpl(SubLString symbolName, SubLPackage thePackage) {
//		this.symbolName = symbolName;
//		this.thePackage = thePackage;
//		id = Integer.MIN_VALUE;
//		accessModeVar = SubLFiles.VariableAccessMode.UNDECLARED;
//		constantValue = SubLSymbol.UNBOUND;
//	}
//
//	SubLString symbolName;
//	SubLPackage thePackage;
//	@Override
//	public SubLPackage getPackage() {
//		return thePackage;
//	}
//
//	private int id;
//	private SubLFiles.VariableAccessMode accessModeVar;
//	private SubLObject value;
//	private SubLObject constantValue;
//	private int hashCode = -1;
//	final public static String SYMBOL_TYPE_NAME = "SYMBOL";
//	private static int idCounter = 0;
//
//
//	@Override
//	public void bind(SubLObject newValue, SubLObject[] bindings) {
//		bindings[id] = newValue;
//	}
//
//	@Override
//	public void bind(SubLObject newValue, SubLThread thread) {
//		thread.bindingsList[id] = newValue;
//	}
//
//	@Override
//	public SubLObject currentBinding(SubLObject[] bindings) {
//		return bindings[id];
//	}
//
//	@Override
//	public SubLObject currentBinding(SubLThread thread) {
//		return thread.bindingsList[id];
//	}
//
//	@Override
//	public SubLObject eval(SubLEnvironment env) throws InvalidSubLExpressionException {
//		return getValue();
//	}
//
//	@Override
//	public void forceGlobalValue(SubLObject newValue) {
//		if (isConstantSymbol())
//			constantValue = newValue;
//		else
//			value = newValue;
//	}
//
//	@Override
//	public int getBindingId() {
//		return id;
//	}
//
//	@Override
//	public SubLObject getDynamicValue() {
//		if(id==INVALID_BINDING_INDEX) return unboundError();
//		SubLObject result = SubLProcess.currentSubLThread().bindingsList[id];
//		if (result != SubLSymbol.UNBOUND)
//			return result;
//		result = value;
//		return result != SubLSymbol.UNBOUND ? result : Errors.error(this + " is not bound.");
//	}
//
//	private SubLObject unboundError() {
//		// TODO Auto-generated method stub
//		if(true) Errors.unimplementedMethod("Auto-generated method stub:  SubLSymbolImpl.unboundError");
//		return null;
//	}
//
//	@Override
//	public SubLObject getDynamicValue(SubLObject[] bindings) {
//		SubLObject result = bindings[id];
//		if (result != SubLSymbol.UNBOUND)
//			return result;
//		result = value;
//		return result != SubLSymbol.UNBOUND ? result : Errors.error(this + " is not bound.");
//	}
//
//	@Override
//	public SubLObject getDynamicValue(SubLThread thread) {
//		SubLObject result = thread.bindingsList[id];
//		if (result != SubLSymbol.UNBOUND)
//			return result;
//		result = value;
//		return result != SubLSymbol.UNBOUND ? result : Errors.error(this + " is not bound.");
//	}
//
//	@Override
//	public SubLObject getGlobalValue() {
//		SubLObject result = isConstantSymbol() ? constantValue : value;
//		return result != SubLSymbol.UNBOUND ? result : Errors.error(this + " is not bound.");
//	}
//
//	public SubLObject getUndeclaredValue() {
//		SubLObject result = SubLEnvironment.currentEnvironment().lookupBinding(this);
//		if (result != SubLSymbol.UNBOUND)
//			return result;
//		result = value;
//		return result != SubLSymbol.UNBOUND ? result : Errors.error(this + " is not bound.");
//	}
//
//	@Override
//	public SubLObject getValue() {
//		if (accessModeVar == SubLFiles.VariableAccessMode.UNDECLARED)
//			return getUndeclaredValue();
//		if (accessModeVar == SubLFiles.VariableAccessMode.DYNAMIC)
//			return this.getDynamicValue();
//		return getGlobalValue();
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
//		return accessModeVar == SubLFiles.VariableAccessMode.CONSTANT;
//	}
//
//	@Override
//	public boolean isDouble() {
//		return false;
//	}
//
//	@Override
//	public boolean isDynamic() {
//		return accessModeVar == SubLFiles.VariableAccessMode.DYNAMIC;
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
//		return operator != null && operator.isFunction();
//	}
//
//	@Override
//	public boolean isGlobal() {
//		return accessModeVar == SubLFiles.VariableAccessMode.LEXICAL
//				|| accessModeVar == SubLFiles.VariableAccessMode.CONSTANT;
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
//		return false;
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
//		return operator != null && operator.isMacroOperator();
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
//		return accessModeVar == SubLFiles.VariableAccessMode.UNDECLARED;
//	}
//
//	@Override
//	public boolean isVector() {
//		return false;
//	}
//
//	@Override
//	public void rebind(SubLObject oldValue, SubLObject[] bindings) {
//		bindings[id] = oldValue;
//	}
//
//	@Override
//	public void rebind(SubLObject oldValue, SubLThread thread) {
//		thread.bindingsList[id] = oldValue;
//	}
//
//	@Override
//	public synchronized void setAccessMode(SubLFiles.VariableAccessMode accessMode) {
//		if (accessMode == null)
//			Errors.error("Cannot set symbol access mode to null on symbol: " + this);
//		synchronized (SubLSymbolImpl.class) {
//			if (accessMode == SubLFiles.VariableAccessMode.DYNAMIC) {
//				if (id == Integer.MIN_VALUE)
//					id = SubLSymbolImpl.idCounter++;
//			} else
//				id = Integer.MIN_VALUE;
//		}
//		accessModeVar = accessMode;
//	}
//
//	@Override
//	public void setDynamicValue(SubLObject newValue) {
//		SubLObject[] bindings = SubLProcess.currentSubLThread().bindingsList;
//		if (bindings[id] != SubLSymbol.UNBOUND)
//			bindings[id] = newValue;
//		else
//			value = newValue;
//	}
//
//	@Override
//	public void setDynamicValue(SubLObject newValue, SubLObject[] bindings) {
//		if (bindings[id] != SubLSymbol.UNBOUND)
//			bindings[id] = newValue;
//		else
//			value = newValue;
//	}
//
//	@Override
//	public void setDynamicValue(SubLObject newValue, SubLThread thread) {
//		SubLObject[] bindings = thread.bindingsList;
//		if (bindings[id] != SubLSymbol.UNBOUND)
//			bindings[id] = newValue;
//		else
//			value = newValue;
//	}
//
//	@Override
//	public void setGlobalValue(SubLObject newValue) {
//		value = newValue;
//	}
//
//	public void setUndeclaredValue(SubLObject newValue) {
//		SubLEnvironment env = SubLEnvironment.currentEnvironment();
//		env.setBinding(this, newValue);
//	}
//
//	@Override
//	public void setValue(SubLObject value) {
//		if (accessModeVar == SubLFiles.VariableAccessMode.DYNAMIC)
//			this.setDynamicValue(value);
//		else if (accessModeVar == SubLFiles.VariableAccessMode.LEXICAL)
//			setGlobalValue(value);
//		else if (accessModeVar == SubLFiles.VariableAccessMode.CONSTANT)
//			Errors.error("Can't set the value of constant symbol: " + this);
//		else if (accessModeVar == SubLFiles.VariableAccessMode.UNDECLARED)
//			setUndeclaredValue(value);
//		else
//			Errors.error("Don't know about access mode: " + accessModeVar);
//	}
//
//	@Override
//	public SubLSymbol toSymbol() {
//		return this;
//	}
//
//	@Override
//	public String toTypeName() {
//		return SubLSymbolImpl.SYMBOL_TYPE_NAME;
//	}
//
//	@Override
//	protected SubLSymbol getBindingType() {
//		return accessModeVar.toSymbol();
//	}
//
//	@Override
//	public CharSequence getPackageNamePrecise() {
//		if(thePackage==null) return "#";
//		// using this instead of getName() since the getName might be the shortened
//		return thePackage.getNameAsSubLString().getStringValue();
//	}
//
//	@Override
//	public boolean boundp() {
//		return value != SubLSymbol.UNBOUND || thePackage == SubLPackage.KEYWORD_PACKAGE;
//	}
//
//	@Override
//	public int hashCode(int currentDepth) {
//		if(this.hashCode <0) hashCode = (thePackage == null ? 0 : thePackage.hashCode()) ^ symbolName.hashCode();
//		return hashCode;
//	}
//
//	@Override
//	public void setPackage(SubLPackage thePackage) {
//		this.thePackage = thePackage;
//	}
//
//	@Override
//	public String getName() {
//		return symbolName.getStringValue();
//	}
//
//	@Override
//	public SubLString getSubLName() {
//		return symbolName;
//	}
//}
