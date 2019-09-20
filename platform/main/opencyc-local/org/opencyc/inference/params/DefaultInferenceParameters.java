package org.opencyc.inference.params;

import java.util.HashMap;
import java.util.Collection;
import org.opencyc.cycobject.CycObject;
import org.opencyc.cycobject.DefaultCycObject;
import org.opencyc.api.CycObjectFactory;
import java.io.Serializable;
import java.net.UnknownHostException;
import java.util.Iterator;
import org.opencyc.cycobject.CycSymbol;
import java.util.List;
import java.io.IOException;
import org.opencyc.api.CycAccess;
import org.opencyc.cycobject.CycList;
import java.util.Map;

public class DefaultInferenceParameters extends SpecifiedInferenceParameters
{
    private static Map<String, CycList> paramCache;
    private final CycAccess cycAccess;
    private InferenceParameterDescriptions defaultInferenceParameterDescriptions;
    
    public DefaultInferenceParameters(final CycAccess cycAccess) {
        this.defaultInferenceParameterDescriptions = null;
        this.cycAccess = cycAccess;
    }
    
    public DefaultInferenceParameters(final CycAccess cycAccess, final boolean shouldReturnAnswersInHL) {
        this.defaultInferenceParameterDescriptions = null;
        this.cycAccess = cycAccess;
        try {
            if (!cycAccess.isOpenCyc()) {
                if (shouldReturnAnswersInHL) {
                    this.getAnswersInHL();
                }
                else {
                    this.getAnswersInEL();
                }
            }
        }
        catch (IOException ex) {
            throw new RuntimeException("Unable to reach Cyc image " + cycAccess, ex);
        }
    }
    
    public static DefaultInferenceParameters fromPlist(final CycAccess cycAccess, final List plist) {
        final DefaultInferenceParameters combinedQueryInferenceParams = new DefaultInferenceParameters(cycAccess);
        final Iterator<Object> plistIterator = plist.iterator();
        while (plistIterator.hasNext()) {
            final CycSymbol key = (CycSymbol) plistIterator.next();
            final Object value = plistIterator.next();
            combinedQueryInferenceParams.put(key, value);
        }
        return combinedQueryInferenceParams;
    }
    
    public DefaultInferenceParameters(final CycAccess cycAccess, final String params) {
        this.defaultInferenceParameterDescriptions = null;
        this.cycAccess = cycAccess;
        if (params == null && params.isEmpty()) {
            return;
        }
        CycList paramList = null;
        try {
            paramList = getParams(cycAccess, params);
        }
        catch (Exception ex) {
            throw new RuntimeException("Problem parsing '" + params + "' as inference parameter list.", ex);
        }
        final Iterator<Object> paramIter = (Iterator<Object>)paramList.iterator();
        while (paramIter.hasNext()) {
            final Object key = paramIter.next();
            final Object value = paramIter.next();
            if (!(key instanceof CycSymbol)) {
                throw new RuntimeException("'" + key + "' is not a valid inference parameter name.");
            }
            this.put((CycSymbol)key, value);
        }
    }
    
    private static CycList getParams(final CycAccess cyc, final String params) throws UnknownHostException, IOException {
        if (DefaultInferenceParameters.paramCache.containsKey(params)) {
            return DefaultInferenceParameters.paramCache.get(params);
        }
        final CycList paramList = cyc.converseList((Object)("'(" + params + ")"));
        DefaultInferenceParameters.paramCache.put(params, paramList);
        return paramList;
    }
    
    public static DefaultInferenceParameters fromSpecifiedInferenceParameters(final CycAccess cycAccess, final SpecifiedInferenceParameters oldParameters) {
        return oldParameters.toDefaultInferenceParameters(cycAccess);
    }
    
    public CycAccess getCycAccess() {
        return this.cycAccess;
    }
    
