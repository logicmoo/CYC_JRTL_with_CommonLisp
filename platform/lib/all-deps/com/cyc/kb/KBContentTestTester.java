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
import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.cyc.base.CycAccess;
import com.cyc.base.CycAccessManager;
import com.cyc.base.CycApiException;
import com.cyc.base.CycConnectionException;
import com.cyc.base.CycTimeOutException;
import com.cyc.base.cycobject.CycAssertion;
import com.cyc.base.cycobject.CycVariableI;
import com.cyc.base.cycobject.Naut;
import com.cyc.base.inference.InferenceAnswer;
import com.cyc.base.inference.InferenceStatus;
import com.cyc.base.inference.InferenceSuspendReason;
import com.cyc.base.inference.InferenceWorker;
import com.cyc.base.inference.InferenceWorkerListener;
import com.cyc.baseclient.export.PrintStreamExporter;
import com.cyc.baseclient.inference.Bindings;
import com.cyc.baseclient.inference.DefaultInferenceSuspendReason;
import com.cyc.kb.client.Constants;
import com.cyc.kb.client.ContextImpl;
import com.cyc.kb.client.KBPredicateImpl;
import com.cyc.xml.query.ProofViewJustification;
import com.cyc.xml.query.ProofViewMarshaller;

import static org.junit.Assert.*;

/**
 * Test one KB Content Test.
 *
 * @author baxter
 */
public class KBContentTestTester implements InferenceWorkerListener {

  private final KBIndividual test;
  private Context inferencePSC;
  private Query query;
  long startTimeMillis;

  public KBContentTestTester(KBIndividual test) throws Exception {
    this.test = test;
    inferencePSC = ContextImpl.get("InferencePSC");
  }

  protected boolean queryHasBindings(final Bindings desiredBindings) throws IOException, CycApiException, CycTimeOutException, CycConnectionException {
    for (final InferenceAnswer answer : query.getAnswers()) {
      if (answerHasBindings(answer, desiredBindings)) {
        return true;
      }
    }
    return false;
  }

  protected int getAnswerCount() throws IOException, CycApiException, CycTimeOutException, CycConnectionException {
    return query.getAnswerCount();
  }

  public void test() throws Exception {
    System.out.println("\nRunning " + test);
    final Fact qSpecFact = test.getFacts(
            KBPredicateImpl.get("testQuerySpecification"), 1, Constants.inferencePSCMt()).iterator().next();
    query = Query.load(qSpecFact.<KBIndividual>getArgument(2));
    try {
      query.registerRequiredSKSModules();
      query.addListener(this);
      query.setMaxTime(maxTime);
      query.performInference();
      if (DefaultInferenceSuspendReason.MAX_TIME.equals(query.getSuspendReason())) {
        System.out.println("Query timed out after " + maxTime + " seconds.");
      } else {
        verifyDesiredMinAnswerCountReturned();
        verifyDesiredAnswerCountReturned();
        verifyDesiredBindingsReturned();
        verifyExactBindingsReturned();
      }
      final PrintStreamExporter<ProofViewJustification> exporter = new PrintStreamExporter<ProofViewJustification>() {
        final ProofViewMarshaller marshaller = new ProofViewMarshaller();

        @Override
        protected void doExport() throws Exception {
          marshaller.marshal(object.getProofView(), getPrintStream());
        }
      };
      for (final InferenceAnswer answer : query.getAnswers()) {
        final ProofViewJustification justification = new ProofViewJustification(
                answer);
        final String xml = exporter.exportToString(justification);
        assertFalse("Justification for " + answer + " is empty!", xml.isEmpty());
      }
    } finally {
      query.close();
    }
  }
  private final int maxTime = 10;

