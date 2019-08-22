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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import eu.larkc.core.pluginManager.PluginManager;
import eu.larkc.core.pluginManager.local.queue.Queue;

/**
 * LocalPluginManager is a particular implementation of PluginManger that runs
 * within a thread on a local machine. A pipeline made using
 * LocalPluginManager's has a number of strongly type queues between each
 * PluginManager that represent the input and output streams to and from the
 * plugin in question.
 * 
 * @param <E>
 *            The Input type of the queue that the PluginManager should accept
 * @param <F>
 *            The Output type of the queue that the PluginManager should produce
 * 
 * @author Mick Kerrigan, Barry Bishop
 */
public abstract class LocalPluginManager<E, F> implements PluginManager {

	/**
	 * The queue for storing and accessing control methods sent by other PluginManagers
	 *
	 * @see PluginManager.Message
	 */
	private Queue<PluginManager.Message> mControlQueue = new Queue<PluginManager.Message>();

	/**
	 * The PluginManager managing the previous plugin in the pipeline
	 */
	private PluginManager mPreviousPlugin;

	/**
	 * The thread that the plugin management goes on within
	 */
	private Thread thread;

	/**
	 * The queue from which input messages will come from the previous plugin in the pipeline
	 */
	private Queue<E> inputQueue;

	/**
	 * The queue onto which output messages should be put to send them to the
	 * next plugin in the pipeline.
	 */
	private Queue<F> outputQueue;

	/** The logger. */
	protected final Logger logger = LoggerFactory
			.getLogger(LocalPluginManager.class);

	/**
	 * Constructor thats takes the input and output queues as input.
	 * 
	 * @param theInputQueue
	 *            The queue from which input messages will come from the
	 *            previous plugin in the pipeline
	 * @param theOutputQueue
	 *            The queue onto which output messages should be put to send
	 *            them to the next plugin in the pipeline
	 */
	public LocalPluginManager(Queue<E> theInputQueue, Queue<F> theOutputQueue) {
		this.inputQueue = theInputQueue;
		this.outputQueue = theOutputQueue;

		logger.debug("Initialized " + this.getClass());
	}

	/**
	 * Accept.
	 * 
	 * @param message
	 *            the message
	 * 
	 * @see eu.larkc.core.pluginManager.PluginManager#accept(eu.larkc.core.pluginManager.PluginManager.Message)
	 */
	@Override
	public void accept(Message message) {
		mControlQueue.put(message);
	}

	/**
	 * This method enables the next control message that was sent to this
	 * PluginManager to be retrieved.
	 * 
	 * @return the next control message
	 */
	public Message getNextControlMessage() {
		return mControlQueue.take();
	}

	/**
	 * Sets the previous.
	 * 
	 * @param provider
	 *            the provider
	 * 
	 * @see eu.larkc.core.pluginManager.PluginManager#setPrevious(eu.larkc.core.pluginManager.PluginManager)
	 */
	@Override
	public void setPrevious(PluginManager provider) {
		this.mPreviousPlugin = provider;
	}

	/**
	 * This method should be called in order to tell the previous plugin in the
	 * pipeline to stop sending input on the input queue.
	 */
	protected void stopPrevious(){
		if (mPreviousPlugin != null) {
			mPreviousPlugin.accept(PluginManager.Message.STOP);
		}
	}

	/**
	 * This method should be called in order to tell the previous plugin in the
	 * pipeline to send the next piece of input on the input queue.
	 */
	protected void alertPrevious() {
		if (mPreviousPlugin != null) {
			mPreviousPlugin.accept(PluginManager.Message.NEXT);
		}
	}

	/**
	 * Start.
	 * 
	 * @see eu.larkc.core.pluginManager.PluginManager#start()
	 */
	@Override
	public void start() {
		if (thread != null) {
			thread.start();
		}
	}

	/**
	 * This method is used to specify the thread in which the plugin management
	 * occurs.
	 * 
	 * @param theThread
	 *            The Thread in which the plugin management occurs
	 */
	protected void setThread(Thread theThread) {
		this.thread = theThread;
	}

	/**
	 * This method should be called to get the next input from the input queue
	 * 
	 * @return the next element on the input queue
	 */
	protected E getNextInput(){
		return inputQueue.take();
	}

	/**
	 * This method should be called to put an output on the output queue.
	 * 
	 * @param theF
	 *            The element to put on the output queue
	 */
	protected void putNextOutput(F theF) {
		outputQueue.put(theF);
	}
}