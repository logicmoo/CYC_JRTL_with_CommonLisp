package org.opencyc.inference.params;

import java.util.Collections;
import java.util.Collection;
import org.opencyc.cycobject.CycList;
import org.opencyc.cycobject.CycFort;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Map;
import org.opencyc.cycobject.CycSymbol;
import java.util.List;

public class DefaultEnumerationInferenceParameter extends AbstractInferenceParameter implements EnumerationInferenceParameter
{
    private List<InferenceParameterValueDescription> potentialValues;
    private static final CycSymbol POTENTIAL_VALUES_SYMBOL;
    private static final CycSymbol[] REQUIRED_SYMBOLS;
    
    public DefaultEnumerationInferenceParameter(final Map propertyMap) {
        super(propertyMap);
        this.potentialValues = new ArrayList<InferenceParameterValueDescription>() {
            @Override
            public boolean contains(final Object obj) {
                final Iterator iter = this.iterator();
                while (iter.hasNext()) {
                    if (iter.next().equals(obj)) {
                        return true;
                    }
                }
                return false;
            }
        };
        for (int i = 0, size = DefaultEnumerationInferenceParameter.REQUIRED_SYMBOLS.length; i < size; ++i) {
            if (propertyMap.get(DefaultEnumerationInferenceParameter.REQUIRED_SYMBOLS[i]) == null) {
                throw new RuntimeException("Expected key not found in map " + DefaultEnumerationInferenceParameter.REQUIRED_SYMBOLS[i] + " for inference parameter " + propertyMap.get(AbstractInferenceParameter.ID_SYMBOL));
            }
        }
        final Object potentialValuesObj = DefaultInferenceParameterValueDescription.verifyObjectType(propertyMap, DefaultEnumerationInferenceParameter.POTENTIAL_VALUES_SYMBOL, (Class)List.class);
        this.init((List)potentialValuesObj);
    }
    
    DefaultEnumerationInferenceParameter(final Object defaultValue, final CycSymbol keyword, final CycFort id, final String shortDescription, final String longDescription, final CycSymbol isBasicParameter, final CycSymbol isQueryStaticParameter, final CycList alternateValue, final List<InferenceParameterValueDescription> potentialValues) {
        super(defaultValue, keyword, id, shortDescription, longDescription, isBasicParameter, isQueryStaticParameter, alternateValue);
        (this.potentialValues = new ArrayList<InferenceParameterValueDescription>() {
            @Override
            public boolean contains(final Object obj) {
                final Iterator iter = this.iterator();
                while (iter.hasNext()) {
                    if (iter.next().equals(obj)) {
                        return true;
                    }
                }
                return false;
            }
        }).addAll(potentialValues);
        this.potentialValues = Collections.unmodifiableList((List<? extends InferenceParameterValueDescription>)this.potentialValues);
    }
    
    public boolean isValidValue(final Object potentialValue) {
        return this.isAlternateValue(potentialValue) || this.potentialValues.contains(potentialValue);
    }
    
    public List<InferenceParameterValueDescription> getPotentialValues() {
        return this.potentialValues;
    }
    
    public String getPrettyRepresentation(final Object value) {
        for (final InferenceParameterValueDescription description : this.getPotentialValues()) {
            if (description.getValue().equals(value)) {
                return description.getShortDescription();
            }
        }
        return super.getPrettyRepresentation(value);
    }
    
    public String toString() {
        String str = super.toString() + " values={";
        final Iterator iterator = this.getPotentialValues().iterator();
        while (iterator.hasNext()) {
            final Object value = iterator.next();
            str += value.toString();
            if (iterator.hasNext()) {
                str += ",";
            }
            else {
                str += "}";
            }
        }
        return str;
    }
    
    public Object parameterValueCycListApiValue(final Object val) {
        return val;
    }
    
    private void init(final List potentialValues) {
        if (potentialValues == null) {
            throw new IllegalArgumentException("Got null potentialValues");
        }
        for (final Object potentialValueObj : potentialValues) {
            if (!(potentialValueObj instanceof CycList)) {
                throw new RuntimeException("Expected a CycList; got " + potentialValueObj);
            }
            final InferenceParameterValueDescription potentialValue = (InferenceParameterValueDescription)new DefaultInferenceParameterValueDescription(DefaultInferenceParameterDescriptions.parsePropertyList((CycList)potentialValueObj));
            this.potentialValues.add(potentialValue);
        }
        this.potentialValues = Collections.unmodifiableList((List<? extends InferenceParameterValueDescription>)this.potentialValues);
    }
    
    public static void main(final String[] args) {
    }
    
    static {
        POTENTIAL_VALUES_SYMBOL = new CycSymbol(":POTENTIAL-VALUES");
        REQUIRED_SYMBOLS = new CycSymbol[] { DefaultEnumerationInferenceParameter.POTENTIAL_VALUES_SYMBOL };
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 76 ms
	
	Decompiled with Procyon 0.5.32.
*/