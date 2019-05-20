package jasko.tim.lisp.preferences;

import org.eclipse.jface.preference.*;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
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

public class EditorPreferencePage
	extends FieldEditorPreferencePage
	implements IWorkbenchPreferencePage {

    private Composite autoPopupIndent;
	
	public EditorPreferencePage() {
		super(GRID);
	}
	
	/**
	 * Creates the field editors. Field editors are abstractions of
	 * the common GUI blocks needed to manipulate various types
	 * of preferences. Each field editor knows how to save and
	 * restore itself.
	 */
	public void createFieldEditors() {
		Composite parent = getFieldEditorParent();
		
        /*addField(new BooleanFieldEditor(
                PreferenceConstants.PAIR_EDIT_BRACKETS,
                "Automatically close '('",
                getFieldEditorParent())); */
    
        addField(new BooleanFieldEditor(
                PreferenceConstants.PAIR_SMART_BRACKETS,
                "Automatically close '(', enclosing next sexp in '()'",
                parent));
    
        addField(new BooleanFieldEditor(
                PreferenceConstants.PAIR_EDIT_BRACES,
                "'[' encloses next sexp it in '()'",
                parent));
    
        addField(new BooleanFieldEditor(
                PreferenceConstants.PAIR_EDIT_QUOTES,
                "Automatically close double quotes",
                parent));
    
        addField(new BooleanFieldEditor(
                PreferenceConstants.PAIR_EDIT_COMMENTS,
                "Automatically close '#|'",
                parent));
    
        addField(new BooleanFieldEditor(
                    PreferenceConstants.AUTO_POPUP_COMPLETIONS,
                    "Automatically show popup with content completions or parameter hints",
                    parent){
            private boolean installedListener = false;
            protected Button getChangeControl (Composite parent) {
                // not sure how else to get a listener installed on the actual checkbox...
                final Button b = super.getChangeControl(parent);
                if (!installedListener) b.addSelectionListener(new SelectionAdapter () {
                    public void widgetSelected (SelectionEvent e) {
                        for (Control c : autoPopupIndent.getChildren()) {
                            c.setEnabled(b.getSelection());
                        }
                    }
                });
                return b;
            }        	
        });

        autoPopupIndent = new Composite(parent, SWT.NONE);
        autoPopupIndent.setLayout(new GridLayout(2, false));
        addField(new StringFieldEditor(
                PreferenceConstants.AUTO_POPUP_COMPLETIONS_DELAY,
                "Delay before popup is shown (ms):",
                autoPopupIndent));
        
        for (Control c : autoPopupIndent.getChildren()) {
            GridData gd = new GridData(GridData.BEGINNING, GridData.CENTER, false, false, 1, 1);
            gd.horizontalIndent = 25;
            c.setLayoutData(gd);
        }
        new Label(parent,SWT.NONE);
        
        addField(new StringFieldEditor(
                PreferenceConstants.MAX_HINT_LINES,
                "Maximum number of lines in documentation hints:",
                parent));

        addField(new BooleanFieldEditor(
                PreferenceConstants.ARGLIST_BELOW,
                "Show documentation hints below cursor.",
                parent));
        
        addField(new BooleanFieldEditor(
                PreferenceConstants.AUTO_INSERT_COMPLETIONS,
                "Automatically insert single content completion",
                parent));

		addField(new StringFieldEditor(PreferenceConstants.AUTO_COMPLETIONS_NLIMIT, 
				"Max size of completion list (0 for no limit):",
				parent));

        addField(new BooleanFieldEditor(
                PreferenceConstants.AUTO_FUZZY_COMPLETIONS,
                "Use fuzzy mode for autocompletions",
                parent));

        addField(new BooleanFieldEditor(
                PreferenceConstants.DOCS_IN_COMPLETIONS,
                "Show quick documentation with auto completions list",
                parent));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
		setPreferenceStore(LispPlugin.getDefault().getPreferenceStore());
		setDescription("The editing environment (colors, autocomplete, etc.).");
	}
	
}