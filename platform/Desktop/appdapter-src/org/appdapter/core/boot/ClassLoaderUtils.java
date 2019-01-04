package org.appdapter.core.boot;

import org.osgi.framework.BundleActivator;
import java.util.HashMap;
import org.slf4j.LoggerFactory;
import java.util.Collections;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import java.util.Dictionary;
import java.util.Hashtable;
import org.appdapter.core.log.Debuggable;
import org.osgi.framework.ServiceReference;
import org.osgi.framework.InvalidSyntaxException;
import java.util.ArrayList;
import org.osgi.framework.BundleContext;
import java.net.URL;
import java.util.List;
import java.util.Iterator;
import java.util.Collection;
import ext.osgi.common.MacroBundleActivatorBase;
import java.util.Map;
import java.util.HashSet;
import org.slf4j.Logger;

public class ClassLoaderUtils
{
    public static final String ALL_RESOURCE_CLASSLOADER_TYPES = "*";
    public static final String RESOURCE_CLASSLOADER_TYPE = "ResourceClassLoaderType";
    private static final Logger theLogger;
    static HashSet<ClassLoader> allSeenEverLoaders;
    static Map<String, ClassLoader> namedLoaders;

    public static void installBundleWatcher() {
        if (MacroBundleActivatorBase.classLoaderUtils != null) {
            return;
        }
        MacroBundleActivatorBase.classLoaderUtils = (MacroBundleActivatorBase.BundleClassWatcher)new BootBundleWatcher(MacroBundleActivatorBase.classLoaderUtils);
    }

    private static <T> boolean addIfNew(final Collection<T> col, final T e) {
        if (e == null) {
            return false;
        }
        if (col.contains(e)) {
            return false;
        }
        col.add(e);
        return true;
    }

    private static <T> boolean addAllIfNew(final Collection<T> col, final Iterable<T> ite) {
        if (ite == null) {
            return false;
        }
        boolean added = false;
        for (final T e : ite) {
            if (!col.contains(e)) {
                added = true;
                col.add(e);
            }
        }
        return added;
    }

    public static ClassLoader findResourceClassLoader(final String path, final List<ClassLoader> cLoaders) {
        for (final ClassLoader cl : cLoaders) {
            ClassLoaderUtils.allSeenEverLoaders.add(cl);
            final URL res = cl.getResource(path);
            if (res != null) {
                return cl;
            }
        }
        return null;
    }

    public static URL findResourceURL(final String path, final List<ClassLoader> cLoaders) {
        for (final ClassLoader cl : cLoaders) {
            ClassLoaderUtils.allSeenEverLoaders.add(cl);
            final URL res = cl.getResource(path);
            if (res != null) {
                return res;
            }
        }
        return null;
    }

    public static List<ClassLoader> getFileResourceClassLoaders(final BundleContext context, String resourceClassLoaderType) {
        if (resourceClassLoaderType == null || resourceClassLoaderType.isEmpty()) {
            resourceClassLoaderType = "*";
        }
        if (context == null) {
            return getFileResourceClassLoaders(resourceClassLoaderType, (List<ClassLoader>[])new List[0]);
        }
        final List<ClassLoader> resourceLoaders = new ArrayList<ClassLoader>();
        ServiceReference[] loaders = null;
        final String filter = "(ResourceClassLoaderType=" + resourceClassLoaderType + ")";
        try {
            loaders = context.getServiceReferences(ClassLoader.class.getName(), filter);
        }
        catch (InvalidSyntaxException ex) {
            ClassLoaderUtils.theLogger.warn("Syntax error with file resource ClassLoader filter string: " + filter + ".");
        }
        if (loaders == null || loaders.length == 0) {
            return resourceLoaders;
        }
        for (final ServiceReference ref : loaders) {
            final ClassLoader l = getLoader(context, ref);
            if (l != null) {
                resourceLoaders.add(l);
                ClassLoaderUtils.allSeenEverLoaders.add(l);
            }
        }
        return resourceLoaders;
    }

