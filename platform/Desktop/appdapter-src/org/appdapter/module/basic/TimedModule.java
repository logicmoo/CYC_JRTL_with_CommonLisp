package org.appdapter.module.basic;

public abstract class TimedModule<Ctx> extends BasicModule<Ctx>
{
    private long myCompletedRunCount;
    protected int myRunDebugModulus;
    
    public TimedModule() {
        this.myCompletedRunCount = 0L;
        this.myRunDebugModulus = 5;
    }
    
    public long getCompletedRunCount() {
        return this.myCompletedRunCount;
    }
    
    protected abstract void doInit(final Ctx p0);
    
    public synchronized void initModule() {
        this.enterBasicInitModule(true);
        final Ctx ctx = (Ctx)this.getContext();
        final Long beginStamp = this.logInfoEvent(10, true, (Long)null, ".doInit()-BEGIN", new Object[0]);
        this.doInit(ctx);
        this.logInfoEvent(0, true, beginStamp, ".doInit()-END", new Object[0]);
        this.exitBasicInitModule(true);
    }
    
    protected abstract void doStart(final Ctx p0);
    
    public synchronized void start() {
        this.enterBasicStart();
        final Ctx ctx = (Ctx)this.getContext();
        final Long beginStamp = this.logInfoEvent(0, true, (Long)null, ".doStart()-BEGIN", new Object[0]);
        this.doStart(ctx);
        this.logInfoEvent(0, true, beginStamp, ".doStart()-END", new Object[0]);
        this.exitBasicStart();
    }
    
    protected abstract void doRunOnce(final Ctx p0, final long p1);
    
    public synchronized void runOnce() {
        this.enterBasicRunOnce();
        final Ctx ctx = (Ctx)this.getContext();
        final int msgImportance = (this.myCompletedRunCount % this.myRunDebugModulus == 0L) ? 0 : -10;
        final Long startStamp = this.logInfoEvent(msgImportance, true, (Long)null, ".doRunOnce(seqNum=%d)-BEGIN", new Object[] { this.myCompletedRunCount });
        this.doRunOnce(ctx, this.myCompletedRunCount);
        this.logInfoEvent(msgImportance, true, startStamp, ".doRunOnce(seqNum=%d)-END", new Object[] { this.myCompletedRunCount });
        ++this.myCompletedRunCount;
        this.exitBasicRunOnce();
    }
    
    protected abstract void doStop(final Ctx p0);
    
    public synchronized void stop() {
        this.enterBasicStop();
        final Ctx ctx = (Ctx)this.getContext();
        final Long beginStamp = this.logInfoEvent(0, true, (Long)null, ".doStop()-BEGIN", new Object[0]);
        this.doStop(ctx);
        this.logInfoEvent(0, true, beginStamp, ".doStop()-END", new Object[0]);
        this.exitBasicStop();
    }
    
    protected abstract void doRelease(final Ctx p0);
    
    public synchronized void releaseModule() {
        this.enterBasicReleaseModule();
        final Ctx ctx = (Ctx)this.getContext();
        final Long beginStamp = this.logInfoEvent(0, true, (Long)null, ".doRelease()-BEGIN", new Object[0]);
        this.doRelease(ctx);
        this.logInfoEvent(0, true, beginStamp, ".doRelease()-END", new Object[0]);
        this.exitBasicReleaseModule();
    }
    
    public String getFieldSummary() {
        return super.getFieldSummary() + ", compRunCnt=" + this.getCompletedRunCount();
    }
}

/*

	Total time: 15 ms
	
*/