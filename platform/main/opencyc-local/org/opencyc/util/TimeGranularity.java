package org.opencyc.util;

import java.util.Date;

public enum TimeGranularity
{
    MILLISECOND(14), 
    SECOND(13), 
    MINUTE(12), 
    HOUR(11), 
    DAY(5), 
    WEEK(3), 
    MONTH(2), 
    YEAR(1);
    
    public static final int MILLISECONDS_IN_A_SECOND = 1000;
    public static final int SECONDS_IN_A_MINUTE = 60;
    public static final int MINUTES_IN_AN_HOUR = 60;
    public static final int MILLISECONDS_IN_A_MINUTE = 60000;
    public static final int MILLISECONDS_IN_AN_HOUR = 3600000;
    public static final long MILLISECONDS_IN_A_DAY = 86400000L;
    public static final long MILLISECONDS_IN_A_WEEK = 604800000L;
    public static final long MILLISECONDS_IN_A_NON_LEAP_YEAR = 31536000000L;
    public static final long MILLISECONDS_IN_A_LEAP_YEAR = 31622400000L;
    private int intValue;
    
    private TimeGranularity(final int intValue) {
        this.intValue = intValue;
    }
    
    public int intValue() {
        return this.intValue;
    }
    
    public static TimeGranularity guessGranularity(final Date date) {
        return guessGranularity(date.getTime());
    }
    
    public static TimeGranularity guessGranularity(final long millis) {
        if (millis % 1000L != 0L) {
            return TimeGranularity.MILLISECOND;
        }
        if (millis % 60000L != 0L) {
            return TimeGranularity.SECOND;
        }
        if (millis % 3600000L != 0L) {
            return TimeGranularity.MINUTE;
        }
        return TimeGranularity.DAY;
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 43 ms
	
	Decompiled with Procyon 0.5.32.
*/