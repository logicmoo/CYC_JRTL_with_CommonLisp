package org.opencyc.util;

public class CachedValue<V>
{
    private long timeEntered;
    private long keepAliveTimeMsecs;
    private V payload;
    
    CachedValue(final V payload, final long keepAliveTimeMsecs) {
        if (payload == null) {
            throw new IllegalArgumentException("Cannot accept null values.");
        }
        if (keepAliveTimeMsecs < 0L) {
            throw new IllegalArgumentException("Invalid keepAliveTime" + keepAliveTimeMsecs);
        }
        this.payload = payload;
        this.timeEntered = System.currentTimeMillis();
        this.keepAliveTimeMsecs = keepAliveTimeMsecs;
    }
    
    public V get() {
        return this.payload;
    }
    
    public long getEntryTime() {
        return this.timeEntered;
    }
    
    public boolean isExpired() {
        return this.keepAliveTimeMsecs != 0L && System.currentTimeMillis() - this.keepAliveTimeMsecs >= this.timeEntered;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == null) {
            return false;
        }
        if (o == this || o == this.payload) {
            return true;
        }
        if (!(o instanceof CachedValue)) {
            return o.equals(this.payload);
        }
        return ((CachedValue)o).payload.equals(this.payload);
    }
    
    @Override
    public String toString() {
        return "" + this.payload;
    }
    
    @Override
    public int hashCode() {
        return this.payload.hashCode();
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 53 ms
	
	Decompiled with Procyon 0.5.32.
*/