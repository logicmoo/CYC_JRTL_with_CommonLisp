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

import java.util.Collection;

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
