//
// For LarKC
//
package com.cyc.tool.subl.util;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;

public interface SubLFile extends Singleton, CommonSymbols {
	void declareFunctions();

	void initializeVariables();

	void runTopLevelForms();
}
