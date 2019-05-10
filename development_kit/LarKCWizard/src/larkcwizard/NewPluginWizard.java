package larkcwizard;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import larkcwizard.pages.LarkcPluginPage;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;


public class NewPluginWizard extends Wizard implements INewWizard {

	private LarkcPluginPage _pageOne;
	
	public NewPluginWizard() {
		setWindowTitle("LarKC plug-in Project Wizard");
	}


	@Override
	public void addPages() {
		super.addPages();
		
		_pageOne = new LarkcPluginPage("TOOOO");
		
		_pageOne.setMessage("Create new LarKC plug-in Project");
		URL url=null;
		try {
			url = new URL(larkcwizard.Activator.getDefault().getDescriptor().getInstallURL(), "LarKCLogo.png");
			_pageOne.setImageDescriptor(ImageDescriptor.createFromURL(url));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		_pageOne.setTitle("Create new LarKC plug-in Project");
		_pageOne.setDescription("Create a new LarKC plug-in");
	
		addPage(_pageOne);
   }


	
	@Override
	public boolean performFinish() {
		 String name = _pageOne.getProjectName();
		 URI location = _pageOne.getLocationURI();
		
		 LarKCPluginProjectSupport.createProject(name, location, _pageOne.getPlatformHome(), _pageOne.getPluginType());

		return true;
	}

	/*@Override
	public boolean canFinish(){
		return true;
	}*/

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// TODO Auto-generated method stub

	}

}
