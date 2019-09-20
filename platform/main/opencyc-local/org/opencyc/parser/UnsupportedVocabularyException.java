package org.opencyc.parser;

import org.opencyc.cycobject.CycConstant;

public class UnsupportedVocabularyException extends Exception
{
    private CycConstant invalidConstant;
    
    public UnsupportedVocabularyException(final CycConstant invalidConstant) {
        this.invalidConstant = invalidConstant;
    }
    
    @Override
    public String getMessage() {
        return "The following vocabulary is not supported: '" + this.invalidConstant.cyclify() + "'.";
    }
    
    public CycConstant getInvalidVocabulary() {
        return this.invalidConstant;
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 9 ms
	
	Decompiled with Procyon 0.5.32.
*/