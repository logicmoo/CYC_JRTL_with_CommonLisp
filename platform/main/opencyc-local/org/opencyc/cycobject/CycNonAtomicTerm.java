package org.opencyc.cycobject;

import java.util.List;

public interface CycNonAtomicTerm extends CycDenotationalTerm
{
    CycFort getFunctor();
    
    List getArguments();
    
    CycNaut getFormula();
    
    Object getArgument(final int p0);
    
    CycList toCycList();
    
    CycList toDeepCycList();
    
    int getArity();
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 4 ms
	
	Decompiled with Procyon 0.5.32.
*/