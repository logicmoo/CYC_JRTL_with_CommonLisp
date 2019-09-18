package com.cyc.baseclient.inference;

import com.cyc.base.CycAccess;
import com.cyc.base.inference.InferenceWorker;
import com.cyc.base.CycConnectionException;
import com.cyc.baseclient.inference.params.DefaultInferenceParameters;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import com.cyc.base.CycApiException;
import com.cyc.baseclient.CycObjectFactory;
import com.cyc.baseclient.api.SubLAPIHelper;
import com.cyc.base.cycobject.DenotationalTerm;
import com.cyc.base.cycobject.FormulaSentence;
import com.cyc.base.cycobject.CycObject;
import com.cyc.baseclient.cycobject.CycSymbol;
import com.cyc.baseclient.cycobject.CycVariable;
import com.cyc.base.cycobject.ELMt;
import com.cyc.base.inference.InferenceParameters;

/**
 *
 * KBQueryFactory provides factory methods for inference workers where
 * the query information--the sentence, the ELMt and the inference parameters--
 * are backed by a KBQ term in the CYC knowledge base.
 *
 * @author rck
 * @date 2010-07-08
 * @version $Id: KBQueryFactory.java 150938 2014-05-02 21:39:12Z nwinant $
 */
public class KBQueryFactory {

  static private final KBQueryFactory INSTANCE = new KBQueryFactory();

  static public KBQueryFactory getInstance() {
    return INSTANCE;
  }
  //// SubL API entry points
  final static public CycSymbol KBQ_SENTENCE = CycObjectFactory.makeCycSymbol("KBQ-SENTENCE");
  final static public CycSymbol KBQ_ELMT = CycObjectFactory.makeCycSymbol("KBQ-MT");
  final static public CycSymbol KBQ_PROPERTIES = CycObjectFactory.makeCycSymbol("KBQ-QUERY-PROPERTIES");

  /**
   *
   * Create a new instance of InferenceWorker, either synchronous or asynchronous,
   * that will run the query in the ELMt and with the parameters specified by the
   * CYC query in the Cyc KB and uniquely denoted by the KBQ parameter.
   *
   * @param access the CycAccess object that specifies the CYC server that hosts the
  reified query and that will perform the inference (i.e. to which the inference worker
  is bound)
   * @param kbq the Cyc term that specifies the query
   * @param timeoutMsecs the timeout parameter for the inference worker in milli-seconds
   * @param sync if <tt>true</tt>, returns an instance of DefaultInferenceWorkerSynch; otherwise
   *  an instance of DefaultInferenceWorker
   * @return an instance of DefaultInferenceWorker, either synchronized or not, depending
   *  on the value of <tt>sync</tt>
   * @throws IOException if the converse operation throws an IOException
   * @throws CycApiException if the converse operation throws a CycApiException
   */
  public InferenceWorker getInferenceWorker(CycAccess access, DenotationalTerm kbq,
          long timeoutMsecs, boolean sync) throws CycApiException, CycConnectionException {
    return getInferenceWorkerWithSubstitutions(access, kbq, NO_SUBSTITUTIONS, timeoutMsecs, sync);
  }

  /**
   *
   * Create a new instance of InferenceWorker, either synchronous or asynchronous,
   * that will run the query in the ELMt and with the parameters specified by the
   * CYC query in the Cyc KB and uniquely denoted by the KBQ parameter.
   *
   * @param access the CycAccess object that specifies the CYC server that hosts the
  reified query and that will perform the inference (i.e. to which the inference worker
  is bound)
   * @param kbq the Cyc term that specifies the query
   * @param timeoutMsecs the timeout parameter for the inference worker in milli-seconds
   * @param sync if <tt>true</tt>, returns an instance of DefaultInferenceWorkerSynch; otherwise
   *  an instance of DefaultInferenceWorker
   * @return an instance of DefaultInferenceWorker, either synchronized or not, depending
   *  on the value of <tt>sync</tt>
   * @throws IOException if the converse operation throws an IOException
   * @throws CycApiException if the converse operation throws a CycApiException
   */
  static public InferenceWorker prepareKBQuery(CycAccess access, DenotationalTerm kbq, long timeoutMsecs, boolean sync) throws
          CycConnectionException, CycApiException {
    return prepareKBQueryTemplate(access, kbq, NO_SUBSTITUTIONS, timeoutMsecs, sync);
  }
  final static private Map<CycVariable, Object> NO_SUBSTITUTIONS = Collections.emptyMap();

