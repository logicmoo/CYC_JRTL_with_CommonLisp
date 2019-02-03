//
// For LarKC
//
package com.cyc.tool.subl.jrtl.nativeCode.type.symbol;

import org.armedbear.lisp.Symbol;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLOperator;
import com.cyc.tool.subl.util.SubLFiles;

public interface SubLSymbol extends SubLObject {
	public static SubLObject UNBOUND = null;
	public static String PACKAGE_SEPARATOR = ":";
	public static char SYMBOL_NAME_QUOTE = '|';
	public static int INVALID_BINDING_INDEX = Integer.MIN_VALUE;

	@Override
	void bind(SubLObject p0, SubLObject[] p1);

	void bind(SubLObject p0, SubLThread p1);

	boolean boundp();

	@Override
	SubLObject currentBinding(SubLObject[] p0);

	SubLObject currentBinding(SubLThread p0);

	boolean fboundp();

	void forceGlobalValue(SubLObject p0);

	int getBindingId();

	SubLObject getDynamicValue();

	SubLObject getDynamicValue(SubLObject[] p0);

	SubLObject getDynamicValue(SubLThread p0);

	SubLOperator getFunction();

	SubLObject getGlobalValue();

	String getName();

	SubLPackage getPackage();

	SubLList getPlist();

	SubLObject getProperty(SubLObject p0);

	SubLString getSubLName();

	SubLObject getValue();

	boolean isConstantSymbol();

	boolean isDynamic();

	boolean isGlobal();

	@Override
	boolean isKeyword();

	boolean isUndeclared();

	@Override
	void rebind(SubLObject p0, SubLObject[] p1);

	void rebind(SubLObject p0, SubLThread p1);

	void removeProperty(SubLObject p0);

	void setAccessMode(SubLFiles.VariableAccessMode p0);

	void setConstantValue(SubLObject p0);

	void setDynamicValue(SubLObject p0);

	void setDynamicValue(SubLObject p0, SubLObject[] p1);

	void setDynamicValue(SubLObject p0, SubLThread p1);

	void setFunction(SubLOperator p0);

	void setGlobalValue(SubLObject p0);

	void setPackage(SubLPackage p0);

	void setProperty(SubLObject p0, SubLObject p1);

	void setValue(SubLObject p0);

	@Override
	Symbol toLispObject();
}
