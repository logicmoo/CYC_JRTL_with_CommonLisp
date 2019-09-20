package org.opencyc.inference;

import org.opencyc.cycobject.CycObject;
import org.opencyc.parser.CycLParserUtil;
import org.opencyc.api.SubLWorker;
import org.opencyc.api.SubLWorkerEvent;
import org.opencyc.api.SubLWorkerStatus;
import org.opencyc.api.CycApiException;
import org.opencyc.util.TimeOutException;
import java.io.IOException;
import java.util.List;
import org.opencyc.api.CycConnection;
import org.opencyc.cycobject.CycFormulaSentence;
import org.opencyc.cycobject.CycList;
import org.opencyc.cycobject.CycSymbol;
import java.util.Map;
import org.opencyc.api.CycAccess;
import org.opencyc.inference.params.InferenceParameters;
import org.opencyc.cycobject.ELMt;

public class DefaultInferenceWorkerSynch extends DefaultInferenceWorker implements InferenceWorkerSynch
{
    private final Object lock;
    private Exception e;
    
    public DefaultInferenceWorkerSynch(final String query, final ELMt mt, final InferenceParameters queryProperties, final CycAccess access, final long timeoutMsecs) {
        this(makeCycLSentence(query, access), mt, queryProperties, null, null, false, access, timeoutMsecs);
    }
    
    public DefaultInferenceWorkerSynch(final CycList<Object> query, final ELMt mt, final InferenceParameters queryProperties, final CycAccess access, final long timeoutMsecs) {
        super((CycList)query, mt, queryProperties, access, timeoutMsecs);
        this.lock = new Object();
        this.e = null;
        this.init();
    }
    
    public DefaultInferenceWorkerSynch(final CycFormulaSentence query, final ELMt mt, final InferenceParameters queryProperties, final CycAccess access, final long timeoutMsecs) {
        super(query.getArgs(), mt, queryProperties, access, timeoutMsecs);
        this.lock = new Object();
        this.e = null;
        this.init();
    }
    
    public DefaultInferenceWorkerSynch(final String query, final ELMt mt, final InferenceParameters queryProperties, final Map nlGenerationProperties, final CycSymbol answerProcessingFunction, final boolean optimizeVariables, final CycAccess access, final long timeoutMsecs) {
        this(makeCycLSentence(query, access), mt, queryProperties, nlGenerationProperties, answerProcessingFunction, optimizeVariables, access, timeoutMsecs);
    }
    
    public DefaultInferenceWorkerSynch(final CycList<Object> query, final ELMt mt, final InferenceParameters queryProperties, final Map nlGenerationProperties, final CycSymbol answerProcessingFunction, final boolean optimizeVariables, final CycAccess access, final long timeoutMsecs) {
        this(query, mt, queryProperties, nlGenerationProperties, answerProcessingFunction, optimizeVariables, access, timeoutMsecs, CycConnection.NORMAL_PRIORITY);
    }
    
    public DefaultInferenceWorkerSynch(final CycFormulaSentence query, final ELMt mt, final InferenceParameters queryProperties, final Map nlGenerationProperties, final CycSymbol answerProcessingFunction, final boolean optimizeVariables, final CycAccess access, final long timeoutMsecs) {
        this(query, mt, queryProperties, nlGenerationProperties, answerProcessingFunction, optimizeVariables, access, timeoutMsecs, CycConnection.NORMAL_PRIORITY);
    }
    
    public DefaultInferenceWorkerSynch(final CycList query, final ELMt mt, final InferenceParameters queryProperties, final Map nlGenerationProperties, final CycSymbol answerProcessingFunction, final boolean optimizeVariables, final CycAccess access, final long timeoutMsecs, final Integer priority) {
        super(query, mt, queryProperties, nlGenerationProperties, answerProcessingFunction, optimizeVariables, access, timeoutMsecs, priority);
        this.lock = new Object();
        this.e = null;
        this.init();
    }
    
