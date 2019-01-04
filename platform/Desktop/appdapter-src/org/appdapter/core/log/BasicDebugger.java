/*
 *  Copyright 2012 by The Appdapter Project (www.appdapter.org).
 * 
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.appdapter.core.log;

import java.net.URL;

import org.appdapter.core.debug.UIAnnotations.UIHidden;
import org.appdapter.bind.log4j.Log4jFuncs;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.helpers.NOPLogger;

/**
 * @author Stu B. <www.texpedient.com>
 */
//@UIHidden
public class BasicDebugger implements Loggable {

	private Class myAppClass;

	/**
	 * We use this constructor when we don't want to extend BasicDebugger.
	 * 
	 * @param appClass
	 */
	public BasicDebugger(Class appClass) {
		myAppClass = appClass;
		Debuggable.addForDebug(this);
	}

	/**
	 * This default constructor is intended for use by classes extending BasicDebugger.
	 */
	public BasicDebugger() {
		myAppClass = this.getClass();
		Debuggable.addForDebug(this);
	}

	static Logger theFallbackLogger = null;

	private enum MsgKind {

		INFO, WARN, ERROR
	}

	protected Logger myLogger;
	private int myDebugImportanceThreshold = IMPO_NORM;

	/*
	 * Null tests are not working for diversion to System.out because: SLF4J: Failed to load class
	 * "org.slf4j.impl.StaticLoggerBinder". SLF4J: Defaulting to no-operation (NOP) logger implementation SLF4J: See
	 * http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
	 *
	 *
	 *
	
	Making this 'public' change hopefully not breaking too much but BasicDebugger's getLogger() code is used in many places .. when used by a inner class of a something overriding BasicDebugger its is not legal in the JVM to call this protected member.. so what is done is a synthetic method is secretly created in the inner class to workaround this.  Under certain source level conditions it is *still* illegal.. So by making this public.. there is no question there is legal access.. and also reduces class size (removes synthetics) and the initial worry of "wont subclasses need to be able to resolve SLF4J or have it in the class path during compile time? "  would have had the same answer where it was protected or public.  "I want to be able to extend BasicDebugger without the guilt of adding a 'logger' property to everything".. Hrrm I understand
	 */
	protected Logger getLogger() {
		if (myLogger == null) {
			myLogger = getLoggerForClass(myAppClass);
		}
		return myLogger;
	}

	public static Logger getLoggerForClass(Class c) {
		try {
			Logger result = LoggerFactory.getLogger(c);
			if (result == null) {
				if (theFallbackLogger == null)
					theFallbackLogger = LoggerFactory.getLogger(BasicDebugger.class);
				result = theFallbackLogger;
			}
			return result;
		} catch (Throwable t) {
			t.printStackTrace();
		}
		return null;
	}

	public void useLoggerForClass(Class c) {
		Logger l = getLoggerForClass(c);
		setLogger(l);
	}

	public synchronized void setLogger(Logger l) {
		myLogger = l;
	}

	protected boolean isLoggerUsable() {
		Logger l = getLogger();
		return ((l != null) && !(l instanceof NOPLogger));
	}

	/**
	 * More "urgent" debug has higher level (numerically), so high threshold (numerically) means *less* debug output.
	 */
	public void setDebugImportanceThreshold(int thresh) {
		myDebugImportanceThreshold = thresh;
	}

	public boolean checkDebugImportance(int importance) {
		return (importance >= myDebugImportanceThreshold);
	}

	/**
	 * 
	 * @param importance
	 *            must be >= current debug importance threshold.
	 * @param timeStampFlag
	 * @param oldStamp
	 * @param msgObjs
	 *            - will be converted to strings only if importance threshold passed.
	 * @return
	 */
	public Long logInfoEvent(int importance, boolean timeStampFlag, Long oldStamp, String formatSpec, Object... msgObjs) {
		Long resultStamp = null;
		if (checkDebugImportance(importance)) {
			String formattedMsg = String.format(formatSpec, msgObjs);
			String tsString = "";
			if (timeStampFlag) {
				long stamp = System.currentTimeMillis();
				long fullSec = stamp / 1000;
				long milSec = stamp - fullSec * 1000;
				tsString = String.format("[ts=%,d.%3d]", fullSec, milSec);
				if (oldStamp != null) {
					long elapsedMilSec = stamp - oldStamp;
					tsString = tsString + "[el=" + elapsedMilSec + "ms]";
				}
				resultStamp = stamp;
			}
			String formatted = "[imp=" + importance + "]" + tsString + "={" + getClass().getSimpleName() + "}" + formattedMsg;
			if (isLoggerUsable()) {
				Logger log = getLogger();
				log.info(formatted);
			} else {
				System.out.println("[sys.out," + getClass().getSimpleName() + ".lie]" + formatted);
			}
		}
		return resultStamp;
	}

