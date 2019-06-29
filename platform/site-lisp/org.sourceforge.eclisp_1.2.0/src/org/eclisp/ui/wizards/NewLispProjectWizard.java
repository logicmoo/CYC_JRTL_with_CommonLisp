package org.eclisp.ui.wizards;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;

/**
 * @see Wizard
 */
public class NewLispProjectWizard extends Wizard implements INewWizard, IExecutableExtension {
            
    public static final String LISP_PERSPECTIVE_ID = "org.eclisp.ui.perspectives.lispPerspective";
    private WizardNewProjectCreationPage mainPage;
    private IWorkbench workbench;
    private IConfigurationElement configElement;
    
	/**
	 *
	 */
	public NewLispProjectWizard() {
	    setWindowTitle("New Lisp Project");
	    setNeedsProgressMonitor(true);
	}


	
	/**
	 * This method is called when 'Finish' button is pressed in
	 * the wizard. We will create an operation and run it
	 * using wizard as execution context.
	 */
	public boolean performFinish()  {

	    final IProject project = mainPage.getProjectHandle();

		final IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
				    createNewProject(project, monitor);
				} catch (CoreException e) {
					throw new InvocationTargetException(e);
				} finally {
					monitor.done();
				}
			}
		};
		
		try {
			getContainer().run(true, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			Throwable realException = e.getTargetException();
			MessageDialog.openError(getShell(), "Error", realException.getMessage());
			return false;
		}
		
		BasicNewProjectResourceWizard.updatePerspective(configElement);
        
		return true;		
	}
	
    /**
     * create a new LispProject and open it 
     * 
     * @param project the project interface instants
     * @param monitor
     * @throws CoreException
     */
    private void createNewProject(final IProject project, IProgressMonitor monitor) throws CoreException {
        monitor.beginTask("Creating project " + project.getName(), 2);
        project.create(monitor);
        monitor.worked(1);
        project.open(monitor);
        monitor.worked(2);
    }
		
	/**
	 * Using the WizardNewProjectCreationPage to create a project
	 */
	public void addPages() {
	    
	    mainPage = new WizardNewProjectCreationPage("basicNewProjectPage");
	    mainPage.setTitle("Project");
	    mainPage.setDescription("Create a new project resource.");
	    
		addPage(mainPage);
	}
		

	/**
	 * @see Wizard#init
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection)  {
	    this.workbench = workbench;
	}



    /* (non-Javadoc)
     * @see org.eclipse.core.runtime.IExecutableExtension#setInitializationData(org.eclipse.core.runtime.IConfigurationElement, java.lang.String, java.lang.Object)
     */
    public void setInitializationData(IConfigurationElement config, String propertyName, Object data) throws CoreException {
        this.configElement = config;
    }
}
