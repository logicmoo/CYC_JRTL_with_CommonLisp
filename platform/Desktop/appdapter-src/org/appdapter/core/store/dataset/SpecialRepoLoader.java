package org.appdapter.core.store.dataset;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;

import org.appdapter.core.convert.ReflectUtils;
import org.appdapter.core.log.BasicDebugger;
import org.appdapter.core.store.BasicRepoImpl;
import org.appdapter.core.store.RepoModelEvent;

import com.hp.hpl.jena.rdf.model.Model;

public class SpecialRepoLoader extends BasicDebugger implements Thread.UncaughtExceptionHandler
{
    ExecutorService executor;
    LinkedList<Task> tasks;
    boolean lastJobSubmitted;
    Object synchronousAdderLock;
    Object executorLock;
    boolean isSynchronous;
    int taskNum;
    BasicRepoImpl loaderFor;
    public String repoStr;
    int numThreads;
    int howManyTasksBeforeStartingPool;
    public int totalTasks;
    public int workrNum;
    private boolean alwaysSingleThreaded;

    public void logWarning(final String msg) {
        this.getLogger().warn(msg);
    }

    public void addLoadTask(final String s, final Runnable task) {
        if (this.loaderFor != null) {
            this.loaderFor.addLoadTask(s, task);
        }
        else {
            this.addTask(s, task);
        }
    }

    public SpecialRepoLoader(final BasicRepoImpl repo) {
        this.executor = null;
        this.tasks = new LinkedList<Task>();
        this.lastJobSubmitted = false;
        this.synchronousAdderLock = new Object();
        this.executorLock = new Object();
        this.isSynchronous = true;
        this.taskNum = 0;
        this.loaderFor = null;
        this.repoStr = "REPO";
        this.numThreads = 32;
        this.howManyTasksBeforeStartingPool = 0;
        this.totalTasks = 0;
        this.workrNum = 0;
        this.loaderFor = repo;
    }

    public void setSynchronous(final boolean isSync) {
        this.isSynchronous = isSync;
        if (isSync) {
            synchronized (this.synchronousAdderLock) {
                this.waitUntilLastJobComplete();
                if (this.executor != null) {
                    this.executor.shutdown();
                    this.executor = null;
                }
            }
        }
    }

    public void reset() {
        synchronized (this.synchronousAdderLock) {
            this.lastJobSubmitted = false;
        }
    }

    public void setLastJobSubmitted() {
        synchronized (this.synchronousAdderLock) {
            this.lastJobSubmitted = true;
        }
    }

    public String toString() {
        return super.toString();
    }

    int tasksWithsStatus(final StringBuilder sb, final boolean neg, final SheetLoadStatus... statuses) {
        int taskNum = 0;
        for (final SheetLoadStatus status : statuses) {
            for (final Task task : ReflectUtils.copyOf(this.tasks)) {
                if (task.getLoadStatus() != status) {
                    if (!neg) {
                        continue;
                    }
                }
                else if (neg) {
                    continue;
                }
                ++taskNum;
                sb.append("" + taskNum + ": " + task.toString() + "\n");
            }
        }
        return taskNum;
    }

    public void waitUntilLastJobComplete() {
        int origTaskSize = 0;
        int newTaskSize = this.tasks.size();
        for (boolean isComplete = false; origTaskSize != newTaskSize || !isComplete; origTaskSize = newTaskSize, newTaskSize = this.tasks.size()) {
            isComplete = true;
            for (final Object task : ReflectUtils.copyOf((Collection)this.tasks)) {
                final Task sheetLoadResult = ((Task) task).get();
                if (sheetLoadResult == null) {
                    synchronized (this.tasks) {
                        this.tasks.remove(task);
                    }
                }
                else if (!sheetLoadResult.isComplete()) {
                    isComplete = false;
                }
                else {
                    synchronized (this.tasks) {
                        this.tasks.remove(task);
                    }
                }
            }
        }
        synchronized (this.synchronousAdderLock) {
            final boolean waslastJobSubmitted = this.lastJobSubmitted;
        }
        if (this.executor == null) {
            return;
        }
        synchronized (this.executorLock) {
            if (this.executor == null) {
                return;
            }
            this.logWarning("Shutting down executor for " + this.repoStr);
            this.executor.shutdown();
            this.executor = null;
        }
    }

    public void addTask(final String sheetNameURI, final Runnable r) {
        if (this.lastJobSubmitted) {
            this.logWarning("AddTask " + sheetNameURI + " when lastJobSubmitted for " + this.repoStr);
        }
        final Task task = new Task(sheetNameURI, r);
        if (this.isSynchronous() || this.taskNum < this.howManyTasksBeforeStartingPool) {
            ++this.taskNum;
            task.call();
            return;
        }
        this.lastJobSubmitted = false;
        synchronized (this.executorLock) {
            if (this.executor == null) {
                this.logWarning("Creating executor for " + this.repoStr);
                this.executor = Executors.newFixedThreadPool(this.numThreads, new ThreadFactory() {
                    @Override
                    public Thread newThread(final Runnable r) {
                        return new Thread("Worker " + ++SpecialRepoLoader.this.workrNum + " for " + SpecialRepoLoader.this.loaderFor) {
                            @Override
                            public void run() {
                                r.run();
                            }

                            @Override
                            public UncaughtExceptionHandler getUncaughtExceptionHandler() {
                                return SpecialRepoLoader.this;
                            }
                        };
                    }
                });
            }
        }
        synchronized (this.tasks) {
            this.tasks.add(task);
        }
        task.future = (Future<Task>)this.executor.submit((Runnable)task);
    }

