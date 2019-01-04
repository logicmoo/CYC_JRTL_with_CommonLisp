package org.appdapter.api.trigger;

import org.appdapter.core.component.KnownComponent;
import org.appdapter.core.name.Ident;
import org.appdapter.core.debug.UIAnnotations;

public interface AnyOper extends UIAnnotations
{
    @UIAnnotations.UISalient(ApplyToClass = "HASIDENT")
    public interface HasIdent extends UIAnnotations.ApplyToClassInterfaces
    {
        public static final Class HASIDENT = KnownComponent.class;
        
        @UIAnnotations.UISalient(MenuName = "Show Ident", ToValueMethod = "toString")
        Ident getIdent();
    }
}

/*

	Total time: 17 ms
	
*/