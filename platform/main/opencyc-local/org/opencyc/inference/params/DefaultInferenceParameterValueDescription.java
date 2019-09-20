package org.opencyc.inference.params;

import java.util.Map;
import org.opencyc.cycobject.CycSymbol;

public class DefaultInferenceParameterValueDescription implements InferenceParameterValueDescription
{
    private Object value;
    private String shortDescription;
    private String longDescription;
    private static final CycSymbol VALUE_SYMBOL;
    private static final CycSymbol[] REQUIRED_SYMBOLS;
    
    public DefaultInferenceParameterValueDescription(final Map propertyMap) {
        if (propertyMap == null) {
            throw new RuntimeException("Got null property map");
        }
        if (propertyMap.size() < DefaultInferenceParameterValueDescription.REQUIRED_SYMBOLS.length) {
            throw new RuntimeException("Got too few symbols in map");
        }
        for (int i = 0, size = DefaultInferenceParameterValueDescription.REQUIRED_SYMBOLS.length; i < size; ++i) {
            if (propertyMap.get(DefaultInferenceParameterValueDescription.REQUIRED_SYMBOLS[i]) == null) {
                throw new RuntimeException("Expected key not found in map " + DefaultInferenceParameterValueDescription.REQUIRED_SYMBOLS[i] + " for inference Parameter value" + propertyMap.get(DefaultInferenceParameterValueDescription.VALUE_SYMBOL));
            }
        }
        final Object valueObj = propertyMap.get(DefaultInferenceParameterValueDescription.VALUE_SYMBOL);
        final Object shortDescObj = verifyObjectType(propertyMap, AbstractInferenceParameter.SHORT_DESC_SYMBOL, String.class);
        final Object longDescObj = verifyObjectType(propertyMap, AbstractInferenceParameter.LONG_DESC_SYMBOL, String.class);
        this.init(valueObj, (String)shortDescObj, (String)longDescObj);
    }
    
    DefaultInferenceParameterValueDescription(final Object value, final String shortDescription, final String longDescription) {
        this.init(value, shortDescription, longDescription);
    }
    
    public Object getValue() {
        return this.value;
    }
    
    public void setValue(final Object value) {
        this.value = value;
    }
    
    public String getLongDescription() {
        return this.longDescription;
    }
    
    public String getShortDescription() {
        return this.shortDescription;
    }
    
    @Override
    public boolean equals(final Object obj) {
        if (obj instanceof DefaultInferenceParameterValueDescription) {
            return ((DefaultInferenceParameterValueDescription)obj).getValue().equals(this.getValue());
        }
        return this.getValue().equals(obj);
    }
    
    @Override
    public int hashCode() {
        return this.getValue().hashCode();
    }
    
    @Override
    public String toString() {
        return this.getShortDescription();
    }
    
    static Object verifyObjectType(final Map<CycSymbol, Object> propertyMap, final CycSymbol property, final Class expectedType) {
        final Object propertyValueObj = propertyMap.get(property);
        if (!expectedType.isInstance(propertyValueObj)) {
            throw new RuntimeException("Expected a " + expectedType + " for " + property + "; got " + propertyValueObj);
        }
        return propertyValueObj;
    }
    
    private void init(final Object value, final String shortDescription, final String longDescription) {
        this.value = value;
        this.longDescription = longDescription;
        this.shortDescription = shortDescription;
    }
    
    public static void main(final String[] args) {
    }
    
    static {
        VALUE_SYMBOL = new CycSymbol(":VALUE");
        REQUIRED_SYMBOLS = new CycSymbol[] { DefaultInferenceParameterValueDescription.VALUE_SYMBOL, AbstractInferenceParameter.SHORT_DESC_SYMBOL, AbstractInferenceParameter.LONG_DESC_SYMBOL };
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 60 ms
	
	Decompiled with Procyon 0.5.32.
*/