package jasko.tim.lisp.navigator;


import jasko.tim.lisp.*;
import jasko.tim.lisp.builder.*;

import org.eclipse.core.resources.*;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.*;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.ui.*;

public class LoadAsdAction implements IActionDelegate {
	IStructuredSelection selection;

	public void selectionChanged(IAction action, ISelection selection) {
		if(selection instanceof IStructuredSelection) {
			this.selection = (IStructuredSelection) selection;
		}
	}

	public void run(IAction action) {
		/*if (!LispPlugin.isDebugActive()) {*/
			if (selection != null && selection.isEmpty() == false 
					&& selection instanceof IStructuredSelection) {
				IStructuredSelection ssel = (IStructuredSelection) selection;
				if (ssel.size() > 1)
					return;
				Object obj = ssel.getFirstElement();
				if (obj instanceof IFile) {
					IFile file = (IFile) obj;
					LispMarkers.deletePackageErrorMarkers(file.getProject());
					LispPlugin.getDefault().getCusp().compileAndLoadAsd(file,false);
				}
			}
		/*} else {
			MessageBox box = new MessageBox(LispPlugin.getActiveShell(),SWT.OK|SWT.CANCEL|SWT.ERROR);
			box.setText("Can't load a project while debug view is active");
			box.open();
		}*/
	}

	public IWorkbench getWorkbench() {
		return LispPlugin.getDefault().getWorkbench();
	}
}

