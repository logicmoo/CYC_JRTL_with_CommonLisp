package jasko.tim.lisp.cusp;

import jasko.tim.lisp.LispPlugin;
import jasko.tim.lisp.preferences.PreferenceConstants;
import jasko.tim.lisp.util.LispUtil;
import jasko.tim.lisp.editors.actions.*;
import jasko.tim.lisp.builder.LispBuilder;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.net.*;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.widgets.Display;

/*
C:\sbcl\bin\sbcl.exe --load "C:/slime/cusp-loader.lisp" --eval "(cusp:create-cusp-server 4005 nil)"
 */

/**
 * The core guts of the plugin. All traffic to and from our lisp implementation
 * goes through here. Cusp operates off of the cusp server that comes with
 * slime. Thus, to your lisp implementation, it's really no different from
 * slime. Cusp makes our lives easier, as we don't have to worry about
 * implementing all of that stuff that the smart Cusp developers did for us (in
 * a cross-implementation fashion, even). Now, a lot of this could probably be
 * cleaned up, and wisened up by somebody more familiar with Slime/Cusp
 * development. I have learned the protocol almost entirely through packet
 * sniffing. My methods seem to work, but I could be rather naive in some
 * places. It should also be noted that the Cusp developers are not above
 * changing the protocol for no good reason. Have fun, maintainers!
 * 
 * Rough overview: Requests/commands sent to Lisp are associated with a
 * CuspRunnable subclass, whose run() method processes the result once it comes
 * in. Pass <code>null</code> if you don't care about the result. Through here,
 * we also register various listeners for the various events that Lisp might
 * invoke (the debugger, for example). Probably 90% of these are subscribed to
 * by the Repl.
 * 
 * TODO: -Indentation is very dumb right now, and needs to be made smarter.
 * 
 * 
 * @see CuspRunnable
 * @author Tim Jasko
 */
public class CuspInterface {
	// has the disconnected function been called? Used to short the Cusp started
	// string message
	// if for some reason pipe has been closed. In both connect functions, this is
	// reset to false. In disconnect,
	// it is set to true
	private boolean disconnected = false; // should be false first!!
	public static final String DEFAULT_ERROR_MESSAGE = "Cusp was unable to connect to your lisp instance.\n"
			+ "Please make sure the Lisp Executable Arguments are correctly set under Lisp Preferences.\n"
			+ "Then try restarting Eclipse.";

	// when we get multiple CUSPS, this won't work, but since NULL is returned if
	// cusp isn't connected,well.
	protected static String errorMessage = DEFAULT_ERROR_MESSAGE;

	public LispImplementation implementation;

	private String lispFlavor = "";
	private String lispCommand = "";

	/** Port of the Cusp server */
	private static Integer port = 4004;

	private Socket echoSocket = null;
	private Socket secondary = null;
	private DataOutputStream out = null;
	DataOutputStream commandInterface = null;
	private int messageNum = 1;

	/** Holds whether we are connected to Cusp. */
	private boolean connected = false;
	private String currPackage = "COMMON-LISP-USER";
	private String lispVersion = "(NO CL IMPLEMENTATION)";
	private String lastTestPackage = "nil"; // FIXME: this should be in test view

	public String getCurrPackage() {
		return currPackage;
	}

	public String getlastTestPackage() {
		return lastTestPackage;
	}

	private ListenerThread listener;
	private DisplayListenerThread displayListener;

	private DisplayListenerThread stdOut;
	private DisplayListenerThread stdErr;

	/**
	 * Holds all outstanding jobs that we're waiting for Lisp to finish processing,
	 * except those that are being executed synchronously.
	 */
	private Hashtable<String, CuspRunnable> jobs = new Hashtable<String, CuspRunnable>();
	/**
	 * Holds jobs that are being executed synchronously. We handle them slightly
	 * differently.
	 */
	private Hashtable<String, SyncCallback> syncJobs = new Hashtable<String, SyncCallback>();

	/**
	 * Listeners to be given debug info, usually right before a :debug-activate.
	 */
	private List<CuspRunnable> debugInfoListeners;

	/**
	 * Listeners to be notified when the debugger is activated.
	 */
	private List<CuspRunnable> debugListeners;

	/**
	 * Listeners to be notified when the debugger should be dismissed
	 */
	private List<CuspRunnable> debugReturnListeners;

	/**
	 * Listeners to be notified of anything to be output.
	 */
	private List<CuspRunnable> displayListeners;

	/**
	 * Listeners to be notified whenever Lisp is trying to read something from the
	 * user.
	 */
	private List<CuspRunnable> readListeners;

	/**
	 * For those who want to be informed of the death of our Lisp.
	 */
	private List<CuspRunnable> disconnectListeners;

	/**
	 * Anybody who wants to know that indentation has been updated.
	 */
	private List<CuspRunnable> indentationListeners;

	Process lispEngine;

	// dummy cusp interface for when an error is thrown yet we need a swawnk object
	// for consistency.
	// i.e. for the repl view.
	// ONLY USED WHEN PLUGIN STARTS UP. Other times when we attempt to reconnect and
	// fail,
	// the REPL message isn't shown.
	public CuspInterface(boolean dummy) {
		connected = false;
		disconnected = true;

		debugListeners = Collections.synchronizedList(new ArrayList<CuspRunnable>(1));
		debugInfoListeners = Collections.synchronizedList(new ArrayList<CuspRunnable>(1));
		debugReturnListeners = Collections.synchronizedList(new ArrayList<CuspRunnable>(1));
		displayListeners = Collections.synchronizedList(new ArrayList<CuspRunnable>(1));
		readListeners = Collections.synchronizedList(new ArrayList<CuspRunnable>(1));
		disconnectListeners = Collections.synchronizedList(new ArrayList<CuspRunnable>(1));
		indentationListeners = Collections.synchronizedList(new ArrayList<CuspRunnable>(1));

		initIndents();

	}

	public CuspInterface() {
		debugListeners = Collections.synchronizedList(new ArrayList<CuspRunnable>(1));
		debugInfoListeners = Collections.synchronizedList(new ArrayList<CuspRunnable>(1));
		debugReturnListeners = Collections.synchronizedList(new ArrayList<CuspRunnable>(1));
		displayListeners = Collections.synchronizedList(new ArrayList<CuspRunnable>(1));
		readListeners = Collections.synchronizedList(new ArrayList<CuspRunnable>(1));
		disconnectListeners = Collections.synchronizedList(new ArrayList<CuspRunnable>(1));
		indentationListeners = Collections.synchronizedList(new ArrayList<CuspRunnable>(1));

		initIndents();
		connect();
	}

	public CuspInterface(String flavor, String command) {
		debugListeners = Collections.synchronizedList(new ArrayList<CuspRunnable>(1));
		debugInfoListeners = Collections.synchronizedList(new ArrayList<CuspRunnable>(1));
		debugReturnListeners = Collections.synchronizedList(new ArrayList<CuspRunnable>(1));
		displayListeners = Collections.synchronizedList(new ArrayList<CuspRunnable>(1));
		readListeners = Collections.synchronizedList(new ArrayList<CuspRunnable>(1));
		disconnectListeners = Collections.synchronizedList(new ArrayList<CuspRunnable>(1));
		indentationListeners = Collections.synchronizedList(new ArrayList<CuspRunnable>(1));

		initIndents();
		connect(flavor, command);
	}

	public Hashtable<String, String> specialIndents;
	public Hashtable<String, String> fletIndents;
	public Hashtable<String, Integer> indents;
	public Hashtable<String, String> handlerCaseIndents;

