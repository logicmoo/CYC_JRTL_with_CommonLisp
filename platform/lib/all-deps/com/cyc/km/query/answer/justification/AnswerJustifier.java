package com.cyc.km.query.answer.justification;

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
import com.cyc.base.inference.InferenceIdentifier;
import com.cyc.baseclient.inference.CycBackedInferenceAnswer;
import com.cyc.baseclient.inference.DefaultInferenceIdentifier;
import com.cyc.baseclient.inference.InferenceAnswerIdentifier;
import com.cyc.inference.async.Ticket;
import com.cyc.inference.async.TicketManager;
import com.cyc.xml.query.ProofViewJustification;
import com.cyc.xml.query.ProofViewMarshaller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.UnknownHostException;

import javax.xml.bind.JAXBException;






//import org.opencyc.inference.CycBackedInferenceAnswer;
//import org.opencyc.inference.InferenceAnswerIdentifier;
//import org.opencyc.inference.InferenceIdentifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author nwinant
 */
public class AnswerJustifier {
  
  // Public
  
  /**
   * Get a justification for the specified answer.
   *
   * @param problemStoreId
   * @param inferenceId
   * @param answerId
   * @return XML
 * @throws CycConnectionException 
 * @throws CycApiException 
   * @throws UnknownHostException
   * @throws IOException
   */
  public String getJustification(final int problemStoreId, 
          final int inferenceId,
          final int answerId) throws CycApiException, CycConnectionException, IOException {
    try {
      final ProofViewJustification justification = new ProofViewJustification(
              new CycBackedInferenceAnswer(new InferenceAnswerIdentifier(
              new DefaultInferenceIdentifier(problemStoreId, inferenceId),
              answerId)));
      final OutputStream out = new ByteArrayOutputStream();
      new ProofViewMarshaller().marshal(justification.getProofView(), out);
      return out.toString();
    } catch (JAXBException ex) {
      throw new RuntimeException(ex);
    }
  }
  
  /**
   * Get a justification for the specified answer.
   *
   * @param ticket
   * @param answerId
   * @return XML
 * @throws CycConnectionException 
 * @throws CycApiException 
   * @throws UnknownHostException
   * @throws IOException
   */
  public String getJustification(final Ticket ticket,
          final int answerId) throws CycApiException, CycConnectionException, IOException {
    final InferenceIdentifier inferenceIdentifier = ticket.getInferenceIdentifier();
    return getJustification(
            inferenceIdentifier.getInferenceID(),
            inferenceIdentifier.getProblemStoreID(),
            answerId);
  }
  
  /**
   *
   * @return this answer justifier's ticket manager.
   */
  public TicketManager getTicketManager() {
    return TicketManager.get();
  }
  
  
  // Private
  
  
  // Internal
  
  private static final Logger LOGGER = LoggerFactory.getLogger(AnswerJustifier.class);
}
