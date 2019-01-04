package ext.osgi.common;

import java.util.Iterator;
import java.util.Set;
import java.util.Collection;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.HashSet;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.HashMap;
import org.apache.log4j.PropertyConfigurator;
import org.slf4j.LoggerFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkEvent;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.URL;
import org.slf4j.Logger;
import java.util.ArrayList;
import java.util.Map;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkListener;
import org.osgi.framework.BundleActivator;

public abstract class MacroBundleActivatorBase implements BundleActivator, FrameworkListener
{
    public static boolean MACRO_LAUNCHER;
    public int bundleBootPhase;
    public static String EQBAR;
    public BundleContext m_context;
    public static Map<String, String> settingsName;
    public static final MacroStartupSettings macroStartupSettings;
    protected boolean startedEventScheduled;
    protected boolean hasDispatchedFrameworkStartedEvent;
    protected final Object dispatchEventLock;
    private boolean legacyStartWasOverriden_Check;
    public static BundleClassWatcher classLoaderUtils;
    public static ArrayList<BundleActivator> startedBundles;
    protected Logger myLogger;

    public static boolean isOSGIProperty(final String string, final Object value) {
        final String sp = System.getProperty(string, null);
        if (sp == null) {
            return value == null;
        }
        final String sv = "" + value;
        return sp.equalsIgnoreCase(sv);
    }

    public static void debugLoaders(final String clazzName) {
        Class clazz = null;
        try {
            clazz = Class.forName(clazzName, false, null);
            clazz.getDeclaredMethods();
            clazz.getDeclaredFields();
            if (isOSGIProperty("test.classloader", true)) {
                final Class class2 = Class.forName(clazz.getName(), true, null);
                if (class2 != clazz) {
                    warning("Classes not same as in current loader " + clazz, new Object[0]);
                    debugLoadersInfo(clazz);
                    debugLoadersInfo(class2);
                }
            }
        }
        catch (Throwable e) {
            e.printStackTrace();
            warning("Class has errors in current loader " + clazzName, new Object[0]);
            if (clazz != null) {
                debugLoadersInfo(clazz);
            }
            if (e instanceof NoClassDefFoundError) {
                return;
            }
            if (e instanceof Error) {
                throw (Error)e;
            }
        }
    }

    public static void debugLoaders(final Class clazz) {
        try {
            clazz.getDeclaredMethods();
            clazz.getDeclaredFields();
            if (isOSGIProperty("test.classloader", true)) {
                final Class class2 = Class.forName(clazz.getName(), true, null);
                if (class2 != clazz) {
                    warning("Classes not same as in current loader " + clazz, new Object[0]);
                    debugLoadersInfo(clazz);
                    debugLoadersInfo(class2);
                }
            }
        }
        catch (Throwable e) {
            e.printStackTrace();
            warning("Class has errors in current loader " + clazz, new Object[0]);
            debugLoadersInfo(clazz);
            if (e instanceof NoClassDefFoundError) {
                return;
            }
            if (e instanceof Error) {
                throw (Error)e;
            }
        }
    }

    public static void debugLoadersInfo(final Class clazz) {
        final ClassLoader myLoader = clazz.getClassLoader();
        final ClassLoader pLoader = myLoader.getParent();
        final ClassLoader gpLoader = pLoader.getParent();
        final ClassLoader threadCL = Thread.currentThread().getContextClassLoader();
        final ClassLoader systemCL = ClassLoader.getSystemClassLoader();
        trace("Classloader for the main class is: " + myLoader, new Object[0]);
        trace("Parent Classloader is: " + pLoader, new Object[0]);
        trace("GrandParent Classloader is: " + gpLoader, new Object[0]);
        trace("ContextClassloader for currentThread is: " + threadCL, new Object[0]);
        trace("SystemCL is: " + systemCL, new Object[0]);
    }

    public static void debugResolve(final String desc, final ClassLoader cl, final String resourcePath) {
        trace("------------", new Object[0]);
        final URL rurl = cl.getResource(resourcePath);
        trace("Classloader[" + desc + ", " + cl + "].getResource(" + resourcePath + ") = " + rurl, new Object[0]);
        final URL surl = ClassLoader.getSystemResource(resourcePath);
        trace("Classloader[" + desc + ", " + cl + "].getSystemResource(" + resourcePath + ") = " + surl, new Object[0]);
        trace("------------", new Object[0]);
    }

    protected static String bundleCtxName(final BundleContext bc) {
        if (bc == null) {
            return "NULL";
        }
        return "" + bc.getBundle();
    }

    public static void trace(final String string, final Object... args) {
        System.out.println("[System.out] Trace: " + string);
    }

    public static void warning(final String string, final Object... args) {
        System.err.println("[System.err] Warning: " + string);
    }

