package org.appdapter.core.store;

import com.hp.hpl.jena.rdf.listeners.StatementListener;
import org.slf4j.LoggerFactory;
import java.util.concurrent.TimeUnit;
import com.hp.hpl.jena.rdf.model.Statement;
import java.util.concurrent.Executors;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.appdapter.core.store.dataset.RepoDatasetFactory;
import java.util.HashSet;
import java.util.Collection;
import com.hp.hpl.jena.shared.Lock;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.List;
import com.hp.hpl.jena.rdf.model.Model;
import java.util.Set;
import com.hp.hpl.jena.rdf.model.ModelChangedListener;
import java.util.Map;
import org.slf4j.Logger;
import java.util.concurrent.locks.ReentrantLock;

public class StatementSync
{
    private ReentrantLock pauseLock;
    static Logger theLogger;
    static Map<Pair, StatementSync> syncPairs;
    Map<Object, ModelChangedListener> listenerMap;
    Set<Model> sourceModels;
    Set<Model> destModels;
    List<StatementOpListener> notifierList;
    Map<Object, StatementOpListener> destMap;
    ScheduledThreadPoolExecutor executor;
    private Model memoryCache;
    boolean shutDownRequested;
    boolean isSyncDisabled;
    private boolean setAsForegorund;

    static Collection<Lock> enterCriticalSections(final boolean readLockRequested, final Lock... tms) {
        final HashSet<Lock> locks = new HashSet<Lock>();
        for (final Lock l : tms) {
            if (locks.add(l)) {
                l.enterCriticalSection(readLockRequested);
            }
        }
        return locks;
    }

    public static StatementSync getStatementSyncerOfModels(final Model m1, final Model m2) {
        final StatementSync statementSync = getModelsSyncer(m1, m2);
        return statementSync;
    }

    private static StatementSync getModelsSyncer(final Model m1, final Model m2) {
        final Pair key = makeKey(m1, m2);
        synchronized (StatementSync.syncPairs) {
            StatementSync mcl = StatementSync.syncPairs.get(key);
            if (mcl == null) {
                final Collection<Lock> locks = enterCriticalSections(false, m1, m2);
                StatementSync.theLogger.info("Making modelSync = " + key);
                try {
                    final Model memmodel = RepoDatasetFactory.createPrivateMemModel();
                    memmodel.add(m1);
                    m1.add(m2);
                    m2.add(memmodel);
                    memmodel.add(m2);
                    mcl = new StatementSync(memmodel);
                    mcl.addSourceModel_Int(m1);
                    mcl.addSourceModel_Int(m2);
                    StatementSync.syncPairs.put(key, mcl);
                    mcl.addDestinationModel_Int(memmodel);
                    mcl.addDestinationModel_Int(m1);
                    mcl.addDestinationModel_Int(m2);
                    mcl.setAsForegorund = true;
                    return mcl;
                }
                finally {
                    exitCriticalSections(locks);
                }
            }
            return mcl;
        }
    }

    public void addSourceModel(final Model src) {
        if (this.addSourceModel_Int(src)) {
            this.addTodo((ChangeListener)this.listenerMap.get(src), src, new BulkStatement(src, src, WhatToDo.Add));
        }
    }

    public void addDestinationModel(final Model dest) {
        if (this.addDestinationModel_Int(dest)) {
            this.catchupDestination_Int(dest);
        }
    }

    public static final int hashCodeObject(final Object obj) {
        return hashCodeObject(obj, -4);
    }

    public static final int hashCodeObject(final Object obj, final int nullHashCode) {
        if (obj == null) {
            return nullHashCode;
        }
        return obj.hashCode();
    }

    private static Pair makeKey(final Model m1, final Model m2) {
        if (System.identityHashCode(m1) > System.identityHashCode(m2)) {
            return new Pair(m2, m1);
        }
        return new Pair(m1, m2);
    }

    public static String str(final Object x) {
        if (x == null) {
            return "<null>";
        }
        return x.toString();
    }

    public static StatementSync syncTwoModels(final Model m1, final Model m2) {
        final StatementSync mcl = getStatementSyncerOfModels(m1, m2);
        mcl.completeSync();
        return mcl;
    }