	private void initIndents() {
		// for forms that get indented like flet
		fletIndents = new Hashtable<String, String>();
		fletIndents.put("flet", "  ");
		fletIndents.put("labels", "  ");
		fletIndents.put("macrolet", "  ");

		// for forms that get indented like handler-case
		handlerCaseIndents = new Hashtable<String, String>();
		handlerCaseIndents.put("handler-case", "  ");

		// forms that always get indented a certain number of spaces
		// Why are flet, labels, etc here as well as in fletIndents?
		// specialIndents controls how you get indented as a result of your parent form
		// The indenting we do for fletIndents happens when those forms are the
		// great-grandparents
		specialIndents = new Hashtable<String, String>();
		specialIndents.put("", " ");
		specialIndents.put("progn", "  ");
		specialIndents.put("if", "    ");
		specialIndents.put("cond", "  ");
		specialIndents.put("when", "  ");
		specialIndents.put("unless", "  ");
		specialIndents.put("let", "  ");
		specialIndents.put("let*", "  ");
		specialIndents.put("dolist", "  ");
		specialIndents.put("flet", "  ");
		specialIndents.put("labels", "  ");
		specialIndents.put("macrolet", "  ");
		specialIndents.put("dotimes", "  ");
		specialIndents.put("lambda", "  ");
		specialIndents.put("defun", "  ");
		specialIndents.put("defvar", "  ");
		specialIndents.put("defparameter", "  ");
		specialIndents.put("eval-when", "  ");
		specialIndents.put("multiple-value-bind", "  ");
		specialIndents.put("destructuring-bind", "  ");
		specialIndents.put("unwind-protect", "  ");
		specialIndents.put("block", "  ");
		specialIndents.put("case", "  ");

		// All additional custom indents will go here
		indents = new Hashtable<String, Integer>();
		indents.put("do", 2);
		indents.put("with-open-stream", 1);
		indents.put("with-open-file", 1);
		indents.put("with-accessors", 1);
		indents.put("with-alien", 1);
		indents.put("with-compilation-unit", 1);
		indents.put("with-compilation-restarts", 1);
		indents.put("with-condition-restarts", 1);
		indents.put("with", 1);
		indents.put("with-hash-table-iterator", 1);
		indents.put("with-input-from-string", 1);
		indents.put("with-locked-hash-table", 1);
		indents.put("with-output-to-string", 1);
		indents.put("with-package-iterator", 1);
		indents.put("with-simple-restart", 1);
		indents.put("with-slots", 2);
		indents.put("with-timeout", 1);
		indents.put("with-unlocked-packages", 1);

		addIndentationListener(new CuspRunnable() {
			public void run() {
				LispNode updates = result.get(1);
				for (LispNode update : updates.params) {
					String symbol = update.get(0).value;
					// The LispParser doesn't understand dotted lists,
					// and just sees the dot as another element
					int paramNum = update.get(2).asInt();
					indents.put(symbol, paramNum);
				}

			}
		});
	}

	public boolean isConnected() {
		return connected;
	}

	public String getLispVersion() {
		return lispVersion;
	}

	public void setLispVersion(String version) {
		lispVersion = version;
		LispPlugin.getDefault().updateReplStatusLine(
				"CL:" + lispVersion + "| Cusp: " + LispPlugin.getVersion() + "| Current package: " + getPackage());
	}

	// SK: note, MANAGE_PACKAGES and USE_UNIT_TEST preferences should be
	// accessed only through CuspInterface.getManagePackages and
	// cuspInterface.getUnitTest - because their value only have importance
	// when lisp starts
	private boolean managePackages = false;
	private boolean useUnitTest = false;

	public boolean getManagePackages() {
		return managePackages;
	}

	public boolean getUseUnitTest() {
		return useUnitTest;
	}

	public String translateRemoteFilePath(String path) {
		if (implementation != null) {
			return implementation.translateRemoteFilePath(path);
		} else {
			return path;
		}
	}

	public synchronized void registerLibPath(String path) {
		String code = path.replace("\\", "/");
		if (!code.endsWith("/")) {
			code += "/";
		}
		code = "(com.gigamonkeys.asdf-extensions:register-source-directory \"" + code + "\")";
		sendEvalAndGrab(code, 1000);
	}

	public void runAfterLispStart() {
		if (isConnected()) {
			IPreferenceStore prefs = LispPlugin.getDefault().getPreferenceStore();
			managePackages = prefs.getBoolean(PreferenceConstants.MANAGE_PACKAGES);
			useUnitTest = prefs.getBoolean(PreferenceConstants.USE_UNIT_TEST);
			String strIni = prefs.getString(PreferenceConstants.LISP_INI);
			CuspRunnable sr = null;
			emacsCreateRepl();
			///////////////////////////////////////////////////////
			String path = LispPlugin.getDefault().getPluginPath();
			String extP = path + "lisp-extensions/";
			String clFadPath = extP + "cl-fad/";

			String asdfLoad = "(handler-case" + " (require 'asdf)" + "  (error (err)" + "     (load \"" + extP
					+ "asdf.lisp\")" + "     #+ecl (load \"" + extP + "asdf-ecl.lisp\")))";

			String fadLoad = "(progn (push \"" + clFadPath + "\" asdf:*central-registry*"
					+ ") (asdf:operate 'asdf:load-op 'cl-fad))";

			String asdfext = "(load \"" + extP + "asdf-extensions.lisp\")";

			String startupCode = asdfLoad + "(progn " + asdfext// +fadLoad
					+ "(cusp:cusp-require :cusp-fuzzy)\n" + "(cusp:cusp-require :cusp-asdf)\n"
					+ "(cusp:cusp-require :cusp-presentations)\n" + "(cusp:cusp-require :cusp-fancy-inspector)\n"
					+ "(cusp:cusp-require :cusp-arglists)\n" + "(cusp:cusp-require :cusp-presentations)\n"
					+ BreakpointAction.macro + "\n" + WatchAction.macro + "\n";

			if (useUnitTest) {
				startupCode += "(load \"" + LispPlugin.getDefault().getPluginPath() + "lisp-extensions/lisp-unit.lisp"
						+ "\")\n";
			}
			if (managePackages) {
				final String code = LispPlugin.getDefault().getLibsPathRegisterCode();
				if (!code.equals("")) {
					System.out.printf("asdf path: %s\n", asdfext);
					sr = new CuspRunnable() {
						public void run() {
							emacsRexStartup(code, "COMMON-LISP-USER");
						}
					};
				}
			}
			if (strIni != "") {
				strIni = strIni.replaceAll("\\\\", "/");
				startupCode += "(when (probe-file \"" + strIni + "\") (load \"" + strIni + "\"))\n";
			}

			startupCode += "(format nil \"You are running ~a ~a via Cusp " + LispPlugin.getVersion()
					+ "\" (lisp-implementation-type) (lisp-implementation-version))" + ")";

			sendEvalStartup(startupCode, sr);
			// sendEval("(cusp:fancy-inspector-init)", null);

			sendGetConnectionInfoStartup(new CuspRunnable() {

				public void run() {
					LispNode impl = getReturn().getf(":lisp-implementation");
					setLispVersion(impl.getf(":name").value + " " + impl.getf(":version").value);
				}

			});
		}
	}

	/**
	 * Connects to the cusp server.
	 * 
	 * @return whether connecting was successful
	 */

	public void setErrorMessage(String message) {
		errorMessage = message;
	}

	public void connectInit() {
		connected = false;
		disconnected = false;
		currPackage = "COMMON-LISP-USER";
		setErrorMessage(DEFAULT_ERROR_MESSAGE);
	}

