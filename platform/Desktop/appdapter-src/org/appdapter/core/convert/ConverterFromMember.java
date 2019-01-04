package org.appdapter.core.convert;

import static org.appdapter.core.convert.ReflectUtils.DEFAULT_CONVERTER;
import static org.appdapter.core.convert.ReflectUtils.isStatic;
import static org.appdapter.core.convert.ReflectUtils.noSuchConversion;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

import org.appdapter.core.jvm.CallableWithParameters;
import org.appdapter.core.log.Debuggable;

public class ConverterFromMember extends Debuggable implements Converter {

	Method m;
	final Class to, from;
	boolean isStatic;
	boolean allowTransitive;
	boolean allowOptionalArgs;
	ConverterMethod info;
	CallableWithParameters callable;

	@Override public String toString() {
		return "{" + toInfoStringArgV(from, "=", to, getFunction()) + "}";
	}

	private Object getFunction() {
		if (m != null)
			return m;
		return callable;
	}

	public void setMethodAsCallable(Method m) {
		this.m = m;
		isStatic = ReflectUtils.isStatic(m);
		callable = new CallableWithParameters() {
			final Method m = this.m;

			@Override public Object call(Object o, Object... params) {
				try {
					if (isStatic) {
						return m.invoke(null, o);
					} else {
						return m.invoke(o);
					}
				} catch (Exception e) {
					throw new ClassCastException(e.getMessage());
				}
			}

		};
	}

	@Override public boolean equals(Object obj) {
		return super.equals(obj) || ((obj instanceof ConverterFromMember) && (((ConverterFromMember) obj).m == m));
	}

	@Override public int hashCode() {
		return m.hashCode();
	}

	public ConverterFromMember(Method m, boolean transitive, ConverterMethod cmi) {
		this.m = m;
		this.callable = null;
		info = cmi;
		allowTransitive = transitive;
		isStatic = isStatic(m);
		to = m.getReturnType();
		if (isStatic) {
			from = m.getParameterTypes()[0];
			allowOptionalArgs = m.getParameterTypes().length > 1;
		} else {
			from = m.getDeclaringClass();
			allowOptionalArgs = m.getParameterTypes().length > 0;
		}
		if (cmi != null) {
			allowTransitive = cmi.AllowTranstiveConversions();
			allowOptionalArgs = cmi.HasOptionalArgs();
		}
	}

	public <F, T> ConverterFromMember(Class<F> from, Class<T> to, CallableWithParameters<F, T> callable, boolean transitive, ConverterMethod cmi) {
		m = null;
		this.callable = callable;
		info = cmi;
		allowTransitive = transitive;
		isStatic = true;
		this.to = to;
		this.from = from;
		allowOptionalArgs = false;
	}

	public Integer isAssignableFromL(Class objNeedsToBe, Class from, List maxConverts) {
		if (from == objNeedsToBe)
			return WILL;
		if (objNeedsToBe == null || from == null)
			return MIGHT;
		if (objNeedsToBe.isAssignableFrom(from))
			return Converter.WILL;
		if (!allowTransitive || maxConverts.size() > 3) {
			return WONT;
		}
		return DEFAULT_CONVERTER.declaresConverts(null, from, objNeedsToBe, maxConverts);
	}

	@Override public Integer declaresConverts(Object val, Class valClass, Class objNeedsToBe, List maxConverts) {
		if (!objNeedsToBe.isAssignableFrom(to))
			return WONT;
		return isAssignableFromL(from, valClass, maxConverts);
	}

	@Override public <T> T convert(Object obj, Class<T> objNeedsToBe, List maxConverts) throws NoSuchConversionException {
		try {
			Object o = DEFAULT_CONVERTER.convert(obj, from, maxConverts);
			Object mid;
			if (m != null) {
				if (isStatic) {
					mid = m.invoke(null, o);
				} else {
					mid = m.invoke(o);
				}
			} else {
				mid = this.callable.call(o);
			}
			return (T) DEFAULT_CONVERTER.convert(mid, objNeedsToBe, maxConverts);
		} catch (Throwable e) {
			return noSuchConversion(obj, objNeedsToBe, e);
		}

	}

}
