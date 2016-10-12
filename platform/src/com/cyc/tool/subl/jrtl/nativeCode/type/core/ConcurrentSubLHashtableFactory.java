//
//
//
package com.cyc.tool.subl.jrtl.nativeCode.type.core;

import java.lang.reflect.Constructor;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConcurrentSubLHashtableFactory implements SubLHashtableFactory {
	public static SubLHashtableFactory factory;

	static {
		ConcurrentSubLHashtableFactory.factory = ConcurrentSubLHashtableFactory.getHashtableFactory();
	}

	private static SubLHashtableFactory getHashtableFactory() {
		SubLHashtableFactory result = new ConcurrentSubLHashtableFactory();
		String hashTableFactoryClass = System.getProperty("HASH_TABLE_FACTORY_CLASS");
		if (hashTableFactoryClass != null)
			try {
				Class theClass = ConcurrentSubLHashtableFactory.class.getClassLoader().loadClass(hashTableFactoryClass);
				Constructor constructor = theClass.getConstructor(new Class[0]);
				result = (SubLHashtableFactory) constructor.newInstance(new Object[0]);
			} catch (Exception e) {
				Logger.getAnonymousLogger().log(Level.SEVERE,
						"Unable to find/use hash table factory class: " + hashTableFactoryClass, e);
			}
		return result;
	}

	public Map createMap() {
		return new ConcurrentHashMap();
	}

	public Map createMap(int size) {
		return new ConcurrentHashMap(size);
	}

	public Map createMap(int size, float loadFactor) {
		return new ConcurrentHashMap(size, loadFactor);
	}
}
