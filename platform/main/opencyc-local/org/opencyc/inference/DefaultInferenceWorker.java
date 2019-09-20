package org.opencyc.inference;

import org.opencyc.parser.CycLParserUtil;
import org.opencyc.inference.params.DefaultInferenceParameters;
import org.opencyc.api.CycObjectFactory;
import java.util.Iterator;
import java.util.Collection;
import org.opencyc.api.SubLWorkerEvent;
import org.opencyc.api.SubLWorkerListener;
import java.util.EventListener;
import org.opencyc.api.CycApiException;
import org.opencyc.util.TimeOutException;
import java.io.IOException;
import org.opencyc.api.SubLWorkerSynch;
import org.opencyc.api.DefaultSubLWorkerSynch;
import org.opencyc.cycobject.CycObject;
import java.util.Collections;
import java.util.ArrayList;
import org.opencyc.cycobject.CycFormulaSentence;
import org.opencyc.cycobject.CycList;
import org.opencyc.api.CycConnection;
import org.opencyc.api.CycAccess;
import org.opencyc.inference.params.InferenceParameters;
import org.opencyc.cycobject.ELMt;
import java.util.Map;
import org.opencyc.cycobject.CycSymbol;
import javax.swing.event.EventListenerList;
import java.util.List;
import org.opencyc.api.DefaultSubLWorker;

public class DefaultInferenceWorker extends DefaultSubLWorker implements InferenceWorker {
	private volatile int problemStoreId;
	private volatile int inferenceId;
	private volatile InferenceStatus status;
	private List answers;
	private final EventListenerList inferenceListeners;
	private static Class inferenceListenerClass;
	private volatile InferenceSuspendReason suspendReason;
	protected CycSymbol answerProcessingFunction;
	private static Map DEFAULT_NL_GENERATION_PROPERTIES;

	public DefaultInferenceWorker(final String query, final ELMt mt, final InferenceParameters queryProperties, final CycAccess access, final long timeoutMsecs) {
		this(makeCycLSentence(query, access), mt, queryProperties, access, timeoutMsecs, CycConnection.NORMAL_PRIORITY);
	}

	public DefaultInferenceWorker(final CycList query, final ELMt mt, final InferenceParameters queryProperties, final CycAccess access, final long timeoutMsecs) {
		this(query, mt, queryProperties, access, timeoutMsecs, CycConnection.NORMAL_PRIORITY);
	}

	public DefaultInferenceWorker(final CycFormulaSentence query, final ELMt mt, final InferenceParameters queryProperties, final CycAccess access, final long timeoutMsecs) {
		this(query.getArgs(), mt, queryProperties, access, timeoutMsecs);
	}

	public DefaultInferenceWorker(final String query, final ELMt mt, final InferenceParameters queryProperties, final CycAccess access, final long timeoutMsecs, final Integer priority) {
		this(makeCycLSentence(query, access), mt, queryProperties, DefaultInferenceWorker.DEFAULT_NL_GENERATION_PROPERTIES, null, false, access, timeoutMsecs, priority);
	}

	public DefaultInferenceWorker(final CycList query, final ELMt mt, final InferenceParameters queryProperties, final CycAccess access, final long timeoutMsecs, final Integer priority) {
		super(access.makeCycList(createInferenceCommand(query, mt, queryProperties, DefaultInferenceWorker.DEFAULT_NL_GENERATION_PROPERTIES, null, false, access)), access, true, timeoutMsecs, priority);
		this.status = InferenceStatus.NOT_STARTED;
		this.answers = Collections.synchronizedList(new ArrayList<Object>());
		this.inferenceListeners = new EventListenerList();
		this.suspendReason = null;
		this.init();
	}

	public DefaultInferenceWorker(final CycFormulaSentence query, final ELMt mt, final InferenceParameters queryProperties, final CycAccess access, final long timeoutMsecs, final Integer priority) {
		super(access.makeCycList(createInferenceCommandInternal((CycObject) query, mt, queryProperties, DefaultInferenceWorker.DEFAULT_NL_GENERATION_PROPERTIES, null, false, access)), access, true, timeoutMsecs, priority);
		this.status = InferenceStatus.NOT_STARTED;
		this.answers = Collections.synchronizedList(new ArrayList<Object>());
		this.inferenceListeners = new EventListenerList();
		this.suspendReason = null;
		this.init();
	}

