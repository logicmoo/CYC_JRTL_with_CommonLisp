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
package eu.larkc.core.pluginManager.distributed.GAT;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import eu.larkc.core.data.InformationSet;
import eu.larkc.core.data.SetOfStatements;
import eu.larkc.core.pluginManager.PluginManager;
import eu.larkc.core.pluginManager.distributed.GAT.RemotePluginManager.RemoteContainerStub;
import eu.larkc.core.pluginManager.local.SimpleContract;
import eu.larkc.core.pluginManager.local.queue.Queue;
import eu.larkc.core.query.Query;
import eu.larkc.core.query.SPARQLQuery;
import eu.larkc.plugin.Context;
import eu.larkc.plugin.Contract;
import eu.larkc.plugin.reason.Reasoner;
import eu.larkc.plugin.transform.InformationSetTransformer;
import eu.larkc.plugin.transform.QueryTransformer;
import eu.larkc.core.gatresource.GATResource;

/**
 * A particular implementation of prestaging functionality to the remote resource for the CollectionInformationTransformManager. 
 * 
 * @author Alexey Cheptsov
 *
 * @param <E> The Input type of the queue that the PluginManager should accept 
 * @param <F> The Output type of the queue that the PluginManager should produce
 */
public class RemoteQueryTransformerPrestage extends RemoteMPIPluginManager <Query, String> {
	
	/**
	 * The InformationSetTransformer plugin to be managed
	 */
	private final QueryTransformer mTransformer;

	/**
	 * Constructor thats takes the input and output queues, resource properties, and input ID as input
	 * 
	 * @param theInputQueue The queue from which input messages will come from the previous plugin in the pipeline 
	 * @param theOutputQueue The queue onto which output messages should be put to send them to the next plugin in the pipeline 
	 * @param resource The GATResource instance which describes the resource parameters
	 * @param input_ID The input ID for the prestaged data (disk file name)  
	 */
	public RemoteQueryTransformerPrestage(QueryTransformer transformer, Queue<Query> inputQueue, Queue<String> outputQueue, GATResource resource, String inputID) {
		super(inputQueue, outputQueue, resource, inputID);
		mTransformer = transformer;
		super.setThread(new TransformerThread());
	}

	/**
	 * The Thread within which the InformationSetTransformer Management occurs
	 * 
	 * @author Mick Kerrigan, Barry Bishop
	 */
	class TransformerThread extends Thread {
		TransformerThread() {
			super("Query Transformer");
		}

		public void run() {
			mTransformer.initialise();
			for (;;) {
				PluginManager.Message controlMessage = getNextControlMessage();

				if (controlMessage.equals(PluginManager.Message.NEXT)) {
					alertPrevious();

					Query resource = getNextInput();

					if (resource == null) {
						putNextOutput(null);
						break;
					}
					
					String DataInputID = doPrestage(mTransformer.getClass(), resource);//, new Contract() {}, new Context() {});
									
					putNextOutput(DataInputID);
				} 
				else if (controlMessage.equals(PluginManager.Message.STOP)) {
					break;
				}
			}
			stopPrevious();
			mTransformer.shutdown();
		}
	}
	
	
	
}