    public DefaultInferenceWorkerSynch(final CycFormulaSentence query, final ELMt mt, final InferenceParameters queryProperties, final Map nlGenerationProperties, final CycSymbol answerProcessingFunction, final boolean optimizeVariables, final CycAccess access, final long timeoutMsecs, final Integer priority) {
        super(query, mt, queryProperties, nlGenerationProperties, answerProcessingFunction, optimizeVariables, access, timeoutMsecs, priority);
        this.lock = new Object();
        this.e = null;
        this.init();
    }
    
    public InferenceResultSet executeQuery() throws IOException, TimeOutException, CycApiException {
        final List results = this.performSynchronousInference();
        return new InferenceResultSet(results, (InferenceWorker)this);
    }
    
    public List performSynchronousInference() throws IOException, TimeOutException, CycApiException {
        if (this.getStatus() == SubLWorkerStatus.NOT_STARTED_STATUS) {
            this.start();
        }
        if (this.getStatus() == SubLWorkerStatus.WORKING_STATUS) {
            try {
                synchronized (this.lock) {
                    this.lock.wait(this.getTimeoutMsecs());
                    if (this.getStatus() == SubLWorkerStatus.WORKING_STATUS) {
                        try {
                            this.abort();
                        }
                        catch (IOException xcpt) {
                            throw xcpt;
                        }
                        finally {
                            this.fireSubLWorkerTerminatedEvent(new SubLWorkerEvent((SubLWorker)this, SubLWorkerStatus.EXCEPTION_STATUS, (Exception)new TimeOutException("Communications took more than: " + this.getTimeoutMsecs() + " msecs.\nWhile trying to execute inference: \n" + this.getSubLCommand().toPrettyCyclifiedString(""))));
                        }
                    }
                }
            }
            catch (Exception xcpt2) {
                throw new RuntimeException(xcpt2);
            }
        }
        if (this.getException() != null) {
            try {
                throw this.getException();
            }
            catch (IOException ioe) {
                throw ioe;
            }
            catch (Exception xcpt2) {
                if (xcpt2 instanceof RuntimeException) {
                    throw (RuntimeException)xcpt2;
                }
                throw new RuntimeException(xcpt2);
            }
        }
        return this.getAnswers();
    }
    
    public Exception getException() {
        return this.e;
    }
    
    protected void setException(final Exception e) {
        this.e = e;
    }
    
    private void init() {
        this.addInferenceListener((InferenceWorkerListener)new InferenceWorkerListener() {
            public void notifyInferenceAnswersAvailable(final InferenceWorker inferenceWorker, final List newAnswers) {
            }
            
            public void notifyInferenceCreated(final InferenceWorker inferenceWorker) {
            }
            
            public void notifyInferenceStatusChanged(final InferenceStatus oldStatus, final InferenceStatus newStatus, final InferenceSuspendReason suspendReason, final InferenceWorker inferenceWorker) {
            }
            
            public void notifyInferenceTerminated(final InferenceWorker inferenceWorker, final Exception e) {
                synchronized (DefaultInferenceWorkerSynch.this.lock) {
                    DefaultInferenceWorkerSynch.this.lock.notify();
                }
            }
        });
    }
    
    private static CycFormulaSentence makeCycLSentence(final String query, final CycAccess access) {
        try {
            return CycLParserUtil.parseCycLSentence(query, true, access);
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void main(final String[] args) {
        System.out.println("Starting");
        CycAccess access = null;
        try {
            access = new CycAccess("localhost", 3660);
            final String query = "(#$isa ?X #$Dog)";
            final InferenceWorkerSynch worker = (InferenceWorkerSynch)new DefaultInferenceWorkerSynch(query, CycAccess.inferencePSC, null, access, 500000L);
            final InferenceResultSet rs = worker.executeQuery();
            try {
                final int indexOfX = rs.findColumn("?X");
                while (rs.next()) {
                    final CycObject curDog = rs.getCycObject(indexOfX);
                    System.out.println("Got dog: " + curDog.cyclify());
                }
                System.out.flush();
            }
            finally {
                rs.close();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if (access != null) {
                access.close();
            }
        }
        System.out.println("Finished");
        System.exit(0);
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 78 ms
	
	Decompiled with Procyon 0.5.32.
*/