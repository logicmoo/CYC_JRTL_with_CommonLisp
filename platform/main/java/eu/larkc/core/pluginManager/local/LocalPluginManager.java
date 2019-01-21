package eu.larkc.core.pluginManager.local;

import eu.larkc.core.pluginManager.PluginManager;
import eu.larkc.core.pluginManager.local.queue.Queue;

/**
 * LocalPluginManager is a particular implementation of PluginManger that runs within a thread on a 
 * local machine. A pipeline made using LocalPluginManager's has a number of strongly type queues 
 * between each PluginManager that represent the input and output streams to and from the plugin in
 * question.
 * 
 * @author Mick Kerrigan, Barry Bishop
 *
 * @param <E> The Input type of the queue that the PluginManager should accept 
 * @param <F> The Output type of the queue that the PluginManager should produce
 */
public abstract class LocalPluginManager <E, F> implements PluginManager {

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
	 * The queue onto which output messages should be put to send them to the next plugin in the pipeline 
	 */
	private Queue<F> outputQueue;
	
	/**
	 * Constructor thats takes the input and output queues as input
	 * 
	 * @param theInputQueue The queue from which input messages will come from the previous plugin in the pipeline 
	 * @param theOutputQueue The queue onto which output messages should be put to send them to the next plugin in the pipeline 
	 */
	public LocalPluginManager(Queue<E> theInputQueue, Queue<F> theOutputQueue){
		this.inputQueue = theInputQueue;
		this.outputQueue = theOutputQueue;
	}
	
	/**
	 * @see eu.larkc.core.pluginManager.PluginManager#accept(eu.larkc.core.pluginManager.PluginManager.Message)
	 */
	@Override
	public void accept(Message message) {
		mControlQueue.put(message);
	}
	
	/**
	 * This method enables the next control message that was sent to this PluginManager to be retrieved
	 * 
	 * @return the next control message
	 */
	public Message getNextControlMessage(){
		return mControlQueue.take();
	}

	/**
	 * @see eu.larkc.core.pluginManager.PluginManager#setPrevious(eu.larkc.core.pluginManager.PluginManager)
	 */
	@Override
	public void setPrevious(PluginManager provider) {
		this.mPreviousPlugin = provider;
	}
	
	/**
	 * This method should be called in order to tell the previous plugin in the pipeline to stop sending input on the input queue
	 */
	protected void stopPrevious(){
		if (mPreviousPlugin != null){
			mPreviousPlugin.accept(PluginManager.Message.STOP);
		}
	}
	
	/**
	 * This method should be called in order to tell the previous plugin in the pipeline to send the next piece of input on the input queue
	 */
	protected void alertPrevious(){
		if (mPreviousPlugin != null){
			mPreviousPlugin.accept(PluginManager.Message.NEXT);
		}
	}

	/**
	 * @see eu.larkc.core.pluginManager.PluginManager#start()
	 */
	@Override
	public void start() {
		if (thread != null) {
			thread.start();
		}
	}
	
	/**
	 * This method is used to specify the thread in which the plugin management occurs
	 * 
	 * @param theThread The Thread in which the plugin management occurs
	 */
	protected void setThread(Thread theThread){
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
	 * This method should be called to put an output on the output queue
	 * 
	 * @param theF The element to put on the output queue
	 */
	protected void putNextOutput(F theF){
		outputQueue.put(theF);
	}
}