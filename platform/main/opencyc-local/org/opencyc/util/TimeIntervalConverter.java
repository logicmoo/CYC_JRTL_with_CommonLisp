package org.opencyc.util;

import org.opencyc.cycobject.CycNaut;
import org.opencyc.cycobject.CycObject;

public class TimeIntervalConverter extends DataTypeConverter<TimeInterval>
{
    private static final TimeIntervalConverter SHARED_INSTANCE;
    
    public static TimeIntervalConverter getInstance() {
        return TimeIntervalConverter.SHARED_INSTANCE;
    }
    
    public static TimeInterval parseCycInterval(final CycObject cycObject) throws ParseException {
        return getInstance().fromCycTerm(cycObject);
    }
    
    protected CycObject toCycTerm(final TimeInterval obj) throws ParseException {
        return obj.toCycTerm();
    }
    
    protected TimeInterval fromCycTerm(final CycObject cycObject) throws ParseException {
        if (ContinuousTimeInterval.ALWAYS.toCycTerm().equals(cycObject)) {
            return (TimeInterval)ContinuousTimeInterval.ALWAYS;
        }
        if (TimePoint.NonFixedTimePoint.NOW.toCycTerm().equals(cycObject)) {
            return (TimeInterval)TimePoint.NonFixedTimePoint.NOW;
        }
        try {
            final CycNaut naut = (CycNaut)CycNaut.convertIfPromising((Object)cycObject);
            for (final ContinuousTimeInterval.TimeIntervalFunction tifn : ContinuousTimeInterval.TimeIntervalFunction.values()) {
                if (naut.getFunctor().equals((Object)tifn.cycConstant)) {
                    return (TimeInterval)tifn.constructTimeInterval(naut);
                }
            }
        }
        catch (ClassCastException ex) {}
        throw new ParseException("Couldn't convert " + cycObject);
    }
    
    static {
        SHARED_INSTANCE = new TimeIntervalConverter();
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 50 ms
	
	Decompiled with Procyon 0.5.32.
*/