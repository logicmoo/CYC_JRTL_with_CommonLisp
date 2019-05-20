package jasko.tim.lisp.wizards;

import jasko.tim.lisp.cusp.*;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.wizard.Wizard;

public class CreateExeWizard extends Wizard {

	public static final String ID = "jasko.tim.lisp.wizards.CrateExetWiz";
	
	private CreateExeWizPage page;
	private String asdFile = "";
	private LispImplementation implementation = null;
	private String exeExt = "";

	/**
	 * Constructor for NewProjectWiz.
	 */
	public CreateExeWizard(String asd) {
		super();
		setNeedsProgressMonitor(true);
		asdFile = asd;
		implementation = null;
		// Find an implementation and start a lisp process
		// the pecking order of lisps:
		if (implementation == null) {
			implementation = RemoteImplementation.findImplementation();
		}
		if (implementation == null) {
			implementation = SiteWideImplementation.findImplementation();
			}
		if (implementation == null) {
			implementation = SBCLImplementation.findImplementation();
		}
		if (implementation == null) {
			implementation = AllegroImplementation.findImplementation();
		}
		if( implementation != null ){
			exeExt = implementation.getExeExtensionForPlatform();
		}
	}
	
	/**
	 * Adding the page to the wizard.
	 */
	public void addPages() {
		page = new CreateExeWizPage(asdFile,exeExt);
		addPage(page);
	}

	
	@Override
	public boolean performFinish() {
		final String exeFile = page.getExeFile();
		final String pkg = page.getPkg();
		final String topLvl = page.getTopLevel();
		final String asd = asdFile;
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
					doFinish(exeFile, asd, pkg, topLvl, monitor);
				} catch (CoreException e) {
					throw new InvocationTargetException(e);
				} finally {
					monitor.done();
				}
			}
		};
		try {
			getContainer().run(true, false, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			Throwable realException = e.getTargetException();
			MessageDialog.openError(getShell(), "Error", realException.getMessage());
			return false;
		}
		return true;
	}

	private void doFinish(
			String exeFile,
			String asdFile,
			String pkg,
			String topLvl,
			IProgressMonitor monitor)
			throws CoreException {
		implementation.createExe(exeFile, asdFile, topLvl, pkg);
	}

}
