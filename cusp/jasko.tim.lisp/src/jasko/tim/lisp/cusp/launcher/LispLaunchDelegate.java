package jasko.tim.lisp.cusp.launcher;

import jasko.tim.lisp.LispPlugin;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.LaunchConfigurationDelegate;

public class LispLaunchDelegate extends LaunchConfigurationDelegate {

	public void launch(ILaunchConfiguration configuration, String mode,
			ILaunch launch, IProgressMonitor monitor) throws CoreException {

		String program = configuration.getAttribute(LispPlugin.ATTR_LISP_EXE, (String)null);
		String flavor = configuration.getAttribute(LispPlugin.ATTR_LISP_FLAVOR, (String)null);
		if (program == null || flavor == null) {
			abort("Lisp Exe unspecified.", null);
		}
		if( !LispPlugin.getDefault().startCusp(flavor,program) ){
			abort("Cusp is not started", null);
		}
	}

	private void abort(String message, Throwable e) throws CoreException {
		throw new CoreException(new Status(IStatus.ERROR, 
				LispPlugin.getDefault().getBundle().getSymbolicName(), 0, message, e));
	}
	
/* TODO: should we launch cusp on free port rather than on prespecified?
	**
	 * Returns a free port number on localhost, or -1 if unable to find a free port.
	 * 
	 * @return a free port number on localhost, or -1 if unable to find a free port
	 *
	public static int findFreePort() {
		ServerSocket socket= null;
		try {
			socket= new ServerSocket(0);
			return socket.getLocalPort();
		} catch (IOException e) { 
		} finally {
			if (socket != null) {
				try {
					socket.close();
				} catch (IOException e) {
				}
			}
		}
		return -1;		
	}		
*/	
}
