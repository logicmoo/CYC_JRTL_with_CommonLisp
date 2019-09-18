package com.cyc.base.inference;

//// Internal Imports
import com.cyc.base.cycobject.CycSymbolI;
import com.cyc.base.inference.metrics.InferenceMetricsI;

import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
//import com.cyc.baseclient.inference.metrics.InferenceMetrics;
//import com.cyc.baseclient.inference.params.DefaultInferenceParameters;
//import com.cyc.base.inference.params.OpenCycInferenceParameterEnum.OpenCycInferenceMode;

/**
 * <P>InferenceParameters is designed to encode the parameters that can be
 * specified for running a Cyc query.
 *
 * @author zelal
 * @date August 14, 2005, 2:41 PM
 * @version $Id: InferenceParameters.java 151256 2014-05-14 22:57:51Z jmoszko $
 */
public interface InferenceParameters extends Cloneable {

    /*
    public final static CycSymbolI MAX_NUMBER = CycObjectFactory.makeCycSymbolI(":MAX-NUMBER");
    public static final CycSymbolI METRICS = CycObjectFactory.makeCycSymbolI(":METRICS");
    public static final CycSymbolI ALLOW_INDETERMINATE_RESULTS = CycObjectFactory.makeCycSymbolI(":allow-indeterminate-results?");
    public static final CycSymbolI ANSWER_LANGUAGE = CycObjectFactory.makeCycSymbolI(":ANSWER-LANGUAGE");
    public static final CycSymbolI CONDITIONAL_SENTENCE = CycObjectFactory.makeCycSymbolI(":CONDITIONAL-SENTENCE?");
    public static final CycSymbolI CONTINUABLE = CycObjectFactory.makeCycSymbolI(":continuable?");
    public static final CycSymbolI BROWSABLE = CycObjectFactory.makeCycSymbolI(":browsable?");
    public static final CycSymbolI EL = CycObjectFactory.makeCycSymbolI(":EL");
    public static final CycSymbolI HL = CycObjectFactory.makeCycSymbolI(":HL");
    public static final CycSymbolI INTERMEDIATE_STEP_VALIDATION_LEVEL = CycObjectFactory.makeCycSymbolI(":INTERMEDIATE-STEP-VALIDATION-LEVEL");
    public static final CycSymbolI INFERENCE_MODE = CycObjectFactory.makeCycSymbolI(":inference-mode");
*/
    void clear();

    Object parameterValueCycListApiValue(final CycSymbolI key, final Object val);

    Set<Entry<CycSymbolI, Object>> entrySet();

    Integer getMaxNumber();
//    final static CycSymbolI MAX_TIME = CycObjectFactory.makeCycSymbolI(":MAX-TIME");

    Integer getMaxTime();

    Boolean isBrowsable();

    Boolean isContinuable();

    Set<CycSymbolI> keySet();

    void putAll(InferenceParameters properties);

    void remove(CycSymbolI property);

    Object put(CycSymbolI parameterName, Object value);

    Object get(CycSymbolI parameterName);

    boolean containsKey(CycSymbolI key);

    /**
     * Set the max number value.
     *
     * @param max
     * @return this object.
     */
    InferenceParameters setMaxNumber(Integer max);

    /**
     * Set the max time value.
     *
     * @param max
     * @return this object.
     */
    InferenceParameters setMaxTime(Integer max);

    /**
     * Set the inference mode.
     *
     * @param mode
     * @return this object.
     */
    InferenceParameters setInferenceMode(InferenceMode mode);

    InferenceMode getInferenceMode();

    String stringApiValue();

    Object cycListApiValue();

    Object clone();

    /* return a version of this that is a DefaultInferenceParameters.  May return the same object that was sent in.
     * 
     */
//    public DefaultInferenceParameters toDefaultInferenceParameters(CycAccess cyc);

    /**
     * Update from a plist of the type used by Cyc's inference engine.
     *
     * @param plist
     */
    public void updateFromPlist(List plist);

    public boolean getAbductionAllowed();
//    final static CycSymbolI ABDUCTION_ALLOWED = CycObjectFactory.makeCycSymbolI(":ABDUCTION-ALLOWED?");
//    final static CycSymbolI MAX_TRANSFORMATION_DEPTH = CycObjectFactory.makeCycSymbolI(":MAX-TRANSFORMATION-DEPTH");

    /**
     * Set the max transformation depth value
     *
     * @param i
     * @return this object.
     */
    InferenceParameters setMaxTransformationDepth(Integer i);

    Integer getMaxTransformationDepth();
//    public static final CycSymbolI LOAD_PROBLEM_STORE = CycObjectFactory.makeCycSymbolI("LOAD-PROBLEM-STORE");
//    public static final CycSymbolI FIND_PROBLEM_STORE_BY_ID = CycObjectFactory.makeCycSymbolI("FIND-PROBLEM-STORE-BY-ID");
//    final static CycSymbolI PROBLEM_STORE = CycObjectFactory.makeCycSymbolI(":PROBLEM-STORE");

    public void setProblemStorePath(String path);
    /** Specify the problem store in which to run the query. **/
    public void setProblemStoreId(int id);

    public boolean usesLoadedProblemStore();

    /**
     * Adjust these parameters to give the inference engine at least as
     * extensive resources as newParams.
     *
     * @param newParams
     */
    public void makeAtLeastAsLooseAs(InferenceParameters newParams);

    /**
     * Get the set of inference metrics to gather.
     *
     * @return the inference metrics.
     */
    InferenceMetricsI getMetrics();

    /**
     * Specify the set of inference metrics to gather.
     *
     * @param metrics
     * @return this object
     */
    InferenceParameters setMetrics(InferenceMetricsI metrics);
}
