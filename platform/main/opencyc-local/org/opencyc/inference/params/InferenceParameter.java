package org.opencyc.inference.params;

import org.opencyc.cycobject.CycSymbol;
import org.opencyc.cycobject.CycFort;

public interface InferenceParameter
{
    Object parameterValueCycListApiValue(final Object p0);
    
    Object canonicalizeValue(final Object p0);
    
    CycFort getId();
    
    CycSymbol getKeyword();
    
    String getShortDescription();
    
    String getLongDescription();
    
    String getPrettyRepresentation(final Object p0);
    
    InferenceParameterValueDescription getAlternateValue();
    
    boolean isAlternateValue(final Object p0);
    
    boolean isValidValue(final Object p0);
    
    boolean isBasicParameter();
    
    boolean isQueryStaticParameter();
    
    Object getDefaultValue();
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 4 ms
	
	Decompiled with Procyon 0.5.32.
*/