/*******************************************************************************
 * Copyright (c) 2000, 2003 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package jasko.tim.lisp.wizards;

import java.io.File;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.widgets.*;
import org.eclipse.swt.layout.*;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.*;
import org.eclipse.jface.viewers.*;
import org.eclipse.core.resources.*;

/**
 * Creates a new Soar Project.
 * 
 * @author Tim Jasko
 */

public class NewProjectWizPage1 extends WizardPage {
	private Text projectName;
	private Text customProjectPath;
	public boolean useUnitTests = true;
	public boolean makeExampleFunction = true;

	/**
	 * Constructor.
	 * @param selection The selection this wizard was called on.
	 */
	public NewProjectWizPage1(ISelection selection) {
		super("wizardPage");
		setTitle("New Lisp Project");
		setDescription("This wizard creates a new Lisp project");
		//this.selection = selection;
	}

	public void createControl(final Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout(3, false);
		layout.verticalSpacing = 2;
		container.setLayout(layout);
		GridData gd;

		Label label = new Label(container, SWT.NULL);
		label.setText("Project name:");

		projectName = new Text(container, SWT.BORDER | SWT.SINGLE);
		projectName.addModifyListener(new ValidationListener());
		projectName.setLayoutData(gd = new GridData(GridData.FILL_HORIZONTAL));
		gd.horizontalSpan = 2;

		// GridData.horizontalSpan = 3 isn't cooperating; messy, but effective
		new Label(container, SWT.NULL);
		new Label(container, SWT.NULL);
		new Label(container, SWT.NULL);

		final Button useDefaultLocation = new Button(container, SWT.CHECK);
		new Label(container, SWT.NULL);
		new Label(container, SWT.NULL);

		label = new Label(container, SWT.NULL);
		label.setText("Location:");

		customProjectPath = new Text(container, SWT.BORDER | SWT.SINGLE);
		customProjectPath.setEditable(false);
		customProjectPath.addModifyListener(new ValidationListener());
		customProjectPath.setLayoutData(gd = new GridData(GridData.FILL_HORIZONTAL));

		final Button chooseLocation = new Button(container, SWT.PUSH);
		chooseLocation.setEnabled(false);
		customProjectPath.setEnabled(false);

		final Button useTests = new Button(container, SWT.CHECK);
		new Label(container, SWT.NULL);
		new Label(container, SWT.NULL);

		final Button makeExample = new Button(container, SWT.CHECK);
		new Label(container, SWT.NULL);
		new Label(container, SWT.NULL);
		
		useDefaultLocation.setSelection(true);
		useDefaultLocation.addSelectionListener(new SelectionListener () {
			public void widgetDefaultSelected (SelectionEvent e) {
				widgetSelected(e);
			}

			public void widgetSelected (SelectionEvent e) {
				boolean useDefaultPath = useDefaultLocation.getSelection();
				chooseLocation.setEnabled(!useDefaultPath);
				customProjectPath.setEnabled(!useDefaultPath);
			}
		});
		useDefaultLocation.setText("Use default location");

		useTests.setSelection(true);
		useTests.addSelectionListener(new SelectionListener () {
			public void widgetDefaultSelected (SelectionEvent e) {
				widgetSelected(e);
			}

			public void widgetSelected (SelectionEvent e) {
				useUnitTests= useTests.getSelection();
			}
		});
		useTests.setText("Use lisp-unit testing framework");

		makeExample.setSelection(true);
		makeExample.addSelectionListener(new SelectionListener () {
			public void widgetDefaultSelected (SelectionEvent e) {
				widgetSelected(e);
			}

			public void widgetSelected (SelectionEvent e) {
				makeExampleFunction = makeExample.getSelection();
			}
		});
		makeExample.setText("Generate code for an example function.");

		chooseLocation.setText("Browse...");
		chooseLocation.addMouseListener(new MouseAdapter () {
			public void mouseDown (MouseEvent e) {
				DirectoryDialog fd = new DirectoryDialog(parent.getShell(), SWT.OPEN);
				fd.setMessage("Choose Location for New Lisp Project");
				String path = fd.open();
				if (path != null) customProjectPath.setText(path);
			}
		});


		initialize();
		setControl(container);
	}
	
	/**
	 * Initializes the project name to one that is available.
	 */
	private void initialize() {
		String name;
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject project;
		int projectNum = 1;

		// Find an available project name to use as the default
		do {
			name = "new-lisp" + projectNum;

			project = root.getProject(name);

			projectNum++;
		} while (project.exists() && projectNum <= 99);

		projectName.setText(name);
		projectName.setFocus();
	} // void initialize()
	
	private class ValidationListener implements ModifyListener {
		public void modifyText(ModifyEvent e) {
			String projectName = getProjectName();
			// Characters which cannot be used in a resource name:
			char[] invalids = {'*', '\\', '/', '"', ':', '<', '>', '|', '?'};

			if (projectName.length() == 0) {
				updateStatus("Project name must be specified");
				return;
			} // if

			for (int i=0; i<invalids.length; i++) {
				if (projectName.indexOf(invalids[i]) != -1 ) {
					updateStatus(invalids[i] +
							" is an invalid character in the project name " + projectName);
					return;
				} // if
			} // for i

			if (projectName.charAt(projectName.length() - 1) == '.') {
				updateStatus("Resource name cannot end in a period.");
				return;
			} // if

			//Make sure the project doesn't already exist
			IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
			IProject newProject = root.getProject(getProjectName());
			if (newProject.exists()) {
				updateStatus("A project with that name already exists.");
				return;	
			} // if

			if (customProjectPath.isEnabled()) {
				if (new File(getCustomProjectPath(), getProjectName()).exists()) {
					updateStatus("A directory with that project name already exists in that location.");
					return;
				}
			}

			updateStatus(null);
		} // void dialogChanged()
	}

	/**
	 * Updates the wizard status message.
	 * @param message The new status message.
	 */
	private void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}

	/**
	 * Gets the name to be used for this project.
	 * @return The new project name.
	 */
	public String getProjectName() {
		return projectName.getText();
	}
	
	public String getCustomProjectPath () {
		return customProjectPath.isEnabled() ? customProjectPath.getText() : null;
	}
}