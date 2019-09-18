package com.cyc.baseclient.kbtool;

import com.cyc.base.CycAccess;
import com.cyc.baseclient.AbstractKBTool;
import com.cyc.base.CycApiException;
import com.cyc.base.CycConnectionException;
import com.cyc.base.cycobject.Fort;
import com.cyc.base.cycobject.CycList;
import static com.cyc.baseclient.api.SubLAPIHelper.makeSubLStmt;

/**
 * @deprecated Will either by moved to the KnowledgeManagement API, or deleted.
 * @author nwinant
 */
@Deprecated
public class CycRKFTool extends AbstractKBTool {
  
  public CycRKFTool(CycAccess client) {
    super(client);
  }
  
  public CycRKFTool() {
    super();
  }
  
  
  // Public
  
  /**
   * Returns a list of parsing expressions, each consisting of a parsing span expression, and a
   * list of parsed terms.
   * <pre>
   * (RKF-PHRASE-READER "penguins" #$RKFEnglishLexicalMicrotheoryPSC #$InferencePSC)
   * ==>
   * (((0) (#$Penguin #$PittsburghPenguins)))
   * </pre>
   *
   * @param text the phrase to be parsed
   * @param parsingMt the microtheory in which lexical info is asked
   * @param domainMt the microtherory in which the info about candidate terms is asked
   *
   * @return a parsing expression consisting of a parsing span expression, and a list of parsed
   * terms
   *
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  public CycList rkfPhraseReader(String text, String parsingMt, String domainMt) 
          throws CycConnectionException, CycApiException {
        return rkfPhraseReader(text,
            getKnownConstantByName_inner(parsingMt),
            getKnownConstantByName_inner(domainMt));
  }

  /**
   * Returns a list of parsing expressions, each consisting of a parsing span expression, and a
   * list of parsed terms.
   * <pre>
   * (RKF-PHRASE-READER "penguins" #$RKFEnglishLexicalMicrotheoryPSC #$InferencePSC)
   * ==>
   * (((0) (#$Penguin #$PittsburghPenguins)))
   * </pre>
   *
   * @param text the phrase to be parsed
   * @param parsingMt the microtheory in which lexical info is asked
   * @param domainMt the microtherory in which the info about candidate terms is asked
   *
   * @return a parsing expression consisting of a parsing span expression, and a list of parsed
   * terms
   *
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  public CycList rkfPhraseReader(String text, Fort parsingMt, Fort domainMt) throws CycConnectionException, CycApiException {
        String command = makeSubLStmt("rkf-phrase-reader", text, parsingMt, domainMt);
    return getConverse().converseList(command);
  }
}
