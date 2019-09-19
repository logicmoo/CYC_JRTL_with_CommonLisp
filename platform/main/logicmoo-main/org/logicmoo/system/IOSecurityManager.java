package org.logicmoo.system;

import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.net.InetAddress;
import java.net.SocketPermission;
import java.security.AccessControlContext;
import java.security.Permission;
import java.security.UnresolvedPermission;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PropertyPermission;
import java.util.Set;
import java.util.StringTokenizer;

/**
 * @author Administrator
 *
 */
public class IOSecurityManager extends SecurityManager {

	final static public WorkQueue workQueue = WorkQueue.getWorkerQueue("IOSecurityManager");

	private static final Class<?>[] PARAMS = new Class[] { String.class, String.class };

	private static final IOSecurityManager delegated = new IOSecurityManager(true);

	static public void execute(Runnable r) {
		workQueue.execute(r);
	}

	private final List<APermission> grantedPermissions;
	private final List<APermission> revokedPermissions;
	private java.security.Permissions granted;
	private SecurityManager origSm;
	private boolean active;
	private final boolean delegateToOldSM;

	public IOSecurityManager() {
		this(false);
	}

	public IOSecurityManager(boolean delegateToOldSM) {
		this.grantedPermissions = new LinkedList();
		this.revokedPermissions = new LinkedList();
		this.granted = null;
		this.origSm = null;
		this.active = false;
		this.delegateToOldSM = delegateToOldSM;
	}

	private boolean accessOK() {
		return true;
	}

	public void addConfiguredGrant(APermission perm) {
		this.grantedPermissions.add(perm);
	}

	public void addConfiguredRevoke(APermission perm) {
		this.revokedPermissions.add(perm);
	}

	@Override
	public void checkAccept(String host, int port) {
		if (permitNetwork())
			return;
		super.checkAccept(host, port);
	}

	@Override
	public void checkAccess(Thread t) {
		if (permitOurs())
			return;
		super.checkAccess(t);
	}

	@Override
	public void checkAccess(ThreadGroup g) {
		if (permitOurs())
			return;
		super.checkAccess(g);
	}

	@Override
	public void checkAwtEventQueueAccess() {
		if (permitOurs())
			return;
		super.checkAwtEventQueueAccess();
	}

	@Override
	public void checkConnect(String host, int port) {
		if (permitNetwork())
			return;
		super.checkConnect(host, port);
	}

	@Override
	public void checkConnect(String host, int port, Object context) {
		if (permitNetwork())
			return;
		super.checkConnect(host, port, context);
	}

	@Override
	public void checkCreateClassLoader() {
		if (permitOurs())
			return;
		super.checkCreateClassLoader();
	}

	@Override
	public void checkDelete(String filename) {
		super.checkDelete(filename);
		checkFilesystemDelete(filename);

	}

	@Override
	public void checkExec(String cmd) {
		checkFilesystemWrite(cmd);
		super.checkExec(cmd);
	}

	/**
	 * Exit is treated in a special way in order to be able to return the exit code
	 * towards tasks.
	 * An ExitException is thrown instead of a simple SecurityException to indicate the exit
	 * code.
	 * Overridden from java.lang.SecurityManager
	 * @param status The exit status requested.
	 */
	@Override
	public void checkExit(final int status) {

		if (Startup.noExit)
			throw new SecurityException("Startup.noExit " + status);

		if (Startup.leanABCL)
			return;

		final java.security.Permission perm = new RuntimePermission("exitVM", null);

		try {
			checkPermission(perm);
		} catch (final SecurityException e) {

			if (permitNetwork())
				return;

			throw new SecurityException(e.getMessage() + ": " + status);
		}
	}

	private void checkFilesystemRead(String filename) {
		if (mayRead != null)
			return;
		if (Startup.leanABCL)
			return;

		super.checkRead(filename);

		if (isOkToRead(filename))
			return;

		if (isCompiler())
			return;

		throw new SecurityException("checkFilesystemRead! " + filename);
	}

	private void checkFilesystemWrite(String filename) {
		if (Startup.leanABCL)
			return;

		super.checkWrite(filename);
		super.checkRead(filename);
		if (isOkToWrite(filename))
			return;

		if (isCompiler())
			return;

		throw new SecurityException("checkFilesystemWrite! " + filename);
	}

