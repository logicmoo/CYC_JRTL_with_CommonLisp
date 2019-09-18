package com.cyc.kb;

import com.cyc.kb.exception.InvalidNameException;
import com.cyc.kb.exception.KBApiException;
import java.util.logging.Logger;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;
import org.opencyc.cycobject.CycConstant;
import org.opencyc.cycobject.Guid;

public class KBTermTest {

    private static Logger log = null;

    @BeforeClass
    public static void setUp() throws Exception {
        log = Logger.getLogger(KBTermTest.class.getName());
        TestConstants.ensureInitialized();
    }

    @AfterClass
    public static void tearDown() throws Exception {
    }

    
    @Test
    public void testIsInstanceOf() throws KBApiException {      
            KBTerm hc = KBTerm.get("HumanCyclist");
            assertTrue(hc.isInstanceOf("Collection", "UniversalVocabularyMt"));
            KBCollection thing = KBCollection.get("Thing");
            assertTrue(hc.isInstanceOf(thing, Context.get("UniversalVocabularyMt")));
            assertTrue(thing.isInstanceOf(thing, Context.get("UniversalVocabularyMt")));
            assertTrue(thing.isInstanceOf(KBCollection.get("Collection"), Context.get("UniversalVocabularyMt")));
    }
    
    
    /**
     * KBTermFactory get tests
     */
    @Test
    public void testKBTermFactoryGet() throws KBApiException {
        System.out.println("collectionFactoryGet");
        KBTerm c1 = new KBTerm("Emu");
        KBTerm c2 = new KBTerm("Emu");
        assertFalse("Two different Emu are the same object!", c1 == c2);
        assertTrue("Two different Emu are not equals()!", c2.equals(c1));


        c1 = KBCollection.get("Emu");
        c2 = KBCollection.get(new CycConstant("Emu", new Guid("c01a4ba0-9c29-11b1-9dad-c379636f7270")));
        assertTrue("CycObject-based BaseKB and string-based version differ!", c1 == c2);

        c2 = KBCollection.get("Mx4rwBpLoJwpEbGdrcN5Y29ycA");
        assertTrue("HLID-based BaseKB and string-based version differ!", c1 == c2);

    }

    @Test
    public void testNoGetTypeConflictException() throws KBApiException {
        //make sure that all of these different kinds of things can be KBTerms.
        KBTerm c3 = KBTerm.get("isa");
        KBTerm c4 = KBTerm.get("Dog");
        KBTerm c5 = KBTerm.get("BillClinton"); 
        assertTrue(true);
    }

    @Test
    public void testCollectionFactoryFindOrCreateWorksLikeGet() throws KBApiException {

        KBCollection c1 = KBCollection.findOrCreate("Emu");
        KBCollection c2 = KBCollection.findOrCreate("Emu");
        assertTrue("Two different BaseKBs are actually different objects!", c2 == c1);
        assertTrue("Two different BaseKBs are not equals()!", c2.equals(c1));

        c2 = KBCollection.findOrCreate(new CycConstant("Emu", new Guid("c01a4ba0-9c29-11b1-9dad-c379636f7270")));
        assertTrue("CycObject-based BaseKB and string-based version differ!", c1 == c2);

        c2 = KBCollection.findOrCreate("Mx4rwBpLoJwpEbGdrcN5Y29ycA");
        assertTrue("HLID-based BaseKB and string-based version differ!", c1 == c2);

    }

    @Test
    public void testFactoryFindOrCreateOnlyCreatesOneObject() throws KBApiException {

        KBTerm c1 = KBTerm.findOrCreate("Emu234");
        KBTerm c2 = KBTerm.findOrCreate("Emu234");
        assertTrue("Two different Emu234s are actually different objects!", c2 == c1);
        assertTrue("Two different Emu234s are not equals()!", c2.equals(c1));

        c2 = KBTerm.findOrCreate(c1.getCore());
        assertTrue("CycObject-based Emu234 and string-based version differ!", c1 == c2);

        c2 = KBTerm.findOrCreate(c1.getId());
        assertTrue("HLID-based BaseKB234 and string-based version differ!", c1 == c2);
    }


    @Test(expected = InvalidNameException.class)
    public void testFindOrCreateInvalidNameException() throws KBApiException {
        KBTerm c3 = KBTerm.findOrCreate("Emu@#$SVA!@#R");
    }


    @Test
    public void testCollectionFactoryGetStatus() throws KBApiException {
        KBIndividual i1 = null;
        String testIndName = "TestIndividualForTypeConflict34";
        try {
            assertTrue("Emu isn't a KBTerm!", KBTerm.getStatus("Emu").equals(KBStatus.EXISTS_AS_TYPE));
            assertTrue("isa isn't in a KBTerm!", KBTerm.getStatus("isa").equals(KBStatus.EXISTS_AS_TYPE));
            assertTrue(testIndName + " shouldn't exist at all, but has status " + KBTerm.getStatus(testIndName) + ".",
                    KBTerm.getStatus(testIndName).equals(KBStatus.DOES_NOT_EXIST));
            System.out.println("Status = " + KBTerm.getStatus(testIndName));
        } finally {
            if (KBTerm.getStatus(testIndName) != KBStatus.DOES_NOT_EXIST) {
                KBTerm.get(testIndName).delete();
            }
        }
    }

    @Test
    public void testCollectionFactoryExistsAsType() throws KBApiException {
        KBTerm i1 = null;
        try {
            String testIndName = "TestIndividualForTypeConflict";

            i1 = KBTerm.findOrCreate(testIndName);
            assertFalse(testIndName + " is a collection!", KBCollection.existsAsType(testIndName));
            assertTrue(testIndName + " is not a KBTerm!", KBTerm.existsAsType(testIndName));

        } finally {
            if (i1 != null) {
                i1.delete();
            }
        }
    }
    
}