    public void getAnswersInHL() {
        this.put(DefaultInferenceParameters.ANSWER_LANGUAGE, DefaultInferenceParameters.HL);
    }
    
    public void getAnswersInEL() {
        this.put(DefaultInferenceParameters.ANSWER_LANGUAGE, DefaultInferenceParameters.EL);
    }
    
    public InferenceParameters setMaxNumber(final Integer max) {
        this.put(DefaultInferenceParameters.MAX_NUMBER, max);
        return (InferenceParameters)this;
    }
    
    public InferenceParameters setMaxTransformationDepth(final Integer max) {
        this.put(DefaultInferenceParameters.MAX_TRANSFORMATION_DEPTH, max);
        return (InferenceParameters)this;
    }
    
    public void setProblemStorePath(final String path) {
        final CycList problemStoreForm = CycList.makeCycList((Object[])new Serializable[] { DefaultInferenceParameters.LOAD_PROBLEM_STORE, path });
        this.put(DefaultInferenceParameters.PROBLEM_STORE, problemStoreForm);
    }
    
    private boolean getBoolean(final CycSymbol paramName) {
        Object rawValue = this.get(paramName);
        if (rawValue instanceof Boolean) {
            return (boolean)rawValue;
        }
        rawValue = this.getDefaultInferenceParameterDescriptions().getDefaultInferenceParameters().get(paramName);
        return rawValue instanceof Boolean && (boolean)rawValue;
    }
    
    public boolean getAbductionAllowed() {
        return this.getBoolean(DefaultInferenceParameters.ABDUCTION_ALLOWED);
    }
    
    public void setAllowIndeterminateResults(final boolean b) {
        final CycSymbol value = b ? CycObjectFactory.t : CycObjectFactory.nil;
        this.put(DefaultInferenceParameters.ALLOW_INDETERMINATE_RESULTS, value);
    }
    
    public void setConditionalSentence(final boolean b) {
        final CycSymbol value = b ? CycObjectFactory.t : CycObjectFactory.nil;
        this.put(DefaultInferenceParameters.CONDITIONAL_SENTENCE, value);
    }
    
    public boolean getConditionalSentence() {
        return this.getBoolean(DefaultInferenceParameters.CONDITIONAL_SENTENCE);
    }
    
    public void setIntermediateStepValidationLevel(final CycSymbol value) {
        this.put(DefaultInferenceParameters.INTERMEDIATE_STEP_VALIDATION_LEVEL, value);
    }
    
    public CycSymbol getIntermediateStepValidationLevel() {
        Object rawValue = this.get(DefaultInferenceParameters.INTERMEDIATE_STEP_VALIDATION_LEVEL);
        if (rawValue instanceof CycSymbol) {
            return (CycSymbol)rawValue;
        }
        rawValue = this.getDefaultInferenceParameterDescriptions().getDefaultInferenceParameters().get(DefaultInferenceParameters.INTERMEDIATE_STEP_VALIDATION_LEVEL);
        return (CycSymbol)((rawValue instanceof CycSymbol) ? rawValue : CycObjectFactory.nil);
    }
    
    public Object put(final CycSymbol parameterName, Object value) {
        if (value instanceof CycSymbol && ((CycSymbol)value).toString().equals(":UNKNOWN")) {
            return null;
        }
        if (":PROBLEM-STORE".equals(parameterName.toString())) {
            if (value instanceof CycList || value instanceof CycSymbol || value instanceof Integer) {
                return this.map.put(parameterName, value);
            }
            if (CycObjectFactory.nil.equals(value)) {
                return this.map.put(parameterName, value);
            }
            throw new RuntimeException("Got invalid value " + value + " (" + value.getClass().getSimpleName() + ")" + " for parameter " + parameterName);
        }
        else {
            final InferenceParameter param = this.getInferenceParameter(parameterName);
            value = param.canonicalizeValue(value);
            if (!param.isValidValue(value)) {
                throw new RuntimeException("Got invalid value " + value + " for parameter " + parameterName);
            }
            return this.map.put(parameterName, value);
        }
    }
    
