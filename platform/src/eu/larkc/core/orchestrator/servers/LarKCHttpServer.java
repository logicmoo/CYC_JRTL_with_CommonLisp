package eu.larkc.core.orchestrator.servers;


import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;
import com.sun.net.httpserver.HttpServer;
import java.net.InetSocketAddress;
import java.util.concurrent.Executor;

import static com.cyc.tool.subl.util.SubLFiles.declareFunction;


/**
 * Simple executable to start HttpServer for HTTP request/response interaction.
 */
public class LarKCHttpServer extends SubLTranslatedFile
{
	public static final SubLFile me = new LarKCHttpServer();
	private static final String myName = "eu.larkc.core.orchestrator.servers.LarKCHttpServer";
	
	public static final int PORT = 8000;
	public static final int BACKLOG = 0;   // none
	public static final String URL_CONTEXT = "/sparql";

	/***
	 * Specific executor, which creates SublThread instead of normal Thread.
	 * @author Luka Bradesko
	 */
	static class ThreadPerTaskExecutor implements Executor {
	     public void execute(Runnable r) {
	    	 SubLThread t = new SubLThread(r,"SPARQLServer");
	         t.start();
	     }
	 }
   
	/**
	 * Main executable to run Sun's built-in JVM HTTP server.
	 * 
	*/
	public static SubLObject start_sparql_server() 
	{
		try{
	      final HttpServer server = HttpServer.create(new InetSocketAddress(PORT), BACKLOG);
	      server.createContext(URL_CONTEXT, new SPARQLHandler());
	      server.setExecutor(new ThreadPerTaskExecutor()); // allow default executor to be created
	      server.start();
	      System.out.println("");
	      System.out.println("...LarKC SPARQL server started on port "+PORT + ".");
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
		return null;
	}

	 
	public void declareFunctions() {
	    declareFunction(myName, "start_sparql_server", "START-SPARQL-SERVER", 0, 0, false);
	}

	 
	public void initializeVariables() {
	}
	 
	public void runTopLevelForms() {
		//declareFunctions();	
		//System.out.println("Starting my first test server");
		//start_sparql_server();		
	}
}
