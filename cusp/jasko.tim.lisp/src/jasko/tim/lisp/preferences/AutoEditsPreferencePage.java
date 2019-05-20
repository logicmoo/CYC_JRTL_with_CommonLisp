package jasko.tim.lisp.preferences;

import jasko.tim.lisp.LispPlugin;
import jasko.tim.lisp.preferences.PreferenceInitializer;

import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.*;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class AutoEditsPreferencePage extends PreferencePage implements
		IWorkbenchPreferencePage {

	//The list that displays the current autoedits words
	private List autoEditsList;
	//The newEntryText is the text where new bad words are specified
	private Text newEntryText;

	/*
	 * @see PreferencePage#createContents(Composite)
	 */
	protected Control createContents(Composite parent) {

		Composite entryTable = new Composite(parent, SWT.NULL);

		//Create a data that takes up the extra space in the dialog .
		GridData data = new GridData(GridData.FILL_HORIZONTAL);
		data.grabExcessHorizontalSpace = true;
		entryTable.setLayoutData(data);

		GridLayout layout = new GridLayout();
		entryTable.setLayout(layout);			
				
		//Add in a dummy label for spacing
		new Label(entryTable,SWT.NONE);

		autoEditsList = new List(entryTable, SWT.BORDER);
		autoEditsList.setItems(PreferenceInitializer.getCustomAutoEditsPreference());

		//Create a data that takes up the extra space in the dialog and spans both columns.
		data = new GridData(GridData.FILL_BOTH);
		autoEditsList.setLayoutData(data);
		
		Composite buttonComposite = new Composite(entryTable,SWT.NULL);
		
		GridLayout buttonLayout = new GridLayout();
		buttonLayout.numColumns = 2;
		buttonComposite.setLayout(buttonLayout);

		//Create a data that takes up the extra space in the dialog and spans both columns.
		data = new GridData(GridData.FILL_BOTH | GridData.VERTICAL_ALIGN_BEGINNING);
		buttonComposite.setLayoutData(data);		
		
		Button addButton = new Button(buttonComposite, SWT.PUSH | SWT.CENTER);

		addButton.setText("Add to List"); //$NON-NLS-1$
		addButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				autoEditsList.add(newEntryText.getText(), autoEditsList.getItemCount());
			}
		});
		
		newEntryText = new Text(buttonComposite, SWT.BORDER);
		//Create a data that takes up the extra space in the dialog .
		data = new GridData(GridData.FILL_HORIZONTAL);
		data.grabExcessHorizontalSpace = true;
		newEntryText.setLayoutData(data);
		
		
		Button removeButton = new Button(buttonComposite, SWT.PUSH | SWT.CENTER);

		removeButton.setText("Remove Selection"); //$NON-NLS-1$
		removeButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				autoEditsList.remove(autoEditsList.getSelectionIndex());
			}
		});
		
		data = new GridData();
		data.horizontalSpan = 2;
		removeButton.setLayoutData(data);

		return entryTable;
	}

	/*
	 * @see IWorkbenchPreferencePage#init(IWorkbench)
	 */
	public void init(IWorkbench workbench) {
		//Initialize the preference store we wish to use
		setPreferenceStore(LispPlugin.getDefault().getPreferenceStore());
		setDescription("AutoEdits allows automatic substituion as you type.\n" +
				"They consist of two parts: trigger and substitution.\n" +
				"In an AutoEdit specification these parts are seperated by ';'.\n" +
				"Position of the caret after substitution is specified by '|'.\n" +
				"\n" +
				"Example: 'let ;let ((|))'. When you type 'let ' you'll get\n" +
				"'let (())' with caret placed inside inner brackers.\n" +
				"\n" +
				"Note: AutoEdits work only in lisp code and are not triggered\n" +
				"in comments or strings.");
	}

	/**
	 * Performs special processing when this page's Restore Defaults button has been pressed.
	 * Sets the contents of the nameEntry field to
	 * be the default 
	 */
	protected void performDefaults() {
		autoEditsList.setItems(PreferenceInitializer.getDefaultCustomAutoEditsPreference());
	}
	/** 
	 * Method declared on IPreferencePage. Save the
	 * author name to the preference store.
	 */
	public boolean performOk() {
		PreferenceInitializer.setCustomAutoEditPreference(autoEditsList.getItems());
		return super.performOk();
	}

	

}