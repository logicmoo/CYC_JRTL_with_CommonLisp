package com.cyc.baseclient.cycobject;

import com.cyc.base.CycConnectionException;
import com.cyc.base.cycobject.CycAssertion;
import java.util.Arrays;
import java.util.HashSet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static com.cyc.baseclient.api.TestUtils.getCyc;
import static com.cyc.baseclient.cycobject.UnitTest.*;

/**
 *
 * @author baxter
 */
public class CycAssertionTest {

  private CycAssertion assertion;

  public CycAssertionTest() {
  }

  @BeforeClass
  public static void setUpClass() {
  }

  @AfterClass
  public static void tearDownClass() {
  }

  @Before
  public void setUp() throws CycConnectionException {
    assertion = getCyc().getLookupTool().getRandomAssertion();
  }

  @After
  public void tearDown() {
  }

  @Test
  public void testMakeInvalidAssertion() {
  }

  @Test
  public void testEquals() {
    assertEquals(assertion, new DefaultCycAssertion(assertion.getFormula(), assertion.getMt()));
  }

  @Test
  public void testHashCode() {
    try {
      final CycAssertion assertion2 = new DefaultCycAssertion(assertion.getFormula(), assertion.getMt());
      assertTrue(new HashSet<CycAssertion>(Arrays.asList(assertion)).contains(assertion2));
      assertEquals(assertion.hashCode(), assertion2.hashCode());
    } catch (Exception e) {
      failWithException(e);
    }
  }

  @Test
  public void testToString() {
  }

  @Test
  public void testCyclifyWithEscapeChars() {
  }

  @Test
  public void testStringApiValue() {
    // stringApiValue() on a random assertion
    try {
      testCycObjectRetrievable(assertion);
      assertNotNull(assertion);
      String assertionAsString = assertion.stringApiValue();
      final Object assertionObject2 = getCyc().converse().converseObject(assertionAsString);
      if (assertionObject2 instanceof CycAssertion) {
        final CycAssertion assertion2 = (CycAssertion) assertionObject2;
        assertEquals(assertion, assertion2);
      } else {
        System.err.println(
                assertionAsString + "\ndoes not returns the following which is not the expected assertion:\n" + assertionObject2);
      }
    } catch (Exception e) {
      failWithException(e);
    }
  }

  @Test
  public void testCycListApiValue() {
  }

  @Test
  public void testGetELFormula() throws Exception {
  }

  @Test
  public void testGetFormula() {
  }

  @Test
  public void testGetGaf_0args() {
  }

  @Test
  public void testGetGaf_CycAccess() {
  }

  @Test
  public void testIsGaf() {
  }

  @Test
  public void testGetMt() {
  }

  @Test
  public void testToXMLString() throws Exception {
  }

  @Test
  public void testToXML() throws Exception {
  }

  @Test
  public void testGetReferencedConstants() {
  }

  @Test
  public void testCompareTo() {
  }

  /**
   * Tests the DefaultCycAssertion class.
   */
  @Test
  public void testCycAssertion() {
    System.out.println("\n*** testCycAssertion ***");


    // toXMLString()() on a random assertion
    try {
      final DefaultCycAssertion assertion = (DefaultCycAssertion) getCyc().getLookupTool().getRandomAssertion();
      assertNotNull(assertion);
      final String assertionAsXML = assertion.toXMLString();
      assertNotNull(assertionAsXML);
      System.out.println();
    } catch (Exception e) {
      failWithException(e);
    }

    //TODO
        /*
     // toXML, toXMLString, unmarshal
     XMLStringWriter xmlStringWriter = new XMLStringWriter();
     try {
     String xmlString =
     "<assertion>\n" +
     "  <id>1000</id>\n" +
     "</assertion>\n";
     Object object = CycObjectFactory.unmarshal(xmlString);
     assertNotNull(object);
     assertTrue(object instanceof DefaultCycAssertion);
     DefaultCycAssertion cycAssertion = (DefaultCycAssertion) object;
     cycAssertion.toXML(xmlStringWriter, 0, false);
     assertEquals(xmlString, xmlStringWriter.toString());
     assertEquals(xmlString, cycAssertion.toXMLString());
     DefaultCycAssertion cycAssertion2 = new DefaultCycAssertion(new Integer (1000));
     assertEquals(cycAssertion2, cycAssertion);
     CycArrayList cycList = new CycArrayList();
     cycList.add(cycAssertion);
     //System.out.println(cycList.toXMLString());
    
     }
     catch (Exception e) {
     e.printStackTrace();
     fail(e.getMessage());
     }
     */
    System.out.println("*** testCycAssertion OK ***");
  }
}