package org.opencyc.cycobject;

import java.util.Collections;
import java.util.List;
import java.io.IOException;
import org.opencyc.xml.XMLWriter;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.text.NumberFormat;
import java.util.Locale;

public class CycNumber implements CycDenotationalTerm
{
    private final Number number;
    private Double doubleValue;
    
    private CycNumber() {
        this.doubleValue = null;
        this.number = null;
    }
    
    public CycNumber(final String numberString) {
        this.doubleValue = null;
        if (numberString == null) {
            throw new IllegalArgumentException("number string must not be null.");
        }
        try {
            final NumberFormat nf = NumberFormat.getInstance(Locale.ENGLISH);
            this.number = (Number)nf.parseObject(numberString);
        }
        catch (ParseException ex) {
            Logger.getLogger(CycNumber.class.getName()).log(Level.SEVERE, null, ex);
            throw new IllegalArgumentException(numberString + " must be a number");
        }
    }
    
    public CycNumber(final Number num) {
        this.doubleValue = null;
        if (num == null) {
            throw new IllegalArgumentException("Number must not be null.");
        }
        this.number = num;
    }
    
    public Number getNumber() {
        return this.number;
    }
    
    public boolean isGreaterThan(final CycNumber other) {
        return this.compareTo(other) > 0;
    }
    
    public String toXMLString() {
        return this.number.toString();
    }
    
    public void toXML(final XMLWriter xmlWriter, final int indent, final boolean relative) throws IOException {
        xmlWriter.print(this.toXMLString());
    }
    
    @Override
    public int hashCode() {
        return this.getNumber().hashCode();
    }
    
    @Override
    public boolean equals(final Object object) {
        return object instanceof CycNumber && this.getNumber().equals(((CycNumber)object).getNumber());
    }
    
    public boolean equalsAtEL(final Object object) {
        return this.getNumber().equals(object) || this.equals(object);
    }
    
    @Override
    public String toString() {
        if (this.number != null) {
            return this.number.toString();
        }
        return "[CycNumber: " + this.number + "]";
    }
    
    public Object cycListApiValue() {
        return this.getNumber();
    }
    
    public Object cycExpressionApiValue() {
        return this.getNumber();
    }
    
    public String cyclifyWithEscapeChars() {
        return this.cyclify();
    }
    
    public String stringApiValue() {
        return this.getNumber().toString();
    }
    
    public int compareTo(final Object o) {
        if (!(o instanceof CycNumber)) {
            throw new UnsupportedOperationException("Not supported yet.");
        }
        final CycNumber other = (CycNumber)o;
        final Class thisNumberClass = this.number.getClass();
        if (thisNumberClass.equals(other.number.getClass()) && Comparable.class.isAssignableFrom(thisNumberClass)) {
            return ((Comparable)this.number).compareTo(other.number);
        }
        return this.doubleValue().compareTo(other.doubleValue());
    }
    
    private synchronized Double doubleValue() {
        if (this.doubleValue == null) {
            this.doubleValue = this.number.doubleValue();
        }
        return this.doubleValue;
    }
    
    public String cyclify() {
        return this.stringApiValue();
    }
    
    public List getReferencedConstants() {
        return Collections.emptyList();
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 97 ms
	
	Decompiled with Procyon 0.5.32.
*/