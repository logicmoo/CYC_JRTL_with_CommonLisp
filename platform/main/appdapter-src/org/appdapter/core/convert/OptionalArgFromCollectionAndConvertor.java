package org.appdapter.core.convert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OptionalArgFromCollectionAndConvertor implements OptionalArg {

	private Object[] al;
	private Object[] alP;
	private int len;
	Converter converter;
	private boolean throwNotNull;
	NoSuchConversionException lastEx;

	@Override public void reset() {
		setObjects(alP);
	}

	public OptionalArgFromCollectionAndConvertor(Object[] args, Converter conv, boolean throwNotNull) {
		converter = conv;
		setObjects(args);
		this.throwNotNull = throwNotNull;
	}

	public void setObjects(Object[] args) {
		this.alP = args;
		this.len = args.length;
		this.al = (Object[]) args.clone();
	}

	@Override public Object getArg(Class pt) throws NoSuchConversionException {
		lastEx = null;
		Object o = getArg(pt, al, true);
		if (pt.isInstance(o))
			return o;
		try {
			o = getArg(pt, alP, false);
			if (pt.isInstance(o))
				return o;
		} catch (NoSuchConversionException t) {
			lastEx = t;
		}
		if (throwNotNull) {
			if (lastEx != null)
				throw lastEx;
			throw new NoSuchConversionException("No finding " + pt);
		}
		return null;
	}

	public Object getArg(Class pt, Object[] alP, boolean del) throws NoSuchConversionException {
		for (int i = 0; i < len; i++) {
			Object a = alP[i];
			if (a == null)
				continue;
			if (pt.isInstance(a)) {
				if (del)
					alP[i] = null;
				return a;
			}
		}
		for (int i = 0; i < len; i++) {
			Object a = alP[i];
			if (a == null)
				continue;
			try {
				a = converter.convert(a, pt, AggregateConverter.newMcvt());
				if (pt.isInstance(a)) {
					if (del)
						alP[i] = null;
					return a;
				}
			} catch (NoSuchConversionException nsc) {
				lastEx = nsc;
			}
		}
		return null;
	}
}
