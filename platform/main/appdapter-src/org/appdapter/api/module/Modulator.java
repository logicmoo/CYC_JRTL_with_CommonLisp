package org.appdapter.api.module;

public interface Modulator<Ctx>
{
    void attachModule(final Module<Ctx> p0);
    
    void detachModule(final Module<Ctx> p0);
    
    int getAttachedModuleCount();
    
    void processOneBatch();
}

/*

	Total time: 4 ms
	
*/