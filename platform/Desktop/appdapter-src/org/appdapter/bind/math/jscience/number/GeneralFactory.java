package org.appdapter.bind.math.jscience.number;

import java.lang.reflect.Array;

public class GeneralFactory
{
    public static <AnyType> AnyType[] makeArrayForClass(final Class<AnyType> type, final int size) {
        return (AnyType[])Array.newInstance(type, size);
    }
}

/*

	Total time: 16 ms
	
*/