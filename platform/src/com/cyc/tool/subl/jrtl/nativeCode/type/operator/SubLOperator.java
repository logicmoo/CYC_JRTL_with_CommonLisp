//
////
//
package com.cyc.tool.subl.jrtl.nativeCode.type.operator;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public interface SubLOperator extends SubLObject {
	SubLList getArglist();

	SubLSymbol getFunctionSymbol();

	boolean isSpecial();


	SubLSpecialOperator toSpecialOperator();
}
