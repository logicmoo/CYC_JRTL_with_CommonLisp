package org.appdapter.api.trigger;

import java.util.List;
import org.appdapter.core.debug.UIAnnotations;
import org.appdapter.core.jvm.GetObject;

@UIAnnotations.UIHidden
public interface Box<TrigType extends Trigger<? extends Box<TrigType>>> extends GetObject
{
    BoxContext getBoxContext();
    
     <T, E extends T> Iterable<E> getObjects(final Class<T> p0);
    
    List<TrigType> getTriggers();
    
    @Override
	Object getValue();
}

/*

	Total time: 16 ms
	
*/