package general.tests;

import junit.framework.TestCase;
import jasko.tim.lisp.util.*;

public class LispUtilTest extends TestCase {

	public void testFormatPackage() {
		String res = LispUtil.formatPackage("package");
		assertTrue(res.equals("PACKAGE"));
	}
}

