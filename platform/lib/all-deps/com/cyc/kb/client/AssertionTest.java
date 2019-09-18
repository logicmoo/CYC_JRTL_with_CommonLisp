/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cyc.kb.client;

/*
 * #%L
 * KBAPI
 * %%
 * Copyright (C) 1995 - 2014 Cycorp, Inc
 * %%
 * This software is the proprietary information of Cycorp, Inc.
 * Use is subject to license terms.
 * #L%
 */

import com.cyc.base.CycAccessManager;
import com.cyc.base.cycobject.CycAssertion;
import com.cyc.base.cycobject.CycConstantI;
import com.cyc.base.cycobject.FormulaSentence;
import com.cyc.baseclient.cycobject.CycFormulaSentence;
import com.cyc.baseclient.cycobject.DefaultCycAssertion;
import com.cyc.kb.Assertion;
import com.cyc.kb.Context;
import com.cyc.kb.Sentence;
import com.cyc.kb.KBAPIEnums.Direction;
import com.cyc.kb.client.AssertionImpl;
import com.cyc.kb.client.Constants;
import com.cyc.kb.client.ContextImpl;
import com.cyc.kb.client.FactImpl;
import com.cyc.kb.client.KBIndividualImpl;
import com.cyc.kb.client.KBPredicateImpl;
import com.cyc.kb.client.SentenceImpl;
import com.cyc.kb.exception.KBApiException;
import com.cyc.kb.exception.KBObjectNotFoundException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.logging.Logger;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Before;


/**
 * 
 * @author daves
 */
public class AssertionTest {

	/*
	 * @Rule public ExpectedException exception = ExpectedException.none();
	 */

	public AssertionTest() {
	}

	private static Logger log = null;

	@BeforeClass
	public static void setUpClass() throws Exception {
		log = Logger.getLogger(AssertionTest.class.getName());
		TestConstants.ensureInitialized();
	}

	@AfterClass
	public static void tearDownClass() throws Exception {
	}

	@Before
	public void setUp() {
	}

	@After
	public void tearDown() {
	}

	@Test
	public void testAssertionFactoryMethods() throws Exception {
		FormulaSentence cfs = CycFormulaSentence
				.makeCycSentence("(flyingDoneBySomething-Operate FlyingAPlane-APITest Pilot-APITest)");
		CycConstantI cc = CycAccessManager.get().getCurrentAccess().getLookupTool().find("SomeAirlineLogMt");
		CycAssertion ca = new DefaultCycAssertion(cfs, cc);

		System.out.println("Assertion OC API: " + ca);

		// Build assertion from CycObject
		AssertionImpl a = AssertionImpl.get(ca);
		System.out.println("Assertion KB API: " + a);
		assertEquals(ca, a.getCore());

		// KBObject getId works with Assertions
		String hlid = a.getId();
		System.out.println("HL ID of Assertion: " + hlid);

		// Get assertion from its HLID
		Assertion aid = AssertionImpl.get(hlid);
		assertTrue(a == aid);

		// exception.expect(KBObjectNotFoundException.class);
		// The above stops all KBObjectNotFoundException after that point
		try {
			AssertionImpl.get("SomeRandomHLID");
			fail("Need a KBObjectNotFoundException.class");
		} catch (KBObjectNotFoundException kbonf) {
			// Nothing to do
		}

		// Did I get it from the cache?
		Assertion acache = AssertionImpl.get(ca);
		assertTrue(a == acache);

		// Get assertion from formulaStr and ctxStr
		Assertion astr = AssertionImpl
				.get("(flyingDoneBySomething-Operate FlyingAPlane-APITest Pilot-APITest)",
						"SomeAirlineLogMt");
		assertTrue(a == astr);

		// Get assertion from Sentence formula and Context ctx
		SentenceImpl s = new SentenceImpl(
				KBPredicateImpl.get("flyingDoneBySomething-Operate"),
				KBIndividualImpl.get("FlyingAPlane-APITest"),
				KBIndividualImpl.get("Pilot-APITest"));
		Context ctx = ContextImpl.get("SomeAirlineLogMt");
		Assertion asent = AssertionImpl.get(s, ctx);
		assertTrue(a == asent);

		// Add a new assertion
		Assertion atemp = AssertionImpl.findOrCreate("(isa Pilot-APITest Person)",
				"UniversalVocabularyMt", null, Direction.FORWARD);
		System.out.println("Assertion: " + atemp);
		
		Direction d = atemp.getDirection();
		System.out.println("Direction is: " + d);
		
		// Add a new assertion in the default context
		Assertion assertionDefContext = AssertionImpl.findOrCreate("(isa Plane-APITest AirTransportationDevice)");
		System.out.println("Assertion with default context: " + assertionDefContext);
		assertEquals(Constants.uvMt(), assertionDefContext.context());
	}

