/* For LarKC */
package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;

public class SubLThreadPool extends ThreadPoolExecutor {
	public SubLThreadPool() {
		super(SubLThreadPool.MIN_THREADS, SubLThreadPool.MAX_THREADS, 300L, SubLThreadPool.KEEP_ALIVE_UNITS,
				SubLThreadPool.DEFAULT_WORK_QUEUE, SubLThreadPool.DEFAULT_THREAD_FACTORY);
	}

	private static int getMaxThreads() {
		String maxThreadsStr = System.getProperty("SUBL_MAX_THREADS");
		int maxThreads = 140;
		if (maxThreadsStr != null)
			try {
				maxThreads = Integer.parseInt(maxThreadsStr);
				if (maxThreads < 140)
					maxThreads = 140;
				if (maxThreads > Integer.MAX_VALUE)
					maxThreads = Integer.MAX_VALUE;
				if (maxThreads < SubLThreadPool.MIN_THREADS)
					maxThreads = SubLThreadPool.MIN_THREADS;
			} catch (Exception ex) {
			}
		return maxThreads;
	}

	private static int getMinThreads() {
		String minThreadsStr = System.getProperty("SUBL_MIN_THREADS");
		int minThreads = 40;
		if (minThreadsStr != null)
			try {
				minThreads = Integer.parseInt(minThreadsStr);
				if (minThreads < 40)
					minThreads = 40;
				if (minThreads > Integer.MAX_VALUE)
					minThreads = Integer.MAX_VALUE;
			} catch (Exception ex) {
			}
		return minThreads;
	}

	public static SubLThreadPool getDefaultPool() {
		return SubLThreadPool.defaultSubLThreadPool;
	}

	public static ThreadGroup getDefaultThreadGroup() {
		return SubLThreadPool.defaultThreadGroup;
	}

	public static void main(String[] args) {
	}

	private static int MIN_MIN_THREADS = 40;
	private static int MAX_MIN_THREADS = Integer.MAX_VALUE;
	private static int MIN_MAX_THREADS = 140;
	private static int MAX_MAX_THREADS = Integer.MAX_VALUE;
	private static volatile int threadNum;
	private static ThreadGroup defaultThreadGroup;
	private static int MIN_THREADS;
	private static int MAX_THREADS;
	private static int KEEP_ALIVE_TIME = 300;
	private static TimeUnit KEEP_ALIVE_UNITS;
	public static ThreadFactory DEFAULT_THREAD_FACTORY;
	private static BlockingQueue<Runnable> DEFAULT_WORK_QUEUE;
	private static SubLThreadPool defaultSubLThreadPool;
	static {
		SubLThreadPool.threadNum = 1;
		defaultThreadGroup = new ThreadGroup("SubL Thread Group");
		MIN_THREADS = getMinThreads();
		MAX_THREADS = getMaxThreads();
		KEEP_ALIVE_UNITS = TimeUnit.SECONDS;
		DEFAULT_THREAD_FACTORY = new ThreadFactory() {
			@Override
			public Thread newThread(Runnable command) {
				return makeSubLThreadReal(command);
			}
		};
		DEFAULT_WORK_QUEUE = new SynchronousQueue<Runnable>();
		defaultSubLThreadPool = new SubLThreadPool();
	}

	synchronized static Thread makeSubLThreadReal(Runnable command) {
		SubLThread t = new SubLThread(SubLThreadPool.defaultThreadGroup, command,
				"SubL Thread #" + SubLThreadPool.threadNum++);
		// should not do this? t.setDaemon(true);
		return t.asJavaTread();
	}

	public void execute(SubLProcess runnable) {
		try {
			super.execute(runnable);
		} catch (Exception e) {
			runnable.setState(SubLProcess.DEAD_STATE);
			Errors.warn("Unable to add thread to pool: " + runnable);
		}
	}

	public static void runInSubLThread(Runnable runnable) {
		if(SubLThread.currentThreadIsSubL()) {
			runnable.run();
		} else {
			getDefaultPool().execute(runnable);
		}
	}
	public static Thread newSubLThread(Runnable runnable) {
		return DEFAULT_THREAD_FACTORY.newThread(runnable);
	}
}