	private void checkFilesystemDelete(String filename) {

		filename = canonicalPath(filename);

		super.checkWrite(filename);

		super.checkRead(filename);

		if (isOkToWrite(filename))
			return;

		if (isCompiler())
			return;

		throw new SecurityException("checkFilesystemDelete! " + filename);
	}

	public boolean isOkToRead(String filename) {

		if (Startup.leanABCL)
			return true;

		if (mayRead != null)
			return true;

		filename = canonicalPath(filename);

		if (filename.contains("/../")) {
			return false;
		}

		return true;
	}

	static private String mayRead = null;

	static private boolean allowCompiler = true;

	/**
	 * @param filename
	 * @param f
	 */
	public boolean isOkToWrite(String filename) {
		filename = canonicalPath(filename);
		filename = filename.toLowerCase();
		if (filename.contains("/../"))
			return false;
		if (filename.contains("/tmp/"))
			return true;
		if (filename.contains("/temp/"))
			return true;
		if (filename.contains("/log/"))
			return true;
		if (filename.contains("/logs/"))
			return true;
		if (filename.contains("/work/"))
			return true;
		if (filename.contains("/transcripts/"))
			return true;
		if (filename.contains("/classes/"))
			return true;
		if (filename.contains("/upload/"))
			return true;

		// checkFilesystemRead(filename);
		if (filename.endsWith(".class"))
			return true;
		if (filename.endsWith(".abcl"))
			return true;
		if (filename.endsWith(".cls"))
			return true;
		if (filename.endsWith(".log"))
			return true;
		if (filename.endsWith(".jar"))
			return true;
		if (filename.endsWith(".lisp"))
			return true;
		if (filename.endsWith(".txt"))
			return true;

		if (!Startup.began_init_cyc_server)
			return true;

		if (filename.contains("/."))
			return false;

		return false;
	}

	/**
	 * @param f
	 * @return
	 */
	public static String canonicalPath(String filename) {
		java.io.File f = null;
		String wasMayRead = mayRead;

		try {
			mayRead = filename;
			f = new java.io.File(filename);
		} finally {
			mayRead = wasMayRead;
		}
		try {
			f = f.getCanonicalFile();
		} catch (IOException e) {
			f = f.getAbsoluteFile();
		}
		String p = f.getAbsolutePath();

		if (File.separatorChar != '/')
			p = p.replace(File.separatorChar, '/');

		final boolean isDir = isDirectory(f);
		if (!p.endsWith("/") && isDir)
			p = p + "/";

		//		if (!p.startsWith("/"))
		//			p = "/" + p;

		return p;
	}

	static boolean isCompiler() {
		return allowCompiler;
	}

	// calls check read
	private static boolean exists(File f) {
		String wasMayRead = mayRead;
		try {
			mayRead = f.getPath();
			return f.exists();
		} finally {
			mayRead = wasMayRead;
		}
	}

	// calls check read
	private static boolean isDirectory(File f) {
		String wasMayRead = mayRead;
		try {
			mayRead = f.getPath();
			return f.isDirectory();
		} finally {
			mayRead = wasMayRead;
		}
	}

	@Override
	public void checkLink(String lib) {
		if (permitNetwork())
			return;
		super.checkLink(lib);
	}

	@Override
	public void checkListen(int port) {
		if (permitNetwork())
			return;
		super.checkListen(port);
	}

	@Override
	public void checkMemberAccess(Class<?> clazz, int which) {
		if (permitOurs())
			return;
		super.checkMemberAccess(clazz, which);
	}

	@Override
	public void checkMulticast(InetAddress maddr) {
		if (permitNetwork())
			return;
		super.checkMulticast(maddr);
	}

	@Override
	public void checkMulticast(InetAddress maddr, byte ttl) {
		if (permitNetwork())
			return;
		super.checkMulticast(maddr, ttl);
	}

	@Override
	public void checkPackageAccess(String pkg) {
		if ("java.lang".equals(pkg)) {
			if (permitAll())
				return;
		}
		if (permitOurs())
			return;
		super.checkPackageAccess(pkg);
	}

	@Override
	public void checkPackageDefinition(String pkg) {
		if (permitOurs())
			return;
		super.checkPackageDefinition(pkg);
	}

