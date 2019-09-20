package org.opencyc.inference;

import java.util.HashMap;
import org.opencyc.api.CycObjectFactory;
import org.opencyc.cycobject.CycList;
import org.opencyc.cycobject.CycSymbol;
import java.util.Map;

public final class InferenceSuspendReason
{
    private static final Map<CycSymbol, InferenceSuspendReason> SYMBOL_MAP;
    public static final InferenceSuspendReason MAX_TIME;
    public static final InferenceSuspendReason MAX_NUMBER;
    public static final InferenceSuspendReason MAX_STEPS;
    public static final InferenceSuspendReason EXHAUST;
    public static final InferenceSuspendReason ABORTED;
    public static final InferenceSuspendReason INTERRUPT;
    static CycSymbol ERROR_SYMBOL;
    private static final InferenceSuspendReason UNKNOWN;
    private final String description;
    private boolean isError;
    private final boolean isContinuable;
    private final boolean allowStop;
    private final boolean allowReset;
    private final String inferenceStatusString;
    
    public static InferenceSuspendReason fromCycSuspendReason(final Object cycSuspendReason) throws RuntimeException {
        if (cycSuspendReason instanceof CycSymbol || cycSuspendReason == null) {
            return fromCycSymbol((CycSymbol)cycSuspendReason);
        }
        if (cycSuspendReason instanceof CycList && InferenceSuspendReason.ERROR_SYMBOL.equals(((CycList)cycSuspendReason).get(0))) {
            return createFromErrorString((String)((CycList)cycSuspendReason).get(1));
        }
        throw new RuntimeException("Unable to create InferenceWorkerSuspendReason from (" + cycSuspendReason.getClass().getName() + ") " + cycSuspendReason.toString());
    }
    
    private InferenceSuspendReason(final String description, final String statusString, final boolean isExceptional, final String cycSymbolName, final boolean isContinuable, final boolean allowStop, final boolean allowReset) {
        this.isError = false;
        this.description = description;
        this.inferenceStatusString = addHTMLFontColor(statusString, isExceptional);
        this.isContinuable = isContinuable;
        this.allowStop = allowStop;
        this.allowReset = allowReset;
        InferenceSuspendReason.SYMBOL_MAP.put(CycObjectFactory.makeCycSymbol(cycSymbolName), this);
    }
    
    public static InferenceSuspendReason createFromErrorString(final String errorString) {
        final InferenceSuspendReason reason = new InferenceSuspendReason("Error: " + errorString, "Error", true, ":ERROR", true, true, true);
        reason.setErrorFlag(true);
        return reason;
    }
    
    public boolean isError() {
        return this.isError;
    }
    
    public static InferenceSuspendReason fromCycSymbol(final CycSymbol symbol) {
        final InferenceSuspendReason reason = InferenceSuspendReason.SYMBOL_MAP.get(symbol);
        if (reason != null) {
            return reason;
        }
        if (symbol == null) {
            return InferenceSuspendReason.UNKNOWN;
        }
        throw new IllegalArgumentException("Unable to find InferenceWorkerSuspendReason from " + symbol);
    }
    
    @Override
    public String toString() {
        return this.description;
    }
    
    public String getInferenceStatusString() {
        return this.inferenceStatusString;
    }
    
    public boolean allowReset() {
        return this.allowReset;
    }
    
    public boolean allowStop() {
        return this.allowStop;
    }
    
    public boolean isContinuable() {
        return this.isContinuable;
    }
    
    private void setErrorFlag(final boolean b) {
        this.isError = b;
    }
    
    private static String addHTMLFontColor(final String text, final boolean isExceptional) {
        return "<html><body><font color=" + (isExceptional ? "red" : "green") + ">" + text + "</font></body></html>";
    }
    
    static {
        SYMBOL_MAP = new HashMap<CycSymbol, InferenceSuspendReason>();
        MAX_TIME = new InferenceSuspendReason("Max time reached", "Timed out", false, ":MAX-TIME", true, false, true);
        MAX_NUMBER = new InferenceSuspendReason("Max results reached", "Result limit", false, ":MAX-NUMBER", true, false, true);
        MAX_STEPS = new InferenceSuspendReason("Max steps performed", "Inference Step Limit", false, ":MAX-STEP", false, false, false);
        EXHAUST = new InferenceSuspendReason("Exhausted", "Finished", false, ":EXHAUST", false, false, false);
        InferenceSuspendReason.SYMBOL_MAP.put(CycObjectFactory.makeCycSymbol(":EXHAUST-TOTAL"), InferenceSuspendReason.EXHAUST);
        ABORTED = new InferenceSuspendReason("Aborted", "Aborted", true, ":ABORT", false, false, false);
        INTERRUPT = new InferenceSuspendReason("Interrupted", "Paused", true, ":INTERRUPT", true, true, true);
        new InferenceSuspendReason("Max depth reached", "Depth limit", false, ":LOOK-NO-DEEPER-FOR-ADDITIONAL-ANSWERS", true, true, false);
        new InferenceSuspendReason("Max problem count reached", "Problem limit", false, ":MAX-PROBLEM-COUNT", true, true, false);
        new InferenceSuspendReason("Max proof count reached", "Proof limit", false, ":MAX-PROOF-COUNT", true, true, false);
        new InferenceSuspendReason("Probably approximately done", "P.A.D.", false, ":PROBABLY-APPROXIMATELY-DONE", true, true, false);
        InferenceSuspendReason.ERROR_SYMBOL = CycObjectFactory.makeCycSymbol(":ERROR");
        UNKNOWN = new InferenceSuspendReason("Unknown", "Unknown", true, "NIL", true, true, false);
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 78 ms
	
	Decompiled with Procyon 0.5.32.
*/