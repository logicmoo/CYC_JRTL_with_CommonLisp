package larkcwizard.pages;

import java.io.File;

import larkcwizard.PluginTemplates;

import org.eclipse.core.internal.resources.Folder;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IPathVariableManager;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.internal.ide.IDEWorkbenchMessages;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class LarkcPluginPage extends WizardNewProjectCreationPage{

Combo selectPluginType;
Text locationPathField;
Text addressText;

private String PlatformLocation = null;

	
	/**
	 * Constructor. Sets the page name and scans for LarKC platform project in the workspace.
	 * @param pageName
	 */
	public LarkcPluginPage(String pageName) {
		super(pageName);
		findLarKCPlatform();
	}
	
	/**
	 * returns the platform location
	 * 
	 * @return
	 */
	public IPath getPlatformHome(){
		return new Path(locationPathField.getText());
	}
	
	/**
	 * returns the selected plug-in type
	 * 
	 * @return
	 */
	public PluginTemplates.LarKCPlugin getPluginType(){
		for (PluginTemplates.LarKCPlugin plugin_type : PluginTemplates.LarKCPlugin.values()) {
			if( plugin_type.name().equals(selectPluginType.getText())){
				return plugin_type;
			}
		}
		return null;
	}
	
	/**
	 * Scans for platform project in the workspace
	 */
	private void findLarKCPlatform() {
		Logger log = LoggerFactory.getLogger(LarkcPluginPage.class);
		IPathVariableManager varManager =  ResourcesPlugin.getWorkspace().getPathVariableManager();
		log.info("Varmanager: "+ varManager);
		IPath platformPath = varManager.getValue("PLATFORM_ROOT");
		if (platformPath != null)
			PlatformLocation = platformPath.toString();

		
		//if LarKC project inhere then it overrides it
		/*IWorkspace root = ResourcesPlugin.getWorkspace();
	    IProject[] projects = root.getRoot().getProjects();
	     
	    for( int i =0; i < projects.length; i++)
	    {  
	    	if (projects[i].getName().equals("LarKC platform"))
	    		PlatformLocation = projects[i].getFullPath().toString();
	    }*/
	}
		

	@Override
	public void createControl(Composite parent) {
		super.createControl(parent);
		
		//get the panel and set the gridData
		Composite composite = (Composite) getControl();
		GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
		gridData.widthHint = 250;
		
		//line separator
		Label line = new Label(composite, SWT.SEPARATOR|SWT.HORIZONTAL|SWT.BOLD);
		line.setLayoutData(gridData);
		
		// platform selection panel
		createPlatformSelection(composite,true);
		
		//another line separator
		Label line2 = new Label(composite, SWT.SEPARATOR|SWT.HORIZONTAL|SWT.BOLD);
		line2.setLayoutData(gridData);
		
		RowLayout rlayout = new RowLayout();
        rlayout.wrap = true;
		Composite panel = new Composite(composite, SWT.NONE);
		panel.setLayout(rlayout);
		
		new Label (panel, SWT.NONE).setText("Select Plug-in type:");						
		selectPluginType = new Combo(panel, SWT.BORDER | SWT.READ_ONLY);
		//selectPluginType.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		for (PluginTemplates.LarKCPlugin plugin_type : PluginTemplates.LarKCPlugin.values()) {
			selectPluginType.add(plugin_type.name());
		}
	
		selectPluginType.setText(selectPluginType.getItem(0));
		
		
			
		addressText = new Text(composite, SWT.BORDER | SWT.WRAP | SWT.MULTI);
		
		
		GridData tgridData = new GridData(GridData.FILL_HORIZONTAL);
		tgridData.widthHint = 250;
		tgridData.verticalAlignment = SWT.FILL;
		tgridData.grabExcessVerticalSpace = true;
		addressText.setLayoutData(tgridData);
		
		//this event comes later so addressText is already initialized
		selectedPluginChanged(selectPluginType.getText());
		selectPluginType.addListener(SWT.Selection, new Listener() {
		      public void handleEvent(Event e) {
		        selectedPluginChanged(selectPluginType.getText());
		      }
		});
		
		setControl(parent);
		
	}
	
	
	/**
	 * Creates components for platform selection section
	 * @param composite
	 * @param defaultEnabled
	 */
	private void createPlatformSelection(Composite composite, boolean defaultEnabled) {

		int columns = 4;

		// panel for the location
		Composite locationComposite = new Composite(composite, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = columns;
		locationComposite.setLayout(layout);
		locationComposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		//label title location name
		Label locationL = new Label(locationComposite, SWT.None);
		locationL.setText("Set the location of the LarKC Platform");
		GridData buttonData = new GridData();
		buttonData.horizontalSpan = columns;
		locationL.setLayoutData(buttonData);
		

		// location label
		new Label(locationComposite, SWT.NONE).setText("Location:");
		

		// project location entry field
		locationPathField = new Text(locationComposite, SWT.BORDER);
		GridData data = new GridData(GridData.FILL_HORIZONTAL);
		data.widthHint = 250;
		data.horizontalSpan = 2;
		locationPathField.setLayoutData(data);
		locationPathField.addModifyListener(new ModifyListener() {	
			public void modifyText(ModifyEvent e) {
		         setPageComplete(validatePage());
			}
		});
		
		
		// browse button
		Button browseButton = new Button(locationComposite, SWT.PUSH);
		browseButton.setLayoutData(new GridData(92, 25));
		browseButton.setText(IDEWorkbenchMessages.ProjectLocationSelectionDialog_browseLabel);
		
		if (PlatformLocation != null){
			locationPathField.setText(PlatformLocation);
			locationPathField.setEnabled(false);
			browseButton.setEnabled(false);
		}
		browseButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				handleLocationBrowseButtonPressed();
			}
		});
	}
	
	
	
	/*private void createFileSystemSelection(Composite composite) {

		// Always use the default if that is all there is.
		if (FileSystemSupportRegistry.getInstance().hasOneFileSystem()) {
			return;
		}

		new Label(composite, SWT.NONE);

		FileSystemSelectionArea fileSystemSelectionArea = new FileSystemSelectionArea();
		fileSystemSelectionArea.createContents(composite);
	}*/
	
	/**
	 * Open an appropriate directory browser
	 */
	private void handleLocationBrowseButtonPressed() {

		String selectedDirectory = null;
		DirectoryDialog dialog = new DirectoryDialog(locationPathField.getShell(), SWT.SHEET);
		dialog.setMessage(IDEWorkbenchMessages.ProjectLocationSelectionDialog_directoryLabel);

		selectedDirectory = dialog.open();
		locationPathField.setText(selectedDirectory);
	}
	
	
	private void selectedPluginChanged(String text) {
		for (PluginTemplates.LarKCPlugin plugin_type : PluginTemplates.LarKCPlugin.values()) {
			if( plugin_type.name().equals(text)){
				addressText.setText(plugin_type.description());
			}
		}
		
	}
	
	 protected boolean validatePage() {
		 boolean isvalid = super.validatePage();
		 
		 //if valid from previous tests, then also check whether similar name exists (upper lowercase)
		 if (isvalid)
		 {
			 IWorkspace root = ResourcesPlugin.getWorkspace();
			 IProject[] projects = root.getRoot().getProjects();
			 for( int i =0; i < projects.length; i++)
			 {  
				 if (projects[i].getName().toUpperCase().equals(getProjectName().toUpperCase())){
				 	 setErrorMessage("Similar project exists! Check uppercase, lowercase letters.");
				 	 return false;
				 }
			 }
			 
			 if (locationPathField.getText().trim().equals("")){
				 setMessage("LarKC platform project must be specified!");
				 return false;
			 }
			 else
			 {
				 IPath platformDir = new Path(locationPathField.getText());
				 if (!platformDir.toFile().exists()){
					 setErrorMessage("this directory doesn't exists!");
				 	 return false;
				 }//larkc-platform.jar
				 
				 if (!platformDir.append("plugins").toFile().exists() || 
						 !platformDir.append("bin"+File.separatorChar+"larkc-platform.jar").toFile().exists()){
					 setErrorMessage("This is not valid LarKC platform home directory");
				 	 return false;
				 }
			 }
		 }//if valid
		
		 return isvalid;
	 }
	 
	
	 @Override
	 public IWizardPage getPreviousPage() {
		 return null;
	 }
}