	public boolean connect() {
		connectInit();

		synchronized (port) {
			++port;
			implementation = null;

			// First attempt to use preferences to identify lisp implementation
			IPreferenceStore prefStore = LispPlugin.getDefault().getPreferenceStore();
			if (prefStore.getBoolean(PreferenceConstants.USE_REMOTE_LISP)) {
				implementation = RemoteImplementation.findImplementation();
			} else {
				implementation = SiteWideImplementation.findImplementation();
			}

			// As a fallback, if the above failed, find an implementation
			// and start a lisp process trying sbcl and allegro in default locations:
			// if (implementation==null) {
			// implementation = ClispImplementation.findImplementation();
			// }
			if (true || implementation == null) {
				implementation = LarKCImplementation.findImplementation();
			}
			if (implementation == null) {
				implementation = SBCLImplementation.findImplementation();
			}
			if (implementation == null) {
				implementation = AllegroImplementation.findImplementation();
			}

			String pluginDir = LispPlugin.getDefault().getPluginPath();
			String slimePath = pluginDir + "slime/cusp-loader.lisp";
			if (implementation != null) {
				try {
					lispEngine = implementation.startLisp(slimePath, port);
				} catch (IOException e3) {
					e3.printStackTrace();
					return false;
				}
			} else {
				// always try to load sbcl as second fallback
				try {
					ProcessBuilder pb = new ProcessBuilder(new String[] { "sbcl", "--load", slimePath });
					lispEngine = pb.start();
				} catch (IOException e) {
					return false;
				}
			}

			int retries = 1;
			do {
				if (connectStreams(slimePath)) {
					try {
						echoSocket = new Socket("localhost", port);
						out = new DataOutputStream(echoSocket.getOutputStream());
						listener = new ListenerThread(echoSocket.getInputStream());
						listener.start();
						break;
					} catch (UnknownHostException e) {
						return false;
					} catch (IOException e) {
						return false;
						/*
						 * try { int val = lispEngine.exitValue(); System.out.println("exit: " + val);
						 * 
						 * lispEngine = implementation.startHarder(slimePath, port); --retries; // try
						 * to connect again } catch (IOException e2) { e.printStackTrace(); return
						 * false; }
						 */
					}
				}
				--retries;
			} while (retries >= 0);
		} // synchronized

		// sendRaw("(:emacs-rex (cusp:connection-info) nil t 1)");
		if (echoSocket != null && echoSocket.isConnected()) {
			connected = true;
		} else {
			connected = false;
		}
		runAfterLispStart();
		return connected;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	// FIXME: right now implemented only for sbcl. In this case command is a
	// filepath to sbcl
	public boolean connect(String flavor, String command) {
		connectInit();
		IPreferenceStore store = LispPlugin.getDefault().getPreferenceStore();

		if (!flavor.equalsIgnoreCase("sbcl")) {
			// return false;
		}

		lispFlavor = flavor;
		lispCommand = command;

		synchronized (port) {
			++port;
			implementation = null;

			implementation = SBCLImplementation.findImplementation(command);

			String pluginDir = LispPlugin.getDefault().getPluginPath();
			String slimePath = pluginDir + "slime/cusp-loader.lisp";
			if (implementation != null) {
				try {
					lispEngine = implementation.startLisp(slimePath, port);
				} catch (IOException e3) {
					e3.printStackTrace();
					return false;
				}
			} else {
				try {
					ProcessBuilder pb = new ProcessBuilder(new String[] { "sbcl", "--load", slimePath });
					lispEngine = pb.start();
				} catch (IOException e) {
					return false;
				}
			}

			int retries = 1;
			do {
				if (connectStreams(slimePath)) {
					try {
						echoSocket = new Socket("localhost", port);
						out = new DataOutputStream(echoSocket.getOutputStream());
						listener = new ListenerThread(echoSocket.getInputStream());
						listener.start();
						break;
					} catch (UnknownHostException e) {
						return false;
					} catch (IOException e) {
						return false;
						/*
						 * try { int val = lispEngine.exitValue(); System.out.println("exit: " + val);
						 * 
						 * lispEngine = implementation.startHarder(slimePath, port); --retries; // try
						 * to connect again } catch (IOException e2) { e.printStackTrace(); return
						 * false; }
						 */
					}
				}
			} while (retries >= 0);
		} // synchronized

		// sendRaw("(:emacs-rex (cusp:connection-info) nil t 1)");
		if (echoSocket != null && echoSocket.isConnected()) {
			connected = true;
		} else {
			connected = false;
		}
		runAfterLispStart();
		return connected;
	}

	private boolean connectStreams(String slimePath) {
		if (stdOut != null) { // never cross the streams
			stdOut.running = false;
		}
		if (stdErr != null) {
			stdErr.running = false;
		}

		// it's not happy unless we hook up to clear out the output
		CuspStartFilter ssfilter = new CuspStartFilter();
		int retries = 7;

		try {
			if (!(implementation instanceof LarKCImplementation) && lispEngine != null) {

				stdOut = new DisplayListenerThread(lispEngine.getInputStream(), true);
				stdErr = new DisplayListenerThread(lispEngine.getErrorStream(), true);

				stdOut.addFilter(ssfilter);
				stdErr.addFilter(ssfilter);

				stdOut.start();
				stdErr.start();

				commandInterface = new DataOutputStream(lispEngine.getOutputStream());
				// commandInterface.writeBytes("(progn (cusp:create-cusp-server " + port + "
				// nil) (quit))\n");
				// commandInterface.writeBytes("(load \"" + slimePath.replace("\\", "\\\\") +
				// "\")\n");
				String slimeLoadCmd = implementation.getLoadCuspCommand();
				if (slimeLoadCmd != null) {
					commandInterface.writeBytes(slimeLoadCmd);
				}
				commandInterface.writeBytes("(cusp-loader::init :load-contribs t :setup t)");
				commandInterface.flush();
				commandInterface
						.writeBytes("(progn (cusp:create-server :coding-system \"utf-8\" :port " + port + "))\n");
				commandInterface.flush();

				while (!ssfilter.getStartStringFlag() && retries > 0) {
					synchronized (ssfilter) {
						try {
							// Wait until we detect the "Cusp started" message in the display stream
							ssfilter.wait(10000);
						} catch (Exception e) {
							// ignore all exceptions (this might be dangerous)
						} finally {
							if (isDisconnected()) {
								setErrorMessage(DEFAULT_ERROR_MESSAGE
										+ "\nReason: Connection was closed (Lisp Executable Arguments incorrect?).");
								return false;
							}
							if (!ssfilter.getStartStringFlag()) {
								System.err.println("still waiting for 'Cusp started' string... retries = " + retries);
								--retries;
							}
						}
					}
				}
			}
		} catch (

		IOException e2) {
			e2.printStackTrace();
			return false;
		} catch (NullPointerException e) { // prevent annoying errors which occur randomly when we fail to connect to
											// lisp
			e.printStackTrace();
			return false;
		} finally {
			if (stdOut != null)
				stdOut.removeFilter(ssfilter);
			if (stdErr != null)
				stdErr.removeFilter(ssfilter);
		}

		return (retries > 0);
	}

	public void reconnect() {
		disconnect();
		if (lispFlavor != null && lispFlavor != "") {
			connect(lispFlavor, lispCommand);
		} else {
			connect();
		}
	}

	public boolean isDisconnected() {
		return disconnected;
	}

	public void disconnectInit() {
		connected = false;
		disconnected = true;
	}

	public void disconnect() {
		disconnectInit();
		signalListeners(disconnectListeners, new LispNode());
		System.out.println("*disconnect");
		if (System.getProperty("os.name").toLowerCase().contains("windows")) {
			if (lispEngine != null) {
				lispEngine.destroy();
				lispEngine = null;
			}
		}

		try {
			commandInterface.writeBytes("(cusp:quit-lisp)\n");
			commandInterface.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}

		try {
			if (displayListener != null) {
				displayListener.running = false;
			}
			if (stdOut != null) {
				stdOut.running = false;
			}
			if (stdErr != null) {
				stdErr.running = false;
			}

			if (listener != null) {
				listener.running = false;
			} else {
				System.err.println("lisp instance wasn't running.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			if (lispEngine != null) {
				currPackage = "COMMON-LISP-USER";
				// sendEval("(quit)", null);

				// lispEngine.destroy();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void addReadListener(CuspRunnable callBack) {
		synchronized (readListeners) {
			readListeners.add(callBack);
		}
	}

	public void addDebugListener(CuspRunnable callBack) {
		synchronized (debugListeners) {
			debugListeners.add(callBack);
		}
	}

	public void addDebugInfoListener(CuspRunnable callBack) {
		synchronized (debugInfoListeners) {
			debugInfoListeners.add(callBack);
		}
	}

	public void addDebugReturnListener(CuspRunnable callBack) {
		synchronized (debugReturnListeners) {
			debugReturnListeners.add(callBack);
		}
	}

	public void addDisplayCallback(CuspRunnable callBack) {
		synchronized (displayListeners) {
			displayListeners.add(callBack);
		}
	}

	public void addDisconnectCallback(CuspRunnable callBack) {
		synchronized (disconnectListeners) {
			disconnectListeners.add(callBack);
		}
	}

	public void addIndentationListener(CuspRunnable callBack) {
		synchronized (indentationListeners) {
			indentationListeners.add(callBack);
		}
	}

	public void removeReadListener(CuspRunnable callBack) {
		synchronized (readListeners) {
			readListeners.remove(callBack);
		}
	}

	public void removeDebugListener(CuspRunnable callBack) {
		synchronized (debugListeners) {
			debugListeners.remove(callBack);
		}
	}

	public void removeDebugInfoListener(CuspRunnable callBack) {
		synchronized (debugInfoListeners) {
			debugInfoListeners.remove(callBack);
		}
	}

	public void removeDebugReturnListener(CuspRunnable callBack) {
		synchronized (debugReturnListeners) {
			debugReturnListeners.remove(callBack);
		}
	}

	public void removeDisplayCallback(CuspRunnable callBack) {
		synchronized (displayListeners) {
			displayListeners.remove(callBack);
		}
	}

	public void removeDisconnectCallback(CuspRunnable callBack) {
		synchronized (disconnectListeners) {
			disconnectListeners.remove(callBack);
		}
	}

	public void removeIndentationListener(CuspRunnable callBack) {
		synchronized (indentationListeners) {
			indentationListeners.remove(callBack);
		}
	}

	private void registerCallback(CuspRunnable callBack) {
		++messageNum;
		if (callBack != null) {
			callBack.messageNum = messageNum;
			jobs.put(new Integer(messageNum).toString(), callBack);
		}
	}

	public String getPackage() {
		return currPackage;
	}

	public synchronized void setPackage(String p) {
		++messageNum;
		String newPackage = LispUtil.formatCode(p);
		emacsRex("(cusp:set-package \"" + newPackage + "\")", currPackage);

		currPackage = newPackage;
	}

	// finds definitions in package pkg:
	private synchronized boolean haveDefinitionsPkg(String symbol, String pkg, long timeout) {
		SyncCallback callBack = new SyncCallback();
		++messageNum;
		syncJobs.put(new Integer(messageNum).toString(), callBack);

		String code = LispUtil.formatCode(symbol);
		String pkgstring = pkg;
		if (!pkg.equals("") && pkg.startsWith(":")) {
			pkgstring = pkg.substring(1);
		}
		if (!pkgstring.equals("")) {
			pkgstring += "::";
		}
		String msg = "(handler-case (cusp::find-definitions-for-emacs \"" + pkgstring + code
				+ "\") (simple-type-error () nil))";
		if (implementation.lispType().equalsIgnoreCase("SBCL")) { // quiet compilation warnings
			msg = "(locally (declare (sb-ext:muffle-conditions sb-ext:compiler-note)) " + msg + ")";
		}
		String res = sendEvalAndGrab(msg, 2000);

		return (!(res.equalsIgnoreCase("nil") || (res.contains(":ERROR") && !res.contains(":LOCATION"))));
	}

	// finds definitions in package pkg or global context
	public synchronized boolean haveDefinitions(String symbol, String pkg, long timeout) {
		return (haveDefinitionsPkg(symbol, pkg, timeout) || haveDefinitionsPkg(symbol, "", timeout));
	}

	/**
	 * 
	 * @param start   of the string
	 * @param pkg     current package (if null, then cusp.currPackage)
	 * @param timeout timeout for cusp call
	 * @param n       number of completions to get: 0 if no limit (limit works only
	 *                for fuzzy completions)
	 * @return string[2][n] : string[0] - completions, string[1] - arglists + docs
	 */
	public synchronized String[][] getCompletionsAndDocs(String start, String pkg, long timeout, int n) {
		SyncCallback callBack = new SyncCallback();
		++messageNum;
		syncJobs.put(new Integer(messageNum).toString(), callBack);

		IPreferenceStore prefs = LispPlugin.getDefault().getPreferenceStore();
		boolean usefuzzy = prefs.getBoolean(PreferenceConstants.AUTO_FUZZY_COMPLETIONS);

		String msg = "";
		String usepkg = currPackage;

		if (usefuzzy) {
			msg = "(let ((lst (mapcar #'first (let ((x (cusp:fuzzy-completions ";
		} else {
			msg = "(let ((lst (first (cusp:simple-completions ";
		}
		msg += "\"" + start + "\" ";
		if (pkg == null) {
			msg += LispUtil.cleanPackage(currPackage) + " ";
		} else {
			msg += LispUtil.cleanPackage(pkg) + " ";
			usepkg = pkg;
		}
		if (usefuzzy) {
			msg += " :time-limit-in-msec " + timeout;
			if (n > 0) {
				msg += " :limit " + n;
			}
			msg += "))) (if (listp (first (first x))) (first x) x)";
		}
		msg += "))))";
		msg += "(list lst (mapcar #'(lambda (y) (cusp:operator-arglist y " + LispUtil.cleanPackage(pkg) + ")) lst)"
				+ " (mapcar #'(lambda (z) (cusp:documentation-symbol z)) lst)))";
		LispNode resNode = LispParser.parse(sendEvalAndGrab(msg, usepkg, timeout));
		LispNode compl = resNode.car().get(0);
		LispNode args = resNode.car().get(1);
		LispNode docs = resNode.car().get(2);
		int nn = compl.params.size();
		if (0 == nn) {
			return null;
		}

		String[][] res = new String[2][nn];

		for (int i = 0; i < nn; ++i) {
			String info = args.get(i).value;
			if (info.equalsIgnoreCase("nil") || info.contains("not available")) {
				info = "";
			}
			String docString = docs.get(i).value;
			if (!docString.equals("") && !docString.equalsIgnoreCase("nil")) {
				String[] lines = docString.split("\n");
				int maxlines = prefs.getInt(PreferenceConstants.MAX_HINT_LINES);
				if (maxlines > 0 && lines.length > maxlines) {
					for (int j = 0; j < maxlines; ++j) {
						info += "\n" + lines[j];
					}
					info += "...";
				} else {
					info += "\n" + docString;
				}
			}
			res[0][i] = compl.get(i).value;
			res[1][i] = info;
		}
		return res;

	}

	public synchronized String[] getCompletions(String start, long timeout) {
		return getCompletions(start, currPackage, timeout);
	}

	public synchronized String[] getCompletions(String start, String pkg, long timeout) {
		SyncCallback callBack = new SyncCallback();
		++messageNum;
		syncJobs.put(new Integer(messageNum).toString(), callBack);

		IPreferenceStore prefs = LispPlugin.getDefault().getPreferenceStore();
		String msg = "";
		int nlim = 0;

		boolean usefuzzy = prefs.getBoolean(PreferenceConstants.AUTO_FUZZY_COMPLETIONS);
		if (usefuzzy) {
			String tlimit = "50";
			String nlimit = prefs.getString(PreferenceConstants.AUTO_COMPLETIONS_NLIMIT);
			if (!nlimit.matches("\\d+")) {
				nlimit = "0";
			} else {
				nlim = prefs.getInt(PreferenceConstants.AUTO_COMPLETIONS_NLIMIT);
			}
			msg = "(cusp:fuzzy-completions \"" + start + "\" " + LispUtil.cleanPackage(pkg) + " :limit " + nlimit
					+ " :time-limit-in-msec " + tlimit + ")";
		} else {
			msg = "(cusp:simple-completions \"" + start + "\" " + LispUtil.cleanPackage(pkg) + ")";
		}

		try {
			synchronized (callBack) {
				if (emacsRex(msg)) {
					callBack.wait(timeout);
					LispNode results = callBack.result.cadr().cadr();
					// for some reasons sometimes it is in car() and at other times just at results
					if (results.cadr().value.equalsIgnoreCase("nil")) {
						results = results.car();
					}
					String[] ret = new String[results.params.size()];
					if (usefuzzy) {
						int nn = nlim;
						if (nn == 0) {
							nn = results.params.size();
						} else {
							nn = Math.min(results.params.size(), nn);
						}
						for (int i = 0; i < nn; ++i) {
							ret[i] = results.get(i).car().value;
						} // for
					} else {
						for (int i = 0; i < results.params.size(); ++i) {
							ret[i] = results.get(i).value;
						} // for
					}
					return ret;
				} else {
					return null;
				}
			} // sync
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} // catch
	}

	public synchronized String getArglist(String function, long timeout) {
		return getArglist(function, timeout, currPackage);
	}

	public synchronized String getArglist(String function, long timeout, String currPackage) {
		SyncCallback callBack = new SyncCallback();
		++messageNum;
		syncJobs.put(new Integer(messageNum).toString(), callBack);

		String msg = "(cusp:operator-arglist \"" + LispUtil.formatCode(function) + "\" "
				+ LispUtil.cleanPackage(currPackage) + " )";

		try {
			synchronized (callBack) {
				if (emacsRex(msg, currPackage)) {

					callBack.wait(timeout);
					return callBack.result.cadr().cadr().value;
				} else {
					return "";
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
	}

	public synchronized void sendGetArglist(String function, String currPackage, CuspRunnable callBack) {
		registerCallback(callBack);
		String msg = "(cusp:operator-arglist \"" + LispUtil.formatCode(function) + "\" "
				+ LispUtil.cleanPackage(currPackage) + ")";

		emacsRex(msg, currPackage);
	}

	public synchronized String getMakeInstanceArglist(String className, long timeout) {
		return getMakeInstanceArglist(className, currPackage, timeout);
	}

	public synchronized String getMakeInstanceArglist(String className, String pkg, long timeout) {
		SyncCallback callBack = new SyncCallback();
		++messageNum;
		syncJobs.put(new Integer(messageNum).toString(), callBack);
		// (cusp:arglist-for-echo-area (quote ((:make-instance "some-class"
		// "make-instance"))))
		String msg = "(cusp:arglist-for-echo-area (quote ((\"MAKE-INSTANCE\" \"'" + LispUtil.formatCode(className)
				+ "\"))))";

		try {
			synchronized (callBack) {
				if (emacsRex(msg, pkg)) {

					callBack.wait(timeout);
					return callBack.result.getf(":return").getf(":ok").value;
				} else {
					return "";
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
	}

	public synchronized String getSpecialArglist(String function, String arg0, long timeout) {
		return getSpecialArglist(function, arg0, currPackage, timeout);
	}

	public synchronized String getSpecialArglist(String function, String arg0, String pkg, long timeout) {
		SyncCallback callBack = new SyncCallback();
		++messageNum;
		syncJobs.put(new Integer(messageNum).toString(), callBack);
		// (cusp:arglist-for-echo-area (quote ((:make-instance "some-class"
		// "make-instance"))))
		String msg = "(cusp:arglist-for-echo-area (quote ((\"" + LispUtil.formatCode(function) + "\" \""
				+ LispUtil.formatCode(arg0) + "\" ))))";

		try {
			synchronized (callBack) {
				if (emacsRex(msg, pkg)) {

					callBack.wait(timeout);
					return callBack.result.getf(":return").getf(":ok").value;
				} else {
					return "";
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
	}

	public synchronized void sendGetDocumentation(String function, String pkg, CuspRunnable callBack) {
		registerCallback(callBack);
		String msg = "(cusp:documentation-symbol \"" + LispUtil.formatCode(function) + "\")";

		emacsRex(msg, pkg);
	}

	public synchronized String getDocumentation(String function, long timeout) {
		return getDocumentation(function, currPackage, timeout);
	}

	public synchronized String getDocumentation(String function, String pkg, long timeout) {
		SyncCallback callBack = new SyncCallback();
		++messageNum;
		syncJobs.put(new Integer(messageNum).toString(), callBack);

		String msg = "(cusp:documentation-symbol \"" + LispUtil.formatCode(function) + "\")";

		try {
			synchronized (callBack) {
				if (emacsRex(msg, pkg)) {

					callBack.wait(timeout);
					String result = callBack.result.getf(":return").getf(":ok").value;
					if (result.equalsIgnoreCase("nil")) {
						return "";
					} else {
						return result;
					}
				} else {
					return "";
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
			return "";
		}
	}

	private class SyncCallback {
		public LispNode result = new LispNode();
	}

	public synchronized void sendEvalStartup(String message, CuspRunnable callBack) {
		registerCallback(callBack);
		message = message + "\n";
		String msg = "(cusp:listener-eval \"" + LispUtil.formatCode(message) + "\")";

		emacsRexStartup(msg);
	}

	public synchronized void sendEval(String message, CuspRunnable callBack) {
		registerCallback(callBack);
		message = message + "\n";
		String msg = "(cusp:listener-eval \"" + LispUtil.formatCode(message) + "\")";

		emacsRex(msg);
	}

	public synchronized void sendEval(String message, String pkg, CuspRunnable callBack) {
		registerCallback(callBack);
		message = message + "\n";
		String msg = "(cusp:listener-eval \"" + LispUtil.formatCode(message) + "\")";

		emacsRex(msg, pkg);
	}

	public synchronized String sendEvalAndGrab(String message, long timeout) {
		return sendEvalAndGrab(message, "nil", timeout);
	}

	/* TODO: - make it with progress bar */
	public synchronized String sendEvalAndGrab(String message, String pkg, long timeout) {
		SyncCallback callBack = new SyncCallback();
		++messageNum;
		syncJobs.put(new Integer(messageNum).toString(), callBack);

		String msg = "(cusp:eval-and-grab-output \"" + LispUtil.formatCode(message) + "\")";

		try {
			synchronized (callBack) {
				if (emacsRex(msg, pkg)) {
					callBack.wait(timeout);
					LispNode res = callBack.result.getf(":return").getf(":ok");
					if (res.params.size() > 0) {
						return (res.params.get(1).value);
					} else {
						return "";
					}
				} else {
					return "";
				}
			} // sync
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		} // catch
	}

	public synchronized void sendRunTests(String pkg, CuspRunnable callBack) {
		registerCallback(callBack);
		lastTestPackage = pkg;
		String msg = "(lisp-unit:run-all-tests " + pkg + ")";
		// msg = "(let ((*standard-output* str))"+msg+")";
		// msg = "(with-output-to-string (str) "+msg+"str)";
		msg = "(cusp:eval-and-grab-output \"" + msg + "\")";

		emacsRex(msg, "COMMON-LISP-USER");
	}

	public synchronized void sendDebug(String commandNum, String sldbLevel, String threadId, CuspRunnable callBack) {
		registerCallback(callBack);
		String msg = "(cusp:invoke-nth-restart-for-emacs " + sldbLevel + " " + commandNum + ")";

		emacsRexWithThread(msg, threadId);
	}

	public synchronized void sendAbortDebug(CuspRunnable callBack) {
		registerCallback(callBack);
		String msg = "(cusp:sdbl-abort)";

		emacsRex(msg, getPackage());
	}

	public synchronized void sendContinueDebug(CuspRunnable callBack) {
		registerCallback(callBack);
		String msg = "(cusp:sdbl-continue)";

		emacsRex(msg);
	}

	public synchronized void sendQuitDebug(CuspRunnable callBack, String threadId) {
		registerCallback(callBack);
		String msg = "(cusp:throw-to-toplevel)";

		emacsRexWithThread(msg, threadId);
	}

	// Stepping related

	public synchronized void sendStepDebug(CuspRunnable callBack, String threadId) {
		registerCallback(callBack);
		String msg = "(cusp:sldb-step 0)";

		emacsRexWithThread(msg, threadId);
	}

	// Inspection related

	public synchronized void sendInspectReplResult(String num, CuspRunnable callBack) {
		registerCallback(callBack);
		String msg = "(cusp:init-inspector \"(cusp:get-repl-result #10r" + num + ")\" )";

		emacsRex(msg);
	}

	public synchronized void sendInspectInspectedPart(String partNum, CuspRunnable callBack) {
		registerCallback(callBack);
		String msg = "(cusp:inspect-nth-part " + partNum + ")";

		emacsRex(msg);
	}

	public synchronized void sendInspectorPop(CuspRunnable callBack) {
		registerCallback(callBack);
		String msg = "(cusp:inspector-pop)";
		emacsRex(msg);
	}

	public synchronized void sendInspectorNext(CuspRunnable callBack) {
		registerCallback(callBack);
		String msg = "(cusp:inspector-next)";
		emacsRex(msg);
	}

	public synchronized void sendInspectFrameLocal(String threadNum, String frameNum, String varNum,
			CuspRunnable callBack) {
		registerCallback(callBack);
		String msg = "(cusp::inspect-frame-var " + frameNum + " " + varNum + ")";

		emacsRexWithThread(msg, threadNum);
	}

	// Debug related

	public synchronized void sendGetFrameLocals(String frameNum, String threadId, CuspRunnable callBack) {
		registerCallback(callBack);
		String msg = "(cusp::frame-locals-for-emacs " + frameNum + ")";

		emacsRexWithThread(msg, threadId);
	}

	public synchronized void sendGetFrameSourceLocation(String frameNum, String threadId, CuspRunnable callBack) {
		registerCallback(callBack);
		String msg = "(cusp:frame-source-location-for-emacs " + frameNum + ")";

		emacsRexWithThread(msg, threadId);
	}

	public synchronized void sendDisassemble(String symbol, String pkg, CuspRunnable callBack) {
		registerCallback(callBack);
		String msg = "(cusp:disassemble-symbol \"" + symbol + "\")";

		emacsRex(msg, pkg);
	}

	public synchronized void sendReadString(String input, CuspRunnable callBack, String num1, String num2) {
		registerCallback(callBack);
		String msg = "(:emacs-return-string " + num1 + " " + num2 + " \"" + LispUtil.formatCode(input) + "\")";

		sendRaw(msg);
	}

	public synchronized void sendFindDefinitions(String symbol, String pkg, CuspRunnable callBack) {
		registerCallback(callBack);
		String msg = "(cusp:find-definitions-for-emacs \"" + LispUtil.formatCode(symbol) + "\")";

		emacsRex(msg, pkg);
	}

	public synchronized void sendUndefine(String symbol, String pkg, CuspRunnable callBack) {
		registerCallback(callBack);
		String msg = "(cusp:undefine-function \"" + LispUtil.formatCode(symbol) + "\")";

		emacsRex(msg, pkg);
	}

	public synchronized void sendUndefineTest(String symbol, String pkg, CuspRunnable callBack) {
		registerCallback(callBack);
		lastTestPackage = pkg;
		String msg = "(lisp-unit:remove-tests '(" + pkg + "::" + LispUtil.formatCode(symbol) + ") '" + pkg + ")";
		// msg = "(let ((*standard-output* str))"+msg+")";
		// msg = "(with-output-to-string (str) "+msg+"str)";
		msg = "(cusp:eval-and-grab-output \"" + msg + "\")";

		emacsRex(msg, "COMMON-LISP-USER");
	}

	public synchronized void sendInterrupt(CuspRunnable callBack) {
		registerCallback(callBack);
		String msg = "(:emacs-interrupt :repl-thread)\n";

		sendRaw(msg);
	}

	// Threads

	public synchronized void sendListThreads(CuspRunnable callBack) {
		registerCallback(callBack);
		emacsRex("(cusp:list-threads)");
	}

	public synchronized void sendDebugThread(String threadNum, CuspRunnable callBack) {
		registerCallback(callBack);
		String msg = "(cusp:debug-nth-thread " + threadNum + ")";

		emacsRex(msg);
	}

	public synchronized void sendKillThread(String threadNum, CuspRunnable callBack) {
		registerCallback(callBack);
		String msg = "(cusp:kill-nth-thread " + threadNum + ")";

		emacsRex(msg);
	}

	public synchronized void sendApropos(String regex, CuspRunnable callBack) {
		registerCallback(callBack);
		// Need to protect against these, as they send lisp into an endless loop.
		// Probably others do as well, but these I know about.
		if (regex.equals("+")) {
			regex = "\\+";
		} else if (regex.equals("*")) {
			regex = "\\*";
		}
		String msg = "(cusp:apropos-list-for-emacs \"" + LispUtil.formatCode(regex) + "\" t nil)";

		emacsRex(msg);
	}

	public synchronized void sendMacroExpand(String code, CuspRunnable callBack, boolean all, String pckg) {
		registerCallback(callBack);
		String msg;
		if (all) {
			msg = "(cusp:cusp-macroexpand-all \"" + LispUtil.formatCode(code) + "\")";
		} else {
			msg = "(cusp:cusp-macroexpand-1 \"" + LispUtil.formatCode(code) + "\")";
		}

		emacsRex(msg, pckg);
	}

	// Compiling

	public synchronized void sendCompileString(String expr, String file, String dir, int offset, String pckg,
			CuspRunnable callBack) {
		registerCallback(callBack);
		System.out.println(file);
		System.out.println(dir);
		dir = implementation.translateLocalFilePath(dir);
		String msg = "(cusp:compile-string-for-emacs \"" + LispUtil.formatCode(expr) + "\" \""
				+ LispUtil.formatCode(dir + file) + "\" " + (offset + 1) + " \"" + LispUtil.formatCode(dir)
				+ "\" '((cl::debug . 3)))"; // 3 = debug level
		if (pckg.equalsIgnoreCase("nil")) {
			emacsRex(msg);
		} else {
			emacsRex(msg, pckg);
		}
	}

	public synchronized void sendCompileFile(String filePath, CuspRunnable callBack) {
		registerCallback(callBack);
		filePath = filePath.replace('\\', '/');
		filePath = implementation.translateLocalFilePath(filePath);
		String msg = "(cusp:compile-file-for-emacs \"" + filePath + "\" t)";

		emacsRex(msg);
	}

	public void compileAndLoadAsd(IFile file, boolean switchToPackage) {
		if (file == null) {
			return;
		}
		String fext = file.getFileExtension();
		if (fext == null || !fext.equalsIgnoreCase("asd")) {
			return;
		}
		String fullpath = file.getLocation().toString();
		String fname = file.getName();
		String path = fullpath.substring(0, fullpath.length() - fname.length());
		String name = fname.substring(0, fname.length() - ".asd".length());
		if (fext != null && fext.equalsIgnoreCase("asd")) {
			registerLibPath(path);
			registerCallback(new LispBuilder.CompileListener(true, fullpath, switchToPackage));
			String msg = "(cusp:operate-on-system-for-emacs \"" + name + "\" \"LOAD-OP\")";
			emacsRex(msg);
		}

	}

	public synchronized void sendLoadASDFtoRemove(String fileFullPath, CuspRunnable callBack) {
		fileFullPath = fileFullPath.replace('\\', '/');
		fileFullPath = implementation.translateLocalFilePath(fileFullPath);
		String[] fpathparts = fileFullPath.split("/");
		if (fpathparts.length > 0 && fpathparts[fpathparts.length - 1].matches(".+\\.asd")) {
			registerCallback(callBack);
			String asdName = fpathparts[fpathparts.length - 1].replace(".asd", "");
			// Note from Tim:
			// I changed this back, because the newer implementation assumed
			// that (load ...) will get done in two seconds, which is a false
			// assumption, particularly on most of my pet projects.
			// If you want to alter this, you'll need to make sure the
			// load-op command is not issued until load is done.
			// Might need some callback-fu.
			String msg = "(cl:progn (cl:load \"" + fileFullPath + "\") (asdf:oos 'asdf:load-op \"" + asdName + "\"))";

			emacsRex(msg);
		}
		// old version of code:
		/*
		 * fileFullPath = fileFullPath.replace('\\', '/'); fileFullPath =
		 * implementation.translateLocalFilePath(fileFullPath); String[] fpathparts =
		 * fileFullPath.split("/"); if( fpathparts.length > 0 &&
		 * fpathparts[fpathparts.length-1].matches(".+\\.asd") ){ String tmp =
		 * sendEvalAndGrab("(load \"" + fileFullPath + "\")",2000); String asdName =
		 * fpathparts[fpathparts.length-1].replace(".asd", ""); registerCallback(new
		 * CompileRunnable(callBack)); String msg =
		 * "(cusp:operate-on-system-for-emacs \"" + asdName + "\" \"LOAD-OP\")";
		 * emacsRex(msg); }
		 */

	}

	public synchronized void sendLoadPackage(String pkg) {
		sendEvalAndGrab("(asdf:operate 'asdf:load-op :" + pkg + ")", 3000);
	}

	public synchronized void sendGetConnectionInfoStartup(CuspRunnable callBack) {
		registerCallback(callBack);
		String msg = "(cusp:connection-info)";

		emacsRexStartup(msg);
	}

	public synchronized void sendGetConnectionInfo(CuspRunnable callBack) {
		registerCallback(callBack);
		String msg = "(cusp:connection-info)";

		emacsRex(msg);
	}

	public synchronized void sendGetAvailablePackages(CuspRunnable callBack) {
		registerCallback(callBack);
		String msg = "(cusp:list-all-package-names t)";

		emacsRex(msg);
	}

	public synchronized ArrayList<String> getAvailablePackages(long timeout) {
		SyncCallback callback = new SyncCallback();
		++messageNum;
		syncJobs.put(new Integer(messageNum).toString(), callback);

		java.util.ArrayList<String> packageNames = new java.util.ArrayList<String>();

		try {
			synchronized (callback) {
				if (emacsRex("(cusp:list-all-package-names t)")) {
					callback.wait(timeout);
					LispNode packages = callback.result.getf(":return").getf(":ok");
					for (LispNode p : packages.params) {
						packageNames.add(p.value);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return packageNames;
	}

	public synchronized ArrayList<String> getPackagesWithTests(long timeout) {
		if (useUnitTest) {

			SyncCallback callback = new SyncCallback();
			++messageNum;
			syncJobs.put(new Integer(messageNum).toString(), callback);

			java.util.ArrayList<String> packageNames = new java.util.ArrayList<String>();

			String res = sendEvalAndGrab("(let ((res '())) (dolist (pkg (cusp:list-all-package-names t) res)"
					+ "(if (lisp-unit:get-tests pkg) (push pkg res))))", "COMMON-LISP-USER", timeout);
			LispNode resnode = LispParser.parse(res).get(0);
			for (LispNode p : resnode.params) {
				packageNames.add(p.value);
			}
			return packageNames;
		} else {
			return null;
		}
	}

	public synchronized void sendGetInstalledPackages(CuspRunnable callBack) {
		if (managePackages) {
			registerCallback(callBack);
			String msg = "(cusp:eval-and-grab-output \"" + LispUtil.formatCode("(get-installed-packages)") + "\")";
			emacsRex(msg, "com.gigamonkeys.asdf-extensions");
		} else {
			callBack.result = null;
			callBack.run();
		}
	}

	public synchronized LispNode getInstalledPackages(long timeout) {
		if (managePackages) {

			SyncCallback callback = new SyncCallback();
			++messageNum;
			syncJobs.put(new Integer(messageNum).toString(), callback);

			String res = sendEvalAndGrab("(get-installed-packages)", "com.gigamonkeys.asdf-extensions", timeout);
			LispNode resnode = LispParser.parse(res);
			return resnode;
		} else {
			return null;
		}
	}

	// X-ref

	public synchronized void sendGetCallers(String functionName, String pkg, CuspRunnable callBack) {
		registerCallback(callBack);
		emacsRex("(cusp:xref (quote :callers) (quote \"" + LispUtil.formatCode(functionName) + "\"))", pkg);
	}

	public synchronized void sendGetCallees(String functionName, String pkg, CuspRunnable callBack) {
		registerCallback(callBack);
		emacsRex("(cusp:xref (quote :callees) (quote \"" + LispUtil.formatCode(functionName) + "\"))", pkg);
	}

	// Profiling

	public synchronized void sendToggleProfileFunction(String functionName, String pkg, CuspRunnable callBack) {
		registerCallback(callBack);
		String msg = "(cusp:toggle-profile-fdefinition \"" + LispUtil.formatCode(functionName) + "\")";
		emacsRex(msg, pkg);
	}

	public synchronized void sendReportProfile(CuspRunnable callBack) {
		registerCallback(callBack);
		emacsRex("(cusp:profile-report)");
		// FIXME: for some reason the report is shown only after something
		// else is evaluated
		emacsRex("(cusp:listener-eval \"nil\")");
	}

	public synchronized void sendProfileReset(CuspRunnable callBack) {
		registerCallback(callBack);
		emacsRex("(cusp:profile-reset)");
	}

	// Message and response/reply management:

	public String fetchDisplayText() {
		return displayListener.fetchText();
	}

	public synchronized boolean emacsRex(String message) {
		return emacsRexWithThread(message, ":repl-thread");
	}

	public synchronized boolean emacsCreateRepl() {
		String msg = "(:emacs-rex (cusp:create-repl nil) nil t " + messageNum + ")";
		return emacsRexWithThread("(cusp:create-repl nil)", "t");
	}

	public synchronized boolean emacsRexStartup(String message) {
		return emacsRexWithThread(message, "t");
	}

	public synchronized boolean emacsRexStartup(String message, String pkg) {
		return emacsRexWithThread(message, pkg, "t");
	}

	public synchronized boolean emacsRex(String message, String pkg) {
		return emacsRexWithThread(message, pkg, ":repl-thread");
	}

	public synchronized boolean emacsRexWithThread(String message, String threadId) {
		String msg = "(:emacs-rex " + message + " nil " + threadId + " " + messageNum + ")";

		return sendRaw(msg);
	}

	public synchronized boolean emacsRexWithThread(String message, String pkg, String threadId) {
		String msg = "(:emacs-rex " + message + " " + LispUtil.cleanPackage(pkg) + " " + threadId + " " + messageNum
				+ ")";

		return sendRaw(msg);
	}

	protected synchronized void sendPong(String n1, String n2) {
		String msg = "(:emacs-pong " + n1 + " " + n2 + ")";
		sendRaw(msg);
	}

	public synchronized boolean sendRaw(String message) {
		// message = message + "\n";
		System.out.println("-->" + message);
		try {
			if (out != null) {
				// Messages are prepending by their length, given as a 6-char string
				// which is a hexadecimal number. It tells you how many bytes to read
				// and hexadecimal expresses a larger range than decimal (and who's
				// going to read 16M?)
				String hexLen = Integer.toHexString(message.length());

				switch (hexLen.length()) {
				case 1:
					out.write('0');
				case 2:
					out.write('0');
				case 3:
					out.write('0');
				case 4:
					out.write('0');
				case 5:
					out.write('0');
				}
				
				out.writeBytes(hexLen);
				out.write(message.getBytes("UTF-8"));
				out.flush();
			} else {
				return false;
			}
		} catch (IOException e) {
			signalListeners(disconnectListeners, new LispNode());
			e.printStackTrace();
			return false;
		}
		return true;
	}

	private void signalResponse(LispNode reply) {
		String jobNum = reply.get(reply.params.size() - 1).value;
		Object r = jobs.get(jobNum);
		if (r != null) {
			CuspRunnable runnable = (CuspRunnable) r;
			runnable.result = reply;
			Display.getDefault().asyncExec(runnable);
			jobs.remove(jobNum);
		} else {
			SyncCallback sync = syncJobs.get(jobNum);
			if (sync != null) {
				sync.result = reply;
				syncJobs.remove(jobNum);
				synchronized (sync) {
					sync.notifyAll();
				}
			} // if
		} // else
	}

	private void signalListeners(List<CuspRunnable> listeners, LispNode result) {
		synchronized (listeners) {
			for (CuspRunnable l : listeners) {
				CuspRunnable runnable = l.clone();
				runnable.result = result;
				// runnable.resultString = result.value;
				Display.getDefault().asyncExec(runnable);
			}
		}
	}

	private class ListenerThread extends Thread {
		private abstract class ListenerDispatch {
			public abstract void func(LispNode node);
		}

		private BufferedReader in;
		public boolean running = true;
		private Hashtable<String, ListenerDispatch> dispatch = new Hashtable<String, ListenerDispatch>();

		public ListenerThread(InputStream stream) {
			super("Cusp Listener");

			try {
				in = new BufferedReader(new InputStreamReader(stream, "UTF-8"));
			} catch (UnsupportedEncodingException e) {
				System.out.println("Could not load UTF-8 character set -- something seriously wrong....");
				e.printStackTrace();
				throw new IllegalStateException(
						"Could not initialize cusp listener -- UTF-8 character set not available.", e);
			}

			// You would think that there's an easier way to fill the Hashtable,
			// but... put the special case handler actions in the dispatch hash
			// table:
			ListenerDispatch default_dispatch = new ListenerDispatch() {
				public void func(LispNode node) {
					signalResponse(node);
				}
			};

			dispatch.put(":ping", new ListenerDispatch() {
				public void func(LispNode node) {
					sendPong(node.get(1).value, node.get(2).value);
				}
			});
			dispatch.put(":debug-activate", new ListenerDispatch() {
				public void func(LispNode node) {
					signalListeners(debugListeners, node);
				}
			});
			dispatch.put(":debug", new ListenerDispatch() {
				public void func(LispNode node) {
					signalListeners(debugInfoListeners, node);
				}
			});
			dispatch.put(":debug-return", new ListenerDispatch() {
				public void func(LispNode node) {
					signalListeners(debugReturnListeners, node);
				}
			});
			dispatch.put(":read-string", new ListenerDispatch() {
				public void func(LispNode node) {
					signalListeners(readListeners, node);
				}
			});
			dispatch.put(":presentation-start", new ListenerDispatch() {
				public void func(LispNode node) {
					String node1_value = node.get(1).value;
					for (CuspRunnable r : displayListeners) {
						((CuspDisplayRunnable) r).startPresentation(node1_value);
					}
				}
			});
			dispatch.put(":presentation-end", new ListenerDispatch() {
				public void func(LispNode node) {
					for (CuspRunnable r : displayListeners) {
						((CuspDisplayRunnable) r).endPresentation();
					}
				}
			});
			dispatch.put(":write-string", new ListenerDispatch() {
				public void func(LispNode node) {
					signalListeners(displayListeners, node);
				}
			});
			dispatch.put(":indentation-update", new ListenerDispatch() {
				public void func(LispNode node) {
					signalListeners(indentationListeners, node);
				}
			});
			dispatch.put(":return", default_dispatch);
			dispatch.put(":reader-error", default_dispatch);
			dispatch.put(":new-features", default_dispatch);
			dispatch.put(":new-package", default_dispatch);
		}

		private void handle(LispNode node) {
			try {
				ListenerDispatch l = dispatch.get(node.car().value);
				if (l != null)
					l.func(node);
				else
					throw new Exception(
							"Cannot Find Appropriate Listener Dispatch: Likely that the stream has become out of sync!\n"
									+ node.value);
				// System.err.println("** unhandled node type: " + node.toString());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		String totalBuf = "";

		public void run() {
			// Each message is prefixed by a hex length, so create a permanent
			// buffer to receive it:
			char[] lbuf = new char[6];
			// rbuf is the raw reply buffer, initially sized to something reasonable
			// Note: this is reallocated to a larger size as needed to keep the
			// amount of object allocation down to a reasonable minimum.
			char[] rbuf = new char[256];
			// reply is the String version of rbuf.
			String reply = new String();
			int nread = 0;

			keep_running: while (running) {

				try {

					if (true) {

						nread = in.read(lbuf, 0, lbuf.length);
						if (nread < 0) {
							System.out.println("Connection closed");
							signalListeners(disconnectListeners, new LispNode());
							return;
						}

						if (nread != lbuf.length) {
							while (true) {
								int numExtra = in.read(lbuf, nread, lbuf.length - nread);
								if (numExtra < 0) {
									System.out.println("Connection closed");
									signalListeners(disconnectListeners, new LispNode());
									return;
								}
								nread += numExtra;
								if (nread == lbuf.length)
									break;

							}
						}

						String lstring = String.copyValueOf(lbuf, 0, lbuf.length);

						// totalBuf+=lstring;

						int length = Integer.parseInt(lstring, 16);

						if (length > rbuf.length)
							rbuf = new char[length];

						// Because we're sitting on a network socket, there's a good possibility
						// that the reply exceeds the host's localhost MTU, so we need to be aggressive
						// in collecting the entire reply (and tqQQQhere will only be one MTU "in
						// flight"
						// at any given point in time.)
						nread = 0;
						int n = 0;
						do {
							n = in.read(rbuf, nread, length - nread);

							assert n == (length - nread);
							if (n < 0) {
								System.out.println("Connection closed");
								signalListeners(disconnectListeners, new LispNode());
								return;
							}
							nread += n;
						} while (nread < length);

						// Reify the string...
						reply = String.copyValueOf(rbuf, 0, nread);
					}
					System.out.println("<--" + reply);
					System.out.flush();
					if (reply.contains("open-dedicated-output-stream")) {
						StringTokenizer tokens = new StringTokenizer(reply, " )");
						while (tokens.hasMoreTokens()) {
							try {
								String token = tokens.nextToken();
								System.out.println(token);
								int tmp = Integer.parseInt(token);
								System.out.println("secondary:" + tmp);
								secondary = new Socket("localhost", tmp);
								displayListener = new DisplayListenerThread(secondary.getInputStream(), true);
								displayListener.start();
							} catch (Exception e) {
								// e.printStackTrace();
							} // catch
						} // while
					} else {
						// System.out.println("parsing");
						handle(LispParser.parse(reply.substring(1))); // ,reply,totalBuf);
					}
					// if

				} catch (IOException e) {
					e.printStackTrace();					
					signalListeners(disconnectListeners, new LispNode());
					break keep_running;
				}

			} // while
			System.out.println("Done listening");
		}

	} // class

	private class DisplayListenerThread extends Thread {
		private BufferedReader in;
		public boolean running = true;
		private StringBuffer acc;
		private boolean echo;
		// Display listener filters: these are run immediately and separately from
		// Eclipse
		private List<DisplayFilter> filters;
		// Number of accumulated results before syncing with listeners:
		private final int ACCUM_RESULTS = 4;
		// Max size of characters to read from input stream, if available
		// N.B. need to keep this small enough so that stdOut/stdErr interleave in an
		// intelligible manner (i.e. errors are correlated to the previous output.)
		private final int MAX_READ = 8;

		public DisplayListenerThread(InputStream stream, boolean echo_flag) {
			super("Secondary Cusp Listener");
			in = new BufferedReader(new InputStreamReader(stream));
			running = true;
			acc = new StringBuffer();
			echo = echo_flag;
			filters = Collections.synchronizedList(new ArrayList<DisplayFilter>(1));
		}

		public void addFilter(DisplayFilter filter) {
			synchronized (filters) {
				filters.add(filter);
			}
		}

		public void removeFilter(DisplayFilter filter) {
			synchronized (filters) {
				filters.remove(filter);
			}
		}

		private void runFilters(String str) {
			synchronized (filters) {
				for (DisplayFilter f : filters) {
					f.filter(str);
				}
			}
		}

		public String fetchText() {
			synchronized (acc) {
				String ret = acc.toString();
				acc = new StringBuffer();
				return ret;
			}
		}

		public void run() {
			char[] cbuf = new char[MAX_READ];

			while (running) {
				try {
					LispNode result = new LispNode();
					int lines = 0;
					int nread = in.read(cbuf, 0, 1);
					if (nread < 0) {
						System.out.println("Display input pipe closed.");
						return;
					}
					// If we can read one character, we can potentially read more...
					if (in.ready()) {
						int naddl = in.read(cbuf, 1, MAX_READ - 1);
						if (naddl > 0) {
							nread += naddl;
						}
						// N.B., if naddl < 0, we'll catch that next iteration
					}

					synchronized (acc) {
						acc.append(cbuf, 0, nread);
						for (int nl = acc.indexOf("\n"); nl >= 0 && acc.length() > 0; nl = acc.indexOf("\n")) {
							String curr = acc.substring(0, nl);
							acc = acc.delete(0, nl + 1);
							if (echo) {
								result.params.add(new LispNode(":write-string"));
								result.params.add(new LispNode(curr));
								if (lines >= ACCUM_RESULTS) {
									signalListeners(displayListeners, result);
									lines = 0;
									result = new LispNode();
								} else
									lines += 1;
							}
							System.out.print("]");
							System.out.println(curr);
							runFilters(curr);
							if (curr.toLowerCase().contains(implementation.fatalErrorString())) {
								disconnect();
							}
						}
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	} // class

	// Internal abstract class for filtering strings collected by
	// DisplayListenerThread.
	// The primary difference between this and a CuspRunnable is that there is a
	// deterministic guarantee that the filter will be run when the next display
	// line
	// is collected.
	private abstract class DisplayFilter {
		public abstract void filter(String str);
	} // class

	private class CuspStartFilter extends DisplayFilter {
		private boolean got_start_string;

		public CuspStartFilter() {
			got_start_string = false;
		}

		public synchronized boolean getStartStringFlag() {
			return got_start_string;
		}

		public void filter(String str) {
			if (str.contains("Cusp started")) {
				synchronized (this) {
					got_start_string = true;
					notifyAll();
				}
			}
		}
	} // class

} // class
