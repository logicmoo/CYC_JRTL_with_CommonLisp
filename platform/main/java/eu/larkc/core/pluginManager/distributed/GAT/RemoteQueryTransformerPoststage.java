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

import java.util.ArrayList;
import java.util.Collection;

import eu.larkc.core.gatresource.GATResource;
import eu.larkc.core.pluginManager.PluginManager;
import eu.larkc.core.pluginManager.local.queue.Queue;
import eu.larkc.core.query.Query;
import eu.larkc.plugin.transform.QueryTransformer;


/**
 * A particular implementation of the poststage functionality from a remote resource for the CollectionInformationTransformManager. 
 * 
 * @author Alexey Cheptsov
 *
 * @param <E> The Input type of the queue that the PluginManager should accept 
 * @param <F> The Output type of the queue that the PluginManager should produce
 */
public class RemoteQueryTransformerPoststage extends RemoteMPIPluginManager <String, Query> {
	
	/**
	 * The InformationSetTransformer plugin to be managed
	 */
	private final QueryTransformer mTransformer;

	/**
	 * Constructor thats takes the input and output queues, resource properties, and output ID as input
	 * 
	 * @param theInputQueue The queue from which input messages will come from the previous plugin in the pipeline 
	 * @param theOutputQueue The queue onto which output messages should be put to send them to the next plugin in the pipeline 
	 * @param resource The GATResource instance which describes the resource parameters
	 * @param output_ID The ID where the output data is poststaged from  
	 */
	public RemoteQueryTransformerPoststage(QueryTransformer transformer, Queue<String> inputQueue, Queue<Query> outputQueue, GATResource resource, String outputID) {
		super(inputQueue, outputQueue, resource, outputID);
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
			super("Information Set Transformer");
		}

		public void run() {
			for (;;) {
				PluginManager.Message controlMessage = getNextControlMessage();

				if (controlMessage.equals(PluginManager.Message.NEXT)) {
					alertPrevious();

					String outputDataID = getNextInput();  //this is cumbersome as we actually pass the outputDataID through the UI
														   //in the class constructor (in the decider)
					
					if (outputDataID == null) {
						putNextOutput(null);
						break;
					}
	
					ArrayList<Object> result = new ArrayList<Object>();
					result = doPoststage();	
					
					Collection<Query> transformedResources = (Collection<Query>) result.get(0);
					for (Query transformedQuery : transformedResources)
							putNextOutput(transformedQuery);
				} 
				else if (controlMessage.equals(PluginManager.Message.STOP)) {
					break;
				}
			}
			stopPrevious();
		}
	}
	
	
	
}
