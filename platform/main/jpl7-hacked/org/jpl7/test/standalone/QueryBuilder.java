package org.jpl7.test.standalone;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.armedbear.lisp.Main;
import org.jpl7.Atom;
import org.jpl7.Compound;
import org.jpl7.Float;
import org.jpl7.Integer;
import org.jpl7.JPLException;
import org.jpl7.PrologException;
import org.jpl7.Query;
import org.jpl7.Term;
import org.jpl7.Util;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

public class QueryBuilder {
	//    final Logger logger = LoggerFactory.getLogger(GetSolution.class);

	public static void main(String argv[]) {
	}

	@Before
	public void setUp() {
		if (Main.noPrologJNI)
			return;
		// JPL.setTraditional();
		//
		//		Query.hasSolution("use_module(library(jpl))"); // only because we call e.g. jpl_pl_syntax/1 below
		//		Term swi = Query.oneSolution("current_prolog_flag(version_data,Swi)").get("Swi");
		//		System.out.println("swipl.version = " + swi.arg(1) + "." + swi.arg(2) + "." + swi.arg(3));
		//		System.out.println("swipl.syntax = " + Query.oneSolution("jpl_pl_syntax(Syntax)").get("Syntax"));
		//		System.out.println("swipl.home = " + Query.oneSolution("current_prolog_flag(home,Home)").get("Home").name());
		//		System.out.println("jpl.jar = " + JPL.version_string());
		//		System.out.println("jpl.dll = " + org.jpl7.fli.Prolog.get_c_lib_version());
		//		System.out.println("jpl.pl = " + Query.oneSolution("jpl_pl_lib_version(V)").get("V").name());
	}

	@Rule
	public TestWatcher watcher = new TestWatcher() {
		@Override
		protected void starting(Description description) {
			//            logger.info("{} being run...", description.getMethodName());

			System.out.println("Starting test: " + description.getMethodName());
		}
	};

	@Test
	public void testTerm1() {
		if (Main.noPrologJNI)
			return;
		Term args = Util.textToTerm("[1,2,3,4,5]");
		Term t = new Compound("member", new Term[] { new Integer(1), args });
		Query q = new Query(t);
		assertTrue("Query should have succeded, but it did not!", q.hasSolution());
	}

	// Query term is not an Atom or Compound, but an Float!
	@Test
	public void testTermErr1() {
		if (Main.noPrologJNI)
			return;
		Term t = new Float(1.23);
		try {
			Query q = new Query(t);
			fail("Query should have given JPLException");
		} catch (JPLException e) {
			// all good!
			System.out.println("\t" + e.getMessage());
		} catch (Exception e) {
			fail("Query should have given JPLException");
		}
	}

	@Test
	public void testString1() {
		if (Main.noPrologJNI)
			return;
		Query q = new Query("member(1, [1,2,3])");
		assertTrue("Query should have succeded, but it did not!", q.hasSolution());
	}

	@Test
	public void testString2() {
		if (Main.noPrologJNI)
			return;
		Query q = new Query("atom(?)", new Atom("hello"));
		assertTrue("Query should have succeded, but it did not!", q.hasSolution());
	}

	@Test
	public void testString3() {
		if (Main.noPrologJNI)
			return;
		Term[] args = new Term[] { new Integer(1), Util.textToTerm("[1,2,3,4,5]") };

		Query q = new Query("member(?, ?)", args);
		assertTrue("Query should have succeded, but it did not!", q.hasSolution());
	}

	@Test
	public void testString4() {
		if (Main.noPrologJNI)
			return;
		Term[] args = new Term[] { new Integer(1), Util.textToTerm("[1,2,3,4,5]") };

		Query q = new Query("member", args);
		assertTrue("Query should have succeded, but it did not!", q.hasSolution());
	}

	@Test
	public void testString5() {
		if (Main.noPrologJNI)
			return;
		Query q = new Query("atom", new Atom("hello"));
		assertTrue("Query should have succeded, but it did not!", q.hasSolution());
	}

	// Query term is not an Atom or Compound, but an Integer!
	@Test
	public void testStringErr1() {
		if (Main.noPrologJNI)
			return;
		try {
			Query q = new Query("112");
			fail("Query should have given JPLException");
		} catch (JPLException e) {
			// all good!
			System.out.println("\t" + e.getMessage());
		} catch (Exception e) {
			fail("Query should have given JPLException");
		}
	}

	// Query text is not a proper term
	@Test
	public void testStringErr2() {
		if (Main.noPrologJNI)
			return;
		try {
			Query q = new Query("112(sas,23");
			fail("Query should have given PrologException: malformed query");
		} catch (PrologException e) {
			// all good!
			System.out.println("\t" + e.getMessage());
		} catch (JPLException e) {
			fail("Should have been caught before because JPLException is a subclass of PrologException");
		} catch (Exception e) {
			fail("Query should have given JPLException");
		}
	}

	// Error in number of placeholder matching arguments (too many terms)
	@Test
	public void testStringErr3() {
		if (Main.noPrologJNI)
			return;
		Term[] args = new Term[] { new Integer(1), Util.textToTerm("[1,2,3,4,5]") };

		try {
			Query q = new Query("member(?, ?, ?)", args);
			fail("Query should have given JPLException");
		} catch (JPLException e) {
			// all good!
			System.out.println("\t" + e.getMessage());
		} catch (Exception e) {
			fail("Query should have given JPLException");
		}
	}

	// Error in number of placeholder matching arguments (too many terms)
	@Test
	public void testStringErr4() {
		if (Main.noPrologJNI)
			return;
		Term[] args = new Term[] { new Integer(1), Util.textToTerm("[1,2,3,4,5]") };

		try {
			Query q = new Query("member(?)", args);
			fail("Query should have given JPLException");
		} catch (JPLException e) {
			// all good!
			System.out.println("\t" + e.getMessage());
		} catch (Exception e) {
			fail("Query should have given JPLException");
		}
	}

}
