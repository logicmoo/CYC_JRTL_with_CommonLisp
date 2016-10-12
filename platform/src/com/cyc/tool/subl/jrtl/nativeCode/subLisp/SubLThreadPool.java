/***
 *   Copyright (c) 1995-2009 Cycorp Inc.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *  Substantial portions of this code were developed by the Cyc project
 *  and by Cycorp Inc, whose contribution is gratefully acknowledged.
*/

package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

//// External Imports
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * <P>
 * SubLThreadPool is designed to...
 *
 * <P>
 * Copyright (c) 2004 - 2006 Cycorp, Inc. All rights reserved. <BR>
 * This software is the proprietary information of Cycorp, Inc.
 * <P>
 * Use is subject to license terms.
 *
 * @author tbrussea
 * @date December 11, 2005, 2:19 PM
 * @version $Id: SubLThreadPool.java 127501 2009-03-30 20:35:37Z tbrussea $
 */
final public class SubLThreadPool extends ThreadPoolExecutor {

	//// Constructors

	private static int threadNum = 1;

	//// Public Area

	private static ThreadGroup defaultThreadGroup = new ThreadGroup("SubL Thread Group");

	private static int MIN_THREADS = 70;

	private static int MAX_THREADS = 70;

	//// Protected Area

	//// Private Area

	//// Internal Rep

	private static int KEEP_ALIVE_TIME = 5 * 60;
	private static TimeUnit KEEP_ALIVE_UNITS = TimeUnit.SECONDS;
	static ThreadFactory DEFAULT_THREAD_FACTORY = new ThreadFactory() {
		public Thread newThread(Runnable command) {
			return new SubLThread(SubLThreadPool.defaultThreadGroup, command,
					"SubL Thread #" + SubLThreadPool.threadNum++);
		}
	};
	private static BlockingQueue<Runnable> DEFAULT_WORK_QUEUE = new ArrayBlockingQueue<Runnable>(1024);
	private static SubLThreadPool defaultSubLThreadPool = new SubLThreadPool();

	public static SubLThreadPool getDefaultPool() {
		return SubLThreadPool.defaultSubLThreadPool;
	}

	public static ThreadGroup getDefaultThreadGroup() {
		return SubLThreadPool.defaultThreadGroup;
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

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
	}

	/** Creates a new instance of SubLThreadPool. */
	public SubLThreadPool() {
		super(SubLThreadPool.MIN_THREADS, SubLThreadPool.MAX_THREADS, SubLThreadPool.KEEP_ALIVE_TIME,
				SubLThreadPool.KEEP_ALIVE_UNITS, SubLThreadPool.DEFAULT_WORK_QUEUE,
				SubLThreadPool.DEFAULT_THREAD_FACTORY);
	}

	//// Main

	/** ensure we only run the right type of runnables **/
	public void execute(Runnable runnable) {
		super.execute(runnable);
	}

}
