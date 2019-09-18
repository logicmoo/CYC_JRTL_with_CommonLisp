package com.cyc.kb;

import com.cyc.kb.exception.KBApiException;
import org.opencyc.api.CycAccess;
import org.opencyc.cycobject.CycConstant;
import org.opencyc.cycobject.CycFort;
import org.opencyc.cycobject.Guid;

/**
 * A convenience class for frequently accessed Cyc constants.  It should be rare to use this 
 * class in application making use of the KB API.
 * @author Vijay Raj
 */
public class Constants {

  private static Constants instance;
  private CycAccess cyc;

  private final CycConstant RETAIN_TERM = new CycConstant("retainTerm", new Guid("c0a6d5f5-9c29-11b1-9dad-c379636f7270"));
  private final KBCollection DATA_MT = new KBCollection(new CycConstant("DataMicrotheory", new Guid("be5275a8-9c29-11b1-9dad-c379636f7270")));
  private final Context BASE_KB_CTX = new Context(CycAccess.baseKB);
  private final Context UV_MT_CTX = new Context(CycAccess.universalVocabularyMt);
  private final Context INFERENCE_PSC_CTX = new Context(CycAccess.inferencePSC);
  private final Context EVERYTHING_PSC_CTX = new Context(CycAccess.everythingPSC);
  
  private Constants() throws KBApiException {
    super();
    cyc = CycAccess.getCurrent();
  }

  /**
   * This is not part of the KB API
   * @return
   * @throws KBApiException 
   */
  private static Constants getInstance() throws KBApiException {
    if (instance == null) {
      instance = new Constants();
    }
    return instance;
  }

  public static KBCollection dataMt() throws KBApiException {
    return getInstance().DATA_MT;
  }

  protected static CycConstant retainTerm() throws KBApiException {
      return getInstance().RETAIN_TERM;
  }

  public static Context baseKbMt() throws KBApiException {
      return getInstance().BASE_KB_CTX;
  }
  
  public static Context everythingPSCMt() throws KBApiException {
      return getInstance().EVERYTHING_PSC_CTX;
  }

  public static Context inferencePSCMt() throws KBApiException {
      return getInstance().INFERENCE_PSC_CTX;
  }

  public static Context uvMt() throws KBApiException {
    return getInstance().UV_MT_CTX;
  }

}
