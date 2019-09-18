package com.cyc.baseclient;

import com.cyc.base.CycAccess;
import com.cyc.base.CycConnectionException;
import com.cyc.base.cycobject.CycConstantI;
import com.cyc.base.cycobject.Fort;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.cyc.baseclient.cycobject.CycConstant;
import com.cyc.baseclient.cycobject.CycFormulaSentence;
import com.cyc.base.cycobject.ELMt;
import com.cyc.base.CycApiException;
import com.cyc.baseclient.ui.InteractiveCycAccessProvider;

/**
 *
 * @author daves
 */
public class SimpleKBTransactionTest {

    static CycAccess cyc = null;

    public SimpleKBTransactionTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        cyc = InteractiveCycAccessProvider.get().getAccess("localhost", 3600);
        CycClientManager.get().setCurrentAccess(cyc);

    }

    @AfterClass
    public static void tearDownClass() {
        CycClientManager.get().getCurrentAccess().close();
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
        CycClient.setCurrentTransaction(null);
    }

    /**
     * Test of begin method, of class SimpleKBTransaction.
     */
    @Test
    public void testBegin() {
        System.out.println("begin");
        SimpleKBTransaction instance = new SimpleKBTransaction();
        instance.begin();
        assertTrue(CycClient.getCurrentTransaction().equals(instance));
        instance.commit();
        assertTrue(CycClient.getCurrentTransaction() == null);
    }

    /**
     * Test of begin method, of class SimpleKBTransaction. Make sure we throw an
     * Exception if you try to nest transactions.
     */
    @Test(expected = IllegalStateException.class)
    public void testBegin2() {
        System.out.println("begin2");
        SimpleKBTransaction instance = new SimpleKBTransaction();
        SimpleKBTransaction instance2 = new SimpleKBTransaction();
        instance.begin();
        instance2.begin();
    }

    /**
     * Test of commit method, of class SimpleKBTransaction.
     */
    @Test
    public void testCommit() throws CycConnectionException {
        System.out.println("commit");
        CycConstantI commitTestConstant = null;
        CycConstantI commitTestConstant2 = null;
        assertTrue("commitTestConstant already exists.", cyc.getLookupTool().getConstantByName("commitTestConstant") == null);
        assertTrue("commitTestConstant2 already exists.", cyc.getLookupTool().getConstantByName("commitTestConstant2") == null);
        try {
            commitTestConstant2 = cyc.getAssertTool().createNewPermanent("commitTestConstant2");
            cyc.getAssertTool().assertGaf(CycFormulaSentence.makeCycSentence("(#$isa #$commitTestConstant2 #$Predicate)"), CommonConstants.baseKB);
            assert (cyc.getInspectorTool().isPredicate(commitTestConstant2));

            SimpleKBTransaction instance = new SimpleKBTransaction();
            CycClient.setCurrentTransaction(instance);
            assertTrue("Before commit, there's no active KBTransaction", CycClient.getCurrentTransaction() != null);
            cyc.getUnassertTool().unassertGaf(CycFormulaSentence.makeCycSentence("(#$isa #$commitTestConstant2 #$Predicate)"), CommonConstants.baseKB);
            assertTrue("Before commit, commitTestConstant2 is not known to be a predicate.", cyc.getInspectorTool().isPredicate(commitTestConstant2));
            commitTestConstant = cyc.getAssertTool().createNewPermanent("commitTestConstant");
            assertTrue("Unable to find commitTestConstant before commit.", cyc.getLookupTool().getConstantByName("commitTestConstant") != null);

            cyc.getAssertTool().assertGaf(CycFormulaSentence.makeCycSentence("(#$isa #$commitTestConstant #$Predicate)"), CommonConstants.baseKB);
            assertFalse("commitTestConstant is known to be a predicate before the transaction has been committed.", cyc.getInspectorTool().isPredicate(commitTestConstant));

            instance.commit();

            assertTrue("Unable to find commitTestConstant after commit.", cyc.getLookupTool().getConstantByName("commitTestConstant") != null);
            assertTrue("commitTestConstant is not known to be a predicate after the transaction has been committed.", cyc.getInspectorTool().isPredicate(commitTestConstant));
            assertFalse("After commit, commitTestConstant2 is known to be a predicate.", cyc.getInspectorTool().isPredicate(commitTestConstant2));

            assertTrue("After commit, there's still an active KBTransaction", CycClient.getCurrentTransaction() == null);

        } finally {
            if (cyc.getLookupTool().getConstantByName("commitTestConstant") != null) {
                cyc.getUnassertTool().kill(cyc.getLookupTool().getConstantByName("commitTestConstant"));
            }
            if (cyc.getLookupTool().getConstantByName("commitTestConstant2") != null) {
                cyc.getUnassertTool().kill(cyc.getLookupTool().getConstantByName("commitTestConstant2"));
            }

        }
    }

    /**
     * Test that commit fails when there's a bad assertion, and that it is
     * correctly rolled back.
     */
    @Test
    public void testCommitFailure() throws CycConnectionException {
        System.out.println("commit");
        CycConstantI commitTestConstant = null;
        assertTrue("commitTestConstant already exists.", cyc.getLookupTool().getConstantByName("commitTestConstant") == null);

        CycConstantI commitTestConstant2 = null;
        assertTrue("commitTestConstant2 already exists.", cyc.getLookupTool().getConstantByName("commitTestConstant2") == null);

        try {
            commitTestConstant2 = cyc.getAssertTool().createNewPermanent("commitTestConstant2");
            cyc.getAssertTool().assertGaf(CycFormulaSentence.makeCycSentence("(#$isa #$commitTestConstant2 #$Predicate)"), CommonConstants.baseKB);
            assert (cyc.getInspectorTool().isPredicate(commitTestConstant2));

            SimpleKBTransaction instance = new SimpleKBTransaction();
            CycClient.setCurrentTransaction(instance);

            cyc.getUnassertTool().unassertGaf(CycFormulaSentence.makeCycSentence("(#$isa #$commitTestConstant2 #$Predicate)"), CommonConstants.baseKB);

            cyc.getAssertTool().assertGaf(CycFormulaSentence.makeCycSentence("(#$isa #$commitTestConstant2 #$BinaryPredicate)"), CommonConstants.baseKB);

            commitTestConstant = cyc.getAssertTool().createNewPermanent("commitTestConstant");
            cyc.getAssertTool().assertGaf(CycFormulaSentence.makeCycSentence("(#$isa #$commitTestConstant #$Predicate)"), CommonConstants.baseKB);
            cyc.getAssertTool().assertGaf(CycFormulaSentence.makeCycSentence("(#$isa #$commitTestConstant #$isa)"), CommonConstants.baseKB);
            assertFalse("commitTestConstant is known to be a predicate before the transaction has been committed.", cyc.getInspectorTool().isPredicate(commitTestConstant));
            Exception ex = null;
            try {
                instance.commit();
            } catch (Exception e) {
                ex = e;
            }
            assertTrue("Commit with nonsense assertion didn't trigger an exception", ex instanceof RuntimeException);


            assertTrue("After failed commit, there's still an active KBTransaction", CycClient.getCurrentTransaction() == null);

            instance.rollback();
            assertTrue("commitTestConstant was not deleted after rollback.", cyc.getLookupTool().getConstantByName("commitTestConstant") == null);
            assertFalse("commitTestConstant2 is known to be a binary predicate after the transaction rollback.", cyc.getInspectorTool().isBinaryPredicate(commitTestConstant2));
            assertTrue("commitTestConstant2 is not known to be a predicate after the transaction rollback.", cyc.getInspectorTool().isPredicate(commitTestConstant2));


        } finally {
            if (cyc.getLookupTool().getConstantByName("commitTestConstant") != null) {
                cyc.getUnassertTool().kill(cyc.getLookupTool().getConstantByName("commitTestConstant"));
            }
            if (cyc.getLookupTool().getConstantByName("commitTestConstant2") != null) {
                cyc.getUnassertTool().kill(cyc.getLookupTool().getConstantByName("commitTestConstant2"));
            }

        }
    }

    /**
     * Test of rollback method, of class SimpleKBTransaction.
     */
    @Test
    public void testRollback() throws Exception {
        System.out.println("rollback");

        System.out.println("commit");
        CycConstantI commitTestConstant = null;
        CycConstantI commitTestConstant2 = null;
        assertTrue("commitTestConstant already exists.", cyc.getLookupTool().getConstantByName("commitTestConstant") == null);
        assertTrue("commitTestConstant2 already exists.", cyc.getLookupTool().getConstantByName("commitTestConstant2") == null);
        try {
            commitTestConstant2 = cyc.getAssertTool().createNewPermanent("commitTestConstant2");
            cyc.getAssertTool().assertGaf(CycFormulaSentence.makeCycSentence("(#$isa #$commitTestConstant2 #$Predicate)"), CommonConstants.baseKB);
            assert (cyc.getInspectorTool().isPredicate(commitTestConstant2));

            SimpleKBTransaction instance = new SimpleKBTransaction();
            CycClient.setCurrentTransaction(instance);
            assertTrue("Before commit, there's no active KBTransaction", CycClient.getCurrentTransaction() != null);
            cyc.getUnassertTool().unassertGaf(CycFormulaSentence.makeCycSentence("(#$isa #$commitTestConstant2 #$Predicate)"), CommonConstants.baseKB);
            assertTrue("Before commit, commitTestConstant2 is not known to be a predicate.", cyc.getInspectorTool().isPredicate(commitTestConstant2));
            cyc.getAssertTool().assertGaf(CycFormulaSentence.makeCycSentence("(#$isa #$commitTestConstant2 #$BinaryPredicate)"), CommonConstants.baseKB);



            commitTestConstant = cyc.getAssertTool().createNewPermanent("commitTestConstant");
            assertTrue("Unable to find commitTestConstant before commit.", cyc.getLookupTool().getConstantByName("commitTestConstant") != null);

            cyc.getAssertTool().assertGaf(CycFormulaSentence.makeCycSentence("(#$isa #$commitTestConstant #$Predicate)"), CommonConstants.baseKB);
            assertFalse("commitTestConstant is known to be a predicate before the transaction has been committed.", cyc.getInspectorTool().isPredicate(commitTestConstant));

            instance.rollback();

            assertFalse("Able to find commitTestConstant after rollback.", cyc.getLookupTool().getConstantByName("commitTestConstant") != null);
            assertTrue("After rollback, commitTestConstant2 is not known to be a predicate.", cyc.getInspectorTool().isPredicate(commitTestConstant2));
            assertFalse("After rollback, commitTestConstant2 is known to be a binary predicate.", cyc.getInspectorTool().isBinaryPredicate(commitTestConstant2));

        } finally {
            if (cyc.getLookupTool().getConstantByName("commitTestConstant") != null) {
                cyc.getUnassertTool().kill(cyc.getLookupTool().getConstantByName("commitTestConstant"));
            }
            if (cyc.getLookupTool().getConstantByName("commitTestConstant2") != null) {
                cyc.getUnassertTool().kill(cyc.getLookupTool().getConstantByName("commitTestConstant2"));
            }
            CycClient.setCurrentTransaction(null);

        }
    }

    /**
     * Test of noteForAssertion method, of class SimpleKBTransaction.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testNoteForAssertion() {
        System.out.println("noteForAssertion");
        String sentence = "(#$isa #$Collection #$Thing)";
        ELMt mt = null;
        boolean bookkeeping = false;
        boolean transcripting = false;
        boolean wffDisabled = false;
        List<Fort> templates = new ArrayList<Fort>();
        SimpleKBTransaction instance = new SimpleKBTransaction();
        instance.noteForAssertion(sentence, mt, bookkeeping, transcripting, wffDisabled, templates);
        bookkeeping = true;
        instance.noteForAssertion(sentence, mt, bookkeeping, transcripting, wffDisabled, templates);
        assertTrue(instance.getAssertInfo().size() == 2);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of noteForUnassertion method, of class SimpleKBTransaction.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testNoteForAssertion2() {
        System.out.println("noteForAssertion2");
        String sentence = "(#$isa #$Collection #$Thing)";
        ELMt mt = null;
        boolean bookkeeping = false;
        boolean transcripting = false;
        boolean wffDisabled = false;
        List<Fort> templates = new ArrayList<Fort>();
        SimpleKBTransaction instance = new SimpleKBTransaction();
        instance.noteForAssertion(sentence, mt, bookkeeping, transcripting, wffDisabled, templates);
        transcripting = true;
        instance.noteForAssertion(sentence, mt, bookkeeping, transcripting, wffDisabled, templates);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of noteForUnassertion method, of class SimpleKBTransaction.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testNoteForAssertion2a() {
        System.out.println("noteForAssertion2a");
        String sentence = "(#$isa #$Collection #$Thing)";
        ELMt mt = null;
        boolean bookkeeping = false;
        boolean transcripting = false;
        boolean wffDisabled = false;
        List<Fort> templates = new ArrayList<Fort>();
        SimpleKBTransaction instance = new SimpleKBTransaction();
        instance.noteForAssertion(sentence, mt, bookkeeping, transcripting, wffDisabled, templates);
        wffDisabled = true;
        instance.noteForAssertion(sentence, mt, bookkeeping, transcripting, wffDisabled, templates);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of noteForUnassertion method, of class SimpleKBTransaction. Ensure
     * that an exception is thrown if the forward-inference templates are
     * changed in mid-transaction.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testNoteForAssertion2b() throws CycConnectionException {
        System.out.println("noteForAssertion2b");
        String sentence = "(#$isa #$Collection #$Thing)";
        ELMt mt = null;
        boolean bookkeeping = false;
        boolean transcripting = false;
        boolean wffDisabled = false;
        List<Fort> templates = new ArrayList<Fort>();
        SimpleKBTransaction instance = new SimpleKBTransaction();
        instance.noteForAssertion(sentence, mt, bookkeeping, transcripting, wffDisabled, templates);
        templates.add((Fort) CycClientManager.get().getCurrentAccess().getObjectTool().makeELMt("#$Thing"));
        instance.noteForAssertion(sentence, mt, bookkeeping, transcripting, wffDisabled, templates);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of noteForUnassertion method, of class SimpleKBTransaction. Make
     * sure we can change the Mt without complication.
     */
    @Test
    public void testNoteForAssertion3() {
        try {
            System.out.println("noteForAssertion3");
            String sentence = "(#$isa #$Collection #$Thing)";
            ELMt mt = CycClientManager.get().getCurrentAccess().getObjectTool().makeELMt("#$UniversalVocabularyMt");
            boolean bookkeeping = false;
            boolean transcripting = false;
            boolean wffDisabled = false;
            List<Fort> templates = new ArrayList<Fort>();
            SimpleKBTransaction instance = new SimpleKBTransaction();
            instance.noteForAssertion(sentence, mt, bookkeeping, transcripting, wffDisabled, templates);
            mt = CycClientManager.get().getCurrentAccess().getObjectTool().makeELMt("#$BaseKB");
            instance.noteForAssertion(sentence, mt, bookkeeping, transcripting, wffDisabled, templates);
            assertTrue(true);
        } catch (CycConnectionException ex) {
            Logger.getLogger(SimpleKBTransactionTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Threw unexpected IOException");
        } catch (CycApiException ex) {
            Logger.getLogger(SimpleKBTransactionTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Threw unexpected CycApiException");
        }
    }

    /**
     * Test of noteForUnassertion method, of class SimpleKBTransaction. make
     * sure we can actually unassert lots of sentences, as long as we don't
     * change anything that's supposed to be constant.
     */
    @Test
    public void testNoteForAssertion4() {
        try {
            System.out.println("noteForAssertion4");
            String sentence = "(#$isa #$Collection #$Thing)";
            ELMt mt = null;
            boolean bookkeeping = false;
            boolean transcripting = false;
            boolean wffDisabled = false;
            List<Fort> templates = new ArrayList<Fort>();
            SimpleKBTransaction instance = new SimpleKBTransaction();
            mt = CycClientManager.get().getCurrentAccess().getObjectTool().makeELMt("#$BaseKB");
            instance.noteForAssertion(sentence, mt, bookkeeping, transcripting, wffDisabled, templates);
            instance.noteForAssertion(sentence, mt, bookkeeping, transcripting, wffDisabled, templates);
            sentence = "(#$isa #$Thing #$Collection)";
            instance.noteForAssertion(sentence, mt, bookkeeping, transcripting, wffDisabled, templates);
            assertTrue(true);
        } catch (CycConnectionException ex) {
            Logger.getLogger(SimpleKBTransactionTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Threw unexpected IOException" + ex.getMessage());
        } catch (CycApiException ex) {
            Logger.getLogger(SimpleKBTransactionTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Threw unexpected CycApiException" + ex.getMessage());
        }
    }

    /**
     * Test of noteForUnassertion method, of class SimpleKBTransaction. Make
     * sure that an exception is thrown if you try to assert a sentence after
     * unasserting the very same sentence.
     */
    @Test(expected = UnsupportedOperationException.class)
    public void testNoteForAssertion5() {
        try {
            System.out.println("noteForAssertion4");
            String sentence = "(#$isa #$Collection #$Thing)";
            ELMt mt = null;
            boolean bookkeeping = false;
            boolean transcripting = false;
            boolean wffDisabled = false;
            List<Fort> templates = new ArrayList<Fort>();
            SimpleKBTransaction instance = new SimpleKBTransaction();
            mt = CycClientManager.get().getCurrentAccess().getObjectTool().makeELMt("#$BaseKB");
            instance.noteForUnassertion(sentence, mt, bookkeeping, transcripting);
            instance.noteForAssertion(sentence, mt, bookkeeping, transcripting, wffDisabled, templates);
        } catch (CycConnectionException ex) {
            Logger.getLogger(SimpleKBTransactionTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Threw unexpected IOException" + ex.getMessage());
        } catch (CycApiException ex) {
            Logger.getLogger(SimpleKBTransactionTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Threw unexpected CycApiException" + ex.getMessage());
        }
    }

    //@todo add tests to make sure the transaction info has the right stuff (i.e. right number of asserts/unasserts, correct creates, etc.)
    /**
     * Test of noteForUnassertion method, of class SimpleKBTransaction.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testNoteForUnassertion() {
        System.out.println("noteForUnassertion");
        String sentence = "(#$isa #$Collection #$Thing)";
        ELMt mt = null;
        boolean bookkeeping = false;
        boolean transcripting = false;
        SimpleKBTransaction instance = new SimpleKBTransaction();
        instance.noteForUnassertion(sentence, mt, bookkeeping, transcripting);
        bookkeeping = true;
        instance.noteForUnassertion(sentence, mt, bookkeeping, transcripting);
    }

    /**
     * Test of noteForUnassertion method, of class SimpleKBTransaction.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testNoteForUnassertion2() {
        System.out.println("noteForUnassertion2");
        String sentence = "(#$isa #$Collection #$Thing)";
        ELMt mt = null;
        boolean bookkeeping = false;
        boolean transcripting = false;
        SimpleKBTransaction instance = new SimpleKBTransaction();
        instance.noteForUnassertion(sentence, mt, bookkeeping, transcripting);
        transcripting = true;
        instance.noteForUnassertion(sentence, mt, bookkeeping, transcripting);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of noteForUnassertion method, of class SimpleKBTransaction. Make
     * sure we can change the Mt without complication.
     */
    @Test
    public void testNoteForUnassertion3() {
        try {
            System.out.println("noteForUnassertion3");
            String sentence = "(#$isa #$Collection #$Thing)";
            ELMt mt = CycClientManager.get().getCurrentAccess().getObjectTool().makeELMt("#$UniversalVocabularyMt");
            boolean bookkeeping = false;
            boolean transcripting = false;
            SimpleKBTransaction instance = new SimpleKBTransaction();
            instance.noteForUnassertion(sentence, mt, bookkeeping, transcripting);
            mt = CycClientManager.get().getCurrentAccess().getObjectTool().makeELMt("#$BaseKB");
            instance.noteForUnassertion(sentence, mt, bookkeeping, transcripting);
            // TODO review the generated test code and remove the default call to fail.
            assertTrue(true);
        } catch (CycConnectionException ex) {
            Logger.getLogger(SimpleKBTransactionTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Threw unexpected IOException");
        } catch (CycApiException ex) {
            Logger.getLogger(SimpleKBTransactionTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Threw unexpected CycApiException");
        }
    }

    /**
     * Test of noteForUnassertion method, of class SimpleKBTransaction. make
     * sure we can actually unassert lots of sentences, as long as we don't
     * change anything that's supposed to be constant.
     */
    @Test
    public void testNoteForUnassertion4() {
        try {
            System.out.println("noteForUnassertion4");
            String sentence = "(#$isa #$Collection #$Thing)";
            ELMt mt = null;
            boolean bookkeeping = false;
            boolean transcripting = false;
            SimpleKBTransaction instance = new SimpleKBTransaction();
            mt = CycClientManager.get().getCurrentAccess().getObjectTool().makeELMt("#$BaseKB");
            instance.noteForUnassertion(sentence, mt, bookkeeping, transcripting);
            instance.noteForUnassertion(sentence, mt, bookkeeping, transcripting);
            sentence = "(#$isa #$Thing #$Collection)";
            instance.noteForUnassertion(sentence, mt, bookkeeping, transcripting);
            assertTrue(true);
        } catch (CycConnectionException ex) {
            Logger.getLogger(SimpleKBTransactionTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Threw unexpected IOException" + ex.getMessage());
        } catch (CycApiException ex) {
            Logger.getLogger(SimpleKBTransactionTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Threw unexpected CycApiException" + ex.getMessage());
        }
    }

    /**
     * Test of noteCreation method, of class SimpleKBTransaction.
     */
    @Test
    public void testNoteCreation() {
        System.out.println("noteCreation");
        Fort fort = null;
        SimpleKBTransaction instance = new SimpleKBTransaction();
        instance.noteCreation(fort);
        instance.noteCreation(fort);
        instance.noteCreation(fort);
        assertEquals(instance.getCreatedTerms().size(), 3);
    }

    /**
     * Test that actually creating constants results in the correct number of
     * constants being added to the transaction.
     */
    @Test
    public void testNoteCreation2() throws CycConnectionException {
        System.out.println("noteCreation");
        Fort fort = null;
        SimpleKBTransaction instance = new SimpleKBTransaction();
        instance.begin();
        CycClientManager.get().getCurrentAccess().getObjectTool().makeCycConstant("BaseKB");
        assertEquals(instance.getCreatedTerms().size(), 0);
        CycClientManager.get().getCurrentAccess().getObjectTool().makeCycConstant("BaseKB-" + System.currentTimeMillis());
        assertEquals(instance.getCreatedTerms().size(), 1);
        CycClientManager.get().getCurrentAccess().getObjectTool().makeCycConstant("BaseKB-" + System.currentTimeMillis());
        assertEquals(instance.getCreatedTerms().size(), 2);
    }
}
