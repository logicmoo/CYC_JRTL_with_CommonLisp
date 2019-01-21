package eu.larkc.core.pluginManager.local;

import java.util.Collection;

import org.openrdf.model.Statement;

import eu.larkc.core.data.CloseableIterator;
import eu.larkc.core.data.InformationSet;
import eu.larkc.core.pluginManager.PluginManager;
import eu.larkc.core.pluginManager.local.queue.Queue;
import eu.larkc.core.query.Query;
import eu.larkc.plugin.Context;
import eu.larkc.plugin.identify.Identifier;

/**
 * LocalIdentifyManager is a LocalPluginManager for Identifier plugins
 * 
 * It will generate a Collection<InfromationSet> on the output queue for each Query that comes in 
 * on the input stream
 * 
 * @author Mick Kerrigan, Barry Bishop
 */
public class LocalIdentifyManager extends LocalPluginManager <Query, Collection<InformationSet>> {

	/**
	 * The Identifier plugin to be managed
	 */
	private final Identifier mIdentifier;
	
	/**
	 * Constructor thats takes the plugin to be manages, the input, and the output queues as input
	 * 
	 * @param identifier The Identifier plugin to be managed
	 * @param inputQueue The queue from which input messages will come from the previous plugin in the pipeline 
	 * @param outputQueue The queue onto which output messages should be put to send them to the next plugin in the pipeline 
	 */
	public LocalIdentifyManager(Identifier identifier, Queue<Query> inputQueue, Queue<Collection<InformationSet>> outputQueue) {
		super(inputQueue, outputQueue);
		mIdentifier = identifier;
		super.setThread(new IdentifierThread());
	}

	/**
	 * The Thread within which the Identifier Management occurs
	 * 
	 * @author Mick Kerrigan, Barry Bishop
	 */
	class IdentifierThread extends Thread {
		IdentifierThread() {
			super("Identifier");
		}

		@Override
		public void run() {
			mIdentifier.initialise();
			Context context = mIdentifier.createContext();
			for (;;) {
				PluginManager.Message controlMessage = getNextControlMessage();

				if (controlMessage.equals(PluginManager.Message.NEXT)) {
					alertPrevious();
					
					Query query = getNextInput();

					if (query == null) {
						putNextOutput(null);
						break;
					}
					
					boolean finishedThisQuery = false;
					while (!finishedThisQuery){
						Collection<InformationSet> resources = mIdentifier.identify(query, new SimpleContract(), context);
						if (resources == null || resources.isEmpty()) {
							finishedThisQuery = true;
							break;
						}
						putNextOutput(resources);
					}
				} 
				else if (controlMessage.equals(PluginManager.Message.STOP)) {
					break;
				}
			}
			stopPrevious();
			mIdentifier.shutdown();
		}
	}
}
