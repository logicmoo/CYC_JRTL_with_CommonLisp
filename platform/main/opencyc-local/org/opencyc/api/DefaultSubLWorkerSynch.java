package org.opencyc.api;

import java.util.Collection;
import java.util.List;
import org.opencyc.util.OpenCycTaskInterruptedException;
import org.opencyc.util.TimeOutException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.opencyc.cycobject.CycList;
import java.util.concurrent.Semaphore;

public class DefaultSubLWorkerSynch extends DefaultSubLWorker implements SubLWorkerSynch, SubLWorkerListener
{
    private final Semaphore sem;
    private volatile Object work;
    private volatile Exception e;
    static SubLWorkerSynch testWorker;
    
    public DefaultSubLWorkerSynch(final String subLCommand, final CycAccess access) {
        this(access.makeCycList(subLCommand), access);
    }
    
    public DefaultSubLWorkerSynch(final String subLCommand, final CycAccess access, final long timeoutMsecs) {
        this(access.makeCycList(subLCommand), access, timeoutMsecs);
    }
    
    public DefaultSubLWorkerSynch(final String subLCommand, final CycAccess access, final boolean expectIncrementalResults) {
        this(access.makeCycList(subLCommand), access, expectIncrementalResults);
    }
    
    public DefaultSubLWorkerSynch(final String subLCommand, final CycAccess access, final boolean expectIncrementalResults, final long timeoutMsec) {
        this(access.makeCycList(subLCommand), access, expectIncrementalResults, timeoutMsec, CycConnection.NORMAL_PRIORITY);
    }
    
    public DefaultSubLWorkerSynch(final CycList subLCommand, final CycAccess access) {
        this(subLCommand, access, false);
    }
    
    public DefaultSubLWorkerSynch(final CycList subLCommand, final CycAccess access, final long timeoutMsecs) {
        this(subLCommand, access, timeoutMsecs, CycConnection.NORMAL_PRIORITY);
    }
    
    public DefaultSubLWorkerSynch(final CycList subLCommand, final CycAccess access, final boolean expectIncrementalResults) {
        this(subLCommand, access, expectIncrementalResults, CycConnection.NORMAL_PRIORITY);
    }
    
    public DefaultSubLWorkerSynch(final CycList subLCommand, final CycAccess access, final long timeoutMsecs, final Integer priority) {
        this(subLCommand, access, false, timeoutMsecs, priority);
    }
    
    public DefaultSubLWorkerSynch(final CycList subLCommand, final CycAccess access, final boolean expectIncrementalResults, final Integer priority) {
        this(subLCommand, access, expectIncrementalResults, 0L, priority);
    }
    
    public DefaultSubLWorkerSynch(final CycList subLCommand, final CycAccess access, final boolean expectIncrementalResults, final long timeoutMsecs, final Integer priority) {
        super(subLCommand, access, expectIncrementalResults, timeoutMsecs, priority);
        this.sem = new Semaphore(0);
        this.work = null;
        this.e = null;
        this.addListener((SubLWorkerListener)this);
    }
    
    public Object getWork() throws IOException, TimeOutException, CycApiException, OpenCycTaskInterruptedException {
        if (this.getStatus() == SubLWorkerStatus.NOT_STARTED_STATUS) {
            this.start();
        }
        if (this.getStatus() == SubLWorkerStatus.WORKING_STATUS) {
            try {
                boolean gotResults = true;
                if (this.getTimeoutMsecs() > 0L) {
                    gotResults = this.sem.tryAcquire(this.getTimeoutMsecs(), TimeUnit.MILLISECONDS);
                }
                else {
                    this.sem.acquire();
                }
                Label_0209: {
                    if (gotResults) {
                        if (this.getStatus() != SubLWorkerStatus.WORKING_STATUS) {
                            break Label_0209;
                        }
                    }
                    try {
                        this.abort();
                    }
                    catch (IOException xcpt) {
                        throw xcpt;
                    }
                    finally {
                        this.fireSubLWorkerTerminatedEvent(new SubLWorkerEvent((SubLWorker)this, SubLWorkerStatus.EXCEPTION_STATUS, (Exception)new TimeOutException("Communications took more than: " + this.getTimeoutMsecs() + " msecs.\nWhile trying to execute: \n" + this.getSubLCommand().toPrettyCyclifiedString(""))));
                    }
                }
            }
            catch (Exception xcpt2) {
                this.setException(xcpt2);
            }
        }
        if (this.getException() != null) {
            try {
                throw this.getException();
            }
            catch (IOException ioe) {
                throw ioe;
            }
            catch (TimeOutException toe) {
                throw toe;
            }
            catch (CycApiInvalidObjectException cae) {
                this.setException((Exception)new CycApiInvalidObjectException(cae.getMessage(), (Throwable)cae));
                throw (RuntimeException)this.getException();
            }
            catch (CycApiServerSideException cae2) {
                this.setException((Exception)new CycApiServerSideException(cae2.getMessage(), (Throwable)cae2));
                throw (RuntimeException)this.getException();
            }
            catch (CycApiException cae3) {
                this.setException((Exception)new CycApiException(cae3.getMessage(), (Throwable)cae3));
                throw (RuntimeException)this.getException();
            }
            catch (InterruptedException ie) {
                this.setException((Exception)new OpenCycTaskInterruptedException(ie));
                throw (RuntimeException)this.getException();
            }
            catch (RuntimeException re) {
                throw re;
            }
            catch (Exception xcpt2) {
                this.setException(new RuntimeException(xcpt2));
                throw (RuntimeException)this.getException();
            }
        }
        return this.work;
    }
    
