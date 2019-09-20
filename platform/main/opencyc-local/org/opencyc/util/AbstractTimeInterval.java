package org.opencyc.util;

import java.util.Date;

public abstract class AbstractTimeInterval implements TimeInterval
{
    public boolean cooriginatesWith(final AbstractTimeInterval interval) {
        return !this.startsBeforeStartingOf(interval) && !this.startsAfterStartingOf(interval);
    }
    
    public boolean coterminatesWith(final AbstractTimeInterval interval) {
        return !this.endsBeforeEndingOf(interval) && !this.endsAfterEndingOf(interval);
    }
    
    public boolean endsAfter(final Date date) {
        return this.getEnd().after(date);
    }
    
    public boolean endsAfterEndingOf(final AbstractTimeInterval interval) {
        return this.endsAfter(interval.getEnd()) || (this.endsOn(interval.getEnd()) && !interval.getIncludesEnd());
    }
    
    public boolean endsAfterStartingOf(final AbstractTimeInterval interval) {
        return this.endsAfter(interval.getStart());
    }
    
    public boolean endsBefore(final Date date) {
        return !this.endsAfter(date) && !this.endsOn(date);
    }
    
    public boolean endsBeforeEndingOf(final AbstractTimeInterval interval) {
        return this.getEnd().before(interval.getEnd()) || (this.getEnd().equals(interval.getEnd()) && !this.getIncludesEnd() && interval.getIncludesEnd());
    }
    
    public boolean endsBeforeStartingOf(final AbstractTimeInterval interval) {
        return this.endsBefore(interval.getStart()) || (this.endsOn(interval.getStart()) && !this.getIncludesEnd());
    }
    
    public boolean endsDuring(final AbstractTimeInterval interval) {
        return interval.subsumes(this.getEnd()) || this.coterminatesWith(interval);
    }
    
    public boolean endsOn(final Date date) {
        return this.getEnd().equals(date) && this.getIncludesEnd();
    }
    
    @Override
    public boolean equals(final Object obj) {
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        final ContinuousTimeInterval other = (ContinuousTimeInterval)obj;
        return this.cooriginatesWith((AbstractTimeInterval)other) && this.coterminatesWith((AbstractTimeInterval)other);
    }
    
    public boolean startsAfter(final Date date) {
        return !this.startsBefore(date) && !this.startsOn(date);
    }
    
    public boolean startsAfterEndingOf(final AbstractTimeInterval interval) {
        return this.startsAfter(interval.getEnd()) || (this.startsOn(interval.getEnd()) && !interval.getIncludesEnd());
    }
    
    public boolean startsAfterStartingOf(final AbstractTimeInterval interval) {
        return this.getStart().after(interval.getStart()) || (this.getStart().equals(interval.getStart()) && !this.getIncludesStart() && interval.getIncludesStart());
    }
    
    public boolean startsBefore(final Date date) {
        return this.getStart().before(date);
    }
    
    public boolean startsBeforeEndingOf(final AbstractTimeInterval interval) {
        return this.startsBefore(interval.getEnd());
    }
    
    public boolean startsBeforeStartingOf(final AbstractTimeInterval interval) {
        return this.startsBefore(interval.getStart()) || (this.startsOn(interval.getStart()) && !interval.getIncludesStart());
    }
    
    public boolean startsDuring(final AbstractTimeInterval interval) {
        return interval.subsumes(this.getStart()) || this.cooriginatesWith(interval);
    }
    
    public boolean startsOn(final Date date) {
        return this.getStart().equals(date) && this.getIncludesStart();
    }
    
    public boolean subsumes(final Date date) {
        return !this.startsAfter(date) && !this.endsBefore(date);
    }
    
    public boolean subsumes(final AbstractTimeInterval interval) {
        return interval.startsDuring(this) && interval.endsDuring(this);
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 51 ms
	
	Decompiled with Procyon 0.5.32.
*/