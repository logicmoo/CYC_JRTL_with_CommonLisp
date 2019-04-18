package org.opencyc.api;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.BeforeClass;

import org.opencyc.cycobject.*;
import org.opencyc.inference.*;
import org.opencyc.inference.params.*;

/**
 * Most of the test UnitTest.java is really testing CycAccess, so CycAccess should not be considered
 * tested unless UnitTest also passes.
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
      boolean hasCurrent = CycAccess.hasCurrent();
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
      final CycAccess access = CycAccess.getCurrent();
      
      final CycVariable var1 = new CycVariable("?var");
      final CycFormulaSentence query = CycFormulaSentence.makeCycFormulaSentence(
              access.getConstantByName("#$isa"),
              var1,
              access.getConstantByName("#$Dog"));
      
      final InferenceParameters params = new DefaultInferenceParameters(access);
      /*
      You can now override params like so:
      params.setMaxTransformationDepth(1);
      params.setBrowsable(true);
      params.setMaxTime(30000);
      params.put(CycObjectFactory.makeCycSymbol(":INFERENCE-MODE"), CycObjectFactory.makeCycSymbol(":MINIMAL"));
      etc...
      */
      final ELMt queryMt = access.makeELMt("InferencePSC");
      
      InferenceResultSet rs = null;
      try {
        rs = access.executeQuery(query, queryMt, params);
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
      final CycAccess access = CycAccess.getNewCycAccessInteractively();
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

    assertTrue(CycAccess.getCurrent().getCyclist() == null);
    CycAccess.setCurrentCyclist("CycAdministrator");
    assertTrue(CycAccess.getCurrent().getCyclist().toString().equals("CycAdministrator"));
    CycAccess.clearCurrentCyclist();
    assertTrue(CycAccess.getCurrent().getCyclist() == null);

    CycAccess.getCurrent().setCyclist("CycAdministrator");
    assertTrue(CycAccess.getCurrent().getCyclist().toString().equals("CycAdministrator"));

    CycAccess.setCurrentCyclist("#$Lenat");
    assertTrue(CycAccess.getCurrent().getCyclist().toString().equals("Lenat"));

    CycAccess.setCurrentCyclist("Lenat");
    assertTrue(CycAccess.getCurrent().getCyclist().toString().equals("Lenat"));

    System.out.println("**** testSetCyclist OK ****");
  }
}
