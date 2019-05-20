package jasko.tim.lisp.preferences;

import org.eclipse.jface.preference.*;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.IWorkbench;
import jasko.tim.lisp.LispPlugin;

/**
 * This class represents a preference page that
 * is contributed to the Preferences dialog. By 
 * subclassing <samp>FieldEditorPreferencePage</samp>, we
 * can use the field support built into JFace that allows
 * us to create a page that is small and knows how to 
 * save, restore and apply itself.
 * <p>
 * This page is used to modify preferences only. They
 * are stored in the preference store that belongs to
 * the main plug-in class. That way, preferences can
 * be accessed directly via the preference store.
 */

public class RemoteLispPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	public RemoteLispPreferencePage() {
		super(GRID);
		setPreferenceStore(LispPlugin.getDefault().getPreferenceStore());
		setDescription("Configure a remote lisp implementation.");
	}
	
	/**
	 * Creates the field editors. Field editors are abstractions of
	 * the common GUI blocks needed to manipulate various types
	 * of preferences. Each field editor knows how to save and
	 * restore itself.
	 */
	public void createFieldEditors() {
		addField(
				new BooleanFieldEditor(
					PreferenceConstants.USE_REMOTE_LISP,
					"Use a remote lisp installation (tunnel over SSH)",
					getFieldEditorParent()));
		
		addField(
				new StringFieldEditor(
						PreferenceConstants.SSH_COMMAND,
						"SSH executable:",
						getFieldEditorParent()));
		
		addField(
				new StringFieldEditor(
						PreferenceConstants.REMOTE_LISP_EXE,
						"Remote lisp command:",
						getFieldEditorParent()));
		
		addField(
				new StringFieldEditor(
						PreferenceConstants.REMOTE_INI,
						"Remote lisp initialization file:",
						getFieldEditorParent()));
		
		addField(
				new StringFieldEditor(
						PreferenceConstants.REMOTE_HOST,
						"Host to SSH into:",
						getFieldEditorParent()));
		
		addField(
				new StringFieldEditor(
						PreferenceConstants.REMOTE_USER,
						"SSH username:",
						getFieldEditorParent()));
		addField(
				new StringFieldEditor(
						PreferenceConstants.REMOTE_LOCAL_PATH_PREFIX,
						"Local path prefix:",
						getFieldEditorParent()));
		addField(
				new StringFieldEditor(
						PreferenceConstants.REMOTE_REMOTE_PATH_PREFIX,
						"Remote path prefix:",
						getFieldEditorParent()));
		
		addField(new BooleanFieldEditor(PreferenceConstants.CONSOLE_COMPILER_LOG, 
				"Write compiler log to Console", getFieldEditorParent()));		
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
	}


	
}