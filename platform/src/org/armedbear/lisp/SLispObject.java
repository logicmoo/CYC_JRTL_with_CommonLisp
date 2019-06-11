package org.armedbear.lisp;

public abstract class SLispObject extends LispObject {
    @Override
    abstract public String printObjectImpl();
    
//	@Override
//	public int eq_hashCode() {
//		return ref_hashCode();
//	}
}
