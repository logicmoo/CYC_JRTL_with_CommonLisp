package org.opencyc.util;

public class ComparableNumber extends Number implements Comparable<ComparableNumber>
{
    private final Number number;
    
    public ComparableNumber(final Number number) {
        this.number = number;
    }
    
    @Override
    public int intValue() {
        return this.number.intValue();
    }
    
    @Override
    public long longValue() {
        return this.number.longValue();
    }
    
    @Override
    public float floatValue() {
        return this.number.floatValue();
    }
    
    @Override
    public double doubleValue() {
        return this.number.doubleValue();
    }
    
    @Override
    public boolean equals(final Object obj) {
        ComparableNumber num;
        try {
            num = (ComparableNumber)obj;
        }
        catch (ClassCastException c) {
            return false;
        }
        return this.number.equals(num.getNumber());
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + ((this.number != null) ? this.number.hashCode() : 0);
        return hash;
    }
    
    @Override
    public int compareTo(final ComparableNumber o) {
        if (this.number.getClass().equals(o.getNumber().getClass())) {
            return ((Comparable)this.number).compareTo(o.getNumber());
        }
        return new Double(this.number.doubleValue()).compareTo(Double.valueOf(o.getNumber().doubleValue()));
    }
    
    public Number getNumber() {
        return this.number;
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 36 ms
	
	Decompiled with Procyon 0.5.32.
*/