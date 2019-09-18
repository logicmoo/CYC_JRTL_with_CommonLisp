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
import com.cyc.base.cycobject.CycConstantI;
import com.cyc.kb.client.BinaryPredicateImpl;
import com.cyc.kb.client.Constants;
import com.cyc.kb.client.KBIndividualImpl;
import com.cyc.kb.exception.KBApiException;
import com.cyc.kb.exception.KBApiRuntimeException;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.logging.Logger;

import org.junit.*;

import static org.junit.Assert.*;

public class BinaryPredicateTest {

	private static Logger log = null;
	private static KBIndividualImpl i;

	@BeforeClass
	public static void setUp() throws Exception {
		log = Logger.getLogger(BinaryPredicateTest.class.getName());
		TestConstants.ensureInitialized();
		i = new KBIndividualImpl("VijayRaj009");
		i.instantiates("Person", "UniversalVocabularyMt");
	}

	@AfterClass
	public static void tearDown() throws Exception {
	}

	@Test
	public void testBinaryPredicateString() {
		try {
			BinaryPredicateImpl bp = BinaryPredicateImpl.get("comment");
			i.addArg2(bp, "Vijay is a person", Constants.uvMt());
			i.delete();
			java.util.Collection<String> comments = i.getComments("");
			assertEquals(comments.size(), 0);
		} catch (KBApiRuntimeException ex) {
			assertEquals(ex.getMessage(),
					"The reference to VijayRaj009 object is stale. Possibly because it was delete using x.delete() method.");
		} catch (Exception e) {
			e.printStackTrace();
			fail("BinaryPredicate could not be created");
		}

	}
	
	@Test
	public void testStaticMethods() throws Exception {
		System.out.println("existsAsType; getStatus");
		assertTrue(BinaryPredicateImpl.existsAsType("flyingDoneBySomeone-Travel"));
		
		CycConstantI cc1 = CycAccessManager.get().getCurrentAccess().getLookupTool().getKnownConstantByName("flyingDoneBySomeone-Travel");
		assertTrue(BinaryPredicateImpl.existsAsType(cc1));
		
		assertFalse(BinaryPredicateImpl.existsAsType("FlyingAnObject-Operate"));
		
		CycConstantI cc2 = CycAccessManager.get().getCurrentAccess().getLookupTool().getKnownConstantByName("FlyingAnObject-Operate");
		assertFalse(BinaryPredicateImpl.existsAsType(cc2));
		
	}
	

}
