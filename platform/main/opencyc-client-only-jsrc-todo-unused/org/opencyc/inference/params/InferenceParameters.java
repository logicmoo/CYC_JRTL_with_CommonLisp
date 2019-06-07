/* $Id: InferenceParameters.java 146549 2013-07-19 00:26:36Z baxter $
 *
 * Copyright (c) 2004 - 2006 Cycorp, Inc.  All rights reserved.
 * This software is the proprietary information of Cycorp, Inc.
 * Use is subject to license terms.
 */
package org.opencyc.inference.params;

//// Internal Imports
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import org.opencyc.api.CycAccess;
import org.opencyc.api.CycObjectFactory;
import org.opencyc.cycobject.CycSymbol;
import org.opencyc.inference.metrics.InferenceMetrics;
import org.opencyc.inference.params.OpenCycInferenceParameterEnum.OpenCycInferenceMode;

/**
 * <P>InferenceParameters is designed to encode the parameters that can be
 * specified for running a Cyc query.
 *
 * <P>Copyright (c) 2004 - 2006 Cycorp, Inc. All rights reserved.
 * <BR>This software is the proprietary information of Cycorp, Inc.
 * <P>Use is subject to license terms.
 *
 * @author zelal
 * @date August 14, 2005, 2:41 PM
 * @version $Id: InferenceParameters.java 146549 2013-07-19 00:26:36Z baxter $
 */
public interface InferenceParameters extends Cloneable {

    public final static CycSymbol MAX_NUMBER = CycObjectFactory.makeCycSymbol(":MAX-NUMBER");
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

    void clear();

    Object parameterValueCycListApiValue(final CycSymbol key, final Object val);

    Set<Entry<CycSymbol, Object>> entrySet();

    Integer getMaxNumber();
    final static CycSymbol MAX_TIME = CycObjectFactory.makeCycSymbol(":MAX-TIME");

    Integer getMaxTime();

    Boolean isBrowsable();

    Boolean isContinuable();

    Set<CycSymbol> keySet();

    void putAll(InferenceParameters properties);

    void remove(CycSymbol property);

    Object put(CycSymbol parameterName, Object value);

    Object get(CycSymbol parameterName);

    boolean containsKey(CycSymbol key);

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
    InferenceParameters setInferenceMode(OpenCycInferenceMode mode);

    OpenCycInferenceMode getInferenceMode();

    String stringApiValue();

    Object cycListApiValue();

    Object clone();

    /* return a version of this that is a DefaultInferenceParameters.  May return the same object that was sent in.
     * 
     */
    public DefaultInferenceParameters toDefaultInferenceParameters(CycAccess cyc);

    /**
     * Update from a plist of the type used by Cyc's inference engine.
     *
     * @param plist
     */
    public void updateFromPlist(List plist);

    public boolean getAbductionAllowed();
    final static CycSymbol ABDUCTION_ALLOWED = CycObjectFactory.makeCycSymbol(":ABDUCTION-ALLOWED?");
    final static CycSymbol MAX_TRANSFORMATION_DEPTH = CycObjectFactory.makeCycSymbol(":MAX-TRANSFORMATION-DEPTH");

    /**
     * Set the max transformation depth value
     *
     * @param i
     * @return this object.
     */
    InferenceParameters setMaxTransformationDepth(Integer i);

    Integer getMaxTransformationDepth();
    public static final CycSymbol LOAD_PROBLEM_STORE = CycObjectFactory.makeCycSymbol("LOAD-PROBLEM-STORE");
    public static final CycSymbol FIND_PROBLEM_STORE_BY_ID = CycObjectFactory.makeCycSymbol("FIND-PROBLEM-STORE-BY-ID");
    final static CycSymbol PROBLEM_STORE = CycObjectFactory.makeCycSymbol(":PROBLEM-STORE");

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
    InferenceMetrics getMetrics();

    /**
     * Specify the set of inference metrics to gather.
     *
     * @param metrics
     * @return this object
     */
    InferenceParameters setMetrics(InferenceMetrics metrics);
}