    public static List<ClassLoader> getFileResourceClassLoaders(String resourceClassLoaderType, final List<ClassLoader>... arrayOfcLoaders) {
        final List<ClassLoader> resourceLoaders = new ArrayList<ClassLoader>();
        for (final List<ClassLoader> cLoaders : arrayOfcLoaders) {
            if (cLoaders != null) {
                addAllIfNew(resourceLoaders, cLoaders);
            }
        }
        boolean isAll = false;
        final boolean useDefaults = true;
        boolean useAllSeenLoaders = false;
        if (resourceClassLoaderType == null || resourceClassLoaderType.isEmpty() || resourceClassLoaderType.equals("*")) {
            resourceClassLoaderType = "*";
            isAll = true;
            useAllSeenLoaders = true;
        }
        synchronized (ClassLoaderUtils.namedLoaders) {
            if (isAll) {
                addAllIfNew(resourceLoaders, ClassLoaderUtils.namedLoaders.values());
            }
            else {
                final ClassLoader cl = ClassLoaderUtils.namedLoaders.get(resourceClassLoaderType);
                if (cl == null) {
                    ClassLoaderUtils.theLogger.error("MISSING CLASSLOADER TYPE: ", (Object)resourceClassLoaderType);
                    useAllSeenLoaders = true;
                }
                else {
                    addIfNew(resourceLoaders, cl);
                }
            }
        }
        if (useDefaults) {
            addIfNew(resourceLoaders, Thread.currentThread().getContextClassLoader());
            addIfNew(resourceLoaders, ClassLoader.getSystemClassLoader());
        }
        if (useAllSeenLoaders) {
            synchronized (ClassLoaderUtils.allSeenEverLoaders) {
                addAllIfNew(resourceLoaders, ClassLoaderUtils.allSeenEverLoaders);
            }
        }
        ClassLoaderUtils.theLogger.info(Debuggable.toInfoStringCompound("getFileResourceClassLoaders-Count", new Object[] { resourceLoaders.size(), resourceLoaders }));
        return resourceLoaders;
    }

    private static ClassLoader getLoader(final BundleContext context, final ServiceReference ref) {
        if (context == null || ref == null) {
            ClassLoaderUtils.theLogger.warn(Debuggable.toInfoStringCompound("returning null from getLoader", new Object[] { context, ref }));
            return null;
        }
        final Object obj = context.getService(ref);
        if (obj == null || !ClassLoader.class.isAssignableFrom(obj.getClass())) {
            ClassLoaderUtils.theLogger.warn(Debuggable.toInfoStringCompound("returning null from getLoader+obj", new Object[] { context, ref, obj }));
            return null;
        }
        return (ClassLoader)obj;
    }

    public static void registerClassLoader(final BundleContext context, final ClassLoader loader, final String resourceClassLoaderType) {
        withClassLoader(context, loader, resourceClassLoaderType, false, false);
    }

    public static void registerClassLoader(final BundleContext context, final Class loader, final String resourceClassLoaderType) {
        registerClassLoader(context, getClassLoaderForClassOrSystemClassLoader(loader), resourceClassLoaderType);
    }

    private static void withClassLoader(final BundleContext context, final ClassLoader loader, String resourceClassLoaderType, final boolean contextOptional, final boolean isRemoval) {
        if (loader == null && !isRemoval) {
            ClassLoaderUtils.theLogger.error(Debuggable.toInfoStringCompound("NULLS in registerClassLoader", new Object[] { context, loader, resourceClassLoaderType, "contextOptional=", contextOptional, "isRemoval=", isRemoval }));
            return;
        }
        boolean isNamed = true;
        if (resourceClassLoaderType == null) {
            resourceClassLoaderType = "UNKNOWN";
            ClassLoaderUtils.theLogger.warn(Debuggable.toInfoStringCompound("UNKNOWN TYPE: registerClassLoader", new Object[] { context, loader, resourceClassLoaderType, "contextOptional=", contextOptional, "isRemoval=", isRemoval }));
            isNamed = false;
        }
        else if (resourceClassLoaderType.isEmpty() || resourceClassLoaderType.equals("*")) {
            resourceClassLoaderType = "*";
            isNamed = false;
        }
        synchronized (ClassLoaderUtils.namedLoaders) {
            if (isRemoval) {
                ClassLoaderUtils.allSeenEverLoaders.remove(loader);
                if (isNamed) {
                    ClassLoaderUtils.namedLoaders.remove(resourceClassLoaderType);
                }
            }
            else {
                ClassLoaderUtils.allSeenEverLoaders.add(loader);
                if (isNamed) {
                    ClassLoaderUtils.namedLoaders.put(resourceClassLoaderType, loader);
                }
            }
        }
        if (context == null) {
            if (!contextOptional) {
                ClassLoaderUtils.theLogger.error(Debuggable.toInfoStringCompound("NULLS in registerClassLoader", new Object[] { context, loader, resourceClassLoaderType, "contextOptional=", contextOptional, "isRemoval=", isRemoval }));
            }
            return;
        }
        final Dictionary<String, String> props = new Hashtable<String, String>();
        props.put("ResourceClassLoaderType", resourceClassLoaderType);
        context.registerService(ClassLoader.class.getName(), (Object)loader, (Dictionary)props);
    }

