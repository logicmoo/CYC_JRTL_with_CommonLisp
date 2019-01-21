package org.appdapter.core.log;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.Console;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.logging.Logger;

import org.appdapter.core.convert.ReflectUtils;
import org.appdapter.core.debug.NoLeakThreadLocal;
import org.appdapter.core.debug.UIAnnotations.UIHidden;
import org.appdapter.core.debug.UIAnnotations.UISalient;
import org.slf4j.LoggerFactory;

@UIHidden
public abstract class Debuggable extends BasicDebugger {

	public static int PRINT_DEPTH = 3;
	public static LinkedList<Object> allObjectsForDebug = new LinkedList<Object>();
	public static boolean saveAllObjectsForDebug = false;
	public static final PrintStream ORIGINAL_ERR_STREAM = System.err;
	public static final PrintStream ORIGINAL_OUT_STREAM = System.out;
	public static final InputStream ORIGINAL_IN_STREAM = System.in;
	public static final Console ORIGINAL_CONSOLE = System.console();

	public static Logger LOGGER = null;
	static {
		try {
			LOGGER = Logger.getLogger(Debuggable.class.getSimpleName());
		} catch (Throwable e1) {
			e1.printStackTrace();
			// TODO Auto-generated catch block
		//	MsgBox.error(e1);

		}
	}

	@Override
	public String toString() {
		return toInfoStringF(this, PRINT_DEPTH);
	}

	public static String toInfoStringArgV(Object... params) {
		return toInfoStringA(params, ",", PRINT_DEPTH);
	}

	public static String toInfoStringCompound(String str, Object... params) {
		return str + "(" + toInfoStringA(params, ",", PRINT_DEPTH) + ")";
	}

	public static String toInfoStringCompound(Object str, Object... params) {
		return toInfoStringV(str, PRINT_DEPTH) + "(" + toInfoStringA(params, ",", PRINT_DEPTH) + ")";
	}

	public static <T extends Object> T NoSuchClassImpl(Object... objects) {
		String dstr = "NoSuchClassImpl" + Debuggable.toInfoStringA(objects, ":", PRINT_DEPTH);

		RuntimeException rte = warn(dstr);
		// if (true) return null;
		if (isDebugging()) {
			throw rte;
		}
		return null;
	}

	public static boolean doBreak(Object... s) {
		PrintStream v = ORIGINAL_OUT_STREAM;
		new Exception("" + s[0]).fillInStackTrace().printStackTrace(v);
		for (int i = 0; i < s.length; i++) {
			v.printf("\n" + s[i]);
		}
		if (!Debuggable.useSystemConsoleBreaks)
			return false;
		ORIGINAL_CONSOLE.printf("\nPress enter to continue\n");
		ORIGINAL_CONSOLE.readLine();
		return true;
	}

	public static RuntimeException warn(Object... objects) {
		String dstr = Debuggable.toInfoStringA(objects, " : ", PRINT_DEPTH);
		RuntimeException rte = new RuntimeException(dstr);

		if (isNotShowingExceptions() || !isDebugging()) {
			return rte;
		}
		rte.printStackTrace();
		breakpoint();
		return rte;
	}

	public static String trace(Object... objects) {
		String dstr = Debuggable.toInfoStringA(objects, " : ", PRINT_DEPTH);
		return dstr;
	}

