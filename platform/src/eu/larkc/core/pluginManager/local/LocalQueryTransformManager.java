package eu.larkc.core.pluginManager.local;

import eu.larkc.core.pluginManager.PluginManager;
import eu.larkc.core.pluginManager.local.queue.Queue;
import eu.larkc.core.query.Query;
import eu.larkc.plugin.Context;
import eu.larkc.plugin.transform.QueryTransformer;

/**
 * LocalQueryTransformManager is a LocalPluginManager for QueryTransformer plugins
 * 
 * It will generate an Query on the output queue for each Query that comes in 
 * on the input stream
 * 
 * @author Mick Kerrigan, Barry Bishop
 */
public class LocalQueryTransformManager extends LocalPluginManager <Query, Query> {
	
	/**
	 * The QueryTransformer plugin to be managed
	 */
	private final QueryTransformer mTransformer;

	/**
	 * Constructor thats takes the plugin to be manages, the input, and the output queues as input
	 * 
	 * @param transformer The QueryTransformer plugin to be managed
	 * @param inputQueue The queue from which input messages will come from the previous plugin in the pipeline 
	 * @param outputQueue The queue onto which output messages should be put to send them to the next plugin in the pipeline 
	 */
	public LocalQueryTransformManager(QueryTransformer transformer, Queue<Query> inputQueue, Queue<Query> outputQueue) {
		super(inputQueue, outputQueue);
		mTransformer = transformer;
		super.setThread(new TransformerThread());
	}

	/**
	 * The Thread within which the QueryTransformer Management occurs
	 * 
	 * @author Mick Kerrigan, Barry Bishop
	 */
	class TransformerThread extends Thread {
		TransformerThread() {
			super("Query Transformer");
		}

		public void run() {
			mTransformer.initialise();
			Context context = mTransformer.createContext();
			for (;;) {
				PluginManager.Message controlMessage = getNextControlMessage();

				if (controlMessage.equals(PluginManager.Message.NEXT)) {
					alertPrevious();

					Query query = getNextInput();

					if (query == null) {
						putNextOutput(null);
						break;
					}

					for (Query transformedQuery : mTransformer.transform(query, new SimpleContract(), context)){
						putNextOutput(transformedQuery);
					}
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
