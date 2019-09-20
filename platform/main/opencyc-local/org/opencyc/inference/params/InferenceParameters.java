package org.opencyc.inference.params;

import org.opencyc.api.CycObjectFactory;
import org.opencyc.inference.metrics.InferenceMetrics;
import java.util.List;
import org.opencyc.api.CycAccess;
import java.util.Map;
import java.util.Set;
import org.opencyc.cycobject.CycSymbol;

public interface InferenceParameters extends Cloneable
{
    public static final CycSymbol MAX_NUMBER = CycObjectFactory.makeCycSymbol(":MAX-NUMBER");
    public static final CycSymbol METRICS = CycObjectFactory.makeCycSymbol(":METRICS");
    public static final CycSymbol ALLOW_INDETERMINATE_RESULTS = CycObjectFactory.makeCycSymbol(":allow-indeterminate-results?");
    public static final CycSymbol ANSWER_LANGUAGE = CycObjectFactory.makeCycSymbol(":ANSWER-LANGUAGE");
    public static final CycSymbol CONDITIONAL_SENTENCE = CycObjectFactory.makeCycSymbol(":CONDITIONAL-SENTENCE?");
    public static final CycSymbol CONTINUABLE = CycObjectFactory.makeCycSymbol(":continuable?");
    public static final CycSymbol BROWSABLE = CycObjectFactory.makeCycSymbol(":browsable?");
    public static final CycSymbol EL = CycObjectFactory.makeCycSymbol(":EL");
    public static final CycSymbol HL = CycObjectFactory.makeCycSymbol(":HL");
    public static final CycSymbol INTERMEDIATE_STEP_VALIDATION_LEVEL = CycObjectFactory.makeCycSymbol(":INTERMEDIATE-STEP-VALIDATION-LEVEL");
    public static final CycSymbol INFERENCE_MODE = CycObjectFactory.makeCycSymbol(":inference-mode");
    public static final CycSymbol MAX_TIME = CycObjectFactory.makeCycSymbol(":MAX-TIME");
    public static final CycSymbol ABDUCTION_ALLOWED = CycObjectFactory.makeCycSymbol(":ABDUCTION-ALLOWED?");
    public static final CycSymbol MAX_TRANSFORMATION_DEPTH = CycObjectFactory.makeCycSymbol(":MAX-TRANSFORMATION-DEPTH");
    public static final CycSymbol LOAD_PROBLEM_STORE = CycObjectFactory.makeCycSymbol("LOAD-PROBLEM-STORE");
    public static final CycSymbol FIND_PROBLEM_STORE_BY_ID = CycObjectFactory.makeCycSymbol("FIND-PROBLEM-STORE-BY-ID");
    public static final CycSymbol PROBLEM_STORE = CycObjectFactory.makeCycSymbol(":PROBLEM-STORE");
    
    void clear();
    
    Object parameterValueCycListApiValue(final CycSymbol p0, final Object p1);
    
    Set<Map.Entry<CycSymbol, Object>> entrySet();
    
    Integer getMaxNumber();
    
    Integer getMaxTime();
    
    Boolean isBrowsable();
    
    Boolean isContinuable();
    
    Set<CycSymbol> keySet();
    
    void putAll(final InferenceParameters p0);
    
    void remove(final CycSymbol p0);
    
    Object put(final CycSymbol p0, final Object p1);
    
    Object get(final CycSymbol p0);
    
    boolean containsKey(final CycSymbol p0);
    
    InferenceParameters setMaxNumber(final Integer p0);
    
    InferenceParameters setMaxTime(final Integer p0);
    
    InferenceParameters setInferenceMode(final OpenCycInferenceParameterEnum.OpenCycInferenceMode p0);
    
    OpenCycInferenceParameterEnum.OpenCycInferenceMode getInferenceMode();
    
    String stringApiValue();
    
    Object cycListApiValue();
    
    Object clone();
    
    DefaultInferenceParameters toDefaultInferenceParameters(final CycAccess p0);
    
    void updateFromPlist(final List p0);
    
    boolean getAbductionAllowed();
    
    InferenceParameters setMaxTransformationDepth(final Integer p0);
    
    Integer getMaxTransformationDepth();
    
    void setProblemStorePath(final String p0);
    
    void setProblemStoreId(final int p0);
    
    boolean usesLoadedProblemStore();
    
    void makeAtLeastAsLooseAs(final InferenceParameters p0);
    
    InferenceMetrics getMetrics();
    
    InferenceParameters setMetrics(final InferenceMetrics p0);
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 20 ms
	
	Decompiled with Procyon 0.5.32.
*/