package org.appdapter.api.trigger;

public interface Trigger<BoxType extends Box<? extends Trigger<BoxType>>>
{
    void fire(final BoxType p0);
}

/*

	Total time: 5 ms
	
*/