package eu.larkc.core.pluginManager.local;

import eu.larkc.core.data.DataSet;
import eu.larkc.core.data.SetOfStatements;
import eu.larkc.core.pluginManager.PluginManager;
import eu.larkc.core.pluginManager.local.queue.Queue;
import eu.larkc.plugin.Context;
import eu.larkc.plugin.Contract;
import eu.larkc.plugin.select.Selecter;

/**
 * LocalSelectFromDataSetManager is a LocalPluginManager for Selecter plugins
 * 
 * It will generate a SetOfStatements on the output queue for each DataSet that comes in 
 * on the input stream
 * 
 * @author Mick Kerrigan, Barry Bishop
 */
public class LocalSelectFromDataSetManager extends LocalPluginManager <DataSet, SetOfStatements>{
	
	/**
	 * The Selecter plugin to be managed
	 */
	private final Selecter mSelecter;

	/**
	 * Constructor thats takes the plugin to be manages, the input, and the output queues as input
	 * 
	 * @param selecter The Selecter plugin to be managed
	 * @param inputQueue The queue from which input messages will come from the previous plugin in the pipeline 
	 * @param outputQueue The queue onto which output messages should be put to send them to the next plugin in the pipeline 
	 */
	public LocalSelectFromDataSetManager(Selecter selecter, Queue<DataSet> filterOutputQueue, Queue<SetOfStatements> outputQueue) {
		super(filterOutputQueue, outputQueue);
		mSelecter = selecter;
		super.setThread(new SelecterThread());
	}

	/**
	 * The Thread within which the Selecter Management occurs
	 * 
	 * @author Mick Kerrigan, Barry Bishop
	 */
	class SelecterThread extends Thread {
		SelecterThread() {
			super("Selecter");
		}

		public void run() {
			for (;;) {
				PluginManager.Message controlMessage = getNextControlMessage();

				if (controlMessage.equals(PluginManager.Message.NEXT)) {
					alertPrevious();

					DataSet dataset = getNextInput();
					if (dataset == null) {
						putNextOutput(null);
						break;
					}

					putNextOutput(mSelecter.select(dataset, new Contract() {}, new Context() {}));
				} 
				else if (controlMessage.equals(PluginManager.Message.STOP)) {
					break;
				}
			}
			stopPrevious();
		}
	}
}