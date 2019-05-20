package general.tests;

import junit.framework.TestCase;
import jasko.tim.lisp.cusp.*;
import jasko.tim.lisp.*;



public class CuspInterfaceTest extends TestCase {

	private CuspInterface getCusp(){
		return LispPlugin.getDefault().getCusp();
	}
	
	public void test_sendEvalAndGrab() {
		String res = getCusp().sendEvalAndGrab("(+ 2 3)",1000);
		assertTrue(res.equals("5"));
	}

	public void test_haveDefinitions() {
		 // SK: on my system (WinXP, sbcl), I don't have SBCL sources, so
		// res = false. It might be true with SBCL sources.
		boolean res = getCusp().haveDefinitions("*query-io*", ":wiz", 2000);
		assertTrue(!res);
	}
}
