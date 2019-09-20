package org.opencyc.util.query;

import java.util.Set;

public interface QuerySpecification
{
    String getGloss();
    
    Object getQuestion();
    
    Set getConstraints();
    
    Set getFilteredConstraints(final Class p0);
    
    Object clone();
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 22 ms
	
	Decompiled with Procyon 0.5.32.
*/