	public DefaultInferenceWorker(final String query, final ELMt mt, final InferenceParameters queryProperties, final Map nlGenerationProperties, final CycSymbol answerProcessingFunction, final boolean optimizeVariables, final CycAccess access, final long timeoutMsecs) {
		this(makeCycLSentence(query, access), mt, queryProperties, nlGenerationProperties, answerProcessingFunction, optimizeVariables, access, timeoutMsecs, CycConnection.NORMAL_PRIORITY);
	}

	public DefaultInferenceWorker(final CycList query, final ELMt mt, final InferenceParameters queryProperties, final Map nlGenerationProperties, final CycSymbol answerProcessingFunction, final boolean optimizeVariables, final CycAccess access, final long timeoutMsecs) {
		this(query, mt, queryProperties, nlGenerationProperties, answerProcessingFunction, optimizeVariables, access, timeoutMsecs, CycConnection.NORMAL_PRIORITY);
	}

	public DefaultInferenceWorker(final CycFormulaSentence query, final ELMt mt, final InferenceParameters queryProperties, final Map nlGenerationProperties, final CycSymbol answerProcessingFunction, final boolean optimizeVariables, final CycAccess access, final long timeoutMsecs) {
		this(query.getArgs(), mt, queryProperties, nlGenerationProperties, answerProcessingFunction, optimizeVariables, access, timeoutMsecs);
	}

	public DefaultInferenceWorker(final CycList query, final ELMt mt, final InferenceParameters queryProperties, final Map nlGenerationProperties, final CycSymbol answerProcessingFunction, final boolean optimizeVariables, final CycAccess access, final long timeoutMsecs, final Integer priority) {
		super(access.makeCycList(createInferenceCommand(query, mt, queryProperties, nlGenerationProperties, answerProcessingFunction, optimizeVariables, access)), access, true, timeoutMsecs, priority);
		this.status = InferenceStatus.NOT_STARTED;
		this.answers = Collections.synchronizedList(new ArrayList<Object>());
		this.inferenceListeners = new EventListenerList();
		this.suspendReason = null;
		this.answerProcessingFunction = answerProcessingFunction;
		this.init();
	}

	public DefaultInferenceWorker(final CycFormulaSentence query, final ELMt mt, final InferenceParameters queryProperties, final Map nlGenerationProperties, final CycSymbol answerProcessingFunction, final boolean optimizeVariables, final CycAccess access, final long timeoutMsecs, final Integer priority) {
		super(access.makeCycList(createInferenceCommandInternal((CycObject) query, mt, queryProperties, nlGenerationProperties, answerProcessingFunction, optimizeVariables, access)), access, true, timeoutMsecs, priority);
		this.status = InferenceStatus.NOT_STARTED;
		this.answers = Collections.synchronizedList(new ArrayList<Object>());
		this.inferenceListeners = new EventListenerList();
		this.suspendReason = null;
		this.answerProcessingFunction = answerProcessingFunction;
		this.init();
	}

	public void releaseInferenceResources(final long timeoutMsecs) throws IOException, TimeOutException, CycApiException {
		this.abort();
		final SubLWorkerSynch subLWorker = (SubLWorkerSynch) new DefaultSubLWorkerSynch("(destroy-problem-store (find-problem-store-by-id " + this.getProblemStoreId() + "))", this.getCycServer(), timeoutMsecs);
		subLWorker.getWork();
	}

	public static void releaseAllInferenceResourcesForClient(final CycAccess cycAccess, final long timeoutMsecs) throws IOException, TimeOutException, CycApiException {
		final SubLWorkerSynch subLWorker = (SubLWorkerSynch) new DefaultSubLWorkerSynch("(open-cyc-release-inference-resources-for-client)", cycAccess, timeoutMsecs);
		subLWorker.getWork();
	}

	public Object[] getInferenceListeners() {
		synchronized (this.inferenceListeners) {
			return this.inferenceListeners.getListeners((Class<EventListener>) DefaultInferenceWorker.inferenceListenerClass);
		}
	}

	public void addInferenceListener(final InferenceWorkerListener listener) {
		synchronized (this.inferenceListeners) {
			this.inferenceListeners.add(DefaultInferenceWorker.inferenceListenerClass, listener);
		}
	}

