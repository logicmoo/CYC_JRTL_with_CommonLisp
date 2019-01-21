package org.appdapter.module.basic;

public class EmptyTimedModule<Ctx> extends TimedModule<Ctx>
{
    @Override
	protected void doInit(final Ctx ctx) {
    }
    
    @Override
	protected void doStart(final Ctx ctx) {
    }
    
    @Override
	protected void doRunOnce(final Ctx ctx, final long runSeqNum) {
    }
    
    @Override
	protected void doStop(final Ctx ctx) {
    }
    
    @Override
	protected void doRelease(final Ctx ctx) {
    }
}

/*

	Total time: 5 ms
	
*/