	/**
	 * Test of context method, of class Assertion.
	 */
	// @Test
	public void testContext() throws Exception {
		System.out.println("context");
		Assertion instance = new AssertionImpl();
		Context expResult = null;
		Context result = instance.context();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to
		// fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of getSupportingAssertions method, of class Assertion.
	 */
	@Test
	public void testGetSupportingAssertions() throws KBApiException {
		System.out.println("getSupportingAssertions");
		Assertion instance = new FactImpl(true, "UniversalVocabularyMt",
				"(isa (FruitFn AppleTree) ExistingObjectType)");
		Collection result = instance.getSupportingAssertions();
		assertTrue(!result.isEmpty());

		// non-deduced assertion
		instance = new FactImpl(true, "UniversalVocabularyMt",
				"(isa (FruitFn AppleTree) SpatiallyDisjointObjectType)");
		result = instance.getSupportingAssertions();
		assertTrue(result.isEmpty());
	}

	/**
	 * Test of getAllSupportingAssertions method, of class Assertion.
	 */
	// @Test
	/*
	 * public void testGetAllSupportingAssertions() throws KBApiException {
	 * System.out.println("getAllSupportingAssertions"); Assertion instance =
	 * new Assertion(); Collection expResult = null; Collection result =
	 * instance.getAllSupportingAssertions(); assertEquals(expResult, result);
	 * // TODO review the generated test code and remove the default call to
	 * fail. fail("The test case is a prototype."); }
	 */
	/**
	 * Test of isDeducedAssertion method, of class Assertion.
	 */
	/*
	@Test
	public void testIsDeducedAssertion() throws Exception {
		System.out.println("isDeducedAssertion");
		Assertion instance = new Fact(true, "UniversalVocabularyMt",
				"(isa (FruitFn AppleTree) ExistingObjectType)");
		boolean expResult = true;
		boolean result = instance.isDeducedAssertion();
		assertEquals(expResult, result);
		instance = new Fact(true, "BaseKB",
				"(genls (FruitFn RedDeliciousAppleTree) (FruitFn AppleTree))");
		assertEquals(true, instance.isDeducedAssertion());

		// asserted only
		instance = new Fact(true, "UniversalVocabularyMt",
				"(isa (FruitFn AppleTree) SpatiallyDisjointObjectType)");
		assertEquals(false, instance.isDeducedAssertion());

		// (holdsIn (DateDecodeStringFn "YYYY-MM-DDTHH:MM" "2014-03-15T10:11")
		// (artifactFoundInLocation Plane-APITest CityOfSanFranciscoCA))
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MM dd HH:mm");
		Date d = sdf.parse("2014 03 15 10:20");
		Sentence s5 = new Sentence(Predicate.get("artifactFoundInLocation"),
				KBIndividual.get("Plane-APITest"),
				KBIndividual.get("CityOfSanFranciscoCA"));
		Sentence s6 = new Sentence(Predicate.get("holdsIn"), d, s5);
		Fact f = new Fact(Context.get("SomeAirlineLogMt"), s6);
		System.out.println("deduced: " + f.isDeducedAssertion());

		Assertion fa = new Fact(Context.get("SomeAirlineLogMt"),
				Predicate.get("endingDate"), KBIndividual.get("FlightXYZ-APITest"),
				d);
		System.out.println("Asserted? " + fa.isAssertedAssertion());

		Collection<Assertion> cola = f.getSupportingAssertions();

		assertTrue(cola.contains(fa));
	}*/
	

	@Test
	public void testIsDeducedAssertion() throws Exception {
		System.out.println("isDeducedAssertion");
		Assertion instance = new FactImpl(true, "UniversalVocabularyMt",
				"(isa (FruitFn AppleTree) ExistingObjectType)");
		boolean expResult = true;
		boolean result = instance.isDeducedAssertion();
		assertEquals(expResult, result);
		instance = new FactImpl(true, "BaseKB",
				"(genls (FruitFn RedDeliciousAppleTree) (FruitFn AppleTree))");
		assertEquals(true, instance.isDeducedAssertion());

		// asserted only
		instance = new FactImpl(true, "UniversalVocabularyMt",
				"(isa (FruitFn AppleTree) SpatiallyDisjointObjectType)");
		assertEquals(false, instance.isDeducedAssertion());

		// (holdsIn (DateDecodeStringFn "YYYY-MM-DDTHH:MM" "2014-03-15T10:11")
		// (artifactFoundInLocation Plane-APITest CityOfSanFranciscoCA))
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MM dd HH:mm");
		Date d = sdf.parse("2014 03 15 10:20");
		Sentence s5 = new SentenceImpl(KBPredicateImpl.get("artifactFoundInLocation"),
				KBIndividualImpl.get("Plane-APITest"),
				KBIndividualImpl.get("CityOfSanFranciscoCA"));
		SentenceImpl s6 = new SentenceImpl(KBPredicateImpl.get("holdsIn"), d, s5);
		FactImpl f = new FactImpl(ContextImpl.get("SomeAirlineLogMt"), s6);
		System.out.println("deduced: " + f.isDeducedAssertion());

		SentenceImpl s = new SentenceImpl (KBPredicateImpl.get("endingDate"), KBIndividualImpl.get("FlightXYZ-APITest"),
				d);
		Assertion fa = AssertionImpl.get(s, ContextImpl.get("SomeAirlineLogMt"));
		System.out.println("Asserted? " + fa.isAssertedAssertion());

		Collection<Assertion> cola = f.getSupportingAssertions();

		assertTrue(cola.contains(fa));
	}

	/**
	 * Test of isAssertedAssertion method, of class Assertion.
	 */
	@Test
	public void testIsAssertedAssertion() throws Exception {
		System.out.println("isAssertedAssertion");
		Assertion instance = new FactImpl(true, "BaseKB",
				"(genls (FruitFn RedDeliciousAppleTree) (FruitFn AppleTree))");
		assertEquals(true, instance.isAssertedAssertion());
		instance = new FactImpl(true, "UniversalVocabularyMt",
				"(isa (FruitFn AppleTree) SpatiallyDisjointObjectType)");
		assertEquals(true, instance.isAssertedAssertion());
		// derived only
		instance = new FactImpl(true, "UniversalVocabularyMt",
				"(isa (FruitFn AppleTree) ExistingObjectType)");
		assertEquals(false, instance.isAssertedAssertion());

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MM dd HH:mm");
		try {
			Date d = sdf.parse("2014 03 15 10:20");
			FactImpl f = new FactImpl(ContextImpl.get("SomeAirlineLogMt"),
					KBPredicateImpl.get("endingDate"),
					KBIndividualImpl.get("Plane-APITest"), d);
			System.out.println("Asserted? " + f.isAssertedAssertion());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * Test of delete method, of class Assertion.
	 */
	@Test
	public void testDelete() throws Exception {
		System.out.println("delete");
		SentenceImpl s = new SentenceImpl(
				KBPredicateImpl.get("flyingDoneBySomething-Operate"),
				KBIndividualImpl.get("FlyingAPlane-APITest"),
				KBIndividualImpl.get("Pilot-APITest"));
		ContextImpl ctx = ContextImpl.get("SomeAirlineLogMt");
		Assertion asent = AssertionImpl.get(s, ctx);
		asent.delete();
		try {
			AssertionImpl.get(s, ctx);
			fail("Need a KBObjectNotFoundException.class");
		} catch (KBObjectNotFoundException kbonf) {
		}

		// Put it back. JUnit can execute tests in arbitrary order, we need 
		// the delete assertion later.
		AssertionImpl.findOrCreate(s, ctx);
		
		// Try to delete a forward derived assertion
	}
}