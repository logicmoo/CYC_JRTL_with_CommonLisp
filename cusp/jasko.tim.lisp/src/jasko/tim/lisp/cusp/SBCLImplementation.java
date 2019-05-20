package jasko.tim.lisp.cusp;

import jasko.tim.lisp.LispPlugin;
import jasko.tim.lisp.editors.actions.*;
import jasko.tim.lisp.preferences.PreferenceConstants;
import jasko.tim.lisp.util.*;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.eclipse.jface.preference.IPreferenceStore;

/**
 * This is a class for finding and starting Steel Bank Common Lisp.
 * Static methods are provided for finding an SBCL implementation on the system.
 * 
 * An instance of this class can be used for spawning SBCL processes and starting
 * them up.
 *  
 * @author Red Daly
 */
public class SBCLImplementation extends LispImplementation {
	/**
	 * @return whether an SBCL implementation can be found on the host computer
	 */
	static public boolean existsOnSystem() {
		return findExecutable() != null;
	}
	
	/**
	 * 
	 * @return the executable SBCL file on the host computer
	 */
	static public File findExecutable()
	{
		File implementationFolder = findFolder();
		if (implementationFolder != null)
		{
			String os = System.getProperty("os.name").toLowerCase();
			String execName;
			if (os.contains("windows"))
				execName = "sbcl.exe";
			else
				execName = "sbcl";
			File possibleExecutable = new File(implementationFolder.getPath() 
					+ File.separator + execName);
			
			if (possibleExecutable.exists())
				return possibleExecutable;
			else
				return null;
		}
		else
		{
			//TODO: just default to whatever happens when you type `sbcl' into bash
			return null;
		}
	}

	/**
	 * 
	 * @return the SBCL directory on the host computer
	 */
	public static File findFolder()
	{
		String pluginDir = LispPlugin.getDefault().getPluginPath();
		File sbclFolder = new File(pluginDir + "sbcl/");
		if (sbclFolder.exists()){
			System.out.println(">>> Found default sbcl folder: "+sbclFolder.toString());
			return sbclFolder;
		} else {
			
			File pluginsFolder = new File(pluginDir).getParentFile();
			
			sbclFolder = new File(pluginsFolder.getPath() + "/sbcl/");
			
			if (sbclFolder.exists()){
				System.out.println(">>> Found next default sbcl folder: "
						+sbclFolder.toString());
				return sbclFolder;
			} else {
			    // This filter only returns directories that start with sbcl
			    FileFilter dirFilter = new FileFilter() {
			        public boolean accept(File file) {
			            return (file.isDirectory() 
			            		 && file.getName().startsWith("sbcl"));
			        }
			    };
				
			    ArrayList<File> sbclFolders = new ArrayList<File>();
			    
			    for( File dir : pluginsFolder.listFiles(dirFilter)){
			    	System.out.println(">>> Possible sbcl folder: "+dir.toString());
			    	sbclFolders.add(dir);
			    }
			    
			    if( sbclFolders.size() > 0 ){
				    Collections.sort(sbclFolders);
				    
					sbclFolder = new 
						File(sbclFolders.get(sbclFolders.size()-1).toString()+"/sbcl/");
					System.out.println(">>> Found feature sbcl folder: "
							+sbclFolder.toString());
					return sbclFolder;
			    } else {
					String dir = System.getenv("SBCL_HOME");
					if( dir != null ){
						sbclFolder = new File(dir);
						System.out.println(">>> Found SBCL_HOME sbcl folder: "
								+sbclFolder.toString());
						return sbclFolder;
					}		    	
			    }
			    return sbclFolder; //LispImplementation.findFolder("sbcl");	
			}			
		}
	}
	
	/**
	 * Attempts to find and return an SBCL implementation on the system.
	 *  
	 * @return SBCL implementation found on the system, or null if none is found
	 */
	static public SBCLImplementation makeImplementation (String executable)
	{
		return new SBCLImplementation(new File(executable),
				new File(executable).getParentFile());
	}
	
	static public SBCLImplementation findImplementation()
	{
		SBCLImplementation implementation = null;
		File executable = findExecutable();
		if (executable != null){
			File dir = findFolder();
			if( dir != null)
			{
				implementation = new SBCLImplementation(executable, dir);
			}
		}
		return implementation;
	}

	static public SBCLImplementation findImplementation(String filepath)
	{
		File file = new File(filepath);
		File executable = new File(file.getName());
		File dir = new File(file.getPath());
		if (executable != null && dir != null)
		{
			return new SBCLImplementation(executable, dir);
		}
		else
			return null;
	}
	
