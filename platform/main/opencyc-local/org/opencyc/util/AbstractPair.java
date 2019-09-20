package org.opencyc.util;

import java.io.Serializable;

public abstract class AbstractPair implements Serializable
{
    protected static final String beginChar = "(";
    protected static final String endChar = ")";
    protected static final String separatorChar = "#";
    protected static final String separators = "()#";
    public Object component1;
    public Object component2;
    
    public AbstractPair() {
    }
    
    public AbstractPair(final Object component1, final Object component2) {
        this.component1 = component1;
        this.component2 = component2;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o.getClass().equals(this.getClass()) && ((((AbstractPair)o).component1 == null && this.component1 == null) || (this.component1 != null && ((AbstractPair)o).component1.equals(this.component1))) && ((((AbstractPair)o).component2 == null && this.component2 == null) || (this.component2 != null && ((AbstractPair)o).component2.equals(this.component2)));
    }
    
    public boolean elementsEqual() {
        return this.component1.equals(this.component2);
    }
    
    @Override
    public int hashCode() {
        return ((this.component1 == null) ? 0 : this.component1.hashCode()) + ((this.component2 == null) ? 1 : this.component2.hashCode());
    }
    
    @Override
    public String toString() {
        return "(" + this.component1 + "#" + this.component2 + ")";
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 35 ms
	
	Decompiled with Procyon 0.5.32.
*/