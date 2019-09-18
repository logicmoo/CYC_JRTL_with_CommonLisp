/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cyc.km.query.export;

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
import com.cyc.base.CycApiException;
import com.cyc.base.CycConnectionException;
import com.cyc.base.CycTimeOutException;
import com.cyc.base.cycobject.ELMt;
import com.cyc.base.inference.InferenceParameters;
import com.cyc.baseclient.cycobject.CycConstant;
import com.cyc.baseclient.cycobject.CycGuid;
import com.cyc.baseclient.cycobject.ELMtConstant;
import com.cyc.baseclient.inference.params.DefaultInferenceParameters;
import com.cyc.baseclient.inference.params.SpecifiedInferenceParameters;
import com.cyc.baseclient.ui.InteractiveCycAccessProvider;
import com.cyc.kb.Query;
import com.cyc.kb.exception.KBApiException;

import java.io.IOException;

//import org.opencyc.api.CycAccess;
//import org.opencyc.cycobject.CycConstant;
//import org.opencyc.cycobject.ELMt;
//import org.opencyc.cycobject.ELMtConstant;
//import org.opencyc.cycobject.Guid;
//import org.opencyc.inference.params.DefaultInferenceParameters;

/**
 *
 * @author baxter
 */
public class Utils {

  static CycAccess cyc = null;

  public static void setup() throws IOException, KBApiException, CycApiException, CycTimeOutException, CycConnectionException {
    if (cyc == null) {
      cyc = CycAccessManager.get().setCurrentAccess(InteractiveCycAccessProvider.get().getAccess("localhost", 3600));
    }
    CycAccessManager.get().setCurrentAccess(cyc);
    final InferenceParameters params = new DefaultInferenceParameters(
            cyc);
    ((SpecifiedInferenceParameters) params).setBrowsable(true);
    final String queryStr = "(#$genls #$Emu #$Bird)";
    Utils.query = new Query(cyc.getObjectTool().makeCycSentence(queryStr), domainMt, params);
    System.out.println("Performed inference. Got answer: " + Utils.query.getAnswer(0));
  }
  public static Query query = null;
  public static ELMt domainMt = ELMtConstant.makeELMtConstant(new CycConstant(
          "BaseKB",
          new CycGuid("bd588111-9c29-11b1-9dad-c379636f7270")));
  public static ELMt languageMt = ELMtConstant.makeELMtConstant(new CycConstant(
          "EnglishParaphraseMt", new CycGuid(
          "bda16220-9c29-11b1-9dad-c379636f7270")));

  public static void teardown() {
    try {
      query.close();
    } catch (Exception e) {
    }
  }
}
