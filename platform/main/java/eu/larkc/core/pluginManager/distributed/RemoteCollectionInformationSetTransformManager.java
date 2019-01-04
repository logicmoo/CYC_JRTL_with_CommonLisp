package eu.larkc.core.pluginManager.distributed;

import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;



import eu.larkc.core.data.InformationSet;
import eu.larkc.core.data.SetOfStatements;
import eu.larkc.core.pluginManager.PluginManager;
import eu.larkc.core.pluginManager.distributed.RemotePluginManager.RemoteContainerStub;
import eu.larkc.core.pluginManager.local.queue.Queue;
import eu.larkc.core.query.SPARQLQuery;
import eu.larkc.plugin.Context;
import eu.larkc.plugin.Contract;
import eu.larkc.plugin.reason.Reasoner;
import eu.larkc.plugin.transform.InformationSetTransformer;

/**
 * LocalCollectionInformationSetTransformManager is a LocalPluginManager for InformationSetTransformer plugins
 * 
 * It will generate a Collection<InformationSet> on the output queue for each Collection<InformationSet> that comes in 
 * on the input stream
 * 
 * @author Mick Kerrigan, Barry Bishop
 */
public class RemoteCollectionInformationSetTransformManager extends RemotePluginManager <Collection<InformationSet>, Collection<InformationSet>> {
	
	/**
	 * The InformationSetTransformer plugin to be managed
	 */
	private final InformationSetTransformer mTransformer;

	/**
	 * Constructor thats takes the plugin to be manages, the input, and the output queues as input
	 * 
	 * @param transformer The InformationSetTransformer plugin to be managed
	 * @param inputQueue The queue from which input messages will come from the previous plugin in the pipeline 
	 * @param outputQueue The queue onto which output messages should be put to send them to the next plugin in the pipeline
	 * @param resourceURI The URI of the resource the job is sent to  
	 */
	public RemoteCollectionInformationSetTransformManager(InformationSetTransformer transformer, Queue<Collection<InformationSet>> inputQueue, Queue<Collection<InformationSet>> outputQueue, String resourceURI) {
		super(inputQueue, outputQueue, resourceURI);
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

					Collection<InformationSet> resource = getNextInput();

					if (resource == null) {
						putNextOutput(null);
						break;
					}
					
					Collection <InformationSet> transformedResources = new ArrayList <InformationSet> ();
					for (InformationSet is : resource){
						//transformedResources.add(mTransformer.transform(is, new Contract() {}, new Context() {}));
						transformedResources.add(runJob(mTransformer.getClass(), is, new Contract() {}, new Context() {}));						
					}

					putNextOutput(transformedResources);
				} 
				else if (controlMessage.equals(PluginManager.Message.STOP)) {
					break;
				}
			}
			stopPrevious();
		}
	}
	
	public InformationSet runJob(Class<?> klass, InformationSet is, Contract contract, Context context) {
		return (InformationSet) super.runJob(klass, is);
	}
	
	public static void main(String[] args) {
		runRemoteJob(new RemoteContainerStub() {
			@Override
			public Object invoke(ArrayList<Object> params) throws Exception {
				Class<?> transformerClass = (Class<?>) params.get(0);
				InformationSet is = (InformationSet) params.get(1);
				
				InformationSetTransformer transformer = (InformationSetTransformer) transformerClass.getConstructor().newInstance();
				return transformer.transform(is, new Contract() {}, new Context() {});
				
			}
		});
		/*
		try {
			System.out.println("Hallo from remote transformer");
		
			Map<String, String> properties = new HashMap<String, String>();
			properties.put("larkc.job.input", "input");
			
			File input = GAT.createFile("input");
			FileInputStream inputStream = GAT.createFileInputStream(input);
			ObjectInputStream oin = new ObjectInputStream(inputStream);
	
			Object parameters = oin.readObject();
			
			System.out.println(parameters);
			
						
		} catch (Exception e) {
			e.printStackTrace();
		}	
			*/
		
	}
	
	
}
