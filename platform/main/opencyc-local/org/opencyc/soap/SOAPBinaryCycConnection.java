package org.opencyc.soap;

import org.opencyc.cycobject.CycSymbol;
import org.opencyc.util.Base64;
import org.opencyc.api.CycLeaseManager;
import java.util.Map;
import java.net.UnknownHostException;
import java.io.InputStream;
import java.rmi.RemoteException;
import javax.xml.rpc.ServiceException;
import javax.xml.rpc.ParameterMode;

import org.apache.axis.encoding.XMLType;
import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.opencyc.api.CycApiServerSideException;
import org.opencyc.api.DefaultSubLWorkerSynch;
import org.opencyc.api.CycObjectFactory;
import org.opencyc.api.SubLWorkerEvent;
import org.opencyc.api.SubLWorkerStatus;
import org.opencyc.api.CycConnection;
import org.opencyc.api.SubLWorkerSynch;
import org.opencyc.api.SubLWorker;
import org.opencyc.util.TimeOutException;
import org.opencyc.cycobject.CycList;
import org.opencyc.api.CycApiException;
import java.io.IOException;
import java.net.MalformedURLException;
import org.opencyc.util.Log;
import java.net.URL;
import org.opencyc.api.CycAccess;
import org.opencyc.util.Timer;
import java.util.UUID;
import org.opencyc.api.CycConnectionInterface;

public class SOAPBinaryCycConnection implements CycConnectionInterface
{
    public static final int API_TRACE_NONE = 0;
    public static final int API_TRACE_MESSAGES = 1;
    public static final int API_TRACE_DETAILED = 2;
    public static final int SOAP_MODE = 3;
    private UUID uuid;
    private int trace;
    private static final Timer notimeout;
    private CycAccess cycAccess;
    private boolean quotedStrings;
    private URL endpointURL;
    private static int apiRequestId;
    private String myClientName;
    private String hostName;
    private int basePort;
    
    public SOAPBinaryCycConnection() {
        this.trace = 0;
        this.myClientName = "api client";
        try {
            this.endpointURL = new URL("http://localhost:8080/axis/services/CycSOAPService");
        }
        catch (MalformedURLException e) {
            Log.current.errorPrintln(e.getMessage());
            Log.current.printStackTrace((Exception)e);
            System.exit(1);
        }
        this.uuid = UUID.randomUUID();
    }
    
    public SOAPBinaryCycConnection(final URL endpointURL, final String hostName, final int basePort, final CycAccess cycAccess) throws IOException, CycApiException {
        this.trace = 0;
        this.myClientName = "api client";
        this.endpointURL = endpointURL;
        this.cycAccess = cycAccess;
        this.hostName = hostName;
        this.basePort = basePort;
        this.uuid = UUID.randomUUID();
    }
    
    public Object[] converse(final Object message) throws IOException, CycApiException {
        return this.converse(message, SOAPBinaryCycConnection.notimeout);
    }
    
    public Object[] converse(final Object message, final Timer timeout) throws IOException, TimeOutException, CycApiException {
        CycList messageCycList;
        if (message instanceof CycList) {
            messageCycList = (CycList)message;
        }
        else {
            if (!(message instanceof String)) {
                throw new CycApiException("Invalid class for message " + message);
            }
            if (this.cycAccess == null) {
                throw new RuntimeException("CycAccess is required to process commands in string form");
            }
            messageCycList = this.cycAccess.makeCycList((String)message);
        }
        messageCycList = this.substituteForBackquote(messageCycList, timeout);
        return this.converseBinary(messageCycList, timeout);
    }
    
    public void converseBinary(final SubLWorker worker) throws IOException, TimeOutException, CycApiException {
        if (worker instanceof SubLWorkerSynch && CycConnection.inAWTEventThread()) {
            throw new CycApiException("Invalid attempt to communicate with Cyc from the AWT event thread.\n\n" + worker);
        }
        new SubLWorkerProcessor(worker).run();
    }
    
    public void setMyClientName(final String myClientName) {
        this.myClientName = myClientName;
    }
    
    public String getMyClientname() {
        return this.myClientName;
    }
    
    public static synchronized Integer nextApiRequestId() {
        return new Integer(++SOAPBinaryCycConnection.apiRequestId);
    }
    
    public void close() {
    }
    
    public int getTrace() {
        return this.trace;
    }
    
    public void setTrace(final int trace) {
        this.trace = trace;
    }
    
    public void traceOn() {
        this.trace = 1;
    }
    
    public void traceOnDetailed() {
        this.trace = 2;
    }
    
