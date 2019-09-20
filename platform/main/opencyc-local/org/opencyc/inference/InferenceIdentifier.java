package org.opencyc.inference;

import org.opencyc.api.CycObjectFactory;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.opencyc.api.CycApiException;
import java.io.IOException;
import java.net.UnknownHostException;
import org.opencyc.api.SubLAPIHelper;
import org.opencyc.api.CycAccess;

public class InferenceIdentifier
{
    private int problemStoreID;
    private int inferenceID;
    private CycAccess cyc;
    
    @Override
    public boolean equals(final Object obj) {
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        final InferenceIdentifier other = (InferenceIdentifier)obj;
        return this.problemStoreID == other.problemStoreID && this.inferenceID == other.inferenceID && (this.cyc == other.cyc || (this.cyc != null && this.cyc.equals(other.cyc)));
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.problemStoreID;
        hash = 71 * hash + this.inferenceID;
        hash = 71 * hash + ((this.cyc != null) ? this.cyc.hashCode() : 0);
        return hash;
    }
    
    public CycAccess getCycAccess() {
        return this.cyc;
    }
    
    public int getInferenceID() {
        return this.inferenceID;
    }
    
    public int getProblemStoreID() {
        return this.problemStoreID;
    }
    
    public Integer getFirstProofId(final Integer answerId) {
        Integer proofId = null;
        try {
            proofId = this.cyc.converseInt((Object)SubLAPIHelper.makeSubLStmt("proof-suid", new Object[] { SubLAPIHelper.makeNestedSubLStmt("inference-answer-justification-first-proof", new Object[] { SubLAPIHelper.makeNestedSubLStmt("inference-answer-first-justification", new Object[] { SubLAPIHelper.makeNestedSubLStmt("find-inference-answer-by-ids", new Object[] { this.getProblemStoreID(), this.getInferenceID(), answerId }) }) }) }));
        }
        catch (UnknownHostException ex) {
            logSevereException(ex);
        }
        catch (IOException ex2) {
            logSevereException(ex2);
        }
        catch (CycApiException ex3) {
            logSevereException((Exception)ex3);
        }
        return proofId;
    }
    
    private static void logSevereException(final Exception ex) {
        Logger.getLogger(InferenceIdentifier.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    @Override
    public String toString() {
        return "Inference " + this.inferenceID + " in Problem Store " + this.problemStoreID;
    }
    
    public String stringApiValue() {
        return "(find-inference-by-ids " + Integer.toString(this.problemStoreID) + " " + Integer.toString(this.inferenceID) + ")";
    }
    
    public InferenceIdentifier(final int problemStoreID, final int inferenceID, final CycAccess cyc) {
        this.problemStoreID = problemStoreID;
        this.inferenceID = inferenceID;
        this.cyc = cyc;
    }
    
    public InferenceIdentifier(final int problemStoreID, final int inferenceID) {
        this(problemStoreID, inferenceID, null);
    }
    
    public void close() {
        try {
            this.getCycAccess().converseVoid((Object)("(destroy-inference-and-problem-store " + this.stringApiValue() + ")"));
        }
        catch (UnknownHostException ex) {
            logSevereException(ex);
        }
        catch (IOException ex2) {
            logSevereException(ex2);
        }
        catch (CycApiException ex3) {
            logSevereException((Exception)ex3);
        }
    }
    
    public void interrupt(final Integer patience) {
        try {
            this.getCycAccess().converseVoid((Object)("(inference-interrupt-external " + this.stringApiValue() + " " + ((patience == null) ? CycObjectFactory.nil : patience) + ")"));
        }
        catch (UnknownHostException ex) {
            logSevereException(ex);
        }
        catch (IOException ex2) {
            logSevereException(ex2);
        }
        catch (CycApiException ex3) {
            logSevereException((Exception)ex3);
        }
    }
    
    public String toXML() {
        return "<?xml version=\"1.0\" encoding=\"UTF-8\"?><inferenceIdentifier><problemStore id=\"" + this.problemStoreID + "\"/>" + "<inference id=\"" + this.inferenceID + "\"/>" + "</inferenceIdentifier>";
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 66 ms
	
	Decompiled with Procyon 0.5.32.
*/