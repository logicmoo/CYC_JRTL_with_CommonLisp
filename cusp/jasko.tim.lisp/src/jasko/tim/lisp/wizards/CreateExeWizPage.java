package jasko.tim.lisp.wizards;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;

public class CreateExeWizPage extends WizardPage {

	private Text exePath;
	private Text exeFile;
	private Text topLevel;
	private Text pkg;
	
	private String asd;
	private String ext;
	
	public CreateExeWizPage(String asdFile, String exeExt) {
		super("wizardPage");
		setTitle("Create Executable");
		setDescription("This wizard creates an executable from lisp project");
		asd = asdFile;
		ext = exeExt;
	}
	
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 3;
		layout.verticalSpacing = 9;
		Label label = new Label(container, SWT.NULL);
		label.setText("Project file:");
		label = new Label(container, SWT.NULL);
		label.setText(asd);
		label = new Label(container, SWT.NULL);
		label.setText("");

 		asd = asd.replace('\\', '/');
 		String[] fpathparts = asd.split("/");
 		String asdName = "";
 		String asdPath = "";
 		if( fpathparts.length > 0 && fpathparts[fpathparts.length-1].matches(".+\\.asd") ){
 	 		asdName = fpathparts[fpathparts.length-1].replace(".asd", "");
 	 		for(int i = 0; i < fpathparts.length-1; ++i){
 	 			asdPath += fpathparts[i]+"/";
 	 		}
 		}		
		
		label = new Label(container, SWT.NULL);
		label.setText("&Exe file name:");

		exeFile = new Text(container, SWT.BORDER | SWT.SINGLE);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		exeFile.setLayoutData(gd);		
 		exeFile.setText(asdName+ext);
		label = new Label(container, SWT.NULL);
		label.setText("");

		label = new Label(container, SWT.NULL);
		label.setText("&Exe file path:");

		exePath = new Text(container, SWT.BORDER | SWT.SINGLE);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		exePath.setLayoutData(gd);		
 		exePath.setText(asdPath);
		Button button = new Button(container, SWT.PUSH);
		button.setText("Browse...");
		button.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleBrowse();
			}
		});
 		
		label = new Label(container, SWT.NULL);
		label.setText("&Package:");
		label.setToolTipText("Package which contains top level form");

		pkg = new Text(container, SWT.BORDER | SWT.SINGLE);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		pkg.setLayoutData(gd);
 		pkg.setText(asdName);
 		pkg.setToolTipText("Package which contains top level form");
		label = new Label(container, SWT.NULL);
		label.setText("");
 		
		String topLevelTip = "Top level form.\nThis is a function that is called when Exe starts.\nIt should accept no arguments and return integer.";
		label = new Label(container, SWT.NULL);
		label.setText("&Top level form:");
		label.setToolTipText(topLevelTip);

		topLevel = new Text(container, SWT.BORDER | SWT.SINGLE);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		topLevel.setLayoutData(gd);
 		topLevel.setText("main");
 		topLevel.setToolTipText(topLevelTip);
		label = new Label(container, SWT.NULL);
		label.setText("");
 		
		setControl(container);
	}

	private void handleBrowse() {
		ContainerSelectionDialog dialog = new ContainerSelectionDialog(
				getShell(), ResourcesPlugin.getWorkspace().getRoot(), false,
				"Select location where to generate executable");
		if (dialog.open() == ContainerSelectionDialog.OK) {
			Object[] result = dialog.getResult();
			if (result.length == 1) {
				exePath.setText(((Path) result[0]).toString());
			}
		}
	}

	
	public String getExeFile(){
		String path = exePath.getText().replace('\\', '/');
		if( path.charAt(path.length()-1) != '/'){
			path += "/";
		}
		return path+exeFile.getText();
	}
	
	public String getTopLevel(){
		return topLevel.getText();
	}
	
	public String getPkg(){
		return pkg.getText();
	}

}
