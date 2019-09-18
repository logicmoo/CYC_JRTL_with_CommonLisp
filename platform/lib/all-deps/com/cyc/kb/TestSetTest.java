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

import com.cyc.base.CycApiException;
import com.cyc.base.CycConnectionException;
import com.cyc.base.CycTimeOutException;
import com.cyc.kb.client.ContextImpl;
import com.cyc.kb.client.KBCollectionImpl;
import com.cyc.kb.config.KBAPIConfiguration;
import com.cyc.kb.exception.KBApiException;

import java.io.IOException;
import java.util.Collection;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Runs the tests defined in {@link #testSet}.
 * @author baxter
 */
public class TestSetTest {
  
  private static KBCollection testSet;
  private final KBCollection multipleChoiceTest;
  private final Context inferencePSC;
  
  @BeforeClass
  public static void setupClass() throws IOException, KBApiException {
    KBAPIConfiguration.setShouldTranscriptOperations(false);
    TestUtils.ensureConstantsInitialized();
  }

  public TestSetTest() throws Exception {    
    inferencePSC = ContextImpl.get("InferencePSC");
    multipleChoiceTest = KBCollectionImpl.get("MultipleChoiceKBContentTest");
    testSet = KBCollectionImpl.get("QueryAPIKBQTest");
  }

  @Test
  public void testTestSet() throws Exception {
    final Collection<KBIndividual> tests = testSet.<KBIndividual>getInstances(inferencePSC);
    System.out.println("Testing instances of " + testSet);
    for (final KBIndividual test : tests) {
      if (!isMultipleChoice(test)) {
        new KBContentTestTester(test).test();
      }
    }
  }

  private boolean isMultipleChoice(final KBIndividual test) 
		  throws CycApiException, CycTimeOutException, CycConnectionException, IOException {
    final String querySentence = "(#$isa " + test.stringApiValue() + " "
                                 + multipleChoiceTest.stringApiValue() + ")";
    return new Query(querySentence, inferencePSC.stringApiValue()).isTrue();
  }
}
