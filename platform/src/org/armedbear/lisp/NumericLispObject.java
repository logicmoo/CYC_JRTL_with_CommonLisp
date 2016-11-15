package com.cyc.tool.subl.jrtl.nativeCode.commonLisp;

abstract public class NumericLispObject extends AbstractLispObject //
// implements SubLNumber
{

	final public String toString() {
		return this.writeToString();
	}

	public abstract String writeToString();
}
