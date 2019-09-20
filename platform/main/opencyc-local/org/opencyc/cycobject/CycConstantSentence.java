package org.opencyc.cycobject;

public class CycConstantSentence extends CycConstant implements CycSentence
{
    public CycConstantSentence(final CycConstant constant) {
        super(constant.getName(), constant.getGuid());
    }
    
    public boolean isConditionalSentence() {
        return false;
    }
    
    public boolean isNegated() {
        return false;
    }
    
    public boolean isConjunction() {
        return false;
    }
    
    public boolean isLogicalConnectorSentence() {
        return false;
    }
    
    public boolean isExistential() {
        return false;
    }
    
    public boolean isUniversal() {
        return false;
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 7 ms
	
	Decompiled with Procyon 0.5.32.
*/