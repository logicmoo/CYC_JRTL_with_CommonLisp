//
// For LarKC
//
package com.cyc.tool.subl.jrtl.nativeCode.type.symbol;

import org.armedbear.lisp.Lisp;
import org.armedbear.lisp.LispObject;
import org.armedbear.lisp.Symbol;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.InvalidSubLExpressionException;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputBinaryStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputTextStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputBinaryStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputTextStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLStream;
import com.cyc.tool.subl.util.SubLFiles;

public class SubLT extends Symbol implements SubLObject, SubLBoolean, SubLSymbol {

	static final Boolean BOOLEAN_TRUE = Boolean.valueOf(true);
	private SubLT() {
		super(T_SYMBOL_NAME, Lisp.PACKAGE_CL);
		Symbol.T = this;
		Lisp.PACKAGE_CL.addSymbol(this);
		Lisp.PACKAGE_CL.export(this);
		initializeConstant(this);
	}

	@Override
	public SubLT toLispObject() {
		return this;
	}

	@Override
	public void setPackage(SubLPackage thePackage) {
		Errors.error("Can't set package on T.");
	}

	@Override
	public LispObject typeOf() {
		return Symbol.BOOLEAN;
	}

	@Override
	public int hashCode(int currentDepth) {
		return T_SYMBOL_NAME_SUBLSTRING.hashCode(currentDepth);
	}

	@Override
	public String getName() {
		return T_SYMBOL_NAME;
	}

	@Override
	public CharSequence getPackageNamePrecise() {
		return "SL";
	}

	@Override
	public SubLPackage getPackage() {
		return SubLPackage.SUBLISP_PACKAGE.toPackage();
	}


    @Override
    public boolean getBooleanValue()
    {
        return true;
    }

    @Override
    public int intValue() {
    	if(true) return super.intValue();
    	return 1;
    }

	@Override
	public boolean boundp() {
		return true;
	}

	@Override
	public SubLString getSubLName() {
		return T_SYMBOL_NAME_SUBLSTRING;
	}

	public static SubLBoolean toSubLBoolean(boolean val) {
		return val ? SubLT.T : SubLNil.NIL;
	}

	final public static String T_TYPE_NAME = "BOOLEAN";
	final public static String T_SYMBOL_NAME = "T";
	final public static SubLString T_SYMBOL_NAME_SUBLSTRING = SubLObjectFactory.makeString(T_SYMBOL_NAME);
	final public static SubLT T = new SubLT();

	@Override
	public void bind(SubLObject newValue, SubLObject[] bindings) {
		Errors.error("Can't bind T.");
	}

	@Override
	public void bind(SubLObject newValue, SubLThread thread) {
		Errors.error("Can't bind T.");
	}

	@Override
	public SubLObject currentBinding(SubLObject[] bindings) {
		return Errors.error("T does not have a dynamic binding.");
	}

	@Override
	public SubLObject currentBinding(SubLThread thread) {
		return Errors.error("T does not have a dynamic binding.");
	}

	@Override
	public SubLObject eval(SubLEnvironment env) throws InvalidSubLExpressionException {
		return this;
	}

	@Override
	public void forceGlobalValue(SubLObject newValue) {
		Errors.error("T is immutable.");
	}

	@Override
	public int getBindingId() {
		return Integer.MIN_VALUE;
	}

	@Override
	public SubLObject getDynamicValue() {
		return this;
	}

	@Override
	public SubLObject getDynamicValue(SubLObject[] bindings) {
		return this;
	}

	@Override
	public SubLObject getDynamicValue(SubLThread thread) {
		return this;
	}

	@Override
	public SubLObject getGlobalValue() {
		return this;
	}

	@Override
	public SubLStream getStream(boolean followSynonymStream) {
		return StreamsLow.$terminal_io$.getValue().getStream(true);
	}

	@Override
	public SubLObject getValue() {
		return this;
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
		return true;
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
		return true;
	}

	@Override
	public boolean isDouble() {
		return false;
	}

	@Override
	public boolean isDynamic() {
		return false;
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
		return true;
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
		return false;
	}

	@Override
	public boolean isVector() {
		return false;
	}

	@Override
	public void rebind(SubLObject oldValue, SubLObject[] bindings) {
		Errors.error("Can't rebind T.");
	}

	@Override
	public void rebind(SubLObject oldValue, SubLThread thread) {
		Errors.error("Can't rebind T.");
	}

	@Override
	public void setAccessMode(SubLFiles.VariableAccessMode accessMode) {
	}

	@Override
	public void setDynamicValue(SubLObject value) {
		Errors.error("Can't change the value of T.");
	}

	@Override
	public void setDynamicValue(SubLObject newValue, SubLObject[] bindings) {
		Errors.error("Can't change the value of T.");
	}

	@Override
	public void setDynamicValue(SubLObject newValue, SubLThread thread) {
		Errors.error("Can't change the value of T.");
	}

	@Override
	public void setGlobalValue(SubLObject value) {
		Errors.error("Can't change the value of T.");
	}

	@Override
	public void setValue(SubLObject value) {
		Errors.error("Can't change the value of T.");
	}

	@Override
	public boolean toBoolean() {
		return true;
	}

	@Override
	public SubLInputBinaryStream toInputBinaryStream() {
		return getStream(false).toInputBinaryStream();
	}

	@Override
	public SubLInputStream toInputStream() {
		return getStream(false).toInputStream();
	}

	@Override
	public SubLInputTextStream toInputTextStream() {
		return getStream(false).toInputTextStream();
	}

	@Override
	public SubLOutputBinaryStream toOutputBinaryStream() {
		return getStream(false).toOutputBinaryStream();
	}

	@Override
	public SubLOutputStream toOutputStream() {
		return getStream(false).toOutputStream();
	}

	@Override
	public SubLOutputTextStream toOutputTextStream() {
		return getStream(false).toOutputTextStream();
	}

	@Override
	public SubLSymbol toSymbol() {
		return this;
	}

	@Override
	public String toTypeName() {
		return SubLT.T_TYPE_NAME;
	}

	@Override
	public Object javaInstance() {
		return BOOLEAN_TRUE;
	}
}
