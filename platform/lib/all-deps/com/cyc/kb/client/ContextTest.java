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

import com.cyc.baseclient.datatype.ContinuousTimeInterval;
import com.cyc.baseclient.datatype.ContinuousTimeInterval.TimeIntervalFunction;
import com.cyc.baseclient.datatype.TimeInterval;
import com.cyc.kb.Context;
import com.cyc.kb.KBStatus;
import com.cyc.kb.client.ContextImpl;
import com.cyc.kb.client.KBIndividualImpl;
import com.cyc.kb.exception.KBApiException;

import static com.cyc.kb.client.TestConstants.baseKB;

import com.cyc.kb.exception.CreateException;
import com.cyc.kb.exception.DeleteException;
import com.cyc.kb.exception.InvalidNameException;
import com.cyc.kb.exception.KBApiRuntimeException;
import com.cyc.kb.exception.KBTypeConflictException;
import com.cyc.kb.exception.KBTypeException;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Collection;
import java.util.Date;
import java.util.logging.Logger;

import static org.junit.Assert.*;

import org.junit.*;


/**
 *
 * @author baxter
 */
public class ContextTest {

    private static final String APPLE_PRODUCT_MT_STR = "AppleProductMt";
    private static final String I_PAD_PRODUCT_MT_STR = "iPadProductMt";
    private static final String ORGANIZATION_PRODUCT_MT_STR = "OrganizationProductMt";
    private static final String UNIVERSAL_VOCABULARY_MT_STR = "UniversalVocabularyMt";

    public ContextTest() {
    }
    private static Logger log = null;
    private static TimeInterval tenToTwentyKInclExcl = null;
    private static TimeInterval tenToTwentyKExclIncl = null;
    private static TimeInterval tenToTwentyKInclIncl = null;
    private static TimeInterval tenToTwentyKExclExcl = null;

