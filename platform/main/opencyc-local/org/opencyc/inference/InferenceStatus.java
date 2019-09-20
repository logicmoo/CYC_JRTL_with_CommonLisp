package org.opencyc.inference;

import java.util.HashMap;
import org.opencyc.cycobject.CycSymbol;

public final class InferenceStatus extends CycSymbol {
	private final boolean indicatesDone;
	public static final InferenceStatus NOT_STARTED;
	public static final InferenceStatus STARTED;
	public static final InferenceStatus NEW;
	public static final InferenceStatus PREPARED;
	public static final InferenceStatus READY;
	public static final InferenceStatus RUNNING;
	public static final InferenceStatus SUSPENDED;
	public static final InferenceStatus DEAD;
	public static final InferenceStatus TAUTOLOGY;
	public static final InferenceStatus CONTRADICTION;
	public static final InferenceStatus ILL_FORMED;
	public static final InferenceStatus FORMATTING;
	private static HashMap inferenceStatuses;

	private InferenceStatus(final String name) {
		this(name, false);
	}

	private InferenceStatus(final String name, final boolean indicatesDone) {
		super(name);
		this.indicatesDone = indicatesDone;
	}

	public static InferenceStatus findInferenceStatus(final CycSymbol symbol) {
		return (InferenceStatus) InferenceStatus.inferenceStatuses.get(symbol);
	}

	public boolean indicatesDone() {
		return this.indicatesDone;
	}

	static {
		NOT_STARTED = new InferenceStatus(":NOT-STARTED");
		STARTED = new InferenceStatus(":STARTED");
		NEW = new InferenceStatus(":NEW");
		PREPARED = new InferenceStatus(":PREPARED");
		READY = new InferenceStatus(":READY");
		RUNNING = new InferenceStatus(":RUNNING");
		SUSPENDED = new InferenceStatus(":SUSPENDED", true);
		DEAD = new InferenceStatus(":DEAD", true);
		TAUTOLOGY = new InferenceStatus(":TAUTOLOGY", true);
		CONTRADICTION = new InferenceStatus(":CONTRADICTION", true);
		ILL_FORMED = new InferenceStatus(":ILL-FORMED", true);
		FORMATTING = new InferenceStatus(":FORMATTING");
		(InferenceStatus.inferenceStatuses = new HashMap()).put(InferenceStatus.NOT_STARTED, InferenceStatus.NOT_STARTED);
		InferenceStatus.inferenceStatuses.put(InferenceStatus.STARTED, InferenceStatus.STARTED);
		InferenceStatus.inferenceStatuses.put(InferenceStatus.NEW, InferenceStatus.NEW);
		InferenceStatus.inferenceStatuses.put(InferenceStatus.PREPARED, InferenceStatus.PREPARED);
		InferenceStatus.inferenceStatuses.put(InferenceStatus.READY, InferenceStatus.READY);
		InferenceStatus.inferenceStatuses.put(InferenceStatus.RUNNING, InferenceStatus.RUNNING);
		InferenceStatus.inferenceStatuses.put(InferenceStatus.SUSPENDED, InferenceStatus.SUSPENDED);
		InferenceStatus.inferenceStatuses.put(InferenceStatus.DEAD, InferenceStatus.DEAD);
		InferenceStatus.inferenceStatuses.put(InferenceStatus.TAUTOLOGY, InferenceStatus.TAUTOLOGY);
		InferenceStatus.inferenceStatuses.put(InferenceStatus.CONTRADICTION, InferenceStatus.CONTRADICTION);
		InferenceStatus.inferenceStatuses.put(InferenceStatus.ILL_FORMED, InferenceStatus.ILL_FORMED);
		InferenceStatus.inferenceStatuses.put(InferenceStatus.FORMATTING, InferenceStatus.FORMATTING);
	}
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 26 ms
	
	Decompiled with Procyon 0.5.32.
*/