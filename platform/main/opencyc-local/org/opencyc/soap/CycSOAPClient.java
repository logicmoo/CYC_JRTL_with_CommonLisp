package org.opencyc.soap;

import java.rmi.RemoteException;
import java.net.MalformedURLException;
import javax.xml.rpc.ServiceException;
import javax.xml.rpc.ParameterMode;
import org.apache.axis.encoding.XMLType;
import java.net.URL;
import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.opencyc.util.Log;

public class CycSOAPClient
{
    public String endpointURL;
    
    public CycSOAPClient() {
        this.endpointURL = "http://localhost:8080/axis/services/CycSOAPService";
    }
    
    public static void main(final String[] args) {
        Log.makeLog("Cyc-SOAP-client.log");
        final CycSOAPClient cycSOAPClient = new CycSOAPClient();
        try {
            cycSOAPClient.helloWorld();
            for (int i = 0; i < 10; ++i) {
                Log.current.print(i + 1 + ". ");
                Log.current.println(cycSOAPClient.remoteSubLInteractor("(isa #$TransportationDevice)"));
            }
            Log.current.println("categorizeEntity Service");
            final String entityString = "Osama Bin Laden";
            final String generalEntityKindString = "PERSON";
            Log.current.println("categorizeEntity(\"" + entityString + "\", \"" + generalEntityKindString + "\")");
            String response = cycSOAPClient.categorizeEntity(entityString, generalEntityKindString);
            Log.current.println("response=" + response);
            final String ontologyString = "AXISConstant";
            Log.current.println("categorizeEntityWithinOntology Service");
            Log.current.println("categorizeEntityWithinOntology(\"" + entityString + "\", \"" + generalEntityKindString + "\", \"" + ontologyString + "\")");
            response = cycSOAPClient.categorizeEntityWithinOntology(entityString, generalEntityKindString, ontologyString);
            Log.current.println("response=" + response);
        }
        catch (Exception e) {
            Log.current.errorPrintln(e.getMessage());
            Log.current.printStackTrace(e);
        }
    }
    
    public void helloWorld() throws ServiceException, MalformedURLException, RemoteException {
        final String methodName = "getHelloWorldMessage";
        final Service service = new Service();
        final Call call = (Call)service.createCall();
        call.setTargetEndpointAddress(new URL(this.endpointURL));
        call.setOperationName(methodName);
        call.addParameter("echo", XMLType.XSD_STRING, ParameterMode.IN);
        call.setReturnType(XMLType.XSD_STRING);
        final String result = (String)call.invoke(new Object[] { "AXIS" });
        Log.current.println(result);
    }
    
    public String remoteSubLInteractor(final String subLRequest) throws ServiceException, MalformedURLException, RemoteException {
        final String methodName = "subLInteractor";
        final Service service = new Service();
        final Call call = (Call)service.createCall();
        call.setTargetEndpointAddress(new URL(this.endpointURL));
        call.setOperationName(methodName);
        call.addParameter("subLRequest", XMLType.XSD_STRING, ParameterMode.IN);
        call.setReturnType(XMLType.XSD_STRING);
        return (String)call.invoke(new Object[] { subLRequest });
    }
    
    public String categorizeEntity(final String entityString, final String generalEntityKindString) throws ServiceException, MalformedURLException, RemoteException {
        final String methodName = "categorizeEntity";
        final Service service = new Service();
        final Call call = (Call)service.createCall();
        call.setTargetEndpointAddress(new URL(this.endpointURL));
        call.setOperationName(methodName);
        call.addParameter("entityString", XMLType.XSD_STRING, ParameterMode.IN);
        call.addParameter("generalEntityKindString", XMLType.XSD_STRING, ParameterMode.IN);
        call.setReturnType(XMLType.XSD_STRING);
        return (String)call.invoke(new Object[] { entityString, generalEntityKindString });
    }
    
    public String categorizeEntityWithinOntology(final String entityString, final String generalEntityKindString, final String ontologyString) throws ServiceException, MalformedURLException, RemoteException {
        final String methodName = "categorizeEntityWithinOntology";
        final Service service = new Service();
        final Call call = (Call)service.createCall();
        call.setTargetEndpointAddress(new URL(this.endpointURL));
        call.setOperationName(methodName);
        call.addParameter("entityString", XMLType.XSD_STRING, ParameterMode.IN);
        call.addParameter("generalEntityKindString", XMLType.XSD_STRING, ParameterMode.IN);
        call.addParameter("ontologyString", XMLType.XSD_STRING, ParameterMode.IN);
        call.setReturnType(XMLType.XSD_STRING);
        return (String)call.invoke(new Object[] { entityString, generalEntityKindString, ontologyString });
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 47 ms
	
	Decompiled with Procyon 0.5.32.
*/