package jasko.tim.lisp;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.Stack;

import jasko.tim.lisp.editors.ILispEditor;
import jasko.tim.lisp.editors.LispEditor;
import jasko.tim.lisp.editors.actions.LispAction;
import jasko.tim.lisp.navigator.LispNavigator;
import jasko.tim.lisp.preferences.PreferenceConstants;
import jasko.tim.lisp.preferences.PreferenceInitializer;
import jasko.tim.lisp.cusp.*;
import jasko.tim.lisp.views.ReplView;
import jasko.tim.lisp.views.repl.SwitchFocusAction;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.ui.handlers.IHandlerService;
import org.eclipse.ui.keys.KeySequence;

import org.eclipse.ui.plugin.*;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.*;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.ImageDescriptor;
import org.osgi.framework.BundleContext;
import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.jface.commands.ActionHandler;


/**
 * The main plugin class to be used in the desktop.
 */
public class LispPlugin extends AbstractUIPlugin {

	public static ILog log;
	    
	private CuspInterface cusp = null;

	private Properties props;
	
	//The shared instance.
	private static LispPlugin plugin;
    
    private static String CUSP_VERSION = "0.0.0"; //$NON-NLS-1$
    private static String RELEASE_DATE = "0000.00.00"; //$NON-NLS-1$
    
    private static String CONSOLE_NAME = "jasko.tim.lisp.console"; //$NON-NLS-1$

    // strings to store configurations
	public static final String ATTR_LISP_EXE = "jasko.tim.lisp" + ".ATTR_LISP_EXE";
	public static final String ATTR_LISP_FLAVOR = "jasko.tim.lisp" + ".ATTR_LISP_FLAVOR";
	public static final String ID_LAUNCH_CONFIGURATION_TYPE = "jasko.tim.lisp.launchType";	

	public static final String defaultProjectName = ".External Lisp Files";
	
	/*Doesn't quite work...
	public static boolean isDebugActive () {
		//doesn't work...
		return false;
		//ReplView view = (ReplView)(LispPlugin.findView(ReplView.ID));
		//return view.isDebugViewActive();
	}
	*/
	
	public static int replIdCounter = 0;
	
	public static String generateREPLId () {
		++replIdCounter;
		return "REPL"+replIdCounter;
	}
	
	public static IPreferenceStore getStore () {
		return PreferenceInitializer.getStore();
	}
	
	public static IContainer getCurrentSelectedContainer () 
	{
		IWorkbenchPart nav  =  findView(LispNavigator.ID);
		if (nav!=null) 
			return ((LispNavigator)nav).getSelectedContainer();
		return null;
	}
	
	public static IProject[] getProjects () {
		return ResourcesPlugin.getWorkspace().getRoot().getProjects();
	}
	public static IProject getProject (String name)
	{
		return ResourcesPlugin.getWorkspace().getRoot().getProject(name);
	}
	
	public static IProject getDefaultProject () {
		return getProject(defaultProjectName);
	}
	
