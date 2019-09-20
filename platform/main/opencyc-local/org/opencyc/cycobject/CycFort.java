package org.opencyc.cycobject;

import java.io.Serializable;

public abstract class CycFort extends DefaultCycObject implements CycDenotationalTerm, Serializable
{
    protected boolean isInvalid;
    
    public CycFort() {
        this.isInvalid = false;
    }
    
    public int compareTo(final Object object) {
        if (this instanceof CycConstant) {
            if (object instanceof CycConstant) {
                return this.toString().compareTo(object.toString());
            }
            if (object instanceof CycNart) {
                return this.toString().compareTo(object.toString().substring(1));
            }
            throw new ClassCastException("Must be a CycFort object");
        }
        else {
            if (object instanceof CycNart) {
                return this.toString().compareTo(object.toString());
            }
            if (object instanceof CycConstant) {
                return this.toString().substring(1).compareTo(object.toString());
            }
            throw new ClassCastException("Must be a CycFort object");
        }
    }
    
    public abstract boolean equals(final Object p0);
    
    public abstract boolean equalsAtEL(final Object p0);
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 106 ms
	
	Decompiled with Procyon 0.5.32.
*/