  /**
   * Create a new instance of InferenceWorker, either synchronous or asynchronous,
   * that will run the query in the ELMt and with the parameters specified by the
   * CYC query in the Cyc KB and uniquely denoted by the KBQ parameter.
   * After the query sentence has been loaded, apply the substitutions spelled out
   * in the substitution map, equating variables with bindings.
   *
   * @param access the CycAccess object that specifies the CYC server that hosts the
  reified query and that will perform the inference (i.e. to which the inference worker
  is bound)
   * @param kbq the Cyc term that specifies the query
   * @param substitutions a mapping from CycVariable to Objects; each mapping is converted
   *  into an equalSymbols clause and conjoined to the query sentence
   * @param timeoutMsecs the timeout parameter for the inference worker in milli-seconds
   * @param sync if <tt>true</tt>, returns an instance of DefaultInferenceWorkerSynch; otherwise
   *  an instance of DefaultInferenceWorker
   * @return an instance of DefaultInferenceWorker, either synchronized or not, depending
   *  on the value of <tt>sync</tt>
   * @throws IOException if the converse operation throws an IOException
   * @throws CycApiException if the converse operation throws a CycApiException
   */
  public InferenceWorker getInferenceWorkerWithSubstitutions(CycAccess access,
          DenotationalTerm kbq, Map<CycVariable, Object> substitutions, long timeoutMsecs,
          boolean sync) throws CycApiException, CycConnectionException {
    final FormulaSentence sentence = loadKBQSentence(access, kbq);
    final ELMt elmt = loadKBQELMt(access, kbq);
    final InferenceParameters properties = loadKBQProperties(access, kbq);
    if (substitutions != null) {
      sentence.applySubstitutionsDestructive(substitutions);
    }
    return (sync) ? new DefaultInferenceWorkerSynch(sentence, elmt, properties, access, timeoutMsecs)
            : new DefaultInferenceWorker(sentence, elmt, properties, access, timeoutMsecs);
  }

  /**
   * Create a new instance of InferenceWorker, either synchronous or asynchronous,
   * that will run the query in the ELMt and with the parameters specified by the
   * CYC query in the Cyc KB and uniquely denoted by the KBQ parameter.
   * After the query sentence has been loaded, apply the substitutions spelled out
   * in the substitution map, equating variables with bindings.
   *
   * @param access the CycAccess object that specifies the CYC server that hosts the
  reified query and that will perform the inference (i.e. to which the inference worker
  is bound)
   * @param kbq the Cyc term that specifies the query
   * @param substitutions a mapping from CycVariable to Objects; each mapping is converted
   *  into an equalSymbols clause and conjoined to the query sentence
   * @param timeoutMsecs the timeout parameter for the inference worker in milli-seconds
   * @param sync if <tt>true</tt>, returns an instance of DefaultInferenceWorkerSynch; otherwise
   *  an instance of DefaultInferenceWorker
   * @return an instance of DefaultInferenceWorker, either synchronized or not, depending
   *  on the value of <tt>sync</tt>
   * @throws IOException if the converse operation throws an IOException
   * @throws CycApiException if the converse operation throws a CycApiException
   */
  static public InferenceWorker prepareKBQueryTemplate(CycAccess access, DenotationalTerm kbq,
          Map<CycVariable, Object> substitutions, long timeoutMsecs, boolean sync)
          throws CycConnectionException, CycApiException {
    return getInstance().getInferenceWorkerWithSubstitutions(access, kbq, substitutions, timeoutMsecs, sync);
  }

