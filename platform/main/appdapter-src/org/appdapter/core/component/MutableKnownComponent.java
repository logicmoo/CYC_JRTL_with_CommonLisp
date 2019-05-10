package org.appdapter.core.component;

import org.appdapter.core.name.Ident;

public interface MutableKnownComponent extends KnownComponent
{
    void setIdent(final Ident p0);
    
    void setDescription(final String p0);
    
    void setShortLabel(final String p0);
}

/*

	Total time: 4 ms
	
*/