package org.opencyc.parser;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class InvalidConstantNameException extends Exception
{
    private List invalidConstantNames;
    
    public InvalidConstantNameException(final String invalidConstantName) {
        (this.invalidConstantNames = new ArrayList()).add(invalidConstantName);
    }
    
    public InvalidConstantNameException() {
    }
    
    @Override
    public String getMessage() {
        final StringBuffer buf = new StringBuffer("Invalid constant name(s): ");
        if (this.getInvalidConstantNames() != null) {
            final Iterator iter = this.invalidConstantNames.iterator();
            while (iter.hasNext()) {
                buf.append("#$").append(iter.next());
                if (iter.hasNext()) {
                    buf.append(", ");
                }
            }
        }
        return buf.toString();
    }
    
    public void addInvalidConstantName(final String constantName) {
        if (this.invalidConstantNames == null) {
            this.invalidConstantNames = new ArrayList();
        }
        this.invalidConstantNames.add(constantName);
    }
    
    public List getInvalidConstantNames() {
        return this.invalidConstantNames;
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 31 ms
	
	Decompiled with Procyon 0.5.32.
*/