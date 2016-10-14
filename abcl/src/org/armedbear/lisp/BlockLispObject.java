package org.armedbear.lisp;

public class BlockLispObject extends ALispObject {

	public String printObject() {
	     return "#<BLOCK "+ this.getClass().getName() + "@" + Integer.toHexString(this.hashCode()) +">";
	}
}
