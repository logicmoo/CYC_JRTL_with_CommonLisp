package org.opencyc.inference;

import org.opencyc.cycobject.CycList;

public class InferenceAnswerIdentifier {
	private InferenceIdentifier inferenceID;
	private int answerID;

	public InferenceAnswerIdentifier(final InferenceIdentifier inferenceID, final int answerID) {
		this.inferenceID = inferenceID;
		this.answerID = answerID;
	}

	@Override
	public String toString() {
		return "Answer " + this.answerID + " for " + this.inferenceID;
	}

	public String stringApiValue() {
		return this.cycListApiValue().stringApiValue();
	}

	public CycList<Integer> cycListApiValue() {
		return (CycList<Integer>) CycList.makeCycList(new Integer[] { this.inferenceID.getProblemStoreID(), this.inferenceID.getInferenceID(), this.answerID });
	}

	public int getAnswerID() {
		return this.answerID;
	}

	public InferenceIdentifier getInferenceID() {
		return this.inferenceID;
	}

	public static boolean possiblyInferenceAnswerSignature(final Object obj) {
		if (obj instanceof CycList) {
			final CycList cycList = (CycList) obj;
			if (cycList.size() == 3) {
				try {
					return Integer.valueOf(cycList.get(0).toString()) >= 0 && Integer.valueOf(cycList.get(1).toString()) >= 0 && Integer.valueOf(cycList.get(2).toString()) >= 0;
				} catch (NumberFormatException e) {
					return false;
				}
			}
		}
		return false;
	}
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 48 ms
	
	Decompiled with Procyon 0.5.32.
*/