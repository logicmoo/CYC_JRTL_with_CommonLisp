package org.opencyc.util;

import org.opencyc.cycobject.DefaultCycObject;
import org.opencyc.cycobject.CycObject;
import java.util.Locale;
import org.opencyc.api.CycObjectFactory;
import org.opencyc.cycobject.CycSymbol;
import org.opencyc.api.DefaultSubLWorkerSynch;
import org.opencyc.api.DefaultSubLWorker;
import org.opencyc.api.SubLWorker;
import java.util.List;
import org.opencyc.inference.InferenceWorkerSynch;
import java.util.logging.Logger;
import org.opencyc.api.SubLWorkerSynch;
import org.opencyc.api.CycConnection;
import org.opencyc.cycobject.CycList;
import org.opencyc.api.CycApiException;
import java.io.IOException;
import org.opencyc.api.CycAccess;

public final class CommUtils
{
    public static String LOGGER_ID;
    
    public static Object performApiCommand(final String command, final CycAccess cyc) throws IOException, TimeOutException, CycApiException, OpenCycTaskInterruptedException {
        return performApiCommand(command, cyc, "About to perform API command: ", 0L);
    }
    
    public static Object performApiCommand(final CycList command, final CycAccess cyc) throws IOException, TimeOutException, CycApiException, OpenCycTaskInterruptedException {
        return performApiCommand(command, cyc, "About to perform API command: ", 0L, CycConnection.NORMAL_PRIORITY);
    }
    
    public static Object performApiCommand(final CycList command, final CycAccess cyc, final Integer priority) throws IOException, TimeOutException, CycApiException, OpenCycTaskInterruptedException {
        return performApiCommand(command, cyc, "About to perform API command: ", 0L, priority);
    }
    
    public static Object performApiCommand(final String command, final CycAccess cyc, final String taskDescription, final long timeoutMsecs) throws IOException, TimeOutException, CycApiException, OpenCycTaskInterruptedException {
        final SubLWorkerSynch worker = (SubLWorkerSynch)makeSubLWorker(command, cyc, false, timeoutMsecs, true);
        return performApiCommand(worker, taskDescription);
    }
    
    public static Object performApiCommand(final CycList command, final CycAccess cyc, final String taskDescription, final long timeoutMsecs, final Integer priority) throws IOException, TimeOutException, CycApiException, OpenCycTaskInterruptedException {
        final SubLWorkerSynch worker = (SubLWorkerSynch)makeSubLWorker(command, cyc, false, timeoutMsecs, true, priority);
        return performApiCommand(worker, taskDescription);
    }
    
    public static Object performApiCommand(final SubLWorkerSynch command) throws IOException, TimeOutException, CycApiException, OpenCycTaskInterruptedException {
        return performApiCommand(command, "About to perform API command: ");
    }
    
    public static Object performApiCommand(final SubLWorkerSynch command, final String taskDescription) throws IOException, TimeOutException, CycApiException, OpenCycTaskInterruptedException {
        Object apiResult = null;
        Logger.getLogger(CommUtils.LOGGER_ID).info(taskDescription + "\n" + command);
        final long startTime = System.currentTimeMillis();
        apiResult = command.getWork();
        final long endTime = System.currentTimeMillis();
        Logger.getLogger(CommUtils.LOGGER_ID).info("Command took: " + (endTime - startTime) + "ms.");
        Logger.getLogger(CommUtils.LOGGER_ID).finest("" + apiResult);
        return apiResult;
    }
    
    public static List performInference(final InferenceWorkerSynch command) throws IOException, TimeOutException, CycApiException {
        return performInference(command, "About to start inference: ");
    }
    
    public static List performInference(final InferenceWorkerSynch command, final String taskDescription) throws IOException, TimeOutException, CycApiException {
        List answers = null;
        Logger.getLogger(CommUtils.LOGGER_ID).info(taskDescription + "\n" + command);
        answers = command.performSynchronousInference();
        Logger.getLogger(CommUtils.LOGGER_ID).finest("Got answers: " + answers);
        return answers;
    }
    
    public static void startAsynchApiCommand(final SubLWorker command) throws IOException, TimeOutException, CycApiException {
        startAsynchApiCommand(command, "About to start API command: ");
    }
    
    public static void startAsynchApiCommand(final SubLWorker command, final String taskDescription) throws IOException, TimeOutException, CycApiException {
        Logger.getLogger(CommUtils.LOGGER_ID).info(taskDescription + "\n" + command);
        command.start();
    }
    
    public static SubLWorker makeSubLWorker(final String command, final CycAccess cyc, final boolean asynch, final long timeoutMsecs) {
        return makeSubLWorker(command, cyc, asynch, timeoutMsecs, true, CycConnection.NORMAL_PRIORITY);
    }
    
    public static SubLWorker makeSubLWorker(final String command, final CycAccess cyc, final boolean asynch, final long timeoutMsecs, final Integer priority) {
        return makeSubLWorker(command, cyc, asynch, timeoutMsecs, true, priority);
    }
    
