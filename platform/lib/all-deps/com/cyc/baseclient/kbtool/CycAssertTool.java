package com.cyc.baseclient.kbtool;

import com.cyc.base.CycAccess;
import com.cyc.base.CycConnectionException;
import com.cyc.base.cycobject.CycConstantI;
import com.cyc.base.cycobject.DenotationalTerm;
import com.cyc.base.cycobject.FormulaSentence;
import com.cyc.base.cycobject.Fort;
import com.cyc.base.cycobject.CycList;
import com.cyc.base.cycobject.CycObject;
import com.cyc.base.cycobject.CycSymbolI;
import com.cyc.base.cycobject.ELMt;
import com.cyc.base.kbtool.AssertTool;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.cyc.baseclient.AbstractKBTool;
import com.cyc.baseclient.CommonConstants;
import static com.cyc.baseclient.CommonConstants.baseKB;
import static com.cyc.baseclient.CommonConstants.binaryPredicate;
import static com.cyc.baseclient.CommonConstants.collection;
import static com.cyc.baseclient.CommonConstants.currentWorldDataMt;
import static com.cyc.baseclient.CommonConstants.genlMt;
import static com.cyc.baseclient.CommonConstants.genls;
import static com.cyc.baseclient.CommonConstants.isa;
import static com.cyc.baseclient.CommonConstants.thing;
import static com.cyc.baseclient.CommonConstants.universalVocabularyMt;
import com.cyc.base.CycApiException;
import com.cyc.baseclient.CycClient;
import com.cyc.baseclient.CycObjectFactory;
import static com.cyc.baseclient.CycObjectFactory.makeCycSymbol;
import com.cyc.baseclient.cycobject.CycArrayList;
import com.cyc.baseclient.cycobject.CycFormulaSentence;
import com.cyc.baseclient.cycobject.CycFort;
import com.cyc.baseclient.cycobject.CycNart;

/**
 *
 * @author nwinant
 */
public class CycAssertTool extends AbstractKBTool implements AssertTool {
  
  public CycAssertTool(CycAccess client) {
    super(client);
  }
  
  public CycAssertTool() {
    super();
  }
  
  
  // Public
  
  /**
   * Assert an argument isa contraint for the given relation and argument position. The operation
   * will be added to the KB transcript for replication and archive.
   *
   * @param relation the given relation
   * @param argPosition the given argument position
   * @param argNIsa the argument constraint
   *
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public void assertArgIsa(Fort relation,
          int argPosition,
          Fort argNIsa)
          throws CycConnectionException, CycApiException {
    // (#$argIsa relation argPosition argNIsa)
    CycArrayList sentence = new CycArrayList();
    sentence.add(getKnownConstantByGuid_inner("bee22d3d-9c29-11b1-9dad-c379636f7270"));
    sentence.add(relation);
    sentence.add(argPosition);
    sentence.add(argNIsa);
    assertGaf(sentence, universalVocabularyMt);
  }

  /**
   * Assert an argument one genls contraint for the given relation. The operation will be added to
   * the KB transcript for replication and archive.
   *
   * @param relation the given relation
   * @param argGenl the argument constraint
   *
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public void assertArg1Genl(Fort relation,
          Fort argGenl)
          throws CycConnectionException, CycApiException {
    // (#$arg1Genl relation argGenl)
    CycArrayList sentence = new CycArrayList();
    sentence.add(getKnownConstantByGuid_inner("bd588b1d-9c29-11b1-9dad-c379636f7270"));
    sentence.add(relation);
    sentence.add(argGenl);
    assertGaf(sentence,
            universalVocabularyMt);
  }

  /**
   * Assert an argument two genls contraint for the given relation. The operation will be added to
   * the KB transcript for replication and archive.
   *
   * @param relation the given relation
   * @param argGenl the argument constraint
   *
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public void assertArg2Genl(Fort relation,
          Fort argGenl)
          throws CycConnectionException, CycApiException {
    // (#$arg2Genl relation argGenl)
    CycArrayList sentence = new CycArrayList();
    sentence.add(getKnownConstantByGuid_inner("bd58dcda-9c29-11b1-9dad-c379636f7270"));
    sentence.add(relation);
    sentence.add(argGenl);
    assertGaf(sentence,
            universalVocabularyMt);
  }

  /**
   * Assert an argument three genls contraint for the given relation. The operation will be added
   * to the KB transcript for replication and archive.
   *
   * @param relation the given relation
   * @param argGenl the argument constraint
   *
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public void assertArg3Genl(Fort relation,
          Fort argGenl)
          throws CycConnectionException, CycApiException {
    // (#$arg3Genl relation argGenl)
    CycArrayList sentence = new CycArrayList();
    sentence.add(getKnownConstantByGuid_inner("bd58b8c3-9c29-11b1-9dad-c379636f7270"));
    sentence.add(relation);
    sentence.add(argGenl);
    assertGaf(sentence,
            universalVocabularyMt);
  }

  /**
   * Assert the isa result contraint for the given denotational function. The operation will be
   * added to the KB transcript for replication and archive.
   *
   * @param denotationalFunction the given denotational function
   * @param resultIsa the function's isa result constraint
   *
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public void assertResultIsa(Fort denotationalFunction,
          Fort resultIsa)
          throws CycConnectionException, CycApiException {
    // (#$resultIsa denotationalFunction resultIsa)
    assertGaf(universalVocabularyMt,
            getKnownConstantByGuid_inner("bd5880f1-9c29-11b1-9dad-c379636f7270"),
            denotationalFunction,
            resultIsa);
  }

  /**
   * Assert the genls result contraint for the given denotational function. The operation will be
   * added to the KB transcript for replication and archive.
   *
   * @param denotationalFunction the given denotational function
   * @param resultGenl the function's genls result constraint
   *
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public void assertResultGenl(Fort denotationalFunction,
          Fort resultGenl)
          throws CycConnectionException, CycApiException {
    // (#$resultGenl denotationalFunction resultGenls)
    assertGaf(universalVocabularyMt,
            getKnownConstantByGuid_inner("bd58d6ab-9c29-11b1-9dad-c379636f7270"),
            denotationalFunction,
            resultGenl);
  }
  
  /**
   * Asserts the given sentence, and then places it on the transcript queue.
   *
   * @param sentence the given sentence for assertion
   * @param mt the microtheory in which the assertion is placed
   *
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public void assertWithTranscript(CycList sentence,
          CycObject mt)
          throws CycConnectionException, CycApiException {
    assertWithTranscript(sentence.stringApiValue(), mt);
  }

  /**
   * Asserts the given sentence, and then places it on the transcript queue.
   *
   * @param sentence the given sentence for assertion
   * @param mt the microtheory in which the assertion is placed
   *
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public void assertWithTranscript(String sentence,
          CycObject mt)
          throws CycConnectionException, CycApiException {
    assertSentence(sentence, makeELMt_inner(mt), null, null, false, true);
  }

  /**
   * Asserts the given sentence with bookkeeping, and then places it on the transcript queue.
   *
   * @param sentence the given sentence for assertion
   * @param mt the microtheory in which the assertion is placed
   *
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public void assertWithTranscriptAndBookkeeping(String sentence, CycObject mt)
          throws CycConnectionException, CycApiException {
    assertWithTranscriptAndBookkeeping(getCyc().getObjectTool().makeCycSentence(sentence), mt);
  }

  /**
   * Asserts the given sentence with bookkeeping, and then places it on the transcript queue.
   *
   * @param sentence the given sentence for assertion
   * @param mt the microtheory in which the assertion is placed
   *
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public void assertWithTranscriptAndBookkeeping(FormulaSentence sentence,
          CycObject mt)
          throws CycConnectionException, CycApiException {
    assertWithTranscriptAndBookkeepingInternal(sentence, mt);
  }

  /**
   * Asserts the given sentence with bookkeeping, and then places it on the transcript queue.
   *
   * @param sentence the given sentence for assertion
   * @param mt the microtheory in which the assertion is placed
   *
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public void assertWithTranscriptAndBookkeeping(CycList sentence, CycObject mt)
          throws CycConnectionException, CycApiException {
    assertWithTranscriptAndBookkeepingInternal(sentence, mt);
  }

  /**
   * Asserts the given sentence with bookkeeping and without placing it on the transcript queue.
   *
   * @param sentence the given sentence for assertion
   * @param mt the microtheory in which the assertion is placed
   *
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public void assertWithBookkeepingAndWithoutTranscript(CycList sentence,
          CycObject mt)
          throws CycConnectionException, CycApiException {
    assertWithBookkeepingAndWithoutTranscript(sentence.stringApiValue(), mt);
  }

  /**
   * Asserts the given sentence with bookkeeping and without placing it on the transcript queue.
   *
   * @param sentence the given sentence for assertion
   * @param mt the microtheory in which the assertion is placed
   *
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  public void assertWithBookkeepingAndWithoutTranscript(String sentence,
          CycObject mt)
          throws CycConnectionException,
          CycApiException {
    assertSentence(sentence, makeELMt_inner(mt), null, null, true, false);
  }

  @Override
  public void assertSentence(String sentence, ELMt mt, boolean bookkeeping,
          boolean transcript)
          throws CycConnectionException, CycApiException {
    assertSentence(sentence, mt, null, null, bookkeeping, transcript, (CycFort) null);
  }
  
  @Override
  public void assertSentence(String sentence, ELMt mt, String strength, String direction, boolean bookkeeping,
          boolean transcript)
          throws CycConnectionException, CycApiException {
    assertSentence(sentence, mt, strength, direction, bookkeeping, transcript, (CycFort) null);
  }
  
  @Override
  public void assertSentence(String sentence, ELMt mt, String strength, String direction, boolean bookkeeping,
          boolean transcript,
          Fort template)
          throws CycConnectionException, CycApiException {
    List<Fort> templates = new ArrayList<Fort>();
    if (template != null) {
      templates.add(template);
    }
    assertSentence(sentence, mt, strength, direction, bookkeeping, transcript, false, templates);
  }

  @Override
  public void assertSentence(String sentence, ELMt mt, boolean bookkeeping,
          boolean transcript,
          List<Fort> templates)
          throws CycConnectionException, CycApiException {
    assertSentence(sentence, mt, null, null, bookkeeping, transcript, false, templates);
  }
  
  @Override
  public void assertSentence(String sentence, ELMt mt, String strength, String direction, boolean bookkeeping,
          boolean transcript, boolean disableWFFChecking,
          List<Fort> templates)
          throws CycConnectionException, CycApiException {
    if (getCurrentTransaction() != null) {
      getCurrentTransaction().noteForAssertion(sentence, mt, bookkeeping,
              transcript, disableWFFChecking, templates);
      return;
    }
    if (strength == null){
    	strength = ":default";
    }
    if (direction == null){
    	direction = "";
    }
    String command = "(multiple-value-list (" + (true ? "ke-assert-now" : "cyc-assert") + "\n"
            + sentence + "\n" + mt.stringApiValue() + " " + strength + " " + direction + "))";
    if (bookkeeping) {
      command = getConverse().wrapBookkeeping(command);
    } else {
      command = getConverse().wrapCyclistAndPurpose(command);
    }
    command = getConverse().wrapForwardInferenceRulesTemplates(command, templates);
    if (disableWFFChecking) {
      command = getConverse().wrapDisableWffChecking(command);
    }
    CycList<Object> results = getConverse().converseList(command);
    boolean statusOk = !results.get(0).equals(CycObjectFactory.nil);
    if (!statusOk) {
      String message = "Assertion failed in mt: " + mt.cyclify();
      if (results.size() > 1) {
        message += "\n" + sentence + "\nbecause: \n" + results.get(1);
      }
      throw new CycApiException(message);
    }
  }
  
  /** Asserts that the given term is dependent upon the given independent term. If the latter is
   * killed, then the truth maintenance kills the dependent term.
   *
   * @param dependentTerm the dependent term
   * @param independentTerm the independent term
   * @param mt the assertion microtheory
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   */
  @Override
  public void assertTermDependsOn(final Fort dependentTerm,
          final Fort independentTerm, final Fort mt) throws CycConnectionException, CycApiException {
    // assert (#$termDependsOn <dependentTerm> <independentTerm>) in #$UniversalVocabularyMt
    assertGaf(mt, getKnownConstantByGuid_inner("bdf02d74-9c29-11b1-9dad-c379636f7270"),
            dependentTerm, independentTerm);
  }

