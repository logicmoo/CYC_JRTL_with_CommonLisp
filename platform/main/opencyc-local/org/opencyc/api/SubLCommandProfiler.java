package org.opencyc.api;

import org.opencyc.cycobject.CycList;
import java.util.List;
import java.util.Collections;
import java.io.IOException;
import java.io.FileWriter;
import java.util.LinkedList;
import java.util.Hashtable;
import java.util.logging.Logger;

public class SubLCommandProfiler implements SubLWorkerListener
{
    private final Logger logger;
    private final Hashtable subLWorkerStartTimeDictionary;
    private int MOST_TIME_CONSUMING_API_REQUEST_INFOS_LIST_MAX_SIZE;
    final Object mostTimeConsumingSubLCommandInfos_lock;
    private final LinkedList mostTimeConsumingSubLCommandInfos;
    public FileWriter fileWriter;
    static SubLWorkerSynch testWorker;
    
    public SubLCommandProfiler() {
        this.subLWorkerStartTimeDictionary = new Hashtable();
        this.MOST_TIME_CONSUMING_API_REQUEST_INFOS_LIST_MAX_SIZE = 1000;
        this.mostTimeConsumingSubLCommandInfos_lock = new Object();
        this.mostTimeConsumingSubLCommandInfos = new LinkedList();
        this.fileWriter = null;
        this.logger = Logger.getLogger("org.opencyc.api.SubLCommandProfiler");
    }
    
    public void report(final String reportPath) throws IOException {
        if (reportPath == null) {
            throw new NullPointerException("reportPath must not be null");
        }
        if (reportPath.length() == 0) {
            throw new IllegalArgumentException("reportPath must not be an empty string");
        }
        assert this.mostTimeConsumingSubLCommandInfos != null : "mostTimeConsumingSubLCommandInfos must not be null";
        (this.fileWriter = new FileWriter(reportPath)).write("Longest Duration Cyc API Requests");
        this.fileWriter.write("\n\n");
        for (int i = this.mostTimeConsumingSubLCommandInfos.size() - 1; i >= 0; --i) {
            final SubLCommandInfo subLCommandInfo = (SubLCommandInfo) this.mostTimeConsumingSubLCommandInfos.get(i);
            this.fileWriter.write("----------------------------------------------------------------------\n");
            final String subLCommandInfoString = subLCommandInfo.toString();
            this.fileWriter.write(subLCommandInfo.toString());
        }
        this.fileWriter.close();
    }
    
    public void notifySubLWorkerStarted(final SubLWorkerEvent event) {
        assert event != null : "event must not be null";
        assert this.subLWorkerStartTimeDictionary != null : "subLWorkerStartTimeDictionary must not be null";
        this.subLWorkerStartTimeDictionary.put(event.getWorker(), new Long(System.currentTimeMillis()));
        this.logger.fine(event.getWorker().getSubLCommand().toPrettyCyclifiedString(""));
    }
    
    public void notifySubLWorkerDataAvailable(final SubLWorkerEvent event) {
    }
    
    public void notifySubLWorkerTerminated(final SubLWorkerEvent event) {
        assert event != null : "event must not be null";
        assert this.subLWorkerStartTimeDictionary != null : "subLWorkerStartTimeDictionary must not be null";
        final SubLWorker subLWorker = event.getWorker();
        final SubLWorkerStatus status = event.getStatus();
        if (status.equals(SubLWorkerStatus.FINISHED_STATUS)) {
            final Long startTime = (Long) this.subLWorkerStartTimeDictionary.get(subLWorker);
            if (startTime != null) {
                final long durationMillis = System.currentTimeMillis() - startTime;
                final SubLCommandInfo subLCommandInfo = new SubLCommandInfo(subLWorker.getSubLCommand(), durationMillis);
                this.insertSubLCommandInfo(subLCommandInfo);
                this.logger.fine(subLCommandInfo.durationMillisToString() + "\n\n");
            }
        }
        this.subLWorkerStartTimeDictionary.remove(subLWorker);
    }
    
