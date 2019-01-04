package org.appdapter.gui.util;

import static org.appdapter.gui.util.CollectionSetUtils.addIfNew;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.LinkedList;

import javax.naming.Binding;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.Name;
import javax.naming.NameClassPair;
import javax.naming.NameParser;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.NoInitialContextException;
import javax.naming.spi.NamingManager;

import org.appdapter.core.debug.UIAnnotations.HRKRefinement;
import org.appdapter.core.log.Debuggable;
import org.appdapter.gui.util.NamingResolver.SavedFromResolverMap;
import org.appdapter.gui.util.ObjectFinder.Found;

/**
 * <p>
 * NoInitialContextException is thrown when an initial context cannot be
 * instantiated. This exception can be thrown during any interaction with the
 * InitialContext, not only when the InitialContext is constructed. For example,
 * the implementation of the initial context might lazily retrieve the context
 * only when actual methods are invoked on it. The application should not have
 * any dependency on when the existence of an initial context is determined.
 * <p>
 * 
 * @author Administrator
 * 
 */
public class InitialBoxedContext extends InitialContext implements Context, HRKRefinement {

	Context ctx;

	public Context getRealCtx() {
		if (ctx == null)
			try {
				return getDefaultInitCtx();
			} catch (NamingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return ctx;
	}

	/**
	 * Retrieves a context for resolving the string name <code>name</code>. If
	 * <code>name</code> name is a URL string, then attempt to find a URL
	 * context for it. If none is found, or if <code>name</code> is not a URL
	 * string, then return <code>getDefaultInitCtx()</code>.
	 * <p>
	 * See getURLOrDefaultInitCtx(Name) for description of how a subclass should
	 * use this method.
	 * 
	 * @param name
	 *            The non-null name for which to get the context.
	 * @return A URL context for <code>name</code> or the cached initial
	 *         context. The result cannot be null.
	 * @exception NoInitialContextException
	 *                If cannot find an initial context.
	 * @exception NamingException
	 *                In a naming exception is encountered.
	 * @see javax.naming.spi.NamingManager#getURLContext
	 */
	@Override public Context getURLOrDefaultInitCtx(String name) throws NamingException {
		if (NamingManager.hasInitialContextFactoryBuilder()) {
			return getDefaultInitCtx();
		}
		String scheme = getURLScheme(name);
		if (scheme != null) {
			Context ctx0 = NamingManager.getURLContext(scheme, myProps);
			if (ctx0 != null) {
				return ctx0;
			}
		}
		return getDefaultInitCtx();
	}

	/**
	 * Retrieves a context for resolving <code>name</code>. If the first
	 * component of <code>name</code> name is a URL string, then attempt to find
	 * a URL context for it. If none is found, or if the first component of
	 * <code>name</code> is not a URL string, then return
	 * <code>getDefaultInitCtx()</code>.
	 * <p>
	 * When creating a subclass of InitialContext, use this method as follows.
	 * Define a new method that uses this method to get an initial context of
	 * the desired subclass.
	 * <p>
	 * <blockquote>
	 * 
	 * <pre>
	 * protected XXXContext getURLOrDefaultInitXXXCtx(Name name)
	 * 		throws NamingException {
	 * 	Context answer = getURLOrDefaultInitCtx(name);
	 * 	if (!(answer instanceof XXXContext)) {
	 * 		if (answer == null) {
	 * 			throw new NoInitialContextException();
	 * 		} else {
	 * 			throw new NotContextException(&quot;Not an XXXContext&quot;);
	 * 		}
	 * 	}
	 * 	return (XXXContext) answer;
	 * }
	 * </pre>
	 * 
	 * </blockquote> When providing implementations for the new methods in the
	 * subclass, use this newly defined method to get the initial context.
	 * <p>
	 * <blockquote>
	 * 
	 * <pre>
	 * public Object XXXMethod1(Name name, ...) {
	 *  throws NamingException {
	 *    return getURLOrDefaultInitXXXCtx(name).XXXMethod1(name, ...);
	 * }
	 * </pre>
	 * 
	 * </blockquote>
	 * 
	 * @param name
	 *            The non-null name for which to get the context.
	 * @return A URL context for <code>name</code> or the cached initial
	 *         context. The result cannot be null.
	 * @exception NoInitialContextException
	 *                If cannot find an initial context.
	 * @exception NamingException
	 *                In a naming exception is encountered.
	 * 
	 * @see javax.naming.spi.NamingManager#getURLContext
	 */
	@Override public Context getURLOrDefaultInitCtx(Name name) throws NamingException {
		if (NamingManager.hasInitialContextFactoryBuilder()) {
			return getDefaultInitCtx();
		}
		if (name.size() > 0) {
			String first = name.get(0);
			String scheme = getURLScheme(first);
			if (scheme != null) {
				Context ctxL = NamingManager.getURLContext(scheme, myProps);
				if (ctxL != null) {
					return ctxL;
				}
			}
		}
		return getDefaultInitCtx();
	}

	private static String getURLScheme(String str) {
		int colon_posn = str.indexOf(':');
		int slash_posn = str.indexOf('/');

		if (colon_posn > 0 && (slash_posn == -1 || colon_posn < slash_posn))
			return str.substring(0, colon_posn);
		return null;
	}

	/**
	 * Retrieves the initial context by calling
	 * <code>NamingManager.getInitialContext()</code> and cache it in
	 * defaultInitCtx. Set <code>gotDefault</code> so that we know we've tried
	 * this before.
	 * 
	 * @return The non-null cached initial context.
	 * @exception NoInitialContextException
	 *                If cannot find an initial context.
	 * @exception NamingException
	 *                If a naming exception was encountered.
	 */
	@Override final protected Context getDefaultInitCtx() throws NamingException {
		if (!gotDefault) {
			defaultInitCtx = NamingManager.getInitialContext(myProps);
			gotDefault = true;
		}
		if (defaultInitCtx == null)
			throw new NoInitialContextException();

		return defaultInitCtx;
	}

	public InitialBoxedContext() throws NamingException {
		super();
		ctx = new InitialContext();
		initAtLeastOnce();
		// TODO Auto-generated constructor stub
	}

	public InitialBoxedContext(Hashtable<?, ?> environment) throws NamingException {
		super(environment);
		ctx = new InitialContext(environment);
		initAtLeastOnce();
		// TODO Auto-generated constructor stub
	}

	private void initAtLeastOnce() {
		Debuggable.notImplemented();

	}

	protected InitialBoxedContext(boolean lazy) throws NamingException {
		super(lazy);
		ctx = null;
		initAtLeastOnce();
		// TODO Auto-generated constructor stub
	}

	public InitialBoxedContext(Context context) throws NamingException {
		super();
		context = ctx;
		initAtLeastOnce();
	}

	@Override public Object lookup(String name) throws NamingException {
		return lookup(getURLOrDefaultInitCtx(name), name, null);
	}

	public <T, O extends T> O lookup(Class<T> class1) throws NamingException {
		String name = class1.getSimpleName();
		return lookup(getURLOrDefaultInitCtx(name), name, class1);
	}

	public static <T, O extends T> O lookup(Context context, String name, Class<T> class1) throws NamingException {
		O obj = lookup(context, name, class1, false);
		if (obj != null)
			return obj;
		obj = lookup(context, name, class1, true);
		if (obj != null)
			return obj;
		return obj;
	}

	@SuppressWarnings("unchecked") public static <T, O extends T> O lookup(Context context, String name, Class<T> class1, boolean createIfNotFound) throws NamingException {
		String lname = name;
		if (name == null) {
			name = class1.getSimpleName();
		}
		try {
			return (O) context.lookup(lname);
		} catch (javax.naming.ServiceUnavailableException e) {

			for (NamingResolver res : namingResolvers) {
				Collection<Object> dontUse = new LinkedList();
				Found<T> v = res.lookup(name, class1, createIfNotFound, dontUse);
				if (v != null) {
					return (O) v.getValue();
				}
			}
			throw e;
		} catch (javax.naming.NamingException e) {
			throw e;
		}
	}

	@Override public Object lookup(Name name) throws NamingException {
		return getURLOrDefaultInitCtx(name).lookup(name);
	}

	@Override public void bind(String name, Object obj) throws NamingException {
		getURLOrDefaultInitCtx(name).bind(name, obj);
	}

	@Override public void bind(Name name, Object obj) throws NamingException {
		getURLOrDefaultInitCtx(name).bind(name, obj);
	}

	@Override public void rebind(String name, Object obj) throws NamingException {
		getURLOrDefaultInitCtx(name).rebind(name, obj);
	}

	@Override public void rebind(Name name, Object obj) throws NamingException {
		getURLOrDefaultInitCtx(name).rebind(name, obj);
	}

	@Override public void unbind(String name) throws NamingException {
		getURLOrDefaultInitCtx(name).unbind(name);
	}

	@Override public void unbind(Name name) throws NamingException {
		getURLOrDefaultInitCtx(name).unbind(name);
	}

	@Override public void rename(String oldName, String newName) throws NamingException {
		getURLOrDefaultInitCtx(oldName).rename(oldName, newName);
	}

	@Override public void rename(Name oldName, Name newName) throws NamingException {
		getURLOrDefaultInitCtx(oldName).rename(oldName, newName);
	}

	@Override public NamingEnumeration<NameClassPair> list(String name) throws NamingException {
		return (getURLOrDefaultInitCtx(name).list(name));
	}

	@Override public NamingEnumeration<NameClassPair> list(Name name) throws NamingException {
		return (getURLOrDefaultInitCtx(name).list(name));
	}

	@Override public NamingEnumeration<Binding> listBindings(String name) throws NamingException {
		return getURLOrDefaultInitCtx(name).listBindings(name);
	}

	@Override public NamingEnumeration<Binding> listBindings(Name name) throws NamingException {
		return getURLOrDefaultInitCtx(name).listBindings(name);
	}

	@Override public void destroySubcontext(String name) throws NamingException {
		getURLOrDefaultInitCtx(name).destroySubcontext(name);
	}

	@Override public void destroySubcontext(Name name) throws NamingException {
		getURLOrDefaultInitCtx(name).destroySubcontext(name);
	}

	@Override public Context createSubcontext(String name) throws NamingException {
		return getURLOrDefaultInitCtx(name).createSubcontext(name);
	}

	@Override public Context createSubcontext(Name name) throws NamingException {
		return getURLOrDefaultInitCtx(name).createSubcontext(name);
	}

	@Override public Object lookupLink(String name) throws NamingException {
		return getURLOrDefaultInitCtx(name).lookupLink(name);
	}

	@Override public Object lookupLink(Name name) throws NamingException {
		return getURLOrDefaultInitCtx(name).lookupLink(name);
	}

	@Override public NameParser getNameParser(String name) throws NamingException {
		return getURLOrDefaultInitCtx(name).getNameParser(name);
	}

	@Override public NameParser getNameParser(Name name) throws NamingException {
		return getURLOrDefaultInitCtx(name).getNameParser(name);
	}

	@Override public Name composeName(Name name, Name prefix) throws NamingException {
		Debuggable.notImplemented();
		return getURLOrDefaultInitCtx(name).composeName(name, prefix);
	}

	@Override public String composeName(String name, String prefix) throws NamingException {
		Debuggable.notImplemented();
		return getURLOrDefaultInitCtx(name).composeName(name, prefix);
	}

	@Override public Object addToEnvironment(String propName, Object propVal) throws NamingException {
		Debuggable.notImplemented();
		return getRealCtx().addToEnvironment(propName, propVal);
	}

	@Override public Object removeFromEnvironment(String propName) throws NamingException {
		Debuggable.notImplemented();
		return getRealCtx().removeFromEnvironment(propName);
	}

	@Override public Hashtable<?, ?> getEnvironment() throws NamingException {
		Debuggable.notImplemented();
		return getRealCtx().getEnvironment();
	}

	@Override public void close() throws NamingException {
		Debuggable.notImplemented();
		getRealCtx().close();
	}

	@Override public String getNameInNamespace() throws NamingException {
		Debuggable.notImplemented();
		return getRealCtx().getNameInNamespace();
	}

	public static InitialBoxedContext forContext(Context context) {
		Debuggable.notImplemented();
		if (context instanceof HRKRefinement)
			return (InitialBoxedContext) context;
		try {
			return new InitialBoxedContext(context);
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return (InitialBoxedContext) context;
		}
	}

	static ArrayList<NamingResolver> namingResolvers = new ArrayList<NamingResolver>();
	static SavedFromResolverMap fromResolverMap = new SavedFromResolverMap();
	static {
		namingResolvers.add(fromResolverMap);
	}

	public static void installNamingResolver(NamingResolver resolver) {
		addIfNew(namingResolvers, resolver);
	}

	@UIHidden
	public static void register(Object obj) {
		saveSomewhere(null, null, obj);
	}

	public static void register(Context ctx, String name, Class clz, Object obj) {
		saveSomewhere(null, name, obj);
	}

	private static void saveOnNames(Context ctx, Object obj, String... names) {
		if (names.length == 1) {
			String name = names[0];
			if (ctx != null) {
				try {
					ctx.bind(name, obj);
				} catch (NamingException e) {
					e.printStackTrace();
				}
			}
			fromResolverMap.save(name.toString(), obj);
			return;
		}
		for (String name : names) {
			if (name == null)
				continue;
			saveOnNames(ctx, obj, name);
		}
	}

	private static void saveSomewhere(Context ctx, String name, Object obj, Class... ifaces) {
		if (ifaces == null || ifaces.length == 0)
			ifaces = obj.getClass().getInterfaces();
		if (ifaces.length == 1 && ifaces[0] == null) {
			ifaces = new Class[0];
		}
		if (ifaces.length == 0) {
			fromResolverMap.save(name.toString(), obj);
			return;
		}
		if (ifaces.length == 1) {
			Class face = ifaces[0];
			saveOnNames(ctx, obj, name, face.getSimpleName(), face.getName(), Debuggable.objKey(obj));
			return;
		}

		for (Class saveOn : ifaces) {
			saveSomewhere(ctx, name, obj, saveOn);
		}
	}

}
