package org.appdapter.trigger.bind.jena;

import org.appdapter.api.trigger.MutableTrigger;
import org.appdapter.api.trigger.Box;

public interface FullTrigger<BoxType extends Box<? extends MutableTrigger<BoxType>>> extends MutableTrigger<BoxType>
{
    void fire(final BoxType p0);
}

/*

	Total time: 4 ms
	
*/