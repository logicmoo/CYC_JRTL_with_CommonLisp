/* $Id: InferenceParametersSymbols.java 150723 2014-04-24 21:21:29Z nwinant $
 *
 * Copyright (c) 2004 - 2006 Cycorp, Inc.  All rights reserved.
 * This software is the proprietary information of Cycorp, Inc.
 * Use is subject to license terms.
 */
package com.cyc.baseclient.inference.params;

//// Internal Imports
import com.cyc.base.cycobject.CycSymbolI;
import com.cyc.baseclient.CycObjectFactory;

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
 * @version $Id: InferenceParametersSymbols.java 150723 2014-04-24 21:21:29Z nwinant $
 */
public class InferenceParametersSymbols  {

    public final static CycSymbolI MAX_NUMBER = CycObjectFactory.makeCycSymbol(":MAX-NUMBER");
    public static final CycSymbolI METRICS = CycObjectFactory.makeCycSymbol(":METRICS");
    public static final CycSymbolI ALLOW_INDETERMINATE_RESULTS = CycObjectFactory.makeCycSymbol(":allow-indeterminate-results?");
    public static final CycSymbolI ANSWER_LANGUAGE = CycObjectFactory.makeCycSymbol(":ANSWER-LANGUAGE");
    public static final CycSymbolI CONDITIONAL_SENTENCE = CycObjectFactory.makeCycSymbol(":CONDITIONAL-SENTENCE?");
    public static final CycSymbolI CONTINUABLE = CycObjectFactory.makeCycSymbol(":continuable?");
    public static final CycSymbolI BROWSABLE = CycObjectFactory.makeCycSymbol(":browsable?");
    public static final CycSymbolI EL = CycObjectFactory.makeCycSymbol(":EL");
    public static final CycSymbolI HL = CycObjectFactory.makeCycSymbol(":HL");
    public static final CycSymbolI INTERMEDIATE_STEP_VALIDATION_LEVEL = CycObjectFactory.makeCycSymbol(":INTERMEDIATE-STEP-VALIDATION-LEVEL");
    public static final CycSymbolI INFERENCE_MODE = CycObjectFactory.makeCycSymbol(":inference-mode");

    public static final CycSymbolI MAX_TIME = CycObjectFactory.makeCycSymbol(":MAX-TIME");

    public static final CycSymbolI ABDUCTION_ALLOWED = CycObjectFactory.makeCycSymbol(":ABDUCTION-ALLOWED?");
    public static final CycSymbolI MAX_TRANSFORMATION_DEPTH = CycObjectFactory.makeCycSymbol(":MAX-TRANSFORMATION-DEPTH");

    public static final CycSymbolI LOAD_PROBLEM_STORE = CycObjectFactory.makeCycSymbol("LOAD-PROBLEM-STORE");
    public static final CycSymbolI FIND_PROBLEM_STORE_BY_ID = CycObjectFactory.makeCycSymbol("FIND-PROBLEM-STORE-BY-ID");
    public static final CycSymbolI PROBLEM_STORE = CycObjectFactory.makeCycSymbol(":PROBLEM-STORE");
}
