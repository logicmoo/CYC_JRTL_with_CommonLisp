//
// For LarKC
//
package com.cyc.tool.subl.util;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrologSync;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public abstract class SubLTrampolineFile implements SubLFile, CommonSymbols {

    /**
     * @param string
     */
    public static void newF(String string) {
        newF(string, 1);
    }

    /**
     * @param string
     * @param i
     */
    public static void newF(String string, int i) {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("UnaryFunction.newF");

    }

	public static boolean assertionsDisabledInClass = true;
    public static boolean $assertionsDisabled = true;
    // public static SubLList throwStack;

	public SubLTrampolineFile() {
		PrologSync.addSingleton(this);
	}

	public static void checkType(SubLObject obj, SubLObject typeSymbol) {
	}

	public static void enforceType(SubLObject obj, SubLSymbol predicate) {
		if (SubLNil.NIL == UnaryFunction.makeInstance(predicate).processItem(obj))
			Errors.error(SubLObjectFactory.makeString("Got invalid type for object: " + obj + "." + " Wanted type: "
					+ predicate + " Actual type: " + obj.toTypeName()));
	}

	public static BinaryFunction extractBinaryFunc(SubLObject func) {
		if (func == CommonSymbols.UNPROVIDED || func == SubLNil.NIL || func == CommonSymbols.EQL)
			return BinaryFunction.EQL_TEST;
		if (func == CommonSymbols.EQ)
			return BinaryFunction.EQ_TEST;
		if (func == CommonSymbols.EQUAL)
			return BinaryFunction.EQUAL_TEST;
		if (func == CommonSymbols.EQUALP)
			return BinaryFunction.EQUALP_TEST;
		return BinaryFunction.makeInstance(func.getFunc());
	}

	public static int extractCount(SubLObject count) {
		return count == CommonSymbols.UNPROVIDED || count == SubLNil.NIL ? Integer.MAX_VALUE : count.intValue();
	}

	public static int extractEnd(SubLObject end) {
		return end == CommonSymbols.UNPROVIDED || end == SubLNil.NIL ? Integer.MAX_VALUE : end.intValue();
	}

	public static int extractEndUsingSize(SubLObject end, SubLObject seq) {
		return end == CommonSymbols.UNPROVIDED || end == SubLNil.NIL ? seq.size() : end.intValue();
	}

	public static SubLPackage extractPackage(SubLObject thePackage) {
		return thePackage == CommonSymbols.UNPROVIDED ? SubLPackage.getCurrentPackage() : thePackage.toPackage();
	}

	public static int extractStart(SubLObject start) {
		return start == CommonSymbols.UNPROVIDED ? 0 : start.intValue();
	}

	public static UnaryFunction extractUnaryFunc(SubLObject func) {
		return func == CommonSymbols.UNPROVIDED || func == SubLNil.NIL || func == CommonSymbols.IDENTITY
                ? UnaryFunction.IDENTITY_UNARY_FUNC
                : UnaryFunction.makeInstance(func.getFunc());
	}

	public static void main(String[] args) {
	}
}
