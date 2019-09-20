package org.opencyc.cycobject;

public class ELMtNart extends CycNart implements ELMt
{
    private ELMtNart(final CycNart nart) {
        super(nart.toCycList());
    }
    
    public static ELMtNart makeELMtNart(final CycNart nart) {
        return new ELMtNart(nart);
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 4 ms
	
	Decompiled with Procyon 0.5.32.
*/