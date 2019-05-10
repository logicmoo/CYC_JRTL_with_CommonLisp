package org.appdapter.core.math.set;

public interface TopologicalSet<V> extends GeneralSet<V>
{
    boolean isOpen();
    
    boolean isClosed();
    
    boolean isCompact();
    
    TopologicalSet<V> getFrontier();
    
    TopologicalSet<V> getClosure();
}

/*

	Total time: 4 ms
	
*/