    public static String getPhaseName(final Object phase) {
        final Class enumClass = BootPhaseConst.class;
        final String s = getEnumValueName(phase, enumClass);
        if (s != null) {
            return s;
        }
        return "UNKNOWN_" + phase;
    }

    public static String getEnumValueName(final Object phase, Class searchClass) {
        Class phaseClass = null;
        boolean isNull = true;
        int phaseHC = Integer.MIN_VALUE;
        if (phase != null) {
            isNull = false;
            phaseClass = phase.getClass();
            phaseHC = phase.hashCode();
        }
        for (final Field f : searchClass.getDeclaredFields()) {
            final int mods = f.getModifiers();
            if (Modifier.isStatic(mods)) {
                try {
                    if (!f.isAccessible()) {
                        f.setAccessible(true);
                    }
                    final Object fv = f.get(null);
                    if (fv == null) {
                        if (isNull) {
                            return f.getName();
                        }
                    }
                    else if (!isNull) {
                        if (phaseHC == fv.hashCode()) {
                            if (phase.equals(fv)) {
                                return f.getName();
                            }
                        }
                    }
                }
                catch (IllegalArgumentException e) {
                    e.printStackTrace();
                }
                catch (IllegalAccessException e2) {
                    e2.printStackTrace();
                }
            }
        }
        for (final Class cc : searchClass.getInterfaces()) {
            final String r = getEnumValueName(phase, cc);
            if (r != null) {
                return r;
            }
        }
        searchClass = searchClass.getSuperclass();
        if (searchClass != null) {
            return getEnumValueName(phase, searchClass);
        }
        return null;
    }

    public void addMacroService(final String key, final Runnable value) {
        this.addMacroService(90, key, value);
    }

    public void addMacroService(final String key, final boolean enabled, final Runnable value) {
        if (!MacroBundleActivatorBase.macroStartupSettings.isDisabled(key)) {
            MacroBundleActivatorBase.macroStartupSettings.setServiceEnabled(key, enabled);
        }
        this.addMacroService(90, key, value);
    }

    public void addMacroPreService(final String key, final Runnable value) {
        this.addMacroService(71, key, value);
    }

    public void addMacroService(final int bootPhase, String key, final Runnable value) {
        key = toKeyCase(key);
        synchronized (MacroBundleActivatorBase.macroStartupSettings) {
            MacroBundleActivatorBase.macroStartupSettings.addMacroService(bootPhase, key, value);
        }
    }

    public static TodoItem asTodoItem(String key, final Runnable value) {
        if (value instanceof TodoItem) {
            return (TodoItem)value;
        }
        key = toKeyCase(key);
        return new TodoItem(key, value);
    }

    public void addMacroServiceLocal(final int bootPhase, String key, final Runnable value) {
        key = toKeyCase(key);
        String pn = this.getClass().getPackage().getName();
        pn = pn.substring(pn.indexOf(46) + 1);
        pn = toKeyCase(pn + key);
        this.addMacroService(bootPhase, key, value);
    }

    public static String toKeyCase(String key) {
        final String name = key;
        key = key.toLowerCase();
        boolean remove = true;
        while (remove) {
            remove = false;
            for (final String s : new String[] { "start", "launch", "osgi.", "core.", "lib.", ".", "com.", "org.", "hrkind.", "appdapter.", "friendularity.", "cogchar.", "ext.", "cogchar", "bundle.", "-", "is", "use", "init", "connect", "call", "connect" }) {
                if (key.startsWith(s) && key.length() + 2 > s.length()) {
                    key = key.substring(s.length());
                    remove = true;
                }
            }
        }
        while (remove) {
            remove = false;
            for (final String s : new String[] { "application", "app", "lifecycles", "lifecycle", "service", "services", "launcher" }) {
                if (key.endsWith(s) && key.length() + 2 > s.length()) {
                    key = key.substring(0, key.length() - s.length());
                    remove = true;
                }
            }
        }
        key = key.replace("behaviour", "behavior");
        key = key.replace("behaviormaster", "bm");
        key = key.replace("behavior", "bm");
        key = key.replace("bmdemo", "bmd");
        key = key.replace("bmd", "bm");
        key = key.replace("configuration", "config");
        key = key.replace("config", "conf");
        key = key.replace("activator", "");
        key = key.replace(".", "_");
        key = key.replace("__", "_");
        key = key.replace("framework", "fw");
        key = key.replace("frame", "panel");
        key = key.replace("spanel", "panel");
        key = key.replace("panel", "gui");
        final String oldName = MacroBundleActivatorBase.settingsName.get(key);
        if (oldName == null || oldName.length() < name.length() || (oldName.length() == name.length() && !name.toLowerCase().equals(name))) {
            MacroBundleActivatorBase.settingsName.put(key, name);
        }
        return key;
    }