	public void removeInferenceListener(final InferenceWorkerListener listener) {
		synchronized (this.inferenceListeners) {
			this.inferenceListeners.remove(DefaultInferenceWorker.inferenceListenerClass, listener);
		}
	}

	public void removeAllInferenceListeners() {
		synchronized (this.inferenceListeners) {
			final Object[] listenerArray = this.inferenceListeners.getListenerList();
			for (int i = 0, size = listenerArray.length; i < size; i += 2) {
				this.inferenceListeners.remove((Class<EventListener>) listenerArray[i], (EventListener) listenerArray[i + 1]);
			}
		}
	}

	public void interruptInference() {
		this.interruptInference(null);
	}

	public void interruptInference(final int patience) {
		this.interruptInference(new Integer(patience));
	}

	protected void interruptInference(final Integer patience) {
		final String command = this.createInferenceInterruptCommand(patience);
		final DefaultSubLWorker newWorker = new DefaultSubLWorker(command, this.getCycServer(), true, 0L);
		final SubLWorkerListener listener = (SubLWorkerListener) new SubLWorkerListener() {
			public void notifySubLWorkerStarted(final SubLWorkerEvent event) {
			}

			public void notifySubLWorkerDataAvailable(final SubLWorkerEvent event) {
			}

			public void notifySubLWorkerTerminated(final SubLWorkerEvent event) {
			}
		};
		newWorker.addListener(listener);
		try {
			newWorker.start();
		} catch (IOException ioe) {
			throw new RuntimeException("Failed to continue inference (IOException).");
		}
	}

	public void continueInference(final InferenceParameters queryProperties) {
		final String command = this.createInferenceContinuationCommand(queryProperties);
		final DefaultSubLWorker newWorker = new DefaultSubLWorker(command, this.getCycServer(), true, this.getTimeoutMsecs());
		newWorker.addListener((SubLWorkerListener) new SubLWorkerListener() {
			public void notifySubLWorkerStarted(final SubLWorkerEvent event) {
				DefaultInferenceWorker.this.doSubLWorkerStarted(event);
			}

			public void notifySubLWorkerDataAvailable(final SubLWorkerEvent event) {
				DefaultInferenceWorker.this.doSubLWorkerDataAvailable(event);
			}

			public void notifySubLWorkerTerminated(final SubLWorkerEvent event) {
				DefaultInferenceWorker.this.doSubLWorkerTerminated(event);
			}
		});
		try {
			newWorker.start();
		} catch (IOException ioe) {
			throw new RuntimeException("Failed to continue inference (IOException).");
		}
	}

	public void abort() throws IOException {
		if (this.suspendReason == InferenceSuspendReason.INTERRUPT) {
			this.suspendReason = InferenceSuspendReason.ABORTED;
		}
		super.abort();
	}

	public Object getAnswerAt(final int index) {
		return this.answers.get(index);
	}

	public int getAnswersCount() {
		return this.answers.size();
	}

	public List getAnswers() {
		synchronized (this.answers) {
			return (List) new CycList((Collection) this.answers);
		}
	}

	public List getAnswers(final int startIndex, final int endIndex) {
		return new ArrayList(this.answers.subList(startIndex, endIndex));
	}

	public int getInferenceId() {
		return this.inferenceId;
	}

	public InferenceIdentifier getInferenceIdentifier() {
		return new InferenceIdentifier(this.getProblemStoreId(), this.getInferenceId(), this.getCycServer());
	}

	public InferenceStatus getInferenceStatus() {
		return this.status;
	}

	public int getProblemStoreId() {
		return this.problemStoreId;
	}

	public String toString() {
		return this.toString(2);
	}

