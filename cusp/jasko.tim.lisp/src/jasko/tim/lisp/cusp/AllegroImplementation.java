package jasko.tim.lisp.cusp;

import jasko.tim.lisp.LispPlugin;

import java.io.File;
import java.io.IOException;


/**
 * This is a class for finding and starting Allegro.
 * Static methods are provided for finding an Allegro implementation on the system.
 * 
 * An instance of this class can be used for spawning Allegro processes and starting
 * them up.
 *  
 * @author Red Daly
 */
public class AllegroImplementation extends LispImplementation {
	/**
	 * @return whether an Allegro implementation can be found on the host computer
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
		File implementafoltionFolder = findFolder();
		File exec = null;
		if (implementafoltionFolder != null)
		{
			String os = System.getProperty("os.name").toLowerCase();
			String execName;
			if (os.contains("windows"))
				execName = "alisp.exe";
			else
				execName = "alisp";
			File possibleExecutable = new File(implementafoltionFolder.getPath() + File.separator + execName);
			
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
	static   File findFolder()
	{
		File foundPath = null;
		String pluginDir = LispPlugin.getDefault().getPluginPath();
		String lispPath = pluginDir + "acl80/";
		
		File dir = new File(lispPath);
		if (dir.exists()) {
			foundPath = dir;
		} 
		return foundPath;
	}
	
	/**
	 * Attempts to find and return an Allegro implementation on the system.
	 *  
	 * @return Allegro implementation found on the system, or null if none is found
	 */
	static public AllegroImplementation findImplementation()
	{
		AllegroImplementation implementation = null;
		File executable = findExecutable();
		if (executable != null ) {
			File dir = findFolder();
			if (dir != null)
			{
				implementation = new AllegroImplementation(executable, dir);
			}
		}
		return implementation;
	}

	File executable = null;
	File path = null;
	String loadPath = null;
	
	/**
	 * Constructs an instance of an AllegroImplementation.  Does NOT start a process
	 * or find an Allegro implementation on the host machine.
	 * 
	 * @see start()
	 * @see 
	 * @param executable
	 * @param aclDirectory
	 */
	public AllegroImplementation(File executable, File aclDirectory)
	{
		this.executable = executable;
		this.path = aclDirectory;
	}
	
	public boolean isValid() { return executable != null && path != null; }
	
	public ProcessBuilder start(String loadPath, int port) throws IOException
	{
		if (isValid())
		{
			String[] commandLine = new String[] {
					executable.getPath()
			};

			ProcessBuilder pb = new ProcessBuilder(commandLine);
			this.loadPath = loadPath;
			pb.directory(new File(executable.getParent()));
			
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
