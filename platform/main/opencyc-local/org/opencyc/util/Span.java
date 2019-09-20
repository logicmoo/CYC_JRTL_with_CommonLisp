package org.opencyc.util;

public class Span extends AbstractPair
{
    public Span(final Object component1, final Object component2) {
        throw new IllegalArgumentException("Span components must be ints.");
    }
    
    public Span(final int start, final int end) {
        super((Object)start, (Object)end);
    }
    
    public int getStart() {
        return (int)this.component1;
    }
    
    public int getEnd() {
        return (int)this.component2;
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 8 ms
	
	Decompiled with Procyon 0.5.32.
*/