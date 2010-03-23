package com.cyc.tool.subl.jrtl.nativeCode.commonLisp;


public class BlockLispObject extends AbstractLispObject {
  @Override
  public String writeToString() {
  	return unreadableString(getClass().getSimpleName());
  }
}
