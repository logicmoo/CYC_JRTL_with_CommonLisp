package eu.larkc.core.pluginManager.local;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import eu.larkc.core.data.InformationSet;
import eu.larkc.core.pluginManager.PluginManager;
import eu.larkc.core.pluginManager.local.queue.Queue;
import eu.larkc.plugin.Context;
import eu.larkc.plugin.Contract;
import eu.larkc.plugin.transform.InformationSetTransformer;

/**
 * LocalCollectionInformationSetTransformManager is a LocalPluginManager for InformationSetTransformer plugins
 * 
 * It will generate a Collection<InformationSet> on the output queue for each Collection<InformationSet> that comes in 
 * on the input stream
 * 
 * @author Mick Kerrigan, Barry Bishop
 */
public class LocalCollectionInformationSetTransformManager extends LocalPluginManager <Collection<InformationSet>, Collection<InformationSet>> {
	
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
	 */
	public LocalCollectionInformationSetTransformManager(InformationSetTransformer transformer, Queue<Collection<InformationSet>> inputQueue, Queue<Collection<InformationSet>> outputQueue) {
		super(inputQueue, outputQueue);
		mTransformer = transformer;
		super.setThread(new TransformerThread());
	}

	/**
	 * The Thread within which the InformationSetTransformer Management occurs
	 * 
	 * @author Mick Kerrigan, Barry Bishop
	 */
	class TransformerThread extends Thread 
	{
		TransformerThread() 
		{
			super("Information Set Transformer");
		}

		@Override
		public void run() 
		{
			mTransformer.initialise();
			Context context = mTransformer.createContext();
			for (;;) 
			{
				PluginManager.Message controlMessage = getNextControlMessage();

				if (controlMessage.equals(PluginManager.Message.NEXT)) 
				{
					alertPrevious();

					Collection<InformationSet> resource = getNextInput();
					
					if (resource == null) {
						putNextOutput(null);
						break;
					}
					
					System.out.println("Size: "+resource.size());
					
					Collection <InformationSet> transformedResources = new ArrayList <InformationSet> ();
					
					boolean POOL_THREAD_FLAG=false;
					
					if( (resource.size() > 1) && POOL_THREAD_FLAG==true )
					{
						System.out.println("[DEBUG]: Size greater than 1 -> trying to run the transformation in parallel");
						
						Collection<Callable<InformationSet>> collection = new ArrayList<Callable<InformationSet>>();
						Callable<InformationSet> callable = null;
						ExecutorService threadPoolExecutor = Executors.newFixedThreadPool(resource.size());
						
						for (InformationSet is : resource)
						{
							callable = new Transformation(is, new SimpleContract(), context);
							collection.add(callable);
						}
						
						Collection<Future<InformationSet>> futures = null;
						
						try 
						{
							futures = threadPoolExecutor.invokeAll(collection);
						} 
						catch (InterruptedException e) 
						{
							//TODO: To handle
							//e.printStackTrace();
						}
						
						threadPoolExecutor.shutdown();
						
						for(Future<InformationSet> trans: futures) 
						{
							try 
							{
								InformationSet iset = trans.get();
								
								if (iset != null)
								{
									transformedResources.add(iset);
								}
							} 
							catch (InterruptedException e) 
							{
								//TODO: To handle
								//e.printStackTrace();
							} 
							catch (ExecutionException e) 
							{
								//TODO: To handle
								//e.printStackTrace();
							}
						}
					}
					else
					{
						System.out.println("[DEBUG]: Thread pool is not activated");
						for (InformationSet is : resource)
    					{
							transformedResources.add(mTransformer.transform(is, new Contract() {}, context));
						}
					}
					
					putNextOutput(transformedResources);
				} 
				else if (controlMessage.equals(PluginManager.Message.STOP)) 
				{
					break;
				}
			}
			stopPrevious();
			mTransformer.shutdown();
		}
	}
	
	class Transformation implements Callable<InformationSet>
	{
		private InformationSet is;
		private Contract co;
		private Context cx;

		public Transformation(InformationSet is, Contract co, Context cx)
		{
			this.is = is;
			this.co = co;
			this.cx = cx;
		}
		
		@Override
		public InformationSet call()
		{
			return mTransformer.transform(is, co, cx);
		}
	}
}