	public static String toInfoStringA(Object[] params, String sep, int depth) {
		if (params == null)
			return "<Null[]>";
		int paramslength = params.length;
		if (paramslength == 0) {
			return "/*0*/";
		}
		Object p0 = params[0];
		if (paramslength == 1) {
			return toInfoStringV(p0, depth);
		} else if (p0 instanceof String) {
			String fmt = (String) p0;
			if (fmt.contains("%")) {

			}
		}
		depth--;
		boolean needComma = false;
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < paramslength; i++) {
			String str = null;
			Object next = params[i];
			if (next instanceof String) {
				str = (String) next;
				if (str.startsWith("=") || str.endsWith("]")) {
					sb.append(next);
					continue;
				}
				if (str.endsWith("=")) {
					sb.append(str);
					needComma = false;
				}
			}
			if (needComma) {
				sb.append(sep);
			}
			if (str != null && str.endsWith("=")) {
				sb.append(str);
				needComma = false;
				continue;
			}
			sb.append(toInfoStringV(params[i], depth));
			needComma = true;
		}
		return sb.toString();
	}

	public static String toInfoStringQ(String str, boolean quoted) {
		if (!quoted)
			return str;
		return "\"" + str.replace("\\", "\\\\").replace("\"", "\\\"") + "\"";
	}

	public static String toInfoStringV(Object o, int depth) {
		return toInfoStringV(o, true, depth);
	}

	public static String toInfoStringO(Object o) {
		return toInfoStringV(o, true, PRINT_DEPTH);
	}

	public static String toInfoStringV(Object o, boolean quoted, int depth) {
		if (o == null)
			return "<Null>";
		if (o instanceof Number)
			return "" + o;
		if (o instanceof Enum)
			return getCanonicalSimpleName(o.getClass()) + "." + o;
		if (o instanceof byte[])
			return toInfoStringQ(new String((byte[]) o), quoted);
		if (o instanceof char[])
			return toInfoStringQ(new String((char[]) o), quoted);
		if (o instanceof CharSequence)
			return toInfoStringQ(o.toString(), quoted);
		if (o instanceof Class)
			return toInfoStringC((Class) o);
		if (o instanceof Throwable)
			return toInfoStringThrowable((Throwable) o);
		if (o instanceof Object[])
			return "[" + toInfoStringA((Object[]) o, ",", depth) + "]";
		Class oc = o.getClass();
		Method toStr = declaresToString(oc, "toDebugString");
		if (toStr == null)
			toStr = declaresToString(oc, "toString");
		if (toStr != null) {
			try {
				if(o instanceof Closeable || o instanceof PrintStream) return "" + toStr.invoke(o);
				synchronized (o) {
					return "" + toStr.invoke(o);
				}
			} catch (Throwable e) {
			}
		}
		return toInfoStringF(o, depth);

	}

	public static String getCanonicalSimpleName(Class utilClass) {
		return ReflectUtils.getCanonicalSimpleName(utilClass);
	}

	private static String toInfoStringThrowable(Throwable o) {
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		try {
			o.printStackTrace(pw);
		} catch (Throwable t) {
			t.printStackTrace();
		}
		return sw.toString();
	}

	final public static Class[] CLASSES0 = new Class[0];
	public static final boolean IsAndroid = false;

	private static Method declaresToString(Class<? extends Object> class1, String named) {
		try {
			Method method = class1.getMethod(named, CLASSES0);

			if (method.getDeclaringClass() == Object.class) {
				return null;
			}
			return method;
		} catch (SecurityException e) {
		} catch (NoSuchMethodException e) {
		}
		return null;
	}

	static NoLeakThreadLocal<HashSet<String>> DontDescend = new NoLeakThreadLocal<HashSet<String>>() {
		@Override
		protected HashSet<String> initialValue() {
			return new HashSet<String>();
		}
	};

	@UISalient
	public static boolean useDebuggableToString = true;
	@UISalient
	public static boolean useSystemConsoleBreaks = false;

	public static String toInfoStringF(Object o) {
		return toInfoStringF(o, PRINT_DEPTH);
	}

	public static String toInfoStringF(Object o, int depth) {
		return toInfoStringF(o, depth, false);
	}

	public static String toInfoStringF(Object o, boolean reverseFields) {
		return toInfoStringF(o, PRINT_DEPTH, reverseFields);
	}

	public static String toInfoStringF(Object o, int depth, boolean reverseFields) {
		if (o == null)
			return "<Null>";
		String key = objKey(o);
		Class c = o.getClass();
		HashSet<String> keys = DontDescend.get();
		if (c == Object.class || keys.contains(key) || depth <= 0)
			return "{" + key + "}";
		try {
			keys.add(key);
			String toStr = toInfoStringFC0(o, o.getClass(), depth - 1, reverseFields);
			if (toStr == null || toStr.length() == 0) {
				toStr = key;
			} else {
				toStr += "," + key;
			}
			return "{" + toStr + "}";
		} finally {
			keys.remove(key);
		}
	}

	public static String toInfoStringFC0(Object o, Class declaredClass, int depth, boolean reverseFields) {

		StringBuffer sb = new StringBuffer();

		boolean needComma = toStringFields(o, declaredClass, depth, sb);
		declaredClass = declaredClass.getSuperclass();
		if (declaredClass == null || declaredClass == Object.class)
			return sb.toString();
		String sc = toInfoStringFC0(o, declaredClass, depth, reverseFields);
		if (sc == null || sc.length() == 0)
			return sb.toString();
		if (!needComma || sb == null || sb.length() == 0)
			return sc;

		if (reverseFields) {
			return sc + "," + sb.toString();
		}
		return sb.append(sc).toString();
	}

	private static boolean toStringFields(Object o, Class declaredClass, int depth, StringBuffer sb) {
		if (declaredClass == null || declaredClass == Object.class)
			return false;
		if (declaredClass == Debuggable.class || declaredClass == BasicDebugger.class)
			return false;
		java.lang.reflect.Field[] fs = declaredClass.getDeclaredFields();
		if (fs == null)
			return false;
		int len = fs.length;
		if (len == 0)
			return false;
		for (int i = 0; i < len; i++) {
			java.lang.reflect.Field f = fs[i];
			boolean isSt = Modifier.isStatic(f.getModifiers());
			if (isSt)
				continue;
			boolean wasA = f.isAccessible();
			if (!wasA)
				f.setAccessible(true);
			try {
				Object val = f.get(o);
				if (i != 0) {
					sb.append(",");
				}
				sb.append(f.getName() + "=" + toInfoStringV(val, depth));
			} catch (Throwable e) {
			} finally {
				if (!wasA)
					f.setAccessible(false);
			}
		}
		return true;
	}

	public static String objKey(Object o) {
		return "inst=" + toInfoStringC(o.getClass()) + "@" + java.lang.System.identityHashCode(o);
	}

	private static String toInfoStringC(Class c) {
		return getCanonicalSimpleName(c);
	}

	public static boolean mustBeSameStrings(String gs1, String gs2) {
		return makeMatchable(gs1).equals(makeMatchable(gs2));
	}

	private static Object makeMatchable(String gs1) {
		String gs2 = gs1.replaceAll("\n", " ").replaceAll("  ", " ");
		return gs2.trim();
	}

	public static org.slf4j.Logger getLogger(Class<?> name) {
		return LoggerFactory.getLogger(name.getSimpleName());
	}

	public static RuntimeException UnhandledException(Throwable e) {
		e.printStackTrace();
		return warn("e=" + e.getMessage());
	}

	public static <T> T notImplemented(Object... params) {
		String msg = "notImplemented: " + toInfoStringA(params, ",", PRINT_DEPTH);
		warn(msg);
		if (isDebugging())
			throw new AbstractMethodError(msg);
		return (T) null;
	}

	public static void eclImplemented(Object... params) {
		String msg = "eclImplemented: " + toInfoStringA(params, ",", PRINT_DEPTH);
		warn(msg);
	}

	public static RuntimeException reThrowable(Throwable e) {
		if (e instanceof InvocationTargetException) {
			Throwable t = e.getCause();
			if (t != null)
				e = t;
		}
		if (e instanceof Error) {
			throw ((Error) e);
		}
		if (e instanceof RuntimeException)
			throw (RuntimeException) e;
		return reThrowable(e, RuntimeException.class, true, true);
	}

	public static <T extends Throwable> T reThrowable(Throwable e, Class<T> classOf) {
		if (classOf == null)
			throw reThrowable(e);
		return reThrowable(e, classOf, false, false);
	}

	public static <T extends Throwable> T reThrowable(Throwable e, Class<T> classOf, boolean throwFirstErrorCause,
			boolean throwFirstRTECause) {
		Throwable e1 = e;
		e.fillInStackTrace();
		Error err = null;
		RuntimeException rte = null;
		boolean needOther = true;
		while (true) {
			if (classOf.isInstance(e1))
				return (T) e1;
			if (throwFirstErrorCause && e1 instanceof Error) {
				err = (Error) e1;
				throwFirstErrorCause = throwFirstRTECause = false;
			}
			if (throwFirstRTECause && e1 instanceof RuntimeException) {
				rte = (RuntimeException) e1;
				throwFirstErrorCause = throwFirstRTECause = false;
			}
			Throwable e2 = e1.getCause();
			if (e2 == e1 || e2 == null) {
				break;
			}
			if (e1 instanceof InvocationTargetException) {
				e = e2;
			}
			e1 = e2;
		}
		if (err != null)
			throw err;
		if (rte != null)
			throw rte;
		return wrapException(e, classOf, RuntimeException.class);
	}

	public static <T extends Throwable, O extends Throwable> T wrapException(Throwable e, Class<T> classOf,
			Class<O> otherwise) throws O {
		T wrapped = wrapException(e, classOf);
		if (wrapped != null)
			return wrapped;
		O otherw = wrapException(e, otherwise);
		if (otherw != null)
			throw otherw;
		throw new RuntimeException("DEBUGGABLE^^^^^^^^^^&&&&&&&&&&&&&&&&&&&&&&&&& RETHROWWWABLE: " + e.getMessage(), e);
	}

	public static <T extends Throwable> T wrapException(Throwable cause, Class<T> newClass) {
		if (newClass == null) {
			if (false)
				throw reThrowable(cause, RuntimeException.class);
			return (T) wrapException(cause, RuntimeException.class);
		}
		Throwable newVer;
		try {
			newVer = ReflectUtils.newInstance(newClass, C_ST, cause.getMessage(), cause);
		} catch (Throwable nsm) {
			try {
				newVer = ReflectUtils.newInstance(newClass, C_T, cause);
			} catch (Throwable nsm1) {
				try {
					newVer = ReflectUtils.newInstance(newClass, C_S, cause.getMessage());
					newVer.initCause(cause);
				} catch (Throwable nsm2) {
					try {
						newVer = ReflectUtils.newInstance(newClass, C_0);
						newVer.initCause(cause);
					} catch (Throwable nsm3) {
						return null;
						// newVer = rte = new RuntimeException(e.getMessage(),
						// e);
					}
				}
			}
		}
		setCause(newVer, cause);
		return (T) newVer;
	}

	private static <T extends Throwable> void setCause(Throwable ex, Throwable cause) {
		try {
			ex.initCause(cause);
		} catch (Throwable unseen) {
		}
		try {
			StackTraceElement[] st = cause.getStackTrace();
			if (st != null)
				ex.setStackTrace(st);
			Throwable ec = ex.getCause();
			if (ec != cause) {
				try {
					ReflectUtils.setField(ex, ex.getClass(), Throwable.class, "cause", cause);
				} catch (Throwable e2) {
					e2.printStackTrace();
					// cannot set the cause?!
				}
			}
		} catch (Throwable unseen) {
		}
	}

	final static Class[] C_ST = new Class[] { String.class, Throwable.class };
	final static Class[] C_S = new Class[] { String.class };
	final static Class[] C_T = new Class[] { Throwable.class };
	final static Class[] C_0 = new Class[] {};

	public static RuntimeException printStackTrace(final Throwable ex) {
		printStackTrace(ex, ORIGINAL_ERR_STREAM, -1);
		return reThrowable(ex);
	}

	public static void printStackTrace(final Throwable ex, PrintStream ps, int maxLines) {
		Throwable e = ex;
		if (isNotShowingExceptions())
			return;
		if (isRelease())
			return;
		while (e != null) {
			printStackTraceLocal(e, ps, 100);
			ps.println("\n Caused by... ");
			Throwable c = e.getCause();
			if (c == null || c == e) {
				return;
			}
			e = c;
		}
	}

	private static int printStackTraceLocal(Throwable ex, PrintStream ps, int maxDepth) {
		int depthShown = 0;
		if (ex == null) {
			ps.println("NULL TRHOWABLE");
			return depthShown;
		}
		ps.println(ex.getClass() + ": " + ex.getMessage());
		StackTraceElement[] elems = ex.getStackTrace();
		if (elems == null) {
			ps.println("NULL TRHOWABLE ELS");
			return depthShown;
		}
		int td = elems.length - 1;
		int es = 0;
		while (maxDepth > 0) {
			maxDepth--;
			depthShown++;
			StackTraceElement el = elems[es];
			ps.println(" at " + el);
			es++;
			if (es >= td)
				break;
		}
		return depthShown;
	}

	public static String details(Throwable ex) {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		printStackTrace(ex, ps, -1);
		try {
			return baos.toString("ISO-8859-1");
		} catch (UnsupportedEncodingException e) {
			return baos.toString();
		}
	}

	public static void addForDebug(Object obj) {
		if (allObjectsForDebug == null || !saveAllObjectsForDebug || obj == null)
			return;
		synchronized (allObjectsForDebug) {
			allObjectsForDebug.add(obj);
		}
	}

	public static void expectedToIgnore(Throwable e, Class... classes) {
		for (Class c : classes) {
			if (c.isInstance(e))
				return;
		}
		printStackTrace(e);

	}

	static NoLeakThreadLocal<Boolean> QUITELY = new NoLeakThreadLocal<Boolean>(true);
	static NoLeakThreadLocal<Boolean> DEBUGGING = new NoLeakThreadLocal<Boolean>(true);
	static NoLeakThreadLocal<Boolean> INTESTS = new NoLeakThreadLocal<Boolean>(true);

	public static boolean isNotShowingExceptions() {
		if (isRelease())
			return true;
		return QUITELY.get() == Boolean.TRUE;
	}

	public static void setDoNotShowExceptions(boolean quietlyDoNotShowExceptions) {
		QUITELY.set(quietlyDoNotShowExceptions);
	}

	public static void maybeDebug(Runnable runnable) {
		if (isNotShowingExceptions())
			return;
		if (isDebugging())
			runnable.run();
	}

	public static boolean isDebugging() {
		// if (true)
		// return true;
		return DEBUGGING.get() == Boolean.TRUE;
	}

	public static void setDebugging(boolean b) {
		// if (true)
		// return true;
		DEBUGGING.set(b);
	}

	public static boolean isTesting() {
		if (isDebugging())
			return true;
		return INTESTS.get() == Boolean.TRUE;
	}

	public static void setIsTesting(boolean val) {
		INTESTS.set(val);
	}

	public static boolean isRelease() {
		if (isDebugging())
			return false;
		if (isTesting())
			return false;
		if (false // change this to true if you dare
		)
			return false;
		return true;
	}

	public static boolean breakpoint() {
		return isDebugging();
	}

	static Map<String, Object> frameVars = new HashMap<String, Object>();

	public static void putFrameVar(String name, Object value) {
		synchronized (frameVars) {
			frameVars.put(name, value);
		}
	}

	public static DebuggableFrame createFrame(String msg) {
		msg = msg + "\nframeVars = " + toInfoStringO(getStackVars());
		Throwable t = new Throwable(msg);
		t.fillInStackTrace();
		DebuggableFrame f = new DebuggableFrame(msg, t);
		return f;
	}

	@SuppressWarnings("serial")
	static public class DebuggableFrame extends Throwable {

		@Override
		public String getMessage() {
			return super.getMessage() + " vars=" + vars;
		}

		Throwable t;
		Map<String, Object> vars;

		public DebuggableFrame(String msg, Throwable t) {
			super(msg, t);
			this.t = t;
			vars = getStackVars();
		}

		@Override
		public void printStackTrace(PrintStream s) {
			synchronized (s) {
				s.println("" + t);
			}
			// t.printStackTrace(s);
		}
	}

	public static void showFrame(Throwable createFrame) {
		createFrame.printStackTrace();
	}

	public static Map getStackVars() {
		synchronized (frameVars) {
			return new HashMap(frameVars);
		}
	}

	public static void oldBug(String msg, Object... params) {
		oldBug(null, msg, params);
	}

	public static void oldBug(Writer w, String msg, Object... params) {
		if (!isTesting())
			return;
		String msgf = toInfoStringCompound(msg, params);
		String ob = "OLD BUG: " + msgf;
		Throwable t = createFrame(ob);
		if (w != null) {
			try {
				w.write(msgf + "\n");
			} catch (IOException e) {
			}
		}
		if (theFallbackLogger == null) {
			theFallbackLogger = getLoggerForClass(Debuggable.class);
		}
		if (theFallbackLogger != null) {
			theFallbackLogger.error(msgf);
		} else {
			t.printStackTrace(ORIGINAL_ERR_STREAM);
		}

	}
}
