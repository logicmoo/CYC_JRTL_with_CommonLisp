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

public class ColorsPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	public ColorsPreferencePage() {
		super(GRID);
	}
	
	/**
	 * Creates the field editors. Field editors are abstractions of
	 * the common GUI blocks needed to manipulate various types
	 * of preferences. Each field editor knows how to save and
	 * restore itself.
	 */
	public void createFieldEditors() {
		addField(new org.eclipse.jface.preference.ColorFieldEditor(
				PreferenceConstants.COLOR_DEFAULT,
				"Default: ",
				getFieldEditorParent()));

		addField(new org.eclipse.jface.preference.ColorFieldEditor(
				PreferenceConstants.COLOR_STRINGS,
				"Strings: ",
				getFieldEditorParent()));

		addField(new org.eclipse.jface.preference.ColorFieldEditor(
				PreferenceConstants.COLOR_COMMENT,
				"Comments: ",
				getFieldEditorParent()));

		addField(new org.eclipse.jface.preference.ColorFieldEditor(
				PreferenceConstants.COLOR_SYMBOL,
				"Symbols: ",
				getFieldEditorParent()));
		
		addField(new org.eclipse.jface.preference.ColorFieldEditor(
				PreferenceConstants.COLOR_KEYWORD,
				"Keywords: ",
				getFieldEditorParent()));
		
		addField(new org.eclipse.jface.preference.ColorFieldEditor(
				PreferenceConstants.COLOR_GLOBAL,
				"Globals: ",
				getFieldEditorParent()));
		
		addField(new org.eclipse.jface.preference.ColorFieldEditor(
				PreferenceConstants.COLOR_CONSTANT,
				"Constants: ",
				getFieldEditorParent()));

		addField(new org.eclipse.jface.preference.ColorFieldEditor(
				PreferenceConstants.COLOR_NUMBER,
				"Numbers: ",
				getFieldEditorParent()));
		
		addField(new org.eclipse.jface.preference.ColorFieldEditor(
				PreferenceConstants.COLOR_PARAMS,
				"Parameters: ",
				getFieldEditorParent()));

		addField(new org.eclipse.jface.preference.ColorFieldEditor(
				PreferenceConstants.COLOR_PAREN,
				"Parentheses: ",
				getFieldEditorParent()));
		
		addField(new org.eclipse.jface.preference.ColorFieldEditor(
				PreferenceConstants.COLOR_UCW,
				"Ucw Tags: ",
				getFieldEditorParent()));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
		setPreferenceStore(LispPlugin.getDefault().getPreferenceStore());
		setDescription("Set colors and styles for Lisp code formatting.\n" +
		"To see changes - close and reopen a lisp editor.\n" +
		"For lisp expression highlighting see prefernce page:\n" +
		"Preferences->General->Editors->Text Editors->Annotations\n" +
		"(Current Lisp Expression and Outer Lisp Expression)");
	}
	
}