package org.opencyc.util.query;

public class QueryStatus
{
    private String text;
    public static final QueryStatus READY;
    public static final QueryStatus WORKING;
    public static final QueryStatus PAUSED;
    public static final QueryStatus FINISHED;
    
    protected QueryStatus(final String s) {
        this.text = s;
    }
    
    @Override
    public String toString() {
        return this.text;
    }
    
    static {
        READY = new QueryStatus("Ready");
        WORKING = new QueryStatus("Working");
        PAUSED = new QueryStatus("Paused");
        FINISHED = new QueryStatus("Finished");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 6 ms
	
	Decompiled with Procyon 0.5.32.
*/