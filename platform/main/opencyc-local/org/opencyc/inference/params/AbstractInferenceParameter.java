package org.opencyc.inference.params;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import org.opencyc.api.CycObjectFactory;
import org.opencyc.cycobject.CycList;
import java.util.Map;
import org.opencyc.cycobject.CycFort;
import org.opencyc.cycobject.CycSymbol;

public abstract class AbstractInferenceParameter implements InferenceParameter
{
    private Object defaultValue;
    private CycSymbol keyword;
    private CycFort id;
    private String shortDescription;
    private String longDescription;
    private boolean isBasicParameter;
    private boolean isQueryStaticParameter;
    private InferenceParameterValueDescription alternateValue;
    private static final CycSymbol DEFAULT_VALUE_SYMBOL;
    static final CycSymbol NAME_SYMBOL;
    static final CycSymbol ID_SYMBOL;
    static final CycSymbol SHORT_DESC_SYMBOL;
    static final CycSymbol LONG_DESC_SYMBOL;
    private static final CycSymbol BASIC_PARAMETER_SYMBOL;
    private static final CycSymbol QUERY_STATIC_PARAMETER_SYMBOL;
    private static final CycSymbol ALTERNATE_VALUE_SYMBOL;
    private static final CycSymbol[] REQUIRED_SYMBOLS;
    
    public AbstractInferenceParameter(final Map<CycSymbol, Object> propertyMap) {
        this.alternateValue = null;
        if (propertyMap == null) {
            throw new RuntimeException("Got null parameter map");
        }
        if (propertyMap.size() < AbstractInferenceParameter.REQUIRED_SYMBOLS.length) {
            throw new RuntimeException("Got too few symbols in map");
        }
        for (final CycSymbol property : AbstractInferenceParameter.REQUIRED_SYMBOLS) {
            if (!propertyMap.containsKey(property)) {
                throw new RuntimeException("Expected key not found in map " + property + " for inference Parameter " + propertyMap.get(AbstractInferenceParameter.ID_SYMBOL));
            }
        }
        final Object nameObj = this.verifyObjectType(propertyMap, AbstractInferenceParameter.NAME_SYMBOL, CycSymbol.class);
        final Object idObj = this.verifyObjectType(propertyMap, AbstractInferenceParameter.ID_SYMBOL, CycFort.class);
        final Object shortDescObj = this.verifyObjectType(propertyMap, AbstractInferenceParameter.SHORT_DESC_SYMBOL, String.class);
        final Object longDescObj = this.verifyObjectType(propertyMap, AbstractInferenceParameter.LONG_DESC_SYMBOL, String.class);
        final Object queryStaticParamObj = this.verifyObjectType(propertyMap, AbstractInferenceParameter.QUERY_STATIC_PARAMETER_SYMBOL, CycSymbol.class);
        final Object basicParamObj = this.verifyObjectType(propertyMap, AbstractInferenceParameter.BASIC_PARAMETER_SYMBOL, CycSymbol.class);
        Object alternateValueObj = propertyMap.get(AbstractInferenceParameter.ALTERNATE_VALUE_SYMBOL);
        if (!(alternateValueObj instanceof CycList)) {
            if (!alternateValueObj.equals(CycObjectFactory.nil)) {
                throw new RuntimeException("Expected a CycList or nil; got " + alternateValueObj);
            }
            alternateValueObj = null;
        }
        this.init(propertyMap.get(AbstractInferenceParameter.DEFAULT_VALUE_SYMBOL), (CycSymbol)nameObj, (CycFort)idObj, (String)shortDescObj, (String)longDescObj, (CycSymbol)basicParamObj, (CycSymbol)queryStaticParamObj, (CycList)alternateValueObj);
    }
    
    protected AbstractInferenceParameter(final Object defaultValue, final CycSymbol keyword, final CycFort id, final String shortDescription, final String longDescription, final CycSymbol isBasicParameter, final CycSymbol isQueryStaticParameter, final CycList alternateValue) {
        this.alternateValue = null;
        this.init(defaultValue, keyword, id, shortDescription, longDescription, isBasicParameter, isQueryStaticParameter, alternateValue);
    }
    
    public Object getDefaultValue() {
        return this.defaultValue;
    }
    
    public void setDefaultValue(final Object value) {
        this.defaultValue = value;
    }
    
    public Object canonicalizeValue(final Object value) {
        return value;
    }
    
    public CycSymbol getKeyword() {
        return this.keyword;
    }
    
    public CycFort getId() {
        return this.id;
    }
    
    public String getLongDescription() {
        return this.longDescription;
    }
    
    public String getShortDescription() {
        return this.shortDescription;
    }
    