  /** Asserts that the given term is defined in the given mt. If the mt is
   * subsequently killed, then the truth maintenance kills the dependent term.
   *
   * @param dependentTerm the dependent term
   * @param mt the defining microtheory
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   */
  @Override
  public void assertDefiningMt(final Fort dependentTerm, final Fort mt) throws CycConnectionException, CycApiException {
    // assert (#$definingMt <dependentTerm> <mt>) in #$BaseKB
    assertGaf(baseKB, getKnownConstantByGuid_inner(
            "bde5ec9c-9c29-11b1-9dad-c379636f7270"), dependentTerm, mt);
  }
  
    /**
   * Assert an argument contraint for the given relation and argument position. The operation will
   * be added to the KB transcript for replication and archive.
   *
   * @param relation the given relation
   *
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public void assertArg1FormatSingleEntry(Fort relation)
          throws CycConnectionException, CycApiException {
    // (#$arg1Format relation SingleEntry)
    assertArgFormat(relation, 1, getKnownConstantByGuid_inner(
            "bd5880eb-9c29-11b1-9dad-c379636f7270"));
  }

  /**
   * Assert an argument format contraint for the given relation and argument position. The
   * operation will be added to the KB transcript for replication and archive.
   *
   * @param relation the given relation
   * @param argPosition the given argument position
   * @param argNFormat the argument format constraint
   *
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public void assertArgFormat(Fort relation, int argPosition,
          Fort argNFormat)
          throws CycConnectionException, CycApiException {
    // (#$argFormat relation argPosition argNFormat)
    FormulaSentence sentence = CycFormulaSentence.makeCycFormulaSentence(
            getKnownConstantByGuid_inner("bd8a36e1-9c29-11b1-9dad-c379636f7270"),
            relation,
            argPosition, argNFormat);
    assertGaf(sentence, baseKB);
  }

  /**
   * Asserts that the given DAML imported term is mapped to the given Cyc term.
   *
   * @param cycTerm the mapped Cyc term
   * @param informationSource the external indexed information source
   * @param externalConcept the external concept within the information source
   * @param mt the assertion microtheory
   *
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws CycApiException if the Cyc server returns an error
   */
  @Override
  public void assertSynonymousExternalConcept(String cycTerm,
          String informationSource,
          String externalConcept,
          String mt)
          throws CycConnectionException, CycApiException {
    assertSynonymousExternalConcept(getKnownConstantByName_inner(cycTerm),
            getKnownConstantByName_inner(informationSource),
            externalConcept,
            getKnownConstantByName_inner(mt));
  }

  /**
   * Asserts that the given DAML imported term is mapped to the given Cyc term.
   *
   * @param cycTerm the mapped Cyc term
   * @param informationSource the external indexed information source
   * @param externalConcept the external concept within the information source
   * @param mt the assertion microtheory
   *
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws CycApiException if the Cyc server returns an error
   */
  @Override
  public void assertSynonymousExternalConcept(Fort cycTerm,
          Fort informationSource,
          String externalConcept,
          CycObject mt)
          throws CycConnectionException, CycApiException {
    FormulaSentence gaf = CycFormulaSentence.makeCycFormulaSentence(
            getKnownConstantByGuid_inner("c0e2af4e-9c29-11b1-9dad-c379636f7270"),
            cycTerm, informationSource, externalConcept);
    assertGaf(gaf, makeELMt_inner(mt));
  }
  
