package com.cyc.baseclient.api;

import com.cyc.baseclient.CycClientManager;
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
    CycClientManager.get().setCurrentAccess(null);
  }
  
  @Test
  public void testHasCurrent() {
    boolean errorFree = false;
    try {
      boolean hasCurrent = CycClientManager.get().hasCurrentAccess();
      errorFree = true;
      assertFalse(hasCurrent);
    } catch (Exception ex) {
      ex.printStackTrace();
    }
    assertTrue(errorFree);
  }
}
