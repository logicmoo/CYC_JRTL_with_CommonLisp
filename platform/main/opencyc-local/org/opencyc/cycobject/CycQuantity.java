package org.opencyc.cycobject;

public class CycQuantity implements Comparable<CycQuantity>
{
    private final CycFort unitOfMeasure;
    private final Number minValue;
    private final Number maxValue;
    
    private CycQuantity(final CycFort unitOfMeasure, final Number minValue, final Number maxValue) {
        this.unitOfMeasure = unitOfMeasure;
        this.minValue = minValue;
        this.maxValue = maxValue;
    }
    
    public static CycQuantity valueOf(final CycList cycList) {
        if (cycList.size() < 2) {
            return null;
        }
        if (cycList.size() > 3) {
            return null;
        }
        final Object unit = cycList.first();
        if (unit instanceof CycFort) {
            final Object min = cycList.second();
            if (min instanceof Number) {
                final Object max = (cycList.size() > 2) ? cycList.third() : min;
                if (max instanceof Number) {
                    return new CycQuantity((CycFort)unit, (Number)min, (Number)max);
                }
            }
        }
        return null;
    }
    
    public static CycQuantity valueOf(final CycNaut naut) {
        if (naut.getArity() < 1) {
            return null;
        }
        if (naut.getArity() > 2) {
            return null;
        }
        final Object unit = naut.getOperator();
        if (unit instanceof CycFort) {
            final Object min = naut.getArg1();
            if (min instanceof Number) {
                final Object max = (naut.getArity() > 1) ? naut.getArg2() : min;
                if (max instanceof Number) {
                    return new CycQuantity((CycFort)unit, (Number)min, (Number)max);
                }
            }
        }
        return null;
    }
    
    @Override
    public String toString() {
        if (this.minValue.equals(this.maxValue)) {
            return "(" + this.unitOfMeasure + " " + this.minValue + ")";
        }
        return "(" + this.unitOfMeasure + " " + this.minValue + " " + this.maxValue + ")";
    }
    
    @Override
    public int compareTo(final CycQuantity o) {
        if (!o.unitOfMeasure.equals((Object)this.unitOfMeasure)) {
            return this.unitOfMeasure.compareTo((Object)o.unitOfMeasure);
        }
        if (o.minValue.equals(this.minValue)) {
            return compare(this.maxValue, o.maxValue);
        }
        return compare(this.minValue, o.minValue);
    }
    
    private static int compare(final Number num1, final Number num2) {
        if (num1 instanceof Integer && num2 instanceof Integer) {
            return ((Integer)num1).compareTo((Integer)num2);
        }
        if (num1 instanceof Long && num2 instanceof Long) {
            return ((Long)num1).compareTo((Long)num2);
        }
        final int intResult = Integer.valueOf(num1.intValue()).compareTo(Integer.valueOf(num2.intValue()));
        if (intResult != 0) {
            return intResult;
        }
        return Double.compare(num1.doubleValue(), num2.doubleValue());
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 58 ms
	
	Decompiled with Procyon 0.5.32.
*/