    public static StatementSync resyncTwoModels(final Model m1, final Model m2) {
        final StatementSync mcl = getStatementSyncerOfModels(m1, m2);
        mcl.resyncNow();
        return mcl;
    }

    static void exitCriticalSections(final Collection<Lock> locks) {
        for (final Lock l : locks) {
            l.leaveCriticalSection();
        }
    }

    void shutDown() {
        this.isSyncDisabled = true;
        if (this.shutDownRequested) {
            return;
        }
        this.shutDownRequested = true;
        this.executor.shutdown();
    }

    public StatementSync(final Model createDefaultModel) {
        this.pauseLock = new ReentrantLock();
        this.listenerMap = new HashMap<Object, ModelChangedListener>();
        this.sourceModels = new HashSet<Model>(3);
        this.destModels = new HashSet<Model>(3);
        this.notifierList = new ArrayList<StatementOpListener>();
        this.destMap = new HashMap<Object, StatementOpListener>();
        this.executor = (ScheduledThreadPoolExecutor)Executors.newScheduledThreadPool(1);
        this.shutDownRequested = false;
        this.isSyncDisabled = false;
        this.memoryCache = createDefaultModel;
    }

    public boolean addSourceModel_Int(final Model keyModel) {
        boolean isNew = false;
        synchronized (this.listenerMap) {
            ModelChangedListener mcl = this.listenerMap.get(keyModel);
            if (mcl == null) {
                final Collection<Lock> locks = this.enterCriticalSection(false);
                mcl = (ModelChangedListener)new ChangeListener(keyModel);
                isNew = true;
                this.listenerMap.put(keyModel, mcl);
                this.sourceModels.add(keyModel);
                keyModel.register(mcl);
                exitCriticalSections(locks);
                this.pauseLock.unlock();
            }
        }
        return isNew;
    }

    public boolean addDestinationModel_Int(final Model keyModel) {
        boolean isNew = false;
        synchronized (this.destMap) {
            StatementOpListener mcl = this.destMap.get(keyModel);
            if (mcl == null) {
                final Collection<Lock> locks = this.enterCriticalSection(false);
                mcl = new StatementOpListenerForModel(keyModel);
                isNew = true;
                this.destMap.put(keyModel, mcl);
                this.sourceModels.add(keyModel);
                this.notifierList.add(mcl);
                exitCriticalSections(locks);
                this.pauseLock.unlock();
            }
        }
        return isNew;
    }

    public long catchupDestination_Int(final Model destModel) {
        final long size = destModel.size();
        destModel.add(this.memoryCache);
        return destModel.size() - size;
    }

    public void addTodo(final ChangeListener changeListener, final Model dataModel, final Runnable runnable) {
        this.submit(runnable);
    }

    private void submit(final Runnable runnable) {
        if (this.shutDownRequested) {
            return;
        }
        if (this.isForeground()) {
            runnable.run();
            return;
        }
        this.pauseLock.lock();
        this.executor.submit(runnable);
        this.pauseLock.unlock();
    }

    private boolean isForeground() {
        if (this.setAsForegorund) {
            return true;
        }
        if (this.executor == null || this.executor.isShutdown() || this.executor.isTerminated() || this.executor.isTerminating()) {
            throw new RuntimeException("!isForground");
        }
        return false;
    }

    public void addTodo(final ChangeListener changeListener, final Statement s, final Runnable runnable) {
        this.submit(runnable);
    }

    private Collection<Lock> enterCriticalSection(final boolean readLockRequested) {
        this.pauseLock.lock();
        HashSet<Lock> locks = null;
        synchronized (this.sourceModels) {
            locks = new HashSet<Lock>((Collection<? extends Lock>)this.sourceModels);
        }
        for (final Lock l : locks) {
            l.enterCriticalSection(readLockRequested);
        }
        return locks;
    }

    public boolean isDisabled() {
        return this.isSyncDisabled || this.shutDownRequested;
    }

    public void notifyEventFrom(final Model srcModel, final Model dataModel, final Object event) {
        for (final StatementOpListener type : this.notifierList) {
            type.notifyEventFrom(this, srcModel, dataModel, event);
        }
    }

