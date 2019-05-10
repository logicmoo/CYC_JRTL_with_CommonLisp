package org.appdapter.core.jvm;

import java.util.WeakHashMap;

public interface ObjectKey<T> {

	static public WeakHashMap<String, Object> keyToBoxImpl = new WeakHashMap<String, Object>();
	ObjectKeyImpl factory = new ObjectKeyImpl();

	abstract public String getKeyName(T... box);

	public static class ObjectKeyImpl<TT> implements ObjectKey<TT> {
		@Override
		public String getKeyName(Object... box) {
			String one = get1KeyName(box[0]);
			if (box.length == 1) {
				return one;
			}
			StringBuffer sb = new StringBuffer(one);
			for (int i = 1; i < box.length; i++) {
				sb.append(" ");
				sb.append(i);
				sb.append(":");
				sb.append(get1KeyName(box[0]));
			}
			return sb.toString();
		}

		static public String get1KeyName(Object box) {
			if (box == null) {
				return "null";
			}
			return box.getClass().getName() + "@"
					+ System.identityHashCode(box);
		}

	}
}
