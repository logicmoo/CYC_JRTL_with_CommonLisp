package org.opencyc.inference.params;

import org.opencyc.api.CycObjectFactory;
import org.opencyc.cycobject.CycList;
import org.opencyc.cycobject.CycFort;
import org.opencyc.cycobject.CycSymbol;
import java.util.Map;

public class DefaultBooleanInferenceParameter extends AbstractInferenceParameter implements BooleanInferenceParameter {
	public DefaultBooleanInferenceParameter(final Map<CycSymbol, Object> propertyMap) {
		super((Map) propertyMap);
	}

	protected DefaultBooleanInferenceParameter(final Boolean defaultValue, final CycSymbol keyword, final CycFort id, final String shortDescription, final String longDescription, final CycSymbol isBasicParameter, final CycSymbol isQueryStaticParameter, final CycList alternateValue) {
		super((Object) defaultValue, keyword, id, shortDescription, longDescription, isBasicParameter, isQueryStaticParameter, alternateValue);
	}

	public boolean isValidValue(final Object potentialValue) {
		return this.isAlternateValue(potentialValue) || potentialValue instanceof Boolean;
	}

	public Object canonicalizeValue(final Object value) {
		if (this.isValidValue(value)) {
			return value;
		}
		if (value == null) {
			throw new RuntimeException("Got invalid boolean value " + value);
		}
		if (value.toString().equals(CycObjectFactory.nil.toString())) {
			return false;
		}
		if (value.toString().equals(CycObjectFactory.t.toString())) {
			return true;
		}
		throw new RuntimeException("Got invalid boolean value " + value);
	}

	public String getPrettyRepresentation(final Object value) {
		if (value instanceof Boolean) {
			return (boolean) value ? "Yes" : "No";
		}
		return super.getPrettyRepresentation(value);
	}

	public Object parameterValueCycListApiValue(final Object val) {
		if ((boolean) val) {
			return CycObjectFactory.t;
		}
		return CycObjectFactory.nil;
	}

	public static void main(final String[] args) {
	}
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 28 ms
	
	Decompiled with Procyon 0.5.32.
*/