    public static SubLWorker makeSubLWorker(String command, final CycAccess cyc, final boolean asynch, final long timeoutMsecs, final boolean wrapBookkeeping, final Integer priority) {
        command = processCommand(command, cyc, wrapBookkeeping);
        return (SubLWorker)(asynch ? new DefaultSubLWorker(cyc.makeCycList(command), cyc, false, timeoutMsecs, priority) : new DefaultSubLWorkerSynch(cyc.makeCycList(command), cyc, timeoutMsecs, priority));
    }
    
    public static SubLWorker makeSubLWorker(final CycList command, final CycAccess cyc, final boolean asynch, final long timeoutMsecs) {
        return makeSubLWorker(command, cyc, asynch, timeoutMsecs, true);
    }
    
    public static SubLWorker makeSubLWorker(final CycList command, final CycAccess cyc, final boolean asynch, final long timeoutMsecs, final Integer priority) {
        return makeSubLWorker(command, cyc, asynch, timeoutMsecs, true, priority);
    }
    
    public static SubLWorker makeSubLWorker(String command, final CycAccess cyc, final boolean asynch, final long timeoutMsecs, final boolean wrapBookkeeping) {
        command = processCommand(command, cyc, wrapBookkeeping);
        return (SubLWorker)(asynch ? new DefaultSubLWorker(command, cyc, false, timeoutMsecs) : new DefaultSubLWorkerSynch(command, cyc, timeoutMsecs));
    }
    
    public static SubLWorker makeSubLWorker(CycList command, final CycAccess cyc, final boolean asynch, final long timeoutMsecs, final boolean wrapBookkeeping) {
        command = processCommand(command, cyc, wrapBookkeeping);
        return (SubLWorker)(asynch ? new DefaultSubLWorker(command, cyc, timeoutMsecs) : new DefaultSubLWorkerSynch(command, cyc, timeoutMsecs));
    }
    
    public static SubLWorker makeSubLWorker(CycList command, final CycAccess cyc, final boolean asynch, final long timeoutMsecs, final boolean wrapBookkeeping, final Integer priority) {
        command = processCommand(command, cyc, wrapBookkeeping);
        return (SubLWorker)(asynch ? new DefaultSubLWorker(command, cyc, timeoutMsecs, priority) : new DefaultSubLWorkerSynch(command, cyc, timeoutMsecs, priority));
    }
    
    public static String getSubLForBoolean(final boolean val) {
        return val ? "T" : "nil";
    }
    
    public static CycSymbol getCycSymbolForBoolean(final boolean val) {
        return val ? CycObjectFactory.t : CycObjectFactory.nil;
    }
    
    public static boolean getBooleanFromSubLString(final String val) {
        return !val.toUpperCase(Locale.ENGLISH).equals("NIL");
    }
    
    public static boolean convertResponseToBoolean(final Object response) {
        return response.toString().toUpperCase(Locale.ENGLISH).equals("T");
    }
    
    public static CycObject convertResponseToCycObject(final Object response) {
        if (response.equals(CycObjectFactory.nil)) {
            return (CycObject)new CycList();
        }
        return (CycObject)response;
    }
    
    public static int convertResponseToInt(final Object response) {
        return new Integer(response.toString());
    }
    
    public static CycList convertResponseToCycList(final Object response, final Object command) {
        if (response.equals(CycObjectFactory.nil)) {
            return new CycList();
        }
        if (response instanceof CycList) {
            return (CycList)response;
        }
        String request;
        if (command instanceof CycList) {
            request = ((CycList)command).cyclify();
        }
        else {
            request = (String)command;
        }
        throw new CycApiException(response.toString() + "\nrequest: " + request);
    }
    
    public static String convertResponseToString(final Object response, final Object command) {
        if (!(response instanceof String)) {
            throw new RuntimeException("Expected String but received (" + response.getClass() + ") " + response + "\n in response to command " + command);
        }
        return (String)response;
    }
    
    public static String composeApiCommand(final String function, final Object... arguments) {
        final StringBuilder apiCmd = new StringBuilder(256);
        apiCmd.append('(');
        apiCmd.append(function);
        for (final Object arg : arguments) {
            apiCmd.append(" ");
            apiCmd.append(DefaultCycObject.stringApiValue(arg));
        }
        apiCmd.append(')');
        return apiCmd.toString();
    }
    
    public static String composeMultipleApiCommands(final String... commands) {
        final StringBuilder apiCmd = new StringBuilder(256);
        apiCmd.append("(LIST ");
        for (final Object command : commands) {
            apiCmd.append(command);
        }
        apiCmd.append(')');
        return apiCmd.toString();
    }
    
    private static String processCommand(String command, final CycAccess cyc, final boolean wrapBookkeeping) {
        if (wrapBookkeeping) {
            command = cyc.wrapBookkeeping(command);
        }
        return command;
    }
    
    private static CycList processCommand(CycList command, final CycAccess cyc, final boolean wrapBookkeeping) {
        final CycList result = command;
        if (wrapBookkeeping) {
            command = cyc.makeCycList(cyc.wrapBookkeeping("" + command.cyclify()));
        }
        return command;
    }
    
    static {
        CommUtils.LOGGER_ID = CommUtils.class.toString();
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 104 ms
	
	Decompiled with Procyon 0.5.32.
*/