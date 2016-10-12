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

package com.cyc.tool.subl.jrtl.nativeCode.type.symbol;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLOperator;
import com.cyc.tool.subl.util.SubLFiles.VariableAccessMode;

public interface SubLSymbol extends SubLObject, LispSymbol {

	//// Public Area

	public static SubLObject UNBOUND = null; // stub

	public static String PACKAGE_SEPARATOR = ":";

	public static char SYMBOL_NAME_QUOTE = '|';

	public static int INVALID_BINDING_INDEX = Integer.MIN_VALUE;

	void bind(SubLObject newValue, SubLObject[] bindings);

	void bind(SubLObject newValue, SubLThread thread);

	boolean boundp();

	SubLObject currentBinding(SubLObject[] bindings);

	SubLObject currentBinding(SubLThread thread);

	boolean fboundp();

	void forceGlobalValue(SubLObject newValue);

	int getBindingId();

	SubLObject getDynamicValue();

	SubLObject getDynamicValue(SubLObject[] bindings);

	SubLObject getDynamicValue(SubLThread thread);

	SubLOperator getFunction();

	SubLObject getGlobalValue();

	String getJavaSymbolName();

	String getName();

	public SubLPackage getPackage();

	SubLList getPlist();

	SubLObject getProperty(SubLObject indicator);

	SubLString getSubLName();

	SubLObject getValue();

	int hashCodeLisp();

	boolean isConstantSymbol();

	boolean isDynamic();

	boolean isGlobal();

	boolean isKeyword();

	boolean isUndeclared();

	void rebind(SubLObject oldValue, SubLObject[] bindings);

	void rebind(SubLObject oldValue, SubLThread thread);

	void removeProperty(SubLObject indicator);

	void setAccessMode(VariableAccessMode accessMode);

	void setConstantValue(SubLObject value);

	void setDynamicValue(SubLObject value);

	void setDynamicValue(SubLObject value, SubLObject[] bindings);

	void setDynamicValue(SubLObject value, SubLThread thread);

	void setFunction(SubLOperator func);

	void setGlobalValue(SubLObject value);

	void setPackage(SubLPackage thePackage);

	void setProperty(SubLObject indicator, SubLObject value);

	void setValue(SubLObject value);

	//// Protected Area

	//// Private Area

	//// Internal Rep

	//// Main

}
