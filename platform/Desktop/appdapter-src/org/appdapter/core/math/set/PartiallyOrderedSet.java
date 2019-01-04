package org.appdapter.core.math.set;

public interface PartiallyOrderedSet<V extends Comparable<V>> extends GeneralSet<V>
{
    boolean hasInfinum();
    
    boolean hasSupremum();
    
    V getInfinum();
    
    V getSupremum();
}

/*

	Total time: 3 ms
	
*/