  /**
   * Similar to <code>getInferenceWorkerWithSubstitutions</code>, but performs a tree substitution on the query sentence.
   * 
   * @see KBQueryFactory#prepareKBQueryTemplate(com.cyc.baseclient.api.CycAccess, com.cyc.baseclient.cycobject.CycDenotationalTerm, java.util.Map, long, boolean) 
   * 
   * 
   * 
   * @param access the CycAccess object that specifies the CYC server that hosts the
  reified query and that will perform the inference (i.e. to which the inference worker
  is bound)
   * @param kbq the Cyc term that specifies the query
   * @param substitutions a mapping from CycObject to Objects
   * @param timeoutMsecs the timeout parameter for the inference worker in milli-seconds
   * @param sync if <tt>true</tt>, returns an instance of DefaultInferenceWorkerSynch; otherwise
   *  an instance of DefaultInferenceWorker
   * @return an instance of DefaultInferenceWorker, either synchronized or not, depending
   *  on the value of <tt>sync</tt>
   * @throws IOException if the converse operation throws an IOException
   * @throws CycApiException if the converse operation throws a CycApiException
   */
  public InferenceWorker getInferenceWorkerWithTreeSubstitutions(CycAccess access,
          DenotationalTerm kbq, Map<CycObject, Object> substitutions, long timeoutMsecs,
          boolean sync) throws CycApiException, CycConnectionException {
    final FormulaSentence sentence = loadKBQSentence(access, kbq);
    final ELMt elmt = loadKBQELMt(access, kbq);
    final InferenceParameters properties = loadKBQProperties(access, kbq);
    FormulaSentence subsSentence = sentence.treeSubstitute(access, substitutions);
    return (sync) ? new DefaultInferenceWorkerSynch(subsSentence, elmt, properties, access, timeoutMsecs)
            : new DefaultInferenceWorker(subsSentence, elmt, properties, access, timeoutMsecs);
  }

  /**
   * Similar to <code>prepareKBQueryTemplate</code>, but performs a tree substitution on the query sentence.
   * 
   * @see KBQueryFactory#prepareKBQueryTemplate(com.cyc.baseclient.api.CycAccess, com.cyc.baseclient.cycobject.CycDenotationalTerm, java.util.Map, long, boolean) 
   * 
   * 
   * 
   * @param access the CycAccess object that specifies the CYC server that hosts the
  reified query and that will perform the inference (i.e. to which the inference worker
  is bound)
   * @param kbq the Cyc term that specifies the query
   * @param substitutions a mapping from CycObject to Objects
   * @param timeoutMsecs the timeout parameter for the inference worker in milli-seconds
   * @param sync if <tt>true</tt>, returns an instance of DefaultInferenceWorkerSynch; otherwise
   *  an instance of DefaultInferenceWorker
   * @return an instance of DefaultInferenceWorker, either synchronized or not, depending
   *  on the value of <tt>sync</tt>
   * @throws IOException if the converse operation throws an IOException
   * @throws CycApiException if the converse operation throws a CycApiException
   */
  static public InferenceWorker prepareKBQueryTreeTemplate(CycAccess access, DenotationalTerm kbq,
          Map<CycObject, Object> substitutions, long timeoutMsecs, boolean sync)
          throws CycConnectionException, CycApiException {
    return getInstance().getInferenceWorkerWithTreeSubstitutions(access, kbq, substitutions, timeoutMsecs, sync);
  }

  protected FormulaSentence loadKBQSentence(CycAccess access, DenotationalTerm kbq)
          throws CycApiException, CycConnectionException {
    try {
      final String command = SubLAPIHelper.makeSubLStmt(KBQ_SENTENCE, kbq);
      return access.converse().converseSentence(command);
    } catch (CycApiException xcpt) {
      throw new CycApiException("Could not load query sentence for KBQ " + kbq.cyclify(), xcpt);
    }
  }

  protected ELMt loadKBQELMt(CycAccess access, DenotationalTerm kbq)
          throws CycApiException, CycConnectionException {
    try {
      final String command = SubLAPIHelper.makeSubLStmt(KBQ_ELMT, kbq);
      return access.getObjectTool().makeELMt(access.converse().converseCycObject(command));
    } catch (CycApiException xcpt) {
      throw new CycApiException("Could not load query MT for KBQ " + kbq.cyclify(), xcpt);
    }
  }

  protected InferenceParameters loadKBQProperties(CycAccess access, DenotationalTerm kbq)
          throws CycApiException, CycConnectionException {
    try {
      InferenceParameters properties = new DefaultInferenceParameters(access);
      final String command = SubLAPIHelper.makeSubLStmt(KBQ_PROPERTIES, kbq);
      properties.updateFromPlist(access.converse().converseList(command));
      return properties;
    } catch (CycApiException xcpt) {
      throw new CycApiException("Could not load query inference properties for KBQ " + kbq.cyclify(), xcpt);
    }
  }
}
