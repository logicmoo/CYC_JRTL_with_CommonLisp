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

		@Override
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
