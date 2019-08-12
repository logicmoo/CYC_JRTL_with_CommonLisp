/***
 *   Copyright (c) 1995-2019 Cycorp Inc.
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

import org.armedbear.lisp.Symbol;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLOperator;
import com.cyc.tool.subl.util.SubLFiles.VariableAccessMode;

/**
 * <P>SubLSymbol is designed to...
 *
 * <P>Copyright (c) 2004 - 2006 Cycorp, Inc.  All rights reserved.
 * <BR>This software is the proprietary information of Cycorp, Inc.
 * <P>Use is subject to license terms.
 *
 * @author tbrussea
 * @date December 10, 2005, 7:28 PM
 * @version $Id: SubLSymbol.java 126640 2008-12-04 13:39:36Z builder $
 */
public interface SubLSymbol extends SubLObject {

    //// Public Area

    boolean boundp();

    SubLObject getValue();

    void setValue(SubLObject value);

    boolean fboundp();

    boolean isDynamic();

    boolean isGlobal();

    boolean isUndeclared();

    String getName();

    SubLString getSubLName();

    public SubLPackage getPackage();

    SubLOperator getFunction();

    SubLList getPlist();

    void setFunction(SubLOperator func);

    void setPackage(SubLPackage thePackage);

    void setProperty(SubLObject indicator, SubLObject value);

    void removeProperty(SubLObject indicator);

    SubLObject getProperty(SubLObject indicator);

    @Override
    boolean isKeyword();

    void setAccessMode(VariableAccessMode accessMode);

    void forceGlobalValue(SubLObject newValue);

    SubLObject getDynamicValue();

    void setDynamicValue(SubLObject value);

    SubLObject getDynamicValue(SubLObject[] bindings);

    void setDynamicValue(SubLObject value, SubLObject[] bindings);

    SubLObject getDynamicValue(SubLThread thread);

    void setDynamicValue(SubLObject value, SubLThread thread);

    SubLObject getGlobalValue();

    void setGlobalValue(SubLObject value);

    void setConstantValue(SubLObject value);

    boolean isConstantSymbol();

    int getBindingId();

    @Override
    SubLObject currentBinding(SubLObject[] bindings);

    @Override
    void bind(SubLObject newValue, SubLObject[] bindings);

    @Override
    void rebind(SubLObject oldValue, SubLObject[] bindings);

    SubLObject currentBinding(SubLThread thread);

    void bind(SubLObject newValue, SubLThread thread);

    void rebind(SubLObject oldValue, SubLThread thread);

    public static final SubLObject UNBOUND = null; // stub

    public static final String PACKAGE_SEPARATOR = ":";

    public static final char SYMBOL_NAME_QUOTE = '|';

    public static final int INVALID_BINDING_INDEX = Integer.MIN_VALUE;

    //String getJavaSymbolName();

    //int hashCodeLisp();

    //// Protected Area

    //// Private Area

    //// Internal Rep

    //// Main

    Symbol checkSymbol();

    @Override
    Symbol toLispObject();


    /**
     * TODO Describe the purpose of this method.
     * @param newValue
     * @param noMerge
     * @param forced
     */
    void setGlobalUnmergedForcedValue(SubLObject newValue, boolean asGlobal, boolean noMerge, boolean forced);

}