    /**
   * Assert that the specified CycConstant is a collection in the UniversalVocabularyMt. The
   * operation will be added to the KB transcript for replication and archive.
   *
   * @param cycFort the given collection term
   *
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public void assertIsaCollection(Fort cycFort)
          throws CycConnectionException, CycApiException {
    assertGaf(universalVocabularyMt,
            isa,
            cycFort,
            collection);
  }

  /**
   * Assert that the specified CycConstant is a collection in the specified defining microtheory
   * MT. The operation will be added to the KB transcript for replication and archive.
   *
   * @param cycFort the given collection term
   * @param mt the assertion microtheory
   *
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public void assertIsaCollection(Fort cycFort,
          CycObject mt)
          throws CycConnectionException, CycApiException {
    ELMt elmt = makeELMt_inner(mt);
    assertGaf(elmt,
            isa,
            cycFort,
            collection);
  }

  /**
   * Assert that the genlsCollection is a genls of specCollection, in the specified defining
   * microtheory MT. The operation will be added to the KB transcript for replication and archive.
   *
   * @param specCollectionName the name of the more specialized collection
   * @param genlsCollectionName the name of the more generalized collection
   * @param mtName the assertion microtheory name
   *
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public void assertGenls(String specCollectionName,
          String genlsCollectionName,
          String mtName)
          throws CycConnectionException, CycApiException {
    assertGaf(makeELMt_inner(getKnownConstantByName_inner(mtName)),
            genls,
            getKnownConstantByName_inner(specCollectionName),
            getKnownConstantByName_inner(genlsCollectionName));
  }

  /**
   * Assert that the genlsCollection is a genls of specCollection, in the UniversalVocabularyMt The
   * operation will be added to the KB transcript for replication and archive.
   *
   * @param specCollectionName the name of the more specialized collection
   * @param genlsCollectionName the name of the more generalized collection
   *
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public void assertGenls(String specCollectionName,
          String genlsCollectionName)
          throws CycConnectionException, CycApiException {
    assertGaf(universalVocabularyMt,
            genls,
            getKnownConstantByName_inner(specCollectionName),
            getKnownConstantByName_inner(genlsCollectionName));
  }

  /**
   * Assert that the genlsCollection is a genls of specCollection, in the UniveralVocabularyMt. The
   * operation will be added to the KB transcript for replication and archive.
   *
   * @param specCollection the more specialized collection
   * @param genlsCollection the more generalized collection
   *
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public void assertGenls(Fort specCollection,
          Fort genlsCollection)
          throws CycConnectionException, CycApiException {
    assertGaf(universalVocabularyMt,
            genls,
            specCollection,
            genlsCollection);
  }

  /**
   * Assert that the genlsCollection is a genls of specCollection, in the specified defining
   * microtheory MT. The operation will be added to the KB transcript for replication and archive.
   *
   * @param specCollection the more specialized collection
   * @param genlsCollection the more generalized collection
   * @param mt the assertion microtheory
   *
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public void assertGenls(Fort specCollection,
          Fort genlsCollection,
          CycObject mt)
          throws CycConnectionException, CycApiException {
    ELMt elmt = makeELMt_inner(mt);
    assertGaf(elmt,
            genls,
            specCollection,
            genlsCollection);
  }

  /**
   * Assert that the more general predicate is a genlPreds of the more specialized predicate,
   * asserted in the UniversalVocabularyMt The operation will be added to the KB transcript for
   * replication and archive.
   *
   * @param specPredName the name of the more specialized predicate
   * @param genlPredName the name of the more generalized predicate
   *
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public void assertGenlPreds(String specPredName,
          String genlPredName)
          throws CycConnectionException, CycApiException {
    CycConstantI genlPreds = getKnownConstantByGuid_inner(
            "bd5b4951-9c29-11b1-9dad-c379636f7270");
    assertGaf(universalVocabularyMt,
            genlPreds,
            getKnownConstantByName_inner(specPredName),
            getKnownConstantByName_inner(genlPredName));
  }

  /**
   * Assert that the more general predicate is a genlPreds of the more specialized predicate,
   * asserted in the UniversalVocabularyMt The operation will be added to the KB transcript for
   * replication and archive.
   *
   * @param specPred the more specialized predicate
   * @param genlPred the more generalized predicate
   *
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public void assertGenlPreds(Fort specPred,
          Fort genlPred)
          throws CycConnectionException, CycApiException {
    CycConstantI genlPreds = getKnownConstantByGuid_inner(
            "bd5b4951-9c29-11b1-9dad-c379636f7270");
    assertGaf(universalVocabularyMt,
            genlPreds,
            specPred,
            genlPred);
  }

  /**
   * Assert that term1 is conceptually related to term2 in the specified microtheory. The operation
   * will be added to the KB transcript for replication and archive.
   *
   * @param term1 the first symbol
   * @param term2 the second symbol
   * @param mt the microtheory in which the assertion is made
   *
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public void assertConceptuallyRelated(Fort term1,
          Fort term2,
          CycObject mt)
          throws CycConnectionException, CycApiException {
    CycConstantI conceptuallyRelated = getKnownConstantByGuid_inner(
            "bd58803e-9c29-11b1-9dad-c379636f7270");
    assertGaf(makeELMt_inner(mt),
            conceptuallyRelated,
            term1,
            term2);
  }

  /**
   * Assert that the more general micortheory is a genlMt of the more specialized microtheory,
   * asserted in the UniversalVocabularyMt The operation will be added to the KB transcript for
   * replication and archive.
   *
   * @param specMtName the name of the more specialized microtheory
   * @param genlsMtName the name of the more generalized microtheory
   *
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public void assertGenlMt(String specMtName,
          String genlsMtName)
          throws CycConnectionException, CycApiException {
    assertGaf(universalVocabularyMt,
            genlMt,
            getKnownConstantByName_inner(specMtName),
            getKnownConstantByName_inner(genlsMtName));
  }

  /**
   * Assert that the more general micortheory is a genlMt of the more specialized microtheory,
   * asserted in the UniversalVocabularyMt The operation will be added to the KB transcript for
   * replication and archive.
   *
   * @param specMt the more specialized microtheory
   * @param genlsMt the more generalized microtheory
   *
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public void assertGenlMt(Fort specMt,
          Fort genlsMt)
          throws CycConnectionException, CycApiException {
    assertGaf(universalVocabularyMt, genlMt, specMt, genlsMt);
  }

  /**
   * Assert that the cycFort is a collection in the UniversalVocabularyMt. The operation will be
   * added to the KB transcript for replication and archive.
   *
   * @param cycFortName the collection element name
   * @param collectionName the collection name
   *
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public void assertIsa(String cycFortName,
          String collectionName)
          throws CycConnectionException, CycApiException {
    assertGaf(universalVocabularyMt,
            isa,
            getKnownConstantByName_inner(cycFortName),
            getKnownConstantByName_inner(collectionName));
  }

  /**
   * Assert that the cycFort is a collection, in the specified defining microtheory MT. The
   * operation will be added to the KB transcript for replication and archive.
   *
   * @param cycFortName the collection element name
   * @param collectionName the collection name
   * @param mtName the assertion microtheory name
   *
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public void assertIsa(String cycFortName,
          String collectionName,
          String mtName)
          throws CycConnectionException, CycApiException {
    assertGaf(makeELMt_inner(getKnownConstantByName_inner(mtName)),
            isa,
            getKnownConstantByName_inner(cycFortName),
            getKnownConstantByName_inner(collectionName));
  }

  /**
   * Assert that the cycFort is a collection, in the specified defining microtheory MT. The
   * operation will be added to the KB transcript for replication and archive.
   *
   * @param cycFort the collection element
   * @param aCollection the collection
   * @param mt the assertion microtheory
   *
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public void assertIsa(Fort cycFort,
          Fort aCollection,
          CycObject mt)
          throws CycConnectionException, CycApiException {
    assertGaf(makeELMt_inner(mt),
            isa,
            cycFort,
            aCollection);
  }

  /**
   * Assert that the cycFort term itself is a collection, in the given mt. The operation will be
   * added to the KB transcript for replication and archive.
   *
   * @param cycFort the collection element
   * @param aCollection the collection
   * @param mt the assertion microtheory
   *
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public void assertQuotedIsa(Fort cycFort, Fort aCollection, CycObject mt)
          throws CycConnectionException, CycApiException {
    assertGaf(makeELMt_inner(mt),
            getKnownConstantByGuid_inner("055544a2-4371-11d6-8000-00a0c9da2002"),
            cycFort,
            aCollection);
  }

  /**
   * Assert that the cycFort is a collection, in the UniversalVocabularyMt. The operation will be
   * added to the KB transcript for replication and archive.
   *
   * @param instance the collection element
   * @param aCollection the collection
   *
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public void assertIsa(DenotationalTerm instance,
          DenotationalTerm aCollection)
          throws CycConnectionException, CycApiException {
    assertGaf(universalVocabularyMt,
            isa,
            instance,
            aCollection);
  }

  /**
   * Assert that the specified CycConstant is a #$BinaryPredicate in the specified defining
   * microtheory. The operation will be added to the KB transcript for replication and archive.
   *
   * @param cycFort the given term
   *
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public void assertIsaBinaryPredicate(Fort cycFort)
          throws CycConnectionException, CycApiException {
    assertIsa(cycFort,
            binaryPredicate,
            universalVocabularyMt);
  }

  /**
   * Assert that the specified CycConstant is a #$BinaryPredicate in the specified defining
   * microtheory. The operation will be added to the KB transcript for replication and archive.
   *
   * @param cycFort the given term
   * @param mt the defining microtheory
   *
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public void assertIsaBinaryPredicate(Fort cycFort,
          CycObject mt)
          throws CycConnectionException, CycApiException {
    assertIsa(cycFort,
            binaryPredicate,
            makeELMt_inner(mt));
  }
  
  /**
   * Assert a nameString for the specified CycConstant in the specified lexical microtheory. The
   * operation will be added to the KB transcript for replication and archive.
   *
   * @param cycConstantName the name of the given term
   * @param nameString the given name string for the term
   * @param mtName the name of the microtheory in which the name string is asserted
   *
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public void assertNameString(String cycConstantName,
          String nameString,
          String mtName)
          throws CycConnectionException, CycApiException {
    assertGaf(makeELMt_inner(getKnownConstantByName_inner(mtName)),
            getKnownConstantByGuid_inner("c0fdf7e8-9c29-11b1-9dad-c379636f7270"),
            getKnownConstantByName_inner(cycConstantName),
            nameString);
  }

  /**
   * Assert a comment for the specified CycConstant in the specified microtheory MT. The operation
   * will be added to the KB transcript for replication and archive.
   *
   * @param cycConstantName the name of the given term
   * @param comment the comment string
   * @param mtName the name of the microtheory in which the comment is asserted
   *
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public void assertComment(String cycConstantName,
          String comment,
          String mtName)
          throws CycConnectionException, CycApiException {
    assertGaf(makeELMt_inner(getKnownConstantByName_inner(mtName)),
            CommonConstants.comment,
            getKnownConstantByName_inner(cycConstantName),
            comment);
  }

  /**
   * Assert a comment for the specified CycFort in the specified microtheory. The operation will be
   * added to the KB transcript for replication and archive.
   *
   * @param cycFort the given term
   * @param comment the comment string
   * @param mt the comment assertion microtheory
   *
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public void assertComment(Fort cycFort,
          String comment,
          CycObject mt)
          throws CycConnectionException, CycApiException {
    ELMt elmt = makeELMt_inner(mt);
    assertGaf(elmt,
            CommonConstants.comment,
            cycFort,
            comment);
  }

  /**
   * Assert a name string for the specified CycFort in the specified microtheory. The operation
   * will be added to the KB transcript for replication and archive.
   *
   * @param cycFort the given term
   * @param nameString the name string
   * @param mt the name string assertion microtheory
   *
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public void assertNameString(Fort cycFort,
          String nameString,
          CycObject mt)
          throws CycConnectionException, CycApiException {
    ELMt elmt = makeELMt_inner(mt);
    assertGaf(elmt,
            getKnownConstantByGuid_inner("c0fdf7e8-9c29-11b1-9dad-c379636f7270"),
            cycFort,
            nameString);
  }

  /**
   * Assert a paraphrase format for the specified CycFort in the #$EnglishParaphraseMt. The
   * operation will be added to the KB transcript for replication and archive.
   *
   * @param relation the given term
   * @param genFormatString the genFormat string
   * @param genFormatList the genFormat argument substitution sequence
   *
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Deprecated
  public void assertGenFormat(Fort relation,
          String genFormatString,
          CycList genFormatList)
          throws CycConnectionException, CycApiException {
    // (#$genFormat <relation> <genFormatString> <genFormatList>)
    CycArrayList sentence = new CycArrayList();
    sentence.add(getKnownConstantByGuid_inner("beed06de-9c29-11b1-9dad-c379636f7270"));
    sentence.add(relation);
    sentence.add(genFormatString);

    if (genFormatList.size() == 0) {
      sentence.add(CycObjectFactory.nil);
    } else {
      sentence.add(genFormatList);
    }

    assertGaf(sentence,
            // #$EnglishParaphraseMt
            makeELMt_inner(getKnownConstantByGuid_inner(
            "bda16220-9c29-11b1-9dad-c379636f7270")));
  }
  
  /**
   * Asserts each of the given list of forts to be instances of the given collection in the
   * UniversalVocabularyMt
   *
   * @param fortNames the list of forts
   * @param collectionName
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycApiException if the Cyc server returns an error
   */
  @Override
  public void assertIsas(List fortNames,
          String collectionName)
          throws CycConnectionException, CycApiException {
    List forts = new ArrayList();

    for (int i = 0; i < forts.size(); i++) {
      Object fort = forts.get(i);

      if (fort instanceof String) {
        forts.add(getKnownConstantByName_inner((String) fort));
      } else if (fort instanceof CycFort) {
        forts.add(fort);
      } else {
        throw new CycApiException(fort + " is neither String nor CycFort");
      }

      assertIsas(forts,
              getKnownConstantByName_inner(collectionName));
    }
  }

