package eu.larkc.core.pluginManager.local.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * A blocking queue. Not as good as Queue1 (which uses one of Doug Lea's nifty
 * queue classes), but this one does allow the putting of 'null' on the queue.
 * Of course, this doesn't make much sense if the consumer is polling, but it's
 * useful in the short term.
 * 
 * @param <E>
 *            The class of objects passed along the queue.
 */
public class Queue<E> {
	
	private List<QueueListener<E>> listeners;
	private final List<E> mQueue = new LinkedList<E>();

	public Queue() {
		this.listeners = new ArrayList<QueueListener<E>>();
	}

	public synchronized E take() {
		try {
			while (mQueue.isEmpty()){
				wait();
			}
			return mQueue.remove(0);
		} catch (InterruptedException e) {
			// We never call interrupt, so this exception can be ignored
			return null;
		}
	}

	public synchronized void put(E item) {
		mQueue.add(item);
		notify();
		fireElementAdded(item);
	}

	public synchronized int size() {
		return mQueue.size();
	}

	public synchronized boolean isEmpty() {
		return mQueue.isEmpty();
	}

	public synchronized E poll() {
		if (!mQueue.isEmpty()){
			return mQueue.get(0);
		}
		return null;
	}

	public synchronized void addListener(QueueListener<E> theQueueListener) {
		this.listeners.add(theQueueListener);
	}

	public synchronized void fireElementAdded(E e) {
		for (QueueListener<E> l : listeners) {
			l.elementAdded(e);
		}
	}
}
