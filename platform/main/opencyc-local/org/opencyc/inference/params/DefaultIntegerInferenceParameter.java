package org.opencyc.inference.params;

import org.opencyc.api.CycObjectFactory;
import org.opencyc.cycobject.CycList;
import org.opencyc.cycobject.CycFort;
import java.util.Map;
import org.opencyc.cycobject.CycSymbol;

public class DefaultIntegerInferenceParameter extends AbstractInferenceParameter implements IntegerInferenceParameter
{
    private long maxValue;
    private long minValue;
    private static final CycSymbol MAX_VALUE_SYMBOL;
    private static final CycSymbol MIN_VALUE_SYMBOL;
    private static final CycSymbol[] REQUIRED_SYMBOLS;
    public static final CycSymbol POSITIVE_INFINITY;
    
    public DefaultIntegerInferenceParameter(final Map<CycSymbol, Object> propertyMap) {
        super((Map)propertyMap);
        for (int i = 0, size = DefaultIntegerInferenceParameter.REQUIRED_SYMBOLS.length; i < size; ++i) {
            if (propertyMap.get(DefaultIntegerInferenceParameter.REQUIRED_SYMBOLS[i]) == null) {
                throw new RuntimeException("Expected key not found in map " + DefaultIntegerInferenceParameter.REQUIRED_SYMBOLS[i] + " for inference parameter " + propertyMap.get(AbstractInferenceParameter.ID_SYMBOL));
            }
        }
        final Object maxValObj = DefaultInferenceParameterValueDescription.verifyObjectType((Map)propertyMap, DefaultIntegerInferenceParameter.MAX_VALUE_SYMBOL, (Class)Number.class);
        final Object minValObj = DefaultInferenceParameterValueDescription.verifyObjectType((Map)propertyMap, DefaultIntegerInferenceParameter.MIN_VALUE_SYMBOL, (Class)Number.class);
        this.init(((Number)maxValObj).longValue(), ((Number)minValObj).longValue());
    }
    
    protected DefaultIntegerInferenceParameter(final Object defaultValue, final CycSymbol keyword, final CycFort id, final String shortDescription, final String longDescription, final CycSymbol isBasicParameter, final CycSymbol isQueryStaticParameter, final CycList alternateValue, final Number minValue, final Number maxValue) {
        super(defaultValue, keyword, id, shortDescription, longDescription, isBasicParameter, isQueryStaticParameter, alternateValue);
        this.init(maxValue.longValue(), minValue.longValue());
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
        final long potentialLong = ((Number)potentialValue).longValue();
        return potentialLong <= this.maxValue && potentialLong >= this.minValue;
    }
    
    public Object canonicalizeValue(final Object value) {
        if (value != null && this.isNoncanonicalInfiniteValue(value)) {
            return DefaultInferenceParameters.getInfiniteValue();
        }
        return super.canonicalizeValue(value);
    }
    
    public long getMaxValue() {
        return this.maxValue;
    }
    
    public long getMinValue() {
        return this.minValue;
    }
    
    public String toString() {
        return super.toString() + " min=" + this.minValue + " max=" + this.maxValue;
    }
    
    public Object parameterValueCycListApiValue(final Object val) {
        if (DefaultInferenceParameters.isInfiniteValue(val)) {
            return this.getInfiniteValueCycListApiValue();
        }
        return val;
    }
    
    private void init(final long maxValue, final long minValue) {
        this.maxValue = maxValue;
        this.minValue = minValue;
    }
    
    private boolean isNoncanonicalInfiniteValue(final Object value) {
        return "PlusInfinity".equals(value.toString()) || CycObjectFactory.nil.equals(value) || ":POSITIVE-INFINITY".equals(value.toString());
    }
    
    private Object getInfiniteValueCycListApiValue() {
        if (this.useNilForInfiniteValue()) {
            return CycObjectFactory.nil;
        }
        return DefaultIntegerInferenceParameter.POSITIVE_INFINITY;
    }
    
    private boolean useNilForInfiniteValue() {
        final InferenceParameterValueDescription alternateValue = this.getAlternateValue();
        return alternateValue != null && alternateValue.getValue() == null;
    }
    
    static {
        MAX_VALUE_SYMBOL = new CycSymbol(":MAX-VALUE");
        MIN_VALUE_SYMBOL = new CycSymbol(":MIN-VALUE");
        REQUIRED_SYMBOLS = new CycSymbol[] { DefaultIntegerInferenceParameter.MAX_VALUE_SYMBOL, DefaultIntegerInferenceParameter.MIN_VALUE_SYMBOL };
        POSITIVE_INFINITY = CycObjectFactory.makeCycSymbol(":POSITIVE-INFINITY");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 76 ms
	
	Decompiled with Procyon 0.5.32.
*/