package org.logicmoo.system;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class WorkQueue {

	static Map<String, WorkQueue> workerQueues = new HashMap();
	private String name;

	public static WorkQueue getWorkerQueue(String name) {
		synchronized (workerQueues) {
			final String lowerCase = name.toLowerCase();
			WorkQueue found = workerQueues.get(lowerCase);
			if (found == null) {
				found = new WorkQueue(name, 1);
				workerQueues.put(lowerCase, found);
			}
			return found;
		}
	}

	public static void queueExecute(String named, Runnable r) {
		getWorkerQueue(named).execute(r);
	}

	@Override
	public String toString() {
		return name + "@" + getClass();
	}

	private boolean shutDown = false;
	private long pauseBetween = 100;
	private final int nThreads;
	private final PoolWorker[] threads;
	private final LinkedList queue;

	@Override
	protected void finalize() throws Throwable {
		synchronized (queue) {
			shutDown = true;
			queue.notify();
		}
		for (int i = 0; i < nThreads; i++) {
			threads[i].stop();
		}
		super.finalize();
	}

	public void stop() {
		for (int i = 0; i < nThreads; i++) {
			threads[i].stop();
		}
		synchronized (queue) {
			queue.notify();
		}
	}

	public void resume() {
		synchronized (queue) {
			for (int i = 0; i < nThreads; i++) {
				threads[i].resume();
			}
			queue.notify();
		}
	}

	public void suspend() {
		synchronized (queue) {
			for (int i = 0; i < nThreads; i++) {
				threads[i].suspend();
			}
			queue.notify();
		}
	}

	private void WorkQueue() {

	}

	protected WorkQueue(String name, int nThreads) {
		this.name = name;
		this.nThreads = nThreads;
		queue = new LinkedList();
		threads = new PoolWorker[nThreads];

		for (int i = 0; i < nThreads; i++) {
			final PoolWorker poolWorker = new PoolWorker(name + " #" + i);
			poolWorker.setMode("starting");
			poolWorker.start();
			threads[i] = poolWorker;
		}
	}

	public void execute(Runnable r) {
		synchronized (queue) {
			queue.addLast(r);
			queue.notify();
		}
	}

	public void execute(String named, Runnable r) {
		synchronized (queue) {
			queue.addLast(r);
			queue.notify();
		}
	}

	private long getPauseBetween() {
		return pauseBetween;
	}

	private void setPauseBetween(long pauseBetween) {
		this.pauseBetween = pauseBetween;
	}

	private class PoolWorker extends Thread {
		private String unbusyName;

		public PoolWorker(String unbusyName) {
			this.unbusyName = unbusyName;
		}

		public void run() {
			Runnable r;

			while (true) {
				synchronized (queue) {
					while (queue.isEmpty()) {
						try {
							setMode("waiting");
							queue.wait();
						} catch (InterruptedException ignored) {
							setMode("interupted");
						}
					}
					if (shutDown) {
						setMode("shutdown");
						return;
					}
					r = (Runnable) queue.removeFirst();
				}

				// If we don't catch RuntimeException,
				// the pool could leak threads
				try {
					try {
						Thread.sleep(pauseBetween);
					} catch (InterruptedException e) {
						// You might want to log something here
					}
					setMode("working " + r);
					r.run();
				} catch (Throwable e) {
					Startup.uncaughtException(e);
				}
			}
		}

		@Override
		public synchronized void start() {
			setDaemon(true);
			setName("WorkQueue " + unbusyName);
			super.start();
		}

		public void setMode(String mode) {
			setName(mode + " " + unbusyName);
		}
	}

}