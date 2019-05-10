package org.appdapter.api.module;

public interface Module<Ctx>
{
    State getState();
    
    void setContext(final Ctx p0);
    
    Ctx getContext();
    
    void initModule();
    
    void start();
    
    void runOnce();
    
    void stop();
    
    void releaseModule();
    
    void markStopRequested();
    
    boolean isStopRequested();
    
    void failDuringInitOrStartup();
    
    public enum State
    {
        PRE_INIT, 
        IN_INIT, 
        WAIT_TO_START, 
        IN_START, 
        WAIT_TO_RUN_OR_STOP, 
        IN_RUN, 
        IN_STOP, 
        POST_STOP, 
        FAILED_STARTUP;
    }
}

/*

	Total time: 20 ms
	
*/