package org.armedbear.lisp;

abstract public class NLispObject extends ALispObject {
	
	public String toStringSimple() {
		return "" + javaInstance();
	}

}