	/**
	 * Throws a <code>SecurityException</code> if the requested
	 * access, specified by the given permission, is not permitted based
	 * on the security policy currently in effect.
	 * <p>
	 * This method calls <code>AccessController.checkPermission</code>
	 * with the given permission.
	 *
	 * @param     perm   the requested permission.
	 * @exception SecurityException if access is not permitted based on
	 *            the current security policy.
	 * @exception NullPointerException if the permission argument is
	 *            <code>null</code>.
	 * @since     1.2
	 */
	@Override
	public void checkPermission(java.security.Permission perm) {
		if (perm instanceof RuntimePermission) {
			checkRuntimePermision(perm, perm.getName(), perm.getActions(), null);
			return;
		}
		if (permitNetwork())
			return;
		if (active) {
			if (delegateToOldSM && !perm.getName().equals("exitVM")) {
				boolean permOK = false;
				if (granted.implies(perm)) {
					permOK = true;
				}
				checkRevoked(perm);
				/*
				 if the permission was not explicitly granted or revoked
				 the original security manager will do its work
				*/
				if (!permOK && origSm != null) {
					origSm.checkPermission(perm);
				}
			} else {
				if (!granted.implies(perm)) {
					throw new SecurityException("Permission " + perm + " was not granted.");
				}
				checkRevoked(perm);
			}
		}
		super.checkPermission(perm);
	}

	/**
	 * Throws a <code>SecurityException</code> if the
	 * specified security context is denied access to the resource
	 * specified by the given permission.
	 * The context must be a security
	 * context returned by a previous call to
	 * <code>getSecurityContext</code> and the access control
	 * decision is based upon the configured security policy for
	 * that security context.
	 * <p>
	 * If <code>context</code> is an instance of
	 * <code>AccessControlContext</code> then the
	 * <code>AccessControlContext.checkPermission</code> method is
	 * invoked with the specified permission.
	 * <p>
	 * If <code>context</code> is not an instance of
	 * <code>AccessControlContext</code> then a
	 * <code>SecurityException</code> is thrown.
	 *
	 * @param      perm      the specified permission
	 * @param      context   a system-dependent security context.
	 * @exception  SecurityException  if the specified security context
	 *             is not an instance of <code>AccessControlContext</code>
	 *             (e.g., is <code>null</code>), or is denied access to the
	 *             resource specified by the given permission.
	 * @exception  NullPointerException if the permission argument is
	 *             <code>null</code>.
	 * @see        java.lang.SecurityManager#getSecurityContext()
	 * @see java.security.AccessControlContext#checkPermission(java.security.Permission)
	 * @since      1.2
	 */
	public void checkPermission(java.security.Permission perm, Object context) {
		if (perm instanceof RuntimePermission) {
			checkRuntimePermision(perm, perm.getName(), perm.getActions(), context);
			return;
		}
		if (permitAll())
			return;
		if (context instanceof AccessControlContext) {
			((AccessControlContext) context).checkPermission(perm);
		} else {
			throw new SecurityException();
		}
	}

	@Override
	public void checkPrintJobAccess() {
		if (permitNetwork())
			return;
		super.checkPrintJobAccess();
	}

	@Override
	public void checkPropertiesAccess() {
		if (permitNetwork())
			return;

		super.checkPropertiesAccess();
	}

	@Override
	public void checkPropertyAccess(String key) {
		if (permitOurs())
			return;
		super.checkPropertyAccess(key);
	}

	public void checkRead(FileDescriptor filedescriptor) {
		super.checkRead(filedescriptor);
		checkFilesystemRead(nameOf(filedescriptor));

	}

	public void checkRead(String filename) {
		checkFilesystemRead(filename);
		super.checkRead(filename);
	}

	public void checkRead(String filename, Object executionContext) {
		checkFilesystemRead(filename);
		super.checkRead(filename, executionContext);
	}

	/**
	 * throws an exception if this permission is revoked
	 * @param perm the permission being checked
	 */
	private void checkRevoked(final java.security.Permission perm) {
		for (final APermission revoked : revokedPermissions) {
			if (revoked.matches(perm)) {
				throw new SecurityException("Permission " + perm + " was revoked.");
			}
		}
	}

