package org.opencyc.util;

import org.opencyc.cycobject.CycObject;
import java.util.Date;

public interface TimePoint extends TimeInterval
{
    Date asDate();
    
    public abstract static class AbstractTimePoint extends AbstractTimeInterval implements TimePoint
    {
        public Date getEnd() {
            return this.asDate();
        }
        
        public boolean getIncludesEnd() {
            return true;
        }
        
        public boolean getIncludesStart() {
            return true;
        }
        
        public Date getStart() {
            return this.asDate();
        }
    }
    
    public static class FixedTimePoint extends AbstractTimePoint implements TimePoint
    {
        final Date date;
        public static final FixedTimePoint BEGINNING_OF_TIME;
        public static final FixedTimePoint END_OF_TIME;
        
        public FixedTimePoint(final Date date) {
            this.date = date;
        }
        
        @Override
        public Date asDate() {
            return this.date;
        }
        
        public CycObject toCycTerm() {
            try {
                return (CycObject)DateConverter.getInstance().toCycTerm(this.asDate());
            }
            catch (ParseException ex) {
                throw new RuntimeException("Can't convert " + this.asDate() + " to a Cyc term.");
            }
        }
        
        static {
            BEGINNING_OF_TIME = new FixedTimePoint(new Date(Long.MIN_VALUE)) {
                @Override
                public CycObject toCycTerm() {
                    return (CycObject)ContinuousTimeInterval.CYC_BEGINNING_OF_TIME;
                }
            };
            END_OF_TIME = new FixedTimePoint(new Date(Long.MAX_VALUE)) {
                @Override
                public CycObject toCycTerm() {
                    return (CycObject)ContinuousTimeInterval.CYC_END_OF_TIME;
                }
            };
        }
    }
    
    public abstract static class NonFixedTimePoint extends AbstractTimePoint implements TimePoint
    {
        public static final NonFixedTimePoint NOW;
        
        static {
            NOW = new NonFixedTimePoint() {
                public CycObject toCycTerm() {
                    return (CycObject)ContinuousTimeInterval.CYC_NOW;
                }
                
                @Override
                public Date asDate() {
                    return new Date();
                }
            };
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 48 ms
	
	Decompiled with Procyon 0.5.32.
*/