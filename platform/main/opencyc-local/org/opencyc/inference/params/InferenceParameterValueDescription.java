package org.opencyc.inference.params;

public interface InferenceParameterValueDescription
{
    void setValue(final Object p0);
    
    Object getValue();
    
    String getShortDescription();
    
    String getLongDescription();
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 4 ms
	
	Decompiled with Procyon 0.5.32.
*/