  /**
   * Asserts each of the given list of forts to be instances of the given collection in the
   * UniversalVocabularyMt
   *
   * @param forts the list of forts
   * @param collection
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycApiException if the Cyc server returns an error
   */
  @Override
  public void assertIsas(List forts,
          Fort collection)
          throws CycConnectionException, CycApiException {
    for (int i = 0; i < forts.size(); i++) {
      assertIsa((CycFort) forts.get(i),
              collection);
    }
  }
  
  /**
   * Asserts a ground atomic formula (gaf) in the specified microtheory MT. The operation will be
   * added to the KB transcript for replication and archive.
   *
   * @param mt the microtheory in which the assertion is made
   * @param predicate the binary predicate of the assertion
   * @param arg1 the first argument of the predicate
   * @param arg2 the second argument of the predicate
   *
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public void assertGaf(CycObject mt,
          DenotationalTerm predicate,
          DenotationalTerm arg1,
          DenotationalTerm arg2)
          throws CycConnectionException, CycApiException {
    // (predicate <CycFort> <CycFort>)
    CycArrayList sentence = new CycArrayList();
    sentence.add(predicate);
    sentence.add(arg1);
    sentence.add(arg2);
    assertWithTranscriptAndBookkeeping(sentence, mt);
  }

  /**
   * Asserts a ground atomic formula (gaf) in the specified microtheory MT. The operation will be
   * added to the KB transcript for replication and archive.
   *
   * @param mt the microtheory in which the assertion is made
   * @param predicate the binary predicate of the assertion
   * @param arg1 the first argument of the predicate
   * @param arg2 the second argument of the predicate, which is a string
   *
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public void assertGaf(CycObject mt,
          Fort predicate,
          Fort arg1,
          String arg2)
          throws CycConnectionException, CycApiException {
    // (predicate <CycFort> <String>)
    CycArrayList sentence = new CycArrayList();
    sentence.add(predicate);
    sentence.add(arg1);
    sentence.add(arg2);
    assertWithTranscriptAndBookkeeping(sentence, mt);
  }

  /**
   * Asserts a ground atomic formula (gaf) in the specified microtheory MT. The operation will be
   * added to the KB transcript for replication and archive.
   *
   * @param mt the microtheory in which the assertion is made
   * @param predicate the binary predicate of the assertion
   * @param arg1 the first argument of the predicate
   * @param arg2 the second argument of the predicate, which is a CycArrayList
   *
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public void assertGaf(CycObject mt,
          CycConstantI predicate,
          Fort arg1,
          CycList arg2)
          throws CycConnectionException, CycApiException {
    // (predicate <CycFort> <List>)
    CycArrayList sentence = new CycArrayList();
    sentence.add(predicate);
    sentence.add(arg1);
    sentence.add(arg2);
    assertWithTranscriptAndBookkeeping(sentence, mt);
  }

  /**
   * Asserts a ground atomic formula (gaf) in the specified microtheory MT. The operation will be
   * added to the KB transcript for replication and archive.
   *
   * @param mt the microtheory in which the assertion is made
   * @param predicate the binary predicate of the assertion
   * @param arg1 the first argument of the predicate
   * @param arg2 the second argument of the predicate, which is an int
   *
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public void assertGaf(CycObject mt,
          CycConstantI predicate,
          Fort arg1,
          int arg2)
          throws CycConnectionException, CycApiException {
    // (predicate <CycFort> <int>)
    assertGaf(mt, predicate, arg1, arg2);
  }

  /**
   * Asserts a ground atomic formula (gaf) in the specified microtheory. The operation will be
   * added to the KB transcript for replication and archive.
   *
   * @param mt the microtheory in which the assertion is made
   * @param predicate the binary predicate of the assertion
   * @param arg1 the first argument of the predicate
   * @param arg2 the second argument of the predicate, which is an Integer
   *
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public void assertGaf(CycObject mt,
          Fort predicate,
          Fort arg1,
          Integer arg2)
          throws CycConnectionException, CycApiException {
    // (predicate <CycFort> <int>)
    CycArrayList sentence = new CycArrayList();
    sentence.add(predicate);
    sentence.add(arg1);
    sentence.add(arg2);
    assertWithTranscriptAndBookkeeping(sentence, mt);
  }

  /**
   * Asserts a ground atomic formula (gaf) in the specified microtheory. The operation will be
   * added to the KB transcript for replication and archive.
   *
   * @param mt the microtheory in which the assertion is made
   * @param predicate the binary predicate of the assertion
   * @param arg1 the first argument of the predicate
   * @param arg2 the second argument of the predicate, which is a Double
   *
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public void assertGaf(CycObject mt,
          Fort predicate,
          Fort arg1,
          Double arg2)
          throws CycConnectionException, CycApiException {
    // (predicate <CycFort> <int>)
    CycArrayList sentence = new CycArrayList();
    sentence.add(predicate);
    sentence.add(arg1);
    sentence.add(arg2);
    assertWithTranscriptAndBookkeeping(sentence, mt);
  }

  /**
   * Asserts a ground atomic formula (gaf) in the specified microtheory MT. The operation and its
   * bookkeeping info will be added to the KB transcript for replication and archive.
   *
   * @param mt the microtheory in which the assertion is made
   * @param predicate the ternary predicate of the assertion
   * @param arg1 the first argument of the predicate
   * @param arg2 the second argument of the predicate
   * @param arg3 the third argument of the predicate
   *
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public void assertGaf(CycObject mt,
          CycConstantI predicate,
          Fort arg1,
          Fort arg2,
          Fort arg3)
          throws CycConnectionException, CycApiException {
    // (predicate <CycFort> <CycFort> <CycFort>)
    CycArrayList sentence = new CycArrayList();
    sentence.add(predicate);
    sentence.add(arg1);
    sentence.add(arg2);
    sentence.add(arg3);
    assertWithTranscriptAndBookkeeping(sentence, mt);
  }

  /**
   * Asserts a ground atomic formula (gaf) in the specified microtheory MT. The operation will be
   * added to the KB transcript for replication and archive.
   *
   * @param gaf the gaf in the form of a CycArrayList
   * @param mt the microtheory in which the assertion is made
   *
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public void assertGaf(CycList gaf,
          CycObject mt)
          throws CycConnectionException, CycApiException {
    assertWithTranscriptAndBookkeeping(gaf, mt);
  }

  /**
   * Asserts a ground atomic formula (gaf) in the specified microtheory MT. The operation will be
   * added to the KB transcript for replication and archive.
   *
   * @param gaf the gaf in the form of a CycFormulaSentence
   * @param mt the microtheory in which the assertion is made
   *
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public void assertGaf(FormulaSentence gaf, CycObject mt)
          throws CycConnectionException, CycApiException {
    assertWithTranscriptAndBookkeepingInternal(gaf, mt);
  }

  /**
   * Asserts a ground atomic formula (gaf) in the specified microtheory MT. The operation is performed at the HL level
   * and does not perform wff-checking, nor forward inference, nor bookkeeping assertions, nor transcript recording. The advantage of
   * this method is that it is fast. It does not respect KBTransactions. If this called while a SimpleKBTransaction is active, it
   * will throw and UnsupportedOperationException.
   *
   * @param gaf the gaf in the form of a CycArrayList
   * @param mt the microtheory in which the assertion is made
   * @param strength the assertion strength (e.g. :default or :monotonic)
   *
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public void assertHLGaf(final CycList gaf, final CycObject mt,
          final CycSymbolI strength)
          throws CycConnectionException, CycApiException {
    // (HL-ADD-ARGUMENT '(:ASSERTED-ARGUMENT <strength>) '(NIL ((<gaf>)) <mt> :FORWARD NIL)
    if (getCurrentTransaction() != null) {
      throw new UnsupportedOperationException(
              "Attempt to call assertHLGaf aborted.  This method is not supported within the scope of a KBTransaction.");
    }
    final CycArrayList command = new CycArrayList();
    command.add(makeCycSymbol("hl-add-argument"));
    final CycArrayList command1 = new CycArrayList();
    command1.add(makeCycSymbol(":asserted-argument"));
    command1.add(strength);
    command.addQuoted(command1);
    final CycArrayList command2 = new CycArrayList();
    command2.add(CycObjectFactory.nil);
    final CycArrayList command3 = new CycArrayList();
    final CycArrayList canonicalGaf = new CycArrayList();
    final int gaf_size = gaf.size();
    for (int i = 0; i < gaf_size; i++) {
      final Object obj = gaf.get(i);
      if (obj instanceof CycNart) {
        canonicalGaf.add(((CycNart) obj).getFormula());
      } else {
        canonicalGaf.add(obj);
      }
    }
    command3.add(canonicalGaf);
    command2.add(command3);
    command.addQuoted(command2);
    command.add(mt);
    command.add(makeCycSymbol(":forward"));
    command.add(CycObjectFactory.nil);
    getConverse().converseCycObject(command);
  }
  
  /**
   * Asserts a preferred name string for the given term using lexical singular count noun
   * assumptions.
   *
   * @param cycTerm the Cyc term
   * @param phrase the preferred phrase for this term
   *
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws CycApiException if the Cyc server returns an error
   */
  @Override
  public void assertGenPhraseCountNounSingular(Fort cycTerm,
          String phrase)
          throws CycConnectionException, CycApiException {
    // (#$genPhrase <term> #$CountNoun #$singular <phrase>) in #$EnglishParaphaseMt
    final FormulaSentence gaf = CycFormulaSentence.makeCycFormulaSentence(
            getKnownConstantByGuid_inner("bd5fb28e-9c29-11b1-9dad-c379636f7270"),
            cycTerm,
            getKnownConstantByGuid_inner("bd588078-9c29-11b1-9dad-c379636f7270"),
            getKnownConstantByGuid_inner("bd6757b8-9c29-11b1-9dad-c379636f7270"),
            phrase);

    ELMt elmt = makeELMt_inner(getKnownConstantByGuid_inner(
            "bda16220-9c29-11b1-9dad-c379636f7270"));
    assertGaf(gaf, elmt);
  }