	public static IProject getDefaultProjectAndCreate () {
		IProject proj = getDefaultProject();
		if (!proj.exists()) {
			try {
				proj.create(null);
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return proj;		
	}
	
	
	
	
	
	

	
	
	
	
	private static Shell shell;
	public static Shell getActiveShellSync () {
		shell = null;
		Display.getCurrent().asyncExec(new Runnable () {

			
			public void run() {
				shell =  PlatformUI.getWorkbench().getDisplay().getShells()[0];
				
			}

		});
		return shell;
	}
	public static Shell getActiveShell ()
	{
		return Display.getDefault().getActiveShell();
	}
	/**
	 * The constructor.
	 */
	public LispPlugin() {
		plugin = this;
	}

	/**
	 * @param msg prints message to Repl's status bar (if repl is available)
	 */

	
	public static  IWorkbenchPage getActivePage () { 
		IWorkbench workbench= PlatformUI.getWorkbench();
		if (workbench!=null) {
			IWorkbenchWindow window = workbench.getActiveWorkbenchWindow();
			if (window!=null) {
				return window.getActivePage();
			}
		}
		return null;
	}
	
	public static IEditorPart getActiveEditor () {
		IWorkbenchPage page = getActivePage();
		if (page!=null) {
		return getActivePage().getActiveEditor();}
		return null;
	}
	
	public static IWorkbenchPart findView (String id) {
		IWorkbenchPage page = getActivePage();
		if (page!=null) {
		return  page.findView(id);
		}
		return null;
	}
	public static ReplView findREPL () {
		IWorkbenchPart part = findView(ReplView.ID);
		if (part!=null) {
			return (ReplView)part;
		}
		return null;
	}
	
	public static boolean isAnEditorActive () {
		IWorkbenchPage activePage = getActivePage();
		if (activePage!=null) {
			IWorkbenchPartReference ref = activePage.getActivePartReference();
			return (ref.getPart(false) instanceof LispEditor);
		}
		return false;
	}
	
	public static boolean isREPLActive ()
	{
		IWorkbenchPage activePage = getActivePage();
		if (activePage!=null) {
			IEditorPart editor = activePage.getActiveEditor(); 
			IWorkbenchPart 	replPart = activePage.findView(ReplView.ID);
			IWorkbenchPartReference ref = activePage.getActivePartReference();
			return ref.getPart(false).equals(replPart);
		}
		return false;
	}
	
	public static void toggleActiveBuffer ()
	{

		IWorkbench workbench= PlatformUI.getWorkbench();
		IWorkbenchPage activePage = workbench.getActiveWorkbenchWindow().getActivePage();
		if (activePage!=null) {
			IEditorPart editor = activePage.getActiveEditor();
			IWorkbenchPart 	replPart = activePage.findView(ReplView.ID);
			IWorkbenchPartReference ref = activePage.getActivePartReference();

			if (replPart!=null&&ref.getPart(false).equals(replPart)) {
				activePage.activate(editor);
			} else 
			{
				if (replPart instanceof ReplView)
					activePage.activate(replPart);
			}
		}
	}
	
	public static void focusActiveEditor ()
	{
		IWorkbench workbench= PlatformUI.getWorkbench();
	    IWorkbenchPage activePage = workbench.getActiveWorkbenchWindow().getActivePage();
	    if (activePage != null) {
		   activePage.activate(activePage.getActiveEditor());
	    }	
	}

	public void welcomeMessage(String lispVersion, String pkg){


		IWorkbench workbench= PlatformUI.getWorkbench();
		IWorkbenchWindow window= workbench.getActiveWorkbenchWindow();
		IWorkbenchPage activePage = window.getActivePage();
		IStatusLineManager statusLineManager = null;
		if (activePage != null) {
			IWorkbenchPart replPart = activePage.findView(ReplView.ID);
			if (replPart instanceof ReplView){
				statusLineManager = 
					((IViewPart)replPart).getViewSite().getActionBars().getStatusLineManager();
				statusLineManager.setMessage(makeStatusMsg(lispVersion,pkg));
				((ReplView)replPart).appendText("You are running "+lispVersion
						+" via Cusp " 
						+ LispPlugin.getVersion());
			}
		}
	}
	
	static public String makeStatusMsg(String lispVersion, String pkg){
		   String statusMsg = "CL:"+lispVersion
			+"| Cusp: "+getVersion()
			+"| Current package: " + pkg;
		   return statusMsg;
	}
	
	/**
	 * @param msg prints message to Repl's status bar (if repl is available)
	 */
	public void updateReplStatusLine(String msg){
		IWorkbench workbench= PlatformUI.getWorkbench();
		IWorkbenchWindow window= workbench.getActiveWorkbenchWindow();
		IWorkbenchPage activePage = window.getActivePage();
		IStatusLineManager statusLineManager = null;
		if (activePage != null) {
			IWorkbenchPart replPart = activePage.findView(ReplView.ID);
			if (replPart instanceof ReplView){
				statusLineManager = 
					((IViewPart)replPart).getViewSite().getActionBars().getStatusLineManager();
				statusLineManager.setMessage(msg);
			}
		}
	}

	/**
	 * This method is called upon plug-in activation
	 */

	public void start(BundleContext context) throws Exception {
		super.start(context);
		cm =  new ColorManager(this);	
		try {
			this.props = new Properties();
			
			InputStream in = LispPlugin.class.getResourceAsStream("/cusp.properties"); //$NON-NLS-1$
			props.load(in);
			in.close();
			
			log = this.getLog();
			 
			CUSP_VERSION = props.getProperty("cusp.version"); //$NON-NLS-1$
			RELEASE_DATE = props.getProperty("cusp.release_date"); //$NON-NLS-1$

			//Ctrl+I switch
			IHandlerService keys = (IHandlerService) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getService(IHandlerService.class);
	 		LispAction action = new SwitchFocusAction();
	 		action.setActionDefinitionId("jasko.tim.lisp.actions.SwitchFocusAction");
	 	    keys.activateHandler("jasko.tim.lisp.actions.SwitchFocusAction",new ActionHandler(action));
	 	   
	  
	 	 //Ctrl+J switch
		/*	IHandlerService keys2 = (IHandlerService) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getService(IHandlerService.class);
	 		LispAction action2 = new SwitchFocusAction();
	 		action2.setActionDefinitionId("jasko.tim.lisp.actions.SwitchFocusAction");
	 	    keys2.activateHandler("jasko.tim.lisp.actions.SwitchFocusAction",new ActionHandler(action2));
	 	    */
			startCusp(); //FIXME: do this with launcher rather on startup

		} catch (Exception e) {
			e.printStackTrace();
			if (cusp==null) {
				cusp = new CuspInterface(true); //dummy cusp
			}
			// to show the error with the stack trace in error log view
			IStatus errorStatus = new Status(IStatus.ERROR,"LispPlugin", 0, e.getMessage(), e);
			this.getLog().log(errorStatus);
		}
	}
	
	public static void logError (String message) {
		IStatus status = new Status(IStatus.ERROR,"LispPlugin",0,message,null);
		log.log(status);
	}
	public static void logError (Exception e) {
		IStatus status = new Status(IStatus.ERROR,"LispPlugin",0,e.getMessage(),e);
		log.log(status);
	}
	
	public static void logWarning (String message) {
		IStatus status = new Status(IStatus.WARNING,"LispPlugin",0,message,null);
		log.log(status);
	}
	
	public static void logInfo (String message) {
		IStatus status = new Status(IStatus.ERROR,"LispPlugin",0,message,null);
		log.log(status);
	}
	
	public boolean startCusp(){
		if( cusp == null || !cusp.isConnected() ){
			cusp = new CuspInterface();			
		} else { //disconnect if already running and connect again.
			cusp.reconnect();
		}
		return ( cusp != null && cusp.isConnected() );
	}
	
	public boolean startCusp(String flavor, String command){
		if( cusp == null || !cusp.isConnected() ){
			cusp = new CuspInterface(flavor,command);			
		} else { //disconnect if already running and connect again.
			cusp.reconnect();
		}
		return ( cusp != null && cusp.isConnected() );
	}
	
	public CuspInterface getCusp() {
		return cusp;
	}
    
    public static String getVersion () {
        return CUSP_VERSION;
    }
    
    public static String getReleaseDate () {
        return RELEASE_DATE;
    }

	private MessageConsole getConsole() {
		ConsolePlugin plugin = ConsolePlugin.getDefault();
		IConsoleManager conMan = plugin.getConsoleManager();
		IConsole[] existing = conMan.getConsoles();
		for (int i = 0; i < existing.length; i++){
			if (CONSOLE_NAME.equals(existing[i].getName())){
				return (MessageConsole) existing[i];				
			}
		}
		//no console found, so create a new one
		MessageConsole myConsole = new MessageConsole(CONSOLE_NAME, null);
		conMan.addConsoles(new IConsole[]{myConsole});
		return myConsole;
	}
	
	/**
	 * Put string to console.
	 * @param str
	 */
	public void out(String str){
			MessageConsole myConsole = getConsole();
			MessageConsoleStream out = myConsole.newMessageStream();
			out.println(str);					
	}
	
	public void activateConsole(){
		getConsole().activate();
	}
	    
	/**
	 * This method is called when the plug-in is stopped
	 */
	public void stop(BundleContext context) throws Exception {
		cm.dispose();
		if( getCusp() != null && getCusp().isConnected()) {
 			cusp.disconnect();
 		}
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance.
	 */
	public static LispPlugin getDefault() {
		return plugin;
	}

	/**
	 * Returns an image descriptor for the image file at the given
	 * plug-in relative path.
	 *
	 * @param path the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return AbstractUIPlugin.imageDescriptorFromPlugin("jasko.tim.lisp", path); //$NON-NLS-1$
	}
	
	
	private ColorManager cm;
	public ColorManager getColorManager() {
		return cm;
	}
	
	public String getLibsPathRegisterCode(){
		String code = ""; //$NON-NLS-1$
		ArrayList<File> subdirs = getLibsPath();
		if(subdirs.size() > 0){
		//	code = "(mapcar #'com.gigamonkeys.asdf-extensions:register-source-directory '(\n"; // $NON-NLS-1$
			code = "(com.gigamonkeys.asdf-extensions:register-source-directories '(\n"; // $NON-NLS-1$
			for (int i = 0; i < subdirs.size(); i++) {
				File child = subdirs.get(i);
				String name = child.getAbsolutePath().replace("\\", "/"); //$NON-NLS-1$ //$NON-NLS-2$
				if (!name.endsWith("/")) { //$NON-NLS-1$
					name += "/"; //$NON-NLS-1$
				}
				code += "  \"" + name + "\"\n"; //$NON-NLS-1$ //$NON-NLS-2$
			}
			code += "))"; //$NON-NLS-1$
		}
		return code;
	}
	
	public static String setSharedLibPaths (ProcessBuilder pb,int limit) {
		List<File> dirs = getSharedLibPaths(new File(PreferenceInitializer.getStore().getString(PreferenceConstants.SYSTEMS_SHARED_PATH)),limit);
		dirs=null;
		if (dirs==null) {
			return "";
		}
		String systemSeparator = System.getProperty("path.separator");
		String paths  = "";
		for (File dir:dirs) {
			paths+=systemSeparator+dir.getAbsolutePath();
		}
		
		String prevEnv = pb.environment().get("Path").trim();
		
		paths+=systemSeparator+prevEnv;
		
		System.out.println("Adding to the Path Variable: "+paths);
		pb.environment().put("Path",paths);
		return paths;
	}
	
	public static ArrayList<File> getSharedLibPaths (File initialDir,int limit) {
		if (!initialDir.isDirectory ()||initialDir==null) {
			return null;
		}
		File[] dirs = initialDir.listFiles(new FileFilter () {
			public boolean accept(File pathname) {
				// TODO Auto-generated method stub
				return pathname.isDirectory();
			}

		});
		
		if (dirs==null) {
			return null;
		}
		
		ArrayList<File> current = new ArrayList<File>(Arrays.asList(dirs));
		
		for (File dir: dirs) {
			current.addAll(getSharedLibPaths(dir,limit-1));
		}
		return current;
	}
	
	public ArrayList<File> getLibsPath(){
		String path = getPluginPath() + "libraries"; //$NON-NLS-1$
	
	    // This filter only returns directories of type jasko.tim.lisp.libs
	    FileFilter libPluginFilter = new FileFilter() {
	        public boolean accept(File file) {
	            return (file.isDirectory()
	            		&& file.toString().matches(".*jasko\\.tim\\.lisp\\.libs.*")); //$NON-NLS-1$
	        }
	    };
	
	    ArrayList<File> topLevelDirs = new ArrayList<File>();
	    topLevelDirs.add(new File(path));

		String sysdirs[] = 
			getPreferenceStore().getString(PreferenceConstants.SYSTEMS_PATH).split(";"); //$NON-NLS-1$
		
		for(String sysdir: sysdirs){
			if( sysdir != null && !sysdir.equals("")){ //$NON-NLS-1$
				topLevelDirs.add(new File(sysdir));			
			}
		}
	    
		File pluginsDir = (new File(LispPlugin.getDefault().getPluginPath())).getParentFile();
	    for( File dir : pluginsDir.listFiles(libPluginFilter)){
	    	topLevelDirs.add(new File(dir.getAbsolutePath()+"/libs")); //$NON-NLS-1$
	    }
		
	    // This filter only returns directories
	    FileFilter dirFilter = new FileFilter() {
	        public boolean accept(File file) {
	            return file.isDirectory();
	        }
	    };
	
		ArrayList<File> subdirs = new ArrayList<File>();
		for( File dir : topLevelDirs){
			if( dir.isDirectory() ){
				subdirs.add(dir);
				for( File subdir : dir.listFiles(dirFilter) ){
					if( subdir != null && !subdirs.contains(subdir) ){
						subdirs.add(subdir);			
					}
				}						
			}
		}
		if (subdirs.size() == 0) {
			// Either dir does not exist or is not a directory
			System.out.println("*libraries dir not found! " + path); //$NON-NLS-1$
		}
		return subdirs;
	}
	
	public String getPluginPath() {
		try {
			String path = FileLocator.resolve(Platform.getBundle("jasko.tim.lisp").getEntry("/") ).getFile(); //$NON-NLS-1$ //$NON-NLS-2$
			if (System.getProperty("os.name").toLowerCase().contains("windows")){ //$NON-NLS-1$ //$NON-NLS-2$
				if(path.matches("/\\w:/.*")){ //$NON-NLS-1$
					path = path.substring(1);
				}
			}
			return path;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return ""; //$NON-NLS-1$
	}
}