	/**
	 * This class is for runtime permissions. A RuntimePermission
	 * contains a name (also referred to as a "target name") but
	 * no actions list; you either have the named permission
	 * or you don't.
	 *
	 * <P>
	 * The target name is the name of the runtime permission (see below). The
	 * naming convention follows the  hierarchical property naming convention.
	 * Also, an asterisk
	 * may appear at the end of the name, following a ".", or by itself, to
	 * signify a wildcard match. For example: "loadLibrary.*" and "*" signify a
	 * wildcard match, while "*loadLibrary" and "a*b" do not.
	 * <P>
	 * The following table lists all the possible RuntimePermission target names,
	 * and for each provides a description of what the permission allows
	 * and a discussion of the risks of granting code the permission.
	 *
	 * <table border=1 cellpadding=5 summary="permission target name,
	 *  what the target allows,and associated risks">
	 * <tr>
	 * <th>Permission Target Name</th>
	 * <th>What the Permission Allows</th>
	 * <th>Risks of Allowing this Permission</th>
	 * </tr>
	 *
	 * <tr>
	 *   <td>createClassLoader</td>
	 *   <td>Creation of a class loader</td>
	 *   <td>This is an extremely dangerous permission to grant.
	 * Malicious applications that can instantiate their own class
	 * loaders could then load their own rogue classes into the system.
	 * These newly loaded classes could be placed into any protection
	 * domain by the class loader, thereby automatically granting the
	 * classes the permissions for that domain.</td>
	 * </tr>
	 *
	 * <tr>
	 *   <td>getClassLoader</td>
	 *   <td>Retrieval of a class loader (e.g., the class loader for the calling
	 * class)</td>
	 *   <td>This would grant an attacker permission to get the
	 * class loader for a particular class. This is dangerous because
	 * having access to a class's class loader allows the attacker to
	 * load other classes available to that class loader. The attacker
	 * would typically otherwise not have access to those classes.</td>
	 * </tr>
	 *
	 * <tr>
	 *   <td>setContextClassLoader</td>
	 *   <td>Setting of the context class loader used by a thread</td>
	 *   <td>The context class loader is used by system code and extensions
	 * when they need to lookup resources that might not exist in the system
	 * class loader. Granting setContextClassLoader permission would allow
	 * code to change which context class loader is used
	 * for a particular thread, including system threads.</td>
	 * </tr>
	 *
	 * <tr>
	 *   <td>enableContextClassLoaderOverride</td>
	 *   <td>Subclass implementation of the thread context class loader methods</td>
	 *   <td>The context class loader is used by system code and extensions
	 * when they need to lookup resources that might not exist in the system
	 * class loader. Granting enableContextClassLoaderOverride permission would allow
	 * a subclass of Thread to override the methods that are used
	 * to get or set the context class loader for a particular thread.</td>
	 * </tr>
	 *
	 * <tr>
	 *   <td>closeClassLoader</td>
	 *   <td>Closing of a ClassLoader</td>
	 *   <td>Granting this permission allows code to close any URLClassLoader
	 * that it has a reference to.</td>
	 * </tr>
	 *
	 * <tr>
	 *   <td>setSecurityManager</td>
	 *   <td>Setting of the security manager (possibly replacing an existing one)
	 * </td>
	 *   <td>The security manager is a class that allows
	 * applications to implement a security policy. Granting the setSecurityManager
	 * permission would allow code to change which security manager is used by
	 * installing a different, possibly less restrictive security manager,
	 * thereby bypassing checks that would have been enforced by the original
	 * security manager.</td>
	 * </tr>
	 *
	 * <tr>
	 *   <td>createSecurityManager</td>
	 *   <td>Creation of a new security manager</td>
	 *   <td>This gives code access to protected, sensitive methods that may
	 * disclose information about other classes or the execution stack.</td>
	 * </tr>
	 *
	 * <tr>
	 *   <td>getenv.{variable name}</td>
	 *   <td>Reading of the value of the specified environment variable</td>
	 *   <td>This would allow code to read the value, or determine the
	 *       existence, of a particular environment variable.  This is
	 *       dangerous if the variable contains confidential data.</td>
	 * </tr>
	 *
	 * <tr>
	 *   <td>exitVM.{exit status}</td>
	 *   <td>Halting of the Java Virtual Machine with the specified exit status</td>
	 *   <td>This allows an attacker to mount a denial-of-service attack
	 * by automatically forcing the virtual machine to halt.
	 * Note: The "exitVM.*" permission is automatically granted to all code
	 * loaded from the application class path, thus enabling applications
	 * to terminate themselves. Also, the "exitVM" permission is equivalent to
	 * "exitVM.*".</td>
	 * </tr>
	 *
	 * <tr>
	 *   <td>shutdownHooks</td>
	 *   <td>Registration and cancellation of virtual-machine shutdown hooks</td>
	 *   <td>This allows an attacker to register a malicious shutdown
	 * hook that interferes with the clean shutdown of the virtual machine.</td>
	 * </tr>
	 *
	 * <tr>
	 *   <td>setFactory</td>
	 *   <td>Setting of the socket factory used by ServerSocket or Socket,
	 * or of the stream handler factory used by URL</td>
	 *   <td>This allows code to set the actual implementation
	 * for the socket, server socket, stream handler, or RMI socket factory.
	 * An attacker may set a faulty implementation which mangles the data
	 * stream.</td>
	 * </tr>
	 *
	 * <tr>
	 *   <td>setIO</td>
	 *   <td>Setting of System.out, System.in, and System.err</td>
	 *   <td>This allows changing the value of the standard system streams.
	 * An attacker may change System.in to monitor and
	 * steal user input, or may set System.err to a "null" OutputStream,
	 * which would hide any error messages sent to System.err. </td>
	 * </tr>
	 *
	 * <tr>
	 *   <td>modifyThread</td>
	 *   <td>Modification of threads, e.g., via calls to Thread
	 * <tt>interrupt</tt>, <tt>stop</tt>, <tt>suspend</tt>,
	 * <tt>resume</tt>, <tt>setDaemon</tt>, <tt>setPriority</tt>,
	 * <tt>setName</tt> and <tt>setUncaughtExceptionHandler</tt>
	 * methods</td>
	 * <td>This allows an attacker to modify the behaviour of
	 * any thread in the system.</td>
	 * </tr>
	 *
	 * <tr>
	 *   <td>stopThread</td>
	 *   <td>Stopping of threads via calls to the Thread <code>stop</code>
	 * method</td>
	 *   <td>This allows code to stop any thread in the system provided that it is
	 * already granted permission to access that thread.
	 * This poses as a threat, because that code may corrupt the system by
	 * killing existing threads.</td>
	 * </tr>
	 *
	 * <tr>
	 *   <td>modifyThreadGroup</td>
	 *   <td>modification of thread groups, e.g., via calls to ThreadGroup
	 * <code>destroy</code>, <code>getParent</code>, <code>resume</code>,
	 * <code>setDaemon</code>, <code>setMaxPriority</code>, <code>stop</code>,
	 * and <code>suspend</code> methods</td>
	 *   <td>This allows an attacker to create thread groups and
	 * set their run priority.</td>
	 * </tr>
	 *
	 * <tr>
	 *   <td>getProtectionDomain</td>
	 *   <td>Retrieval of the ProtectionDomain for a class</td>
	 *   <td>This allows code to obtain policy information
	 * for a particular code source. While obtaining policy information
	 * does not compromise the security of the system, it does give
	 * attackers additional information, such as local filename names for
	 * example, to better aim an attack.</td>
	 * </tr>
	 *
	 * <tr>
	 *   <td>getFileSystemAttributes</td>
	 *   <td>Retrieval of filename system attributes</td>
	 *   <td>This allows code to obtain filename system information such as disk usage
	 *       or disk space available to the caller.  This is potentially dangerous
	 *       because it discloses information about the system hardware
	 *       configuration and some information about the caller's privilege to
	 *       write files.</td>
	 * </tr>
	 *
	 * <tr>
	 *   <td>readFileDescriptor</td>
	 *   <td>Reading of filename descriptors</td>
	 *   <td>This would allow code to read the particular filename associated
	 *       with the filename descriptor read. This is dangerous if the filename
	 *       contains confidential data.</td>
	 * </tr>
	 *
	 * <tr>
	 *   <td>writeFileDescriptor</td>
	 *   <td>Writing to filename descriptors</td>
	 *   <td>This allows code to write to a particular filename associated
	 *       with the descriptor. This is dangerous because it may allow
	 *       malicious code to plant viruses or at the very least, fill up
	 *       your entire disk.</td>
	 * </tr>
	 *
	 * <tr>
	 *   <td>loadLibrary.{library name}</td>
	 *   <td>Dynamic linking of the specified library</td>
	 *   <td>It is dangerous to allow an applet permission to load native code
	 * libraries, because the Java security architecture is not designed to and
	 * does not prevent malicious behavior at the level of native code.</td>
	 * </tr>
	 *
	 * <tr>
	 *   <td>accessClassInPackage.{package name}</td>
	 *   <td>Access to the specified package via a class loader's
	 * <code>loadClass</code> method when that class loader calls
	 * the SecurityManager <code>checkPackageAccess</code> method</td>
	 *   <td>This gives code access to classes in packages
	 * to which it normally does not have access. Malicious code
	 * may use these classes to help in its attempt to compromise
	 * security in the system.</td>
	 * </tr>
	 *
	 * <tr>
	 *   <td>defineClassInPackage.{package name}</td>
	 *   <td>Definition of classes in the specified package, via a class
	 * loader's <code>defineClass</code> method when that class loader calls
	 * the SecurityManager <code>checkPackageDefinition</code> method.</td>
	 *   <td>This grants code permission to define a class
	 * in a particular package. This is dangerous because malicious
	 * code with this permission may define rogue classes in
	 * trusted packages like <code>java.security</code> or <code>java.lang</code>,
	 * for example.</td>
	 * </tr>
	 *
	 * <tr>
	 *   <td>accessDeclaredMembers</td>
	 *   <td>Access to the declared members of a class</td>
	 *   <td>This grants code permission to query a class for its public,
	 * protected, default (package) access, and private fields and/or
	 * methods. Although the code would have
	 * access to the private and protected field and method names, it would not
	 * have access to the private/protected field data and would not be able
	 * to invoke any private methods. Nevertheless, malicious code
	 * may use this information to better aim an attack.
	 * Additionally, it may invoke any public methods and/or access public fields
	 * in the class.  This could be dangerous if
	 * the code would normally not be able to invoke those methods and/or
	 * access the fields  because
	 * it can't cast the object to the class/interface with those methods
	 * and fields.
	</td>
	 * </tr>
	 * <tr>
	 *   <td>queuePrintJob</td>
	 *   <td>Initiation of a print job request</td>
	 *   <td>This could print sensitive information to a printer,
	 * or simply waste paper.</td>
	 * </tr>
	 *
	 * <tr>
	 *   <td>getStackTrace</td>
	 *   <td>Retrieval of the stack trace information of another thread.</td>
	 *   <td>This allows retrieval of the stack trace information of
	 * another thread.  This might allow malicious code to monitor the
	 * execution of threads and discover vulnerabilities in applications.</td>
	 * </tr>
	 *
	 * <tr>
	 *   <td>setDefaultUncaughtExceptionHandler</td>
	 *   <td>Setting the default handler to be used when a thread
	 *   terminates abruptly due to an uncaught exception</td>
	 *   <td>This allows an attacker to register a malicious
	 *   uncaught exception handler that could interfere with termination
	 *   of a thread</td>
	 * </tr>
	 *
	 * <tr>
	 *   <td>preferences</td>
	 *   <td>Represents the permission required to get access to the
	 *   java.util.prefs.Preferences implementations user or system root
	 *   which in turn allows retrieval or update operations within the
	 *   Preferences persistent backing store.) </td>
	 *   <td>This permission allows the user to read from or write to the
	 *   preferences backing store if the user running the code has
	 *   sufficient OS privileges to read/write to that backing store.
	 *   The actual backing store may reside within a traditional filesystem
	 *   directory or within a registry depending on the platform OS</td>
	 * </tr>
	 *
	 * <tr>
	 *   <td>usePolicy</td>
	 *   <td>Granting this permission disables the Java Plug-In's default
	 *   security prompting behavior.</td>
	 *   <td>For more information, refer to Java Plug-In's guides, <a href=
	 *   "../../../technotes/guides/plugin/developer_guide/security.html">
	 *   Applet Security Basics</a> and <a href=
	 *   "../../../technotes/guides/plugin/developer_guide/rsa_how.html#use">
	 *   usePolicy Permission</a>.</td>
	 * </tr>
	 * </table>
	 *
	 * @see java.security.BasicPermission
	 * @see java.security.Permission
	 * @see java.security.Permissions
	 * @see java.security.PermissionCollection
	 * @see java.lang.SecurityManager
	 *
	 * @param perm
	 * @param name
	 * @param actions
	 * @param context
	 */
	public void checkRuntimePermision(Permission perm, String name, String actions, Object context) {
		if (name == null)
			throw new NullPointerException("checkRuntimePermision");
		if (name.equals("setIO")) {
			workQueue.execute((() -> SystemCurrent.recheckStdIO()));
			return;
		}
		if (true)
			return;

		if ("accessDeclaredMembers".equals(name)) {
			return;
		}
		if ("getClassLoader".equals(name)) {
			return;
		}
		if ("getStackTrace".equals(name)) {
			return;
		}
		if ("setContextClassLoader".equals(name)) {
			return;
		}

		String p = "'" + name + "' '" + actions + "' '" + context + "'";
		System.err.println("crtp: " + p);
		if (name != null) {
			if ("accessClassInPackage".equals(name)) {
				return;
			}
			if ("shutdownHooks".equals(name)) {
				return;
			}
			if ("setSecurityManager".equals(name)) {
				throw new SecurityException(p);
			}
		}
		if (name.equals("setIO")) {
			workQueue.execute((() -> SystemCurrent.recheckStdIO()));
			return;
		}
		if (true)
			return;
		Thread.dumpStack();
		SystemCurrent.setupIO();
		if (context instanceof AccessControlContext) {
			if (permitAll())
				return;
			((AccessControlContext) context).checkPermission(perm);
		} else {
			throw new SecurityException();
		}
	}