	public String toString(final int indentLength) {
		final String newline = System.getProperty("line.separator");
		final StringBuffer nlBuff = new StringBuffer();
		nlBuff.append(newline);
		for (int i = 1; i < indentLength; ++i) {
			nlBuff.append(" ");
		}
		final String newlinePlusIndent = nlBuff.toString();
		nlBuff.append(super.toString(indentLength));
		nlBuff.append("Inference id: ").append(this.inferenceId).append(newlinePlusIndent);
		nlBuff.append("ProblemStore id: ").append(this.problemStoreId).append(newlinePlusIndent);
		nlBuff.append("Status: ").append(this.status).append(newlinePlusIndent);
		if (this.status == InferenceStatus.SUSPENDED) {
			nlBuff.append("Suspend reason: ").append(this.suspendReason).append(newlinePlusIndent);
		}
		nlBuff.append(this.getAnswersCount()).append(" answers").append(newlinePlusIndent);
		final int maxAnswersToShow = 10;
		if (this.getAnswersCount() > 10) {
			nlBuff.append("First ").append(10).append(": ").append(newlinePlusIndent);
			for (int j = 0; j < 10; ++j) {
				nlBuff.append(this.answers.get(j)).append(newlinePlusIndent);
			}
		} else {
			final Iterator k = this.answers.iterator();
			while (k.hasNext()) {
				nlBuff.append(k.next()).append(newlinePlusIndent);
			}
		}
		return nlBuff.toString();
	}

	public InferenceSuspendReason getSuspendReason() {
		return this.suspendReason;
	}

	private void fireInferenceStatusChanged(final InferenceStatus oldStatus) throws RuntimeException {
		final Object[] curListeners = this.getInferenceListeners();
		final List<Exception> errors = new ArrayList<Exception>();
		for (int i = curListeners.length - 1; i >= 0; --i) {
			try {
				((InferenceWorkerListener) curListeners[i]).notifyInferenceStatusChanged(oldStatus, this.status, this.suspendReason, (InferenceWorker) this);
			} catch (Exception e) {
				errors.add(e);
			}
		}
		if (errors.size() > 0) {
			throw new RuntimeException(errors.get(0));
		}
	}

	private void init() {
		this.addListener((SubLWorkerListener) new SubLWorkerListener() {
			public void notifySubLWorkerStarted(final SubLWorkerEvent event) {
				DefaultInferenceWorker.this.doSubLWorkerStarted(event);
			}

			public void notifySubLWorkerDataAvailable(final SubLWorkerEvent event) {
				DefaultInferenceWorker.this.doSubLWorkerDataAvailable(event);
			}

			public void notifySubLWorkerTerminated(final SubLWorkerEvent event) {
				DefaultInferenceWorker.this.doSubLWorkerTerminated(event);
			}
		});
	}

	private void doSubLWorkerStarted(final SubLWorkerEvent event) {
		final InferenceStatus oldStatus = this.status;
		this.status = InferenceStatus.STARTED;
		final Object[] curListeners = this.getInferenceListeners();
		final List<Exception> errors = new ArrayList<Exception>();
		for (int i = curListeners.length - 1; i >= 0; --i) {
			try {
				((InferenceWorkerListener) curListeners[i]).notifyInferenceStatusChanged(oldStatus, this.status, (InferenceSuspendReason) null, (InferenceWorker) this);
			} catch (Exception e) {
				errors.add(e);
			}
		}
		if (errors.size() > 0) {
			throw new RuntimeException(errors.get(0));
		}
	}

	private void doSubLWorkerDataAvailable(final SubLWorkerEvent event) {
		final Object obj = event.getWork();
		if (obj == null || !(obj instanceof CycList)) {
			if (CycObjectFactory.nil.equals(obj)) {
				return;
			}
			throw new RuntimeException("Got invalid result from inference: " + obj);
		} else {
			final CycList data = (CycList) obj;
			if (data.size() < 2) {
				throw new RuntimeException("Got wrong number of arguments from inference result: " + data);
			}
			final Object obj2 = data.get(0);
			if (obj2 == null || !(obj2 instanceof CycSymbol)) {
				throw new RuntimeException("Got bad result keyword from inference result: " + obj2);
			}
			final CycSymbol keyword = (CycSymbol) obj2;
			final String keywordName = keyword.toCanonicalString();
			if (keywordName.equals(":INFERENCE-START")) {
				this.handleInferenceInitializationResult(data);
			} else if (keywordName.equals(":INFERENCE-ANSWER")) {
				this.handleInferenceAnswerResult(data);
			} else if (keywordName.equals(":INFERENCE-STATUS")) {
				this.handleInferenceStatusChangedResult(data);
			}
		}
	}

