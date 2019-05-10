package org.appdapter.core.component;

import java.util.HashMap;
import org.appdapter.core.name.Ident;
import java.util.Map;
import org.appdapter.core.jvm.GetObject;

public class ComponentCache<MKC extends MutableKnownComponent> implements GetObject
{
    private Map<Ident, MKC> myCompCache;
    
    public ComponentCache() {
        this.myCompCache = new HashMap<Ident, MKC>();
    }
    
    public MKC getCachedComponent(final Ident id) {
        return this.myCompCache.get(id);
    }
    
    public void putCachedComponent(final Ident id, final MKC comp) {
        this.myCompCache.put(id, comp);
    }
    
    public Map<Ident, MKC> getCompCache() {
        return this.myCompCache;
    }
    
    @Override
	public Object getValue() {
        return this.myCompCache;
    }
}

/*

	Total time: 19 ms
	
*/