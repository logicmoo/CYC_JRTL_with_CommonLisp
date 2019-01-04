package org.appdapter.gui.browse;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.List;

import org.appdapter.core.convert.Converter;
import org.appdapter.core.convert.NoSuchConversionException;
import org.appdapter.core.convert.ReflectUtils;
import org.appdapter.core.convert.ToFromKeyConverter;
import org.appdapter.core.log.Debuggable;

abstract public class ToFromKeyConverterImpl<VALUECLASS, KEYCLASS> implements Converter, ToFromKeyConverter<VALUECLASS, KEYCLASS> {
	protected Class<VALUECLASS> valueClass;
	protected Class<KEYCLASS> keyClass;

	@Override public String toString() {
		return "{" + Debuggable.toInfoStringArgV(keyClass, "=", valueClass, getClass()) + "}";
	}

	@Override public Integer declaresConverts(Object val, Class valClass, Class objNeedsToBe, List maxCvt) {
		if (valClass != keyClass)
			return WONT;
		return CASTING_ONLY.declaresConverts(val, valueClass, objNeedsToBe, maxCvt);
	}

	protected ToFromKeyConverterImpl(Class<VALUECLASS> toClz, Class<KEYCLASS> fromClz) {
		valueClass = toClz;
		keyClass = fromClz;
	}

	protected ToFromKeyConverterImpl() {
		valueClass = null;
	}

	@Override public <T> T convert(Object obj, Class<T> objNeedsToBe, List maxCvt) throws NoSuchConversionException {
		if (obj == null)
			throw new NoSuchConversionException(obj, objNeedsToBe);
		Class objClass = obj.getClass();
		if (declaresConverts(obj, objClass, objNeedsToBe, maxCvt) == WONT)
			throw new NoSuchConversionException(obj, objNeedsToBe);
		if (objNeedsToBe.isAssignableFrom(keyClass)) {
			// try to go to Key
			return (T) toKey((VALUECLASS) obj);
		}
		return (T) fromKey((KEYCLASS) obj, objNeedsToBe);
	}

	public abstract VALUECLASS fromKey(KEYCLASS title, Class specializedMaybe);

	public KEYCLASS toKeyFromObject(Object toBecomeAKey) {
		return toKey((VALUECLASS) toBecomeAKey);
	}

	public abstract KEYCLASS toKey(VALUECLASS toBecomeAKey);

	public Object fromKeySearch(KEYCLASS title) throws ClassCastException {
		if (valueClass == keyClass)
			return title;
		valueClass = ReflectUtils.nonPrimitiveTypeFor(valueClass);
		ClassCastException cce = null;
		Class searchType = valueClass;
		while (searchType != null) {
			for (Method m : searchType.getDeclaredMethods()) {
				if (m.getReturnType() == valueClass) {
					Class[] pt = m.getParameterTypes();
					if (pt != null && pt.length == 1 && pt[0] == keyClass && Modifier.isStatic(m.getModifiers())) {
						try {
							m.setAccessible(true);
							return m.invoke(null, title);
						} catch (Throwable e) {
							cce = new ClassCastException(valueClass + " " + m.getName() + " " + title);
						}
					}
				}
			}
			searchType = searchType.getSuperclass();
		}
		if (cce != null)
			throw cce;
		throw new ClassCastException(valueClass + " fromKey " + title);
	}

}