    @BeforeClass
    public static void setUpClass() throws Exception {
        log = Logger.getLogger(ContextTest.class.getName());
        TestConstants.ensureInitialized();
        final Date start = new Date(10000);
        final Date end = new Date(20000);
        tenToTwentyKInclExcl = TimeIntervalFunction.INCL_EXCL.constructTimeInterval(
                start, end);
        tenToTwentyKExclIncl = TimeIntervalFunction.EXCL_INCL.constructTimeInterval(
                start, end);
        tenToTwentyKInclIncl = TimeIntervalFunction.INCL_INCL.constructTimeInterval(
                start, end);
        tenToTwentyKExclExcl = TimeIntervalFunction.EXCL_EXCL.constructTimeInterval(
                start, end);
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
    public void testContext() throws KBApiException, UnknownHostException, IOException {
        String str = "EnglishMt";
        String constrainingCol = "#$Microtheory";
        String ctx = UNIVERSAL_VOCABULARY_MT_STR;
        ContextImpl ctxObject = ContextImpl.get(ctx);

        ContextImpl c = ContextImpl.findOrCreate(str, constrainingCol, ctx);
        assertEquals(c.getCore().cyclify(), "#$EnglishMt");

        c = ContextImpl.get(str);
        assertEquals(c.getCore().cyclify(), "#$EnglishMt");
        assertEquals(ctxObject.getCore().toString(), "UniversalVocabularyMt");


        String hlId = "Mx4rvViAiZwpEbGdrcN5Y29ycA";
        c = ContextImpl.get(hlId);
        assertEquals(c.getCore().cyclify(), "#$EnglishMt");
    }

    /**
     * Test of getExtensions method, of class Context.
     */
    @Test
    public void testExtendedBy_Context() throws Exception {
        System.out.println("extendedBy");
        Context m = ContextImpl.findOrCreate(APPLE_PRODUCT_MT_STR);
        m.addExtension(ContextImpl.findOrCreate(I_PAD_PRODUCT_MT_STR));
        final Collection<Context> inferiors = m.getExtensions();
        assertTrue(inferiors.contains(ContextImpl.get(I_PAD_PRODUCT_MT_STR)));
    }

    /**
     * Test of getExtensions method, of class Context.
     */
    @Test
    public void testExtendedBy_String() throws Exception {
        System.out.println("extendedBy");
        Context m = ContextImpl.findOrCreate(APPLE_PRODUCT_MT_STR);
        m.addExtension(ContextImpl.findOrCreate(I_PAD_PRODUCT_MT_STR));
        final Collection<Context> inferiors = m.getExtensions();
        assertTrue(inferiors.contains(ContextImpl.get(I_PAD_PRODUCT_MT_STR)));
    }


    /**
     * Test of getInheritsFrom method, of class Context.
     */
    @Test
    public void testInheritsFrom_0args() throws Exception {
        System.out.println("inheritsFrom");
        Context m = ContextImpl.findOrCreate(APPLE_PRODUCT_MT_STR);
        m.addInheritsFrom(ORGANIZATION_PRODUCT_MT_STR);
        {
            final Collection<Context> superiors = m.getInheritsFrom();
            assertTrue(superiors.contains(ContextImpl.get(ORGANIZATION_PRODUCT_MT_STR)));
        }

        {
            Context vctx = new ContextImpl(
                    "(AVAnalysisContextFn (AVWorkWithIDFn 123454))");
            final Collection<Context> superiors = vctx.getInheritsFrom();
            System.out.println("Superiors: " + superiors);
            assertTrue(superiors.contains(baseKB));
        }

    }

    /**
     * Test of getInheritsFrom method, of class Context.
     */
    @Test
    public void testInheritsFrom_String() throws Exception {
        System.out.println("inheritsFrom");
        Context m = ContextImpl.get(APPLE_PRODUCT_MT_STR);
        m.addInheritsFrom(ORGANIZATION_PRODUCT_MT_STR);
        {
            final Collection<Context> superiors = m.getInheritsFrom();
            assertTrue(superiors.contains(ContextImpl.get(ORGANIZATION_PRODUCT_MT_STR)));
        }

        {
            Context vctx = new ContextImpl(
                    "(AVAnalysisContextFn (AVWorkWithIDFn 123454))");
            final Collection<Context> superiors = vctx.getInheritsFrom();
            assertTrue(superiors.contains(baseKB));
        }
    }

    /**
     * Test of getInheritsFrom method, of class Context.
     */
    @Test
    public void testInheritsFrom_String_String() throws Exception {
        System.out.println("inheritsFrom");
        Context m = ContextImpl.get(APPLE_PRODUCT_MT_STR);
        m.addInheritsFrom(ORGANIZATION_PRODUCT_MT_STR);
        //@todo finish this, and make sure it works from Mt strings...
    }

    /**
     * Test of getInheritsFrom method, of class Context.
     */
    @Test
    public void testInheritsFrom_Context_Context() throws Exception {
        System.out.println("inheritsFrom");
        Context m = ContextImpl.get(APPLE_PRODUCT_MT_STR);
        m.addInheritsFrom(ContextImpl.get(ORGANIZATION_PRODUCT_MT_STR));
        //@todo finish this test...

    }

    /**
     * Test of getMonad method, of class Context.
     */
    @Test
    public void testGetMonad() throws Exception {
        System.out.println("getMonad");
        assertEquals(baseKB, baseKB.getMonad());
    }


    /**
     * Test of getTimeInterval method, of class Context.
     */
    @Test
    public void testGetTimeInterval() throws Exception {
        System.out.println("getTimeInterval");
        assertEquals(ContinuousTimeInterval.ALWAYS, baseKB.getTimeInterval());
        testOneGetTimeInterval(tenToTwentyKInclExcl);
        testOneGetTimeInterval(tenToTwentyKInclIncl);
        testOneGetTimeInterval(tenToTwentyKExclExcl);
        testOneGetTimeInterval(tenToTwentyKExclIncl);
    }
    //@todo add a test where we send a temporally qualified ELMt, and another where we send a temporally qualified context, and make sure the time specification gets
    //replaced by the one sent in as the time interval.

  private void testOneGetTimeInterval(final TimeInterval timeInterval) throws KBApiException, KBTypeException, CreateException {
    final Context hlmt = ContextImpl.get(baseKB, timeInterval);
    assertEquals(timeInterval, hlmt.getTimeInterval());
  }

    /**
     * Test of setTimeInterval method, of class Context.
     */
    @Test
    public void testSetTimeInterval() throws Exception {
        System.out.println("setTimeInterval");
        testOneSetTimeInterval(tenToTwentyKInclExcl);
        testOneSetTimeInterval(tenToTwentyKInclIncl);
        testOneSetTimeInterval(tenToTwentyKExclExcl);
        testOneSetTimeInterval(tenToTwentyKExclIncl);
    }

  private void testOneSetTimeInterval(final TimeInterval timeInterval) throws KBApiException, KBTypeException, CreateException {
    final Context hlmt = ContextImpl.get(baseKB.getCore(),timeInterval);
    assertEquals(timeInterval, hlmt.getTimeInterval());
  }

    /**
     * Test of asELMt method, of class Context.
     */
    @Test
    public void testAsELMt() throws Exception {
        System.out.println("asELMt");
        assertEquals(baseKB.getCore(), baseKB.asELMt());
    }


    @Test
    public void testNautContextCreation() throws KBApiException {
        System.out.println("nautContextCreation");
        ContextImpl c = ContextImpl.get("(MtDim mtTimeIndex (MilliSecondFn 111 (SecondFn 32 (MinuteFn 30 (HourFn 14 (DayFn 21 (MonthFn May (YearFn 2013))))))))");
        System.out.println("Context created: " + c.toString());
    }

    /**
     * ContextFactory get tests
     */
    @Test
    public void testContextFactoryGet() throws KBApiException {
        System.out.println("contextFactoryGet");
        Context c1 = new ContextImpl("BaseKB");
        ContextImpl c2 = new ContextImpl("BaseKB");
        assertFalse("Two different BaseKB are the same object!", c1 == c2);
        assertTrue("Two different BaseKBs are not equals()!", c2.equals(c1));

        c1 = ContextImpl.get("BaseKB");
        c2 = ContextImpl.get("BaseKB");
        assertTrue("Two different BaseKBs are actually different objects!", c2 == c1);
        assertTrue("Two different BaseKBs are not equals()!", c2.equals(c1));



        c2 = ContextImpl.get("BaseKB");
        assertTrue("CycObject-based BaseKB and string-based version differ!", c1 == c2);

        c2 = ContextImpl.get("Mx4rvViBEZwpEbGdrcN5Y29ycA");
        assertTrue("HLID-based BaseKB and string-based version differ!", c1 == c2);

    }

    @Test(expected = KBTypeException.class)
    public void testGetTypeConflictException() throws KBApiException {
        Context c3 = ContextImpl.get("isa");
    }

    @Test(expected = KBTypeException.class)
    public void testGetTypeConflictException2() throws KBApiException {
        //even though i1 could be coerced into a Context, get() isn't supposed to do so.
        KBIndividualImpl i1 = KBIndividualImpl.findOrCreate("TestIndividualForTypeConflict");
        Context c3 = ContextImpl.get("TestIndividualForTypeConflict");
        assertTrue("TestIndividualForTypeConflict shouldn't be a context!", c3 == null);
        i1.delete();
    }

    @Test
    public void testContextFactoryFindOrCreateWorksLikeGet() throws KBApiException {

        Context c1 = ContextImpl.findOrCreate("BaseKB");
        ContextImpl c2 = ContextImpl.findOrCreate("BaseKB");
        assertTrue("Two different BaseKBs are actually different objects!", c2 == c1);
        assertTrue("Two different BaseKBs are not equals()!", c2.equals(c1));

        c2 = ContextImpl.findOrCreate("BaseKB");
        assertTrue("CycObject-based BaseKB and string-based version differ!", c1 == c2);

        c2 = ContextImpl.findOrCreate("Mx4rvViBEZwpEbGdrcN5Y29ycA");
        assertTrue("HLID-based BaseKB and string-based version differ!", c1 == c2);

    }

    @Test
    public void testContextFactoryFindOrCreateOnlyCreatesOneObject() throws KBApiException {

        ContextImpl c1 = ContextImpl.findOrCreate("BaseKB234");
        ContextImpl c2 = ContextImpl.findOrCreate("BaseKB234");
        assertTrue("Two different BaseKB234s are actually different objects!", c2 == c1);
        assertTrue("Two different BaseKB234s are not equals()!", c2.equals(c1));

        c2 = ContextImpl.findOrCreate(c1.getCore());
        assertTrue("CycObject-based BaseKB234 and string-based version differ!", c1 == c2);

        c2 = ContextImpl.findOrCreate(c1.getId());
        assertTrue("HLID-based BaseKB234 and string-based version differ!", c1 == c2);
    }

    @Test(expected = KBTypeConflictException.class)
    public void testFindOrCreateTypeConflictException() throws KBApiException {
        Context c3 = ContextImpl.findOrCreate("isa");
        System.out.println("Done.");
    }

    @Test(expected = InvalidNameException.class)
    public void testFindOrCreateInvalidNameException() throws KBApiException {
        @SuppressWarnings("unused")
        Context c3 = ContextImpl.findOrCreate("isa@#$SVA!@#R");
    }

    @Test
    public void testFindOrCreateCoerces() throws KBApiException, Exception {
        KBIndividualImpl i1 = null;
        ContextImpl c3 = null;
        String name = "TestIndividualForTypeConflict3";
        try {
            i1 = KBIndividualImpl.findOrCreate(name);
            c3 = ContextImpl.findOrCreate(name);
            assertTrue("c3 is null", c3 != null);
            assertTrue("i1's CycL wasn't coerced into a context", c3.getCore().equals(i1.getCore()));
            assertTrue("i1 didn't get turned into a #$Microtheory", i1.isInstanceOf("Microtheory", "BaseKB"));
        } finally {
            if (c3 != null) {
                c3.delete();
            }
            if (i1 != null) {
                try {
                i1.delete();
                } catch (KBApiRuntimeException ex) {
                    //it's not there any more, so it's hard to delete...
                }
            }
        }
    }

    @Test
    public void testContextFactoryGetStatus() throws KBApiException {
        KBIndividualImpl i1 = null;
        try {
            String testIndName = "TestIndividualForTypeConflict4";
            assertTrue("BaseKB isn't a context!", ContextImpl.getStatus("BaseKB").equals(KBStatus.EXISTS_AS_TYPE));
            assertTrue("isa isn't in type-conflict with context!", ContextImpl.getStatus("isa").equals(KBStatus.EXISTS_WITH_TYPE_CONFLICT));
            assertTrue(testIndName + " shouldn't exist at all.",
                    ContextImpl.getStatus(testIndName).equals(KBStatus.DOES_NOT_EXIST));
            i1 = new KBIndividualImpl(testIndName);
            assertTrue(testIndName + " should be convertible to a Context",
                    ContextImpl.getStatus(testIndName).equals(KBStatus.EXISTS_WITH_COMPATIBLE_TYPE));
        } finally {
            if (i1 != null) {
                i1.delete();
            }
        }
    }

    @Test
    public void testContextFactoryExistsAsType() throws KBApiException {
        KBIndividualImpl i1 = null;
        try {
            String testIndName = "TestIndividualForTypeConflict";

            assertTrue("BaseKB isn't a context!", ContextImpl.existsAsType("BaseKB"));
            assertFalse("isa is a context!", ContextImpl.existsAsType("isa"));
            assertFalse(testIndName + " is a context.", ContextImpl.existsAsType(testIndName));
            i1 = KBIndividualImpl.findOrCreate(testIndName);
            assertFalse(testIndName + " is a context!", ContextImpl.existsAsType(testIndName));
        } finally {
            if (i1 != null) {
                i1.delete();
            }
        }
    }
}
