package org.opencyc.cycobject;

import org.opencyc.api.CycObjectFactory;

public class ELMtConstant extends CycConstant implements ELMt
{
    static final long serialVersionUID = -2405506745680227189L;
    
    private ELMtConstant(final CycConstant cycConstant) {
        super(cycConstant.getName(), cycConstant.getGuid());
    }
    
    public static ELMtConstant makeELMtConstant(final CycConstant cycConstant) {
        CycObjectFactory.removeCaches(cycConstant);
        final ELMtConstant elmtConstant = new ELMtConstant(cycConstant);
        CycObjectFactory.addCycConstantCache(cycConstant);
        return elmtConstant;
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 6 ms
	
	Decompiled with Procyon 0.5.32.
*/