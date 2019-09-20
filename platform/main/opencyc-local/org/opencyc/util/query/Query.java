package org.opencyc.util.query;

public interface Query
{
    Object getId();
    
    QuerySpecification getOriginalQuerySpecification();
    
    QuerySpecification getQuerySpecification();
    
    void setQuerySpecification(final QuerySpecification p0);
    
    void revertQuerySpecification();
    
    QueryStatus getQueryStatus();
    
    void setQueryStatus(final QueryStatus p0);
    
    QueryResultSet getQueryResultSet();
    
    void setQueryResultSet(final QueryResultSet p0);
    
    void startQuery();
    
    void stopQuery();
    
    void pauseQuery();
    
    void continueQuery();
    
    void addQueryListener(final QueryListener p0);
    
    void removeQueryListener(final QueryListener p0);
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 4 ms
	
	Decompiled with Procyon 0.5.32.
*/