    public void traceOff() {
        this.trace = 0;
    }
    
    public String connectionInfo() {
        return "Cyc API Web Service at " + this.endpointURL.toString();
    }
    
    public UUID getUuid() {
        return null;
    }
    
    public int getBasePort() {
        return this.basePort;
    }
    
    public int getHttpPort() {
        return this.basePort + 2;
    }
    
    public String getHostName() {
        return this.hostName;
    }
    
    public void cancelCommunication(final SubLWorker worker) throws IOException {
        final Integer id = worker.getId();
        if (id < 0) {
            return;
        }
        final String command = "(fif (terminate-active-task-process " + worker.getId() + " \"" + this.uuid + "\" " + ":cancel" + ") '(ignore) '(ignore))";
        this.converse(this.cycAccess.makeCycList(command));
    }
    
    public void abortCommunication(final SubLWorker worker) throws IOException {
        final Integer id = worker.getId();
        if (id < 0) {
            return;
        }
        try {
            final String command = "(fif (terminate-active-task-process " + worker.getId() + " \"" + this.uuid + "\" " + ":abort" + ") '(ignore) '(ignore))";
            this.converse(this.cycAccess.makeCycList(command));
        }
        finally {
            worker.fireSubLWorkerTerminatedEvent(new SubLWorkerEvent(worker, SubLWorkerStatus.ABORTED_STATUS, (Exception)null));
        }
    }
    
    public int getConnectionType() {
        return 2;
    }
    
    protected CycList substituteForBackquote(final CycList messageCycList, final Timer timeout) throws IOException, CycApiException {
        if (!messageCycList.treeContains((Object)CycObjectFactory.backquote)) {
            return messageCycList;
        }
        final CycList substituteCycList = new CycList();
        substituteCycList.add((Object)CycObjectFactory.makeCycSymbol("read-from-string"));
        substituteCycList.add((Object)messageCycList.cyclify());
        final Object[] response = this.converseBinary(substituteCycList, timeout);
        if (response[0].equals(Boolean.TRUE) && response[1] instanceof CycList) {
            final CycList backquoteExpression = (CycList)response[1];
            return backquoteExpression.subst((Object)CycObjectFactory.makeCycSymbol("api-bq-list"), (Object)CycObjectFactory.makeCycSymbol("bq-list"));
        }
        throw new CycApiException("Invalid backquote substitution in " + messageCycList + "\nstatus" + response[0] + "\nmessage " + response[1]);
    }
    
    public Object[] converseBinary(final CycList message, final Timer timeout) throws IOException, TimeOutException, CycApiException {
        final DefaultSubLWorkerSynch worker = new DefaultSubLWorkerSynch(message, this.cycAccess);
        final Object[] result = new Object[2];
        try {
            result[1] = worker.getWork();
        }
        catch (IOException xcpt) {
            throw xcpt;
        }
        catch (TimeOutException xcpt2) {
            throw xcpt2;
        }
        catch (CycApiServerSideException xcpt3) {
            result[0] = Boolean.FALSE;
            result[1] = xcpt3.getMessage();
            return result;
        }
        catch (CycApiException xcpt4) {
            throw xcpt4;
        }
        catch (Exception xcpt5) {
            throw new RuntimeException(xcpt5);
        }
        result[0] = ((worker.getStatus() == SubLWorkerStatus.FINISHED_STATUS) ? Boolean.TRUE : Boolean.FALSE);
        return result;
    }
    
    private String remoteBinarySubLInteractorAtHostPort(final String base64SubLRequest, final String hostname, final String port) throws ServiceException, MalformedURLException, RemoteException {
        final String methodName = "binarySubLInteractorAtHostPort";
        final Service service = new Service();
        final Call call = (Call)service.createCall();
        call.setTargetEndpointAddress(this.endpointURL);
        call.setOperationName("binarySubLInteractorAtHostPort");
        call.addParameter("base64SubLRequest", XMLType.XSD_STRING, ParameterMode.IN);
        call.addParameter("hostname", XMLType.XSD_STRING, ParameterMode.IN);
        call.addParameter("port", XMLType.XSD_STRING, ParameterMode.IN);
        call.setReturnType(XMLType.XSD_STRING);
        return (String)call.invoke(new Object[] { base64SubLRequest, hostname, port });
    }
    
    private void helloWorld() throws ServiceException, MalformedURLException, RemoteException {
        final String methodName = "getHelloWorldMessage";
        final Service service = new Service();
        final Call call = (Call)service.createCall();
        call.setTargetEndpointAddress(this.endpointURL);
        call.setOperationName("getHelloWorldMessage");
        call.addParameter("name", XMLType.XSD_STRING, ParameterMode.IN);
        call.setReturnType(XMLType.XSD_STRING);
        final String result = (String)call.invoke(new Object[] { "SOAP Client" });
        Log.current.println(result);
    }
    
