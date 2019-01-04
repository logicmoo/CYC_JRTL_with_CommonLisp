package org.appdapter.gui.util;

import java.util.Collection;
import java.util.ServiceLoader;

import org.appdapter.api.trigger.AnyOper;
import org.appdapter.gui.util.ObjectFinder.Found;
import org.appdapter.gui.util.ObjectFinder.FoundObject;

public class ClassLoadingNamingResolver implements NamingResolver {

	public ClassLoadingNamingResolver() {
		InitialBoxedContext.installNamingResolver(this);
	}

	@Override public <T, O extends T> Found<O> lookup(String name, Class<T> cls, boolean createIfNotFound, Collection<Object> dontUse) {
		if (dontUse.contains(this))
			return null;
		dontUse.add(this);
		if (!createIfNotFound)
			return null;
		if (cls == null) {
			try {
				cls = PromiscuousClassUtilsA.forName(name);
			} catch (ClassNotFoundException e) {
				cls = null;
			}
		} else {
			PromiscuousClassUtilsA.ensureOntoligized(cls);
		}

		Class<AnyOper> clo = (Class<AnyOper>) cls;
		final ServiceLoader<T> sl = (ServiceLoader<T>) ServiceLoader.load(clo);
		if (sl != null)
			return new FoundObject<O>(null, name, new ObjectFinder.GetF<O>() {
				@SuppressWarnings("unchecked") @Override public O getValue() {
					return (O) sl.iterator().next();
				}
			});
		return null;
	}

}
