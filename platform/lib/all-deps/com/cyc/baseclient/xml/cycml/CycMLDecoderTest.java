package com.cyc.baseclient.xml.cycml;

import com.cyc.baseclient.xml.cycml.CycMLDecoder;
import java.io.ByteArrayInputStream;
import junit.framework.TestCase;

/**
 *
 * @author baxter
 */
public class CycMLDecoderTest extends TestCase {

  public CycMLDecoderTest(String testName) {
    super(testName);
  }

  @Override
  protected void setUp() throws Exception {
    super.setUp();
  }

  @Override
  protected void tearDown() throws Exception {
    super.tearDown();
  }

  /**
   * Test of decode method, of class CycMLDecoder.
   */
  public void testDecode_String() throws Exception {
    System.out.println("decode");
    CycMLDecoder instance = new CycMLDecoder();
    for (final CycMLDecoderTestCase testCase : CycMLDecoderTestCase.values()) {
      Object expResult = testCase.cycl;
      Object result = instance.decode(testCase.xml);
      System.out.println(result);
      assertEquals(expResult, result.toString());
    }
  }

  /**
   * Test of decode method, of class CycMLDecoder.
   */
  public void testDecode_InputStream() throws Exception {
    System.out.println("decode");
    CycMLDecoder instance = new CycMLDecoder();
    for (final CycMLDecoderTestCase testCase : CycMLDecoderTestCase.values()) {
      Object expResult = testCase.cycl;
      Object result = instance.decode(new ByteArrayInputStream(
              testCase.xml.getBytes()));
      System.out.println(result);
      assertEquals(expResult, result.toString());
    }
  }
}