	File executable = null;
	File path = null;
	String loadPath = null;
	
	/**
	 * Constructs an instance of an SBCL implementation.  Does NOT start an SBCL process,
	 * or find an SBCL implementation on the host machine.
	 * 
	 * @see start()
	 * @see 
	 * @param executable
	 * @param sbclDirectory
	 */
	public SBCLImplementation(File executable, File sbclDirectory) {
		this.executable = executable;
		this.path = sbclDirectory;
		flispType = "SBCL";
		if (System.getProperty("os.name").toLowerCase().contains("windows")) {
			hasthreads = false;
		}
	}

	public boolean isValid() { return executable != null && path != null; }
	
	public void setEnvironment() {
		pb.environment().put("SBCL_HOME", path.getPath());
		pb.directory(new File(executable.getParent()));
		super.setEnvironment();
	}
	
	public ProcessBuilder start(String loadPath, int port) throws IOException
	{
		System.out.println("start");
		
		if (isValid()){
			//ProcessBuilder pb;
			String[] commandLine = new String[] {
					executable.getPath()
					//,"--dynamic-space-size", "50000" // simulate the error some windows users get
					//"--load", loadPath
			};
			
			pb = new ProcessBuilder(commandLine);
			this.loadPath = loadPath;
			return pb;		
		}
		return null;
	}

