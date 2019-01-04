//
// For LarKC
//
package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;

public class Vectors implements SubLFile {
	public static SubLObject aref(SubLObject vector, SubLObject index) {
		return vector.get(index.intValue());
	}

	public static SubLObject make_vector(SubLObject size, SubLObject initialElement) {
		if (initialElement == CommonSymbols.UNPROVIDED)
			initialElement = SubLNil.NIL;
		return SubLObjectFactory.makeVector(size.intValue(), initialElement);
	}

	public static SubLObject set_aref(SubLObject vector, SubLObject index, SubLObject value) {
		vector.set(index.intValue(), value);
		return value;
	}

	public static SubLObject vector(SubLObject[] objects) {
		return SubLObjectFactory.makeVector(objects);
	}

	public Vectors() {
		PrologSync.addSingleton(this);
	}

	public static SubLFile me;
	static {
		me = new Vectors();
	}

	@Override
	public void declareFunctions() {
		SubLFiles.declareFunction(Vectors.me, "aref", "AREF", 2, 0, false);
		SubLFiles.declareFunction(Vectors.me, "set_aref", "SET-AREF", 3, 0, false);
		SubLFiles.declareFunction(Vectors.me, "make_vector", "MAKE-VECTOR", 1, 1, false);
		SubLFiles.declareFunction(Vectors.me, "vector", "VECTOR", 0, 0, true);
	}

	@Override
	public void initializeVariables() {
	}

	@Override
	public void runTopLevelForms() {
	}
}
