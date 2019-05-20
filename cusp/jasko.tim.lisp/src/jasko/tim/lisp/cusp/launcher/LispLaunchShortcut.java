package jasko.tim.lisp.cusp.launcher;

import org.eclipse.ui.IEditorPart;
import org.eclipse.debug.ui.ILaunchShortcut;
import org.eclipse.jface.viewers.ISelection;
/*
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.jface.viewers.IStructuredSelection;

import jasko.tim.lisp.LispPlugin;
*/
public class LispLaunchShortcut implements ILaunchShortcut {

	public void launch(ISelection selection, String mode) {
/*
        // check for most recent lisp config
        ILaunchManager launchManager = DebugPlugin.getDefault().getLaunchManager();
        ILaunchConfigurationType type = 
        	launchManager.getLaunchConfigurationType(LispPlugin.ID_LAUNCH_CONFIGURATION_TYPE);
        try {
            ILaunchConfiguration[] configurations = launchManager.getLaunchConfigurations(type);
            for (int i = 0; i < configurations.length; i++) {
                ILaunchConfiguration configuration = configurations[i];
                String attribute = configuration.getAttribute(DebugCorePlugin.ATTR_PDA_PROGRAM, (String)null);
                if (path.equals(attribute)) {
                    DebugUITools.launch(configuration, mode);
                    return;
                }
            }
        } catch (CoreException e) {
            return;
        }
        
        try {
            // create a new configuration 
            ILaunchConfigurationWorkingCopy workingCopy = type.newInstance(null, file.getName());
            workingCopy.setAttribute(DebugCorePlugin.ATTR_PDA_PROGRAM, path);
            ILaunchConfiguration configuration = workingCopy.doSave();
            DebugUITools.launch(configuration, mode);
        } catch (CoreException e1) {
        } */
	}

	public void launch(IEditorPart editor, String mode) {
	}

}
