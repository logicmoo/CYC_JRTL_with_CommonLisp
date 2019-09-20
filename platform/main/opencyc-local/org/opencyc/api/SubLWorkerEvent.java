package org.opencyc.api;

import org.opencyc.util.StringUtils;
import java.util.EventObject;

public class SubLWorkerEvent extends EventObject
{
    private SubLWorkerStatus status;
    private Exception e;
    private Object newData;
    private Integer workerId;
    private SubLWorkerEventType eventType;
    private float percentComplete;
    public static final SubLWorkerEventType STARTING_EVENT_TYPE;
    public static final SubLWorkerEventType DATA_AVAILABLE_EVENT_TYPE;
    public static final SubLWorkerEventType TERMINATION_EVENT_TYPE;
    
    public SubLWorkerEvent(final SubLWorker source, final Integer workerId) {
        super(source);
        this.e = null;
        this.newData = null;
        this.workerId = workerId;
        this.eventType = SubLWorkerEvent.STARTING_EVENT_TYPE;
    }
    
    public SubLWorkerEvent(final SubLWorker source, final Object newData, final float percentComplete) {
        super(source);
        this.e = null;
        this.newData = null;
        this.newData = newData;
        this.percentComplete = percentComplete;
        this.eventType = SubLWorkerEvent.DATA_AVAILABLE_EVENT_TYPE;
    }
    
    public SubLWorkerEvent(final SubLWorker source, final SubLWorkerStatus status, final Exception e) {
        super(source);
        this.e = null;
        this.newData = null;
        this.e = e;
        this.status = status;
        this.eventType = SubLWorkerEvent.TERMINATION_EVENT_TYPE;
    }
    
    public SubLWorker getWorker() {
        return (SubLWorker)this.getSource();
    }
    
    public SubLWorkerEventType getEventType() {
        return this.eventType;
    }
    
    public Exception getException() {
        return this.e;
    }
    
    public SubLWorkerStatus getStatus() {
        return this.status;
    }
    
    public float getPercentComplete() {
        return this.percentComplete;
    }
    
    public Object getWork() {
        return this.newData;
    }
    
    public Integer getId() {
        return this.workerId;
    }
    
    @Override
    public String toString() {
        return this.toString(2);
    }
    
    public String toString(final int indentLength) {
        final StringBuilder nlBuff = new StringBuilder();
        nlBuff.append(System.getProperty("line.separator"));
        for (int i = 1; i < indentLength; ++i) {
            nlBuff.append(" ");
        }
        final String nl = nlBuff.toString();
        final String sp = " ";
        final StringBuilder buf = new StringBuilder(sp + this.getClass().getName());
        buf.append(":").append(nl).append("Event type: ").append(this.getEventType().getName()).append(nl).append("SubLWorker: ").append(this.getWorker().toString(indentLength + 2));
        if (this.getEventType() == SubLWorkerEvent.STARTING_EVENT_TYPE) {
            buf.append(nl).append("Worker id: ").append(this.getId());
        }
        else if (this.getEventType() == SubLWorkerEvent.DATA_AVAILABLE_EVENT_TYPE) {
            buf.append(nl).append("Percent complete: ").append(this.getPercentComplete()).append(nl).append("Latest results: ").append(this.getWork());
        }
        else {
            buf.append(nl).append("Status: ").append(this.getStatus()).append(nl).append("Exception: ").append(StringUtils.getStringForException((Throwable)this.getException()));
        }
        return buf.toString();
    }
    
    static {
        STARTING_EVENT_TYPE = new SubLWorkerEventType("Starting");
        DATA_AVAILABLE_EVENT_TYPE = new SubLWorkerEventType("Data available");
        TERMINATION_EVENT_TYPE = new SubLWorkerEventType("Terminated");
    }
    
    public static class SubLWorkerEventType
    {
        private String name;
        
        public String getName() {
            return this.name;
        }
        
        @Override
        public String toString() {
            return this.getName();
        }
        
        private SubLWorkerEventType(final String name) {
            this.name = name;
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 59 ms
	
	Decompiled with Procyon 0.5.32.
*/