    public void setupNewCommConnection(final InputStream is) throws IOException, UnknownHostException, CycApiException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public Map<String, CycLeaseManager> getCycLeaseManagerMap() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public void setCycLeaseManagerMap(final Map<String, CycLeaseManager> cycLeaseManagerMap) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public Map<InputStream, CycLeaseManager> getCycLeaseManagerCommMap() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public void setCycLeaseManagerCommMap(final Map<InputStream, CycLeaseManager> cycLeaseManagerCommMap) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public boolean connectedToStaticCyc() {
        return true;
    }
    
    public static void main(final String[] args) {
        Log.makeLog("SOAPBinaryCycConnection.log");
        try {
            SOAPBinaryCycConnection soapBinaryCycConnection = new SOAPBinaryCycConnection();
            soapBinaryCycConnection.setTrace(1);
            final Base64 base64 = new Base64();
            Log.current.println("Trying helloWorld");
            soapBinaryCycConnection.helloWorld();
            final CycList query = new CycList();
            query.add((Object)CycObjectFactory.makeCycSymbol("+"));
            query.add((Object)new Integer(1));
            query.add((Object)new Integer(1));
            Log.current.println("binary query=" + query.toString());
            String base64Query = base64.encodeCycObject((Object)query, soapBinaryCycConnection.trace);
            final String hostname = "localhost";
            final String port = "3600";
            String base64Response = soapBinaryCycConnection.remoteBinarySubLInteractorAtHostPort(base64Query, "localhost", "3600");
            Object cycObject = base64.decodeCycObject(base64Response, soapBinaryCycConnection.trace);
            Log.current.println("result=" + cycObject);
            query.add((Object)new Integer(1));
            Log.current.println("binary query=" + query.toString());
            base64Query = base64.encodeCycObject((Object)query, soapBinaryCycConnection.trace);
            base64Response = soapBinaryCycConnection.remoteBinarySubLInteractorAtHostPort(base64Query, "localhost", "3600");
            cycObject = base64.decodeCycObject(base64Response, soapBinaryCycConnection.trace);
            Log.current.println("result=" + cycObject);
            final CycList errorQuery = new CycList();
            errorQuery.add((Object)CycObjectFactory.makeCycSymbol("an-error"));
            base64Query = base64.encodeCycObject((Object)errorQuery, soapBinaryCycConnection.trace);
            base64Response = soapBinaryCycConnection.remoteBinarySubLInteractorAtHostPort(base64Query, "localhost", "3600");
            Log.current.println("error=" + base64.decodeCycObject(base64Response, soapBinaryCycConnection.trace));
            final CycAccess cycAccess = new CycAccess(new URL("http://localhost:8080/axis/services/CycSOAPService"), "localhost", 3600);
            cycAccess.traceOn();
            Log.current.println("CycAccess created");
            soapBinaryCycConnection = (SOAPBinaryCycConnection)cycAccess.getCycConnection();
            Log.current.println("Trying helloWorld");
            soapBinaryCycConnection.helloWorld();
            Log.current.println("cycAccess result=" + cycAccess.converseObject((Object)query));
            final Object[] response = soapBinaryCycConnection.converse(query);
            Log.current.println("response[0]=" + response[0].toString());
            Log.current.println("response[1]=" + response[1].toString());
            CycList request = new CycList();
            request.add((Object)CycObjectFactory.makeCycSymbol("list"));
            request.add((Object)":none");
            request.add((Object)CycObjectFactory.makeCycSymbol(":none"));
            Log.current.println("cycAccess request=" + request.toString());
            Log.current.println("cycAccess result=" + cycAccess.converseObject((Object)request));
            request = new CycList();
            request.add((Object)CycObjectFactory.makeCycSymbol("find-constant"));
            request.add((Object)"Brazil");
            Log.current.println("cycAccess request=" + request.toString());
            Log.current.println("cycAccess result=" + cycAccess.converseObject((Object)request));
        }
        catch (Exception e) {
            Log.current.errorPrintln(e.getMessage());
            Log.current.printStackTrace(e);
        }
    }
    
    static {
        notimeout = new Timer();
        SOAPBinaryCycConnection.apiRequestId = 0;
    }
    
    protected class SubLWorkerProcessor extends Thread
    {
        final SubLWorker worker;
        
