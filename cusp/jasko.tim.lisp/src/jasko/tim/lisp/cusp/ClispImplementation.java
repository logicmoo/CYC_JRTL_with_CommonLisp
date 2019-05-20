package jasko.tim.lisp.cusp;

import jasko.tim.lisp.LispPlugin;

import java.io.File;
import java.io.IOException;


/**
 * This is a class for finding and starting Clisp.
 * Static methods are provided for finding an Clisp implementation on the system.
 * 
 * An instance of this class can be used for spawning Clisp processes and starting
 * them up.
 *  
 * Basically a copy of Allegro Implementation
 */
public class ClispImplementation extends LispImplementation {
	/**
	 * @return whether a Clisp implementation can be found on the host computer
	 */
	static public boolean existsOnSystem() {
		return findExecutable() != null;
	}
	
	/**
	 * 
	 * @return the executable alisp file on the host computer
	 */
	static protected File findExecutable()
	{
		File implementationFolder = findFolder();
		File exec = null;
		if (implementationFolder != null)
		{
			String os = System.getProperty("os.name").toLowerCase();
			String execName;
			if (os.contains("windows"))
				execName = "clisp.exe";
			else
				execName = "clisp";
			File possibleExecutable = new File(implementationFolder.getPath() + File.separator + execName);
			
			if (possibleExecutable.exists())
				exec = possibleExecutable;
			else
				exec = null;
		}
		else
		{
			//TODO: just default to whatever happens when you type `alisp' into bash
			exec = null;
		}
		return exec;
	}
	
	/**
	 * Attempts to find the path of the implementation on this computer.
	 * @return the directory of the lisp implementation or null if none is found
	 */
	static protected File findFolder()
	{
		File foundPath = null;
		String pluginDir = LispPlugin.getDefault().getPluginPath();
		String lispPath = pluginDir + "clisp/";
		
		File dir = new File(lispPath);
		if (dir.exists()) {
			foundPath = dir;
		} 
		return foundPath;
	}
	
	/**
	 * Attempts to find and return an clisp implementation on the system.
	 *  
	 * @return clisp implementation found on the system, or null if none is found
	 */
	static public ClispImplementation findImplementation()
	{
		ClispImplementation implementation = null;
		File executable = findExecutable();
		if (executable != null ) {
			File dir = findFolder();
			if (dir != null)
			{
				implementation = new ClispImplementation(executable, dir);
			}
		}
		return implementation;
	}

	File executable = null;
	File path = null;
	String loadPath = null;
	
	/**
	 * Constructs an instance of a ClispImplementation.  Does NOT start a process
	 * or find an clisp implementation on the host machine.
	 * 
	 * @see start()
	 * @see 
	 * @param executable
	 * @param aclDirectory
	 */
	public ClispImplementation(File executable, File aclDirectory)
	{
		this.executable = executable;
		this.path = aclDirectory;
	}
	
	public boolean isValid() { return executable != null && path != null; }
	
	//TODO: Find libsvm.dll
	public ProcessBuilder start(String loadPath, int port) throws IOException
	{
		if (isValid())
		{
			String[] commandLine = new String[] {
					executable.getPath(),"-K full"
			};

			ProcessBuilder pb = new ProcessBuilder(commandLine);
			this.loadPath = loadPath;
			
			return pb;
		}
		else
		{
			return null;
		}
	}
	
	public String getLoadCuspCommand() {
		return "(load \"" + this.loadPath.replace("\\", "\\\\") + "\")\n";
	}
}
