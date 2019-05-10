/* $Id: Class.java 138466 2012-02-07 13:39:51Z tbrussea $
 *
 * Copyright (c) 2012 Cycorp, Inc.  All rights reserved.
 * This software is the proprietary information of Cycorp, Inc.
 * Use is subject to license terms.
 */
package org.opencyc.api;

//// Internal Imports
import java.io.IOException;
import java.util.*;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.opencyc.api.TestUtils.*;
import org.opencyc.cycobject.*;
import org.opencyc.inference.params.DefaultInferenceParameters;
import org.opencyc.inference.params.InferenceParameters;

/**
 * <P>StressTest is designed to...
 *
 * <P>Copyright (c) 2012 Cycorp, Inc. All rights reserved.
 * <BR>This software is the proprietary information of Cycorp, Inc.
 * <P>Use is subject to license terms.
 *
 * Created on : Jun 26, 2012, 11:40:47 AM
 * Author : tbrussea
 *
 * @version $Id: Class.java 138466 2012-02-07 13:39:51Z tbrussea $
 */
public class SingleThreadedQueryStressTest {

  //// Constructors
  /**
   * Creates a new instance of StressTest.
   */
  public SingleThreadedQueryStressTest() {
  }

  //// Public Area
  @BeforeClass
  public static void initializeCyc() throws IOException {
    CycAccess cyc = TestUtils.getCyc();

    // Create predicate
    testPredicate = cyc.createBinaryPredicate("testPredicate", null,
            "Test predicate.", CycAccess.thing, CycAccess.thing, null, null,
            null, null, null);

    // Create constant
    testConstant = cyc.createNewPermanent("TestConstant");
    cyc.assertIsa(testConstant, CycAccess.thing);

    // Create mt
    testMt = cyc.createMicrotheory("TestMt", "Test microtheory",
            cyc.getKnownConstantByName("Microtheory"), new ArrayList());

    // Assert key assertion
    cyc.assertGaf(testMt, testPredicate, testConstant, testString);

    // Create parameters
    DefaultInferenceParameters params = new DefaultInferenceParameters(cyc);
    params.setAllowIndeterminateResults(false);
    params.setContinuable(false);
    params.setMaxNumber(10);
    // @TODO -- Reinstate these once they work on an OpenCyc image:
    //params.setMaxNumber(null);
    //params.setMaxTime(600);
    params.setMaxTransformationDepth(0);

    if (!cyc.isOpenCyc()) {
      params.setMaxTime(600);
      params.getAnswersInHL();
      params.setIntermediateStepValidationLevel(CycObjectFactory.makeCycSymbol(
              ":none"));
      params.setBrowsable(false);
      params.put(CycObjectFactory.makeCycSymbol(
              ":add-restriction-layer-of-indirection?"), CycObjectFactory.nil);
      params.put(CycObjectFactory.makeCycSymbol(":allow-abnormality-checking?"),
              CycObjectFactory.nil);
      params.put(CycObjectFactory.makeCycSymbol(
              ":compute-answer-justifications?"), CycObjectFactory.nil);
      params.put(CycObjectFactory.makeCycSymbol(":max-problem-count"),
              CycObjectFactory.makeCycSymbol(":positive-infinity"));
      params.put(CycObjectFactory.makeCycSymbol(":new-terms-allowed?"),
              CycObjectFactory.nil);
      params.put(CycObjectFactory.makeCycSymbol(":productivity-limit"),
              CycObjectFactory.makeCycSymbol(":positive-infinity"));
      params.put(CycObjectFactory.makeCycSymbol(":transformation-allowed?"),
              CycObjectFactory.nil);
    }
    parameters = params;
  }

  @AfterClass
  public static void closeCyc() throws IOException {
    CycAccess cyc = getCyc();
    if (cyc != null) {
      cyc.close();
    }
  }

  @Test
  public void testIndexedByConstant() throws IOException {
    runQueryRepeatedly(CycFormulaSentence.makeCycFormulaSentence(testPredicate,
            testConstant, var), testMt, CycList.makeCycList(testString));
  }

  @Test
  public void testIndexedByString() throws IOException {
    runQueryRepeatedly(CycFormulaSentence.makeCycFormulaSentence(testPredicate,
            var, testString), testMt, CycList.makeCycList(testConstant));
  }

  public void runQueryRepeatedly(CycFormulaSentence query, CycObject mt,
          Collection<?> expectedAnswers) throws IOException {
    Set<Object> expectedAnswerSet = new HashSet<Object>(expectedAnswers);
    List<Integer> failures = new ArrayList<Integer>();
    boolean abort = false;
    for (int i = 0; (i < TEST_LENGTH) && (abort == false); i++) {
      if ((i % 100) == 0) {
        System.out.println("");
        System.out.print(i);
        System.out.flush();
      }
      CycList<?> results = TestUtils.getCyc().queryVariable(var, query, mt, parameters);
      if (results.size() != expectedAnswerSet.size()) {
        noteFailure(failures, i,
                "Expected " + expectedAnswerSet.size() + " answers, got " + results.size());
        System.out.print("!");
        System.out.flush();
      } else {
        Set<Object> resultSet = new HashSet<Object>(results);
        if (!resultSet.equals(expectedAnswerSet)) {
          noteFailure(failures, i,
                  "Expected " + expectedAnswerSet + ", got " + results);
          System.out.print("!");
          System.out.flush();
        } else {
          System.out.print(".");
          System.out.flush();
        }
      }
      if (STOP_ON_FAILURE && !failures.isEmpty()) {
        abort = true;
      }
    }
    System.out.println();
    System.out.flush();
    if (!failures.isEmpty()) {
      Assert.fail("The following failed: " + failures);
    }
  }

  private void noteFailure(List<Integer> failures, int i, String msg) {
    failures.add(i);
    if (STOP_ON_FAILURE) {
      Assert.fail(msg);
    }
  }
  //// Protected Area
  //// Private Area
  //// Internal Rep
  public static final int TEST_LENGTH = 100;
  public static final boolean STOP_ON_FAILURE = true;
  public static CycConstant testPredicate;
  public static CycConstant testConstant;
  public static CycConstant testMt;
  public static String testString = "Test string";
  public static CycVariable var = CycObjectFactory.makeCycVariable("X");
  public static InferenceParameters parameters;
}
