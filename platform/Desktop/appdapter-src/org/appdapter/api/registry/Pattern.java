package org.appdapter.api.registry;

import java.io.Serializable;

public interface Pattern extends Serializable
{
    boolean matches(final Description p0);
}

/*

	Total time: 4 ms
	
*/