    public static void registerClassLoader(final Object something, final BundleContext ctx) {
        Class thisClass = something.getClass();
        if (something instanceof Class) {
            thisClass = (Class)something;
        }
        String pname = null;
        final Package p = thisClass.getPackage();
        if (p != null) {
            pname = p.getName();
        }
        withClassLoader(ctx, getClassLoader(thisClass), pname, true, false);
    }

    public static void unregisterClassLoader(final Object something, final BundleContext ctx) {
        Class thisClass = something.getClass();
        if (something instanceof Class) {
            thisClass = (Class)something;
        }
        withClassLoader(ctx, getClassLoader(thisClass), thisClass.getPackage().getName(), false, true);
    }

    public static ClassLoader getClassLoader(final Class thisClass) {
        ClassLoader cl = null;
        final Bundle bundle = FrameworkUtil.getBundle(thisClass);
        if (bundle != null) {
            cl = getBundleClassLoader(bundle);
            if (cl == null) {
                cl = getClasssLoader_Require_POM_REference(bundle);
            }
        }
        if (cl != null) {
            return cl;
        }
        return getClassLoaderForClassOrSystemClassLoader(thisClass);
    }

    public static ClassLoader getClasssLoader_Require_POM_REference(final Bundle bundle) {
        return null;
    }

    public static ClassLoader getBundleClassLoader(final Bundle bundle) {
        String bundleActivator = (String) bundle.getHeaders().get("Bundle-Activator");
        if (bundleActivator == null) {
            bundleActivator = (String) bundle.getHeaders().get("Jetty-ClassInBundle");
        }
        if (bundleActivator != null) {
            try {
                return getClassLoaderForClassOrSystemClassLoader(bundle.loadClass(bundleActivator));
            }
            catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return getClassLoaderForClassOrSystemClassLoader(bundle.getClass());
    }

    private static ClassLoader getClassLoaderForClassOrSystemClassLoader(final Class<?> loadClass) {
        final ClassLoader classLoader = loadClass.getClassLoader();
        if (classLoader == null) {
            return ClassLoader.getSystemClassLoader();
        }
        return classLoader;
    }

    public static URL getFileResource(final String resourceClassLoaderType, final String resourceName) {
        for (final ClassLoader cl : getFileResourceClassLoaders(resourceClassLoaderType, (List<ClassLoader>[])new List[0])) {
            final URL url = cl.getResource(resourceName);
            if (url != null) {
                return url;
            }
        }
        return null;
    }

    public static List<ClassLoader> getCurrentClassLoaderList() {
        return Collections.singletonList(Thread.currentThread().getContextClassLoader());
    }

    static {
        theLogger = LoggerFactory.getLogger((Class)ClassLoaderUtils.class);
        installBundleWatcher();
        ClassLoaderUtils.allSeenEverLoaders = new HashSet<ClassLoader>();
        ClassLoaderUtils.namedLoaders = new HashMap<String, ClassLoader>();
    }

    public static class BootBundleWatcher implements MacroBundleActivatorBase.BundleClassWatcher
    {
        MacroBundleActivatorBase.BundleClassWatcher bcw;

        public BootBundleWatcher(final MacroBundleActivatorBase.BundleClassWatcher bbw) {
            this.bcw = bbw;
        }

        public void unregisterClassLoader(final BundleActivator b, final BundleContext c) {
            ClassLoaderUtils.unregisterClassLoader(b, c);
            if (this.bcw != null) {
                this.bcw.unregisterClassLoader(b, c);
            }
        }

        public void registerClassLoader(final BundleActivator b, final BundleContext c) {
            ClassLoaderUtils.registerClassLoader(b, c);
            if (this.bcw != null) {
                this.bcw.registerClassLoader(b, c);
            }
        }
    }
}

/*

	Total time: 88 ms

*/