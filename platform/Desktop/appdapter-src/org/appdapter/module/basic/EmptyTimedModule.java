package org.appdapter.module.basic;

public class EmptyTimedModule<Ctx> extends TimedModule<Ctx>
{
    protected void doInit(final Ctx ctx) {
    }
    
    protected void doStart(final Ctx ctx) {
    }
    
    protected void doRunOnce(final Ctx ctx, final long runSeqNum) {
    }
    
    protected void doStop(final Ctx ctx) {
    }
    
    protected void doRelease(final Ctx ctx) {
    }
}

/*

	Total time: 5 ms
	
*/