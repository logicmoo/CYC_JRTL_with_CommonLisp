package org.opencyc.inference.params;

import org.opencyc.api.CycAccess;
import org.opencyc.cycobject.CycSymbol;
import java.util.Map;

public interface InferenceParameterDescriptions extends Map<CycSymbol, InferenceParameter>
{
    String stringApiValue();
    
    CycAccess getCycAccess();
    
    InferenceParameters getDefaultInferenceParameters();
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 16 ms
	
	Decompiled with Procyon 0.5.32.
*/