	@Override public void logInfo(int importance, String msg) {
		logInfoEvent(importance, false, null, "%s", msg);
	}

	@Override public void logInfo(String msg) {
		logInfo(IMPO_LOLO, msg);
	}

	protected void logWithException(MsgKind mk, String msg, Throwable t) {
		if (isLoggerUsable()) {
			Logger l = getLogger();
			if (mk == MsgKind.ERROR) {
				l.error(msg, t);
			} else {
				l.warn(msg, t);
			}
		} else {
			if (msg != null) {
				// Better to not use STDERR, because then the sequence is disrupted.
				System.out.println(mk.name() + ": " + msg);
			}
			if (t != null) {
				if (mk == MsgKind.ERROR) {
					t.printStackTrace(System.out);
				} else if (mk == MsgKind.WARN) {
					System.out.println("Warning Exception: " + t);
				}
			}
		}
	}

	@Override public void logError(String msg, Throwable t) {
		logWithException(MsgKind.ERROR, msg, t);
	}

	@Override public void logWarning(String msg, Throwable t) {
		logWithException(MsgKind.WARN, msg, t);
	}

	@Override public void logError(String msg) {
		logError(msg, null);
	}

	@Override public void logWarning(String msg) {
		logWarning(msg, null);
	}

	@Override public void logDebug(String msg) {
		logInfo(IMPO_LO, msg);
	}

	/**
	 * This should usually be called only once during a system's runtime lifetime. (To be tested: works OK to update properties at runtime?)
	 * 
	 * Prints some debug to stdout about known classloaders, then builds a URL using the *local* CL of this concrete class (which will be *your* class is you make subtypes of BasicDebugger or BundleActivatorBase!) to create a resource URL into the classpath (under OSGi, the bundle-classpath-of) of that concrete class, which under OSGi will look something like:
	 * 
	 * bundle://221.0:1/log4j.properties
	 * 
	 * ...which is then passed to Log4jFuncs.forceLog4jConfig.
	 * 
	 * What this means is that you can put a log4j.properties into any bundle of your own, then call "forceLog4jConfig()" ONCE from that bundle's activator (or framework-START-event handler), and then your properties should be in place.
	 */
	protected void forceLog4jConfig() {
		// Logger logger = getLogger();

		// To get more determinism over when this happens (before other bundles that use logging are launched),
		// need to mess with Felix auto-start properties?
		ClassLoader threadCL = Thread.currentThread().getContextClassLoader();
		ClassLoader localCL = getClass().getClassLoader();
		System.out.println("thread-context-CL=" + threadCL);
		System.out.println("local-CL=" + localCL);

		String resPath = "log4j.properties";

		URL threadURL = threadCL.getResource(resPath);
		URL localURL = localCL.getResource(resPath);
		System.out.println("[System.out] forceLog4jConfig() threadCL resolved " + resPath + " to threadURL " + threadURL);
		System.out.println("[System.out] forceLog4jConfig() localCL resolved  " + resPath + " to  localURL " + localURL);
		System.out.println("[System.out] " + getClass().getCanonicalName() + " is forcing Log4J to read config from localURL: " + localURL);

		try {

			Log4jFuncs.forceLog4jConfig(localURL);
		} catch (Throwable t) {
			Debuggable.printStackTrace(t);
		}
		try {
			Logger logger = getLogger();

			try {
				logger.warn("{forceLog4JConfig} - This message was printed at WARN level to SLF4J, after forcing config for Log4J to localURL: " + localURL);
			} catch (Throwable t2) {
				Debuggable.printStackTrace(t2);
			}
		} catch (Throwable t) {
			Debuggable.printStackTrace(t);
		}
	}

}
