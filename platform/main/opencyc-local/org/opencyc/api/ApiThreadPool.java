package org.opencyc.api;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;

public class ApiThreadPool extends ThreadPoolExecutor
{
    private static int threadNum;
    private static final ThreadGroup defaultThreadGroup;
    private static final int MIN_THREADS = 4;
    private static final int MAX_THREADS = 50;
    private static final BlockingQueue<Runnable> DEFAULT_WORK_QUEUE;
    private static final int KEEP_ALIVE_TIME = 60;
    private static final TimeUnit KEEP_ALIVE_UNITS;
    private static final ThreadFactory DEFAULT_THREAD_FACTORY;
    private static ApiThreadPool apiThreadPool;
    
    public ApiThreadPool() {
        super(4, 50, 60L, ApiThreadPool.KEEP_ALIVE_UNITS, ApiThreadPool.DEFAULT_WORK_QUEUE, ApiThreadPool.DEFAULT_THREAD_FACTORY);
    }
    
    public static synchronized ApiThreadPool getDefaultPool() {
        if (ApiThreadPool.apiThreadPool == null) {
            ApiThreadPool.apiThreadPool = new ApiThreadPool();
        }
        return ApiThreadPool.apiThreadPool;
    }
    
    public static ThreadGroup getDefaultThreadGroup() {
        return ApiThreadPool.defaultThreadGroup;
    }
    
    @Override
    public void execute(final Runnable runnable) {
        super.execute(runnable);
    }
    
    public static void main(final String[] args) {
        System.out.println("Starting.");
        System.out.flush();
        final Semaphore sem = new Semaphore(0);
        for (int i = 0; i < 10; ++i) {
            System.out.println("Queing proc " + i);
            System.out.flush();
            final int threadNum = i;
            getDefaultPool().execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println("Starting proc " + threadNum);
                        System.out.flush();
                        Thread.currentThread();
                        Thread.sleep(threadNum + 5000);
                        sem.release();
                        System.out.println("Finished proc " + threadNum);
                        System.out.flush();
                    }
                    catch (Exception ex) {}
                }
            });
        }
        try {
            sem.acquire(10);
        }
        catch (Exception ex) {}
        System.out.println("Quitting.");
        System.exit(0);
    }
    
    static {
        ApiThreadPool.threadNum = 1;
        defaultThreadGroup = new ThreadGroup("OpenCYC API Thread Group");
        DEFAULT_WORK_QUEUE = new SynchronousQueue<Runnable>();
        KEEP_ALIVE_UNITS = TimeUnit.SECONDS;
        DEFAULT_THREAD_FACTORY = new ThreadFactory() {
            @Override
            public Thread newThread(final Runnable command) {
                return new ApiThread(ApiThreadPool.defaultThreadGroup, command, "SubL Thread #" + ApiThreadPool.threadNum++);
            }
        };
        ApiThreadPool.apiThreadPool = null;
    }
    
    private static class ApiThread extends Thread
    {
        ApiThread(final ThreadGroup threadGroup, final Runnable command, final String name) {
            super(threadGroup, command, name);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 43 ms
	
	Decompiled with Procyon 0.5.32.
*/