	private void doSubLWorkerTerminated(final SubLWorkerEvent event) {
		final Object[] curListeners = this.getInferenceListeners();
		final List<Exception> errors = new ArrayList<Exception>();
		for (int i = curListeners.length - 1; i >= 0; --i) {
			try {
				((InferenceWorkerListener) curListeners[i]).notifyInferenceTerminated((InferenceWorker) this, event.getException());
			} catch (Exception e) {
				errors.add(e);
			}
		}
		if (errors.size() > 0) {
			throw new RuntimeException(errors.get(0));
		}
	}

	private void handleInferenceInitializationResult(final CycList data) {
		if (data.size() != 3) {
			throw new RuntimeException("Got wrong number of arguments from inference result (expected 3): " + data);
		}
		final Object problemStoreObj = data.get(1);
		final Object inferenceObj = data.get(2);
		if (problemStoreObj == null || !(problemStoreObj instanceof Number)) {
			throw new RuntimeException("Got bad inference problem store id: " + problemStoreObj);
		}
		if (inferenceObj == null || !(inferenceObj instanceof Number)) {
			throw new RuntimeException("Got bad inference id: " + inferenceObj);
		}
		this.problemStoreId = ((Number) problemStoreObj).intValue();
		this.inferenceId = ((Number) inferenceObj).intValue();
		final List<Exception> errors = new ArrayList<Exception>();
		final Object[] curListeners = this.getInferenceListeners();
		for (int i = curListeners.length - 1; i >= 0; --i) {
			try {
				((InferenceWorkerListener) curListeners[i]).notifyInferenceCreated((InferenceWorker) this);
			} catch (Exception e) {
				errors.add(e);
			}
		}
		if (errors.size() > 0) {
			throw new RuntimeException(errors.get(0));
		}
	}

	private void handleInferenceAnswerResult(final CycList data) {
		if (data.size() != 2) {
			throw new RuntimeException("Got wrong number of arguments from inference result (expected 2): " + data);
		}
		final Object newAnswers = data.get(1);
		if (newAnswers == null || !(newAnswers instanceof CycList)) {
			throw new RuntimeException("Got bad inference answers list: " + newAnswers);
		}
		this.answers.addAll((Collection) newAnswers);
		final Object[] curListeners = this.getInferenceListeners();
		final List<Exception> errors = new ArrayList<Exception>();
		for (int i = curListeners.length - 1; i >= 0; --i) {
			try {
				((InferenceWorkerListener) curListeners[i]).notifyInferenceAnswersAvailable((InferenceWorker) this, (List) newAnswers);
			} catch (Exception e) {
				errors.add(e);
			}
		}
		if (errors.size() > 0) {
			throw new RuntimeException(errors.get(0));
		}
	}

	private void handleInferenceStatusChangedResult(final CycList data) {
		if (data.size() != 3) {
			throw new RuntimeException("Got wrong number of arguments from inference status changed (expected 3): " + data);
		}
		final Object statusObj = data.get(1);
		if (statusObj == null || !(statusObj instanceof CycSymbol)) {
			throw new RuntimeException("Got bad inference status: " + statusObj);
		}
		final InferenceStatus newStatus = InferenceStatus.findInferenceStatus((CycSymbol) statusObj);
		final InferenceStatus oldStatus = this.status;
		this.status = newStatus;
		if (this.status == null) {
			throw new RuntimeException("Got bad inference status name: " + statusObj);
		}
		this.suspendReason = InferenceSuspendReason.fromCycSuspendReason(data.get(2));
		this.fireInferenceStatusChanged(oldStatus);
	}

	protected static String createInferenceCommand(final CycList query, final ELMt mt, final InferenceParameters queryProperties, final Map nlGenerationProperties, final CycSymbol answerProcessingFunction, final boolean optimizeVariables, final CycAccess cycAccess) {
		return createInferenceCommandInternal((CycObject) query, mt, queryProperties, nlGenerationProperties, answerProcessingFunction, optimizeVariables, cycAccess);
	}

