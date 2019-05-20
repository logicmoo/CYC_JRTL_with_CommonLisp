package jasko.tim.lisp.wizards.actions;

import jasko.tim.lisp.*;
import jasko.tim.lisp.wizards.*;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.*;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.*;

public class NewLispFileWizardAction implements IActionDelegate {
	IStructuredSelection _selection;

	public void selectionChanged(IAction action, ISelection selection) {
		if(selection instanceof IStructuredSelection) {
			_selection = (IStructuredSelection) selection;
		}
	}

	public void run(IAction action) {
		// Create the wizard
		NewLispFileWizard wiz = new NewLispFileWizard();
		wiz.init(getWorkbench(), _selection);

		// Create the wizard dialog
		WizardDialog dialog = new WizardDialog(
				getWorkbench().getActiveWorkbenchWindow().getShell(), wiz);

		// Open the dialog
		dialog.open();
	}

	public IWorkbench getWorkbench() {
		return LispPlugin.getDefault().getWorkbench();
	}
}

