package org.appdapter.bind.math.jscience.calculus;

import java.math.BigDecimal;
import org.appdapter.core.math.number.Numeric;
import org.jscience.mathematics.number.Number;

abstract class NumberWrapper<NW extends NumberWrapper<NW, JSN>, JSN extends Number<JSN>> extends Number<NumberWrapper<NW, JSN>> implements Numeric<NumberWrapper<NW, JSN>>
{
    private JSN myJScienceNumber;

    protected JSN getJScienceNumber() {
        return this.myJScienceNumber;
    }

    protected RuntimeException downcastFailureException(final Class targetType) {
        return new RuntimeException("Cannot treat [" + this + "] as " + targetType);
    }

    public NumberWrapper(final JSN jsciNum) {
        this.myJScienceNumber = jsciNum;
    }

    @Override
	public long longValue() {
        return this.myJScienceNumber.longValue();
    }

    @Override
	public double doubleValue() {
        return this.myJScienceNumber.doubleValue();
    }

    @Override
	public BigDecimal decimalValue() {
        return this.myJScienceNumber.decimalValue();
    }

    @Override
	public int compareTo(final NumberWrapper<NW, JSN> otherNN) {
        return this.myJScienceNumber.compareTo((JSN)otherNN.getJScienceNumber());
    }
}

/*

	Total time: 30 ms

*/