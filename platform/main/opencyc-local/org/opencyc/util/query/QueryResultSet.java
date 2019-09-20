package org.opencyc.util.query;

import java.util.Date;
import java.util.Iterator;

public interface QueryResultSet
{
    Iterator<QueryResult> getResultSetIterator();
    
    Query getQuery();
    
    Date getTimeStamp();
    
    void addQueryResult(final QueryResult p0);
    
    Justification getJustificationForIndex(final int p0);
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 4 ms
	
	Decompiled with Procyon 0.5.32.
*/