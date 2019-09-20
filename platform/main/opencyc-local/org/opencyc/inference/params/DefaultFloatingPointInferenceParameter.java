package org.opencyc.inference.params;

import org.opencyc.api.CycObjectFactory;
import java.util.Map;
import org.opencyc.cycobject.CycSymbol;

public class DefaultFloatingPointInferenceParameter extends AbstractInferenceParameter implements FloatingPointInferenceParameter
{
    private double maxValue;
    private double minValue;
    private static final CycSymbol MAX_VALUE_SYMBOL;
    private static final CycSymbol MIN_VALUE_SYMBOL;
    private static final CycSymbol[] REQUIRED_SYMBOLS;
    
    public DefaultFloatingPointInferenceParameter(final Map propertyMap) {
        super(propertyMap);
        for (int i = 0, size = DefaultFloatingPointInferenceParameter.REQUIRED_SYMBOLS.length; i < size; ++i) {
            if (propertyMap.get(DefaultFloatingPointInferenceParameter.REQUIRED_SYMBOLS[i]) == null) {
                throw new RuntimeException("Expected key not found in map " + DefaultFloatingPointInferenceParameter.REQUIRED_SYMBOLS[i] + " for inference parameter " + propertyMap.get(AbstractInferenceParameter.ID_SYMBOL));
            }
        }
        final Object maxValueObj = DefaultInferenceParameterValueDescription.verifyObjectType(propertyMap, DefaultFloatingPointInferenceParameter.MAX_VALUE_SYMBOL, (Class)Number.class);
        final Object minValueObj = DefaultInferenceParameterValueDescription.verifyObjectType(propertyMap, DefaultFloatingPointInferenceParameter.MIN_VALUE_SYMBOL, (Class)Number.class);
        this.init(((Number)maxValueObj).doubleValue(), ((Number)minValueObj).doubleValue());
    }
    
    public boolean isValidValue(final Object potentialValue) {
        if (this.isAlternateValue(potentialValue)) {
            return true;
        }
        if (DefaultInferenceParameters.isInfiniteValue(potentialValue)) {
            return true;
        }
        if (!(potentialValue instanceof Number)) {
            return false;
        }
        final double potentialDouble = ((Number)potentialValue).doubleValue();
        return potentialDouble <= this.maxValue && potentialDouble >= this.minValue;
    }
    
    public double getMaxValue() {
        return this.maxValue;
    }
    
    public double getMinValue() {
        return this.minValue;
    }
    
    public String toString() {
        return super.toString() + " min=" + this.minValue + " max=" + this.maxValue;
    }
    
    public Object canonicalizeValue(final Object value) {
        if ((value != null && "PlusInfinity".equals(value.toString())) || CycObjectFactory.nil.equals(value)) {
            return DefaultInferenceParameters.getInfiniteValue();
        }
        return super.canonicalizeValue(value);
    }
    
    public Object parameterValueCycListApiValue(final Object val) {
        return val;
    }
    
    private void init(final double maxValue, final double minValue) {
        this.maxValue = maxValue;
        this.minValue = minValue;
    }
    
    public static void main(final String[] args) {
    }
    
    static {
        MAX_VALUE_SYMBOL = new CycSymbol(":MAX-VALUE");
        MIN_VALUE_SYMBOL = new CycSymbol(":MIN-VALUE");
        REQUIRED_SYMBOLS = new CycSymbol[] { DefaultFloatingPointInferenceParameter.MAX_VALUE_SYMBOL, DefaultFloatingPointInferenceParameter.MIN_VALUE_SYMBOL };
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 59 ms
	
	Decompiled with Procyon 0.5.32.
*/