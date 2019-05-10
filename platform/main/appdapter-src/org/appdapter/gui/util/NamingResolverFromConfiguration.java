package org.appdapter.gui.util;

import java.util.Collection;

import org.appdapter.gui.util.ObjectFinder.Found;
import org.appdapter.gui.util.ObjectFinder.FoundObject;


public class NamingResolverFromConfiguration implements NamingResolver {

	public interface Configuration {
		<T> T loadObject(Class<T> cls, String name);
	}

	Configuration configuration = null;

	public NamingResolverFromConfiguration(Configuration cfg) {
		configuration = cfg;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T, O extends T> Found<O> lookup(String name, Class<T> cls,
			boolean createIfNotFound, Collection<Object> dontUse) {
		if (dontUse.contains(this))
			return null;
		dontUse.add(this);
		if (dontUse.contains(configuration))
			return null;
		dontUse.add(configuration);
		O o;
		try {
			T loadObject = configuration.loadObject(cls, name);
			o = ((O) loadObject);
			return new FoundObject<O>(name, o);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public static void installNamingResolver(Configuration cfg) {
		InitialBoxedContext
				.installNamingResolver(new NamingResolverFromConfiguration(cfg));
	}

}
