package jasko.tim.lisp.navigator;

import jasko.tim.lisp.LispPlugin;
import jasko.tim.lisp.cusp.CuspInterface;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.*;
import org.eclipse.ui.*;

public class LoadFileAction implements IActionDelegate {
	IStructuredSelection selection;

	public void selectionChanged(IAction action, ISelection selection) {
		if(selection instanceof IStructuredSelection) {
			this.selection = (IStructuredSelection) selection;
		}
	}

	public void run(IAction action) {
		if (selection != null && selection.isEmpty() == false 
				&& selection instanceof IStructuredSelection) {
			IStructuredSelection ssel = (IStructuredSelection) selection;
			if (ssel.size() > 1)
				return;
			Object obj = ssel.getFirstElement();
			if (obj instanceof IFile) {
				IFile file = (IFile) obj;
				String filePath = file.getLocation().toOSString().replace("\\", "\\\\");
				String command = "(load \"" + filePath + "\")";
			
				CuspInterface cusp = LispPlugin.getDefault().getCusp();
				cusp.sendEval(command, null);
			}
		}
	}

	public IWorkbench getWorkbench() {
		return LispPlugin.getDefault().getWorkbench();
	}
}