    public void statementFrom(final Model srcModel, final Model dataModel, final Statement s, final WhatToDo toDo) {
        for (final StatementOpListener type : this.notifierList) {
            type.statementFrom(this, srcModel, dataModel, s, toDo);
        }
    }

    public void statementsFrom(final Model srcModel, final Model dataModel, final WhatToDo toDo) {
        for (final StatementOpListener type : this.notifierList) {
            type.statementFroms(this, srcModel, dataModel, toDo);
        }
    }

    public void enableSync() {
        this.isSyncDisabled = false;
    }

    public void disableSync() {
        this.isSyncDisabled = true;
    }

    public void resyncNow() {
        final Collection<Lock> locks = this.enterCriticalSection(false);
        final boolean wasSyncDisabled = this.isSyncDisabled;
        try {
            this.isSyncDisabled = true;
            final Model memmodel = RepoDatasetFactory.createPrivateMemModel();
            synchronized (this.sourceModels) {
                for (final Model m1 : this.sourceModels) {
                    memmodel.add(m1);
                }
            }
            synchronized (this.destModels) {
                for (final Model m1 : this.destModels) {
                    m1.add(memmodel);
                }
            }
            this.memoryCache = memmodel;
        }
        finally {
            this.isSyncDisabled = wasSyncDisabled;
            exitCriticalSections(locks);
            this.pauseLock.unlock();
        }
    }

    public void completeSync() {
        this.catchup();
    }

    private void catchup() {
        this.pauseLock.lock();
        final ScheduledThreadPoolExecutor exec = this.executor;
        this.executor = new ScheduledThreadPoolExecutor(1);
        this.pauseLock.unlock();
        exec.shutdown();
        try {
            exec.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        }
        catch (InterruptedException ex) {}
    }

    static {
        StatementSync.theLogger = LoggerFactory.getLogger((Class)RepoDatasetFactory.class);
        StatementSync.syncPairs = new HashMap<Pair, StatementSync>();
    }

    public class BulkStatement implements Runnable
    {
        public final Model dataModel;
        Model srcModel;
        public final WhatToDo toDo;

        public BulkStatement(final Model srcModel, final Model dataModel, final WhatToDo todo) {
            this.srcModel = srcModel;
            this.dataModel = dataModel;
            this.toDo = todo;
        }

        @Override
        public void run() {
            StatementSync.this.statementsFrom(this.srcModel, this.dataModel, this.toDo);
        }
    }

    public class NotifyEvent implements Runnable
    {
        private final Model dataModel;
        private final Object event;
        Model srcModel;

        public NotifyEvent(final Model srcModel, final Object event, final Model dataModel) {
            this.event = event;
            this.dataModel = dataModel;
            this.srcModel = srcModel;
        }

        @Override
        public void run() {
            StatementSync.this.notifyEventFrom(this.srcModel, this.dataModel, this.event);
        }
    }

    public class StatementEvent implements Runnable
    {
        private final Statement s;
        Model srcModel;
        WhatToDo toDo;

        public StatementEvent(final Model srcModel, final Statement s, final WhatToDo tdDo) {
            this.s = s;
            this.srcModel = srcModel;
            this.toDo = tdDo;
        }

        @Override
        public void run() {
            StatementSync.this.statementFrom(this.srcModel, null, this.s, this.toDo);
        }
    }

    public class ChangeListener extends StatementListener implements ModelChangedListener
    {
        private boolean isDeaf;
        Model srcModel;

        public ChangeListener(final Model src) {
            this.srcModel = src;
        }

        public void addedStatement(final Statement s) {
            if (this.isDeaf()) {
                return;
            }
            this.addTodo(s, new StatementEvent(this.srcModel, s, WhatToDo.Add));
        }

        public void addedStatements(final Model dataModel) {
            if (this.isDeaf()) {
                return;
            }
            this.addTodo(dataModel, new BulkStatement(this.srcModel, dataModel, WhatToDo.Add));
        }

        private void addTodo(final Model dataModel, final Runnable runnable) {
            StatementSync.this.addTodo(this, dataModel, runnable);
        }

        private void addTodo(final Statement s, final Runnable runnable) {
            StatementSync.this.addTodo(this, s, runnable);
        }

        public boolean isDeaf() {
            return this.isDeaf || StatementSync.this.isDisabled();
        }

