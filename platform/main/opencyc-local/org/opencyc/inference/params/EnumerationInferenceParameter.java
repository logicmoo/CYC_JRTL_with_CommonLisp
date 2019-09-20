package org.opencyc.inference.params;

import java.util.List;

public interface EnumerationInferenceParameter extends InferenceParameter
{
    List<InferenceParameterValueDescription> getPotentialValues();
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 3 ms
	
	Decompiled with Procyon 0.5.32.
*/