package com.cyc.kb;

import com.cyc.kb.exception.KBApiException;
import static com.cyc.kb.TestConstants.baseKB;
import com.cyc.kb.exception.InvalidNameException;
import com.cyc.kb.exception.KBTypeConflictException;
import com.cyc.kb.exception.KBTypeException;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.logging.Logger;
import static org.junit.Assert.*;
import org.junit.*;
import org.opencyc.api.CycAccess;
import org.opencyc.util.ContinuousTimeInterval;
import org.opencyc.util.ContinuousTimeInterval.TimeIntervalFunction;
import org.opencyc.util.TimeInterval;

/**
 *
 * @author baxter
 */
public class ContextTest {

    private static final String APPLE_PRODUCT_MT_STR = "AppleProductMt";
    private static final String BASE_KB_STR = "BaseKB";
    private static final String I_PAD_PRODUCT_MT_STR = "iPadProductMt";
    private static final String ORGANIZATION_PRODUCT_MT_STR = "OrganizationProductMt";
    private static final String UNIVERSAL_VOCABULARY_MT_STR = "UniversalVocabularyMt";

    public ContextTest() {
    }
    private static Logger log = null;
    private static TimeInterval tenToTwentyKInclExcl = null;

    @BeforeClass
    public static void setUpClass() throws Exception {
        log = Logger.getLogger(ContextTest.class.getName());
        TestConstants.ensureInitialized();
        final Date start = new Date(10000);
        final Date end = new Date(20000);
        tenToTwentyKInclExcl = TimeIntervalFunction.INCL_EXCL.constructTimeInterval(
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
        Context ctxObject = Context.get(ctx);

        Context c = Context.findOrCreate(str, constrainingCol, ctx);
        assertEquals(c.getCore().cyclify(), "#$EnglishMt");

        c = Context.get(str);
        assertEquals(c.getCore().cyclify(), "#$EnglishMt");
        assertEquals(ctxObject.getCore().toString(), "UniversalVocabularyMt");


        String hlId = "Mx4rvViAiZwpEbGdrcN5Y29ycA";
        c = Context.get(hlId);
        assertEquals(c.getCore().cyclify(), "#$EnglishMt");
    }

    /**
     * Test of getExtensions method, of class Context.
     */
    @Test
    public void testExtendedBy_Context() throws Exception {
        System.out.println("extendedBy");
        Context m = Context.findOrCreate(APPLE_PRODUCT_MT_STR);
        m.addExtension(Context.findOrCreate(I_PAD_PRODUCT_MT_STR));
        final java.util.Collection<Context> inferiors = m.getExtensions();
        assertTrue(inferiors.contains(Context.get(I_PAD_PRODUCT_MT_STR)));
    }

    /**
     * Test of getExtensions method, of class Context.
     */
    @Test
    public void testExtendedBy_String() throws Exception {
        System.out.println("extendedBy");
        Context m = Context.findOrCreate(APPLE_PRODUCT_MT_STR);
        m.addExtension(Context.findOrCreate(I_PAD_PRODUCT_MT_STR));
        final java.util.Collection<Context> inferiors = m.getExtensions();
        assertTrue(inferiors.contains(Context.get(I_PAD_PRODUCT_MT_STR)));
    }


    /**
     * Test of getInheritsFrom method, of class Context.
     */
    @Test
    public void testInheritsFrom_0args() throws Exception {
        System.out.println("inheritsFrom");
        Context m = Context.findOrCreate(APPLE_PRODUCT_MT_STR);
        m.addInheritsFrom(ORGANIZATION_PRODUCT_MT_STR);
        {
            final java.util.Collection<Context> superiors = m.getInheritsFrom();
            assertTrue(superiors.contains(Context.get(ORGANIZATION_PRODUCT_MT_STR)));
        }

        {
            Context vctx = new Context(
                    "(AVAnalysisContextFn (AVWorkWithIDFn 123454))");
            final java.util.Collection<Context> superiors = vctx.getInheritsFrom();
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
        Context m = Context.get(APPLE_PRODUCT_MT_STR);
        m.addInheritsFrom(ORGANIZATION_PRODUCT_MT_STR);
        {
            final java.util.Collection<Context> superiors = m.getInheritsFrom();
            assertTrue(superiors.contains(Context.get(ORGANIZATION_PRODUCT_MT_STR)));
        }

        {
            Context vctx = new Context(
                    "(AVAnalysisContextFn (AVWorkWithIDFn 123454))");
            final java.util.Collection<Context> superiors = vctx.getInheritsFrom();
            assertTrue(superiors.contains(baseKB));
        }
    }

    /**
     * Test of getInheritsFrom method, of class Context.
     */
    @Test
    public void testInheritsFrom_String_String() throws Exception {
        System.out.println("inheritsFrom");
        Context m = Context.get(APPLE_PRODUCT_MT_STR);
        m.addInheritsFrom(ORGANIZATION_PRODUCT_MT_STR);
        //@todo finish this, and make sure it works from Mt strings...
    }

    /**
     * Test of getInheritsFrom method, of class Context.
     */
    @Test
    public void testInheritsFrom_Context_Context() throws Exception {
        System.out.println("inheritsFrom");
        Context m = Context.get(APPLE_PRODUCT_MT_STR);
        m.addInheritsFrom(Context.get(ORGANIZATION_PRODUCT_MT_STR));
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
        final Context hlmt = Context.get(baseKB, tenToTwentyKInclExcl);
        assertEquals(tenToTwentyKInclExcl, hlmt.getTimeInterval());
    }
    //@todo add a test where we send a temporally qualified ELMt, and another where we send a temporally qualified context, and make sure the time specification gets
    //replaced by the one sent in as the time interval.

    /**
     * Test of setTimeInterval method, of class Context.
     */
    @Test
    public void testSetTimeInterval() throws Exception {
        System.out.println("setTimeInterval");
        final Context hlmt = Context.get(baseKB.getCore(),tenToTwentyKInclExcl);
        assertEquals(tenToTwentyKInclExcl, hlmt.getTimeInterval());
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
        Context c = Context.get("(MtDim mtTimeIndex (MilliSecondFn 111 (SecondFn 32 (MinuteFn 30 (HourFn 14 (DayFn 21 (MonthFn May (YearFn 2013))))))))");
        System.out.println("Context created: " + c.toString());
    }

    /**
     * ContextFactory get tests
     */
    @Test
    public void testContextFactoryGet() throws KBApiException {
        System.out.println("contextFactoryGet");
        Context c1 = new Context("BaseKB");
        Context c2 = new Context("BaseKB");
        assertFalse("Two different BaseKB are the same object!", c1 == c2);
        assertTrue("Two different BaseKBs are not equals()!", c2.equals(c1));

        c1 = Context.get("BaseKB");
        c2 = Context.get("BaseKB");
        assertTrue("Two different BaseKBs are actually different objects!", c2 == c1);
        assertTrue("Two different BaseKBs are not equals()!", c2.equals(c1));



        c2 = Context.get(CycAccess.baseKB);
        assertTrue("CycObject-based BaseKB and string-based version differ!", c1 == c2);

        c2 = Context.get("Mx4rvViBEZwpEbGdrcN5Y29ycA");
        assertTrue("HLID-based BaseKB and string-based version differ!", c1 == c2);

    }

    @Test(expected = KBTypeException.class)
    public void testGetTypeConflictException() throws KBApiException {
        Context c3 = Context.get("isa");
    }

    @Test(expected = KBTypeException.class)
    public void testGetTypeConflictException2() throws KBApiException {
        //even though i1 could be coerced into a Context, get() isn't supposed to do so.
        KBIndividual i1 = KBIndividual.findOrCreate("TestIndividualForTypeConflict");
        Context c3 = Context.get("TestIndividualForTypeConflict");
        assertTrue("TestIndividualForTypeConflict shouldn't be a context!", c3 == null);
        i1.delete();
    }

    @Test
    public void testContextFactoryFindOrCreateWorksLikeGet() throws KBApiException {

        Context c1 = Context.findOrCreate("BaseKB");
        Context c2 = Context.findOrCreate("BaseKB");
        assertTrue("Two different BaseKBs are actually different objects!", c2 == c1);
        assertTrue("Two different BaseKBs are not equals()!", c2.equals(c1));

        c2 = Context.findOrCreate(CycAccess.baseKB);
        assertTrue("CycObject-based BaseKB and string-based version differ!", c1 == c2);

        c2 = Context.findOrCreate("Mx4rvViBEZwpEbGdrcN5Y29ycA");
        assertTrue("HLID-based BaseKB and string-based version differ!", c1 == c2);

    }

    @Test
    public void testContextFactoryFindOrCreateOnlyCreatesOneObject() throws KBApiException {

        Context c1 = Context.findOrCreate("BaseKB234");
        Context c2 = Context.findOrCreate("BaseKB234");
        assertTrue("Two different BaseKB234s are actually different objects!", c2 == c1);
        assertTrue("Two different BaseKB234s are not equals()!", c2.equals(c1));

        c2 = Context.findOrCreate(c1.getCore());
        assertTrue("CycObject-based BaseKB234 and string-based version differ!", c1 == c2);

        c2 = Context.findOrCreate(c1.getId());
        assertTrue("HLID-based BaseKB234 and string-based version differ!", c1 == c2);
    }

    @Test(expected = KBTypeConflictException.class)
    public void testFindOrCreateTypeConflictException() throws KBApiException {
        Context c3 = Context.findOrCreate("isa");
        System.out.println("Done.");
    }

    @Test(expected = InvalidNameException.class)
    public void testFindOrCreateInvalidNameException() throws KBApiException {
        Context c3 = Context.findOrCreate("isa@#$SVA!@#R");
    }

    @Test
    public void testFindOrCreateCoerces() throws KBApiException, Exception {
        KBIndividual i1 = null;
        Context c3 = null;
        String name = "TestIndividualForTypeConflict3";
        try {
            i1 = KBIndividual.findOrCreate(name);
            c3 = Context.findOrCreate(name);
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
                } catch (KBApiException ex) {
                    //it's not there any more, so it's hard to delete...
                }
            }
        }
    }

