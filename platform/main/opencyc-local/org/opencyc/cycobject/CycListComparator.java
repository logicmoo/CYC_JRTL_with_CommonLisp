package org.opencyc.cycobject;

import java.util.Comparator;

public class CycListComparator implements Comparator
{
    @Override
    public int compare(final Object o1, final Object o2) {
        final String string1 = o1.toString();
        final String string2 = o2.toString();
        return string1.compareTo(string2);
    }
    
    @Override
    public boolean equals(final Object object) {
        return object instanceof CycListComparator;
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 22 ms
	
	Decompiled with Procyon 0.5.32.
*/