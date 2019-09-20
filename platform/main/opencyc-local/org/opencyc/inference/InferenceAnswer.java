package org.opencyc.inference;

import java.util.Collection;
import org.opencyc.cycobject.CycInformationSource;
import java.util.Map;
import java.io.IOException;
import org.opencyc.cycobject.CycVariable;

public interface InferenceAnswer
{
    Object getBinding(final CycVariable p0) throws IOException;
    
    Map<CycVariable, Object> getBindings() throws IOException;
    
    InferenceAnswerIdentifier getId();
    
    Collection<CycInformationSource> getSources(final CycInformationSource.CitationGenerator p0) throws IOException;
    
    int getAnswerID();
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 14 ms
	
	Decompiled with Procyon 0.5.32.
*/