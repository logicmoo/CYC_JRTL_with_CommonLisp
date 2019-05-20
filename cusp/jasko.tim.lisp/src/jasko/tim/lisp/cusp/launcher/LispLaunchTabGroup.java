package jasko.tim.lisp.cusp.launcher;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;
import org.eclipse.debug.ui.CommonTab;
//import org.eclipse.debug.ui.sourcelookup.SourceLookupTab;

public class LispLaunchTabGroup extends AbstractLaunchConfigurationTabGroup {

	public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
		setTabs(new ILaunchConfigurationTab[] {
				new LispLaunchTab(),
				new CommonTab()
		//		new SourceLookupTab(),
		});
	}

}
