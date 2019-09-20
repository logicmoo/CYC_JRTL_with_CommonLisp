package org.opencyc.api;

import java.util.logging.Handler;
import java.util.logging.ConsoleHandler;
import org.opencyc.cycobject.CycConstant;
import org.opencyc.cycobject.Guid;
import java.io.IOException;
import java.net.UnknownHostException;
import org.opencyc.cycobject.DefaultCycObject;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.opencyc.cycobject.CycObject;
import org.opencyc.cycobject.CycSymbol;

public class SubLAPIHelper
{
    public static final CycSymbol THE_CYCLIST;
    private volatile CycAccess access;
    private final CycObject user;
    private volatile boolean madeCycAccess;
    private volatile long maxTimeoutMSecs;
    public static long DEFAULT_MAX_TIMEOUT_MSECS;
    private static final Logger logger;
    public static final Level DEFAULT_LOGGING_LEVEL;
    
    private static String getAPIString(final Object param) {
        return (param instanceof AsIsTerm) ? ((AsIsTerm)param).toString() : DefaultCycObject.stringApiValue(param);
    }
    
    public SubLAPIHelper(final String hostName, final int port, final CycObject user) throws UnknownHostException, IOException {
        this(new CycAccess(hostName, port), user);
        this.madeCycAccess = true;
    }
    
    public SubLAPIHelper(final CycAccess access, final CycObject user) {
        this.madeCycAccess = false;
        this.maxTimeoutMSecs = SubLAPIHelper.DEFAULT_MAX_TIMEOUT_MSECS;
        if (access == null) {
            throw new RuntimeException("Got invalid access: " + access);
        }
        this.access = access;
        this.user = user;
    }
    
    public synchronized void close() {
        if (this.madeCycAccess) {
            try {
                this.getCycAccess().close();
            }
            catch (Exception ex) {}
        }
        this.setCycAccess(null);
    }
    
    public CycAccess getCycAccess() {
        return this.access;
    }
    
    private synchronized void setCycAccess(final CycAccess access) {
        this.access = access;
        this.madeCycAccess = false;
    }
    
    private synchronized void recreateCycAccess() throws UnknownHostException, IOException {
        final String hosName = this.getCycAccess().getHostName();
        final int port = this.getCycAccess().getBasePort();
        this.setCycAccess(new CycAccess(hosName, port));
        this.madeCycAccess = true;
    }
    
    private CycObject getUser() {
        return this.user;
    }
    
    public String getHost() {
        return this.getCycAccess().getHostName();
    }
    
    public int getPort() {
        return this.getCycAccess().getBasePort();
    }
    
    public String wrapCommandWithUser(final String command) {
        return wrapVariableBinding(command, SubLAPIHelper.THE_CYCLIST, this.getUser());
    }
    
    public static String wrapVariableBinding(final String command, final CycSymbol variable, final Object value) {
        try {
            return "(clet ((" + DefaultCycObject.cyclifyWithEscapeChars((Object)variable, true) + " " + getAPIString(value) + ")) " + command + ")";
        }
        catch (Exception e) {
            return command;
        }
    }
    
    public SubLWorker makeAsynchSubLWorker(final String command) {
        return this.makeAsynchSubLWorker(command, this.getMaxTimeoutMSecs());
    }
    
    public SubLWorker makeAsynchSubLWorker(String command, final long timeoutMsecs) {
        command = this.wrapCommandWithUser(command);
        final SubLWorker worker = (SubLWorker)new DefaultSubLWorker(command, this.getCycAccess(), timeoutMsecs);
        return worker;
    }
    
    public Object executeCommandSynchronously(final String command) throws IOException {
        return this.executeCommandSynchronously(command, this.getMaxTimeoutMSecs());
    }
    
    public Object executeCommandSynchronously(final String command, final long timeoutMsecs) throws IOException {
        return this.executeCommandSynchronouslyInt(command, timeoutMsecs, 0);
    }
    
    public Object executeCommandSynchronouslyInt(String command, final long timeoutMsecs, final int currentTry) throws IOException {
        command = this.wrapCommandWithUser(command);
        synchronized (System.out) {
            SubLAPIHelper.logger.log(Level.INFO, "About to execute command: {0}\nto server: {1}:{2}", new Object[] { command, this.getCycAccess().getHostName(), this.getCycAccess().getBasePort() });
        }
        Object result = null;
        try {
            final SubLWorkerSynch worker = (SubLWorkerSynch)new DefaultSubLWorkerSynch(command, this.getCycAccess(), timeoutMsecs);
            result = worker.getWork();
        }
        catch (CycApiServerSideException csse) {
            throw new CycApiServerSideException(csse.getMessage());
        }
        catch (CycApiClosedConnectionException expt) {
            if (currentTry >= 2) {
                throw expt;
            }
            this.recreateCycAccess();
            result = this.executeCommandSynchronouslyInt(command, timeoutMsecs, currentTry + 1);
        }
        synchronized (System.out) {
            SubLAPIHelper.logger.log(Level.FINE, "Got result: {0}", DefaultCycObject.cyclify(result));
        }
        return result;
    }
    
