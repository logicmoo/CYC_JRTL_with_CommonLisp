package com.cyc.tool.subl.jrtl.nativeCode.commonLisp;

import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLNumber;


abstract public class NumericLispObject extends AbstractLispObject //
//implements SubLNumber 
{

	@Override
	final public String toString() {
		return writeToString();
	}
	public abstract String writeToString();
}
