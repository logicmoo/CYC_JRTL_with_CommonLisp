package org.opencyc.api;

import org.opencyc.cycobject.CycFort;
import java.util.List;
import org.opencyc.cycobject.ELMt;

public interface KBTransaction
{
    void begin();
    
    void commit();
    
    void rollback();
    
    void noteForAssertion(final String p0, final ELMt p1, final boolean p2, final boolean p3, final boolean p4, final List<CycFort> p5);
    
    void noteForUnassertion(final String p0, final ELMt p1, final boolean p2, final boolean p3);
    
    void noteCreation(final CycFort p0);
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 5 ms
	
	Decompiled with Procyon 0.5.32.
*/