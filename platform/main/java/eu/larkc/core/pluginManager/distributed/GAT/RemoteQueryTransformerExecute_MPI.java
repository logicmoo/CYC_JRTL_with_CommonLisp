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
import java.util.Set;

import eu.larkc.core.data.InformationSet;
import eu.larkc.core.gatresource.GATResource;
import eu.larkc.core.pluginManager.PluginManager;
import eu.larkc.core.pluginManager.local.queue.Queue;
import eu.larkc.core.query.Query;
import eu.larkc.plugin.Context;
import eu.larkc.plugin.Contract;
import eu.larkc.plugin.transform.QueryTransformer;
import mpi.MPI;


/**
 * A particular implementation of the execution on the remote resource for the CollectionInformationTransformManager. 
 * 
 * @author Alexey Cheptsov
 *
 * @param <E> The Input type of the queue that the PluginManager should accept 
 * @param <F> The Output type of the queue that the PluginManager should produce
 */
public class RemoteQueryTransformerExecute_MPI extends RemoteMPIPluginManager <String, String> {
	
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
	 * @param output_ID The ID where the output data is to be stored  
	 */
	public RemoteQueryTransformerExecute_MPI(QueryTransformer transformer, Queue<String> inputQueue, Queue<String> outputQueue, GATResource resource, String outputID) {
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

					String inputDataID = getNextInput();
					
					if (inputDataID == null) {
						putNextOutput(null);
						break;
					}
	
					String outputDataID = runJob(mTransformer.getClass(), inputDataID, new Contract() {}, new Context() {});	
										
					putNextOutput(outputDataID);
				} 
				else if (controlMessage.equals(PluginManager.Message.STOP)) {
					break;
				}
			}
			stopPrevious();
		}
	}
	
	public String runJob(Class<?> klass, InformationSet is, Contract contract, Context context) {
		return (String) super.runJob(klass, is);
	}
	
	public static void main(String[] args) {
		
		MPI.Init(args);	
		
		runRemoteJob(new RemoteContainerStub() {
			@Override
			public ArrayList<Object> invoke(ArrayList<Object> params) throws Exception {
						

					Class<?> transformerClass = (Class<?>) params.get(0);
					Query query_input = (Query) params.get(1);
					Collection<Query> query_output = new ArrayList <Query> ();
					
					ArrayList<Object> result = new ArrayList<Object>();
					
					QueryTransformer transformer = (QueryTransformer) transformerClass.getConstructor().newInstance();
							
					Set<Query> transformedQuerySet = transformer.transform(query_input, new Contract() {}, new Context() {});
					
					if (MPI.COMM_WORLD.Rank()==0)
						for (Query transformedQuery : transformedQuerySet){
							query_output.add(transformedQuery);
						}
					
					result.add(query_output);
						
				return result;
			}
		});
		
		
		MPI.Finalize();
	}
	
}
