package org.appdapter.module.basic;

public class NullModule<Ctx> extends BasicModule<Ctx>
{
    @Override
	public synchronized void initModule() {
        this.enterBasicInitModule(true);
        this.logInfo(0, "initModule");
        this.exitBasicInitModule(true);
    }
    
    @Override
	public synchronized void start() {
        this.enterBasicStart();
        this.logInfo(0, "start");
        this.exitBasicStart();
    }
    
    @Override
	public synchronized void runOnce() {
        this.enterBasicRunOnce();
        this.logInfo(0, "runOnce");
        this.exitBasicRunOnce();
    }
    
    @Override
	public synchronized void stop() {
        this.enterBasicStop();
        this.logInfo(0, "stop");
        this.exitBasicStop();
    }
    
    @Override
	public synchronized void releaseModule() {
        this.enterBasicReleaseModule();
        this.logInfo(0, "releaseModule");
        this.exitBasicReleaseModule();
    }
}

/*

	Total time: 8 ms
	
*/