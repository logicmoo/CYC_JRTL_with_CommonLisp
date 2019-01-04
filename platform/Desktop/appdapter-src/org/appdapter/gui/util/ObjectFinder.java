package org.appdapter.gui.util;

import java.util.Map;

public interface ObjectFinder {

	static public interface GetF<O> {
		O getValue();
	}

	static public class GetFoundImpl<O> implements GetF<O> {
		final O found;

		public GetFoundImpl(O obj) {
			found = obj;
		}

		@Override public O getValue() {
			return found;
		}

	}

	static public interface SetFound<O> {

		public void setValue(O val);

		static public class SetFoundImpl<K, O> implements SetFound<O> {
			final O found;
			private K key;
			private Map backing;

			public SetFoundImpl(Map<K, O> map, K key, O obj) {
				found = obj;
			}

			@Override public void setValue(O val) {
				backing.put(key, val);
			}
		}
	}

	static public interface Found<T> extends Map.Entry<String, T> {
	}

	static public class FoundObject<O> implements Found<O> {

		String key;
		private final GetF<O> getFound;
		private final Map<String, O> backing;

		public FoundObject(Map<String, O> map, String name, GetF<O> getf) {
			this.key = name;
			this.getFound = getf;
			this.backing = map;
		}

		public FoundObject(String name, O o) {
			this(null, name, new GetFoundImpl<O>(o));
		}

		@Override public String getKey() {
			return key;
		}

		@Override public O getValue() {
			if (getFound == null)
				return backing.get(key);
			return getFound.getValue();
		}

		@Override public O setValue(O value) {
			return backing.put(key, value);
		}

	}
}