	public boolean createExe(String exeFile, String asdFile, String toplevel, String pkg){
		if( isValid() ){
			IPreferenceStore prefs = 
				LispPlugin.getDefault().getPreferenceStore();
			
			ArrayList<String> commandLine = new ArrayList<String>();
			
			if (System.getProperty("os.name").toLowerCase().contains("windows")) {
				commandLine.add(executable.getPath());
				commandLine.add("--eval");
				commandLine.add(LispUtil.cleanPackage(BreakpointAction.macro));
				commandLine.add("--eval");
				commandLine.add(LispUtil.cleanPackage(WatchAction.macro));
				commandLine.add("--eval");
				commandLine.add("\"(require 'asdf)\"");
				if(prefs.getBoolean(PreferenceConstants.USE_UNIT_TEST)){
					commandLine.add("--load");
					commandLine.add("\""+LispPlugin.getDefault().getPluginPath() 
							+ "lisp-extensions/lisp-unit.lisp\"");
				}
				if(prefs.getBoolean(PreferenceConstants.MANAGE_PACKAGES)){
					String code = LispPlugin.getDefault().getLibsPathRegisterCode();
					if( !code.equals("")){
						String asdfext = LispPlugin.getDefault().getPluginPath() 
							+ "lisp-extensions/asdf-extensions.lisp";
						commandLine.add("--load");
						commandLine.add("\""+asdfext+"\"");
						commandLine.add("--eval");
						commandLine.add(LispUtil.cleanPackage(code));
					}
					
				}
		 		asdFile = asdFile.replace('\\', '/');
		 		asdFile = translateLocalFilePath(asdFile);
		 		String[] fpathparts = asdFile.split("/");
		 		if( fpathparts.length <= 0 || !fpathparts[fpathparts.length-1].matches(".+\\.asd") ){
		 			LispPlugin.getDefault().out("=== Error - no project (.asd) file found.");	
		 			return false;
		 		}
	 			String asdName = fpathparts[fpathparts.length-1].replace(".asd", "");
	 			
	 			commandLine.add("--load");
	 			commandLine.add("\""+asdFile+"\"");
	 			commandLine.add("--eval");
	 			commandLine.add(LispUtil.cleanPackage("(asdf:oos 'asdf:load-op \""+asdName+"\")"));
				
				commandLine.add("--eval");
				if( pkg != null && !pkg.equals("") && !pkg.equalsIgnoreCase("nil")){
					commandLine.add(LispUtil.cleanPackage("(sb-ext:save-lisp-and-die \""
							+exeFile+"\" :executable t :toplevel '"+pkg+"::"+toplevel+" :purify t)"));				
				} else {
					commandLine.add(LispUtil.cleanPackage("(sb-ext:save-lisp-and-die \""
							+exeFile.replace('\\', '/')+"\" :executable t :toplevel '"+toplevel+" :purify t)"));				
				}

				commandLine.add("--eval");
				commandLine.add("(print 1)");
				commandLine.add("--eval");
				commandLine.add("(print 2)");
			} else {
				commandLine.add(executable.getPath());
				commandLine.add("--eval");
				commandLine.add(LispUtil.cleanPackage(BreakpointAction.macro).replace("`", "\\`"));
				commandLine.add("--eval");
				commandLine.add(LispUtil.cleanPackage(WatchAction.macro).replace("`", "\\`"));
				commandLine.add("--eval");
				commandLine.add("(require 'asdf)");
				if(prefs.getBoolean(PreferenceConstants.USE_UNIT_TEST)){
					commandLine.add("--load");
					commandLine.add(LispPlugin.getDefault().getPluginPath() 
							+ "lisp-extensions/lisp-unit.lisp");
				}
				if(prefs.getBoolean(PreferenceConstants.MANAGE_PACKAGES)){
					String code = LispPlugin.getDefault().getLibsPathRegisterCode();
					if( !code.equals("")){
						String asdfext = LispPlugin.getDefault().getPluginPath() 
							+ "lisp-extensions/asdf-extensions.lisp";
						commandLine.add("--load");
						commandLine.add(asdfext);
						commandLine.add("--eval");
						commandLine.add(code);
					}
					
				}
		 		asdFile = asdFile.replace('\\', '/');
		 		asdFile = translateLocalFilePath(asdFile);
		 		String[] fpathparts = asdFile.split("/");
		 		if( fpathparts.length <= 0 || !fpathparts[fpathparts.length-1].matches(".+\\.asd") ){
		 			LispPlugin.getDefault().out("=== Error - no project (.asd) file found.");	
		 			return false;
		 		}
	 			String asdName = fpathparts[fpathparts.length-1].replace(".asd", "");
	 			
	 			commandLine.add("--load");
	 			commandLine.add(asdFile);
	 			commandLine.add("--eval");
	 			commandLine.add("(asdf:oos 'asdf:load-op \""+asdName+"\")");
				
				commandLine.add("--eval");
				if( pkg != null && !pkg.equals("") && !pkg.equalsIgnoreCase("nil")){
					commandLine.add("(sb-ext:save-lisp-and-die \""
							+exeFile+"\" :executable t :toplevel '"+pkg+"::"+toplevel+" :purify t)");				
				} else {
					commandLine.add("(sb-ext:save-lisp-and-die \""
							+exeFile.replace('\\', '/')+"\" :executable t :toplevel '"+toplevel+" :purify t)");				
				}

				commandLine.add("--eval");
				commandLine.add("(print 1)");
				commandLine.add("--eval");
				commandLine.add("(print 2)");
			}
			String[] cmd = new String[commandLine.size()];				
			
			
			ProcessBuilder pb = new ProcessBuilder(commandLine.toArray(cmd));
			pb.environment().put("SBCL_HOME", path.getPath());
			try{
				LispPlugin.getDefault().out("=== Start Create Exe Log:");
				LispPlugin.getDefault().out("--- compilation command:");
				for(String str : cmd){
					System.out.println("$" + str);
					LispPlugin.getDefault().out(str);
				}
				LispPlugin.getDefault().out("--- compilation log:");
				pb.redirectErrorStream(true);
				Process p = pb.start();
				BufferedReader is = new BufferedReader(new InputStreamReader(p.getInputStream()));
			    
			    String line;
			    while ((line = is.readLine()) != null){
					LispPlugin.getDefault().out(line);
					if( line.contains("[QUIT ") ){ //ended up in debugger
						/*BufferedReader es = new BufferedReader(new InputStreamReader(p.getErrorStream()));
						String errline;
					    while ((errline = es.readLine()) != null){
							LispPlugin.getDefault().out(errline);
							System.out.println(errline);
					    }*/
						p.destroy();
						LispPlugin.getDefault().out("=== Error.");				
						return false;
					} else if (line.contains("DONE")) {
						//hacky way to detect the finishing point.
						break;
					}
			    }
				
			} catch (IOException e) {
				
			} finally {
				LispPlugin.getDefault().out("=== End Create Exe Log.");				
			}
		}
		
		LispPlugin.getDefault().out("=== Success.");	
		return true;
	}
	
	/*public Process startHarder(String loadPath) throws IOException {
		System.out.println("startHarder");
		ProcessBuilder pb;
		String[] commandLine = new String[] {
				executable.getPath(),
				"--dynamic-space-size", "100"
				//"--load", loadPath
		};
		
		pb = new ProcessBuilder(commandLine);
		this.loadPath = loadPath;
		pb.environment().put("SBCL_HOME", path.getPath());
		return pb.start();
	}*/
	
	public String getLoadCuspCommand() {
		return "(load \"" + this.loadPath.replace("\\", "\\\\") + "\")\n";
	}

	
	
}
