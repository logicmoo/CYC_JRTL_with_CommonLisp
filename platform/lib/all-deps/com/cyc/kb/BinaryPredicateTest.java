package com.cyc.kb;

import com.cyc.kb.exception.KBApiException;
import java.util.logging.Logger;
import org.junit.*;
import static org.junit.Assert.*;

public class BinaryPredicateTest {

  private static Logger log = null;
  private static KBIndividual i;

  @BeforeClass
  public static void setUp() throws Exception {
    log = Logger.getLogger(BinaryPredicateTest.class.getName());
    TestConstants.ensureInitialized();
    i = new KBIndividual("VijayRaj009");
    i.instantiates("Person", "UniversalVocabularyMt");
  }

  @AfterClass
  public static void tearDown() throws Exception {
  }

  @Test
  public void testBinaryPredicateString() {
    try {
      BinaryPredicate bp = BinaryPredicate.get("comment");
      i.setObject(bp, "Vijay is a person", Constants.uvMt());
      i.delete();
      java.util.Collection<String> comments = i.getComments("");
      assertEquals(comments.size(), 0);
    } catch (KBApiException ex) {
      assertEquals(ex.getCause().getMessage(), "Expected constant not found #$VijayRaj009");
    } catch (Exception e) {
      e.printStackTrace();
      fail("BinaryPredicate could not be created");
    }

  }
}
