package org.opencyc.util.query;

import java.util.EventObject;

public class QueryChangeEvent extends EventObject
{
    private QueryEventReason reason;
    public static final QueryEventReason SPECIFICATION_CHANGED;
    public static final QueryEventReason DATA_AVAILABLE;
    public static final QueryEventReason STATUS_CHANGED;
    
    public QueryChangeEvent(final Query source, final QueryEventReason reason) {
        super(source);
        this.reason = reason;
    }
    
    public QueryEventReason getReason() {
        return this.reason;
    }
    
    public Query getQuery() {
        return (Query)this.getSource();
    }
    
    static {
        SPECIFICATION_CHANGED = new QueryEventReason("SPECIFICATION_CHANGED");
        DATA_AVAILABLE = new QueryEventReason("DATA_AVAILABLE");
        STATUS_CHANGED = new QueryEventReason("STATUS_CHANGED");
    }
    
    public static class QueryEventReason
    {
        public QueryEventReason(final String name) {
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 10 ms
	
	Decompiled with Procyon 0.5.32.
*/