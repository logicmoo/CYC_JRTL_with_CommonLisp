package jasko.tim.lisp.cusp;

import jasko.tim.lisp.LispPlugin;
import jasko.tim.lisp.preferences.PreferenceConstants;

import java.io.File;
import java.io.IOException;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * This is a very simple class that starts the lisp that the user
 * chose in the preferences
 *  
 * @author Marc Halbruegge
 */
public class SiteWideImplementation extends LispImplementation {
	
	private File executable = null;
	private String loadPath = null;

	/**
	 * @return Lisp implementation found in the preferences, or null if none is found
	 */
	static public LispImplementation findImplementation() {
		System.out.println("SiteWideImplementation: Searching for Implementation");
		String lispType = LispPlugin.getDefault().getPreferenceStore().getString(PreferenceConstants.LISP_TYPE);
		IPreferenceStore prefStore = LispPlugin.getDefault().getPreferenceStore();
		String executable = prefStore.getString(PreferenceConstants.LISP_EXE);
		System.out.println("Lisp Executable is "+executable);
		if (executable.trim()!="") {
			LispImplementation impl = null;
			if (lispType==PreferenceConstants.SBCL_LISP){
				System.out.println("Attempting to find SBCL lisp"+lispType);
				impl = SBCLImplementation.makeImplementation(executable);
			}
			if (impl==null) {
				System.out.println("Attempting to find a SiteWideImplementation"+lispType);
				return new SiteWideImplementation(executable);
			}	
			return impl;
		}
		return null;
	}

	
	/**
	 * Constructs an instance of an Lisp implementation.  Does NOT start an Lisp process,
	 * or find an Lisp implementation on the host machine.
	 * 
	 * @see start()
	 * @param executable full path read from the preferences
	 */
	public SiteWideImplementation(String executable) {
		this.executable = new File(executable);
	}

	public boolean isValid() { 
		return executable != null; 
	}
	
	public ProcessBuilder start(String loadPath, int port) throws IOException {
		if (isValid()) {
			if (!executable.exists()) {
				throw new IllegalArgumentException("Executable file does not exist :'" + executable + "'");
			}
			String[] commandLine = new String[] {
				executable.getPath()
				//"--load", loadPath
			};
		
			pb = new ProcessBuilder(commandLine);
			pb.directory(new File(executable.getParent()));
			this.loadPath = loadPath;
			return pb;
		}
		return null;
	}
	
	public String getLoadCuspCommand() {
		return "(load \"" + this.loadPath.replace("\\", "\\\\") + "\")\n";
	}
}
