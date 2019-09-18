package com.cyc.baseclient.xml;

import com.cyc.baseclient.xml.TextUtil;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Provides a suite of JUnit test cases for the <tt>com.cyc.baseclient.xml</tt> package.<p>
 *
 * @version $Id: UnitTest.java 126640 2008-12-04 13:39:36Z builder $
 * @author Stephen L. Reed
 */
public class UnitTest {

  /**
   * Tests the TextUtil class.
   */
  @Test
  public void testTextUtil() {
    System.out.println("\n*** testTextUtil ***");
    String xmlText = "abc def";
    assertEquals(xmlText, TextUtil.doEntityReference(xmlText));
    assertEquals(xmlText, TextUtil.undoEntityReference(xmlText));
    xmlText = "abc&def<hij>klm";
    assertEquals("abc&amp;def&lt;hij&gt;klm",
            TextUtil.doEntityReference(xmlText));
    assertEquals(xmlText, TextUtil.undoEntityReference(
            "abc&amp;def&lt;hij&gt;klm"));
    System.out.println("*** testTextUtil OK ***");
  }
}
