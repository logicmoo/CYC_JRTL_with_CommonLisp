package org.appdapter.core.name;

import org.appdapter.api.trigger.AnyOper;

public interface Ident extends AnyOper.HasIdent
{
    String getAbsUriString();
    
    String getLocalName();
}

/*

	Total time: 4 ms
	
*/