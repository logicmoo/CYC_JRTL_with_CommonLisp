package org.appdapter.core.component;

import org.appdapter.core.name.Ident;
import org.appdapter.api.trigger.AnyOper;

public interface KnownComponent extends AnyOper.HasIdent
{
    @Override
	Ident getIdent();
    
    String getDescription();
    
    String getShortLabel();
}

/*

	Total time: 4 ms
	
*/