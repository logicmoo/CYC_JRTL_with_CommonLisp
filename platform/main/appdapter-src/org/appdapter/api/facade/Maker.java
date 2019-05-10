package org.appdapter.api.facade;

import org.appdapter.api.registry.Description;

public interface Maker<OT>
{
    OT makeObj();
    
    Description getRegistryDesc(final OT p0, final String p1);
}

/*

	Total time: 5 ms
	
*/