  /**
   * Asserts a preferred name string for the given term using lexical singular count noun
   * assumptions.
   *
   * @param cycTerm the Cyc term
   * @param phrase the preferred phrase for this term
   *
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws CycApiException if the Cyc server returns an error
   */
  @Override
  public void assertGenPhraseCountNounPlural(Fort cycTerm,
          String phrase)
          throws CycConnectionException, CycApiException {
    CycArrayList gaf = new CycArrayList();


    // (#$genPhrase <term> #$CountNoun #$plural <phrase>) in
    // #$EnglishParaphaseMt
    gaf.add(getKnownConstantByGuid_inner("bd5fb28e-9c29-11b1-9dad-c379636f7270"));
    gaf.add(cycTerm);
    gaf.add(getKnownConstantByGuid_inner("bd588078-9c29-11b1-9dad-c379636f7270"));
    gaf.add(getKnownConstantByGuid_inner("bd5a6853-9c29-11b1-9dad-c379636f7270"));
    gaf.add(phrase);

    ELMt elmt = makeELMt_inner(getKnownConstantByGuid_inner(
            "bda16220-9c29-11b1-9dad-c379636f7270"));
    assertGaf(gaf,
            elmt);
  }
  
  /**
   * Edit the sentence contained in unassertSentence to instead be
   * assertSentence. If the Mt is null, unassertSentence and assertSentence
   * must be contextualized sentences (i.e. the Mt must be specified using
   * #$ist). If unassertSentence is an empty conjunction, this amounts to "assert", while
   * if assertSentence is an empty conjunction, it amounts to unassert.
   *
   * @param unassertSentence
   * @param assertSentence
   * @param mt
   * @param bookkeeping
   * @param transcript
   * @param disableWFFChecking
   * @param templates
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   */
  @Override
  public void edit(String unassertSentence, String assertSentence, ELMt mt,
          boolean bookkeeping, boolean transcript, boolean disableWFFChecking,
          List<Fort> templates) throws CycApiException, CycConnectionException {
    String command = "(multiple-value-list (" + (transcript ? "ke-edit-now" : "cyc-edit") + "\n"
            + unassertSentence + "\n" + assertSentence + "\n" + mt.stringApiValue() + "))";
    if (bookkeeping) {
      command = getConverse().wrapBookkeeping(command);
    } else {
      command = getConverse().wrapCyclistAndPurpose(command);
    }
    command = getConverse().wrapForwardInferenceRulesTemplates(command, templates);
    if (disableWFFChecking) {
      command = getConverse().wrapDisableWffChecking(command);
    }
    CycList<Object> results = getConverse().converseList(command);
    boolean statusOk = !results.get(0).equals(CycObjectFactory.nil);
    if (!statusOk) {
      throw new CycApiException("Edit failure of " + unassertSentence + " to " + assertSentence + " in mt: " + mt.cyclify()
              + "\nbecause: \n" + results.get(1));
    }
  }
  
  /**
   * Creates a new permanent Cyc constant in the KB with the specified name. The operation will be
   * added to the KB transcript for replication and archive.
   *
   * @param constantName the name of the new constant
   *
   * @return the new constant term
   *
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycConstantI createNewPermanent(String constantName)
          throws CycConnectionException, CycApiException {
    return getCyc().getObjectTool().makeCycConstant(constantName);
  }
  
    /**
   * Creates a new binary predicate term.
   *
   * @param predicateName the name of the new binary predicate
   * @param predicateTypeName the type of binary predicate, for example
   * #$TransitiveBinaryPredicate, which when null defaults to #$BinaryPredicate
   * @param comment the comment for the new binary predicate, or null
   * @param arg1IsaName the argument position one type constraint, or null
   * @param arg2IsaName the argument position two type constraint, or null
   * @param arg1FormatName the argument position one format constraint, or null
   * @param arg2FormatName the argument position two format constraint, or null
   * @param genlPredsName the more general binary predicate of which this new predicate is a
   * specialization, that when null defaults to #$conceptuallyRelated
   * @param genFormatList the paraphrase generation list string, or null
   * @param genFormatString the paraphrase generation string, or null
   *
   * @return the new binary predicate term
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycApiException if the Cyc server returns an error
   */
  @Override
  public CycConstantI createBinaryPredicate(String predicateName,
          String predicateTypeName,
          String comment,
          String arg1IsaName,
          String arg2IsaName,
          String arg1FormatName,
          String arg2FormatName,
          String genlPredsName,
          String genFormatString,
          String genFormatList)
          throws CycConnectionException, CycApiException {
    return createBinaryPredicate(predicateName,
            find_inner(predicateTypeName),
            comment,
            find_inner(arg1IsaName),
            find_inner(arg2IsaName),
            find_inner(arg1FormatName),
            find_inner(arg2FormatName),
            find_inner(genlPredsName),
            genFormatString,
            makeCycList_inner(genFormatList));
  }

  /**
   * Creates a new binary predicate term.
   *
   * @param predicateName the name of the new binary predicate
   * @param predicateType the type of binary predicate, for example #$TransitiveBinaryPredicate,
   * which when null defaults to #$BinaryPredicate
   * @param comment the comment for the new binary predicate, or null
   * @param arg1Isa the argument position one type constraint, or null
   * @param arg2Isa the argument position two type constraint, or null
   * @param arg1Format the argument position one format constraint, or null
   * @param arg2Format the argument position two format constraint, or null
   * @param genlPreds the more general binary predicate of which this new predicate is a
   * specialization, that when null defaults to #$conceptuallyRelated
   * @param genFormatList the paraphrase generation list string, or null
   * @param genFormatString the paraphrase generation string, or null
   *
   * @return the new binary predicate term
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycApiException if the Cyc server returns an error
   */
  @Override
  public CycConstantI createBinaryPredicate(String predicateName,
          Fort predicateType,
          String comment,
          Fort arg1Isa,
          Fort arg2Isa,
          Fort arg1Format,
          Fort arg2Format,
          Fort genlPreds,
          String genFormatString,
          CycList genFormatList)
          throws CycConnectionException, CycApiException {
    CycConstantI predicate = findOrCreate_inner(predicateName);

    if (predicateType == null) {
      assertIsa(predicate,
              binaryPredicate);
    } else {
      assertIsa(predicate,
              predicateType);
    }

    if (comment != null) {
      assertComment(predicate,
              comment,
              baseKB);
    }

    if (arg1Isa != null) {
      assertArgIsa(predicate,
              1,
              arg1Isa);
    }

    if (arg2Isa != null) {
      assertArgIsa(predicate,
              2,
              arg2Isa);
    }

    if (arg1Format != null) {
      assertArgFormat(predicate,
              1,
              arg1Format);
    }

    if (arg2Format != null) {
      assertArgFormat(predicate,
              2,
              arg2Format);
    }

    if (genlPreds == null) {
      assertGenlPreds(predicate,
              // #$conceptuallyRelated
              getKnownConstantByGuid_inner("bd58803e-9c29-11b1-9dad-c379636f7270"));
    } else {
      assertGenlPreds(predicate,
              genlPreds);
    }

    if ((genFormatString != null) && (genFormatList != null)) {
      assertGenFormat(predicate,
              genFormatString,
              genFormatList);
    }

    return predicate;
  }

