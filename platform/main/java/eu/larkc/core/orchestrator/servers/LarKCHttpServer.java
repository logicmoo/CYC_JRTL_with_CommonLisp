/*
   This file is part of the LarKC platform 
   http://www.larkc.eu/

   Copyright 2010 LarKC project consortium

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package eu.larkc.core.orchestrator.servers;

import static com.cyc.tool.subl.util.SubLFiles.*;

import java.net.InetSocketAddress;
import java.util.concurrent.Executor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;
import com.sun.net.httpserver.HttpServer;

/**
 * Simple executable to start HttpServer for HTTP request/response interaction.
 */
public class LarKCHttpServer extends SubLTranslatedFile {
    public static final SubLFile me = new LarKCHttpServer();
    private static final String myName = "eu.larkc.core.orchestrator.servers.LarKCHttpServer";

    public static final int PORT = 8000;
    public static final int BACKLOG = 0; // none
    public static final String URL_CONTEXT = "/sparql";

    /***
     * Specific executor, which creates SublThread instead of normal Thread.
     * @author Luka Bradesko
     */
    static class ThreadPerTaskExecutor implements Executor {
	@Override
	public void execute(Runnable r) {
	    SubLThread t = new SubLThread(r, "SPARQLServer");
	    t.start();
	}
    }

    /**
     * Main executable to run Sun's built-in JVM HTTP server.
     * 
    */
    public static SubLObject start_sparql_server() {
	Logger log = LoggerFactory.getLogger(LarKCHttpServer.class);
	try {
	    final HttpServer server = HttpServer.create(new InetSocketAddress(PORT), BACKLOG);
	    server.createContext(URL_CONTEXT, new SPARQLHandler());
	    server.setExecutor(new ThreadPerTaskExecutor()); // allow default executor to be created
	    server.start();
	    log.info("");
	    log.info("...LarKC SPARQL server started on port " + PORT + ".");
	} catch (Exception ex) {
	    ex.printStackTrace();
	}
	return null;
    }

    @Override
    public void declareFunctions() {
	declareFunction("start_sparql_server", "START-SPARQL-SERVER", 0, 0, false);
    }

    @Override
    public void initializeVariables() {
    }

    @Override
    public void runTopLevelForms() {
	//declareFunctions();	
	//System.out.println("Starting my first test server");
	//start_sparql_server();		
    }
}
