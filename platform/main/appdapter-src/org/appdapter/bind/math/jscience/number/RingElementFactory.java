package org.appdapter.bind.math.jscience.number;

import org.jscience.mathematics.structure.Ring;

public interface RingElementFactory<R extends Ring<R>>
{
    R getZero();
    
    R getOne();
    
    R[] makeArray(final int p0);
}

/*

	Total time: 4 ms
	
*/