package org.opencyc.util;

import java.util.StringTokenizer;

public class Pair extends AbstractPair
{
    public Pair() {
    }
    
    public Pair(final Object component1, final Object component2) {
        super(component1, component2);
    }
    
    public static Pair parsePair(final String pairString) {
        final StringTokenizer components = new StringTokenizer(pairString, "()#");
        return new Pair(components.nextToken(), components.nextToken());
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 10 ms
	
	Decompiled with Procyon 0.5.32.
*/