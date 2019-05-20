package jasko.tim.lisp.editors;


import jasko.tim.lisp.LispPlugin;
import jasko.tim.lisp.preferences.PreferenceConstants;
import jasko.tim.lisp.preferences.PreferenceInitializer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.IDocument;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.ide.FileStoreEditorInput;
import org.eclipse.ui.ide.IDE;

public class ExternalLispFileDialog extends Dialog {

	public boolean copy;
	private int ID_PROJECT = 5;
	private IContainer container;
	private Shell  parentShell;
	private Button copyFile;
	private Button dontShow;
	private Button setAsDefault;
	private Label  imageLabel;

    private Shell textShell;
	private File openFile;
	
	public ExternalLispFileDialog(Shell parentShell,FileStoreEditorInput input) {
		super(parentShell);
		openFile =new File(input.getURI());
		this.parentShell = parentShell;

		IPreferenceStore store = PreferenceInitializer.getStore();

		copy = store.getBoolean(PreferenceConstants.EXTERNAL_COPY_FILE);
		IContainer selectedContainer = LispPlugin.getCurrentSelectedContainer();
		if (selectedContainer!=null) {
			container = selectedContainer;
			if (container instanceof IProject) {
				try {
					((IProject) container).open(null);
				} catch (CoreException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} else {
			container = LispPlugin.getDefaultProject();
			if (!container.exists()) {
				try {
					((IProject)container).create(null);
				} catch (CoreException e) {
					e.printStackTrace();
				}

			}
			try {
				((IProject)container).open(null);
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
	}

	public IContainer getSelectedContainer () {
		return container;
	}
	public String relativeToRoot (IPath path) {
		return ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(path).getFullPath().toString();
	}
	protected void configureShell(Shell shell) {
		super.configureShell(shell);
		textShell = shell;
		textShell.setText("Import "+openFile.getName()+" into "+relativeToRoot(container.getLocation().makeAbsolute()));
	}
	
	public void setText (String txt) {
		textShell.setText("Import "+openFile.getName()+" into "+txt);
	}
	
	//copied from IconAndMessageDialog
	private Image getSWTImage(final int imageID) {
		Shell shell = parentShell;
		final Display display;
		if (shell == null || shell.isDisposed()) {
			shell = getParentShell();
		}
		if (shell == null || shell.isDisposed()) {
			display = Display.getCurrent();
		} else {
			display = shell.getDisplay();
		}

		final Image[] image = new Image[1];
		display.syncExec(new Runnable() {
			public void run() {
				image[0] = display.getSystemImage(imageID);
			}
		});

		return image[0];

	}
	
	
	protected Control createDialogArea(Composite parent) {

		Composite comp = (Composite) super.createDialogArea(parent);
		GridLayout layout = (GridLayout) comp.getLayout();
		layout.numColumns = 2;
	
		//below copied from IconandMessageDialog or something like that
		Image image = getSWTImage(SWT.ICON_QUESTION);
		
		if (image != null) {
			imageLabel = new Label(comp, SWT.NULL);
			image.setBackground(imageLabel.getBackground());
			imageLabel.setImage(image);
			//addAccessibleListeners(imageLabel, image);
			imageLabel.setLayoutData(new GridData(GridData.GRAB_VERTICAL));
			GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.BEGINNING)
			.applyTo(imageLabel);
		}
		
		GridData data = new GridData();
		data.horizontalIndent = 4;
		
		copyFile = new Button(comp,SWT.CHECK);
		copyFile.setText("Copy File From System");
		copyFile.setLayoutData(data);
		copyFile.setSelection(copy);
		
		return comp;
	}

	protected void createButtonsForButtonBar(Composite parent) {
		super.createButtonsForButtonBar(parent);
		createButton(parent,ID_PROJECT , "Project...", false);
		Composite comp = new Composite(parent,SWT.NONE);
		RowLayout layout = new RowLayout(SWT.VERTICAL);
		comp.setLayout(layout);
		dontShow = new Button(comp,SWT.CHECK);
		dontShow.setText("Dont show dialog in future");
		setAsDefault = new Button(comp,SWT.CHECK);
		setAsDefault.setText("Save Options");
	}

	/**
	 * Uses the standard container selection dialog to choose the new value for
	 * the container field.
	 */
//I copied alot of this from NewLispFileWizardPage...
	private IContainer handleBrowse(IContainer container) {
		IContainer newContainer = (container==null?(IProject)LispPlugin.getDefaultProject():
									container);
		ContainerSelectionDialog dialog = new ContainerSelectionDialog(
				getShell(),newContainer, false,
				"Select new file container");
		if (dialog.open() == ContainerSelectionDialog.OK) {
			Object[] result = dialog.getResult();
			if (result.length == 1) {
				IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
				IResource resource = root.findMember((Path)result[0]);
				if (resource instanceof IContainer) 
					return (IContainer) resource;
				else
					return null;	
			}
		}
		return null;
	}

	public IPath getLocation () {
		return (container!=null?container.getLocation(): null);
	}
	
	
	IEditorPart editor = null;

	private IDocument openEditor (IProgressMonitor monitor,IFile file2) {
		editor = null;
		final IFile file = file2;
		monitor.setTaskName("Opening file for editing...");
		parentShell.getDisplay().asyncExec(new Runnable() {
			public void run() {
				IWorkbenchPage page =
					PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
				try {
					editor = IDE.openEditor(page, file, true);
				} catch (PartInitException e) {
				}
			}
		});
		monitor.worked(1);
		if (editor!=null) {
			TextEditor editor2 = (TextEditor) editor;
			return editor2.getDocumentProvider().getDocument(editor2.getEditorInput());
		} 
		return null;
	}

	public IDocument  createExternalFile(
			IContainer container,
			File aFile,
			boolean copy,
			IProgressMonitor monitor) throws CoreException {
	
		try {
			IFile containerFile = container.getFile(new Path(aFile.getName())); 
				monitor.beginTask("Creating " +containerFile.getProjectRelativePath(), 2);
				if (copy) {
					try {
						containerFile.create(new FileInputStream(aFile), false, null);
					} catch (FileNotFoundException e) {
						e.printStackTrace();
						return null;
					}
				}
				else {
					containerFile.createLink(new Path(aFile.getPath()), IResource.NONE, null);
				}
				monitor.worked(1);
				return openEditor(monitor,containerFile);
		} 	catch (Exception e) {
			e.printStackTrace();
			monitor.done(); 
			return null;	
	}
}
			

	
	IDocument document = null;
	public IDocument getDocument () {
		return document;
	}

	public void finish () {
		final ExternalLispFileDialog instance = this;
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
					if (instance.getSelectedContainer()!=null) {
						IContainer container = instance.getSelectedContainer();
						if (container==null) {
							container = LispPlugin.getCurrentSelectedContainer();
							if (container==null) {
								container = LispPlugin.getDefaultProjectAndCreate();
							}
						}
						document = createExternalFile(instance.getSelectedContainer(),
								openFile,
								copy,
								monitor);
					}
				} catch (CoreException e) {
					throw new InvocationTargetException(e);
				} finally {
					monitor.done();
				}
			}
		};
		try {
			new ProgressMonitorDialog(LispPlugin.getActiveShell()).run(true,false,op);
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	protected void buttonPressed(int buttonId) {
		if (buttonId==ID_PROJECT) {
			container = handleBrowse(container);
			if (container!=null) {
				String name = relativeToRoot(container.getLocation());
				setText(name);
			}	
		}
		else {
			boolean copyFileSelect = copyFile.getSelection();
			boolean dontShowSelect = dontShow.getSelection();
			boolean setAsDefaultSelected = setAsDefault.getSelection();

			IPreferenceStore store = PreferenceInitializer.getStore();
			if (buttonId==IDialogConstants.OK_ID ) {
				store.setValue(PreferenceConstants.EXTERNAL_SHOW,!dontShowSelect);
				if (setAsDefaultSelected||dontShowSelect) {
					store.setValue(PreferenceConstants.EXTERNAL_COPY_FILE,copyFileSelect);
				}
				copy = copyFileSelect;
				finish();
			}
			super.buttonPressed(buttonId);
		


		}
	}
}