  /**
   * Creates a new KB subset collection term.
   *
   * @param constantName the name of the new KB subset collection
   * @param comment the comment for the new KB subset collection
   *
   * @return the new KB subset collection term
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycApiException if the Cyc server returns an error
   */
  @Override
  public CycConstantI createKbSubsetCollection(String constantName,
          String comment)
          throws CycConnectionException, CycApiException {
    CycConstantI kbSubsetCollection = getKnownConstantByName_inner(
            "KBSubsetCollection");
    CycConstantI cycConstant = getConstantByName_inner(constantName);

    if (cycConstant == null) {
      cycConstant = createNewPermanent(constantName);
    }

    assertIsa(cycConstant,
            kbSubsetCollection);
    assertComment(cycConstant,
            comment,
            baseKB);
    assertGenls(cycConstant,
            thing);

    Fort variableOrderCollection = getKnownConstantByGuid_inner(
            "36cf85d0-20a1-11d6-8000-0050dab92c2f");
    assertIsa(cycConstant,
            variableOrderCollection,
            baseKB);

    return cycConstant;
  }

  /**
   * Creates a new collection term.
   *
   * @param collectionName the name of the new collection
   * @param comment the comment for the collection
   * @param commentMtName the name of the microtheory in which the comment is asserted
   * @param isaName the name of the collection of which the new collection is an instance
   * @param genlsName the name of the collection of which the new collection is a subset
   *
   * @return the new collection term
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycApiException if the Cyc server returns an error
   */
  @Override
  public CycConstantI createCollection(String collectionName,
          String comment,
          String commentMtName,
          String isaName,
          String genlsName)
          throws CycConnectionException, CycApiException {
    CycConstantI cycCollection = findOrCreate_inner(collectionName);
    assertComment(cycCollection,
            comment,
            getKnownConstantByName_inner(commentMtName));
    assertIsa(cycCollection,
            getKnownConstantByName_inner(isaName));
    assertGenls(cycCollection,
            getKnownConstantByName_inner(genlsName));

    return cycCollection;
  }

  /**
   * Creates a new collection term.
   *
   * @param collectionName the name of the new collection
   * @param comment the comment for the collection
   * @param commentMt the microtheory in which the comment is asserted
   * @param isa the collection of which the new collection is an instance
   * @param genls the collection of which the new collection is a subset
   *
   * @return the new collection term
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycApiException if the Cyc server returns an error
   */
  @Override
  public Fort createCollection(String collectionName,
          String comment,
          Fort commentMt,
          Fort isa,
          Fort genls)
          throws CycConnectionException, CycApiException {
    return createCollection(findOrCreate_inner(collectionName),
            comment,
            commentMt,
            isa,
            genls);
  }

  /**
   * Creates a new collection term.
   *
   * @param collection the new collection
   * @param comment the comment for the collection
   * @param commentMt the microtheory in which the comment is asserted
   * @param isa the collection of which the new collection is an instance
   * @param genls the collection of which the new collection is a subset
   *
   * @return the new collection term
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycApiException if the Cyc server returns an error
   */
  @Override
  public Fort createCollection(Fort collection,
          String comment,
          Fort commentMt,
          Fort isa,
          Fort genls)
          throws CycConnectionException, CycApiException {
    assertComment(collection,
            comment,
            commentMt);
    assertIsa(collection,
            isa);
    assertGenls(collection,
            genls);

    return collection;
  }
  
  /**
   * Create a microtheory MT, with a comment, isa MT-TYPE and CycFort genlMts. An existing
   * microtheory with the same name is killed first, if it exists.
   *
   * @param mtName the name of the microtheory term
   * @param comment the comment for the new microtheory
   * @param isaMt the type of the new microtheory
   * @param genlMts the list of more general microtheories
   *
   * @return the new microtheory term
   *
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycConstantI createMicrotheory(String mtName,
          String comment,
          Fort isaMt,
          List genlMts)
          throws CycConnectionException, CycApiException {
    CycConstantI mt = getConstantByName_inner(mtName);

    if (mt != null) {
      getCyc().getUnassertTool().kill(mt);
    }

    mt = createNewPermanent(mtName);
    assertComment(mt,
            comment,
            baseKB);
    assertGaf(universalVocabularyMt,
            isa,
            mt,
            isaMt);

    Iterator iterator = genlMts.iterator();

    while (true) {
      if (!iterator.hasNext()) {
        break;
      }

      CycFort aGenlMt = (CycFort) iterator.next();
      assertGaf(universalVocabularyMt,
              genlMt,
              mt,
              aGenlMt);
    }

    return mt;
  }
  
  /**
   * Create a microtheory MT, with a comment, isa MT-TYPE and CycFort genlMts.
   *
   * @param mt the microtheory term
   * @param comment the comment for the new microtheory
   * @param isaMt the type of the new microtheory
   * @param genlMts the list of more general microtheories
   *
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public void createMicrotheory(Fort mt,
          String comment,
          Fort isaMt,
          List genlMts)
          throws CycConnectionException, CycApiException {
    assertComment(mt,
            comment,
            baseKB);
    assertGaf(universalVocabularyMt,
            isa,
            mt,
            isaMt);
    Iterator iterator = genlMts.iterator();
    while (true) {
      if (!iterator.hasNext()) {
        break;
      }
      final CycArrayList gaf = new CycArrayList(3);
      gaf.add(genlMt);
      gaf.add(mt);
      gaf.add(iterator.next());
      assertGaf(gaf, universalVocabularyMt);
    }
  }
  
  /**
   * Create a microtheory MT, with a comment, isa MT-TYPE and CycFort genlMts. An existing
   * microtheory with the same name is killed first, if it exists.
   *
   * @param mtName the name of the microtheory term
   * @param comment the comment for the new microtheory
   * @param isaMtName the type (as a string) of the new microtheory
   * @param genlMts the list of more general microtheories (as strings)
   *
   * @return the new microtheory term
   *
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycConstantI createMicrotheory(String mtName,
          String comment,
          String isaMtName,
          List genlMts)
          throws CycConnectionException, CycApiException {
    CycConstantI mt = getConstantByName_inner(mtName);

    if (mt != null) {
      getCyc().getUnassertTool().kill(mt);
    }

    mt = createNewPermanent(mtName);
    assertComment(mt,
            comment,
            baseKB);
    assertIsa(mtName,
            isaMtName);

    Iterator iterator = genlMts.iterator();

    while (true) {
      if (!iterator.hasNext()) {
        break;
      }

      String genlMtName = (String) iterator.next();
      assertGenlMt(mtName,
              genlMtName);
    }

    return mt;
  }

  /**
   * Create a microtheory system for a new mt. Given a root mt name, create a theory ROOTMt,
   * create a vocabulary ROOTVocabMt, and a data ROOTDataMt. Establish genlMt links for the
   * theory mt and data mt. Assert that the theory mt is a genlMt of the
   * WorldLikeOursCollectorMt. Assert that the data mt is a genlMt of the collector
   * CurrentWorldDataMt.
   *
   * @param mtRootName the root name of the microtheory system
   * @param comment the root comment of the microtheory system
   * @param genlMts the list of more general microtheories
   *
   * @return an array of three elements consisting of the theory mt, vocabulary mt, and the data mt
   *
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public CycConstantI[] createMicrotheorySystem(String mtRootName,
          String comment,
          List genlMts)
          throws CycConnectionException, CycApiException {
    //traceOn();
    CycConstantI[] mts = {null, null, null};
    String theoryMtName = mtRootName + "Mt";
    String vocabMtName = mtRootName + "VocabMt";
    String vocabMtComment = "The #$VocabularyMicrotheory for #$" + theoryMtName;
    String dataMtName = mtRootName + "DataMt";
    String dataMtComment = "The #$DataMicrotheory for #$" + theoryMtName;
    CycConstantI worldLikeOursMt = getKnownConstantByGuid_inner(
            "bf4c781d-9c29-11b1-9dad-c379636f7270");
    CycConstantI genlMt_Vocabulary = getKnownConstantByGuid_inner(
            "c054a49e-9c29-11b1-9dad-c379636f7270");

    CycConstantI theoryMicrotheory = getKnownConstantByGuid_inner(
            "be5275a8-9c29-11b1-9dad-c379636f7270");
    CycConstantI theoryMt = createMicrotheory(theoryMtName,
            comment,
            theoryMicrotheory,
            genlMts);
    CycConstantI vocabularyMicrotheory = getKnownConstantByGuid_inner(
            "bda19dfd-9c29-11b1-9dad-c379636f7270");
    CycConstantI vocabMt = createMicrotheory(vocabMtName,
            vocabMtComment,
            vocabularyMicrotheory,
            new ArrayList());
    CycConstantI dataMicrotheory = getKnownConstantByGuid_inner(
            "be5275a8-9c29-11b1-9dad-c379636f7270");
    CycConstantI dataMt = createMicrotheory(dataMtName,
            dataMtComment,
            dataMicrotheory,
            new ArrayList());
    assertGaf(baseKB,
            genlMt_Vocabulary,
            theoryMt,
            vocabMt);
    assertGaf(baseKB,
            genlMt,
            dataMt,
            theoryMt);
    assertGaf(baseKB,
            genlMt,
            worldLikeOursMt,
            theoryMt);
    assertGaf(baseKB,
            genlMt,
            currentWorldDataMt,
            dataMt);
    mts[0] = theoryMt;
    mts[1] = vocabMt;
    mts[2] = dataMt;

    //traceOff();
    return mts;
  }
  
  /**
   * Creates a new Collector microtheory and links it more general mts.
   *
   * @param mtName the name of the new collector microtheory
   * @param comment the comment for the new collector microtheory
   * @param genlMts the list of more general microtheories
   *
   * @return the new microtheory
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycApiException if the Cyc server returns an error
   */
  @Override
  public CycConstantI createCollectorMt(String mtName,
          String comment,
          List genlMts)
          throws CycConnectionException, CycApiException {
    CycConstantI collectorMt = getKnownConstantByName_inner("CollectorMicrotheory");

    return createMicrotheory(mtName,
            comment,
            collectorMt,
            genlMts);
  }