    public String stringApiValue() {
        if (this.size() <= 0) {
            return CycObjectFactory.nil.stringApiValue();
        }
        final StringBuilder buf = new StringBuilder("(LIST ");
        final Iterator<CycSymbol> iter = this.keySet().iterator();
        while (iter.hasNext()) {
            final CycSymbol key = iter.next();
            buf.append(DefaultCycObject.stringApiValue((Object)key));
            buf.append(" ");
            final Object val = this.get(key);
            buf.append(this.parameterValueStringApiValue(key, val));
            if (iter.hasNext()) {
                buf.append(" ");
            }
        }
        buf.append(")");
        return buf.toString();
    }
    
    public Object cycListApiValue() {
        if (this.size() <= 0) {
            return CycList.EMPTY_CYC_LIST;
        }
        final CycList<Object> cycList = (CycList<Object>)new CycList();
        for (final CycSymbol key : this.keySet()) {
            cycList.add((Object)key);
            final Object val = this.get(key);
            cycList.add(this.parameterValueCycListApiValue(key, val));
        }
        return cycList;
    }
    
    public Object parameterValueCycListApiValue(final CycSymbol key, final Object val) {
        final InferenceParameter param = this.getInferenceParameter(key);
        return param.parameterValueCycListApiValue(val);
    }
    
    public Object clone() {
        final DefaultInferenceParameters copy = new DefaultInferenceParameters(this.cycAccess);
        for (final CycSymbol key : this.keySet()) {
            final Object value = this.get(key);
            copy.put(key, value);
        }
        return copy;
    }
    
    public DefaultInferenceParameters toDefaultInferenceParameters(final CycAccess cyc) {
        if (this.getCycAccess() == cyc) {
            return this;
        }
        final DefaultInferenceParameters copy = new DefaultInferenceParameters(this.cycAccess);
        for (final CycSymbol key : this.keySet()) {
            final Object value = this.get(key);
            copy.put(key, value);
        }
        return copy;
    }
    
    public static Object getInfiniteValue() {
        return null;
    }
    
    public static boolean isInfiniteValue(final Object value) {
        return null == value;
    }
    
    private int size() {
        return this.map.size();
    }
    
    private InferenceParameterDescriptions getDefaultInferenceParameterDescriptions() {
        if (this.defaultInferenceParameterDescriptions == null) {
            this.initializeDefaultInferenceParameterDescriptions();
        }
        return this.defaultInferenceParameterDescriptions;
    }
    
    private void initializeDefaultInferenceParameterDescriptions() {
        this.defaultInferenceParameterDescriptions = DefaultInferenceParameterDescriptions.getDefaultInferenceParameterDescriptions(this.cycAccess);
    }
    
    private InferenceParameter getInferenceParameter(final CycSymbol parameterName) throws RuntimeException {
        final InferenceParameterDescriptions descriptions = this.getDefaultInferenceParameterDescriptions();
        if (descriptions == null) {
            throw new RuntimeException("Cannot find inference parameter descriptions");
        }
        final InferenceParameter param = (InferenceParameter)descriptions.get((Object)parameterName);
        if (param == null) {
            throw new RuntimeException("No parameter found by name " + parameterName);
        }
        return param;
    }
    
    private static boolean isProblemStoreSpecification(final CycSymbol key, final Object val) {
        return ":PROBLEM-STORE".equals(key.toString()) && val instanceof List;
    }
    