    public void frameworkEvent(final FrameworkEvent fe) {
        final int eventType = fe.getType();
        if (eventType == 1) {
            this.getLogger().info("********  OSGi Framework has STARTED, calling dispatchFrameworkStartedEvent()");
            this.dispatchFrameworkStartedEvent0(fe.getBundle(), fe.getThrowable());
        }
        else {
            this.getLogger().info("************************ Got frameworkEvent with eventType=" + eventType + ", bundle=" + getBundleName(fe.getBundle()));
        }
    }

    public MacroBundleActivatorBase() {
        this.bundleBootPhase = 10;
        this.startedEventScheduled = false;
        this.hasDispatchedFrameworkStartedEvent = false;
        this.dispatchEventLock = new Object();
        this.legacyStartWasOverriden_Check = false;
        synchronized (MacroBundleActivatorBase.macroStartupSettings) {
            MacroBundleActivatorBase.macroStartupSettings.offerFirst((BundleActivator)this);
            if (MacroBundleActivatorBase.classLoaderUtils != null) {
                MacroBundleActivatorBase.classLoaderUtils.registerClassLoader((BundleActivator)this, null);
            }
        }
    }

    public void start(final BundleContext bundleCtx) throws Exception {
        this.m_context = bundleCtx;
        synchronized (MacroBundleActivatorBase.startedBundles) {
            if (MacroBundleActivatorBase.startedBundles.contains(this)) {
                return;
            }
            this.addStartedBundle((BundleActivator)this);
        }
        synchronized (MacroBundleActivatorBase.macroStartupSettings) {
            MacroBundleActivatorBase.macroStartupSettings.offerFirst((BundleActivator)this);
            if (MacroBundleActivatorBase.classLoaderUtils != null) {
                MacroBundleActivatorBase.classLoaderUtils.registerClassLoader((BundleActivator)this, bundleCtx);
            }
        }
        if (!this.isFakeOSGI()) {
            bundleCtx.removeFrameworkListener((FrameworkListener)this);
            bundleCtx.addFrameworkListener((FrameworkListener)this);
        }
        this.bundleBootPhase = 10;
    }

    public boolean isFakeOSGI() {
        return this.m_context == null;
    }

    private void addStartedBundle(final BundleActivator bundleActivatorBase) {
        synchronized (MacroBundleActivatorBase.startedBundles) {
            if (MacroBundleActivatorBase.startedBundles.contains(bundleActivatorBase)) {
                return;
            }
            MacroBundleActivatorBase.startedBundles.add(bundleActivatorBase);
        }
        final String key = bundleActivatorBase.getClass().getName();
        this.addMacroService(40, key + "_registerservices", new Runnable() {
            @Override
            public void run() {
                MacroBundleActivatorBase.this.bundleBootPhase = 40;
                try {
                    MacroBundleActivatorBase.this.registerServices(MacroBundleActivatorBase.this.m_context);
                }
                catch (Exception e) {
                    MacroBundleActivatorBase.this.getLogger().error("registerServices: " + e, (Throwable)e);
                    e.printStackTrace();
                }
                MacroBundleActivatorBase.this.bundleBootPhase = 50;
            }
        });
        this.addMacroService(60, key + "_frameworkstarted", new Runnable() {
            @Override
            public void run() {
                MacroBundleActivatorBase.this.bundleBootPhase = 60;
                try {
                    Bundle b = null;
                    if (!MacroBundleActivatorBase.this.isFakeOSGI()) {
                        b = MacroBundleActivatorBase.this.m_context.getBundle();
                    }
                    MacroBundleActivatorBase.this.dispatchFrameworkStartedEvent0(b, null);
                }
                catch (Exception e) {
                    MacroBundleActivatorBase.this.getLogger().error("registerServices: " + e, (Throwable)e);
                    e.printStackTrace();
                }
                MacroBundleActivatorBase.this.bundleBootPhase = 70;
            }
        });
        this.addMacroService(80, key + "_launch", new Runnable() {
            @Override
            public void run() {
                MacroBundleActivatorBase.this.bundleBootPhase = 80;
                try {
                    if (MacroBundleActivatorBase.this.isLauncherBundle()) {
                        MacroBundleActivatorBase.this.launchApplication(MacroBundleActivatorBase.this.m_context);
                    }
                }
                catch (Exception e) {
                    MacroBundleActivatorBase.this.getLogger().error("LAUNCHING: " + e, (Throwable)e);
                    e.printStackTrace();
                }
                MacroBundleActivatorBase.this.bundleBootPhase = 90;
            }
        });
    }

    public void stop(final BundleContext bundleCtx) throws Exception {
        synchronized (MacroBundleActivatorBase.macroStartupSettings) {
            if (MacroBundleActivatorBase.classLoaderUtils != null) {
                MacroBundleActivatorBase.classLoaderUtils.unregisterClassLoader((BundleActivator)this, bundleCtx);
            }
        }
        this.getLogger().info(this.describe("stop<BundleActivatorBase>", bundleCtx));
    }