  /**
   * Creates a new spindle microtheory in the given spindle system.
   *
   * @param spindleMtName the name of the new spindle microtheory
   * @param comment the comment for the new spindle microtheory
   * @param spindleHeadMtName the name of the spindle head microtheory
   * @param spindleCollectorMtName the name of the spindle head microtheory
   *
   * @return the new spindle microtheory in the given spindle system
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycApiException if the Cyc server returns an error
   */
  @Override
  public CycConstantI createSpindleMt(String spindleMtName,
          String comment,
          String spindleHeadMtName,
          String spindleCollectorMtName)
          throws CycConnectionException, CycApiException {
    return createSpindleMt(spindleMtName,
            comment,
            getKnownConstantByName_inner(spindleHeadMtName),
            getKnownConstantByName_inner(spindleCollectorMtName));
  }

  /**
   * Creates a new spindle microtheory in the given spindle system.
   *
   * @param spindleMtName the name of the new spindle microtheory
   * @param comment the comment for the new spindle microtheory
   * @param spindleHeadMt the spindle head microtheory
   * @param spindleCollectorMt the spindle head microtheory
   *
   * @return the new spindle microtheory in the given spindle system
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycApiException if the Cyc server returns an error
   */
  @Override
  public CycConstantI createSpindleMt(String spindleMtName,
          String comment,
          Fort spindleHeadMt,
          Fort spindleCollectorMt)
          throws CycConnectionException, CycApiException {
    CycConstantI spindleMt = getKnownConstantByName_inner("SpindleMicrotheory");
    List genlMts = new ArrayList();
    genlMts.add(spindleHeadMt);

    CycConstantI mt = this.createMicrotheory(spindleMtName,
            comment,
            spindleMt,
            genlMts);
    assertGaf(universalVocabularyMt,
            genlMt,
            spindleCollectorMt,
            mt);

    return mt;
  }
  
  /**
   * Creates a new individual term.
   *
   * @param IndividualName the name of the new individual term
   * @param comment the comment for the individual
   * @param commentMt the microtheory in which the comment is asserted
   * @param isa the collection of which the new individual is an instance
   *
   * @return the new individual term
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycApiException if the Cyc server returns an error
   */
  @Override
  public Fort createIndividual(String IndividualName,
          String comment,
          String commentMt,
          String isa)
          throws CycConnectionException, CycApiException {
    return createIndividual(IndividualName,
            comment,
            getKnownConstantByName_inner(commentMt),
            getKnownConstantByName_inner(isa));
  }

  /**
   * Creates a new individual term.
   *
   * @param IndividualName the name of the new individual term
   * @param comment the comment for the individual
   * @param commentMt the microtheory in which the comment is asserted
   * @param isa the collection of which the new individual is an instance
   *
   * @return the new individual term
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycApiException if the Cyc server returns an error
   */
  @Override
  public Fort createIndividual(String IndividualName,
          String comment,
          DenotationalTerm commentMt,
          DenotationalTerm isa)
          throws CycConnectionException, CycApiException {
    Fort individual = findOrCreate_inner(IndividualName);
    assertComment(individual,
            comment,
            commentMt);
    assertIsa(individual,
            isa);

    return individual;
  }

  /**
   * Creates a new individual-denoting reifiable unary function term.
   *
   * @param unaryFunction the new collection
   * @param comment the comment for the unary function
   * @param commentMt the microtheory in which the comment is asserted
   * @param arg1Isa the kind of objects this unary function takes as its argument
   * @param resultIsa the kind of object represented by this reified term
   *
   * @return the new individual-denoting reifiable unary function term
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycApiException if the Cyc server returns an error
   */
  @Override
  public Fort createIndivDenotingUnaryFunction(String unaryFunction,
          String comment,
          String commentMt,
          String arg1Isa,
          String resultIsa)
          throws CycConnectionException, CycApiException {
    return createIndivDenotingUnaryFunction(findOrCreate_inner(
            unaryFunction),
            comment,
            getKnownConstantByName_inner(
            commentMt),
            getKnownConstantByName_inner(
            arg1Isa),
            getKnownConstantByName_inner(
            resultIsa));
  }

  /**
   * Creates a new individual-denoting reifiable unary function term.
   *
   * @param unaryFunction the new collection
   * @param comment the comment for the unary function
   * @param commentMt the microtheory in which the comment is asserted
   * @param arg1Isa the kind of objects this unary function takes as its argument
   * @param resultIsa the kind of object represented by this reified term
   *
   * @return the new individual-denoting reifiable unary function term
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycApiException if the Cyc server returns an error
   */
  @Override
  public Fort createIndivDenotingUnaryFunction(Fort unaryFunction,
          String comment,
          Fort commentMt,
          Fort arg1Isa,
          Fort resultIsa)
          throws CycConnectionException, CycApiException {
    assertComment(unaryFunction,
            comment,
            commentMt);


    // (#$isa unaryFunction #$UnaryFunction)
    assertIsa(unaryFunction,
            getKnownConstantByGuid_inner("bd58af89-9c29-11b1-9dad-c379636f7270"));


    // (#$isa unaryFunction #$ReifiableFunction)
    assertIsa(unaryFunction,
            getKnownConstantByGuid_inner("bd588002-9c29-11b1-9dad-c379636f7270"));


    // (#$isa unaryFunction #$IndividualDenotingFunction)
    assertIsa(unaryFunction,
            getKnownConstantByGuid_inner("bd58fad9-9c29-11b1-9dad-c379636f7270"));


    // (#$isa unaryFunction #$Function-Denotational)
    assertIsa(unaryFunction,
            getKnownConstantByGuid_inner("bd5c40b0-9c29-11b1-9dad-c379636f7270"));
    assertArgIsa(unaryFunction,
            1,
            arg1Isa);
    assertResultIsa(unaryFunction,
            resultIsa);

    return unaryFunction;
  }

  /**
   * Creates a new collection-denoting reifiable unary function term.
   *
   * @param unaryFunction the new collection
   * @param comment the comment for the unary function
   * @param commentMt the microtheory in which the comment is asserted
   * @param arg1Isa the isa type constraint for the argument
   * @param arg1GenlName the genls type constraint for the argument if it is a collection
   * @param resultIsa the isa object represented by this reified term
   * @param resultGenlName the genls object represented by this reified term
   *
   * @return the new collection-denoting reifiable unary function term
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycApiException if the Cyc server returns an error
   */
  @Override
  public Fort createCollectionDenotingUnaryFunction(String unaryFunction,
          String comment,
          String commentMt,
          String arg1Isa,
          String arg1GenlName,
          String resultIsa,
          String resultGenlName)
          throws CycConnectionException, CycApiException {
    Fort arg1Genl;

    if (arg1GenlName != null) {
      arg1Genl = getKnownConstantByName_inner(arg1GenlName);
    } else {
      arg1Genl = null;
    }

    Fort resultGenl;

    if (resultGenlName != null) {
      resultGenl = getKnownConstantByName_inner(resultGenlName);
    } else {
      resultGenl = null;
    }

    return createCollectionDenotingUnaryFunction(findOrCreate_inner(
            unaryFunction),
            comment,
            getKnownConstantByName_inner(
            commentMt),
            getKnownConstantByName_inner(
            arg1Isa),
            arg1Genl,
            getKnownConstantByName_inner(
            resultIsa),
            resultGenl);
  }