    private void insertSubLCommandInfo(final SubLCommandInfo subLCommandInfo) {
        assert subLCommandInfo != null : "subLCommandInfo must not be null";
        assert this.mostTimeConsumingSubLCommandInfos != null : "mostTimeConsumingSubLCommandInfos must not be null";
        assert this.MOST_TIME_CONSUMING_API_REQUEST_INFOS_LIST_MAX_SIZE > 0 : "MOST_TIME_CONSUMING_API_REQUEST_INFOS_LIST_MAX_SIZE must be positive";
        synchronized (this.mostTimeConsumingSubLCommandInfos_lock) {
            if (this.mostTimeConsumingSubLCommandInfos.size() == this.MOST_TIME_CONSUMING_API_REQUEST_INFOS_LIST_MAX_SIZE) {
                final SubLCommandInfo firstSubLCommandInfo = (SubLCommandInfo) this.mostTimeConsumingSubLCommandInfos.getFirst();
                if (subLCommandInfo.compareTo(firstSubLCommandInfo) == -1) {
                    return;
                }
            }
            final int searchIndex = Collections.binarySearch(this.mostTimeConsumingSubLCommandInfos, subLCommandInfo);
            final int insertIndex = (searchIndex >= 0) ? searchIndex : (-searchIndex - 1);
            this.mostTimeConsumingSubLCommandInfos.add(insertIndex, subLCommandInfo);
            if (this.mostTimeConsumingSubLCommandInfos.size() > this.MOST_TIME_CONSUMING_API_REQUEST_INFOS_LIST_MAX_SIZE) {
                this.mostTimeConsumingSubLCommandInfos.removeFirst();
            }
        }
    }
    
    public static void main(final String[] args) {
        DefaultSubLWorker.startProfiling();
        final int BASE_PORT = 3640;
        try {
            final CycAccess access = new CycAccess("localhost", 3640);
            SubLWorkerSynch worker = (SubLWorkerSynch)new DefaultSubLWorkerSynch("(+ 1 1)", access);
            Object work = worker.getWork();
            System.out.println("Got worker: " + worker + "\nGot result: " + work + ".");
            worker = (SubLWorkerSynch)new DefaultSubLWorkerSynch("(genls #$TransportationDevice)", access);
            work = worker.getWork();
            System.out.println("Got worker: " + worker + "\nGot result: " + work + ".");
            worker = (SubLWorkerSynch)new DefaultSubLWorkerSynch("(generate-phrase '(#$isa #$Brazil #$IndependentCountry))", access);
            work = worker.getWork();
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
                        SubLCommandProfiler.testWorker = (SubLWorkerSynch)new DefaultSubLWorkerSynch("(do-assertions (a))", access);
                        final Object obj = SubLCommandProfiler.testWorker.getWork();
                        System.out.println("Finished work with " + SubLCommandProfiler.testWorker.getStatus().getName() + ", received: " + obj);
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
            SubLCommandProfiler.testWorker.cancel();
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
                        SubLCommandProfiler.testWorker = (SubLWorkerSynch)new DefaultSubLWorkerSynch("(do-assertions (a))", access);
                        final Object obj = SubLCommandProfiler.testWorker.getWork();
                        System.out.println("Finished work with " + SubLCommandProfiler.testWorker.getStatus().getName() + ", received: " + obj);
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
            SubLCommandProfiler.testWorker.abort();
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
                        SubLCommandProfiler.testWorker = (SubLWorkerSynch)new DefaultSubLWorkerSynch("(do-assertions (a))", access, 500L);
                        final Object obj = SubLCommandProfiler.testWorker.getWork();
                        timeAfter = System.currentTimeMillis();
                        System.out.println("Finished work with " + SubLCommandProfiler.testWorker.getStatus().getName() + " after " + (timeAfter - timeBefore) + " millisecs (should be about 500), received: " + obj);
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
        try {
            DefaultSubLWorker.endProfiling("/home/reed/subl-command-profile-report.txt");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        System.exit(0);
    }
    
    private class SubLCommandInfo implements Comparable
    {
        private final CycList subLCommand;
        private final long durationMillis;
        
        SubLCommandInfo(final CycList subLCommand, final long durationMillis) {
            assert subLCommand != null : "subLCommand must not be null";
            assert durationMillis >= 0L : "durationMillis must not be negative " + durationMillis;
            this.subLCommand = subLCommand;
            this.durationMillis = durationMillis;
        }
        
        @Override
        public int compareTo(final Object obj) {
            final SubLCommandInfo that = (SubLCommandInfo)obj;
            if (this.durationMillis < that.durationMillis) {
                return -1;
            }
            if (this.durationMillis == that.durationMillis) {
                return 0;
            }
            return 1;
        }
        
        @Override
        public String toString() {
            final StringBuffer stringBuffer = new StringBuffer(1000);
            stringBuffer.append(this.durationMillisToString());
            stringBuffer.append('\n');
            stringBuffer.append(this.subLCommandToString());
            stringBuffer.append("\n\n");
            return stringBuffer.toString();
        }
        
        public String subLCommandToString() {
            return this.subLCommand.toPrettyCyclifiedString("");
        }
        
        public String durationMillisToString() {
            final StringBuffer stringBuffer = new StringBuffer(50);
            stringBuffer.append("milliseconds duration: ");
            stringBuffer.append(this.durationMillis);
            return stringBuffer.toString();
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 172 ms
	
	Decompiled with Procyon 0.5.32.
*/