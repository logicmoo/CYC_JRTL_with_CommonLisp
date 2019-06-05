package org.armedbear.lisp;

public class BlockLispObject extends SLispObject {

	@Override
	final public int eq_hashCode() {
		return ref_hashCode();
	}
	
	@Override
	public String printObject() {
	     return "#<BLOCK "+ this.getClass().getName() + "@" + Integer.toHexString(this.eq_hashCode()) +">";
	}
}
