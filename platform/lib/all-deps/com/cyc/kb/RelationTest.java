package com.cyc.kb;

import com.cyc.kb.exception.KBApiException;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.logging.Logger;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

public class RelationTest {

  private static Logger log = null;

  @BeforeClass
  public static void setUp() throws Exception {
    log = Logger.getLogger(RelationTest.class.getName());
    TestConstants.ensureInitialized();
  }

  @AfterClass
  public static void tearDown() throws Exception {
  }

  @Test
  public void testArity() throws KBApiException, UnknownHostException, IOException, Exception {
    Predicate p = Predicate.get("isa");
    assertTrue(p.getArityMin() == 2);
    assertTrue(p.getArityMax() == 2);
    assertTrue(p.getArity() == 2);
    final String predName = "testArityTestPred";
    assertFalse(Predicate.existsAsType(predName));
    Predicate np = Predicate.findOrCreate(predName);
    new Fact("BaseKB", "(#$arityMax " + predName + " 12)");
    new Fact("BaseKB", "(#$arityMin " + predName + " 1)");

    assertTrue(np.getArityMin() == 1);
    assertTrue("Got " + np.getArityMax() + " as max arity, but expected 12", np.getArityMax() == 12);
    //assertTrue(p.setArity() == 2);

    np.delete();
  }
}
