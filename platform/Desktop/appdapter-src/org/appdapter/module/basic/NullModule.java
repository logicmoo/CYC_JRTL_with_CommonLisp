package org.appdapter.module.basic;

public class NullModule<Ctx> extends BasicModule<Ctx>
{
    public synchronized void initModule() {
        this.enterBasicInitModule(true);
        this.logInfo(0, "initModule");
        this.exitBasicInitModule(true);
    }
    
    public synchronized void start() {
        this.enterBasicStart();
        this.logInfo(0, "start");
        this.exitBasicStart();
    }
    
    public synchronized void runOnce() {
        this.enterBasicRunOnce();
        this.logInfo(0, "runOnce");
        this.exitBasicRunOnce();
    }
    
    public synchronized void stop() {
        this.enterBasicStop();
        this.logInfo(0, "stop");
        this.exitBasicStop();
    }
    
    public synchronized void releaseModule() {
        this.enterBasicReleaseModule();
        this.logInfo(0, "releaseModule");
        this.exitBasicReleaseModule();
    }
}

/*

	Total time: 8 ms
	
*/