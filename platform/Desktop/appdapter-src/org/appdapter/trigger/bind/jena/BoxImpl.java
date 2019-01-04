package org.appdapter.trigger.bind.jena;

import java.util.Iterator;
import java.util.HashSet;
import java.util.Arrays;
import org.appdapter.api.trigger.Trigger;

public class BoxImpl<TrigType extends Trigger<? extends ABoxImpl<TrigType>>> extends ABoxImpl<TrigType>
{
    public Iterable<Object> getObjects() {
        final Object o = this.getValue();
        if (o != null && o != this) {
            return Arrays.asList(o, this, this.getIdent(), this.getShortLabel());
        }
        return Arrays.asList(this, this.getIdent(), this.getShortLabel());
    }
    
    public <T, E extends T> Iterable<E> getObjects(final Class<T> type) {
        final HashSet<E> objs = new HashSet<E>();
        for (final Object o : this.getObjects()) {
            if (type.isInstance(o)) {
                objs.add((E)o);
            }
        }
        return objs;
    }
    
    public Object getValue() {
        return this;
    }
}

/*

	Total time: 28 ms
	
*/