    public void uncaughtException(final Thread t, final Throwable e) {
        this.logError(" uncaughtException on " + t, e);
        e.printStackTrace();
    }

    public void cancelAll() {
        this.executor.shutdown();
    }

    public int getRealTodo() {
        return this.tasks.size();
    }

    public boolean isSynchronous() {
        return this.isSynchronous || this.alwaysSingleThreaded;
    }

    public void addTaskFirst(final String n, final Runnable v) {
        final ArrayList<? extends Runnable> drainedArrayList = new ArrayList<Runnable>();
        final BlockingQueue queue = ((ThreadPoolExecutor)this.executor).getQueue();
        queue.drainTo(drainedArrayList);
        this.addTask(n, v);
        for (final Runnable e : drainedArrayList) {
            queue.add(e);
        }
    }

    public void setSingleThreaded(final boolean loadSingleThread) {
        this.alwaysSingleThreaded = loadSingleThread;
    }

    public enum SheetLoadStatus
    {
        Pending,
        Loading,
        Loaded,
        Unloading,
        Unloaded,
        Cancelling,
        Cancelled,
        Error;
    }

    public final class Task implements Callable<Task>, Runnable
    {
        final String sheetName;
        final int taskNum;
        SheetLoadStatus sheetLoadStatus;
        Future<Task> future;
        Runnable runIt;
        long start;
        long end;
        Throwable lastException;

        @Override
        public String toString() {
            final long soFar = (this.end == -1L) ? (System.currentTimeMillis() - this.start) : (this.end - this.start);
            return "TASK-" + this.taskNum + ": sheet=" + this.sheetName + " status=" + this.getLoadStatus() + " msecs=" + soFar + ((this.lastException == null) ? "" : (" error=" + this.lastException));
        }

        public boolean isComplete() {
            return this.end != -1L;
        }

        public Task(final String sheetNameURI, final Runnable r) {
            this.taskNum = SpecialRepoLoader.this.totalTasks++;
            this.sheetLoadStatus = SheetLoadStatus.Unloaded;
            this.start = -1L;
            this.end = -1L;
            this.sheetName = sheetNameURI;
            this.runIt = r;
            this.postLoadStatus(SheetLoadStatus.Pending, false);
        }

        void error(final Throwable t) {
            this.lastException = t;
            SpecialRepoLoader.this.logError(this.toString(), t);
        }

        @Override
        public void run() {
            this.call();
        }

        public Task get() {
            try {
                if (this.end != -1L) {
                    return this;
                }
                return this.future.get();
            }
            catch (Throwable e) {
                this.error(e);
                this.postLoadStatus(SheetLoadStatus.Error, true);
                return this;
            }
        }

        @Override
        public Task call() {
            this.postLoadStatus(SheetLoadStatus.Loading, false);
            try {
                if (this.end != -1L) {
                    return this;
                }
                this.runIt.run();
                this.postLoadStatus(SheetLoadStatus.Loaded, true);
            }
            catch (Throwable e) {
                this.error(e);
                this.postLoadStatus(SheetLoadStatus.Error, true);
            }
            return this;
        }

        SheetLoadStatus getLoadStatus() {
            return this.sheetLoadStatus;
        }

        void postLoadStatus(final SheetLoadStatus newLoadStatus, final boolean isEnd) {
            if (newLoadStatus == this.sheetLoadStatus) {
                return;
            }
            final long curMS = System.currentTimeMillis();
            if (isEnd) {
                this.end = curMS;
            }
            else {
                this.start = curMS;
            }
            this.sheetLoadStatus = newLoadStatus;
            final Model saveEventsTo = SpecialRepoLoader.this.loaderFor.getEventsModel();
            final Map eventProps = new HashMap();
            eventProps.put("loadStatus", saveEventsTo.createResource("urn:ftd:cogchar.org:2012:runtime#" + newLoadStatus.toString()));
            eventProps.put("timeStampMS", curMS);
            eventProps.put("modelName", this.sheetName);
            RepoModelEvent.createEvent(saveEventsTo, eventProps);
            final String info = this.toString();
            final Thread ct = Thread.currentThread();
            if (ct.getUncaughtExceptionHandler() instanceof SpecialRepoLoader) {
                ct.setName(info);
            }
            SpecialRepoLoader.this.logInfo(info);
        }
    }
}

/*

	Total time: 96 ms

*/