	@Override
	public void checkSecurityAccess(String target) {
		if (permitNetwork())
			return;
		super.checkSecurityAccess(target);
	}

	@Override
	public void checkSetFactory() {
		if (permitNetwork())
			return;
		super.checkSetFactory();
	}

	@Override
	public void checkSystemClipboardAccess() {
		if (permitNetwork())
			return;
		super.checkSystemClipboardAccess();
	}

	@Override
	public boolean checkTopLevelWindow(Object window) {
		if (permitNetwork())
			return true;
		return super.checkTopLevelWindow(window);
	}

	public void checkWrite(FileDescriptor filedescriptor) {
		super.checkWrite(filedescriptor);
		// checkFilesystemWrite(nameOf(filedescriptor));

	}

	public void checkWrite(String filename) {
		checkFilesystemWrite(filename);

	}

	@Override
	protected int classDepth(String name) {
		return super.classDepth(name);
	}

	@Override
	protected int classLoaderDepth() {
		return super.classLoaderDepth();
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	private java.security.Permission createPermission(APermission permission) {
		try {
			Class<? extends java.security.Permission> clazz = Class.forName(permission.getClassName()).asSubclass(java.security.Permission.class);
			String name = permission.getName();
			String actions = permission.getActions();
			Constructor<? extends java.security.Permission> ctr = clazz.getConstructor(PARAMS);
			return (java.security.Permission) ctr.newInstance(name, actions);
		} catch (Exception var6) {
			return new UnresolvedPermission((String) permission.getClassName(), permission.getName(), permission.getActions(), (java.security.cert.Certificate[]) null);
		}
	}

	@Override
	protected ClassLoader currentClassLoader() {
		return super.currentClassLoader();
	}

	@Override
	protected Class<?> currentLoadedClass() {
		return super.currentLoadedClass();
	}

	@Override
	protected void finalize() throws Throwable {
		restoreSecurityManager();
		super.finalize();
	}

	@Override
	protected Class[] getClassContext() {
		return super.getClassContext();
	}

	@Override
	public boolean getInCheck() {
		return super.getInCheck();
	}

	@Override
	public Object getSecurityContext() {
		return super.getSecurityContext();
	}

	@Override
	public ThreadGroup getThreadGroup() {
		return super.getThreadGroup();
	}

	@Override
	protected boolean inClass(String name) {
		return super.inClass(name);
	}

	@Override
	protected boolean inClassLoader() {
		return super.inClassLoader();
	}

	private void init() {
		this.granted = new java.security.Permissions();
		Iterator var1 = this.revokedPermissions.iterator();

		APermission p;
		do {
			if (!var1.hasNext()) {
				var1 = this.grantedPermissions.iterator();

				while (var1.hasNext()) {
					p = (APermission) var1.next();
					if (p.getClassName() == null) {
						throw new RuntimeException("Granted permission " + p + " does not contain a class.");
					}

					java.security.Permission perm = this.createPermission(p);
					this.granted.add(perm);
				}

				this.granted.add(new SocketPermission("localhost:1024-", "listen"));
				this.granted.add(new PropertyPermission("java.version", "read"));
				this.granted.add(new PropertyPermission("java.vendor", "read"));
				this.granted.add(new PropertyPermission("java.vendor.url", "read"));
				this.granted.add(new PropertyPermission("java.class.version", "read"));
				this.granted.add(new PropertyPermission("os.name", "read"));
				this.granted.add(new PropertyPermission("os.version", "read"));
				this.granted.add(new PropertyPermission("os.arch", "read"));
				this.granted.add(new PropertyPermission("filename.encoding", "read"));
				this.granted.add(new PropertyPermission("filename.separator", "read"));
				this.granted.add(new PropertyPermission("path.separator", "read"));
				this.granted.add(new PropertyPermission("line.separator", "read"));
				this.granted.add(new PropertyPermission("java.specification.version", "read"));
				this.granted.add(new PropertyPermission("java.specification.vendor", "read"));
				this.granted.add(new PropertyPermission("java.specification.name", "read"));
				this.granted.add(new PropertyPermission("java.vm.specification.version", "read"));
				this.granted.add(new PropertyPermission("java.vm.specification.vendor", "read"));
				this.granted.add(new PropertyPermission("java.vm.specification.name", "read"));
				this.granted.add(new PropertyPermission("java.vm.version", "read"));
				this.granted.add(new PropertyPermission("java.vm.vendor", "read"));
				this.granted.add(new PropertyPermission("java.vm.name", "read"));
				return;
			}

			p = (APermission) var1.next();
		} while (p.getClassName() != null);

		throw new RuntimeException("Revoked permission " + p + " does not contain a class.");
	}

	private String nameOf(FileDescriptor filedescriptor) {
		return filedescriptor.toString();
	}

	private boolean permitAll() {
		return true;
	}

	private boolean permitNetwork() {
		return true;
	}

	private boolean permitOurs() {
		return true;
	}

	private boolean permitDanger() {
		return false;
	}

	public synchronized void restoreSecurityManager() {
		this.active = false;
		if (this.origSm != null) {
			System.setSecurityManager(this.origSm);
		}
	}

	public synchronized void setSecurityManager() {
		this.origSm = System.getSecurityManager();
		this.init();
		System.setSecurityManager(delegated);
		this.active = true;
	}

	/** Represents a permission. */
	public static class APermission {
		private String className;
		private String name;
		private String actionString;
		private Set<String> actions;

		/**
		 * Get the actions.
		 * @return The actions of the permission.
		 */
		public String getActions() {
			return actionString;
		}

		/**
		 * Get the class of the permission.
		 * @return The class name of the permission.
		 */
		public String getClassName() {
			return className;
		}

		/**
		 * Get the name of the permission.
		 * @return The name of the permission.
		 */
		public String getName() {
			return name;
		}

		/**
		 * Learn whether the permission matches in case of a revoked permission.
		 * @param perm The permission to check against.
		 */
		boolean matches(final java.security.Permission perm) {
			if (!className.equals(perm.getClass().getName())) { //NOSONAR
				return false;
			}
			if (name != null) {
				if (name.endsWith("*")) {
					if (!perm.getName().startsWith(name.substring(0, name.length() - 1))) {
						return false;
					}
				} else if (!name.equals(perm.getName())) {
					return false;
				}
			}
			if (actions != null) {
				final Set<String> as = parseActions(perm.getActions());
				final int size = as.size();
				as.removeAll(actions);
				// If no actions removed, then all allowed
				return as.size() != size;
			}
			return true;
		}

		/**
		 * Parses the actions into a set of separate strings.
		 * @param actions The actions to be parsed.
		 */
		private Set<String> parseActions(final String actions) {
			final Set<String> result = new HashSet<>();
			final StringTokenizer tk = new StringTokenizer(actions, ",");
			while (tk.hasMoreTokens()) {
				final String item = tk.nextToken().trim();
				if (!item.isEmpty()) {
					result.add(item);
				}
			}
			return result;
		}

		/**
		 * Set the actions.
		 * @param actions The actions of the permission.
		 */
		public void setActions(final String actions) {
			actionString = actions;
			if (!actions.isEmpty()) {
				this.actions = parseActions(actions);
			}
		}

		/**
		 * Set the class, mandatory.
		 * @param aClass The class name of the permission.
		 */
		public void setClass(final String aClass) {
			className = aClass.trim();
		}

		/**
		 * Set the name of the permission.
		 * @param aName The name of the permission.
		 */
		public void setName(final String aName) {
			name = aName.trim();
		}

		/**
		 * Get a string description of the permissions.
		 * @return string description of the permissions.
		 */
		@Override
		public String toString() {
			return ("Permission: " + className + " (\"" + name + "\", \"" + actions + "\")");
		}
	}
}