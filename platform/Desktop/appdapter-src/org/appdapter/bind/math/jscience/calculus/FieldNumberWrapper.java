package org.appdapter.bind.math.jscience.calculus;

import org.jscience.mathematics.number.Number;
import java.math.BigDecimal;
import org.appdapter.core.math.number.Numeric;
import org.jscience.mathematics.number.FieldNumber;

abstract class FieldNumberWrapper<FNW extends FieldNumberWrapper<FNW, JSFN>, JSFN extends FieldNumber<JSFN>> extends FieldNumber<FieldNumberWrapper<FNW, JSFN>> implements Numeric<FieldNumberWrapper<FNW, JSFN>>
{
    private JSFN myJScienceNumber;

    protected JSFN getJScienceNumber() {
        return this.myJScienceNumber;
    }

    protected RuntimeException downcastFailureException(final Class targetType) {
        return new RuntimeException("Cannot treat [" + this + "] as " + targetType);
    }

    public FieldNumberWrapper(final JSFN jsciNum) {
        this.myJScienceNumber = jsciNum;
    }

    public long longValue() {
        return this.myJScienceNumber.longValue();
    }

    public double doubleValue() {
        return this.myJScienceNumber.doubleValue();
    }

    public BigDecimal decimalValue() {
        return this.myJScienceNumber.decimalValue();
    }

    public int compareTo(final FieldNumberWrapper<FNW, JSFN> otherFN) {
        return this.myJScienceNumber.compareTo((JSFN)otherFN.getJScienceNumber());
    }
}

/*

	Total time: 32 ms

*/