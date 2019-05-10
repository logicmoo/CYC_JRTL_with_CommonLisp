package org.appdapter.core.convert;

import java.util.List;

public class AggregateOptionalArgs implements OptionalArg {

	List<OptionalArg> cnverters;

	public AggregateOptionalArgs(List<OptionalArg> registeredConverters) {
		cnverters = registeredConverters;
	}

	@Override public Object getArg(Class pt) throws NoSuchConversionException {
		NoSuchConversionException nsc = null;
		for (OptionalArg a : ReflectUtils.copyOf(cnverters)) {
			if (a == null)
				continue;
			try {
				Object obj = a.getArg(pt);
				if (pt.isInstance(obj))
					return obj;
			} catch (NoSuchConversionException e) {
				nsc = e;
			}
		}
		if (nsc != null)
			throw nsc;
		return null;
	}

	@Override public void reset() {
		for (OptionalArg a : ReflectUtils.copyOf(cnverters)) {
			if (a == null)
				continue;
			a.reset();
		}

	}

}