    public String getPrettyRepresentation(final Object value) {
        if (this.getAlternateValue() != null && this.isAlternateValue(value)) {
            return this.getAlternateValue().getShortDescription();
        }
        if (value instanceof Integer) {
            return NumberFormat.getInstance().format(value);
        }
        if (value instanceof Number) {
            final NumberFormat nf = NumberFormat.getInstance();
            if (nf instanceof DecimalFormat) {
                ((DecimalFormat)nf).setMinimumFractionDigits(1);
            }
            return nf.format(value);
        }
        if (value == null) {
            return "None";
        }
        if (value instanceof CycSymbol && ((CycSymbol)value).toCanonicalString().equals(":ALL")) {
            return "All";
        }
        if (value instanceof CycSymbol && ((CycSymbol)value).toCanonicalString().equals(":NONE")) {
            return "None";
        }
        return value.toString();
    }
    
    public boolean isBasicParameter() {
        return this.isBasicParameter;
    }
    
    public boolean isQueryStaticParameter() {
        return this.isQueryStaticParameter;
    }
    
    public InferenceParameterValueDescription getAlternateValue() {
        return this.alternateValue;
    }
    
    public abstract boolean isValidValue(final Object p0);
    
    public boolean isAlternateValue(final Object value) {
        if (this.alternateValue == null) {
            return false;
        }
        if (this.alternateValue.getValue() == null) {
            return value == null;
        }
        return this.alternateValue.getValue().equals(value);
    }
    
    @Override
    public String toString() {
        String str = this.getKeyword().toString() + " shortDescription=\"" + this.getShortDescription() + "\"" + " type=" + this.getClass().getName().replaceAll("^org\\.opencyc\\.inference\\.", "") + " isBasicParameter=" + this.isBasicParameter() + " isQueryStaticParameter=" + this.isQueryStaticParameter() + " defaultValue=" + this.getDefaultValue();
        if (this.getAlternateValue() != null) {
            str = str + " alternateValue=" + this.getAlternateValue();
        }
        return str;
    }
    
    private void init(final Object defaultValue, final CycSymbol keyword, final CycFort id, final String shortDescription, final String longDescription, final CycSymbol isBasicParameter, final CycSymbol isQueryStaticParameter, final CycList alternateValue) {
        this.defaultValue = this.canonicalizeValue(defaultValue);
        this.keyword = keyword;
        this.id = id;
        this.longDescription = longDescription;
        this.shortDescription = shortDescription;
        if (alternateValue != null) {
            (this.alternateValue = (InferenceParameterValueDescription)new DefaultInferenceParameterValueDescription(DefaultInferenceParameterDescriptions.parsePropertyList(alternateValue))).setValue(this.canonicalizeValue(this.alternateValue.getValue()));
        }
        if (CycObjectFactory.t.equals((Object)isBasicParameter)) {
            this.isBasicParameter = true;
        }
        else {
            if (!CycObjectFactory.nil.equals((Object)isBasicParameter)) {
                throw new RuntimeException("Got unexpected boolean value " + isBasicParameter);
            }
            this.isBasicParameter = false;
        }
        if (CycObjectFactory.t.equals((Object)isQueryStaticParameter)) {
            this.isQueryStaticParameter = true;
        }
        else {
            if (!CycObjectFactory.nil.equals((Object)isQueryStaticParameter)) {
                throw new RuntimeException("Got unexpected boolean value " + isQueryStaticParameter);
            }
            this.isQueryStaticParameter = false;
        }
    }
    
    private Object verifyObjectType(final Map<CycSymbol, Object> propertyMap, final CycSymbol symbol, final Class aClass) {
        return DefaultInferenceParameterValueDescription.verifyObjectType((Map)propertyMap, symbol, aClass);
    }
    
    public static void main(final String[] args) {
    }
    
    static {
        DEFAULT_VALUE_SYMBOL = new CycSymbol(":DEFAULT-VALUE");
        NAME_SYMBOL = new CycSymbol(":NAME");
        ID_SYMBOL = new CycSymbol(":ID");
        SHORT_DESC_SYMBOL = new CycSymbol(":SHORT-DESC");
        LONG_DESC_SYMBOL = new CycSymbol(":LONG-DESC");
        BASIC_PARAMETER_SYMBOL = new CycSymbol(":BASIC?");
        QUERY_STATIC_PARAMETER_SYMBOL = new CycSymbol(":QUERY-STATIC?");
        ALTERNATE_VALUE_SYMBOL = new CycSymbol(":ALTERNATE-VALUE");
        REQUIRED_SYMBOLS = new CycSymbol[] { AbstractInferenceParameter.DEFAULT_VALUE_SYMBOL, AbstractInferenceParameter.NAME_SYMBOL, AbstractInferenceParameter.ID_SYMBOL, AbstractInferenceParameter.SHORT_DESC_SYMBOL, AbstractInferenceParameter.LONG_DESC_SYMBOL, AbstractInferenceParameter.BASIC_PARAMETER_SYMBOL, AbstractInferenceParameter.QUERY_STATIC_PARAMETER_SYMBOL, AbstractInferenceParameter.ALTERNATE_VALUE_SYMBOL };
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 83 ms
	
	Decompiled with Procyon 0.5.32.
*/