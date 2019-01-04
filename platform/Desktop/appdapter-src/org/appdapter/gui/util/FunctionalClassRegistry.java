package org.appdapter.gui.util;

import java.beans.BeanDescriptor;
import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.io.IOException;
import java.util.HashMap;

import org.appdapter.core.log.Debuggable;
import org.appdapter.gui.browse.Utility;
import static org.appdapter.gui.util.CollectionSetUtils.*;
import static org.appdapter.gui.util.PromiscuousClassUtilsA.*;

class FunctionalClassRegistry<RSLTCLASS> extends FunctionalRegistryMap<Class, Class<RSLTCLASS>> {

	/**
	 * Finds a Class that implements a delegateType that processes the  objClass
	 * 
	 * @param resultType
	 * @param srchCiteria
	 * @return
	 * @throws Throwable
	 */
	public static <BT, T extends BT> Class<T> findImplmentingForMatch(Class<BT> resultType, Class srchCiteria) {
		FunctionalClassRegistry<BT> fcbk = findFinder(resultType);
		return (Class<T>) fcbk.findCustomizerClass(srchCiteria);
	}

	public static <BT, T extends BT> void addDelegateClass(Class<BT> delegateType, Class customizerClass, Class... objClass) {
		FunctionalClassRegistry<BT> fcbk = findFinder(delegateType);
		fcbk.registerCustomizerDef(customizerClass, objClass);
	}

	static HashMap<Class, FunctionalClassRegistry> classFinders = new HashMap<Class, FunctionalClassRegistry>();

	/**
	 *  Get a finder that when searched later returns a specified resultType
	 *  
	 * @param resultType
	 * @return
	 */
	static <T> FunctionalClassRegistry<T> findFinder(Class<T> resultType) {
		FunctionalClassRegistry fcbk = classFinders.get(resultType);
		if (fcbk == null) {
			fcbk = new FunctionalClassRegistry(resultType);
			classFinders.put(resultType, fcbk);
		}
		return fcbk;
	}

	FunctionalClassRegistry(Class<RSLTCLASS> baseClass) {
		this.baseClass = baseClass;
		classFinders.put(baseClass, this);
	}

	final Class<RSLTCLASS> baseClass;

	@Override public Class<RSLTCLASS> tryLast(Class c) {
		if (true)
			return null;
		String fnd = getLowerSimplestNameMinusBeanInfo(c);
		try {
			for (Class<?> possible : ClassFinder.getClasses(baseClass)) {
				if (!isCreateable(possible))
					continue;
				String cn = getLowerSimplestNameMinusBeanInfo(possible);
				if (cn.toLowerCase().contains(fnd.toLowerCase()))
					return (Class<RSLTCLASS>) possible;
			}
		} catch (IOException e) {
			Debuggable.UnhandledException(e);
			return null;
		}
		return null;
	}

	private String getLowerSimplestNameMinusBeanInfo(Class c) {
		String sn = c.getSimpleName();
		if (sn == null)
			sn = c.getName();
		return sn.replace("Bean", "").replace("Info", "").replace("CustomizerClass", "").replace("Customizer", "").replace("Editor", "");
	}

	@SuppressWarnings("unchecked") public Class<RSLTCLASS> tryFirst(Class c) {
		BeanInfo objectInfo;
		try {
			objectInfo = Utility.getBeanInfoNoF(c, false);
		} catch (IntrospectionException e) {
			return null;
		}
		BeanDescriptor descriptor = objectInfo.getBeanDescriptor();
		Class<RSLTCLASS> customizerClass = null;
		if (descriptor != null) {
			customizerClass = (Class<RSLTCLASS>) descriptor.getCustomizerClass();
		}
		return customizerClass;
	}

	public @Override int meetSearchCriteria(Class t, Class c) {
		return t.isAssignableFrom(c) ? 1 : 0;
	}

	@Override public Class nextInListToTry(Class c) {
		return c.getSuperclass();
	}

}