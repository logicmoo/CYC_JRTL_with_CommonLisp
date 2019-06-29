//
// For LarKC
//
package com.cyc.tool.subl.util;

import java.util.Deque;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Resourcer;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLFunction;

public abstract class SubLTranslatedFile extends SubLTrampolineFile implements CommonSymbols
//
{
	public @interface SubL {
		long position();

		String source();
	}

	public static boolean areAssertionsDisabledFor(SubLFile me) {
		return true;
	}

	public static SubLFunction extractFunctionNamed(String name) {
		return SubLObjectFactory.makeSymbol(name).getFunc();
	}

	public static SubLObject[] EMPTY_SUBL_OBJECT_ARRAY;

	public static Deque<SubLObject> getThrowStack() {
		return SubLProcess.currentSubLThread().throwStack;
	}

	static {
		EMPTY_SUBL_OBJECT_ARRAY = Resourcer.EMPTY_SUBL_OBJECT_ARRAY;
	}
}
