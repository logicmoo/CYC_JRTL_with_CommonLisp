package org.opencyc.api;

import java.net.MalformedURLException;
import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.BeforeClass;

/**
 * Units test for CycAccess which assume that a Cyc server is <strong>not</strong>
 * available.
 * 
 * @author daves
 */
public class CycAccessUnavailableTest  {
  
  @BeforeClass
  public static void setUpClass() throws MalformedURLException, Exception {
    CycAccess.setCurrent(null);
  }
  
  @Test
  public void testHasCurrent() {
    boolean errorFree = false;
    try {
      boolean hasCurrent = CycAccess.hasCurrent();
      errorFree = true;
      assertFalse(hasCurrent);
    } catch (Exception ex) {
      ex.printStackTrace();
    }
    assertTrue(errorFree);
  }
}
