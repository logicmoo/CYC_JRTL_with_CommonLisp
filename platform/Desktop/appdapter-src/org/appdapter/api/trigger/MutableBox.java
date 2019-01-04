package org.appdapter.api.trigger;

public interface MutableBox<TrigType extends Trigger<? extends MutableBox<TrigType>>> extends Box<TrigType>
{
    void attachTrigger(final TrigType p0);
    
    void clearTriggers();
    
    void setContext(final BoxContext p0);
}

/*

	Total time: 5 ms
	
*/