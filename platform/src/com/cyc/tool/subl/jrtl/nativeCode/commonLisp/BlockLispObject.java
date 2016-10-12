package com.cyc.tool.subl.jrtl.nativeCode.commonLisp;

public class BlockLispObject extends AbstractLispObject {

	public String writeToString() {
		return this.unreadableString(this.getClass().getSimpleName());
	}
}
