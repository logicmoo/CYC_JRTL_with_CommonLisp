package com.cyc.inference.async;

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

import static com.cyc.baseclient.api.SubLAPIHelper.*;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;








//import org.opencyc.api.CycApiException;
//import org.opencyc.cycobject.CycList;
//import org.opencyc.export.ExportException;
//import org.opencyc.inference.InferenceIdentifier;
//import org.opencyc.inference.InferenceStatus;
//import org.opencyc.inference.InferenceSuspendReason;
//import org.opencyc.inference.InferenceWorker;
//import org.opencyc.inference.InferenceWorkerListener;
//import org.opencyc.util.TimeOutException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cyc.base.CycApiException;
import com.cyc.base.CycConnectionException;
import com.cyc.base.CycTimeOutException;
import com.cyc.base.cycobject.CycList;
import com.cyc.base.inference.InferenceIdentifier;
import com.cyc.base.inference.InferenceStatus;
import com.cyc.base.inference.InferenceSuspendReason;
import com.cyc.base.inference.InferenceWorker;
import com.cyc.base.inference.InferenceWorkerListener;
import com.cyc.baseclient.cycobject.CycArrayList;
import com.cyc.baseclient.export.ExportException;
import com.cyc.kb.Query;
import com.cyc.km.query.export.ResultsExporter;

import java.util.logging.Level;


/**
 *
 * @author nwinant
 */
public class AsyncResultProcessor {

  // Public
  /**
   *
   * @param worker
   * @param command
   * @param ticket
   * @throws com.cyc.base.CycConnectionException
   */
  public void begin(InferenceWorker worker, String command, final Ticket ticket) throws CycConnectionException {
    worker.addInferenceListener(getListener(command, ticket));
    worker.start();
  }

  /**
   *
   * @param query
   * @param ticket
   * @param exporter
   * @throws IOException
 * @throws CycConnectionException 
 * @throws CycApiException 
 * @throws CycTimeOutException 
   */
  public void begin(final Query query, final Ticket ticket, final ResultsExporter exporter)
          throws IOException, CycTimeOutException, CycApiException, CycConnectionException {
    query.addListener(getListener(query, ticket, exporter));
    query.start();
  }

  /**
   *
   * @param workers
   * @param functionName
   * @param ticket
   * @throws com.cyc.base.CycConnectionException
   */
  public void beginCompoundInference(final List<InferenceWorker> workers,
          final String functionName, final Ticket ticket) throws CycConnectionException {
    final Queue<InferenceWorker> workerQueue = new ArrayDeque<InferenceWorker>(
            workers);
    final List<InferenceIdentifier> inferenceIDs = new ArrayList<InferenceIdentifier>();
    launchNextInference(workerQueue, inferenceIDs, ticket, functionName);
  }

  // Protected
  /**
   *
   * @param command
   * @return the command
   */
  protected String processResult(String command) {
    return command;
  }

  // Private
  private void launchNextInference(final Queue<InferenceWorker> workerQueue,
          final List<InferenceIdentifier> inferenceIDs, final Ticket ticket,
          final String functionName) throws CycConnectionException {
    try {
      final InferenceWorker firstWorker = workerQueue.poll();
      firstWorker.addInferenceListener(getCompoundInferenceListener(workerQueue,
              inferenceIDs, ticket, functionName));
      firstWorker.start();
    } catch (CycTimeOutException ex) {
      LOGGER.warn("Caught exception launch compound query.", ex);
    } catch (CycApiException ex) {
      LOGGER.warn("Caught exception launch compound query.", ex);
    }
  }

  private InferenceWorkerListener getCompoundInferenceListener(
          final Queue<InferenceWorker> workerQueue,
          final List<InferenceIdentifier> inferenceIDs, final Ticket ticket,
          final String functionName) {
    return new InferenceWorkerListener() {
      @Override
      public void notifyInferenceCreated(InferenceWorker inferenceWorker) {
        LOGGER.debug(
                "Created inference. " + workerQueue.size() + " remaining on queue.");
      }

      @Override
      public void notifyInferenceStatusChanged(InferenceStatus oldStatus,
              InferenceStatus newStatus,
              InferenceSuspendReason suspendReason,
              InferenceWorker inferenceWorker) {
        noteInferenceStatusChanged(oldStatus, newStatus, suspendReason,
                inferenceWorker);
      }

      @Override
      public void notifyInferenceAnswersAvailable(
              InferenceWorker inferenceWorker, List newAnswers) {
        noteInferenceAnswersAvailable();
      }

      @Override
      public void notifyInferenceTerminated(InferenceWorker inferenceWorker,
              Exception e) {
        noteInferenceTerminated(inferenceWorker);
        inferenceIDs.add(inferenceWorker.getInferenceIdentifier());
        if (workerQueue.isEmpty()) {
          gatherResults();
        } else {
          try {
            launchNextInference(workerQueue, inferenceIDs, ticket, functionName);
          } catch (CycConnectionException ex) {
            java.util.logging.Logger.getLogger(AsyncResultProcessor.class.getName()).log(Level.SEVERE, null, ex);
          }
        }
      }

      private void gatherResults() {
        final CycList inferenceIDsCycObject = new CycArrayList();
        for (final InferenceIdentifier id : inferenceIDs) {
          inferenceIDsCycObject.add(CycArrayList.makeCycList(id.getProblemStoreID(),
                  id.getInferenceID()));
        }
        final String command = makeSubLStmt(functionName, inferenceIDsCycObject);
        String result = processResult(command);
        LOGGER.debug("Noting results: " + result);
        ticket.noteResult(result);
        LOGGER.debug("Results noted.");
      }
    };
  }

