package org.opencyc.util;

import org.opencyc.cycobject.CycObject;
import java.util.Date;

public interface TimeInterval
{
    Date getEnd();
    
    boolean getIncludesEnd();
    
    boolean getIncludesStart();
    
    Date getStart();
    
    boolean cooriginatesWith(final AbstractTimeInterval p0);
    
    boolean coterminatesWith(final AbstractTimeInterval p0);
    
    boolean endsAfter(final Date p0);
    
    boolean endsAfterEndingOf(final AbstractTimeInterval p0);
    
    boolean endsAfterStartingOf(final AbstractTimeInterval p0);
    
    boolean endsBefore(final Date p0);
    
    boolean endsBeforeEndingOf(final AbstractTimeInterval p0);
    
    boolean endsBeforeStartingOf(final AbstractTimeInterval p0);
    
    boolean endsDuring(final AbstractTimeInterval p0);
    
    boolean endsOn(final Date p0);
    
    boolean startsAfter(final Date p0);
    
    boolean startsAfterEndingOf(final AbstractTimeInterval p0);
    
    boolean startsAfterStartingOf(final AbstractTimeInterval p0);
    
    boolean startsBefore(final Date p0);
    
    boolean startsBeforeEndingOf(final AbstractTimeInterval p0);
    
    boolean startsBeforeStartingOf(final AbstractTimeInterval p0);
    
    boolean startsDuring(final AbstractTimeInterval p0);
    
    boolean startsOn(final Date p0);
    
    boolean subsumes(final AbstractTimeInterval p0);
    
    boolean subsumes(final Date p0);
    
    CycObject toCycTerm();
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 6 ms
	
	Decompiled with Procyon 0.5.32.
*/