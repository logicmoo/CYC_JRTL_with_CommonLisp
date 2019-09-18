/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cyc.xml.query;

import java.io.IOException;

import com.cyc.base.CycAccess;
import com.cyc.base.CycAccessManager;
import com.cyc.base.CycApiException;
import com.cyc.base.CycConnectionException;
import com.cyc.base.CycTimeOutException;
import com.cyc.base.cycobject.ELMt;
import com.cyc.base.inference.InferenceAnswer;
import com.cyc.base.inference.InferenceIdentifier;
import com.cyc.base.inference.InferenceParameters;
import com.cyc.base.inference.InferenceResultSet;
import com.cyc.baseclient.cycobject.CycConstant;
import com.cyc.baseclient.cycobject.CycGuid;
import com.cyc.baseclient.cycobject.ELMtConstant;
import com.cyc.baseclient.inference.CycBackedInferenceAnswer;
import com.cyc.baseclient.inference.InferenceAnswerIdentifier;
import com.cyc.baseclient.inference.params.DefaultInferenceParameters;
import com.cyc.baseclient.inference.params.SpecifiedInferenceParameters;
import com.cyc.baseclient.ui.InteractiveCycAccessProvider;

//import org.opencyc.api.CycAccess;
//import org.opencyc.cycobject.CycConstant;
//import org.opencyc.cycobject.ELMt;
//import org.opencyc.cycobject.ELMtConstant;
//import org.opencyc.cycobject.Guid;
//import org.opencyc.inference.CycBackedInferenceAnswer;
//import org.opencyc.inference.InferenceAnswer;
//import org.opencyc.inference.InferenceAnswerIdentifier;
//import org.opencyc.inference.InferenceIdentifier;
//import org.opencyc.inference.InferenceResultSet;
//import org.opencyc.inference.params.DefaultInferenceParameters;

/**
 *
 * @author baxter
 */
public class Utils {

  static CycAccess cyc = null;

  public static void setup() throws IOException, CycApiException, CycTimeOutException, CycConnectionException {
    if (cyc == null) {
      cyc = CycAccessManager.get().setCurrentAccess(InteractiveCycAccessProvider.get().getAccess("localhost", 3600));
    }
    final InferenceParameters params = new DefaultInferenceParameters(
            cyc);
    ((SpecifiedInferenceParameters) params).setBrowsable(true);
    final String query = "(#$genls #$Emu #$Bird)";
    final InferenceResultSet resultSet = cyc.getInferenceTool().executeQuery(query, domainMt,
            params,
            15000);
    final InferenceIdentifier inferenceIdentifier = resultSet.getInferenceIdentifier();
    answer = new CycBackedInferenceAnswer(new InferenceAnswerIdentifier(
            inferenceIdentifier, 0));
    System.out.println("Performed inference. Got answer: " + answer);
  }
  public static InferenceAnswer answer = null;
  public static ELMt domainMt = ELMtConstant.makeELMtConstant(new CycConstant(
          "BaseKB",
          new CycGuid("bd588111-9c29-11b1-9dad-c379636f7270")));
  public static ELMt languageMt = ELMtConstant.makeELMtConstant(new CycConstant(
          "EnglishParaphraseMt", new CycGuid(
          "bda16220-9c29-11b1-9dad-c379636f7270")));

  public static void teardown() {
    try {
      answer.getId().getInferenceID().close();
    } catch (Exception e) {
    }
  }
}
