package org.appdapter.module.basic;

import java.util.Iterator;
import java.util.ArrayList;
import org.appdapter.api.module.Module;
import java.util.List;
import org.appdapter.api.module.Modulator;
import org.appdapter.core.log.BasicDebugger;

public class BasicModulator<Ctx> extends BasicDebugger implements Modulator<Ctx>
{
    private List<Module<Ctx>> myModuleList;
    private Ctx myDefaultCtx;
    protected boolean myAutoDetachOnFinishFlag;

    public BasicModulator(final Ctx defCtx, final boolean autoDetachOnFinish) {
        this.myModuleList = new ArrayList<Module<Ctx>>();
        this.myDefaultCtx = defCtx;
        this.myAutoDetachOnFinishFlag = autoDetachOnFinish;
    }

    protected static boolean isModuleInActionState(final Module.State modState) {
        if (modState == null) {
            return false;
        }
        if (modState == Module.State.PRE_INIT || modState == Module.State.WAIT_TO_START || modState == Module.State.WAIT_TO_RUN_OR_STOP || modState == Module.State.POST_STOP || modState == Module.State.FAILED_STARTUP) {
            return false;
        }
        if (modState == Module.State.IN_INIT || modState == Module.State.IN_START || modState == Module.State.IN_RUN || modState == Module.State.IN_STOP) {
            return true;
        }
        throw new RuntimeException("Module in unknown state: " + modState);
    }

    protected void setDefaultContext(final Ctx ctx) {
        this.myDefaultCtx = ctx;
    }

    @Override
	public synchronized void attachModule(final Module<Ctx> m) {
        final Ctx prevCtx = (Ctx)m.getContext();
        if (prevCtx != null) {
            throw new RuntimeException("[" + this + "] cannot attach module [" + m + "] with existing context [" + prevCtx + "]");
        }
        final Module.State modState = m.getState();
        if (isModuleInActionState(modState)) {
            throw new RuntimeException("Modulator[" + this + "] cannot attach module [" + m + "] in action state [" + modState + "]");
        }
        m.setContext((Ctx)this.myDefaultCtx);
        this.myModuleList.add(m);
    }

    @Override
	public synchronized void detachModule(final Module<Ctx> m) {
        if (!this.myModuleList.contains(m)) {
            throw new RuntimeException("[" + this + "] cannot detach from module [" + m + "], it is not currently attached!");
        }
        final Module.State modState = m.getState();
        if (isModuleInActionState(modState)) {
            throw new RuntimeException("Modulator[" + this + "] cannot detach module [" + m + "] in action state [" + modState + "]");
        }
        m.setContext((Ctx)null);
        this.myModuleList.remove(m);
    }

    @Override
	public int getAttachedModuleCount() {
        return this.myModuleList.size();
    }

    @Override
	public synchronized void processOneBatch() {
        this.dumpModules();
        this.processFinishedModules();
        this.processStoppingModules();
        this.processRunningModules();
        this.processStartingModules();
        this.processInitingModules();
    }

    protected synchronized List<Module<Ctx>> getModulesMatchingStates(final Module.State... matchStates) {
        final List<Module<Ctx>> matches = new ArrayList<Module<Ctx>>();
        for (final Module cand : this.myModuleList) {
            final Module.State candState = cand.getState();
            for (final Module.State ms : matchStates) {
                if (candState == ms) {
                    matches.add((Module<Ctx>)cand);
                    break;
                }
            }
        }
        return matches;
    }

    protected synchronized List<Module<Ctx>> getModulesNotMatchingStates(final Module.State... excludedStates) {
        final List<Module<Ctx>> matches = new ArrayList<Module<Ctx>>();
        for (final Module cand : this.myModuleList) {
            final Module.State candState = cand.getState();
            boolean matchedExcluded = false;
            for (final Module.State ms : excludedStates) {
                if (candState == ms) {
                    matchedExcluded = true;
                    break;
                }
            }
            if (!matchedExcluded) {
                matches.add((Module<Ctx>)cand);
            }
        }
        return matches;
    }

    protected List<Module<Ctx>> getUnfinishedModules() {
        return this.getModulesNotMatchingStates(Module.State.POST_STOP, Module.State.FAILED_STARTUP);
    }

    protected List<Module<Ctx>> getFinishedModules() {
        return this.getModulesMatchingStates(Module.State.POST_STOP, Module.State.FAILED_STARTUP);
    }

    protected void processFinishedModules() {
        final List<Module<Ctx>> finishedModules = this.getModulesMatchingStates(Module.State.POST_STOP, Module.State.FAILED_STARTUP);
        for (final Module fm : finishedModules) {
            try {
                fm.releaseModule();
            }
            catch (Throwable t) {
                this.logError("Exception while releasing module [" + fm + "]", t);
            }
            finally {
                if (this.myAutoDetachOnFinishFlag) {
                    this.detachModule((org.appdapter.api.module.Module<Ctx>)fm);
                }
            }
        }
    }

    protected void processStoppingModules() {
        final List<Module<Ctx>> modulesEligibleToStop = this.getModulesMatchingStates(Module.State.WAIT_TO_RUN_OR_STOP);
        for (final Module mes : modulesEligibleToStop) {
            try {
                if (!mes.isStopRequested()) {
                    continue;
                }
                mes.stop();
            }
            catch (Throwable t) {
                this.logError("Exception while stopping module [" + mes + "]", t);
            }
        }
    }

    protected void processRunningModules() {
        final List<Module<Ctx>> modulesEligibleToRun = this.getModulesMatchingStates(Module.State.WAIT_TO_RUN_OR_STOP);
        for (final Module<Ctx> mer : modulesEligibleToRun) {
            try {
                mer.runOnce();
            }
            catch (Throwable t) {
                this.logError("Exception while running module [" + mer + "]", t);
            }
        }
    }

    protected void processStartingModules() {
        final List<Module<Ctx>> modulesEligibleToStart = this.getModulesMatchingStates(Module.State.WAIT_TO_START);
        for (final Module mes : modulesEligibleToStart) {
            try {
                mes.start();
            }
            catch (Throwable t) {
                this.logWarning("Exception while starting module [" + mes + "], marking module failed state", t);
                this.logWarning("Marking module failed state");
                mes.failDuringInitOrStartup();
            }
        }
    }

    protected void processInitingModules() {
        final List<Module<Ctx>> modulesEligibleToInit = this.getModulesMatchingStates(Module.State.PRE_INIT, null);
        for (final Module mei : modulesEligibleToInit) {
            try {
                mei.initModule();
            }
            catch (Throwable t) {
                this.logWarning("Exception while initing module [" + mei + "], marking module failed state", t);
                mei.failDuringInitOrStartup();
            }
        }
    }

    public void dumpModules() {
        if (this.checkDebugImportance(-10)) {
            this.logInfo(-10, "Module Dump: [" + this.myModuleList + "]");
        }
    }
}

/*

	Total time: 57 ms

*/