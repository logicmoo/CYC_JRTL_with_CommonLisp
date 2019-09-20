package org.opencyc.parser;

import java.util.Iterator;
import java.util.ArrayList;
import org.opencyc.cycobject.Guid;
import java.util.List;

public class InvalidConstantGuidException extends Exception
{
    private List invalidConstantGuids;
    
    public InvalidConstantGuidException(final Guid invalidConstantGuid) {
        (this.invalidConstantGuids = new ArrayList()).add(invalidConstantGuid);
    }
    
    public InvalidConstantGuidException() {
    }
    
    @Override
    public String getMessage() {
        final StringBuffer buf = new StringBuffer("Invalid constant GUID(s): ");
        if (this.getInvalidConstantNames() != null) {
            final Iterator iter = this.getInvalidConstantNames().iterator();
            while (iter.hasNext()) {
                buf.append("#G").append(iter.next());
                if (iter.hasNext()) {
                    buf.append(", ");
                }
            }
        }
        return buf.toString();
    }
    
    public void addInvalidConstantGuid(final Guid invalidConstantGuid) {
        if (this.invalidConstantGuids == null) {
            this.invalidConstantGuids = new ArrayList();
        }
        this.invalidConstantGuids.add(invalidConstantGuid);
    }
    
    public List getInvalidConstantNames() {
        return this.invalidConstantGuids;
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 32 ms
	
	Decompiled with Procyon 0.5.32.
*/