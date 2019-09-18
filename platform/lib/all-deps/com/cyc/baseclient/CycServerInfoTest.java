package com.cyc.baseclient;

import com.cyc.base.CycAccessManager;
import com.cyc.base.ServerInfo;
import com.cyc.baseclient.api.TestUtils;
import java.net.MalformedURLException;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import org.junit.BeforeClass;


/**
 *
 * @author nwinant
 */
public class CycServerInfoTest {
  
  @BeforeClass
  public static void setUpClass() throws MalformedURLException, Exception {
    TestUtils.ensureConstantsInitialized();
  }
  
  @Test
  public void testIsAPICompatible() {
    boolean errorFree = false;
    try {
      final ServerInfo info = CycAccessManager.get().getAccess().getServerInfo();
      System.out.println("CycRevisionString:  " + info.getCycRevisionString());
      System.out.println("CycKBVersionString: " + info.getCycKBVersionString());
      assertTrue(info.isAPICompatible());
      errorFree = true;
    } catch (Exception ex) {
      ex.printStackTrace();
    }
    assertTrue(errorFree);
  }
}