    public void notifySubLWorkerStarted(final SubLWorkerEvent event) {
    }
    
    public void notifySubLWorkerDataAvailable(final SubLWorkerEvent event) {
        this.appendWork(event.getWork());
    }
    
    public void notifySubLWorkerTerminated(final SubLWorkerEvent event) {
        this.setException(event.getException());
        this.sem.release();
    }
    
    public Exception getException() {
        return this.e;
    }
    
    protected void setException(final Exception e) {
        this.e = e;
    }
    
    protected void appendWork(final Object newWork) {
        if (this.expectIncrementalResults()) {
            if (this.work == null) {
                this.work = new CycList();
            }
            if (newWork != CycObjectFactory.nil) {
                ((List)this.work).addAll((Collection)newWork);
            }
        }
        else {
            this.work = newWork;
        }
    }
    
    public static void main(final String[] args) {
        try {
            final CycAccess access = new CycAccess("localhost", 3640);
            final SubLWorkerSynch worker = (SubLWorkerSynch)new DefaultSubLWorkerSynch("(+ 1 1)", access);
            final Object work = worker.getWork();
            System.out.println("Got worker: " + worker + "\nGot result: " + work + ".");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        try {
            final CycAccess access = new CycAccess("localhost", 3640);
            Thread workerThread = new Thread() {
                @Override
                public void run() {
                    try {
                        System.out.println("Starting work.");
                        DefaultSubLWorkerSynch.testWorker = (SubLWorkerSynch)new DefaultSubLWorkerSynch("(do-assertions (a))", access);
                        final Object obj = DefaultSubLWorkerSynch.testWorker.getWork();
                        System.out.println("Finished work with " + DefaultSubLWorkerSynch.testWorker.getStatus().getName() + ", received: " + obj);
                    }
                    catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            };
            workerThread.start();
            Thread.currentThread();
            Thread.sleep(10000L);
            System.out.println("About to cancel work.");
            DefaultSubLWorkerSynch.testWorker.cancel();
            System.out.println("Canceled work.");
            System.out.println("\nGiving chance to get ready ....\n");
            Thread.currentThread();
            Thread.sleep(1000L);
            System.out.println("\nOk, second round ....\n\n");
            workerThread = new Thread() {
                @Override
                public void run() {
                    try {
                        System.out.println("Starting work.");
                        DefaultSubLWorkerSynch.testWorker = (SubLWorkerSynch)new DefaultSubLWorkerSynch("(do-assertions (a))", access);
                        final Object obj = DefaultSubLWorkerSynch.testWorker.getWork();
                        System.out.println("Finished work with " + DefaultSubLWorkerSynch.testWorker.getStatus().getName() + ", received: " + obj);
                    }
                    catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            };
            workerThread.start();
            Thread.currentThread();
            Thread.sleep(10000L);
            System.out.println("About to abort work.");
            DefaultSubLWorkerSynch.testWorker.abort();
            System.out.println("Aborted work.");
            System.out.println("\nGiving chance to get ready ....\n");
            Thread.currentThread();
            Thread.sleep(1000L);
            System.out.println("\nOk, third round ....\n\n");
            workerThread = new Thread() {
                @Override
                public void run() {
                    long timeBefore = 0L;
                    long timeAfter = 0L;
                    try {
                        System.out.println("Starting work.");
                        timeBefore = System.currentTimeMillis();
                        DefaultSubLWorkerSynch.testWorker = (SubLWorkerSynch)new DefaultSubLWorkerSynch("(do-assertions (a))", access, 500L);
                        final Object obj = DefaultSubLWorkerSynch.testWorker.getWork();
                        timeAfter = System.currentTimeMillis();
                        System.out.println("Finished work with " + DefaultSubLWorkerSynch.testWorker.getStatus().getName() + " after " + (timeAfter - timeBefore) + " millisecs (should be about 500), received: " + obj);
                    }
                    catch (Exception e) {
                        timeAfter = System.currentTimeMillis();
                        System.out.println("The current time is: " + (timeAfter - timeBefore) + " millisecs (should be about 500)");
                        e.printStackTrace();
                    }
                }
            };
            workerThread.start();
            Thread.currentThread();
            Thread.sleep(10000L);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        System.exit(0);
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 165 ms
	
	Decompiled with Procyon 0.5.32.
*/