    private String parameterValueStringApiValue(final CycSymbol key, final Object val) {
        final Object cycListApiValue = this.parameterValueCycListApiValue(key, val);
        if (val instanceof InferenceParameterValue) {
            return ((InferenceParameterValue)val).stringApiValue();
        }
        if (isProblemStoreSpecification(key, cycListApiValue)) {
            return problemStoreStringApiValue((List)cycListApiValue);
        }
        if (cycListApiValue instanceof CycObject) {
            return ((CycObject)cycListApiValue).stringApiValue();
        }
        if (cycListApiValue instanceof DefaultInferenceParameterValueDescription) {
            final DefaultInferenceParameterValueDescription param = (DefaultInferenceParameterValueDescription)cycListApiValue;
            final Object value = param.getValue();
            final String ret = DefaultCycObject.stringApiValue(value);
            return ret;
        }
        return DefaultCycObject.stringApiValue(cycListApiValue);
    }
    
    public String toString() {
        final int maxLen = 10;
        final StringBuilder builder = new StringBuilder();
        builder.append("DefaultInferenceParameters [");
        if (this.cycAccess != null) {
            builder.append("cycAccess=").append(this.cycAccess).append(", ");
        }
        if (this.defaultInferenceParameterDescriptions != null) {
            builder.append("defaultInferenceParameterDescriptions=").append(this.toString(this.defaultInferenceParameterDescriptions.entrySet(), 10));
        }
        builder.append("]");
        return builder.toString();
    }
    
    private String toString(final Collection<?> collection, final int maxLen) {
        final StringBuilder builder = new StringBuilder();
        builder.append("[");
        int i = 0;
        for (Iterator<?> iterator = collection.iterator(); iterator.hasNext() && i < maxLen; ++i) {
            if (i > 0) {
                builder.append(", ");
            }
            builder.append(iterator.next());
        }
        builder.append("]");
        return builder.toString();
    }
    
    private static String problemStoreStringApiValue(final List val) {
        final StringBuffer buf = new StringBuffer("(");
        for (final Object item : val) {
            if (item instanceof String) {
                buf.append(DefaultCycObject.stringApiValue(item));
            }
            else {
                buf.append(item);
            }
            buf.append(" ");
        }
        buf.append(")");
        return buf.toString();
    }
    
    public static void main(final String[] args) {
        try {
            System.out.println("Starting...");
            final CycAccess cycAccess = new CycAccess("public1", 3640);
            final InferenceParameters parameters = (InferenceParameters)new DefaultInferenceParameters(cycAccess);
            parameters.put(new CycSymbol(":MAX-NUMBER"), (Object)new Integer(10));
            parameters.put(new CycSymbol(":PROBABLY-APPROXIMATELY-DONE"), (Object)new Double(0.5));
            parameters.put(new CycSymbol(":ABDUCTION-ALLOWED?"), (Object)Boolean.TRUE);
            parameters.put(new CycSymbol(":EQUALITY-REASONING-METHOD"), (Object)new CycSymbol(":CZER-EQUAL"));
            try {
                parameters.put(new CycSymbol(":MAX-NUMBER"), (Object)new CycSymbol(":BINDINGS"));
                System.out.println("Failed to catch exception.");
            }
            catch (Exception ex) {}
            try {
                parameters.put(new CycSymbol(":PROBABLY-APPROXIMATELY-DONE"), (Object)new CycSymbol(":BINDINGS"));
                System.out.println("Failed to catch exception.");
            }
            catch (Exception ex2) {}
            try {
                parameters.put(new CycSymbol(":ABDUCTION-ALLOWED?"), (Object)new CycSymbol(":BINDINGS"));
                System.out.println("Failed to catch exception.");
            }
            catch (Exception ex3) {}
            try {
                parameters.put(new CycSymbol(":EQUALITY-REASONING-METHOD"), (Object)new Double(0.5));
                System.out.println("Failed to catch exception.");
            }
            catch (Exception ex4) {}
            System.out.println("PARAMETERS: " + parameters.stringApiValue());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("Exiting...");
            System.exit(0);
        }
    }
    
    static {
        DefaultInferenceParameters.paramCache = new HashMap<String, CycList>();
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 145 ms
	
	Decompiled with Procyon 0.5.32.
*/