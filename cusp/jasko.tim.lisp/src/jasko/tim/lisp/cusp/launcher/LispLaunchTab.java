package jasko.tim.lisp.cusp.launcher;

import jasko.tim.lisp.*;
import jasko.tim.lisp.cusp.*;

import java.io.File;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.graphics.Image;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.core.runtime.CoreException;

public class LispLaunchTab extends AbstractLaunchConfigurationTab {

	private Text fProgramText;
	private Button fProgramButton;
	private Combo fLispFlavor;
	private static String flavors = "SBCL;CLISP;Allegro";
	private String exename;
	
	public void createControl(Composite parent) {
		Font font = parent.getFont();
		
		Composite comp = new Composite(parent, SWT.NONE);
		setControl(comp);
		GridLayout topLayout = new GridLayout();
		topLayout.verticalSpacing = 5;
		topLayout.numColumns = 3;
		comp.setLayout(topLayout);
		comp.setFont(font);
		
		createVerticalSpacer(comp, 3);

		Label flavorLabel = new Label(comp,SWT.NONE);
		flavorLabel.setText("Lisp &Flavor:");
		GridData gd = new GridData(GridData.BEGINNING);
		flavorLabel.setLayoutData(gd);
		flavorLabel.setFont(font);
		
		fLispFlavor = new Combo(comp, SWT.DROP_DOWN | SWT.READ_ONLY);
		fLispFlavor.setItems(flavors.split(";"));
		fLispFlavor.select(0);
		
		Label tmpLabel = new Label(comp,SWT.NONE);
		gd = new GridData(GridData.BEGINNING);
		tmpLabel.setLayoutData(gd);
		tmpLabel.setFont(font);
		
		gd = new GridData(GridData.FILL_HORIZONTAL);
		fLispFlavor.setLayoutData(gd);
		fLispFlavor.setFont(font);
		fLispFlavor.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				updateLaunchConfigurationDialog();
				if( fLispFlavor.getText().equalsIgnoreCase("SBCL") ){
					updateProgramPathWithSBCL();
				}
			}
		});
		
		Label programLabel = new Label(comp, SWT.NONE);
		programLabel.setText("&Lisp Executable:");
		gd = new GridData(GridData.BEGINNING);
		programLabel.setLayoutData(gd);
		programLabel.setFont(font);
		
		fProgramText = new Text(comp, SWT.SINGLE | SWT.BORDER);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		fProgramText.setLayoutData(gd);
		fProgramText.setFont(font);
		fProgramText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				updateLaunchConfigurationDialog();
			}
		});
		updateProgramPathWithSBCL();
		
		fProgramButton = createPushButton(comp, "&Browse...", null); //$NON-NLS-1$
		fProgramButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				browseLispExeFiles();
			}
		});
	}

	private void updateProgramPathWithSBCL(){
		File file = SBCLImplementation.findExecutable();
		File folder = SBCLImplementation.findFolder();
		if( file != null && folder != null ){
			fProgramText.setText(folder.getPath()+ File.separator + file.getName());
			exename = file.getName();
		}		
	}
	
	/**
	 * Open a resource chooser to select a PDA program 
	 */
	protected void browseLispExeFiles() {
		FileDialog fd = new FileDialog(getShell());
		fd.setFileName(fProgramText.getText());
		if( exename != null && exename != ""){
			fd.setFilterNames(new String[]{exename});
		} else if( System.getProperty("os.name").toLowerCase().contains("windows") ){
			fd.setFilterExtensions(new String[]{"*.exe"});
		}
		String fileName = fd.open();
		if( fileName != null ){
			fProgramText.setText(fileName);
		}
	}
	
	public String getName() {
		return "Main";
	}

	public void initializeFrom(ILaunchConfiguration configuration) {
		try {
			String program = configuration.getAttribute(LispPlugin.ATTR_LISP_EXE, (String)null);
			if (program != null) {
				fProgramText.setText(program);
			}
			String flavor = configuration.getAttribute(LispPlugin.ATTR_LISP_FLAVOR, (String)null);
			if( flavor != null ){
				String[] flavorList = flavors.split(";");
				for( int i = 0; i < flavorList.length; ++i ){
					if(flavor.matches(flavorList[i])){
						fLispFlavor.select(i);
						break;
					}
				}				
			}
		} catch (CoreException e) {
			setErrorMessage(e.getMessage());
		}
	}

	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		String program = fProgramText.getText().trim();
		if (program.length() == 0) {
			program = null;
		}
		configuration.setAttribute(LispPlugin.ATTR_LISP_EXE, program);
		configuration.setAttribute(LispPlugin.ATTR_LISP_FLAVOR, fLispFlavor.getText());
	}

	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#isValid(org.eclipse.debug.core.ILaunchConfiguration)
	 */
	public boolean isValid(ILaunchConfiguration launchConfig) {
		setErrorMessage(null);
		setMessage(null);
		String text = fProgramText.getText();
		if (text.length() > 0) {
			File file = new File(text);
			if( !file.exists() ){
				setErrorMessage("Specified program does not exist");
				return false;
			};
		} else {
			setMessage("Specify lisp executable");
		}

		return true;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#getImage()
	 */
	public Image getImage() {
		Image img = LispPlugin.getDefault().getImageRegistry().get(CuspResources.EXEC); 
		return img; 
	}
	
}