    @Test
    public void testContextFactoryGetStatus() throws KBApiException {
        KBIndividual i1 = null;
        try {
            String testIndName = "TestIndividualForTypeConflict4";
            assertTrue("BaseKB isn't a context!", Context.getStatus("BaseKB").equals(KBStatus.EXISTS_AS_TYPE));
            assertTrue("isa isn't in type-conflict with context!", Context.getStatus("isa").equals(KBStatus.EXISTS_WITH_TYPE_CONFLICT));
            assertTrue(testIndName + " shouldn't exist at all.",
                    Context.getStatus(testIndName).equals(KBStatus.DOES_NOT_EXIST));
            i1 = new KBIndividual(testIndName);
            assertTrue(testIndName + " should be convertible to a Context",
                    Context.getStatus(testIndName).equals(KBStatus.EXISTS_WITH_COMPATIBLE_TYPE));
        } finally {
            if (i1 != null) {
                i1.delete();
            }
        }
    }

    @Test
    public void testContextFactoryExistsAsType() throws KBApiException {
        KBIndividual i1 = null;
        try {
            String testIndName = "TestIndividualForTypeConflict";

            assertTrue("BaseKB isn't a context!", Context.existsAsType("BaseKB"));
            assertFalse("isa is a context!", Context.existsAsType("isa"));
            assertFalse(testIndName + " is a context.", Context.existsAsType(testIndName));
            i1 = KBIndividual.findOrCreate(testIndName);
            assertFalse(testIndName + " is a context!", Context.existsAsType(testIndName));
        } finally {
            if (i1 != null) {
                i1.delete();
            }
        }
    }
}