        public SubLWorkerProcessor(final SubLWorker worker) {
            assert worker != null : "worker must not be null";
            this.worker = worker;
        }
        
        @Override
        public void run() {
            final CycSymbol taskProcessorRequestSymbol = CycObjectFactory.makeCycSymbol("task-processor-request");
            Integer id = null;
            final Base64 base64 = new Base64();
            CycList taskProcessorRequest = null;
            if (this.worker.getSubLCommand().first().equals(taskProcessorRequestSymbol)) {
                taskProcessorRequest = this.worker.getSubLCommand();
                id = (Integer)this.worker.getSubLCommand().third();
            }
            else {
                id = SOAPBinaryCycConnection.nextApiRequestId();
                taskProcessorRequest = new CycList();
                taskProcessorRequest.add((Object)taskProcessorRequestSymbol);
                taskProcessorRequest.add((Object)this.worker.getSubLCommand());
                taskProcessorRequest.add((Object)id);
                taskProcessorRequest.add((Object)new Integer(CycConnection.DEFAULT_PRIORITY));
                taskProcessorRequest.add((Object)SOAPBinaryCycConnection.this.myClientName);
                taskProcessorRequest.add((Object)CycObjectFactory.nil);
                taskProcessorRequest.add((Object)SOAPBinaryCycConnection.this.uuid.toString());
            }
            final SubLWorkerEvent event = new SubLWorkerEvent(this.worker, id);
            this.worker.fireSubLWorkerStartedEvent(event);
            final CycList soapApiRequest = new CycList();
            soapApiRequest.add((Object)CycObjectFactory.makeCycSymbol("return-whole-task-processor-response"));
            soapApiRequest.add((Object)taskProcessorRequest);
            String base64Response = null;
            try {
                final String base64SubLRequest = base64.encodeCycObject((Object)soapApiRequest, SOAPBinaryCycConnection.this.trace);
                base64Response = SOAPBinaryCycConnection.this.remoteBinarySubLInteractorAtHostPort(base64SubLRequest, SOAPBinaryCycConnection.this.cycAccess.getHostName(), Integer.toString(SOAPBinaryCycConnection.this.cycAccess.getBasePort()));
                final Object response = base64.decodeCycObject(base64Response, SOAPBinaryCycConnection.this.trace);
                final Object[] answer = { null, null };
                if (response instanceof CycList && ((CycList)response).size() > 0 && ((CycList)response).first() instanceof CycSymbol && ((CycList)response).first().toString().equals("CYCAPIEXCEPTION")) {
                    answer[0] = Boolean.FALSE;
                    answer[1] = response;
                    this.worker.fireSubLWorkerTerminatedEvent(new SubLWorkerEvent(this.worker, SubLWorkerStatus.EXCEPTION_STATUS, (Exception)new CycApiServerSideException(((CycList)response).second().toString())));
                    return;
                }
                answer[0] = Boolean.TRUE;
                answer[1] = response;
                final Object status = answer[0];
                final CycList taskProcessorResponse = (CycList)answer[1];
                assert id.equals(taskProcessorResponse.get(2)) : "returned id " + taskProcessorResponse.get(2).toString() + " must equal sent id " + id.toString();
                final Object actualResponse = taskProcessorResponse.get(5);
                final Object taskStatus = taskProcessorResponse.get(6);
                boolean finished = taskProcessorResponse.get(7) != CycObjectFactory.nil;
                if (taskStatus == CycObjectFactory.nil) {
                    this.worker.fireSubLWorkerDataAvailableEvent(new SubLWorkerEvent(this.worker, actualResponse, -1.0f));
                    if (finished) {
                        this.worker.fireSubLWorkerTerminatedEvent(new SubLWorkerEvent(this.worker, SubLWorkerStatus.FINISHED_STATUS, (Exception)null));
                    }
                }
                else {
                    finished = true;
                    if (taskStatus instanceof String) {
                        this.worker.fireSubLWorkerTerminatedEvent(new SubLWorkerEvent(this.worker, SubLWorkerStatus.EXCEPTION_STATUS, (Exception)new CycApiServerSideException(taskStatus.toString())));
                    }
                    else if (taskStatus instanceof CycSymbol) {
                        this.worker.fireSubLWorkerTerminatedEvent(new SubLWorkerEvent(this.worker, SubLWorkerStatus.CANCELED_STATUS, (Exception)null));
                    }
                }
            }
            catch (Exception xcpt) {
                Log.current.errorPrintln(xcpt.getMessage());
                Log.current.printStackTrace(xcpt);
            }
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 165 ms
	
	Decompiled with Procyon 0.5.32.
*/