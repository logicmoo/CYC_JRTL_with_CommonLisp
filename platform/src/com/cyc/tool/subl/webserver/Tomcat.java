/* For LarKC */
package com.cyc.tool.subl.webserver;

import static org.logicmoo.system.Startup.printStackTrace;

import java.util.List;
import java.util.regex.Pattern;

import org.apache.catalina.startup.Bootstrap;
import org.armedbear.lisp.Lisp;
import org.logicmoo.system.SystemCurrent;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.IsolatedClassLoader;
import com.cyc.tool.subl.webserver.ServletContainer.WarSpec;

public class Tomcat {
	private static Thread tomcatThread;

	public static void startJettyServer(int portNum, List<WarSpec> warSpecs, String tmpDir) {
		start();
	}

	public static SubLObject stopJettyServer(String tmpDir) {
		stop();
		return Lisp.NIL;
	}

	/**
	 * @return
	 */
	public static void stop() {
		//Jetty.startJettyServer(portNum, warSpecs, tmpDir);
		daemon = Bootstrap.daemon;
		if (daemon != null)
			Bootstrap.main(new String[] { "stop" });
	}

	/**
	 * Daemon object used by main.
	 */
	//public static Bootstrap daemon = null;

	private static final Pattern PATH_PATTERN = Pattern.compile("(\".*?\")|(([^,])*)");

	private static void setCatalinaLoader() {
		Thread.currentThread().setContextClassLoader(IsolatedClassLoader.theIsolatedClassLoader);
		//Thread.currentThread().setContextClassLoader(daemon.catalinaLoader);
	}

	static Bootstrap daemon;

	/**
	 * 
	 */
	synchronized public static void start() {
		daemon = Bootstrap.daemon;
		if (daemon != null)
			return;
		tomcatThread = new Thread(() -> bgStart());
		tomcatThread.setName("Tomcat Starup thread");
		tomcatThread.setDaemon(true);
		tomcatThread.start();

	}

	/**
	 * 
	 */
	public static void bgStart() {
		//Jetty.startJettyServer(portNum, warSpecs, tmpDir);
		//System.setProperty("http.port", "" + portNum);
		String[] args = new String[] { "start" };

		//tomcatThread = new Thread(() -> {

		Thread.currentThread().setContextClassLoader(IsolatedClassLoader.theIsolatedClassLoader);

		if (daemon == null) {
			// Don'e set daemon until init() has completed
			Bootstrap bootstrap = new Bootstrap();
			try {
				bootstrap.init();
			} catch (Throwable e) {
				printStackTrace(e);
				Errors.handleError(e);
				return;
			}
			daemon = Bootstrap.daemon = bootstrap;
		} else {
			// When running as a service the call to stop will be on a new
			// thread so make sure the correct class loader is used to prevent
			// a range of class not found exceptions.
			setCatalinaLoader();
		}

		try {
			daemon.setAwait(false);
		} catch (Exception e) {
			printStackTrace(e);
			Errors.handleError(e);
		}
		try {
			daemon.load(args);
			SystemCurrent.recheckStdIO();
		} catch (Exception e) {
			printStackTrace(e);
			Errors.handleError(e);
		}
		try {
			daemon.start();
		} catch (Exception e) {
			printStackTrace(e);
			Errors.handleError(e);
		}

		//		if (null == daemon.getServer()) {
		//			Startup.exit(1);
		//		}
	}

}
