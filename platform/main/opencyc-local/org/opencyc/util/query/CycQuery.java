package org.opencyc.util.query;

import org.opencyc.inference.InferenceStatus;

public interface CycQuery extends Query
{
    InferenceStatus getInferenceStatus();
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 4 ms
	
	Decompiled with Procyon 0.5.32.
*/