        public void notifyEvent(final Model dataModel, final Object event) {
            if (this.isDeaf()) {
                return;
            }
            this.addTodo(dataModel, new NotifyEvent(this.srcModel, event, dataModel));
        }

        public void removedStatement(final Statement s) {
            if (this.isDeaf()) {
                return;
            }
            this.addTodo(s, new StatementEvent(this.srcModel, s, WhatToDo.Remove));
        }

        public void removedStatements(final Model dataModel) {
            this.addTodo(dataModel, new BulkStatement(this.srcModel, dataModel, WhatToDo.Remove));
        }

        public void setDeaf(final boolean isDeaf) {
            this.isDeaf = isDeaf;
        }
    }

    public static class Pair<A, B>
    {
        private static final Object NIL;
        final A a;
        final B b;

        public static <L, R> Pair<L, R> create(final L x, final R y) {
            return new Pair<L, R>(x, y);
        }

        public Pair(final A a, final B b) {
            this.a = a;
            this.b = b;
        }

        public A car() {
            return this.a;
        }

        public B cdr() {
            return this.b;
        }

        private boolean equalObj(final Object cdr1, final Object cdr2) {
            return false;
        }

        @Override
        public boolean equals(final Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Pair)) {
                return false;
            }
            final Pair<?, ?> p2 = (Pair<?, ?>)other;
            return this.equalObj(this.car(), p2.car()) && this.equalObj(this.cdr(), p2.cdr());
        }

        public A getLeft() {
            return this.a;
        }

        public B getRight() {
            return this.b;
        }

        @Override
        public int hashCode() {
            return StatementSync.hashCodeObject(this.car()) ^ StatementSync.hashCodeObject(this.cdr()) << 1;
        }

        @Override
        public String toString() {
            final StringBuffer sBuffer = new StringBuffer(20).append("(").append(StatementSync.str(this.a));
            Object cdrObject;
            Pair cPair;
            for (cdrObject = this.b; cdrObject instanceof Pair; cdrObject = cPair.cdr()) {
                cPair = (Pair)this.b;
                sBuffer.append(" ").append(StatementSync.str(cPair.car()));
            }
            if (cdrObject == Pair.NIL) {
                return sBuffer.append(")").toString();
            }
            return sBuffer.append(" . ").append(StatementSync.str(cdrObject)).append(")").toString();
        }

        static {
            NIL = null;
        }
    }

    public abstract class StatementOpListener
    {
        public void notifyEventFrom(final StatementSync statementSync, final Model srcModel, final Model dataModel, final Object event) {
        }

        public abstract void statementFrom(final StatementSync p0, final Model p1, final Model p2, final Statement p3, final WhatToDo p4);

        public void statementFroms(final StatementSync statementSync, final Model srcModel, final Model dataModel, final WhatToDo toDo) {
            for (final Statement s : dataModel.listStatements().toList().toArray(new Statement[0])) {
                this.statementFrom(statementSync, srcModel, dataModel, s, toDo);
            }
        }
    }

    public class StatementOpListenerForModel extends StatementOpListener
    {
        Model destModel;
        protected boolean processesWholeModels;

        public StatementOpListenerForModel(final Model target) {
            this.destModel = target;
        }

        @Override
        public void notifyEventFrom(final StatementSync statementSync, final Model srcModel, final Model dataModel, final Object event) {
            super.notifyEventFrom(statementSync, srcModel, dataModel, event);
        }

        @Override
        public void statementFroms(final StatementSync statementSync, final Model srcModel, final Model dataModel, final WhatToDo toDo) {
            if (!this.processesWholeModels) {
                super.statementFroms(statementSync, srcModel, dataModel, toDo);
                return;
            }
            if (toDo == WhatToDo.Add) {
                this.destModel.add(dataModel);
            }
            else {
                this.destModel.remove(dataModel);
            }
        }

        @Override
        public void statementFrom(final StatementSync statementSync, final Model srcModel, final Model dataModel, final Statement s, final WhatToDo toDo) {
            if (toDo == WhatToDo.Add) {
                this.destModel.add(s);
            }
            else {
                this.destModel.remove(s);
            }
        }
    }

    enum WhatToDo
    {
        Add,
        Remove;
    }
}

/*

	Total time: 114 ms

*/