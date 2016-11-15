package com.cyc.tool.subl.jrtl.nativeCode.commonLisp;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLSequence;

public interface LispSequence extends SubLObject, SubLSequence {

	public void aset(int index, SubLObject obj);

	public abstract void fillVoid(SubLObject obj);

	public SubLObject NTH(int index);

}
