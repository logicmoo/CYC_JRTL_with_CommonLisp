package jasko.tim.lisp.cusp;

import jasko.tim.lisp.LispPlugin;
import jasko.tim.lisp.preferences.PreferenceConstants;

import java.io.BufferedInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

import java.io.*;

/**
 * Abstract Lisp Implementation class.
 *
 */
public abstract class LispImplementation {
	protected String flispType = ""; //possible values SBCL, CLISP etc.
	protected boolean hasthreads = true; 
	private static final String [] compilerOutputs = new String[] {
			".fasl",		// SBCL compiler output
			".dfsl",		// Clozure CL, openmcl output
			".d64fsl",		// Same as above
			".dx64fsl",		// Same as above
			".dx32fsl",		// Same as above
			".fas",			// CLISP interpreter output
			".lib"			// CLISP interpreter output
	};
	
	protected ProcessBuilder pb;
	// Probably lisp implementation specific - tested with SBCL
	protected String fatalError = "fatal error";
	public String fatalErrorString(){ return fatalError; }
	
	public String lispType(){ return flispType; }
	public boolean hasThreads(){ return hasthreads; }
	
	public static boolean isCompilerOutput(String lispFile) {
		for (String extension : compilerOutputs) {
			if (lispFile.endsWith(extension))
				return true;
		}
		return false;
	}
	/**
	 * @return whether this instance is valid (ie can roll off a process) 
	 */
	public abstract boolean isValid();
	
	/**
	 * TODO: figure out this method's signature.. ie how to pass SBCL init args
	 * @param loadPath some lisp file to load
	 * @return running SBCL process
	 * @throws IOException 
	 */
	public Process startLisp (String loadPath, int cuspPort) throws IOException {
	    pb = start(loadPath,cuspPort);
	    if (pb!=null) {
	    	setEnvironment(); 
	    	System.out.println("Parsing Lisp Executable Arguments");
	    	String[] args = getLispArguments(); 
	    	System.out.print("Executable Arguments are ");
	    	if (args.length>0) {
	    		for (String s:args) {
	    			System.out.print(" "+s);
	    			pb.command().add(s);
	    		}
	    	}
	    	System.out.println("");
	    	System.out.println("Starting Lisp");
	    	return pb.start();
	    }
	    return null;
	}
	
	public abstract ProcessBuilder start(String loadPath, int cuspPort) throws IOException;
	public void setEnvironment (int limit) {
		LispPlugin.setSharedLibPaths(pb,limit);
	}
	public void setEnvironment () {
		System.out.println("Setting Environment for Libraries");
		setEnvironment(2);
		String [] env = getLispEnvironment();
		
		System.out.println("Setting Lisp Environment");
		if (env!=null) {
			for (int i=0;i<env.length;i+=2) {
				if (i+1==env.length||env[i]==null||env[i+1]==null) continue;
				System.out.println(i+" "+env[i]+" "+env[i+1]+" ");
				pb.environment().put(env[i],env[i+1]);
			}
		}
	}
	/**
	 * Creates executable from asd project file.
	 * @param exeFile - Full path to the resulting executable.
	 * @param asdFile - Full path to package file.
	 * @param toplevel - Top level form for executable. Must be a form with 0 arguments returning integer.
	 * @param pkg - Package which top level form belongs to.
	 * @return true if successful, false - otherwise
	 */
	public boolean createExe(String exeFile, String asdFile, String toplevel, String pkg){
		LispPlugin.getDefault().out("Creating executable is not implemented for your CL implementation ("+flispType+")");
		return false;
	}
	
	public static File findFolder (String exeName) {
		File folder = getLispExecutableFolder(exeName);
		if (folder==null) {
			System.out.println(">>> Did not find "+exeName+" folder and/or correct lisp executable name while checking the folder "+folder);
		}
		return folder;		
	}
	
	static File findFolder () {
		File folder = getLispExecutableFolder();
		if (folder==null) {
			System.out.println(">>> Did not find lisp folder while checking the File "+folder);
		}
		return folder;		
	}
	
	//TODO: Gorsal - Delete?
	public static File getLispExecutableFolder () {
		//File f = new File( LispPlugin.getDefault().getPreferenceStore().getString(PreferenceConstants.LISP_PATH_HINT));
		//if (f.isDirectory()) {
		//	return f;
		//}
		return null;
	}
	
	public static String[] getLispArguments () {
		String args = LispPlugin.getDefault().getPreferenceStore().getString(PreferenceConstants.LISP_ARGUMENTS);
		return args.split("\b| +(?=\".*\")| +(?='.*')");
	}
	
	public static String[] getLispEnvironment () {
		String env = LispPlugin.getDefault().getPreferenceStore().getString(PreferenceConstants.LISP_ENVIRONMENT);
		if (env.trim()!="") {
			String[] temp = env.split(";"); 
			if (temp.length<1) {
				temp[0] = env;
			}	
			String[] result = new String[temp.length*2];

			for (int i=0;i<temp.length;i++) {
				String [] items = temp[i].split("=");
				if (items.length==2) {
					result[2*i] = items[0];
					result[2*i+1] = chopQuotes(items[1]);
				}
			}
			return result;
		}
		return null;
	}

	public static String chopQuotes (String s) {
		if (s.charAt(0)=='"'&&s.charAt(s.length()-1)=='"'|| s.charAt(0)=='\''&&s.charAt(s.length()-1)=='\'')
			return s.substring(1,s.length()-1);
		return s;
	}
	
	public static File getLispExecutableFolder (final String exeName) {
		    File ff = getLispExecutableFolder();
		    if (ff!=null) {

				String os = System.getProperty("os.name").toLowerCase();
				String execName;
				if (os.contains("windows"))
					execName = exeName+".exe";
				else
					execName = "sbcl";
				final String stupidName = execName; //stupid hack
				
				   FileFilter exeFilter = new FileFilter() {
				        public boolean accept(File file) {
				            return (file.isFile()
				            		 && file.getName().equalsIgnoreCase(stupidName));
				        }
				    };
				    File[] files = ff.listFiles(exeFilter);
				   if (files.length!=0) {
					   return ff;
				   }
				   return null;	    
		    }
		    return ff;		
	}
	
	public String getExeExtensionForPlatform(){
		String os = System.getProperty("os.name").toLowerCase();
		if (os.contains("windows"))
			return ".exe";
		else
			return "";
	}
	
	/**
	 * This exists to help work around SBCL's windows problem.
	 *  If we find ourselves unable to connect to Slime, and we see that the process has terminated on us,
	 *   call this function, which should have a somewhat better shot at starting.
	 * @param loadPath
	 * @return
	 * @throws IOException
	 */
	/*public Process startHarder(String loadPath, int cuspPort) throws IOException {
		return start(loadPath, cuspPort);
	}*/

	/**
	 * This returns lisp commands neccessary to execute on the console to
	 * load cusp file.
	 * 
	 * @return
	 */
	public abstract String getLoadCuspCommand();
	
	/**
	 * This performs any translations necessary on a local file name / directory name
	 * to feed it into the implementation.
	 * 
	 * @param filePath
	 * @return
	 */
	public String translateLocalFilePath(String filePath) {
		return filePath;
	}
	
	/**
	 * This performs any translations necessary on a remote file name /  directory name
	 * received from the implementation.
	 * 
	 * @param filePath
	 * @return
	 */
	public String translateRemoteFilePath(String filePath) {
		return filePath;
	}
}
