/* $Id: InferenceStatus.java 145743 2013-05-23 20:01:23Z baxter $
 *
 * Copyright (c) 2004 - 2006 Cycorp, Inc.  All rights reserved.
 * This software is the proprietary information of Cycorp, Inc.
 * Use is subject to license terms.
 */
package org.opencyc.inference;

//// Internal Imports
import org.opencyc.cycobject.*;

//// External Imports
import java.util.*;

/**
 * <P>InferenceStatus is designed to...
 *
 * <P>Copyright (c) 2004 - 2006 Cycorp, Inc. All rights reserved.
 * <BR>This software is the proprietary information of Cycorp, Inc.
 * <P>Use is subject to license terms.
 *
 * @author zelal, tbrussea
 * @date July 27, 2005, 12:23 PM
 * @version $Id: InferenceStatus.java 145743 2013-05-23 20:01:23Z baxter $
 */
public final class InferenceStatus extends CycSymbol {

    private final boolean indicatesDone;

    private InferenceStatus(String name) {
        this(name, false);
    }

    private InferenceStatus(String name, boolean indicatesDone) {
        super(name);
        this.indicatesDone = indicatesDone;
    }

    public static InferenceStatus findInferenceStatus(CycSymbol symbol) {
        return (InferenceStatus) inferenceStatuses.get(symbol);
    }

    /**
     * Does this status indicate that the inference is done? It may be
     * continuable, but no further work will be performed on it until
     * instructed.
     *
     * @return true iff this status indicates that the inference is done.
     */
    public boolean indicatesDone() {
        return this.indicatesDone;
    }
    // should probably try to gracefully find a way to get these from the KB. (*inference-statuses*)
    public final static InferenceStatus NOT_STARTED = new InferenceStatus(":NOT-STARTED");
    public final static InferenceStatus STARTED = new InferenceStatus(":STARTED");
    public final static InferenceStatus NEW = new InferenceStatus(":NEW");
    public final static InferenceStatus PREPARED = new InferenceStatus(":PREPARED");
    public final static InferenceStatus READY = new InferenceStatus(":READY");
    public final static InferenceStatus RUNNING = new InferenceStatus(":RUNNING");
    public final static InferenceStatus SUSPENDED = new InferenceStatus(":SUSPENDED", true);
    public final static InferenceStatus DEAD = new InferenceStatus(":DEAD", true);
    public final static InferenceStatus TAUTOLOGY = new InferenceStatus(":TAUTOLOGY", true);
    public final static InferenceStatus CONTRADICTION = new InferenceStatus(":CONTRADICTION", true);
    public final static InferenceStatus ILL_FORMED = new InferenceStatus(":ILL-FORMED", true);
    public final static InferenceStatus FORMATTING = new InferenceStatus(":FORMATTING");
    private static HashMap inferenceStatuses = new HashMap();

    static {
        inferenceStatuses.put(NOT_STARTED, NOT_STARTED);
        inferenceStatuses.put(STARTED, STARTED);
        inferenceStatuses.put(NEW, NEW);
        inferenceStatuses.put(PREPARED, PREPARED);
        inferenceStatuses.put(READY, READY);
        inferenceStatuses.put(RUNNING, RUNNING);
        inferenceStatuses.put(SUSPENDED, SUSPENDED);
        inferenceStatuses.put(DEAD, DEAD);
        inferenceStatuses.put(TAUTOLOGY, TAUTOLOGY);
        inferenceStatuses.put(CONTRADICTION, CONTRADICTION);
        inferenceStatuses.put(ILL_FORMED, ILL_FORMED);
        inferenceStatuses.put(FORMATTING, FORMATTING);
    }
}
