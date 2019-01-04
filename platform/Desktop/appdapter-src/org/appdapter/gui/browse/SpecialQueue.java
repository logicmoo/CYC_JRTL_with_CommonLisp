package org.appdapter.gui.browse;

import java.lang.Thread.UncaughtExceptionHandler;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;

import javax.swing.SwingUtilities;

import org.appdapter.core.convert.ReflectUtils;
import org.appdapter.core.log.BasicDebugger;
import org.appdapter.core.log.Debuggable;

/**
 * Repo loading in parallel
 *
 * LogicMoo
 */
public class SpecialQueue extends BasicDebugger implements UncaughtExceptionHandler {
	public enum SheetLoadStatus {
		Pending, Loading, Loaded, Unloading, Unloaded, Cancelling, Cancelled, Error
	}

	public void logWarning(String msg) {
		getLogger().warn(msg);
	}

	ExecutorService executor = null;
	LinkedList<Task> tasks = new LinkedList<Task>();
	boolean lastJobSubmitted = false;
	Object synchronousAdderLock = new Object();
	boolean isSynchronous = true;
	int taskNum = 0;
	Object loaderFor = null;
	String repoStr = "Utility Special Queue";
	// sounds like a lot.. but it is over with quickly!
	int numThreads = 32;
	int howManyTasksBeforeStartingPool = 0;

	public SpecialQueue(Object repo) {
		loaderFor = repo;
	}

	public void setSynchronous(boolean isSync) {
		isSynchronous = isSync;
		if (isSync) {
			synchronized (synchronousAdderLock) {
				waitUntilLastJobComplete();
				if (executor != null) {
					executor.shutdown();
					executor = null;
				}
			}
		}
	}

	public void reset() {
		synchronized (synchronousAdderLock) {
			lastJobSubmitted = false;
		}
	}

	public void setLastJobSubmitted() {
		synchronized (synchronousAdderLock) {
			lastJobSubmitted = true;
		}
	}

	@Override
	public String toString() {
		if (false) {
			StringBuilder sbuf = new StringBuilder();
			int num = tasksWithsStatus(sbuf, true, SheetLoadStatus.Loaded);
			if (num > 0)
				return sbuf.toString();
		}
		return super.toString();
	}

	int tasksWithsStatus(StringBuilder sb, boolean neg, SheetLoadStatus... statuses) {
		int taskNum = 0;
		for (SheetLoadStatus status : statuses) {
			List<Task> copyOf = ReflectUtils.copyOf(tasks);
			for (Task task : copyOf) {
				if (task.getLoadStatus() != status) {
					if (!neg)
						continue;
				} else {
					if (neg)
						continue;
				}
				taskNum++;
				sb.append("" + taskNum + ": " + task.toString() + "\n");
			}
		}
		return taskNum;
	}

	/**
	 * Wait for the last load to happens
	 */
	public void waitUntilLastJobComplete() {

		int origTaskSize = 0;

		int newTaskSize = tasksSize();
		Task sheetLoadResult;
		while (origTaskSize != newTaskSize) {
			List<Task> copyOf = ReflectUtils.copyOf(tasks);
			for (Task task0 : copyOf) {
				Task task = task0;
				sheetLoadResult = task.get();
			}
			origTaskSize = newTaskSize;
			newTaskSize = tasksSize();
		}
		boolean waslastJobSubmitted;
		synchronized (synchronousAdderLock) {
			waslastJobSubmitted = lastJobSubmitted;
		}
		if (waslastJobSubmitted) {
			if (executor == null)
				return;
			//logWarning("Shutting down executor for " + repoStr);
			// executor.shutdown();
			// executor = null;
		} else {
			///logError("To Early to have called waitUntilLastJobComplete");
		}
	}

	/**
	 * @return
	 */
	public int tasksSize() {
		synchronized (tasks) {
			return tasks.size();
		}
	}
/*
	public void addTask(Runnable r) {
		addTask("" + r, r);
	}
*/
	public void addTask(String named0, Runnable r) {
		Task task = new Task(named0, r);
		//synchronized (synchronousAdderLock)
		{
			if (isSynchronous || taskNum < howManyTasksBeforeStartingPool) {
				taskNum++;
				task.call();
				return;
			}

			if (executor == null) {
				lastJobSubmitted = false;
				logWarning("Creating executor for " + repoStr);
				executor = Executors.newFixedThreadPool(numThreads, new ThreadFactory() {
					@Override
					public Thread newThread(final Runnable r) {
						return new Thread("Worker " + ++workrNum + " for " + loaderFor) {
							public void run() {
								try {
										r.run();
								} catch (Throwable e) {
									SpecialQueue.this.uncaughtException(this, e);
								}
								setName("Completed " + getName());
							}

							@Override
							public UncaughtExceptionHandler getUncaughtExceptionHandler() {
								return SpecialQueue.this;
							}
						};

					}

				});
			}
			synchronized (tasks) {
				tasks.add(task);
			}
			task.future = (Future<Task>) executor.submit((Runnable) task);
		}
	}

	public int totalTasks = 0;
	public int workrNum = 0;

	/** Try to sheetLoad a URL. Return true only if successful. */
	public final class Task implements Callable<Task>, Runnable {
		final String taskName;
		final int taskNum = totalTasks++;
		SheetLoadStatus sheetLoadStatus = SheetLoadStatus.Unloaded;
		Future<Task> future;
		Runnable runIt;
		long start = -1, end = -1;
		Throwable lastException;

		@Override
		public String toString() {
			long soFar = (end == -1) ? System.currentTimeMillis() - start : end - start;
			return "TASK: " + taskName + " status=" + getLoadStatus() + " msecs=" + soFar + (lastException == null ? "" : " error=" + lastException);
		}

		public Task(String named0, Runnable r) {
			this.taskName = named0;
			runIt = r;
			postLoadStatus(SheetLoadStatus.Pending, false);
		}

		void error(Throwable t) {
			lastException = t;
			logError(toString(), t);
		}

		@Override
		public void run() {
			call();
		}

		public Task get() {
			try {
				if (end != -1)
					return this;
				return future.get();
			} catch (Throwable e) {
				error(e);
				postLoadStatus(SheetLoadStatus.Error, true);
			}
			return this;
		}

		public Task call() {
			postLoadStatus(SheetLoadStatus.Loading, false);
			try {
				if (end != -1)
					return this;
				runIt.run();
				postLoadStatus(SheetLoadStatus.Loaded, true);
			} catch (Throwable e) {
				error(e);
				postLoadStatus(SheetLoadStatus.Error, true);
			}
			return this;
		}

		SheetLoadStatus getLoadStatus() {
			return sheetLoadStatus;
		}

		void postLoadStatus(SheetLoadStatus newLoadStatus, boolean isEnd) {
			if (newLoadStatus == this.sheetLoadStatus)
				return;
			long curMS = System.currentTimeMillis();
			if (isEnd) {
				this.end = curMS;
			} else {
				this.start = curMS;
			}
			this.sheetLoadStatus = newLoadStatus;
			String info = toString();
			Thread ct = Thread.currentThread();
			if (ct.getUncaughtExceptionHandler() instanceof SpecialQueue) {
				ct.setName(info);
			}
			logInfo(info);
		}
	}

	@Override
	public void uncaughtException(Thread t, Throwable e) {
        Debuggable.printStackTrace(e);
		logError(" uncaughtException on " + t, e);
		e.printStackTrace();
	}
}