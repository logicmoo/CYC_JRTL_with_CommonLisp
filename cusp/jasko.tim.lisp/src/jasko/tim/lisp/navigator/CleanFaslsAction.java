package jasko.tim.lisp.navigator;

import java.lang.reflect.InvocationTargetException;

import jasko.tim.lisp.LispPlugin;
import jasko.tim.lisp.cusp.CuspInterface;
import jasko.tim.lisp.cusp.LispImplementation;

import org.eclipse.core.resources.*;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.*;
import org.eclipse.ui.*;

public class CleanFaslsAction implements IActionDelegate {
	IStructuredSelection selection;

	public void selectionChanged(IAction action, ISelection selection) {
		if(selection instanceof IStructuredSelection) {
			this.selection = (IStructuredSelection) selection;
		}
	}

	public void run(IAction action) {
		if (selection != null && selection.size() == 1) {
			Object obj = selection.getFirstElement();
			if (obj instanceof IProject) {
				final IProject project = (IProject) obj;
				if (project.isOpen()) {
					IRunnableWithProgress op = new IRunnableWithProgress() {
						public void run(IProgressMonitor monitor) throws InvocationTargetException {
							monitor.beginTask("Deleting fasls...", 10);
							try {
								project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
							} catch (CoreException e) {
								e.printStackTrace();
							}
							monitor.worked(2);
							cleanFasls(project, monitor);
							monitor.done();
						}
					};
					try {
						getWorkbench().getProgressService().run(true, false, op);
					} catch (InvocationTargetException e) {
						e.printStackTrace();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
	
	private void cleanFasls(IContainer folder, IProgressMonitor monitor) {
		if (folder.exists()) {
			try {
				for (IResource resource: folder.members()) {
					if (resource instanceof IContainer) {
						cleanFasls((IContainer) resource, monitor);
					} else if (resource instanceof IFile) {
						IFile file = (IFile) resource;
						String fname = file.getName();
						
						if (file.exists() && LispImplementation.isCompilerOutput(fname)) {
							file.delete(true, monitor);
						}
					}
				}
				// TODO: also delete fasls from .cusp folder, if use cusp to manage packages
				CuspInterface cusp = LispPlugin.getDefault().getCusp();
				if( cusp.isConnected() && cusp.getManagePackages() ){
					//String cuspFolder = "this";
				}
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
	}

	public IWorkbench getWorkbench() {
		return LispPlugin.getDefault().getWorkbench();
	}
}