  private void verifyDesiredAnswerCountReturned() throws Exception {
    for (final Fact fact : test.getFacts(KBPredicateImpl.get(
            "testAnswers-Cardinality-Exact"), 1, Constants.inferencePSCMt())) {
      final int desiredAnswerCount = fact.<Integer>getArgument(2);
      System.out.println(
              "Verifying that " + test + " has exactly " + desiredAnswerCount + " answer(s).");
      assertEquals("Wrong number of answers for " + test, desiredAnswerCount,
              getAnswerCount());
    }
  }

  private void verifyDesiredMinAnswerCountReturned() throws Exception {
    if (!DefaultInferenceSuspendReason.MAX_TIME.equals(query.getSuspendReason())) {
      for (final Fact fact : test.getFacts(KBPredicateImpl.get(
              "testAnswers-Cardinality-Min"), 1, Constants.inferencePSCMt())) {
        final int desiredAnswerCount = fact.<Integer>getArgument(2);
        System.out.println(
                "Verifying that " + test + " has at least " + desiredAnswerCount + " answer(s).");
        assertTrue("Not enough answers for " + test,
                getAnswerCount() >= desiredAnswerCount);
      }
    }
  }

  private void verifyExactBindingsReturned() throws Exception {
    for (final Fact fact : test.getFacts(KBPredicateImpl.get(
            "testAnswersCycL-Exact"), 1, Constants.inferencePSCMt())) {
      final Naut desiredBindingSets = getArgumentAsNaut(fact, 2);
      assertEquals("Wrong number of answers for " + test,
              desiredBindingSets.getArity(), getAnswerCount());
      for (final Object bindingsObj : desiredBindingSets.getArguments()) {
        final Naut desiredBindings = (Naut) bindingsObj;
        assertTrue(test + " failed to find " + desiredBindings,
                queryHasBindings(new Bindings(desiredBindings)));
      }
    }
  }

  private void verifyDesiredBindingsReturned() throws Exception {
    for (final Fact fact : test.getFacts(KBPredicateImpl.get(
            "testAnswersCycL-Wanted"), 1, Constants.inferencePSCMt())) {
      final Naut desiredBindings = getArgumentAsNaut(fact, 2);
      assertTrue(test + " failed to find " + desiredBindings, queryHasBindings(
              new Bindings(desiredBindings)));
    }
  }

  private Naut getArgumentAsNaut(Fact desiredBindings, int argNum) throws Exception {
    final CycAccess cyc = CycAccessManager.get().getCurrentAccess();
    final CycAssertion core = (CycAssertion) desiredBindings.getCore();
    return (Naut) core.getGaf().getArg(argNum);
  }

  private boolean answerHasBindings(InferenceAnswer answer,
          Bindings desiredBindings) throws IOException, CycConnectionException {
    final CycAccess cyc = CycAccessManager.get().getCurrentAccess();
    for (final Map.Entry<CycVariableI, Object> binding : desiredBindings.entrySet()) {
      final CycVariableI var = (CycVariableI) binding.getKey();
      final Object desiredValue = binding.getValue();
      final Object answerValue = answer.getBinding(var);
      if (cyc.getComparisonTool().equalsEL(desiredValue, answerValue)) {
        continue;
      } else {
        return false;
      }
    }
    return true;
  }

  @Override
  public void notifyInferenceCreated(InferenceWorker inferenceWorker) {
    startTimeMillis = System.currentTimeMillis();
  }

  @Override
  public void notifyInferenceStatusChanged(InferenceStatus oldStatus,
          InferenceStatus newStatus, InferenceSuspendReason suspendReason,
          InferenceWorker inferenceWorker) {
  }

  @Override
  public void notifyInferenceAnswersAvailable(InferenceWorker inferenceWorker,
          List newAnswers) {
    final long elapsedTime = System.currentTimeMillis() - startTimeMillis;
    System.out.println(
            "Found " + newAnswers.size() + " answers after " + elapsedTime + "ms.");
  }

  @Override
  public void notifyInferenceTerminated(InferenceWorker inferenceWorker,
          Exception e) {
    System.out.println(
            "Inference terminated after " + (System.currentTimeMillis() - startTimeMillis) + "ms");
  }
}