	private static String createInferenceCommandInternal(final CycObject query, final ELMt mt, InferenceParameters queryProperties, final Map nlGenerationProperties, CycSymbol answerProcessingFunction, final boolean optimizeVariables, final CycAccess cycAccess) {
		if (queryProperties == null) {
			queryProperties = (InferenceParameters) new DefaultInferenceParameters(cycAccess);
		}
		if (answerProcessingFunction != null && !answerProcessingFunction.shouldQuote()) {
			answerProcessingFunction = new CycSymbol(answerProcessingFunction.getPackageName(), answerProcessingFunction.getSymbolName());
		}
		final String processingFnStr = (answerProcessingFunction != null) ? answerProcessingFunction.stringApiValue() : "nil";
		queryProperties.put(new CycSymbol(":CONTINUABLE?"), (Object) Boolean.TRUE);
		return "(open-cyc-start-continuable-query " + query.stringApiValue() + " " + mt.stringApiValue() + " " + queryProperties.stringApiValue() + " " + CycList.convertMapToPlist(nlGenerationProperties).stringApiValue() + " " + processingFnStr + " t " + (optimizeVariables ? "t" : "nil") + ")";
	}

	protected static String createInferenceInterruptCommand(final int problemStoreId, final int inferenceId, final Integer patience) {
		final String patienceStr = (patience == null) ? "NIL" : patience.toString();
		return "(cdr (list (inference-interrupt (find-inference-by-ids " + problemStoreId + " " + inferenceId + ") " + patienceStr + ")))";
	}

	protected String createInferenceInterruptCommand(final Integer patience) {
		return createInferenceInterruptCommand(this.problemStoreId, this.inferenceId, patience);
	}

	protected String createInferenceContinuationCommand(InferenceParameters queryProperties) {
		if (queryProperties == null) {
			queryProperties = (InferenceParameters) new DefaultInferenceParameters(this.getCycServer());
		}
		if (this.answerProcessingFunction != null && !this.answerProcessingFunction.shouldQuote()) {
			this.answerProcessingFunction = new CycSymbol(this.answerProcessingFunction.getPackageName(), this.answerProcessingFunction.getSymbolName());
		}
		final String processingFnStr = (this.answerProcessingFunction != null) ? this.answerProcessingFunction.stringApiValue() : "nil";
		queryProperties.put(new CycSymbol(":CONTINUABLE?"), (Object) Boolean.TRUE);
		return "(cdr (list (open-cyc-continue-query " + this.problemStoreId + " " + this.inferenceId + " " + queryProperties.stringApiValue() + " nil " + processingFnStr + " t)))";
	}

	protected String createInferenceAbortionCommand() {
		return "(cdr (list (inference-abort (find-inference-by-ids " + this.problemStoreId + " " + this.inferenceId + "))))";
	}

	private static CycFormulaSentence makeCycLSentence(final String query, final CycAccess access) {
		try {
			return CycLParserUtil.parseCycLSentence(query, true, access);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public static void main(final String[] args) {
		try {
			final CycAccess access = new CycAccess("localhost", 3640);
			final InferenceWorker worker = (InferenceWorker) new DefaultInferenceWorker("(#$isa ?X #$Dog)", CycAccess.inferencePSC, null, access, 10000L);
			worker.addInferenceListener((InferenceWorkerListener) new InferenceWorkerListener() {
				public void notifyInferenceCreated(final InferenceWorker inferenceWorker) {
					System.out.println("GOT CREATED EVENT\n" + inferenceWorker);
				}

				public void notifyInferenceStatusChanged(final InferenceStatus oldStatus, final InferenceStatus newStatus, final InferenceSuspendReason suspendReason, final InferenceWorker inferenceWorker) {
					System.out.println("GOT STATUS CHANGED EVENT\n" + inferenceWorker);
				}

				public void notifyInferenceAnswersAvailable(final InferenceWorker inferenceWorker, final List newAnswers) {
					System.out.println("GOT NEW ANSWERS EVENT\n" + inferenceWorker);
				}

				public void notifyInferenceTerminated(final InferenceWorker inferenceWorker, final Exception e) {
					System.out.println("GOT TERMINATED EVENT\n" + inferenceWorker);
					if (e != null) {
						e.printStackTrace();
					}
					System.exit(0);
				}
			});
			worker.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static {
		DefaultInferenceWorker.inferenceListenerClass = InferenceWorkerListener.class;
		DefaultInferenceWorker.DEFAULT_NL_GENERATION_PROPERTIES = Collections.emptyMap();
	}
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 218 ms
	
	Decompiled with Procyon 0.5.32.
*/