    protected static String getBundleName(final BundleActivator key) {
        return key.getClass().getName();
    }

    public static String getBundleName(final Bundle b) {
        if (b == null) {
            return "NO_BUNDLE";
        }
        String sym = b.getSymbolicName();
        if (sym != null && sym.length() > 0) {
            return sym;
        }
        sym = b.getLocation();
        if (sym != null && sym.length() > 0) {
            return sym;
        }
        return b.toString();
    }

    protected void registerConfig(final BundleContext bundleCtx) throws Exception {
        this.legacyStartWasOverriden_Check = false;
    }

    protected void registerServices(final BundleContext context0) {
    }

    protected void handleFrameworkStartedEvent(final BundleContext bundleCtx) throws Exception {
    }

    protected void launchApplication(final BundleContext bundleCtx) throws Exception {
        if (this.isLauncherBundle()) {
            this.getLogger().warn("this bundle was missing LAUNCHING");
        }
    }

    protected final void scheduleFrameworkStartEventHandler(final BundleContext bundleCtx) {
        synchronized (this.dispatchEventLock) {
            if (this.startedEventScheduled) {
                return;
            }
            this.startedEventScheduled = true;
        }
        if (MacroBundleActivatorBase.MACRO_LAUNCHER) {
            MacroBundleActivatorBase.macroStartupSettings.scheduleFrameworkStartEventHandler(this);
            return;
        }
        if (bundleCtx != null) {
            bundleCtx.removeFrameworkListener((FrameworkListener)this);
            bundleCtx.addFrameworkListener((FrameworkListener)this);
        }
    }

    final void dispatchFrameworkStartedEvent0(final Bundle eventBundle, final Throwable eventThrowable) {
        final String thrownMsg = (eventThrowable == null) ? "OK" : eventThrowable.getClass().getName();
        final String bundleName = getBundleName(eventBundle);
        this.getLogger().info("dispatchFrameworkStartedEvent<BundleActivatorBase> ( bundle={}, msg={}", (Object)bundleName, (Object)thrownMsg);
        if (eventThrowable == null) {
            BundleContext bc = null;
            if (eventBundle != null) {
                bc = eventBundle.getBundleContext();
            }
            if (bc == null) {
                this.getLogger().info("Cannot find bundle context for event bundle, so there will be no callback to app startup: {} ", (Object)bundleName);
            }
            try {
                if (MacroBundleActivatorBase.MACRO_LAUNCHER) {
                    if (this.isLauncherBundle()) {
                        MacroBundleActivatorBase.MACRO_LAUNCHER = false;
                        this.reallyLaunch((BundleActivator)this);
                    }
                }
                else {
                    synchronized (this.dispatchEventLock) {
                        if (this.hasDispatchedFrameworkStartedEvent) {
                            return;
                        }
                        this.hasDispatchedFrameworkStartedEvent = true;
                    }
                    this.handleFrameworkStartedEvent(bc);
                }
            }
            catch (Exception e) {
                this.getLogger().error("handleFrameworkStartedEvent " + e, (Throwable)e);
            }
        }
        else {
            this.getLogger().warn("No callback to application startup, due to throwable ", eventThrowable);
        }
    }

    private void reallyLaunch(final BundleActivator bundleActivatorBase) {
        MacroBundleActivatorBase.macroStartupSettings.launchPhases();
    }

    protected String describe(final String action, final BundleContext bundleCtx) {
        Bundle b = null;
        if (bundleCtx != null) {
            b = bundleCtx.getBundle();
        }
        final String msg = this.getClass().getCanonicalName() + "." + action + "(ctx=[" + bundleCtx + "], bundle=[" + getBundleName(b) + "])";
        return msg;
    }

    protected Logger getLogger() {
        if (this.myLogger == null) {
            this.myLogger = LoggerFactory.getLogger((Class)this.getClass());
        }
        return this.myLogger;
    }

    protected void forceLog4jConfig() {
        if (this.isLauncherBundle()) {
            this.forceLog4jConfig0();
        }
    }

    public void logInfo(final String msg) {
        this.getLogger().info(msg);
    }

    public boolean isLauncherBundle() {
        synchronized (MacroBundleActivatorBase.macroStartupSettings) {
            return MacroBundleActivatorBase.macroStartupSettings.firstBundleActivatorBase == this;
        }
    }