    public void setMaxTimeoutMSecs(final long maxTimeoutMSecs) {
        this.maxTimeoutMSecs = maxTimeoutMSecs;
    }
    
    public long getMaxTimeoutMSecs() {
        return this.maxTimeoutMSecs;
    }
    
    public static String makeSubLStmt(final CycSymbol function, final Object... params) {
        return makeSubLStmt(function.getSymbolName(), params);
    }
    
    public static String makeSubLStmt(final String functionName, final Object... params) {
        final StringBuilder buf = new StringBuilder(2048);
        buf.append("(").append(functionName);
        for (final Object param : params) {
            buf.append(" ").append(getAPIString(param));
        }
        buf.append(")");
        return buf.toString();
    }
    
    public static String makeSubLStmtWNartSubstitute(final String functionName, final Object... params) {
        final StringBuilder buf = new StringBuilder(2048);
        buf.append("(").append(functionName);
        for (final Object param : params) {
            buf.append(" (nart-substitute ").append(getAPIString(param)).append(")");
        }
        buf.append(")");
        return buf.toString();
    }
    
    public static AsIsTerm makeNestedSubLStmt(final CycSymbol function, final Object... params) {
        return makeNestedSubLStmt(function.getSymbolName(), params);
    }
    
    public static AsIsTerm makeNestedSubLStmt(final String functionName, final Object... params) {
        return new AsIsTerm(makeSubLStmt(functionName, params));
    }
    
    public static void setLoggingLevel(final Level newLevel) {
        SubLAPIHelper.logger.setLevel(newLevel);
    }
    
    public static void main(final String[] args) {
        SubLAPIHelper.logger.info("Starting");
        SubLAPIHelper thisObj = null;
        try {
            final CycConstant admin = new CycConstant("Administrator", new Guid("bd58aedc-9c29-11b1-9dad-c379636f7270"));
            thisObj = new SubLAPIHelper("localhost", 3660, (CycObject)admin);
            setLoggingLevel(Level.FINE);
            String command = makeSubLStmt("asdlfksjd", 1, 2, 3, 4);
            Object result = thisObj.executeCommandSynchronously(command);
            command = makeSubLStmt("list", new QuotedAsIsTerm("a"), new QuotedAsIsTerm("b"), new QuotedAsIsTerm("c"), admin);
            result = thisObj.executeCommandSynchronously(command);
        }
        catch (Exception e) {
            SubLAPIHelper.logger.log(Level.SEVERE, e.getMessage(), e);
        }
        finally {
            if (thisObj != null) {
                thisObj.close();
            }
            SubLAPIHelper.logger.info("Finished.");
            System.exit(0);
        }
    }
    
    static {
        THE_CYCLIST = CycObjectFactory.makeCycSymbol("*the-cyclist*");
        SubLAPIHelper.DEFAULT_MAX_TIMEOUT_MSECS = 10000L;
        logger = Logger.getLogger(SubLAPIHelper.class.toString());
        DEFAULT_LOGGING_LEVEL = Level.WARNING;
        SubLAPIHelper.logger.addHandler(new ConsoleHandler());
        SubLAPIHelper.logger.setUseParentHandlers(false);
        setLoggingLevel(SubLAPIHelper.DEFAULT_LOGGING_LEVEL);
    }
    
    public static class AsIsTerm
    {
        protected Object obj;
        
        public AsIsTerm(final Object obj) {
            this.obj = obj;
        }
        
        @Override
        public String toString() {
            return "" + this.obj;
        }
        
        public Object getObj() {
            return this.obj;
        }
    }
    
    public static final class QuotedAsIsTerm extends AsIsTerm
    {
        public QuotedAsIsTerm(final Object obj) {
            super(obj);
        }
        
        @Override
        public String toString() {
            return "(quote " + this.obj + ")";
        }
    }
    
    public static final class QuotedTerm extends AsIsTerm
    {
        public QuotedTerm(final Object obj) {
            super(obj);
        }
        
        @Override
        public String toString() {
            return "(quote " + DefaultCycObject.stringApiValue(this.obj) + ")";
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 110 ms
	
	Decompiled with Procyon 0.5.32.
*/