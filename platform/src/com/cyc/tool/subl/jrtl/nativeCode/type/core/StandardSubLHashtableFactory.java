//
// For LarKC
//
package com.cyc.tool.subl.jrtl.nativeCode.type.core;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StandardSubLHashtableFactory implements SubLHashtableFactory {
	private static SubLHashtableFactory getHashtableFactory() {
		SubLHashtableFactory result = new StandardSubLHashtableFactory();
		String hashTableFactoryClass = System.getProperty("HASH_TABLE_FACTORY_CLASS");
		if (hashTableFactoryClass != null)
			try {
				Class theClass = StandardSubLHashtableFactory.class.getClassLoader().loadClass(hashTableFactoryClass);
				Constructor constructor = theClass.getConstructor(new Class[0]);
				result = (SubLHashtableFactory) constructor.newInstance(new Object[0]);
			} catch (Exception e) {
				Logger.getAnonymousLogger().log(Level.SEVERE,
						"Unable to find/use hash table factory class: " + hashTableFactoryClass, e);
			}
		return result;
	}

	public static SubLHashtableFactory factory;
	static {
		factory = getHashtableFactory();
	}

	@Override
	public Map createMap() {
		return new HashMap();
	}

	@Override
	public Map createMap(int size) {
		return new HashMap(size);
	}

	@Override
	public Map createMap(int size, float loadFactor) {
		return new HashMap(size, loadFactor);
	}
}
