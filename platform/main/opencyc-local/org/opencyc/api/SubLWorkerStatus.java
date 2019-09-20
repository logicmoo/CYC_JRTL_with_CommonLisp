package org.opencyc.api;

public class SubLWorkerStatus
{
    public static final SubLWorkerStatus NOT_STARTED_STATUS;
    public static final SubLWorkerStatus WORKING_STATUS;
    public static final SubLWorkerStatus CANCELED_STATUS;
    public static final SubLWorkerStatus ABORTED_STATUS;
    public static final SubLWorkerStatus FINISHED_STATUS;
    public static final SubLWorkerStatus EXCEPTION_STATUS;
    private String name;
    
    private SubLWorkerStatus(final String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    @Override
    public String toString() {
        return this.getName();
    }
    
    static {
        NOT_STARTED_STATUS = new SubLWorkerStatus("Not started");
        WORKING_STATUS = new SubLWorkerStatus("Working");
        CANCELED_STATUS = new SubLWorkerStatus("Canceled");
        ABORTED_STATUS = new SubLWorkerStatus("Aborted");
        FINISHED_STATUS = new SubLWorkerStatus("Finished");
        EXCEPTION_STATUS = new SubLWorkerStatus("Exception");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 11 ms
	
	Decompiled with Procyon 0.5.32.
*/