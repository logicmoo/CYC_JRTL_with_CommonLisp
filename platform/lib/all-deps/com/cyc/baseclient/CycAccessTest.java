package com.cyc.baseclient;

import com.cyc.base.CycAccess;
import com.cyc.base.cycobject.FormulaSentence;
import com.cyc.baseclient.CycClientManager;
import com.cyc.baseclient.inference.params.DefaultInferenceParameters;
import com.cyc.baseclient.cycobject.CycVariable;
import com.cyc.baseclient.cycobject.CycFormulaSentence;
import com.cyc.base.cycobject.ELMt;
import com.cyc.base.inference.InferenceParameters;
import com.cyc.base.inference.InferenceResultSet;
import com.cyc.baseclient.api.TestUtils;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.BeforeClass;

import com.cyc.baseclient.ui.InteractiveCycAccessProvider;

/**
 * Most of the test UnitTest.java is really testing CycClient, so CycAccess should not be considered
 tested unless UnitTest also passes.
 * 
 * @author daves
 */
public class CycAccessTest  {

  @BeforeClass
  public static void setUpClass() throws MalformedURLException, Exception {
    TestUtils.ensureConstantsInitialized();
  }
  
  @Test
  public void testHasCurrent() {
    boolean errorFree = false;
    try {
      boolean hasCurrent = CycClientManager.get().hasCurrentAccess();
      errorFree = true;
      assertTrue(hasCurrent);
    } catch (Exception ex) {
      ex.printStackTrace();
    }
    assertTrue(errorFree);
  }
  
  @Test
  public void testExecuteQuery() {
    boolean errorFree = false;
    try {
      final List answers = new ArrayList();
      final CycAccess access = CycClientManager.get().getCurrentAccess();
      
      final CycVariable var1 = new CycVariable("?var");
      final FormulaSentence query = CycFormulaSentence.makeCycFormulaSentence(
              access.getLookupTool().getConstantByName("#$isa"),
              var1,
              access.getLookupTool().getConstantByName("#$Dog"));
      
      final InferenceParameters params = new DefaultInferenceParameters(access);
      /*
      You can now override params like so:
      params.setMaxTransformationDepth(1);
      params.setBrowsable(true);
      params.setMaxTime(30000);
      params.put(CycObjectFactory.makeCycSymbol(":INFERENCE-MODE"), CycObjectFactory.makeCycSymbol(":MINIMAL"));
      etc...
      */
      final ELMt queryMt = access.getObjectTool().makeELMt("InferencePSC");
      
      InferenceResultSet rs = null;
      try {
        rs = access.getInferenceTool().executeQuery(query, queryMt, params);
        while (rs.next()){
          answers.add(rs.getCycObject(var1));
          //System.out.println("> " + rs.getCycObject(var1));
        }
      } finally {
        if (rs != null) { rs.close(); }
      }

      errorFree = true;
      assertFalse(answers.isEmpty());
    } catch (Exception ex) {
      ex.printStackTrace();
    }
    assertTrue(errorFree);
  }
  
  
  @Test
  public void testGetNewCycAccessInteractively() {
    boolean errorFree = false;
    try {
      final CycAccess access = InteractiveCycAccessProvider.get().getAccess();
      assertNotNull(access);
      errorFree = true;
    } catch (Exception ex) {
      ex.printStackTrace();
    }
    assertTrue(errorFree);
  }
  
  @Test
  public void testSetCyclist() throws Exception {
    System.out.println("\n**** testSetCyclist ****");

    assertTrue(CycClientManager.get().getCurrentAccess().getCyclist() == null);
    CycClient.setCurrentCyclist("CycAdministrator");
    assertTrue(CycClientManager.get().getCurrentAccess().getCyclist().toString().equals("CycAdministrator"));
    CycClient.clearCurrentCyclist();
    assertTrue(CycClientManager.get().getCurrentAccess().getCyclist() == null);

    CycClientManager.get().getCurrentAccess().setCyclist("CycAdministrator");
    assertTrue(CycClientManager.get().getCurrentAccess().getCyclist().toString().equals("CycAdministrator"));

    CycClient.setCurrentCyclist("#$Lenat");
    assertTrue(CycClientManager.get().getCurrentAccess().getCyclist().toString().equals("Lenat"));

    CycClient.setCurrentCyclist("Lenat");
    assertTrue(CycClientManager.get().getCurrentAccess().getCyclist().toString().equals("Lenat"));

    System.out.println("**** testSetCyclist OK ****");
  }
}