  private InferenceWorkerListener getListener(final String functionName,
          final Ticket ticket) {
    return new InferenceWorkerListener() {
      @Override
      public void notifyInferenceCreated(InferenceWorker inferenceWorker) {
        LOGGER.debug("Inference created...");
        ticket.noteInferenceIdentifier(inferenceWorker.getInferenceIdentifier());
      }

      @Override
      public void notifyInferenceStatusChanged(InferenceStatus oldStatus,
              InferenceStatus newStatus,
              InferenceSuspendReason suspendReason,
              InferenceWorker inferenceWorker) {
        noteInferenceStatusChanged(oldStatus, newStatus, suspendReason,
                inferenceWorker);
      }

      @Override
      public void notifyInferenceAnswersAvailable(
              InferenceWorker inferenceWorker, List newAnswers) {
        noteInferenceAnswersAvailable();
      }

      @Override
      public void notifyInferenceTerminated(InferenceWorker worker, Exception e) {
        noteInferenceTerminated(worker);
        final String command = makeSubLStmt(functionName,
                worker.getProblemStoreId(), worker.getInferenceId(),
                ticket.getQuestionNL());
        String result = processResult(command);
        LOGGER.debug("Noting results: " + result);
        ticket.noteResult(result);
        LOGGER.debug("Results noted.");
      }
    };
  }

  private void noteInferenceAnswersAvailable() {
    LOGGER.debug("Receiving answers...");
  }

  private void noteInferenceStatusChanged(InferenceStatus oldStatus,
          InferenceStatus newStatus, InferenceSuspendReason suspendReason,
          InferenceWorker inferenceWorker) {
    LOGGER.debug("Inference status changed from " + oldStatus + " to " + newStatus + "."
            + "  Reason: " + suspendReason + "."
            + "  Inference ID: " + inferenceWorker.getInferenceId()
            + ", problem store ID: " + inferenceWorker.getProblemStoreId());
  }

  private void noteInferenceTerminated(InferenceWorker worker) {
    LOGGER.debug("Inference terminated."
            + "  Inference ID: " + worker.getInferenceId()
            + ", problem store ID: " + worker.getProblemStoreId());
  }

  /**
   * @STUB Don't know what we should do if one of these exceptions gets thrown.
   */
  private static void handleInterruption(InterruptedException ex) {
    LOGGER.error("Process interrupted.", ex);
  }
  // Internal
  private static final Logger LOGGER = LoggerFactory.getLogger(
          AsyncResultProcessor.class);

  private InferenceWorkerListener getListener(final Query query,
          final Ticket ticket, final ResultsExporter exporter) {
    return new InferenceWorkerListener() {
      @Override
      public void notifyInferenceCreated(InferenceWorker inferenceWorker) {
        LOGGER.debug("Inference created...");
        ticket.noteInferenceIdentifier(inferenceWorker.getInferenceIdentifier());
      }

      @Override
      public void notifyInferenceStatusChanged(InferenceStatus oldStatus,
              InferenceStatus newStatus,
              InferenceSuspendReason suspendReason,
              InferenceWorker inferenceWorker) {
        noteInferenceStatusChanged(oldStatus, newStatus, suspendReason,
                inferenceWorker);
      }

      @Override
      public void notifyInferenceAnswersAvailable(
              InferenceWorker inferenceWorker, List newAnswers) {
        noteInferenceAnswersAvailable();
      }

      @Override
      public void notifyInferenceTerminated(InferenceWorker worker,
              Exception e) {
        noteInferenceTerminated(worker);
          String result = null;
		try {
			result = exporter.exportToString(query);
		} catch (ExportException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
          LOGGER.debug("Noting results: " + result);
          ticket.noteResult(result);
          LOGGER.debug("Results noted.");
      }
    };
  }
}
