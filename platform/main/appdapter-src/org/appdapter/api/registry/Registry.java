package org.appdapter.api.registry;

public interface Registry
{
    void registerObject(final Object p0, final Description p1);
    
     <OT> Finder<OT> getFinder(final Class<OT> p0);
}

/*

	Total time: 15 ms
	
*/