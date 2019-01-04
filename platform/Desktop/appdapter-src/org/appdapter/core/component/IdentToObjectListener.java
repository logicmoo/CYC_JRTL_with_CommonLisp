package org.appdapter.core.component;

import org.appdapter.core.name.Ident;

public interface IdentToObjectListener
{
    void registerURI(final Ident p0, final Object p1);
    
    void deregisterURI(final Ident p0, final Object p1);
}

/*

	Total time: 3 ms
	
*/