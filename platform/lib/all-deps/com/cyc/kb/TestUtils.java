/*
 */
package com.cyc.kb;

/*
 * #%L
 * Query API
 * %%
 * Copyright (C) 1995 - 2014 Cycorp, Inc
 * %%
 * This software is the proprietary information of Cycorp, Inc.
 * Use is subject to license terms.
 * #L%
 */

import com.cyc.base.CycAccess;
import com.cyc.base.CycAccessManager;
import com.cyc.base.cycobject.CycConstantI;
import com.cyc.base.cycobject.CycVariableI;
import com.cyc.base.cycobject.FormulaSentence;
import com.cyc.baseclient.CycObjectFactory;
import com.cyc.baseclient.cycobject.CycConstant;
import com.cyc.baseclient.cycobject.CycGuid;
import com.cyc.baseclient.ui.InteractiveCycAccessProvider;
import com.cyc.kb.client.ContextImpl;
import com.cyc.kb.client.VariableImpl;
import com.cyc.kb.config.KBAPIConfiguration;
import com.cyc.kb.exception.KBApiException;

import java.io.IOException;


/**
 *
 * @author baxter
 */
public class TestUtils {

  public static Query q;
  public static FormulaSentence xIsaBird;
  public static FormulaSentence birdsWithTypes;
  public static Context INFERENCE_PSC;
  public static CycAccess cyc = null;
  public static final CycConstantI BIRD = new CycConstant("Bird", new CycGuid(
          "bd58bc48-9c29-11b1-9dad-c379636f7270"));
  final public static CycVariableI X = CycObjectFactory.makeCycVariable("X");
  
  public static Variable kbv;
  
  public static FormulaSentence xIsaEmu;
  private static boolean initialized = false;

  public static synchronized void ensureConstantsInitialized() throws IOException, KBApiException {
    if (initialized == false) {
      KBAPIConfiguration.setShouldTranscriptOperations(false);
      cyc = CycAccessManager.get().setCurrentAccess(InteractiveCycAccessProvider.get().getAccess("localhost", 3600));
      System.out.println("current cyc: " + CycAccessManager.get().getCurrentAccess());
      INFERENCE_PSC = ContextImpl.get("InferencePSC");
      xIsaBird = cyc.getObjectTool().makeCycSentence("(#$isa ?X #$Bird)");
      birdsWithTypes = cyc.getObjectTool().makeCycSentence(
              "(#$and (#$isa ?X #$Bird) (#$assertedSentence (#$isa ?X ?TYPE)) (#$genls ?TYPE #$Bird))");
      xIsaEmu = cyc.getObjectTool().makeCycSentence("(#$isa ?X #$Emu)");
      initialized = true;
      kbv = new VariableImpl("?X");
    }
  }

  static Query constructXIsaBirdQuery() throws IOException {
    return new Query(xIsaBird.deepCopy(), INFERENCE_PSC);
  }

  static protected void closeTestQuery() {
    if (q != null) {
      System.out.println("Closing " + q);
      q.close();
    }
  }
}