    protected void forceLog4jConfig0() {
        final ClassLoader threadCL = Thread.currentThread().getContextClassLoader();
        final ClassLoader localCL = this.getClass().getClassLoader();
        System.out.println("thread-context-CL=" + threadCL);
        System.out.println("local-CL=" + localCL);
        final String resPath = "log4j.properties";
        final URL threadURL = threadCL.getResource(resPath);
        final URL localURL = localCL.getResource(resPath);
        System.out.println("[System.out] forceLog4jConfig() threadCL resolved " + resPath + " to threadURL " + threadURL);
        System.out.println("[System.out] forceLog4jConfig() localCL resolved  " + resPath + " to  localURL " + localURL);
        System.out.println("[System.out] " + this.getClass().getCanonicalName() + " is forcing Log4J to read config from localURL: " + localURL);
        try {
            forceLog4jConfig(localURL);
        }
        catch (Throwable t) {
            t.printStackTrace();
        }
        try {
            final Logger logger = this.getLogger();
            try {
                logger.warn("{forceLog4JConfig} - This message was printed at WARN level to SLF4J, after forcing config for Log4J to localURL: " + localURL);
            }
            catch (Throwable t2) {
                t2.printStackTrace();
            }
        }
        catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public static void forceLog4jConfig(final URL propertiesURL) {
        System.out.println("[System.out] " + MacroBundleActivatorBase.class.getName() + " is forcing Log4J to read config from propertiesURL: " + propertiesURL);
        PropertyConfigurator.configure(propertiesURL);
    }

    public void ensureExtClassesAreFindable() {
    }

    static {
        MacroBundleActivatorBase.MACRO_LAUNCHER = false;
        MacroBundleActivatorBase.EQBAR = "========================================================================================";
        MacroBundleActivatorBase.settingsName = new HashMap<String, String>();
        macroStartupSettings = new MacroStartupSettings();
        MacroBundleActivatorBase.startedBundles = new ArrayList<BundleActivator>();
    }

    public static class ListenerMap<K, V> extends HashMap<K, V> implements Map<K, V>, ListenableMap<K, V>
    {
        private PropertyChangeSupport propertySupport;

        public ListenerMap() {
            this.propertySupport = new PropertyChangeSupport(this);
        }

        @Override
        public V put(final K k, final V v) {
            final V old = super.put(k, v);
            this.propertySupport.firePropertyChange("put", this.newEntry(k, old), this.newEntry(k, v));
            return old;
        }

        private Object newEntry(final K k, final V v) {
            return new LEntry(k, v);
        }

        @Override
        public V remove(final Object k) {
            final V old = super.remove(k);
            this.propertySupport.firePropertyChange("put", old, null);
            return old;
        }

        @Override
        public V removeNoFire(final Object k) {
            final V old = super.remove(k);
            return old;
        }

        @Override
        public V putNoFire(final K k, final V v) {
            final V old = super.put(k, v);
            return old;
        }

        @Override
        public void addPropertyChangeListener(final PropertyChangeListener listener) {
            this.propertySupport.addPropertyChangeListener(listener);
        }

        @Override
        public void removePropertyChangeListener(final PropertyChangeListener listener) {
            this.propertySupport.removePropertyChangeListener(listener);
        }

        public class LEntry
        {
            private K key;
            private V value;

            public LEntry(final K k, final V v) {
                this.key = k;
                this.value = v;
            }

            public K getKey() {
                return this.key;
            }

            public Object getValue() {
                return this.value;
            }
        }
    }

    public enum TodoItemState
    {
        UNSTARTED,
        RUNNING,
        PAUSED,
        COMPLETED,
        EXCEPTION;
    }

    public static class TodoItem implements Runnable
    {
        TodoItemState state;
        Throwable lastException;
        private Runnable work;
        private Object doneBy;
        static Object stateLock;

        public TodoItem(final String name, final Runnable runnable) {
            this.state = TodoItemState.UNSTARTED;
            this.lastException = null;
            this.work = runnable;
            this.doneBy = name;
        }

        @Override
        public String toString() {
            return "TodoItem:  " + this.state + " " + this.doneBy + " " + this.work;
        }

        @Override
        public void run() {
            synchronized (TodoItem.stateLock) {
                if (this.state != TodoItemState.UNSTARTED) {
                    return;
                }
                this.state = TodoItemState.RUNNING;
            }
            try {
                this.work.run();
                synchronized (TodoItem.stateLock) {
                    this.state = TodoItemState.COMPLETED;
                }
            }
            catch (Throwable e) {
                synchronized (TodoItem.stateLock) {
                    this.state = TodoItemState.EXCEPTION;
                }
                (this.lastException = e).printStackTrace();
                System.err.println("runProtected " + this + " caused " + e);
            }
        }

        @Override
        public boolean equals(final Object obj) {
            if (obj instanceof TodoItem) {
                return this.getName().compareTo(((TodoItem)obj).getName()) == 0;
            }
            return this.work == obj || super.equals(obj);
        }

        public String getName() {
            return "" + this.doneBy;
        }

        static {
            TodoItem.stateLock = new Object();
        }
    }

    public static class MacroStartupSettings implements BootPhaseConst
    {
        public ListenerMap actionCallbackMap;
        public Map<String, Integer> defaultStartLevel;
        public BundleActivator firstBundleActivatorBase;
        public Map<String, Object> settingsMap;
        public HashSet<String> servicesBegun;
        public HashSet<String> servicesMissing;
        public HashSet<String> servicesDisabled;
        public HashSet<String> servicesKnown;
        public final Map<Integer, List<TodoItem>> servicesTodo;
        public static Map<Integer, List<TodoItem>> phaseTodosMap;

        public boolean flagTrue(final String key) {
            return this.hasSetting(key) && this.sameValue(this.getSetting(key), Boolean.TRUE);
        }

        public void runNow(final String key, final Runnable value) {
            this.runTodoItem(MacroBundleActivatorBase.asTodoItem(key, value));
        }

        public void runNow(final String key) {
            this.runTodoItem(MacroBundleActivatorBase.asTodoItem(key, this.getRunnable(key)));
        }

        public Runnable getRunnable(String key) {
            key = MacroBundleActivatorBase.toKeyCase(key);
            synchronized (this.actionCallbackMap) {
                return (Runnable)this.actionCallbackMap.get(key);
            }
        }

        private MacroStartupSettings() {
            this.actionCallbackMap = new ListenerMap();
            this.defaultStartLevel = new HashMap<String, Integer>();
            this.firstBundleActivatorBase = null;
            this.settingsMap = new HashMap<String, Object>();
            this.servicesBegun = new HashSet<String>();
            this.servicesMissing = new HashSet<String>();
            this.servicesDisabled = new HashSet<String>();
            this.servicesKnown = new HashSet<String>();
            this.servicesTodo = MacroStartupSettings.phaseTodosMap;
        }

        private void addServiceName(String key) {
            key = MacroBundleActivatorBase.toKeyCase(key);
            if (this.servicesKnown.contains(key)) {
                return;
            }
            this.servicesKnown.add(key);
        }

        public void putSetting(String key, final Object value) {
            key = MacroBundleActivatorBase.toKeyCase(key);
            synchronized (this.settingsMap) {
                final Object old = this.settingsMap.put(key, value);
                if (value instanceof Boolean) {
                    this.setServiceEnabled(key, (Boolean)value);
                }
                if (!this.sameValue(old, value)) {
                    this.handleEvent(key);
                }
            }
        }

        public void setServiceEnabled(String key, final boolean b) {
            this.addServiceName(key);
            key = MacroBundleActivatorBase.toKeyCase(key);
            if (b) {
                if (this.servicesDisabled.remove(key)) {
                    this.handleEvent(key);
                }
            }
            else if (this.servicesDisabled.add(key)) {
                this.handleEvent(key);
            }
        }

        public String getProperty(final Bundle bundle, final String defult, final String... tryFrom) {
            boolean blankString = false;
            BundleContext context = null;
            if (bundle != null) {
                context = bundle.getBundleContext();
            }
            for (final String s : tryFrom) {
                String args = null;
                if (bundle != null) {
                    args = context.getProperty(s);
                }
                if (args != null) {
                    if (args.length() != 0) {
                        return args;
                    }
                    blankString = true;
                }
                else {
                    final Object oargs = this.getSetting(s);
                    if (oargs != null) {
                        return "" + oargs;
                    }
                }
            }
            if (blankString) {
                return "";
            }
            return defult;
        }

        public <T> T getSetting(final String key) {
            Object string = System.getProperty(key, System.getenv(key));
            if (string != null) {
                return (T)string;
            }
            final String key2 = MacroBundleActivatorBase.toKeyCase(key);
            string = System.getProperty(key2, System.getenv(key2));
            if (string != null) {
                return (T)string;
            }
            return (T)this.settingsMap.get(key2);
        }

        public boolean isEnabled(String key) {
            key = MacroBundleActivatorBase.toKeyCase(key);
            if (this.servicesDisabled.contains(key)) {
                return false;
            }
            Object settingObject = this.getSetting(key);
            if (settingObject != null) {
                if (this.sameValue(settingObject, Boolean.TRUE)) {
                    return true;
                }
            }
            else {
                settingObject = this.getSetting("*");
                if (settingObject != null) {
                    if (this.sameValue(settingObject, Boolean.FALSE)) {
                        return false;
                    }
                    if (this.sameValue(settingObject, Boolean.TRUE)) {
                        return true;
                    }
                }
            }
            return true;
        }

        public boolean isBegun(String key) {
            key = MacroBundleActivatorBase.toKeyCase(key);
            return this.servicesBegun.contains(key);
        }

        public boolean isService(String key) {
            key = MacroBundleActivatorBase.toKeyCase(key);
            return this.servicesKnown.contains(key);
        }

        public boolean isRunnable(String key) {
            key = MacroBundleActivatorBase.toKeyCase(key);
            return this.actionCallbackMap.containsKey(key);
        }

        public boolean isDisabled(String key) {
            key = MacroBundleActivatorBase.toKeyCase(key);
            if (this.servicesDisabled.contains(key)) {
                return true;
            }
            Object settingObject = this.getSetting(key);
            if (settingObject != null) {
                if (this.sameValue(settingObject, Boolean.FALSE)) {
                    return true;
                }
            }
            else {
                settingObject = this.getSetting("*");
                if (settingObject != null && this.sameValue(settingObject, Boolean.FALSE)) {
                    return true;
                }
            }
            return false;
        }

        private boolean sameValue(final Object v1, final Object v2) {
            return v1 == v2 || ("" + v1).equalsIgnoreCase("" + v2);
        }

        public boolean hasSetting(final String key) {
            synchronized (this.settingsMap) {
                return this.settingsMap.containsKey(MacroBundleActivatorBase.toKeyCase(key));
            }
        }

        public void offerFirst(final BundleActivator bundleActivatorBase) {
            if (this.firstBundleActivatorBase == null) {
                this.firstBundleActivatorBase = bundleActivatorBase;
            }
        }

        public void makeStartupBundle(final BundleActivator activator) {
            this.firstBundleActivatorBase = activator;
        }

        public void runTodoList(final List<TodoItem> registerServicesPhaseTodo) {
            if (registerServicesPhaseTodo == null) {
                return;
            }
            TodoItem item = null;
            while (!registerServicesPhaseTodo.isEmpty()) {
                synchronized (registerServicesPhaseTodo) {
                    item = registerServicesPhaseTodo.remove(0);
                }
                this.runTodoItem(item);
            }
        }

        private void runTodoItem(final TodoItem item) {
            String key = item.getName();
            key = MacroBundleActivatorBase.toKeyCase(key);
            synchronized (this.servicesBegun) {
                if (this.isBegun(key)) {
                    return;
                }
                if (this.isDisabled(key)) {
                    System.err.println("-------------Skipping (dontRun) " + key);
                }
                if (!this.isEnabled(key)) {
                    System.err.println("---------Skipping (!doRun) " + key);
                    return;
                }
                this.servicesBegun.add(key);
            }
            System.err.println("+++================= Running " + key);
            this.handleEvent(key);
            item.run();
        }

        public static List<TodoItem> getPhaseTodo(final int phaseAt) {
            return getPhaseTodo(phaseAt, true);
        }

        public static List<TodoItem> getPhaseTodo(final int phaseAt, final boolean createIfMissing) {
            synchronized (MacroStartupSettings.phaseTodosMap) {
                if (createIfMissing && !MacroStartupSettings.phaseTodosMap.containsKey(phaseAt)) {
                    MacroStartupSettings.phaseTodosMap.put(phaseAt, new ArrayList<TodoItem>());
                }
                return MacroStartupSettings.phaseTodosMap.get(phaseAt);
            }
        }

        public void raiseToPhase(final int top) {
            boolean runAgain = true;
            while (runAgain) {
                runAgain = false;
                for (int phaseAt = 0; phaseAt < top; ++phaseAt) {
                    final List<TodoItem> todos = getPhaseTodo(phaseAt, false);
                    if (todos != null && todos.size() != 0) {
                        runAgain = true;
                        System.err.println("PHASE=" + MacroBundleActivatorBase.getPhaseName(phaseAt) + " SIZE=" + todos.size());
                        MacroBundleActivatorBase.macroStartupSettings.runTodoList(todos);
                        break;
                    }
                }
            }
        }

        public void launchPhases() {
            this.raiseToPhase(100);
        }

        public void addMacroService(final int bootPhase, String key, final Runnable value) {
            key = MacroBundleActivatorBase.toKeyCase(key);
            this.addServiceName(key);
            final TodoItem todoItem = MacroBundleActivatorBase.asTodoItem(key, value);
            synchronized (this.actionCallbackMap) {
                this.actionCallbackMap.put(key, todoItem);
                this.handleEvent(key);
            }
            synchronized (MacroBundleActivatorBase.macroStartupSettings) {
                getPhaseTodo(bootPhase).add(todoItem);
                this.defaultStartLevel.put(key, bootPhase);
            }
        }

        public void scheduleFrameworkStartEventHandler(final MacroBundleActivatorBase bundleActivatorBase) {
            final String key = bundleActivatorBase.getClass().getName();
            this.addMacroService(60, key + "_frameworkstarted", new Runnable() {
                @Override
                public void run() {
                    try {
                        bundleActivatorBase.dispatchFrameworkStartedEvent0(bundleActivatorBase.m_context.getBundle(), null);
                    }
                    catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }

        public void possiblyStart(final MacroBundleActivatorBase bundleActivatorBase) {
            bundleActivatorBase.m_context.addFrameworkListener((FrameworkListener)new FrameworkListener() {
                public void frameworkEvent(final FrameworkEvent fe) {
                    final int eventType = fe.getType();
                    if (eventType == 1) {
                        MacroStartupSettings.this.launchPhases();
                    }
                }
            });
        }

        public String getFieldValuesString() {
            final ByteArrayOutputStream baos = new ByteArrayOutputStream();
            final PrintStream ps = new PrintStream(baos);
            this.printMacroStateInfo(ps, null, true);
            final String content = baos.toString();
            return content;
        }

        public void printMacroStateInfo(final PrintStream ps, final BundleContext bc, final boolean onlyNoteable) {
            if (bc != null) {
                final Bundle[] arr$;
                final Bundle[] bundles = arr$ = bc.getBundles();
                for (final Bundle b : arr$) {
                    final int state = b.getState();
                    if (!onlyNoteable || state != 32) {
                        ps.println(b.getBundleId() + ": " + toBundleStateString(state) + " " + MacroBundleActivatorBase.getBundleName(b));
                    }
                }
            }
            final Set<String> names = new HashSet<String>(this.servicesBegun);
            names.addAll(this.servicesDisabled);
            names.addAll(this.servicesMissing);
            synchronized (this.settingsMap) {
                names.addAll(this.settingsMap.keySet());
            }
            for (final String n : names) {
                if (this.servicesBegun.contains(n) && onlyNoteable) {
                    continue;
                }
                final String valuestatus = this.getValueStatus(n);
                ps.println(n + "=" + valuestatus);
            }
        }

        public String getServiceName(String n) {
            n = MacroBundleActivatorBase.toKeyCase(n);
            final String name = MacroBundleActivatorBase.settingsName.get(n);
            if (name != null) {
                return name;
            }
            return n;
        }

        public String getValueStatus(String n) {
            n = MacroBundleActivatorBase.toKeyCase(n);
            String status = "";
            String value = this.getProperty(null, null, n);
            if (this.servicesBegun.contains(n)) {
                status += " %BEGUN";
            }
            if (this.servicesDisabled.contains(n)) {
                status += " %DISABLED";
            }
            if (this.servicesMissing.contains(n)) {
                status += " %MISSING";
            }
            if (status == "") {
                status = " %WAITING";
            }
            if (value == null) {
                value = "";
            }
            final String valuestatus = value + status;
            return valuestatus;
        }

        public static String toBundleStateString(final int state) {
            switch (state) {
                case 1: {
                    return "UNINSTALLED";
                }
                case 2: {
                    return "INSTALLED";
                }
                case 4: {
                    return "RESOLVED";
                }
                case 8: {
                    return "STARTING";
                }
                case 16: {
                    return "STOPPING";
                }
                case 32: {
                    return "ACTIVE";
                }
                default: {
                    return "UNKNOWN";
                }
            }
        }

        public void removeBegun() {
            synchronized (this.servicesBegun) {
                synchronized (this.actionCallbackMap) {
                    for (final Object n : this.servicesBegun.toArray()) {
                        this.actionCallbackMap.remove(n);
                    }
                }
            }
        }

        public void ensureReady(String key) {
            key = MacroBundleActivatorBase.toKeyCase(key);
            this.addServiceName(key);
            if (!this.isBegun(key)) {
                this.runNow(key);
            }
        }

        public void handleEvent(final String event) {
        }

        static {
            MacroStartupSettings.phaseTodosMap = new HashMap<Integer, List<TodoItem>>();
        }
    }

    public interface ListenableMap<K, V>
    {
        public static final String PROP_PUT = "put";

        V putNoFire(final K p0, final V p1);

        V removeNoFire(final K p0);

        void addPropertyChangeListener(final PropertyChangeListener p0);

        void removePropertyChangeListener(final PropertyChangeListener p0);

        Set<Map.Entry<K, V>> entrySet();

        V get(final K p0);
    }

    public interface BootPhaseConst
    {
        public static final int UNKNOWN = 0;
        public static final int UNSTARTED = 10;
        public static final int STARTING = 20;
        public static final int COMPLETED_START = 30;
        public static final int REGISTERINGSERVICES = 40;
        public static final int COMPLETED_REGISTERSERVICES = 50;
        public static final int FRAMEWORKSTARTING = 60;
        public static final int COMPLETED_FRAMEWORKSTARTED = 70;
        public static final int PRE_CONFIG = 71;
        public static final int DURRING_CONFIG = 75;
        public static final int POST_CONFIG = 79;
        public static final int LAUNCHING = 80;
        public static final int LAUNCHING_COMPLETE = 90;
        public static final int RUNNING = 90;
        public static final int RUNNING_COMPLETED_ERROR = 99;
        public static final int RUNNING_COMPLETE = 100;
        public static final int EXITED_COMPLETE = 101;
        public static final int ON_DEMAND = 200;
    }

    public interface BundleClassWatcher
    {
        void registerClassLoader(final BundleActivator p0, final BundleContext p1);

        void unregisterClassLoader(final BundleActivator p0, final BundleContext p1);
    }
}

/*

	Total time: 10287 ms

*/