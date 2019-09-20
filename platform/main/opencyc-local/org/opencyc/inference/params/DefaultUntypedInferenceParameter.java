package org.opencyc.inference.params;

import org.opencyc.cycobject.CycSymbol;
import java.util.Map;

class DefaultUntypedInferenceParameter extends AbstractInferenceParameter
{
    public DefaultUntypedInferenceParameter(final Map<CycSymbol, Object> propertyMap) {
        super((Map)propertyMap);
    }
    
    public boolean isValidValue(final Object potentialValue) {
        return true;
    }
    
    public Object parameterValueCycListApiValue(final Object val) {
        return val;
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 19 ms
	
	Decompiled with Procyon 0.5.32.
*/