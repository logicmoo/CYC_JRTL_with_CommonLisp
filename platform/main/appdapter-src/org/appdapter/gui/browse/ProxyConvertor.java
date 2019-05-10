package org.appdapter.gui.browse;

import java.util.List;

import org.appdapter.core.convert.Converter;
import org.appdapter.core.convert.NoSuchConversionException;

public class ProxyConvertor implements Converter {

	@Override public Integer declaresConverts(Object val, Class valClass, Class objNeedsToBe, List maxCvt) {
		PropertyDescriptorForField f = PropertyDescriptorForField.proxyToField.get(objNeedsToBe);
		if (f == null)
			return WONT;
		return f.declaresConverts(val, valClass, objNeedsToBe, maxCvt);
	}

	@Override public <T> T convert(Object obj, Class<T> objNeedsToBe, List maxCvt) throws NoSuchConversionException {
		PropertyDescriptorForField f = PropertyDescriptorForField.proxyToField.get(objNeedsToBe);
		if (f == null)
			return null;
		if (f == null)
			throw new NoSuchConversionException(obj, objNeedsToBe);
		return f.convert(obj, objNeedsToBe, maxCvt);
	}

}