  /**
   * Creates a new collection-denoting reifiable unary function term.
   *
   * @param unaryFunction the new collection
   * @param comment the comment for the unary function
   * @param commentMt the microtheory in which the comment is asserted
   * @param arg1Isa the isa type constraint for the argument
   * @param arg1Genl the genls type constraint for the argument if it is a collection
   * @param resultIsa the isa object represented by this reified term
   * @param resultGenl the genls object represented by this reified term
   *
   * @return the new collection-denoting reifiable unary function term
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycApiException if the Cyc server returns an error
   */
  @Override
  public Fort createCollectionDenotingUnaryFunction(Fort unaryFunction,
          String comment,
          Fort commentMt,
          Fort arg1Isa,
          Fort arg1Genl,
          Fort resultIsa,
          Fort resultGenl)
          throws CycConnectionException, CycApiException {
    assertComment(unaryFunction,
            comment,
            commentMt);


    // (#$isa unaryFunction #$UnaryFunction)
    assertIsa(unaryFunction,
            getKnownConstantByGuid_inner("bd58af89-9c29-11b1-9dad-c379636f7270"));


    // (#$isa unaryFunction #$ReifiableFunction)
    assertIsa(unaryFunction,
            getKnownConstantByGuid_inner("bd588002-9c29-11b1-9dad-c379636f7270"));


    // (#$isa unaryFunction #$CollectionDenotingFunction)
    assertIsa(unaryFunction,
            getKnownConstantByGuid_inner("bd58806a-9c29-11b1-9dad-c379636f7270"));


    // (#$isa unaryFunction #$Function-Denotational)
    assertIsa(unaryFunction,
            getKnownConstantByGuid_inner("bd5c40b0-9c29-11b1-9dad-c379636f7270"));
    assertArgIsa(unaryFunction,
            1,
            arg1Isa);

    if (arg1Genl != null) {
      assertArg1Genl(unaryFunction,
              arg1Genl);
    }

    assertResultIsa(unaryFunction,
            resultIsa);

    if (resultGenl != null) {
      assertResultGenl(unaryFunction,
              resultGenl);
    }

    return unaryFunction;
  }

  /**
   * Creates a new collection-denoting reifiable binary function term.
   *
   * @param binaryFunction the new collection
   * @param comment the comment for the binary function
   * @param commentMt the microtheory in which the comment is asserted
   * @param arg1IsaName the collection of which the new binary function is an instance
   * @param arg2GenlsName the kind of objects this binary function takes as its first argument, or
   * null
   * @param arg2IsaName the kind of objects this binary function takes as its second argument, or
   * null
   * @param arg1GenlsName the general collections this binary function takes as its first argument,
   * or null
   * @param resultIsa the kind of object represented by this reified term
   *
   * @return the new collection-denoting reifiable binary function term
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycApiException if the Cyc server returns an error
   */
  @Override
  public Fort createCollectionDenotingBinaryFunction(String binaryFunction,
          String comment,
          String commentMt,
          String arg1IsaName,
          String arg2IsaName,
          String arg1GenlsName,
          String arg2GenlsName,
          String resultIsa)
          throws CycConnectionException, CycApiException {
    Fort arg1Isa = null;
    Fort arg2Isa = null;
    Fort arg1Genls = null;
    Fort arg2Genls = null;

    if (arg1IsaName != null) {
      arg1Isa = getKnownConstantByName_inner(arg1IsaName);
    }

    if (arg2IsaName != null) {
      arg1Isa = getKnownConstantByName_inner(arg2IsaName);
    }

    if (arg1GenlsName != null) {
      arg1Genls = getKnownConstantByName_inner(arg1GenlsName);
    }

    if (arg2GenlsName != null) {
      arg2Genls = getKnownConstantByName_inner(arg2GenlsName);
    }

    return createCollectionDenotingBinaryFunction(findOrCreate_inner(
            binaryFunction),
            comment,
            getKnownConstantByName_inner(
            commentMt),
            arg1Isa,
            arg2Isa,
            arg1Genls,
            arg2Genls,
            getKnownConstantByName_inner(
            resultIsa));
  }

  /**
   * Creates a new collection-denoting reifiable binary function term.
   *
   * @param binaryFunction the new collection
   * @param comment the comment for the binary function
   * @param commentMt the microtheory in which the comment is asserted
   * @param arg1Isa the kind of objects this binary function takes as its first argument, or null
   * @param arg2Isa the kind of objects this binary function takes as its first argument, or null
   * @param arg1Genls the general collections this binary function takes as its first argument, or
   * null
   * @param arg2Genls the general collections this binary function takes as its second argument, or
   * null
   * @param resultIsa the kind of object represented by this reified term
   *
   * @return the new collection-denoting reifiable binary function term
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycApiException if the Cyc server returns an error
   */
  @Override
  public Fort createCollectionDenotingBinaryFunction(Fort binaryFunction,
          String comment,
          Fort commentMt,
          Fort arg1Isa,
          Fort arg2Isa,
          Fort arg1Genls,
          Fort arg2Genls,
          Fort resultIsa)
          throws CycConnectionException, CycApiException {
    assertComment(binaryFunction,
            comment,
            commentMt);


    // (#$isa binaryFunction #$BinaryFunction)
    assertIsa(binaryFunction,
            getKnownConstantByGuid_inner("c0e7247c-9c29-11b1-9dad-c379636f7270"));


    // (#$isa binaryFunction #$ReifiableFunction)
    assertIsa(binaryFunction,
            getKnownConstantByGuid_inner("bd588002-9c29-11b1-9dad-c379636f7270"));


    // (#$isa binaryFunction #$CollectionDenotingFunction)
    assertIsa(binaryFunction,
            getKnownConstantByGuid_inner("bd58806a-9c29-11b1-9dad-c379636f7270"));


    // (#$isa binaryFunction #$Function-Denotational)
    assertIsa(binaryFunction,
            getKnownConstantByGuid_inner("bd5c40b0-9c29-11b1-9dad-c379636f7270"));

    if (arg1Isa != null) {
      assertArgIsa(binaryFunction,
              1,
              arg1Isa);
    }

    if (arg2Isa != null) {
      assertArgIsa(binaryFunction,
              2,
              arg2Isa);
    }

    if (arg1Genls != null) {
      assertArg1Genl(binaryFunction,
              arg1Genls);
    }

    if (arg2Genls != null) {
      assertArg2Genl(binaryFunction,
              arg2Genls);
    }

    assertResultIsa(binaryFunction,
            resultIsa);

    return binaryFunction;
  }
  
    /**
   * Ensures that the given term meets the given isa and genl wff constraints in the
   * UniversalVocabularyMt.
   *
   * @param cycFort the given term
   * @param isaConstraintName the given isa type constraint, or null
   * @param genlsConstraintName the given genls type constraint, or null
   *
   * @throws IOException if a communications error occurs
   * @throws UnknownHostException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  @Override
  public void ensureWffConstraints(String cycFort,
          String isaConstraintName,
          String genlsConstraintName)
          throws CycConnectionException, CycApiException {
    CycConstantI cycConstant = getCyc().getLookupTool().find(cycFort);
    CycConstantI isaConstraint = null;
    CycConstantI genlsConstraint = null;

    if (isaConstraintName != null) {
      isaConstraint = getCyc().getLookupTool().find(isaConstraintName);
    }

    if (genlsConstraintName != null) {
      genlsConstraint = getCyc().getLookupTool().find(genlsConstraintName);
    }

    ensureWffConstraints(cycConstant, isaConstraint, genlsConstraint);
  }

  /**
   * Ensures that the given term meets the given isa and genl wff constraints in the
   * UniversalVocabularyMt.
   *
   * @param cycFort the given term
   * @param isaConstraint the given isa type constraint, or null
   * @param genlsConstraint the given genls type constraint, or null
   *
   * @throws IOException if a communications error occurs
   * @throws UnknownHostException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  @Override
  public void ensureWffConstraints(Fort cycFort, Fort isaConstraint,
          Fort genlsConstraint)
          throws CycConnectionException, CycApiException {
    if ((isaConstraint != null)
            && (!getCyc().getInspectorTool().isa(cycFort, isaConstraint, universalVocabularyMt))) {
      assertIsa(cycFort, isaConstraint);
    }

    if ((genlsConstraint != null)
            && (!getCyc().getInspectorTool().isSpecOf(cycFort, genlsConstraint, universalVocabularyMt))) {
      assertGenls(cycFort, genlsConstraint);
    }
  }
  
  /**
   * Merge assertions of KILL-FORT onto KEEP-FORT and kill KILL-FORT.
   * 
   * @return 0 boolean ;; t if success, o/w nil
   * @return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.
   * @param KILL-FORT fort
   * @param KEEP-FORT fort
   * @note Assumes cyclist is ok.
   * @note The salient property of this function is that it never throws an error.
   * @owner jantos
   * @privacy done
   */
  @Override
  public synchronized boolean merge(Fort killFort, Fort keepFort)
          throws CycConnectionException, CycApiException {
    String command = "(ke-merge-now " + killFort.stringApiValue() + " " + keepFort.stringApiValue() + ")";
    Object[] response = {null, null};
    response = converse_inner(command);
    if (response[0].equals(Boolean.TRUE)) {
      if (response[1].equals(CycObjectFactory.nil)) {
        return false;
      } else {
        return true;
      }
    } else {
      throw new CycApiException("Failed to evaluate " + command + "\n  " + response);
    }
  }
  
  
  // Private
  
  /**
   * Asserts the given sentence with bookkeeping, and then places it on the transcript queue.
   *
   * @param sentence the given sentence for assertion
   * @param mt the microtheory in which the assertion is placed
   *
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  private void assertWithTranscriptAndBookkeepingInternal(CycObject sentence,
          CycObject mt)
          throws CycConnectionException, CycApiException {
    assertSentence(sentence.stringApiValue(), makeELMt_inner(mt), null, null, true, true);
  }
}