package org.appdapter.module.basic;

import org.appdapter.api.module.Module;
import org.appdapter.bind.rdf.jena.assembly.KnownComponentImpl;

public abstract class BasicModule<Ctx> extends KnownComponentImpl implements Module<Ctx>
{
    private Ctx myContext;
    private Module.State myState;
    private boolean myStopRequestedFlag;
    
    public BasicModule() {
        this.myState = Module.State.PRE_INIT;
        this.myStopRequestedFlag = false;
    }
    
    public Module.State getState() {
        return this.myState;
    }
    
    public void markStopRequested() {
        this.myStopRequestedFlag = true;
    }
    
    public boolean isStopRequested() {
        return this.myStopRequestedFlag;
    }
    
    public Ctx getContext() {
        return this.myContext;
    }
    
    public synchronized void setContext(final Ctx m) {
        this.myContext = m;
    }
    
    protected void notifyStateViolation(final String detectingMethod, final String expectedStateDesc, final boolean throExcept) {
        final String msg = "[" + detectingMethod + "] found illegal state [" + this.myState + " instead of expected [" + expectedStateDesc + "]";
        this.logInfo(10, msg);
        if (throExcept) {
            throw new RuntimeException(msg);
        }
    }
    
    protected void verifyStoredState(final String checkingMethod, final boolean throExcept, final Module.State... allowedStates) {
        for (final Module.State s : allowedStates) {
            if (this.myState == s) {
                this.logInfo(-10, "[" + checkingMethod + "] verified storedState: " + this.myState);
                return;
            }
        }
        this.notifyStateViolation(checkingMethod, allowedStates.toString(), throExcept);
    }
    
    public synchronized void failDuringInitOrStartup() {
        this.verifyStoredState("failDuringInitOrStartup", true, Module.State.PRE_INIT, Module.State.IN_INIT, Module.State.WAIT_TO_START, Module.State.IN_START);
        this.myState = Module.State.FAILED_STARTUP;
    }
    
    protected synchronized void enterBasicInitModule(final boolean verifyPreInitState) {
        if (verifyPreInitState) {
            this.verifyStoredState("basicPreInitModule", true, Module.State.PRE_INIT);
        }
        this.myState = Module.State.IN_INIT;
    }
    
    protected synchronized void exitBasicInitModule(final boolean verifyInInitState) {
        if (verifyInInitState) {
            this.verifyStoredState("basicPostInitModule", true, Module.State.IN_INIT);
        }
        this.myState = Module.State.WAIT_TO_START;
    }
    
    protected synchronized void enterBasicStart() {
        this.verifyStoredState("enterBasicStart", true, Module.State.WAIT_TO_START);
        this.myState = Module.State.IN_START;
    }
    
    protected synchronized void exitBasicStart() {
        this.verifyStoredState("exitBasicStart", true, Module.State.IN_START);
        this.myState = Module.State.WAIT_TO_RUN_OR_STOP;
    }
    
    protected synchronized void enterBasicRunOnce() {
        this.verifyStoredState("enterBasicRunOnce", true, Module.State.WAIT_TO_RUN_OR_STOP);
        this.myState = Module.State.IN_RUN;
    }
    
    protected synchronized void exitBasicRunOnce() {
        this.verifyStoredState("exitBasicRunOnce", true, Module.State.IN_RUN);
        this.myState = Module.State.WAIT_TO_RUN_OR_STOP;
    }
    
    protected synchronized void enterBasicStop() {
        this.verifyStoredState("enterBasicStop", true, Module.State.WAIT_TO_RUN_OR_STOP);
        this.myState = Module.State.IN_STOP;
    }
    
    protected synchronized void exitBasicStop() {
        this.verifyStoredState("exitBasicStop", true, Module.State.IN_STOP);
        this.myState = Module.State.POST_STOP;
    }
    
    protected synchronized void enterBasicReleaseModule() {
        this.verifyStoredState("enterBasicReleaseModule", true, Module.State.POST_STOP, Module.State.FAILED_STARTUP);
    }
    
    protected synchronized void exitBasicReleaseModule() {
        this.verifyStoredState("exitBasicReleaseModule", true, Module.State.POST_STOP, Module.State.FAILED_STARTUP);
    }
    
    public String getFieldSummary() {
        return super.getFieldSummary() + ", state=" + this.myState + ", stopRQ=" + this.myStopRequestedFlag;
    }
}

/*

	Total time: 37 ms
	
*/