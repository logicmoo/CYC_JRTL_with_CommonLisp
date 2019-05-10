package org.appdapter.api.trigger;

public interface MutableTrigger<BoxType extends Box<? extends MutableTrigger<BoxType>>> extends Trigger<BoxType>
{
    @Override
	void fire(final BoxType p0);
}

/*

	Total time: 5 ms
	
*/