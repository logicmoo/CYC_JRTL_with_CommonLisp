package org.appdapter.gui.util;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.appdapter.gui.util.ObjectFinder.Found;
import org.appdapter.gui.util.ObjectFinder.FoundObject;

public interface NamingResolver {

	<T, O extends T> Found<O> lookup(String name, Class<T> cls,
			boolean createIfNotFound, Collection<Object> dontUse);

	public class SavedFromResolverMap implements NamingResolver {

		Map<String, Found> savedMap = new HashMap<String, Found>();

		@Override
		public <T, O extends T> Found<O> lookup(String name, Class<T> cls,
				boolean createIfNotFound, Collection<Object> dontUse) {
			if (dontUse.contains(this)) {
				return null;
			}
			if (dontUse.contains(savedMap)) {
				return null;
			}
			if (dontUse.contains(savedMap)) {
				return null;
			}
			dontUse.add(this);
			dontUse.add(savedMap);
			Found<O> fnd = savedMap.get(name);
			if (fnd != null)
				return fnd;
			return null;
		}

		public void save(String name, Object obj) {
			savedMap.put(name, new FoundObject(name, obj));
		}
	}
}
