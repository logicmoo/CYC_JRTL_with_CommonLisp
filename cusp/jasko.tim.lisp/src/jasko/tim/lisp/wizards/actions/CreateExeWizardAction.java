package jasko.tim.lisp.wizards.actions;

import jasko.tim.lisp.LispPlugin;
import jasko.tim.lisp.wizards.CreateExeWizard;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IWorkbench;

public class CreateExeWizardAction implements IActionDelegate {

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
			if (obj instanceof IResource) {
				IResource item = (IResource) obj;
				IProject project = item.getProject();
				String asdFile = null;
				try {
					if (item instanceof IFile && item.getFileExtension().equalsIgnoreCase("asd")) {
						asdFile = item.getLocation().toString();
					} else {
						for (IResource member: project.members()) {
							if (member instanceof IFile && member.getFileExtension().equalsIgnoreCase("asd")) {
								asdFile = member.getLocation().toString();
							}
						}
					}
					if (asdFile != null) {
						// run wizard, project, asdFile
						// Create the wizard
						LispPlugin.getDefault().activateConsole();
						CreateExeWizard wiz = new CreateExeWizard(asdFile);

						// Create the wizard dialog
						WizardDialog dialog = new WizardDialog(
								getWorkbench().getActiveWorkbenchWindow().getShell(), wiz);

						// Open the dialog
						dialog.open();
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
	}

	public IWorkbench getWorkbench() {
		return LispPlugin.getDefault().getWorkbench();
	}
}
