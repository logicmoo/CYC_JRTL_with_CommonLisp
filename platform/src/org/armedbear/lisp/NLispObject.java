package org.armedbear.lisp;

abstract public class NLispObject extends LispObject {
	
	public String toStringSimple() {
		return "" + javaInstance();
	}

}
