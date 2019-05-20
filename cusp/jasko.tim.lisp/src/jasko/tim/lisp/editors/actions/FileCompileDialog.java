package jasko.tim.lisp.editors.actions;

import jasko.tim.lisp.LispPlugin;
import jasko.tim.lisp.preferences.PreferenceConstants;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.window.Window;
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


public class FileCompileDialog extends Dialog {
	private int ID_PROJECT = 6;

	public boolean ignoreIt = false;
	public boolean stopAnnoying = false;
	
	private String titleBarText = "Project Errors";
	private Shell  parentShell;
	private Button dontShow;
	private Button ignore;
	private Label  imageLabel;

	private Shell textShell;
	private String message = "";
	
	public FileCompileDialog(Shell parentShell) {
		super(parentShell);
		this.parentShell = parentShell;
	}
	
	public FileCompileDialog(Shell parentShell,String message) {
		super(parentShell);
		this.parentShell = parentShell;
		setMessage(message);
	}

	protected void configureShell(Shell shell) {
		super.configureShell(shell);
		textShell = shell;
		textShell.setText(titleBarText);
	}

	public void setText (String txt) {
		textShell.setText(txt);
	}
	public void setMessage (String message) {
		this.message = message;
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
		Image image = getSWTImage(SWT.ICON_ERROR);

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
		Label text = new Label(comp,SWT.NULL);
		text.setLayoutData(data);
		text.setText(message);
		return comp;
	}

	protected void createButtonsForButtonBar(Composite parent) {
		super.createButtonsForButtonBar(parent);
		createButton(parent,ID_PROJECT , "Ignore", false);
		Composite comp = new Composite(parent,SWT.NONE);
		RowLayout layout = new RowLayout(SWT.VERTICAL);
		comp.setLayout(layout);
		dontShow = new Button(comp,SWT.CHECK);
		dontShow.setText("Stop annoying me!");
	}

	
	protected void buttonPressed(int buttonId) {
		int id = buttonId;
		if (buttonId==ID_PROJECT) {
			ignoreIt = true;
			id = Window.OK;
		}
		else {
			ignoreIt = false;
		}	

		if (id==Window.OK) {
			stopAnnoying = dontShow.getSelection();
		}
		LispPlugin.getStore().setValue(PreferenceConstants.SHOW_ECLIPSE_COMPILE_WARNING_DIALOG, !stopAnnoying);		
		super.buttonPressed(id);

	}
}

