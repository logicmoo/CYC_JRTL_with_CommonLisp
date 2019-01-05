package eu.larkc.core.pluginManager.local;

import eu.larkc.core.data.InformationSet;
import eu.larkc.core.pluginManager.PluginManager;
import eu.larkc.core.pluginManager.local.queue.Queue;
import eu.larkc.plugin.Context;
import eu.larkc.plugin.transform.InformationSetTransformer;

/**
 * LocalInformationSetTransformManager is a LocalPluginManager for InformationSetTransformer plugins
 * 
 * It will generate an InformationSet on the output queue for each InformationSet that comes in 
 * on the input stream
 * 
 * @author Mick Kerrigan, Barry Bishop
 */
public class LocalInformationSetTransformManager extends LocalPluginManager <InformationSet, InformationSet> {
	
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
	public LocalInformationSetTransformManager(InformationSetTransformer transformer, Queue<InformationSet> inputQueue, Queue<InformationSet> outputQueue) {
		super(inputQueue, outputQueue);
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
			mTransformer.initialise();
			Context context = mTransformer.createContext();
			for (;;) {
				PluginManager.Message controlMessage = getNextControlMessage();

				if (controlMessage.equals(PluginManager.Message.NEXT)) {
					alertPrevious();

					InformationSet resource = getNextInput();

					if (resource == null) {
						putNextOutput(null);
						break;
					}

					InformationSet transformedResource = mTransformer.transform(resource, new SimpleContract(), context);
					putNextOutput(transformedResource);
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
