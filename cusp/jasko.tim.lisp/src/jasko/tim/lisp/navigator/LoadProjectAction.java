package jasko.tim.lisp.navigator;

import jasko.tim.lisp.LispPlugin;
import jasko.tim.lisp.builder.LispMarkers;

import org.eclipse.core.resources.*;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IWorkbench;

public class LoadProjectAction implements IActionDelegate {
	IStructuredSelection selection;

	public void selectionChanged(IAction action, ISelection selection) {
		if(selection instanceof IStructuredSelection) {
			this.selection = (IStructuredSelection) selection;
		}
	}

	public void run(IAction action) {
	/*	if (!LispPlugin.isDebugActive()) {*/
		if (selection != null && selection.isEmpty() == false 
				&& selection instanceof IStructuredSelection) {
			IStructuredSelection ssel = (IStructuredSelection) selection;
			if (ssel.size() > 1)
				return;
			Object obj = ssel.getFirstElement();
			if (obj instanceof IResource) {
				IResource item = (IResource) obj;
				IProject project = item.getProject();
				IFile file = null;
				String asdFile = null;
				try {
					if (item instanceof IFile && item.getFileExtension().equalsIgnoreCase("asd")) {
						file = (IFile)item;
						asdFile = item.getLocation().toString();
					} else {
						for (IResource member: project.members()) {
							if (member instanceof IFile && member.getFileExtension().equalsIgnoreCase("asd")) {
								file = (IFile)member;
								asdFile = member.getLocation().toString();
								break; //FIXME: assumes that project contains single asd - probably not bad assumption
							}
						}
					}
					if (asdFile != null) {
						LispMarkers.deletePackageErrorMarkers(project);
						LispPlugin.getDefault().getCusp().compileAndLoadAsd(file,false);
					} else {
						MessageBox mbox = new MessageBox(this.getWorkbench().getDisplay().getActiveShell(),
								SWT.CANCEL | SWT.ICON_ERROR | SWT.APPLICATION_MODAL);
				       mbox.setText("Error");
				       mbox.setMessage("No asd file was found.");
				       mbox.open();		
					}
				} catch (CoreException e) {
					e.printStackTrace();
				}
			}
		}
	/*	
		} else {
			MessageBox box = new MessageBox(LispPlugin.getActiveShell(),SWT.OK|SWT.CANCEL|SWT.ERROR);
			box.setText("Can't load a project while debug view is active");
			box.open();
		}*/
	}

	public IWorkbench getWorkbench() {
		return LispPlugin.getDefault().getWorkbench();
	}

}
