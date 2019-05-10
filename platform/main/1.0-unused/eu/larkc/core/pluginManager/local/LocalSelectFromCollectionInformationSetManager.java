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
package eu.larkc.core.pluginManager.local;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openrdf.model.Statement;
import org.openrdf.model.URI;

import eu.larkc.core.data.CloseableIterator;
import eu.larkc.core.data.DataFactory;
import eu.larkc.core.data.DataSet;
import eu.larkc.core.data.InformationSet;
import eu.larkc.core.data.RdfGraph;
import eu.larkc.core.data.RdfStoreConnection;
import eu.larkc.core.data.SetOfStatements;
import eu.larkc.core.pluginManager.PluginManager;
import eu.larkc.core.pluginManager.local.queue.Queue;
import eu.larkc.plugin.Context;
import eu.larkc.plugin.Contract;
import eu.larkc.plugin.select.Selecter;

/**
 * LocalSelectFromDataSetManager is a LocalPluginManager for Selecter plugins
 *
 * It will generate a SetOfStatements on the output queue for each Collection<InformationSet> that comes in
 * on the input stream. Please note that any non RDF InformationSet in the Collection<InformationSet> will be discarded
 *
 * @author Mick Kerrigan, Barry Bishop
 */
public class LocalSelectFromCollectionInformationSetManager extends LocalPluginManager <Collection<InformationSet>, SetOfStatements>{

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
	public LocalSelectFromCollectionInformationSetManager(Selecter selecter, Queue<Collection<InformationSet>> filterOutputQueue, Queue<SetOfStatements> outputQueue) {
		super(filterOutputQueue, outputQueue);
		mSelecter = selecter;
		super.setThread(new SelecterThread());
	}

	/**
	 * The Thread within which the Selecter Management occurs.
	 *
	 * @author Mick Kerrigan, Barry Bishop
	 */
	class SelecterThread extends Thread {

		/**
		 * Instantiates a new selecter thread.
		 */
		SelecterThread() {
			super("Selecter");
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see java.lang.Thread#run()
		 */
		@Override
		public void run() {
			mSelecter.initialise();
			Context context = mSelecter.createContext();
			for (;;) {
				PluginManager.Message controlMessage = getNextControlMessage();

				logger.debug("Got control message: " + controlMessage);

				if (controlMessage.equals(PluginManager.Message.NEXT)) {
					alertPrevious();

					Collection<InformationSet> informationSets = getNextInput();
					if (informationSets == null) {
						putNextOutput(null);
						break;
					}

					SetOfStatements statements = null;
					if (informationSets.size() == 1 && informationSets.iterator().next() instanceof SetOfStatements){
						statements = (SetOfStatements) informationSets.iterator().next();
					}
					else{
						List <URI> uris = new ArrayList <URI> ();
						for (InformationSet is : informationSets){
							if (is instanceof RdfGraph) {
								RdfGraph graph = (RdfGraph) is;
						        uris.add(graph.getName());
							}
						}
						DataSet dataset = DataFactory.INSTANCE.createRdfStoreConnection().createDataSet(uris, new ArrayList <URI>());

						if (dataset.getDefaultGraphs().isEmpty() && dataset.getNamedGraphs().isEmpty()){
							putNextOutput(null);
							break;
						}
						statements = dataset;
					}

					putNextOutput(mSelecter.select(statements, new SimpleContract(), context));
				}
				else if (controlMessage.equals(PluginManager.Message.STOP)) {
					break;
				}
			}
			stopPrevious();
			mSelecter.shutdown();
		}
	}
}